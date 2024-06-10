package net.lepidodendron.entity.model.entity;

import net.ilexiconn.llibrary.client.model.ModelAnimator;
import net.ilexiconn.llibrary.client.model.tools.AdvancedModelRenderer;
import net.ilexiconn.llibrary.server.animation.IAnimatedEntity;
import net.lepidodendron.entity.EntityPrehistoricFloraHomoeosaurus;
import net.lepidodendron.entity.model.ModelBasePalaeopedia;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

public class ModelHomoeosaurus extends ModelBasePalaeopedia {
    private final AdvancedModelRenderer Hips;
    private final AdvancedModelRenderer Body;
    private final AdvancedModelRenderer Neck;
    private final AdvancedModelRenderer Head;
    private final AdvancedModelRenderer cube_r1;
    private final AdvancedModelRenderer cube_r2;
    private final AdvancedModelRenderer Jaw;
    private final AdvancedModelRenderer cube_r3;
    private final AdvancedModelRenderer UpperArmR;
    private final AdvancedModelRenderer LowerArmR;
    private final AdvancedModelRenderer HandR;
    private final AdvancedModelRenderer cube_r4;
    private final AdvancedModelRenderer UpperArmL;
    private final AdvancedModelRenderer LowerArmL;
    private final AdvancedModelRenderer HandL;
    private final AdvancedModelRenderer cube_r5;
    private final AdvancedModelRenderer Tail;
    private final AdvancedModelRenderer Tail2;
    private final AdvancedModelRenderer Tail3;
    private final AdvancedModelRenderer UpperLegR;
    private final AdvancedModelRenderer LowerLegR;
    private final AdvancedModelRenderer FootR;
    private final AdvancedModelRenderer UpperLegL;
    private final AdvancedModelRenderer LowerLegL;
    private final AdvancedModelRenderer FootL;

    private ModelAnimator animator;

