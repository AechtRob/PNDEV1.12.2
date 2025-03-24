package net.lepidodendron.entity.model.entity;

import net.ilexiconn.llibrary.client.model.ModelAnimator;
import net.ilexiconn.llibrary.client.model.tools.AdvancedModelRenderer;
import net.ilexiconn.llibrary.server.animation.IAnimatedEntity;
import net.lepidodendron.entity.EntityPrehistoricFloraCeltedens;
import net.lepidodendron.entity.model.ModelBasePalaeopedia;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;

public class ModelCeltedens extends ModelBasePalaeopedia {
    private final AdvancedModelRenderer Hips;
    private final AdvancedModelRenderer UpperLegR;
    private final AdvancedModelRenderer LowerLegR;
    private final AdvancedModelRenderer FootR;
    private final AdvancedModelRenderer UpperLegL;
    private final AdvancedModelRenderer LowerLegL;
    private final AdvancedModelRenderer FootL;
    private final AdvancedModelRenderer Tail1;
    private final AdvancedModelRenderer Tail2;
    private final AdvancedModelRenderer Body;
    private final AdvancedModelRenderer Body2;
    private final AdvancedModelRenderer Chest;
    private final AdvancedModelRenderer cube_r1;
    private final AdvancedModelRenderer cube_r2;
    private final AdvancedModelRenderer Neck;
    private final AdvancedModelRenderer Head;
    private final AdvancedModelRenderer UpperJaw;
    private final AdvancedModelRenderer cube_r3;
    private final AdvancedModelRenderer cube_r4;
    private final AdvancedModelRenderer cube_r5;
    private final AdvancedModelRenderer cube_r6;
    private final AdvancedModelRenderer cube_r7;
    private final AdvancedModelRenderer cube_r8;
    private final AdvancedModelRenderer cube_r9;
    private final AdvancedModelRenderer cube_r10;
    private final AdvancedModelRenderer Jaw;
    private final AdvancedModelRenderer cube_r11;
    private final AdvancedModelRenderer cube_r12;
    private final AdvancedModelRenderer tongue;
    private final AdvancedModelRenderer UpperArmR;
    private final AdvancedModelRenderer LowerArmR;
    private final AdvancedModelRenderer HandR;
    private final AdvancedModelRenderer UpperArmL;
    private final AdvancedModelRenderer LowerArmL;
    private final AdvancedModelRenderer HandL;

    private ModelAnimator animator;

