package net.lepidodendron.entity.model.entity;

import net.ilexiconn.llibrary.client.model.ModelAnimator;
import net.ilexiconn.llibrary.client.model.tools.AdvancedModelRenderer;
import net.ilexiconn.llibrary.server.animation.IAnimatedEntity;
import net.lepidodendron.entity.EntityPrehistoricFloraKuwajimalla;
import net.lepidodendron.entity.model.ModelBasePalaeopedia;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;

public class ModelKuwajimalla extends ModelBasePalaeopedia {
    private final AdvancedModelRenderer hips;
    private final AdvancedModelRenderer cube_r1;
    private final AdvancedModelRenderer cube_r2;
    private final AdvancedModelRenderer rightLeg;
    private final AdvancedModelRenderer rightLeg2;
    private final AdvancedModelRenderer rightLeg3;
    private final AdvancedModelRenderer leftLeg;
    private final AdvancedModelRenderer leftLeg2;
    private final AdvancedModelRenderer leftLeg3;
    private final AdvancedModelRenderer tail1;
    private final AdvancedModelRenderer tail2;
    private final AdvancedModelRenderer tail3;
    private final AdvancedModelRenderer body;
    private final AdvancedModelRenderer chest;
    private final AdvancedModelRenderer cube_r3;
    private final AdvancedModelRenderer rightArm1;
    private final AdvancedModelRenderer rightArm2;
    private final AdvancedModelRenderer rightArm3;
    private final AdvancedModelRenderer leftArm1;
    private final AdvancedModelRenderer leftArm2;
    private final AdvancedModelRenderer leftArm3;
    private final AdvancedModelRenderer neck;
    private final AdvancedModelRenderer neckpouch;
    private final AdvancedModelRenderer cube_r4;
    private final AdvancedModelRenderer head;
    private final AdvancedModelRenderer cube_r5;
    private final AdvancedModelRenderer cube_r6;
    private final AdvancedModelRenderer cube_r7;
    private final AdvancedModelRenderer cube_r8;
    private final AdvancedModelRenderer cube_r9;
    private final AdvancedModelRenderer cube_r10;
    private final AdvancedModelRenderer cube_r11;
    private final AdvancedModelRenderer cube_r12;
    private final AdvancedModelRenderer cube_r13;
    private final AdvancedModelRenderer eyeright;
    private final AdvancedModelRenderer eyeleft;
    private final AdvancedModelRenderer jaw;
    private final AdvancedModelRenderer cube_r14;
    private final AdvancedModelRenderer cube_r15;
    private final AdvancedModelRenderer cube_r16;
    private final AdvancedModelRenderer cube_r17;
    private final AdvancedModelRenderer cube_r18;
    private final AdvancedModelRenderer cube_r19;

    private ModelAnimator animator;

