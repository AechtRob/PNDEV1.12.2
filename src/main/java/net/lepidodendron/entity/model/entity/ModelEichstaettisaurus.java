package net.lepidodendron.entity.model.entity;

import net.ilexiconn.llibrary.client.model.ModelAnimator;
import net.ilexiconn.llibrary.client.model.tools.AdvancedModelRenderer;
import net.ilexiconn.llibrary.server.animation.IAnimatedEntity;
import net.lepidodendron.entity.EntityPrehistoricFloraEichstaettisaurus;
import net.lepidodendron.entity.model.ModelBasePalaeopedia;
import net.lepidodendron.entity.model.llibraryextensions.AdvancedModelRendererExtended;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;

public class ModelEichstaettisaurus extends ModelBasePalaeopedia {
    private final AdvancedModelRenderer root;
    private final AdvancedModelRenderer cube_r1;
    private final AdvancedModelRenderer rightLeg;
    private final AdvancedModelRenderer rightLeg2;
    private final AdvancedModelRenderer cube_r2;
    private final AdvancedModelRenderer rightFootw;
    private final AdvancedModelRenderer rightFoot;
    private final AdvancedModelRenderer leftLeg;
    private final AdvancedModelRenderer leftLeg2;
    private final AdvancedModelRenderer cube_r3;
    private final AdvancedModelRenderer leftFootw;
    private final AdvancedModelRenderer leftFoot;
    private final AdvancedModelRenderer tail1;
    private final AdvancedModelRenderer tail2;
    private final AdvancedModelRenderer tail3;
    private final AdvancedModelRenderer tail4;
    private final AdvancedModelRenderer tail5;
    private final AdvancedModelRenderer body;
    private final AdvancedModelRenderer chest;
    private final AdvancedModelRenderer rightArm;
    private final AdvancedModelRenderer rightArm2w;
    private final AdvancedModelRenderer rightArm2;
    private final AdvancedModelRenderer rightHand;
    private final AdvancedModelRenderer leftArm;
    private final AdvancedModelRenderer leftArm2w;
    private final AdvancedModelRenderer leftArm2;
    private final AdvancedModelRenderer leftHand;
    private final AdvancedModelRenderer neck1;
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
    private final AdvancedModelRenderer jaw;
    private final AdvancedModelRenderer cube_r14;
    private final AdvancedModelRenderer cube_r15;
    private final AdvancedModelRenderer cube_r16;
    private final AdvancedModelRenderer cube_r17;

    private ModelAnimator animator;

    public ModelEichstaettisaurus() {
        this.textureWidth = 54;
        this.textureHeight = 54;

        this.root = new AdvancedModelRenderer(this);
        this.root.setRotationPoint(0.0F, 23.5F, 7.5F);
        this.setRotateAngle(root, -0.0873F, 0.0F, 0.0F);
        this.root.cubeList.add(new ModelBox(root, 32, 34, -1.5F, -2.5F, 0.0F, 3, 2, 3, 0.0F, false));

        this.cube_r1 = new AdvancedModelRenderer(this);
        this.cube_r1.setRotationPoint(0.0F, 0.0F, -3.0F);
        this.root.addChild(cube_r1);
        this.setRotateAngle(cube_r1, 0.1309F, 0.0F, 0.0F);
        this.cube_r1.cubeList.add(new ModelBox(cube_r1, 36, 10, -1.5F, -0.4F, 3.0F, 3, 1, 3, -0.01F, false));

        this.rightLeg = new AdvancedModelRenderer(this);
        this.rightLeg.setRotationPoint(-1.1F, -0.75F, 0.65F);
        this.root.addChild(rightLeg);
        this.setRotateAngle(rightLeg, 0.0F, -0.3054F, -0.1745F);
        this.rightLeg.cubeList.add(new ModelBox(rightLeg, 32, 30, -4.25F, -1.0F, -1.0F, 5, 1, 2, 0.01F, true));

        this.rightLeg2 = new AdvancedModelRenderer(this);
        this.rightLeg2.setRotationPoint(-3.9156F, 0.0759F, -0.5486F);
        this.rightLeg.addChild(rightLeg2);
        this.setRotateAngle(rightLeg2, -0.1719F, 1.3477F, -0.1757F);


        this.cube_r2 = new AdvancedModelRenderer(this);
        this.cube_r2.setRotationPoint(-0.125F, 0.0F, 0.375F);
        this.rightLeg2.addChild(cube_r2);
        this.setRotateAngle(cube_r2, 0.0F, 0.2182F, 0.0F);
        this.cube_r2.cubeList.add(new ModelBox(cube_r2, 21, 16, -3.75F, -1.0F, -0.75F, 4, 1, 1, 0.0F, true));

        this.rightFootw = new AdvancedModelRenderer(this);
        this.rightFootw.setRotationPoint(-3.5133F, 0.0625F, 0.7052F);
        this.rightLeg2.addChild(rightFootw);


        this.rightFoot = new AdvancedModelRenderer(this);
        this.rightFoot.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.rightFootw.addChild(rightFoot);
        this.setRotateAngle(rightFoot, -0.1087F, -0.6622F, 0.2857F);
        this.rightFoot.cubeList.add(new ModelBox(rightFoot, 36, 6, -3.725F, -0.1F, -1.525F, 4, 0, 3, 0.0F, true));

        this.leftLeg = new AdvancedModelRenderer(this);
        this.leftLeg.setRotationPoint(1.1F, -0.75F, 0.65F);
        this.root.addChild(leftLeg);
        this.setRotateAngle(leftLeg, 0.0F, 0.3054F, 0.1745F);
        this.leftLeg.cubeList.add(new ModelBox(leftLeg, 32, 30, -0.75F, -1.0F, -1.0F, 5, 1, 2, 0.01F, false));

        this.leftLeg2 = new AdvancedModelRenderer(this);
        this.leftLeg2.setRotationPoint(3.9156F, 0.0759F, -0.5486F);
        this.leftLeg.addChild(leftLeg2);
        this.setRotateAngle(leftLeg2, -0.1719F, -1.3477F, 0.1757F);


        this.cube_r3 = new AdvancedModelRenderer(this);
        this.cube_r3.setRotationPoint(0.125F, 0.0F, 0.375F);
        this.leftLeg2.addChild(cube_r3);
        this.setRotateAngle(cube_r3, 0.0F, -0.2182F, 0.0F);
        this.cube_r3.cubeList.add(new ModelBox(cube_r3, 21, 16, -0.25F, -1.0F, -0.75F, 4, 1, 1, 0.0F, false));

        this.leftFootw = new AdvancedModelRenderer(this);
        this.leftFootw.setRotationPoint(3.5133F, 0.0625F, 0.7052F);
        this.leftLeg2.addChild(leftFootw);


        this.leftFoot = new AdvancedModelRenderer(this);
        this.leftFoot.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.leftFootw.addChild(leftFoot);
        this.setRotateAngle(leftFoot, -0.1087F, 0.6622F, -0.2857F);
        this.leftFoot.cubeList.add(new ModelBox(leftFoot, 36, 6, -0.275F, -0.1F, -1.525F, 4, 0, 3, 0.0F, false));

        this.tail1 = new AdvancedModelRenderer(this);
        this.tail1.setRotationPoint(0.0F, -1.4F, 3.0F);
        this.root.addChild(tail1);
        this.tail1.cubeList.add(new ModelBox(tail1, 0, 20, -1.0F, -1.0F, -1.0F, 2, 2, 6, 0.0F, false));

        this.tail2 = new AdvancedModelRenderer(this);
        this.tail2.setRotationPoint(0.0F, 0.0007F, 4.9738F);
        this.tail1.addChild(tail2);
        this.setRotateAngle(tail2, 0.0524F, 0.0F, 0.0F);
        this.tail2.cubeList.add(new ModelBox(tail2, 17, 20, -0.25F, -0.25F, -0.5F, 1, 1, 6, -0.01F, false));
        this.tail2.cubeList.add(new ModelBox(tail2, 21, 0, -0.75F, -0.25F, -0.5F, 1, 1, 6, 0.0F, false));
        this.tail2.cubeList.add(new ModelBox(tail2, 21, 8, -0.75F, -0.75F, -0.5F, 1, 1, 6, -0.01F, false));
        this.tail2.cubeList.add(new ModelBox(tail2, 17, 28, -0.25F, -0.75F, -0.5F, 1, 1, 6, 0.0F, false));

        this.tail3 = new AdvancedModelRenderer(this);
        this.tail3.setRotationPoint(-0.0214F, 0.0069F, 5.2909F);
        this.tail2.addChild(tail3);
        this.setRotateAngle(tail3, 0.0305F, 0.0F, 0.0F);
        this.tail3.cubeList.add(new ModelBox(tail3, 0, 29, -0.5F, -0.5F, 0.0F, 1, 1, 6, 0.01F, false));

        this.tail4 = new AdvancedModelRenderer(this);
        this.tail4.setRotationPoint(0.0F, 0.0F, 6.0F);
        this.tail3.addChild(tail4);
        this.tail4.cubeList.add(new ModelBox(tail4, 32, 16, -0.5F, -0.5F, 0.0F, 1, 1, 5, 0.0F, false));

        this.tail5 = new AdvancedModelRenderer(this);
        this.tail5.setRotationPoint(0.0F, 0.0F, 5.0F);
        this.tail4.addChild(tail5);
        this.tail5.cubeList.add(new ModelBox(tail5, 32, 23, -0.5F, -0.5F, 0.0F, 1, 1, 5, 0.01F, false));

        this.body = new AdvancedModelRenderer(this);
        this.body.setRotationPoint(0.0F, -1.1F, 0.5F);
        this.root.addChild(body);
        this.setRotateAngle(body, 0.0873F, 0.0F, 0.0F);
        this.body.cubeList.add(new ModelBox(body, 0, 0, -2.0F, -1.5F, -6.0F, 4, 3, 6, 0.0F, false));

        this.chest = new AdvancedModelRenderer(this);
        this.chest.setRotationPoint(0.0F, 0.0F, -5.5F);
        this.body.addChild(chest);
        this.chest.cubeList.add(new ModelBox(chest, 0, 10, -2.0F, -1.5F, -6.0F, 4, 3, 6, 0.01F, false));

        this.rightArm = new AdvancedModelRenderer(this);
        this.rightArm.setRotationPoint(-2.0F, 0.5F, -5.2F);
        this.chest.addChild(rightArm);
        this.setRotateAngle(rightArm, -0.267F, 0.5802F, -0.4701F);
        this.rightArm.cubeList.add(new ModelBox(rightArm, 45, 27, -1.5F, -0.5F, -0.5F, 2, 1, 1, 0.01F, true));
        this.rightArm.cubeList.add(new ModelBox(rightArm, 0, 47, -1.5F, -0.5F, 0.0F, 2, 1, 1, 0.0F, true));

        this.rightArm2w = new AdvancedModelRenderer(this);
        this.rightArm2w.setRotationPoint(-1.5F, 0.0F, 0.55F);
        this.rightArm.addChild(rightArm2w);


        this.rightArm2 = new AdvancedModelRenderer(this);
        this.rightArm2.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.rightArm2w.addChild(rightArm2);
        this.setRotateAngle(rightArm2, -2.6514F, -1.4748F, 3.0786F);
        this.rightArm2.cubeList.add(new ModelBox(rightArm2, 45, 20, -2.75F, -0.5F, -0.5F, 3, 1, 1, -0.01F, true));

        this.rightHand = new AdvancedModelRenderer(this);
        this.rightHand.setRotationPoint(-2.75F, 0.25F, 0.0F);
        this.rightArm2.addChild(rightHand);
        this.setRotateAngle(rightHand, 0.0F, 0.0F, -0.0436F);
        this.rightHand.cubeList.add(new ModelBox(rightHand, 41, 40, -2.2515F, 0.0997F, -1.4918F, 3, 0, 3, 0.0F, true));

        this.leftArm = new AdvancedModelRenderer(this);
        this.leftArm.setRotationPoint(2.0F, 0.5F, -5.2F);
        this.chest.addChild(leftArm);
        this.setRotateAngle(leftArm, -0.267F, -0.5802F, 0.4701F);
        this.leftArm.cubeList.add(new ModelBox(leftArm, 45, 27, -0.5F, -0.5F, -0.5F, 2, 1, 1, 0.01F, false));
        this.leftArm.cubeList.add(new ModelBox(leftArm, 0, 47, -0.5F, -0.5F, 0.0F, 2, 1, 1, 0.0F, false));

        this.leftArm2w = new AdvancedModelRenderer(this);
        this.leftArm2w.setRotationPoint(1.5F, 0.0F, 0.55F);
        this.leftArm.addChild(leftArm2w);


        this.leftArm2 = new AdvancedModelRenderer(this);
        this.leftArm2.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.leftArm2w.addChild(leftArm2);
        this.setRotateAngle(leftArm2, -2.6514F, 1.4748F, -3.0786F);
        this.leftArm2.cubeList.add(new ModelBox(leftArm2, 45, 20, -0.25F, -0.5F, -0.5F, 3, 1, 1, -0.01F, false));

        this.leftHand = new AdvancedModelRenderer(this);
        this.leftHand.setRotationPoint(2.75F, 0.25F, 0.0F);
        this.leftArm2.addChild(leftHand);
        this.setRotateAngle(leftHand, 0.0F, 0.0F, 0.0436F);
        this.leftHand.cubeList.add(new ModelBox(leftHand, 41, 40, -0.7485F, 0.0997F, -1.4918F, 3, 0, 3, 0.0F, false));

        this.neck1 = new AdvancedModelRenderer(this);
        this.neck1.setRotationPoint(0.0F, -0.1F, -6.0F);
        this.chest.addChild(neck1);
        this.setRotateAngle(neck1, -0.1745F, 0.0F, 0.0F);
        this.neck1.cubeList.add(new ModelBox(neck1, 36, 0, -1.5F, -1.25F, -1.75F, 3, 2, 3, -0.01F, false));

        this.cube_r4 = new AdvancedModelRenderer(this);
        this.cube_r4.setRotationPoint(0.0F, 0.675F, -1.425F);
        this.neck1.addChild(cube_r4);
        this.setRotateAngle(cube_r4, -0.1222F, 0.0F, 0.0F);
        this.cube_r4.cubeList.add(new ModelBox(cube_r4, 15, 36, -1.5F, -0.75F, -0.35F, 3, 1, 3, -0.02F, false));

        this.head = new AdvancedModelRenderer(this);
        this.head.setRotationPoint(0.0F, 0.25F, -1.75F);
        this.neck1.addChild(head);
        this.setRotateAngle(head, 0.1309F, 0.0F, 0.0F);
        this.head.cubeList.add(new ModelBox(head, 0, 42, -0.5F, -1.0489F, -4.775F, 1, 1, 3, 0.01F, false));
        this.head.cubeList.add(new ModelBox(head, 0, 37, -1.5F, -1.075F, -2.75F, 3, 1, 3, 0.02F, false));
        this.head.cubeList.add(new ModelBox(head, 13, 41, -1.5F, -1.675F, -2.75F, 3, 1, 3, 0.0F, false));

        this.cube_r5 = new AdvancedModelRenderer(this);
        this.cube_r5.setRotationPoint(-1.4235F, -0.05F, -2.976F);
        this.head.addChild(cube_r5);
        this.setRotateAngle(cube_r5, 0.0F, -0.0436F, 0.0F);
        this.cube_r5.cubeList.add(new ModelBox(cube_r5, 0, 50, 0.0F, -1.0048F, -0.0182F, 1, 1, 1, 0.01F, true));

        this.cube_r6 = new AdvancedModelRenderer(this);
        this.cube_r6.setRotationPoint(1.4235F, -0.05F, -2.976F);
        this.head.addChild(cube_r6);
        this.setRotateAngle(cube_r6, 0.0F, 0.0436F, 0.0F);
        this.cube_r6.cubeList.add(new ModelBox(cube_r6, 0, 50, -1.0F, -1.0048F, -0.0182F, 1, 1, 1, 0.01F, false));

        this.cube_r7 = new AdvancedModelRenderer(this);
        this.cube_r7.setRotationPoint(0.5F, 0.625F, -4.75F);
        this.head.addChild(cube_r7);
        this.setRotateAngle(cube_r7, 0.0F, 0.48F, 0.0F);
        this.cube_r7.cubeList.add(new ModelBox(cube_r7, 9, 46, -1.0F, -1.6798F, -0.0182F, 1, 1, 2, 0.0F, false));

        this.cube_r8 = new AdvancedModelRenderer(this);
        this.cube_r8.setRotationPoint(-0.5F, 0.625F, -4.75F);
        this.head.addChild(cube_r8);
        this.setRotateAngle(cube_r8, 0.0F, -0.48F, 0.0F);
        this.cube_r8.cubeList.add(new ModelBox(cube_r8, 26, 45, 0.0F, -1.6798F, -0.0182F, 1, 1, 2, 0.0F, false));

        this.cube_r9 = new AdvancedModelRenderer(this);
        this.cube_r9.setRotationPoint(0.5499F, -1.0633F, -4.5702F);
        this.head.addChild(cube_r9);
        this.setRotateAngle(cube_r9, 0.1853F, 0.4423F, 0.029F);
        this.cube_r9.cubeList.add(new ModelBox(cube_r9, 16, 46, -0.975F, 0.0F, -0.2F, 1, 1, 2, 0.0F, false));

        this.cube_r10 = new AdvancedModelRenderer(this);
        this.cube_r10.setRotationPoint(-0.5499F, -1.0633F, -4.5702F);
        this.head.addChild(cube_r10);
        this.setRotateAngle(cube_r10, 0.1853F, -0.4423F, -0.029F);
        this.cube_r10.cubeList.add(new ModelBox(cube_r10, 45, 23, -0.025F, 0.0F, -0.2F, 1, 1, 2, 0.0F, false));

        this.cube_r11 = new AdvancedModelRenderer(this);
        this.cube_r11.setRotationPoint(-1.1077F, -1.3048F, -2.3707F);
        this.head.addChild(cube_r11);
        this.setRotateAngle(cube_r11, -0.0043F, -0.0258F, 0.1659F);
        this.cube_r11.cubeList.add(new ModelBox(cube_r11, 49, 3, -0.4016F, -0.3763F, -0.4948F, 1, 1, 1, 0.1F, true));

        this.cube_r12 = new AdvancedModelRenderer(this);
        this.cube_r12.setRotationPoint(1.1077F, -1.3048F, -2.3707F);
        this.head.addChild(cube_r12);
        this.setRotateAngle(cube_r12, -0.0043F, 0.0258F, -0.1659F);
        this.cube_r12.cubeList.add(new ModelBox(cube_r12, 49, 3, -0.5984F, -0.3763F, -0.4948F, 1, 1, 1, 0.1F, false));

        this.cube_r13 = new AdvancedModelRenderer(this);
        this.cube_r13.setRotationPoint(0.0F, -1.0F, -4.75F);
        this.head.addChild(cube_r13);
        this.setRotateAngle(cube_r13, 0.2007F, 0.0F, 0.0F);
        this.cube_r13.cubeList.add(new ModelBox(cube_r13, 41, 44, -0.5F, -0.05F, 0.125F, 1, 1, 3, 0.0F, false));

        this.jaw = new AdvancedModelRenderer(this);
        this.jaw.setRotationPoint(0.0F, -0.025F, -0.05F);
        this.head.addChild(jaw);
        this.jaw.cubeList.add(new ModelBox(jaw, 28, 40, -1.5F, -0.35F, -2.7F, 3, 1, 3, 0.0F, false));
        this.jaw.cubeList.add(new ModelBox(jaw, 45, 15, -0.5F, -0.3489F, -4.7239F, 1, 1, 3, -0.01F, false));

        this.cube_r14 = new AdvancedModelRenderer(this);
        this.cube_r14.setRotationPoint(1.4235F, 0.65F, -2.926F);
        this.jaw.addChild(cube_r14);
        this.setRotateAngle(cube_r14, 0.0F, 0.0436F, 0.0F);
        this.cube_r14.cubeList.add(new ModelBox(cube_r14, 49, 0, -1.0F, -1.0048F, -0.0182F, 1, 1, 1, 0.0F, false));

        this.cube_r15 = new AdvancedModelRenderer(this);
        this.cube_r15.setRotationPoint(-1.4235F, 0.65F, -2.926F);
        this.jaw.addChild(cube_r15);
        this.setRotateAngle(cube_r15, 0.0F, -0.0436F, 0.0F);
        this.cube_r15.cubeList.add(new ModelBox(cube_r15, 47, 30, 0.0F, -1.0048F, -0.0182F, 1, 1, 1, 0.0F, false));

        this.cube_r16 = new AdvancedModelRenderer(this);
        this.cube_r16.setRotationPoint(0.5F, 0.65F, -4.7F);
        this.jaw.addChild(cube_r16);
        this.setRotateAngle(cube_r16, 0.0F, 0.48F, 0.0F);
        this.cube_r16.cubeList.add(new ModelBox(cube_r16, 45, 34, -1.0F, -1.0048F, -0.0182F, 1, 1, 2, -0.01F, false));

        this.cube_r17 = new AdvancedModelRenderer(this);
        this.cube_r17.setRotationPoint(-0.5F, 0.65F, -4.7F);
        this.jaw.addChild(cube_r17);
        this.setRotateAngle(cube_r17, 0.0F, -0.48F, 0.0F);
        this.cube_r17.cubeList.add(new ModelBox(cube_r17, 33, 45, 0.0F, -1.0048F, -0.0182F, 1, 1, 2, -0.01F, false));

        updateDefaultPose();
        animator = ModelAnimator.create();
    }

