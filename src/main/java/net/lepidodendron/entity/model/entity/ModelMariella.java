package net.lepidodendron.entity.model.entity;

import net.ilexiconn.llibrary.client.model.ModelAnimator;
import net.ilexiconn.llibrary.client.model.tools.AdvancedModelRenderer;
import net.ilexiconn.llibrary.server.animation.IAnimatedEntity;
import net.lepidodendron.entity.EntityPrehistoricFloraMariella;
import net.lepidodendron.entity.model.ModelBasePalaeopedia;
import net.minecraft.client.model.ModelBox;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;

public class ModelMariella extends ModelBasePalaeopedia {
    private final AdvancedModelRenderer base;
    private final AdvancedModelRenderer shell;
    private final AdvancedModelRenderer shell4;
    private final AdvancedModelRenderer shell3;
    private final AdvancedModelRenderer aperture;
    private final AdvancedModelRenderer mantle;
    private final AdvancedModelRenderer siphon;
    private final AdvancedModelRenderer cube_r1;
    private final AdvancedModelRenderer leftEye;
    private final AdvancedModelRenderer rightEye;
    private final AdvancedModelRenderer mantle2;
    private final AdvancedModelRenderer tentacle1a;
    private final AdvancedModelRenderer tentacle1b;
    private final AdvancedModelRenderer tentacle2a;
    private final AdvancedModelRenderer tentacle2b;
    private final AdvancedModelRenderer tentacle3a;
    private final AdvancedModelRenderer tentacle3b;
    private final AdvancedModelRenderer tentacle4a;
    private final AdvancedModelRenderer tentacle4b;
    private final AdvancedModelRenderer tentacle5a;
    private final AdvancedModelRenderer tentacle5b;
    private final AdvancedModelRenderer tentacle6a;
    private final AdvancedModelRenderer tentacle6b;
    private final AdvancedModelRenderer tentacle7a;
    private final AdvancedModelRenderer tentacle7b;
    private final AdvancedModelRenderer tentacle8a;
    private final AdvancedModelRenderer tentacle8b;
    private final AdvancedModelRenderer tentacle9a;
    private final AdvancedModelRenderer tentacle9b;
    private final AdvancedModelRenderer tentacle10a;
    private final AdvancedModelRenderer tentacle10b;

    private ModelAnimator animator;