    public ModelHomoeosaurus() {
        this.textureWidth = 50;
        this.textureHeight = 46;

        this.Hips = new AdvancedModelRenderer(this);
        this.Hips.setRotationPoint(0.0F, 21.15F, 8.0F);
        this.setRotateAngle(Hips, -0.1309F, 0.0F, 0.0F);
        this.Hips.cubeList.add(new ModelBox(Hips, 18, 0, -2.0F, -1.5F, -4.0F, 4, 3, 5, 0.0F, false));
        this.Hips.cubeList.add(new ModelBox(Hips, 0, 0, -0.01F, -2.0F, -1.75F, 0, 1, 3, 0.0F, false));

        this.Body = new AdvancedModelRenderer(this);
        this.Body.setRotationPoint(0.0F, -0.25F, -3.0F);
        this.Hips.addChild(Body);
        this.setRotateAngle(Body, 0.1309F, 0.0F, 0.0F);
        this.Body.cubeList.add(new ModelBox(Body, 20, 34, -2.0F, -1.5F, -9.0F, 4, 4, 2, 0.0F, false));
        this.Body.cubeList.add(new ModelBox(Body, 0, 0, -2.5F, -1.5F, -7.0F, 5, 4, 8, 0.0F, false));
        this.Body.cubeList.add(new ModelBox(Body, 13, 3, -0.02F, -2.0F, -9.25F, 0, 1, 10, 0.0F, false));

        this.Neck = new AdvancedModelRenderer(this);
        this.Neck.setRotationPoint(0.0F, 0.1F, -8.5F);
        this.Body.addChild(Neck);
        this.setRotateAngle(Neck, -0.3054F, 0.0F, 0.0F);
        this.Neck.cubeList.add(new ModelBox(Neck, 28, 14, -1.5F, -1.5F, -4.0F, 3, 3, 4, -0.02F, false));
        this.Neck.cubeList.add(new ModelBox(Neck, 0, 0, 0.0F, 1.5F, -4.0F, 0, 2, 4, 0.0F, false));
        this.Neck.cubeList.add(new ModelBox(Neck, 0, 3, -0.01F, -2.0F, -4.0F, 0, 1, 3, 0.0F, false));

        this.Head = new AdvancedModelRenderer(this);
        this.Head.setRotationPoint(0.0F, -0.1F, -3.5F);
        this.Neck.addChild(Head);
        this.setRotateAngle(Head, 0.3054F, 0.0F, 0.0F);
        this.Head.cubeList.add(new ModelBox(Head, 0, 12, -1.5F, -1.5F, -2.0F, 3, 2, 2, 0.0F, false));
        this.Head.cubeList.add(new ModelBox(Head, 0, 27, -1.0F, -0.5F, -4.0F, 2, 1, 2, 0.0F, false));
        this.Head.cubeList.add(new ModelBox(Head, 28, 14, -0.5F, -0.5F, -5.0F, 1, 1, 1, 0.0F, false));

        this.cube_r1 = new AdvancedModelRenderer(this);
        this.cube_r1.setRotationPoint(0.0F, -1.5F, -2.0F);
        this.Head.addChild(cube_r1);
        this.setRotateAngle(cube_r1, 0.1309F, 0.0F, 0.0F);
        this.cube_r1.cubeList.add(new ModelBox(cube_r1, 0, 0, -1.0F, 0.0F, -2.0F, 2, 1, 2, -0.01F, false));

        this.cube_r2 = new AdvancedModelRenderer(this);
        this.cube_r2.setRotationPoint(0.0F, -0.5F, -5.0F);
        this.Head.addChild(cube_r2);
        this.setRotateAngle(cube_r2, 0.6283F, 0.0F, 0.0F);
        this.cube_r2.cubeList.add(new ModelBox(cube_r2, 18, 0, -0.5F, 0.0F, 0.27F, 1, 1, 1, -0.01F, false));
        this.cube_r2.cubeList.add(new ModelBox(cube_r2, 18, 2, -0.5F, 0.0F, 0.0F, 1, 1, 1, -0.02F, false));

        this.Jaw = new AdvancedModelRenderer(this);
        this.Jaw.setRotationPoint(0.0F, 0.5F, 0.0F);
        this.Head.addChild(Jaw);
        this.setRotateAngle(Jaw, -0.0436F, 0.0F, 0.0F);
        this.Jaw.cubeList.add(new ModelBox(Jaw, 0, 19, -1.5F, -0.01F, -1.99F, 3, 1, 2, -0.01F, false));
        this.Jaw.cubeList.add(new ModelBox(Jaw, 0, 24, -1.0F, -0.01F, -3.97F, 2, 1, 2, -0.01F, false));
        this.Jaw.cubeList.add(new ModelBox(Jaw, 27, 27, -0.5F, -0.01F, -4.95F, 1, 1, 1, -0.01F, false));

        this.cube_r3 = new AdvancedModelRenderer(this);
        this.cube_r3.setRotationPoint(0.0F, 0.0F, -0.3F);
        this.Jaw.addChild(cube_r3);
        this.setRotateAngle(cube_r3, -0.1745F, 0.0F, 0.0F);
        this.cube_r3.cubeList.add(new ModelBox(cube_r3, 14, 28, -1.0F, -1.0F, -1.0F, 2, 2, 1, 0.0F, false));

        this.UpperArmR = new AdvancedModelRenderer(this);
        this.UpperArmR.setRotationPoint(-1.5F, 1.0F, -8.0F);
        this.Body.addChild(UpperArmR);
        this.setRotateAngle(UpperArmR, 0.0F, 0.3491F, 0.0F);
        this.UpperArmR.cubeList.add(new ModelBox(UpperArmR, 0, 16, -3.0F, -0.5F, -1.0F, 3, 1, 2, 0.0F, false));

        this.LowerArmR = new AdvancedModelRenderer(this);
        this.LowerArmR.setRotationPoint(-3.0F, 0.0F, 0.5F);
        this.UpperArmR.addChild(LowerArmR);
        this.setRotateAngle(LowerArmR, 0.6534F, -0.0964F, -0.0108F);
        this.LowerArmR.cubeList.add(new ModelBox(LowerArmR, 31, 0, -0.5F, -0.5F, -4.0F, 2, 1, 4, 0.0F, false));

        this.HandR = new AdvancedModelRenderer(this);
        this.HandR.setRotationPoint(0.5F, 0.0F, -3.8F);
        this.LowerArmR.addChild(HandR);
        this.setRotateAngle(HandR, -0.6619F, -0.1382F, 0.1069F);


        this.cube_r4 = new AdvancedModelRenderer(this);
        this.cube_r4.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.HandR.addChild(cube_r4);
        this.setRotateAngle(cube_r4, 0.0436F, 1.8762F, 0.0F);
        this.cube_r4.cubeList.add(new ModelBox(cube_r4, 9, 19, -0.25F, 0.0F, -3.75F, 4, 0, 4, 0.0F, false));

        this.UpperArmL = new AdvancedModelRenderer(this);
        this.UpperArmL.setRotationPoint(1.5F, 1.0F, -8.0F);
        this.Body.addChild(UpperArmL);
        this.setRotateAngle(UpperArmL, 0.0F, -0.3491F, 0.0F);
        this.UpperArmL.cubeList.add(new ModelBox(UpperArmL, 0, 16, 0.0F, -0.5F, -1.0F, 3, 1, 2, 0.0F, true));

        this.LowerArmL = new AdvancedModelRenderer(this);
        this.LowerArmL.setRotationPoint(3.0F, 0.0F, 0.5F);
        this.UpperArmL.addChild(LowerArmL);
        this.setRotateAngle(LowerArmL, 0.6534F, 0.0964F, 0.0108F);
        this.LowerArmL.cubeList.add(new ModelBox(LowerArmL, 31, 0, -1.5F, -0.5F, -4.0F, 2, 1, 4, 0.0F, true));

        this.HandL = new AdvancedModelRenderer(this);
        this.HandL.setRotationPoint(-0.5F, 0.0F, -3.8F);
        this.LowerArmL.addChild(HandL);
        this.setRotateAngle(HandL, -0.6619F, 0.1382F, -0.1069F);


        this.cube_r5 = new AdvancedModelRenderer(this);
        this.cube_r5.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.HandL.addChild(cube_r5);
        this.setRotateAngle(cube_r5, 0.0436F, -1.8762F, 0.0F);
        this.cube_r5.cubeList.add(new ModelBox(cube_r5, 9, 19, -3.75F, 0.0F, -3.75F, 4, 0, 4, 0.0F, true));

        this.Tail = new AdvancedModelRenderer(this);
        this.Tail.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.Hips.addChild(Tail);
        this.setRotateAngle(Tail, 0.0873F, 0.0F, 0.0F);
        this.Tail.cubeList.add(new ModelBox(Tail, 0, 24, -1.5F, -1.5F, 0.0F, 3, 3, 8, -0.01F, false));
        this.Tail.cubeList.add(new ModelBox(Tail, 14, 20, -0.02F, -2.0F, 1.25F, 0, 1, 7, 0.0F, false));

        this.Tail2 = new AdvancedModelRenderer(this);
        this.Tail2.setRotationPoint(0.0F, 0.0F, 7.0F);
        this.Tail.addChild(Tail2);
        this.setRotateAngle(Tail2, -0.0436F, 0.0F, 0.0F);
        this.Tail2.cubeList.add(new ModelBox(Tail2, 14, 14, -1.0F, -1.0F, 0.0F, 2, 2, 10, 0.01F, false));
        this.Tail2.cubeList.add(new ModelBox(Tail2, 14, 17, -0.01F, -1.5F, 1.0F, 0, 1, 9, 0.0F, false));

        this.Tail3 = new AdvancedModelRenderer(this);
        this.Tail3.setRotationPoint(0.0F, 0.0F, 9.5F);
        this.Tail2.addChild(Tail3);
        this.setRotateAngle(Tail3, 0.0436F, 0.0F, 0.0F);
        this.Tail3.cubeList.add(new ModelBox(Tail3, 0, 12, -0.5F, -0.5F, 0.0F, 1, 1, 11, 0.0F, false));
        this.Tail3.cubeList.add(new ModelBox(Tail3, 13, 2, -0.01F, -1.0F, 1.0F, 0, 1, 10, 0.0F, false));

        this.UpperLegR = new AdvancedModelRenderer(this);
        this.UpperLegR.setRotationPoint(-1.5F, 0.0F, 0.5F);
        this.Hips.addChild(UpperLegR);
        this.setRotateAngle(UpperLegR, 0.0361F, -0.3911F, -0.138F);
        this.UpperLegR.cubeList.add(new ModelBox(UpperLegR, 26, 8, -5.0F, -1.0F, -2.0F, 5, 2, 2, 0.0F, false));

        this.LowerLegR = new AdvancedModelRenderer(this);
        this.LowerLegR.setRotationPoint(-5.0F, 0.0F, -1.0F);
        this.UpperLegR.addChild(LowerLegR);
        this.setRotateAngle(LowerLegR, -0.3052F, -0.0236F, 0.057F);
        this.LowerLegR.cubeList.add(new ModelBox(LowerLegR, 26, 26, -0.5F, -1.0F, 0.0F, 2, 2, 6, 0.0F, false));

        this.FootR = new AdvancedModelRenderer(this);
        this.FootR.setRotationPoint(0.5F, 0.0F, 5.5F);
        this.LowerLegR.addChild(FootR);
        this.setRotateAngle(FootR, 0.9303F, -1.0639F, -0.8677F);
        this.FootR.cubeList.add(new ModelBox(FootR, 8, 14, -0.8867F, 0.0084F, -0.4774F, 5, 0, 5, 0.0F, false));

        this.UpperLegL = new AdvancedModelRenderer(this);
        this.UpperLegL.setRotationPoint(1.5F, 0.0F, 0.5F);
        this.Hips.addChild(UpperLegL);
        this.setRotateAngle(UpperLegL, 0.0361F, 0.3911F, 0.138F);
        this.UpperLegL.cubeList.add(new ModelBox(UpperLegL, 26, 8, 0.0F, -1.0F, -2.0F, 5, 2, 2, 0.0F, true));

        this.LowerLegL = new AdvancedModelRenderer(this);
        this.LowerLegL.setRotationPoint(5.0F, 0.0F, -1.0F);
        this.UpperLegL.addChild(LowerLegL);
        this.setRotateAngle(LowerLegL, -0.3052F, 0.0236F, -0.057F);
        this.LowerLegL.cubeList.add(new ModelBox(LowerLegL, 26, 26, -1.5F, -1.0F, 0.0F, 2, 2, 6, 0.0F, true));

        this.FootL = new AdvancedModelRenderer(this);
        this.FootL.setRotationPoint(-0.5F, 0.0F, 5.5F);
        this.LowerLegL.addChild(FootL);
        this.setRotateAngle(FootL, 0.9303F, 1.0639F, 0.8677F);
        this.FootL.cubeList.add(new ModelBox(FootL, 8, 14, -4.1133F, 0.0084F, -0.4774F, 5, 0, 5, 0.0F, true));

        updateDefaultPose();
        animator = ModelAnimator.create();
    }

