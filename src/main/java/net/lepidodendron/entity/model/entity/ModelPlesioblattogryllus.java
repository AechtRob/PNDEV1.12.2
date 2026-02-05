package net.lepidodendron.entity.model.entity;

import net.ilexiconn.llibrary.client.model.ModelAnimator;
import net.ilexiconn.llibrary.client.model.tools.AdvancedModelRenderer;
import net.ilexiconn.llibrary.server.animation.IAnimatedEntity;
import net.lepidodendron.entity.EntityPrehistoricFloraPlesioblattogryllus;
import net.lepidodendron.entity.base.EntityPrehistoricFloraLandClimbingGlidingBase;
import net.lepidodendron.entity.model.ModelBasePalaeopedia;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.util.EnumFacing;

public class ModelPlesioblattogryllus extends ModelBasePalaeopedia {
    private final AdvancedModelRenderer root;
    private final AdvancedModelRenderer abdomen;
    private final AdvancedModelRenderer cube_r1;
    private final AdvancedModelRenderer leftCercus;
    private final AdvancedModelRenderer cube_r2;
    private final AdvancedModelRenderer rightCercus;
    private final AdvancedModelRenderer cube_r3;
    private final AdvancedModelRenderer thorax;
    private final AdvancedModelRenderer rightLeg2;
    private final AdvancedModelRenderer cube_r4;
    private final AdvancedModelRenderer rightLeg3;
    private final AdvancedModelRenderer cube_r5;
    private final AdvancedModelRenderer leftLeg3;
    private final AdvancedModelRenderer cube_r6;
    private final AdvancedModelRenderer leftLeg2;
    private final AdvancedModelRenderer cube_r7;
    private final AdvancedModelRenderer rightHindwing;
    private final AdvancedModelRenderer rightHindwing2;
    private final AdvancedModelRenderer leftForewing;
    private final AdvancedModelRenderer cube_r8;
    private final AdvancedModelRenderer leftHindwing;
    private final AdvancedModelRenderer leftHindwing2;
    private final AdvancedModelRenderer rightForewing;
    private final AdvancedModelRenderer cube_r9;
    private final AdvancedModelRenderer prothroax;
    private final AdvancedModelRenderer cube_r10;
    private final AdvancedModelRenderer leftLeg1;
    private final AdvancedModelRenderer cube_r11;
    private final AdvancedModelRenderer rightLeg1;
    private final AdvancedModelRenderer cube_r12;
    private final AdvancedModelRenderer head;
    private final AdvancedModelRenderer cube_r13;
    private final AdvancedModelRenderer cube_r14;
    private final AdvancedModelRenderer rightAntenna;
    private final AdvancedModelRenderer cube_r15;
    private final AdvancedModelRenderer leftAntenna;
    private final AdvancedModelRenderer cube_r16;

    private ModelAnimator animator;

    public ModelPlesioblattogryllus() {
        this.textureWidth = 42;
        this.textureHeight = 39;

        this.root = new AdvancedModelRenderer(this);
        this.root.setRotationPoint(0.0F, 21.5F, -0.2F);


        this.abdomen = new AdvancedModelRenderer(this);
        this.abdomen.setRotationPoint(-1.0F, -0.5567F, 2.0383F);
        this.root.addChild(abdomen);
        this.setRotateAngle(abdomen, -0.0218F, 0.0F, 0.0F);
        this.abdomen.cubeList.add(new ModelBox(abdomen, 23, 27, 0.0F, -0.0502F, -0.1153F, 2, 1, 4, 0.0F, false));
        this.abdomen.cubeList.add(new ModelBox(abdomen, 0, 29, 0.0F, 0.6498F, -0.1153F, 2, 1, 4, -0.01F, false));
        this.abdomen.cubeList.add(new ModelBox(abdomen, 36, 36, 0.5F, -0.0502F, 3.8597F, 1, 1, 1, 0.0F, false));
        this.abdomen.cubeList.add(new ModelBox(abdomen, 31, 36, 0.5F, 0.3998F, 3.8597F, 1, 1, 1, -0.01F, false));

        this.cube_r1 = new AdvancedModelRenderer(this);
        this.cube_r1.setRotationPoint(-1.0F, 0.7248F, 5.2847F);
        this.abdomen.addChild(cube_r1);
        this.setRotateAngle(cube_r1, 0.2618F, 0.0F, 0.0F);
        this.cube_r1.cubeList.add(new ModelBox(cube_r1, 0, 35, 2.0F, -0.5F, -0.6F, 0, 1, 2, 0.0F, false));

        this.leftCercus = new AdvancedModelRenderer(this);
        this.leftCercus.setRotationPoint(1.654F, 0.2147F, 3.9821F);
        this.abdomen.addChild(leftCercus);
        this.setRotateAngle(leftCercus, 0.0F, -0.0524F, 0.637F);


        this.cube_r2 = new AdvancedModelRenderer(this);
        this.cube_r2.setRotationPoint(-0.129F, 0.0139F, 0.2093F);
        this.leftCercus.addChild(cube_r2);
        this.setRotateAngle(cube_r2, -0.122F, 0.1883F, -0.4889F);
        this.cube_r2.cubeList.add(new ModelBox(cube_r2, 0, 22, -0.5F, 0.0F, -0.1F, 5, 0, 6, 0.0F, true));

        this.rightCercus = new AdvancedModelRenderer(this);
        this.rightCercus.setRotationPoint(0.346F, 0.2147F, 3.9821F);
        this.abdomen.addChild(rightCercus);
        this.setRotateAngle(rightCercus, 0.0F, 0.0524F, -0.637F);


        this.cube_r3 = new AdvancedModelRenderer(this);
        this.cube_r3.setRotationPoint(0.129F, 0.0139F, 0.2093F);
        this.rightCercus.addChild(cube_r3);
        this.setRotateAngle(cube_r3, -0.122F, -0.1883F, 0.4889F);
        this.cube_r3.cubeList.add(new ModelBox(cube_r3, 0, 22, -4.5F, 0.0F, -0.1F, 5, 0, 6, 0.0F, false));

        this.thorax = new AdvancedModelRenderer(this);
        this.thorax.setRotationPoint(-0.5F, -0.4298F, 2.0225F);
        this.root.addChild(thorax);
        this.setRotateAngle(thorax, -0.0349F, 0.0F, 0.0F);
        this.thorax.cubeList.add(new ModelBox(thorax, 31, 33, -0.5F, -0.2004F, -4.0244F, 2, 1, 1, 0.0F, false));
        this.thorax.cubeList.add(new ModelBox(thorax, 25, 17, -1.0F, -0.2004F, -3.0244F, 3, 1, 3, 0.0F, false));
        this.thorax.cubeList.add(new ModelBox(thorax, 29, 0, -1.0F, 0.2996F, -3.0244F, 3, 1, 3, -0.01F, false));

        this.rightLeg2 = new AdvancedModelRenderer(this);
        this.rightLeg2.setRotationPoint(-0.125F, 1.9535F, -2.5593F);
        this.thorax.addChild(rightLeg2);
        this.setRotateAngle(rightLeg2, 0.0F, -0.5236F, 0.0F);


        this.cube_r4 = new AdvancedModelRenderer(this);
        this.cube_r4.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.rightLeg2.addChild(cube_r4);
        this.setRotateAngle(cube_r4, 0.0305F, 0.829F, 0.0F);
        this.cube_r4.cubeList.add(new ModelBox(cube_r4, 29, 5, -5.0F, -2.0F, 0.0F, 5, 3, 0, 0.0F, false));

        this.rightLeg3 = new AdvancedModelRenderer(this);
        this.rightLeg3.setRotationPoint(-0.1979F, 0.7798F, -0.9983F);
        this.thorax.addChild(rightLeg3);
        this.setRotateAngle(rightLeg3, 0.0F, -0.48F, 0.0F);


        this.cube_r5 = new AdvancedModelRenderer(this);
        this.cube_r5.setRotationPoint(0.0F, 0.8F, -0.5F);
        this.rightLeg3.addChild(cube_r5);
        this.setRotateAngle(cube_r5, 0.0599F, 1.2211F, 0.0637F);
        this.cube_r5.cubeList.add(new ModelBox(cube_r5, 23, 22, -6.9994F, -2.6249F, -0.0084F, 7, 4, 0, 0.0F, false));

        this.leftLeg3 = new AdvancedModelRenderer(this);
        this.leftLeg3.setRotationPoint(1.1979F, 0.7798F, -0.9983F);
        this.thorax.addChild(leftLeg3);
        this.setRotateAngle(leftLeg3, 0.0F, 0.48F, 0.0F);


        this.cube_r6 = new AdvancedModelRenderer(this);
        this.cube_r6.setRotationPoint(0.0F, 0.8F, -0.5F);
        this.leftLeg3.addChild(cube_r6);
        this.setRotateAngle(cube_r6, 0.0599F, -1.2211F, -0.0637F);
        this.cube_r6.cubeList.add(new ModelBox(cube_r6, 23, 22, -0.0006F, -2.6249F, -0.0084F, 7, 4, 0, 0.0F, true));

        this.leftLeg2 = new AdvancedModelRenderer(this);
        this.leftLeg2.setRotationPoint(1.125F, 1.9535F, -2.5593F);
        this.thorax.addChild(leftLeg2);
        this.setRotateAngle(leftLeg2, 0.0F, 0.5236F, 0.0F);


        this.cube_r7 = new AdvancedModelRenderer(this);
        this.cube_r7.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.leftLeg2.addChild(cube_r7);
        this.setRotateAngle(cube_r7, 0.0305F, -0.829F, 0.0F);
        this.cube_r7.cubeList.add(new ModelBox(cube_r7, 29, 5, 0.0F, -2.0F, 0.0F, 5, 3, 0, 0.0F, true));

        this.rightHindwing = new AdvancedModelRenderer(this);
        this.rightHindwing.setRotationPoint(-0.8742F, -0.1664F, -1.2567F);
        this.thorax.addChild(rightHindwing);
        this.setRotateAngle(rightHindwing, 0.0307F, -0.144F, -0.0017F);
        this.rightHindwing.cubeList.add(new ModelBox(rightHindwing, 0, 12, -0.1702F, -0.0604F, -0.36F, 3, 0, 9, 0.0F, false));

        this.rightHindwing2 = new AdvancedModelRenderer(this);
        this.rightHindwing2.setRotationPoint(2.8327F, -0.0739F, 2.7349F);
        this.rightHindwing.addChild(rightHindwing2);
        this.setRotateAngle(rightHindwing2, 0.0F, 0.0F, 3.1416F);
        this.rightHindwing2.cubeList.add(new ModelBox(rightHindwing2, 8, 13, 0.0001F, -0.0003F, -4.0119F, 1, 0, 8, 0.0F, false));

        this.leftForewing = new AdvancedModelRenderer(this);
        this.leftForewing.setRotationPoint(1.6999F, -0.1553F, -3.249F);
        this.thorax.addChild(leftForewing);
        this.setRotateAngle(leftForewing, 0.0305F, 0.0873F, 0.0F);


        this.cube_r8 = new AdvancedModelRenderer(this);
        this.cube_r8.setRotationPoint(-1.3298F, 0.0996F, 0.64F);
        this.leftForewing.addChild(cube_r8);
        this.setRotateAngle(cube_r8, 0.0F, 0.0349F, 0.0F);
        this.cube_r8.cubeList.add(new ModelBox(cube_r8, 0, 0, -1.5F, -0.21F, -1.0F, 3, 0, 11, 0.0F, true));

        this.leftHindwing = new AdvancedModelRenderer(this);
        this.leftHindwing.setRotationPoint(1.8742F, -0.1914F, -1.2567F);
        this.thorax.addChild(leftHindwing);
        this.setRotateAngle(leftHindwing, 0.0307F, 0.144F, 0.0017F);
        this.leftHindwing.cubeList.add(new ModelBox(leftHindwing, 0, 12, -2.8298F, -0.0604F, -0.36F, 3, 0, 9, 0.0F, true));

        this.leftHindwing2 = new AdvancedModelRenderer(this);
        this.leftHindwing2.setRotationPoint(-2.8327F, -0.0739F, 2.7349F);
        this.leftHindwing.addChild(leftHindwing2);
        this.setRotateAngle(leftHindwing2, 0.0F, 0.0F, -3.1416F);
        this.leftHindwing2.cubeList.add(new ModelBox(leftHindwing2, 8, 13, -1.0001F, -0.0003F, -4.0119F, 1, 0, 8, 0.0F, true));

        this.rightForewing = new AdvancedModelRenderer(this);
        this.rightForewing.setRotationPoint(-0.7F, -0.1303F, -3.2482F);
        this.thorax.addChild(rightForewing);
        this.setRotateAngle(rightForewing, 0.0305F, -0.0873F, 0.0F);


        this.cube_r9 = new AdvancedModelRenderer(this);
        this.cube_r9.setRotationPoint(1.3298F, 0.0996F, 0.64F);
        this.rightForewing.addChild(cube_r9);
        this.setRotateAngle(cube_r9, 0.0F, -0.0349F, 0.0F);
        this.cube_r9.cubeList.add(new ModelBox(cube_r9, 0, 0, -1.5F, -0.21F, -1.0F, 3, 0, 11, 0.0F, false));

        this.prothroax = new AdvancedModelRenderer(this);
        this.prothroax.setRotationPoint(0.5F, -0.275F, -3.025F);
        this.thorax.addChild(prothroax);
        this.setRotateAngle(prothroax, 0.0873F, 0.0F, 0.0F);
        this.prothroax.cubeList.add(new ModelBox(prothroax, 29, 9, -1.3F, -0.0254F, -1.9994F, 2, 1, 1, 0.0F, false));
        this.prothroax.cubeList.add(new ModelBox(prothroax, 5, 35, 0.3F, -0.0254F, -1.9994F, 1, 1, 1, -0.01F, false));

        this.cube_r10 = new AdvancedModelRenderer(this);
        this.cube_r10.setRotationPoint(-0.5F, 0.9746F, -0.3994F);
        this.prothroax.addChild(cube_r10);
        this.setRotateAngle(cube_r10, -0.2182F, 0.0F, 0.0F);
        this.cube_r10.cubeList.add(new ModelBox(cube_r10, 24, 33, 0.0F, -0.525F, -1.6F, 1, 1, 2, 0.0F, false));

        this.leftLeg1 = new AdvancedModelRenderer(this);
        this.leftLeg1.setRotationPoint(0.9F, 1.092F, -1.0458F);
        this.prothroax.addChild(leftLeg1);
        this.setRotateAngle(leftLeg1, 0.0F, 0.2182F, 0.0F);


        this.cube_r11 = new AdvancedModelRenderer(this);
        this.cube_r11.setRotationPoint(-0.3F, 0.7F, 0.5F);
        this.leftLeg1.addChild(cube_r11);
        this.setRotateAngle(cube_r11, -0.0416F, 0.8719F, -0.0543F);
        this.cube_r11.cubeList.add(new ModelBox(cube_r11, 13, 33, 0.1695F, -1.5249F, 0.0054F, 5, 3, 0, 0.0F, true));

        this.rightLeg1 = new AdvancedModelRenderer(this);
        this.rightLeg1.setRotationPoint(-0.9F, 1.092F, -1.0458F);
        this.prothroax.addChild(rightLeg1);
        this.setRotateAngle(rightLeg1, 0.0F, -0.2182F, 0.0F);


        this.cube_r12 = new AdvancedModelRenderer(this);
        this.cube_r12.setRotationPoint(0.3F, 0.7F, 0.5F);
        this.rightLeg1.addChild(cube_r12);
        this.setRotateAngle(cube_r12, -0.0416F, -0.8719F, 0.0543F);
        this.cube_r12.cubeList.add(new ModelBox(cube_r12, 13, 33, -5.1695F, -1.5249F, 0.0054F, 5, 3, 0, 0.0F, false));

        this.head = new AdvancedModelRenderer(this);
        this.head.setRotationPoint(0.3F, 0.125F, -1.975F);
        this.prothroax.addChild(head);
        this.setRotateAngle(head, 0.3316F, 0.0F, 0.0F);
        this.head.cubeList.add(new ModelBox(head, 13, 29, -1.3F, -0.1004F, -1.9244F, 2, 1, 2, 0.0F, false));
        this.head.cubeList.add(new ModelBox(head, 10, 37, -0.8F, -0.1052F, -2.5244F, 1, 0, 1, 0.0F, false));
        this.head.cubeList.add(new ModelBox(head, 36, 9, 0.0F, -0.2004F, -1.7244F, 1, 1, 1, 0.0F, false));
        this.head.cubeList.add(new ModelBox(head, 36, 9, -1.6F, -0.2004F, -1.7244F, 1, 1, 1, 0.0F, true));

        this.cube_r13 = new AdvancedModelRenderer(this);
        this.cube_r13.setRotationPoint(-1.3F, 0.3996F, -1.9244F);
        this.head.addChild(cube_r13);
        this.setRotateAngle(cube_r13, 0.0F, -0.48F, 0.0F);
        this.cube_r13.cubeList.add(new ModelBox(cube_r13, 36, 30, 0.0F, -0.5F, -1.0F, 1, 1, 1, -0.01F, false));

        this.cube_r14 = new AdvancedModelRenderer(this);
        this.cube_r14.setRotationPoint(0.7F, 0.3996F, -1.9244F);
        this.head.addChild(cube_r14);
        this.setRotateAngle(cube_r14, 0.0F, 0.48F, 0.0F);
        this.cube_r14.cubeList.add(new ModelBox(cube_r14, 36, 27, -1.0F, -0.5F, -1.0F, 1, 1, 1, -0.015F, false));

        this.rightAntenna = new AdvancedModelRenderer(this);
        this.rightAntenna.setRotationPoint(-1.0507F, -0.002F, -1.8416F);
        this.head.addChild(rightAntenna);
        this.setRotateAngle(rightAntenna, -0.2461F, 0.1407F, 0.2648F);


        this.cube_r15 = new AdvancedModelRenderer(this);
        this.cube_r15.setRotationPoint(0.3F, 0.1F, 0.7F);
        this.rightAntenna.addChild(cube_r15);
        this.setRotateAngle(cube_r15, 0.0436F, 0.0F, -0.1745F);
        this.cube_r15.cubeList.add(new ModelBox(cube_r15, 25, 12, -2.8F, -0.3F, -4.6F, 3, 0, 4, 0.0F, true));

        this.leftAntenna = new AdvancedModelRenderer(this);
        this.leftAntenna.setRotationPoint(0.4507F, -0.002F, -1.8416F);
        this.head.addChild(leftAntenna);
        this.setRotateAngle(leftAntenna, -0.2461F, -0.1407F, -0.2648F);


        this.cube_r16 = new AdvancedModelRenderer(this);
        this.cube_r16.setRotationPoint(-0.3F, 0.1F, 0.7F);
        this.leftAntenna.addChild(cube_r16);
        this.setRotateAngle(cube_r16, 0.0436F, 0.0F, 0.1745F);
        this.cube_r16.cubeList.add(new ModelBox(cube_r16, 25, 12, -0.2F, -0.3F, -4.6F, 3, 0, 4, 0.0F, false));

        updateDefaultPose();
        animator = ModelAnimator.create();
    }

