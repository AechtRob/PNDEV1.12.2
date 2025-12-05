package net.lepidodendron.entity.model.entity;

import net.ilexiconn.llibrary.client.model.ModelAnimator;
import net.ilexiconn.llibrary.client.model.tools.AdvancedModelRenderer;
import net.ilexiconn.llibrary.server.animation.IAnimatedEntity;
import net.lepidodendron.entity.EntityPrehistoricFloraAnoualerpeton;
import net.lepidodendron.entity.model.ModelBasePalaeopedia;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;

public class ModelAnoualerpeton extends ModelBasePalaeopedia {
    private final AdvancedModelRenderer root;
    private final AdvancedModelRenderer cube_r1;
    private final AdvancedModelRenderer body;
    private final AdvancedModelRenderer chest;
    private final AdvancedModelRenderer cube_r2;
    private final AdvancedModelRenderer rightArm;
    private final AdvancedModelRenderer rightArm2;
    private final AdvancedModelRenderer rightArm3;
    private final AdvancedModelRenderer leftArm;
    private final AdvancedModelRenderer leftArm2;
    private final AdvancedModelRenderer leftArm3;
    private final AdvancedModelRenderer neck;
    private final AdvancedModelRenderer head;
    private final AdvancedModelRenderer cube_r3;
    private final AdvancedModelRenderer cube_r4;
    private final AdvancedModelRenderer cube_r5;
    private final AdvancedModelRenderer cube_r6;
    private final AdvancedModelRenderer cube_r7;
    private final AdvancedModelRenderer cube_r8;
    private final AdvancedModelRenderer cube_r9;
    private final AdvancedModelRenderer cube_r10;
    private final AdvancedModelRenderer cube_r11;
    private final AdvancedModelRenderer eyeright;
    private final AdvancedModelRenderer eyeleft;
    private final AdvancedModelRenderer jaw;
    private final AdvancedModelRenderer cube_r12;
    private final AdvancedModelRenderer cube_r13;
    private final AdvancedModelRenderer cube_r14;
    private final AdvancedModelRenderer cube_r15;
    private final AdvancedModelRenderer cube_r16;
    private final AdvancedModelRenderer cube_r17;
    private final AdvancedModelRenderer rightLeg;
    private final AdvancedModelRenderer rightLeg2;
    private final AdvancedModelRenderer rightLeg3;
    private final AdvancedModelRenderer cube_r18;
    private final AdvancedModelRenderer leftLeg;
    private final AdvancedModelRenderer leftLeg2;
    private final AdvancedModelRenderer leftLeg3;
    private final AdvancedModelRenderer cube_r19;
    private final AdvancedModelRenderer tail1;
    private final AdvancedModelRenderer tail2;
    private final AdvancedModelRenderer tail3;

    private ModelAnimator animator;