    public ModelKuwajimalla() {
        this.textureWidth = 48;
        this.textureHeight = 48;

        this.hips = new AdvancedModelRenderer(this);
        this.hips.setRotationPoint(0.0F, 21.75F, 5.5F);


        this.cube_r1 = new AdvancedModelRenderer(this);
        this.cube_r1.setRotationPoint(0.5F, 1.15F, 0.0F);
        this.hips.addChild(cube_r1);
        this.setRotateAngle(cube_r1, -0.096F, 0.0F, 0.0F);
        this.cube_r1.cubeList.add(new ModelBox(cube_r1, 16, 26, -2.0F, -2.0F, -1.0F, 3, 1, 4, -0.01F, false));

        this.cube_r2 = new AdvancedModelRenderer(this);
        this.cube_r2.setRotationPoint(0.5F, 1.8F, 0.0F);
        this.hips.addChild(cube_r2);
        this.setRotateAngle(cube_r2, -0.0436F, 0.0F, 0.0F);
        this.cube_r2.cubeList.add(new ModelBox(cube_r2, 20, 0, -2.0F, -2.0F, -1.0F, 3, 2, 4, 0.0F, false));

        this.rightLeg = new AdvancedModelRenderer(this);
        this.rightLeg.setRotationPoint(-1.25F, 0.9F, 1.7F);
        this.hips.addChild(rightLeg);
        this.setRotateAngle(rightLeg, -0.1309F, -0.6109F, -0.2356F);
        this.rightLeg.cubeList.add(new ModelBox(rightLeg, 32, 6, -2.5F, -0.5F, -1.0F, 3, 1, 2, 0.01F, false));

        this.rightLeg2 = new AdvancedModelRenderer(this);
        this.rightLeg2.setRotationPoint(-2.5F, 0.0F, -0.75F);
        this.rightLeg.addChild(rightLeg2);
        this.setRotateAngle(rightLeg2, 0.0F, 1.1781F, 0.0F);
        this.rightLeg2.cubeList.add(new ModelBox(rightLeg2, 34, 9, -2.75F, -0.5F, 0.5F, 3, 1, 1, -0.01F, false));
        this.rightLeg2.cubeList.add(new ModelBox(rightLeg2, 34, 11, -2.75F, -0.5F, 0.0F, 3, 1, 1, 0.0F, false));

        this.rightLeg3 = new AdvancedModelRenderer(this);
        this.rightLeg3.setRotationPoint(-2.75F, 0.225F, 0.75F);
        this.rightLeg2.addChild(rightLeg3);
        this.setRotateAngle(rightLeg3, -0.1091F, -0.829F, 0.3927F);
        this.rightLeg3.cubeList.add(new ModelBox(rightLeg3, 0, 26, -3.25F, 0.0F, -2.0F, 4, 0, 4, 0.0F, false));

        this.leftLeg = new AdvancedModelRenderer(this);
        this.leftLeg.setRotationPoint(1.25F, 0.9F, 1.7F);
        this.hips.addChild(leftLeg);
        this.setRotateAngle(leftLeg, -0.1309F, 0.6109F, 0.2356F);
        this.leftLeg.cubeList.add(new ModelBox(leftLeg, 32, 6, -0.5F, -0.5F, -1.0F, 3, 1, 2, 0.01F, true));

        this.leftLeg2 = new AdvancedModelRenderer(this);
        this.leftLeg2.setRotationPoint(2.5F, 0.0F, -0.75F);
        this.leftLeg.addChild(leftLeg2);
        this.setRotateAngle(leftLeg2, 0.0F, -1.1781F, 0.0F);
        this.leftLeg2.cubeList.add(new ModelBox(leftLeg2, 34, 9, -0.25F, -0.5F, 0.5F, 3, 1, 1, -0.01F, true));
        this.leftLeg2.cubeList.add(new ModelBox(leftLeg2, 34, 11, -0.25F, -0.5F, 0.0F, 3, 1, 1, 0.0F, true));

        this.leftLeg3 = new AdvancedModelRenderer(this);
        this.leftLeg3.setRotationPoint(2.75F, 0.225F, 0.75F);
        this.leftLeg2.addChild(leftLeg3);
        this.setRotateAngle(leftLeg3, -0.1091F, 0.829F, -0.3927F);
        this.leftLeg3.cubeList.add(new ModelBox(leftLeg3, 0, 26, -0.75F, 0.0F, -2.0F, 4, 0, 4, 0.0F, true));

        this.tail1 = new AdvancedModelRenderer(this);
        this.tail1.setRotationPoint(0.0F, 0.05F, 3.1F);
        this.hips.addChild(tail1);
        this.setRotateAngle(tail1, -0.1309F, 0.0F, 0.0F);
        this.tail1.cubeList.add(new ModelBox(tail1, 16, 18, -1.0F, -0.5F, -0.35F, 2, 2, 6, 0.0F, false));

        this.tail2 = new AdvancedModelRenderer(this);
        this.tail2.setRotationPoint(0.0F, 0.0F, 5.5F);
        this.tail1.addChild(tail2);
        this.setRotateAngle(tail2, 0.0436F, 0.0F, 0.0F);
        this.tail2.cubeList.add(new ModelBox(tail2, 0, 18, -0.5F, 0.25F, -0.35F, 1, 1, 7, 0.01F, false));
        this.tail2.cubeList.add(new ModelBox(tail2, 18, 9, -0.5F, -0.25F, -0.35F, 1, 1, 7, 0.0F, false));

        this.tail3 = new AdvancedModelRenderer(this);
        this.tail3.setRotationPoint(0.0F, 0.0F, 6.5F);
        this.tail2.addChild(tail3);
        this.setRotateAngle(tail3, 0.0873F, 0.0F, 0.0F);
        this.tail3.cubeList.add(new ModelBox(tail3, 0, 9, -0.5F, 0.0F, -0.35F, 1, 1, 8, -0.01F, false));

        this.body = new AdvancedModelRenderer(this);
        this.body.setRotationPoint(0.0F, -0.25F, -0.25F);
        this.hips.addChild(body);
        this.body.cubeList.add(new ModelBox(body, 0, 0, -2.0F, -0.75F, -5.75F, 4, 3, 6, 0.0F, false));

        this.chest = new AdvancedModelRenderer(this);
        this.chest.setRotationPoint(0.0F, 0.25F, -5.75F);
        this.body.addChild(chest);


        this.cube_r3 = new AdvancedModelRenderer(this);
        this.cube_r3.setRotationPoint(0.5F, 1.5F, -1.5F);
        this.chest.addChild(cube_r3);
        this.setRotateAngle(cube_r3, -0.0873F, 0.0F, 0.0F);
        this.cube_r3.cubeList.add(new ModelBox(cube_r3, 30, 26, -2.0F, -2.5F, -1.0F, 3, 1, 3, -0.01F, false));
        this.cube_r3.cubeList.add(new ModelBox(cube_r3, 0, 30, -2.0F, -2.0F, -1.0F, 3, 2, 3, 0.0F, false));

        this.rightArm1 = new AdvancedModelRenderer(this);
        this.rightArm1.setRotationPoint(-1.5F, 1.15F, -1.8F);
        this.chest.addChild(rightArm1);
        this.setRotateAngle(rightArm1, -0.1745F, 0.6109F, -0.5236F);
        this.rightArm1.cubeList.add(new ModelBox(rightArm1, 12, 35, -1.5F, -0.5F, -0.5F, 2, 1, 1, 0.01F, false));
        this.rightArm1.cubeList.add(new ModelBox(rightArm1, 30, 35, -1.5F, -0.5F, 0.0F, 2, 1, 1, 0.0F, false));

        this.rightArm2 = new AdvancedModelRenderer(this);
        this.rightArm2.setRotationPoint(-1.5F, 0.0F, 0.25F);
        this.rightArm1.addChild(rightArm2);
        this.setRotateAngle(rightArm2, 0.3054F, -1.6581F, 0.1309F);
        this.rightArm2.cubeList.add(new ModelBox(rightArm2, 18, 36, -1.75F, -0.5F, -0.5F, 2, 1, 1, -0.01F, false));

        this.rightArm3 = new AdvancedModelRenderer(this);
        this.rightArm3.setRotationPoint(-1.75F, 0.25F, 0.0F);
        this.rightArm2.addChild(rightArm3);
        this.setRotateAngle(rightArm3, 0.0F, 0.0F, 0.0698F);
        this.rightArm3.cubeList.add(new ModelBox(rightArm3, 20, 6, -2.25F, 0.0F, -1.5F, 3, 0, 3, 0.0F, false));

        this.leftArm1 = new AdvancedModelRenderer(this);
        this.leftArm1.setRotationPoint(1.5F, 1.15F, -1.8F);
        this.chest.addChild(leftArm1);
        this.setRotateAngle(leftArm1, -0.1745F, -0.6109F, 0.5236F);
        this.leftArm1.cubeList.add(new ModelBox(leftArm1, 12, 35, -0.5F, -0.5F, -0.5F, 2, 1, 1, 0.01F, true));
        this.leftArm1.cubeList.add(new ModelBox(leftArm1, 30, 35, -0.5F, -0.5F, 0.0F, 2, 1, 1, 0.0F, true));

        this.leftArm2 = new AdvancedModelRenderer(this);
        this.leftArm2.setRotationPoint(1.5F, 0.0F, 0.25F);
        this.leftArm1.addChild(leftArm2);
        this.setRotateAngle(leftArm2, 0.3054F, 1.6581F, -0.1309F);
        this.leftArm2.cubeList.add(new ModelBox(leftArm2, 18, 36, -0.25F, -0.5F, -0.5F, 2, 1, 1, -0.01F, true));

        this.leftArm3 = new AdvancedModelRenderer(this);
        this.leftArm3.setRotationPoint(1.75F, 0.25F, 0.0F);
        this.leftArm2.addChild(leftArm3);
        this.setRotateAngle(leftArm3, 0.0F, 0.0F, -0.0698F);
        this.leftArm3.cubeList.add(new ModelBox(leftArm3, 20, 6, -0.75F, 0.0F, -1.5F, 3, 0, 3, 0.0F, true));

        this.neck = new AdvancedModelRenderer(this);
        this.neck.setRotationPoint(0.0F, -0.25F, -2.5F);
        this.chest.addChild(neck);
        this.setRotateAngle(neck, -0.1745F, 0.0F, 0.0F);
        this.neck.cubeList.add(new ModelBox(neck, 30, 30, -1.0F, -0.9F, -2.1F, 2, 2, 3, 0.0F, false));
        this.neck.cubeList.add(new ModelBox(neck, 22, 31, -1.4F, -0.9F, -2.1F, 1, 2, 3, -0.01F, false));
        this.neck.cubeList.add(new ModelBox(neck, 22, 31, 0.4F, -0.9F, -2.1F, 1, 2, 3, -0.01F, true));

        this.neckpouch = new AdvancedModelRenderer(this);
        this.neckpouch.setRotationPoint(0.0F, 1.1F, -2.5F);
        this.neck.addChild(neckpouch);
        this.setRotateAngle(neckpouch, -0.1745F, 0.0F, 0.0F);
        this.neckpouch.cubeList.add(new ModelBox(neckpouch, 12, 31, -1.0F, -1.025F, 0.0F, 2, 1, 3, 0.01F, false));

        this.cube_r4 = new AdvancedModelRenderer(this);
        this.cube_r4.setRotationPoint(0.0F, 0.15F, 1.5F);
        this.neckpouch.addChild(cube_r4);
        this.setRotateAngle(cube_r4, 0.1745F, 0.0F, 0.0F);
        this.cube_r4.cubeList.add(new ModelBox(cube_r4, 34, 0, 0.0F, -1.0F, -1.5F, 0, 2, 3, 0.0F, false));

        this.head = new AdvancedModelRenderer(this);
        this.head.setRotationPoint(0.0F, 0.1F, -1.75F);
        this.neck.addChild(head);
        this.setRotateAngle(head, 0.1309F, 0.0F, 0.0F);
        this.head.cubeList.add(new ModelBox(head, 32, 17, -0.5F, -0.5F, -3.0F, 1, 1, 3, 0.01F, false));

        this.cube_r5 = new AdvancedModelRenderer(this);
        this.cube_r5.setRotationPoint(0.0F, -0.5F, -2.925F);
        this.head.addChild(cube_r5);
        this.setRotateAngle(cube_r5, -1.0428F, 0.0F, 0.0F);
        this.cube_r5.cubeList.add(new ModelBox(cube_r5, 10, 37, -0.5F, -1.0F, 0.0F, 1, 1, 1, 0.0F, false));

        this.cube_r6 = new AdvancedModelRenderer(this);
        this.cube_r6.setRotationPoint(0.5F, -0.025F, -1.85F);
        this.head.addChild(cube_r6);
        this.setRotateAngle(cube_r6, 0.2618F, 0.0F, 0.0F);
        this.cube_r6.cubeList.add(new ModelBox(cube_r6, 24, 36, -1.5F, -1.0F, 0.0F, 2, 1, 1, 0.0F, false));

        this.cube_r7 = new AdvancedModelRenderer(this);
        this.cube_r7.setRotationPoint(0.5F, -0.25F, -1.275F);
        this.head.addChild(cube_r7);
        this.setRotateAngle(cube_r7, -0.1265F, 0.0F, 0.0F);
        this.cube_r7.cubeList.add(new ModelBox(cube_r7, 6, 35, -1.5F, -1.0F, 0.0F, 2, 1, 1, 0.01F, false));

        this.cube_r8 = new AdvancedModelRenderer(this);
        this.cube_r8.setRotationPoint(1.025F, 0.5F, -2.15F);
        this.head.addChild(cube_r8);
        this.setRotateAngle(cube_r8, 0.0F, 0.2182F, 0.0F);
        this.cube_r8.cubeList.add(new ModelBox(cube_r8, 34, 13, -1.0F, -1.0F, 0.0F, 1, 1, 2, 0.0F, true));

        this.cube_r9 = new AdvancedModelRenderer(this);
        this.cube_r9.setRotationPoint(0.5F, 0.625F, -2.85F);
        this.head.addChild(cube_r9);
        this.setRotateAngle(cube_r9, 0.0F, 0.2923F, 0.0F);
        this.cube_r9.cubeList.add(new ModelBox(cube_r9, 36, 35, 0.0F, -1.0F, 0.0F, 0, 1, 2, 0.0F, true));

        this.cube_r10 = new AdvancedModelRenderer(this);
        this.cube_r10.setRotationPoint(0.525F, 0.5F, -3.0F);
        this.head.addChild(cube_r10);
        this.setRotateAngle(cube_r10, 0.0F, 0.5236F, 0.0F);
        this.cube_r10.cubeList.add(new ModelBox(cube_r10, 14, 37, -1.0F, -1.0F, 0.0F, 1, 1, 1, -0.01F, true));

        this.cube_r11 = new AdvancedModelRenderer(this);
        this.cube_r11.setRotationPoint(-1.025F, 0.5F, -2.15F);
        this.head.addChild(cube_r11);
        this.setRotateAngle(cube_r11, 0.0F, -0.2182F, 0.0F);
        this.cube_r11.cubeList.add(new ModelBox(cube_r11, 34, 13, 0.0F, -1.0F, 0.0F, 1, 1, 2, 0.0F, false));

        this.cube_r12 = new AdvancedModelRenderer(this);
        this.cube_r12.setRotationPoint(-0.525F, 0.5F, -3.0F);
        this.head.addChild(cube_r12);
        this.setRotateAngle(cube_r12, 0.0F, -0.5236F, 0.0F);
        this.cube_r12.cubeList.add(new ModelBox(cube_r12, 14, 37, 0.0F, -1.0F, 0.0F, 1, 1, 1, -0.01F, false));

        this.cube_r13 = new AdvancedModelRenderer(this);
        this.cube_r13.setRotationPoint(-0.5F, 0.625F, -2.85F);
        this.head.addChild(cube_r13);
        this.setRotateAngle(cube_r13, 0.0F, -0.2923F, 0.0F);
        this.cube_r13.cubeList.add(new ModelBox(cube_r13, 36, 35, 0.0F, -1.0F, 0.0F, 0, 1, 2, 0.0F, false));

        this.eyeright = new AdvancedModelRenderer(this);
        this.eyeright.setRotationPoint(-0.225F, -0.325F, -1.5F);
        this.head.addChild(eyeright);
        this.setRotateAngle(eyeright, 0.0873F, -0.1745F, 0.1745F);
        this.eyeright.cubeList.add(new ModelBox(eyeright, 30, 37, -1.0F, -0.75F, -0.5F, 1, 1, 1, 0.0F, false));

        this.eyeleft = new AdvancedModelRenderer(this);
        this.eyeleft.setRotationPoint(0.225F, -0.325F, -1.5F);
        this.head.addChild(eyeleft);
        this.setRotateAngle(eyeleft, 0.0873F, 0.1745F, -0.1745F);
        this.eyeleft.cubeList.add(new ModelBox(eyeleft, 30, 37, 0.0F, -0.75F, -0.5F, 1, 1, 1, 0.0F, true));

        this.jaw = new AdvancedModelRenderer(this);
        this.jaw.setRotationPoint(0.0F, 0.5F, 0.0F);
        this.head.addChild(jaw);
        this.setRotateAngle(jaw, -0.0436F, 0.0F, 0.0F);
        this.jaw.cubeList.add(new ModelBox(jaw, 32, 21, -0.5F, -0.5F, -2.9F, 1, 1, 3, 0.0F, false));

        this.cube_r14 = new AdvancedModelRenderer(this);
        this.cube_r14.setRotationPoint(0.5F, 0.5F, -2.9F);
        this.jaw.addChild(cube_r14);
        this.setRotateAngle(cube_r14, 0.0F, 0.5105F, 0.0F);
        this.cube_r14.cubeList.add(new ModelBox(cube_r14, 0, 38, -1.0F, -1.0F, 0.0F, 1, 1, 1, -0.01F, true));

        this.cube_r15 = new AdvancedModelRenderer(this);
        this.cube_r15.setRotationPoint(0.5F, 0.375F, -2.85F);
        this.jaw.addChild(cube_r15);
        this.setRotateAngle(cube_r15, 0.0F, 0.2923F, 0.0F);
        this.cube_r15.cubeList.add(new ModelBox(cube_r15, 6, 37, 0.0F, -1.0F, 0.0F, 0, 1, 2, 0.0F, true));

        this.cube_r16 = new AdvancedModelRenderer(this);
        this.cube_r16.setRotationPoint(1.0F, 0.5F, -2.05F);
        this.jaw.addChild(cube_r16);
        this.setRotateAngle(cube_r16, 0.0F, 0.2007F, 0.0F);
        this.cube_r16.cubeList.add(new ModelBox(cube_r16, 0, 35, -1.0F, -1.0F, 0.0F, 1, 1, 2, -0.02F, true));

        this.cube_r17 = new AdvancedModelRenderer(this);
        this.cube_r17.setRotationPoint(-1.0F, 0.5F, -2.05F);
        this.jaw.addChild(cube_r17);
        this.setRotateAngle(cube_r17, 0.0F, -0.2007F, 0.0F);
        this.cube_r17.cubeList.add(new ModelBox(cube_r17, 0, 35, 0.0F, -1.0F, 0.0F, 1, 1, 2, -0.02F, false));

        this.cube_r18 = new AdvancedModelRenderer(this);
        this.cube_r18.setRotationPoint(-0.5F, 0.375F, -2.85F);
        this.jaw.addChild(cube_r18);
        this.setRotateAngle(cube_r18, 0.0F, -0.2923F, 0.0F);
        this.cube_r18.cubeList.add(new ModelBox(cube_r18, 6, 37, 0.0F, -1.0F, 0.0F, 0, 1, 2, 0.0F, false));

        this.cube_r19 = new AdvancedModelRenderer(this);
        this.cube_r19.setRotationPoint(-0.5F, 0.5F, -2.9F);
        this.jaw.addChild(cube_r19);
        this.setRotateAngle(cube_r19, 0.0F, -0.5105F, 0.0F);
        this.cube_r19.cubeList.add(new ModelBox(cube_r19, 0, 38, 0.0F, -1.0F, 0.0F, 1, 1, 1, -0.01F, false));

        updateDefaultPose();
        animator = ModelAnimator.create();
    }

