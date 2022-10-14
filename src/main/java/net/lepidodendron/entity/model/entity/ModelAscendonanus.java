package net.lepidodendron.entity.model.entity;

import net.ilexiconn.llibrary.client.model.ModelAnimator;
import net.ilexiconn.llibrary.client.model.tools.AdvancedModelBase;
import net.ilexiconn.llibrary.client.model.tools.AdvancedModelRenderer;
import net.ilexiconn.llibrary.server.animation.IAnimatedEntity;
import net.lepidodendron.entity.EntityPrehistoricFloraAscendonanus;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.entity.Entity;

public class ModelAscendonanus extends AdvancedModelBase {
    private final AdvancedModelRenderer AscendonanusBase;
    private final AdvancedModelRenderer Body;
    private final AdvancedModelRenderer Body2;
    private final AdvancedModelRenderer LeftArm;
    private final AdvancedModelRenderer LeftArm2;
    private final AdvancedModelRenderer LeftArmHand;
    private final AdvancedModelRenderer LeftArm3;
    private final AdvancedModelRenderer LeftArm4;
    private final AdvancedModelRenderer LeftArmHand2;
    private final AdvancedModelRenderer Neck;
    private final AdvancedModelRenderer Head;
    private final AdvancedModelRenderer cube_r1;
    private final AdvancedModelRenderer cube_r2;
    private final AdvancedModelRenderer cube_r3;
    private final AdvancedModelRenderer Jaw;
    private final AdvancedModelRenderer cube_r4;
    private final AdvancedModelRenderer cube_r5;
    private final AdvancedModelRenderer cube_r6;
    private final AdvancedModelRenderer cube_r7;
    private final AdvancedModelRenderer Tail;
    private final AdvancedModelRenderer Tail2;
    private final AdvancedModelRenderer Tail3;
    private final AdvancedModelRenderer Tail4;
    private final AdvancedModelRenderer LeftLeg;
    private final AdvancedModelRenderer LeftLeg2;
    private final AdvancedModelRenderer LeftLegFoot;
    private final AdvancedModelRenderer LeftLeg5;
    private final AdvancedModelRenderer LeftLeg6;
    private final AdvancedModelRenderer LeftLegFoot3;
    private final AdvancedModelRenderer LeftLeg3;
    private final AdvancedModelRenderer LeftLeg4;
    private final AdvancedModelRenderer LeftLegFoot2;

    private ModelAnimator animator;

