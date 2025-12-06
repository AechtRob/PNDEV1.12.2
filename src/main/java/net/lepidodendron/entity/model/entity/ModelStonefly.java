package net.lepidodendron.entity.model.entity;

import net.ilexiconn.llibrary.client.model.tools.AdvancedModelRenderer;
import net.lepidodendron.entity.EntityPrehistoricFloraStonefly;
import net.lepidodendron.entity.model.ModelBasePalaeopedia;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;

public class ModelStonefly extends ModelBasePalaeopedia {
    private final AdvancedModelRenderer stonefly;
    private final AdvancedModelRenderer thorax;
    private final AdvancedModelRenderer cube_r1;
    private final AdvancedModelRenderer cube_r2;
    private final AdvancedModelRenderer head;
    private final AdvancedModelRenderer cube_r3;
    private final AdvancedModelRenderer cube_r4;
    private final AdvancedModelRenderer leftAntenna;
    private final AdvancedModelRenderer cube_r5;
    private final AdvancedModelRenderer rightAntenna;
    private final AdvancedModelRenderer cube_r6;
    private final AdvancedModelRenderer rightLeg3;
    private final AdvancedModelRenderer cube_r7;
    private final AdvancedModelRenderer leftLeg3;
    private final AdvancedModelRenderer cube_r8;
    private final AdvancedModelRenderer leftLeg2;
    private final AdvancedModelRenderer cube_r9;
    private final AdvancedModelRenderer leftLeg1;
    private final AdvancedModelRenderer cube_r10;
    private final AdvancedModelRenderer rightLeg2;
    private final AdvancedModelRenderer cube_r11;
    private final AdvancedModelRenderer rightLeg1;
    private final AdvancedModelRenderer cube_r12;
    private final AdvancedModelRenderer abdomen;
    private final AdvancedModelRenderer rightCercus;
    private final AdvancedModelRenderer cube_r13;
    private final AdvancedModelRenderer leftCercus;
    private final AdvancedModelRenderer cube_r14;
    private final AdvancedModelRenderer leftForewing;
    private final AdvancedModelRenderer rightForewing;
    private final AdvancedModelRenderer rightHindwing;
    private final AdvancedModelRenderer rightHindwing2;
    private final AdvancedModelRenderer leftHindwing;
    private final AdvancedModelRenderer leftHindwing2;

