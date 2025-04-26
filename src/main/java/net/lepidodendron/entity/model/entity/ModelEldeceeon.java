package net.lepidodendron.entity.model.entity;

import net.ilexiconn.llibrary.client.model.ModelAnimator;
import net.ilexiconn.llibrary.client.model.tools.AdvancedModelRenderer;
import net.ilexiconn.llibrary.server.animation.IAnimatedEntity;
import net.lepidodendron.entity.EntityPrehistoricFloraEldeceeon;
import net.lepidodendron.entity.model.ModelBasePalaeopedia;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;

public class ModelEldeceeon extends ModelBasePalaeopedia {

    private final AdvancedModelRenderer hips;
    private final AdvancedModelRenderer cube_r1;
    private final AdvancedModelRenderer legright;
    private final AdvancedModelRenderer legright2;
    private final AdvancedModelRenderer legright3;
    private final AdvancedModelRenderer legleft;
    private final AdvancedModelRenderer legleft2;
    private final AdvancedModelRenderer legleft3;
    private final AdvancedModelRenderer tail1;
    private final AdvancedModelRenderer tail2;
    private final AdvancedModelRenderer tail3;
    private final AdvancedModelRenderer body;
    private final AdvancedModelRenderer chest;
    private final AdvancedModelRenderer cube_r2;
    private final AdvancedModelRenderer armright;
    private final AdvancedModelRenderer armright2;
    private final AdvancedModelRenderer armright3;
    private final AdvancedModelRenderer armleft;
    private final AdvancedModelRenderer armleft2;
    private final AdvancedModelRenderer armleft3;
    private final AdvancedModelRenderer neck;
    private final AdvancedModelRenderer cube_r3;
    private final AdvancedModelRenderer head;
    private final AdvancedModelRenderer cube_r4;
    private final AdvancedModelRenderer cube_r5;
    private final AdvancedModelRenderer cube_r6;
    private final AdvancedModelRenderer cube_r7;
    private final AdvancedModelRenderer cube_r8;
    private final AdvancedModelRenderer cube_r9;
    private final AdvancedModelRenderer cube_r10;
    private final AdvancedModelRenderer cube_r11;
    private final AdvancedModelRenderer jaw;
    private final AdvancedModelRenderer cube_r12;
    private final AdvancedModelRenderer cube_r13;
    private final AdvancedModelRenderer cube_r14;
    private final AdvancedModelRenderer cube_r15;
    private final AdvancedModelRenderer cube_r16;
    private final AdvancedModelRenderer cube_r17;
    private final AdvancedModelRenderer cube_r18;
    private final AdvancedModelRenderer eyeright;
    private final AdvancedModelRenderer cube_r19;
    private final AdvancedModelRenderer eyeleft;
    private final AdvancedModelRenderer cube_r20;

    private ModelAnimator animator;

    public ModelEldeceeon() {
        this.textureWidth = 52;
        this.textureHeight = 48;

        this.hips = new AdvancedModelRenderer(this);
        this.hips.setRotationPoint(0.0F, 19.6F, 4.0F);


        this.cube_r1 = new AdvancedModelRenderer(this);
        this.cube_r1.setRotationPoint(1.5F, -0.825F, -0.5F);
        this.hips.addChild(cube_r1);
        this.setRotateAngle(cube_r1, -0.0436F, 0.0F, 0.0F);
        this.cube_r1.cubeList.add(new ModelBox(cube_r1, 0, 10, -4.0F, -0.75F, -0.25F, 5, 4, 5, 0.0F, false));

        this.legright = new AdvancedModelRenderer(this);
        this.legright.setRotationPoint(-2.5F, 1.175F, 1.75F);
        this.hips.addChild(legright);
        this.setRotateAngle(legright, 0.0F, -0.2618F, -0.3752F);
        this.legright.cubeList.add(new ModelBox(legright, 0, 38, -2.75F, -1.0F, -1.0F, 4, 2, 2, 0.01F, false));

        this.legright2 = new AdvancedModelRenderer(this);
        this.legright2.setRotationPoint(-2.75F, -1.0F, 0.0F);
        this.legright.addChild(legright2);
        this.setRotateAngle(legright2, 0.0F, 0.0F, -1.1345F);
        this.legright2.cubeList.add(new ModelBox(legright2, 40, 0, -3.0F, 0.0F, -1.0F, 3, 2, 2, 0.0F, false));

        this.legright3 = new AdvancedModelRenderer(this);
        this.legright3.setRotationPoint(-3.0F, 0.0F, 0.0F);
        this.legright2.addChild(legright3);
        this.setRotateAngle(legright3, 0.2618F, 0.0873F, -0.1134F);
        this.legright3.cubeList.add(new ModelBox(legright3, 12, 36, 0.0F, -4.0F, -2.0F, 0, 5, 4, 0.0F, false));

        this.legleft = new AdvancedModelRenderer(this);
        this.legleft.setRotationPoint(2.5F, 1.175F, 1.75F);
        this.hips.addChild(legleft);
        this.setRotateAngle(legleft, 0.0F, 0.2618F, 0.3752F);
        this.legleft.cubeList.add(new ModelBox(legleft, 0, 38, -1.25F, -1.0F, -1.0F, 4, 2, 2, 0.01F, true));

        this.legleft2 = new AdvancedModelRenderer(this);
        this.legleft2.setRotationPoint(2.75F, -1.0F, 0.0F);
        this.legleft.addChild(legleft2);
        this.setRotateAngle(legleft2, 0.0F, 0.0F, 1.1345F);
        this.legleft2.cubeList.add(new ModelBox(legleft2, 40, 0, 0.0F, 0.0F, -1.0F, 3, 2, 2, 0.0F, true));

        this.legleft3 = new AdvancedModelRenderer(this);
        this.legleft3.setRotationPoint(3.0F, 0.0F, 0.0F);
        this.legleft2.addChild(legleft3);
        this.setRotateAngle(legleft3, 0.2618F, -0.0873F, 0.1134F);
        this.legleft3.cubeList.add(new ModelBox(legleft3, 12, 36, 0.0F, -4.0F, -2.0F, 0, 5, 4, 0.0F, true));

        this.tail1 = new AdvancedModelRenderer(this);
        this.tail1.setRotationPoint(0.0F, -0.075F, 4.25F);
        this.hips.addChild(tail1);
        this.setRotateAngle(tail1, -0.2182F, 0.0F, 0.0F);
        this.tail1.cubeList.add(new ModelBox(tail1, 20, 10, -1.5F, -1.0F, -1.0F, 3, 3, 6, 0.0F, false));

        this.tail2 = new AdvancedModelRenderer(this);
        this.tail2.setRotationPoint(0.0F, 0.5F, 5.0F);
        this.tail1.addChild(tail2);
        this.setRotateAngle(tail2, -0.1309F, 0.0F, 0.0F);
        this.tail2.cubeList.add(new ModelBox(tail2, 24, 0, -1.0F, -1.0F, -0.25F, 2, 2, 6, 0.0F, false));

        this.tail3 = new AdvancedModelRenderer(this);
        this.tail3.setRotationPoint(0.0F, -0.1F, 5.25F);
        this.tail2.addChild(tail3);
        this.setRotateAngle(tail3, 0.2182F, 0.0F, 0.0F);
        this.tail3.cubeList.add(new ModelBox(tail3, 0, 32, -0.5F, -0.5F, 0.0F, 1, 1, 5, 0.0F, false));

        this.body = new AdvancedModelRenderer(this);
        this.body.setRotationPoint(0.0F, -0.25F, 0.0F);
        this.hips.addChild(body);
        this.body.cubeList.add(new ModelBox(body, 0, 0, -3.0F, -1.15F, -6.0F, 6, 4, 6, 0.02F, false));
        this.body.cubeList.add(new ModelBox(body, 0, 19, -2.5F, -1.5F, -6.0F, 5, 1, 6, 0.01F, false));

        this.chest = new AdvancedModelRenderer(this);
        this.chest.setRotationPoint(0.0F, -0.25F, -5.25F);
        this.body.addChild(chest);


        this.cube_r2 = new AdvancedModelRenderer(this);
        this.cube_r2.setRotationPoint(0.5F, -1.1F, -0.75F);
        this.chest.addChild(cube_r2);
        this.setRotateAngle(cube_r2, 0.0262F, 0.0F, 0.0F);
        this.cube_r2.cubeList.add(new ModelBox(cube_r2, 22, 19, -3.0F, 0.0F, -3.25F, 5, 4, 4, 0.0F, false));

        this.armright = new AdvancedModelRenderer(this);
        this.armright.setRotationPoint(-2.3F, 2.15F, -2.5F);
        this.chest.addChild(armright);
        this.setRotateAngle(armright, 0.0F, 0.4363F, -0.2618F);
        this.armright.cubeList.add(new ModelBox(armright, 38, 8, -2.5F, -1.25F, -1.0F, 3, 2, 2, 0.0F, false));

        this.armright2 = new AdvancedModelRenderer(this);
        this.armright2.setRotationPoint(-2.15F, 0.45F, -0.5F);
        this.armright.addChild(armright2);
        this.setRotateAngle(armright2, -0.5672F, 0.0F, 0.2182F);
        this.armright2.cubeList.add(new ModelBox(armright2, 20, 41, -1.0F, -1.0F, -0.5F, 2, 3, 1, 0.0F, false));

        this.armright3 = new AdvancedModelRenderer(this);
        this.armright3.setRotationPoint(0.0F, 2.0F, -0.5F);
        this.armright2.addChild(armright3);
        this.setRotateAngle(armright3, 0.48F, 0.0F, 0.0F);
        this.armright3.cubeList.add(new ModelBox(armright3, 14, 27, -2.0F, 0.0F, -3.0F, 4, 0, 4, 0.0F, false));

        this.armleft = new AdvancedModelRenderer(this);
        this.armleft.setRotationPoint(2.3F, 2.15F, -2.5F);
        this.chest.addChild(armleft);
        this.setRotateAngle(armleft, 0.0F, -0.4363F, 0.2618F);
        this.armleft.cubeList.add(new ModelBox(armleft, 38, 8, -0.5F, -1.25F, -1.0F, 3, 2, 2, 0.0F, true));

        this.armleft2 = new AdvancedModelRenderer(this);
        this.armleft2.setRotationPoint(2.15F, 0.45F, -0.5F);
        this.armleft.addChild(armleft2);
        this.setRotateAngle(armleft2, -0.5672F, 0.0F, -0.2182F);
        this.armleft2.cubeList.add(new ModelBox(armleft2, 20, 41, -1.0F, -1.0F, -0.5F, 2, 3, 1, 0.0F, true));

        this.armleft3 = new AdvancedModelRenderer(this);
        this.armleft3.setRotationPoint(0.0F, 2.0F, -0.5F);
        this.armleft2.addChild(armleft3);
        this.setRotateAngle(armleft3, 0.48F, 0.0F, 0.0F);
        this.armleft3.cubeList.add(new ModelBox(armleft3, 14, 27, -2.0F, 0.0F, -3.0F, 4, 0, 4, 0.0F, true));

        this.neck = new AdvancedModelRenderer(this);
        this.neck.setRotationPoint(0.0F, 0.0F, -4.0F);
        this.chest.addChild(neck);
        this.neck.cubeList.add(new ModelBox(neck, 0, 26, -2.0F, -0.975F, -2.5F, 4, 3, 3, 0.0F, false));

        this.cube_r3 = new AdvancedModelRenderer(this);
        this.cube_r3.setRotationPoint(0.5F, 2.5F, -1.5F);
        this.neck.addChild(cube_r3);
        this.setRotateAngle(cube_r3, -0.0873F, 0.0F, 0.0F);
        this.cube_r3.cubeList.add(new ModelBox(cube_r3, 32, 37, -2.0F, -1.0F, -1.0F, 3, 1, 3, 0.0F, false));

        this.head = new AdvancedModelRenderer(this);
        this.head.setRotationPoint(0.0F, 0.25F, -2.25F);
        this.neck.addChild(head);
        this.head.cubeList.add(new ModelBox(head, 30, 8, -0.5F, 0.0F, -5.5F, 1, 1, 1, 0.0F, false));
        this.head.cubeList.add(new ModelBox(head, 8, 44, -0.5F, 0.15F, -5.475F, 1, 1, 0, 0.0F, false));
        this.head.cubeList.add(new ModelBox(head, 40, 4, -1.0F, 0.0F, -4.5F, 2, 1, 2, 0.0F, false));
        this.head.cubeList.add(new ModelBox(head, 20, 37, -1.5F, 0.0F, -3.0F, 3, 1, 3, 0.01F, false));
        this.head.cubeList.add(new ModelBox(head, 28, 32, -1.5F, -1.3F, -3.0F, 3, 2, 3, 0.0F, false));
        this.head.cubeList.add(new ModelBox(head, 40, 32, -2.05F, -1.0F, -1.925F, 1, 2, 2, 0.0F, false));
        this.head.cubeList.add(new ModelBox(head, 40, 32, 1.05F, -1.0F, -1.925F, 1, 2, 2, 0.0F, true));

        this.cube_r4 = new AdvancedModelRenderer(this);
        this.cube_r4.setRotationPoint(0.5F, 0.0F, -5.5F);
        this.head.addChild(cube_r4);
        this.setRotateAngle(cube_r4, 0.0F, 0.6109F, 0.0F);
        this.cube_r4.cubeList.add(new ModelBox(cube_r4, 38, 16, -2.0F, 0.0F, 0.0F, 2, 1, 2, 0.005F, true));
        this.cube_r4.cubeList.add(new ModelBox(cube_r4, 7, 42, -0.025F, 0.15F, 0.0F, 0, 1, 2, 0.0F, true));

        this.cube_r5 = new AdvancedModelRenderer(this);
        this.cube_r5.setRotationPoint(1.675F, 0.0F, -3.9F);
        this.head.addChild(cube_r5);
        this.setRotateAngle(cube_r5, 0.0F, 0.1745F, 0.0F);
        this.cube_r5.cubeList.add(new ModelBox(cube_r5, 32, 41, -1.0F, 0.0F, 0.0F, 1, 1, 2, -0.01F, true));

        this.cube_r6 = new AdvancedModelRenderer(this);
        this.cube_r6.setRotationPoint(-1.675F, 0.0F, -3.9F);
        this.head.addChild(cube_r6);
        this.setRotateAngle(cube_r6, 0.0F, -0.1745F, 0.0F);
        this.cube_r6.cubeList.add(new ModelBox(cube_r6, 32, 41, 0.0F, 0.0F, 0.0F, 1, 1, 2, -0.01F, false));

        this.cube_r7 = new AdvancedModelRenderer(this);
        this.cube_r7.setRotationPoint(1.65F, 0.15F, -3.85F);
        this.head.addChild(cube_r7);
        this.setRotateAngle(cube_r7, 0.0F, 0.1745F, 0.0F);
        this.cube_r7.cubeList.add(new ModelBox(cube_r7, 7, 42, -0.025F, 0.0F, 0.0F, 0, 1, 2, 0.0F, true));

        this.cube_r8 = new AdvancedModelRenderer(this);
        this.cube_r8.setRotationPoint(-1.65F, 0.15F, -3.85F);
        this.head.addChild(cube_r8);
        this.setRotateAngle(cube_r8, 0.0F, -0.1745F, 0.0F);
        this.cube_r8.cubeList.add(new ModelBox(cube_r8, 7, 42, 0.025F, 0.0F, 0.0F, 0, 1, 2, 0.0F, false));

        this.cube_r9 = new AdvancedModelRenderer(this);
        this.cube_r9.setRotationPoint(-0.5F, 0.15F, -5.5F);
        this.head.addChild(cube_r9);
        this.setRotateAngle(cube_r9, 0.0F, -0.6109F, 0.0F);
        this.cube_r9.cubeList.add(new ModelBox(cube_r9, 7, 42, 0.025F, 0.0F, 0.0F, 0, 1, 2, 0.0F, false));
        this.cube_r9.cubeList.add(new ModelBox(cube_r9, 38, 16, 0.0F, -0.15F, 0.0F, 2, 1, 2, 0.005F, false));

        this.cube_r10 = new AdvancedModelRenderer(this);
        this.cube_r10.setRotationPoint(0.0F, -0.025F, -5.7F);
        this.head.addChild(cube_r10);
        this.setRotateAngle(cube_r10, 0.4363F, 0.0F, 0.0F);
        this.cube_r10.cubeList.add(new ModelBox(cube_r10, 24, 8, -1.0F, 1.0F, 2.0F, 2, 1, 1, 0.0F, false));
        this.cube_r10.cubeList.add(new ModelBox(cube_r10, 40, 19, -1.0F, 0.0F, 1.0F, 2, 1, 2, 0.0F, false));

        this.cube_r11 = new AdvancedModelRenderer(this);
        this.cube_r11.setRotationPoint(-0.5F, 0.0F, -5.5F);
        this.head.addChild(cube_r11);
        this.setRotateAngle(cube_r11, 0.5367F, 0.0F, 0.0F);
        this.cube_r11.cubeList.add(new ModelBox(cube_r11, 34, 8, 0.0F, 0.0F, 0.0F, 1, 1, 1, 0.0F, false));

        this.jaw = new AdvancedModelRenderer(this);
        this.jaw.setRotationPoint(0.0F, 1.0F, 0.0F);
        this.head.addChild(jaw);
        this.setRotateAngle(jaw, -0.0436F, 0.0F, 0.0F);
        this.jaw.cubeList.add(new ModelBox(jaw, 30, 27, -1.5F, -0.25F, -4.0F, 3, 1, 4, -0.01F, false));
        this.jaw.cubeList.add(new ModelBox(jaw, 8, 44, -0.5F, -0.35F, -5.475F, 1, 1, 0, 0.0F, false));
        this.jaw.cubeList.add(new ModelBox(jaw, 38, 12, -1.5F, -1.75F, -2.0F, 3, 2, 2, 0.0F, false));
        this.jaw.cubeList.add(new ModelBox(jaw, 26, 41, -2.025F, -0.25F, -1.925F, 1, 1, 2, 0.0F, false));
        this.jaw.cubeList.add(new ModelBox(jaw, 26, 41, 1.025F, -0.25F, -1.925F, 1, 1, 2, 0.0F, true));
        this.jaw.cubeList.add(new ModelBox(jaw, 40, 25, -0.5F, -0.25F, -5.5F, 1, 1, 1, -0.01F, false));

        this.cube_r12 = new AdvancedModelRenderer(this);
        this.cube_r12.setRotationPoint(0.5F, -0.25F, -5.5F);
        this.jaw.addChild(cube_r12);
        this.setRotateAngle(cube_r12, 0.0F, 0.6109F, 0.0F);
        this.cube_r12.cubeList.add(new ModelBox(cube_r12, 40, 22, -2.0F, 0.0F, 0.0F, 2, 1, 2, 0.0F, true));
        this.cube_r12.cubeList.add(new ModelBox(cube_r12, 7, 42, -0.025F, -0.1F, 0.0F, 0, 1, 2, 0.0F, true));

        this.cube_r13 = new AdvancedModelRenderer(this);
        this.cube_r13.setRotationPoint(1.675F, -0.25F, -3.9F);
        this.jaw.addChild(cube_r13);
        this.setRotateAngle(cube_r13, 0.0F, 0.1745F, 0.0F);
        this.cube_r13.cubeList.add(new ModelBox(cube_r13, 0, 42, -1.025F, 0.0F, 0.0F, 1, 1, 2, -0.005F, true));

        this.cube_r14 = new AdvancedModelRenderer(this);
        this.cube_r14.setRotationPoint(-0.5F, -0.25F, -5.5F);
        this.jaw.addChild(cube_r14);
        this.setRotateAngle(cube_r14, 0.0F, -0.6109F, 0.0F);
        this.cube_r14.cubeList.add(new ModelBox(cube_r14, 40, 22, 0.0F, 0.0F, 0.0F, 2, 1, 2, 0.0F, false));
        this.cube_r14.cubeList.add(new ModelBox(cube_r14, 7, 42, 0.025F, -0.1F, 0.0F, 0, 1, 2, 0.0F, false));

        this.cube_r15 = new AdvancedModelRenderer(this);
        this.cube_r15.setRotationPoint(-1.675F, -0.25F, -3.9F);
        this.jaw.addChild(cube_r15);
        this.setRotateAngle(cube_r15, 0.0F, -0.1745F, 0.0F);
        this.cube_r15.cubeList.add(new ModelBox(cube_r15, 0, 42, 0.025F, 0.0F, 0.0F, 1, 1, 2, -0.005F, false));

        this.cube_r16 = new AdvancedModelRenderer(this);
        this.cube_r16.setRotationPoint(0.5F, 0.975F, -2.0F);
        this.jaw.addChild(cube_r16);
        this.setRotateAngle(cube_r16, -0.096F, 0.0F, 0.0F);
        this.cube_r16.cubeList.add(new ModelBox(cube_r16, 14, 31, -2.0F, -1.0F, -2.0F, 3, 1, 4, -0.002F, false));

        this.cube_r17 = new AdvancedModelRenderer(this);
        this.cube_r17.setRotationPoint(1.65F, -0.35F, -3.85F);
        this.jaw.addChild(cube_r17);
        this.setRotateAngle(cube_r17, 0.0F, 0.1745F, 0.0F);
        this.cube_r17.cubeList.add(new ModelBox(cube_r17, 7, 42, -0.025F, 0.0F, 0.0F, 0, 1, 2, 0.0F, true));

        this.cube_r18 = new AdvancedModelRenderer(this);
        this.cube_r18.setRotationPoint(-1.65F, -0.35F, -3.85F);
        this.jaw.addChild(cube_r18);
        this.setRotateAngle(cube_r18, 0.0F, -0.1745F, 0.0F);
        this.cube_r18.cubeList.add(new ModelBox(cube_r18, 7, 42, 0.025F, 0.0F, 0.0F, 0, 1, 2, 0.0F, false));

        this.eyeright = new AdvancedModelRenderer(this);
        this.eyeright.setRotationPoint(-1.725F, 0.075F, -2.825F);
        this.head.addChild(eyeright);
        this.setRotateAngle(eyeright, 0.0F, 0.0F, 0.1745F);


        this.cube_r19 = new AdvancedModelRenderer(this);
        this.cube_r19.setRotationPoint(0.35F, -1.0F, -0.9F);
        this.eyeright.addChild(cube_r19);
        this.setRotateAngle(cube_r19, 0.0F, -0.3927F, 0.0F);
        this.cube_r19.cubeList.add(new ModelBox(cube_r19, 38, 41, 0.0F, 0.0F, 0.0F, 1, 1, 2, 0.0F, false));

        this.eyeleft = new AdvancedModelRenderer(this);
        this.eyeleft.setRotationPoint(1.725F, 0.075F, -2.825F);
        this.head.addChild(eyeleft);
        this.setRotateAngle(eyeleft, 0.0F, 0.0F, -0.1745F);


        this.cube_r20 = new AdvancedModelRenderer(this);
        this.cube_r20.setRotationPoint(-0.35F, -1.0F, -0.9F);
        this.eyeleft.addChild(cube_r20);
        this.setRotateAngle(cube_r20, 0.0F, 0.3927F, 0.0F);
        this.cube_r20.cubeList.add(new ModelBox(cube_r20, 38, 41, -1.0F, 0.0F, 0.0F, 1, 1, 2, 0.0F, true));
        updateDefaultPose();
        animator = ModelAnimator.create();
    }

