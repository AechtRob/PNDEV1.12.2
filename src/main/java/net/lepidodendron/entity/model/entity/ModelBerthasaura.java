package net.lepidodendron.entity.model.entity;

import net.ilexiconn.llibrary.client.model.ModelAnimator;
import net.ilexiconn.llibrary.client.model.tools.AdvancedModelRenderer;
import net.ilexiconn.llibrary.server.animation.IAnimatedEntity;
import net.lepidodendron.entity.EntityPrehistoricFloraBerthasaura;
import net.lepidodendron.entity.model.ModelBasePalaeopedia;
import net.minecraft.client.model.ModelBox;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;

public class ModelBerthasaura extends ModelBasePalaeopedia {
    private final AdvancedModelRenderer hips;
    private final AdvancedModelRenderer cube_r1;
    private final AdvancedModelRenderer leftLeg;
    private final AdvancedModelRenderer leftLeg2;
    private final AdvancedModelRenderer leftLeg3;
    private final AdvancedModelRenderer leftLeg4;
    private final AdvancedModelRenderer rightLeg;
    private final AdvancedModelRenderer rightLeg2;
    private final AdvancedModelRenderer rightLeg3;
    private final AdvancedModelRenderer rightLeg4;
    private final AdvancedModelRenderer body;
    private final AdvancedModelRenderer cube_r2;
    private final AdvancedModelRenderer chest;
    private final AdvancedModelRenderer cube_r3;
    private final AdvancedModelRenderer cube_r4;
    private final AdvancedModelRenderer leftArm;
    private final AdvancedModelRenderer leftArm2;
    private final AdvancedModelRenderer leftArm3;
    private final AdvancedModelRenderer rightArm;
    private final AdvancedModelRenderer rightArm2;
    private final AdvancedModelRenderer rightArm3;
    private final AdvancedModelRenderer neck3;
    private final AdvancedModelRenderer cube_r5;
    private final AdvancedModelRenderer neck2;
    private final AdvancedModelRenderer cube_r6;
    private final AdvancedModelRenderer neck;
    private final AdvancedModelRenderer cube_r7;
    private final AdvancedModelRenderer cube_r8;
    private final AdvancedModelRenderer head;
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
    private final AdvancedModelRenderer tail;
    private final AdvancedModelRenderer tail2;
    private final AdvancedModelRenderer tail3;
    private final AdvancedModelRenderer tail4;


    private ModelAnimator animator;

    public ModelBerthasaura() {
        this.textureWidth = 55;
        this.textureHeight = 50;

        this.hips = new AdvancedModelRenderer(this);
        this.hips.setRotationPoint(0.0F, 5.7F, 2.9F);
        this.setRotateAngle(hips, -0.0873F, 0.0F, 0.0F);


        this.cube_r1 = new AdvancedModelRenderer(this);
        this.cube_r1.setRotationPoint(0.5F, -1.2F, -3.0F);
        this.hips.addChild(cube_r1);
        this.setRotateAngle(cube_r1, 0.0524F, 0.0F, 0.0F);
        this.cube_r1.cubeList.add(new ModelBox(cube_r1, 0, 0, -2.5F, -0.1F, 0.0F, 4, 7, 7, 0.0F, false));

        this.leftLeg = new AdvancedModelRenderer(this);
        this.leftLeg.setRotationPoint(1.7F, 1.374F, 0.9307F);
        this.hips.addChild(leftLeg);
        this.setRotateAngle(leftLeg, -0.192F, 0.0F, 0.0F);
        this.leftLeg.cubeList.add(new ModelBox(leftLeg, 15, 36, -1.5F, -1.165F, -1.9134F, 3, 9, 4, 0.004F, false));

        this.leftLeg2 = new AdvancedModelRenderer(this);
        this.leftLeg2.setRotationPoint(0.0F, 7.835F, -1.7134F);
        this.leftLeg.addChild(leftLeg2);
        this.setRotateAngle(leftLeg2, 0.6981F, 0.0F, 0.0F);
        this.leftLeg2.cubeList.add(new ModelBox(leftLeg2, 40, 22, -0.9F, 0.1732F, -0.0281F, 2, 6, 2, 0.0F, false));

        this.leftLeg3 = new AdvancedModelRenderer(this);
        this.leftLeg3.setRotationPoint(-0.4F, 5.8732F, 1.1719F);
        this.leftLeg2.addChild(leftLeg3);
        this.setRotateAngle(leftLeg3, -0.6981F, 0.0F, 0.0F);
        this.leftLeg3.cubeList.add(new ModelBox(leftLeg3, 0, 0, -0.5F, -0.3F, -0.4F, 2, 5, 1, -0.004F, false));

        this.leftLeg4 = new AdvancedModelRenderer(this);
        this.leftLeg4.setRotationPoint(0.0F, 4.6F, 0.0F);
        this.leftLeg3.addChild(leftLeg4);
        this.setRotateAngle(leftLeg4, 0.3054F, 0.0F, 0.0F);
        this.leftLeg4.cubeList.add(new ModelBox(leftLeg4, 16, 0, -1.0F, -0.306F, -3.4914F, 3, 1, 4, 0.0F, false));

        this.rightLeg = new AdvancedModelRenderer(this);
        this.rightLeg.setRotationPoint(-1.7F, 1.374F, 0.9307F);
        this.hips.addChild(rightLeg);
        this.setRotateAngle(rightLeg, -0.192F, 0.0F, 0.0F);
        this.rightLeg.cubeList.add(new ModelBox(rightLeg, 15, 36, -1.5F, -1.165F, -1.9134F, 3, 9, 4, 0.004F, true));

        this.rightLeg2 = new AdvancedModelRenderer(this);
        this.rightLeg2.setRotationPoint(0.0F, 7.835F, -1.7134F);
        this.rightLeg.addChild(rightLeg2);
        this.setRotateAngle(rightLeg2, 0.6981F, 0.0F, 0.0F);
        this.rightLeg2.cubeList.add(new ModelBox(rightLeg2, 40, 22, -1.1F, 0.1732F, -0.0281F, 2, 6, 2, 0.0F, true));

        this.rightLeg3 = new AdvancedModelRenderer(this);
        this.rightLeg3.setRotationPoint(0.4F, 5.8732F, 1.1719F);
        this.rightLeg2.addChild(rightLeg3);
        this.setRotateAngle(rightLeg3, -0.6981F, 0.0F, 0.0F);
        this.rightLeg3.cubeList.add(new ModelBox(rightLeg3, 0, 0, -1.5F, -0.3F, -0.4F, 2, 5, 1, -0.004F, true));

        this.rightLeg4 = new AdvancedModelRenderer(this);
        this.rightLeg4.setRotationPoint(0.0F, 4.6F, 0.0F);
        this.rightLeg3.addChild(rightLeg4);
        this.setRotateAngle(rightLeg4, 0.3054F, 0.0F, 0.0F);
        this.rightLeg4.cubeList.add(new ModelBox(rightLeg4, 16, 0, -2.0F, -0.306F, -3.4914F, 3, 1, 4, 0.0F, true));

        this.body = new AdvancedModelRenderer(this);
        this.body.setRotationPoint(0.0F, -0.8F, -3.0F);
        this.hips.addChild(body);


        this.cube_r2 = new AdvancedModelRenderer(this);
        this.cube_r2.setRotationPoint(0.5F, 0.0F, 0.3F);
        this.body.addChild(cube_r2);
        this.setRotateAngle(cube_r2, 0.192F, 0.0F, 0.0F);
        this.cube_r2.cubeList.add(new ModelBox(cube_r2, 0, 15, -3.0F, -0.5F, -6.2F, 5, 8, 6, 0.004F, false));

        this.chest = new AdvancedModelRenderer(this);
        this.chest.setRotationPoint(0.0F, 1.2F, -5.8F);
        this.body.addChild(chest);


        this.cube_r3 = new AdvancedModelRenderer(this);
        this.cube_r3.setRotationPoint(0.5F, 6.2F, 1.2F);
        this.chest.addChild(cube_r3);
        this.setRotateAngle(cube_r3, -0.3752F, 0.0F, 0.0F);
        this.cube_r3.cubeList.add(new ModelBox(cube_r3, 35, 13, -2.5F, -2.4323F, -4.3503F, 4, 3, 5, -0.004F, false));

        this.cube_r4 = new AdvancedModelRenderer(this);
        this.cube_r4.setRotationPoint(0.5F, 0.0F, -0.4F);
        this.chest.addChild(cube_r4);
        this.setRotateAngle(cube_r4, 0.4014F, 0.0F, 0.0F);
        this.cube_r4.cubeList.add(new ModelBox(cube_r4, 31, 0, -2.5F, -0.3F, -4.5F, 4, 4, 5, 0.0F, false));

        this.leftArm = new AdvancedModelRenderer(this);
        this.leftArm.setRotationPoint(1.5F, 4.0622F, -2.6549F);
        this.chest.addChild(leftArm);
        this.setRotateAngle(leftArm, -0.4051F, 0.2415F, -0.1022F);
        this.leftArm.cubeList.add(new ModelBox(leftArm, 40, 43, 0.0F, -0.5F, 0.0F, 1, 1, 3, 0.0F, false));

        this.leftArm2 = new AdvancedModelRenderer(this);
        this.leftArm2.setRotationPoint(0.0F, -0.5F, 3.0F);
        this.leftArm.addChild(leftArm2);
        this.setRotateAngle(leftArm2, -0.5247F, -0.0604F, 0.0349F);
        this.leftArm2.cubeList.add(new ModelBox(leftArm2, 40, 31, 0.0F, 0.0F, 0.0F, 1, 1, 2, 0.0F, false));

        this.leftArm3 = new AdvancedModelRenderer(this);
        this.leftArm3.setRotationPoint(0.0F, 0.5F, 2.0F);
        this.leftArm2.addChild(leftArm3);
        this.leftArm3.cubeList.add(new ModelBox(leftArm3, 26, 37, 0.0F, -0.5F, 0.0F, 1, 1, 1, 0.0F, false));

        this.rightArm = new AdvancedModelRenderer(this);
        this.rightArm.setRotationPoint(-1.5F, 4.0622F, -2.6549F);
        this.chest.addChild(rightArm);
        this.setRotateAngle(rightArm, -0.4051F, -0.2415F, 0.1022F);
        this.rightArm.cubeList.add(new ModelBox(rightArm, 40, 43, -1.0F, -0.5F, 0.0F, 1, 1, 3, 0.0F, true));

        this.rightArm2 = new AdvancedModelRenderer(this);
        this.rightArm2.setRotationPoint(0.0F, -0.5F, 3.0F);
        this.rightArm.addChild(rightArm2);
        this.setRotateAngle(rightArm2, -0.5247F, 0.0604F, -0.0349F);
        this.rightArm2.cubeList.add(new ModelBox(rightArm2, 40, 31, -1.0F, 0.0F, 0.0F, 1, 1, 2, 0.0F, true));

        this.rightArm3 = new AdvancedModelRenderer(this);
        this.rightArm3.setRotationPoint(0.0F, 0.5F, 2.0F);
        this.rightArm2.addChild(rightArm3);
        this.rightArm3.cubeList.add(new ModelBox(rightArm3, 26, 37, -1.0F, -0.5F, 0.0F, 1, 1, 1, 0.0F, true));

        this.neck3 = new AdvancedModelRenderer(this);
        this.neck3.setRotationPoint(0.0F, 1.8F, -4.3F);
        this.chest.addChild(neck3);


        this.cube_r5 = new AdvancedModelRenderer(this);
        this.cube_r5.setRotationPoint(0.5F, 0.0F, -1.8F);
        this.neck3.addChild(cube_r5);
        this.setRotateAngle(cube_r5, -0.2967F, 0.0F, 0.0F);
        this.cube_r5.cubeList.add(new ModelBox(cube_r5, 30, 37, -1.5F, -0.8F, -0.1F, 2, 3, 4, 0.004F, false));

        this.neck2 = new AdvancedModelRenderer(this);
        this.neck2.setRotationPoint(0.0F, -0.5F, -1.6F);
        this.neck3.addChild(neck2);


        this.cube_r6 = new AdvancedModelRenderer(this);
        this.cube_r6.setRotationPoint(0.0F, -1.6F, -1.1F);
        this.neck2.addChild(cube_r6);
        this.setRotateAngle(cube_r6, -0.7505F, 0.0F, 0.0F);
        this.cube_r6.cubeList.add(new ModelBox(cube_r6, 0, 40, -1.0F, -0.0414F, -0.9858F, 2, 3, 4, -0.002F, false));

        this.neck = new AdvancedModelRenderer(this);
        this.neck.setRotationPoint(0.0F, -1.8F, -1.7F);
        this.neck2.addChild(neck);
        this.setRotateAngle(neck, 0.1745F, 0.0F, 0.0F);


        this.cube_r7 = new AdvancedModelRenderer(this);
        this.cube_r7.setRotationPoint(-0.5F, -0.9F, -2.0F);
        this.neck.addChild(cube_r7);
        this.setRotateAngle(cube_r7, -0.2967F, 0.0F, 0.0F);
        this.cube_r7.cubeList.add(new ModelBox(cube_r7, 43, 37, -0.5F, -0.1267F, 0.2177F, 2, 3, 2, -0.004F, false));

        this.cube_r8 = new AdvancedModelRenderer(this);
        this.cube_r8.setRotationPoint(0.2F, 2.7F, -2.5017F);
        this.neck.addChild(cube_r8);
        this.setRotateAngle(cube_r8, -0.3491F, 0.0F, 0.0F);
        this.cube_r8.cubeList.add(new ModelBox(cube_r8, 31, 10, -0.7F, -1.0926F, -0.0353F, 1, 1, 3, 0.007F, false));

        this.head = new AdvancedModelRenderer(this);
        this.head.setRotationPoint(0.0F, -0.1F, -1.8F);
        this.neck.addChild(head);
        this.head.cubeList.add(new ModelBox(head, 17, 18, 0.06F, -0.3F, -2.1F, 1, 1, 1, 0.0F, false));
        this.head.cubeList.add(new ModelBox(head, 17, 18, -1.06F, -0.3F, -2.1F, 1, 1, 1, 0.0F, true));
        this.head.cubeList.add(new ModelBox(head, 45, 0, -1.0F, -0.4F, -2.1F, 2, 2, 2, 0.005F, false));

        this.cube_r9 = new AdvancedModelRenderer(this);
        this.cube_r9.setRotationPoint(0.0F, 0.4F, -4.3F);
        this.head.addChild(cube_r9);
        this.setRotateAngle(cube_r9, 1.0123F, 0.0F, 0.0F);
        this.cube_r9.cubeList.add(new ModelBox(cube_r9, 42, 10, -0.5F, -0.1053F, -0.9911F, 1, 1, 1, 0.0F, false));

        this.cube_r10 = new AdvancedModelRenderer(this);
        this.cube_r10.setRotationPoint(0.0F, -0.9F, -1.8F);
        this.head.addChild(cube_r10);
        this.setRotateAngle(cube_r10, 0.3665F, 0.0F, 0.0F);
        this.cube_r10.cubeList.add(new ModelBox(cube_r10, 0, 15, -0.8F, -0.0015F, -1.0387F, 1, 2, 1, -0.004F, false));
        this.cube_r10.cubeList.add(new ModelBox(cube_r10, 9, 40, -0.2F, -0.0015F, -1.0387F, 1, 2, 1, 0.004F, false));

        this.cube_r11 = new AdvancedModelRenderer(this);
        this.cube_r11.setRotationPoint(0.4F, 0.4F, -4.4F);
        this.head.addChild(cube_r11);
        this.setRotateAngle(cube_r11, 0.4712F, 0.0F, 0.0F);
        this.cube_r11.cubeList.add(new ModelBox(cube_r11, 0, 30, -1.0F, -0.0737F, -0.0118F, 1, 1, 2, -0.001F, true));
        this.cube_r11.cubeList.add(new ModelBox(cube_r11, 11, 30, -1.0F, 0.6263F, 0.9882F, 1, 1, 1, -0.003F, true));
        this.cube_r11.cubeList.add(new ModelBox(cube_r11, 11, 30, -0.8F, 0.6263F, 0.9882F, 1, 1, 1, -0.005F, false));
        this.cube_r11.cubeList.add(new ModelBox(cube_r11, 0, 30, -0.8F, -0.0737F, -0.0118F, 1, 1, 2, -0.003F, false));

        this.cube_r12 = new AdvancedModelRenderer(this);
        this.cube_r12.setRotationPoint(0.0F, -0.9F, -0.8F);
        this.head.addChild(cube_r12);
        this.setRotateAngle(cube_r12, -0.0175F, 0.0F, 0.0F);
        this.cube_r12.cubeList.add(new ModelBox(cube_r12, 23, 18, -1.0F, 0.0159F, -1.0386F, 2, 2, 2, 0.0F, false));

        this.cube_r13 = new AdvancedModelRenderer(this);
        this.cube_r13.setRotationPoint(0.0F, 1.6F, -2.1F);
        this.head.addChild(cube_r13);
        this.setRotateAngle(cube_r13, -0.1222F, 0.0F, 0.0F);
        this.cube_r13.cubeList.add(new ModelBox(cube_r13, 30, 26, -0.7F, -1.0F, -2.0F, 1, 1, 2, 0.004F, true));
        this.cube_r13.cubeList.add(new ModelBox(cube_r13, 30, 26, -0.3F, -1.0F, -2.0F, 1, 1, 2, 0.0F, false));

        this.jaw = new AdvancedModelRenderer(this);
        this.jaw.setRotationPoint(0.0F, 1.6F, 0.0F);
        this.head.addChild(jaw);
        this.setRotateAngle(jaw, -0.3403F, 0.0F, 0.0F);


        this.cube_r14 = new AdvancedModelRenderer(this);
        this.cube_r14.setRotationPoint(0.3F, 1.6F, -1.7017F);
        this.jaw.addChild(cube_r14);
        this.setRotateAngle(cube_r14, 0.0349F, 0.0F, 0.0F);
        this.cube_r14.cubeList.add(new ModelBox(cube_r14, 0, 34, -1.0F, -1.08F, -1.9366F, 1, 1, 2, -0.003F, true));
        this.cube_r14.cubeList.add(new ModelBox(cube_r14, 0, 34, -0.6F, -1.08F, -1.9366F, 1, 1, 2, -0.006F, false));

        this.cube_r15 = new AdvancedModelRenderer(this);
        this.cube_r15.setRotationPoint(0.3F, 0.7F, -3.9017F);
        this.jaw.addChild(cube_r15);
        this.setRotateAngle(cube_r15, 0.2269F, 0.0F, 0.0F);
        this.cube_r15.cubeList.add(new ModelBox(cube_r15, 0, 34, -1.0F, -0.03F, 0.0634F, 1, 1, 2, -0.002F, true));
        this.cube_r15.cubeList.add(new ModelBox(cube_r15, 0, 34, -0.6F, -0.03F, 0.0634F, 1, 1, 2, -0.004F, false));

        this.cube_r16 = new AdvancedModelRenderer(this);
        this.cube_r16.setRotationPoint(-0.3F, 1.6F, -3.6017F);
        this.jaw.addChild(cube_r16);
        this.setRotateAngle(cube_r16, -0.4014F, 0.0F, 0.0F);
        this.cube_r16.cubeList.add(new ModelBox(cube_r16, 37, 10, -0.2F, -0.977F, -0.9934F, 1, 1, 1, -0.01F, false));

        this.cube_r17 = new AdvancedModelRenderer(this);
        this.cube_r17.setRotationPoint(0.2F, 0.1F, -1.1017F);
        this.jaw.addChild(cube_r17);
        this.setRotateAngle(cube_r17, 0.1571F, 0.0F, 0.0F);
        this.cube_r17.cubeList.add(new ModelBox(cube_r17, 27, 0, -1.2F, -1.0F, -0.8F, 2, 1, 2, 0.002F, false));
        this.cube_r17.cubeList.add(new ModelBox(cube_r17, 30, 47, -1.2F, 0.3F, -0.8F, 2, 1, 2, -0.005F, false));
        this.cube_r17.cubeList.add(new ModelBox(cube_r17, 30, 22, -1.2F, 0.0F, -0.8F, 2, 1, 2, 0.0F, false));

        this.tail = new AdvancedModelRenderer(this);
        this.tail.setRotationPoint(0.0F, -1.1F, 3.9F);
        this.hips.addChild(tail);
        this.setRotateAngle(tail, -0.0436F, 0.0F, 0.0F);
        this.tail.cubeList.add(new ModelBox(tail, 16, 23, -1.5F, -0.5F, 0.0F, 3, 4, 7, 0.004F, false));

        this.tail2 = new AdvancedModelRenderer(this);
        this.tail2.setRotationPoint(0.0F, 0.0F, 7.0F);
        this.tail.addChild(tail2);
        this.setRotateAngle(tail2, -0.0349F, 0.0F, 0.0F);
        this.tail2.cubeList.add(new ModelBox(tail2, 17, 6, -1.0F, -0.5F, 0.0F, 2, 2, 9, 0.0F, false));

        this.tail3 = new AdvancedModelRenderer(this);
        this.tail3.setRotationPoint(0.0F, 0.0F, 8.6F);
        this.tail2.addChild(tail3);
        this.setRotateAngle(tail3, -0.1047F, 0.0F, 0.0F);
        this.tail3.cubeList.add(new ModelBox(tail3, 28, 26, -0.5F, -0.5F, 0.0F, 1, 1, 9, 0.004F, false));

        this.tail4 = new AdvancedModelRenderer(this);
        this.tail4.setRotationPoint(0.0F, 0.0F, 9.0F);
        this.tail3.addChild(tail4);
        this.setRotateAngle(tail4, 0.1396F, 0.0F, 0.0F);
        this.tail4.cubeList.add(new ModelBox(tail4, 0, 30, -0.5F, -0.5F, 0.0F, 1, 1, 8, 0.0F, false));

        updateDefaultPose();
        animator = ModelAnimator.create();
    }