    @Override
    public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        animate((IAnimatedEntity) entity, f, f1, f2, f3, f4, f5);
        this.root.render(f5);
    }

    public void setRotateAngle(ModelRenderer modelRenderer, float x, float y, float z) {
        modelRenderer.rotateAngleX = x;
        modelRenderer.rotateAngleY = y;
        modelRenderer.rotateAngleZ = z;
    }

    public void renderStaticWall(float f) {
        this.setRotateAngle(root, 0.0F, 0.0F, 0.0F);
        this.root.render(0.01F);
        resetToDefaultPose();
    }

    public void renderStaticFloor(float f) {
        this.root.render(0.01F);
        resetToDefaultPose();
    }

    public void renderStaticDisplayCase(float f) {
        this.root.render(0.01f);
        resetToDefaultPose();

    }

    @Override
    public void renderStaticBook(float f) {
        //Rotations, positions and sizing:
        this.root.offsetY = 0.0F;
        this.root.offsetX = 0.0F;
        this.root.offsetZ = 2.0F;
        this.root.rotateAngleY = (float)Math.toRadians(120);
        this.root.rotateAngleX = (float)Math.toRadians(0);
        this.root.rotateAngleZ = (float)Math.toRadians(0);
        this.root.scaleChildren = true;
        float scaler = 3.0F;
        this.root.setScale(scaler, scaler, scaler);
        //Start of pose:
        this.setRotateAngle(root, 0.6F, 3.8F, -0.2F);
        //End of pose, now render the model:
        this.root.render(f);
        //Reset rotations, positions and sizing:
        this.root.setScale(1.0F, 1.0F, 1.0F);
        this.root.scaleChildren = false;
        resetToDefaultPose();

    }

    @Override
    public void setRotationAngles(float f, float f1, float f2, float f3, float f4, float f5, Entity e) {
        super.setRotationAngles(f, f1, f2, f3, f4, f5, e);

        EntityPrehistoricFloraPlesioblattogryllus ee = (EntityPrehistoricFloraPlesioblattogryllus) e;
        AdvancedModelRenderer[] Neck = {this.head};

        if (ee.getAnimation() != ee.LAY_ANIMATION && (!ee.getIsFlying()) && (!ee.getIsClimbing()) && (!ee.getIsFast())) {
            //Just bob the tail and neck a little bit
            this.chainSwing(Neck, 0.1F, 0.04F, 0.5, f2, 0.4F);
            this.chainWave(Neck, 0.2F, -0.02F, 0.5F, f2, 0.4F);
        }

        if (ee.getIsFlying()) {
            this.root.rotateAngleZ = (float) Math.toRadians(0);
            this.root.rotateAngleX = (float) Math.toRadians(-45);
        }
    }

    @Override
    public void setLivingAnimations(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime) {
        super.setLivingAnimations(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime);
        this.resetToDefaultPose();
        EntityPrehistoricFloraPlesioblattogryllus ee = (EntityPrehistoricFloraPlesioblattogryllus) entitylivingbaseIn;

        if (!ee.isReallyInWater()) {
            if (ee.getClimbFacing() == EnumFacing.NORTH
                    || ee.getClimbFacing() == EnumFacing.EAST
                    || ee.getClimbFacing() == EnumFacing.SOUTH
                    || ee.getClimbFacing() == EnumFacing.WEST
                    || ee.getIsClimbing()) {
                if (!ee.getHeadCollided()) {
                    animClimbing(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime, true);
                }
                else {
                    //Just pose with no animation running:
                    animClimbing(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime, false);
                }
            }
            else if (ee.getIsMoving()) {
                if (!ee.getIsFlying()) {
                    animRunning(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime);

                }
                else {
                    if (ee.getIsLaunching()) {
                        animGliding(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime);
                    }
                    else {
                        //Is gliding:
                        animGliding(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime);
                    }
                }
            }
        }
        else {
            if (ee.getIsLaunching()) {
//                animLaunching(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime);
            }
            else {
                //Is gliding:
                animGliding(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime);
            }
        }


    }
    
    public void animRunning(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime) {
        EntityPrehistoricFloraPlesioblattogryllus entity = (EntityPrehistoricFloraPlesioblattogryllus) entitylivingbaseIn;
        int animCycle = 8;
        double tickAnim = (entity.ticksExisted + entity.getTickOffset()) - (int) (Math.floor((double) (entity.ticksExisted + entity.getTickOffset()) / (double) animCycle) * (double) animCycle) + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;
        this.setRotateAngle(root, root.rotateAngleX + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*900+90))*1), root.rotateAngleY + (float) Math.toRadians(0), root.rotateAngleZ + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*900))*3));


        this.setRotateAngle(leftCercus, leftCercus.rotateAngleX + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*900+120))*3), leftCercus.rotateAngleY + (float) Math.toRadians(0), leftCercus.rotateAngleZ + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*900))*3));


        this.setRotateAngle(rightCercus, rightCercus.rotateAngleX + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*900+110))*3), rightCercus.rotateAngleY + (float) Math.toRadians(0), rightCercus.rotateAngleZ + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*900))*3));



        if (tickAnim >= 0 && tickAnim < 4) {
            xx = 0 + (((tickAnim - 0) / 4) * (0-(0)));
            yy = -22.5 + (((tickAnim - 0) / 4) * (10-(-22.5)));
            zz = 0 + (((tickAnim - 0) / 4) * (0-(0)));
        }
        else if (tickAnim >= 4 && tickAnim < 6) {
            xx = 0 + (((tickAnim - 4) / 2) * (11.42781-(0)));
            yy = 10 + (((tickAnim - 4) / 2) * (-13.85105-(10)));
            zz = 0 + (((tickAnim - 4) / 2) * (5.95556-(0)));
        }
        else if (tickAnim >= 6 && tickAnim < 8) {
            xx = 11.42781 + (((tickAnim - 6) / 2) * (0-(11.42781)));
            yy = -13.85105 + (((tickAnim - 6) / 2) * (-22.5-(-13.85105)));
            zz = 5.95556 + (((tickAnim - 6) / 2) * (0-(5.95556)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightLeg2, rightLeg2.rotateAngleX + (float) Math.toRadians(xx), rightLeg2.rotateAngleY + (float) Math.toRadians(yy), rightLeg2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 2) {
            xx = 0 + (((tickAnim - 0) / 2) * (16.0129-(0)));
            yy = 10 + (((tickAnim - 0) / 2) * (-22.84145-(10)));
            zz = 0 + (((tickAnim - 0) / 2) * (25.41377-(0)));
        }
        else if (tickAnim >= 2 && tickAnim < 4) {
            xx = 16.0129 + (((tickAnim - 2) / 2) * (0-(16.0129)));
            yy = -22.84145 + (((tickAnim - 2) / 2) * (-25-(-22.84145)));
            zz = 25.41377 + (((tickAnim - 2) / 2) * (0-(25.41377)));
        }
        else if (tickAnim >= 4 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 4) / 4) * (0-(0)));
            yy = -25 + (((tickAnim - 4) / 4) * (10-(-25)));
            zz = 0 + (((tickAnim - 4) / 4) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightLeg3, rightLeg3.rotateAngleX + (float) Math.toRadians(xx), rightLeg3.rotateAngleY + (float) Math.toRadians(yy), rightLeg3.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 4) {
            xx = 0 + (((tickAnim - 0) / 4) * (0-(0)));
            yy = 25 + (((tickAnim - 0) / 4) * (-10-(25)));
            zz = 0 + (((tickAnim - 0) / 4) * (0-(0)));
        }
        else if (tickAnim >= 4 && tickAnim < 6) {
            xx = 0 + (((tickAnim - 4) / 2) * (16.0129-(0)));
            yy = -10 + (((tickAnim - 4) / 2) * (22.84145-(-10)));
            zz = 0 + (((tickAnim - 4) / 2) * (-25.41377-(0)));
        }
        else if (tickAnim >= 6 && tickAnim < 8) {
            xx = 16.0129 + (((tickAnim - 6) / 2) * (0-(16.0129)));
            yy = 22.84145 + (((tickAnim - 6) / 2) * (25-(22.84145)));
            zz = -25.41377 + (((tickAnim - 6) / 2) * (0-(-25.41377)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftLeg3, leftLeg3.rotateAngleX + (float) Math.toRadians(xx), leftLeg3.rotateAngleY + (float) Math.toRadians(yy), leftLeg3.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 2) {
            xx = 0 + (((tickAnim - 0) / 2) * (11.42781-(0)));
            yy = -10 + (((tickAnim - 0) / 2) * (13.85105-(-10)));
            zz = 0 + (((tickAnim - 0) / 2) * (-5.95556-(0)));
        }
        else if (tickAnim >= 2 && tickAnim < 4) {
            xx = 11.42781 + (((tickAnim - 2) / 2) * (0-(11.42781)));
            yy = 13.85105 + (((tickAnim - 2) / 2) * (22.5-(13.85105)));
            zz = -5.95556 + (((tickAnim - 2) / 2) * (0-(-5.95556)));
        }
        else if (tickAnim >= 4 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 4) / 4) * (0-(0)));
            yy = 22.5 + (((tickAnim - 4) / 4) * (-10-(22.5)));
            zz = 0 + (((tickAnim - 4) / 4) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftLeg2, leftLeg2.rotateAngleX + (float) Math.toRadians(xx), leftLeg2.rotateAngleY + (float) Math.toRadians(yy), leftLeg2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 4) {
            xx = 0 + (((tickAnim - 0) / 4) * (0-(0)));
            yy = 7.5 + (((tickAnim - 0) / 4) * (-65-(7.5)));
            zz = 0 + (((tickAnim - 0) / 4) * (0-(0)));
        }
        else if (tickAnim >= 4 && tickAnim < 6) {
            xx = 0 + (((tickAnim - 4) / 2) * (-27.5-(0)));
            yy = -65 + (((tickAnim - 4) / 2) * (-32-(-65)));
            zz = 0 + (((tickAnim - 4) / 2) * (0-(0)));
        }
        else if (tickAnim >= 6 && tickAnim < 8) {
            xx = -27.5 + (((tickAnim - 6) / 2) * (0-(-27.5)));
            yy = -32 + (((tickAnim - 6) / 2) * (7.5-(-32)));
            zz = 0 + (((tickAnim - 6) / 2) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftLeg1, leftLeg1.rotateAngleX + (float) Math.toRadians(xx), leftLeg1.rotateAngleY + (float) Math.toRadians(yy), leftLeg1.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 2) {
            xx = 0 + (((tickAnim - 0) / 2) * (-27.5-(0)));
            yy = 65 + (((tickAnim - 0) / 2) * (32-(65)));
            zz = 0 + (((tickAnim - 0) / 2) * (0-(0)));
        }
        else if (tickAnim >= 2 && tickAnim < 4) {
            xx = -27.5 + (((tickAnim - 2) / 2) * (0-(-27.5)));
            yy = 32 + (((tickAnim - 2) / 2) * (-7.5-(32)));
            zz = 0 + (((tickAnim - 2) / 2) * (0-(0)));
        }
        else if (tickAnim >= 4 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 4) / 4) * (0-(0)));
            yy = -7.5 + (((tickAnim - 4) / 4) * (65-(-7.5)));
            zz = 0 + (((tickAnim - 4) / 4) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightLeg1, rightLeg1.rotateAngleX + (float) Math.toRadians(xx), rightLeg1.rotateAngleY + (float) Math.toRadians(yy), rightLeg1.rotateAngleZ + (float) Math.toRadians(zz));



        this.setRotateAngle(rightAntenna, rightAntenna.rotateAngleX + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*900))*10), rightAntenna.rotateAngleY + (float) Math.toRadians(0), rightAntenna.rotateAngleZ + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*900+100))*5));


        this.setRotateAngle(leftAntenna, leftAntenna.rotateAngleX + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*900))*10), leftAntenna.rotateAngleY + (float) Math.toRadians(0), leftAntenna.rotateAngleZ + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*900+50))*5));
        
    }
    public void animGliding(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime) {
        EntityPrehistoricFloraPlesioblattogryllus entity = (EntityPrehistoricFloraPlesioblattogryllus) entitylivingbaseIn;
        int animCycle = 38;
        double tickAnim = (entity.ticksExisted + entity.getTickOffset()) - (int) (Math.floor((double) (entity.ticksExisted + entity.getTickOffset()) / (double) animCycle) * (double) animCycle) + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;
        this.setRotateAngle(root, root.rotateAngleX + (float) Math.toRadians(-32.5+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*(562))+40)*4), root.rotateAngleY + (float) Math.toRadians(0), root.rotateAngleZ + (float) Math.toRadians(0));
        this.root.rotationPointX = this.root.rotationPointX + (float)(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*187-60))*1);
        this.root.rotationPointY = this.root.rotationPointY - (float)(5+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*374+40))*0.8);
        this.root.rotationPointZ = this.root.rotationPointZ + (float)(0);


        this.setRotateAngle(abdomen, abdomen.rotateAngleX + (float) Math.toRadians(10+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*(562))+40)*1), abdomen.rotateAngleY + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*187+160))*5), abdomen.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(leftCercus, leftCercus.rotateAngleX + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*(562))+60)*4), leftCercus.rotateAngleY + (float) Math.toRadians(0), leftCercus.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(rightCercus, rightCercus.rotateAngleX + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*(562))+60)*4), rightCercus.rotateAngleY + (float) Math.toRadians(0), rightCercus.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(rightLeg2, rightLeg2.rotateAngleX + (float) Math.toRadians(-16.4702729203+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*(562))+40)*6), rightLeg2.rotateAngleY + (float) Math.toRadians(49.09293), rightLeg2.rotateAngleZ + (float) Math.toRadians(-6.8817));


        this.setRotateAngle(rightLeg3, rightLeg3.rotateAngleX + (float) Math.toRadians(-12.6766736416+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*(562))+70)*4), rightLeg3.rotateAngleY + (float) Math.toRadians(24.82021), rightLeg3.rotateAngleZ + (float) Math.toRadians(-1.64296));


        this.setRotateAngle(leftLeg3, leftLeg3.rotateAngleX + (float) Math.toRadians(-12.6766736416+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*(562))+50)*4), leftLeg3.rotateAngleY + (float) Math.toRadians(-24.82021), leftLeg3.rotateAngleZ + (float) Math.toRadians(1.64296));


        this.setRotateAngle(leftLeg2, leftLeg2.rotateAngleX + (float) Math.toRadians(-16.4702729203+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*(562))+30)*6), leftLeg2.rotateAngleY + (float) Math.toRadians(-49.09293), leftLeg2.rotateAngleZ + (float) Math.toRadians(6.8817));



        if (tickAnim >= 0 && tickAnim < 2) {
            xx = -156.46401 + (((tickAnim - 0) / 2) * (-203.59273-(-156.46401)));
            yy = 79.52006 + (((tickAnim - 0) / 2) * (56.92175-(79.52006)));
            zz = -234.60608 + (((tickAnim - 0) / 2) * (-151.56145-(-234.60608)));
        }
        else if (tickAnim >= 2 && tickAnim < 2) {
            xx = -203.59273 + (((tickAnim - 2) / 0) * (-111.48734-(-203.59273)));
            yy = 56.92175 + (((tickAnim - 2) / 0) * (32.99047-(56.92175)));
            zz = -151.56145 + (((tickAnim - 2) / 0) * (-116.67477-(-151.56145)));
        }
        else if (tickAnim >= 2 && tickAnim < 3) {
            xx = -111.48734 + (((tickAnim - 2) / 1) * (-156.46401-(-111.48734)));
            yy = 32.99047 + (((tickAnim - 2) / 1) * (79.52006-(32.99047)));
            zz = -116.67477 + (((tickAnim - 2) / 1) * (-234.60608-(-116.67477)));
        }
        else if (tickAnim >= 3 && tickAnim < 5) {
            xx = -156.46401 + (((tickAnim - 3) / 2) * (-203.59273-(-156.46401)));
            yy = 79.52006 + (((tickAnim - 3) / 2) * (56.92175-(79.52006)));
            zz = -234.60608 + (((tickAnim - 3) / 2) * (-151.56145-(-234.60608)));
        }
        else if (tickAnim >= 5 && tickAnim < 6) {
            xx = -203.59273 + (((tickAnim - 5) / 1) * (-111.48734-(-203.59273)));
            yy = 56.92175 + (((tickAnim - 5) / 1) * (32.99047-(56.92175)));
            zz = -151.56145 + (((tickAnim - 5) / 1) * (-116.67477-(-151.56145)));
        }
        else if (tickAnim >= 6 && tickAnim < 6) {
            xx = -111.48734 + (((tickAnim - 6) / 0) * (-156.46401-(-111.48734)));
            yy = 32.99047 + (((tickAnim - 6) / 0) * (79.52006-(32.99047)));
            zz = -116.67477 + (((tickAnim - 6) / 0) * (-234.60608-(-116.67477)));
        }
        else if (tickAnim >= 6 && tickAnim < 8) {
            xx = -156.46401 + (((tickAnim - 6) / 2) * (-203.59273-(-156.46401)));
            yy = 79.52006 + (((tickAnim - 6) / 2) * (56.92175-(79.52006)));
            zz = -234.60608 + (((tickAnim - 6) / 2) * (-151.56145-(-234.60608)));
        }
        else if (tickAnim >= 8 && tickAnim < 9) {
            xx = -203.59273 + (((tickAnim - 8) / 1) * (-111.48734-(-203.59273)));
            yy = 56.92175 + (((tickAnim - 8) / 1) * (32.99047-(56.92175)));
            zz = -151.56145 + (((tickAnim - 8) / 1) * (-116.67477-(-151.56145)));
        }
        else if (tickAnim >= 9 && tickAnim < 10) {
            xx = -111.48734 + (((tickAnim - 9) / 1) * (-156.46401-(-111.48734)));
            yy = 32.99047 + (((tickAnim - 9) / 1) * (79.52006-(32.99047)));
            zz = -116.67477 + (((tickAnim - 9) / 1) * (-234.60608-(-116.67477)));
        }
        else if (tickAnim >= 10 && tickAnim < 11) {
            xx = -156.46401 + (((tickAnim - 10) / 1) * (-203.59273-(-156.46401)));
            yy = 79.52006 + (((tickAnim - 10) / 1) * (56.92175-(79.52006)));
            zz = -234.60608 + (((tickAnim - 10) / 1) * (-151.56145-(-234.60608)));
        }
        else if (tickAnim >= 11 && tickAnim < 12) {
            xx = -203.59273 + (((tickAnim - 11) / 1) * (-111.48734-(-203.59273)));
            yy = 56.92175 + (((tickAnim - 11) / 1) * (32.99047-(56.92175)));
            zz = -151.56145 + (((tickAnim - 11) / 1) * (-116.67477-(-151.56145)));
        }
        else if (tickAnim >= 12 && tickAnim < 13) {
            xx = -111.48734 + (((tickAnim - 12) / 1) * (-156.46401-(-111.48734)));
            yy = 32.99047 + (((tickAnim - 12) / 1) * (79.52006-(32.99047)));
            zz = -116.67477 + (((tickAnim - 12) / 1) * (-234.60608-(-116.67477)));
        }
        else if (tickAnim >= 13 && tickAnim < 14) {
            xx = -156.46401 + (((tickAnim - 13) / 1) * (-203.59273-(-156.46401)));
            yy = 79.52006 + (((tickAnim - 13) / 1) * (56.92175-(79.52006)));
            zz = -234.60608 + (((tickAnim - 13) / 1) * (-151.56145-(-234.60608)));
        }
        else if (tickAnim >= 14 && tickAnim < 15) {
            xx = -203.59273 + (((tickAnim - 14) / 1) * (-111.48734-(-203.59273)));
            yy = 56.92175 + (((tickAnim - 14) / 1) * (32.99047-(56.92175)));
            zz = -151.56145 + (((tickAnim - 14) / 1) * (-116.67477-(-151.56145)));
        }
        else if (tickAnim >= 15 && tickAnim < 16) {
            xx = -111.48734 + (((tickAnim - 15) / 1) * (-156.46401-(-111.48734)));
            yy = 32.99047 + (((tickAnim - 15) / 1) * (79.52006-(32.99047)));
            zz = -116.67477 + (((tickAnim - 15) / 1) * (-234.60608-(-116.67477)));
        }
        else if (tickAnim >= 16 && tickAnim < 18) {
            xx = -156.46401 + (((tickAnim - 16) / 2) * (-203.59273-(-156.46401)));
            yy = 79.52006 + (((tickAnim - 16) / 2) * (56.92175-(79.52006)));
            zz = -234.60608 + (((tickAnim - 16) / 2) * (-151.56145-(-234.60608)));
        }
        else if (tickAnim >= 18 && tickAnim < 18) {
            xx = -203.59273 + (((tickAnim - 18) / 0) * (-111.48734-(-203.59273)));
            yy = 56.92175 + (((tickAnim - 18) / 0) * (32.99047-(56.92175)));
            zz = -151.56145 + (((tickAnim - 18) / 0) * (-116.67477-(-151.56145)));
        }
        else if (tickAnim >= 18 && tickAnim < 19) {
            xx = -111.48734 + (((tickAnim - 18) / 1) * (-156.46401-(-111.48734)));
            yy = 32.99047 + (((tickAnim - 18) / 1) * (79.52006-(32.99047)));
            zz = -116.67477 + (((tickAnim - 18) / 1) * (-234.60608-(-116.67477)));
        }
        else if (tickAnim >= 19 && tickAnim < 21) {
            xx = -156.46401 + (((tickAnim - 19) / 2) * (-203.59273-(-156.46401)));
            yy = 79.52006 + (((tickAnim - 19) / 2) * (56.92175-(79.52006)));
            zz = -234.60608 + (((tickAnim - 19) / 2) * (-151.56145-(-234.60608)));
        }
        else if (tickAnim >= 21 && tickAnim < 22) {
            xx = -203.59273 + (((tickAnim - 21) / 1) * (-111.48734-(-203.59273)));
            yy = 56.92175 + (((tickAnim - 21) / 1) * (32.99047-(56.92175)));
            zz = -151.56145 + (((tickAnim - 21) / 1) * (-116.67477-(-151.56145)));
        }
        else if (tickAnim >= 22 && tickAnim < 22) {
            xx = -111.48734 + (((tickAnim - 22) / 0) * (-156.46401-(-111.48734)));
            yy = 32.99047 + (((tickAnim - 22) / 0) * (79.52006-(32.99047)));
            zz = -116.67477 + (((tickAnim - 22) / 0) * (-234.60608-(-116.67477)));
        }
        else if (tickAnim >= 22 && tickAnim < 24) {
            xx = -156.46401 + (((tickAnim - 22) / 2) * (-203.59273-(-156.46401)));
            yy = 79.52006 + (((tickAnim - 22) / 2) * (56.92175-(79.52006)));
            zz = -234.60608 + (((tickAnim - 22) / 2) * (-151.56145-(-234.60608)));
        }
        else if (tickAnim >= 24 && tickAnim < 25) {
            xx = -203.59273 + (((tickAnim - 24) / 1) * (-111.48734-(-203.59273)));
            yy = 56.92175 + (((tickAnim - 24) / 1) * (32.99047-(56.92175)));
            zz = -151.56145 + (((tickAnim - 24) / 1) * (-116.67477-(-151.56145)));
        }
        else if (tickAnim >= 25 && tickAnim < 26) {
            xx = -111.48734 + (((tickAnim - 25) / 1) * (-156.46401-(-111.48734)));
            yy = 32.99047 + (((tickAnim - 25) / 1) * (79.52006-(32.99047)));
            zz = -116.67477 + (((tickAnim - 25) / 1) * (-234.60608-(-116.67477)));
        }
        else if (tickAnim >= 26 && tickAnim < 27) {
            xx = -156.46401 + (((tickAnim - 26) / 1) * (-203.59273-(-156.46401)));
            yy = 79.52006 + (((tickAnim - 26) / 1) * (56.92175-(79.52006)));
            zz = -234.60608 + (((tickAnim - 26) / 1) * (-151.56145-(-234.60608)));
        }
        else if (tickAnim >= 27 && tickAnim < 28) {
            xx = -203.59273 + (((tickAnim - 27) / 1) * (-111.48734-(-203.59273)));
            yy = 56.92175 + (((tickAnim - 27) / 1) * (32.99047-(56.92175)));
            zz = -151.56145 + (((tickAnim - 27) / 1) * (-116.67477-(-151.56145)));
        }
        else if (tickAnim >= 28 && tickAnim < 29) {
            xx = -111.48734 + (((tickAnim - 28) / 1) * (-156.46401-(-111.48734)));
            yy = 32.99047 + (((tickAnim - 28) / 1) * (79.52006-(32.99047)));
            zz = -116.67477 + (((tickAnim - 28) / 1) * (-234.60608-(-116.67477)));
        }
        else if (tickAnim >= 29 && tickAnim < 30) {
            xx = -156.46401 + (((tickAnim - 29) / 1) * (-203.59273-(-156.46401)));
            yy = 79.52006 + (((tickAnim - 29) / 1) * (56.92175-(79.52006)));
            zz = -234.60608 + (((tickAnim - 29) / 1) * (-151.56145-(-234.60608)));
        }
        else if (tickAnim >= 30 && tickAnim < 31) {
            xx = -203.59273 + (((tickAnim - 30) / 1) * (-111.48734-(-203.59273)));
            yy = 56.92175 + (((tickAnim - 30) / 1) * (32.99047-(56.92175)));
            zz = -151.56145 + (((tickAnim - 30) / 1) * (-116.67477-(-151.56145)));
        }
        else if (tickAnim >= 31 && tickAnim < 32) {
            xx = -111.48734 + (((tickAnim - 31) / 1) * (-156.46401-(-111.48734)));
            yy = 32.99047 + (((tickAnim - 31) / 1) * (79.52006-(32.99047)));
            zz = -116.67477 + (((tickAnim - 31) / 1) * (-234.60608-(-116.67477)));
        }
        else if (tickAnim >= 32 && tickAnim < 34) {
            xx = -156.46401 + (((tickAnim - 32) / 2) * (-203.59273-(-156.46401)));
            yy = 79.52006 + (((tickAnim - 32) / 2) * (56.92175-(79.52006)));
            zz = -234.60608 + (((tickAnim - 32) / 2) * (-151.56145-(-234.60608)));
        }
        else if (tickAnim >= 34 && tickAnim < 34) {
            xx = -203.59273 + (((tickAnim - 34) / 0) * (-111.48734-(-203.59273)));
            yy = 56.92175 + (((tickAnim - 34) / 0) * (32.99047-(56.92175)));
            zz = -151.56145 + (((tickAnim - 34) / 0) * (-116.67477-(-151.56145)));
        }
        else if (tickAnim >= 34 && tickAnim < 35) {
            xx = -111.48734 + (((tickAnim - 34) / 1) * (-156.46401-(-111.48734)));
            yy = 32.99047 + (((tickAnim - 34) / 1) * (79.52006-(32.99047)));
            zz = -116.67477 + (((tickAnim - 34) / 1) * (-234.60608-(-116.67477)));
        }
        else if (tickAnim >= 35 && tickAnim < 37) {
            xx = -156.46401 + (((tickAnim - 35) / 2) * (-203.59273-(-156.46401)));
            yy = 79.52006 + (((tickAnim - 35) / 2) * (56.92175-(79.52006)));
            zz = -234.60608 + (((tickAnim - 35) / 2) * (-151.56145-(-234.60608)));
        }
        else if (tickAnim >= 37 && tickAnim < 38) {
            xx = -203.59273 + (((tickAnim - 37) / 1) * (-111.48734-(-203.59273)));
            yy = 56.92175 + (((tickAnim - 37) / 1) * (32.99047-(56.92175)));
            zz = -151.56145 + (((tickAnim - 37) / 1) * (-116.67477-(-151.56145)));
        }
        else if (tickAnim >= 38 && tickAnim < 38) {
            xx = -111.48734 + (((tickAnim - 38) / 0) * (-156.46401-(-111.48734)));
            yy = 32.99047 + (((tickAnim - 38) / 0) * (79.52006-(32.99047)));
            zz = -116.67477 + (((tickAnim - 38) / 0) * (-234.60608-(-116.67477)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftForewing, leftForewing.rotateAngleX + (float) Math.toRadians(xx), leftForewing.rotateAngleY + (float) Math.toRadians(yy), leftForewing.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 2) {
            xx = 7.11395 + (((tickAnim - 0) / 2) * (-130.38605-(7.11395)));
            yy = 81.77832 + (((tickAnim - 0) / 2) * (81.77832-(81.77832)));
            zz = -78.21965 + (((tickAnim - 0) / 2) * (-78.21965-(-78.21965)));
        }
        else if (tickAnim >= 2 && tickAnim < 2) {
            xx = -130.38605 + (((tickAnim - 2) / 0) * (-85.90777-(-130.38605)));
            yy = 81.77832 + (((tickAnim - 2) / 0) * (37.37375-(81.77832)));
            zz = -78.21965 + (((tickAnim - 2) / 0) * (-98.88218-(-78.21965)));
        }
        else if (tickAnim >= 2 && tickAnim < 3) {
            xx = -85.90777 + (((tickAnim - 2) / 1) * (7.11395-(-85.90777)));
            yy = 37.37375 + (((tickAnim - 2) / 1) * (81.77832-(37.37375)));
            zz = -98.88218 + (((tickAnim - 2) / 1) * (-78.21965-(-98.88218)));
        }
        else if (tickAnim >= 3 && tickAnim < 5) {
            xx = 7.11395 + (((tickAnim - 3) / 2) * (-130.38605-(7.11395)));
            yy = 81.77832 + (((tickAnim - 3) / 2) * (81.77832-(81.77832)));
            zz = -78.21965 + (((tickAnim - 3) / 2) * (-78.21965-(-78.21965)));
        }
        else if (tickAnim >= 5 && tickAnim < 6) {
            xx = -130.38605 + (((tickAnim - 5) / 1) * (-85.90777-(-130.38605)));
            yy = 81.77832 + (((tickAnim - 5) / 1) * (37.37375-(81.77832)));
            zz = -78.21965 + (((tickAnim - 5) / 1) * (-98.88218-(-78.21965)));
        }
        else if (tickAnim >= 6 && tickAnim < 6) {
            xx = -85.90777 + (((tickAnim - 6) / 0) * (7.11395-(-85.90777)));
            yy = 37.37375 + (((tickAnim - 6) / 0) * (81.77832-(37.37375)));
            zz = -98.88218 + (((tickAnim - 6) / 0) * (-78.21965-(-98.88218)));
        }
        else if (tickAnim >= 6 && tickAnim < 8) {
            xx = 7.11395 + (((tickAnim - 6) / 2) * (-130.38605-(7.11395)));
            yy = 81.77832 + (((tickAnim - 6) / 2) * (81.77832-(81.77832)));
            zz = -78.21965 + (((tickAnim - 6) / 2) * (-78.21965-(-78.21965)));
        }
        else if (tickAnim >= 8 && tickAnim < 9) {
            xx = -130.38605 + (((tickAnim - 8) / 1) * (-85.90777-(-130.38605)));
            yy = 81.77832 + (((tickAnim - 8) / 1) * (37.37375-(81.77832)));
            zz = -78.21965 + (((tickAnim - 8) / 1) * (-98.88218-(-78.21965)));
        }
        else if (tickAnim >= 9 && tickAnim < 10) {
            xx = -85.90777 + (((tickAnim - 9) / 1) * (7.11395-(-85.90777)));
            yy = 37.37375 + (((tickAnim - 9) / 1) * (81.77832-(37.37375)));
            zz = -98.88218 + (((tickAnim - 9) / 1) * (-78.21965-(-98.88218)));
        }
        else if (tickAnim >= 10 && tickAnim < 11) {
            xx = 7.11395 + (((tickAnim - 10) / 1) * (-130.38605-(7.11395)));
            yy = 81.77832 + (((tickAnim - 10) / 1) * (81.77832-(81.77832)));
            zz = -78.21965 + (((tickAnim - 10) / 1) * (-78.21965-(-78.21965)));
        }
        else if (tickAnim >= 11 && tickAnim < 12) {
            xx = -130.38605 + (((tickAnim - 11) / 1) * (-85.90777-(-130.38605)));
            yy = 81.77832 + (((tickAnim - 11) / 1) * (37.37375-(81.77832)));
            zz = -78.21965 + (((tickAnim - 11) / 1) * (-98.88218-(-78.21965)));
        }
        else if (tickAnim >= 12 && tickAnim < 13) {
            xx = -85.90777 + (((tickAnim - 12) / 1) * (7.11395-(-85.90777)));
            yy = 37.37375 + (((tickAnim - 12) / 1) * (81.77832-(37.37375)));
            zz = -98.88218 + (((tickAnim - 12) / 1) * (-78.21965-(-98.88218)));
        }
        else if (tickAnim >= 13 && tickAnim < 14) {
            xx = 7.11395 + (((tickAnim - 13) / 1) * (-130.38605-(7.11395)));
            yy = 81.77832 + (((tickAnim - 13) / 1) * (81.77832-(81.77832)));
            zz = -78.21965 + (((tickAnim - 13) / 1) * (-78.21965-(-78.21965)));
        }
        else if (tickAnim >= 14 && tickAnim < 15) {
            xx = -130.38605 + (((tickAnim - 14) / 1) * (-85.90777-(-130.38605)));
            yy = 81.77832 + (((tickAnim - 14) / 1) * (37.37375-(81.77832)));
            zz = -78.21965 + (((tickAnim - 14) / 1) * (-98.88218-(-78.21965)));
        }
        else if (tickAnim >= 15 && tickAnim < 16) {
            xx = -85.90777 + (((tickAnim - 15) / 1) * (7.11395-(-85.90777)));
            yy = 37.37375 + (((tickAnim - 15) / 1) * (81.77832-(37.37375)));
            zz = -98.88218 + (((tickAnim - 15) / 1) * (-78.21965-(-98.88218)));
        }
        else if (tickAnim >= 16 && tickAnim < 18) {
            xx = 7.11395 + (((tickAnim - 16) / 2) * (-130.38605-(7.11395)));
            yy = 81.77832 + (((tickAnim - 16) / 2) * (81.77832-(81.77832)));
            zz = -78.21965 + (((tickAnim - 16) / 2) * (-78.21965-(-78.21965)));
        }
        else if (tickAnim >= 18 && tickAnim < 18) {
            xx = -130.38605 + (((tickAnim - 18) / 0) * (-85.90777-(-130.38605)));
            yy = 81.77832 + (((tickAnim - 18) / 0) * (37.37375-(81.77832)));
            zz = -78.21965 + (((tickAnim - 18) / 0) * (-98.88218-(-78.21965)));
        }
        else if (tickAnim >= 18 && tickAnim < 19) {
            xx = -85.90777 + (((tickAnim - 18) / 1) * (7.11395-(-85.90777)));
            yy = 37.37375 + (((tickAnim - 18) / 1) * (81.77832-(37.37375)));
            zz = -98.88218 + (((tickAnim - 18) / 1) * (-78.21965-(-98.88218)));
        }
        else if (tickAnim >= 19 && tickAnim < 21) {
            xx = 7.11395 + (((tickAnim - 19) / 2) * (-130.38605-(7.11395)));
            yy = 81.77832 + (((tickAnim - 19) / 2) * (81.77832-(81.77832)));
            zz = -78.21965 + (((tickAnim - 19) / 2) * (-78.21965-(-78.21965)));
        }
        else if (tickAnim >= 21 && tickAnim < 22) {
            xx = -130.38605 + (((tickAnim - 21) / 1) * (-85.90777-(-130.38605)));
            yy = 81.77832 + (((tickAnim - 21) / 1) * (37.37375-(81.77832)));
            zz = -78.21965 + (((tickAnim - 21) / 1) * (-98.88218-(-78.21965)));
        }
        else if (tickAnim >= 22 && tickAnim < 22) {
            xx = -85.90777 + (((tickAnim - 22) / 0) * (7.11395-(-85.90777)));
            yy = 37.37375 + (((tickAnim - 22) / 0) * (81.77832-(37.37375)));
            zz = -98.88218 + (((tickAnim - 22) / 0) * (-78.21965-(-98.88218)));
        }
        else if (tickAnim >= 22 && tickAnim < 24) {
            xx = 7.11395 + (((tickAnim - 22) / 2) * (-130.38605-(7.11395)));
            yy = 81.77832 + (((tickAnim - 22) / 2) * (81.77832-(81.77832)));
            zz = -78.21965 + (((tickAnim - 22) / 2) * (-78.21965-(-78.21965)));
        }
        else if (tickAnim >= 24 && tickAnim < 25) {
            xx = -130.38605 + (((tickAnim - 24) / 1) * (-85.90777-(-130.38605)));
            yy = 81.77832 + (((tickAnim - 24) / 1) * (37.37375-(81.77832)));
            zz = -78.21965 + (((tickAnim - 24) / 1) * (-98.88218-(-78.21965)));
        }
        else if (tickAnim >= 25 && tickAnim < 26) {
            xx = -85.90777 + (((tickAnim - 25) / 1) * (7.11395-(-85.90777)));
            yy = 37.37375 + (((tickAnim - 25) / 1) * (81.77832-(37.37375)));
            zz = -98.88218 + (((tickAnim - 25) / 1) * (-78.21965-(-98.88218)));
        }
        else if (tickAnim >= 26 && tickAnim < 27) {
            xx = 7.11395 + (((tickAnim - 26) / 1) * (-130.38605-(7.11395)));
            yy = 81.77832 + (((tickAnim - 26) / 1) * (81.77832-(81.77832)));
            zz = -78.21965 + (((tickAnim - 26) / 1) * (-78.21965-(-78.21965)));
        }
        else if (tickAnim >= 27 && tickAnim < 28) {
            xx = -130.38605 + (((tickAnim - 27) / 1) * (-85.90777-(-130.38605)));
            yy = 81.77832 + (((tickAnim - 27) / 1) * (37.37375-(81.77832)));
            zz = -78.21965 + (((tickAnim - 27) / 1) * (-98.88218-(-78.21965)));
        }
        else if (tickAnim >= 28 && tickAnim < 29) {
            xx = -85.90777 + (((tickAnim - 28) / 1) * (7.11395-(-85.90777)));
            yy = 37.37375 + (((tickAnim - 28) / 1) * (81.77832-(37.37375)));
            zz = -98.88218 + (((tickAnim - 28) / 1) * (-78.21965-(-98.88218)));
        }
        else if (tickAnim >= 29 && tickAnim < 30) {
            xx = 7.11395 + (((tickAnim - 29) / 1) * (-130.38605-(7.11395)));
            yy = 81.77832 + (((tickAnim - 29) / 1) * (81.77832-(81.77832)));
            zz = -78.21965 + (((tickAnim - 29) / 1) * (-78.21965-(-78.21965)));
        }
        else if (tickAnim >= 30 && tickAnim < 31) {
            xx = -130.38605 + (((tickAnim - 30) / 1) * (-85.90777-(-130.38605)));
            yy = 81.77832 + (((tickAnim - 30) / 1) * (37.37375-(81.77832)));
            zz = -78.21965 + (((tickAnim - 30) / 1) * (-98.88218-(-78.21965)));
        }
        else if (tickAnim >= 31 && tickAnim < 32) {
            xx = -85.90777 + (((tickAnim - 31) / 1) * (7.11395-(-85.90777)));
            yy = 37.37375 + (((tickAnim - 31) / 1) * (81.77832-(37.37375)));
            zz = -98.88218 + (((tickAnim - 31) / 1) * (-78.21965-(-98.88218)));
        }
        else if (tickAnim >= 32 && tickAnim < 34) {
            xx = 7.11395 + (((tickAnim - 32) / 2) * (-130.38605-(7.11395)));
            yy = 81.77832 + (((tickAnim - 32) / 2) * (81.77832-(81.77832)));
            zz = -78.21965 + (((tickAnim - 32) / 2) * (-78.21965-(-78.21965)));
        }
        else if (tickAnim >= 34 && tickAnim < 34) {
            xx = -130.38605 + (((tickAnim - 34) / 0) * (-85.90777-(-130.38605)));
            yy = 81.77832 + (((tickAnim - 34) / 0) * (37.37375-(81.77832)));
            zz = -78.21965 + (((tickAnim - 34) / 0) * (-98.88218-(-78.21965)));
        }
        else if (tickAnim >= 34 && tickAnim < 35) {
            xx = -85.90777 + (((tickAnim - 34) / 1) * (7.11395-(-85.90777)));
            yy = 37.37375 + (((tickAnim - 34) / 1) * (81.77832-(37.37375)));
            zz = -98.88218 + (((tickAnim - 34) / 1) * (-78.21965-(-98.88218)));
        }
        else if (tickAnim >= 35 && tickAnim < 37) {
            xx = 7.11395 + (((tickAnim - 35) / 2) * (-130.38605-(7.11395)));
            yy = 81.77832 + (((tickAnim - 35) / 2) * (81.77832-(81.77832)));
            zz = -78.21965 + (((tickAnim - 35) / 2) * (-78.21965-(-78.21965)));
        }
        else if (tickAnim >= 37 && tickAnim < 38) {
            xx = -130.38605 + (((tickAnim - 37) / 1) * (-85.90777-(-130.38605)));
            yy = 81.77832 + (((tickAnim - 37) / 1) * (37.37375-(81.77832)));
            zz = -78.21965 + (((tickAnim - 37) / 1) * (-98.88218-(-78.21965)));
        }
        else if (tickAnim >= 38 && tickAnim < 38) {
            xx = -85.90777 + (((tickAnim - 38) / 0) * (7.11395-(-85.90777)));
            yy = 37.37375 + (((tickAnim - 38) / 0) * (81.77832-(37.37375)));
            zz = -98.88218 + (((tickAnim - 38) / 0) * (-78.21965-(-98.88218)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftHindwing, leftHindwing.rotateAngleX + (float) Math.toRadians(xx), leftHindwing.rotateAngleY + (float) Math.toRadians(yy), leftHindwing.rotateAngleZ + (float) Math.toRadians(zz));



        this.setRotateAngle(leftHindwing2, leftHindwing2.rotateAngleX + (float) Math.toRadians(0), leftHindwing2.rotateAngleY + (float) Math.toRadians(0), leftHindwing2.rotateAngleZ + (float) Math.toRadians(-180));



        if (tickAnim >= 0 && tickAnim < 2) {
            xx = -156.46401 + (((tickAnim - 0) / 2) * (-203.59273-(-156.46401)));
            yy = -79.52006 + (((tickAnim - 0) / 2) * (-56.92175-(-79.52006)));
            zz = 234.60608 + (((tickAnim - 0) / 2) * (151.56145-(234.60608)));
        }
        else if (tickAnim >= 2 && tickAnim < 2) {
            xx = -203.59273 + (((tickAnim - 2) / 0) * (-111.48734-(-203.59273)));
            yy = -56.92175 + (((tickAnim - 2) / 0) * (-32.99047-(-56.92175)));
            zz = 151.56145 + (((tickAnim - 2) / 0) * (116.67477-(151.56145)));
        }
        else if (tickAnim >= 2 && tickAnim < 3) {
            xx = -111.48734 + (((tickAnim - 2) / 1) * (-156.46401-(-111.48734)));
            yy = -32.99047 + (((tickAnim - 2) / 1) * (-79.52006-(-32.99047)));
            zz = 116.67477 + (((tickAnim - 2) / 1) * (234.60608-(116.67477)));
        }
        else if (tickAnim >= 3 && tickAnim < 5) {
            xx = -156.46401 + (((tickAnim - 3) / 2) * (-203.59273-(-156.46401)));
            yy = -79.52006 + (((tickAnim - 3) / 2) * (-56.92175-(-79.52006)));
            zz = 234.60608 + (((tickAnim - 3) / 2) * (151.56145-(234.60608)));
        }
        else if (tickAnim >= 5 && tickAnim < 6) {
            xx = -203.59273 + (((tickAnim - 5) / 1) * (-111.48734-(-203.59273)));
            yy = -56.92175 + (((tickAnim - 5) / 1) * (-32.99047-(-56.92175)));
            zz = 151.56145 + (((tickAnim - 5) / 1) * (116.67477-(151.56145)));
        }
        else if (tickAnim >= 6 && tickAnim < 6) {
            xx = -111.48734 + (((tickAnim - 6) / 0) * (-156.46401-(-111.48734)));
            yy = -32.99047 + (((tickAnim - 6) / 0) * (-79.52006-(-32.99047)));
            zz = 116.67477 + (((tickAnim - 6) / 0) * (234.60608-(116.67477)));
        }
        else if (tickAnim >= 6 && tickAnim < 8) {
            xx = -156.46401 + (((tickAnim - 6) / 2) * (-203.59273-(-156.46401)));
            yy = -79.52006 + (((tickAnim - 6) / 2) * (-56.92175-(-79.52006)));
            zz = 234.60608 + (((tickAnim - 6) / 2) * (151.56145-(234.60608)));
        }
        else if (tickAnim >= 8 && tickAnim < 9) {
            xx = -203.59273 + (((tickAnim - 8) / 1) * (-111.48734-(-203.59273)));
            yy = -56.92175 + (((tickAnim - 8) / 1) * (-32.99047-(-56.92175)));
            zz = 151.56145 + (((tickAnim - 8) / 1) * (116.67477-(151.56145)));
        }
        else if (tickAnim >= 9 && tickAnim < 10) {
            xx = -111.48734 + (((tickAnim - 9) / 1) * (-156.46401-(-111.48734)));
            yy = -32.99047 + (((tickAnim - 9) / 1) * (-79.52006-(-32.99047)));
            zz = 116.67477 + (((tickAnim - 9) / 1) * (234.60608-(116.67477)));
        }
        else if (tickAnim >= 10 && tickAnim < 11) {
            xx = -156.46401 + (((tickAnim - 10) / 1) * (-203.59273-(-156.46401)));
            yy = -79.52006 + (((tickAnim - 10) / 1) * (-56.92175-(-79.52006)));
            zz = 234.60608 + (((tickAnim - 10) / 1) * (151.56145-(234.60608)));
        }
        else if (tickAnim >= 11 && tickAnim < 12) {
            xx = -203.59273 + (((tickAnim - 11) / 1) * (-111.48734-(-203.59273)));
            yy = -56.92175 + (((tickAnim - 11) / 1) * (-32.99047-(-56.92175)));
            zz = 151.56145 + (((tickAnim - 11) / 1) * (116.67477-(151.56145)));
        }
        else if (tickAnim >= 12 && tickAnim < 13) {
            xx = -111.48734 + (((tickAnim - 12) / 1) * (-156.46401-(-111.48734)));
            yy = -32.99047 + (((tickAnim - 12) / 1) * (-79.52006-(-32.99047)));
            zz = 116.67477 + (((tickAnim - 12) / 1) * (234.60608-(116.67477)));
        }
        else if (tickAnim >= 13 && tickAnim < 14) {
            xx = -156.46401 + (((tickAnim - 13) / 1) * (-203.59273-(-156.46401)));
            yy = -79.52006 + (((tickAnim - 13) / 1) * (-56.92175-(-79.52006)));
            zz = 234.60608 + (((tickAnim - 13) / 1) * (151.56145-(234.60608)));
        }
        else if (tickAnim >= 14 && tickAnim < 15) {
            xx = -203.59273 + (((tickAnim - 14) / 1) * (-111.48734-(-203.59273)));
            yy = -56.92175 + (((tickAnim - 14) / 1) * (-32.99047-(-56.92175)));
            zz = 151.56145 + (((tickAnim - 14) / 1) * (116.67477-(151.56145)));
        }
        else if (tickAnim >= 15 && tickAnim < 16) {
            xx = -111.48734 + (((tickAnim - 15) / 1) * (-156.46401-(-111.48734)));
            yy = -32.99047 + (((tickAnim - 15) / 1) * (-79.52006-(-32.99047)));
            zz = 116.67477 + (((tickAnim - 15) / 1) * (234.60608-(116.67477)));
        }
        else if (tickAnim >= 16 && tickAnim < 18) {
            xx = -156.46401 + (((tickAnim - 16) / 2) * (-203.59273-(-156.46401)));
            yy = -79.52006 + (((tickAnim - 16) / 2) * (-56.92175-(-79.52006)));
            zz = 234.60608 + (((tickAnim - 16) / 2) * (151.56145-(234.60608)));
        }
        else if (tickAnim >= 18 && tickAnim < 18) {
            xx = -203.59273 + (((tickAnim - 18) / 0) * (-111.48734-(-203.59273)));
            yy = -56.92175 + (((tickAnim - 18) / 0) * (-32.99047-(-56.92175)));
            zz = 151.56145 + (((tickAnim - 18) / 0) * (116.67477-(151.56145)));
        }
        else if (tickAnim >= 18 && tickAnim < 19) {
            xx = -111.48734 + (((tickAnim - 18) / 1) * (-156.46401-(-111.48734)));
            yy = -32.99047 + (((tickAnim - 18) / 1) * (-79.52006-(-32.99047)));
            zz = 116.67477 + (((tickAnim - 18) / 1) * (234.60608-(116.67477)));
        }
        else if (tickAnim >= 19 && tickAnim < 21) {
            xx = -156.46401 + (((tickAnim - 19) / 2) * (-203.59273-(-156.46401)));
            yy = -79.52006 + (((tickAnim - 19) / 2) * (-56.92175-(-79.52006)));
            zz = 234.60608 + (((tickAnim - 19) / 2) * (151.56145-(234.60608)));
        }
        else if (tickAnim >= 21 && tickAnim < 22) {
            xx = -203.59273 + (((tickAnim - 21) / 1) * (-111.48734-(-203.59273)));
            yy = -56.92175 + (((tickAnim - 21) / 1) * (-32.99047-(-56.92175)));
            zz = 151.56145 + (((tickAnim - 21) / 1) * (116.67477-(151.56145)));
        }
        else if (tickAnim >= 22 && tickAnim < 22) {
            xx = -111.48734 + (((tickAnim - 22) / 0) * (-156.46401-(-111.48734)));
            yy = -32.99047 + (((tickAnim - 22) / 0) * (-79.52006-(-32.99047)));
            zz = 116.67477 + (((tickAnim - 22) / 0) * (234.60608-(116.67477)));
        }
        else if (tickAnim >= 22 && tickAnim < 24) {
            xx = -156.46401 + (((tickAnim - 22) / 2) * (-203.59273-(-156.46401)));
            yy = -79.52006 + (((tickAnim - 22) / 2) * (-56.92175-(-79.52006)));
            zz = 234.60608 + (((tickAnim - 22) / 2) * (151.56145-(234.60608)));
        }
        else if (tickAnim >= 24 && tickAnim < 25) {
            xx = -203.59273 + (((tickAnim - 24) / 1) * (-111.48734-(-203.59273)));
            yy = -56.92175 + (((tickAnim - 24) / 1) * (-32.99047-(-56.92175)));
            zz = 151.56145 + (((tickAnim - 24) / 1) * (116.67477-(151.56145)));
        }
        else if (tickAnim >= 25 && tickAnim < 26) {
            xx = -111.48734 + (((tickAnim - 25) / 1) * (-156.46401-(-111.48734)));
            yy = -32.99047 + (((tickAnim - 25) / 1) * (-79.52006-(-32.99047)));
            zz = 116.67477 + (((tickAnim - 25) / 1) * (234.60608-(116.67477)));
        }
        else if (tickAnim >= 26 && tickAnim < 27) {
            xx = -156.46401 + (((tickAnim - 26) / 1) * (-203.59273-(-156.46401)));
            yy = -79.52006 + (((tickAnim - 26) / 1) * (-56.92175-(-79.52006)));
            zz = 234.60608 + (((tickAnim - 26) / 1) * (151.56145-(234.60608)));
        }
        else if (tickAnim >= 27 && tickAnim < 28) {
            xx = -203.59273 + (((tickAnim - 27) / 1) * (-111.48734-(-203.59273)));
            yy = -56.92175 + (((tickAnim - 27) / 1) * (-32.99047-(-56.92175)));
            zz = 151.56145 + (((tickAnim - 27) / 1) * (116.67477-(151.56145)));
        }
        else if (tickAnim >= 28 && tickAnim < 29) {
            xx = -111.48734 + (((tickAnim - 28) / 1) * (-156.46401-(-111.48734)));
            yy = -32.99047 + (((tickAnim - 28) / 1) * (-79.52006-(-32.99047)));
            zz = 116.67477 + (((tickAnim - 28) / 1) * (234.60608-(116.67477)));
        }
        else if (tickAnim >= 29 && tickAnim < 30) {
            xx = -156.46401 + (((tickAnim - 29) / 1) * (-203.59273-(-156.46401)));
            yy = -79.52006 + (((tickAnim - 29) / 1) * (-56.92175-(-79.52006)));
            zz = 234.60608 + (((tickAnim - 29) / 1) * (151.56145-(234.60608)));
        }
        else if (tickAnim >= 30 && tickAnim < 31) {
            xx = -203.59273 + (((tickAnim - 30) / 1) * (-111.48734-(-203.59273)));
            yy = -56.92175 + (((tickAnim - 30) / 1) * (-32.99047-(-56.92175)));
            zz = 151.56145 + (((tickAnim - 30) / 1) * (116.67477-(151.56145)));
        }
        else if (tickAnim >= 31 && tickAnim < 32) {
            xx = -111.48734 + (((tickAnim - 31) / 1) * (-156.46401-(-111.48734)));
            yy = -32.99047 + (((tickAnim - 31) / 1) * (-79.52006-(-32.99047)));
            zz = 116.67477 + (((tickAnim - 31) / 1) * (234.60608-(116.67477)));
        }
        else if (tickAnim >= 32 && tickAnim < 34) {
            xx = -156.46401 + (((tickAnim - 32) / 2) * (-203.59273-(-156.46401)));
            yy = -79.52006 + (((tickAnim - 32) / 2) * (-56.92175-(-79.52006)));
            zz = 234.60608 + (((tickAnim - 32) / 2) * (151.56145-(234.60608)));
        }
        else if (tickAnim >= 34 && tickAnim < 34) {
            xx = -203.59273 + (((tickAnim - 34) / 0) * (-111.48734-(-203.59273)));
            yy = -56.92175 + (((tickAnim - 34) / 0) * (-32.99047-(-56.92175)));
            zz = 151.56145 + (((tickAnim - 34) / 0) * (116.67477-(151.56145)));
        }
        else if (tickAnim >= 34 && tickAnim < 35) {
            xx = -111.48734 + (((tickAnim - 34) / 1) * (-156.46401-(-111.48734)));
            yy = -32.99047 + (((tickAnim - 34) / 1) * (-79.52006-(-32.99047)));
            zz = 116.67477 + (((tickAnim - 34) / 1) * (234.60608-(116.67477)));
        }
        else if (tickAnim >= 35 && tickAnim < 37) {
            xx = -156.46401 + (((tickAnim - 35) / 2) * (-203.59273-(-156.46401)));
            yy = -79.52006 + (((tickAnim - 35) / 2) * (-56.92175-(-79.52006)));
            zz = 234.60608 + (((tickAnim - 35) / 2) * (151.56145-(234.60608)));
        }
        else if (tickAnim >= 37 && tickAnim < 38) {
            xx = -203.59273 + (((tickAnim - 37) / 1) * (-111.48734-(-203.59273)));
            yy = -56.92175 + (((tickAnim - 37) / 1) * (-32.99047-(-56.92175)));
            zz = 151.56145 + (((tickAnim - 37) / 1) * (116.67477-(151.56145)));
        }
        else if (tickAnim >= 38 && tickAnim < 38) {
            xx = -111.48734 + (((tickAnim - 38) / 0) * (-156.46401-(-111.48734)));
            yy = -32.99047 + (((tickAnim - 38) / 0) * (-79.52006-(-32.99047)));
            zz = 116.67477 + (((tickAnim - 38) / 0) * (234.60608-(116.67477)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightForewing, rightForewing.rotateAngleX + (float) Math.toRadians(xx), rightForewing.rotateAngleY + (float) Math.toRadians(yy), rightForewing.rotateAngleZ + (float) Math.toRadians(zz));



        this.setRotateAngle(leftLeg1, leftLeg1.rotateAngleX + (float) Math.toRadians(-21.597+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*(562))+50)*4), leftLeg1.rotateAngleY + (float) Math.toRadians(-33.54157), leftLeg1.rotateAngleZ + (float) Math.toRadians(-21.33714));


        this.setRotateAngle(rightLeg1, rightLeg1.rotateAngleX + (float) Math.toRadians(-21.597+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*(562))+70)*4), rightLeg1.rotateAngleY + (float) Math.toRadians(33.54157), rightLeg1.rotateAngleZ + (float) Math.toRadians(21.33714));


        this.setRotateAngle(rightAntenna, rightAntenna.rotateAngleX + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D)))*(562)+40)*10), rightAntenna.rotateAngleY + (float) Math.toRadians(-(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*187+120))*10)), rightAntenna.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(leftAntenna, leftAntenna.rotateAngleX + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D)))*(562)+40)*10), leftAntenna.rotateAngleY + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*187))*10), leftAntenna.rotateAngleZ + (float) Math.toRadians(0));



        if (tickAnim >= 0 && tickAnim < 2) {
            xx = 7.11395 + (((tickAnim - 0) / 2) * (-130.38605-(7.11395)));
            yy = -81.77832 + (((tickAnim - 0) / 2) * (-81.77832-(-81.77832)));
            zz = 78.21965 + (((tickAnim - 0) / 2) * (78.21965-(78.21965)));
        }
        else if (tickAnim >= 2 && tickAnim < 2) {
            xx = -130.38605 + (((tickAnim - 2) / 0) * (-85.90777-(-130.38605)));
            yy = -81.77832 + (((tickAnim - 2) / 0) * (-37.37375-(-81.77832)));
            zz = 78.21965 + (((tickAnim - 2) / 0) * (98.88218-(78.21965)));
        }
        else if (tickAnim >= 2 && tickAnim < 3) {
            xx = -85.90777 + (((tickAnim - 2) / 1) * (7.11395-(-85.90777)));
            yy = -37.37375 + (((tickAnim - 2) / 1) * (-81.77832-(-37.37375)));
            zz = 98.88218 + (((tickAnim - 2) / 1) * (78.21965-(98.88218)));
        }
        else if (tickAnim >= 3 && tickAnim < 5) {
            xx = 7.11395 + (((tickAnim - 3) / 2) * (-130.38605-(7.11395)));
            yy = -81.77832 + (((tickAnim - 3) / 2) * (-81.77832-(-81.77832)));
            zz = 78.21965 + (((tickAnim - 3) / 2) * (78.21965-(78.21965)));
        }
        else if (tickAnim >= 5 && tickAnim < 6) {
            xx = -130.38605 + (((tickAnim - 5) / 1) * (-85.90777-(-130.38605)));
            yy = -81.77832 + (((tickAnim - 5) / 1) * (-37.37375-(-81.77832)));
            zz = 78.21965 + (((tickAnim - 5) / 1) * (98.88218-(78.21965)));
        }
        else if (tickAnim >= 6 && tickAnim < 6) {
            xx = -85.90777 + (((tickAnim - 6) / 0) * (7.11395-(-85.90777)));
            yy = -37.37375 + (((tickAnim - 6) / 0) * (-81.77832-(-37.37375)));
            zz = 98.88218 + (((tickAnim - 6) / 0) * (78.21965-(98.88218)));
        }
        else if (tickAnim >= 6 && tickAnim < 8) {
            xx = 7.11395 + (((tickAnim - 6) / 2) * (-130.38605-(7.11395)));
            yy = -81.77832 + (((tickAnim - 6) / 2) * (-81.77832-(-81.77832)));
            zz = 78.21965 + (((tickAnim - 6) / 2) * (78.21965-(78.21965)));
        }
        else if (tickAnim >= 8 && tickAnim < 9) {
            xx = -130.38605 + (((tickAnim - 8) / 1) * (-85.90777-(-130.38605)));
            yy = -81.77832 + (((tickAnim - 8) / 1) * (-37.37375-(-81.77832)));
            zz = 78.21965 + (((tickAnim - 8) / 1) * (98.88218-(78.21965)));
        }
        else if (tickAnim >= 9 && tickAnim < 10) {
            xx = -85.90777 + (((tickAnim - 9) / 1) * (7.11395-(-85.90777)));
            yy = -37.37375 + (((tickAnim - 9) / 1) * (-81.77832-(-37.37375)));
            zz = 98.88218 + (((tickAnim - 9) / 1) * (78.21965-(98.88218)));
        }
        else if (tickAnim >= 10 && tickAnim < 11) {
            xx = 7.11395 + (((tickAnim - 10) / 1) * (-130.38605-(7.11395)));
            yy = -81.77832 + (((tickAnim - 10) / 1) * (-81.77832-(-81.77832)));
            zz = 78.21965 + (((tickAnim - 10) / 1) * (78.21965-(78.21965)));
        }
        else if (tickAnim >= 11 && tickAnim < 12) {
            xx = -130.38605 + (((tickAnim - 11) / 1) * (-85.90777-(-130.38605)));
            yy = -81.77832 + (((tickAnim - 11) / 1) * (-37.37375-(-81.77832)));
            zz = 78.21965 + (((tickAnim - 11) / 1) * (98.88218-(78.21965)));
        }
        else if (tickAnim >= 12 && tickAnim < 13) {
            xx = -85.90777 + (((tickAnim - 12) / 1) * (7.11395-(-85.90777)));
            yy = -37.37375 + (((tickAnim - 12) / 1) * (-81.77832-(-37.37375)));
            zz = 98.88218 + (((tickAnim - 12) / 1) * (78.21965-(98.88218)));
        }
        else if (tickAnim >= 13 && tickAnim < 14) {
            xx = 7.11395 + (((tickAnim - 13) / 1) * (-130.38605-(7.11395)));
            yy = -81.77832 + (((tickAnim - 13) / 1) * (-81.77832-(-81.77832)));
            zz = 78.21965 + (((tickAnim - 13) / 1) * (78.21965-(78.21965)));
        }
        else if (tickAnim >= 14 && tickAnim < 15) {
            xx = -130.38605 + (((tickAnim - 14) / 1) * (-85.90777-(-130.38605)));
            yy = -81.77832 + (((tickAnim - 14) / 1) * (-37.37375-(-81.77832)));
            zz = 78.21965 + (((tickAnim - 14) / 1) * (98.88218-(78.21965)));
        }
        else if (tickAnim >= 15 && tickAnim < 16) {
            xx = -85.90777 + (((tickAnim - 15) / 1) * (7.11395-(-85.90777)));
            yy = -37.37375 + (((tickAnim - 15) / 1) * (-81.77832-(-37.37375)));
            zz = 98.88218 + (((tickAnim - 15) / 1) * (78.21965-(98.88218)));
        }
        else if (tickAnim >= 16 && tickAnim < 18) {
            xx = 7.11395 + (((tickAnim - 16) / 2) * (-130.38605-(7.11395)));
            yy = -81.77832 + (((tickAnim - 16) / 2) * (-81.77832-(-81.77832)));
            zz = 78.21965 + (((tickAnim - 16) / 2) * (78.21965-(78.21965)));
        }
        else if (tickAnim >= 18 && tickAnim < 18) {
            xx = -130.38605 + (((tickAnim - 18) / 0) * (-85.90777-(-130.38605)));
            yy = -81.77832 + (((tickAnim - 18) / 0) * (-37.37375-(-81.77832)));
            zz = 78.21965 + (((tickAnim - 18) / 0) * (98.88218-(78.21965)));
        }
        else if (tickAnim >= 18 && tickAnim < 19) {
            xx = -85.90777 + (((tickAnim - 18) / 1) * (7.11395-(-85.90777)));
            yy = -37.37375 + (((tickAnim - 18) / 1) * (-81.77832-(-37.37375)));
            zz = 98.88218 + (((tickAnim - 18) / 1) * (78.21965-(98.88218)));
        }
        else if (tickAnim >= 19 && tickAnim < 21) {
            xx = 7.11395 + (((tickAnim - 19) / 2) * (-130.38605-(7.11395)));
            yy = -81.77832 + (((tickAnim - 19) / 2) * (-81.77832-(-81.77832)));
            zz = 78.21965 + (((tickAnim - 19) / 2) * (78.21965-(78.21965)));
        }
        else if (tickAnim >= 21 && tickAnim < 22) {
            xx = -130.38605 + (((tickAnim - 21) / 1) * (-85.90777-(-130.38605)));
            yy = -81.77832 + (((tickAnim - 21) / 1) * (-37.37375-(-81.77832)));
            zz = 78.21965 + (((tickAnim - 21) / 1) * (98.88218-(78.21965)));
        }
        else if (tickAnim >= 22 && tickAnim < 22) {
            xx = -85.90777 + (((tickAnim - 22) / 0) * (7.11395-(-85.90777)));
            yy = -37.37375 + (((tickAnim - 22) / 0) * (-81.77832-(-37.37375)));
            zz = 98.88218 + (((tickAnim - 22) / 0) * (78.21965-(98.88218)));
        }
        else if (tickAnim >= 22 && tickAnim < 24) {
            xx = 7.11395 + (((tickAnim - 22) / 2) * (-130.38605-(7.11395)));
            yy = -81.77832 + (((tickAnim - 22) / 2) * (-81.77832-(-81.77832)));
            zz = 78.21965 + (((tickAnim - 22) / 2) * (78.21965-(78.21965)));
        }
        else if (tickAnim >= 24 && tickAnim < 25) {
            xx = -130.38605 + (((tickAnim - 24) / 1) * (-85.90777-(-130.38605)));
            yy = -81.77832 + (((tickAnim - 24) / 1) * (-37.37375-(-81.77832)));
            zz = 78.21965 + (((tickAnim - 24) / 1) * (98.88218-(78.21965)));
        }
        else if (tickAnim >= 25 && tickAnim < 26) {
            xx = -85.90777 + (((tickAnim - 25) / 1) * (7.11395-(-85.90777)));
            yy = -37.37375 + (((tickAnim - 25) / 1) * (-81.77832-(-37.37375)));
            zz = 98.88218 + (((tickAnim - 25) / 1) * (78.21965-(98.88218)));
        }
        else if (tickAnim >= 26 && tickAnim < 27) {
            xx = 7.11395 + (((tickAnim - 26) / 1) * (-130.38605-(7.11395)));
            yy = -81.77832 + (((tickAnim - 26) / 1) * (-81.77832-(-81.77832)));
            zz = 78.21965 + (((tickAnim - 26) / 1) * (78.21965-(78.21965)));
        }
        else if (tickAnim >= 27 && tickAnim < 28) {
            xx = -130.38605 + (((tickAnim - 27) / 1) * (-85.90777-(-130.38605)));
            yy = -81.77832 + (((tickAnim - 27) / 1) * (-37.37375-(-81.77832)));
            zz = 78.21965 + (((tickAnim - 27) / 1) * (98.88218-(78.21965)));
        }
        else if (tickAnim >= 28 && tickAnim < 29) {
            xx = -85.90777 + (((tickAnim - 28) / 1) * (7.11395-(-85.90777)));
            yy = -37.37375 + (((tickAnim - 28) / 1) * (-81.77832-(-37.37375)));
            zz = 98.88218 + (((tickAnim - 28) / 1) * (78.21965-(98.88218)));
        }
        else if (tickAnim >= 29 && tickAnim < 30) {
            xx = 7.11395 + (((tickAnim - 29) / 1) * (-130.38605-(7.11395)));
            yy = -81.77832 + (((tickAnim - 29) / 1) * (-81.77832-(-81.77832)));
            zz = 78.21965 + (((tickAnim - 29) / 1) * (78.21965-(78.21965)));
        }
        else if (tickAnim >= 30 && tickAnim < 31) {
            xx = -130.38605 + (((tickAnim - 30) / 1) * (-85.90777-(-130.38605)));
            yy = -81.77832 + (((tickAnim - 30) / 1) * (-37.37375-(-81.77832)));
            zz = 78.21965 + (((tickAnim - 30) / 1) * (98.88218-(78.21965)));
        }
        else if (tickAnim >= 31 && tickAnim < 32) {
            xx = -85.90777 + (((tickAnim - 31) / 1) * (7.11395-(-85.90777)));
            yy = -37.37375 + (((tickAnim - 31) / 1) * (-81.77832-(-37.37375)));
            zz = 98.88218 + (((tickAnim - 31) / 1) * (78.21965-(98.88218)));
        }
        else if (tickAnim >= 32 && tickAnim < 34) {
            xx = 7.11395 + (((tickAnim - 32) / 2) * (-130.38605-(7.11395)));
            yy = -81.77832 + (((tickAnim - 32) / 2) * (-81.77832-(-81.77832)));
            zz = 78.21965 + (((tickAnim - 32) / 2) * (78.21965-(78.21965)));
        }
        else if (tickAnim >= 34 && tickAnim < 34) {
            xx = -130.38605 + (((tickAnim - 34) / 0) * (-85.90777-(-130.38605)));
            yy = -81.77832 + (((tickAnim - 34) / 0) * (-37.37375-(-81.77832)));
            zz = 78.21965 + (((tickAnim - 34) / 0) * (98.88218-(78.21965)));
        }
        else if (tickAnim >= 34 && tickAnim < 35) {
            xx = -85.90777 + (((tickAnim - 34) / 1) * (7.11395-(-85.90777)));
            yy = -37.37375 + (((tickAnim - 34) / 1) * (-81.77832-(-37.37375)));
            zz = 98.88218 + (((tickAnim - 34) / 1) * (78.21965-(98.88218)));
        }
        else if (tickAnim >= 35 && tickAnim < 37) {
            xx = 7.11395 + (((tickAnim - 35) / 2) * (-130.38605-(7.11395)));
            yy = -81.77832 + (((tickAnim - 35) / 2) * (-81.77832-(-81.77832)));
            zz = 78.21965 + (((tickAnim - 35) / 2) * (78.21965-(78.21965)));
        }
        else if (tickAnim >= 37 && tickAnim < 38) {
            xx = -130.38605 + (((tickAnim - 37) / 1) * (-85.90777-(-130.38605)));
            yy = -81.77832 + (((tickAnim - 37) / 1) * (-37.37375-(-81.77832)));
            zz = 78.21965 + (((tickAnim - 37) / 1) * (98.88218-(78.21965)));
        }
        else if (tickAnim >= 38 && tickAnim < 38) {
            xx = -85.90777 + (((tickAnim - 38) / 0) * (7.11395-(-85.90777)));
            yy = -37.37375 + (((tickAnim - 38) / 0) * (-81.77832-(-37.37375)));
            zz = 98.88218 + (((tickAnim - 38) / 0) * (78.21965-(98.88218)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightHindwing, rightHindwing.rotateAngleX + (float) Math.toRadians(xx), rightHindwing.rotateAngleY + (float) Math.toRadians(yy), rightHindwing.rotateAngleZ + (float) Math.toRadians(zz));



    }
    public void animClimbing(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime, boolean isStatic) {
        EntityPrehistoricFloraPlesioblattogryllus entity = (EntityPrehistoricFloraPlesioblattogryllus) entitylivingbaseIn;
        int animCycle = 8;
        double tickAnim = 0;
        if (!isStatic) {
            tickAnim = (entity.ticksExisted + entity.getTickOffset()) - (int) (Math.floor((double) (entity.ticksExisted + entity.getTickOffset()) / (double) animCycle) * (double) animCycle) + partialTickTime;
        }
        double xx = 0;
        double yy = 0;
        double zz = 0;
        this.setRotateAngle(root, root.rotateAngleX + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*900+90))*1), root.rotateAngleY + (float) Math.toRadians(0), root.rotateAngleZ + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*900))*3));


        this.setRotateAngle(leftCercus, leftCercus.rotateAngleX + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*900+120))*3), leftCercus.rotateAngleY + (float) Math.toRadians(0), leftCercus.rotateAngleZ + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*900))*3));


        this.setRotateAngle(rightCercus, rightCercus.rotateAngleX + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*900+110))*3), rightCercus.rotateAngleY + (float) Math.toRadians(0), rightCercus.rotateAngleZ + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*900))*3));



        if (tickAnim >= 0 && tickAnim < 4) {
            xx = 0 + (((tickAnim - 0) / 4) * (0-(0)));
            yy = -22.5 + (((tickAnim - 0) / 4) * (10-(-22.5)));
            zz = 0 + (((tickAnim - 0) / 4) * (0-(0)));
        }
        else if (tickAnim >= 4 && tickAnim < 6) {
            xx = 0 + (((tickAnim - 4) / 2) * (11.42781-(0)));
            yy = 10 + (((tickAnim - 4) / 2) * (-13.85105-(10)));
            zz = 0 + (((tickAnim - 4) / 2) * (5.95556-(0)));
        }
        else if (tickAnim >= 6 && tickAnim < 8) {
            xx = 11.42781 + (((tickAnim - 6) / 2) * (0-(11.42781)));
            yy = -13.85105 + (((tickAnim - 6) / 2) * (-22.5-(-13.85105)));
            zz = 5.95556 + (((tickAnim - 6) / 2) * (0-(5.95556)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightLeg2, rightLeg2.rotateAngleX + (float) Math.toRadians(xx), rightLeg2.rotateAngleY + (float) Math.toRadians(yy), rightLeg2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 2) {
            xx = 0 + (((tickAnim - 0) / 2) * (16.0129-(0)));
            yy = 10 + (((tickAnim - 0) / 2) * (-22.84145-(10)));
            zz = 0 + (((tickAnim - 0) / 2) * (25.41377-(0)));
        }
        else if (tickAnim >= 2 && tickAnim < 4) {
            xx = 16.0129 + (((tickAnim - 2) / 2) * (0-(16.0129)));
            yy = -22.84145 + (((tickAnim - 2) / 2) * (-25-(-22.84145)));
            zz = 25.41377 + (((tickAnim - 2) / 2) * (0-(25.41377)));
        }
        else if (tickAnim >= 4 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 4) / 4) * (0-(0)));
            yy = -25 + (((tickAnim - 4) / 4) * (10-(-25)));
            zz = 0 + (((tickAnim - 4) / 4) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightLeg3, rightLeg3.rotateAngleX + (float) Math.toRadians(xx), rightLeg3.rotateAngleY + (float) Math.toRadians(yy), rightLeg3.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 4) {
            xx = 0 + (((tickAnim - 0) / 4) * (0-(0)));
            yy = 25 + (((tickAnim - 0) / 4) * (-10-(25)));
            zz = 0 + (((tickAnim - 0) / 4) * (0-(0)));
        }
        else if (tickAnim >= 4 && tickAnim < 6) {
            xx = 0 + (((tickAnim - 4) / 2) * (16.0129-(0)));
            yy = -10 + (((tickAnim - 4) / 2) * (22.84145-(-10)));
            zz = 0 + (((tickAnim - 4) / 2) * (-25.41377-(0)));
        }
        else if (tickAnim >= 6 && tickAnim < 8) {
            xx = 16.0129 + (((tickAnim - 6) / 2) * (0-(16.0129)));
            yy = 22.84145 + (((tickAnim - 6) / 2) * (25-(22.84145)));
            zz = -25.41377 + (((tickAnim - 6) / 2) * (0-(-25.41377)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftLeg3, leftLeg3.rotateAngleX + (float) Math.toRadians(xx), leftLeg3.rotateAngleY + (float) Math.toRadians(yy), leftLeg3.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 2) {
            xx = 0 + (((tickAnim - 0) / 2) * (11.42781-(0)));
            yy = -10 + (((tickAnim - 0) / 2) * (13.85105-(-10)));
            zz = 0 + (((tickAnim - 0) / 2) * (-5.95556-(0)));
        }
        else if (tickAnim >= 2 && tickAnim < 4) {
            xx = 11.42781 + (((tickAnim - 2) / 2) * (0-(11.42781)));
            yy = 13.85105 + (((tickAnim - 2) / 2) * (22.5-(13.85105)));
            zz = -5.95556 + (((tickAnim - 2) / 2) * (0-(-5.95556)));
        }
        else if (tickAnim >= 4 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 4) / 4) * (0-(0)));
            yy = 22.5 + (((tickAnim - 4) / 4) * (-10-(22.5)));
            zz = 0 + (((tickAnim - 4) / 4) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftLeg2, leftLeg2.rotateAngleX + (float) Math.toRadians(xx), leftLeg2.rotateAngleY + (float) Math.toRadians(yy), leftLeg2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 4) {
            xx = 0 + (((tickAnim - 0) / 4) * (0-(0)));
            yy = 7.5 + (((tickAnim - 0) / 4) * (-65-(7.5)));
            zz = 0 + (((tickAnim - 0) / 4) * (0-(0)));
        }
        else if (tickAnim >= 4 && tickAnim < 6) {
            xx = 0 + (((tickAnim - 4) / 2) * (-27.5-(0)));
            yy = -65 + (((tickAnim - 4) / 2) * (-32-(-65)));
            zz = 0 + (((tickAnim - 4) / 2) * (0-(0)));
        }
        else if (tickAnim >= 6 && tickAnim < 8) {
            xx = -27.5 + (((tickAnim - 6) / 2) * (0-(-27.5)));
            yy = -32 + (((tickAnim - 6) / 2) * (7.5-(-32)));
            zz = 0 + (((tickAnim - 6) / 2) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftLeg1, leftLeg1.rotateAngleX + (float) Math.toRadians(xx), leftLeg1.rotateAngleY + (float) Math.toRadians(yy), leftLeg1.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 2) {
            xx = 0 + (((tickAnim - 0) / 2) * (-27.5-(0)));
            yy = 65 + (((tickAnim - 0) / 2) * (32-(65)));
            zz = 0 + (((tickAnim - 0) / 2) * (0-(0)));
        }
        else if (tickAnim >= 2 && tickAnim < 4) {
            xx = -27.5 + (((tickAnim - 2) / 2) * (0-(-27.5)));
            yy = 32 + (((tickAnim - 2) / 2) * (-7.5-(32)));
            zz = 0 + (((tickAnim - 2) / 2) * (0-(0)));
        }
        else if (tickAnim >= 4 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 4) / 4) * (0-(0)));
            yy = -7.5 + (((tickAnim - 4) / 4) * (65-(-7.5)));
            zz = 0 + (((tickAnim - 4) / 4) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightLeg1, rightLeg1.rotateAngleX + (float) Math.toRadians(xx), rightLeg1.rotateAngleY + (float) Math.toRadians(yy), rightLeg1.rotateAngleZ + (float) Math.toRadians(zz));



        this.setRotateAngle(rightAntenna, rightAntenna.rotateAngleX + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*900))*10), rightAntenna.rotateAngleY + (float) Math.toRadians(0), rightAntenna.rotateAngleZ + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*900+100))*5));


        this.setRotateAngle(leftAntenna, leftAntenna.rotateAngleX + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*900))*10), leftAntenna.rotateAngleY + (float) Math.toRadians(0), leftAntenna.rotateAngleZ + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*900+50))*5));

    }
    public void animate(IAnimatedEntity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        EntityPrehistoricFloraLandClimbingGlidingBase e = (EntityPrehistoricFloraLandClimbingGlidingBase) entity;
        animator.update(entity);
        //N/A
    }

}