    public ModelCeltedens() {
        this.textureWidth = 36;
        this.textureHeight = 36;

        this.Hips = new AdvancedModelRenderer(this);
        this.Hips.setRotationPoint(0.0F, 24.0F, 5.0F);
        this.Hips.cubeList.add(new ModelBox(Hips, 0, 21, -1.0F, -2.25F, 0.0F, 2, 2, 3, 0.0F, false));

        this.UpperLegR = new AdvancedModelRenderer(this);
        this.UpperLegR.setRotationPoint(-0.75F, -1.0F, 0.75F);
        this.Hips.addChild(UpperLegR);
        this.setRotateAngle(UpperLegR, -0.0873F, 0.5672F, -0.1745F);
        this.UpperLegR.cubeList.add(new ModelBox(UpperLegR, 26, 12, -2.0F, -0.5F, -0.5F, 2, 1, 1, 0.0F, false));

        this.LowerLegR = new AdvancedModelRenderer(this);
        this.LowerLegR.setRotationPoint(-2.0F, 0.0F, 0.0F);
        this.UpperLegR.addChild(LowerLegR);
        this.setRotateAngle(LowerLegR, 0.0F, 1.309F, 0.0F);
        this.LowerLegR.cubeList.add(new ModelBox(LowerLegR, 5, 26, -1.8F, -0.5F, -0.5F, 2, 1, 1, -0.01F, false));

        this.FootR = new AdvancedModelRenderer(this);
        this.FootR.setRotationPoint(-1.75F, 0.25F, 0.0F);
        this.LowerLegR.addChild(FootR);
        this.setRotateAngle(FootR, 0.0F, -1.789F, 0.0F);
        this.FootR.cubeList.add(new ModelBox(FootR, 8, 0, -2.8F, 0.0F, -1.5F, 3, 0, 3, 0.0F, false));

        this.UpperLegL = new AdvancedModelRenderer(this);
        this.UpperLegL.setRotationPoint(0.75F, -1.0F, 0.75F);
        this.Hips.addChild(UpperLegL);
        this.setRotateAngle(UpperLegL, -0.0873F, -0.5672F, 0.1745F);
        this.UpperLegL.cubeList.add(new ModelBox(UpperLegL, 26, 12, 0.0F, -0.5F, -0.5F, 2, 1, 1, 0.0F, true));

        this.LowerLegL = new AdvancedModelRenderer(this);
        this.LowerLegL.setRotationPoint(2.0F, 0.0F, 0.0F);
        this.UpperLegL.addChild(LowerLegL);
        this.setRotateAngle(LowerLegL, 0.0F, -1.309F, 0.0F);
        this.LowerLegL.cubeList.add(new ModelBox(LowerLegL, 5, 26, -0.2F, -0.5F, -0.5F, 2, 1, 1, -0.01F, true));

        this.FootL = new AdvancedModelRenderer(this);
        this.FootL.setRotationPoint(1.75F, 0.25F, 0.0F);
        this.LowerLegL.addChild(FootL);
        this.setRotateAngle(FootL, 0.0F, 1.789F, 0.0F);
        this.FootL.cubeList.add(new ModelBox(FootL, 8, 0, -0.2F, 0.0F, -1.5F, 3, 0, 3, 0.0F, true));

        this.Tail1 = new AdvancedModelRenderer(this);
        this.Tail1.setRotationPoint(0.0F, -0.75F, 3.0F);
        this.Hips.addChild(Tail1);
        this.Tail1.cubeList.add(new ModelBox(Tail1, 25, 25, -0.5F, -1.0F, -0.5F, 1, 1, 3, 0.01F, false));

        this.Tail2 = new AdvancedModelRenderer(this);
        this.Tail2.setRotationPoint(0.0F, 0.0F, 2.5F);
        this.Tail1.addChild(Tail2);
        this.Tail2.cubeList.add(new ModelBox(Tail2, 20, 10, -0.5F, -1.0F, -0.25F, 1, 1, 4, 0.0F, false));

        this.Body = new AdvancedModelRenderer(this);
        this.Body.setRotationPoint(0.0F, -1.0F, 0.25F);
        this.Hips.addChild(Body);
        this.Body.cubeList.add(new ModelBox(Body, 0, 15, -1.5F, -1.1F, -4.0F, 3, 2, 4, -0.01F, false));
        this.Body.cubeList.add(new ModelBox(Body, 16, 16, -1.0F, -1.5F, -4.0F, 2, 1, 4, 0.0F, false));

        this.Body2 = new AdvancedModelRenderer(this);
        this.Body2.setRotationPoint(0.0F, -0.5F, -4.0F);
        this.Body.addChild(Body2);
        this.Body2.cubeList.add(new ModelBox(Body2, 11, 3, -1.75F, -0.6F, -4.5F, 2, 2, 5, 0.005F, false));
        this.Body2.cubeList.add(new ModelBox(Body2, 11, 3, -0.25F, -0.6F, -4.5F, 2, 2, 5, 0.0F, true));
        this.Body2.cubeList.add(new ModelBox(Body2, 11, 10, -1.0F, -1.25F, -4.5F, 2, 1, 5, 0.01F, false));

        this.Chest = new AdvancedModelRenderer(this);
        this.Chest.setRotationPoint(0.0F, -0.025F, -4.0F);
        this.Body2.addChild(Chest);
        this.Chest.cubeList.add(new ModelBox(Chest, 0, 0, -1.5F, -1.4F, -4.5F, 3, 3, 5, 0.01F, false));

        this.cube_r1 = new AdvancedModelRenderer(this);
        this.cube_r1.setRotationPoint(1.5F, 1.4F, 0.5F);
        this.Chest.addChild(cube_r1);
        this.setRotateAngle(cube_r1, 0.0F, 0.0436F, 0.0F);
        this.cube_r1.cubeList.add(new ModelBox(cube_r1, 0, 8, -2.5F, -2.0F, -5.0F, 3, 2, 5, 0.01F, true));

        this.cube_r2 = new AdvancedModelRenderer(this);
        this.cube_r2.setRotationPoint(-1.5F, 1.4F, 0.5F);
        this.Chest.addChild(cube_r2);
        this.setRotateAngle(cube_r2, 0.0F, -0.0436F, 0.0F);
        this.cube_r2.cubeList.add(new ModelBox(cube_r2, 0, 8, -0.5F, -2.0F, -5.0F, 3, 2, 5, 0.01F, false));

        this.Neck = new AdvancedModelRenderer(this);
        this.Neck.setRotationPoint(0.0F, -0.25F, -4.25F);
        this.Chest.addChild(Neck);
        this.Neck.cubeList.add(new ModelBox(Neck, 10, 23, -1.5F, -0.5F, -1.75F, 3, 2, 2, 0.0F, false));
        this.Neck.cubeList.add(new ModelBox(Neck, 20, 5, -1.5F, -1.0F, -1.75F, 3, 1, 2, -0.01F, false));

        this.Head = new AdvancedModelRenderer(this);
        this.Head.setRotationPoint(0.0F, 0.85F, -1.1F);
        this.Neck.addChild(Head);


        this.UpperJaw = new AdvancedModelRenderer(this);
        this.UpperJaw.setRotationPoint(0.0F, 0.0F, -0.65F);
        this.Head.addChild(UpperJaw);
        this.UpperJaw.cubeList.add(new ModelBox(UpperJaw, 24, 15, -1.0F, -1.0F, -4.25F, 2, 1, 3, 0.005F, false));
        this.UpperJaw.cubeList.add(new ModelBox(UpperJaw, 25, 21, -1.5F, -1.0F, -1.25F, 3, 1, 2, -0.01F, false));

        this.cube_r3 = new AdvancedModelRenderer(this);
        this.cube_r3.setRotationPoint(0.0F, -1.0F, -4.25F);
        this.UpperJaw.addChild(cube_r3);
        this.setRotateAngle(cube_r3, 0.5672F, 0.0F, 0.0F);
        this.cube_r3.cubeList.add(new ModelBox(cube_r3, 28, 2, -1.0F, 0.0F, 0.0F, 2, 1, 1, -0.01F, false));

        this.cube_r4 = new AdvancedModelRenderer(this);
        this.cube_r4.setRotationPoint(1.6F, 0.0F, -1.35F);
        this.UpperJaw.addChild(cube_r4);
        this.setRotateAngle(cube_r4, 0.0F, -0.1309F, 0.0F);
        this.cube_r4.cubeList.add(new ModelBox(cube_r4, 17, 0, -0.85F, -1.0F, 0.0F, 1, 1, 2, 0.01F, true));

        this.cube_r5 = new AdvancedModelRenderer(this);
        this.cube_r5.setRotationPoint(1.6F, -1.5F, -1.85F);
        this.UpperJaw.addChild(cube_r5);
        this.setRotateAngle(cube_r5, 0.0F, 0.3491F, -0.2182F);
        this.cube_r5.cubeList.add(new ModelBox(cube_r5, 0, 0, -1.0F, -0.45F, -1.0F, 1, 1, 1, 0.0F, true));

        this.cube_r6 = new AdvancedModelRenderer(this);
        this.cube_r6.setRotationPoint(1.0F, 0.0F, -4.25F);
        this.UpperJaw.addChild(cube_r6);
        this.setRotateAngle(cube_r6, 0.0F, 0.2531F, 0.0F);
        this.cube_r6.cubeList.add(new ModelBox(cube_r6, 26, 8, -1.0F, -1.0F, 0.0F, 1, 1, 3, 0.0F, true));

        this.cube_r7 = new AdvancedModelRenderer(this);
        this.cube_r7.setRotationPoint(-1.6F, 0.0F, -1.35F);
        this.UpperJaw.addChild(cube_r7);
        this.setRotateAngle(cube_r7, 0.0F, 0.1309F, 0.0F);
        this.cube_r7.cubeList.add(new ModelBox(cube_r7, 17, 0, -0.15F, -1.0F, 0.0F, 1, 1, 2, 0.01F, false));

        this.cube_r8 = new AdvancedModelRenderer(this);
        this.cube_r8.setRotationPoint(-1.6F, -1.5F, -1.85F);
        this.UpperJaw.addChild(cube_r8);
        this.setRotateAngle(cube_r8, 0.0F, -0.3491F, 0.2182F);
        this.cube_r8.cubeList.add(new ModelBox(cube_r8, 0, 0, 0.0F, -0.45F, -1.0F, 1, 1, 1, 0.0F, false));

        this.cube_r9 = new AdvancedModelRenderer(this);
        this.cube_r9.setRotationPoint(-1.0F, 0.0F, -4.25F);
        this.UpperJaw.addChild(cube_r9);
        this.setRotateAngle(cube_r9, 0.0F, -0.2531F, 0.0F);
        this.cube_r9.cubeList.add(new ModelBox(cube_r9, 26, 8, 0.0F, -1.0F, 0.0F, 1, 1, 3, 0.0F, false));

        this.cube_r10 = new AdvancedModelRenderer(this);
        this.cube_r10.setRotationPoint(0.0F, -2.0F, -1.25F);
        this.UpperJaw.addChild(cube_r10);
        this.setRotateAngle(cube_r10, 0.1047F, 0.0F, 0.0F);
        this.cube_r10.cubeList.add(new ModelBox(cube_r10, 20, 0, -1.0F, 0.225F, -2.175F, 2, 1, 4, 0.0F, false));

        this.Jaw = new AdvancedModelRenderer(this);
        this.Jaw.setRotationPoint(0.0F, 0.75F, -0.65F);
        this.Head.addChild(Jaw);
        this.Jaw.cubeList.add(new ModelBox(Jaw, 18, 25, -1.5F, -1.0F, -1.25F, 3, 1, 2, -0.02F, false));
        this.Jaw.cubeList.add(new ModelBox(Jaw, 18, 21, -1.0F, -1.0F, -4.15F, 2, 1, 3, -0.01F, false));

        this.cube_r11 = new AdvancedModelRenderer(this);
        this.cube_r11.setRotationPoint(1.0F, 0.0F, -4.15F);
        this.Jaw.addChild(cube_r11);
        this.setRotateAngle(cube_r11, 0.0F, 0.1396F, 0.0F);
        this.cube_r11.cubeList.add(new ModelBox(cube_r11, 0, 26, -1.0F, -1.0F, 0.0F, 1, 1, 3, -0.015F, true));

        this.cube_r12 = new AdvancedModelRenderer(this);
        this.cube_r12.setRotationPoint(-1.0F, 0.0F, -4.15F);
        this.Jaw.addChild(cube_r12);
        this.setRotateAngle(cube_r12, 0.0F, -0.1396F, 0.0F);
        this.cube_r12.cubeList.add(new ModelBox(cube_r12, 0, 26, 0.0F, -1.0F, 0.0F, 1, 1, 3, -0.015F, false));

        this.tongue = new AdvancedModelRenderer(this);
        this.tongue.setRotationPoint(0.0F, -0.5F, -1.25F);
        this.Jaw.addChild(tongue);
        this.tongue.cubeList.add(new ModelBox(tongue, 9, 16, -0.5F, -0.75F, -2.25F, 1, 1, 5, 0.0F, false));

        this.UpperArmR = new AdvancedModelRenderer(this);
        this.UpperArmR.setRotationPoint(-1.5F, 0.5F, -2.25F);
        this.Chest.addChild(UpperArmR);
        this.setRotateAngle(UpperArmR, 0.0873F, 0.7854F, -0.1309F);
        this.UpperArmR.cubeList.add(new ModelBox(UpperArmR, 28, 0, -2.0F, -0.5F, -0.5F, 2, 1, 1, 0.0F, false));

        this.LowerArmR = new AdvancedModelRenderer(this);
        this.LowerArmR.setRotationPoint(-2.0F, 0.0F, 0.0F);
        this.UpperArmR.addChild(LowerArmR);
        this.setRotateAngle(LowerArmR, 0.0F, -1.789F, 0.0F);
        this.LowerArmR.cubeList.add(new ModelBox(LowerArmR, 10, 27, -1.8F, -0.5F, -0.5F, 2, 1, 1, -0.01F, false));

        this.HandR = new AdvancedModelRenderer(this);
        this.HandR.setRotationPoint(-1.75F, 0.25F, 0.0F);
        this.LowerArmR.addChild(HandR);
        this.HandR.cubeList.add(new ModelBox(HandR, 8, 10, -1.8F, 0.0F, -1.5F, 2, 0, 3, 0.0F, false));

        this.UpperArmL = new AdvancedModelRenderer(this);
        this.UpperArmL.setRotationPoint(1.5F, 0.5F, -2.25F);
        this.Chest.addChild(UpperArmL);
        this.setRotateAngle(UpperArmL, 0.0873F, -0.7854F, 0.1309F);
        this.UpperArmL.cubeList.add(new ModelBox(UpperArmL, 28, 0, 0.0F, -0.5F, -0.5F, 2, 1, 1, 0.0F, true));

        this.LowerArmL = new AdvancedModelRenderer(this);
        this.LowerArmL.setRotationPoint(2.0F, 0.0F, 0.0F);
        this.UpperArmL.addChild(LowerArmL);
        this.setRotateAngle(LowerArmL, 0.0F, 1.789F, 0.0F);
        this.LowerArmL.cubeList.add(new ModelBox(LowerArmL, 10, 27, -0.2F, -0.5F, -0.5F, 2, 1, 1, -0.01F, true));

        this.HandL = new AdvancedModelRenderer(this);
        this.HandL.setRotationPoint(1.75F, 0.25F, 0.0F);
        this.LowerArmL.addChild(HandL);
        this.HandL.cubeList.add(new ModelBox(HandL, 8, 10, -0.2F, 0.0F, -1.5F, 2, 0, 3, 0.0F, true));

        updateDefaultPose();
        animator = ModelAnimator.create();
    }