    @Override
    public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        animate((IAnimatedEntity) entity, f, f1, f2, f3, f4, f5);
        this.hips.render(f5);
    }
    public void renderStaticWall(float f) {
        this.setRotateAngle(neck, 0.0F, 0.0F, 0.0F);
        this.setRotateAngle(head, 0.0F, 0.0F, 0.0F);
        this.setRotateAngle(jaw, 0.2F, 0.0F, 0.0F);
        this.neck.offsetZ = -0.25F;
        this.neck.offsetY = -0.0F;
        this.neck.render(0.01F);
        resetToDefaultPose();
    }
    public void renderStaticFloor(float f) {
        this.setRotateAngle(hips, 0.0F, 0.0F, 0.0F);
        this.setRotateAngle(body, 0.0F, 0.05F, 0.0F);
        this.setRotateAngle(chest, 0.0F, 0.0F, 0.0F);
        this.setRotateAngle(neck, -0.2F, 0.2F, 0.0F);
        this.setRotateAngle(head, 0.0F, 0.2F, 0.0F);
        this.setRotateAngle(jaw, 0.0F, 0.0F, 0.0F);
        this.setRotateAngle(tail1, -0.2F, 0.0F, 0.0F);
        this.setRotateAngle(tail2, -0.25F, 0.0F, 0.0F);
        this.setRotateAngle(tail3, 0.3F, 0.0F, 0.0F);
        this.hips.offsetY = 0.08F;
        this.hips.render(0.01F);
        resetToDefaultPose();
    }
    @Override
    public void renderStaticBook(float f) {
        //Rotations, positions and sizing:
        this.hips.offsetY = -2.0F;
        this.hips.offsetX = -0.338F;
        this.hips.offsetZ = 2.5F;
        this.hips.rotateAngleY = (float)Math.toRadians(200);
        this.hips.rotateAngleX = (float)Math.toRadians(18);
        this.hips.rotateAngleZ = (float)Math.toRadians(-8);
        this.hips.scaleChildren = true;
        float scaler = 3.63F;
        this.hips.setScale(scaler, scaler, scaler);
        //Start of pose:

        //End of pose, now render the model:
        this.hips.render(f);
        //Reset rotations, positions and sizing:
        this.hips.setScale(1.0F, 1.0F, 1.0F);
        this.hips.scaleChildren = false;
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
        //this.Hip.offsetZ = -0.4F;
        //this.faceTarget(f3, f4, 5, neck);
        this.faceTarget(f3, f4, 6, head);

        AdvancedModelRenderer[] Tail = {this.tail1, this.tail2, this.tail3};

        EntityPrehistoricFloraEldeceeon entitySilesaurus = (EntityPrehistoricFloraEldeceeon) e;
        ((EntityPrehistoricFloraEldeceeon)e).tailBuffer.applyChainSwingBuffer(Tail);

        if (entitySilesaurus.getAnimation() == entitySilesaurus.LAY_ANIMATION) {

        }
        else {
            if (!entitySilesaurus.isReallyInWater()) {

                if (f3 == 0.0F || !entitySilesaurus.getIsMoving()) {

                    this.chainWave(Tail, (0.15F * 0.35F), 0.125F * 0.15F, 0.2F, f2, 1F);
                    this.chainSwing(Tail, (0.15F * 0.35F) * 4F, 0.05F * 0.35F, 0.12F, f2, 1F);


                    return;
                }

                if (entitySilesaurus.getIsFast()) { //Running


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
        EntityPrehistoricFloraEldeceeon ee = (EntityPrehistoricFloraEldeceeon) entitylivingbaseIn;

        if (!ee.isReallyInWater()) {
            if (ee.getIsMoving()) {
                if (ee.getIsFast()) { //Running
                    animRun(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime);
                } else {
                    animWalking(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime);
                }
            }
        }
        else {
            //swim
        }

        if (ee.getAnimation() == ee.ATTACK_ANIMATION) {
            animAttack(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime, ee.getAnimationTick());
        } else if  (ee.getAnimation() == ee.STAND_ANIMATION) {
            animIdle(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime, ee.getAnimationTick());
        }

    }

    public void animWalking(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime) {
        EntityPrehistoricFloraEldeceeon entity = (EntityPrehistoricFloraEldeceeon) entitylivingbaseIn;
        int animCycle = 23;
        double tickAnim = (entity.ticksExisted + entity.getTickOffset()) - (int) (Math.floor((double) (entity.ticksExisted + entity.getTickOffset()) / (double) animCycle) * (double) animCycle) + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;

        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 35.42462 + (((tickAnim - 0) / 3) * (31.49307-(35.42462)));
            yy = -38.7088 + (((tickAnim - 0) / 3) * (-16.42312-(-38.7088)));
            zz = -24.21483 + (((tickAnim - 0) / 3) * (-9.50474-(-24.21483)));
        }
        else if (tickAnim >= 3 && tickAnim < 8) {
            xx = 31.49307 + (((tickAnim - 3) / 5) * (31.82892-(31.49307)));
            yy = -16.42312 + (((tickAnim - 3) / 5) * (14.58086-(-16.42312)));
            zz = -9.50474 + (((tickAnim - 3) / 5) * (2.89687-(-9.50474)));
        }
        else if (tickAnim >= 8 && tickAnim < 13) {
            xx = 31.82892 + (((tickAnim - 8) / 5) * (32.11868-(31.82892)));
            yy = 14.58086 + (((tickAnim - 8) / 5) * (64.6278-(14.58086)));
            zz = 2.89687 + (((tickAnim - 8) / 5) * (9.549-(2.89687)));
        }
        else if (tickAnim >= 13 && tickAnim < 18) {
            xx = 32.11868 + (((tickAnim - 13) / 5) * (27.85178-(32.11868)));
            yy = 64.6278 + (((tickAnim - 13) / 5) * (9.02032-(64.6278)));
            zz = 9.549 + (((tickAnim - 13) / 5) * (24.92699-(9.549)));
        }
        else if (tickAnim >= 18 && tickAnim < 21) {
            xx = 27.85178 + (((tickAnim - 18) / 3) * (16.53057-(27.85178)));
            yy = 9.02032 + (((tickAnim - 18) / 3) * (-19.90558-(9.02032)));
            zz = 24.92699 + (((tickAnim - 18) / 3) * (11.2614-(24.92699)));
        }
        else if (tickAnim >= 21 && tickAnim < 23) {
            xx = 16.53057 + (((tickAnim - 21) / 2) * (35.42462-(16.53057)));
            yy = -19.90558 + (((tickAnim - 21) / 2) * (-38.7088-(-19.90558)));
            zz = 11.2614 + (((tickAnim - 21) / 2) * (-24.21483-(11.2614)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(legright, legright.rotateAngleX + (float) Math.toRadians(xx), legright.rotateAngleY + (float) Math.toRadians(yy), legright.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 8) {
            xx = 5.75441 + (((tickAnim - 0) / 8) * (1.14736-(5.75441)));
            yy = -2.23867 + (((tickAnim - 0) / 8) * (9.55049-(-2.23867)));
            zz = 26.02446 + (((tickAnim - 0) / 8) * (3.02706-(26.02446)));
        }
        else if (tickAnim >= 8 && tickAnim < 13) {
            xx = 1.14736 + (((tickAnim - 8) / 5) * (0-(1.14736)));
            yy = 9.55049 + (((tickAnim - 8) / 5) * (18.25-(9.55049)));
            zz = 3.02706 + (((tickAnim - 8) / 5) * (0-(3.02706)));
        }
        else if (tickAnim >= 13 && tickAnim < 16) {
            xx = 0 + (((tickAnim - 13) / 3) * (-0.91978-(0)));
            yy = 18.25 + (((tickAnim - 13) / 3) * (23.18214-(18.25)));
            zz = 0 + (((tickAnim - 13) / 3) * (-2.63167-(0)));
        }
        else if (tickAnim >= 16 && tickAnim < 18) {
            xx = -0.91978 + (((tickAnim - 16) / 2) * (4.19688-(-0.91978)));
            yy = 23.18214 + (((tickAnim - 16) / 2) * (7.40266-(23.18214)));
            zz = -2.63167 + (((tickAnim - 16) / 2) * (22.83247-(-2.63167)));
        }
        else if (tickAnim >= 18 && tickAnim < 23) {
            xx = 4.19688 + (((tickAnim - 18) / 5) * (5.75441-(4.19688)));
            yy = 7.40266 + (((tickAnim - 18) / 5) * (-2.23867-(7.40266)));
            zz = 22.83247 + (((tickAnim - 18) / 5) * (26.02446-(22.83247)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(legright2, legright2.rotateAngleX + (float) Math.toRadians(xx), legright2.rotateAngleY + (float) Math.toRadians(yy), legright2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 2) {
            xx = 0 + (((tickAnim - 0) / 2) * (0.44217-(0)));
            yy = 0 + (((tickAnim - 0) / 2) * (-13.91667-(0)));
            zz = -21 + (((tickAnim - 0) / 2) * (-10.41241-(-21)));
        }
        else if (tickAnim >= 2 && tickAnim < 3) {
            xx = 0.44217 + (((tickAnim - 2) / 1) * (0.02819-(0.44217)));
            yy = -13.91667 + (((tickAnim - 2) / 1) * (-18.99925-(-13.91667)));
            zz = -10.41241 + (((tickAnim - 2) / 1) * (-5.15672-(-10.41241)));
        }
        else if (tickAnim >= 3 && tickAnim < 5) {
            xx = 0.02819 + (((tickAnim - 3) / 2) * (-7.50204-(0.02819)));
            yy = -18.99925 + (((tickAnim - 3) / 2) * (-31.86569-(-18.99925)));
            zz = -5.15672 + (((tickAnim - 3) / 2) * (-7.12451-(-5.15672)));
        }
        else if (tickAnim >= 5 && tickAnim < 8) {
            xx = -7.50204 + (((tickAnim - 5) / 3) * (-7.56233-(-7.50204)));
            yy = -31.86569 + (((tickAnim - 5) / 3) * (-34.11723-(-31.86569)));
            zz = -7.12451 + (((tickAnim - 5) / 3) * (-11.22612-(-7.12451)));
        }
        else if (tickAnim >= 8 && tickAnim < 13) {
            xx = -7.56233 + (((tickAnim - 8) / 5) * (-10.018-(-7.56233)));
            yy = -34.11723 + (((tickAnim - 8) / 5) * (-1.9702-(-34.11723)));
            zz = -11.22612 + (((tickAnim - 8) / 5) * (-38.9992-(-11.22612)));
        }
        else if (tickAnim >= 13 && tickAnim < 16) {
            xx = -10.018 + (((tickAnim - 13) / 3) * (-20.57773-(-10.018)));
            yy = -1.9702 + (((tickAnim - 13) / 3) * (-4.73362-(-1.9702)));
            zz = -38.9992 + (((tickAnim - 13) / 3) * (-64.57348-(-38.9992)));
        }
        else if (tickAnim >= 16 && tickAnim < 18) {
            xx = -20.57773 + (((tickAnim - 16) / 2) * (-11.82916-(-20.57773)));
            yy = -4.73362 + (((tickAnim - 16) / 2) * (-6.95907-(-4.73362)));
            zz = -64.57348 + (((tickAnim - 16) / 2) * (-81.49454-(-64.57348)));
        }
        else if (tickAnim >= 18 && tickAnim < 21) {
            xx = -11.82916 + (((tickAnim - 18) / 3) * (-6.36117-(-11.82916)));
            yy = -6.95907 + (((tickAnim - 18) / 3) * (-8.20717-(-6.95907)));
            zz = -81.49454 + (((tickAnim - 18) / 3) * (-21.61038-(-81.49454)));
        }
        else if (tickAnim >= 21 && tickAnim < 23) {
            xx = -6.36117 + (((tickAnim - 21) / 2) * (0-(-6.36117)));
            yy = -8.20717 + (((tickAnim - 21) / 2) * (0-(-8.20717)));
            zz = -21.61038 + (((tickAnim - 21) / 2) * (-21-(-21.61038)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(legright3, legright3.rotateAngleX + (float) Math.toRadians(xx), legright3.rotateAngleY + (float) Math.toRadians(yy), legright3.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 2) {
            xx = 0.4 + (((tickAnim - 0) / 2) * (0.15-(0.4)));
            yy = 0 + (((tickAnim - 0) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 2) * (0-(0)));
        }
        else if (tickAnim >= 2 && tickAnim < 23) {
            xx = 0.15 + (((tickAnim - 2) / 21) * (0.4-(0.15)));
            yy = 0 + (((tickAnim - 2) / 21) * (0-(0)));
            zz = 0 + (((tickAnim - 2) / 21) * (0-(0)));
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
            xx = 32.11868 + (((tickAnim - 0) / 5) * (50.96288-(32.11868)));
            yy = -64.62776 + (((tickAnim - 0) / 5) * (-15.5456-(-64.62776)));
            zz = -9.54901 + (((tickAnim - 0) / 5) * (-28.36642-(-9.54901)));
        }
        else if (tickAnim >= 5 && tickAnim < 8) {
            xx = 50.96288 + (((tickAnim - 5) / 3) * (16.92306-(50.96288)));
            yy = -15.5456 + (((tickAnim - 5) / 3) * (24.03852-(-15.5456)));
            zz = -28.36642 + (((tickAnim - 5) / 3) * (-20.80074-(-28.36642)));
        }
        else if (tickAnim >= 8 && tickAnim < 11) {
            xx = 16.92306 + (((tickAnim - 8) / 3) * (35.42462-(16.92306)));
            yy = 24.03852 + (((tickAnim - 8) / 3) * (38.7088-(24.03852)));
            zz = -20.80074 + (((tickAnim - 8) / 3) * (24.2148-(-20.80074)));
        }
        else if (tickAnim >= 11 && tickAnim < 13) {
            xx = 35.42462 + (((tickAnim - 11) / 2) * (32.53634-(35.42462)));
            yy = 38.7088 + (((tickAnim - 11) / 2) * (25.72459-(38.7088)));
            zz = 24.2148 + (((tickAnim - 11) / 2) * (13.88048-(24.2148)));
        }
        else if (tickAnim >= 13 && tickAnim < 14) {
            xx = 32.53634 + (((tickAnim - 13) / 1) * (31.08002-(32.53634)));
            yy = 25.72459 + (((tickAnim - 13) / 1) * (11.65417-(25.72459)));
            zz = 13.88048 + (((tickAnim - 13) / 1) * (5.75312-(13.88048)));
        }
        else if (tickAnim >= 14 && tickAnim < 23) {
            xx = 31.08002 + (((tickAnim - 14) / 9) * (32.11868-(31.08002)));
            yy = 11.65417 + (((tickAnim - 14) / 9) * (-64.62776-(11.65417)));
            zz = 5.75312 + (((tickAnim - 14) / 9) * (-9.54901-(5.75312)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(legleft, legleft.rotateAngleX + (float) Math.toRadians(xx), legleft.rotateAngleY + (float) Math.toRadians(yy), legleft.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 2) {
            xx = 0 + (((tickAnim - 0) / 2) * (-0.96659-(0)));
            yy = -18.25 + (((tickAnim - 0) / 2) * (-14.6969-(-18.25)));
            zz = 0 + (((tickAnim - 0) / 2) * (12.11616-(0)));
        }
        else if (tickAnim >= 2 && tickAnim < 5) {
            xx = -0.96659 + (((tickAnim - 2) / 3) * (2.6241-(-0.96659)));
            yy = -14.6969 + (((tickAnim - 2) / 3) * (10.04355-(-14.6969)));
            zz = 12.11616 + (((tickAnim - 2) / 3) * (-10.96476-(12.11616)));
        }
        else if (tickAnim >= 5 && tickAnim < 8) {
            xx = 2.6241 + (((tickAnim - 5) / 3) * (3.6937-(2.6241)));
            yy = 10.04355 + (((tickAnim - 5) / 3) * (6.4506-(10.04355)));
            zz = -10.96476 + (((tickAnim - 5) / 3) * (-23.01124-(-10.96476)));
        }
        else if (tickAnim >= 8 && tickAnim < 11) {
            xx = 3.6937 + (((tickAnim - 8) / 3) * (5.75441-(3.6937)));
            yy = 6.4506 + (((tickAnim - 8) / 3) * (2.2387-(6.4506)));
            zz = -23.01124 + (((tickAnim - 8) / 3) * (-26.0245-(-23.01124)));
        }
        else if (tickAnim >= 11 && tickAnim < 14) {
            xx = 5.75441 + (((tickAnim - 11) / 3) * (3.19685-(5.75441)));
            yy = 2.2387 + (((tickAnim - 11) / 3) * (-4.70912-(2.2387)));
            zz = -26.0245 + (((tickAnim - 11) / 3) * (-7.75699-(-26.0245)));
        }
        else if (tickAnim >= 14 && tickAnim < 23) {
            xx = 3.19685 + (((tickAnim - 14) / 9) * (0-(3.19685)));
            yy = -4.70912 + (((tickAnim - 14) / 9) * (-18.25-(-4.70912)));
            zz = -7.75699 + (((tickAnim - 14) / 9) * (0-(-7.75699)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(legleft2, legleft2.rotateAngleX + (float) Math.toRadians(xx), legleft2.rotateAngleY + (float) Math.toRadians(yy), legleft2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 2) {
            xx = -10.018 + (((tickAnim - 0) / 2) * (-21.26972-(-10.018)));
            yy = 1.97016 + (((tickAnim - 0) / 2) * (-1.47587-(1.97016)));
            zz = 38.99917 + (((tickAnim - 0) / 2) * (67.70278-(38.99917)));
        }
        else if (tickAnim >= 2 && tickAnim < 5) {
            xx = -21.26972 + (((tickAnim - 2) / 3) * (-16.49034-(-21.26972)));
            yy = -1.47587 + (((tickAnim - 2) / 3) * (0.5375-(-1.47587)));
            zz = 67.70278 + (((tickAnim - 2) / 3) * (79.46846-(67.70278)));
        }
        else if (tickAnim >= 5 && tickAnim < 8) {
            xx = -16.49034 + (((tickAnim - 5) / 3) * (-5.68913-(-16.49034)));
            yy = 0.5375 + (((tickAnim - 5) / 3) * (2.57126-(0.5375)));
            zz = 79.46846 + (((tickAnim - 5) / 3) * (16.49978-(79.46846)));
        }
        else if (tickAnim >= 8 && tickAnim < 11) {
            xx = -5.68913 + (((tickAnim - 8) / 3) * (0-(-5.68913)));
            yy = 2.57126 + (((tickAnim - 8) / 3) * (0-(2.57126)));
            zz = 16.49978 + (((tickAnim - 8) / 3) * (21-(16.49978)));
        }
        else if (tickAnim >= 11 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 11) / 2) * (11.89833-(0)));
            yy = 0 + (((tickAnim - 11) / 2) * (15.3226-(0)));
            zz = 21 + (((tickAnim - 11) / 2) * (7.64637-(21)));
        }
        else if (tickAnim >= 13 && tickAnim < 14) {
            xx = 11.89833 + (((tickAnim - 13) / 1) * (24.90949-(11.89833)));
            yy = 15.3226 + (((tickAnim - 13) / 1) * (27.21868-(15.3226)));
            zz = 7.64637 + (((tickAnim - 13) / 1) * (1.05664-(7.64637)));
        }
        else if (tickAnim >= 14 && tickAnim < 18) {
            xx = 24.90949 + (((tickAnim - 14) / 4) * (9.19668-(24.90949)));
            yy = 27.21868 + (((tickAnim - 14) / 4) * (34.79138-(27.21868)));
            zz = 1.05664 + (((tickAnim - 14) / 4) * (1.52528-(1.05664)));
        }
        else if (tickAnim >= 18 && tickAnim < 23) {
            xx = 9.19668 + (((tickAnim - 18) / 5) * (-10.018-(9.19668)));
            yy = 34.79138 + (((tickAnim - 18) / 5) * (1.97016-(34.79138)));
            zz = 1.52528 + (((tickAnim - 18) / 5) * (38.99917-(1.52528)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(legleft3, legleft3.rotateAngleX + (float) Math.toRadians(xx), legleft3.rotateAngleY + (float) Math.toRadians(yy), legleft3.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 11) {
            xx = 0 + (((tickAnim - 0) / 11) * (-0.415-(0)));
            yy = 0 + (((tickAnim - 0) / 11) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 11) * (0-(0)));
        }
        else if (tickAnim >= 11 && tickAnim < 12) {
            xx = -0.415 + (((tickAnim - 11) / 1) * (-0.53-(-0.415)));
            yy = 0 + (((tickAnim - 11) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 11) / 1) * (0-(0)));
        }
        else if (tickAnim >= 12 && tickAnim < 13) {
            xx = -0.53 + (((tickAnim - 12) / 1) * (-0.25-(-0.53)));
            yy = 0 + (((tickAnim - 12) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 12) / 1) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.legleft3.rotationPointX = this.legleft3.rotationPointX + (float)(xx);
        this.legleft3.rotationPointY = this.legleft3.rotationPointY - (float)(yy);
        this.legleft3.rotationPointZ = this.legleft3.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 7) {
            xx = 49.46067 + (((tickAnim - 0) / 7) * (-3.27389-(49.46067)));
            yy = 17.23099 + (((tickAnim - 0) / 7) * (-25.25676-(17.23099)));
            zz = 53.26732 + (((tickAnim - 0) / 7) * (34.85626-(53.26732)));
        }
        else if (tickAnim >= 7 && tickAnim < 12) {
            xx = -3.27389 + (((tickAnim - 7) / 5) * (7.09268-(-3.27389)));
            yy = -25.25676 + (((tickAnim - 7) / 5) * (-65.13507-(-25.25676)));
            zz = 34.85626 + (((tickAnim - 7) / 5) * (-6.05806-(34.85626)));
        }
        else if (tickAnim >= 12 && tickAnim < 23) {
            xx = 7.09268 + (((tickAnim - 12) / 11) * (49.46067-(7.09268)));
            yy = -65.13507 + (((tickAnim - 12) / 11) * (17.23099-(-65.13507)));
            zz = -6.05806 + (((tickAnim - 12) / 11) * (53.26732-(-6.05806)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(armright, armright.rotateAngleX + (float) Math.toRadians(xx), armright.rotateAngleY + (float) Math.toRadians(yy), armright.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 50.07083 + (((tickAnim - 0) / 3) * (51.54402-(50.07083)));
            yy = -46.87904 + (((tickAnim - 0) / 3) * (-34.30474-(-46.87904)));
            zz = -10.04739 + (((tickAnim - 0) / 3) * (9.24297-(-10.04739)));
        }
        else if (tickAnim >= 3 && tickAnim < 7) {
            xx = 51.54402 + (((tickAnim - 3) / 4) * (31.12973-(51.54402)));
            yy = -34.30474 + (((tickAnim - 3) / 4) * (-8.85504-(-34.30474)));
            zz = 9.24297 + (((tickAnim - 3) / 4) * (36.44722-(9.24297)));
        }
        else if (tickAnim >= 7 && tickAnim < 10) {
            xx = 31.12973 + (((tickAnim - 7) / 3) * (-0.72561-(31.12973)));
            yy = -8.85504 + (((tickAnim - 7) / 3) * (29.15399-(-8.85504)));
            zz = 36.44722 + (((tickAnim - 7) / 3) * (11.0356-(36.44722)));
        }
        else if (tickAnim >= 10 && tickAnim < 12) {
            xx = -0.72561 + (((tickAnim - 10) / 2) * (14.81017-(-0.72561)));
            yy = 29.15399 + (((tickAnim - 10) / 2) * (23.6645-(29.15399)));
            zz = 11.0356 + (((tickAnim - 10) / 2) * (10.6946-(11.0356)));
        }
        else if (tickAnim >= 12 && tickAnim < 23) {
            xx = 14.81017 + (((tickAnim - 12) / 11) * (50.07083-(14.81017)));
            yy = 23.6645 + (((tickAnim - 12) / 11) * (-46.87904-(23.6645)));
            zz = 10.6946 + (((tickAnim - 12) / 11) * (-10.04739-(10.6946)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(armright2, armright2.rotateAngleX + (float) Math.toRadians(xx), armright2.rotateAngleY + (float) Math.toRadians(yy), armright2.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 0.175 + (((tickAnim - 0) / 3) * (0.13-(0.175)));
            yy = 0 + (((tickAnim - 0) / 3) * (0.5-(0)));
            zz = 0.575 + (((tickAnim - 0) / 3) * (0.88-(0.575)));
        }
        else if (tickAnim >= 3 && tickAnim < 7) {
            xx = 0.13 + (((tickAnim - 3) / 4) * (0.07-(0.13)));
            yy = 0.5 + (((tickAnim - 3) / 4) * (0.505-(0.5)));
            zz = 0.88 + (((tickAnim - 3) / 4) * (0.49-(0.88)));
        }
        else if (tickAnim >= 7 && tickAnim < 12) {
            xx = 0.07 + (((tickAnim - 7) / 5) * (0-(0.07)));
            yy = 0.505 + (((tickAnim - 7) / 5) * (0-(0.505)));
            zz = 0.49 + (((tickAnim - 7) / 5) * (0-(0.49)));
        }
        else if (tickAnim >= 12 && tickAnim < 23) {
            xx = 0 + (((tickAnim - 12) / 11) * (0.175-(0)));
            yy = 0 + (((tickAnim - 12) / 11) * (0-(0)));
            zz = 0 + (((tickAnim - 12) / 11) * (0.575-(0)));
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
            xx = -46.1713 + (((tickAnim - 0) / 3) * (-10.56956-(-46.1713)));
            yy = -1.17545 + (((tickAnim - 0) / 3) * (5.03728-(-1.17545)));
            zz = -7.66088 + (((tickAnim - 0) / 3) * (-24.60884-(-7.66088)));
        }
        else if (tickAnim >= 3 && tickAnim < 7) {
            xx = -10.56956 + (((tickAnim - 3) / 4) * (59.97046-(-10.56956)));
            yy = 5.03728 + (((tickAnim - 3) / 4) * (-1.91908-(5.03728)));
            zz = -24.60884 + (((tickAnim - 3) / 4) * (1.57458-(-24.60884)));
        }
        else if (tickAnim >= 7 && tickAnim < 10) {
            xx = 59.97046 + (((tickAnim - 7) / 3) * (32.48818-(59.97046)));
            yy = -1.91908 + (((tickAnim - 7) / 3) * (-0.76763-(-1.91908)));
            zz = 1.57458 + (((tickAnim - 7) / 3) * (0.62983-(1.57458)));
        }
        else if (tickAnim >= 10 && tickAnim < 12) {
            xx = 32.48818 + (((tickAnim - 10) / 2) * (0-(32.48818)));
            yy = -0.76763 + (((tickAnim - 10) / 2) * (0-(-0.76763)));
            zz = 0.62983 + (((tickAnim - 10) / 2) * (0-(0.62983)));
        }
        else if (tickAnim >= 12 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 12) / 1) * (-19.52049-(0)));
            yy = 0 + (((tickAnim - 12) / 1) * (1.26485-(0)));
            zz = 0 + (((tickAnim - 12) / 1) * (-9.3933-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 14) {
            xx = -19.52049 + (((tickAnim - 13) / 1) * (-27.90902-(-19.52049)));
            yy = 1.26485 + (((tickAnim - 13) / 1) * (0.36586-(1.26485)));
            zz = -9.3933 + (((tickAnim - 13) / 1) * (-12.35509-(-9.3933)));
        }
        else if (tickAnim >= 14 && tickAnim < 15) {
            xx = -27.90902 + (((tickAnim - 14) / 1) * (-34.82064-(-27.90902)));
            yy = 0.36586 + (((tickAnim - 14) / 1) * (-0.43376-(0.36586)));
            zz = -12.35509 + (((tickAnim - 14) / 1) * (-14.04523-(-12.35509)));
        }
        else if (tickAnim >= 15 && tickAnim < 17) {
            xx = -34.82064 + (((tickAnim - 15) / 2) * (-43.49104-(-34.82064)));
            yy = -0.43376 + (((tickAnim - 15) / 2) * (-0.8869-(-0.43376)));
            zz = -14.04523 + (((tickAnim - 15) / 2) * (-13.62821-(-14.04523)));
        }
        else if (tickAnim >= 17 && tickAnim < 23) {
            xx = -43.49104 + (((tickAnim - 17) / 6) * (-46.1713-(-43.49104)));
            yy = -0.8869 + (((tickAnim - 17) / 6) * (-1.17545-(-0.8869)));
            zz = -13.62821 + (((tickAnim - 17) / 6) * (-7.66088-(-13.62821)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(armright3, armright3.rotateAngleX + (float) Math.toRadians(xx), armright3.rotateAngleY + (float) Math.toRadians(yy), armright3.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 3) * (0.2-(0)));
            zz = 0 + (((tickAnim - 0) / 3) * (0.1-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 12) {
            xx = 0 + (((tickAnim - 3) / 9) * (0-(0)));
            yy = 0.2 + (((tickAnim - 3) / 9) * (0.485-(0.2)));
            zz = 0.1 + (((tickAnim - 3) / 9) * (0.06-(0.1)));
        }
        else if (tickAnim >= 12 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 12) / 1) * (0-(0)));
            yy = 0.485 + (((tickAnim - 12) / 1) * (0.465-(0.485)));
            zz = 0.06 + (((tickAnim - 12) / 1) * (0.05-(0.06)));
        }
        else if (tickAnim >= 13 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 13) / 0) * (0-(0)));
            yy = 0.465 + (((tickAnim - 13) / 0) * (0.34-(0.465)));
            zz = 0.05 + (((tickAnim - 13) / 0) * (0.05-(0.05)));
        }
        else if (tickAnim >= 13 && tickAnim < 14) {
            xx = 0 + (((tickAnim - 13) / 1) * (0-(0)));
            yy = 0.34 + (((tickAnim - 13) / 1) * (0.3-(0.34)));
            zz = 0.05 + (((tickAnim - 13) / 1) * (0.05-(0.05)));
        }
        else if (tickAnim >= 14 && tickAnim < 23) {
            xx = 0 + (((tickAnim - 14) / 9) * (0-(0)));
            yy = 0.3 + (((tickAnim - 14) / 9) * (0-(0.3)));
            zz = 0.05 + (((tickAnim - 14) / 9) * (0-(0.05)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.armright3.rotationPointX = this.armright3.rotationPointX + (float)(xx);
        this.armright3.rotationPointY = this.armright3.rotationPointY - (float)(yy);
        this.armright3.rotationPointZ = this.armright3.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 13) {
            xx = 2.44213 + (((tickAnim - 0) / 13) * (49.46067-(2.44213)));
            yy = 52.1487 + (((tickAnim - 0) / 13) * (-17.231-(52.1487)));
            zz = 5.33974 + (((tickAnim - 0) / 13) * (-53.2673-(5.33974)));
        }
        else if (tickAnim >= 13 && tickAnim < 18) {
            xx = 49.46067 + (((tickAnim - 13) / 5) * (-3.27389-(49.46067)));
            yy = -17.231 + (((tickAnim - 13) / 5) * (25.2568-(-17.231)));
            zz = -53.2673 + (((tickAnim - 13) / 5) * (-34.8563-(-53.2673)));
        }
        else if (tickAnim >= 18 && tickAnim < 23) {
            xx = -3.27389 + (((tickAnim - 18) / 5) * (2.44213-(-3.27389)));
            yy = 25.2568 + (((tickAnim - 18) / 5) * (52.1487-(25.2568)));
            zz = -34.8563 + (((tickAnim - 18) / 5) * (5.33974-(-34.8563)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(armleft, armleft.rotateAngleX + (float) Math.toRadians(xx), armleft.rotateAngleY + (float) Math.toRadians(yy), armleft.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 13) {
            xx = 14.81017 + (((tickAnim - 0) / 13) * (50.07083-(14.81017)));
            yy = -23.66447 + (((tickAnim - 0) / 13) * (46.879-(-23.66447)));
            zz = -10.69461 + (((tickAnim - 0) / 13) * (10.0474-(-10.69461)));
        }
        else if (tickAnim >= 13 && tickAnim < 15) {
            xx = 50.07083 + (((tickAnim - 13) / 2) * (51.54402-(50.07083)));
            yy = 46.879 + (((tickAnim - 13) / 2) * (34.3047-(46.879)));
            zz = 10.0474 + (((tickAnim - 13) / 2) * (-9.243-(10.0474)));
        }
        else if (tickAnim >= 15 && tickAnim < 18) {
            xx = 51.54402 + (((tickAnim - 15) / 3) * (31.12973-(51.54402)));
            yy = 34.3047 + (((tickAnim - 15) / 3) * (8.855-(34.3047)));
            zz = -9.243 + (((tickAnim - 15) / 3) * (-36.4472-(-9.243)));
        }
        else if (tickAnim >= 18 && tickAnim < 22) {
            xx = 31.12973 + (((tickAnim - 18) / 4) * (-0.72561-(31.12973)));
            yy = 8.855 + (((tickAnim - 18) / 4) * (-29.154-(8.855)));
            zz = -36.4472 + (((tickAnim - 18) / 4) * (-11.0356-(-36.4472)));
        }
        else if (tickAnim >= 22 && tickAnim < 23) {
            xx = -0.72561 + (((tickAnim - 22) / 1) * (14.81017-(-0.72561)));
            yy = -29.154 + (((tickAnim - 22) / 1) * (-23.66447-(-29.154)));
            zz = -11.0356 + (((tickAnim - 22) / 1) * (-10.69461-(-11.0356)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(armleft2, armleft2.rotateAngleX + (float) Math.toRadians(xx), armleft2.rotateAngleY + (float) Math.toRadians(yy), armleft2.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 0) / 13) * (-0.175-(0)));
            yy = 0 + (((tickAnim - 0) / 13) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 13) * (0.575-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 15) {
            xx = -0.175 + (((tickAnim - 13) / 2) * (0.13-(-0.175)));
            yy = 0 + (((tickAnim - 13) / 2) * (0.5-(0)));
            zz = 0.575 + (((tickAnim - 13) / 2) * (0.88-(0.575)));
        }
        else if (tickAnim >= 15 && tickAnim < 18) {
            xx = 0.13 + (((tickAnim - 15) / 3) * (0.07-(0.13)));
            yy = 0.5 + (((tickAnim - 15) / 3) * (0.505-(0.5)));
            zz = 0.88 + (((tickAnim - 15) / 3) * (0.49-(0.88)));
        }
        else if (tickAnim >= 18 && tickAnim < 23) {
            xx = 0.07 + (((tickAnim - 18) / 5) * (0-(0.07)));
            yy = 0.505 + (((tickAnim - 18) / 5) * (0-(0.505)));
            zz = 0.49 + (((tickAnim - 18) / 5) * (0-(0.49)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.armleft2.rotationPointX = this.armleft2.rotationPointX + (float)(xx);
        this.armleft2.rotationPointY = this.armleft2.rotationPointY - (float)(yy);
        this.armleft2.rotationPointZ = this.armleft2.rotationPointZ + (float)(zz);



        this.setRotateAngle(hips, hips.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*309/0.5+20))*1.8), hips.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*309-50))*5), hips.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*309-20))*3.5));

        if (tickAnim >= 0 && tickAnim < 7) {
            xx = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*309))*-0.2 + (((tickAnim - 0) / 7) * (0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*309))*-0.2-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*309))*-0.2)));
            yy = -0.275+Math.sin((Math.PI/180)*(((double)tickAnim/20)*309/0.5-20))*0.25 + (((tickAnim - 0) / 7) * (0.05+Math.sin((Math.PI/180)*(((double)tickAnim/20)*309/0.5-30))*0.2-(-0.275+Math.sin((Math.PI/180)*(((double)tickAnim/20)*309/0.5-20))*0.25)));
            zz = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*309/0.5))*0.25 + (((tickAnim - 0) / 7) * (0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*309/0.5))*0.25-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*309/0.5))*0.25)));
        }
        else if (tickAnim >= 7 && tickAnim < 12) {
            xx = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*309))*-0.2 + (((tickAnim - 7) / 5) * (0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*309))*-0.2-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*309))*-0.2)));
            yy = 0.05+Math.sin((Math.PI/180)*(((double)tickAnim/20)*309/0.5-30))*0.2 + (((tickAnim - 7) / 5) * (-0.275+Math.sin((Math.PI/180)*(((double)tickAnim/20)*309/0.5))*0.25-(0.05+Math.sin((Math.PI/180)*(((double)tickAnim/20)*309/0.5-30))*0.2)));
            zz = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*309/0.5))*0.25 + (((tickAnim - 7) / 5) * (0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*309/0.5))*0.25-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*309/0.5))*0.25)));
        }
        else if (tickAnim >= 12 && tickAnim < 18) {
            xx = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*309))*-0.2 + (((tickAnim - 12) / 6) * (0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*309))*-0.2-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*309))*-0.2)));
            yy = -0.275+Math.sin((Math.PI/180)*(((double)tickAnim/20)*309/0.5))*0.25 + (((tickAnim - 12) / 6) * (0.05+Math.sin((Math.PI/180)*(((double)tickAnim/20)*309/0.5-30))*0.25-(-0.275+Math.sin((Math.PI/180)*(((double)tickAnim/20)*309/0.5))*0.25)));
            zz = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*309/0.5))*0.25 + (((tickAnim - 12) / 6) * (0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*309/0.5))*0.25-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*309/0.5))*0.25)));
        }
        else if (tickAnim >= 18 && tickAnim < 23) {
            xx = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*309))*-0.2 + (((tickAnim - 18) / 5) * (0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*309))*-0.2-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*309))*-0.2)));
            yy = 0.05+Math.sin((Math.PI/180)*(((double)tickAnim/20)*309/0.5-30))*0.25 + (((tickAnim - 18) / 5) * (-0.275+Math.sin((Math.PI/180)*(((double)tickAnim/20)*309/0.5-20))*0.25-(0.05+Math.sin((Math.PI/180)*(((double)tickAnim/20)*309/0.5-30))*0.25)));
            zz = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*309/0.5))*0.25 + (((tickAnim - 18) / 5) * (0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*309/0.5))*0.25-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*309/0.5))*0.25)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.hips.rotationPointX = this.hips.rotationPointX + (float)(xx);
        this.hips.rotationPointY = this.hips.rotationPointY - (float)(yy);
        this.hips.rotationPointZ = this.hips.rotationPointZ + (float)(zz);



        this.setRotateAngle(tail1, tail1.rotateAngleX + (float) Math.toRadians(-3+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*309/0.5+20))*-2.5), tail1.rotateAngleY + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*309-190))*5), tail1.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(tail2, tail2.rotateAngleX + (float) Math.toRadians(-2.5), tail2.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*309-230))*5), tail2.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*309-100))*5));


        this.setRotateAngle(tail3, tail3.rotateAngleX + (float) Math.toRadians(7.5), tail3.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*309-280))*10), tail3.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*309-250))*-10));


        this.setRotateAngle(body, body.rotateAngleX + (float) Math.toRadians(0), body.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*309-150))*-5), body.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(chest, chest.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*309/0.5))*-1.9), chest.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*309-200))*7), chest.rotateAngleZ + (float) Math.toRadians(0));



        if (tickAnim >= 0 && tickAnim < 2) {
            xx = 0 + (((tickAnim - 0) / 2) * (-19.58423-(0)));
            yy = 0 + (((tickAnim - 0) / 2) * (-0.71666-(0)));
            zz = 0 + (((tickAnim - 0) / 2) * (9.4451-(0)));
        }
        else if (tickAnim >= 2 && tickAnim < 3) {
            xx = -19.58423 + (((tickAnim - 2) / 1) * (-32.1231-(-19.58423)));
            yy = -0.71666 + (((tickAnim - 2) / 1) * (-0.48497-(-0.71666)));
            zz = 9.4451 + (((tickAnim - 2) / 1) * (13.47236-(9.4451)));
        }
        else if (tickAnim >= 3 && tickAnim < 5) {
            xx = -32.1231 + (((tickAnim - 3) / 2) * (-40.67732-(-32.1231)));
            yy = -0.48497 + (((tickAnim - 3) / 2) * (-0.18308-(-0.48497)));
            zz = 13.47236 + (((tickAnim - 3) / 2) * (12.41573-(13.47236)));
        }
        else if (tickAnim >= 5 && tickAnim < 7) {
            xx = -40.67732 + (((tickAnim - 5) / 2) * (-45.23153-(-40.67732)));
            yy = -0.18308 + (((tickAnim - 5) / 2) * (0.1188-(-0.18308)));
            zz = 12.41573 + (((tickAnim - 5) / 2) * (11.3591-(12.41573)));
        }
        else if (tickAnim >= 7 && tickAnim < 13) {
            xx = -45.23153 + (((tickAnim - 7) / 6) * (-46.1713-(-45.23153)));
            yy = 0.1188 + (((tickAnim - 7) / 6) * (1.1754-(0.1188)));
            zz = 11.3591 + (((tickAnim - 7) / 6) * (7.6609-(11.3591)));
        }
        else if (tickAnim >= 13 && tickAnim < 15) {
            xx = -46.1713 + (((tickAnim - 13) / 2) * (-10.56956-(-46.1713)));
            yy = 1.1754 + (((tickAnim - 13) / 2) * (-5.0373-(1.1754)));
            zz = 7.6609 + (((tickAnim - 13) / 2) * (24.6088-(7.6609)));
        }
        else if (tickAnim >= 15 && tickAnim < 19) {
            xx = -10.56956 + (((tickAnim - 15) / 4) * (59.97046-(-10.56956)));
            yy = -5.0373 + (((tickAnim - 15) / 4) * (1.9191-(-5.0373)));
            zz = 24.6088 + (((tickAnim - 15) / 4) * (-1.5746-(24.6088)));
        }
        else if (tickAnim >= 19 && tickAnim < 22) {
            xx = 59.97046 + (((tickAnim - 19) / 3) * (32.48818-(59.97046)));
            yy = 1.9191 + (((tickAnim - 19) / 3) * (0.7676-(1.9191)));
            zz = -1.5746 + (((tickAnim - 19) / 3) * (-0.6298-(-1.5746)));
        }
        else if (tickAnim >= 22 && tickAnim < 23) {
            xx = 32.48818 + (((tickAnim - 22) / 1) * (0-(32.48818)));
            yy = 0.7676 + (((tickAnim - 22) / 1) * (0-(0.7676)));
            zz = -0.6298 + (((tickAnim - 22) / 1) * (0-(-0.6298)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(armleft3, armleft3.rotateAngleX + (float) Math.toRadians(xx), armleft3.rotateAngleY + (float) Math.toRadians(yy), armleft3.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 2) {
            xx = 0 + (((tickAnim - 0) / 2) * (0-(0)));
            yy = 0.45 + (((tickAnim - 0) / 2) * (0.32-(0.45)));
            zz = 0 + (((tickAnim - 0) / 2) * (0-(0)));
        }
        else if (tickAnim >= 2 && tickAnim < 3) {
            xx = 0 + (((tickAnim - 2) / 1) * (0-(0)));
            yy = 0.32 + (((tickAnim - 2) / 1) * (0.23-(0.32)));
            zz = 0 + (((tickAnim - 2) / 1) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 3) / 10) * (0-(0)));
            yy = 0.23 + (((tickAnim - 3) / 10) * (0-(0.23)));
            zz = 0 + (((tickAnim - 3) / 10) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 13) / 2) * (0-(0)));
            yy = 0 + (((tickAnim - 13) / 2) * (0.2-(0)));
            zz = 0 + (((tickAnim - 13) / 2) * (0.1-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 23) {
            xx = 0 + (((tickAnim - 15) / 8) * (0-(0)));
            yy = 0.2 + (((tickAnim - 15) / 8) * (0.45-(0.2)));
            zz = 0.1 + (((tickAnim - 15) / 8) * (0-(0.1)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.armleft3.rotationPointX = this.armleft3.rotationPointX + (float)(xx);
        this.armleft3.rotationPointY = this.armleft3.rotationPointY - (float)(yy);
        this.armleft3.rotationPointZ = this.armleft3.rotationPointZ + (float)(zz);



        this.setRotateAngle(neck, neck.rotateAngleX + (float) Math.toRadians(0), neck.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*309-200))*7), neck.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(head, head.rotateAngleX + (float) Math.toRadians(0), head.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*309-250))*-7), head.rotateAngleZ + (float) Math.toRadians(0));


    }
    public void animRun(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime) {
        EntityPrehistoricFloraEldeceeon entity = (EntityPrehistoricFloraEldeceeon) entitylivingbaseIn;
        int animCycle = 12;
        double tickAnim = (entity.ticksExisted + entity.getTickOffset()) - (int) (Math.floor((double) (entity.ticksExisted + entity.getTickOffset()) / (double) animCycle) * (double) animCycle) + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;

        if (tickAnim >= 0 && tickAnim < 2) {
            xx = 35.42462 + (((tickAnim - 0) / 2) * (31.49307-(35.42462)));
            yy = -38.7088 + (((tickAnim - 0) / 2) * (-16.42312-(-38.7088)));
            zz = -24.21483 + (((tickAnim - 0) / 2) * (-9.50474-(-24.21483)));
        }
        else if (tickAnim >= 2 && tickAnim < 4) {
            xx = 31.49307 + (((tickAnim - 2) / 2) * (31.82892-(31.49307)));
            yy = -16.42312 + (((tickAnim - 2) / 2) * (14.58086-(-16.42312)));
            zz = -9.50474 + (((tickAnim - 2) / 2) * (2.89687-(-9.50474)));
        }
        else if (tickAnim >= 4 && tickAnim < 7) {
            xx = 31.82892 + (((tickAnim - 4) / 3) * (32.11868-(31.82892)));
            yy = 14.58086 + (((tickAnim - 4) / 3) * (64.6278-(14.58086)));
            zz = 2.89687 + (((tickAnim - 4) / 3) * (9.549-(2.89687)));
        }
        else if (tickAnim >= 7 && tickAnim < 9) {
            xx = 32.11868 + (((tickAnim - 7) / 2) * (27.85178-(32.11868)));
            yy = 64.6278 + (((tickAnim - 7) / 2) * (9.02032-(64.6278)));
            zz = 9.549 + (((tickAnim - 7) / 2) * (24.92699-(9.549)));
        }
        else if (tickAnim >= 9 && tickAnim < 11) {
            xx = 27.85178 + (((tickAnim - 9) / 2) * (16.53057-(27.85178)));
            yy = 9.02032 + (((tickAnim - 9) / 2) * (-19.90558-(9.02032)));
            zz = 24.92699 + (((tickAnim - 9) / 2) * (11.2614-(24.92699)));
        }
        else if (tickAnim >= 11 && tickAnim < 13) {
            xx = 16.53057 + (((tickAnim - 11) / 2) * (35.42462-(16.53057)));
            yy = -19.90558 + (((tickAnim - 11) / 2) * (-38.7088-(-19.90558)));
            zz = 11.2614 + (((tickAnim - 11) / 2) * (-24.21483-(11.2614)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(legright, legright.rotateAngleX + (float) Math.toRadians(xx), legright.rotateAngleY + (float) Math.toRadians(yy), legright.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 4) {
            xx = 5.75441 + (((tickAnim - 0) / 4) * (1.14736-(5.75441)));
            yy = -2.23867 + (((tickAnim - 0) / 4) * (9.55049-(-2.23867)));
            zz = 26.02446 + (((tickAnim - 0) / 4) * (3.02706-(26.02446)));
        }
        else if (tickAnim >= 4 && tickAnim < 7) {
            xx = 1.14736 + (((tickAnim - 4) / 3) * (0-(1.14736)));
            yy = 9.55049 + (((tickAnim - 4) / 3) * (18.25-(9.55049)));
            zz = 3.02706 + (((tickAnim - 4) / 3) * (0-(3.02706)));
        }
        else if (tickAnim >= 7 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 7) / 1) * (-0.91978-(0)));
            yy = 18.25 + (((tickAnim - 7) / 1) * (23.18214-(18.25)));
            zz = 0 + (((tickAnim - 7) / 1) * (-2.63167-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 9) {
            xx = -0.91978 + (((tickAnim - 8) / 1) * (4.19688-(-0.91978)));
            yy = 23.18214 + (((tickAnim - 8) / 1) * (7.40266-(23.18214)));
            zz = -2.63167 + (((tickAnim - 8) / 1) * (22.83247-(-2.63167)));
        }
        else if (tickAnim >= 9 && tickAnim < 13) {
            xx = 4.19688 + (((tickAnim - 9) / 4) * (5.75441-(4.19688)));
            yy = 7.40266 + (((tickAnim - 9) / 4) * (-2.23867-(7.40266)));
            zz = 22.83247 + (((tickAnim - 9) / 4) * (26.02446-(22.83247)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(legright2, legright2.rotateAngleX + (float) Math.toRadians(xx), legright2.rotateAngleY + (float) Math.toRadians(yy), legright2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 1) {
            xx = 0 + (((tickAnim - 0) / 1) * (0.44217-(0)));
            yy = 0 + (((tickAnim - 0) / 1) * (-13.91667-(0)));
            zz = -21 + (((tickAnim - 0) / 1) * (-10.41241-(-21)));
        }
        else if (tickAnim >= 1 && tickAnim < 2) {
            xx = 0.44217 + (((tickAnim - 1) / 1) * (0.02819-(0.44217)));
            yy = -13.91667 + (((tickAnim - 1) / 1) * (-18.99925-(-13.91667)));
            zz = -10.41241 + (((tickAnim - 1) / 1) * (-5.15672-(-10.41241)));
        }
        else if (tickAnim >= 2 && tickAnim < 3) {
            xx = 0.02819 + (((tickAnim - 2) / 1) * (-7.50204-(0.02819)));
            yy = -18.99925 + (((tickAnim - 2) / 1) * (-31.86569-(-18.99925)));
            zz = -5.15672 + (((tickAnim - 2) / 1) * (-7.12451-(-5.15672)));
        }
        else if (tickAnim >= 3 && tickAnim < 4) {
            xx = -7.50204 + (((tickAnim - 3) / 1) * (-7.56233-(-7.50204)));
            yy = -31.86569 + (((tickAnim - 3) / 1) * (-34.11723-(-31.86569)));
            zz = -7.12451 + (((tickAnim - 3) / 1) * (-11.22612-(-7.12451)));
        }
        else if (tickAnim >= 4 && tickAnim < 7) {
            xx = -7.56233 + (((tickAnim - 4) / 3) * (-10.018-(-7.56233)));
            yy = -34.11723 + (((tickAnim - 4) / 3) * (-1.9702-(-34.11723)));
            zz = -11.22612 + (((tickAnim - 4) / 3) * (-38.9992-(-11.22612)));
        }
        else if (tickAnim >= 7 && tickAnim < 8) {
            xx = -10.018 + (((tickAnim - 7) / 1) * (-20.57773-(-10.018)));
            yy = -1.9702 + (((tickAnim - 7) / 1) * (-4.73362-(-1.9702)));
            zz = -38.9992 + (((tickAnim - 7) / 1) * (-64.57348-(-38.9992)));
        }
        else if (tickAnim >= 8 && tickAnim < 9) {
            xx = -20.57773 + (((tickAnim - 8) / 1) * (-11.82916-(-20.57773)));
            yy = -4.73362 + (((tickAnim - 8) / 1) * (-6.95907-(-4.73362)));
            zz = -64.57348 + (((tickAnim - 8) / 1) * (-81.49454-(-64.57348)));
        }
        else if (tickAnim >= 9 && tickAnim < 11) {
            xx = -11.82916 + (((tickAnim - 9) / 2) * (-6.36117-(-11.82916)));
            yy = -6.95907 + (((tickAnim - 9) / 2) * (-8.20717-(-6.95907)));
            zz = -81.49454 + (((tickAnim - 9) / 2) * (-21.61038-(-81.49454)));
        }
        else if (tickAnim >= 11 && tickAnim < 13) {
            xx = -6.36117 + (((tickAnim - 11) / 2) * (0-(-6.36117)));
            yy = -8.20717 + (((tickAnim - 11) / 2) * (0-(-8.20717)));
            zz = -21.61038 + (((tickAnim - 11) / 2) * (-21-(-21.61038)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(legright3, legright3.rotateAngleX + (float) Math.toRadians(xx), legright3.rotateAngleY + (float) Math.toRadians(yy), legright3.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 1) {
            xx = 0.575 + (((tickAnim - 0) / 1) * (0.15-(0.575)));
            yy = 0 + (((tickAnim - 0) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 1) * (0-(0)));
        }
        else if (tickAnim >= 1 && tickAnim < 13) {
            xx = 0.15 + (((tickAnim - 1) / 12) * (0.575-(0.15)));
            yy = 0 + (((tickAnim - 1) / 12) * (0-(0)));
            zz = 0 + (((tickAnim - 1) / 12) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.legright3.rotationPointX = this.legright3.rotationPointX + (float)(xx);
        this.legright3.rotationPointY = this.legright3.rotationPointY - (float)(yy);
        this.legright3.rotationPointZ = this.legright3.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 32.11868 + (((tickAnim - 0) / 3) * (50.96288-(32.11868)));
            yy = -64.62776 + (((tickAnim - 0) / 3) * (-15.5456-(-64.62776)));
            zz = -9.54901 + (((tickAnim - 0) / 3) * (-28.36642-(-9.54901)));
        }
        else if (tickAnim >= 3 && tickAnim < 4) {
            xx = 50.96288 + (((tickAnim - 3) / 1) * (16.92306-(50.96288)));
            yy = -15.5456 + (((tickAnim - 3) / 1) * (24.03852-(-15.5456)));
            zz = -28.36642 + (((tickAnim - 3) / 1) * (-20.80074-(-28.36642)));
        }
        else if (tickAnim >= 4 && tickAnim < 6) {
            xx = 16.92306 + (((tickAnim - 4) / 2) * (35.42462-(16.92306)));
            yy = 24.03852 + (((tickAnim - 4) / 2) * (38.7088-(24.03852)));
            zz = -20.80074 + (((tickAnim - 4) / 2) * (24.2148-(-20.80074)));
        }
        else if (tickAnim >= 6 && tickAnim < 7) {
            xx = 35.42462 + (((tickAnim - 6) / 1) * (32.53634-(35.42462)));
            yy = 38.7088 + (((tickAnim - 6) / 1) * (25.72459-(38.7088)));
            zz = 24.2148 + (((tickAnim - 6) / 1) * (13.88048-(24.2148)));
        }
        else if (tickAnim >= 7 && tickAnim < 8) {
            xx = 32.53634 + (((tickAnim - 7) / 1) * (31.08002-(32.53634)));
            yy = 25.72459 + (((tickAnim - 7) / 1) * (11.65417-(25.72459)));
            zz = 13.88048 + (((tickAnim - 7) / 1) * (5.75312-(13.88048)));
        }
        else if (tickAnim >= 8 && tickAnim < 13) {
            xx = 31.08002 + (((tickAnim - 8) / 5) * (32.11868-(31.08002)));
            yy = 11.65417 + (((tickAnim - 8) / 5) * (-64.62776-(11.65417)));
            zz = 5.75312 + (((tickAnim - 8) / 5) * (-9.54901-(5.75312)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(legleft, legleft.rotateAngleX + (float) Math.toRadians(xx), legleft.rotateAngleY + (float) Math.toRadians(yy), legleft.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 1) {
            xx = 0 + (((tickAnim - 0) / 1) * (-0.96659-(0)));
            yy = -18.25 + (((tickAnim - 0) / 1) * (-14.6969-(-18.25)));
            zz = 0 + (((tickAnim - 0) / 1) * (12.11616-(0)));
        }
        else if (tickAnim >= 1 && tickAnim < 3) {
            xx = -0.96659 + (((tickAnim - 1) / 2) * (2.6241-(-0.96659)));
            yy = -14.6969 + (((tickAnim - 1) / 2) * (10.04355-(-14.6969)));
            zz = 12.11616 + (((tickAnim - 1) / 2) * (-10.96476-(12.11616)));
        }
        else if (tickAnim >= 3 && tickAnim < 4) {
            xx = 2.6241 + (((tickAnim - 3) / 1) * (3.6937-(2.6241)));
            yy = 10.04355 + (((tickAnim - 3) / 1) * (6.4506-(10.04355)));
            zz = -10.96476 + (((tickAnim - 3) / 1) * (-23.01124-(-10.96476)));
        }
        else if (tickAnim >= 4 && tickAnim < 6) {
            xx = 3.6937 + (((tickAnim - 4) / 2) * (5.75441-(3.6937)));
            yy = 6.4506 + (((tickAnim - 4) / 2) * (2.2387-(6.4506)));
            zz = -23.01124 + (((tickAnim - 4) / 2) * (-26.0245-(-23.01124)));
        }
        else if (tickAnim >= 6 && tickAnim < 8) {
            xx = 5.75441 + (((tickAnim - 6) / 2) * (3.19685-(5.75441)));
            yy = 2.2387 + (((tickAnim - 6) / 2) * (-4.70912-(2.2387)));
            zz = -26.0245 + (((tickAnim - 6) / 2) * (-7.75699-(-26.0245)));
        }
        else if (tickAnim >= 8 && tickAnim < 13) {
            xx = 3.19685 + (((tickAnim - 8) / 5) * (0-(3.19685)));
            yy = -4.70912 + (((tickAnim - 8) / 5) * (-18.25-(-4.70912)));
            zz = -7.75699 + (((tickAnim - 8) / 5) * (0-(-7.75699)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(legleft2, legleft2.rotateAngleX + (float) Math.toRadians(xx), legleft2.rotateAngleY + (float) Math.toRadians(yy), legleft2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 1) {
            xx = -10.018 + (((tickAnim - 0) / 1) * (-21.26972-(-10.018)));
            yy = 1.97016 + (((tickAnim - 0) / 1) * (-1.47587-(1.97016)));
            zz = 38.99917 + (((tickAnim - 0) / 1) * (67.70278-(38.99917)));
        }
        else if (tickAnim >= 1 && tickAnim < 3) {
            xx = -21.26972 + (((tickAnim - 1) / 2) * (-16.49034-(-21.26972)));
            yy = -1.47587 + (((tickAnim - 1) / 2) * (0.5375-(-1.47587)));
            zz = 67.70278 + (((tickAnim - 1) / 2) * (79.46846-(67.70278)));
        }
        else if (tickAnim >= 3 && tickAnim < 4) {
            xx = -16.49034 + (((tickAnim - 3) / 1) * (-5.68913-(-16.49034)));
            yy = 0.5375 + (((tickAnim - 3) / 1) * (2.57126-(0.5375)));
            zz = 79.46846 + (((tickAnim - 3) / 1) * (16.49978-(79.46846)));
        }
        else if (tickAnim >= 4 && tickAnim < 6) {
            xx = -5.68913 + (((tickAnim - 4) / 2) * (0-(-5.68913)));
            yy = 2.57126 + (((tickAnim - 4) / 2) * (0-(2.57126)));
            zz = 16.49978 + (((tickAnim - 4) / 2) * (21-(16.49978)));
        }
        else if (tickAnim >= 6 && tickAnim < 7) {
            xx = 0 + (((tickAnim - 6) / 1) * (11.89833-(0)));
            yy = 0 + (((tickAnim - 6) / 1) * (15.3226-(0)));
            zz = 21 + (((tickAnim - 6) / 1) * (7.64637-(21)));
        }
        else if (tickAnim >= 7 && tickAnim < 8) {
            xx = 11.89833 + (((tickAnim - 7) / 1) * (24.90949-(11.89833)));
            yy = 15.3226 + (((tickAnim - 7) / 1) * (27.21868-(15.3226)));
            zz = 7.64637 + (((tickAnim - 7) / 1) * (1.05664-(7.64637)));
        }
        else if (tickAnim >= 8 && tickAnim < 9) {
            xx = 24.90949 + (((tickAnim - 8) / 1) * (9.19668-(24.90949)));
            yy = 27.21868 + (((tickAnim - 8) / 1) * (34.79138-(27.21868)));
            zz = 1.05664 + (((tickAnim - 8) / 1) * (1.52528-(1.05664)));
        }
        else if (tickAnim >= 9 && tickAnim < 13) {
            xx = 9.19668 + (((tickAnim - 9) / 4) * (-10.018-(9.19668)));
            yy = 34.79138 + (((tickAnim - 9) / 4) * (1.97016-(34.79138)));
            zz = 1.52528 + (((tickAnim - 9) / 4) * (38.99917-(1.52528)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(legleft3, legleft3.rotateAngleX + (float) Math.toRadians(xx), legleft3.rotateAngleY + (float) Math.toRadians(yy), legleft3.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 6) {
            xx = 0 + (((tickAnim - 0) / 6) * (-0.64-(0)));
            yy = 0 + (((tickAnim - 0) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 6) * (0-(0)));
        }
        else if (tickAnim >= 6 && tickAnim < 7) {
            xx = -0.64 + (((tickAnim - 6) / 1) * (-0.3-(-0.64)));
            yy = 0 + (((tickAnim - 6) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 6) / 1) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.legleft3.rotationPointX = this.legleft3.rotationPointX + (float)(xx);
        this.legleft3.rotationPointY = this.legleft3.rotationPointY - (float)(yy);
        this.legleft3.rotationPointZ = this.legleft3.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 49.46067 + (((tickAnim - 0) / 3) * (-3.27389-(49.46067)));
            yy = 17.23099 + (((tickAnim - 0) / 3) * (-25.25676-(17.23099)));
            zz = 53.26732 + (((tickAnim - 0) / 3) * (34.85626-(53.26732)));
        }
        else if (tickAnim >= 3 && tickAnim < 6) {
            xx = -3.27389 + (((tickAnim - 3) / 3) * (22.6943-(-3.27389)));
            yy = -25.25676 + (((tickAnim - 3) / 3) * (-76.87648-(-25.25676)));
            zz = 34.85626 + (((tickAnim - 3) / 3) * (-25.69974-(34.85626)));
        }
        else if (tickAnim >= 6 && tickAnim < 13) {
            xx = 22.6943 + (((tickAnim - 6) / 7) * (49.46067-(22.6943)));
            yy = -76.87648 + (((tickAnim - 6) / 7) * (17.23099-(-76.87648)));
            zz = -25.69974 + (((tickAnim - 6) / 7) * (53.26732-(-25.69974)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(armright, armright.rotateAngleX + (float) Math.toRadians(xx), armright.rotateAngleY + (float) Math.toRadians(yy), armright.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 2) {
            xx = 50.07083 + (((tickAnim - 0) / 2) * (51.54402-(50.07083)));
            yy = -46.87904 + (((tickAnim - 0) / 2) * (-34.30474-(-46.87904)));
            zz = -10.04739 + (((tickAnim - 0) / 2) * (9.24297-(-10.04739)));
        }
        else if (tickAnim >= 2 && tickAnim < 3) {
            xx = 51.54402 + (((tickAnim - 2) / 1) * (31.12973-(51.54402)));
            yy = -34.30474 + (((tickAnim - 2) / 1) * (-8.85504-(-34.30474)));
            zz = 9.24297 + (((tickAnim - 2) / 1) * (36.44722-(9.24297)));
        }
        else if (tickAnim >= 3 && tickAnim < 5) {
            xx = 31.12973 + (((tickAnim - 3) / 2) * (-0.72561-(31.12973)));
            yy = -8.85504 + (((tickAnim - 3) / 2) * (29.15399-(-8.85504)));
            zz = 36.44722 + (((tickAnim - 3) / 2) * (11.0356-(36.44722)));
        }
        else if (tickAnim >= 5 && tickAnim < 6) {
            xx = -0.72561 + (((tickAnim - 5) / 1) * (11.78686-(-0.72561)));
            yy = 29.15399 + (((tickAnim - 5) / 1) * (54.62951-(29.15399)));
            zz = 11.0356 + (((tickAnim - 5) / 1) * (22.50163-(11.0356)));
        }
        else if (tickAnim >= 6 && tickAnim < 13) {
            xx = 11.78686 + (((tickAnim - 6) / 7) * (50.07083-(11.78686)));
            yy = 54.62951 + (((tickAnim - 6) / 7) * (-46.87904-(54.62951)));
            zz = 22.50163 + (((tickAnim - 6) / 7) * (-10.04739-(22.50163)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(armright2, armright2.rotateAngleX + (float) Math.toRadians(xx), armright2.rotateAngleY + (float) Math.toRadians(yy), armright2.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 2) {
            xx = 0.175 + (((tickAnim - 0) / 2) * (0.13-(0.175)));
            yy = 0 + (((tickAnim - 0) / 2) * (0.5-(0)));
            zz = 0.575 + (((tickAnim - 0) / 2) * (0.88-(0.575)));
        }
        else if (tickAnim >= 2 && tickAnim < 3) {
            xx = 0.13 + (((tickAnim - 2) / 1) * (0.07-(0.13)));
            yy = 0.5 + (((tickAnim - 2) / 1) * (0.505-(0.5)));
            zz = 0.88 + (((tickAnim - 2) / 1) * (0.49-(0.88)));
        }
        else if (tickAnim >= 3 && tickAnim < 5) {
            xx = 0.07 + (((tickAnim - 3) / 2) * (0.02-(0.07)));
            yy = 0.505 + (((tickAnim - 3) / 2) * (0.445-(0.505)));
            zz = 0.49 + (((tickAnim - 3) / 2) * (0.36-(0.49)));
        }
        else if (tickAnim >= 5 && tickAnim < 6) {
            xx = 0.02 + (((tickAnim - 5) / 1) * (0-(0.02)));
            yy = 0.445 + (((tickAnim - 5) / 1) * (0-(0.445)));
            zz = 0.36 + (((tickAnim - 5) / 1) * (0.3-(0.36)));
        }
        else if (tickAnim >= 6 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 6) / 7) * (0.175-(0)));
            yy = 0 + (((tickAnim - 6) / 7) * (0-(0)));
            zz = 0.3 + (((tickAnim - 6) / 7) * (0.575-(0.3)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.armright2.rotationPointX = this.armright2.rotationPointX + (float)(xx);
        this.armright2.rotationPointY = this.armright2.rotationPointY - (float)(yy);
        this.armright2.rotationPointZ = this.armright2.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 2) {
            xx = -46.1713 + (((tickAnim - 0) / 2) * (-10.56956-(-46.1713)));
            yy = -1.17545 + (((tickAnim - 0) / 2) * (5.03728-(-1.17545)));
            zz = -7.66088 + (((tickAnim - 0) / 2) * (-24.60884-(-7.66088)));
        }
        else if (tickAnim >= 2 && tickAnim < 3) {
            xx = -10.56956 + (((tickAnim - 2) / 1) * (59.97046-(-10.56956)));
            yy = 5.03728 + (((tickAnim - 2) / 1) * (-1.91908-(5.03728)));
            zz = -24.60884 + (((tickAnim - 2) / 1) * (1.57458-(-24.60884)));
        }
        else if (tickAnim >= 3 && tickAnim < 5) {
            xx = 59.97046 + (((tickAnim - 3) / 2) * (9.98818-(59.97046)));
            yy = -1.91908 + (((tickAnim - 3) / 2) * (-0.76763-(-1.91908)));
            zz = 1.57458 + (((tickAnim - 3) / 2) * (0.62983-(1.57458)));
        }
        else if (tickAnim >= 5 && tickAnim < 6) {
            xx = 9.98818 + (((tickAnim - 5) / 1) * (7.5-(9.98818)));
            yy = -0.76763 + (((tickAnim - 5) / 1) * (0-(-0.76763)));
            zz = 0.62983 + (((tickAnim - 5) / 1) * (0-(0.62983)));
        }
        else if (tickAnim >= 6 && tickAnim < 7) {
            xx = 7.5 + (((tickAnim - 6) / 1) * (-9.77049-(7.5)));
            yy = 0 + (((tickAnim - 6) / 1) * (1.26485-(0)));
            zz = 0 + (((tickAnim - 6) / 1) * (-9.3933-(0)));
        }
        else if (tickAnim >= 7 && tickAnim < 8) {
            xx = -9.77049 + (((tickAnim - 7) / 1) * (-27.90902-(-9.77049)));
            yy = 1.26485 + (((tickAnim - 7) / 1) * (0.36586-(1.26485)));
            zz = -9.3933 + (((tickAnim - 7) / 1) * (-12.35509-(-9.3933)));
        }
        else if (tickAnim >= 8 && tickAnim < 8) {
            xx = -27.90902 + (((tickAnim - 8) / 0) * (-43.49104-(-27.90902)));
            yy = 0.36586 + (((tickAnim - 8) / 0) * (-0.8869-(0.36586)));
            zz = -12.35509 + (((tickAnim - 8) / 0) * (-13.62821-(-12.35509)));
        }
        else if (tickAnim >= 8 && tickAnim < 13) {
            xx = -43.49104 + (((tickAnim - 8) / 5) * (-46.1713-(-43.49104)));
            yy = -0.8869 + (((tickAnim - 8) / 5) * (-1.17545-(-0.8869)));
            zz = -13.62821 + (((tickAnim - 8) / 5) * (-7.66088-(-13.62821)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(armright3, armright3.rotateAngleX + (float) Math.toRadians(xx), armright3.rotateAngleY + (float) Math.toRadians(yy), armright3.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 2) {
            xx = 0 + (((tickAnim - 0) / 2) * (0-(0)));
            yy = 0.625 + (((tickAnim - 0) / 2) * (0.2-(0.625)));
            zz = 0.075 + (((tickAnim - 0) / 2) * (0.1-(0.075)));
        }
        else if (tickAnim >= 2 && tickAnim < 6) {
            xx = 0 + (((tickAnim - 2) / 4) * (0-(0)));
            yy = 0.2 + (((tickAnim - 2) / 4) * (0.76-(0.2)));
            zz = 0.1 + (((tickAnim - 2) / 4) * (0.06-(0.1)));
        }
        else if (tickAnim >= 6 && tickAnim < 7) {
            xx = 0 + (((tickAnim - 6) / 1) * (0-(0)));
            yy = 0.76 + (((tickAnim - 6) / 1) * (0.715-(0.76)));
            zz = 0.06 + (((tickAnim - 6) / 1) * (0.05-(0.06)));
        }
        else if (tickAnim >= 7 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 7) / 1) * (0-(0)));
            yy = 0.715 + (((tickAnim - 7) / 1) * (0.45-(0.715)));
            zz = 0.05 + (((tickAnim - 7) / 1) * (0.05-(0.05)));
        }
        else if (tickAnim >= 8 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 8) / 5) * (0-(0)));
            yy = 0.45 + (((tickAnim - 8) / 5) * (0.625-(0.45)));
            zz = 0.05 + (((tickAnim - 8) / 5) * (0.075-(0.05)));
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
            xx = 10.1383 + (((tickAnim - 0) / 7) * (49.46067-(10.1383)));
            yy = 64.39097 + (((tickAnim - 0) / 7) * (-17.231-(64.39097)));
            zz = 17.41226 + (((tickAnim - 0) / 7) * (-53.2673-(17.41226)));
        }
        else if (tickAnim >= 7 && tickAnim < 9) {
            xx = 49.46067 + (((tickAnim - 7) / 2) * (-3.27389-(49.46067)));
            yy = -17.231 + (((tickAnim - 7) / 2) * (25.2568-(-17.231)));
            zz = -53.2673 + (((tickAnim - 7) / 2) * (-34.8563-(-53.2673)));
        }
        else if (tickAnim >= 9 && tickAnim < 13) {
            xx = -3.27389 + (((tickAnim - 9) / 4) * (10.1383-(-3.27389)));
            yy = 25.2568 + (((tickAnim - 9) / 4) * (64.39097-(25.2568)));
            zz = -34.8563 + (((tickAnim - 9) / 4) * (17.41226-(-34.8563)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(armleft, armleft.rotateAngleX + (float) Math.toRadians(xx), armleft.rotateAngleY + (float) Math.toRadians(yy), armleft.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 7) {
            xx = 6.67259 + (((tickAnim - 0) / 7) * (50.07083-(6.67259)));
            yy = -32.6395 + (((tickAnim - 0) / 7) * (46.879-(-32.6395)));
            zz = -16.29586 + (((tickAnim - 0) / 7) * (10.0474-(-16.29586)));
        }
        else if (tickAnim >= 7 && tickAnim < 8) {
            xx = 50.07083 + (((tickAnim - 7) / 1) * (51.54402-(50.07083)));
            yy = 46.879 + (((tickAnim - 7) / 1) * (34.3047-(46.879)));
            zz = 10.0474 + (((tickAnim - 7) / 1) * (-9.243-(10.0474)));
        }
        else if (tickAnim >= 8 && tickAnim < 9) {
            xx = 51.54402 + (((tickAnim - 8) / 1) * (31.12973-(51.54402)));
            yy = 34.3047 + (((tickAnim - 8) / 1) * (8.855-(34.3047)));
            zz = -9.243 + (((tickAnim - 8) / 1) * (-36.4472-(-9.243)));
        }
        else if (tickAnim >= 9 && tickAnim < 12) {
            xx = 31.12973 + (((tickAnim - 9) / 3) * (-0.72561-(31.12973)));
            yy = 8.855 + (((tickAnim - 9) / 3) * (-29.154-(8.855)));
            zz = -36.4472 + (((tickAnim - 9) / 3) * (-11.0356-(-36.4472)));
        }
        else if (tickAnim >= 12 && tickAnim < 13) {
            xx = -0.72561 + (((tickAnim - 12) / 1) * (6.67259-(-0.72561)));
            yy = -29.154 + (((tickAnim - 12) / 1) * (-32.6395-(-29.154)));
            zz = -11.0356 + (((tickAnim - 12) / 1) * (-16.29586-(-11.0356)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(armleft2, armleft2.rotateAngleX + (float) Math.toRadians(xx), armleft2.rotateAngleY + (float) Math.toRadians(yy), armleft2.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 7) {
            xx = 0 + (((tickAnim - 0) / 7) * (-0.175-(0)));
            yy = 0 + (((tickAnim - 0) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 7) * (0.575-(0)));
        }
        else if (tickAnim >= 7 && tickAnim < 8) {
            xx = -0.175 + (((tickAnim - 7) / 1) * (0.13-(-0.175)));
            yy = 0 + (((tickAnim - 7) / 1) * (0.5-(0)));
            zz = 0.575 + (((tickAnim - 7) / 1) * (0.88-(0.575)));
        }
        else if (tickAnim >= 8 && tickAnim < 9) {
            xx = 0.13 + (((tickAnim - 8) / 1) * (0.07-(0.13)));
            yy = 0.5 + (((tickAnim - 8) / 1) * (0.505-(0.5)));
            zz = 0.88 + (((tickAnim - 8) / 1) * (0.49-(0.88)));
        }
        else if (tickAnim >= 9 && tickAnim < 13) {
            xx = 0.07 + (((tickAnim - 9) / 4) * (0-(0.07)));
            yy = 0.505 + (((tickAnim - 9) / 4) * (0-(0.505)));
            zz = 0.49 + (((tickAnim - 9) / 4) * (0-(0.49)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.armleft2.rotationPointX = this.armleft2.rotationPointX + (float)(xx);
        this.armleft2.rotationPointY = this.armleft2.rotationPointY - (float)(yy);
        this.armleft2.rotationPointZ = this.armleft2.rotationPointZ + (float)(zz);



        this.setRotateAngle(hips, hips.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*576/0.5+20))*5), hips.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*576-50))*10), hips.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*576-20))*5));

        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            yy = -0.275+Math.sin((Math.PI/180)*(((double)tickAnim/20)*576/0.5-20))*0.5 + (((tickAnim - 0) / 3) * (0.075+Math.sin((Math.PI/180)*(((double)tickAnim/20)*576/0.5))*0.5-(-0.275+Math.sin((Math.PI/180)*(((double)tickAnim/20)*576/0.5-20))*0.5)));
            zz = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*576/0.5))*0.5 + (((tickAnim - 0) / 3) * (0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*576/0.5))*0.5-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*576/0.5))*0.5)));
        }
        else if (tickAnim >= 3 && tickAnim < 6) {
            xx = 0 + (((tickAnim - 3) / 3) * (0-(0)));
            yy = 0.075+Math.sin((Math.PI/180)*(((double)tickAnim/20)*576/0.5))*0.5 + (((tickAnim - 3) / 3) * (-0.275+Math.sin((Math.PI/180)*(((double)tickAnim/20)*576/0.5))*0.5-(0.075+Math.sin((Math.PI/180)*(((double)tickAnim/20)*576/0.5))*0.5)));
            zz = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*576/0.5))*0.5 + (((tickAnim - 3) / 3) * (0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*576/0.5))*0.5-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*576/0.5))*0.5)));
        }
        else if (tickAnim >= 6 && tickAnim < 9) {
            xx = 0 + (((tickAnim - 6) / 3) * (0-(0)));
            yy = -0.275+Math.sin((Math.PI/180)*(((double)tickAnim/20)*576/0.5))*0.5 + (((tickAnim - 6) / 3) * (0.075+Math.sin((Math.PI/180)*(((double)tickAnim/20)*576/0.5))*0.5-(-0.275+Math.sin((Math.PI/180)*(((double)tickAnim/20)*576/0.5))*0.5)));
            zz = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*576/0.5))*0.5 + (((tickAnim - 6) / 3) * (0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*576/0.5))*0.5-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*576/0.5))*0.5)));
        }
        else if (tickAnim >= 9 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 9) / 4) * (0-(0)));
            yy = 0.075+Math.sin((Math.PI/180)*(((double)tickAnim/20)*576/0.5))*0.5 + (((tickAnim - 9) / 4) * (-0.275+Math.sin((Math.PI/180)*(((double)tickAnim/20)*576/0.5-20))*0.5-(0.075+Math.sin((Math.PI/180)*(((double)tickAnim/20)*576/0.5))*0.5)));
            zz = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*576/0.5))*0.5 + (((tickAnim - 9) / 4) * (0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*576/0.5))*0.5-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*576/0.5))*0.5)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.hips.rotationPointX = this.hips.rotationPointX + (float)(xx);
        this.hips.rotationPointY = this.hips.rotationPointY - (float)(yy);
        this.hips.rotationPointZ = this.hips.rotationPointZ + (float)(zz);



        this.setRotateAngle(tail1, tail1.rotateAngleX + (float) Math.toRadians(-1.25+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*576/0.5+20))*-5), tail1.rotateAngleY + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*576-190))*10), tail1.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(tail2, tail2.rotateAngleX + (float) Math.toRadians(-2.5), tail2.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*576-230))*15), tail2.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*576-100))*10));


        this.setRotateAngle(tail3, tail3.rotateAngleX + (float) Math.toRadians(-1.75), tail3.rotateAngleY + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*576-280))*30), tail3.rotateAngleZ + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*576-250))*-20));


        this.setRotateAngle(body, body.rotateAngleX + (float) Math.toRadians(0), body.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*576-150))*-13), body.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(chest, chest.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*576/0.5))*-8), chest.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*576-200))*13), chest.rotateAngleZ + (float) Math.toRadians(0));



        if (tickAnim >= 0 && tickAnim < 1) {
            xx = 11.5 + (((tickAnim - 0) / 1) * (-8.33423-(11.5)));
            yy = 0 + (((tickAnim - 0) / 1) * (-0.71666-(0)));
            zz = 0 + (((tickAnim - 0) / 1) * (9.4451-(0)));
        }
        else if (tickAnim >= 1 && tickAnim < 2) {
            xx = -8.33423 + (((tickAnim - 1) / 1) * (-32.1231-(-8.33423)));
            yy = -0.71666 + (((tickAnim - 1) / 1) * (-0.48497-(-0.71666)));
            zz = 9.4451 + (((tickAnim - 1) / 1) * (13.47236-(9.4451)));
        }
        else if (tickAnim >= 2 && tickAnim < 3) {
            xx = -32.1231 + (((tickAnim - 2) / 1) * (-40.67732-(-32.1231)));
            yy = -0.48497 + (((tickAnim - 2) / 1) * (-0.18308-(-0.48497)));
            zz = 13.47236 + (((tickAnim - 2) / 1) * (12.41573-(13.47236)));
        }
        else if (tickAnim >= 3 && tickAnim < 3) {
            xx = -40.67732 + (((tickAnim - 3) / 0) * (-45.23153-(-40.67732)));
            yy = -0.18308 + (((tickAnim - 3) / 0) * (0.1188-(-0.18308)));
            zz = 12.41573 + (((tickAnim - 3) / 0) * (11.3591-(12.41573)));
        }
        else if (tickAnim >= 3 && tickAnim < 7) {
            xx = -45.23153 + (((tickAnim - 3) / 4) * (-46.1713-(-45.23153)));
            yy = 0.1188 + (((tickAnim - 3) / 4) * (1.1754-(0.1188)));
            zz = 11.3591 + (((tickAnim - 3) / 4) * (7.6609-(11.3591)));
        }
        else if (tickAnim >= 7 && tickAnim < 8) {
            xx = -46.1713 + (((tickAnim - 7) / 1) * (-10.56956-(-46.1713)));
            yy = 1.1754 + (((tickAnim - 7) / 1) * (-5.0373-(1.1754)));
            zz = 7.6609 + (((tickAnim - 7) / 1) * (24.6088-(7.6609)));
        }
        else if (tickAnim >= 8 && tickAnim < 10) {
            xx = -10.56956 + (((tickAnim - 8) / 2) * (59.97046-(-10.56956)));
            yy = -5.0373 + (((tickAnim - 8) / 2) * (1.9191-(-5.0373)));
            zz = 24.6088 + (((tickAnim - 8) / 2) * (-1.5746-(24.6088)));
        }
        else if (tickAnim >= 10 && tickAnim < 12) {
            xx = 59.97046 + (((tickAnim - 10) / 2) * (17.73818-(59.97046)));
            yy = 1.9191 + (((tickAnim - 10) / 2) * (0.7676-(1.9191)));
            zz = -1.5746 + (((tickAnim - 10) / 2) * (-0.6298-(-1.5746)));
        }
        else if (tickAnim >= 12 && tickAnim < 13) {
            xx = 17.73818 + (((tickAnim - 12) / 1) * (11.5-(17.73818)));
            yy = 0.7676 + (((tickAnim - 12) / 1) * (0-(0.7676)));
            zz = -0.6298 + (((tickAnim - 12) / 1) * (0-(-0.6298)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(armleft3, armleft3.rotateAngleX + (float) Math.toRadians(xx), armleft3.rotateAngleY + (float) Math.toRadians(yy), armleft3.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 1) {
            xx = 0 + (((tickAnim - 0) / 1) * (0-(0)));
            yy = 0.825 + (((tickAnim - 0) / 1) * (0.595-(0.825)));
            zz = 0 + (((tickAnim - 0) / 1) * (0-(0)));
        }
        else if (tickAnim >= 1 && tickAnim < 2) {
            xx = 0 + (((tickAnim - 1) / 1) * (0-(0)));
            yy = 0.595 + (((tickAnim - 1) / 1) * (0.23-(0.595)));
            zz = 0 + (((tickAnim - 1) / 1) * (0-(0)));
        }
        else if (tickAnim >= 2 && tickAnim < 4) {
            xx = 0 + (((tickAnim - 2) / 2) * (0-(0)));
            yy = 0.23 + (((tickAnim - 2) / 2) * (0.88-(0.23)));
            zz = 0 + (((tickAnim - 2) / 2) * (0.1-(0)));
        }
        else if (tickAnim >= 4 && tickAnim < 7) {
            xx = 0 + (((tickAnim - 4) / 3) * (0-(0)));
            yy = 0.88 + (((tickAnim - 4) / 3) * (0-(0.88)));
            zz = 0.1 + (((tickAnim - 4) / 3) * (0-(0.1)));
        }
        else if (tickAnim >= 7 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 7) / 1) * (0-(0)));
            yy = 0 + (((tickAnim - 7) / 1) * (0.2-(0)));
            zz = 0 + (((tickAnim - 7) / 1) * (0.1-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 8) / 5) * (0-(0)));
            yy = 0.2 + (((tickAnim - 8) / 5) * (0.825-(0.2)));
            zz = 0.1 + (((tickAnim - 8) / 5) * (0-(0.1)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.armleft3.rotationPointX = this.armleft3.rotationPointX + (float)(xx);
        this.armleft3.rotationPointY = this.armleft3.rotationPointY - (float)(yy);
        this.armleft3.rotationPointZ = this.armleft3.rotationPointZ + (float)(zz);



        this.setRotateAngle(neck, neck.rotateAngleX + (float) Math.toRadians(0), neck.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*576-200))*13), neck.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(head, head.rotateAngleX + (float) Math.toRadians(0), head.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*576-250))*-13), head.rotateAngleZ + (float) Math.toRadians(0));


    }
    public void animAttack(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime, double animTick) {
        EntityPrehistoricFloraEldeceeon entity = (EntityPrehistoricFloraEldeceeon) entitylivingbaseIn;
        int animCycle = 10;
        double tickAnim = animTick + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;
         if (tickAnim >= 0 && tickAnim < 3) {
            xx = 0 + (((tickAnim - 0) / 3) * (-3.5-(0)));
            yy = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 3) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 10) {
            xx = -3.5 + (((tickAnim - 3) / 7) * (0-(-3.5)));
            yy = 0 + (((tickAnim - 3) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 3) / 7) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck, neck.rotateAngleX + (float) Math.toRadians(xx), neck.rotateAngleY + (float) Math.toRadians(yy), neck.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 0 + (((tickAnim - 0) / 3) * (-9.25-(0)));
            yy = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 3) * (-4-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 10) {
            xx = -9.25 + (((tickAnim - 3) / 7) * (0-(-9.25)));
            yy = 0 + (((tickAnim - 3) / 7) * (0-(0)));
            zz = -4 + (((tickAnim - 3) / 7) * (0-(-4)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(head, head.rotateAngleX + (float) Math.toRadians(xx), head.rotateAngleY + (float) Math.toRadians(yy), head.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 0 + (((tickAnim - 0) / 3) * (26.5-(0)));
            yy = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 3) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 5) {
            xx = 26.5 + (((tickAnim - 3) / 2) * (0-(26.5)));
            yy = 0 + (((tickAnim - 3) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 3) / 2) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(jaw, jaw.rotateAngleX + (float) Math.toRadians(xx), jaw.rotateAngleY + (float) Math.toRadians(yy), jaw.rotateAngleZ + (float) Math.toRadians(zz));


    }
    public void animIdle(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime, double animTick) {
        EntityPrehistoricFloraEldeceeon entity = (EntityPrehistoricFloraEldeceeon) entitylivingbaseIn;
        int animCycle = 110;
        double tickAnim = animTick + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;
         if (tickAnim >= 0 && tickAnim < 28) {
            xx = 0 + (((tickAnim - 0) / 28) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 28) * (-13.25-(0)));
            zz = 0 + (((tickAnim - 0) / 28) * (0-(0)));
        }
        else if (tickAnim >= 28 && tickAnim < 40) {
            xx = 0 + (((tickAnim - 28) / 12) * (0-(0)));
            yy = -13.25 + (((tickAnim - 28) / 12) * (-15.25-(-13.25)));
            zz = 0 + (((tickAnim - 28) / 12) * (0-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 60) {
            xx = 0 + (((tickAnim - 40) / 20) * (0-(0)));
            yy = -15.25 + (((tickAnim - 40) / 20) * (-6.25-(-15.25)));
            zz = 0 + (((tickAnim - 40) / 20) * (0-(0)));
        }
        else if (tickAnim >= 60 && tickAnim < 110) {
            xx = 0 + (((tickAnim - 60) / 50) * (0-(0)));
            yy = -6.25 + (((tickAnim - 60) / 50) * (0-(-6.25)));
            zz = 0 + (((tickAnim - 60) / 50) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tail1, tail1.rotateAngleX + (float) Math.toRadians(xx), tail1.rotateAngleY + (float) Math.toRadians(yy), tail1.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 28) {
            xx = 0 + (((tickAnim - 0) / 28) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 28) * (-13-(0)));
            zz = 0 + (((tickAnim - 0) / 28) * (0-(0)));
        }
        else if (tickAnim >= 28 && tickAnim < 40) {
            xx = 0 + (((tickAnim - 28) / 12) * (0-(0)));
            yy = -13 + (((tickAnim - 28) / 12) * (-16.25-(-13)));
            zz = 0 + (((tickAnim - 28) / 12) * (0-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 60) {
            xx = 0 + (((tickAnim - 40) / 20) * (0-(0)));
            yy = -16.25 + (((tickAnim - 40) / 20) * (-18-(-16.25)));
            zz = 0 + (((tickAnim - 40) / 20) * (0-(0)));
        }
        else if (tickAnim >= 60 && tickAnim < 110) {
            xx = 0 + (((tickAnim - 60) / 50) * (0-(0)));
            yy = -18 + (((tickAnim - 60) / 50) * (0-(-18)));
            zz = 0 + (((tickAnim - 60) / 50) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tail2, tail2.rotateAngleX + (float) Math.toRadians(xx), tail2.rotateAngleY + (float) Math.toRadians(yy), tail2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 0) / 10) * (-2.10428-(0)));
            yy = 0 + (((tickAnim - 0) / 10) * (19.71446-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (4.29595-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 18) {
            xx = -2.10428 + (((tickAnim - 10) / 8) * (-4.4288-(-2.10428)));
            yy = 19.71446 + (((tickAnim - 10) / 8) * (12.89604-(19.71446)));
            zz = 4.29595 + (((tickAnim - 10) / 8) * (3.08543-(4.29595)));
        }
        else if (tickAnim >= 18 && tickAnim < 28) {
            xx = -4.4288 + (((tickAnim - 18) / 10) * (-6.39783-(-4.4288)));
            yy = 12.89604 + (((tickAnim - 18) / 10) * (8.16637-(12.89604)));
            zz = 3.08543 + (((tickAnim - 18) / 10) * (1.42533-(3.08543)));
        }
        else if (tickAnim >= 28 && tickAnim < 40) {
            xx = -6.39783 + (((tickAnim - 28) / 12) * (-6.42452-(-6.39783)));
            yy = 8.16637 + (((tickAnim - 28) / 12) * (6.17765-(8.16637)));
            zz = 1.42533 + (((tickAnim - 28) / 12) * (1.21152-(1.42533)));
        }
        else if (tickAnim >= 40 && tickAnim < 50) {
            xx = -6.42452 + (((tickAnim - 40) / 10) * (-6.31376-(-6.42452)));
            yy = 6.17765 + (((tickAnim - 40) / 10) * (-6.9963-(6.17765)));
            zz = 1.21152 + (((tickAnim - 40) / 10) * (-0.21607-(1.21152)));
        }
        else if (tickAnim >= 50 && tickAnim < 60) {
            xx = -6.31376 + (((tickAnim - 50) / 10) * (-6.13204-(-6.31376)));
            yy = -6.9963 + (((tickAnim - 50) / 10) * (-18.4311-(-6.9963)));
            zz = -0.21607 + (((tickAnim - 50) / 10) * (-1.46551-(-0.21607)));
        }
        else if (tickAnim >= 60 && tickAnim < 110) {
            xx = -6.13204 + (((tickAnim - 60) / 50) * (0-(-6.13204)));
            yy = -18.4311 + (((tickAnim - 60) / 50) * (0-(-18.4311)));
            zz = -1.46551 + (((tickAnim - 60) / 50) * (0-(-1.46551)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tail3, tail3.rotateAngleX + (float) Math.toRadians(xx), tail3.rotateAngleY + (float) Math.toRadians(yy), tail3.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 12) {
            xx = 0 + (((tickAnim - 0) / 12) * (-6.75-(0)));
            yy = 0 + (((tickAnim - 0) / 12) * (-4.5-(0)));
            zz = 0 + (((tickAnim - 0) / 12) * (0-(0)));
        }
        else if (tickAnim >= 12 && tickAnim < 30) {
            xx = -6.75 + (((tickAnim - 12) / 18) * (-6.75-(-6.75)));
            yy = -4.5 + (((tickAnim - 12) / 18) * (-4.5-(-4.5)));
            zz = 0 + (((tickAnim - 12) / 18) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 45) {
            xx = -6.75 + (((tickAnim - 30) / 15) * (6.23399-(-6.75)));
            yy = -4.5 + (((tickAnim - 30) / 15) * (23.10444-(-4.5)));
            zz = 0 + (((tickAnim - 30) / 15) * (2.90712-(0)));
        }
        else if (tickAnim >= 45 && tickAnim < 55) {
            xx = 6.23399 + (((tickAnim - 45) / 10) * (6.23399-(6.23399)));
            yy = 23.10444 + (((tickAnim - 45) / 10) * (23.10444-(23.10444)));
            zz = 2.90712 + (((tickAnim - 45) / 10) * (2.90712-(2.90712)));
        }
        else if (tickAnim >= 55 && tickAnim < 65) {
            xx = 6.23399 + (((tickAnim - 55) / 10) * (3.53879-(6.23399)));
            yy = 23.10444 + (((tickAnim - 55) / 10) * (25.10068-(23.10444)));
            zz = 2.90712 + (((tickAnim - 55) / 10) * (3.0413-(2.90712)));
        }
        else if (tickAnim >= 65 && tickAnim < 92) {
            xx = 3.53879 + (((tickAnim - 65) / 27) * (3.53879-(3.53879)));
            yy = 25.10068 + (((tickAnim - 65) / 27) * (25.10068-(25.10068)));
            zz = 3.0413 + (((tickAnim - 65) / 27) * (3.0413-(3.0413)));
        }
        else if (tickAnim >= 92 && tickAnim < 110) {
            xx = 3.53879 + (((tickAnim - 92) / 18) * (0-(3.53879)));
            yy = 25.10068 + (((tickAnim - 92) / 18) * (0-(25.10068)));
            zz = 3.0413 + (((tickAnim - 92) / 18) * (0-(3.0413)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck, neck.rotateAngleX + (float) Math.toRadians(xx), neck.rotateAngleY + (float) Math.toRadians(yy), neck.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 30) {
            xx = 0 + (((tickAnim - 0) / 30) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 30) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 30) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 45) {
            xx = 0 + (((tickAnim - 30) / 15) * (0-(0)));
            yy = 0 + (((tickAnim - 30) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 30) / 15) * (0.55-(0)));
        }
        else if (tickAnim >= 45 && tickAnim < 65) {
            xx = 0 + (((tickAnim - 45) / 20) * (0-(0)));
            yy = 0 + (((tickAnim - 45) / 20) * (0-(0)));
            zz = 0.55 + (((tickAnim - 45) / 20) * (0.55-(0.55)));
        }
        else if (tickAnim >= 65 && tickAnim < 92) {
            xx = 0 + (((tickAnim - 65) / 27) * (0-(0)));
            yy = 0 + (((tickAnim - 65) / 27) * (0-(0)));
            zz = 0.55 + (((tickAnim - 65) / 27) * (0.55-(0.55)));
        }
        else if (tickAnim >= 92 && tickAnim < 110) {
            xx = 0 + (((tickAnim - 92) / 18) * (0-(0)));
            yy = 0 + (((tickAnim - 92) / 18) * (0-(0)));
            zz = 0.55 + (((tickAnim - 92) / 18) * (0-(0.55)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.neck.rotationPointX = this.neck.rotationPointX + (float)(xx);
        this.neck.rotationPointY = this.neck.rotationPointY - (float)(yy);
        this.neck.rotationPointZ = this.neck.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 12) {
            xx = 0 + (((tickAnim - 0) / 12) * (-7.25-(0)));
            yy = 0 + (((tickAnim - 0) / 12) * (-5.5-(0)));
            zz = 0 + (((tickAnim - 0) / 12) * (0-(0)));
        }
        else if (tickAnim >= 12 && tickAnim < 30) {
            xx = -7.25 + (((tickAnim - 12) / 18) * (-7.25-(-7.25)));
            yy = -5.5 + (((tickAnim - 12) / 18) * (-5.5-(-5.5)));
            zz = 0 + (((tickAnim - 12) / 18) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 45) {
            xx = -7.25 + (((tickAnim - 30) / 15) * (-0.53583-(-7.25)));
            yy = -5.5 + (((tickAnim - 30) / 15) * (7.89252-(-5.5)));
            zz = 0 + (((tickAnim - 30) / 15) * (-1.70436-(0)));
        }
        else if (tickAnim >= 45 && tickAnim < 55) {
            xx = -0.53583 + (((tickAnim - 45) / 10) * (-0.53583-(-0.53583)));
            yy = 7.89252 + (((tickAnim - 45) / 10) * (7.89252-(7.89252)));
            zz = -1.70436 + (((tickAnim - 45) / 10) * (-1.70436-(-1.70436)));
        }
        else if (tickAnim >= 55 && tickAnim < 58) {
            xx = -0.53583 + (((tickAnim - 55) / 3) * (-2.03583-(-0.53583)));
            yy = 7.89252 + (((tickAnim - 55) / 3) * (7.89252-(7.89252)));
            zz = -1.70436 + (((tickAnim - 55) / 3) * (-1.70436-(-1.70436)));
        }
        else if (tickAnim >= 58 && tickAnim < 60) {
            xx = -2.03583 + (((tickAnim - 58) / 2) * (-0.53583-(-2.03583)));
            yy = 7.89252 + (((tickAnim - 58) / 2) * (7.89252-(7.89252)));
            zz = -1.70436 + (((tickAnim - 58) / 2) * (-1.70436-(-1.70436)));
        }
        else if (tickAnim >= 60 && tickAnim < 63) {
            xx = -0.53583 + (((tickAnim - 60) / 3) * (-2.03583-(-0.53583)));
            yy = 7.89252 + (((tickAnim - 60) / 3) * (7.89252-(7.89252)));
            zz = -1.70436 + (((tickAnim - 60) / 3) * (-1.70436-(-1.70436)));
        }
        else if (tickAnim >= 63 && tickAnim < 65) {
            xx = -2.03583 + (((tickAnim - 63) / 2) * (-0.53583-(-2.03583)));
            yy = 7.89252 + (((tickAnim - 63) / 2) * (7.89252-(7.89252)));
            zz = -1.70436 + (((tickAnim - 63) / 2) * (-1.70436-(-1.70436)));
        }
        else if (tickAnim >= 65 && tickAnim < 92) {
            xx = -0.53583 + (((tickAnim - 65) / 27) * (-0.53583-(-0.53583)));
            yy = 7.89252 + (((tickAnim - 65) / 27) * (7.89252-(7.89252)));
            zz = -1.70436 + (((tickAnim - 65) / 27) * (-1.70436-(-1.70436)));
        }
        else if (tickAnim >= 92 && tickAnim < 102) {
            xx = -0.53583 + (((tickAnim - 92) / 10) * (-5.79769-(-0.53583)));
            yy = 7.89252 + (((tickAnim - 92) / 10) * (-8.60088-(7.89252)));
            zz = -1.70436 + (((tickAnim - 92) / 10) * (0.45584-(-1.70436)));
        }
        else if (tickAnim >= 102 && tickAnim < 110) {
            xx = -5.79769 + (((tickAnim - 102) / 8) * (0-(-5.79769)));
            yy = -8.60088 + (((tickAnim - 102) / 8) * (0-(-8.60088)));
            zz = 0.45584 + (((tickAnim - 102) / 8) * (0-(0.45584)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(head, head.rotateAngleX + (float) Math.toRadians(xx), head.rotateAngleY + (float) Math.toRadians(yy), head.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 0) / 8) * (9.25-(0)));
            yy = 0 + (((tickAnim - 0) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 8) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 18) {
            xx = 9.25 + (((tickAnim - 8) / 10) * (0-(9.25)));
            yy = 0 + (((tickAnim - 8) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 10) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 92) {
            xx = 0 + (((tickAnim - 18) / 74) * (0-(0)));
            yy = 0 + (((tickAnim - 18) / 74) * (0-(0)));
            zz = 0 + (((tickAnim - 18) / 74) * (0-(0)));
        }
        else if (tickAnim >= 92 && tickAnim < 102) {
            xx = 0 + (((tickAnim - 92) / 10) * (22.5-(0)));
            yy = 0 + (((tickAnim - 92) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 92) / 10) * (0-(0)));
        }
        else if (tickAnim >= 102 && tickAnim < 110) {
            xx = 22.5 + (((tickAnim - 102) / 8) * (0-(22.5)));
            yy = 0 + (((tickAnim - 102) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 102) / 8) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(jaw, jaw.rotateAngleX + (float) Math.toRadians(xx), jaw.rotateAngleY + (float) Math.toRadians(yy), jaw.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 43 && tickAnim < 49) {
            xx = 0 + (((tickAnim - 43) / 6) * (0-(0)));
            yy = 0 + (((tickAnim - 43) / 6) * (0.5-(0)));
            zz = 0 + (((tickAnim - 43) / 6) * (0-(0)));
        }
        else if (tickAnim >= 49 && tickAnim < 53) {
            xx = 0 + (((tickAnim - 49) / 4) * (0-(0)));
            yy = 0.5 + (((tickAnim - 49) / 4) * (0-(0.5)));
            zz = 0 + (((tickAnim - 49) / 4) * (0-(0)));
        }
        else if (tickAnim >= 53 && tickAnim < 92) {
            xx = 0 + (((tickAnim - 53) / 39) * (0-(0)));
            yy = 0 + (((tickAnim - 53) / 39) * (0-(0)));
            zz = 0 + (((tickAnim - 53) / 39) * (0-(0)));
        }
        else if (tickAnim >= 92 && tickAnim < 102) {
            xx = 0 + (((tickAnim - 92) / 10) * (0-(0)));
            yy = 0 + (((tickAnim - 92) / 10) * (0.45-(0)));
            zz = 0 + (((tickAnim - 92) / 10) * (0-(0)));
        }
        else if (tickAnim >= 102 && tickAnim < 110) {
            xx = 0 + (((tickAnim - 102) / 8) * (0-(0)));
            yy = 0.45 + (((tickAnim - 102) / 8) * (0-(0.45)));
            zz = 0 + (((tickAnim - 102) / 8) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.eyeright.rotationPointX = this.eyeright.rotationPointX + (float)(xx);
        this.eyeright.rotationPointY = this.eyeright.rotationPointY - (float)(yy);
        this.eyeright.rotationPointZ = this.eyeright.rotationPointZ + (float)(zz);


        if (tickAnim >= 43 && tickAnim < 49) {
            xx = 1 + (((tickAnim - 43) / 6) * (1-(1)));
            yy = 1 + (((tickAnim - 43) / 6) * (0-(1)));
            zz = 1 + (((tickAnim - 43) / 6) * (1-(1)));
        }
        else if (tickAnim >= 49 && tickAnim < 53) {
            xx = 1 + (((tickAnim - 49) / 4) * (1-(1)));
            yy = 0 + (((tickAnim - 49) / 4) * (1-(0)));
            zz = 1 + (((tickAnim - 49) / 4) * (1-(1)));
        }
        else if (tickAnim >= 53 && tickAnim < 92) {
            xx = 1 + (((tickAnim - 53) / 39) * (1-(1)));
            yy = 1 + (((tickAnim - 53) / 39) * (1-(1)));
            zz = 1 + (((tickAnim - 53) / 39) * (1-(1)));
        }
        else if (tickAnim >= 92 && tickAnim < 102) {
            xx = 1 + (((tickAnim - 92) / 10) * (1-(1)));
            yy = 1 + (((tickAnim - 92) / 10) * (0.02-(1)));
            zz = 1 + (((tickAnim - 92) / 10) * (1-(1)));
        }
        else if (tickAnim >= 102 && tickAnim < 110) {
            xx = 1 + (((tickAnim - 102) / 8) * (1-(1)));
            yy = 0.02 + (((tickAnim - 102) / 8) * (1-(0.02)));
            zz = 1 + (((tickAnim - 102) / 8) * (1-(1)));
        }
        else {
            xx = 1;
            yy = 1;
            zz = 1;
        }
        this.eyeright.setScale((float)xx, (float)yy, (float)zz);




        if (tickAnim >= 0 && tickAnim < 43) {
            xx = 0 + (((tickAnim - 0) / 43) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 43) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 43) * (0-(0)));
        }
        else if (tickAnim >= 43 && tickAnim < 48) {
            xx = 0 + (((tickAnim - 43) / 5) * (0-(0)));
            yy = 0 + (((tickAnim - 43) / 5) * (0.5-(0)));
            zz = 0 + (((tickAnim - 43) / 5) * (0-(0)));
        }
        else if (tickAnim >= 48 && tickAnim < 53) {
            xx = 0 + (((tickAnim - 48) / 5) * (0-(0)));
            yy = 0.5 + (((tickAnim - 48) / 5) * (0-(0.5)));
            zz = 0 + (((tickAnim - 48) / 5) * (0-(0)));
        }
        else if (tickAnim >= 53 && tickAnim < 92) {
            xx = 0 + (((tickAnim - 53) / 39) * (0-(0)));
            yy = 0 + (((tickAnim - 53) / 39) * (0-(0)));
            zz = 0 + (((tickAnim - 53) / 39) * (0-(0)));
        }
        else if (tickAnim >= 92 && tickAnim < 102) {
            xx = 0 + (((tickAnim - 92) / 10) * (0-(0)));
            yy = 0 + (((tickAnim - 92) / 10) * (0.45-(0)));
            zz = 0 + (((tickAnim - 92) / 10) * (0-(0)));
        }
        else if (tickAnim >= 102 && tickAnim < 110) {
            xx = 0 + (((tickAnim - 102) / 8) * (0-(0)));
            yy = 0.45 + (((tickAnim - 102) / 8) * (0-(0.45)));
            zz = 0 + (((tickAnim - 102) / 8) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.eyeleft.rotationPointX = this.eyeleft.rotationPointX + (float)(xx);
        this.eyeleft.rotationPointY = this.eyeleft.rotationPointY - (float)(yy);
        this.eyeleft.rotationPointZ = this.eyeleft.rotationPointZ + (float)(zz);


        if (tickAnim >= 43 && tickAnim < 48) {
            xx = 1 + (((tickAnim - 43) / 5) * (1-(1)));
            yy = 1 + (((tickAnim - 43) / 5) * (0-(1)));
            zz = 1 + (((tickAnim - 43) / 5) * (1-(1)));
        }
        else if (tickAnim >= 48 && tickAnim < 53) {
            xx = 1 + (((tickAnim - 48) / 5) * (1-(1)));
            yy = 0 + (((tickAnim - 48) / 5) * (1-(0)));
            zz = 1 + (((tickAnim - 48) / 5) * (1-(1)));
        }
        else if (tickAnim >= 53 && tickAnim < 92) {
            xx = 1 + (((tickAnim - 53) / 39) * (1-(1)));
            yy = 1 + (((tickAnim - 53) / 39) * (1-(1)));
            zz = 1 + (((tickAnim - 53) / 39) * (1-(1)));
        }
        else if (tickAnim >= 92 && tickAnim < 102) {
            xx = 1 + (((tickAnim - 92) / 10) * (1-(1)));
            yy = 1 + (((tickAnim - 92) / 10) * (0.02-(1)));
            zz = 1 + (((tickAnim - 92) / 10) * (1-(1)));
        }
        else if (tickAnim >= 102 && tickAnim < 110) {
            xx = 1 + (((tickAnim - 102) / 8) * (1-(1)));
            yy = 0.02 + (((tickAnim - 102) / 8) * (1-(0.02)));
            zz = 1 + (((tickAnim - 102) / 8) * (1-(1)));
        }
        else {
            xx = 1;
            yy = 1;
            zz = 1;
        }
        this.eyeleft.setScale((float)xx, (float)yy, (float)zz);


    }


    public void animate(IAnimatedEntity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        EntityPrehistoricFloraEldeceeon e = (EntityPrehistoricFloraEldeceeon) entity;
        animator.update(entity);
        //this.resetToDefaultPose();
        setRotationAngles(f, f1, f2, f3, f4, f5, (Entity) entity);

        animator.setAnimation(e.ROAR_ANIMATION);
        animator.startKeyframe(10);
        animator.move(this.head, 0,0,-0.2F);
        animator.rotate(this.head, (float) Math.toRadians(-35), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(this.jaw, (float) Math.toRadians(20), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.endKeyframe();
        animator.setStaticKeyframe(10);
        animator.resetKeyframe(10);
    }
}