    public ModelStonefly() {
        this.textureWidth = 64;
        this.textureHeight = 64;

        this.stonefly = new AdvancedModelRenderer(this);
        this.stonefly.setRotationPoint(0.0F, 21.4F, 0.0F);


        this.thorax = new AdvancedModelRenderer(this);
        this.thorax.setRotationPoint(0.0F, 0.2F, -1.5F);
        this.stonefly.addChild(thorax);
        this.thorax.cubeList.add(new ModelBox(thorax, 0, 16, -0.5F, -0.4F, -2.9F, 1, 1, 3, 0.0F, false));

        this.cube_r1 = new AdvancedModelRenderer(this);
        this.cube_r1.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.thorax.addChild(cube_r1);
        this.setRotateAngle(cube_r1, -0.1309F, 0.0F, 0.0F);
        this.cube_r1.cubeList.add(new ModelBox(cube_r1, 0, 4, -1.5F, -1.1F, -1.1F, 3, 2, 3, 0.0F, false));

        this.cube_r2 = new AdvancedModelRenderer(this);
        this.cube_r2.setRotationPoint(0.0F, -0.3F, -1.7F);
        this.thorax.addChild(cube_r2);
        this.setRotateAngle(cube_r2, 0.1745F, 0.0F, 0.0F);
        this.cube_r2.cubeList.add(new ModelBox(cube_r2, 24, 3, -1.0F, -0.4F, -0.4F, 2, 1, 1, -0.01F, false));
        this.cube_r2.cubeList.add(new ModelBox(cube_r2, 24, 6, -1.0F, -0.4F, -0.9F, 2, 1, 1, 0.0F, false));

        this.head = new AdvancedModelRenderer(this);
        this.head.setRotationPoint(0.0F, -0.0569F, -2.7854F);
        this.thorax.addChild(head);
        this.setRotateAngle(head, 0.2182F, 0.0F, 0.0F);
        this.head.cubeList.add(new ModelBox(head, 0, 27, -0.2F, -0.3733F, -1.4166F, 1, 1, 1, -0.01F, false));
        this.head.cubeList.add(new ModelBox(head, 10, 4, -0.8F, -0.3733F, -1.4166F, 1, 1, 1, -0.011F, false));
        this.head.cubeList.add(new ModelBox(head, 24, 9, -1.0F, -0.3733F, -0.9166F, 2, 1, 1, 0.0F, false));
        this.head.cubeList.add(new ModelBox(head, 5, 27, 0.4F, -0.5733F, -0.9166F, 1, 1, 1, -0.1F, false));
        this.head.cubeList.add(new ModelBox(head, 5, 27, -1.4F, -0.5733F, -0.9166F, 1, 1, 1, -0.1F, true));

        this.cube_r3 = new AdvancedModelRenderer(this);
        this.cube_r3.setRotationPoint(-0.7F, 0.1267F, -1.9166F);
        this.head.addChild(cube_r3);
        this.setRotateAngle(cube_r3, 0.0F, -0.3054F, 0.0F);
        this.cube_r3.cubeList.add(new ModelBox(cube_r3, 0, 4, 0.2F, -0.4F, -0.4F, 0, 1, 1, 0.0F, true));

        this.cube_r4 = new AdvancedModelRenderer(this);
        this.cube_r4.setRotationPoint(0.7F, 0.1267F, -1.9166F);
        this.head.addChild(cube_r4);
        this.setRotateAngle(cube_r4, 0.0F, 0.3054F, 0.0F);
        this.cube_r4.cubeList.add(new ModelBox(cube_r4, 0, 4, -0.2F, -0.4F, -0.4F, 0, 1, 1, 0.0F, false));

        this.leftAntenna = new AdvancedModelRenderer(this);
        this.leftAntenna.setRotationPoint(0.6692F, -0.0141F, -1.0183F);
        this.head.addChild(leftAntenna);
        this.setRotateAngle(leftAntenna, -0.2519F, -0.2549F, -0.2352F);


        this.cube_r5 = new AdvancedModelRenderer(this);
        this.cube_r5.setRotationPoint(-0.3F, 0.1F, 0.7F);
        this.leftAntenna.addChild(cube_r5);
        this.setRotateAngle(cube_r5, 0.0436F, 0.0F, 0.1745F);
        this.cube_r5.cubeList.add(new ModelBox(cube_r5, 0, 16, -0.2F, -0.3F, -10.6F, 9, 0, 10, 0.0F, false));

        this.rightAntenna = new AdvancedModelRenderer(this);
        this.rightAntenna.setRotationPoint(-0.6692F, -0.0141F, -1.0183F);
        this.head.addChild(rightAntenna);
        this.setRotateAngle(rightAntenna, -0.2519F, 0.2549F, 0.2352F);


        this.cube_r6 = new AdvancedModelRenderer(this);
        this.cube_r6.setRotationPoint(0.3F, 0.1F, 0.7F);
        this.rightAntenna.addChild(cube_r6);
        this.setRotateAngle(cube_r6, 0.0436F, 0.0F, -0.1745F);
        this.cube_r6.cubeList.add(new ModelBox(cube_r6, 0, 16, -8.8F, -0.3F, -10.6F, 9, 0, 10, 0.0F, true));

        this.rightLeg3 = new AdvancedModelRenderer(this);
        this.rightLeg3.setRotationPoint(-0.7F, 1.35F, 0.75F);
        this.thorax.addChild(rightLeg3);
        this.setRotateAngle(rightLeg3, 0.0F, -0.2618F, 0.0F);


        this.cube_r7 = new AdvancedModelRenderer(this);
        this.cube_r7.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.rightLeg3.addChild(cube_r7);
        this.setRotateAngle(cube_r7, 0.0F, 1.2217F, 0.0F);
        this.cube_r7.cubeList.add(new ModelBox(cube_r7, 0, 39, -9.0F, -2.0F, 0.0F, 9, 3, 0, 0.0F, true));

        this.leftLeg3 = new AdvancedModelRenderer(this);
        this.leftLeg3.setRotationPoint(0.7F, 1.35F, 0.75F);
        this.thorax.addChild(leftLeg3);
        this.setRotateAngle(leftLeg3, 0.0F, 0.2618F, 0.0F);


        this.cube_r8 = new AdvancedModelRenderer(this);
        this.cube_r8.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.leftLeg3.addChild(cube_r8);
        this.setRotateAngle(cube_r8, 0.0F, -1.2217F, 0.0F);
        this.cube_r8.cubeList.add(new ModelBox(cube_r8, 0, 39, 0.0F, -2.0F, 0.0F, 9, 3, 0, 0.0F, false));

        this.leftLeg2 = new AdvancedModelRenderer(this);
        this.leftLeg2.setRotationPoint(0.4F, 1.35F, -0.55F);
        this.thorax.addChild(leftLeg2);
        this.setRotateAngle(leftLeg2, 0.0F, 0.4363F, 0.0F);


        this.cube_r9 = new AdvancedModelRenderer(this);
        this.cube_r9.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.leftLeg2.addChild(cube_r9);
        this.setRotateAngle(cube_r9, 0.0F, -0.829F, 0.0F);
        this.cube_r9.cubeList.add(new ModelBox(cube_r9, 0, 0, 0.0F, -2.0F, 0.0F, 7, 3, 0, 0.0F, false));

        this.leftLeg1 = new AdvancedModelRenderer(this);
        this.leftLeg1.setRotationPoint(0.3F, -0.05F, -1.55F);
        this.thorax.addChild(leftLeg1);
        this.setRotateAngle(leftLeg1, 0.0F, -0.3491F, 0.0F);


        this.cube_r10 = new AdvancedModelRenderer(this);
        this.cube_r10.setRotationPoint(-0.3F, 0.7F, 0.5F);
        this.leftLeg1.addChild(cube_r10);
        this.setRotateAngle(cube_r10, 0.0F, 0.8727F, 0.0F);
        this.cube_r10.cubeList.add(new ModelBox(cube_r10, 0, 10, 0.5F, -1.3F, 0.0F, 5, 3, 0, 0.0F, false));

        this.rightLeg2 = new AdvancedModelRenderer(this);
        this.rightLeg2.setRotationPoint(-0.4F, 1.35F, -0.55F);
        this.thorax.addChild(rightLeg2);
        this.setRotateAngle(rightLeg2, 0.0F, -0.4363F, 0.0F);


        this.cube_r11 = new AdvancedModelRenderer(this);
        this.cube_r11.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.rightLeg2.addChild(cube_r11);
        this.setRotateAngle(cube_r11, 0.0F, 0.829F, 0.0F);
        this.cube_r11.cubeList.add(new ModelBox(cube_r11, 0, 0, -7.0F, -2.0F, 0.0F, 7, 3, 0, 0.0F, true));

        this.rightLeg1 = new AdvancedModelRenderer(this);
        this.rightLeg1.setRotationPoint(-0.3F, -0.05F, -1.55F);
        this.thorax.addChild(rightLeg1);
        this.setRotateAngle(rightLeg1, 0.0F, 0.3491F, 0.0F);


        this.cube_r12 = new AdvancedModelRenderer(this);
        this.cube_r12.setRotationPoint(0.3F, 0.7F, 0.5F);
        this.rightLeg1.addChild(cube_r12);
        this.setRotateAngle(cube_r12, 0.0F, -0.8727F, 0.0F);
        this.cube_r12.cubeList.add(new ModelBox(cube_r12, 0, 10, -5.5F, -1.3F, 0.0F, 5, 3, 0, 0.0F, true));

        this.abdomen = new AdvancedModelRenderer(this);
        this.abdomen.setRotationPoint(0.0F, -0.7667F, 1.3333F);
        this.thorax.addChild(abdomen);
        this.abdomen.cubeList.add(new ModelBox(abdomen, 34, 30, -1.0F, -0.0333F, -0.2333F, 2, 1, 7, 0.0F, false));
        this.abdomen.cubeList.add(new ModelBox(abdomen, 24, 0, -1.0F, 0.2667F, 6.7667F, 2, 1, 1, 0.0F, false));
        this.abdomen.cubeList.add(new ModelBox(abdomen, 22, 28, -1.0F, 0.6667F, -0.2333F, 2, 1, 7, -0.001F, false));

        this.rightCercus = new AdvancedModelRenderer(this);
        this.rightCercus.setRotationPoint(-0.729F, 0.7528F, 7.4573F);
        this.abdomen.addChild(rightCercus);


        this.cube_r13 = new AdvancedModelRenderer(this);
        this.cube_r13.setRotationPoint(0.129F, 0.0139F, 0.2093F);
        this.rightCercus.addChild(cube_r13);
        this.setRotateAngle(cube_r13, -0.122F, -0.1883F, 0.4889F);
        this.cube_r13.cubeList.add(new ModelBox(cube_r13, 0, 27, -4.5F, 0.0F, -0.1F, 5, 0, 11, 0.0F, true));

        this.leftCercus = new AdvancedModelRenderer(this);
        this.leftCercus.setRotationPoint(0.729F, 0.7528F, 7.4573F);
        this.abdomen.addChild(leftCercus);


        this.cube_r14 = new AdvancedModelRenderer(this);
        this.cube_r14.setRotationPoint(-0.129F, 0.0139F, 0.2093F);
        this.leftCercus.addChild(cube_r14);
        this.setRotateAngle(cube_r14, -0.122F, 0.1883F, -0.4889F);
        this.cube_r14.cubeList.add(new ModelBox(cube_r14, 0, 27, -0.5F, 0.0F, -0.1F, 5, 0, 11, 0.0F, false));

        this.leftForewing = new AdvancedModelRenderer(this);
        this.leftForewing.setRotationPoint(1.2F, -1.0F, -0.25F);
        this.thorax.addChild(leftForewing);
        this.setRotateAngle(leftForewing, 0.0F, 0.0873F, 0.0F);
        this.leftForewing.cubeList.add(new ModelBox(leftForewing, 0, 0, -3.3298F, -0.1F, -0.3356F, 4, 0, 15, 0.0F, false));

        this.rightForewing = new AdvancedModelRenderer(this);
        this.rightForewing.setRotationPoint(-1.2F, -1.0F, -0.25F);
        this.thorax.addChild(rightForewing);
        this.setRotateAngle(rightForewing, 0.0F, -0.0873F, 0.0F);
        this.rightForewing.cubeList.add(new ModelBox(rightForewing, 0, 0, -0.6702F, -0.11F, -0.3356F, 4, 0, 15, 0.0F, true));

        this.rightHindwing = new AdvancedModelRenderer(this);
        this.rightHindwing.setRotationPoint(-1.2F, -0.9F, 1.05F);
        this.thorax.addChild(rightHindwing);
        this.rightHindwing.cubeList.add(new ModelBox(rightHindwing, 24, 0, -0.2702F, -0.11F, -0.3356F, 3, 0, 13, 0.0F, true));

        this.rightHindwing2 = new AdvancedModelRenderer(this);
        this.rightHindwing2.setRotationPoint(2.7298F, -0.1F, 5.1644F);
        this.rightHindwing.addChild(rightHindwing2);
        this.setRotateAngle(rightHindwing2, 0.0F, 0.0F, -3.1416F);
        this.rightHindwing2.cubeList.add(new ModelBox(rightHindwing2, 28, 16, 0.0F, -0.011F, -5.5F, 3, 0, 11, 0.0F, true));

        this.leftHindwing = new AdvancedModelRenderer(this);
        this.leftHindwing.setRotationPoint(1.2F, -0.9F, 1.05F);
        this.thorax.addChild(leftHindwing);
        this.leftHindwing.cubeList.add(new ModelBox(leftHindwing, 24, 0, -2.7298F, -0.1F, -0.3356F, 3, 0, 13, 0.0F, false));

        this.leftHindwing2 = new AdvancedModelRenderer(this);
        this.leftHindwing2.setRotationPoint(-2.7298F, -0.1F, 5.1644F);
        this.leftHindwing.addChild(leftHindwing2);
        this.setRotateAngle(leftHindwing2, 0.0F, 0.0F, -3.1416F);
        this.leftHindwing2.cubeList.add(new ModelBox(leftHindwing2, 28, 16, -3.0F, -0.001F, -5.5F, 3, 0, 11, 0.0F, false));
        updateDefaultPose();
    }

