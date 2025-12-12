package net.lepidodendron.entity.model.entity;

import net.ilexiconn.llibrary.client.model.ModelAnimator;
import net.ilexiconn.llibrary.client.model.tools.AdvancedModelRenderer;
import net.ilexiconn.llibrary.server.animation.IAnimatedEntity;
import net.lepidodendron.entity.EntityPrehistoricFloraPsittacosaurus_sinensis;
import net.lepidodendron.entity.model.ModelBasePalaeopedia;
import net.minecraft.client.model.ModelBox;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;

public class ModelPsittacosaurus_sinensis extends ModelBasePalaeopedia {
    private final AdvancedModelRenderer body;
    private final AdvancedModelRenderer cube_r1;
    private final AdvancedModelRenderer cube_r2;
    private final AdvancedModelRenderer tail2;
    private final AdvancedModelRenderer cube_r3;
    private final AdvancedModelRenderer cube_r4;
    private final AdvancedModelRenderer tail3;
    private final AdvancedModelRenderer cube_r5;
    private final AdvancedModelRenderer cube_r6;
    private final AdvancedModelRenderer cube_r7;
    private final AdvancedModelRenderer tail4;
    private final AdvancedModelRenderer tail5;
    private final AdvancedModelRenderer leftleg;
    private final AdvancedModelRenderer leftleg2;
    private final AdvancedModelRenderer leftleg3;
    private final AdvancedModelRenderer leftleg4;
    private final AdvancedModelRenderer rightleg;
    private final AdvancedModelRenderer rightleg2;
    private final AdvancedModelRenderer rightleg3;
    private final AdvancedModelRenderer rightleg4;
    private final AdvancedModelRenderer cube_r8;
    private final AdvancedModelRenderer upperbody2;
    private final AdvancedModelRenderer upperbody;
    private final AdvancedModelRenderer cube_r9;
    private final AdvancedModelRenderer neck;
    private final AdvancedModelRenderer cube_r10;
    private final AdvancedModelRenderer head;
    private final AdvancedModelRenderer cube_r11;
    private final AdvancedModelRenderer cube_r12;
    private final AdvancedModelRenderer cube_r13;
    private final AdvancedModelRenderer cube_r14;
    private final AdvancedModelRenderer cube_r15;
    private final AdvancedModelRenderer cube_r16;
    private final AdvancedModelRenderer cube_r17;
    private final AdvancedModelRenderer leftside;
    private final AdvancedModelRenderer cube_r18;
    private final AdvancedModelRenderer cube_r19;
    private final AdvancedModelRenderer cube_r20;
    private final AdvancedModelRenderer cube_r21;
    private final AdvancedModelRenderer jaw;
    private final AdvancedModelRenderer cube_r22;
    private final AdvancedModelRenderer cube_r23;
    private final AdvancedModelRenderer cube_r24;
    private final AdvancedModelRenderer cube_r25;
    private final AdvancedModelRenderer cube_r26;
    private final AdvancedModelRenderer cube_r27;
    private final AdvancedModelRenderer cube_r28;
    private final AdvancedModelRenderer eye;
    private final AdvancedModelRenderer cube_r29;
    private final AdvancedModelRenderer cube_r30;
    private final AdvancedModelRenderer leftarm;
    private final AdvancedModelRenderer leftarm2;
    private final AdvancedModelRenderer leftarm3;
    private final AdvancedModelRenderer rightarm;
    private final AdvancedModelRenderer rightarm2;
    private final AdvancedModelRenderer rightarm3;

    private ModelAnimator animator;

    public ModelPsittacosaurus_sinensis() {
        this.textureWidth = 75;
        this.textureHeight = 75;

        this.body = new AdvancedModelRenderer(this);
        this.body.setRotationPoint(0.0F, 23.75F, 3.75F);


        this.cube_r1 = new AdvancedModelRenderer(this);
        this.cube_r1.setRotationPoint(-0.5F, -15.7358F, -4.2945F);
        this.body.addChild(cube_r1);
        this.setRotateAngle(cube_r1, -0.3927F, 0.0F, 0.0F);
        this.cube_r1.cubeList.add(new ModelBox(cube_r1, 14, 35, -0.5F, -5.825F, 0.25F, 2, 6, 6, 0.0F, false));
        this.cube_r1.cubeList.add(new ModelBox(cube_r1, 22, 9, -1.5F, -5.825F, 0.25F, 4, 6, 6, 0.0F, false));
        this.cube_r1.cubeList.add(new ModelBox(cube_r1, 28, 0, -2.0F, -2.825F, 0.25F, 5, 3, 6, 0.0F, false));

        this.cube_r2 = new AdvancedModelRenderer(this);
        this.cube_r2.setRotationPoint(0.5F, -15.7358F, -4.2945F);
        this.body.addChild(cube_r2);
        this.setRotateAngle(cube_r2, -0.2182F, 0.0F, 0.0F);
        this.cube_r2.cubeList.add(new ModelBox(cube_r2, 0, 15, -3.5F, 0.0F, 0.25F, 6, 7, 6, 0.0F, false));

        this.tail2 = new AdvancedModelRenderer(this);
        this.tail2.setRotationPoint(0.0F, -14.2875F, 1.5519F);
        this.body.addChild(tail2);
        this.setRotateAngle(tail2, -0.2618F, 0.0F, 0.0F);
        this.tail2.cubeList.add(new ModelBox(tail2, 30, 37, -2.0F, -0.0872F, -0.5038F, 4, 5, 4, 0.0F, false));

        this.cube_r3 = new AdvancedModelRenderer(this);
        this.cube_r3.setRotationPoint(0.0F, -0.1089F, 2.542F);
        this.tail2.addChild(cube_r3);
        this.setRotateAngle(cube_r3, -0.3491F, 0.0F, 0.0F);
        this.cube_r3.cubeList.add(new ModelBox(cube_r3, 53, 18, -0.5F, -3.9283F, -3.0458F, 1, 5, 4, 0.0F, false));

        this.cube_r4 = new AdvancedModelRenderer(this);
        this.cube_r4.setRotationPoint(0.0F, -0.1089F, 2.542F);
        this.tail2.addChild(cube_r4);
        this.setRotateAngle(cube_r4, -0.2618F, 0.0F, 0.0F);
        this.cube_r4.cubeList.add(new ModelBox(cube_r4, 39, 48, -1.0F, -3.2283F, -3.0458F, 2, 4, 4, 0.0F, false));
        this.cube_r4.cubeList.add(new ModelBox(cube_r4, 0, 50, -1.5F, -1.2283F, -3.0458F, 3, 2, 4, 0.0F, false));

        this.tail3 = new AdvancedModelRenderer(this);
        this.tail3.setRotationPoint(0.0F, -0.0311F, 3.088F);
        this.tail2.addChild(tail3);
        this.setRotateAngle(tail3, -0.1309F, 0.0F, 0.0F);
        this.tail3.cubeList.add(new ModelBox(tail3, 0, 42, -1.5F, 0.0F, 0.0F, 3, 3, 5, -0.001F, false));

        this.cube_r5 = new AdvancedModelRenderer(this);
        this.cube_r5.setRotationPoint(0.0F, -0.0217F, 3.0458F);
        this.tail3.addChild(cube_r5);
        this.setRotateAngle(cube_r5, -0.3491F, 0.0F, 0.0F);
        this.cube_r5.cubeList.add(new ModelBox(cube_r5, 24, 30, 0.0F, -2.8783F, -3.0458F, 0, 5, 5, -0.001F, false));

        this.cube_r6 = new AdvancedModelRenderer(this);
        this.cube_r6.setRotationPoint(0.0F, -0.0217F, 3.0458F);
        this.tail3.addChild(cube_r6);
        this.setRotateAngle(cube_r6, -0.2182F, 0.0F, 0.0F);
        this.cube_r6.cubeList.add(new ModelBox(cube_r6, 45, 4, -0.5F, -2.3783F, -3.0458F, 1, 4, 5, -0.001F, false));

        this.cube_r7 = new AdvancedModelRenderer(this);
        this.cube_r7.setRotationPoint(0.0F, -0.0217F, 3.0458F);
        this.tail3.addChild(cube_r7);
        this.setRotateAngle(cube_r7, -0.1309F, 0.0F, 0.0F);
        this.cube_r7.cubeList.add(new ModelBox(cube_r7, 25, 46, -1.0F, -0.4783F, -3.0458F, 2, 2, 5, -0.001F, false));

        this.tail4 = new AdvancedModelRenderer(this);
        this.tail4.setRotationPoint(0.0F, 0.0F, 4.0F);
        this.tail3.addChild(tail4);
        this.setRotateAngle(tail4, 0.1309F, 0.0F, 0.0F);
        this.tail4.cubeList.add(new ModelBox(tail4, 40, 40, -1.0F, 0.1305F, -0.0086F, 2, 2, 6, 0.0F, false));

        this.tail5 = new AdvancedModelRenderer(this);
        this.tail5.setRotationPoint(0.0F, 0.4791F, 5.1998F);
        this.tail4.addChild(tail5);
        this.setRotateAngle(tail5, 0.1309F, 0.0F, 0.0F);
        this.tail5.cubeList.add(new ModelBox(tail5, 48, 32, -0.5F, 0.0F, 0.0F, 1, 1, 6, 0.0F, false));

        this.leftleg = new AdvancedModelRenderer(this);
        this.leftleg.setRotationPoint(2.75F, -14.1507F, -4.2743F);
        this.body.addChild(leftleg);
        this.setRotateAngle(leftleg, -0.3491F, 0.0F, 0.0F);
        this.leftleg.cubeList.add(new ModelBox(leftleg, 37, 16, -1.0F, 0.5565F, -2.2309F, 3, 6, 5, 0.0F, false));

        this.leftleg2 = new AdvancedModelRenderer(this);
        this.leftleg2.setRotationPoint(0.5F, 6.3506F, -2.0704F);
        this.leftleg.addChild(leftleg2);
        this.setRotateAngle(leftleg2, 0.9599F, 0.0F, 0.0F);
        this.leftleg2.cubeList.add(new ModelBox(leftleg2, 51, 48, -1.0F, 0.0565F, 0.0191F, 2, 7, 3, 0.0F, false));

        this.leftleg3 = new AdvancedModelRenderer(this);
        this.leftleg3.setRotationPoint(0.0F, 6.3043F, 1.6329F);
        this.leftleg2.addChild(leftleg3);
        this.setRotateAngle(leftleg3, -0.6545F, 0.0F, 0.0F);
        this.leftleg3.cubeList.add(new ModelBox(leftleg3, 0, 56, -1.0F, -0.3685F, -1.0059F, 2, 5, 2, 0.001F, false));

        this.leftleg4 = new AdvancedModelRenderer(this);
        this.leftleg4.setRotationPoint(0.0F, 3.9767F, -0.5285F);
        this.leftleg3.addChild(leftleg4);
        this.setRotateAngle(leftleg4, 0.0436F, 0.0F, 0.0F);
        this.leftleg4.cubeList.add(new ModelBox(leftleg4, 52, 0, -1.5F, 0.0F, -3.0F, 3, 1, 4, 0.0F, false));

        this.rightleg = new AdvancedModelRenderer(this);
        this.rightleg.setRotationPoint(-2.75F, -14.1507F, -4.2743F);
        this.body.addChild(rightleg);
        this.setRotateAngle(rightleg, -0.3491F, 0.0F, 0.0F);
        this.rightleg.cubeList.add(new ModelBox(rightleg, 37, 16, -2.0F, 0.5565F, -2.2309F, 3, 6, 5, 0.0F, true));

        this.rightleg2 = new AdvancedModelRenderer(this);
        this.rightleg2.setRotationPoint(-0.5F, 6.3506F, -2.0704F);
        this.rightleg.addChild(rightleg2);
        this.setRotateAngle(rightleg2, 0.9599F, 0.0F, 0.0F);
        this.rightleg2.cubeList.add(new ModelBox(rightleg2, 51, 48, -1.0F, 0.0565F, 0.0191F, 2, 7, 3, 0.0F, true));

        this.rightleg3 = new AdvancedModelRenderer(this);
        this.rightleg3.setRotationPoint(0.0F, 6.3043F, 1.6329F);
        this.rightleg2.addChild(rightleg3);
        this.setRotateAngle(rightleg3, -0.6545F, 0.0F, 0.0F);
        this.rightleg3.cubeList.add(new ModelBox(rightleg3, 0, 56, -1.0F, -0.3685F, -1.0059F, 2, 5, 2, 0.001F, true));

        this.rightleg4 = new AdvancedModelRenderer(this);
        this.rightleg4.setRotationPoint(0.0F, 3.9767F, -0.5285F);
        this.rightleg3.addChild(rightleg4);
        this.setRotateAngle(rightleg4, -0.0436F, 0.0F, 0.0F);


        this.cube_r8 = new AdvancedModelRenderer(this);
        this.cube_r8.setRotationPoint(-0.5F, -0.5F, 0.5F);
        this.rightleg4.addChild(cube_r8);
        this.setRotateAngle(cube_r8, 0.0873F, 0.0F, 0.0F);
        this.cube_r8.cubeList.add(new ModelBox(cube_r8, 52, 0, -1.0F, 0.5F, -3.5F, 3, 1, 4, 0.0F, true));

        this.upperbody2 = new AdvancedModelRenderer(this);
        this.upperbody2.setRotationPoint(0.0F, -15.8F, -4.0F);
        this.body.addChild(upperbody2);
        this.upperbody2.cubeList.add(new ModelBox(upperbody2, 0, 0, -3.5F, 0.0F, -7.0F, 7, 8, 7, 0.0F, true));

        this.upperbody = new AdvancedModelRenderer(this);
        this.upperbody.setRotationPoint(0.0F, 0.278F, -6.9032F);
        this.upperbody2.addChild(upperbody);


        this.cube_r9 = new AdvancedModelRenderer(this);
        this.cube_r9.setRotationPoint(0.5F, -0.191F, 0.0724F);
        this.upperbody.addChild(cube_r9);
        this.setRotateAngle(cube_r9, 0.3054F, 0.0F, 0.0F);
        this.cube_r9.cubeList.add(new ModelBox(cube_r9, 18, 22, -3.0F, -0.066F, -6.046F, 5, 7, 6, 0.0F, false));

        this.neck = new AdvancedModelRenderer(this);
        this.neck.setRotationPoint(0.0F, 1.8506F, -3.0864F);
        this.upperbody.addChild(neck);
        this.setRotateAngle(neck, -0.3054F, 0.0F, 0.0F);
        this.neck.cubeList.add(new ModelBox(neck, 0, 29, -2.0F, 0.0F, -6.0F, 4, 4, 6, -0.004F, false));

        this.cube_r10 = new AdvancedModelRenderer(this);
        this.cube_r10.setRotationPoint(0.0F, 3.5F, -6.0F);
        this.neck.addChild(cube_r10);
        this.setRotateAngle(cube_r10, -0.1309F, 0.0F, 0.0F);
        this.cube_r10.cubeList.add(new ModelBox(cube_r10, 34, 29, -2.0F, -1.4F, 0.9F, 4, 2, 6, -0.01F, false));

        this.head = new AdvancedModelRenderer(this);
        this.head.setRotationPoint(0.0F, 0.0F, -6.0F);
        this.neck.addChild(head);
        this.setRotateAngle(head, 0.3491F, 0.0F, 0.0F);
        this.head.cubeList.add(new ModelBox(head, 48, 27, -2.5F, 0.0F, -2.25F, 5, 2, 3, -0.004F, false));

        this.cube_r11 = new AdvancedModelRenderer(this);
        this.cube_r11.setRotationPoint(-0.5F, 4.111F, -5.379F);
        this.head.addChild(cube_r11);
        this.setRotateAngle(cube_r11, 0.1745F, 0.0F, 0.0F);
        this.cube_r11.cubeList.add(new ModelBox(cube_r11, 48, 13, -2.0F, -2.0F, 3.5F, 5, 2, 3, -0.002F, false));
        this.cube_r11.cubeList.add(new ModelBox(cube_r11, 18, 13, -0.225F, -1.75F, 1.0F, 0, 2, 2, 0.0F, true));
        this.cube_r11.cubeList.add(new ModelBox(cube_r11, 18, 13, 1.225F, -1.75F, 1.0F, 0, 2, 2, 0.0F, false));

        this.cube_r12 = new AdvancedModelRenderer(this);
        this.cube_r12.setRotationPoint(-2.5F, 2.4316F, -1.6134F);
        this.head.addChild(cube_r12);
        this.setRotateAngle(cube_r12, 0.2009F, -0.5148F, -0.0999F);
        this.cube_r12.cubeList.add(new ModelBox(cube_r12, 11, 54, -0.15F, -2.0F, -3.425F, 2, 3, 3, 0.0F, true));

        this.cube_r13 = new AdvancedModelRenderer(this);
        this.cube_r13.setRotationPoint(2.5F, 2.4316F, -1.6134F);
        this.head.addChild(cube_r13);
        this.setRotateAngle(cube_r13, 0.2009F, 0.5148F, 0.0999F);
        this.cube_r13.cubeList.add(new ModelBox(cube_r13, 11, 54, -1.85F, -2.0F, -3.425F, 2, 3, 3, 0.0F, false));

        this.cube_r14 = new AdvancedModelRenderer(this);
        this.cube_r14.setRotationPoint(0.0F, 4.136F, -5.379F);
        this.head.addChild(cube_r14);
        this.setRotateAngle(cube_r14, 0.1745F, 0.0F, 0.0F);
        this.cube_r14.cubeList.add(new ModelBox(cube_r14, 21, 0, -1.0F, -2.0F, 0.0F, 2, 2, 4, -0.001F, false));

        this.cube_r15 = new AdvancedModelRenderer(this);
        this.cube_r15.setRotationPoint(-0.5F, 4.0239F, -6.3752F);
        this.head.addChild(cube_r15);
        this.setRotateAngle(cube_r15, 0.7854F, 0.0F, 0.0F);
        this.cube_r15.cubeList.add(new ModelBox(cube_r15, 0, 28, 0.0F, 0.0F, 0.0F, 1, 1, 1, 0.001F, false));

        this.cube_r16 = new AdvancedModelRenderer(this);
        this.cube_r16.setRotationPoint(-0.5F, 1.0353F, -6.1137F);
        this.head.addChild(cube_r16);
        this.setRotateAngle(cube_r16, -0.0873F, 0.0F, 0.0F);
        this.cube_r16.cubeList.add(new ModelBox(cube_r16, 18, 17, 0.0F, 0.0F, 0.0F, 1, 3, 1, -0.002F, false));

        this.cube_r17 = new AdvancedModelRenderer(this);
        this.cube_r17.setRotationPoint(0.0F, 0.0F, -2.25F);
        this.head.addChild(cube_r17);
        this.setRotateAngle(cube_r17, 0.2618F, 0.0F, 0.0F);
        this.cube_r17.cubeList.add(new ModelBox(cube_r17, 36, 9, -1.0F, 0.0F, -4.0F, 2, 2, 4, -0.002F, false));

        this.leftside = new AdvancedModelRenderer(this);
        this.leftside.setRotationPoint(2.1583F, 2.8101F, -2.003F);
        this.head.addChild(leftside);
        this.setRotateAngle(leftside, 0.1745F, 0.0F, 0.0F);


        this.cube_r18 = new AdvancedModelRenderer(this);
        this.cube_r18.setRotationPoint(-3.9583F, -0.3111F, 2.2748F);
        this.leftside.addChild(cube_r18);
        this.setRotateAngle(cube_r18, 0.0F, 0.0F, -0.1745F);
        this.cube_r18.cubeList.add(new ModelBox(cube_r18, 0, 39, -3.55F, -0.45F, -2.7F, 3, 1, 1, 0.0F, true));

        this.cube_r19 = new AdvancedModelRenderer(this);
        this.cube_r19.setRotationPoint(-3.9583F, -1.3111F, 2.2748F);
        this.leftside.addChild(cube_r19);
        this.setRotateAngle(cube_r19, 0.0F, 0.5672F, 0.0F);
        this.cube_r19.cubeList.add(new ModelBox(cube_r19, 30, 55, -0.3F, 0.0F, -2.75F, 2, 2, 3, 0.0F, true));

        this.cube_r20 = new AdvancedModelRenderer(this);
        this.cube_r20.setRotationPoint(-0.3583F, -0.3111F, 2.2748F);
        this.leftside.addChild(cube_r20);
        this.setRotateAngle(cube_r20, 0.0F, 0.0F, 0.1745F);
        this.cube_r20.cubeList.add(new ModelBox(cube_r20, 0, 39, 0.55F, -0.45F, -2.7F, 3, 1, 1, 0.0F, false));

        this.cube_r21 = new AdvancedModelRenderer(this);
        this.cube_r21.setRotationPoint(-0.3583F, -1.3111F, 2.2748F);
        this.leftside.addChild(cube_r21);
        this.setRotateAngle(cube_r21, 0.0F, -0.5672F, 0.0F);
        this.cube_r21.cubeList.add(new ModelBox(cube_r21, 30, 55, -1.7F, 0.0F, -2.75F, 2, 2, 3, 0.0F, false));

        this.jaw = new AdvancedModelRenderer(this);
        this.jaw.setRotationPoint(0.0F, 3.3919F, -1.3019F);
        this.head.addChild(jaw);
        this.setRotateAngle(jaw, 0.0436F, 0.0F, 0.0F);


        this.cube_r22 = new AdvancedModelRenderer(this);
        this.cube_r22.setRotationPoint(-2.0367F, 1.0975F, -0.4733F);
        this.jaw.addChild(cube_r22);
        this.setRotateAngle(cube_r22, 0.1841F, -0.4349F, -0.0564F);
        this.cube_r22.cubeList.add(new ModelBox(cube_r22, 34, 46, 0.05F, -1.0F, -3.0F, 1, 1, 3, 0.0F, true));

        this.cube_r23 = new AdvancedModelRenderer(this);
        this.cube_r23.setRotationPoint(0.0F, 0.7192F, -4.0771F);
        this.jaw.addChild(cube_r23);
        this.setRotateAngle(cube_r23, 0.1745F, 0.0F, 0.0F);
        this.cube_r23.cubeList.add(new ModelBox(cube_r23, 21, 0, -0.75F, -0.25F, 1.25F, 0, 1, 2, 0.0F, true));
        this.cube_r23.cubeList.add(new ModelBox(cube_r23, 50, 39, -2.0F, 0.0F, 3.5F, 4, 2, 3, 0.0F, false));
        this.cube_r23.cubeList.add(new ModelBox(cube_r23, 21, 0, 0.75F, -0.25F, 1.25F, 0, 1, 2, 0.0F, false));
        this.cube_r23.cubeList.add(new ModelBox(cube_r23, 21, 53, -1.0F, 0.0F, 0.75F, 2, 1, 4, -0.001F, false));

        this.cube_r24 = new AdvancedModelRenderer(this);
        this.cube_r24.setRotationPoint(-2.0367F, 1.0975F, -0.4733F);
        this.jaw.addChild(cube_r24);
        this.setRotateAngle(cube_r24, 0.174F, -0.2607F, -0.0529F);
        this.cube_r24.cubeList.add(new ModelBox(cube_r24, 0, 12, 0.55F, -2.75F, -2.0F, 0, 2, 3, 0.0F, true));

        this.cube_r25 = new AdvancedModelRenderer(this);
        this.cube_r25.setRotationPoint(2.0367F, 1.0975F, -0.4733F);
        this.jaw.addChild(cube_r25);
        this.setRotateAngle(cube_r25, 0.174F, 0.2607F, 0.0529F);
        this.cube_r25.cubeList.add(new ModelBox(cube_r25, 0, 12, -0.55F, -2.75F, -2.0F, 0, 2, 3, 0.0F, false));

        this.cube_r26 = new AdvancedModelRenderer(this);
        this.cube_r26.setRotationPoint(2.0367F, 1.0975F, -0.4733F);
        this.jaw.addChild(cube_r26);
        this.setRotateAngle(cube_r26, 0.1841F, 0.4349F, 0.0564F);
        this.cube_r26.cubeList.add(new ModelBox(cube_r26, 34, 46, -1.05F, -1.0F, -3.0F, 1, 1, 3, 0.0F, false));

        this.cube_r27 = new AdvancedModelRenderer(this);
        this.cube_r27.setRotationPoint(0.5F, 1.5303F, -3.4186F);
        this.jaw.addChild(cube_r27);
        this.setRotateAngle(cube_r27, -0.2618F, 0.0F, 0.0F);
        this.cube_r27.cubeList.add(new ModelBox(cube_r27, 21, 0, -1.0F, -0.975F, -0.725F, 1, 1, 1, 0.0F, false));

        this.cube_r28 = new AdvancedModelRenderer(this);
        this.cube_r28.setRotationPoint(0.0F, 1.5737F, -3.1648F);
        this.jaw.addChild(cube_r28);
        this.setRotateAngle(cube_r28, -0.1484F, 0.0F, 0.0F);
        this.cube_r28.cubeList.add(new ModelBox(cube_r28, 44, 0, -1.0F, -0.95F, 0.0F, 2, 1, 3, -0.002F, false));

        this.eye = new AdvancedModelRenderer(this);
        this.eye.setRotationPoint(0.0F, 1.2F, -3.1158F);
        this.head.addChild(eye);
        this.setRotateAngle(eye, 0.1789F, 0.0F, 0.0F);


        this.cube_r29 = new AdvancedModelRenderer(this);
        this.cube_r29.setRotationPoint(-0.9046F, 0.0F, 0.0F);
        this.eye.addChild(cube_r29);
        this.setRotateAngle(cube_r29, 0.0F, -0.5498F, 0.0F);
        this.cube_r29.cubeList.add(new ModelBox(cube_r29, 67, 0, -1.0F, -0.5F, -0.5F, 2, 1, 1, 0.0F, true));

        this.cube_r30 = new AdvancedModelRenderer(this);
        this.cube_r30.setRotationPoint(0.9046F, 0.0F, 0.0F);
        this.eye.addChild(cube_r30);
        this.setRotateAngle(cube_r30, 0.0F, 0.5498F, 0.0F);
        this.cube_r30.cubeList.add(new ModelBox(cube_r30, 67, 0, -1.0F, -0.5F, -0.5F, 2, 1, 1, 0.0F, false));

        this.leftarm = new AdvancedModelRenderer(this);
        this.leftarm.setRotationPoint(2.7447F, 4.7473F, -3.23F);
        this.upperbody.addChild(leftarm);
        this.setRotateAngle(leftarm, -0.952F, 0.4996F, -0.109F);
        this.leftarm.cubeList.add(new ModelBox(leftarm, 11, 47, -1.0F, -1.0F, 0.0F, 2, 2, 5, 0.0F, false));

        this.leftarm2 = new AdvancedModelRenderer(this);
        this.leftarm2.setRotationPoint(0.25F, 1.25F, 4.75F);
        this.leftarm.addChild(leftarm2);
        this.setRotateAngle(leftarm2, 0.1309F, 0.0F, 0.0F);
        this.leftarm2.cubeList.add(new ModelBox(leftarm2, 0, 0, -0.5F, -1.5F, -1.0F, 1, 5, 2, -0.01F, false));

        this.leftarm3 = new AdvancedModelRenderer(this);
        this.leftarm3.setRotationPoint(0.1076F, 4.2825F, 0.0F);
        this.leftarm2.addChild(leftarm3);
        this.setRotateAngle(leftarm3, 0.0F, 0.0F, 0.4363F);
        this.leftarm3.cubeList.add(new ModelBox(leftarm3, 0, 17, -1.0F, -0.9F, -1.0F, 1, 2, 2, 0.0F, false));

        this.rightarm = new AdvancedModelRenderer(this);
        this.rightarm.setRotationPoint(-2.7447F, 4.7473F, -3.23F);
        this.upperbody.addChild(rightarm);
        this.setRotateAngle(rightarm, -0.952F, -0.4996F, 0.109F);
        this.rightarm.cubeList.add(new ModelBox(rightarm, 11, 47, -1.0F, -1.0F, 0.0F, 2, 2, 5, 0.0F, true));

        this.rightarm2 = new AdvancedModelRenderer(this);
        this.rightarm2.setRotationPoint(-0.25F, 1.25F, 4.75F);
        this.rightarm.addChild(rightarm2);
        this.setRotateAngle(rightarm2, 0.1309F, 0.0F, 0.0F);
        this.rightarm2.cubeList.add(new ModelBox(rightarm2, 0, 0, -0.5F, -1.5F, -1.0F, 1, 5, 2, -0.01F, true));

        this.rightarm3 = new AdvancedModelRenderer(this);
        this.rightarm3.setRotationPoint(-0.1076F, 4.2825F, 0.0F);
        this.rightarm2.addChild(rightarm3);
        this.setRotateAngle(rightarm3, 0.0F, 0.0F, -0.4363F);
        this.rightarm3.cubeList.add(new ModelBox(rightarm3, 0, 17, 0.0F, -0.9F, -1.0F, 1, 2, 2, 0.0F, true));


        updateDefaultPose();
        animator = ModelAnimator.create();
    }

