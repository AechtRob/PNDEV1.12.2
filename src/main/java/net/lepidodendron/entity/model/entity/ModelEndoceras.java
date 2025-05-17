package net.lepidodendron.entity.model.entity;

import net.ilexiconn.llibrary.client.model.ModelAnimator;
import net.ilexiconn.llibrary.client.model.tools.AdvancedModelRenderer;
import net.ilexiconn.llibrary.server.animation.IAnimatedEntity;
import net.lepidodendron.entity.EntityPrehistoricFloraEndoceras;
import net.lepidodendron.entity.model.ModelBasePalaeopedia;
import net.minecraft.client.model.ModelBox;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;

public class ModelEndoceras extends ModelBasePalaeopedia {
    private final AdvancedModelRenderer body;
    private final AdvancedModelRenderer cube_r1;
    private final AdvancedModelRenderer cube_r2;
    private final AdvancedModelRenderer arm1;
    private final AdvancedModelRenderer armb1;
    private final AdvancedModelRenderer armc1;
    private final AdvancedModelRenderer arm2;
    private final AdvancedModelRenderer armb2;
    private final AdvancedModelRenderer armc2;
    private final AdvancedModelRenderer arm7;
    private final AdvancedModelRenderer armb7;
    private final AdvancedModelRenderer armc7;
    private final AdvancedModelRenderer arm6;
    private final AdvancedModelRenderer armb6;
    private final AdvancedModelRenderer armc6;
    private final AdvancedModelRenderer arm3;
    private final AdvancedModelRenderer armb3;
    private final AdvancedModelRenderer armc3;
    private final AdvancedModelRenderer arm8;
    private final AdvancedModelRenderer armb8;
    private final AdvancedModelRenderer armc8;
    private final AdvancedModelRenderer arm4;
    private final AdvancedModelRenderer armb4;
    private final AdvancedModelRenderer armc4;
    private final AdvancedModelRenderer arm9;
    private final AdvancedModelRenderer armb9;
    private final AdvancedModelRenderer armc9;
    private final AdvancedModelRenderer arm5;
    private final AdvancedModelRenderer armb5;
    private final AdvancedModelRenderer armc5;
    private final AdvancedModelRenderer arm10;
    private final AdvancedModelRenderer armb10;
    private final AdvancedModelRenderer armc10;
    private final AdvancedModelRenderer siphon;
    private final AdvancedModelRenderer cube_r3;

    private final ModelAnimator animator;

