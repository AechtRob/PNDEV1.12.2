package net.lepidodendron.entity.model.entity;

import net.ilexiconn.llibrary.client.model.ModelAnimator;
import net.ilexiconn.llibrary.client.model.tools.AdvancedModelRenderer;
import net.ilexiconn.llibrary.server.animation.IAnimatedEntity;
import net.lepidodendron.entity.EntityPrehistoricFloraHallipterus;
import net.lepidodendron.entity.model.ModelBasePalaeopedia;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLiving;
import net.minecraft.entity.EntityLivingBase;

public class ModelHallipterus extends ModelBasePalaeopedia {
    private final AdvancedModelRenderer body;
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
    private final AdvancedModelRenderer cube_r13;
    private final AdvancedModelRenderer cube_r14;
    private final AdvancedModelRenderer cube_r15;
    private final AdvancedModelRenderer cube_r16;
    private final AdvancedModelRenderer cube_r17;
    private final AdvancedModelRenderer legR5;
    private final AdvancedModelRenderer cube_r18;
    private final AdvancedModelRenderer legR5_2;
    private final AdvancedModelRenderer cube_r19;
    private final AdvancedModelRenderer legR5_3;
    private final AdvancedModelRenderer cube_r20;
    private final AdvancedModelRenderer legR4;
    private final AdvancedModelRenderer cube_r21;
    private final AdvancedModelRenderer LegR4_2;
    private final AdvancedModelRenderer cube_r22;
    private final AdvancedModelRenderer LegR4_3;
    private final AdvancedModelRenderer cube_r23;
    private final AdvancedModelRenderer segment1;
    private final AdvancedModelRenderer segment2;
    private final AdvancedModelRenderer segment3;
    private final AdvancedModelRenderer segment4;
    private final AdvancedModelRenderer segment5;
    private final AdvancedModelRenderer segment6;
    private final AdvancedModelRenderer segment7;
    private final AdvancedModelRenderer segment8;
    private final AdvancedModelRenderer cube_r24;
    private final AdvancedModelRenderer cube_r25;
    private final AdvancedModelRenderer segment9;
    private final AdvancedModelRenderer cube_r26;
    private final AdvancedModelRenderer cube_r27;
    private final AdvancedModelRenderer segment10;
    private final AdvancedModelRenderer cube_r28;
    private final AdvancedModelRenderer cube_r29;
    private final AdvancedModelRenderer segment11;
    private final AdvancedModelRenderer cube_r30;
    private final AdvancedModelRenderer cube_r31;
    private final AdvancedModelRenderer segment12;
    private final AdvancedModelRenderer cube_r32;
    private final AdvancedModelRenderer cube_r33;
    private final AdvancedModelRenderer telson;
    private final AdvancedModelRenderer legL3;
    private final AdvancedModelRenderer legL3_2;
    private final AdvancedModelRenderer bone11;
    private final AdvancedModelRenderer legR3;
    private final AdvancedModelRenderer legR3_2;
    private final AdvancedModelRenderer bone4;
    private final AdvancedModelRenderer legL2;
    private final AdvancedModelRenderer legL2_2;
    private final AdvancedModelRenderer bone18;
    private final AdvancedModelRenderer legR2;
    private final AdvancedModelRenderer legR2_2;
    private final AdvancedModelRenderer bone7;
    private final AdvancedModelRenderer legL1;
    private final AdvancedModelRenderer legL1_2;
    private final AdvancedModelRenderer cube_r34;
    private final AdvancedModelRenderer cube_r35;
    private final AdvancedModelRenderer cube_r36;
    private final AdvancedModelRenderer cube_r37;
    private final AdvancedModelRenderer cube_r38;
    private final AdvancedModelRenderer bone14;
    private final AdvancedModelRenderer legR1;
    private final AdvancedModelRenderer legR1_2;
    private final AdvancedModelRenderer cube_r39;
    private final AdvancedModelRenderer cube_r40;
    private final AdvancedModelRenderer cube_r41;
    private final AdvancedModelRenderer cube_r42;
    private final AdvancedModelRenderer cube_r43;
    private final AdvancedModelRenderer bone19;
    private final AdvancedModelRenderer legL5;
    private final AdvancedModelRenderer cube_r44;
    private final AdvancedModelRenderer legL5_2;
    private final AdvancedModelRenderer cube_r45;
    private final AdvancedModelRenderer legL5_3;
    private final AdvancedModelRenderer cube_r46;
    private final AdvancedModelRenderer legL4;
    private final AdvancedModelRenderer cube_r47;
    private final AdvancedModelRenderer legL4_2;
    private final AdvancedModelRenderer cube_r48;
    private final AdvancedModelRenderer legL4_3;
    private final AdvancedModelRenderer cube_r49;

    private ModelAnimator animator;

