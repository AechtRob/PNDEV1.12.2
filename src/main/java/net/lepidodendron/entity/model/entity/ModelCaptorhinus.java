package net.lepidodendron.entity.model.entity;

import net.ilexiconn.llibrary.client.model.ModelAnimator;
import net.ilexiconn.llibrary.client.model.tools.AdvancedModelRenderer;
import net.ilexiconn.llibrary.server.animation.IAnimatedEntity;
import net.lepidodendron.entity.EntityPrehistoricFloraCaptorhinus;
import net.lepidodendron.entity.model.ModelBasePalaeopedia;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

public class ModelCaptorhinus extends ModelBasePalaeopedia {
    private final AdvancedModelRenderer Captorhinus;
    private final AdvancedModelRenderer LArm;
    private final AdvancedModelRenderer LArm2;
    private final AdvancedModelRenderer LHand;
    private final AdvancedModelRenderer RArm;
    private final AdvancedModelRenderer RArm2;
    private final AdvancedModelRenderer RHand;
    private final AdvancedModelRenderer Neck;
    private final AdvancedModelRenderer Head;
    private final AdvancedModelRenderer cube_r1;
    private final AdvancedModelRenderer cube_r2;
    private final AdvancedModelRenderer Jaw;
    private final AdvancedModelRenderer cube_r3;
    private final AdvancedModelRenderer cube_r4;
    private final AdvancedModelRenderer cube_r5;
    private final AdvancedModelRenderer Body;
    private final AdvancedModelRenderer Body2;
    private final AdvancedModelRenderer LLeg;
    private final AdvancedModelRenderer LLeg2;
    private final AdvancedModelRenderer LFoot;
    private final AdvancedModelRenderer RLeg;
    private final AdvancedModelRenderer RLeg2;
    private final AdvancedModelRenderer RFoot;
    private final AdvancedModelRenderer Tail;
    private final AdvancedModelRenderer Tail2;
    private final AdvancedModelRenderer Tail3;

    private ModelAnimator animator;

