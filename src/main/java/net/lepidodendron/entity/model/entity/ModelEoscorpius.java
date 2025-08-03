package net.lepidodendron.entity.model.entity;

import net.ilexiconn.llibrary.client.model.ModelAnimator;
import net.ilexiconn.llibrary.client.model.tools.AdvancedModelRenderer;
import net.ilexiconn.llibrary.server.animation.IAnimatedEntity;
import net.lepidodendron.entity.base.EntityPrehistoricFloraLandClimbingBase;
import net.lepidodendron.entity.base.EntityPrehistoricFloraScorpion;
import net.lepidodendron.entity.model.ModelBasePalaeopedia;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

public class ModelEoscorpius extends ModelBasePalaeopedia {
    private final AdvancedModelRenderer body;
    private final AdvancedModelRenderer cube_r1;
    private final AdvancedModelRenderer cube_r2;
    private final AdvancedModelRenderer armR;
    private final AdvancedModelRenderer armR2;
    private final AdvancedModelRenderer armR3;
    private final AdvancedModelRenderer cube_r3;
    private final AdvancedModelRenderer clawR;
    private final AdvancedModelRenderer armL;
    private final AdvancedModelRenderer armL2;
    private final AdvancedModelRenderer armL3;
    private final AdvancedModelRenderer cube_r4;
    private final AdvancedModelRenderer clawL;
    private final AdvancedModelRenderer cheliceraR;
    private final AdvancedModelRenderer cheliceraL;
    private final AdvancedModelRenderer legR;
    private final AdvancedModelRenderer legL;
    private final AdvancedModelRenderer legR2;
    private final AdvancedModelRenderer legL2;
    private final AdvancedModelRenderer legR3;
    private final AdvancedModelRenderer legL3;
    private final AdvancedModelRenderer legR4;
    private final AdvancedModelRenderer legL4;
    private final AdvancedModelRenderer abdomen;
    private final AdvancedModelRenderer cube_r5;
    private final AdvancedModelRenderer cube_r6;
    private final AdvancedModelRenderer cube_r7;
    private final AdvancedModelRenderer cube_r8;
    private final AdvancedModelRenderer cube_r9;
    private final AdvancedModelRenderer cube_r10;
    private final AdvancedModelRenderer cube_r11;
    private final AdvancedModelRenderer abdomen2;
    private final AdvancedModelRenderer tail1;
    private final AdvancedModelRenderer tail2;
    private final AdvancedModelRenderer tail3;
    private final AdvancedModelRenderer tail4;
    private final AdvancedModelRenderer tail5;
    private final AdvancedModelRenderer tail6;

    private ModelAnimator animator;