    public ModelAscendonanus() {
        this.textureWidth = 64;
        this.textureHeight = 64;

        this.AscendonanusBase = new AdvancedModelRenderer(this);
        this.AscendonanusBase.setRotationPoint(0.0F, 19.5F, 9.0F);
        this.setRotateAngle(AscendonanusBase, -0.0873F, 0.0F, 0.0F);
        this.AscendonanusBase.cubeList.add(new ModelBox(AscendonanusBase, 0, 35, -1.5F, -2.5F, -4.0F, 3, 4, 7, 0.0F, false));

        this.Body = new AdvancedModelRenderer(this);
        this.Body.setRotationPoint(0.0F, -0.5F, -4.0F);
        this.AscendonanusBase.addChild(Body);
        this.setRotateAngle(Body, 0.0436F, 0.0F, 0.0F);
        this.Body.cubeList.add(new ModelBox(Body, 0, 0, -2.0F, -2.0F, -13.0F, 4, 5, 14, 0.01F, false));

        this.Body2 = new AdvancedModelRenderer(this);
        this.Body2.setRotationPoint(0.0F, 0.5F, -12.0F);
        this.Body.addChild(Body2);
        this.setRotateAngle(Body2, -0.0436F, 0.0F, 0.0F);
        this.Body2.cubeList.add(new ModelBox(Body2, 37, 34, -1.5F, -2.5F, -6.0F, 3, 5, 6, 0.0F, false));

        this.LeftArm = new AdvancedModelRenderer(this);
        this.LeftArm.setRotationPoint(0.5F, 0.5F, -5.0F);
        this.Body2.addChild(LeftArm);
        this.setRotateAngle(LeftArm, -0.4055F, 0.7809F, 0.1078F);
        this.LeftArm.cubeList.add(new ModelBox(LeftArm, 0, 7, -1.0F, -1.0F, 0.0F, 2, 2, 4, 0.0F, false));

        this.LeftArm2 = new AdvancedModelRenderer(this);
        this.LeftArm2.setRotationPoint(0.0F, -1.0F, 4.0F);
        this.LeftArm.addChild(LeftArm2);
        this.setRotateAngle(LeftArm2, -1.0472F, 0.0F, 0.0F);
        this.LeftArm2.cubeList.add(new ModelBox(LeftArm2, 50, 33, -1.0F, 0.0F, 0.0F, 2, 2, 4, -0.01F, false));

        this.LeftArmHand = new AdvancedModelRenderer(this);
        this.LeftArmHand.setRotationPoint(0.0F, 1.0F, 3.99F);
        this.LeftArm2.addChild(LeftArmHand);
        this.setRotateAngle(LeftArmHand, 0.0F, 0.0F, 0.7418F);
        this.LeftArmHand.cubeList.add(new ModelBox(LeftArmHand, 43, 6, -1.0F, -2.0F, 0.0F, 5, 4, 0, 0.0F, false));

        this.LeftArm3 = new AdvancedModelRenderer(this);
        this.LeftArm3.setRotationPoint(-0.5F, 0.5F, -5.0F);
        this.Body2.addChild(LeftArm3);
        this.setRotateAngle(LeftArm3, -0.4055F, -0.7809F, -0.1078F);
        this.LeftArm3.cubeList.add(new ModelBox(LeftArm3, 0, 7, -1.0F, -1.0F, 0.0F, 2, 2, 4, 0.0F, true));

        this.LeftArm4 = new AdvancedModelRenderer(this);
        this.LeftArm4.setRotationPoint(0.0F, -1.0F, 4.0F);
        this.LeftArm3.addChild(LeftArm4);
        this.setRotateAngle(LeftArm4, -1.0472F, 0.0F, 0.0F);
        this.LeftArm4.cubeList.add(new ModelBox(LeftArm4, 50, 33, -1.0F, 0.0F, 0.0F, 2, 2, 4, -0.01F, true));

        this.LeftArmHand2 = new AdvancedModelRenderer(this);
        this.LeftArmHand2.setRotationPoint(0.0F, 1.0F, 3.99F);
        this.LeftArm4.addChild(LeftArmHand2);
        this.setRotateAngle(LeftArmHand2, 0.0F, 0.0F, -0.7418F);
        this.LeftArmHand2.cubeList.add(new ModelBox(LeftArmHand2, 43, 6, -4.0F, -2.0F, 0.0F, 5, 4, 0, 0.0F, true));

        this.Neck = new AdvancedModelRenderer(this);
        this.Neck.setRotationPoint(0.0F, 0.0F, -5.0F);
        this.Body2.addChild(Neck);
        this.setRotateAngle(Neck, -0.0436F, 0.0F, 0.0F);
        this.Neck.cubeList.add(new ModelBox(Neck, 21, 40, -1.0F, -2.5F, -5.0F, 2, 4, 5, -0.03F, false));

        this.Head = new AdvancedModelRenderer(this);
        this.Head.setRotationPoint(0.0F, -1.0F, -5.0F);
        this.Neck.addChild(Head);
        this.setRotateAngle(Head, 0.0873F, 0.0F, 0.0F);
        this.Head.cubeList.add(new ModelBox(Head, 0, 0, -1.0F, -1.5F, -2.0F, 2, 2, 3, 0.0F, false));
        this.Head.cubeList.add(new ModelBox(Head, 0, 47, -0.5F, -0.5F, -5.0F, 1, 1, 3, 0.0F, false));

        this.cube_r1 = new AdvancedModelRenderer(this);
        this.cube_r1.setRotationPoint(-1.0F, 0.0F, -2.0F);
        this.Head.addChild(cube_r1);
        this.setRotateAngle(cube_r1, 0.0F, -0.1676F, 0.0F);
        this.cube_r1.cubeList.add(new ModelBox(cube_r1, 16, 25, -0.01F, -0.5F, -3.0F, 1, 1, 3, -0.01F, true));

        this.cube_r2 = new AdvancedModelRenderer(this);
        this.cube_r2.setRotationPoint(1.0F, 0.0F, -2.0F);
        this.Head.addChild(cube_r2);
        this.setRotateAngle(cube_r2, 0.0F, 0.1676F, 0.0F);
        this.cube_r2.cubeList.add(new ModelBox(cube_r2, 16, 25, -0.99F, -0.5F, -3.0F, 1, 1, 3, -0.01F, false));

        this.cube_r3 = new AdvancedModelRenderer(this);
        this.cube_r3.setRotationPoint(0.0F, -1.5F, -2.0F);
        this.Head.addChild(cube_r3);
        this.setRotateAngle(cube_r3, 0.3438F, 0.0F, 0.0F);
        this.cube_r3.cubeList.add(new ModelBox(cube_r3, 45, 46, -0.5F, 0.0F, -3.0F, 1, 1, 3, 0.0F, false));

        this.Jaw = new AdvancedModelRenderer(this);
        this.Jaw.setRotationPoint(0.0F, 0.5F, 1.0F);
        this.Head.addChild(Jaw);
        this.setRotateAngle(Jaw, -0.0436F, 0.0F, 0.0F);
        this.Jaw.cubeList.add(new ModelBox(Jaw, 23, 0, -1.0F, -0.01F, -2.99F, 2, 1, 3, -0.01F, false));
        this.Jaw.cubeList.add(new ModelBox(Jaw, 9, 47, -0.5F, 0.0F, -5.96F, 1, 1, 3, -0.01F, false));

        this.cube_r4 = new AdvancedModelRenderer(this);
        this.cube_r4.setRotationPoint(0.0F, 0.0F, -2.0F);
        this.Jaw.addChild(cube_r4);
        this.setRotateAngle(cube_r4, -0.4538F, 0.0F, 0.0F);
        this.cube_r4.cubeList.add(new ModelBox(cube_r4, 36, 46, -1.0F, -2.0F, 0.0F, 2, 2, 2, -0.02F, false));

        this.cube_r5 = new AdvancedModelRenderer(this);
        this.cube_r5.setRotationPoint(0.0F, 1.0F, -3.0F);
        this.Jaw.addChild(cube_r5);
        this.setRotateAngle(cube_r5, -0.3613F, 0.0F, 0.0F);
        this.cube_r5.cubeList.add(new ModelBox(cube_r5, 16, 20, -1.0F, -1.0F, 0.0F, 2, 1, 3, -0.04F, false));

        this.cube_r6 = new AdvancedModelRenderer(this);
        this.cube_r6.setRotationPoint(-1.0F, 0.0F, -2.96F);
        this.Jaw.addChild(cube_r6);
        this.setRotateAngle(cube_r6, 0.0F, -0.1676F, 0.0F);
        this.cube_r6.cubeList.add(new ModelBox(cube_r6, 23, 5, -0.01F, 0.0F, -3.0F, 1, 1, 3, -0.02F, true));

        this.cube_r7 = new AdvancedModelRenderer(this);
        this.cube_r7.setRotationPoint(1.0F, 0.0F, -2.96F);
        this.Jaw.addChild(cube_r7);
        this.setRotateAngle(cube_r7, 0.0F, 0.1676F, 0.0F);
        this.cube_r7.cubeList.add(new ModelBox(cube_r7, 23, 5, -0.99F, 0.0F, -3.0F, 1, 1, 3, -0.02F, false));

        this.Tail = new AdvancedModelRenderer(this);
        this.Tail.setRotationPoint(0.0F, -0.5F, 2.0F);
        this.AscendonanusBase.addChild(Tail);
        this.setRotateAngle(Tail, -0.0873F, 0.0F, 0.0F);
        this.Tail.cubeList.add(new ModelBox(Tail, 18, 26, -1.5F, -2.0F, 0.0F, 3, 4, 9, -0.01F, false));

        this.Tail2 = new AdvancedModelRenderer(this);
        this.Tail2.setRotationPoint(0.0F, 0.0F, 8.0F);
        this.Tail.addChild(Tail2);
        this.setRotateAngle(Tail2, 0.0436F, 0.0F, 0.0F);
        this.Tail2.cubeList.add(new ModelBox(Tail2, 0, 20, -1.0F, -1.5F, 0.0F, 2, 3, 11, 0.0F, false));

        this.Tail3 = new AdvancedModelRenderer(this);
        this.Tail3.setRotationPoint(0.0F, 0.0F, 10.0F);
        this.Tail2.addChild(Tail3);
        this.setRotateAngle(Tail3, 0.0873F, 0.0F, 0.0F);
        this.Tail3.cubeList.add(new ModelBox(Tail3, 28, 14, -1.0F, -1.0F, 0.0F, 2, 2, 9, -0.01F, false));

        this.Tail4 = new AdvancedModelRenderer(this);
        this.Tail4.setRotationPoint(0.0F, 0.0F, 8.5F);
        this.Tail3.addChild(Tail4);
        this.setRotateAngle(Tail4, -0.0436F, 0.0F, 0.0F);
        this.Tail4.cubeList.add(new ModelBox(Tail4, 23, 0, -0.5F, -0.5F, 0.0F, 1, 1, 12, 0.0F, false));

        this.LeftLeg = new AdvancedModelRenderer(this);
        this.LeftLeg.setRotationPoint(0.5F, -0.5F, 0.0F);
        this.AscendonanusBase.addChild(LeftLeg);
        this.setRotateAngle(LeftLeg, -0.1358F, 0.5355F, 0.6845F);
        this.LeftLeg.cubeList.add(new ModelBox(LeftLeg, 42, 14, 0.0F, -1.0F, -2.0F, 5, 2, 4, 0.0F, false));

        this.LeftLeg2 = new AdvancedModelRenderer(this);
        this.LeftLeg2.setRotationPoint(5.0F, 0.0F, -1.5F);
        this.LeftLeg.addChild(LeftLeg2);
        this.setRotateAngle(LeftLeg2, 0.0F, -1.309F, 0.0F);
        this.LeftLeg2.cubeList.add(new ModelBox(LeftLeg2, 38, 0, 0.0F, -1.0F, 0.0F, 7, 2, 3, -0.01F, false));

        this.LeftLegFoot = new AdvancedModelRenderer(this);
        this.LeftLegFoot.setRotationPoint(6.0F, 0.0F, 1.5F);
        this.LeftLeg2.addChild(LeftLegFoot);
        this.setRotateAngle(LeftLegFoot, -0.7533F, 1.0427F, -1.404F);
        this.LeftLegFoot.cubeList.add(new ModelBox(LeftLegFoot, 34, 26, 0.0F, 0.0F, -2.0F, 8, 0, 5, 0.0F, false));

        this.LeftLeg5 = new AdvancedModelRenderer(this);
        this.LeftLeg5.setRotationPoint(-0.5F, -0.5F, 0.0F);
        this.AscendonanusBase.addChild(LeftLeg5);
        this.setRotateAngle(LeftLeg5, -0.1358F, -0.5355F, -0.6845F);
        this.LeftLeg5.cubeList.add(new ModelBox(LeftLeg5, 42, 14, -5.0F, -1.0F, -2.0F, 5, 2, 4, 0.0F, true));

        this.LeftLeg6 = new AdvancedModelRenderer(this);
        this.LeftLeg6.setRotationPoint(-5.0F, 0.0F, -1.5F);
        this.LeftLeg5.addChild(LeftLeg6);
        this.setRotateAngle(LeftLeg6, 0.0F, 1.309F, 0.0F);
        this.LeftLeg6.cubeList.add(new ModelBox(LeftLeg6, 38, 0, -7.0F, -1.0F, 0.0F, 7, 2, 3, -0.01F, true));

        this.LeftLegFoot3 = new AdvancedModelRenderer(this);
        this.LeftLegFoot3.setRotationPoint(-6.0F, 0.0F, 1.5F);
        this.LeftLeg6.addChild(LeftLegFoot3);
        this.setRotateAngle(LeftLegFoot3, -0.7533F, -1.0427F, 1.404F);
        this.LeftLegFoot3.cubeList.add(new ModelBox(LeftLegFoot3, 34, 26, -8.0F, 0.0F, -2.0F, 8, 0, 5, 0.0F, true));

        this.LeftLeg3 = new AdvancedModelRenderer(this);
        this.LeftLeg3.setRotationPoint(-0.5F, -0.5F, 0.0F);
        this.AscendonanusBase.addChild(LeftLeg3);
        this.setRotateAngle(LeftLeg3, -0.1358F, -0.5355F, -0.6845F);


        this.LeftLeg4 = new AdvancedModelRenderer(this);
        this.LeftLeg4.setRotationPoint(-5.0F, 0.0F, -1.5F);
        this.LeftLeg3.addChild(LeftLeg4);
        this.setRotateAngle(LeftLeg4, 0.0F, 1.309F, 0.0F);


        this.LeftLegFoot2 = new AdvancedModelRenderer(this);
        this.LeftLegFoot2.setRotationPoint(-6.0F, 0.0F, 1.5F);
        this.LeftLeg4.addChild(LeftLegFoot2);
        this.setRotateAngle(LeftLegFoot2, -0.7533F, -1.0427F, 1.404F);

        updateDefaultPose();
        animator = ModelAnimator.create();
    }