    @Override
    public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        animate((IAnimatedEntity) entity, f, f1, f2, f3, f4, f5);
        this.root.render(f5);
    }
    public void renderStaticWall(float f) {
        this.root.render(0.01F);
        resetToDefaultPose();
    }
    public void renderStaticFloor(float f) {
        resetToDefaultPose();
    }
    @Override
    public void renderStaticBook(float f) {
        //Rotations, positions and sizing:
        this.root.offsetY = -1.3F;
        this.root.offsetX = 1.5F;
        this.root.rotateAngleY = (float)Math.toRadians(200);
        this.root.rotateAngleX = (float)Math.toRadians(8);
        this.root.rotateAngleZ = (float)Math.toRadians(-8);
        this.root.scaleChildren = true;
        float scaler = 4.0F;
        this.root.setScale(scaler, scaler, scaler);
        //Start of pose:

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
    public void setRotationAngles(float f, float f1, float f2, float f3, float f4, float f5, Entity e) {
        super.setRotationAngles(f, f1, f2, f3, f4, f5, e);
        //this.resetToDefaultPose();
        //this.root.offsetY = 1.28F;

        EntityPrehistoricFloraEichstaettisaurus Eichstaettisaurus = (EntityPrehistoricFloraEichstaettisaurus) e;
        float masterSpeed = Eichstaettisaurus.getTravelSpeed();

        this.faceTarget(f3, f4, 2, neck1);
        this.faceTarget(f3, f4, 4, head);

        AdvancedModelRenderer[] Tail = {this.tail1, this.tail2, this.tail3, this.tail4, this.tail5};

        if (Eichstaettisaurus.getAnimation() == Eichstaettisaurus.MAKE_NEST_ANIMATION) {
            //this.swing(Neck, 0.5F, 0.10F, false, 0.5F,-0.05F, f2, 0.8F);
            //this.walk(Neck, 0.5F * 2, -0.02F, false, 0.5F,0.01F, f2, 0.8F);
            return;
        }


        if (Eichstaettisaurus.getIsClimbing()) {
            //Pose for climbing:
            //this.root.offsetY = 1.40F;
        }

    }

    @Override
    public void setLivingAnimations(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime) {
        super.setLivingAnimations(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime);
        this.resetToDefaultPose();
        EntityPrehistoricFloraEichstaettisaurus ee = (EntityPrehistoricFloraEichstaettisaurus) entitylivingbaseIn;


        if(ee.getIsMoving()) {
            if (ee.getIsFast()) {
                if (ee.getIsClimbing()) {
                    if(!ee.getHeadCollided()) {
                        animClimb(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime, false);
                    } else {
                        animClimb(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime, true);
                    }
                } else {
                    animRun(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime);
                }
            } else {
                if (ee.getIsClimbing()) {
                    if(!ee.getHeadCollided()) {
                        animClimb(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime, false);
                    } else {
                        animClimb(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime, true);
                    }
                } else {
                    animWalk(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime);
                }
            }
        }

        if (ee.getAnimation() == ee.EAT_ANIMATION) {
            animEat(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime, ee.getAnimationTick());
        }


    }

    public void animEat(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime, double animTick) {
        EntityPrehistoricFloraEichstaettisaurus entity = (EntityPrehistoricFloraEichstaettisaurus) entitylivingbaseIn;
        int animCycle = 15;
        double tickAnim = animTick + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;
         if (tickAnim >= 0 && tickAnim < 3) {
            xx = 0 + (((tickAnim - 0) / 3) * (3.13-(0)));
            yy = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 3) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 5) {
            xx = 3.13 + (((tickAnim - 3) / 2) * (-4.75-(3.13)));
            yy = 0 + (((tickAnim - 3) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 3) / 2) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 8) {
            xx = -4.75 + (((tickAnim - 5) / 3) * (-14-(-4.75)));
            yy = 0 + (((tickAnim - 5) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 5) / 3) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 15) {
            xx = -14 + (((tickAnim - 8) / 7) * (0-(-14)));
            yy = 0 + (((tickAnim - 8) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 7) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck1, neck1.rotateAngleX + (float) Math.toRadians(xx), neck1.rotateAngleY + (float) Math.toRadians(yy), neck1.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 0 + (((tickAnim - 0) / 3) * (5.45171-(0)));
            yy = 0 + (((tickAnim - 0) / 3) * (-4.9054-(0)));
            zz = 0 + (((tickAnim - 0) / 3) * (9.85774-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 5) {
            xx = 5.45171 + (((tickAnim - 3) / 2) * (26.25-(5.45171)));
            yy = -4.9054 + (((tickAnim - 3) / 2) * (0-(-4.9054)));
            zz = 9.85774 + (((tickAnim - 3) / 2) * (0-(9.85774)));
        }
        else if (tickAnim >= 5 && tickAnim < 8) {
            xx = 26.25 + (((tickAnim - 5) / 3) * (0-(26.25)));
            yy = 0 + (((tickAnim - 5) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 5) / 3) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 12) {
            xx = 0 + (((tickAnim - 8) / 4) * (25.25-(0)));
            yy = 0 + (((tickAnim - 8) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 4) * (0-(0)));
        }
        else if (tickAnim >= 12 && tickAnim < 15) {
            xx = 25.25 + (((tickAnim - 12) / 3) * (0-(25.25)));
            yy = 0 + (((tickAnim - 12) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 12) / 3) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(head, head.rotateAngleX + (float) Math.toRadians(xx), head.rotateAngleY + (float) Math.toRadians(yy), head.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 0) / 5) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 5) * (0.025-(0)));
            zz = 0 + (((tickAnim - 0) / 5) * (0.825-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 12) {
            xx = 0 + (((tickAnim - 5) / 7) * (0-(0)));
            yy = 0.025 + (((tickAnim - 5) / 7) * (0.175-(0.025)));
            zz = 0.825 + (((tickAnim - 5) / 7) * (0.975-(0.825)));
        }
        else if (tickAnim >= 12 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 12) / 3) * (0-(0)));
            yy = 0.175 + (((tickAnim - 12) / 3) * (0-(0.175)));
            zz = 0.975 + (((tickAnim - 12) / 3) * (0-(0.975)));
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
            xx = 0 + (((tickAnim - 0) / 3) * (15.75-(0)));
            yy = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 3) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 5) {
            xx = 15.75 + (((tickAnim - 3) / 2) * (0-(15.75)));
            yy = 0 + (((tickAnim - 3) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 3) / 2) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 5) / 3) * (21.5-(0)));
            yy = 0 + (((tickAnim - 5) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 5) / 3) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 12) {
            xx = 21.5 + (((tickAnim - 8) / 4) * (0-(21.5)));
            yy = 0 + (((tickAnim - 8) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 4) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(jaw, jaw.rotateAngleX + (float) Math.toRadians(xx), jaw.rotateAngleY + (float) Math.toRadians(yy), jaw.rotateAngleZ + (float) Math.toRadians(zz));


    }
    public void animRun(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime) {
        EntityPrehistoricFloraEichstaettisaurus entity = (EntityPrehistoricFloraEichstaettisaurus) entitylivingbaseIn;
        int animCycle = 10;
        double tickAnim = (entity.ticksExisted + entity.getTickOffset()) - (int) (Math.floor((double) (entity.ticksExisted + entity.getTickOffset()) / (double) animCycle) * (double) animCycle) + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;
        this.setRotateAngle(root, root.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*720/0.5))*1), root.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/0.5-90))*15), root.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/0.5-90))*5));
        this.root.rotationPointX = this.root.rotationPointX + (float)(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/0.5))*1.5);
        this.root.rotationPointY = this.root.rotationPointY - (float)(0);
        this.root.rotationPointZ = this.root.rotationPointZ + (float)(0);



        if (tickAnim >= 0 && tickAnim < 1) {
            xx = -4.49641 + (((tickAnim - 0) / 1) * (-2.34097-(-4.49641)));
            yy = -32.60273 + (((tickAnim - 0) / 1) * (-19.76797-(-32.60273)));
            zz = 5.85246 + (((tickAnim - 0) / 1) * (9.47038-(5.85246)));
        }
        else if (tickAnim >= 1 && tickAnim < 3) {
            xx = -2.34097 + (((tickAnim - 1) / 2) * (9.23824-(-2.34097)));
            yy = -19.76797 + (((tickAnim - 1) / 2) * (13.19185-(-19.76797)));
            zz = 9.47038 + (((tickAnim - 1) / 2) * (2.54076-(9.47038)));
        }
        else if (tickAnim >= 3 && tickAnim < 5) {
            xx = 9.23824 + (((tickAnim - 3) / 2) * (19.23843-(9.23824)));
            yy = 13.19185 + (((tickAnim - 3) / 2) * (51.9231-(13.19185)));
            zz = 2.54076 + (((tickAnim - 3) / 2) * (4.16449-(2.54076)));
        }
        else if (tickAnim >= 5 && tickAnim < 8) {
            xx = 19.23843 + (((tickAnim - 5) / 3) * (-4.19281-(19.23843)));
            yy = 51.9231 + (((tickAnim - 5) / 3) * (9.10034-(51.9231)));
            zz = 4.16449 + (((tickAnim - 5) / 3) * (23.16853-(4.16449)));
        }
        else if (tickAnim >= 8 && tickAnim < 10) {
            xx = -4.19281 + (((tickAnim - 8) / 2) * (-4.49641-(-4.19281)));
            yy = 9.10034 + (((tickAnim - 8) / 2) * (-32.60273-(9.10034)));
            zz = 23.16853 + (((tickAnim - 8) / 2) * (5.85246-(23.16853)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightLeg, rightLeg.rotateAngleX + (float) Math.toRadians(xx), rightLeg.rotateAngleY + (float) Math.toRadians(yy), rightLeg.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 5) {
            xx = 19.12584 + (((tickAnim - 0) / 5) * (5.16901-(19.12584)));
            yy = -50.36851 + (((tickAnim - 0) / 5) * (-8.68071-(-50.36851)));
            zz = 0.83049 + (((tickAnim - 0) / 5) * (-28.79897-(0.83049)));
        }
        else if (tickAnim >= 5 && tickAnim < 10) {
            xx = 5.16901 + (((tickAnim - 5) / 5) * (19.12584-(5.16901)));
            yy = -8.68071 + (((tickAnim - 5) / 5) * (-50.36851-(-8.68071)));
            zz = -28.79897 + (((tickAnim - 5) / 5) * (0.83049-(-28.79897)));
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
            zz = 0.2 + (((tickAnim - 0) / 10) * (0.2-(0.2)));
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
            xx = 18.9136 + (((tickAnim - 0) / 2) * (-4.19281-(18.9136)));
            yy = -52.08651 + (((tickAnim - 0) / 2) * (-9.10034-(-52.08651)));
            zz = -3.59107 + (((tickAnim - 0) / 2) * (-23.16853-(-3.59107)));
        }
        else if (tickAnim >= 2 && tickAnim < 4) {
            xx = -4.19281 + (((tickAnim - 2) / 2) * (-4.79435-(-4.19281)));
            yy = -9.10034 + (((tickAnim - 2) / 2) * (32.58248-(-9.10034)));
            zz = -23.16853 + (((tickAnim - 2) / 2) * (-6.24087-(-23.16853)));
        }
        else if (tickAnim >= 4 && tickAnim < 6) {
            xx = -4.79435 + (((tickAnim - 4) / 2) * (7.36387-(-4.79435)));
            yy = 32.58248 + (((tickAnim - 4) / 2) * (13.42593-(32.58248)));
            zz = -6.24087 + (((tickAnim - 4) / 2) * (-6.86522-(-6.24087)));
        }
        else if (tickAnim >= 6 && tickAnim < 8) {
            xx = 7.36387 + (((tickAnim - 6) / 2) * (13.32936-(7.36387)));
            yy = 13.42593 + (((tickAnim - 6) / 2) * (-12.51732-(13.42593)));
            zz = -6.86522 + (((tickAnim - 6) / 2) * (-5.98729-(-6.86522)));
        }
        else if (tickAnim >= 8 && tickAnim < 10) {
            xx = 13.32936 + (((tickAnim - 8) / 2) * (18.9136-(13.32936)));
            yy = -12.51732 + (((tickAnim - 8) / 2) * (-52.08651-(-12.51732)));
            zz = -5.98729 + (((tickAnim - 8) / 2) * (-3.59107-(-5.98729)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftLeg, leftLeg.rotateAngleX + (float) Math.toRadians(xx), leftLeg.rotateAngleY + (float) Math.toRadians(yy), leftLeg.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 4) {
            xx = 5.16901 + (((tickAnim - 0) / 4) * (19.12584-(5.16901)));
            yy = 8.68071 + (((tickAnim - 0) / 4) * (50.36851-(8.68071)));
            zz = 28.79897 + (((tickAnim - 0) / 4) * (-0.83049-(28.79897)));
        }
        else if (tickAnim >= 4 && tickAnim < 10) {
            xx = 19.12584 + (((tickAnim - 4) / 6) * (5.16901-(19.12584)));
            yy = 50.36851 + (((tickAnim - 4) / 6) * (8.68071-(50.36851)));
            zz = -0.83049 + (((tickAnim - 4) / 6) * (28.79897-(-0.83049)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftLeg2, leftLeg2.rotateAngleX + (float) Math.toRadians(xx), leftLeg2.rotateAngleY + (float) Math.toRadians(yy), leftLeg2.rotateAngleZ + (float) Math.toRadians(zz));

        this.leftLeg2.rotationPointX = this.leftLeg2.rotationPointX + (float)(0);
        this.leftLeg2.rotationPointY = this.leftLeg2.rotationPointY - (float)(0);
        this.leftLeg2.rotationPointZ = this.leftLeg2.rotationPointZ + (float)(0.2);


        this.setRotateAngle(tail1, tail1.rotateAngleX + (float) Math.toRadians(0), tail1.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/0.5-50))*-15), tail1.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(tail2, tail2.rotateAngleX + (float) Math.toRadians(0), tail2.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/0.5))*-15), tail2.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(tail3, tail3.rotateAngleX + (float) Math.toRadians(0), tail3.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/0.5-50))*-18), tail3.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(tail4, tail4.rotateAngleX + (float) Math.toRadians(0), tail4.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/0.5-100))*-20), tail4.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(tail5, tail5.rotateAngleX + (float) Math.toRadians(0), tail5.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/0.5-150))*-20), tail5.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(body, body.rotateAngleX + (float) Math.toRadians(0), body.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/0.5-120))*-15), body.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(chest, chest.rotateAngleX + (float) Math.toRadians(0), chest.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/0.5-150))*-15), chest.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/0.5+90))*4));



        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 89.77299 + (((tickAnim - 0) / 3) * (80.10291-(89.77299)));
            yy = 28.1933 + (((tickAnim - 0) / 3) * (-8.88536-(28.1933)));
            zz = 40.69718 + (((tickAnim - 0) / 3) * (67.33274-(40.69718)));
        }
        else if (tickAnim >= 3 && tickAnim < 5) {
            xx = 80.10291 + (((tickAnim - 3) / 2) * (31.37605-(80.10291)));
            yy = -8.88536 + (((tickAnim - 3) / 2) * (-48.04009-(-8.88536)));
            zz = 67.33274 + (((tickAnim - 3) / 2) * (10.22557-(67.33274)));
        }
        else if (tickAnim >= 5 && tickAnim < 10) {
            xx = 31.37605 + (((tickAnim - 5) / 5) * (89.77299-(31.37605)));
            yy = -48.04009 + (((tickAnim - 5) / 5) * (28.1933-(-48.04009)));
            zz = 10.22557 + (((tickAnim - 5) / 5) * (40.69718-(10.22557)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightArm, rightArm.rotateAngleX + (float) Math.toRadians(xx), rightArm.rotateAngleY + (float) Math.toRadians(yy), rightArm.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 5) {
            xx = 31.37605 + (((tickAnim - 0) / 5) * (89.77299-(31.37605)));
            yy = 48.04009 + (((tickAnim - 0) / 5) * (-28.1933-(48.04009)));
            zz = -10.22557 + (((tickAnim - 0) / 5) * (-40.69718-(-10.22557)));
        }
        else if (tickAnim >= 5 && tickAnim < 8) {
            xx = 89.77299 + (((tickAnim - 5) / 3) * (80.10291-(89.77299)));
            yy = -28.1933 + (((tickAnim - 5) / 3) * (8.88536-(-28.1933)));
            zz = -40.69718 + (((tickAnim - 5) / 3) * (-67.33274-(-40.69718)));
        }
        else if (tickAnim >= 8 && tickAnim < 10) {
            xx = 80.10291 + (((tickAnim - 8) / 2) * (31.37605-(80.10291)));
            yy = 8.88536 + (((tickAnim - 8) / 2) * (48.04009-(8.88536)));
            zz = -67.33274 + (((tickAnim - 8) / 2) * (-10.22557-(-67.33274)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftArm, leftArm.rotateAngleX + (float) Math.toRadians(xx), leftArm.rotateAngleY + (float) Math.toRadians(yy), leftArm.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 1) {
            xx = 0 + (((tickAnim - 0) / 1) * (-3.17978-(0)));
            yy = 0 + (((tickAnim - 0) / 1) * (31.0211-(0)));
            zz = -11.5 + (((tickAnim - 0) / 1) * (-21.27536-(-11.5)));
        }
        else if (tickAnim >= 1 && tickAnim < 3) {
            xx = -3.17978 + (((tickAnim - 1) / 2) * (-46.28842-(-3.17978)));
            yy = 31.0211 + (((tickAnim - 1) / 2) * (57.17329-(31.0211)));
            zz = -21.27536 + (((tickAnim - 1) / 2) * (-56.97347-(-21.27536)));
        }
        else if (tickAnim >= 3 && tickAnim < 5) {
            xx = -46.28842 + (((tickAnim - 3) / 2) * (0-(-46.28842)));
            yy = 57.17329 + (((tickAnim - 3) / 2) * (0-(57.17329)));
            zz = -56.97347 + (((tickAnim - 3) / 2) * (0-(-56.97347)));
        }
        else if (tickAnim >= 5 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 5) / 3) * (0-(0)));
            yy = 0 + (((tickAnim - 5) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 5) / 3) * (18.75-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 8) / 0) * (-13.5-(0)));
            yy = 0 + (((tickAnim - 8) / 0) * (0-(0)));
            zz = 18.75 + (((tickAnim - 8) / 0) * (-17.37-(18.75)));
        }
        else if (tickAnim >= 8 && tickAnim < 9) {
            xx = -13.5 + (((tickAnim - 8) / 1) * (-4.48295-(-13.5)));
            yy = 0 + (((tickAnim - 8) / 1) * (-0.3918-(0)));
            zz = -17.37 + (((tickAnim - 8) / 1) * (-18.44133-(-17.37)));
        }
        else if (tickAnim >= 9 && tickAnim < 10) {
            xx = -4.48295 + (((tickAnim - 9) / 1) * (0-(-4.48295)));
            yy = -0.3918 + (((tickAnim - 9) / 1) * (0-(-0.3918)));
            zz = -18.44133 + (((tickAnim - 9) / 1) * (-11.5-(-18.44133)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftHand, leftHand.rotateAngleX + (float) Math.toRadians(xx), leftHand.rotateAngleY + (float) Math.toRadians(yy), leftHand.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 1) {
            xx = 0 + (((tickAnim - 0) / 1) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 1) * (0.45-(0)));
            zz = 0 + (((tickAnim - 0) / 1) * (0-(0)));
        }
        else if (tickAnim >= 1 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 1) / 7) * (-1.075-(0)));
            yy = 0.45 + (((tickAnim - 1) / 7) * (0.445-(0.45)));
            zz = 0 + (((tickAnim - 1) / 7) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 8) {
            xx = -1.075 + (((tickAnim - 8) / 0) * (-0.54-(-1.075)));
            yy = 0.445 + (((tickAnim - 8) / 0) * (0.37-(0.445)));
            zz = 0 + (((tickAnim - 8) / 0) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 10) {
            xx = -0.54 + (((tickAnim - 8) / 2) * (0-(-0.54)));
            yy = 0.37 + (((tickAnim - 8) / 2) * (0-(0.37)));
            zz = 0 + (((tickAnim - 8) / 2) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.leftHand.rotationPointX = this.leftHand.rotationPointX + (float)(xx);
        this.leftHand.rotationPointY = this.leftHand.rotationPointY - (float)(yy);
        this.leftHand.rotationPointZ = this.leftHand.rotationPointZ + (float)(zz);



        this.setRotateAngle(neck1, neck1.rotateAngleX + (float) Math.toRadians(0), neck1.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/0.5-180))*15), neck1.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(head, head.rotateAngleX + (float) Math.toRadians(0), head.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/0.5-300))*-10), head.rotateAngleZ + (float) Math.toRadians(0));



        if (tickAnim >= 0 && tickAnim < 5) {
            xx = -11.53018 + (((tickAnim - 0) / 5) * (-125.4152-(-11.53018)));
            yy = -18.54283 + (((tickAnim - 0) / 5) * (-83.76797-(-18.54283)));
            zz = 14.94471 + (((tickAnim - 0) / 5) * (149.15883-(14.94471)));
        }
        else if (tickAnim >= 5 && tickAnim < 8) {
            xx = -125.4152 + (((tickAnim - 5) / 3) * (-15.73426-(-125.4152)));
            yy = -83.76797 + (((tickAnim - 5) / 3) * (-15.36164-(-83.76797)));
            zz = 149.15883 + (((tickAnim - 5) / 3) * (30.29551-(149.15883)));
        }
        else if (tickAnim >= 8 && tickAnim < 10) {
            xx = -15.73426 + (((tickAnim - 8) / 2) * (-11.53018-(-15.73426)));
            yy = -15.36164 + (((tickAnim - 8) / 2) * (-18.54283-(-15.36164)));
            zz = 30.29551 + (((tickAnim - 8) / 2) * (14.94471-(30.29551)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftArm2w, leftArm2w.rotateAngleX + (float) Math.toRadians(xx), leftArm2w.rotateAngleY + (float) Math.toRadians(yy), leftArm2w.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 3) {
            xx = -125.4152 + (((tickAnim - 0) / 3) * (-15.73426-(-125.4152)));
            yy = 83.76797 + (((tickAnim - 0) / 3) * (15.36164-(83.76797)));
            zz = -149.15883 + (((tickAnim - 0) / 3) * (-30.29551-(-149.15883)));
        }
        else if (tickAnim >= 3 && tickAnim < 5) {
            xx = -15.73426 + (((tickAnim - 3) / 2) * (-11.53018-(-15.73426)));
            yy = 15.36164 + (((tickAnim - 3) / 2) * (18.54283-(15.36164)));
            zz = -30.29551 + (((tickAnim - 3) / 2) * (-14.94471-(-30.29551)));
        }
        else if (tickAnim >= 5 && tickAnim < 10) {
            xx = -11.53018 + (((tickAnim - 5) / 5) * (-125.4152-(-11.53018)));
            yy = 18.54283 + (((tickAnim - 5) / 5) * (83.76797-(18.54283)));
            zz = -14.94471 + (((tickAnim - 5) / 5) * (-149.15883-(-14.94471)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightArm2w, rightArm2w.rotateAngleX + (float) Math.toRadians(xx), rightArm2w.rotateAngleY + (float) Math.toRadians(yy), rightArm2w.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 3) * (-16.75-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 3) {
            xx = 0 + (((tickAnim - 3) / 0) * (-21.11572-(0)));
            yy = 0 + (((tickAnim - 3) / 0) * (2.44154-(0)));
            zz = -16.75 + (((tickAnim - 3) / 0) * (23.66487-(-16.75)));
        }
        else if (tickAnim >= 3 && tickAnim < 4) {
            xx = -21.11572 + (((tickAnim - 3) / 1) * (-13.96582-(-21.11572)));
            yy = 2.44154 + (((tickAnim - 3) / 1) * (2.41532-(2.44154)));
            zz = 23.66487 + (((tickAnim - 3) / 1) * (22.76502-(23.66487)));
        }
        else if (tickAnim >= 4 && tickAnim < 5) {
            xx = -13.96582 + (((tickAnim - 4) / 1) * (2.75-(-13.96582)));
            yy = 2.41532 + (((tickAnim - 4) / 1) * (0-(2.41532)));
            zz = 22.76502 + (((tickAnim - 4) / 1) * (10-(22.76502)));
        }
        else if (tickAnim >= 5 && tickAnim < 6) {
            xx = 2.75 + (((tickAnim - 5) / 1) * (2.03963-(2.75)));
            yy = 0 + (((tickAnim - 5) / 1) * (-19.24431-(0)));
            zz = 10 + (((tickAnim - 5) / 1) * (17.83503-(10)));
        }
        else if (tickAnim >= 6 && tickAnim < 7) {
            xx = 2.03963 + (((tickAnim - 6) / 1) * (-11.2698-(2.03963)));
            yy = -19.24431 + (((tickAnim - 6) / 1) * (-38.64729-(-19.24431)));
            zz = 17.83503 + (((tickAnim - 6) / 1) * (32.02458-(17.83503)));
        }
        else if (tickAnim >= 7 && tickAnim < 8) {
            xx = -11.2698 + (((tickAnim - 7) / 1) * (-42.7817-(-11.2698)));
            yy = -38.64729 + (((tickAnim - 7) / 1) * (-59.95631-(-38.64729)));
            zz = 32.02458 + (((tickAnim - 7) / 1) * (63.87481-(32.02458)));
        }
        else if (tickAnim >= 8 && tickAnim < 10) {
            xx = -42.7817 + (((tickAnim - 8) / 2) * (0-(-42.7817)));
            yy = -59.95631 + (((tickAnim - 8) / 2) * (0-(-59.95631)));
            zz = 63.87481 + (((tickAnim - 8) / 2) * (0-(63.87481)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightHand, rightHand.rotateAngleX + (float) Math.toRadians(xx), rightHand.rotateAngleY + (float) Math.toRadians(yy), rightHand.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 0 + (((tickAnim - 0) / 3) * (0.15-(0)));
            yy = 0 + (((tickAnim - 0) / 3) * (0.35-(0)));
            zz = 0 + (((tickAnim - 0) / 3) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 3) {
            xx = 0.15 + (((tickAnim - 3) / 0) * (-0.54-(0.15)));
            yy = 0.35 + (((tickAnim - 3) / 0) * (0.37-(0.35)));
            zz = 0 + (((tickAnim - 3) / 0) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 5) {
            xx = -0.54 + (((tickAnim - 3) / 2) * (0-(-0.54)));
            yy = 0.37 + (((tickAnim - 3) / 2) * (0-(0.37)));
            zz = 0 + (((tickAnim - 3) / 2) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 6) {
            xx = 0 + (((tickAnim - 5) / 1) * (0-(0)));
            yy = 0 + (((tickAnim - 5) / 1) * (0.45-(0)));
            zz = 0 + (((tickAnim - 5) / 1) * (0-(0)));
        }
        else if (tickAnim >= 6 && tickAnim < 7) {
            xx = 0 + (((tickAnim - 6) / 1) * (0-(0)));
            yy = 0.45 + (((tickAnim - 6) / 1) * (0.45-(0.45)));
            zz = 0 + (((tickAnim - 6) / 1) * (0-(0)));
        }
        else if (tickAnim >= 7 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 7) / 1) * (0.175-(0)));
            yy = 0.45 + (((tickAnim - 7) / 1) * (0.13-(0.45)));
            zz = 0 + (((tickAnim - 7) / 1) * (-0.2-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 10) {
            xx = 0.175 + (((tickAnim - 8) / 2) * (0-(0.175)));
            yy = 0.13 + (((tickAnim - 8) / 2) * (0-(0.13)));
            zz = -0.2 + (((tickAnim - 8) / 2) * (0-(-0.2)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.rightHand.rotationPointX = this.rightHand.rotationPointX + (float)(xx);
        this.rightHand.rotationPointY = this.rightHand.rotationPointY - (float)(yy);
        this.rightHand.rotationPointZ = this.rightHand.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 10.81659 + (((tickAnim - 0) / 3) * (-30.08525-(10.81659)));
            yy = -32.55734 + (((tickAnim - 0) / 3) * (-71.41787-(-32.55734)));
            zz = 4.08721 + (((tickAnim - 0) / 3) * (45.89538-(4.08721)));
        }
        else if (tickAnim >= 3 && tickAnim < 5) {
            xx = -30.08525 + (((tickAnim - 3) / 2) * (4.6839-(-30.08525)));
            yy = -71.41787 + (((tickAnim - 3) / 2) * (15.91675-(-71.41787)));
            zz = 45.89538 + (((tickAnim - 3) / 2) * (-13.33305-(45.89538)));
        }
        else if (tickAnim >= 5 && tickAnim < 8) {
            xx = 4.6839 + (((tickAnim - 5) / 3) * (45.48428-(4.6839)));
            yy = 15.91675 + (((tickAnim - 5) / 3) * (17.23246-(15.91675)));
            zz = -13.33305 + (((tickAnim - 5) / 3) * (18.07183-(-13.33305)));
        }
        else if (tickAnim >= 8 && tickAnim < 8) {
            xx = 45.48428 + (((tickAnim - 8) / 0) * (10.74214-(45.48428)));
            yy = 17.23246 + (((tickAnim - 8) / 0) * (8.61623-(17.23246)));
            zz = 18.07183 + (((tickAnim - 8) / 0) * (9.03591-(18.07183)));
        }
        else if (tickAnim >= 8 && tickAnim < 10) {
            xx = 10.74214 + (((tickAnim - 8) / 2) * (10.81659-(10.74214)));
            yy = 8.61623 + (((tickAnim - 8) / 2) * (-32.55734-(8.61623)));
            zz = 9.03591 + (((tickAnim - 8) / 2) * (4.08721-(9.03591)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightFootw, rightFootw.rotateAngleX + (float) Math.toRadians(xx), rightFootw.rotateAngleY + (float) Math.toRadians(yy), rightFootw.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 0) / 5) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 5) * (0.25-(0)));
            zz = 0 + (((tickAnim - 0) / 5) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 5) / 3) * (0-(0)));
            yy = 0.25 + (((tickAnim - 5) / 3) * (0.55-(0.25)));
            zz = 0 + (((tickAnim - 5) / 3) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 8) / 2) * (0-(0)));
            yy = 0.55 + (((tickAnim - 8) / 2) * (0-(0.55)));
            zz = 0 + (((tickAnim - 8) / 2) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.rightFootw.rotationPointX = this.rightFootw.rotationPointX + (float)(xx);
        this.rightFootw.rotationPointY = this.rightFootw.rotationPointY - (float)(yy);
        this.rightFootw.rotationPointZ = this.rightFootw.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 2) {
            xx = 4.6839 + (((tickAnim - 0) / 2) * (45.48428-(4.6839)));
            yy = -15.91675 + (((tickAnim - 0) / 2) * (-17.23246-(-15.91675)));
            zz = 13.33305 + (((tickAnim - 0) / 2) * (-18.07183-(13.33305)));
        }
        else if (tickAnim >= 2 && tickAnim < 3) {
            xx = 45.48428 + (((tickAnim - 2) / 1) * (10.74214-(45.48428)));
            yy = -17.23246 + (((tickAnim - 2) / 1) * (-8.61623-(-17.23246)));
            zz = -18.07183 + (((tickAnim - 2) / 1) * (-9.03591-(-18.07183)));
        }
        else if (tickAnim >= 3 && tickAnim < 4) {
            xx = 10.74214 + (((tickAnim - 3) / 1) * (10.81659-(10.74214)));
            yy = -8.61623 + (((tickAnim - 3) / 1) * (32.55734-(-8.61623)));
            zz = -9.03591 + (((tickAnim - 3) / 1) * (-4.08721-(-9.03591)));
        }
        else if (tickAnim >= 4 && tickAnim < 6) {
            xx = 10.81659 + (((tickAnim - 4) / 2) * (-9.71277-(10.81659)));
            yy = 32.55734 + (((tickAnim - 4) / 2) * (49.21185-(32.55734)));
            zz = -4.08721 + (((tickAnim - 4) / 2) * (-22.005-(-4.08721)));
        }
        else if (tickAnim >= 6 && tickAnim < 8) {
            xx = -9.71277 + (((tickAnim - 6) / 2) * (-30.08525-(-9.71277)));
            yy = 49.21185 + (((tickAnim - 6) / 2) * (71.41787-(49.21185)));
            zz = -22.005 + (((tickAnim - 6) / 2) * (-45.89538-(-22.005)));
        }
        else if (tickAnim >= 8 && tickAnim < 10) {
            xx = -30.08525 + (((tickAnim - 8) / 2) * (4.6839-(-30.08525)));
            yy = 71.41787 + (((tickAnim - 8) / 2) * (-15.91675-(71.41787)));
            zz = -45.89538 + (((tickAnim - 8) / 2) * (13.33305-(-45.89538)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftFootw, leftFootw.rotateAngleX + (float) Math.toRadians(xx), leftFootw.rotateAngleY + (float) Math.toRadians(yy), leftFootw.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 2) {
            xx = 0 + (((tickAnim - 0) / 2) * (0-(0)));
            yy = 0.25 + (((tickAnim - 0) / 2) * (0.55-(0.25)));
            zz = 0 + (((tickAnim - 0) / 2) * (0-(0)));
        }
        else if (tickAnim >= 2 && tickAnim < 4) {
            xx = 0 + (((tickAnim - 2) / 2) * (0-(0)));
            yy = 0.55 + (((tickAnim - 2) / 2) * (0-(0.55)));
            zz = 0 + (((tickAnim - 2) / 2) * (0-(0)));
        }
        else if (tickAnim >= 4 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 4) / 6) * (0-(0)));
            yy = 0 + (((tickAnim - 4) / 6) * (0.25-(0)));
            zz = 0 + (((tickAnim - 4) / 6) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.leftFootw.rotationPointX = this.leftFootw.rotationPointX + (float)(xx);
        this.leftFootw.rotationPointY = this.leftFootw.rotationPointY - (float)(yy);
        this.leftFootw.rotationPointZ = this.leftFootw.rotationPointZ + (float)(zz);


    }
    public void animWalk(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime) {
        EntityPrehistoricFloraEichstaettisaurus entity = (EntityPrehistoricFloraEichstaettisaurus) entitylivingbaseIn;
        int animCycle = 20;
        double tickAnim = (entity.ticksExisted + entity.getTickOffset()) - (int) (Math.floor((double) (entity.ticksExisted + entity.getTickOffset()) / (double) animCycle) * (double) animCycle) + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;
        this.setRotateAngle(root, root.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/0.5))), root.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180/0.5-90))*6), root.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180/0.5-90))*5));
        this.root.rotationPointX = this.root.rotationPointX + (float)(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180/0.5))*0.5);
        this.root.rotationPointY = this.root.rotationPointY - (float)(0);
        this.root.rotationPointZ = this.root.rotationPointZ + (float)(0);



        if (tickAnim >= 0 && tickAnim < 2) {
            xx = -4.49641 + (((tickAnim - 0) / 2) * (-2.34097-(-4.49641)));
            yy = -32.60273 + (((tickAnim - 0) / 2) * (-19.76797-(-32.60273)));
            zz = 5.85246 + (((tickAnim - 0) / 2) * (9.47038-(5.85246)));
        }
        else if (tickAnim >= 2 && tickAnim < 6) {
            xx = -2.34097 + (((tickAnim - 2) / 4) * (9.23824-(-2.34097)));
            yy = -19.76797 + (((tickAnim - 2) / 4) * (13.19185-(-19.76797)));
            zz = 9.47038 + (((tickAnim - 2) / 4) * (2.54076-(9.47038)));
        }
        else if (tickAnim >= 6 && tickAnim < 11) {
            xx = 9.23824 + (((tickAnim - 6) / 5) * (19.23843-(9.23824)));
            yy = 13.19185 + (((tickAnim - 6) / 5) * (51.9231-(13.19185)));
            zz = 2.54076 + (((tickAnim - 6) / 5) * (4.16449-(2.54076)));
        }
        else if (tickAnim >= 11 && tickAnim < 15) {
            xx = 19.23843 + (((tickAnim - 11) / 4) * (-4.19281-(19.23843)));
            yy = 51.9231 + (((tickAnim - 11) / 4) * (9.10034-(51.9231)));
            zz = 4.16449 + (((tickAnim - 11) / 4) * (23.16853-(4.16449)));
        }
        else if (tickAnim >= 15 && tickAnim < 20) {
            xx = -4.19281 + (((tickAnim - 15) / 5) * (-4.49641-(-4.19281)));
            yy = 9.10034 + (((tickAnim - 15) / 5) * (-32.60273-(9.10034)));
            zz = 23.16853 + (((tickAnim - 15) / 5) * (5.85246-(23.16853)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightLeg, rightLeg.rotateAngleX + (float) Math.toRadians(xx), rightLeg.rotateAngleY + (float) Math.toRadians(yy), rightLeg.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 11) {
            xx = 19.12584 + (((tickAnim - 0) / 11) * (5.16901-(19.12584)));
            yy = -50.36851 + (((tickAnim - 0) / 11) * (-8.68071-(-50.36851)));
            zz = 0.83049 + (((tickAnim - 0) / 11) * (-28.79897-(0.83049)));
        }
        else if (tickAnim >= 11 && tickAnim < 20) {
            xx = 5.16901 + (((tickAnim - 11) / 9) * (19.12584-(5.16901)));
            yy = -8.68071 + (((tickAnim - 11) / 9) * (-50.36851-(-8.68071)));
            zz = -28.79897 + (((tickAnim - 11) / 9) * (0.83049-(-28.79897)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightLeg2, rightLeg2.rotateAngleX + (float) Math.toRadians(xx), rightLeg2.rotateAngleY + (float) Math.toRadians(yy), rightLeg2.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 0) / 20) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 20) * (0-(0)));
            zz = 0.2 + (((tickAnim - 0) / 20) * (0.2-(0.2)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.rightLeg2.rotationPointX = this.rightLeg2.rotationPointX + (float)(xx);
        this.rightLeg2.rotationPointY = this.rightLeg2.rotationPointY - (float)(yy);
        this.rightLeg2.rotationPointZ = this.rightLeg2.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 4) {
            xx = 18.9136 + (((tickAnim - 0) / 4) * (-4.19281-(18.9136)));
            yy = -52.08651 + (((tickAnim - 0) / 4) * (-9.10034-(-52.08651)));
            zz = -3.59107 + (((tickAnim - 0) / 4) * (-23.16853-(-3.59107)));
        }
        else if (tickAnim >= 4 && tickAnim < 9) {
            xx = -4.19281 + (((tickAnim - 4) / 5) * (-4.79435-(-4.19281)));
            yy = -9.10034 + (((tickAnim - 4) / 5) * (32.58248-(-9.10034)));
            zz = -23.16853 + (((tickAnim - 4) / 5) * (-6.24087-(-23.16853)));
        }
        else if (tickAnim >= 9 && tickAnim < 12) {
            xx = -4.79435 + (((tickAnim - 9) / 3) * (7.36387-(-4.79435)));
            yy = 32.58248 + (((tickAnim - 9) / 3) * (13.42593-(32.58248)));
            zz = -6.24087 + (((tickAnim - 9) / 3) * (-6.86522-(-6.24087)));
        }
        else if (tickAnim >= 12 && tickAnim < 15) {
            xx = 7.36387 + (((tickAnim - 12) / 3) * (13.32936-(7.36387)));
            yy = 13.42593 + (((tickAnim - 12) / 3) * (-12.51732-(13.42593)));
            zz = -6.86522 + (((tickAnim - 12) / 3) * (-5.98729-(-6.86522)));
        }
        else if (tickAnim >= 15 && tickAnim < 20) {
            xx = 13.32936 + (((tickAnim - 15) / 5) * (18.9136-(13.32936)));
            yy = -12.51732 + (((tickAnim - 15) / 5) * (-52.08651-(-12.51732)));
            zz = -5.98729 + (((tickAnim - 15) / 5) * (-3.59107-(-5.98729)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftLeg, leftLeg.rotateAngleX + (float) Math.toRadians(xx), leftLeg.rotateAngleY + (float) Math.toRadians(yy), leftLeg.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 9) {
            xx = 5.16901 + (((tickAnim - 0) / 9) * (19.12584-(5.16901)));
            yy = 8.68071 + (((tickAnim - 0) / 9) * (50.36851-(8.68071)));
            zz = 28.79897 + (((tickAnim - 0) / 9) * (-0.83049-(28.79897)));
        }
        else if (tickAnim >= 9 && tickAnim < 20) {
            xx = 19.12584 + (((tickAnim - 9) / 11) * (5.16901-(19.12584)));
            yy = 50.36851 + (((tickAnim - 9) / 11) * (8.68071-(50.36851)));
            zz = -0.83049 + (((tickAnim - 9) / 11) * (28.79897-(-0.83049)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftLeg2, leftLeg2.rotateAngleX + (float) Math.toRadians(xx), leftLeg2.rotateAngleY + (float) Math.toRadians(yy), leftLeg2.rotateAngleZ + (float) Math.toRadians(zz));

        this.leftLeg2.rotationPointX = this.leftLeg2.rotationPointX + (float)(0);
        this.leftLeg2.rotationPointY = this.leftLeg2.rotationPointY - (float)(0);
        this.leftLeg2.rotationPointZ = this.leftLeg2.rotationPointZ + (float)(0.2);


        this.setRotateAngle(tail1, tail1.rotateAngleX + (float) Math.toRadians(0), tail1.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180/0.5-50))*-3), tail1.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(tail2, tail2.rotateAngleX + (float) Math.toRadians(0), tail2.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180/0.5))*-3), tail2.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(tail3, tail3.rotateAngleX + (float) Math.toRadians(0), tail3.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180/0.5-50))*-6), tail3.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(tail4, tail4.rotateAngleX + (float) Math.toRadians(0), tail4.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180/0.5-100))*-6), tail4.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(tail5, tail5.rotateAngleX + (float) Math.toRadians(0), tail5.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180/0.5-150))*-6), tail5.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(body, body.rotateAngleX + (float) Math.toRadians(0), body.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180/0.5-120))*-6), body.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(chest, chest.rotateAngleX + (float) Math.toRadians(0), chest.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180/0.5-150))*-3), chest.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180/0.5+90))*4));



        if (tickAnim >= 0 && tickAnim < 5) {
            xx = 89.77299 + (((tickAnim - 0) / 5) * (80.10291-(89.77299)));
            yy = 28.1933 + (((tickAnim - 0) / 5) * (-8.88536-(28.1933)));
            zz = 40.69718 + (((tickAnim - 0) / 5) * (67.33274-(40.69718)));
        }
        else if (tickAnim >= 5 && tickAnim < 10) {
            xx = 80.10291 + (((tickAnim - 5) / 5) * (31.37605-(80.10291)));
            yy = -8.88536 + (((tickAnim - 5) / 5) * (-48.04009-(-8.88536)));
            zz = 67.33274 + (((tickAnim - 5) / 5) * (10.22557-(67.33274)));
        }
        else if (tickAnim >= 10 && tickAnim < 20) {
            xx = 31.37605 + (((tickAnim - 10) / 10) * (89.77299-(31.37605)));
            yy = -48.04009 + (((tickAnim - 10) / 10) * (28.1933-(-48.04009)));
            zz = 10.22557 + (((tickAnim - 10) / 10) * (40.69718-(10.22557)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightArm, rightArm.rotateAngleX + (float) Math.toRadians(xx), rightArm.rotateAngleY + (float) Math.toRadians(yy), rightArm.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 31.37605 + (((tickAnim - 0) / 10) * (89.77299-(31.37605)));
            yy = 48.04009 + (((tickAnim - 0) / 10) * (-28.1933-(48.04009)));
            zz = -10.22557 + (((tickAnim - 0) / 10) * (-40.69718-(-10.22557)));
        }
        else if (tickAnim >= 10 && tickAnim < 15) {
            xx = 89.77299 + (((tickAnim - 10) / 5) * (80.10291-(89.77299)));
            yy = -28.1933 + (((tickAnim - 10) / 5) * (8.88536-(-28.1933)));
            zz = -40.69718 + (((tickAnim - 10) / 5) * (-67.33274-(-40.69718)));
        }
        else if (tickAnim >= 15 && tickAnim < 20) {
            xx = 80.10291 + (((tickAnim - 15) / 5) * (31.37605-(80.10291)));
            yy = 8.88536 + (((tickAnim - 15) / 5) * (48.04009-(8.88536)));
            zz = -67.33274 + (((tickAnim - 15) / 5) * (-10.22557-(-67.33274)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftArm, leftArm.rotateAngleX + (float) Math.toRadians(xx), leftArm.rotateAngleY + (float) Math.toRadians(yy), leftArm.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 2) {
            xx = 0 + (((tickAnim - 0) / 2) * (3.13015-(0)));
            yy = 0 + (((tickAnim - 0) / 2) * (20.68073-(0)));
            zz = -11.5 + (((tickAnim - 0) / 2) * (-18.01691-(-11.5)));
        }
        else if (tickAnim >= 2 && tickAnim < 3) {
            xx = 3.13015 + (((tickAnim - 2) / 1) * (-3.17978-(3.13015)));
            yy = 20.68073 + (((tickAnim - 2) / 1) * (31.0211-(20.68073)));
            zz = -18.01691 + (((tickAnim - 2) / 1) * (-21.27536-(-18.01691)));
        }
        else if (tickAnim >= 3 && tickAnim < 5) {
            xx = -3.17978 + (((tickAnim - 3) / 2) * (-46.28842-(-3.17978)));
            yy = 31.0211 + (((tickAnim - 3) / 2) * (57.17329-(31.0211)));
            zz = -21.27536 + (((tickAnim - 3) / 2) * (-56.97347-(-21.27536)));
        }
        else if (tickAnim >= 5 && tickAnim < 10) {
            xx = -46.28842 + (((tickAnim - 5) / 5) * (0-(-46.28842)));
            yy = 57.17329 + (((tickAnim - 5) / 5) * (0-(57.17329)));
            zz = -56.97347 + (((tickAnim - 5) / 5) * (0-(-56.97347)));
        }
        else if (tickAnim >= 10 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 10) / 5) * (0-(0)));
            yy = 0 + (((tickAnim - 10) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 5) * (18.75-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 18) {
            xx = 0 + (((tickAnim - 15) / 3) * (-13.5-(0)));
            yy = 0 + (((tickAnim - 15) / 3) * (0-(0)));
            zz = 18.75 + (((tickAnim - 15) / 3) * (-17.37-(18.75)));
        }
        else if (tickAnim >= 18 && tickAnim < 19) {
            xx = -13.5 + (((tickAnim - 18) / 1) * (-4.48295-(-13.5)));
            yy = 0 + (((tickAnim - 18) / 1) * (-0.3918-(0)));
            zz = -17.37 + (((tickAnim - 18) / 1) * (-18.44133-(-17.37)));
        }
        else if (tickAnim >= 19 && tickAnim < 20) {
            xx = -4.48295 + (((tickAnim - 19) / 1) * (0-(-4.48295)));
            yy = -0.3918 + (((tickAnim - 19) / 1) * (0-(-0.3918)));
            zz = -18.44133 + (((tickAnim - 19) / 1) * (-11.5-(-18.44133)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftHand, leftHand.rotateAngleX + (float) Math.toRadians(xx), leftHand.rotateAngleY + (float) Math.toRadians(yy), leftHand.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 3) * (0.45-(0)));
            zz = 0 + (((tickAnim - 0) / 3) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 3) / 12) * (-1.075-(0)));
            yy = 0.45 + (((tickAnim - 3) / 12) * (0.445-(0.45)));
            zz = 0 + (((tickAnim - 3) / 12) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 18) {
            xx = -1.075 + (((tickAnim - 15) / 3) * (-0.54-(-1.075)));
            yy = 0.445 + (((tickAnim - 15) / 3) * (0.37-(0.445)));
            zz = 0 + (((tickAnim - 15) / 3) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 20) {
            xx = -0.54 + (((tickAnim - 18) / 2) * (0-(-0.54)));
            yy = 0.37 + (((tickAnim - 18) / 2) * (0-(0.37)));
            zz = 0 + (((tickAnim - 18) / 2) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.leftHand.rotationPointX = this.leftHand.rotationPointX + (float)(xx);
        this.leftHand.rotationPointY = this.leftHand.rotationPointY - (float)(yy);
        this.leftHand.rotationPointZ = this.leftHand.rotationPointZ + (float)(zz);



        this.setRotateAngle(neck1, neck1.rotateAngleX + (float) Math.toRadians(0), neck1.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180/0.5-200))*3), neck1.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(head, head.rotateAngleX + (float) Math.toRadians(0), head.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180/0.5-350))*-3), head.rotateAngleZ + (float) Math.toRadians(0));



        if (tickAnim >= 0 && tickAnim < 10) {
            xx = -11.53018 + (((tickAnim - 0) / 10) * (-125.4152-(-11.53018)));
            yy = -18.54283 + (((tickAnim - 0) / 10) * (-83.76797-(-18.54283)));
            zz = 14.94471 + (((tickAnim - 0) / 10) * (149.15883-(14.94471)));
        }
        else if (tickAnim >= 10 && tickAnim < 15) {
            xx = -125.4152 + (((tickAnim - 10) / 5) * (-15.73426-(-125.4152)));
            yy = -83.76797 + (((tickAnim - 10) / 5) * (-15.36164-(-83.76797)));
            zz = 149.15883 + (((tickAnim - 10) / 5) * (30.29551-(149.15883)));
        }
        else if (tickAnim >= 15 && tickAnim < 20) {
            xx = -15.73426 + (((tickAnim - 15) / 5) * (-11.53018-(-15.73426)));
            yy = -15.36164 + (((tickAnim - 15) / 5) * (-18.54283-(-15.36164)));
            zz = 30.29551 + (((tickAnim - 15) / 5) * (14.94471-(30.29551)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftArm2w, leftArm2w.rotateAngleX + (float) Math.toRadians(xx), leftArm2w.rotateAngleY + (float) Math.toRadians(yy), leftArm2w.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 5) {
            xx = -125.4152 + (((tickAnim - 0) / 5) * (-15.73426-(-125.4152)));
            yy = 83.76797 + (((tickAnim - 0) / 5) * (15.36164-(83.76797)));
            zz = -149.15883 + (((tickAnim - 0) / 5) * (-30.29551-(-149.15883)));
        }
        else if (tickAnim >= 5 && tickAnim < 10) {
            xx = -15.73426 + (((tickAnim - 5) / 5) * (-11.53018-(-15.73426)));
            yy = 15.36164 + (((tickAnim - 5) / 5) * (18.54283-(15.36164)));
            zz = -30.29551 + (((tickAnim - 5) / 5) * (-14.94471-(-30.29551)));
        }
        else if (tickAnim >= 10 && tickAnim < 20) {
            xx = -11.53018 + (((tickAnim - 10) / 10) * (-125.4152-(-11.53018)));
            yy = 18.54283 + (((tickAnim - 10) / 10) * (83.76797-(18.54283)));
            zz = -14.94471 + (((tickAnim - 10) / 10) * (-149.15883-(-14.94471)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightArm2w, rightArm2w.rotateAngleX + (float) Math.toRadians(xx), rightArm2w.rotateAngleY + (float) Math.toRadians(yy), rightArm2w.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 0) / 5) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 5) * (-16.75-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 7) {
            xx = 0 + (((tickAnim - 5) / 2) * (-22.92858-(0)));
            yy = 0 + (((tickAnim - 5) / 2) * (2.83115-(0)));
            zz = -16.75 + (((tickAnim - 5) / 2) * (14.01087-(-16.75)));
        }
        else if (tickAnim >= 7 && tickAnim < 8) {
            xx = -22.92858 + (((tickAnim - 7) / 1) * (-21.11572-(-22.92858)));
            yy = 2.83115 + (((tickAnim - 7) / 1) * (2.44154-(2.83115)));
            zz = 14.01087 + (((tickAnim - 7) / 1) * (23.66487-(14.01087)));
        }
        else if (tickAnim >= 8 && tickAnim < 8) {
            xx = -21.11572 + (((tickAnim - 8) / 0) * (-13.96582-(-21.11572)));
            yy = 2.44154 + (((tickAnim - 8) / 0) * (2.41532-(2.44154)));
            zz = 23.66487 + (((tickAnim - 8) / 0) * (22.76502-(23.66487)));
        }
        else if (tickAnim >= 8 && tickAnim < 10) {
            xx = -13.96582 + (((tickAnim - 8) / 2) * (2.75-(-13.96582)));
            yy = 2.41532 + (((tickAnim - 8) / 2) * (0-(2.41532)));
            zz = 22.76502 + (((tickAnim - 8) / 2) * (10-(22.76502)));
        }
        else if (tickAnim >= 10 && tickAnim < 12) {
            xx = 2.75 + (((tickAnim - 10) / 2) * (2.03963-(2.75)));
            yy = 0 + (((tickAnim - 10) / 2) * (-19.24431-(0)));
            zz = 10 + (((tickAnim - 10) / 2) * (17.83503-(10)));
        }
        else if (tickAnim >= 12 && tickAnim < 13) {
            xx = 2.03963 + (((tickAnim - 12) / 1) * (-11.2698-(2.03963)));
            yy = -19.24431 + (((tickAnim - 12) / 1) * (-38.64729-(-19.24431)));
            zz = 17.83503 + (((tickAnim - 12) / 1) * (32.02458-(17.83503)));
        }
        else if (tickAnim >= 13 && tickAnim < 15) {
            xx = -11.2698 + (((tickAnim - 13) / 2) * (-42.7817-(-11.2698)));
            yy = -38.64729 + (((tickAnim - 13) / 2) * (-59.95631-(-38.64729)));
            zz = 32.02458 + (((tickAnim - 13) / 2) * (63.87481-(32.02458)));
        }
        else if (tickAnim >= 15 && tickAnim < 20) {
            xx = -42.7817 + (((tickAnim - 15) / 5) * (0-(-42.7817)));
            yy = -59.95631 + (((tickAnim - 15) / 5) * (0-(-59.95631)));
            zz = 63.87481 + (((tickAnim - 15) / 5) * (0-(63.87481)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightHand, rightHand.rotateAngleX + (float) Math.toRadians(xx), rightHand.rotateAngleY + (float) Math.toRadians(yy), rightHand.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 0) / 5) * (0.15-(0)));
            yy = 0 + (((tickAnim - 0) / 5) * (0.35-(0)));
            zz = 0 + (((tickAnim - 0) / 5) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 8) {
            xx = 0.15 + (((tickAnim - 5) / 3) * (-0.54-(0.15)));
            yy = 0.35 + (((tickAnim - 5) / 3) * (0.37-(0.35)));
            zz = 0 + (((tickAnim - 5) / 3) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 10) {
            xx = -0.54 + (((tickAnim - 8) / 2) * (0-(-0.54)));
            yy = 0.37 + (((tickAnim - 8) / 2) * (0-(0.37)));
            zz = 0 + (((tickAnim - 8) / 2) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 12) {
            xx = 0 + (((tickAnim - 10) / 2) * (0-(0)));
            yy = 0 + (((tickAnim - 10) / 2) * (0.45-(0)));
            zz = 0 + (((tickAnim - 10) / 2) * (0-(0)));
        }
        else if (tickAnim >= 12 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 12) / 1) * (0-(0)));
            yy = 0.45 + (((tickAnim - 12) / 1) * (0.45-(0.45)));
            zz = 0 + (((tickAnim - 12) / 1) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 13) / 2) * (0.175-(0)));
            yy = 0.45 + (((tickAnim - 13) / 2) * (0.13-(0.45)));
            zz = 0 + (((tickAnim - 13) / 2) * (-0.2-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 20) {
            xx = 0.175 + (((tickAnim - 15) / 5) * (0-(0.175)));
            yy = 0.13 + (((tickAnim - 15) / 5) * (0-(0.13)));
            zz = -0.2 + (((tickAnim - 15) / 5) * (0-(-0.2)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.rightHand.rotationPointX = this.rightHand.rotationPointX + (float)(xx);
        this.rightHand.rotationPointY = this.rightHand.rotationPointY - (float)(yy);
        this.rightHand.rotationPointZ = this.rightHand.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 5) {
            xx = 10.81659 + (((tickAnim - 0) / 5) * (-30.08525-(10.81659)));
            yy = -32.55734 + (((tickAnim - 0) / 5) * (-71.41787-(-32.55734)));
            zz = 4.08721 + (((tickAnim - 0) / 5) * (45.89538-(4.08721)));
        }
        else if (tickAnim >= 5 && tickAnim < 11) {
            xx = -30.08525 + (((tickAnim - 5) / 6) * (4.6839-(-30.08525)));
            yy = -71.41787 + (((tickAnim - 5) / 6) * (15.91675-(-71.41787)));
            zz = 45.89538 + (((tickAnim - 5) / 6) * (-13.33305-(45.89538)));
        }
        else if (tickAnim >= 11 && tickAnim < 15) {
            xx = 4.6839 + (((tickAnim - 11) / 4) * (45.48428-(4.6839)));
            yy = 15.91675 + (((tickAnim - 11) / 4) * (17.23246-(15.91675)));
            zz = -13.33305 + (((tickAnim - 11) / 4) * (18.07183-(-13.33305)));
        }
        else if (tickAnim >= 15 && tickAnim < 18) {
            xx = 45.48428 + (((tickAnim - 15) / 3) * (10.74214-(45.48428)));
            yy = 17.23246 + (((tickAnim - 15) / 3) * (8.61623-(17.23246)));
            zz = 18.07183 + (((tickAnim - 15) / 3) * (9.03591-(18.07183)));
        }
        else if (tickAnim >= 18 && tickAnim < 20) {
            xx = 10.74214 + (((tickAnim - 18) / 2) * (10.81659-(10.74214)));
            yy = 8.61623 + (((tickAnim - 18) / 2) * (-32.55734-(8.61623)));
            zz = 9.03591 + (((tickAnim - 18) / 2) * (4.08721-(9.03591)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightFootw, rightFootw.rotateAngleX + (float) Math.toRadians(xx), rightFootw.rotateAngleY + (float) Math.toRadians(yy), rightFootw.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 11) {
            xx = 0 + (((tickAnim - 0) / 11) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 11) * (0.25-(0)));
            zz = 0 + (((tickAnim - 0) / 11) * (0-(0)));
        }
        else if (tickAnim >= 11 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 11) / 4) * (0-(0)));
            yy = 0.25 + (((tickAnim - 11) / 4) * (0.55-(0.25)));
            zz = 0 + (((tickAnim - 11) / 4) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 15) / 5) * (0-(0)));
            yy = 0.55 + (((tickAnim - 15) / 5) * (0-(0.55)));
            zz = 0 + (((tickAnim - 15) / 5) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.rightFootw.rotationPointX = this.rightFootw.rotationPointX + (float)(xx);
        this.rightFootw.rotationPointY = this.rightFootw.rotationPointY - (float)(yy);
        this.rightFootw.rotationPointZ = this.rightFootw.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 4) {
            xx = 4.6839 + (((tickAnim - 0) / 4) * (45.48428-(4.6839)));
            yy = -15.91675 + (((tickAnim - 0) / 4) * (-17.23246-(-15.91675)));
            zz = 13.33305 + (((tickAnim - 0) / 4) * (-18.07183-(13.33305)));
        }
        else if (tickAnim >= 4 && tickAnim < 7) {
            xx = 45.48428 + (((tickAnim - 4) / 3) * (10.74214-(45.48428)));
            yy = -17.23246 + (((tickAnim - 4) / 3) * (-8.61623-(-17.23246)));
            zz = -18.07183 + (((tickAnim - 4) / 3) * (-9.03591-(-18.07183)));
        }
        else if (tickAnim >= 7 && tickAnim < 9) {
            xx = 10.74214 + (((tickAnim - 7) / 2) * (10.81659-(10.74214)));
            yy = -8.61623 + (((tickAnim - 7) / 2) * (32.55734-(-8.61623)));
            zz = -9.03591 + (((tickAnim - 7) / 2) * (-4.08721-(-9.03591)));
        }
        else if (tickAnim >= 9 && tickAnim < 12) {
            xx = 10.81659 + (((tickAnim - 9) / 3) * (-9.71277-(10.81659)));
            yy = 32.55734 + (((tickAnim - 9) / 3) * (49.21185-(32.55734)));
            zz = -4.08721 + (((tickAnim - 9) / 3) * (-22.005-(-4.08721)));
        }
        else if (tickAnim >= 12 && tickAnim < 15) {
            xx = -9.71277 + (((tickAnim - 12) / 3) * (-30.08525-(-9.71277)));
            yy = 49.21185 + (((tickAnim - 12) / 3) * (71.41787-(49.21185)));
            zz = -22.005 + (((tickAnim - 12) / 3) * (-45.89538-(-22.005)));
        }
        else if (tickAnim >= 15 && tickAnim < 20) {
            xx = -30.08525 + (((tickAnim - 15) / 5) * (4.6839-(-30.08525)));
            yy = 71.41787 + (((tickAnim - 15) / 5) * (-15.91675-(71.41787)));
            zz = -45.89538 + (((tickAnim - 15) / 5) * (13.33305-(-45.89538)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftFootw, leftFootw.rotateAngleX + (float) Math.toRadians(xx), leftFootw.rotateAngleY + (float) Math.toRadians(yy), leftFootw.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 4) {
            xx = 0 + (((tickAnim - 0) / 4) * (0-(0)));
            yy = 0.25 + (((tickAnim - 0) / 4) * (0.55-(0.25)));
            zz = 0 + (((tickAnim - 0) / 4) * (0-(0)));
        }
        else if (tickAnim >= 4 && tickAnim < 9) {
            xx = 0 + (((tickAnim - 4) / 5) * (0-(0)));
            yy = 0.55 + (((tickAnim - 4) / 5) * (0-(0.55)));
            zz = 0 + (((tickAnim - 4) / 5) * (0-(0)));
        }
        else if (tickAnim >= 9 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 9) / 11) * (0-(0)));
            yy = 0 + (((tickAnim - 9) / 11) * (0.25-(0)));
            zz = 0 + (((tickAnim - 9) / 11) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.leftFootw.rotationPointX = this.leftFootw.rotationPointX + (float)(xx);
        this.leftFootw.rotationPointY = this.leftFootw.rotationPointY - (float)(yy);
        this.leftFootw.rotationPointZ = this.leftFootw.rotationPointZ + (float)(zz);


    }
    public void animClimb(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime, boolean isStatic) {
        EntityPrehistoricFloraEichstaettisaurus entity = (EntityPrehistoricFloraEichstaettisaurus) entitylivingbaseIn;
        int animCycle = 20;
        double tickAnim = 0;
        if (!isStatic) {
            tickAnim = (entity.ticksExisted + entity.getTickOffset()) - (int) (Math.floor((double) (entity.ticksExisted + entity.getTickOffset()) / (double) animCycle) * (double) animCycle) + partialTickTime;
        }
        double xx = 0;
        double yy = 0;
        double zz = 0;
        this.setRotateAngle(root, root.rotateAngleX + (float) Math.toRadians(-87.5+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/0.5))), root.rotateAngleY + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180/0.5-90))*6), root.rotateAngleZ + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180/0.5-90))*-5));
        this.root.rotationPointX = this.root.rotationPointX + (float)(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180/0.5))*0.5);
        this.root.rotationPointY = this.root.rotationPointY - (float)(21.4);
        this.root.rotationPointZ = this.root.rotationPointZ + (float)(-14.4);



        if (tickAnim >= 0 && tickAnim < 2) {
            xx = -4.49641 + (((tickAnim - 0) / 2) * (-2.34097-(-4.49641)));
            yy = -32.60273 + (((tickAnim - 0) / 2) * (-19.76797-(-32.60273)));
            zz = 5.85246 + (((tickAnim - 0) / 2) * (9.47038-(5.85246)));
        }
        else if (tickAnim >= 2 && tickAnim < 6) {
            xx = -2.34097 + (((tickAnim - 2) / 4) * (9.23824-(-2.34097)));
            yy = -19.76797 + (((tickAnim - 2) / 4) * (13.19185-(-19.76797)));
            zz = 9.47038 + (((tickAnim - 2) / 4) * (2.54076-(9.47038)));
        }
        else if (tickAnim >= 6 && tickAnim < 11) {
            xx = 9.23824 + (((tickAnim - 6) / 5) * (19.23843-(9.23824)));
            yy = 13.19185 + (((tickAnim - 6) / 5) * (51.9231-(13.19185)));
            zz = 2.54076 + (((tickAnim - 6) / 5) * (4.16449-(2.54076)));
        }
        else if (tickAnim >= 11 && tickAnim < 15) {
            xx = 19.23843 + (((tickAnim - 11) / 4) * (-4.19281-(19.23843)));
            yy = 51.9231 + (((tickAnim - 11) / 4) * (9.10034-(51.9231)));
            zz = 4.16449 + (((tickAnim - 11) / 4) * (23.16853-(4.16449)));
        }
        else if (tickAnim >= 15 && tickAnim < 20) {
            xx = -4.19281 + (((tickAnim - 15) / 5) * (-4.49641-(-4.19281)));
            yy = 9.10034 + (((tickAnim - 15) / 5) * (-32.60273-(9.10034)));
            zz = 23.16853 + (((tickAnim - 15) / 5) * (5.85246-(23.16853)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightLeg, rightLeg.rotateAngleX + (float) Math.toRadians(xx), rightLeg.rotateAngleY + (float) Math.toRadians(yy), rightLeg.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 11) {
            xx = 19.12584 + (((tickAnim - 0) / 11) * (5.16901-(19.12584)));
            yy = -50.36851 + (((tickAnim - 0) / 11) * (-8.68071-(-50.36851)));
            zz = 0.83049 + (((tickAnim - 0) / 11) * (-28.79897-(0.83049)));
        }
        else if (tickAnim >= 11 && tickAnim < 20) {
            xx = 5.16901 + (((tickAnim - 11) / 9) * (19.12584-(5.16901)));
            yy = -8.68071 + (((tickAnim - 11) / 9) * (-50.36851-(-8.68071)));
            zz = -28.79897 + (((tickAnim - 11) / 9) * (0.83049-(-28.79897)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightLeg2, rightLeg2.rotateAngleX + (float) Math.toRadians(xx), rightLeg2.rotateAngleY + (float) Math.toRadians(yy), rightLeg2.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 0) / 20) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 20) * (0-(0)));
            zz = 0.2 + (((tickAnim - 0) / 20) * (0.2-(0.2)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.rightLeg2.rotationPointX = this.rightLeg2.rotationPointX + (float)(xx);
        this.rightLeg2.rotationPointY = this.rightLeg2.rotationPointY - (float)(yy);
        this.rightLeg2.rotationPointZ = this.rightLeg2.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 4) {
            xx = 18.9136 + (((tickAnim - 0) / 4) * (-4.19281-(18.9136)));
            yy = -52.08651 + (((tickAnim - 0) / 4) * (-9.10034-(-52.08651)));
            zz = -3.59107 + (((tickAnim - 0) / 4) * (-23.16853-(-3.59107)));
        }
        else if (tickAnim >= 4 && tickAnim < 9) {
            xx = -4.19281 + (((tickAnim - 4) / 5) * (-4.79435-(-4.19281)));
            yy = -9.10034 + (((tickAnim - 4) / 5) * (32.58248-(-9.10034)));
            zz = -23.16853 + (((tickAnim - 4) / 5) * (-6.24087-(-23.16853)));
        }
        else if (tickAnim >= 9 && tickAnim < 12) {
            xx = -4.79435 + (((tickAnim - 9) / 3) * (7.36387-(-4.79435)));
            yy = 32.58248 + (((tickAnim - 9) / 3) * (13.42593-(32.58248)));
            zz = -6.24087 + (((tickAnim - 9) / 3) * (-6.86522-(-6.24087)));
        }
        else if (tickAnim >= 12 && tickAnim < 15) {
            xx = 7.36387 + (((tickAnim - 12) / 3) * (13.32936-(7.36387)));
            yy = 13.42593 + (((tickAnim - 12) / 3) * (-12.51732-(13.42593)));
            zz = -6.86522 + (((tickAnim - 12) / 3) * (-5.98729-(-6.86522)));
        }
        else if (tickAnim >= 15 && tickAnim < 20) {
            xx = 13.32936 + (((tickAnim - 15) / 5) * (18.9136-(13.32936)));
            yy = -12.51732 + (((tickAnim - 15) / 5) * (-52.08651-(-12.51732)));
            zz = -5.98729 + (((tickAnim - 15) / 5) * (-3.59107-(-5.98729)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftLeg, leftLeg.rotateAngleX + (float) Math.toRadians(xx), leftLeg.rotateAngleY + (float) Math.toRadians(yy), leftLeg.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 9) {
            xx = 5.16901 + (((tickAnim - 0) / 9) * (19.12584-(5.16901)));
            yy = 8.68071 + (((tickAnim - 0) / 9) * (50.36851-(8.68071)));
            zz = 28.79897 + (((tickAnim - 0) / 9) * (-0.83049-(28.79897)));
        }
        else if (tickAnim >= 9 && tickAnim < 20) {
            xx = 19.12584 + (((tickAnim - 9) / 11) * (5.16901-(19.12584)));
            yy = 50.36851 + (((tickAnim - 9) / 11) * (8.68071-(50.36851)));
            zz = -0.83049 + (((tickAnim - 9) / 11) * (28.79897-(-0.83049)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftLeg2, leftLeg2.rotateAngleX + (float) Math.toRadians(xx), leftLeg2.rotateAngleY + (float) Math.toRadians(yy), leftLeg2.rotateAngleZ + (float) Math.toRadians(zz));

        this.leftLeg2.rotationPointX = this.leftLeg2.rotationPointX + (float)(0);
        this.leftLeg2.rotationPointY = this.leftLeg2.rotationPointY - (float)(0);
        this.leftLeg2.rotationPointZ = this.leftLeg2.rotationPointZ + (float)(0.2);


        this.setRotateAngle(tail1, tail1.rotateAngleX + (float) Math.toRadians(-4.75), tail1.rotateAngleY + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180/0.5-50))*3), tail1.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(tail2, tail2.rotateAngleX + (float) Math.toRadians(0), tail2.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180/0.5-100))*3), tail2.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(tail3, tail3.rotateAngleX + (float) Math.toRadians(0), tail3.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180/0.5-150))*6), tail3.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(tail4, tail4.rotateAngleX + (float) Math.toRadians(0), tail4.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180/0.5-200))*10), tail4.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(tail5, tail5.rotateAngleX + (float) Math.toRadians(0), tail5.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180/0.5-250))*15), tail5.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(body, body.rotateAngleX + (float) Math.toRadians(0), body.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180/0.5-120))*-6), body.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(chest, chest.rotateAngleX + (float) Math.toRadians(0), chest.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180/0.5-150))*-3), chest.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180/0.5+90))*4));



        if (tickAnim >= 0 && tickAnim < 5) {
            xx = 89.77299 + (((tickAnim - 0) / 5) * (80.10291-(89.77299)));
            yy = 28.1933 + (((tickAnim - 0) / 5) * (-8.88536-(28.1933)));
            zz = 40.69718 + (((tickAnim - 0) / 5) * (67.33274-(40.69718)));
        }
        else if (tickAnim >= 5 && tickAnim < 10) {
            xx = 80.10291 + (((tickAnim - 5) / 5) * (31.37605-(80.10291)));
            yy = -8.88536 + (((tickAnim - 5) / 5) * (-48.04009-(-8.88536)));
            zz = 67.33274 + (((tickAnim - 5) / 5) * (10.22557-(67.33274)));
        }
        else if (tickAnim >= 10 && tickAnim < 20) {
            xx = 31.37605 + (((tickAnim - 10) / 10) * (89.77299-(31.37605)));
            yy = -48.04009 + (((tickAnim - 10) / 10) * (28.1933-(-48.04009)));
            zz = 10.22557 + (((tickAnim - 10) / 10) * (40.69718-(10.22557)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightArm, rightArm.rotateAngleX + (float) Math.toRadians(xx), rightArm.rotateAngleY + (float) Math.toRadians(yy), rightArm.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 31.37605 + (((tickAnim - 0) / 10) * (89.77299-(31.37605)));
            yy = 48.04009 + (((tickAnim - 0) / 10) * (-28.1933-(48.04009)));
            zz = -10.22557 + (((tickAnim - 0) / 10) * (-40.69718-(-10.22557)));
        }
        else if (tickAnim >= 10 && tickAnim < 15) {
            xx = 89.77299 + (((tickAnim - 10) / 5) * (80.10291-(89.77299)));
            yy = -28.1933 + (((tickAnim - 10) / 5) * (8.88536-(-28.1933)));
            zz = -40.69718 + (((tickAnim - 10) / 5) * (-67.33274-(-40.69718)));
        }
        else if (tickAnim >= 15 && tickAnim < 20) {
            xx = 80.10291 + (((tickAnim - 15) / 5) * (31.37605-(80.10291)));
            yy = 8.88536 + (((tickAnim - 15) / 5) * (48.04009-(8.88536)));
            zz = -67.33274 + (((tickAnim - 15) / 5) * (-10.22557-(-67.33274)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftArm, leftArm.rotateAngleX + (float) Math.toRadians(xx), leftArm.rotateAngleY + (float) Math.toRadians(yy), leftArm.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 2) {
            xx = 0 + (((tickAnim - 0) / 2) * (3.13015-(0)));
            yy = 0 + (((tickAnim - 0) / 2) * (20.68073-(0)));
            zz = -11.5 + (((tickAnim - 0) / 2) * (-18.01691-(-11.5)));
        }
        else if (tickAnim >= 2 && tickAnim < 3) {
            xx = 3.13015 + (((tickAnim - 2) / 1) * (-3.17978-(3.13015)));
            yy = 20.68073 + (((tickAnim - 2) / 1) * (31.0211-(20.68073)));
            zz = -18.01691 + (((tickAnim - 2) / 1) * (-21.27536-(-18.01691)));
        }
        else if (tickAnim >= 3 && tickAnim < 5) {
            xx = -3.17978 + (((tickAnim - 3) / 2) * (-46.28842-(-3.17978)));
            yy = 31.0211 + (((tickAnim - 3) / 2) * (57.17329-(31.0211)));
            zz = -21.27536 + (((tickAnim - 3) / 2) * (-56.97347-(-21.27536)));
        }
        else if (tickAnim >= 5 && tickAnim < 10) {
            xx = -46.28842 + (((tickAnim - 5) / 5) * (0-(-46.28842)));
            yy = 57.17329 + (((tickAnim - 5) / 5) * (0-(57.17329)));
            zz = -56.97347 + (((tickAnim - 5) / 5) * (0-(-56.97347)));
        }
        else if (tickAnim >= 10 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 10) / 5) * (0-(0)));
            yy = 0 + (((tickAnim - 10) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 5) * (18.75-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 18) {
            xx = 0 + (((tickAnim - 15) / 3) * (-13.5-(0)));
            yy = 0 + (((tickAnim - 15) / 3) * (0-(0)));
            zz = 18.75 + (((tickAnim - 15) / 3) * (-17.37-(18.75)));
        }
        else if (tickAnim >= 18 && tickAnim < 19) {
            xx = -13.5 + (((tickAnim - 18) / 1) * (-4.48295-(-13.5)));
            yy = 0 + (((tickAnim - 18) / 1) * (-0.3918-(0)));
            zz = -17.37 + (((tickAnim - 18) / 1) * (-18.44133-(-17.37)));
        }
        else if (tickAnim >= 19 && tickAnim < 20) {
            xx = -4.48295 + (((tickAnim - 19) / 1) * (0-(-4.48295)));
            yy = -0.3918 + (((tickAnim - 19) / 1) * (0-(-0.3918)));
            zz = -18.44133 + (((tickAnim - 19) / 1) * (-11.5-(-18.44133)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftHand, leftHand.rotateAngleX + (float) Math.toRadians(xx), leftHand.rotateAngleY + (float) Math.toRadians(yy), leftHand.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 3) * (0.45-(0)));
            zz = 0 + (((tickAnim - 0) / 3) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 3) / 12) * (-1.075-(0)));
            yy = 0.45 + (((tickAnim - 3) / 12) * (0.445-(0.45)));
            zz = 0 + (((tickAnim - 3) / 12) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 18) {
            xx = -1.075 + (((tickAnim - 15) / 3) * (-0.54-(-1.075)));
            yy = 0.445 + (((tickAnim - 15) / 3) * (0.37-(0.445)));
            zz = 0 + (((tickAnim - 15) / 3) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 20) {
            xx = -0.54 + (((tickAnim - 18) / 2) * (0-(-0.54)));
            yy = 0.37 + (((tickAnim - 18) / 2) * (0-(0.37)));
            zz = 0 + (((tickAnim - 18) / 2) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.leftHand.rotationPointX = this.leftHand.rotationPointX + (float)(xx);
        this.leftHand.rotationPointY = this.leftHand.rotationPointY - (float)(yy);
        this.leftHand.rotationPointZ = this.leftHand.rotationPointZ + (float)(zz);



        this.setRotateAngle(neck1, neck1.rotateAngleX + (float) Math.toRadians(0), neck1.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180/0.5-200))*3), neck1.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(head, head.rotateAngleX + (float) Math.toRadians(0), head.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180/0.5-350))*-3), head.rotateAngleZ + (float) Math.toRadians(0));



        if (tickAnim >= 0 && tickAnim < 10) {
            xx = -11.53018 + (((tickAnim - 0) / 10) * (-125.4152-(-11.53018)));
            yy = -18.54283 + (((tickAnim - 0) / 10) * (-83.76797-(-18.54283)));
            zz = 14.94471 + (((tickAnim - 0) / 10) * (149.15883-(14.94471)));
        }
        else if (tickAnim >= 10 && tickAnim < 15) {
            xx = -125.4152 + (((tickAnim - 10) / 5) * (-15.73426-(-125.4152)));
            yy = -83.76797 + (((tickAnim - 10) / 5) * (-15.36164-(-83.76797)));
            zz = 149.15883 + (((tickAnim - 10) / 5) * (30.29551-(149.15883)));
        }
        else if (tickAnim >= 15 && tickAnim < 20) {
            xx = -15.73426 + (((tickAnim - 15) / 5) * (-11.53018-(-15.73426)));
            yy = -15.36164 + (((tickAnim - 15) / 5) * (-18.54283-(-15.36164)));
            zz = 30.29551 + (((tickAnim - 15) / 5) * (14.94471-(30.29551)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftArm2w, leftArm2w.rotateAngleX + (float) Math.toRadians(xx), leftArm2w.rotateAngleY + (float) Math.toRadians(yy), leftArm2w.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 5) {
            xx = -125.4152 + (((tickAnim - 0) / 5) * (-15.73426-(-125.4152)));
            yy = 83.76797 + (((tickAnim - 0) / 5) * (15.36164-(83.76797)));
            zz = -149.15883 + (((tickAnim - 0) / 5) * (-30.29551-(-149.15883)));
        }
        else if (tickAnim >= 5 && tickAnim < 10) {
            xx = -15.73426 + (((tickAnim - 5) / 5) * (-11.53018-(-15.73426)));
            yy = 15.36164 + (((tickAnim - 5) / 5) * (18.54283-(15.36164)));
            zz = -30.29551 + (((tickAnim - 5) / 5) * (-14.94471-(-30.29551)));
        }
        else if (tickAnim >= 10 && tickAnim < 20) {
            xx = -11.53018 + (((tickAnim - 10) / 10) * (-125.4152-(-11.53018)));
            yy = 18.54283 + (((tickAnim - 10) / 10) * (83.76797-(18.54283)));
            zz = -14.94471 + (((tickAnim - 10) / 10) * (-149.15883-(-14.94471)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightArm2w, rightArm2w.rotateAngleX + (float) Math.toRadians(xx), rightArm2w.rotateAngleY + (float) Math.toRadians(yy), rightArm2w.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 0) / 5) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 5) * (-16.75-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 7) {
            xx = 0 + (((tickAnim - 5) / 2) * (-22.92858-(0)));
            yy = 0 + (((tickAnim - 5) / 2) * (2.83115-(0)));
            zz = -16.75 + (((tickAnim - 5) / 2) * (14.01087-(-16.75)));
        }
        else if (tickAnim >= 7 && tickAnim < 8) {
            xx = -22.92858 + (((tickAnim - 7) / 1) * (-21.11572-(-22.92858)));
            yy = 2.83115 + (((tickAnim - 7) / 1) * (2.44154-(2.83115)));
            zz = 14.01087 + (((tickAnim - 7) / 1) * (23.66487-(14.01087)));
        }
        else if (tickAnim >= 8 && tickAnim < 8) {
            xx = -21.11572 + (((tickAnim - 8) / 0) * (-13.96582-(-21.11572)));
            yy = 2.44154 + (((tickAnim - 8) / 0) * (2.41532-(2.44154)));
            zz = 23.66487 + (((tickAnim - 8) / 0) * (22.76502-(23.66487)));
        }
        else if (tickAnim >= 8 && tickAnim < 10) {
            xx = -13.96582 + (((tickAnim - 8) / 2) * (2.75-(-13.96582)));
            yy = 2.41532 + (((tickAnim - 8) / 2) * (0-(2.41532)));
            zz = 22.76502 + (((tickAnim - 8) / 2) * (10-(22.76502)));
        }
        else if (tickAnim >= 10 && tickAnim < 12) {
            xx = 2.75 + (((tickAnim - 10) / 2) * (2.03963-(2.75)));
            yy = 0 + (((tickAnim - 10) / 2) * (-19.24431-(0)));
            zz = 10 + (((tickAnim - 10) / 2) * (17.83503-(10)));
        }
        else if (tickAnim >= 12 && tickAnim < 13) {
            xx = 2.03963 + (((tickAnim - 12) / 1) * (-11.2698-(2.03963)));
            yy = -19.24431 + (((tickAnim - 12) / 1) * (-38.64729-(-19.24431)));
            zz = 17.83503 + (((tickAnim - 12) / 1) * (32.02458-(17.83503)));
        }
        else if (tickAnim >= 13 && tickAnim < 15) {
            xx = -11.2698 + (((tickAnim - 13) / 2) * (-42.7817-(-11.2698)));
            yy = -38.64729 + (((tickAnim - 13) / 2) * (-59.95631-(-38.64729)));
            zz = 32.02458 + (((tickAnim - 13) / 2) * (63.87481-(32.02458)));
        }
        else if (tickAnim >= 15 && tickAnim < 20) {
            xx = -42.7817 + (((tickAnim - 15) / 5) * (0-(-42.7817)));
            yy = -59.95631 + (((tickAnim - 15) / 5) * (0-(-59.95631)));
            zz = 63.87481 + (((tickAnim - 15) / 5) * (0-(63.87481)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightHand, rightHand.rotateAngleX + (float) Math.toRadians(xx), rightHand.rotateAngleY + (float) Math.toRadians(yy), rightHand.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 0) / 5) * (0.15-(0)));
            yy = 0 + (((tickAnim - 0) / 5) * (0.35-(0)));
            zz = 0 + (((tickAnim - 0) / 5) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 8) {
            xx = 0.15 + (((tickAnim - 5) / 3) * (-0.54-(0.15)));
            yy = 0.35 + (((tickAnim - 5) / 3) * (0.37-(0.35)));
            zz = 0 + (((tickAnim - 5) / 3) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 10) {
            xx = -0.54 + (((tickAnim - 8) / 2) * (0-(-0.54)));
            yy = 0.37 + (((tickAnim - 8) / 2) * (0-(0.37)));
            zz = 0 + (((tickAnim - 8) / 2) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 12) {
            xx = 0 + (((tickAnim - 10) / 2) * (0-(0)));
            yy = 0 + (((tickAnim - 10) / 2) * (0.45-(0)));
            zz = 0 + (((tickAnim - 10) / 2) * (0-(0)));
        }
        else if (tickAnim >= 12 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 12) / 1) * (0-(0)));
            yy = 0.45 + (((tickAnim - 12) / 1) * (0.45-(0.45)));
            zz = 0 + (((tickAnim - 12) / 1) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 13) / 2) * (0.175-(0)));
            yy = 0.45 + (((tickAnim - 13) / 2) * (0.13-(0.45)));
            zz = 0 + (((tickAnim - 13) / 2) * (-0.2-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 20) {
            xx = 0.175 + (((tickAnim - 15) / 5) * (0-(0.175)));
            yy = 0.13 + (((tickAnim - 15) / 5) * (0-(0.13)));
            zz = -0.2 + (((tickAnim - 15) / 5) * (0-(-0.2)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.rightHand.rotationPointX = this.rightHand.rotationPointX + (float)(xx);
        this.rightHand.rotationPointY = this.rightHand.rotationPointY - (float)(yy);
        this.rightHand.rotationPointZ = this.rightHand.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 5) {
            xx = 10.81659 + (((tickAnim - 0) / 5) * (-30.08525-(10.81659)));
            yy = -32.55734 + (((tickAnim - 0) / 5) * (-71.41787-(-32.55734)));
            zz = 4.08721 + (((tickAnim - 0) / 5) * (45.89538-(4.08721)));
        }
        else if (tickAnim >= 5 && tickAnim < 11) {
            xx = -30.08525 + (((tickAnim - 5) / 6) * (4.6839-(-30.08525)));
            yy = -71.41787 + (((tickAnim - 5) / 6) * (15.91675-(-71.41787)));
            zz = 45.89538 + (((tickAnim - 5) / 6) * (-13.33305-(45.89538)));
        }
        else if (tickAnim >= 11 && tickAnim < 15) {
            xx = 4.6839 + (((tickAnim - 11) / 4) * (45.48428-(4.6839)));
            yy = 15.91675 + (((tickAnim - 11) / 4) * (17.23246-(15.91675)));
            zz = -13.33305 + (((tickAnim - 11) / 4) * (18.07183-(-13.33305)));
        }
        else if (tickAnim >= 15 && tickAnim < 18) {
            xx = 45.48428 + (((tickAnim - 15) / 3) * (10.74214-(45.48428)));
            yy = 17.23246 + (((tickAnim - 15) / 3) * (8.61623-(17.23246)));
            zz = 18.07183 + (((tickAnim - 15) / 3) * (9.03591-(18.07183)));
        }
        else if (tickAnim >= 18 && tickAnim < 20) {
            xx = 10.74214 + (((tickAnim - 18) / 2) * (10.81659-(10.74214)));
            yy = 8.61623 + (((tickAnim - 18) / 2) * (-32.55734-(8.61623)));
            zz = 9.03591 + (((tickAnim - 18) / 2) * (4.08721-(9.03591)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightFootw, rightFootw.rotateAngleX + (float) Math.toRadians(xx), rightFootw.rotateAngleY + (float) Math.toRadians(yy), rightFootw.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 11) {
            xx = 0 + (((tickAnim - 0) / 11) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 11) * (0.25-(0)));
            zz = 0 + (((tickAnim - 0) / 11) * (0-(0)));
        }
        else if (tickAnim >= 11 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 11) / 4) * (0-(0)));
            yy = 0.25 + (((tickAnim - 11) / 4) * (0.55-(0.25)));
            zz = 0 + (((tickAnim - 11) / 4) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 15) / 5) * (0-(0)));
            yy = 0.55 + (((tickAnim - 15) / 5) * (0-(0.55)));
            zz = 0 + (((tickAnim - 15) / 5) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.rightFootw.rotationPointX = this.rightFootw.rotationPointX + (float)(xx);
        this.rightFootw.rotationPointY = this.rightFootw.rotationPointY - (float)(yy);
        this.rightFootw.rotationPointZ = this.rightFootw.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 4) {
            xx = 4.6839 + (((tickAnim - 0) / 4) * (45.48428-(4.6839)));
            yy = -15.91675 + (((tickAnim - 0) / 4) * (-17.23246-(-15.91675)));
            zz = 13.33305 + (((tickAnim - 0) / 4) * (-18.07183-(13.33305)));
        }
        else if (tickAnim >= 4 && tickAnim < 7) {
            xx = 45.48428 + (((tickAnim - 4) / 3) * (10.74214-(45.48428)));
            yy = -17.23246 + (((tickAnim - 4) / 3) * (-8.61623-(-17.23246)));
            zz = -18.07183 + (((tickAnim - 4) / 3) * (-9.03591-(-18.07183)));
        }
        else if (tickAnim >= 7 && tickAnim < 9) {
            xx = 10.74214 + (((tickAnim - 7) / 2) * (10.81659-(10.74214)));
            yy = -8.61623 + (((tickAnim - 7) / 2) * (32.55734-(-8.61623)));
            zz = -9.03591 + (((tickAnim - 7) / 2) * (-4.08721-(-9.03591)));
        }
        else if (tickAnim >= 9 && tickAnim < 12) {
            xx = 10.81659 + (((tickAnim - 9) / 3) * (-9.71277-(10.81659)));
            yy = 32.55734 + (((tickAnim - 9) / 3) * (49.21185-(32.55734)));
            zz = -4.08721 + (((tickAnim - 9) / 3) * (-22.005-(-4.08721)));
        }
        else if (tickAnim >= 12 && tickAnim < 15) {
            xx = -9.71277 + (((tickAnim - 12) / 3) * (-30.08525-(-9.71277)));
            yy = 49.21185 + (((tickAnim - 12) / 3) * (71.41787-(49.21185)));
            zz = -22.005 + (((tickAnim - 12) / 3) * (-45.89538-(-22.005)));
        }
        else if (tickAnim >= 15 && tickAnim < 20) {
            xx = -30.08525 + (((tickAnim - 15) / 5) * (4.6839-(-30.08525)));
            yy = 71.41787 + (((tickAnim - 15) / 5) * (-15.91675-(71.41787)));
            zz = -45.89538 + (((tickAnim - 15) / 5) * (13.33305-(-45.89538)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftFootw, leftFootw.rotateAngleX + (float) Math.toRadians(xx), leftFootw.rotateAngleY + (float) Math.toRadians(yy), leftFootw.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 4) {
            xx = 0 + (((tickAnim - 0) / 4) * (0-(0)));
            yy = 0.25 + (((tickAnim - 0) / 4) * (0.55-(0.25)));
            zz = 0 + (((tickAnim - 0) / 4) * (0-(0)));
        }
        else if (tickAnim >= 4 && tickAnim < 9) {
            xx = 0 + (((tickAnim - 4) / 5) * (0-(0)));
            yy = 0.55 + (((tickAnim - 4) / 5) * (0-(0.55)));
            zz = 0 + (((tickAnim - 4) / 5) * (0-(0)));
        }
        else if (tickAnim >= 9 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 9) / 11) * (0-(0)));
            yy = 0 + (((tickAnim - 9) / 11) * (0.25-(0)));
            zz = 0 + (((tickAnim - 9) / 11) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.leftFootw.rotationPointX = this.leftFootw.rotationPointX + (float)(xx);
        this.leftFootw.rotationPointY = this.leftFootw.rotationPointY - (float)(yy);
        this.leftFootw.rotationPointZ = this.leftFootw.rotationPointZ + (float)(zz);


    }

    public void animate(IAnimatedEntity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        EntityPrehistoricFloraEichstaettisaurus e = (EntityPrehistoricFloraEichstaettisaurus) entity;
        animator.update(entity);
        //this.resetToDefaultPose();

    }
}