    public ModelCaptorhinus() {
        this.textureWidth = 64;
        this.textureHeight = 64;

        this.Captorhinus = new AdvancedModelRenderer(this);
        this.Captorhinus.setRotationPoint(0.0F, 18.8F, -4.0F);
        this.Captorhinus.cubeList.add(new ModelBox(Captorhinus, 19, 29, -2.0F, -2.0F, -1.0F, 4, 5, 4, 0.0F, false));

        this.LArm = new AdvancedModelRenderer(this);
        this.LArm.setRotationPoint(2.0F, 1.0F, 0.0F);
        this.Captorhinus.addChild(LArm);
        this.setRotateAngle(LArm, 1.3123F, 1.1773F, -0.0481F);
        this.LArm.cubeList.add(new ModelBox(LArm, 43, 18, -1.0F, -1.0F, -1.0F, 2, 3, 2, -0.01F, false));

        this.LArm2 = new AdvancedModelRenderer(this);
        this.LArm2.setRotationPoint(0.0F, 1.0F, 0.0F);
        this.LArm.addChild(LArm2);
        this.setRotateAngle(LArm2, -1.3526F, 0.0F, 0.0F);
        this.LArm2.cubeList.add(new ModelBox(LArm2, 9, 45, -1.0F, 0.0F, -1.0F, 2, 4, 2, -0.02F, false));

        this.LHand = new AdvancedModelRenderer(this);
        this.LHand.setRotationPoint(0.0F, 4.0F, 0.0F);
        this.LArm2.addChild(LHand);
        this.setRotateAngle(LHand, 0.0F, -1.4835F, 0.0F);
        this.LHand.cubeList.add(new ModelBox(LHand, 30, 20, -2.0F, 0.0F, -4.0F, 4, 0, 4, 0.0F, false));

        this.RArm = new AdvancedModelRenderer(this);
        this.RArm.setRotationPoint(-2.0F, 1.0F, 0.0F);
        this.Captorhinus.addChild(RArm);
        this.setRotateAngle(RArm, 1.3123F, -1.1773F, 0.0481F);
        this.RArm.cubeList.add(new ModelBox(RArm, 43, 18, -1.0F, -1.0F, -1.0F, 2, 3, 2, -0.01F, true));

        this.RArm2 = new AdvancedModelRenderer(this);
        this.RArm2.setRotationPoint(0.0F, 1.0F, 0.0F);
        this.RArm.addChild(RArm2);
        this.setRotateAngle(RArm2, -1.3526F, 0.0F, 0.0F);
        this.RArm2.cubeList.add(new ModelBox(RArm2, 9, 45, -1.0F, 0.0F, -1.0F, 2, 4, 2, -0.02F, true));

        this.RHand = new AdvancedModelRenderer(this);
        this.RHand.setRotationPoint(0.0F, 4.0F, 0.0F);
        this.RArm2.addChild(RHand);
        this.setRotateAngle(RHand, 0.0F, 1.4835F, 0.0F);
        this.RHand.cubeList.add(new ModelBox(RHand, 30, 20, -2.0F, 0.0F, -4.0F, 4, 0, 4, 0.0F, true));

        this.Neck = new AdvancedModelRenderer(this);
        this.Neck.setRotationPoint(0.0F, -0.5F, 0.0F);
        this.Captorhinus.addChild(Neck);
        this.setRotateAngle(Neck, -0.0873F, 0.0F, 0.0F);
        this.Neck.cubeList.add(new ModelBox(Neck, 30, 11, -1.5F, -1.5F, -4.0F, 3, 4, 4, -0.02F, false));

        this.Head = new AdvancedModelRenderer(this);
        this.Head.setRotationPoint(0.0F, 0.5F, -4.0F);
        this.Neck.addChild(Head);
        this.setRotateAngle(Head, 0.1309F, 0.0F, 0.0F);
        this.Head.cubeList.add(new ModelBox(Head, 0, 13, -0.5F, -0.5F, -5.0F, 1, 1, 1, -0.01F, false));
        this.Head.cubeList.add(new ModelBox(Head, 35, 25, -1.0F, -2.0F, -5.0F, 2, 2, 4, 0.0F, false));
        this.Head.cubeList.add(new ModelBox(Head, 41, 7, -2.0F, -2.0F, -1.0F, 4, 2, 2, 0.0F, false));

        this.cube_r1 = new AdvancedModelRenderer(this);
        this.cube_r1.setRotationPoint(-2.0F, 0.0F, -1.0F);
        this.Head.addChild(cube_r1);
        this.setRotateAngle(cube_r1, 0.0F, -0.2531F, 0.0F);
        this.cube_r1.cubeList.add(new ModelBox(cube_r1, 9, 38, 0.0F, -2.0F, -4.0F, 1, 2, 4, -0.01F, false));
        this.cube_r1.cubeList.add(new ModelBox(cube_r1, 5, 7, 0.0F, -1.5F, -1.5F, 1, 1, 1, 0.0F, false));

        this.cube_r2 = new AdvancedModelRenderer(this);
        this.cube_r2.setRotationPoint(2.0F, 0.0F, -1.0F);
        this.Head.addChild(cube_r2);
        this.setRotateAngle(cube_r2, 0.0F, 0.2531F, 0.0F);
        this.cube_r2.cubeList.add(new ModelBox(cube_r2, 0, 7, -1.0F, -1.5F, -1.5F, 1, 1, 1, 0.0F, true));
        this.cube_r2.cubeList.add(new ModelBox(cube_r2, 9, 38, -1.0F, -2.0F, -4.0F, 1, 2, 4, -0.01F, true));

        this.Jaw = new AdvancedModelRenderer(this);
        this.Jaw.setRotationPoint(0.0F, 0.0F, 1.0F);
        this.Head.addChild(Jaw);
        this.Jaw.cubeList.add(new ModelBox(Jaw, 38, 41, -2.0F, 0.0F, -2.0F, 4, 1, 2, 0.0F, false));
        this.Jaw.cubeList.add(new ModelBox(Jaw, 43, 0, -1.0F, 0.0F, -6.0F, 2, 1, 3, 0.0F, false));
        this.Jaw.cubeList.add(new ModelBox(Jaw, 0, 36, -1.5F, -1.99F, -3.0F, 3, 2, 3, -0.01F, false));

        this.cube_r3 = new AdvancedModelRenderer(this);
        this.cube_r3.setRotationPoint(0.0F, 2.0F, 0.0F);
        this.Jaw.addChild(cube_r3);
        this.setRotateAngle(cube_r3, -0.2443F, 0.0F, 0.0F);
        this.cube_r3.cubeList.add(new ModelBox(cube_r3, 32, 35, -1.0F, -1.0F, -4.0F, 2, 1, 4, -0.03F, false));

        this.cube_r4 = new AdvancedModelRenderer(this);
        this.cube_r4.setRotationPoint(-2.0F, 0.0F, -2.0F);
        this.Jaw.addChild(cube_r4);
        this.setRotateAngle(cube_r4, 0.0F, -0.2531F, 0.0F);
        this.cube_r4.cubeList.add(new ModelBox(cube_r4, 41, 32, 0.0F, 0.0F, -4.0F, 1, 1, 4, -0.01F, true));

        this.cube_r5 = new AdvancedModelRenderer(this);
        this.cube_r5.setRotationPoint(2.0F, 0.0F, -2.0F);
        this.Jaw.addChild(cube_r5);
        this.setRotateAngle(cube_r5, 0.0F, 0.2531F, 0.0F);
        this.cube_r5.cubeList.add(new ModelBox(cube_r5, 41, 32, -1.0F, 0.0F, -4.0F, 1, 1, 4, -0.01F, false));

        this.Body = new AdvancedModelRenderer(this);
        this.Body.setRotationPoint(0.0F, 0.0F, 3.0F);
        this.Captorhinus.addChild(Body);
        this.setRotateAngle(Body, -0.0436F, 0.0F, 0.0F);
        this.Body.cubeList.add(new ModelBox(Body, 0, 13, -2.5F, -2.0F, -1.0F, 5, 5, 7, 0.01F, false));

        this.Body2 = new AdvancedModelRenderer(this);
        this.Body2.setRotationPoint(0.0F, -0.5F, 5.0F);
        this.Body.addChild(Body2);
        this.setRotateAngle(Body2, -0.0873F, 0.0F, 0.0F);
        this.Body2.cubeList.add(new ModelBox(Body2, 0, 26, -2.0F, -1.5F, 0.0F, 4, 4, 5, 0.0F, false));

        this.LLeg = new AdvancedModelRenderer(this);
        this.LLeg.setRotationPoint(2.0F, 0.0F, 3.0F);
        this.Body2.addChild(LLeg);
        this.setRotateAngle(LLeg, -0.5427F, -0.806F, -0.1597F);
        this.LLeg.cubeList.add(new ModelBox(LLeg, 20, 39, -0.5F, -0.5F, -1.5F, 2, 3, 3, 0.0F, false));

        this.LLeg2 = new AdvancedModelRenderer(this);
        this.LLeg2.setRotationPoint(0.5F, 1.5F, 0.0F);
        this.LLeg.addChild(LLeg2);
        this.setRotateAngle(LLeg2, 0.7418F, 0.0F, 0.0F);
        this.LLeg2.cubeList.add(new ModelBox(LLeg2, 0, 42, -1.0F, 0.0F, -1.5F, 2, 4, 2, -0.01F, false));

        this.LFoot = new AdvancedModelRenderer(this);
        this.LFoot.setRotationPoint(0.0F, 4.0F, -0.5F);
        this.LLeg2.addChild(LFoot);
        this.LFoot.cubeList.add(new ModelBox(LFoot, 28, 0, -2.0F, 0.0F, -6.0F, 4, 0, 6, 0.0F, false));

        this.RLeg = new AdvancedModelRenderer(this);
        this.RLeg.setRotationPoint(-2.0F, 0.0F, 3.0F);
        this.Body2.addChild(RLeg);
        this.setRotateAngle(RLeg, -0.5427F, 0.806F, 0.1597F);
        this.RLeg.cubeList.add(new ModelBox(RLeg, 20, 39, -1.5F, -0.5F, -1.5F, 2, 3, 3, 0.0F, true));

        this.RLeg2 = new AdvancedModelRenderer(this);
        this.RLeg2.setRotationPoint(-0.5F, 1.5F, 0.0F);
        this.RLeg.addChild(RLeg2);
        this.setRotateAngle(RLeg2, 0.7418F, 0.0F, 0.0F);
        this.RLeg2.cubeList.add(new ModelBox(RLeg2, 0, 42, -1.0F, 0.0F, -1.5F, 2, 4, 2, -0.01F, true));

        this.RFoot = new AdvancedModelRenderer(this);
        this.RFoot.setRotationPoint(0.0F, 4.0F, -0.5F);
        this.RLeg2.addChild(RFoot);
        this.RFoot.cubeList.add(new ModelBox(RFoot, 28, 0, -2.0F, 0.0F, -6.0F, 4, 0, 6, 0.0F, true));

        this.Tail = new AdvancedModelRenderer(this);
        this.Tail.setRotationPoint(0.0F, 0.0F, 4.0F);
        this.Body2.addChild(Tail);
        this.setRotateAngle(Tail, -0.1309F, 0.0F, 0.0F);
        this.Tail.cubeList.add(new ModelBox(Tail, 14, 0, -1.5F, -1.5F, 0.0F, 3, 3, 7, -0.01F, false));

        this.Tail2 = new AdvancedModelRenderer(this);
        this.Tail2.setRotationPoint(0.0F, 0.0F, 6.0F);
        this.Tail.addChild(Tail2);
        this.setRotateAngle(Tail2, 0.0436F, 0.0F, 0.0F);
        this.Tail2.cubeList.add(new ModelBox(Tail2, 16, 17, -1.0F, -1.0F, 0.0F, 2, 2, 9, 0.0F, false));

        this.Tail3 = new AdvancedModelRenderer(this);
        this.Tail3.setRotationPoint(0.0F, 0.0F, 8.5F);
        this.Tail2.addChild(Tail3);
        this.setRotateAngle(Tail3, 0.1309F, 0.0F, 0.0F);
        this.Tail3.cubeList.add(new ModelBox(Tail3, 0, 0, -0.5F, -0.5F, 0.0F, 1, 1, 11, 0.0F, false));

        updateDefaultPose();
        animator = ModelAnimator.create();
    }

