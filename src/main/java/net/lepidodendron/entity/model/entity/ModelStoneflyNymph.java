package net.lepidodendron.entity.model.entity;

import net.ilexiconn.llibrary.client.model.ModelAnimator;
import net.ilexiconn.llibrary.client.model.tools.AdvancedModelRenderer;
import net.ilexiconn.llibrary.server.animation.IAnimatedEntity;
import net.lepidodendron.entity.EntityPrehistoricFloraAquaticBugNymph;
import net.lepidodendron.entity.model.ModelBasePalaeopedia;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLiving;
import net.minecraft.entity.EntityLivingBase;

public class ModelStoneflyNymph extends ModelBasePalaeopedia {
    private final AdvancedModelRenderer stonefly;
    private final AdvancedModelRenderer thorax;
    private final AdvancedModelRenderer cube_r1;
    private final AdvancedModelRenderer cube_r2;
    private final AdvancedModelRenderer cube_r3;
    private final AdvancedModelRenderer cube_r4;
    private final AdvancedModelRenderer cube_r5;
    private final AdvancedModelRenderer head;
    private final AdvancedModelRenderer cube_r6;
    private final AdvancedModelRenderer cube_r7;
    private final AdvancedModelRenderer leftAntenna;
    private final AdvancedModelRenderer cube_r8;
    private final AdvancedModelRenderer rightAntenna;
    private final AdvancedModelRenderer cube_r9;
    private final AdvancedModelRenderer rightLeg3;
    private final AdvancedModelRenderer cube_r10;
    private final AdvancedModelRenderer leftLeg3;
    private final AdvancedModelRenderer cube_r11;
    private final AdvancedModelRenderer leftLeg2;
    private final AdvancedModelRenderer cube_r12;
    private final AdvancedModelRenderer leftLeg1;
    private final AdvancedModelRenderer cube_r13;
    private final AdvancedModelRenderer rightLeg2;
    private final AdvancedModelRenderer cube_r14;
    private final AdvancedModelRenderer rightLeg1;
    private final AdvancedModelRenderer cube_r15;
    private final AdvancedModelRenderer abdomen;
    private final AdvancedModelRenderer rightCercus;
    private final AdvancedModelRenderer cube_r16;
    private final AdvancedModelRenderer leftCercus;
    private final AdvancedModelRenderer cube_r17;
    private final AdvancedModelRenderer leftForewing;
    private final AdvancedModelRenderer rightForewing;
    private final AdvancedModelRenderer rightHindwing;
    private final AdvancedModelRenderer rightHindwing2;
    private final AdvancedModelRenderer leftHindwing;
    private final AdvancedModelRenderer leftHindwing2;

    private ModelAnimator animator;