    @Override
    public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        animate((IAnimatedEntity) entity, f, f1, f2, f3, f4, f5);
        this.hips.render(f5);
    }
    public void renderStaticWall(float f) {
        resetToDefaultPose();
    }
    public void renderStaticFloor(float f) {
        resetToDefaultPose();
    }

    @Override
    public void renderStaticBook(float f) {
        //Rotations, positions and sizing:
        this.hips.offsetY = -1.20F;
        this.hips.offsetX = -0.1F;
        this.hips.rotateAngleY = (float)Math.toRadians(130);
        this.hips.rotateAngleX = (float)Math.toRadians(-6);
        this.hips.rotateAngleZ = (float)Math.toRadians(-2);
        this.hips.scaleChildren = true;
        float scaler = 1.85F;
        this.hips.setScale(scaler, scaler, scaler);
        //Start of pose:

        //End of pose, now render the model:
        this.hips.render(f);
        //Reset rotations, positions and sizing:
        this.hips.setScale(1.0F, 1.0F, 1.0F);
        this.hips.scaleChildren = false;
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

        EntityPrehistoricFloraBerthasaura entityBerthasaura = (EntityPrehistoricFloraBerthasaura) e;

        this.faceTarget(f3, f4, 12, neck);
        this.faceTarget(f3, f4, 12, neck2);
        this.faceTarget(f3, f4, 12, neck3);
        this.faceTarget(f3, f4, 12, head);

        AdvancedModelRenderer[] Tail = {this.tail, this.tail2, this.tail3, this.tail4};
        AdvancedModelRenderer[] Neck = {this.neck, this.neck2, this.neck3, this.head};
        //AdvancedModelRenderer[] ArmL = {this.leftarm, this.leftarm2, this.leftarm3};
        //AdvancedModelRenderer[] ArmR = {this.rightarm, this.rightarm2, this.rightarm3};

        entityBerthasaura.tailBuffer.applyChainSwingBuffer(Tail);

        if (entityBerthasaura.getAnimation() == entityBerthasaura.LAY_ANIMATION) {
            this.chainSwing(Neck, 0.5F, 0.10F, 0.5, f2, 0.8F);
            this.chainWave(Neck, 0.5F * 2, -0.02F, 0.5F, f2, 0.8F);
        } else {
            if (!entityBerthasaura.isReallyInWater()) {

                if (f3 == 0.0F || !entityBerthasaura.getIsMoving()) {
                    if (entityBerthasaura.getAnimation() != entityBerthasaura.EAT_ANIMATION
                            && entityBerthasaura.getAnimation() != entityBerthasaura.DRINK_ANIMATION) {
                        this.chainSwing(Neck, 0.05F, 0.10F, 0.5, f2, 0.8F);
                        this.chainWave(Neck, 0.05F * 2, -0.02F, 0.5F, f2, 0.8F);
                    }

                    this.chainWave(Tail, (0.15F * 0.35F), 0.125F * 0.15F, 0.2F, f2, 1F);
                    this.chainSwing(Tail, (0.15F * 0.35F) * 4F, 0.05F * 0.35F, 0.12F, f2, 1F);


                    return;
                }

                if (entityBerthasaura.getIsFast()) { //Running


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
        EntityPrehistoricFloraBerthasaura ee = (EntityPrehistoricFloraBerthasaura) entitylivingbaseIn;

        if (!ee.isReallyInWater()) {
            if (ee.getIsMoving()) {
                if (ee.getIsFast()) { //Running
                    animRunning(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime);
                } else { //Walking
                    animWalking(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime);
                }
            }
        } else {
            //Swimming pose:
            if (!ee.getIsMoving()) { //static in water
                //
            } else {
                //moving in water
                //
            }
        }
        if (ee.getAnimation() == ee.EAT_ANIMATION) {
            animEat(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime, ee.getAnimationTick());
        } else if (ee.getAnimation() == ee.ATTACK_ANIMATION) {
            animEat(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime, ee.getAnimationTick());
        } else if (ee.getAnimation() == ee.MAKE_NEST_ANIMATION) {
            animNest(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime, ee.getAnimationTick());
        } else if (ee.getAnimation() == ee.LAY_ANIMATION) {
            animLay(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime, ee.getAnimationTick());
        } else if (ee.getAnimation() == ee.ROAR_ANIMATION) { //The noise anim
            animNoise(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime, ee.getAnimationTick());
        }
        else if (ee.getAnimation() == ee.GRAZE_ANIMATION) {
            animGraze(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime, ee.getAnimationTick());
        }
        else if (ee.getAnimation() == ee.ALERT_ANIMATION) {
            animIdle(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime, ee.getAnimationTick());
        }

    }

    public void animIdle(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime, double animTick) {
        EntityPrehistoricFloraBerthasaura entity = (EntityPrehistoricFloraBerthasaura) entitylivingbaseIn;
        int animCycle = 60;
        double tickAnim = animTick + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;
         if (tickAnim >= 0 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 0) / 20) * (-22.5-(0)));
            yy = 0 + (((tickAnim - 0) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 20) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 50) {
            xx = -22.5 + (((tickAnim - 20) / 30) * (-22.5-(-22.5)));
            yy = 0 + (((tickAnim - 20) / 30) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 30) * (0-(0)));
        }
        else if (tickAnim >= 50 && tickAnim < 60) {
            xx = -22.5 + (((tickAnim - 50) / 10) * (0-(-22.5)));
            yy = 0 + (((tickAnim - 50) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 50) / 10) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(hips, hips.rotateAngleX + (float) Math.toRadians(xx), hips.rotateAngleY + (float) Math.toRadians(yy), hips.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 0) / 20) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 20) * (0.675-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 20) / 30) * (0-(0)));
            yy = 0 + (((tickAnim - 20) / 30) * (0-(0)));
            zz = 0.675 + (((tickAnim - 20) / 30) * (0.675-(0.675)));
        }
        else if (tickAnim >= 50 && tickAnim < 60) {
            xx = 0 + (((tickAnim - 50) / 10) * (0-(0)));
            yy = 0 + (((tickAnim - 50) / 10) * (0-(0)));
            zz = 0.675 + (((tickAnim - 50) / 10) * (0-(0.675)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.hips.rotationPointX = this.hips.rotationPointX + (float)(xx);
        this.hips.rotationPointY = this.hips.rotationPointY - (float)(yy);
        this.hips.rotationPointZ = this.hips.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 0) / 20) * (21.75-(0)));
            yy = 0 + (((tickAnim - 0) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 20) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 50) {
            xx = 21.75 + (((tickAnim - 20) / 30) * (21.75-(21.75)));
            yy = 0 + (((tickAnim - 20) / 30) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 30) * (0-(0)));
        }
        else if (tickAnim >= 50 && tickAnim < 60) {
            xx = 21.75 + (((tickAnim - 50) / 10) * (0-(21.75)));
            yy = 0 + (((tickAnim - 50) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 50) / 10) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftLeg, leftLeg.rotateAngleX + (float) Math.toRadians(xx), leftLeg.rotateAngleY + (float) Math.toRadians(yy), leftLeg.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 0) / 20) * (21.75-(0)));
            yy = 0 + (((tickAnim - 0) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 20) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 50) {
            xx = 21.75 + (((tickAnim - 20) / 30) * (21.75-(21.75)));
            yy = 0 + (((tickAnim - 20) / 30) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 30) * (0-(0)));
        }
        else if (tickAnim >= 50 && tickAnim < 60) {
            xx = 21.75 + (((tickAnim - 50) / 10) * (0-(21.75)));
            yy = 0 + (((tickAnim - 50) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 50) / 10) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightLeg, rightLeg.rotateAngleX + (float) Math.toRadians(xx), rightLeg.rotateAngleY + (float) Math.toRadians(yy), rightLeg.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 0) / 20) * (6.647+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120))*-2-(0)));
            yy = 0 + (((tickAnim - 0) / 20) * (5.24607-(0)));
            zz = 0 + (((tickAnim - 0) / 20) * (6.81592-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 32) {
            xx = 6.647+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120))*-2 + (((tickAnim - 20) / 12) * (6.54705-(6.647+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120))*-2)));
            yy = 5.24607 + (((tickAnim - 20) / 12) * (6.72107-(5.24607)));
            zz = 6.81592 + (((tickAnim - 20) / 12) * (6.81592-(6.81592)));
        }
        else if (tickAnim >= 32 && tickAnim < 50) {
            xx = 6.54705 + (((tickAnim - 32) / 18) * (3.5984-(6.54705)));
            yy = 6.72107 + (((tickAnim - 32) / 18) * (-6.3685-(6.72107)));
            zz = 6.81592 + (((tickAnim - 32) / 18) * (-6.29261-(6.81592)));
        }
        else if (tickAnim >= 50 && tickAnim < 60) {
            xx = 3.5984 + (((tickAnim - 50) / 10) * (0-(3.5984)));
            yy = -6.3685 + (((tickAnim - 50) / 10) * (0-(-6.3685)));
            zz = -6.29261 + (((tickAnim - 50) / 10) * (0-(-6.29261)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(body, body.rotateAngleX + (float) Math.toRadians(xx), body.rotateAngleY + (float) Math.toRadians(yy), body.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 0) / 20) * (10.76981-(0)));
            yy = 0 + (((tickAnim - 0) / 20) * (12.7786-(0)));
            zz = 0 + (((tickAnim - 0) / 20) * (2.40915-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 32) {
            xx = 10.76981 + (((tickAnim - 20) / 12) * (6.26981-(10.76981)));
            yy = 12.7786 + (((tickAnim - 20) / 12) * (12.7786-(12.7786)));
            zz = 2.40915 + (((tickAnim - 20) / 12) * (2.40915-(2.40915)));
        }
        else if (tickAnim >= 32 && tickAnim < 45) {
            xx = 6.26981 + (((tickAnim - 32) / 13) * (6.83063-(6.26981)));
            yy = 12.7786 + (((tickAnim - 32) / 13) * (-5.62489-(12.7786)));
            zz = 2.40915 + (((tickAnim - 32) / 13) * (-6.16087-(2.40915)));
        }
        else if (tickAnim >= 45 && tickAnim < 50) {
            xx = 6.83063 + (((tickAnim - 45) / 5) * (6.84692-(6.83063)));
            yy = -5.62489 + (((tickAnim - 45) / 5) * (-6.866-(-5.62489)));
            zz = -6.16087 + (((tickAnim - 45) / 5) * (-6.3106-(-6.16087)));
        }
        else if (tickAnim >= 50 && tickAnim < 60) {
            xx = 6.84692 + (((tickAnim - 50) / 10) * (0-(6.84692)));
            yy = -6.866 + (((tickAnim - 50) / 10) * (0-(-6.866)));
            zz = -6.3106 + (((tickAnim - 50) / 10) * (0-(-6.3106)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(chest, chest.rotateAngleX + (float) Math.toRadians(xx), chest.rotateAngleY + (float) Math.toRadians(yy), chest.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 0) / 8) * (4.3693+Math.sin((Math.PI/180)*(((double)tickAnim/20)*150-90))*-20-(0)));
            yy = 0 + (((tickAnim - 0) / 8) * (6.42655-(0)));
            zz = 0 + (((tickAnim - 0) / 8) * (3.87395-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 20) {
            xx = 4.3693+Math.sin((Math.PI/180)*(((double)tickAnim/20)*150-90))*-20 + (((tickAnim - 8) / 12) * (-3.58165-(4.3693+Math.sin((Math.PI/180)*(((double)tickAnim/20)*150-90))*-20)));
            yy = 6.42655 + (((tickAnim - 8) / 12) * (7.83971-(6.42655)));
            zz = 3.87395 + (((tickAnim - 8) / 12) * (4.72581-(3.87395)));
        }
        else if (tickAnim >= 20 && tickAnim < 32) {
            xx = -3.58165 + (((tickAnim - 20) / 12) * (4.16835-(-3.58165)));
            yy = 7.83971 + (((tickAnim - 20) / 12) * (7.83971-(7.83971)));
            zz = 4.72581 + (((tickAnim - 20) / 12) * (4.72581-(4.72581)));
        }
        else if (tickAnim >= 32 && tickAnim < 38) {
            xx = 4.16835 + (((tickAnim - 32) / 6) * (21.45931-(4.16835)));
            yy = 7.83971 + (((tickAnim - 32) / 6) * (1.9288-(7.83971)));
            zz = 4.72581 + (((tickAnim - 32) / 6) * (3.29192-(4.72581)));
        }
        else if (tickAnim >= 38 && tickAnim < 45) {
            xx = 21.45931 + (((tickAnim - 38) / 7) * (4.28152-(21.45931)));
            yy = 1.9288 + (((tickAnim - 38) / 7) * (-3.98212-(1.9288)));
            zz = 3.29192 + (((tickAnim - 38) / 7) * (1.85804-(3.29192)));
        }
        else if (tickAnim >= 45 && tickAnim < 50) {
            xx = 4.28152 + (((tickAnim - 45) / 5) * (0.53152-(4.28152)));
            yy = -3.98212 + (((tickAnim - 45) / 5) * (-3.98212-(-3.98212)));
            zz = 1.85804 + (((tickAnim - 45) / 5) * (1.85804-(1.85804)));
        }
        else if (tickAnim >= 50 && tickAnim < 60) {
            xx = 0.53152 + (((tickAnim - 50) / 10) * (0-(0.53152)));
            yy = -3.98212 + (((tickAnim - 50) / 10) * (0-(-3.98212)));
            zz = 1.85804 + (((tickAnim - 50) / 10) * (0-(1.85804)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck3, neck3.rotateAngleX + (float) Math.toRadians(xx), neck3.rotateAngleY + (float) Math.toRadians(yy), neck3.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 0) / 8) * (16.93628-(0)));
            yy = 0 + (((tickAnim - 0) / 8) * (8.75528-(0)));
            zz = 0 + (((tickAnim - 0) / 8) * (-0.11759-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 20) {
            xx = 16.93628 + (((tickAnim - 8) / 12) * (-0.77925-(16.93628)));
            yy = 8.75528 + (((tickAnim - 8) / 12) * (15.74862-(8.75528)));
            zz = -0.11759 + (((tickAnim - 8) / 12) * (-0.21151-(-0.11759)));
        }
        else if (tickAnim >= 20 && tickAnim < 25) {
            xx = -0.77925 + (((tickAnim - 20) / 5) * (1.89771-(-0.77925)));
            yy = 15.74862 + (((tickAnim - 20) / 5) * (15.65566-(15.74862)));
            zz = -0.21151 + (((tickAnim - 20) / 5) * (9.65718-(-0.21151)));
        }
        else if (tickAnim >= 25 && tickAnim < 32) {
            xx = 1.89771 + (((tickAnim - 25) / 7) * (11.89771-(1.89771)));
            yy = 15.65566 + (((tickAnim - 25) / 7) * (15.65566-(15.65566)));
            zz = 9.65718 + (((tickAnim - 25) / 7) * (9.65718-(9.65718)));
        }
        else if (tickAnim >= 32 && tickAnim < 38) {
            xx = 11.89771 + (((tickAnim - 32) / 6) * (22.46264-(11.89771)));
            yy = 15.65566 + (((tickAnim - 32) / 6) * (-0.37969-(15.65566)));
            zz = 9.65718 + (((tickAnim - 32) / 6) * (2.57328-(9.65718)));
        }
        else if (tickAnim >= 38 && tickAnim < 45) {
            xx = 22.46264 + (((tickAnim - 38) / 7) * (12.27757-(22.46264)));
            yy = -0.37969 + (((tickAnim - 38) / 7) * (-16.41504-(-0.37969)));
            zz = 2.57328 + (((tickAnim - 38) / 7) * (-4.51062-(2.57328)));
        }
        else if (tickAnim >= 45 && tickAnim < 50) {
            xx = 12.27757 + (((tickAnim - 45) / 5) * (6.77757-(12.27757)));
            yy = -16.41504 + (((tickAnim - 45) / 5) * (-16.41504-(-16.41504)));
            zz = -4.51062 + (((tickAnim - 45) / 5) * (-4.51062-(-4.51062)));
        }
        else if (tickAnim >= 50 && tickAnim < 60) {
            xx = 6.77757 + (((tickAnim - 50) / 10) * (0-(6.77757)));
            yy = -16.41504 + (((tickAnim - 50) / 10) * (0-(-16.41504)));
            zz = -4.51062 + (((tickAnim - 50) / 10) * (0-(-4.51062)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck2, neck2.rotateAngleX + (float) Math.toRadians(xx), neck2.rotateAngleY + (float) Math.toRadians(yy), neck2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 0) / 8) * (-14.73-(0)));
            yy = 0 + (((tickAnim - 0) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 8) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 20) {
            xx = -14.73 + (((tickAnim - 8) / 12) * (13.5-(-14.73)));
            yy = 0 + (((tickAnim - 8) / 12) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 12) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 25) {
            xx = 13.5 + (((tickAnim - 20) / 5) * (13.43538-(13.5)));
            yy = 0 + (((tickAnim - 20) / 5) * (-1.79282-(0)));
            zz = 0 + (((tickAnim - 20) / 5) * (4.12812-(0)));
        }
        else if (tickAnim >= 25 && tickAnim < 32) {
            xx = 13.43538 + (((tickAnim - 25) / 7) * (-6.31462-(13.43538)));
            yy = -1.79282 + (((tickAnim - 25) / 7) * (-1.79282-(-1.79282)));
            zz = 4.12812 + (((tickAnim - 25) / 7) * (4.12812-(4.12812)));
        }
        else if (tickAnim >= 32 && tickAnim < 38) {
            xx = -6.31462 + (((tickAnim - 32) / 6) * (-16.72782-(-6.31462)));
            yy = -1.79282 + (((tickAnim - 32) / 6) * (-8.77793-(-1.79282)));
            zz = 4.12812 + (((tickAnim - 32) / 6) * (3.66521-(4.12812)));
        }
        else if (tickAnim >= 38 && tickAnim < 45) {
            xx = -16.72782 + (((tickAnim - 38) / 7) * (-6.17228-(-16.72782)));
            yy = -8.77793 + (((tickAnim - 38) / 7) * (-15.76305-(-8.77793)));
            zz = 3.66521 + (((tickAnim - 38) / 7) * (3.2023-(3.66521)));
        }
        else if (tickAnim >= 45 && tickAnim < 50) {
            xx = -6.17228 + (((tickAnim - 45) / 5) * (6.06358-(-6.17228)));
            yy = -15.76305 + (((tickAnim - 45) / 5) * (-14.75608-(-15.76305)));
            zz = 3.2023 + (((tickAnim - 45) / 5) * (-0.54208-(3.2023)));
        }
        else if (tickAnim >= 50 && tickAnim < 60) {
            xx = 6.06358 + (((tickAnim - 50) / 10) * (0-(6.06358)));
            yy = -14.75608 + (((tickAnim - 50) / 10) * (0-(-14.75608)));
            zz = -0.54208 + (((tickAnim - 50) / 10) * (0-(-0.54208)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck, neck.rotateAngleX + (float) Math.toRadians(xx), neck.rotateAngleY + (float) Math.toRadians(yy), neck.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 0) / 8) * (-9-(0)));
            yy = 0 + (((tickAnim - 0) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 8) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 20) {
            xx = -9 + (((tickAnim - 8) / 12) * (5.5-(-9)));
            yy = 0 + (((tickAnim - 8) / 12) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 12) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 25) {
            xx = 5.5 + (((tickAnim - 20) / 5) * (5.5-(5.5)));
            yy = 0 + (((tickAnim - 20) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 5) * (0-(0)));
        }
        else if (tickAnim >= 25 && tickAnim < 27) {
            xx = 5.5 + (((tickAnim - 25) / 2) * (-1-(5.5)));
            yy = 0 + (((tickAnim - 25) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 25) / 2) * (0-(0)));
        }
        else if (tickAnim >= 27 && tickAnim < 28) {
            xx = -1 + (((tickAnim - 27) / 1) * (5.5-(-1)));
            yy = 0 + (((tickAnim - 27) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 27) / 1) * (0-(0)));
        }
        else if (tickAnim >= 28 && tickAnim < 30) {
            xx = 5.5 + (((tickAnim - 28) / 2) * (-1-(5.5)));
            yy = 0 + (((tickAnim - 28) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 28) / 2) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 32) {
            xx = -1 + (((tickAnim - 30) / 2) * (5.5-(-1)));
            yy = 0 + (((tickAnim - 30) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 30) / 2) * (0-(0)));
        }
        else if (tickAnim >= 32 && tickAnim < 38) {
            xx = 5.5 + (((tickAnim - 32) / 6) * (-9-(5.5)));
            yy = 0 + (((tickAnim - 32) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 32) / 6) * (0-(0)));
        }
        else if (tickAnim >= 38 && tickAnim < 45) {
            xx = -9 + (((tickAnim - 38) / 7) * (3.76473-(-9)));
            yy = 0 + (((tickAnim - 38) / 7) * (1.91298-(0)));
            zz = 0 + (((tickAnim - 38) / 7) * (1.78673-(0)));
        }
        else if (tickAnim >= 45 && tickAnim < 50) {
            xx = 3.76473 + (((tickAnim - 45) / 5) * (3.76473-(3.76473)));
            yy = 1.91298 + (((tickAnim - 45) / 5) * (1.91298-(1.91298)));
            zz = 1.78673 + (((tickAnim - 45) / 5) * (1.78673-(1.78673)));
        }
        else if (tickAnim >= 50 && tickAnim < 60) {
            xx = 3.76473 + (((tickAnim - 50) / 10) * (0-(3.76473)));
            yy = 1.91298 + (((tickAnim - 50) / 10) * (0-(1.91298)));
            zz = 1.78673 + (((tickAnim - 50) / 10) * (0-(1.78673)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(head, head.rotateAngleX + (float) Math.toRadians(xx), head.rotateAngleY + (float) Math.toRadians(yy), head.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 0) / 20) * (-7.53742-(0)));
            yy = 0 + (((tickAnim - 0) / 20) * (4.92385-(0)));
            zz = 0 + (((tickAnim - 0) / 20) * (-0.87038-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 30) {
            xx = -7.53742 + (((tickAnim - 20) / 10) * (-7.50933-(-7.53742)));
            yy = 4.92385 + (((tickAnim - 20) / 10) * (2.462-(4.92385)));
            zz = -0.87038 + (((tickAnim - 20) / 10) * (-0.43439-(-0.87038)));
        }
        else if (tickAnim >= 30 && tickAnim < 45) {
            xx = -7.50933 + (((tickAnim - 30) / 15) * (-7.72813-(-7.50933)));
            yy = 2.462 + (((tickAnim - 30) / 15) * (-12.06107-(2.462)));
            zz = -0.43439 + (((tickAnim - 30) / 15) * (2.15918-(-0.43439)));
        }
        else if (tickAnim >= 45 && tickAnim < 60) {
            xx = -7.72813 + (((tickAnim - 45) / 15) * (0-(-7.72813)));
            yy = -12.06107 + (((tickAnim - 45) / 15) * (0-(-12.06107)));
            zz = 2.15918 + (((tickAnim - 45) / 15) * (0-(2.15918)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tail, tail.rotateAngleX + (float) Math.toRadians(xx), tail.rotateAngleY + (float) Math.toRadians(yy), tail.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 0) / 20) * (4.28645-(0)));
            yy = 0 + (((tickAnim - 0) / 20) * (10.24201-(0)));
            zz = 0 + (((tickAnim - 0) / 20) * (0.40675-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 30) {
            xx = 4.28645 + (((tickAnim - 20) / 10) * (4.33768-(4.28645)));
            yy = 10.24201 + (((tickAnim - 20) / 10) * (15.73754-(10.24201)));
            zz = 0.40675 + (((tickAnim - 20) / 10) * (0.63438-(0.40675)));
        }
        else if (tickAnim >= 30 && tickAnim < 45) {
            xx = 4.33768 + (((tickAnim - 30) / 15) * (4.27802-(4.33768)));
            yy = 15.73754 + (((tickAnim - 30) / 15) * (-8.993-(15.73754)));
            zz = 0.63438 + (((tickAnim - 30) / 15) * (-0.35627-(0.63438)));
        }
        else if (tickAnim >= 45 && tickAnim < 60) {
            xx = 4.27802 + (((tickAnim - 45) / 15) * (0-(4.27802)));
            yy = -8.993 + (((tickAnim - 45) / 15) * (0-(-8.993)));
            zz = -0.35627 + (((tickAnim - 45) / 15) * (0-(-0.35627)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tail2, tail2.rotateAngleX + (float) Math.toRadians(xx), tail2.rotateAngleY + (float) Math.toRadians(yy), tail2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 0) / 20) * (15.60355-(0)));
            yy = 0 + (((tickAnim - 0) / 20) * (-8.38258-(0)));
            zz = 0 + (((tickAnim - 0) / 20) * (-1.413-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 30) {
            xx = 15.60355 + (((tickAnim - 20) / 10) * (15.58046-(15.60355)));
            yy = -8.38258 + (((tickAnim - 20) / 10) * (7.39656-(-8.38258)));
            zz = -1.413 + (((tickAnim - 20) / 10) * (1.24478-(-1.413)));
        }
        else if (tickAnim >= 30 && tickAnim < 45) {
            xx = 15.58046 + (((tickAnim - 30) / 15) * (15.61622-(15.58046)));
            yy = 7.39656 + (((tickAnim - 30) / 15) * (-8.87557-(7.39656)));
            zz = 1.24478 + (((tickAnim - 30) / 15) * (-1.49743-(1.24478)));
        }
        else if (tickAnim >= 45 && tickAnim < 51) {
            xx = 15.61622 + (((tickAnim - 45) / 6) * (15.67448-(15.61622)));
            yy = -8.87557 + (((tickAnim - 45) / 6) * (-10.8473-(-8.87557)));
            zz = -1.49743 + (((tickAnim - 45) / 6) * (-1.83753-(-1.49743)));
        }
        else if (tickAnim >= 51 && tickAnim < 60) {
            xx = 15.67448 + (((tickAnim - 51) / 9) * (0-(15.67448)));
            yy = -10.8473 + (((tickAnim - 51) / 9) * (0-(-10.8473)));
            zz = -1.83753 + (((tickAnim - 51) / 9) * (0-(-1.83753)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tail3, tail3.rotateAngleX + (float) Math.toRadians(xx), tail3.rotateAngleY + (float) Math.toRadians(yy), tail3.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 0) / 20) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 20) * (-24.25-(0)));
            zz = 0 + (((tickAnim - 0) / 20) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 30) {
            xx = 0 + (((tickAnim - 20) / 10) * (0-(0)));
            yy = -24.25 + (((tickAnim - 20) / 10) * (13.25-(-24.25)));
            zz = 0 + (((tickAnim - 20) / 10) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 45) {
            xx = 0 + (((tickAnim - 30) / 15) * (0-(0)));
            yy = 13.25 + (((tickAnim - 30) / 15) * (3.75-(13.25)));
            zz = 0 + (((tickAnim - 30) / 15) * (0-(0)));
        }
        else if (tickAnim >= 45 && tickAnim < 51) {
            xx = 0 + (((tickAnim - 45) / 6) * (0-(0)));
            yy = 3.75 + (((tickAnim - 45) / 6) * (-15.75-(3.75)));
            zz = 0 + (((tickAnim - 45) / 6) * (0-(0)));
        }
        else if (tickAnim >= 51 && tickAnim < 60) {
            xx = 0 + (((tickAnim - 51) / 9) * (0-(0)));
            yy = -15.75 + (((tickAnim - 51) / 9) * (0-(-15.75)));
            zz = 0 + (((tickAnim - 51) / 9) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tail4, tail4.rotateAngleX + (float) Math.toRadians(xx), tail4.rotateAngleY + (float) Math.toRadians(yy), tail4.rotateAngleZ + (float) Math.toRadians(zz));

    }
    public void animLay(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime, double animTick) {
        EntityPrehistoricFloraBerthasaura entity = (EntityPrehistoricFloraBerthasaura) entitylivingbaseIn;
        int animCycle = 50;
        double tickAnim = animTick + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;
         if (tickAnim >= 0 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 0) / 15) * (-5.5-(0)));
            yy = 0 + (((tickAnim - 0) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 15) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 33) {
            xx = -5.5 + (((tickAnim - 15) / 18) * (-5.5-(-5.5)));
            yy = 0 + (((tickAnim - 15) / 18) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 18) * (0-(0)));
        }
        else if (tickAnim >= 33 && tickAnim < 50) {
            xx = -5.5 + (((tickAnim - 33) / 17) * (0-(-5.5)));
            yy = 0 + (((tickAnim - 33) / 17) * (0-(0)));
            zz = 0 + (((tickAnim - 33) / 17) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(hips, hips.rotateAngleX + (float) Math.toRadians(xx), hips.rotateAngleY + (float) Math.toRadians(yy), hips.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 0) / 15) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 15) * (-6.2-(0)));
            zz = 0 + (((tickAnim - 0) / 15) * (5.075-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 33) {
            xx = 0 + (((tickAnim - 15) / 18) * (0-(0)));
            yy = -6.2 + (((tickAnim - 15) / 18) * (-6.2-(-6.2)));
            zz = 5.075 + (((tickAnim - 15) / 18) * (5.075-(5.075)));
        }
        else if (tickAnim >= 33 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 33) / 17) * (0-(0)));
            yy = -6.2 + (((tickAnim - 33) / 17) * (0-(-6.2)));
            zz = 5.075 + (((tickAnim - 33) / 17) * (0-(5.075)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.hips.rotationPointX = this.hips.rotationPointX + (float)(xx);
        this.hips.rotationPointY = this.hips.rotationPointY - (float)(yy);
        this.hips.rotationPointZ = this.hips.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 0) / 15) * (-24.5-(0)));
            yy = 0 + (((tickAnim - 0) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 15) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 33) {
            xx = -24.5 + (((tickAnim - 15) / 18) * (-24.5-(-24.5)));
            yy = 0 + (((tickAnim - 15) / 18) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 18) * (0-(0)));
        }
        else if (tickAnim >= 33 && tickAnim < 50) {
            xx = -24.5 + (((tickAnim - 33) / 17) * (0-(-24.5)));
            yy = 0 + (((tickAnim - 33) / 17) * (0-(0)));
            zz = 0 + (((tickAnim - 33) / 17) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftLeg, leftLeg.rotateAngleX + (float) Math.toRadians(xx), leftLeg.rotateAngleY + (float) Math.toRadians(yy), leftLeg.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 0) / 15) * (45.75-(0)));
            yy = 0 + (((tickAnim - 0) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 15) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 33) {
            xx = 45.75 + (((tickAnim - 15) / 18) * (45.75-(45.75)));
            yy = 0 + (((tickAnim - 15) / 18) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 18) * (0-(0)));
        }
        else if (tickAnim >= 33 && tickAnim < 50) {
            xx = 45.75 + (((tickAnim - 33) / 17) * (0-(45.75)));
            yy = 0 + (((tickAnim - 33) / 17) * (0-(0)));
            zz = 0 + (((tickAnim - 33) / 17) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftLeg2, leftLeg2.rotateAngleX + (float) Math.toRadians(xx), leftLeg2.rotateAngleY + (float) Math.toRadians(yy), leftLeg2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 0) / 15) * (-62-(0)));
            yy = 0 + (((tickAnim - 0) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 15) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 33) {
            xx = -62 + (((tickAnim - 15) / 18) * (-62-(-62)));
            yy = 0 + (((tickAnim - 15) / 18) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 18) * (0-(0)));
        }
        else if (tickAnim >= 33 && tickAnim < 50) {
            xx = -62 + (((tickAnim - 33) / 17) * (0-(-62)));
            yy = 0 + (((tickAnim - 33) / 17) * (0-(0)));
            zz = 0 + (((tickAnim - 33) / 17) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftLeg3, leftLeg3.rotateAngleX + (float) Math.toRadians(xx), leftLeg3.rotateAngleY + (float) Math.toRadians(yy), leftLeg3.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 0) / 15) * (45.5-(0)));
            yy = 0 + (((tickAnim - 0) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 15) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 33) {
            xx = 45.5 + (((tickAnim - 15) / 18) * (45.5-(45.5)));
            yy = 0 + (((tickAnim - 15) / 18) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 18) * (0-(0)));
        }
        else if (tickAnim >= 33 && tickAnim < 50) {
            xx = 45.5 + (((tickAnim - 33) / 17) * (0-(45.5)));
            yy = 0 + (((tickAnim - 33) / 17) * (0-(0)));
            zz = 0 + (((tickAnim - 33) / 17) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftLeg4, leftLeg4.rotateAngleX + (float) Math.toRadians(xx), leftLeg4.rotateAngleY + (float) Math.toRadians(yy), leftLeg4.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 0) / 15) * (-24.5-(0)));
            yy = 0 + (((tickAnim - 0) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 15) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 33) {
            xx = -24.5 + (((tickAnim - 15) / 18) * (-24.5-(-24.5)));
            yy = 0 + (((tickAnim - 15) / 18) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 18) * (0-(0)));
        }
        else if (tickAnim >= 33 && tickAnim < 50) {
            xx = -24.5 + (((tickAnim - 33) / 17) * (0-(-24.5)));
            yy = 0 + (((tickAnim - 33) / 17) * (0-(0)));
            zz = 0 + (((tickAnim - 33) / 17) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightLeg, rightLeg.rotateAngleX + (float) Math.toRadians(xx), rightLeg.rotateAngleY + (float) Math.toRadians(yy), rightLeg.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 0) / 15) * (45.75-(0)));
            yy = 0 + (((tickAnim - 0) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 15) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 33) {
            xx = 45.75 + (((tickAnim - 15) / 18) * (45.75-(45.75)));
            yy = 0 + (((tickAnim - 15) / 18) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 18) * (0-(0)));
        }
        else if (tickAnim >= 33 && tickAnim < 50) {
            xx = 45.75 + (((tickAnim - 33) / 17) * (0-(45.75)));
            yy = 0 + (((tickAnim - 33) / 17) * (0-(0)));
            zz = 0 + (((tickAnim - 33) / 17) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightLeg2, rightLeg2.rotateAngleX + (float) Math.toRadians(xx), rightLeg2.rotateAngleY + (float) Math.toRadians(yy), rightLeg2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 0) / 15) * (-62-(0)));
            yy = 0 + (((tickAnim - 0) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 15) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 33) {
            xx = -62 + (((tickAnim - 15) / 18) * (-62-(-62)));
            yy = 0 + (((tickAnim - 15) / 18) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 18) * (0-(0)));
        }
        else if (tickAnim >= 33 && tickAnim < 50) {
            xx = -62 + (((tickAnim - 33) / 17) * (0-(-62)));
            yy = 0 + (((tickAnim - 33) / 17) * (0-(0)));
            zz = 0 + (((tickAnim - 33) / 17) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightLeg3, rightLeg3.rotateAngleX + (float) Math.toRadians(xx), rightLeg3.rotateAngleY + (float) Math.toRadians(yy), rightLeg3.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 0) / 15) * (45.5-(0)));
            yy = 0 + (((tickAnim - 0) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 15) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 33) {
            xx = 45.5 + (((tickAnim - 15) / 18) * (45.5-(45.5)));
            yy = 0 + (((tickAnim - 15) / 18) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 18) * (0-(0)));
        }
        else if (tickAnim >= 33 && tickAnim < 50) {
            xx = 45.5 + (((tickAnim - 33) / 17) * (0-(45.5)));
            yy = 0 + (((tickAnim - 33) / 17) * (0-(0)));
            zz = 0 + (((tickAnim - 33) / 17) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightLeg4, rightLeg4.rotateAngleX + (float) Math.toRadians(xx), rightLeg4.rotateAngleY + (float) Math.toRadians(yy), rightLeg4.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 0) / 15) * (1.25-(0)));
            yy = 0 + (((tickAnim - 0) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 15) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 33) {
            xx = 1.25 + (((tickAnim - 15) / 18) * (1.25-(1.25)));
            yy = 0 + (((tickAnim - 15) / 18) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 18) * (0-(0)));
        }
        else if (tickAnim >= 33 && tickAnim < 50) {
            xx = 1.25 + (((tickAnim - 33) / 17) * (0-(1.25)));
            yy = 0 + (((tickAnim - 33) / 17) * (0-(0)));
            zz = 0 + (((tickAnim - 33) / 17) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(body, body.rotateAngleX + (float) Math.toRadians(xx), body.rotateAngleY + (float) Math.toRadians(yy), body.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 0) / 15) * (7-(0)));
            yy = 0 + (((tickAnim - 0) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 15) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 33) {
            xx = 7 + (((tickAnim - 15) / 18) * (7-(7)));
            yy = 0 + (((tickAnim - 15) / 18) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 18) * (0-(0)));
        }
        else if (tickAnim >= 33 && tickAnim < 50) {
            xx = 7 + (((tickAnim - 33) / 17) * (0-(7)));
            yy = 0 + (((tickAnim - 33) / 17) * (0-(0)));
            zz = 0 + (((tickAnim - 33) / 17) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck3, neck3.rotateAngleX + (float) Math.toRadians(xx), neck3.rotateAngleY + (float) Math.toRadians(yy), neck3.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 0) / 15) * (-10.25-(0)));
            yy = 0 + (((tickAnim - 0) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 15) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 33) {
            xx = -10.25 + (((tickAnim - 15) / 18) * (-10.25-(-10.25)));
            yy = 0 + (((tickAnim - 15) / 18) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 18) * (0-(0)));
        }
        else if (tickAnim >= 33 && tickAnim < 50) {
            xx = -10.25 + (((tickAnim - 33) / 17) * (0-(-10.25)));
            yy = 0 + (((tickAnim - 33) / 17) * (0-(0)));
            zz = 0 + (((tickAnim - 33) / 17) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tail, tail.rotateAngleX + (float) Math.toRadians(xx), tail.rotateAngleY + (float) Math.toRadians(yy), tail.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 0) / 15) * (-4-(0)));
            yy = 0 + (((tickAnim - 0) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 15) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 33) {
            xx = -4 + (((tickAnim - 15) / 18) * (-4-(-4)));
            yy = 0 + (((tickAnim - 15) / 18) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 18) * (0-(0)));
        }
        else if (tickAnim >= 33 && tickAnim < 50) {
            xx = -4 + (((tickAnim - 33) / 17) * (0-(-4)));
            yy = 0 + (((tickAnim - 33) / 17) * (0-(0)));
            zz = 0 + (((tickAnim - 33) / 17) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tail2, tail2.rotateAngleX + (float) Math.toRadians(xx), tail2.rotateAngleY + (float) Math.toRadians(yy), tail2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 0) / 8) * (-13.87-(0)));
            yy = 0 + (((tickAnim - 0) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 8) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 15) {
            xx = -13.87 + (((tickAnim - 8) / 7) * (3.25-(-13.87)));
            yy = 0 + (((tickAnim - 8) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 7) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 33) {
            xx = 3.25 + (((tickAnim - 15) / 18) * (3.25-(3.25)));
            yy = 0 + (((tickAnim - 15) / 18) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 18) * (0-(0)));
        }
        else if (tickAnim >= 33 && tickAnim < 39) {
            xx = 3.25 + (((tickAnim - 33) / 6) * (-10-(3.25)));
            yy = 0 + (((tickAnim - 33) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 33) / 6) * (0-(0)));
        }
        else if (tickAnim >= 39 && tickAnim < 43) {
            xx = -10 + (((tickAnim - 39) / 4) * (3-(-10)));
            yy = 0 + (((tickAnim - 39) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 39) / 4) * (0-(0)));
        }
        else if (tickAnim >= 43 && tickAnim < 50) {
            xx = 3 + (((tickAnim - 43) / 7) * (0-(3)));
            yy = 0 + (((tickAnim - 43) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 43) / 7) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tail3, tail3.rotateAngleX + (float) Math.toRadians(xx), tail3.rotateAngleY + (float) Math.toRadians(yy), tail3.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 0) / 8) * (-12.62-(0)));
            yy = 0 + (((tickAnim - 0) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 8) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 15) {
            xx = -12.62 + (((tickAnim - 8) / 7) * (19.75-(-12.62)));
            yy = 0 + (((tickAnim - 8) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 7) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 33) {
            xx = 19.75 + (((tickAnim - 15) / 18) * (19.75-(19.75)));
            yy = 0 + (((tickAnim - 15) / 18) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 18) * (0-(0)));
        }
        else if (tickAnim >= 33 && tickAnim < 43) {
            xx = 19.75 + (((tickAnim - 33) / 10) * (-28-(19.75)));
            yy = 0 + (((tickAnim - 33) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 33) / 10) * (0-(0)));
        }
        else if (tickAnim >= 43 && tickAnim < 50) {
            xx = -28 + (((tickAnim - 43) / 7) * (0-(-28)));
            yy = 0 + (((tickAnim - 43) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 43) / 7) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tail4, tail4.rotateAngleX + (float) Math.toRadians(xx), tail4.rotateAngleY + (float) Math.toRadians(yy), tail4.rotateAngleZ + (float) Math.toRadians(zz));

    }
    public void animNest(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime, double animTick) {
        EntityPrehistoricFloraBerthasaura entity = (EntityPrehistoricFloraBerthasaura) entitylivingbaseIn;
        int animCycle = 50;
        double tickAnim = animTick + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;
         if (tickAnim >= 0 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 0) / 5) * (-7.25-(0)));
            yy = 0 + (((tickAnim - 0) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 5) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 10) {
            xx = -7.25 + (((tickAnim - 5) / 5) * (22.5-(-7.25)));
            yy = 0 + (((tickAnim - 5) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 5) / 5) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 17) {
            xx = 22.5 + (((tickAnim - 10) / 7) * (-7.25-(22.5)));
            yy = 0 + (((tickAnim - 10) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 7) * (0-(0)));
        }
        else if (tickAnim >= 17 && tickAnim < 22) {
            xx = -7.25 + (((tickAnim - 17) / 5) * (22.5-(-7.25)));
            yy = 0 + (((tickAnim - 17) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 17) / 5) * (0-(0)));
        }
        else if (tickAnim >= 22 && tickAnim < 28) {
            xx = 22.5 + (((tickAnim - 22) / 6) * (-7.25-(22.5)));
            yy = 0 + (((tickAnim - 22) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 22) / 6) * (0-(0)));
        }
        else if (tickAnim >= 28 && tickAnim < 33) {
            xx = -7.25 + (((tickAnim - 28) / 5) * (22.5-(-7.25)));
            yy = 0 + (((tickAnim - 28) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 28) / 5) * (0-(0)));
        }
        else if (tickAnim >= 33 && tickAnim < 40) {
            xx = 22.5 + (((tickAnim - 33) / 7) * (-7.25-(22.5)));
            yy = 0 + (((tickAnim - 33) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 33) / 7) * (0-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 50) {
            xx = -7.25 + (((tickAnim - 40) / 10) * (0-(-7.25)));
            yy = 0 + (((tickAnim - 40) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 40) / 10) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftLeg, leftLeg.rotateAngleX + (float) Math.toRadians(xx), leftLeg.rotateAngleY + (float) Math.toRadians(yy), leftLeg.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 0) / 5) * (-17.25-(0)));
            yy = 0 + (((tickAnim - 0) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 5) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 10) {
            xx = -17.25 + (((tickAnim - 5) / 5) * (34.25-(-17.25)));
            yy = 0 + (((tickAnim - 5) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 5) / 5) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 17) {
            xx = 34.25 + (((tickAnim - 10) / 7) * (-17.25-(34.25)));
            yy = 0 + (((tickAnim - 10) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 7) * (0-(0)));
        }
        else if (tickAnim >= 17 && tickAnim < 22) {
            xx = -17.25 + (((tickAnim - 17) / 5) * (34.25-(-17.25)));
            yy = 0 + (((tickAnim - 17) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 17) / 5) * (0-(0)));
        }
        else if (tickAnim >= 22 && tickAnim < 28) {
            xx = 34.25 + (((tickAnim - 22) / 6) * (-17.25-(34.25)));
            yy = 0 + (((tickAnim - 22) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 22) / 6) * (0-(0)));
        }
        else if (tickAnim >= 28 && tickAnim < 33) {
            xx = -17.25 + (((tickAnim - 28) / 5) * (34.25-(-17.25)));
            yy = 0 + (((tickAnim - 28) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 28) / 5) * (0-(0)));
        }
        else if (tickAnim >= 33 && tickAnim < 40) {
            xx = 34.25 + (((tickAnim - 33) / 7) * (-17.25-(34.25)));
            yy = 0 + (((tickAnim - 33) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 33) / 7) * (0-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 50) {
            xx = -17.25 + (((tickAnim - 40) / 10) * (0-(-17.25)));
            yy = 0 + (((tickAnim - 40) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 40) / 10) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftLeg2, leftLeg2.rotateAngleX + (float) Math.toRadians(xx), leftLeg2.rotateAngleY + (float) Math.toRadians(yy), leftLeg2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 0 + (((tickAnim - 0) / 3) * (-25.5-(0)));
            yy = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 3) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 5) {
            xx = -25.5 + (((tickAnim - 3) / 2) * (12-(-25.5)));
            yy = 0 + (((tickAnim - 3) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 3) / 2) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 10) {
            xx = 12 + (((tickAnim - 5) / 5) * (21.25-(12)));
            yy = 0 + (((tickAnim - 5) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 5) / 5) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 13) {
            xx = 21.25 + (((tickAnim - 10) / 3) * (-62.12-(21.25)));
            yy = 0 + (((tickAnim - 10) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 3) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 17) {
            xx = -62.12 + (((tickAnim - 13) / 4) * (12-(-62.12)));
            yy = 0 + (((tickAnim - 13) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 13) / 4) * (0-(0)));
        }
        else if (tickAnim >= 17 && tickAnim < 22) {
            xx = 12 + (((tickAnim - 17) / 5) * (21.25-(12)));
            yy = 0 + (((tickAnim - 17) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 17) / 5) * (0-(0)));
        }
        else if (tickAnim >= 22 && tickAnim < 25) {
            xx = 21.25 + (((tickAnim - 22) / 3) * (-62.12-(21.25)));
            yy = 0 + (((tickAnim - 22) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 22) / 3) * (0-(0)));
        }
        else if (tickAnim >= 25 && tickAnim < 28) {
            xx = -62.12 + (((tickAnim - 25) / 3) * (12-(-62.12)));
            yy = 0 + (((tickAnim - 25) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 25) / 3) * (0-(0)));
        }
        else if (tickAnim >= 28 && tickAnim < 33) {
            xx = 12 + (((tickAnim - 28) / 5) * (21.25-(12)));
            yy = 0 + (((tickAnim - 28) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 28) / 5) * (0-(0)));
        }
        else if (tickAnim >= 33 && tickAnim < 37) {
            xx = 21.25 + (((tickAnim - 33) / 4) * (-62.12-(21.25)));
            yy = 0 + (((tickAnim - 33) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 33) / 4) * (0-(0)));
        }
        else if (tickAnim >= 37 && tickAnim < 40) {
            xx = -62.12 + (((tickAnim - 37) / 3) * (12-(-62.12)));
            yy = 0 + (((tickAnim - 37) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 37) / 3) * (0-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 50) {
            xx = 12 + (((tickAnim - 40) / 10) * (0-(12)));
            yy = 0 + (((tickAnim - 40) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 40) / 10) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftLeg3, leftLeg3.rotateAngleX + (float) Math.toRadians(xx), leftLeg3.rotateAngleY + (float) Math.toRadians(yy), leftLeg3.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 0 + (((tickAnim - 0) / 3) * (61.38-(0)));
            yy = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 3) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 5) {
            xx = 61.38 + (((tickAnim - 3) / 2) * (10.25-(61.38)));
            yy = 0 + (((tickAnim - 3) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 3) / 2) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 10) {
            xx = 10.25 + (((tickAnim - 5) / 5) * (71.5-(10.25)));
            yy = 0 + (((tickAnim - 5) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 5) / 5) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 13) {
            xx = 71.5 + (((tickAnim - 10) / 3) * (83.13-(71.5)));
            yy = 0 + (((tickAnim - 10) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 3) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 17) {
            xx = 83.13 + (((tickAnim - 13) / 4) * (10.25-(83.13)));
            yy = 0 + (((tickAnim - 13) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 13) / 4) * (0-(0)));
        }
        else if (tickAnim >= 17 && tickAnim < 22) {
            xx = 10.25 + (((tickAnim - 17) / 5) * (71.5-(10.25)));
            yy = 0 + (((tickAnim - 17) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 17) / 5) * (0-(0)));
        }
        else if (tickAnim >= 22 && tickAnim < 25) {
            xx = 71.5 + (((tickAnim - 22) / 3) * (83.13-(71.5)));
            yy = 0 + (((tickAnim - 22) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 22) / 3) * (0-(0)));
        }
        else if (tickAnim >= 25 && tickAnim < 28) {
            xx = 83.13 + (((tickAnim - 25) / 3) * (10.25-(83.13)));
            yy = 0 + (((tickAnim - 25) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 25) / 3) * (0-(0)));
        }
        else if (tickAnim >= 28 && tickAnim < 33) {
            xx = 10.25 + (((tickAnim - 28) / 5) * (71.5-(10.25)));
            yy = 0 + (((tickAnim - 28) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 28) / 5) * (0-(0)));
        }
        else if (tickAnim >= 33 && tickAnim < 37) {
            xx = 71.5 + (((tickAnim - 33) / 4) * (83.13-(71.5)));
            yy = 0 + (((tickAnim - 33) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 33) / 4) * (0-(0)));
        }
        else if (tickAnim >= 37 && tickAnim < 40) {
            xx = 83.13 + (((tickAnim - 37) / 3) * (10.25-(83.13)));
            yy = 0 + (((tickAnim - 37) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 37) / 3) * (0-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 50) {
            xx = 10.25 + (((tickAnim - 40) / 10) * (0-(10.25)));
            yy = 0 + (((tickAnim - 40) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 40) / 10) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftLeg4, leftLeg4.rotateAngleX + (float) Math.toRadians(xx), leftLeg4.rotateAngleY + (float) Math.toRadians(yy), leftLeg4.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 0) / 10) * (2.02874-(0)));
            yy = -11 + (((tickAnim - 0) / 10) * (-10.81357-(-11)));
            zz = 7 + (((tickAnim - 0) / 10) * (-3.69203-(7)));
        }
        else if (tickAnim >= 10 && tickAnim < 17) {
            xx = 2.02874 + (((tickAnim - 10) / 7) * (0-(2.02874)));
            yy = -10.81357 + (((tickAnim - 10) / 7) * (-11-(-10.81357)));
            zz = -3.69203 + (((tickAnim - 10) / 7) * (7-(-3.69203)));
        }
        else if (tickAnim >= 17 && tickAnim < 27) {
            xx = 0 + (((tickAnim - 17) / 10) * (2.02874-(0)));
            yy = -11 + (((tickAnim - 17) / 10) * (-10.81357-(-11)));
            zz = 7 + (((tickAnim - 17) / 10) * (-3.69203-(7)));
        }
        else if (tickAnim >= 27 && tickAnim < 29) {
            xx = 2.02874 + (((tickAnim - 27) / 2) * (0-(2.02874)));
            yy = -10.81357 + (((tickAnim - 27) / 2) * (-11-(-10.81357)));
            zz = -3.69203 + (((tickAnim - 27) / 2) * (7-(-3.69203)));
        }
        else if (tickAnim >= 29 && tickAnim < 39) {
            xx = 0 + (((tickAnim - 29) / 10) * (2.02874-(0)));
            yy = -11 + (((tickAnim - 29) / 10) * (-10.81357-(-11)));
            zz = 7 + (((tickAnim - 29) / 10) * (-3.69203-(7)));
        }
        else if (tickAnim >= 39 && tickAnim < 50) {
            xx = 2.02874 + (((tickAnim - 39) / 11) * (0-(2.02874)));
            yy = -10.81357 + (((tickAnim - 39) / 11) * (-11-(-10.81357)));
            zz = -3.69203 + (((tickAnim - 39) / 11) * (7-(-3.69203)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(body, body.rotateAngleX + (float) Math.toRadians(xx), body.rotateAngleY + (float) Math.toRadians(yy), body.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 10) {
            xx = -0.18123 + (((tickAnim - 0) / 10) * (0.6879-(-0.18123)));
            yy = -8.24802 + (((tickAnim - 0) / 10) * (-8.22147-(-8.24802)));
            zz = 1.26307 + (((tickAnim - 0) / 10) * (-4.79944-(1.26307)));
        }
        else if (tickAnim >= 10 && tickAnim < 17) {
            xx = 0.6879 + (((tickAnim - 10) / 7) * (-0.18123-(0.6879)));
            yy = -8.22147 + (((tickAnim - 10) / 7) * (-8.24802-(-8.22147)));
            zz = -4.79944 + (((tickAnim - 10) / 7) * (1.26307-(-4.79944)));
        }
        else if (tickAnim >= 17 && tickAnim < 27) {
            xx = -0.18123 + (((tickAnim - 17) / 10) * (0.6879-(-0.18123)));
            yy = -8.24802 + (((tickAnim - 17) / 10) * (-8.22147-(-8.24802)));
            zz = 1.26307 + (((tickAnim - 17) / 10) * (-4.79944-(1.26307)));
        }
        else if (tickAnim >= 27 && tickAnim < 29) {
            xx = 0.6879 + (((tickAnim - 27) / 2) * (-0.18123-(0.6879)));
            yy = -8.22147 + (((tickAnim - 27) / 2) * (-8.24802-(-8.22147)));
            zz = -4.79944 + (((tickAnim - 27) / 2) * (1.26307-(-4.79944)));
        }
        else if (tickAnim >= 29 && tickAnim < 39) {
            xx = -0.18123 + (((tickAnim - 29) / 10) * (0.6879-(-0.18123)));
            yy = -8.24802 + (((tickAnim - 29) / 10) * (-8.22147-(-8.24802)));
            zz = 1.26307 + (((tickAnim - 29) / 10) * (-4.79944-(1.26307)));
        }
        else if (tickAnim >= 39 && tickAnim < 50) {
            xx = 0.6879 + (((tickAnim - 39) / 11) * (-0.18123-(0.6879)));
            yy = -8.22147 + (((tickAnim - 39) / 11) * (-8.24802-(-8.22147)));
            zz = -4.79944 + (((tickAnim - 39) / 11) * (1.26307-(-4.79944)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(chest, chest.rotateAngleX + (float) Math.toRadians(xx), chest.rotateAngleY + (float) Math.toRadians(yy), chest.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 19.71775 + (((tickAnim - 0) / 10) * (21.31099-(19.71775)));
            yy = -12.2615 + (((tickAnim - 0) / 10) * (-9.10151-(-12.2615)));
            zz = -4.35268 + (((tickAnim - 0) / 10) * (-12.92976-(-4.35268)));
        }
        else if (tickAnim >= 10 && tickAnim < 17) {
            xx = 21.31099 + (((tickAnim - 10) / 7) * (19.71775-(21.31099)));
            yy = -9.10151 + (((tickAnim - 10) / 7) * (-12.2615-(-9.10151)));
            zz = -12.92976 + (((tickAnim - 10) / 7) * (-4.35268-(-12.92976)));
        }
        else if (tickAnim >= 17 && tickAnim < 27) {
            xx = 19.71775 + (((tickAnim - 17) / 10) * (21.31099-(19.71775)));
            yy = -12.2615 + (((tickAnim - 17) / 10) * (-9.10151-(-12.2615)));
            zz = -4.35268 + (((tickAnim - 17) / 10) * (-12.92976-(-4.35268)));
        }
        else if (tickAnim >= 27 && tickAnim < 29) {
            xx = 21.31099 + (((tickAnim - 27) / 2) * (19.71775-(21.31099)));
            yy = -9.10151 + (((tickAnim - 27) / 2) * (-12.2615-(-9.10151)));
            zz = -12.92976 + (((tickAnim - 27) / 2) * (-4.35268-(-12.92976)));
        }
        else if (tickAnim >= 29 && tickAnim < 39) {
            xx = 19.71775 + (((tickAnim - 29) / 10) * (21.31099-(19.71775)));
            yy = -12.2615 + (((tickAnim - 29) / 10) * (-9.10151-(-12.2615)));
            zz = -4.35268 + (((tickAnim - 29) / 10) * (-12.92976-(-4.35268)));
        }
        else if (tickAnim >= 39 && tickAnim < 50) {
            xx = 21.31099 + (((tickAnim - 39) / 11) * (19.71775-(21.31099)));
            yy = -9.10151 + (((tickAnim - 39) / 11) * (-12.2615-(-9.10151)));
            zz = -12.92976 + (((tickAnim - 39) / 11) * (-4.35268-(-12.92976)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck3, neck3.rotateAngleX + (float) Math.toRadians(xx), neck3.rotateAngleY + (float) Math.toRadians(yy), neck3.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 11.90875 + (((tickAnim - 0) / 10) * (10.07902-(11.90875)));
            yy = -9.29915 + (((tickAnim - 0) / 10) * (-11.25915-(-9.29915)));
            zz = -1.95177 + (((tickAnim - 0) / 10) * (8.27418-(-1.95177)));
        }
        else if (tickAnim >= 10 && tickAnim < 17) {
            xx = 10.07902 + (((tickAnim - 10) / 7) * (11.90875-(10.07902)));
            yy = -11.25915 + (((tickAnim - 10) / 7) * (-9.29915-(-11.25915)));
            zz = 8.27418 + (((tickAnim - 10) / 7) * (-1.95177-(8.27418)));
        }
        else if (tickAnim >= 17 && tickAnim < 27) {
            xx = 11.90875 + (((tickAnim - 17) / 10) * (10.07902-(11.90875)));
            yy = -9.29915 + (((tickAnim - 17) / 10) * (-11.25915-(-9.29915)));
            zz = -1.95177 + (((tickAnim - 17) / 10) * (8.27418-(-1.95177)));
        }
        else if (tickAnim >= 27 && tickAnim < 29) {
            xx = 10.07902 + (((tickAnim - 27) / 2) * (11.90875-(10.07902)));
            yy = -11.25915 + (((tickAnim - 27) / 2) * (-9.29915-(-11.25915)));
            zz = 8.27418 + (((tickAnim - 27) / 2) * (-1.95177-(8.27418)));
        }
        else if (tickAnim >= 29 && tickAnim < 39) {
            xx = 11.90875 + (((tickAnim - 29) / 10) * (10.07902-(11.90875)));
            yy = -9.29915 + (((tickAnim - 29) / 10) * (-11.25915-(-9.29915)));
            zz = -1.95177 + (((tickAnim - 29) / 10) * (8.27418-(-1.95177)));
        }
        else if (tickAnim >= 39 && tickAnim < 50) {
            xx = 10.07902 + (((tickAnim - 39) / 11) * (11.90875-(10.07902)));
            yy = -11.25915 + (((tickAnim - 39) / 11) * (-9.29915-(-11.25915)));
            zz = 8.27418 + (((tickAnim - 39) / 11) * (-1.95177-(8.27418)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck2, neck2.rotateAngleX + (float) Math.toRadians(xx), neck2.rotateAngleY + (float) Math.toRadians(yy), neck2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 17) {
            xx = -3.65493 + (((tickAnim - 0) / 17) * (-3.65493-(-3.65493)));
            yy = -17.28478 + (((tickAnim - 0) / 17) * (-17.28478-(-17.28478)));
            zz = 12.89897 + (((tickAnim - 0) / 17) * (12.89897-(12.89897)));
        }
        else if (tickAnim >= 17 && tickAnim < 29) {
            xx = -3.65493 + (((tickAnim - 17) / 12) * (-3.65493-(-3.65493)));
            yy = -17.28478 + (((tickAnim - 17) / 12) * (-17.28478-(-17.28478)));
            zz = 12.89897 + (((tickAnim - 17) / 12) * (12.89897-(12.89897)));
        }
        else if (tickAnim >= 29 && tickAnim < 50) {
            xx = -3.65493 + (((tickAnim - 29) / 21) * (-3.65493-(-3.65493)));
            yy = -17.28478 + (((tickAnim - 29) / 21) * (-17.28478-(-17.28478)));
            zz = 12.89897 + (((tickAnim - 29) / 21) * (12.89897-(12.89897)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck, neck.rotateAngleX + (float) Math.toRadians(xx), neck.rotateAngleY + (float) Math.toRadians(yy), neck.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 0) / 10) * (17.75-(0)));
            yy = -11.75 + (((tickAnim - 0) / 10) * (-11.75-(-11.75)));
            zz = 0 + (((tickAnim - 0) / 10) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 17) {
            xx = 17.75 + (((tickAnim - 10) / 7) * (0-(17.75)));
            yy = -11.75 + (((tickAnim - 10) / 7) * (-11.75-(-11.75)));
            zz = 0 + (((tickAnim - 10) / 7) * (0-(0)));
        }
        else if (tickAnim >= 17 && tickAnim < 27) {
            xx = 0 + (((tickAnim - 17) / 10) * (17.75-(0)));
            yy = -11.75 + (((tickAnim - 17) / 10) * (-11.75-(-11.75)));
            zz = 0 + (((tickAnim - 17) / 10) * (0-(0)));
        }
        else if (tickAnim >= 27 && tickAnim < 29) {
            xx = 17.75 + (((tickAnim - 27) / 2) * (0-(17.75)));
            yy = -11.75 + (((tickAnim - 27) / 2) * (-11.75-(-11.75)));
            zz = 0 + (((tickAnim - 27) / 2) * (0-(0)));
        }
        else if (tickAnim >= 29 && tickAnim < 39) {
            xx = 0 + (((tickAnim - 29) / 10) * (17.75-(0)));
            yy = -11.75 + (((tickAnim - 29) / 10) * (-11.75-(-11.75)));
            zz = 0 + (((tickAnim - 29) / 10) * (0-(0)));
        }
        else if (tickAnim >= 39 && tickAnim < 50) {
            xx = 17.75 + (((tickAnim - 39) / 11) * (0-(17.75)));
            yy = -11.75 + (((tickAnim - 39) / 11) * (-11.75-(-11.75)));
            zz = 0 + (((tickAnim - 39) / 11) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(head, head.rotateAngleX + (float) Math.toRadians(xx), head.rotateAngleY + (float) Math.toRadians(yy), head.rotateAngleZ + (float) Math.toRadians(zz));

    }
    public void animNoise(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime, double animTick) {
        EntityPrehistoricFloraBerthasaura entity = (EntityPrehistoricFloraBerthasaura) entitylivingbaseIn;
        int animCycle = 10;
        double tickAnim = animTick + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;
         if (tickAnim >= 0 && tickAnim < 4) {
            xx = 0 + (((tickAnim - 0) / 4) * (-6.75-(0)));
            yy = 0 + (((tickAnim - 0) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 4) * (0-(0)));
        }
        else if (tickAnim >= 4 && tickAnim < 8) {
            xx = -6.75 + (((tickAnim - 4) / 4) * (0-(-6.75)));
            yy = 0 + (((tickAnim - 4) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 4) / 4) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(body, body.rotateAngleX + (float) Math.toRadians(xx), body.rotateAngleY + (float) Math.toRadians(yy), body.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 4) {
            xx = 0 + (((tickAnim - 0) / 4) * (-3.5-(0)));
            yy = 0 + (((tickAnim - 0) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 4) * (0-(0)));
        }
        else if (tickAnim >= 4 && tickAnim < 8) {
            xx = -3.5 + (((tickAnim - 4) / 4) * (0-(-3.5)));
            yy = 0 + (((tickAnim - 4) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 4) / 4) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(chest, chest.rotateAngleX + (float) Math.toRadians(xx), chest.rotateAngleY + (float) Math.toRadians(yy), chest.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 4) {
            xx = 0 + (((tickAnim - 0) / 4) * (-8.5-(0)));
            yy = 0 + (((tickAnim - 0) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 4) * (0-(0)));
        }
        else if (tickAnim >= 4 && tickAnim < 8) {
            xx = -8.5 + (((tickAnim - 4) / 4) * (0-(-8.5)));
            yy = 0 + (((tickAnim - 4) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 4) / 4) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 11) {
            xx = 0 + (((tickAnim - 8) / 3) * (0-(0)));
            yy = 0 + (((tickAnim - 8) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 3) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck3, neck3.rotateAngleX + (float) Math.toRadians(xx), neck3.rotateAngleY + (float) Math.toRadians(yy), neck3.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 4) {
            xx = 0 + (((tickAnim - 0) / 4) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 4) * (0.475-(0)));
        }
        else if (tickAnim >= 4 && tickAnim < 11) {
            xx = 0 + (((tickAnim - 4) / 7) * (0-(0)));
            yy = 0 + (((tickAnim - 4) / 7) * (0-(0)));
            zz = 0.475 + (((tickAnim - 4) / 7) * (0-(0.475)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.neck3.rotationPointX = this.neck3.rotationPointX + (float)(xx);
        this.neck3.rotationPointY = this.neck3.rotationPointY - (float)(yy);
        this.neck3.rotationPointZ = this.neck3.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 4) {
            xx = 0 + (((tickAnim - 0) / 4) * (-3.5-(0)));
            yy = 0 + (((tickAnim - 0) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 4) * (0-(0)));
        }
        else if (tickAnim >= 4 && tickAnim < 8) {
            xx = -3.5 + (((tickAnim - 4) / 4) * (0-(-3.5)));
            yy = 0 + (((tickAnim - 4) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 4) / 4) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 11) {
            xx = 0 + (((tickAnim - 8) / 3) * (0-(0)));
            yy = 0 + (((tickAnim - 8) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 3) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck2, neck2.rotateAngleX + (float) Math.toRadians(xx), neck2.rotateAngleY + (float) Math.toRadians(yy), neck2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 4) {
            xx = 0 + (((tickAnim - 0) / 4) * (21-(0)));
            yy = 0 + (((tickAnim - 0) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 4) * (0-(0)));
        }
        else if (tickAnim >= 4 && tickAnim < 8) {
            xx = 21 + (((tickAnim - 4) / 4) * (0-(21)));
            yy = 0 + (((tickAnim - 4) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 4) / 4) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 11) {
            xx = 0 + (((tickAnim - 8) / 3) * (0-(0)));
            yy = 0 + (((tickAnim - 8) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 3) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck, neck.rotateAngleX + (float) Math.toRadians(xx), neck.rotateAngleY + (float) Math.toRadians(yy), neck.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 4) {
            xx = 0 + (((tickAnim - 0) / 4) * (-9.25-(0)));
            yy = 0 + (((tickAnim - 0) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 4) * (0-(0)));
        }
        else if (tickAnim >= 4 && tickAnim < 8) {
            xx = -9.25 + (((tickAnim - 4) / 4) * (-9.05-(-9.25)));
            yy = 0 + (((tickAnim - 4) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 4) / 4) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 11) {
            xx = -9.05 + (((tickAnim - 8) / 3) * (0-(-9.05)));
            yy = 0 + (((tickAnim - 8) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 3) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(head, head.rotateAngleX + (float) Math.toRadians(xx), head.rotateAngleY + (float) Math.toRadians(yy), head.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 4) {
            xx = 0 + (((tickAnim - 0) / 4) * (21-(0)));
            yy = 0 + (((tickAnim - 0) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 4) * (0-(0)));
        }
        else if (tickAnim >= 4 && tickAnim < 8) {
            xx = 21 + (((tickAnim - 4) / 4) * (0-(21)));
            yy = 0 + (((tickAnim - 4) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 4) / 4) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(jaw, jaw.rotateAngleX + (float) Math.toRadians(xx), jaw.rotateAngleY + (float) Math.toRadians(yy), jaw.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 0 + (((tickAnim - 0) / 3) * (-1.25-(0)));
            yy = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 3) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 5) {
            xx = -1.25 + (((tickAnim - 3) / 2) * (-3-(-1.25)));
            yy = 0 + (((tickAnim - 3) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 3) / 2) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 8) {
            xx = -3 + (((tickAnim - 5) / 3) * (0-(-3)));
            yy = 0 + (((tickAnim - 5) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 5) / 3) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 11) {
            xx = 0 + (((tickAnim - 8) / 3) * (0-(0)));
            yy = 0 + (((tickAnim - 8) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 3) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tail, tail.rotateAngleX + (float) Math.toRadians(xx), tail.rotateAngleY + (float) Math.toRadians(yy), tail.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 0 + (((tickAnim - 0) / 3) * (-2.25-(0)));
            yy = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 3) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 5) {
            xx = -2.25 + (((tickAnim - 3) / 2) * (-6.25-(-2.25)));
            yy = 0 + (((tickAnim - 3) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 3) / 2) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 8) {
            xx = -6.25 + (((tickAnim - 5) / 3) * (0-(-6.25)));
            yy = 0 + (((tickAnim - 5) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 5) / 3) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 11) {
            xx = 0 + (((tickAnim - 8) / 3) * (0-(0)));
            yy = 0 + (((tickAnim - 8) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 3) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tail2, tail2.rotateAngleX + (float) Math.toRadians(xx), tail2.rotateAngleY + (float) Math.toRadians(yy), tail2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 0 + (((tickAnim - 0) / 3) * (-4-(0)));
            yy = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 3) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 5) {
            xx = -4 + (((tickAnim - 3) / 2) * (-9-(-4)));
            yy = 0 + (((tickAnim - 3) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 3) / 2) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 8) {
            xx = -9 + (((tickAnim - 5) / 3) * (17.25-(-9)));
            yy = 0 + (((tickAnim - 5) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 5) / 3) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 11) {
            xx = 17.25 + (((tickAnim - 8) / 3) * (0-(17.25)));
            yy = 0 + (((tickAnim - 8) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 3) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tail3, tail3.rotateAngleX + (float) Math.toRadians(xx), tail3.rotateAngleY + (float) Math.toRadians(yy), tail3.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 1) {
            xx = 0 + (((tickAnim - 0) / 1) * (3.67-(0)));
            yy = 0 + (((tickAnim - 0) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 1) * (0-(0)));
        }
        else if (tickAnim >= 1 && tickAnim < 3) {
            xx = 3.67 + (((tickAnim - 1) / 2) * (0.5-(3.67)));
            yy = 0 + (((tickAnim - 1) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 1) / 2) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 5) {
            xx = 0.5 + (((tickAnim - 3) / 2) * (-31.5-(0.5)));
            yy = 0 + (((tickAnim - 3) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 3) / 2) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 6) {
            xx = -31.5 + (((tickAnim - 5) / 1) * (-24.58-(-31.5)));
            yy = 0 + (((tickAnim - 5) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 5) / 1) * (0-(0)));
        }
        else if (tickAnim >= 6 && tickAnim < 7) {
            xx = -24.58 + (((tickAnim - 6) / 1) * (-19.42-(-24.58)));
            yy = 0 + (((tickAnim - 6) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 6) / 1) * (0-(0)));
        }
        else if (tickAnim >= 7 && tickAnim < 8) {
            xx = -19.42 + (((tickAnim - 7) / 1) * (11.75-(-19.42)));
            yy = 0 + (((tickAnim - 7) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 7) / 1) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 11) {
            xx = 11.75 + (((tickAnim - 8) / 3) * (0-(11.75)));
            yy = 0 + (((tickAnim - 8) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 3) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tail4, tail4.rotateAngleX + (float) Math.toRadians(xx), tail4.rotateAngleY + (float) Math.toRadians(yy), tail4.rotateAngleZ + (float) Math.toRadians(zz));

    }
    public void animEat(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime, double animTick) {
        EntityPrehistoricFloraBerthasaura entity = (EntityPrehistoricFloraBerthasaura) entitylivingbaseIn;
        int animCycle = 20;
        double tickAnim = animTick + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;
         if (tickAnim >= 0 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 0) / 5) * (13.75-(0)));
            yy = 0 + (((tickAnim - 0) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 5) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 14) {
            xx = 13.75 + (((tickAnim - 5) / 9) * (13.75-(13.75)));
            yy = 0 + (((tickAnim - 5) / 9) * (0-(0)));
            zz = 0 + (((tickAnim - 5) / 9) * (0-(0)));
        }
        else if (tickAnim >= 14 && tickAnim < 20) {
            xx = 13.75 + (((tickAnim - 14) / 6) * (0-(13.75)));
            yy = 0 + (((tickAnim - 14) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 14) / 6) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(body, body.rotateAngleX + (float) Math.toRadians(xx), body.rotateAngleY + (float) Math.toRadians(yy), body.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 0) / 5) * (19.75-(0)));
            yy = 0 + (((tickAnim - 0) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 5) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 14) {
            xx = 19.75 + (((tickAnim - 5) / 9) * (19.75-(19.75)));
            yy = 0 + (((tickAnim - 5) / 9) * (0-(0)));
            zz = 0 + (((tickAnim - 5) / 9) * (0-(0)));
        }
        else if (tickAnim >= 14 && tickAnim < 20) {
            xx = 19.75 + (((tickAnim - 14) / 6) * (0-(19.75)));
            yy = 0 + (((tickAnim - 14) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 14) / 6) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(chest, chest.rotateAngleX + (float) Math.toRadians(xx), chest.rotateAngleY + (float) Math.toRadians(yy), chest.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 0) / 5) * (23.75-(0)));
            yy = 0 + (((tickAnim - 0) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 5) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 9) {
            xx = 23.75 + (((tickAnim - 5) / 4) * (37-(23.75)));
            yy = 0 + (((tickAnim - 5) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 5) / 4) * (0-(0)));
        }
        else if (tickAnim >= 9 && tickAnim < 14) {
            xx = 37 + (((tickAnim - 9) / 5) * (23.75-(37)));
            yy = 0 + (((tickAnim - 9) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 9) / 5) * (0-(0)));
        }
        else if (tickAnim >= 14 && tickAnim < 20) {
            xx = 23.75 + (((tickAnim - 14) / 6) * (0-(23.75)));
            yy = 0 + (((tickAnim - 14) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 14) / 6) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck3, neck3.rotateAngleX + (float) Math.toRadians(xx), neck3.rotateAngleY + (float) Math.toRadians(yy), neck3.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 0) / 5) * (-19.5-(0)));
            yy = 0 + (((tickAnim - 0) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 5) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 9) {
            xx = -19.5 + (((tickAnim - 5) / 4) * (23.5-(-19.5)));
            yy = 0 + (((tickAnim - 5) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 5) / 4) * (0-(0)));
        }
        else if (tickAnim >= 9 && tickAnim < 14) {
            xx = 23.5 + (((tickAnim - 9) / 5) * (-19.5-(23.5)));
            yy = 0 + (((tickAnim - 9) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 9) / 5) * (0-(0)));
        }
        else if (tickAnim >= 14 && tickAnim < 20) {
            xx = -19.5 + (((tickAnim - 14) / 6) * (0-(-19.5)));
            yy = 0 + (((tickAnim - 14) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 14) / 6) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck2, neck2.rotateAngleX + (float) Math.toRadians(xx), neck2.rotateAngleY + (float) Math.toRadians(yy), neck2.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 0) / 5) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 5) * (-0.425-(0)));
            zz = 0 + (((tickAnim - 0) / 5) * (0.8-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 9) {
            xx = 0 + (((tickAnim - 5) / 4) * (0-(0)));
            yy = -0.425 + (((tickAnim - 5) / 4) * (0.15-(-0.425)));
            zz = 0.8 + (((tickAnim - 5) / 4) * (-1.075-(0.8)));
        }
        else if (tickAnim >= 9 && tickAnim < 14) {
            xx = 0 + (((tickAnim - 9) / 5) * (0-(0)));
            yy = 0.15 + (((tickAnim - 9) / 5) * (-0.425-(0.15)));
            zz = -1.075 + (((tickAnim - 9) / 5) * (0.8-(-1.075)));
        }
        else if (tickAnim >= 14 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 14) / 6) * (0-(0)));
            yy = -0.425 + (((tickAnim - 14) / 6) * (0-(-0.425)));
            zz = 0.8 + (((tickAnim - 14) / 6) * (0-(0.8)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.neck2.rotationPointX = this.neck2.rotationPointX + (float)(xx);
        this.neck2.rotationPointY = this.neck2.rotationPointY - (float)(yy);
        this.neck2.rotationPointZ = this.neck2.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 0) / 5) * (21.5-(0)));
            yy = 0 + (((tickAnim - 0) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 5) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 9) {
            xx = 21.5 + (((tickAnim - 5) / 4) * (-7.25-(21.5)));
            yy = 0 + (((tickAnim - 5) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 5) / 4) * (0-(0)));
        }
        else if (tickAnim >= 9 && tickAnim < 14) {
            xx = -7.25 + (((tickAnim - 9) / 5) * (21.5-(-7.25)));
            yy = 0 + (((tickAnim - 9) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 9) / 5) * (0-(0)));
        }
        else if (tickAnim >= 14 && tickAnim < 20) {
            xx = 21.5 + (((tickAnim - 14) / 6) * (0-(21.5)));
            yy = 0 + (((tickAnim - 14) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 14) / 6) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck, neck.rotateAngleX + (float) Math.toRadians(xx), neck.rotateAngleY + (float) Math.toRadians(yy), neck.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 0) / 5) * (13.25-(0)));
            yy = 0 + (((tickAnim - 0) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 5) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 9) {
            xx = 13.25 + (((tickAnim - 5) / 4) * (4-(13.25)));
            yy = 0 + (((tickAnim - 5) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 5) / 4) * (0-(0)));
        }
        else if (tickAnim >= 9 && tickAnim < 14) {
            xx = 4 + (((tickAnim - 9) / 5) * (13.25-(4)));
            yy = 0 + (((tickAnim - 9) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 9) / 5) * (0-(0)));
        }
        else if (tickAnim >= 14 && tickAnim < 20) {
            xx = 13.25 + (((tickAnim - 14) / 6) * (0-(13.25)));
            yy = 0 + (((tickAnim - 14) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 14) / 6) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(head, head.rotateAngleX + (float) Math.toRadians(xx), head.rotateAngleY + (float) Math.toRadians(yy), head.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 0) / 5) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 5) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 9) {
            xx = 0 + (((tickAnim - 5) / 4) * (27-(0)));
            yy = 0 + (((tickAnim - 5) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 5) / 4) * (0-(0)));
        }
        else if (tickAnim >= 9 && tickAnim < 11) {
            xx = 27 + (((tickAnim - 9) / 2) * (0-(27)));
            yy = 0 + (((tickAnim - 9) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 9) / 2) * (0-(0)));
        }
        else if (tickAnim >= 11 && tickAnim < 14) {
            xx = 0 + (((tickAnim - 11) / 3) * (0-(0)));
            yy = 0 + (((tickAnim - 11) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 11) / 3) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(jaw, jaw.rotateAngleX + (float) Math.toRadians(xx), jaw.rotateAngleY + (float) Math.toRadians(yy), jaw.rotateAngleZ + (float) Math.toRadians(zz));

    }
    public void animGraze(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime, double animTick) {
        EntityPrehistoricFloraBerthasaura entity = (EntityPrehistoricFloraBerthasaura) entitylivingbaseIn;
        int animCycle = 150;
        double tickAnim = animTick + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;
         if (tickAnim >= 0 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 0) / 20) * (3-(0)));
            yy = 0 + (((tickAnim - 0) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 20) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 132) {
            xx = 3 + (((tickAnim - 20) / 112) * (3-(3)));
            yy = 0 + (((tickAnim - 20) / 112) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 112) * (0-(0)));
        }
        else if (tickAnim >= 132 && tickAnim < 150) {
            xx = 3 + (((tickAnim - 132) / 18) * (0-(3)));
            yy = 0 + (((tickAnim - 132) / 18) * (0-(0)));
            zz = 0 + (((tickAnim - 132) / 18) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(hips, hips.rotateAngleX + (float) Math.toRadians(xx), hips.rotateAngleY + (float) Math.toRadians(yy), hips.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 0) / 20) * (-3.25-(0)));
            yy = 0 + (((tickAnim - 0) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 20) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 25) {
            xx = -3.25 + (((tickAnim - 20) / 5) * (-3.25-(-3.25)));
            yy = 0 + (((tickAnim - 20) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 5) * (0-(0)));
        }
        else if (tickAnim >= 25 && tickAnim < 132) {
            xx = -3.25 + (((tickAnim - 25) / 107) * (-3.25-(-3.25)));
            yy = 0 + (((tickAnim - 25) / 107) * (0-(0)));
            zz = 0 + (((tickAnim - 25) / 107) * (0-(0)));
        }
        else if (tickAnim >= 132 && tickAnim < 150) {
            xx = -3.25 + (((tickAnim - 132) / 18) * (0-(-3.25)));
            yy = 0 + (((tickAnim - 132) / 18) * (0-(0)));
            zz = 0 + (((tickAnim - 132) / 18) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftLeg, leftLeg.rotateAngleX + (float) Math.toRadians(xx), leftLeg.rotateAngleY + (float) Math.toRadians(yy), leftLeg.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 0) / 20) * (-13-(0)));
            yy = 0 + (((tickAnim - 0) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 20) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 25) {
            xx = -13 + (((tickAnim - 20) / 5) * (-21-(-13)));
            yy = 0 + (((tickAnim - 20) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 5) * (0-(0)));
        }
        else if (tickAnim >= 25 && tickAnim < 132) {
            xx = -21 + (((tickAnim - 25) / 107) * (-21-(-21)));
            yy = 0 + (((tickAnim - 25) / 107) * (0-(0)));
            zz = 0 + (((tickAnim - 25) / 107) * (0-(0)));
        }
        else if (tickAnim >= 132 && tickAnim < 150) {
            xx = -21 + (((tickAnim - 132) / 18) * (0-(-21)));
            yy = 0 + (((tickAnim - 132) / 18) * (0-(0)));
            zz = 0 + (((tickAnim - 132) / 18) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftLeg2, leftLeg2.rotateAngleX + (float) Math.toRadians(xx), leftLeg2.rotateAngleY + (float) Math.toRadians(yy), leftLeg2.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 25) {
            xx = 0 + (((tickAnim - 0) / 25) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 25) * (0.15-(0)));
            zz = 0 + (((tickAnim - 0) / 25) * (0-(0)));
        }
        else if (tickAnim >= 25 && tickAnim < 132) {
            xx = 0 + (((tickAnim - 25) / 107) * (0-(0)));
            yy = 0.15 + (((tickAnim - 25) / 107) * (0.15-(0.15)));
            zz = 0 + (((tickAnim - 25) / 107) * (0-(0)));
        }
        else if (tickAnim >= 132 && tickAnim < 150) {
            xx = 0 + (((tickAnim - 132) / 18) * (0-(0)));
            yy = 0.15 + (((tickAnim - 132) / 18) * (0-(0.15)));
            zz = 0 + (((tickAnim - 132) / 18) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.leftLeg2.rotationPointX = this.leftLeg2.rotationPointX + (float)(xx);
        this.leftLeg2.rotationPointY = this.leftLeg2.rotationPointY - (float)(yy);
        this.leftLeg2.rotationPointZ = this.leftLeg2.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 0) / 20) * (-25.25-(0)));
            yy = 0 + (((tickAnim - 0) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 20) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 25) {
            xx = -25.25 + (((tickAnim - 20) / 5) * (-2.25-(-25.25)));
            yy = 0 + (((tickAnim - 20) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 5) * (0-(0)));
        }
        else if (tickAnim >= 25 && tickAnim < 132) {
            xx = -2.25 + (((tickAnim - 25) / 107) * (-2.25-(-2.25)));
            yy = 0 + (((tickAnim - 25) / 107) * (0-(0)));
            zz = 0 + (((tickAnim - 25) / 107) * (0-(0)));
        }
        else if (tickAnim >= 132 && tickAnim < 141) {
            xx = -2.25 + (((tickAnim - 132) / 9) * (-45.12-(-2.25)));
            yy = 0 + (((tickAnim - 132) / 9) * (0-(0)));
            zz = 0 + (((tickAnim - 132) / 9) * (0-(0)));
        }
        else if (tickAnim >= 141 && tickAnim < 144) {
            xx = -45.12 + (((tickAnim - 141) / 3) * (-45.12-(-45.12)));
            yy = 0 + (((tickAnim - 141) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 141) / 3) * (0-(0)));
        }
        else if (tickAnim >= 144 && tickAnim < 150) {
            xx = -45.12 + (((tickAnim - 144) / 6) * (0-(-45.12)));
            yy = 0 + (((tickAnim - 144) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 144) / 6) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftLeg3, leftLeg3.rotateAngleX + (float) Math.toRadians(xx), leftLeg3.rotateAngleY + (float) Math.toRadians(yy), leftLeg3.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 0) / 20) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 20) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 150) {
            xx = 0 + (((tickAnim - 20) / 130) * (0-(0)));
            yy = 0 + (((tickAnim - 20) / 130) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 130) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.leftLeg3.rotationPointX = this.leftLeg3.rotationPointX + (float)(xx);
        this.leftLeg3.rotationPointY = this.leftLeg3.rotationPointY - (float)(yy);
        this.leftLeg3.rotationPointZ = this.leftLeg3.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 0) / 20) * (49-(0)));
            yy = 0 + (((tickAnim - 0) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 20) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 25) {
            xx = 49 + (((tickAnim - 20) / 5) * (22.25-(49)));
            yy = 0 + (((tickAnim - 20) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 5) * (0-(0)));
        }
        else if (tickAnim >= 25 && tickAnim < 132) {
            xx = 22.25 + (((tickAnim - 25) / 107) * (22.25-(22.25)));
            yy = 0 + (((tickAnim - 25) / 107) * (0-(0)));
            zz = 0 + (((tickAnim - 25) / 107) * (0-(0)));
        }
        else if (tickAnim >= 132 && tickAnim < 141) {
            xx = 22.25 + (((tickAnim - 132) / 9) * (74.62-(22.25)));
            yy = 0 + (((tickAnim - 132) / 9) * (0-(0)));
            zz = 0 + (((tickAnim - 132) / 9) * (0-(0)));
        }
        else if (tickAnim >= 141 && tickAnim < 144) {
            xx = 74.62 + (((tickAnim - 141) / 3) * (74.62-(74.62)));
            yy = 0 + (((tickAnim - 141) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 141) / 3) * (0-(0)));
        }
        else if (tickAnim >= 144 && tickAnim < 150) {
            xx = 74.62 + (((tickAnim - 144) / 6) * (0-(74.62)));
            yy = 0 + (((tickAnim - 144) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 144) / 6) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftLeg4, leftLeg4.rotateAngleX + (float) Math.toRadians(xx), leftLeg4.rotateAngleY + (float) Math.toRadians(yy), leftLeg4.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 0) / 20) * (-3.7-(0)));
            yy = 0 + (((tickAnim - 0) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 20) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 25) {
            xx = -3.7 + (((tickAnim - 20) / 5) * (-4-(-3.7)));
            yy = 0 + (((tickAnim - 20) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 5) * (0-(0)));
        }
        else if (tickAnim >= 25 && tickAnim < 132) {
            xx = -4 + (((tickAnim - 25) / 107) * (-4-(-4)));
            yy = 0 + (((tickAnim - 25) / 107) * (0-(0)));
            zz = 0 + (((tickAnim - 25) / 107) * (0-(0)));
        }
        else if (tickAnim >= 132 && tickAnim < 150) {
            xx = -4 + (((tickAnim - 132) / 18) * (0-(-4)));
            yy = 0 + (((tickAnim - 132) / 18) * (0-(0)));
            zz = 0 + (((tickAnim - 132) / 18) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightLeg, rightLeg.rotateAngleX + (float) Math.toRadians(xx), rightLeg.rotateAngleY + (float) Math.toRadians(yy), rightLeg.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 25) {
            xx = 0 + (((tickAnim - 0) / 25) * (5.75-(0)));
            yy = 0 + (((tickAnim - 0) / 25) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 25) * (0-(0)));
        }
        else if (tickAnim >= 25 && tickAnim < 35) {
            xx = 5.75 + (((tickAnim - 25) / 10) * (7.16-(5.75)));
            yy = 0 + (((tickAnim - 25) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 25) / 10) * (0-(0)));
        }
        else if (tickAnim >= 35 && tickAnim < 49) {
            xx = 7.16 + (((tickAnim - 35) / 14) * (5.75-(7.16)));
            yy = 0 + (((tickAnim - 35) / 14) * (0-(0)));
            zz = 0 + (((tickAnim - 35) / 14) * (0-(0)));
        }
        else if (tickAnim >= 49 && tickAnim < 59) {
            xx = 5.75 + (((tickAnim - 49) / 10) * (7.16-(5.75)));
            yy = 0 + (((tickAnim - 49) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 49) / 10) * (0-(0)));
        }
        else if (tickAnim >= 59 && tickAnim < 77) {
            xx = 7.16 + (((tickAnim - 59) / 18) * (5.75-(7.16)));
            yy = 0 + (((tickAnim - 59) / 18) * (0-(0)));
            zz = 0 + (((tickAnim - 59) / 18) * (0-(0)));
        }
        else if (tickAnim >= 77 && tickAnim < 115) {
            xx = 5.75 + (((tickAnim - 77) / 38) * (5.75-(5.75)));
            yy = 0 + (((tickAnim - 77) / 38) * (0-(0)));
            zz = 0 + (((tickAnim - 77) / 38) * (0-(0)));
        }
        else if (tickAnim >= 115 && tickAnim < 125) {
            xx = 5.75 + (((tickAnim - 115) / 10) * (7-(5.75)));
            yy = 0 + (((tickAnim - 115) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 115) / 10) * (0-(0)));
        }
        else if (tickAnim >= 125 && tickAnim < 132) {
            xx = 7 + (((tickAnim - 125) / 7) * (5.75-(7)));
            yy = 0 + (((tickAnim - 125) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 125) / 7) * (0-(0)));
        }
        else if (tickAnim >= 132 && tickAnim < 150) {
            xx = 5.75 + (((tickAnim - 132) / 18) * (0-(5.75)));
            yy = 0 + (((tickAnim - 132) / 18) * (0-(0)));
            zz = 0 + (((tickAnim - 132) / 18) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(body, body.rotateAngleX + (float) Math.toRadians(xx), body.rotateAngleY + (float) Math.toRadians(yy), body.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 25) {
            xx = 0 + (((tickAnim - 0) / 25) * (4.5-(0)));
            yy = 0 + (((tickAnim - 0) / 25) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 25) * (0-(0)));
        }
        else if (tickAnim >= 25 && tickAnim < 35) {
            xx = 4.5 + (((tickAnim - 25) / 10) * (8.82-(4.5)));
            yy = 0 + (((tickAnim - 25) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 25) / 10) * (0-(0)));
        }
        else if (tickAnim >= 35 && tickAnim < 49) {
            xx = 8.82 + (((tickAnim - 35) / 14) * (-1-(8.82)));
            yy = 0 + (((tickAnim - 35) / 14) * (0-(0)));
            zz = 0 + (((tickAnim - 35) / 14) * (0-(0)));
        }
        else if (tickAnim >= 49 && tickAnim < 59) {
            xx = -1 + (((tickAnim - 49) / 10) * (8.82-(-1)));
            yy = 0 + (((tickAnim - 49) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 49) / 10) * (0-(0)));
        }
        else if (tickAnim >= 59 && tickAnim < 77) {
            xx = 8.82 + (((tickAnim - 59) / 18) * (-1-(8.82)));
            yy = 0 + (((tickAnim - 59) / 18) * (0-(0)));
            zz = 0 + (((tickAnim - 59) / 18) * (0-(0)));
        }
        else if (tickAnim >= 77 && tickAnim < 115) {
            xx = -1 + (((tickAnim - 77) / 38) * (4.5-(-1)));
            yy = 0 + (((tickAnim - 77) / 38) * (0-(0)));
            zz = 0 + (((tickAnim - 77) / 38) * (0-(0)));
        }
        else if (tickAnim >= 115 && tickAnim < 125) {
            xx = 4.5 + (((tickAnim - 115) / 10) * (7.51-(4.5)));
            yy = 0 + (((tickAnim - 115) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 115) / 10) * (0-(0)));
        }
        else if (tickAnim >= 125 && tickAnim < 132) {
            xx = 7.51 + (((tickAnim - 125) / 7) * (4.5-(7.51)));
            yy = 0 + (((tickAnim - 125) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 125) / 7) * (0-(0)));
        }
        else if (tickAnim >= 132 && tickAnim < 150) {
            xx = 4.5 + (((tickAnim - 132) / 18) * (0-(4.5)));
            yy = 0 + (((tickAnim - 132) / 18) * (0-(0)));
            zz = 0 + (((tickAnim - 132) / 18) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(chest, chest.rotateAngleX + (float) Math.toRadians(xx), chest.rotateAngleY + (float) Math.toRadians(yy), chest.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 25) {
            xx = 0 + (((tickAnim - 0) / 25) * (12.5-(0)));
            yy = 0 + (((tickAnim - 0) / 25) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 25) * (0-(0)));
        }
        else if (tickAnim >= 25 && tickAnim < 35) {
            xx = 12.5 + (((tickAnim - 25) / 10) * (41-(12.5)));
            yy = 0 + (((tickAnim - 25) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 25) / 10) * (0-(0)));
        }
        else if (tickAnim >= 35 && tickAnim < 42) {
            xx = 41 + (((tickAnim - 35) / 7) * (26.525-(41)));
            yy = 0 + (((tickAnim - 35) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 35) / 7) * (0-(0)));
        }
        else if (tickAnim >= 42 && tickAnim < 49) {
            xx = 26.525 + (((tickAnim - 42) / 7) * (15.05+Math.sin((Math.PI/180)*(((double)tickAnim/20)*150))*5-(26.525)));
            yy = 0 + (((tickAnim - 42) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 42) / 7) * (0-(0)));
        }
        else if (tickAnim >= 49 && tickAnim < 59) {
            xx = 15.05+Math.sin((Math.PI/180)*(((double)tickAnim/20)*150))*5 + (((tickAnim - 49) / 10) * (47.175+Math.sin((Math.PI/180)*(((double)tickAnim/20)*150+90))*15-(15.05+Math.sin((Math.PI/180)*(((double)tickAnim/20)*150))*5)));
            yy = 0 + (((tickAnim - 49) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 49) / 10) * (0-(0)));
        }
        else if (tickAnim >= 59 && tickAnim < 75) {
            xx = 47.175+Math.sin((Math.PI/180)*(((double)tickAnim/20)*150+90))*15 + (((tickAnim - 59) / 16) * (3.75-(47.175+Math.sin((Math.PI/180)*(((double)tickAnim/20)*150+90))*15)));
            yy = 0 + (((tickAnim - 59) / 16) * (0-(0)));
            zz = 0 + (((tickAnim - 59) / 16) * (0-(0)));
        }
        else if (tickAnim >= 75 && tickAnim < 80) {
            xx = 3.75 + (((tickAnim - 75) / 5) * (3.75032-(3.75)));
            yy = 0 + (((tickAnim - 75) / 5) * (0.74839-(0)));
            zz = 0 + (((tickAnim - 75) / 5) * (0.04906-(0)));
        }
        else if (tickAnim >= 80 && tickAnim < 90) {
            xx = 3.75032 + (((tickAnim - 80) / 10) * (-1.66998-(3.75032)));
            yy = 0.74839 + (((tickAnim - 80) / 10) * (-11.72448-(0.74839)));
            zz = 0.04906 + (((tickAnim - 80) / 10) * (-0.7794-(0.04906)));
        }
        else if (tickAnim >= 90 && tickAnim < 98) {
            xx = -1.66998 + (((tickAnim - 90) / 8) * (-1.66998-(-1.66998)));
            yy = -11.72448 + (((tickAnim - 90) / 8) * (-11.72448-(-11.72448)));
            zz = -0.7794 + (((tickAnim - 90) / 8) * (-0.7794-(-0.7794)));
        }
        else if (tickAnim >= 98 && tickAnim < 115) {
            xx = -1.66998 + (((tickAnim - 98) / 17) * (12.5-(-1.66998)));
            yy = -11.72448 + (((tickAnim - 98) / 17) * (0-(-11.72448)));
            zz = -0.7794 + (((tickAnim - 98) / 17) * (0-(-0.7794)));
        }
        else if (tickAnim >= 115 && tickAnim < 125) {
            xx = 12.5 + (((tickAnim - 115) / 10) * (41-(12.5)));
            yy = 0 + (((tickAnim - 115) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 115) / 10) * (0-(0)));
        }
        else if (tickAnim >= 125 && tickAnim < 132) {
            xx = 41 + (((tickAnim - 125) / 7) * (29.25-(41)));
            yy = 0 + (((tickAnim - 125) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 125) / 7) * (0-(0)));
        }
        else if (tickAnim >= 132 && tickAnim < 150) {
            xx = 29.25 + (((tickAnim - 132) / 18) * (0-(29.25)));
            yy = 0 + (((tickAnim - 132) / 18) * (0-(0)));
            zz = 0 + (((tickAnim - 132) / 18) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck3, neck3.rotateAngleX + (float) Math.toRadians(xx), neck3.rotateAngleY + (float) Math.toRadians(yy), neck3.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 59) {
            xx = 0 + (((tickAnim - 0) / 59) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 59) * (-0.225-(0)));
            zz = 0 + (((tickAnim - 0) / 59) * (0-(0)));
        }
        else if (tickAnim >= 59 && tickAnim < 150) {
            xx = 0 + (((tickAnim - 59) / 91) * (0-(0)));
            yy = -0.225 + (((tickAnim - 59) / 91) * (0-(-0.225)));
            zz = 0 + (((tickAnim - 59) / 91) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.neck3.rotationPointX = this.neck3.rotationPointX + (float)(xx);
        this.neck3.rotationPointY = this.neck3.rotationPointY - (float)(yy);
        this.neck3.rotationPointZ = this.neck3.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 25) {
            xx = 0 + (((tickAnim - 0) / 25) * (14.25-(0)));
            yy = 0 + (((tickAnim - 0) / 25) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 25) * (0-(0)));
        }
        else if (tickAnim >= 25 && tickAnim < 35) {
            xx = 14.25 + (((tickAnim - 25) / 10) * (37.25-(14.25)));
            yy = 0 + (((tickAnim - 25) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 25) / 10) * (0-(0)));
        }
        else if (tickAnim >= 35 && tickAnim < 42) {
            xx = 37.25 + (((tickAnim - 35) / 7) * (13.25-(37.25)));
            yy = 0 + (((tickAnim - 35) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 35) / 7) * (0-(0)));
        }
        else if (tickAnim >= 42 && tickAnim < 49) {
            xx = 13.25 + (((tickAnim - 42) / 7) * (14.25-(13.25)));
            yy = 0 + (((tickAnim - 42) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 42) / 7) * (0-(0)));
        }
        else if (tickAnim >= 49 && tickAnim < 59) {
            xx = 14.25 + (((tickAnim - 49) / 10) * (37.25-(14.25)));
            yy = 0 + (((tickAnim - 49) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 49) / 10) * (0-(0)));
        }
        else if (tickAnim >= 59 && tickAnim < 66) {
            xx = 37.25 + (((tickAnim - 59) / 7) * (13.25-(37.25)));
            yy = 0 + (((tickAnim - 59) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 59) / 7) * (0-(0)));
        }
        else if (tickAnim >= 66 && tickAnim < 75) {
            xx = 13.25 + (((tickAnim - 66) / 9) * (2.25-(13.25)));
            yy = 0 + (((tickAnim - 66) / 9) * (0-(0)));
            zz = 0 + (((tickAnim - 66) / 9) * (0-(0)));
        }
        else if (tickAnim >= 75 && tickAnim < 80) {
            xx = 2.25 + (((tickAnim - 75) / 5) * (2.25077-(2.25)));
            yy = 0 + (((tickAnim - 75) / 5) * (1.49884-(0)));
            zz = 0 + (((tickAnim - 75) / 5) * (0.0589-(0)));
        }
        else if (tickAnim >= 80 && tickAnim < 90) {
            xx = 2.25077 + (((tickAnim - 80) / 10) * (1.67837-(2.25077)));
            yy = 1.49884 + (((tickAnim - 80) / 10) * (-9.86342-(1.49884)));
            zz = 0.0589 + (((tickAnim - 80) / 10) * (3.16324-(0.0589)));
        }
        else if (tickAnim >= 90 && tickAnim < 98) {
            xx = 1.67837 + (((tickAnim - 90) / 8) * (1.67837-(1.67837)));
            yy = -9.86342 + (((tickAnim - 90) / 8) * (-9.86342-(-9.86342)));
            zz = 3.16324 + (((tickAnim - 90) / 8) * (3.16324-(3.16324)));
        }
        else if (tickAnim >= 98 && tickAnim < 115) {
            xx = 1.67837 + (((tickAnim - 98) / 17) * (14.25-(1.67837)));
            yy = -9.86342 + (((tickAnim - 98) / 17) * (0-(-9.86342)));
            zz = 3.16324 + (((tickAnim - 98) / 17) * (0-(3.16324)));
        }
        else if (tickAnim >= 115 && tickAnim < 125) {
            xx = 14.25 + (((tickAnim - 115) / 10) * (37.25-(14.25)));
            yy = 0 + (((tickAnim - 115) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 115) / 10) * (0-(0)));
        }
        else if (tickAnim >= 125 && tickAnim < 132) {
            xx = 37.25 + (((tickAnim - 125) / 7) * (13.25-(37.25)));
            yy = 0 + (((tickAnim - 125) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 125) / 7) * (0-(0)));
        }
        else if (tickAnim >= 132 && tickAnim < 150) {
            xx = 13.25 + (((tickAnim - 132) / 18) * (0-(13.25)));
            yy = 0 + (((tickAnim - 132) / 18) * (0-(0)));
            zz = 0 + (((tickAnim - 132) / 18) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck2, neck2.rotateAngleX + (float) Math.toRadians(xx), neck2.rotateAngleY + (float) Math.toRadians(yy), neck2.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 35) {
            xx = 0 + (((tickAnim - 0) / 35) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 35) * (-0.425-(0)));
            zz = 0 + (((tickAnim - 0) / 35) * (0-(0)));
        }
        else if (tickAnim >= 35 && tickAnim < 42) {
            xx = 0 + (((tickAnim - 35) / 7) * (0-(0)));
            yy = -0.425 + (((tickAnim - 35) / 7) * (0-(-0.425)));
            zz = 0 + (((tickAnim - 35) / 7) * (0-(0)));
        }
        else if (tickAnim >= 42 && tickAnim < 59) {
            xx = 0 + (((tickAnim - 42) / 17) * (0-(0)));
            yy = 0 + (((tickAnim - 42) / 17) * (-0.425-(0)));
            zz = 0 + (((tickAnim - 42) / 17) * (0-(0)));
        }
        else if (tickAnim >= 59 && tickAnim < 66) {
            xx = 0 + (((tickAnim - 59) / 7) * (0-(0)));
            yy = -0.425 + (((tickAnim - 59) / 7) * (0-(-0.425)));
            zz = 0 + (((tickAnim - 59) / 7) * (0-(0)));
        }
        else if (tickAnim >= 66 && tickAnim < 125) {
            xx = 0 + (((tickAnim - 66) / 59) * (0-(0)));
            yy = 0 + (((tickAnim - 66) / 59) * (-0.425-(0)));
            zz = 0 + (((tickAnim - 66) / 59) * (0-(0)));
        }
        else if (tickAnim >= 125 && tickAnim < 132) {
            xx = 0 + (((tickAnim - 125) / 7) * (0-(0)));
            yy = -0.425 + (((tickAnim - 125) / 7) * (0-(-0.425)));
            zz = 0 + (((tickAnim - 125) / 7) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.neck2.rotationPointX = this.neck2.rotationPointX + (float)(xx);
        this.neck2.rotationPointY = this.neck2.rotationPointY - (float)(yy);
        this.neck2.rotationPointZ = this.neck2.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 25) {
            xx = 0 + (((tickAnim - 0) / 25) * (16-(0)));
            yy = 0 + (((tickAnim - 0) / 25) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 25) * (0-(0)));
        }
        else if (tickAnim >= 25 && tickAnim < 35) {
            xx = 16 + (((tickAnim - 25) / 10) * (-11.5-(16)));
            yy = 0 + (((tickAnim - 25) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 25) / 10) * (0-(0)));
        }
        else if (tickAnim >= 35 && tickAnim < 42) {
            xx = -11.5 + (((tickAnim - 35) / 7) * (6.75-(-11.5)));
            yy = 0 + (((tickAnim - 35) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 35) / 7) * (0-(0)));
        }
        else if (tickAnim >= 42 && tickAnim < 49) {
            xx = 6.75 + (((tickAnim - 42) / 7) * (16-(6.75)));
            yy = 0 + (((tickAnim - 42) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 42) / 7) * (0-(0)));
        }
        else if (tickAnim >= 49 && tickAnim < 59) {
            xx = 16 + (((tickAnim - 49) / 10) * (-11.5-(16)));
            yy = 0 + (((tickAnim - 49) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 49) / 10) * (0-(0)));
        }
        else if (tickAnim >= 59 && tickAnim < 66) {
            xx = -11.5 + (((tickAnim - 59) / 7) * (6.75-(-11.5)));
            yy = 0 + (((tickAnim - 59) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 59) / 7) * (0-(0)));
        }
        else if (tickAnim >= 66 && tickAnim < 75) {
            xx = 6.75 + (((tickAnim - 66) / 9) * (-15.75-(6.75)));
            yy = 0 + (((tickAnim - 66) / 9) * (0-(0)));
            zz = 0 + (((tickAnim - 66) / 9) * (0-(0)));
        }
        else if (tickAnim >= 75 && tickAnim < 80) {
            xx = -15.75 + (((tickAnim - 75) / 5) * (-15.75441-(-15.75)));
            yy = 0 + (((tickAnim - 75) / 5) * (2.23867-(0)));
            zz = 0 + (((tickAnim - 75) / 5) * (-0.22554-(0)));
        }
        else if (tickAnim >= 80 && tickAnim < 90) {
            xx = -15.75441 + (((tickAnim - 80) / 10) * (-15.87083-(-15.75441)));
            yy = 2.23867 + (((tickAnim - 80) / 10) * (-5.37077-(2.23867)));
            zz = -0.22554 + (((tickAnim - 80) / 10) * (1.55203-(-0.22554)));
        }
        else if (tickAnim >= 90 && tickAnim < 98) {
            xx = -15.87083 + (((tickAnim - 90) / 8) * (-15.87083-(-15.87083)));
            yy = -5.37077 + (((tickAnim - 90) / 8) * (-5.37077-(-5.37077)));
            zz = 1.55203 + (((tickAnim - 90) / 8) * (1.55203-(1.55203)));
        }
        else if (tickAnim >= 98 && tickAnim < 115) {
            xx = -15.87083 + (((tickAnim - 98) / 17) * (16-(-15.87083)));
            yy = -5.37077 + (((tickAnim - 98) / 17) * (0-(-5.37077)));
            zz = 1.55203 + (((tickAnim - 98) / 17) * (0-(1.55203)));
        }
        else if (tickAnim >= 115 && tickAnim < 125) {
            xx = 16 + (((tickAnim - 115) / 10) * (-11.5-(16)));
            yy = 0 + (((tickAnim - 115) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 115) / 10) * (0-(0)));
        }
        else if (tickAnim >= 125 && tickAnim < 132) {
            xx = -11.5 + (((tickAnim - 125) / 7) * (6.75-(-11.5)));
            yy = 0 + (((tickAnim - 125) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 125) / 7) * (0-(0)));
        }
        else if (tickAnim >= 132 && tickAnim < 150) {
            xx = 6.75 + (((tickAnim - 132) / 18) * (0-(6.75)));
            yy = 0 + (((tickAnim - 132) / 18) * (0-(0)));
            zz = 0 + (((tickAnim - 132) / 18) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck, neck.rotateAngleX + (float) Math.toRadians(xx), neck.rotateAngleY + (float) Math.toRadians(yy), neck.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 25) {
            xx = 0 + (((tickAnim - 0) / 25) * (15.25-(0)));
            yy = 0 + (((tickAnim - 0) / 25) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 25) * (0-(0)));
        }
        else if (tickAnim >= 25 && tickAnim < 33) {
            xx = 15.25 + (((tickAnim - 25) / 8) * (-3-(15.25)));
            yy = 0 + (((tickAnim - 25) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 25) / 8) * (0-(0)));
        }
        else if (tickAnim >= 33 && tickAnim < 35) {
            xx = -3 + (((tickAnim - 33) / 2) * (6.75-(-3)));
            yy = 0 + (((tickAnim - 33) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 33) / 2) * (0-(0)));
        }
        else if (tickAnim >= 35 && tickAnim < 42) {
            xx = 6.75 + (((tickAnim - 35) / 7) * (15.75-(6.75)));
            yy = 0 + (((tickAnim - 35) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 35) / 7) * (0-(0)));
        }
        else if (tickAnim >= 42 && tickAnim < 49) {
            xx = 15.75 + (((tickAnim - 42) / 7) * (15.25-(15.75)));
            yy = 0 + (((tickAnim - 42) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 42) / 7) * (0-(0)));
        }
        else if (tickAnim >= 49 && tickAnim < 57) {
            xx = 15.25 + (((tickAnim - 49) / 8) * (-3-(15.25)));
            yy = 0 + (((tickAnim - 49) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 49) / 8) * (0-(0)));
        }
        else if (tickAnim >= 57 && tickAnim < 59) {
            xx = -3 + (((tickAnim - 57) / 2) * (6.75-(-3)));
            yy = 0 + (((tickAnim - 57) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 57) / 2) * (0-(0)));
        }
        else if (tickAnim >= 59 && tickAnim < 66) {
            xx = 6.75 + (((tickAnim - 59) / 7) * (15.75-(6.75)));
            yy = 0 + (((tickAnim - 59) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 59) / 7) * (0-(0)));
        }
        else if (tickAnim >= 66 && tickAnim < 75) {
            xx = 15.75 + (((tickAnim - 66) / 9) * (2.09697-(15.75)));
            yy = 0 + (((tickAnim - 66) / 9) * (17.489-(0)));
            zz = 0 + (((tickAnim - 66) / 9) * (0.63044-(0)));
        }
        else if (tickAnim >= 75 && tickAnim < 80) {
            xx = 2.09697 + (((tickAnim - 75) / 5) * (2.12489-(2.09697)));
            yy = 17.489 + (((tickAnim - 75) / 5) * (19.73747-(17.489)));
            zz = 0.63044 + (((tickAnim - 75) / 5) * (0.71789-(0.63044)));
        }
        else if (tickAnim >= 80 && tickAnim < 90) {
            xx = 2.12489 + (((tickAnim - 80) / 10) * (2.17661-(2.12489)));
            yy = 19.73747 + (((tickAnim - 80) / 10) * (-23.23501-(19.73747)));
            zz = 0.71789 + (((tickAnim - 80) / 10) * (-0.85903-(0.71789)));
        }
        else if (tickAnim >= 90 && tickAnim < 92) {
            xx = 2.17661 + (((tickAnim - 90) / 2) * (-5.31991-(2.17661)));
            yy = -23.23501 + (((tickAnim - 90) / 2) * (-26.12342-(-23.23501)));
            zz = -0.85903 + (((tickAnim - 90) / 2) * (-0.96502-(-0.85903)));
        }
        else if (tickAnim >= 92 && tickAnim < 93) {
            xx = -5.31991 + (((tickAnim - 92) / 1) * (2.17661-(-5.31991)));
            yy = -26.12342 + (((tickAnim - 92) / 1) * (-23.23501-(-26.12342)));
            zz = -0.96502 + (((tickAnim - 92) / 1) * (-0.85903-(-0.96502)));
        }
        else if (tickAnim >= 93 && tickAnim < 95) {
            xx = 2.17661 + (((tickAnim - 93) / 2) * (-5.31991-(2.17661)));
            yy = -23.23501 + (((tickAnim - 93) / 2) * (-26.12342-(-23.23501)));
            zz = -0.85903 + (((tickAnim - 93) / 2) * (-0.96502-(-0.85903)));
        }
        else if (tickAnim >= 95 && tickAnim < 97) {
            xx = -5.31991 + (((tickAnim - 95) / 2) * (2.17661-(-5.31991)));
            yy = -26.12342 + (((tickAnim - 95) / 2) * (-23.23501-(-26.12342)));
            zz = -0.96502 + (((tickAnim - 95) / 2) * (-0.85903-(-0.96502)));
        }
        else if (tickAnim >= 97 && tickAnim < 98) {
            xx = 2.17661 + (((tickAnim - 97) / 1) * (2.17661-(2.17661)));
            yy = -23.23501 + (((tickAnim - 97) / 1) * (-23.23501-(-23.23501)));
            zz = -0.85903 + (((tickAnim - 97) / 1) * (-0.85903-(-0.85903)));
        }
        else if (tickAnim >= 98 && tickAnim < 115) {
            xx = 2.17661 + (((tickAnim - 98) / 17) * (15.25-(2.17661)));
            yy = -23.23501 + (((tickAnim - 98) / 17) * (0-(-23.23501)));
            zz = -0.85903 + (((tickAnim - 98) / 17) * (0-(-0.85903)));
        }
        else if (tickAnim >= 115 && tickAnim < 123) {
            xx = 15.25 + (((tickAnim - 115) / 8) * (-3-(15.25)));
            yy = 0 + (((tickAnim - 115) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 115) / 8) * (0-(0)));
        }
        else if (tickAnim >= 123 && tickAnim < 125) {
            xx = -3 + (((tickAnim - 123) / 2) * (6.75-(-3)));
            yy = 0 + (((tickAnim - 123) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 123) / 2) * (0-(0)));
        }
        else if (tickAnim >= 125 && tickAnim < 132) {
            xx = 6.75 + (((tickAnim - 125) / 7) * (15.75-(6.75)));
            yy = 0 + (((tickAnim - 125) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 125) / 7) * (0-(0)));
        }
        else if (tickAnim >= 132 && tickAnim < 150) {
            xx = 15.75 + (((tickAnim - 132) / 18) * (0-(15.75)));
            yy = 0 + (((tickAnim - 132) / 18) * (0-(0)));
            zz = 0 + (((tickAnim - 132) / 18) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(head, head.rotateAngleX + (float) Math.toRadians(xx), head.rotateAngleY + (float) Math.toRadians(yy), head.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 25) {
            xx = 0 + (((tickAnim - 0) / 25) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 25) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 25) * (0-(0)));
        }
        else if (tickAnim >= 25 && tickAnim < 33) {
            xx = 0 + (((tickAnim - 25) / 8) * (22.75-(0)));
            yy = 0 + (((tickAnim - 25) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 25) / 8) * (0-(0)));
        }
        else if (tickAnim >= 33 && tickAnim < 35) {
            xx = 22.75 + (((tickAnim - 33) / 2) * (0-(22.75)));
            yy = 0 + (((tickAnim - 33) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 33) / 2) * (0-(0)));
        }
        else if (tickAnim >= 35 && tickAnim < 49) {
            xx = 0 + (((tickAnim - 35) / 14) * (0-(0)));
            yy = 0 + (((tickAnim - 35) / 14) * (0-(0)));
            zz = 0 + (((tickAnim - 35) / 14) * (0-(0)));
        }
        else if (tickAnim >= 49 && tickAnim < 57) {
            xx = 0 + (((tickAnim - 49) / 8) * (22.75-(0)));
            yy = 0 + (((tickAnim - 49) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 49) / 8) * (0-(0)));
        }
        else if (tickAnim >= 57 && tickAnim < 59) {
            xx = 22.75 + (((tickAnim - 57) / 2) * (0-(22.75)));
            yy = 0 + (((tickAnim - 57) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 57) / 2) * (0-(0)));
        }
        else if (tickAnim >= 59 && tickAnim < 115) {
            xx = 0 + (((tickAnim - 59) / 56) * (0-(0)));
            yy = 0 + (((tickAnim - 59) / 56) * (0-(0)));
            zz = 0 + (((tickAnim - 59) / 56) * (0-(0)));
        }
        else if (tickAnim >= 115 && tickAnim < 123) {
            xx = 0 + (((tickAnim - 115) / 8) * (22.75-(0)));
            yy = 0 + (((tickAnim - 115) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 115) / 8) * (0-(0)));
        }
        else if (tickAnim >= 123 && tickAnim < 125) {
            xx = 22.75 + (((tickAnim - 123) / 2) * (0-(22.75)));
            yy = 0 + (((tickAnim - 123) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 123) / 2) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(jaw, jaw.rotateAngleX + (float) Math.toRadians(xx), jaw.rotateAngleY + (float) Math.toRadians(yy), jaw.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 0) / 20) * (-1.975+Math.sin((Math.PI/180)*(((double)tickAnim/20)*150))*-9-(0)));
            yy = 0 + (((tickAnim - 0) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 20) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 60) {
            xx = -1.975+Math.sin((Math.PI/180)*(((double)tickAnim/20)*150))*-9 + (((tickAnim - 20) / 40) * (-5.65+Math.sin((Math.PI/180)*(((double)tickAnim/20)*150))*-5-(-1.975+Math.sin((Math.PI/180)*(((double)tickAnim/20)*150))*-9)));
            yy = 0 + (((tickAnim - 20) / 40) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 40) * (0-(0)));
        }
        else if (tickAnim >= 60 && tickAnim < 71) {
            xx = -5.65+Math.sin((Math.PI/180)*(((double)tickAnim/20)*150))*-5 + (((tickAnim - 60) / 11) * (1.535+Math.sin((Math.PI/180)*(((double)tickAnim/20)*150))*-11-(-5.65+Math.sin((Math.PI/180)*(((double)tickAnim/20)*150))*-5)));
            yy = 0 + (((tickAnim - 60) / 11) * (0-(0)));
            zz = 0 + (((tickAnim - 60) / 11) * (0-(0)));
        }
        else if (tickAnim >= 71 && tickAnim < 115) {
            xx = 1.535+Math.sin((Math.PI/180)*(((double)tickAnim/20)*150))*-11 + (((tickAnim - 71) / 44) * (-11.27-(1.535+Math.sin((Math.PI/180)*(((double)tickAnim/20)*150))*-11)));
            yy = 0 + (((tickAnim - 71) / 44) * (0-(0)));
            zz = 0 + (((tickAnim - 71) / 44) * (0-(0)));
        }
        else if (tickAnim >= 115 && tickAnim < 132) {
            xx = -11.27 + (((tickAnim - 115) / 17) * (-4.75-(-11.27)));
            yy = 0 + (((tickAnim - 115) / 17) * (0-(0)));
            zz = 0 + (((tickAnim - 115) / 17) * (0-(0)));
        }
        else if (tickAnim >= 132 && tickAnim < 142) {
            xx = -4.75 + (((tickAnim - 132) / 10) * (0-(-4.75)));
            yy = 0 + (((tickAnim - 132) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 132) / 10) * (0-(0)));
        }
        else if (tickAnim >= 142 && tickAnim < 150) {
            xx = 0 + (((tickAnim - 142) / 8) * (0-(0)));
            yy = 0 + (((tickAnim - 142) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 142) / 8) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tail, tail.rotateAngleX + (float) Math.toRadians(xx), tail.rotateAngleY + (float) Math.toRadians(yy), tail.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 25) {
            xx = 0 + (((tickAnim - 0) / 25) * (-4.5-(0)));
            yy = 0 + (((tickAnim - 0) / 25) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 25) * (0-(0)));
        }
        else if (tickAnim >= 25 && tickAnim < 36) {
            xx = -4.5 + (((tickAnim - 25) / 11) * (-0.18-(-4.5)));
            yy = 0 + (((tickAnim - 25) / 11) * (0-(0)));
            zz = 0 + (((tickAnim - 25) / 11) * (0-(0)));
        }
        else if (tickAnim >= 36 && tickAnim < 45) {
            xx = -0.18 + (((tickAnim - 36) / 9) * (-1.92+Math.sin((Math.PI/180)*(((double)tickAnim/20)*150))*-5-(-0.18)));
            yy = 0 + (((tickAnim - 36) / 9) * (0-(0)));
            zz = 0 + (((tickAnim - 36) / 9) * (0-(0)));
        }
        else if (tickAnim >= 45 && tickAnim < 60) {
            xx = -1.92+Math.sin((Math.PI/180)*(((double)tickAnim/20)*150))*-5 + (((tickAnim - 45) / 15) * (-3.075-(-1.92+Math.sin((Math.PI/180)*(((double)tickAnim/20)*150))*-5)));
            yy = 0 + (((tickAnim - 45) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 45) / 15) * (0-(0)));
        }
        else if (tickAnim >= 60 && tickAnim < 71) {
            xx = -3.075 + (((tickAnim - 60) / 11) * (-0.18-(-3.075)));
            yy = 0 + (((tickAnim - 60) / 11) * (0-(0)));
            zz = 0 + (((tickAnim - 60) / 11) * (0-(0)));
        }
        else if (tickAnim >= 71 && tickAnim < 80) {
            xx = -0.18 + (((tickAnim - 71) / 9) * (1.48-(-0.18)));
            yy = 0 + (((tickAnim - 71) / 9) * (0-(0)));
            zz = 0 + (((tickAnim - 71) / 9) * (0-(0)));
        }
        else if (tickAnim >= 80 && tickAnim < 111) {
            xx = 1.48 + (((tickAnim - 80) / 31) * (-13.77-(1.48)));
            yy = 0 + (((tickAnim - 80) / 31) * (0-(0)));
            zz = 0 + (((tickAnim - 80) / 31) * (0-(0)));
        }
        else if (tickAnim >= 111 && tickAnim < 132) {
            xx = -13.77 + (((tickAnim - 111) / 21) * (-4.5-(-13.77)));
            yy = 0 + (((tickAnim - 111) / 21) * (0-(0)));
            zz = 0 + (((tickAnim - 111) / 21) * (0-(0)));
        }
        else if (tickAnim >= 132 && tickAnim < 142) {
            xx = -4.5 + (((tickAnim - 132) / 10) * (1.75-(-4.5)));
            yy = 0 + (((tickAnim - 132) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 132) / 10) * (0-(0)));
        }
        else if (tickAnim >= 142 && tickAnim < 150) {
            xx = 1.75 + (((tickAnim - 142) / 8) * (0-(1.75)));
            yy = 0 + (((tickAnim - 142) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 142) / 8) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tail2, tail2.rotateAngleX + (float) Math.toRadians(xx), tail2.rotateAngleY + (float) Math.toRadians(yy), tail2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 25) {
            xx = 0 + (((tickAnim - 0) / 25) * (-5-(0)));
            yy = 0 + (((tickAnim - 0) / 25) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 25) * (0-(0)));
        }
        else if (tickAnim >= 25 && tickAnim < 36) {
            xx = -5 + (((tickAnim - 25) / 11) * (5.05-(-5)));
            yy = 0 + (((tickAnim - 25) / 11) * (0-(0)));
            zz = 0 + (((tickAnim - 25) / 11) * (0-(0)));
        }
        else if (tickAnim >= 36 && tickAnim < 45) {
            xx = 5.05 + (((tickAnim - 36) / 9) * (11.6-(5.05)));
            yy = 0 + (((tickAnim - 36) / 9) * (0-(0)));
            zz = 0 + (((tickAnim - 36) / 9) * (0-(0)));
        }
        else if (tickAnim >= 45 && tickAnim < 60) {
            xx = 11.6 + (((tickAnim - 45) / 15) * (-5-(11.6)));
            yy = 0 + (((tickAnim - 45) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 45) / 15) * (0-(0)));
        }
        else if (tickAnim >= 60 && tickAnim < 71) {
            xx = -5 + (((tickAnim - 60) / 11) * (5.05-(-5)));
            yy = 0 + (((tickAnim - 60) / 11) * (0-(0)));
            zz = 0 + (((tickAnim - 60) / 11) * (0-(0)));
        }
        else if (tickAnim >= 71 && tickAnim < 80) {
            xx = 5.05 + (((tickAnim - 71) / 9) * (11.6-(5.05)));
            yy = 0 + (((tickAnim - 71) / 9) * (0-(0)));
            zz = 0 + (((tickAnim - 71) / 9) * (0-(0)));
        }
        else if (tickAnim >= 80 && tickAnim < 95) {
            xx = 11.6 + (((tickAnim - 80) / 15) * (-5-(11.6)));
            yy = 0 + (((tickAnim - 80) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 80) / 15) * (0-(0)));
        }
        else if (tickAnim >= 95 && tickAnim < 106) {
            xx = -5 + (((tickAnim - 95) / 11) * (-11.2-(-5)));
            yy = 0 + (((tickAnim - 95) / 11) * (0-(0)));
            zz = 0 + (((tickAnim - 95) / 11) * (0-(0)));
        }
        else if (tickAnim >= 106 && tickAnim < 115) {
            xx = -11.2 + (((tickAnim - 106) / 9) * (2.6-(-11.2)));
            yy = 0 + (((tickAnim - 106) / 9) * (0-(0)));
            zz = 0 + (((tickAnim - 106) / 9) * (0-(0)));
        }
        else if (tickAnim >= 115 && tickAnim < 132) {
            xx = 2.6 + (((tickAnim - 115) / 17) * (-5-(2.6)));
            yy = 0 + (((tickAnim - 115) / 17) * (0-(0)));
            zz = 0 + (((tickAnim - 115) / 17) * (0-(0)));
        }
        else if (tickAnim >= 132 && tickAnim < 142) {
            xx = -5 + (((tickAnim - 132) / 10) * (4.75-(-5)));
            yy = 0 + (((tickAnim - 132) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 132) / 10) * (0-(0)));
        }
        else if (tickAnim >= 142 && tickAnim < 150) {
            xx = 4.75 + (((tickAnim - 142) / 8) * (0-(4.75)));
            yy = 0 + (((tickAnim - 142) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 142) / 8) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tail3, tail3.rotateAngleX + (float) Math.toRadians(xx), tail3.rotateAngleY + (float) Math.toRadians(yy), tail3.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 25) {
            xx = 0 + (((tickAnim - 0) / 25) * (-22-(0)));
            yy = 0 + (((tickAnim - 0) / 25) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 25) * (0-(0)));
        }
        else if (tickAnim >= 25 && tickAnim < 45) {
            xx = -22 + (((tickAnim - 25) / 20) * (-8.415+Math.sin((Math.PI/180)*(((double)tickAnim/20)*150+90))*9-(-22)));
            yy = 0 + (((tickAnim - 25) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 25) / 20) * (0-(0)));
        }
        else if (tickAnim >= 45 && tickAnim < 60) {
            xx = -8.415+Math.sin((Math.PI/180)*(((double)tickAnim/20)*150+90))*9 + (((tickAnim - 45) / 15) * (-22-(-8.415+Math.sin((Math.PI/180)*(((double)tickAnim/20)*150+90))*9)));
            yy = 0 + (((tickAnim - 45) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 45) / 15) * (0-(0)));
        }
        else if (tickAnim >= 60 && tickAnim < 71) {
            xx = -22 + (((tickAnim - 60) / 11) * (-14.9-(-22)));
            yy = 0 + (((tickAnim - 60) / 11) * (0-(0)));
            zz = 0 + (((tickAnim - 60) / 11) * (0-(0)));
        }
        else if (tickAnim >= 71 && tickAnim < 80) {
            xx = -14.9 + (((tickAnim - 71) / 9) * (-8.215+Math.sin((Math.PI/180)*(((double)tickAnim/20)*150))*-15-(-14.9)));
            yy = 0 + (((tickAnim - 71) / 9) * (0-(0)));
            zz = 0 + (((tickAnim - 71) / 9) * (0-(0)));
        }
        else if (tickAnim >= 80 && tickAnim < 95) {
            xx = -8.215+Math.sin((Math.PI/180)*(((double)tickAnim/20)*150))*-15 + (((tickAnim - 80) / 15) * (-22-(-8.215+Math.sin((Math.PI/180)*(((double)tickAnim/20)*150))*-15)));
            yy = 0 + (((tickAnim - 80) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 80) / 15) * (0-(0)));
        }
        else if (tickAnim >= 95 && tickAnim < 106) {
            xx = -22 + (((tickAnim - 95) / 11) * (-21.15-(-22)));
            yy = 0 + (((tickAnim - 95) / 11) * (0-(0)));
            zz = 0 + (((tickAnim - 95) / 11) * (0-(0)));
        }
        else if (tickAnim >= 106 && tickAnim < 115) {
            xx = -21.15 + (((tickAnim - 106) / 9) * (-24.79-(-21.15)));
            yy = 0 + (((tickAnim - 106) / 9) * (0-(0)));
            zz = 0 + (((tickAnim - 106) / 9) * (0-(0)));
        }
        else if (tickAnim >= 115 && tickAnim < 132) {
            xx = -24.79 + (((tickAnim - 115) / 17) * (-22-(-24.79)));
            yy = 0 + (((tickAnim - 115) / 17) * (0-(0)));
            zz = 0 + (((tickAnim - 115) / 17) * (0-(0)));
        }
        else if (tickAnim >= 132 && tickAnim < 142) {
            xx = -22 + (((tickAnim - 132) / 10) * (4.75-(-22)));
            yy = 0 + (((tickAnim - 132) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 132) / 10) * (0-(0)));
        }
        else if (tickAnim >= 142 && tickAnim < 150) {
            xx = 4.75 + (((tickAnim - 142) / 8) * (0-(4.75)));
            yy = 0 + (((tickAnim - 142) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 142) / 8) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tail4, tail4.rotateAngleX + (float) Math.toRadians(xx), tail4.rotateAngleY + (float) Math.toRadians(yy), tail4.rotateAngleZ + (float) Math.toRadians(zz));

    }
    public void animWalking(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime) {
        EntityPrehistoricFloraBerthasaura entity = (EntityPrehistoricFloraBerthasaura) entitylivingbaseIn;
        int animCycle = 20;
        double tickAnim = (entity.ticksExisted + entity.getTickOffset()) - (int) (Math.floor((double) (entity.ticksExisted + entity.getTickOffset()) / (double) animCycle) * (double) animCycle) + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;
        this.setRotateAngle(hips, hips.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180/0.25+20))*1.5), hips.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180/0.5))*1), hips.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180/0.5+40))*3));
        this.hips.rotationPointX = this.hips.rotationPointX + (float)(0);
        this.hips.rotationPointY = this.hips.rotationPointY - (float)(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180/0.25))*-0.35);
        this.hips.rotationPointZ = this.hips.rotationPointZ + (float)(0);



        if (tickAnim >= 0 && tickAnim < 11) {
            xx = -14.17403 + (((tickAnim - 0) / 11) * (20.1166-(-14.17403)));
            yy = 2.0243 + (((tickAnim - 0) / 11) * (-9.13514-(2.0243)));
            zz = 4.29795 + (((tickAnim - 0) / 11) * (-1.45941-(4.29795)));
        }
        else if (tickAnim >= 11 && tickAnim < 17) {
            xx = 20.1166 + (((tickAnim - 11) / 6) * (-1.35623-(20.1166)));
            yy = -9.13514 + (((tickAnim - 11) / 6) * (-11.49276-(-9.13514)));
            zz = -1.45941 + (((tickAnim - 11) / 6) * (-1.01463-(-1.45941)));
        }
        else if (tickAnim >= 17 && tickAnim < 20) {
            xx = -1.35623 + (((tickAnim - 17) / 3) * (-14.17403-(-1.35623)));
            yy = -11.49276 + (((tickAnim - 17) / 3) * (2.0243-(-11.49276)));
            zz = -1.01463 + (((tickAnim - 17) / 3) * (4.29795-(-1.01463)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftLeg, leftLeg.rotateAngleX + (float) Math.toRadians(xx), leftLeg.rotateAngleY + (float) Math.toRadians(yy), leftLeg.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 11) {
            xx = -24.5 + (((tickAnim - 0) / 11) * (18.5-(-24.5)));
            yy = 0 + (((tickAnim - 0) / 11) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 11) * (0-(0)));
        }
        else if (tickAnim >= 11 && tickAnim < 17) {
            xx = 18.5 + (((tickAnim - 11) / 6) * (-8.64533-(18.5)));
            yy = 0 + (((tickAnim - 11) / 6) * (6.41462-(0)));
            zz = 0 + (((tickAnim - 11) / 6) * (3.89437-(0)));
        }
        else if (tickAnim >= 17 && tickAnim < 20) {
            xx = -8.64533 + (((tickAnim - 17) / 3) * (-24.5-(-8.64533)));
            yy = 6.41462 + (((tickAnim - 17) / 3) * (0-(6.41462)));
            zz = 3.89437 + (((tickAnim - 17) / 3) * (0-(3.89437)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftLeg2, leftLeg2.rotateAngleX + (float) Math.toRadians(xx), leftLeg2.rotateAngleY + (float) Math.toRadians(yy), leftLeg2.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 11) {
            xx = 0 + (((tickAnim - 0) / 11) * (0-(0)));
            yy = 0.2 + (((tickAnim - 0) / 11) * (0.075-(0.2)));
            zz = 0 + (((tickAnim - 0) / 11) * (0-(0)));
        }
        else if (tickAnim >= 11 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 11) / 9) * (0-(0)));
            yy = 0.075 + (((tickAnim - 11) / 9) * (0.2-(0.075)));
            zz = 0 + (((tickAnim - 11) / 9) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.leftLeg2.rotationPointX = this.leftLeg2.rotationPointX + (float)(xx);
        this.leftLeg2.rotationPointY = this.leftLeg2.rotationPointY - (float)(yy);
        this.leftLeg2.rotationPointZ = this.leftLeg2.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 4) {
            xx = 33.5 + (((tickAnim - 0) / 4) * (-0.27-(33.5)));
            yy = 0 + (((tickAnim - 0) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 4) * (0-(0)));
        }
        else if (tickAnim >= 4 && tickAnim < 11) {
            xx = -0.27 + (((tickAnim - 4) / 7) * (18.5-(-0.27)));
            yy = 0 + (((tickAnim - 4) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 4) / 7) * (0-(0)));
        }
        else if (tickAnim >= 11 && tickAnim < 12) {
            xx = 18.5 + (((tickAnim - 11) / 1) * (22.55-(18.5)));
            yy = 0 + (((tickAnim - 11) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 11) / 1) * (0-(0)));
        }
        else if (tickAnim >= 12 && tickAnim < 14) {
            xx = 22.55 + (((tickAnim - 12) / 2) * (-47.3-(22.55)));
            yy = 0 + (((tickAnim - 12) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 12) / 2) * (0-(0)));
        }
        else if (tickAnim >= 14 && tickAnim < 17) {
            xx = -47.3 + (((tickAnim - 14) / 3) * (-47.75863-(-47.3)));
            yy = 0 + (((tickAnim - 14) / 3) * (4.98244-(0)));
            zz = 0 + (((tickAnim - 14) / 3) * (-5.29047-(0)));
        }
        else if (tickAnim >= 17 && tickAnim < 20) {
            xx = -47.75863 + (((tickAnim - 17) / 3) * (33.5-(-47.75863)));
            yy = 4.98244 + (((tickAnim - 17) / 3) * (0-(4.98244)));
            zz = -5.29047 + (((tickAnim - 17) / 3) * (0-(-5.29047)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftLeg3, leftLeg3.rotateAngleX + (float) Math.toRadians(xx), leftLeg3.rotateAngleY + (float) Math.toRadians(yy), leftLeg3.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 11) {
            xx = 0 + (((tickAnim - 0) / 11) * (0-(0)));
            yy = -0.225 + (((tickAnim - 0) / 11) * (-0.225-(-0.225)));
            zz = 0 + (((tickAnim - 0) / 11) * (0-(0)));
        }
        else if (tickAnim >= 11 && tickAnim < 14) {
            xx = 0 + (((tickAnim - 11) / 3) * (0-(0)));
            yy = -0.225 + (((tickAnim - 11) / 3) * (0.33-(-0.225)));
            zz = 0 + (((tickAnim - 11) / 3) * (0.425-(0)));
        }
        else if (tickAnim >= 14 && tickAnim < 17) {
            xx = 0 + (((tickAnim - 14) / 3) * (0-(0)));
            yy = 0.33 + (((tickAnim - 14) / 3) * (0.33-(0.33)));
            zz = 0.425 + (((tickAnim - 14) / 3) * (0.425-(0.425)));
        }
        else if (tickAnim >= 17 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 17) / 3) * (0-(0)));
            yy = 0.33 + (((tickAnim - 17) / 3) * (-0.225-(0.33)));
            zz = 0.425 + (((tickAnim - 17) / 3) * (0-(0.425)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.leftLeg3.rotationPointX = this.leftLeg3.rotationPointX + (float)(xx);
        this.leftLeg3.rotationPointY = this.leftLeg3.rotationPointY - (float)(yy);
        this.leftLeg3.rotationPointZ = this.leftLeg3.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 4) {
            xx = 4.70485 + (((tickAnim - 0) / 4) * (6.29-(4.70485)));
            yy = -2.32722 + (((tickAnim - 0) / 4) * (0-(-2.32722)));
            zz = -5.54011 + (((tickAnim - 0) / 4) * (0-(-5.54011)));
        }
        else if (tickAnim >= 4 && tickAnim < 8) {
            xx = 6.29 + (((tickAnim - 4) / 4) * (-14.85-(6.29)));
            yy = 0 + (((tickAnim - 4) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 4) / 4) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 11) {
            xx = -14.85 + (((tickAnim - 8) / 3) * (57.5-(-14.85)));
            yy = 0 + (((tickAnim - 8) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 3) * (0-(0)));
        }
        else if (tickAnim >= 11 && tickAnim < 12) {
            xx = 57.5 + (((tickAnim - 11) / 1) * (96.21-(57.5)));
            yy = 0 + (((tickAnim - 11) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 11) / 1) * (0-(0)));
        }
        else if (tickAnim >= 12 && tickAnim < 14) {
            xx = 96.21 + (((tickAnim - 12) / 2) * (79.32-(96.21)));
            yy = 0 + (((tickAnim - 12) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 12) / 2) * (0-(0)));
        }
        else if (tickAnim >= 14 && tickAnim < 17) {
            xx = 79.32 + (((tickAnim - 14) / 3) * (79.32-(79.32)));
            yy = 0 + (((tickAnim - 14) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 14) / 3) * (0-(0)));
        }
        else if (tickAnim >= 17 && tickAnim < 20) {
            xx = 79.32 + (((tickAnim - 17) / 3) * (4.70485-(79.32)));
            yy = 0 + (((tickAnim - 17) / 3) * (-2.32722-(0)));
            zz = 0 + (((tickAnim - 17) / 3) * (-5.54011-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftLeg4, leftLeg4.rotateAngleX + (float) Math.toRadians(xx), leftLeg4.rotateAngleY + (float) Math.toRadians(yy), leftLeg4.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 3) * (0.425-(0)));
            zz = 0 + (((tickAnim - 0) / 3) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 11) {
            xx = 0 + (((tickAnim - 3) / 8) * (0-(0)));
            yy = 0.425 + (((tickAnim - 3) / 8) * (0-(0.425)));
            zz = 0 + (((tickAnim - 3) / 8) * (0-(0)));
        }
        else if (tickAnim >= 11 && tickAnim < 12) {
            xx = 0 + (((tickAnim - 11) / 1) * (0-(0)));
            yy = 0 + (((tickAnim - 11) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 11) / 1) * (0-(0)));
        }
        else if (tickAnim >= 12 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 12) / 1) * (0-(0)));
            yy = 0 + (((tickAnim - 12) / 1) * (2.11-(0)));
            zz = 0 + (((tickAnim - 12) / 1) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 14) {
            xx = 0 + (((tickAnim - 13) / 1) * (0-(0)));
            yy = 2.11 + (((tickAnim - 13) / 1) * (0.925-(2.11)));
            zz = 0 + (((tickAnim - 13) / 1) * (0-(0)));
        }
        else if (tickAnim >= 14 && tickAnim < 17) {
            xx = 0 + (((tickAnim - 14) / 3) * (0-(0)));
            yy = 0.925 + (((tickAnim - 14) / 3) * (0-(0.925)));
            zz = 0 + (((tickAnim - 14) / 3) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.leftLeg4.rotationPointX = this.leftLeg4.rotationPointX + (float)(xx);
        this.leftLeg4.rotationPointY = this.leftLeg4.rotationPointY - (float)(yy);
        this.leftLeg4.rotationPointZ = this.leftLeg4.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 6) {
            xx = 20.14352 + (((tickAnim - 0) / 6) * (-1.29404-(20.14352)));
            yy = 10.12247 + (((tickAnim - 0) / 6) * (9.21592-(10.12247)));
            zz = 1.62035 + (((tickAnim - 0) / 6) * (2.30052-(1.62035)));
        }
        else if (tickAnim >= 6 && tickAnim < 9) {
            xx = -1.29404 + (((tickAnim - 6) / 3) * (-14.16582-(-1.29404)));
            yy = 9.21592 + (((tickAnim - 6) / 3) * (-2.13063-(9.21592)));
            zz = 2.30052 + (((tickAnim - 6) / 3) * (-4.52436-(2.30052)));
        }
        else if (tickAnim >= 9 && tickAnim < 20) {
            xx = -14.16582 + (((tickAnim - 9) / 11) * (20.14352-(-14.16582)));
            yy = -2.13063 + (((tickAnim - 9) / 11) * (10.12247-(-2.13063)));
            zz = -4.52436 + (((tickAnim - 9) / 11) * (1.62035-(-4.52436)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightLeg, rightLeg.rotateAngleX + (float) Math.toRadians(xx), rightLeg.rotateAngleY + (float) Math.toRadians(yy), rightLeg.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 6) {
            xx = 18.5 + (((tickAnim - 0) / 6) * (-8.93143-(18.5)));
            yy = 0 + (((tickAnim - 0) / 6) * (-3.11568-(0)));
            zz = 0 + (((tickAnim - 0) / 6) * (-7.42041-(0)));
        }
        else if (tickAnim >= 6 && tickAnim < 9) {
            xx = -8.93143 + (((tickAnim - 6) / 3) * (-24.5-(-8.93143)));
            yy = -3.11568 + (((tickAnim - 6) / 3) * (0-(-3.11568)));
            zz = -7.42041 + (((tickAnim - 6) / 3) * (0-(-7.42041)));
        }
        else if (tickAnim >= 9 && tickAnim < 20) {
            xx = -24.5 + (((tickAnim - 9) / 11) * (18.5-(-24.5)));
            yy = 0 + (((tickAnim - 9) / 11) * (0-(0)));
            zz = 0 + (((tickAnim - 9) / 11) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightLeg2, rightLeg2.rotateAngleX + (float) Math.toRadians(xx), rightLeg2.rotateAngleY + (float) Math.toRadians(yy), rightLeg2.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 9) {
            xx = 0 + (((tickAnim - 0) / 9) * (0-(0)));
            yy = 0.075 + (((tickAnim - 0) / 9) * (0.2-(0.075)));
            zz = 0 + (((tickAnim - 0) / 9) * (0-(0)));
        }
        else if (tickAnim >= 9 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 9) / 11) * (0-(0)));
            yy = 0.2 + (((tickAnim - 9) / 11) * (0.075-(0.2)));
            zz = 0 + (((tickAnim - 9) / 11) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.rightLeg2.rotationPointX = this.rightLeg2.rotationPointX + (float)(xx);
        this.rightLeg2.rotationPointY = this.rightLeg2.rotationPointY - (float)(yy);
        this.rightLeg2.rotationPointZ = this.rightLeg2.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 1) {
            xx = 18.5 + (((tickAnim - 0) / 1) * (37.36-(18.5)));
            yy = 0 + (((tickAnim - 0) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 1) * (0-(0)));
        }
        else if (tickAnim >= 1 && tickAnim < 3) {
            xx = 37.36 + (((tickAnim - 1) / 2) * (-55.05-(37.36)));
            yy = 0 + (((tickAnim - 1) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 1) / 2) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 6) {
            xx = -55.05 + (((tickAnim - 3) / 3) * (-55.06553-(-55.05)));
            yy = 0 + (((tickAnim - 3) / 3) * (-4.4825-(0)));
            zz = 0 + (((tickAnim - 3) / 3) * (0.39692-(0)));
        }
        else if (tickAnim >= 6 && tickAnim < 9) {
            xx = -55.06553 + (((tickAnim - 6) / 3) * (33.5-(-55.06553)));
            yy = -4.4825 + (((tickAnim - 6) / 3) * (0-(-4.4825)));
            zz = 0.39692 + (((tickAnim - 6) / 3) * (0-(0.39692)));
        }
        else if (tickAnim >= 9 && tickAnim < 13) {
            xx = 33.5 + (((tickAnim - 9) / 4) * (1.73-(33.5)));
            yy = 0 + (((tickAnim - 9) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 9) / 4) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 20) {
            xx = 1.73 + (((tickAnim - 13) / 7) * (18.5-(1.73)));
            yy = 0 + (((tickAnim - 13) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 13) / 7) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightLeg3, rightLeg3.rotateAngleX + (float) Math.toRadians(xx), rightLeg3.rotateAngleY + (float) Math.toRadians(yy), rightLeg3.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            yy = -0.225 + (((tickAnim - 0) / 3) * (0.305-(-0.225)));
            zz = 0 + (((tickAnim - 0) / 3) * (0.45-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 6) {
            xx = 0 + (((tickAnim - 3) / 3) * (0-(0)));
            yy = 0.305 + (((tickAnim - 3) / 3) * (0.305-(0.305)));
            zz = 0.45 + (((tickAnim - 3) / 3) * (0.45-(0.45)));
        }
        else if (tickAnim >= 6 && tickAnim < 9) {
            xx = 0 + (((tickAnim - 6) / 3) * (0-(0)));
            yy = 0.305 + (((tickAnim - 6) / 3) * (-0.225-(0.305)));
            zz = 0.45 + (((tickAnim - 6) / 3) * (0-(0.45)));
        }
        else if (tickAnim >= 9 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 9) / 11) * (0-(0)));
            yy = -0.225 + (((tickAnim - 9) / 11) * (-0.225-(-0.225)));
            zz = 0 + (((tickAnim - 9) / 11) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.rightLeg3.rotationPointX = this.rightLeg3.rotationPointX + (float)(xx);
        this.rightLeg3.rotationPointY = this.rightLeg3.rotationPointY - (float)(yy);
        this.rightLeg3.rotationPointZ = this.rightLeg3.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 1) {
            xx = 57.5 + (((tickAnim - 0) / 1) * (77.83-(57.5)));
            yy = 0 + (((tickAnim - 0) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 1) * (0-(0)));
        }
        else if (tickAnim >= 1 && tickAnim < 3) {
            xx = 77.83 + (((tickAnim - 1) / 2) * (91.82-(77.83)));
            yy = 0 + (((tickAnim - 1) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 1) / 2) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 6) {
            xx = 91.82 + (((tickAnim - 3) / 3) * (91.82-(91.82)));
            yy = 0 + (((tickAnim - 3) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 3) / 3) * (0-(0)));
        }
        else if (tickAnim >= 6 && tickAnim < 9) {
            xx = 91.82 + (((tickAnim - 6) / 3) * (5.16963-(91.82)));
            yy = 0 + (((tickAnim - 6) / 3) * (-0.17624-(0)));
            zz = 0 + (((tickAnim - 6) / 3) * (5.05836-(0)));
        }
        else if (tickAnim >= 9 && tickAnim < 13) {
            xx = 5.16963 + (((tickAnim - 9) / 4) * (2.79-(5.16963)));
            yy = -0.17624 + (((tickAnim - 9) / 4) * (0-(-0.17624)));
            zz = 5.05836 + (((tickAnim - 9) / 4) * (0-(5.05836)));
        }
        else if (tickAnim >= 13 && tickAnim < 17) {
            xx = 2.79 + (((tickAnim - 13) / 4) * (-18.32-(2.79)));
            yy = 0 + (((tickAnim - 13) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 13) / 4) * (0-(0)));
        }
        else if (tickAnim >= 17 && tickAnim < 20) {
            xx = -18.32 + (((tickAnim - 17) / 3) * (57.5-(-18.32)));
            yy = 0 + (((tickAnim - 17) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 17) / 3) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightLeg4, rightLeg4.rotateAngleX + (float) Math.toRadians(xx), rightLeg4.rotateAngleY + (float) Math.toRadians(yy), rightLeg4.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 2) {
            xx = 0 + (((tickAnim - 0) / 2) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 2) * (2.55-(0)));
            zz = 0 + (((tickAnim - 0) / 2) * (0-(0)));
        }
        else if (tickAnim >= 2 && tickAnim < 3) {
            xx = 0 + (((tickAnim - 2) / 1) * (0-(0)));
            yy = 2.55 + (((tickAnim - 2) / 1) * (0-(2.55)));
            zz = 0 + (((tickAnim - 2) / 1) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 9) {
            xx = 0 + (((tickAnim - 3) / 6) * (0-(0)));
            yy = 0 + (((tickAnim - 3) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 3) / 6) * (0-(0)));
        }
        else if (tickAnim >= 9 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 9) / 4) * (0-(0)));
            yy = 0 + (((tickAnim - 9) / 4) * (0.375-(0)));
            zz = 0 + (((tickAnim - 9) / 4) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 13) / 7) * (0-(0)));
            yy = 0.375 + (((tickAnim - 13) / 7) * (0-(0.375)));
            zz = 0 + (((tickAnim - 13) / 7) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.rightLeg4.rotationPointX = this.rightLeg4.rotationPointX + (float)(xx);
        this.rightLeg4.rotationPointY = this.rightLeg4.rotationPointY - (float)(yy);
        this.rightLeg4.rotationPointZ = this.rightLeg4.rotationPointZ + (float)(zz);
        this.setRotateAngle(body, body.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180/0.25+130))*2), body.rotateAngleY + (float) Math.toRadians(0), body.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180/0.5+120))*3));
        this.setRotateAngle(chest, chest.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180/0.25+200))*2), chest.rotateAngleY + (float) Math.toRadians(0), chest.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180/0.5+190))*3));
        this.setRotateAngle(neck3, neck3.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180/0.25+230))*4), neck3.rotateAngleY + (float) Math.toRadians(0), neck3.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180/0.5+220))*0.5));
        this.setRotateAngle(neck2, neck2.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180/0.25+320))*4), neck2.rotateAngleY + (float) Math.toRadians(0), neck2.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180/0.5+220))*0.1));
        this.setRotateAngle(neck, neck.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180/0.25+370))*4), neck.rotateAngleY + (float) Math.toRadians(0), neck.rotateAngleZ + (float) Math.toRadians(0));
        this.setRotateAngle(head, head.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180/0.25+430))*4), head.rotateAngleY + (float) Math.toRadians(0), head.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180/0.5+250))*0.2));
        this.setRotateAngle(tail, tail.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180/0.25+20))*0.5), tail.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180/0.5-50))*3), tail.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180/0.5+40))*1));
        this.setRotateAngle(tail2, tail2.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180/0.25+20))*0.5), tail2.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180/0.5-120))*7), tail2.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180/0.5+40))*2));
        this.setRotateAngle(tail3, tail3.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180/0.25+30))*0.5), tail3.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180/0.5-200))*10), tail3.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180/0.5+40))*2));
        this.setRotateAngle(tail4, tail4.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180/0.25+80))*-1), tail4.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180/0.5-240))*20), tail4.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180/0.5+40))*2));


    }
    public void animRunning(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime) {
        EntityPrehistoricFloraBerthasaura entity = (EntityPrehistoricFloraBerthasaura) entitylivingbaseIn;
        int animCycle = 12;
        double tickAnim = (entity.ticksExisted + entity.getTickOffset()) - (int) (Math.floor((double) (entity.ticksExisted + entity.getTickOffset()) / (double) animCycle) * (double) animCycle) + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;

        if (tickAnim >= 0 && tickAnim < 5) {
            xx = -15.92403 + (((tickAnim - 0) / 5) * (20.14352-(-15.92403)));
            yy = 2.0243 + (((tickAnim - 0) / 5) * (-10.1225-(2.0243)));
            zz = 4.29795 + (((tickAnim - 0) / 5) * (-1.6203-(4.29795)));
        }
        else if (tickAnim >= 5 && tickAnim < 11) {
            xx = 20.14352 + (((tickAnim - 5) / 6) * (-5.94997-(20.14352)));
            yy = -10.1225 + (((tickAnim - 5) / 6) * (-7.13658-(-10.1225)));
            zz = -1.6203 + (((tickAnim - 5) / 6) * (-1.82297-(-1.6203)));
        }
        else if (tickAnim >= 11 && tickAnim < 13) {
            xx = -5.94997 + (((tickAnim - 11) / 2) * (-15.92403-(-5.94997)));
            yy = -7.13658 + (((tickAnim - 11) / 2) * (2.0243-(-7.13658)));
            zz = -1.82297 + (((tickAnim - 11) / 2) * (4.29795-(-1.82297)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftLeg, leftLeg.rotateAngleX + (float) Math.toRadians(xx), leftLeg.rotateAngleY + (float) Math.toRadians(yy), leftLeg.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 5) {
            xx = -29.25 + (((tickAnim - 0) / 5) * (18.5-(-29.25)));
            yy = 0 + (((tickAnim - 0) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 5) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 13) {
            xx = 18.5 + (((tickAnim - 5) / 8) * (-29.25-(18.5)));
            yy = 0 + (((tickAnim - 5) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 5) / 8) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftLeg2, leftLeg2.rotateAngleX + (float) Math.toRadians(xx), leftLeg2.rotateAngleY + (float) Math.toRadians(yy), leftLeg2.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 0) / 5) * (0-(0)));
            yy = 0.075 + (((tickAnim - 0) / 5) * (0.075-(0.075)));
            zz = 0 + (((tickAnim - 0) / 5) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 5) / 8) * (0-(0)));
            yy = 0.075 + (((tickAnim - 5) / 8) * (0.075-(0.075)));
            zz = 0 + (((tickAnim - 5) / 8) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.leftLeg2.rotationPointX = this.leftLeg2.rotationPointX + (float)(xx);
        this.leftLeg2.rotationPointY = this.leftLeg2.rotationPointY - (float)(yy);
        this.leftLeg2.rotationPointZ = this.leftLeg2.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 1) {
            xx = 33.5 + (((tickAnim - 0) / 1) * (25.75-(33.5)));
            yy = 0 + (((tickAnim - 0) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 1) * (0-(0)));
        }
        else if (tickAnim >= 1 && tickAnim < 5) {
            xx = 25.75 + (((tickAnim - 1) / 4) * (18.5-(25.75)));
            yy = 0 + (((tickAnim - 1) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 1) / 4) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 8) {
            xx = 18.5 + (((tickAnim - 5) / 3) * (-47.98623-(18.5)));
            yy = 0 + (((tickAnim - 5) / 3) * (7.00912-(0)));
            zz = 0 + (((tickAnim - 5) / 3) * (-0.32939-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 11) {
            xx = -47.98623 + (((tickAnim - 8) / 3) * (-46.05472-(-47.98623)));
            yy = 7.00912 + (((tickAnim - 8) / 3) * (6.48473-(7.00912)));
            zz = -0.32939 + (((tickAnim - 8) / 3) * (0.44627-(-0.32939)));
        }
        else if (tickAnim >= 11 && tickAnim < 13) {
            xx = -46.05472 + (((tickAnim - 11) / 2) * (33.5-(-46.05472)));
            yy = 6.48473 + (((tickAnim - 11) / 2) * (0-(6.48473)));
            zz = 0.44627 + (((tickAnim - 11) / 2) * (0-(0.44627)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftLeg3, leftLeg3.rotateAngleX + (float) Math.toRadians(xx), leftLeg3.rotateAngleY + (float) Math.toRadians(yy), leftLeg3.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 0) / 5) * (0-(0)));
            yy = -0.475 + (((tickAnim - 0) / 5) * (-0.225-(-0.475)));
            zz = 0 + (((tickAnim - 0) / 5) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 5) / 3) * (0-(0)));
            yy = -0.225 + (((tickAnim - 5) / 3) * (0.255-(-0.225)));
            zz = 0 + (((tickAnim - 5) / 3) * (0.475-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 8) / 5) * (0-(0)));
            yy = 0.255 + (((tickAnim - 8) / 5) * (-0.475-(0.255)));
            zz = 0.475 + (((tickAnim - 8) / 5) * (0-(0.475)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.leftLeg3.rotationPointX = this.leftLeg3.rotationPointX + (float)(xx);
        this.leftLeg3.rotationPointY = this.leftLeg3.rotationPointY - (float)(yy);
        this.leftLeg3.rotationPointZ = this.leftLeg3.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 1) {
            xx = 12.70485 + (((tickAnim - 0) / 1) * (-1.74596-(12.70485)));
            yy = -2.32722 + (((tickAnim - 0) / 1) * (-1.93935-(-2.32722)));
            zz = -5.54011 + (((tickAnim - 0) / 1) * (-4.61676-(-5.54011)));
        }
        else if (tickAnim >= 1 && tickAnim < 3) {
            xx = -1.74596 + (((tickAnim - 1) / 2) * (-22.79758-(-1.74596)));
            yy = -1.93935 + (((tickAnim - 1) / 2) * (-1.16361-(-1.93935)));
            zz = -4.61676 + (((tickAnim - 1) / 2) * (-2.77005-(-4.61676)));
        }
        else if (tickAnim >= 3 && tickAnim < 4) {
            xx = -22.79758 + (((tickAnim - 3) / 1) * (-11.76586-(-22.79758)));
            yy = -1.16361 + (((tickAnim - 3) / 1) * (-0.38787-(-1.16361)));
            zz = -2.77005 + (((tickAnim - 3) / 1) * (-0.92335-(-2.77005)));
        }
        else if (tickAnim >= 4 && tickAnim < 5) {
            xx = -11.76586 + (((tickAnim - 4) / 1) * (57.5-(-11.76586)));
            yy = -0.38787 + (((tickAnim - 4) / 1) * (0-(-0.38787)));
            zz = -0.92335 + (((tickAnim - 4) / 1) * (0-(-0.92335)));
        }
        else if (tickAnim >= 5 && tickAnim < 8) {
            xx = 57.5 + (((tickAnim - 5) / 3) * (88.18-(57.5)));
            yy = 0 + (((tickAnim - 5) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 5) / 3) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 11) {
            xx = 88.18 + (((tickAnim - 8) / 3) * (98.75-(88.18)));
            yy = 0 + (((tickAnim - 8) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 3) * (0-(0)));
        }
        else if (tickAnim >= 11 && tickAnim < 13) {
            xx = 98.75 + (((tickAnim - 11) / 2) * (12.70485-(98.75)));
            yy = 0 + (((tickAnim - 11) / 2) * (-2.32722-(0)));
            zz = 0 + (((tickAnim - 11) / 2) * (-5.54011-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftLeg4, leftLeg4.rotateAngleX + (float) Math.toRadians(xx), leftLeg4.rotateAngleY + (float) Math.toRadians(yy), leftLeg4.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 3) * (0.65-(0)));
            zz = 0 + (((tickAnim - 0) / 3) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 3) / 2) * (0-(0)));
            yy = 0.65 + (((tickAnim - 3) / 2) * (0-(0.65)));
            zz = 0 + (((tickAnim - 3) / 2) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 5) / 8) * (0-(0)));
            yy = 0 + (((tickAnim - 5) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 5) / 8) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.leftLeg4.rotationPointX = this.leftLeg4.rotationPointX + (float)(xx);
        this.leftLeg4.rotationPointY = this.leftLeg4.rotationPointY - (float)(yy);
        this.leftLeg4.rotationPointZ = this.leftLeg4.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 4) {
            xx = 27.39352 + (((tickAnim - 0) / 4) * (-2.13686-(27.39352)));
            yy = 10.12247 + (((tickAnim - 0) / 4) * (2.53285-(10.12247)));
            zz = 1.62035 + (((tickAnim - 0) / 4) * (2.01985-(1.62035)));
        }
        else if (tickAnim >= 4 && tickAnim < 6) {
            xx = -2.13686 + (((tickAnim - 4) / 2) * (-14.17403-(-2.13686)));
            yy = 2.53285 + (((tickAnim - 4) / 2) * (-2.0243-(2.53285)));
            zz = 2.01985 + (((tickAnim - 4) / 2) * (-4.298-(2.01985)));
        }
        else if (tickAnim >= 6 && tickAnim < 13) {
            xx = -14.17403 + (((tickAnim - 6) / 7) * (27.39352-(-14.17403)));
            yy = -2.0243 + (((tickAnim - 6) / 7) * (10.12247-(-2.0243)));
            zz = -4.298 + (((tickAnim - 6) / 7) * (1.62035-(-4.298)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightLeg, rightLeg.rotateAngleX + (float) Math.toRadians(xx), rightLeg.rotateAngleY + (float) Math.toRadians(yy), rightLeg.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 2) {
            xx = 32 + (((tickAnim - 0) / 2) * (33.86-(32)));
            yy = 0 + (((tickAnim - 0) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 2) * (0-(0)));
        }
        else if (tickAnim >= 2 && tickAnim < 6) {
            xx = 33.86 + (((tickAnim - 2) / 4) * (-24.5-(33.86)));
            yy = 0 + (((tickAnim - 2) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 2) / 4) * (0-(0)));
        }
        else if (tickAnim >= 6 && tickAnim < 13) {
            xx = -24.5 + (((tickAnim - 6) / 7) * (32-(-24.5)));
            yy = 0 + (((tickAnim - 6) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 6) / 7) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightLeg2, rightLeg2.rotateAngleX + (float) Math.toRadians(xx), rightLeg2.rotateAngleY + (float) Math.toRadians(yy), rightLeg2.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 6) {
            xx = 0 + (((tickAnim - 0) / 6) * (0-(0)));
            yy = 0.075 + (((tickAnim - 0) / 6) * (0.2-(0.075)));
            zz = 0 + (((tickAnim - 0) / 6) * (0-(0)));
        }
        else if (tickAnim >= 6 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 6) / 7) * (0-(0)));
            yy = 0.2 + (((tickAnim - 6) / 7) * (0.075-(0.2)));
            zz = 0 + (((tickAnim - 6) / 7) * (0-(0)));
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
            xx = 18.5 + (((tickAnim - 0) / 2) * (-34.21-(18.5)));
            yy = 0 + (((tickAnim - 0) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 2) * (0-(0)));
        }
        else if (tickAnim >= 2 && tickAnim < 3) {
            xx = -34.21 + (((tickAnim - 2) / 1) * (-56.63-(-34.21)));
            yy = 0 + (((tickAnim - 2) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 2) / 1) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 4) {
            xx = -56.63 + (((tickAnim - 3) / 1) * (-50.84-(-56.63)));
            yy = 0 + (((tickAnim - 3) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 3) / 1) * (0-(0)));
        }
        else if (tickAnim >= 4 && tickAnim < 6) {
            xx = -50.84 + (((tickAnim - 4) / 2) * (33.5-(-50.84)));
            yy = 0 + (((tickAnim - 4) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 4) / 2) * (0-(0)));
        }
        else if (tickAnim >= 6 && tickAnim < 8) {
            xx = 33.5 + (((tickAnim - 6) / 2) * (6.38-(33.5)));
            yy = 0 + (((tickAnim - 6) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 6) / 2) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 13) {
            xx = 6.38 + (((tickAnim - 8) / 5) * (18.5-(6.38)));
            yy = 0 + (((tickAnim - 8) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 5) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightLeg3, rightLeg3.rotateAngleX + (float) Math.toRadians(xx), rightLeg3.rotateAngleY + (float) Math.toRadians(yy), rightLeg3.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 2) {
            xx = 0 + (((tickAnim - 0) / 2) * (0-(0)));
            yy = -0.225 + (((tickAnim - 0) / 2) * (0.28-(-0.225)));
            zz = 0 + (((tickAnim - 0) / 2) * (0.325-(0)));
        }
        else if (tickAnim >= 2 && tickAnim < 6) {
            xx = 0 + (((tickAnim - 2) / 4) * (0-(0)));
            yy = 0.28 + (((tickAnim - 2) / 4) * (-0.225-(0.28)));
            zz = 0.325 + (((tickAnim - 2) / 4) * (0-(0.325)));
        }
        else if (tickAnim >= 6 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 6) / 7) * (0-(0)));
            yy = -0.225 + (((tickAnim - 6) / 7) * (-0.225-(-0.225)));
            zz = 0 + (((tickAnim - 6) / 7) * (0-(0)));
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
            xx = 73 + (((tickAnim - 0) / 2) * (91.16567-(73)));
            yy = 0 + (((tickAnim - 0) / 2) * (-0.66492-(0)));
            zz = 0 + (((tickAnim - 0) / 2) * (-1.58289-(0)));
        }
        else if (tickAnim >= 2 && tickAnim < 3) {
            xx = 91.16567 + (((tickAnim - 2) / 1) * (93.83134-(91.16567)));
            yy = -0.66492 + (((tickAnim - 2) / 1) * (-1.32984-(-0.66492)));
            zz = -1.58289 + (((tickAnim - 2) / 1) * (-3.16578-(-1.58289)));
        }
        else if (tickAnim >= 3 && tickAnim < 4) {
            xx = 93.83134 + (((tickAnim - 3) / 1) * (81.87251-(93.83134)));
            yy = -1.32984 + (((tickAnim - 3) / 1) * (-1.6623-(-1.32984)));
            zz = -3.16578 + (((tickAnim - 3) / 1) * (-3.95722-(-3.16578)));
        }
        else if (tickAnim >= 4 && tickAnim < 6) {
            xx = 81.87251 + (((tickAnim - 4) / 2) * (4.70485-(81.87251)));
            yy = -1.6623 + (((tickAnim - 4) / 2) * (2.3272-(-1.6623)));
            zz = -3.95722 + (((tickAnim - 4) / 2) * (5.5401-(-3.95722)));
        }
        else if (tickAnim >= 6 && tickAnim < 8) {
            xx = 4.70485 + (((tickAnim - 6) / 2) * (-8.24697-(4.70485)));
            yy = 2.3272 + (((tickAnim - 6) / 2) * (-1.45451-(2.3272)));
            zz = 5.5401 + (((tickAnim - 6) / 2) * (-3.46257-(5.5401)));
        }
        else if (tickAnim >= 8 && tickAnim < 11) {
            xx = -8.24697 + (((tickAnim - 8) / 3) * (-10.39879-(-8.24697)));
            yy = -1.45451 + (((tickAnim - 8) / 3) * (-0.58181-(-1.45451)));
            zz = -3.46257 + (((tickAnim - 8) / 3) * (-1.38503-(-3.46257)));
        }
        else if (tickAnim >= 11 && tickAnim < 13) {
            xx = -10.39879 + (((tickAnim - 11) / 2) * (73-(-10.39879)));
            yy = -0.58181 + (((tickAnim - 11) / 2) * (0-(-0.58181)));
            zz = -1.38503 + (((tickAnim - 11) / 2) * (0-(-1.38503)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightLeg4, rightLeg4.rotateAngleX + (float) Math.toRadians(xx), rightLeg4.rotateAngleY + (float) Math.toRadians(yy), rightLeg4.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 6) {
            xx = 0 + (((tickAnim - 0) / 6) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 6) * (0-(0)));
        }
        else if (tickAnim >= 6 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 6) / 2) * (0-(0)));
            yy = 0 + (((tickAnim - 6) / 2) * (0.425-(0)));
            zz = 0 + (((tickAnim - 6) / 2) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 11) {
            xx = 0 + (((tickAnim - 8) / 3) * (0-(0)));
            yy = 0.425 + (((tickAnim - 8) / 3) * (0-(0.425)));
            zz = 0 + (((tickAnim - 8) / 3) * (0-(0)));
        }
        else if (tickAnim >= 11 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 11) / 2) * (0-(0)));
            yy = 0 + (((tickAnim - 11) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 11) / 2) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.rightLeg4.rotationPointX = this.rightLeg4.rotationPointX + (float)(xx);
        this.rightLeg4.rotationPointY = this.rightLeg4.rotationPointY - (float)(yy);
        this.rightLeg4.rotationPointZ = this.rightLeg4.rotationPointZ + (float)(zz);
        this.setRotateAngle(hips, hips.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*260/0.225+50))*4), hips.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*260/0.45+20))*4), hips.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*260/0.45))*5));
        this.hips.rotationPointX = this.hips.rotationPointX + (float)(0);
        this.hips.rotationPointY = this.hips.rotationPointY - (float)(0.375+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*580/0.503-20))*-0.5);
        this.hips.rotationPointZ = this.hips.rotationPointZ + (float)(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*580/0.503-20))*0.7);
        this.setRotateAngle(body, body.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*260/0.225-60))*4), body.rotateAngleY + (float) Math.toRadians(0), body.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*260/0.45-90))*8));
        this.setRotateAngle(chest, chest.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*260/0.225-150))*5), chest.rotateAngleY + (float) Math.toRadians(0), chest.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*260/0.45-220))*2));
        this.setRotateAngle(neck3, neck3.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*260/0.225-190))*5), neck3.rotateAngleY + (float) Math.toRadians(0), neck3.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*260/0.45-380))*2));
        this.setRotateAngle(neck2, neck2.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*260/0.225-260))*5), neck2.rotateAngleY + (float) Math.toRadians(0), neck2.rotateAngleZ + (float) Math.toRadians(0));
        this.setRotateAngle(neck, neck.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*260/0.225-340))*5), neck.rotateAngleY + (float) Math.toRadians(0), neck.rotateAngleZ + (float) Math.toRadians(0));
        this.setRotateAngle(head, head.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*260/0.225-390))*5), head.rotateAngleY + (float) Math.toRadians(0), head.rotateAngleZ + (float) Math.toRadians(0));
        this.setRotateAngle(tail, tail.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*260/0.225+80))*1), tail.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*260/0.45+80))*-4), tail.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*260/0.45))*5));
        this.setRotateAngle(tail2, tail2.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*260/0.225+90))*1), tail2.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*260/0.45+120))*-7), tail2.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*260/0.45))*5));
        this.setRotateAngle(tail3, tail3.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*260/0.225+170))*-3), tail3.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*260/0.45+200))*10), tail3.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*260/0.45))*5));
        this.setRotateAngle(tail4, tail4.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*260/0.225+200))*-7), tail4.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*260/0.45+220))*10), tail4.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*260/0.45))*5));


    }



        public void animate(IAnimatedEntity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        EntityPrehistoricFloraBerthasaura e = (EntityPrehistoricFloraBerthasaura) entity;
        animator.update(entity);


    }
}
