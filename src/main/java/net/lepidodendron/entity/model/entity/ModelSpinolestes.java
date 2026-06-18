package net.lepidodendron.entity.model.entity;

import net.ilexiconn.llibrary.client.model.ModelAnimator;
import net.ilexiconn.llibrary.client.model.tools.AdvancedModelRenderer;
import net.ilexiconn.llibrary.server.animation.IAnimatedEntity;
import net.lepidodendron.entity.EntityPrehistoricFloraSpinolestes;
import net.lepidodendron.entity.model.ModelBasePalaeopedia;
import net.minecraft.client.model.ModelBox;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;

public class ModelSpinolestes extends ModelBasePalaeopedia {
    private final AdvancedModelRenderer hips;
    private final AdvancedModelRenderer cube_r1;
    private final AdvancedModelRenderer legright;
    private final AdvancedModelRenderer legright2;
    private final AdvancedModelRenderer legright3;
    private final AdvancedModelRenderer legleft;
    private final AdvancedModelRenderer legleft2;
    private final AdvancedModelRenderer legleft3;
    private final AdvancedModelRenderer tail;
    private final AdvancedModelRenderer tail2;
    private final AdvancedModelRenderer tail3;
    private final AdvancedModelRenderer body;
    private final AdvancedModelRenderer chest;
    private final AdvancedModelRenderer armright;
    private final AdvancedModelRenderer armright2;
    private final AdvancedModelRenderer armright3;
    private final AdvancedModelRenderer armleft;
    private final AdvancedModelRenderer armleft2;
    private final AdvancedModelRenderer armleft3;
    private final AdvancedModelRenderer neck;
    private final AdvancedModelRenderer head;
    private final AdvancedModelRenderer cube_r2;
    private final AdvancedModelRenderer cube_r3;
    private final AdvancedModelRenderer cube_r4;
    private final AdvancedModelRenderer cube_r5;
    private final AdvancedModelRenderer cube_r6;
    private final AdvancedModelRenderer cube_r7;
    private final AdvancedModelRenderer cube_r8;
    private final AdvancedModelRenderer earright;
    private final AdvancedModelRenderer earleft;
    private final AdvancedModelRenderer jaw;
    private final AdvancedModelRenderer cube_r9;
    private final AdvancedModelRenderer cube_r10;
    private final AdvancedModelRenderer cube_r11;
    private final AdvancedModelRenderer cube_r12;
    private final AdvancedModelRenderer eyes;
    private final AdvancedModelRenderer cube_r13;
    private final AdvancedModelRenderer cube_r14;
    private final AdvancedModelRenderer fur;
    private final AdvancedModelRenderer cube_r15;
    private final AdvancedModelRenderer fur2;
    private final AdvancedModelRenderer cube_r16;
    private final AdvancedModelRenderer fur3;
    private final AdvancedModelRenderer cube_r17;
    private final AdvancedModelRenderer fur4;
    private final AdvancedModelRenderer cube_r18;
    private final AdvancedModelRenderer fur5;
    private final AdvancedModelRenderer cube_r19;
    private final AdvancedModelRenderer fur6;
    private final AdvancedModelRenderer cube_r20;
    private final AdvancedModelRenderer fur7;
    private final AdvancedModelRenderer cube_r21;
    private final AdvancedModelRenderer fur8;
    private final AdvancedModelRenderer cube_r22;

    private ModelAnimator animator;

    public ModelSpinolestes() {
        this.textureWidth = 52;
        this.textureHeight = 52;

        this.hips = new AdvancedModelRenderer(this);
        this.hips.setRotationPoint(0.0F, 18.0F, 6.0F);


        this.cube_r1 = new AdvancedModelRenderer(this);
        this.cube_r1.setRotationPoint(0.0F, 4.6288F, 2.492F);
        this.hips.addChild(cube_r1);
        this.setRotateAngle(cube_r1, -0.3927F, 0.0F, 0.0F);
        this.cube_r1.cubeList.add(new ModelBox(cube_r1, 0, 0, -2.5F, -4.15F, -5.0F, 5, 4, 7, 0.0F, false));

        this.legright = new AdvancedModelRenderer(this);
        this.legright.setRotationPoint(-2.0F, 1.8288F, 4.167F);
        this.hips.addChild(legright);
        this.setRotateAngle(legright, 0.2182F, 0.3054F, 0.0F);
        this.legright.cubeList.add(new ModelBox(legright, 20, 30, -1.5F, -0.75F, -4.0F, 3, 3, 4, 0.0F, false));

        this.legright2 = new AdvancedModelRenderer(this);
        this.legright2.setRotationPoint(0.0F, -0.2F, -3.25F);
        this.legright.addChild(legright2);
        this.setRotateAngle(legright2, -0.1745F, 0.0F, 0.0F);
        this.legright2.cubeList.add(new ModelBox(legright2, 22, 42, -1.0F, 0.0F, -0.8F, 2, 3, 2, 0.0F, false));

        this.legright3 = new AdvancedModelRenderer(this);
        this.legright3.setRotationPoint(0.0F, 3.0F, 0.0F);
        this.legright2.addChild(legright3);
        this.setRotateAngle(legright3, -0.0436F, 0.0F, 0.0F);
        this.legright3.cubeList.add(new ModelBox(legright3, 16, 37, -1.5F, -0.25F, -3.0F, 3, 1, 4, 0.0F, false));

        this.legleft = new AdvancedModelRenderer(this);
        this.legleft.setRotationPoint(2.0F, 1.8288F, 4.167F);
        this.hips.addChild(legleft);
        this.setRotateAngle(legleft, 0.2182F, -0.3054F, 0.0F);
        this.legleft.cubeList.add(new ModelBox(legleft, 20, 30, -1.5F, -0.75F, -4.0F, 3, 3, 4, 0.0F, true));

        this.legleft2 = new AdvancedModelRenderer(this);
        this.legleft2.setRotationPoint(0.0F, -0.2F, -3.25F);
        this.legleft.addChild(legleft2);
        this.setRotateAngle(legleft2, -0.1745F, 0.0F, 0.0F);
        this.legleft2.cubeList.add(new ModelBox(legleft2, 22, 42, -1.0F, 0.0F, -0.8F, 2, 3, 2, 0.0F, true));

        this.legleft3 = new AdvancedModelRenderer(this);
        this.legleft3.setRotationPoint(0.0F, 3.0F, 0.0F);
        this.legleft2.addChild(legleft3);
        this.setRotateAngle(legleft3, -0.0436F, 0.0F, 0.0F);
        this.legleft3.cubeList.add(new ModelBox(legleft3, 16, 37, -1.5F, -0.25F, -3.0F, 3, 1, 4, 0.0F, true));

        this.tail = new AdvancedModelRenderer(this);
        this.tail.setRotationPoint(0.0F, 2.4788F, 5.292F);
        this.hips.addChild(tail);
        this.setRotateAngle(tail, -0.4363F, 0.0F, 0.0F);
        this.tail.cubeList.add(new ModelBox(tail, 20, 22, -1.0F, -1.0F, -0.5F, 2, 2, 6, 0.01F, false));

        this.tail2 = new AdvancedModelRenderer(this);
        this.tail2.setRotationPoint(0.0F, -0.25F, 5.5F);
        this.tail.addChild(tail2);
        this.setRotateAngle(tail2, 0.3054F, 0.0F, 0.0F);
        this.tail2.cubeList.add(new ModelBox(tail2, 24, 0, -1.0F, -0.15F, -0.5F, 2, 1, 6, 0.0F, false));
        this.tail2.cubeList.add(new ModelBox(tail2, 24, 7, -1.0F, -0.65F, -0.5F, 2, 1, 6, -0.01F, false));

        this.tail3 = new AdvancedModelRenderer(this);
        this.tail3.setRotationPoint(0.0F, 0.0F, 5.5F);
        this.tail2.addChild(tail3);
        this.setRotateAngle(tail3, 0.0873F, 0.0F, 0.0F);
        this.tail3.cubeList.add(new ModelBox(tail3, 24, 14, -0.5F, -0.5F, -0.5F, 1, 1, 6, 0.0F, false));

        this.body = new AdvancedModelRenderer(this);
        this.body.setRotationPoint(0.0F, -1.1712F, -0.208F);
        this.hips.addChild(body);
        this.body.cubeList.add(new ModelBox(body, 0, 11, -3.0F, 0.0332F, -5.9307F, 6, 5, 6, 0.0F, false));

        this.chest = new AdvancedModelRenderer(this);
        this.chest.setRotationPoint(0.0F, 1.0332F, -5.9307F);
        this.body.addChild(chest);
        this.setRotateAngle(chest, 0.3054F, 0.0F, 0.0F);
        this.chest.cubeList.add(new ModelBox(chest, 0, 22, -2.5F, -0.75F, -4.0F, 5, 4, 5, -0.01F, false));

        this.armright = new AdvancedModelRenderer(this);
        this.armright.setRotationPoint(-2.15F, 1.75F, -3.425F);
        this.chest.addChild(armright);
        this.setRotateAngle(armright, -0.48F, -0.3491F, 0.1745F);
        this.armright.cubeList.add(new ModelBox(armright, 38, 14, -0.9381F, -0.9022F, -0.1444F, 2, 2, 4, 0.0F, false));

        this.armright2 = new AdvancedModelRenderer(this);
        this.armright2.setRotationPoint(0.0619F, 0.0978F, 2.8806F);
        this.armright.addChild(armright2);
        this.setRotateAngle(armright2, -0.2618F, 0.0F, 0.0F);
        this.armright2.cubeList.add(new ModelBox(armright2, 30, 44, -1.0F, 0.0F, -1.0F, 2, 3, 2, -0.01F, false));

        this.armright3 = new AdvancedModelRenderer(this);
        this.armright3.setRotationPoint(0.0F, 2.85F, 0.0F);
        this.armright2.addChild(armright3);
        this.setRotateAngle(armright3, 0.3927F, 0.3054F, 0.0873F);
        this.armright3.cubeList.add(new ModelBox(armright3, 40, 4, -1.5F, -0.5F, -2.5F, 3, 1, 3, 0.0F, false));

        this.armleft = new AdvancedModelRenderer(this);
        this.armleft.setRotationPoint(2.0F, 1.75F, -3.65F);
        this.chest.addChild(armleft);
        this.setRotateAngle(armleft, -0.48F, 0.3491F, -0.1745F);
        this.armleft.cubeList.add(new ModelBox(armleft, 38, 14, -1.0F, -1.0F, 0.1F, 2, 2, 4, 0.0F, true));

        this.armleft2 = new AdvancedModelRenderer(this);
        this.armleft2.setRotationPoint(0.0F, 0.0F, 3.125F);
        this.armleft.addChild(armleft2);
        this.setRotateAngle(armleft2, -0.2618F, 0.0F, 0.0F);
        this.armleft2.cubeList.add(new ModelBox(armleft2, 30, 44, -1.0F, 0.0F, -1.0F, 2, 3, 2, -0.01F, true));

        this.armleft3 = new AdvancedModelRenderer(this);
        this.armleft3.setRotationPoint(0.0F, 2.85F, 0.0F);
        this.armleft2.addChild(armleft3);
        this.setRotateAngle(armleft3, 0.3927F, -0.3054F, -0.0873F);
        this.armleft3.cubeList.add(new ModelBox(armleft3, 40, 4, -1.5F, -0.5F, -2.5F, 3, 1, 3, 0.0F, true));

        this.neck = new AdvancedModelRenderer(this);
        this.neck.setRotationPoint(0.0F, 0.75F, -4.0F);
        this.chest.addChild(neck);
        this.setRotateAngle(neck, -0.0873F, 0.0F, 0.0F);
        this.neck.cubeList.add(new ModelBox(neck, 30, 38, -1.5F, -1.5F, -2.2F, 3, 3, 3, 0.0F, false));

        this.head = new AdvancedModelRenderer(this);
        this.head.setRotationPoint(0.0F, -0.025F, -1.8F);
        this.neck.addChild(head);
        this.setRotateAngle(head, 0.0873F, 0.0F, 0.0F);
        this.head.cubeList.add(new ModelBox(head, 40, 0, -2.0F, -1.5F, -1.8F, 4, 2, 2, 0.01F, false));

        this.cube_r2 = new AdvancedModelRenderer(this);
        this.cube_r2.setRotationPoint(-0.25F, -0.725F, -1.55F);
        this.head.addChild(cube_r2);
        this.setRotateAngle(cube_r2, 0.2618F, 0.0F, 0.0F);
        this.cube_r2.cubeList.add(new ModelBox(cube_r2, 40, 12, 1.0F, -1.0F, -3.0F, 0, 1, 1, 0.0F, true));
        this.cube_r2.cubeList.add(new ModelBox(cube_r2, 40, 12, -0.5F, -1.0F, -3.0F, 0, 1, 1, 0.0F, false));

        this.cube_r3 = new AdvancedModelRenderer(this);
        this.cube_r3.setRotationPoint(-0.25F, 0.525F, -0.85F);
        this.head.addChild(cube_r3);
        this.setRotateAngle(cube_r3, -0.1309F, 0.0F, 0.0F);
        this.cube_r3.cubeList.add(new ModelBox(cube_r3, 42, 12, 1.0F, -1.0F, -3.0F, 0, 1, 1, 0.0F, true));
        this.cube_r3.cubeList.add(new ModelBox(cube_r3, 42, 12, -0.5F, -1.0F, -3.0F, 0, 1, 1, 0.0F, false));

        this.cube_r4 = new AdvancedModelRenderer(this);
        this.cube_r4.setRotationPoint(2.0F, -1.475F, -1.8F);
        this.head.addChild(cube_r4);
        this.setRotateAngle(cube_r4, 0.0785F, 0.7854F, 0.0F);
        this.cube_r4.cubeList.add(new ModelBox(cube_r4, 6, 45, -0.975F, 0.425F, -2.025F, 1, 1, 2, 0.0F, true));
        this.cube_r4.cubeList.add(new ModelBox(cube_r4, 0, 45, -0.975F, 0.0F, -2.025F, 1, 1, 2, 0.01F, true));

        this.cube_r5 = new AdvancedModelRenderer(this);
        this.cube_r5.setRotationPoint(-2.0F, -1.475F, -1.8F);
        this.head.addChild(cube_r5);
        this.setRotateAngle(cube_r5, 0.0785F, -0.7854F, 0.0F);
        this.cube_r5.cubeList.add(new ModelBox(cube_r5, 6, 45, -0.025F, 0.425F, -2.025F, 1, 1, 2, 0.0F, false));
        this.cube_r5.cubeList.add(new ModelBox(cube_r5, 0, 45, -0.025F, 0.0F, -2.025F, 1, 1, 2, 0.01F, false));

        this.cube_r6 = new AdvancedModelRenderer(this);
        this.cube_r6.setRotationPoint(0.0F, -0.725F, -2.4F);
        this.head.addChild(cube_r6);
        this.setRotateAngle(cube_r6, -0.2618F, 0.0F, 0.0F);
        this.cube_r6.cubeList.add(new ModelBox(cube_r6, 42, 38, -1.0F, 0.0F, -2.0F, 2, 1, 3, 0.01F, false));

        this.cube_r7 = new AdvancedModelRenderer(this);
        this.cube_r7.setRotationPoint(0.0F, -1.275F, -3.975F);
        this.head.addChild(cube_r7);
        this.setRotateAngle(cube_r7, -0.1745F, 0.0F, 0.0F);
        this.cube_r7.cubeList.add(new ModelBox(cube_r7, 16, 35, -0.5F, 0.0F, -1.0F, 1, 1, 1, 0.0F, false));

        this.cube_r8 = new AdvancedModelRenderer(this);
        this.cube_r8.setRotationPoint(0.0F, -1.4F, -2.8F);
        this.head.addChild(cube_r8);
        this.setRotateAngle(cube_r8, 0.0873F, 0.0F, 0.0F);
        this.cube_r8.cubeList.add(new ModelBox(cube_r8, 12, 42, -1.0F, 0.0F, -2.0F, 2, 1, 3, 0.0F, false));

        this.earright = new AdvancedModelRenderer(this);
        this.earright.setRotationPoint(-2.0F, -1.0F, 0.2F);
        this.head.addChild(earright);
        this.setRotateAngle(earright, 0.3054F, -0.6109F, 0.0F);
        this.earright.cubeList.add(new ModelBox(earright, 16, 31, 0.0F, -0.7F, -0.45F, 0, 2, 2, 0.0F, false));
        this.earright.cubeList.add(new ModelBox(earright, 38, 44, -0.025F, -0.7F, -0.45F, 0, 2, 2, 0.0F, false));

        this.earleft = new AdvancedModelRenderer(this);
        this.earleft.setRotationPoint(2.0F, -1.0F, 0.2F);
        this.head.addChild(earleft);
        this.setRotateAngle(earleft, 0.3054F, 0.6109F, 0.0F);
        this.earleft.cubeList.add(new ModelBox(earleft, 16, 31, 0.0F, -0.7F, -0.45F, 0, 2, 2, 0.0F, true));
        this.earleft.cubeList.add(new ModelBox(earleft, 38, 44, 0.025F, -0.7F, -0.45F, 0, 2, 2, 0.0F, true));

        this.jaw = new AdvancedModelRenderer(this);
        this.jaw.setRotationPoint(0.0F, 0.0F, -0.55F);
        this.head.addChild(jaw);
        this.jaw.cubeList.add(new ModelBox(jaw, 0, 42, -2.0F, 0.0F, -1.25F, 4, 1, 2, 0.0F, false));

        this.cube_r9 = new AdvancedModelRenderer(this);
        this.cube_r9.setRotationPoint(-0.25F, 1.175F, -1.3F);
        this.jaw.addChild(cube_r9);
        this.setRotateAngle(cube_r9, -0.3491F, 0.0F, 0.0F);
        this.cube_r9.cubeList.add(new ModelBox(cube_r9, 14, 39, 1.0F, -1.0F, -3.0F, 0, 1, 1, 0.0F, true));
        this.cube_r9.cubeList.add(new ModelBox(cube_r9, 14, 39, -0.5F, -1.0F, -3.0F, 0, 1, 1, 0.0F, false));

        this.cube_r10 = new AdvancedModelRenderer(this);
        this.cube_r10.setRotationPoint(-0.25F, 1.475F, -0.2F);
        this.jaw.addChild(cube_r10);
        this.setRotateAngle(cube_r10, -0.3491F, 0.0F, 0.0F);
        this.cube_r10.cubeList.add(new ModelBox(cube_r10, 44, 12, 1.0F, -1.0F, -3.0F, 0, 1, 1, 0.0F, true));
        this.cube_r10.cubeList.add(new ModelBox(cube_r10, 44, 12, -0.5F, -1.0F, -3.0F, 0, 1, 1, 0.0F, false));

        this.cube_r11 = new AdvancedModelRenderer(this);
        this.cube_r11.setRotationPoint(-0.025F, 0.0F, -1.25F);
        this.jaw.addChild(cube_r11);
        this.setRotateAngle(cube_r11, -0.2182F, 0.0F, 0.0F);
        this.cube_r11.cubeList.add(new ModelBox(cube_r11, 12, 46, 1.0F, -1.0F, -1.0F, 0, 1, 1, 0.0F, true));
        this.cube_r11.cubeList.add(new ModelBox(cube_r11, 12, 46, -0.95F, -1.0F, -1.0F, 0, 1, 1, 0.0F, false));

        this.cube_r12 = new AdvancedModelRenderer(this);
        this.cube_r12.setRotationPoint(0.0F, 1.0F, -1.25F);
        this.jaw.addChild(cube_r12);
        this.setRotateAngle(cube_r12, -0.2182F, 0.0F, 0.0F);
        this.cube_r12.cubeList.add(new ModelBox(cube_r12, 42, 42, -1.0F, -1.0F, -3.0F, 2, 1, 3, -0.01F, false));

        this.eyes = new AdvancedModelRenderer(this);
        this.eyes.setRotationPoint(0.0F, -0.9526F, -1.8457F);
        this.head.addChild(eyes);


        this.cube_r13 = new AdvancedModelRenderer(this);
        this.cube_r13.setRotationPoint(1.3345F, 0.0F, 0.0F);
        this.eyes.addChild(cube_r13);
        this.setRotateAngle(cube_r13, 0.0392F, 0.7683F, -0.0269F);
        this.cube_r13.cubeList.add(new ModelBox(cube_r13, 0, 48, -0.5F, -0.5F, -0.5F, 1, 1, 1, 0.0F, true));

        this.cube_r14 = new AdvancedModelRenderer(this);
        this.cube_r14.setRotationPoint(-1.3345F, 0.0F, 0.0F);
        this.eyes.addChild(cube_r14);
        this.setRotateAngle(cube_r14, 0.0392F, -0.7683F, 0.0269F);
        this.cube_r14.cubeList.add(new ModelBox(cube_r14, 0, 48, -0.5F, -0.5F, -0.5F, 1, 1, 1, 0.0F, false));

        this.fur = new AdvancedModelRenderer(this);
        this.fur.setRotationPoint(0.0F, -1.5312F, -1.7128F);
        this.neck.addChild(fur);


        this.cube_r15 = new AdvancedModelRenderer(this);
        this.cube_r15.setRotationPoint(0.0F, 1.5312F, 2.4128F);
        this.fur.addChild(cube_r15);
        this.setRotateAngle(cube_r15, 0.2182F, 0.0F, 0.0F);
        this.cube_r15.cubeList.add(new ModelBox(cube_r15, 40, 8, -1.5F, -2.0F, -2.0F, 3, 1, 3, 0.01F, false));

        this.fur2 = new AdvancedModelRenderer(this);
        this.fur2.setRotationPoint(0.0F, -0.7151F, -3.0535F);
        this.chest.addChild(fur2);


        this.cube_r16 = new AdvancedModelRenderer(this);
        this.cube_r16.setRotationPoint(0.0F, 1.0651F, 4.3536F);
        this.fur2.addChild(cube_r16);
        this.setRotateAngle(cube_r16, 0.2182F, 0.0F, 0.0F);
        this.cube_r16.cubeList.add(new ModelBox(cube_r16, 0, 39, -2.5F, -2.0F, -4.0F, 5, 1, 2, 0.01F, false));

        this.fur3 = new AdvancedModelRenderer(this);
        this.fur3.setRotationPoint(0.0F, -0.7734F, -1.7654F);
        this.chest.addChild(fur3);


        this.cube_r17 = new AdvancedModelRenderer(this);
        this.cube_r17.setRotationPoint(0.0F, 1.1234F, 4.2654F);
        this.fur3.addChild(cube_r17);
        this.setRotateAngle(cube_r17, 0.2182F, 0.0F, 0.0F);
        this.cube_r17.cubeList.add(new ModelBox(cube_r17, 0, 31, -2.5F, -2.0F, -4.0F, 5, 1, 3, 0.0F, false));

        this.fur4 = new AdvancedModelRenderer(this);
        this.fur4.setRotationPoint(0.0F, 0.0279F, -5.2024F);
        this.body.addChild(fur4);


        this.cube_r18 = new AdvancedModelRenderer(this);
        this.cube_r18.setRotationPoint(0.0F, 0.0053F, 0.0217F);
        this.fur4.addChild(cube_r18);
        this.setRotateAngle(cube_r18, 0.2618F, 0.0F, 0.0F);
        this.cube_r18.cubeList.add(new ModelBox(cube_r18, 34, 30, -2.5F, 0.0F, 0.0F, 5, 1, 3, 0.02F, false));

        this.fur5 = new AdvancedModelRenderer(this);
        this.fur5.setRotationPoint(0.0F, 0.0279F, -2.7024F);
        this.body.addChild(fur5);


        this.cube_r19 = new AdvancedModelRenderer(this);
        this.cube_r19.setRotationPoint(0.0F, 0.0053F, 0.0217F);
        this.fur5.addChild(cube_r19);
        this.setRotateAngle(cube_r19, 0.2618F, 0.0F, 0.0F);
        this.cube_r19.cubeList.add(new ModelBox(cube_r19, 34, 34, -2.5F, 0.0F, 0.0F, 5, 1, 3, 0.01F, false));

        this.fur6 = new AdvancedModelRenderer(this);
        this.fur6.setRotationPoint(0.0F, -0.9204F, -0.3455F);
        this.hips.addChild(fur6);


        this.cube_r20 = new AdvancedModelRenderer(this);
        this.cube_r20.setRotationPoint(0.0F, 4.2992F, 4.8375F);
        this.fur6.addChild(cube_r20);
        this.setRotateAngle(cube_r20, -0.0436F, 0.0F, 0.0F);
        this.cube_r20.cubeList.add(new ModelBox(cube_r20, 0, 35, -2.5F, -4.15F, -5.0F, 5, 1, 3, 0.02F, false));

        this.fur7 = new AdvancedModelRenderer(this);
        this.fur7.setRotationPoint(0.0F, -0.2204F, 1.5045F);
        this.hips.addChild(fur7);


        this.cube_r21 = new AdvancedModelRenderer(this);
        this.cube_r21.setRotationPoint(0.0F, 4.3492F, 4.7375F);
        this.fur7.addChild(cube_r21);
        this.setRotateAngle(cube_r21, -0.0436F, 0.0F, 0.0F);
        this.cube_r21.cubeList.add(new ModelBox(cube_r21, 36, 21, -2.5F, -4.15F, -5.0F, 5, 1, 3, 0.01F, false));

        this.fur8 = new AdvancedModelRenderer(this);
        this.fur8.setRotationPoint(0.0F, 0.6046F, 3.5795F);
        this.hips.addChild(fur8);


        this.cube_r22 = new AdvancedModelRenderer(this);
        this.cube_r22.setRotationPoint(0.0F, 4.3242F, 4.4125F);
        this.fur8.addChild(cube_r22);
        this.setRotateAngle(cube_r22, -0.0436F, 0.0F, 0.0F);
        this.cube_r22.cubeList.add(new ModelBox(cube_r22, 36, 25, -2.5F, -4.15F, -5.0F, 5, 1, 3, -0.01F, false));

        updateDefaultPose();
        animator = ModelAnimator.create();
    }