    @Override
    public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        animate((IAnimatedEntity) entity, f, f1, f2, f3, f4, f5);
        this.Hips.render(f5);
    }
    public void renderStaticFloor(float f) {
        this.setRotateAngle(Hips, 0.0F, 0.0F, 0.0F);
        this.setRotateAngle(Body, 0.0F, 0.2F, 0.0F);
        this.setRotateAngle(Body2, 0.0F, -0.0F, 0.0F);
        this.setRotateAngle(Chest, 0.0F, 0.2F, 0.0F);
        this.setRotateAngle(Tail1, 0.0F, -0.2F, 0.0F);
        this.setRotateAngle(Tail2, 0.0F, -0.2F, 0.0F);
        this.setRotateAngle(Neck, 0.0F, -0.2F, 0.0F);
        this.setRotateAngle(Head, -0.2F, -0.2F, 0.0F);
        this.setRotateAngle(Jaw, 0.2F, 0.0F, 0.0F);
        this.Hips.offsetZ = 0.0F;
        this.Hips.offsetY = 0.235F;
        this.Hips.offsetX = 0.0F;
        this.Hips.render(0.01F);
        this.resetToDefaultPose();
    }
    @Override
    public void renderStaticBook(float f) {
        //Rotations, positions and sizing:
        this.Hips.offsetY = -2.8F;
        this.Hips.offsetX = -1.1F;
        this.Hips.offsetZ = 2.0F;
        this.Hips.rotateAngleY = (float)Math.toRadians(120);
        this.Hips.rotateAngleX = (float)Math.toRadians(1);
        this.Hips.rotateAngleZ = (float)Math.toRadians(0);
        this.Hips.scaleChildren = true;
        float scaler = 4.0F;
        this.Hips.setScale(scaler, scaler, scaler);
        //Start of pose:
        this.setRotateAngle(Hips, 0.6F, 3.8F, -0.2F);
        this.setRotateAngle(Body, 0.0F, 0.2F, 0.0F);
        this.setRotateAngle(Body2, 0.0F, -0.0F, 0.0F);
        this.setRotateAngle(Chest, 0.0F, 0.2F, 0.0F);
        this.setRotateAngle(Tail1, 0.0F, -0.2F, 0.0F);
        this.setRotateAngle(Tail2, 0.0F, -0.2F, 0.0F);
        this.setRotateAngle(Neck, 0.0F, -0.2F, 0.0F);
        this.setRotateAngle(Head, -0.2F, -0.2F, 0.0F);
        this.setRotateAngle(Jaw, 0.2F, 0.0F, 0.0F);
        //End of pose, now render the model:
        this.Hips.render(f);
        //Reset rotations, positions and sizing:
        this.Hips.setScale(1.0F, 1.0F, 1.0F);
        this.Hips.scaleChildren = false;
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
        EntityPrehistoricFloraCeltedens ee = (EntityPrehistoricFloraCeltedens) entitylivingbaseIn;

        if (ee.getIsFast()) {
            animRun(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime);
        }
        else {
            animWalk(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime);
        }

    }

    public void animWalk(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime) {
        EntityPrehistoricFloraCeltedens entity = (EntityPrehistoricFloraCeltedens) entitylivingbaseIn;
        int animCycle = 20;
        if (entity.animSpeedAdder() <= 0) {
            partialTickTime = 0; //If it's static don't increment partial ticks either
        }
        double tickAnim = (entity.ticksExistedAnimated + entity.getTickOffset()) - (int) (Math.floor((double) (entity.ticksExistedAnimated + entity.getTickOffset()) / (double) animCycle) * (double) animCycle) + partialTickTime;

        double xx = 0;
        double yy = 0;
        double zz = 0;
        this.setRotateAngle(Hips, Hips.rotateAngleX + (float) Math.toRadians(0), Hips.rotateAngleY + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*90/0.25-600))*18), Hips.rotateAngleZ + (float) Math.toRadians(0));
        this.Hips.rotationPointX = this.Hips.rotationPointX + (float)(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*90/0.25+610))*2);
        this.Hips.rotationPointY = this.Hips.rotationPointY - (float)(0.5);
        this.Hips.rotationPointZ = this.Hips.rotationPointZ + (float)(0);


        this.setRotateAngle(Tail1, Tail1.rotateAngleX + (float) Math.toRadians(-15), Tail1.rotateAngleY + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*90/0.25-700))*19), Tail1.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(Tail2, Tail2.rotateAngleX + (float) Math.toRadians(15), Tail2.rotateAngleY + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*90/0.25-800))*20), Tail2.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(Body, Body.rotateAngleX + (float) Math.toRadians(0), Body.rotateAngleY + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*90/0.25-500))*17), Body.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(Body2, Body2.rotateAngleX + (float) Math.toRadians(0), Body2.rotateAngleY + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*90/0.25-400))*16), Body2.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(Chest, Chest.rotateAngleX + (float) Math.toRadians(0), Chest.rotateAngleY + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*90/0.25-400))*15), Chest.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(Neck, Neck.rotateAngleX + (float) Math.toRadians(0), Neck.rotateAngleY + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*90/0.25-400))*7), Neck.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(Head, Head.rotateAngleX + (float) Math.toRadians(0), Head.rotateAngleY + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*90/0.25+470))*15), Head.rotateAngleZ + (float) Math.toRadians(0));



        if (tickAnim >= 0 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 0) / 5) * (-17.22388-(0)));
            yy = 0 + (((tickAnim - 0) / 5) * (-30.65704-(0)));
            zz = 0 + (((tickAnim - 0) / 5) * (29.34526-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 10) {
            xx = -17.22388 + (((tickAnim - 5) / 5) * (11.1814-(-17.22388)));
            yy = -30.65704 + (((tickAnim - 5) / 5) * (-66.67614-(-30.65704)));
            zz = 29.34526 + (((tickAnim - 5) / 5) * (-0.19631-(29.34526)));
        }
        else if (tickAnim >= 10 && tickAnim < 15) {
            xx = 11.1814 + (((tickAnim - 10) / 5) * (9.76986-(11.1814)));
            yy = -66.67614 + (((tickAnim - 10) / 5) * (-55.46869-(-66.67614)));
            zz = -0.19631 + (((tickAnim - 10) / 5) * (-0.97683-(-0.19631)));
        }
        else if (tickAnim >= 15 && tickAnim < 20) {
            xx = 9.76986 + (((tickAnim - 15) / 5) * (0-(9.76986)));
            yy = -55.46869 + (((tickAnim - 15) / 5) * (0-(-55.46869)));
            zz = -0.97683 + (((tickAnim - 15) / 5) * (0-(-0.97683)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(UpperLegR, UpperLegR.rotateAngleX + (float) Math.toRadians(xx), UpperLegR.rotateAngleY + (float) Math.toRadians(yy), UpperLegR.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 5.24361 + (((tickAnim - 0) / 10) * (6.73907-(5.24361)));
            yy = -22.40072 + (((tickAnim - 0) / 10) * (-44.87333-(-22.40072)));
            zz = 4.95893 + (((tickAnim - 0) / 10) * (6.1287-(4.95893)));
        }
        else if (tickAnim >= 10 && tickAnim < 15) {
            xx = 6.73907 + (((tickAnim - 10) / 5) * (7.92135-(6.73907)));
            yy = -44.87333 + (((tickAnim - 10) / 5) * (-0.0258-(-44.87333)));
            zz = 6.1287 + (((tickAnim - 10) / 5) * (8.04149-(6.1287)));
        }
        else if (tickAnim >= 15 && tickAnim < 20) {
            xx = 7.92135 + (((tickAnim - 15) / 5) * (5.24361-(7.92135)));
            yy = -0.0258 + (((tickAnim - 15) / 5) * (-22.40072-(-0.0258)));
            zz = 8.04149 + (((tickAnim - 15) / 5) * (4.95893-(8.04149)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(LowerLegR, LowerLegR.rotateAngleX + (float) Math.toRadians(xx), LowerLegR.rotateAngleY + (float) Math.toRadians(yy), LowerLegR.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 0) / 5) * (74.30425-(0)));
            yy = -52.5 + (((tickAnim - 0) / 5) * (51.65613-(-52.5)));
            zz = 0 + (((tickAnim - 0) / 5) * (-34.05025-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 10) {
            xx = 74.30425 + (((tickAnim - 5) / 5) * (0-(74.30425)));
            yy = 51.65613 + (((tickAnim - 5) / 5) * (37.5-(51.65613)));
            zz = -34.05025 + (((tickAnim - 5) / 5) * (0-(-34.05025)));
        }
        else if (tickAnim >= 10 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 10) / 10) * (0-(0)));
            yy = 37.5 + (((tickAnim - 10) / 10) * (-52.5-(37.5)));
            zz = 0 + (((tickAnim - 10) / 10) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(FootR, FootR.rotateAngleX + (float) Math.toRadians(xx), FootR.rotateAngleY + (float) Math.toRadians(yy), FootR.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 5) {
            xx = 11.1814 + (((tickAnim - 0) / 5) * (9.76986-(11.1814)));
            yy = 66.67614 + (((tickAnim - 0) / 5) * (55.46869-(66.67614)));
            zz = 0.19631 + (((tickAnim - 0) / 5) * (0.97683-(0.19631)));
        }
        else if (tickAnim >= 5 && tickAnim < 10) {
            xx = 9.76986 + (((tickAnim - 5) / 5) * (0-(9.76986)));
            yy = 55.46869 + (((tickAnim - 5) / 5) * (0-(55.46869)));
            zz = 0.97683 + (((tickAnim - 5) / 5) * (0-(0.97683)));
        }
        else if (tickAnim >= 10 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 10) / 5) * (-17.22388-(0)));
            yy = 0 + (((tickAnim - 10) / 5) * (30.65704-(0)));
            zz = 0 + (((tickAnim - 10) / 5) * (-29.34526-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 20) {
            xx = -17.22388 + (((tickAnim - 15) / 5) * (11.1814-(-17.22388)));
            yy = 30.65704 + (((tickAnim - 15) / 5) * (66.67614-(30.65704)));
            zz = -29.34526 + (((tickAnim - 15) / 5) * (0.19631-(-29.34526)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(UpperLegL, UpperLegL.rotateAngleX + (float) Math.toRadians(xx), UpperLegL.rotateAngleY + (float) Math.toRadians(yy), UpperLegL.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 5) {
            xx = 6.73907 + (((tickAnim - 0) / 5) * (7.92135-(6.73907)));
            yy = 44.87333 + (((tickAnim - 0) / 5) * (0.0258-(44.87333)));
            zz = -6.1287 + (((tickAnim - 0) / 5) * (-8.04149-(-6.1287)));
        }
        else if (tickAnim >= 5 && tickAnim < 10) {
            xx = 7.92135 + (((tickAnim - 5) / 5) * (5.24361-(7.92135)));
            yy = 0.0258 + (((tickAnim - 5) / 5) * (22.40072-(0.0258)));
            zz = -8.04149 + (((tickAnim - 5) / 5) * (-4.95893-(-8.04149)));
        }
        else if (tickAnim >= 10 && tickAnim < 20) {
            xx = 5.24361 + (((tickAnim - 10) / 10) * (6.73907-(5.24361)));
            yy = 22.40072 + (((tickAnim - 10) / 10) * (44.87333-(22.40072)));
            zz = -4.95893 + (((tickAnim - 10) / 10) * (-6.1287-(-4.95893)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(LowerLegL, LowerLegL.rotateAngleX + (float) Math.toRadians(xx), LowerLegL.rotateAngleY + (float) Math.toRadians(yy), LowerLegL.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            yy = -37.5 + (((tickAnim - 0) / 10) * (52.5-(-37.5)));
            zz = 0 + (((tickAnim - 0) / 10) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 10) / 5) * (74.30425-(0)));
            yy = 52.5 + (((tickAnim - 10) / 5) * (-51.65613-(52.5)));
            zz = 0 + (((tickAnim - 10) / 5) * (34.05025-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 20) {
            xx = 74.30425 + (((tickAnim - 15) / 5) * (0-(74.30425)));
            yy = -51.65613 + (((tickAnim - 15) / 5) * (-37.5-(-51.65613)));
            zz = 34.05025 + (((tickAnim - 15) / 5) * (0-(34.05025)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(FootL, FootL.rotateAngleX + (float) Math.toRadians(xx), FootL.rotateAngleY + (float) Math.toRadians(yy), FootL.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 5) {
            xx = 10.54677 + (((tickAnim - 0) / 5) * (-1.54484-(10.54677)));
            yy = -89.51191 + (((tickAnim - 0) / 5) * (-2.70147-(-89.51191)));
            zz = 0.06355 + (((tickAnim - 0) / 5) * (-2.62094-(0.06355)));
        }
        else if (tickAnim >= 5 && tickAnim < 10) {
            xx = -1.54484 + (((tickAnim - 5) / 5) * (0-(-1.54484)));
            yy = -2.70147 + (((tickAnim - 5) / 5) * (0-(-2.70147)));
            zz = -2.62094 + (((tickAnim - 5) / 5) * (0-(-2.62094)));
        }
        else if (tickAnim >= 10 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 10) / 5) * (46.50461-(0)));
            yy = 0 + (((tickAnim - 10) / 5) * (-66.75896-(0)));
            zz = 0 + (((tickAnim - 10) / 5) * (36.00973-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 20) {
            xx = 46.50461 + (((tickAnim - 15) / 5) * (10.54677-(46.50461)));
            yy = -66.75896 + (((tickAnim - 15) / 5) * (-89.51191-(-66.75896)));
            zz = 36.00973 + (((tickAnim - 15) / 5) * (0.06355-(36.00973)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(UpperArmR, UpperArmR.rotateAngleX + (float) Math.toRadians(xx), UpperArmR.rotateAngleY + (float) Math.toRadians(yy), UpperArmR.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 5) {
            xx = -15.96 + (((tickAnim - 0) / 5) * (-4.61631-(-15.96)));
            yy = 88.64 + (((tickAnim - 0) / 5) * (22.55734-(88.64)));
            zz = -1.32 + (((tickAnim - 0) / 5) * (2.30969-(-1.32)));
        }
        else if (tickAnim >= 5 && tickAnim < 10) {
            xx = -4.61631 + (((tickAnim - 5) / 5) * (-15.96338-(-4.61631)));
            yy = 22.55734 + (((tickAnim - 5) / 5) * (88.64155-(22.55734)));
            zz = 2.30969 + (((tickAnim - 5) / 5) * (-1.31615-(2.30969)));
        }
        else if (tickAnim >= 10 && tickAnim < 15) {
            xx = -15.96338 + (((tickAnim - 10) / 5) * (-6.05177-(-15.96338)));
            yy = 88.64155 + (((tickAnim - 10) / 5) * (46.45967-(88.64155)));
            zz = -1.31615 + (((tickAnim - 10) / 5) * (19.05293-(-1.31615)));
        }
        else if (tickAnim >= 15 && tickAnim < 20) {
            xx = -6.05177 + (((tickAnim - 15) / 5) * (-15.96-(-6.05177)));
            yy = 46.45967 + (((tickAnim - 15) / 5) * (88.64-(46.45967)));
            zz = 19.05293 + (((tickAnim - 15) / 5) * (-1.32-(19.05293)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(LowerArmR, LowerArmR.rotateAngleX + (float) Math.toRadians(xx), LowerArmR.rotateAngleY + (float) Math.toRadians(yy), LowerArmR.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 5) {
            xx = 1.45831 + (((tickAnim - 0) / 5) * (14.29633-(1.45831)));
            yy = 22.2452 + (((tickAnim - 0) / 5) * (-40.74297-(22.2452)));
            zz = -0.05332 + (((tickAnim - 0) / 5) * (-3.72019-(-0.05332)));
        }
        else if (tickAnim >= 5 && tickAnim < 10) {
            xx = 14.29633 + (((tickAnim - 5) / 5) * (76.14153-(14.29633)));
            yy = -40.74297 + (((tickAnim - 5) / 5) * (-71.13353-(-40.74297)));
            zz = -3.72019 + (((tickAnim - 5) / 5) * (-69.38817-(-3.72019)));
        }
        else if (tickAnim >= 10 && tickAnim < 15) {
            xx = 76.14153 + (((tickAnim - 10) / 5) * (-41.42458-(76.14153)));
            yy = -71.13353 + (((tickAnim - 10) / 5) * (-25.0588-(-71.13353)));
            zz = -69.38817 + (((tickAnim - 10) / 5) * (-40.85001-(-69.38817)));
        }
        else if (tickAnim >= 15 && tickAnim < 20) {
            xx = -41.42458 + (((tickAnim - 15) / 5) * (1.45831-(-41.42458)));
            yy = -25.0588 + (((tickAnim - 15) / 5) * (22.2452-(-25.0588)));
            zz = -40.85001 + (((tickAnim - 15) / 5) * (-0.05332-(-40.85001)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(HandR, HandR.rotateAngleX + (float) Math.toRadians(xx), HandR.rotateAngleY + (float) Math.toRadians(yy), HandR.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 0) / 5) * (46.50461-(0)));
            yy = 0 + (((tickAnim - 0) / 5) * (66.75896-(0)));
            zz = 0 + (((tickAnim - 0) / 5) * (-36.00973-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 10) {
            xx = 46.50461 + (((tickAnim - 5) / 5) * (10.54677-(46.50461)));
            yy = 66.75896 + (((tickAnim - 5) / 5) * (89.51191-(66.75896)));
            zz = -36.00973 + (((tickAnim - 5) / 5) * (-0.06355-(-36.00973)));
        }
        else if (tickAnim >= 10 && tickAnim < 15) {
            xx = 10.54677 + (((tickAnim - 10) / 5) * (-1.54484-(10.54677)));
            yy = 89.51191 + (((tickAnim - 10) / 5) * (2.70147-(89.51191)));
            zz = -0.06355 + (((tickAnim - 10) / 5) * (2.62094-(-0.06355)));
        }
        else if (tickAnim >= 15 && tickAnim < 20) {
            xx = -1.54484 + (((tickAnim - 15) / 5) * (0-(-1.54484)));
            yy = 2.70147 + (((tickAnim - 15) / 5) * (0-(2.70147)));
            zz = 2.62094 + (((tickAnim - 15) / 5) * (0-(2.62094)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(UpperArmL, UpperArmL.rotateAngleX + (float) Math.toRadians(xx), UpperArmL.rotateAngleY + (float) Math.toRadians(yy), UpperArmL.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 5) {
            xx = -15.96338 + (((tickAnim - 0) / 5) * (-6.05177-(-15.96338)));
            yy = -88.64155 + (((tickAnim - 0) / 5) * (-46.45967-(-88.64155)));
            zz = 1.31615 + (((tickAnim - 0) / 5) * (-19.05293-(1.31615)));
        }
        else if (tickAnim >= 5 && tickAnim < 10) {
            xx = -6.05177 + (((tickAnim - 5) / 5) * (-15.96-(-6.05177)));
            yy = -46.45967 + (((tickAnim - 5) / 5) * (-88.64-(-46.45967)));
            zz = -19.05293 + (((tickAnim - 5) / 5) * (1.32-(-19.05293)));
        }
        else if (tickAnim >= 10 && tickAnim < 15) {
            xx = -15.96 + (((tickAnim - 10) / 5) * (-4.61631-(-15.96)));
            yy = -88.64 + (((tickAnim - 10) / 5) * (-22.55734-(-88.64)));
            zz = 1.32 + (((tickAnim - 10) / 5) * (-2.30969-(1.32)));
        }
        else if (tickAnim >= 15 && tickAnim < 20) {
            xx = -4.61631 + (((tickAnim - 15) / 5) * (-15.96338-(-4.61631)));
            yy = -22.55734 + (((tickAnim - 15) / 5) * (-88.64155-(-22.55734)));
            zz = -2.30969 + (((tickAnim - 15) / 5) * (1.31615-(-2.30969)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(LowerArmL, LowerArmL.rotateAngleX + (float) Math.toRadians(xx), LowerArmL.rotateAngleY + (float) Math.toRadians(yy), LowerArmL.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 5) {
            xx = 76.14153 + (((tickAnim - 0) / 5) * (-41.42458-(76.14153)));
            yy = 71.13353 + (((tickAnim - 0) / 5) * (25.0588-(71.13353)));
            zz = 69.38817 + (((tickAnim - 0) / 5) * (40.85001-(69.38817)));
        }
        else if (tickAnim >= 5 && tickAnim < 10) {
            xx = -41.42458 + (((tickAnim - 5) / 5) * (1.45831-(-41.42458)));
            yy = 25.0588 + (((tickAnim - 5) / 5) * (-22.2452-(25.0588)));
            zz = 40.85001 + (((tickAnim - 5) / 5) * (0.05332-(40.85001)));
        }
        else if (tickAnim >= 10 && tickAnim < 15) {
            xx = 1.45831 + (((tickAnim - 10) / 5) * (14.29633-(1.45831)));
            yy = -22.2452 + (((tickAnim - 10) / 5) * (40.74297-(-22.2452)));
            zz = 0.05332 + (((tickAnim - 10) / 5) * (3.72019-(0.05332)));
        }
        else if (tickAnim >= 15 && tickAnim < 20) {
            xx = 14.29633 + (((tickAnim - 15) / 5) * (76.14153-(14.29633)));
            yy = 40.74297 + (((tickAnim - 15) / 5) * (71.13353-(40.74297)));
            zz = 3.72019 + (((tickAnim - 15) / 5) * (69.38817-(3.72019)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(HandL, HandL.rotateAngleX + (float) Math.toRadians(xx), HandL.rotateAngleY + (float) Math.toRadians(yy), HandL.rotateAngleZ + (float) Math.toRadians(zz));


    }

    public void animRun(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime) {
        EntityPrehistoricFloraCeltedens entity = (EntityPrehistoricFloraCeltedens) entitylivingbaseIn;
        int animCycle = 5;
        if (entity.animSpeedAdder() <= 0) {
            partialTickTime = 0; //If it's static don't increment partial ticks either
        }
        double tickAnim = (entity.ticksExistedAnimated + entity.getTickOffset()) - (int) (Math.floor((double) (entity.ticksExistedAnimated + entity.getTickOffset()) / (double) animCycle) * (double) animCycle) + partialTickTime;

        double xx = 0;
        double yy = 0;
        double zz = 0;
        this.setRotateAngle(Hips, Hips.rotateAngleX + (float) Math.toRadians(-10), Hips.rotateAngleY + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/0.25-600))*18), Hips.rotateAngleZ + (float) Math.toRadians(0));
        this.Hips.rotationPointX = this.Hips.rotationPointX + (float)(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/0.25+610))*2);
        this.Hips.rotationPointY = this.Hips.rotationPointY - (float)(1+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*720/0.25-90))*0.1);
        this.Hips.rotationPointZ = this.Hips.rotationPointZ + (float)(0);


        this.setRotateAngle(Tail1, Tail1.rotateAngleX + (float) Math.toRadians(5), Tail1.rotateAngleY + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/0.25-700))*30), Tail1.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(Tail2, Tail2.rotateAngleX + (float) Math.toRadians(5), Tail2.rotateAngleY + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/0.25-800))*40), Tail2.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(Body, Body.rotateAngleX + (float) Math.toRadians(5), Body.rotateAngleY + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/0.25-500))*17), Body.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(Body2, Body2.rotateAngleX + (float) Math.toRadians(5), Body2.rotateAngleY + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/0.25-400))*16), Body2.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(Chest, Chest.rotateAngleX + (float) Math.toRadians(2.5), Chest.rotateAngleY + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/0.25-400))*15), Chest.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(Neck, Neck.rotateAngleX + (float) Math.toRadians(0), Neck.rotateAngleY + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/0.25-400))*7), Neck.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(Head, Head.rotateAngleX + (float) Math.toRadians(0), Head.rotateAngleY + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/0.25+470))*15), Head.rotateAngleZ + (float) Math.toRadians(0));



        if (tickAnim >= 0 && tickAnim < 2) {
            xx = -4.51928 + (((tickAnim - 0) / 2) * (-14.90502-(-4.51928)));
            yy = 27.40836 + (((tickAnim - 0) / 2) * (-42.02268-(27.40836)));
            zz = 34.36555 + (((tickAnim - 0) / 2) * (18.93676-(34.36555)));
        }
        else if (tickAnim >= 2 && tickAnim < 3) {
            xx = -14.90502 + (((tickAnim - 2) / 1) * (12.28976-(-14.90502)));
            yy = -42.02268 + (((tickAnim - 2) / 1) * (-67.14556-(-42.02268)));
            zz = 18.93676 + (((tickAnim - 2) / 1) * (-21.35386-(18.93676)));
        }
        else if (tickAnim >= 3 && tickAnim < 3) {
            xx = 12.28976 + (((tickAnim - 3) / 0) * (19.99091-(12.28976)));
            yy = -67.14556 + (((tickAnim - 3) / 0) * (-48.57217-(-67.14556)));
            zz = -21.35386 + (((tickAnim - 3) / 0) * (-15.2787-(-21.35386)));
        }
        else if (tickAnim >= 3 && tickAnim < 4) {
            xx = 19.99091 + (((tickAnim - 3) / 1) * (-0.78293-(19.99091)));
            yy = -48.57217 + (((tickAnim - 3) / 1) * (-15.22537-(-48.57217)));
            zz = -15.2787 + (((tickAnim - 3) / 1) * (-3.55581-(-15.2787)));
        }
        else if (tickAnim >= 4 && tickAnim < 5) {
            xx = -0.78293 + (((tickAnim - 4) / 1) * (-4.51928-(-0.78293)));
            yy = -15.22537 + (((tickAnim - 4) / 1) * (27.40836-(-15.22537)));
            zz = -3.55581 + (((tickAnim - 4) / 1) * (34.36555-(-3.55581)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(UpperLegR, UpperLegR.rotateAngleX + (float) Math.toRadians(xx), UpperLegR.rotateAngleY + (float) Math.toRadians(yy), UpperLegR.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 2) {
            xx = 0 + (((tickAnim - 0) / 2) * (0-(0)));
            yy = -57.5 + (((tickAnim - 0) / 2) * (18.33-(-57.5)));
            zz = 0 + (((tickAnim - 0) / 2) * (0-(0)));
        }
        else if (tickAnim >= 2 && tickAnim < 3) {
            xx = 0 + (((tickAnim - 2) / 1) * (0-(0)));
            yy = 18.33 + (((tickAnim - 2) / 1) * (0-(18.33)));
            zz = 0 + (((tickAnim - 2) / 1) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 3) {
            xx = 0 + (((tickAnim - 3) / 0) * (0-(0)));
            yy = 0 + (((tickAnim - 3) / 0) * (25.83-(0)));
            zz = 0 + (((tickAnim - 3) / 0) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 4) {
            xx = 0 + (((tickAnim - 3) / 1) * (0-(0)));
            yy = 25.83 + (((tickAnim - 3) / 1) * (29.17-(25.83)));
            zz = 0 + (((tickAnim - 3) / 1) * (0-(0)));
        }
        else if (tickAnim >= 4 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 4) / 1) * (0-(0)));
            yy = 29.17 + (((tickAnim - 4) / 1) * (-57.5-(29.17)));
            zz = 0 + (((tickAnim - 4) / 1) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(LowerLegR, LowerLegR.rotateAngleX + (float) Math.toRadians(xx), LowerLegR.rotateAngleY + (float) Math.toRadians(yy), LowerLegR.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 46.07609 + (((tickAnim - 0) / 3) * (-130.2828-(46.07609)));
            yy = 67.2091 + (((tickAnim - 0) / 3) * (29.77339-(67.2091)));
            zz = -29.88879 + (((tickAnim - 0) / 3) * (157.05077-(-29.88879)));
        }
        else if (tickAnim >= 3 && tickAnim < 3) {
            xx = -130.2828 + (((tickAnim - 3) / 0) * (-160.75626-(-130.2828)));
            yy = 29.77339 + (((tickAnim - 3) / 0) * (46.56016-(29.77339)));
            zz = 157.05077 + (((tickAnim - 3) / 0) * (181.33778-(157.05077)));
        }
        else if (tickAnim >= 3 && tickAnim < 4) {
            xx = -160.75626 + (((tickAnim - 3) / 1) * (-169.36371-(-160.75626)));
            yy = 46.56016 + (((tickAnim - 3) / 1) * (35.61771-(46.56016)));
            zz = 181.33778 + (((tickAnim - 3) / 1) * (182.23468-(181.33778)));
        }
        else if (tickAnim >= 4 && tickAnim < 5) {
            xx = -169.36371 + (((tickAnim - 4) / 1) * (46.07609-(-169.36371)));
            yy = 35.61771 + (((tickAnim - 4) / 1) * (67.2091-(35.61771)));
            zz = 182.23468 + (((tickAnim - 4) / 1) * (-29.88879-(182.23468)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(FootR, FootR.rotateAngleX + (float) Math.toRadians(xx), FootR.rotateAngleY + (float) Math.toRadians(yy), FootR.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 1) {
            xx = 12.28976 + (((tickAnim - 0) / 1) * (19.99091-(12.28976)));
            yy = 67.14556 + (((tickAnim - 0) / 1) * (48.57217-(67.14556)));
            zz = 21.35386 + (((tickAnim - 0) / 1) * (15.2787-(21.35386)));
        }
        else if (tickAnim >= 1 && tickAnim < 2) {
            xx = 19.99091 + (((tickAnim - 1) / 1) * (-0.78293-(19.99091)));
            yy = 48.57217 + (((tickAnim - 1) / 1) * (15.22537-(48.57217)));
            zz = 15.2787 + (((tickAnim - 1) / 1) * (3.55581-(15.2787)));
        }
        else if (tickAnim >= 2 && tickAnim < 3) {
            xx = -0.78293 + (((tickAnim - 2) / 1) * (-4.51928-(-0.78293)));
            yy = 15.22537 + (((tickAnim - 2) / 1) * (-27.40836-(15.22537)));
            zz = 3.55581 + (((tickAnim - 2) / 1) * (-34.36555-(3.55581)));
        }
        else if (tickAnim >= 3 && tickAnim < 4) {
            xx = -4.51928 + (((tickAnim - 3) / 1) * (-14.90502-(-4.51928)));
            yy = -27.40836 + (((tickAnim - 3) / 1) * (42.02268-(-27.40836)));
            zz = -34.36555 + (((tickAnim - 3) / 1) * (-18.93676-(-34.36555)));
        }
        else if (tickAnim >= 4 && tickAnim < 5) {
            xx = -14.90502 + (((tickAnim - 4) / 1) * (12.28976-(-14.90502)));
            yy = 42.02268 + (((tickAnim - 4) / 1) * (67.14556-(42.02268)));
            zz = -18.93676 + (((tickAnim - 4) / 1) * (21.35386-(-18.93676)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(UpperLegL, UpperLegL.rotateAngleX + (float) Math.toRadians(xx), UpperLegL.rotateAngleY + (float) Math.toRadians(yy), UpperLegL.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 1) {
            xx = 0 + (((tickAnim - 0) / 1) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 1) * (-25.83-(0)));
            zz = 0 + (((tickAnim - 0) / 1) * (0-(0)));
        }
        else if (tickAnim >= 1 && tickAnim < 2) {
            xx = 0 + (((tickAnim - 1) / 1) * (0-(0)));
            yy = -25.83 + (((tickAnim - 1) / 1) * (-29.17-(-25.83)));
            zz = 0 + (((tickAnim - 1) / 1) * (0-(0)));
        }
        else if (tickAnim >= 2 && tickAnim < 3) {
            xx = 0 + (((tickAnim - 2) / 1) * (0-(0)));
            yy = -29.17 + (((tickAnim - 2) / 1) * (57.5-(-29.17)));
            zz = 0 + (((tickAnim - 2) / 1) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 4) {
            xx = 0 + (((tickAnim - 3) / 1) * (0-(0)));
            yy = 57.5 + (((tickAnim - 3) / 1) * (-18.33-(57.5)));
            zz = 0 + (((tickAnim - 3) / 1) * (0-(0)));
        }
        else if (tickAnim >= 4 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 4) / 1) * (0-(0)));
            yy = -18.33 + (((tickAnim - 4) / 1) * (0-(-18.33)));
            zz = 0 + (((tickAnim - 4) / 1) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(LowerLegL, LowerLegL.rotateAngleX + (float) Math.toRadians(xx), LowerLegL.rotateAngleY + (float) Math.toRadians(yy), LowerLegL.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 1) {
            xx = -130.2828 + (((tickAnim - 0) / 1) * (-160.75626-(-130.2828)));
            yy = -29.77339 + (((tickAnim - 0) / 1) * (-46.56016-(-29.77339)));
            zz = -157.05077 + (((tickAnim - 0) / 1) * (-181.33778-(-157.05077)));
        }
        else if (tickAnim >= 1 && tickAnim < 2) {
            xx = -160.75626 + (((tickAnim - 1) / 1) * (-169.36371-(-160.75626)));
            yy = -46.56016 + (((tickAnim - 1) / 1) * (-35.61771-(-46.56016)));
            zz = -181.33778 + (((tickAnim - 1) / 1) * (-182.23468-(-181.33778)));
        }
        else if (tickAnim >= 2 && tickAnim < 3) {
            xx = -169.36371 + (((tickAnim - 2) / 1) * (46.07609-(-169.36371)));
            yy = -35.61771 + (((tickAnim - 2) / 1) * (-67.2091-(-35.61771)));
            zz = -182.23468 + (((tickAnim - 2) / 1) * (29.88879-(-182.23468)));
        }
        else if (tickAnim >= 3 && tickAnim < 5) {
            xx = 46.07609 + (((tickAnim - 3) / 2) * (-130.2828-(46.07609)));
            yy = -67.2091 + (((tickAnim - 3) / 2) * (-29.77339-(-67.2091)));
            zz = 29.88879 + (((tickAnim - 3) / 2) * (-157.05077-(29.88879)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(FootL, FootL.rotateAngleX + (float) Math.toRadians(xx), FootL.rotateAngleY + (float) Math.toRadians(yy), FootL.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 1) {
            xx = 20.41791 + (((tickAnim - 0) / 1) * (49.56487-(20.41791)));
            yy = -39.79111 + (((tickAnim - 0) / 1) * (-30.5994-(-39.79111)));
            zz = -18.19683 + (((tickAnim - 0) / 1) * (7.75927-(-18.19683)));
        }
        else if (tickAnim >= 1 && tickAnim < 3) {
            xx = 49.56487 + (((tickAnim - 1) / 2) * (111.80351-(49.56487)));
            yy = -30.5994 + (((tickAnim - 1) / 2) * (2.31738-(-30.5994)));
            zz = 7.75927 + (((tickAnim - 1) / 2) * (54.91431-(7.75927)));
        }
        else if (tickAnim >= 3 && tickAnim < 4) {
            xx = 111.80351 + (((tickAnim - 3) / 1) * (53.03609-(111.80351)));
            yy = 2.31738 + (((tickAnim - 3) / 1) * (-55.30923-(2.31738)));
            zz = 54.91431 + (((tickAnim - 3) / 1) * (34.43175-(54.91431)));
        }
        else if (tickAnim >= 4 && tickAnim < 5) {
            xx = 53.03609 + (((tickAnim - 4) / 1) * (20.41791-(53.03609)));
            yy = -55.30923 + (((tickAnim - 4) / 1) * (-39.79111-(-55.30923)));
            zz = 34.43175 + (((tickAnim - 4) / 1) * (-18.19683-(34.43175)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(UpperArmR, UpperArmR.rotateAngleX + (float) Math.toRadians(xx), UpperArmR.rotateAngleY + (float) Math.toRadians(yy), UpperArmR.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            yy = 15 + (((tickAnim - 0) / 3) * (22.5-(15)));
            zz = 0 + (((tickAnim - 0) / 3) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 3) / 2) * (0-(0)));
            yy = 22.5 + (((tickAnim - 3) / 2) * (15-(22.5)));
            zz = 0 + (((tickAnim - 3) / 2) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(LowerArmR, LowerArmR.rotateAngleX + (float) Math.toRadians(xx), LowerArmR.rotateAngleY + (float) Math.toRadians(yy), LowerArmR.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 1) {
            xx = 19.98436 + (((tickAnim - 0) / 1) * (-5.54063-(19.98436)));
            yy = 0.75155 + (((tickAnim - 0) / 1) * (-9.43816-(0.75155)));
            zz = 30.11557 + (((tickAnim - 0) / 1) * (52.56922-(30.11557)));
        }
        else if (tickAnim >= 1 && tickAnim < 3) {
            xx = -5.54063 + (((tickAnim - 1) / 2) * (0-(-5.54063)));
            yy = -9.43816 + (((tickAnim - 1) / 2) * (0-(-9.43816)));
            zz = 52.56922 + (((tickAnim - 1) / 2) * (-42.5-(52.56922)));
        }
        else if (tickAnim >= 3 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 3) / 2) * (19.98436-(0)));
            yy = 0 + (((tickAnim - 3) / 2) * (0.75155-(0)));
            zz = -42.5 + (((tickAnim - 3) / 2) * (30.11557-(-42.5)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(HandR, HandR.rotateAngleX + (float) Math.toRadians(xx), HandR.rotateAngleY + (float) Math.toRadians(yy), HandR.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 2) {
            xx = 111.80351 + (((tickAnim - 0) / 2) * (53.03609-(111.80351)));
            yy = -2.31738 + (((tickAnim - 0) / 2) * (55.30923-(-2.31738)));
            zz = -54.91431 + (((tickAnim - 0) / 2) * (-34.43175-(-54.91431)));
        }
        else if (tickAnim >= 2 && tickAnim < 3) {
            xx = 53.03609 + (((tickAnim - 2) / 1) * (20.41791-(53.03609)));
            yy = 55.30923 + (((tickAnim - 2) / 1) * (39.79111-(55.30923)));
            zz = -34.43175 + (((tickAnim - 2) / 1) * (18.19683-(-34.43175)));
        }
        else if (tickAnim >= 3 && tickAnim < 3) {
            xx = 20.41791 + (((tickAnim - 3) / 0) * (49.56487-(20.41791)));
            yy = 39.79111 + (((tickAnim - 3) / 0) * (30.5994-(39.79111)));
            zz = 18.19683 + (((tickAnim - 3) / 0) * (-7.75927-(18.19683)));
        }
        else if (tickAnim >= 3 && tickAnim < 5) {
            xx = 49.56487 + (((tickAnim - 3) / 2) * (111.80351-(49.56487)));
            yy = 30.5994 + (((tickAnim - 3) / 2) * (-2.31738-(30.5994)));
            zz = -7.75927 + (((tickAnim - 3) / 2) * (-54.91431-(-7.75927)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(UpperArmL, UpperArmL.rotateAngleX + (float) Math.toRadians(xx), UpperArmL.rotateAngleY + (float) Math.toRadians(yy), UpperArmL.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            yy = -22.5 + (((tickAnim - 0) / 3) * (-15-(-22.5)));
            zz = 0 + (((tickAnim - 0) / 3) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 3) / 2) * (0-(0)));
            yy = -15 + (((tickAnim - 3) / 2) * (-22.5-(-15)));
            zz = 0 + (((tickAnim - 3) / 2) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(LowerArmL, LowerArmL.rotateAngleX + (float) Math.toRadians(xx), LowerArmL.rotateAngleY + (float) Math.toRadians(yy), LowerArmL.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 0 + (((tickAnim - 0) / 3) * (19.98436-(0)));
            yy = 0 + (((tickAnim - 0) / 3) * (-0.75155-(0)));
            zz = 42.5 + (((tickAnim - 0) / 3) * (-30.11557-(42.5)));
        }
        else if (tickAnim >= 3 && tickAnim < 3) {
            xx = 19.98436 + (((tickAnim - 3) / 0) * (-5.54063-(19.98436)));
            yy = -0.75155 + (((tickAnim - 3) / 0) * (9.43816-(-0.75155)));
            zz = -30.11557 + (((tickAnim - 3) / 0) * (-52.56922-(-30.11557)));
        }
        else if (tickAnim >= 3 && tickAnim < 5) {
            xx = -5.54063 + (((tickAnim - 3) / 2) * (0-(-5.54063)));
            yy = 9.43816 + (((tickAnim - 3) / 2) * (0-(9.43816)));
            zz = -52.56922 + (((tickAnim - 3) / 2) * (42.5-(-52.56922)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(HandL, HandL.rotateAngleX + (float) Math.toRadians(xx), HandL.rotateAngleY + (float) Math.toRadians(yy), HandL.rotateAngleZ + (float) Math.toRadians(zz));


    }

    @Override
    public void setRotationAngles(float f, float f1, float f2, float f3, float f4, float f5, Entity e) {
        super.setRotationAngles(f, f1, f2, f3, f4, f5, e);
        //this.resetToDefaultPose();
        //this.casineria.offsetY = 1.20F;

        EntityPrehistoricFloraCeltedens entityCeltedens = (EntityPrehistoricFloraCeltedens) e;

        this.faceTarget(f3, f4, 8, Neck);
        this.faceTarget(f3, f4, 8, Head);

//        AdvancedModelRenderer[] Tail = {this.Tail1, this.Tail2};
//        AdvancedModelRenderer[] Torso = {this.Neck, this.Chest, this.Body2};

//        float speed = 0.85F;
//
//        //EntityPrehistoricFloraCeltedens entityCeltedens = (EntityPrehistoricFloraCeltedens) e;
//        if (f3 == 0.0F || !entityCeltedens.getIsMoving()) { //Not moving
//            this.chainWave(Tail, speed * 0.33F, 0.025F, -1.5, f2, 1);
//            this.chainSwing(Tail, speed * 0.2F, 0.08F, -1.8, f2, 0.8F);
//            return;
//        }
//
//        this.flap(UpperLegL, speed, 0.45F, false, -3, -0.35F, f2, 0.5F);
//        this.swing(UpperLegL, speed, -0.5F, true, -1, 1F, f2, 0.5F);
//        this.walk(LowerLegL, speed, -0.6F, true, -3, 0.0F, f2, 0.8F);
//        this.flap(LowerLegL, speed, -0.5F, true, 0, 0.25F, f2, 0.8F);
//        this.flap(FootL, speed, 0.2F, false, 3, -0.1F, f2, 0.3F);
//        this.walk(FootL, speed, 0.2F, false, 3, 0.4F, f2, 0.5F);
//        this.swing(FootL, speed, 0.2F, false, 3, 0F, f2, 0.5F);
//
//        this.flap(UpperLegR, speed, -0.45F, false, 0, 0.35F, f2, 0.5F);
//        this.swing(UpperLegR, speed, 0.5F, true, 2, -1F, f2, 0.5F);
//        this.walk(LowerLegR, speed, -0.6F, true, 0, 0.0F, f2, 0.8F);
//        this.flap(LowerLegR, speed, 0.5F, true, 3, -0.25F, f2, 0.8F);
//        this.flap(FootR, speed, -0.2F, false, 6, 0.1F, f2, 0.3F);
//        this.walk(FootR, speed, 0.2F, false, 6, 0.4F, f2, 0.5F);
//        this.swing(FootR, speed, -0.2F, false, 6, 0F, f2, 0.5F);
//
//        this.flap(UpperArmL, speed, 0.45F, false, 0, -0.18F, f2, 0.5F);
//        this.swing(UpperArmL, speed, -0.75F, true, 2, 0.5F, f2, 0.5F);
//        this.walk(LowerArmL, speed, -0.5F, true, 0, 0.0F, f2, 0.8F);
//        this.flap(HandL, speed, 0.2F, false, -1.5F, 0.4F, f2, 0.3F);
//        this.walk(HandL, speed, 0.2F, false, -1.5F, 0.4F, f2, 0.5F);
//        this.swing(HandL, speed, 0.2F, false, -1.5F, 0F, f2, 0.5F);
//
//        this.flap(UpperArmR, speed, -0.45F, false, -3, 0.18F, f2, 0.5F);
//        this.swing(UpperArmR, speed, 0.75F, true, -1, -0.5F, f2, 0.5F);
//        this.walk(LowerArmR, speed, -0.5F, true, -3, 0.0F, f2, 0.8F);
//        this.flap(HandR, speed, -0.2F, false, 1.5F, -0.4F, f2, 0.3F);
//        this.walk(HandR, speed, 0.2F, false, 1.5F, 0.4F, f2, 0.5F);
//        this.swing(HandR, speed, -0.2F, false, 1.5F, 0F, f2, 0.5F);
//
//        this.chainWave(Tail, speed, 0.1F, -3, f2, 1);
//        this.chainSwing(Tail, speed * 0.8F, 0.18F, -2.4, f2, 0.8F);
//        this.chainSwing(Torso, speed, 0.08F, -2, f2, 0.75F);

    }


    public void animate(IAnimatedEntity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        EntityPrehistoricFloraCeltedens e = (EntityPrehistoricFloraCeltedens) entity;
        animator.update(entity);
        //this.resetToDefaultPose();
        setRotationAngles(f, f1, f2, f3, f4, f5, (Entity) entity);

        animator.setAnimation(e.ATTACK_ANIMATION);
        animator.startKeyframe(5);
        animator.rotate(this.Neck, (float) Math.toRadians(30), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(this.Head, (float) Math.toRadians(-15), (float) Math.toRadians(0), (float) Math.toRadians(0));
        //animator.rotate(this.upperjaw, (float) Math.toRadians(-25), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(this.Jaw, (float) Math.toRadians(10), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.endKeyframe();
        animator.setStaticKeyframe(2);
        animator.resetKeyframe(2);

        animator.setAnimation(e.ROAR_ANIMATION);
        animator.startKeyframe(10);
        animator.move(this.Neck, 0,0,-0.5F);
        animator.rotate(this.Head, (float) Math.toRadians(-17), (float) Math.toRadians(0), (float) Math.toRadians(0));
        //animator.rotate(this.upperjaw, (float) Math.toRadians(-25), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(this.Jaw, (float) Math.toRadians(10), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.endKeyframe();
        animator.setStaticKeyframe(10);
        animator.resetKeyframe(10);
    }
}
