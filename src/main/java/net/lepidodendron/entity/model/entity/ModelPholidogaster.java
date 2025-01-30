package net.lepidodendron.entity.model.entity;

import net.ilexiconn.llibrary.client.model.ModelAnimator;
import net.ilexiconn.llibrary.client.model.tools.AdvancedModelRenderer;
import net.ilexiconn.llibrary.server.animation.IAnimatedEntity;
import net.lepidodendron.entity.EntityPrehistoricFloraPholidogaster;
import net.lepidodendron.entity.model.ModelBasePalaeopedia;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;

public class ModelPholidogaster extends ModelBasePalaeopedia {

    private final AdvancedModelRenderer hip;
    private final AdvancedModelRenderer cube_r1;
    private final AdvancedModelRenderer tail;
    private final AdvancedModelRenderer cube_r2;
    private final AdvancedModelRenderer tail2;
    private final AdvancedModelRenderer tail3;
    private final AdvancedModelRenderer legright;
    private final AdvancedModelRenderer legright2;
    private final AdvancedModelRenderer legright3;
    private final AdvancedModelRenderer legleft;
    private final AdvancedModelRenderer legleft2;
    private final AdvancedModelRenderer legleft3;
    private final AdvancedModelRenderer body;
    private final AdvancedModelRenderer cube_r3;
    private final AdvancedModelRenderer cube_r4;
    private final AdvancedModelRenderer body2;
    private final AdvancedModelRenderer cube_r5;
    private final AdvancedModelRenderer cube_r6;
    private final AdvancedModelRenderer cube_r7;
    private final AdvancedModelRenderer chest;
    private final AdvancedModelRenderer cube_r8;
    private final AdvancedModelRenderer cube_r9;
    private final AdvancedModelRenderer cube_r10;
    private final AdvancedModelRenderer armright;
    private final AdvancedModelRenderer armright2;
    private final AdvancedModelRenderer handright;
    private final AdvancedModelRenderer armleft;
    private final AdvancedModelRenderer armleft2;
    private final AdvancedModelRenderer handleft;
    private final AdvancedModelRenderer head;
    private final AdvancedModelRenderer cube_r11;
    private final AdvancedModelRenderer cube_r12;
    private final AdvancedModelRenderer cube_r13;
    private final AdvancedModelRenderer cube_r14;
    private final AdvancedModelRenderer cube_r15;
    private final AdvancedModelRenderer cube_r16;
    private final AdvancedModelRenderer cube_r17;
    private final AdvancedModelRenderer cube_r18;
    private final AdvancedModelRenderer cube_r19;
    private final AdvancedModelRenderer eyeright;
    private final AdvancedModelRenderer cube_r20;
    private final AdvancedModelRenderer eyeleft;
    private final AdvancedModelRenderer cube_r21;
    private final AdvancedModelRenderer jaw;
    private final AdvancedModelRenderer cube_r22;
    private final AdvancedModelRenderer cube_r23;
    private final AdvancedModelRenderer cube_r24;
    private final AdvancedModelRenderer cube_r25;
    private final AdvancedModelRenderer cube_r26;
    private final AdvancedModelRenderer cube_r27;
    private final AdvancedModelRenderer cube_r28;
    private final AdvancedModelRenderer cube_r29;
    private final AdvancedModelRenderer cube_r30;
    private final AdvancedModelRenderer cube_r31;
    private final AdvancedModelRenderer cube_r32;
    private final AdvancedModelRenderer cube_r33;
    private final AdvancedModelRenderer cube_r34;

    private ModelAnimator animator;