    public ModelHallipterus() {
        this.textureWidth = 64;
        this.textureHeight = 64;

        this.body = new AdvancedModelRenderer(this);
        this.body.setRotationPoint(0.0F, 23.0F, -8.0F);
        this.body.cubeList.add(new ModelBox(body, 0, 24, -4.5F, -1.0F, 3.0F, 9, 2, 1, 0.0F, false));
        this.body.cubeList.add(new ModelBox(body, 0, 0, -3.0F, -1.0F, -6.0F, 6, 2, 9, 0.0F, false));
        this.body.cubeList.add(new ModelBox(body, 0, 4, -1.0F, -1.0F, -7.52F, 2, 2, 2, 0.01F, false));

        this.cube_r1 = new AdvancedModelRenderer(this);
        this.cube_r1.setRotationPoint(0.6F, -1.2F, -1.0F);
        this.body.addChild(cube_r1);
        this.setRotateAngle(cube_r1, 0.0F, 0.0F, 0.0F);
        this.cube_r1.cubeList.add(new ModelBox(cube_r1, 18, 37, -1.1F, 0.1F, -3.0F, 1, 1, 3, 0.0F, false));

        this.cube_r2 = new AdvancedModelRenderer(this);
        this.cube_r2.setRotationPoint(2.1F, 0.8396F, -3.4926F);
        this.body.addChild(cube_r2);
        this.setRotateAngle(cube_r2, 0.0514F, -0.3636F, -0.1922F);
        this.cube_r2.cubeList.add(new ModelBox(cube_r2, 39, 44, -5.0F, -1.0F, -1.0F, 4, 1, 6, 0.0F, true));

        this.cube_r3 = new AdvancedModelRenderer(this);
        this.cube_r3.setRotationPoint(-2.1F, 0.8396F, -3.4926F);
        this.body.addChild(cube_r3);
        this.setRotateAngle(cube_r3, 0.0514F, 0.3636F, 0.1922F);
        this.cube_r3.cubeList.add(new ModelBox(cube_r3, 39, 44, 1.0F, -1.0F, -1.0F, 4, 1, 6, 0.0F, false));

        this.cube_r4 = new AdvancedModelRenderer(this);
        this.cube_r4.setRotationPoint(0.25F, 1.8837F, -6.2179F);
        this.body.addChild(cube_r4);
        this.setRotateAngle(cube_r4, -0.2409F, -0.0872F, 0.002F);
        this.cube_r4.cubeList.add(new ModelBox(cube_r4, 0, 12, 0.0F, -1.0F, 0.0F, 1, 1, 2, 0.0F, true));

        this.cube_r5 = new AdvancedModelRenderer(this);
        this.cube_r5.setRotationPoint(-0.25F, 1.8837F, -6.2179F);
        this.body.addChild(cube_r5);
        this.setRotateAngle(cube_r5, -0.2409F, 0.0872F, -0.002F);
        this.cube_r5.cubeList.add(new ModelBox(cube_r5, 0, 12, -1.0F, -1.0F, 0.0F, 1, 1, 2, 0.0F, false));

        this.cube_r6 = new AdvancedModelRenderer(this);
        this.cube_r6.setRotationPoint(0.5F, 1.525F, -7.9F);
        this.body.addChild(cube_r6);
        this.setRotateAngle(cube_r6, -0.0227F, 0.0F, 0.0F);
        this.cube_r6.cubeList.add(new ModelBox(cube_r6, 29, 45, -1.5F, -0.9437F, 2.3089F, 2, 1, 4, 0.0F, false));

        this.cube_r7 = new AdvancedModelRenderer(this);
        this.cube_r7.setRotationPoint(0.0F, 1.8F, -1.4F);
        this.body.addChild(cube_r7);
        this.setRotateAngle(cube_r7, 0.1082F, 0.0F, 0.0F);
        this.cube_r7.cubeList.add(new ModelBox(cube_r7, 37, 21, -1.5F, -0.9437F, -0.6911F, 3, 1, 5, 0.0F, false));

        this.cube_r8 = new AdvancedModelRenderer(this);
        this.cube_r8.setRotationPoint(-5.4F, 0.7F, 1.8F);
        this.body.addChild(cube_r8);
        this.setRotateAngle(cube_r8, 0.0F, -1.213F, 0.0F);
        this.cube_r8.cubeList.add(new ModelBox(cube_r8, 37, 27, -1.6345F, -0.2F, -5.8602F, 3, 1, 5, 0.0F, false));

        this.cube_r9 = new AdvancedModelRenderer(this);
        this.cube_r9.setRotationPoint(5.4F, 0.7F, 1.8F);
        this.body.addChild(cube_r9);
        this.setRotateAngle(cube_r9, 0.0F, 1.213F, 0.0F);
        this.cube_r9.cubeList.add(new ModelBox(cube_r9, 37, 27, -1.3655F, -0.2F, -5.8602F, 3, 1, 5, 0.0F, true));

        this.cube_r10 = new AdvancedModelRenderer(this);
        this.cube_r10.setRotationPoint(1.3F, -1.1F, -1.7F);
        this.body.addChild(cube_r10);
        this.setRotateAngle(cube_r10, 0.0F, -0.2618F, 0.0F);
        this.cube_r10.cubeList.add(new ModelBox(cube_r10, 2, 0, -0.5092F, -0.1F, -0.5324F, 1, 1, 1, 0.0F, true));

        this.cube_r11 = new AdvancedModelRenderer(this);
        this.cube_r11.setRotationPoint(5.4815F, 1.3F, 0.9239F);
        this.body.addChild(cube_r11);
        this.setRotateAngle(cube_r11, 0.0F, 0.3054F, 0.0F);
        this.cube_r11.cubeList.add(new ModelBox(cube_r11, 0, 11, -3.9343F, -2.3F, -7.0054F, 4, 2, 7, 0.01F, true));

        this.cube_r12 = new AdvancedModelRenderer(this);
        this.cube_r12.setRotationPoint(3.4047F, 1.4F, -5.7389F);
        this.body.addChild(cube_r12);
        this.setRotateAngle(cube_r12, 0.0F, -0.6196F, 0.0F);
        this.cube_r12.cubeList.add(new ModelBox(cube_r12, 24, 34, -2.9954F, -2.4F, -0.0501F, 3, 2, 2, 0.02F, true));

        this.cube_r13 = new AdvancedModelRenderer(this);
        this.cube_r13.setRotationPoint(0.124F, 1.0F, 8.1857F);
        this.body.addChild(cube_r13);
        this.setRotateAngle(cube_r13, 0.0F, -0.3491F, 0.0F);
        this.cube_r13.cubeList.add(new ModelBox(cube_r13, 0, 27, -1.4F, -2.0F, -8.7F, 4, 2, 3, 0.02F, true));

        this.cube_r14 = new AdvancedModelRenderer(this);
        this.cube_r14.setRotationPoint(-3.4047F, 1.4F, -5.7389F);
        this.body.addChild(cube_r14);
        this.setRotateAngle(cube_r14, 0.0F, 0.6196F, 0.0F);
        this.cube_r14.cubeList.add(new ModelBox(cube_r14, 24, 34, -0.0046F, -2.4F, -0.0501F, 3, 2, 2, 0.02F, false));

        this.cube_r15 = new AdvancedModelRenderer(this);
        this.cube_r15.setRotationPoint(-0.124F, 1.0F, 8.1857F);
        this.body.addChild(cube_r15);
        this.setRotateAngle(cube_r15, 0.0F, 0.3491F, 0.0F);
        this.cube_r15.cubeList.add(new ModelBox(cube_r15, 0, 27, -2.6F, -2.0F, -8.7F, 4, 2, 3, 0.02F, false));

        this.cube_r16 = new AdvancedModelRenderer(this);
        this.cube_r16.setRotationPoint(-1.3F, -1.1F, -1.7F);
        this.body.addChild(cube_r16);
        this.setRotateAngle(cube_r16, 0.0F, 0.2618F, 0.0F);
        this.cube_r16.cubeList.add(new ModelBox(cube_r16, 2, 0, -0.4908F, -0.1F, -0.5324F, 1, 1, 1, 0.0F, false));

        this.cube_r17 = new AdvancedModelRenderer(this);
        this.cube_r17.setRotationPoint(-5.4815F, 1.3F, 0.9239F);
        this.body.addChild(cube_r17);
        this.setRotateAngle(cube_r17, 0.0F, -0.3054F, 0.0F);
        this.cube_r17.cubeList.add(new ModelBox(cube_r17, 0, 11, -0.0657F, -2.3F, -7.0054F, 4, 2, 7, 0.01F, false));

        this.legR5 = new AdvancedModelRenderer(this);
        this.legR5.setRotationPoint(-4.3F, 0.95F, 1.9F);
        this.body.addChild(legR5);


        this.cube_r18 = new AdvancedModelRenderer(this);
        this.cube_r18.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.legR5.addChild(cube_r18);
        this.setRotateAngle(cube_r18, 0.0F, 0.6807F, 0.0F);
        this.cube_r18.cubeList.add(new ModelBox(cube_r18, 26, 7, -3.6599F, -0.5134F, -0.4624F, 4, 1, 1, 0.0F, false));

        this.legR5_2 = new AdvancedModelRenderer(this);
        this.legR5_2.setRotationPoint(-2.8443F, 0.0F, 2.3396F);
        this.legR5.addChild(legR5_2);


        this.cube_r19 = new AdvancedModelRenderer(this);
        this.cube_r19.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.legR5_2.addChild(cube_r19);
        this.setRotateAngle(cube_r19, 0.0F, 0.9861F, 0.0F);
        this.cube_r19.cubeList.add(new ModelBox(cube_r19, 35, 13, -6.8306F, -0.5134F, -0.461F, 7, 1, 1, -0.01F, false));

        this.legR5_3 = new AdvancedModelRenderer(this);
        this.legR5_3.setRotationPoint(-3.7164F, 0.0F, 5.67F);
        this.legR5_2.addChild(legR5_3);


        this.cube_r20 = new AdvancedModelRenderer(this);
        this.cube_r20.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.legR5_3.addChild(cube_r20);
        this.setRotateAngle(cube_r20, 0.0F, 1.4224F, 0.0F);
        this.cube_r20.cubeList.add(new ModelBox(cube_r20, 35, 11, -6.8387F, -0.5134F, -0.4671F, 7, 1, 1, -0.02F, false));

        this.legR4 = new AdvancedModelRenderer(this);
        this.legR4.setRotationPoint(-4.8F, 1.0F, 0.9F);
        this.body.addChild(legR4);


        this.cube_r21 = new AdvancedModelRenderer(this);
        this.cube_r21.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.legR4.addChild(cube_r21);
        this.setRotateAngle(cube_r21, 0.0F, 0.384F, 0.0F);
        this.cube_r21.cubeList.add(new ModelBox(cube_r21, 27, 3, -2.9224F, -0.5532F, -0.5625F, 3, 1, 1, 0.0F, false));

        this.LegR4_2 = new AdvancedModelRenderer(this);
        this.LegR4_2.setRotationPoint(-2.7F, 0.0F, 1.0F);
        this.legR4.addChild(LegR4_2);


        this.cube_r22 = new AdvancedModelRenderer(this);
        this.cube_r22.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.LegR4_2.addChild(cube_r22);
        this.setRotateAngle(cube_r22, 0.0F, 0.6894F, 0.0F);
        this.cube_r22.cubeList.add(new ModelBox(cube_r22, 42, 7, -2.9087F, -0.5532F, -0.4684F, 3, 1, 1, -0.01F, false));

        this.LegR4_3 = new AdvancedModelRenderer(this);
        this.LegR4_3.setRotationPoint(-2.2208F, 0.0F, 1.8288F);
        this.LegR4_2.addChild(LegR4_3);


        this.cube_r23 = new AdvancedModelRenderer(this);
        this.cube_r23.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.LegR4_3.addChild(cube_r23);
        this.setRotateAngle(cube_r23, 0.0F, 1.021F, 0.0F);
        this.cube_r23.cubeList.add(new ModelBox(cube_r23, 41, 9, -3.8822F, -0.5532F, -0.454F, 4, 1, 1, -0.02F, false));

        this.segment1 = new AdvancedModelRenderer(this);
        this.segment1.setRotationPoint(0.0F, 0.0F, 4.0F);
        this.body.addChild(segment1);
        this.segment1.cubeList.add(new ModelBox(segment1, 20, 22, -4.5F, -1.0F, 0.0F, 9, 2, 2, 0.0F, false));

        this.segment2 = new AdvancedModelRenderer(this);
        this.segment2.setRotationPoint(0.0F, 0.0F, 2.0F);
        this.segment1.addChild(segment2);
        this.segment2.cubeList.add(new ModelBox(segment2, 20, 18, -4.5F, -1.0F, 0.0F, 9, 2, 2, 0.0F, false));

        this.segment3 = new AdvancedModelRenderer(this);
        this.segment3.setRotationPoint(0.0F, 0.0F, 2.0F);
        this.segment2.addChild(segment3);
        this.segment3.cubeList.add(new ModelBox(segment3, 15, 13, -4.5F, -1.0F, 0.0F, 9, 2, 2, 0.0F, false));

        this.segment4 = new AdvancedModelRenderer(this);
        this.segment4.setRotationPoint(0.0F, 0.0F, 2.0F);
        this.segment3.addChild(segment4);
        this.segment4.cubeList.add(new ModelBox(segment4, 0, 20, -4.5F, -1.0F, 0.0F, 9, 2, 2, 0.0F, false));

        this.segment5 = new AdvancedModelRenderer(this);
        this.segment5.setRotationPoint(0.0F, 0.0F, 2.0F);
        this.segment4.addChild(segment5);
        this.segment5.cubeList.add(new ModelBox(segment5, 19, 26, -4.0F, -1.0F, 0.0F, 8, 2, 1, 0.0F, false));

        this.segment6 = new AdvancedModelRenderer(this);
        this.segment6.setRotationPoint(0.0F, 0.0F, 1.0F);
        this.segment5.addChild(segment6);
        this.segment6.cubeList.add(new ModelBox(segment6, 27, 0, -3.5F, -1.0F, 0.0F, 7, 2, 1, 0.0F, false));

        this.segment7 = new AdvancedModelRenderer(this);
        this.segment7.setRotationPoint(0.0F, 0.0F, 1.0F);
        this.segment6.addChild(segment7);
        this.segment7.cubeList.add(new ModelBox(segment7, 0, 32, -3.0F, -1.0F, 0.0F, 6, 2, 1, 0.0F, false));

        this.segment8 = new AdvancedModelRenderer(this);
        this.segment8.setRotationPoint(0.0F, 0.0F, 1.0F);
        this.segment7.addChild(segment8);
        this.segment8.cubeList.add(new ModelBox(segment8, 14, 29, -2.5F, -1.0F, 0.0F, 5, 2, 2, 0.0F, false));

        this.cube_r24 = new AdvancedModelRenderer(this);
        this.cube_r24.setRotationPoint(2.5F, 1.0F, 0.1F);
        this.segment8.addChild(cube_r24);
        this.setRotateAngle(cube_r24, 0.0F, -0.6981F, 0.0F);
        this.cube_r24.cubeList.add(new ModelBox(cube_r24, 0, 17, -0.2725F, -1.0F, -0.0184F, 2, 0, 1, 0.0F, true));

        this.cube_r25 = new AdvancedModelRenderer(this);
        this.cube_r25.setRotationPoint(-2.5F, 1.0F, 0.1F);
        this.segment8.addChild(cube_r25);
        this.setRotateAngle(cube_r25, 0.0F, 0.6981F, 0.0F);
        this.cube_r25.cubeList.add(new ModelBox(cube_r25, 0, 17, -1.7275F, -1.0F, -0.0184F, 2, 0, 1, 0.0F, false));

        this.segment9 = new AdvancedModelRenderer(this);
        this.segment9.setRotationPoint(0.0F, 0.0F, 2.0F);
        this.segment8.addChild(segment9);
        this.segment9.cubeList.add(new ModelBox(segment9, 12, 33, -2.0F, -1.0F, 0.0F, 4, 2, 2, 0.0F, false));

        this.cube_r26 = new AdvancedModelRenderer(this);
        this.cube_r26.setRotationPoint(2.0F, 1.0F, 0.0F);
        this.segment9.addChild(cube_r26);
        this.setRotateAngle(cube_r26, 0.0F, -0.6545F, 0.0F);
        this.cube_r26.cubeList.add(new ModelBox(cube_r26, 14, 17, -0.0717F, -1.0F, 0.0105F, 2, 0, 1, 0.0F, true));

        this.cube_r27 = new AdvancedModelRenderer(this);
        this.cube_r27.setRotationPoint(-2.0F, 1.0F, 0.0F);
        this.segment9.addChild(cube_r27);
        this.setRotateAngle(cube_r27, 0.0F, 0.6545F, 0.0F);
        this.cube_r27.cubeList.add(new ModelBox(cube_r27, 14, 17, -1.9283F, -1.0F, 0.0105F, 2, 0, 1, 0.0F, false));

        this.segment10 = new AdvancedModelRenderer(this);
        this.segment10.setRotationPoint(0.0F, 0.0F, 2.0F);
        this.segment9.addChild(segment10);
        this.segment10.cubeList.add(new ModelBox(segment10, 34, 34, -1.5F, -1.0F, 0.0F, 3, 2, 2, 0.0F, false));

        this.cube_r28 = new AdvancedModelRenderer(this);
        this.cube_r28.setRotationPoint(1.5F, 1.0F, 0.0F);
        this.segment10.addChild(cube_r28);
        this.setRotateAngle(cube_r28, 0.0F, -0.6109F, 0.0F);
        this.cube_r28.cubeList.add(new ModelBox(cube_r28, 18, 17, -0.1246F, -1.0F, -0.0449F, 2, 0, 1, 0.0F, true));

        this.cube_r29 = new AdvancedModelRenderer(this);
        this.cube_r29.setRotationPoint(-1.5F, 1.0F, 0.0F);
        this.segment10.addChild(cube_r29);
        this.setRotateAngle(cube_r29, 0.0F, 0.6109F, 0.0F);
        this.cube_r29.cubeList.add(new ModelBox(cube_r29, 18, 17, -1.8754F, -1.0F, -0.0449F, 2, 0, 1, 0.0F, false));

        this.segment11 = new AdvancedModelRenderer(this);
        this.segment11.setRotationPoint(0.0F, 0.0F, 2.0F);
        this.segment10.addChild(segment11);
        this.segment11.cubeList.add(new ModelBox(segment11, 0, 35, -1.5F, -1.0F, 0.0F, 3, 2, 2, 0.0F, false));

        this.cube_r30 = new AdvancedModelRenderer(this);
        this.cube_r30.setRotationPoint(1.5F, 1.0F, 0.0F);
        this.segment11.addChild(cube_r30);
        this.setRotateAngle(cube_r30, 0.0F, -0.7418F, 0.0F);
        this.cube_r30.cubeList.add(new ModelBox(cube_r30, 20, 8, -0.2992F, -1.0F, 0.0683F, 2, 0, 1, 0.0F, true));

        this.cube_r31 = new AdvancedModelRenderer(this);
        this.cube_r31.setRotationPoint(-1.5F, 1.0F, 0.0F);
        this.segment11.addChild(cube_r31);
        this.setRotateAngle(cube_r31, 0.0F, 0.7418F, 0.0F);
        this.cube_r31.cubeList.add(new ModelBox(cube_r31, 20, 8, -1.7008F, -1.0F, 0.0683F, 2, 0, 1, 0.0F, false));

        this.segment12 = new AdvancedModelRenderer(this);
        this.segment12.setRotationPoint(0.0F, 0.0F, 2.0F);
        this.segment11.addChild(segment12);
        this.segment12.cubeList.add(new ModelBox(segment12, 8, 37, -1.5F, -1.0F, 0.0F, 3, 2, 2, 0.0F, false));

        this.cube_r32 = new AdvancedModelRenderer(this);
        this.cube_r32.setRotationPoint(1.5F, 1.0F, 0.0F);
        this.segment12.addChild(cube_r32);
        this.setRotateAngle(cube_r32, 0.0F, -0.829F, 0.0F);
        this.cube_r32.cubeList.add(new ModelBox(cube_r32, 0, 8, -0.6738F, -1.0F, 0.0815F, 4, 0, 1, 0.0F, true));

        this.cube_r33 = new AdvancedModelRenderer(this);
        this.cube_r33.setRotationPoint(-1.5F, 1.0F, 0.0F);
        this.segment12.addChild(cube_r33);
        this.setRotateAngle(cube_r33, 0.0F, 0.829F, 0.0F);
        this.cube_r33.cubeList.add(new ModelBox(cube_r33, 0, 8, -3.3262F, -1.0F, 0.0815F, 4, 0, 1, 0.0F, false));

        this.telson = new AdvancedModelRenderer(this);
        this.telson.setRotationPoint(0.0F, 0.0F, 2.0F);
        this.segment12.addChild(telson);
        this.telson.cubeList.add(new ModelBox(telson, 36, 33, -0.5F, -0.5F, 0.0F, 1, 1, 8, 0.0F, false));

        this.legL3 = new AdvancedModelRenderer(this);
        this.legL3.setRotationPoint(3.75F, 1.5F, -1.7F);
        this.body.addChild(legL3);
        this.legL3.cubeList.add(new ModelBox(legL3, 36, 42, 0.0F, -0.5F, -0.5F, 3, 1, 1, 0.0F, true));

        this.legL3_2 = new AdvancedModelRenderer(this);
        this.legL3_2.setRotationPoint(3.0F, 0.0F, 0.0F);
        this.legL3.addChild(legL3_2);
        this.legL3_2.cubeList.add(new ModelBox(legL3_2, 19, 42, 0.0F, -0.5F, -0.5F, 6, 1, 1, 0.0F, true));
        this.legL3_2.cubeList.add(new ModelBox(legL3_2, 6, 41, 0.0F, 0.0F, -1.0F, 5, 0, 2, 0.0F, true));

        this.bone11 = new AdvancedModelRenderer(this);
        this.bone11.setRotationPoint(3.0F, 0.0F, 0.0F);
        this.legL3.addChild(bone11);


        this.legR3 = new AdvancedModelRenderer(this);
        this.legR3.setRotationPoint(-3.75F, 1.5F, -1.7F);
        this.body.addChild(legR3);
        this.legR3.cubeList.add(new ModelBox(legR3, 36, 42, -3.0F, -0.5F, -0.5F, 3, 1, 1, 0.0F, false));

        this.legR3_2 = new AdvancedModelRenderer(this);
        this.legR3_2.setRotationPoint(-3.0F, 0.0F, 0.0F);
        this.legR3.addChild(legR3_2);
        this.legR3_2.cubeList.add(new ModelBox(legR3_2, 19, 42, -6.0F, -0.5F, -0.5F, 6, 1, 1, 0.0F, false));
        this.legR3_2.cubeList.add(new ModelBox(legR3_2, 6, 41, -5.0F, 0.0F, -1.0F, 5, 0, 2, 0.0F, false));

        this.bone4 = new AdvancedModelRenderer(this);
        this.bone4.setRotationPoint(-3.0F, 0.0F, 0.0F);
        this.legR3.addChild(bone4);


        this.legL2 = new AdvancedModelRenderer(this);
        this.legL2.setRotationPoint(3.05F, 1.5F, -3.55F);
        this.body.addChild(legL2);
        this.setRotateAngle(legL2, 0.0F, 0.3054F, 0.0F);
        this.legL2.cubeList.add(new ModelBox(legL2, 26, 5, -0.0289F, -0.5F, -0.5623F, 4, 1, 1, 0.0F, true));

        this.legL2_2 = new AdvancedModelRenderer(this);
        this.legL2_2.setRotationPoint(3.9711F, 0.0F, -0.0623F);
        this.legL2.addChild(legL2_2);
        this.legL2_2.cubeList.add(new ModelBox(legL2_2, 37, 15, 0.0F, -0.5F, -0.5F, 5, 1, 1, 0.0F, true));
        this.legL2_2.cubeList.add(new ModelBox(legL2_2, 29, 9, 0.0F, 0.0F, -1.0F, 5, 0, 2, 0.0F, true));

        this.bone18 = new AdvancedModelRenderer(this);
        this.bone18.setRotationPoint(3.9711F, 0.0F, -0.0623F);
        this.legL2.addChild(bone18);


        this.legR2 = new AdvancedModelRenderer(this);
        this.legR2.setRotationPoint(-2.95F, 1.5F, -3.55F);
        this.body.addChild(legR2);
        this.setRotateAngle(legR2, 0.0F, -0.3054F, 0.0F);
        this.legR2.cubeList.add(new ModelBox(legR2, 26, 5, -3.9711F, -0.5F, -0.5623F, 4, 1, 1, 0.0F, false));

        this.legR2_2 = new AdvancedModelRenderer(this);
        this.legR2_2.setRotationPoint(-3.9711F, 0.0F, -0.0623F);
        this.legR2.addChild(legR2_2);
        this.legR2_2.cubeList.add(new ModelBox(legR2_2, 37, 15, -5.0F, -0.5F, -0.5F, 5, 1, 1, 0.0F, false));
        this.legR2_2.cubeList.add(new ModelBox(legR2_2, 29, 9, -5.0F, 0.0F, -1.0F, 5, 0, 2, 0.0F, false));

        this.bone7 = new AdvancedModelRenderer(this);
        this.bone7.setRotationPoint(-3.9711F, 0.0F, -0.0623F);
        this.legR2.addChild(bone7);


        this.legL1 = new AdvancedModelRenderer(this);
        this.legL1.setRotationPoint(1.6F, 1.5F, -5.3F);
        this.body.addChild(legL1);
        this.setRotateAngle(legL1, 0.0F, 0.6545F, 0.0F);
        this.legL1.cubeList.add(new ModelBox(legL1, 49, 42, 0.1006F, -0.5F, -0.5599F, 3, 1, 1, 0.0F, true));

        this.legL1_2 = new AdvancedModelRenderer(this);
        this.legL1_2.setRotationPoint(3.1006F, 0.0F, -0.0599F);
        this.legL1.addChild(legL1_2);
        this.legL1_2.cubeList.add(new ModelBox(legL1_2, 47, 38, 0.0F, -0.5F, -0.5F, 3, 1, 1, 0.0F, true));

        this.cube_r34 = new AdvancedModelRenderer(this);
        this.cube_r34.setRotationPoint(2.95F, -0.5F, -0.25F);
        this.legL1_2.addChild(cube_r34);
        this.setRotateAngle(cube_r34, 0.0F, 0.3927F, 0.0F);
        this.cube_r34.cubeList.add(new ModelBox(cube_r34, 49, 33, 0.0F, 0.0F, 0.0F, 0, 1, 2, 0.0F, true));

        this.cube_r35 = new AdvancedModelRenderer(this);
        this.cube_r35.setRotationPoint(0.95F, 0.5F, -0.05F);
        this.legL1_2.addChild(cube_r35);
        this.setRotateAngle(cube_r35, -0.3683F, -0.19F, -1.6552F);
        this.cube_r35.cubeList.add(new ModelBox(cube_r35, 49, 33, 0.0F, 0.0F, 0.0F, 0, 1, 2, 0.0F, true));

        this.cube_r36 = new AdvancedModelRenderer(this);
        this.cube_r36.setRotationPoint(0.95F, -0.4F, -0.05F);
        this.legL1_2.addChild(cube_r36);
        this.setRotateAngle(cube_r36, -0.4013F, 0.2013F, -1.6554F);
        this.cube_r36.cubeList.add(new ModelBox(cube_r36, 49, 33, 0.0F, 0.0F, 0.0F, 0, 1, 2, 0.0F, true));

        this.cube_r37 = new AdvancedModelRenderer(this);
        this.cube_r37.setRotationPoint(-0.45F, 0.5F, 0.0F);
        this.legL1_2.addChild(cube_r37);
        this.setRotateAngle(cube_r37, -0.1501F, -0.19F, -1.6552F);
        this.cube_r37.cubeList.add(new ModelBox(cube_r37, 49, 33, 0.0F, 0.0F, 0.0F, 0, 1, 2, 0.0F, true));

        this.cube_r38 = new AdvancedModelRenderer(this);
        this.cube_r38.setRotationPoint(-0.45F, -0.4F, 0.0F);
        this.legL1_2.addChild(cube_r38);
        this.setRotateAngle(cube_r38, -0.1831F, 0.2013F, -1.6554F);
        this.cube_r38.cubeList.add(new ModelBox(cube_r38, 49, 33, 0.0F, 0.0F, 0.0F, 0, 1, 2, 0.0F, true));

        this.bone14 = new AdvancedModelRenderer(this);
        this.bone14.setRotationPoint(3.1006F, 0.0F, -0.0599F);
        this.legL1.addChild(bone14);


        this.legR1 = new AdvancedModelRenderer(this);
        this.legR1.setRotationPoint(-1.6F, 1.5F, -5.3F);
        this.body.addChild(legR1);
        this.setRotateAngle(legR1, 0.0F, -0.6545F, 0.0F);
        this.legR1.cubeList.add(new ModelBox(legR1, 49, 42, -3.1006F, -0.5F, -0.5599F, 3, 1, 1, 0.0F, false));

        this.legR1_2 = new AdvancedModelRenderer(this);
        this.legR1_2.setRotationPoint(-3.1006F, 0.0F, -0.0599F);
        this.legR1.addChild(legR1_2);
        this.legR1_2.cubeList.add(new ModelBox(legR1_2, 47, 38, -3.0F, -0.5F, -0.5F, 3, 1, 1, 0.0F, false));

        this.cube_r39 = new AdvancedModelRenderer(this);
        this.cube_r39.setRotationPoint(-2.95F, -0.5F, -0.25F);
        this.legR1_2.addChild(cube_r39);
        this.setRotateAngle(cube_r39, 0.0F, -0.3927F, 0.0F);
        this.cube_r39.cubeList.add(new ModelBox(cube_r39, 49, 33, 0.0F, 0.0F, 0.0F, 0, 1, 2, 0.0F, false));

        this.cube_r40 = new AdvancedModelRenderer(this);
        this.cube_r40.setRotationPoint(-0.95F, 0.5F, -0.05F);
        this.legR1_2.addChild(cube_r40);
        this.setRotateAngle(cube_r40, -0.3683F, 0.19F, 1.6552F);
        this.cube_r40.cubeList.add(new ModelBox(cube_r40, 49, 33, 0.0F, 0.0F, 0.0F, 0, 1, 2, 0.0F, false));

        this.cube_r41 = new AdvancedModelRenderer(this);
        this.cube_r41.setRotationPoint(-0.95F, -0.4F, -0.05F);
        this.legR1_2.addChild(cube_r41);
        this.setRotateAngle(cube_r41, -0.4013F, -0.2013F, 1.6554F);
        this.cube_r41.cubeList.add(new ModelBox(cube_r41, 49, 33, 0.0F, 0.0F, 0.0F, 0, 1, 2, 0.0F, false));

        this.cube_r42 = new AdvancedModelRenderer(this);
        this.cube_r42.setRotationPoint(0.45F, 0.5F, 0.0F);
        this.legR1_2.addChild(cube_r42);
        this.setRotateAngle(cube_r42, -0.1501F, 0.19F, 1.6552F);
        this.cube_r42.cubeList.add(new ModelBox(cube_r42, 49, 33, 0.0F, 0.0F, 0.0F, 0, 1, 2, 0.0F, false));

        this.cube_r43 = new AdvancedModelRenderer(this);
        this.cube_r43.setRotationPoint(0.45F, -0.4F, 0.0F);
        this.legR1_2.addChild(cube_r43);
        this.setRotateAngle(cube_r43, -0.1831F, -0.2013F, 1.6554F);
        this.cube_r43.cubeList.add(new ModelBox(cube_r43, 49, 33, 0.0F, 0.0F, 0.0F, 0, 1, 2, 0.0F, false));

        this.bone19 = new AdvancedModelRenderer(this);
        this.bone19.setRotationPoint(-3.1006F, 0.0F, -0.0599F);
        this.legR1.addChild(bone19);


        this.legL5 = new AdvancedModelRenderer(this);
        this.legL5.setRotationPoint(4.3F, 0.95F, 1.9F);
        this.body.addChild(legL5);


        this.cube_r44 = new AdvancedModelRenderer(this);
        this.cube_r44.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.legL5.addChild(cube_r44);
        this.setRotateAngle(cube_r44, 0.0F, -0.6807F, 0.0F);
        this.cube_r44.cubeList.add(new ModelBox(cube_r44, 26, 7, -0.3401F, -0.5134F, -0.4624F, 4, 1, 1, 0.0F, true));

        this.legL5_2 = new AdvancedModelRenderer(this);
        this.legL5_2.setRotationPoint(2.8443F, 0.0F, 2.3396F);
        this.legL5.addChild(legL5_2);


        this.cube_r45 = new AdvancedModelRenderer(this);
        this.cube_r45.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.legL5_2.addChild(cube_r45);
        this.setRotateAngle(cube_r45, 0.0F, -0.9861F, 0.0F);
        this.cube_r45.cubeList.add(new ModelBox(cube_r45, 35, 13, -0.1694F, -0.5134F, -0.461F, 7, 1, 1, -0.01F, true));

        this.legL5_3 = new AdvancedModelRenderer(this);
        this.legL5_3.setRotationPoint(3.7165F, 0.0F, 5.67F);
        this.legL5_2.addChild(legL5_3);


        this.cube_r46 = new AdvancedModelRenderer(this);
        this.cube_r46.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.legL5_3.addChild(cube_r46);
        this.setRotateAngle(cube_r46, 0.0F, -1.4224F, 0.0F);
        this.cube_r46.cubeList.add(new ModelBox(cube_r46, 35, 11, -0.1613F, -0.5134F, -0.4671F, 7, 1, 1, -0.02F, true));

        this.legL4 = new AdvancedModelRenderer(this);
        this.legL4.setRotationPoint(4.8F, 1.0F, 0.9F);
        this.body.addChild(legL4);


        this.cube_r47 = new AdvancedModelRenderer(this);
        this.cube_r47.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.legL4.addChild(cube_r47);
        this.setRotateAngle(cube_r47, 0.0F, -0.384F, 0.0F);
        this.cube_r47.cubeList.add(new ModelBox(cube_r47, 27, 3, -0.0776F, -0.5532F, -0.5625F, 3, 1, 1, 0.0F, true));

        this.legL4_2 = new AdvancedModelRenderer(this);
        this.legL4_2.setRotationPoint(2.7F, 0.0F, 1.0F);
        this.legL4.addChild(legL4_2);


        this.cube_r48 = new AdvancedModelRenderer(this);
        this.cube_r48.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.legL4_2.addChild(cube_r48);
        this.setRotateAngle(cube_r48, 0.0F, -0.6894F, 0.0F);
        this.cube_r48.cubeList.add(new ModelBox(cube_r48, 42, 7, -0.0913F, -0.5532F, -0.4684F, 3, 1, 1, -0.01F, true));

        this.legL4_3 = new AdvancedModelRenderer(this);
        this.legL4_3.setRotationPoint(2.2208F, 0.0F, 1.8288F);
        this.legL4_2.addChild(legL4_3);


        this.cube_r49 = new AdvancedModelRenderer(this);
        this.cube_r49.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.legL4_3.addChild(cube_r49);
        this.setRotateAngle(cube_r49, 0.0F, -1.021F, 0.0F);
        this.cube_r49.cubeList.add(new ModelBox(cube_r49, 41, 9, -0.1178F, -0.5532F, -0.454F, 4, 1, 1, -0.02F, true));

        updateDefaultPose();
        animator = ModelAnimator.create();
    }