    @Override
    public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        animate((IAnimatedEntity) entity, f, f1, f2, f3, f4, f5);
        this.Hips.render(f5);
    }
        public void renderStaticWall(float f) {
            this.Body.rotateAngleY = (float) Math.toRadians(0);
            this.setRotateAngle(Body, 0.7F, 0.0F, -0.25F);
            this.setRotateAngle(Neck, -0.5F, 0.0F, 0.0F);
            this.setRotateAngle(Jaw, 0.3F, 0.0F, 0.0F);
            this.Body.offsetY = 0.0F;
            this.Body.offsetX = 0.0F;
            this.Body.offsetZ = -0.5F;
            this.Body.render(0.01F);
            resetToDefaultPose();
    }
    public void renderStaticFloor(float f) {
        this.setRotateAngle(Body, 0.0F, 0.0F, 0.0F);
        this.setRotateAngle(Neck, 0.0F, 0.0F, 0.0F);
        this.setRotateAngle(Jaw, 0.2F, 0.0F, 0.0F);
        this.setRotateAngle(UpperArmR, 0.0F, 0.0F, -0.0F);
        this.setRotateAngle(LowerArmR, 1.0F, 0.0F, 0.0F);
        this.setRotateAngle(HandR, -0.9F, 0.0F, 0.0F);
        this.setRotateAngle(UpperArmL, 0.0F, 0.0F, 0.0F);
        this.setRotateAngle(LowerArmL, 0.4F, 0.0F, 0.0F);
        this.setRotateAngle(HandL, -0.9F, 0.0F, 0.0F);
        this.setRotateAngle(Tail, 0.1F, 0.05F, 0.0F);
        this.setRotateAngle(Tail2, 0.0F, -0.15F, 0.0F);
        this.setRotateAngle(Tail3, 0.0F, -0.15F, 0.0F);
        this.setRotateAngle(UpperLegR, 0.0F, 0.0F, 0.0F);
        this.setRotateAngle(LowerLegR, -0.2F, -0.5F, 0.0F);
        this.setRotateAngle(FootR, 0.2F, 0.0F, 0.0F);
        this.setRotateAngle(UpperLegL, 0.0F, 0.0F, 0.0F);
        this.setRotateAngle(LowerLegL, -0.2F, 0.5F, 0.0F);
        this.setRotateAngle(FootL, 0.2F, 0.0F, 0.0F);
        this.Hips.offsetY = 0.35F;
        this.Hips.render(0.01F);
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


        EntityPrehistoricFloraHomoeosaurus ent = (EntityPrehistoricFloraHomoeosaurus) e;

        this.faceTarget(f3, f4, 8, Neck);
        this.faceTarget(f3, f4, 8, Head);

        AdvancedModelRenderer[] Tail = {this.Tail, this.Tail2, this.Tail3};
        AdvancedModelRenderer[] Torso = {this.Body, this.Neck};

        float speed = 0.85F;

        //EntityPrehistoricFloraentityCasineria entityCasineria = (EntityPrehistoricFloraentityCasineria) e;
        if (f3 == 0.0F || !ent.getIsMoving()) { //Not moving
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
        this.walk(LowerArmL, speed, -0.2F, true, 0, 0.0F, f2, 0.8F);
        ///this.flap(HandL, speed, 0.2F, false, -1.5F, 0.4F, f2, 0.3F);
        this.walk(HandL, speed, 0.1F, false, -1.5F, 0.4F, f2, 0.5F);
        this.swing(HandL, speed, 0.1F, false, -1.5F, 0F, f2, 0.5F);

        this.flap(UpperArmR, speed, -0.45F, false, -3, 0.18F, f2, 0.5F);
        this.swing(UpperArmR, speed, 0.75F, true, -1, -0.5F, f2, 0.5F);
        this.walk(LowerArmR, speed, -0.2F, true, -3, 0.0F, f2, 0.8F);
//        this.flap(frontrightLeg6, speed, -0.2F, false, 1.5F, -0.4F, f2, 0.3F);
        this.walk(HandR, speed, 0.1F, false, 1.5F, 0.4F, f2, 0.5F);
        this.swing(HandR, speed, -0.1F, false, 1.5F, 0F, f2, 0.5F);

        this.chainWave(Tail, speed, 0.1F, -3, f2, 1);
        this.chainSwing(Tail, speed * 0.8F, 0.18F, -2.4, f2, 0.8F);
        this.chainSwing(Torso, speed, 0.08F, -2, f2, 0.75F);

    }


    public void animate(IAnimatedEntity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        EntityPrehistoricFloraHomoeosaurus e = (EntityPrehistoricFloraHomoeosaurus) entity;
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