    public ModelEndoceras() {
        this.textureWidth = 128;
        this.textureHeight = 64;

        this.body = new AdvancedModelRenderer(this);
        this.body.setRotationPoint(0.0F, 11.0F, 6.0F);
        this.setRotateAngle(body, 1.5708F, 0.0F, 0.0F);
        this.body.cubeList.add(new ModelBox(body, 30, 52, -3.0F, -8.75F, 0.35F, 6, 6, 5, 0.0F, false));
        this.body.cubeList.add(new ModelBox(body, 0, 24, -3.5F, -9.5F, 5.0F, 7, 7, 17, 0.0F, false));
        this.body.cubeList.add(new ModelBox(body, 0, 0, -3.0F, -9.25F, 22.0F, 6, 6, 18, 0.0F, false));
        this.body.cubeList.add(new ModelBox(body, 32, 8, -2.5F, -9.0F, 40.0F, 5, 5, 16, 0.0F, false));
        this.body.cubeList.add(new ModelBox(body, 32, 32, -2.0F, -8.85F, 56.0F, 4, 4, 16, 0.0F, false));
        this.body.cubeList.add(new ModelBox(body, 0, 48, -1.5F, -8.6F, 72.0F, 3, 3, 12, 0.0F, false));
        this.body.cubeList.add(new ModelBox(body, 47, 0, -0.5F, -9.525F, -0.025F, 1, 1, 4, 0.0F, false));
        this.body.cubeList.add(new ModelBox(body, 30, 0, -3.0F, -9.5F, 0.0F, 6, 1, 5, 0.01F, false));
        this.body.cubeList.add(new ModelBox(body, 0, 0, 2.15F, -8.25F, 2.0F, 1, 2, 2, 0.0F, false));
        this.body.cubeList.add(new ModelBox(body, 0, 7, 2.2F, -7.75F, 2.5F, 1, 1, 1, 0.0F, false));
        this.body.cubeList.add(new ModelBox(body, 0, 4, 2.175F, -7.225F, 2.5F, 1, 1, 1, -0.01F, false));
        this.body.cubeList.add(new ModelBox(body, 0, 0, -3.15F, -8.25F, 2.0F, 1, 2, 2, 0.0F, true));
        this.body.cubeList.add(new ModelBox(body, 0, 7, -3.2F, -7.75F, 2.5F, 1, 1, 1, 0.0F, true));
        this.body.cubeList.add(new ModelBox(body, 0, 4, -3.175F, -7.225F, 2.5F, 1, 1, 1, -0.01F, true));

        this.cube_r1 = new AdvancedModelRenderer(this);
        this.cube_r1.setRotationPoint(0.0F, -9.5F, 88.0F);
        this.body.addChild(cube_r1);
        this.setRotateAngle(cube_r1, -0.1745F, 0.0F, 0.0F);
        this.cube_r1.cubeList.add(new ModelBox(cube_r1, 0, 7, -0.5F, 1.15F, 4.0F, 1, 1, 6, 0.0F, false));

        this.cube_r2 = new AdvancedModelRenderer(this);
        this.cube_r2.setRotationPoint(0.0F, -9.5F, 88.0F);
        this.body.addChild(cube_r2);
        this.setRotateAngle(cube_r2, -0.0436F, 0.0F, 0.0F);
        this.cube_r2.cubeList.add(new ModelBox(cube_r2, 52, 52, -1.0F, 1.35F, -4.0F, 2, 2, 8, 0.0F, false));

        this.arm1 = new AdvancedModelRenderer(this);
        this.arm1.setRotationPoint(0.6F, -7.85F, 0.5F);
        this.body.addChild(arm1);
        this.setRotateAngle(arm1, 0.0F, 0.0F, 0.0873F);
        this.arm1.cubeList.add(new ModelBox(arm1, 2, 26, -0.5F, -0.5F, -4.0F, 1, 1, 4, 0.03F, false));

        this.armb1 = new AdvancedModelRenderer(this);
        this.armb1.setRotationPoint(0.0F, 0.0F, -4.0F);
        this.arm1.addChild(armb1);
        this.armb1.cubeList.add(new ModelBox(armb1, 2, 26, -0.49F, -0.51F, -4.0F, 1, 1, 4, 0.01F, false));

        this.armc1 = new AdvancedModelRenderer(this);
        this.armc1.setRotationPoint(0.0F, 0.0F, -4.0F);
        this.armb1.addChild(armc1);
        this.armc1.cubeList.add(new ModelBox(armc1, 2, 26, -0.49F, -0.51F, -4.0F, 1, 1, 4, 0.0F, false));

        this.arm2 = new AdvancedModelRenderer(this);
        this.arm2.setRotationPoint(1.6F, -7.35F, 0.5F);
        this.body.addChild(arm2);
        this.setRotateAngle(arm2, 0.0F, 0.0F, 0.6545F);
        this.arm2.cubeList.add(new ModelBox(arm2, 2, 26, -0.5F, -0.5F, -4.0F, 1, 1, 4, 0.03F, false));

        this.armb2 = new AdvancedModelRenderer(this);
        this.armb2.setRotationPoint(0.0F, 0.0F, -4.0F);
        this.arm2.addChild(armb2);
        this.armb2.cubeList.add(new ModelBox(armb2, 2, 26, -0.49F, -0.51F, -4.0F, 1, 1, 4, 0.01F, false));

        this.armc2 = new AdvancedModelRenderer(this);
        this.armc2.setRotationPoint(0.0F, 0.0F, -4.0F);
        this.armb2.addChild(armc2);
        this.armc2.cubeList.add(new ModelBox(armc2, 2, 26, -0.49F, -0.51F, -4.0F, 1, 1, 4, 0.0F, false));

        this.arm7 = new AdvancedModelRenderer(this);
        this.arm7.setRotationPoint(-1.6F, -7.35F, 0.5F);
        this.body.addChild(arm7);
        this.setRotateAngle(arm7, 0.0F, 0.0F, -0.6545F);
        this.arm7.cubeList.add(new ModelBox(arm7, 2, 26, -0.5F, -0.5F, -4.0F, 1, 1, 4, 0.03F, true));

        this.armb7 = new AdvancedModelRenderer(this);
        this.armb7.setRotationPoint(0.0F, 0.0F, -4.0F);
        this.arm7.addChild(armb7);
        this.armb7.cubeList.add(new ModelBox(armb7, 2, 26, -0.51F, -0.51F, -4.0F, 1, 1, 4, 0.01F, true));

        this.armc7 = new AdvancedModelRenderer(this);
        this.armc7.setRotationPoint(0.0F, 0.0F, -4.0F);
        this.armb7.addChild(armc7);
        this.armc7.cubeList.add(new ModelBox(armc7, 2, 26, -0.51F, -0.51F, -4.0F, 1, 1, 4, 0.0F, true));

        this.arm6 = new AdvancedModelRenderer(this);
        this.arm6.setRotationPoint(-0.6F, -7.85F, 0.5F);
        this.body.addChild(arm6);
        this.setRotateAngle(arm6, 0.0F, 0.0F, -0.0873F);
        this.arm6.cubeList.add(new ModelBox(arm6, 2, 26, -0.5F, -0.5F, -4.0F, 1, 1, 4, 0.03F, true));

        this.armb6 = new AdvancedModelRenderer(this);
        this.armb6.setRotationPoint(0.0F, 0.0F, -4.0F);
        this.arm6.addChild(armb6);
        this.armb6.cubeList.add(new ModelBox(armb6, 2, 26, -0.51F, -0.51F, -4.0F, 1, 1, 4, 0.01F, true));

        this.armc6 = new AdvancedModelRenderer(this);
        this.armc6.setRotationPoint(0.0F, 0.0F, -4.0F);
        this.armb6.addChild(armc6);
        this.armc6.cubeList.add(new ModelBox(armc6, 2, 26, -0.51F, -0.51F, -4.0F, 1, 1, 4, 0.0F, true));

        this.arm3 = new AdvancedModelRenderer(this);
        this.arm3.setRotationPoint(2.25F, -6.1F, 0.5F);
        this.body.addChild(arm3);
        this.setRotateAngle(arm3, 0.0F, 0.0F, 1.5708F);
        this.arm3.cubeList.add(new ModelBox(arm3, 2, 26, -0.5F, -0.5F, -4.0F, 1, 1, 4, 0.03F, true));

        this.armb3 = new AdvancedModelRenderer(this);
        this.armb3.setRotationPoint(0.0F, 0.0F, -4.0F);
        this.arm3.addChild(armb3);
        this.armb3.cubeList.add(new ModelBox(armb3, 2, 26, -0.51F, -0.51F, -4.0F, 1, 1, 4, 0.01F, true));

        this.armc3 = new AdvancedModelRenderer(this);
        this.armc3.setRotationPoint(0.0F, 0.0F, -4.0F);
        this.armb3.addChild(armc3);
        this.armc3.cubeList.add(new ModelBox(armc3, 2, 26, -0.51F, -0.51F, -4.0F, 1, 1, 4, 0.0F, true));

        this.arm8 = new AdvancedModelRenderer(this);
        this.arm8.setRotationPoint(-2.25F, -6.1F, 0.5F);
        this.body.addChild(arm8);
        this.setRotateAngle(arm8, 0.0F, 0.0F, -1.5708F);
        this.arm8.cubeList.add(new ModelBox(arm8, 2, 26, -0.5F, -0.5F, -4.0F, 1, 1, 4, 0.03F, false));

        this.armb8 = new AdvancedModelRenderer(this);
        this.armb8.setRotationPoint(0.0F, 0.0F, -4.0F);
        this.arm8.addChild(armb8);
        this.armb8.cubeList.add(new ModelBox(armb8, 2, 26, -0.49F, -0.51F, -4.0F, 1, 1, 4, 0.01F, false));

        this.armc8 = new AdvancedModelRenderer(this);
        this.armc8.setRotationPoint(0.0F, 0.0F, -4.0F);
        this.armb8.addChild(armc8);
        this.armc8.cubeList.add(new ModelBox(armc8, 2, 26, -0.49F, -0.51F, -4.0F, 1, 1, 4, 0.0F, false));

        this.arm4 = new AdvancedModelRenderer(this);
        this.arm4.setRotationPoint(2.0F, -4.85F, 0.5F);
        this.body.addChild(arm4);
        this.setRotateAngle(arm4, 0.0F, 0.0F, 1.9635F);
        this.arm4.cubeList.add(new ModelBox(arm4, 2, 26, -0.5F, -0.5F, -4.0F, 1, 1, 4, 0.03F, true));

        this.armb4 = new AdvancedModelRenderer(this);
        this.armb4.setRotationPoint(0.0F, 0.0F, -4.0F);
        this.arm4.addChild(armb4);
        this.armb4.cubeList.add(new ModelBox(armb4, 2, 26, -0.51F, -0.51F, -4.0F, 1, 1, 4, 0.01F, true));

        this.armc4 = new AdvancedModelRenderer(this);
        this.armc4.setRotationPoint(0.0F, 0.0F, -4.0F);
        this.armb4.addChild(armc4);
        this.armc4.cubeList.add(new ModelBox(armc4, 2, 26, -0.51F, -0.51F, -4.0F, 1, 1, 4, 0.0F, true));

        this.arm9 = new AdvancedModelRenderer(this);
        this.arm9.setRotationPoint(-2.0F, -4.85F, 0.5F);
        this.body.addChild(arm9);
        this.setRotateAngle(arm9, 0.0F, 0.0F, -1.9635F);
        this.arm9.cubeList.add(new ModelBox(arm9, 2, 26, -0.5F, -0.5F, -4.0F, 1, 1, 4, 0.03F, false));

        this.armb9 = new AdvancedModelRenderer(this);
        this.armb9.setRotationPoint(0.0F, 0.0F, -4.0F);
        this.arm9.addChild(armb9);
        this.armb9.cubeList.add(new ModelBox(armb9, 2, 26, -0.49F, -0.51F, -4.0F, 1, 1, 4, 0.01F, false));

        this.armc9 = new AdvancedModelRenderer(this);
        this.armc9.setRotationPoint(0.0F, 0.0F, -4.0F);
        this.armb9.addChild(armc9);
        this.armc9.cubeList.add(new ModelBox(armc9, 2, 26, -0.49F, -0.51F, -4.0F, 1, 1, 4, 0.0F, false));

        this.arm5 = new AdvancedModelRenderer(this);
        this.arm5.setRotationPoint(1.25F, -3.85F, 0.5F);
        this.body.addChild(arm5);
        this.setRotateAngle(arm5, 0.0F, 0.0F, 2.7925F);
        this.arm5.cubeList.add(new ModelBox(arm5, 2, 26, -0.5F, -0.5F, -4.0F, 1, 1, 4, 0.03F, true));

        this.armb5 = new AdvancedModelRenderer(this);
        this.armb5.setRotationPoint(0.0F, 0.0F, -4.0F);
        this.arm5.addChild(armb5);
        this.armb5.cubeList.add(new ModelBox(armb5, 2, 26, -0.51F, -0.51F, -4.0F, 1, 1, 4, 0.01F, true));

        this.armc5 = new AdvancedModelRenderer(this);
        this.armc5.setRotationPoint(0.0F, 0.0F, -4.0F);
        this.armb5.addChild(armc5);
        this.armc5.cubeList.add(new ModelBox(armc5, 2, 26, -0.51F, -0.51F, -4.0F, 1, 1, 4, 0.0F, true));

        this.arm10 = new AdvancedModelRenderer(this);
        this.arm10.setRotationPoint(-1.25F, -3.85F, 0.5F);
        this.body.addChild(arm10);
        this.setRotateAngle(arm10, 0.0F, 0.0F, -2.7925F);
        this.arm10.cubeList.add(new ModelBox(arm10, 2, 26, -0.5F, -0.5F, -4.0F, 1, 1, 4, 0.03F, false));

        this.armb10 = new AdvancedModelRenderer(this);
        this.armb10.setRotationPoint(0.0F, 0.0F, -4.0F);
        this.arm10.addChild(armb10);
        this.armb10.cubeList.add(new ModelBox(armb10, 2, 26, -0.49F, -0.51F, -4.0F, 1, 1, 4, 0.01F, false));

        this.armc10 = new AdvancedModelRenderer(this);
        this.armc10.setRotationPoint(0.0F, 0.0F, -4.0F);
        this.armb10.addChild(armc10);
        this.armc10.cubeList.add(new ModelBox(armc10, 2, 26, -0.49F, -0.51F, -4.0F, 1, 1, 4, 0.0F, false));

        this.siphon = new AdvancedModelRenderer(this);
        this.siphon.setRotationPoint(0.0F, -3.469F, 5.3709F);
        this.body.addChild(siphon);


        this.cube_r3 = new AdvancedModelRenderer(this);
        this.cube_r3.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.siphon.addChild(cube_r3);
        this.setRotateAngle(cube_r3, 0.3054F, 0.0F, 0.0F);
        this.cube_r3.cubeList.add(new ModelBox(cube_r3, 52, 0, -1.0F, -1.1309F, -5.9972F, 2, 2, 6, 0.0F, false));
        
        updateDefaultPose();
        animator = ModelAnimator.create();
    }