    @Override
    public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        animate((IAnimatedEntity) entity, f, f1, f2, f3, f4, f5);
        this.AscendonanusBase.render(f5 * 0.085f);
    }
    
    public void renderStatic(float f) {
        //GlStateManager.pushMatrix();
        GlStateManager.enableBlend();
        GlStateManager.blendFunc(GlStateManager.SourceFactor.SRC_ALPHA, GlStateManager.DestFactor.ONE_MINUS_SRC_ALPHA);
        GlStateManager.disableCull();
        this.AscendonanusBase.offsetZ = -0.7F;
        this.AscendonanusBase.render(0.1F);
        GlStateManager.enableCull();
        GlStateManager.disableBlend();
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
        this.AscendonanusBase.offsetY = 1.36F;

        EntityPrehistoricFloraAscendonanus entityAscendonanus = (EntityPrehistoricFloraAscendonanus) e;

        this.faceTarget(f3, f4, 8, Neck);
        this.faceTarget(f3, f4, 8, Head);

        AdvancedModelRenderer[] Tail = {this.Tail, this.Tail2, this.Tail3, this.Tail4};
        AdvancedModelRenderer[] Torso = {this.Body2, this.Body, this.AscendonanusBase};

        float speed = 0.95F;

        //EntityPrehistoricFloraentityAscendonanus entityAscendonanus = (EntityPrehistoricFloraentityAscendonanus) e;
        if (f3 == 0.0F || !entityAscendonanus.getIsMoving()) { //Not moving
            this.chainWave(Tail, speed * 0.23F, 0.015F, -1.5, f2, 1);
            this.chainSwing(Tail, speed * 0.1F, 0.05F, -1.8, f2, 0.8F);
            return;
        }

        this.flap(LeftLeg, speed, 0.45F, false, -3, -0.35F, f2, 0.5F);
        this.swing(LeftLeg, speed, -0.9F, true, -1, 1F, f2, 0.5F);
        this.walk(LeftLeg2, speed, -0.6F, true, -3, 0.0F, f2, 0.8F);
        this.flap(LeftLeg2, speed, -0.5F, true, 0, 0.25F, f2, 0.8F);
        this.flap(LeftLegFoot, speed, 0.2F, false, 3, -0.1F, f2, 0.3F);
        this.walk(LeftLegFoot, speed, 0.2F, false, 3, 0.4F, f2, 0.5F);
        this.swing(LeftLegFoot, speed, 0.2F, false, 3, 0F, f2, 0.5F);

        this.flap(LeftLeg5, speed, -0.45F, false, 0, 0.35F, f2, 0.5F);
        this.swing(LeftLeg5, speed, 0.9F, true, 2, -1F, f2, 0.5F);
        this.walk(LeftLeg6, speed, -0.6F, true, 0, 0.0F, f2, 0.8F);
        this.flap(LeftLeg6, speed, 0.5F, true, 3, -0.25F, f2, 0.8F);
        this.flap(LeftLegFoot3, speed, -0.2F, false, 6, 0.1F, f2, 0.3F);
        this.walk(LeftLegFoot3, speed, 0.2F, false, 6, 0.4F, f2, 0.5F);
        this.swing(LeftLegFoot3, speed, -0.2F, false, 6, 0F, f2, 0.5F);

        this.flap(LeftArm, speed, 0.45F, false, 0, -0.18F, f2, 0.5F);
        this.swing(LeftArm, speed, -0.75F, true, 2, 0.5F, f2, 0.5F);
        this.walk(LeftArm2, speed, -0.5F, true, 0, 0.0F, f2, 0.8F);
        this.flap(LeftArmHand, speed, 0.2F, false, -1.5F, 0.4F, f2, 0.3F);
        this.walk(LeftArmHand, speed, 0.2F, false, -1.5F, 0.4F, f2, 0.5F);
        this.swing(LeftArmHand, speed, 0.2F, false, -1.5F, 0F, f2, 0.5F);

        this.flap(LeftArm3, speed, -0.45F, false, -3, 0.18F, f2, 0.5F);
        this.swing(LeftArm3, speed, 0.75F, true, -1, -0.5F, f2, 0.5F);
        this.walk(LeftArm4, speed, -0.5F, true, -3, 0.0F, f2, 0.8F);
        this.flap(LeftArmHand2, speed, -0.2F, false, 1.5F, -0.4F, f2, 0.3F);
        this.walk(LeftArmHand2, speed, 0.2F, false, 1.5F, 0.4F, f2, 0.5F);
        this.swing(LeftArmHand2, speed, -0.2F, false, 1.5F, 0F, f2, 0.5F);

        this.chainWave(Tail, speed, 0.1F, -3, f2, 1);
        this.chainSwing(Tail, speed * 0.8F, 0.18F, -2.4, f2, 0.8F);
        this.chainSwing(Torso, speed, 0.08F, -2, f2, 0.75F);

    }


    public void animate(IAnimatedEntity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        EntityPrehistoricFloraAscendonanus e = (EntityPrehistoricFloraAscendonanus) entity;
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