    public ModelStoneflyNymph() {
        this.textureWidth = 31;
        this.textureHeight = 60;

        this.stonefly = new AdvancedModelRenderer(this);
        this.stonefly.setRotationPoint(0.0F, 21.4F, 0.0F);


        this.thorax = new AdvancedModelRenderer(this);
        this.thorax.setRotationPoint(0.0F, 0.2F, -1.5F);
        this.stonefly.addChild(thorax);
        this.thorax.cubeList.add(new ModelBox(thorax, 0, 16, -0.5F, -0.4F, -2.9F, 1, 1, 3, 0.0F, false));

        this.cube_r1 = new AdvancedModelRenderer(this);
        this.cube_r1.setRotationPoint(-2.3F, 0.0F, 0.5F);
        this.thorax.addChild(cube_r1);
        this.setRotateAngle(cube_r1, -0.0582F, 0.0439F, 0.5558F);
        this.cube_r1.cubeList.add(new ModelBox(cube_r1, -5, 50, 0.1F, -0.4F, -2.5F, 2, 0, 5, 0.0F, true));

        this.cube_r2 = new AdvancedModelRenderer(this);
        this.cube_r2.setRotationPoint(2.3F, 0.0F, 0.5F);
        this.thorax.addChild(cube_r2);
        this.setRotateAngle(cube_r2, -0.0582F, -0.0439F, -0.5558F);
        this.cube_r2.cubeList.add(new ModelBox(cube_r2, -5, 50, -2.1F, -0.4F, -2.5F, 2, 0, 5, 0.0F, false));

        this.cube_r3 = new AdvancedModelRenderer(this);
        this.cube_r3.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.thorax.addChild(cube_r3);
        this.setRotateAngle(cube_r3, 0.1309F, 0.0F, 0.0F);
        this.cube_r3.cubeList.add(new ModelBox(cube_r3, 0, 45, -1.5F, -0.8F, 0.2F, 3, 0, 3, 0.0F, false));

        this.cube_r4 = new AdvancedModelRenderer(this);
        this.cube_r4.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.thorax.addChild(cube_r4);
        this.setRotateAngle(cube_r4, -0.1309F, 0.0F, 0.0F);
        this.cube_r4.cubeList.add(new ModelBox(cube_r4, 0, 4, -1.5F, -1.1F, -1.1F, 3, 2, 3, 0.0F, false));

        this.cube_r5 = new AdvancedModelRenderer(this);
        this.cube_r5.setRotationPoint(0.0F, -0.3F, -1.7F);
        this.thorax.addChild(cube_r5);
        this.setRotateAngle(cube_r5, 0.1745F, 0.0F, 0.0F);
        this.cube_r5.cubeList.add(new ModelBox(cube_r5, 24, 3, -1.0F, -0.4F, -0.4F, 2, 1, 1, -0.01F, false));
        this.cube_r5.cubeList.add(new ModelBox(cube_r5, 24, 6, -1.0F, -0.4F, -0.9F, 2, 1, 1, 0.0F, false));

        this.head = new AdvancedModelRenderer(this);
        this.head.setRotationPoint(0.0F, -0.0569F, -2.7854F);
        this.thorax.addChild(head);
        this.setRotateAngle(head, 0.2182F, 0.0F, 0.0F);
        this.head.cubeList.add(new ModelBox(head, 0, 27, -0.2F, -0.3733F, -1.4166F, 1, 1, 1, -0.01F, false));
        this.head.cubeList.add(new ModelBox(head, 10, 4, -0.8F, -0.3733F, -1.4166F, 1, 1, 1, -0.011F, false));
        this.head.cubeList.add(new ModelBox(head, 24, 9, -1.0F, -0.3733F, -0.9166F, 2, 1, 1, 0.0F, false));
        this.head.cubeList.add(new ModelBox(head, 5, 27, 0.4F, -0.5733F, -0.9166F, 1, 1, 1, -0.1F, false));
        this.head.cubeList.add(new ModelBox(head, 5, 27, -1.4F, -0.5733F, -0.9166F, 1, 1, 1, -0.1F, true));

        this.cube_r6 = new AdvancedModelRenderer(this);
        this.cube_r6.setRotationPoint(-0.7F, 0.1267F, -1.9166F);
        this.head.addChild(cube_r6);
        this.setRotateAngle(cube_r6, 0.0F, -0.3054F, 0.0F);
        this.cube_r6.cubeList.add(new ModelBox(cube_r6, 0, 4, 0.2F, -0.4F, -0.4F, 0, 1, 1, 0.0F, true));

        this.cube_r7 = new AdvancedModelRenderer(this);
        this.cube_r7.setRotationPoint(0.7F, 0.1267F, -1.9166F);
        this.head.addChild(cube_r7);
        this.setRotateAngle(cube_r7, 0.0F, 0.3054F, 0.0F);
        this.cube_r7.cubeList.add(new ModelBox(cube_r7, 0, 4, -0.2F, -0.4F, -0.4F, 0, 1, 1, 0.0F, false));

        this.leftAntenna = new AdvancedModelRenderer(this);
        this.leftAntenna.setRotationPoint(0.6692F, -0.0141F, -1.0183F);
        this.head.addChild(leftAntenna);
        this.setRotateAngle(leftAntenna, -0.2519F, -0.2549F, -0.2352F);


        this.cube_r8 = new AdvancedModelRenderer(this);
        this.cube_r8.setRotationPoint(-0.3F, 0.1F, 0.7F);
        this.leftAntenna.addChild(cube_r8);
        this.setRotateAngle(cube_r8, 0.0436F, 0.0F, 0.1745F);
        this.cube_r8.cubeList.add(new ModelBox(cube_r8, 0, 16, -0.2F, -0.3F, -10.6F, 9, 0, 10, 0.0F, false));

        this.rightAntenna = new AdvancedModelRenderer(this);
        this.rightAntenna.setRotationPoint(-0.6692F, -0.0141F, -1.0183F);
        this.head.addChild(rightAntenna);
        this.setRotateAngle(rightAntenna, -0.2519F, 0.2549F, 0.2352F);


        this.cube_r9 = new AdvancedModelRenderer(this);
        this.cube_r9.setRotationPoint(0.3F, 0.1F, 0.7F);
        this.rightAntenna.addChild(cube_r9);
        this.setRotateAngle(cube_r9, 0.0436F, 0.0F, -0.1745F);
        this.cube_r9.cubeList.add(new ModelBox(cube_r9, 0, 16, -8.8F, -0.3F, -10.6F, 9, 0, 10, 0.0F, true));

        this.rightLeg3 = new AdvancedModelRenderer(this);
        this.rightLeg3.setRotationPoint(-0.7F, 1.35F, 0.75F);
        this.thorax.addChild(rightLeg3);
        this.setRotateAngle(rightLeg3, 0.0F, -0.2618F, 0.0F);


        this.cube_r10 = new AdvancedModelRenderer(this);
        this.cube_r10.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.rightLeg3.addChild(cube_r10);
        this.setRotateAngle(cube_r10, 0.0F, 1.2217F, 0.0F);
        this.cube_r10.cubeList.add(new ModelBox(cube_r10, 0, 39, -9.0F, -2.0F, 0.0F, 9, 3, 0, 0.0F, true));

        this.leftLeg3 = new AdvancedModelRenderer(this);
        this.leftLeg3.setRotationPoint(0.7F, 1.35F, 0.75F);
        this.thorax.addChild(leftLeg3);
        this.setRotateAngle(leftLeg3, 0.0F, 0.2618F, 0.0F);


        this.cube_r11 = new AdvancedModelRenderer(this);
        this.cube_r11.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.leftLeg3.addChild(cube_r11);
        this.setRotateAngle(cube_r11, 0.0F, -1.2217F, 0.0F);
        this.cube_r11.cubeList.add(new ModelBox(cube_r11, 0, 39, 0.0F, -2.0F, 0.0F, 9, 3, 0, 0.0F, false));

        this.leftLeg2 = new AdvancedModelRenderer(this);
        this.leftLeg2.setRotationPoint(0.4F, 1.35F, -0.55F);
        this.thorax.addChild(leftLeg2);
        this.setRotateAngle(leftLeg2, 0.0F, 0.4363F, 0.0F);


        this.cube_r12 = new AdvancedModelRenderer(this);
        this.cube_r12.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.leftLeg2.addChild(cube_r12);
        this.setRotateAngle(cube_r12, 0.0F, -0.829F, 0.0F);
        this.cube_r12.cubeList.add(new ModelBox(cube_r12, 0, 0, 0.0F, -2.0F, 0.0F, 7, 3, 0, 0.0F, false));

        this.leftLeg1 = new AdvancedModelRenderer(this);
        this.leftLeg1.setRotationPoint(0.3F, -0.05F, -1.55F);
        this.thorax.addChild(leftLeg1);
        this.setRotateAngle(leftLeg1, 0.0F, -0.3491F, 0.0F);


        this.cube_r13 = new AdvancedModelRenderer(this);
        this.cube_r13.setRotationPoint(-0.3F, 0.7F, 0.5F);
        this.leftLeg1.addChild(cube_r13);
        this.setRotateAngle(cube_r13, 0.0F, 0.8727F, 0.0F);
        this.cube_r13.cubeList.add(new ModelBox(cube_r13, 0, 10, 0.5F, -1.3F, 0.0F, 5, 3, 0, 0.0F, false));

        this.rightLeg2 = new AdvancedModelRenderer(this);
        this.rightLeg2.setRotationPoint(-0.4F, 1.35F, -0.55F);
        this.thorax.addChild(rightLeg2);
        this.setRotateAngle(rightLeg2, 0.0F, -0.4363F, 0.0F);


        this.cube_r14 = new AdvancedModelRenderer(this);
        this.cube_r14.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.rightLeg2.addChild(cube_r14);
        this.setRotateAngle(cube_r14, 0.0F, 0.829F, 0.0F);
        this.cube_r14.cubeList.add(new ModelBox(cube_r14, 0, 0, -7.0F, -2.0F, 0.0F, 7, 3, 0, 0.0F, true));

        this.rightLeg1 = new AdvancedModelRenderer(this);
        this.rightLeg1.setRotationPoint(-0.3F, -0.05F, -1.55F);
        this.thorax.addChild(rightLeg1);
        this.setRotateAngle(rightLeg1, 0.0F, 0.3491F, 0.0F);


        this.cube_r15 = new AdvancedModelRenderer(this);
        this.cube_r15.setRotationPoint(0.3F, 0.7F, 0.5F);
        this.rightLeg1.addChild(cube_r15);
        this.setRotateAngle(cube_r15, 0.0F, -0.8727F, 0.0F);
        this.cube_r15.cubeList.add(new ModelBox(cube_r15, 0, 10, -5.5F, -1.3F, 0.0F, 5, 3, 0, 0.0F, true));

        this.abdomen = new AdvancedModelRenderer(this);
        this.abdomen.setRotationPoint(0.0F, -0.7667F, 1.3333F);
        this.thorax.addChild(abdomen);
        this.abdomen.cubeList.add(new ModelBox(abdomen, 9, 42, -1.0F, -0.0333F, -0.2333F, 2, 1, 7, 0.0F, false));
        this.abdomen.cubeList.add(new ModelBox(abdomen, 24, 0, -1.0F, 0.2667F, 6.7667F, 2, 1, 1, 0.0F, false));
        this.abdomen.cubeList.add(new ModelBox(abdomen, 0, 51, -1.0F, 0.6667F, -0.2333F, 2, 1, 7, -0.001F, false));

        this.rightCercus = new AdvancedModelRenderer(this);
        this.rightCercus.setRotationPoint(-0.729F, 0.7528F, 7.4573F);
        this.abdomen.addChild(rightCercus);


        this.cube_r16 = new AdvancedModelRenderer(this);
        this.cube_r16.setRotationPoint(0.129F, 0.0139F, 0.2093F);
        this.rightCercus.addChild(cube_r16);
        this.setRotateAngle(cube_r16, -0.122F, -0.1883F, 0.4889F);
        this.cube_r16.cubeList.add(new ModelBox(cube_r16, 0, 27, -4.5F, 0.0F, -0.1F, 5, 0, 11, 0.0F, true));

        this.leftCercus = new AdvancedModelRenderer(this);
        this.leftCercus.setRotationPoint(0.729F, 0.7528F, 7.4573F);
        this.abdomen.addChild(leftCercus);


        this.cube_r17 = new AdvancedModelRenderer(this);
        this.cube_r17.setRotationPoint(-0.129F, 0.0139F, 0.2093F);
        this.leftCercus.addChild(cube_r17);
        this.setRotateAngle(cube_r17, -0.122F, 0.1883F, -0.4889F);
        this.cube_r17.cubeList.add(new ModelBox(cube_r17, 0, 27, -0.5F, 0.0F, -0.1F, 5, 0, 11, 0.0F, false));

        this.leftForewing = new AdvancedModelRenderer(this);
        this.leftForewing.setRotationPoint(1.2F, -1.0F, -0.25F);
        this.thorax.addChild(leftForewing);
        this.setRotateAngle(leftForewing, 0.0F, 0.0873F, 0.0F);


        this.rightForewing = new AdvancedModelRenderer(this);
        this.rightForewing.setRotationPoint(-1.2F, -1.0F, -0.25F);
        this.thorax.addChild(rightForewing);
        this.setRotateAngle(rightForewing, 0.0F, -0.0873F, 0.0F);


        this.rightHindwing = new AdvancedModelRenderer(this);
        this.rightHindwing.setRotationPoint(-1.2F, -0.9F, 1.05F);
        this.thorax.addChild(rightHindwing);


        this.rightHindwing2 = new AdvancedModelRenderer(this);
        this.rightHindwing2.setRotationPoint(2.7298F, -0.1F, 5.1644F);
        this.rightHindwing.addChild(rightHindwing2);
        this.setRotateAngle(rightHindwing2, 0.0F, 0.0F, -3.1416F);


        this.leftHindwing = new AdvancedModelRenderer(this);
        this.leftHindwing.setRotationPoint(1.2F, -0.9F, 1.05F);
        this.thorax.addChild(leftHindwing);


        this.leftHindwing2 = new AdvancedModelRenderer(this);
        this.leftHindwing2.setRotationPoint(-2.7298F, -0.1F, 5.1644F);
        this.leftHindwing.addChild(leftHindwing2);
        this.setRotateAngle(leftHindwing2, 0.0F, 0.0F, -3.1416F);

        updateDefaultPose();
        animator = ModelAnimator.create();
    }