    @Override
    public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        animate((IAnimatedEntity) entity, f, f1, f2, f3, f4, f5);
        this.body.render(f5);
    }

    public void renderStaticWall(float f) {
        this.body.rotateAngleY = (float) Math.toRadians(90);
        this.body.offsetY = -0.2F;
        this.body.offsetX = -0.15F;
        this.body.offsetZ = -0.4F;
        this.body.render(0.01F);
        resetToDefaultPose();
    }

    public void renderStaticFloor(float f) {
        this.body.offsetZ = -0.1F;
        this.body.offsetY = -0.03F;
        this.body.offsetX = -0.02F;
        this.body.render(0.01F);
        resetToDefaultPose();
    }
    @Override
    public void renderStaticBook(float f) {
        //Rotations, positions and sizing:
        this.body.offsetY = 0.7F;
        this.body.offsetX = -0.0F;
        this.body.offsetZ = 2.0F;
        this.body.rotateAngleY = (float)Math.toRadians(120);
        this.body.rotateAngleX = (float)Math.toRadians(0);
        this.body.rotateAngleZ = (float)Math.toRadians(0);
        this.body.scaleChildren = true;
        float scaler = 0.15F;
        this.body.setScale(scaler, scaler, scaler);
        //Start of pose:
        this.setRotateAngle(body, 1.6F, 3.8F, -0.2F);
        //End of pose, now render the model:
        this.body.render(f);
        //Reset rotations, positions and sizing:
        this.body.setScale(1.0F, 1.0F, 1.0F);
        this.body.scaleChildren = false;
        resetToDefaultPose();

    }

    public void setRotateAngle(AdvancedModelRenderer AdvancedAdvancedModelRenderer, float x, float y, float z) {
        AdvancedAdvancedModelRenderer.rotateAngleX = x;
        AdvancedAdvancedModelRenderer.rotateAngleY = y;
        AdvancedAdvancedModelRenderer.rotateAngleZ = z;
    }


    @Override
    public void setLivingAnimations(EntityLivingBase entitylivingbodyIn, float limbSwing, float limbSwingAmount, float partialTickTime) {
        super.setLivingAnimations(entitylivingbodyIn, limbSwing, limbSwingAmount, partialTickTime);
        this.resetToDefaultPose();
        EntityPrehistoricFloraEndoceras ee = (EntityPrehistoricFloraEndoceras) entitylivingbodyIn;

        if(ee.isReallyInWater()) {
            animWalking(entitylivingbodyIn, limbSwing, limbSwingAmount, partialTickTime);
        }

        if(ee.isAtBottom() && ee.canBeVertical()) {
            animWalkingForage(entitylivingbodyIn, limbSwing, limbSwingAmount, partialTickTime);
        }



    }

    public void animWalking(EntityLivingBase entitylivingbodyIn, float limbSwing, float limbSwingAmount, float partialTickTime) {
        EntityPrehistoricFloraEndoceras entity = (EntityPrehistoricFloraEndoceras) entitylivingbodyIn;
        int animCycle = 50;
        double tickAnim = (entity.ticksExisted + entity.getTickOffset()) - (int) (Math.floor((double) (entity.ticksExisted + entity.getTickOffset()) / (double) animCycle) * (double) animCycle) + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;
        this.setRotateAngle(body, body.rotateAngleX + (float) Math.toRadians(1+Math.sin((Math.PI/180)*(((tickAnim /20D))*145-90))*0.7), body.rotateAngleY + (float) Math.toRadians(0), body.rotateAngleZ + (float) Math.toRadians(0));
        this.body.rotationPointX = this.body.rotationPointX + (float)(0);
        this.body.rotationPointY = this.body.rotationPointY - (float)(0+Math.sin((Math.PI/180)*(((tickAnim /20D))*145-20))*0.8);
        this.body.rotationPointZ = this.body.rotationPointZ + (float)(0+Math.sin((Math.PI/180)*(((tickAnim /20D))*145-50))*-0.4);
        this.setRotateAngle(arm1, arm1.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*(((tickAnim /20D))*145-100))*-2), arm1.rotateAngleY + (float) Math.toRadians(0), arm1.rotateAngleZ + (float) Math.toRadians(0));
        this.setRotateAngle(armb1, armb1.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*(((tickAnim /20D))*145-180))*-2), armb1.rotateAngleY + (float) Math.toRadians(0), armb1.rotateAngleZ + (float) Math.toRadians(0));
        this.setRotateAngle(arm2, arm2.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*(((tickAnim /20D))*145-90))*-2), arm2.rotateAngleY + (float) Math.toRadians(0), arm2.rotateAngleZ + (float) Math.toRadians(0));
        this.setRotateAngle(armb2, armb2.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*(((tickAnim /20D))*145-150))*-2), armb2.rotateAngleY + (float) Math.toRadians(0), armb2.rotateAngleZ + (float) Math.toRadians(0));
        this.setRotateAngle(arm7, arm7.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*(((tickAnim /20D))*145-80))*-2), arm7.rotateAngleY + (float) Math.toRadians(0), arm7.rotateAngleZ + (float) Math.toRadians(0));
        this.setRotateAngle(armb7, armb7.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*(((tickAnim /20D))*145-140))*-2), armb7.rotateAngleY + (float) Math.toRadians(0), armb7.rotateAngleZ + (float) Math.toRadians(0));
        this.setRotateAngle(arm6, arm6.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*(((tickAnim /20D))*145-120))*-2), arm6.rotateAngleY + (float) Math.toRadians(0), arm6.rotateAngleZ + (float) Math.toRadians(0));
        this.setRotateAngle(armb6, armb6.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*(((tickAnim /20D))*145-180))*-2), armb6.rotateAngleY + (float) Math.toRadians(0), armb6.rotateAngleZ + (float) Math.toRadians(0));
        this.setRotateAngle(arm3, arm3.rotateAngleX + (float) Math.toRadians(0), arm3.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*(((tickAnim /20D))*145-90))*2), arm3.rotateAngleZ + (float) Math.toRadians(0));
        this.setRotateAngle(armb3, armb3.rotateAngleX + (float) Math.toRadians(0), armb3.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*(((tickAnim /20D))*145-150))*2), armb3.rotateAngleZ + (float) Math.toRadians(0));
        this.setRotateAngle(arm8, arm8.rotateAngleX + (float) Math.toRadians(0), arm8.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*(((tickAnim /20D))*145-90))*-2), arm8.rotateAngleZ + (float) Math.toRadians(0));
        this.setRotateAngle(armb8, armb8.rotateAngleX + (float) Math.toRadians(0), armb8.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*(((tickAnim /20D))*145-150))*-2), armb8.rotateAngleZ + (float) Math.toRadians(0));
        this.setRotateAngle(arm4, arm4.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*(((tickAnim /20D))*145-90))*3), arm4.rotateAngleY + (float) Math.toRadians(0), arm4.rotateAngleZ + (float) Math.toRadians(0));
        this.setRotateAngle(armb4, armb4.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*(((tickAnim /20D))*145-150))*4), armb4.rotateAngleY + (float) Math.toRadians(0), armb4.rotateAngleZ + (float) Math.toRadians(0));
        this.setRotateAngle(arm9, arm9.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*(((tickAnim /20D))*145-80))*3), arm9.rotateAngleY + (float) Math.toRadians(0), arm9.rotateAngleZ + (float) Math.toRadians(0));
        this.setRotateAngle(armb9, armb9.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*(((tickAnim /20D))*145-140))*5), armb9.rotateAngleY + (float) Math.toRadians(0), armb9.rotateAngleZ + (float) Math.toRadians(0));
        this.setRotateAngle(arm5, arm5.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*(((tickAnim /20D))*145-130))*4), arm5.rotateAngleY + (float) Math.toRadians(0), arm5.rotateAngleZ + (float) Math.toRadians(0));
        this.setRotateAngle(armb5, armb5.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*(((tickAnim /20D))*145-170))*5), armb5.rotateAngleY + (float) Math.toRadians(0), armb5.rotateAngleZ + (float) Math.toRadians(0));
        this.setRotateAngle(arm10, arm10.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*(((tickAnim /20D))*145-120))*4), arm10.rotateAngleY + (float) Math.toRadians(0), arm10.rotateAngleZ + (float) Math.toRadians(0));
        this.setRotateAngle(armb10, armb10.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*(((tickAnim /20D))*145-180))*5), armb10.rotateAngleY + (float) Math.toRadians(0), armb10.rotateAngleZ + (float) Math.toRadians(0));
        this.siphon.setScale((float)1,(float)1,(float)(1+Math.sin((Math.PI/180)*(((tickAnim /20D))*145))*0.1));
        
    }
    public void animWalkingForage(EntityLivingBase entitylivingbodyIn, float limbSwing, float limbSwingAmount, float partialTickTime) {
        EntityPrehistoricFloraEndoceras entity = (EntityPrehistoricFloraEndoceras) entitylivingbodyIn;
        int animCycle = 60;
        double tickAnim = (entity.ticksExisted + entity.getTickOffset()) - (int) (Math.floor((double) (entity.ticksExisted + entity.getTickOffset()) / (double) animCycle) * (double) animCycle) + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;
        this.setRotateAngle(body, body.rotateAngleX + (float) Math.toRadians(-15+Math.sin((Math.PI/180)*(((tickAnim /20D))*120))), body.rotateAngleY + (float) Math.toRadians(0), body.rotateAngleZ + (float) Math.toRadians(0));
        this.body.rotationPointX = this.body.rotationPointX + (float)(0);
        this.body.rotationPointY = this.body.rotationPointY - (float)(-3.75+Math.sin((Math.PI/180)*(((tickAnim /20D))*120/0.5-80))*-0.4);
        this.body.rotationPointZ = this.body.rotationPointZ + (float)(-2.8);
        this.setRotateAngle(arm1, arm1.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*(((tickAnim /20D))*120/0.5-20))*-5), arm1.rotateAngleY + (float) Math.toRadians(0), arm1.rotateAngleZ + (float) Math.toRadians(0));
        this.setRotateAngle(armb1, armb1.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*(((tickAnim /20D))*120/0.5-120))*-8), armb1.rotateAngleY + (float) Math.toRadians(0), armb1.rotateAngleZ + (float) Math.toRadians(0));
        this.setRotateAngle(arm2, arm2.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*(((tickAnim /20D))*120/0.5-20))*-5), arm2.rotateAngleY + (float) Math.toRadians(0), arm2.rotateAngleZ + (float) Math.toRadians(0));
        this.setRotateAngle(armb2, armb2.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*(((tickAnim /20D))*120/0.5-120))*-8), armb2.rotateAngleY + (float) Math.toRadians(0), armb2.rotateAngleZ + (float) Math.toRadians(0));
        this.setRotateAngle(arm7, arm7.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*(((tickAnim /20D))*120/0.5-20))*-5), arm7.rotateAngleY + (float) Math.toRadians(0), arm7.rotateAngleZ + (float) Math.toRadians(0));
        this.setRotateAngle(armb7, armb7.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*(((tickAnim /20D))*120/0.5-120))*-8), armb7.rotateAngleY + (float) Math.toRadians(0), armb7.rotateAngleZ + (float) Math.toRadians(0));
        this.setRotateAngle(arm6, arm6.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*(((tickAnim /20D))*120/0.5-20))*-5), arm6.rotateAngleY + (float) Math.toRadians(0), arm6.rotateAngleZ + (float) Math.toRadians(0));
        this.setRotateAngle(armb6, armb6.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*(((tickAnim /20D))*120/0.5-120))*-8), armb6.rotateAngleY + (float) Math.toRadians(0), armb6.rotateAngleZ + (float) Math.toRadians(0));
        this.setRotateAngle(arm3, arm3.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*(((tickAnim /20D))*120/0.5-20))*-5), arm3.rotateAngleY + (float) Math.toRadians(0), arm3.rotateAngleZ + (float) Math.toRadians(0));
        this.setRotateAngle(armb3, armb3.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*(((tickAnim /20D))*120/0.5-120))*-8), armb3.rotateAngleY + (float) Math.toRadians(0), armb3.rotateAngleZ + (float) Math.toRadians(0));
        this.setRotateAngle(arm8, arm8.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*(((tickAnim /20D))*120/0.5-20))*-5), arm8.rotateAngleY + (float) Math.toRadians(0), arm8.rotateAngleZ + (float) Math.toRadians(0));
        this.setRotateAngle(armb8, armb8.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*(((tickAnim /20D))*120/0.5-120))*-8), armb8.rotateAngleY + (float) Math.toRadians(0), armb8.rotateAngleZ + (float) Math.toRadians(0));
        this.setRotateAngle(arm4, arm4.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*(((tickAnim /20D))*120/0.5-20))*-5), arm4.rotateAngleY + (float) Math.toRadians(0), arm4.rotateAngleZ + (float) Math.toRadians(0));
        this.setRotateAngle(armb4, armb4.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*(((tickAnim /20D))*120/0.5-120))*-8), armb4.rotateAngleY + (float) Math.toRadians(0), armb4.rotateAngleZ + (float) Math.toRadians(0));
        this.setRotateAngle(arm9, arm9.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*(((tickAnim /20D))*120/0.5-20))*-5), arm9.rotateAngleY + (float) Math.toRadians(0), arm9.rotateAngleZ + (float) Math.toRadians(0));
        this.setRotateAngle(armb9, armb9.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*(((tickAnim /20D))*120/0.5-120))*-8), armb9.rotateAngleY + (float) Math.toRadians(0), armb9.rotateAngleZ + (float) Math.toRadians(0));
        this.setRotateAngle(arm5, arm5.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*(((tickAnim /20D))*120/0.5-20))*-5), arm5.rotateAngleY + (float) Math.toRadians(0), arm5.rotateAngleZ + (float) Math.toRadians(0));
        this.setRotateAngle(armb5, armb5.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*(((tickAnim /20D))*120/0.5-120))*-8), armb5.rotateAngleY + (float) Math.toRadians(0), armb5.rotateAngleZ + (float) Math.toRadians(0));
        this.setRotateAngle(arm10, arm10.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*(((tickAnim /20D))*120/0.5-20))*-5), arm10.rotateAngleY + (float) Math.toRadians(0), arm10.rotateAngleZ + (float) Math.toRadians(0));
        this.setRotateAngle(armb10, armb10.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*(((tickAnim /20D))*120/0.5-120))*-8), armb10.rotateAngleY + (float) Math.toRadians(0), armb10.rotateAngleZ + (float) Math.toRadians(0));
        this.siphon.setScale((float)1,(float)1,(float)(1+Math.sin((Math.PI/180)*(((tickAnim /20D))*120/0.5-80))*0.07));

    }

    @Override
    public void setRotationAngles(float f, float f1, float f2, float f3, float f4, float f5, Entity e) {
        super.setRotationAngles(f, f1, f2, f3, f4, f5, e);
        //this.resetToDefaultPose();

        this.body.offsetY = 0.8F;

        EntityPrehistoricFloraEndoceras ee = (EntityPrehistoricFloraEndoceras) e;
        if(e.isInWater() && !((EntityPrehistoricFloraEndoceras) e).canBeVertical()) {
            this.body.rotateAngleX = (float) Math.toRadians(0);
            this.body.rotateAngleY = (float) Math.toRadians(180);
        }


        if (!e.isInWater()) {
            this.body.rotateAngleZ = (float) Math.toRadians(90);
            this.body.offsetX = -1f;
        }

    }

    public void animate(IAnimatedEntity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        animator.update(entity);
    }
}