    public ModelMariella() {
        this.textureWidth = 88;
        this.textureHeight = 88;

        this.base = new AdvancedModelRenderer(this);
        this.base.setRotationPoint(0.0F, 24.0F, 0.0F);


        this.shell = new AdvancedModelRenderer(this);
        this.shell.setRotationPoint(-3.0F, 1.75F, -3.75F);
        this.base.addChild(shell);
        this.shell.cubeList.add(new ModelBox(shell, 0, 0, -5.5F, -17.75F, -3.25F, 11, 6, 11, 0.0F, false));
        this.shell.cubeList.add(new ModelBox(shell, 0, 18, -6.0F, -11.9953F, -3.8073F, 12, 6, 6, 0.01F, false));
        this.shell.cubeList.add(new ModelBox(shell, 0, 31, -4.0F, -21.75F, -2.75F, 8, 4, 8, 0.0F, false));
        this.shell.cubeList.add(new ModelBox(shell, 0, 44, -3.5F, -24.75F, -2.25F, 7, 3, 7, 0.0F, false));
        this.shell.cubeList.add(new ModelBox(shell, 0, 55, -2.0F, -27.75F, -1.5F, 4, 3, 4, 0.0F, false));
        this.shell.cubeList.add(new ModelBox(shell, 59, 48, -1.5F, -29.75F, -1.25F, 3, 2, 3, 0.0F, false));
        this.shell.cubeList.add(new ModelBox(shell, 62, 43, -1.0F, -30.25F, -1.0F, 2, 1, 2, 0.0F, false));

        this.shell4 = new AdvancedModelRenderer(this);
        this.shell4.setRotationPoint(4.0F, -5.9953F, 2.1927F);
        this.shell.addChild(shell4);
        this.setRotateAngle(shell4, 0.7941F, 0.0F, 0.0F);
        this.shell4.cubeList.add(new ModelBox(shell4, 0, 74, -9.44F, -4.0798F, -0.0103F, 5, 4, 8, 0.01F, false));

        this.shell3 = new AdvancedModelRenderer(this);
        this.shell3.setRotationPoint(4.0F, -5.9953F, -3.8073F);
        this.shell.addChild(shell3);
        this.setRotateAngle(shell3, 1.0254F, 0.0F, 0.0F);
        this.shell3.cubeList.add(new ModelBox(shell3, 29, 48, -3.0F, 0.0F, 0.0F, 4, 11, 2, 0.0F, false));

        this.aperture = new AdvancedModelRenderer(this);
        this.aperture.setRotationPoint(4.0F, -11.9953F, 2.1927F);
        this.shell.addChild(aperture);
        this.setRotateAngle(aperture, -1.2217F, 0.0F, 0.0F);
        this.aperture.cubeList.add(new ModelBox(aperture, 37, 18, -4.0F, 0.0F, 0.0F, 6, 4, 8, 0.0F, false));
        this.aperture.cubeList.add(new ModelBox(aperture, 42, 57, -4.0F, 0.0F, 8.0F, 6, 2, 2, 0.0F, false));

        this.mantle = new AdvancedModelRenderer(this);
        this.mantle.setRotationPoint(4.5F, -11.75F, 1.75F);
        this.shell.addChild(mantle);
        this.setRotateAngle(mantle, -0.0611F, 0.0F, 0.0F);
        this.mantle.cubeList.add(new ModelBox(mantle, 33, 31, -4.0F, 0.0F, 0.0F, 5, 7, 9, -0.01F, false));

        this.siphon = new AdvancedModelRenderer(this);
        this.siphon.setRotationPoint(-1.5F, 6.5F, 2.0F);
        this.mantle.addChild(siphon);
        this.setRotateAngle(siphon, -0.5236F, 0.0F, 0.0F);


        this.cube_r1 = new AdvancedModelRenderer(this);
        this.cube_r1.setRotationPoint(2.0F, -3.5F, -1.0F);
        this.siphon.addChild(cube_r1);
        this.setRotateAngle(cube_r1, -0.0873F, 0.0F, 0.0F);
        this.cube_r1.cubeList.add(new ModelBox(cube_r1, 42, 48, -3.0F, 2.0F, 2.0F, 2, 2, 6, 0.01F, false));

        this.leftEye = new AdvancedModelRenderer(this);
        this.leftEye.setRotationPoint(0.5F, 0.0F, 7.5F);
        this.mantle.addChild(leftEye);
        this.setRotateAngle(leftEye, 0.0F, 0.0F, 0.096F);
        this.leftEye.cubeList.add(new ModelBox(leftEye, 66, 21, -0.5F, -3.0F, -1.5F, 1, 3, 3, 0.0F, false));

        this.rightEye = new AdvancedModelRenderer(this);
        this.rightEye.setRotationPoint(-3.5F, 0.0F, 7.5F);
        this.mantle.addChild(rightEye);
        this.setRotateAngle(rightEye, 0.0F, 0.0F, -0.096F);
        this.rightEye.cubeList.add(new ModelBox(rightEye, 66, 21, -0.5F, -3.0F, -1.5F, 1, 3, 3, 0.0F, true));

        this.mantle2 = new AdvancedModelRenderer(this);
        this.mantle2.setRotationPoint(0.0F, 0.0F, 9.0F);
        this.mantle.addChild(mantle2);
        this.setRotateAngle(mantle2, -0.9774F, 0.0F, 0.0F);
        this.mantle2.cubeList.add(new ModelBox(mantle2, 45, 0, -4.0F, 0.0F, 0.0F, 5, 7, 7, 0.0F, false));

        this.tentacle1a = new AdvancedModelRenderer(this);
        this.tentacle1a.setRotationPoint(-2.75F, 6.5F, 6.5F);
        this.mantle2.addChild(tentacle1a);
        this.setRotateAngle(tentacle1a, 0.0873F, 0.0F, 0.7854F);
        this.tentacle1a.cubeList.add(new ModelBox(tentacle1a, 17, 55, -0.5F, -0.5F, 0.0F, 1, 1, 4, 0.0F, false));
        this.tentacle1a.cubeList.add(new ModelBox(tentacle1a, 59, 54, -1.0F, -0.25F, 0.0F, 2, 0, 4, 0.0F, false));

        this.tentacle1b = new AdvancedModelRenderer(this);
        this.tentacle1b.setRotationPoint(0.0F, 0.0F, 3.5F);
        this.tentacle1a.addChild(tentacle1b);
        this.setRotateAngle(tentacle1b, -0.2054F, -0.0555F, 0.0116F);
        this.tentacle1b.cubeList.add(new ModelBox(tentacle1b, 17, 61, -0.5F, -0.5F, 0.0F, 1, 1, 4, 0.0F, false));
        this.tentacle1b.cubeList.add(new ModelBox(tentacle1b, 45, 15, -1.0F, -0.25F, 0.0F, 2, 0, 2, 0.0F, false));

        this.tentacle2a = new AdvancedModelRenderer(this);
        this.tentacle2a.setRotationPoint(-3.25F, 4.5F, 6.5F);
        this.mantle2.addChild(tentacle2a);
        this.setRotateAngle(tentacle2a, 0.0F, -0.1309F, 0.0F);
        this.tentacle2a.cubeList.add(new ModelBox(tentacle2a, 28, 62, -0.5F, -0.5F, 0.0F, 1, 1, 4, 0.0F, false));
        this.tentacle2a.cubeList.add(new ModelBox(tentacle2a, 29, 68, 0.25F, -1.0F, 0.0F, 0, 2, 4, 0.0F, false));

        this.tentacle2b = new AdvancedModelRenderer(this);
        this.tentacle2b.setRotationPoint(0.0F, 0.0F, 3.5F);
        this.tentacle2a.addChild(tentacle2b);
        this.setRotateAngle(tentacle2b, -0.088F, 0.1304F, -0.0115F);
        this.tentacle2b.cubeList.add(new ModelBox(tentacle2b, 62, 31, -0.5F, -0.5F, 0.0F, 1, 1, 4, 0.0F, false));
        this.tentacle2b.cubeList.add(new ModelBox(tentacle2b, 0, 69, 0.25F, -1.0F, 0.0F, 0, 2, 2, 0.0F, false));

        this.tentacle3a = new AdvancedModelRenderer(this);
        this.tentacle3a.setRotationPoint(-3.5F, 2.5F, 6.5F);
        this.mantle2.addChild(tentacle3a);
        this.setRotateAngle(tentacle3a, 0.0F, -0.1091F, 0.0F);
        this.tentacle3a.cubeList.add(new ModelBox(tentacle3a, 62, 37, -0.5F, -0.5F, 0.0F, 1, 1, 4, 0.0F, false));
        this.tentacle3a.cubeList.add(new ModelBox(tentacle3a, 20, 68, 0.25F, -1.0F, 0.0F, 0, 2, 4, 0.0F, false));

        this.tentacle3b = new AdvancedModelRenderer(this);
        this.tentacle3b.setRotationPoint(0.0F, 0.0F, 3.5F);
        this.tentacle3a.addChild(tentacle3b);
        this.setRotateAngle(tentacle3b, -0.0829F, 0.1309F, 0.0F);
        this.tentacle3b.cubeList.add(new ModelBox(tentacle3b, 39, 62, -0.5F, -0.5F, 0.0F, 1, 1, 4, 0.0F, false));
        this.tentacle3b.cubeList.add(new ModelBox(tentacle3b, 38, 68, 0.25F, -1.0F, 0.0F, 0, 2, 2, 0.0F, false));

        this.tentacle4a = new AdvancedModelRenderer(this);
        this.tentacle4a.setRotationPoint(-3.25F, 0.75F, 6.5F);
        this.mantle2.addChild(tentacle4a);
        this.setRotateAngle(tentacle4a, 0.0F, 0.0F, 0.6545F);
        this.tentacle4a.cubeList.add(new ModelBox(tentacle4a, 0, 63, -0.5F, -0.5F, 0.0F, 1, 1, 4, 0.0F, false));
        this.tentacle4a.cubeList.add(new ModelBox(tentacle4a, 11, 67, 0.25F, -1.0F, 0.0F, 0, 2, 4, 0.0F, false));

        this.tentacle4b = new AdvancedModelRenderer(this);
        this.tentacle4b.setRotationPoint(0.0F, 0.0F, 3.5F);
        this.tentacle4a.addChild(tentacle4b);
        this.setRotateAngle(tentacle4b, -0.0436F, 0.0044F, 0.0F);
        this.tentacle4b.cubeList.add(new ModelBox(tentacle4b, 50, 64, -0.5F, -0.5F, 0.0F, 1, 1, 4, 0.0F, false));
        this.tentacle4b.cubeList.add(new ModelBox(tentacle4b, 43, 68, 0.25F, -1.0F, 0.0F, 0, 2, 2, 0.0F, false));

        this.tentacle5a = new AdvancedModelRenderer(this);
        this.tentacle5a.setRotationPoint(-2.0F, 0.5F, 6.5F);
        this.mantle2.addChild(tentacle5a);
        this.setRotateAngle(tentacle5a, 0.0873F, -0.013F, -0.0011F);
        this.tentacle5a.cubeList.add(new ModelBox(tentacle5a, 61, 64, -0.5F, -0.5F, 0.0F, 1, 1, 4, 0.0F, false));
        this.tentacle5a.cubeList.add(new ModelBox(tentacle5a, 59, 59, -1.0F, 0.5F, 0.0F, 2, 0, 4, 0.0F, false));

        this.tentacle5b = new AdvancedModelRenderer(this);
        this.tentacle5b.setRotationPoint(0.0F, 0.0F, 3.5F);
        this.tentacle5a.addChild(tentacle5b);
        this.setRotateAngle(tentacle5b, -0.1134F, -0.0742F, 0.0F);
        this.tentacle5b.cubeList.add(new ModelBox(tentacle5b, 66, 15, -0.5F, -0.5F, 0.0F, 1, 1, 4, 0.0F, false));
        this.tentacle5b.cubeList.add(new ModelBox(tentacle5b, 54, 15, -1.0F, 0.5F, 0.0F, 2, 0, 2, 0.0F, false));

        this.tentacle6a = new AdvancedModelRenderer(this);
        this.tentacle6a.setRotationPoint(-0.25F, 6.5F, 6.5F);
        this.mantle2.addChild(tentacle6a);
        this.setRotateAngle(tentacle6a, 0.0873F, 0.0F, -0.7854F);
        this.tentacle6a.cubeList.add(new ModelBox(tentacle6a, 17, 55, -0.5F, -0.5F, 0.0F, 1, 1, 4, 0.0F, true));
        this.tentacle6a.cubeList.add(new ModelBox(tentacle6a, 59, 54, -1.0F, -0.25F, 0.0F, 2, 0, 4, 0.0F, true));

        this.tentacle6b = new AdvancedModelRenderer(this);
        this.tentacle6b.setRotationPoint(0.0F, 0.0F, 3.5F);
        this.tentacle6a.addChild(tentacle6b);
        this.setRotateAngle(tentacle6b, -0.2054F, 0.0555F, -0.0116F);
        this.tentacle6b.cubeList.add(new ModelBox(tentacle6b, 17, 61, -0.5F, -0.5F, 0.0F, 1, 1, 4, 0.0F, true));
        this.tentacle6b.cubeList.add(new ModelBox(tentacle6b, 45, 15, -1.0F, -0.25F, 0.0F, 2, 0, 2, 0.0F, true));

        this.tentacle7a = new AdvancedModelRenderer(this);
        this.tentacle7a.setRotationPoint(0.25F, 4.5F, 6.5F);
        this.mantle2.addChild(tentacle7a);
        this.setRotateAngle(tentacle7a, 0.0F, 0.1309F, 0.0F);
        this.tentacle7a.cubeList.add(new ModelBox(tentacle7a, 28, 62, -0.5F, -0.5F, 0.0F, 1, 1, 4, 0.0F, true));
        this.tentacle7a.cubeList.add(new ModelBox(tentacle7a, 29, 68, -0.25F, -1.0F, 0.0F, 0, 2, 4, 0.0F, true));

        this.tentacle7b = new AdvancedModelRenderer(this);
        this.tentacle7b.setRotationPoint(0.0F, 0.0F, 3.5F);
        this.tentacle7a.addChild(tentacle7b);
        this.setRotateAngle(tentacle7b, -0.088F, -0.1304F, 0.0115F);
        this.tentacle7b.cubeList.add(new ModelBox(tentacle7b, 62, 31, -0.5F, -0.5F, 0.0F, 1, 1, 4, 0.0F, true));
        this.tentacle7b.cubeList.add(new ModelBox(tentacle7b, 0, 69, -0.25F, -1.0F, 0.0F, 0, 2, 2, 0.0F, true));

        this.tentacle8a = new AdvancedModelRenderer(this);
        this.tentacle8a.setRotationPoint(0.5F, 2.5F, 6.5F);
        this.mantle2.addChild(tentacle8a);
        this.setRotateAngle(tentacle8a, 0.0F, 0.1091F, 0.0F);
        this.tentacle8a.cubeList.add(new ModelBox(tentacle8a, 62, 37, -0.5F, -0.5F, 0.0F, 1, 1, 4, 0.0F, true));
        this.tentacle8a.cubeList.add(new ModelBox(tentacle8a, 20, 68, -0.25F, -1.0F, 0.0F, 0, 2, 4, 0.0F, true));

        this.tentacle8b = new AdvancedModelRenderer(this);
        this.tentacle8b.setRotationPoint(0.0F, 0.0F, 3.5F);
        this.tentacle8a.addChild(tentacle8b);
        this.setRotateAngle(tentacle8b, -0.0829F, -0.1309F, 0.0F);
        this.tentacle8b.cubeList.add(new ModelBox(tentacle8b, 39, 62, -0.5F, -0.5F, 0.0F, 1, 1, 4, 0.0F, true));
        this.tentacle8b.cubeList.add(new ModelBox(tentacle8b, 38, 68, -0.25F, -1.0F, 0.0F, 0, 2, 2, 0.0F, true));

        this.tentacle9a = new AdvancedModelRenderer(this);
        this.tentacle9a.setRotationPoint(0.25F, 0.75F, 6.5F);
        this.mantle2.addChild(tentacle9a);
        this.setRotateAngle(tentacle9a, 0.0F, 0.0F, -0.6545F);
        this.tentacle9a.cubeList.add(new ModelBox(tentacle9a, 0, 63, -0.5F, -0.5F, 0.0F, 1, 1, 4, 0.0F, true));
        this.tentacle9a.cubeList.add(new ModelBox(tentacle9a, 11, 67, -0.25F, -1.0F, 0.0F, 0, 2, 4, 0.0F, true));

        this.tentacle9b = new AdvancedModelRenderer(this);
        this.tentacle9b.setRotationPoint(0.0F, 0.0F, 3.5F);
        this.tentacle9a.addChild(tentacle9b);
        this.setRotateAngle(tentacle9b, -0.0436F, -0.0044F, 0.0F);
        this.tentacle9b.cubeList.add(new ModelBox(tentacle9b, 50, 64, -0.5F, -0.5F, 0.0F, 1, 1, 4, 0.0F, true));
        this.tentacle9b.cubeList.add(new ModelBox(tentacle9b, 43, 68, -0.25F, -1.0F, 0.0F, 0, 2, 2, 0.0F, true));

        this.tentacle10a = new AdvancedModelRenderer(this);
        this.tentacle10a.setRotationPoint(-1.0F, 0.5F, 6.5F);
        this.mantle2.addChild(tentacle10a);
        this.setRotateAngle(tentacle10a, 0.0873F, 0.013F, 0.0011F);
        this.tentacle10a.cubeList.add(new ModelBox(tentacle10a, 61, 64, -0.5F, -0.5F, 0.0F, 1, 1, 4, 0.0F, true));
        this.tentacle10a.cubeList.add(new ModelBox(tentacle10a, 59, 59, -1.0F, 0.5F, 0.0F, 2, 0, 4, 0.0F, true));

        this.tentacle10b = new AdvancedModelRenderer(this);
        this.tentacle10b.setRotationPoint(0.0F, 0.0F, 3.5F);
        this.tentacle10a.addChild(tentacle10b);
        this.setRotateAngle(tentacle10b, -0.1134F, 0.0742F, 0.0F);
        this.tentacle10b.cubeList.add(new ModelBox(tentacle10b, 66, 15, -0.5F, -0.5F, 0.0F, 1, 1, 4, 0.0F, true));
        this.tentacle10b.cubeList.add(new ModelBox(tentacle10b, 54, 15, -1.0F, 0.5F, 0.0F, 2, 0, 2, 0.0F, true));
        
        updateDefaultPose();
        animator = ModelAnimator.create();
    }