    @Override
    public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        animate((IAnimatedEntity) entity, f, f1, f2, f3, f4, f5);
        //this.base.offsetZ = this.base.offsetZ + 0.7F;
        this.hips.render(f5);
    }

    public void renderStaticFloor(float f) {
        this.resetToDefaultPose();
    }

    @Override
    public void renderStaticBook(float f) {
        //Rotations, positions and sizing:
        this.hips.offsetY = -2.6F;
        this.hips.offsetX = 0.6F;
        this.hips.offsetZ = 2.0F;
        this.hips.rotateAngleY = (float)Math.toRadians(120);
        this.hips.rotateAngleX = (float)Math.toRadians(0);
        this.hips.rotateAngleZ = (float)Math.toRadians(0);
        this.hips.scaleChildren = true;
        float scaler = 4.0F;
        this.hips.setScale(scaler, scaler, scaler);
        //Start of pose:
        this.setRotateAngle(hips, 0.4F, 3.8F, -0.2F);
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
    public void setLivingAnimations(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime) {
        super.setLivingAnimations(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime);
        this.resetToDefaultPose();
        EntityPrehistoricFloraKuwajimalla ee = (EntityPrehistoricFloraKuwajimalla) entitylivingbaseIn;

        if(ee.getIsMoving()) {
            if (ee.getIsFast()) {
                animRun(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime);
            } else {
                animWalk(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime);
            }
        }

        if (ee.getAnimation() == ee.STAND_ANIMATION) {
            animIdle(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime, ee.getAnimationTick());
        }


        }

    public void animIdle(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime, double animTick) {
        EntityPrehistoricFloraKuwajimalla entity = (EntityPrehistoricFloraKuwajimalla) entitylivingbaseIn;
        int animCycle = 44;
        double tickAnim = animTick + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;


        this.leftArm1.rotationPointX = this.leftArm1.rotationPointX + (float)(0);
        this.leftArm1.rotationPointY = this.leftArm1.rotationPointY - (float)(0);
        this.leftArm1.rotationPointZ = this.leftArm1.rotationPointZ + (float)(-0.175);



        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 0) / 10) * (-6.59542-(0)));
            yy = 0 + (((tickAnim - 0) / 10) * (-6.26263-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (1.744-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 18) {
            xx = -6.59542 + (((tickAnim - 10) / 8) * (-6.59542-(-6.59542)));
            yy = -6.26263 + (((tickAnim - 10) / 8) * (-6.26263-(-6.26263)));
            zz = 1.744 + (((tickAnim - 10) / 8) * (1.744-(1.744)));
        }
        else if (tickAnim >= 18 && tickAnim < 28) {
            xx = -6.59542 + (((tickAnim - 18) / 10) * (-6-(-6.59542)));
            yy = -6.26263 + (((tickAnim - 18) / 10) * (6-(-6.26263)));
            zz = 1.744 + (((tickAnim - 18) / 10) * (0-(1.744)));
        }
        else if (tickAnim >= 28 && tickAnim < 37) {
            xx = -6 + (((tickAnim - 28) / 9) * (-6-(-6)));
            yy = 6 + (((tickAnim - 28) / 9) * (6-(6)));
            zz = 0 + (((tickAnim - 28) / 9) * (0-(0)));
        }
        else if (tickAnim >= 37 && tickAnim < 44) {
            xx = -6 + (((tickAnim - 37) / 7) * (0-(-6)));
            yy = 6 + (((tickAnim - 37) / 7) * (0-(6)));
            zz = 0 + (((tickAnim - 37) / 7) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck, neck.rotateAngleX + (float) Math.toRadians(xx), neck.rotateAngleY + (float) Math.toRadians(yy), neck.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 0) / 8) * (4-(0)));
            yy = 0 + (((tickAnim - 0) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 8) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 10) {
            xx = 4 + (((tickAnim - 8) / 2) * (0-(4)));
            yy = 0 + (((tickAnim - 8) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 2) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 10) / 3) * (4-(0)));
            yy = 0 + (((tickAnim - 10) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 3) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 16) {
            xx = 4 + (((tickAnim - 13) / 3) * (0-(4)));
            yy = 0 + (((tickAnim - 13) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 13) / 3) * (0-(0)));
        }
        else if (tickAnim >= 16 && tickAnim < 27) {
            xx = 0 + (((tickAnim - 16) / 11) * (4-(0)));
            yy = 0 + (((tickAnim - 16) / 11) * (0-(0)));
            zz = 0 + (((tickAnim - 16) / 11) * (0-(0)));
        }
        else if (tickAnim >= 27 && tickAnim < 29) {
            xx = 4 + (((tickAnim - 27) / 2) * (0-(4)));
            yy = 0 + (((tickAnim - 27) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 27) / 2) * (0-(0)));
        }
        else if (tickAnim >= 29 && tickAnim < 33) {
            xx = 0 + (((tickAnim - 29) / 4) * (4-(0)));
            yy = 0 + (((tickAnim - 29) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 29) / 4) * (0-(0)));
        }
        else if (tickAnim >= 33 && tickAnim < 36) {
            xx = 4 + (((tickAnim - 33) / 3) * (0-(4)));
            yy = 0 + (((tickAnim - 33) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 33) / 3) * (0-(0)));
        }
        else if (tickAnim >= 36 && tickAnim < 44) {
            xx = 0 + (((tickAnim - 36) / 8) * (0-(0)));
            yy = 0 + (((tickAnim - 36) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 36) / 8) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neckpouch, neckpouch.rotateAngleX + (float) Math.toRadians(xx), neckpouch.rotateAngleY + (float) Math.toRadians(yy), neckpouch.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 0) / 10) * (-4-(0)));
            yy = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (-5.5-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 18) {
            xx = -4 + (((tickAnim - 10) / 8) * (-4-(-4)));
            yy = 0 + (((tickAnim - 10) / 8) * (0-(0)));
            zz = -5.5 + (((tickAnim - 10) / 8) * (-5.5-(-5.5)));
        }
        else if (tickAnim >= 18 && tickAnim < 28) {
            xx = -4 + (((tickAnim - 18) / 10) * (0.01591-(-4)));
            yy = 0 + (((tickAnim - 18) / 10) * (3.71787-(0)));
            zz = -5.5 + (((tickAnim - 18) / 10) * (12.74016-(-5.5)));
        }
        else if (tickAnim >= 28 && tickAnim < 37) {
            xx = 0.01591 + (((tickAnim - 28) / 9) * (0.01591-(0.01591)));
            yy = 3.71787 + (((tickAnim - 28) / 9) * (3.71787-(3.71787)));
            zz = 12.74016 + (((tickAnim - 28) / 9) * (12.74016-(12.74016)));
        }
        else if (tickAnim >= 37 && tickAnim < 44) {
            xx = 0.01591 + (((tickAnim - 37) / 7) * (0-(0.01591)));
            yy = 3.71787 + (((tickAnim - 37) / 7) * (0-(3.71787)));
            zz = 12.74016 + (((tickAnim - 37) / 7) * (0-(12.74016)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(head, head.rotateAngleX + (float) Math.toRadians(xx), head.rotateAngleY + (float) Math.toRadians(yy), head.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 14) {
            xx = 0 + (((tickAnim - 10) / 4) * (0-(0)));
            yy = 0 + (((tickAnim - 10) / 4) * (0.225-(0)));
            zz = 0 + (((tickAnim - 10) / 4) * (0-(0)));
        }
        else if (tickAnim >= 14 && tickAnim < 18) {
            xx = 0 + (((tickAnim - 14) / 4) * (0-(0)));
            yy = 0.225 + (((tickAnim - 14) / 4) * (0-(0.225)));
            zz = 0 + (((tickAnim - 14) / 4) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.eyeright.rotationPointX = this.eyeright.rotationPointX + (float)(xx);
        this.eyeright.rotationPointY = this.eyeright.rotationPointY - (float)(yy);
        this.eyeright.rotationPointZ = this.eyeright.rotationPointZ + (float)(zz);


        if (tickAnim >= 10 && tickAnim < 14) {
            xx = 1 + (((tickAnim - 10) / 4) * (1-(1)));
            yy = 1 + (((tickAnim - 10) / 4) * (0.01-(1)));
            zz = 1 + (((tickAnim - 10) / 4) * (1-(1)));
        }
        else if (tickAnim >= 14 && tickAnim < 18) {
            xx = 1 + (((tickAnim - 14) / 4) * (1-(1)));
            yy = 0.01 + (((tickAnim - 14) / 4) * (1-(0.01)));
            zz = 1 + (((tickAnim - 14) / 4) * (1-(1)));
        }
        else {
            xx = 1;
            yy = 1;
            zz = 1;
        }
        this.eyeright.setScale((float)xx, (float)yy, (float)zz);




        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 14) {
            xx = 0 + (((tickAnim - 10) / 4) * (0-(0)));
            yy = 0 + (((tickAnim - 10) / 4) * (0.225-(0)));
            zz = 0 + (((tickAnim - 10) / 4) * (0-(0)));
        }
        else if (tickAnim >= 14 && tickAnim < 18) {
            xx = 0 + (((tickAnim - 14) / 4) * (0-(0)));
            yy = 0.225 + (((tickAnim - 14) / 4) * (0-(0.225)));
            zz = 0 + (((tickAnim - 14) / 4) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.eyeleft.rotationPointX = this.eyeleft.rotationPointX + (float)(xx);
        this.eyeleft.rotationPointY = this.eyeleft.rotationPointY - (float)(yy);
        this.eyeleft.rotationPointZ = this.eyeleft.rotationPointZ + (float)(zz);


        if (tickAnim >= 10 && tickAnim < 14) {
            xx = 1 + (((tickAnim - 10) / 4) * (1-(1)));
            yy = 1 + (((tickAnim - 10) / 4) * (0.01-(1)));
            zz = 1 + (((tickAnim - 10) / 4) * (1-(1)));
        }
        else if (tickAnim >= 14 && tickAnim < 18) {
            xx = 1 + (((tickAnim - 14) / 4) * (1-(1)));
            yy = 0.01 + (((tickAnim - 14) / 4) * (1-(0.01)));
            zz = 1 + (((tickAnim - 14) / 4) * (1-(1)));
        }
        else {
            xx = 1;
            yy = 1;
            zz = 1;
        }
        this.eyeleft.setScale((float)xx, (float)yy, (float)zz);

    }
    public void animRun(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime) {
        EntityPrehistoricFloraKuwajimalla entity = (EntityPrehistoricFloraKuwajimalla) entitylivingbaseIn;
        int animCycle = 10;

        if (entity.animSpeedAdder() <= 0) {
            partialTickTime = 0; //If it's static don't increment partial ticks either
        }
        double tickAnim = (entity.ticksExistedAnimated + entity.getTickOffset()) - (int) (Math.floor((double) (entity.ticksExistedAnimated + entity.getTickOffset()) / (double) animCycle) * (double) animCycle) + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;
        this.setRotateAngle(hips, hips.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*720/0.5))*1), hips.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/0.5-90))*15), hips.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/0.5-90))*5));
        this.hips.rotationPointX = this.hips.rotationPointX + (float)(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/0.5))*1.5);
        this.hips.rotationPointY = this.hips.rotationPointY - (float)(0);
        this.hips.rotationPointZ = this.hips.rotationPointZ + (float)(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/0.25))*0.5);



        if (tickAnim >= 0 && tickAnim < 4) {
            xx = -0.89746 + (((tickAnim - 0) / 4) * (0-(-0.89746)));
            yy = -7.11171 + (((tickAnim - 0) / 4) * (61-(-7.11171)));
            zz = 1.33652 + (((tickAnim - 0) / 4) * (0-(1.33652)));
        }
        else if (tickAnim >= 4 && tickAnim < 7) {
            xx = 0 + (((tickAnim - 4) / 3) * (-0.79961-(0)));
            yy = 61 + (((tickAnim - 4) / 3) * (33.14956-(61)));
            zz = 0 + (((tickAnim - 4) / 3) * (9.98712-(0)));
        }
        else if (tickAnim >= 7 && tickAnim < 10) {
            xx = -0.79961 + (((tickAnim - 7) / 3) * (-0.89746-(-0.79961)));
            yy = 33.14956 + (((tickAnim - 7) / 3) * (-7.11171-(33.14956)));
            zz = 9.98712 + (((tickAnim - 7) / 3) * (1.33652-(9.98712)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightLeg, rightLeg.rotateAngleX + (float) Math.toRadians(xx), rightLeg.rotateAngleY + (float) Math.toRadians(yy), rightLeg.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 4) {
            xx = 0 + (((tickAnim - 0) / 4) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 4) * (0-(0)));
        }
        else if (tickAnim >= 4 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 4) / 6) * (0-(0)));
            yy = 0 + (((tickAnim - 4) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 4) / 6) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.rightLeg.rotationPointX = this.rightLeg.rotationPointX + (float)(xx);
        this.rightLeg.rotationPointY = this.rightLeg.rotationPointY - (float)(yy);
        this.rightLeg.rotationPointZ = this.rightLeg.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 4) {
            xx = 1.78185 + (((tickAnim - 0) / 4) * (0-(1.78185)));
            yy = -50.33949 + (((tickAnim - 0) / 4) * (-35.25-(-50.33949)));
            zz = 6.01887 + (((tickAnim - 0) / 4) * (0-(6.01887)));
        }
        else if (tickAnim >= 4 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 4) / 6) * (1.78185-(0)));
            yy = -35.25 + (((tickAnim - 4) / 6) * (-50.33949-(-35.25)));
            zz = 0 + (((tickAnim - 4) / 6) * (6.01887-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightLeg2, rightLeg2.rotateAngleX + (float) Math.toRadians(xx), rightLeg2.rotateAngleY + (float) Math.toRadians(yy), rightLeg2.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 4) {
            xx = 0 + (((tickAnim - 0) / 4) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 4) * (0-(0)));
        }
        else if (tickAnim >= 4 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 4) / 6) * (0-(0)));
            yy = 0 + (((tickAnim - 4) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 4) / 6) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.rightLeg2.rotationPointX = this.rightLeg2.rotationPointX + (float)(xx);
        this.rightLeg2.rotationPointY = this.rightLeg2.rotationPointY - (float)(yy);
        this.rightLeg2.rotationPointZ = this.rightLeg2.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 2) {
            xx = 27.7898 + (((tickAnim - 0) / 2) * (7.97017-(27.7898)));
            yy = 5.05281 + (((tickAnim - 0) / 2) * (8.45968-(5.05281)));
            zz = -25.29294 + (((tickAnim - 0) / 2) * (-10.28049-(-25.29294)));
        }
        else if (tickAnim >= 2 && tickAnim < 4) {
            xx = 7.97017 + (((tickAnim - 2) / 2) * (35.68203-(7.97017)));
            yy = 8.45968 + (((tickAnim - 2) / 2) * (17.67877-(8.45968)));
            zz = -10.28049 + (((tickAnim - 2) / 2) * (-11.87511-(-10.28049)));
        }
        else if (tickAnim >= 4 && tickAnim < 8) {
            xx = 35.68203 + (((tickAnim - 4) / 4) * (18.54472-(35.68203)));
            yy = 17.67877 + (((tickAnim - 4) / 4) * (8.66022-(17.67877)));
            zz = -11.87511 + (((tickAnim - 4) / 4) * (-21.45927-(-11.87511)));
        }
        else if (tickAnim >= 8 && tickAnim < 10) {
            xx = 18.54472 + (((tickAnim - 8) / 2) * (27.7898-(18.54472)));
            yy = 8.66022 + (((tickAnim - 8) / 2) * (5.05281-(8.66022)));
            zz = -21.45927 + (((tickAnim - 8) / 2) * (-25.29294-(-21.45927)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightLeg3, rightLeg3.rotateAngleX + (float) Math.toRadians(xx), rightLeg3.rotateAngleY + (float) Math.toRadians(yy), rightLeg3.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 1) {
            xx = 0 + (((tickAnim - 0) / 1) * (0-(0)));
            yy = 0.075 + (((tickAnim - 0) / 1) * (0.335-(0.075)));
            zz = 0 + (((tickAnim - 0) / 1) * (0-(0)));
        }
        else if (tickAnim >= 1 && tickAnim < 2) {
            xx = 0 + (((tickAnim - 1) / 1) * (0-(0)));
            yy = 0.335 + (((tickAnim - 1) / 1) * (0.35-(0.335)));
            zz = 0 + (((tickAnim - 1) / 1) * (0-(0)));
        }
        else if (tickAnim >= 2 && tickAnim < 4) {
            xx = 0 + (((tickAnim - 2) / 2) * (0-(0)));
            yy = 0.35 + (((tickAnim - 2) / 2) * (0-(0.35)));
            zz = 0 + (((tickAnim - 2) / 2) * (0-(0)));
        }
        else if (tickAnim >= 4 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 4) / 6) * (0-(0)));
            yy = 0 + (((tickAnim - 4) / 6) * (0.075-(0)));
            zz = 0 + (((tickAnim - 4) / 6) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.rightLeg3.rotationPointX = this.rightLeg3.rotationPointX + (float)(xx);
        this.rightLeg3.rotationPointY = this.rightLeg3.rotationPointY - (float)(yy);
        this.rightLeg3.rotationPointZ = this.rightLeg3.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 2) {
            xx = 0 + (((tickAnim - 0) / 2) * (-0.4318-(0)));
            yy = -61 + (((tickAnim - 0) / 2) * (-34.37377-(-61)));
            zz = 0 + (((tickAnim - 0) / 2) * (-4.99252-(0)));
        }
        else if (tickAnim >= 2 && tickAnim < 4) {
            xx = -0.4318 + (((tickAnim - 2) / 2) * (-0.89746-(-0.4318)));
            yy = -34.37377 + (((tickAnim - 2) / 2) * (7.11171-(-34.37377)));
            zz = -4.99252 + (((tickAnim - 2) / 2) * (-1.33652-(-4.99252)));
        }
        else if (tickAnim >= 4 && tickAnim < 10) {
            xx = -0.89746 + (((tickAnim - 4) / 6) * (0-(-0.89746)));
            yy = 7.11171 + (((tickAnim - 4) / 6) * (-61-(7.11171)));
            zz = -1.33652 + (((tickAnim - 4) / 6) * (0-(-1.33652)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftLeg, leftLeg.rotateAngleX + (float) Math.toRadians(xx), leftLeg.rotateAngleY + (float) Math.toRadians(yy), leftLeg.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 4) {
            xx = 0 + (((tickAnim - 0) / 4) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 4) * (0-(0)));
        }
        else if (tickAnim >= 4 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 4) / 6) * (0-(0)));
            yy = 0 + (((tickAnim - 4) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 4) / 6) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.leftLeg.rotationPointX = this.leftLeg.rotationPointX + (float)(xx);
        this.leftLeg.rotationPointY = this.leftLeg.rotationPointY - (float)(yy);
        this.leftLeg.rotationPointZ = this.leftLeg.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 4) {
            xx = 0 + (((tickAnim - 0) / 4) * (1.78185-(0)));
            yy = 35.25 + (((tickAnim - 0) / 4) * (50.33949-(35.25)));
            zz = 0 + (((tickAnim - 0) / 4) * (-6.01887-(0)));
        }
        else if (tickAnim >= 4 && tickAnim < 10) {
            xx = 1.78185 + (((tickAnim - 4) / 6) * (0-(1.78185)));
            yy = 50.33949 + (((tickAnim - 4) / 6) * (35.25-(50.33949)));
            zz = -6.01887 + (((tickAnim - 4) / 6) * (0-(-6.01887)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftLeg2, leftLeg2.rotateAngleX + (float) Math.toRadians(xx), leftLeg2.rotateAngleY + (float) Math.toRadians(yy), leftLeg2.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 4) {
            xx = 0 + (((tickAnim - 0) / 4) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 4) * (0-(0)));
        }
        else if (tickAnim >= 4 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 4) / 6) * (0-(0)));
            yy = 0 + (((tickAnim - 4) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 4) / 6) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.leftLeg2.rotationPointX = this.leftLeg2.rotationPointX + (float)(xx);
        this.leftLeg2.rotationPointY = this.leftLeg2.rotationPointY - (float)(yy);
        this.leftLeg2.rotationPointZ = this.leftLeg2.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 35.68203 + (((tickAnim - 0) / 3) * (27.19526-(35.68203)));
            yy = -17.67877 + (((tickAnim - 0) / 3) * (-6.54606-(-17.67877)));
            zz = 11.87511 + (((tickAnim - 0) / 3) * (19.25991-(11.87511)));
        }
        else if (tickAnim >= 3 && tickAnim < 4) {
            xx = 27.19526 + (((tickAnim - 3) / 1) * (27.7898-(27.19526)));
            yy = -6.54606 + (((tickAnim - 3) / 1) * (-5.05281-(-6.54606)));
            zz = 19.25991 + (((tickAnim - 3) / 1) * (25.29294-(19.25991)));
        }
        else if (tickAnim >= 4 && tickAnim < 7) {
            xx = 27.7898 + (((tickAnim - 4) / 3) * (12.76724-(27.7898)));
            yy = -5.05281 + (((tickAnim - 4) / 3) * (-8.91853-(-5.05281)));
            zz = 25.29294 + (((tickAnim - 4) / 3) * (9.92501-(25.29294)));
        }
        else if (tickAnim >= 7 && tickAnim < 10) {
            xx = 12.76724 + (((tickAnim - 7) / 3) * (35.68203-(12.76724)));
            yy = -8.91853 + (((tickAnim - 7) / 3) * (-17.67877-(-8.91853)));
            zz = 9.92501 + (((tickAnim - 7) / 3) * (11.87511-(9.92501)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftLeg3, leftLeg3.rotateAngleX + (float) Math.toRadians(xx), leftLeg3.rotateAngleY + (float) Math.toRadians(yy), leftLeg3.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 4) {
            xx = 0 + (((tickAnim - 0) / 4) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 4) * (0.075-(0)));
            zz = 0 + (((tickAnim - 0) / 4) * (0-(0)));
        }
        else if (tickAnim >= 4 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 4) / 1) * (0-(0)));
            yy = 0.075 + (((tickAnim - 4) / 1) * (0.425-(0.075)));
            zz = 0 + (((tickAnim - 4) / 1) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 7) {
            xx = 0 + (((tickAnim - 5) / 2) * (0-(0)));
            yy = 0.425 + (((tickAnim - 5) / 2) * (0.315-(0.425)));
            zz = 0 + (((tickAnim - 5) / 2) * (0-(0)));
        }
        else if (tickAnim >= 7 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 7) / 3) * (0-(0)));
            yy = 0.315 + (((tickAnim - 7) / 3) * (0-(0.315)));
            zz = 0 + (((tickAnim - 7) / 3) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.leftLeg3.rotationPointX = this.leftLeg3.rotationPointX + (float)(xx);
        this.leftLeg3.rotationPointY = this.leftLeg3.rotationPointY - (float)(yy);
        this.leftLeg3.rotationPointZ = this.leftLeg3.rotationPointZ + (float)(zz);



        this.setRotateAngle(tail1, tail1.rotateAngleX + (float) Math.toRadians(0), tail1.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/0.5-50))*-15), tail1.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(tail2, tail2.rotateAngleX + (float) Math.toRadians(0), tail2.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/0.5))*-15), tail2.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(tail3, tail3.rotateAngleX + (float) Math.toRadians(0), tail3.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/0.5-50))*-18), tail3.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(body, body.rotateAngleX + (float) Math.toRadians(0), body.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/0.5-120))*-15), body.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(chest, chest.rotateAngleX + (float) Math.toRadians(0), chest.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/0.5-150))*-15), chest.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/0.5+90))*4));



        if (tickAnim >= 0 && tickAnim < 2) {
            xx = 78.01294 + (((tickAnim - 0) / 2) * (53.73229-(78.01294)));
            yy = 23.0319 + (((tickAnim - 0) / 2) * (-25.62928-(23.0319)));
            zz = 33.45873 + (((tickAnim - 0) / 2) * (44.40492-(33.45873)));
        }
        else if (tickAnim >= 2 && tickAnim < 4) {
            xx = 53.73229 + (((tickAnim - 2) / 2) * (7.61792-(53.73229)));
            yy = -25.62928 + (((tickAnim - 2) / 2) * (-67.63081-(-25.62928)));
            zz = 44.40492 + (((tickAnim - 2) / 2) * (25.09184-(44.40492)));
        }
        else if (tickAnim >= 4 && tickAnim < 10) {
            xx = 7.61792 + (((tickAnim - 4) / 6) * (78.01294-(7.61792)));
            yy = -67.63081 + (((tickAnim - 4) / 6) * (23.0319-(-67.63081)));
            zz = 25.09184 + (((tickAnim - 4) / 6) * (33.45873-(25.09184)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightArm1, rightArm1.rotateAngleX + (float) Math.toRadians(xx), rightArm1.rotateAngleY + (float) Math.toRadians(yy), rightArm1.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 4) {
            xx = 0 + (((tickAnim - 0) / 4) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 4) * (0-(0)));
        }
        else if (tickAnim >= 4 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 4) / 6) * (0-(0)));
            yy = 0 + (((tickAnim - 4) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 4) / 6) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.rightArm1.rotationPointX = this.rightArm1.rotationPointX + (float)(xx);
        this.rightArm1.rotationPointY = this.rightArm1.rotationPointY - (float)(yy);
        this.rightArm1.rotationPointZ = this.rightArm1.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 3) {
            xx = -0.64435 + (((tickAnim - 0) / 3) * (2.5672-(-0.64435)));
            yy = 99.83321 + (((tickAnim - 0) / 3) * (57.95977-(99.83321)));
            zz = -17.91804 + (((tickAnim - 0) / 3) * (-19.29782-(-17.91804)));
        }
        else if (tickAnim >= 3 && tickAnim < 4) {
            xx = 2.5672 + (((tickAnim - 3) / 1) * (10.52734-(2.5672)));
            yy = 57.95977 + (((tickAnim - 3) / 1) * (51.76512-(57.95977)));
            zz = -19.29782 + (((tickAnim - 3) / 1) * (-31.99332-(-19.29782)));
        }
        else if (tickAnim >= 4 && tickAnim < 10) {
            xx = 10.52734 + (((tickAnim - 4) / 6) * (-0.64435-(10.52734)));
            yy = 51.76512 + (((tickAnim - 4) / 6) * (99.83321-(51.76512)));
            zz = -31.99332 + (((tickAnim - 4) / 6) * (-17.91804-(-31.99332)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightArm2, rightArm2.rotateAngleX + (float) Math.toRadians(xx), rightArm2.rotateAngleY + (float) Math.toRadians(yy), rightArm2.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 4) {
            xx = 0 + (((tickAnim - 0) / 4) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 4) * (0-(0)));
        }
        else if (tickAnim >= 4 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 4) / 6) * (0-(0)));
            yy = 0 + (((tickAnim - 4) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 4) / 6) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.rightArm2.rotationPointX = this.rightArm2.rotationPointX + (float)(xx);
        this.rightArm2.rotationPointY = this.rightArm2.rotationPointY - (float)(yy);
        this.rightArm2.rotationPointZ = this.rightArm2.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 0 + (((tickAnim - 0) / 3) * (-6.19901-(0)));
            yy = 0 + (((tickAnim - 0) / 3) * (-0.09149-(0)));
            zz = -15.75 + (((tickAnim - 0) / 3) * (6.65419-(-15.75)));
        }
        else if (tickAnim >= 3 && tickAnim < 4) {
            xx = -6.19901 + (((tickAnim - 3) / 1) * (-5.24876-(-6.19901)));
            yy = -0.09149 + (((tickAnim - 3) / 1) * (-0.11437-(-0.09149)));
            zz = 6.65419 + (((tickAnim - 3) / 1) * (12.25524-(6.65419)));
        }
        else if (tickAnim >= 4 && tickAnim < 5) {
            xx = -5.24876 + (((tickAnim - 4) / 1) * (-10.88511-(-5.24876)));
            yy = -0.11437 + (((tickAnim - 4) / 1) * (1.01133-(-0.11437)));
            zz = 12.25524 + (((tickAnim - 4) / 1) * (22.46192-(12.25524)));
        }
        else if (tickAnim >= 5 && tickAnim < 7) {
            xx = -10.88511 + (((tickAnim - 5) / 2) * (-38.05494-(-10.88511)));
            yy = 1.01133 + (((tickAnim - 5) / 2) * (14.43356-(1.01133)));
            zz = 22.46192 + (((tickAnim - 5) / 2) * (29.92114-(22.46192)));
        }
        else if (tickAnim >= 7 && tickAnim < 10) {
            xx = -38.05494 + (((tickAnim - 7) / 3) * (0-(-38.05494)));
            yy = 14.43356 + (((tickAnim - 7) / 3) * (0-(14.43356)));
            zz = 29.92114 + (((tickAnim - 7) / 3) * (-15.75-(29.92114)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightArm3, rightArm3.rotateAngleX + (float) Math.toRadians(xx), rightArm3.rotateAngleY + (float) Math.toRadians(yy), rightArm3.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 4) {
            xx = 0 + (((tickAnim - 0) / 4) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 4) * (-0.175-(0)));
            zz = 0 + (((tickAnim - 0) / 4) * (0-(0)));
        }
        else if (tickAnim >= 4 && tickAnim < 6) {
            xx = 0 + (((tickAnim - 4) / 2) * (0-(0)));
            yy = -0.175 + (((tickAnim - 4) / 2) * (0.065-(-0.175)));
            zz = 0 + (((tickAnim - 4) / 2) * (0-(0)));
        }
        else if (tickAnim >= 6 && tickAnim < 7) {
            xx = 0 + (((tickAnim - 6) / 1) * (0-(0)));
            yy = 0.065 + (((tickAnim - 6) / 1) * (0-(0.065)));
            zz = 0 + (((tickAnim - 6) / 1) * (0-(0)));
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
        this.rightArm3.rotationPointX = this.rightArm3.rotationPointX + (float)(xx);
        this.rightArm3.rotationPointY = this.rightArm3.rotationPointY - (float)(yy);
        this.rightArm3.rotationPointZ = this.rightArm3.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 4) {
            xx = 7.61792 + (((tickAnim - 0) / 4) * (78.01294-(7.61792)));
            yy = 67.63081 + (((tickAnim - 0) / 4) * (-23.0319-(67.63081)));
            zz = -25.09184 + (((tickAnim - 0) / 4) * (-33.45873-(-25.09184)));
        }
        else if (tickAnim >= 4 && tickAnim < 6) {
            xx = 78.01294 + (((tickAnim - 4) / 2) * (63.4993-(78.01294)));
            yy = -23.0319 + (((tickAnim - 4) / 2) * (17.64618-(-23.0319)));
            zz = -33.45873 + (((tickAnim - 4) / 2) * (-44.28747-(-33.45873)));
        }
        else if (tickAnim >= 6 && tickAnim < 10) {
            xx = 63.4993 + (((tickAnim - 6) / 4) * (7.61792-(63.4993)));
            yy = 17.64618 + (((tickAnim - 6) / 4) * (67.63081-(17.64618)));
            zz = -44.28747 + (((tickAnim - 6) / 4) * (-25.09184-(-44.28747)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftArm1, leftArm1.rotateAngleX + (float) Math.toRadians(xx), leftArm1.rotateAngleY + (float) Math.toRadians(yy), leftArm1.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 4) {
            xx = 0 + (((tickAnim - 0) / 4) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 4) * (0-(0)));
        }
        else if (tickAnim >= 4 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 4) / 6) * (0-(0)));
            yy = 0 + (((tickAnim - 4) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 4) / 6) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.leftArm1.rotationPointX = this.leftArm1.rotationPointX + (float)(xx);
        this.leftArm1.rotationPointY = this.leftArm1.rotationPointY - (float)(yy);
        this.leftArm1.rotationPointZ = this.leftArm1.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 4) {
            xx = 10.52734 + (((tickAnim - 0) / 4) * (-0.64435-(10.52734)));
            yy = -51.76512 + (((tickAnim - 0) / 4) * (-99.83321-(-51.76512)));
            zz = 31.99332 + (((tickAnim - 0) / 4) * (17.91804-(31.99332)));
        }
        else if (tickAnim >= 4 && tickAnim < 8) {
            xx = -0.64435 + (((tickAnim - 4) / 4) * (-0.43972-(-0.64435)));
            yy = -99.83321 + (((tickAnim - 4) / 4) * (-67.51476-(-99.83321)));
            zz = 17.91804 + (((tickAnim - 4) / 4) * (11.44947-(17.91804)));
        }
        else if (tickAnim >= 8 && tickAnim < 10) {
            xx = -0.43972 + (((tickAnim - 8) / 2) * (10.52734-(-0.43972)));
            yy = -67.51476 + (((tickAnim - 8) / 2) * (-51.76512-(-67.51476)));
            zz = 11.44947 + (((tickAnim - 8) / 2) * (31.99332-(11.44947)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftArm2, leftArm2.rotateAngleX + (float) Math.toRadians(xx), leftArm2.rotateAngleY + (float) Math.toRadians(yy), leftArm2.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 4) {
            xx = 0 + (((tickAnim - 0) / 4) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 4) * (0-(0)));
        }
        else if (tickAnim >= 4 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 4) / 6) * (0-(0)));
            yy = 0 + (((tickAnim - 4) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 4) / 6) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.leftArm2.rotationPointX = this.leftArm2.rotationPointX + (float)(xx);
        this.leftArm2.rotationPointY = this.leftArm2.rotationPointY - (float)(yy);
        this.leftArm2.rotationPointZ = this.leftArm2.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 1) {
            xx = -5.24876 + (((tickAnim - 0) / 1) * (-18.71648-(-5.24876)));
            yy = 0.11437 + (((tickAnim - 0) / 1) * (-5.31293-(0.11437)));
            zz = -12.25524 + (((tickAnim - 0) / 1) * (-25.18792-(-12.25524)));
        }
        else if (tickAnim >= 1 && tickAnim < 2) {
            xx = -18.71648 + (((tickAnim - 1) / 1) * (-33.20056-(-18.71648)));
            yy = -5.31293 + (((tickAnim - 1) / 1) * (-5.8577-(-5.31293)));
            zz = -25.18792 + (((tickAnim - 1) / 1) * (-23.90008-(-25.18792)));
        }
        else if (tickAnim >= 2 && tickAnim < 4) {
            xx = -33.20056 + (((tickAnim - 2) / 2) * (0-(-33.20056)));
            yy = -5.8577 + (((tickAnim - 2) / 2) * (0-(-5.8577)));
            zz = -23.90008 + (((tickAnim - 2) / 2) * (15.75-(-23.90008)));
        }
        else if (tickAnim >= 4 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 4) / 4) * (-10.99929-(0)));
            yy = 0 + (((tickAnim - 4) / 4) * (0.06535-(0)));
            zz = 15.75 + (((tickAnim - 4) / 4) * (-0.253-(15.75)));
        }
        else if (tickAnim >= 8 && tickAnim < 9) {
            xx = -10.99929 + (((tickAnim - 8) / 1) * (-7.13404-(-10.99929)));
            yy = 0.06535 + (((tickAnim - 8) / 1) * (-0.68063-(0.06535)));
            zz = -0.253 + (((tickAnim - 8) / 1) * (-14.45593-(-0.253)));
        }
        else if (tickAnim >= 9 && tickAnim < 10) {
            xx = -7.13404 + (((tickAnim - 9) / 1) * (-5.24876-(-7.13404)));
            yy = -0.68063 + (((tickAnim - 9) / 1) * (0.11437-(-0.68063)));
            zz = -14.45593 + (((tickAnim - 9) / 1) * (-12.25524-(-14.45593)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftArm3, leftArm3.rotateAngleX + (float) Math.toRadians(xx), leftArm3.rotateAngleY + (float) Math.toRadians(yy), leftArm3.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 2) {
            xx = 0 + (((tickAnim - 0) / 2) * (0-(0)));
            yy = -0.175 + (((tickAnim - 0) / 2) * (0.35-(-0.175)));
            zz = 0 + (((tickAnim - 0) / 2) * (0-(0)));
        }
        else if (tickAnim >= 2 && tickAnim < 4) {
            xx = 0 + (((tickAnim - 2) / 2) * (0-(0)));
            yy = 0.35 + (((tickAnim - 2) / 2) * (0-(0.35)));
            zz = 0 + (((tickAnim - 2) / 2) * (0-(0)));
        }
        else if (tickAnim >= 4 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 4) / 6) * (0-(0)));
            yy = 0 + (((tickAnim - 4) / 6) * (-0.175-(0)));
            zz = 0 + (((tickAnim - 4) / 6) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.leftArm3.rotationPointX = this.leftArm3.rotationPointX + (float)(xx);
        this.leftArm3.rotationPointY = this.leftArm3.rotationPointY - (float)(yy);
        this.leftArm3.rotationPointZ = this.leftArm3.rotationPointZ + (float)(zz);



        this.setRotateAngle(neck, neck.rotateAngleX + (float) Math.toRadians(0), neck.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/0.5-180))*7), neck.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(head, head.rotateAngleX + (float) Math.toRadians(0), head.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/0.5-300))*-6), head.rotateAngleZ + (float) Math.toRadians(0));

    }
    public void animWalk(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime) {
        EntityPrehistoricFloraKuwajimalla entity = (EntityPrehistoricFloraKuwajimalla) entitylivingbaseIn;
        int animCycle = 20;

        if (entity.animSpeedAdder() <= 0) {
            partialTickTime = 0; //If it's static don't increment partial ticks either
        }
        double tickAnim = (entity.ticksExistedAnimated + entity.getTickOffset()) - (int) (Math.floor((double) (entity.ticksExistedAnimated + entity.getTickOffset()) / (double) animCycle) * (double) animCycle) + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;
        this.setRotateAngle(hips, hips.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/0.5))), hips.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180/0.5-90))*6), hips.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180/0.5-90))*5));
        this.hips.rotationPointX = this.hips.rotationPointX + (float)(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180/0.5))*0.5);
        this.hips.rotationPointY = this.hips.rotationPointY - (float)(0);
        this.hips.rotationPointZ = this.hips.rotationPointZ + (float)(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180/0.25))*0.75);


        this.setRotateAngle(tail1, tail1.rotateAngleX + (float) Math.toRadians(1.99882), tail1.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180/0.5-50))*-3), tail1.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(tail2, tail2.rotateAngleX + (float) Math.toRadians(2.24905), tail2.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180/0.5))*-3), tail2.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(tail3, tail3.rotateAngleX + (float) Math.toRadians(-3.75), tail3.rotateAngleY + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180/0.5-50))*-6), tail3.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(body, body.rotateAngleX + (float) Math.toRadians(0), body.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180/0.5-120))*-6), body.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(chest, chest.rotateAngleX + (float) Math.toRadians(0), chest.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180/0.5-150))*-3), chest.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180/0.5+90))*4));


        this.setRotateAngle(neck, neck.rotateAngleX + (float) Math.toRadians(0), neck.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180/0.5-200))*3), neck.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(head, head.rotateAngleX + (float) Math.toRadians(0), head.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180/0.5-350))*-3), head.rotateAngleZ + (float) Math.toRadians(0));



        if (tickAnim >= 0 && tickAnim < 2) {
            xx = -0.89746 + (((tickAnim - 0) / 2) * (-3.13938-(-0.89746)));
            yy = -7.11171 + (((tickAnim - 0) / 2) * (4.98161-(-7.11171)));
            zz = 1.33652 + (((tickAnim - 0) / 2) * (6.26899-(1.33652)));
        }
        else if (tickAnim >= 2 && tickAnim < 5) {
            xx = -3.13938 + (((tickAnim - 2) / 3) * (-1.45751-(-3.13938)));
            yy = 4.98161 + (((tickAnim - 2) / 3) * (28.08515-(4.98161)));
            zz = 6.26899 + (((tickAnim - 2) / 3) * (8.39993-(6.26899)));
        }
        else if (tickAnim >= 5 && tickAnim < 10) {
            xx = -1.45751 + (((tickAnim - 5) / 5) * (0-(-1.45751)));
            yy = 28.08515 + (((tickAnim - 5) / 5) * (61-(28.08515)));
            zz = 8.39993 + (((tickAnim - 5) / 5) * (0-(8.39993)));
        }
        else if (tickAnim >= 10 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 10) / 5) * (-1.80378-(0)));
            yy = 61 + (((tickAnim - 10) / 5) * (17.84096-(61)));
            zz = 0 + (((tickAnim - 10) / 5) * (5.96715-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 20) {
            xx = -1.80378 + (((tickAnim - 15) / 5) * (-0.89746-(-1.80378)));
            yy = 17.84096 + (((tickAnim - 15) / 5) * (-7.11171-(17.84096)));
            zz = 5.96715 + (((tickAnim - 15) / 5) * (1.33652-(5.96715)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightLeg, rightLeg.rotateAngleX + (float) Math.toRadians(xx), rightLeg.rotateAngleY + (float) Math.toRadians(yy), rightLeg.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (0-(0)));
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
        this.rightLeg.rotationPointX = this.rightLeg.rotationPointX + (float)(xx);
        this.rightLeg.rotationPointY = this.rightLeg.rotationPointY - (float)(yy);
        this.rightLeg.rotationPointZ = this.rightLeg.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 1.78185 + (((tickAnim - 0) / 10) * (0-(1.78185)));
            yy = -50.33949 + (((tickAnim - 0) / 10) * (-35.25-(-50.33949)));
            zz = 6.01887 + (((tickAnim - 0) / 10) * (0-(6.01887)));
        }
        else if (tickAnim >= 10 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 10) / 5) * (6.60608-(0)));
            yy = -35.25 + (((tickAnim - 10) / 5) * (-73.99168-(-35.25)));
            zz = 0 + (((tickAnim - 10) / 5) * (5.05395-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 20) {
            xx = 6.60608 + (((tickAnim - 15) / 5) * (1.78185-(6.60608)));
            yy = -73.99168 + (((tickAnim - 15) / 5) * (-50.33949-(-73.99168)));
            zz = 5.05395 + (((tickAnim - 15) / 5) * (6.01887-(5.05395)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightLeg2, rightLeg2.rotateAngleX + (float) Math.toRadians(xx), rightLeg2.rotateAngleY + (float) Math.toRadians(yy), rightLeg2.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (0-(0)));
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
        this.rightLeg2.rotationPointX = this.rightLeg2.rotationPointX + (float)(xx);
        this.rightLeg2.rotationPointY = this.rightLeg2.rotationPointY - (float)(yy);
        this.rightLeg2.rotationPointZ = this.rightLeg2.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 5) {
            xx = 27.7898 + (((tickAnim - 0) / 5) * (14.73592-(27.7898)));
            yy = 5.05281 + (((tickAnim - 0) / 5) * (11.36579-(5.05281)));
            zz = -25.29294 + (((tickAnim - 0) / 5) * (-18.58402-(-25.29294)));
        }
        else if (tickAnim >= 5 && tickAnim < 10) {
            xx = 14.73592 + (((tickAnim - 5) / 5) * (35.68203-(14.73592)));
            yy = 11.36579 + (((tickAnim - 5) / 5) * (17.67877-(11.36579)));
            zz = -18.58402 + (((tickAnim - 5) / 5) * (-11.87511-(-18.58402)));
        }
        else if (tickAnim >= 10 && tickAnim < 16) {
            xx = 35.68203 + (((tickAnim - 10) / 6) * (22.65591-(35.68203)));
            yy = 17.67877 + (((tickAnim - 10) / 6) * (21.03806-(17.67877)));
            zz = -11.87511 + (((tickAnim - 10) / 6) * (-21.70767-(-11.87511)));
        }
        else if (tickAnim >= 16 && tickAnim < 20) {
            xx = 22.65591 + (((tickAnim - 16) / 4) * (27.7898-(22.65591)));
            yy = 21.03806 + (((tickAnim - 16) / 4) * (5.05281-(21.03806)));
            zz = -21.70767 + (((tickAnim - 16) / 4) * (-25.29294-(-21.70767)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightLeg3, rightLeg3.rotateAngleX + (float) Math.toRadians(xx), rightLeg3.rotateAngleY + (float) Math.toRadians(yy), rightLeg3.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            yy = 0.075 + (((tickAnim - 0) / 10) * (0-(0.075)));
            zz = 0 + (((tickAnim - 0) / 10) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 10) / 10) * (0-(0)));
            yy = 0 + (((tickAnim - 10) / 10) * (0.075-(0)));
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




        if (tickAnim >= 0 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 0) / 5) * (-2.25706-(0)));
            yy = -61 + (((tickAnim - 0) / 5) * (-18.08933-(-61)));
            zz = 0 + (((tickAnim - 0) / 5) * (-7.51432-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 10) {
            xx = -2.25706 + (((tickAnim - 5) / 5) * (-0.89746-(-2.25706)));
            yy = -18.08933 + (((tickAnim - 5) / 5) * (7.11171-(-18.08933)));
            zz = -7.51432 + (((tickAnim - 5) / 5) * (-1.33652-(-7.51432)));
        }
        else if (tickAnim >= 10 && tickAnim < 12) {
            xx = -0.89746 + (((tickAnim - 10) / 2) * (-3.13938-(-0.89746)));
            yy = 7.11171 + (((tickAnim - 10) / 2) * (-4.98161-(7.11171)));
            zz = -1.33652 + (((tickAnim - 10) / 2) * (-6.26899-(-1.33652)));
        }
        else if (tickAnim >= 12 && tickAnim < 15) {
            xx = -3.13938 + (((tickAnim - 12) / 3) * (-0.6902-(-3.13938)));
            yy = -4.98161 + (((tickAnim - 12) / 3) * (-27.18982-(-4.98161)));
            zz = -6.26899 + (((tickAnim - 12) / 3) * (-2.41768-(-6.26899)));
        }
        else if (tickAnim >= 15 && tickAnim < 20) {
            xx = -0.6902 + (((tickAnim - 15) / 5) * (0-(-0.6902)));
            yy = -27.18982 + (((tickAnim - 15) / 5) * (-61-(-27.18982)));
            zz = -2.41768 + (((tickAnim - 15) / 5) * (0-(-2.41768)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftLeg, leftLeg.rotateAngleX + (float) Math.toRadians(xx), leftLeg.rotateAngleY + (float) Math.toRadians(yy), leftLeg.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (0-(0)));
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
        this.leftLeg.rotationPointX = this.leftLeg.rotationPointX + (float)(xx);
        this.leftLeg.rotationPointY = this.leftLeg.rotationPointY - (float)(yy);
        this.leftLeg.rotationPointZ = this.leftLeg.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 0) / 5) * (6.60608-(0)));
            yy = 35.25 + (((tickAnim - 0) / 5) * (73.99168-(35.25)));
            zz = 0 + (((tickAnim - 0) / 5) * (-5.05395-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 10) {
            xx = 6.60608 + (((tickAnim - 5) / 5) * (1.78185-(6.60608)));
            yy = 73.99168 + (((tickAnim - 5) / 5) * (50.33949-(73.99168)));
            zz = -5.05395 + (((tickAnim - 5) / 5) * (-6.01887-(-5.05395)));
        }
        else if (tickAnim >= 10 && tickAnim < 20) {
            xx = 1.78185 + (((tickAnim - 10) / 10) * (0-(1.78185)));
            yy = 50.33949 + (((tickAnim - 10) / 10) * (35.25-(50.33949)));
            zz = -6.01887 + (((tickAnim - 10) / 10) * (0-(-6.01887)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftLeg2, leftLeg2.rotateAngleX + (float) Math.toRadians(xx), leftLeg2.rotateAngleY + (float) Math.toRadians(yy), leftLeg2.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (0-(0)));
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
        this.leftLeg2.rotationPointX = this.leftLeg2.rotationPointX + (float)(xx);
        this.leftLeg2.rotationPointY = this.leftLeg2.rotationPointY - (float)(yy);
        this.leftLeg2.rotationPointZ = this.leftLeg2.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 6) {
            xx = 35.68203 + (((tickAnim - 0) / 6) * (22.65591-(35.68203)));
            yy = -17.67877 + (((tickAnim - 0) / 6) * (-21.03806-(-17.67877)));
            zz = 11.87511 + (((tickAnim - 0) / 6) * (21.70767-(11.87511)));
        }
        else if (tickAnim >= 6 && tickAnim < 10) {
            xx = 22.65591 + (((tickAnim - 6) / 4) * (27.7898-(22.65591)));
            yy = -21.03806 + (((tickAnim - 6) / 4) * (-5.05281-(-21.03806)));
            zz = 21.70767 + (((tickAnim - 6) / 4) * (25.29294-(21.70767)));
        }
        else if (tickAnim >= 10 && tickAnim < 15) {
            xx = 27.7898 + (((tickAnim - 10) / 5) * (14.73592-(27.7898)));
            yy = -5.05281 + (((tickAnim - 10) / 5) * (-11.36579-(-5.05281)));
            zz = 25.29294 + (((tickAnim - 10) / 5) * (18.58402-(25.29294)));
        }
        else if (tickAnim >= 15 && tickAnim < 20) {
            xx = 14.73592 + (((tickAnim - 15) / 5) * (35.68203-(14.73592)));
            yy = -11.36579 + (((tickAnim - 15) / 5) * (-17.67877-(-11.36579)));
            zz = 18.58402 + (((tickAnim - 15) / 5) * (11.87511-(18.58402)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftLeg3, leftLeg3.rotateAngleX + (float) Math.toRadians(xx), leftLeg3.rotateAngleY + (float) Math.toRadians(yy), leftLeg3.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 10) * (0.075-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 10) / 10) * (0-(0)));
            yy = 0.075 + (((tickAnim - 10) / 10) * (0-(0.075)));
            zz = 0 + (((tickAnim - 10) / 10) * (0-(0)));
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
            xx = 78.01294 + (((tickAnim - 0) / 5) * (46.77094-(78.01294)));
            yy = 23.0319 + (((tickAnim - 0) / 5) * (-25.47845-(23.0319)));
            zz = 33.45873 + (((tickAnim - 0) / 5) * (51.81242-(33.45873)));
        }
        else if (tickAnim >= 5 && tickAnim < 10) {
            xx = 46.77094 + (((tickAnim - 5) / 5) * (7.61792-(46.77094)));
            yy = -25.47845 + (((tickAnim - 5) / 5) * (-67.63081-(-25.47845)));
            zz = 51.81242 + (((tickAnim - 5) / 5) * (25.09184-(51.81242)));
        }
        else if (tickAnim >= 10 && tickAnim < 20) {
            xx = 7.61792 + (((tickAnim - 10) / 10) * (78.01294-(7.61792)));
            yy = -67.63081 + (((tickAnim - 10) / 10) * (23.0319-(-67.63081)));
            zz = 25.09184 + (((tickAnim - 10) / 10) * (33.45873-(25.09184)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightArm1, rightArm1.rotateAngleX + (float) Math.toRadians(xx), rightArm1.rotateAngleY + (float) Math.toRadians(yy), rightArm1.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (0-(0)));
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
        this.rightArm1.rotationPointX = this.rightArm1.rotationPointX + (float)(xx);
        this.rightArm1.rotationPointY = this.rightArm1.rotationPointY - (float)(yy);
        this.rightArm1.rotationPointZ = this.rightArm1.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 5) {
            xx = -0.64435 + (((tickAnim - 0) / 5) * (6.16606-(-0.64435)));
            yy = 99.83321 + (((tickAnim - 0) / 5) * (77.36696-(99.83321)));
            zz = -17.91804 + (((tickAnim - 0) / 5) * (-28.8392-(-17.91804)));
        }
        else if (tickAnim >= 5 && tickAnim < 8) {
            xx = 6.16606 + (((tickAnim - 5) / 3) * (2.17001-(6.16606)));
            yy = 77.36696 + (((tickAnim - 5) / 3) * (60.23918-(77.36696)));
            zz = -28.8392 + (((tickAnim - 5) / 3) * (-18.28219-(-28.8392)));
        }
        else if (tickAnim >= 8 && tickAnim < 10) {
            xx = 2.17001 + (((tickAnim - 8) / 2) * (10.52734-(2.17001)));
            yy = 60.23918 + (((tickAnim - 8) / 2) * (51.76512-(60.23918)));
            zz = -18.28219 + (((tickAnim - 8) / 2) * (-31.99332-(-18.28219)));
        }
        else if (tickAnim >= 10 && tickAnim < 14) {
            xx = 10.52734 + (((tickAnim - 10) / 4) * (0.01672-(10.52734)));
            yy = 51.76512 + (((tickAnim - 10) / 4) * (77.27427-(51.76512)));
            zz = -31.99332 + (((tickAnim - 10) / 4) * (-12.02869-(-31.99332)));
        }
        else if (tickAnim >= 14 && tickAnim < 20) {
            xx = 0.01672 + (((tickAnim - 14) / 6) * (-0.64435-(0.01672)));
            yy = 77.27427 + (((tickAnim - 14) / 6) * (99.83321-(77.27427)));
            zz = -12.02869 + (((tickAnim - 14) / 6) * (-17.91804-(-12.02869)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightArm2, rightArm2.rotateAngleX + (float) Math.toRadians(xx), rightArm2.rotateAngleY + (float) Math.toRadians(yy), rightArm2.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (0-(0)));
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
        this.rightArm2.rotationPointX = this.rightArm2.rotationPointX + (float)(xx);
        this.rightArm2.rotationPointY = this.rightArm2.rotationPointY - (float)(yy);
        this.rightArm2.rotationPointZ = this.rightArm2.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 0) / 5) * (-5.02029-(0)));
            yy = 0 + (((tickAnim - 0) / 5) * (-0.73426-(0)));
            zz = -15.75 + (((tickAnim - 0) / 5) * (-16.73254-(-15.75)));
        }
        else if (tickAnim >= 5 && tickAnim < 8) {
            xx = -5.02029 + (((tickAnim - 5) / 3) * (-5.14599-(-5.02029)));
            yy = -0.73426 + (((tickAnim - 5) / 3) * (0.2486-(-0.73426)));
            zz = -16.73254 + (((tickAnim - 5) / 3) * (5.23116-(-16.73254)));
        }
        else if (tickAnim >= 8 && tickAnim < 10) {
            xx = -5.14599 + (((tickAnim - 8) / 2) * (-5.24876-(-5.14599)));
            yy = 0.2486 + (((tickAnim - 8) / 2) * (-0.11437-(0.2486)));
            zz = 5.23116 + (((tickAnim - 8) / 2) * (12.25524-(5.23116)));
        }
        else if (tickAnim >= 10 && tickAnim < 13) {
            xx = -5.24876 + (((tickAnim - 10) / 3) * (-25.08055-(-5.24876)));
            yy = -0.11437 + (((tickAnim - 10) / 3) * (1.07411-(-0.11437)));
            zz = 12.25524 + (((tickAnim - 10) / 3) * (30.83889-(12.25524)));
        }
        else if (tickAnim >= 13 && tickAnim < 20) {
            xx = -25.08055 + (((tickAnim - 13) / 7) * (0-(-25.08055)));
            yy = 1.07411 + (((tickAnim - 13) / 7) * (0-(1.07411)));
            zz = 30.83889 + (((tickAnim - 13) / 7) * (-15.75-(30.83889)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightArm3, rightArm3.rotateAngleX + (float) Math.toRadians(xx), rightArm3.rotateAngleY + (float) Math.toRadians(yy), rightArm3.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 10) * (-0.175-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 10) / 3) * (0-(0)));
            yy = -0.175 + (((tickAnim - 10) / 3) * (0.37-(-0.175)));
            zz = 0 + (((tickAnim - 10) / 3) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 13) / 7) * (0-(0)));
            yy = 0.37 + (((tickAnim - 13) / 7) * (0-(0.37)));
            zz = 0 + (((tickAnim - 13) / 7) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.rightArm3.rotationPointX = this.rightArm3.rotationPointX + (float)(xx);
        this.rightArm3.rotationPointY = this.rightArm3.rotationPointY - (float)(yy);
        this.rightArm3.rotationPointZ = this.rightArm3.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 7.61792 + (((tickAnim - 0) / 10) * (78.01294-(7.61792)));
            yy = 67.63081 + (((tickAnim - 0) / 10) * (-23.0319-(67.63081)));
            zz = -25.09184 + (((tickAnim - 0) / 10) * (-33.45873-(-25.09184)));
        }
        else if (tickAnim >= 10 && tickAnim < 15) {
            xx = 78.01294 + (((tickAnim - 10) / 5) * (46.77094-(78.01294)));
            yy = -23.0319 + (((tickAnim - 10) / 5) * (25.47845-(-23.0319)));
            zz = -33.45873 + (((tickAnim - 10) / 5) * (-51.81242-(-33.45873)));
        }
        else if (tickAnim >= 15 && tickAnim < 20) {
            xx = 46.77094 + (((tickAnim - 15) / 5) * (7.61792-(46.77094)));
            yy = 25.47845 + (((tickAnim - 15) / 5) * (67.63081-(25.47845)));
            zz = -51.81242 + (((tickAnim - 15) / 5) * (-25.09184-(-51.81242)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftArm1, leftArm1.rotateAngleX + (float) Math.toRadians(xx), leftArm1.rotateAngleY + (float) Math.toRadians(yy), leftArm1.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (0-(0)));
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
        this.leftArm1.rotationPointX = this.leftArm1.rotationPointX + (float)(xx);
        this.leftArm1.rotationPointY = this.leftArm1.rotationPointY - (float)(yy);
        this.leftArm1.rotationPointZ = this.leftArm1.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 4) {
            xx = 10.52734 + (((tickAnim - 0) / 4) * (0.01672-(10.52734)));
            yy = -51.76512 + (((tickAnim - 0) / 4) * (-77.27427-(-51.76512)));
            zz = 31.99332 + (((tickAnim - 0) / 4) * (12.02869-(31.99332)));
        }
        else if (tickAnim >= 4 && tickAnim < 10) {
            xx = 0.01672 + (((tickAnim - 4) / 6) * (-0.64435-(0.01672)));
            yy = -77.27427 + (((tickAnim - 4) / 6) * (-99.83321-(-77.27427)));
            zz = 12.02869 + (((tickAnim - 4) / 6) * (17.91804-(12.02869)));
        }
        else if (tickAnim >= 10 && tickAnim < 15) {
            xx = -0.64435 + (((tickAnim - 10) / 5) * (6.16606-(-0.64435)));
            yy = -99.83321 + (((tickAnim - 10) / 5) * (-77.36696-(-99.83321)));
            zz = 17.91804 + (((tickAnim - 10) / 5) * (28.8392-(17.91804)));
        }
        else if (tickAnim >= 15 && tickAnim < 18) {
            xx = 6.16606 + (((tickAnim - 15) / 3) * (2.17001-(6.16606)));
            yy = -77.36696 + (((tickAnim - 15) / 3) * (-60.23918-(-77.36696)));
            zz = 28.8392 + (((tickAnim - 15) / 3) * (18.28219-(28.8392)));
        }
        else if (tickAnim >= 18 && tickAnim < 20) {
            xx = 2.17001 + (((tickAnim - 18) / 2) * (10.52734-(2.17001)));
            yy = -60.23918 + (((tickAnim - 18) / 2) * (-51.76512-(-60.23918)));
            zz = 18.28219 + (((tickAnim - 18) / 2) * (31.99332-(18.28219)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftArm2, leftArm2.rotateAngleX + (float) Math.toRadians(xx), leftArm2.rotateAngleY + (float) Math.toRadians(yy), leftArm2.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (0-(0)));
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
        this.leftArm2.rotationPointX = this.leftArm2.rotationPointX + (float)(xx);
        this.leftArm2.rotationPointY = this.leftArm2.rotationPointY - (float)(yy);
        this.leftArm2.rotationPointZ = this.leftArm2.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 3) {
            xx = -5.24876 + (((tickAnim - 0) / 3) * (-23.37426-(-5.24876)));
            yy = 0.11437 + (((tickAnim - 0) / 3) * (0.0715-(0.11437)));
            zz = -12.25524 + (((tickAnim - 0) / 3) * (-15.87826-(-12.25524)));
        }
        else if (tickAnim >= 3 && tickAnim < 10) {
            xx = -23.37426 + (((tickAnim - 3) / 7) * (0-(-23.37426)));
            yy = 0.0715 + (((tickAnim - 3) / 7) * (0-(0.0715)));
            zz = -15.87826 + (((tickAnim - 3) / 7) * (15.75-(-15.87826)));
        }
        else if (tickAnim >= 10 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 10) / 5) * (-5.02029-(0)));
            yy = 0 + (((tickAnim - 10) / 5) * (0.73426-(0)));
            zz = 15.75 + (((tickAnim - 10) / 5) * (16.73254-(15.75)));
        }
        else if (tickAnim >= 15 && tickAnim < 18) {
            xx = -5.02029 + (((tickAnim - 15) / 3) * (-5.14599-(-5.02029)));
            yy = 0.73426 + (((tickAnim - 15) / 3) * (-0.73426-(0.73426)));
            zz = 16.73254 + (((tickAnim - 15) / 3) * (-16.73254-(16.73254)));
        }
        else if (tickAnim >= 18 && tickAnim < 20) {
            xx = -5.14599 + (((tickAnim - 18) / 2) * (-5.24876-(-5.14599)));
            yy = -0.73426 + (((tickAnim - 18) / 2) * (0.11437-(-0.73426)));
            zz = -16.73254 + (((tickAnim - 18) / 2) * (-12.25524-(-16.73254)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftArm3, leftArm3.rotateAngleX + (float) Math.toRadians(xx), leftArm3.rotateAngleY + (float) Math.toRadians(yy), leftArm3.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            yy = -0.175 + (((tickAnim - 0) / 3) * (0.37-(-0.175)));
            zz = 0 + (((tickAnim - 0) / 3) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 3) / 7) * (0-(0)));
            yy = 0.37 + (((tickAnim - 3) / 7) * (0-(0.37)));
            zz = 0 + (((tickAnim - 3) / 7) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 10) / 10) * (0-(0)));
            yy = 0 + (((tickAnim - 10) / 10) * (-0.175-(0)));
            zz = 0 + (((tickAnim - 10) / 10) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.leftArm3.rotationPointX = this.leftArm3.rotationPointX + (float)(xx);
        this.leftArm3.rotationPointY = this.leftArm3.rotationPointY - (float)(yy);
        this.leftArm3.rotationPointZ = this.leftArm3.rotationPointZ + (float)(zz);

    }


    public void animate(IAnimatedEntity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        EntityPrehistoricFloraKuwajimalla e = (EntityPrehistoricFloraKuwajimalla) entity;
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
