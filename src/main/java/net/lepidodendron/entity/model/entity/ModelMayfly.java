package net.lepidodendron.entity.model.entity;

import net.ilexiconn.llibrary.client.model.tools.AdvancedModelRenderer;
import net.lepidodendron.entity.EntityPrehistoricFloraMayfly;
import net.lepidodendron.entity.model.ModelBasePalaeopedia;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;

public class ModelMayfly extends ModelBasePalaeopedia {
    private final AdvancedModelRenderer mayfly;
    private final AdvancedModelRenderer head;
    private final AdvancedModelRenderer cube_r1;
    private final AdvancedModelRenderer rightAntenna;
    private final AdvancedModelRenderer leftAntenna;
    private final AdvancedModelRenderer thorax;
    private final AdvancedModelRenderer cube_r2;
    private final AdvancedModelRenderer rightWings;
    private final AdvancedModelRenderer rightForwing;
    private final AdvancedModelRenderer cube_r3;
    private final AdvancedModelRenderer rightHindwing;
    private final AdvancedModelRenderer cube_r4;
    private final AdvancedModelRenderer leftWings;
    private final AdvancedModelRenderer leftForewing;
    private final AdvancedModelRenderer cube_r5;
    private final AdvancedModelRenderer leftHindwing;
    private final AdvancedModelRenderer cube_r6;
    private final AdvancedModelRenderer rightLeg1;
    private final AdvancedModelRenderer cube_r7;
    private final AdvancedModelRenderer leftLeg1;
    private final AdvancedModelRenderer cube_r8;
    private final AdvancedModelRenderer rightLeg2;
    private final AdvancedModelRenderer cube_r9;
    private final AdvancedModelRenderer leftLeg2;
    private final AdvancedModelRenderer cube_r10;
    private final AdvancedModelRenderer rightLeg3;
    private final AdvancedModelRenderer cube_r11;
    private final AdvancedModelRenderer leftLeg3;
    private final AdvancedModelRenderer cube_r12;
    private final AdvancedModelRenderer abdomen1;
    private final AdvancedModelRenderer cube_r13;
    private final AdvancedModelRenderer abdomen2;
    private final AdvancedModelRenderer cube_r14;
    private final AdvancedModelRenderer abdomen3;
    private final AdvancedModelRenderer cube_r15;
    private final AdvancedModelRenderer abdomen4;
    private final AdvancedModelRenderer cube_r16;
    private final AdvancedModelRenderer cube_r17;
    private final AdvancedModelRenderer leftCercus;
    private final AdvancedModelRenderer cube_r18;
    private final AdvancedModelRenderer rightCercus;
    private final AdvancedModelRenderer cube_r19;
    private final AdvancedModelRenderer caudalFilament;
    private final AdvancedModelRenderer cube_r20;

    public ModelMayfly() {
        this.textureWidth = 36;
        this.textureHeight = 40;

        this.mayfly = new AdvancedModelRenderer(this);
        this.mayfly.setRotationPoint(0.0F, 21.5F, 0.1F);


        this.head = new AdvancedModelRenderer(this);
        this.head.setRotationPoint(0.0F, 0.147F, -1.3285F);
        this.mayfly.addChild(head);


        this.cube_r1 = new AdvancedModelRenderer(this);
        this.cube_r1.setRotationPoint(-1.2F, 0.0228F, -1.2735F);
        this.head.addChild(cube_r1);
        this.setRotateAngle(cube_r1, 0.1309F, 0.0F, 0.0F);
        this.cube_r1.cubeList.add(new ModelBox(cube_r1, 18, 0, 0.7F, -0.4F, -1.0F, 1, 1, 3, 0.0F, false));
        this.cube_r1.cubeList.add(new ModelBox(cube_r1, 4, 12, 0.2F, -0.5F, -0.6F, 1, 1, 1, 0.0F, true));
        this.cube_r1.cubeList.add(new ModelBox(cube_r1, 4, 12, 1.2F, -0.5F, -0.6F, 1, 1, 1, 0.0F, false));
        this.cube_r1.cubeList.add(new ModelBox(cube_r1, 0, 27, 0.7F, -0.6F, -0.6F, 1, 1, 2, 0.01F, false));

        this.rightAntenna = new AdvancedModelRenderer(this);
        this.rightAntenna.setRotationPoint(-0.4F, 0.0228F, -1.6735F);
        this.head.addChild(rightAntenna);
        this.setRotateAngle(rightAntenna, 0.0F, 0.3054F, 0.0F);
        this.rightAntenna.cubeList.add(new ModelBox(rightAntenna, 12, 29, 0.0F, -1.5F, -2.0F, 0, 2, 2, 0.0F, true));

        this.leftAntenna = new AdvancedModelRenderer(this);
        this.leftAntenna.setRotationPoint(0.4F, 0.0228F, -1.6735F);
        this.head.addChild(leftAntenna);
        this.setRotateAngle(leftAntenna, 0.0F, -0.3054F, 0.0F);
        this.leftAntenna.cubeList.add(new ModelBox(leftAntenna, 12, 29, 0.0F, -1.5F, -2.0F, 0, 2, 2, 0.0F, false));

        this.thorax = new AdvancedModelRenderer(this);
        this.thorax.setRotationPoint(0.0F, -0.1755F, -1.4773F);
        this.mayfly.addChild(thorax);


        this.cube_r2 = new AdvancedModelRenderer(this);
        this.cube_r2.setRotationPoint(0.0F, -0.0019F, 0.746F);
        this.thorax.addChild(cube_r2);
        this.setRotateAngle(cube_r2, -0.1309F, 0.0F, 0.0F);
        this.cube_r2.cubeList.add(new ModelBox(cube_r2, 0, 0, -1.0F, -0.7F, -0.7F, 2, 2, 3, 0.01F, false));

        this.rightWings = new AdvancedModelRenderer(this);
        this.rightWings.setRotationPoint(-0.9F, -0.4945F, 2.6254F);
        this.thorax.addChild(rightWings);


        this.rightForwing = new AdvancedModelRenderer(this);
        this.rightForwing.setRotationPoint(0.1F, -0.2F, -1.8F);
        this.rightWings.addChild(rightForwing);


        this.cube_r3 = new AdvancedModelRenderer(this);
        this.cube_r3.setRotationPoint(0.8F, 0.6927F, -0.0794F);
        this.rightForwing.addChild(cube_r3);
        this.setRotateAngle(cube_r3, -0.4102F, 0.0F, 0.0F);
        this.cube_r3.cubeList.add(new ModelBox(cube_r3, 18, 22, -0.8F, -12.1F, -0.4F, 0, 12, 5, 0.0F, true));

        this.rightHindwing = new AdvancedModelRenderer(this);
        this.rightHindwing.setRotationPoint(0.1F, 0.0927F, 0.3206F);
        this.rightWings.addChild(rightHindwing);


        this.cube_r4 = new AdvancedModelRenderer(this);
        this.cube_r4.setRotationPoint(0.8F, 0.0F, -2.0F);
        this.rightHindwing.addChild(cube_r4);
        this.setRotateAngle(cube_r4, -0.6981F, 0.0F, 0.0F);
        this.cube_r4.cubeList.add(new ModelBox(cube_r4, 0, 12, -0.84F, -5.5F, 0.7F, 0, 5, 3, 0.0F, true));

        this.leftWings = new AdvancedModelRenderer(this);
        this.leftWings.setRotationPoint(0.9F, -0.4945F, 2.6254F);
        this.thorax.addChild(leftWings);


        this.leftForewing = new AdvancedModelRenderer(this);
        this.leftForewing.setRotationPoint(-0.1F, -0.2F, -1.8F);
        this.leftWings.addChild(leftForewing);


        this.cube_r5 = new AdvancedModelRenderer(this);
        this.cube_r5.setRotationPoint(-0.8F, 0.6927F, -0.0794F);
        this.leftForewing.addChild(cube_r5);
        this.setRotateAngle(cube_r5, -0.4014F, 0.0F, 0.0F);
        this.cube_r5.cubeList.add(new ModelBox(cube_r5, 18, 22, 0.8F, -12.1F, -0.4F, 0, 12, 5, 0.0F, false));

        this.leftHindwing = new AdvancedModelRenderer(this);
        this.leftHindwing.setRotationPoint(-0.1F, 0.0927F, 0.3206F);
        this.leftWings.addChild(leftHindwing);


        this.cube_r6 = new AdvancedModelRenderer(this);
        this.cube_r6.setRotationPoint(-0.8F, 0.0F, -2.0F);
        this.leftHindwing.addChild(cube_r6);
        this.setRotateAngle(cube_r6, -0.6981F, 0.0F, 0.0F);
        this.cube_r6.cubeList.add(new ModelBox(cube_r6, 0, 12, 0.84F, -5.5F, 0.7F, 0, 5, 3, 0.0F, false));

        this.rightLeg1 = new AdvancedModelRenderer(this);
        this.rightLeg1.setRotationPoint(-0.7F, -0.0745F, 0.4273F);
        this.thorax.addChild(rightLeg1);
        this.setRotateAngle(rightLeg1, 0.0F, -0.48F, 0.0F);


        this.cube_r7 = new AdvancedModelRenderer(this);
        this.cube_r7.setRotationPoint(0.3F, 0.7F, 0.5F);
        this.rightLeg1.addChild(cube_r7);
        this.setRotateAngle(cube_r7, 0.0F, -0.8727F, 0.0F);
        this.cube_r7.cubeList.add(new ModelBox(cube_r7, 12, 12, -7.5F, -1.6F, 0.0F, 7, 4, 0, 0.0F, true));

        this.leftLeg1 = new AdvancedModelRenderer(this);
        this.leftLeg1.setRotationPoint(0.7F, -0.0745F, 0.4273F);
        this.thorax.addChild(leftLeg1);
        this.setRotateAngle(leftLeg1, 0.0F, 0.48F, 0.0F);


        this.cube_r8 = new AdvancedModelRenderer(this);
        this.cube_r8.setRotationPoint(-0.3F, 0.7F, 0.5F);
        this.leftLeg1.addChild(cube_r8);
        this.setRotateAngle(cube_r8, 0.0F, 0.8727F, 0.0F);
        this.cube_r8.cubeList.add(new ModelBox(cube_r8, 12, 12, 0.5F, -1.6F, 0.0F, 7, 4, 0, 0.0F, false));

        this.rightLeg2 = new AdvancedModelRenderer(this);
        this.rightLeg2.setRotationPoint(-0.6F, 1.6255F, 2.7273F);
        this.thorax.addChild(rightLeg2);
        this.setRotateAngle(rightLeg2, 0.0F, -1.7453F, 0.0F);


        this.cube_r9 = new AdvancedModelRenderer(this);
        this.cube_r9.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.rightLeg2.addChild(cube_r9);
        this.setRotateAngle(cube_r9, 0.0F, 0.829F, 0.0F);
        this.cube_r9.cubeList.add(new ModelBox(cube_r9, 0, 6, -5.0F, -2.0F, 0.0F, 5, 3, 0, 0.0F, true));

        this.leftLeg2 = new AdvancedModelRenderer(this);
        this.leftLeg2.setRotationPoint(0.6F, 1.6255F, 2.7273F);
        this.thorax.addChild(leftLeg2);
        this.setRotateAngle(leftLeg2, 0.0F, 1.7453F, 0.0F);


        this.cube_r10 = new AdvancedModelRenderer(this);
        this.cube_r10.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.leftLeg2.addChild(cube_r10);
        this.setRotateAngle(cube_r10, 0.0F, -0.829F, 0.0F);
        this.cube_r10.cubeList.add(new ModelBox(cube_r10, 0, 6, 0.0F, -2.0F, 0.0F, 5, 3, 0, 0.0F, false));

        this.rightLeg3 = new AdvancedModelRenderer(this);
        this.rightLeg3.setRotationPoint(-0.9F, 1.6255F, 2.8273F);
        this.thorax.addChild(rightLeg3);
        this.setRotateAngle(rightLeg3, 0.0F, -0.2618F, 0.0F);


        this.cube_r11 = new AdvancedModelRenderer(this);
        this.cube_r11.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.rightLeg3.addChild(cube_r11);
        this.setRotateAngle(cube_r11, 0.0F, 1.3963F, 0.0F);
        this.cube_r11.cubeList.add(new ModelBox(cube_r11, 12, 17, -5.0F, -2.0F, 0.0F, 5, 3, 0, 0.0F, true));

        this.leftLeg3 = new AdvancedModelRenderer(this);
        this.leftLeg3.setRotationPoint(0.9F, 1.6255F, 2.8273F);
        this.thorax.addChild(leftLeg3);
        this.setRotateAngle(leftLeg3, 0.0F, 0.2618F, 0.0F);


        this.cube_r12 = new AdvancedModelRenderer(this);
        this.cube_r12.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.leftLeg3.addChild(cube_r12);
        this.setRotateAngle(cube_r12, 0.0F, -1.3963F, 0.0F);
        this.cube_r12.cubeList.add(new ModelBox(cube_r12, 12, 17, 0.0F, -2.0F, 0.0F, 5, 3, 0, 0.0F, false));

        this.abdomen1 = new AdvancedModelRenderer(this);
        this.abdomen1.setRotationPoint(0.0F, 0.648F, 2.4242F);
        this.thorax.addChild(abdomen1);


        this.cube_r13 = new AdvancedModelRenderer(this);
        this.cube_r13.setRotationPoint(0.0F, -0.3499F, -1.6782F);
        this.abdomen1.addChild(cube_r13);
        this.setRotateAngle(cube_r13, -0.0873F, 0.0F, 0.0F);
        this.cube_r13.cubeList.add(new ModelBox(cube_r13, 24, 21, -1.0F, -0.1F, 1.3F, 2, 1, 2, -0.001F, false));
        this.cube_r13.cubeList.add(new ModelBox(cube_r13, 23, 17, -1.0F, -0.6F, 1.3F, 2, 1, 2, 0.0F, false));

        this.abdomen2 = new AdvancedModelRenderer(this);
        this.abdomen2.setRotationPoint(0.0F, -0.2166F, 1.4579F);
        this.abdomen1.addChild(abdomen2);


        this.cube_r14 = new AdvancedModelRenderer(this);
        this.cube_r14.setRotationPoint(0.0F, 0.4403F, 1.1214F);
        this.abdomen2.addChild(cube_r14);
        this.setRotateAngle(cube_r14, 0.0873F, 0.0F, 0.0F);
        this.cube_r14.cubeList.add(new ModelBox(cube_r14, 18, 5, -1.0F, -0.6F, -1.1F, 2, 1, 2, -0.003F, false));
        this.cube_r14.cubeList.add(new ModelBox(cube_r14, 25, 7, -1.0F, -0.9F, -1.1F, 2, 1, 2, -0.002F, false));

        this.abdomen3 = new AdvancedModelRenderer(this);
        this.abdomen3.setRotationPoint(0.0F, -0.4803F, 1.7681F);
        this.abdomen2.addChild(abdomen3);


        this.cube_r15 = new AdvancedModelRenderer(this);
        this.cube_r15.setRotationPoint(0.0F, 0.3894F, 1.3464F);
        this.abdomen3.addChild(cube_r15);
        this.setRotateAngle(cube_r15, 0.3927F, 0.0F, 0.0F);
        this.cube_r15.cubeList.add(new ModelBox(cube_r15, 25, 3, -1.0F, -0.9F, -1.2093F, 2, 1, 2, -0.004F, false));

        this.abdomen4 = new AdvancedModelRenderer(this);
        this.abdomen4.setRotationPoint(0.0F, -0.6448F, 1.6646F);
        this.abdomen3.addChild(abdomen4);


        this.cube_r16 = new AdvancedModelRenderer(this);
        this.cube_r16.setRotationPoint(-0.5F, 0.9973F, -0.247F);
        this.abdomen4.addChild(cube_r16);
        this.setRotateAngle(cube_r16, 0.5236F, 0.0F, 0.0F);
        this.cube_r16.cubeList.add(new ModelBox(cube_r16, 6, 20, 0.0F, -0.8F, 2.7F, 1, 1, 1, 0.0F, false));

        this.cube_r17 = new AdvancedModelRenderer(this);
        this.cube_r17.setRotationPoint(-0.3F, 1.0607F, -0.5568F);
        this.abdomen4.addChild(cube_r17);
        this.setRotateAngle(cube_r17, 0.5236F, 0.0F, 0.0F);
        this.cube_r17.cubeList.add(new ModelBox(cube_r17, 7, 27, 0.05F, -0.7F, 1.0F, 1, 1, 2, -0.001F, false));
        this.cube_r17.cubeList.add(new ModelBox(cube_r17, 27, 11, -0.45F, -0.7F, 1.0F, 1, 1, 2, -0.001F, false));
        this.cube_r17.cubeList.add(new ModelBox(cube_r17, 29, 25, -0.2F, -0.7F, 1.0F, 1, 1, 2, 0.0F, false));

        this.leftCercus = new AdvancedModelRenderer(this);
        this.leftCercus.setRotationPoint(0.4F, -1.1027F, 2.853F);
        this.abdomen4.addChild(leftCercus);


        this.cube_r18 = new AdvancedModelRenderer(this);
        this.cube_r18.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.leftCercus.addChild(cube_r18);
        this.setRotateAngle(cube_r18, 0.5219F, 0.403F, -0.2444F);
        this.cube_r18.cubeList.add(new ModelBox(cube_r18, 0, 0, -0.2F, -0.0313F, -0.0347F, 3, 0, 11, 0.0F, false));

        this.rightCercus = new AdvancedModelRenderer(this);
        this.rightCercus.setRotationPoint(-0.4F, -1.1027F, 2.853F);
        this.abdomen4.addChild(rightCercus);


        this.cube_r19 = new AdvancedModelRenderer(this);
        this.cube_r19.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.rightCercus.addChild(cube_r19);
        this.setRotateAngle(cube_r19, 0.5219F, -0.403F, 0.2444F);
        this.cube_r19.cubeList.add(new ModelBox(cube_r19, 0, 0, -2.8F, -0.0313F, -0.0347F, 3, 0, 11, 0.0F, true));

        this.caudalFilament = new AdvancedModelRenderer(this);
        this.caudalFilament.setRotationPoint(0.0F, -0.7285F, 3.0125F);
        this.abdomen4.addChild(caudalFilament);


        this.cube_r20 = new AdvancedModelRenderer(this);
        this.cube_r20.setRotationPoint(-0.5F, 1.7258F, -3.2595F);
        this.caudalFilament.addChild(cube_r20);
        this.setRotateAngle(cube_r20, 0.5236F, 0.0F, 0.0F);
        this.cube_r20.cubeList.add(new ModelBox(cube_r20, 0, 12, 0.5F, -2.8F, 3.7F, 0, 3, 11, 0.0F, false));
        updateDefaultPose();
    }