    public ModelPholidogaster() {
        this.textureWidth = 64;
        this.textureHeight = 64;

        this.hip = new AdvancedModelRenderer(this);
        this.hip.setRotationPoint(0.0F, 21.4F, 13.25F);
        this.hip.cubeList.add(new ModelBox(hip, 22, 0, -1.5F, 0.35F, -6.0F, 3, 2, 6, 0.0F, false));

        this.cube_r1 = new AdvancedModelRenderer(this);
        this.cube_r1.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.hip.addChild(cube_r1);
        this.setRotateAngle(cube_r1, -0.1745F, 0.0F, 0.0F);
        this.cube_r1.cubeList.add(new ModelBox(cube_r1, 22, 8, -1.0F, 0.0F, -6.0F, 2, 2, 6, 0.0F, false));

        this.tail = new AdvancedModelRenderer(this);
        this.tail.setRotationPoint(0.0F, 1.15F, 0.0F);
        this.hip.addChild(tail);
        this.setRotateAngle(tail, -0.0873F, 0.0F, 0.0F);
        this.tail.cubeList.add(new ModelBox(tail, 0, 34, -1.0F, -1.0F, -1.0F, 2, 2, 5, -0.01F, false));

        this.cube_r2 = new AdvancedModelRenderer(this);
        this.cube_r2.setRotationPoint(0.0F, -0.35F, 0.0F);
        this.tail.addChild(cube_r2);
        this.setRotateAngle(cube_r2, 0.0873F, 0.0F, 0.0F);
        this.cube_r2.cubeList.add(new ModelBox(cube_r2, 28, 42, 0.0F, -1.0F, -1.0F, 0, 1, 5, 0.0F, false));

        this.tail2 = new AdvancedModelRenderer(this);
        this.tail2.setRotationPoint(0.0F, 0.0F, 4.0F);
        this.tail.addChild(tail2);
        this.setRotateAngle(tail2, 0.0873F, 0.0F, 0.0F);
        this.tail2.cubeList.add(new ModelBox(tail2, 28, 36, -0.5F, -0.25F, -0.5F, 1, 1, 5, 0.01F, false));
        this.tail2.cubeList.add(new ModelBox(tail2, 38, 8, -0.5F, -0.85F, -0.5F, 1, 1, 5, 0.0F, false));
        this.tail2.cubeList.add(new ModelBox(tail2, 40, 0, -0.01F, -1.85F, -0.5F, 0, 3, 5, 0.0F, false));

        this.tail3 = new AdvancedModelRenderer(this);
        this.tail3.setRotationPoint(0.0F, 0.0F, 4.5F);
        this.tail2.addChild(tail3);
        this.tail3.cubeList.add(new ModelBox(tail3, 20, 19, 0.0F, -1.85F, 0.0F, 0, 3, 8, 0.0F, false));
        this.tail3.cubeList.add(new ModelBox(tail3, 14, 36, -0.5F, -0.5F, -0.15F, 1, 1, 6, -0.01F, false));

        this.legright = new AdvancedModelRenderer(this);
        this.legright.setRotationPoint(-1.2F, 1.875F, -2.2F);
        this.hip.addChild(legright);
        this.setRotateAngle(legright, 0.1745F, -0.6981F, -0.3491F);
        this.legright.cubeList.add(new ModelBox(legright, 38, 14, -1.5F, -0.5F, -0.5F, 2, 1, 1, 0.0F, false));

        this.legright2 = new AdvancedModelRenderer(this);
        this.legright2.setRotationPoint(-1.6F, 0.0F, 0.25F);
        this.legright.addChild(legright2);
        this.setRotateAngle(legright2, 0.0F, 0.829F, 0.192F);
        this.legright2.cubeList.add(new ModelBox(legright2, 48, 45, -0.475F, -0.5F, -0.5F, 1, 1, 1, -0.01F, false));
        this.legright2.cubeList.add(new ModelBox(legright2, 48, 47, -1.125F, -0.5F, -0.5F, 1, 1, 1, -0.02F, false));

        this.legright3 = new AdvancedModelRenderer(this);
        this.legright3.setRotationPoint(-1.125F, 0.15F, 0.0F);
        this.legright2.addChild(legright3);
        this.setRotateAngle(legright3, 0.0F, -0.48F, 0.0873F);
        this.legright3.cubeList.add(new ModelBox(legright3, 30, 18, -1.0F, 0.0F, -0.5F, 1, 0, 1, 0.0F, false));

        this.legleft = new AdvancedModelRenderer(this);
        this.legleft.setRotationPoint(1.2F, 1.875F, -2.2F);
        this.hip.addChild(legleft);
        this.setRotateAngle(legleft, 0.1745F, 0.6981F, 0.3491F);
        this.legleft.cubeList.add(new ModelBox(legleft, 38, 14, -0.5F, -0.5F, -0.5F, 2, 1, 1, 0.0F, true));

        this.legleft2 = new AdvancedModelRenderer(this);
        this.legleft2.setRotationPoint(1.6F, 0.0F, 0.25F);
        this.legleft.addChild(legleft2);
        this.setRotateAngle(legleft2, 0.0F, -0.829F, -0.192F);
        this.legleft2.cubeList.add(new ModelBox(legleft2, 48, 45, -0.525F, -0.5F, -0.5F, 1, 1, 1, -0.01F, true));
        this.legleft2.cubeList.add(new ModelBox(legleft2, 48, 47, 0.125F, -0.5F, -0.5F, 1, 1, 1, -0.02F, true));

        this.legleft3 = new AdvancedModelRenderer(this);
        this.legleft3.setRotationPoint(1.125F, 0.15F, 0.0F);
        this.legleft2.addChild(legleft3);
        this.setRotateAngle(legleft3, 0.0F, 0.48F, -0.0873F);
        this.legleft3.cubeList.add(new ModelBox(legleft3, 30, 18, 0.0F, 0.0F, -0.5F, 1, 0, 1, 0.0F, true));

        this.body = new AdvancedModelRenderer(this);
        this.body.setRotationPoint(0.0F, 1.0F, -5.4F);
        this.hip.addChild(body);


        this.cube_r3 = new AdvancedModelRenderer(this);
        this.cube_r3.setRotationPoint(0.5F, -1.325F, -5.85F);
        this.body.addChild(cube_r3);
        this.setRotateAngle(cube_r3, -0.0436F, 0.0F, 0.0F);
        this.cube_r3.cubeList.add(new ModelBox(cube_r3, 0, 19, -2.0F, -1.0F, -1.0F, 3, 1, 7, 0.0F, false));

        this.cube_r4 = new AdvancedModelRenderer(this);
        this.cube_r4.setRotationPoint(1.0F, 1.5F, -5.85F);
        this.body.addChild(cube_r4);
        this.setRotateAngle(cube_r4, 0.0087F, 0.0F, 0.0F);
        this.cube_r4.cubeList.add(new ModelBox(cube_r4, 0, 0, -3.0F, -3.0F, -1.0F, 4, 3, 7, 0.0F, false));

        this.body2 = new AdvancedModelRenderer(this);
        this.body2.setRotationPoint(0.0F, 0.1F, -6.2F);
        this.body.addChild(body2);


        this.cube_r5 = new AdvancedModelRenderer(this);
        this.cube_r5.setRotationPoint(1.0F, 1.075F, -7.85F);
        this.body2.addChild(cube_r5);
        this.setRotateAngle(cube_r5, 0.0262F, 0.0F, 0.0F);
        this.cube_r5.cubeList.add(new ModelBox(cube_r5, 36, 25, -3.0F, -3.25F, 2.0F, 4, 1, 3, 0.0F, false));

        this.cube_r6 = new AdvancedModelRenderer(this);
        this.cube_r6.setRotationPoint(1.0F, 1.075F, -4.8F);
        this.body2.addChild(cube_r6);
        this.setRotateAngle(cube_r6, 0.0698F, 0.0F, 0.0F);
        this.cube_r6.cubeList.add(new ModelBox(cube_r6, 36, 21, -3.0F, -3.25F, 2.0F, 4, 1, 3, 0.01F, false));

        this.cube_r7 = new AdvancedModelRenderer(this);
        this.cube_r7.setRotationPoint(1.5F, 1.25F, -5.0F);
        this.body2.addChild(cube_r7);
        this.setRotateAngle(cube_r7, -0.0175F, 0.0F, 0.0F);
        this.cube_r7.cubeList.add(new ModelBox(cube_r7, 0, 10, -4.0F, -3.0F, -1.0F, 5, 3, 6, 0.0F, false));

        this.chest = new AdvancedModelRenderer(this);
        this.chest.setRotationPoint(0.0F, -0.425F, -5.9F);
        this.body2.addChild(chest);
        this.chest.cubeList.add(new ModelBox(chest, 32, 30, -2.0F, -1.725F, -3.1F, 4, 2, 4, -0.01F, false));

        this.cube_r8 = new AdvancedModelRenderer(this);
        this.cube_r8.setRotationPoint(2.45F, 0.85F, -1.6F);
        this.chest.addChild(cube_r8);
        this.setRotateAngle(cube_r8, 0.0F, -0.0436F, 0.0F);
        this.cube_r8.cubeList.add(new ModelBox(cube_r8, 30, 48, -1.0F, -2.0F, -1.0F, 1, 2, 3, 0.02F, true));

        this.cube_r9 = new AdvancedModelRenderer(this);
        this.cube_r9.setRotationPoint(-2.45F, 0.85F, -1.6F);
        this.chest.addChild(cube_r9);
        this.setRotateAngle(cube_r9, 0.0F, 0.0436F, 0.0F);
        this.cube_r9.cubeList.add(new ModelBox(cube_r9, 30, 48, 0.0F, -2.0F, -1.0F, 1, 2, 3, 0.02F, false));

        this.cube_r10 = new AdvancedModelRenderer(this);
        this.cube_r10.setRotationPoint(1.0F, 1.35F, -2.2F);
        this.chest.addChild(cube_r10);
        this.setRotateAngle(cube_r10, -0.0873F, 0.0F, 0.0F);
        this.cube_r10.cubeList.add(new ModelBox(cube_r10, 16, 30, -3.0F, -2.0F, -1.0F, 4, 2, 4, 0.0F, false));

        this.armright = new AdvancedModelRenderer(this);
        this.armright.setRotationPoint(-2.25F, 0.9F, -0.7F);
        this.chest.addChild(armright);
        this.setRotateAngle(armright, 0.2182F, 0.0F, -0.3927F);
        this.armright.cubeList.add(new ModelBox(armright, 30, 16, -1.5F, -0.5F, -0.5F, 2, 1, 1, 0.0F, false));

        this.armright2 = new AdvancedModelRenderer(this);
        this.armright2.setRotationPoint(-1.25F, 0.0F, -0.25F);
        this.armright.addChild(armright2);
        this.setRotateAngle(armright2, 0.0F, -1.1345F, 0.2618F);
        this.armright2.cubeList.add(new ModelBox(armright2, 22, 46, -0.475F, -0.5F, -0.5F, 1, 1, 1, -0.01F, false));
        this.armright2.cubeList.add(new ModelBox(armright2, 48, 14, -0.975F, -0.5F, -0.5F, 1, 1, 1, -0.02F, false));

        this.handright = new AdvancedModelRenderer(this);
        this.handright.setRotationPoint(-0.975F, 0.15F, 0.0F);
        this.armright2.addChild(handright);
        this.setRotateAngle(handright, 0.0F, 0.0F, 0.1309F);
        this.handright.cubeList.add(new ModelBox(handright, 36, 29, -1.0F, 0.0F, -0.5F, 1, 0, 1, 0.0F, false));

        this.armleft = new AdvancedModelRenderer(this);
        this.armleft.setRotationPoint(2.25F, 0.9F, -0.7F);
        this.chest.addChild(armleft);
        this.setRotateAngle(armleft, 0.2182F, 0.0F, 0.3927F);
        this.armleft.cubeList.add(new ModelBox(armleft, 30, 16, -0.5F, -0.5F, -0.5F, 2, 1, 1, 0.0F, true));

        this.armleft2 = new AdvancedModelRenderer(this);
        this.armleft2.setRotationPoint(1.25F, 0.0F, -0.25F);
        this.armleft.addChild(armleft2);
        this.setRotateAngle(armleft2, 0.0F, 1.1345F, -0.2618F);
        this.armleft2.cubeList.add(new ModelBox(armleft2, 22, 46, -0.525F, -0.5F, -0.5F, 1, 1, 1, -0.01F, true));
        this.armleft2.cubeList.add(new ModelBox(armleft2, 48, 14, -0.025F, -0.5F, -0.5F, 1, 1, 1, -0.02F, true));

        this.handleft = new AdvancedModelRenderer(this);
        this.handleft.setRotationPoint(0.975F, 0.15F, 0.0F);
        this.armleft2.addChild(handleft);
        this.setRotateAngle(handleft, 0.0F, 0.0F, -0.1309F);
        this.handleft.cubeList.add(new ModelBox(handleft, 36, 29, 0.0F, 0.0F, -0.5F, 1, 0, 1, 0.0F, true));

        this.head = new AdvancedModelRenderer(this);
        this.head.setRotationPoint(0.0F, -0.15F, -2.5F);
        this.chest.addChild(head);
        this.head.cubeList.add(new ModelBox(head, 0, 27, -1.0F, -1.0F, -6.0F, 2, 1, 6, 0.01F, false));
        this.head.cubeList.add(new ModelBox(head, 40, 41, -1.5F, -1.65F, -2.6F, 3, 1, 3, 0.0F, false));

        this.cube_r11 = new AdvancedModelRenderer(this);
        this.cube_r11.setRotationPoint(0.0F, -1.5F, -4.1F);
        this.head.addChild(cube_r11);
        this.setRotateAngle(cube_r11, 0.0524F, 0.0F, 0.0F);
        this.cube_r11.cubeList.add(new ModelBox(cube_r11, 48, 33, -1.0F, 0.0F, 0.0F, 2, 1, 2, 0.0F, false));

        this.cube_r12 = new AdvancedModelRenderer(this);
        this.cube_r12.setRotationPoint(0.0F, -1.0F, -6.0F);
        this.head.addChild(cube_r12);
        this.setRotateAngle(cube_r12, 0.2618F, 0.0F, 0.0F);
        this.cube_r12.cubeList.add(new ModelBox(cube_r12, 22, 16, -1.0F, 0.0F, 0.0F, 2, 1, 2, -0.01F, false));

        this.cube_r13 = new AdvancedModelRenderer(this);
        this.cube_r13.setRotationPoint(-0.5F, -0.575F, -4.85F);
        this.head.addChild(cube_r13);
        this.setRotateAngle(cube_r13, -0.1309F, 0.0F, 0.0F);
        this.cube_r13.cubeList.add(new ModelBox(cube_r13, 40, 29, 0.0F, -0.15F, -0.9F, 1, 1, 0, 0.0F, false));

        this.cube_r14 = new AdvancedModelRenderer(this);
        this.cube_r14.setRotationPoint(1.0F, 0.75F, -5.95F);
        this.head.addChild(cube_r14);
        this.setRotateAngle(cube_r14, 0.0F, 0.2705F, -0.0262F);
        this.cube_r14.cubeList.add(new ModelBox(cube_r14, 12, 41, -0.1F, -1.35F, 0.0F, 0, 1, 1, 0.0F, true));
        this.cube_r14.cubeList.add(new ModelBox(cube_r14, 16, 27, -0.1F, -1.6F, 1.25F, 0, 1, 2, 0.0F, true));

        this.cube_r15 = new AdvancedModelRenderer(this);
        this.cube_r15.setRotationPoint(1.325F, 0.0F, -6.0F);
        this.head.addChild(cube_r15);
        this.setRotateAngle(cube_r15, 0.0F, 0.2094F, 0.0F);
        this.cube_r15.cubeList.add(new ModelBox(cube_r15, 38, 45, -2.0F, -1.0F, 3.5F, 2, 1, 3, 0.01F, true));

        this.cube_r16 = new AdvancedModelRenderer(this);
        this.cube_r16.setRotationPoint(1.0F, 0.0F, -6.0F);
        this.head.addChild(cube_r16);
        this.setRotateAngle(cube_r16, 0.0F, 0.288F, 0.0F);
        this.cube_r16.cubeList.add(new ModelBox(cube_r16, 40, 36, -2.0F, -1.0F, 0.0F, 2, 1, 4, 0.0F, true));

        this.cube_r17 = new AdvancedModelRenderer(this);
        this.cube_r17.setRotationPoint(-1.325F, 0.0F, -6.0F);
        this.head.addChild(cube_r17);
        this.setRotateAngle(cube_r17, 0.0F, -0.2094F, 0.0F);
        this.cube_r17.cubeList.add(new ModelBox(cube_r17, 38, 45, 0.0F, -1.0F, 3.5F, 2, 1, 3, 0.01F, false));

        this.cube_r18 = new AdvancedModelRenderer(this);
        this.cube_r18.setRotationPoint(-1.0F, 0.0F, -6.0F);
        this.head.addChild(cube_r18);
        this.setRotateAngle(cube_r18, 0.0F, -0.288F, 0.0F);
        this.cube_r18.cubeList.add(new ModelBox(cube_r18, 40, 36, 0.0F, -1.0F, 0.0F, 2, 1, 4, 0.0F, false));

        this.cube_r19 = new AdvancedModelRenderer(this);
        this.cube_r19.setRotationPoint(-1.0F, 0.75F, -5.95F);
        this.head.addChild(cube_r19);
        this.setRotateAngle(cube_r19, 0.0F, -0.2705F, 0.0262F);
        this.cube_r19.cubeList.add(new ModelBox(cube_r19, 16, 27, 0.1F, -1.6F, 1.25F, 0, 1, 2, 0.0F, false));
        this.cube_r19.cubeList.add(new ModelBox(cube_r19, 12, 41, 0.1F, -1.35F, 0.0F, 0, 1, 1, 0.0F, false));

        this.eyeright = new AdvancedModelRenderer(this);
        this.eyeright.setRotationPoint(-0.95F, -1.15F, -2.875F);
        this.head.addChild(eyeright);
        this.setRotateAngle(eyeright, 0.0873F, 0.0F, 0.0F);


        this.cube_r20 = new AdvancedModelRenderer(this);
        this.cube_r20.setRotationPoint(-1.25F, 0.5F, -1.3F);
        this.eyeright.addChild(cube_r20);
        this.setRotateAngle(cube_r20, 0.0F, -0.1571F, 0.0F);
        this.cube_r20.cubeList.add(new ModelBox(cube_r20, 44, 14, 1.0F, -1.0F, 0.5F, 1, 1, 1, 0.0F, false));

        this.eyeleft = new AdvancedModelRenderer(this);
        this.eyeleft.setRotationPoint(0.95F, -1.15F, -2.875F);
        this.head.addChild(eyeleft);
        this.setRotateAngle(eyeleft, 0.0873F, 0.0F, 0.0F);


        this.cube_r21 = new AdvancedModelRenderer(this);
        this.cube_r21.setRotationPoint(1.25F, 0.5F, -1.3F);
        this.eyeleft.addChild(cube_r21);
        this.setRotateAngle(cube_r21, 0.0F, 0.1571F, 0.0F);
        this.cube_r21.cubeList.add(new ModelBox(cube_r21, 44, 14, -2.0F, -1.0F, 0.5F, 1, 1, 1, 0.0F, true));

        this.jaw = new AdvancedModelRenderer(this);
        this.jaw.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.head.addChild(jaw);
        this.jaw.cubeList.add(new ModelBox(jaw, 0, 46, -1.0F, 0.0F, -3.0F, 2, 1, 3, 0.01F, false));
        this.jaw.cubeList.add(new ModelBox(jaw, 48, 29, -1.5F, -1.65F, -2.0F, 3, 2, 2, -0.01F, false));

        this.cube_r22 = new AdvancedModelRenderer(this);
        this.cube_r22.setRotationPoint(-0.5F, -0.275F, -4.85F);
        this.jaw.addChild(cube_r22);
        this.setRotateAngle(cube_r22, -0.1309F, 0.0F, 0.0F);
        this.cube_r22.cubeList.add(new ModelBox(cube_r22, 34, 18, 0.0F, -0.15F, -1.0F, 1, 1, 0, 0.0F, false));

        this.cube_r23 = new AdvancedModelRenderer(this);
        this.cube_r23.setRotationPoint(0.0F, 0.725F, -5.0F);
        this.jaw.addChild(cube_r23);
        this.setRotateAngle(cube_r23, -0.1309F, 0.0F, 0.0F);
        this.cube_r23.cubeList.add(new ModelBox(cube_r23, 20, 48, -1.0F, -1.0F, -1.0F, 2, 1, 3, 0.0F, false));

        this.cube_r24 = new AdvancedModelRenderer(this);
        this.cube_r24.setRotationPoint(0.5F, 0.55F, -6.1F);
        this.jaw.addChild(cube_r24);
        this.setRotateAngle(cube_r24, -0.1484F, 0.0F, 0.0F);
        this.cube_r24.cubeList.add(new ModelBox(cube_r24, 36, 16, -2.0F, -1.0F, 2.0F, 3, 1, 4, 0.0F, false));

        this.cube_r25 = new AdvancedModelRenderer(this);
        this.cube_r25.setRotationPoint(1.0F, 0.6F, -6.0F);
        this.jaw.addChild(cube_r25);
        this.setRotateAngle(cube_r25, -0.1309F, 0.2705F, -0.0262F);
        this.cube_r25.cubeList.add(new ModelBox(cube_r25, 14, 34, -0.1F, -1.35F, 0.0F, 0, 1, 1, 0.0F, true));

        this.cube_r26 = new AdvancedModelRenderer(this);
        this.cube_r26.setRotationPoint(1.0F, 0.75F, -5.95F);
        this.jaw.addChild(cube_r26);
        this.setRotateAngle(cube_r26, -0.0349F, 0.2705F, -0.0262F);
        this.cube_r26.cubeList.add(new ModelBox(cube_r26, 22, 43, -0.1F, -1.1F, 1.25F, 0, 1, 2, 0.0F, true));

        this.cube_r27 = new AdvancedModelRenderer(this);
        this.cube_r27.setRotationPoint(1.325F, 1.325F, -5.525F);
        this.jaw.addChild(cube_r27);
        this.setRotateAngle(cube_r27, 0.1658F, 0.2094F, 0.0F);
        this.cube_r27.cubeList.add(new ModelBox(cube_r27, 12, 43, -1.0F, -1.0F, 2.1F, 1, 1, 4, 0.0F, true));

        this.cube_r28 = new AdvancedModelRenderer(this);
        this.cube_r28.setRotationPoint(1.325F, 1.0F, -6.0F);
        this.jaw.addChild(cube_r28);
        this.setRotateAngle(cube_r28, 0.0F, 0.2094F, 0.0F);
        this.cube_r28.cubeList.add(new ModelBox(cube_r28, 0, 41, -2.05F, -1.0F, 2.5F, 2, 1, 4, 0.0F, true));

        this.cube_r29 = new AdvancedModelRenderer(this);
        this.cube_r29.setRotationPoint(1.0F, 0.6F, -6.0F);
        this.jaw.addChild(cube_r29);
        this.setRotateAngle(cube_r29, -0.1309F, 0.2705F, -0.0349F);
        this.cube_r29.cubeList.add(new ModelBox(cube_r29, 10, 48, -2.0F, -1.0F, 0.0F, 2, 1, 3, 0.0F, true));

        this.cube_r30 = new AdvancedModelRenderer(this);
        this.cube_r30.setRotationPoint(-1.0F, 0.6F, -6.0F);
        this.jaw.addChild(cube_r30);
        this.setRotateAngle(cube_r30, -0.1309F, -0.2705F, 0.0262F);
        this.cube_r30.cubeList.add(new ModelBox(cube_r30, 14, 34, 0.1F, -1.35F, 0.0F, 0, 1, 1, 0.0F, false));

        this.cube_r31 = new AdvancedModelRenderer(this);
        this.cube_r31.setRotationPoint(-1.0F, 0.75F, -5.95F);
        this.jaw.addChild(cube_r31);
        this.setRotateAngle(cube_r31, -0.0349F, -0.2705F, 0.0262F);
        this.cube_r31.cubeList.add(new ModelBox(cube_r31, 22, 43, 0.1F, -1.1F, 1.25F, 0, 1, 2, 0.0F, false));

        this.cube_r32 = new AdvancedModelRenderer(this);
        this.cube_r32.setRotationPoint(-1.0F, 0.6F, -6.0F);
        this.jaw.addChild(cube_r32);
        this.setRotateAngle(cube_r32, -0.1309F, -0.2705F, 0.0349F);
        this.cube_r32.cubeList.add(new ModelBox(cube_r32, 10, 48, 0.0F, -1.0F, 0.0F, 2, 1, 3, 0.0F, false));

        this.cube_r33 = new AdvancedModelRenderer(this);
        this.cube_r33.setRotationPoint(-1.325F, 1.325F, -5.525F);
        this.jaw.addChild(cube_r33);
        this.setRotateAngle(cube_r33, 0.1658F, -0.2094F, 0.0F);
        this.cube_r33.cubeList.add(new ModelBox(cube_r33, 12, 43, 0.0F, -1.0F, 2.1F, 1, 1, 4, 0.0F, false));

        this.cube_r34 = new AdvancedModelRenderer(this);
        this.cube_r34.setRotationPoint(-1.325F, 1.0F, -6.0F);
        this.jaw.addChild(cube_r34);
        this.setRotateAngle(cube_r34, 0.0F, -0.2094F, 0.0F);
        this.cube_r34.cubeList.add(new ModelBox(cube_r34, 0, 41, 0.05F, -1.0F, 2.5F, 2, 1, 4, 0.0F, false));

        updateDefaultPose();
        animator = ModelAnimator.create();
    }