    public ModelEoscorpius() {
        this.textureWidth = 32;
        this.textureHeight = 32;

        this.body = new AdvancedModelRenderer(this);
        this.body.setRotationPoint(0.0F, 23.25F, 0.0F);
        this.body.cubeList.add(new ModelBox(body, 11, 10, -1.0F, -1.0F, -3.75F, 2, 1, 3, 0.01F, false));
        this.body.cubeList.add(new ModelBox(body, 0, 0, -0.5F, -1.013F, -3.725F, 1, 0, 3, 0.0F, false));

        this.cube_r1 = new AdvancedModelRenderer(this);
        this.cube_r1.setRotationPoint(1.25F, 0.0F, -3.75F);
        this.body.addChild(cube_r1);
        this.setRotateAngle(cube_r1, 0.0F, 0.0436F, 0.0F);
        this.cube_r1.cubeList.add(new ModelBox(cube_r1, 0, 16, -1.0F, -1.0F, 0.0F, 1, 1, 3, 0.0F, true));

        this.cube_r2 = new AdvancedModelRenderer(this);
        this.cube_r2.setRotationPoint(-1.25F, 0.0F, -3.75F);
        this.body.addChild(cube_r2);
        this.setRotateAngle(cube_r2, 0.0F, -0.0436F, 0.0F);
        this.cube_r2.cubeList.add(new ModelBox(cube_r2, 0, 16, 0.0F, -1.0F, 0.0F, 1, 1, 3, 0.0F, false));

        this.armR = new AdvancedModelRenderer(this);
        this.armR.setRotationPoint(-0.75F, -0.5F, -3.25F);
        this.body.addChild(armR);
        this.setRotateAngle(armR, 0.0F, -0.48F, 0.0F);
        this.armR.cubeList.add(new ModelBox(armR, 15, 7, -3.1F, 0.0F, -1.0F, 3, 0, 1, 0.0F, false));

        this.armR2 = new AdvancedModelRenderer(this);
        this.armR2.setRotationPoint(-3.0F, 0.0F, -0.5F);
        this.armR.addChild(armR2);
        this.setRotateAngle(armR2, 0.0F, -0.7854F, 0.0F);
        this.armR2.cubeList.add(new ModelBox(armR2, 15, 8, -1.75F, -0.01F, -0.5F, 2, 0, 1, 0.0F, false));

        this.armR3 = new AdvancedModelRenderer(this);
        this.armR3.setRotationPoint(-1.75F, 0.0F, 0.0F);
        this.armR2.addChild(armR3);
        this.setRotateAngle(armR3, 0.0F, -0.6545F, 0.0F);
        this.armR3.cubeList.add(new ModelBox(armR3, 18, 11, -1.75F, -0.51F, -0.5F, 2, 1, 1, 0.0F, false));

        this.cube_r3 = new AdvancedModelRenderer(this);
        this.cube_r3.setRotationPoint(-1.75F, -0.25F, 0.5F);
        this.armR3.addChild(cube_r3);
        this.setRotateAngle(cube_r3, 0.0F, -0.4363F, 0.0F);
        this.cube_r3.cubeList.add(new ModelBox(cube_r3, 11, 14, -3.0F, -0.01F, -1.0F, 3, 0, 1, 0.0F, false));

        this.clawR = new AdvancedModelRenderer(this);
        this.clawR.setRotationPoint(-1.75F, 0.25F, 0.5F);
        this.armR3.addChild(clawR);
        this.setRotateAngle(clawR, 0.0F, -0.6109F, 0.0F);
        this.clawR.cubeList.add(new ModelBox(clawR, 10, 4, -3.0F, -0.01F, -1.0F, 3, 0, 1, 0.0F, false));

        this.armL = new AdvancedModelRenderer(this);
        this.armL.setRotationPoint(0.75F, -0.5F, -3.25F);
        this.body.addChild(armL);
        this.setRotateAngle(armL, 0.0F, 0.48F, 0.0F);
        this.armL.cubeList.add(new ModelBox(armL, 15, 7, 0.1F, 0.0F, -1.0F, 3, 0, 1, 0.0F, true));

        this.armL2 = new AdvancedModelRenderer(this);
        this.armL2.setRotationPoint(3.0F, 0.0F, -0.5F);
        this.armL.addChild(armL2);
        this.setRotateAngle(armL2, 0.0F, 0.7854F, 0.0F);
        this.armL2.cubeList.add(new ModelBox(armL2, 15, 8, -0.25F, -0.01F, -0.5F, 2, 0, 1, 0.0F, true));

        this.armL3 = new AdvancedModelRenderer(this);
        this.armL3.setRotationPoint(1.75F, 0.0F, 0.0F);
        this.armL2.addChild(armL3);
        this.setRotateAngle(armL3, 0.0F, 0.6545F, 0.0F);
        this.armL3.cubeList.add(new ModelBox(armL3, 18, 11, -0.25F, -0.51F, -0.5F, 2, 1, 1, 0.0F, true));

        this.cube_r4 = new AdvancedModelRenderer(this);
        this.cube_r4.setRotationPoint(1.75F, -0.25F, 0.5F);
        this.armL3.addChild(cube_r4);
        this.setRotateAngle(cube_r4, 0.0F, 0.4363F, 0.0F);
        this.cube_r4.cubeList.add(new ModelBox(cube_r4, 11, 14, 0.0F, -0.01F, -1.0F, 3, 0, 1, 0.0F, true));

        this.clawL = new AdvancedModelRenderer(this);
        this.clawL.setRotationPoint(1.75F, 0.25F, 0.5F);
        this.armL3.addChild(clawL);
        this.setRotateAngle(clawL, 0.0F, 0.6109F, 0.0F);
        this.clawL.cubeList.add(new ModelBox(clawL, 10, 4, 0.0F, -0.01F, -1.0F, 3, 0, 1, 0.0F, true));

        this.cheliceraR = new AdvancedModelRenderer(this);
        this.cheliceraR.setRotationPoint(-0.6F, -0.85F, -3.6F);
        this.body.addChild(cheliceraR);
        this.setRotateAngle(cheliceraR, 0.0F, -0.0873F, 0.0F);
        this.cheliceraR.cubeList.add(new ModelBox(cheliceraR, 0, 0, -0.5F, 0.0F, -0.75F, 1, 0, 1, 0.0F, false));

        this.cheliceraL = new AdvancedModelRenderer(this);
        this.cheliceraL.setRotationPoint(0.6F, -0.85F, -3.6F);
        this.body.addChild(cheliceraL);
        this.setRotateAngle(cheliceraL, 0.0F, 0.0873F, 0.0F);
        this.cheliceraL.cubeList.add(new ModelBox(cheliceraL, 0, 0, -0.5F, 0.0F, -0.75F, 1, 0, 1, 0.0F, true));

        this.legR = new AdvancedModelRenderer(this);
        this.legR.setRotationPoint(-1.0F, -0.5F, -3.0F);
        this.body.addChild(legR);
        this.setRotateAngle(legR, -0.5236F, -0.3491F, 0.0F);
        this.legR.cubeList.add(new ModelBox(legR, 0, 13, -5.0F, -1.5F, 0.0F, 5, 3, 0, 0.0F, false));

        this.legL = new AdvancedModelRenderer(this);
        this.legL.setRotationPoint(1.0F, -0.5F, -3.0F);
        this.body.addChild(legL);
        this.setRotateAngle(legL, -0.5236F, 0.3491F, 0.0F);
        this.legL.cubeList.add(new ModelBox(legL, 0, 13, 0.0F, -1.5F, 0.0F, 5, 3, 0, 0.0F, true));

        this.legR2 = new AdvancedModelRenderer(this);
        this.legR2.setRotationPoint(-1.0F, -0.5F, -2.5F);
        this.body.addChild(legR2);
        this.setRotateAngle(legR2, -0.5236F, 0.0F, 0.0F);
        this.legR2.cubeList.add(new ModelBox(legR2, 11, 0, -6.0F, -1.5F, 0.0F, 6, 3, 0, 0.0F, false));

        this.legL2 = new AdvancedModelRenderer(this);
        this.legL2.setRotationPoint(1.0F, -0.5F, -2.5F);
        this.body.addChild(legL2);
        this.setRotateAngle(legL2, -0.5236F, 0.0F, 0.0F);
        this.legL2.cubeList.add(new ModelBox(legL2, 11, 0, 0.0F, -1.5F, 0.0F, 6, 3, 0, 0.0F, true));

        this.legR3 = new AdvancedModelRenderer(this);
        this.legR3.setRotationPoint(-1.0F, -0.5F, -2.0F);
        this.body.addChild(legR3);
        this.setRotateAngle(legR3, -0.5236F, 0.3054F, 0.0F);
        this.legR3.cubeList.add(new ModelBox(legR3, 0, 10, -7.0F, -1.5F, 0.0F, 7, 3, 0, 0.0F, false));

        this.legL3 = new AdvancedModelRenderer(this);
        this.legL3.setRotationPoint(1.0F, -0.5F, -2.0F);
        this.body.addChild(legL3);
        this.setRotateAngle(legL3, -0.5236F, -0.3054F, 0.0F);
        this.legL3.cubeList.add(new ModelBox(legL3, 0, 10, 0.0F, -1.5F, 0.0F, 7, 3, 0, 0.0F, true));

        this.legR4 = new AdvancedModelRenderer(this);
        this.legR4.setRotationPoint(-1.0F, -0.5F, -1.5F);
        this.body.addChild(legR4);
        this.setRotateAngle(legR4, -0.5236F, 0.6545F, 0.0F);
        this.legR4.cubeList.add(new ModelBox(legR4, 0, 6, -8.0F, -2.5F, 0.0F, 8, 4, 0, 0.0F, false));

        this.legL4 = new AdvancedModelRenderer(this);
        this.legL4.setRotationPoint(1.0F, -0.5F, -1.5F);
        this.body.addChild(legL4);
        this.setRotateAngle(legL4, -0.5236F, -0.6545F, 0.0F);
        this.legL4.cubeList.add(new ModelBox(legL4, 0, 6, 0.0F, -2.5F, 0.0F, 8, 4, 0, 0.0F, true));

        this.abdomen = new AdvancedModelRenderer(this);
        this.abdomen.setRotationPoint(0.0F, -0.5F, -1.0F);
        this.body.addChild(abdomen);
        this.abdomen.cubeList.add(new ModelBox(abdomen, 0, 0, -1.5F, -0.52F, 0.0F, 3, 1, 5, 0.0F, false));

        this.cube_r5 = new AdvancedModelRenderer(this);
        this.cube_r5.setRotationPoint(2.0F, 0.525F, 1.0F);
        this.abdomen.addChild(cube_r5);
        this.setRotateAngle(cube_r5, 0.0F, -0.6545F, 0.0F);
        this.cube_r5.cubeList.add(new ModelBox(cube_r5, 10, 3, -3.0F, 0.0F, -0.5F, 4, 0, 1, 0.0F, true));

        this.cube_r6 = new AdvancedModelRenderer(this);
        this.cube_r6.setRotationPoint(-2.0F, 0.525F, 1.0F);
        this.abdomen.addChild(cube_r6);
        this.setRotateAngle(cube_r6, 0.0F, 0.6545F, 0.0F);
        this.cube_r6.cubeList.add(new ModelBox(cube_r6, 10, 3, -1.0F, 0.0F, -0.5F, 4, 0, 1, 0.0F, false));

        this.cube_r7 = new AdvancedModelRenderer(this);
        this.cube_r7.setRotationPoint(-0.75F, 0.0F, 3.5F);
        this.abdomen.addChild(cube_r7);
        this.setRotateAngle(cube_r7, 0.0F, 0.5236F, 0.0F);
        this.cube_r7.cubeList.add(new ModelBox(cube_r7, 0, 22, -0.5F, -1.02F, -0.5F, 1, 1, 1, 0.0F, false));

        this.cube_r8 = new AdvancedModelRenderer(this);
        this.cube_r8.setRotationPoint(0.5F, 0.0F, 2.25F);
        this.abdomen.addChild(cube_r8);
        this.setRotateAngle(cube_r8, 0.0F, 0.1309F, 0.0F);
        this.cube_r8.cubeList.add(new ModelBox(cube_r8, 0, 22, -0.5F, -1.02F, -0.5F, 1, 1, 1, 0.0F, false));

        this.cube_r9 = new AdvancedModelRenderer(this);
        this.cube_r9.setRotationPoint(0.5F, 0.0F, 4.0F);
        this.abdomen.addChild(cube_r9);
        this.setRotateAngle(cube_r9, 0.0F, -0.5236F, 0.0F);
        this.cube_r9.cubeList.add(new ModelBox(cube_r9, 0, 22, -0.5F, -1.02F, -0.5F, 1, 1, 1, 0.0F, false));

        this.cube_r10 = new AdvancedModelRenderer(this);
        this.cube_r10.setRotationPoint(-0.75F, 0.0F, 1.75F);
        this.abdomen.addChild(cube_r10);
        this.setRotateAngle(cube_r10, 0.0F, -0.3491F, 0.0F);
        this.cube_r10.cubeList.add(new ModelBox(cube_r10, 0, 22, -0.5F, -1.02F, -0.5F, 1, 1, 1, 0.0F, false));

        this.cube_r11 = new AdvancedModelRenderer(this);
        this.cube_r11.setRotationPoint(0.5F, 0.0F, 0.75F);
        this.abdomen.addChild(cube_r11);
        this.setRotateAngle(cube_r11, 0.0F, 0.3927F, 0.0F);
        this.cube_r11.cubeList.add(new ModelBox(cube_r11, 0, 22, -0.5F, -1.02F, -0.5F, 1, 1, 1, 0.0F, false));

        this.abdomen2 = new AdvancedModelRenderer(this);
        this.abdomen2.setRotationPoint(0.0F, 0.5F, 5.0F);
        this.abdomen.addChild(abdomen2);
        this.setRotateAngle(abdomen2, 0.3491F, 0.0F, 0.0F);
        this.abdomen2.cubeList.add(new ModelBox(abdomen2, 16, 4, -1.0F, -1.0F, -0.75F, 2, 1, 2, -0.01F, false));

        this.tail1 = new AdvancedModelRenderer(this);
        this.tail1.setRotationPoint(0.0F, -0.45F, 1.25F);
        this.abdomen2.addChild(tail1);
        this.setRotateAngle(tail1, 0.4363F, 0.0F, 0.0F);
        this.tail1.cubeList.add(new ModelBox(tail1, 18, 8, -0.5F, -0.5F, -0.25F, 1, 1, 2, 0.01F, false));

        this.tail2 = new AdvancedModelRenderer(this);
        this.tail2.setRotationPoint(0.0F, 0.0F, 1.75F);
        this.tail1.addChild(tail2);
        this.setRotateAngle(tail2, 0.5672F, 0.0F, 0.0F);
        this.tail2.cubeList.add(new ModelBox(tail2, 6, 18, -0.5F, -0.5F, 0.0F, 1, 1, 2, 0.0F, false));

        this.tail3 = new AdvancedModelRenderer(this);
        this.tail3.setRotationPoint(0.0F, 0.0F, 2.0F);
        this.tail2.addChild(tail3);
        this.setRotateAngle(tail3, 0.5672F, 0.0F, 0.0F);
        this.tail3.cubeList.add(new ModelBox(tail3, 17, 14, -0.5F, -0.5F, 0.0F, 1, 1, 2, 0.01F, false));

        this.tail4 = new AdvancedModelRenderer(this);
        this.tail4.setRotationPoint(0.0F, 0.0F, 2.0F);
        this.tail3.addChild(tail4);
        this.setRotateAngle(tail4, 0.4363F, 0.0F, 0.0F);
        this.tail4.cubeList.add(new ModelBox(tail4, 12, 15, -0.5F, -0.5F, -0.25F, 1, 1, 3, 0.0F, false));

        this.tail5 = new AdvancedModelRenderer(this);
        this.tail5.setRotationPoint(0.0F, 0.0F, 2.5F);
        this.tail4.addChild(tail5);
        this.setRotateAngle(tail5, 0.6545F, 0.0F, 0.0F);
        this.tail5.cubeList.add(new ModelBox(tail5, 7, 14, -0.5F, -0.5F, 0.0F, 1, 1, 3, -0.01F, false));

        this.tail6 = new AdvancedModelRenderer(this);
        this.tail6.setRotationPoint(0.0F, 0.0F, 2.25F);
        this.tail5.addChild(tail6);
        this.setRotateAngle(tail6, 0.3054F, 0.0F, 0.0F);
        this.tail6.cubeList.add(new ModelBox(tail6, 12, 19, -0.5F, -0.5F, 0.0F, 1, 1, 1, 0.0F, false));
        this.tail6.cubeList.add(new ModelBox(tail6, 0, 1, 0.0F, -2.0F, 0.25F, 0, 2, 2, 0.0F, false));

        updateDefaultPose();
        animator = ModelAnimator.create();
    }