    @Override
    public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        animate((IAnimatedEntity) entity, f, f1, f2, f3, f4, f5);
        this.body.render(f5);
    }

    public void renderStaticWall(float f) {
        this.body.rotateAngleY = (float) Math.toRadians(360);
        this.setRotateAngle(body, 1.5F, 0.0F, -0.25F);
        this.body.offsetY = -0.2F;
        this.body.offsetX = 0.02F;
        this.body.offsetZ = -0.29F;
        this.body.render(0.01F);
        resetToDefaultPose();
    }

    public void renderStaticFloor(float f) {
        resetToDefaultPose();
    }

    @Override
    public void renderStaticBook(float f) {
        //Rotations, positions and sizing:
        this.body.offsetY = -1.0F;
        this.body.offsetX = 0.0F;
        this.body.offsetZ = 2.0F;
        this.body.rotateAngleY = (float)Math.toRadians(120);
        this.body.rotateAngleX = (float)Math.toRadians(1);
        this.body.rotateAngleZ = (float)Math.toRadians(0);
        this.body.scaleChildren = true;
        float scaler = 1.F;
        this.body.setScale(scaler, scaler, scaler);
        //Start of pose:
        this.setRotateAngle(body, 0.6F, 3.8F, -0.2F);
        //End of pose, now render the model:
        this.body.render(f);
        //Reset rotations, positions and sizing:
        this.body.setScale(1.0F, 1.0F, 1.0F);
        this.body.scaleChildren = false;
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
       // this.body.offsetY = 0.4F;
        this.body.offsetY = -0.25F;
        this.body.offsetZ = 0.1F;

        AdvancedModelRenderer[] fishBody = {this.segment1, this.segment2, this.segment3, this.segment4, this.telson};
        AdvancedModelRenderer[] fishTail = {this.segment4, this.telson};

        float speed = 0.2F;
        float tailHdegree = 0.0F;
        float paddleVdegree = 0.05F;
        float paddleHdegree = 0.4F;
        float tailSwing = 0.50F;

        EntityPrehistoricFloraHallipterus ciurc = (EntityPrehistoricFloraHallipterus) e;


        if (e instanceof EntityLiving && !((EntityLiving) e).isAIDisabled()) {
            if ((!ciurc.getIsMoving()) && ciurc.isReallyInWater()) {
                this.chainWave(fishBody, speed, 0.02F, -0.2F, f2, 0.2F);
                this.chainSwing(fishTail, speed, 0.05F, -0.6F, f2, 0.6F);
                this.chainWave(fishTail, speed, 0.05F, -0.6F, f2, 0.6F);
            }

            //this.chainSwing(fishfinL, speed, -paddleHdegree, -3, f2, 1);
            //this.chainWave(fishfinL, speed, paddleVdegree, -3, f2, 2);
            //this.chainSwing(fishfinR, speed, paddleHdegree, -3, f2, 1);
            //this.chainWave(fishfinR, speed, paddleVdegree, -3, f2, 2);

            //pincers:
            //this.swing(cheliceraL, 0.3F, -0.1F, false, 0, -0.1F, f2, 0.6F);
            //this.swing(cheliceraR, 0.3F, 0.1F, false, 0, 0.1F, f2, 0.6F);

            if (!e.isInWater()) {
                //this.Bodyfront.rotateAngleZ = (float) Math.toRadians(90);
               // this.body.offsetY = 0.2F;
                this.bob(body, -speed * 5.0F, 2F, false, f2, 1);
                this.chainSwing(fishBody, speed * 3.0F, 0.05F, -2, f2, 1);
            }
        }
    }

    @Override
    public void setLivingAnimations(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime) {
        super.setLivingAnimations(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime);
        this.resetToDefaultPose();
        EntityPrehistoricFloraHallipterus ee = (EntityPrehistoricFloraHallipterus) entitylivingbaseIn;
        //Swimming pose:

        if (ee.isReallyInWater()) {
            if ((!ee.isReallySwimming())) {
                //Walk pose:
                if (ee.getIsFast()) {
                    animRun(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime);

                } else {
                    animWalking(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime);
                }

            } else {
                //animWalking(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime);
            }
        } else {

        }

    }

    public void animWalking(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime) {
        EntityPrehistoricFloraHallipterus entity = (EntityPrehistoricFloraHallipterus) entitylivingbaseIn;
        int animCycle = 40;
        double tickAnim = (entity.ticksExisted + entity.getTickOffset()) - (int) (Math.floor((double) (entity.ticksExisted + entity.getTickOffset()) / (double) animCycle) * (double) animCycle) + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;
        this.setRotateAngle(body, body.rotateAngleX + (float) Math.toRadians(10+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*90/0.5))), body.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*90/0.5+90))*2.5), body.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180/0.5-60))*2));
        this.body.rotationPointX = this.body.rotationPointX + (float)(0);
        this.body.rotationPointY = this.body.rotationPointY - (float)(4+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180/0.5+30))*0.1);
        this.body.rotationPointZ = this.body.rotationPointZ + (float)(0);


        this.setRotateAngle(legR5, legR5.rotateAngleX + (float) Math.toRadians(-30+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*45/0.25-110))*10), legR5.rotateAngleY + (float) Math.toRadians(-13+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*45/0.25-50))*10), legR5.rotateAngleZ + (float) Math.toRadians(21+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*45/0.25+50))*10));


        this.setRotateAngle(legR5_2, legR5_2.rotateAngleX + (float) Math.toRadians(0), legR5_2.rotateAngleY + (float) Math.toRadians(22.5+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*45/0.25+150))*5), legR5_2.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(legR5_3, legR5_3.rotateAngleX + (float) Math.toRadians(0), legR5_3.rotateAngleY + (float) Math.toRadians(0), legR5_3.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(segment1, segment1.rotateAngleX + (float) Math.toRadians(-5+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*90/0.5-20))), segment1.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*90/0.5+90-20))), segment1.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(segment2, segment2.rotateAngleX + (float) Math.toRadians(-5+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*90/0.5-20*2))), segment2.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*90/0.5+90-20*2))), segment2.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(segment3, segment3.rotateAngleX + (float) Math.toRadians(-5+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*90/0.5-20*3))), segment3.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*90/0.5+90-20*3))), segment3.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(segment4, segment4.rotateAngleX + (float) Math.toRadians(-5+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*90/0.5-20*4))), segment4.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*90/0.5+90-20*4))), segment4.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(segment5, segment5.rotateAngleX + (float) Math.toRadians(-5+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*90/0.5-20*5))), segment5.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*90/0.5+90-20*5))), segment5.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(segment6, segment6.rotateAngleX + (float) Math.toRadians(-1+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*90/0.5-20*6))), segment6.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*90/0.5+90-20*6))), segment6.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(segment7, segment7.rotateAngleX + (float) Math.toRadians(1+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*90/0.5-20*7))), segment7.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*90/0.5+90-20*7))), segment7.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(segment8, segment8.rotateAngleX + (float) Math.toRadians(2+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*90/0.5-20*8))), segment8.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*90/0.5+90-20*8))), segment8.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(segment9, segment9.rotateAngleX + (float) Math.toRadians(3+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*90/0.5-20*9))), segment9.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*90/0.5+90-20*9))), segment9.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(segment10, segment10.rotateAngleX + (float) Math.toRadians(4+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*90/0.5-20*10))), segment10.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*90/0.5+90-20*10))), segment10.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(segment11, segment11.rotateAngleX + (float) Math.toRadians(5+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*90/0.5-20*11))), segment11.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*90/0.5+90-20*11))), segment11.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(segment12, segment12.rotateAngleX + (float) Math.toRadians(6+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*90/0.5-20*12))), segment12.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*90/0.5+90-20*12))), segment12.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(telson, telson.rotateAngleX + (float) Math.toRadians(7+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*90/0.5-20*13))), telson.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*90/0.5+90-20*13))), telson.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(legL5, legL5.rotateAngleX + (float) Math.toRadians(-30-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*45/0.25-110))*10), legL5.rotateAngleY + (float) Math.toRadians(13+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*45/0.25-50))*10), legL5.rotateAngleZ + (float) Math.toRadians(-21+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*45/0.25+50))*10));


        this.setRotateAngle(legL5_2, legL5_2.rotateAngleX + (float) Math.toRadians(0), legL5_2.rotateAngleY + (float) Math.toRadians(-22.5+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*45/0.25+150))*5), legL5_2.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(legL5_3, legL5_3.rotateAngleX + (float) Math.toRadians(0), legL5_3.rotateAngleY + (float) Math.toRadians(0), legL5_3.rotateAngleZ + (float) Math.toRadians(0));



         if (tickAnim >= 0 && tickAnim < 3) {
        xx = -82.78 + (((tickAnim - 0) / 3) * (-93.48143-(-82.78)));
        yy = 2.03 + (((tickAnim - 0) / 3) * (5.72208-(2.03)));
        zz = -45.08 + (((tickAnim - 0) / 3) * (-48.59292-(-45.08)));
    }
            else if (tickAnim >= 3 && tickAnim < 8) {
    xx = -93.48143 + (((tickAnim - 3) / 5) * (-64.47945-(-93.48143)));
    yy = 5.72208 + (((tickAnim - 3) / 5) * (-9.08409-(5.72208)));
    zz = -48.59292 + (((tickAnim - 3) / 5) * (-28.26339-(-48.59292)));
}
        else if (tickAnim >= 8 && tickAnim < 13) {
        xx = -64.47945 + (((tickAnim - 8) / 5) * (-46.57479-(-64.47945)));
        yy = -9.08409 + (((tickAnim - 8) / 5) * (-20.79849-(-9.08409)));
        zz = -28.26339 + (((tickAnim - 8) / 5) * (3.34108-(-28.26339)));
        }
        else if (tickAnim >= 13 && tickAnim < 18) {
        xx = -46.57479 + (((tickAnim - 13) / 5) * (-72.08215-(-46.57479)));
        yy = -20.79849 + (((tickAnim - 13) / 5) * (-1.65839-(-20.79849)));
        zz = 3.34108 + (((tickAnim - 13) / 5) * (-41.56487-(3.34108)));
        }
        else if (tickAnim >= 18 && tickAnim < 23) {
        xx = -72.08215 + (((tickAnim - 18) / 5) * (-93.48143-(-72.08215)));
        yy = -1.65839 + (((tickAnim - 18) / 5) * (5.72208-(-1.65839)));
        zz = -41.56487 + (((tickAnim - 18) / 5) * (-48.59292-(-41.56487)));
        }
        else if (tickAnim >= 23 && tickAnim < 28) {
        xx = -93.48143 + (((tickAnim - 23) / 5) * (-64.47945-(-93.48143)));
        yy = 5.72208 + (((tickAnim - 23) / 5) * (-9.08409-(5.72208)));
        zz = -48.59292 + (((tickAnim - 23) / 5) * (-28.26339-(-48.59292)));
        }
        else if (tickAnim >= 28 && tickAnim < 33) {
        xx = -64.47945 + (((tickAnim - 28) / 5) * (-46.57479-(-64.47945)));
        yy = -9.08409 + (((tickAnim - 28) / 5) * (-20.79849-(-9.08409)));
        zz = -28.26339 + (((tickAnim - 28) / 5) * (3.34108-(-28.26339)));
        }
        else if (tickAnim >= 33 && tickAnim < 38) {
        xx = -46.57479 + (((tickAnim - 33) / 5) * (-72.08215-(-46.57479)));
        yy = -20.79849 + (((tickAnim - 33) / 5) * (-1.65839-(-20.79849)));
        zz = 3.34108 + (((tickAnim - 33) / 5) * (-41.56487-(3.34108)));
        }
        else if (tickAnim >= 38 && tickAnim < 40) {
        xx = -72.08215 + (((tickAnim - 38) / 2) * (-82.78-(-72.08215)));
        yy = -1.65839 + (((tickAnim - 38) / 2) * (2.03-(-1.65839)));
        zz = -41.56487 + (((tickAnim - 38) / 2) * (-45.08-(-41.56487)));
        }
        else {
        xx = 0;
        yy = 0;
        zz = 0;
        }
        this.setRotateAngle(legL4, legL4.rotateAngleX + (float) Math.toRadians(xx), legL4.rotateAngleY + (float) Math.toRadians(yy), legL4.rotateAngleZ + (float) Math.toRadians(zz));




         if (tickAnim >= 0 && tickAnim < 2) {
        xx = -52.54 + (((tickAnim - 0) / 2) * (-46.57479-(-52.54)));
        yy = 16.89 + (((tickAnim - 0) / 2) * (20.79849-(16.89)));
        zz = 7.19 + (((tickAnim - 0) / 2) * (-3.34108-(7.19)));
        }
        else if (tickAnim >= 2 && tickAnim < 7) {
        xx = -46.57479 + (((tickAnim - 2) / 5) * (-72.08215-(-46.57479)));
        yy = 20.79849 + (((tickAnim - 2) / 5) * (1.65839-(20.79849)));
        zz = -3.34108 + (((tickAnim - 2) / 5) * (41.56487-(-3.34108)));
        }
        else if (tickAnim >= 7 && tickAnim < 12) {
        xx = -72.08215 + (((tickAnim - 7) / 5) * (-93.48143-(-72.08215)));
        yy = 1.65839 + (((tickAnim - 7) / 5) * (-5.72208-(1.65839)));
        zz = 41.56487 + (((tickAnim - 7) / 5) * (48.59292-(41.56487)));
        }
        else if (tickAnim >= 12 && tickAnim < 17) {
        xx = -93.48143 + (((tickAnim - 12) / 5) * (-64.47945-(-93.48143)));
        yy = -5.72208 + (((tickAnim - 12) / 5) * (9.08409-(-5.72208)));
        zz = 48.59292 + (((tickAnim - 12) / 5) * (28.26339-(48.59292)));
        }
        else if (tickAnim >= 17 && tickAnim < 22) {
        xx = -64.47945 + (((tickAnim - 17) / 5) * (-46.57479-(-64.47945)));
        yy = 9.08409 + (((tickAnim - 17) / 5) * (20.79849-(9.08409)));
        zz = 28.26339 + (((tickAnim - 17) / 5) * (-3.34108-(28.26339)));
        }
        else if (tickAnim >= 22 && tickAnim < 27) {
        xx = -46.57479 + (((tickAnim - 22) / 5) * (-72.08215-(-46.57479)));
        yy = 20.79849 + (((tickAnim - 22) / 5) * (1.65839-(20.79849)));
        zz = -3.34108 + (((tickAnim - 22) / 5) * (41.56487-(-3.34108)));
        }
        else if (tickAnim >= 27 && tickAnim < 32) {
        xx = -72.08215 + (((tickAnim - 27) / 5) * (-93.48143-(-72.08215)));
        yy = 1.65839 + (((tickAnim - 27) / 5) * (-5.72208-(1.65839)));
        zz = 41.56487 + (((tickAnim - 27) / 5) * (48.59292-(41.56487)));
        }
        else if (tickAnim >= 32 && tickAnim < 37) {
        xx = -93.48143 + (((tickAnim - 32) / 5) * (-64.47945-(-93.48143)));
        yy = -5.72208 + (((tickAnim - 32) / 5) * (9.08409-(-5.72208)));
        zz = 48.59292 + (((tickAnim - 32) / 5) * (28.26339-(48.59292)));
        }
        else if (tickAnim >= 37 && tickAnim < 40) {
        xx = -64.47945 + (((tickAnim - 37) / 3) * (-52.54-(-64.47945)));
        yy = 9.08409 + (((tickAnim - 37) / 3) * (16.89-(9.08409)));
        zz = 28.26339 + (((tickAnim - 37) / 3) * (7.19-(28.26339)));
        }
        else {
        xx = 0;
        yy = 0;
        zz = 0;
        }
        this.setRotateAngle(legR4, legR4.rotateAngleX + (float) Math.toRadians(xx), legR4.rotateAngleY + (float) Math.toRadians(yy), legR4.rotateAngleZ + (float) Math.toRadians(zz));




         if (tickAnim >= 0 && tickAnim < 2) {
        xx = 0.44 + (((tickAnim - 0) / 2) * (0.6574-(0.44)));
        yy = 7.5 + (((tickAnim - 0) / 2) * (0-(7.5)));
        zz = -3.36 + (((tickAnim - 0) / 2) * (-5.04292-(-3.36)));
        }
        else if (tickAnim >= 2 && tickAnim < 12) {
        xx = 0.6574 + (((tickAnim - 2) / 10) * (0.2927-(0.6574)));
        yy = 0 + (((tickAnim - 2) / 10) * (42.4997-(0)));
        zz = -5.04292 + (((tickAnim - 2) / 10) * (-1.52128-(-5.04292)));
        }
        else if (tickAnim >= 12 && tickAnim < 17) {
        xx = 0.2927 + (((tickAnim - 12) / 5) * (0-(0.2927)));
        yy = 42.4997 + (((tickAnim - 12) / 5) * (22.5-(42.4997)));
        zz = -1.52128 + (((tickAnim - 12) / 5) * (0-(-1.52128)));
        }
        else if (tickAnim >= 17 && tickAnim < 22) {
        xx = 0 + (((tickAnim - 17) / 5) * (0.6574-(0)));
        yy = 22.5 + (((tickAnim - 17) / 5) * (0-(22.5)));
        zz = 0 + (((tickAnim - 17) / 5) * (-5.04292-(0)));
        }
        else if (tickAnim >= 22 && tickAnim < 32) {
        xx = 0.6574 + (((tickAnim - 22) / 10) * (0.2927-(0.6574)));
        yy = 0 + (((tickAnim - 22) / 10) * (42.4997-(0)));
        zz = -5.04292 + (((tickAnim - 22) / 10) * (-1.52128-(-5.04292)));
        }
        else if (tickAnim >= 32 && tickAnim < 37) {
        xx = 0.2927 + (((tickAnim - 32) / 5) * (0-(0.2927)));
        yy = 42.4997 + (((tickAnim - 32) / 5) * (22.5-(42.4997)));
        zz = -1.52128 + (((tickAnim - 32) / 5) * (0-(-1.52128)));
        }
        else if (tickAnim >= 37 && tickAnim < 40) {
        xx = 0 + (((tickAnim - 37) / 3) * (0.44-(0)));
        yy = 22.5 + (((tickAnim - 37) / 3) * (7.5-(22.5)));
        zz = 0 + (((tickAnim - 37) / 3) * (-3.36-(0)));
        }
        else {
        xx = 0;
        yy = 0;
        zz = 0;
        }
        this.setRotateAngle(LegR4_2, LegR4_2.rotateAngleX + (float) Math.toRadians(xx), LegR4_2.rotateAngleY + (float) Math.toRadians(yy), LegR4_2.rotateAngleZ + (float) Math.toRadians(zz));




         if (tickAnim >= 0 && tickAnim < 2) {
        xx = 0 + (((tickAnim - 0) / 2) * (0-(0)));
        yy = 10.83 + (((tickAnim - 0) / 2) * (0-(10.83)));
        zz = 0 + (((tickAnim - 0) / 2) * (0-(0)));
        }
        else if (tickAnim >= 2 && tickAnim < 12) {
        xx = 0 + (((tickAnim - 2) / 10) * (0-(0)));
        yy = 0 + (((tickAnim - 2) / 10) * (33.33-(0)));
        zz = 0 + (((tickAnim - 2) / 10) * (0-(0)));
        }
        else if (tickAnim >= 12 && tickAnim < 17) {
        xx = 0 + (((tickAnim - 12) / 5) * (0-(0)));
        yy = 33.33 + (((tickAnim - 12) / 5) * (32.5-(33.33)));
        zz = 0 + (((tickAnim - 12) / 5) * (0-(0)));
        }
        else if (tickAnim >= 17 && tickAnim < 22) {
        xx = 0 + (((tickAnim - 17) / 5) * (0-(0)));
        yy = 32.5 + (((tickAnim - 17) / 5) * (0-(32.5)));
        zz = 0 + (((tickAnim - 17) / 5) * (0-(0)));
        }
        else if (tickAnim >= 22 && tickAnim < 32) {
        xx = 0 + (((tickAnim - 22) / 10) * (0-(0)));
        yy = 0 + (((tickAnim - 22) / 10) * (33.33-(0)));
        zz = 0 + (((tickAnim - 22) / 10) * (0-(0)));
        }
        else if (tickAnim >= 32 && tickAnim < 37) {
        xx = 0 + (((tickAnim - 32) / 5) * (0-(0)));
        yy = 33.33 + (((tickAnim - 32) / 5) * (32.5-(33.33)));
        zz = 0 + (((tickAnim - 32) / 5) * (0-(0)));
        }
        else if (tickAnim >= 37 && tickAnim < 40) {
        xx = 0 + (((tickAnim - 37) / 3) * (0-(0)));
        yy = 32.5 + (((tickAnim - 37) / 3) * (10.83-(32.5)));
        zz = 0 + (((tickAnim - 37) / 3) * (0-(0)));
        }
        else {
        xx = 0;
        yy = 0;
        zz = 0;
        }
        this.setRotateAngle(LegR4_3, LegR4_3.rotateAngleX + (float) Math.toRadians(xx), LegR4_3.rotateAngleY + (float) Math.toRadians(yy), LegR4_3.rotateAngleZ + (float) Math.toRadians(zz));




         if (tickAnim >= 0 && tickAnim < 4) {
        xx = 9.23 + (((tickAnim - 0) / 4) * (20.01377-(9.23)));
        yy = 7.77 + (((tickAnim - 0) / 4) * (-2.60806-(7.77)));
        zz = -11.8 + (((tickAnim - 0) / 4) * (-6.80871-(-11.8)));
        }
        else if (tickAnim >= 4 && tickAnim < 9) {
        xx = 20.01377 + (((tickAnim - 4) / 5) * (-12.45892-(20.01377)));
        yy = -2.60806 + (((tickAnim - 4) / 5) * (8.68305-(-2.60806)));
        zz = -6.80871 + (((tickAnim - 4) / 5) * (-27.38506-(-6.80871)));
        }
        else if (tickAnim >= 9 && tickAnim < 14) {
        xx = -12.45892 + (((tickAnim - 9) / 5) * (-14.21219-(-12.45892)));
        yy = 8.68305 + (((tickAnim - 9) / 5) * (22.14609-(8.68305)));
        zz = -27.38506 + (((tickAnim - 9) / 5) * (-12.56681-(-27.38506)));
        }
        else if (tickAnim >= 14 && tickAnim < 19) {
        xx = -14.21219 + (((tickAnim - 14) / 5) * (7.07289-(-14.21219)));
        yy = 22.14609 + (((tickAnim - 14) / 5) * (9.84109-(22.14609)));
        zz = -12.56681 + (((tickAnim - 14) / 5) * (-12.80032-(-12.56681)));
        }
        else if (tickAnim >= 19 && tickAnim < 24) {
        xx = 7.07289 + (((tickAnim - 19) / 5) * (20.01377-(7.07289)));
        yy = 9.84109 + (((tickAnim - 19) / 5) * (-2.60806-(9.84109)));
        zz = -12.80032 + (((tickAnim - 19) / 5) * (-6.80871-(-12.80032)));
        }
        else if (tickAnim >= 24 && tickAnim < 29) {
        xx = 20.01377 + (((tickAnim - 24) / 5) * (-12.45892-(20.01377)));
        yy = -2.60806 + (((tickAnim - 24) / 5) * (8.68305-(-2.60806)));
        zz = -6.80871 + (((tickAnim - 24) / 5) * (-27.38506-(-6.80871)));
        }
        else if (tickAnim >= 29 && tickAnim < 34) {
        xx = -12.45892 + (((tickAnim - 29) / 5) * (-14.21219-(-12.45892)));
        yy = 8.68305 + (((tickAnim - 29) / 5) * (22.14609-(8.68305)));
        zz = -27.38506 + (((tickAnim - 29) / 5) * (-12.56681-(-27.38506)));
        }
        else if (tickAnim >= 34 && tickAnim < 39) {
        xx = -14.21219 + (((tickAnim - 34) / 5) * (7.07289-(-14.21219)));
        yy = 22.14609 + (((tickAnim - 34) / 5) * (9.84109-(22.14609)));
        zz = -12.56681 + (((tickAnim - 34) / 5) * (-12.80032-(-12.56681)));
        }
        else if (tickAnim >= 39 && tickAnim < 40) {
        xx = 7.07289 + (((tickAnim - 39) / 1) * (9.23-(7.07289)));
        yy = 9.84109 + (((tickAnim - 39) / 1) * (7.77-(9.84109)));
        zz = -12.80032 + (((tickAnim - 39) / 1) * (-11.8-(-12.80032)));
        }
        else {
        xx = 0;
        yy = 0;
        zz = 0;
        }
        this.setRotateAngle(legL3, legL3.rotateAngleX + (float) Math.toRadians(xx), legL3.rotateAngleY + (float) Math.toRadians(yy), legL3.rotateAngleZ + (float) Math.toRadians(zz));




         if (tickAnim >= 0 && tickAnim < 4) {
        xx = 0 + (((tickAnim - 0) / 4) * (0-(0)));
        yy = 0 + (((tickAnim - 0) / 4) * (0-(0)));
        zz = 54.17 + (((tickAnim - 0) / 4) * (50-(54.17)));
        }
        else if (tickAnim >= 4 && tickAnim < 14) {
        xx = 0 + (((tickAnim - 4) / 10) * (0-(0)));
        yy = 0 + (((tickAnim - 4) / 10) * (0-(0)));
        zz = 50 + (((tickAnim - 4) / 10) * (45-(50)));
        }
        else if (tickAnim >= 14 && tickAnim < 19) {
        xx = 0 + (((tickAnim - 14) / 5) * (0-(0)));
        yy = 0 + (((tickAnim - 14) / 5) * (0-(0)));
        zz = 45 + (((tickAnim - 14) / 5) * (55-(45)));
        }
        else if (tickAnim >= 19 && tickAnim < 24) {
        xx = 0 + (((tickAnim - 19) / 5) * (0-(0)));
        yy = 0 + (((tickAnim - 19) / 5) * (0-(0)));
        zz = 55 + (((tickAnim - 19) / 5) * (50-(55)));
        }
        else if (tickAnim >= 24 && tickAnim < 34) {
        xx = 0 + (((tickAnim - 24) / 10) * (0-(0)));
        yy = 0 + (((tickAnim - 24) / 10) * (0-(0)));
        zz = 50 + (((tickAnim - 24) / 10) * (45-(50)));
        }
        else if (tickAnim >= 34 && tickAnim < 39) {
        xx = 0 + (((tickAnim - 34) / 5) * (0-(0)));
        yy = 0 + (((tickAnim - 34) / 5) * (0-(0)));
        zz = 45 + (((tickAnim - 34) / 5) * (55-(45)));
        }
        else if (tickAnim >= 39 && tickAnim < 40) {
        xx = 0 + (((tickAnim - 39) / 1) * (0-(0)));
        yy = 0 + (((tickAnim - 39) / 1) * (0-(0)));
        zz = 55 + (((tickAnim - 39) / 1) * (54.17-(55)));
        }
        else {
        xx = 0;
        yy = 0;
        zz = 0;
        }
        this.setRotateAngle(legL3_2, legL3_2.rotateAngleX + (float) Math.toRadians(xx), legL3_2.rotateAngleY + (float) Math.toRadians(yy), legL3_2.rotateAngleZ + (float) Math.toRadians(zz));




         if (tickAnim >= 0 && tickAnim < 3) {
        xx = -13.04 + (((tickAnim - 0) / 3) * (-14.21219-(-13.04)));
        yy = -13.17 + (((tickAnim - 0) / 3) * (-22.14609-(-13.17)));
        zz = 22.45 + (((tickAnim - 0) / 3) * (12.56681-(22.45)));
        }
        else if (tickAnim >= 3 && tickAnim < 8) {
        xx = -14.21219 + (((tickAnim - 3) / 5) * (7.07289-(-14.21219)));
        yy = -22.14609 + (((tickAnim - 3) / 5) * (-9.84109-(-22.14609)));
        zz = 12.56681 + (((tickAnim - 3) / 5) * (12.80032-(12.56681)));
        }
        else if (tickAnim >= 8 && tickAnim < 13) {
        xx = 7.07289 + (((tickAnim - 8) / 5) * (20.01377-(7.07289)));
        yy = -9.84109 + (((tickAnim - 8) / 5) * (2.60806-(-9.84109)));
        zz = 12.80032 + (((tickAnim - 8) / 5) * (6.80871-(12.80032)));
        }
        else if (tickAnim >= 13 && tickAnim < 18) {
        xx = 20.01377 + (((tickAnim - 13) / 5) * (-12.45892-(20.01377)));
        yy = 2.60806 + (((tickAnim - 13) / 5) * (-8.68305-(2.60806)));
        zz = 6.80871 + (((tickAnim - 13) / 5) * (27.38506-(6.80871)));
        }
        else if (tickAnim >= 18 && tickAnim < 23) {
        xx = -12.45892 + (((tickAnim - 18) / 5) * (-14.21219-(-12.45892)));
        yy = -8.68305 + (((tickAnim - 18) / 5) * (-22.14609-(-8.68305)));
        zz = 27.38506 + (((tickAnim - 18) / 5) * (12.56681-(27.38506)));
        }
        else if (tickAnim >= 23 && tickAnim < 28) {
        xx = -14.21219 + (((tickAnim - 23) / 5) * (7.07289-(-14.21219)));
        yy = -22.14609 + (((tickAnim - 23) / 5) * (-9.84109-(-22.14609)));
        zz = 12.56681 + (((tickAnim - 23) / 5) * (12.80032-(12.56681)));
        }
        else if (tickAnim >= 28 && tickAnim < 33) {
        xx = 7.07289 + (((tickAnim - 28) / 5) * (20.01377-(7.07289)));
        yy = -9.84109 + (((tickAnim - 28) / 5) * (2.60806-(-9.84109)));
        zz = 12.80032 + (((tickAnim - 28) / 5) * (6.80871-(12.80032)));
        }
        else if (tickAnim >= 33 && tickAnim < 38) {
        xx = 20.01377 + (((tickAnim - 33) / 5) * (-12.45892-(20.01377)));
        yy = 2.60806 + (((tickAnim - 33) / 5) * (-8.68305-(2.60806)));
        zz = 6.80871 + (((tickAnim - 33) / 5) * (27.38506-(6.80871)));
        }
        else if (tickAnim >= 38 && tickAnim < 40) {
        xx = -12.45892 + (((tickAnim - 38) / 2) * (-13.04-(-12.45892)));
        yy = -8.68305 + (((tickAnim - 38) / 2) * (-13.17-(-8.68305)));
        zz = 27.38506 + (((tickAnim - 38) / 2) * (22.45-(27.38506)));
        }
        else {
        xx = 0;
        yy = 0;
        zz = 0;
        }
        this.setRotateAngle(legR3, legR3.rotateAngleX + (float) Math.toRadians(xx), legR3.rotateAngleY + (float) Math.toRadians(yy), legR3.rotateAngleZ + (float) Math.toRadians(zz));




         if (tickAnim >= 0 && tickAnim < 3) {
        xx = 0 + (((tickAnim - 0) / 3) * (0-(0)));
        yy = 0 + (((tickAnim - 0) / 3) * (0-(0)));
        zz = -46.67 + (((tickAnim - 0) / 3) * (-45-(-46.67)));
        }
        else if (tickAnim >= 3 && tickAnim < 8) {
        xx = 0 + (((tickAnim - 3) / 5) * (0-(0)));
        yy = 0 + (((tickAnim - 3) / 5) * (0-(0)));
        zz = -45 + (((tickAnim - 3) / 5) * (-55-(-45)));
        }
        else if (tickAnim >= 8 && tickAnim < 13) {
        xx = 0 + (((tickAnim - 8) / 5) * (0-(0)));
        yy = 0 + (((tickAnim - 8) / 5) * (0-(0)));
        zz = -55 + (((tickAnim - 8) / 5) * (-50-(-55)));
        }
        else if (tickAnim >= 13 && tickAnim < 23) {
        xx = 0 + (((tickAnim - 13) / 10) * (0-(0)));
        yy = 0 + (((tickAnim - 13) / 10) * (0-(0)));
        zz = -50 + (((tickAnim - 13) / 10) * (-45-(-50)));
        }
        else if (tickAnim >= 23 && tickAnim < 28) {
        xx = 0 + (((tickAnim - 23) / 5) * (0-(0)));
        yy = 0 + (((tickAnim - 23) / 5) * (0-(0)));
        zz = -45 + (((tickAnim - 23) / 5) * (-55-(-45)));
        }
        else if (tickAnim >= 28 && tickAnim < 33) {
        xx = 0 + (((tickAnim - 28) / 5) * (0-(0)));
        yy = 0 + (((tickAnim - 28) / 5) * (0-(0)));
        zz = -55 + (((tickAnim - 28) / 5) * (-50-(-55)));
        }
        else if (tickAnim >= 33 && tickAnim < 40) {
        xx = 0 + (((tickAnim - 33) / 7) * (0-(0)));
        yy = 0 + (((tickAnim - 33) / 7) * (0-(0)));
        zz = -50 + (((tickAnim - 33) / 7) * (-46.67-(-50)));
        }
        else {
        xx = 0;
        yy = 0;
        zz = 0;
        }
        this.setRotateAngle(legR3_2, legR3_2.rotateAngleX + (float) Math.toRadians(xx), legR3_2.rotateAngleY + (float) Math.toRadians(yy), legR3_2.rotateAngleZ + (float) Math.toRadians(zz));




         if (tickAnim >= 0 && tickAnim < 1) {
        xx = -53.2 + (((tickAnim - 0) / 1) * (-54.51095-(-53.2)));
        yy = 29.16 + (((tickAnim - 0) / 1) * (33.03286-(29.16)));
        zz = -16.19 + (((tickAnim - 0) / 1) * (-13.89049-(-16.19)));
        }
        else if (tickAnim >= 1 && tickAnim < 11) {
        xx = -54.51095 + (((tickAnim - 1) / 10) * (-24.67861-(-54.51095)));
        yy = 33.03286 + (((tickAnim - 1) / 10) * (1.12812-(33.03286)));
        zz = -13.89049 + (((tickAnim - 1) / 10) * (-36.1904-(-13.89049)));
        }
        else if (tickAnim >= 11 && tickAnim < 16) {
        xx = -24.67861 + (((tickAnim - 11) / 5) * (-41.54651-(-24.67861)));
        yy = 1.12812 + (((tickAnim - 11) / 5) * (9.94447-(1.12812)));
        zz = -36.1904 + (((tickAnim - 11) / 5) * (-32.99095-(-36.1904)));
        }
        else if (tickAnim >= 16 && tickAnim < 21) {
        xx = -41.54651 + (((tickAnim - 16) / 5) * (-54.1543-(-41.54651)));
        yy = 9.94447 + (((tickAnim - 16) / 5) * (33.43907-(9.94447)));
        zz = -32.99095 + (((tickAnim - 16) / 5) * (-13.42984-(-32.99095)));
        }
        else if (tickAnim >= 21 && tickAnim < 31) {
        xx = -54.1543 + (((tickAnim - 21) / 10) * (-24.04977-(-54.1543)));
        yy = 33.43907 + (((tickAnim - 21) / 10) * (1.95327-(33.43907)));
        zz = -13.42984 + (((tickAnim - 21) / 10) * (-34.26307-(-13.42984)));
        }
        else if (tickAnim >= 31 && tickAnim < 36) {
        xx = -24.04977 + (((tickAnim - 31) / 5) * (-41.54651-(-24.04977)));
        yy = 1.95327 + (((tickAnim - 31) / 5) * (9.94447-(1.95327)));
        zz = -34.26307 + (((tickAnim - 31) / 5) * (-32.99095-(-34.26307)));
        }
        else if (tickAnim >= 36 && tickAnim < 40) {
        xx = -41.54651 + (((tickAnim - 36) / 4) * (-53.2-(-41.54651)));
        yy = 9.94447 + (((tickAnim - 36) / 4) * (29.16-(9.94447)));
        zz = -32.99095 + (((tickAnim - 36) / 4) * (-16.19-(-32.99095)));
        }
        else {
        xx = 0;
        yy = 0;
        zz = 0;
        }
        this.setRotateAngle(legL2, legL2.rotateAngleX + (float) Math.toRadians(xx), legL2.rotateAngleY + (float) Math.toRadians(yy), legL2.rotateAngleZ + (float) Math.toRadians(zz));




         if (tickAnim >= 0 && tickAnim < 1) {
        xx = 0 + (((tickAnim - 0) / 1) * (0-(0)));
        yy = 0 + (((tickAnim - 0) / 1) * (0-(0)));
        zz = 46.25 + (((tickAnim - 0) / 1) * (42.5-(46.25)));
        }
        else if (tickAnim >= 1 && tickAnim < 11) {
        xx = 0 + (((tickAnim - 1) / 10) * (0-(0)));
        yy = 0 + (((tickAnim - 1) / 10) * (0-(0)));
        zz = 42.5 + (((tickAnim - 1) / 10) * (87.5-(42.5)));
        }
        else if (tickAnim >= 11 && tickAnim < 21) {
        xx = 0 + (((tickAnim - 11) / 10) * (0-(0)));
        yy = 0 + (((tickAnim - 11) / 10) * (0-(0)));
        zz = 87.5 + (((tickAnim - 11) / 10) * (42.5-(87.5)));
        }
        else if (tickAnim >= 21 && tickAnim < 31) {
        xx = 0 + (((tickAnim - 21) / 10) * (0-(0)));
        yy = 0 + (((tickAnim - 21) / 10) * (0-(0)));
        zz = 42.5 + (((tickAnim - 21) / 10) * (87.5-(42.5)));
        }
        else if (tickAnim >= 31 && tickAnim < 40) {
        xx = 0 + (((tickAnim - 31) / 9) * (0-(0)));
        yy = 0 + (((tickAnim - 31) / 9) * (0-(0)));
        zz = 87.5 + (((tickAnim - 31) / 9) * (46.25-(87.5)));
        }
        else {
        xx = 0;
        yy = 0;
        zz = 0;
        }
        this.setRotateAngle(legL2_2, legL2_2.rotateAngleX + (float) Math.toRadians(xx), legL2_2.rotateAngleY + (float) Math.toRadians(yy), legL2_2.rotateAngleZ + (float) Math.toRadians(zz));




         if (tickAnim >= 0 && tickAnim < 5) {
        xx = -24.04769 + (((tickAnim - 0) / 5) * (-41.54651-(-24.04769)));
        yy = -1.95645 + (((tickAnim - 0) / 5) * (-9.94447-(-1.95645)));
        zz = 34.26115 + (((tickAnim - 0) / 5) * (32.99095-(34.26115)));
        }
        else if (tickAnim >= 5 && tickAnim < 10) {
        xx = -41.54651 + (((tickAnim - 5) / 5) * (-55.53284-(-41.54651)));
        yy = -9.94447 + (((tickAnim - 5) / 5) * (-31.80373-(-9.94447)));
        zz = 32.99095 + (((tickAnim - 5) / 5) * (15.22597-(32.99095)));
        }
        else if (tickAnim >= 10 && tickAnim < 20) {
        xx = -55.53284 + (((tickAnim - 10) / 10) * (-24.21002-(-55.53284)));
        yy = -31.80373 + (((tickAnim - 10) / 10) * (-1.74887-(-31.80373)));
        zz = 15.22597 + (((tickAnim - 10) / 10) * (34.7467-(15.22597)));
        }
        else if (tickAnim >= 20 && tickAnim < 25) {
        xx = -24.21002 + (((tickAnim - 20) / 5) * (-41.54651-(-24.21002)));
        yy = -1.74887 + (((tickAnim - 20) / 5) * (-9.94447-(-1.74887)));
        zz = 34.7467 + (((tickAnim - 20) / 5) * (32.99095-(34.7467)));
        }
        else if (tickAnim >= 25 && tickAnim < 30) {
        xx = -41.54651 + (((tickAnim - 25) / 5) * (-55.53284-(-41.54651)));
        yy = -9.94447 + (((tickAnim - 25) / 5) * (-31.80373-(-9.94447)));
        zz = 32.99095 + (((tickAnim - 25) / 5) * (15.22597-(32.99095)));
        }
        else if (tickAnim >= 30 && tickAnim < 40) {
        xx = -55.53284 + (((tickAnim - 30) / 10) * (-24.04769-(-55.53284)));
        yy = -31.80373 + (((tickAnim - 30) / 10) * (-1.95645-(-31.80373)));
        zz = 15.22597 + (((tickAnim - 30) / 10) * (34.26115-(15.22597)));
        }
        else {
        xx = 0;
        yy = 0;
        zz = 0;
        }
        this.setRotateAngle(legR2, legR2.rotateAngleX + (float) Math.toRadians(xx), legR2.rotateAngleY + (float) Math.toRadians(yy), legR2.rotateAngleZ + (float) Math.toRadians(zz));




         if (tickAnim >= 0 && tickAnim < 10) {
        xx = 0 + (((tickAnim - 0) / 10) * (0-(0)));
        yy = 0 + (((tickAnim - 0) / 10) * (0-(0)));
        zz = -87.5 + (((tickAnim - 0) / 10) * (-42.5-(-87.5)));
        }
        else if (tickAnim >= 10 && tickAnim < 20) {
        xx = 0 + (((tickAnim - 10) / 10) * (0-(0)));
        yy = 0 + (((tickAnim - 10) / 10) * (0-(0)));
        zz = -42.5 + (((tickAnim - 10) / 10) * (-87.5-(-42.5)));
        }
        else if (tickAnim >= 20 && tickAnim < 30) {
        xx = 0 + (((tickAnim - 20) / 10) * (0-(0)));
        yy = 0 + (((tickAnim - 20) / 10) * (0-(0)));
        zz = -87.5 + (((tickAnim - 20) / 10) * (-42.5-(-87.5)));
        }
        else if (tickAnim >= 30 && tickAnim < 40) {
        xx = 0 + (((tickAnim - 30) / 10) * (0-(0)));
        yy = 0 + (((tickAnim - 30) / 10) * (0-(0)));
        zz = -42.5 + (((tickAnim - 30) / 10) * (-87.5-(-42.5)));
        }
        else {
        xx = 0;
        yy = 0;
        zz = 0;
        }
        this.setRotateAngle(legR2_2, legR2_2.rotateAngleX + (float) Math.toRadians(xx), legR2_2.rotateAngleY + (float) Math.toRadians(yy), legR2_2.rotateAngleZ + (float) Math.toRadians(zz));



        this.setRotateAngle(legL1, legL1.rotateAngleX + (float) Math.toRadians(-80-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*45/0.25+50))*15), legL1.rotateAngleY + (float) Math.toRadians(30+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*45/0.25+145))*15), legL1.rotateAngleZ + (float) Math.toRadians(-60+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*90/0.25+50))*10));


        this.setRotateAngle(legL1_2, legL1_2.rotateAngleX + (float) Math.toRadians(0), legL1_2.rotateAngleY + (float) Math.toRadians(-20+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*90/0.25+145))*10), legL1_2.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(legR1, legR1.rotateAngleX + (float) Math.toRadians(-80-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*45/0.25+50))*15), legR1.rotateAngleY + (float) Math.toRadians(-30+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*45/0.25+145))*15), legR1.rotateAngleZ + (float) Math.toRadians(60+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*90/0.25+50))*10));


        this.setRotateAngle(legR1_2, legR1_2.rotateAngleX + (float) Math.toRadians(0), legR1_2.rotateAngleY + (float) Math.toRadians(20+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*90/0.25+145))*10), legR1_2.rotateAngleZ + (float) Math.toRadians(0));



         if (tickAnim >= 0 && tickAnim < 3) {
        xx = 0.38 + (((tickAnim - 0) / 3) * (0.2927-(0.38)));
        yy = -31.87 + (((tickAnim - 0) / 3) * (-42.4997-(-31.87)));
        zz = 2.4 + (((tickAnim - 0) / 3) * (1.52128-(2.4)));
        }
        else if (tickAnim >= 3 && tickAnim < 8) {
        xx = 0.2927 + (((tickAnim - 3) / 5) * (0-(0.2927)));
        yy = -42.4997 + (((tickAnim - 3) / 5) * (-22.5-(-42.4997)));
        zz = 1.52128 + (((tickAnim - 3) / 5) * (0-(1.52128)));
        }
        else if (tickAnim >= 8 && tickAnim < 13) {
        xx = 0 + (((tickAnim - 8) / 5) * (0.6574-(0)));
        yy = -22.5 + (((tickAnim - 8) / 5) * (0-(-22.5)));
        zz = 0 + (((tickAnim - 8) / 5) * (5.04292-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 23) {
        xx = 0.6574 + (((tickAnim - 13) / 10) * (0.2927-(0.6574)));
        yy = 0 + (((tickAnim - 13) / 10) * (-42.4997-(0)));
        zz = 5.04292 + (((tickAnim - 13) / 10) * (1.52128-(5.04292)));
        }
        else if (tickAnim >= 23 && tickAnim < 28) {
        xx = 0.2927 + (((tickAnim - 23) / 5) * (0-(0.2927)));
        yy = -42.4997 + (((tickAnim - 23) / 5) * (-22.5-(-42.4997)));
        zz = 1.52128 + (((tickAnim - 23) / 5) * (0-(1.52128)));
        }
        else if (tickAnim >= 28 && tickAnim < 33) {
        xx = 0 + (((tickAnim - 28) / 5) * (0.6574-(0)));
        yy = -22.5 + (((tickAnim - 28) / 5) * (0-(-22.5)));
        zz = 0 + (((tickAnim - 28) / 5) * (5.04292-(0)));
        }
        else if (tickAnim >= 33 && tickAnim < 40) {
        xx = 0.6574 + (((tickAnim - 33) / 7) * (0.38-(0.6574)));
        yy = 0 + (((tickAnim - 33) / 7) * (-31.87-(0)));
        zz = 5.04292 + (((tickAnim - 33) / 7) * (2.4-(5.04292)));
        }
        else {
        xx = 0;
        yy = 0;
        zz = 0;
        }
        this.setRotateAngle(legL4_2, legL4_2.rotateAngleX + (float) Math.toRadians(xx), legL4_2.rotateAngleY + (float) Math.toRadians(yy), legL4_2.rotateAngleZ + (float) Math.toRadians(zz));




         if (tickAnim >= 0 && tickAnim < 3) {
        xx = 0 + (((tickAnim - 0) / 3) * (0-(0)));
        yy = -25 + (((tickAnim - 0) / 3) * (-33.33-(-25)));
        zz = 0 + (((tickAnim - 0) / 3) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 8) {
        xx = 0 + (((tickAnim - 3) / 5) * (0-(0)));
        yy = -33.33 + (((tickAnim - 3) / 5) * (-32.5-(-33.33)));
        zz = 0 + (((tickAnim - 3) / 5) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 13) {
        xx = 0 + (((tickAnim - 8) / 5) * (0-(0)));
        yy = -32.5 + (((tickAnim - 8) / 5) * (0-(-32.5)));
        zz = 0 + (((tickAnim - 8) / 5) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 23) {
        xx = 0 + (((tickAnim - 13) / 10) * (0-(0)));
        yy = 0 + (((tickAnim - 13) / 10) * (-33.33-(0)));
        zz = 0 + (((tickAnim - 13) / 10) * (0-(0)));
        }
        else if (tickAnim >= 23 && tickAnim < 28) {
        xx = 0 + (((tickAnim - 23) / 5) * (0-(0)));
        yy = -33.33 + (((tickAnim - 23) / 5) * (-32.5-(-33.33)));
        zz = 0 + (((tickAnim - 23) / 5) * (0-(0)));
        }
        else if (tickAnim >= 28 && tickAnim < 33) {
        xx = 0 + (((tickAnim - 28) / 5) * (0-(0)));
        yy = -32.5 + (((tickAnim - 28) / 5) * (0-(-32.5)));
        zz = 0 + (((tickAnim - 28) / 5) * (0-(0)));
        }
        else if (tickAnim >= 33 && tickAnim < 40) {
        xx = 0 + (((tickAnim - 33) / 7) * (0-(0)));
        yy = 0 + (((tickAnim - 33) / 7) * (-25-(0)));
        zz = 0 + (((tickAnim - 33) / 7) * (0-(0)));
        }
        else {
        xx = 0;
        yy = 0;
        zz = 0;
        }
        this.setRotateAngle(legL4_3, legL4_3.rotateAngleX + (float) Math.toRadians(xx), legL4_3.rotateAngleY + (float) Math.toRadians(yy), legL4_3.rotateAngleZ + (float) Math.toRadians(zz));
    }

    public void animRun(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime) {
        EntityPrehistoricFloraHallipterus entity = (EntityPrehistoricFloraHallipterus) entitylivingbaseIn;
        int animCycle = 20;
        double tickAnim = (entity.ticksExisted + entity.getTickOffset()) - (int) (Math.floor((double) (entity.ticksExisted + entity.getTickOffset()) / (double) animCycle) * (double) animCycle) + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;


         if (tickAnim >= 0 && tickAnim < 3) {
        xx = 5 + (((tickAnim - 0) / 3) * (-4-(5)));
        yy = 0 + (((tickAnim - 0) / 3) * (0-(0)));
        zz = 0 + (((tickAnim - 0) / 3) * (0-(0)));
    }
            else if (tickAnim >= 3 && tickAnim < 13) {
    xx = -4 + (((tickAnim - 3) / 10) * (7.6875-(-4)));
    yy = 0 + (((tickAnim - 3) / 10) * (0-(0)));
    zz = 0 + (((tickAnim - 3) / 10) * (-4-(0)));
}
        else if (tickAnim >= 13 && tickAnim < 17) {
        xx = 7.6875 + (((tickAnim - 13) / 4) * (13-(7.6875)));
        yy = 0 + (((tickAnim - 13) / 4) * (0-(0)));
        zz = -4 + (((tickAnim - 13) / 4) * (2.5-(-4)));
        }
        else if (tickAnim >= 17 && tickAnim < 18) {
        xx = 13 + (((tickAnim - 17) / 1) * (9-(13)));
        yy = 0 + (((tickAnim - 17) / 1) * (0-(0)));
        zz = 2.5 + (((tickAnim - 17) / 1) * (0.5-(2.5)));
        }
        else if (tickAnim >= 18 && tickAnim < 20) {
        xx = 9 + (((tickAnim - 18) / 2) * (5-(9)));
        yy = 0 + (((tickAnim - 18) / 2) * (0-(0)));
        zz = 0.5 + (((tickAnim - 18) / 2) * (0-(0.5)));
        }
        else {
        xx = 0;
        yy = 0;
        zz = 0;
        }
        this.setRotateAngle(body, body.rotateAngleX + (float) Math.toRadians(xx), body.rotateAngleY + (float) Math.toRadians(yy), body.rotateAngleZ + (float) Math.toRadians(zz));


         if (tickAnim >= 0 && tickAnim < 17) {
        xx = 0 + (((tickAnim - 0) / 17) * (0-(0)));
        yy = 6.4 + (((tickAnim - 0) / 17) * (5.4-(6.4)));
        zz = 0 + (((tickAnim - 0) / 17) * (0-(0)));
        }
        else if (tickAnim >= 17 && tickAnim < 18) {
        xx = 0 + (((tickAnim - 17) / 1) * (0-(0)));
        yy = 5.4 + (((tickAnim - 17) / 1) * (6.6-(5.4)));
        zz = 0 + (((tickAnim - 17) / 1) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 20) {
        xx = 0 + (((tickAnim - 18) / 2) * (0-(0)));
        yy = 6.6 + (((tickAnim - 18) / 2) * (6.4-(6.6)));
        zz = 0 + (((tickAnim - 18) / 2) * (0-(0)));
        }
        else {
        xx = 0;
        yy = 0;
        zz = 0;
        }
        this.body.rotationPointX = this.body.rotationPointX + (float)(xx);
        this.body.rotationPointY = this.body.rotationPointY - (float)(yy);
        this.body.rotationPointZ = this.body.rotationPointZ + (float)(zz);




         if (tickAnim >= 0 && tickAnim < 3) {
        xx = -30 + (((tickAnim - 0) / 3) * (-41.26473-(-30)));
        yy = 0 + (((tickAnim - 0) / 3) * (-4.55306-(0)));
        zz = 0 + (((tickAnim - 0) / 3) * (39.19435-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 16) {
        xx = -41.26473 + (((tickAnim - 3) / 13) * (-71.55259-(-41.26473)));
        yy = -4.55306 + (((tickAnim - 3) / 13) * (-60.87208-(-4.55306)));
        zz = 39.19435 + (((tickAnim - 3) / 13) * (69.09975-(39.19435)));
        }
        else if (tickAnim >= 16 && tickAnim < 18) {
        xx = -71.55259 + (((tickAnim - 16) / 2) * (-56.98624-(-71.55259)));
        yy = -60.87208 + (((tickAnim - 16) / 2) * (-38.86947-(-60.87208)));
        zz = 69.09975 + (((tickAnim - 16) / 2) * (27.98913-(69.09975)));
        }
        else if (tickAnim >= 18 && tickAnim < 20) {
        xx = -56.98624 + (((tickAnim - 18) / 2) * (-30-(-56.98624)));
        yy = -38.86947 + (((tickAnim - 18) / 2) * (0-(-38.86947)));
        zz = 27.98913 + (((tickAnim - 18) / 2) * (0-(27.98913)));
        }
        else {
        xx = 0;
        yy = 0;
        zz = 0;
        }
        this.setRotateAngle(legR5, legR5.rotateAngleX + (float) Math.toRadians(xx), legR5.rotateAngleY + (float) Math.toRadians(yy), legR5.rotateAngleZ + (float) Math.toRadians(zz));




         if (tickAnim >= 0 && tickAnim < 3) {
        xx = 0 + (((tickAnim - 0) / 3) * (0-(0)));
        yy = 0 + (((tickAnim - 0) / 3) * (22.97-(0)));
        zz = 0 + (((tickAnim - 0) / 3) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 9) {
        xx = 0 + (((tickAnim - 3) / 6) * (0-(0)));
        yy = 22.97 + (((tickAnim - 3) / 6) * (-10.15-(22.97)));
        zz = 0 + (((tickAnim - 3) / 6) * (0-(0)));
        }
        else if (tickAnim >= 9 && tickAnim < 13) {
        xx = 0 + (((tickAnim - 9) / 4) * (0-(0)));
        yy = -10.15 + (((tickAnim - 9) / 4) * (7.67-(-10.15)));
        zz = 0 + (((tickAnim - 9) / 4) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 20) {
        xx = 0 + (((tickAnim - 13) / 7) * (0-(0)));
        yy = 7.67 + (((tickAnim - 13) / 7) * (0-(7.67)));
        zz = 0 + (((tickAnim - 13) / 7) * (0-(0)));
        }
        else {
        xx = 0;
        yy = 0;
        zz = 0;
        }
        this.setRotateAngle(legR5_2, legR5_2.rotateAngleX + (float) Math.toRadians(xx), legR5_2.rotateAngleY + (float) Math.toRadians(yy), legR5_2.rotateAngleZ + (float) Math.toRadians(zz));




         if (tickAnim >= 0 && tickAnim < 14) {
        xx = 0 + (((tickAnim - 0) / 14) * (0-(0)));
        yy = -5 + (((tickAnim - 0) / 14) * (-27.5-(-5)));
        zz = 0 + (((tickAnim - 0) / 14) * (0-(0)));
        }
        else if (tickAnim >= 14 && tickAnim < 17) {
        xx = 0 + (((tickAnim - 14) / 3) * (0-(0)));
        yy = -27.5 + (((tickAnim - 14) / 3) * (-5-(-27.5)));
        zz = 0 + (((tickAnim - 14) / 3) * (0-(0)));
        }
        else if (tickAnim >= 17 && tickAnim < 18) {
        xx = 0 + (((tickAnim - 17) / 1) * (0-(0)));
        yy = -5 + (((tickAnim - 17) / 1) * (67.5-(-5)));
        zz = 0 + (((tickAnim - 17) / 1) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 18) {
        xx = 0 + (((tickAnim - 18) / 0) * (0-(0)));
        yy = 67.5 + (((tickAnim - 18) / 0) * (49.59-(67.5)));
        zz = 0 + (((tickAnim - 18) / 0) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 19) {
        xx = 0 + (((tickAnim - 18) / 1) * (0-(0)));
        yy = 49.59 + (((tickAnim - 18) / 1) * (26.67-(49.59)));
        zz = 0 + (((tickAnim - 18) / 1) * (0-(0)));
        }
        else if (tickAnim >= 19 && tickAnim < 20) {
        xx = 0 + (((tickAnim - 19) / 1) * (0-(0)));
        yy = 26.67 + (((tickAnim - 19) / 1) * (-5-(26.67)));
        zz = 0 + (((tickAnim - 19) / 1) * (0-(0)));
        }
        else {
        xx = 0;
        yy = 0;
        zz = 0;
        }
        this.setRotateAngle(legR5_3, legR5_3.rotateAngleX + (float) Math.toRadians(xx), legR5_3.rotateAngleY + (float) Math.toRadians(yy), legR5_3.rotateAngleZ + (float) Math.toRadians(zz));




         if (tickAnim >= 0 && tickAnim < 1) {
        xx = -89.88083 + (((tickAnim - 0) / 1) * (-113.6003-(-89.88083)));
        yy = -69.86126 + (((tickAnim - 0) / 1) * (-56.45434-(-69.86126)));
        zz = -8.71234 + (((tickAnim - 0) / 1) * (29.26635-(-8.71234)));
        }
        else if (tickAnim >= 1 && tickAnim < 2) {
        xx = -113.6003 + (((tickAnim - 1) / 1) * (-101.44151-(-113.6003)));
        yy = -56.45434 + (((tickAnim - 1) / 1) * (-47.51281-(-56.45434)));
        zz = 29.26635 + (((tickAnim - 1) / 1) * (16.4932-(29.26635)));
        }
        else if (tickAnim >= 2 && tickAnim < 3) {
        xx = -101.44151 + (((tickAnim - 2) / 1) * (-72.39675-(-101.44151)));
        yy = -47.51281 + (((tickAnim - 2) / 1) * (-37.85434-(-47.51281)));
        zz = 16.4932 + (((tickAnim - 2) / 1) * (0.6717-(16.4932)));
        }
        else if (tickAnim >= 3 && tickAnim < 5) {
        xx = -72.39675 + (((tickAnim - 3) / 2) * (-44.45744-(-72.39675)));
        yy = -37.85434 + (((tickAnim - 3) / 2) * (-0.65182-(-37.85434)));
        zz = 0.6717 + (((tickAnim - 3) / 2) * (-7.47178-(0.6717)));
        }
        else if (tickAnim >= 5 && tickAnim < 16) {
        xx = -44.45744 + (((tickAnim - 5) / 11) * (-89.49251-(-44.45744)));
        yy = -0.65182 + (((tickAnim - 5) / 11) * (-38.84945-(-0.65182)));
        zz = -7.47178 + (((tickAnim - 5) / 11) * (38.0657-(-7.47178)));
        }
        else if (tickAnim >= 16 && tickAnim < 20) {
        xx = -89.49251 + (((tickAnim - 16) / 4) * (-89.88083-(-89.49251)));
        yy = -38.84945 + (((tickAnim - 16) / 4) * (-69.86126-(-38.84945)));
        zz = 38.0657 + (((tickAnim - 16) / 4) * (-8.71234-(38.0657)));
        }
        else {
        xx = 0;
        yy = 0;
        zz = 0;
        }
        this.setRotateAngle(legR4, legR4.rotateAngleX + (float) Math.toRadians(xx), legR4.rotateAngleY + (float) Math.toRadians(yy), legR4.rotateAngleZ + (float) Math.toRadians(zz));




         if (tickAnim >= 0 && tickAnim < 6) {
        xx = -2.5 + (((tickAnim - 0) / 6) * (1.35-(-2.5)));
        yy = 0 + (((tickAnim - 0) / 6) * (0-(0)));
        zz = 0 + (((tickAnim - 0) / 6) * (0-(0)));
        }
        else if (tickAnim >= 6 && tickAnim < 11) {
        xx = 1.35 + (((tickAnim - 6) / 5) * (0-(1.35)));
        yy = 0 + (((tickAnim - 6) / 5) * (2.5-(0)));
        zz = 0 + (((tickAnim - 6) / 5) * (0-(0)));
        }
        else if (tickAnim >= 11 && tickAnim < 20) {
        xx = 0 + (((tickAnim - 11) / 9) * (-2.5-(0)));
        yy = 2.5 + (((tickAnim - 11) / 9) * (0-(2.5)));
        zz = 0 + (((tickAnim - 11) / 9) * (0-(0)));
        }
        else {
        xx = 0;
        yy = 0;
        zz = 0;
        }
        this.setRotateAngle(segment1, segment1.rotateAngleX + (float) Math.toRadians(xx), segment1.rotateAngleY + (float) Math.toRadians(yy), segment1.rotateAngleZ + (float) Math.toRadians(zz));




         if (tickAnim >= 0 && tickAnim < 6) {
        xx = -2.50238 + (((tickAnim - 0) / 6) * (-7.5-(-2.50238)));
        yy = -2.49762 + (((tickAnim - 0) / 6) * (0-(-2.49762)));
        zz = 0.10912 + (((tickAnim - 0) / 6) * (0-(0.10912)));
        }
        else if (tickAnim >= 6 && tickAnim < 13) {
        xx = -7.5 + (((tickAnim - 6) / 7) * (-2.50238-(-7.5)));
        yy = 0 + (((tickAnim - 6) / 7) * (2.49762-(0)));
        zz = 0 + (((tickAnim - 6) / 7) * (-0.10912-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 20) {
        xx = -2.50238 + (((tickAnim - 13) / 7) * (-2.50238-(-2.50238)));
        yy = 2.49762 + (((tickAnim - 13) / 7) * (-2.49762-(2.49762)));
        zz = -0.10912 + (((tickAnim - 13) / 7) * (0.10912-(-0.10912)));
        }
        else {
        xx = 0;
        yy = 0;
        zz = 0;
        }
        this.setRotateAngle(segment2, segment2.rotateAngleX + (float) Math.toRadians(xx), segment2.rotateAngleY + (float) Math.toRadians(yy), segment2.rotateAngleZ + (float) Math.toRadians(zz));




         if (tickAnim >= 0 && tickAnim < 7) {
        xx = -2.50238 + (((tickAnim - 0) / 7) * (-7.50706-(-2.50238)));
        yy = -2.49762 + (((tickAnim - 0) / 7) * (2.4786-(-2.49762)));
        zz = 0.10912 + (((tickAnim - 0) / 7) * (-0.32652-(0.10912)));
        }
        else if (tickAnim >= 7 && tickAnim < 14) {
        xx = -7.50706 + (((tickAnim - 7) / 7) * (-12.19059-(-7.50706)));
        yy = 2.4786 + (((tickAnim - 7) / 7) * (1.08439-(2.4786)));
        zz = -0.32652 + (((tickAnim - 7) / 7) * (-0.14285-(-0.32652)));
        }
        else if (tickAnim >= 14 && tickAnim < 20) {
        xx = -12.19059 + (((tickAnim - 14) / 6) * (-2.50238-(-12.19059)));
        yy = 1.08439 + (((tickAnim - 14) / 6) * (-2.49762-(1.08439)));
        zz = -0.14285 + (((tickAnim - 14) / 6) * (0.10912-(-0.14285)));
        }
        else {
        xx = 0;
        yy = 0;
        zz = 0;
        }
        this.setRotateAngle(segment3, segment3.rotateAngleX + (float) Math.toRadians(xx), segment3.rotateAngleY + (float) Math.toRadians(yy), segment3.rotateAngleZ + (float) Math.toRadians(zz));




         if (tickAnim >= 0 && tickAnim < 8) {
        xx = -2.5 + (((tickAnim - 0) / 8) * (-5.00474-(-2.5)));
        yy = 0 + (((tickAnim - 0) / 8) * (2.49048-(0)));
        zz = 0 + (((tickAnim - 0) / 8) * (-0.21803-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 17) {
        xx = -5.00474 + (((tickAnim - 8) / 9) * (-15.66793-(-5.00474)));
        yy = 2.49048 + (((tickAnim - 8) / 9) * (0.66413-(2.49048)));
        zz = -0.21803 + (((tickAnim - 8) / 9) * (-0.05814-(-0.21803)));
        }
        else if (tickAnim >= 17 && tickAnim < 20) {
        xx = -15.66793 + (((tickAnim - 17) / 3) * (-2.5-(-15.66793)));
        yy = 0.66413 + (((tickAnim - 17) / 3) * (0-(0.66413)));
        zz = -0.05814 + (((tickAnim - 17) / 3) * (0-(-0.05814)));
        }
        else {
        xx = 0;
        yy = 0;
        zz = 0;
        }
        this.setRotateAngle(segment4, segment4.rotateAngleX + (float) Math.toRadians(xx), segment4.rotateAngleY + (float) Math.toRadians(yy), segment4.rotateAngleZ + (float) Math.toRadians(zz));




         if (tickAnim >= 0 && tickAnim < 9) {
        xx = -2.5 + (((tickAnim - 0) / 9) * (-5.00474-(-2.5)));
        yy = 0 + (((tickAnim - 0) / 9) * (2.49048-(0)));
        zz = 0 + (((tickAnim - 0) / 9) * (-0.21803-(0)));
        }
        else if (tickAnim >= 9 && tickAnim < 18) {
        xx = -5.00474 + (((tickAnim - 9) / 9) * (-7.88534-(-5.00474)));
        yy = 2.49048 + (((tickAnim - 9) / 9) * (0.38315-(2.49048)));
        zz = -0.21803 + (((tickAnim - 9) / 9) * (-0.03354-(-0.21803)));
        }
        else if (tickAnim >= 18 && tickAnim < 20) {
        xx = -7.88534 + (((tickAnim - 18) / 2) * (-2.5-(-7.88534)));
        yy = 0.38315 + (((tickAnim - 18) / 2) * (0-(0.38315)));
        zz = -0.03354 + (((tickAnim - 18) / 2) * (0-(-0.03354)));
        }
        else {
        xx = 0;
        yy = 0;
        zz = 0;
        }
        this.setRotateAngle(segment5, segment5.rotateAngleX + (float) Math.toRadians(xx), segment5.rotateAngleY + (float) Math.toRadians(yy), segment5.rotateAngleZ + (float) Math.toRadians(zz));




         if (tickAnim >= 0 && tickAnim < 10) {
        xx = -2.5 + (((tickAnim - 0) / 10) * (-5.00474-(-2.5)));
        yy = 0 + (((tickAnim - 0) / 10) * (-2.49048-(0)));
        zz = 0 + (((tickAnim - 0) / 10) * (0.21803-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 20) {
        xx = -5.00474 + (((tickAnim - 10) / 10) * (-2.5-(-5.00474)));
        yy = -2.49048 + (((tickAnim - 10) / 10) * (0-(-2.49048)));
        zz = 0.21803 + (((tickAnim - 10) / 10) * (0-(0.21803)));
        }
        else {
        xx = 0;
        yy = 0;
        zz = 0;
        }
        this.setRotateAngle(segment6, segment6.rotateAngleX + (float) Math.toRadians(xx), segment6.rotateAngleY + (float) Math.toRadians(yy), segment6.rotateAngleZ + (float) Math.toRadians(zz));




         if (tickAnim >= 0 && tickAnim < 11) {
        xx = 2.50238 + (((tickAnim - 0) / 11) * (5.00474-(2.50238)));
        yy = 2.49762 + (((tickAnim - 0) / 11) * (-2.49048-(2.49762)));
        zz = 0.10912 + (((tickAnim - 0) / 11) * (-0.21803-(0.10912)));
        }
        else if (tickAnim >= 11 && tickAnim < 20) {
        xx = 5.00474 + (((tickAnim - 11) / 9) * (2.50238-(5.00474)));
        yy = -2.49048 + (((tickAnim - 11) / 9) * (2.49762-(-2.49048)));
        zz = -0.21803 + (((tickAnim - 11) / 9) * (0.10912-(-0.21803)));
        }
        else {
        xx = 0;
        yy = 0;
        zz = 0;
        }
        this.setRotateAngle(segment7, segment7.rotateAngleX + (float) Math.toRadians(xx), segment7.rotateAngleY + (float) Math.toRadians(yy), segment7.rotateAngleZ + (float) Math.toRadians(zz));




         if (tickAnim >= 0 && tickAnim < 12) {
        xx = 2.5 + (((tickAnim - 0) / 12) * (5.00474-(2.5)));
        yy = 0 + (((tickAnim - 0) / 12) * (-2.49048-(0)));
        zz = 0 + (((tickAnim - 0) / 12) * (-0.21803-(0)));
        }
        else if (tickAnim >= 12 && tickAnim < 20) {
        xx = 5.00474 + (((tickAnim - 12) / 8) * (2.5-(5.00474)));
        yy = -2.49048 + (((tickAnim - 12) / 8) * (0-(-2.49048)));
        zz = -0.21803 + (((tickAnim - 12) / 8) * (0-(-0.21803)));
        }
        else {
        xx = 0;
        yy = 0;
        zz = 0;
        }
        this.setRotateAngle(segment8, segment8.rotateAngleX + (float) Math.toRadians(xx), segment8.rotateAngleY + (float) Math.toRadians(yy), segment8.rotateAngleZ + (float) Math.toRadians(zz));




         if (tickAnim >= 0 && tickAnim < 13) {
        xx = 5.00474 + (((tickAnim - 0) / 13) * (12.51153-(5.00474)));
        yy = 2.49048 + (((tickAnim - 0) / 13) * (-2.4407-(2.49048)));
        zz = 0.21803 + (((tickAnim - 0) / 13) * (-0.54143-(0.21803)));
        }
        else if (tickAnim >= 13 && tickAnim < 20) {
        xx = 12.51153 + (((tickAnim - 13) / 7) * (5.00474-(12.51153)));
        yy = -2.4407 + (((tickAnim - 13) / 7) * (2.49048-(-2.4407)));
        zz = -0.54143 + (((tickAnim - 13) / 7) * (0.21803-(-0.54143)));
        }
        else {
        xx = 0;
        yy = 0;
        zz = 0;
        }
        this.setRotateAngle(segment9, segment9.rotateAngleX + (float) Math.toRadians(xx), segment9.rotateAngleY + (float) Math.toRadians(yy), segment9.rotateAngleZ + (float) Math.toRadians(zz));




         if (tickAnim >= 0 && tickAnim < 13) {
        xx = 2.5 + (((tickAnim - 0) / 13) * (10.00933-(2.5)));
        yy = 0 + (((tickAnim - 0) / 13) * (-2.462-(0)));
        zz = 0 + (((tickAnim - 0) / 13) * (-0.43439-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 20) {
        xx = 10.00933 + (((tickAnim - 13) / 7) * (2.5-(10.00933)));
        yy = -2.462 + (((tickAnim - 13) / 7) * (0-(-2.462)));
        zz = -0.43439 + (((tickAnim - 13) / 7) * (0-(-0.43439)));
        }
        else {
        xx = 0;
        yy = 0;
        zz = 0;
        }
        this.setRotateAngle(segment10, segment10.rotateAngleX + (float) Math.toRadians(xx), segment10.rotateAngleY + (float) Math.toRadians(yy), segment10.rotateAngleZ + (float) Math.toRadians(zz));




         if (tickAnim >= 0 && tickAnim < 14) {
        xx = 2.50238 + (((tickAnim - 0) / 14) * (10.00933-(2.50238)));
        yy = 2.49762 + (((tickAnim - 0) / 14) * (-2.462-(2.49762)));
        zz = 0.10912 + (((tickAnim - 0) / 14) * (-0.43439-(0.10912)));
        }
        else if (tickAnim >= 14 && tickAnim < 20) {
        xx = 10.00933 + (((tickAnim - 14) / 6) * (2.50238-(10.00933)));
        yy = -2.462 + (((tickAnim - 14) / 6) * (2.49762-(-2.462)));
        zz = -0.43439 + (((tickAnim - 14) / 6) * (0.10912-(-0.43439)));
        }
        else {
        xx = 0;
        yy = 0;
        zz = 0;
        }
        this.setRotateAngle(segment11, segment11.rotateAngleX + (float) Math.toRadians(xx), segment11.rotateAngleY + (float) Math.toRadians(yy), segment11.rotateAngleZ + (float) Math.toRadians(zz));




         if (tickAnim >= 0 && tickAnim < 15) {
        xx = 2.50238 + (((tickAnim - 0) / 15) * (10.01153-(2.50238)));
        yy = 2.49762 + (((tickAnim - 0) / 15) * (-2.4407-(2.49762)));
        zz = 0.10912 + (((tickAnim - 0) / 15) * (-0.54143-(0.10912)));
        }
        else if (tickAnim >= 15 && tickAnim < 20) {
        xx = 10.01153 + (((tickAnim - 15) / 5) * (2.50238-(10.01153)));
        yy = -2.4407 + (((tickAnim - 15) / 5) * (2.49762-(-2.4407)));
        zz = -0.54143 + (((tickAnim - 15) / 5) * (0.10912-(-0.54143)));
        }
        else {
        xx = 0;
        yy = 0;
        zz = 0;
        }
        this.setRotateAngle(segment12, segment12.rotateAngleX + (float) Math.toRadians(xx), segment12.rotateAngleY + (float) Math.toRadians(yy), segment12.rotateAngleZ + (float) Math.toRadians(zz));




         if (tickAnim >= 0 && tickAnim < 3) {
        xx = -30 + (((tickAnim - 0) / 3) * (-40.42845-(-30)));
        yy = 0 + (((tickAnim - 0) / 3) * (4.29173-(0)));
        zz = 0 + (((tickAnim - 0) / 3) * (-38.22971-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 16) {
        xx = -40.42845 + (((tickAnim - 3) / 13) * (-69.44976-(-40.42845)));
        yy = 4.29173 + (((tickAnim - 3) / 13) * (57.72524-(4.29173)));
        zz = -38.22971 + (((tickAnim - 3) / 13) * (-66.08801-(-38.22971)));
        }
        else if (tickAnim >= 16 && tickAnim < 18) {
        xx = -69.44976 + (((tickAnim - 16) / 2) * (-55.57942-(-69.44976)));
        yy = 57.72524 + (((tickAnim - 16) / 2) * (37.0333-(57.72524)));
        zz = -66.08801 + (((tickAnim - 16) / 2) * (-26.0436-(-66.08801)));
        }
        else if (tickAnim >= 18 && tickAnim < 20) {
        xx = -55.57942 + (((tickAnim - 18) / 2) * (-30-(-55.57942)));
        yy = 37.0333 + (((tickAnim - 18) / 2) * (0-(37.0333)));
        zz = -26.0436 + (((tickAnim - 18) / 2) * (0-(-26.0436)));
        }
        else {
        xx = 0;
        yy = 0;
        zz = 0;
        }
        this.setRotateAngle(legL5, legL5.rotateAngleX + (float) Math.toRadians(xx), legL5.rotateAngleY + (float) Math.toRadians(yy), legL5.rotateAngleZ + (float) Math.toRadians(zz));




         if (tickAnim >= 0 && tickAnim < 3) {
        xx = 0 + (((tickAnim - 0) / 3) * (0-(0)));
        yy = 0 + (((tickAnim - 0) / 3) * (-22.97-(0)));
        zz = 0 + (((tickAnim - 0) / 3) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 9) {
        xx = 0 + (((tickAnim - 3) / 6) * (0-(0)));
        yy = -22.97 + (((tickAnim - 3) / 6) * (10.15-(-22.97)));
        zz = 0 + (((tickAnim - 3) / 6) * (0-(0)));
        }
        else if (tickAnim >= 9 && tickAnim < 13) {
        xx = 0 + (((tickAnim - 9) / 4) * (0-(0)));
        yy = 10.15 + (((tickAnim - 9) / 4) * (-7.67-(10.15)));
        zz = 0 + (((tickAnim - 9) / 4) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 20) {
        xx = 0 + (((tickAnim - 13) / 7) * (0-(0)));
        yy = -7.67 + (((tickAnim - 13) / 7) * (0-(-7.67)));
        zz = 0 + (((tickAnim - 13) / 7) * (0-(0)));
        }
        else {
        xx = 0;
        yy = 0;
        zz = 0;
        }
        this.setRotateAngle(legL5_2, legL5_2.rotateAngleX + (float) Math.toRadians(xx), legL5_2.rotateAngleY + (float) Math.toRadians(yy), legL5_2.rotateAngleZ + (float) Math.toRadians(zz));




         if (tickAnim >= 0 && tickAnim < 14) {
        xx = 0 + (((tickAnim - 0) / 14) * (0-(0)));
        yy = 7.5 + (((tickAnim - 0) / 14) * (27.88-(7.5)));
        zz = 0 + (((tickAnim - 0) / 14) * (0-(0)));
        }
        else if (tickAnim >= 14 && tickAnim < 17) {
        xx = 0 + (((tickAnim - 14) / 3) * (0-(0)));
        yy = 27.88 + (((tickAnim - 14) / 3) * (5-(27.88)));
        zz = 0 + (((tickAnim - 14) / 3) * (0-(0)));
        }
        else if (tickAnim >= 17 && tickAnim < 18) {
        xx = 0 + (((tickAnim - 17) / 1) * (0-(0)));
        yy = 5 + (((tickAnim - 17) / 1) * (-61.87-(5)));
        zz = 0 + (((tickAnim - 17) / 1) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 18) {
        xx = 0 + (((tickAnim - 18) / 0) * (0-(0)));
        yy = -61.87 + (((tickAnim - 18) / 0) * (-45-(-61.87)));
        zz = 0 + (((tickAnim - 18) / 0) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 19) {
        xx = 0 + (((tickAnim - 18) / 1) * (0-(0)));
        yy = -45 + (((tickAnim - 18) / 1) * (-23.12-(-45)));
        zz = 0 + (((tickAnim - 18) / 1) * (0-(0)));
        }
        else if (tickAnim >= 19 && tickAnim < 20) {
        xx = 0 + (((tickAnim - 19) / 1) * (0-(0)));
        yy = -23.12 + (((tickAnim - 19) / 1) * (7.5-(-23.12)));
        zz = 0 + (((tickAnim - 19) / 1) * (0-(0)));
        }
        else {
        xx = 0;
        yy = 0;
        zz = 0;
        }
        this.setRotateAngle(legL5_3, legL5_3.rotateAngleX + (float) Math.toRadians(xx), legL5_3.rotateAngleY + (float) Math.toRadians(yy), legL5_3.rotateAngleZ + (float) Math.toRadians(zz));




         if (tickAnim >= 0 && tickAnim < 1) {
        xx = -89.88083 + (((tickAnim - 0) / 1) * (-113.6003-(-89.88083)));
        yy = 69.86126 + (((tickAnim - 0) / 1) * (56.45434-(69.86126)));
        zz = 8.71234 + (((tickAnim - 0) / 1) * (-29.26635-(8.71234)));
        }
        else if (tickAnim >= 1 && tickAnim < 2) {
        xx = -113.6003 + (((tickAnim - 1) / 1) * (-101.44151-(-113.6003)));
        yy = 56.45434 + (((tickAnim - 1) / 1) * (47.51281-(56.45434)));
        zz = -29.26635 + (((tickAnim - 1) / 1) * (-16.4932-(-29.26635)));
        }
        else if (tickAnim >= 2 && tickAnim < 3) {
        xx = -101.44151 + (((tickAnim - 2) / 1) * (-72.39675-(-101.44151)));
        yy = 47.51281 + (((tickAnim - 2) / 1) * (37.85434-(47.51281)));
        zz = -16.4932 + (((tickAnim - 2) / 1) * (-0.6717-(-16.4932)));
        }
        else if (tickAnim >= 3 && tickAnim < 5) {
        xx = -72.39675 + (((tickAnim - 3) / 2) * (-44.45744-(-72.39675)));
        yy = 37.85434 + (((tickAnim - 3) / 2) * (0.65182-(37.85434)));
        zz = -0.6717 + (((tickAnim - 3) / 2) * (7.47178-(-0.6717)));
        }
        else if (tickAnim >= 5 && tickAnim < 16) {
        xx = -44.45744 + (((tickAnim - 5) / 11) * (-89.49251-(-44.45744)));
        yy = 0.65182 + (((tickAnim - 5) / 11) * (38.84945-(0.65182)));
        zz = 7.47178 + (((tickAnim - 5) / 11) * (-38.0657-(7.47178)));
        }
        else if (tickAnim >= 16 && tickAnim < 20) {
        xx = -89.49251 + (((tickAnim - 16) / 4) * (-89.88083-(-89.49251)));
        yy = 38.84945 + (((tickAnim - 16) / 4) * (69.86126-(38.84945)));
        zz = -38.0657 + (((tickAnim - 16) / 4) * (8.71234-(-38.0657)));
        }
        else {
        xx = 0;
        yy = 0;
        zz = 0;
        }
        this.setRotateAngle(legL4, legL4.rotateAngleX + (float) Math.toRadians(xx), legL4.rotateAngleY + (float) Math.toRadians(yy), legL4.rotateAngleZ + (float) Math.toRadians(zz));




         if (tickAnim >= 0 && tickAnim < 16) {
        xx = 5 + (((tickAnim - 0) / 16) * (10.01153-(5)));
        yy = 0 + (((tickAnim - 0) / 16) * (-2.4407-(0)));
        zz = 0 + (((tickAnim - 0) / 16) * (-0.54143-(0)));
        }
        else if (tickAnim >= 16 && tickAnim < 20) {
        xx = 10.01153 + (((tickAnim - 16) / 4) * (5-(10.01153)));
        yy = -2.4407 + (((tickAnim - 16) / 4) * (0-(-2.4407)));
        zz = -0.54143 + (((tickAnim - 16) / 4) * (0-(-0.54143)));
        }
        else {
        xx = 0;
        yy = 0;
        zz = 0;
        }
        this.setRotateAngle(telson, telson.rotateAngleX + (float) Math.toRadians(xx), telson.rotateAngleY + (float) Math.toRadians(yy), telson.rotateAngleZ + (float) Math.toRadians(zz));



        this.setRotateAngle(legL3, legL3.rotateAngleX + (float) Math.toRadians(24+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*90/0.25+70))*10), legL3.rotateAngleY + (float) Math.toRadians(40+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*90/0.25+30))*10), legL3.rotateAngleZ + (float) Math.toRadians(-25+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*90/0.25+50))*10));


        this.setRotateAngle(legL3_2, legL3_2.rotateAngleX + (float) Math.toRadians(0), legL3_2.rotateAngleY + (float) Math.toRadians(0), legL3_2.rotateAngleZ + (float) Math.toRadians(45));


        this.setRotateAngle(legR3, legR3.rotateAngleX + (float) Math.toRadians(24+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*90/0.25+70))*10), legR3.rotateAngleY + (float) Math.toRadians(-40-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*90/0.25+30))*10), legR3.rotateAngleZ + (float) Math.toRadians(25-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*90/0.25+50))*10));


        this.setRotateAngle(legR3_2, legR3_2.rotateAngleX + (float) Math.toRadians(0), legR3_2.rotateAngleY + (float) Math.toRadians(0), legR3_2.rotateAngleZ + (float) Math.toRadians(-45));


        this.setRotateAngle(legL2, legL2.rotateAngleX + (float) Math.toRadians(23.897+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*90/0.25+30))*10), legL2.rotateAngleY + (float) Math.toRadians(20+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*90/0.25+60))*10), legL2.rotateAngleZ + (float) Math.toRadians(-33.276+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*90/0.25+50))*15 ));


        this.setRotateAngle(legL2_2, legL2_2.rotateAngleX + (float) Math.toRadians(0), legL2_2.rotateAngleY + (float) Math.toRadians(0), legL2_2.rotateAngleZ + (float) Math.toRadians(22.5));


        this.setRotateAngle(legR2, legR2.rotateAngleX + (float) Math.toRadians(23.897+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*90/0.25+30))*10), legR2.rotateAngleY + (float) Math.toRadians(-20-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*90/0.25+60))*10), legR2.rotateAngleZ + (float) Math.toRadians(33.276-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*90/0.25+50))*15 ));


        this.setRotateAngle(legR2_2, legR2_2.rotateAngleX + (float) Math.toRadians(0), legR2_2.rotateAngleY + (float) Math.toRadians(0), legR2_2.rotateAngleZ + (float) Math.toRadians(-22.5));


        this.setRotateAngle(legL1, legL1.rotateAngleX + (float) Math.toRadians(-22.5+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*90/0.25+100))*5), legL1.rotateAngleY + (float) Math.toRadians(22.455+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*90/0.25+160))*5), legL1.rotateAngleZ + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*90/0.25+50))*5 ));


        this.setRotateAngle(legL1_2, legL1_2.rotateAngleX + (float) Math.toRadians(0), legL1_2.rotateAngleY + (float) Math.toRadians(-22.5), legL1_2.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(legR1, legR1.rotateAngleX + (float) Math.toRadians(-22.5+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*90/0.25+100))*5), legR1.rotateAngleY + (float) Math.toRadians(-22.455-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*90/0.25+160))*5), legR1.rotateAngleZ + (float) Math.toRadians(-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*90/0.25+50))*5));


        this.setRotateAngle(legR1_2, legR1_2.rotateAngleX + (float) Math.toRadians(0), legR1_2.rotateAngleY + (float) Math.toRadians(22.5), legR1_2.rotateAngleZ + (float) Math.toRadians(0));



         if (tickAnim >= 0 && tickAnim < 1) {
        xx = 0 + (((tickAnim - 0) / 1) * (-7.57612-(0)));
        yy = -10 + (((tickAnim - 0) / 1) * (19.91224-(-10)));
        zz = 0 + (((tickAnim - 0) / 1) * (-21.33177-(0)));
        }
        else if (tickAnim >= 1 && tickAnim < 3) {
        xx = -7.57612 + (((tickAnim - 1) / 2) * (0-(-7.57612)));
        yy = 19.91224 + (((tickAnim - 1) / 2) * (31.25-(19.91224)));
        zz = -21.33177 + (((tickAnim - 1) / 2) * (0-(-21.33177)));
        }
        else if (tickAnim >= 3 && tickAnim < 5) {
        xx = 0 + (((tickAnim - 3) / 2) * (0-(0)));
        yy = 31.25 + (((tickAnim - 3) / 2) * (27.5-(31.25)));
        zz = 0 + (((tickAnim - 3) / 2) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 20) {
        xx = 0 + (((tickAnim - 5) / 15) * (0-(0)));
        yy = 27.5 + (((tickAnim - 5) / 15) * (-10-(27.5)));
        zz = 0 + (((tickAnim - 5) / 15) * (0-(0)));
        }
        else {
        xx = 0;
        yy = 0;
        zz = 0;
        }
        this.setRotateAngle(LegR4_2, LegR4_2.rotateAngleX + (float) Math.toRadians(xx), LegR4_2.rotateAngleY + (float) Math.toRadians(yy), LegR4_2.rotateAngleZ + (float) Math.toRadians(zz));




         if (tickAnim >= 0 && tickAnim < 1) {
        xx = 0 + (((tickAnim - 0) / 1) * (0-(0)));
        yy = -2.5 + (((tickAnim - 0) / 1) * (22.5-(-2.5)));
        zz = 0 + (((tickAnim - 0) / 1) * (0-(0)));
        }
        else if (tickAnim >= 1 && tickAnim < 2) {
        xx = 0 + (((tickAnim - 1) / 1) * (0-(0)));
        yy = 22.5 + (((tickAnim - 1) / 1) * (48.75-(22.5)));
        zz = 0 + (((tickAnim - 1) / 1) * (0-(0)));
        }
        else if (tickAnim >= 2 && tickAnim < 3) {
        xx = 0 + (((tickAnim - 2) / 1) * (0-(0)));
        yy = 48.75 + (((tickAnim - 2) / 1) * (50-(48.75)));
        zz = 0 + (((tickAnim - 2) / 1) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 5) {
        xx = 0 + (((tickAnim - 3) / 2) * (0-(0)));
        yy = 50 + (((tickAnim - 3) / 2) * (22.5-(50)));
        zz = 0 + (((tickAnim - 3) / 2) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 20) {
        xx = 0 + (((tickAnim - 5) / 15) * (0-(0)));
        yy = 22.5 + (((tickAnim - 5) / 15) * (-2.5-(22.5)));
        zz = 0 + (((tickAnim - 5) / 15) * (0-(0)));
        }
        else {
        xx = 0;
        yy = 0;
        zz = 0;
        }
        this.setRotateAngle(LegR4_3, LegR4_3.rotateAngleX + (float) Math.toRadians(xx), LegR4_3.rotateAngleY + (float) Math.toRadians(yy), LegR4_3.rotateAngleZ + (float) Math.toRadians(zz));




         if (tickAnim >= 0 && tickAnim < 1) {
        xx = 0 + (((tickAnim - 0) / 1) * (-7.57612-(0)));
        yy = 10 + (((tickAnim - 0) / 1) * (-19.91224-(10)));
        zz = 0 + (((tickAnim - 0) / 1) * (21.33177-(0)));
        }
        else if (tickAnim >= 1 && tickAnim < 3) {
        xx = -7.57612 + (((tickAnim - 1) / 2) * (0-(-7.57612)));
        yy = -19.91224 + (((tickAnim - 1) / 2) * (-31.25-(-19.91224)));
        zz = 21.33177 + (((tickAnim - 1) / 2) * (0-(21.33177)));
        }
        else if (tickAnim >= 3 && tickAnim < 5) {
        xx = 0 + (((tickAnim - 3) / 2) * (0-(0)));
        yy = -31.25 + (((tickAnim - 3) / 2) * (-27.5-(-31.25)));
        zz = 0 + (((tickAnim - 3) / 2) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 20) {
        xx = 0 + (((tickAnim - 5) / 15) * (0-(0)));
        yy = -27.5 + (((tickAnim - 5) / 15) * (10-(-27.5)));
        zz = 0 + (((tickAnim - 5) / 15) * (0-(0)));
        }
        else {
        xx = 0;
        yy = 0;
        zz = 0;
        }
        this.setRotateAngle(legL4_2, legL4_2.rotateAngleX + (float) Math.toRadians(xx), legL4_2.rotateAngleY + (float) Math.toRadians(yy), legL4_2.rotateAngleZ + (float) Math.toRadians(zz));




         if (tickAnim >= 0 && tickAnim < 1) {
        xx = 0 + (((tickAnim - 0) / 1) * (0-(0)));
        yy = 2.5 + (((tickAnim - 0) / 1) * (-22.5-(2.5)));
        zz = 0 + (((tickAnim - 0) / 1) * (0-(0)));
        }
        else if (tickAnim >= 1 && tickAnim < 2) {
        xx = 0 + (((tickAnim - 1) / 1) * (0-(0)));
        yy = -22.5 + (((tickAnim - 1) / 1) * (-48.75-(-22.5)));
        zz = 0 + (((tickAnim - 1) / 1) * (0-(0)));
        }
        else if (tickAnim >= 2 && tickAnim < 3) {
        xx = 0 + (((tickAnim - 2) / 1) * (0-(0)));
        yy = -48.75 + (((tickAnim - 2) / 1) * (-50-(-48.75)));
        zz = 0 + (((tickAnim - 2) / 1) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 5) {
        xx = 0 + (((tickAnim - 3) / 2) * (0-(0)));
        yy = -50 + (((tickAnim - 3) / 2) * (-22.5-(-50)));
        zz = 0 + (((tickAnim - 3) / 2) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 20) {
        xx = 0 + (((tickAnim - 5) / 15) * (0-(0)));
        yy = -22.5 + (((tickAnim - 5) / 15) * (2.5-(-22.5)));
        zz = 0 + (((tickAnim - 5) / 15) * (0-(0)));
        }
        else {
        xx = 0;
        yy = 0;
        zz = 0;
        }
        this.setRotateAngle(legL4_3, legL4_3.rotateAngleX + (float) Math.toRadians(xx), legL4_3.rotateAngleY + (float) Math.toRadians(yy), legL4_3.rotateAngleZ + (float) Math.toRadians(zz));
    }

    public void animate(IAnimatedEntity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        EntityPrehistoricFloraHallipterus e = (EntityPrehistoricFloraHallipterus) entity;
        animator.update(entity);

        animator.setAnimation(e.SWIM_ANIMATION);
        animator.startKeyframe(e.swimTransitionLength()); //move to this keyframe over the right length
        animator.endKeyframe();
        animator.setStaticKeyframe(0);
        animator.resetKeyframe(0);

        animator.setAnimation(e.UNSWIM_ANIMATION);
        animator.startKeyframe(e.unswimTransitionLength()); //move to this keyframe over the right length
        animator.endKeyframe();
        animator.setStaticKeyframe(0);
        animator.resetKeyframe(0);

    }
}