    @Override
    public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        animate((IAnimatedEntity) entity, f, f1, f2, f3, f4, f5);
        this.hip.render(f5);
    }

    public void renderStaticWall(float f) {
        this.setRotateAngle(chest, 0.0F, -0.0F, -0.1F);
        this.setRotateAngle(head, -0.2F, -0.2F, 0.0F);
        this.setRotateAngle(jaw, 0.4F, 0.0F, 0.0F);
        this.setRotateAngle(armleft, 0.0F, 0.0F, 0.0F);
        this.setRotateAngle(armleft2, 0.0F, 0.0F, 0.0F);
        this.setRotateAngle(armright, 0.0F, 0.0F, 0.0F);
        this.setRotateAngle(armright2, 0.0F, 0.0F, 0.0F);
        this.chest.offsetZ = -0.12F;
        this.chest.offsetY = -0.01F;
        this.chest.offsetX = -0.0F;
        this.chest.render(0.01F);
        resetToDefaultPose();
    }
    public void renderStaticFloor(float f) {
        this.setRotateAngle(hip, 0.3F, 0.0F, 0.1F);
        this.setRotateAngle(body, 0.0F, 0.25F, 0.1F);
        this.setRotateAngle(body2, -0.1F, -0.15F, -0.05F);
        this.setRotateAngle(chest, -0.15F, -0.2F, -0.1F);
        this.setRotateAngle(head, -0.2F, -0.2F, 0.0F);
        this.setRotateAngle(jaw, 0.0F, 0.0F, 0.0F);
        this.setRotateAngle(tail, 0.1F, 0.25F, 0.0F);
        this.setRotateAngle(tail2, -0.1F, 0.25F, 0.0F);
        this.setRotateAngle(tail3, -0.0F, 0.25F, 0.0F);
        this.setRotateAngle(armleft, 0.0F, -1.0F, 0.8F);
        this.setRotateAngle(armleft2, 0.0F, 0.0F, 0.0F);
        this.setRotateAngle(armright, 0.0F, 1.0F, -0.8F);
        this.setRotateAngle(armright2, 0.0F, 0.0F, 0.0F);
        this.setRotateAngle(legleft, 0.0F, -0.8F, 0.8F);
        this.setRotateAngle(legleft2, 0.0F, -0.4F, 0.5F);
        this.setRotateAngle(legleft3, 0.0F, 0.0F, 0.0F);
        this.setRotateAngle(legright, 0.0F, 0.8F, -0.8F);
        this.setRotateAngle(legright2, 0.0F, 0.4F, -0.5F);
        this.setRotateAngle(legright3, 0.0F, 0.0F, 0.0F);
        this.hip.offsetY = -0.11F;
        this.hip.offsetX = 0.025F;
        this.hip.render(0.01F);
        resetToDefaultPose();
    }
    @Override
    public void renderStaticBook(float f) {
        //Rotations, positions and sizing:
        this.hip.offsetY = -2.0F;
        this.hip.offsetX = -1.338F;
        this.hip.rotateAngleY = (float)Math.toRadians(200);
        this.hip.rotateAngleX = (float)Math.toRadians(8);
        this.hip.rotateAngleZ = (float)Math.toRadians(-8);
        this.hip.scaleChildren = true;
        float scaler = 1.63F;
        this.hip.setScale(scaler, scaler, scaler);
        //Start of pose:

        //End of pose, now render the model:
        this.hip.render(f);
        //Reset rotations, positions and sizing:
        this.hip.setScale(1.0F, 1.0F, 1.0F);
        this.hip.scaleChildren = false;
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

        AdvancedModelRenderer[] Tail = {this.tail, this.tail2, this.tail3};

        EntityPrehistoricFloraPholidogaster entitySilesaurus = (EntityPrehistoricFloraPholidogaster) e;
        ((EntityPrehistoricFloraPholidogaster)e).tailBuffer.applyChainSwingBuffer(Tail);

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
        EntityPrehistoricFloraPholidogaster ee = (EntityPrehistoricFloraPholidogaster) entitylivingbaseIn;

        if (!ee.isReallyInWater()) {
            if (ee.getIsMoving()) {
                animWalking(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime);
            }
        }
        else {
            //Swimming pose:
            if (ee.getIsFast()) { //Running
                animSwimFast(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime);
            } else {
                animSwim(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime);
            }

        }

        if (ee.getAnimation() == ee.ATTACK_ANIMATION) {
            animAttack(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime, ee.getAnimationTick());
        } 

    }

    public void animWalking(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime) {
        EntityPrehistoricFloraPholidogaster entity = (EntityPrehistoricFloraPholidogaster) entitylivingbaseIn;
        int animCycle = 35;
        double tickAnim = (entity.ticksExisted + entity.getTickOffset()) - (int) (Math.floor((double) (entity.ticksExisted + entity.getTickOffset()) / (double) animCycle) * (double) animCycle) + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;

        if (tickAnim >= 0 && tickAnim < 7) {
            xx = 0 + (((tickAnim - 0) / 7) * (-19.8105-(0)));
            yy = -25 + (((tickAnim - 0) / 7) * (9.84688-(-25)));
            zz = 0 + (((tickAnim - 0) / 7) * (16.6949-(0)));
        }
        else if (tickAnim >= 7 && tickAnim < 16) {
            xx = -19.8105 + (((tickAnim - 7) / 9) * (0.5-(-19.8105)));
            yy = 9.84688 + (((tickAnim - 7) / 9) * (59.75-(9.84688)));
            zz = 16.6949 + (((tickAnim - 7) / 9) * (0-(16.6949)));
        }
        else if (tickAnim >= 16 && tickAnim < 27) {
            xx = 0.5 + (((tickAnim - 16) / 11) * (-39.39339-(0.5)));
            yy = 59.75 + (((tickAnim - 16) / 11) * (13.54293-(59.75)));
            zz = 0 + (((tickAnim - 16) / 11) * (32.48602-(0)));
        }
        else if (tickAnim >= 27 && tickAnim < 35) {
            xx = -39.39339 + (((tickAnim - 27) / 8) * (0-(-39.39339)));
            yy = 13.54293 + (((tickAnim - 27) / 8) * (-25-(13.54293)));
            zz = 32.48602 + (((tickAnim - 27) / 8) * (0-(32.48602)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(legright, legright.rotateAngleX + (float) Math.toRadians(xx), legright.rotateAngleY + (float) Math.toRadians(yy), legright.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 16) {
            xx = 5.20799 + (((tickAnim - 0) / 16) * (32.70484-(5.20799)));
            yy = -28.68858 + (((tickAnim - 0) / 16) * (14.4135-(-28.68858)));
            zz = -9.32115 + (((tickAnim - 0) / 16) * (1.18007-(-9.32115)));
        }
        else if (tickAnim >= 16 && tickAnim < 22) {
            xx = 32.70484 + (((tickAnim - 16) / 6) * (53.16643-(32.70484)));
            yy = 14.4135 + (((tickAnim - 16) / 6) * (38.05883-(14.4135)));
            zz = 1.18007 + (((tickAnim - 16) / 6) * (26.99626-(1.18007)));
        }
        else if (tickAnim >= 22 && tickAnim < 28) {
            xx = 53.16643 + (((tickAnim - 22) / 6) * (20.9664-(53.16643)));
            yy = 38.05883 + (((tickAnim - 22) / 6) * (2.02102-(38.05883)));
            zz = 26.99626 + (((tickAnim - 22) / 6) * (-2.11972-(26.99626)));
        }
        else if (tickAnim >= 28 && tickAnim < 35) {
            xx = 20.9664 + (((tickAnim - 28) / 7) * (5.20799-(20.9664)));
            yy = 2.02102 + (((tickAnim - 28) / 7) * (-28.68858-(2.02102)));
            zz = -2.11972 + (((tickAnim - 28) / 7) * (-9.32115-(-2.11972)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(legright2, legright2.rotateAngleX + (float) Math.toRadians(xx), legright2.rotateAngleY + (float) Math.toRadians(yy), legright2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 9) {
            xx = 0.5 + (((tickAnim - 0) / 9) * (-17.61625-(0.5)));
            yy = -59.75 + (((tickAnim - 0) / 9) * (-16.40473-(-59.75)));
            zz = 0 + (((tickAnim - 0) / 9) * (-43.64878-(0)));
        }
        else if (tickAnim >= 9 && tickAnim < 18) {
            xx = -17.61625 + (((tickAnim - 9) / 9) * (0-(-17.61625)));
            yy = -16.40473 + (((tickAnim - 9) / 9) * (25-(-16.40473)));
            zz = -43.64878 + (((tickAnim - 9) / 9) * (0-(-43.64878)));
        }
        else if (tickAnim >= 18 && tickAnim < 35) {
            xx = 0 + (((tickAnim - 18) / 17) * (0.5-(0)));
            yy = 25 + (((tickAnim - 18) / 17) * (-59.75-(25)));
            zz = 0 + (((tickAnim - 18) / 17) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(legleft, legleft.rotateAngleX + (float) Math.toRadians(xx), legleft.rotateAngleY + (float) Math.toRadians(yy), legleft.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 4) {
            xx = 32.70484 + (((tickAnim - 0) / 4) * (-22.94946-(32.70484)));
            yy = -14.41346 + (((tickAnim - 0) / 4) * (-21.72321-(-14.41346)));
            zz = 1.18007 + (((tickAnim - 0) / 4) * (54.65941-(1.18007)));
        }
        else if (tickAnim >= 4 && tickAnim < 10) {
            xx = -22.94946 + (((tickAnim - 4) / 6) * (14.16744-(-22.94946)));
            yy = -21.72321 + (((tickAnim - 4) / 6) * (24.66562-(-21.72321)));
            zz = 54.65941 + (((tickAnim - 4) / 6) * (13.25896-(54.65941)));
        }
        else if (tickAnim >= 10 && tickAnim < 18) {
            xx = 14.16744 + (((tickAnim - 10) / 8) * (5.24818-(14.16744)));
            yy = 24.66562 + (((tickAnim - 10) / 8) * (27.44375-(24.66562)));
            zz = 13.25896 + (((tickAnim - 10) / 8) * (9.2004-(13.25896)));
        }
        else if (tickAnim >= 18 && tickAnim < 25) {
            xx = 5.24818 + (((tickAnim - 18) / 7) * (3.40518-(5.24818)));
            yy = 27.44375 + (((tickAnim - 18) / 7) * (12.124-(27.44375)));
            zz = 9.2004 + (((tickAnim - 18) / 7) * (-6.57829-(9.2004)));
        }
        else if (tickAnim >= 25 && tickAnim < 35) {
            xx = 3.40518 + (((tickAnim - 25) / 10) * (32.70484-(3.40518)));
            yy = 12.124 + (((tickAnim - 25) / 10) * (-14.41346-(12.124)));
            zz = -6.57829 + (((tickAnim - 25) / 10) * (1.18007-(-6.57829)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(legleft2, legleft2.rotateAngleX + (float) Math.toRadians(xx), legleft2.rotateAngleY + (float) Math.toRadians(yy), legleft2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 5.16987 + (((tickAnim - 0) / 3) * (9.75552-(5.16987)));
            yy = 43.4365 + (((tickAnim - 0) / 3) * (49.7731-(43.4365)));
            zz = 12.33805 + (((tickAnim - 0) / 3) * (12.5283-(12.33805)));
        }
        else if (tickAnim >= 3 && tickAnim < 12) {
            xx = 9.75552 + (((tickAnim - 3) / 9) * (6.03999-(9.75552)));
            yy = 49.7731 + (((tickAnim - 3) / 9) * (-2.54535-(49.7731)));
            zz = 12.5283 + (((tickAnim - 3) / 9) * (36.86485-(12.5283)));
        }
        else if (tickAnim >= 12 && tickAnim < 19) {
            xx = 6.03999 + (((tickAnim - 12) / 7) * (0-(6.03999)));
            yy = -2.54535 + (((tickAnim - 12) / 7) * (-30.25-(-2.54535)));
            zz = 36.86485 + (((tickAnim - 12) / 7) * (0-(36.86485)));
        }
        else if (tickAnim >= 19 && tickAnim < 28) {
            xx = 0 + (((tickAnim - 19) / 9) * (4.61376-(0)));
            yy = -30.25 + (((tickAnim - 19) / 9) * (10.02017-(-30.25)));
            zz = 0 + (((tickAnim - 19) / 9) * (15.45979-(0)));
        }
        else if (tickAnim >= 28 && tickAnim < 35) {
            xx = 4.61376 + (((tickAnim - 28) / 7) * (5.16987-(4.61376)));
            yy = 10.02017 + (((tickAnim - 28) / 7) * (43.4365-(10.02017)));
            zz = 15.45979 + (((tickAnim - 28) / 7) * (12.33805-(15.45979)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(armright, armright.rotateAngleX + (float) Math.toRadians(xx), armright.rotateAngleY + (float) Math.toRadians(yy), armright.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 11.25995 + (((tickAnim - 0) / 3) * (12.25-(11.25995)));
            yy = 19.22646 + (((tickAnim - 0) / 3) * (26-(19.22646)));
            zz = -10.42402 + (((tickAnim - 0) / 3) * (0-(-10.42402)));
        }
        else if (tickAnim >= 3 && tickAnim < 7) {
            xx = 12.25 + (((tickAnim - 3) / 4) * (0.59031-(12.25)));
            yy = 26 + (((tickAnim - 3) / 4) * (55.10312-(26)));
            zz = 0 + (((tickAnim - 3) / 4) * (-29.46286-(0)));
        }
        else if (tickAnim >= 7 && tickAnim < 12) {
            xx = 0.59031 + (((tickAnim - 7) / 5) * (20.04562-(0.59031)));
            yy = 55.10312 + (((tickAnim - 7) / 5) * (48.81358-(55.10312)));
            zz = -29.46286 + (((tickAnim - 7) / 5) * (-28.85706-(-29.46286)));
        }
        else if (tickAnim >= 12 && tickAnim < 19) {
            xx = 20.04562 + (((tickAnim - 12) / 7) * (16.05038-(20.04562)));
            yy = 48.81358 + (((tickAnim - 12) / 7) * (18.7254-(48.81358)));
            zz = -28.85706 + (((tickAnim - 12) / 7) * (-16.3533-(-28.85706)));
        }
        else if (tickAnim >= 19 && tickAnim < 22) {
            xx = 16.05038 + (((tickAnim - 19) / 3) * (-0.41839-(16.05038)));
            yy = 18.7254 + (((tickAnim - 19) / 3) * (18.77046-(18.7254)));
            zz = -16.3533 + (((tickAnim - 19) / 3) * (-0.19577-(-16.3533)));
        }
        else if (tickAnim >= 22 && tickAnim < 23) {
            xx = -0.41839 + (((tickAnim - 22) / 1) * (-10.08687-(-0.41839)));
            yy = 18.77046 + (((tickAnim - 22) / 1) * (19.16523-(18.77046)));
            zz = -0.19577 + (((tickAnim - 22) / 1) * (6.67882-(-0.19577)));
        }
        else if (tickAnim >= 23 && tickAnim < 24) {
            xx = -10.08687 + (((tickAnim - 23) / 1) * (-12.81214-(-10.08687)));
            yy = 19.16523 + (((tickAnim - 23) / 1) * (18.99483-(19.16523)));
            zz = 6.67882 + (((tickAnim - 23) / 1) * (6.64953-(6.67882)));
        }
        else if (tickAnim >= 24 && tickAnim < 26) {
            xx = -12.81214 + (((tickAnim - 24) / 2) * (-12.91841-(-12.81214)));
            yy = 18.99483 + (((tickAnim - 24) / 2) * (18.96277-(18.99483)));
            zz = 6.64953 + (((tickAnim - 24) / 2) * (4.90244-(6.64953)));
        }
        else if (tickAnim >= 26 && tickAnim < 28) {
            xx = -12.91841 + (((tickAnim - 26) / 2) * (-2.62825-(-12.91841)));
            yy = 18.96277 + (((tickAnim - 26) / 2) * (19.31465-(18.96277)));
            zz = 4.90244 + (((tickAnim - 26) / 2) * (-2.58661-(4.90244)));
        }
        else if (tickAnim >= 28 && tickAnim < 35) {
            xx = -2.62825 + (((tickAnim - 28) / 7) * (11.25995-(-2.62825)));
            yy = 19.31465 + (((tickAnim - 28) / 7) * (19.22646-(19.31465)));
            zz = -2.58661 + (((tickAnim - 28) / 7) * (-10.42402-(-2.58661)));
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
            zz = 0 + (((tickAnim - 0) / 3) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 19) {
            xx = 0 + (((tickAnim - 3) / 16) * (0-(0)));
            yy = 0 + (((tickAnim - 3) / 16) * (0-(0)));
            zz = 0 + (((tickAnim - 3) / 16) * (0-(0)));
        }
        else if (tickAnim >= 19 && tickAnim < 35) {
            xx = 0 + (((tickAnim - 19) / 16) * (0-(0)));
            yy = 0 + (((tickAnim - 19) / 16) * (0-(0)));
            zz = 0 + (((tickAnim - 19) / 16) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.armright2.rotationPointX = this.armright2.rotationPointX + (float)(xx);
        this.armright2.rotationPointY = this.armright2.rotationPointY - (float)(yy);
        this.armright2.rotationPointZ = this.armright2.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 7) {
            xx = 0 + (((tickAnim - 0) / 7) * (3.98122-(0)));
            yy = 30.25 + (((tickAnim - 0) / 7) * (0.65067-(30.25)));
            zz = 0 + (((tickAnim - 0) / 7) * (-13.16352-(0)));
        }
        else if (tickAnim >= 7 && tickAnim < 17) {
            xx = 3.98122 + (((tickAnim - 7) / 10) * (9.75552-(3.98122)));
            yy = 0.65067 + (((tickAnim - 7) / 10) * (-49.7731-(0.65067)));
            zz = -13.16352 + (((tickAnim - 7) / 10) * (-12.5283-(-13.16352)));
        }
        else if (tickAnim >= 17 && tickAnim < 28) {
            xx = 9.75552 + (((tickAnim - 17) / 11) * (-9.74708-(9.75552)));
            yy = -49.7731 + (((tickAnim - 17) / 11) * (3.40515-(-49.7731)));
            zz = -12.5283 + (((tickAnim - 17) / 11) * (-38.81341-(-12.5283)));
        }
        else if (tickAnim >= 28 && tickAnim < 35) {
            xx = -9.74708 + (((tickAnim - 28) / 7) * (0-(-9.74708)));
            yy = 3.40515 + (((tickAnim - 28) / 7) * (30.25-(3.40515)));
            zz = -38.81341 + (((tickAnim - 28) / 7) * (0-(-38.81341)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(armleft, armleft.rotateAngleX + (float) Math.toRadians(xx), armleft.rotateAngleY + (float) Math.toRadians(yy), armleft.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 7) {
            xx = 16.05038 + (((tickAnim - 0) / 7) * (-13.38986-(16.05038)));
            yy = -18.72545 + (((tickAnim - 0) / 7) * (-19.67775-(-18.72545)));
            zz = 16.35332 + (((tickAnim - 0) / 7) * (-6.85634-(16.35332)));
        }
        else if (tickAnim >= 7 && tickAnim < 17) {
            xx = -13.38986 + (((tickAnim - 7) / 10) * (12.25-(-13.38986)));
            yy = -19.67775 + (((tickAnim - 7) / 10) * (-26-(-19.67775)));
            zz = -6.85634 + (((tickAnim - 7) / 10) * (0-(-6.85634)));
        }
        else if (tickAnim >= 17 && tickAnim < 23) {
            xx = 12.25 + (((tickAnim - 17) / 6) * (8.97673-(12.25)));
            yy = -26 + (((tickAnim - 17) / 6) * (-66.26232-(-26)));
            zz = 0 + (((tickAnim - 17) / 6) * (30.49172-(0)));
        }
        else if (tickAnim >= 23 && tickAnim < 28) {
            xx = 8.97673 + (((tickAnim - 23) / 5) * (14.56186-(8.97673)));
            yy = -66.26232 + (((tickAnim - 23) / 5) * (-65.61605-(-66.26232)));
            zz = 30.49172 + (((tickAnim - 23) / 5) * (38.45743-(30.49172)));
        }
        else if (tickAnim >= 28 && tickAnim < 35) {
            xx = 14.56186 + (((tickAnim - 28) / 7) * (16.05038-(14.56186)));
            yy = -65.61605 + (((tickAnim - 28) / 7) * (-18.72545-(-65.61605)));
            zz = 38.45743 + (((tickAnim - 28) / 7) * (16.35332-(38.45743)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(armleft2, armleft2.rotateAngleX + (float) Math.toRadians(xx), armleft2.rotateAngleY + (float) Math.toRadians(yy), armleft2.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 17) {
            xx = 0 + (((tickAnim - 0) / 17) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 17) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 17) * (0-(0)));
        }
        else if (tickAnim >= 17 && tickAnim < 23) {
            xx = 0 + (((tickAnim - 17) / 6) * (0-(0)));
            yy = 0 + (((tickAnim - 17) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 17) / 6) * (0.3-(0)));
        }
        else if (tickAnim >= 23 && tickAnim < 35) {
            xx = 0 + (((tickAnim - 23) / 12) * (0-(0)));
            yy = 0 + (((tickAnim - 23) / 12) * (0-(0)));
            zz = 0.3 + (((tickAnim - 23) / 12) * (0-(0.3)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.armleft2.rotationPointX = this.armleft2.rotationPointX + (float)(xx);
        this.armleft2.rotationPointY = this.armleft2.rotationPointY - (float)(yy);
        this.armleft2.rotationPointZ = this.armleft2.rotationPointZ + (float)(zz);
        this.setRotateAngle(hip, hip.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*280/0.681-50))*0.5), hip.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180/0.875-50))*-4), hip.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180/0.875+20))*4));
        this.hip.rotationPointX = this.hip.rotationPointX + (float)(0);
        this.hip.rotationPointY = this.hip.rotationPointY - (float)(0);
        this.hip.rotationPointZ = this.hip.rotationPointZ + (float)(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*206/0.5))*-0.2);
        this.setRotateAngle(tail, tail.rotateAngleX + (float) Math.toRadians(0), tail.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180/0.875+50))*5), tail.rotateAngleZ + (float) Math.toRadians(0));
        this.setRotateAngle(tail2, tail2.rotateAngleX + (float) Math.toRadians(0), tail2.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180/0.875+100))*5), tail2.rotateAngleZ + (float) Math.toRadians(0));
        this.setRotateAngle(tail3, tail3.rotateAngleX + (float) Math.toRadians(0), tail3.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180/0.875+150))*-5), tail3.rotateAngleZ + (float) Math.toRadians(0));
        this.setRotateAngle(body, body.rotateAngleX + (float) Math.toRadians(0), body.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180/0.875-100))*7), body.rotateAngleZ + (float) Math.toRadians(0));
        this.setRotateAngle(body2, body2.rotateAngleX + (float) Math.toRadians(0), body2.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180/0.875-150))*-10), body2.rotateAngleZ + (float) Math.toRadians(0));
        this.setRotateAngle(chest, chest.rotateAngleX + (float) Math.toRadians(0), chest.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180/0.875-250))*10), chest.rotateAngleZ + (float) Math.toRadians(0));
        this.setRotateAngle(head, head.rotateAngleX + (float) Math.toRadians(0), head.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180/0.875-300))*-10), head.rotateAngleZ + (float) Math.toRadians(0));

    }
    public void animSwim(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime) {
        EntityPrehistoricFloraPholidogaster entity = (EntityPrehistoricFloraPholidogaster) entitylivingbaseIn;
        int animCycle = 22;
        double tickAnim = (entity.ticksExisted + entity.getTickOffset()) - (int) (Math.floor((double) (entity.ticksExisted + entity.getTickOffset()) / (double) animCycle) * (double) animCycle) + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;
        this.setRotateAngle(hip, hip.rotateAngleX + (float) Math.toRadians(0), hip.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180/0.563-30))*10), hip.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180/0.563+50))*5));
        this.hip.rotationPointX = this.hip.rotationPointX + (float)(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180/0.563))*0.59);
        this.hip.rotationPointY = this.hip.rotationPointY - (float)(0);
        this.hip.rotationPointZ = this.hip.rotationPointZ + (float)(0);


        this.setRotateAngle(tail, tail.rotateAngleX + (float) Math.toRadians(0), tail.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180/0.563-150))*20), tail.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(tail2, tail2.rotateAngleX + (float) Math.toRadians(0), tail2.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180/0.563-220))*30), tail2.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(tail3, tail3.rotateAngleX + (float) Math.toRadians(0), tail3.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180/0.563-300))*45), tail3.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(legright, legright.rotateAngleX + (float) Math.toRadians(-6.39798), legright.rotateAngleY + (float) Math.toRadians(79.3362), legright.rotateAngleZ + (float) Math.toRadians(-43.4096));


        this.setRotateAngle(legright2, legright2.rotateAngleX + (float) Math.toRadians(-35.43377), legright2.rotateAngleY + (float) Math.toRadians(-10.806), legright2.rotateAngleZ + (float) Math.toRadians(-57.576));


        this.setRotateAngle(legleft, legleft.rotateAngleX + (float) Math.toRadians(-6.39798), legleft.rotateAngleY + (float) Math.toRadians(-79.33622), legleft.rotateAngleZ + (float) Math.toRadians(43.40964));


        this.setRotateAngle(legleft2, legleft2.rotateAngleX + (float) Math.toRadians(-35.43377), legleft2.rotateAngleY + (float) Math.toRadians(10.806), legleft2.rotateAngleZ + (float) Math.toRadians(57.57596));


        this.setRotateAngle(body, body.rotateAngleX + (float) Math.toRadians(0), body.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180/0.563-70))*-10), body.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(body2, body2.rotateAngleX + (float) Math.toRadians(0), body2.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180/0.563-50))*-10), body2.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(chest, chest.rotateAngleX + (float) Math.toRadians(0), chest.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180/0.563-150))*10), chest.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(armright, armright.rotateAngleX + (float) Math.toRadians(51.79229), armright.rotateAngleY + (float) Math.toRadians(57.87872), armright.rotateAngleZ + (float) Math.toRadians(-5.16186));


        this.setRotateAngle(armright2, armright2.rotateAngleX + (float) Math.toRadians(-0.29846), armright2.rotateAngleY + (float) Math.toRadians(43.93164), armright2.rotateAngleZ + (float) Math.toRadians(-42.99837));
        this.armright2.rotationPointX = this.armright2.rotationPointX + (float)(0);
        this.armright2.rotationPointY = this.armright2.rotationPointY - (float)(-0.275);
        this.armright2.rotationPointZ = this.armright2.rotationPointZ + (float)(0);


        this.setRotateAngle(armleft, armleft.rotateAngleX + (float) Math.toRadians(51.79229), armleft.rotateAngleY + (float) Math.toRadians(-57.8787), armleft.rotateAngleZ + (float) Math.toRadians(5.1619));


        this.setRotateAngle(armleft2, armleft2.rotateAngleX + (float) Math.toRadians(-0.29846), armleft2.rotateAngleY + (float) Math.toRadians(-43.9316), armleft2.rotateAngleZ + (float) Math.toRadians(42.9984));
        this.armleft2.rotationPointX = this.armleft2.rotationPointX + (float)(0);
        this.armleft2.rotationPointY = this.armleft2.rotationPointY - (float)(-0.275);
        this.armleft2.rotationPointZ = this.armleft2.rotationPointZ + (float)(0);


        this.setRotateAngle(head, head.rotateAngleX + (float) Math.toRadians(0), head.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180/0.563-50))*10), head.rotateAngleZ + (float) Math.toRadians(0));


    }
    public void animSwimFast(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime) {
        EntityPrehistoricFloraPholidogaster entity = (EntityPrehistoricFloraPholidogaster) entitylivingbaseIn;
        int animCycle = 12;
        double tickAnim = (entity.ticksExisted + entity.getTickOffset()) - (int) (Math.floor((double) (entity.ticksExisted + entity.getTickOffset()) / (double) animCycle) * (double) animCycle) + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;
        this.setRotateAngle(hip, hip.rotateAngleX + (float) Math.toRadians(0), hip.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180/0.313-30))*20), hip.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180/0.313+50))*10));
        this.hip.rotationPointX = this.hip.rotationPointX + (float)(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180/0.313))*2.5);
        this.hip.rotationPointY = this.hip.rotationPointY - (float)(0);
        this.hip.rotationPointZ = this.hip.rotationPointZ + (float)(0);


        this.setRotateAngle(tail, tail.rotateAngleX + (float) Math.toRadians(0), tail.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180/0.313-150))*35), tail.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(tail2, tail2.rotateAngleX + (float) Math.toRadians(0), tail2.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180/0.313-220))*40), tail2.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(tail3, tail3.rotateAngleX + (float) Math.toRadians(0), tail3.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180/0.313-300))*55), tail3.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(legright, legright.rotateAngleX + (float) Math.toRadians(-6.39798), legright.rotateAngleY + (float) Math.toRadians(79.3362), legright.rotateAngleZ + (float) Math.toRadians(-43.4096));


        this.setRotateAngle(legright2, legright2.rotateAngleX + (float) Math.toRadians(-35.43377), legright2.rotateAngleY + (float) Math.toRadians(-10.806), legright2.rotateAngleZ + (float) Math.toRadians(-57.576));


        this.setRotateAngle(legleft, legleft.rotateAngleX + (float) Math.toRadians(-6.39798), legleft.rotateAngleY + (float) Math.toRadians(-79.33622), legleft.rotateAngleZ + (float) Math.toRadians(43.40964));


        this.setRotateAngle(legleft2, legleft2.rotateAngleX + (float) Math.toRadians(-35.43377), legleft2.rotateAngleY + (float) Math.toRadians(10.806), legleft2.rotateAngleZ + (float) Math.toRadians(57.57596));


        this.setRotateAngle(body, body.rotateAngleX + (float) Math.toRadians(0), body.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180/0.313-70))*-20), body.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(body2, body2.rotateAngleX + (float) Math.toRadians(0), body2.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180/0.313-50))*-20), body2.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(chest, chest.rotateAngleX + (float) Math.toRadians(0), chest.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180/0.313-120))*20), chest.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(armright, armright.rotateAngleX + (float) Math.toRadians(51.79229), armright.rotateAngleY + (float) Math.toRadians(57.87872), armright.rotateAngleZ + (float) Math.toRadians(-5.16186));


        this.setRotateAngle(armright2, armright2.rotateAngleX + (float) Math.toRadians(-0.29846), armright2.rotateAngleY + (float) Math.toRadians(43.93164), armright2.rotateAngleZ + (float) Math.toRadians(-42.99837));
        this.armright2.rotationPointX = this.armright2.rotationPointX + (float)(0);
        this.armright2.rotationPointY = this.armright2.rotationPointY - (float)(-0.275);
        this.armright2.rotationPointZ = this.armright2.rotationPointZ + (float)(0);


        this.setRotateAngle(armleft, armleft.rotateAngleX + (float) Math.toRadians(51.79229), armleft.rotateAngleY + (float) Math.toRadians(-57.8787), armleft.rotateAngleZ + (float) Math.toRadians(5.1619));


        this.setRotateAngle(armleft2, armleft2.rotateAngleX + (float) Math.toRadians(-0.29846), armleft2.rotateAngleY + (float) Math.toRadians(-43.9316), armleft2.rotateAngleZ + (float) Math.toRadians(42.9984));
        this.armleft2.rotationPointX = this.armleft2.rotationPointX + (float)(0);
        this.armleft2.rotationPointY = this.armleft2.rotationPointY - (float)(-0.275);
        this.armleft2.rotationPointZ = this.armleft2.rotationPointZ + (float)(0);


        this.setRotateAngle(head, head.rotateAngleX + (float) Math.toRadians(0), head.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180/0.313-80))*20), head.rotateAngleZ + (float) Math.toRadians(0));


    }

    public void animAttack(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime, double animTick) {
        EntityPrehistoricFloraPholidogaster entity = (EntityPrehistoricFloraPholidogaster) entitylivingbaseIn;
        int animCycle = 8;
        double tickAnim = animTick + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;
         if (tickAnim >= 0 && tickAnim < 3) {
            xx = 0 + (((tickAnim - 0) / 3) * (-10.7227-(0)));
            yy = 0 + (((tickAnim - 0) / 3) * (-0.63021-(0)));
            zz = 0 + (((tickAnim - 0) / 3) * (-4.96022-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 8) {
            xx = -10.7227 + (((tickAnim - 3) / 5) * (0-(-10.7227)));
            yy = -0.63021 + (((tickAnim - 3) / 5) * (0-(-0.63021)));
            zz = -4.96022 + (((tickAnim - 3) / 5) * (0-(-4.96022)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(head, head.rotateAngleX + (float) Math.toRadians(xx), head.rotateAngleY + (float) Math.toRadians(yy), head.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 0 + (((tickAnim - 0) / 3) * (30.75-(0)));
            yy = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 3) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 5) {
            xx = 30.75 + (((tickAnim - 3) / 2) * (0-(30.75)));
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


    public void animate(IAnimatedEntity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        EntityPrehistoricFloraPholidogaster e = (EntityPrehistoricFloraPholidogaster) entity;
        animator.update(entity);
        //this.resetToDefaultPose();
        setRotationAngles(f, f1, f2, f3, f4, f5, (Entity) entity);

        animator.setAnimation(e.ROAR_ANIMATION);
        animator.startKeyframe(10);
        animator.move(this.head, 0,0,-0.2F);
        animator.rotate(this.head, (float) Math.toRadians(-35), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(this.jaw, (float) Math.toRadians(25), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.endKeyframe();
        animator.setStaticKeyframe(10);
        animator.resetKeyframe(10);
    }
}
