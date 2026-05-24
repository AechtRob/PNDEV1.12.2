package net.lepidodendron.entity.model.entity;

import net.ilexiconn.llibrary.client.model.ModelAnimator;
import net.ilexiconn.llibrary.client.model.tools.AdvancedModelRenderer;
import net.ilexiconn.llibrary.server.animation.IAnimatedEntity;
import net.lepidodendron.entity.EntityPrehistoricFloraHomarus;
import net.lepidodendron.entity.EntityPrehistoricFloraVelociraptor;
import net.lepidodendron.entity.model.ModelBasePalaeopedia;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLiving;
import net.minecraft.entity.EntityLivingBase;

public class ModelHomarus extends ModelBasePalaeopedia {
    private final AdvancedModelRenderer Body;
    private final AdvancedModelRenderer cube_r1;
    private final AdvancedModelRenderer cube_r2;
    private final AdvancedModelRenderer cube_r3;
    private final AdvancedModelRenderer cube_r4;
    private final AdvancedModelRenderer cube_r5;
    private final AdvancedModelRenderer antennule_r;
    private final AdvancedModelRenderer cube_r6;
    private final AdvancedModelRenderer antennule_l;
    private final AdvancedModelRenderer cube_r7;
    private final AdvancedModelRenderer antenna_r;
    private final AdvancedModelRenderer antenna_r2;
    private final AdvancedModelRenderer antenna_r3;
    private final AdvancedModelRenderer antenna_l;
    private final AdvancedModelRenderer antenna_l2;
    private final AdvancedModelRenderer antenna_l3;
    private final AdvancedModelRenderer Tail;
    private final AdvancedModelRenderer cube_r8;
    private final AdvancedModelRenderer cube_r9;
    private final AdvancedModelRenderer plpl;
    private final AdvancedModelRenderer cube_r10;
    private final AdvancedModelRenderer plpr;
    private final AdvancedModelRenderer Tail2;
    private final AdvancedModelRenderer cube_r11;
    private final AdvancedModelRenderer cube_r12;
    private final AdvancedModelRenderer plpl2;
    private final AdvancedModelRenderer plpr2;
    private final AdvancedModelRenderer Tail3;
    private final AdvancedModelRenderer cube_r13;
    private final AdvancedModelRenderer cube_r14;
    private final AdvancedModelRenderer plpl3;
    private final AdvancedModelRenderer plpr3;
    private final AdvancedModelRenderer Tail4;
    private final AdvancedModelRenderer cube_r15;
    private final AdvancedModelRenderer cube_r16;
    private final AdvancedModelRenderer plpl4;
    private final AdvancedModelRenderer plpr4;
    private final AdvancedModelRenderer Tail5;
    private final AdvancedModelRenderer cube_r17;
    private final AdvancedModelRenderer cube_r18;
    private final AdvancedModelRenderer cube_r19;
    private final AdvancedModelRenderer plpl5;
    private final AdvancedModelRenderer cube_r20;
    private final AdvancedModelRenderer plpr5;
    private final AdvancedModelRenderer cube_r21;
    private final AdvancedModelRenderer telson;
    private final AdvancedModelRenderer cube_r22;
    private final AdvancedModelRenderer bone23;
    private final AdvancedModelRenderer cube_r23;
    private final AdvancedModelRenderer UropodL;
    private final AdvancedModelRenderer uropodR;
    private final AdvancedModelRenderer bone7;
    private final AdvancedModelRenderer cube_r24;
    private final AdvancedModelRenderer bone18;
    private final AdvancedModelRenderer legr4;
    private final AdvancedModelRenderer legl4;
    private final AdvancedModelRenderer legr3;
    private final AdvancedModelRenderer legl3;
    private final AdvancedModelRenderer legr2;
    private final AdvancedModelRenderer legl2;
    private final AdvancedModelRenderer legr;
    private final AdvancedModelRenderer legl;
    private final AdvancedModelRenderer armr;
    private final AdvancedModelRenderer cube_r25;
    private final AdvancedModelRenderer armr2;
    private final AdvancedModelRenderer armr3;
    private final AdvancedModelRenderer cube_r26;
    private final AdvancedModelRenderer clawr;
    private final AdvancedModelRenderer arml;
    private final AdvancedModelRenderer cube_r27;
    private final AdvancedModelRenderer arml2;
    private final AdvancedModelRenderer arml3;
    private final AdvancedModelRenderer clawl;
    private final AdvancedModelRenderer EyeR;
    private final AdvancedModelRenderer EyeL;
    private final AdvancedModelRenderer mandibleR;
    private final AdvancedModelRenderer mandibleL;

    private ModelAnimator animator;


    public ModelHomarus() {
        this.textureWidth = 82;
        this.textureHeight = 71;

        this.Body = new AdvancedModelRenderer(this);
        this.Body.setRotationPoint(0.0F, 24.25F, -1.0F);
        this.setRotateAngle(Body, -0.0873F, 0.0F, 0.0F);


        this.cube_r1 = new AdvancedModelRenderer(this);
        this.cube_r1.setRotationPoint(2.5F, -7.9455F, -2.7512F);
        this.Body.addChild(cube_r1);
        this.setRotateAngle(cube_r1, -0.0444F, 0.1918F, -0.0085F);
        this.cube_r1.cubeList.add(new ModelBox(cube_r1, 67, 43, -2.0F, 0.0F, -5.0F, 2, 5, 5, -0.001F, true));

        this.cube_r2 = new AdvancedModelRenderer(this);
        this.cube_r2.setRotationPoint(-2.5F, -7.9455F, -2.7512F);
        this.Body.addChild(cube_r2);
        this.setRotateAngle(cube_r2, -0.0444F, -0.1918F, 0.0085F);
        this.cube_r2.cubeList.add(new ModelBox(cube_r2, 67, 43, 0.0F, 0.0F, -5.0F, 2, 5, 5, -0.001F, false));

        this.cube_r3 = new AdvancedModelRenderer(this);
        this.cube_r3.setRotationPoint(0.5F, -5.0F, -4.15F);
        this.Body.addChild(cube_r3);
        this.setRotateAngle(cube_r3, -0.0436F, 0.0F, 0.0F);
        this.cube_r3.cubeList.add(new ModelBox(cube_r3, 19, 1, -3.0F, -0.05F, -3.75F, 5, 0, 13, 0.0F, false));

        this.cube_r4 = new AdvancedModelRenderer(this);
        this.cube_r4.setRotationPoint(0.0F, -7.95F, -2.75F);
        this.Body.addChild(cube_r4);
        this.setRotateAngle(cube_r4, -0.0611F, 0.0F, 0.0F);
        this.cube_r4.cubeList.add(new ModelBox(cube_r4, 9, 29, -0.5F, 0.0045F, -6.9988F, 1, 1, 7, 0.0F, false));

        this.cube_r5 = new AdvancedModelRenderer(this);
        this.cube_r5.setRotationPoint(0.5F, -8.0F, -4.0F);
        this.Body.addChild(cube_r5);
        this.setRotateAngle(cube_r5, -0.0436F, 0.0F, 0.0F);
        this.cube_r5.cubeList.add(new ModelBox(cube_r5, 20, 15, -3.0F, 0.0F, -2.75F, 5, 5, 12, 0.0F, false));

        this.antennule_r = new AdvancedModelRenderer(this);
        this.antennule_r.setRotationPoint(-0.501F, -6.9763F, -8.0813F);
        this.Body.addChild(antennule_r);
        this.setRotateAngle(antennule_r, -0.2897F, 0.3461F, -0.1667F);


        this.cube_r6 = new AdvancedModelRenderer(this);
        this.cube_r6.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.antennule_r.addChild(cube_r6);
        this.setRotateAngle(cube_r6, -0.0436F, 0.0F, 0.0F);
        this.cube_r6.cubeList.add(new ModelBox(cube_r6, 20, 56, 0.251F, -1.0F, -7.25F, 0, 6, 8, 0.0F, false));

        this.antennule_l = new AdvancedModelRenderer(this);
        this.antennule_l.setRotationPoint(0.501F, -6.9763F, -8.0813F);
        this.Body.addChild(antennule_l);
        this.setRotateAngle(antennule_l, -0.2897F, -0.3461F, 0.1667F);


        this.cube_r7 = new AdvancedModelRenderer(this);
        this.cube_r7.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.antennule_l.addChild(cube_r7);
        this.setRotateAngle(cube_r7, -0.0436F, 0.0F, 0.0F);
        this.cube_r7.cubeList.add(new ModelBox(cube_r7, 20, 56, -0.251F, -1.0F, -7.25F, 0, 6, 8, 0.0F, true));

        this.antenna_r = new AdvancedModelRenderer(this);
        this.antenna_r.setRotationPoint(-1.2914F, -5.6641F, -7.7677F);
        this.Body.addChild(antenna_r);
        this.setRotateAngle(antenna_r, -0.1231F, 0.0447F, 0.3463F);
        this.antenna_r.cubeList.add(new ModelBox(antenna_r, 63, 43, -1.0F, -0.499F, -2.0F, 2, 1, 2, 0.01F, false));

        this.antenna_r2 = new AdvancedModelRenderer(this);
        this.antenna_r2.setRotationPoint(0.0F, -0.5F, -2.0F);
        this.antenna_r.addChild(antenna_r2);
        this.setRotateAngle(antenna_r2, 0.0F, 0.3927F, 0.0F);
        this.antenna_r2.cubeList.add(new ModelBox(antenna_r2, 3, 43, -0.25F, 0.001F, -2.0F, 1, 1, 2, 0.0F, false));
        this.antenna_r2.cubeList.add(new ModelBox(antenna_r2, 3, 39, -0.75F, 0.001F, -2.0F, 1, 1, 2, -0.01F, false));

        this.antenna_r3 = new AdvancedModelRenderer(this);
        this.antenna_r3.setRotationPoint(-0.2706F, 0.5F, -1.3467F);
        this.antenna_r2.addChild(antenna_r3);
        this.setRotateAngle(antenna_r3, 0.0F, 0.3927F, 0.0F);
        this.antenna_r3.cubeList.add(new ModelBox(antenna_r3, -18, 1, -14.0F, 0.001F, -19.0F, 15, 0, 19, 0.0F, false));

        this.antenna_l = new AdvancedModelRenderer(this);
        this.antenna_l.setRotationPoint(1.2914F, -5.6641F, -7.7677F);
        this.Body.addChild(antenna_l);
        this.setRotateAngle(antenna_l, -0.1231F, -0.0447F, -0.3463F);
        this.antenna_l.cubeList.add(new ModelBox(antenna_l, 63, 43, -1.0F, -0.499F, -2.0F, 2, 1, 2, 0.01F, true));

        this.antenna_l2 = new AdvancedModelRenderer(this);
        this.antenna_l2.setRotationPoint(0.0F, -0.5F, -2.0F);
        this.antenna_l.addChild(antenna_l2);
        this.setRotateAngle(antenna_l2, 0.0F, -0.3927F, 0.0F);
        this.antenna_l2.cubeList.add(new ModelBox(antenna_l2, 3, 43, -0.75F, 0.001F, -2.0F, 1, 1, 2, 0.0F, true));
        this.antenna_l2.cubeList.add(new ModelBox(antenna_l2, 3, 39, -0.25F, 0.001F, -2.0F, 1, 1, 2, -0.01F, true));

        this.antenna_l3 = new AdvancedModelRenderer(this);
        this.antenna_l3.setRotationPoint(0.2706F, 0.5F, -1.3467F);
        this.antenna_l2.addChild(antenna_l3);
        this.setRotateAngle(antenna_l3, 0.0F, -0.3927F, 0.0F);
        this.antenna_l3.cubeList.add(new ModelBox(antenna_l3, -18, 1, -1.0F, 0.001F, -19.0F, 15, 0, 19, 0.0F, true));

        this.Tail = new AdvancedModelRenderer(this);
        this.Tail.setRotationPoint(0.0F, -6.75F, 5.25F);
        this.Body.addChild(Tail);
        this.setRotateAngle(Tail, 0.0262F, 0.0F, 0.0F);
        this.Tail.cubeList.add(new ModelBox(Tail, 41, 59, -2.0F, -0.5F, -0.25F, 4, 2, 3, 0.01F, false));

        this.cube_r8 = new AdvancedModelRenderer(this);
        this.cube_r8.setRotationPoint(-2.0F, 0.75F, 2.75F);
        this.Tail.addChild(cube_r8);
        this.setRotateAngle(cube_r8, 0.0F, 0.0F, 0.2618F);
        this.cube_r8.cubeList.add(new ModelBox(cube_r8, 2, 49, 0.0F, 0.0F, -3.0F, 0, 2, 3, 0.0F, false));

        this.cube_r9 = new AdvancedModelRenderer(this);
        this.cube_r9.setRotationPoint(2.0F, 0.75F, 2.75F);
        this.Tail.addChild(cube_r9);
        this.setRotateAngle(cube_r9, 0.0F, 0.0F, -0.2618F);
        this.cube_r9.cubeList.add(new ModelBox(cube_r9, 2, 49, 0.0F, 0.0F, -3.0F, 0, 2, 3, 0.0F, true));

        this.plpl = new AdvancedModelRenderer(this);
        this.plpl.setRotationPoint(1.15F, 1.5F, 0.75F);
        this.Tail.addChild(plpl);
        this.setRotateAngle(plpl, 0.3762F, -0.1153F, 0.2835F);


        this.cube_r10 = new AdvancedModelRenderer(this);
        this.cube_r10.setRotationPoint(0.0F, 0.25F, 0.0F);
        this.plpl.addChild(cube_r10);
        this.setRotateAngle(cube_r10, 0.0F, -0.3054F, 0.0F);
        this.cube_r10.cubeList.add(new ModelBox(cube_r10, 1, 26, -0.5F, -0.25F, 0.0F, 2, 3, 0, 0.0F, false));

        this.plpr = new AdvancedModelRenderer(this);
        this.plpr.setRotationPoint(-1.15F, 1.5F, 0.75F);
        this.Tail.addChild(plpr);
        this.setRotateAngle(plpr, 0.3791F, 0.3985F, -0.1678F);
        this.plpr.cubeList.add(new ModelBox(plpr, 1, 26, -1.5F, 0.0F, 0.0F, 2, 3, 0, 0.0F, true));

        this.Tail2 = new AdvancedModelRenderer(this);
        this.Tail2.setRotationPoint(0.0F, 0.0F, 2.75F);
        this.Tail.addChild(Tail2);
        this.setRotateAngle(Tail2, 0.0873F, 0.0F, 0.0F);
        this.Tail2.cubeList.add(new ModelBox(Tail2, 27, 57, -2.0F, -0.25F, 0.0F, 4, 2, 2, 0.0F, false));

        this.cube_r11 = new AdvancedModelRenderer(this);
        this.cube_r11.setRotationPoint(-2.0F, 0.5F, 0.0F);
        this.Tail2.addChild(cube_r11);
        this.setRotateAngle(cube_r11, 0.0F, 0.0F, 0.2618F);
        this.cube_r11.cubeList.add(new ModelBox(cube_r11, 28, 37, 0.0F, 0.0F, 0.0F, 0, 2, 2, 0.0F, false));

        this.cube_r12 = new AdvancedModelRenderer(this);
        this.cube_r12.setRotationPoint(2.0F, 0.5F, 0.0F);
        this.Tail2.addChild(cube_r12);
        this.setRotateAngle(cube_r12, 0.0F, 0.0F, -0.2618F);
        this.cube_r12.cubeList.add(new ModelBox(cube_r12, 28, 37, 0.0F, 0.0F, 0.0F, 0, 2, 2, 0.0F, true));

        this.plpl2 = new AdvancedModelRenderer(this);
        this.plpl2.setRotationPoint(1.1F, 1.75F, 0.0F);
        this.Tail2.addChild(plpl2);
        this.setRotateAngle(plpl2, 0.4114F, -0.3649F, 0.0811F);
        this.plpl2.cubeList.add(new ModelBox(plpl2, 6, 26, -0.5F, 0.0F, 0.0F, 2, 3, 0, 0.0F, false));

        this.plpr2 = new AdvancedModelRenderer(this);
        this.plpr2.setRotationPoint(-1.1F, 1.75F, 0.0F);
        this.Tail2.addChild(plpr2);
        this.setRotateAngle(plpr2, 0.4114F, 0.3649F, -0.0811F);
        this.plpr2.cubeList.add(new ModelBox(plpr2, 6, 26, -1.5F, 0.0F, 0.0F, 2, 3, 0, 0.0F, true));

        this.Tail3 = new AdvancedModelRenderer(this);
        this.Tail3.setRotationPoint(0.0F, 0.125F, 2.0F);
        this.Tail2.addChild(Tail3);
        this.setRotateAngle(Tail3, 0.0436F, 0.0F, 0.0F);
        this.Tail3.cubeList.add(new ModelBox(Tail3, 1, 21, -2.0F, -0.25F, 0.0F, 4, 2, 2, 0.01F, false));

        this.cube_r13 = new AdvancedModelRenderer(this);
        this.cube_r13.setRotationPoint(-2.0F, 0.25F, -2.0F);
        this.Tail3.addChild(cube_r13);
        this.setRotateAngle(cube_r13, 0.0F, 0.0F, 0.2618F);
        this.cube_r13.cubeList.add(new ModelBox(cube_r13, 23, 37, 0.0F, 0.0F, 2.0F, 0, 2, 2, 0.0F, false));

        this.cube_r14 = new AdvancedModelRenderer(this);
        this.cube_r14.setRotationPoint(2.0F, 0.25F, -2.0F);
        this.Tail3.addChild(cube_r14);
        this.setRotateAngle(cube_r14, 0.0F, 0.0F, -0.2618F);
        this.cube_r14.cubeList.add(new ModelBox(cube_r14, 23, 37, 0.0F, 0.0F, 2.0F, 0, 2, 2, 0.0F, true));

        this.plpl3 = new AdvancedModelRenderer(this);
        this.plpl3.setRotationPoint(1.0F, 1.75F, 0.0F);
        this.Tail3.addChild(plpl3);
        this.setRotateAngle(plpl3, 0.4114F, -0.3649F, 0.0811F);
        this.plpl3.cubeList.add(new ModelBox(plpl3, 1, 30, -0.5F, 0.0F, 0.0F, 2, 3, 0, 0.0F, false));

        this.plpr3 = new AdvancedModelRenderer(this);
        this.plpr3.setRotationPoint(-1.0F, 1.75F, 0.0F);
        this.Tail3.addChild(plpr3);
        this.setRotateAngle(plpr3, 0.4114F, 0.3649F, -0.0811F);
        this.plpr3.cubeList.add(new ModelBox(plpr3, 1, 30, -1.5F, 0.0F, 0.0F, 2, 3, 0, 0.0F, true));

        this.Tail4 = new AdvancedModelRenderer(this);
        this.Tail4.setRotationPoint(0.0F, 0.0F, 2.0F);
        this.Tail3.addChild(Tail4);
        this.setRotateAngle(Tail4, -0.1745F, 0.0F, 0.0F);
        this.Tail4.cubeList.add(new ModelBox(Tail4, 69, 55, -2.0F, -0.125F, 0.0F, 4, 2, 2, 0.0F, false));

        this.cube_r15 = new AdvancedModelRenderer(this);
        this.cube_r15.setRotationPoint(-2.0F, 0.125F, -4.0F);
        this.Tail4.addChild(cube_r15);
        this.setRotateAngle(cube_r15, 0.0F, 0.0F, 0.2618F);
        this.cube_r15.cubeList.add(new ModelBox(cube_r15, 3, 53, 0.0F, 0.0F, 4.0F, 0, 2, 2, 0.0F, false));

        this.cube_r16 = new AdvancedModelRenderer(this);
        this.cube_r16.setRotationPoint(2.0F, 0.125F, -4.0F);
        this.Tail4.addChild(cube_r16);
        this.setRotateAngle(cube_r16, 0.0F, 0.0F, -0.2618F);
        this.cube_r16.cubeList.add(new ModelBox(cube_r16, 3, 53, 0.0F, 0.0F, 4.0F, 0, 2, 2, 0.0F, true));

        this.plpl4 = new AdvancedModelRenderer(this);
        this.plpl4.setRotationPoint(1.0F, 1.875F, 0.0F);
        this.Tail4.addChild(plpl4);
        this.setRotateAngle(plpl4, 0.5984F, -0.3731F, 0.0135F);
        this.plpl4.cubeList.add(new ModelBox(plpl4, 6, 30, -0.5F, 0.0F, 0.0F, 2, 3, 0, 0.0F, false));

        this.plpr4 = new AdvancedModelRenderer(this);
        this.plpr4.setRotationPoint(-1.0F, 1.875F, 0.0F);
        this.Tail4.addChild(plpr4);
        this.setRotateAngle(plpr4, 0.5984F, 0.3731F, -0.0135F);
        this.plpr4.cubeList.add(new ModelBox(plpr4, 6, 30, -1.5F, 0.0F, 0.0F, 2, 3, 0, 0.0F, true));

        this.Tail5 = new AdvancedModelRenderer(this);
        this.Tail5.setRotationPoint(0.0F, 0.125F, 2.0F);
        this.Tail4.addChild(Tail5);
        this.setRotateAngle(Tail5, -0.3927F, 0.0F, 0.0F);


        this.cube_r17 = new AdvancedModelRenderer(this);
        this.cube_r17.setRotationPoint(-2.0F, -0.25F, -7.0F);
        this.Tail5.addChild(cube_r17);
        this.setRotateAngle(cube_r17, -0.0843F, 0.0226F, 0.2608F);
        this.cube_r17.cubeList.add(new ModelBox(cube_r17, 2, 46, 0.0F, 0.0F, 7.0F, 0, 2, 3, 0.0F, false));

        this.cube_r18 = new AdvancedModelRenderer(this);
        this.cube_r18.setRotationPoint(2.0F, -0.25F, -7.0F);
        this.Tail5.addChild(cube_r18);
        this.setRotateAngle(cube_r18, -0.0843F, -0.0226F, -0.2608F);
        this.cube_r18.cubeList.add(new ModelBox(cube_r18, 2, 46, 0.0F, 0.0F, 7.0F, 0, 2, 3, 0.0F, true));

        this.cube_r19 = new AdvancedModelRenderer(this);
        this.cube_r19.setRotationPoint(0.0F, -0.25F, 0.0F);
        this.Tail5.addChild(cube_r19);
        this.setRotateAngle(cube_r19, -0.0873F, 0.0F, 0.0F);
        this.cube_r19.cubeList.add(new ModelBox(cube_r19, 49, 44, -2.0F, 0.0F, 0.0F, 4, 1, 3, 0.01F, false));

        this.plpl5 = new AdvancedModelRenderer(this);
        this.plpl5.setRotationPoint(1.0F, 1.75F, -0.175F);
        this.Tail5.addChild(plpl5);
        this.setRotateAngle(plpl5, 1.1093F, -0.3354F, -0.1673F);


        this.cube_r20 = new AdvancedModelRenderer(this);
        this.cube_r20.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.plpl5.addChild(cube_r20);
        this.setRotateAngle(cube_r20, -0.0873F, 0.0F, 0.0F);
        this.cube_r20.cubeList.add(new ModelBox(cube_r20, 11, 26, -0.5F, -0.0076F, 0.0F, 2, 3, 0, 0.0F, false));

        this.plpr5 = new AdvancedModelRenderer(this);
        this.plpr5.setRotationPoint(-1.0F, 1.75F, -0.175F);
        this.Tail5.addChild(plpr5);
        this.setRotateAngle(plpr5, 1.1093F, 0.3354F, 0.1673F);


        this.cube_r21 = new AdvancedModelRenderer(this);
        this.cube_r21.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.plpr5.addChild(cube_r21);
        this.setRotateAngle(cube_r21, -0.0873F, 0.0F, 0.0F);
        this.cube_r21.cubeList.add(new ModelBox(cube_r21, 11, 26, -1.5F, -0.0076F, 0.0F, 2, 3, 0, 0.0F, true));

        this.telson = new AdvancedModelRenderer(this);
        this.telson.setRotationPoint(0.0F, 0.0F, 2.975F);
        this.Tail5.addChild(telson);
        this.setRotateAngle(telson, -0.8727F, 0.0F, 0.0F);


        this.cube_r22 = new AdvancedModelRenderer(this);
        this.cube_r22.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.telson.addChild(cube_r22);
        this.setRotateAngle(cube_r22, -0.3491F, 0.0F, 0.0F);
        this.cube_r22.cubeList.add(new ModelBox(cube_r22, 60, 1, -2.0F, 0.0F, 0.0F, 4, 0, 4, 0.0F, false));

        this.bone23 = new AdvancedModelRenderer(this);
        this.bone23.setRotationPoint(1.25F, 0.25F, 0.025F);
        this.telson.addChild(bone23);
        this.setRotateAngle(bone23, 0.1044F, 0.5854F, 0.5748F);


        this.cube_r23 = new AdvancedModelRenderer(this);
        this.cube_r23.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.bone23.addChild(cube_r23);
        this.setRotateAngle(cube_r23, -0.3054F, 0.0F, 0.0F);
        this.cube_r23.cubeList.add(new ModelBox(cube_r23, 71, 7, -1.0F, 0.0F, 0.0F, 3, 0, 4, 0.0F, true));

        this.UropodL = new AdvancedModelRenderer(this);
        this.UropodL.setRotationPoint(1.75F, 0.35F, -0.225F);
        this.telson.addChild(UropodL);
        this.setRotateAngle(UropodL, -0.395F, 0.457F, 0.6189F);
        this.UropodL.cubeList.add(new ModelBox(UropodL, 69, 1, -1.0F, 0.0F, 0.0F, 4, 0, 4, 0.0F, true));

        this.uropodR = new AdvancedModelRenderer(this);
        this.uropodR.setRotationPoint(-1.75F, 0.35F, -0.225F);
        this.telson.addChild(uropodR);
        this.setRotateAngle(uropodR, -0.395F, -0.457F, -0.6189F);
        this.uropodR.cubeList.add(new ModelBox(uropodR, 69, 1, -3.0F, 0.0F, 0.0F, 4, 0, 4, 0.0F, false));

        this.bone7 = new AdvancedModelRenderer(this);
        this.bone7.setRotationPoint(-1.25F, 0.25F, 0.025F);
        this.telson.addChild(bone7);
        this.setRotateAngle(bone7, 0.1044F, -0.5854F, -0.5748F);


        this.cube_r24 = new AdvancedModelRenderer(this);
        this.cube_r24.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.bone7.addChild(cube_r24);
        this.setRotateAngle(cube_r24, -0.3054F, 0.0F, 0.0F);
        this.cube_r24.cubeList.add(new ModelBox(cube_r24, 71, 7, -2.0F, 0.0F, 0.0F, 3, 0, 4, 0.0F, false));

        this.bone18 = new AdvancedModelRenderer(this);
        this.bone18.setRotationPoint(-0.5F, -3.0F, -0.75F);
        this.Body.addChild(bone18);


        this.legr4 = new AdvancedModelRenderer(this);
        this.legr4.setRotationPoint(-0.3481F, -3.8307F, 3.2084F);
        this.Body.addChild(legr4);
        this.setRotateAngle(legr4, 0.6879F, 0.1414F, 0.0897F);
        this.legr4.cubeList.add(new ModelBox(legr4, 61, 28, -10.0F, -1.0F, 0.0F, 10, 6, 0, 0.0F, false));

        this.legl4 = new AdvancedModelRenderer(this);
        this.legl4.setRotationPoint(0.3481F, -3.8307F, 3.2084F);
        this.Body.addChild(legl4);
        this.setRotateAngle(legl4, 0.6879F, -0.1414F, -0.0897F);
        this.legl4.cubeList.add(new ModelBox(legl4, 61, 28, 0.0F, -1.0F, 0.0F, 10, 6, 0, 0.0F, true));

        this.legr3 = new AdvancedModelRenderer(this);
        this.legr3.setRotationPoint(-0.187F, -3.9067F, 1.3285F);
        this.Body.addChild(legr3);
        this.setRotateAngle(legr3, 0.4215F, -0.0454F, 0.0986F);
        this.legr3.cubeList.add(new ModelBox(legr3, 57, 20, -12.0F, -1.0F, 0.0F, 12, 6, 0, 0.0F, false));

        this.legl3 = new AdvancedModelRenderer(this);
        this.legl3.setRotationPoint(0.187F, -3.9067F, 1.3285F);
        this.Body.addChild(legl3);
        this.setRotateAngle(legl3, 0.4215F, 0.0454F, -0.0986F);
        this.legl3.cubeList.add(new ModelBox(legl3, 57, 20, 0.0F, -1.0F, 0.0F, 12, 6, 0, 0.0F, true));

        this.legr2 = new AdvancedModelRenderer(this);
        this.legr2.setRotationPoint(-0.4226F, -3.8595F, 0.7101F);
        this.Body.addChild(legr2);
        this.setRotateAngle(legr2, -0.5363F, -0.3702F, 0.0031F);
        this.legr2.cubeList.add(new ModelBox(legr2, 53, 13, -14.0F, -1.0F, 0.0F, 14, 6, 0, 0.0F, false));

        this.legl2 = new AdvancedModelRenderer(this);
        this.legl2.setRotationPoint(0.4226F, -3.8595F, 0.7101F);
        this.Body.addChild(legl2);
        this.setRotateAngle(legl2, -0.5363F, 0.3702F, -0.0031F);
        this.legl2.cubeList.add(new ModelBox(legl2, 53, 13, 0.0F, -1.0F, 0.0F, 14, 6, 0, 0.0F, true));

        this.legr = new AdvancedModelRenderer(this);
        this.legr.setRotationPoint(-0.5499F, -3.9621F, -2.1927F);
        this.Body.addChild(legr);
        this.setRotateAngle(legr, -0.3291F, -0.5785F, 0.0261F);
        this.legr.cubeList.add(new ModelBox(legr, 54, 36, -13.0F, -1.0F, 0.0F, 13, 6, 0, 0.0F, false));

        this.legl = new AdvancedModelRenderer(this);
        this.legl.setRotationPoint(0.5499F, -3.9621F, -2.1927F);
        this.Body.addChild(legl);
        this.setRotateAngle(legl, -0.3291F, 0.5785F, -0.0261F);
        this.legl.cubeList.add(new ModelBox(legl, 54, 36, 0.0F, -1.0F, 0.0F, 13, 6, 0, 0.0F, true));

        this.armr = new AdvancedModelRenderer(this);
        this.armr.setRotationPoint(-0.75F, -3.5F, -5.25F);
        this.Body.addChild(armr);
        this.setRotateAngle(armr, -0.5835F, 0.68F, -0.4452F);
        this.armr.cubeList.add(new ModelBox(armr, 1, 38, -1.75F, -0.5F, -8.75F, 2, 1, 9, 0.0F, false));

        this.cube_r25 = new AdvancedModelRenderer(this);
        this.cube_r25.setRotationPoint(-2.2793F, -0.5F, -8.6843F);
        this.armr.addChild(cube_r25);
        this.setRotateAngle(cube_r25, 0.0F, 0.0611F, 0.0F);
        this.cube_r25.cubeList.add(new ModelBox(cube_r25, 45, 48, 0.0F, 0.0F, 0.0F, 1, 1, 9, -0.01F, false));

        this.armr2 = new AdvancedModelRenderer(this);
        this.armr2.setRotationPoint(-1.0341F, -0.0553F, -8.1726F);
        this.armr.addChild(armr2);
        this.setRotateAngle(armr2, 0.9774F, -0.2618F, 0.0F);
        this.armr2.cubeList.add(new ModelBox(armr2, 44, 1, -1.5F, -1.0F, -2.5F, 3, 2, 3, 0.0F, false));

        this.armr3 = new AdvancedModelRenderer(this);
        this.armr3.setRotationPoint(-1.5F, 0.0F, -2.5F);
        this.armr2.addChild(armr3);
        this.setRotateAngle(armr3, 0.0F, -0.5236F, 0.0F);
        this.armr3.cubeList.add(new ModelBox(armr3, 45, 50, -0.75F, -0.5F, 0.0F, 2, 1, 1, 0.0F, false));
        this.armr3.cubeList.add(new ModelBox(armr3, 51, 61, -1.0F, -1.0F, -5.0F, 4, 2, 5, -0.01F, false));
        this.armr3.cubeList.add(new ModelBox(armr3, 32, 41, -1.0F, -0.5F, -12.0F, 2, 1, 1, 0.0F, false));
        this.armr3.cubeList.add(new ModelBox(armr3, 50, 1, -2.0F, -0.5F, -11.0F, 3, 1, 7, 0.0F, false));
        this.armr3.cubeList.add(new ModelBox(armr3, 49, 35, 0.5F, -0.5F, -7.0F, 1, 1, 1, -0.01F, false));
        this.armr3.cubeList.add(new ModelBox(armr3, 44, 38, 0.5F, -0.5F, -9.0F, 1, 1, 1, -0.01F, false));
        this.armr3.cubeList.add(new ModelBox(armr3, 44, 41, 0.5F, -0.5F, -11.0F, 1, 1, 1, -0.01F, false));

        this.cube_r26 = new AdvancedModelRenderer(this);
        this.cube_r26.setRotationPoint(-0.75F, -0.5F, -1.0F);
        this.armr3.addChild(cube_r26);
        this.setRotateAngle(cube_r26, 0.0F, 0.0F, -0.0436F);
        this.cube_r26.cubeList.add(new ModelBox(cube_r26, 1, 61, -0.25F, -0.5F, -10.0F, 2, 2, 6, -0.01F, false));

        this.clawr = new AdvancedModelRenderer(this);
        this.clawr.setRotationPoint(2.5F, 0.0F, -5.0F);
        this.armr3.addChild(clawr);
        this.setRotateAngle(clawr, 0.0F, -0.1745F, 0.0F);
        this.clawr.cubeList.add(new ModelBox(clawr, 63, 62, -1.5F, -0.5F, -6.0F, 2, 1, 7, 0.0F, false));
        this.clawr.cubeList.add(new ModelBox(clawr, 49, 41, -2.0F, -0.5F, -5.0F, 1, 1, 1, -0.01F, false));
        this.clawr.cubeList.add(new ModelBox(clawr, 49, 38, -2.0F, -0.5F, -3.0F, 1, 1, 1, -0.01F, false));

        this.arml = new AdvancedModelRenderer(this);
        this.arml.setRotationPoint(0.75F, -3.5F, -5.25F);
        this.Body.addChild(arml);
        this.setRotateAngle(arml, -0.5835F, -0.68F, 0.4452F);
        this.arml.cubeList.add(new ModelBox(arml, 15, 42, -0.25F, -0.5F, -8.75F, 2, 1, 9, 0.0F, false));

        this.cube_r27 = new AdvancedModelRenderer(this);
        this.cube_r27.setRotationPoint(2.2793F, -0.5F, -8.6843F);
        this.arml.addChild(cube_r27);
        this.setRotateAngle(cube_r27, 0.0F, -0.0611F, 0.0F);
        this.cube_r27.cubeList.add(new ModelBox(cube_r27, 1, 49, -1.0F, 0.0F, 0.0F, 1, 1, 9, -0.01F, false));

        this.arml2 = new AdvancedModelRenderer(this);
        this.arml2.setRotationPoint(1.0349F, -0.0559F, -8.2197F);
        this.arml.addChild(arml2);
        this.setRotateAngle(arml2, 0.9774F, 0.2618F, 0.0F);
        this.arml2.cubeList.add(new ModelBox(arml2, 57, 51, -1.5F, -1.0F, -2.5F, 3, 2, 3, 0.0F, false));

        this.arml3 = new AdvancedModelRenderer(this);
        this.arml3.setRotationPoint(1.5F, 0.0F, -2.5F);
        this.arml2.addChild(arml3);
        this.setRotateAngle(arml3, 0.0F, 0.5236F, 0.0F);
        this.arml3.cubeList.add(new ModelBox(arml3, 42, 35, -2.0F, -0.5F, 0.0F, 2, 1, 1, 0.0F, false));
        this.arml3.cubeList.add(new ModelBox(arml3, 37, 65, -3.0F, -0.5F, -4.0F, 4, 1, 4, 0.0F, false));
        this.arml3.cubeList.add(new ModelBox(arml3, 32, 47, -1.0F, -0.5F, -12.0F, 2, 1, 8, 0.0F, false));
        this.arml3.cubeList.add(new ModelBox(arml3, 29, 35, 1.0F, -0.5F, -11.0F, 1, 1, 10, 0.0F, false));

        this.clawl = new AdvancedModelRenderer(this);
        this.clawl.setRotationPoint(-2.5F, 0.0F, -4.0F);
        this.arml3.addChild(clawl);
        this.setRotateAngle(clawl, 0.0F, 0.1745F, 0.0F);
        this.clawl.cubeList.add(new ModelBox(clawl, 14, 54, -0.5F, -0.5F, -7.0F, 2, 1, 8, -0.01F, false));

        this.EyeR = new AdvancedModelRenderer(this);
        this.EyeR.setRotationPoint(-0.6F, -7.05F, -7.5F);
        this.Body.addChild(EyeR);
        this.setRotateAngle(EyeR, -0.1247F, 0.2964F, 0.3771F);
        this.EyeR.cubeList.add(new ModelBox(EyeR, 15, 43, -0.6568F, -0.4244F, -1.3293F, 1, 1, 2, 0.0F, false));

        this.EyeL = new AdvancedModelRenderer(this);
        this.EyeL.setRotationPoint(0.6F, -7.05F, -7.5F);
        this.Body.addChild(EyeL);
        this.setRotateAngle(EyeL, -0.1247F, -0.2964F, -0.3771F);
        this.EyeL.cubeList.add(new ModelBox(EyeL, 15, 43, -0.3432F, -0.4244F, -1.3293F, 1, 1, 2, 0.0F, true));

        this.mandibleR = new AdvancedModelRenderer(this);
        this.mandibleR.setRotationPoint(-0.3433F, -3.8094F, -4.177F);
        this.Body.addChild(mandibleR);
        this.setRotateAngle(mandibleR, -0.3634F, 0.0877F, -0.3751F);
        this.mandibleR.cubeList.add(new ModelBox(mandibleR, 19, 16, 0.0F, -1.0F, -5.0F, 0, 4, 5, 0.0F, false));

        this.mandibleL = new AdvancedModelRenderer(this);
        this.mandibleL.setRotationPoint(0.3433F, -3.8094F, -4.177F);
        this.Body.addChild(mandibleL);
        this.setRotateAngle(mandibleL, -0.3634F, -0.0877F, 0.3751F);
        this.mandibleL.cubeList.add(new ModelBox(mandibleL, 19, 16, 0.0F, -1.0F, -5.0F, 0, 4, 5, 0.0F, true));

        updateDefaultPose();
        animator = ModelAnimator.create();
    }

    @Override
    public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        animate((IAnimatedEntity) entity, f, f1, f2, f3, f4, f5);
        this.Body.render(f5);
    }
    public void renderStaticFloor(float f) {
        this.Body.render(0.01F);
        resetToDefaultPose();
    }
    public void renderStaticDisplayCase(float f) {
        this.Body.offsetZ = 0.030F;
        this.Body.render(0.01f);
        resetToDefaultPose();
    }
    @Override
    public void renderStaticBook(float f) {
        //Rotations, positions and sizing:
        this.Body.offsetY = -1.6F;
        this.Body.offsetX = -1.0F;
        this.Body.offsetZ = 2.0F;
        this.Body.rotateAngleY = (float)Math.toRadians(200);
        this.Body.rotateAngleX = (float)Math.toRadians(8);
        this.Body.rotateAngleZ = (float)Math.toRadians(-8);
        this.Body.scaleChildren = true;
        float scaler = 4.0F;
        this.Body.setScale(scaler, scaler, scaler);
        //Start of pose:
        
        //End of pose, now render the model:
        this.Body.render(f);
        //Reset rotations, positions and sizing:
        this.Body.setScale(1.0F, 1.0F, 1.0F);
        this.Body.scaleChildren = false;
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
        AdvancedModelRenderer[] fishTail = {this.Tail, this.Tail2, this.Tail3, this.Tail4, this.Tail5};
        float speed = 0.2F;
        EntityPrehistoricFloraHomarus slimon = (EntityPrehistoricFloraHomarus) e;
        this.Body.offsetZ = 0.1F;
        if (e instanceof EntityLiving && !((EntityLiving) e).isAIDisabled()) {//on land
            if(!slimon.getIsMoving()) {
                this.chainSwing(fishTail, speed, 0.05F, -0.6F, f2, 0.6F);
                this.chainWave(fishTail, speed, 0.05F, -0.6F, f2, 0.6F);
            }

            if (!e.isInWater()) {

            }
        }
    }

    @Override
    public void setLivingAnimations(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime) {
        super.setLivingAnimations(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime);
        this.resetToDefaultPose();
        EntityPrehistoricFloraHomarus ee = (EntityPrehistoricFloraHomarus) entitylivingbaseIn;
        //Swimming pose:

        if (ee.isReallyInWater()) {
            if (ee.getIsMoving()) {
                //Walk pose:
                if(ee.getIsFast()) {
                    animRunning(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime, false);
                } else {
                    animWalking(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime, false);
                }
            }
            else { //in water but not moving:
                if (ee.getAnimation() != ee.UNSWIM_ANIMATION && ee.getAnimation() != ee.SWIM_ANIMATION) {
                    //Walk static pose:
                    animIdle(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime, true);
                }
            }
        } else {
            animBeach(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime, false);
        }

        if (ee.getAnimation() == ee.ROAR_ANIMATION) {
            animThreat(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime, ee.getAnimationTick());
        } else if (ee.getAnimation() == ee.ATTACK_ANIMATION) {
            animAttack(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime, ee.getAnimationTick());
        }
    }
    

    public void animWalking(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime, boolean isStatic) {
        EntityPrehistoricFloraHomarus entity = (EntityPrehistoricFloraHomarus) entitylivingbaseIn;
        int animCycle = 110;
        double tickAnim = (entity.ticksExisted + entity.getTickOffset()) - (int) (Math.floor((double) (entity.ticksExisted + entity.getTickOffset()) / (double) animCycle) * (double) animCycle) + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;
        this.setRotateAngle(Body, Body.rotateAngleX + (float) Math.toRadians(-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*130*2))*2), Body.rotateAngleY + (float) Math.toRadians(-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*130-60))*2), Body.rotateAngleZ + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*130))*5));
        this.Body.rotationPointX = this.Body.rotationPointX + (float)(-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*130*3-60))*0.2);
        this.Body.rotationPointY = this.Body.rotationPointY - (float)(1+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*130*4))*0.2);
        this.Body.rotationPointZ = this.Body.rotationPointZ + (float)(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*130*1-60*2))*0.5);


        this.setRotateAngle(antennule_r, antennule_r.rotateAngleX + (float) Math.toRadians(-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*130*8))*5-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*130*4))*5), antennule_r.rotateAngleY + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*130*3))*5), antennule_r.rotateAngleZ + (float) Math.toRadians(-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*130*2))*5));


        this.setRotateAngle(antenna_r3, antenna_r3.rotateAngleX + (float) Math.toRadians(-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*130*2+60))*10), antenna_r3.rotateAngleY + (float) Math.toRadians(-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*130*2))*10), antenna_r3.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(antenna_l3, antenna_l3.rotateAngleX + (float) Math.toRadians(-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*130*2))*10), antenna_l3.rotateAngleY + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*130*2-60))*10), antenna_l3.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(Tail, Tail.rotateAngleX + (float) Math.toRadians(2.5), Tail.rotateAngleY + (float) Math.toRadians(0), Tail.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(plpl, plpl.rotateAngleX + (float) Math.toRadians(-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*130*3-30))*20), plpl.rotateAngleY + (float) Math.toRadians(0), plpl.rotateAngleZ + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*130*3-60-30))*10));


        this.setRotateAngle(plpr, plpr.rotateAngleX + (float) Math.toRadians(-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*130*3))*20), plpr.rotateAngleY + (float) Math.toRadians(0), plpr.rotateAngleZ + (float) Math.toRadians(-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*130*3-60))*10));


        this.setRotateAngle(Tail2, Tail2.rotateAngleX + (float) Math.toRadians(-5), Tail2.rotateAngleY + (float) Math.toRadians(0), Tail2.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(plpl2, plpl2.rotateAngleX + (float) Math.toRadians(-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*130*3-60-30))*20), plpl2.rotateAngleY + (float) Math.toRadians(0), plpl2.rotateAngleZ + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*130*3-60*2-30))*10));


        this.setRotateAngle(plpr2, plpr2.rotateAngleX + (float) Math.toRadians(-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*130*3-60))*20), plpr2.rotateAngleY + (float) Math.toRadians(0), plpr2.rotateAngleZ + (float) Math.toRadians(-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*130*3-60*2))*10));


        this.setRotateAngle(plpl3, plpl3.rotateAngleX + (float) Math.toRadians(-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*130*3-60*2-30))*20), plpl3.rotateAngleY + (float) Math.toRadians(0), plpl3.rotateAngleZ + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*130*3-60*3-30))*10));


        this.setRotateAngle(plpr3, plpr3.rotateAngleX + (float) Math.toRadians(-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*130*3-60*2))*20), plpr3.rotateAngleY + (float) Math.toRadians(0), plpr3.rotateAngleZ + (float) Math.toRadians(-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*130*3-60*3))*10));


        this.setRotateAngle(Tail4, Tail4.rotateAngleX + (float) Math.toRadians(12.5), Tail4.rotateAngleY + (float) Math.toRadians(0), Tail4.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(plpl4, plpl4.rotateAngleX + (float) Math.toRadians(-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*130*3-60*3-30))*20), plpl4.rotateAngleY + (float) Math.toRadians(0), plpl4.rotateAngleZ + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*130*3-60*4-30))*10));


        this.setRotateAngle(plpr4, plpr4.rotateAngleX + (float) Math.toRadians(-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*130*3-60*3))*20), plpr4.rotateAngleY + (float) Math.toRadians(0), plpr4.rotateAngleZ + (float) Math.toRadians(-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*130*3-60*4))*10));


        this.setRotateAngle(Tail5, Tail5.rotateAngleX + (float) Math.toRadians(17.5), Tail5.rotateAngleY + (float) Math.toRadians(0), Tail5.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(plpl5, plpl5.rotateAngleX + (float) Math.toRadians(-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*130*3-60*4-30))*20), plpl5.rotateAngleY + (float) Math.toRadians(0), plpl5.rotateAngleZ + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*130*3-60*5-30))*10));


        this.setRotateAngle(plpr5, plpr5.rotateAngleX + (float) Math.toRadians(-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*130*3-60*4))*20), plpr5.rotateAngleY + (float) Math.toRadians(0), plpr5.rotateAngleZ + (float) Math.toRadians(-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*130*3-60*5))*10));


        this.setRotateAngle(telson, telson.rotateAngleX + (float) Math.toRadians(62.5), telson.rotateAngleY + (float) Math.toRadians(0), telson.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(bone23, bone23.rotateAngleX + (float) Math.toRadians(-6.73906), bone23.rotateAngleY + (float) Math.toRadians(-8.99407), bone23.rotateAngleZ + (float) Math.toRadians(-29.31907));


        this.setRotateAngle(UropodL, UropodL.rotateAngleX + (float) Math.toRadians(-2.8922), UropodL.rotateAngleY + (float) Math.toRadians(29.60863), UropodL.rotateAngleZ + (float) Math.toRadians(-38.92189));


        this.setRotateAngle(uropodR, uropodR.rotateAngleX + (float) Math.toRadians(-2.8922), uropodR.rotateAngleY + (float) Math.toRadians(-29.60863), uropodR.rotateAngleZ + (float) Math.toRadians(38.92189));


        this.setRotateAngle(bone7, bone7.rotateAngleX + (float) Math.toRadians(-6.73906), bone7.rotateAngleY + (float) Math.toRadians(8.99407), bone7.rotateAngleZ + (float) Math.toRadians(29.31907));



        if (tickAnim >= 0 && tickAnim < 3) {
            xx = -2.39 + (((tickAnim - 0) / 3) * (-11.0877-(-2.39)));
            yy = 12.67 + (((tickAnim - 0) / 3) * (3.33419-(12.67)));
            zz = 7.35 + (((tickAnim - 0) / 3) * (17.83357-(7.35)));
        }
        else if (tickAnim >= 3 && tickAnim < 8) {
            xx = -11.0877 + (((tickAnim - 3) / 5) * (-29.91012-(-11.0877)));
            yy = 3.33419 + (((tickAnim - 3) / 5) * (5.91132-(3.33419)));
            zz = 17.83357 + (((tickAnim - 3) / 5) * (1.09526-(17.83357)));
        }
        else if (tickAnim >= 8 && tickAnim < 17) {
            xx = -29.91012 + (((tickAnim - 8) / 9) * (1.95754-(-29.91012)));
            yy = 5.91132 + (((tickAnim - 8) / 9) * (17.33282-(5.91132)));
            zz = 1.09526 + (((tickAnim - 8) / 9) * (2.10831-(1.09526)));
        }
        else if (tickAnim >= 17 && tickAnim < 22) {
            xx = 1.95754 + (((tickAnim - 17) / 5) * (-11.0877-(1.95754)));
            yy = 17.33282 + (((tickAnim - 17) / 5) * (3.33419-(17.33282)));
            zz = 2.10831 + (((tickAnim - 17) / 5) * (17.83357-(2.10831)));
        }
        else if (tickAnim >= 22 && tickAnim < 26) {
            xx = -11.0877 + (((tickAnim - 22) / 4) * (-29.91012-(-11.0877)));
            yy = 3.33419 + (((tickAnim - 22) / 4) * (5.91132-(3.33419)));
            zz = 17.83357 + (((tickAnim - 22) / 4) * (1.09526-(17.83357)));
        }
        else if (tickAnim >= 26 && tickAnim < 35) {
            xx = -29.91012 + (((tickAnim - 26) / 9) * (1.95754-(-29.91012)));
            yy = 5.91132 + (((tickAnim - 26) / 9) * (17.33282-(5.91132)));
            zz = 1.09526 + (((tickAnim - 26) / 9) * (2.10831-(1.09526)));
        }
        else if (tickAnim >= 35 && tickAnim < 40) {
            xx = 1.95754 + (((tickAnim - 35) / 5) * (-11.0877-(1.95754)));
            yy = 17.33282 + (((tickAnim - 35) / 5) * (3.33419-(17.33282)));
            zz = 2.10831 + (((tickAnim - 35) / 5) * (17.83357-(2.10831)));
        }
        else if (tickAnim >= 40 && tickAnim < 44) {
            xx = -11.0877 + (((tickAnim - 40) / 4) * (-29.91012-(-11.0877)));
            yy = 3.33419 + (((tickAnim - 40) / 4) * (5.91132-(3.33419)));
            zz = 17.83357 + (((tickAnim - 40) / 4) * (1.09526-(17.83357)));
        }
        else if (tickAnim >= 44 && tickAnim < 53) {
            xx = -29.91012 + (((tickAnim - 44) / 9) * (1.95754-(-29.91012)));
            yy = 5.91132 + (((tickAnim - 44) / 9) * (17.33282-(5.91132)));
            zz = 1.09526 + (((tickAnim - 44) / 9) * (2.10831-(1.09526)));
        }
        else if (tickAnim >= 53 && tickAnim < 58) {
            xx = 1.95754 + (((tickAnim - 53) / 5) * (-11.0877-(1.95754)));
            yy = 17.33282 + (((tickAnim - 53) / 5) * (3.33419-(17.33282)));
            zz = 2.10831 + (((tickAnim - 53) / 5) * (17.83357-(2.10831)));
        }
        else if (tickAnim >= 58 && tickAnim < 63) {
            xx = -11.0877 + (((tickAnim - 58) / 5) * (-29.91012-(-11.0877)));
            yy = 3.33419 + (((tickAnim - 58) / 5) * (5.91132-(3.33419)));
            zz = 17.83357 + (((tickAnim - 58) / 5) * (1.09526-(17.83357)));
        }
        else if (tickAnim >= 63 && tickAnim < 72) {
            xx = -29.91012 + (((tickAnim - 63) / 9) * (1.95754-(-29.91012)));
            yy = 5.91132 + (((tickAnim - 63) / 9) * (17.33282-(5.91132)));
            zz = 1.09526 + (((tickAnim - 63) / 9) * (2.10831-(1.09526)));
        }
        else if (tickAnim >= 72 && tickAnim < 77) {
            xx = 1.95754 + (((tickAnim - 72) / 5) * (-11.0877-(1.95754)));
            yy = 17.33282 + (((tickAnim - 72) / 5) * (3.33419-(17.33282)));
            zz = 2.10831 + (((tickAnim - 72) / 5) * (17.83357-(2.10831)));
        }
        else if (tickAnim >= 77 && tickAnim < 81) {
            xx = -11.0877 + (((tickAnim - 77) / 4) * (-29.91012-(-11.0877)));
            yy = 3.33419 + (((tickAnim - 77) / 4) * (5.91132-(3.33419)));
            zz = 17.83357 + (((tickAnim - 77) / 4) * (1.09526-(17.83357)));
        }
        else if (tickAnim >= 81 && tickAnim < 90) {
            xx = -29.91012 + (((tickAnim - 81) / 9) * (1.95754-(-29.91012)));
            yy = 5.91132 + (((tickAnim - 81) / 9) * (17.33282-(5.91132)));
            zz = 1.09526 + (((tickAnim - 81) / 9) * (2.10831-(1.09526)));
        }
        else if (tickAnim >= 90 && tickAnim < 95) {
            xx = 1.95754 + (((tickAnim - 90) / 5) * (-11.0877-(1.95754)));
            yy = 17.33282 + (((tickAnim - 90) / 5) * (3.33419-(17.33282)));
            zz = 2.10831 + (((tickAnim - 90) / 5) * (17.83357-(2.10831)));
        }
        else if (tickAnim >= 95 && tickAnim < 99) {
            xx = -11.0877 + (((tickAnim - 95) / 4) * (-29.91012-(-11.0877)));
            yy = 3.33419 + (((tickAnim - 95) / 4) * (5.91132-(3.33419)));
            zz = 17.83357 + (((tickAnim - 95) / 4) * (1.09526-(17.83357)));
        }
        else if (tickAnim >= 99 && tickAnim < 108) {
            xx = -29.91012 + (((tickAnim - 99) / 9) * (1.95754-(-29.91012)));
            yy = 5.91132 + (((tickAnim - 99) / 9) * (17.33282-(5.91132)));
            zz = 1.09526 + (((tickAnim - 99) / 9) * (2.10831-(1.09526)));
        }
        else if (tickAnim >= 108 && tickAnim < 110) {
            xx = 1.95754 + (((tickAnim - 108) / 2) * (-2.39-(1.95754)));
            yy = 17.33282 + (((tickAnim - 108) / 2) * (12.67-(17.33282)));
            zz = 2.10831 + (((tickAnim - 108) / 2) * (7.35-(2.10831)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(legr4, legr4.rotateAngleX + (float) Math.toRadians(xx), legr4.rotateAngleY + (float) Math.toRadians(yy), legr4.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 2) {
            xx = -13.36 + (((tickAnim - 0) / 2) * (-22.58907-(-13.36)));
            yy = 0.33 + (((tickAnim - 0) / 2) * (3.88393-(0.33)));
            zz = 4.09 + (((tickAnim - 0) / 2) * (1.87171-(4.09)));
        }
        else if (tickAnim >= 2 && tickAnim < 11) {
            xx = -22.58907 + (((tickAnim - 2) / 9) * (1.56751-(-22.58907)));
            yy = 3.88393 + (((tickAnim - 2) / 9) * (14.10965-(3.88393)));
            zz = 1.87171 + (((tickAnim - 2) / 9) * (1.37107-(1.87171)));
        }
        else if (tickAnim >= 11 && tickAnim < 16) {
            xx = 1.56751 + (((tickAnim - 11) / 5) * (0.4925-(1.56751)));
            yy = 14.10965 + (((tickAnim - 11) / 5) * (-4.99988-(14.10965)));
            zz = 1.37107 + (((tickAnim - 11) / 5) * (7.41948-(1.37107)));
        }
        else if (tickAnim >= 16 && tickAnim < 20) {
            xx = 0.4925 + (((tickAnim - 16) / 4) * (-22.58907-(0.4925)));
            yy = -4.99988 + (((tickAnim - 16) / 4) * (3.88393-(-4.99988)));
            zz = 7.41948 + (((tickAnim - 16) / 4) * (1.87171-(7.41948)));
        }
        else if (tickAnim >= 20 && tickAnim < 29) {
            xx = -22.58907 + (((tickAnim - 20) / 9) * (1.56751-(-22.58907)));
            yy = 3.88393 + (((tickAnim - 20) / 9) * (14.10965-(3.88393)));
            zz = 1.87171 + (((tickAnim - 20) / 9) * (1.37107-(1.87171)));
        }
        else if (tickAnim >= 29 && tickAnim < 34) {
            xx = 1.56751 + (((tickAnim - 29) / 5) * (0.4925-(1.56751)));
            yy = 14.10965 + (((tickAnim - 29) / 5) * (-4.99988-(14.10965)));
            zz = 1.37107 + (((tickAnim - 29) / 5) * (7.41948-(1.37107)));
        }
        else if (tickAnim >= 34 && tickAnim < 38) {
            xx = 0.4925 + (((tickAnim - 34) / 4) * (-22.58907-(0.4925)));
            yy = -4.99988 + (((tickAnim - 34) / 4) * (3.88393-(-4.99988)));
            zz = 7.41948 + (((tickAnim - 34) / 4) * (1.87171-(7.41948)));
        }
        else if (tickAnim >= 38 && tickAnim < 47) {
            xx = -22.58907 + (((tickAnim - 38) / 9) * (1.56751-(-22.58907)));
            yy = 3.88393 + (((tickAnim - 38) / 9) * (14.10965-(3.88393)));
            zz = 1.87171 + (((tickAnim - 38) / 9) * (1.37107-(1.87171)));
        }
        else if (tickAnim >= 47 && tickAnim < 52) {
            xx = 1.56751 + (((tickAnim - 47) / 5) * (0.4925-(1.56751)));
            yy = 14.10965 + (((tickAnim - 47) / 5) * (-4.99988-(14.10965)));
            zz = 1.37107 + (((tickAnim - 47) / 5) * (7.41948-(1.37107)));
        }
        else if (tickAnim >= 52 && tickAnim < 56) {
            xx = 0.4925 + (((tickAnim - 52) / 4) * (-22.58907-(0.4925)));
            yy = -4.99988 + (((tickAnim - 52) / 4) * (3.88393-(-4.99988)));
            zz = 7.41948 + (((tickAnim - 52) / 4) * (1.87171-(7.41948)));
        }
        else if (tickAnim >= 56 && tickAnim < 65) {
            xx = -22.58907 + (((tickAnim - 56) / 9) * (1.56751-(-22.58907)));
            yy = 3.88393 + (((tickAnim - 56) / 9) * (14.10965-(3.88393)));
            zz = 1.87171 + (((tickAnim - 56) / 9) * (1.37107-(1.87171)));
        }
        else if (tickAnim >= 65 && tickAnim < 70) {
            xx = 1.56751 + (((tickAnim - 65) / 5) * (0.4925-(1.56751)));
            yy = 14.10965 + (((tickAnim - 65) / 5) * (-4.99988-(14.10965)));
            zz = 1.37107 + (((tickAnim - 65) / 5) * (7.41948-(1.37107)));
        }
        else if (tickAnim >= 70 && tickAnim < 74) {
            xx = 0.4925 + (((tickAnim - 70) / 4) * (-22.58907-(0.4925)));
            yy = -4.99988 + (((tickAnim - 70) / 4) * (3.88393-(-4.99988)));
            zz = 7.41948 + (((tickAnim - 70) / 4) * (1.87171-(7.41948)));
        }
        else if (tickAnim >= 74 && tickAnim < 83) {
            xx = -22.58907 + (((tickAnim - 74) / 9) * (1.56751-(-22.58907)));
            yy = 3.88393 + (((tickAnim - 74) / 9) * (14.10965-(3.88393)));
            zz = 1.87171 + (((tickAnim - 74) / 9) * (1.37107-(1.87171)));
        }
        else if (tickAnim >= 83 && tickAnim < 88) {
            xx = 1.56751 + (((tickAnim - 83) / 5) * (0.4925-(1.56751)));
            yy = 14.10965 + (((tickAnim - 83) / 5) * (-4.99988-(14.10965)));
            zz = 1.37107 + (((tickAnim - 83) / 5) * (7.41948-(1.37107)));
        }
        else if (tickAnim >= 88 && tickAnim < 93) {
            xx = 0.4925 + (((tickAnim - 88) / 5) * (-22.58907-(0.4925)));
            yy = -4.99988 + (((tickAnim - 88) / 5) * (3.88393-(-4.99988)));
            zz = 7.41948 + (((tickAnim - 88) / 5) * (1.87171-(7.41948)));
        }
        else if (tickAnim >= 93 && tickAnim < 93) {
            xx = -22.58907 + (((tickAnim - 93) / 0) * (-22.58907-(-22.58907)));
            yy = 3.88393 + (((tickAnim - 93) / 0) * (3.88393-(3.88393)));
            zz = 1.87171 + (((tickAnim - 93) / 0) * (1.87171-(1.87171)));
        }
        else if (tickAnim >= 93 && tickAnim < 103) {
            xx = -22.58907 + (((tickAnim - 93) / 10) * (1.56751-(-22.58907)));
            yy = 3.88393 + (((tickAnim - 93) / 10) * (14.10965-(3.88393)));
            zz = 1.87171 + (((tickAnim - 93) / 10) * (1.37107-(1.87171)));
        }
        else if (tickAnim >= 103 && tickAnim < 108) {
            xx = 1.56751 + (((tickAnim - 103) / 5) * (0.4925-(1.56751)));
            yy = 14.10965 + (((tickAnim - 103) / 5) * (-4.99988-(14.10965)));
            zz = 1.37107 + (((tickAnim - 103) / 5) * (7.41948-(1.37107)));
        }
        else if (tickAnim >= 108 && tickAnim < 110) {
            xx = 0.4925 + (((tickAnim - 108) / 2) * (-13.36-(0.4925)));
            yy = -4.99988 + (((tickAnim - 108) / 2) * (0.33-(-4.99988)));
            zz = 7.41948 + (((tickAnim - 108) / 2) * (4.09-(7.41948)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(legr3, legr3.rotateAngleX + (float) Math.toRadians(xx), legr3.rotateAngleY + (float) Math.toRadians(yy), legr3.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 2) {
            xx = 14.08 + (((tickAnim - 0) / 2) * (12.05786-(14.08)));
            yy = 9.55 + (((tickAnim - 0) / 2) * (13.59186-(9.55)));
            zz = 3.49 + (((tickAnim - 0) / 2) * (3.56323-(3.49)));
        }
        else if (tickAnim >= 2 && tickAnim < 7) {
            xx = 12.05786 + (((tickAnim - 2) / 5) * (-2.44792-(12.05786)));
            yy = 13.59186 + (((tickAnim - 2) / 5) * (5.81566-(13.59186)));
            zz = 3.56323 + (((tickAnim - 2) / 5) * (16.98569-(3.56323)));
        }
        else if (tickAnim >= 7 && tickAnim < 11) {
            xx = -2.44792 + (((tickAnim - 7) / 4) * (23.15375-(-2.44792)));
            yy = 5.81566 + (((tickAnim - 7) / 4) * (-8.61177-(5.81566)));
            zz = 16.98569 + (((tickAnim - 7) / 4) * (3.15544-(16.98569)));
        }
        else if (tickAnim >= 11 && tickAnim < 20) {
            xx = 23.15375 + (((tickAnim - 11) / 9) * (12.05786-(23.15375)));
            yy = -8.61177 + (((tickAnim - 11) / 9) * (13.59186-(-8.61177)));
            zz = 3.15544 + (((tickAnim - 11) / 9) * (3.56323-(3.15544)));
        }
        else if (tickAnim >= 20 && tickAnim < 25) {
            xx = 12.05786 + (((tickAnim - 20) / 5) * (-2.44792-(12.05786)));
            yy = 13.59186 + (((tickAnim - 20) / 5) * (5.81566-(13.59186)));
            zz = 3.56323 + (((tickAnim - 20) / 5) * (16.98569-(3.56323)));
        }
        else if (tickAnim >= 25 && tickAnim < 29) {
            xx = -2.44792 + (((tickAnim - 25) / 4) * (23.15375-(-2.44792)));
            yy = 5.81566 + (((tickAnim - 25) / 4) * (-8.61177-(5.81566)));
            zz = 16.98569 + (((tickAnim - 25) / 4) * (3.15544-(16.98569)));
        }
        else if (tickAnim >= 29 && tickAnim < 38) {
            xx = 23.15375 + (((tickAnim - 29) / 9) * (12.05786-(23.15375)));
            yy = -8.61177 + (((tickAnim - 29) / 9) * (13.59186-(-8.61177)));
            zz = 3.15544 + (((tickAnim - 29) / 9) * (3.56323-(3.15544)));
        }
        else if (tickAnim >= 38 && tickAnim < 43) {
            xx = 12.05786 + (((tickAnim - 38) / 5) * (-2.44792-(12.05786)));
            yy = 13.59186 + (((tickAnim - 38) / 5) * (5.81566-(13.59186)));
            zz = 3.56323 + (((tickAnim - 38) / 5) * (16.98569-(3.56323)));
        }
        else if (tickAnim >= 43 && tickAnim < 47) {
            xx = -2.44792 + (((tickAnim - 43) / 4) * (23.15375-(-2.44792)));
            yy = 5.81566 + (((tickAnim - 43) / 4) * (-8.61177-(5.81566)));
            zz = 16.98569 + (((tickAnim - 43) / 4) * (3.15544-(16.98569)));
        }
        else if (tickAnim >= 47 && tickAnim < 56) {
            xx = 23.15375 + (((tickAnim - 47) / 9) * (12.05786-(23.15375)));
            yy = -8.61177 + (((tickAnim - 47) / 9) * (13.59186-(-8.61177)));
            zz = 3.15544 + (((tickAnim - 47) / 9) * (3.56323-(3.15544)));
        }
        else if (tickAnim >= 56 && tickAnim < 61) {
            xx = 12.05786 + (((tickAnim - 56) / 5) * (-2.44792-(12.05786)));
            yy = 13.59186 + (((tickAnim - 56) / 5) * (5.81566-(13.59186)));
            zz = 3.56323 + (((tickAnim - 56) / 5) * (16.98569-(3.56323)));
        }
        else if (tickAnim >= 61 && tickAnim < 65) {
            xx = -2.44792 + (((tickAnim - 61) / 4) * (23.15375-(-2.44792)));
            yy = 5.81566 + (((tickAnim - 61) / 4) * (-8.61177-(5.81566)));
            zz = 16.98569 + (((tickAnim - 61) / 4) * (3.15544-(16.98569)));
        }
        else if (tickAnim >= 65 && tickAnim < 74) {
            xx = 23.15375 + (((tickAnim - 65) / 9) * (12.05786-(23.15375)));
            yy = -8.61177 + (((tickAnim - 65) / 9) * (13.59186-(-8.61177)));
            zz = 3.15544 + (((tickAnim - 65) / 9) * (3.56323-(3.15544)));
        }
        else if (tickAnim >= 74 && tickAnim < 79) {
            xx = 12.05786 + (((tickAnim - 74) / 5) * (-2.44792-(12.05786)));
            yy = 13.59186 + (((tickAnim - 74) / 5) * (5.81566-(13.59186)));
            zz = 3.56323 + (((tickAnim - 74) / 5) * (16.98569-(3.56323)));
        }
        else if (tickAnim >= 79 && tickAnim < 83) {
            xx = -2.44792 + (((tickAnim - 79) / 4) * (23.15375-(-2.44792)));
            yy = 5.81566 + (((tickAnim - 79) / 4) * (-8.61177-(5.81566)));
            zz = 16.98569 + (((tickAnim - 79) / 4) * (3.15544-(16.98569)));
        }
        else if (tickAnim >= 83 && tickAnim < 93) {
            xx = 23.15375 + (((tickAnim - 83) / 10) * (12.05786-(23.15375)));
            yy = -8.61177 + (((tickAnim - 83) / 10) * (13.59186-(-8.61177)));
            zz = 3.15544 + (((tickAnim - 83) / 10) * (3.56323-(3.15544)));
        }
        else if (tickAnim >= 93 && tickAnim < 93) {
            xx = 12.05786 + (((tickAnim - 93) / 0) * (12.05786-(12.05786)));
            yy = 13.59186 + (((tickAnim - 93) / 0) * (13.59186-(13.59186)));
            zz = 3.56323 + (((tickAnim - 93) / 0) * (3.56323-(3.56323)));
        }
        else if (tickAnim >= 93 && tickAnim < 98) {
            xx = 12.05786 + (((tickAnim - 93) / 5) * (-2.44792-(12.05786)));
            yy = 13.59186 + (((tickAnim - 93) / 5) * (5.81566-(13.59186)));
            zz = 3.56323 + (((tickAnim - 93) / 5) * (16.98569-(3.56323)));
        }
        else if (tickAnim >= 98 && tickAnim < 103) {
            xx = -2.44792 + (((tickAnim - 98) / 5) * (23.15375-(-2.44792)));
            yy = 5.81566 + (((tickAnim - 98) / 5) * (-8.61177-(5.81566)));
            zz = 16.98569 + (((tickAnim - 98) / 5) * (3.15544-(16.98569)));
        }
        else if (tickAnim >= 103 && tickAnim < 110) {
            xx = 23.15375 + (((tickAnim - 103) / 7) * (14.08-(23.15375)));
            yy = -8.61177 + (((tickAnim - 103) / 7) * (9.55-(-8.61177)));
            zz = 3.15544 + (((tickAnim - 103) / 7) * (3.49-(3.15544)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(legr2, legr2.rotateAngleX + (float) Math.toRadians(xx), legr2.rotateAngleY + (float) Math.toRadians(yy), legr2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 9) {
            xx = 23.15375 + (((tickAnim - 0) / 9) * (12.05786-(23.15375)));
            yy = 8.61177 + (((tickAnim - 0) / 9) * (-13.59186-(8.61177)));
            zz = -3.15544 + (((tickAnim - 0) / 9) * (-3.56323-(-3.15544)));
        }
        else if (tickAnim >= 9 && tickAnim < 14) {
            xx = 12.05786 + (((tickAnim - 9) / 5) * (-2.44792-(12.05786)));
            yy = -13.59186 + (((tickAnim - 9) / 5) * (-5.81566-(-13.59186)));
            zz = -3.56323 + (((tickAnim - 9) / 5) * (-16.98569-(-3.56323)));
        }
        else if (tickAnim >= 14 && tickAnim < 18) {
            xx = -2.44792 + (((tickAnim - 14) / 4) * (23.15375-(-2.44792)));
            yy = -5.81566 + (((tickAnim - 14) / 4) * (8.61177-(-5.81566)));
            zz = -16.98569 + (((tickAnim - 14) / 4) * (-3.15544-(-16.98569)));
        }
        else if (tickAnim >= 18 && tickAnim < 28) {
            xx = 23.15375 + (((tickAnim - 18) / 10) * (12.05786-(23.15375)));
            yy = 8.61177 + (((tickAnim - 18) / 10) * (-13.59186-(8.61177)));
            zz = -3.15544 + (((tickAnim - 18) / 10) * (-3.56323-(-3.15544)));
        }
        else if (tickAnim >= 28 && tickAnim < 32) {
            xx = 12.05786 + (((tickAnim - 28) / 4) * (-2.44792-(12.05786)));
            yy = -13.59186 + (((tickAnim - 28) / 4) * (-5.81566-(-13.59186)));
            zz = -3.56323 + (((tickAnim - 28) / 4) * (-16.98569-(-3.56323)));
        }
        else if (tickAnim >= 32 && tickAnim < 36) {
            xx = -2.44792 + (((tickAnim - 32) / 4) * (23.15375-(-2.44792)));
            yy = -5.81566 + (((tickAnim - 32) / 4) * (8.61177-(-5.81566)));
            zz = -16.98569 + (((tickAnim - 32) / 4) * (-3.15544-(-16.98569)));
        }
        else if (tickAnim >= 36 && tickAnim < 45) {
            xx = 23.15375 + (((tickAnim - 36) / 9) * (12.05786-(23.15375)));
            yy = 8.61177 + (((tickAnim - 36) / 9) * (-13.59186-(8.61177)));
            zz = -3.15544 + (((tickAnim - 36) / 9) * (-3.56323-(-3.15544)));
        }
        else if (tickAnim >= 45 && tickAnim < 50) {
            xx = 12.05786 + (((tickAnim - 45) / 5) * (-2.44792-(12.05786)));
            yy = -13.59186 + (((tickAnim - 45) / 5) * (-5.81566-(-13.59186)));
            zz = -3.56323 + (((tickAnim - 45) / 5) * (-16.98569-(-3.56323)));
        }
        else if (tickAnim >= 50 && tickAnim < 54) {
            xx = -2.44792 + (((tickAnim - 50) / 4) * (23.15375-(-2.44792)));
            yy = -5.81566 + (((tickAnim - 50) / 4) * (8.61177-(-5.81566)));
            zz = -16.98569 + (((tickAnim - 50) / 4) * (-3.15544-(-16.98569)));
        }
        else if (tickAnim >= 54 && tickAnim < 63) {
            xx = 23.15375 + (((tickAnim - 54) / 9) * (12.05786-(23.15375)));
            yy = 8.61177 + (((tickAnim - 54) / 9) * (-13.59186-(8.61177)));
            zz = -3.15544 + (((tickAnim - 54) / 9) * (-3.56323-(-3.15544)));
        }
        else if (tickAnim >= 63 && tickAnim < 68) {
            xx = 12.05786 + (((tickAnim - 63) / 5) * (-2.44792-(12.05786)));
            yy = -13.59186 + (((tickAnim - 63) / 5) * (-5.81566-(-13.59186)));
            zz = -3.56323 + (((tickAnim - 63) / 5) * (-16.98569-(-3.56323)));
        }
        else if (tickAnim >= 68 && tickAnim < 73) {
            xx = -2.44792 + (((tickAnim - 68) / 5) * (23.15375-(-2.44792)));
            yy = -5.81566 + (((tickAnim - 68) / 5) * (8.61177-(-5.81566)));
            zz = -16.98569 + (((tickAnim - 68) / 5) * (-3.15544-(-16.98569)));
        }
        else if (tickAnim >= 73 && tickAnim < 82) {
            xx = 23.15375 + (((tickAnim - 73) / 9) * (12.05786-(23.15375)));
            yy = 8.61177 + (((tickAnim - 73) / 9) * (-13.59186-(8.61177)));
            zz = -3.15544 + (((tickAnim - 73) / 9) * (-3.56323-(-3.15544)));
        }
        else if (tickAnim >= 82 && tickAnim < 83) {
            xx = 12.05786 + (((tickAnim - 82) / 1) * (12.05786-(12.05786)));
            yy = -13.59186 + (((tickAnim - 82) / 1) * (-13.59186-(-13.59186)));
            zz = -3.56323 + (((tickAnim - 82) / 1) * (-3.56323-(-3.56323)));
        }
        else if (tickAnim >= 83 && tickAnim < 88) {
            xx = 12.05786 + (((tickAnim - 83) / 5) * (-2.44792-(12.05786)));
            yy = -13.59186 + (((tickAnim - 83) / 5) * (-5.81566-(-13.59186)));
            zz = -3.56323 + (((tickAnim - 83) / 5) * (-16.98569-(-3.56323)));
        }
        else if (tickAnim >= 88 && tickAnim < 92) {
            xx = -2.44792 + (((tickAnim - 88) / 4) * (23.15375-(-2.44792)));
            yy = -5.81566 + (((tickAnim - 88) / 4) * (8.61177-(-5.81566)));
            zz = -16.98569 + (((tickAnim - 88) / 4) * (-3.15544-(-16.98569)));
        }
        else if (tickAnim >= 92 && tickAnim < 101) {
            xx = 23.15375 + (((tickAnim - 92) / 9) * (12.05786-(23.15375)));
            yy = 8.61177 + (((tickAnim - 92) / 9) * (-13.59186-(8.61177)));
            zz = -3.15544 + (((tickAnim - 92) / 9) * (-3.56323-(-3.15544)));
        }
        else if (tickAnim >= 101 && tickAnim < 106) {
            xx = 12.05786 + (((tickAnim - 101) / 5) * (-2.44792-(12.05786)));
            yy = -13.59186 + (((tickAnim - 101) / 5) * (-5.81566-(-13.59186)));
            zz = -3.56323 + (((tickAnim - 101) / 5) * (-16.98569-(-3.56323)));
        }
        else if (tickAnim >= 106 && tickAnim < 110) {
            xx = -2.44792 + (((tickAnim - 106) / 4) * (23.15375-(-2.44792)));
            yy = -5.81566 + (((tickAnim - 106) / 4) * (8.61177-(-5.81566)));
            zz = -16.98569 + (((tickAnim - 106) / 4) * (-3.15544-(-16.98569)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(legl2, legl2.rotateAngleX + (float) Math.toRadians(xx), legl2.rotateAngleY + (float) Math.toRadians(yy), legl2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 8) {
            xx = -19.27 + (((tickAnim - 0) / 8) * (-0.06371-(-19.27)));
            yy = -4.14 + (((tickAnim - 0) / 8) * (10.45978-(-4.14)));
            zz = -5.54 + (((tickAnim - 0) / 8) * (0.94828-(-5.54)));
        }
        else if (tickAnim >= 8 && tickAnim < 13) {
            xx = -0.06371 + (((tickAnim - 8) / 5) * (-8.09569-(-0.06371)));
            yy = 10.45978 + (((tickAnim - 8) / 5) * (0.70749-(10.45978)));
            zz = 0.94828 + (((tickAnim - 8) / 5) * (14.90291-(0.94828)));
        }
        else if (tickAnim >= 13 && tickAnim < 18) {
            xx = -8.09569 + (((tickAnim - 13) / 5) * (-21.18778-(-8.09569)));
            yy = 0.70749 + (((tickAnim - 13) / 5) * (-5.60505-(0.70749)));
            zz = 14.90291 + (((tickAnim - 13) / 5) * (-6.18413-(14.90291)));
        }
        else if (tickAnim >= 18 && tickAnim < 27) {
            xx = -21.18778 + (((tickAnim - 18) / 9) * (-0.06371-(-21.18778)));
            yy = -5.60505 + (((tickAnim - 18) / 9) * (10.45978-(-5.60505)));
            zz = -6.18413 + (((tickAnim - 18) / 9) * (0.94828-(-6.18413)));
        }
        else if (tickAnim >= 27 && tickAnim < 32) {
            xx = -0.06371 + (((tickAnim - 27) / 5) * (-8.09569-(-0.06371)));
            yy = 10.45978 + (((tickAnim - 27) / 5) * (0.70749-(10.45978)));
            zz = 0.94828 + (((tickAnim - 27) / 5) * (14.90291-(0.94828)));
        }
        else if (tickAnim >= 32 && tickAnim < 36) {
            xx = -8.09569 + (((tickAnim - 32) / 4) * (-21.18778-(-8.09569)));
            yy = 0.70749 + (((tickAnim - 32) / 4) * (-5.60505-(0.70749)));
            zz = 14.90291 + (((tickAnim - 32) / 4) * (-6.18413-(14.90291)));
        }
        else if (tickAnim >= 36 && tickAnim < 45) {
            xx = -21.18778 + (((tickAnim - 36) / 9) * (-0.06371-(-21.18778)));
            yy = -5.60505 + (((tickAnim - 36) / 9) * (10.45978-(-5.60505)));
            zz = -6.18413 + (((tickAnim - 36) / 9) * (0.94828-(-6.18413)));
        }
        else if (tickAnim >= 45 && tickAnim < 50) {
            xx = -0.06371 + (((tickAnim - 45) / 5) * (-8.09569-(-0.06371)));
            yy = 10.45978 + (((tickAnim - 45) / 5) * (0.70749-(10.45978)));
            zz = 0.94828 + (((tickAnim - 45) / 5) * (14.90291-(0.94828)));
        }
        else if (tickAnim >= 50 && tickAnim < 54) {
            xx = -8.09569 + (((tickAnim - 50) / 4) * (-21.18778-(-8.09569)));
            yy = 0.70749 + (((tickAnim - 50) / 4) * (-5.60505-(0.70749)));
            zz = 14.90291 + (((tickAnim - 50) / 4) * (-6.18413-(14.90291)));
        }
        else if (tickAnim >= 54 && tickAnim < 63) {
            xx = -21.18778 + (((tickAnim - 54) / 9) * (-0.06371-(-21.18778)));
            yy = -5.60505 + (((tickAnim - 54) / 9) * (10.45978-(-5.60505)));
            zz = -6.18413 + (((tickAnim - 54) / 9) * (0.94828-(-6.18413)));
        }
        else if (tickAnim >= 63 && tickAnim < 68) {
            xx = -0.06371 + (((tickAnim - 63) / 5) * (-8.09569-(-0.06371)));
            yy = 10.45978 + (((tickAnim - 63) / 5) * (0.70749-(10.45978)));
            zz = 0.94828 + (((tickAnim - 63) / 5) * (14.90291-(0.94828)));
        }
        else if (tickAnim >= 68 && tickAnim < 73) {
            xx = -8.09569 + (((tickAnim - 68) / 5) * (-21.18778-(-8.09569)));
            yy = 0.70749 + (((tickAnim - 68) / 5) * (-5.60505-(0.70749)));
            zz = 14.90291 + (((tickAnim - 68) / 5) * (-6.18413-(14.90291)));
        }
        else if (tickAnim >= 73 && tickAnim < 82) {
            xx = -21.18778 + (((tickAnim - 73) / 9) * (-0.06371-(-21.18778)));
            yy = -5.60505 + (((tickAnim - 73) / 9) * (10.45978-(-5.60505)));
            zz = -6.18413 + (((tickAnim - 73) / 9) * (0.94828-(-6.18413)));
        }
        else if (tickAnim >= 82 && tickAnim < 87) {
            xx = -0.06371 + (((tickAnim - 82) / 5) * (-8.09569-(-0.06371)));
            yy = 10.45978 + (((tickAnim - 82) / 5) * (0.70749-(10.45978)));
            zz = 0.94828 + (((tickAnim - 82) / 5) * (14.90291-(0.94828)));
        }
        else if (tickAnim >= 87 && tickAnim < 91) {
            xx = -8.09569 + (((tickAnim - 87) / 4) * (-21.18778-(-8.09569)));
            yy = 0.70749 + (((tickAnim - 87) / 4) * (-5.60505-(0.70749)));
            zz = 14.90291 + (((tickAnim - 87) / 4) * (-6.18413-(14.90291)));
        }
        else if (tickAnim >= 91 && tickAnim < 100) {
            xx = -21.18778 + (((tickAnim - 91) / 9) * (-0.06371-(-21.18778)));
            yy = -5.60505 + (((tickAnim - 91) / 9) * (10.45978-(-5.60505)));
            zz = -6.18413 + (((tickAnim - 91) / 9) * (0.94828-(-6.18413)));
        }
        else if (tickAnim >= 100 && tickAnim < 105) {
            xx = -0.06371 + (((tickAnim - 100) / 5) * (-8.09569-(-0.06371)));
            yy = 10.45978 + (((tickAnim - 100) / 5) * (0.70749-(10.45978)));
            zz = 0.94828 + (((tickAnim - 100) / 5) * (14.90291-(0.94828)));
        }
        else if (tickAnim >= 105 && tickAnim < 109) {
            xx = -8.09569 + (((tickAnim - 105) / 4) * (-21.18778-(-8.09569)));
            yy = 0.70749 + (((tickAnim - 105) / 4) * (-5.60505-(0.70749)));
            zz = 14.90291 + (((tickAnim - 105) / 4) * (-6.18413-(14.90291)));
        }
        else if (tickAnim >= 109 && tickAnim < 110) {
            xx = -21.18778 + (((tickAnim - 109) / 1) * (-19.27-(-21.18778)));
            yy = -5.60505 + (((tickAnim - 109) / 1) * (-4.14-(-5.60505)));
            zz = -6.18413 + (((tickAnim - 109) / 1) * (-5.54-(-6.18413)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(legr, legr.rotateAngleX + (float) Math.toRadians(xx), legr.rotateAngleY + (float) Math.toRadians(yy), legr.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 3) {
            xx = -4.08 + (((tickAnim - 0) / 3) * (-8.09569-(-4.08)));
            yy = -5.58 + (((tickAnim - 0) / 3) * (-0.70749-(-5.58)));
            zz = -7.93 + (((tickAnim - 0) / 3) * (-14.90291-(-7.93)));
        }
        else if (tickAnim >= 3 && tickAnim < 7) {
            xx = -8.09569 + (((tickAnim - 3) / 4) * (-21.18778-(-8.09569)));
            yy = -0.70749 + (((tickAnim - 3) / 4) * (5.60505-(-0.70749)));
            zz = -14.90291 + (((tickAnim - 3) / 4) * (6.18413-(-14.90291)));
        }
        else if (tickAnim >= 7 && tickAnim < 16) {
            xx = -21.18778 + (((tickAnim - 7) / 9) * (-0.06371-(-21.18778)));
            yy = 5.60505 + (((tickAnim - 7) / 9) * (-10.45978-(5.60505)));
            zz = 6.18413 + (((tickAnim - 7) / 9) * (-0.94828-(6.18413)));
        }
        else if (tickAnim >= 16 && tickAnim < 21) {
            xx = -0.06371 + (((tickAnim - 16) / 5) * (-8.09569-(-0.06371)));
            yy = -10.45978 + (((tickAnim - 16) / 5) * (-0.70749-(-10.45978)));
            zz = -0.94828 + (((tickAnim - 16) / 5) * (-14.90291-(-0.94828)));
        }
        else if (tickAnim >= 21 && tickAnim < 25) {
            xx = -8.09569 + (((tickAnim - 21) / 4) * (-21.18778-(-8.09569)));
            yy = -0.70749 + (((tickAnim - 21) / 4) * (5.60505-(-0.70749)));
            zz = -14.90291 + (((tickAnim - 21) / 4) * (6.18413-(-14.90291)));
        }
        else if (tickAnim >= 25 && tickAnim < 34) {
            xx = -21.18778 + (((tickAnim - 25) / 9) * (-0.06371-(-21.18778)));
            yy = 5.60505 + (((tickAnim - 25) / 9) * (-10.45978-(5.60505)));
            zz = 6.18413 + (((tickAnim - 25) / 9) * (-0.94828-(6.18413)));
        }
        else if (tickAnim >= 34 && tickAnim < 39) {
            xx = -0.06371 + (((tickAnim - 34) / 5) * (-8.09569-(-0.06371)));
            yy = -10.45978 + (((tickAnim - 34) / 5) * (-0.70749-(-10.45978)));
            zz = -0.94828 + (((tickAnim - 34) / 5) * (-14.90291-(-0.94828)));
        }
        else if (tickAnim >= 39 && tickAnim < 43) {
            xx = -8.09569 + (((tickAnim - 39) / 4) * (-21.18778-(-8.09569)));
            yy = -0.70749 + (((tickAnim - 39) / 4) * (5.60505-(-0.70749)));
            zz = -14.90291 + (((tickAnim - 39) / 4) * (6.18413-(-14.90291)));
        }
        else if (tickAnim >= 43 && tickAnim < 53) {
            xx = -21.18778 + (((tickAnim - 43) / 10) * (-0.06371-(-21.18778)));
            yy = 5.60505 + (((tickAnim - 43) / 10) * (-10.45978-(5.60505)));
            zz = 6.18413 + (((tickAnim - 43) / 10) * (-0.94828-(6.18413)));
        }
        else if (tickAnim >= 53 && tickAnim < 58) {
            xx = -0.06371 + (((tickAnim - 53) / 5) * (-8.09569-(-0.06371)));
            yy = -10.45978 + (((tickAnim - 53) / 5) * (-0.70749-(-10.45978)));
            zz = -0.94828 + (((tickAnim - 53) / 5) * (-14.90291-(-0.94828)));
        }
        else if (tickAnim >= 58 && tickAnim < 62) {
            xx = -8.09569 + (((tickAnim - 58) / 4) * (-21.18778-(-8.09569)));
            yy = -0.70749 + (((tickAnim - 58) / 4) * (5.60505-(-0.70749)));
            zz = -14.90291 + (((tickAnim - 58) / 4) * (6.18413-(-14.90291)));
        }
        else if (tickAnim >= 62 && tickAnim < 71) {
            xx = -21.18778 + (((tickAnim - 62) / 9) * (-0.06371-(-21.18778)));
            yy = 5.60505 + (((tickAnim - 62) / 9) * (-10.45978-(5.60505)));
            zz = 6.18413 + (((tickAnim - 62) / 9) * (-0.94828-(6.18413)));
        }
        else if (tickAnim >= 71 && tickAnim < 76) {
            xx = -0.06371 + (((tickAnim - 71) / 5) * (-8.09569-(-0.06371)));
            yy = -10.45978 + (((tickAnim - 71) / 5) * (-0.70749-(-10.45978)));
            zz = -0.94828 + (((tickAnim - 71) / 5) * (-14.90291-(-0.94828)));
        }
        else if (tickAnim >= 76 && tickAnim < 80) {
            xx = -8.09569 + (((tickAnim - 76) / 4) * (-21.18778-(-8.09569)));
            yy = -0.70749 + (((tickAnim - 76) / 4) * (5.60505-(-0.70749)));
            zz = -14.90291 + (((tickAnim - 76) / 4) * (6.18413-(-14.90291)));
        }
        else if (tickAnim >= 80 && tickAnim < 89) {
            xx = -21.18778 + (((tickAnim - 80) / 9) * (-0.06371-(-21.18778)));
            yy = 5.60505 + (((tickAnim - 80) / 9) * (-10.45978-(5.60505)));
            zz = 6.18413 + (((tickAnim - 80) / 9) * (-0.94828-(6.18413)));
        }
        else if (tickAnim >= 89 && tickAnim < 94) {
            xx = -0.06371 + (((tickAnim - 89) / 5) * (-8.09569-(-0.06371)));
            yy = -10.45978 + (((tickAnim - 89) / 5) * (-0.70749-(-10.45978)));
            zz = -0.94828 + (((tickAnim - 89) / 5) * (-14.90291-(-0.94828)));
        }
        else if (tickAnim >= 94 && tickAnim < 98) {
            xx = -8.09569 + (((tickAnim - 94) / 4) * (-21.18778-(-8.09569)));
            yy = -0.70749 + (((tickAnim - 94) / 4) * (5.60505-(-0.70749)));
            zz = -14.90291 + (((tickAnim - 94) / 4) * (6.18413-(-14.90291)));
        }
        else if (tickAnim >= 98 && tickAnim < 108) {
            xx = -21.18778 + (((tickAnim - 98) / 10) * (-0.06371-(-21.18778)));
            yy = 5.60505 + (((tickAnim - 98) / 10) * (-10.45978-(5.60505)));
            zz = 6.18413 + (((tickAnim - 98) / 10) * (-0.94828-(6.18413)));
        }
        else if (tickAnim >= 108 && tickAnim < 110) {
            xx = -0.06371 + (((tickAnim - 108) / 2) * (-4.08-(-0.06371)));
            yy = -10.45978 + (((tickAnim - 108) / 2) * (-5.58-(-10.45978)));
            zz = -0.94828 + (((tickAnim - 108) / 2) * (-7.93-(-0.94828)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(legl, legl.rotateAngleX + (float) Math.toRadians(xx), legl.rotateAngleY + (float) Math.toRadians(yy), legl.rotateAngleZ + (float) Math.toRadians(zz));



        this.setRotateAngle(armr, armr.rotateAngleX + (float) Math.toRadians(2.5-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*130*2-60))*2), armr.rotateAngleY + (float) Math.toRadians(10-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*130*3-60))*2), armr.rotateAngleZ + (float) Math.toRadians(15+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*130*4-60))*2));


        this.setRotateAngle(armr2, armr2.rotateAngleX + (float) Math.toRadians(-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*130*2-60*2))*2), armr2.rotateAngleY + (float) Math.toRadians(0), armr2.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(armr3, armr3.rotateAngleX + (float) Math.toRadians(0), armr3.rotateAngleY + (float) Math.toRadians(-30), armr3.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(arml, arml.rotateAngleX + (float) Math.toRadians(10-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*130*2-60*2))*2), arml.rotateAngleY + (float) Math.toRadians(-10+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*130*3-60*2))*2), arml.rotateAngleZ + (float) Math.toRadians(-25-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*130*4-60*2))*2));


        this.setRotateAngle(arml2, arml2.rotateAngleX + (float) Math.toRadians(-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*130*2-60*3))*2), arml2.rotateAngleY + (float) Math.toRadians(0), arml2.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(arml3, arml3.rotateAngleX + (float) Math.toRadians(0), arml3.rotateAngleY + (float) Math.toRadians(30), arml3.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(mandibleR, mandibleR.rotateAngleX + (float) Math.toRadians(20-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*130*3))*10), mandibleR.rotateAngleY + (float) Math.toRadians(10-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*130*2-60))*10), mandibleR.rotateAngleZ + (float) Math.toRadians(10+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*130-60))*10));


        this.setRotateAngle(mandibleL, mandibleL.rotateAngleX + (float) Math.toRadians(20-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*130*3-60))*10), mandibleL.rotateAngleY + (float) Math.toRadians(-10+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*130*2-60*2))*10), mandibleL.rotateAngleZ + (float) Math.toRadians(-10-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*130-60*2))*10));


        this.setRotateAngle(antennule_l, antennule_l.rotateAngleX + (float) Math.toRadians(-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*130*8-60))*5-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*130*4-60*2))*5), antennule_l.rotateAngleY + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*130*3-60))*5), antennule_l.rotateAngleZ + (float) Math.toRadians(-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*130*2-60*2))*5));



        if (tickAnim >= 0 && tickAnim < 6) {
            xx = -18.32 + (((tickAnim - 0) / 6) * (1.95754-(-18.32)));
            yy = -10.06 + (((tickAnim - 0) / 6) * (-17.33282-(-10.06)));
            zz = -1.46 + (((tickAnim - 0) / 6) * (-2.10831-(-1.46)));
        }
        else if (tickAnim >= 6 && tickAnim < 11) {
            xx = 1.95754 + (((tickAnim - 6) / 5) * (-11.0877-(1.95754)));
            yy = -17.33282 + (((tickAnim - 6) / 5) * (-3.33419-(-17.33282)));
            zz = -2.10831 + (((tickAnim - 6) / 5) * (-17.83357-(-2.10831)));
        }
        else if (tickAnim >= 11 && tickAnim < 15) {
            xx = -11.0877 + (((tickAnim - 11) / 4) * (-29.91012-(-11.0877)));
            yy = -3.33419 + (((tickAnim - 11) / 4) * (-5.91132-(-3.33419)));
            zz = -17.83357 + (((tickAnim - 11) / 4) * (-1.09526-(-17.83357)));
        }
        else if (tickAnim >= 15 && tickAnim < 24) {
            xx = -29.91012 + (((tickAnim - 15) / 9) * (1.95754-(-29.91012)));
            yy = -5.91132 + (((tickAnim - 15) / 9) * (-17.33282-(-5.91132)));
            zz = -1.09526 + (((tickAnim - 15) / 9) * (-2.10831-(-1.09526)));
        }
        else if (tickAnim >= 24 && tickAnim < 29) {
            xx = 1.95754 + (((tickAnim - 24) / 5) * (-11.0877-(1.95754)));
            yy = -17.33282 + (((tickAnim - 24) / 5) * (-3.33419-(-17.33282)));
            zz = -2.10831 + (((tickAnim - 24) / 5) * (-17.83357-(-2.10831)));
        }
        else if (tickAnim >= 29 && tickAnim < 33) {
            xx = -11.0877 + (((tickAnim - 29) / 4) * (-29.91012-(-11.0877)));
            yy = -3.33419 + (((tickAnim - 29) / 4) * (-5.91132-(-3.33419)));
            zz = -17.83357 + (((tickAnim - 29) / 4) * (-1.09526-(-17.83357)));
        }
        else if (tickAnim >= 33 && tickAnim < 43) {
            xx = -29.91012 + (((tickAnim - 33) / 10) * (1.95754-(-29.91012)));
            yy = -5.91132 + (((tickAnim - 33) / 10) * (-17.33282-(-5.91132)));
            zz = -1.09526 + (((tickAnim - 33) / 10) * (-2.10831-(-1.09526)));
        }
        else if (tickAnim >= 43 && tickAnim < 48) {
            xx = 1.95754 + (((tickAnim - 43) / 5) * (-11.0877-(1.95754)));
            yy = -17.33282 + (((tickAnim - 43) / 5) * (-3.33419-(-17.33282)));
            zz = -2.10831 + (((tickAnim - 43) / 5) * (-17.83357-(-2.10831)));
        }
        else if (tickAnim >= 48 && tickAnim < 52) {
            xx = -11.0877 + (((tickAnim - 48) / 4) * (-29.91012-(-11.0877)));
            yy = -3.33419 + (((tickAnim - 48) / 4) * (-5.91132-(-3.33419)));
            zz = -17.83357 + (((tickAnim - 48) / 4) * (-1.09526-(-17.83357)));
        }
        else if (tickAnim >= 52 && tickAnim < 61) {
            xx = -29.91012 + (((tickAnim - 52) / 9) * (1.95754-(-29.91012)));
            yy = -5.91132 + (((tickAnim - 52) / 9) * (-17.33282-(-5.91132)));
            zz = -1.09526 + (((tickAnim - 52) / 9) * (-2.10831-(-1.09526)));
        }
        else if (tickAnim >= 61 && tickAnim < 66) {
            xx = 1.95754 + (((tickAnim - 61) / 5) * (-11.0877-(1.95754)));
            yy = -17.33282 + (((tickAnim - 61) / 5) * (-3.33419-(-17.33282)));
            zz = -2.10831 + (((tickAnim - 61) / 5) * (-17.83357-(-2.10831)));
        }
        else if (tickAnim >= 66 && tickAnim < 70) {
            xx = -11.0877 + (((tickAnim - 66) / 4) * (-29.91012-(-11.0877)));
            yy = -3.33419 + (((tickAnim - 66) / 4) * (-5.91132-(-3.33419)));
            zz = -17.83357 + (((tickAnim - 66) / 4) * (-1.09526-(-17.83357)));
        }
        else if (tickAnim >= 70 && tickAnim < 79) {
            xx = -29.91012 + (((tickAnim - 70) / 9) * (1.95754-(-29.91012)));
            yy = -5.91132 + (((tickAnim - 70) / 9) * (-17.33282-(-5.91132)));
            zz = -1.09526 + (((tickAnim - 70) / 9) * (-2.10831-(-1.09526)));
        }
        else if (tickAnim >= 79 && tickAnim < 84) {
            xx = 1.95754 + (((tickAnim - 79) / 5) * (-11.0877-(1.95754)));
            yy = -17.33282 + (((tickAnim - 79) / 5) * (-3.33419-(-17.33282)));
            zz = -2.10831 + (((tickAnim - 79) / 5) * (-17.83357-(-2.10831)));
        }
        else if (tickAnim >= 84 && tickAnim < 88) {
            xx = -11.0877 + (((tickAnim - 84) / 4) * (-29.91012-(-11.0877)));
            yy = -3.33419 + (((tickAnim - 84) / 4) * (-5.91132-(-3.33419)));
            zz = -17.83357 + (((tickAnim - 84) / 4) * (-1.09526-(-17.83357)));
        }
        else if (tickAnim >= 88 && tickAnim < 98) {
            xx = -29.91012 + (((tickAnim - 88) / 10) * (1.95754-(-29.91012)));
            yy = -5.91132 + (((tickAnim - 88) / 10) * (-17.33282-(-5.91132)));
            zz = -1.09526 + (((tickAnim - 88) / 10) * (-2.10831-(-1.09526)));
        }
        else if (tickAnim >= 98 && tickAnim < 103) {
            xx = 1.95754 + (((tickAnim - 98) / 5) * (-11.0877-(1.95754)));
            yy = -17.33282 + (((tickAnim - 98) / 5) * (-3.33419-(-17.33282)));
            zz = -2.10831 + (((tickAnim - 98) / 5) * (-17.83357-(-2.10831)));
        }
        else if (tickAnim >= 103 && tickAnim < 107) {
            xx = -11.0877 + (((tickAnim - 103) / 4) * (-29.91012-(-11.0877)));
            yy = -3.33419 + (((tickAnim - 103) / 4) * (-5.91132-(-3.33419)));
            zz = -17.83357 + (((tickAnim - 103) / 4) * (-1.09526-(-17.83357)));
        }
        else if (tickAnim >= 107 && tickAnim < 110) {
            xx = -29.91012 + (((tickAnim - 107) / 3) * (-18.32-(-29.91012)));
            yy = -5.91132 + (((tickAnim - 107) / 3) * (-10.06-(-5.91132)));
            zz = -1.09526 + (((tickAnim - 107) / 3) * (-1.46-(-1.09526)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(legl4, legl4.rotateAngleX + (float) Math.toRadians(xx), legl4.rotateAngleY + (float) Math.toRadians(yy), legl4.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 5) {
            xx = 1.56751 + (((tickAnim - 0) / 5) * (0.4925-(1.56751)));
            yy = -14.10965 + (((tickAnim - 0) / 5) * (4.99988-(-14.10965)));
            zz = -1.37107 + (((tickAnim - 0) / 5) * (-7.41948-(-1.37107)));
        }
        else if (tickAnim >= 5 && tickAnim < 9) {
            xx = 0.4925 + (((tickAnim - 5) / 4) * (-22.58907-(0.4925)));
            yy = 4.99988 + (((tickAnim - 5) / 4) * (-3.88393-(4.99988)));
            zz = -7.41948 + (((tickAnim - 5) / 4) * (-1.87171-(-7.41948)));
        }
        else if (tickAnim >= 9 && tickAnim < 18) {
            xx = -22.58907 + (((tickAnim - 9) / 9) * (1.56751-(-22.58907)));
            yy = -3.88393 + (((tickAnim - 9) / 9) * (-14.10965-(-3.88393)));
            zz = -1.87171 + (((tickAnim - 9) / 9) * (-1.37107-(-1.87171)));
        }
        else if (tickAnim >= 18 && tickAnim < 23) {
            xx = 1.56751 + (((tickAnim - 18) / 5) * (0.4925-(1.56751)));
            yy = -14.10965 + (((tickAnim - 18) / 5) * (4.99988-(-14.10965)));
            zz = -1.37107 + (((tickAnim - 18) / 5) * (-7.41948-(-1.37107)));
        }
        else if (tickAnim >= 23 && tickAnim < 28) {
            xx = 0.4925 + (((tickAnim - 23) / 5) * (-22.58907-(0.4925)));
            yy = 4.99988 + (((tickAnim - 23) / 5) * (-3.88393-(4.99988)));
            zz = -7.41948 + (((tickAnim - 23) / 5) * (-1.87171-(-7.41948)));
        }
        else if (tickAnim >= 28 && tickAnim < 36) {
            xx = -22.58907 + (((tickAnim - 28) / 8) * (1.56751-(-22.58907)));
            yy = -3.88393 + (((tickAnim - 28) / 8) * (-14.10965-(-3.88393)));
            zz = -1.87171 + (((tickAnim - 28) / 8) * (-1.37107-(-1.87171)));
        }
        else if (tickAnim >= 36 && tickAnim < 41) {
            xx = 1.56751 + (((tickAnim - 36) / 5) * (0.4925-(1.56751)));
            yy = -14.10965 + (((tickAnim - 36) / 5) * (4.99988-(-14.10965)));
            zz = -1.37107 + (((tickAnim - 36) / 5) * (-7.41948-(-1.37107)));
        }
        else if (tickAnim >= 41 && tickAnim < 45) {
            xx = 0.4925 + (((tickAnim - 41) / 4) * (-22.58907-(0.4925)));
            yy = 4.99988 + (((tickAnim - 41) / 4) * (-3.88393-(4.99988)));
            zz = -7.41948 + (((tickAnim - 41) / 4) * (-1.87171-(-7.41948)));
        }
        else if (tickAnim >= 45 && tickAnim < 54) {
            xx = -22.58907 + (((tickAnim - 45) / 9) * (1.56751-(-22.58907)));
            yy = -3.88393 + (((tickAnim - 45) / 9) * (-14.10965-(-3.88393)));
            zz = -1.87171 + (((tickAnim - 45) / 9) * (-1.37107-(-1.87171)));
        }
        else if (tickAnim >= 54 && tickAnim < 59) {
            xx = 1.56751 + (((tickAnim - 54) / 5) * (0.4925-(1.56751)));
            yy = -14.10965 + (((tickAnim - 54) / 5) * (4.99988-(-14.10965)));
            zz = -1.37107 + (((tickAnim - 54) / 5) * (-7.41948-(-1.37107)));
        }
        else if (tickAnim >= 59 && tickAnim < 63) {
            xx = 0.4925 + (((tickAnim - 59) / 4) * (-22.58907-(0.4925)));
            yy = 4.99988 + (((tickAnim - 59) / 4) * (-3.88393-(4.99988)));
            zz = -7.41948 + (((tickAnim - 59) / 4) * (-1.87171-(-7.41948)));
        }
        else if (tickAnim >= 63 && tickAnim < 73) {
            xx = -22.58907 + (((tickAnim - 63) / 10) * (1.56751-(-22.58907)));
            yy = -3.88393 + (((tickAnim - 63) / 10) * (-14.10965-(-3.88393)));
            zz = -1.87171 + (((tickAnim - 63) / 10) * (-1.37107-(-1.87171)));
        }
        else if (tickAnim >= 73 && tickAnim < 78) {
            xx = 1.56751 + (((tickAnim - 73) / 5) * (0.4925-(1.56751)));
            yy = -14.10965 + (((tickAnim - 73) / 5) * (4.99988-(-14.10965)));
            zz = -1.37107 + (((tickAnim - 73) / 5) * (-7.41948-(-1.37107)));
        }
        else if (tickAnim >= 78 && tickAnim < 82) {
            xx = 0.4925 + (((tickAnim - 78) / 4) * (-22.58907-(0.4925)));
            yy = 4.99988 + (((tickAnim - 78) / 4) * (-3.88393-(4.99988)));
            zz = -7.41948 + (((tickAnim - 78) / 4) * (-1.87171-(-7.41948)));
        }
        else if (tickAnim >= 82 && tickAnim < 83) {
            xx = -22.58907 + (((tickAnim - 82) / 1) * (-22.58907-(-22.58907)));
            yy = -3.88393 + (((tickAnim - 82) / 1) * (-3.88393-(-3.88393)));
            zz = -1.87171 + (((tickAnim - 82) / 1) * (-1.87171-(-1.87171)));
        }
        else if (tickAnim >= 83 && tickAnim < 92) {
            xx = -22.58907 + (((tickAnim - 83) / 9) * (1.56751-(-22.58907)));
            yy = -3.88393 + (((tickAnim - 83) / 9) * (-14.10965-(-3.88393)));
            zz = -1.87171 + (((tickAnim - 83) / 9) * (-1.37107-(-1.87171)));
        }
        else if (tickAnim >= 92 && tickAnim < 97) {
            xx = 1.56751 + (((tickAnim - 92) / 5) * (0.4925-(1.56751)));
            yy = -14.10965 + (((tickAnim - 92) / 5) * (4.99988-(-14.10965)));
            zz = -1.37107 + (((tickAnim - 92) / 5) * (-7.41948-(-1.37107)));
        }
        else if (tickAnim >= 97 && tickAnim < 101) {
            xx = 0.4925 + (((tickAnim - 97) / 4) * (-22.58907-(0.4925)));
            yy = 4.99988 + (((tickAnim - 97) / 4) * (-3.88393-(4.99988)));
            zz = -7.41948 + (((tickAnim - 97) / 4) * (-1.87171-(-7.41948)));
        }
        else if (tickAnim >= 101 && tickAnim < 110) {
            xx = -22.58907 + (((tickAnim - 101) / 9) * (1.56751-(-22.58907)));
            yy = -3.88393 + (((tickAnim - 101) / 9) * (-14.10965-(-3.88393)));
            zz = -1.87171 + (((tickAnim - 101) / 9) * (-1.37107-(-1.87171)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(legl3, legl3.rotateAngleX + (float) Math.toRadians(xx), legl3.rotateAngleY + (float) Math.toRadians(yy), legl3.rotateAngleZ + (float) Math.toRadians(zz));

    }
    public void animRunning(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime, boolean isStatic) {
        EntityPrehistoricFloraHomarus entity = (EntityPrehistoricFloraHomarus) entitylivingbaseIn;
        int animCycle = 40;
        double tickAnim = (entity.ticksExisted + entity.getTickOffset()) - (int) (Math.floor((double) (entity.ticksExisted + entity.getTickOffset()) / (double) animCycle) * (double) animCycle) + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;
        this.setRotateAngle(Body, Body.rotateAngleX + (float) Math.toRadians(-5-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180*2))*2), Body.rotateAngleY + (float) Math.toRadians(-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180-60))*2), Body.rotateAngleZ + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180*3))*3));
        this.Body.rotationPointX = this.Body.rotationPointX + (float)(-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180*3))*0.4);
        this.Body.rotationPointY = this.Body.rotationPointY - (float)(1+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180*2))*0.5);
        this.Body.rotationPointZ = this.Body.rotationPointZ + (float)(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180))*0.5);


        this.setRotateAngle(antennule_r, antennule_r.rotateAngleX + (float) Math.toRadians(-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180*6-60))*5-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180*4-60))*10), antennule_r.rotateAngleY + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180*5-60*2))*5-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180*2-60*2))*10), antennule_r.rotateAngleZ + (float) Math.toRadians(-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180*4-60*2))*5+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180*3-60*2))*5));


        this.setRotateAngle(antenna_r3, antenna_r3.rotateAngleX + (float) Math.toRadians(-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180*2-60))*5), antenna_r3.rotateAngleY + (float) Math.toRadians(-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180*2))*10), antenna_r3.rotateAngleZ + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180*3))*5));


        this.setRotateAngle(antenna_l3, antenna_l3.rotateAngleX + (float) Math.toRadians(-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180*2-60*2))*5), antenna_l3.rotateAngleY + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180*2-60))*10), antenna_l3.rotateAngleZ + (float) Math.toRadians(-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180*3-60))*5));


        this.setRotateAngle(Tail, Tail.rotateAngleX + (float) Math.toRadians(5), Tail.rotateAngleY + (float) Math.toRadians(0), Tail.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(plpl, plpl.rotateAngleX + (float) Math.toRadians(-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180*3-30))*20), plpl.rotateAngleY + (float) Math.toRadians(0), plpl.rotateAngleZ + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180*3-60-30))*10));


        this.setRotateAngle(plpr, plpr.rotateAngleX + (float) Math.toRadians(-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180*3))*20), plpr.rotateAngleY + (float) Math.toRadians(0), plpr.rotateAngleZ + (float) Math.toRadians(-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180*3-60))*10));


        this.setRotateAngle(Tail2, Tail2.rotateAngleX + (float) Math.toRadians(2.5), Tail2.rotateAngleY + (float) Math.toRadians(0), Tail2.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(plpl2, plpl2.rotateAngleX + (float) Math.toRadians(-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180*3-60-30))*20), plpl2.rotateAngleY + (float) Math.toRadians(0), plpl2.rotateAngleZ + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180*3-60*2-30))*10));


        this.setRotateAngle(plpr2, plpr2.rotateAngleX + (float) Math.toRadians(-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180*3-60))*20), plpr2.rotateAngleY + (float) Math.toRadians(0), plpr2.rotateAngleZ + (float) Math.toRadians(-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180*3-60*2))*10));


        this.setRotateAngle(plpl3, plpl3.rotateAngleX + (float) Math.toRadians(-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180*3-60*2-30))*20), plpl3.rotateAngleY + (float) Math.toRadians(0), plpl3.rotateAngleZ + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180*3-60*3-30))*10));


        this.setRotateAngle(plpr3, plpr3.rotateAngleX + (float) Math.toRadians(-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180*3-60*2))*20), plpr3.rotateAngleY + (float) Math.toRadians(0), plpr3.rotateAngleZ + (float) Math.toRadians(-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180*3-60*3))*10));


        this.setRotateAngle(Tail4, Tail4.rotateAngleX + (float) Math.toRadians(12.5), Tail4.rotateAngleY + (float) Math.toRadians(0), Tail4.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(plpl4, plpl4.rotateAngleX + (float) Math.toRadians(-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180*3-60*3-30))*20), plpl4.rotateAngleY + (float) Math.toRadians(0), plpl4.rotateAngleZ + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180*3-60*4-30))*10));


        this.setRotateAngle(plpr4, plpr4.rotateAngleX + (float) Math.toRadians(-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180*3-60*3))*20), plpr4.rotateAngleY + (float) Math.toRadians(0), plpr4.rotateAngleZ + (float) Math.toRadians(-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180*3-60*4))*10));


        this.setRotateAngle(Tail5, Tail5.rotateAngleX + (float) Math.toRadians(7.5), Tail5.rotateAngleY + (float) Math.toRadians(0), Tail5.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(plpl5, plpl5.rotateAngleX + (float) Math.toRadians(-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180*3-60*4-30))*20), plpl5.rotateAngleY + (float) Math.toRadians(0), plpl5.rotateAngleZ + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180*3-60*5-30))*10));


        this.setRotateAngle(plpr5, plpr5.rotateAngleX + (float) Math.toRadians(-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180*3-60*4))*20), plpr5.rotateAngleY + (float) Math.toRadians(0), plpr5.rotateAngleZ + (float) Math.toRadians(-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180*3-60*5))*10));


        this.setRotateAngle(telson, telson.rotateAngleX + (float) Math.toRadians(62.5), telson.rotateAngleY + (float) Math.toRadians(0), telson.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(bone23, bone23.rotateAngleX + (float) Math.toRadians(-6.73906), bone23.rotateAngleY + (float) Math.toRadians(-8.99407), bone23.rotateAngleZ + (float) Math.toRadians(-29.31907));


        this.setRotateAngle(UropodL, UropodL.rotateAngleX + (float) Math.toRadians(-2.8922), UropodL.rotateAngleY + (float) Math.toRadians(29.60863), UropodL.rotateAngleZ + (float) Math.toRadians(-38.92189));


        this.setRotateAngle(uropodR, uropodR.rotateAngleX + (float) Math.toRadians(-2.8922), uropodR.rotateAngleY + (float) Math.toRadians(-29.60863), uropodR.rotateAngleZ + (float) Math.toRadians(38.92189));


        this.setRotateAngle(bone7, bone7.rotateAngleX + (float) Math.toRadians(-6.73906), bone7.rotateAngleY + (float) Math.toRadians(8.99407), bone7.rotateAngleZ + (float) Math.toRadians(29.31907));



        if (tickAnim >= 0 && tickAnim < 3) {
            xx = -26.51345 + (((tickAnim - 0) / 3) * (-56.19829-(-26.51345)));
            yy = -3.54524 + (((tickAnim - 0) / 3) * (-15.76323-(-3.54524)));
            zz = 15.26974 + (((tickAnim - 0) / 3) * (1.04053-(15.26974)));
        }
        else if (tickAnim >= 3 && tickAnim < 10) {
            xx = -56.19829 + (((tickAnim - 3) / 7) * (0-(-56.19829)));
            yy = -15.76323 + (((tickAnim - 3) / 7) * (15-(-15.76323)));
            zz = 1.04053 + (((tickAnim - 3) / 7) * (0-(1.04053)));
        }
        else if (tickAnim >= 10 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 10) / 3) * (-26.51345-(0)));
            yy = 15 + (((tickAnim - 10) / 3) * (-3.54524-(15)));
            zz = 0 + (((tickAnim - 10) / 3) * (15.26974-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 17) {
            xx = -26.51345 + (((tickAnim - 13) / 4) * (-56.19829-(-26.51345)));
            yy = -3.54524 + (((tickAnim - 13) / 4) * (-15.76323-(-3.54524)));
            zz = 15.26974 + (((tickAnim - 13) / 4) * (1.04053-(15.26974)));
        }
        else if (tickAnim >= 17 && tickAnim < 23) {
            xx = -56.19829 + (((tickAnim - 17) / 6) * (0-(-56.19829)));
            yy = -15.76323 + (((tickAnim - 17) / 6) * (15-(-15.76323)));
            zz = 1.04053 + (((tickAnim - 17) / 6) * (0-(1.04053)));
        }
        else if (tickAnim >= 23 && tickAnim < 27) {
            xx = 0 + (((tickAnim - 23) / 4) * (-26.51345-(0)));
            yy = 15 + (((tickAnim - 23) / 4) * (-3.54524-(15)));
            zz = 0 + (((tickAnim - 23) / 4) * (15.26974-(0)));
        }
        else if (tickAnim >= 27 && tickAnim < 30) {
            xx = -26.51345 + (((tickAnim - 27) / 3) * (-56.19829-(-26.51345)));
            yy = -3.54524 + (((tickAnim - 27) / 3) * (-15.76323-(-3.54524)));
            zz = 15.26974 + (((tickAnim - 27) / 3) * (1.04053-(15.26974)));
        }
        else if (tickAnim >= 30 && tickAnim < 37) {
            xx = -56.19829 + (((tickAnim - 30) / 7) * (0-(-56.19829)));
            yy = -15.76323 + (((tickAnim - 30) / 7) * (15-(-15.76323)));
            zz = 1.04053 + (((tickAnim - 30) / 7) * (0-(1.04053)));
        }
        else if (tickAnim >= 37 && tickAnim < 40) {
            xx = 0 + (((tickAnim - 37) / 3) * (-26.51345-(0)));
            yy = 15 + (((tickAnim - 37) / 3) * (-3.54524-(15)));
            zz = 0 + (((tickAnim - 37) / 3) * (15.26974-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(legr4, legr4.rotateAngleX + (float) Math.toRadians(xx), legr4.rotateAngleY + (float) Math.toRadians(yy), legr4.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 2) {
            xx = -1.27 + (((tickAnim - 0) / 2) * (-18.90829-(-1.27)));
            yy = 5.64 + (((tickAnim - 0) / 2) * (-4.40371-(5.64)));
            zz = 3.57 + (((tickAnim - 0) / 2) * (8.9731-(3.57)));
        }
        else if (tickAnim >= 2 && tickAnim < 5) {
            xx = -18.90829 + (((tickAnim - 2) / 3) * (-51.39766-(-18.90829)));
            yy = -4.40371 + (((tickAnim - 2) / 3) * (-21.90018-(-4.40371)));
            zz = 8.9731 + (((tickAnim - 2) / 3) * (-5.23093-(8.9731)));
        }
        else if (tickAnim >= 5 && tickAnim < 12) {
            xx = -51.39766 + (((tickAnim - 5) / 7) * (16.36124-(-51.39766)));
            yy = -21.90018 + (((tickAnim - 5) / 7) * (15.6899-(-21.90018)));
            zz = -5.23093 + (((tickAnim - 5) / 7) * (-1.84247-(-5.23093)));
        }
        else if (tickAnim >= 12 && tickAnim < 13) {
            xx = 16.36124 + (((tickAnim - 12) / 1) * (-1.27-(16.36124)));
            yy = 15.6899 + (((tickAnim - 12) / 1) * (5.64-(15.6899)));
            zz = -1.84247 + (((tickAnim - 12) / 1) * (3.57-(-1.84247)));
        }
        else if (tickAnim >= 13 && tickAnim < 15) {
            xx = -1.27 + (((tickAnim - 13) / 2) * (-18.90829-(-1.27)));
            yy = 5.64 + (((tickAnim - 13) / 2) * (-4.40371-(5.64)));
            zz = 3.57 + (((tickAnim - 13) / 2) * (8.9731-(3.57)));
        }
        else if (tickAnim >= 15 && tickAnim < 18) {
            xx = -18.90829 + (((tickAnim - 15) / 3) * (-51.39766-(-18.90829)));
            yy = -4.40371 + (((tickAnim - 15) / 3) * (-21.90018-(-4.40371)));
            zz = 8.9731 + (((tickAnim - 15) / 3) * (-5.23093-(8.9731)));
        }
        else if (tickAnim >= 18 && tickAnim < 25) {
            xx = -51.39766 + (((tickAnim - 18) / 7) * (16.36124-(-51.39766)));
            yy = -21.90018 + (((tickAnim - 18) / 7) * (15.6899-(-21.90018)));
            zz = -5.23093 + (((tickAnim - 18) / 7) * (-1.84247-(-5.23093)));
        }
        else if (tickAnim >= 25 && tickAnim < 27) {
            xx = 16.36124 + (((tickAnim - 25) / 2) * (-1.27-(16.36124)));
            yy = 15.6899 + (((tickAnim - 25) / 2) * (5.64-(15.6899)));
            zz = -1.84247 + (((tickAnim - 25) / 2) * (3.57-(-1.84247)));
        }
        else if (tickAnim >= 27 && tickAnim < 28) {
            xx = -1.27 + (((tickAnim - 27) / 1) * (-18.90829-(-1.27)));
            yy = 5.64 + (((tickAnim - 27) / 1) * (-4.40371-(5.64)));
            zz = 3.57 + (((tickAnim - 27) / 1) * (8.9731-(3.57)));
        }
        else if (tickAnim >= 28 && tickAnim < 32) {
            xx = -18.90829 + (((tickAnim - 28) / 4) * (-51.39766-(-18.90829)));
            yy = -4.40371 + (((tickAnim - 28) / 4) * (-21.90018-(-4.40371)));
            zz = 8.9731 + (((tickAnim - 28) / 4) * (-5.23093-(8.9731)));
        }
        else if (tickAnim >= 32 && tickAnim < 38) {
            xx = -51.39766 + (((tickAnim - 32) / 6) * (16.36124-(-51.39766)));
            yy = -21.90018 + (((tickAnim - 32) / 6) * (15.6899-(-21.90018)));
            zz = -5.23093 + (((tickAnim - 32) / 6) * (-1.84247-(-5.23093)));
        }
        else if (tickAnim >= 38 && tickAnim < 40) {
            xx = 16.36124 + (((tickAnim - 38) / 2) * (-1.27-(16.36124)));
            yy = 15.6899 + (((tickAnim - 38) / 2) * (5.64-(15.6899)));
            zz = -1.84247 + (((tickAnim - 38) / 2) * (3.57-(-1.84247)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(legr3, legr3.rotateAngleX + (float) Math.toRadians(xx), legr3.rotateAngleY + (float) Math.toRadians(yy), legr3.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 55.55452 + (((tickAnim - 0) / 3) * (23.55071-(55.55452)));
            yy = 24.03269 + (((tickAnim - 0) / 3) * (6.05113-(24.03269)));
            zz = 5.10025 + (((tickAnim - 0) / 3) * (18.09241-(5.10025)));
        }
        else if (tickAnim >= 3 && tickAnim < 7) {
            xx = 23.55071 + (((tickAnim - 3) / 4) * (0.06561-(23.55071)));
            yy = 6.05113 + (((tickAnim - 3) / 4) * (-14.58562-(6.05113)));
            zz = 18.09241 + (((tickAnim - 3) / 4) * (0.01776-(18.09241)));
        }
        else if (tickAnim >= 7 && tickAnim < 13) {
            xx = 0.06561 + (((tickAnim - 7) / 6) * (55.55452-(0.06561)));
            yy = -14.58562 + (((tickAnim - 7) / 6) * (24.03269-(-14.58562)));
            zz = 0.01776 + (((tickAnim - 7) / 6) * (5.10025-(0.01776)));
        }
        else if (tickAnim >= 13 && tickAnim < 17) {
            xx = 55.55452 + (((tickAnim - 13) / 4) * (23.55071-(55.55452)));
            yy = 24.03269 + (((tickAnim - 13) / 4) * (6.05113-(24.03269)));
            zz = 5.10025 + (((tickAnim - 13) / 4) * (18.09241-(5.10025)));
        }
        else if (tickAnim >= 17 && tickAnim < 20) {
            xx = 23.55071 + (((tickAnim - 17) / 3) * (0.06561-(23.55071)));
            yy = 6.05113 + (((tickAnim - 17) / 3) * (-14.58562-(6.05113)));
            zz = 18.09241 + (((tickAnim - 17) / 3) * (0.01776-(18.09241)));
        }
        else if (tickAnim >= 20 && tickAnim < 27) {
            xx = 0.06561 + (((tickAnim - 20) / 7) * (55.55452-(0.06561)));
            yy = -14.58562 + (((tickAnim - 20) / 7) * (24.03269-(-14.58562)));
            zz = 0.01776 + (((tickAnim - 20) / 7) * (5.10025-(0.01776)));
        }
        else if (tickAnim >= 27 && tickAnim < 30) {
            xx = 55.55452 + (((tickAnim - 27) / 3) * (23.55071-(55.55452)));
            yy = 24.03269 + (((tickAnim - 27) / 3) * (6.05113-(24.03269)));
            zz = 5.10025 + (((tickAnim - 27) / 3) * (18.09241-(5.10025)));
        }
        else if (tickAnim >= 30 && tickAnim < 33) {
            xx = 23.55071 + (((tickAnim - 30) / 3) * (0.06561-(23.55071)));
            yy = 6.05113 + (((tickAnim - 30) / 3) * (-14.58562-(6.05113)));
            zz = 18.09241 + (((tickAnim - 30) / 3) * (0.01776-(18.09241)));
        }
        else if (tickAnim >= 33 && tickAnim < 40) {
            xx = 0.06561 + (((tickAnim - 33) / 7) * (55.55452-(0.06561)));
            yy = -14.58562 + (((tickAnim - 33) / 7) * (24.03269-(-14.58562)));
            zz = 0.01776 + (((tickAnim - 33) / 7) * (5.10025-(0.01776)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(legr2, legr2.rotateAngleX + (float) Math.toRadians(xx), legr2.rotateAngleY + (float) Math.toRadians(yy), legr2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 7) {
            xx = 0.06561 + (((tickAnim - 0) / 7) * (55.55452-(0.06561)));
            yy = 14.58562 + (((tickAnim - 0) / 7) * (-24.03269-(14.58562)));
            zz = -0.01776 + (((tickAnim - 0) / 7) * (-5.10025-(-0.01776)));
        }
        else if (tickAnim >= 7 && tickAnim < 10) {
            xx = 55.55452 + (((tickAnim - 7) / 3) * (23.55071-(55.55452)));
            yy = -24.03269 + (((tickAnim - 7) / 3) * (-6.05113-(-24.03269)));
            zz = -5.10025 + (((tickAnim - 7) / 3) * (-18.09241-(-5.10025)));
        }
        else if (tickAnim >= 10 && tickAnim < 13) {
            xx = 23.55071 + (((tickAnim - 10) / 3) * (0.06561-(23.55071)));
            yy = -6.05113 + (((tickAnim - 10) / 3) * (14.58562-(-6.05113)));
            zz = -18.09241 + (((tickAnim - 10) / 3) * (-0.01776-(-18.09241)));
        }
        else if (tickAnim >= 13 && tickAnim < 20) {
            xx = 0.06561 + (((tickAnim - 13) / 7) * (55.55452-(0.06561)));
            yy = 14.58562 + (((tickAnim - 13) / 7) * (-24.03269-(14.58562)));
            zz = -0.01776 + (((tickAnim - 13) / 7) * (-5.10025-(-0.01776)));
        }
        else if (tickAnim >= 20 && tickAnim < 23) {
            xx = 55.55452 + (((tickAnim - 20) / 3) * (23.55071-(55.55452)));
            yy = -24.03269 + (((tickAnim - 20) / 3) * (-6.05113-(-24.03269)));
            zz = -5.10025 + (((tickAnim - 20) / 3) * (-18.09241-(-5.10025)));
        }
        else if (tickAnim >= 23 && tickAnim < 27) {
            xx = 23.55071 + (((tickAnim - 23) / 4) * (0.06561-(23.55071)));
            yy = -6.05113 + (((tickAnim - 23) / 4) * (14.58562-(-6.05113)));
            zz = -18.09241 + (((tickAnim - 23) / 4) * (-0.01776-(-18.09241)));
        }
        else if (tickAnim >= 27 && tickAnim < 33) {
            xx = 0.06561 + (((tickAnim - 27) / 6) * (55.55452-(0.06561)));
            yy = 14.58562 + (((tickAnim - 27) / 6) * (-24.03269-(14.58562)));
            zz = -0.01776 + (((tickAnim - 27) / 6) * (-5.10025-(-0.01776)));
        }
        else if (tickAnim >= 33 && tickAnim < 37) {
            xx = 55.55452 + (((tickAnim - 33) / 4) * (23.55071-(55.55452)));
            yy = -24.03269 + (((tickAnim - 33) / 4) * (-6.05113-(-24.03269)));
            zz = -5.10025 + (((tickAnim - 33) / 4) * (-18.09241-(-5.10025)));
        }
        else if (tickAnim >= 37 && tickAnim < 40) {
            xx = 23.55071 + (((tickAnim - 37) / 3) * (0.06561-(23.55071)));
            yy = -6.05113 + (((tickAnim - 37) / 3) * (14.58562-(-6.05113)));
            zz = -18.09241 + (((tickAnim - 37) / 3) * (-0.01776-(-18.09241)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(legl2, legl2.rotateAngleX + (float) Math.toRadians(xx), legl2.rotateAngleY + (float) Math.toRadians(yy), legl2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 2) {
            xx = 24.47 + (((tickAnim - 0) / 2) * (37.88312-(24.47)));
            yy = 25.35 + (((tickAnim - 0) / 2) * (34.3628-(25.35)));
            zz = 0.55 + (((tickAnim - 0) / 2) * (3.07448-(0.55)));
        }
        else if (tickAnim >= 2 && tickAnim < 5) {
            xx = 37.88312 + (((tickAnim - 2) / 3) * (6.68919-(37.88312)));
            yy = 34.3628 + (((tickAnim - 2) / 3) * (18.62897-(34.3628)));
            zz = 3.07448 + (((tickAnim - 2) / 3) * (13.47941-(3.07448)));
        }
        else if (tickAnim >= 5 && tickAnim < 8) {
            xx = 6.68919 + (((tickAnim - 5) / 3) * (-15.78768-(6.68919)));
            yy = 18.62897 + (((tickAnim - 5) / 3) * (-1.68866-(18.62897)));
            zz = 13.47941 + (((tickAnim - 5) / 3) * (-7.01338-(13.47941)));
        }
        else if (tickAnim >= 8 && tickAnim < 13) {
            xx = -15.78768 + (((tickAnim - 8) / 5) * (24.47-(-15.78768)));
            yy = -1.68866 + (((tickAnim - 8) / 5) * (25.35-(-1.68866)));
            zz = -7.01338 + (((tickAnim - 8) / 5) * (0.55-(-7.01338)));
        }
        else if (tickAnim >= 13 && tickAnim < 15) {
            xx = 24.47 + (((tickAnim - 13) / 2) * (37.88312-(24.47)));
            yy = 25.35 + (((tickAnim - 13) / 2) * (34.3628-(25.35)));
            zz = 0.55 + (((tickAnim - 13) / 2) * (3.07448-(0.55)));
        }
        else if (tickAnim >= 15 && tickAnim < 18) {
            xx = 37.88312 + (((tickAnim - 15) / 3) * (6.68919-(37.88312)));
            yy = 34.3628 + (((tickAnim - 15) / 3) * (18.62897-(34.3628)));
            zz = 3.07448 + (((tickAnim - 15) / 3) * (13.47941-(3.07448)));
        }
        else if (tickAnim >= 18 && tickAnim < 22) {
            xx = 6.68919 + (((tickAnim - 18) / 4) * (-15.78768-(6.68919)));
            yy = 18.62897 + (((tickAnim - 18) / 4) * (-1.68866-(18.62897)));
            zz = 13.47941 + (((tickAnim - 18) / 4) * (-7.01338-(13.47941)));
        }
        else if (tickAnim >= 22 && tickAnim < 27) {
            xx = -15.78768 + (((tickAnim - 22) / 5) * (24.47-(-15.78768)));
            yy = -1.68866 + (((tickAnim - 22) / 5) * (25.35-(-1.68866)));
            zz = -7.01338 + (((tickAnim - 22) / 5) * (0.55-(-7.01338)));
        }
        else if (tickAnim >= 27 && tickAnim < 28) {
            xx = 24.47 + (((tickAnim - 27) / 1) * (37.88312-(24.47)));
            yy = 25.35 + (((tickAnim - 27) / 1) * (34.3628-(25.35)));
            zz = 0.55 + (((tickAnim - 27) / 1) * (3.07448-(0.55)));
        }
        else if (tickAnim >= 28 && tickAnim < 32) {
            xx = 37.88312 + (((tickAnim - 28) / 4) * (6.68919-(37.88312)));
            yy = 34.3628 + (((tickAnim - 28) / 4) * (18.62897-(34.3628)));
            zz = 3.07448 + (((tickAnim - 28) / 4) * (13.47941-(3.07448)));
        }
        else if (tickAnim >= 32 && tickAnim < 35) {
            xx = 6.68919 + (((tickAnim - 32) / 3) * (-15.78768-(6.68919)));
            yy = 18.62897 + (((tickAnim - 32) / 3) * (-1.68866-(18.62897)));
            zz = 13.47941 + (((tickAnim - 32) / 3) * (-7.01338-(13.47941)));
        }
        else if (tickAnim >= 35 && tickAnim < 40) {
            xx = -15.78768 + (((tickAnim - 35) / 5) * (24.47-(-15.78768)));
            yy = -1.68866 + (((tickAnim - 35) / 5) * (25.35-(-1.68866)));
            zz = -7.01338 + (((tickAnim - 35) / 5) * (0.55-(-7.01338)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(legr, legr.rotateAngleX + (float) Math.toRadians(xx), legr.rotateAngleY + (float) Math.toRadians(yy), legr.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 2) {
            xx = -4.55 + (((tickAnim - 0) / 2) * (-15.78768-(-4.55)));
            yy = -8.47 + (((tickAnim - 0) / 2) * (1.68866-(-8.47)));
            zz = -3.23 + (((tickAnim - 0) / 2) * (7.01338-(-3.23)));
        }
        else if (tickAnim >= 2 && tickAnim < 8) {
            xx = -15.78768 + (((tickAnim - 2) / 6) * (37.88312-(-15.78768)));
            yy = 1.68866 + (((tickAnim - 2) / 6) * (-34.3628-(1.68866)));
            zz = 7.01338 + (((tickAnim - 2) / 6) * (-3.07448-(7.01338)));
        }
        else if (tickAnim >= 8 && tickAnim < 12) {
            xx = 37.88312 + (((tickAnim - 8) / 4) * (6.68919-(37.88312)));
            yy = -34.3628 + (((tickAnim - 8) / 4) * (-18.62897-(-34.3628)));
            zz = -3.07448 + (((tickAnim - 8) / 4) * (-13.47941-(-3.07448)));
        }
        else if (tickAnim >= 12 && tickAnim < 13) {
            xx = 6.68919 + (((tickAnim - 12) / 1) * (-4.55-(6.68919)));
            yy = -18.62897 + (((tickAnim - 12) / 1) * (-8.47-(-18.62897)));
            zz = -13.47941 + (((tickAnim - 12) / 1) * (-3.23-(-13.47941)));
        }
        else if (tickAnim >= 13 && tickAnim < 15) {
            xx = -4.55 + (((tickAnim - 13) / 2) * (-15.78768-(-4.55)));
            yy = -8.47 + (((tickAnim - 13) / 2) * (1.68866-(-8.47)));
            zz = -3.23 + (((tickAnim - 13) / 2) * (7.01338-(-3.23)));
        }
        else if (tickAnim >= 15 && tickAnim < 22) {
            xx = -15.78768 + (((tickAnim - 15) / 7) * (37.88312-(-15.78768)));
            yy = 1.68866 + (((tickAnim - 15) / 7) * (-34.3628-(1.68866)));
            zz = 7.01338 + (((tickAnim - 15) / 7) * (-3.07448-(7.01338)));
        }
        else if (tickAnim >= 22 && tickAnim < 25) {
            xx = 37.88312 + (((tickAnim - 22) / 3) * (6.68919-(37.88312)));
            yy = -34.3628 + (((tickAnim - 22) / 3) * (-18.62897-(-34.3628)));
            zz = -3.07448 + (((tickAnim - 22) / 3) * (-13.47941-(-3.07448)));
        }
        else if (tickAnim >= 25 && tickAnim < 27) {
            xx = 6.68919 + (((tickAnim - 25) / 2) * (-4.55-(6.68919)));
            yy = -18.62897 + (((tickAnim - 25) / 2) * (-8.47-(-18.62897)));
            zz = -13.47941 + (((tickAnim - 25) / 2) * (-3.23-(-13.47941)));
        }
        else if (tickAnim >= 27 && tickAnim < 28) {
            xx = -4.55 + (((tickAnim - 27) / 1) * (-15.78768-(-4.55)));
            yy = -8.47 + (((tickAnim - 27) / 1) * (1.68866-(-8.47)));
            zz = -3.23 + (((tickAnim - 27) / 1) * (7.01338-(-3.23)));
        }
        else if (tickAnim >= 28 && tickAnim < 35) {
            xx = -15.78768 + (((tickAnim - 28) / 7) * (37.88312-(-15.78768)));
            yy = 1.68866 + (((tickAnim - 28) / 7) * (-34.3628-(1.68866)));
            zz = 7.01338 + (((tickAnim - 28) / 7) * (-3.07448-(7.01338)));
        }
        else if (tickAnim >= 35 && tickAnim < 38) {
            xx = 37.88312 + (((tickAnim - 35) / 3) * (6.68919-(37.88312)));
            yy = -34.3628 + (((tickAnim - 35) / 3) * (-18.62897-(-34.3628)));
            zz = -3.07448 + (((tickAnim - 35) / 3) * (-13.47941-(-3.07448)));
        }
        else if (tickAnim >= 38 && tickAnim < 40) {
            xx = 6.68919 + (((tickAnim - 38) / 2) * (-4.55-(6.68919)));
            yy = -18.62897 + (((tickAnim - 38) / 2) * (-8.47-(-18.62897)));
            zz = -13.47941 + (((tickAnim - 38) / 2) * (-3.23-(-13.47941)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(legl, legl.rotateAngleX + (float) Math.toRadians(xx), legl.rotateAngleY + (float) Math.toRadians(yy), legl.rotateAngleZ + (float) Math.toRadians(zz));



        this.setRotateAngle(armr, armr.rotateAngleX + (float) Math.toRadians(-15-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180*3-60))*2), armr.rotateAngleY + (float) Math.toRadians(22.5-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180*2))*2), armr.rotateAngleZ + (float) Math.toRadians(-2.5+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180*2+60))*2));


        this.setRotateAngle(armr2, armr2.rotateAngleX + (float) Math.toRadians(-22.5), armr2.rotateAngleY + (float) Math.toRadians(0), armr2.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(armr3, armr3.rotateAngleX + (float) Math.toRadians(0), armr3.rotateAngleY + (float) Math.toRadians(-17.5), armr3.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(clawr, clawr.rotateAngleX + (float) Math.toRadians(0), clawr.rotateAngleY + (float) Math.toRadians(-20), clawr.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(arml, arml.rotateAngleX + (float) Math.toRadians(-17.5-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180*3-60*2))*2), arml.rotateAngleY + (float) Math.toRadians(-22.5+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180*2-60))*2), arml.rotateAngleZ + (float) Math.toRadians(2.5-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180*2))*2));


        this.setRotateAngle(arml2, arml2.rotateAngleX + (float) Math.toRadians(-22.5), arml2.rotateAngleY + (float) Math.toRadians(0), arml2.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(arml3, arml3.rotateAngleX + (float) Math.toRadians(0), arml3.rotateAngleY + (float) Math.toRadians(17.5), arml3.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(clawl, clawl.rotateAngleX + (float) Math.toRadians(0), clawl.rotateAngleY + (float) Math.toRadians(10), clawl.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(mandibleR, mandibleR.rotateAngleX + (float) Math.toRadians(7.5-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180*5))*5), mandibleR.rotateAngleY + (float) Math.toRadians(17.5+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180*2))*5), mandibleR.rotateAngleZ + (float) Math.toRadians(12.5));


        this.setRotateAngle(mandibleL, mandibleL.rotateAngleX + (float) Math.toRadians(7.5-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180*5-60))*5), mandibleL.rotateAngleY + (float) Math.toRadians(-17.5+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180*2-60))*5), mandibleL.rotateAngleZ + (float) Math.toRadians(-12.5));


        this.setRotateAngle(antennule_l, antennule_l.rotateAngleX + (float) Math.toRadians(-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180*6))*5-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180*4))*10), antennule_l.rotateAngleY + (float) Math.toRadians(-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180*5-60))*5-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180*2-60))*10), antennule_l.rotateAngleZ + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180*4-60))*5+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180*3-60))*5));



        if (tickAnim >= 0 && tickAnim < 3) {
            xx = -28.1 + (((tickAnim - 0) / 3) * (0-(-28.1)));
            yy = 0.38 + (((tickAnim - 0) / 3) * (-15-(0.38)));
            zz = -0.52 + (((tickAnim - 0) / 3) * (0-(-0.52)));
        }
        else if (tickAnim >= 3 && tickAnim < 7) {
            xx = 0 + (((tickAnim - 3) / 4) * (-26.51345-(0)));
            yy = -15 + (((tickAnim - 3) / 4) * (3.54524-(-15)));
            zz = 0 + (((tickAnim - 3) / 4) * (-15.26974-(0)));
        }
        else if (tickAnim >= 7 && tickAnim < 10) {
            xx = -26.51345 + (((tickAnim - 7) / 3) * (-56.19829-(-26.51345)));
            yy = 3.54524 + (((tickAnim - 7) / 3) * (15.76323-(3.54524)));
            zz = -15.26974 + (((tickAnim - 7) / 3) * (-1.04053-(-15.26974)));
        }
        else if (tickAnim >= 10 && tickAnim < 13) {
            xx = -56.19829 + (((tickAnim - 10) / 3) * (-28.1-(-56.19829)));
            yy = 15.76323 + (((tickAnim - 10) / 3) * (0.38-(15.76323)));
            zz = -1.04053 + (((tickAnim - 10) / 3) * (-0.52-(-1.04053)));
        }
        else if (tickAnim >= 13 && tickAnim < 17) {
            xx = -28.1 + (((tickAnim - 13) / 4) * (0-(-28.1)));
            yy = 0.38 + (((tickAnim - 13) / 4) * (-15-(0.38)));
            zz = -0.52 + (((tickAnim - 13) / 4) * (0-(-0.52)));
        }
        else if (tickAnim >= 17 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 17) / 3) * (-26.51345-(0)));
            yy = -15 + (((tickAnim - 17) / 3) * (3.54524-(-15)));
            zz = 0 + (((tickAnim - 17) / 3) * (-15.26974-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 23) {
            xx = -26.51345 + (((tickAnim - 20) / 3) * (-56.19829-(-26.51345)));
            yy = 3.54524 + (((tickAnim - 20) / 3) * (15.76323-(3.54524)));
            zz = -15.26974 + (((tickAnim - 20) / 3) * (-1.04053-(-15.26974)));
        }
        else if (tickAnim >= 23 && tickAnim < 27) {
            xx = -56.19829 + (((tickAnim - 23) / 4) * (-28.1-(-56.19829)));
            yy = 15.76323 + (((tickAnim - 23) / 4) * (0.38-(15.76323)));
            zz = -1.04053 + (((tickAnim - 23) / 4) * (-0.52-(-1.04053)));
        }
        else if (tickAnim >= 27 && tickAnim < 30) {
            xx = -28.1 + (((tickAnim - 27) / 3) * (0-(-28.1)));
            yy = 0.38 + (((tickAnim - 27) / 3) * (-15-(0.38)));
            zz = -0.52 + (((tickAnim - 27) / 3) * (0-(-0.52)));
        }
        else if (tickAnim >= 30 && tickAnim < 33) {
            xx = 0 + (((tickAnim - 30) / 3) * (-26.51345-(0)));
            yy = -15 + (((tickAnim - 30) / 3) * (3.54524-(-15)));
            zz = 0 + (((tickAnim - 30) / 3) * (-15.26974-(0)));
        }
        else if (tickAnim >= 33 && tickAnim < 37) {
            xx = -26.51345 + (((tickAnim - 33) / 4) * (-56.19829-(-26.51345)));
            yy = 3.54524 + (((tickAnim - 33) / 4) * (15.76323-(3.54524)));
            zz = -15.26974 + (((tickAnim - 33) / 4) * (-1.04053-(-15.26974)));
        }
        else if (tickAnim >= 37 && tickAnim < 40) {
            xx = -56.19829 + (((tickAnim - 37) / 3) * (-28.1-(-56.19829)));
            yy = 15.76323 + (((tickAnim - 37) / 3) * (0.38-(15.76323)));
            zz = -1.04053 + (((tickAnim - 37) / 3) * (-0.52-(-1.04053)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(legl4, legl4.rotateAngleX + (float) Math.toRadians(xx), legl4.rotateAngleY + (float) Math.toRadians(yy), legl4.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 5) {
            xx = -34.46 + (((tickAnim - 0) / 5) * (16.36124-(-34.46)));
            yy = 12.5 + (((tickAnim - 0) / 5) * (-15.6899-(12.5)));
            zz = 4.38 + (((tickAnim - 0) / 5) * (1.84247-(4.38)));
        }
        else if (tickAnim >= 5 && tickAnim < 8) {
            xx = 16.36124 + (((tickAnim - 5) / 3) * (-18.90829-(16.36124)));
            yy = -15.6899 + (((tickAnim - 5) / 3) * (4.40371-(-15.6899)));
            zz = 1.84247 + (((tickAnim - 5) / 3) * (-8.9731-(1.84247)));
        }
        else if (tickAnim >= 8 && tickAnim < 12) {
            xx = -18.90829 + (((tickAnim - 8) / 4) * (-51.39766-(-18.90829)));
            yy = 4.40371 + (((tickAnim - 8) / 4) * (21.90018-(4.40371)));
            zz = -8.9731 + (((tickAnim - 8) / 4) * (5.23093-(-8.9731)));
        }
        else if (tickAnim >= 12 && tickAnim < 13) {
            xx = -51.39766 + (((tickAnim - 12) / 1) * (-34.46-(-51.39766)));
            yy = 21.90018 + (((tickAnim - 12) / 1) * (12.5-(21.90018)));
            zz = 5.23093 + (((tickAnim - 12) / 1) * (4.38-(5.23093)));
        }
        else if (tickAnim >= 13 && tickAnim < 18) {
            xx = -34.46 + (((tickAnim - 13) / 5) * (16.36124-(-34.46)));
            yy = 12.5 + (((tickAnim - 13) / 5) * (-15.6899-(12.5)));
            zz = 4.38 + (((tickAnim - 13) / 5) * (1.84247-(4.38)));
        }
        else if (tickAnim >= 18 && tickAnim < 22) {
            xx = 16.36124 + (((tickAnim - 18) / 4) * (-18.90829-(16.36124)));
            yy = -15.6899 + (((tickAnim - 18) / 4) * (4.40371-(-15.6899)));
            zz = 1.84247 + (((tickAnim - 18) / 4) * (-8.9731-(1.84247)));
        }
        else if (tickAnim >= 22 && tickAnim < 25) {
            xx = -18.90829 + (((tickAnim - 22) / 3) * (-51.39766-(-18.90829)));
            yy = 4.40371 + (((tickAnim - 22) / 3) * (21.90018-(4.40371)));
            zz = -8.9731 + (((tickAnim - 22) / 3) * (5.23093-(-8.9731)));
        }
        else if (tickAnim >= 25 && tickAnim < 27) {
            xx = -51.39766 + (((tickAnim - 25) / 2) * (-34.46-(-51.39766)));
            yy = 21.90018 + (((tickAnim - 25) / 2) * (12.5-(21.90018)));
            zz = 5.23093 + (((tickAnim - 25) / 2) * (4.38-(5.23093)));
        }
        else if (tickAnim >= 27 && tickAnim < 32) {
            xx = -34.46 + (((tickAnim - 27) / 5) * (16.36124-(-34.46)));
            yy = 12.5 + (((tickAnim - 27) / 5) * (-15.6899-(12.5)));
            zz = 4.38 + (((tickAnim - 27) / 5) * (1.84247-(4.38)));
        }
        else if (tickAnim >= 32 && tickAnim < 35) {
            xx = 16.36124 + (((tickAnim - 32) / 3) * (-18.90829-(16.36124)));
            yy = -15.6899 + (((tickAnim - 32) / 3) * (4.40371-(-15.6899)));
            zz = 1.84247 + (((tickAnim - 32) / 3) * (-8.9731-(1.84247)));
        }
        else if (tickAnim >= 35 && tickAnim < 38) {
            xx = -18.90829 + (((tickAnim - 35) / 3) * (-51.39766-(-18.90829)));
            yy = 4.40371 + (((tickAnim - 35) / 3) * (21.90018-(4.40371)));
            zz = -8.9731 + (((tickAnim - 35) / 3) * (5.23093-(-8.9731)));
        }
        else if (tickAnim >= 38 && tickAnim < 40) {
            xx = -51.39766 + (((tickAnim - 38) / 2) * (-34.46-(-51.39766)));
            yy = 21.90018 + (((tickAnim - 38) / 2) * (12.5-(21.90018)));
            zz = 5.23093 + (((tickAnim - 38) / 2) * (4.38-(5.23093)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(legl3, legl3.rotateAngleX + (float) Math.toRadians(xx), legl3.rotateAngleY + (float) Math.toRadians(yy), legl3.rotateAngleZ + (float) Math.toRadians(zz));

    }
    public void animBeach(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime, boolean isStatic) {
        EntityPrehistoricFloraHomarus entity = (EntityPrehistoricFloraHomarus) entitylivingbaseIn;
        int animCycle = 60;
        double tickAnim = (entity.ticksExisted + entity.getTickOffset()) - (int) (Math.floor((double) (entity.ticksExisted + entity.getTickOffset()) / (double) animCycle) * (double) animCycle) + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;

        if (tickAnim >= 0 && tickAnim < 8) {
            xx = 12.52832 + (((tickAnim - 0) / 8) * (12.52832-(12.52832)));
            yy = -4.95712 + (((tickAnim - 0) / 8) * (-4.95712-(-4.95712)));
            zz = -0.65426 + (((tickAnim - 0) / 8) * (-0.65426-(-0.65426)));
        }
        else if (tickAnim >= 8 && tickAnim < 21) {
            xx = 12.52832 + (((tickAnim - 8) / 13) * (10.28313-(12.52832)));
            yy = -4.95712 + (((tickAnim - 8) / 13) * (-5.37827-(-4.95712)));
            zz = -0.65426 + (((tickAnim - 8) / 13) * (1.75486-(-0.65426)));
        }
        else if (tickAnim >= 21 && tickAnim < 28) {
            xx = 10.28313 + (((tickAnim - 21) / 7) * (12.21-(10.28313)));
            yy = -5.37827 + (((tickAnim - 21) / 7) * (-3.01-(-5.37827)));
            zz = 1.75486 + (((tickAnim - 21) / 7) * (0.44-(1.75486)));
        }
        else if (tickAnim >= 28 && tickAnim < 33) {
            xx = 12.21 + (((tickAnim - 28) / 5) * (13.65405-(12.21)));
            yy = -3.01 + (((tickAnim - 28) / 5) * (-4.73303-(-3.01)));
            zz = 0.44 + (((tickAnim - 28) / 5) * (-0.54275-(0.44)));
        }
        else if (tickAnim >= 33 && tickAnim < 39) {
            xx = 13.65405 + (((tickAnim - 33) / 6) * (11.14405-(13.65405)));
            yy = -4.73303 + (((tickAnim - 33) / 6) * (-4.67302-(-4.73303)));
            zz = -0.54275 + (((tickAnim - 33) / 6) * (-0.7973-(-0.54275)));
        }
        else if (tickAnim >= 39 && tickAnim < 44) {
            xx = 11.14405 + (((tickAnim - 39) / 5) * (12.52832-(11.14405)));
            yy = -4.67302 + (((tickAnim - 39) / 5) * (-4.95712-(-4.67302)));
            zz = -0.7973 + (((tickAnim - 39) / 5) * (-0.35426-(-0.7973)));
        }
        else if (tickAnim >= 44 && tickAnim < 60) {
            xx = 12.52832 + (((tickAnim - 44) / 16) * (12.52832-(12.52832)));
            yy = -4.95712 + (((tickAnim - 44) / 16) * (-4.95712-(-4.95712)));
            zz = -0.35426 + (((tickAnim - 44) / 16) * (-0.65426-(-0.35426)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Body, Body.rotateAngleX + (float) Math.toRadians(xx), Body.rotateAngleY + (float) Math.toRadians(yy), Body.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 0) / 8) * (0-(0)));
            yy = -2.6 + (((tickAnim - 0) / 8) * (-2.6-(-2.6)));
            zz = 0 + (((tickAnim - 0) / 8) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 23) {
            xx = 0 + (((tickAnim - 8) / 15) * (-0.3-(0)));
            yy = -2.6 + (((tickAnim - 8) / 15) * (-2.35-(-2.6)));
            zz = 0 + (((tickAnim - 8) / 15) * (0-(0)));
        }
        else if (tickAnim >= 23 && tickAnim < 33) {
            xx = -0.3 + (((tickAnim - 23) / 10) * (0-(-0.3)));
            yy = -2.35 + (((tickAnim - 23) / 10) * (-2.2-(-2.35)));
            zz = 0 + (((tickAnim - 23) / 10) * (0-(0)));
        }
        else if (tickAnim >= 33 && tickAnim < 38) {
            xx = 0 + (((tickAnim - 33) / 5) * (0.3-(0)));
            yy = -2.2 + (((tickAnim - 33) / 5) * (-2.38-(-2.2)));
            zz = 0 + (((tickAnim - 33) / 5) * (0-(0)));
        }
        else if (tickAnim >= 38 && tickAnim < 44) {
            xx = 0.3 + (((tickAnim - 38) / 6) * (0-(0.3)));
            yy = -2.38 + (((tickAnim - 38) / 6) * (-2.6-(-2.38)));
            zz = 0 + (((tickAnim - 38) / 6) * (0-(0)));
        }
        else if (tickAnim >= 44 && tickAnim < 60) {
            xx = 0 + (((tickAnim - 44) / 16) * (0-(0)));
            yy = -2.6 + (((tickAnim - 44) / 16) * (-2.6-(-2.6)));
            zz = 0 + (((tickAnim - 44) / 16) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.Body.rotationPointX = this.Body.rotationPointX + (float)(xx);
        this.Body.rotationPointY = this.Body.rotationPointY - (float)(yy);
        this.Body.rotationPointZ = this.Body.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 21) {
            xx = -12.5 + (((tickAnim - 0) / 21) * (-4.5-(-12.5)));
            yy = -21 + (((tickAnim - 0) / 21) * (-21-(-21)));
            zz = -10.4 + (((tickAnim - 0) / 21) * (-10.4-(-10.4)));
        }
        else if (tickAnim >= 21 && tickAnim < 33) {
            xx = -4.5 + (((tickAnim - 21) / 12) * (-11.8087-(-4.5)));
            yy = -21 + (((tickAnim - 21) / 12) * (-17.4237-(-21)));
            zz = -10.4 + (((tickAnim - 21) / 12) * (-3.806-(-10.4)));
        }
        else if (tickAnim >= 33 && tickAnim < 39) {
            xx = -11.8087 + (((tickAnim - 33) / 6) * (-7.03-(-11.8087)));
            yy = -17.4237 + (((tickAnim - 33) / 6) * (-21-(-17.4237)));
            zz = -3.806 + (((tickAnim - 33) / 6) * (-10.4-(-3.806)));
        }
        else if (tickAnim >= 39 && tickAnim < 44) {
            xx = -7.03 + (((tickAnim - 39) / 5) * (-12.34-(-7.03)));
            yy = -21 + (((tickAnim - 39) / 5) * (-21-(-21)));
            zz = -10.4 + (((tickAnim - 39) / 5) * (-10.4-(-10.4)));
        }
        else if (tickAnim >= 44 && tickAnim < 60) {
            xx = -12.34 + (((tickAnim - 44) / 16) * (-12.5-(-12.34)));
            yy = -21 + (((tickAnim - 44) / 16) * (-21-(-21)));
            zz = -10.4 + (((tickAnim - 44) / 16) * (-10.4-(-10.4)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(antennule_r, antennule_r.rotateAngleX + (float) Math.toRadians(xx), antennule_r.rotateAngleY + (float) Math.toRadians(yy), antennule_r.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 60) {
            xx = -12.45965 + (((tickAnim - 0) / 60) * (-12.45965-(-12.45965)));
            yy = 0 + (((tickAnim - 0) / 60) * (0-(0)));
            zz = -6 + (((tickAnim - 0) / 60) * (-6-(-6)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(antenna_r, antenna_r.rotateAngleX + (float) Math.toRadians(xx), antenna_r.rotateAngleY + (float) Math.toRadians(yy), antenna_r.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 8) {
            xx = 14.2405 + (((tickAnim - 0) / 8) * (13.35995-(14.2405)));
            yy = -0.2863 + (((tickAnim - 0) / 8) * (-1.09919-(-0.2863)));
            zz = -5.5876 + (((tickAnim - 0) / 8) * (-3.02939-(-5.5876)));
        }
        else if (tickAnim >= 8 && tickAnim < 21) {
            xx = 13.35995 + (((tickAnim - 8) / 13) * (25.234-(13.35995)));
            yy = -1.09919 + (((tickAnim - 8) / 13) * (-2.2493-(-1.09919)));
            zz = -3.02939 + (((tickAnim - 8) / 13) * (-3.8906-(-3.02939)));
        }
        else if (tickAnim >= 21 && tickAnim < 33) {
            xx = 25.234 + (((tickAnim - 21) / 12) * (14.6648-(25.234)));
            yy = -2.2493 + (((tickAnim - 21) / 12) * (-0.3969-(-2.2493)));
            zz = -3.8906 + (((tickAnim - 21) / 12) * (-2.416-(-3.8906)));
        }
        else if (tickAnim >= 33 && tickAnim < 35) {
            xx = 14.6648 + (((tickAnim - 33) / 2) * (15.4-(14.6648)));
            yy = -0.3969 + (((tickAnim - 33) / 2) * (0-(-0.3969)));
            zz = -2.416 + (((tickAnim - 33) / 2) * (-2.1-(-2.416)));
        }
        else if (tickAnim >= 35 && tickAnim < 39) {
            xx = 15.4 + (((tickAnim - 35) / 4) * (19.4839-(15.4)));
            yy = 0 + (((tickAnim - 35) / 4) * (1.5193-(0)));
            zz = -2.1 + (((tickAnim - 35) / 4) * (-2.0119-(-2.1)));
        }
        else if (tickAnim >= 39 && tickAnim < 44) {
            xx = 19.4839 + (((tickAnim - 39) / 5) * (15.5845-(19.4839)));
            yy = 1.5193 + (((tickAnim - 39) / 5) * (3.3425-(1.5193)));
            zz = -2.0119 + (((tickAnim - 39) / 5) * (-1.9062-(-2.0119)));
        }
        else if (tickAnim >= 44 && tickAnim < 48) {
            xx = 15.5845 + (((tickAnim - 44) / 4) * (14.6516-(15.5845)));
            yy = 3.3425 + (((tickAnim - 44) / 4) * (4.5579-(3.3425)));
            zz = -1.9062 + (((tickAnim - 44) / 4) * (-1.8358-(-1.9062)));
        }
        else if (tickAnim >= 48 && tickAnim < 60) {
            xx = 14.6516 + (((tickAnim - 48) / 12) * (14.2405-(14.6516)));
            yy = 4.5579 + (((tickAnim - 48) / 12) * (-0.2863-(4.5579)));
            zz = -1.8358 + (((tickAnim - 48) / 12) * (-5.5876-(-1.8358)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(antenna_r3, antenna_r3.rotateAngleX + (float) Math.toRadians(xx), antenna_r3.rotateAngleY + (float) Math.toRadians(yy), antenna_r3.rotateAngleZ + (float) Math.toRadians(zz));



        this.setRotateAngle(antenna_l, antenna_l.rotateAngleX + (float) Math.toRadians(20), antenna_l.rotateAngleY + (float) Math.toRadians(0), antenna_l.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(antenna_l2, antenna_l2.rotateAngleX + (float) Math.toRadians(0), antenna_l2.rotateAngleY + (float) Math.toRadians(15), antenna_l2.rotateAngleZ + (float) Math.toRadians(0));



        if (tickAnim >= 0 && tickAnim < 8) {
            xx = -10.51351 + (((tickAnim - 0) / 8) * (-10.1931-(-10.51351)));
            yy = 23.86611 + (((tickAnim - 0) / 8) * (23.7253-(23.86611)));
            zz = 18.46243 + (((tickAnim - 0) / 8) * (16.7377-(18.46243)));
        }
        else if (tickAnim >= 8 && tickAnim < 21) {
            xx = -10.1931 + (((tickAnim - 8) / 13) * (-6.8458-(-10.1931)));
            yy = 23.7253 + (((tickAnim - 8) / 13) * (23.4751-(23.7253)));
            zz = 16.7377 + (((tickAnim - 8) / 13) * (13.6716-(16.7377)));
        }
        else if (tickAnim >= 21 && tickAnim < 27) {
            xx = -6.8458 + (((tickAnim - 21) / 6) * (-9.55131-(-6.8458)));
            yy = 23.4751 + (((tickAnim - 21) / 6) * (23.97251-(23.4751)));
            zz = 13.6716 + (((tickAnim - 21) / 6) * (17.41523-(13.6716)));
        }
        else if (tickAnim >= 27 && tickAnim < 33) {
            xx = -9.55131 + (((tickAnim - 27) / 6) * (-11.55449-(-9.55131)));
            yy = 23.97251 + (((tickAnim - 27) / 6) * (31.63704-(23.97251)));
            zz = 17.41523 + (((tickAnim - 27) / 6) * (13.87237-(17.41523)));
        }
        else if (tickAnim >= 33 && tickAnim < 39) {
            xx = -11.55449 + (((tickAnim - 33) / 6) * (-9.751-(-11.55449)));
            yy = 31.63704 + (((tickAnim - 33) / 6) * (33.3872-(31.63704)));
            zz = 13.87237 + (((tickAnim - 33) / 6) * (16.7219-(13.87237)));
        }
        else if (tickAnim >= 39 && tickAnim < 44) {
            xx = -9.751 + (((tickAnim - 39) / 5) * (-13.3423-(-9.751)));
            yy = 33.3872 + (((tickAnim - 39) / 5) * (34.3619-(33.3872)));
            zz = 16.7219 + (((tickAnim - 39) / 5) * (17.1809-(16.7219)));
        }
        else if (tickAnim >= 44 && tickAnim < 49) {
            xx = -13.3423 + (((tickAnim - 44) / 5) * (-12.93365-(-13.3423)));
            yy = 34.3619 + (((tickAnim - 44) / 5) * (35.33662-(34.3619)));
            zz = 17.1809 + (((tickAnim - 44) / 5) * (17.63985-(17.1809)));
        }
        else if (tickAnim >= 49 && tickAnim < 60) {
            xx = -12.93365 + (((tickAnim - 49) / 11) * (-10.51351-(-12.93365)));
            yy = 35.33662 + (((tickAnim - 49) / 11) * (23.86611-(35.33662)));
            zz = 17.63985 + (((tickAnim - 49) / 11) * (18.46243-(17.63985)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(antenna_l3, antenna_l3.rotateAngleX + (float) Math.toRadians(xx), antenna_l3.rotateAngleY + (float) Math.toRadians(yy), antenna_l3.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 8) {
            xx = -5 + (((tickAnim - 0) / 8) * (-5-(-5)));
            yy = 0 + (((tickAnim - 0) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 8) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 21) {
            xx = -5 + (((tickAnim - 8) / 13) * (-4-(-5)));
            yy = 0 + (((tickAnim - 8) / 13) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 13) * (0-(0)));
        }
        else if (tickAnim >= 21 && tickAnim < 33) {
            xx = -4 + (((tickAnim - 21) / 12) * (-9-(-4)));
            yy = 0 + (((tickAnim - 21) / 12) * (0-(0)));
            zz = 0 + (((tickAnim - 21) / 12) * (0-(0)));
        }
        else if (tickAnim >= 33 && tickAnim < 39) {
            xx = -9 + (((tickAnim - 33) / 6) * (-5.15-(-9)));
            yy = 0 + (((tickAnim - 33) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 33) / 6) * (0-(0)));
        }
        else if (tickAnim >= 39 && tickAnim < 60) {
            xx = -5.15 + (((tickAnim - 39) / 21) * (-5-(-5.15)));
            yy = 0 + (((tickAnim - 39) / 21) * (0-(0)));
            zz = 0 + (((tickAnim - 39) / 21) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Tail, Tail.rotateAngleX + (float) Math.toRadians(xx), Tail.rotateAngleY + (float) Math.toRadians(yy), Tail.rotateAngleZ + (float) Math.toRadians(zz));



        this.setRotateAngle(plpl, plpl.rotateAngleX + (float) Math.toRadians(52.43632), plpl.rotateAngleY + (float) Math.toRadians(-8.60726), plpl.rotateAngleZ + (float) Math.toRadians(18.20975));


        this.setRotateAngle(plpr, plpr.rotateAngleX + (float) Math.toRadians(54.77584), plpr.rotateAngleY + (float) Math.toRadians(-1.34168), plpr.rotateAngleZ + (float) Math.toRadians(-7.86531));


        this.setRotateAngle(plpl2, plpl2.rotateAngleX + (float) Math.toRadians(50.6957), plpl2.rotateAngleY + (float) Math.toRadians(2.94771), plpl2.rotateAngleZ + (float) Math.toRadians(12.88608));


        this.setRotateAngle(plpr2, plpr2.rotateAngleX + (float) Math.toRadians(50.6957), plpr2.rotateAngleY + (float) Math.toRadians(-2.94771), plpr2.rotateAngleZ + (float) Math.toRadians(-12.88608));


        this.setRotateAngle(plpl3, plpl3.rotateAngleX + (float) Math.toRadians(37.02542), plpl3.rotateAngleY + (float) Math.toRadians(4.69218), plpl3.rotateAngleZ + (float) Math.toRadians(9.31974));


        this.setRotateAngle(plpr3, plpr3.rotateAngleX + (float) Math.toRadians(37.02542), plpr3.rotateAngleY + (float) Math.toRadians(-4.69218), plpr3.rotateAngleZ + (float) Math.toRadians(-9.31974));


        this.setRotateAngle(plpl4, plpl4.rotateAngleX + (float) Math.toRadians(22.5), plpl4.rotateAngleY + (float) Math.toRadians(0), plpl4.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(plpr4, plpr4.rotateAngleX + (float) Math.toRadians(22.5), plpr4.rotateAngleY + (float) Math.toRadians(0), plpr4.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(plpl5, plpl5.rotateAngleX + (float) Math.toRadians(17.5), plpl5.rotateAngleY + (float) Math.toRadians(0), plpl5.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(plpr5, plpr5.rotateAngleX + (float) Math.toRadians(17.5), plpr5.rotateAngleY + (float) Math.toRadians(0), plpr5.rotateAngleZ + (float) Math.toRadians(0));



        if (tickAnim >= 0 && tickAnim < 21) {
            xx = -7.52603 + (((tickAnim - 0) / 21) * (-7.8831-(-7.52603)));
            yy = 25.93867 + (((tickAnim - 0) / 21) * (25.2931-(25.93867)));
            zz = 12.07502 + (((tickAnim - 0) / 21) * (10.492-(12.07502)));
        }
        else if (tickAnim >= 21 && tickAnim < 28) {
            xx = -7.8831 + (((tickAnim - 21) / 7) * (-8.5405-(-7.8831)));
            yy = 25.2931 + (((tickAnim - 21) / 7) * (23.7187-(25.2931)));
            zz = 10.492 + (((tickAnim - 21) / 7) * (8.8067-(10.492)));
        }
        else if (tickAnim >= 28 && tickAnim < 33) {
            xx = -8.5405 + (((tickAnim - 28) / 5) * (-8.1707-(-8.5405)));
            yy = 23.7187 + (((tickAnim - 28) / 5) * (25.4461-(23.7187)));
            zz = 8.8067 + (((tickAnim - 28) / 5) * (7.4784-(8.8067)));
        }
        else if (tickAnim >= 33 && tickAnim < 41) {
            xx = -8.1707 + (((tickAnim - 33) / 8) * (-7.8907-(-8.1707)));
            yy = 25.4461 + (((tickAnim - 33) / 8) * (24.9607-(25.4461)));
            zz = 7.4784 + (((tickAnim - 33) / 8) * (11.9416-(7.4784)));
        }
        else if (tickAnim >= 41 && tickAnim < 60) {
            xx = -7.8907 + (((tickAnim - 41) / 19) * (-7.52603-(-7.8907)));
            yy = 24.9607 + (((tickAnim - 41) / 19) * (25.93867-(24.9607)));
            zz = 11.9416 + (((tickAnim - 41) / 19) * (12.07502-(11.9416)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(legr4, legr4.rotateAngleX + (float) Math.toRadians(xx), legr4.rotateAngleY + (float) Math.toRadians(yy), legr4.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 0) / 8) * (0.0209-(0)));
            yy = 0 + (((tickAnim - 0) / 8) * (-0.043-(0)));
            zz = 10 + (((tickAnim - 0) / 8) * (10.3682-(10)));
        }
        else if (tickAnim >= 8 && tickAnim < 21) {
            xx = 0.0209 + (((tickAnim - 8) / 13) * (-0.3519-(0.0209)));
            yy = -0.043 + (((tickAnim - 8) / 13) * (-0.4768-(-0.043)));
            zz = 10.3682 + (((tickAnim - 8) / 13) * (7.6126-(10.3682)));
        }
        else if (tickAnim >= 21 && tickAnim < 28) {
            xx = -0.3519 + (((tickAnim - 21) / 7) * (-0.6522-(-0.3519)));
            yy = -0.4768 + (((tickAnim - 21) / 7) * (-1.8821-(-0.4768)));
            zz = 7.6126 + (((tickAnim - 21) / 7) * (8.2806-(7.6126)));
        }
        else if (tickAnim >= 28 && tickAnim < 33) {
            xx = -0.6522 + (((tickAnim - 28) / 5) * (-0.2439-(-0.6522)));
            yy = -1.8821 + (((tickAnim - 28) / 5) * (-0.3901-(-1.8821)));
            zz = 8.2806 + (((tickAnim - 28) / 5) * (8.7765-(8.2806)));
        }
        else if (tickAnim >= 33 && tickAnim < 39) {
            xx = -0.2439 + (((tickAnim - 33) / 6) * (-0.0954-(-0.2439)));
            yy = -0.3901 + (((tickAnim - 33) / 6) * (-0.2356-(-0.3901)));
            zz = 8.7765 + (((tickAnim - 33) / 6) * (10.0007-(8.7765)));
        }
        else if (tickAnim >= 39 && tickAnim < 44) {
            xx = -0.0954 + (((tickAnim - 39) / 5) * (-0.03-(-0.0954)));
            yy = -0.2356 + (((tickAnim - 39) / 5) * (0.0035-(-0.2356)));
            zz = 10.0007 + (((tickAnim - 39) / 5) * (9.965-(10.0007)));
        }
        else if (tickAnim >= 44 && tickAnim < 60) {
            xx = -0.03 + (((tickAnim - 44) / 16) * (0-(-0.03)));
            yy = 0.0035 + (((tickAnim - 44) / 16) * (0-(0.0035)));
            zz = 9.965 + (((tickAnim - 44) / 16) * (10-(9.965)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(legr3, legr3.rotateAngleX + (float) Math.toRadians(xx), legr3.rotateAngleY + (float) Math.toRadians(yy), legr3.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 10) {
            xx = -18.8391 + (((tickAnim - 0) / 10) * (-18.8391-(-18.8391)));
            yy = -5.81558 + (((tickAnim - 0) / 10) * (-5.81558-(-5.81558)));
            zz = 20.75557 + (((tickAnim - 0) / 10) * (20.75557-(20.75557)));
        }
        else if (tickAnim >= 10 && tickAnim < 25) {
            xx = -18.8391 + (((tickAnim - 10) / 15) * (11.99579-(-18.8391)));
            yy = -5.81558 + (((tickAnim - 10) / 15) * (15.11957-(-5.81558)));
            zz = 20.75557 + (((tickAnim - 10) / 15) * (19.74942-(20.75557)));
        }
        else if (tickAnim >= 25 && tickAnim < 38) {
            xx = 11.99579 + (((tickAnim - 25) / 13) * (-7.19243-(11.99579)));
            yy = 15.11957 + (((tickAnim - 25) / 13) * (8.89695-(15.11957)));
            zz = 19.74942 + (((tickAnim - 25) / 13) * (22.75177-(19.74942)));
        }
        else if (tickAnim >= 38 && tickAnim < 55) {
            xx = -7.19243 + (((tickAnim - 38) / 17) * (-18.8391-(-7.19243)));
            yy = 8.89695 + (((tickAnim - 38) / 17) * (-5.81558-(8.89695)));
            zz = 22.75177 + (((tickAnim - 38) / 17) * (20.75557-(22.75177)));
        }
        else if (tickAnim >= 55 && tickAnim < 60) {
            xx = -18.8391 + (((tickAnim - 55) / 5) * (-18.8391-(-18.8391)));
            yy = -5.81558 + (((tickAnim - 55) / 5) * (-5.81558-(-5.81558)));
            zz = 20.75557 + (((tickAnim - 55) / 5) * (20.75557-(20.75557)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(legr2, legr2.rotateAngleX + (float) Math.toRadians(xx), legr2.rotateAngleY + (float) Math.toRadians(yy), legr2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 14) {
            xx = -32.5 + (((tickAnim - 0) / 14) * (-30.06021-(-32.5)));
            yy = 0 + (((tickAnim - 0) / 14) * (1.22218-(0)));
            zz = -12.5 + (((tickAnim - 0) / 14) * (-13.98787-(-12.5)));
        }
        else if (tickAnim >= 14 && tickAnim < 22) {
            xx = -30.06021 + (((tickAnim - 14) / 8) * (-33.63437-(-30.06021)));
            yy = 1.22218 + (((tickAnim - 14) / 8) * (7.36534-(1.22218)));
            zz = -13.98787 + (((tickAnim - 14) / 8) * (-15.25652-(-13.98787)));
        }
        else if (tickAnim >= 22 && tickAnim < 43) {
            xx = -33.63437 + (((tickAnim - 22) / 21) * (-33.63437-(-33.63437)));
            yy = 7.36534 + (((tickAnim - 22) / 21) * (7.36534-(7.36534)));
            zz = -15.25652 + (((tickAnim - 22) / 21) * (-15.25652-(-15.25652)));
        }
        else if (tickAnim >= 43 && tickAnim < 51) {
            xx = -33.63437 + (((tickAnim - 43) / 8) * (-20.0015-(-33.63437)));
            yy = 7.36534 + (((tickAnim - 43) / 8) * (2.8695-(7.36534)));
            zz = -15.25652 + (((tickAnim - 43) / 8) * (-22.77719-(-15.25652)));
        }
        else if (tickAnim >= 51 && tickAnim < 60) {
            xx = -20.0015 + (((tickAnim - 51) / 9) * (-32.5-(-20.0015)));
            yy = 2.8695 + (((tickAnim - 51) / 9) * (0-(2.8695)));
            zz = -22.77719 + (((tickAnim - 51) / 9) * (-12.5-(-22.77719)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(legl2, legl2.rotateAngleX + (float) Math.toRadians(xx), legl2.rotateAngleY + (float) Math.toRadians(yy), legl2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 9) {
            xx = -36.12105 + (((tickAnim - 0) / 9) * (-36.12105-(-36.12105)));
            yy = 15.60203 + (((tickAnim - 0) / 9) * (15.60203-(15.60203)));
            zz = 17.94832 + (((tickAnim - 0) / 9) * (17.94832-(17.94832)));
        }
        else if (tickAnim >= 9 && tickAnim < 25) {
            xx = -36.12105 + (((tickAnim - 9) / 16) * (-37.07893-(-36.12105)));
            yy = 15.60203 + (((tickAnim - 9) / 16) * (7.45165-(15.60203)));
            zz = 17.94832 + (((tickAnim - 9) / 16) * (18.36082-(17.94832)));
        }
        else if (tickAnim >= 25 && tickAnim < 41) {
            xx = -37.07893 + (((tickAnim - 25) / 16) * (-26.46782-(-37.07893)));
            yy = 7.45165 + (((tickAnim - 25) / 16) * (9.63897-(7.45165)));
            zz = 18.36082 + (((tickAnim - 25) / 16) * (24.28469-(18.36082)));
        }
        else if (tickAnim >= 41 && tickAnim < 60) {
            xx = -26.46782 + (((tickAnim - 41) / 19) * (-36.12105-(-26.46782)));
            yy = 9.63897 + (((tickAnim - 41) / 19) * (15.60203-(9.63897)));
            zz = 24.28469 + (((tickAnim - 41) / 19) * (17.94832-(24.28469)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(legr, legr.rotateAngleX + (float) Math.toRadians(xx), legr.rotateAngleY + (float) Math.toRadians(yy), legr.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 60) {
            xx = -51.5564 + (((tickAnim - 0) / 60) * (-51.5564-(-51.5564)));
            yy = -3.57838 + (((tickAnim - 0) / 60) * (-3.57838-(-3.57838)));
            zz = -9.29032 + (((tickAnim - 0) / 60) * (-9.29032-(-9.29032)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(legl, legl.rotateAngleX + (float) Math.toRadians(xx), legl.rotateAngleY + (float) Math.toRadians(yy), legl.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 8) {
            xx = 5.05016 + (((tickAnim - 0) / 8) * (2.50467-(5.05016)));
            yy = 5.34357 + (((tickAnim - 0) / 8) * (4.96505-(5.34357)));
            zz = 11.33135 + (((tickAnim - 0) / 8) * (9.93122-(11.33135)));
        }
        else if (tickAnim >= 8 && tickAnim < 18) {
            xx = 2.50467 + (((tickAnim - 8) / 10) * (6.27735-(2.50467)));
            yy = 4.96505 + (((tickAnim - 8) / 10) * (4.46035-(4.96505)));
            zz = 9.93122 + (((tickAnim - 8) / 10) * (8.06438-(9.93122)));
        }
        else if (tickAnim >= 18 && tickAnim < 21) {
            xx = 6.27735 + (((tickAnim - 18) / 3) * (7.84293-(6.27735)));
            yy = 4.46035 + (((tickAnim - 18) / 3) * (4.29412-(4.46035)));
            zz = 8.06438 + (((tickAnim - 18) / 3) * (7.96278-(8.06438)));
        }
        else if (tickAnim >= 21 && tickAnim < 28) {
            xx = 7.84293 + (((tickAnim - 21) / 7) * (7.0979-(7.84293)));
            yy = 4.29412 + (((tickAnim - 21) / 7) * (-1.8015-(4.29412)));
            zz = 7.96278 + (((tickAnim - 21) / 7) * (11.6918-(7.96278)));
        }
        else if (tickAnim >= 28 && tickAnim < 33) {
            xx = 7.0979 + (((tickAnim - 28) / 5) * (3.86476-(7.0979)));
            yy = -1.8015 + (((tickAnim - 28) / 5) * (0.26318-(-1.8015)));
            zz = 11.6918 + (((tickAnim - 28) / 5) * (10.29061-(11.6918)));
        }
        else if (tickAnim >= 33 && tickAnim < 40) {
            xx = 3.86476 + (((tickAnim - 33) / 7) * (6.68379-(3.86476)));
            yy = 0.26318 + (((tickAnim - 33) / 7) * (5.18146-(0.26318)));
            zz = 10.29061 + (((tickAnim - 33) / 7) * (12.25178-(10.29061)));
        }
        else if (tickAnim >= 40 && tickAnim < 44) {
            xx = 6.68379 + (((tickAnim - 40) / 4) * (2.71547-(6.68379)));
            yy = 5.18146 + (((tickAnim - 40) / 4) * (3.84114-(5.18146)));
            zz = 12.25178 + (((tickAnim - 40) / 4) * (8.10323-(12.25178)));
        }
        else if (tickAnim >= 44 && tickAnim < 48) {
            xx = 2.71547 + (((tickAnim - 44) / 4) * (4.05016-(2.71547)));
            yy = 3.84114 + (((tickAnim - 44) / 4) * (5.34357-(3.84114)));
            zz = 8.10323 + (((tickAnim - 44) / 4) * (11.33135-(8.10323)));
        }
        else if (tickAnim >= 48 && tickAnim < 60) {
            xx = 4.05016 + (((tickAnim - 48) / 12) * (5.05016-(4.05016)));
            yy = 5.34357 + (((tickAnim - 48) / 12) * (5.34357-(5.34357)));
            zz = 11.33135 + (((tickAnim - 48) / 12) * (11.33135-(11.33135)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(armr, armr.rotateAngleX + (float) Math.toRadians(xx), armr.rotateAngleY + (float) Math.toRadians(yy), armr.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 8) {
            xx = -36.75 + (((tickAnim - 0) / 8) * (-33.13-(-36.75)));
            yy = 0 + (((tickAnim - 0) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 8) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 23) {
            xx = -33.13 + (((tickAnim - 8) / 15) * (-35-(-33.13)));
            yy = 0 + (((tickAnim - 8) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 15) * (0-(0)));
        }
        else if (tickAnim >= 23 && tickAnim < 35) {
            xx = -35 + (((tickAnim - 23) / 12) * (-33-(-35)));
            yy = 0 + (((tickAnim - 23) / 12) * (0-(0)));
            zz = 0 + (((tickAnim - 23) / 12) * (0-(0)));
        }
        else if (tickAnim >= 35 && tickAnim < 39) {
            xx = -33 + (((tickAnim - 35) / 4) * (-33.68-(-33)));
            yy = 0 + (((tickAnim - 35) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 35) / 4) * (0-(0)));
        }
        else if (tickAnim >= 39 && tickAnim < 41) {
            xx = -33.68 + (((tickAnim - 39) / 2) * (-35-(-33.68)));
            yy = 0 + (((tickAnim - 39) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 39) / 2) * (0-(0)));
        }
        else if (tickAnim >= 41 && tickAnim < 44) {
            xx = -35 + (((tickAnim - 41) / 3) * (-33.75-(-35)));
            yy = 0 + (((tickAnim - 41) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 41) / 3) * (0-(0)));
        }
        else if (tickAnim >= 44 && tickAnim < 48) {
            xx = -33.75 + (((tickAnim - 44) / 4) * (-35-(-33.75)));
            yy = 0 + (((tickAnim - 44) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 44) / 4) * (0-(0)));
        }
        else if (tickAnim >= 48 && tickAnim < 60) {
            xx = -35 + (((tickAnim - 48) / 12) * (-36.75-(-35)));
            yy = 0 + (((tickAnim - 48) / 12) * (0-(0)));
            zz = 0 + (((tickAnim - 48) / 12) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(armr2, armr2.rotateAngleX + (float) Math.toRadians(xx), armr2.rotateAngleY + (float) Math.toRadians(yy), armr2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 21) {
            xx = 0 + (((tickAnim - 0) / 21) * (0-(0)));
            yy = -30 + (((tickAnim - 0) / 21) * (-30-(-30)));
            zz = 0 + (((tickAnim - 0) / 21) * (0-(0)));
        }
        else if (tickAnim >= 21 && tickAnim < 28) {
            xx = 0 + (((tickAnim - 21) / 7) * (0-(0)));
            yy = -30 + (((tickAnim - 21) / 7) * (-27.5-(-30)));
            zz = 0 + (((tickAnim - 21) / 7) * (0-(0)));
        }
        else if (tickAnim >= 28 && tickAnim < 33) {
            xx = 0 + (((tickAnim - 28) / 5) * (0-(0)));
            yy = -27.5 + (((tickAnim - 28) / 5) * (-30-(-27.5)));
            zz = 0 + (((tickAnim - 28) / 5) * (0-(0)));
        }
        else if (tickAnim >= 33 && tickAnim < 40) {
            xx = 0 + (((tickAnim - 33) / 7) * (0-(0)));
            yy = -30 + (((tickAnim - 33) / 7) * (-30.68-(-30)));
            zz = 0 + (((tickAnim - 33) / 7) * (0-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 60) {
            xx = 0 + (((tickAnim - 40) / 20) * (0-(0)));
            yy = -30.68 + (((tickAnim - 40) / 20) * (-30-(-30.68)));
            zz = 0 + (((tickAnim - 40) / 20) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(armr3, armr3.rotateAngleX + (float) Math.toRadians(xx), armr3.rotateAngleY + (float) Math.toRadians(yy), armr3.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 21) {
            xx = -11.01226 + (((tickAnim - 0) / 21) * (-17.55881-(-11.01226)));
            yy = -2.89032 + (((tickAnim - 0) / 21) * (-5.04158-(-2.89032)));
            zz = -6.14791 + (((tickAnim - 0) / 21) * (-11.21073-(-6.14791)));
        }
        else if (tickAnim >= 21 && tickAnim < 33) {
            xx = -17.55881 + (((tickAnim - 21) / 12) * (-14.86221-(-17.55881)));
            yy = -5.04158 + (((tickAnim - 21) / 12) * (-2.35568-(-5.04158)));
            zz = -11.21073 + (((tickAnim - 21) / 12) * (-5.01805-(-11.21073)));
        }
        else if (tickAnim >= 33 && tickAnim < 39) {
            xx = -14.86221 + (((tickAnim - 33) / 6) * (-8.24096-(-14.86221)));
            yy = -2.35568 + (((tickAnim - 33) / 6) * (-5.25647-(-2.35568)));
            zz = -5.01805 + (((tickAnim - 33) / 6) * (-8.97303-(-5.01805)));
        }
        else if (tickAnim >= 39 && tickAnim < 43) {
            xx = -8.24096 + (((tickAnim - 39) / 4) * (-11.21436-(-8.24096)));
            yy = -5.25647 + (((tickAnim - 39) / 4) * (-3.20064-(-5.25647)));
            zz = -8.97303 + (((tickAnim - 39) / 4) * (-4.29271-(-8.97303)));
        }
        else if (tickAnim >= 43 && tickAnim < 60) {
            xx = -11.21436 + (((tickAnim - 43) / 17) * (-11.01226-(-11.21436)));
            yy = -3.20064 + (((tickAnim - 43) / 17) * (-2.89032-(-3.20064)));
            zz = -4.29271 + (((tickAnim - 43) / 17) * (-6.14791-(-4.29271)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(arml, arml.rotateAngleX + (float) Math.toRadians(xx), arml.rotateAngleY + (float) Math.toRadians(yy), arml.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 21) {
            xx = -15 + (((tickAnim - 0) / 21) * (0.98-(-15)));
            yy = 0 + (((tickAnim - 0) / 21) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 21) * (0-(0)));
        }
        else if (tickAnim >= 21 && tickAnim < 27) {
            xx = 0.98 + (((tickAnim - 21) / 6) * (-3.5-(0.98)));
            yy = 0 + (((tickAnim - 21) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 21) / 6) * (0-(0)));
        }
        else if (tickAnim >= 27 && tickAnim < 38) {
            xx = -3.5 + (((tickAnim - 27) / 11) * (-12.5-(-3.5)));
            yy = 0 + (((tickAnim - 27) / 11) * (0-(0)));
            zz = 0 + (((tickAnim - 27) / 11) * (0-(0)));
        }
        else if (tickAnim >= 38 && tickAnim < 45) {
            xx = -12.5 + (((tickAnim - 38) / 7) * (-15-(-12.5)));
            yy = 0 + (((tickAnim - 38) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 38) / 7) * (0-(0)));
        }
        else if (tickAnim >= 45 && tickAnim < 60) {
            xx = -15 + (((tickAnim - 45) / 15) * (-15-(-15)));
            yy = 0 + (((tickAnim - 45) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 45) / 15) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(arml2, arml2.rotateAngleX + (float) Math.toRadians(xx), arml2.rotateAngleY + (float) Math.toRadians(yy), arml2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 25) {
            xx = 0 + (((tickAnim - 0) / 25) * (2.3676-(0)));
            yy = 0 + (((tickAnim - 0) / 25) * (9.3275-(0)));
            zz = 0 + (((tickAnim - 0) / 25) * (4.3924-(0)));
        }
        else if (tickAnim >= 25 && tickAnim < 43) {
            xx = 2.3676 + (((tickAnim - 25) / 18) * (1.2648-(2.3676)));
            yy = 9.3275 + (((tickAnim - 25) / 18) * (9.6626-(9.3275)));
            zz = 4.3924 + (((tickAnim - 25) / 18) * (2.3302-(4.3924)));
        }
        else if (tickAnim >= 43 && tickAnim < 60) {
            xx = 1.2648 + (((tickAnim - 43) / 17) * (0-(1.2648)));
            yy = 9.6626 + (((tickAnim - 43) / 17) * (0-(9.6626)));
            zz = 2.3302 + (((tickAnim - 43) / 17) * (0-(2.3302)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(arml3, arml3.rotateAngleX + (float) Math.toRadians(xx), arml3.rotateAngleY + (float) Math.toRadians(yy), arml3.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 21) {
            xx = -12.5 + (((tickAnim - 0) / 21) * (-5.5-(-12.5)));
            yy = 0 + (((tickAnim - 0) / 21) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 21) * (0-(0)));
        }
        else if (tickAnim >= 21 && tickAnim < 33) {
            xx = -5.5 + (((tickAnim - 21) / 12) * (-11.59-(-5.5)));
            yy = 0 + (((tickAnim - 21) / 12) * (0-(0)));
            zz = 0 + (((tickAnim - 21) / 12) * (0-(0)));
        }
        else if (tickAnim >= 33 && tickAnim < 39) {
            xx = -11.59 + (((tickAnim - 33) / 6) * (-6.81-(-11.59)));
            yy = 0 + (((tickAnim - 33) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 33) / 6) * (0-(0)));
        }
        else if (tickAnim >= 39 && tickAnim < 44) {
            xx = -6.81 + (((tickAnim - 39) / 5) * (-12.18-(-6.81)));
            yy = 0 + (((tickAnim - 39) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 39) / 5) * (0-(0)));
        }
        else if (tickAnim >= 44 && tickAnim < 60) {
            xx = -12.18 + (((tickAnim - 44) / 16) * (-12.5-(-12.18)));
            yy = 0 + (((tickAnim - 44) / 16) * (0-(0)));
            zz = 0 + (((tickAnim - 44) / 16) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(antennule_l, antennule_l.rotateAngleX + (float) Math.toRadians(xx), antennule_l.rotateAngleY + (float) Math.toRadians(yy), antennule_l.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 8) {
            xx = 0.8488 + (((tickAnim - 0) / 8) * (0.8611-(0.8488)));
            yy = 35.6572 + (((tickAnim - 0) / 8) * (35.6981-(35.6572)));
            zz = -9.55916 + (((tickAnim - 0) / 8) * (-9.30706-(-9.55916)));
        }
        else if (tickAnim >= 8 && tickAnim < 17) {
            xx = 0.8611 + (((tickAnim - 8) / 9) * (1.02367-(0.8611)));
            yy = 35.6981 + (((tickAnim - 8) / 9) * (31.48324-(35.6981)));
            zz = -9.30706 + (((tickAnim - 8) / 9) * (-9.75427-(-9.30706)));
        }
        else if (tickAnim >= 17 && tickAnim < 23) {
            xx = 1.02367 + (((tickAnim - 17) / 6) * (1.77953-(1.02367)));
            yy = 31.48324 + (((tickAnim - 17) / 6) * (24.11067-(31.48324)));
            zz = -9.75427 + (((tickAnim - 17) / 6) * (-8.89896-(-9.75427)));
        }
        else if (tickAnim >= 23 && tickAnim < 32) {
            xx = 1.77953 + (((tickAnim - 23) / 9) * (2.01973-(1.77953)));
            yy = 24.11067 + (((tickAnim - 23) / 9) * (24.68767-(24.11067)));
            zz = -8.89896 + (((tickAnim - 23) / 9) * (-4.62836-(-8.89896)));
        }
        else if (tickAnim >= 32 && tickAnim < 38) {
            xx = 2.01973 + (((tickAnim - 32) / 6) * (0.67856-(2.01973)));
            yy = 24.68767 + (((tickAnim - 32) / 6) * (32.36898-(24.68767)));
            zz = -4.62836 + (((tickAnim - 32) / 6) * (-7.66109-(-4.62836)));
        }
        else if (tickAnim >= 38 && tickAnim < 47) {
            xx = 0.67856 + (((tickAnim - 38) / 9) * (0.8631-(0.67856)));
            yy = 32.36898 + (((tickAnim - 38) / 9) * (35.6942-(32.36898)));
            zz = -7.66109 + (((tickAnim - 38) / 9) * (-9.30546-(-7.66109)));
        }
        else if (tickAnim >= 47 && tickAnim < 60) {
            xx = 0.8631 + (((tickAnim - 47) / 13) * (0.8489-(0.8631)));
            yy = 35.6942 + (((tickAnim - 47) / 13) * (35.6572-(35.6942)));
            zz = -9.30546 + (((tickAnim - 47) / 13) * (-9.55916-(-9.30546)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(legl4, legl4.rotateAngleX + (float) Math.toRadians(xx), legl4.rotateAngleY + (float) Math.toRadians(yy), legl4.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 8) {
            xx = -0.51147 + (((tickAnim - 0) / 8) * (-0.4563-(-0.51147)));
            yy = 11.15734 + (((tickAnim - 0) / 8) * (11.0298-(11.15734)));
            zz = -10.51579 + (((tickAnim - 0) / 8) * (-10.4723-(-10.51579)));
        }
        else if (tickAnim >= 8 && tickAnim < 21) {
            xx = -0.4563 + (((tickAnim - 8) / 13) * (-0.8497-(-0.4563)));
            yy = 11.0298 + (((tickAnim - 8) / 13) * (11.9774-(11.0298)));
            zz = -10.4723 + (((tickAnim - 8) / 13) * (-11.9338-(-10.4723)));
        }
        else if (tickAnim >= 21 && tickAnim < 28) {
            xx = -0.8497 + (((tickAnim - 21) / 7) * (-0.0134-(-0.8497)));
            yy = 11.9774 + (((tickAnim - 21) / 7) * (9.4939-(11.9774)));
            zz = -11.9338 + (((tickAnim - 21) / 7) * (-10.1525-(-11.9338)));
        }
        else if (tickAnim >= 28 && tickAnim < 33) {
            xx = -0.0134 + (((tickAnim - 28) / 5) * (-0.3626-(-0.0134)));
            yy = 9.4939 + (((tickAnim - 28) / 5) * (11.248-(9.4939)));
            zz = -10.1525 + (((tickAnim - 28) / 5) * (-8.4824-(-10.1525)));
        }
        else if (tickAnim >= 33 && tickAnim < 39) {
            xx = -0.3626 + (((tickAnim - 33) / 6) * (-0.4563-(-0.3626)));
            yy = 11.248 + (((tickAnim - 33) / 6) * (11.3087-(11.248)));
            zz = -8.4824 + (((tickAnim - 33) / 6) * (-9.2628-(-8.4824)));
        }
        else if (tickAnim >= 39 && tickAnim < 45) {
            xx = -0.4563 + (((tickAnim - 39) / 6) * (-0.5444-(-0.4563)));
            yy = 11.3087 + (((tickAnim - 39) / 6) * (11.0424-(11.3087)));
            zz = -9.2628 + (((tickAnim - 39) / 6) * (-11.1124-(-9.2628)));
        }
        else if (tickAnim >= 45 && tickAnim < 60) {
            xx = -0.5444 + (((tickAnim - 45) / 15) * (-0.51147-(-0.5444)));
            yy = 11.0424 + (((tickAnim - 45) / 15) * (11.15734-(11.0424)));
            zz = -11.1124 + (((tickAnim - 45) / 15) * (-10.51579-(-11.1124)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(legl3, legl3.rotateAngleX + (float) Math.toRadians(xx), legl3.rotateAngleY + (float) Math.toRadians(yy), legl3.rotateAngleZ + (float) Math.toRadians(zz));

    }
    public void animIdle(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime, boolean isStatic) {
        EntityPrehistoricFloraHomarus entity = (EntityPrehistoricFloraHomarus) entitylivingbaseIn;
        int animCycle = 160;
        double tickAnim = (entity.ticksExisted + entity.getTickOffset()) - (int) (Math.floor((double) (entity.ticksExisted + entity.getTickOffset()) / (double) animCycle) * (double) animCycle) + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;

        if (tickAnim >= 0 && tickAnim < 27) {
            xx = 0 + (((tickAnim - 0) / 27) * (-10-(0)));
            yy = 0 + (((tickAnim - 0) / 27) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 27) * (10-(0)));
        }
        else if (tickAnim >= 27 && tickAnim < 80) {
            xx = -10 + (((tickAnim - 27) / 53) * (0-(-10)));
            yy = 0 + (((tickAnim - 27) / 53) * (0-(0)));
            zz = 10 + (((tickAnim - 27) / 53) * (0-(10)));
        }
        else if (tickAnim >= 80 && tickAnim < 160) {
            xx = 0 + (((tickAnim - 80) / 80) * (0-(0)));
            yy = 0 + (((tickAnim - 80) / 80) * (0-(0)));
            zz = 0 + (((tickAnim - 80) / 80) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(antenna_r, antenna_r.rotateAngleX + (float) Math.toRadians(xx), antenna_r.rotateAngleY + (float) Math.toRadians(yy), antenna_r.rotateAngleZ + (float) Math.toRadians(zz));



        this.setRotateAngle(antenna_r2, antenna_r2.rotateAngleX + (float) Math.toRadians(0), antenna_r2.rotateAngleY + (float) Math.toRadians(20+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*45))*40), antenna_r2.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(antenna_r3, antenna_r3.rotateAngleX + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*90*3))*10), antenna_r3.rotateAngleY + (float) Math.toRadians(-10+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180))*10), antenna_r3.rotateAngleZ + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*90*3+60))*10));



        if (tickAnim >= 0 && tickAnim < 24) {
            xx = 0 + (((tickAnim - 0) / 24) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 24) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 24) * (0-(0)));
        }
        else if (tickAnim >= 24 && tickAnim < 57) {
            xx = 0 + (((tickAnim - 24) / 33) * (-10-(0)));
            yy = 0 + (((tickAnim - 24) / 33) * (0-(0)));
            zz = 0 + (((tickAnim - 24) / 33) * (-10-(0)));
        }
        else if (tickAnim >= 57 && tickAnim < 160) {
            xx = -10 + (((tickAnim - 57) / 103) * (0-(-10)));
            yy = 0 + (((tickAnim - 57) / 103) * (0-(0)));
            zz = -10 + (((tickAnim - 57) / 103) * (0-(-10)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(antenna_l, antenna_l.rotateAngleX + (float) Math.toRadians(xx), antenna_l.rotateAngleY + (float) Math.toRadians(yy), antenna_l.rotateAngleZ + (float) Math.toRadians(zz));



        this.setRotateAngle(antenna_l2, antenna_l2.rotateAngleX + (float) Math.toRadians(0), antenna_l2.rotateAngleY + (float) Math.toRadians(-20-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*45-60*2))*40), antenna_l2.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(antenna_l3, antenna_l3.rotateAngleX + (float) Math.toRadians(-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*90*3+60*2))*10), antenna_l3.rotateAngleY + (float) Math.toRadians(10+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180+60*2))*10), antenna_l3.rotateAngleZ + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*90*3+60*3))*10));


        this.setRotateAngle(antennule_r, antennule_r.rotateAngleX + (float) Math.toRadians(-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*90*4-60))*5-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*90*6-60))*5), antennule_r.rotateAngleY + (float) Math.toRadians(-10-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*90*2-60))*5-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*90-60))*10), antennule_r.rotateAngleZ + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*90-60))*10));


        this.setRotateAngle(plpl, plpl.rotateAngleX + (float) Math.toRadians(-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*90*4-30))*20), plpl.rotateAngleY + (float) Math.toRadians(0), plpl.rotateAngleZ + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*90*4-60-30))*10));


        this.setRotateAngle(plpr, plpr.rotateAngleX + (float) Math.toRadians(-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*90*4))*20), plpr.rotateAngleY + (float) Math.toRadians(0), plpr.rotateAngleZ + (float) Math.toRadians(-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*90*4-60))*10));


        this.setRotateAngle(plpl2, plpl2.rotateAngleX + (float) Math.toRadians(-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*90*4-60-30))*20), plpl2.rotateAngleY + (float) Math.toRadians(0), plpl2.rotateAngleZ + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*90*4-60*2-30))*10));


        this.setRotateAngle(plpr2, plpr2.rotateAngleX + (float) Math.toRadians(-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*90*4-60))*20), plpr2.rotateAngleY + (float) Math.toRadians(0), plpr2.rotateAngleZ + (float) Math.toRadians(-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*90*4-60*2))*10));


        this.setRotateAngle(plpl3, plpl3.rotateAngleX + (float) Math.toRadians(-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*90*4-60*2-30))*20), plpl3.rotateAngleY + (float) Math.toRadians(0), plpl3.rotateAngleZ + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*90*4-60*3-30))*10));


        this.setRotateAngle(plpr3, plpr3.rotateAngleX + (float) Math.toRadians(-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*90*4-60*2))*20), plpr3.rotateAngleY + (float) Math.toRadians(0), plpr3.rotateAngleZ + (float) Math.toRadians(-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*90*4-60*3))*10));


        this.setRotateAngle(plpl4, plpl4.rotateAngleX + (float) Math.toRadians(-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*90*4-60*3-30))*20), plpl4.rotateAngleY + (float) Math.toRadians(0), plpl4.rotateAngleZ + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*90*4-60*4-30))*10));


        this.setRotateAngle(plpr4, plpr4.rotateAngleX + (float) Math.toRadians(-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*90*4-60*3))*20), plpr4.rotateAngleY + (float) Math.toRadians(0), plpr4.rotateAngleZ + (float) Math.toRadians(-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*90*4-60*4))*10));


        this.setRotateAngle(plpl5, plpl5.rotateAngleX + (float) Math.toRadians(-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*90*4-60*4-30))*20), plpl5.rotateAngleY + (float) Math.toRadians(0), plpl5.rotateAngleZ + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*90*4-60*5-30))*10));


        this.setRotateAngle(plpr5, plpr5.rotateAngleX + (float) Math.toRadians(-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*90*4-60*4))*20), plpr5.rotateAngleY + (float) Math.toRadians(0), plpr5.rotateAngleZ + (float) Math.toRadians(-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*90*4-60*5))*10));


        this.setRotateAngle(mandibleR, mandibleR.rotateAngleX + (float) Math.toRadians(20-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*90*3))*10), mandibleR.rotateAngleY + (float) Math.toRadians(10-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*90*2-60))*10), mandibleR.rotateAngleZ + (float) Math.toRadians(10+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*90-60))*10));


        this.setRotateAngle(mandibleL, mandibleL.rotateAngleX + (float) Math.toRadians(20-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*90*3-60))*10), mandibleL.rotateAngleY + (float) Math.toRadians(-10+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*90*2-60*2))*10), mandibleL.rotateAngleZ + (float) Math.toRadians(-10-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*90-60*2))*10));


        this.setRotateAngle(antennule_l, antennule_l.rotateAngleX + (float) Math.toRadians(-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*90*4))*5-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*90*6))*5), antennule_l.rotateAngleY + (float) Math.toRadians(-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*90*2))*5), antennule_l.rotateAngleZ + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*90))*10));


    }
    public void animThreat(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime, double animTick) {
        EntityPrehistoricFloraHomarus entity = (EntityPrehistoricFloraHomarus) entitylivingbaseIn;
        int animCycle = 30;
        double tickAnim = animTick + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;
         if (tickAnim >= 0 && tickAnim < 6) {
            xx = 0 + (((tickAnim - 0) / 6) * (-10-(0)));
            yy = 0 + (((tickAnim - 0) / 6) * (7.5-(0)));
            zz = 0 + (((tickAnim - 0) / 6) * (0-(0)));
        }
        else if (tickAnim >= 6 && tickAnim < 10) {
            xx = -10 + (((tickAnim - 6) / 4) * (-10.65-(-10)));
            yy = 7.5 + (((tickAnim - 6) / 4) * (3.09-(7.5)));
            zz = 0 + (((tickAnim - 6) / 4) * (-1.47-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 13) {
            xx = -10.65 + (((tickAnim - 10) / 3) * (-6.79-(-10.65)));
            yy = 3.09 + (((tickAnim - 10) / 3) * (7.94-(3.09)));
            zz = -1.47 + (((tickAnim - 10) / 3) * (-2.36-(-1.47)));
        }
        else if (tickAnim >= 13 && tickAnim < 17) {
            xx = -6.79 + (((tickAnim - 13) / 4) * (-2.94-(-6.79)));
            yy = 7.94 + (((tickAnim - 13) / 4) * (2.79-(7.94)));
            zz = -2.36 + (((tickAnim - 13) / 4) * (-3.24-(-2.36)));
        }
        else if (tickAnim >= 17 && tickAnim < 22) {
            xx = -2.94 + (((tickAnim - 17) / 5) * (4.78-(-2.94)));
            yy = 2.79 + (((tickAnim - 17) / 5) * (0-(2.79)));
            zz = -3.24 + (((tickAnim - 17) / 5) * (-5-(-3.24)));
        }
        else if (tickAnim >= 22 && tickAnim < 28) {
            xx = 4.78 + (((tickAnim - 22) / 6) * (1.2-(4.78)));
            yy = 0 + (((tickAnim - 22) / 6) * (-4.29-(0)));
            zz = -5 + (((tickAnim - 22) / 6) * (-1.25-(-5)));
        }
        else if (tickAnim >= 28 && tickAnim < 30) {
            xx = 1.2 + (((tickAnim - 28) / 2) * (0-(1.2)));
            yy = -4.29 + (((tickAnim - 28) / 2) * (0-(-4.29)));
            zz = -1.25 + (((tickAnim - 28) / 2) * (0-(-1.25)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Body, Body.rotateAngleX + (float) Math.toRadians(xx), Body.rotateAngleY + (float) Math.toRadians(yy), Body.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 12) {
            xx = 0 + (((tickAnim - 0) / 12) * (4-(0)));
            yy = 0 + (((tickAnim - 0) / 12) * (1-(0)));
            zz = 0 + (((tickAnim - 0) / 12) * (11-(0)));
        }
        else if (tickAnim >= 12 && tickAnim < 15) {
            xx = 4 + (((tickAnim - 12) / 3) * (3.22-(4)));
            yy = 1 + (((tickAnim - 12) / 3) * (1-(1)));
            zz = 11 + (((tickAnim - 12) / 3) * (10.45-(11)));
        }
        else if (tickAnim >= 15 && tickAnim < 19) {
            xx = 3.22 + (((tickAnim - 15) / 4) * (2-(3.22)));
            yy = 1 + (((tickAnim - 15) / 4) * (1-(1)));
            zz = 10.45 + (((tickAnim - 15) / 4) * (9.77-(10.45)));
        }
        else if (tickAnim >= 19 && tickAnim < 25) {
            xx = 2 + (((tickAnim - 19) / 6) * (0-(2)));
            yy = 1 + (((tickAnim - 19) / 6) * (0.46-(1)));
            zz = 9.77 + (((tickAnim - 19) / 6) * (6.51-(9.77)));
        }
        else if (tickAnim >= 25 && tickAnim < 30) {
            xx = 0 + (((tickAnim - 25) / 5) * (0-(0)));
            yy = 0.46 + (((tickAnim - 25) / 5) * (0-(0.46)));
            zz = 6.51 + (((tickAnim - 25) / 5) * (0-(6.51)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.Body.rotationPointX = this.Body.rotationPointX + (float)(xx);
        this.Body.rotationPointY = this.Body.rotationPointY - (float)(yy);
        this.Body.rotationPointZ = this.Body.rotationPointZ + (float)(zz);



        this.setRotateAngle(antennule_r, antennule_r.rotateAngleX + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*240*4-60))*10), antennule_r.rotateAngleY + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*240*2-60))*10), antennule_r.rotateAngleZ + (float) Math.toRadians(-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*240*3-60))*10));



        if (tickAnim >= 0 && tickAnim < 6) {
            xx = 0 + (((tickAnim - 0) / 6) * (-10.5629-(0)));
            yy = 0 + (((tickAnim - 0) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 6) * (19.0449-(0)));
        }
        else if (tickAnim >= 6 && tickAnim < 9) {
            xx = -10.5629 + (((tickAnim - 6) / 3) * (-4.106-(-10.5629)));
            yy = 0 + (((tickAnim - 6) / 3) * (0-(0)));
            zz = 19.0449 + (((tickAnim - 6) / 3) * (16.4181-(19.0449)));
        }
        else if (tickAnim >= 9 && tickAnim < 30) {
            xx = -4.106 + (((tickAnim - 9) / 21) * (0-(-4.106)));
            yy = 0 + (((tickAnim - 9) / 21) * (0-(0)));
            zz = 16.4181 + (((tickAnim - 9) / 21) * (0-(16.4181)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(antenna_r, antenna_r.rotateAngleX + (float) Math.toRadians(xx), antenna_r.rotateAngleY + (float) Math.toRadians(yy), antenna_r.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 0) / 8) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 8) * (50-(0)));
            zz = 0 + (((tickAnim - 0) / 8) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 18) {
            xx = 0 + (((tickAnim - 8) / 10) * (0-(0)));
            yy = 50 + (((tickAnim - 8) / 10) * (0-(50)));
            zz = 0 + (((tickAnim - 8) / 10) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 30) {
            xx = 0 + (((tickAnim - 18) / 12) * (0-(0)));
            yy = 0 + (((tickAnim - 18) / 12) * (0-(0)));
            zz = 0 + (((tickAnim - 18) / 12) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(antenna_r2, antenna_r2.rotateAngleX + (float) Math.toRadians(xx), antenna_r2.rotateAngleY + (float) Math.toRadians(yy), antenna_r2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 0) / 8) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 8) * (42.5-(0)));
            zz = 0 + (((tickAnim - 0) / 8) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 30) {
            xx = 0 + (((tickAnim - 8) / 22) * (0-(0)));
            yy = 42.5 + (((tickAnim - 8) / 22) * (0-(42.5)));
            zz = 0 + (((tickAnim - 8) / 22) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(antenna_r3, antenna_r3.rotateAngleX + (float) Math.toRadians(xx), antenna_r3.rotateAngleY + (float) Math.toRadians(yy), antenna_r3.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 6) {
            xx = 0 + (((tickAnim - 0) / 6) * (-9.8942-(0)));
            yy = 0 + (((tickAnim - 0) / 6) * (-1.4697-(0)));
            zz = 0 + (((tickAnim - 0) / 6) * (-26.2497-(0)));
        }
        else if (tickAnim >= 6 && tickAnim < 30) {
            xx = -9.8942 + (((tickAnim - 6) / 24) * (0-(-9.8942)));
            yy = -1.4697 + (((tickAnim - 6) / 24) * (0-(-1.4697)));
            zz = -26.2497 + (((tickAnim - 6) / 24) * (0-(-26.2497)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(antenna_l, antenna_l.rotateAngleX + (float) Math.toRadians(xx), antenna_l.rotateAngleY + (float) Math.toRadians(yy), antenna_l.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 0) / 8) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 8) * (-50-(0)));
            zz = 0 + (((tickAnim - 0) / 8) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 18) {
            xx = 0 + (((tickAnim - 8) / 10) * (0-(0)));
            yy = -50 + (((tickAnim - 8) / 10) * (0-(-50)));
            zz = 0 + (((tickAnim - 8) / 10) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 30) {
            xx = 0 + (((tickAnim - 18) / 12) * (0-(0)));
            yy = 0 + (((tickAnim - 18) / 12) * (0-(0)));
            zz = 0 + (((tickAnim - 18) / 12) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(antenna_l2, antenna_l2.rotateAngleX + (float) Math.toRadians(xx), antenna_l2.rotateAngleY + (float) Math.toRadians(yy), antenna_l2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 0) / 8) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 8) * (-45-(0)));
            zz = 0 + (((tickAnim - 0) / 8) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 30) {
            xx = 0 + (((tickAnim - 8) / 22) * (0-(0)));
            yy = -45 + (((tickAnim - 8) / 22) * (0-(-45)));
            zz = 0 + (((tickAnim - 8) / 22) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(antenna_l3, antenna_l3.rotateAngleX + (float) Math.toRadians(xx), antenna_l3.rotateAngleY + (float) Math.toRadians(yy), antenna_l3.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 0) / 5) * (5-(0)));
            yy = 0 + (((tickAnim - 0) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 5) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 7) {
            xx = 5 + (((tickAnim - 5) / 2) * (10.74-(5)));
            yy = 0 + (((tickAnim - 5) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 5) / 2) * (0-(0)));
        }
        else if (tickAnim >= 7 && tickAnim < 22) {
            xx = 10.74 + (((tickAnim - 7) / 15) * (9.46-(10.74)));
            yy = 0 + (((tickAnim - 7) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 7) / 15) * (0-(0)));
        }
        else if (tickAnim >= 22 && tickAnim < 30) {
            xx = 9.46 + (((tickAnim - 22) / 8) * (0-(9.46)));
            yy = 0 + (((tickAnim - 22) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 22) / 8) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Tail, Tail.rotateAngleX + (float) Math.toRadians(xx), Tail.rotateAngleY + (float) Math.toRadians(yy), Tail.rotateAngleZ + (float) Math.toRadians(zz));



        this.setRotateAngle(plpl, plpl.rotateAngleX + (float) Math.toRadians(-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*240*3-30))*20), plpl.rotateAngleY + (float) Math.toRadians(0), plpl.rotateAngleZ + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*240*3-60-30))*10));


        this.setRotateAngle(plpr, plpr.rotateAngleX + (float) Math.toRadians(-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*240*3))*20), plpr.rotateAngleY + (float) Math.toRadians(0), plpr.rotateAngleZ + (float) Math.toRadians(-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*240*3-60))*10));



        if (tickAnim >= 0 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 0) / 8) * (2.5-(0)));
            yy = 0 + (((tickAnim - 0) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 8) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 30) {
            xx = 2.5 + (((tickAnim - 8) / 22) * (0-(2.5)));
            yy = 0 + (((tickAnim - 8) / 22) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 22) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Tail2, Tail2.rotateAngleX + (float) Math.toRadians(xx), Tail2.rotateAngleY + (float) Math.toRadians(yy), Tail2.rotateAngleZ + (float) Math.toRadians(zz));



        this.setRotateAngle(plpl2, plpl2.rotateAngleX + (float) Math.toRadians(-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*240*3-60-30))*20), plpl2.rotateAngleY + (float) Math.toRadians(0), plpl2.rotateAngleZ + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*240*3-60*2-30))*10));


        this.setRotateAngle(plpr2, plpr2.rotateAngleX + (float) Math.toRadians(-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*240*3-60))*20), plpr2.rotateAngleY + (float) Math.toRadians(0), plpr2.rotateAngleZ + (float) Math.toRadians(-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*240*3-60*2))*10));



        if (tickAnim >= 0 && tickAnim < 4) {
            xx = 0 + (((tickAnim - 0) / 4) * (-0.36-(0)));
            yy = 0 + (((tickAnim - 0) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 4) * (0-(0)));
        }
        else if (tickAnim >= 4 && tickAnim < 8) {
            xx = -0.36 + (((tickAnim - 4) / 4) * (3.1-(-0.36)));
            yy = 0 + (((tickAnim - 4) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 4) / 4) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 22) {
            xx = 3.1 + (((tickAnim - 8) / 14) * (-6.82-(3.1)));
            yy = 0 + (((tickAnim - 8) / 14) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 14) * (0-(0)));
        }
        else if (tickAnim >= 22 && tickAnim < 30) {
            xx = -6.82 + (((tickAnim - 22) / 8) * (0-(-6.82)));
            yy = 0 + (((tickAnim - 22) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 22) / 8) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Tail3, Tail3.rotateAngleX + (float) Math.toRadians(xx), Tail3.rotateAngleY + (float) Math.toRadians(yy), Tail3.rotateAngleZ + (float) Math.toRadians(zz));



        this.setRotateAngle(plpl3, plpl3.rotateAngleX + (float) Math.toRadians(-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*240*3-60*2-30))*20), plpl3.rotateAngleY + (float) Math.toRadians(0), plpl3.rotateAngleZ + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*240*3-60*3-30))*10));


        this.setRotateAngle(plpr3, plpr3.rotateAngleX + (float) Math.toRadians(-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*240*3-60*2))*20), plpr3.rotateAngleY + (float) Math.toRadians(0), plpr3.rotateAngleZ + (float) Math.toRadians(-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*240*3-60*3))*10));



        if (tickAnim >= 0 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 0) / 8) * (17.5-(0)));
            yy = 0 + (((tickAnim - 0) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 8) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 18) {
            xx = 17.5 + (((tickAnim - 8) / 10) * (4.43-(17.5)));
            yy = 0 + (((tickAnim - 8) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 10) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 30) {
            xx = 4.43 + (((tickAnim - 18) / 12) * (0-(4.43)));
            yy = 0 + (((tickAnim - 18) / 12) * (0-(0)));
            zz = 0 + (((tickAnim - 18) / 12) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Tail4, Tail4.rotateAngleX + (float) Math.toRadians(xx), Tail4.rotateAngleY + (float) Math.toRadians(yy), Tail4.rotateAngleZ + (float) Math.toRadians(zz));



        this.setRotateAngle(plpl4, plpl4.rotateAngleX + (float) Math.toRadians(-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*240*3-60*3-30))*20), plpl4.rotateAngleY + (float) Math.toRadians(0), plpl4.rotateAngleZ + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*240*3-60*4-30))*10));


        this.setRotateAngle(plpr4, plpr4.rotateAngleX + (float) Math.toRadians(-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*240*3-60*3))*20), plpr4.rotateAngleY + (float) Math.toRadians(0), plpr4.rotateAngleZ + (float) Math.toRadians(-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*240*3-60*4))*10));



        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 0 + (((tickAnim - 0) / 3) * (31.79-(0)));
            yy = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 3) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 8) {
            xx = 31.79 + (((tickAnim - 3) / 5) * (40-(31.79)));
            yy = 0 + (((tickAnim - 3) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 3) / 5) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 16) {
            xx = 40 + (((tickAnim - 8) / 8) * (25.99-(40)));
            yy = 0 + (((tickAnim - 8) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 8) * (0-(0)));
        }
        else if (tickAnim >= 16 && tickAnim < 20) {
            xx = 25.99 + (((tickAnim - 16) / 4) * (14.32-(25.99)));
            yy = 0 + (((tickAnim - 16) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 16) / 4) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 30) {
            xx = 14.32 + (((tickAnim - 20) / 10) * (0-(14.32)));
            yy = 0 + (((tickAnim - 20) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 10) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Tail5, Tail5.rotateAngleX + (float) Math.toRadians(xx), Tail5.rotateAngleY + (float) Math.toRadians(yy), Tail5.rotateAngleZ + (float) Math.toRadians(zz));



        this.setRotateAngle(plpl5, plpl5.rotateAngleX + (float) Math.toRadians(-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*240*3-60*4-30))*20), plpl5.rotateAngleY + (float) Math.toRadians(0), plpl5.rotateAngleZ + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*240*3-60*5-30))*10));


        this.setRotateAngle(plpr5, plpr5.rotateAngleX + (float) Math.toRadians(-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*240*3-60*4))*20), plpr5.rotateAngleY + (float) Math.toRadians(0), plpr5.rotateAngleZ + (float) Math.toRadians(-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*240*3-60*5))*10));



        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 0 + (((tickAnim - 0) / 3) * (49.17-(0)));
            yy = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 3) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 4) {
            xx = 49.17 + (((tickAnim - 3) / 1) * (62.5-(49.17)));
            yy = 0 + (((tickAnim - 3) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 3) / 1) * (0-(0)));
        }
        else if (tickAnim >= 4 && tickAnim < 9) {
            xx = 62.5 + (((tickAnim - 4) / 5) * (57.32-(62.5)));
            yy = 0 + (((tickAnim - 4) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 4) / 5) * (0-(0)));
        }
        else if (tickAnim >= 9 && tickAnim < 16) {
            xx = 57.32 + (((tickAnim - 9) / 7) * (44.57-(57.32)));
            yy = 0 + (((tickAnim - 9) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 9) / 7) * (0-(0)));
        }
        else if (tickAnim >= 16 && tickAnim < 21) {
            xx = 44.57 + (((tickAnim - 16) / 5) * (0-(44.57)));
            yy = 0 + (((tickAnim - 16) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 16) / 5) * (0-(0)));
        }
        else if (tickAnim >= 21 && tickAnim < 30) {
            xx = 0 + (((tickAnim - 21) / 9) * (0-(0)));
            yy = 0 + (((tickAnim - 21) / 9) * (0-(0)));
            zz = 0 + (((tickAnim - 21) / 9) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(telson, telson.rotateAngleX + (float) Math.toRadians(xx), telson.rotateAngleY + (float) Math.toRadians(yy), telson.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 3) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 3) / 5) * (-6.73906-(0)));
            yy = 0 + (((tickAnim - 3) / 5) * (-8.99407-(0)));
            zz = 0 + (((tickAnim - 3) / 5) * (-29.31907-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 25) {
            xx = -6.73906 + (((tickAnim - 8) / 17) * (0-(-6.73906)));
            yy = -8.99407 + (((tickAnim - 8) / 17) * (0-(-8.99407)));
            zz = -29.31907 + (((tickAnim - 8) / 17) * (0-(-29.31907)));
        }
        else if (tickAnim >= 25 && tickAnim < 30) {
            xx = 0 + (((tickAnim - 25) / 5) * (0-(0)));
            yy = 0 + (((tickAnim - 25) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 25) / 5) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(bone23, bone23.rotateAngleX + (float) Math.toRadians(xx), bone23.rotateAngleY + (float) Math.toRadians(yy), bone23.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 4) {
            xx = 0 + (((tickAnim - 0) / 4) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 4) * (0-(0)));
        }
        else if (tickAnim >= 4 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 4) / 4) * (-2.8922-(0)));
            yy = 0 + (((tickAnim - 4) / 4) * (29.60863-(0)));
            zz = 0 + (((tickAnim - 4) / 4) * (-38.92189-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 17) {
            xx = -2.8922 + (((tickAnim - 8) / 9) * (-25.3922-(-2.8922)));
            yy = 29.60863 + (((tickAnim - 8) / 9) * (29.60863-(29.60863)));
            zz = -38.92189 + (((tickAnim - 8) / 9) * (-38.92189-(-38.92189)));
        }
        else if (tickAnim >= 17 && tickAnim < 21) {
            xx = -25.3922 + (((tickAnim - 17) / 4) * (0-(-25.3922)));
            yy = 29.60863 + (((tickAnim - 17) / 4) * (0-(29.60863)));
            zz = -38.92189 + (((tickAnim - 17) / 4) * (0-(-38.92189)));
        }
        else if (tickAnim >= 21 && tickAnim < 30) {
            xx = 0 + (((tickAnim - 21) / 9) * (0-(0)));
            yy = 0 + (((tickAnim - 21) / 9) * (0-(0)));
            zz = 0 + (((tickAnim - 21) / 9) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(UropodL, UropodL.rotateAngleX + (float) Math.toRadians(xx), UropodL.rotateAngleY + (float) Math.toRadians(yy), UropodL.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 4) {
            xx = 0 + (((tickAnim - 0) / 4) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 4) * (0-(0)));
        }
        else if (tickAnim >= 4 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 4) / 4) * (-2.8922-(0)));
            yy = 0 + (((tickAnim - 4) / 4) * (-29.60863-(0)));
            zz = 0 + (((tickAnim - 4) / 4) * (38.92189-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 17) {
            xx = -2.8922 + (((tickAnim - 8) / 9) * (-25.3922-(-2.8922)));
            yy = -29.60863 + (((tickAnim - 8) / 9) * (-29.60863-(-29.60863)));
            zz = 38.92189 + (((tickAnim - 8) / 9) * (38.92189-(38.92189)));
        }
        else if (tickAnim >= 17 && tickAnim < 21) {
            xx = -25.3922 + (((tickAnim - 17) / 4) * (0-(-25.3922)));
            yy = -29.60863 + (((tickAnim - 17) / 4) * (0-(-29.60863)));
            zz = 38.92189 + (((tickAnim - 17) / 4) * (0-(38.92189)));
        }
        else if (tickAnim >= 21 && tickAnim < 30) {
            xx = 0 + (((tickAnim - 21) / 9) * (0-(0)));
            yy = 0 + (((tickAnim - 21) / 9) * (0-(0)));
            zz = 0 + (((tickAnim - 21) / 9) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(uropodR, uropodR.rotateAngleX + (float) Math.toRadians(xx), uropodR.rotateAngleY + (float) Math.toRadians(yy), uropodR.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 3) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 3) / 5) * (-6.73906-(0)));
            yy = 0 + (((tickAnim - 3) / 5) * (8.99407-(0)));
            zz = 0 + (((tickAnim - 3) / 5) * (29.31907-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 25) {
            xx = -6.73906 + (((tickAnim - 8) / 17) * (0-(-6.73906)));
            yy = 8.99407 + (((tickAnim - 8) / 17) * (0-(8.99407)));
            zz = 29.31907 + (((tickAnim - 8) / 17) * (0-(29.31907)));
        }
        else if (tickAnim >= 25 && tickAnim < 30) {
            xx = 0 + (((tickAnim - 25) / 5) * (0-(0)));
            yy = 0 + (((tickAnim - 25) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 25) / 5) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(bone7, bone7.rotateAngleX + (float) Math.toRadians(xx), bone7.rotateAngleY + (float) Math.toRadians(yy), bone7.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 0 + (((tickAnim - 0) / 3) * (4.8806-(0)));
            yy = 0 + (((tickAnim - 0) / 3) * (-14.7826-(0)));
            zz = 0 + (((tickAnim - 0) / 3) * (-0.01-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 7) {
            xx = 4.8806 + (((tickAnim - 3) / 4) * (5-(4.8806)));
            yy = -14.7826 + (((tickAnim - 3) / 4) * (10-(-14.7826)));
            zz = -0.01 + (((tickAnim - 3) / 4) * (12.5-(-0.01)));
        }
        else if (tickAnim >= 7 && tickAnim < 9) {
            xx = 5 + (((tickAnim - 7) / 2) * (22.0172-(5)));
            yy = 10 + (((tickAnim - 7) / 2) * (8.7007-(10)));
            zz = 12.5 + (((tickAnim - 7) / 2) * (2.1616-(12.5)));
        }
        else if (tickAnim >= 9 && tickAnim < 12) {
            xx = 22.0172 + (((tickAnim - 9) / 3) * (22.5-(22.0172)));
            yy = 8.7007 + (((tickAnim - 9) / 3) * (10-(8.7007)));
            zz = 2.1616 + (((tickAnim - 9) / 3) * (20-(2.1616)));
        }
        else if (tickAnim >= 12 && tickAnim < 14) {
            xx = 22.5 + (((tickAnim - 12) / 2) * (-7.9112-(22.5)));
            yy = 10 + (((tickAnim - 12) / 2) * (-3.0162-(10)));
            zz = 20 + (((tickAnim - 12) / 2) * (2.8885-(20)));
        }
        else if (tickAnim >= 14 && tickAnim < 18) {
            xx = -7.9112 + (((tickAnim - 14) / 4) * (-7.5-(-7.9112)));
            yy = -3.0162 + (((tickAnim - 14) / 4) * (17.5-(-3.0162)));
            zz = 2.8885 + (((tickAnim - 14) / 4) * (2.5-(2.8885)));
        }
        else if (tickAnim >= 18 && tickAnim < 22) {
            xx = -7.5 + (((tickAnim - 18) / 4) * (15-(-7.5)));
            yy = 17.5 + (((tickAnim - 18) / 4) * (17.5-(17.5)));
            zz = 2.5 + (((tickAnim - 18) / 4) * (2.5-(2.5)));
        }
        else if (tickAnim >= 22 && tickAnim < 25) {
            xx = 15 + (((tickAnim - 22) / 3) * (-15.9614-(15)));
            yy = 17.5 + (((tickAnim - 22) / 3) * (5.4555-(17.5)));
            zz = 2.5 + (((tickAnim - 22) / 3) * (2.5074-(2.5)));
        }
        else if (tickAnim >= 25 && tickAnim < 28) {
            xx = -15.9614 + (((tickAnim - 25) / 3) * (-7.6166-(-15.9614)));
            yy = 5.4555 + (((tickAnim - 25) / 3) * (24.8682-(5.4555)));
            zz = 2.5074 + (((tickAnim - 25) / 3) * (5.9348-(2.5074)));
        }
        else if (tickAnim >= 28 && tickAnim < 28) {
            xx = -7.6166 + (((tickAnim - 28) / 0) * (-5.33-(-7.6166)));
            yy = 24.8682 + (((tickAnim - 28) / 0) * (6.83-(24.8682)));
            zz = 5.9348 + (((tickAnim - 28) / 0) * (18-(5.9348)));
        }
        else if (tickAnim >= 28 && tickAnim < 30) {
            xx = -5.33 + (((tickAnim - 28) / 2) * (0-(-5.33)));
            yy = 6.83 + (((tickAnim - 28) / 2) * (0-(6.83)));
            zz = 18 + (((tickAnim - 28) / 2) * (0-(18)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(legr4, legr4.rotateAngleX + (float) Math.toRadians(xx), legr4.rotateAngleY + (float) Math.toRadians(yy), legr4.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 2) {
            xx = 0 + (((tickAnim - 0) / 2) * (40-(0)));
            yy = 0 + (((tickAnim - 0) / 2) * (20-(0)));
            zz = 0 + (((tickAnim - 0) / 2) * (0-(0)));
        }
        else if (tickAnim >= 2 && tickAnim < 6) {
            xx = 40 + (((tickAnim - 2) / 4) * (3.6319-(40)));
            yy = 20 + (((tickAnim - 2) / 4) * (-5.3554-(20)));
            zz = 0 + (((tickAnim - 2) / 4) * (-1.8074-(0)));
        }
        else if (tickAnim >= 6 && tickAnim < 9) {
            xx = 3.6319 + (((tickAnim - 6) / 3) * (5-(3.6319)));
            yy = -5.3554 + (((tickAnim - 6) / 3) * (10-(-5.3554)));
            zz = -1.8074 + (((tickAnim - 6) / 3) * (12.5-(-1.8074)));
        }
        else if (tickAnim >= 9 && tickAnim < 12) {
            xx = 5 + (((tickAnim - 9) / 3) * (22.5-(5)));
            yy = 10 + (((tickAnim - 9) / 3) * (10-(10)));
            zz = 12.5 + (((tickAnim - 9) / 3) * (-2.5-(12.5)));
        }
        else if (tickAnim >= 12 && tickAnim < 14) {
            xx = 22.5 + (((tickAnim - 12) / 2) * (22.5-(22.5)));
            yy = 10 + (((tickAnim - 12) / 2) * (10-(10)));
            zz = -2.5 + (((tickAnim - 12) / 2) * (20-(-2.5)));
        }
        else if (tickAnim >= 14 && tickAnim < 17) {
            xx = 22.5 + (((tickAnim - 14) / 3) * (-7.5-(22.5)));
            yy = 10 + (((tickAnim - 14) / 3) * (-2.5-(10)));
            zz = 20 + (((tickAnim - 14) / 3) * (0-(20)));
        }
        else if (tickAnim >= 17 && tickAnim < 21) {
            xx = -7.5 + (((tickAnim - 17) / 4) * (-7.5-(-7.5)));
            yy = -2.5 + (((tickAnim - 17) / 4) * (17.5-(-2.5)));
            zz = 0 + (((tickAnim - 17) / 4) * (2.5-(0)));
        }
        else if (tickAnim >= 21 && tickAnim < 24) {
            xx = -7.5 + (((tickAnim - 21) / 3) * (15-(-7.5)));
            yy = 17.5 + (((tickAnim - 21) / 3) * (22.5-(17.5)));
            zz = 2.5 + (((tickAnim - 21) / 3) * (-5-(2.5)));
        }
        else if (tickAnim >= 24 && tickAnim < 28) {
            xx = 15 + (((tickAnim - 24) / 4) * (-17.95-(15)));
            yy = 22.5 + (((tickAnim - 24) / 4) * (-3.75-(22.5)));
            zz = -5 + (((tickAnim - 24) / 4) * (2.95-(-5)));
        }
        else if (tickAnim >= 28 && tickAnim < 30) {
            xx = -17.95 + (((tickAnim - 28) / 2) * (0-(-17.95)));
            yy = -3.75 + (((tickAnim - 28) / 2) * (0-(-3.75)));
            zz = 2.95 + (((tickAnim - 28) / 2) * (0-(2.95)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(legr3, legr3.rotateAngleX + (float) Math.toRadians(xx), legr3.rotateAngleY + (float) Math.toRadians(yy), legr3.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 1) {
            xx = 0 + (((tickAnim - 0) / 1) * (0.0287-(0)));
            yy = 0 + (((tickAnim - 0) / 1) * (-4.8563-(0)));
            zz = 0 + (((tickAnim - 0) / 1) * (-1.566-(0)));
        }
        else if (tickAnim >= 1 && tickAnim < 2) {
            xx = 0.0287 + (((tickAnim - 1) / 1) * (8.5293-(0.0287)));
            yy = -4.8563 + (((tickAnim - 1) / 1) * (13.5362-(-4.8563)));
            zz = -1.566 + (((tickAnim - 1) / 1) * (18.8515-(-1.566)));
        }
        else if (tickAnim >= 2 && tickAnim < 3) {
            xx = 8.5293 + (((tickAnim - 2) / 1) * (35.1093-(8.5293)));
            yy = 13.5362 + (((tickAnim - 2) / 1) * (22.157-(13.5362)));
            zz = 18.8515 + (((tickAnim - 2) / 1) * (5.5777-(18.8515)));
        }
        else if (tickAnim >= 3 && tickAnim < 6) {
            xx = 35.1093 + (((tickAnim - 3) / 3) * (31.2617-(35.1093)));
            yy = 22.157 + (((tickAnim - 3) / 3) * (11.7596-(22.157)));
            zz = 5.5777 + (((tickAnim - 3) / 3) * (1.7164-(5.5777)));
        }
        else if (tickAnim >= 6 && tickAnim < 7) {
            xx = 31.2617 + (((tickAnim - 6) / 1) * (35.6519-(31.2617)));
            yy = 11.7596 + (((tickAnim - 6) / 1) * (20.9256-(11.7596)));
            zz = 1.7164 + (((tickAnim - 6) / 1) * (13.9574-(1.7164)));
        }
        else if (tickAnim >= 7 && tickAnim < 8) {
            xx = 35.6519 + (((tickAnim - 7) / 1) * (39.6935-(35.6519)));
            yy = 20.9256 + (((tickAnim - 7) / 1) * (23.4689-(20.9256)));
            zz = 13.9574 + (((tickAnim - 7) / 1) * (6.0752-(13.9574)));
        }
        else if (tickAnim >= 8 && tickAnim < 11) {
            xx = 39.6935 + (((tickAnim - 8) / 3) * (32.0863-(39.6935)));
            yy = 23.4689 + (((tickAnim - 8) / 3) * (15.3025-(23.4689)));
            zz = 6.0752 + (((tickAnim - 8) / 3) * (3.7684-(6.0752)));
        }
        else if (tickAnim >= 11 && tickAnim < 13) {
            xx = 32.0863 + (((tickAnim - 11) / 2) * (36.466-(32.0863)));
            yy = 15.3025 + (((tickAnim - 11) / 2) * (18.6594-(15.3025)));
            zz = 3.7684 + (((tickAnim - 11) / 2) * (14.9728-(3.7684)));
        }
        else if (tickAnim >= 13 && tickAnim < 14) {
            xx = 36.466 + (((tickAnim - 13) / 1) * (41.2681-(36.466)));
            yy = 18.6594 + (((tickAnim - 13) / 1) * (20.2899-(18.6594)));
            zz = 14.9728 + (((tickAnim - 13) / 1) * (5.2871-(14.9728)));
        }
        else if (tickAnim >= 14 && tickAnim < 20) {
            xx = 41.2681 + (((tickAnim - 14) / 6) * (41.421-(41.2681)));
            yy = 20.2899 + (((tickAnim - 14) / 6) * (31.3597-(20.2899)));
            zz = 5.2871 + (((tickAnim - 14) / 6) * (6.827-(5.2871)));
        }
        else if (tickAnim >= 20 && tickAnim < 22) {
            xx = 41.421 + (((tickAnim - 20) / 2) * (23.525-(41.421)));
            yy = 31.3597 + (((tickAnim - 20) / 2) * (12.1551-(31.3597)));
            zz = 6.827 + (((tickAnim - 20) / 2) * (16.5613-(6.827)));
        }
        else if (tickAnim >= 22 && tickAnim < 23) {
            xx = 23.525 + (((tickAnim - 22) / 1) * (9.9686-(23.525)));
            yy = 12.1551 + (((tickAnim - 22) / 1) * (1.1166-(12.1551)));
            zz = 16.5613 + (((tickAnim - 22) / 1) * (5.5777-(16.5613)));
        }
        else if (tickAnim >= 23 && tickAnim < 26) {
            xx = 9.9686 + (((tickAnim - 23) / 3) * (5.0086-(9.9686)));
            yy = 1.1166 + (((tickAnim - 23) / 3) * (13.5119-(1.1166)));
            zz = 5.5777 + (((tickAnim - 23) / 3) * (3.4515-(5.5777)));
        }
        else if (tickAnim >= 26 && tickAnim < 28) {
            xx = 5.0086 + (((tickAnim - 26) / 2) * (-0.6835-(5.0086)));
            yy = 13.5119 + (((tickAnim - 26) / 2) * (13.4009-(13.5119)));
            zz = 3.4515 + (((tickAnim - 26) / 2) * (13.9583-(3.4515)));
        }
        else if (tickAnim >= 28 && tickAnim < 28) {
            xx = -0.6835 + (((tickAnim - 28) / 0) * (0.2084-(-0.6835)));
            yy = 13.4009 + (((tickAnim - 28) / 0) * (-8.0501-(13.4009)));
            zz = 13.9583 + (((tickAnim - 28) / 0) * (0.311-(13.9583)));
        }
        else if (tickAnim >= 28 && tickAnim < 30) {
            xx = 0.2084 + (((tickAnim - 28) / 2) * (0-(0.2084)));
            yy = -8.0501 + (((tickAnim - 28) / 2) * (0-(-8.0501)));
            zz = 0.311 + (((tickAnim - 28) / 2) * (0-(0.311)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(legr2, legr2.rotateAngleX + (float) Math.toRadians(xx), legr2.rotateAngleY + (float) Math.toRadians(yy), legr2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 2) {
            xx = 0 + (((tickAnim - 0) / 2) * (8.75-(0)));
            yy = 0 + (((tickAnim - 0) / 2) * (-8.18-(0)));
            zz = 0 + (((tickAnim - 0) / 2) * (-11.16-(0)));
        }
        else if (tickAnim >= 2 && tickAnim < 3) {
            xx = 8.75 + (((tickAnim - 2) / 1) * (17.5-(8.75)));
            yy = -8.18 + (((tickAnim - 2) / 1) * (-16.36-(-8.18)));
            zz = -11.16 + (((tickAnim - 2) / 1) * (-2.32-(-11.16)));
        }
        else if (tickAnim >= 3 && tickAnim < 7) {
            xx = 17.5 + (((tickAnim - 3) / 4) * (7.3997-(17.5)));
            yy = -16.36 + (((tickAnim - 3) / 4) * (-8.9385-(-16.36)));
            zz = -2.32 + (((tickAnim - 3) / 4) * (3.1061-(-2.32)));
        }
        else if (tickAnim >= 7 && tickAnim < 8) {
            xx = 7.3997 + (((tickAnim - 7) / 1) * (22.5-(7.3997)));
            yy = -8.9385 + (((tickAnim - 7) / 1) * (-12.26-(-8.9385)));
            zz = 3.1061 + (((tickAnim - 7) / 1) * (-11.18-(3.1061)));
        }
        else if (tickAnim >= 8 && tickAnim < 10) {
            xx = 22.5 + (((tickAnim - 8) / 2) * (37.5-(22.5)));
            yy = -12.26 + (((tickAnim - 8) / 2) * (-17.5-(-12.26)));
            zz = -11.18 + (((tickAnim - 8) / 2) * (-1-(-11.18)));
        }
        else if (tickAnim >= 10 && tickAnim < 12) {
            xx = 37.5 + (((tickAnim - 10) / 2) * (34.0803-(37.5)));
            yy = -17.5 + (((tickAnim - 10) / 2) * (-14.5886-(-17.5)));
            zz = -1 + (((tickAnim - 10) / 2) * (0.938-(-1)));
        }
        else if (tickAnim >= 12 && tickAnim < 13) {
            xx = 34.0803 + (((tickAnim - 12) / 1) * (32.4892-(34.0803)));
            yy = -14.5886 + (((tickAnim - 12) / 1) * (-17.5064-(-14.5886)));
            zz = 0.938 + (((tickAnim - 12) / 1) * (0.8647-(0.938)));
        }
        else if (tickAnim >= 13 && tickAnim < 13) {
            xx = 32.4892 + (((tickAnim - 13) / 0) * (31.0286-(32.4892)));
            yy = -17.5064 + (((tickAnim - 13) / 0) * (-19.6473-(-17.5064)));
            zz = 0.8647 + (((tickAnim - 13) / 0) * (0.2602-(0.8647)));
        }
        else if (tickAnim >= 13 && tickAnim < 18) {
            xx = 31.0286 + (((tickAnim - 13) / 5) * (23.2929-(31.0286)));
            yy = -19.6473 + (((tickAnim - 13) / 5) * (-18.5983-(-19.6473)));
            zz = 0.2602 + (((tickAnim - 13) / 5) * (-0.3978-(0.2602)));
        }
        else if (tickAnim >= 18 && tickAnim < 19) {
            xx = 23.2929 + (((tickAnim - 18) / 1) * (20.32-(23.2929)));
            yy = -18.5983 + (((tickAnim - 18) / 1) * (-4.09-(-18.5983)));
            zz = -0.3978 + (((tickAnim - 18) / 1) * (-13.03-(-0.3978)));
        }
        else if (tickAnim >= 19 && tickAnim < 21) {
            xx = 20.32 + (((tickAnim - 19) / 2) * (17.19-(20.32)));
            yy = -4.09 + (((tickAnim - 19) / 2) * (12.41-(-4.09)));
            zz = -13.03 + (((tickAnim - 19) / 2) * (-0.45-(-13.03)));
        }
        else if (tickAnim >= 21 && tickAnim < 25) {
            xx = 17.19 + (((tickAnim - 21) / 4) * (9.38-(17.19)));
            yy = 12.41 + (((tickAnim - 21) / 4) * (6.77-(12.41)));
            zz = -0.45 + (((tickAnim - 21) / 4) * (-0.25-(-0.45)));
        }
        else if (tickAnim >= 25 && tickAnim < 27) {
            xx = 9.38 + (((tickAnim - 25) / 2) * (1.0317-(9.38)));
            yy = 6.77 + (((tickAnim - 25) / 2) * (6.4219-(6.77)));
            zz = -0.25 + (((tickAnim - 25) / 2) * (-9.9959-(-0.25)));
        }
        else if (tickAnim >= 27 && tickAnim < 28) {
            xx = 1.0317 + (((tickAnim - 27) / 1) * (2.9553-(1.0317)));
            yy = 6.4219 + (((tickAnim - 27) / 1) * (15.2201-(6.4219)));
            zz = -9.9959 + (((tickAnim - 27) / 1) * (0.7962-(-9.9959)));
        }
        else if (tickAnim >= 28 && tickAnim < 30) {
            xx = 2.9553 + (((tickAnim - 28) / 2) * (0-(2.9553)));
            yy = 15.2201 + (((tickAnim - 28) / 2) * (0-(15.2201)));
            zz = 0.7962 + (((tickAnim - 28) / 2) * (0-(0.7962)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(legl2, legl2.rotateAngleX + (float) Math.toRadians(xx), legl2.rotateAngleY + (float) Math.toRadians(yy), legl2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 2) {
            xx = 0 + (((tickAnim - 0) / 2) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 2) * (8-(0)));
            zz = 0 + (((tickAnim - 0) / 2) * (12.5-(0)));
        }
        else if (tickAnim >= 2 && tickAnim < 4) {
            xx = 0 + (((tickAnim - 2) / 2) * (40-(0)));
            yy = 8 + (((tickAnim - 2) / 2) * (20-(8)));
            zz = 12.5 + (((tickAnim - 2) / 2) * (0-(12.5)));
        }
        else if (tickAnim >= 4 && tickAnim < 8) {
            xx = 40 + (((tickAnim - 4) / 4) * (5-(40)));
            yy = 20 + (((tickAnim - 4) / 4) * (-2.5-(20)));
            zz = 0 + (((tickAnim - 4) / 4) * (-12.5-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 12) {
            xx = 5 + (((tickAnim - 8) / 4) * (5-(5)));
            yy = -2.5 + (((tickAnim - 8) / 4) * (10-(-2.5)));
            zz = -12.5 + (((tickAnim - 8) / 4) * (12.5-(-12.5)));
        }
        else if (tickAnim >= 12 && tickAnim < 14) {
            xx = 5 + (((tickAnim - 12) / 2) * (22.5-(5)));
            yy = 10 + (((tickAnim - 12) / 2) * (10-(10)));
            zz = 12.5 + (((tickAnim - 12) / 2) * (-2.5-(12.5)));
        }
        else if (tickAnim >= 14 && tickAnim < 17) {
            xx = 22.5 + (((tickAnim - 14) / 3) * (22.5-(22.5)));
            yy = 10 + (((tickAnim - 14) / 3) * (10-(10)));
            zz = -2.5 + (((tickAnim - 14) / 3) * (20-(-2.5)));
        }
        else if (tickAnim >= 17 && tickAnim < 19) {
            xx = 22.5 + (((tickAnim - 17) / 2) * (-7.5-(22.5)));
            yy = 10 + (((tickAnim - 17) / 2) * (-2.5-(10)));
            zz = 20 + (((tickAnim - 17) / 2) * (0-(20)));
        }
        else if (tickAnim >= 19 && tickAnim < 23) {
            xx = -7.5 + (((tickAnim - 19) / 4) * (-7.5-(-7.5)));
            yy = -2.5 + (((tickAnim - 19) / 4) * (17.5-(-2.5)));
            zz = 0 + (((tickAnim - 19) / 4) * (2.5-(0)));
        }
        else if (tickAnim >= 23 && tickAnim < 27) {
            xx = -7.5 + (((tickAnim - 23) / 4) * (15-(-7.5)));
            yy = 17.5 + (((tickAnim - 23) / 4) * (17.5-(17.5)));
            zz = 2.5 + (((tickAnim - 23) / 4) * (2.5-(2.5)));
        }
        else if (tickAnim >= 27 && tickAnim < 28) {
            xx = 15 + (((tickAnim - 27) / 1) * (-2.5-(15)));
            yy = 17.5 + (((tickAnim - 27) / 1) * (17.5-(17.5)));
            zz = 2.5 + (((tickAnim - 27) / 1) * (15-(2.5)));
        }
        else if (tickAnim >= 28 && tickAnim < 30) {
            xx = -2.5 + (((tickAnim - 28) / 2) * (0-(-2.5)));
            yy = 17.5 + (((tickAnim - 28) / 2) * (0-(17.5)));
            zz = 15 + (((tickAnim - 28) / 2) * (0-(15)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(legr, legr.rotateAngleX + (float) Math.toRadians(xx), legr.rotateAngleY + (float) Math.toRadians(yy), legr.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 0 + (((tickAnim - 0) / 3) * (-25-(0)));
            yy = 0 + (((tickAnim - 0) / 3) * (2.5-(0)));
            zz = 0 + (((tickAnim - 0) / 3) * (21.25-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 7) {
            xx = -25 + (((tickAnim - 3) / 4) * (0-(-25)));
            yy = 2.5 + (((tickAnim - 3) / 4) * (-10-(2.5)));
            zz = 21.25 + (((tickAnim - 3) / 4) * (-17.5-(21.25)));
        }
        else if (tickAnim >= 7 && tickAnim < 9) {
            xx = 0 + (((tickAnim - 7) / 2) * (2.7816-(0)));
            yy = -10 + (((tickAnim - 7) / 2) * (-16.6882-(-10)));
            zz = -17.5 + (((tickAnim - 7) / 2) * (10.8526-(-17.5)));
        }
        else if (tickAnim >= 9 && tickAnim < 12) {
            xx = 2.7816 + (((tickAnim - 9) / 3) * (1.6966-(2.7816)));
            yy = -16.6882 + (((tickAnim - 9) / 3) * (-6.4434-(-16.6882)));
            zz = 10.8526 + (((tickAnim - 9) / 3) * (14.4759-(10.8526)));
        }
        else if (tickAnim >= 12 && tickAnim < 13) {
            xx = 1.6966 + (((tickAnim - 12) / 1) * (-1.1593-(1.6966)));
            yy = -6.4434 + (((tickAnim - 12) / 1) * (-10.7863-(-6.4434)));
            zz = 14.4759 + (((tickAnim - 12) / 1) * (13.3122-(14.4759)));
        }
        else if (tickAnim >= 13 && tickAnim < 16) {
            xx = -1.1593 + (((tickAnim - 13) / 3) * (10.5184-(-1.1593)));
            yy = -10.7863 + (((tickAnim - 13) / 3) * (-4.533-(-10.7863)));
            zz = 13.3122 + (((tickAnim - 13) / 3) * (10.7186-(13.3122)));
        }
        else if (tickAnim >= 16 && tickAnim < 21) {
            xx = 10.5184 + (((tickAnim - 16) / 5) * (-12.5-(10.5184)));
            yy = -4.533 + (((tickAnim - 16) / 5) * (-15-(-4.533)));
            zz = 10.7186 + (((tickAnim - 16) / 5) * (-7.5-(10.7186)));
        }
        else if (tickAnim >= 21 && tickAnim < 24) {
            xx = -12.5 + (((tickAnim - 21) / 3) * (-12.5-(-12.5)));
            yy = -15 + (((tickAnim - 21) / 3) * (-15-(-15)));
            zz = -7.5 + (((tickAnim - 21) / 3) * (7.5-(-7.5)));
        }
        else if (tickAnim >= 24 && tickAnim < 25) {
            xx = -12.5 + (((tickAnim - 24) / 1) * (-12.5-(-12.5)));
            yy = -15 + (((tickAnim - 24) / 1) * (-10.83-(-15)));
            zz = 7.5 + (((tickAnim - 24) / 1) * (-1.67-(7.5)));
        }
        else if (tickAnim >= 25 && tickAnim < 27) {
            xx = -12.5 + (((tickAnim - 25) / 2) * (-12.5-(-12.5)));
            yy = -10.83 + (((tickAnim - 25) / 2) * (-2.5-(-10.83)));
            zz = -1.67 + (((tickAnim - 25) / 2) * (10-(-1.67)));
        }
        else if (tickAnim >= 27 && tickAnim < 30) {
            xx = -12.5 + (((tickAnim - 27) / 3) * (0-(-12.5)));
            yy = -2.5 + (((tickAnim - 27) / 3) * (0-(-2.5)));
            zz = 10 + (((tickAnim - 27) / 3) * (0-(10)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(legl, legl.rotateAngleX + (float) Math.toRadians(xx), legl.rotateAngleY + (float) Math.toRadians(yy), legl.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 0) / 5) * (-25-(0)));
            yy = 0 + (((tickAnim - 0) / 5) * (45-(0)));
            zz = 0 + (((tickAnim - 0) / 5) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 8) {
            xx = -25 + (((tickAnim - 5) / 3) * (-200.42-(-25)));
            yy = 45 + (((tickAnim - 5) / 3) * (47.575-(45)));
            zz = 0 + (((tickAnim - 5) / 3) * (-180-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 21) {
            xx = -200.42 + (((tickAnim - 8) / 13) * (-42.4256-(-200.42)));
            yy = 47.575 + (((tickAnim - 8) / 13) * (41.0885-(47.575)));
            zz = -180 + (((tickAnim - 8) / 13) * (-19.8677-(-180)));
        }
        else if (tickAnim >= 21 && tickAnim < 25) {
            xx = -42.4256 + (((tickAnim - 21) / 4) * (-31.5728-(-42.4256)));
            yy = 41.0885 + (((tickAnim - 21) / 4) * (24.8599-(41.0885)));
            zz = -19.8677 + (((tickAnim - 21) / 4) * (-20.3273-(-19.8677)));
        }
        else if (tickAnim >= 25 && tickAnim < 30) {
            xx = -31.5728 + (((tickAnim - 25) / 5) * (0-(-31.5728)));
            yy = 24.8599 + (((tickAnim - 25) / 5) * (0-(24.8599)));
            zz = -20.3273 + (((tickAnim - 25) / 5) * (0-(-20.3273)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(armr, armr.rotateAngleX + (float) Math.toRadians(xx), armr.rotateAngleY + (float) Math.toRadians(yy), armr.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 0 + (((tickAnim - 0) / 3) * (-35-(0)));
            yy = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 3) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 13) {
            xx = -35 + (((tickAnim - 3) / 10) * (-28.58-(-35)));
            yy = 0 + (((tickAnim - 3) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 3) / 10) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 21) {
            xx = -28.58 + (((tickAnim - 13) / 8) * (-9.57-(-28.58)));
            yy = 0 + (((tickAnim - 13) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 13) / 8) * (0-(0)));
        }
        else if (tickAnim >= 21 && tickAnim < 30) {
            xx = -9.57 + (((tickAnim - 21) / 9) * (0-(-9.57)));
            yy = 0 + (((tickAnim - 21) / 9) * (0-(0)));
            zz = 0 + (((tickAnim - 21) / 9) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(armr2, armr2.rotateAngleX + (float) Math.toRadians(xx), armr2.rotateAngleY + (float) Math.toRadians(yy), armr2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 0) / 5) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 5) * (-2.5-(0)));
            zz = 0 + (((tickAnim - 0) / 5) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 30) {
            xx = 0 + (((tickAnim - 5) / 25) * (0-(0)));
            yy = -2.5 + (((tickAnim - 5) / 25) * (0-(-2.5)));
            zz = 0 + (((tickAnim - 5) / 25) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(armr3, armr3.rotateAngleX + (float) Math.toRadians(xx), armr3.rotateAngleY + (float) Math.toRadians(yy), armr3.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 0) / 5) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 5) * (-45-(0)));
            zz = 0 + (((tickAnim - 0) / 5) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 30) {
            xx = 0 + (((tickAnim - 5) / 25) * (0-(0)));
            yy = -45 + (((tickAnim - 5) / 25) * (0-(-45)));
            zz = 0 + (((tickAnim - 5) / 25) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(clawr, clawr.rotateAngleX + (float) Math.toRadians(xx), clawr.rotateAngleY + (float) Math.toRadians(yy), clawr.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 0 + (((tickAnim - 0) / 3) * (-17.5-(0)));
            yy = 0 + (((tickAnim - 0) / 3) * (-27.5-(0)));
            zz = 0 + (((tickAnim - 0) / 3) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 6) {
            xx = -17.5 + (((tickAnim - 3) / 3) * (-24.92-(-17.5)));
            yy = -27.5 + (((tickAnim - 3) / 3) * (-58.58-(-27.5)));
            zz = 0 + (((tickAnim - 3) / 3) * (0-(0)));
        }
        else if (tickAnim >= 6 && tickAnim < 23) {
            xx = -24.92 + (((tickAnim - 6) / 17) * (-25.58-(-24.92)));
            yy = -58.58 + (((tickAnim - 6) / 17) * (-16.16-(-58.58)));
            zz = 0 + (((tickAnim - 6) / 17) * (0-(0)));
        }
        else if (tickAnim >= 23 && tickAnim < 30) {
            xx = -25.58 + (((tickAnim - 23) / 7) * (0-(-25.58)));
            yy = -16.16 + (((tickAnim - 23) / 7) * (0-(-16.16)));
            zz = 0 + (((tickAnim - 23) / 7) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(arml, arml.rotateAngleX + (float) Math.toRadians(xx), arml.rotateAngleY + (float) Math.toRadians(yy), arml.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 0 + (((tickAnim - 0) / 3) * (-32.5-(0)));
            yy = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 3) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 24) {
            xx = -32.5 + (((tickAnim - 3) / 21) * (13.79-(-32.5)));
            yy = 0 + (((tickAnim - 3) / 21) * (0-(0)));
            zz = 0 + (((tickAnim - 3) / 21) * (0-(0)));
        }
        else if (tickAnim >= 24 && tickAnim < 30) {
            xx = 13.79 + (((tickAnim - 24) / 6) * (0-(13.79)));
            yy = 0 + (((tickAnim - 24) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 24) / 6) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(arml2, arml2.rotateAngleX + (float) Math.toRadians(xx), arml2.rotateAngleY + (float) Math.toRadians(yy), arml2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 0) / 5) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 5) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 30) {
            xx = 0 + (((tickAnim - 5) / 25) * (0-(0)));
            yy = 0 + (((tickAnim - 5) / 25) * (0-(0)));
            zz = 0 + (((tickAnim - 5) / 25) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(arml3, arml3.rotateAngleX + (float) Math.toRadians(xx), arml3.rotateAngleY + (float) Math.toRadians(yy), arml3.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 3) * (65-(0)));
            zz = 0 + (((tickAnim - 0) / 3) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 30) {
            xx = 0 + (((tickAnim - 3) / 27) * (0-(0)));
            yy = 65 + (((tickAnim - 3) / 27) * (0-(65)));
            zz = 0 + (((tickAnim - 3) / 27) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(clawl, clawl.rotateAngleX + (float) Math.toRadians(xx), clawl.rotateAngleY + (float) Math.toRadians(yy), clawl.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 1) {
            xx = 0 + (((tickAnim - 0) / 1) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 1) * (0-(0)));
        }
        else if (tickAnim >= 1 && tickAnim < 2) {
            xx = 0 + (((tickAnim - 1) / 1) * (21.5081-(0)));
            yy = 0 + (((tickAnim - 1) / 1) * (-15.77313-(0)));
            zz = 0 + (((tickAnim - 1) / 1) * (-27.34844-(0)));
        }
        else if (tickAnim >= 2 && tickAnim < 17) {
            xx = 21.5081 + (((tickAnim - 2) / 15) * (21.5081-(21.5081)));
            yy = -15.77313 + (((tickAnim - 2) / 15) * (-15.77313-(-15.77313)));
            zz = -27.34844 + (((tickAnim - 2) / 15) * (-27.34844-(-27.34844)));
        }
        else if (tickAnim >= 17 && tickAnim < 25) {
            xx = 21.5081 + (((tickAnim - 17) / 8) * (0-(21.5081)));
            yy = -15.77313 + (((tickAnim - 17) / 8) * (0-(-15.77313)));
            zz = -27.34844 + (((tickAnim - 17) / 8) * (0-(-27.34844)));
        }
        else if (tickAnim >= 25 && tickAnim < 30) {
            xx = 0 + (((tickAnim - 25) / 5) * (0-(0)));
            yy = 0 + (((tickAnim - 25) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 25) / 5) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(EyeR, EyeR.rotateAngleX + (float) Math.toRadians(xx), EyeR.rotateAngleY + (float) Math.toRadians(yy), EyeR.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 1) {
            xx = 0 + (((tickAnim - 0) / 1) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 1) * (0-(0)));
        }
        else if (tickAnim >= 1 && tickAnim < 2) {
            xx = 0 + (((tickAnim - 1) / 1) * (0-(0)));
            yy = 0 + (((tickAnim - 1) / 1) * (0.25-(0)));
            zz = 0 + (((tickAnim - 1) / 1) * (0.25-(0)));
        }
        else if (tickAnim >= 2 && tickAnim < 17) {
            xx = 0 + (((tickAnim - 2) / 15) * (0-(0)));
            yy = 0.25 + (((tickAnim - 2) / 15) * (0.25-(0.25)));
            zz = 0.25 + (((tickAnim - 2) / 15) * (0.25-(0.25)));
        }
        else if (tickAnim >= 17 && tickAnim < 25) {
            xx = 0 + (((tickAnim - 17) / 8) * (0-(0)));
            yy = 0.25 + (((tickAnim - 17) / 8) * (0-(0.25)));
            zz = 0.25 + (((tickAnim - 17) / 8) * (0-(0.25)));
        }
        else if (tickAnim >= 25 && tickAnim < 30) {
            xx = 0 + (((tickAnim - 25) / 5) * (0-(0)));
            yy = 0 + (((tickAnim - 25) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 25) / 5) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.EyeR.rotationPointX = this.EyeR.rotationPointX + (float)(xx);
        this.EyeR.rotationPointY = this.EyeR.rotationPointY - (float)(yy);
        this.EyeR.rotationPointZ = this.EyeR.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 1) {
            xx = 0 + (((tickAnim - 0) / 1) * (21.5081-(0)));
            yy = 0 + (((tickAnim - 0) / 1) * (15.77313-(0)));
            zz = 0 + (((tickAnim - 0) / 1) * (27.34844-(0)));
        }
        else if (tickAnim >= 1 && tickAnim < 14) {
            xx = 21.5081 + (((tickAnim - 1) / 13) * (21.5081-(21.5081)));
            yy = 15.77313 + (((tickAnim - 1) / 13) * (15.77313-(15.77313)));
            zz = 27.34844 + (((tickAnim - 1) / 13) * (27.34844-(27.34844)));
        }
        else if (tickAnim >= 14 && tickAnim < 23) {
            xx = 21.5081 + (((tickAnim - 14) / 9) * (0-(21.5081)));
            yy = 15.77313 + (((tickAnim - 14) / 9) * (0-(15.77313)));
            zz = 27.34844 + (((tickAnim - 14) / 9) * (0-(27.34844)));
        }
        else if (tickAnim >= 23 && tickAnim < 30) {
            xx = 0 + (((tickAnim - 23) / 7) * (0-(0)));
            yy = 0 + (((tickAnim - 23) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 23) / 7) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(EyeL, EyeL.rotateAngleX + (float) Math.toRadians(xx), EyeL.rotateAngleY + (float) Math.toRadians(yy), EyeL.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 1) {
            xx = 0 + (((tickAnim - 0) / 1) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 1) * (0.25-(0)));
            zz = 0 + (((tickAnim - 0) / 1) * (0.25-(0)));
        }
        else if (tickAnim >= 1 && tickAnim < 14) {
            xx = 0 + (((tickAnim - 1) / 13) * (0-(0)));
            yy = 0.25 + (((tickAnim - 1) / 13) * (0.25-(0.25)));
            zz = 0.25 + (((tickAnim - 1) / 13) * (0.25-(0.25)));
        }
        else if (tickAnim >= 14 && tickAnim < 23) {
            xx = 0 + (((tickAnim - 14) / 9) * (0-(0)));
            yy = 0.25 + (((tickAnim - 14) / 9) * (0-(0.25)));
            zz = 0.25 + (((tickAnim - 14) / 9) * (0-(0.25)));
        }
        else if (tickAnim >= 23 && tickAnim < 30) {
            xx = 0 + (((tickAnim - 23) / 7) * (0-(0)));
            yy = 0 + (((tickAnim - 23) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 23) / 7) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.EyeL.rotationPointX = this.EyeL.rotationPointX + (float)(xx);
        this.EyeL.rotationPointY = this.EyeL.rotationPointY - (float)(yy);
        this.EyeL.rotationPointZ = this.EyeL.rotationPointZ + (float)(zz);



        this.setRotateAngle(mandibleR, mandibleR.rotateAngleX + (float) Math.toRadians(10-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*240*2))*10), mandibleR.rotateAngleY + (float) Math.toRadians(5-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*240))*10), mandibleR.rotateAngleZ + (float) Math.toRadians(10+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*240*2-60))*10));


        this.setRotateAngle(mandibleL, mandibleL.rotateAngleX + (float) Math.toRadians(10-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*240*2+60))*10), mandibleL.rotateAngleY + (float) Math.toRadians(-5+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*240+60))*10), mandibleL.rotateAngleZ + (float) Math.toRadians(-10+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*240*2))*10));


        this.setRotateAngle(antennule_l, antennule_l.rotateAngleX + (float) Math.toRadians(-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*240*4))*10), antennule_l.rotateAngleY + (float) Math.toRadians(-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*240*2))*10), antennule_l.rotateAngleZ + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*240*3))*10));



        if (tickAnim >= 0 && tickAnim < 4) {
            xx = 0 + (((tickAnim - 0) / 4) * (-9.0375-(0)));
            yy = 0 + (((tickAnim - 0) / 4) * (14-(0)));
            zz = 0 + (((tickAnim - 0) / 4) * (-2.9909-(0)));
        }
        else if (tickAnim >= 4 && tickAnim < 7) {
            xx = -9.0375 + (((tickAnim - 4) / 3) * (12.1793-(-9.0375)));
            yy = 14 + (((tickAnim - 4) / 3) * (-6.4363-(14)));
            zz = -2.9909 + (((tickAnim - 4) / 3) * (-16.5215-(-2.9909)));
        }
        else if (tickAnim >= 7 && tickAnim < 9) {
            xx = 12.1793 + (((tickAnim - 7) / 2) * (22.5-(12.1793)));
            yy = -6.4363 + (((tickAnim - 7) / 2) * (-17.33-(-6.4363)));
            zz = -16.5215 + (((tickAnim - 7) / 2) * (-4-(-16.5215)));
        }
        else if (tickAnim >= 9 && tickAnim < 10) {
            xx = 22.5 + (((tickAnim - 9) / 1) * (14.5499-(22.5)));
            yy = -17.33 + (((tickAnim - 9) / 1) * (-14.9287-(-17.33)));
            zz = -4 + (((tickAnim - 9) / 1) * (-3.5462-(-4)));
        }
        else if (tickAnim >= 10 && tickAnim < 12) {
            xx = 14.5499 + (((tickAnim - 10) / 2) * (-0.7811-(14.5499)));
            yy = -14.9287 + (((tickAnim - 10) / 2) * (-12.9691-(-14.9287)));
            zz = -3.5462 + (((tickAnim - 10) / 2) * (-3.6703-(-3.5462)));
        }
        else if (tickAnim >= 12 && tickAnim < 13) {
            xx = -0.7811 + (((tickAnim - 12) / 1) * (-7.1252-(-0.7811)));
            yy = -12.9691 + (((tickAnim - 12) / 1) * (-17.8653-(-12.9691)));
            zz = -3.6703 + (((tickAnim - 12) / 1) * (-5.685-(-3.6703)));
        }
        else if (tickAnim >= 13 && tickAnim < 13) {
            xx = -7.1252 + (((tickAnim - 13) / 0) * (-4.1783-(-7.1252)));
            yy = -17.8653 + (((tickAnim - 13) / 0) * (-19.5109-(-17.8653)));
            zz = -5.685 + (((tickAnim - 13) / 0) * (-3.9017-(-5.685)));
        }
        else if (tickAnim >= 13 && tickAnim < 15) {
            xx = -4.1783 + (((tickAnim - 13) / 2) * (0.4449-(-4.1783)));
            yy = -19.5109 + (((tickAnim - 13) / 2) * (-17.0321-(-19.5109)));
            zz = -3.9017 + (((tickAnim - 13) / 2) * (1.4264-(-3.9017)));
        }
        else if (tickAnim >= 15 && tickAnim < 17) {
            xx = 0.4449 + (((tickAnim - 15) / 2) * (-3.1455-(0.4449)));
            yy = -17.0321 + (((tickAnim - 15) / 2) * (1.466-(-17.0321)));
            zz = 1.4264 + (((tickAnim - 15) / 2) * (-9.876-(1.4264)));
        }
        else if (tickAnim >= 17 && tickAnim < 19) {
            xx = -3.1455 + (((tickAnim - 17) / 2) * (-17.5-(-3.1455)));
            yy = 1.466 + (((tickAnim - 17) / 2) * (12.5-(1.466)));
            zz = -9.876 + (((tickAnim - 17) / 2) * (5-(-9.876)));
        }
        else if (tickAnim >= 19 && tickAnim < 25) {
            xx = -17.5 + (((tickAnim - 19) / 6) * (-0.1-(-17.5)));
            yy = 12.5 + (((tickAnim - 19) / 6) * (5.4906-(12.5)));
            zz = 5 + (((tickAnim - 19) / 6) * (4.9442-(5)));
        }
        else if (tickAnim >= 25 && tickAnim < 27) {
            xx = -0.1 + (((tickAnim - 25) / 2) * (-14.3173-(-0.1)));
            yy = 5.4906 + (((tickAnim - 25) / 2) * (4.233-(5.4906)));
            zz = 4.9442 + (((tickAnim - 25) / 2) * (-9.357-(4.9442)));
        }
        else if (tickAnim >= 27 && tickAnim < 28) {
            xx = -14.3173 + (((tickAnim - 27) / 1) * (-1.4065-(-14.3173)));
            yy = 4.233 + (((tickAnim - 27) / 1) * (14.8928-(4.233)));
            zz = -9.357 + (((tickAnim - 27) / 1) * (1.1317-(-9.357)));
        }
        else if (tickAnim >= 28 && tickAnim < 30) {
            xx = -1.4065 + (((tickAnim - 28) / 2) * (0-(-1.4065)));
            yy = 14.8928 + (((tickAnim - 28) / 2) * (0-(14.8928)));
            zz = 1.1317 + (((tickAnim - 28) / 2) * (0-(1.1317)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(legl4, legl4.rotateAngleX + (float) Math.toRadians(xx), legl4.rotateAngleY + (float) Math.toRadians(yy), legl4.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 6) {
            xx = 0 + (((tickAnim - 0) / 6) * (-20-(0)));
            yy = 0 + (((tickAnim - 0) / 6) * (11-(0)));
            zz = 0 + (((tickAnim - 0) / 6) * (0-(0)));
        }
        else if (tickAnim >= 6 && tickAnim < 10) {
            xx = -20 + (((tickAnim - 6) / 4) * (0-(-20)));
            yy = 11 + (((tickAnim - 6) / 4) * (-20-(11)));
            zz = 0 + (((tickAnim - 6) / 4) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 12) {
            xx = 0 + (((tickAnim - 10) / 2) * (0.8995-(0)));
            yy = -20 + (((tickAnim - 10) / 2) * (-8.5406-(-20)));
            zz = 0 + (((tickAnim - 10) / 2) * (-6.8773-(0)));
        }
        else if (tickAnim >= 12 && tickAnim < 13) {
            xx = 0.8995 + (((tickAnim - 12) / 1) * (-0.5884-(0.8995)));
            yy = -8.5406 + (((tickAnim - 12) / 1) * (-9.9287-(-8.5406)));
            zz = -6.8773 + (((tickAnim - 12) / 1) * (5.5184-(-6.8773)));
        }
        else if (tickAnim >= 13 && tickAnim < 16) {
            xx = -0.5884 + (((tickAnim - 13) / 3) * (0.077-(-0.5884)));
            yy = -9.9287 + (((tickAnim - 13) / 3) * (-7.468-(-9.9287)));
            zz = 5.5184 + (((tickAnim - 13) / 3) * (6.3686-(5.5184)));
        }
        else if (tickAnim >= 16 && tickAnim < 18) {
            xx = 0.077 + (((tickAnim - 16) / 2) * (-10.0078-(0.077)));
            yy = -7.468 + (((tickAnim - 16) / 2) * (6.8345-(-7.468)));
            zz = 6.3686 + (((tickAnim - 16) / 2) * (-2.2517-(6.3686)));
        }
        else if (tickAnim >= 18 && tickAnim < 20) {
            xx = -10.0078 + (((tickAnim - 18) / 2) * (-14.8131-(-10.0078)));
            yy = 6.8345 + (((tickAnim - 18) / 2) * (9.9029-(6.8345)));
            zz = -2.2517 + (((tickAnim - 18) / 2) * (3.7185-(-2.2517)));
        }
        else if (tickAnim >= 20 && tickAnim < 25) {
            xx = -14.8131 + (((tickAnim - 20) / 5) * (-7.4187-(-14.8131)));
            yy = 9.9029 + (((tickAnim - 20) / 5) * (3.5703-(9.9029)));
            zz = 3.7185 + (((tickAnim - 20) / 5) * (3.9843-(3.7185)));
        }
        else if (tickAnim >= 25 && tickAnim < 27) {
            xx = -7.4187 + (((tickAnim - 25) / 2) * (-4.7037-(-7.4187)));
            yy = 3.5703 + (((tickAnim - 25) / 2) * (-4.5259-(3.5703)));
            zz = 3.9843 + (((tickAnim - 25) / 2) * (3.5664-(3.9843)));
        }
        else if (tickAnim >= 27 && tickAnim < 28) {
            xx = -4.7037 + (((tickAnim - 27) / 1) * (-3.6621-(-4.7037)));
            yy = -4.5259 + (((tickAnim - 27) / 1) * (9.1645-(-4.5259)));
            zz = 3.5664 + (((tickAnim - 27) / 1) * (-10.9836-(3.5664)));
        }
        else if (tickAnim >= 28 && tickAnim < 30) {
            xx = -3.6621 + (((tickAnim - 28) / 2) * (0-(-3.6621)));
            yy = 9.1645 + (((tickAnim - 28) / 2) * (0-(9.1645)));
            zz = -10.9836 + (((tickAnim - 28) / 2) * (0-(-10.9836)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(legl3, legl3.rotateAngleX + (float) Math.toRadians(xx), legl3.rotateAngleY + (float) Math.toRadians(yy), legl3.rotateAngleZ + (float) Math.toRadians(zz));

    }
    public void animAttack(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime, double animTick) {
        EntityPrehistoricFloraHomarus entity = (EntityPrehistoricFloraHomarus) entitylivingbaseIn;
        int animCycle = 20;
        double tickAnim = animTick + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;
         if (tickAnim >= 0 && tickAnim < 3) {
            xx = -5 + (((tickAnim - 0) / 3) * (-5-(-5)));
            yy = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 3) * (-2.5-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 5) {
            xx = -5 + (((tickAnim - 3) / 2) * (-10-(-5)));
            yy = 0 + (((tickAnim - 3) / 2) * (0-(0)));
            zz = -2.5 + (((tickAnim - 3) / 2) * (2.5-(-2.5)));
        }
        else if (tickAnim >= 5 && tickAnim < 8) {
            xx = -10 + (((tickAnim - 5) / 3) * (-15.57-(-10)));
            yy = 0 + (((tickAnim - 5) / 3) * (0-(0)));
            zz = 2.5 + (((tickAnim - 5) / 3) * (-1.14-(2.5)));
        }
        else if (tickAnim >= 8 && tickAnim < 14) {
            xx = -15.57 + (((tickAnim - 8) / 6) * (-2.92-(-15.57)));
            yy = 0 + (((tickAnim - 8) / 6) * (0-(0)));
            zz = -1.14 + (((tickAnim - 8) / 6) * (5-(-1.14)));
        }
        else if (tickAnim >= 14 && tickAnim < 20) {
            xx = -2.92 + (((tickAnim - 14) / 6) * (-5-(-2.92)));
            yy = 0 + (((tickAnim - 14) / 6) * (0-(0)));
            zz = 5 + (((tickAnim - 14) / 6) * (0-(5)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Body, Body.rotateAngleX + (float) Math.toRadians(xx), Body.rotateAngleY + (float) Math.toRadians(yy), Body.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 0) / 5) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 5) * (-3-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 5) / 15) * (0-(0)));
            yy = 0 + (((tickAnim - 5) / 15) * (0-(0)));
            zz = -3 + (((tickAnim - 5) / 15) * (0-(-3)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.Body.rotationPointX = this.Body.rotationPointX + (float)(xx);
        this.Body.rotationPointY = this.Body.rotationPointY - (float)(yy);
        this.Body.rotationPointZ = this.Body.rotationPointZ + (float)(zz);



        this.setRotateAngle(antennule_r, antennule_r.rotateAngleX + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360*4-60))*10), antennule_r.rotateAngleY + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360-60))*10), antennule_r.rotateAngleZ + (float) Math.toRadians(-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360*3-60))*10));



        if (tickAnim >= 0 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 0) / 5) * (-10-(0)));
            yy = 0 + (((tickAnim - 0) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 5) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 20) {
            xx = -10 + (((tickAnim - 5) / 15) * (0-(-10)));
            yy = 0 + (((tickAnim - 5) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 5) / 15) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(antenna_r, antenna_r.rotateAngleX + (float) Math.toRadians(xx), antenna_r.rotateAngleY + (float) Math.toRadians(yy), antenna_r.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 3) * (6.85-(0)));
            zz = 0 + (((tickAnim - 0) / 3) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 3) {
            xx = 0 + (((tickAnim - 3) / 0) * (0-(0)));
            yy = 6.85 + (((tickAnim - 3) / 0) * (19.03-(6.85)));
            zz = 0 + (((tickAnim - 3) / 0) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 3) / 2) * (0-(0)));
            yy = 19.03 + (((tickAnim - 3) / 2) * (24.3-(19.03)));
            zz = 0 + (((tickAnim - 3) / 2) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 7) {
            xx = 0 + (((tickAnim - 5) / 2) * (0-(0)));
            yy = 24.3 + (((tickAnim - 5) / 2) * (26.09-(24.3)));
            zz = 0 + (((tickAnim - 5) / 2) * (0-(0)));
        }
        else if (tickAnim >= 7 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 7) / 1) * (0-(0)));
            yy = 26.09 + (((tickAnim - 7) / 1) * (25.09-(26.09)));
            zz = 0 + (((tickAnim - 7) / 1) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 11) {
            xx = 0 + (((tickAnim - 8) / 3) * (0-(0)));
            yy = 25.09 + (((tickAnim - 8) / 3) * (17.21-(25.09)));
            zz = 0 + (((tickAnim - 8) / 3) * (0-(0)));
        }
        else if (tickAnim >= 11 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 11) / 2) * (0-(0)));
            yy = 17.21 + (((tickAnim - 11) / 2) * (10.23-(17.21)));
            zz = 0 + (((tickAnim - 11) / 2) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 16) {
            xx = 0 + (((tickAnim - 13) / 3) * (0-(0)));
            yy = 10.23 + (((tickAnim - 13) / 3) * (1.96-(10.23)));
            zz = 0 + (((tickAnim - 13) / 3) * (0-(0)));
        }
        else if (tickAnim >= 16 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 16) / 4) * (0-(0)));
            yy = 1.96 + (((tickAnim - 16) / 4) * (0-(1.96)));
            zz = 0 + (((tickAnim - 16) / 4) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(antenna_r2, antenna_r2.rotateAngleX + (float) Math.toRadians(xx), antenna_r2.rotateAngleY + (float) Math.toRadians(yy), antenna_r2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 2) {
            xx = 0 + (((tickAnim - 0) / 2) * (1.1-(0)));
            yy = 0 + (((tickAnim - 0) / 2) * (-14.6-(0)));
            zz = 0 + (((tickAnim - 0) / 2) * (-1.85-(0)));
        }
        else if (tickAnim >= 2 && tickAnim < 3) {
            xx = 1.1 + (((tickAnim - 2) / 1) * (2.2-(1.1)));
            yy = -14.6 + (((tickAnim - 2) / 1) * (-20-(-14.6)));
            zz = -1.85 + (((tickAnim - 2) / 1) * (-3.7-(-1.85)));
        }
        else if (tickAnim >= 3 && tickAnim < 5) {
            xx = 2.2 + (((tickAnim - 3) / 2) * (1.25-(2.2)));
            yy = -20 + (((tickAnim - 3) / 2) * (-14.62-(-20)));
            zz = -3.7 + (((tickAnim - 3) / 2) * (-4.6-(-3.7)));
        }
        else if (tickAnim >= 5 && tickAnim < 7) {
            xx = 1.25 + (((tickAnim - 5) / 2) * (0.3-(1.25)));
            yy = -14.62 + (((tickAnim - 5) / 2) * (0.56-(-14.62)));
            zz = -4.6 + (((tickAnim - 5) / 2) * (-5.5-(-4.6)));
        }
        else if (tickAnim >= 7 && tickAnim < 9) {
            xx = 0.3 + (((tickAnim - 7) / 2) * (-9-(0.3)));
            yy = 0.56 + (((tickAnim - 7) / 2) * (17.82-(0.56)));
            zz = -5.5 + (((tickAnim - 7) / 2) * (-13-(-5.5)));
        }
        else if (tickAnim >= 9 && tickAnim < 11) {
            xx = -9 + (((tickAnim - 9) / 2) * (-10.73052-(-9)));
            yy = 17.82 + (((tickAnim - 9) / 2) * (24.05847-(17.82)));
            zz = -13 + (((tickAnim - 9) / 2) * (-14.62771-(-13)));
        }
        else if (tickAnim >= 11 && tickAnim < 13) {
            xx = -10.73052 + (((tickAnim - 11) / 2) * (-9-(-10.73052)));
            yy = 24.05847 + (((tickAnim - 11) / 2) * (28.18-(24.05847)));
            zz = -14.62771 + (((tickAnim - 11) / 2) * (-13-(-14.62771)));
        }
        else if (tickAnim >= 13 && tickAnim < 16) {
            xx = -9 + (((tickAnim - 13) / 3) * (0.3-(-9)));
            yy = 28.18 + (((tickAnim - 13) / 3) * (23.51-(28.18)));
            zz = -13 + (((tickAnim - 13) / 3) * (-5.5-(-13)));
        }
        else if (tickAnim >= 16 && tickAnim < 18) {
            xx = 0.3 + (((tickAnim - 16) / 2) * (2.2-(0.3)));
            yy = 23.51 + (((tickAnim - 16) / 2) * (15.97-(23.51)));
            zz = -5.5 + (((tickAnim - 16) / 2) * (-3.7-(-5.5)));
        }
        else if (tickAnim >= 18 && tickAnim < 20) {
            xx = 2.2 + (((tickAnim - 18) / 2) * (0-(2.2)));
            yy = 15.97 + (((tickAnim - 18) / 2) * (0-(15.97)));
            zz = -3.7 + (((tickAnim - 18) / 2) * (0-(-3.7)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(antenna_r3, antenna_r3.rotateAngleX + (float) Math.toRadians(xx), antenna_r3.rotateAngleY + (float) Math.toRadians(yy), antenna_r3.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 7) {
            xx = 0 + (((tickAnim - 0) / 7) * (-10-(0)));
            yy = 0 + (((tickAnim - 0) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 7) * (0-(0)));
        }
        else if (tickAnim >= 7 && tickAnim < 20) {
            xx = -10 + (((tickAnim - 7) / 13) * (0-(-10)));
            yy = 0 + (((tickAnim - 7) / 13) * (0-(0)));
            zz = 0 + (((tickAnim - 7) / 13) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(antenna_l, antenna_l.rotateAngleX + (float) Math.toRadians(xx), antenna_l.rotateAngleY + (float) Math.toRadians(yy), antenna_l.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 3) * (-3.51-(0)));
            zz = 0 + (((tickAnim - 0) / 3) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 3) / 2) * (0-(0)));
            yy = -3.51 + (((tickAnim - 3) / 2) * (-22.44-(-3.51)));
            zz = 0 + (((tickAnim - 3) / 2) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 7) {
            xx = 0 + (((tickAnim - 5) / 2) * (0-(0)));
            yy = -22.44 + (((tickAnim - 5) / 2) * (-27.5-(-22.44)));
            zz = 0 + (((tickAnim - 5) / 2) * (0-(0)));
        }
        else if (tickAnim >= 7 && tickAnim < 9) {
            xx = 0 + (((tickAnim - 7) / 2) * (0-(0)));
            yy = -27.5 + (((tickAnim - 7) / 2) * (-27.6-(-27.5)));
            zz = 0 + (((tickAnim - 7) / 2) * (0-(0)));
        }
        else if (tickAnim >= 9 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 9) / 4) * (0-(0)));
            yy = -27.6 + (((tickAnim - 9) / 4) * (-19.27-(-27.6)));
            zz = 0 + (((tickAnim - 9) / 4) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 16) {
            xx = 0 + (((tickAnim - 13) / 3) * (0-(0)));
            yy = -19.27 + (((tickAnim - 13) / 3) * (-6.55-(-19.27)));
            zz = 0 + (((tickAnim - 13) / 3) * (0-(0)));
        }
        else if (tickAnim >= 16 && tickAnim < 18) {
            xx = 0 + (((tickAnim - 16) / 2) * (0-(0)));
            yy = -6.55 + (((tickAnim - 16) / 2) * (-2.49-(-6.55)));
            zz = 0 + (((tickAnim - 16) / 2) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 18) / 2) * (0-(0)));
            yy = -2.49 + (((tickAnim - 18) / 2) * (0-(-2.49)));
            zz = 0 + (((tickAnim - 18) / 2) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(antenna_l2, antenna_l2.rotateAngleX + (float) Math.toRadians(xx), antenna_l2.rotateAngleY + (float) Math.toRadians(yy), antenna_l2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 0 + (((tickAnim - 0) / 3) * (-2.3-(0)));
            yy = 0 + (((tickAnim - 0) / 3) * (25.55-(0)));
            zz = 0 + (((tickAnim - 0) / 3) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 5) {
            xx = -2.3 + (((tickAnim - 3) / 2) * (-2.6-(-2.3)));
            yy = 25.55 + (((tickAnim - 3) / 2) * (32.5-(25.55)));
            zz = 0 + (((tickAnim - 3) / 2) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 7) {
            xx = -2.6 + (((tickAnim - 5) / 2) * (-2.1-(-2.6)));
            yy = 32.5 + (((tickAnim - 5) / 2) * (30.97-(32.5)));
            zz = 0 + (((tickAnim - 5) / 2) * (0-(0)));
        }
        else if (tickAnim >= 7 && tickAnim < 8) {
            xx = -2.1 + (((tickAnim - 7) / 1) * (0.4-(-2.1)));
            yy = 30.97 + (((tickAnim - 7) / 1) * (15.54-(30.97)));
            zz = 0 + (((tickAnim - 7) / 1) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 11) {
            xx = 0.4 + (((tickAnim - 8) / 3) * (8.2-(0.4)));
            yy = 15.54 + (((tickAnim - 8) / 3) * (-12.12-(15.54)));
            zz = 0 + (((tickAnim - 8) / 3) * (0-(0)));
        }
        else if (tickAnim >= 11 && tickAnim < 13) {
            xx = 8.2 + (((tickAnim - 11) / 2) * (10-(8.2)));
            yy = -12.12 + (((tickAnim - 11) / 2) * (-28.2-(-12.12)));
            zz = 0 + (((tickAnim - 11) / 2) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 15) {
            xx = 10 + (((tickAnim - 13) / 2) * (8.2-(10)));
            yy = -28.2 + (((tickAnim - 13) / 2) * (-33.68-(-28.2)));
            zz = 0 + (((tickAnim - 13) / 2) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 18) {
            xx = 8.2 + (((tickAnim - 15) / 3) * (4.1-(8.2)));
            yy = -33.68 + (((tickAnim - 15) / 3) * (-23.94-(-33.68)));
            zz = 0 + (((tickAnim - 15) / 3) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 20) {
            xx = 4.1 + (((tickAnim - 18) / 2) * (0-(4.1)));
            yy = -23.94 + (((tickAnim - 18) / 2) * (0-(-23.94)));
            zz = 0 + (((tickAnim - 18) / 2) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(antenna_l3, antenna_l3.rotateAngleX + (float) Math.toRadians(xx), antenna_l3.rotateAngleY + (float) Math.toRadians(yy), antenna_l3.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 5) {
            xx = 2.5 + (((tickAnim - 0) / 5) * (10-(2.5)));
            yy = 0 + (((tickAnim - 0) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 5) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 8) {
            xx = 10 + (((tickAnim - 5) / 3) * (13.75-(10)));
            yy = 0 + (((tickAnim - 5) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 5) / 3) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 20) {
            xx = 13.75 + (((tickAnim - 8) / 12) * (2.5-(13.75)));
            yy = 0 + (((tickAnim - 8) / 12) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 12) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Tail, Tail.rotateAngleX + (float) Math.toRadians(xx), Tail.rotateAngleY + (float) Math.toRadians(yy), Tail.rotateAngleZ + (float) Math.toRadians(zz));



        this.setRotateAngle(plpl, plpl.rotateAngleX + (float) Math.toRadians(-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360*2-30))*20), plpl.rotateAngleY + (float) Math.toRadians(0), plpl.rotateAngleZ + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360*2-60-30))*10));


        this.setRotateAngle(plpr, plpr.rotateAngleX + (float) Math.toRadians(-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360*2))*20), plpr.rotateAngleY + (float) Math.toRadians(0), plpr.rotateAngleZ + (float) Math.toRadians(-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360*2-60))*10));



        if (tickAnim >= 0 && tickAnim < 5) {
            xx = -2.5 + (((tickAnim - 0) / 5) * (5-(-2.5)));
            yy = 0 + (((tickAnim - 0) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 5) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 8) {
            xx = 5 + (((tickAnim - 5) / 3) * (11.25-(5)));
            yy = 0 + (((tickAnim - 5) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 5) / 3) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 20) {
            xx = 11.25 + (((tickAnim - 8) / 12) * (-2.5-(11.25)));
            yy = 0 + (((tickAnim - 8) / 12) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 12) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Tail2, Tail2.rotateAngleX + (float) Math.toRadians(xx), Tail2.rotateAngleY + (float) Math.toRadians(yy), Tail2.rotateAngleZ + (float) Math.toRadians(zz));



        this.setRotateAngle(plpl2, plpl2.rotateAngleX + (float) Math.toRadians(-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360*2-60-30))*20), plpl2.rotateAngleY + (float) Math.toRadians(0), plpl2.rotateAngleZ + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360*2-60*2-30))*10));


        this.setRotateAngle(plpr2, plpr2.rotateAngleX + (float) Math.toRadians(-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360*2-60))*20), plpr2.rotateAngleY + (float) Math.toRadians(0), plpr2.rotateAngleZ + (float) Math.toRadians(-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360*2-60*2))*10));



        if (tickAnim >= 0 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 0) / 5) * (5-(0)));
            yy = 0 + (((tickAnim - 0) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 5) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 8) {
            xx = 5 + (((tickAnim - 5) / 3) * (9.17-(5)));
            yy = 0 + (((tickAnim - 5) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 5) / 3) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 20) {
            xx = 9.17 + (((tickAnim - 8) / 12) * (0-(9.17)));
            yy = 0 + (((tickAnim - 8) / 12) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 12) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Tail3, Tail3.rotateAngleX + (float) Math.toRadians(xx), Tail3.rotateAngleY + (float) Math.toRadians(yy), Tail3.rotateAngleZ + (float) Math.toRadians(zz));



        this.setRotateAngle(plpl3, plpl3.rotateAngleX + (float) Math.toRadians(-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360*2-60*2-30))*20), plpl3.rotateAngleY + (float) Math.toRadians(0), plpl3.rotateAngleZ + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360*2-60*3-30))*10));


        this.setRotateAngle(plpr3, plpr3.rotateAngleX + (float) Math.toRadians(-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360*2-60*2))*20), plpr3.rotateAngleY + (float) Math.toRadians(0), plpr3.rotateAngleZ + (float) Math.toRadians(-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360*2-60*3))*10));



        if (tickAnim >= 0 && tickAnim < 5) {
            xx = 12.5 + (((tickAnim - 0) / 5) * (17.5-(12.5)));
            yy = 0 + (((tickAnim - 0) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 5) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 8) {
            xx = 17.5 + (((tickAnim - 5) / 3) * (2.42-(17.5)));
            yy = 0 + (((tickAnim - 5) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 5) / 3) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 14) {
            xx = 2.42 + (((tickAnim - 8) / 6) * (-0.31-(2.42)));
            yy = 0 + (((tickAnim - 8) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 6) * (0-(0)));
        }
        else if (tickAnim >= 14 && tickAnim < 20) {
            xx = -0.31 + (((tickAnim - 14) / 6) * (12.5-(-0.31)));
            yy = 0 + (((tickAnim - 14) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 14) / 6) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Tail4, Tail4.rotateAngleX + (float) Math.toRadians(xx), Tail4.rotateAngleY + (float) Math.toRadians(yy), Tail4.rotateAngleZ + (float) Math.toRadians(zz));



        this.setRotateAngle(plpl4, plpl4.rotateAngleX + (float) Math.toRadians(-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360*2-60*3-30))*20), plpl4.rotateAngleY + (float) Math.toRadians(0), plpl4.rotateAngleZ + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360*2-60*4-30))*10));


        this.setRotateAngle(plpr4, plpr4.rotateAngleX + (float) Math.toRadians(-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360*2-60*3))*20), plpr4.rotateAngleY + (float) Math.toRadians(0), plpr4.rotateAngleZ + (float) Math.toRadians(-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360*2-60*4))*10));



        if (tickAnim >= 0 && tickAnim < 5) {
            xx = 7.5 + (((tickAnim - 0) / 5) * (25-(7.5)));
            yy = 0 + (((tickAnim - 0) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 5) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 8) {
            xx = 25 + (((tickAnim - 5) / 3) * (18.98-(25)));
            yy = 0 + (((tickAnim - 5) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 5) / 3) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 10) {
            xx = 18.98 + (((tickAnim - 8) / 2) * (12.45-(18.98)));
            yy = 0 + (((tickAnim - 8) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 2) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 14) {
            xx = 12.45 + (((tickAnim - 10) / 4) * (14.91-(12.45)));
            yy = 0 + (((tickAnim - 10) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 4) * (0-(0)));
        }
        else if (tickAnim >= 14 && tickAnim < 20) {
            xx = 14.91 + (((tickAnim - 14) / 6) * (7.5-(14.91)));
            yy = 0 + (((tickAnim - 14) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 14) / 6) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Tail5, Tail5.rotateAngleX + (float) Math.toRadians(xx), Tail5.rotateAngleY + (float) Math.toRadians(yy), Tail5.rotateAngleZ + (float) Math.toRadians(zz));



        this.setRotateAngle(plpl5, plpl5.rotateAngleX + (float) Math.toRadians(-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360*2-60*4-30))*20), plpl5.rotateAngleY + (float) Math.toRadians(0), plpl5.rotateAngleZ + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360*2-60*5-30))*10));


        this.setRotateAngle(plpr5, plpr5.rotateAngleX + (float) Math.toRadians(-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360*2-60*4))*20), plpr5.rotateAngleY + (float) Math.toRadians(0), plpr5.rotateAngleZ + (float) Math.toRadians(-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360*2-60*5))*10));



        if (tickAnim >= 0 && tickAnim < 7) {
            xx = 62.5 + (((tickAnim - 0) / 7) * (72.5-(62.5)));
            yy = 0 + (((tickAnim - 0) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 7) * (0-(0)));
        }
        else if (tickAnim >= 7 && tickAnim < 12) {
            xx = 72.5 + (((tickAnim - 7) / 5) * (60-(72.5)));
            yy = 0 + (((tickAnim - 7) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 7) / 5) * (0-(0)));
        }
        else if (tickAnim >= 12 && tickAnim < 20) {
            xx = 60 + (((tickAnim - 12) / 8) * (62.5-(60)));
            yy = 0 + (((tickAnim - 12) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 12) / 8) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(telson, telson.rotateAngleX + (float) Math.toRadians(xx), telson.rotateAngleY + (float) Math.toRadians(yy), telson.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 20) {
            xx = -6.73906 + (((tickAnim - 0) / 20) * (-6.73906-(-6.73906)));
            yy = -8.99407 + (((tickAnim - 0) / 20) * (-8.99407-(-8.99407)));
            zz = -29.31907 + (((tickAnim - 0) / 20) * (-29.31907-(-29.31907)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(bone23, bone23.rotateAngleX + (float) Math.toRadians(xx), bone23.rotateAngleY + (float) Math.toRadians(yy), bone23.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 20) {
            xx = -2.8922 + (((tickAnim - 0) / 20) * (-2.8922-(-2.8922)));
            yy = 29.60863 + (((tickAnim - 0) / 20) * (29.60863-(29.60863)));
            zz = -38.92189 + (((tickAnim - 0) / 20) * (-38.92189-(-38.92189)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(UropodL, UropodL.rotateAngleX + (float) Math.toRadians(xx), UropodL.rotateAngleY + (float) Math.toRadians(yy), UropodL.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 20) {
            xx = -2.8922 + (((tickAnim - 0) / 20) * (-2.8922-(-2.8922)));
            yy = -29.60863 + (((tickAnim - 0) / 20) * (-29.60863-(-29.60863)));
            zz = 38.92189 + (((tickAnim - 0) / 20) * (38.92189-(38.92189)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(uropodR, uropodR.rotateAngleX + (float) Math.toRadians(xx), uropodR.rotateAngleY + (float) Math.toRadians(yy), uropodR.rotateAngleZ + (float) Math.toRadians(zz));



        this.setRotateAngle(bone7, bone7.rotateAngleX + (float) Math.toRadians(-6.73906), bone7.rotateAngleY + (float) Math.toRadians(8.99407), bone7.rotateAngleZ + (float) Math.toRadians(29.31907));



        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 0 + (((tickAnim - 0) / 3) * (-1.91763-(0)));
            yy = 0 + (((tickAnim - 0) / 3) * (-21.2674-(0)));
            zz = 5 + (((tickAnim - 0) / 3) * (15.7462-(5)));
        }
        else if (tickAnim >= 3 && tickAnim < 5) {
            xx = -1.91763 + (((tickAnim - 3) / 2) * (-0.13244-(-1.91763)));
            yy = -21.2674 + (((tickAnim - 3) / 2) * (-18.13402-(-21.2674)));
            zz = 15.7462 + (((tickAnim - 3) / 2) * (0.78458-(15.7462)));
        }
        else if (tickAnim >= 5 && tickAnim < 8) {
            xx = -0.13244 + (((tickAnim - 5) / 3) * (-1.50062-(-0.13244)));
            yy = -18.13402 + (((tickAnim - 5) / 3) * (-23.23012-(-18.13402)));
            zz = 0.78458 + (((tickAnim - 5) / 3) * (5.83014-(0.78458)));
        }
        else if (tickAnim >= 8 && tickAnim < 13) {
            xx = -1.50062 + (((tickAnim - 8) / 5) * (-0.62774-(-1.50062)));
            yy = -23.23012 + (((tickAnim - 8) / 5) * (-25.74725-(-23.23012)));
            zz = 5.83014 + (((tickAnim - 8) / 5) * (-4.70025-(5.83014)));
        }
        else if (tickAnim >= 13 && tickAnim < 15) {
            xx = -0.62774 + (((tickAnim - 13) / 2) * (-2.92199-(-0.62774)));
            yy = -25.74725 + (((tickAnim - 13) / 2) * (-25.21146-(-25.74725)));
            zz = -4.70025 + (((tickAnim - 13) / 2) * (12.17133-(-4.70025)));
        }
        else if (tickAnim >= 15 && tickAnim < 18) {
            xx = -2.92199 + (((tickAnim - 15) / 3) * (0.84325-(-2.92199)));
            yy = -25.21146 + (((tickAnim - 15) / 3) * (2.62586-(-25.21146)));
            zz = 12.17133 + (((tickAnim - 15) / 3) * (2.28699-(12.17133)));
        }
        else if (tickAnim >= 18 && tickAnim < 20) {
            xx = 0.84325 + (((tickAnim - 18) / 2) * (0-(0.84325)));
            yy = 2.62586 + (((tickAnim - 18) / 2) * (0-(2.62586)));
            zz = 2.28699 + (((tickAnim - 18) / 2) * (5-(2.28699)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(legr4, legr4.rotateAngleX + (float) Math.toRadians(xx), legr4.rotateAngleY + (float) Math.toRadians(yy), legr4.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 0 + (((tickAnim - 0) / 3) * (0.78481-(0)));
            yy = 0 + (((tickAnim - 0) / 3) * (5.85664-(0)));
            zz = 1 + (((tickAnim - 0) / 3) * (5.04633-(1)));
        }
        else if (tickAnim >= 3 && tickAnim < 5) {
            xx = 0.78481 + (((tickAnim - 3) / 2) * (-0.92633-(0.78481)));
            yy = 5.85664 + (((tickAnim - 3) / 2) * (-10.02504-(5.85664)));
            zz = 5.04633 + (((tickAnim - 3) / 2) * (11.93435-(5.04633)));
        }
        else if (tickAnim >= 5 && tickAnim < 8) {
            xx = -0.92633 + (((tickAnim - 5) / 3) * (1.68037-(-0.92633)));
            yy = -10.02504 + (((tickAnim - 5) / 3) * (-42.57795-(-10.02504)));
            zz = 11.93435 + (((tickAnim - 5) / 3) * (-11.92979-(11.93435)));
        }
        else if (tickAnim >= 8 && tickAnim < 16) {
            xx = 1.68037 + (((tickAnim - 8) / 8) * (1.81095-(1.68037)));
            yy = -42.57795 + (((tickAnim - 8) / 8) * (-51.80746-(-42.57795)));
            zz = -11.92979 + (((tickAnim - 8) / 8) * (-11.84116-(-11.92979)));
        }
        else if (tickAnim >= 16 && tickAnim < 18) {
            xx = 1.81095 + (((tickAnim - 16) / 2) * (-2.45339-(1.81095)));
            yy = -51.80746 + (((tickAnim - 16) / 2) * (-14.79618-(-51.80746)));
            zz = -11.84116 + (((tickAnim - 16) / 2) * (9.47518-(-11.84116)));
        }
        else if (tickAnim >= 18 && tickAnim < 20) {
            xx = -2.45339 + (((tickAnim - 18) / 2) * (0-(-2.45339)));
            yy = -14.79618 + (((tickAnim - 18) / 2) * (0-(-14.79618)));
            zz = 9.47518 + (((tickAnim - 18) / 2) * (1-(9.47518)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(legr3, legr3.rotateAngleX + (float) Math.toRadians(xx), legr3.rotateAngleY + (float) Math.toRadians(yy), legr3.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 4) {
            xx = 0 + (((tickAnim - 0) / 4) * (-0.73338-(0)));
            yy = 0 + (((tickAnim - 0) / 4) * (11.65412-(0)));
            zz = 0 + (((tickAnim - 0) / 4) * (-3.02774-(0)));
        }
        else if (tickAnim >= 4 && tickAnim < 8) {
            xx = -0.73338 + (((tickAnim - 4) / 4) * (-19.83099-(-0.73338)));
            yy = 11.65412 + (((tickAnim - 4) / 4) * (-37.73017-(11.65412)));
            zz = -3.02774 + (((tickAnim - 4) / 4) * (-37.24649-(-3.02774)));
        }
        else if (tickAnim >= 8 && tickAnim < 13) {
            xx = -19.83099 + (((tickAnim - 8) / 5) * (-41.2982-(-19.83099)));
            yy = -37.73017 + (((tickAnim - 8) / 5) * (-21.9949-(-37.73017)));
            zz = -37.24649 + (((tickAnim - 8) / 5) * (-31.823-(-37.24649)));
        }
        else if (tickAnim >= 13 && tickAnim < 17) {
            xx = -41.2982 + (((tickAnim - 13) / 4) * (-34.77081-(-41.2982)));
            yy = -21.9949 + (((tickAnim - 13) / 4) * (-43.33729-(-21.9949)));
            zz = -31.823 + (((tickAnim - 13) / 4) * (-40.41241-(-31.823)));
        }
        else if (tickAnim >= 17 && tickAnim < 20) {
            xx = -34.77081 + (((tickAnim - 17) / 3) * (0-(-34.77081)));
            yy = -43.33729 + (((tickAnim - 17) / 3) * (0-(-43.33729)));
            zz = -40.41241 + (((tickAnim - 17) / 3) * (0-(-40.41241)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(legr2, legr2.rotateAngleX + (float) Math.toRadians(xx), legr2.rotateAngleY + (float) Math.toRadians(yy), legr2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 0 + (((tickAnim - 0) / 3) * (-0.33942-(0)));
            yy = 0 + (((tickAnim - 0) / 3) * (-9.78754-(0)));
            zz = 0 + (((tickAnim - 0) / 3) * (1.8774-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 5) {
            xx = -0.33942 + (((tickAnim - 3) / 2) * (-24.1167-(-0.33942)));
            yy = -9.78754 + (((tickAnim - 3) / 2) * (19.0226-(-9.78754)));
            zz = 1.8774 + (((tickAnim - 3) / 2) * (16.4136-(1.8774)));
        }
        else if (tickAnim >= 5 && tickAnim < 7) {
            xx = -24.1167 + (((tickAnim - 5) / 2) * (-35.94799-(-24.1167)));
            yy = 19.0226 + (((tickAnim - 5) / 2) * (35.44377-(19.0226)));
            zz = 16.4136 + (((tickAnim - 5) / 2) * (50.67899-(16.4136)));
        }
        else if (tickAnim >= 7 && tickAnim < 12) {
            xx = -35.94799 + (((tickAnim - 7) / 5) * (-36.1315-(-35.94799)));
            yy = 35.44377 + (((tickAnim - 7) / 5) * (26.28-(35.44377)));
            zz = 50.67899 + (((tickAnim - 7) / 5) * (39.3295-(50.67899)));
        }
        else if (tickAnim >= 12 && tickAnim < 15) {
            xx = -36.1315 + (((tickAnim - 12) / 3) * (-23.63951-(-36.1315)));
            yy = 26.28 + (((tickAnim - 12) / 3) * (38.80089-(26.28)));
            zz = 39.3295 + (((tickAnim - 12) / 3) * (47.45471-(39.3295)));
        }
        else if (tickAnim >= 15 && tickAnim < 17) {
            xx = -23.63951 + (((tickAnim - 15) / 2) * (-20.0387-(-23.63951)));
            yy = 38.80089 + (((tickAnim - 15) / 2) * (29.1756-(38.80089)));
            zz = 47.45471 + (((tickAnim - 15) / 2) * (25.9478-(47.45471)));
        }
        else if (tickAnim >= 17 && tickAnim < 20) {
            xx = -20.0387 + (((tickAnim - 17) / 3) * (0-(-20.0387)));
            yy = 29.1756 + (((tickAnim - 17) / 3) * (0-(29.1756)));
            zz = 25.9478 + (((tickAnim - 17) / 3) * (0-(25.9478)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(legl2, legl2.rotateAngleX + (float) Math.toRadians(xx), legl2.rotateAngleY + (float) Math.toRadians(yy), legl2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 0) / 5) * (-62.34336-(0)));
            yy = 0 + (((tickAnim - 0) / 5) * (-16.81691-(0)));
            zz = 0 + (((tickAnim - 0) / 5) * (-3.49069-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 13) {
            xx = -62.34336 + (((tickAnim - 5) / 8) * (-80.74116-(-62.34336)));
            yy = -16.81691 + (((tickAnim - 5) / 8) * (-19.67416-(-16.81691)));
            zz = -3.49069 + (((tickAnim - 5) / 8) * (0.84128-(-3.49069)));
        }
        else if (tickAnim >= 13 && tickAnim < 20) {
            xx = -80.74116 + (((tickAnim - 13) / 7) * (0-(-80.74116)));
            yy = -19.67416 + (((tickAnim - 13) / 7) * (0-(-19.67416)));
            zz = 0.84128 + (((tickAnim - 13) / 7) * (0-(0.84128)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(legr, legr.rotateAngleX + (float) Math.toRadians(xx), legr.rotateAngleY + (float) Math.toRadians(yy), legr.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 0 + (((tickAnim - 0) / 3) * (-44.1301-(0)));
            yy = 0 + (((tickAnim - 0) / 3) * (11.3291-(0)));
            zz = 0 + (((tickAnim - 0) / 3) * (28.10236-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 6) {
            xx = -44.1301 + (((tickAnim - 3) / 3) * (-43.99223-(-44.1301)));
            yy = 11.3291 + (((tickAnim - 3) / 3) * (16.27409-(11.3291)));
            zz = 28.10236 + (((tickAnim - 3) / 3) * (20.37147-(28.10236)));
        }
        else if (tickAnim >= 6 && tickAnim < 12) {
            xx = -43.99223 + (((tickAnim - 6) / 6) * (-60.78672-(-43.99223)));
            yy = 16.27409 + (((tickAnim - 6) / 6) * (19.57283-(16.27409)));
            zz = 20.37147 + (((tickAnim - 6) / 6) * (24.07634-(20.37147)));
        }
        else if (tickAnim >= 12 && tickAnim < 20) {
            xx = -60.78672 + (((tickAnim - 12) / 8) * (0-(-60.78672)));
            yy = 19.57283 + (((tickAnim - 12) / 8) * (0-(19.57283)));
            zz = 24.07634 + (((tickAnim - 12) / 8) * (0-(24.07634)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(legl, legl.rotateAngleX + (float) Math.toRadians(xx), legl.rotateAngleY + (float) Math.toRadians(yy), legl.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 5) {
            xx = -15 + (((tickAnim - 0) / 5) * (7.5-(-15)));
            yy = 22.5 + (((tickAnim - 0) / 5) * (-12.5-(22.5)));
            zz = -2.5 + (((tickAnim - 0) / 5) * (15-(-2.5)));
        }
        else if (tickAnim >= 5 && tickAnim < 13) {
            xx = 7.5 + (((tickAnim - 5) / 8) * (7.6781-(7.5)));
            yy = -12.5 + (((tickAnim - 5) / 8) * (-19.2163-(-12.5)));
            zz = 15 + (((tickAnim - 5) / 8) * (14.8822-(15)));
        }
        else if (tickAnim >= 13 && tickAnim < 20) {
            xx = 7.6781 + (((tickAnim - 13) / 7) * (-15-(7.6781)));
            yy = -19.2163 + (((tickAnim - 13) / 7) * (22.5-(-19.2163)));
            zz = 14.8822 + (((tickAnim - 13) / 7) * (-2.5-(14.8822)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(armr, armr.rotateAngleX + (float) Math.toRadians(xx), armr.rotateAngleY + (float) Math.toRadians(yy), armr.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 3) {
            xx = -22.5 + (((tickAnim - 0) / 3) * (-37.5-(-22.5)));
            yy = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 3) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 5) {
            xx = -37.5 + (((tickAnim - 3) / 2) * (-20-(-37.5)));
            yy = 0 + (((tickAnim - 3) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 3) / 2) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 20) {
            xx = -20 + (((tickAnim - 5) / 15) * (-22.5-(-20)));
            yy = 0 + (((tickAnim - 5) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 5) / 15) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(armr2, armr2.rotateAngleX + (float) Math.toRadians(xx), armr2.rotateAngleY + (float) Math.toRadians(yy), armr2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 3) * (25.83-(0)));
            zz = 0 + (((tickAnim - 0) / 3) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 3) / 2) * (0-(0)));
            yy = 25.83 + (((tickAnim - 3) / 2) * (2.91-(25.83)));
            zz = 0 + (((tickAnim - 3) / 2) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 5) / 3) * (0-(0)));
            yy = 2.91 + (((tickAnim - 5) / 3) * (-25-(2.91)));
            zz = 0 + (((tickAnim - 5) / 3) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 8) / 12) * (0-(0)));
            yy = -25 + (((tickAnim - 8) / 12) * (0-(-25)));
            zz = 0 + (((tickAnim - 8) / 12) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(armr3, armr3.rotateAngleX + (float) Math.toRadians(xx), armr3.rotateAngleY + (float) Math.toRadians(yy), armr3.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 2) {
            xx = 0 + (((tickAnim - 0) / 2) * (0-(0)));
            yy = -20 + (((tickAnim - 0) / 2) * (-50-(-20)));
            zz = 0 + (((tickAnim - 0) / 2) * (0-(0)));
        }
        else if (tickAnim >= 2 && tickAnim < 4) {
            xx = 0 + (((tickAnim - 2) / 2) * (0-(0)));
            yy = -50 + (((tickAnim - 2) / 2) * (-50-(-50)));
            zz = 0 + (((tickAnim - 2) / 2) * (0-(0)));
        }
        else if (tickAnim >= 4 && tickAnim < 6) {
            xx = 0 + (((tickAnim - 4) / 2) * (0-(0)));
            yy = -50 + (((tickAnim - 4) / 2) * (-5-(-50)));
            zz = 0 + (((tickAnim - 4) / 2) * (0-(0)));
        }
        else if (tickAnim >= 6 && tickAnim < 11) {
            xx = 0 + (((tickAnim - 6) / 5) * (0-(0)));
            yy = -5 + (((tickAnim - 6) / 5) * (-5-(-5)));
            zz = 0 + (((tickAnim - 6) / 5) * (0-(0)));
        }
        else if (tickAnim >= 11 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 11) / 9) * (0-(0)));
            yy = -5 + (((tickAnim - 11) / 9) * (-20-(-5)));
            zz = 0 + (((tickAnim - 11) / 9) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(clawr, clawr.rotateAngleX + (float) Math.toRadians(xx), clawr.rotateAngleY + (float) Math.toRadians(yy), clawr.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 6) {
            xx = -15 + (((tickAnim - 0) / 6) * (25-(-15)));
            yy = -22.5 + (((tickAnim - 0) / 6) * (12.5-(-22.5)));
            zz = 2.5 + (((tickAnim - 0) / 6) * (-15-(2.5)));
        }
        else if (tickAnim >= 6 && tickAnim < 13) {
            xx = 25 + (((tickAnim - 6) / 7) * (18.75-(25)));
            yy = 12.5 + (((tickAnim - 6) / 7) * (7.5-(12.5)));
            zz = -15 + (((tickAnim - 6) / 7) * (-28.75-(-15)));
        }
        else if (tickAnim >= 13 && tickAnim < 20) {
            xx = 18.75 + (((tickAnim - 13) / 7) * (-15-(18.75)));
            yy = 7.5 + (((tickAnim - 13) / 7) * (-22.5-(7.5)));
            zz = -28.75 + (((tickAnim - 13) / 7) * (2.5-(-28.75)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(arml, arml.rotateAngleX + (float) Math.toRadians(xx), arml.rotateAngleY + (float) Math.toRadians(yy), arml.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 3) {
            xx = -22.5 + (((tickAnim - 0) / 3) * (-35-(-22.5)));
            yy = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 3) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 6) {
            xx = -35 + (((tickAnim - 3) / 3) * (-20-(-35)));
            yy = 0 + (((tickAnim - 3) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 3) / 3) * (0-(0)));
        }
        else if (tickAnim >= 6 && tickAnim < 20) {
            xx = -20 + (((tickAnim - 6) / 14) * (-22.5-(-20)));
            yy = 0 + (((tickAnim - 6) / 14) * (0-(0)));
            zz = 0 + (((tickAnim - 6) / 14) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(arml2, arml2.rotateAngleX + (float) Math.toRadians(xx), arml2.rotateAngleY + (float) Math.toRadians(yy), arml2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 3) * (-23.33-(0)));
            zz = 0 + (((tickAnim - 0) / 3) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 6) {
            xx = 0 + (((tickAnim - 3) / 3) * (0-(0)));
            yy = -23.33 + (((tickAnim - 3) / 3) * (-4.17-(-23.33)));
            zz = 0 + (((tickAnim - 3) / 3) * (0-(0)));
        }
        else if (tickAnim >= 6 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 6) / 2) * (0-(0)));
            yy = -4.17 + (((tickAnim - 6) / 2) * (30-(-4.17)));
            zz = 0 + (((tickAnim - 6) / 2) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 8) / 12) * (0-(0)));
            yy = 30 + (((tickAnim - 8) / 12) * (0-(30)));
            zz = 0 + (((tickAnim - 8) / 12) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(arml3, arml3.rotateAngleX + (float) Math.toRadians(xx), arml3.rotateAngleY + (float) Math.toRadians(yy), arml3.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 0) / 5) * (0-(0)));
            yy = 20 + (((tickAnim - 0) / 5) * (50-(20)));
            zz = 0 + (((tickAnim - 0) / 5) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 6) {
            xx = 0 + (((tickAnim - 5) / 1) * (0-(0)));
            yy = 50 + (((tickAnim - 5) / 1) * (35-(50)));
            zz = 0 + (((tickAnim - 5) / 1) * (0-(0)));
        }
        else if (tickAnim >= 6 && tickAnim < 7) {
            xx = 0 + (((tickAnim - 6) / 1) * (0-(0)));
            yy = 35 + (((tickAnim - 6) / 1) * (-5-(35)));
            zz = 0 + (((tickAnim - 6) / 1) * (0-(0)));
        }
        else if (tickAnim >= 7 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 7) / 6) * (0-(0)));
            yy = -5 + (((tickAnim - 7) / 6) * (-5-(-5)));
            zz = 0 + (((tickAnim - 7) / 6) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 13) / 7) * (0-(0)));
            yy = -5 + (((tickAnim - 13) / 7) * (20-(-5)));
            zz = 0 + (((tickAnim - 13) / 7) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(clawl, clawl.rotateAngleX + (float) Math.toRadians(xx), clawl.rotateAngleY + (float) Math.toRadians(yy), clawl.rotateAngleZ + (float) Math.toRadians(zz));



        this.setRotateAngle(mandibleR, mandibleR.rotateAngleX + (float) Math.toRadians(10-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360*2))*20), mandibleR.rotateAngleY + (float) Math.toRadians(5+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360*2-60))*5), mandibleR.rotateAngleZ + (float) Math.toRadians(20+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360-60))*10));


        this.setRotateAngle(mandibleL, mandibleL.rotateAngleX + (float) Math.toRadians(10-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360*2+60))*20), mandibleL.rotateAngleY + (float) Math.toRadians(-5-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360*2))*5), mandibleL.rotateAngleZ + (float) Math.toRadians(-20-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360))*10));


        this.setRotateAngle(antennule_l, antennule_l.rotateAngleX + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360*4))*10), antennule_l.rotateAngleY + (float) Math.toRadians(-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360))*10), antennule_l.rotateAngleZ + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360*3))*10));



        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 0 + (((tickAnim - 0) / 3) * (0.53996-(0)));
            yy = 0 + (((tickAnim - 0) / 3) * (-6.6614-(0)));
            zz = -5 + (((tickAnim - 0) / 3) * (-4.059-(-5)));
        }
        else if (tickAnim >= 3 && tickAnim < 5) {
            xx = 0.53996 + (((tickAnim - 3) / 2) * (-1.36461-(0.53996)));
            yy = -6.6614 + (((tickAnim - 3) / 2) * (14.67418-(-6.6614)));
            zz = -4.059 + (((tickAnim - 3) / 2) * (-17.83743-(-4.059)));
        }
        else if (tickAnim >= 5 && tickAnim < 8) {
            xx = -1.36461 + (((tickAnim - 5) / 3) * (-0.51642-(-1.36461)));
            yy = 14.67418 + (((tickAnim - 5) / 3) * (21.16798-(14.67418)));
            zz = -17.83743 + (((tickAnim - 5) / 3) * (-3.85922-(-17.83743)));
        }
        else if (tickAnim >= 8 && tickAnim < 16) {
            xx = -0.51642 + (((tickAnim - 8) / 8) * (-1.99481-(-0.51642)));
            yy = 21.16798 + (((tickAnim - 8) / 8) * (32.37832-(21.16798)));
            zz = -3.85922 + (((tickAnim - 8) / 8) * (-2.59965-(-3.85922)));
        }
        else if (tickAnim >= 16 && tickAnim < 18) {
            xx = -1.99481 + (((tickAnim - 16) / 2) * (-2.45339-(-1.99481)));
            yy = 32.37832 + (((tickAnim - 16) / 2) * (14.79618-(32.37832)));
            zz = -2.59965 + (((tickAnim - 16) / 2) * (-9.47518-(-2.59965)));
        }
        else if (tickAnim >= 18 && tickAnim < 20) {
            xx = -2.45339 + (((tickAnim - 18) / 2) * (0-(-2.45339)));
            yy = 14.79618 + (((tickAnim - 18) / 2) * (0-(14.79618)));
            zz = -9.47518 + (((tickAnim - 18) / 2) * (-5-(-9.47518)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(legl4, legl4.rotateAngleX + (float) Math.toRadians(xx), legl4.rotateAngleY + (float) Math.toRadians(yy), legl4.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 0 + (((tickAnim - 0) / 3) * (-1.91763-(0)));
            yy = 0 + (((tickAnim - 0) / 3) * (21.2674-(0)));
            zz = -1 + (((tickAnim - 0) / 3) * (-15.7462-(-1)));
        }
        else if (tickAnim >= 3 && tickAnim < 5) {
            xx = -1.91763 + (((tickAnim - 3) / 2) * (0.0394-(-1.91763)));
            yy = 21.2674 + (((tickAnim - 3) / 2) * (17.92981-(21.2674)));
            zz = -15.7462 + (((tickAnim - 3) / 2) * (-0.2969-(-15.7462)));
        }
        else if (tickAnim >= 5 && tickAnim < 8) {
            xx = 0.0394 + (((tickAnim - 5) / 3) * (4.91354-(0.0394)));
            yy = 17.92981 + (((tickAnim - 5) / 3) * (46.81384-(17.92981)));
            zz = -0.2969 + (((tickAnim - 5) / 3) * (16.66472-(-0.2969)));
        }
        else if (tickAnim >= 8 && tickAnim < 13) {
            xx = 4.91354 + (((tickAnim - 8) / 5) * (-4.2981-(4.91354)));
            yy = 46.81384 + (((tickAnim - 8) / 5) * (57.572-(46.81384)));
            zz = 16.66472 + (((tickAnim - 8) / 5) * (2.97458-(16.66472)));
        }
        else if (tickAnim >= 13 && tickAnim < 15) {
            xx = -4.2981 + (((tickAnim - 13) / 2) * (-2.92199-(-4.2981)));
            yy = 57.572 + (((tickAnim - 13) / 2) * (25.21146-(57.572)));
            zz = 2.97458 + (((tickAnim - 13) / 2) * (-12.17133-(2.97458)));
        }
        else if (tickAnim >= 15 && tickAnim < 18) {
            xx = -2.92199 + (((tickAnim - 15) / 3) * (0.83855-(-2.92199)));
            yy = 25.21146 + (((tickAnim - 15) / 3) * (-2.0977-(25.21146)));
            zz = -12.17133 + (((tickAnim - 15) / 3) * (-3.41994-(-12.17133)));
        }
        else if (tickAnim >= 18 && tickAnim < 20) {
            xx = 0.83855 + (((tickAnim - 18) / 2) * (0-(0.83855)));
            yy = -2.0977 + (((tickAnim - 18) / 2) * (0-(-2.0977)));
            zz = -3.41994 + (((tickAnim - 18) / 2) * (-1-(-3.41994)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(legl3, legl3.rotateAngleX + (float) Math.toRadians(xx), legl3.rotateAngleY + (float) Math.toRadians(yy), legl3.rotateAngleZ + (float) Math.toRadians(zz));

    }


    public void animate(IAnimatedEntity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        EntityPrehistoricFloraHomarus e = (EntityPrehistoricFloraHomarus) entity;
        animator.update(entity);

        animator.setAnimation(e.SWIM_ANIMATION);
        animator.endKeyframe();
        animator.setStaticKeyframe(0);
        animator.resetKeyframe(0);

        animator.setAnimation(e.UNSWIM_ANIMATION);
        animator.endKeyframe();
        animator.setStaticKeyframe(0);
        animator.resetKeyframe(0);

    }
}