    public ModelAnoualerpeton() {
        this.textureWidth = 40;
        this.textureHeight = 32;

        this.root = new AdvancedModelRenderer(this);
        this.root.setRotationPoint(0.0F, 23.5F, 0.0F);
        this.root.cubeList.add(new ModelBox(root, 20, 15, -1.0F, -1.0F, 1.0F, 2, 1, 3, 0.0F, false));

        this.cube_r1 = new AdvancedModelRenderer(this);
        this.cube_r1.setRotationPoint(0.0F, -0.35F, 2.0F);
        this.root.addChild(cube_r1);
        this.setRotateAngle(cube_r1, -0.0873F, 0.0F, 0.0F);
        this.cube_r1.cubeList.add(new ModelBox(cube_r1, 10, 11, -1.0F, -2.0F, -1.0F, 2, 2, 3, -0.01F, false));

        this.body = new AdvancedModelRenderer(this);
        this.body.setRotationPoint(0.0F, -1.75F, 2.0F);
        this.root.addChild(body);
        this.body.cubeList.add(new ModelBox(body, 0, 6, -1.5F, -0.7F, -4.0F, 3, 1, 4, 0.0F, false));
        this.body.cubeList.add(new ModelBox(body, 0, 0, -1.5F, -0.25F, -4.0F, 3, 2, 4, 0.01F, false));

        this.chest = new AdvancedModelRenderer(this);
        this.chest.setRotationPoint(0.0F, 0.25F, -4.0F);
        this.body.addChild(chest);
        this.chest.cubeList.add(new ModelBox(chest, 24, 0, -0.5F, 0.5F, -2.5F, 1, 1, 3, 0.0F, false));
        this.chest.cubeList.add(new ModelBox(chest, 20, 19, -1.35F, -0.5F, -2.525F, 1, 2, 3, -0.01F, false));
        this.chest.cubeList.add(new ModelBox(chest, 0, 21, 0.35F, -0.5F, -2.525F, 1, 2, 3, -0.01F, false));

        this.cube_r2 = new AdvancedModelRenderer(this);
        this.cube_r2.setRotationPoint(-0.5F, 0.15F, -0.5F);
        this.chest.addChild(cube_r2);
        this.setRotateAngle(cube_r2, 0.0873F, 0.0F, 0.0F);
        this.cube_r2.cubeList.add(new ModelBox(cube_r2, 24, 4, 0.0F, -1.0F, -2.0F, 1, 1, 3, 0.0F, false));
        this.cube_r2.cubeList.add(new ModelBox(cube_r2, 8, 25, 0.84F, -1.0F, -2.0F, 1, 1, 3, -0.01F, false));
        this.cube_r2.cubeList.add(new ModelBox(cube_r2, 16, 24, -0.84F, -1.0F, -2.0F, 1, 1, 3, -0.01F, false));

        this.rightArm = new AdvancedModelRenderer(this);
        this.rightArm.setRotationPoint(-1.0F, 0.65F, -1.75F);
        this.chest.addChild(rightArm);
        this.setRotateAngle(rightArm, 0.0F, 0.6545F, -0.5236F);
        this.rightArm.cubeList.add(new ModelBox(rightArm, 28, 22, -1.75F, -0.5F, -0.5F, 2, 1, 1, 0.01F, false));

        this.rightArm2 = new AdvancedModelRenderer(this);
        this.rightArm2.setRotationPoint(-1.75F, 0.0F, 0.0F);
        this.rightArm.addChild(rightArm2);
        this.setRotateAngle(rightArm2, 0.1309F, -0.7418F, -0.48F);
        this.rightArm2.cubeList.add(new ModelBox(rightArm2, 30, 10, -0.725F, -0.5F, -0.5F, 1, 1, 1, 0.0F, false));
        this.rightArm2.cubeList.add(new ModelBox(rightArm2, 30, 12, -1.05F, -0.5F, -0.5F, 1, 1, 1, -0.01F, false));

        this.rightArm3 = new AdvancedModelRenderer(this);
        this.rightArm3.setRotationPoint(-0.95F, -0.25F, 0.0F);
        this.rightArm2.addChild(rightArm3);
        this.setRotateAngle(rightArm3, 0.4974F, -0.9163F, 0.4102F);
        this.rightArm3.cubeList.add(new ModelBox(rightArm3, 14, 10, -0.925F, 0.0F, -0.5F, 1, 0, 1, 0.0F, false));

        this.leftArm = new AdvancedModelRenderer(this);
        this.leftArm.setRotationPoint(1.0F, 0.65F, -1.75F);
        this.chest.addChild(leftArm);
        this.setRotateAngle(leftArm, 0.0F, -0.6545F, 0.5236F);
        this.leftArm.cubeList.add(new ModelBox(leftArm, 28, 22, -0.25F, -0.5F, -0.5F, 2, 1, 1, 0.01F, true));

        this.leftArm2 = new AdvancedModelRenderer(this);
        this.leftArm2.setRotationPoint(1.75F, 0.0F, 0.0F);
        this.leftArm.addChild(leftArm2);
        this.setRotateAngle(leftArm2, 0.1309F, 0.7418F, 0.48F);
        this.leftArm2.cubeList.add(new ModelBox(leftArm2, 30, 10, -0.275F, -0.5F, -0.5F, 1, 1, 1, 0.0F, true));
        this.leftArm2.cubeList.add(new ModelBox(leftArm2, 30, 12, 0.05F, -0.5F, -0.5F, 1, 1, 1, -0.01F, true));

        this.leftArm3 = new AdvancedModelRenderer(this);
        this.leftArm3.setRotationPoint(0.95F, -0.25F, 0.0F);
        this.leftArm2.addChild(leftArm3);
        this.setRotateAngle(leftArm3, 0.4974F, 0.9163F, -0.4102F);
        this.leftArm3.cubeList.add(new ModelBox(leftArm3, 14, 10, -0.075F, 0.0F, -0.5F, 1, 0, 1, 0.0F, true));

        this.neck = new AdvancedModelRenderer(this);
        this.neck.setRotationPoint(0.0F, -0.15F, -2.475F);
        this.chest.addChild(neck);
        this.setRotateAngle(neck, -0.1745F, 0.0F, 0.0F);
        this.neck.cubeList.add(new ModelBox(neck, 8, 21, -1.0F, -0.625F, -1.275F, 2, 2, 2, 0.0F, false));

        this.head = new AdvancedModelRenderer(this);
        this.head.setRotationPoint(0.0F, 0.15F, -1.1F);
        this.neck.addChild(head);
        this.setRotateAngle(head, 0.1745F, 0.0F, 0.0F);
        this.head.cubeList.add(new ModelBox(head, 0, 11, -0.5F, -0.51F, -3.5F, 1, 1, 4, -0.01F, false));

        this.cube_r3 = new AdvancedModelRenderer(this);
        this.cube_r3.setRotationPoint(0.5F, 0.5F, -3.475F);
        this.head.addChild(cube_r3);
        this.setRotateAngle(cube_r3, 0.0F, 0.48F, 0.0F);
        this.cube_r3.cubeList.add(new ModelBox(cube_r3, 16, 21, -1.0F, -1.0F, 0.0F, 1, 1, 1, 0.0F, true));

        this.cube_r4 = new AdvancedModelRenderer(this);
        this.cube_r4.setRotationPoint(0.925F, 0.5F, -2.6F);
        this.head.addChild(cube_r4);
        this.setRotateAngle(cube_r4, 0.0F, 0.1309F, 0.0F);
        this.cube_r4.cubeList.add(new ModelBox(cube_r4, 28, 28, -1.0F, -1.0F, 0.0F, 1, 1, 1, 0.01F, true));

        this.cube_r5 = new AdvancedModelRenderer(this);
        this.cube_r5.setRotationPoint(1.05F, 0.5F, -1.6F);
        this.head.addChild(cube_r5);
        this.setRotateAngle(cube_r5, 0.0F, -0.0611F, 0.0F);
        this.cube_r5.cubeList.add(new ModelBox(cube_r5, 0, 26, -1.0F, -1.0F, 0.0F, 1, 1, 2, 0.0F, true));

        this.cube_r6 = new AdvancedModelRenderer(this);
        this.cube_r6.setRotationPoint(-0.925F, 0.5F, -2.6F);
        this.head.addChild(cube_r6);
        this.setRotateAngle(cube_r6, 0.0F, -0.1309F, 0.0F);
        this.cube_r6.cubeList.add(new ModelBox(cube_r6, 28, 28, 0.0F, -1.0F, 0.0F, 1, 1, 1, 0.01F, false));

        this.cube_r7 = new AdvancedModelRenderer(this);
        this.cube_r7.setRotationPoint(-0.5F, 0.5F, -3.475F);
        this.head.addChild(cube_r7);
        this.setRotateAngle(cube_r7, 0.0F, -0.48F, 0.0F);
        this.cube_r7.cubeList.add(new ModelBox(cube_r7, 16, 21, 0.0F, -1.0F, 0.0F, 1, 1, 1, 0.0F, false));

        this.cube_r8 = new AdvancedModelRenderer(this);
        this.cube_r8.setRotationPoint(0.15F, -0.9F, -0.525F);
        this.head.addChild(cube_r8);
        this.setRotateAngle(cube_r8, -0.2618F, 0.0F, 0.0F);
        this.cube_r8.cubeList.add(new ModelBox(cube_r8, 30, 14, -0.5F, 0.0F, 0.0F, 1, 1, 1, 0.01F, true));
        this.cube_r8.cubeList.add(new ModelBox(cube_r8, 30, 14, -0.8F, 0.0F, 0.0F, 1, 1, 1, 0.01F, false));

        this.cube_r9 = new AdvancedModelRenderer(this);
        this.cube_r9.setRotationPoint(0.25F, -0.825F, -2.525F);
        this.head.addChild(cube_r9);
        this.setRotateAngle(cube_r9, 0.0436F, 0.0F, 0.0F);
        this.cube_r9.cubeList.add(new ModelBox(cube_r9, 16, 28, -0.5F, 0.0F, 0.0F, 1, 1, 2, 0.01F, true));
        this.cube_r9.cubeList.add(new ModelBox(cube_r9, 16, 28, -1.0F, 0.0F, 0.0F, 1, 1, 2, 0.01F, false));

        this.cube_r10 = new AdvancedModelRenderer(this);
        this.cube_r10.setRotationPoint(0.0F, -0.5F, -3.475F);
        this.head.addChild(cube_r10);
        this.setRotateAngle(cube_r10, 0.3272F, 0.0F, 0.0F);
        this.cube_r10.cubeList.add(new ModelBox(cube_r10, 0, 29, -0.5F, 0.0F, 0.0F, 1, 1, 1, 0.0F, false));

        this.cube_r11 = new AdvancedModelRenderer(this);
        this.cube_r11.setRotationPoint(-1.05F, 0.5F, -1.6F);
        this.head.addChild(cube_r11);
        this.setRotateAngle(cube_r11, 0.0F, 0.0611F, 0.0F);
        this.cube_r11.cubeList.add(new ModelBox(cube_r11, 0, 26, 0.0F, -1.0F, 0.0F, 1, 1, 2, 0.0F, false));

        this.eyeright = new AdvancedModelRenderer(this);
        this.eyeright.setRotationPoint(-0.075F, -0.775F, -1.975F);
        this.head.addChild(eyeright);
        this.setRotateAngle(eyeright, 0.0F, -0.1745F, 0.1745F);
        this.eyeright.cubeList.add(new ModelBox(eyeright, 4, 29, -1.0F, 0.0F, -0.5F, 1, 1, 1, 0.0F, false));

        this.eyeleft = new AdvancedModelRenderer(this);
        this.eyeleft.setRotationPoint(0.075F, -0.775F, -1.975F);
        this.head.addChild(eyeleft);
        this.setRotateAngle(eyeleft, 0.0F, 0.1745F, -0.1745F);
        this.eyeleft.cubeList.add(new ModelBox(eyeleft, 4, 29, 0.0F, 0.0F, -0.5F, 1, 1, 1, 0.0F, true));

        this.jaw = new AdvancedModelRenderer(this);
        this.jaw.setRotationPoint(0.0F, 0.45F, -0.2F);
        this.head.addChild(jaw);
        this.setRotateAngle(jaw, -0.0873F, 0.0F, 0.0F);
        this.jaw.cubeList.add(new ModelBox(jaw, 20, 10, -0.5F, -0.435F, -3.2F, 1, 1, 4, 0.0F, false));

        this.cube_r12 = new AdvancedModelRenderer(this);
        this.cube_r12.setRotationPoint(0.475F, 0.55F, -3.275F);
        this.jaw.addChild(cube_r12);
        this.setRotateAngle(cube_r12, 0.0F, 0.4014F, 0.0F);
        this.cube_r12.cubeList.add(new ModelBox(cube_r12, 22, 30, -1.0F, -1.0F, 0.1F, 1, 1, 1, 0.0F, true));

        this.cube_r13 = new AdvancedModelRenderer(this);
        this.cube_r13.setRotationPoint(0.9F, 0.55F, -2.35F);
        this.jaw.addChild(cube_r13);
        this.setRotateAngle(cube_r13, 0.0F, 0.0873F, 0.0F);
        this.cube_r13.cubeList.add(new ModelBox(cube_r13, 30, 16, -1.0F, -1.0F, 0.1F, 1, 1, 1, 0.01F, true));

        this.cube_r14 = new AdvancedModelRenderer(this);
        this.cube_r14.setRotationPoint(1.025F, 0.55F, -1.35F);
        this.jaw.addChild(cube_r14);
        this.setRotateAngle(cube_r14, 0.0F, -0.192F, 0.0F);
        this.cube_r14.cubeList.add(new ModelBox(cube_r14, 28, 19, -1.0F, -1.0F, 0.1F, 1, 1, 2, 0.0F, true));

        this.cube_r15 = new AdvancedModelRenderer(this);
        this.cube_r15.setRotationPoint(-1.025F, 0.55F, -1.35F);
        this.jaw.addChild(cube_r15);
        this.setRotateAngle(cube_r15, 0.0F, 0.192F, 0.0F);
        this.cube_r15.cubeList.add(new ModelBox(cube_r15, 28, 19, 0.0F, -1.0F, 0.1F, 1, 1, 2, 0.0F, false));

        this.cube_r16 = new AdvancedModelRenderer(this);
        this.cube_r16.setRotationPoint(-0.9F, 0.55F, -2.35F);
        this.jaw.addChild(cube_r16);
        this.setRotateAngle(cube_r16, 0.0F, -0.0873F, 0.0F);
        this.cube_r16.cubeList.add(new ModelBox(cube_r16, 30, 16, 0.0F, -1.0F, 0.1F, 1, 1, 1, 0.01F, false));

        this.cube_r17 = new AdvancedModelRenderer(this);
        this.cube_r17.setRotationPoint(-0.475F, 0.55F, -3.275F);
        this.jaw.addChild(cube_r17);
        this.setRotateAngle(cube_r17, 0.0F, -0.4014F, 0.0F);
        this.cube_r17.cubeList.add(new ModelBox(cube_r17, 22, 30, 0.0F, -1.0F, 0.1F, 1, 1, 1, 0.0F, false));

        this.rightLeg = new AdvancedModelRenderer(this);
        this.rightLeg.setRotationPoint(-1.0F, -0.85F, 3.25F);
        this.root.addChild(rightLeg);
        this.setRotateAngle(rightLeg, 0.0F, -0.5236F, -0.2618F);
        this.rightLeg.cubeList.add(new ModelBox(rightLeg, 22, 28, -1.25F, -0.5F, -0.5F, 2, 1, 1, 0.01F, false));

        this.rightLeg2 = new AdvancedModelRenderer(this);
        this.rightLeg2.setRotationPoint(-1.25F, -0.5F, 0.0F);
        this.rightLeg.addChild(rightLeg2);
        this.setRotateAngle(rightLeg2, 0.0F, 0.0F, -0.9599F);
        this.rightLeg2.cubeList.add(new ModelBox(rightLeg2, 8, 29, -1.025F, 0.0F, -0.5F, 1, 1, 1, 0.0F, false));
        this.rightLeg2.cubeList.add(new ModelBox(rightLeg2, 12, 29, -1.525F, 0.0F, -0.5F, 1, 1, 1, -0.01F, false));

        this.rightLeg3 = new AdvancedModelRenderer(this);
        this.rightLeg3.setRotationPoint(-1.475F, 0.25F, 0.0F);
        this.rightLeg2.addChild(rightLeg3);
        this.setRotateAngle(rightLeg3, 0.0873F, 0.0F, 1.1345F);


        this.cube_r18 = new AdvancedModelRenderer(this);
        this.cube_r18.setRotationPoint(-0.375F, 0.0F, 0.0F);
        this.rightLeg3.addChild(cube_r18);
        this.setRotateAngle(cube_r18, 0.0F, -0.6981F, 0.0F);
        this.cube_r18.cubeList.add(new ModelBox(cube_r18, 24, 8, -1.0F, 0.0F, -1.0F, 2, 0, 2, 0.0F, false));

        this.leftLeg = new AdvancedModelRenderer(this);
        this.leftLeg.setRotationPoint(1.0F, -0.85F, 3.25F);
        this.root.addChild(leftLeg);
        this.setRotateAngle(leftLeg, 0.0F, 0.5236F, 0.2618F);
        this.leftLeg.cubeList.add(new ModelBox(leftLeg, 22, 28, -0.75F, -0.5F, -0.5F, 2, 1, 1, 0.01F, true));

        this.leftLeg2 = new AdvancedModelRenderer(this);
        this.leftLeg2.setRotationPoint(1.25F, -0.5F, 0.0F);
        this.leftLeg.addChild(leftLeg2);
        this.setRotateAngle(leftLeg2, 0.0F, 0.0F, 0.9599F);
        this.leftLeg2.cubeList.add(new ModelBox(leftLeg2, 8, 29, 0.025F, 0.0F, -0.5F, 1, 1, 1, 0.0F, true));
        this.leftLeg2.cubeList.add(new ModelBox(leftLeg2, 12, 29, 0.525F, 0.0F, -0.5F, 1, 1, 1, -0.01F, true));

        this.leftLeg3 = new AdvancedModelRenderer(this);
        this.leftLeg3.setRotationPoint(1.475F, 0.25F, 0.0F);
        this.leftLeg2.addChild(leftLeg3);
        this.setRotateAngle(leftLeg3, 0.0873F, 0.0F, -1.1345F);


        this.cube_r19 = new AdvancedModelRenderer(this);
        this.cube_r19.setRotationPoint(0.375F, 0.0F, 0.0F);
        this.leftLeg3.addChild(cube_r19);
        this.setRotateAngle(cube_r19, 0.0F, 0.6981F, 0.0F);
        this.cube_r19.cubeList.add(new ModelBox(cube_r19, 24, 8, -1.0F, 0.0F, -1.0F, 2, 0, 2, 0.0F, true));

        this.tail1 = new AdvancedModelRenderer(this);
        this.tail1.setRotationPoint(0.0F, -1.75F, 4.1F);
        this.root.addChild(tail1);
        this.setRotateAngle(tail1, -0.2182F, 0.0F, 0.0F);
        this.tail1.cubeList.add(new ModelBox(tail1, 10, 16, -0.75F, -0.24F, -0.6F, 1, 1, 4, 0.0F, false));
        this.tail1.cubeList.add(new ModelBox(tail1, 0, 16, -0.75F, 0.41F, -0.6F, 1, 1, 4, 0.01F, false));
        this.tail1.cubeList.add(new ModelBox(tail1, 0, 16, -0.25F, 0.41F, -0.6F, 1, 1, 4, 0.01F, true));
        this.tail1.cubeList.add(new ModelBox(tail1, 10, 16, -0.25F, -0.24F, -0.6F, 1, 1, 4, 0.0F, true));

        this.tail2 = new AdvancedModelRenderer(this);
        this.tail2.setRotationPoint(0.0F, 0.25F, 3.4F);
        this.tail1.addChild(tail2);
        this.setRotateAngle(tail2, 0.0611F, 0.0F, 0.0F);
        this.tail2.cubeList.add(new ModelBox(tail2, 14, 0, -0.5F, -0.35F, -0.75F, 1, 1, 4, -0.02F, false));
        this.tail2.cubeList.add(new ModelBox(tail2, 14, 5, -0.5F, -0.1F, -0.75F, 1, 1, 4, -0.01F, false));

        this.tail3 = new AdvancedModelRenderer(this);
        this.tail3.setRotationPoint(0.0F, 0.125F, 3.175F);
        this.tail2.addChild(tail3);
        this.setRotateAngle(tail3, 0.1309F, 0.0F, 0.0F);
        this.tail3.cubeList.add(new ModelBox(tail3, 24, 24, -0.5F, -0.4F, -0.175F, 1, 1, 3, 0.0F, false));

        updateDefaultPose();
        animator = ModelAnimator.create();
    }