    @Override
    public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        GlStateManager.pushMatrix();
        GlStateManager.enableBlend();
        GlStateManager.blendFunc(GlStateManager.SourceFactor.SRC_ALPHA, GlStateManager.DestFactor.ONE_MINUS_SRC_ALPHA);
        this.stonefly.render(f5);
        GlStateManager.disableBlend();
        GlStateManager.popMatrix();
    }
    public void renderStaticSuspended(float f) {
        this.stonefly.render(0.01f);
    }

    public void renderStaticFloor(float f) {
        this.stonefly.render(0.01f);
    }

    public void renderStaticDisplayCase(float f) {
        this.stonefly.render(0.01f);
        resetToDefaultPose();
    }

    @Override
    public void renderStaticBook(float f) {
        //Rotations, positions and sizing:
        this.stonefly.offsetY = -3.2F;
        this.stonefly.offsetX = -0.2F;
        this.stonefly.rotateAngleY = (float)Math.toRadians(210);
        this.stonefly.rotateAngleX = (float)Math.toRadians(20);
        this.stonefly.rotateAngleZ = (float)Math.toRadians(0);
        this.stonefly.scaleChildren = true;
        float scaler = 4.0F;
        this.stonefly.setScale(scaler, scaler, scaler);
        //Start of pose:
        this.setRotateAngle(stonefly, 0.2F, 3.8F, -0.1F);
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
    public void setLivingAnimations(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime) {
        super.setLivingAnimations(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime);
        this.resetToDefaultPose();
        EntityPrehistoricFloraStonefly ee = (EntityPrehistoricFloraStonefly) entitylivingbaseIn;


        if (ee.flyProgress != 0 && ee.getAttachmentPos() == null) {//if flying
            animFlying(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime);


        } else {//not flying

               
            }

    }

    public void animFlying(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime) {
        EntityPrehistoricFloraStonefly entity = (EntityPrehistoricFloraStonefly) entitylivingbaseIn;
        int animCycle = 38;
        double tickAnim = (entity.ticksExisted + entity.getTickOffset()) - (int) (Math.floor((double) (entity.ticksExisted + entity.getTickOffset()) / (double) animCycle) * (double) animCycle) + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;
        this.setRotateAngle(stonefly, stonefly.rotateAngleX + (float) (Math.toRadians(-32.5+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*(562))+40))*4), stonefly.rotateAngleY + (float) Math.toRadians(0), stonefly.rotateAngleZ + (float) Math.toRadians(0));
        this.stonefly.rotationPointX = this.stonefly.rotationPointX + (float)(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*187-60))*1);
        this.stonefly.rotationPointY = this.stonefly.rotationPointY - (float)(5+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*374+40))*0.8);
        this.stonefly.rotationPointZ = this.stonefly.rotationPointZ + (float)(0);
        this.setRotateAngle(leftAntenna, leftAntenna.rotateAngleX + (float) (Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*(562))+40))*10), leftAntenna.rotateAngleY + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*187))*10), leftAntenna.rotateAngleZ + (float) Math.toRadians(0));
        this.setRotateAngle(rightAntenna, rightAntenna.rotateAngleX + (float) (Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*(562))+40))*10), rightAntenna.rotateAngleY + (float) Math.toRadians(-(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*187+120))*10)), rightAntenna.rotateAngleZ + (float) Math.toRadians(0));
        this.setRotateAngle(rightLeg3, rightLeg3.rotateAngleX + (float) (Math.toRadians(-12.6766736416+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*(562))+70))*4), rightLeg3.rotateAngleY + (float) Math.toRadians(24.82021), rightLeg3.rotateAngleZ + (float) Math.toRadians(-1.64296));
        this.setRotateAngle(leftLeg3, leftLeg3.rotateAngleX + (float) (Math.toRadians(-12.6766736416+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*(562))+50))*4), leftLeg3.rotateAngleY + (float) Math.toRadians(-24.82021), leftLeg3.rotateAngleZ + (float) Math.toRadians(1.64296));
        this.setRotateAngle(leftLeg2, leftLeg2.rotateAngleX + (float) (Math.toRadians(-16.4702729203+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*(562))+30))*6), leftLeg2.rotateAngleY + (float) Math.toRadians(-49.09293), leftLeg2.rotateAngleZ + (float) Math.toRadians(6.8817));
        this.setRotateAngle(leftLeg1, leftLeg1.rotateAngleX + (float) (Math.toRadians(-40.5621516679+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*(562))+50))*4), leftLeg1.rotateAngleY + (float) Math.toRadians(7.49539), leftLeg1.rotateAngleZ + (float) Math.toRadians(-6.90165));
        this.setRotateAngle(rightLeg2, rightLeg2.rotateAngleX + (float) (Math.toRadians(-16.4702729203+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*(562))+40))*6), rightLeg2.rotateAngleY + (float) Math.toRadians(49.09293), rightLeg2.rotateAngleZ + (float) Math.toRadians(-6.8817));
        this.setRotateAngle(rightLeg1, rightLeg1.rotateAngleX + (float) (Math.toRadians(-40.5621516679+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*(562))+70))*4), rightLeg1.rotateAngleY + (float) Math.toRadians(-7.49539), rightLeg1.rotateAngleZ + (float) Math.toRadians(6.90165));
        this.setRotateAngle(abdomen, abdomen.rotateAngleX + (float) (Math.toRadians(10+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*(562))+40))*1), abdomen.rotateAngleY + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*187+160))*5), abdomen.rotateAngleZ + (float) Math.toRadians(0));
        this.setRotateAngle(rightCercus, rightCercus.rotateAngleX + (float) (Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*(562))+60))*4), rightCercus.rotateAngleY + (float) Math.toRadians(0), rightCercus.rotateAngleZ + (float) Math.toRadians(0));
        this.setRotateAngle(leftCercus, leftCercus.rotateAngleX + (float) (Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*(562))+60))*4), leftCercus.rotateAngleY + (float) Math.toRadians(0), leftCercus.rotateAngleZ + (float) Math.toRadians(0));

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



        this.setRotateAngle(rightHindwing2, rightHindwing2.rotateAngleX + (float) Math.toRadians(0), rightHindwing2.rotateAngleY + (float) Math.toRadians(0), rightHindwing2.rotateAngleZ + (float) Math.toRadians(180));



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
        
    }
    @Override
    public void setRotationAngles(float f, float f1, float f2, float f3, float f4, float f5, Entity e) {
        super.setRotationAngles(f, f1, f2, f3, f4, f5, e);

        EntityPrehistoricFloraStonefly EntityMayfly = (EntityPrehistoricFloraStonefly) e;

        if (EntityMayfly.flyProgress != 0 && EntityMayfly.getAttachmentPos() == null) {//if flying
            this.stonefly.rotateAngleX = (float) Math.toRadians(135+180);
        }


    }
}