    @Override
    public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        GlStateManager.pushMatrix();
        GlStateManager.enableBlend();
        GlStateManager.blendFunc(GlStateManager.SourceFactor.SRC_ALPHA, GlStateManager.DestFactor.ONE_MINUS_SRC_ALPHA);
        this.mayfly.render(f5);
        GlStateManager.disableBlend();
        GlStateManager.popMatrix();
    }
    public void renderStaticSuspended(float f) {
        this.mayfly.render(0.01f);
    }

    public void renderStaticFloor(float f) {
        this.mayfly.render(0.01f);
    }

    public void renderStaticDisplayCase(float f) {
        this.mayfly.render(0.01f);
        resetToDefaultPose();
    }

    @Override
    public void renderStaticBook(float f) {
        //Rotations, positions and sizing:
        this.mayfly.offsetY = -1.6F;
        this.mayfly.offsetX = -0.6F;
        this.mayfly.offsetZ = 2.0F;
        this.mayfly.rotateAngleY = (float)Math.toRadians(220);
        this.mayfly.rotateAngleX = (float)Math.toRadians(20);
        this.mayfly.rotateAngleZ = (float)Math.toRadians(0);
        this.mayfly.scaleChildren = true;
        float scaler = 4.2F;
        this.mayfly.setScale(scaler, scaler, scaler);
        //Start of pose:

        //End of pose, now render the model:
        this.mayfly.render(f);
        //Reset rotations, positions and sizing:
        this.mayfly.setScale(1.0F, 1.0F, 1.0F);
        this.mayfly.scaleChildren = false;
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
        EntityPrehistoricFloraMayfly ee = (EntityPrehistoricFloraMayfly) entitylivingbaseIn;


        if (ee.flyProgress != 0 && ee.getAttachmentPos() == null) {//if flying
            animFlying(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime);


        } else {//not flying
            animIdle(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime);
               
        }

    }

    public void animFlying(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime) {
        EntityPrehistoricFloraMayfly entity = (EntityPrehistoricFloraMayfly) entitylivingbaseIn;
        int animCycle = 38;
        double tickAnim = (entity.ticksExisted + entity.getTickOffset()) - (int) (Math.floor((double) (entity.ticksExisted + entity.getTickOffset()) / (double) animCycle) * (double) animCycle) + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;
        this.setRotateAngle(mayfly, mayfly.rotateAngleX + (float) (Math.toRadians(-30+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*(562))+40))*4), mayfly.rotateAngleY + (float) Math.toRadians(0), mayfly.rotateAngleZ + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*(562))+130))*5);
        this.mayfly.rotationPointX = this.mayfly.rotationPointX + (float)(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*187-60))*1);
        this.mayfly.rotationPointY = this.mayfly.rotationPointY - (float)(2+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*374+40))*0.8);
        this.mayfly.rotationPointZ = this.mayfly.rotationPointZ + (float)(0);



        if (tickAnim >= 0 && tickAnim < 1) {
            xx = 27.5 + (((tickAnim - 0) / 1) * (26.22662-(27.5)));
            yy = 0 + (((tickAnim - 0) / 1) * (32.73166-(0)));
            zz = 0 + (((tickAnim - 0) / 1) * (-104.00376-(0)));
        }
        else if (tickAnim >= 1 && tickAnim < 2) {
            xx = 26.22662 + (((tickAnim - 1) / 1) * (35.10328-(26.22662)));
            yy = 32.73166 + (((tickAnim - 1) / 1) * (23.22557-(32.73166)));
            zz = -104.00376 + (((tickAnim - 1) / 1) * (-147.18089-(-104.00376)));
        }
        else if (tickAnim >= 2 && tickAnim < 2) {
            xx = 35.10328 + (((tickAnim - 2) / 0) * (36.08362-(35.10328)));
            yy = 23.22557 + (((tickAnim - 2) / 0) * (-44.18529-(23.22557)));
            zz = -147.18089 + (((tickAnim - 2) / 0) * (-34.2009-(-147.18089)));
        }
        else if (tickAnim >= 2 && tickAnim < 3) {
            xx = 36.08362 + (((tickAnim - 2) / 1) * (27.5-(36.08362)));
            yy = -44.18529 + (((tickAnim - 2) / 1) * (0-(-44.18529)));
            zz = -34.2009 + (((tickAnim - 2) / 1) * (0-(-34.2009)));
        }
        else if (tickAnim >= 3 && tickAnim < 4) {
            xx = 27.5 + (((tickAnim - 3) / 1) * (26.22662-(27.5)));
            yy = 0 + (((tickAnim - 3) / 1) * (32.73166-(0)));
            zz = 0 + (((tickAnim - 3) / 1) * (-104.00376-(0)));
        }
        else if (tickAnim >= 4 && tickAnim < 5) {
            xx = 26.22662 + (((tickAnim - 4) / 1) * (35.10328-(26.22662)));
            yy = 32.73166 + (((tickAnim - 4) / 1) * (23.22557-(32.73166)));
            zz = -104.00376 + (((tickAnim - 4) / 1) * (-147.18089-(-104.00376)));
        }
        else if (tickAnim >= 5 && tickAnim < 6) {
            xx = 35.10328 + (((tickAnim - 5) / 1) * (36.08362-(35.10328)));
            yy = 23.22557 + (((tickAnim - 5) / 1) * (-44.18529-(23.22557)));
            zz = -147.18089 + (((tickAnim - 5) / 1) * (-34.2009-(-147.18089)));
        }
        else if (tickAnim >= 6 && tickAnim < 6) {
            xx = 36.08362 + (((tickAnim - 6) / 0) * (27.5-(36.08362)));
            yy = -44.18529 + (((tickAnim - 6) / 0) * (0-(-44.18529)));
            zz = -34.2009 + (((tickAnim - 6) / 0) * (0-(-34.2009)));
        }
        else if (tickAnim >= 6 && tickAnim < 7) {
            xx = 27.5 + (((tickAnim - 6) / 1) * (26.22662-(27.5)));
            yy = 0 + (((tickAnim - 6) / 1) * (32.73166-(0)));
            zz = 0 + (((tickAnim - 6) / 1) * (-104.00376-(0)));
        }
        else if (tickAnim >= 7 && tickAnim < 8) {
            xx = 26.22662 + (((tickAnim - 7) / 1) * (35.10328-(26.22662)));
            yy = 32.73166 + (((tickAnim - 7) / 1) * (23.22557-(32.73166)));
            zz = -104.00376 + (((tickAnim - 7) / 1) * (-147.18089-(-104.00376)));
        }
        else if (tickAnim >= 8 && tickAnim < 9) {
            xx = 35.10328 + (((tickAnim - 8) / 1) * (36.08362-(35.10328)));
            yy = 23.22557 + (((tickAnim - 8) / 1) * (-44.18529-(23.22557)));
            zz = -147.18089 + (((tickAnim - 8) / 1) * (-34.2009-(-147.18089)));
        }
        else if (tickAnim >= 9 && tickAnim < 10) {
            xx = 36.08362 + (((tickAnim - 9) / 1) * (27.5-(36.08362)));
            yy = -44.18529 + (((tickAnim - 9) / 1) * (0-(-44.18529)));
            zz = -34.2009 + (((tickAnim - 9) / 1) * (0-(-34.2009)));
        }
        else if (tickAnim >= 10 && tickAnim < 10) {
            xx = 27.5 + (((tickAnim - 10) / 0) * (26.22662-(27.5)));
            yy = 0 + (((tickAnim - 10) / 0) * (32.73166-(0)));
            zz = 0 + (((tickAnim - 10) / 0) * (-104.00376-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 11) {
            xx = 26.22662 + (((tickAnim - 10) / 1) * (35.10328-(26.22662)));
            yy = 32.73166 + (((tickAnim - 10) / 1) * (23.22557-(32.73166)));
            zz = -104.00376 + (((tickAnim - 10) / 1) * (-147.18089-(-104.00376)));
        }
        else if (tickAnim >= 11 && tickAnim < 12) {
            xx = 35.10328 + (((tickAnim - 11) / 1) * (36.08362-(35.10328)));
            yy = 23.22557 + (((tickAnim - 11) / 1) * (-44.18529-(23.22557)));
            zz = -147.18089 + (((tickAnim - 11) / 1) * (-34.2009-(-147.18089)));
        }
        else if (tickAnim >= 12 && tickAnim < 13) {
            xx = 36.08362 + (((tickAnim - 12) / 1) * (27.5-(36.08362)));
            yy = -44.18529 + (((tickAnim - 12) / 1) * (0-(-44.18529)));
            zz = -34.2009 + (((tickAnim - 12) / 1) * (0-(-34.2009)));
        }
        else if (tickAnim >= 13 && tickAnim < 14) {
            xx = 27.5 + (((tickAnim - 13) / 1) * (26.22662-(27.5)));
            yy = 0 + (((tickAnim - 13) / 1) * (32.73166-(0)));
            zz = 0 + (((tickAnim - 13) / 1) * (-104.00376-(0)));
        }
        else if (tickAnim >= 14 && tickAnim < 14) {
            xx = 26.22662 + (((tickAnim - 14) / 0) * (35.10328-(26.22662)));
            yy = 32.73166 + (((tickAnim - 14) / 0) * (23.22557-(32.73166)));
            zz = -104.00376 + (((tickAnim - 14) / 0) * (-147.18089-(-104.00376)));
        }
        else if (tickAnim >= 14 && tickAnim < 15) {
            xx = 35.10328 + (((tickAnim - 14) / 1) * (36.08362-(35.10328)));
            yy = 23.22557 + (((tickAnim - 14) / 1) * (-44.18529-(23.22557)));
            zz = -147.18089 + (((tickAnim - 14) / 1) * (-34.2009-(-147.18089)));
        }
        else if (tickAnim >= 15 && tickAnim < 16) {
            xx = 36.08362 + (((tickAnim - 15) / 1) * (27.5-(36.08362)));
            yy = -44.18529 + (((tickAnim - 15) / 1) * (0-(-44.18529)));
            zz = -34.2009 + (((tickAnim - 15) / 1) * (0-(-34.2009)));
        }
        else if (tickAnim >= 16 && tickAnim < 17) {
            xx = 27.5 + (((tickAnim - 16) / 1) * (26.22662-(27.5)));
            yy = 0 + (((tickAnim - 16) / 1) * (32.73166-(0)));
            zz = 0 + (((tickAnim - 16) / 1) * (-104.00376-(0)));
        }
        else if (tickAnim >= 17 && tickAnim < 18) {
            xx = 26.22662 + (((tickAnim - 17) / 1) * (35.10328-(26.22662)));
            yy = 32.73166 + (((tickAnim - 17) / 1) * (23.22557-(32.73166)));
            zz = -104.00376 + (((tickAnim - 17) / 1) * (-147.18089-(-104.00376)));
        }
        else if (tickAnim >= 18 && tickAnim < 18) {
            xx = 35.10328 + (((tickAnim - 18) / 0) * (36.08362-(35.10328)));
            yy = 23.22557 + (((tickAnim - 18) / 0) * (-44.18529-(23.22557)));
            zz = -147.18089 + (((tickAnim - 18) / 0) * (-34.2009-(-147.18089)));
        }
        else if (tickAnim >= 18 && tickAnim < 19) {
            xx = 36.08362 + (((tickAnim - 18) / 1) * (27.5-(36.08362)));
            yy = -44.18529 + (((tickAnim - 18) / 1) * (0-(-44.18529)));
            zz = -34.2009 + (((tickAnim - 18) / 1) * (0-(-34.2009)));
        }
        else if (tickAnim >= 19 && tickAnim < 20) {
            xx = 27.5 + (((tickAnim - 19) / 1) * (26.22662-(27.5)));
            yy = 0 + (((tickAnim - 19) / 1) * (32.73166-(0)));
            zz = 0 + (((tickAnim - 19) / 1) * (-104.00376-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 21) {
            xx = 26.22662 + (((tickAnim - 20) / 1) * (35.10328-(26.22662)));
            yy = 32.73166 + (((tickAnim - 20) / 1) * (23.22557-(32.73166)));
            zz = -104.00376 + (((tickAnim - 20) / 1) * (-147.18089-(-104.00376)));
        }
        else if (tickAnim >= 21 && tickAnim < 22) {
            xx = 35.10328 + (((tickAnim - 21) / 1) * (36.08362-(35.10328)));
            yy = 23.22557 + (((tickAnim - 21) / 1) * (-44.18529-(23.22557)));
            zz = -147.18089 + (((tickAnim - 21) / 1) * (-34.2009-(-147.18089)));
        }
        else if (tickAnim >= 22 && tickAnim < 22) {
            xx = 36.08362 + (((tickAnim - 22) / 0) * (27.5-(36.08362)));
            yy = -44.18529 + (((tickAnim - 22) / 0) * (0-(-44.18529)));
            zz = -34.2009 + (((tickAnim - 22) / 0) * (0-(-34.2009)));
        }
        else if (tickAnim >= 22 && tickAnim < 23) {
            xx = 27.5 + (((tickAnim - 22) / 1) * (26.22662-(27.5)));
            yy = 0 + (((tickAnim - 22) / 1) * (32.73166-(0)));
            zz = 0 + (((tickAnim - 22) / 1) * (-104.00376-(0)));
        }
        else if (tickAnim >= 23 && tickAnim < 24) {
            xx = 26.22662 + (((tickAnim - 23) / 1) * (35.10328-(26.22662)));
            yy = 32.73166 + (((tickAnim - 23) / 1) * (23.22557-(32.73166)));
            zz = -104.00376 + (((tickAnim - 23) / 1) * (-147.18089-(-104.00376)));
        }
        else if (tickAnim >= 24 && tickAnim < 25) {
            xx = 35.10328 + (((tickAnim - 24) / 1) * (36.08362-(35.10328)));
            yy = 23.22557 + (((tickAnim - 24) / 1) * (-44.18529-(23.22557)));
            zz = -147.18089 + (((tickAnim - 24) / 1) * (-34.2009-(-147.18089)));
        }
        else if (tickAnim >= 25 && tickAnim < 26) {
            xx = 36.08362 + (((tickAnim - 25) / 1) * (27.5-(36.08362)));
            yy = -44.18529 + (((tickAnim - 25) / 1) * (0-(-44.18529)));
            zz = -34.2009 + (((tickAnim - 25) / 1) * (0-(-34.2009)));
        }
        else if (tickAnim >= 26 && tickAnim < 26) {
            xx = 27.5 + (((tickAnim - 26) / 0) * (26.22662-(27.5)));
            yy = 0 + (((tickAnim - 26) / 0) * (32.73166-(0)));
            zz = 0 + (((tickAnim - 26) / 0) * (-104.00376-(0)));
        }
        else if (tickAnim >= 26 && tickAnim < 27) {
            xx = 26.22662 + (((tickAnim - 26) / 1) * (35.10328-(26.22662)));
            yy = 32.73166 + (((tickAnim - 26) / 1) * (23.22557-(32.73166)));
            zz = -104.00376 + (((tickAnim - 26) / 1) * (-147.18089-(-104.00376)));
        }
        else if (tickAnim >= 27 && tickAnim < 28) {
            xx = 35.10328 + (((tickAnim - 27) / 1) * (36.08362-(35.10328)));
            yy = 23.22557 + (((tickAnim - 27) / 1) * (-44.18529-(23.22557)));
            zz = -147.18089 + (((tickAnim - 27) / 1) * (-34.2009-(-147.18089)));
        }
        else if (tickAnim >= 28 && tickAnim < 29) {
            xx = 36.08362 + (((tickAnim - 28) / 1) * (27.5-(36.08362)));
            yy = -44.18529 + (((tickAnim - 28) / 1) * (0-(-44.18529)));
            zz = -34.2009 + (((tickAnim - 28) / 1) * (0-(-34.2009)));
        }
        else if (tickAnim >= 29 && tickAnim < 30) {
            xx = 27.5 + (((tickAnim - 29) / 1) * (26.22662-(27.5)));
            yy = 0 + (((tickAnim - 29) / 1) * (32.73166-(0)));
            zz = 0 + (((tickAnim - 29) / 1) * (-104.00376-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 30) {
            xx = 26.22662 + (((tickAnim - 30) / 0) * (35.10328-(26.22662)));
            yy = 32.73166 + (((tickAnim - 30) / 0) * (23.22557-(32.73166)));
            zz = -104.00376 + (((tickAnim - 30) / 0) * (-147.18089-(-104.00376)));
        }
        else if (tickAnim >= 30 && tickAnim < 31) {
            xx = 35.10328 + (((tickAnim - 30) / 1) * (36.08362-(35.10328)));
            yy = 23.22557 + (((tickAnim - 30) / 1) * (-44.18529-(23.22557)));
            zz = -147.18089 + (((tickAnim - 30) / 1) * (-34.2009-(-147.18089)));
        }
        else if (tickAnim >= 31 && tickAnim < 32) {
            xx = 36.08362 + (((tickAnim - 31) / 1) * (27.5-(36.08362)));
            yy = -44.18529 + (((tickAnim - 31) / 1) * (0-(-44.18529)));
            zz = -34.2009 + (((tickAnim - 31) / 1) * (0-(-34.2009)));
        }
        else if (tickAnim >= 32 && tickAnim < 33) {
            xx = 27.5 + (((tickAnim - 32) / 1) * (26.22662-(27.5)));
            yy = 0 + (((tickAnim - 32) / 1) * (32.73166-(0)));
            zz = 0 + (((tickAnim - 32) / 1) * (-104.00376-(0)));
        }
        else if (tickAnim >= 33 && tickAnim < 34) {
            xx = 26.22662 + (((tickAnim - 33) / 1) * (35.10328-(26.22662)));
            yy = 32.73166 + (((tickAnim - 33) / 1) * (23.22557-(32.73166)));
            zz = -104.00376 + (((tickAnim - 33) / 1) * (-147.18089-(-104.00376)));
        }
        else if (tickAnim >= 34 && tickAnim < 34) {
            xx = 35.10328 + (((tickAnim - 34) / 0) * (36.08362-(35.10328)));
            yy = 23.22557 + (((tickAnim - 34) / 0) * (-44.18529-(23.22557)));
            zz = -147.18089 + (((tickAnim - 34) / 0) * (-34.2009-(-147.18089)));
        }
        else if (tickAnim >= 34 && tickAnim < 35) {
            xx = 36.08362 + (((tickAnim - 34) / 1) * (27.5-(36.08362)));
            yy = -44.18529 + (((tickAnim - 34) / 1) * (0-(-44.18529)));
            zz = -34.2009 + (((tickAnim - 34) / 1) * (0-(-34.2009)));
        }
        else if (tickAnim >= 35 && tickAnim < 36) {
            xx = 27.5 + (((tickAnim - 35) / 1) * (26.22662-(27.5)));
            yy = 0 + (((tickAnim - 35) / 1) * (32.73166-(0)));
            zz = 0 + (((tickAnim - 35) / 1) * (-104.00376-(0)));
        }
        else if (tickAnim >= 36 && tickAnim < 37) {
            xx = 26.22662 + (((tickAnim - 36) / 1) * (35.10328-(26.22662)));
            yy = 32.73166 + (((tickAnim - 36) / 1) * (23.22557-(32.73166)));
            zz = -104.00376 + (((tickAnim - 36) / 1) * (-147.18089-(-104.00376)));
        }
        else if (tickAnim >= 37 && tickAnim < 38) {
            xx = 35.10328 + (((tickAnim - 37) / 1) * (36.08362-(35.10328)));
            yy = 23.22557 + (((tickAnim - 37) / 1) * (-44.18529-(23.22557)));
            zz = -147.18089 + (((tickAnim - 37) / 1) * (-34.2009-(-147.18089)));
        }
        else if (tickAnim >= 38 && tickAnim < 38) {
            xx = 36.08362 + (((tickAnim - 38) / 0) * (27.5-(36.08362)));
            yy = -44.18529 + (((tickAnim - 38) / 0) * (0-(-44.18529)));
            zz = -34.2009 + (((tickAnim - 38) / 0) * (0-(-34.2009)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightForwing, rightForwing.rotateAngleX + (float) Math.toRadians(xx), rightForwing.rotateAngleY + (float) Math.toRadians(yy), rightForwing.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 1) {
            xx = -22.5 + (((tickAnim - 0) / 1) * (0.33903-(-22.5)));
            yy = 0 + (((tickAnim - 0) / 1) * (26.49348-(0)));
            zz = 0 + (((tickAnim - 0) / 1) * (-72.46415-(0)));
        }
        else if (tickAnim >= 1 && tickAnim < 2) {
            xx = 0.33903 + (((tickAnim - 1) / 1) * (9.18162-(0.33903)));
            yy = 26.49348 + (((tickAnim - 1) / 1) * (10.37022-(26.49348)));
            zz = -72.46415 + (((tickAnim - 1) / 1) * (-124.52594-(-72.46415)));
        }
        else if (tickAnim >= 2 && tickAnim < 2) {
            xx = 9.18162 + (((tickAnim - 2) / 0) * (11.81361-(9.18162)));
            yy = 10.37022 + (((tickAnim - 2) / 0) * (-63.02792-(10.37022)));
            zz = -124.52594 + (((tickAnim - 2) / 0) * (-66.38439-(-124.52594)));
        }
        else if (tickAnim >= 2 && tickAnim < 3) {
            xx = 11.81361 + (((tickAnim - 2) / 1) * (-22.5-(11.81361)));
            yy = -63.02792 + (((tickAnim - 2) / 1) * (0-(-63.02792)));
            zz = -66.38439 + (((tickAnim - 2) / 1) * (0-(-66.38439)));
        }
        else if (tickAnim >= 3 && tickAnim < 4) {
            xx = -22.5 + (((tickAnim - 3) / 1) * (0.33903-(-22.5)));
            yy = 0 + (((tickAnim - 3) / 1) * (26.49348-(0)));
            zz = 0 + (((tickAnim - 3) / 1) * (-72.46415-(0)));
        }
        else if (tickAnim >= 4 && tickAnim < 5) {
            xx = 0.33903 + (((tickAnim - 4) / 1) * (9.18162-(0.33903)));
            yy = 26.49348 + (((tickAnim - 4) / 1) * (10.37022-(26.49348)));
            zz = -72.46415 + (((tickAnim - 4) / 1) * (-124.52594-(-72.46415)));
        }
        else if (tickAnim >= 5 && tickAnim < 6) {
            xx = 9.18162 + (((tickAnim - 5) / 1) * (11.81361-(9.18162)));
            yy = 10.37022 + (((tickAnim - 5) / 1) * (-63.02792-(10.37022)));
            zz = -124.52594 + (((tickAnim - 5) / 1) * (-66.38439-(-124.52594)));
        }
        else if (tickAnim >= 6 && tickAnim < 6) {
            xx = 11.81361 + (((tickAnim - 6) / 0) * (-22.5-(11.81361)));
            yy = -63.02792 + (((tickAnim - 6) / 0) * (0-(-63.02792)));
            zz = -66.38439 + (((tickAnim - 6) / 0) * (0-(-66.38439)));
        }
        else if (tickAnim >= 6 && tickAnim < 7) {
            xx = -22.5 + (((tickAnim - 6) / 1) * (0.33903-(-22.5)));
            yy = 0 + (((tickAnim - 6) / 1) * (26.49348-(0)));
            zz = 0 + (((tickAnim - 6) / 1) * (-72.46415-(0)));
        }
        else if (tickAnim >= 7 && tickAnim < 8) {
            xx = 0.33903 + (((tickAnim - 7) / 1) * (9.18162-(0.33903)));
            yy = 26.49348 + (((tickAnim - 7) / 1) * (10.37022-(26.49348)));
            zz = -72.46415 + (((tickAnim - 7) / 1) * (-124.52594-(-72.46415)));
        }
        else if (tickAnim >= 8 && tickAnim < 9) {
            xx = 9.18162 + (((tickAnim - 8) / 1) * (11.81361-(9.18162)));
            yy = 10.37022 + (((tickAnim - 8) / 1) * (-63.02792-(10.37022)));
            zz = -124.52594 + (((tickAnim - 8) / 1) * (-66.38439-(-124.52594)));
        }
        else if (tickAnim >= 9 && tickAnim < 10) {
            xx = 11.81361 + (((tickAnim - 9) / 1) * (-22.5-(11.81361)));
            yy = -63.02792 + (((tickAnim - 9) / 1) * (0-(-63.02792)));
            zz = -66.38439 + (((tickAnim - 9) / 1) * (0-(-66.38439)));
        }
        else if (tickAnim >= 10 && tickAnim < 10) {
            xx = -22.5 + (((tickAnim - 10) / 0) * (0.33903-(-22.5)));
            yy = 0 + (((tickAnim - 10) / 0) * (26.49348-(0)));
            zz = 0 + (((tickAnim - 10) / 0) * (-72.46415-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 11) {
            xx = 0.33903 + (((tickAnim - 10) / 1) * (9.18162-(0.33903)));
            yy = 26.49348 + (((tickAnim - 10) / 1) * (10.37022-(26.49348)));
            zz = -72.46415 + (((tickAnim - 10) / 1) * (-124.52594-(-72.46415)));
        }
        else if (tickAnim >= 11 && tickAnim < 12) {
            xx = 9.18162 + (((tickAnim - 11) / 1) * (11.81361-(9.18162)));
            yy = 10.37022 + (((tickAnim - 11) / 1) * (-63.02792-(10.37022)));
            zz = -124.52594 + (((tickAnim - 11) / 1) * (-66.38439-(-124.52594)));
        }
        else if (tickAnim >= 12 && tickAnim < 13) {
            xx = 11.81361 + (((tickAnim - 12) / 1) * (-22.5-(11.81361)));
            yy = -63.02792 + (((tickAnim - 12) / 1) * (0-(-63.02792)));
            zz = -66.38439 + (((tickAnim - 12) / 1) * (0-(-66.38439)));
        }
        else if (tickAnim >= 13 && tickAnim < 14) {
            xx = -22.5 + (((tickAnim - 13) / 1) * (0.33903-(-22.5)));
            yy = 0 + (((tickAnim - 13) / 1) * (26.49348-(0)));
            zz = 0 + (((tickAnim - 13) / 1) * (-72.46415-(0)));
        }
        else if (tickAnim >= 14 && tickAnim < 14) {
            xx = 0.33903 + (((tickAnim - 14) / 0) * (9.18162-(0.33903)));
            yy = 26.49348 + (((tickAnim - 14) / 0) * (10.37022-(26.49348)));
            zz = -72.46415 + (((tickAnim - 14) / 0) * (-124.52594-(-72.46415)));
        }
        else if (tickAnim >= 14 && tickAnim < 15) {
            xx = 9.18162 + (((tickAnim - 14) / 1) * (11.81361-(9.18162)));
            yy = 10.37022 + (((tickAnim - 14) / 1) * (-63.02792-(10.37022)));
            zz = -124.52594 + (((tickAnim - 14) / 1) * (-66.38439-(-124.52594)));
        }
        else if (tickAnim >= 15 && tickAnim < 16) {
            xx = 11.81361 + (((tickAnim - 15) / 1) * (-22.5-(11.81361)));
            yy = -63.02792 + (((tickAnim - 15) / 1) * (0-(-63.02792)));
            zz = -66.38439 + (((tickAnim - 15) / 1) * (0-(-66.38439)));
        }
        else if (tickAnim >= 16 && tickAnim < 17) {
            xx = -22.5 + (((tickAnim - 16) / 1) * (0.33903-(-22.5)));
            yy = 0 + (((tickAnim - 16) / 1) * (26.49348-(0)));
            zz = 0 + (((tickAnim - 16) / 1) * (-72.46415-(0)));
        }
        else if (tickAnim >= 17 && tickAnim < 18) {
            xx = 0.33903 + (((tickAnim - 17) / 1) * (9.18162-(0.33903)));
            yy = 26.49348 + (((tickAnim - 17) / 1) * (10.37022-(26.49348)));
            zz = -72.46415 + (((tickAnim - 17) / 1) * (-124.52594-(-72.46415)));
        }
        else if (tickAnim >= 18 && tickAnim < 18) {
            xx = 9.18162 + (((tickAnim - 18) / 0) * (11.81361-(9.18162)));
            yy = 10.37022 + (((tickAnim - 18) / 0) * (-63.02792-(10.37022)));
            zz = -124.52594 + (((tickAnim - 18) / 0) * (-66.38439-(-124.52594)));
        }
        else if (tickAnim >= 18 && tickAnim < 19) {
            xx = 11.81361 + (((tickAnim - 18) / 1) * (-22.5-(11.81361)));
            yy = -63.02792 + (((tickAnim - 18) / 1) * (0-(-63.02792)));
            zz = -66.38439 + (((tickAnim - 18) / 1) * (0-(-66.38439)));
        }
        else if (tickAnim >= 19 && tickAnim < 20) {
            xx = -22.5 + (((tickAnim - 19) / 1) * (0.33903-(-22.5)));
            yy = 0 + (((tickAnim - 19) / 1) * (26.49348-(0)));
            zz = 0 + (((tickAnim - 19) / 1) * (-72.46415-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 21) {
            xx = 0.33903 + (((tickAnim - 20) / 1) * (9.18162-(0.33903)));
            yy = 26.49348 + (((tickAnim - 20) / 1) * (10.37022-(26.49348)));
            zz = -72.46415 + (((tickAnim - 20) / 1) * (-124.52594-(-72.46415)));
        }
        else if (tickAnim >= 21 && tickAnim < 22) {
            xx = 9.18162 + (((tickAnim - 21) / 1) * (11.81361-(9.18162)));
            yy = 10.37022 + (((tickAnim - 21) / 1) * (-63.02792-(10.37022)));
            zz = -124.52594 + (((tickAnim - 21) / 1) * (-66.38439-(-124.52594)));
        }
        else if (tickAnim >= 22 && tickAnim < 22) {
            xx = 11.81361 + (((tickAnim - 22) / 0) * (-22.5-(11.81361)));
            yy = -63.02792 + (((tickAnim - 22) / 0) * (0-(-63.02792)));
            zz = -66.38439 + (((tickAnim - 22) / 0) * (0-(-66.38439)));
        }
        else if (tickAnim >= 22 && tickAnim < 23) {
            xx = -22.5 + (((tickAnim - 22) / 1) * (0.33903-(-22.5)));
            yy = 0 + (((tickAnim - 22) / 1) * (26.49348-(0)));
            zz = 0 + (((tickAnim - 22) / 1) * (-72.46415-(0)));
        }
        else if (tickAnim >= 23 && tickAnim < 24) {
            xx = 0.33903 + (((tickAnim - 23) / 1) * (9.18162-(0.33903)));
            yy = 26.49348 + (((tickAnim - 23) / 1) * (10.37022-(26.49348)));
            zz = -72.46415 + (((tickAnim - 23) / 1) * (-124.52594-(-72.46415)));
        }
        else if (tickAnim >= 24 && tickAnim < 25) {
            xx = 9.18162 + (((tickAnim - 24) / 1) * (11.81361-(9.18162)));
            yy = 10.37022 + (((tickAnim - 24) / 1) * (-63.02792-(10.37022)));
            zz = -124.52594 + (((tickAnim - 24) / 1) * (-66.38439-(-124.52594)));
        }
        else if (tickAnim >= 25 && tickAnim < 26) {
            xx = 11.81361 + (((tickAnim - 25) / 1) * (-22.5-(11.81361)));
            yy = -63.02792 + (((tickAnim - 25) / 1) * (0-(-63.02792)));
            zz = -66.38439 + (((tickAnim - 25) / 1) * (0-(-66.38439)));
        }
        else if (tickAnim >= 26 && tickAnim < 26) {
            xx = -22.5 + (((tickAnim - 26) / 0) * (0.33903-(-22.5)));
            yy = 0 + (((tickAnim - 26) / 0) * (26.49348-(0)));
            zz = 0 + (((tickAnim - 26) / 0) * (-72.46415-(0)));
        }
        else if (tickAnim >= 26 && tickAnim < 27) {
            xx = 0.33903 + (((tickAnim - 26) / 1) * (9.18162-(0.33903)));
            yy = 26.49348 + (((tickAnim - 26) / 1) * (10.37022-(26.49348)));
            zz = -72.46415 + (((tickAnim - 26) / 1) * (-124.52594-(-72.46415)));
        }
        else if (tickAnim >= 27 && tickAnim < 28) {
            xx = 9.18162 + (((tickAnim - 27) / 1) * (11.81361-(9.18162)));
            yy = 10.37022 + (((tickAnim - 27) / 1) * (-63.02792-(10.37022)));
            zz = -124.52594 + (((tickAnim - 27) / 1) * (-66.38439-(-124.52594)));
        }
        else if (tickAnim >= 28 && tickAnim < 29) {
            xx = 11.81361 + (((tickAnim - 28) / 1) * (-22.5-(11.81361)));
            yy = -63.02792 + (((tickAnim - 28) / 1) * (0-(-63.02792)));
            zz = -66.38439 + (((tickAnim - 28) / 1) * (0-(-66.38439)));
        }
        else if (tickAnim >= 29 && tickAnim < 30) {
            xx = -22.5 + (((tickAnim - 29) / 1) * (0.33903-(-22.5)));
            yy = 0 + (((tickAnim - 29) / 1) * (26.49348-(0)));
            zz = 0 + (((tickAnim - 29) / 1) * (-72.46415-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 30) {
            xx = 0.33903 + (((tickAnim - 30) / 0) * (9.18162-(0.33903)));
            yy = 26.49348 + (((tickAnim - 30) / 0) * (10.37022-(26.49348)));
            zz = -72.46415 + (((tickAnim - 30) / 0) * (-124.52594-(-72.46415)));
        }
        else if (tickAnim >= 30 && tickAnim < 31) {
            xx = 9.18162 + (((tickAnim - 30) / 1) * (11.81361-(9.18162)));
            yy = 10.37022 + (((tickAnim - 30) / 1) * (-63.02792-(10.37022)));
            zz = -124.52594 + (((tickAnim - 30) / 1) * (-66.38439-(-124.52594)));
        }
        else if (tickAnim >= 31 && tickAnim < 32) {
            xx = 11.81361 + (((tickAnim - 31) / 1) * (-22.5-(11.81361)));
            yy = -63.02792 + (((tickAnim - 31) / 1) * (0-(-63.02792)));
            zz = -66.38439 + (((tickAnim - 31) / 1) * (0-(-66.38439)));
        }
        else if (tickAnim >= 32 && tickAnim < 33) {
            xx = -22.5 + (((tickAnim - 32) / 1) * (0.33903-(-22.5)));
            yy = 0 + (((tickAnim - 32) / 1) * (26.49348-(0)));
            zz = 0 + (((tickAnim - 32) / 1) * (-72.46415-(0)));
        }
        else if (tickAnim >= 33 && tickAnim < 34) {
            xx = 0.33903 + (((tickAnim - 33) / 1) * (9.18162-(0.33903)));
            yy = 26.49348 + (((tickAnim - 33) / 1) * (10.37022-(26.49348)));
            zz = -72.46415 + (((tickAnim - 33) / 1) * (-124.52594-(-72.46415)));
        }
        else if (tickAnim >= 34 && tickAnim < 34) {
            xx = 9.18162 + (((tickAnim - 34) / 0) * (11.81361-(9.18162)));
            yy = 10.37022 + (((tickAnim - 34) / 0) * (-63.02792-(10.37022)));
            zz = -124.52594 + (((tickAnim - 34) / 0) * (-66.38439-(-124.52594)));
        }
        else if (tickAnim >= 34 && tickAnim < 35) {
            xx = 11.81361 + (((tickAnim - 34) / 1) * (-22.5-(11.81361)));
            yy = -63.02792 + (((tickAnim - 34) / 1) * (0-(-63.02792)));
            zz = -66.38439 + (((tickAnim - 34) / 1) * (0-(-66.38439)));
        }
        else if (tickAnim >= 35 && tickAnim < 36) {
            xx = -22.5 + (((tickAnim - 35) / 1) * (0.33903-(-22.5)));
            yy = 0 + (((tickAnim - 35) / 1) * (26.49348-(0)));
            zz = 0 + (((tickAnim - 35) / 1) * (-72.46415-(0)));
        }
        else if (tickAnim >= 36 && tickAnim < 37) {
            xx = 0.33903 + (((tickAnim - 36) / 1) * (9.18162-(0.33903)));
            yy = 26.49348 + (((tickAnim - 36) / 1) * (10.37022-(26.49348)));
            zz = -72.46415 + (((tickAnim - 36) / 1) * (-124.52594-(-72.46415)));
        }
        else if (tickAnim >= 37 && tickAnim < 38) {
            xx = 9.18162 + (((tickAnim - 37) / 1) * (11.81361-(9.18162)));
            yy = 10.37022 + (((tickAnim - 37) / 1) * (-63.02792-(10.37022)));
            zz = -124.52594 + (((tickAnim - 37) / 1) * (-66.38439-(-124.52594)));
        }
        else if (tickAnim >= 38 && tickAnim < 38) {
            xx = 11.81361 + (((tickAnim - 38) / 0) * (-22.5-(11.81361)));
            yy = -63.02792 + (((tickAnim - 38) / 0) * (0-(-63.02792)));
            zz = -66.38439 + (((tickAnim - 38) / 0) * (0-(-66.38439)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightHindwing, rightHindwing.rotateAngleX + (float) Math.toRadians(xx), rightHindwing.rotateAngleY + (float) Math.toRadians(yy), rightHindwing.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 1) {
            xx = 27.5 + (((tickAnim - 0) / 1) * (26.22662-(27.5)));
            yy = 0 + (((tickAnim - 0) / 1) * (-32.73166-(0)));
            zz = 0 + (((tickAnim - 0) / 1) * (104.00376-(0)));
        }
        else if (tickAnim >= 1 && tickAnim < 2) {
            xx = 26.22662 + (((tickAnim - 1) / 1) * (35.10328-(26.22662)));
            yy = -32.73166 + (((tickAnim - 1) / 1) * (-23.22557-(-32.73166)));
            zz = 104.00376 + (((tickAnim - 1) / 1) * (147.18089-(104.00376)));
        }
        else if (tickAnim >= 2 && tickAnim < 2) {
            xx = 35.10328 + (((tickAnim - 2) / 0) * (36.08362-(35.10328)));
            yy = -23.22557 + (((tickAnim - 2) / 0) * (44.18529-(-23.22557)));
            zz = 147.18089 + (((tickAnim - 2) / 0) * (34.2009-(147.18089)));
        }
        else if (tickAnim >= 2 && tickAnim < 3) {
            xx = 36.08362 + (((tickAnim - 2) / 1) * (27.5-(36.08362)));
            yy = 44.18529 + (((tickAnim - 2) / 1) * (0-(44.18529)));
            zz = 34.2009 + (((tickAnim - 2) / 1) * (0-(34.2009)));
        }
        else if (tickAnim >= 3 && tickAnim < 4) {
            xx = 27.5 + (((tickAnim - 3) / 1) * (26.22662-(27.5)));
            yy = 0 + (((tickAnim - 3) / 1) * (-32.73166-(0)));
            zz = 0 + (((tickAnim - 3) / 1) * (104.00376-(0)));
        }
        else if (tickAnim >= 4 && tickAnim < 5) {
            xx = 26.22662 + (((tickAnim - 4) / 1) * (35.10328-(26.22662)));
            yy = -32.73166 + (((tickAnim - 4) / 1) * (-23.22557-(-32.73166)));
            zz = 104.00376 + (((tickAnim - 4) / 1) * (147.18089-(104.00376)));
        }
        else if (tickAnim >= 5 && tickAnim < 6) {
            xx = 35.10328 + (((tickAnim - 5) / 1) * (36.08362-(35.10328)));
            yy = -23.22557 + (((tickAnim - 5) / 1) * (44.18529-(-23.22557)));
            zz = 147.18089 + (((tickAnim - 5) / 1) * (34.2009-(147.18089)));
        }
        else if (tickAnim >= 6 && tickAnim < 6) {
            xx = 36.08362 + (((tickAnim - 6) / 0) * (27.5-(36.08362)));
            yy = 44.18529 + (((tickAnim - 6) / 0) * (0-(44.18529)));
            zz = 34.2009 + (((tickAnim - 6) / 0) * (0-(34.2009)));
        }
        else if (tickAnim >= 6 && tickAnim < 7) {
            xx = 27.5 + (((tickAnim - 6) / 1) * (26.22662-(27.5)));
            yy = 0 + (((tickAnim - 6) / 1) * (-32.73166-(0)));
            zz = 0 + (((tickAnim - 6) / 1) * (104.00376-(0)));
        }
        else if (tickAnim >= 7 && tickAnim < 8) {
            xx = 26.22662 + (((tickAnim - 7) / 1) * (35.10328-(26.22662)));
            yy = -32.73166 + (((tickAnim - 7) / 1) * (-23.22557-(-32.73166)));
            zz = 104.00376 + (((tickAnim - 7) / 1) * (147.18089-(104.00376)));
        }
        else if (tickAnim >= 8 && tickAnim < 9) {
            xx = 35.10328 + (((tickAnim - 8) / 1) * (36.08362-(35.10328)));
            yy = -23.22557 + (((tickAnim - 8) / 1) * (44.18529-(-23.22557)));
            zz = 147.18089 + (((tickAnim - 8) / 1) * (34.2009-(147.18089)));
        }
        else if (tickAnim >= 9 && tickAnim < 10) {
            xx = 36.08362 + (((tickAnim - 9) / 1) * (27.5-(36.08362)));
            yy = 44.18529 + (((tickAnim - 9) / 1) * (0-(44.18529)));
            zz = 34.2009 + (((tickAnim - 9) / 1) * (0-(34.2009)));
        }
        else if (tickAnim >= 10 && tickAnim < 10) {
            xx = 27.5 + (((tickAnim - 10) / 0) * (26.22662-(27.5)));
            yy = 0 + (((tickAnim - 10) / 0) * (-32.73166-(0)));
            zz = 0 + (((tickAnim - 10) / 0) * (104.00376-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 11) {
            xx = 26.22662 + (((tickAnim - 10) / 1) * (35.10328-(26.22662)));
            yy = -32.73166 + (((tickAnim - 10) / 1) * (-23.22557-(-32.73166)));
            zz = 104.00376 + (((tickAnim - 10) / 1) * (147.18089-(104.00376)));
        }
        else if (tickAnim >= 11 && tickAnim < 12) {
            xx = 35.10328 + (((tickAnim - 11) / 1) * (36.08362-(35.10328)));
            yy = -23.22557 + (((tickAnim - 11) / 1) * (44.18529-(-23.22557)));
            zz = 147.18089 + (((tickAnim - 11) / 1) * (34.2009-(147.18089)));
        }
        else if (tickAnim >= 12 && tickAnim < 13) {
            xx = 36.08362 + (((tickAnim - 12) / 1) * (27.5-(36.08362)));
            yy = 44.18529 + (((tickAnim - 12) / 1) * (0-(44.18529)));
            zz = 34.2009 + (((tickAnim - 12) / 1) * (0-(34.2009)));
        }
        else if (tickAnim >= 13 && tickAnim < 14) {
            xx = 27.5 + (((tickAnim - 13) / 1) * (26.22662-(27.5)));
            yy = 0 + (((tickAnim - 13) / 1) * (-32.73166-(0)));
            zz = 0 + (((tickAnim - 13) / 1) * (104.00376-(0)));
        }
        else if (tickAnim >= 14 && tickAnim < 14) {
            xx = 26.22662 + (((tickAnim - 14) / 0) * (35.10328-(26.22662)));
            yy = -32.73166 + (((tickAnim - 14) / 0) * (-23.22557-(-32.73166)));
            zz = 104.00376 + (((tickAnim - 14) / 0) * (147.18089-(104.00376)));
        }
        else if (tickAnim >= 14 && tickAnim < 15) {
            xx = 35.10328 + (((tickAnim - 14) / 1) * (36.08362-(35.10328)));
            yy = -23.22557 + (((tickAnim - 14) / 1) * (44.18529-(-23.22557)));
            zz = 147.18089 + (((tickAnim - 14) / 1) * (34.2009-(147.18089)));
        }
        else if (tickAnim >= 15 && tickAnim < 16) {
            xx = 36.08362 + (((tickAnim - 15) / 1) * (27.5-(36.08362)));
            yy = 44.18529 + (((tickAnim - 15) / 1) * (0-(44.18529)));
            zz = 34.2009 + (((tickAnim - 15) / 1) * (0-(34.2009)));
        }
        else if (tickAnim >= 16 && tickAnim < 17) {
            xx = 27.5 + (((tickAnim - 16) / 1) * (26.22662-(27.5)));
            yy = 0 + (((tickAnim - 16) / 1) * (-32.73166-(0)));
            zz = 0 + (((tickAnim - 16) / 1) * (104.00376-(0)));
        }
        else if (tickAnim >= 17 && tickAnim < 18) {
            xx = 26.22662 + (((tickAnim - 17) / 1) * (35.10328-(26.22662)));
            yy = -32.73166 + (((tickAnim - 17) / 1) * (-23.22557-(-32.73166)));
            zz = 104.00376 + (((tickAnim - 17) / 1) * (147.18089-(104.00376)));
        }
        else if (tickAnim >= 18 && tickAnim < 18) {
            xx = 35.10328 + (((tickAnim - 18) / 0) * (36.08362-(35.10328)));
            yy = -23.22557 + (((tickAnim - 18) / 0) * (44.18529-(-23.22557)));
            zz = 147.18089 + (((tickAnim - 18) / 0) * (34.2009-(147.18089)));
        }
        else if (tickAnim >= 18 && tickAnim < 19) {
            xx = 36.08362 + (((tickAnim - 18) / 1) * (27.5-(36.08362)));
            yy = 44.18529 + (((tickAnim - 18) / 1) * (0-(44.18529)));
            zz = 34.2009 + (((tickAnim - 18) / 1) * (0-(34.2009)));
        }
        else if (tickAnim >= 19 && tickAnim < 20) {
            xx = 27.5 + (((tickAnim - 19) / 1) * (26.22662-(27.5)));
            yy = 0 + (((tickAnim - 19) / 1) * (-32.73166-(0)));
            zz = 0 + (((tickAnim - 19) / 1) * (104.00376-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 21) {
            xx = 26.22662 + (((tickAnim - 20) / 1) * (35.10328-(26.22662)));
            yy = -32.73166 + (((tickAnim - 20) / 1) * (-23.22557-(-32.73166)));
            zz = 104.00376 + (((tickAnim - 20) / 1) * (147.18089-(104.00376)));
        }
        else if (tickAnim >= 21 && tickAnim < 22) {
            xx = 35.10328 + (((tickAnim - 21) / 1) * (36.08362-(35.10328)));
            yy = -23.22557 + (((tickAnim - 21) / 1) * (44.18529-(-23.22557)));
            zz = 147.18089 + (((tickAnim - 21) / 1) * (34.2009-(147.18089)));
        }
        else if (tickAnim >= 22 && tickAnim < 22) {
            xx = 36.08362 + (((tickAnim - 22) / 0) * (27.5-(36.08362)));
            yy = 44.18529 + (((tickAnim - 22) / 0) * (0-(44.18529)));
            zz = 34.2009 + (((tickAnim - 22) / 0) * (0-(34.2009)));
        }
        else if (tickAnim >= 22 && tickAnim < 23) {
            xx = 27.5 + (((tickAnim - 22) / 1) * (26.22662-(27.5)));
            yy = 0 + (((tickAnim - 22) / 1) * (-32.73166-(0)));
            zz = 0 + (((tickAnim - 22) / 1) * (104.00376-(0)));
        }
        else if (tickAnim >= 23 && tickAnim < 24) {
            xx = 26.22662 + (((tickAnim - 23) / 1) * (35.10328-(26.22662)));
            yy = -32.73166 + (((tickAnim - 23) / 1) * (-23.22557-(-32.73166)));
            zz = 104.00376 + (((tickAnim - 23) / 1) * (147.18089-(104.00376)));
        }
        else if (tickAnim >= 24 && tickAnim < 25) {
            xx = 35.10328 + (((tickAnim - 24) / 1) * (36.08362-(35.10328)));
            yy = -23.22557 + (((tickAnim - 24) / 1) * (44.18529-(-23.22557)));
            zz = 147.18089 + (((tickAnim - 24) / 1) * (34.2009-(147.18089)));
        }
        else if (tickAnim >= 25 && tickAnim < 26) {
            xx = 36.08362 + (((tickAnim - 25) / 1) * (27.5-(36.08362)));
            yy = 44.18529 + (((tickAnim - 25) / 1) * (0-(44.18529)));
            zz = 34.2009 + (((tickAnim - 25) / 1) * (0-(34.2009)));
        }
        else if (tickAnim >= 26 && tickAnim < 26) {
            xx = 27.5 + (((tickAnim - 26) / 0) * (26.22662-(27.5)));
            yy = 0 + (((tickAnim - 26) / 0) * (-32.73166-(0)));
            zz = 0 + (((tickAnim - 26) / 0) * (104.00376-(0)));
        }
        else if (tickAnim >= 26 && tickAnim < 27) {
            xx = 26.22662 + (((tickAnim - 26) / 1) * (35.10328-(26.22662)));
            yy = -32.73166 + (((tickAnim - 26) / 1) * (-23.22557-(-32.73166)));
            zz = 104.00376 + (((tickAnim - 26) / 1) * (147.18089-(104.00376)));
        }
        else if (tickAnim >= 27 && tickAnim < 28) {
            xx = 35.10328 + (((tickAnim - 27) / 1) * (36.08362-(35.10328)));
            yy = -23.22557 + (((tickAnim - 27) / 1) * (44.18529-(-23.22557)));
            zz = 147.18089 + (((tickAnim - 27) / 1) * (34.2009-(147.18089)));
        }
        else if (tickAnim >= 28 && tickAnim < 29) {
            xx = 36.08362 + (((tickAnim - 28) / 1) * (27.5-(36.08362)));
            yy = 44.18529 + (((tickAnim - 28) / 1) * (0-(44.18529)));
            zz = 34.2009 + (((tickAnim - 28) / 1) * (0-(34.2009)));
        }
        else if (tickAnim >= 29 && tickAnim < 30) {
            xx = 27.5 + (((tickAnim - 29) / 1) * (26.22662-(27.5)));
            yy = 0 + (((tickAnim - 29) / 1) * (-32.73166-(0)));
            zz = 0 + (((tickAnim - 29) / 1) * (104.00376-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 30) {
            xx = 26.22662 + (((tickAnim - 30) / 0) * (35.10328-(26.22662)));
            yy = -32.73166 + (((tickAnim - 30) / 0) * (-23.22557-(-32.73166)));
            zz = 104.00376 + (((tickAnim - 30) / 0) * (147.18089-(104.00376)));
        }
        else if (tickAnim >= 30 && tickAnim < 31) {
            xx = 35.10328 + (((tickAnim - 30) / 1) * (36.08362-(35.10328)));
            yy = -23.22557 + (((tickAnim - 30) / 1) * (44.18529-(-23.22557)));
            zz = 147.18089 + (((tickAnim - 30) / 1) * (34.2009-(147.18089)));
        }
        else if (tickAnim >= 31 && tickAnim < 32) {
            xx = 36.08362 + (((tickAnim - 31) / 1) * (27.5-(36.08362)));
            yy = 44.18529 + (((tickAnim - 31) / 1) * (0-(44.18529)));
            zz = 34.2009 + (((tickAnim - 31) / 1) * (0-(34.2009)));
        }
        else if (tickAnim >= 32 && tickAnim < 33) {
            xx = 27.5 + (((tickAnim - 32) / 1) * (26.22662-(27.5)));
            yy = 0 + (((tickAnim - 32) / 1) * (-32.73166-(0)));
            zz = 0 + (((tickAnim - 32) / 1) * (104.00376-(0)));
        }
        else if (tickAnim >= 33 && tickAnim < 34) {
            xx = 26.22662 + (((tickAnim - 33) / 1) * (35.10328-(26.22662)));
            yy = -32.73166 + (((tickAnim - 33) / 1) * (-23.22557-(-32.73166)));
            zz = 104.00376 + (((tickAnim - 33) / 1) * (147.18089-(104.00376)));
        }
        else if (tickAnim >= 34 && tickAnim < 34) {
            xx = 35.10328 + (((tickAnim - 34) / 0) * (36.08362-(35.10328)));
            yy = -23.22557 + (((tickAnim - 34) / 0) * (44.18529-(-23.22557)));
            zz = 147.18089 + (((tickAnim - 34) / 0) * (34.2009-(147.18089)));
        }
        else if (tickAnim >= 34 && tickAnim < 35) {
            xx = 36.08362 + (((tickAnim - 34) / 1) * (27.5-(36.08362)));
            yy = 44.18529 + (((tickAnim - 34) / 1) * (0-(44.18529)));
            zz = 34.2009 + (((tickAnim - 34) / 1) * (0-(34.2009)));
        }
        else if (tickAnim >= 35 && tickAnim < 36) {
            xx = 27.5 + (((tickAnim - 35) / 1) * (26.22662-(27.5)));
            yy = 0 + (((tickAnim - 35) / 1) * (-32.73166-(0)));
            zz = 0 + (((tickAnim - 35) / 1) * (104.00376-(0)));
        }
        else if (tickAnim >= 36 && tickAnim < 37) {
            xx = 26.22662 + (((tickAnim - 36) / 1) * (35.10328-(26.22662)));
            yy = -32.73166 + (((tickAnim - 36) / 1) * (-23.22557-(-32.73166)));
            zz = 104.00376 + (((tickAnim - 36) / 1) * (147.18089-(104.00376)));
        }
        else if (tickAnim >= 37 && tickAnim < 38) {
            xx = 35.10328 + (((tickAnim - 37) / 1) * (36.08362-(35.10328)));
            yy = -23.22557 + (((tickAnim - 37) / 1) * (44.18529-(-23.22557)));
            zz = 147.18089 + (((tickAnim - 37) / 1) * (34.2009-(147.18089)));
        }
        else if (tickAnim >= 38 && tickAnim < 38) {
            xx = 36.08362 + (((tickAnim - 38) / 0) * (27.5-(36.08362)));
            yy = 44.18529 + (((tickAnim - 38) / 0) * (0-(44.18529)));
            zz = 34.2009 + (((tickAnim - 38) / 0) * (0-(34.2009)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftForewing, leftForewing.rotateAngleX + (float) Math.toRadians(xx), leftForewing.rotateAngleY + (float) Math.toRadians(yy), leftForewing.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 1) {
            xx = -22.5 + (((tickAnim - 0) / 1) * (0.33903-(-22.5)));
            yy = 0 + (((tickAnim - 0) / 1) * (-26.49348-(0)));
            zz = 0 + (((tickAnim - 0) / 1) * (72.46415-(0)));
        }
        else if (tickAnim >= 1 && tickAnim < 2) {
            xx = 0.33903 + (((tickAnim - 1) / 1) * (9.18162-(0.33903)));
            yy = -26.49348 + (((tickAnim - 1) / 1) * (-10.37022-(-26.49348)));
            zz = 72.46415 + (((tickAnim - 1) / 1) * (124.52594-(72.46415)));
        }
        else if (tickAnim >= 2 && tickAnim < 2) {
            xx = 9.18162 + (((tickAnim - 2) / 0) * (11.81361-(9.18162)));
            yy = -10.37022 + (((tickAnim - 2) / 0) * (63.02792-(-10.37022)));
            zz = 124.52594 + (((tickAnim - 2) / 0) * (66.38439-(124.52594)));
        }
        else if (tickAnim >= 2 && tickAnim < 3) {
            xx = 11.81361 + (((tickAnim - 2) / 1) * (-22.5-(11.81361)));
            yy = 63.02792 + (((tickAnim - 2) / 1) * (0-(63.02792)));
            zz = 66.38439 + (((tickAnim - 2) / 1) * (0-(66.38439)));
        }
        else if (tickAnim >= 3 && tickAnim < 4) {
            xx = -22.5 + (((tickAnim - 3) / 1) * (0.33903-(-22.5)));
            yy = 0 + (((tickAnim - 3) / 1) * (-26.49348-(0)));
            zz = 0 + (((tickAnim - 3) / 1) * (72.46415-(0)));
        }
        else if (tickAnim >= 4 && tickAnim < 5) {
            xx = 0.33903 + (((tickAnim - 4) / 1) * (9.18162-(0.33903)));
            yy = -26.49348 + (((tickAnim - 4) / 1) * (-10.37022-(-26.49348)));
            zz = 72.46415 + (((tickAnim - 4) / 1) * (124.52594-(72.46415)));
        }
        else if (tickAnim >= 5 && tickAnim < 6) {
            xx = 9.18162 + (((tickAnim - 5) / 1) * (11.81361-(9.18162)));
            yy = -10.37022 + (((tickAnim - 5) / 1) * (63.02792-(-10.37022)));
            zz = 124.52594 + (((tickAnim - 5) / 1) * (66.38439-(124.52594)));
        }
        else if (tickAnim >= 6 && tickAnim < 6) {
            xx = 11.81361 + (((tickAnim - 6) / 0) * (-22.5-(11.81361)));
            yy = 63.02792 + (((tickAnim - 6) / 0) * (0-(63.02792)));
            zz = 66.38439 + (((tickAnim - 6) / 0) * (0-(66.38439)));
        }
        else if (tickAnim >= 6 && tickAnim < 7) {
            xx = -22.5 + (((tickAnim - 6) / 1) * (0.33903-(-22.5)));
            yy = 0 + (((tickAnim - 6) / 1) * (-26.49348-(0)));
            zz = 0 + (((tickAnim - 6) / 1) * (72.46415-(0)));
        }
        else if (tickAnim >= 7 && tickAnim < 8) {
            xx = 0.33903 + (((tickAnim - 7) / 1) * (9.18162-(0.33903)));
            yy = -26.49348 + (((tickAnim - 7) / 1) * (-10.37022-(-26.49348)));
            zz = 72.46415 + (((tickAnim - 7) / 1) * (124.52594-(72.46415)));
        }
        else if (tickAnim >= 8 && tickAnim < 9) {
            xx = 9.18162 + (((tickAnim - 8) / 1) * (11.81361-(9.18162)));
            yy = -10.37022 + (((tickAnim - 8) / 1) * (63.02792-(-10.37022)));
            zz = 124.52594 + (((tickAnim - 8) / 1) * (66.38439-(124.52594)));
        }
        else if (tickAnim >= 9 && tickAnim < 10) {
            xx = 11.81361 + (((tickAnim - 9) / 1) * (-22.5-(11.81361)));
            yy = 63.02792 + (((tickAnim - 9) / 1) * (0-(63.02792)));
            zz = 66.38439 + (((tickAnim - 9) / 1) * (0-(66.38439)));
        }
        else if (tickAnim >= 10 && tickAnim < 10) {
            xx = -22.5 + (((tickAnim - 10) / 0) * (0.33903-(-22.5)));
            yy = 0 + (((tickAnim - 10) / 0) * (-26.49348-(0)));
            zz = 0 + (((tickAnim - 10) / 0) * (72.46415-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 11) {
            xx = 0.33903 + (((tickAnim - 10) / 1) * (9.18162-(0.33903)));
            yy = -26.49348 + (((tickAnim - 10) / 1) * (-10.37022-(-26.49348)));
            zz = 72.46415 + (((tickAnim - 10) / 1) * (124.52594-(72.46415)));
        }
        else if (tickAnim >= 11 && tickAnim < 12) {
            xx = 9.18162 + (((tickAnim - 11) / 1) * (11.81361-(9.18162)));
            yy = -10.37022 + (((tickAnim - 11) / 1) * (63.02792-(-10.37022)));
            zz = 124.52594 + (((tickAnim - 11) / 1) * (66.38439-(124.52594)));
        }
        else if (tickAnim >= 12 && tickAnim < 13) {
            xx = 11.81361 + (((tickAnim - 12) / 1) * (-22.5-(11.81361)));
            yy = 63.02792 + (((tickAnim - 12) / 1) * (0-(63.02792)));
            zz = 66.38439 + (((tickAnim - 12) / 1) * (0-(66.38439)));
        }
        else if (tickAnim >= 13 && tickAnim < 14) {
            xx = -22.5 + (((tickAnim - 13) / 1) * (0.33903-(-22.5)));
            yy = 0 + (((tickAnim - 13) / 1) * (-26.49348-(0)));
            zz = 0 + (((tickAnim - 13) / 1) * (72.46415-(0)));
        }
        else if (tickAnim >= 14 && tickAnim < 14) {
            xx = 0.33903 + (((tickAnim - 14) / 0) * (9.18162-(0.33903)));
            yy = -26.49348 + (((tickAnim - 14) / 0) * (-10.37022-(-26.49348)));
            zz = 72.46415 + (((tickAnim - 14) / 0) * (124.52594-(72.46415)));
        }
        else if (tickAnim >= 14 && tickAnim < 15) {
            xx = 9.18162 + (((tickAnim - 14) / 1) * (11.81361-(9.18162)));
            yy = -10.37022 + (((tickAnim - 14) / 1) * (63.02792-(-10.37022)));
            zz = 124.52594 + (((tickAnim - 14) / 1) * (66.38439-(124.52594)));
        }
        else if (tickAnim >= 15 && tickAnim < 16) {
            xx = 11.81361 + (((tickAnim - 15) / 1) * (-22.5-(11.81361)));
            yy = 63.02792 + (((tickAnim - 15) / 1) * (0-(63.02792)));
            zz = 66.38439 + (((tickAnim - 15) / 1) * (0-(66.38439)));
        }
        else if (tickAnim >= 16 && tickAnim < 17) {
            xx = -22.5 + (((tickAnim - 16) / 1) * (0.33903-(-22.5)));
            yy = 0 + (((tickAnim - 16) / 1) * (-26.49348-(0)));
            zz = 0 + (((tickAnim - 16) / 1) * (72.46415-(0)));
        }
        else if (tickAnim >= 17 && tickAnim < 18) {
            xx = 0.33903 + (((tickAnim - 17) / 1) * (9.18162-(0.33903)));
            yy = -26.49348 + (((tickAnim - 17) / 1) * (-10.37022-(-26.49348)));
            zz = 72.46415 + (((tickAnim - 17) / 1) * (124.52594-(72.46415)));
        }
        else if (tickAnim >= 18 && tickAnim < 18) {
            xx = 9.18162 + (((tickAnim - 18) / 0) * (11.81361-(9.18162)));
            yy = -10.37022 + (((tickAnim - 18) / 0) * (63.02792-(-10.37022)));
            zz = 124.52594 + (((tickAnim - 18) / 0) * (66.38439-(124.52594)));
        }
        else if (tickAnim >= 18 && tickAnim < 19) {
            xx = 11.81361 + (((tickAnim - 18) / 1) * (-22.5-(11.81361)));
            yy = 63.02792 + (((tickAnim - 18) / 1) * (0-(63.02792)));
            zz = 66.38439 + (((tickAnim - 18) / 1) * (0-(66.38439)));
        }
        else if (tickAnim >= 19 && tickAnim < 20) {
            xx = -22.5 + (((tickAnim - 19) / 1) * (0.33903-(-22.5)));
            yy = 0 + (((tickAnim - 19) / 1) * (-26.49348-(0)));
            zz = 0 + (((tickAnim - 19) / 1) * (72.46415-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 21) {
            xx = 0.33903 + (((tickAnim - 20) / 1) * (9.18162-(0.33903)));
            yy = -26.49348 + (((tickAnim - 20) / 1) * (-10.37022-(-26.49348)));
            zz = 72.46415 + (((tickAnim - 20) / 1) * (124.52594-(72.46415)));
        }
        else if (tickAnim >= 21 && tickAnim < 22) {
            xx = 9.18162 + (((tickAnim - 21) / 1) * (11.81361-(9.18162)));
            yy = -10.37022 + (((tickAnim - 21) / 1) * (63.02792-(-10.37022)));
            zz = 124.52594 + (((tickAnim - 21) / 1) * (66.38439-(124.52594)));
        }
        else if (tickAnim >= 22 && tickAnim < 22) {
            xx = 11.81361 + (((tickAnim - 22) / 0) * (-22.5-(11.81361)));
            yy = 63.02792 + (((tickAnim - 22) / 0) * (0-(63.02792)));
            zz = 66.38439 + (((tickAnim - 22) / 0) * (0-(66.38439)));
        }
        else if (tickAnim >= 22 && tickAnim < 23) {
            xx = -22.5 + (((tickAnim - 22) / 1) * (0.33903-(-22.5)));
            yy = 0 + (((tickAnim - 22) / 1) * (-26.49348-(0)));
            zz = 0 + (((tickAnim - 22) / 1) * (72.46415-(0)));
        }
        else if (tickAnim >= 23 && tickAnim < 24) {
            xx = 0.33903 + (((tickAnim - 23) / 1) * (9.18162-(0.33903)));
            yy = -26.49348 + (((tickAnim - 23) / 1) * (-10.37022-(-26.49348)));
            zz = 72.46415 + (((tickAnim - 23) / 1) * (124.52594-(72.46415)));
        }
        else if (tickAnim >= 24 && tickAnim < 25) {
            xx = 9.18162 + (((tickAnim - 24) / 1) * (11.81361-(9.18162)));
            yy = -10.37022 + (((tickAnim - 24) / 1) * (63.02792-(-10.37022)));
            zz = 124.52594 + (((tickAnim - 24) / 1) * (66.38439-(124.52594)));
        }
        else if (tickAnim >= 25 && tickAnim < 26) {
            xx = 11.81361 + (((tickAnim - 25) / 1) * (-22.5-(11.81361)));
            yy = 63.02792 + (((tickAnim - 25) / 1) * (0-(63.02792)));
            zz = 66.38439 + (((tickAnim - 25) / 1) * (0-(66.38439)));
        }
        else if (tickAnim >= 26 && tickAnim < 26) {
            xx = -22.5 + (((tickAnim - 26) / 0) * (0.33903-(-22.5)));
            yy = 0 + (((tickAnim - 26) / 0) * (-26.49348-(0)));
            zz = 0 + (((tickAnim - 26) / 0) * (72.46415-(0)));
        }
        else if (tickAnim >= 26 && tickAnim < 27) {
            xx = 0.33903 + (((tickAnim - 26) / 1) * (9.18162-(0.33903)));
            yy = -26.49348 + (((tickAnim - 26) / 1) * (-10.37022-(-26.49348)));
            zz = 72.46415 + (((tickAnim - 26) / 1) * (124.52594-(72.46415)));
        }
        else if (tickAnim >= 27 && tickAnim < 28) {
            xx = 9.18162 + (((tickAnim - 27) / 1) * (11.81361-(9.18162)));
            yy = -10.37022 + (((tickAnim - 27) / 1) * (63.02792-(-10.37022)));
            zz = 124.52594 + (((tickAnim - 27) / 1) * (66.38439-(124.52594)));
        }
        else if (tickAnim >= 28 && tickAnim < 29) {
            xx = 11.81361 + (((tickAnim - 28) / 1) * (-22.5-(11.81361)));
            yy = 63.02792 + (((tickAnim - 28) / 1) * (0-(63.02792)));
            zz = 66.38439 + (((tickAnim - 28) / 1) * (0-(66.38439)));
        }
        else if (tickAnim >= 29 && tickAnim < 30) {
            xx = -22.5 + (((tickAnim - 29) / 1) * (0.33903-(-22.5)));
            yy = 0 + (((tickAnim - 29) / 1) * (-26.49348-(0)));
            zz = 0 + (((tickAnim - 29) / 1) * (72.46415-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 30) {
            xx = 0.33903 + (((tickAnim - 30) / 0) * (9.18162-(0.33903)));
            yy = -26.49348 + (((tickAnim - 30) / 0) * (-10.37022-(-26.49348)));
            zz = 72.46415 + (((tickAnim - 30) / 0) * (124.52594-(72.46415)));
        }
        else if (tickAnim >= 30 && tickAnim < 31) {
            xx = 9.18162 + (((tickAnim - 30) / 1) * (11.81361-(9.18162)));
            yy = -10.37022 + (((tickAnim - 30) / 1) * (63.02792-(-10.37022)));
            zz = 124.52594 + (((tickAnim - 30) / 1) * (66.38439-(124.52594)));
        }
        else if (tickAnim >= 31 && tickAnim < 32) {
            xx = 11.81361 + (((tickAnim - 31) / 1) * (-22.5-(11.81361)));
            yy = 63.02792 + (((tickAnim - 31) / 1) * (0-(63.02792)));
            zz = 66.38439 + (((tickAnim - 31) / 1) * (0-(66.38439)));
        }
        else if (tickAnim >= 32 && tickAnim < 33) {
            xx = -22.5 + (((tickAnim - 32) / 1) * (0.33903-(-22.5)));
            yy = 0 + (((tickAnim - 32) / 1) * (-26.49348-(0)));
            zz = 0 + (((tickAnim - 32) / 1) * (72.46415-(0)));
        }
        else if (tickAnim >= 33 && tickAnim < 34) {
            xx = 0.33903 + (((tickAnim - 33) / 1) * (9.18162-(0.33903)));
            yy = -26.49348 + (((tickAnim - 33) / 1) * (-10.37022-(-26.49348)));
            zz = 72.46415 + (((tickAnim - 33) / 1) * (124.52594-(72.46415)));
        }
        else if (tickAnim >= 34 && tickAnim < 34) {
            xx = 9.18162 + (((tickAnim - 34) / 0) * (11.81361-(9.18162)));
            yy = -10.37022 + (((tickAnim - 34) / 0) * (63.02792-(-10.37022)));
            zz = 124.52594 + (((tickAnim - 34) / 0) * (66.38439-(124.52594)));
        }
        else if (tickAnim >= 34 && tickAnim < 35) {
            xx = 11.81361 + (((tickAnim - 34) / 1) * (-22.5-(11.81361)));
            yy = 63.02792 + (((tickAnim - 34) / 1) * (0-(63.02792)));
            zz = 66.38439 + (((tickAnim - 34) / 1) * (0-(66.38439)));
        }
        else if (tickAnim >= 35 && tickAnim < 36) {
            xx = -22.5 + (((tickAnim - 35) / 1) * (0.33903-(-22.5)));
            yy = 0 + (((tickAnim - 35) / 1) * (-26.49348-(0)));
            zz = 0 + (((tickAnim - 35) / 1) * (72.46415-(0)));
        }
        else if (tickAnim >= 36 && tickAnim < 37) {
            xx = 0.33903 + (((tickAnim - 36) / 1) * (9.18162-(0.33903)));
            yy = -26.49348 + (((tickAnim - 36) / 1) * (-10.37022-(-26.49348)));
            zz = 72.46415 + (((tickAnim - 36) / 1) * (124.52594-(72.46415)));
        }
        else if (tickAnim >= 37 && tickAnim < 38) {
            xx = 9.18162 + (((tickAnim - 37) / 1) * (11.81361-(9.18162)));
            yy = -10.37022 + (((tickAnim - 37) / 1) * (63.02792-(-10.37022)));
            zz = 124.52594 + (((tickAnim - 37) / 1) * (66.38439-(124.52594)));
        }
        else if (tickAnim >= 38 && tickAnim < 38) {
            xx = 11.81361 + (((tickAnim - 38) / 0) * (-22.5-(11.81361)));
            yy = 63.02792 + (((tickAnim - 38) / 0) * (0-(63.02792)));
            zz = 66.38439 + (((tickAnim - 38) / 0) * (0-(66.38439)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftHindwing, leftHindwing.rotateAngleX + (float) Math.toRadians(xx), leftHindwing.rotateAngleY + (float) Math.toRadians(yy), leftHindwing.rotateAngleZ + (float) Math.toRadians(zz));
        this.setRotateAngle(abdomen3, abdomen3.rotateAngleX + (float) Math.toRadians(-12.5), abdomen3.rotateAngleY + (float) Math.toRadians(0), abdomen3.rotateAngleZ + (float) Math.toRadians(0));
        this.setRotateAngle(rightLeg1, rightLeg1.rotateAngleX + (float) (Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*(562))+220))*10), rightLeg1.rotateAngleY + (float) Math.toRadians(0), rightLeg1.rotateAngleZ + (float) Math.toRadians(0));
        this.setRotateAngle(leftLeg1, leftLeg1.rotateAngleX + (float) (Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*(562))+190))*10), leftLeg1.rotateAngleY + (float) Math.toRadians(0), leftLeg1.rotateAngleZ + (float) Math.toRadians(0));
        this.setRotateAngle(rightLeg2, rightLeg2.rotateAngleX + (float) (Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*(562))+240))*10), rightLeg2.rotateAngleY + (float) Math.toRadians(0), rightLeg2.rotateAngleZ + (float) Math.toRadians(0));
        this.setRotateAngle(leftLeg2, leftLeg2.rotateAngleX + (float) (Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*(562))+200))*10), leftLeg2.rotateAngleY + (float) Math.toRadians(0), leftLeg2.rotateAngleZ + (float) Math.toRadians(0));
        this.setRotateAngle(rightLeg3, rightLeg3.rotateAngleX + (float) (Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*(562))+220))*10), rightLeg3.rotateAngleY + (float) Math.toRadians(0), rightLeg3.rotateAngleZ + (float) Math.toRadians(0));
        this.setRotateAngle(leftLeg3, leftLeg3.rotateAngleX + (float) (Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*(562))+180))*10), leftLeg3.rotateAngleY + (float) Math.toRadians(0), leftLeg3.rotateAngleZ + (float) Math.toRadians(0));
        this.setRotateAngle(abdomen4, abdomen4.rotateAngleX + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*562-60))*1), abdomen4.rotateAngleY + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*562+60))*2), abdomen4.rotateAngleZ + (float) Math.toRadians(0));
        this.setRotateAngle(leftCercus, leftCercus.rotateAngleX + (float) (Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*(562))))*5), leftCercus.rotateAngleY + (float) Math.toRadians(0), leftCercus.rotateAngleZ + (float) Math.toRadians(0));
        this.setRotateAngle(rightCercus, rightCercus.rotateAngleX + (float) (Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*(562))))*5), rightCercus.rotateAngleY + (float) Math.toRadians(0), rightCercus.rotateAngleZ + (float) Math.toRadians(0));
        this.setRotateAngle(caudalFilament, caudalFilament.rotateAngleX + (float) (Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*(562))))*5), caudalFilament.rotateAngleY + (float) Math.toRadians(0), caudalFilament.rotateAngleZ + (float) Math.toRadians(0));
        this.setRotateAngle(abdomen1, abdomen1.rotateAngleX + (float) (Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*(562))+140))*4), abdomen1.rotateAngleY + (float) Math.toRadians(0), abdomen1.rotateAngleZ + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*(562))+130))*5);
        this.setRotateAngle(abdomen2, abdomen2.rotateAngleX + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*562-60))*1), abdomen2.rotateAngleY + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*562+60))*2), abdomen2.rotateAngleZ + (float) Math.toRadians(0));

    }
    public void animIdle(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime) {
        EntityPrehistoricFloraMayfly entity = (EntityPrehistoricFloraMayfly) entitylivingbaseIn;
        int animCycle = 96;
        double tickAnim = (entity.ticksExisted + entity.getTickOffset()) - (int) (Math.floor((double) (entity.ticksExisted + entity.getTickOffset()) / (double) animCycle) * (double) animCycle) + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;
        this.setRotateAngle(rightForwing, rightForwing.rotateAngleX + (float) Math.toRadians(0), rightForwing.rotateAngleY + (float) Math.toRadians(0), rightForwing.rotateAngleZ + (float) Math.toRadians(-5+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*150))));


        this.setRotateAngle(rightHindwing, rightHindwing.rotateAngleX + (float) Math.toRadians(0), rightHindwing.rotateAngleY + (float) Math.toRadians(0), rightHindwing.rotateAngleZ + (float) Math.toRadians(-5+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*150))));


        this.setRotateAngle(leftForewing, leftForewing.rotateAngleX + (float) Math.toRadians(0), leftForewing.rotateAngleY + (float) Math.toRadians(0), leftForewing.rotateAngleZ + (float) Math.toRadians(5-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*150))));


        this.setRotateAngle(leftHindwing, leftHindwing.rotateAngleX + (float) Math.toRadians(0), leftHindwing.rotateAngleY + (float) Math.toRadians(0), leftHindwing.rotateAngleZ + (float) Math.toRadians(5-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*150))));



        if (tickAnim >= 0 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 0) / 13) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 13) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 13) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 24) {
            xx = 0 + (((tickAnim - 13) / 11) * (-15-(0)));
            yy = 0 + (((tickAnim - 13) / 11) * (5-(0)));
            zz = 0 + (((tickAnim - 13) / 11) * (10-(0)));
        }
        else if (tickAnim >= 24 && tickAnim < 29) {
            xx = -15 + (((tickAnim - 24) / 5) * (8.80779-(-15)));
            yy = 5 + (((tickAnim - 24) / 5) * (0.9033-(5)));
            zz = 10 + (((tickAnim - 24) / 5) * (-8.36146-(10)));
        }
        else if (tickAnim >= 29 && tickAnim < 33) {
            xx = 8.80779 + (((tickAnim - 29) / 4) * (0-(8.80779)));
            yy = 0.9033 + (((tickAnim - 29) / 4) * (0-(0.9033)));
            zz = -8.36146 + (((tickAnim - 29) / 4) * (0-(-8.36146)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightLeg1, rightLeg1.rotateAngleX + (float) Math.toRadians(xx), rightLeg1.rotateAngleY + (float) Math.toRadians(yy), rightLeg1.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 17 && tickAnim < 28) {
            xx = 0 + (((tickAnim - 17) / 11) * (-15-(0)));
            yy = 0 + (((tickAnim - 17) / 11) * (-5-(0)));
            zz = 0 + (((tickAnim - 17) / 11) * (-10-(0)));
        }
        else if (tickAnim >= 28 && tickAnim < 33) {
            xx = -15 + (((tickAnim - 28) / 5) * (8.80779-(-15)));
            yy = -5 + (((tickAnim - 28) / 5) * (-0.9033-(-5)));
            zz = -10 + (((tickAnim - 28) / 5) * (8.36146-(-10)));
        }
        else if (tickAnim >= 33 && tickAnim < 37) {
            xx = 8.80779 + (((tickAnim - 33) / 4) * (0-(8.80779)));
            yy = -0.9033 + (((tickAnim - 33) / 4) * (0-(-0.9033)));
            zz = 8.36146 + (((tickAnim - 33) / 4) * (0-(8.36146)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftLeg1, leftLeg1.rotateAngleX + (float) Math.toRadians(xx), leftLeg1.rotateAngleY + (float) Math.toRadians(yy), leftLeg1.rotateAngleZ + (float) Math.toRadians(zz));



        this.setRotateAngle(abdomen2, abdomen2.rotateAngleX + (float) Math.toRadians(-10+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*300))*2), abdomen2.rotateAngleY + (float) Math.toRadians(0), abdomen2.rotateAngleZ + (float) Math.toRadians(0));

    }
    @Override
    public void setRotationAngles(float f, float f1, float f2, float f3, float f4, float f5, Entity e) {
        super.setRotationAngles(f, f1, f2, f3, f4, f5, e);
        EntityPrehistoricFloraMayfly EntityMayfly = (EntityPrehistoricFloraMayfly) e;

        if (EntityMayfly.flyProgress != 0 && EntityMayfly.getAttachmentPos() == null) {//if flying
            this.mayfly.rotateAngleX = (float) Math.toRadians(135+180);
        }



    }
}