    @Override
    public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        animate((IAnimatedEntity) entity, f, f1, f2, f3, f4, f5);
        this.body.render(f5);
    }

    @Override
    public void renderStaticBook(float f) {
        //Rotations, positions and sizing:
        this.body.offsetY = -0.5F;
        this.body.offsetX = -0.35F;
        this.body.offsetZ = 2.0F;
        this.body.rotateAngleY = (float)Math.toRadians(230);
        this.body.rotateAngleX = (float)Math.toRadians(12);
        this.body.rotateAngleZ = (float)Math.toRadians(-8);
        this.body.scaleChildren = true;
        float scaler = 1.4F;
        this.body.setScale(scaler, scaler, scaler);
        //Start of pose:

        //End of pose, now render the model:
        this.body.render(f);
        //Reset rotations, positions and sizing:
        this.body.setScale(1.0F, 1.0F, 1.0F);
        this.body.scaleChildren = false;
        resetToDefaultPose();
    }

    public void renderStaticFloor(float f) {
        this.setRotateAngle(upperbody, 0.0F, 0.0873F, 0.0F);
        this.setRotateAngle(tail5, 0.2182F, 0.0F, 0.0F);
        this.setRotateAngle(tail4, 0.3054F, 0.0F, 0.0F);
        this.setRotateAngle(tail3, -0.2151F, -0.0946F, -0.0238F);
        this.setRotateAngle(tail2, -0.3952F, -0.1248F, 0.0396F);
        this.setRotateAngle(rightleg4, 1.789F, 0.0F, 0.0F);
        this.setRotateAngle(rightleg3, -0.2618F, 0.0F, 0.0F);
        this.setRotateAngle(rightleg2, 0.9163F, 0.0F, 0.0F);
        this.setRotateAngle(rightleg, 0.6121F, -0.3846F, 0.0277F);
        this.setRotateAngle(rightarm3, 0.0F, 0.0F, -0.4363F);
        this.setRotateAngle(rightarm2, -0.0654F, -0.4326F, 0.761F);
        this.setRotateAngle(rightarm, -1.6263F, -0.7725F, 1.167F);
        this.setRotateAngle(neck, 0.F, 0.F, 0.0F);
        this.setRotateAngle(leftside, 0.1745F, 0.0F, 0.0F);
        this.setRotateAngle(leftleg4, 1.7453F, 0.0F, 0.0F);
        this.setRotateAngle(leftleg3, -0.1745F, 0.0F, 0.0F);
        this.setRotateAngle(leftleg2, 0.9163F, 0.0F, 0.0F);
        this.setRotateAngle(leftleg, 0.6214F, 0.1927F, 0.0298F);
        this.setRotateAngle(leftarm3, 0.0F, 0.0F, 0.4363F);
        this.setRotateAngle(leftarm2, -0.2187F, 0.4652F, -0.621F);
        this.setRotateAngle(leftarm, -1.5555F, 0.6462F, -1.1063F);
        this.setRotateAngle(head, -0.F, -0.00F, -0.0F);
        this.setRotateAngle(eye, 0.1789F, 0.0F, 0.0F);
//        this.setRotateAngle(cube_r9, -0.1309F, 0.0F, 0.0F);
//        this.setRotateAngle(cube_r8, 0.3054F, 0.0F, 0.0F);
//        this.setRotateAngle(cube_r7, -0.1309F, 0.0F, 0.0F);
//        this.setRotateAngle(cube_r6, -0.2182F, 0.0F, 0.0F);
//        this.setRotateAngle(cube_r5, -0.3491F, 0.0F, 0.0F);
//        this.setRotateAngle(cube_r4, -0.2618F, 0.0F, 0.0F);
//        this.setRotateAngle(cube_r3, -0.3491F, 0.0F, 0.0F);
//        this.setRotateAngle(cube_r28, 0.0F, 0.5498F, 0.0F);
//        this.setRotateAngle(cube_r27, 0.0F, -0.5498F, 0.0F);
//        this.setRotateAngle(cube_r26, -0.1484F, 0.0F, 0.0F);
//        this.setRotateAngle(cube_r25, -0.2618F, 0.0F, 0.0F);
//        this.setRotateAngle(cube_r24, 0.1841F, 0.4349F, 0.0564F);
//        this.setRotateAngle(cube_r23, 0.174F, 0.2607F, 0.0529F);
//        this.setRotateAngle(cube_r22, 0.174F, -0.2607F, -0.0529F);
//        this.setRotateAngle(cube_r21, 0.1745F, 0.0F, 0.0F);
//        this.setRotateAngle(cube_r20, 0.1841F, -0.4349F, -0.0564F);
//        this.setRotateAngle(cube_r2, -0.2182F, 0.0F, 0.0F);
//        this.setRotateAngle(cube_r19, 0.0F, -0.5672F, 0.0F);
//        this.setRotateAngle(cube_r18, 0.0F, 0.0F, 0.1745F);
//        this.setRotateAngle(cube_r17, 0.0F, 0.5672F, 0.0F);
//        this.setRotateAngle(cube_r16, 0.0F, 0.0F, -0.1745F);
//        this.setRotateAngle(cube_r15, 0.2618F, 0.0F, 0.0F);
//        this.setRotateAngle(cube_r14, -0.0873F, 0.0F, 0.0F);
//        this.setRotateAngle(cube_r13, 0.7854F, 0.0F, 0.0F);
//        this.setRotateAngle(cube_r12, 0.2009F, 0.5148F, 0.0999F);
//        this.setRotateAngle(cube_r11, 0.2009F, -0.5148F, -0.0999F);
//        this.setRotateAngle(cube_r10, 0.1745F, 0.0F, 0.0F);
//        this.setRotateAngle(cube_r1, -0.3927F, 0.0F, 0.0F);
        this.body.offsetY = 0.083F;
        this.body.render(0.01F);
        resetToDefaultPose();
    }

    public void renderStaticWall(float f) {

        this.upperbody.offsetY = -0.054F;
        this.upperbody.render(0.01F);
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
        //this.resetToDefaultPose();

        EntityPrehistoricFloraPsittacosaurus_sinensis EntityPsittacosaurus_sinensis = (EntityPrehistoricFloraPsittacosaurus_sinensis) e;

        this.faceTarget(f3, f4, 8, neck);
        this.faceTarget(f3, f4, 8, head);

        AdvancedModelRenderer[] Tail = {this.tail2, this.tail3, this.tail4};
        AdvancedModelRenderer[] Neck = {this.neck, this.head};
        AdvancedModelRenderer[] ArmL = {this.leftarm, this.leftarm2, this.leftarm3};
        AdvancedModelRenderer[] ArmR = {this.rightarm, this.rightarm2, this.rightarm3};

        EntityPsittacosaurus_sinensis.tailBuffer.applyChainSwingBuffer(Tail);

        if (EntityPsittacosaurus_sinensis.getAnimation() == EntityPsittacosaurus_sinensis.LAY_ANIMATION) {
            //this.chainSwing(Neck, 0.5F, 0.10F, 0.5, f2, 0.8F);
            //this.chainWave(Neck, 0.5F * 2, -0.02F, 0.5F, f2, 0.8F);
        }
        else {
            if (!EntityPsittacosaurus_sinensis.isReallyInWater()) {

                if (f3 == 0.0F || !EntityPsittacosaurus_sinensis.getIsMoving()) {
                    if (EntityPsittacosaurus_sinensis.getAnimation() != EntityPsittacosaurus_sinensis.EAT_ANIMATION
                        && EntityPsittacosaurus_sinensis.getAnimation() != EntityPsittacosaurus_sinensis.DRINK_ANIMATION) {
                        this.chainSwing(Neck, 0.05F, 0.10F, 0.5, f2, 0.8F);
                        this.chainWave(Neck, 0.05F * 2, -0.02F, 0.5F, f2, 0.8F);
                    }

                    this.chainWave(Tail, (0.15F * 0.35F), 0.125F * 0.15F, 0.2F, f2, 1F);
                    this.chainSwing(Tail, (0.15F * 0.35F) * 4F, 0.05F * 0.35F, 0.12F, f2, 1F);

                    this.chainWaveExtended(ArmL, 0.175F, 0.03F, 0.1F, 3F, f2, 1F);
                    this.chainWaveExtended(ArmR, 0.175F, -0.03F, -0.1F, 0f, f2, 1F);
                    this.chainFlapExtended(ArmL, 0.175F, -0.03F, 0.1F, 3F, f2, 1F);
                    this.chainFlapExtended(ArmR, 0.175F, -0.03F, -0.1F, 0f, f2, 1F);
                    this.walk(this.leftarm, 0.175F, 0.10F, true, 3F, 0.05F, f2, 1F);
                    this.walk(this.rightarm, 0.175F, -0.10F, true, 0F, 0.05F, f2, 1F);
                    this.flap(this.leftarm2, 0.175F, -0.10F, true, 3F, 0.05F, f2, 1F);
                    this.flap(this.rightarm3, 0.175F, -0.10F, true, 0F, 0.05F, f2, 1F);

                    return;
                }

                if (EntityPsittacosaurus_sinensis.getIsFast()) { //Running


                } else { //Walking

                }
            } else {
                //Swimming pose:
                if (f3 == 0.0F) { //static in water
                    return;
                }
                //moving in water
                return;
            }
        }
    }


    @Override
    public void setLivingAnimations(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime) {
        super.setLivingAnimations(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime);
        this.resetToDefaultPose();
        this.eye.setScale(1,1,1);
        EntityPrehistoricFloraPsittacosaurus_sinensis ee = (EntityPrehistoricFloraPsittacosaurus_sinensis) entitylivingbaseIn;

        if (!ee.isReallyInWater()) {
            if (ee.getIsMoving()) {
                if (ee.getIsFast()) { //Running
                    animRunning(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime);
                } else { //Walking
                    animWalking(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime);
                }
            }
        }
        else {
            //Swimming pose:
            if (!ee.getIsMoving()) { //static in water
                //
            }
            else {
                //moving in water
                //
            }
        }
        if (ee.getAnimation() == ee.EAT_ANIMATION) {
            animEat(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime, ee.getAnimationTick());
        }
        else if (ee.getAnimation() == ee.SCRATCH_ANIMATION) {
            animScratch(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime, ee.getAnimationTick());
        }
        else if (ee.getAnimation() == ee.MAKE_NEST_ANIMATION) {
            animNest(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime, ee.getAnimationTick());
        }
        else if (ee.getAnimation() == ee.LAY_ANIMATION) {
            animLay(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime, ee.getAnimationTick());
        }
        else if (ee.getAnimation() == ee.ROAR_ANIMATION) { //The noise anim
            animNoise(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime, ee.getAnimationTick());
        }
        else if (ee.getAnimation() == ee.STAND_ANIMATION) { //The noise anim
            animIdle(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime, ee.getAnimationTick());
        }

    }

    public void animNoise(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime, double animTick) {
        EntityPrehistoricFloraPsittacosaurus_sinensis entity = (EntityPrehistoricFloraPsittacosaurus_sinensis) entitylivingbaseIn;
        int animCycle = 20;
        double tickAnim = animTick + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;
         if (tickAnim >= 0 && tickAnim < 3) {
            xx = 0 + (((tickAnim - 0) / 3) * (1.5-(0)));
            yy = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 3) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 8) {
            xx = 1.5 + (((tickAnim - 3) / 5) * (-3-(1.5)));
            yy = 0 + (((tickAnim - 3) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 3) / 5) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 12) {
            xx = -3 + (((tickAnim - 8) / 4) * (0-(-3)));
            yy = 0 + (((tickAnim - 8) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 4) * (0-(0)));
        }
        else if (tickAnim >= 12 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 12) / 3) * (2.25-(0)));
            yy = 0 + (((tickAnim - 12) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 12) / 3) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 20) {
            xx = 2.25 + (((tickAnim - 15) / 5) * (0-(2.25)));
            yy = 0 + (((tickAnim - 15) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 5) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(upperbody2, upperbody2.rotateAngleX + (float) Math.toRadians(xx), upperbody2.rotateAngleY + (float) Math.toRadians(yy), upperbody2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 0 + (((tickAnim - 0) / 3) * (1.5-(0)));
            yy = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 3) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 8) {
            xx = 1.5 + (((tickAnim - 3) / 5) * (10-(1.5)));
            yy = 0 + (((tickAnim - 3) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 3) / 5) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 12) {
            xx = 10 + (((tickAnim - 8) / 4) * (0-(10)));
            yy = 0 + (((tickAnim - 8) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 4) * (0-(0)));
        }
        else if (tickAnim >= 12 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 12) / 3) * (6.25-(0)));
            yy = 0 + (((tickAnim - 12) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 12) / 3) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 20) {
            xx = 6.25 + (((tickAnim - 15) / 5) * (0-(6.25)));
            yy = 0 + (((tickAnim - 15) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 5) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(upperbody, upperbody.rotateAngleX + (float) Math.toRadians(xx), upperbody.rotateAngleY + (float) Math.toRadians(yy), upperbody.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 0 + (((tickAnim - 0) / 3) * (-2.75-(0)));
            yy = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 3) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 8) {
            xx = -2.75 + (((tickAnim - 3) / 5) * (-8.25-(-2.75)));
            yy = 0 + (((tickAnim - 3) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 3) / 5) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 12) {
            xx = -8.25 + (((tickAnim - 8) / 4) * (0-(-8.25)));
            yy = 0 + (((tickAnim - 8) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 4) * (0-(0)));
        }
        else if (tickAnim >= 12 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 12) / 3) * (-1.75-(0)));
            yy = 0 + (((tickAnim - 12) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 12) / 3) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 20) {
            xx = -1.75 + (((tickAnim - 15) / 5) * (0-(-1.75)));
            yy = 0 + (((tickAnim - 15) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 5) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck, neck.rotateAngleX + (float) Math.toRadians(xx), neck.rotateAngleY + (float) Math.toRadians(yy), neck.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 0) / 8) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 8) * (0.3-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 8) / 12) * (0-(0)));
            yy = 0 + (((tickAnim - 8) / 12) * (0-(0)));
            zz = 0.3 + (((tickAnim - 8) / 12) * (0-(0.3)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.neck.rotationPointX = this.neck.rotationPointX + (float)(xx);
        this.neck.rotationPointY = this.neck.rotationPointY - (float)(yy);
        this.neck.rotationPointZ = this.neck.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 0 + (((tickAnim - 0) / 3) * (8.25-(0)));
            yy = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 3) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 8) {
            xx = 8.25 + (((tickAnim - 3) / 5) * (-1.75-(8.25)));
            yy = 0 + (((tickAnim - 3) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 3) / 5) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 12) {
            xx = -1.75 + (((tickAnim - 8) / 4) * (0-(-1.75)));
            yy = 0 + (((tickAnim - 8) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 4) * (0-(0)));
        }
        else if (tickAnim >= 12 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 12) / 3) * (-18.25-(0)));
            yy = 0 + (((tickAnim - 12) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 12) / 3) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 20) {
            xx = -18.25 + (((tickAnim - 15) / 5) * (0-(-18.25)));
            yy = 0 + (((tickAnim - 15) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 5) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(head, head.rotateAngleX + (float) Math.toRadians(xx), head.rotateAngleY + (float) Math.toRadians(yy), head.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 0 + (((tickAnim - 0) / 3) * (5-(0)));
            yy = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 3) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 8) {
            xx = 5 + (((tickAnim - 3) / 5) * (29.5-(5)));
            yy = 0 + (((tickAnim - 3) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 3) / 5) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 12) {
            xx = 29.5 + (((tickAnim - 8) / 4) * (0-(29.5)));
            yy = 0 + (((tickAnim - 8) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 4) * (0-(0)));
        }
        else if (tickAnim >= 12 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 12) / 3) * (22.5-(0)));
            yy = 0 + (((tickAnim - 12) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 12) / 3) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 20) {
            xx = 22.5 + (((tickAnim - 15) / 5) * (0-(22.5)));
            yy = 0 + (((tickAnim - 15) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 5) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(jaw, jaw.rotateAngleX + (float) Math.toRadians(xx), jaw.rotateAngleY + (float) Math.toRadians(yy), jaw.rotateAngleZ + (float) Math.toRadians(zz));



        this.setRotateAngle(leftarm, leftarm.rotateAngleX + (float) Math.toRadians(0), leftarm.rotateAngleY + (float) Math.toRadians(0), leftarm.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(leftarm2, leftarm2.rotateAngleX + (float) Math.toRadians(0), leftarm2.rotateAngleY + (float) Math.toRadians(0), leftarm2.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(rightarm, rightarm.rotateAngleX + (float) Math.toRadians(0), rightarm.rotateAngleY + (float) Math.toRadians(0), rightarm.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(rightarm2, rightarm2.rotateAngleX + (float) Math.toRadians(0), rightarm2.rotateAngleY + (float) Math.toRadians(0), rightarm2.rotateAngleZ + (float) Math.toRadians(0));
       
    }
    public void animScratch(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime, double animTick) {
        EntityPrehistoricFloraPsittacosaurus_sinensis entity = (EntityPrehistoricFloraPsittacosaurus_sinensis) entitylivingbaseIn;
        int animCycle = 55;
        double tickAnim = animTick + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;
         if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 0) / 10) * (-2-(0)));
            yy = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 13) {
            xx = -2 + (((tickAnim - 10) / 3) * (2.25-(-2)));
            yy = 0 + (((tickAnim - 10) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 3) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 15) {
            xx = 2.25 + (((tickAnim - 13) / 2) * (-2-(2.25)));
            yy = 0 + (((tickAnim - 13) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 13) / 2) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 18) {
            xx = -2 + (((tickAnim - 15) / 3) * (2.25-(-2)));
            yy = 0 + (((tickAnim - 15) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 3) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 20) {
            xx = 2.25 + (((tickAnim - 18) / 2) * (-2-(2.25)));
            yy = 0 + (((tickAnim - 18) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 18) / 2) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 23) {
            xx = -2 + (((tickAnim - 20) / 3) * (2.25-(-2)));
            yy = 0 + (((tickAnim - 20) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 3) * (0-(0)));
        }
        else if (tickAnim >= 23 && tickAnim < 25) {
            xx = 2.25 + (((tickAnim - 23) / 2) * (-2-(2.25)));
            yy = 0 + (((tickAnim - 23) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 23) / 2) * (0-(0)));
        }
        else if (tickAnim >= 25 && tickAnim < 28) {
            xx = -2 + (((tickAnim - 25) / 3) * (2.25-(-2)));
            yy = 0 + (((tickAnim - 25) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 25) / 3) * (0-(0)));
        }
        else if (tickAnim >= 28 && tickAnim < 30) {
            xx = 2.25 + (((tickAnim - 28) / 2) * (-2-(2.25)));
            yy = 0 + (((tickAnim - 28) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 28) / 2) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 33) {
            xx = -2 + (((tickAnim - 30) / 3) * (2.25-(-2)));
            yy = 0 + (((tickAnim - 30) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 30) / 3) * (0-(0)));
        }
        else if (tickAnim >= 33 && tickAnim < 35) {
            xx = 2.25 + (((tickAnim - 33) / 2) * (-2-(2.25)));
            yy = 0 + (((tickAnim - 33) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 33) / 2) * (0-(0)));
        }
        else if (tickAnim >= 35 && tickAnim < 38) {
            xx = -2 + (((tickAnim - 35) / 3) * (2.25-(-2)));
            yy = 0 + (((tickAnim - 35) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 35) / 3) * (0-(0)));
        }
        else if (tickAnim >= 38 && tickAnim < 40) {
            xx = 2.25 + (((tickAnim - 38) / 2) * (-2-(2.25)));
            yy = 0 + (((tickAnim - 38) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 38) / 2) * (0-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 43) {
            xx = -2 + (((tickAnim - 40) / 3) * (2.25-(-2)));
            yy = 0 + (((tickAnim - 40) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 40) / 3) * (0-(0)));
        }
        else if (tickAnim >= 43 && tickAnim < 45) {
            xx = 2.25 + (((tickAnim - 43) / 2) * (5.27-(2.25)));
            yy = 0 + (((tickAnim - 43) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 43) / 2) * (0-(0)));
        }
        else if (tickAnim >= 45 && tickAnim < 55) {
            xx = 5.27 + (((tickAnim - 45) / 10) * (0-(5.27)));
            yy = 0 + (((tickAnim - 45) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 45) / 10) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tail2, tail2.rotateAngleX + (float) Math.toRadians(xx), tail2.rotateAngleY + (float) Math.toRadians(yy), tail2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 0) / 10) * (-3.25-(0)));
            yy = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 13) {
            xx = -3.25 + (((tickAnim - 10) / 3) * (6.25-(-3.25)));
            yy = 0 + (((tickAnim - 10) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 3) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 15) {
            xx = 6.25 + (((tickAnim - 13) / 2) * (-3.25-(6.25)));
            yy = 0 + (((tickAnim - 13) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 13) / 2) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 18) {
            xx = -3.25 + (((tickAnim - 15) / 3) * (6.25-(-3.25)));
            yy = 0 + (((tickAnim - 15) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 3) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 20) {
            xx = 6.25 + (((tickAnim - 18) / 2) * (-3.25-(6.25)));
            yy = 0 + (((tickAnim - 18) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 18) / 2) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 23) {
            xx = -3.25 + (((tickAnim - 20) / 3) * (6.25-(-3.25)));
            yy = 0 + (((tickAnim - 20) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 3) * (0-(0)));
        }
        else if (tickAnim >= 23 && tickAnim < 25) {
            xx = 6.25 + (((tickAnim - 23) / 2) * (-3.25-(6.25)));
            yy = 0 + (((tickAnim - 23) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 23) / 2) * (0-(0)));
        }
        else if (tickAnim >= 25 && tickAnim < 28) {
            xx = -3.25 + (((tickAnim - 25) / 3) * (6.25-(-3.25)));
            yy = 0 + (((tickAnim - 25) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 25) / 3) * (0-(0)));
        }
        else if (tickAnim >= 28 && tickAnim < 30) {
            xx = 6.25 + (((tickAnim - 28) / 2) * (-3.25-(6.25)));
            yy = 0 + (((tickAnim - 28) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 28) / 2) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 33) {
            xx = -3.25 + (((tickAnim - 30) / 3) * (6.25-(-3.25)));
            yy = 0 + (((tickAnim - 30) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 30) / 3) * (0-(0)));
        }
        else if (tickAnim >= 33 && tickAnim < 35) {
            xx = 6.25 + (((tickAnim - 33) / 2) * (-3.25-(6.25)));
            yy = 0 + (((tickAnim - 33) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 33) / 2) * (0-(0)));
        }
        else if (tickAnim >= 35 && tickAnim < 38) {
            xx = -3.25 + (((tickAnim - 35) / 3) * (6.25-(-3.25)));
            yy = 0 + (((tickAnim - 35) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 35) / 3) * (0-(0)));
        }
        else if (tickAnim >= 38 && tickAnim < 40) {
            xx = 6.25 + (((tickAnim - 38) / 2) * (-3.25-(6.25)));
            yy = 0 + (((tickAnim - 38) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 38) / 2) * (0-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 43) {
            xx = -3.25 + (((tickAnim - 40) / 3) * (6.25-(-3.25)));
            yy = 0 + (((tickAnim - 40) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 40) / 3) * (0-(0)));
        }
        else if (tickAnim >= 43 && tickAnim < 45) {
            xx = 6.25 + (((tickAnim - 43) / 2) * (3.34-(6.25)));
            yy = 0 + (((tickAnim - 43) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 43) / 2) * (0-(0)));
        }
        else if (tickAnim >= 45 && tickAnim < 55) {
            xx = 3.34 + (((tickAnim - 45) / 10) * (0-(3.34)));
            yy = 0 + (((tickAnim - 45) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 45) / 10) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tail3, tail3.rotateAngleX + (float) Math.toRadians(xx), tail3.rotateAngleY + (float) Math.toRadians(yy), tail3.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 0) / 10) * (-8.25-(0)));
            yy = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 11) {
            xx = -8.25 + (((tickAnim - 10) / 1) * (-11.19-(-8.25)));
            yy = 0 + (((tickAnim - 10) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 1) * (0-(0)));
        }
        else if (tickAnim >= 11 && tickAnim < 13) {
            xx = -11.19 + (((tickAnim - 11) / 2) * (-1-(-11.19)));
            yy = 0 + (((tickAnim - 11) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 11) / 2) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 15) {
            xx = -1 + (((tickAnim - 13) / 2) * (-8.25-(-1)));
            yy = 0 + (((tickAnim - 13) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 13) / 2) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 16) {
            xx = -8.25 + (((tickAnim - 15) / 1) * (-11.19-(-8.25)));
            yy = 0 + (((tickAnim - 15) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 1) * (0-(0)));
        }
        else if (tickAnim >= 16 && tickAnim < 18) {
            xx = -11.19 + (((tickAnim - 16) / 2) * (-1-(-11.19)));
            yy = 0 + (((tickAnim - 16) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 16) / 2) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 20) {
            xx = -1 + (((tickAnim - 18) / 2) * (-8.25-(-1)));
            yy = 0 + (((tickAnim - 18) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 18) / 2) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 21) {
            xx = -8.25 + (((tickAnim - 20) / 1) * (-11.19-(-8.25)));
            yy = 0 + (((tickAnim - 20) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 1) * (0-(0)));
        }
        else if (tickAnim >= 21 && tickAnim < 23) {
            xx = -11.19 + (((tickAnim - 21) / 2) * (-1-(-11.19)));
            yy = 0 + (((tickAnim - 21) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 21) / 2) * (0-(0)));
        }
        else if (tickAnim >= 23 && tickAnim < 25) {
            xx = -1 + (((tickAnim - 23) / 2) * (-8.25-(-1)));
            yy = 0 + (((tickAnim - 23) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 23) / 2) * (0-(0)));
        }
        else if (tickAnim >= 25 && tickAnim < 26) {
            xx = -8.25 + (((tickAnim - 25) / 1) * (-11.19-(-8.25)));
            yy = 0 + (((tickAnim - 25) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 25) / 1) * (0-(0)));
        }
        else if (tickAnim >= 26 && tickAnim < 28) {
            xx = -11.19 + (((tickAnim - 26) / 2) * (-1-(-11.19)));
            yy = 0 + (((tickAnim - 26) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 26) / 2) * (0-(0)));
        }
        else if (tickAnim >= 28 && tickAnim < 30) {
            xx = -1 + (((tickAnim - 28) / 2) * (-8.25-(-1)));
            yy = 0 + (((tickAnim - 28) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 28) / 2) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 31) {
            xx = -8.25 + (((tickAnim - 30) / 1) * (-11.19-(-8.25)));
            yy = 0 + (((tickAnim - 30) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 30) / 1) * (0-(0)));
        }
        else if (tickAnim >= 31 && tickAnim < 33) {
            xx = -11.19 + (((tickAnim - 31) / 2) * (-1-(-11.19)));
            yy = 0 + (((tickAnim - 31) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 31) / 2) * (0-(0)));
        }
        else if (tickAnim >= 33 && tickAnim < 35) {
            xx = -1 + (((tickAnim - 33) / 2) * (-8.25-(-1)));
            yy = 0 + (((tickAnim - 33) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 33) / 2) * (0-(0)));
        }
        else if (tickAnim >= 35 && tickAnim < 36) {
            xx = -8.25 + (((tickAnim - 35) / 1) * (-11.19-(-8.25)));
            yy = 0 + (((tickAnim - 35) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 35) / 1) * (0-(0)));
        }
        else if (tickAnim >= 36 && tickAnim < 38) {
            xx = -11.19 + (((tickAnim - 36) / 2) * (-1-(-11.19)));
            yy = 0 + (((tickAnim - 36) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 36) / 2) * (0-(0)));
        }
        else if (tickAnim >= 38 && tickAnim < 40) {
            xx = -1 + (((tickAnim - 38) / 2) * (-8.25-(-1)));
            yy = 0 + (((tickAnim - 38) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 38) / 2) * (0-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 41) {
            xx = -8.25 + (((tickAnim - 40) / 1) * (-11.19-(-8.25)));
            yy = 0 + (((tickAnim - 40) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 40) / 1) * (0-(0)));
        }
        else if (tickAnim >= 41 && tickAnim < 43) {
            xx = -11.19 + (((tickAnim - 41) / 2) * (-1-(-11.19)));
            yy = 0 + (((tickAnim - 41) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 41) / 2) * (0-(0)));
        }
        else if (tickAnim >= 43 && tickAnim < 45) {
            xx = -1 + (((tickAnim - 43) / 2) * (-0.63-(-1)));
            yy = 0 + (((tickAnim - 43) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 43) / 2) * (0-(0)));
        }
        else if (tickAnim >= 45 && tickAnim < 55) {
            xx = -0.63 + (((tickAnim - 45) / 10) * (0-(-0.63)));
            yy = 0 + (((tickAnim - 45) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 45) / 10) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tail4, tail4.rotateAngleX + (float) Math.toRadians(xx), tail4.rotateAngleY + (float) Math.toRadians(yy), tail4.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 0) / 10) * (-5.75-(0)));
            yy = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 11) {
            xx = -5.75 + (((tickAnim - 10) / 1) * (-11.09-(-5.75)));
            yy = 0 + (((tickAnim - 10) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 1) * (0-(0)));
        }
        else if (tickAnim >= 11 && tickAnim < 13) {
            xx = -11.09 + (((tickAnim - 11) / 2) * (2-(-11.09)));
            yy = 0 + (((tickAnim - 11) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 11) / 2) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 15) {
            xx = 2 + (((tickAnim - 13) / 2) * (-5.75-(2)));
            yy = 0 + (((tickAnim - 13) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 13) / 2) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 16) {
            xx = -5.75 + (((tickAnim - 15) / 1) * (-11.09-(-5.75)));
            yy = 0 + (((tickAnim - 15) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 1) * (0-(0)));
        }
        else if (tickAnim >= 16 && tickAnim < 18) {
            xx = -11.09 + (((tickAnim - 16) / 2) * (2-(-11.09)));
            yy = 0 + (((tickAnim - 16) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 16) / 2) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 20) {
            xx = 2 + (((tickAnim - 18) / 2) * (-5.75-(2)));
            yy = 0 + (((tickAnim - 18) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 18) / 2) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 21) {
            xx = -5.75 + (((tickAnim - 20) / 1) * (-11.09-(-5.75)));
            yy = 0 + (((tickAnim - 20) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 1) * (0-(0)));
        }
        else if (tickAnim >= 21 && tickAnim < 23) {
            xx = -11.09 + (((tickAnim - 21) / 2) * (2-(-11.09)));
            yy = 0 + (((tickAnim - 21) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 21) / 2) * (0-(0)));
        }
        else if (tickAnim >= 23 && tickAnim < 25) {
            xx = 2 + (((tickAnim - 23) / 2) * (-5.75-(2)));
            yy = 0 + (((tickAnim - 23) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 23) / 2) * (0-(0)));
        }
        else if (tickAnim >= 25 && tickAnim < 26) {
            xx = -5.75 + (((tickAnim - 25) / 1) * (-11.09-(-5.75)));
            yy = 0 + (((tickAnim - 25) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 25) / 1) * (0-(0)));
        }
        else if (tickAnim >= 26 && tickAnim < 28) {
            xx = -11.09 + (((tickAnim - 26) / 2) * (2-(-11.09)));
            yy = 0 + (((tickAnim - 26) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 26) / 2) * (0-(0)));
        }
        else if (tickAnim >= 28 && tickAnim < 30) {
            xx = 2 + (((tickAnim - 28) / 2) * (-5.75-(2)));
            yy = 0 + (((tickAnim - 28) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 28) / 2) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 31) {
            xx = -5.75 + (((tickAnim - 30) / 1) * (-11.09-(-5.75)));
            yy = 0 + (((tickAnim - 30) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 30) / 1) * (0-(0)));
        }
        else if (tickAnim >= 31 && tickAnim < 33) {
            xx = -11.09 + (((tickAnim - 31) / 2) * (2-(-11.09)));
            yy = 0 + (((tickAnim - 31) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 31) / 2) * (0-(0)));
        }
        else if (tickAnim >= 33 && tickAnim < 35) {
            xx = 2 + (((tickAnim - 33) / 2) * (-5.75-(2)));
            yy = 0 + (((tickAnim - 33) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 33) / 2) * (0-(0)));
        }
        else if (tickAnim >= 35 && tickAnim < 36) {
            xx = -5.75 + (((tickAnim - 35) / 1) * (-11.09-(-5.75)));
            yy = 0 + (((tickAnim - 35) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 35) / 1) * (0-(0)));
        }
        else if (tickAnim >= 36 && tickAnim < 38) {
            xx = -11.09 + (((tickAnim - 36) / 2) * (2-(-11.09)));
            yy = 0 + (((tickAnim - 36) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 36) / 2) * (0-(0)));
        }
        else if (tickAnim >= 38 && tickAnim < 40) {
            xx = 2 + (((tickAnim - 38) / 2) * (-5.75-(2)));
            yy = 0 + (((tickAnim - 38) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 38) / 2) * (0-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 41) {
            xx = -5.75 + (((tickAnim - 40) / 1) * (-11.09-(-5.75)));
            yy = 0 + (((tickAnim - 40) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 40) / 1) * (0-(0)));
        }
        else if (tickAnim >= 41 && tickAnim < 43) {
            xx = -11.09 + (((tickAnim - 41) / 2) * (2-(-11.09)));
            yy = 0 + (((tickAnim - 41) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 41) / 2) * (0-(0)));
        }
        else if (tickAnim >= 43 && tickAnim < 45) {
            xx = 2 + (((tickAnim - 43) / 2) * (3.24-(2)));
            yy = 0 + (((tickAnim - 43) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 43) / 2) * (0-(0)));
        }
        else if (tickAnim >= 45 && tickAnim < 55) {
            xx = 3.24 + (((tickAnim - 45) / 10) * (0-(3.24)));
            yy = 0 + (((tickAnim - 45) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 45) / 10) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tail5, tail5.rotateAngleX + (float) Math.toRadians(xx), tail5.rotateAngleY + (float) Math.toRadians(yy), tail5.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 0) / 10) * (-38.74553-(0)));
            yy = 0 + (((tickAnim - 0) / 10) * (-8.88216-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (-1.58045-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 13) {
            xx = -38.74553 + (((tickAnim - 10) / 3) * (-27.12183-(-38.74553)));
            yy = -8.88216 + (((tickAnim - 10) / 3) * (-0.09438-(-8.88216)));
            zz = -1.58045 + (((tickAnim - 10) / 3) * (3.21133-(-1.58045)));
        }
        else if (tickAnim >= 13 && tickAnim < 15) {
            xx = -27.12183 + (((tickAnim - 13) / 2) * (-38.74553-(-27.12183)));
            yy = -0.09438 + (((tickAnim - 13) / 2) * (-8.88216-(-0.09438)));
            zz = 3.21133 + (((tickAnim - 13) / 2) * (-1.58045-(3.21133)));
        }
        else if (tickAnim >= 15 && tickAnim < 18) {
            xx = -38.74553 + (((tickAnim - 15) / 3) * (-27.12183-(-38.74553)));
            yy = -8.88216 + (((tickAnim - 15) / 3) * (-0.09438-(-8.88216)));
            zz = -1.58045 + (((tickAnim - 15) / 3) * (3.21133-(-1.58045)));
        }
        else if (tickAnim >= 18 && tickAnim < 20) {
            xx = -27.12183 + (((tickAnim - 18) / 2) * (-38.74553-(-27.12183)));
            yy = -0.09438 + (((tickAnim - 18) / 2) * (-8.88216-(-0.09438)));
            zz = 3.21133 + (((tickAnim - 18) / 2) * (-1.58045-(3.21133)));
        }
        else if (tickAnim >= 20 && tickAnim < 23) {
            xx = -38.74553 + (((tickAnim - 20) / 3) * (-27.12183-(-38.74553)));
            yy = -8.88216 + (((tickAnim - 20) / 3) * (-0.09438-(-8.88216)));
            zz = -1.58045 + (((tickAnim - 20) / 3) * (3.21133-(-1.58045)));
        }
        else if (tickAnim >= 23 && tickAnim < 25) {
            xx = -27.12183 + (((tickAnim - 23) / 2) * (-38.74553-(-27.12183)));
            yy = -0.09438 + (((tickAnim - 23) / 2) * (-8.88216-(-0.09438)));
            zz = 3.21133 + (((tickAnim - 23) / 2) * (-1.58045-(3.21133)));
        }
        else if (tickAnim >= 25 && tickAnim < 28) {
            xx = -38.74553 + (((tickAnim - 25) / 3) * (-27.12183-(-38.74553)));
            yy = -8.88216 + (((tickAnim - 25) / 3) * (-0.09438-(-8.88216)));
            zz = -1.58045 + (((tickAnim - 25) / 3) * (3.21133-(-1.58045)));
        }
        else if (tickAnim >= 28 && tickAnim < 30) {
            xx = -27.12183 + (((tickAnim - 28) / 2) * (-38.74553-(-27.12183)));
            yy = -0.09438 + (((tickAnim - 28) / 2) * (-8.88216-(-0.09438)));
            zz = 3.21133 + (((tickAnim - 28) / 2) * (-1.58045-(3.21133)));
        }
        else if (tickAnim >= 30 && tickAnim < 33) {
            xx = -38.74553 + (((tickAnim - 30) / 3) * (-27.12183-(-38.74553)));
            yy = -8.88216 + (((tickAnim - 30) / 3) * (-0.09438-(-8.88216)));
            zz = -1.58045 + (((tickAnim - 30) / 3) * (3.21133-(-1.58045)));
        }
        else if (tickAnim >= 33 && tickAnim < 35) {
            xx = -27.12183 + (((tickAnim - 33) / 2) * (-38.74553-(-27.12183)));
            yy = -0.09438 + (((tickAnim - 33) / 2) * (-8.88216-(-0.09438)));
            zz = 3.21133 + (((tickAnim - 33) / 2) * (-1.58045-(3.21133)));
        }
        else if (tickAnim >= 35 && tickAnim < 38) {
            xx = -38.74553 + (((tickAnim - 35) / 3) * (-27.12183-(-38.74553)));
            yy = -8.88216 + (((tickAnim - 35) / 3) * (-0.09438-(-8.88216)));
            zz = -1.58045 + (((tickAnim - 35) / 3) * (3.21133-(-1.58045)));
        }
        else if (tickAnim >= 38 && tickAnim < 42) {
            xx = -27.12183 + (((tickAnim - 38) / 4) * (-38.74553-(-27.12183)));
            yy = -0.09438 + (((tickAnim - 38) / 4) * (-8.88216-(-0.09438)));
            zz = 3.21133 + (((tickAnim - 38) / 4) * (-1.58045-(3.21133)));
        }
        else if (tickAnim >= 42 && tickAnim < 55) {
            xx = -38.74553 + (((tickAnim - 42) / 13) * (0-(-38.74553)));
            yy = -8.88216 + (((tickAnim - 42) / 13) * (0-(-8.88216)));
            zz = -1.58045 + (((tickAnim - 42) / 13) * (0-(-1.58045)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftleg, leftleg.rotateAngleX + (float) Math.toRadians(xx), leftleg.rotateAngleY + (float) Math.toRadians(yy), leftleg.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 0) / 10) * (-15.77421-(0)));
            yy = 0 + (((tickAnim - 0) / 10) * (-3.0367-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (10.31702-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 13) {
            xx = -15.77421 + (((tickAnim - 10) / 3) * (-19.75-(-15.77421)));
            yy = -3.0367 + (((tickAnim - 10) / 3) * (0-(-3.0367)));
            zz = 10.31702 + (((tickAnim - 10) / 3) * (0-(10.31702)));
        }
        else if (tickAnim >= 13 && tickAnim < 15) {
            xx = -19.75 + (((tickAnim - 13) / 2) * (-15.77421-(-19.75)));
            yy = 0 + (((tickAnim - 13) / 2) * (-3.0367-(0)));
            zz = 0 + (((tickAnim - 13) / 2) * (10.31702-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 18) {
            xx = -15.77421 + (((tickAnim - 15) / 3) * (-15.77421-(-15.77421)));
            yy = -3.0367 + (((tickAnim - 15) / 3) * (-3.0367-(-3.0367)));
            zz = 10.31702 + (((tickAnim - 15) / 3) * (10.31702-(10.31702)));
        }
        else if (tickAnim >= 18 && tickAnim < 20) {
            xx = -15.77421 + (((tickAnim - 18) / 2) * (-19.75-(-15.77421)));
            yy = -3.0367 + (((tickAnim - 18) / 2) * (0-(-3.0367)));
            zz = 10.31702 + (((tickAnim - 18) / 2) * (0-(10.31702)));
        }
        else if (tickAnim >= 20 && tickAnim < 23) {
            xx = -19.75 + (((tickAnim - 20) / 3) * (-15.77421-(-19.75)));
            yy = 0 + (((tickAnim - 20) / 3) * (-3.0367-(0)));
            zz = 0 + (((tickAnim - 20) / 3) * (10.31702-(0)));
        }
        else if (tickAnim >= 23 && tickAnim < 25) {
            xx = -15.77421 + (((tickAnim - 23) / 2) * (-15.77421-(-15.77421)));
            yy = -3.0367 + (((tickAnim - 23) / 2) * (-3.0367-(-3.0367)));
            zz = 10.31702 + (((tickAnim - 23) / 2) * (10.31702-(10.31702)));
        }
        else if (tickAnim >= 25 && tickAnim < 28) {
            xx = -15.77421 + (((tickAnim - 25) / 3) * (-19.75-(-15.77421)));
            yy = -3.0367 + (((tickAnim - 25) / 3) * (0-(-3.0367)));
            zz = 10.31702 + (((tickAnim - 25) / 3) * (0-(10.31702)));
        }
        else if (tickAnim >= 28 && tickAnim < 30) {
            xx = -19.75 + (((tickAnim - 28) / 2) * (-15.77421-(-19.75)));
            yy = 0 + (((tickAnim - 28) / 2) * (-3.0367-(0)));
            zz = 0 + (((tickAnim - 28) / 2) * (10.31702-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 33) {
            xx = -15.77421 + (((tickAnim - 30) / 3) * (-15.77421-(-15.77421)));
            yy = -3.0367 + (((tickAnim - 30) / 3) * (-3.0367-(-3.0367)));
            zz = 10.31702 + (((tickAnim - 30) / 3) * (10.31702-(10.31702)));
        }
        else if (tickAnim >= 33 && tickAnim < 35) {
            xx = -15.77421 + (((tickAnim - 33) / 2) * (-19.75-(-15.77421)));
            yy = -3.0367 + (((tickAnim - 33) / 2) * (0-(-3.0367)));
            zz = 10.31702 + (((tickAnim - 33) / 2) * (0-(10.31702)));
        }
        else if (tickAnim >= 35 && tickAnim < 38) {
            xx = -19.75 + (((tickAnim - 35) / 3) * (-15.77421-(-19.75)));
            yy = 0 + (((tickAnim - 35) / 3) * (-3.0367-(0)));
            zz = 0 + (((tickAnim - 35) / 3) * (10.31702-(0)));
        }
        else if (tickAnim >= 38 && tickAnim < 42) {
            xx = -15.77421 + (((tickAnim - 38) / 4) * (-15.77421-(-15.77421)));
            yy = -3.0367 + (((tickAnim - 38) / 4) * (-3.0367-(-3.0367)));
            zz = 10.31702 + (((tickAnim - 38) / 4) * (10.31702-(10.31702)));
        }
        else if (tickAnim >= 42 && tickAnim < 55) {
            xx = -15.77421 + (((tickAnim - 42) / 13) * (0-(-15.77421)));
            yy = -3.0367 + (((tickAnim - 42) / 13) * (0-(-3.0367)));
            zz = 10.31702 + (((tickAnim - 42) / 13) * (0-(10.31702)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftleg2, leftleg2.rotateAngleX + (float) Math.toRadians(xx), leftleg2.rotateAngleY + (float) Math.toRadians(yy), leftleg2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 0) / 10) * (-13.5-(0)));
            yy = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 13) {
            xx = -13.5 + (((tickAnim - 10) / 3) * (-35.25-(-13.5)));
            yy = 0 + (((tickAnim - 10) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 3) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 15) {
            xx = -35.25 + (((tickAnim - 13) / 2) * (-13.5-(-35.25)));
            yy = 0 + (((tickAnim - 13) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 13) / 2) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 18) {
            xx = -13.5 + (((tickAnim - 15) / 3) * (-35.25-(-13.5)));
            yy = 0 + (((tickAnim - 15) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 3) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 20) {
            xx = -35.25 + (((tickAnim - 18) / 2) * (-13.5-(-35.25)));
            yy = 0 + (((tickAnim - 18) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 18) / 2) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 23) {
            xx = -13.5 + (((tickAnim - 20) / 3) * (-35.25-(-13.5)));
            yy = 0 + (((tickAnim - 20) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 3) * (0-(0)));
        }
        else if (tickAnim >= 23 && tickAnim < 25) {
            xx = -35.25 + (((tickAnim - 23) / 2) * (-13.5-(-35.25)));
            yy = 0 + (((tickAnim - 23) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 23) / 2) * (0-(0)));
        }
        else if (tickAnim >= 25 && tickAnim < 28) {
            xx = -13.5 + (((tickAnim - 25) / 3) * (-35.25-(-13.5)));
            yy = 0 + (((tickAnim - 25) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 25) / 3) * (0-(0)));
        }
        else if (tickAnim >= 28 && tickAnim < 30) {
            xx = -35.25 + (((tickAnim - 28) / 2) * (-13.5-(-35.25)));
            yy = 0 + (((tickAnim - 28) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 28) / 2) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 33) {
            xx = -13.5 + (((tickAnim - 30) / 3) * (-35.25-(-13.5)));
            yy = 0 + (((tickAnim - 30) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 30) / 3) * (0-(0)));
        }
        else if (tickAnim >= 33 && tickAnim < 35) {
            xx = -35.25 + (((tickAnim - 33) / 2) * (-13.5-(-35.25)));
            yy = 0 + (((tickAnim - 33) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 33) / 2) * (0-(0)));
        }
        else if (tickAnim >= 35 && tickAnim < 38) {
            xx = -13.5 + (((tickAnim - 35) / 3) * (-35.25-(-13.5)));
            yy = 0 + (((tickAnim - 35) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 35) / 3) * (0-(0)));
        }
        else if (tickAnim >= 38 && tickAnim < 42) {
            xx = -35.25 + (((tickAnim - 38) / 4) * (-13.5-(-35.25)));
            yy = 0 + (((tickAnim - 38) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 38) / 4) * (0-(0)));
        }
        else if (tickAnim >= 42 && tickAnim < 55) {
            xx = -13.5 + (((tickAnim - 42) / 13) * (0-(-13.5)));
            yy = 0 + (((tickAnim - 42) / 13) * (0-(0)));
            zz = 0 + (((tickAnim - 42) / 13) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftleg3, leftleg3.rotateAngleX + (float) Math.toRadians(xx), leftleg3.rotateAngleY + (float) Math.toRadians(yy), leftleg3.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 0) / 10) * (6-(0)));
            yy = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 13) {
            xx = 6 + (((tickAnim - 10) / 3) * (107.25-(6)));
            yy = 0 + (((tickAnim - 10) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 3) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 15) {
            xx = 107.25 + (((tickAnim - 13) / 2) * (6-(107.25)));
            yy = 0 + (((tickAnim - 13) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 13) / 2) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 18) {
            xx = 6 + (((tickAnim - 15) / 3) * (107.25-(6)));
            yy = 0 + (((tickAnim - 15) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 3) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 20) {
            xx = 107.25 + (((tickAnim - 18) / 2) * (6-(107.25)));
            yy = 0 + (((tickAnim - 18) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 18) / 2) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 23) {
            xx = 6 + (((tickAnim - 20) / 3) * (107.25-(6)));
            yy = 0 + (((tickAnim - 20) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 3) * (0-(0)));
        }
        else if (tickAnim >= 23 && tickAnim < 25) {
            xx = 107.25 + (((tickAnim - 23) / 2) * (6-(107.25)));
            yy = 0 + (((tickAnim - 23) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 23) / 2) * (0-(0)));
        }
        else if (tickAnim >= 25 && tickAnim < 28) {
            xx = 6 + (((tickAnim - 25) / 3) * (107.25-(6)));
            yy = 0 + (((tickAnim - 25) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 25) / 3) * (0-(0)));
        }
        else if (tickAnim >= 28 && tickAnim < 30) {
            xx = 107.25 + (((tickAnim - 28) / 2) * (6-(107.25)));
            yy = 0 + (((tickAnim - 28) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 28) / 2) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 33) {
            xx = 6 + (((tickAnim - 30) / 3) * (107.25-(6)));
            yy = 0 + (((tickAnim - 30) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 30) / 3) * (0-(0)));
        }
        else if (tickAnim >= 33 && tickAnim < 35) {
            xx = 107.25 + (((tickAnim - 33) / 2) * (6-(107.25)));
            yy = 0 + (((tickAnim - 33) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 33) / 2) * (0-(0)));
        }
        else if (tickAnim >= 35 && tickAnim < 38) {
            xx = 6 + (((tickAnim - 35) / 3) * (107.25-(6)));
            yy = 0 + (((tickAnim - 35) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 35) / 3) * (0-(0)));
        }
        else if (tickAnim >= 38 && tickAnim < 42) {
            xx = 107.25 + (((tickAnim - 38) / 4) * (6-(107.25)));
            yy = 0 + (((tickAnim - 38) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 38) / 4) * (0-(0)));
        }
        else if (tickAnim >= 42 && tickAnim < 55) {
            xx = 6 + (((tickAnim - 42) / 13) * (0-(6)));
            yy = 0 + (((tickAnim - 42) / 13) * (0-(0)));
            zz = 0 + (((tickAnim - 42) / 13) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftleg4, leftleg4.rotateAngleX + (float) Math.toRadians(xx), leftleg4.rotateAngleY + (float) Math.toRadians(yy), leftleg4.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 0) / 10) * (11.62773-(0)));
            yy = 0 + (((tickAnim - 0) / 10) * (3.24749-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (2.25362-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 13) {
            xx = 11.62773 + (((tickAnim - 10) / 3) * (12.87773-(11.62773)));
            yy = 3.24749 + (((tickAnim - 10) / 3) * (3.24749-(3.24749)));
            zz = 2.25362 + (((tickAnim - 10) / 3) * (2.25362-(2.25362)));
        }
        else if (tickAnim >= 13 && tickAnim < 15) {
            xx = 12.87773 + (((tickAnim - 13) / 2) * (11.62773-(12.87773)));
            yy = 3.24749 + (((tickAnim - 13) / 2) * (3.24749-(3.24749)));
            zz = 2.25362 + (((tickAnim - 13) / 2) * (2.25362-(2.25362)));
        }
        else if (tickAnim >= 15 && tickAnim < 18) {
            xx = 11.62773 + (((tickAnim - 15) / 3) * (12.87773-(11.62773)));
            yy = 3.24749 + (((tickAnim - 15) / 3) * (3.24749-(3.24749)));
            zz = 2.25362 + (((tickAnim - 15) / 3) * (2.25362-(2.25362)));
        }
        else if (tickAnim >= 18 && tickAnim < 20) {
            xx = 12.87773 + (((tickAnim - 18) / 2) * (11.62773-(12.87773)));
            yy = 3.24749 + (((tickAnim - 18) / 2) * (3.24749-(3.24749)));
            zz = 2.25362 + (((tickAnim - 18) / 2) * (2.25362-(2.25362)));
        }
        else if (tickAnim >= 20 && tickAnim < 23) {
            xx = 11.62773 + (((tickAnim - 20) / 3) * (12.87773-(11.62773)));
            yy = 3.24749 + (((tickAnim - 20) / 3) * (3.24749-(3.24749)));
            zz = 2.25362 + (((tickAnim - 20) / 3) * (2.25362-(2.25362)));
        }
        else if (tickAnim >= 23 && tickAnim < 25) {
            xx = 12.87773 + (((tickAnim - 23) / 2) * (11.62773-(12.87773)));
            yy = 3.24749 + (((tickAnim - 23) / 2) * (3.24749-(3.24749)));
            zz = 2.25362 + (((tickAnim - 23) / 2) * (2.25362-(2.25362)));
        }
        else if (tickAnim >= 25 && tickAnim < 28) {
            xx = 11.62773 + (((tickAnim - 25) / 3) * (12.87773-(11.62773)));
            yy = 3.24749 + (((tickAnim - 25) / 3) * (3.24749-(3.24749)));
            zz = 2.25362 + (((tickAnim - 25) / 3) * (2.25362-(2.25362)));
        }
        else if (tickAnim >= 28 && tickAnim < 30) {
            xx = 12.87773 + (((tickAnim - 28) / 2) * (11.62773-(12.87773)));
            yy = 3.24749 + (((tickAnim - 28) / 2) * (3.24749-(3.24749)));
            zz = 2.25362 + (((tickAnim - 28) / 2) * (2.25362-(2.25362)));
        }
        else if (tickAnim >= 30 && tickAnim < 33) {
            xx = 11.62773 + (((tickAnim - 30) / 3) * (12.87773-(11.62773)));
            yy = 3.24749 + (((tickAnim - 30) / 3) * (3.24749-(3.24749)));
            zz = 2.25362 + (((tickAnim - 30) / 3) * (2.25362-(2.25362)));
        }
        else if (tickAnim >= 33 && tickAnim < 35) {
            xx = 12.87773 + (((tickAnim - 33) / 2) * (11.62773-(12.87773)));
            yy = 3.24749 + (((tickAnim - 33) / 2) * (3.24749-(3.24749)));
            zz = 2.25362 + (((tickAnim - 33) / 2) * (2.25362-(2.25362)));
        }
        else if (tickAnim >= 35 && tickAnim < 38) {
            xx = 11.62773 + (((tickAnim - 35) / 3) * (12.87773-(11.62773)));
            yy = 3.24749 + (((tickAnim - 35) / 3) * (3.24749-(3.24749)));
            zz = 2.25362 + (((tickAnim - 35) / 3) * (2.25362-(2.25362)));
        }
        else if (tickAnim >= 38 && tickAnim < 42) {
            xx = 12.87773 + (((tickAnim - 38) / 4) * (11.62773-(12.87773)));
            yy = 3.24749 + (((tickAnim - 38) / 4) * (3.24749-(3.24749)));
            zz = 2.25362 + (((tickAnim - 38) / 4) * (2.25362-(2.25362)));
        }
        else if (tickAnim >= 42 && tickAnim < 55) {
            xx = 11.62773 + (((tickAnim - 42) / 13) * (0-(11.62773)));
            yy = 3.24749 + (((tickAnim - 42) / 13) * (0-(3.24749)));
            zz = 2.25362 + (((tickAnim - 42) / 13) * (0-(2.25362)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(upperbody2, upperbody2.rotateAngleX + (float) Math.toRadians(xx), upperbody2.rotateAngleY + (float) Math.toRadians(yy), upperbody2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 0) / 10) * (6.39605-(0)));
            yy = 0 + (((tickAnim - 0) / 10) * (-10.06105-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (1.98308-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 13) {
            xx = 6.39605 + (((tickAnim - 10) / 3) * (2.96395-(6.39605)));
            yy = -10.06105 + (((tickAnim - 10) / 3) * (-10.83862-(-10.06105)));
            zz = 1.98308 + (((tickAnim - 10) / 3) * (-2.52406-(1.98308)));
        }
        else if (tickAnim >= 13 && tickAnim < 15) {
            xx = 2.96395 + (((tickAnim - 13) / 2) * (6.39605-(2.96395)));
            yy = -10.83862 + (((tickAnim - 13) / 2) * (-10.06105-(-10.83862)));
            zz = -2.52406 + (((tickAnim - 13) / 2) * (1.98308-(-2.52406)));
        }
        else if (tickAnim >= 15 && tickAnim < 18) {
            xx = 6.39605 + (((tickAnim - 15) / 3) * (2.96395-(6.39605)));
            yy = -10.06105 + (((tickAnim - 15) / 3) * (-10.83862-(-10.06105)));
            zz = 1.98308 + (((tickAnim - 15) / 3) * (-2.52406-(1.98308)));
        }
        else if (tickAnim >= 18 && tickAnim < 20) {
            xx = 2.96395 + (((tickAnim - 18) / 2) * (6.39605-(2.96395)));
            yy = -10.83862 + (((tickAnim - 18) / 2) * (-10.06105-(-10.83862)));
            zz = -2.52406 + (((tickAnim - 18) / 2) * (1.98308-(-2.52406)));
        }
        else if (tickAnim >= 20 && tickAnim < 23) {
            xx = 6.39605 + (((tickAnim - 20) / 3) * (2.96395-(6.39605)));
            yy = -10.06105 + (((tickAnim - 20) / 3) * (-10.83862-(-10.06105)));
            zz = 1.98308 + (((tickAnim - 20) / 3) * (-2.52406-(1.98308)));
        }
        else if (tickAnim >= 23 && tickAnim < 25) {
            xx = 2.96395 + (((tickAnim - 23) / 2) * (6.39605-(2.96395)));
            yy = -10.83862 + (((tickAnim - 23) / 2) * (-10.06105-(-10.83862)));
            zz = -2.52406 + (((tickAnim - 23) / 2) * (1.98308-(-2.52406)));
        }
        else if (tickAnim >= 25 && tickAnim < 28) {
            xx = 6.39605 + (((tickAnim - 25) / 3) * (2.96395-(6.39605)));
            yy = -10.06105 + (((tickAnim - 25) / 3) * (-10.83862-(-10.06105)));
            zz = 1.98308 + (((tickAnim - 25) / 3) * (-2.52406-(1.98308)));
        }
        else if (tickAnim >= 28 && tickAnim < 30) {
            xx = 2.96395 + (((tickAnim - 28) / 2) * (6.39605-(2.96395)));
            yy = -10.83862 + (((tickAnim - 28) / 2) * (-10.06105-(-10.83862)));
            zz = -2.52406 + (((tickAnim - 28) / 2) * (1.98308-(-2.52406)));
        }
        else if (tickAnim >= 30 && tickAnim < 33) {
            xx = 6.39605 + (((tickAnim - 30) / 3) * (2.96395-(6.39605)));
            yy = -10.06105 + (((tickAnim - 30) / 3) * (-10.83862-(-10.06105)));
            zz = 1.98308 + (((tickAnim - 30) / 3) * (-2.52406-(1.98308)));
        }
        else if (tickAnim >= 33 && tickAnim < 35) {
            xx = 2.96395 + (((tickAnim - 33) / 2) * (6.39605-(2.96395)));
            yy = -10.83862 + (((tickAnim - 33) / 2) * (-10.06105-(-10.83862)));
            zz = -2.52406 + (((tickAnim - 33) / 2) * (1.98308-(-2.52406)));
        }
        else if (tickAnim >= 35 && tickAnim < 38) {
            xx = 6.39605 + (((tickAnim - 35) / 3) * (2.96395-(6.39605)));
            yy = -10.06105 + (((tickAnim - 35) / 3) * (-10.83862-(-10.06105)));
            zz = 1.98308 + (((tickAnim - 35) / 3) * (-2.52406-(1.98308)));
        }
        else if (tickAnim >= 38 && tickAnim < 42) {
            xx = 2.96395 + (((tickAnim - 38) / 4) * (6.39605-(2.96395)));
            yy = -10.83862 + (((tickAnim - 38) / 4) * (-10.06105-(-10.83862)));
            zz = -2.52406 + (((tickAnim - 38) / 4) * (1.98308-(-2.52406)));
        }
        else if (tickAnim >= 42 && tickAnim < 55) {
            xx = 6.39605 + (((tickAnim - 42) / 13) * (0-(6.39605)));
            yy = -10.06105 + (((tickAnim - 42) / 13) * (0-(-10.06105)));
            zz = 1.98308 + (((tickAnim - 42) / 13) * (0-(1.98308)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(upperbody, upperbody.rotateAngleX + (float) Math.toRadians(xx), upperbody.rotateAngleY + (float) Math.toRadians(yy), upperbody.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 0) / 10) * (6-(0)));
            yy = 0 + (((tickAnim - 0) / 10) * (-22.25-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 13) {
            xx = 6 + (((tickAnim - 10) / 3) * (2.18391-(6)));
            yy = -22.25 + (((tickAnim - 10) / 3) * (-20.82017-(-22.25)));
            zz = 0 + (((tickAnim - 10) / 3) * (10.37068-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 15) {
            xx = 2.18391 + (((tickAnim - 13) / 2) * (6-(2.18391)));
            yy = -20.82017 + (((tickAnim - 13) / 2) * (-22.25-(-20.82017)));
            zz = 10.37068 + (((tickAnim - 13) / 2) * (0-(10.37068)));
        }
        else if (tickAnim >= 15 && tickAnim < 18) {
            xx = 6 + (((tickAnim - 15) / 3) * (2.18391-(6)));
            yy = -22.25 + (((tickAnim - 15) / 3) * (-20.82017-(-22.25)));
            zz = 0 + (((tickAnim - 15) / 3) * (10.37068-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 20) {
            xx = 2.18391 + (((tickAnim - 18) / 2) * (6-(2.18391)));
            yy = -20.82017 + (((tickAnim - 18) / 2) * (-22.25-(-20.82017)));
            zz = 10.37068 + (((tickAnim - 18) / 2) * (0-(10.37068)));
        }
        else if (tickAnim >= 20 && tickAnim < 23) {
            xx = 6 + (((tickAnim - 20) / 3) * (2.18391-(6)));
            yy = -22.25 + (((tickAnim - 20) / 3) * (-20.82017-(-22.25)));
            zz = 0 + (((tickAnim - 20) / 3) * (10.37068-(0)));
        }
        else if (tickAnim >= 23 && tickAnim < 25) {
            xx = 2.18391 + (((tickAnim - 23) / 2) * (6-(2.18391)));
            yy = -20.82017 + (((tickAnim - 23) / 2) * (-22.25-(-20.82017)));
            zz = 10.37068 + (((tickAnim - 23) / 2) * (0-(10.37068)));
        }
        else if (tickAnim >= 25 && tickAnim < 28) {
            xx = 6 + (((tickAnim - 25) / 3) * (2.18391-(6)));
            yy = -22.25 + (((tickAnim - 25) / 3) * (-20.82017-(-22.25)));
            zz = 0 + (((tickAnim - 25) / 3) * (10.37068-(0)));
        }
        else if (tickAnim >= 28 && tickAnim < 30) {
            xx = 2.18391 + (((tickAnim - 28) / 2) * (6-(2.18391)));
            yy = -20.82017 + (((tickAnim - 28) / 2) * (-22.25-(-20.82017)));
            zz = 10.37068 + (((tickAnim - 28) / 2) * (0-(10.37068)));
        }
        else if (tickAnim >= 30 && tickAnim < 33) {
            xx = 6 + (((tickAnim - 30) / 3) * (2.18391-(6)));
            yy = -22.25 + (((tickAnim - 30) / 3) * (-20.82017-(-22.25)));
            zz = 0 + (((tickAnim - 30) / 3) * (10.37068-(0)));
        }
        else if (tickAnim >= 33 && tickAnim < 35) {
            xx = 2.18391 + (((tickAnim - 33) / 2) * (6-(2.18391)));
            yy = -20.82017 + (((tickAnim - 33) / 2) * (-22.25-(-20.82017)));
            zz = 10.37068 + (((tickAnim - 33) / 2) * (0-(10.37068)));
        }
        else if (tickAnim >= 35 && tickAnim < 38) {
            xx = 6 + (((tickAnim - 35) / 3) * (2.18391-(6)));
            yy = -22.25 + (((tickAnim - 35) / 3) * (-20.82017-(-22.25)));
            zz = 0 + (((tickAnim - 35) / 3) * (10.37068-(0)));
        }
        else if (tickAnim >= 38 && tickAnim < 42) {
            xx = 2.18391 + (((tickAnim - 38) / 4) * (6-(2.18391)));
            yy = -20.82017 + (((tickAnim - 38) / 4) * (-22.25-(-20.82017)));
            zz = 10.37068 + (((tickAnim - 38) / 4) * (0-(10.37068)));
        }
        else if (tickAnim >= 42 && tickAnim < 55) {
            xx = 6 + (((tickAnim - 42) / 13) * (0-(6)));
            yy = -22.25 + (((tickAnim - 42) / 13) * (0-(-22.25)));
            zz = 0 + (((tickAnim - 42) / 13) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck, neck.rotateAngleX + (float) Math.toRadians(xx), neck.rotateAngleY + (float) Math.toRadians(yy), neck.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 10) * (-17.75-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 10) / 3) * (-3.55309-(0)));
            yy = -17.75 + (((tickAnim - 10) / 3) * (-22.42918-(-17.75)));
            zz = 0 + (((tickAnim - 10) / 3) * (10.31088-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 15) {
            xx = -3.55309 + (((tickAnim - 13) / 2) * (0-(-3.55309)));
            yy = -22.42918 + (((tickAnim - 13) / 2) * (-17.75-(-22.42918)));
            zz = 10.31088 + (((tickAnim - 13) / 2) * (0-(10.31088)));
        }
        else if (tickAnim >= 15 && tickAnim < 18) {
            xx = 0 + (((tickAnim - 15) / 3) * (-3.55309-(0)));
            yy = -17.75 + (((tickAnim - 15) / 3) * (-22.42918-(-17.75)));
            zz = 0 + (((tickAnim - 15) / 3) * (10.31088-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 20) {
            xx = -3.55309 + (((tickAnim - 18) / 2) * (0-(-3.55309)));
            yy = -22.42918 + (((tickAnim - 18) / 2) * (-17.75-(-22.42918)));
            zz = 10.31088 + (((tickAnim - 18) / 2) * (0-(10.31088)));
        }
        else if (tickAnim >= 20 && tickAnim < 23) {
            xx = 0 + (((tickAnim - 20) / 3) * (-3.55309-(0)));
            yy = -17.75 + (((tickAnim - 20) / 3) * (-22.42918-(-17.75)));
            zz = 0 + (((tickAnim - 20) / 3) * (10.31088-(0)));
        }
        else if (tickAnim >= 23 && tickAnim < 25) {
            xx = -3.55309 + (((tickAnim - 23) / 2) * (0-(-3.55309)));
            yy = -22.42918 + (((tickAnim - 23) / 2) * (-17.75-(-22.42918)));
            zz = 10.31088 + (((tickAnim - 23) / 2) * (0-(10.31088)));
        }
        else if (tickAnim >= 25 && tickAnim < 28) {
            xx = 0 + (((tickAnim - 25) / 3) * (-3.55309-(0)));
            yy = -17.75 + (((tickAnim - 25) / 3) * (-22.42918-(-17.75)));
            zz = 0 + (((tickAnim - 25) / 3) * (10.31088-(0)));
        }
        else if (tickAnim >= 28 && tickAnim < 30) {
            xx = -3.55309 + (((tickAnim - 28) / 2) * (0-(-3.55309)));
            yy = -22.42918 + (((tickAnim - 28) / 2) * (-17.75-(-22.42918)));
            zz = 10.31088 + (((tickAnim - 28) / 2) * (0-(10.31088)));
        }
        else if (tickAnim >= 30 && tickAnim < 33) {
            xx = 0 + (((tickAnim - 30) / 3) * (-3.55309-(0)));
            yy = -17.75 + (((tickAnim - 30) / 3) * (-22.42918-(-17.75)));
            zz = 0 + (((tickAnim - 30) / 3) * (10.31088-(0)));
        }
        else if (tickAnim >= 33 && tickAnim < 35) {
            xx = -3.55309 + (((tickAnim - 33) / 2) * (0-(-3.55309)));
            yy = -22.42918 + (((tickAnim - 33) / 2) * (-17.75-(-22.42918)));
            zz = 10.31088 + (((tickAnim - 33) / 2) * (0-(10.31088)));
        }
        else if (tickAnim >= 35 && tickAnim < 38) {
            xx = 0 + (((tickAnim - 35) / 3) * (-3.55309-(0)));
            yy = -17.75 + (((tickAnim - 35) / 3) * (-22.42918-(-17.75)));
            zz = 0 + (((tickAnim - 35) / 3) * (10.31088-(0)));
        }
        else if (tickAnim >= 38 && tickAnim < 42) {
            xx = -3.55309 + (((tickAnim - 38) / 4) * (0-(-3.55309)));
            yy = -22.42918 + (((tickAnim - 38) / 4) * (-17.75-(-22.42918)));
            zz = 10.31088 + (((tickAnim - 38) / 4) * (0-(10.31088)));
        }
        else if (tickAnim >= 42 && tickAnim < 55) {
            xx = 0 + (((tickAnim - 42) / 13) * (0-(0)));
            yy = -17.75 + (((tickAnim - 42) / 13) * (0-(-17.75)));
            zz = 0 + (((tickAnim - 42) / 13) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(head, head.rotateAngleX + (float) Math.toRadians(xx), head.rotateAngleY + (float) Math.toRadians(yy), head.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 10 && tickAnim < 23) {
            xx = 1 + (((tickAnim - 10) / 13) * (1-(1)));
            yy = 1 + (((tickAnim - 10) / 13) * (0.2475-(1)));
            zz = 1 + (((tickAnim - 10) / 13) * (1-(1)));
        }
        else if (tickAnim >= 23 && tickAnim < 28) {
            xx = 1 + (((tickAnim - 23) / 5) * (1-(1)));
            yy = 0.2475 + (((tickAnim - 23) / 5) * (0.11-(0.2475)));
            zz = 1 + (((tickAnim - 23) / 5) * (1-(1)));
        }
        else if (tickAnim >= 28 && tickAnim < 33) {
            xx = 1 + (((tickAnim - 28) / 5) * (1-(1)));
            yy = 0.11 + (((tickAnim - 28) / 5) * (0.2475-(0.11)));
            zz = 1 + (((tickAnim - 28) / 5) * (1-(1)));
        }
        else if (tickAnim >= 33 && tickAnim < 40) {
            xx = 1 + (((tickAnim - 33) / 7) * (1-(1)));
            yy = 0.2475 + (((tickAnim - 33) / 7) * (1-(0.2475)));
            zz = 1 + (((tickAnim - 33) / 7) * (1-(1)));
        }
        else {
            xx = 1;
            yy = 1;
            zz = 1;
        }
        this.eye.setScale((float)xx, (float)yy, (float)zz);




        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 0) / 10) * (29.15688-(0)));
            yy = 0 + (((tickAnim - 0) / 10) * (-21.22516-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (9.29144-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 41) {
            xx = 29.15688 + (((tickAnim - 10) / 31) * (29.15688-(29.15688)));
            yy = -21.22516 + (((tickAnim - 10) / 31) * (-21.22516-(-21.22516)));
            zz = 9.29144 + (((tickAnim - 10) / 31) * (9.29144-(9.29144)));
        }
        else if (tickAnim >= 41 && tickAnim < 55) {
            xx = 29.15688 + (((tickAnim - 41) / 14) * (0-(29.15688)));
            yy = -21.22516 + (((tickAnim - 41) / 14) * (0-(-21.22516)));
            zz = 9.29144 + (((tickAnim - 41) / 14) * (0-(9.29144)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftarm, leftarm.rotateAngleX + (float) Math.toRadians(xx), leftarm.rotateAngleY + (float) Math.toRadians(yy), leftarm.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 10) / 3) * (0-(0)));
            yy = 0 + (((tickAnim - 10) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 3) * (8.75-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 13) / 2) * (0-(0)));
            yy = 0 + (((tickAnim - 13) / 2) * (0-(0)));
            zz = 8.75 + (((tickAnim - 13) / 2) * (0-(8.75)));
        }
        else if (tickAnim >= 15 && tickAnim < 18) {
            xx = 0 + (((tickAnim - 15) / 3) * (0-(0)));
            yy = 0 + (((tickAnim - 15) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 3) * (8.75-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 18) / 2) * (0-(0)));
            yy = 0 + (((tickAnim - 18) / 2) * (0-(0)));
            zz = 8.75 + (((tickAnim - 18) / 2) * (0-(8.75)));
        }
        else if (tickAnim >= 20 && tickAnim < 23) {
            xx = 0 + (((tickAnim - 20) / 3) * (0-(0)));
            yy = 0 + (((tickAnim - 20) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 3) * (8.75-(0)));
        }
        else if (tickAnim >= 23 && tickAnim < 25) {
            xx = 0 + (((tickAnim - 23) / 2) * (0-(0)));
            yy = 0 + (((tickAnim - 23) / 2) * (0-(0)));
            zz = 8.75 + (((tickAnim - 23) / 2) * (0-(8.75)));
        }
        else if (tickAnim >= 25 && tickAnim < 28) {
            xx = 0 + (((tickAnim - 25) / 3) * (0-(0)));
            yy = 0 + (((tickAnim - 25) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 25) / 3) * (8.75-(0)));
        }
        else if (tickAnim >= 28 && tickAnim < 30) {
            xx = 0 + (((tickAnim - 28) / 2) * (0-(0)));
            yy = 0 + (((tickAnim - 28) / 2) * (0-(0)));
            zz = 8.75 + (((tickAnim - 28) / 2) * (0-(8.75)));
        }
        else if (tickAnim >= 30 && tickAnim < 33) {
            xx = 0 + (((tickAnim - 30) / 3) * (0-(0)));
            yy = 0 + (((tickAnim - 30) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 30) / 3) * (8.75-(0)));
        }
        else if (tickAnim >= 33 && tickAnim < 35) {
            xx = 0 + (((tickAnim - 33) / 2) * (0-(0)));
            yy = 0 + (((tickAnim - 33) / 2) * (0-(0)));
            zz = 8.75 + (((tickAnim - 33) / 2) * (0-(8.75)));
        }
        else if (tickAnim >= 35 && tickAnim < 38) {
            xx = 0 + (((tickAnim - 35) / 3) * (0-(0)));
            yy = 0 + (((tickAnim - 35) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 35) / 3) * (8.75-(0)));
        }
        else if (tickAnim >= 38 && tickAnim < 40) {
            xx = 0 + (((tickAnim - 38) / 2) * (0-(0)));
            yy = 0 + (((tickAnim - 38) / 2) * (0-(0)));
            zz = 8.75 + (((tickAnim - 38) / 2) * (0-(8.75)));
        }
        else if (tickAnim >= 40 && tickAnim < 55) {
            xx = 0 + (((tickAnim - 40) / 15) * (0-(0)));
            yy = 0 + (((tickAnim - 40) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 40) / 15) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftarm2, leftarm2.rotateAngleX + (float) Math.toRadians(xx), leftarm2.rotateAngleY + (float) Math.toRadians(yy), leftarm2.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 10) / 3) * (-0.6-(0)));
            yy = 0 + (((tickAnim - 10) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 3) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 15) {
            xx = -0.6 + (((tickAnim - 13) / 2) * (0-(-0.6)));
            yy = 0 + (((tickAnim - 13) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 13) / 2) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 18) {
            xx = 0 + (((tickAnim - 15) / 3) * (-0.6-(0)));
            yy = 0 + (((tickAnim - 15) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 3) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 20) {
            xx = -0.6 + (((tickAnim - 18) / 2) * (0-(-0.6)));
            yy = 0 + (((tickAnim - 18) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 18) / 2) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 23) {
            xx = 0 + (((tickAnim - 20) / 3) * (-0.6-(0)));
            yy = 0 + (((tickAnim - 20) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 3) * (0-(0)));
        }
        else if (tickAnim >= 23 && tickAnim < 25) {
            xx = -0.6 + (((tickAnim - 23) / 2) * (0-(-0.6)));
            yy = 0 + (((tickAnim - 23) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 23) / 2) * (0-(0)));
        }
        else if (tickAnim >= 25 && tickAnim < 28) {
            xx = 0 + (((tickAnim - 25) / 3) * (-0.6-(0)));
            yy = 0 + (((tickAnim - 25) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 25) / 3) * (0-(0)));
        }
        else if (tickAnim >= 28 && tickAnim < 30) {
            xx = -0.6 + (((tickAnim - 28) / 2) * (0-(-0.6)));
            yy = 0 + (((tickAnim - 28) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 28) / 2) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 33) {
            xx = 0 + (((tickAnim - 30) / 3) * (-0.6-(0)));
            yy = 0 + (((tickAnim - 30) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 30) / 3) * (0-(0)));
        }
        else if (tickAnim >= 33 && tickAnim < 35) {
            xx = -0.6 + (((tickAnim - 33) / 2) * (0-(-0.6)));
            yy = 0 + (((tickAnim - 33) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 33) / 2) * (0-(0)));
        }
        else if (tickAnim >= 35 && tickAnim < 38) {
            xx = 0 + (((tickAnim - 35) / 3) * (-0.6-(0)));
            yy = 0 + (((tickAnim - 35) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 35) / 3) * (0-(0)));
        }
        else if (tickAnim >= 38 && tickAnim < 40) {
            xx = -0.6 + (((tickAnim - 38) / 2) * (0-(-0.6)));
            yy = 0 + (((tickAnim - 38) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 38) / 2) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.leftarm2.rotationPointX = this.leftarm2.rotationPointX + (float)(xx);
        this.leftarm2.rotationPointY = this.leftarm2.rotationPointY - (float)(yy);
        this.leftarm2.rotationPointZ = this.leftarm2.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 0) / 10) * (-9.5-(0)));
            yy = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 41) {
            xx = -9.5 + (((tickAnim - 10) / 31) * (-9.5-(-9.5)));
            yy = 0 + (((tickAnim - 10) / 31) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 31) * (0-(0)));
        }
        else if (tickAnim >= 41 && tickAnim < 55) {
            xx = -9.5 + (((tickAnim - 41) / 14) * (0-(-9.5)));
            yy = 0 + (((tickAnim - 41) / 14) * (0-(0)));
            zz = 0 + (((tickAnim - 41) / 14) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightarm, rightarm.rotateAngleX + (float) Math.toRadians(xx), rightarm.rotateAngleY + (float) Math.toRadians(yy), rightarm.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 0) / 10) * (12.5-(0)));
            yy = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 41) {
            xx = 12.5 + (((tickAnim - 10) / 31) * (12.5-(12.5)));
            yy = 0 + (((tickAnim - 10) / 31) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 31) * (0-(0)));
        }
        else if (tickAnim >= 41 && tickAnim < 55) {
            xx = 12.5 + (((tickAnim - 41) / 14) * (0-(12.5)));
            yy = 0 + (((tickAnim - 41) / 14) * (0-(0)));
            zz = 0 + (((tickAnim - 41) / 14) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightarm2, rightarm2.rotateAngleX + (float) Math.toRadians(xx), rightarm2.rotateAngleY + (float) Math.toRadians(yy), rightarm2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (25.75-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 41) {
            xx = 0 + (((tickAnim - 10) / 31) * (0-(0)));
            yy = 0 + (((tickAnim - 10) / 31) * (0-(0)));
            zz = 25.75 + (((tickAnim - 10) / 31) * (25.75-(25.75)));
        }
        else if (tickAnim >= 41 && tickAnim < 55) {
            xx = 0 + (((tickAnim - 41) / 14) * (0-(0)));
            yy = 0 + (((tickAnim - 41) / 14) * (0-(0)));
            zz = 25.75 + (((tickAnim - 41) / 14) * (0-(25.75)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightarm3, rightarm3.rotateAngleX + (float) Math.toRadians(xx), rightarm3.rotateAngleY + (float) Math.toRadians(yy), rightarm3.rotateAngleZ + (float) Math.toRadians(zz));

    }
    public void animIdle(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime, double animTick) {
        EntityPrehistoricFloraPsittacosaurus_sinensis entity = (EntityPrehistoricFloraPsittacosaurus_sinensis) entitylivingbaseIn;
        int animCycle = 125;
        double tickAnim = animTick + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;
         if (tickAnim >= 0 && tickAnim < 9) {
            xx = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120))*-15 + (((tickAnim - 0) / 9) * (-14.25-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120))*-15)));
            yy = 0 + (((tickAnim - 0) / 9) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 9) * (0-(0)));
        }
        else if (tickAnim >= 9 && tickAnim < 111) {
            xx = -14.25 + (((tickAnim - 9) / 102) * (-14.25-(-14.25)));
            yy = 0 + (((tickAnim - 9) / 102) * (0-(0)));
            zz = 0 + (((tickAnim - 9) / 102) * (0-(0)));
        }
        else if (tickAnim >= 111 && tickAnim < 125) {
            xx = -14.25 + (((tickAnim - 111) / 14) * (-5.075+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120))*10-(-14.25)));
            yy = 0 + (((tickAnim - 111) / 14) * (0-(0)));
            zz = 0 + (((tickAnim - 111) / 14) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(body, body.rotateAngleX + (float) Math.toRadians(xx), body.rotateAngleY + (float) Math.toRadians(yy), body.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 9) {
            xx = 0 + (((tickAnim - 0) / 9) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 9) * (-0.65-(0)));
            zz = 0 + (((tickAnim - 0) / 9) * (0.475-(0)));
        }
        else if (tickAnim >= 9 && tickAnim < 111) {
            xx = 0 + (((tickAnim - 9) / 102) * (0-(0)));
            yy = -0.65 + (((tickAnim - 9) / 102) * (-0.65-(-0.65)));
            zz = 0.475 + (((tickAnim - 9) / 102) * (0.475-(0.475)));
        }
        else if (tickAnim >= 111 && tickAnim < 125) {
            xx = 0 + (((tickAnim - 111) / 14) * (0-(0)));
            yy = -0.65 + (((tickAnim - 111) / 14) * (0-(-0.65)));
            zz = 0.475 + (((tickAnim - 111) / 14) * (0-(0.475)));
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
            xx = 0 + (((tickAnim - 0) / 3) * (1.52-(0)));
            yy = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 3) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 9) {
            xx = 1.52 + (((tickAnim - 3) / 6) * (-9.75-(1.52)));
            yy = 0 + (((tickAnim - 3) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 3) / 6) * (0-(0)));
        }
        else if (tickAnim >= 9 && tickAnim < 25) {
            xx = -9.75 + (((tickAnim - 9) / 16) * (-6-(-9.75)));
            yy = 0 + (((tickAnim - 9) / 16) * (0-(0)));
            zz = 0 + (((tickAnim - 9) / 16) * (0-(0)));
        }
        else if (tickAnim >= 25 && tickAnim < 37) {
            xx = -6 + (((tickAnim - 25) / 12) * (-4.675-(-6)));
            yy = 0 + (((tickAnim - 25) / 12) * (0-(0)));
            zz = 0 + (((tickAnim - 25) / 12) * (0-(0)));
        }
        else if (tickAnim >= 37 && tickAnim < 51) {
            xx = -4.675 + (((tickAnim - 37) / 14) * (-2.875-(-4.675)));
            yy = 0 + (((tickAnim - 37) / 14) * (0-(0)));
            zz = 0 + (((tickAnim - 37) / 14) * (0-(0)));
        }
        else if (tickAnim >= 51 && tickAnim < 69) {
            xx = -2.875 + (((tickAnim - 51) / 18) * (0.5-(-2.875)));
            yy = 0 + (((tickAnim - 51) / 18) * (0-(0)));
            zz = 0 + (((tickAnim - 51) / 18) * (0-(0)));
        }
        else if (tickAnim >= 69 && tickAnim < 93) {
            xx = 0.5 + (((tickAnim - 69) / 24) * (5.75-(0.5)));
            yy = 0 + (((tickAnim - 69) / 24) * (0-(0)));
            zz = 0 + (((tickAnim - 69) / 24) * (0-(0)));
        }
        else if (tickAnim >= 93 && tickAnim < 111) {
            xx = 5.75 + (((tickAnim - 93) / 18) * (6.25-(5.75)));
            yy = 0 + (((tickAnim - 93) / 18) * (0-(0)));
            zz = 0 + (((tickAnim - 93) / 18) * (0-(0)));
        }
        else if (tickAnim >= 111 && tickAnim < 125) {
            xx = 6.25 + (((tickAnim - 111) / 14) * (0-(6.25)));
            yy = 0 + (((tickAnim - 111) / 14) * (0-(0)));
            zz = 0 + (((tickAnim - 111) / 14) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tail2, tail2.rotateAngleX + (float) Math.toRadians(xx), tail2.rotateAngleY + (float) Math.toRadians(yy), tail2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 9) {
            xx = 0 + (((tickAnim - 0) / 9) * (-3.5-(0)));
            yy = 0 + (((tickAnim - 0) / 9) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 9) * (0-(0)));
        }
        else if (tickAnim >= 9 && tickAnim < 25) {
            xx = -3.5 + (((tickAnim - 9) / 16) * (-5.5-(-3.5)));
            yy = 0 + (((tickAnim - 9) / 16) * (0-(0)));
            zz = 0 + (((tickAnim - 9) / 16) * (0-(0)));
        }
        else if (tickAnim >= 25 && tickAnim < 37) {
            xx = -5.5 + (((tickAnim - 25) / 12) * (-8.75-(-5.5)));
            yy = 0 + (((tickAnim - 25) / 12) * (0-(0)));
            zz = 0 + (((tickAnim - 25) / 12) * (0-(0)));
        }
        else if (tickAnim >= 37 && tickAnim < 51) {
            xx = -8.75 + (((tickAnim - 37) / 14) * (-6.6-(-8.75)));
            yy = 0 + (((tickAnim - 37) / 14) * (0-(0)));
            zz = 0 + (((tickAnim - 37) / 14) * (0-(0)));
        }
        else if (tickAnim >= 51 && tickAnim < 76) {
            xx = -6.6 + (((tickAnim - 51) / 25) * (5.46-(-6.6)));
            yy = 0 + (((tickAnim - 51) / 25) * (0-(0)));
            zz = 0 + (((tickAnim - 51) / 25) * (0-(0)));
        }
        else if (tickAnim >= 76 && tickAnim < 93) {
            xx = 5.46 + (((tickAnim - 76) / 17) * (-0.75-(5.46)));
            yy = 0 + (((tickAnim - 76) / 17) * (0-(0)));
            zz = 0 + (((tickAnim - 76) / 17) * (0-(0)));
        }
        else if (tickAnim >= 93 && tickAnim < 111) {
            xx = -0.75 + (((tickAnim - 93) / 18) * (-5.75-(-0.75)));
            yy = 0 + (((tickAnim - 93) / 18) * (0-(0)));
            zz = 0 + (((tickAnim - 93) / 18) * (0-(0)));
        }
        else if (tickAnim >= 111 && tickAnim < 125) {
            xx = -5.75 + (((tickAnim - 111) / 14) * (0-(-5.75)));
            yy = 0 + (((tickAnim - 111) / 14) * (0-(0)));
            zz = 0 + (((tickAnim - 111) / 14) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tail3, tail3.rotateAngleX + (float) Math.toRadians(xx), tail3.rotateAngleY + (float) Math.toRadians(yy), tail3.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 9) {
            xx = 0 + (((tickAnim - 0) / 9) * (6.5-(0)));
            yy = 0 + (((tickAnim - 0) / 9) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 9) * (0-(0)));
        }
        else if (tickAnim >= 9 && tickAnim < 25) {
            xx = 6.5 + (((tickAnim - 9) / 16) * (-1.5-(6.5)));
            yy = 0 + (((tickAnim - 9) / 16) * (0-(0)));
            zz = 0 + (((tickAnim - 9) / 16) * (0-(0)));
        }
        else if (tickAnim >= 25 && tickAnim < 37) {
            xx = -1.5 + (((tickAnim - 25) / 12) * (-5-(-1.5)));
            yy = 0 + (((tickAnim - 25) / 12) * (0-(0)));
            zz = 0 + (((tickAnim - 25) / 12) * (0-(0)));
        }
        else if (tickAnim >= 37 && tickAnim < 51) {
            xx = -5 + (((tickAnim - 37) / 14) * (-11.25-(-5)));
            yy = 0 + (((tickAnim - 37) / 14) * (0-(0)));
            zz = 0 + (((tickAnim - 37) / 14) * (0-(0)));
        }
        else if (tickAnim >= 51 && tickAnim < 62) {
            xx = -11.25 + (((tickAnim - 51) / 11) * (-6.1-(-11.25)));
            yy = 0 + (((tickAnim - 51) / 11) * (0-(0)));
            zz = 0 + (((tickAnim - 51) / 11) * (0-(0)));
        }
        else if (tickAnim >= 62 && tickAnim < 76) {
            xx = -6.1 + (((tickAnim - 62) / 14) * (6.79-(-6.1)));
            yy = 0 + (((tickAnim - 62) / 14) * (0-(0)));
            zz = 0 + (((tickAnim - 62) / 14) * (0-(0)));
        }
        else if (tickAnim >= 76 && tickAnim < 93) {
            xx = 6.79 + (((tickAnim - 76) / 17) * (-4.75-(6.79)));
            yy = 0 + (((tickAnim - 76) / 17) * (0-(0)));
            zz = 0 + (((tickAnim - 76) / 17) * (0-(0)));
        }
        else if (tickAnim >= 93 && tickAnim < 111) {
            xx = -4.75 + (((tickAnim - 93) / 18) * (-12-(-4.75)));
            yy = 0 + (((tickAnim - 93) / 18) * (0-(0)));
            zz = 0 + (((tickAnim - 93) / 18) * (0-(0)));
        }
        else if (tickAnim >= 111 && tickAnim < 125) {
            xx = -12 + (((tickAnim - 111) / 14) * (0-(-12)));
            yy = 0 + (((tickAnim - 111) / 14) * (0-(0)));
            zz = 0 + (((tickAnim - 111) / 14) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tail4, tail4.rotateAngleX + (float) Math.toRadians(xx), tail4.rotateAngleY + (float) Math.toRadians(yy), tail4.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 9) {
            xx = 0 + (((tickAnim - 0) / 9) * (20-(0)));
            yy = 0 + (((tickAnim - 0) / 9) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 9) * (0-(0)));
        }
        else if (tickAnim >= 9 && tickAnim < 25) {
            xx = 20 + (((tickAnim - 9) / 16) * (9.5-(20)));
            yy = 0 + (((tickAnim - 9) / 16) * (0-(0)));
            zz = 0 + (((tickAnim - 9) / 16) * (0-(0)));
        }
        else if (tickAnim >= 25 && tickAnim < 37) {
            xx = 9.5 + (((tickAnim - 25) / 12) * (3.25-(9.5)));
            yy = 0 + (((tickAnim - 25) / 12) * (0-(0)));
            zz = 0 + (((tickAnim - 25) / 12) * (0-(0)));
        }
        else if (tickAnim >= 37 && tickAnim < 51) {
            xx = 3.25 + (((tickAnim - 37) / 14) * (-7.75-(3.25)));
            yy = 0 + (((tickAnim - 37) / 14) * (0-(0)));
            zz = 0 + (((tickAnim - 37) / 14) * (0-(0)));
        }
        else if (tickAnim >= 51 && tickAnim < 62) {
            xx = -7.75 + (((tickAnim - 51) / 11) * (-20.12-(-7.75)));
            yy = 0 + (((tickAnim - 51) / 11) * (0-(0)));
            zz = 0 + (((tickAnim - 51) / 11) * (0-(0)));
        }
        else if (tickAnim >= 62 && tickAnim < 76) {
            xx = -20.12 + (((tickAnim - 62) / 14) * (7.5-(-20.12)));
            yy = 0 + (((tickAnim - 62) / 14) * (0-(0)));
            zz = 0 + (((tickAnim - 62) / 14) * (0-(0)));
        }
        else if (tickAnim >= 76 && tickAnim < 93) {
            xx = 7.5 + (((tickAnim - 76) / 17) * (-0.25-(7.5)));
            yy = 0 + (((tickAnim - 76) / 17) * (0-(0)));
            zz = 0 + (((tickAnim - 76) / 17) * (0-(0)));
        }
        else if (tickAnim >= 93 && tickAnim < 111) {
            xx = -0.25 + (((tickAnim - 93) / 18) * (-14.5-(-0.25)));
            yy = 0 + (((tickAnim - 93) / 18) * (0-(0)));
            zz = 0 + (((tickAnim - 93) / 18) * (0-(0)));
        }
        else if (tickAnim >= 111 && tickAnim < 125) {
            xx = -14.5 + (((tickAnim - 111) / 14) * (0-(-14.5)));
            yy = 0 + (((tickAnim - 111) / 14) * (0-(0)));
            zz = 0 + (((tickAnim - 111) / 14) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tail5, tail5.rotateAngleX + (float) Math.toRadians(xx), tail5.rotateAngleY + (float) Math.toRadians(yy), tail5.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 9) {
            xx = 0 + (((tickAnim - 0) / 9) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 9) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 9) * (0-(0)));
        }
        else if (tickAnim >= 9 && tickAnim < 111) {
            xx = 0 + (((tickAnim - 9) / 102) * (0-(0)));
            yy = 0 + (((tickAnim - 9) / 102) * (0-(0)));
            zz = 0 + (((tickAnim - 9) / 102) * (0-(0)));
        }
        else if (tickAnim >= 111 && tickAnim < 125) {
            xx = 0 + (((tickAnim - 111) / 14) * (0-(0)));
            yy = 0 + (((tickAnim - 111) / 14) * (0-(0)));
            zz = 0 + (((tickAnim - 111) / 14) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightleg, rightleg.rotateAngleX + (float) Math.toRadians(xx), rightleg.rotateAngleY + (float) Math.toRadians(yy), rightleg.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 9) {
            xx = 0 + (((tickAnim - 0) / 9) * (-7.25-(0)));
            yy = 0 + (((tickAnim - 0) / 9) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 9) * (0-(0)));
        }
        else if (tickAnim >= 9 && tickAnim < 111) {
            xx = -7.25 + (((tickAnim - 9) / 102) * (-7.25-(-7.25)));
            yy = 0 + (((tickAnim - 9) / 102) * (0-(0)));
            zz = 0 + (((tickAnim - 9) / 102) * (0-(0)));
        }
        else if (tickAnim >= 111 && tickAnim < 125) {
            xx = -7.25 + (((tickAnim - 111) / 14) * (0-(-7.25)));
            yy = 0 + (((tickAnim - 111) / 14) * (0-(0)));
            zz = 0 + (((tickAnim - 111) / 14) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightleg2, rightleg2.rotateAngleX + (float) Math.toRadians(xx), rightleg2.rotateAngleY + (float) Math.toRadians(yy), rightleg2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 9) {
            xx = 0 + (((tickAnim - 0) / 9) * (8-(0)));
            yy = 0 + (((tickAnim - 0) / 9) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 9) * (0-(0)));
        }
        else if (tickAnim >= 9 && tickAnim < 111) {
            xx = 8 + (((tickAnim - 9) / 102) * (8-(8)));
            yy = 0 + (((tickAnim - 9) / 102) * (0-(0)));
            zz = 0 + (((tickAnim - 9) / 102) * (0-(0)));
        }
        else if (tickAnim >= 111 && tickAnim < 125) {
            xx = 8 + (((tickAnim - 111) / 14) * (0-(8)));
            yy = 0 + (((tickAnim - 111) / 14) * (0-(0)));
            zz = 0 + (((tickAnim - 111) / 14) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightleg3, rightleg3.rotateAngleX + (float) Math.toRadians(xx), rightleg3.rotateAngleY + (float) Math.toRadians(yy), rightleg3.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 9) {
            xx = 0 + (((tickAnim - 0) / 9) * (14.25-(0)));
            yy = 0 + (((tickAnim - 0) / 9) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 9) * (0-(0)));
        }
        else if (tickAnim >= 9 && tickAnim < 111) {
            xx = 14.25 + (((tickAnim - 9) / 102) * (14.25-(14.25)));
            yy = 0 + (((tickAnim - 9) / 102) * (0-(0)));
            zz = 0 + (((tickAnim - 9) / 102) * (0-(0)));
        }
        else if (tickAnim >= 111 && tickAnim < 125) {
            xx = 14.25 + (((tickAnim - 111) / 14) * (0-(14.25)));
            yy = 0 + (((tickAnim - 111) / 14) * (0-(0)));
            zz = 0 + (((tickAnim - 111) / 14) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightleg4, rightleg4.rotateAngleX + (float) Math.toRadians(xx), rightleg4.rotateAngleY + (float) Math.toRadians(yy), rightleg4.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 9) {
            xx = 0 + (((tickAnim - 0) / 9) * (3.5-(0)));
            yy = 0 + (((tickAnim - 0) / 9) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 9) * (0-(0)));
        }
        else if (tickAnim >= 9 && tickAnim < 43) {
            xx = 3.5 + (((tickAnim - 9) / 34) * (4-(3.5)));
            yy = 0 + (((tickAnim - 9) / 34) * (0-(0)));
            zz = 0 + (((tickAnim - 9) / 34) * (0-(0)));
        }
        else if (tickAnim >= 43 && tickAnim < 51) {
            xx = 4 + (((tickAnim - 43) / 8) * (3.5-(4)));
            yy = 0 + (((tickAnim - 43) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 43) / 8) * (0-(0)));
        }
        else if (tickAnim >= 51 && tickAnim < 58) {
            xx = 3.5 + (((tickAnim - 51) / 7) * (6.9945+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120))*3-(3.5)));
            yy = 0 + (((tickAnim - 51) / 7) * (4.13232-(0)));
            zz = 0 + (((tickAnim - 51) / 7) * (0.25419-(0)));
        }
        else if (tickAnim >= 58 && tickAnim < 66) {
            xx = 6.9945+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120))*3 + (((tickAnim - 58) / 8) * (-6.6699+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120-80))*-15-(6.9945+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120))*3)));
            yy = 4.13232 + (((tickAnim - 58) / 8) * (7.48593-(4.13232)));
            zz = 0.25419 + (((tickAnim - 58) / 8) * (0.46049-(0.25419)));
        }
        else if (tickAnim >= 66 && tickAnim < 73) {
            xx = -6.6699+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120-80))*-15 + (((tickAnim - 66) / 7) * (-8.71987-(-6.6699+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120-80))*-15)));
            yy = 7.48593 + (((tickAnim - 66) / 7) * (7.48593-(7.48593)));
            zz = 0.46049 + (((tickAnim - 66) / 7) * (0.46049-(0.46049)));
        }
        else if (tickAnim >= 73 && tickAnim < 91) {
            xx = -8.71987 + (((tickAnim - 73) / 18) * (-8.96987-(-8.71987)));
            yy = 7.48593 + (((tickAnim - 73) / 18) * (7.48593-(7.48593)));
            zz = 0.46049 + (((tickAnim - 73) / 18) * (0.46049-(0.46049)));
        }
        else if (tickAnim >= 91 && tickAnim < 111) {
            xx = -8.96987 + (((tickAnim - 91) / 20) * (-8.46987-(-8.96987)));
            yy = 7.48593 + (((tickAnim - 91) / 20) * (7.48593-(7.48593)));
            zz = 0.46049 + (((tickAnim - 91) / 20) * (0.46049-(0.46049)));
        }
        else if (tickAnim >= 111 && tickAnim < 125) {
            xx = -8.46987 + (((tickAnim - 111) / 14) * (0-(-8.46987)));
            yy = 7.48593 + (((tickAnim - 111) / 14) * (0-(7.48593)));
            zz = 0.46049 + (((tickAnim - 111) / 14) * (0-(0.46049)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(upperbody2, upperbody2.rotateAngleX + (float) Math.toRadians(xx), upperbody2.rotateAngleY + (float) Math.toRadians(yy), upperbody2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 9) {
            xx = 0 + (((tickAnim - 0) / 9) * (1.75-(0)));
            yy = 0 + (((tickAnim - 0) / 9) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 9) * (0-(0)));
        }
        else if (tickAnim >= 9 && tickAnim < 18) {
            xx = 1.75 + (((tickAnim - 9) / 9) * (1.9-(1.75)));
            yy = 0 + (((tickAnim - 9) / 9) * (0-(0)));
            zz = 0 + (((tickAnim - 9) / 9) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 37) {
            xx = 1.9 + (((tickAnim - 18) / 19) * (2.25-(1.9)));
            yy = 0 + (((tickAnim - 18) / 19) * (0-(0)));
            zz = 0 + (((tickAnim - 18) / 19) * (0-(0)));
        }
        else if (tickAnim >= 37 && tickAnim < 51) {
            xx = 2.25 + (((tickAnim - 37) / 14) * (2.25-(2.25)));
            yy = 0 + (((tickAnim - 37) / 14) * (0-(0)));
            zz = 0 + (((tickAnim - 37) / 14) * (0-(0)));
        }
        else if (tickAnim >= 51 && tickAnim < 58) {
            xx = 2.25 + (((tickAnim - 51) / 7) * (3.4721+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120-50))*-15-(2.25)));
            yy = 0 + (((tickAnim - 51) / 7) * (4.41266-(0)));
            zz = 0 + (((tickAnim - 51) / 7) * (0.17451-(0)));
        }
        else if (tickAnim >= 58 && tickAnim < 76) {
            xx = 3.4721+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120-50))*-15 + (((tickAnim - 58) / 18) * (-6.47791-(3.4721+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120-50))*-15)));
            yy = 4.41266 + (((tickAnim - 58) / 18) * (7.99379-(4.41266)));
            zz = 0.17451 + (((tickAnim - 58) / 18) * (0.31613-(0.17451)));
        }
        else if (tickAnim >= 76 && tickAnim < 91) {
            xx = -6.47791 + (((tickAnim - 76) / 15) * (-6.97791-(-6.47791)));
            yy = 7.99379 + (((tickAnim - 76) / 15) * (7.99379-(7.99379)));
            zz = 0.31613 + (((tickAnim - 76) / 15) * (0.31613-(0.31613)));
        }
        else if (tickAnim >= 91 && tickAnim < 111) {
            xx = -6.97791 + (((tickAnim - 91) / 20) * (-6.97791-(-6.97791)));
            yy = 7.99379 + (((tickAnim - 91) / 20) * (7.99379-(7.99379)));
            zz = 0.31613 + (((tickAnim - 91) / 20) * (0.31613-(0.31613)));
        }
        else if (tickAnim >= 111 && tickAnim < 125) {
            xx = -6.97791 + (((tickAnim - 111) / 14) * (0-(-6.97791)));
            yy = 7.99379 + (((tickAnim - 111) / 14) * (0-(7.99379)));
            zz = 0.31613 + (((tickAnim - 111) / 14) * (0-(0.31613)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(upperbody, upperbody.rotateAngleX + (float) Math.toRadians(xx), upperbody.rotateAngleY + (float) Math.toRadians(yy), upperbody.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 9) {
            xx = 0 + (((tickAnim - 0) / 9) * (2.77074-(0)));
            yy = 0 + (((tickAnim - 0) / 9) * (-20.77988-(0)));
            zz = 0 + (((tickAnim - 0) / 9) * (3.50428-(0)));
        }
        else if (tickAnim >= 9 && tickAnim < 18) {
            xx = 2.77074 + (((tickAnim - 9) / 9) * (2.77074-(2.77074)));
            yy = -20.77988 + (((tickAnim - 9) / 9) * (-20.77988-(-20.77988)));
            zz = 3.50428 + (((tickAnim - 9) / 9) * (3.50428-(3.50428)));
        }
        else if (tickAnim >= 18 && tickAnim < 29) {
            xx = 2.77074 + (((tickAnim - 18) / 11) * (3.27074-(2.77074)));
            yy = -20.77988 + (((tickAnim - 18) / 11) * (-23.50488-(-20.77988)));
            zz = 3.50428 + (((tickAnim - 18) / 11) * (3.50428-(3.50428)));
        }
        else if (tickAnim >= 29 && tickAnim < 37) {
            xx = 3.27074 + (((tickAnim - 29) / 8) * (4.17074-(3.27074)));
            yy = -23.50488 + (((tickAnim - 29) / 8) * (-23.50488-(-23.50488)));
            zz = 3.50428 + (((tickAnim - 29) / 8) * (3.50428-(3.50428)));
        }
        else if (tickAnim >= 37 && tickAnim < 46) {
            xx = 4.17074 + (((tickAnim - 37) / 9) * (5.02074-(4.17074)));
            yy = -23.50488 + (((tickAnim - 37) / 9) * (-23.50488-(-23.50488)));
            zz = 3.50428 + (((tickAnim - 37) / 9) * (3.50428-(3.50428)));
        }
        else if (tickAnim >= 46 && tickAnim < 51) {
            xx = 5.02074 + (((tickAnim - 46) / 5) * (5.02074-(5.02074)));
            yy = -23.50488 + (((tickAnim - 46) / 5) * (-23.50488-(-23.50488)));
            zz = 3.50428 + (((tickAnim - 46) / 5) * (3.50428-(3.50428)));
        }
        else if (tickAnim >= 51 && tickAnim < 58) {
            xx = 5.02074 + (((tickAnim - 51) / 7) * (-9.87939-(5.02074)));
            yy = -23.50488 + (((tickAnim - 51) / 7) * (-8.9112-(-23.50488)));
            zz = 3.50428 + (((tickAnim - 51) / 7) * (3.91521-(3.50428)));
        }
        else if (tickAnim >= 58 && tickAnim < 68) {
            xx = -9.87939 + (((tickAnim - 58) / 10) * (-0.6859-(-9.87939)));
            yy = -8.9112 + (((tickAnim - 58) / 10) * (2.93242-(-8.9112)));
            zz = 3.91521 + (((tickAnim - 58) / 10) * (4.2487-(3.91521)));
        }
        else if (tickAnim >= 68 && tickAnim < 76) {
            xx = -0.6859 + (((tickAnim - 68) / 8) * (2.0641-(-0.6859)));
            yy = 2.93242 + (((tickAnim - 68) / 8) * (2.93242-(2.93242)));
            zz = 4.2487 + (((tickAnim - 68) / 8) * (4.2487-(4.2487)));
        }
        else if (tickAnim >= 76 && tickAnim < 91) {
            xx = 2.0641 + (((tickAnim - 76) / 15) * (3.0641-(2.0641)));
            yy = 2.93242 + (((tickAnim - 76) / 15) * (2.93242-(2.93242)));
            zz = 4.2487 + (((tickAnim - 76) / 15) * (4.2487-(4.2487)));
        }
        else if (tickAnim >= 91 && tickAnim < 111) {
            xx = 3.0641 + (((tickAnim - 91) / 20) * (1.8141-(3.0641)));
            yy = 2.93242 + (((tickAnim - 91) / 20) * (2.93242-(2.93242)));
            zz = 4.2487 + (((tickAnim - 91) / 20) * (4.2487-(4.2487)));
        }
        else if (tickAnim >= 111 && tickAnim < 125) {
            xx = 1.8141 + (((tickAnim - 111) / 14) * (0-(1.8141)));
            yy = 2.93242 + (((tickAnim - 111) / 14) * (0-(2.93242)));
            zz = 4.2487 + (((tickAnim - 111) / 14) * (0-(4.2487)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck, neck.rotateAngleX + (float) Math.toRadians(xx), neck.rotateAngleY + (float) Math.toRadians(yy), neck.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 9) {
            xx = 0 + (((tickAnim - 0) / 9) * (0.78368-(0)));
            yy = 0 + (((tickAnim - 0) / 9) * (-4.04591-(0)));
            zz = 0 + (((tickAnim - 0) / 9) * (-7.30572-(0)));
        }
        else if (tickAnim >= 9 && tickAnim < 18) {
            xx = 0.78368 + (((tickAnim - 9) / 9) * (-0.96632-(0.78368)));
            yy = -4.04591 + (((tickAnim - 9) / 9) * (-4.79591-(-4.04591)));
            zz = -7.30572 + (((tickAnim - 9) / 9) * (-7.30572-(-7.30572)));
        }
        else if (tickAnim >= 18 && tickAnim < 21) {
            xx = -0.96632 + (((tickAnim - 18) / 3) * (-1.71632-(-0.96632)));
            yy = -4.79591 + (((tickAnim - 18) / 3) * (-4.79591-(-4.79591)));
            zz = -7.30572 + (((tickAnim - 18) / 3) * (-7.30572-(-7.30572)));
        }
        else if (tickAnim >= 21 && tickAnim < 23) {
            xx = -1.71632 + (((tickAnim - 21) / 2) * (-0.96632-(-1.71632)));
            yy = -4.79591 + (((tickAnim - 21) / 2) * (-4.79591-(-4.79591)));
            zz = -7.30572 + (((tickAnim - 21) / 2) * (-7.30572-(-7.30572)));
        }
        else if (tickAnim >= 23 && tickAnim < 25) {
            xx = -0.96632 + (((tickAnim - 23) / 2) * (-1.71632-(-0.96632)));
            yy = -4.79591 + (((tickAnim - 23) / 2) * (-4.79591-(-4.79591)));
            zz = -7.30572 + (((tickAnim - 23) / 2) * (-7.30572-(-7.30572)));
        }
        else if (tickAnim >= 25 && tickAnim < 28) {
            xx = -1.71632 + (((tickAnim - 25) / 3) * (-0.96632-(-1.71632)));
            yy = -4.79591 + (((tickAnim - 25) / 3) * (-4.79591-(-4.79591)));
            zz = -7.30572 + (((tickAnim - 25) / 3) * (-7.30572-(-7.30572)));
        }
        else if (tickAnim >= 28 && tickAnim < 46) {
            xx = -0.96632 + (((tickAnim - 28) / 18) * (-1.71632-(-0.96632)));
            yy = -4.79591 + (((tickAnim - 28) / 18) * (-4.79591-(-4.79591)));
            zz = -7.30572 + (((tickAnim - 28) / 18) * (-7.30572-(-7.30572)));
        }
        else if (tickAnim >= 46 && tickAnim < 51) {
            xx = -1.71632 + (((tickAnim - 46) / 5) * (-1.71632-(-1.71632)));
            yy = -4.79591 + (((tickAnim - 46) / 5) * (-4.79591-(-4.79591)));
            zz = -7.30572 + (((tickAnim - 46) / 5) * (-7.30572-(-7.30572)));
        }
        else if (tickAnim >= 51 && tickAnim < 61) {
            xx = -1.71632 + (((tickAnim - 51) / 10) * (-12.2416+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120-50))*-15-(-1.71632)));
            yy = -4.79591 + (((tickAnim - 51) / 10) * (5.53131-(-4.79591)));
            zz = -7.30572 + (((tickAnim - 51) / 10) * (-2.88853-(-7.30572)));
        }
        else if (tickAnim >= 61 && tickAnim < 76) {
            xx = -12.2416+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120-50))*-15 + (((tickAnim - 61) / 15) * (20.93159-(-12.2416+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120-50))*-15)));
            yy = 5.53131 + (((tickAnim - 61) / 15) * (-8.97521-(5.53131)));
            zz = -2.88853 + (((tickAnim - 61) / 15) * (-2.29007-(-2.88853)));
        }
        else if (tickAnim >= 76 && tickAnim < 78) {
            xx = 20.93159 + (((tickAnim - 76) / 2) * (18.2636-(20.93159)));
            yy = -8.97521 + (((tickAnim - 76) / 2) * (-8.97521-(-8.97521)));
            zz = -2.29007 + (((tickAnim - 76) / 2) * (-2.29007-(-2.29007)));
        }
        else if (tickAnim >= 78 && tickAnim < 81) {
            xx = 18.2636 + (((tickAnim - 78) / 3) * (20.93159-(18.2636)));
            yy = -8.97521 + (((tickAnim - 78) / 3) * (-8.97521-(-8.97521)));
            zz = -2.29007 + (((tickAnim - 78) / 3) * (-2.29007-(-2.29007)));
        }
        else if (tickAnim >= 81 && tickAnim < 83) {
            xx = 20.93159 + (((tickAnim - 81) / 2) * (18.2636-(20.93159)));
            yy = -8.97521 + (((tickAnim - 81) / 2) * (-8.97521-(-8.97521)));
            zz = -2.29007 + (((tickAnim - 81) / 2) * (-2.29007-(-2.29007)));
        }
        else if (tickAnim >= 83 && tickAnim < 85) {
            xx = 18.2636 + (((tickAnim - 83) / 2) * (20.93159-(18.2636)));
            yy = -8.97521 + (((tickAnim - 83) / 2) * (-8.97521-(-8.97521)));
            zz = -2.29007 + (((tickAnim - 83) / 2) * (-2.29007-(-2.29007)));
        }
        else if (tickAnim >= 85 && tickAnim < 91) {
            xx = 20.93159 + (((tickAnim - 85) / 6) * (20.93159-(20.93159)));
            yy = -8.97521 + (((tickAnim - 85) / 6) * (-8.97521-(-8.97521)));
            zz = -2.29007 + (((tickAnim - 85) / 6) * (-2.29007-(-2.29007)));
        }
        else if (tickAnim >= 91 && tickAnim < 111) {
            xx = 20.93159 + (((tickAnim - 91) / 20) * (20.93159-(20.93159)));
            yy = -8.97521 + (((tickAnim - 91) / 20) * (-8.97521-(-8.97521)));
            zz = -2.29007 + (((tickAnim - 91) / 20) * (-2.29007-(-2.29007)));
        }
        else if (tickAnim >= 111 && tickAnim < 125) {
            xx = 20.93159 + (((tickAnim - 111) / 14) * (0-(20.93159)));
            yy = -8.97521 + (((tickAnim - 111) / 14) * (0-(-8.97521)));
            zz = -2.29007 + (((tickAnim - 111) / 14) * (0-(-2.29007)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(head, head.rotateAngleX + (float) Math.toRadians(xx), head.rotateAngleY + (float) Math.toRadians(yy), head.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 9) {
            xx = 0 + (((tickAnim - 0) / 9) * (22.5-(0)));
            yy = 0 + (((tickAnim - 0) / 9) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 9) * (0-(0)));
        }
        else if (tickAnim >= 9 && tickAnim < 51) {
            xx = 22.5 + (((tickAnim - 9) / 42) * (22.5-(22.5)));
            yy = 0 + (((tickAnim - 9) / 42) * (0-(0)));
            zz = 0 + (((tickAnim - 9) / 42) * (0-(0)));
        }
        else if (tickAnim >= 51 && tickAnim < 70) {
            xx = 22.5 + (((tickAnim - 51) / 19) * (34.79841-(22.5)));
            yy = 0 + (((tickAnim - 51) / 19) * (-13.33432-(0)));
            zz = 0 + (((tickAnim - 51) / 19) * (5.43749-(0)));
        }
        else if (tickAnim >= 70 && tickAnim < 111) {
            xx = 34.79841 + (((tickAnim - 70) / 41) * (34.79841-(34.79841)));
            yy = -13.33432 + (((tickAnim - 70) / 41) * (-13.33432-(-13.33432)));
            zz = 5.43749 + (((tickAnim - 70) / 41) * (5.43749-(5.43749)));
        }
        else if (tickAnim >= 111 && tickAnim < 125) {
            xx = 34.79841 + (((tickAnim - 111) / 14) * (0-(34.79841)));
            yy = -13.33432 + (((tickAnim - 111) / 14) * (0-(-13.33432)));
            zz = 5.43749 + (((tickAnim - 111) / 14) * (0-(5.43749)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftarm, leftarm.rotateAngleX + (float) Math.toRadians(xx), leftarm.rotateAngleY + (float) Math.toRadians(yy), leftarm.rotateAngleZ + (float) Math.toRadians(zz));



        this.setRotateAngle(leftarm2, leftarm2.rotateAngleX + (float) Math.toRadians(0), leftarm2.rotateAngleY + (float) Math.toRadians(0), leftarm2.rotateAngleZ + (float) Math.toRadians(0));



        if (tickAnim >= 0 && tickAnim < 9) {
            xx = 0 + (((tickAnim - 0) / 9) * (29.75-(0)));
            yy = 0 + (((tickAnim - 0) / 9) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 9) * (0-(0)));
        }
        else if (tickAnim >= 9 && tickAnim < 51) {
            xx = 29.75 + (((tickAnim - 9) / 42) * (29.75-(29.75)));
            yy = 0 + (((tickAnim - 9) / 42) * (0-(0)));
            zz = 0 + (((tickAnim - 9) / 42) * (0-(0)));
        }
        else if (tickAnim >= 51 && tickAnim < 70) {
            xx = 29.75 + (((tickAnim - 51) / 19) * (37.66364-(29.75)));
            yy = 0 + (((tickAnim - 51) / 19) * (9.83877-(0)));
            zz = 0 + (((tickAnim - 51) / 19) * (-4.73999-(0)));
        }
        else if (tickAnim >= 70 && tickAnim < 111) {
            xx = 37.66364 + (((tickAnim - 70) / 41) * (37.66364-(37.66364)));
            yy = 9.83877 + (((tickAnim - 70) / 41) * (9.83877-(9.83877)));
            zz = -4.73999 + (((tickAnim - 70) / 41) * (-4.73999-(-4.73999)));
        }
        else if (tickAnim >= 111 && tickAnim < 125) {
            xx = 37.66364 + (((tickAnim - 111) / 14) * (0-(37.66364)));
            yy = 9.83877 + (((tickAnim - 111) / 14) * (0-(9.83877)));
            zz = -4.73999 + (((tickAnim - 111) / 14) * (0-(-4.73999)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightarm, rightarm.rotateAngleX + (float) Math.toRadians(xx), rightarm.rotateAngleY + (float) Math.toRadians(yy), rightarm.rotateAngleZ + (float) Math.toRadians(zz));



        this.setRotateAngle(rightarm2, rightarm2.rotateAngleX + (float) Math.toRadians(0), rightarm2.rotateAngleY + (float) Math.toRadians(0), rightarm2.rotateAngleZ + (float) Math.toRadians(0));



        if (tickAnim >= 0 && tickAnim < 9) {
            xx = 0 + (((tickAnim - 0) / 9) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 9) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 9) * (0-(0)));
        }
        else if (tickAnim >= 9 && tickAnim < 111) {
            xx = 0 + (((tickAnim - 9) / 102) * (0-(0)));
            yy = 0 + (((tickAnim - 9) / 102) * (0-(0)));
            zz = 0 + (((tickAnim - 9) / 102) * (0-(0)));
        }
        else if (tickAnim >= 111 && tickAnim < 125) {
            xx = 0 + (((tickAnim - 111) / 14) * (0-(0)));
            yy = 0 + (((tickAnim - 111) / 14) * (0-(0)));
            zz = 0 + (((tickAnim - 111) / 14) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftleg, leftleg.rotateAngleX + (float) Math.toRadians(xx), leftleg.rotateAngleY + (float) Math.toRadians(yy), leftleg.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 9) {
            xx = 0 + (((tickAnim - 0) / 9) * (-7.25-(0)));
            yy = 0 + (((tickAnim - 0) / 9) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 9) * (0-(0)));
        }
        else if (tickAnim >= 9 && tickAnim < 111) {
            xx = -7.25 + (((tickAnim - 9) / 102) * (-7.25-(-7.25)));
            yy = 0 + (((tickAnim - 9) / 102) * (0-(0)));
            zz = 0 + (((tickAnim - 9) / 102) * (0-(0)));
        }
        else if (tickAnim >= 111 && tickAnim < 125) {
            xx = -7.25 + (((tickAnim - 111) / 14) * (0-(-7.25)));
            yy = 0 + (((tickAnim - 111) / 14) * (0-(0)));
            zz = 0 + (((tickAnim - 111) / 14) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftleg2, leftleg2.rotateAngleX + (float) Math.toRadians(xx), leftleg2.rotateAngleY + (float) Math.toRadians(yy), leftleg2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 9) {
            xx = 0 + (((tickAnim - 0) / 9) * (8-(0)));
            yy = 0 + (((tickAnim - 0) / 9) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 9) * (0-(0)));
        }
        else if (tickAnim >= 9 && tickAnim < 111) {
            xx = 8 + (((tickAnim - 9) / 102) * (8-(8)));
            yy = 0 + (((tickAnim - 9) / 102) * (0-(0)));
            zz = 0 + (((tickAnim - 9) / 102) * (0-(0)));
        }
        else if (tickAnim >= 111 && tickAnim < 125) {
            xx = 8 + (((tickAnim - 111) / 14) * (0-(8)));
            yy = 0 + (((tickAnim - 111) / 14) * (0-(0)));
            zz = 0 + (((tickAnim - 111) / 14) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftleg3, leftleg3.rotateAngleX + (float) Math.toRadians(xx), leftleg3.rotateAngleY + (float) Math.toRadians(yy), leftleg3.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 9) {
            xx = 0 + (((tickAnim - 0) / 9) * (14.25-(0)));
            yy = 0 + (((tickAnim - 0) / 9) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 9) * (0-(0)));
        }
        else if (tickAnim >= 9 && tickAnim < 111) {
            xx = 14.25 + (((tickAnim - 9) / 102) * (14.25-(14.25)));
            yy = 0 + (((tickAnim - 9) / 102) * (0-(0)));
            zz = 0 + (((tickAnim - 9) / 102) * (0-(0)));
        }
        else if (tickAnim >= 111 && tickAnim < 125) {
            xx = 14.25 + (((tickAnim - 111) / 14) * (0-(14.25)));
            yy = 0 + (((tickAnim - 111) / 14) * (0-(0)));
            zz = 0 + (((tickAnim - 111) / 14) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftleg4, leftleg4.rotateAngleX + (float) Math.toRadians(xx), leftleg4.rotateAngleY + (float) Math.toRadians(yy), leftleg4.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 18 && tickAnim < 24) {
            xx = 1 + (((tickAnim - 18) / 6) * (1-(1)));
            yy = 1 + (((tickAnim - 18) / 6) * (0.0175-(1)));
            zz = 1 + (((tickAnim - 18) / 6) * (1-(1)));
        }
        else if (tickAnim >= 24 && tickAnim < 29) {
            xx = 1 + (((tickAnim - 24) / 5) * (1-(1)));
            yy = 0.0175 + (((tickAnim - 24) / 5) * (1-(0.0175)));
            zz = 1 + (((tickAnim - 24) / 5) * (1-(1)));
        }
        else {
            xx = 1;
            yy = 1;
            zz = 1;
        }
        this.eye.setScale((float)xx, (float)yy, (float)zz);




        if (tickAnim >= 92 && tickAnim < 97) {
            xx = 0 + (((tickAnim - 92) / 5) * (1.75-(0)));
            yy = 0 + (((tickAnim - 92) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 92) / 5) * (0-(0)));
        }
        else if (tickAnim >= 97 && tickAnim < 101) {
            xx = 1.75 + (((tickAnim - 97) / 4) * (0-(1.75)));
            yy = 0 + (((tickAnim - 97) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 97) / 4) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(jaw, jaw.rotateAngleX + (float) Math.toRadians(xx), jaw.rotateAngleY + (float) Math.toRadians(yy), jaw.rotateAngleZ + (float) Math.toRadians(zz));

    }
    public void animNest(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime, double animTick) {
        EntityPrehistoricFloraPsittacosaurus_sinensis entity = (EntityPrehistoricFloraPsittacosaurus_sinensis) entitylivingbaseIn;
        int animCycle = 50;
        double tickAnim = animTick + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;
         if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 10) / 5) * (0-(0)));
            yy = 0 + (((tickAnim - 10) / 5) * (0.5-(0)));
            zz = 0 + (((tickAnim - 10) / 5) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 15) / 5) * (0-(0)));
            yy = 0.5 + (((tickAnim - 15) / 5) * (-1.25-(0.5)));
            zz = 0 + (((tickAnim - 15) / 5) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 25) {
            xx = 0 + (((tickAnim - 20) / 5) * (0-(0)));
            yy = -1.25 + (((tickAnim - 20) / 5) * (0-(-1.25)));
            zz = 0 + (((tickAnim - 20) / 5) * (0-(0)));
        }
        else if (tickAnim >= 25 && tickAnim < 30) {
            xx = 0 + (((tickAnim - 25) / 5) * (0-(0)));
            yy = 0 + (((tickAnim - 25) / 5) * (0.5-(0)));
            zz = 0 + (((tickAnim - 25) / 5) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 35) {
            xx = 0 + (((tickAnim - 30) / 5) * (0-(0)));
            yy = 0.5 + (((tickAnim - 30) / 5) * (-1.25-(0.5)));
            zz = 0 + (((tickAnim - 30) / 5) * (0-(0)));
        }
        else if (tickAnim >= 35 && tickAnim < 40) {
            xx = 0 + (((tickAnim - 35) / 5) * (0-(0)));
            yy = -1.25 + (((tickAnim - 35) / 5) * (0-(-1.25)));
            zz = 0 + (((tickAnim - 35) / 5) * (0-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 40) / 10) * (0-(0)));
            yy = 0 + (((tickAnim - 40) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 40) / 10) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tail2, tail2.rotateAngleX + (float) Math.toRadians(xx), tail2.rotateAngleY + (float) Math.toRadians(yy), tail2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 10) / 5) * (0-(0)));
            yy = 0 + (((tickAnim - 10) / 5) * (3.25-(0)));
            zz = 0 + (((tickAnim - 10) / 5) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 15) / 5) * (0-(0)));
            yy = 3.25 + (((tickAnim - 15) / 5) * (-3.75-(3.25)));
            zz = 0 + (((tickAnim - 15) / 5) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 23) {
            xx = 0 + (((tickAnim - 20) / 3) * (0-(0)));
            yy = -3.75 + (((tickAnim - 20) / 3) * (-6.37-(-3.75)));
            zz = 0 + (((tickAnim - 20) / 3) * (0-(0)));
        }
        else if (tickAnim >= 23 && tickAnim < 25) {
            xx = 0 + (((tickAnim - 23) / 2) * (0-(0)));
            yy = -6.37 + (((tickAnim - 23) / 2) * (0-(-6.37)));
            zz = 0 + (((tickAnim - 23) / 2) * (0-(0)));
        }
        else if (tickAnim >= 25 && tickAnim < 30) {
            xx = 0 + (((tickAnim - 25) / 5) * (0-(0)));
            yy = 0 + (((tickAnim - 25) / 5) * (3.25-(0)));
            zz = 0 + (((tickAnim - 25) / 5) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 35) {
            xx = 0 + (((tickAnim - 30) / 5) * (0-(0)));
            yy = 3.25 + (((tickAnim - 30) / 5) * (-3.75-(3.25)));
            zz = 0 + (((tickAnim - 30) / 5) * (0-(0)));
        }
        else if (tickAnim >= 35 && tickAnim < 38) {
            xx = 0 + (((tickAnim - 35) / 3) * (0-(0)));
            yy = -3.75 + (((tickAnim - 35) / 3) * (-6.37-(-3.75)));
            zz = 0 + (((tickAnim - 35) / 3) * (0-(0)));
        }
        else if (tickAnim >= 38 && tickAnim < 40) {
            xx = 0 + (((tickAnim - 38) / 2) * (0-(0)));
            yy = -6.37 + (((tickAnim - 38) / 2) * (0-(-6.37)));
            zz = 0 + (((tickAnim - 38) / 2) * (0-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 40) / 10) * (0-(0)));
            yy = 0 + (((tickAnim - 40) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 40) / 10) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tail3, tail3.rotateAngleX + (float) Math.toRadians(xx), tail3.rotateAngleY + (float) Math.toRadians(yy), tail3.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 10) / 5) * (0-(0)));
            yy = 0 + (((tickAnim - 10) / 5) * (7.25-(0)));
            zz = 0 + (((tickAnim - 10) / 5) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 18) {
            xx = 0 + (((tickAnim - 15) / 3) * (0-(0)));
            yy = 7.25 + (((tickAnim - 15) / 3) * (11.38-(7.25)));
            zz = 0 + (((tickAnim - 15) / 3) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 18) / 2) * (0-(0)));
            yy = 11.38 + (((tickAnim - 18) / 2) * (2.5-(11.38)));
            zz = 0 + (((tickAnim - 18) / 2) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 23) {
            xx = 0 + (((tickAnim - 20) / 3) * (0-(0)));
            yy = 2.5 + (((tickAnim - 20) / 3) * (-3.5-(2.5)));
            zz = 0 + (((tickAnim - 20) / 3) * (0-(0)));
        }
        else if (tickAnim >= 23 && tickAnim < 25) {
            xx = 0 + (((tickAnim - 23) / 2) * (0-(0)));
            yy = -3.5 + (((tickAnim - 23) / 2) * (0-(-3.5)));
            zz = 0 + (((tickAnim - 23) / 2) * (0-(0)));
        }
        else if (tickAnim >= 25 && tickAnim < 30) {
            xx = 0 + (((tickAnim - 25) / 5) * (0-(0)));
            yy = 0 + (((tickAnim - 25) / 5) * (7.25-(0)));
            zz = 0 + (((tickAnim - 25) / 5) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 33) {
            xx = 0 + (((tickAnim - 30) / 3) * (0-(0)));
            yy = 7.25 + (((tickAnim - 30) / 3) * (11.38-(7.25)));
            zz = 0 + (((tickAnim - 30) / 3) * (0-(0)));
        }
        else if (tickAnim >= 33 && tickAnim < 35) {
            xx = 0 + (((tickAnim - 33) / 2) * (0-(0)));
            yy = 11.38 + (((tickAnim - 33) / 2) * (2.5-(11.38)));
            zz = 0 + (((tickAnim - 33) / 2) * (0-(0)));
        }
        else if (tickAnim >= 35 && tickAnim < 38) {
            xx = 0 + (((tickAnim - 35) / 3) * (0-(0)));
            yy = 2.5 + (((tickAnim - 35) / 3) * (-3.5-(2.5)));
            zz = 0 + (((tickAnim - 35) / 3) * (0-(0)));
        }
        else if (tickAnim >= 38 && tickAnim < 40) {
            xx = 0 + (((tickAnim - 38) / 2) * (0-(0)));
            yy = -3.5 + (((tickAnim - 38) / 2) * (0-(-3.5)));
            zz = 0 + (((tickAnim - 38) / 2) * (0-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 40) / 10) * (0-(0)));
            yy = 0 + (((tickAnim - 40) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 40) / 10) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tail4, tail4.rotateAngleX + (float) Math.toRadians(xx), tail4.rotateAngleY + (float) Math.toRadians(yy), tail4.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 10) / 5) * (0-(0)));
            yy = 0 + (((tickAnim - 10) / 5) * (-12.25-(0)));
            zz = 0 + (((tickAnim - 10) / 5) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 18) {
            xx = 0 + (((tickAnim - 15) / 3) * (0-(0)));
            yy = -12.25 + (((tickAnim - 15) / 3) * (10.38-(-12.25)));
            zz = 0 + (((tickAnim - 15) / 3) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 18) / 2) * (0-(0)));
            yy = 10.38 + (((tickAnim - 18) / 2) * (17.75-(10.38)));
            zz = 0 + (((tickAnim - 18) / 2) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 23) {
            xx = 0 + (((tickAnim - 20) / 3) * (0-(0)));
            yy = 17.75 + (((tickAnim - 20) / 3) * (-15.12-(17.75)));
            zz = 0 + (((tickAnim - 20) / 3) * (0-(0)));
        }
        else if (tickAnim >= 23 && tickAnim < 25) {
            xx = 0 + (((tickAnim - 23) / 2) * (0-(0)));
            yy = -15.12 + (((tickAnim - 23) / 2) * (-7.75-(-15.12)));
            zz = 0 + (((tickAnim - 23) / 2) * (0-(0)));
        }
        else if (tickAnim >= 25 && tickAnim < 30) {
            xx = 0 + (((tickAnim - 25) / 5) * (0-(0)));
            yy = -7.75 + (((tickAnim - 25) / 5) * (-12.25-(-7.75)));
            zz = 0 + (((tickAnim - 25) / 5) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 33) {
            xx = 0 + (((tickAnim - 30) / 3) * (0-(0)));
            yy = -12.25 + (((tickAnim - 30) / 3) * (10.38-(-12.25)));
            zz = 0 + (((tickAnim - 30) / 3) * (0-(0)));
        }
        else if (tickAnim >= 33 && tickAnim < 35) {
            xx = 0 + (((tickAnim - 33) / 2) * (0-(0)));
            yy = 10.38 + (((tickAnim - 33) / 2) * (17.75-(10.38)));
            zz = 0 + (((tickAnim - 33) / 2) * (0-(0)));
        }
        else if (tickAnim >= 35 && tickAnim < 38) {
            xx = 0 + (((tickAnim - 35) / 3) * (0-(0)));
            yy = 17.75 + (((tickAnim - 35) / 3) * (-15.12-(17.75)));
            zz = 0 + (((tickAnim - 35) / 3) * (0-(0)));
        }
        else if (tickAnim >= 38 && tickAnim < 40) {
            xx = 0 + (((tickAnim - 38) / 2) * (0-(0)));
            yy = -15.12 + (((tickAnim - 38) / 2) * (-7.75-(-15.12)));
            zz = 0 + (((tickAnim - 38) / 2) * (0-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 40) / 10) * (0-(0)));
            yy = -7.75 + (((tickAnim - 40) / 10) * (0-(-7.75)));
            zz = 0 + (((tickAnim - 40) / 10) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tail5, tail5.rotateAngleX + (float) Math.toRadians(xx), tail5.rotateAngleY + (float) Math.toRadians(yy), tail5.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 0) / 10) * (-16.25-(0)));
            yy = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 20) {
            xx = -16.25 + (((tickAnim - 10) / 10) * (29.25-(-16.25)));
            yy = 0 + (((tickAnim - 10) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 10) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 30) {
            xx = 29.25 + (((tickAnim - 20) / 10) * (-16.25-(29.25)));
            yy = 0 + (((tickAnim - 20) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 10) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 40) {
            xx = -16.25 + (((tickAnim - 30) / 10) * (29.25-(-16.25)));
            yy = 0 + (((tickAnim - 30) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 30) / 10) * (0-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 50) {
            xx = 29.25 + (((tickAnim - 40) / 10) * (0-(29.25)));
            yy = 0 + (((tickAnim - 40) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 40) / 10) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftleg, leftleg.rotateAngleX + (float) Math.toRadians(xx), leftleg.rotateAngleY + (float) Math.toRadians(yy), leftleg.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 0) / 10) * (-16.5-(0)));
            yy = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 20) {
            xx = -16.5 + (((tickAnim - 10) / 10) * (8.25-(-16.5)));
            yy = 0 + (((tickAnim - 10) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 10) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 30) {
            xx = 8.25 + (((tickAnim - 20) / 10) * (-16.5-(8.25)));
            yy = 0 + (((tickAnim - 20) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 10) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 40) {
            xx = -16.5 + (((tickAnim - 30) / 10) * (8.25-(-16.5)));
            yy = 0 + (((tickAnim - 30) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 30) / 10) * (0-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 50) {
            xx = 8.25 + (((tickAnim - 40) / 10) * (0-(8.25)));
            yy = 0 + (((tickAnim - 40) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 40) / 10) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftleg2, leftleg2.rotateAngleX + (float) Math.toRadians(xx), leftleg2.rotateAngleY + (float) Math.toRadians(yy), leftleg2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 0) / 5) * (-59.75-(0)));
            yy = 0 + (((tickAnim - 0) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 5) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 10) {
            xx = -59.75 + (((tickAnim - 5) / 5) * (12.5-(-59.75)));
            yy = 0 + (((tickAnim - 5) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 5) / 5) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 20) {
            xx = 12.5 + (((tickAnim - 10) / 10) * (12.25-(12.5)));
            yy = 0 + (((tickAnim - 10) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 10) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 25) {
            xx = 12.25 + (((tickAnim - 20) / 5) * (-58.37-(12.25)));
            yy = 0 + (((tickAnim - 20) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 5) * (0-(0)));
        }
        else if (tickAnim >= 25 && tickAnim < 30) {
            xx = -58.37 + (((tickAnim - 25) / 5) * (12.5-(-58.37)));
            yy = 0 + (((tickAnim - 25) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 25) / 5) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 40) {
            xx = 12.5 + (((tickAnim - 30) / 10) * (12.25-(12.5)));
            yy = 0 + (((tickAnim - 30) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 30) / 10) * (0-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 45) {
            xx = 12.25 + (((tickAnim - 40) / 5) * (-58.37-(12.25)));
            yy = 0 + (((tickAnim - 40) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 40) / 5) * (0-(0)));
        }
        else if (tickAnim >= 45 && tickAnim < 50) {
            xx = -58.37 + (((tickAnim - 45) / 5) * (0-(-58.37)));
            yy = 0 + (((tickAnim - 45) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 45) / 5) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftleg3, leftleg3.rotateAngleX + (float) Math.toRadians(xx), leftleg3.rotateAngleY + (float) Math.toRadians(yy), leftleg3.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 0) / 5) * (100.63-(0)));
            yy = 0 + (((tickAnim - 0) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 5) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 10) {
            xx = 100.63 + (((tickAnim - 5) / 5) * (19-(100.63)));
            yy = 0 + (((tickAnim - 5) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 5) / 5) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 15) {
            xx = 19 + (((tickAnim - 10) / 5) * (-10.62-(19)));
            yy = 0 + (((tickAnim - 10) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 5) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 20) {
            xx = -10.62 + (((tickAnim - 15) / 5) * (97-(-10.62)));
            yy = 0 + (((tickAnim - 15) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 5) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 25) {
            xx = 97 + (((tickAnim - 20) / 5) * (91.38-(97)));
            yy = 0 + (((tickAnim - 20) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 5) * (0-(0)));
        }
        else if (tickAnim >= 25 && tickAnim < 30) {
            xx = 91.38 + (((tickAnim - 25) / 5) * (19-(91.38)));
            yy = 0 + (((tickAnim - 25) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 25) / 5) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 35) {
            xx = 19 + (((tickAnim - 30) / 5) * (-10.62-(19)));
            yy = 0 + (((tickAnim - 30) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 30) / 5) * (0-(0)));
        }
        else if (tickAnim >= 35 && tickAnim < 40) {
            xx = -10.62 + (((tickAnim - 35) / 5) * (97-(-10.62)));
            yy = 0 + (((tickAnim - 35) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 35) / 5) * (0-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 45) {
            xx = 97 + (((tickAnim - 40) / 5) * (91.38-(97)));
            yy = 0 + (((tickAnim - 40) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 40) / 5) * (0-(0)));
        }
        else if (tickAnim >= 45 && tickAnim < 50) {
            xx = 91.38 + (((tickAnim - 45) / 5) * (0-(91.38)));
            yy = 0 + (((tickAnim - 45) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 45) / 5) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftleg4, leftleg4.rotateAngleX + (float) Math.toRadians(xx), leftleg4.rotateAngleY + (float) Math.toRadians(yy), leftleg4.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (5.25-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 10) / 10) * (0-(0)));
            yy = 0 + (((tickAnim - 10) / 10) * (0-(0)));
            zz = 5.25 + (((tickAnim - 10) / 10) * (-2.75-(5.25)));
        }
        else if (tickAnim >= 20 && tickAnim < 30) {
            xx = 0 + (((tickAnim - 20) / 10) * (0-(0)));
            yy = 0 + (((tickAnim - 20) / 10) * (0-(0)));
            zz = -2.75 + (((tickAnim - 20) / 10) * (5.25-(-2.75)));
        }
        else if (tickAnim >= 30 && tickAnim < 40) {
            xx = 0 + (((tickAnim - 30) / 10) * (0-(0)));
            yy = 0 + (((tickAnim - 30) / 10) * (0-(0)));
            zz = 5.25 + (((tickAnim - 30) / 10) * (-2.75-(5.25)));
        }
        else if (tickAnim >= 40 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 40) / 10) * (0-(0)));
            yy = 0 + (((tickAnim - 40) / 10) * (0-(0)));
            zz = -2.75 + (((tickAnim - 40) / 10) * (0-(-2.75)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(upperbody2, upperbody2.rotateAngleX + (float) Math.toRadians(xx), upperbody2.rotateAngleY + (float) Math.toRadians(yy), upperbody2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 0) / 10) * (-0.19654-(0)));
            yy = 0 + (((tickAnim - 0) / 10) * (-3.74485-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (3.00643-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 20) {
            xx = -0.19654 + (((tickAnim - 10) / 10) * (0.06554-(-0.19654)));
            yy = -3.74485 + (((tickAnim - 10) / 10) * (-3.74943-(-3.74485)));
            zz = 3.00643 + (((tickAnim - 10) / 10) * (-1.00215-(3.00643)));
        }
        else if (tickAnim >= 20 && tickAnim < 30) {
            xx = 0.06554 + (((tickAnim - 20) / 10) * (-0.19654-(0.06554)));
            yy = -3.74943 + (((tickAnim - 20) / 10) * (-3.74485-(-3.74943)));
            zz = -1.00215 + (((tickAnim - 20) / 10) * (3.00643-(-1.00215)));
        }
        else if (tickAnim >= 30 && tickAnim < 40) {
            xx = -0.19654 + (((tickAnim - 30) / 10) * (0.06554-(-0.19654)));
            yy = -3.74485 + (((tickAnim - 30) / 10) * (-3.74943-(-3.74485)));
            zz = 3.00643 + (((tickAnim - 30) / 10) * (-1.00215-(3.00643)));
        }
        else if (tickAnim >= 40 && tickAnim < 50) {
            xx = 0.06554 + (((tickAnim - 40) / 10) * (0-(0.06554)));
            yy = -3.74943 + (((tickAnim - 40) / 10) * (0-(-3.74943)));
            zz = -1.00215 + (((tickAnim - 40) / 10) * (0-(-1.00215)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(upperbody, upperbody.rotateAngleX + (float) Math.toRadians(xx), upperbody.rotateAngleY + (float) Math.toRadians(yy), upperbody.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 0) / 10) * (15.21172-(0)));
            yy = 0 + (((tickAnim - 0) / 10) * (-10.49181-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (0.4169-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 20) {
            xx = 15.21172 + (((tickAnim - 10) / 10) * (16.77385-(15.21172)));
            yy = -10.49181 + (((tickAnim - 10) / 10) * (-10.28361-(-10.49181)));
            zz = 0.4169 + (((tickAnim - 10) / 10) * (9.81528-(0.4169)));
        }
        else if (tickAnim >= 20 && tickAnim < 30) {
            xx = 16.77385 + (((tickAnim - 20) / 10) * (15.21172-(16.77385)));
            yy = -10.28361 + (((tickAnim - 20) / 10) * (-10.49181-(-10.28361)));
            zz = 9.81528 + (((tickAnim - 20) / 10) * (0.4169-(9.81528)));
        }
        else if (tickAnim >= 30 && tickAnim < 40) {
            xx = 15.21172 + (((tickAnim - 30) / 10) * (16.77385-(15.21172)));
            yy = -10.49181 + (((tickAnim - 30) / 10) * (-10.28361-(-10.49181)));
            zz = 0.4169 + (((tickAnim - 30) / 10) * (9.81528-(0.4169)));
        }
        else if (tickAnim >= 40 && tickAnim < 50) {
            xx = 16.77385 + (((tickAnim - 40) / 10) * (0-(16.77385)));
            yy = -10.28361 + (((tickAnim - 40) / 10) * (0-(-10.28361)));
            zz = 9.81528 + (((tickAnim - 40) / 10) * (0-(9.81528)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck, neck.rotateAngleX + (float) Math.toRadians(xx), neck.rotateAngleY + (float) Math.toRadians(yy), neck.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 10) * (-14.5-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 10) / 10) * (0-(0)));
            yy = -14.5 + (((tickAnim - 10) / 10) * (-16.25-(-14.5)));
            zz = 0 + (((tickAnim - 10) / 10) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 30) {
            xx = 0 + (((tickAnim - 20) / 10) * (0-(0)));
            yy = -16.25 + (((tickAnim - 20) / 10) * (-14.5-(-16.25)));
            zz = 0 + (((tickAnim - 20) / 10) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 40) {
            xx = 0 + (((tickAnim - 30) / 10) * (0-(0)));
            yy = -14.5 + (((tickAnim - 30) / 10) * (-16.25-(-14.5)));
            zz = 0 + (((tickAnim - 30) / 10) * (0-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 40) / 10) * (0-(0)));
            yy = -16.25 + (((tickAnim - 40) / 10) * (0-(-16.25)));
            zz = 0 + (((tickAnim - 40) / 10) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(head, head.rotateAngleX + (float) Math.toRadians(xx), head.rotateAngleY + (float) Math.toRadians(yy), head.rotateAngleZ + (float) Math.toRadians(zz));

    }
    public void animLay(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime, double animTick) {
        EntityPrehistoricFloraPsittacosaurus_sinensis entity = (EntityPrehistoricFloraPsittacosaurus_sinensis) entitylivingbaseIn;
        int animCycle = 50;
        double tickAnim = animTick + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;
         if (tickAnim >= 0 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 0) / 13) * (-12.5-(0)));
            yy = 0 + (((tickAnim - 0) / 13) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 13) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 38) {
            xx = -12.5 + (((tickAnim - 13) / 25) * (-12.5-(-12.5)));
            yy = 0 + (((tickAnim - 13) / 25) * (0-(0)));
            zz = 0 + (((tickAnim - 13) / 25) * (0-(0)));
        }
        else if (tickAnim >= 38 && tickAnim < 50) {
            xx = -12.5 + (((tickAnim - 38) / 12) * (0-(-12.5)));
            yy = 0 + (((tickAnim - 38) / 12) * (0-(0)));
            zz = 0 + (((tickAnim - 38) / 12) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(body, body.rotateAngleX + (float) Math.toRadians(xx), body.rotateAngleY + (float) Math.toRadians(yy), body.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 0) / 13) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 13) * (-4.45-(0)));
            zz = 0 + (((tickAnim - 0) / 13) * (-0.2-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 38) {
            xx = 0 + (((tickAnim - 13) / 25) * (0-(0)));
            yy = -4.45 + (((tickAnim - 13) / 25) * (-4.45-(-4.45)));
            zz = -0.2 + (((tickAnim - 13) / 25) * (-0.2-(-0.2)));
        }
        else if (tickAnim >= 38 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 38) / 12) * (0-(0)));
            yy = -4.45 + (((tickAnim - 38) / 12) * (0-(-4.45)));
            zz = -0.2 + (((tickAnim - 38) / 12) * (0-(-0.2)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.body.rotationPointX = this.body.rotationPointX + (float)(xx);
        this.body.rotationPointY = this.body.rotationPointY - (float)(yy);
        this.body.rotationPointZ = this.body.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 0) / 13) * (-7.25-(0)));
            yy = 0 + (((tickAnim - 0) / 13) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 13) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 38) {
            xx = -7.25 + (((tickAnim - 13) / 25) * (-7.25-(-7.25)));
            yy = 0 + (((tickAnim - 13) / 25) * (0-(0)));
            zz = 0 + (((tickAnim - 13) / 25) * (0-(0)));
        }
        else if (tickAnim >= 38 && tickAnim < 50) {
            xx = -7.25 + (((tickAnim - 38) / 12) * (0-(-7.25)));
            yy = 0 + (((tickAnim - 38) / 12) * (0-(0)));
            zz = 0 + (((tickAnim - 38) / 12) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tail2, tail2.rotateAngleX + (float) Math.toRadians(xx), tail2.rotateAngleY + (float) Math.toRadians(yy), tail2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 0) / 13) * (-2.5-(0)));
            yy = 0 + (((tickAnim - 0) / 13) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 13) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 38) {
            xx = -2.5 + (((tickAnim - 13) / 25) * (-2.5-(-2.5)));
            yy = 0 + (((tickAnim - 13) / 25) * (0-(0)));
            zz = 0 + (((tickAnim - 13) / 25) * (0-(0)));
        }
        else if (tickAnim >= 38 && tickAnim < 50) {
            xx = -2.5 + (((tickAnim - 38) / 12) * (0-(-2.5)));
            yy = 0 + (((tickAnim - 38) / 12) * (0-(0)));
            zz = 0 + (((tickAnim - 38) / 12) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tail3, tail3.rotateAngleX + (float) Math.toRadians(xx), tail3.rotateAngleY + (float) Math.toRadians(yy), tail3.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 0) / 13) * (4.5-(0)));
            yy = 0 + (((tickAnim - 0) / 13) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 13) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 38) {
            xx = 4.5 + (((tickAnim - 13) / 25) * (4.5-(4.5)));
            yy = 0 + (((tickAnim - 13) / 25) * (0-(0)));
            zz = 0 + (((tickAnim - 13) / 25) * (0-(0)));
        }
        else if (tickAnim >= 38 && tickAnim < 42) {
            xx = 4.5 + (((tickAnim - 38) / 4) * (-16.25-(4.5)));
            yy = 0 + (((tickAnim - 38) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 38) / 4) * (0-(0)));
        }
        else if (tickAnim >= 42 && tickAnim < 45) {
            xx = -16.25 + (((tickAnim - 42) / 3) * (-16.24-(-16.25)));
            yy = 0 + (((tickAnim - 42) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 42) / 3) * (0-(0)));
        }
        else if (tickAnim >= 45 && tickAnim < 50) {
            xx = -16.24 + (((tickAnim - 45) / 5) * (0-(-16.24)));
            yy = 0 + (((tickAnim - 45) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 45) / 5) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tail4, tail4.rotateAngleX + (float) Math.toRadians(xx), tail4.rotateAngleY + (float) Math.toRadians(yy), tail4.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 0) / 13) * (18.25-(0)));
            yy = 0 + (((tickAnim - 0) / 13) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 13) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 38) {
            xx = 18.25 + (((tickAnim - 13) / 25) * (18.25-(18.25)));
            yy = 0 + (((tickAnim - 13) / 25) * (0-(0)));
            zz = 0 + (((tickAnim - 13) / 25) * (0-(0)));
        }
        else if (tickAnim >= 38 && tickAnim < 42) {
            xx = 18.25 + (((tickAnim - 38) / 4) * (14.34-(18.25)));
            yy = 0 + (((tickAnim - 38) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 38) / 4) * (0-(0)));
        }
        else if (tickAnim >= 42 && tickAnim < 45) {
            xx = 14.34 + (((tickAnim - 42) / 3) * (-37.39-(14.34)));
            yy = 0 + (((tickAnim - 42) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 42) / 3) * (0-(0)));
        }
        else if (tickAnim >= 45 && tickAnim < 50) {
            xx = -37.39 + (((tickAnim - 45) / 5) * (0-(-37.39)));
            yy = 0 + (((tickAnim - 45) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 45) / 5) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tail5, tail5.rotateAngleX + (float) Math.toRadians(xx), tail5.rotateAngleY + (float) Math.toRadians(yy), tail5.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 0) / 13) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 13) * (-13-(0)));
            zz = 0 + (((tickAnim - 0) / 13) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 38) {
            xx = 0 + (((tickAnim - 13) / 25) * (0-(0)));
            yy = -13 + (((tickAnim - 13) / 25) * (-13-(-13)));
            zz = 0 + (((tickAnim - 13) / 25) * (0-(0)));
        }
        else if (tickAnim >= 38 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 38) / 12) * (0-(0)));
            yy = -13 + (((tickAnim - 38) / 12) * (0-(-13)));
            zz = 0 + (((tickAnim - 38) / 12) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftleg, leftleg.rotateAngleX + (float) Math.toRadians(xx), leftleg.rotateAngleY + (float) Math.toRadians(yy), leftleg.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 0) / 13) * (21-(0)));
            yy = 0 + (((tickAnim - 0) / 13) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 13) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 38) {
            xx = 21 + (((tickAnim - 13) / 25) * (21-(21)));
            yy = 0 + (((tickAnim - 13) / 25) * (0-(0)));
            zz = 0 + (((tickAnim - 13) / 25) * (0-(0)));
        }
        else if (tickAnim >= 38 && tickAnim < 50) {
            xx = 21 + (((tickAnim - 38) / 12) * (0-(21)));
            yy = 0 + (((tickAnim - 38) / 12) * (0-(0)));
            zz = 0 + (((tickAnim - 38) / 12) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftleg2, leftleg2.rotateAngleX + (float) Math.toRadians(xx), leftleg2.rotateAngleY + (float) Math.toRadians(yy), leftleg2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 0) / 13) * (-90.25-(0)));
            yy = 0 + (((tickAnim - 0) / 13) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 13) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 38) {
            xx = -90.25 + (((tickAnim - 13) / 25) * (-90.25-(-90.25)));
            yy = 0 + (((tickAnim - 13) / 25) * (0-(0)));
            zz = 0 + (((tickAnim - 13) / 25) * (0-(0)));
        }
        else if (tickAnim >= 38 && tickAnim < 50) {
            xx = -90.25 + (((tickAnim - 38) / 12) * (0-(-90.25)));
            yy = 0 + (((tickAnim - 38) / 12) * (0-(0)));
            zz = 0 + (((tickAnim - 38) / 12) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftleg3, leftleg3.rotateAngleX + (float) Math.toRadians(xx), leftleg3.rotateAngleY + (float) Math.toRadians(yy), leftleg3.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 0) / 13) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 13) * (-1.05-(0)));
            zz = 0 + (((tickAnim - 0) / 13) * (-0.95-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 38) {
            xx = 0 + (((tickAnim - 13) / 25) * (0-(0)));
            yy = -1.05 + (((tickAnim - 13) / 25) * (-1.05-(-1.05)));
            zz = -0.95 + (((tickAnim - 13) / 25) * (-0.95-(-0.95)));
        }
        else if (tickAnim >= 38 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 38) / 12) * (0-(0)));
            yy = -1.05 + (((tickAnim - 38) / 12) * (0-(-1.05)));
            zz = -0.95 + (((tickAnim - 38) / 12) * (0-(-0.95)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.leftleg3.rotationPointX = this.leftleg3.rotationPointX + (float)(xx);
        this.leftleg3.rotationPointY = this.leftleg3.rotationPointY - (float)(yy);
        this.leftleg3.rotationPointZ = this.leftleg3.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 0) / 13) * (83.75-(0)));
            yy = 0 + (((tickAnim - 0) / 13) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 13) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 38) {
            xx = 83.75 + (((tickAnim - 13) / 25) * (83.75-(83.75)));
            yy = 0 + (((tickAnim - 13) / 25) * (0-(0)));
            zz = 0 + (((tickAnim - 13) / 25) * (0-(0)));
        }
        else if (tickAnim >= 38 && tickAnim < 50) {
            xx = 83.75 + (((tickAnim - 38) / 12) * (0-(83.75)));
            yy = 0 + (((tickAnim - 38) / 12) * (0-(0)));
            zz = 0 + (((tickAnim - 38) / 12) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftleg4, leftleg4.rotateAngleX + (float) Math.toRadians(xx), leftleg4.rotateAngleY + (float) Math.toRadians(yy), leftleg4.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 0) / 13) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 13) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 13) * (0.875-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 38) {
            xx = 0 + (((tickAnim - 13) / 25) * (0-(0)));
            yy = 0 + (((tickAnim - 13) / 25) * (0-(0)));
            zz = 0.875 + (((tickAnim - 13) / 25) * (0.875-(0.875)));
        }
        else if (tickAnim >= 38 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 38) / 12) * (0-(0)));
            yy = 0 + (((tickAnim - 38) / 12) * (0-(0)));
            zz = 0.875 + (((tickAnim - 38) / 12) * (0-(0.875)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.leftleg4.rotationPointX = this.leftleg4.rotationPointX + (float)(xx);
        this.leftleg4.rotationPointY = this.leftleg4.rotationPointY - (float)(yy);
        this.leftleg4.rotationPointZ = this.leftleg4.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 0) / 13) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 13) * (13-(0)));
            zz = 0 + (((tickAnim - 0) / 13) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 38) {
            xx = 0 + (((tickAnim - 13) / 25) * (0-(0)));
            yy = 13 + (((tickAnim - 13) / 25) * (13-(13)));
            zz = 0 + (((tickAnim - 13) / 25) * (0-(0)));
        }
        else if (tickAnim >= 38 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 38) / 12) * (0-(0)));
            yy = 13 + (((tickAnim - 38) / 12) * (0-(13)));
            zz = 0 + (((tickAnim - 38) / 12) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightleg, rightleg.rotateAngleX + (float) Math.toRadians(xx), rightleg.rotateAngleY + (float) Math.toRadians(yy), rightleg.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 0) / 13) * (21-(0)));
            yy = 0 + (((tickAnim - 0) / 13) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 13) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 38) {
            xx = 21 + (((tickAnim - 13) / 25) * (21-(21)));
            yy = 0 + (((tickAnim - 13) / 25) * (0-(0)));
            zz = 0 + (((tickAnim - 13) / 25) * (0-(0)));
        }
        else if (tickAnim >= 38 && tickAnim < 50) {
            xx = 21 + (((tickAnim - 38) / 12) * (0-(21)));
            yy = 0 + (((tickAnim - 38) / 12) * (0-(0)));
            zz = 0 + (((tickAnim - 38) / 12) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightleg2, rightleg2.rotateAngleX + (float) Math.toRadians(xx), rightleg2.rotateAngleY + (float) Math.toRadians(yy), rightleg2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 0) / 13) * (-90.25-(0)));
            yy = 0 + (((tickAnim - 0) / 13) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 13) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 38) {
            xx = -90.25 + (((tickAnim - 13) / 25) * (-90.25-(-90.25)));
            yy = 0 + (((tickAnim - 13) / 25) * (0-(0)));
            zz = 0 + (((tickAnim - 13) / 25) * (0-(0)));
        }
        else if (tickAnim >= 38 && tickAnim < 50) {
            xx = -90.25 + (((tickAnim - 38) / 12) * (0-(-90.25)));
            yy = 0 + (((tickAnim - 38) / 12) * (0-(0)));
            zz = 0 + (((tickAnim - 38) / 12) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightleg3, rightleg3.rotateAngleX + (float) Math.toRadians(xx), rightleg3.rotateAngleY + (float) Math.toRadians(yy), rightleg3.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 0) / 13) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 13) * (-1.05-(0)));
            zz = 0 + (((tickAnim - 0) / 13) * (-0.95-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 38) {
            xx = 0 + (((tickAnim - 13) / 25) * (0-(0)));
            yy = -1.05 + (((tickAnim - 13) / 25) * (-1.05-(-1.05)));
            zz = -0.95 + (((tickAnim - 13) / 25) * (-0.95-(-0.95)));
        }
        else if (tickAnim >= 38 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 38) / 12) * (0-(0)));
            yy = -1.05 + (((tickAnim - 38) / 12) * (0-(-1.05)));
            zz = -0.95 + (((tickAnim - 38) / 12) * (0-(-0.95)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.rightleg3.rotationPointX = this.rightleg3.rotationPointX + (float)(xx);
        this.rightleg3.rotationPointY = this.rightleg3.rotationPointY - (float)(yy);
        this.rightleg3.rotationPointZ = this.rightleg3.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 0) / 13) * (83.75-(0)));
            yy = 0 + (((tickAnim - 0) / 13) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 13) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 38) {
            xx = 83.75 + (((tickAnim - 13) / 25) * (83.75-(83.75)));
            yy = 0 + (((tickAnim - 13) / 25) * (0-(0)));
            zz = 0 + (((tickAnim - 13) / 25) * (0-(0)));
        }
        else if (tickAnim >= 38 && tickAnim < 50) {
            xx = 83.75 + (((tickAnim - 38) / 12) * (0-(83.75)));
            yy = 0 + (((tickAnim - 38) / 12) * (0-(0)));
            zz = 0 + (((tickAnim - 38) / 12) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightleg4, rightleg4.rotateAngleX + (float) Math.toRadians(xx), rightleg4.rotateAngleY + (float) Math.toRadians(yy), rightleg4.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 0) / 13) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 13) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 13) * (0.875-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 38) {
            xx = 0 + (((tickAnim - 13) / 25) * (0-(0)));
            yy = 0 + (((tickAnim - 13) / 25) * (0-(0)));
            zz = 0.875 + (((tickAnim - 13) / 25) * (0.875-(0.875)));
        }
        else if (tickAnim >= 38 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 38) / 12) * (0-(0)));
            yy = 0 + (((tickAnim - 38) / 12) * (0-(0)));
            zz = 0.875 + (((tickAnim - 38) / 12) * (0-(0.875)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.rightleg4.rotationPointX = this.rightleg4.rotationPointX + (float)(xx);
        this.rightleg4.rotationPointY = this.rightleg4.rotationPointY - (float)(yy);
        this.rightleg4.rotationPointZ = this.rightleg4.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 0) / 13) * (4.25-(0)));
            yy = 0 + (((tickAnim - 0) / 13) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 13) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 38) {
            xx = 4.25 + (((tickAnim - 13) / 25) * (4.25-(4.25)));
            yy = 0 + (((tickAnim - 13) / 25) * (0-(0)));
            zz = 0 + (((tickAnim - 13) / 25) * (0-(0)));
        }
        else if (tickAnim >= 38 && tickAnim < 50) {
            xx = 4.25 + (((tickAnim - 38) / 12) * (0-(4.25)));
            yy = 0 + (((tickAnim - 38) / 12) * (0-(0)));
            zz = 0 + (((tickAnim - 38) / 12) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(upperbody2, upperbody2.rotateAngleX + (float) Math.toRadians(xx), upperbody2.rotateAngleY + (float) Math.toRadians(yy), upperbody2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 0) / 13) * (4.5-(0)));
            yy = 0 + (((tickAnim - 0) / 13) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 13) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 38) {
            xx = 4.5 + (((tickAnim - 13) / 25) * (4.5-(4.5)));
            yy = 0 + (((tickAnim - 13) / 25) * (0-(0)));
            zz = 0 + (((tickAnim - 13) / 25) * (0-(0)));
        }
        else if (tickAnim >= 38 && tickAnim < 50) {
            xx = 4.5 + (((tickAnim - 38) / 12) * (0-(4.5)));
            yy = 0 + (((tickAnim - 38) / 12) * (0-(0)));
            zz = 0 + (((tickAnim - 38) / 12) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(upperbody, upperbody.rotateAngleX + (float) Math.toRadians(xx), upperbody.rotateAngleY + (float) Math.toRadians(yy), upperbody.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 0) / 13) * (-10.22657-(0)));
            yy = 0 + (((tickAnim - 0) / 13) * (-6.47448-(0)));
            zz = 0 + (((tickAnim - 0) / 13) * (12.22274-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 38) {
            xx = -10.22657 + (((tickAnim - 13) / 25) * (-10.22657-(-10.22657)));
            yy = -6.47448 + (((tickAnim - 13) / 25) * (-6.47448-(-6.47448)));
            zz = 12.22274 + (((tickAnim - 13) / 25) * (12.22274-(12.22274)));
        }
        else if (tickAnim >= 38 && tickAnim < 50) {
            xx = -10.22657 + (((tickAnim - 38) / 12) * (0-(-10.22657)));
            yy = -6.47448 + (((tickAnim - 38) / 12) * (0-(-6.47448)));
            zz = 12.22274 + (((tickAnim - 38) / 12) * (0-(12.22274)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftarm2, leftarm2.rotateAngleX + (float) Math.toRadians(xx), leftarm2.rotateAngleY + (float) Math.toRadians(yy), leftarm2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 0) / 13) * (-10.22657-(0)));
            yy = 0 + (((tickAnim - 0) / 13) * (6.4745-(0)));
            zz = 0 + (((tickAnim - 0) / 13) * (-12.2227-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 38) {
            xx = -10.22657 + (((tickAnim - 13) / 25) * (-10.22657-(-10.22657)));
            yy = 6.4745 + (((tickAnim - 13) / 25) * (6.4745-(6.4745)));
            zz = -12.2227 + (((tickAnim - 13) / 25) * (-12.2227-(-12.2227)));
        }
        else if (tickAnim >= 38 && tickAnim < 50) {
            xx = -10.22657 + (((tickAnim - 38) / 12) * (0-(-10.22657)));
            yy = 6.4745 + (((tickAnim - 38) / 12) * (0-(6.4745)));
            zz = -12.2227 + (((tickAnim - 38) / 12) * (0-(-12.2227)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightarm2, rightarm2.rotateAngleX + (float) Math.toRadians(xx), rightarm2.rotateAngleY + (float) Math.toRadians(yy), rightarm2.rotateAngleZ + (float) Math.toRadians(zz));

    }
    public void animEat(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime, double animTick) {
        EntityPrehistoricFloraPsittacosaurus_sinensis entity = (EntityPrehistoricFloraPsittacosaurus_sinensis) entitylivingbaseIn;
        int animCycle = 20;
        double tickAnim = animTick + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;
         if (tickAnim >= 0 && tickAnim < 7) {
            xx = 0 + (((tickAnim - 0) / 7) * (11.25-(0)));
            yy = 0 + (((tickAnim - 0) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 7) * (0-(0)));
        }
        else if (tickAnim >= 7 && tickAnim < 14) {
            xx = 11.25 + (((tickAnim - 7) / 7) * (0-(11.25)));
            yy = 0 + (((tickAnim - 7) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 7) / 7) * (0-(0)));
        }
        else if (tickAnim >= 14 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 14) / 6) * (0-(0)));
            yy = 0 + (((tickAnim - 14) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 14) / 6) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(upperbody2, upperbody2.rotateAngleX + (float) Math.toRadians(xx), upperbody2.rotateAngleY + (float) Math.toRadians(yy), upperbody2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 7) {
            xx = 0 + (((tickAnim - 0) / 7) * (7.5-(0)));
            yy = 0 + (((tickAnim - 0) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 7) * (0-(0)));
        }
        else if (tickAnim >= 7 && tickAnim < 20) {
            xx = 7.5 + (((tickAnim - 7) / 13) * (0-(7.5)));
            yy = 0 + (((tickAnim - 7) / 13) * (0-(0)));
            zz = 0 + (((tickAnim - 7) / 13) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(upperbody, upperbody.rotateAngleX + (float) Math.toRadians(xx), upperbody.rotateAngleY + (float) Math.toRadians(yy), upperbody.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 7) {
            xx = 0 + (((tickAnim - 0) / 7) * (13.75-(0)));
            yy = 0 + (((tickAnim - 0) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 7) * (0-(0)));
        }
        else if (tickAnim >= 7 && tickAnim < 8) {
            xx = 13.75 + (((tickAnim - 7) / 1) * (17.53-(13.75)));
            yy = 0 + (((tickAnim - 7) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 7) / 1) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 14) {
            xx = 17.53 + (((tickAnim - 8) / 6) * (0-(17.53)));
            yy = 0 + (((tickAnim - 8) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 6) * (0-(0)));
        }
        else if (tickAnim >= 14 && tickAnim < 18) {
            xx = 0 + (((tickAnim - 14) / 4) * (0-(0)));
            yy = 0 + (((tickAnim - 14) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 14) / 4) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 18) / 2) * (0-(0)));
            yy = 0 + (((tickAnim - 18) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 18) / 2) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck, neck.rotateAngleX + (float) Math.toRadians(xx), neck.rotateAngleY + (float) Math.toRadians(yy), neck.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 0 + (((tickAnim - 0) / 3) * (26.06-(0)));
            yy = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 3) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 7) {
            xx = 26.06 + (((tickAnim - 3) / 4) * (11.5-(26.06)));
            yy = 0 + (((tickAnim - 3) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 3) / 4) * (0-(0)));
        }
        else if (tickAnim >= 7 && tickAnim < 8) {
            xx = 11.5 + (((tickAnim - 7) / 1) * (-4.69-(11.5)));
            yy = 0 + (((tickAnim - 7) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 7) / 1) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 12) {
            xx = -4.69 + (((tickAnim - 8) / 4) * (3.28-(-4.69)));
            yy = 0 + (((tickAnim - 8) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 4) * (0-(0)));
        }
        else if (tickAnim >= 12 && tickAnim < 14) {
            xx = 3.28 + (((tickAnim - 12) / 2) * (-10-(3.28)));
            yy = 0 + (((tickAnim - 12) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 12) / 2) * (0-(0)));
        }
        else if (tickAnim >= 14 && tickAnim < 18) {
            xx = -10 + (((tickAnim - 14) / 4) * (0-(-10)));
            yy = 0 + (((tickAnim - 14) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 14) / 4) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 18) / 2) * (0-(0)));
            yy = 0 + (((tickAnim - 18) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 18) / 2) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(head, head.rotateAngleX + (float) Math.toRadians(xx), head.rotateAngleY + (float) Math.toRadians(yy), head.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 3) * (-0.175-(0)));
            zz = 0 + (((tickAnim - 0) / 3) * (-0.15-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 3) / 17) * (0-(0)));
            yy = -0.175 + (((tickAnim - 3) / 17) * (0-(-0.175)));
            zz = -0.15 + (((tickAnim - 3) / 17) * (0-(-0.15)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.head.rotationPointX = this.head.rotationPointX + (float)(xx);
        this.head.rotationPointY = this.head.rotationPointY - (float)(yy);
        this.head.rotationPointZ = this.head.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 3) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 7) {
            xx = 0 + (((tickAnim - 3) / 4) * (28-(0)));
            yy = 0 + (((tickAnim - 3) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 3) / 4) * (0-(0)));
        }
        else if (tickAnim >= 7 && tickAnim < 8) {
            xx = 28 + (((tickAnim - 7) / 1) * (0-(28)));
            yy = 0 + (((tickAnim - 7) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 7) / 1) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 12) {
            xx = 0 + (((tickAnim - 8) / 4) * (0-(0)));
            yy = 0 + (((tickAnim - 8) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 4) * (0-(0)));
        }
        else if (tickAnim >= 12 && tickAnim < 14) {
            xx = 0 + (((tickAnim - 12) / 2) * (15.75-(0)));
            yy = 0 + (((tickAnim - 12) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 12) / 2) * (0-(0)));
        }
        else if (tickAnim >= 14 && tickAnim < 18) {
            xx = 15.75 + (((tickAnim - 14) / 4) * (0-(15.75)));
            yy = 0 + (((tickAnim - 14) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 14) / 4) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 18) / 2) * (0-(0)));
            yy = 0 + (((tickAnim - 18) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 18) / 2) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(jaw, jaw.rotateAngleX + (float) Math.toRadians(xx), jaw.rotateAngleY + (float) Math.toRadians(yy), jaw.rotateAngleZ + (float) Math.toRadians(zz));



        this.setRotateAngle(leftarm, leftarm.rotateAngleX + (float) Math.toRadians(0), leftarm.rotateAngleY + (float) Math.toRadians(0), leftarm.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(leftarm2, leftarm2.rotateAngleX + (float) Math.toRadians(0), leftarm2.rotateAngleY + (float) Math.toRadians(0), leftarm2.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(rightarm, rightarm.rotateAngleX + (float) Math.toRadians(0), rightarm.rotateAngleY + (float) Math.toRadians(0), rightarm.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(rightarm2, rightarm2.rotateAngleX + (float) Math.toRadians(0), rightarm2.rotateAngleY + (float) Math.toRadians(0), rightarm2.rotateAngleZ + (float) Math.toRadians(0));



        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 1 + (((tickAnim - 0) / 3) * (1-(1)));
            yy = 1 + (((tickAnim - 0) / 3) * (0.0075-(1)));
            zz = 1 + (((tickAnim - 0) / 3) * (1-(1)));
        }
        else if (tickAnim >= 3 && tickAnim < 8) {
            xx = 1 + (((tickAnim - 3) / 5) * (1-(1)));
            yy = 0.0075 + (((tickAnim - 3) / 5) * (1-(0.0075)));
            zz = 1 + (((tickAnim - 3) / 5) * (1-(1)));
        }
        else {
            xx = 1;
            yy = 1;
            zz = 1;
        }
        this.eye.setScale((float)xx, (float)yy, (float)zz);

    }
    public void animWalking(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime) {
        EntityPrehistoricFloraPsittacosaurus_sinensis entity = (EntityPrehistoricFloraPsittacosaurus_sinensis) entitylivingbaseIn;
        int animCycle = 20;
        double tickAnim = (entity.ticksExisted + entity.getTickOffset()) - (int) (Math.floor((double) (entity.ticksExisted + entity.getTickOffset()) / (double) animCycle) * (double) animCycle) + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;
        this.setRotateAngle(body, body.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/0.5+40))*1.3), body.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360-20))*2), body.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360+20))*3));
        this.body.rotationPointX = this.body.rotationPointX + (float)(0);
        this.body.rotationPointY = this.body.rotationPointY - (float)(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/0.5))*-0.15);
        this.body.rotationPointZ = this.body.rotationPointZ + (float)(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/0.5))*0.12);


        this.setRotateAngle(tail2, tail2.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/0.5+40))*0.1), tail2.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360-90))*2), tail2.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360+20))*3));


        this.setRotateAngle(tail3, tail3.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/0.5+40))*0.1), tail3.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360-140))*3), tail3.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360+20))*3));


        this.setRotateAngle(tail4, tail4.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/0.5+40))*0.1), tail4.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360-200))*12), tail4.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360+20))*3));


        this.setRotateAngle(tail5, tail5.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/0.5+40))*0.1), tail5.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360-220))*12), tail5.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360+20))*3));



        if (tickAnim >= 0 && tickAnim < 3) {
            xx = -16.7923 + (((tickAnim - 0) / 3) * (-14-(-16.7923)));
            yy = -3.48269 + (((tickAnim - 0) / 3) * (0-(-3.48269)));
            zz = 1.3913 + (((tickAnim - 0) / 3) * (0-(1.3913)));
        }
        else if (tickAnim >= 3 && tickAnim < 13) {
            xx = -14 + (((tickAnim - 3) / 10) * (19-(-14)));
            yy = 0 + (((tickAnim - 3) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 3) / 10) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 20) {
            xx = 19 + (((tickAnim - 13) / 7) * (-16.7923-(19)));
            yy = 0 + (((tickAnim - 13) / 7) * (-3.48269-(0)));
            zz = 0 + (((tickAnim - 13) / 7) * (1.3913-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftleg, leftleg.rotateAngleX + (float) Math.toRadians(xx), leftleg.rotateAngleY + (float) Math.toRadians(yy), leftleg.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 3) {
            xx = -9.5 + (((tickAnim - 0) / 3) * (-17.25-(-9.5)));
            yy = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 3) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 13) {
            xx = -17.25 + (((tickAnim - 3) / 10) * (22.5-(-17.25)));
            yy = 0 + (((tickAnim - 3) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 3) / 10) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 20) {
            xx = 22.5 + (((tickAnim - 13) / 7) * (-9.5-(22.5)));
            yy = 0 + (((tickAnim - 13) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 13) / 7) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftleg2, leftleg2.rotateAngleX + (float) Math.toRadians(xx), leftleg2.rotateAngleY + (float) Math.toRadians(yy), leftleg2.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 3) * (-0.175-(0)));
            zz = 0 + (((tickAnim - 0) / 3) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 7) {
            xx = 0 + (((tickAnim - 3) / 4) * (0-(0)));
            yy = -0.175 + (((tickAnim - 3) / 4) * (-0.205-(-0.175)));
            zz = 0 + (((tickAnim - 3) / 4) * (0.125-(0)));
        }
        else if (tickAnim >= 7 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 7) / 6) * (0-(0)));
            yy = -0.205 + (((tickAnim - 7) / 6) * (-0.675-(-0.205)));
            zz = 0.125 + (((tickAnim - 7) / 6) * (0.06-(0.125)));
        }
        else if (tickAnim >= 13 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 13) / 7) * (0-(0)));
            yy = -0.675 + (((tickAnim - 13) / 7) * (0-(-0.675)));
            zz = 0.06 + (((tickAnim - 13) / 7) * (0-(0.06)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.leftleg2.rotationPointX = this.leftleg2.rotationPointX + (float)(xx);
        this.leftleg2.rotationPointY = this.leftleg2.rotationPointY - (float)(yy);
        this.leftleg2.rotationPointZ = this.leftleg2.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 3) {
            xx = -36 + (((tickAnim - 0) / 3) * (-16.5-(-36)));
            yy = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 3) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 13) {
            xx = -16.5 + (((tickAnim - 3) / 10) * (-8.75-(-16.5)));
            yy = 0 + (((tickAnim - 3) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 3) / 10) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 18) {
            xx = -8.75 + (((tickAnim - 13) / 5) * (-53.25-(-8.75)));
            yy = 0 + (((tickAnim - 13) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 13) / 5) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 20) {
            xx = -53.25 + (((tickAnim - 18) / 2) * (-36-(-53.25)));
            yy = 0 + (((tickAnim - 18) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 18) / 2) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftleg3, leftleg3.rotateAngleX + (float) Math.toRadians(xx), leftleg3.rotateAngleY + (float) Math.toRadians(yy), leftleg3.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 3) * (-0.475-(0)));
            zz = 0 + (((tickAnim - 0) / 3) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 7) {
            xx = 0 + (((tickAnim - 3) / 4) * (0-(0)));
            yy = -0.475 + (((tickAnim - 3) / 4) * (-0.69-(-0.475)));
            zz = 0 + (((tickAnim - 3) / 4) * (0-(0)));
        }
        else if (tickAnim >= 7 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 7) / 6) * (0-(0)));
            yy = -0.69 + (((tickAnim - 7) / 6) * (0-(-0.69)));
            zz = 0 + (((tickAnim - 7) / 6) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 13) / 7) * (0-(0)));
            yy = 0 + (((tickAnim - 13) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 13) / 7) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.leftleg3.rotationPointX = this.leftleg3.rotationPointX + (float)(xx);
        this.leftleg3.rotationPointY = this.leftleg3.rotationPointY - (float)(yy);
        this.leftleg3.rotationPointZ = this.leftleg3.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 93.75 + (((tickAnim - 0) / 3) * (48.25-(93.75)));
            yy = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 3) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 5) {
            xx = 48.25 + (((tickAnim - 3) / 2) * (28.47-(48.25)));
            yy = 0 + (((tickAnim - 3) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 3) / 2) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 7) {
            xx = 28.47 + (((tickAnim - 5) / 2) * (17.43119-(28.47)));
            yy = 0 + (((tickAnim - 5) / 2) * (-1.92601-(0)));
            zz = 0 + (((tickAnim - 5) / 2) * (-4.46508-(0)));
        }
        else if (tickAnim >= 7 && tickAnim < 13) {
            xx = 17.43119 + (((tickAnim - 7) / 6) * (89.75-(17.43119)));
            yy = -1.92601 + (((tickAnim - 7) / 6) * (0-(-1.92601)));
            zz = -4.46508 + (((tickAnim - 7) / 6) * (0-(-4.46508)));
        }
        else if (tickAnim >= 13 && tickAnim < 17) {
            xx = 89.75 + (((tickAnim - 13) / 4) * (100-(89.75)));
            yy = 0 + (((tickAnim - 13) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 13) / 4) * (0-(0)));
        }
        else if (tickAnim >= 17 && tickAnim < 20) {
            xx = 100 + (((tickAnim - 17) / 3) * (93.75-(100)));
            yy = 0 + (((tickAnim - 17) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 17) / 3) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftleg4, leftleg4.rotateAngleX + (float) Math.toRadians(xx), leftleg4.rotateAngleY + (float) Math.toRadians(yy), leftleg4.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            yy = 0.575 + (((tickAnim - 0) / 3) * (0.575-(0.575)));
            zz = 0.15 + (((tickAnim - 0) / 3) * (0.495-(0.15)));
        }
        else if (tickAnim >= 3 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 3) / 2) * (0-(0)));
            yy = 0.575 + (((tickAnim - 3) / 2) * (0.775-(0.575)));
            zz = 0.495 + (((tickAnim - 3) / 2) * (0.31-(0.495)));
        }
        else if (tickAnim >= 5 && tickAnim < 7) {
            xx = 0 + (((tickAnim - 5) / 2) * (0-(0)));
            yy = 0.775 + (((tickAnim - 5) / 2) * (0.64-(0.775)));
            zz = 0.31 + (((tickAnim - 5) / 2) * (0.305-(0.31)));
        }
        else if (tickAnim >= 7 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 7) / 6) * (0-(0)));
            yy = 0.64 + (((tickAnim - 7) / 6) * (0-(0.64)));
            zz = 0.305 + (((tickAnim - 7) / 6) * (0-(0.305)));
        }
        else if (tickAnim >= 13 && tickAnim < 17) {
            xx = 0 + (((tickAnim - 13) / 4) * (0-(0)));
            yy = 0 + (((tickAnim - 13) / 4) * (0.775-(0)));
            zz = 0 + (((tickAnim - 13) / 4) * (0.145-(0)));
        }
        else if (tickAnim >= 17 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 17) / 3) * (0-(0)));
            yy = 0.775 + (((tickAnim - 17) / 3) * (0.575-(0.775)));
            zz = 0.145 + (((tickAnim - 17) / 3) * (0.15-(0.145)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.leftleg4.rotationPointX = this.leftleg4.rotationPointX + (float)(xx);
        this.leftleg4.rotationPointY = this.leftleg4.rotationPointY - (float)(yy);
        this.leftleg4.rotationPointZ = this.leftleg4.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 4) {
            xx = 14.25 + (((tickAnim - 0) / 4) * (19-(14.25)));
            yy = 0 + (((tickAnim - 0) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 4) * (0-(0)));
        }
        else if (tickAnim >= 4 && tickAnim < 13) {
            xx = 19 + (((tickAnim - 4) / 9) * (-17.25-(19)));
            yy = 0 + (((tickAnim - 4) / 9) * (0-(0)));
            zz = 0 + (((tickAnim - 4) / 9) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 20) {
            xx = -17.25 + (((tickAnim - 13) / 7) * (14.25-(-17.25)));
            yy = 0 + (((tickAnim - 13) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 13) / 7) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightleg, rightleg.rotateAngleX + (float) Math.toRadians(xx), rightleg.rotateAngleY + (float) Math.toRadians(yy), rightleg.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 4) {
            xx = -10 + (((tickAnim - 0) / 4) * (22.5-(-10)));
            yy = 0 + (((tickAnim - 0) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 4) * (0-(0)));
        }
        else if (tickAnim >= 4 && tickAnim < 13) {
            xx = 22.5 + (((tickAnim - 4) / 9) * (-17.25-(22.5)));
            yy = 0 + (((tickAnim - 4) / 9) * (0-(0)));
            zz = 0 + (((tickAnim - 4) / 9) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 20) {
            xx = -17.25 + (((tickAnim - 13) / 7) * (-10-(-17.25)));
            yy = 0 + (((tickAnim - 13) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 13) / 7) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightleg2, rightleg2.rotateAngleX + (float) Math.toRadians(xx), rightleg2.rotateAngleY + (float) Math.toRadians(yy), rightleg2.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 4) {
            xx = 0 + (((tickAnim - 0) / 4) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 4) * (-0.675-(0)));
            zz = 0 + (((tickAnim - 0) / 4) * (0.06-(0)));
        }
        else if (tickAnim >= 4 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 4) / 9) * (0-(0)));
            yy = -0.675 + (((tickAnim - 4) / 9) * (-0.175-(-0.675)));
            zz = 0.06 + (((tickAnim - 4) / 9) * (0-(0.06)));
        }
        else if (tickAnim >= 13 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 13) / 7) * (0-(0)));
            yy = -0.175 + (((tickAnim - 13) / 7) * (0-(-0.175)));
            zz = 0 + (((tickAnim - 13) / 7) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.rightleg2.rotationPointX = this.rightleg2.rotationPointX + (float)(xx);
        this.rightleg2.rotationPointY = this.rightleg2.rotationPointY - (float)(yy);
        this.rightleg2.rotationPointZ = this.rightleg2.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 4) {
            xx = -8.75 + (((tickAnim - 0) / 4) * (-8.75-(-8.75)));
            yy = 0 + (((tickAnim - 0) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 4) * (0-(0)));
        }
        else if (tickAnim >= 4 && tickAnim < 7) {
            xx = -8.75 + (((tickAnim - 4) / 3) * (-45.12-(-8.75)));
            yy = 0 + (((tickAnim - 4) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 4) / 3) * (0-(0)));
        }
        else if (tickAnim >= 7 && tickAnim < 9) {
            xx = -45.12 + (((tickAnim - 7) / 2) * (-67.62-(-45.12)));
            yy = 0 + (((tickAnim - 7) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 7) / 2) * (0-(0)));
        }
        else if (tickAnim >= 9 && tickAnim < 13) {
            xx = -67.62 + (((tickAnim - 9) / 4) * (-11.5-(-67.62)));
            yy = 0 + (((tickAnim - 9) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 9) / 4) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 20) {
            xx = -11.5 + (((tickAnim - 13) / 7) * (-8.75-(-11.5)));
            yy = 0 + (((tickAnim - 13) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 13) / 7) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightleg3, rightleg3.rotateAngleX + (float) Math.toRadians(xx), rightleg3.rotateAngleY + (float) Math.toRadians(yy), rightleg3.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 4) {
            xx = 0 + (((tickAnim - 0) / 4) * (0-(0)));
            yy = 0.075 + (((tickAnim - 0) / 4) * (0-(0.075)));
            zz = 0.325 + (((tickAnim - 0) / 4) * (0-(0.325)));
        }
        else if (tickAnim >= 4 && tickAnim < 7) {
            xx = 0 + (((tickAnim - 4) / 3) * (0-(0)));
            yy = 0 + (((tickAnim - 4) / 3) * (0.2-(0)));
            zz = 0 + (((tickAnim - 4) / 3) * (0-(0)));
        }
        else if (tickAnim >= 7 && tickAnim < 9) {
            xx = 0 + (((tickAnim - 7) / 2) * (0-(0)));
            yy = 0.2 + (((tickAnim - 7) / 2) * (-0.675-(0.2)));
            zz = 0 + (((tickAnim - 7) / 2) * (0-(0)));
        }
        else if (tickAnim >= 9 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 9) / 4) * (0-(0)));
            yy = -0.675 + (((tickAnim - 9) / 4) * (-0.425-(-0.675)));
            zz = 0 + (((tickAnim - 9) / 4) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 13) / 7) * (0-(0)));
            yy = -0.425 + (((tickAnim - 13) / 7) * (0.075-(-0.425)));
            zz = 0 + (((tickAnim - 13) / 7) * (0.325-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.rightleg3.rotationPointX = this.rightleg3.rotationPointX + (float)(xx);
        this.rightleg3.rotationPointY = this.rightleg3.rotationPointY - (float)(yy);
        this.rightleg3.rotationPointZ = this.rightleg3.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 4) {
            xx = 6.25 + (((tickAnim - 0) / 4) * (89.75-(6.25)));
            yy = 0 + (((tickAnim - 0) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 4) * (0-(0)));
        }
        else if (tickAnim >= 4 && tickAnim < 9) {
            xx = 89.75 + (((tickAnim - 4) / 5) * (102.8-(89.75)));
            yy = 0 + (((tickAnim - 4) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 4) / 5) * (0-(0)));
        }
        else if (tickAnim >= 9 && tickAnim < 13) {
            xx = 102.8 + (((tickAnim - 9) / 4) * (48.25-(102.8)));
            yy = 0 + (((tickAnim - 9) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 9) / 4) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 15) {
            xx = 48.25 + (((tickAnim - 13) / 2) * (32.58-(48.25)));
            yy = 0 + (((tickAnim - 13) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 13) / 2) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 20) {
            xx = 32.58 + (((tickAnim - 15) / 5) * (6.25-(32.58)));
            yy = 0 + (((tickAnim - 15) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 5) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightleg4, rightleg4.rotateAngleX + (float) Math.toRadians(xx), rightleg4.rotateAngleY + (float) Math.toRadians(yy), rightleg4.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 4) {
            xx = 0 + (((tickAnim - 0) / 4) * (0-(0)));
            yy = 0.125 + (((tickAnim - 0) / 4) * (0-(0.125)));
            zz = 0 + (((tickAnim - 0) / 4) * (0-(0)));
        }
        else if (tickAnim >= 4 && tickAnim < 9) {
            xx = 0 + (((tickAnim - 4) / 5) * (0-(0)));
            yy = 0 + (((tickAnim - 4) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 4) / 5) * (0-(0)));
        }
        else if (tickAnim >= 9 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 9) / 4) * (0-(0)));
            yy = 0 + (((tickAnim - 9) / 4) * (0.575-(0)));
            zz = 0 + (((tickAnim - 9) / 4) * (0.495-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 13) / 2) * (0-(0)));
            yy = 0.575 + (((tickAnim - 13) / 2) * (0.605-(0.575)));
            zz = 0.495 + (((tickAnim - 13) / 2) * (0.33-(0.495)));
        }
        else if (tickAnim >= 15 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 15) / 5) * (0-(0)));
            yy = 0.605 + (((tickAnim - 15) / 5) * (0.125-(0.605)));
            zz = 0.33 + (((tickAnim - 15) / 5) * (0-(0.33)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.rightleg4.rotationPointX = this.rightleg4.rotationPointX + (float)(xx);
        this.rightleg4.rotationPointY = this.rightleg4.rotationPointY - (float)(yy);
        this.rightleg4.rotationPointZ = this.rightleg4.rotationPointZ + (float)(zz);



        this.setRotateAngle(upperbody2, upperbody2.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/0.5+150))*-1), upperbody2.rotateAngleY + (float) Math.toRadians(0), upperbody2.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360+140))*3.8));


        this.setRotateAngle(upperbody, upperbody.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/0.5-50))*-2.8), upperbody.rotateAngleY + (float) Math.toRadians(0), upperbody.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360-120))*2));


        this.setRotateAngle(neck, neck.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/0.5-120))*2.8), neck.rotateAngleY + (float) Math.toRadians(0), neck.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360-120))*2));


        this.setRotateAngle(head, head.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/0.5-320))*2.8), head.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360-30))*-1), head.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360-340))*1));


        this.setRotateAngle(leftarm, leftarm.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/0.5-50))*-2.8), leftarm.rotateAngleY + (float) Math.toRadians(0), leftarm.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360-120))*2));


        this.setRotateAngle(leftarm2, leftarm2.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/0.5-180))*-4), leftarm2.rotateAngleY + (float) Math.toRadians(0), leftarm2.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360-120))*2));


        this.setRotateAngle(rightarm, rightarm.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/0.5-50))*-2.8), rightarm.rotateAngleY + (float) Math.toRadians(0), rightarm.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360-120))*2));


        this.setRotateAngle(rightarm2, rightarm2.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/0.5-180))*-4), rightarm2.rotateAngleY + (float) Math.toRadians(0), rightarm2.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360-120))*2));

    }
    public void animRunning(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime) {
        EntityPrehistoricFloraPsittacosaurus_sinensis entity = (EntityPrehistoricFloraPsittacosaurus_sinensis) entitylivingbaseIn;
        int animCycle = 10;
        double tickAnim = (entity.ticksExisted + entity.getTickOffset()) - (int) (Math.floor((double) (entity.ticksExisted + entity.getTickOffset()) / (double) animCycle) * (double) animCycle) + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;
        this.setRotateAngle(body, body.rotateAngleX + (float) Math.toRadians(-0.5+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*720/0.5+30))*2), body.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*720-30))*8), body.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*720+30))*3.5));
        this.body.rotationPointX = this.body.rotationPointX + (float)(0);
        this.body.rotationPointY = this.body.rotationPointY - (float)(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*720/0.5))*-0.3);
        this.body.rotationPointZ = this.body.rotationPointZ + (float)(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*720/0.5))*0.3);


        this.setRotateAngle(tail2, tail2.rotateAngleX + (float) Math.toRadians(-0.5+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*720/0.5+30))*-1), tail2.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*720-50))*-8), tail2.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*720+50))*3.5));


        this.setRotateAngle(tail3, tail3.rotateAngleX + (float) Math.toRadians(-0.5+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*720/0.5))*-3), tail3.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*720-100))*-10), tail3.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*720+30))*3.5));


        this.setRotateAngle(tail4, tail4.rotateAngleX + (float) Math.toRadians(-0.5+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*720/0.5+50))*-5), tail4.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*720-200))*-12), tail4.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*720+30))*3.5));


        this.setRotateAngle(tail5, tail5.rotateAngleX + (float) Math.toRadians(-0.5+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*720/0.5+80))*-8), tail5.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*720-230))*-16), tail5.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*720+30))*3.5));



        if (tickAnim >= 0 && tickAnim < 6) {
            xx = -21.75 + (((tickAnim - 0) / 6) * (32.25-(-21.75)));
            yy = 0 + (((tickAnim - 0) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 6) * (0-(0)));
        }
        else if (tickAnim >= 6 && tickAnim < 7) {
            xx = 32.25 + (((tickAnim - 6) / 1) * (32.25-(32.25)));
            yy = 0 + (((tickAnim - 6) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 6) / 1) * (0-(0)));
        }
        else if (tickAnim >= 7 && tickAnim < 8) {
            xx = 32.25 + (((tickAnim - 7) / 1) * (-11.41847-(32.25)));
            yy = 0 + (((tickAnim - 7) / 1) * (-5.75702-(0)));
            zz = 0 + (((tickAnim - 7) / 1) * (1.69305-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 10) {
            xx = -11.41847 + (((tickAnim - 8) / 2) * (-21.75-(-11.41847)));
            yy = -5.75702 + (((tickAnim - 8) / 2) * (0-(-5.75702)));
            zz = 1.69305 + (((tickAnim - 8) / 2) * (0-(1.69305)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftleg, leftleg.rotateAngleX + (float) Math.toRadians(xx), leftleg.rotateAngleY + (float) Math.toRadians(yy), leftleg.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 6) {
            xx = -9.25 + (((tickAnim - 0) / 6) * (8.25-(-9.25)));
            yy = 0 + (((tickAnim - 0) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 6) * (0-(0)));
        }
        else if (tickAnim >= 6 && tickAnim < 10) {
            xx = 8.25 + (((tickAnim - 6) / 4) * (-9.25-(8.25)));
            yy = 0 + (((tickAnim - 6) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 6) / 4) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftleg2, leftleg2.rotateAngleX + (float) Math.toRadians(xx), leftleg2.rotateAngleY + (float) Math.toRadians(yy), leftleg2.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            yy = -0.175 + (((tickAnim - 0) / 10) * (-0.175-(-0.175)));
            zz = 0 + (((tickAnim - 0) / 10) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.leftleg2.rotationPointX = this.leftleg2.rotationPointX + (float)(xx);
        this.leftleg2.rotationPointY = this.leftleg2.rotationPointY - (float)(yy);
        this.leftleg2.rotationPointZ = this.leftleg2.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 6) {
            xx = -4.5 + (((tickAnim - 0) / 6) * (8.75-(-4.5)));
            yy = 0 + (((tickAnim - 0) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 6) * (0-(0)));
        }
        else if (tickAnim >= 6 && tickAnim < 7) {
            xx = 8.75 + (((tickAnim - 6) / 1) * (-24.31-(8.75)));
            yy = 0 + (((tickAnim - 6) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 6) / 1) * (0-(0)));
        }
        else if (tickAnim >= 7 && tickAnim < 8) {
            xx = -24.31 + (((tickAnim - 7) / 1) * (-62.37-(-24.31)));
            yy = 0 + (((tickAnim - 7) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 7) / 1) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 8) {
            xx = -62.37 + (((tickAnim - 8) / 0) * (-62.37-(-62.37)));
            yy = 0 + (((tickAnim - 8) / 0) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 0) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 10) {
            xx = -62.37 + (((tickAnim - 8) / 2) * (-4.5-(-62.37)));
            yy = 0 + (((tickAnim - 8) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 2) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftleg3, leftleg3.rotateAngleX + (float) Math.toRadians(xx), leftleg3.rotateAngleY + (float) Math.toRadians(yy), leftleg3.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            yy = -0.55 + (((tickAnim - 0) / 3) * (-0.67-(-0.55)));
            zz = 0 + (((tickAnim - 0) / 3) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 6) {
            xx = 0 + (((tickAnim - 3) / 3) * (0-(0)));
            yy = -0.67 + (((tickAnim - 3) / 3) * (0-(-0.67)));
            zz = 0 + (((tickAnim - 3) / 3) * (0-(0)));
        }
        else if (tickAnim >= 6 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 6) / 4) * (0-(0)));
            yy = 0 + (((tickAnim - 6) / 4) * (-0.55-(0)));
            zz = 0 + (((tickAnim - 6) / 4) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.leftleg3.rotationPointX = this.leftleg3.rotationPointX + (float)(xx);
        this.leftleg3.rotationPointY = this.leftleg3.rotationPointY - (float)(yy);
        this.leftleg3.rotationPointZ = this.leftleg3.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 2) {
            xx = 34.5 + (((tickAnim - 0) / 2) * (21.75-(34.5)));
            yy = 0 + (((tickAnim - 0) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 2) * (0-(0)));
        }
        else if (tickAnim >= 2 && tickAnim < 3) {
            xx = 21.75 + (((tickAnim - 2) / 1) * (10-(21.75)));
            yy = 0 + (((tickAnim - 2) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 2) / 1) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 6) {
            xx = 10 + (((tickAnim - 3) / 3) * (107.25-(10)));
            yy = 0 + (((tickAnim - 3) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 3) / 3) * (0-(0)));
        }
        else if (tickAnim >= 6 && tickAnim < 7) {
            xx = 107.25 + (((tickAnim - 6) / 1) * (119.19-(107.25)));
            yy = 0 + (((tickAnim - 6) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 6) / 1) * (0-(0)));
        }
        else if (tickAnim >= 7 && tickAnim < 8) {
            xx = 119.19 + (((tickAnim - 7) / 1) * (97.13-(119.19)));
            yy = 0 + (((tickAnim - 7) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 7) / 1) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 8) {
            xx = 97.13 + (((tickAnim - 8) / 0) * (102.38-(97.13)));
            yy = 0 + (((tickAnim - 8) / 0) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 0) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 10) {
            xx = 102.38 + (((tickAnim - 8) / 2) * (34.5-(102.38)));
            yy = 0 + (((tickAnim - 8) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 2) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftleg4, leftleg4.rotateAngleX + (float) Math.toRadians(xx), leftleg4.rotateAngleY + (float) Math.toRadians(yy), leftleg4.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 1) {
            xx = 0 + (((tickAnim - 0) / 1) * (0-(0)));
            yy = -0.2 + (((tickAnim - 0) / 1) * (1.035-(-0.2)));
            zz = 0.495 + (((tickAnim - 0) / 1) * (0.25-(0.495)));
        }
        else if (tickAnim >= 1 && tickAnim < 2) {
            xx = 0 + (((tickAnim - 1) / 1) * (0-(0)));
            yy = 1.035 + (((tickAnim - 1) / 1) * (1.25-(1.035)));
            zz = 0.25 + (((tickAnim - 1) / 1) * (0-(0.25)));
        }
        else if (tickAnim >= 2 && tickAnim < 3) {
            xx = 0 + (((tickAnim - 2) / 1) * (0-(0)));
            yy = 1.25 + (((tickAnim - 2) / 1) * (0.795-(1.25)));
            zz = 0 + (((tickAnim - 2) / 1) * (0.2-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 6) {
            xx = 0 + (((tickAnim - 3) / 3) * (0-(0)));
            yy = 0.795 + (((tickAnim - 3) / 3) * (0-(0.795)));
            zz = 0.2 + (((tickAnim - 3) / 3) * (0-(0.2)));
        }
        else if (tickAnim >= 6 && tickAnim < 7) {
            xx = 0 + (((tickAnim - 6) / 1) * (0-(0)));
            yy = 0 + (((tickAnim - 6) / 1) * (-0.425-(0)));
            zz = 0 + (((tickAnim - 6) / 1) * (0.2-(0)));
        }
        else if (tickAnim >= 7 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 7) / 1) * (0-(0)));
            yy = -0.425 + (((tickAnim - 7) / 1) * (0-(-0.425)));
            zz = 0.2 + (((tickAnim - 7) / 1) * (0-(0.2)));
        }
        else if (tickAnim >= 8 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 8) / 0) * (0-(0)));
            yy = 0 + (((tickAnim - 8) / 0) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 0) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 8) / 2) * (0-(0)));
            yy = 0 + (((tickAnim - 8) / 2) * (-0.2-(0)));
            zz = 0 + (((tickAnim - 8) / 2) * (0.495-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.leftleg4.rotationPointX = this.leftleg4.rotationPointX + (float)(xx);
        this.leftleg4.rotationPointY = this.leftleg4.rotationPointY - (float)(yy);
        this.leftleg4.rotationPointZ = this.leftleg4.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 4) {
            xx = 32.25 + (((tickAnim - 0) / 4) * (-15.19567-(32.25)));
            yy = 0 + (((tickAnim - 0) / 4) * (4.69401-(0)));
            zz = 0 + (((tickAnim - 0) / 4) * (-1.72421-(0)));
        }
        else if (tickAnim >= 4 && tickAnim < 6) {
            xx = -15.19567 + (((tickAnim - 4) / 2) * (-22.25-(-15.19567)));
            yy = 4.69401 + (((tickAnim - 4) / 2) * (0-(4.69401)));
            zz = -1.72421 + (((tickAnim - 4) / 2) * (0-(-1.72421)));
        }
        else if (tickAnim >= 6 && tickAnim < 10) {
            xx = -22.25 + (((tickAnim - 6) / 4) * (32.25-(-22.25)));
            yy = 0 + (((tickAnim - 6) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 6) / 4) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightleg, rightleg.rotateAngleX + (float) Math.toRadians(xx), rightleg.rotateAngleY + (float) Math.toRadians(yy), rightleg.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 6) {
            xx = 8.25 + (((tickAnim - 0) / 6) * (-9.25-(8.25)));
            yy = 0 + (((tickAnim - 0) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 6) * (0-(0)));
        }
        else if (tickAnim >= 6 && tickAnim < 10) {
            xx = -9.25 + (((tickAnim - 6) / 4) * (8.25-(-9.25)));
            yy = 0 + (((tickAnim - 6) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 6) / 4) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightleg2, rightleg2.rotateAngleX + (float) Math.toRadians(xx), rightleg2.rotateAngleY + (float) Math.toRadians(yy), rightleg2.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 6) {
            xx = 0 + (((tickAnim - 0) / 6) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 6) * (-0.175-(0)));
            zz = 0 + (((tickAnim - 0) / 6) * (0-(0)));
        }
        else if (tickAnim >= 6 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 6) / 4) * (0-(0)));
            yy = -0.175 + (((tickAnim - 6) / 4) * (0-(-0.175)));
            zz = 0 + (((tickAnim - 6) / 4) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.rightleg2.rotationPointX = this.rightleg2.rotationPointX + (float)(xx);
        this.rightleg2.rotationPointY = this.rightleg2.rotationPointY - (float)(yy);
        this.rightleg2.rotationPointZ = this.rightleg2.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 8.75 + (((tickAnim - 0) / 3) * (-60.72-(8.75)));
            yy = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 3) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 3) {
            xx = -60.72 + (((tickAnim - 3) / 0) * (-60.72-(-60.72)));
            yy = 0 + (((tickAnim - 3) / 0) * (0-(0)));
            zz = 0 + (((tickAnim - 3) / 0) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 6) {
            xx = -60.72 + (((tickAnim - 3) / 3) * (-4.5-(-60.72)));
            yy = 0 + (((tickAnim - 3) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 3) / 3) * (0-(0)));
        }
        else if (tickAnim >= 6 && tickAnim < 10) {
            xx = -4.5 + (((tickAnim - 6) / 4) * (8.75-(-4.5)));
            yy = 0 + (((tickAnim - 6) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 6) / 4) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightleg3, rightleg3.rotateAngleX + (float) Math.toRadians(xx), rightleg3.rotateAngleY + (float) Math.toRadians(yy), rightleg3.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 6) {
            xx = 0 + (((tickAnim - 0) / 6) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 6) * (-0.55-(0)));
            zz = 0 + (((tickAnim - 0) / 6) * (0-(0)));
        }
        else if (tickAnim >= 6 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 6) / 2) * (0-(0)));
            yy = -0.55 + (((tickAnim - 6) / 2) * (-0.57-(-0.55)));
            zz = 0 + (((tickAnim - 6) / 2) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 8) / 2) * (0-(0)));
            yy = -0.57 + (((tickAnim - 8) / 2) * (0-(-0.57)));
            zz = 0 + (((tickAnim - 8) / 2) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.rightleg3.rotationPointX = this.rightleg3.rotationPointX + (float)(xx);
        this.rightleg3.rotationPointY = this.rightleg3.rotationPointY - (float)(yy);
        this.rightleg3.rotationPointZ = this.rightleg3.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 1) {
            xx = 111.5 + (((tickAnim - 0) / 1) * (121.17-(111.5)));
            yy = 0 + (((tickAnim - 0) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 1) * (0-(0)));
        }
        else if (tickAnim >= 1 && tickAnim < 3) {
            xx = 121.17 + (((tickAnim - 1) / 2) * (76.75-(121.17)));
            yy = 0 + (((tickAnim - 1) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 1) / 2) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 3) {
            xx = 76.75 + (((tickAnim - 3) / 0) * (76.75-(76.75)));
            yy = 0 + (((tickAnim - 3) / 0) * (0-(0)));
            zz = 0 + (((tickAnim - 3) / 0) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 6) {
            xx = 76.75 + (((tickAnim - 3) / 3) * (37-(76.75)));
            yy = 0 + (((tickAnim - 3) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 3) / 3) * (0-(0)));
        }
        else if (tickAnim >= 6 && tickAnim < 8) {
            xx = 37 + (((tickAnim - 6) / 2) * (11.25-(37)));
            yy = 0 + (((tickAnim - 6) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 6) / 2) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 10) {
            xx = 11.25 + (((tickAnim - 8) / 2) * (111.5-(11.25)));
            yy = 0 + (((tickAnim - 8) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 2) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightleg4, rightleg4.rotateAngleX + (float) Math.toRadians(xx), rightleg4.rotateAngleY + (float) Math.toRadians(yy), rightleg4.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 3) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 3) {
            xx = 0 + (((tickAnim - 3) / 0) * (0-(0)));
            yy = 0 + (((tickAnim - 3) / 0) * (0-(0)));
            zz = 0 + (((tickAnim - 3) / 0) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 6) {
            xx = 0 + (((tickAnim - 3) / 3) * (0-(0)));
            yy = 0 + (((tickAnim - 3) / 3) * (0.45-(0)));
            zz = 0 + (((tickAnim - 3) / 3) * (0.495-(0)));
        }
        else if (tickAnim >= 6 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 6) / 2) * (0-(0)));
            yy = 0.45 + (((tickAnim - 6) / 2) * (0.645-(0.45)));
            zz = 0.495 + (((tickAnim - 6) / 2) * (0.2-(0.495)));
        }
        else if (tickAnim >= 8 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 8) / 2) * (0-(0)));
            yy = 0.645 + (((tickAnim - 8) / 2) * (0-(0.645)));
            zz = 0.2 + (((tickAnim - 8) / 2) * (0-(0.2)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.rightleg4.rotationPointX = this.rightleg4.rotationPointX + (float)(xx);
        this.rightleg4.rotationPointY = this.rightleg4.rotationPointY - (float)(yy);
        this.rightleg4.rotationPointZ = this.rightleg4.rotationPointZ + (float)(zz);



        this.setRotateAngle(upperbody2, upperbody2.rotateAngleX + (float) Math.toRadians(1+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*720/0.5+160))*2), upperbody2.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*720+60))*4), upperbody2.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*720+140))*4));


        this.setRotateAngle(upperbody, upperbody.rotateAngleX + (float) Math.toRadians(1+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*720/0.5-40))*3), upperbody.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*720+120))*3), upperbody.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*720-120))*4));


        this.setRotateAngle(neck, neck.rotateAngleX + (float) Math.toRadians(8+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*720/0.5-30))*-5), neck.rotateAngleY + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*720+170))*3), neck.rotateAngleZ + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*720-120))*4));


        this.setRotateAngle(head, head.rotateAngleX + (float) Math.toRadians(-10.75+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*720/0.5-100))*4), head.rotateAngleY + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*720+290))*-5), head.rotateAngleZ + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*720-120))*-4));


        this.setRotateAngle(leftarm, leftarm.rotateAngleX + (float) Math.toRadians(1+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*720/0.5-60))*-5), leftarm.rotateAngleY + (float) Math.toRadians(0), leftarm.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*720-120))*4));


        this.setRotateAngle(leftarm2, leftarm2.rotateAngleX + (float) Math.toRadians(1+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*720/0.5-60))*7), leftarm2.rotateAngleY + (float) Math.toRadians(0), leftarm2.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*720-120))*4));


        this.setRotateAngle(rightarm, rightarm.rotateAngleX + (float) Math.toRadians(1+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*720/0.5-60))*-5), rightarm.rotateAngleY + (float) Math.toRadians(0), rightarm.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*720-120))*4));


        this.setRotateAngle(rightarm2, rightarm2.rotateAngleX + (float) Math.toRadians(1+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*720/0.5-60))*7), rightarm2.rotateAngleY + (float) Math.toRadians(0), rightarm2.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*720-120))*4));

    }


        public void animate(IAnimatedEntity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        EntityPrehistoricFloraPsittacosaurus_sinensis e = (EntityPrehistoricFloraPsittacosaurus_sinensis) entity;
        animator.update(entity);


    }
}