    @Override
    public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        animate((IAnimatedEntity) entity, f, f1, f2, f3, f4, f5);
        this.base.render(f5);
    }

    public void renderStaticWall(float f) {
        this.base.rotateAngleY = (float) Math.toRadians(90);
        this.base.offsetY = -0.2F;
        this.base.offsetX = -0.15F;
        this.base.offsetZ = -0.4F;
        this.base.render(0.01F);
        resetToDefaultPose();
    }

    public void renderStaticFloor(float f) {
        this.base.offsetZ = -0.1F;
        this.base.offsetY = -0.03F;
        this.base.offsetX = -0.02F;
        this.base.render(0.01F);
        resetToDefaultPose();
    }

    @Override
    public void renderStaticBook(float f) {
        //Rotations, positions and sizing:
        this.base.offsetY = -1.2F;
        this.base.offsetX = 1.2F;
        this.base.rotateAngleY = (float)Math.toRadians(290);
        this.base.rotateAngleX = (float)Math.toRadians(0);
        this.base.rotateAngleZ = (float)Math.toRadians(-8);
        this.base.scaleChildren = true;
        float scaler = 1.23F;
        this.base.setScale(scaler, scaler, scaler);
        //Start of pose:

        //End of pose, now render the model:
        this.base.render(f);
        //Reset rotations, positions and sizing:
        this.base.setScale(1.0F, 1.0F, 1.0F);
        this.base.scaleChildren = false;
        resetToDefaultPose();
    }

    public void setRotateAngle(AdvancedModelRenderer AdvancedAdvancedModelRenderer, float x, float y, float z) {
        AdvancedAdvancedModelRenderer.rotateAngleX = x;
        AdvancedAdvancedModelRenderer.rotateAngleY = y;
        AdvancedAdvancedModelRenderer.rotateAngleZ = z;
    }


    @Override
    public void setLivingAnimations(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime) {
        super.setLivingAnimations(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime);
        this.resetToDefaultPose();
        EntityPrehistoricFloraMariella ee = (EntityPrehistoricFloraMariella) entitylivingbaseIn;

        if(ee.isReallyInWater()) {
            animWalking(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime);
        }


    }

    public void animWalking(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime) {
        EntityPrehistoricFloraMariella entity = (EntityPrehistoricFloraMariella) entitylivingbaseIn;
        int animCycle = 160;
        double tickAnim = (entity.ticksExisted + entity.getTickOffset()) - (int) (Math.floor((double) (entity.ticksExisted + entity.getTickOffset()) / (double) animCycle) * (double) animCycle) + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;

        if (tickAnim >= 0 && tickAnim < 160) {
            xx = Math.sin((Math.PI/180)*(((double)tickAnim/20)*360+120))*2 + (((tickAnim - 0) / 160) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*360+120))*2-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*360+120))*2)));
            yy = 0 + (((tickAnim - 0) / 160) * (360-(0)));
            zz = Math.sin((Math.PI/180)*(((double)tickAnim/20)*360+130-70))*2 + (((tickAnim - 0) / 160) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*360+130-70))*2-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*360+130-70))*2)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(shell, shell.rotateAngleX + (float) Math.toRadians(xx), shell.rotateAngleY + (float) Math.toRadians(yy), shell.rotateAngleZ + (float) Math.toRadians(zz));

        this.shell.rotationPointX = this.shell.rotationPointX + (float)(-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*90+100+30))*0.1);
        this.shell.rotationPointY = this.shell.rotationPointY - (float)(5.4+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*90+150+150))*2);
        this.shell.rotationPointZ = this.shell.rotationPointZ + (float)(-0.7+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*90+100+70))*0.3);


        this.setRotateAngle(mantle2, mantle2.rotateAngleX + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360-60))*-2.5), mantle2.rotateAngleY + (float) Math.toRadians(0), mantle2.rotateAngleZ + (float) Math.toRadians(0));
        this.mantle2.setScale((float)1,(float)(1+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360))*0.01),(float)(1.1+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360))*-0.02));


        this.setRotateAngle(mantle, mantle.rotateAngleX + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360+60))*-2.5), mantle.rotateAngleY + (float) Math.toRadians(0), mantle.rotateAngleZ + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*90))*-2.5));
        this.mantle.setScale((float)(1+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360))*0.05),(float)(1+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360))*0.01),(float)(1.1+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360))*-0.02));


        this.setRotateAngle(siphon, siphon.rotateAngleX + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360+80))*5), siphon.rotateAngleY + (float) Math.toRadians(0), siphon.rotateAngleZ + (float) Math.toRadians(0));
        this.siphon.setScale((float)(1+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360))*0.2),(float)(1+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360-30))*0.2),(float)(1.1+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360-60))*-0.1));


        this.setRotateAngle(tentacle1a, tentacle1a.rotateAngleX + (float) Math.toRadians(-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360))*5), tentacle1a.rotateAngleY + (float) Math.toRadians(0), tentacle1a.rotateAngleZ + (float) Math.toRadians(0));
        this.tentacle1a.setScale((float)1,(float)1,(float)(1+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360-60*2))*0.1));


        this.setRotateAngle(tentacle1b, tentacle1b.rotateAngleX + (float) Math.toRadians(-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360-60))*10), tentacle1b.rotateAngleY + (float) Math.toRadians(0), tentacle1b.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(tentacle2a, tentacle2a.rotateAngleX + (float) Math.toRadians(0), tentacle2a.rotateAngleY + (float) Math.toRadians(-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360))*5), tentacle2a.rotateAngleZ + (float) Math.toRadians(0));
        this.tentacle2a.setScale((float)1,(float)1,(float)(1+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360-60*2))*0.1));


        this.setRotateAngle(tentacle2b, tentacle2b.rotateAngleX + (float) Math.toRadians(0), tentacle2b.rotateAngleY + (float) Math.toRadians(-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360-60))*10), tentacle2b.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(tentacle3a, tentacle3a.rotateAngleX + (float) Math.toRadians(0), tentacle3a.rotateAngleY + (float) Math.toRadians(-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360))*5), tentacle3a.rotateAngleZ + (float) Math.toRadians(0));
        this.tentacle3a.setScale((float)1,(float)1,(float)(1+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360-60*2))*0.1));


        this.setRotateAngle(tentacle3b, tentacle3b.rotateAngleX + (float) Math.toRadians(0), tentacle3b.rotateAngleY + (float) Math.toRadians(-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360-60))*10), tentacle3b.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(tentacle4a, tentacle4a.rotateAngleX + (float) Math.toRadians(0), tentacle4a.rotateAngleY + (float) Math.toRadians(-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360))*5), tentacle4a.rotateAngleZ + (float) Math.toRadians(0));
        this.tentacle4a.setScale((float)1,(float)1,(float)(1+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360-60*2))*0.1));


        this.setRotateAngle(tentacle4b, tentacle4b.rotateAngleX + (float) Math.toRadians(0), tentacle4b.rotateAngleY + (float) Math.toRadians(-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360-60))*10), tentacle4b.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(tentacle5a, tentacle5a.rotateAngleX + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360))*5), tentacle5a.rotateAngleY + (float) Math.toRadians(0), tentacle5a.rotateAngleZ + (float) Math.toRadians(0));
        this.tentacle5a.setScale((float)1,(float)1,(float)(1+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360-60*2))*0.1));


        this.setRotateAngle(tentacle5b, tentacle5b.rotateAngleX + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360-60))*10), tentacle5b.rotateAngleY + (float) Math.toRadians(0), tentacle5b.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(tentacle6a, tentacle6a.rotateAngleX + (float) Math.toRadians(-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360))*5), tentacle6a.rotateAngleY + (float) Math.toRadians(0), tentacle6a.rotateAngleZ + (float) Math.toRadians(0));
        this.tentacle6a.setScale((float)1,(float)1,(float)(1+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360-60*2))*0.1));


        this.setRotateAngle(tentacle6b, tentacle6b.rotateAngleX + (float) Math.toRadians(-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360-60))*10), tentacle6b.rotateAngleY + (float) Math.toRadians(0), tentacle6b.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(tentacle7a, tentacle7a.rotateAngleX + (float) Math.toRadians(0), tentacle7a.rotateAngleY + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360))*5), tentacle7a.rotateAngleZ + (float) Math.toRadians(0));
        this.tentacle7a.setScale((float)1,(float)1,(float)(1+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360-60*2))*0.1));


        this.setRotateAngle(tentacle7b, tentacle7b.rotateAngleX + (float) Math.toRadians(0), tentacle7b.rotateAngleY + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360-60))*10), tentacle7b.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(tentacle8a, tentacle8a.rotateAngleX + (float) Math.toRadians(0), tentacle8a.rotateAngleY + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360))*5), tentacle8a.rotateAngleZ + (float) Math.toRadians(0));
        this.tentacle8a.setScale((float)1,(float)1,(float)(1+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360-60*2))*0.1));


        this.setRotateAngle(tentacle8b, tentacle8b.rotateAngleX + (float) Math.toRadians(0), tentacle8b.rotateAngleY + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360-60))*10), tentacle8b.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(tentacle9a, tentacle9a.rotateAngleX + (float) Math.toRadians(0), tentacle9a.rotateAngleY + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360))*5), tentacle9a.rotateAngleZ + (float) Math.toRadians(0));
        this.tentacle9a.setScale((float)1,(float)1,(float)(1+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360-60*2))*0.1));


        this.setRotateAngle(tentacle9b, tentacle9b.rotateAngleX + (float) Math.toRadians(0), tentacle9b.rotateAngleY + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360-60))*10), tentacle9b.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(tentacle10a, tentacle10a.rotateAngleX + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360))*5), tentacle10a.rotateAngleY + (float) Math.toRadians(0), tentacle10a.rotateAngleZ + (float) Math.toRadians(0));
        this.tentacle10a.setScale((float)1,(float)1,(float)(1+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360-60*2))*0.1));


        this.setRotateAngle(tentacle10b, tentacle10b.rotateAngleX + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360-60))*10), tentacle10b.rotateAngleY + (float) Math.toRadians(0), tentacle10b.rotateAngleZ + (float) Math.toRadians(0));

    }

    @Override
    public void setRotationAngles(float f, float f1, float f2, float f3, float f4, float f5, Entity e) {
        super.setRotationAngles(f, f1, f2, f3, f4, f5, e);
        //this.resetToDefaultPose();

        //this.body.offsetY = 1.50F;

        EntityPrehistoricFloraMariella ee = (EntityPrehistoricFloraMariella) e;

        if (!e.isInWater()) {
            this.base.rotateAngleZ = (float) Math.toRadians(90);
            this.base.offsetX = -0.5f;
        }

    }

    public void animate(IAnimatedEntity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        animator.update(entity);
    }
}