    @Override
    public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        animate((IAnimatedEntity) entity, f, f1, f2, f3, f4, f5);
        this.body.render(f5);
    }

    public void renderStaticDisplayCase(float f) {
        this.body.offsetZ = -0.080F;
        this.body.render(0.01f);
        resetToDefaultPose();
    }
    @Override
    public void renderStaticBook(float f) {
        //Rotations, positions and sizing:
        this.body.offsetY = -1.8F;
        this.body.offsetX = -0.2F;
        this.body.offsetZ = 2.0F;
        this.body.rotateAngleY = (float)Math.toRadians(120);
        this.body.rotateAngleX = (float)Math.toRadians(0);
        this.body.rotateAngleZ = (float)Math.toRadians(0);
        this.body.scaleChildren = true;
        float scaler = 4.0F;
        this.body.setScale(scaler, scaler, scaler);
        //Start of pose:
        this.setRotateAngle(body, 0.6F, 3.8F, -0.2F);
        //End of pose, now render the model:
        this.body.render(f);
        //Reset rotations, positions and sizing:
        this.body.setScale(1.0F, 1.0F, 1.0F);
        this.body.scaleChildren = false;
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
        this.resetToDefaultPose();
        //this.body.offsetY = 1F;

//        this.body.rotateAngleY = f3 * 0.017453292F;

        this.cheliceraL.swing(0.85F, (float)Math.toRadians(-25), false, 0, 0F, f2, 1.0F);
        this.cheliceraR.swing(0.85F, (float)Math.toRadians(25), false, 0, 0F, f2, 1.0F);

        //this.body.rotateAngleY = f3 / (180F / (float) Math.PI);
        EntityPrehistoricFloraLandClimbingBase ee = (EntityPrehistoricFloraLandClimbingBase) e;
        if ((f3 == 0.0F || !ee.getIsMoving()) && !ee.getIsClimbing()) {
            return;
        }

        this.legL.flap(0.45F, 0.45F, false, 0F, -0.45F, f2, 1F);
        this.legR.flap(0.45F, 0.45F, true, 3F, -0.45F, f2, 1F);

        this.legL2.flap(0.45F, 0.45F, false, 1F, -0.45F, f2, 1F);
        this.legR2.flap(0.45F, 0.45F, true, 1F, -0.45F, f2, 1F);

        this.legL3.flap(0.45F, 0.45F, false, 2F, -0.45F, f2, 1F);
        this.legR3.flap(0.45F, 0.45F, true, 2F, -0.45F, f2, 1F);

        this.legL4.flap(0.45F, 0.45F, false, 3F, -0.45F, f2, 1F);
        this.legR4.flap(0.45F, 0.45F, true, 0F, -0.45F, f2, 1F);

        this.legL.swing(0.45F, 0.08F, false, 2F, 0F, f2, 0.75F);
        this.legR.swing(0.45F, 0.08F, true, 1F, 0F, f2, 0.75F);

        this.legL2.swing(0.45F, 0.08F, false, 3F, 0F, f2, 0.75F);
        this.legR2.swing(0.45F, 0.08F, true, 3F, 0F, f2, 0.75F);

        this.legL3.swing(0.45F, 0.08F, false, 0, 0F, f2, 0.75F);
        this.legR3.swing(0.45F, 0.08F, true, 0, 0F, f2, 0.75F);

        this.legL4.swing(0.45F, 0.08F, false, 1F, 0F, f2, 0.75F);
        this.legR4.swing(0.45F, 0.08F, true, 2F, 0F, f2, 0.75F);

        //pincers:
        AdvancedModelRenderer[] PincerL = {this.armL, this.armL2, this.armL3};
        AdvancedModelRenderer[] PincerR = {this.armR, this.armR2, this.armR3};
        this.chainSwing(PincerL, 0.2F, 0.1F, 0.1F, f2, 1F);
        this.chainSwing(PincerR, 0.2F, -0.1F, 0.1F, f2, 1F);

        this.armL3.walk(0.1F, -(float)Math.toRadians(7.5), false, 0F, -(float)Math.toRadians(6), f2, 1F);
        this.armR3.walk(0.1F, -(float)Math.toRadians(7.5), false, 0F, -(float)Math.toRadians(6), f2, 1F);

        this.clawL.walk(0.1F, (float)Math.toRadians(12.5), false, 0F, (float)Math.toRadians(8), f2, 1F);
        this.clawR.walk(0.1F, (float)Math.toRadians(12.5), false, 0F, (float)Math.toRadians(8), f2, 1F);

        AdvancedModelRenderer[] Tail = {this.tail1, this.tail2, this.tail3, this.tail4, this.tail5, this.tail6};
        this.chainWave(Tail, 0.6F, 0.05F, 0.3F, f2, 1F);

    }

    public void animate(IAnimatedEntity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        EntityPrehistoricFloraScorpion e = (EntityPrehistoricFloraScorpion) entity;
        animator.update(entity);
        this.resetToDefaultPose();
        setRotationAngles(f, f1, f2, f3, f4, f5, (Entity) entity);
        //length = 20 ticks
        animator.setAnimation(e.ATTACK_ANIMATION);
        animator.startKeyframe(4);
        animator.rotate(this.armL, (float) Math.toRadians(-20), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(this.armR, (float) Math.toRadians(-20), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(this.armL2, (float) Math.toRadians(0), (float) Math.toRadians(-15), (float) Math.toRadians(0));
        animator.rotate(this.armR2, (float) Math.toRadians(0), (float) Math.toRadians(15), (float) Math.toRadians(0));
        animator.rotate(this.armL3, (float) Math.toRadians(-17.5), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(this.armR3, (float) Math.toRadians(-17.5), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(this.clawL, (float) Math.toRadians(40), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(this.clawR, (float) Math.toRadians(40), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.endKeyframe();
        animator.setStaticKeyframe(6);
        animator.startKeyframe(3);
        animator.rotate(this.armL, (float) Math.toRadians(25), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(this.armR, (float) Math.toRadians(-25), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(this.abdomen, (float) Math.toRadians(12.5), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(this.tail1, (float) Math.toRadians(7.5), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(this.tail2, (float) Math.toRadians(7.5), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(this.tail3, (float) Math.toRadians(-5), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(this.tail6, (float) Math.toRadians(-12.5), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.setStaticKeyframe(2);
        animator.endKeyframe();
        animator.setStaticKeyframe(1);
        animator.resetKeyframe(4);

    }
}