    @Override
    public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        animate((IAnimatedEntity) entity, f, f1, f2, f3, f4, f5);
        //this.base.offsetZ = this.base.offsetZ + 0.7F;
        this.root.render(f5);
    }
    public void renderStaticWall(float f) {

        this.neck.rotateAngleX = (float) Math.toRadians(90);
        this.setRotateAngle(neck, -0F, 0.0F, 0.0F);
        this.setRotateAngle(head, -0F, 0.0F, 0.0F);
        this.neck.offsetY = -0F;
        this.neck.offsetX = -0F;
        this.neck.offsetZ = -0.22F;
        this.neck.render(0.01F);resetToDefaultPose();
    }
    public void renderStaticFloor(float f) {
        this.setRotateAngle(tail3, 0.1349F, -0.2422F, -0.0325F);
        this.setRotateAngle(tail2, 0.0612F, -0.0523F, -0.0032F);
        this.setRotateAngle(tail1, -0.2223F, -0.1916F, 0.043F);
        this.setRotateAngle(root, 0.0F, -0.4276F, 0.0F);
        this.setRotateAngle(rightLeg3, 0.0873F, 0.0F, 1.1345F);
        this.setRotateAngle(rightLeg2, 0.0F, 0.0F, -0.9599F);
        this.setRotateAngle(rightLeg, 0.0F, -0.5236F, -0.2618F);
        this.setRotateAngle(rightArm3, 0.4974F, -0.9163F, 0.4102F);
        this.setRotateAngle(rightArm2, 0.1309F, -0.7418F, -0.48F);
        this.setRotateAngle(rightArm, 0.0F, 0.6545F, -0.5236F);
        this.setRotateAngle(neck, -0.0393F, 0.0F, 0.0F);
        this.setRotateAngle(leftLeg3, 0.0873F, 0.0F, -1.1345F);
        this.setRotateAngle(leftLeg2, 0.0F, 0.0F, 0.9599F);
        this.setRotateAngle(leftLeg, 0.0F, 0.5236F, 0.2618F);
        this.setRotateAngle(leftArm3, 0.4974F, 0.9163F, -0.4102F);
        this.setRotateAngle(leftArm2, 0.1309F, 0.7418F, 0.48F);
        this.setRotateAngle(leftArm, 0.0F, -0.6545F, 0.5236F);
        this.setRotateAngle(jaw, 0.2967F, 0.0F, 0.0F);
        this.setRotateAngle(head, -0.2313F, 0.0F, 0.0F);
        this.setRotateAngle(eyeright, 0.0F, -0.1745F, 0.1745F);
        this.setRotateAngle(eyeleft, 0.0F, 0.1745F, -0.1745F);
        this.setRotateAngle(cube_r9, 0.0436F, 0.0F, 0.0F);
        this.setRotateAngle(cube_r8, -0.2618F, 0.0F, 0.0F);
        this.setRotateAngle(cube_r7, 0.0F, -0.48F, 0.0F);
        this.setRotateAngle(cube_r6, 0.0F, -0.1309F, 0.0F);
        this.setRotateAngle(cube_r5, 0.0F, -0.0611F, 0.0F);
        this.setRotateAngle(cube_r4, 0.0F, 0.1309F, 0.0F);
        this.setRotateAngle(cube_r3, 0.0F, 0.48F, 0.0F);
        this.setRotateAngle(cube_r2, 0.0873F, 0.0F, 0.0F);
        this.setRotateAngle(cube_r19, 0.0F, 0.6981F, 0.0F);
        this.setRotateAngle(cube_r18, 0.0F, -0.6981F, 0.0F);
        this.setRotateAngle(cube_r17, 0.0F, -0.4014F, 0.0F);
        this.setRotateAngle(cube_r16, 0.0F, -0.0873F, 0.0F);
        this.setRotateAngle(cube_r15, 0.0F, 0.192F, 0.0F);
        this.setRotateAngle(cube_r14, 0.0F, -0.192F, 0.0F);
        this.setRotateAngle(cube_r13, 0.0F, 0.0873F, 0.0F);
        this.setRotateAngle(cube_r12, 0.0F, 0.4014F, 0.0F);
        this.setRotateAngle(cube_r11, 0.0F, 0.0611F, 0.0F);
        this.setRotateAngle(cube_r10, 0.3272F, 0.0F, 0.0F);
        this.setRotateAngle(cube_r1, -0.0873F, 0.0F, 0.0F);
        this.setRotateAngle(chest, 0.0F, -0.0785F, 0.0F);
        this.setRotateAngle(body, 0.0F, 0.1091F, 0.0F);
        this.root.offsetY = 0.28F;
        this.root.render(0.01F);
        this.resetToDefaultPose();
    }

    @Override
    public void renderStaticBook(float f) {
        //Rotations, positions and sizing:
        this.root.offsetY = -2.5F;
        this.root.offsetX = 0.4F;
        this.root.offsetZ = 2.0F;
        this.root.rotateAngleY = (float)Math.toRadians(200);
        this.root.rotateAngleX = (float)Math.toRadians(20);
        this.root.rotateAngleZ = (float)Math.toRadians(-8);
        this.root.scaleChildren = true;
        float scaler = 6.8F;
        this.root.setScale(scaler, scaler, scaler);
        //Start of pose:
        this.setRotateAngle(root, 0.4F, 3.8F, -0.2F);

        //End of pose, now render the model:
        this.root.render(f);
        //Reset rotations, positions and sizing:
        this.root.setScale(1.0F, 1.0F, 1.0F);
        this.root.scaleChildren = false;
        resetToDefaultPose();

    }

    public void setRotateAngle(ModelRenderer modelRenderer, float x, float y, float z) {
        modelRenderer.rotateAngleX = x;
        modelRenderer.rotateAngleY = y;
        modelRenderer.rotateAngleZ = z;
    }

    @Override
    public void setLivingAnimations(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime) {
        super.setLivingAnimations(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime);
        this.resetToDefaultPose();
        EntityPrehistoricFloraAnoualerpeton ee = (EntityPrehistoricFloraAnoualerpeton) entitylivingbaseIn;

        if(ee.getIsMoving()) {
            if (ee.getIsFast()) {
                animRun(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime);
            } else {
                animWalk(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime, false);
            }
        } else {
            // not moving
            animWalk(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime, true);

        }
        


        }
        
    public void animRun(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime) {
        EntityPrehistoricFloraAnoualerpeton entity = (EntityPrehistoricFloraAnoualerpeton) entitylivingbaseIn;
        int animCycle = 10;
        double tickAnim = (entity.ticksExisted + entity.getTickOffset()) - (int) (Math.floor((double) (entity.ticksExisted + entity.getTickOffset()) / (double) animCycle) * (double) animCycle) + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;
        this.setRotateAngle(root, root.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*720/0.5))), root.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*720-80))*10), root.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*720-50))*4));
        this.root.rotationPointX = this.root.rotationPointX + (float)(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360))*0.3);
        this.root.rotationPointY = this.root.rotationPointY - (float)(0);
        this.root.rotationPointZ = this.root.rotationPointZ + (float)(0);


        this.setRotateAngle(body, body.rotateAngleX + (float) Math.toRadians(0), body.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*720+20))*6), body.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*720-150))*4));


        this.setRotateAngle(chest, chest.rotateAngleX + (float) Math.toRadians(0), chest.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*720+100))*10), chest.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*720-200))*4));



        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 0 + (((tickAnim - 0) / 3) * (3.89198-(0)));
            yy = 26.25 + (((tickAnim - 0) / 3) * (-24.2544-(26.25)));
            zz = 0 + (((tickAnim - 0) / 3) * (16.8787-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 5) {
            xx = 3.89198 + (((tickAnim - 3) / 2) * (0.51738-(3.89198)));
            yy = -24.2544 + (((tickAnim - 3) / 2) * (-62.40834-(-24.2544)));
            zz = 16.8787 + (((tickAnim - 3) / 2) * (-1.12217-(16.8787)));
        }
        else if (tickAnim >= 5 && tickAnim < 10) {
            xx = 0.51738 + (((tickAnim - 5) / 5) * (0-(0.51738)));
            yy = -62.40834 + (((tickAnim - 5) / 5) * (26.25-(-62.40834)));
            zz = -1.12217 + (((tickAnim - 5) / 5) * (0-(-1.12217)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightArm, rightArm.rotateAngleX + (float) Math.toRadians(xx), rightArm.rotateAngleY + (float) Math.toRadians(yy), rightArm.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            zz = 37.5 + (((tickAnim - 0) / 3) * (50.55-(37.5)));
        }
        else if (tickAnim >= 3 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 3) / 2) * (0-(0)));
            yy = 0 + (((tickAnim - 3) / 2) * (0-(0)));
            zz = 50.55 + (((tickAnim - 3) / 2) * (0-(50.55)));
        }
        else if (tickAnim >= 5 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 5) / 5) * (0-(0)));
            yy = 0 + (((tickAnim - 5) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 5) / 5) * (37.5-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightArm2, rightArm2.rotateAngleX + (float) Math.toRadians(xx), rightArm2.rotateAngleY + (float) Math.toRadians(yy), rightArm2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 81.82234 + (((tickAnim - 0) / 3) * (85.94488-(81.82234)));
            yy = 82.33329 + (((tickAnim - 0) / 3) * (70.50437-(82.33329)));
            zz = -76.49209 + (((tickAnim - 0) / 3) * (-106.43014-(-76.49209)));
        }
        else if (tickAnim >= 3 && tickAnim < 5) {
            xx = 85.94488 + (((tickAnim - 3) / 2) * (0-(85.94488)));
            yy = 70.50437 + (((tickAnim - 3) / 2) * (0-(70.50437)));
            zz = -106.43014 + (((tickAnim - 3) / 2) * (0-(-106.43014)));
        }
        else if (tickAnim >= 5 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 5) / 3) * (-6.8884-(0)));
            yy = 0 + (((tickAnim - 5) / 3) * (-6.46915-(0)));
            zz = 0 + (((tickAnim - 5) / 3) * (-12.64972-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 10) {
            xx = -6.8884 + (((tickAnim - 8) / 2) * (81.82234-(-6.8884)));
            yy = -6.46915 + (((tickAnim - 8) / 2) * (82.33329-(-6.46915)));
            zz = -12.64972 + (((tickAnim - 8) / 2) * (-76.49209-(-12.64972)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightArm3, rightArm3.rotateAngleX + (float) Math.toRadians(xx), rightArm3.rotateAngleY + (float) Math.toRadians(yy), rightArm3.rotateAngleZ + (float) Math.toRadians(zz));



        this.setRotateAngle(neck, neck.rotateAngleX + (float) Math.toRadians(0), neck.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*720+150))*8), neck.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(head, head.rotateAngleX + (float) Math.toRadians(0), head.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*720+220))*6), head.rotateAngleZ + (float) Math.toRadians(0));



        if (tickAnim >= 0 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 0) / 5) * (29.53799-(0)));
            yy = -17.25 + (((tickAnim - 0) / 5) * (79.93876-(-17.25)));
            zz = 0 + (((tickAnim - 0) / 5) * (-1.66417-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 8) {
            xx = 29.53799 + (((tickAnim - 5) / 3) * (7.04894-(29.53799)));
            yy = 79.93876 + (((tickAnim - 5) / 3) * (18.28062-(79.93876)));
            zz = -1.66417 + (((tickAnim - 5) / 3) * (33.11337-(-1.66417)));
        }
        else if (tickAnim >= 8 && tickAnim < 10) {
            xx = 7.04894 + (((tickAnim - 8) / 2) * (0-(7.04894)));
            yy = 18.28062 + (((tickAnim - 8) / 2) * (-17.25-(18.28062)));
            zz = 33.11337 + (((tickAnim - 8) / 2) * (0-(33.11337)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightLeg, rightLeg.rotateAngleX + (float) Math.toRadians(xx), rightLeg.rotateAngleY + (float) Math.toRadians(yy), rightLeg.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 0) / 5) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 5) * (18.25-(0)));
            zz = 19.75 + (((tickAnim - 0) / 5) * (0-(19.75)));
        }
        else if (tickAnim >= 5 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 5) / 3) * (3.2944-(0)));
            yy = 18.25 + (((tickAnim - 5) / 3) * (8.51426-(18.25)));
            zz = 0 + (((tickAnim - 5) / 3) * (31.1203-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 10) {
            xx = 3.2944 + (((tickAnim - 8) / 2) * (0-(3.2944)));
            yy = 8.51426 + (((tickAnim - 8) / 2) * (0-(8.51426)));
            zz = 31.1203 + (((tickAnim - 8) / 2) * (19.75-(31.1203)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightLeg2, rightLeg2.rotateAngleX + (float) Math.toRadians(xx), rightLeg2.rotateAngleY + (float) Math.toRadians(yy), rightLeg2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 2) {
            xx = 0 + (((tickAnim - 0) / 2) * (-16.53797-(0)));
            yy = 0 + (((tickAnim - 0) / 2) * (-33.4924-(0)));
            zz = -31.5 + (((tickAnim - 0) / 2) * (-15.72787-(-31.5)));
        }
        else if (tickAnim >= 2 && tickAnim < 3) {
            xx = -16.53797 + (((tickAnim - 2) / 1) * (-55.83842-(-16.53797)));
            yy = -33.4924 + (((tickAnim - 2) / 1) * (-54.96738-(-33.4924)));
            zz = -15.72787 + (((tickAnim - 2) / 1) * (44.43173-(-15.72787)));
        }
        else if (tickAnim >= 3 && tickAnim < 5) {
            xx = -55.83842 + (((tickAnim - 3) / 2) * (0-(-55.83842)));
            yy = -54.96738 + (((tickAnim - 3) / 2) * (0-(-54.96738)));
            zz = 44.43173 + (((tickAnim - 3) / 2) * (-59.25-(44.43173)));
        }
        else if (tickAnim >= 5 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 5) / 3) * (20.62826-(0)));
            yy = 0 + (((tickAnim - 5) / 3) * (17.22694-(0)));
            zz = -59.25 + (((tickAnim - 5) / 3) * (-88.22697-(-59.25)));
        }
        else if (tickAnim >= 8 && tickAnim < 9) {
            xx = 20.62826 + (((tickAnim - 8) / 1) * (-4.48057-(20.62826)));
            yy = 17.22694 + (((tickAnim - 8) / 1) * (5.14625-(17.22694)));
            zz = -88.22697 + (((tickAnim - 8) / 1) * (-47.76462-(-88.22697)));
        }
        else if (tickAnim >= 9 && tickAnim < 10) {
            xx = -4.48057 + (((tickAnim - 9) / 1) * (0-(-4.48057)));
            yy = 5.14625 + (((tickAnim - 9) / 1) * (0-(5.14625)));
            zz = -47.76462 + (((tickAnim - 9) / 1) * (-31.5-(-47.76462)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightLeg3, rightLeg3.rotateAngleX + (float) Math.toRadians(xx), rightLeg3.rotateAngleY + (float) Math.toRadians(yy), rightLeg3.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 2) {
            xx = 0 + (((tickAnim - 0) / 2) * (0.255-(0)));
            yy = 0 + (((tickAnim - 0) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 2) * (-0.09-(0)));
        }
        else if (tickAnim >= 2 && tickAnim < 3) {
            xx = 0.255 + (((tickAnim - 2) / 1) * (0.15-(0.255)));
            yy = 0 + (((tickAnim - 2) / 1) * (0-(0)));
            zz = -0.09 + (((tickAnim - 2) / 1) * (-0.175-(-0.09)));
        }
        else if (tickAnim >= 3 && tickAnim < 5) {
            xx = 0.15 + (((tickAnim - 3) / 2) * (0-(0.15)));
            yy = 0 + (((tickAnim - 3) / 2) * (0-(0)));
            zz = -0.175 + (((tickAnim - 3) / 2) * (0-(-0.175)));
        }
        else if (tickAnim >= 5 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 5) / 5) * (0-(0)));
            yy = 0 + (((tickAnim - 5) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 5) / 5) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.rightLeg3.rotationPointX = this.rightLeg3.rotationPointX + (float)(xx);
        this.rightLeg3.rotationPointY = this.rightLeg3.rotationPointY - (float)(yy);
        this.rightLeg3.rotationPointZ = this.rightLeg3.rotationPointZ + (float)(zz);



        this.setRotateAngle(tail1, tail1.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*720/0.5))*-1.5), tail1.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*720-150))*3), tail1.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(tail2, tail2.rotateAngleX + (float) Math.toRadians(0), tail2.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*720-200))*16), tail2.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(tail3, tail3.rotateAngleX + (float) Math.toRadians(0), tail3.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*720-250))*24), tail3.rotateAngleZ + (float) Math.toRadians(0));



        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 29.53799 + (((tickAnim - 0) / 3) * (10.35118-(29.53799)));
            yy = -79.93876 + (((tickAnim - 0) / 3) * (-20.94619-(-79.93876)));
            zz = 1.66417 + (((tickAnim - 0) / 3) * (-31.66864-(1.66417)));
        }
        else if (tickAnim >= 3 && tickAnim < 6) {
            xx = 10.35118 + (((tickAnim - 3) / 3) * (0-(10.35118)));
            yy = -20.94619 + (((tickAnim - 3) / 3) * (17.25-(-20.94619)));
            zz = -31.66864 + (((tickAnim - 3) / 3) * (0-(-31.66864)));
        }
        else if (tickAnim >= 6 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 6) / 4) * (29.53799-(0)));
            yy = 17.25 + (((tickAnim - 6) / 4) * (-79.93876-(17.25)));
            zz = 0 + (((tickAnim - 6) / 4) * (1.66417-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftLeg, leftLeg.rotateAngleX + (float) Math.toRadians(xx), leftLeg.rotateAngleY + (float) Math.toRadians(yy), leftLeg.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 0 + (((tickAnim - 0) / 3) * (5.35323-(0)));
            yy = -18.25 + (((tickAnim - 0) / 3) * (-8.25287-(-18.25)));
            zz = 0 + (((tickAnim - 0) / 3) * (-42.25187-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 4) {
            xx = 5.35323 + (((tickAnim - 3) / 1) * (3.28634-(5.35323)));
            yy = -8.25287 + (((tickAnim - 3) / 1) * (-2.64092-(-8.25287)));
            zz = -42.25187 + (((tickAnim - 3) / 1) * (-47.64859-(-42.25187)));
        }
        else if (tickAnim >= 4 && tickAnim < 6) {
            xx = 3.28634 + (((tickAnim - 4) / 2) * (0-(3.28634)));
            yy = -2.64092 + (((tickAnim - 4) / 2) * (0-(-2.64092)));
            zz = -47.64859 + (((tickAnim - 4) / 2) * (-19.75-(-47.64859)));
        }
        else if (tickAnim >= 6 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 6) / 4) * (0-(0)));
            yy = 0 + (((tickAnim - 6) / 4) * (-18.25-(0)));
            zz = -19.75 + (((tickAnim - 6) / 4) * (0-(-19.75)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftLeg2, leftLeg2.rotateAngleX + (float) Math.toRadians(xx), leftLeg2.rotateAngleY + (float) Math.toRadians(yy), leftLeg2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 0 + (((tickAnim - 0) / 3) * (-7.92792-(0)));
            yy = 0 + (((tickAnim - 0) / 3) * (-19.65657-(0)));
            zz = 59.25 + (((tickAnim - 0) / 3) * (111.59888-(59.25)));
        }
        else if (tickAnim >= 3 && tickAnim < 6) {
            xx = -7.92792 + (((tickAnim - 3) / 3) * (6.67655-(-7.92792)));
            yy = -19.65657 + (((tickAnim - 3) / 3) * (1.32095-(-19.65657)));
            zz = 111.59888 + (((tickAnim - 3) / 3) * (25.13507-(111.59888)));
        }
        else if (tickAnim >= 6 && tickAnim < 8) {
            xx = 6.67655 + (((tickAnim - 6) / 2) * (-32.73121-(6.67655)));
            yy = 1.32095 + (((tickAnim - 6) / 2) * (24.73906-(1.32095)));
            zz = 25.13507 + (((tickAnim - 6) / 2) * (-12.40748-(25.13507)));
        }
        else if (tickAnim >= 8 && tickAnim < 10) {
            xx = -32.73121 + (((tickAnim - 8) / 2) * (0-(-32.73121)));
            yy = 24.73906 + (((tickAnim - 8) / 2) * (0-(24.73906)));
            zz = -12.40748 + (((tickAnim - 8) / 2) * (59.25-(-12.40748)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftLeg3, leftLeg3.rotateAngleX + (float) Math.toRadians(xx), leftLeg3.rotateAngleY + (float) Math.toRadians(yy), leftLeg3.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 3) * (-0.25-(0)));
            zz = 0 + (((tickAnim - 0) / 3) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 6) {
            xx = 0 + (((tickAnim - 3) / 3) * (0-(0)));
            yy = -0.25 + (((tickAnim - 3) / 3) * (0-(-0.25)));
            zz = 0 + (((tickAnim - 3) / 3) * (0-(0)));
        }
        else if (tickAnim >= 6 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 6) / 2) * (-0.075-(0)));
            yy = 0 + (((tickAnim - 6) / 2) * (-0.08-(0)));
            zz = 0 + (((tickAnim - 6) / 2) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 10) {
            xx = -0.075 + (((tickAnim - 8) / 2) * (0-(-0.075)));
            yy = -0.08 + (((tickAnim - 8) / 2) * (0-(-0.08)));
            zz = 0 + (((tickAnim - 8) / 2) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.leftLeg3.rotationPointX = this.leftLeg3.rotationPointX + (float)(xx);
        this.leftLeg3.rotationPointY = this.leftLeg3.rotationPointY - (float)(yy);
        this.leftLeg3.rotationPointZ = this.leftLeg3.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 5) {
            xx = 0.51738 + (((tickAnim - 0) / 5) * (0-(0.51738)));
            yy = 62.40834 + (((tickAnim - 0) / 5) * (-26.25-(62.40834)));
            zz = 1.12217 + (((tickAnim - 0) / 5) * (0-(1.12217)));
        }
        else if (tickAnim >= 5 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 5) / 3) * (7.44595-(0)));
            yy = -26.25 + (((tickAnim - 5) / 3) * (22.31919-(-26.25)));
            zz = 0 + (((tickAnim - 5) / 3) * (-27.0445-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 10) {
            xx = 7.44595 + (((tickAnim - 8) / 2) * (0.51738-(7.44595)));
            yy = 22.31919 + (((tickAnim - 8) / 2) * (62.40834-(22.31919)));
            zz = -27.0445 + (((tickAnim - 8) / 2) * (1.12217-(-27.0445)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftArm, leftArm.rotateAngleX + (float) Math.toRadians(xx), leftArm.rotateAngleY + (float) Math.toRadians(yy), leftArm.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 0) / 5) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 5) * (-37.5-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 5) / 3) * (0-(0)));
            yy = 0 + (((tickAnim - 5) / 3) * (0-(0)));
            zz = -37.5 + (((tickAnim - 5) / 3) * (-36-(-37.5)));
        }
        else if (tickAnim >= 8 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 8) / 2) * (0-(0)));
            yy = 0 + (((tickAnim - 8) / 2) * (0-(0)));
            zz = -36 + (((tickAnim - 8) / 2) * (0-(-36)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftArm2, leftArm2.rotateAngleX + (float) Math.toRadians(xx), leftArm2.rotateAngleY + (float) Math.toRadians(yy), leftArm2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 0 + (((tickAnim - 0) / 3) * (12.81627-(0)));
            yy = 0 + (((tickAnim - 0) / 3) * (8.43865-(0)));
            zz = 0 + (((tickAnim - 0) / 3) * (38.36518-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 5) {
            xx = 12.81627 + (((tickAnim - 3) / 2) * (81.82234-(12.81627)));
            yy = 8.43865 + (((tickAnim - 3) / 2) * (-82.33329-(8.43865)));
            zz = 38.36518 + (((tickAnim - 3) / 2) * (76.49209-(38.36518)));
        }
        else if (tickAnim >= 5 && tickAnim < 8) {
            xx = 81.82234 + (((tickAnim - 5) / 3) * (55.39568-(81.82234)));
            yy = -82.33329 + (((tickAnim - 5) / 3) * (-80.41949-(-82.33329)));
            zz = 76.49209 + (((tickAnim - 5) / 3) * (110.14778-(76.49209)));
        }
        else if (tickAnim >= 8 && tickAnim < 10) {
            xx = 55.39568 + (((tickAnim - 8) / 2) * (0-(55.39568)));
            yy = -80.41949 + (((tickAnim - 8) / 2) * (0-(-80.41949)));
            zz = 110.14778 + (((tickAnim - 8) / 2) * (0-(110.14778)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftArm3, leftArm3.rotateAngleX + (float) Math.toRadians(xx), leftArm3.rotateAngleY + (float) Math.toRadians(yy), leftArm3.rotateAngleZ + (float) Math.toRadians(zz));

    }
    public void animWalk(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime, boolean isStatic) {
        EntityPrehistoricFloraAnoualerpeton entity = (EntityPrehistoricFloraAnoualerpeton) entitylivingbaseIn;
        int animCycle = 20;
        if (entity.animSpeedAdder() <= 0) {
            partialTickTime = 0; //If it's static don't increment partial ticks either
        }
        double tickAnim = (entity.ticksExistedAnimated + entity.getTickOffset()) - (int) (Math.floor((double) (entity.ticksExistedAnimated + entity.getTickOffset()) / (double) animCycle) * (double) animCycle) + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;
        this.setRotateAngle(root, root.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/0.5))), root.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360-80))*6), root.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360-50))*2));
        this.root.rotationPointX = this.root.rotationPointX + (float)(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360))*0.3);
        this.root.rotationPointY = this.root.rotationPointY - (float)(0);
        this.root.rotationPointZ = this.root.rotationPointZ + (float)(0);


        this.setRotateAngle(body, body.rotateAngleX + (float) Math.toRadians(0), body.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360+20))*6), body.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360-150))*2));


        this.setRotateAngle(chest, chest.rotateAngleX + (float) Math.toRadians(0), chest.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360+100))*6), chest.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360-200))*2));



        if (tickAnim >= 0 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 0) / 5) * (3.89198-(0)));
            yy = 26.25 + (((tickAnim - 0) / 5) * (-24.2544-(26.25)));
            zz = 0 + (((tickAnim - 0) / 5) * (16.8787-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 9) {
            xx = 3.89198 + (((tickAnim - 5) / 4) * (0.51738-(3.89198)));
            yy = -24.2544 + (((tickAnim - 5) / 4) * (-62.40834-(-24.2544)));
            zz = 16.8787 + (((tickAnim - 5) / 4) * (-1.12217-(16.8787)));
        }
        else if (tickAnim >= 9 && tickAnim < 20) {
            xx = 0.51738 + (((tickAnim - 9) / 11) * (0-(0.51738)));
            yy = -62.40834 + (((tickAnim - 9) / 11) * (26.25-(-62.40834)));
            zz = -1.12217 + (((tickAnim - 9) / 11) * (0-(-1.12217)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightArm, rightArm.rotateAngleX + (float) Math.toRadians(xx), rightArm.rotateAngleY + (float) Math.toRadians(yy), rightArm.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 0) / 5) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 5) * (0-(0)));
            zz = 37.5 + (((tickAnim - 0) / 5) * (50.55-(37.5)));
        }
        else if (tickAnim >= 5 && tickAnim < 9) {
            xx = 0 + (((tickAnim - 5) / 4) * (0-(0)));
            yy = 0 + (((tickAnim - 5) / 4) * (0-(0)));
            zz = 50.55 + (((tickAnim - 5) / 4) * (0-(50.55)));
        }
        else if (tickAnim >= 9 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 9) / 11) * (0-(0)));
            yy = 0 + (((tickAnim - 9) / 11) * (0-(0)));
            zz = 0 + (((tickAnim - 9) / 11) * (37.5-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightArm2, rightArm2.rotateAngleX + (float) Math.toRadians(xx), rightArm2.rotateAngleY + (float) Math.toRadians(yy), rightArm2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 5) {
            xx = 81.82234 + (((tickAnim - 0) / 5) * (85.94488-(81.82234)));
            yy = 82.33329 + (((tickAnim - 0) / 5) * (70.50437-(82.33329)));
            zz = -76.49209 + (((tickAnim - 0) / 5) * (-106.43014-(-76.49209)));
        }
        else if (tickAnim >= 5 && tickAnim < 9) {
            xx = 85.94488 + (((tickAnim - 5) / 4) * (0-(85.94488)));
            yy = 70.50437 + (((tickAnim - 5) / 4) * (0-(70.50437)));
            zz = -106.43014 + (((tickAnim - 5) / 4) * (0-(-106.43014)));
        }
        else if (tickAnim >= 9 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 9) / 6) * (-6.8884-(0)));
            yy = 0 + (((tickAnim - 9) / 6) * (-6.46915-(0)));
            zz = 0 + (((tickAnim - 9) / 6) * (-12.64972-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 20) {
            xx = -6.8884 + (((tickAnim - 15) / 5) * (81.82234-(-6.8884)));
            yy = -6.46915 + (((tickAnim - 15) / 5) * (82.33329-(-6.46915)));
            zz = -12.64972 + (((tickAnim - 15) / 5) * (-76.49209-(-12.64972)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightArm3, rightArm3.rotateAngleX + (float) Math.toRadians(xx), rightArm3.rotateAngleY + (float) Math.toRadians(yy), rightArm3.rotateAngleZ + (float) Math.toRadians(zz));



        this.setRotateAngle(neck, neck.rotateAngleX + (float) Math.toRadians(0), neck.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360+150))*6), neck.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(head, head.rotateAngleX + (float) Math.toRadians(0), head.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360+220))*6), head.rotateAngleZ + (float) Math.toRadians(0));



        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 0) / 10) * (29.53799-(0)));
            yy = -17.25 + (((tickAnim - 0) / 10) * (79.93876-(-17.25)));
            zz = 0 + (((tickAnim - 0) / 10) * (-1.66417-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 15) {
            xx = 29.53799 + (((tickAnim - 10) / 5) * (7.04894-(29.53799)));
            yy = 79.93876 + (((tickAnim - 10) / 5) * (18.28062-(79.93876)));
            zz = -1.66417 + (((tickAnim - 10) / 5) * (33.11337-(-1.66417)));
        }
        else if (tickAnim >= 15 && tickAnim < 20) {
            xx = 7.04894 + (((tickAnim - 15) / 5) * (0-(7.04894)));
            yy = 18.28062 + (((tickAnim - 15) / 5) * (-17.25-(18.28062)));
            zz = 33.11337 + (((tickAnim - 15) / 5) * (0-(33.11337)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightLeg, rightLeg.rotateAngleX + (float) Math.toRadians(xx), rightLeg.rotateAngleY + (float) Math.toRadians(yy), rightLeg.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 10) * (18.25-(0)));
            zz = 19.75 + (((tickAnim - 0) / 10) * (0-(19.75)));
        }
        else if (tickAnim >= 10 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 10) / 5) * (3.2944-(0)));
            yy = 18.25 + (((tickAnim - 10) / 5) * (8.51426-(18.25)));
            zz = 0 + (((tickAnim - 10) / 5) * (31.1203-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 20) {
            xx = 3.2944 + (((tickAnim - 15) / 5) * (0-(3.2944)));
            yy = 8.51426 + (((tickAnim - 15) / 5) * (0-(8.51426)));
            zz = 31.1203 + (((tickAnim - 15) / 5) * (19.75-(31.1203)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightLeg2, rightLeg2.rotateAngleX + (float) Math.toRadians(xx), rightLeg2.rotateAngleY + (float) Math.toRadians(yy), rightLeg2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 0 + (((tickAnim - 0) / 3) * (-16.53797-(0)));
            yy = 0 + (((tickAnim - 0) / 3) * (-33.4924-(0)));
            zz = -31.5 + (((tickAnim - 0) / 3) * (-15.72787-(-31.5)));
        }
        else if (tickAnim >= 3 && tickAnim < 5) {
            xx = -16.53797 + (((tickAnim - 3) / 2) * (-55.83842-(-16.53797)));
            yy = -33.4924 + (((tickAnim - 3) / 2) * (-54.96738-(-33.4924)));
            zz = -15.72787 + (((tickAnim - 3) / 2) * (44.43173-(-15.72787)));
        }
        else if (tickAnim >= 5 && tickAnim < 10) {
            xx = -55.83842 + (((tickAnim - 5) / 5) * (0-(-55.83842)));
            yy = -54.96738 + (((tickAnim - 5) / 5) * (0-(-54.96738)));
            zz = 44.43173 + (((tickAnim - 5) / 5) * (-59.25-(44.43173)));
        }
        else if (tickAnim >= 10 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 10) / 5) * (20.62826-(0)));
            yy = 0 + (((tickAnim - 10) / 5) * (17.22694-(0)));
            zz = -59.25 + (((tickAnim - 10) / 5) * (-88.22697-(-59.25)));
        }
        else if (tickAnim >= 15 && tickAnim < 18) {
            xx = 20.62826 + (((tickAnim - 15) / 3) * (-4.48057-(20.62826)));
            yy = 17.22694 + (((tickAnim - 15) / 3) * (5.14625-(17.22694)));
            zz = -88.22697 + (((tickAnim - 15) / 3) * (-47.76462-(-88.22697)));
        }
        else if (tickAnim >= 18 && tickAnim < 20) {
            xx = -4.48057 + (((tickAnim - 18) / 2) * (0-(-4.48057)));
            yy = 5.14625 + (((tickAnim - 18) / 2) * (0-(5.14625)));
            zz = -47.76462 + (((tickAnim - 18) / 2) * (-31.5-(-47.76462)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightLeg3, rightLeg3.rotateAngleX + (float) Math.toRadians(xx), rightLeg3.rotateAngleY + (float) Math.toRadians(yy), rightLeg3.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 0 + (((tickAnim - 0) / 3) * (0.255-(0)));
            yy = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 3) * (-0.09-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 5) {
            xx = 0.255 + (((tickAnim - 3) / 2) * (0.15-(0.255)));
            yy = 0 + (((tickAnim - 3) / 2) * (0-(0)));
            zz = -0.09 + (((tickAnim - 3) / 2) * (-0.175-(-0.09)));
        }
        else if (tickAnim >= 5 && tickAnim < 10) {
            xx = 0.15 + (((tickAnim - 5) / 5) * (0-(0.15)));
            yy = 0 + (((tickAnim - 5) / 5) * (0-(0)));
            zz = -0.175 + (((tickAnim - 5) / 5) * (0-(-0.175)));
        }
        else if (tickAnim >= 10 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 10) / 10) * (0-(0)));
            yy = 0 + (((tickAnim - 10) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 10) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.rightLeg3.rotationPointX = this.rightLeg3.rotationPointX + (float)(xx);
        this.rightLeg3.rotationPointY = this.rightLeg3.rotationPointY - (float)(yy);
        this.rightLeg3.rotationPointZ = this.rightLeg3.rotationPointZ + (float)(zz);



        this.setRotateAngle(tail1, tail1.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/0.5))*-1.5), tail1.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360-150))*1), tail1.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(tail2, tail2.rotateAngleX + (float) Math.toRadians(0), tail2.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360-200))*10), tail2.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(tail3, tail3.rotateAngleX + (float) Math.toRadians(0), tail3.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360-250))*20), tail3.rotateAngleZ + (float) Math.toRadians(0));



        if (tickAnim >= 0 && tickAnim < 5) {
            xx = 29.53799 + (((tickAnim - 0) / 5) * (10.35118-(29.53799)));
            yy = -79.93876 + (((tickAnim - 0) / 5) * (-20.94619-(-79.93876)));
            zz = 1.66417 + (((tickAnim - 0) / 5) * (-31.66864-(1.66417)));
        }
        else if (tickAnim >= 5 && tickAnim < 11) {
            xx = 10.35118 + (((tickAnim - 5) / 6) * (0-(10.35118)));
            yy = -20.94619 + (((tickAnim - 5) / 6) * (17.25-(-20.94619)));
            zz = -31.66864 + (((tickAnim - 5) / 6) * (0-(-31.66864)));
        }
        else if (tickAnim >= 11 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 11) / 9) * (29.53799-(0)));
            yy = 17.25 + (((tickAnim - 11) / 9) * (-79.93876-(17.25)));
            zz = 0 + (((tickAnim - 11) / 9) * (1.66417-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftLeg, leftLeg.rotateAngleX + (float) Math.toRadians(xx), leftLeg.rotateAngleY + (float) Math.toRadians(yy), leftLeg.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 0) / 5) * (5.35323-(0)));
            yy = -18.25 + (((tickAnim - 0) / 5) * (-8.25287-(-18.25)));
            zz = 0 + (((tickAnim - 0) / 5) * (-42.25187-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 8) {
            xx = 5.35323 + (((tickAnim - 5) / 3) * (3.28634-(5.35323)));
            yy = -8.25287 + (((tickAnim - 5) / 3) * (-2.64092-(-8.25287)));
            zz = -42.25187 + (((tickAnim - 5) / 3) * (-47.64859-(-42.25187)));
        }
        else if (tickAnim >= 8 && tickAnim < 11) {
            xx = 3.28634 + (((tickAnim - 8) / 3) * (0-(3.28634)));
            yy = -2.64092 + (((tickAnim - 8) / 3) * (0-(-2.64092)));
            zz = -47.64859 + (((tickAnim - 8) / 3) * (-19.75-(-47.64859)));
        }
        else if (tickAnim >= 11 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 11) / 9) * (0-(0)));
            yy = 0 + (((tickAnim - 11) / 9) * (-18.25-(0)));
            zz = -19.75 + (((tickAnim - 11) / 9) * (0-(-19.75)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftLeg2, leftLeg2.rotateAngleX + (float) Math.toRadians(xx), leftLeg2.rotateAngleY + (float) Math.toRadians(yy), leftLeg2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 0) / 5) * (-7.92792-(0)));
            yy = 0 + (((tickAnim - 0) / 5) * (-19.65657-(0)));
            zz = 59.25 + (((tickAnim - 0) / 5) * (111.59888-(59.25)));
        }
        else if (tickAnim >= 5 && tickAnim < 11) {
            xx = -7.92792 + (((tickAnim - 5) / 6) * (6.67655-(-7.92792)));
            yy = -19.65657 + (((tickAnim - 5) / 6) * (1.32095-(-19.65657)));
            zz = 111.59888 + (((tickAnim - 5) / 6) * (25.13507-(111.59888)));
        }
        else if (tickAnim >= 11 && tickAnim < 15) {
            xx = 6.67655 + (((tickAnim - 11) / 4) * (-32.73121-(6.67655)));
            yy = 1.32095 + (((tickAnim - 11) / 4) * (24.73906-(1.32095)));
            zz = 25.13507 + (((tickAnim - 11) / 4) * (-12.40748-(25.13507)));
        }
        else if (tickAnim >= 15 && tickAnim < 20) {
            xx = -32.73121 + (((tickAnim - 15) / 5) * (0-(-32.73121)));
            yy = 24.73906 + (((tickAnim - 15) / 5) * (0-(24.73906)));
            zz = -12.40748 + (((tickAnim - 15) / 5) * (59.25-(-12.40748)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftLeg3, leftLeg3.rotateAngleX + (float) Math.toRadians(xx), leftLeg3.rotateAngleY + (float) Math.toRadians(yy), leftLeg3.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 0) / 5) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 5) * (-0.25-(0)));
            zz = 0 + (((tickAnim - 0) / 5) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 11) {
            xx = 0 + (((tickAnim - 5) / 6) * (0-(0)));
            yy = -0.25 + (((tickAnim - 5) / 6) * (0-(-0.25)));
            zz = 0 + (((tickAnim - 5) / 6) * (0-(0)));
        }
        else if (tickAnim >= 11 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 11) / 4) * (-0.075-(0)));
            yy = 0 + (((tickAnim - 11) / 4) * (-0.08-(0)));
            zz = 0 + (((tickAnim - 11) / 4) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 20) {
            xx = -0.075 + (((tickAnim - 15) / 5) * (0-(-0.075)));
            yy = -0.08 + (((tickAnim - 15) / 5) * (0-(-0.08)));
            zz = 0 + (((tickAnim - 15) / 5) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.leftLeg3.rotationPointX = this.leftLeg3.rotationPointX + (float)(xx);
        this.leftLeg3.rotationPointY = this.leftLeg3.rotationPointY - (float)(yy);
        this.leftLeg3.rotationPointZ = this.leftLeg3.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0.51738 + (((tickAnim - 0) / 10) * (0-(0.51738)));
            yy = 62.40834 + (((tickAnim - 0) / 10) * (-26.25-(62.40834)));
            zz = 1.12217 + (((tickAnim - 0) / 10) * (0-(1.12217)));
        }
        else if (tickAnim >= 10 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 10) / 5) * (7.44595-(0)));
            yy = -26.25 + (((tickAnim - 10) / 5) * (22.31919-(-26.25)));
            zz = 0 + (((tickAnim - 10) / 5) * (-27.0445-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 20) {
            xx = 7.44595 + (((tickAnim - 15) / 5) * (0.51738-(7.44595)));
            yy = 22.31919 + (((tickAnim - 15) / 5) * (62.40834-(22.31919)));
            zz = -27.0445 + (((tickAnim - 15) / 5) * (1.12217-(-27.0445)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftArm, leftArm.rotateAngleX + (float) Math.toRadians(xx), leftArm.rotateAngleY + (float) Math.toRadians(yy), leftArm.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (-37.5-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 10) / 5) * (0-(0)));
            yy = 0 + (((tickAnim - 10) / 5) * (0-(0)));
            zz = -37.5 + (((tickAnim - 10) / 5) * (-36-(-37.5)));
        }
        else if (tickAnim >= 15 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 15) / 5) * (0-(0)));
            yy = 0 + (((tickAnim - 15) / 5) * (0-(0)));
            zz = -36 + (((tickAnim - 15) / 5) * (0-(-36)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftArm2, leftArm2.rotateAngleX + (float) Math.toRadians(xx), leftArm2.rotateAngleY + (float) Math.toRadians(yy), leftArm2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 0) / 5) * (12.81627-(0)));
            yy = 0 + (((tickAnim - 0) / 5) * (8.43865-(0)));
            zz = 0 + (((tickAnim - 0) / 5) * (38.36518-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 10) {
            xx = 12.81627 + (((tickAnim - 5) / 5) * (81.82234-(12.81627)));
            yy = 8.43865 + (((tickAnim - 5) / 5) * (-82.33329-(8.43865)));
            zz = 38.36518 + (((tickAnim - 5) / 5) * (76.49209-(38.36518)));
        }
        else if (tickAnim >= 10 && tickAnim < 15) {
            xx = 81.82234 + (((tickAnim - 10) / 5) * (55.39568-(81.82234)));
            yy = -82.33329 + (((tickAnim - 10) / 5) * (-80.41949-(-82.33329)));
            zz = 76.49209 + (((tickAnim - 10) / 5) * (110.14778-(76.49209)));
        }
        else if (tickAnim >= 15 && tickAnim < 20) {
            xx = 55.39568 + (((tickAnim - 15) / 5) * (0-(55.39568)));
            yy = -80.41949 + (((tickAnim - 15) / 5) * (0-(-80.41949)));
            zz = 110.14778 + (((tickAnim - 15) / 5) * (0-(110.14778)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftArm3, leftArm3.rotateAngleX + (float) Math.toRadians(xx), leftArm3.rotateAngleY + (float) Math.toRadians(yy), leftArm3.rotateAngleZ + (float) Math.toRadians(zz));

    }


    public void animate(IAnimatedEntity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        EntityPrehistoricFloraAnoualerpeton e = (EntityPrehistoricFloraAnoualerpeton) entity;
        animator.update(entity);
        //this.resetToDefaultPose();
        setRotationAngles(f, f1, f2, f3, f4, f5, (Entity) entity);

        animator.setAnimation(e.ATTACK_ANIMATION);
        animator.startKeyframe(5);
        animator.rotate(this.neck, (float) Math.toRadians(30), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(this.head, (float) Math.toRadians(-15), (float) Math.toRadians(0), (float) Math.toRadians(0));
        //animator.rotate(this.upperjaw, (float) Math.toRadians(-25), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(this.jaw, (float) Math.toRadians(10), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.endKeyframe();
        animator.setStaticKeyframe(2);
        animator.resetKeyframe(2);

        animator.setAnimation(e.EAT_ANIMATION);
        animator.startKeyframe(5);
        animator.rotate(this.neck, (float) Math.toRadians(30), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(this.head, (float) Math.toRadians(-15), (float) Math.toRadians(0), (float) Math.toRadians(0));
        //animator.rotate(this.upperjaw, (float) Math.toRadians(-25), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(this.jaw, (float) Math.toRadians(10), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.endKeyframe();
        animator.setStaticKeyframe(2);
        animator.resetKeyframe(2);

        animator.setAnimation(e.ROAR_ANIMATION);
        animator.startKeyframe(10);
        animator.move(this.neck, 0,0,-0.5F);
        animator.rotate(this.head, (float) Math.toRadians(-17), (float) Math.toRadians(0), (float) Math.toRadians(0));
        //animator.rotate(this.upperjaw, (float) Math.toRadians(-25), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(this.jaw, (float) Math.toRadians(10), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.endKeyframe();
        animator.setStaticKeyframe(10);
        animator.resetKeyframe(10);
    }
}