    @Override
    public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        animate((IAnimatedEntity) entity, f, f1, f2, f3, f4, f5);
        this.Captorhinus.render(f5 * 0.2f);
    }

    public void renderStatic(float f) {
        //GlStateManager.pushMatrix();
        //GlStateManager.enableBlend();
        //GlStateManager.blendFunc(GlStateManager.SourceFactor.SRC_ALPHA, GlStateManager.DestFactor.ONE_MINUS_SRC_ALPHA);
        //GlStateManager.disableCull();
        this.Captorhinus.offsetZ = -0.7F;
        this.setRotateAngle(LArm, 1.2436F, 1.2609F, -0.1212F);
        this.setRotateAngle(LArm2, -1.3391F, -0.3405F, -0.0786F);
        this.setRotateAngle(LHand, 0.3491F, -1.4835F, 0.0F);
        this.setRotateAngle(RArm, 1.3123F, -1.1773F, 0.0481F);
        this.setRotateAngle(RArm2, -1.3526F, 0.0F, 0.0F);
        this.setRotateAngle(RHand, 0.0F, 1.4835F, 0.0F);
        this.setRotateAngle(Neck, -0.0873F, 0.0F, 0.0F);
        this.setRotateAngle(Head, -0.1145F, -0.4755F, -0.0678F);
        this.setRotateAngle(cube_r1, 0.0F, -0.2531F, 0.0F);
        this.setRotateAngle(cube_r2, 0.0F, 0.2531F, 0.0F);
        this.setRotateAngle(Jaw, 0.1745F, 0.0F, 0.0F);
        this.setRotateAngle(cube_r3, -0.2443F, 0.0F, 0.0F);
        this.setRotateAngle(cube_r4, 0.0F, -0.2531F, 0.0F);
        this.setRotateAngle(cube_r5, 0.0F, 0.2531F, 0.0F);
        this.setRotateAngle(Body, -0.0457F, 0.3051F, -0.0138F);
        this.setRotateAngle(Body2, -0.0886F, -0.1739F, 0.0154F);
        this.setRotateAngle(LLeg, -0.5427F, -0.806F, -0.1597F);
        this.setRotateAngle(LLeg2, 0.7418F, 0.0F, 0.0F);
        this.setRotateAngle(RLeg, 1.3793F, 1.3762F, 2.3745F);
        this.setRotateAngle(RLeg2, 0.7418F, 0.0F, 0.0F);
        this.setRotateAngle(RFoot, 0.2618F, 0.0F, 0.0F);
        this.setRotateAngle(Tail, -0.1372F, -0.3027F, 0.0411F);
        this.setRotateAngle(Tail2, 0.0481F, -0.4359F, -0.0203F);
        this.setRotateAngle(Tail3, 0.1473F, -0.4755F, -0.0678F);
        this.Captorhinus.render(0.1F);
        //GlStateManager.enableCull();
        //GlStateManager.disableBlend();
        //GlStateManager.popMatrix();
    }

    @Override
    public void renderStaticBook(float f) {
        //Rotations, positions and sizing:
        this.Captorhinus.offsetY = 0.0F;
        this.Captorhinus.offsetX = 0.2F;
        this.Captorhinus.offsetZ = 0.8F;
        this.Captorhinus.rotateAngleY = (float)Math.toRadians(202);
        this.Captorhinus.rotateAngleX = (float)Math.toRadians(32);
        this.Captorhinus.rotateAngleZ = (float)Math.toRadians(-12);
        this.Captorhinus.scaleChildren = true;
        float scaler = 0.6F;
        this.Captorhinus.setScale(scaler, scaler, scaler);
        //Start of pose:
        this.setRotateAngle(Captorhinus, 0.6F, 3.8F, -0.2F);
        this.setRotateAngle(LArm, 1.2436F, 1.2609F, -0.1212F);
        this.setRotateAngle(LArm2, -1.3391F, -0.3405F, -0.0786F);
        this.setRotateAngle(LHand, 0.3491F, -1.4835F, 0.0F);
        this.setRotateAngle(RArm, 1.3123F, -1.1773F, 0.0481F);
        this.setRotateAngle(RArm2, -1.3526F, 0.0F, 0.0F);
        this.setRotateAngle(RHand, 0.0F, 1.4835F, 0.0F);
        this.setRotateAngle(Neck, -0.0873F, 0.0F, 0.0F);
        this.setRotateAngle(Head, -0.1145F, -0.4755F, -0.0678F);
        this.setRotateAngle(cube_r1, 0.0F, -0.2531F, 0.0F);
        this.setRotateAngle(cube_r2, 0.0F, 0.2531F, 0.0F);
        this.setRotateAngle(Jaw, 0.1745F, 0.0F, 0.0F);
        this.setRotateAngle(cube_r3, -0.2443F, 0.0F, 0.0F);
        this.setRotateAngle(cube_r4, 0.0F, -0.2531F, 0.0F);
        this.setRotateAngle(cube_r5, 0.0F, 0.2531F, 0.0F);
        this.setRotateAngle(Body, -0.0457F, 0.3051F, -0.0138F);
        this.setRotateAngle(Body2, -0.0886F, -0.1739F, 0.0154F);
        this.setRotateAngle(LLeg, -0.5427F, -0.806F, -0.1597F);
        this.setRotateAngle(LLeg2, 0.7418F, 0.0F, 0.0F);
        this.setRotateAngle(RLeg, 1.3793F, 1.3762F, 2.3745F);
        this.setRotateAngle(RLeg2, 0.7418F, 0.0F, 0.0F);
        this.setRotateAngle(RFoot, 0.2618F, 0.0F, 0.0F);
        this.setRotateAngle(Tail, -0.1372F, -0.3027F, 0.0411F);
        this.setRotateAngle(Tail2, 0.0481F, -0.4359F, -0.0203F);
        this.setRotateAngle(Tail3, 0.1473F, -0.4755F, -0.0678F);
        //End of pose, now render the model:
        this.Captorhinus.render(f);
        //Reset rotations, positions and sizing:
        this.Captorhinus.setScale(1.0F, 1.0F, 1.0F);
        this.Captorhinus.scaleChildren = false;
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
        this.Captorhinus.offsetY = 1.20F;

        EntityPrehistoricFloraCaptorhinus entityCaptorhinus = (EntityPrehistoricFloraCaptorhinus) e;

        this.faceTarget(f3, f4, 8, Neck);
        this.faceTarget(f3, f4, 8, Head);

        AdvancedModelRenderer[] Tail = {this.Tail, this.Tail2, this.Tail3};
        AdvancedModelRenderer[] Torso = {this.Captorhinus, this.Body, this.Body2};

        entityCaptorhinus.tailBuffer.applyChainSwingBuffer(Tail);
        float speed = 0.95F;

        //EntityPrehistoricFloraentityCaptorhinus entityCaptorhinus = (EntityPrehistoricFloraentityCaptorhinus) e;
        if (f3 == 0.0F || !entityCaptorhinus.getIsMoving()) { //Not moving
            this.chainWave(Tail, speed * 0.23F, 0.015F, -1.5, f2, 1);
            this.chainSwing(Tail, speed * 0.1F, 0.05F, -1.8, f2, 0.8F);
            return;
        }

        this.flap(LLeg, speed, 0.45F, false, -3, -0.35F, f2, 0.5F);
        this.swing(LLeg, speed, -0.8F, true, -1, 1F, f2, 0.5F);
        this.walk(LLeg2, speed, -0.6F, true, -3, 0.0F, f2, 0.8F);
        this.flap(LLeg2, speed, -0.5F, true, 0, 0.25F, f2, 0.8F);
        this.flap(LFoot, speed, 0.2F, false, 3, -0.1F, f2, 0.3F);
        this.walk(LFoot, speed, 0.2F, false, 3, 0.4F, f2, 0.5F);
        this.swing(LFoot, speed, 0.2F, false, 3, 0F, f2, 0.5F);

        this.flap(RLeg, speed, -0.45F, false, 0, 0.35F, f2, 0.5F);
        this.swing(RLeg, speed, 0.8F, true, 2, -1F, f2, 0.5F);
        this.walk(RLeg2, speed, -0.6F, true, 0, 0.0F, f2, 0.8F);
        this.flap(RLeg2, speed, 0.5F, true, 3, -0.25F, f2, 0.8F);
        this.flap(RFoot, speed, -0.2F, false, 6, 0.1F, f2, 0.3F);
        this.walk(RFoot, speed, 0.2F, false, 6, 0.4F, f2, 0.5F);
        this.swing(RFoot, speed, -0.2F, false, 6, 0F, f2, 0.5F);

        this.flap(LArm, speed, 0.45F, false, 0, -0.18F, f2, 0.5F);
        this.swing(LArm, speed, -0.95F, true, 2, 0.5F, f2, 0.5F);
        this.walk(LArm2, speed, -0.5F, true, 0, 0.0F, f2, 0.8F);
        this.flap(LHand, speed, 0.2F, false, -1.5F, 0.4F, f2, 0.3F);
        this.walk(LHand, speed, 0.2F, false, -1.5F, 0.4F, f2, 0.5F);
        this.swing(LHand, speed, 0.2F, false, -1.5F, 0F, f2, 0.5F);

        this.flap(RArm, speed, -0.45F, false, -3, 0.18F, f2, 0.5F);
        this.swing(RArm, speed, 0.95F, true, -1, -0.5F, f2, 0.5F);
        this.walk(RArm2, speed, -0.5F, true, -3, 0.0F, f2, 0.8F);
        this.flap(RHand, speed, -0.2F, false, 1.5F, -0.4F, f2, 0.3F);
        this.walk(RHand, speed, 0.2F, false, 1.5F, 0.4F, f2, 0.5F);
        this.swing(RHand, speed, -0.2F, false, 1.5F, 0F, f2, 0.5F);

        this.chainWave(Tail, speed, 0.12F, -3, f2, 1);
        this.chainSwing(Tail, speed * 0.8F, 0.20F, -3.4, f2, 0.8F);
        this.chainSwing(Torso, speed, 0.10F, -3, f2, 0.75F);

    }


    public void animate(IAnimatedEntity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        EntityPrehistoricFloraCaptorhinus e = (EntityPrehistoricFloraCaptorhinus) entity;
        animator.update(entity);
        this.resetToDefaultPose();
        setRotationAngles(f, f1, f2, f3, f4, f5, (Entity) entity);

        animator.setAnimation(e.ATTACK_ANIMATION);
        animator.startKeyframe(5);
        animator.rotate(this.Captorhinus, (float) Math.toRadians(30), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(this.Head, (float) Math.toRadians(-15), (float) Math.toRadians(0), (float) Math.toRadians(0));
        //animator.rotate(this.upperjaw, (float) Math.toRadians(-25), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(this.Jaw, (float) Math.toRadians(10), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.endKeyframe();
        animator.setStaticKeyframe(2);
        animator.resetKeyframe(2);

        animator.setAnimation(e.ROAR_ANIMATION);
        animator.startKeyframe(10);
        animator.move(this.Captorhinus, 0,0,-0.5F);
        animator.rotate(this.Head, (float) Math.toRadians(-17), (float) Math.toRadians(0), (float) Math.toRadians(0));
        //animator.rotate(this.upperjaw, (float) Math.toRadians(-25), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(this.Jaw, (float) Math.toRadians(10), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.endKeyframe();
        animator.setStaticKeyframe(10);
        animator.resetKeyframe(10);
    }
}