    @Override
    public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        animate((IAnimatedEntity) entity, f, f1, f2, f3, f4, f5);
        this.stonefly.render(f5);
    }
    public void renderStaticFloor(float f) {
        resetToDefaultPose();
    }
    public void renderStaticDisplayCase(float f) {
        resetToDefaultPose();
    }
    @Override
    public void renderStaticBook(float f) {
        //Rotations, positions and sizing:
        this.stonefly.offsetY = -1.4F;
        this.stonefly.offsetX = -0.5F;
        this.stonefly.rotateAngleY = (float)Math.toRadians(200);
        this.stonefly.rotateAngleX = (float)Math.toRadians(8);
        this.stonefly.rotateAngleZ = (float)Math.toRadians(-8);
        this.stonefly.scaleChildren = true;
        float scaler = 3.5F;
        this.stonefly.setScale(scaler, scaler, scaler);
        //Start of pose:

        //End of pose, now render the model:
        this.stonefly.render(f);
        //Reset rotations, positions and sizing:
        this.stonefly.setScale(1.0F, 1.0F, 1.0F);
        this.stonefly.scaleChildren = false;
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
       // this.body.offsetY = 0.4F;
        //this.body.offsetY = -0.2F;
        this.stonefly.offsetZ = -0.2F;

        float speed = 0.2F;
        float tailHdegree = 0.0F;
        float paddleVdegree = 0.05F;
        float paddleHdegree = 0.4F;
        float tailSwing = 0.50F;

        //mouthparts:
        this.walk(leftCercus, speed, -0.15F, false, 0, -0.1F, f2, 0.6F);
        this.walk(rightCercus, speed, 0.15F, false, -1, 0.1F, f2, 0.6F);
        this.walk(leftAntenna, speed, -0.15F, false, 0, -0.1F, f2, 0.6F);
        this.walk(rightAntenna, speed, 0.15F, false, -1, 0.1F, f2, 0.6F);



        EntityPrehistoricFloraAquaticBugNymph slimon = (EntityPrehistoricFloraAquaticBugNymph) e;

    }

    @Override
    public void setLivingAnimations(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime) {
        super.setLivingAnimations(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime);
        this.resetToDefaultPose();
        EntityPrehistoricFloraAquaticBugNymph ee = (EntityPrehistoricFloraAquaticBugNymph) entitylivingbaseIn;
        //Swimming pose:
        if (ee.isReallyInWater()) {
            if (ee.getIsMoving()) {
                animWalking(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime, false);
            }
            else { //in water but not moving:


            }
        }
    }

    public void animWalking(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime, boolean isStatic) {
        EntityPrehistoricFloraAquaticBugNymph entity = (EntityPrehistoricFloraAquaticBugNymph) entitylivingbaseIn;
        int animCycle = 12;
        double tickAnim = (entity.ticksExisted + entity.getTickOffset()) - (int) (Math.floor((double) (entity.ticksExisted + entity.getTickOffset()) / (double) animCycle) * (double) animCycle) + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;
        this.setRotateAngle(stonefly, stonefly.rotateAngleX + (float) Math.toRadians(0), stonefly.rotateAngleY + (float) Math.toRadians(0), stonefly.rotateAngleZ + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*562))*4));


        this.setRotateAngle(leftAntenna, leftAntenna.rotateAngleX + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*562))*2), leftAntenna.rotateAngleY + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*562))*10), leftAntenna.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(rightAntenna, rightAntenna.rotateAngleX + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*562))*2), rightAntenna.rotateAngleY + (float) (Math.toRadians(-(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*562+50))*10))), rightAntenna.rotateAngleZ + (float) Math.toRadians(0));



        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 0 + (((tickAnim - 0) / 3) * (9.9013-(0)));
            yy = 15 + (((tickAnim - 0) / 3) * (-1.12479-(15)));
            zz = 0 + (((tickAnim - 0) / 3) * (10.05539-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 6) {
            xx = 9.9013 + (((tickAnim - 3) / 3) * (0-(9.9013)));
            yy = -1.12479 + (((tickAnim - 3) / 3) * (-12.5-(-1.12479)));
            zz = 10.05539 + (((tickAnim - 3) / 3) * (0-(10.05539)));
        }
        else if (tickAnim >= 6 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 6) / 7) * (0-(0)));
            yy = -12.5 + (((tickAnim - 6) / 7) * (15-(-12.5)));
            zz = 0 + (((tickAnim - 6) / 7) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightLeg3, rightLeg3.rotateAngleX + (float) Math.toRadians(xx), rightLeg3.rotateAngleY + (float) Math.toRadians(yy), rightLeg3.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 6) {
            xx = 0 + (((tickAnim - 0) / 6) * (0-(0)));
            yy = 12.5 + (((tickAnim - 0) / 6) * (-15-(12.5)));
            zz = 0 + (((tickAnim - 0) / 6) * (0-(0)));
        }
        else if (tickAnim >= 6 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 6) / 4) * (9.9013-(0)));
            yy = -15 + (((tickAnim - 6) / 4) * (1.12479-(-15)));
            zz = 0 + (((tickAnim - 6) / 4) * (-10.05539-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 13) {
            xx = 9.9013 + (((tickAnim - 10) / 3) * (0-(9.9013)));
            yy = 1.12479 + (((tickAnim - 10) / 3) * (12.5-(1.12479)));
            zz = -10.05539 + (((tickAnim - 10) / 3) * (0-(-10.05539)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftLeg3, leftLeg3.rotateAngleX + (float) Math.toRadians(xx), leftLeg3.rotateAngleY + (float) Math.toRadians(yy), leftLeg3.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 0 + (((tickAnim - 0) / 3) * (3.99386-(0)));
            yy = -7.5 + (((tickAnim - 0) / 3) * (8.72367-(-7.5)));
            zz = 0 + (((tickAnim - 0) / 3) * (-20.19047-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 6) {
            xx = 3.99386 + (((tickAnim - 3) / 3) * (0-(3.99386)));
            yy = 8.72367 + (((tickAnim - 3) / 3) * (27.5-(8.72367)));
            zz = -20.19047 + (((tickAnim - 3) / 3) * (0-(-20.19047)));
        }
        else if (tickAnim >= 6 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 6) / 7) * (0-(0)));
            yy = 27.5 + (((tickAnim - 6) / 7) * (-7.5-(27.5)));
            zz = 0 + (((tickAnim - 6) / 7) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftLeg2, leftLeg2.rotateAngleX + (float) Math.toRadians(xx), leftLeg2.rotateAngleY + (float) Math.toRadians(yy), leftLeg2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 6) {
            xx = 0 + (((tickAnim - 0) / 6) * (0-(0)));
            yy = 22.5 + (((tickAnim - 0) / 6) * (-30-(22.5)));
            zz = 0 + (((tickAnim - 0) / 6) * (0-(0)));
        }
        else if (tickAnim >= 6 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 6) / 4) * (-18.0519-(0)));
            yy = -30 + (((tickAnim - 6) / 4) * (-7.63258-(-30)));
            zz = 0 + (((tickAnim - 6) / 4) * (-10.23235-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 13) {
            xx = -18.0519 + (((tickAnim - 10) / 3) * (0-(-18.0519)));
            yy = -7.63258 + (((tickAnim - 10) / 3) * (22.5-(-7.63258)));
            zz = -10.23235 + (((tickAnim - 10) / 3) * (0-(-10.23235)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftLeg1, leftLeg1.rotateAngleX + (float) Math.toRadians(xx), leftLeg1.rotateAngleY + (float) Math.toRadians(yy), leftLeg1.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 6) {
            xx = 0 + (((tickAnim - 0) / 6) * (0-(0)));
            yy = -27.5 + (((tickAnim - 0) / 6) * (7.5-(-27.5)));
            zz = 0 + (((tickAnim - 0) / 6) * (0-(0)));
        }
        else if (tickAnim >= 6 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 6) / 4) * (3.99386-(0)));
            yy = 7.5 + (((tickAnim - 6) / 4) * (-8.72367-(7.5)));
            zz = 0 + (((tickAnim - 6) / 4) * (20.19047-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 13) {
            xx = 3.99386 + (((tickAnim - 10) / 3) * (0-(3.99386)));
            yy = -8.72367 + (((tickAnim - 10) / 3) * (-27.5-(-8.72367)));
            zz = 20.19047 + (((tickAnim - 10) / 3) * (0-(20.19047)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightLeg2, rightLeg2.rotateAngleX + (float) Math.toRadians(xx), rightLeg2.rotateAngleY + (float) Math.toRadians(yy), rightLeg2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 0 + (((tickAnim - 0) / 3) * (-18.0519-(0)));
            yy = 30 + (((tickAnim - 0) / 3) * (7.63258-(30)));
            zz = 0 + (((tickAnim - 0) / 3) * (10.23235-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 6) {
            xx = -18.0519 + (((tickAnim - 3) / 3) * (0-(-18.0519)));
            yy = 7.63258 + (((tickAnim - 3) / 3) * (-22.5-(7.63258)));
            zz = 10.23235 + (((tickAnim - 3) / 3) * (0-(10.23235)));
        }
        else if (tickAnim >= 6 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 6) / 7) * (0-(0)));
            yy = -22.5 + (((tickAnim - 6) / 7) * (30-(-22.5)));
            zz = 0 + (((tickAnim - 6) / 7) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightLeg1, rightLeg1.rotateAngleX + (float) Math.toRadians(xx), rightLeg1.rotateAngleY + (float) Math.toRadians(yy), rightLeg1.rotateAngleZ + (float) Math.toRadians(zz));



        this.setRotateAngle(abdomen, abdomen.rotateAngleX + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*562))*2), abdomen.rotateAngleY + (float) Math.toRadians(0), abdomen.rotateAngleZ + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*562+90))*2));


        this.setRotateAngle(rightCercus, rightCercus.rotateAngleX + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*562))*4), rightCercus.rotateAngleY + (float) Math.toRadians(-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*562))*2), rightCercus.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(leftCercus, leftCercus.rotateAngleX + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*562))*4), leftCercus.rotateAngleY + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*562))*2), leftCercus.rotateAngleZ + (float) Math.toRadians(0));

    }

    public void animate(IAnimatedEntity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        EntityPrehistoricFloraAquaticBugNymph e = (EntityPrehistoricFloraAquaticBugNymph) entity;
        animator.update(entity);

    }
}
