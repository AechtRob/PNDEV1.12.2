package net.lepidodendron.entity.model.entity;

import net.ilexiconn.llibrary.client.model.ModelAnimator;
import net.ilexiconn.llibrary.client.model.tools.AdvancedModelBase;
import net.ilexiconn.llibrary.client.model.tools.AdvancedModelRenderer;
import net.ilexiconn.llibrary.server.animation.IAnimatedEntity;
import net.lepidodendron.entity.EntityPrehistoricFloraCasineria;
import net.lepidodendron.entity.EntityPrehistoricFloraCeltedens;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

public class ModelCeltedens extends AdvancedModelBase {
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
        this.textureWidth = 40;
        this.textureHeight = 33;

        this.Hips = new AdvancedModelRenderer(this);
        this.Hips.setRotationPoint(0.0F, 24.0F, 6.0F);
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
    public void renderStatic(float f) {
        //GlStateManager.pushMatrix();
        //GlStateManager.enableBlend();
        //GlStateManager.blendFunc(GlStateManager.SourceFactor.SRC_ALPHA, GlStateManager.DestFactor.ONE_MINUS_SRC_ALPHA);
        //GlStateManager.disableCull();
        this.Hips.offsetZ = -0.71F;
        this.Hips.render(0.1F);
        //GlStateManager.enableCull();
        //GlStateManager.disableBlend();
        //GlStateManager.popMatrix();
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
        //this.casineria.offsetY = 1.20F;

        EntityPrehistoricFloraCeltedens entityCeltedens = (EntityPrehistoricFloraCeltedens) e;

        this.faceTarget(f3, f4, 8, Neck);
        this.faceTarget(f3, f4, 8, Head);

        AdvancedModelRenderer[] Tail = {this.Tail1, this.Tail2};
        AdvancedModelRenderer[] Torso = {this.Neck, this.Chest, this.Body2};

        float speed = 0.85F;

        //EntityPrehistoricFloraCeltedens entityCeltedens = (EntityPrehistoricFloraCeltedens) e;
        if (f3 == 0.0F || !entityCeltedens.getIsMoving()) { //Not moving
            this.chainWave(Tail, speed * 0.33F, 0.025F, -1.5, f2, 1);
            this.chainSwing(Tail, speed * 0.2F, 0.08F, -1.8, f2, 0.8F);
            return;
        }

        this.flap(UpperLegL, speed, 0.45F, false, -3, -0.35F, f2, 0.5F);
        this.swing(UpperLegL, speed, -0.5F, true, -1, 1F, f2, 0.5F);
        this.walk(LowerLegL, speed, -0.6F, true, -3, 0.0F, f2, 0.8F);
        this.flap(LowerLegL, speed, -0.5F, true, 0, 0.25F, f2, 0.8F);
        this.flap(FootL, speed, 0.2F, false, 3, -0.1F, f2, 0.3F);
        this.walk(FootL, speed, 0.2F, false, 3, 0.4F, f2, 0.5F);
        this.swing(FootL, speed, 0.2F, false, 3, 0F, f2, 0.5F);

        this.flap(UpperLegR, speed, -0.45F, false, 0, 0.35F, f2, 0.5F);
        this.swing(UpperLegR, speed, 0.5F, true, 2, -1F, f2, 0.5F);
        this.walk(LowerLegR, speed, -0.6F, true, 0, 0.0F, f2, 0.8F);
        this.flap(LowerLegR, speed, 0.5F, true, 3, -0.25F, f2, 0.8F);
        this.flap(FootR, speed, -0.2F, false, 6, 0.1F, f2, 0.3F);
        this.walk(FootR, speed, 0.2F, false, 6, 0.4F, f2, 0.5F);
        this.swing(FootR, speed, -0.2F, false, 6, 0F, f2, 0.5F);

        this.flap(UpperArmL, speed, 0.45F, false, 0, -0.18F, f2, 0.5F);
        this.swing(UpperArmL, speed, -0.75F, true, 2, 0.5F, f2, 0.5F);
        this.walk(LowerArmL, speed, -0.5F, true, 0, 0.0F, f2, 0.8F);
        this.flap(HandL, speed, 0.2F, false, -1.5F, 0.4F, f2, 0.3F);
        this.walk(HandL, speed, 0.2F, false, -1.5F, 0.4F, f2, 0.5F);
        this.swing(HandL, speed, 0.2F, false, -1.5F, 0F, f2, 0.5F);

        this.flap(UpperArmR, speed, -0.45F, false, -3, 0.18F, f2, 0.5F);
        this.swing(UpperArmR, speed, 0.75F, true, -1, -0.5F, f2, 0.5F);
        this.walk(LowerArmR, speed, -0.5F, true, -3, 0.0F, f2, 0.8F);
        this.flap(HandR, speed, -0.2F, false, 1.5F, -0.4F, f2, 0.3F);
        this.walk(HandR, speed, 0.2F, false, 1.5F, 0.4F, f2, 0.5F);
        this.swing(HandR, speed, -0.2F, false, 1.5F, 0F, f2, 0.5F);

        this.chainWave(Tail, speed, 0.1F, -3, f2, 1);
        this.chainSwing(Tail, speed * 0.8F, 0.18F, -2.4, f2, 0.8F);
        this.chainSwing(Torso, speed, 0.08F, -2, f2, 0.75F);

    }


    public void animate(IAnimatedEntity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        EntityPrehistoricFloraCeltedens e = (EntityPrehistoricFloraCeltedens) entity;
        animator.update(entity);
        this.resetToDefaultPose();
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