    @Override
    public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        animate((IAnimatedEntity) entity, f, f1, f2, f3, f4, f5);
        this.hips.render(f5);
    }

    @Override
    public void renderStaticBook(float f) {
        //Rotations, positions and sizing:
        this.hips.offsetY = -5.6F;
        this.hips.offsetX = 0.4F;
        this.hips.offsetZ = 3.0F;
        this.hips.rotateAngleY = (float)Math.toRadians(130);
        this.hips.rotateAngleX = (float)Math.toRadians(1);
        this.hips.rotateAngleZ = (float)Math.toRadians(0);
        this.hips.scaleChildren = true;
        float scaler = 3.4F;
        this.hips.setScale(scaler, scaler, scaler);
        //Start of pose:

        //End of pose, now render the model:
        this.hips.render(f);
        //Reset rotations, positions and sizing:
        this.hips.setScale(1.0F, 1.0F, 1.0F);
        this.hips.scaleChildren = false;
        resetToDefaultPose();

    }

    public void renderStaticFloor(float f) {
        this.hips.offsetY = 0.2825F;
        this.hips.render(0.01F);
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

        EntityPrehistoricFloraSpinolestes proteros = (EntityPrehistoricFloraSpinolestes) e;

        this.faceTarget(f3, f4, 10, neck);
        this.faceTarget(f3, f4, 10, head);

        AdvancedModelRenderer[] Tail = {this.tail, this.tail2, this.tail3};
        AdvancedModelRenderer[] Neck = {this.neck, this.head};
        //AdvancedModelRenderer[] ArmL = {this.leftarm, this.leftarm2, this.leftarm3};
        //AdvancedModelRenderer[] ArmR = {this.rightarm, this.rightarm2, this.rightarm3};

        if (proteros.getAnimation() == proteros.LAY_ANIMATION) {
            this.chainSwing(Neck, 0.5F, 0.10F, 0.5, f2, 0.8F);
            this.chainWave(Neck, 0.5F * 2, -0.02F, 0.5F, f2, 0.8F);
        }
        else {
            if (!proteros.isReallyInWater()) {

                if (f3 == 0.0F || !proteros.getIsMoving()) {
                    if (proteros.getAnimation() != proteros.EAT_ANIMATION
                        && proteros.getAnimation() != proteros.DRINK_ANIMATION) {
                        this.chainSwing(Neck, 0.05F, 0.10F, 0.5, f2, 0.8F);
                        this.chainWave(Neck, 0.05F * 2, -0.02F, 0.5F, f2, 0.8F);
                    }

                    this.chainWave(Tail, (0.15F * 0.35F), 0.125F * 0.15F, 0.2F, f2, 1F);
                    this.chainSwing(Tail, (0.15F * 0.35F) * 4F, 0.05F * 0.35F, 0.12F, f2, 1F);


                    return;
                }

            }
        }
    }


    @Override
    public void setLivingAnimations(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime) {
        super.setLivingAnimations(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime);
        this.resetToDefaultPose();
        this.eyes.setScale(1,1,1);
        EntityPrehistoricFloraSpinolestes ee = (EntityPrehistoricFloraSpinolestes) entitylivingbaseIn;

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
        else if (ee.getAnimation() == ee.ATTACK_ANIMATION) {
            animAttack(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime, ee.getAnimationTick());
        }
        else if (ee.getAnimation() == ee.LAY_ANIMATION) {
            animLay(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime, ee.getAnimationTick());
        }
        else if (ee.getAnimation() == ee.MAKE_NEST_ANIMATION) {
            animNest(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime, ee.getAnimationTick());
        }
        else if (ee.getAnimation() == ee.ROAR_ANIMATION) { //The noise anim
            animNoise(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime, ee.getAnimationTick());
        }
        else if (ee.getAnimation() == ee.ALERT_ANIMATION) { //The noise anim
            animAlert(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime, ee.getAnimationTick());
        }
        else if (ee.getAnimation() == ee.STAND_ANIMATION) { //The noise anim
            animStand(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime, ee.getAnimationTick());
        }


    }
    public void animNest(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime, double animTick) {
        EntityPrehistoricFloraSpinolestes entity = (EntityPrehistoricFloraSpinolestes) entitylivingbaseIn;
        int animCycle = 50;
        double tickAnim = animTick + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;
         if (tickAnim >= 0 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 0) / 13) * (-16.5-(0)));
            yy = 0 + (((tickAnim - 0) / 13) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 13) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 40) {
            xx = -16.5 + (((tickAnim - 13) / 27) * (-16.5-(-16.5)));
            yy = 0 + (((tickAnim - 13) / 27) * (0-(0)));
            zz = 0 + (((tickAnim - 13) / 27) * (0-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 50) {
            xx = -16.5 + (((tickAnim - 40) / 10) * (0-(-16.5)));
            yy = 0 + (((tickAnim - 40) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 40) / 10) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(hips, hips.rotateAngleX + (float) Math.toRadians(xx), hips.rotateAngleY + (float) Math.toRadians(yy), hips.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 0) / 13) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 13) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 13) * (0.875-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 40) {
            xx = 0 + (((tickAnim - 13) / 27) * (0-(0)));
            yy = 0 + (((tickAnim - 13) / 27) * (0-(0)));
            zz = 0.875 + (((tickAnim - 13) / 27) * (0.875-(0.875)));
        }
        else if (tickAnim >= 40 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 40) / 10) * (0-(0)));
            yy = 0 + (((tickAnim - 40) / 10) * (0-(0)));
            zz = 0.875 + (((tickAnim - 40) / 10) * (0-(0.875)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.hips.rotationPointX = this.hips.rotationPointX + (float)(xx);
        this.hips.rotationPointY = this.hips.rotationPointY - (float)(yy);
        this.hips.rotationPointZ = this.hips.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 0) / 13) * (-3.5-(0)));
            yy = 0 + (((tickAnim - 0) / 13) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 13) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 20) {
            xx = -3.5 + (((tickAnim - 13) / 7) * (-3.5-Math.sin((Math.PI/180)*(((double)tickAnim/20)*650))*0.5-(-3.5)));
            yy = 0 + (((tickAnim - 13) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 13) / 7) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 32) {
            xx = -3.5-Math.sin((Math.PI/180)*(((double)tickAnim/20)*650))*0.5 + (((tickAnim - 20) / 12) * (-3.5-Math.sin((Math.PI/180)*(((double)tickAnim/20)*650))*0.5-(-3.5-Math.sin((Math.PI/180)*(((double)tickAnim/20)*650))*0.5)));
            yy = 0 + (((tickAnim - 20) / 12) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 12) * (0-(0)));
        }
        else if (tickAnim >= 32 && tickAnim < 33) {
            xx = -3.5-Math.sin((Math.PI/180)*(((double)tickAnim/20)*650))*0.5 + (((tickAnim - 32) / 1) * (-3.5-(-3.5-Math.sin((Math.PI/180)*(((double)tickAnim/20)*650))*0.5)));
            yy = 0 + (((tickAnim - 32) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 32) / 1) * (0-(0)));
        }
        else if (tickAnim >= 33 && tickAnim < 50) {
            xx = -3.5 + (((tickAnim - 33) / 17) * (0-(-3.5)));
            yy = 0 + (((tickAnim - 33) / 17) * (0-(0)));
            zz = 0 + (((tickAnim - 33) / 17) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(body, body.rotateAngleX + (float) Math.toRadians(xx), body.rotateAngleY + (float) Math.toRadians(yy), body.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 0) / 13) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 13) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 13) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 13) / 7) * (-0-Math.sin((Math.PI/180)*(((double)tickAnim/20)*650-150))*0.5-(0)));
            yy = 0 + (((tickAnim - 13) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 13) / 7) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 32) {
            xx = -0-Math.sin((Math.PI/180)*(((double)tickAnim/20)*650-150))*0.5 + (((tickAnim - 20) / 12) * (-0-Math.sin((Math.PI/180)*(((double)tickAnim/20)*650-150))*0.5-(-0-Math.sin((Math.PI/180)*(((double)tickAnim/20)*650-150))*0.5)));
            yy = 0 + (((tickAnim - 20) / 12) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 12) * (0-(0)));
        }
        else if (tickAnim >= 32 && tickAnim < 33) {
            xx = -0-Math.sin((Math.PI/180)*(((double)tickAnim/20)*650-150))*0.5 + (((tickAnim - 32) / 1) * (0-(-0-Math.sin((Math.PI/180)*(((double)tickAnim/20)*650-150))*0.5)));
            yy = 0 + (((tickAnim - 32) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 32) / 1) * (0-(0)));
        }
        else if (tickAnim >= 33 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 33) / 17) * (0-(0)));
            yy = 0 + (((tickAnim - 33) / 17) * (0-(0)));
            zz = 0 + (((tickAnim - 33) / 17) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(chest, chest.rotateAngleX + (float) Math.toRadians(xx), chest.rotateAngleY + (float) Math.toRadians(yy), chest.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 0) / 13) * (26-(0)));
            yy = 0 + (((tickAnim - 0) / 13) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 13) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 40) {
            xx = 26 + (((tickAnim - 13) / 27) * (26-(26)));
            yy = 0 + (((tickAnim - 13) / 27) * (0-(0)));
            zz = 0 + (((tickAnim - 13) / 27) * (0-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 50) {
            xx = 26 + (((tickAnim - 40) / 10) * (0-(26)));
            yy = 0 + (((tickAnim - 40) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 40) / 10) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck, neck.rotateAngleX + (float) Math.toRadians(xx), neck.rotateAngleY + (float) Math.toRadians(yy), neck.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 0) / 13) * (17.75-(0)));
            yy = 0 + (((tickAnim - 0) / 13) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 13) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 40) {
            xx = 17.75 + (((tickAnim - 13) / 27) * (17.75-(17.75)));
            yy = 0 + (((tickAnim - 13) / 27) * (0-(0)));
            zz = 0 + (((tickAnim - 13) / 27) * (0-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 50) {
            xx = 17.75 + (((tickAnim - 40) / 10) * (0-(17.75)));
            yy = 0 + (((tickAnim - 40) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 40) / 10) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(head, head.rotateAngleX + (float) Math.toRadians(xx), head.rotateAngleY + (float) Math.toRadians(yy), head.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 0) / 13) * (21.5-(0)));
            yy = 0 + (((tickAnim - 0) / 13) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 13) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 40) {
            xx = 21.5 + (((tickAnim - 13) / 27) * (21.5-(21.5)));
            yy = 0 + (((tickAnim - 13) / 27) * (0-(0)));
            zz = 0 + (((tickAnim - 13) / 27) * (0-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 50) {
            xx = 21.5 + (((tickAnim - 40) / 10) * (0-(21.5)));
            yy = 0 + (((tickAnim - 40) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 40) / 10) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tail, tail.rotateAngleX + (float) Math.toRadians(xx), tail.rotateAngleY + (float) Math.toRadians(yy), tail.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 0) / 13) * (-3.5071-(0)));
            yy = 0 + (((tickAnim - 0) / 13) * (0.6125-(0)));
            zz = 0 + (((tickAnim - 0) / 13) * (1.3633-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 40) {
            xx = -3.5071 + (((tickAnim - 13) / 27) * (-3.5071-(-3.5071)));
            yy = 0.6125 + (((tickAnim - 13) / 27) * (0.6125-(0.6125)));
            zz = 1.3633 + (((tickAnim - 13) / 27) * (1.3633-(1.3633)));
        }
        else if (tickAnim >= 40 && tickAnim < 50) {
            xx = -3.5071 + (((tickAnim - 40) / 10) * (0-(-3.5071)));
            yy = 0.6125 + (((tickAnim - 40) / 10) * (0-(0.6125)));
            zz = 1.3633 + (((tickAnim - 40) / 10) * (0-(1.3633)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(legright, legright.rotateAngleX + (float) Math.toRadians(xx), legright.rotateAngleY + (float) Math.toRadians(yy), legright.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 0) / 13) * (33-(0)));
            yy = 0 + (((tickAnim - 0) / 13) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 13) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 40) {
            xx = 33 + (((tickAnim - 13) / 27) * (33-(33)));
            yy = 0 + (((tickAnim - 13) / 27) * (0-(0)));
            zz = 0 + (((tickAnim - 13) / 27) * (0-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 50) {
            xx = 33 + (((tickAnim - 40) / 10) * (0-(33)));
            yy = 0 + (((tickAnim - 40) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 40) / 10) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(legright2, legright2.rotateAngleX + (float) Math.toRadians(xx), legright2.rotateAngleY + (float) Math.toRadians(yy), legright2.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 0) / 13) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 13) * (-0.075-(0)));
            zz = 0 + (((tickAnim - 0) / 13) * (-0.95-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 40) {
            xx = 0 + (((tickAnim - 13) / 27) * (0-(0)));
            yy = -0.075 + (((tickAnim - 13) / 27) * (-0.075-(-0.075)));
            zz = -0.95 + (((tickAnim - 13) / 27) * (-0.95-(-0.95)));
        }
        else if (tickAnim >= 40 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 40) / 10) * (0-(0)));
            yy = -0.075 + (((tickAnim - 40) / 10) * (0-(-0.075)));
            zz = -0.95 + (((tickAnim - 40) / 10) * (0-(-0.95)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.legright2.rotationPointX = this.legright2.rotationPointX + (float)(xx);
        this.legright2.rotationPointY = this.legright2.rotationPointY - (float)(yy);
        this.legright2.rotationPointZ = this.legright2.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 0) / 13) * (-12.1727-(0)));
            yy = 0 + (((tickAnim - 0) / 13) * (1.5249-(0)));
            zz = 0 + (((tickAnim - 0) / 13) * (5.8036-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 40) {
            xx = -12.1727 + (((tickAnim - 13) / 27) * (-12.1727-(-12.1727)));
            yy = 1.5249 + (((tickAnim - 13) / 27) * (1.5249-(1.5249)));
            zz = 5.8036 + (((tickAnim - 13) / 27) * (5.8036-(5.8036)));
        }
        else if (tickAnim >= 40 && tickAnim < 50) {
            xx = -12.1727 + (((tickAnim - 40) / 10) * (0-(-12.1727)));
            yy = 1.5249 + (((tickAnim - 40) / 10) * (0-(1.5249)));
            zz = 5.8036 + (((tickAnim - 40) / 10) * (0-(5.8036)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(legright3, legright3.rotateAngleX + (float) Math.toRadians(xx), legright3.rotateAngleY + (float) Math.toRadians(yy), legright3.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 0) / 13) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 13) * (-0.15-(0)));
            zz = 0 + (((tickAnim - 0) / 13) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 40) {
            xx = 0 + (((tickAnim - 13) / 27) * (0-(0)));
            yy = -0.15 + (((tickAnim - 13) / 27) * (-0.15-(-0.15)));
            zz = 0 + (((tickAnim - 13) / 27) * (0-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 40) / 10) * (0-(0)));
            yy = -0.15 + (((tickAnim - 40) / 10) * (0-(-0.15)));
            zz = 0 + (((tickAnim - 40) / 10) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.legright3.rotationPointX = this.legright3.rotationPointX + (float)(xx);
        this.legright3.rotationPointY = this.legright3.rotationPointY - (float)(yy);
        this.legright3.rotationPointZ = this.legright3.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 0) / 13) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 13) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 13) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 13) / 7) * (-52.5-(0)));
            yy = 0 + (((tickAnim - 13) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 13) / 7) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 27) {
            xx = -52.5 + (((tickAnim - 20) / 7) * (0-(-52.5)));
            yy = 0 + (((tickAnim - 20) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 7) * (0-(0)));
        }
        else if (tickAnim >= 27 && tickAnim < 33) {
            xx = 0 + (((tickAnim - 27) / 6) * (-52.5-(0)));
            yy = 0 + (((tickAnim - 27) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 27) / 6) * (0-(0)));
        }
        else if (tickAnim >= 33 && tickAnim < 40) {
            xx = -52.5 + (((tickAnim - 33) / 7) * (0-(-52.5)));
            yy = 0 + (((tickAnim - 33) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 33) / 7) * (0-(0)));
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
        this.setRotateAngle(armright, armright.rotateAngleX + (float) Math.toRadians(xx), armright.rotateAngleY + (float) Math.toRadians(yy), armright.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 0) / 13) * (18.25-(0)));
            yy = 0 + (((tickAnim - 0) / 13) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 13) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 17) {
            xx = 18.25 + (((tickAnim - 13) / 4) * (-2-(18.25)));
            yy = 0 + (((tickAnim - 13) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 13) / 4) * (0-(0)));
        }
        else if (tickAnim >= 17 && tickAnim < 20) {
            xx = -2 + (((tickAnim - 17) / 3) * (60-(-2)));
            yy = 0 + (((tickAnim - 17) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 17) / 3) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 23) {
            xx = 60 + (((tickAnim - 20) / 3) * (68.5-(60)));
            yy = 0 + (((tickAnim - 20) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 3) * (0-(0)));
        }
        else if (tickAnim >= 23 && tickAnim < 27) {
            xx = 68.5 + (((tickAnim - 23) / 4) * (18.25-(68.5)));
            yy = 0 + (((tickAnim - 23) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 23) / 4) * (0-(0)));
        }
        else if (tickAnim >= 27 && tickAnim < 30) {
            xx = 18.25 + (((tickAnim - 27) / 3) * (-2-(18.25)));
            yy = 0 + (((tickAnim - 27) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 27) / 3) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 33) {
            xx = -2 + (((tickAnim - 30) / 3) * (60-(-2)));
            yy = 0 + (((tickAnim - 30) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 30) / 3) * (0-(0)));
        }
        else if (tickAnim >= 33 && tickAnim < 37) {
            xx = 60 + (((tickAnim - 33) / 4) * (68.5-(60)));
            yy = 0 + (((tickAnim - 33) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 33) / 4) * (0-(0)));
        }
        else if (tickAnim >= 37 && tickAnim < 40) {
            xx = 68.5 + (((tickAnim - 37) / 3) * (0-(68.5)));
            yy = 0 + (((tickAnim - 37) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 37) / 3) * (0-(0)));
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
        this.setRotateAngle(armright2, armright2.rotateAngleX + (float) Math.toRadians(xx), armright2.rotateAngleY + (float) Math.toRadians(yy), armright2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 0) / 13) * (117.75-(0)));
            yy = 0 + (((tickAnim - 0) / 13) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 13) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 17) {
            xx = 117.75 + (((tickAnim - 13) / 4) * (117.75-(117.75)));
            yy = 0 + (((tickAnim - 13) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 13) / 4) * (0-(0)));
        }
        else if (tickAnim >= 17 && tickAnim < 20) {
            xx = 117.75 + (((tickAnim - 17) / 3) * (54-(117.75)));
            yy = 0 + (((tickAnim - 17) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 17) / 3) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 27) {
            xx = 54 + (((tickAnim - 20) / 7) * (117.75-(54)));
            yy = 0 + (((tickAnim - 20) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 7) * (0-(0)));
        }
        else if (tickAnim >= 27 && tickAnim < 30) {
            xx = 117.75 + (((tickAnim - 27) / 3) * (117.75-(117.75)));
            yy = 0 + (((tickAnim - 27) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 27) / 3) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 33) {
            xx = 117.75 + (((tickAnim - 30) / 3) * (54-(117.75)));
            yy = 0 + (((tickAnim - 30) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 30) / 3) * (0-(0)));
        }
        else if (tickAnim >= 33 && tickAnim < 40) {
            xx = 54 + (((tickAnim - 33) / 7) * (144.5-(54)));
            yy = 0 + (((tickAnim - 33) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 33) / 7) * (0-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 50) {
            xx = 144.5 + (((tickAnim - 40) / 10) * (0-(144.5)));
            yy = 0 + (((tickAnim - 40) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 40) / 10) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(armright3, armright3.rotateAngleX + (float) Math.toRadians(xx), armright3.rotateAngleY + (float) Math.toRadians(yy), armright3.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 0) / 13) * (-52.5-(0)));
            yy = 0 + (((tickAnim - 0) / 13) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 13) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 20) {
            xx = -52.5 + (((tickAnim - 13) / 7) * (0-(-52.5)));
            yy = 0 + (((tickAnim - 13) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 13) / 7) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 25) {
            xx = 0 + (((tickAnim - 20) / 5) * (-52.5-(0)));
            yy = 0 + (((tickAnim - 20) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 5) * (0-(0)));
        }
        else if (tickAnim >= 25 && tickAnim < 32) {
            xx = -52.5 + (((tickAnim - 25) / 7) * (0-(-52.5)));
            yy = 0 + (((tickAnim - 25) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 25) / 7) * (0-(0)));
        }
        else if (tickAnim >= 32 && tickAnim < 40) {
            xx = 0 + (((tickAnim - 32) / 8) * (12.25-(0)));
            yy = 0 + (((tickAnim - 32) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 32) / 8) * (0-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 50) {
            xx = 12.25 + (((tickAnim - 40) / 10) * (0-(12.25)));
            yy = 0 + (((tickAnim - 40) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 40) / 10) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(armleft, armleft.rotateAngleX + (float) Math.toRadians(xx), armleft.rotateAngleY + (float) Math.toRadians(yy), armleft.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 7) {
            xx = 0 + (((tickAnim - 0) / 7) * (-21.75-(0)));
            yy = 0 + (((tickAnim - 0) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 7) * (0-(0)));
        }
        else if (tickAnim >= 7 && tickAnim < 13) {
            xx = -21.75 + (((tickAnim - 7) / 6) * (60-(-21.75)));
            yy = 0 + (((tickAnim - 7) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 7) / 6) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 17) {
            xx = 60 + (((tickAnim - 13) / 4) * (68.5-(60)));
            yy = 0 + (((tickAnim - 13) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 13) / 4) * (0-(0)));
        }
        else if (tickAnim >= 17 && tickAnim < 20) {
            xx = 68.5 + (((tickAnim - 17) / 3) * (0-(68.5)));
            yy = 0 + (((tickAnim - 17) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 17) / 3) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 23) {
            xx = 0 + (((tickAnim - 20) / 3) * (-14.75-(0)));
            yy = 0 + (((tickAnim - 20) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 3) * (0-(0)));
        }
        else if (tickAnim >= 23 && tickAnim < 25) {
            xx = -14.75 + (((tickAnim - 23) / 2) * (60-(-14.75)));
            yy = 0 + (((tickAnim - 23) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 23) / 2) * (0-(0)));
        }
        else if (tickAnim >= 25 && tickAnim < 28) {
            xx = 60 + (((tickAnim - 25) / 3) * (68.5-(60)));
            yy = 0 + (((tickAnim - 25) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 25) / 3) * (0-(0)));
        }
        else if (tickAnim >= 28 && tickAnim < 32) {
            xx = 68.5 + (((tickAnim - 28) / 4) * (0-(68.5)));
            yy = 0 + (((tickAnim - 28) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 28) / 4) * (0-(0)));
        }
        else if (tickAnim >= 32 && tickAnim < 40) {
            xx = 0 + (((tickAnim - 32) / 8) * (-18.25-(0)));
            yy = 0 + (((tickAnim - 32) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 32) / 8) * (0-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 50) {
            xx = -18.25 + (((tickAnim - 40) / 10) * (0-(-18.25)));
            yy = 0 + (((tickAnim - 40) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 40) / 10) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(armleft2, armleft2.rotateAngleX + (float) Math.toRadians(xx), armleft2.rotateAngleY + (float) Math.toRadians(yy), armleft2.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 7) {
            xx = 0 + (((tickAnim - 0) / 7) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 7) * (0.475-(0)));
        }
        else if (tickAnim >= 7 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 7) / 43) * (0-(0)));
            yy = 0 + (((tickAnim - 7) / 43) * (0-(0)));
            zz = 0.475 + (((tickAnim - 7) / 43) * (0-(0.475)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.armleft2.rotationPointX = this.armleft2.rotationPointX + (float)(xx);
        this.armleft2.rotationPointY = this.armleft2.rotationPointY - (float)(yy);
        this.armleft2.rotationPointZ = this.armleft2.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 0 + (((tickAnim - 0) / 3) * (61.25-(0)));
            yy = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 3) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 7) {
            xx = 61.25 + (((tickAnim - 3) / 4) * (65.5-(61.25)));
            yy = 0 + (((tickAnim - 3) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 3) / 4) * (0-(0)));
        }
        else if (tickAnim >= 7 && tickAnim < 10) {
            xx = 65.5 + (((tickAnim - 7) / 3) * (31.75-(65.5)));
            yy = 0 + (((tickAnim - 7) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 7) / 3) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 13) {
            xx = 31.75 + (((tickAnim - 10) / 3) * (54-(31.75)));
            yy = 0 + (((tickAnim - 10) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 3) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 20) {
            xx = 54 + (((tickAnim - 13) / 7) * (144.5-(54)));
            yy = 0 + (((tickAnim - 13) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 13) / 7) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 23) {
            xx = 144.5 + (((tickAnim - 20) / 3) * (134.5-(144.5)));
            yy = 0 + (((tickAnim - 20) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 3) * (0-(0)));
        }
        else if (tickAnim >= 23 && tickAnim < 25) {
            xx = 134.5 + (((tickAnim - 23) / 2) * (54-(134.5)));
            yy = 0 + (((tickAnim - 23) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 23) / 2) * (0-(0)));
        }
        else if (tickAnim >= 25 && tickAnim < 32) {
            xx = 54 + (((tickAnim - 25) / 7) * (144.5-(54)));
            yy = 0 + (((tickAnim - 25) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 25) / 7) * (0-(0)));
        }
        else if (tickAnim >= 32 && tickAnim < 40) {
            xx = 144.5 + (((tickAnim - 32) / 8) * (148.5-(144.5)));
            yy = 0 + (((tickAnim - 32) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 32) / 8) * (0-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 50) {
            xx = 148.5 + (((tickAnim - 40) / 10) * (0-(148.5)));
            yy = 0 + (((tickAnim - 40) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 40) / 10) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(armleft3, armleft3.rotateAngleX + (float) Math.toRadians(xx), armleft3.rotateAngleY + (float) Math.toRadians(yy), armleft3.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 0) / 13) * (-3.5071-(0)));
            yy = 0 + (((tickAnim - 0) / 13) * (0.6125-(0)));
            zz = 0 + (((tickAnim - 0) / 13) * (1.3633-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 40) {
            xx = -3.5071 + (((tickAnim - 13) / 27) * (-3.5071-(-3.5071)));
            yy = 0.6125 + (((tickAnim - 13) / 27) * (0.6125-(0.6125)));
            zz = 1.3633 + (((tickAnim - 13) / 27) * (1.3633-(1.3633)));
        }
        else if (tickAnim >= 40 && tickAnim < 50) {
            xx = -3.5071 + (((tickAnim - 40) / 10) * (0-(-3.5071)));
            yy = 0.6125 + (((tickAnim - 40) / 10) * (0-(0.6125)));
            zz = 1.3633 + (((tickAnim - 40) / 10) * (0-(1.3633)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(legleft, legleft.rotateAngleX + (float) Math.toRadians(xx), legleft.rotateAngleY + (float) Math.toRadians(yy), legleft.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 0) / 13) * (33-(0)));
            yy = 0 + (((tickAnim - 0) / 13) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 13) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 40) {
            xx = 33 + (((tickAnim - 13) / 27) * (33-(33)));
            yy = 0 + (((tickAnim - 13) / 27) * (0-(0)));
            zz = 0 + (((tickAnim - 13) / 27) * (0-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 50) {
            xx = 33 + (((tickAnim - 40) / 10) * (0-(33)));
            yy = 0 + (((tickAnim - 40) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 40) / 10) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(legleft2, legleft2.rotateAngleX + (float) Math.toRadians(xx), legleft2.rotateAngleY + (float) Math.toRadians(yy), legleft2.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 0) / 13) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 13) * (-0.075-(0)));
            zz = 0 + (((tickAnim - 0) / 13) * (-0.95-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 40) {
            xx = 0 + (((tickAnim - 13) / 27) * (0-(0)));
            yy = -0.075 + (((tickAnim - 13) / 27) * (-0.075-(-0.075)));
            zz = -0.95 + (((tickAnim - 13) / 27) * (-0.95-(-0.95)));
        }
        else if (tickAnim >= 40 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 40) / 10) * (0-(0)));
            yy = -0.075 + (((tickAnim - 40) / 10) * (0-(-0.075)));
            zz = -0.95 + (((tickAnim - 40) / 10) * (0-(-0.95)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.legleft2.rotationPointX = this.legleft2.rotationPointX + (float)(xx);
        this.legleft2.rotationPointY = this.legleft2.rotationPointY - (float)(yy);
        this.legleft2.rotationPointZ = this.legleft2.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 0) / 13) * (-12.1727-(0)));
            yy = 0 + (((tickAnim - 0) / 13) * (-1.5249-(0)));
            zz = 0 + (((tickAnim - 0) / 13) * (-5.8036-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 40) {
            xx = -12.1727 + (((tickAnim - 13) / 27) * (-12.1727-(-12.1727)));
            yy = -1.5249 + (((tickAnim - 13) / 27) * (-1.5249-(-1.5249)));
            zz = -5.8036 + (((tickAnim - 13) / 27) * (-5.8036-(-5.8036)));
        }
        else if (tickAnim >= 40 && tickAnim < 50) {
            xx = -12.1727 + (((tickAnim - 40) / 10) * (0-(-12.1727)));
            yy = -1.5249 + (((tickAnim - 40) / 10) * (0-(-1.5249)));
            zz = -5.8036 + (((tickAnim - 40) / 10) * (0-(-5.8036)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(legleft3, legleft3.rotateAngleX + (float) Math.toRadians(xx), legleft3.rotateAngleY + (float) Math.toRadians(yy), legleft3.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 0) / 13) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 13) * (-0.15-(0)));
            zz = 0 + (((tickAnim - 0) / 13) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 40) {
            xx = 0 + (((tickAnim - 13) / 27) * (0-(0)));
            yy = -0.15 + (((tickAnim - 13) / 27) * (-0.15-(-0.15)));
            zz = 0 + (((tickAnim - 13) / 27) * (0-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 40) / 10) * (0-(0)));
            yy = -0.15 + (((tickAnim - 40) / 10) * (0-(-0.15)));
            zz = 0 + (((tickAnim - 40) / 10) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.legleft3.rotationPointX = this.legleft3.rotationPointX + (float)(xx);
        this.legleft3.rotationPointY = this.legleft3.rotationPointY - (float)(yy);
        this.legleft3.rotationPointZ = this.legleft3.rotationPointZ + (float)(zz);


    }
    public void animLay(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime, double animTick) {
        EntityPrehistoricFloraSpinolestes entity = (EntityPrehistoricFloraSpinolestes) entitylivingbaseIn;


    }
    public void animNoise(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime, double animTick) {
        EntityPrehistoricFloraSpinolestes entity = (EntityPrehistoricFloraSpinolestes) entitylivingbaseIn;
        int animCycle = 15;
        double tickAnim = animTick + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;



        if (tickAnim >= 0 && tickAnim < 15) {
            xx = -0-Math.sin((Math.PI/180)*(((double)tickAnim/20)*480))*35 + (((tickAnim - 0) / 15) * (0-(-0-Math.sin((Math.PI/180)*(((double)tickAnim/20)*480))*35)));
            yy = 0 + (((tickAnim - 0) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 15) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(head, head.rotateAngleX + (float) Math.toRadians(xx), head.rotateAngleY + (float) Math.toRadians(yy), head.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 4) {
            xx = 0 + (((tickAnim - 0) / 4) * (34.25-(0)));
            yy = 0 + (((tickAnim - 0) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 4) * (0-(0)));
        }
        else if (tickAnim >= 4 && tickAnim < 5) {
            xx = 34.25 + (((tickAnim - 4) / 1) * (34.25-(34.25)));
            yy = 0 + (((tickAnim - 4) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 4) / 1) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 12) {
            xx = 34.25 + (((tickAnim - 5) / 7) * (0-(34.25)));
            yy = 0 + (((tickAnim - 5) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 5) / 7) * (0-(0)));
        }
        else if (tickAnim >= 12 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 12) / 3) * (0-(0)));
            yy = 0 + (((tickAnim - 12) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 12) / 3) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(jaw, jaw.rotateAngleX + (float) Math.toRadians(xx), jaw.rotateAngleY + (float) Math.toRadians(yy), jaw.rotateAngleZ + (float) Math.toRadians(zz));


    }
    public void animAttack(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime, double animTick) {
        EntityPrehistoricFloraSpinolestes entity = (EntityPrehistoricFloraSpinolestes) entitylivingbaseIn;
        int animCycle = 15;
        double tickAnim = animTick + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;
         if (tickAnim >= 0 && tickAnim < 3) {
            xx = 0 + (((tickAnim - 0) / 3) * (-15.25-(0)));
            yy = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 3) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 8) {
            xx = -15.25 + (((tickAnim - 3) / 5) * (3.5-(-15.25)));
            yy = 0 + (((tickAnim - 3) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 3) / 5) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 15) {
            xx = 3.5 + (((tickAnim - 8) / 7) * (0-(3.5)));
            yy = 0 + (((tickAnim - 8) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 7) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck, neck.rotateAngleX + (float) Math.toRadians(xx), neck.rotateAngleY + (float) Math.toRadians(yy), neck.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 0 + (((tickAnim - 0) / 3) * (15.75-(0)));
            yy = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 3) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 8) {
            xx = 15.75 + (((tickAnim - 3) / 5) * (-22.5-(15.75)));
            yy = 0 + (((tickAnim - 3) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 3) / 5) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 11) {
            xx = -22.5 + (((tickAnim - 8) / 3) * (0-(-22.5)));
            yy = 0 + (((tickAnim - 8) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 3) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(head, head.rotateAngleX + (float) Math.toRadians(xx), head.rotateAngleY + (float) Math.toRadians(yy), head.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 3) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 3) / 5) * (36.5-(0)));
            yy = 0 + (((tickAnim - 3) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 3) / 5) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 11) {
            xx = 36.5 + (((tickAnim - 8) / 3) * (0-(36.5)));
            yy = 0 + (((tickAnim - 8) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 3) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(jaw, jaw.rotateAngleX + (float) Math.toRadians(xx), jaw.rotateAngleY + (float) Math.toRadians(yy), jaw.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 3) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 3) / 5) * (-19.25-(0)));
            yy = 0 + (((tickAnim - 3) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 3) / 5) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 11) {
            xx = -19.25 + (((tickAnim - 8) / 3) * (0-(-19.25)));
            yy = 0 + (((tickAnim - 8) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 3) * (0-(0)));
        }
        else if (tickAnim >= 11 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 11) / 4) * (0-(0)));
            yy = 0 + (((tickAnim - 11) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 11) / 4) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(earright, earright.rotateAngleX + (float) Math.toRadians(xx), earright.rotateAngleY + (float) Math.toRadians(yy), earright.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 3) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 3) / 5) * (0-(0)));
            yy = 0 + (((tickAnim - 3) / 5) * (-0.225-(0)));
            zz = 0 + (((tickAnim - 3) / 5) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 11) {
            xx = 0 + (((tickAnim - 8) / 3) * (0-(0)));
            yy = -0.225 + (((tickAnim - 8) / 3) * (0-(-0.225)));
            zz = 0 + (((tickAnim - 8) / 3) * (0-(0)));
        }
        else if (tickAnim >= 11 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 11) / 4) * (0-(0)));
            yy = 0 + (((tickAnim - 11) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 11) / 4) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.earright.rotationPointX = this.earright.rotationPointX + (float)(xx);
        this.earright.rotationPointY = this.earright.rotationPointY - (float)(yy);
        this.earright.rotationPointZ = this.earright.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 3) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 3) / 5) * (-19.25-(0)));
            yy = 0 + (((tickAnim - 3) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 3) / 5) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 11) {
            xx = -19.25 + (((tickAnim - 8) / 3) * (0-(-19.25)));
            yy = 0 + (((tickAnim - 8) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 3) * (0-(0)));
        }
        else if (tickAnim >= 11 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 11) / 4) * (0-(0)));
            yy = 0 + (((tickAnim - 11) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 11) / 4) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(earleft, earleft.rotateAngleX + (float) Math.toRadians(xx), earleft.rotateAngleY + (float) Math.toRadians(yy), earleft.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 3) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 3) / 5) * (0-(0)));
            yy = 0 + (((tickAnim - 3) / 5) * (-0.225-(0)));
            zz = 0 + (((tickAnim - 3) / 5) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 11) {
            xx = 0 + (((tickAnim - 8) / 3) * (0-(0)));
            yy = -0.225 + (((tickAnim - 8) / 3) * (0-(-0.225)));
            zz = 0 + (((tickAnim - 8) / 3) * (0-(0)));
        }
        else if (tickAnim >= 11 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 11) / 4) * (0-(0)));
            yy = 0 + (((tickAnim - 11) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 11) / 4) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.earleft.rotationPointX = this.earleft.rotationPointX + (float)(xx);
        this.earleft.rotationPointY = this.earleft.rotationPointY - (float)(yy);
        this.earleft.rotationPointZ = this.earleft.rotationPointZ + (float)(zz);


    }
    public void animEat(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime, double animTick) {
        EntityPrehistoricFloraSpinolestes entity = (EntityPrehistoricFloraSpinolestes) entitylivingbaseIn;
        int animCycle = 25;
        double tickAnim = animTick + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;
         if (tickAnim >= 0 && tickAnim < 8) {
            xx = -0-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*-25 + (((tickAnim - 0) / 8) * (-46.0199-Math.sin((Math.PI/180)*(((double)tickAnim/20)*30-50))*85-(-0-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*-25)));
            yy = 0 + (((tickAnim - 0) / 8) * (2.6482-(0)));
            zz = 0 + (((tickAnim - 0) / 8) * (-9.292-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 12) {
            xx = -46.0199-Math.sin((Math.PI/180)*(((double)tickAnim/20)*30-50))*85 + (((tickAnim - 8) / 4) * (-18.625-Math.sin((Math.PI/180)*(((double)tickAnim/20)*1300-50))*5-(-46.0199-Math.sin((Math.PI/180)*(((double)tickAnim/20)*30-50))*85)));
            yy = 2.6482 + (((tickAnim - 8) / 4) * (0-(2.6482)));
            zz = -9.292 + (((tickAnim - 8) / 4) * (0-(-9.292)));
        }
        else if (tickAnim >= 12 && tickAnim < 19) {
            xx = -18.625-Math.sin((Math.PI/180)*(((double)tickAnim/20)*1300-50))*5 + (((tickAnim - 12) / 7) * (-19.75-Math.sin((Math.PI/180)*(((double)tickAnim/20)*1300-50))*5-(-18.625-Math.sin((Math.PI/180)*(((double)tickAnim/20)*1300-50))*5)));
            yy = 0 + (((tickAnim - 12) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 12) / 7) * (0-(0)));
        }
        else if (tickAnim >= 19 && tickAnim < 23) {
            xx = -19.75-Math.sin((Math.PI/180)*(((double)tickAnim/20)*1300-50))*5 + (((tickAnim - 19) / 4) * (-6-(-19.75-Math.sin((Math.PI/180)*(((double)tickAnim/20)*1300-50))*5)));
            yy = 0 + (((tickAnim - 19) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 19) / 4) * (0-(0)));
        }
        else if (tickAnim >= 23 && tickAnim < 25) {
            xx = -6 + (((tickAnim - 23) / 2) * (0-(-6)));
            yy = 0 + (((tickAnim - 23) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 23) / 2) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck, neck.rotateAngleX + (float) Math.toRadians(xx), neck.rotateAngleY + (float) Math.toRadians(yy), neck.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 0 + (((tickAnim - 0) / 3) * (10-(0)));
            yy = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 3) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 5) {
            xx = 10 + (((tickAnim - 3) / 2) * (-3.501-(10)));
            yy = 0 + (((tickAnim - 3) / 2) * (-3.5799-(0)));
            zz = 0 + (((tickAnim - 3) / 2) * (-7.8297-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 8) {
            xx = -3.501 + (((tickAnim - 5) / 3) * (4.2318-(-3.501)));
            yy = -3.5799 + (((tickAnim - 5) / 3) * (0.8618-(-3.5799)));
            zz = -7.8297 + (((tickAnim - 5) / 3) * (-7.1072-(-7.8297)));
        }
        else if (tickAnim >= 8 && tickAnim < 12) {
            xx = 4.2318 + (((tickAnim - 8) / 4) * (-5.875-Math.sin((Math.PI/180)*(((double)tickAnim/20)*1300-140))*5-(4.2318)));
            yy = 0.8618 + (((tickAnim - 8) / 4) * (0-(0.8618)));
            zz = -7.1072 + (((tickAnim - 8) / 4) * (0-(-7.1072)));
        }
        else if (tickAnim >= 12 && tickAnim < 19) {
            xx = -5.875-Math.sin((Math.PI/180)*(((double)tickAnim/20)*1300-140))*5 + (((tickAnim - 12) / 7) * (-3.875-Math.sin((Math.PI/180)*(((double)tickAnim/20)*1300-140))*5-(-5.875-Math.sin((Math.PI/180)*(((double)tickAnim/20)*1300-140))*5)));
            yy = 0 + (((tickAnim - 12) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 12) / 7) * (0-(0)));
        }
        else if (tickAnim >= 19 && tickAnim < 25) {
            xx = -3.875-Math.sin((Math.PI/180)*(((double)tickAnim/20)*1300-140))*5 + (((tickAnim - 19) / 6) * (0-(-3.875-Math.sin((Math.PI/180)*(((double)tickAnim/20)*1300-140))*5)));
            yy = 0 + (((tickAnim - 19) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 19) / 6) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(head, head.rotateAngleX + (float) Math.toRadians(xx), head.rotateAngleY + (float) Math.toRadians(yy), head.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 3) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 3) / 2) * (21.5-(0)));
            yy = 0 + (((tickAnim - 3) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 3) / 2) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 8) {
            xx = 21.5 + (((tickAnim - 5) / 3) * (11.25-(21.5)));
            yy = 0 + (((tickAnim - 5) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 5) / 3) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 12) {
            xx = 11.25 + (((tickAnim - 8) / 4) * (11.25-(11.25)));
            yy = 0 + (((tickAnim - 8) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 4) * (0-(0)));
        }
        else if (tickAnim >= 12 && tickAnim < 14) {
            xx = 11.25 + (((tickAnim - 12) / 2) * (27.25-(11.25)));
            yy = 0 + (((tickAnim - 12) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 12) / 2) * (0-(0)));
        }
        else if (tickAnim >= 14 && tickAnim < 17) {
            xx = 27.25 + (((tickAnim - 14) / 3) * (0-(27.25)));
            yy = 0 + (((tickAnim - 14) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 14) / 3) * (0-(0)));
        }
        else if (tickAnim >= 17 && tickAnim < 19) {
            xx = 0 + (((tickAnim - 17) / 2) * (27.25-(0)));
            yy = 0 + (((tickAnim - 17) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 17) / 2) * (0-(0)));
        }
        else if (tickAnim >= 19 && tickAnim < 22) {
            xx = 27.25 + (((tickAnim - 19) / 3) * (0-(27.25)));
            yy = 0 + (((tickAnim - 19) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 19) / 3) * (0-(0)));
        }
        else if (tickAnim >= 22 && tickAnim < 25) {
            xx = 0 + (((tickAnim - 22) / 3) * (0-(0)));
            yy = 0 + (((tickAnim - 22) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 22) / 3) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(jaw, jaw.rotateAngleX + (float) Math.toRadians(xx), jaw.rotateAngleY + (float) Math.toRadians(yy), jaw.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 0) / 5) * (-16.6766-(0)));
            yy = 0 + (((tickAnim - 0) / 5) * (29.2464-(0)));
            zz = 0 + (((tickAnim - 0) / 5) * (0.491-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 12) {
            xx = -16.6766 + (((tickAnim - 5) / 7) * (-0-Math.sin((Math.PI/180)*(((double)tickAnim/20)*1300))*10-(-16.6766)));
            yy = 29.2464 + (((tickAnim - 5) / 7) * (0-(29.2464)));
            zz = 0.491 + (((tickAnim - 5) / 7) * (0-(0.491)));
        }
        else if (tickAnim >= 12 && tickAnim < 19) {
            xx = -0-Math.sin((Math.PI/180)*(((double)tickAnim/20)*1300))*10 + (((tickAnim - 12) / 7) * (-0-Math.sin((Math.PI/180)*(((double)tickAnim/20)*1300))*10-(-0-Math.sin((Math.PI/180)*(((double)tickAnim/20)*1300))*10)));
            yy = 0 + (((tickAnim - 12) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 12) / 7) * (0-(0)));
        }
        else if (tickAnim >= 19 && tickAnim < 25) {
            xx = -0-Math.sin((Math.PI/180)*(((double)tickAnim/20)*1300))*10 + (((tickAnim - 19) / 6) * (0-(-0-Math.sin((Math.PI/180)*(((double)tickAnim/20)*1300))*10)));
            yy = 0 + (((tickAnim - 19) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 19) / 6) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(earright, earright.rotateAngleX + (float) Math.toRadians(xx), earright.rotateAngleY + (float) Math.toRadians(yy), earright.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 0) / 5) * (0.225-(0)));
            yy = 0 + (((tickAnim - 0) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 5) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 12) {
            xx = 0.225 + (((tickAnim - 5) / 7) * (0-(0.225)));
            yy = 0 + (((tickAnim - 5) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 5) / 7) * (0-(0)));
        }
        else if (tickAnim >= 12 && tickAnim < 19) {
            xx = 0 + (((tickAnim - 12) / 7) * (0-(0)));
            yy = 0 + (((tickAnim - 12) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 12) / 7) * (0-(0)));
        }
        else if (tickAnim >= 19 && tickAnim < 25) {
            xx = 0 + (((tickAnim - 19) / 6) * (0-(0)));
            yy = 0 + (((tickAnim - 19) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 19) / 6) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.earright.rotationPointX = this.earright.rotationPointX + (float)(xx);
        this.earright.rotationPointY = this.earright.rotationPointY - (float)(yy);
        this.earright.rotationPointZ = this.earright.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 0) / 5) * (-16.6766-(0)));
            yy = 0 + (((tickAnim - 0) / 5) * (-29.2464-(0)));
            zz = 0 + (((tickAnim - 0) / 5) * (-0.491-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 12) {
            xx = -16.6766 + (((tickAnim - 5) / 7) * (-0-Math.sin((Math.PI/180)*(((double)tickAnim/20)*1300))*10-(-16.6766)));
            yy = -29.2464 + (((tickAnim - 5) / 7) * (0-(-29.2464)));
            zz = -0.491 + (((tickAnim - 5) / 7) * (0-(-0.491)));
        }
        else if (tickAnim >= 12 && tickAnim < 19) {
            xx = -0-Math.sin((Math.PI/180)*(((double)tickAnim/20)*1300))*10 + (((tickAnim - 12) / 7) * (-0-Math.sin((Math.PI/180)*(((double)tickAnim/20)*1300))*10-(-0-Math.sin((Math.PI/180)*(((double)tickAnim/20)*1300))*10)));
            yy = 0 + (((tickAnim - 12) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 12) / 7) * (0-(0)));
        }
        else if (tickAnim >= 19 && tickAnim < 25) {
            xx = -0-Math.sin((Math.PI/180)*(((double)tickAnim/20)*1300))*10 + (((tickAnim - 19) / 6) * (0-(-0-Math.sin((Math.PI/180)*(((double)tickAnim/20)*1300))*10)));
            yy = 0 + (((tickAnim - 19) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 19) / 6) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(earleft, earleft.rotateAngleX + (float) Math.toRadians(xx), earleft.rotateAngleY + (float) Math.toRadians(yy), earleft.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 0) / 5) * (-0.225-(0)));
            yy = 0 + (((tickAnim - 0) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 5) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 12) {
            xx = -0.225 + (((tickAnim - 5) / 7) * (0-(-0.225)));
            yy = 0 + (((tickAnim - 5) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 5) / 7) * (0-(0)));
        }
        else if (tickAnim >= 12 && tickAnim < 19) {
            xx = 0 + (((tickAnim - 12) / 7) * (0-(0)));
            yy = 0 + (((tickAnim - 12) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 12) / 7) * (0-(0)));
        }
        else if (tickAnim >= 19 && tickAnim < 25) {
            xx = 0 + (((tickAnim - 19) / 6) * (0-(0)));
            yy = 0 + (((tickAnim - 19) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 19) / 6) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.earleft.rotationPointX = this.earleft.rotationPointX + (float)(xx);
        this.earleft.rotationPointY = this.earleft.rotationPointY - (float)(yy);
        this.earleft.rotationPointZ = this.earleft.rotationPointZ + (float)(zz);


    }
    public void animAlert(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime, double animTick) {
        EntityPrehistoricFloraSpinolestes entity = (EntityPrehistoricFloraSpinolestes) entitylivingbaseIn;
        int animCycle = 35;
        double tickAnim = animTick + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;
         if (tickAnim >= 0 && tickAnim < 13) {
            xx = -0-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*-5 + (((tickAnim - 0) / 13) * (-1.7-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*2-(-0-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*-5)));
            yy = 0 + (((tickAnim - 0) / 13) * (3.5-(0)));
            zz = 0 + (((tickAnim - 0) / 13) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 25) {
            xx = -1.7-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*2 + (((tickAnim - 13) / 12) * (-6.5-(-1.7-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*2)));
            yy = 3.5 + (((tickAnim - 13) / 12) * (3.5-(3.5)));
            zz = 0 + (((tickAnim - 13) / 12) * (0-(0)));
        }
        else if (tickAnim >= 25 && tickAnim < 35) {
            xx = -6.5 + (((tickAnim - 25) / 10) * (0-(-6.5)));
            yy = 3.5 + (((tickAnim - 25) / 10) * (0-(3.5)));
            zz = 0 + (((tickAnim - 25) / 10) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(hips, hips.rotateAngleX + (float) Math.toRadians(xx), hips.rotateAngleY + (float) Math.toRadians(yy), hips.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 0) / 13) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 13) * (1.775-(0)));
            zz = 0 + (((tickAnim - 0) / 13) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 25) {
            xx = 0 + (((tickAnim - 13) / 12) * (0-(0)));
            yy = 1.775 + (((tickAnim - 13) / 12) * (1.775-(1.775)));
            zz = 0 + (((tickAnim - 13) / 12) * (0-(0)));
        }
        else if (tickAnim >= 25 && tickAnim < 35) {
            xx = 0 + (((tickAnim - 25) / 10) * (0-(0)));
            yy = 1.775 + (((tickAnim - 25) / 10) * (0-(1.775)));
            zz = 0 + (((tickAnim - 25) / 10) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.hips.rotationPointX = this.hips.rotationPointX + (float)(xx);
        this.hips.rotationPointY = this.hips.rotationPointY - (float)(yy);
        this.hips.rotationPointZ = this.hips.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 0) / 13) * (9.5226-(0)));
            yy = 0 + (((tickAnim - 0) / 13) * (-3.945-(0)));
            zz = 0 + (((tickAnim - 0) / 13) * (-0.6613-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 25) {
            xx = 9.5226 + (((tickAnim - 13) / 12) * (15.0226-(9.5226)));
            yy = -3.945 + (((tickAnim - 13) / 12) * (-3.945-(-3.945)));
            zz = -0.6613 + (((tickAnim - 13) / 12) * (-0.6613-(-0.6613)));
        }
        else if (tickAnim >= 25 && tickAnim < 35) {
            xx = 15.0226 + (((tickAnim - 25) / 10) * (0-(15.0226)));
            yy = -3.945 + (((tickAnim - 25) / 10) * (0-(-3.945)));
            zz = -0.6613 + (((tickAnim - 25) / 10) * (0-(-0.6613)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(body, body.rotateAngleX + (float) Math.toRadians(xx), body.rotateAngleY + (float) Math.toRadians(yy), body.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 0) / 13) * (10.5-(0)));
            yy = 0 + (((tickAnim - 0) / 13) * (-5.5-(0)));
            zz = 0 + (((tickAnim - 0) / 13) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 25) {
            xx = 10.5 + (((tickAnim - 13) / 12) * (5-(10.5)));
            yy = -5.5 + (((tickAnim - 13) / 12) * (-5.5-(-5.5)));
            zz = 0 + (((tickAnim - 13) / 12) * (0-(0)));
        }
        else if (tickAnim >= 25 && tickAnim < 35) {
            xx = 5 + (((tickAnim - 25) / 10) * (0-(5)));
            yy = -5.5 + (((tickAnim - 25) / 10) * (0-(-5.5)));
            zz = 0 + (((tickAnim - 25) / 10) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(chest, chest.rotateAngleX + (float) Math.toRadians(xx), chest.rotateAngleY + (float) Math.toRadians(yy), chest.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 0) / 13) * (-0.7599-(0)));
            yy = 0 + (((tickAnim - 0) / 13) * (6.6635-(0)));
            zz = 0 + (((tickAnim - 0) / 13) * (-6.2688-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 25) {
            xx = -0.7599 + (((tickAnim - 13) / 12) * (-9.2599-(-0.7599)));
            yy = 6.6635 + (((tickAnim - 13) / 12) * (6.6635-(6.6635)));
            zz = -6.2688 + (((tickAnim - 13) / 12) * (-6.2688-(-6.2688)));
        }
        else if (tickAnim >= 25 && tickAnim < 35) {
            xx = -9.2599 + (((tickAnim - 25) / 10) * (0-(-9.2599)));
            yy = 6.6635 + (((tickAnim - 25) / 10) * (0-(6.6635)));
            zz = -6.2688 + (((tickAnim - 25) / 10) * (0-(-6.2688)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck, neck.rotateAngleX + (float) Math.toRadians(xx), neck.rotateAngleY + (float) Math.toRadians(yy), neck.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 0) / 13) * (-26.75-(0)));
            yy = 0 + (((tickAnim - 0) / 13) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 13) * (-7.5-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 25) {
            xx = -26.75 + (((tickAnim - 13) / 12) * (-16.75-(-26.75)));
            yy = 0 + (((tickAnim - 13) / 12) * (0-(0)));
            zz = -7.5 + (((tickAnim - 13) / 12) * (-7.5-(-7.5)));
        }
        else if (tickAnim >= 25 && tickAnim < 35) {
            xx = -16.75 + (((tickAnim - 25) / 10) * (0-(-16.75)));
            yy = 0 + (((tickAnim - 25) / 10) * (0-(0)));
            zz = -7.5 + (((tickAnim - 25) / 10) * (0-(-7.5)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(head, head.rotateAngleX + (float) Math.toRadians(xx), head.rotateAngleY + (float) Math.toRadians(yy), head.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 0) / 13) * (-5.25-(0)));
            yy = 0 + (((tickAnim - 0) / 13) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 13) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 25) {
            xx = -5.25 + (((tickAnim - 13) / 12) * (2.25-(-5.25)));
            yy = 0 + (((tickAnim - 13) / 12) * (0-(0)));
            zz = 0 + (((tickAnim - 13) / 12) * (0-(0)));
        }
        else if (tickAnim >= 25 && tickAnim < 35) {
            xx = 2.25 + (((tickAnim - 25) / 10) * (0-(2.25)));
            yy = 0 + (((tickAnim - 25) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 25) / 10) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tail, tail.rotateAngleX + (float) Math.toRadians(xx), tail.rotateAngleY + (float) Math.toRadians(yy), tail.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 0) / 13) * (31-(0)));
            yy = 0 + (((tickAnim - 0) / 13) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 13) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 25) {
            xx = 31 + (((tickAnim - 13) / 12) * (34.5-(31)));
            yy = 0 + (((tickAnim - 13) / 12) * (0-(0)));
            zz = 0 + (((tickAnim - 13) / 12) * (0-(0)));
        }
        else if (tickAnim >= 25 && tickAnim < 35) {
            xx = 34.5 + (((tickAnim - 25) / 10) * (0-(34.5)));
            yy = 0 + (((tickAnim - 25) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 25) / 10) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(legright, legright.rotateAngleX + (float) Math.toRadians(xx), legright.rotateAngleY + (float) Math.toRadians(yy), legright.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 0) / 13) * (-21.25-(0)));
            yy = 0 + (((tickAnim - 0) / 13) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 13) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 25) {
            xx = -21.25 + (((tickAnim - 13) / 12) * (-16.25-(-21.25)));
            yy = 0 + (((tickAnim - 13) / 12) * (0-(0)));
            zz = 0 + (((tickAnim - 13) / 12) * (0-(0)));
        }
        else if (tickAnim >= 25 && tickAnim < 35) {
            xx = -16.25 + (((tickAnim - 25) / 10) * (0-(-16.25)));
            yy = 0 + (((tickAnim - 25) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 25) / 10) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(legright2, legright2.rotateAngleX + (float) Math.toRadians(xx), legright2.rotateAngleY + (float) Math.toRadians(yy), legright2.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 0) / 13) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 13) * (-0.15-(0)));
            zz = 0 + (((tickAnim - 0) / 13) * (-0.125-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 25) {
            xx = 0 + (((tickAnim - 13) / 12) * (0-(0)));
            yy = -0.15 + (((tickAnim - 13) / 12) * (0-(-0.15)));
            zz = -0.125 + (((tickAnim - 13) / 12) * (0-(-0.125)));
        }
        else if (tickAnim >= 25 && tickAnim < 35) {
            xx = 0 + (((tickAnim - 25) / 10) * (0-(0)));
            yy = 0 + (((tickAnim - 25) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 25) / 10) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.legright2.rotationPointX = this.legright2.rotationPointX + (float)(xx);
        this.legright2.rotationPointY = this.legright2.rotationPointY - (float)(yy);
        this.legright2.rotationPointZ = this.legright2.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 0) / 13) * (-7.25-(0)));
            yy = 0 + (((tickAnim - 0) / 13) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 13) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 25) {
            xx = -7.25 + (((tickAnim - 13) / 12) * (-11.25-(-7.25)));
            yy = 0 + (((tickAnim - 13) / 12) * (0-(0)));
            zz = 0 + (((tickAnim - 13) / 12) * (0-(0)));
        }
        else if (tickAnim >= 25 && tickAnim < 35) {
            xx = -11.25 + (((tickAnim - 25) / 10) * (0-(-11.25)));
            yy = 0 + (((tickAnim - 25) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 25) / 10) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(legright3, legright3.rotateAngleX + (float) Math.toRadians(xx), legright3.rotateAngleY + (float) Math.toRadians(yy), legright3.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 0) / 13) * (-37.525-(0)));
            yy = 0 + (((tickAnim - 0) / 13) * (20.3163-(0)));
            zz = 0 + (((tickAnim - 0) / 13) * (-3.8302-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 25) {
            xx = -37.525 + (((tickAnim - 13) / 12) * (-32.525-(-37.525)));
            yy = 20.3163 + (((tickAnim - 13) / 12) * (20.3163-(20.3163)));
            zz = -3.8302 + (((tickAnim - 13) / 12) * (-3.8302-(-3.8302)));
        }
        else if (tickAnim >= 25 && tickAnim < 35) {
            xx = -32.525 + (((tickAnim - 25) / 10) * (0-(-32.525)));
            yy = 20.3163 + (((tickAnim - 25) / 10) * (0-(20.3163)));
            zz = -3.8302 + (((tickAnim - 25) / 10) * (0-(-3.8302)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(armright, armright.rotateAngleX + (float) Math.toRadians(xx), armright.rotateAngleY + (float) Math.toRadians(yy), armright.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 0) / 13) * (-5.25-(0)));
            yy = 0 + (((tickAnim - 0) / 13) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 13) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 25) {
            xx = -5.25 + (((tickAnim - 13) / 12) * (-1-(-5.25)));
            yy = 0 + (((tickAnim - 13) / 12) * (0-(0)));
            zz = 0 + (((tickAnim - 13) / 12) * (0-(0)));
        }
        else if (tickAnim >= 25 && tickAnim < 35) {
            xx = -1 + (((tickAnim - 25) / 10) * (0-(-1)));
            yy = 0 + (((tickAnim - 25) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 25) / 10) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(armright2, armright2.rotateAngleX + (float) Math.toRadians(xx), armright2.rotateAngleY + (float) Math.toRadians(yy), armright2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 0) / 13) * (31.2191-(0)));
            yy = 0 + (((tickAnim - 0) / 13) * (-6.8487-(0)));
            zz = 0 + (((tickAnim - 0) / 13) * (6.0247-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 25) {
            xx = 31.2191 + (((tickAnim - 13) / 12) * (24.7191-(31.2191)));
            yy = -6.8487 + (((tickAnim - 13) / 12) * (-6.8487-(-6.8487)));
            zz = 6.0247 + (((tickAnim - 13) / 12) * (6.0247-(6.0247)));
        }
        else if (tickAnim >= 25 && tickAnim < 35) {
            xx = 24.7191 + (((tickAnim - 25) / 10) * (0-(24.7191)));
            yy = -6.8487 + (((tickAnim - 25) / 10) * (0-(-6.8487)));
            zz = 6.0247 + (((tickAnim - 25) / 10) * (0-(6.0247)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(armright3, armright3.rotateAngleX + (float) Math.toRadians(xx), armright3.rotateAngleY + (float) Math.toRadians(yy), armright3.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 0) / 13) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 13) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 13) * (0.175-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 25) {
            xx = 0 + (((tickAnim - 13) / 12) * (0-(0)));
            yy = 0 + (((tickAnim - 13) / 12) * (0-(0)));
            zz = 0.175 + (((tickAnim - 13) / 12) * (0.175-(0.175)));
        }
        else if (tickAnim >= 25 && tickAnim < 35) {
            xx = 0 + (((tickAnim - 25) / 10) * (0-(0)));
            yy = 0 + (((tickAnim - 25) / 10) * (0-(0)));
            zz = 0.175 + (((tickAnim - 25) / 10) * (0-(0.175)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.armright3.rotationPointX = this.armright3.rotationPointX + (float)(xx);
        this.armright3.rotationPointY = this.armright3.rotationPointY - (float)(yy);
        this.armright3.rotationPointZ = this.armright3.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 7) {
            xx = 0 + (((tickAnim - 0) / 7) * (7.025-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*-50-(0)));
            yy = 0 + (((tickAnim - 0) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 7) * (0-(0)));
        }
        else if (tickAnim >= 7 && tickAnim < 13) {
            xx = 7.025-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*-50 + (((tickAnim - 7) / 6) * (31.25-(7.025-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*-50)));
            yy = 0 + (((tickAnim - 7) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 7) / 6) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 25) {
            xx = 31.25 + (((tickAnim - 13) / 12) * (35-(31.25)));
            yy = 0 + (((tickAnim - 13) / 12) * (0-(0)));
            zz = 0 + (((tickAnim - 13) / 12) * (0-(0)));
        }
        else if (tickAnim >= 25 && tickAnim < 35) {
            xx = 35 + (((tickAnim - 25) / 10) * (0-(35)));
            yy = 0 + (((tickAnim - 25) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 25) / 10) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(jaw, jaw.rotateAngleX + (float) Math.toRadians(xx), jaw.rotateAngleY + (float) Math.toRadians(yy), jaw.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 0) / 13) * (-37.0152-(0)));
            yy = 0 + (((tickAnim - 0) / 13) * (-2.98-(0)));
            zz = 0 + (((tickAnim - 0) / 13) * (-3.1958-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 25) {
            xx = -37.0152 + (((tickAnim - 13) / 12) * (-33.2652-(-37.0152)));
            yy = -2.98 + (((tickAnim - 13) / 12) * (-2.98-(-2.98)));
            zz = -3.1958 + (((tickAnim - 13) / 12) * (-3.1958-(-3.1958)));
        }
        else if (tickAnim >= 25 && tickAnim < 35) {
            xx = -33.2652 + (((tickAnim - 25) / 10) * (0-(-33.2652)));
            yy = -2.98 + (((tickAnim - 25) / 10) * (0-(-2.98)));
            zz = -3.1958 + (((tickAnim - 25) / 10) * (0-(-3.1958)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(armleft, armleft.rotateAngleX + (float) Math.toRadians(xx), armleft.rotateAngleY + (float) Math.toRadians(yy), armleft.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 0) / 13) * (-5.25-(0)));
            yy = 0 + (((tickAnim - 0) / 13) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 13) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 25) {
            xx = -5.25 + (((tickAnim - 13) / 12) * (-1-(-5.25)));
            yy = 0 + (((tickAnim - 13) / 12) * (0-(0)));
            zz = 0 + (((tickAnim - 13) / 12) * (0-(0)));
        }
        else if (tickAnim >= 25 && tickAnim < 35) {
            xx = -1 + (((tickAnim - 25) / 10) * (0-(-1)));
            yy = 0 + (((tickAnim - 25) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 25) / 10) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(armleft2, armleft2.rotateAngleX + (float) Math.toRadians(xx), armleft2.rotateAngleY + (float) Math.toRadians(yy), armleft2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 0) / 13) * (31.2191-(0)));
            yy = 0 + (((tickAnim - 0) / 13) * (6.8487-(0)));
            zz = 0 + (((tickAnim - 0) / 13) * (-6.0247-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 25) {
            xx = 31.2191 + (((tickAnim - 13) / 12) * (24.7191-(31.2191)));
            yy = 6.8487 + (((tickAnim - 13) / 12) * (6.8487-(6.8487)));
            zz = -6.0247 + (((tickAnim - 13) / 12) * (-6.0247-(-6.0247)));
        }
        else if (tickAnim >= 25 && tickAnim < 35) {
            xx = 24.7191 + (((tickAnim - 25) / 10) * (0-(24.7191)));
            yy = 6.8487 + (((tickAnim - 25) / 10) * (0-(6.8487)));
            zz = -6.0247 + (((tickAnim - 25) / 10) * (0-(-6.0247)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(armleft3, armleft3.rotateAngleX + (float) Math.toRadians(xx), armleft3.rotateAngleY + (float) Math.toRadians(yy), armleft3.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 0) / 13) * (31-(0)));
            yy = 0 + (((tickAnim - 0) / 13) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 13) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 25) {
            xx = 31 + (((tickAnim - 13) / 12) * (34.5-(31)));
            yy = 0 + (((tickAnim - 13) / 12) * (0-(0)));
            zz = 0 + (((tickAnim - 13) / 12) * (0-(0)));
        }
        else if (tickAnim >= 25 && tickAnim < 35) {
            xx = 34.5 + (((tickAnim - 25) / 10) * (0-(34.5)));
            yy = 0 + (((tickAnim - 25) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 25) / 10) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(legleft, legleft.rotateAngleX + (float) Math.toRadians(xx), legleft.rotateAngleY + (float) Math.toRadians(yy), legleft.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 0) / 13) * (-21.25-(0)));
            yy = 0 + (((tickAnim - 0) / 13) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 13) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 25) {
            xx = -21.25 + (((tickAnim - 13) / 12) * (-16.25-(-21.25)));
            yy = 0 + (((tickAnim - 13) / 12) * (0-(0)));
            zz = 0 + (((tickAnim - 13) / 12) * (0-(0)));
        }
        else if (tickAnim >= 25 && tickAnim < 35) {
            xx = -16.25 + (((tickAnim - 25) / 10) * (0-(-16.25)));
            yy = 0 + (((tickAnim - 25) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 25) / 10) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(legleft2, legleft2.rotateAngleX + (float) Math.toRadians(xx), legleft2.rotateAngleY + (float) Math.toRadians(yy), legleft2.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 0) / 13) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 13) * (-0.15-(0)));
            zz = 0 + (((tickAnim - 0) / 13) * (-0.125-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 25) {
            xx = 0 + (((tickAnim - 13) / 12) * (0-(0)));
            yy = -0.15 + (((tickAnim - 13) / 12) * (0-(-0.15)));
            zz = -0.125 + (((tickAnim - 13) / 12) * (0-(-0.125)));
        }
        else if (tickAnim >= 25 && tickAnim < 35) {
            xx = 0 + (((tickAnim - 25) / 10) * (0-(0)));
            yy = 0 + (((tickAnim - 25) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 25) / 10) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.legleft2.rotationPointX = this.legleft2.rotationPointX + (float)(xx);
        this.legleft2.rotationPointY = this.legleft2.rotationPointY - (float)(yy);
        this.legleft2.rotationPointZ = this.legleft2.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 0) / 13) * (-7.25-(0)));
            yy = 0 + (((tickAnim - 0) / 13) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 13) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 25) {
            xx = -7.25 + (((tickAnim - 13) / 12) * (-11.25-(-7.25)));
            yy = 0 + (((tickAnim - 13) / 12) * (0-(0)));
            zz = 0 + (((tickAnim - 13) / 12) * (0-(0)));
        }
        else if (tickAnim >= 25 && tickAnim < 35) {
            xx = -11.25 + (((tickAnim - 25) / 10) * (0-(-11.25)));
            yy = 0 + (((tickAnim - 25) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 25) / 10) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(legleft3, legleft3.rotateAngleX + (float) Math.toRadians(xx), legleft3.rotateAngleY + (float) Math.toRadians(yy), legleft3.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 0) / 13) * (22.25-(0)));
            yy = 0 + (((tickAnim - 0) / 13) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 13) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 25) {
            xx = 22.25 + (((tickAnim - 13) / 12) * (29.02-(22.25)));
            yy = 0 + (((tickAnim - 13) / 12) * (0-(0)));
            zz = 0 + (((tickAnim - 13) / 12) * (0-(0)));
        }
        else if (tickAnim >= 25 && tickAnim < 35) {
            xx = 29.02 + (((tickAnim - 25) / 10) * (0-(29.02)));
            yy = 0 + (((tickAnim - 25) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 25) / 10) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(fur, fur.rotateAngleX + (float) Math.toRadians(xx), fur.rotateAngleY + (float) Math.toRadians(yy), fur.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 0) / 13) * (37.5-(0)));
            yy = 0 + (((tickAnim - 0) / 13) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 13) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 25) {
            xx = 37.5 + (((tickAnim - 13) / 12) * (47.81-(37.5)));
            yy = 0 + (((tickAnim - 13) / 12) * (0-(0)));
            zz = 0 + (((tickAnim - 13) / 12) * (0-(0)));
        }
        else if (tickAnim >= 25 && tickAnim < 35) {
            xx = 47.81 + (((tickAnim - 25) / 10) * (0-(47.81)));
            yy = 0 + (((tickAnim - 25) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 25) / 10) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(fur2, fur2.rotateAngleX + (float) Math.toRadians(xx), fur2.rotateAngleY + (float) Math.toRadians(yy), fur2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 0) / 13) * (30.25-(0)));
            yy = 0 + (((tickAnim - 0) / 13) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 13) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 25) {
            xx = 30.25 + (((tickAnim - 13) / 12) * (42.46-(30.25)));
            yy = 0 + (((tickAnim - 13) / 12) * (0-(0)));
            zz = 0 + (((tickAnim - 13) / 12) * (0-(0)));
        }
        else if (tickAnim >= 25 && tickAnim < 35) {
            xx = 42.46 + (((tickAnim - 25) / 10) * (0-(42.46)));
            yy = 0 + (((tickAnim - 25) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 25) / 10) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(fur3, fur3.rotateAngleX + (float) Math.toRadians(xx), fur3.rotateAngleY + (float) Math.toRadians(yy), fur3.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 0) / 13) * (37.25-(0)));
            yy = 0 + (((tickAnim - 0) / 13) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 13) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 25) {
            xx = 37.25 + (((tickAnim - 13) / 12) * (51.19-(37.25)));
            yy = 0 + (((tickAnim - 13) / 12) * (0-(0)));
            zz = 0 + (((tickAnim - 13) / 12) * (0-(0)));
        }
        else if (tickAnim >= 25 && tickAnim < 35) {
            xx = 51.19 + (((tickAnim - 25) / 10) * (0-(51.19)));
            yy = 0 + (((tickAnim - 25) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 25) / 10) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(fur4, fur4.rotateAngleX + (float) Math.toRadians(xx), fur4.rotateAngleY + (float) Math.toRadians(yy), fur4.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 0) / 13) * (35.75-(0)));
            yy = 0 + (((tickAnim - 0) / 13) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 13) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 25) {
            xx = 35.75 + (((tickAnim - 13) / 12) * (51-(35.75)));
            yy = 0 + (((tickAnim - 13) / 12) * (0-(0)));
            zz = 0 + (((tickAnim - 13) / 12) * (0-(0)));
        }
        else if (tickAnim >= 25 && tickAnim < 35) {
            xx = 51 + (((tickAnim - 25) / 10) * (0-(51)));
            yy = 0 + (((tickAnim - 25) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 25) / 10) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(fur5, fur5.rotateAngleX + (float) Math.toRadians(xx), fur5.rotateAngleY + (float) Math.toRadians(yy), fur5.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 0) / 13) * (52.5-(0)));
            yy = 0 + (((tickAnim - 0) / 13) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 13) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 25) {
            xx = 52.5 + (((tickAnim - 13) / 12) * (62.73-(52.5)));
            yy = 0 + (((tickAnim - 13) / 12) * (0-(0)));
            zz = 0 + (((tickAnim - 13) / 12) * (0-(0)));
        }
        else if (tickAnim >= 25 && tickAnim < 35) {
            xx = 62.73 + (((tickAnim - 25) / 10) * (0-(62.73)));
            yy = 0 + (((tickAnim - 25) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 25) / 10) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(fur6, fur6.rotateAngleX + (float) Math.toRadians(xx), fur6.rotateAngleY + (float) Math.toRadians(yy), fur6.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 0) / 13) * (59-(0)));
            yy = 0 + (((tickAnim - 0) / 13) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 13) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 25) {
            xx = 59 + (((tickAnim - 13) / 12) * (72.48-(59)));
            yy = 0 + (((tickAnim - 13) / 12) * (0-(0)));
            zz = 0 + (((tickAnim - 13) / 12) * (0-(0)));
        }
        else if (tickAnim >= 25 && tickAnim < 35) {
            xx = 72.48 + (((tickAnim - 25) / 10) * (0-(72.48)));
            yy = 0 + (((tickAnim - 25) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 25) / 10) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(fur7, fur7.rotateAngleX + (float) Math.toRadians(xx), fur7.rotateAngleY + (float) Math.toRadians(yy), fur7.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 0) / 13) * (57.5-(0)));
            yy = 0 + (((tickAnim - 0) / 13) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 13) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 25) {
            xx = 57.5 + (((tickAnim - 13) / 12) * (69.79-(57.5)));
            yy = 0 + (((tickAnim - 13) / 12) * (0-(0)));
            zz = 0 + (((tickAnim - 13) / 12) * (0-(0)));
        }
        else if (tickAnim >= 25 && tickAnim < 35) {
            xx = 69.79 + (((tickAnim - 25) / 10) * (0-(69.79)));
            yy = 0 + (((tickAnim - 25) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 25) / 10) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(fur8, fur8.rotateAngleX + (float) Math.toRadians(xx), fur8.rotateAngleY + (float) Math.toRadians(yy), fur8.rotateAngleZ + (float) Math.toRadians(zz));


    }
    public void animStand(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime, double animTick) {
        EntityPrehistoricFloraSpinolestes entity = (EntityPrehistoricFloraSpinolestes) entitylivingbaseIn;
        int animCycle = 30;
        double tickAnim = animTick + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;
         if (tickAnim >= 0 && tickAnim < 13) {
            xx = -0-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*5 + (((tickAnim - 0) / 13) * (-4.5-(-0-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*5)));
            yy = 0 + (((tickAnim - 0) / 13) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 13) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 18) {
            xx = -4.5 + (((tickAnim - 13) / 5) * (-7.575-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*-5-(-4.5)));
            yy = 0 + (((tickAnim - 13) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 13) / 5) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 30) {
            xx = -7.575-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*-5 + (((tickAnim - 18) / 12) * (0-(-7.575-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*-5)));
            yy = 0 + (((tickAnim - 18) / 12) * (0-(0)));
            zz = 0 + (((tickAnim - 18) / 12) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(body, body.rotateAngleX + (float) Math.toRadians(xx), body.rotateAngleY + (float) Math.toRadians(yy), body.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 13) {
            xx = -0-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*-30 + (((tickAnim - 0) / 13) * (13-(-0-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*-30)));
            yy = 0 + (((tickAnim - 0) / 13) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 13) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 18) {
            xx = 13 + (((tickAnim - 13) / 5) * (13-(13)));
            yy = 0 + (((tickAnim - 13) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 13) / 5) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 30) {
            xx = 13 + (((tickAnim - 18) / 12) * (0-(13)));
            yy = 0 + (((tickAnim - 18) / 12) * (0-(0)));
            zz = 0 + (((tickAnim - 18) / 12) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(chest, chest.rotateAngleX + (float) Math.toRadians(xx), chest.rotateAngleY + (float) Math.toRadians(yy), chest.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 18) {
            xx = -0-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*-50 + (((tickAnim - 0) / 18) * (12.25-(-0-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*-50)));
            yy = 0 + (((tickAnim - 0) / 18) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 18) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 30) {
            xx = 12.25 + (((tickAnim - 18) / 12) * (-48.2-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*-50-(12.25)));
            yy = 0 + (((tickAnim - 18) / 12) * (0-(0)));
            zz = 0 + (((tickAnim - 18) / 12) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck, neck.rotateAngleX + (float) Math.toRadians(xx), neck.rotateAngleY + (float) Math.toRadians(yy), neck.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 13) {
            xx = -0-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*50 + (((tickAnim - 0) / 13) * (-32.5-(-0-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*50)));
            yy = 0 + (((tickAnim - 0) / 13) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 13) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 18) {
            xx = -32.5 + (((tickAnim - 13) / 5) * (-32.5-(-32.5)));
            yy = 0 + (((tickAnim - 13) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 13) / 5) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 30) {
            xx = -32.5 + (((tickAnim - 18) / 12) * (0-(-32.5)));
            yy = 0 + (((tickAnim - 18) / 12) * (0-(0)));
            zz = 0 + (((tickAnim - 18) / 12) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(head, head.rotateAngleX + (float) Math.toRadians(xx), head.rotateAngleY + (float) Math.toRadians(yy), head.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 13) {
            xx = -0-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*-40 + (((tickAnim - 0) / 13) * (32.55-(-0-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*-40)));
            yy = 0 + (((tickAnim - 0) / 13) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 13) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 18) {
            xx = 32.55 + (((tickAnim - 13) / 5) * (34.75-(32.55)));
            yy = 0 + (((tickAnim - 13) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 13) / 5) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 30) {
            xx = 34.75 + (((tickAnim - 18) / 12) * (0-(34.75)));
            yy = 0 + (((tickAnim - 18) / 12) * (0-(0)));
            zz = 0 + (((tickAnim - 18) / 12) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(jaw, jaw.rotateAngleX + (float) Math.toRadians(xx), jaw.rotateAngleY + (float) Math.toRadians(yy), jaw.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 4) {
            xx = 0 + (((tickAnim - 0) / 4) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 4) * (0-(0)));
        }
        else if (tickAnim >= 4 && tickAnim < 18) {
            xx = 0 + (((tickAnim - 4) / 14) * (-29.25-(0)));
            yy = 0 + (((tickAnim - 4) / 14) * (0-(0)));
            zz = 0 + (((tickAnim - 4) / 14) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 30) {
            xx = -29.25 + (((tickAnim - 18) / 12) * (0-(-29.25)));
            yy = 0 + (((tickAnim - 18) / 12) * (0-(0)));
            zz = 0 + (((tickAnim - 18) / 12) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(earright, earright.rotateAngleX + (float) Math.toRadians(xx), earright.rotateAngleY + (float) Math.toRadians(yy), earright.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 4) {
            xx = 0 + (((tickAnim - 0) / 4) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 4) * (0-(0)));
        }
        else if (tickAnim >= 4 && tickAnim < 18) {
            xx = 0 + (((tickAnim - 4) / 14) * (0-(0)));
            yy = 0 + (((tickAnim - 4) / 14) * (-0.275-(0)));
            zz = 0 + (((tickAnim - 4) / 14) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 30) {
            xx = 0 + (((tickAnim - 18) / 12) * (0-(0)));
            yy = -0.275 + (((tickAnim - 18) / 12) * (0-(-0.275)));
            zz = 0 + (((tickAnim - 18) / 12) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.earright.rotationPointX = this.earright.rotationPointX + (float)(xx);
        this.earright.rotationPointY = this.earright.rotationPointY - (float)(yy);
        this.earright.rotationPointZ = this.earright.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 4) {
            xx = 0 + (((tickAnim - 0) / 4) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 4) * (0-(0)));
        }
        else if (tickAnim >= 4 && tickAnim < 18) {
            xx = 0 + (((tickAnim - 4) / 14) * (-29.25-(0)));
            yy = 0 + (((tickAnim - 4) / 14) * (0-(0)));
            zz = 0 + (((tickAnim - 4) / 14) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 30) {
            xx = -29.25 + (((tickAnim - 18) / 12) * (0-(-29.25)));
            yy = 0 + (((tickAnim - 18) / 12) * (0-(0)));
            zz = 0 + (((tickAnim - 18) / 12) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(earleft, earleft.rotateAngleX + (float) Math.toRadians(xx), earleft.rotateAngleY + (float) Math.toRadians(yy), earleft.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 4) {
            xx = 0 + (((tickAnim - 0) / 4) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 4) * (0-(0)));
        }
        else if (tickAnim >= 4 && tickAnim < 18) {
            xx = 0 + (((tickAnim - 4) / 14) * (0-(0)));
            yy = 0 + (((tickAnim - 4) / 14) * (-0.275-(0)));
            zz = 0 + (((tickAnim - 4) / 14) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 30) {
            xx = 0 + (((tickAnim - 18) / 12) * (0-(0)));
            yy = -0.275 + (((tickAnim - 18) / 12) * (0-(-0.275)));
            zz = 0 + (((tickAnim - 18) / 12) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.earleft.rotationPointX = this.earleft.rotationPointX + (float)(xx);
        this.earleft.rotationPointY = this.earleft.rotationPointY - (float)(yy);
        this.earleft.rotationPointZ = this.earleft.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 13) {
            xx = -0-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*-30 + (((tickAnim - 0) / 13) * (18.75-(-0-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*-30)));
            yy = 0 + (((tickAnim - 0) / 13) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 13) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 18) {
            xx = 18.75 + (((tickAnim - 13) / 5) * (31.275-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*20-(18.75)));
            yy = 0 + (((tickAnim - 13) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 13) / 5) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 30) {
            xx = 31.275-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*20 + (((tickAnim - 18) / 12) * (0-(31.275-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*20)));
            yy = 0 + (((tickAnim - 18) / 12) * (0-(0)));
            zz = 0 + (((tickAnim - 18) / 12) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(fur2, fur2.rotateAngleX + (float) Math.toRadians(xx), fur2.rotateAngleY + (float) Math.toRadians(yy), fur2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 0) / 13) * (10.5-(0)));
            yy = 0 + (((tickAnim - 0) / 13) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 13) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 18) {
            xx = 10.5 + (((tickAnim - 13) / 5) * (10.5-(10.5)));
            yy = 0 + (((tickAnim - 13) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 13) / 5) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 30) {
            xx = 10.5 + (((tickAnim - 18) / 12) * (0-(10.5)));
            yy = 0 + (((tickAnim - 18) / 12) * (0-(0)));
            zz = 0 + (((tickAnim - 18) / 12) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(fur3, fur3.rotateAngleX + (float) Math.toRadians(xx), fur3.rotateAngleY + (float) Math.toRadians(yy), fur3.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 0) / 13) * (13.5-(0)));
            yy = 0 + (((tickAnim - 0) / 13) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 13) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 18) {
            xx = 13.5 + (((tickAnim - 13) / 5) * (13.5-(13.5)));
            yy = 0 + (((tickAnim - 13) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 13) / 5) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 30) {
            xx = 13.5 + (((tickAnim - 18) / 12) * (0-(13.5)));
            yy = 0 + (((tickAnim - 18) / 12) * (0-(0)));
            zz = 0 + (((tickAnim - 18) / 12) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(fur4, fur4.rotateAngleX + (float) Math.toRadians(xx), fur4.rotateAngleY + (float) Math.toRadians(yy), fur4.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 0) / 13) * (11.75-(0)));
            yy = 0 + (((tickAnim - 0) / 13) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 13) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 18) {
            xx = 11.75 + (((tickAnim - 13) / 5) * (11.75-(11.75)));
            yy = 0 + (((tickAnim - 13) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 13) / 5) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 30) {
            xx = 11.75 + (((tickAnim - 18) / 12) * (0-(11.75)));
            yy = 0 + (((tickAnim - 18) / 12) * (0-(0)));
            zz = 0 + (((tickAnim - 18) / 12) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(fur5, fur5.rotateAngleX + (float) Math.toRadians(xx), fur5.rotateAngleY + (float) Math.toRadians(yy), fur5.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 13) {
            xx = 1 + (((tickAnim - 0) / 13) * (1-(1)));
            yy = 1 + (((tickAnim - 0) / 13) * (0.0275-(1)));
            zz = 1 + (((tickAnim - 0) / 13) * (1-(1)));
        }
        else if (tickAnim >= 13 && tickAnim < 18) {
            xx = 1 + (((tickAnim - 13) / 5) * (1-(1)));
            yy = 0.0275 + (((tickAnim - 13) / 5) * (0.0275-(0.0275)));
            zz = 1 + (((tickAnim - 13) / 5) * (1-(1)));
        }
        else if (tickAnim >= 18 && tickAnim < 30) {
            xx = 1 + (((tickAnim - 18) / 12) * (1-(1)));
            yy = 0.0275 + (((tickAnim - 18) / 12) * (1-(0.0275)));
            zz = 1 + (((tickAnim - 18) / 12) * (1-(1)));
        }
        else {
            xx = 1;
            yy = 1;
            zz = 1;
        }
        this.eyes.setScale((float)xx, (float)yy, (float)zz);


    }
    public void animWalking(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime) {
        EntityPrehistoricFloraSpinolestes entity = (EntityPrehistoricFloraSpinolestes) entitylivingbaseIn;
        int animCycle = 20;
        double tickAnim = (entity.ticksExisted + entity.getTickOffset()) - (int) (Math.floor((double) (entity.ticksExisted + entity.getTickOffset()) / (double) animCycle) * (double) animCycle) + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;
        this.setRotateAngle(hips, hips.rotateAngleX + (float) Math.toRadians(-0-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/0.5-50))*4), hips.rotateAngleY + (float) Math.toRadians(-0-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360))*2), hips.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360-100))*-2));
        this.hips.rotationPointX = this.hips.rotationPointX + (float)(0);
        this.hips.rotationPointY = this.hips.rotationPointY - (float)(1.3+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/0.5+80))*0.5);
        this.hips.rotationPointZ = this.hips.rotationPointZ + (float)(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/0.5-30))*0.7);


        this.setRotateAngle(body, body.rotateAngleX + (float) Math.toRadians(-0-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/0.5-65))*-5), body.rotateAngleY + (float) Math.toRadians(-0-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360-50))*-3), body.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(chest, chest.rotateAngleX + (float) Math.toRadians(-0-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/0.5-150))*5), chest.rotateAngleY + (float) Math.toRadians(-0-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360-100))*3), chest.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360-100))*2));


        this.setRotateAngle(neck, neck.rotateAngleX + (float) Math.toRadians(-0-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/0.5-200))*-5), neck.rotateAngleY + (float) Math.toRadians(0), neck.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(head, head.rotateAngleX + (float) Math.toRadians(0), head.rotateAngleY + (float) Math.toRadians(0), head.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(tail, tail.rotateAngleX + (float) Math.toRadians(-0-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/0.5-150))*4), tail.rotateAngleY + (float) Math.toRadians(-0-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360-50))*2), tail.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(tail2, tail2.rotateAngleX + (float) Math.toRadians(-0-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/0.5-250))*4), tail2.rotateAngleY + (float) Math.toRadians(-0-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360-100))*4), tail2.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(tail3, tail3.rotateAngleX + (float) Math.toRadians(-0-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/0.5-300))*7), tail3.rotateAngleY + (float) Math.toRadians(-0-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360-150))*8), tail3.rotateAngleZ + (float) Math.toRadians(0));



        if (tickAnim >= 0 && tickAnim < 3) {
            xx = -0.5-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*30 + (((tickAnim - 0) / 3) * (10.95-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*-100-(-0.5-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*30)));
            yy = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 3) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 12) {
            xx = 10.95-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*-100 + (((tickAnim - 3) / 9) * (68.423-(10.95-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*-100)));
            yy = 0 + (((tickAnim - 3) / 9) * (-10.9349-(0)));
            zz = 0 + (((tickAnim - 3) / 9) * (4.4042-(0)));
        }
        else if (tickAnim >= 12 && tickAnim < 20) {
            xx = 68.423 + (((tickAnim - 12) / 8) * (-38.77-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*-50-(68.423)));
            yy = -10.9349 + (((tickAnim - 12) / 8) * (0-(-10.9349)));
            zz = 4.4042 + (((tickAnim - 12) / 8) * (0-(4.4042)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(legright, legright.rotateAngleX + (float) Math.toRadians(xx), legright.rotateAngleY + (float) Math.toRadians(yy), legright.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 3) {
            xx = -8.8 + (((tickAnim - 0) / 3) * (-40-(-8.8)));
            yy = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 3) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 12) {
            xx = -40 + (((tickAnim - 3) / 9) * (25.75-(-40)));
            yy = 0 + (((tickAnim - 3) / 9) * (0-(0)));
            zz = 0 + (((tickAnim - 3) / 9) * (0-(0)));
        }
        else if (tickAnim >= 12 && tickAnim < 15) {
            xx = 25.75 + (((tickAnim - 12) / 3) * (29.35-(25.75)));
            yy = 0 + (((tickAnim - 12) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 12) / 3) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 20) {
            xx = 29.35 + (((tickAnim - 15) / 5) * (-8.8-(29.35)));
            yy = 0 + (((tickAnim - 15) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 5) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(legright2, legright2.rotateAngleX + (float) Math.toRadians(xx), legright2.rotateAngleY + (float) Math.toRadians(yy), legright2.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 3) * (-0.25-(0)));
            zz = 0 + (((tickAnim - 0) / 3) * (-0.15-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 12) {
            xx = 0 + (((tickAnim - 3) / 9) * (0-(0)));
            yy = -0.25 + (((tickAnim - 3) / 9) * (0-(-0.25)));
            zz = -0.15 + (((tickAnim - 3) / 9) * (-0.675-(-0.15)));
        }
        else if (tickAnim >= 12 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 12) / 3) * (0-(0)));
            yy = 0 + (((tickAnim - 12) / 3) * (0-(0)));
            zz = -0.675 + (((tickAnim - 12) / 3) * (-0.755-(-0.675)));
        }
        else if (tickAnim >= 15 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 15) / 5) * (0-(0)));
            yy = 0 + (((tickAnim - 15) / 5) * (0-(0)));
            zz = -0.755 + (((tickAnim - 15) / 5) * (0-(-0.755)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.legright2.rotationPointX = this.legright2.rotationPointX + (float)(xx);
        this.legright2.rotationPointY = this.legright2.rotationPointY - (float)(yy);
        this.legright2.rotationPointZ = this.legright2.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 3) {
            xx = -12.2614 + (((tickAnim - 0) / 3) * (17.7386-(-12.2614)));
            yy = -8.3977 + (((tickAnim - 0) / 3) * (-8.3977-(-8.3977)));
            zz = -3.2485 + (((tickAnim - 0) / 3) * (-3.2485-(-3.2485)));
        }
        else if (tickAnim >= 3 && tickAnim < 6) {
            xx = 17.7386 + (((tickAnim - 3) / 3) * (-22.4833-(17.7386)));
            yy = -8.3977 + (((tickAnim - 3) / 3) * (-6.1583-(-8.3977)));
            zz = -3.2485 + (((tickAnim - 3) / 3) * (-2.3823-(-3.2485)));
        }
        else if (tickAnim >= 6 && tickAnim < 8) {
            xx = -22.4833 + (((tickAnim - 6) / 2) * (-41.2053-(-22.4833)));
            yy = -6.1583 + (((tickAnim - 6) / 2) * (-3.9189-(-6.1583)));
            zz = -2.3823 + (((tickAnim - 6) / 2) * (-1.516-(-2.3823)));
        }
        else if (tickAnim >= 8 && tickAnim < 12) {
            xx = -41.2053 + (((tickAnim - 8) / 4) * (-16.25-(-41.2053)));
            yy = -3.9189 + (((tickAnim - 8) / 4) * (0-(-3.9189)));
            zz = -1.516 + (((tickAnim - 8) / 4) * (0-(-1.516)));
        }
        else if (tickAnim >= 12 && tickAnim < 15) {
            xx = -16.25 + (((tickAnim - 12) / 3) * (-56.5041-(-16.25)));
            yy = 0 + (((tickAnim - 12) / 3) * (3.0537-(0)));
            zz = 0 + (((tickAnim - 12) / 3) * (1.1813-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 20) {
            xx = -56.5041 + (((tickAnim - 15) / 5) * (-12.2614-(-56.5041)));
            yy = 3.0537 + (((tickAnim - 15) / 5) * (-8.3977-(3.0537)));
            zz = 1.1813 + (((tickAnim - 15) / 5) * (-3.2485-(1.1813)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(legright3, legright3.rotateAngleX + (float) Math.toRadians(xx), legright3.rotateAngleY + (float) Math.toRadians(yy), legright3.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 0 + (((tickAnim - 0) / 3) * (0.02-(0)));
            yy = 0 + (((tickAnim - 0) / 3) * (0.495-(0)));
            zz = 0 + (((tickAnim - 0) / 3) * (0.14-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 6) {
            xx = 0.02 + (((tickAnim - 3) / 3) * (0.04-(0.02)));
            yy = 0.495 + (((tickAnim - 3) / 3) * (1.175-(0.495)));
            zz = 0.14 + (((tickAnim - 3) / 3) * (0.525-(0.14)));
        }
        else if (tickAnim >= 6 && tickAnim < 8) {
            xx = 0.04 + (((tickAnim - 6) / 2) * (0.05-(0.04)));
            yy = 1.175 + (((tickAnim - 6) / 2) * (0.55-(1.175)));
            zz = 0.525 + (((tickAnim - 6) / 2) * (0.355-(0.525)));
        }
        else if (tickAnim >= 8 && tickAnim < 12) {
            xx = 0.05 + (((tickAnim - 8) / 4) * (0.1-(0.05)));
            yy = 0.55 + (((tickAnim - 8) / 4) * (0.7-(0.55)));
            zz = 0.355 + (((tickAnim - 8) / 4) * (-0.075-(0.355)));
        }
        else if (tickAnim >= 12 && tickAnim < 15) {
            xx = 0.1 + (((tickAnim - 12) / 3) * (0.1-(0.1)));
            yy = 0.7 + (((tickAnim - 12) / 3) * (0.2-(0.7)));
            zz = -0.075 + (((tickAnim - 12) / 3) * (0-(-0.075)));
        }
        else if (tickAnim >= 15 && tickAnim < 20) {
            xx = 0.1 + (((tickAnim - 15) / 5) * (0-(0.1)));
            yy = 0.2 + (((tickAnim - 15) / 5) * (0-(0.2)));
            zz = 0 + (((tickAnim - 15) / 5) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.legright3.rotationPointX = this.legright3.rotationPointX + (float)(xx);
        this.legright3.rotationPointY = this.legright3.rotationPointY - (float)(yy);
        this.legright3.rotationPointZ = this.legright3.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 4) {
            xx = 2.75 + (((tickAnim - 0) / 4) * (10.005-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*250-(2.75)));
            yy = 0 + (((tickAnim - 0) / 4) * (9.4936-(0)));
            zz = 0 + (((tickAnim - 0) / 4) * (8.4648-(0)));
        }
        else if (tickAnim >= 4 && tickAnim < 10) {
            xx = 10.005-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*250 + (((tickAnim - 4) / 6) * (-74.6118-(10.005-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*250)));
            yy = 9.4936 + (((tickAnim - 4) / 6) * (15.4806-(9.4936)));
            zz = 8.4648 + (((tickAnim - 4) / 6) * (-2.9782-(8.4648)));
        }
        else if (tickAnim >= 10 && tickAnim < 20) {
            xx = -74.6118 + (((tickAnim - 10) / 10) * (2.75-(-74.6118)));
            yy = 15.4806 + (((tickAnim - 10) / 10) * (0-(15.4806)));
            zz = -2.9782 + (((tickAnim - 10) / 10) * (0-(-2.9782)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(armright, armright.rotateAngleX + (float) Math.toRadians(xx), armright.rotateAngleY + (float) Math.toRadians(yy), armright.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 10) * (0.15-(0)));
            zz = 0.175 + (((tickAnim - 0) / 10) * (0.4-(0.175)));
        }
        else if (tickAnim >= 10 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 10) / 10) * (0-(0)));
            yy = 0.15 + (((tickAnim - 10) / 10) * (0-(0.15)));
            zz = 0.4 + (((tickAnim - 10) / 10) * (0.175-(0.4)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.armright.rotationPointX = this.armright.rotationPointX + (float)(xx);
        this.armright.rotationPointY = this.armright.rotationPointY - (float)(yy);
        this.armright.rotationPointZ = this.armright.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 4) {
            xx = 52 + (((tickAnim - 0) / 4) * (-25.733-(52)));
            yy = 0 + (((tickAnim - 0) / 4) * (12.8092-(0)));
            zz = 0 + (((tickAnim - 0) / 4) * (-4.2997-(0)));
        }
        else if (tickAnim >= 4 && tickAnim < 10) {
            xx = -25.733 + (((tickAnim - 4) / 6) * (52-(-25.733)));
            yy = 12.8092 + (((tickAnim - 4) / 6) * (0-(12.8092)));
            zz = -4.2997 + (((tickAnim - 4) / 6) * (0-(-4.2997)));
        }
        else if (tickAnim >= 10 && tickAnim < 20) {
            xx = 52 + (((tickAnim - 10) / 10) * (52-(52)));
            yy = 0 + (((tickAnim - 10) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 10) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(armright2, armright2.rotateAngleX + (float) Math.toRadians(xx), armright2.rotateAngleY + (float) Math.toRadians(yy), armright2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 95.7012 + (((tickAnim - 0) / 3) * (134.6402-(95.7012)));
            yy = -5.1191 + (((tickAnim - 0) / 3) * (-8.9561-(-5.1191)));
            zz = -17.5008 + (((tickAnim - 0) / 3) * (-8.4908-(-17.5008)));
        }
        else if (tickAnim >= 3 && tickAnim < 6) {
            xx = 134.6402 + (((tickAnim - 3) / 3) * (94.0791-(134.6402)));
            yy = -8.9561 + (((tickAnim - 3) / 3) * (-12.7931-(-8.9561)));
            zz = -8.4908 + (((tickAnim - 3) / 3) * (0.5192-(-8.4908)));
        }
        else if (tickAnim >= 6 && tickAnim < 10) {
            xx = 94.0791 + (((tickAnim - 6) / 4) * (26.4314-(94.0791)));
            yy = -12.7931 + (((tickAnim - 6) / 4) * (-10.482-(-12.7931)));
            zz = 0.5192 + (((tickAnim - 6) / 4) * (-6.2313-(0.5192)));
        }
        else if (tickAnim >= 10 && tickAnim < 15) {
            xx = 26.4314 + (((tickAnim - 10) / 5) * (-13.0226-(26.4314)));
            yy = -10.482 + (((tickAnim - 10) / 5) * (-5.3446-(-10.482)));
            zz = -6.2313 + (((tickAnim - 10) / 5) * (-7.067-(-6.2313)));
        }
        else if (tickAnim >= 15 && tickAnim < 20) {
            xx = -13.0226 + (((tickAnim - 15) / 5) * (95.7012-(-13.0226)));
            yy = -5.3446 + (((tickAnim - 15) / 5) * (-5.1191-(-5.3446)));
            zz = -7.067 + (((tickAnim - 15) / 5) * (-17.5008-(-7.067)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(armright3, armright3.rotateAngleX + (float) Math.toRadians(xx), armright3.rotateAngleY + (float) Math.toRadians(yy), armright3.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 3) * (0.41-(0)));
            zz = 0 + (((tickAnim - 0) / 3) * (-0.39-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 6) {
            xx = 0 + (((tickAnim - 3) / 3) * (0-(0)));
            yy = 0.41 + (((tickAnim - 3) / 3) * (0.825-(0.41)));
            zz = -0.39 + (((tickAnim - 3) / 3) * (-0.275-(-0.39)));
        }
        else if (tickAnim >= 6 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 6) / 4) * (0-(0)));
            yy = 0.825 + (((tickAnim - 6) / 4) * (0.1-(0.825)));
            zz = -0.275 + (((tickAnim - 6) / 4) * (0.525-(-0.275)));
        }
        else if (tickAnim >= 10 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 10) / 5) * (0-(0)));
            yy = 0.1 + (((tickAnim - 10) / 5) * (0.375+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50-50))*-3-(0.1)));
            zz = 0.525 + (((tickAnim - 10) / 5) * (0-(0.525)));
        }
        else if (tickAnim >= 15 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 15) / 5) * (0-(0)));
            yy = 0.375+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50-50))*-3 + (((tickAnim - 15) / 5) * (0-(0.375+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50-50))*-3)));
            zz = 0 + (((tickAnim - 15) / 5) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.armright3.rotationPointX = this.armright3.rotationPointX + (float)(xx);
        this.armright3.rotationPointY = this.armright3.rotationPointY - (float)(yy);
        this.armright3.rotationPointZ = this.armright3.rotationPointZ + (float)(zz);



        this.setRotateAngle(earright, earright.rotateAngleX + (float) Math.toRadians(-0-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/0.5-150))*8), earright.rotateAngleY + (float) Math.toRadians(0), earright.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(earleft, earleft.rotateAngleX + (float) Math.toRadians(-0-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/0.5-150))*8), earleft.rotateAngleY + (float) Math.toRadians(0), earleft.rotateAngleZ + (float) Math.toRadians(0));



        if (tickAnim >= 0 && tickAnim < 11) {
            xx = -74.6118 + (((tickAnim - 0) / 11) * (-0.5-(-74.6118)));
            yy = -15.4806 + (((tickAnim - 0) / 11) * (0-(-15.4806)));
            zz = 2.9782 + (((tickAnim - 0) / 11) * (0-(2.9782)));
        }
        else if (tickAnim >= 11 && tickAnim < 15) {
            xx = -0.5 + (((tickAnim - 11) / 4) * (173.98-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*350-(-0.5)));
            yy = 0 + (((tickAnim - 11) / 4) * (-9.4936-(0)));
            zz = 0 + (((tickAnim - 11) / 4) * (-8.4648-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 20) {
            xx = 173.98-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*350 + (((tickAnim - 15) / 5) * (-74.6118-(173.98-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*350)));
            yy = -9.4936 + (((tickAnim - 15) / 5) * (-15.4806-(-9.4936)));
            zz = -8.4648 + (((tickAnim - 15) / 5) * (2.9782-(-8.4648)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(armleft, armleft.rotateAngleX + (float) Math.toRadians(xx), armleft.rotateAngleY + (float) Math.toRadians(yy), armleft.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 11) {
            xx = 0 + (((tickAnim - 0) / 11) * (0-(0)));
            yy = 0.15 + (((tickAnim - 0) / 11) * (0-(0.15)));
            zz = 0.4 + (((tickAnim - 0) / 11) * (0.175-(0.4)));
        }
        else if (tickAnim >= 11 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 11) / 9) * (0-(0)));
            yy = 0 + (((tickAnim - 11) / 9) * (0.15-(0)));
            zz = 0.175 + (((tickAnim - 11) / 9) * (0.4-(0.175)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.armleft.rotationPointX = this.armleft.rotationPointX + (float)(xx);
        this.armleft.rotationPointY = this.armleft.rotationPointY - (float)(yy);
        this.armleft.rotationPointZ = this.armleft.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 11) {
            xx = 52 + (((tickAnim - 0) / 11) * (52-(52)));
            yy = 0 + (((tickAnim - 0) / 11) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 11) * (0-(0)));
        }
        else if (tickAnim >= 11 && tickAnim < 15) {
            xx = 52 + (((tickAnim - 11) / 4) * (-21.983-(52)));
            yy = 0 + (((tickAnim - 11) / 4) * (-12.8092-(0)));
            zz = 0 + (((tickAnim - 11) / 4) * (4.2997-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 20) {
            xx = -21.983 + (((tickAnim - 15) / 5) * (52-(-21.983)));
            yy = -12.8092 + (((tickAnim - 15) / 5) * (0-(-12.8092)));
            zz = 4.2997 + (((tickAnim - 15) / 5) * (0-(4.2997)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(armleft2, armleft2.rotateAngleX + (float) Math.toRadians(xx), armleft2.rotateAngleY + (float) Math.toRadians(yy), armleft2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 5) {
            xx = 26.4314 + (((tickAnim - 0) / 5) * (-7.2726-(26.4314)));
            yy = 10.482 + (((tickAnim - 0) / 5) * (5.3446-(10.482)));
            zz = 6.2313 + (((tickAnim - 0) / 5) * (7.067-(6.2313)));
        }
        else if (tickAnim >= 5 && tickAnim < 8) {
            xx = -7.2726 + (((tickAnim - 5) / 3) * (-2.2831-(-7.2726)));
            yy = 5.3446 + (((tickAnim - 5) / 3) * (5.2544-(5.3446)));
            zz = 7.067 + (((tickAnim - 5) / 3) * (11.2405-(7.067)));
        }
        else if (tickAnim >= 8 && tickAnim < 11) {
            xx = -2.2831 + (((tickAnim - 8) / 3) * (95.7012-(-2.2831)));
            yy = 5.2544 + (((tickAnim - 8) / 3) * (5.1191-(5.2544)));
            zz = 11.2405 + (((tickAnim - 8) / 3) * (17.5008-(11.2405)));
        }
        else if (tickAnim >= 11 && tickAnim < 14) {
            xx = 95.7012 + (((tickAnim - 11) / 3) * (134.6402-(95.7012)));
            yy = 5.1191 + (((tickAnim - 11) / 3) * (8.9561-(5.1191)));
            zz = 17.5008 + (((tickAnim - 11) / 3) * (8.4908-(17.5008)));
        }
        else if (tickAnim >= 14 && tickAnim < 17) {
            xx = 134.6402 + (((tickAnim - 14) / 3) * (94.0791-(134.6402)));
            yy = 8.9561 + (((tickAnim - 14) / 3) * (12.7931-(8.9561)));
            zz = 8.4908 + (((tickAnim - 14) / 3) * (-0.5192-(8.4908)));
        }
        else if (tickAnim >= 17 && tickAnim < 20) {
            xx = 94.0791 + (((tickAnim - 17) / 3) * (26.4314-(94.0791)));
            yy = 12.7931 + (((tickAnim - 17) / 3) * (10.482-(12.7931)));
            zz = -0.5192 + (((tickAnim - 17) / 3) * (6.2313-(-0.5192)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(armleft3, armleft3.rotateAngleX + (float) Math.toRadians(xx), armleft3.rotateAngleY + (float) Math.toRadians(yy), armleft3.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 0) / 5) * (0-(0)));
            yy = 0.05 + (((tickAnim - 0) / 5) * (-4.825+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50-50))*-10-(0.05)));
            zz = 0 + (((tickAnim - 0) / 5) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 11) {
            xx = 0 + (((tickAnim - 5) / 6) * (0-(0)));
            yy = -4.825+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50-50))*-10 + (((tickAnim - 5) / 6) * (0-(-4.825+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50-50))*-10)));
            zz = 0 + (((tickAnim - 5) / 6) * (0-(0)));
        }
        else if (tickAnim >= 11 && tickAnim < 14) {
            xx = 0 + (((tickAnim - 11) / 3) * (0-(0)));
            yy = 0 + (((tickAnim - 11) / 3) * (0.41-(0)));
            zz = 0 + (((tickAnim - 11) / 3) * (-0.39-(0)));
        }
        else if (tickAnim >= 14 && tickAnim < 17) {
            xx = 0 + (((tickAnim - 14) / 3) * (0-(0)));
            yy = 0.41 + (((tickAnim - 14) / 3) * (0.825-(0.41)));
            zz = -0.39 + (((tickAnim - 14) / 3) * (-0.275-(-0.39)));
        }
        else if (tickAnim >= 17 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 17) / 3) * (0-(0)));
            yy = 0.825 + (((tickAnim - 17) / 3) * (0.05-(0.825)));
            zz = -0.275 + (((tickAnim - 17) / 3) * (0-(-0.275)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.armleft3.rotationPointX = this.armleft3.rotationPointX + (float)(xx);
        this.armleft3.rotationPointY = this.armleft3.rotationPointY - (float)(yy);
        this.armleft3.rotationPointZ = this.armleft3.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 9) {
            xx = 73.673-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*50 + (((tickAnim - 0) / 9) * (-1.5-(73.673-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*50)));
            yy = 10.9349 + (((tickAnim - 0) / 9) * (0-(10.9349)));
            zz = -4.4042 + (((tickAnim - 0) / 9) * (0-(-4.4042)));
        }
        else if (tickAnim >= 9 && tickAnim < 13) {
            xx = -1.5 + (((tickAnim - 9) / 4) * (-44.2-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*-130-(-1.5)));
            yy = 0 + (((tickAnim - 9) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 9) / 4) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 20) {
            xx = -44.2-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*-130 + (((tickAnim - 13) / 7) * (73.673-(-44.2-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*-130)));
            yy = 0 + (((tickAnim - 13) / 7) * (10.9349-(0)));
            zz = 0 + (((tickAnim - 13) / 7) * (-4.4042-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(legleft, legleft.rotateAngleX + (float) Math.toRadians(xx), legleft.rotateAngleY + (float) Math.toRadians(yy), legleft.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 25.75 + (((tickAnim - 0) / 3) * (29.35-(25.75)));
            yy = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 3) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 9) {
            xx = 29.35 + (((tickAnim - 3) / 6) * (-8.8-(29.35)));
            yy = 0 + (((tickAnim - 3) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 3) / 6) * (0-(0)));
        }
        else if (tickAnim >= 9 && tickAnim < 13) {
            xx = -8.8 + (((tickAnim - 9) / 4) * (-40-(-8.8)));
            yy = 0 + (((tickAnim - 9) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 9) / 4) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 20) {
            xx = -40 + (((tickAnim - 13) / 7) * (25.75-(-40)));
            yy = 0 + (((tickAnim - 13) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 13) / 7) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(legleft2, legleft2.rotateAngleX + (float) Math.toRadians(xx), legleft2.rotateAngleY + (float) Math.toRadians(yy), legleft2.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            zz = -0.675 + (((tickAnim - 0) / 3) * (-0.755-(-0.675)));
        }
        else if (tickAnim >= 3 && tickAnim < 9) {
            xx = 0 + (((tickAnim - 3) / 6) * (0-(0)));
            yy = 0 + (((tickAnim - 3) / 6) * (0-(0)));
            zz = -0.755 + (((tickAnim - 3) / 6) * (0-(-0.755)));
        }
        else if (tickAnim >= 9 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 9) / 4) * (0-(0)));
            yy = 0 + (((tickAnim - 9) / 4) * (-0.25-(0)));
            zz = 0 + (((tickAnim - 9) / 4) * (-0.15-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 13) / 2) * (0-(0)));
            yy = -0.25 + (((tickAnim - 13) / 2) * (0-(-0.25)));
            zz = -0.15 + (((tickAnim - 13) / 2) * (0-(-0.15)));
        }
        else if (tickAnim >= 15 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 15) / 5) * (0-(0)));
            yy = 0 + (((tickAnim - 15) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 5) * (-0.675-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.legleft2.rotationPointX = this.legleft2.rotationPointX + (float)(xx);
        this.legleft2.rotationPointY = this.legleft2.rotationPointY - (float)(yy);
        this.legleft2.rotationPointZ = this.legleft2.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 3) {
            xx = -19 + (((tickAnim - 0) / 3) * (-56.5041-(-19)));
            yy = 0 + (((tickAnim - 0) / 3) * (3.0537-(0)));
            zz = 0 + (((tickAnim - 0) / 3) * (1.1813-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 9) {
            xx = -56.5041 + (((tickAnim - 3) / 6) * (-12.2614-(-56.5041)));
            yy = 3.0537 + (((tickAnim - 3) / 6) * (8.3977-(3.0537)));
            zz = 1.1813 + (((tickAnim - 3) / 6) * (3.2485-(1.1813)));
        }
        else if (tickAnim >= 9 && tickAnim < 13) {
            xx = -12.2614 + (((tickAnim - 9) / 4) * (17.4886-(-12.2614)));
            yy = 8.3977 + (((tickAnim - 9) / 4) * (8.3977-(8.3977)));
            zz = 3.2485 + (((tickAnim - 9) / 4) * (3.2485-(3.2485)));
        }
        else if (tickAnim >= 13 && tickAnim < 15) {
            xx = 17.4886 + (((tickAnim - 13) / 2) * (-17.5842-(17.4886)));
            yy = 8.3977 + (((tickAnim - 13) / 2) * (5.5296-(8.3977)));
            zz = 3.2485 + (((tickAnim - 13) / 2) * (-0.8939-(3.2485)));
        }
        else if (tickAnim >= 15 && tickAnim < 20) {
            xx = -17.5842 + (((tickAnim - 15) / 5) * (-19-(-17.5842)));
            yy = 5.5296 + (((tickAnim - 15) / 5) * (0-(5.5296)));
            zz = -0.8939 + (((tickAnim - 15) / 5) * (0-(-0.8939)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(legleft3, legleft3.rotateAngleX + (float) Math.toRadians(xx), legleft3.rotateAngleY + (float) Math.toRadians(yy), legleft3.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 0.1 + (((tickAnim - 0) / 3) * (0.1-(0.1)));
            yy = 0.7 + (((tickAnim - 0) / 3) * (0.2-(0.7)));
            zz = -0.075 + (((tickAnim - 0) / 3) * (0-(-0.075)));
        }
        else if (tickAnim >= 3 && tickAnim < 9) {
            xx = 0.1 + (((tickAnim - 3) / 6) * (0-(0.1)));
            yy = 0.2 + (((tickAnim - 3) / 6) * (0-(0.2)));
            zz = 0 + (((tickAnim - 3) / 6) * (0-(0)));
        }
        else if (tickAnim >= 9 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 9) / 4) * (0-(0)));
            yy = 0 + (((tickAnim - 9) / 4) * (0.425-(0)));
            zz = 0 + (((tickAnim - 9) / 4) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 13) / 2) * (0.03-(0)));
            yy = 0.425 + (((tickAnim - 13) / 2) * (1.155-(0.425)));
            zz = 0 + (((tickAnim - 13) / 2) * (0.06-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 20) {
            xx = 0.03 + (((tickAnim - 15) / 5) * (0.1-(0.03)));
            yy = 1.155 + (((tickAnim - 15) / 5) * (0.7-(1.155)));
            zz = 0.06 + (((tickAnim - 15) / 5) * (-0.075-(0.06)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.legleft3.rotationPointX = this.legleft3.rotationPointX + (float)(xx);
        this.legleft3.rotationPointY = this.legleft3.rotationPointY - (float)(yy);
        this.legleft3.rotationPointZ = this.legleft3.rotationPointZ + (float)(zz);



        this.setRotateAngle(fur4, fur4.rotateAngleX + (float) Math.toRadians(-0-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/0.5-65))*-5), fur4.rotateAngleY + (float) Math.toRadians(0), fur4.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(fur5, fur5.rotateAngleX + (float) Math.toRadians(-0-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/0.5-65))*-5), fur5.rotateAngleY + (float) Math.toRadians(0), fur5.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(fur6, fur6.rotateAngleX + (float) Math.toRadians(-0-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/0.5-50))*-7), fur6.rotateAngleY + (float) Math.toRadians(0), fur6.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(fur7, fur7.rotateAngleX + (float) Math.toRadians(-0-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/0.5-50))*-7), fur7.rotateAngleY + (float) Math.toRadians(0), fur7.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(fur8, fur8.rotateAngleX + (float) Math.toRadians(-0-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/0.5-50))*-7), fur8.rotateAngleY + (float) Math.toRadians(0), fur8.rotateAngleZ + (float) Math.toRadians(0));


    }
    public void animRunning(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime) {
        EntityPrehistoricFloraSpinolestes entity = (EntityPrehistoricFloraSpinolestes) entitylivingbaseIn;
        int animCycle = 10;
        double tickAnim = (entity.ticksExisted + entity.getTickOffset()) - (int) (Math.floor((double) (entity.ticksExisted + entity.getTickOffset()) / (double) animCycle) * (double) animCycle) + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;
        this.setRotateAngle(hips, hips.rotateAngleX + (float) Math.toRadians(-0-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*720+30))*15), hips.rotateAngleY + (float) Math.toRadians(0), hips.rotateAngleZ + (float) Math.toRadians(0));
        this.hips.rotationPointX = this.hips.rotationPointX + (float)(0);
        this.hips.rotationPointY = this.hips.rotationPointY - (float)(2.725);
        this.hips.rotationPointZ = this.hips.rotationPointZ + (float)(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*720))*2);


        this.setRotateAngle(body, body.rotateAngleX + (float) Math.toRadians(-0-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*720-80))*15), body.rotateAngleY + (float) Math.toRadians(0), body.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(chest, chest.rotateAngleX + (float) Math.toRadians(-0-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*720-90))*-15), chest.rotateAngleY + (float) Math.toRadians(0), chest.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(neck, neck.rotateAngleX + (float) Math.toRadians(-0-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*720-50))*-15), neck.rotateAngleY + (float) Math.toRadians(0), neck.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(head, head.rotateAngleX + (float) Math.toRadians(-10.75-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*720-120))*15), head.rotateAngleY + (float) Math.toRadians(0), head.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(tail, tail.rotateAngleX + (float) Math.toRadians(16.75-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*720))*5), tail.rotateAngleY + (float) Math.toRadians(0), tail.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(tail2, tail2.rotateAngleX + (float) Math.toRadians(-4.5-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*720-50))*15), tail2.rotateAngleY + (float) Math.toRadians(0), tail2.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(tail3, tail3.rotateAngleX + (float) Math.toRadians(8-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*720-100))*15), tail3.rotateAngleY + (float) Math.toRadians(0), tail3.rotateAngleZ + (float) Math.toRadians(0));



        if (tickAnim >= 0 && tickAnim < 2) {
            xx = 2.25 + (((tickAnim - 0) / 2) * (40.1364-(2.25)));
            yy = -10.75 + (((tickAnim - 0) / 2) * (-4.6551-(-10.75)));
            zz = 0 + (((tickAnim - 0) / 2) * (-0.9234-(0)));
        }
        else if (tickAnim >= 2 && tickAnim < 5) {
            xx = 40.1364 + (((tickAnim - 2) / 3) * (70.4092-(40.1364)));
            yy = -4.6551 + (((tickAnim - 2) / 3) * (-7.5346-(-4.6551)));
            zz = -0.9234 + (((tickAnim - 2) / 3) * (2.7702-(-0.9234)));
        }
        else if (tickAnim >= 5 && tickAnim < 10) {
            xx = 70.4092 + (((tickAnim - 5) / 5) * (2.25-(70.4092)));
            yy = -7.5346 + (((tickAnim - 5) / 5) * (-10.75-(-7.5346)));
            zz = 2.7702 + (((tickAnim - 5) / 5) * (0-(2.7702)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(legright, legright.rotateAngleX + (float) Math.toRadians(xx), legright.rotateAngleY + (float) Math.toRadians(yy), legright.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 2) {
            xx = -4.5 + (((tickAnim - 0) / 2) * (-47.5-(-4.5)));
            yy = 0 + (((tickAnim - 0) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 2) * (0-(0)));
        }
        else if (tickAnim >= 2 && tickAnim < 5) {
            xx = -47.5 + (((tickAnim - 2) / 3) * (3.25-(-47.5)));
            yy = 0 + (((tickAnim - 2) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 2) / 3) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 10) {
            xx = 3.25 + (((tickAnim - 5) / 5) * (-4.5-(3.25)));
            yy = 0 + (((tickAnim - 5) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 5) / 5) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(legright2, legright2.rotateAngleX + (float) Math.toRadians(xx), legright2.rotateAngleY + (float) Math.toRadians(yy), legright2.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 2) {
            xx = 0 + (((tickAnim - 0) / 2) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 2) * (-0.425-(0)));
            zz = 0 + (((tickAnim - 0) / 2) * (-0.375-(0)));
        }
        else if (tickAnim >= 2 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 2) / 3) * (-0.05-(0)));
            yy = -0.425 + (((tickAnim - 2) / 3) * (0-(-0.425)));
            zz = -0.375 + (((tickAnim - 2) / 3) * (0-(-0.375)));
        }
        else if (tickAnim >= 5 && tickAnim < 10) {
            xx = -0.05 + (((tickAnim - 5) / 5) * (0-(-0.05)));
            yy = 0 + (((tickAnim - 5) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 5) / 5) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.legright2.rotationPointX = this.legright2.rotationPointX + (float)(xx);
        this.legright2.rotationPointY = this.legright2.rotationPointY - (float)(yy);
        this.legright2.rotationPointZ = this.legright2.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 2) {
            xx = -23 + (((tickAnim - 0) / 2) * (8.08-(-23)));
            yy = 0 + (((tickAnim - 0) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 2) * (0-(0)));
        }
        else if (tickAnim >= 2 && tickAnim < 5) {
            xx = 8.08 + (((tickAnim - 2) / 3) * (48.5-(8.08)));
            yy = 0 + (((tickAnim - 2) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 2) / 3) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 7) {
            xx = 48.5 + (((tickAnim - 5) / 2) * (-12-(48.5)));
            yy = 0 + (((tickAnim - 5) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 5) / 2) * (0-(0)));
        }
        else if (tickAnim >= 7 && tickAnim < 10) {
            xx = -12 + (((tickAnim - 7) / 3) * (-23-(-12)));
            yy = 0 + (((tickAnim - 7) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 7) / 3) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(legright3, legright3.rotateAngleX + (float) Math.toRadians(xx), legright3.rotateAngleY + (float) Math.toRadians(yy), legright3.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 2) {
            xx = 0 + (((tickAnim - 0) / 2) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 2) * (-0.175-(0)));
            zz = 0 + (((tickAnim - 0) / 2) * (0-(0)));
        }
        else if (tickAnim >= 2 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 2) / 3) * (0-(0)));
            yy = -0.175 + (((tickAnim - 2) / 3) * (0-(-0.175)));
            zz = 0 + (((tickAnim - 2) / 3) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 7) {
            xx = 0 + (((tickAnim - 5) / 2) * (0-(0)));
            yy = 0 + (((tickAnim - 5) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 5) / 2) * (0-(0)));
        }
        else if (tickAnim >= 7 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 7) / 3) * (0-(0)));
            yy = 0 + (((tickAnim - 7) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 7) / 3) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.legright3.rotationPointX = this.legright3.rotationPointX + (float)(xx);
        this.legright3.rotationPointY = this.legright3.rotationPointY - (float)(yy);
        this.legright3.rotationPointZ = this.legright3.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 5) {
            xx = 9 + (((tickAnim - 0) / 5) * (-77.25-(9)));
            yy = 0 + (((tickAnim - 0) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 5) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 10) {
            xx = -77.25 + (((tickAnim - 5) / 5) * (9-(-77.25)));
            yy = 0 + (((tickAnim - 5) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 5) / 5) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(armright, armright.rotateAngleX + (float) Math.toRadians(xx), armright.rotateAngleY + (float) Math.toRadians(yy), armright.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 51.5 + (((tickAnim - 0) / 3) * (-22.698-(51.5)));
            yy = 0 + (((tickAnim - 0) / 3) * (-3.4915-(0)));
            zz = 0 + (((tickAnim - 0) / 3) * (10.5945-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 5) {
            xx = -22.698 + (((tickAnim - 3) / 2) * (70.75-(-22.698)));
            yy = -3.4915 + (((tickAnim - 3) / 2) * (0-(-3.4915)));
            zz = 10.5945 + (((tickAnim - 3) / 2) * (0-(10.5945)));
        }
        else if (tickAnim >= 5 && tickAnim < 7) {
            xx = 70.75 + (((tickAnim - 5) / 2) * (50.25-(70.75)));
            yy = 0 + (((tickAnim - 5) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 5) / 2) * (0-(0)));
        }
        else if (tickAnim >= 7 && tickAnim < 10) {
            xx = 50.25 + (((tickAnim - 7) / 3) * (51.5-(50.25)));
            yy = 0 + (((tickAnim - 7) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 7) / 3) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(armright2, armright2.rotateAngleX + (float) Math.toRadians(xx), armright2.rotateAngleY + (float) Math.toRadians(yy), armright2.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 3) * (0.3-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 7) {
            xx = 0 + (((tickAnim - 3) / 4) * (0-(0)));
            yy = 0 + (((tickAnim - 3) / 4) * (0.525-(0)));
            zz = 0.3 + (((tickAnim - 3) / 4) * (-0.225-(0.3)));
        }
        else if (tickAnim >= 7 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 7) / 3) * (0-(0)));
            yy = 0.525 + (((tickAnim - 7) / 3) * (0-(0.525)));
            zz = -0.225 + (((tickAnim - 7) / 3) * (0-(-0.225)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.armright2.rotationPointX = this.armright2.rotationPointX + (float)(xx);
        this.armright2.rotationPointY = this.armright2.rotationPointY - (float)(yy);
        this.armright2.rotationPointZ = this.armright2.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 125 + (((tickAnim - 0) / 3) * (124.75-(125)));
            yy = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 3) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 5) {
            xx = 124.75 + (((tickAnim - 3) / 2) * (31.25-(124.75)));
            yy = 0 + (((tickAnim - 3) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 3) / 2) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 7) {
            xx = 31.25 + (((tickAnim - 5) / 2) * (-18.2765-(31.25)));
            yy = 0 + (((tickAnim - 5) / 2) * (0.6517-(0)));
            zz = 0 + (((tickAnim - 5) / 2) * (-2.5355-(0)));
        }
        else if (tickAnim >= 7 && tickAnim < 8) {
            xx = -18.2765 + (((tickAnim - 7) / 1) * (-31.0265-(-18.2765)));
            yy = 0.6517 + (((tickAnim - 7) / 1) * (0.6517-(0.6517)));
            zz = -2.5355 + (((tickAnim - 7) / 1) * (-2.5355-(-2.5355)));
        }
        else if (tickAnim >= 8 && tickAnim < 10) {
            xx = -31.0265 + (((tickAnim - 8) / 2) * (125-(-31.0265)));
            yy = 0.6517 + (((tickAnim - 8) / 2) * (0-(0.6517)));
            zz = -2.5355 + (((tickAnim - 8) / 2) * (0-(-2.5355)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(armright3, armright3.rotateAngleX + (float) Math.toRadians(xx), armright3.rotateAngleY + (float) Math.toRadians(yy), armright3.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 0) / 5) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 5) * (0.8-(0)));
            zz = 0 + (((tickAnim - 0) / 5) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 7) {
            xx = 0 + (((tickAnim - 5) / 2) * (0-(0)));
            yy = 0.8 + (((tickAnim - 5) / 2) * (0-(0.8)));
            zz = 0 + (((tickAnim - 5) / 2) * (0-(0)));
        }
        else if (tickAnim >= 7 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 7) / 1) * (0-(0)));
            yy = 0 + (((tickAnim - 7) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 7) / 1) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 8) / 2) * (0-(0)));
            yy = 0 + (((tickAnim - 8) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 2) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.armright3.rotationPointX = this.armright3.rotationPointX + (float)(xx);
        this.armright3.rotationPointY = this.armright3.rotationPointY - (float)(yy);
        this.armright3.rotationPointZ = this.armright3.rotationPointZ + (float)(zz);



        this.setRotateAngle(earright, earright.rotateAngleX + (float) Math.toRadians(-10.75-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*720-90))*-20), earright.rotateAngleY + (float) Math.toRadians(0), earright.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(earleft, earleft.rotateAngleX + (float) Math.toRadians(-10.75-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*720-90))*-20), earleft.rotateAngleY + (float) Math.toRadians(0), earleft.rotateAngleZ + (float) Math.toRadians(0));



        if (tickAnim >= 0 && tickAnim < 5) {
            xx = 9 + (((tickAnim - 0) / 5) * (-93-(9)));
            yy = 0 + (((tickAnim - 0) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 5) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 10) {
            xx = -93 + (((tickAnim - 5) / 5) * (9-(-93)));
            yy = 0 + (((tickAnim - 5) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 5) / 5) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(armleft, armleft.rotateAngleX + (float) Math.toRadians(xx), armleft.rotateAngleY + (float) Math.toRadians(yy), armleft.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 51.5 + (((tickAnim - 0) / 3) * (-22.698-(51.5)));
            yy = 0 + (((tickAnim - 0) / 3) * (-3.4915-(0)));
            zz = 0 + (((tickAnim - 0) / 3) * (10.5945-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 5) {
            xx = -22.698 + (((tickAnim - 3) / 2) * (70.75-(-22.698)));
            yy = -3.4915 + (((tickAnim - 3) / 2) * (0-(-3.4915)));
            zz = 10.5945 + (((tickAnim - 3) / 2) * (0-(10.5945)));
        }
        else if (tickAnim >= 5 && tickAnim < 7) {
            xx = 70.75 + (((tickAnim - 5) / 2) * (50.25-(70.75)));
            yy = 0 + (((tickAnim - 5) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 5) / 2) * (0-(0)));
        }
        else if (tickAnim >= 7 && tickAnim < 10) {
            xx = 50.25 + (((tickAnim - 7) / 3) * (51.5-(50.25)));
            yy = 0 + (((tickAnim - 7) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 7) / 3) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(armleft2, armleft2.rotateAngleX + (float) Math.toRadians(xx), armleft2.rotateAngleY + (float) Math.toRadians(yy), armleft2.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 3) * (0.3-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 7) {
            xx = 0 + (((tickAnim - 3) / 4) * (0-(0)));
            yy = 0 + (((tickAnim - 3) / 4) * (0.525-(0)));
            zz = 0.3 + (((tickAnim - 3) / 4) * (-0.225-(0.3)));
        }
        else if (tickAnim >= 7 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 7) / 3) * (0-(0)));
            yy = 0.525 + (((tickAnim - 7) / 3) * (0-(0.525)));
            zz = -0.225 + (((tickAnim - 7) / 3) * (0-(-0.225)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.armleft2.rotationPointX = this.armleft2.rotationPointX + (float)(xx);
        this.armleft2.rotationPointY = this.armleft2.rotationPointY - (float)(yy);
        this.armleft2.rotationPointZ = this.armleft2.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 125 + (((tickAnim - 0) / 3) * (124.75-(125)));
            yy = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 3) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 5) {
            xx = 124.75 + (((tickAnim - 3) / 2) * (37-(124.75)));
            yy = 0 + (((tickAnim - 3) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 3) / 2) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 7) {
            xx = 37 + (((tickAnim - 5) / 2) * (-5.5482-(37)));
            yy = 0 + (((tickAnim - 5) / 2) * (0.0875-(0)));
            zz = 0 + (((tickAnim - 5) / 2) * (-5.5671-(0)));
        }
        else if (tickAnim >= 7 && tickAnim < 8) {
            xx = -5.5482 + (((tickAnim - 7) / 1) * (-21.9562-(-5.5482)));
            yy = 0.0875 + (((tickAnim - 7) / 1) * (-1.1722-(0.0875)));
            zz = -5.5671 + (((tickAnim - 7) / 1) * (-1.0235-(-5.5671)));
        }
        else if (tickAnim >= 8 && tickAnim < 10) {
            xx = -21.9562 + (((tickAnim - 8) / 2) * (125-(-21.9562)));
            yy = -1.1722 + (((tickAnim - 8) / 2) * (0-(-1.1722)));
            zz = -1.0235 + (((tickAnim - 8) / 2) * (0-(-1.0235)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(armleft3, armleft3.rotateAngleX + (float) Math.toRadians(xx), armleft3.rotateAngleY + (float) Math.toRadians(yy), armleft3.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 0) / 5) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 5) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 7) {
            xx = 0 + (((tickAnim - 5) / 2) * (0-(0)));
            yy = 0 + (((tickAnim - 5) / 2) * (0.85-(0)));
            zz = 0 + (((tickAnim - 5) / 2) * (0-(0)));
        }
        else if (tickAnim >= 7 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 7) / 1) * (0-(0)));
            yy = 0.85 + (((tickAnim - 7) / 1) * (0.85-(0.85)));
            zz = 0 + (((tickAnim - 7) / 1) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 8) / 2) * (0-(0)));
            yy = 0.85 + (((tickAnim - 8) / 2) * (0-(0.85)));
            zz = 0 + (((tickAnim - 8) / 2) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.armleft3.rotationPointX = this.armleft3.rotationPointX + (float)(xx);
        this.armleft3.rotationPointY = this.armleft3.rotationPointY - (float)(yy);
        this.armleft3.rotationPointZ = this.armleft3.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 2) {
            xx = 2.25 + (((tickAnim - 0) / 2) * (40.1364-(2.25)));
            yy = -10.75 + (((tickAnim - 0) / 2) * (-4.6551-(-10.75)));
            zz = 0 + (((tickAnim - 0) / 2) * (-0.9234-(0)));
        }
        else if (tickAnim >= 2 && tickAnim < 5) {
            xx = 40.1364 + (((tickAnim - 2) / 3) * (70.4092-(40.1364)));
            yy = -4.6551 + (((tickAnim - 2) / 3) * (7.5346-(-4.6551)));
            zz = -0.9234 + (((tickAnim - 2) / 3) * (-2.7702-(-0.9234)));
        }
        else if (tickAnim >= 5 && tickAnim < 10) {
            xx = 70.4092 + (((tickAnim - 5) / 5) * (2.25-(70.4092)));
            yy = 7.5346 + (((tickAnim - 5) / 5) * (-10.75-(7.5346)));
            zz = -2.7702 + (((tickAnim - 5) / 5) * (0-(-2.7702)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(legleft, legleft.rotateAngleX + (float) Math.toRadians(xx), legleft.rotateAngleY + (float) Math.toRadians(yy), legleft.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 2) {
            xx = -4.5 + (((tickAnim - 0) / 2) * (-47.5-(-4.5)));
            yy = 0 + (((tickAnim - 0) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 2) * (0-(0)));
        }
        else if (tickAnim >= 2 && tickAnim < 5) {
            xx = -47.5 + (((tickAnim - 2) / 3) * (3.25-(-47.5)));
            yy = 0 + (((tickAnim - 2) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 2) / 3) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 10) {
            xx = 3.25 + (((tickAnim - 5) / 5) * (-4.5-(3.25)));
            yy = 0 + (((tickAnim - 5) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 5) / 5) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(legleft2, legleft2.rotateAngleX + (float) Math.toRadians(xx), legleft2.rotateAngleY + (float) Math.toRadians(yy), legleft2.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 2) {
            xx = 0 + (((tickAnim - 0) / 2) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 2) * (-0.425-(0)));
            zz = 0 + (((tickAnim - 0) / 2) * (-0.375-(0)));
        }
        else if (tickAnim >= 2 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 2) / 3) * (-0.05-(0)));
            yy = -0.425 + (((tickAnim - 2) / 3) * (0-(-0.425)));
            zz = -0.375 + (((tickAnim - 2) / 3) * (0-(-0.375)));
        }
        else if (tickAnim >= 5 && tickAnim < 10) {
            xx = -0.05 + (((tickAnim - 5) / 5) * (0-(-0.05)));
            yy = 0 + (((tickAnim - 5) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 5) / 5) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.legleft2.rotationPointX = this.legleft2.rotationPointX + (float)(xx);
        this.legleft2.rotationPointY = this.legleft2.rotationPointY - (float)(yy);
        this.legleft2.rotationPointZ = this.legleft2.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 2) {
            xx = -23 + (((tickAnim - 0) / 2) * (8.08-(-23)));
            yy = 0 + (((tickAnim - 0) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 2) * (0-(0)));
        }
        else if (tickAnim >= 2 && tickAnim < 5) {
            xx = 8.08 + (((tickAnim - 2) / 3) * (48.5-(8.08)));
            yy = 0 + (((tickAnim - 2) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 2) / 3) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 7) {
            xx = 48.5 + (((tickAnim - 5) / 2) * (-12-(48.5)));
            yy = 0 + (((tickAnim - 5) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 5) / 2) * (0-(0)));
        }
        else if (tickAnim >= 7 && tickAnim < 10) {
            xx = -12 + (((tickAnim - 7) / 3) * (-23-(-12)));
            yy = 0 + (((tickAnim - 7) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 7) / 3) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(legleft3, legleft3.rotateAngleX + (float) Math.toRadians(xx), legleft3.rotateAngleY + (float) Math.toRadians(yy), legleft3.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 2) {
            xx = 0 + (((tickAnim - 0) / 2) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 2) * (-0.175-(0)));
            zz = 0 + (((tickAnim - 0) / 2) * (0-(0)));
        }
        else if (tickAnim >= 2 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 2) / 3) * (0-(0)));
            yy = -0.175 + (((tickAnim - 2) / 3) * (0-(-0.175)));
            zz = 0 + (((tickAnim - 2) / 3) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 7) {
            xx = 0 + (((tickAnim - 5) / 2) * (0-(0)));
            yy = 0 + (((tickAnim - 5) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 5) / 2) * (0-(0)));
        }
        else if (tickAnim >= 7 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 7) / 3) * (0-(0)));
            yy = 0 + (((tickAnim - 7) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 7) / 3) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.legleft3.rotationPointX = this.legleft3.rotationPointX + (float)(xx);
        this.legleft3.rotationPointY = this.legleft3.rotationPointY - (float)(yy);
        this.legleft3.rotationPointZ = this.legleft3.rotationPointZ + (float)(zz);



    }



    public void animate(IAnimatedEntity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        EntityPrehistoricFloraSpinolestes e = (EntityPrehistoricFloraSpinolestes) entity;
        animator.update(entity);


    }
}
