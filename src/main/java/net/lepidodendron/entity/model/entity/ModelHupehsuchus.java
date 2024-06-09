package net.lepidodendron.entity.model.entity;

import net.ilexiconn.llibrary.client.model.ModelAnimator;
import net.ilexiconn.llibrary.client.model.tools.AdvancedModelRenderer;
import net.ilexiconn.llibrary.server.animation.IAnimatedEntity;
import net.lepidodendron.entity.EntityPrehistoricFloraHupehsuchus;
import net.lepidodendron.entity.model.ModelBasePalaeopedia;
import net.lepidodendron.entity.model.llibraryextensions.AdvancedModelRendererExtended;
import net.minecraft.client.model.ModelBox;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;

public class ModelHupehsuchus extends ModelBasePalaeopedia {
    private final AdvancedModelRendererExtended Hupehsuchus;
    private final AdvancedModelRendererExtended cube_r1;
    private final AdvancedModelRendererExtended cube_r2;
    private final AdvancedModelRendererExtended LArm;
    private final AdvancedModelRendererExtended LArm2;
    private final AdvancedModelRendererExtended RArm;
    private final AdvancedModelRendererExtended RArm2;
    private final AdvancedModelRendererExtended Neck;
    private final AdvancedModelRendererExtended cube_r3;
    private final AdvancedModelRendererExtended Head;
    private final AdvancedModelRendererExtended cube_r4;
    private final AdvancedModelRendererExtended Jaw;
    private final AdvancedModelRendererExtended cube_r5;
    private final AdvancedModelRendererExtended Throat;
    private final AdvancedModelRendererExtended Throat2;
    private final AdvancedModelRendererExtended Throat3;
    private final AdvancedModelRendererExtended Body;
    private final AdvancedModelRendererExtended stomach;
    private final AdvancedModelRendererExtended cube_r6;
    private final AdvancedModelRendererExtended Body2;
    private final AdvancedModelRendererExtended cube_r7;
    private final AdvancedModelRendererExtended cube_r8;
    private final AdvancedModelRendererExtended cube_r9;
    private final AdvancedModelRendererExtended LLeg;
    private final AdvancedModelRendererExtended LLeg2;
    private final AdvancedModelRendererExtended RLeg;
    private final AdvancedModelRendererExtended RLeg2;
    private final AdvancedModelRendererExtended Tail;
    private final AdvancedModelRendererExtended Tail2;
    private final AdvancedModelRendererExtended Tail3;
    private final AdvancedModelRendererExtended Tail4;
    private final AdvancedModelRendererExtended bone2;
    private final AdvancedModelRendererExtended cube_r10;
    private final AdvancedModelRendererExtended cube_r11;
    private final AdvancedModelRendererExtended cube_r12;

    private ModelAnimator animator;

    public ModelHupehsuchus() {
        this.textureWidth = 80;
        this.textureHeight = 75;

        this.Hupehsuchus = new AdvancedModelRendererExtended(this);
        this.Hupehsuchus.setRotationPoint(0.0F, 21.0F, -6.5F);
        this.setRotateAngle(Hupehsuchus, 0.0175F, 0.0F, 0.0F);
        this.Hupehsuchus.cubeList.add(new ModelBox(Hupehsuchus, 34, 12, -3.5F, -1.5F, -3.5F, 7, 5, 8, 0.01F, false));

        this.cube_r1 = new AdvancedModelRendererExtended(this);
        this.cube_r1.setRotationPoint(0.0F, 3.5F, -3.5F);
        this.Hupehsuchus.addChild(cube_r1);
        this.setRotateAngle(cube_r1, -0.3752F, 0.0F, 0.0F);
        this.cube_r1.cubeList.add(new ModelBox(cube_r1, 0, 51, -2.5F, -3.0F, 0.0F, 5, 3, 7, 0.0F, false));

        this.cube_r2 = new AdvancedModelRendererExtended(this);
        this.cube_r2.setRotationPoint(0.0F, -1.5F, -3.5F);
        this.Hupehsuchus.addChild(cube_r2);
        this.setRotateAngle(cube_r2, 0.2182F, 0.0F, 0.0F);
        this.cube_r2.cubeList.add(new ModelBox(cube_r2, 54, 25, -2.5F, 0.0F, 0.0F, 5, 2, 7, 0.0F, false));

        this.LArm = new AdvancedModelRendererExtended(this);
        this.LArm.setRotationPoint(3.0F, 3.0F, -1.5F);
        this.Hupehsuchus.addChild(LArm);
        this.setRotateAngle(LArm, 0.3286F, -0.8268F, 1.0574F);
        this.LArm.cubeList.add(new ModelBox(LArm, 0, 3, 0.0F, -1.0F, -1.0F, 3, 2, 3, 0.0F, false));

        this.LArm2 = new AdvancedModelRendererExtended(this);
        this.LArm2.setRotationPoint(2.0F, 0.0F, 0.5F);
        this.LArm.addChild(LArm2);
        this.setRotateAngle(LArm2, 0.0F, 0.2618F, 0.0F);
        this.LArm2.cubeList.add(new ModelBox(LArm2, 20, 41, 0.0F, -0.5F, -1.5F, 4, 1, 3, -0.01F, false));
        this.LArm2.cubeList.add(new ModelBox(LArm2, 16, 20, 2.0F, 0.0F, -1.49F, 6, 0, 4, 0.0F, false));

        this.RArm = new AdvancedModelRendererExtended(this);
        this.RArm.setRotationPoint(-3.0F, 3.0F, -1.5F);
        this.Hupehsuchus.addChild(RArm);
        this.setRotateAngle(RArm, 0.3286F, 0.8268F, -1.0574F);
        this.RArm.cubeList.add(new ModelBox(RArm, 0, 3, -3.0F, -1.0F, -1.0F, 3, 2, 3, 0.0F, false));

        this.RArm2 = new AdvancedModelRendererExtended(this);
        this.RArm2.setRotationPoint(-2.0F, 0.0F, 0.5F);
        this.RArm.addChild(RArm2);
        this.setRotateAngle(RArm2, 0.0F, -0.2618F, 0.0F);
        this.RArm2.cubeList.add(new ModelBox(RArm2, 20, 41, -4.0F, -0.5F, -1.5F, 4, 1, 3, -0.01F, false));
        this.RArm2.cubeList.add(new ModelBox(RArm2, 16, 20, -8.0F, 0.0F, -1.49F, 6, 0, 4, 0.0F, false));

        this.Neck = new AdvancedModelRendererExtended(this);
        this.Neck.setRotationPoint(0.0F, 0.5F, -2.5F);
        this.Hupehsuchus.addChild(Neck);
        this.setRotateAngle(Neck, 0.1745F, 0.0F, 0.0F);
        this.Neck.cubeList.add(new ModelBox(Neck, 0, 61, -2.0F, -2.1527F, -5.0304F, 4, 3, 5, 0.0F, false));

        this.cube_r3 = new AdvancedModelRendererExtended(this);
        this.cube_r3.setRotationPoint(0.0F, 0.8473F, -5.0304F);
        this.Neck.addChild(cube_r3);
        this.setRotateAngle(cube_r3, -0.4363F, 0.0F, 0.0F);
        this.cube_r3.cubeList.add(new ModelBox(cube_r3, 58, 58, -2.0F, -3.0F, 0.0F, 4, 3, 5, -0.01F, false));

        this.Head = new AdvancedModelRendererExtended(this);
        this.Head.setRotationPoint(0.0F, -1.1527F, -4.5304F);
        this.Neck.addChild(Head);
        this.setRotateAngle(Head, -0.1745F, 0.0F, 0.0F);
        this.Head.cubeList.add(new ModelBox(Head, 44, 63, -1.5F, -1.0F, -4.0F, 3, 2, 4, 0.0F, false));
        this.Head.cubeList.add(new ModelBox(Head, 57, 37, -1.0F, 0.0F, -11.0F, 2, 1, 7, 0.0F, false));

        this.cube_r4 = new AdvancedModelRendererExtended(this);
        this.cube_r4.setRotationPoint(0.0F, -1.0F, -4.0F);
        this.Head.addChild(cube_r4);
        this.setRotateAngle(cube_r4, 0.5236F, 0.0F, 0.0F);
        this.cube_r4.cubeList.add(new ModelBox(cube_r4, 0, 28, -1.0F, 0.0F, -2.0F, 2, 1, 2, -0.01F, false));

        this.Jaw = new AdvancedModelRendererExtended(this);
        this.Jaw.setRotationPoint(0.0F, 1.05F, 0.0F);
        this.Head.addChild(Jaw);
        this.setRotateAngle(Jaw, 0.0F, 0.0F, 0.0F);
        this.Jaw.cubeList.add(new ModelBox(Jaw, 64, 20, -1.5F, -0.05F, -4.0F, 3, 1, 4, 0.0F, false));
        this.Jaw.cubeList.add(new ModelBox(Jaw, 56, 12, -1.0F, -0.05F, -11.0F, 2, 1, 7, 0.0F, false));
        this.Jaw.cubeList.add(new ModelBox(Jaw, 1, 21, -1.5F, -1.0F, -1.0F, 3, 1, 1, -0.01F, false));

        this.cube_r5 = new AdvancedModelRendererExtended(this);
        this.cube_r5.setRotationPoint(0.0F, 0.0F, -3.0F);
        this.Jaw.addChild(cube_r5);
        this.setRotateAngle(cube_r5, -0.3491F, 0.0F, 0.0F);
        this.cube_r5.cubeList.add(new ModelBox(cube_r5, 0, 8, -1.5F, -2.0F, 0.0F, 3, 2, 2, -0.02F, false));

        this.Throat = new AdvancedModelRendererExtended(this);
        this.Throat.setRotationPoint(0.0F, 0.95F, -11.0F);
        this.Jaw.addChild(Throat);
        this.Throat.cubeList.add(new ModelBox(Throat, 28, 62, -1.0F, -1.0F, 0.0F, 2, 1, 6, -0.01F, false));

        this.Throat2 = new AdvancedModelRendererExtended(this);
        this.Throat2.setRotationPoint(0.0F, 0.0F, 6.0F);
        this.Throat.addChild(Throat2);
        this.Throat2.cubeList.add(new ModelBox(Throat2, 17, 51, -1.0F, -0.99F, -0.02F, 2, 1, 5, -0.02F, false));

        this.Throat3 = new AdvancedModelRendererExtended(this);
        this.Throat3.setRotationPoint(0.0F, 1.7473F, -3.0304F);
        this.Neck.addChild(Throat3);
        this.setRotateAngle(Throat3, -0.4363F, 0.0F, 0.0F);
        this.Throat3.cubeList.add(new ModelBox(Throat3, 67, 16, -1.0F, -1.0F, -2.0F, 2, 1, 2, 0.0F, false));

        this.Body = new AdvancedModelRendererExtended(this);
        this.Body.setRotationPoint(0.0F, 0.0F, 3.5F);
        this.Hupehsuchus.addChild(Body);
        this.setRotateAngle(Body, -0.0175F, 0.0F, 0.0F);
        this.Body.cubeList.add(new ModelBox(Body, 30, 0, -0.5F, -2.5F, 2.0F, 1, 2, 3, 0.0F, false));
        this.Body.cubeList.add(new ModelBox(Body, 0, 0, -4.5F, -2.5F, -1.0F, 9, 8, 12, 0.02F, false));

        this.stomach = new AdvancedModelRendererExtended(this);
        this.stomach.setRotationPoint(0.0F, 6.0F, -1.0F);
        this.Body.addChild(stomach);
        this.setRotateAngle(stomach, -0.2618F, 0.0F, 0.0F);
        this.stomach.cubeList.add(new ModelBox(stomach, 38, 25, -3.5F, -2.0F, 0.0F, 7, 2, 4, 0.0F, false));

        this.cube_r6 = new AdvancedModelRendererExtended(this);
        this.cube_r6.setRotationPoint(0.0F, 0.0F, 4.0F);
        this.stomach.addChild(cube_r6);
        this.setRotateAngle(cube_r6, 0.4014F, 0.0F, 0.0F);
        this.cube_r6.cubeList.add(new ModelBox(cube_r6, 30, 0, -3.5F, -2.01F, 0.0F, 7, 2, 8, 0.01F, false));

        this.Body2 = new AdvancedModelRendererExtended(this);
        this.Body2.setRotationPoint(0.0F, 0.0F, 10.0F);
        this.Body.addChild(Body2);
        this.setRotateAngle(Body2, -0.0175F, 0.0F, 0.0F);
        this.Body2.cubeList.add(new ModelBox(Body2, 0, 37, -3.0F, -2.0F, -1.0F, 6, 6, 8, 0.01F, false));

        this.cube_r7 = new AdvancedModelRendererExtended(this);
        this.cube_r7.setRotationPoint(0.0F, 4.0F, 7.0F);
        this.Body2.addChild(cube_r7);
        this.setRotateAngle(cube_r7, 0.288F, 0.0F, 0.0F);
        this.cube_r7.cubeList.add(new ModelBox(cube_r7, 41, 54, -2.0F, -2.0F, -7.0F, 4, 2, 7, 0.0F, false));

        this.cube_r8 = new AdvancedModelRendererExtended(this);
        this.cube_r8.setRotationPoint(0.0F, -3.5F, -5.3F);
        this.Body2.addChild(cube_r8);
        this.setRotateAngle(cube_r8, -0.2356F, 0.0F, 0.0F);
        this.cube_r8.cubeList.add(new ModelBox(cube_r8, 8, 8, -0.5F, -1.4069F, 5.7866F, 1, 1, 1, 0.0F, false));

        this.cube_r9 = new AdvancedModelRendererExtended(this);
        this.cube_r9.setRotationPoint(0.0F, -2.0F, 7.0F);
        this.Body2.addChild(cube_r9);
        this.setRotateAngle(cube_r9, -0.192F, 0.0F, 0.0F);
        this.cube_r9.cubeList.add(new ModelBox(cube_r9, 24, 52, -2.5F, 0.0F, -7.0F, 5, 2, 7, 0.0F, false));

        this.LLeg = new AdvancedModelRendererExtended(this);
        this.LLeg.setRotationPoint(2.5F, 2.5F, 5.0F);
        this.Body2.addChild(LLeg);
        this.setRotateAngle(LLeg, 0.0F, -0.48F, 0.9163F);
        this.LLeg.cubeList.add(new ModelBox(LLeg, 30, 5, 0.0F, -0.5F, -1.0F, 2, 1, 2, 0.0F, false));

        this.LLeg2 = new AdvancedModelRendererExtended(this);
        this.LLeg2.setRotationPoint(1.5F, 0.0F, 0.0F);
        this.LLeg.addChild(LLeg2);
        this.setRotateAngle(LLeg2, 0.0F, -0.2618F, 0.0F);
        this.LLeg2.cubeList.add(new ModelBox(LLeg2, 20, 29, 0.0F, -0.5F, -1.0F, 2, 1, 2, -0.01F, false));
        this.LLeg2.cubeList.add(new ModelBox(LLeg2, 0, 0, 1.0F, 0.0F, -1.0F, 4, 0, 3, 0.0F, false));

        this.RLeg = new AdvancedModelRendererExtended(this);
        this.RLeg.setRotationPoint(-2.5F, 2.5F, 5.0F);
        this.Body2.addChild(RLeg);
        this.setRotateAngle(RLeg, 0.0F, 0.48F, -0.9163F);
        this.RLeg.cubeList.add(new ModelBox(RLeg, 30, 5, -2.0F, -0.5F, -1.0F, 2, 1, 2, 0.0F, false));

        this.RLeg2 = new AdvancedModelRendererExtended(this);
        this.RLeg2.setRotationPoint(-1.5F, 0.0F, 0.0F);
        this.RLeg.addChild(RLeg2);
        this.setRotateAngle(RLeg2, 0.0F, 0.2618F, 0.0F);
        this.RLeg2.cubeList.add(new ModelBox(RLeg2, 20, 29, -2.0F, -0.5F, -1.0F, 2, 1, 2, -0.01F, false));
        this.RLeg2.cubeList.add(new ModelBox(RLeg2, 0, 0, -5.0F, 0.0F, -1.0F, 4, 0, 3, 0.0F, false));

        this.Tail = new AdvancedModelRendererExtended(this);
        this.Tail.setRotationPoint(0.0F, 0.5F, 6.0F);
        this.Body2.addChild(Tail);
        this.Tail.cubeList.add(new ModelBox(Tail, 0, 20, -2.0F, -2.0F, 0.0F, 4, 5, 12, 0.0F, false));

        this.Tail2 = new AdvancedModelRendererExtended(this);
        this.Tail2.setRotationPoint(0.0F, 0.0F, 11.0F);
        this.Tail.addChild(Tail2);
        this.Tail2.cubeList.add(new ModelBox(Tail2, 20, 25, -1.5F, -1.5F, 0.0F, 3, 4, 12, 0.0F, false));

        this.Tail3 = new AdvancedModelRendererExtended(this);
        this.Tail3.setRotationPoint(0.0F, 0.0F, 11.0F);
        this.Tail2.addChild(Tail3);
        this.Tail3.cubeList.add(new ModelBox(Tail3, 40, 31, -1.0F, -1.0F, 0.0F, 2, 3, 10, 0.0F, false));

        this.Tail4 = new AdvancedModelRendererExtended(this);
        this.Tail4.setRotationPoint(0.0F, 0.5F, 9.5F);
        this.Tail3.addChild(Tail4);
        this.Tail4.cubeList.add(new ModelBox(Tail4, 50, 0, -0.5F, -1.0F, -0.5F, 1, 2, 10, 0.0F, false));

        this.bone2 = new AdvancedModelRendererExtended(this);
        this.bone2.setRotationPoint(0.0F, -3.0F, -1.0F);
        this.Body.addChild(bone2);
        this.setRotateAngle(bone2, 0.1745F, 0.0F, 0.0F);
        this.bone2.cubeList.add(new ModelBox(bone2, 48, 46, -3.5F, 0.0F, 0.0F, 7, 2, 6, 0.0F, false));

        this.cube_r10 = new AdvancedModelRendererExtended(this);
        this.cube_r10.setRotationPoint(0.0F, 0.0F, 6.0F);
        this.bone2.addChild(cube_r10);
        this.setRotateAngle(cube_r10, 0.0436F, 0.0F, 0.0F);
        this.cube_r10.cubeList.add(new ModelBox(cube_r10, 18, 61, -1.0F, -0.5F, -6.0F, 2, 1, 6, 0.0F, false));

        this.cube_r11 = new AdvancedModelRendererExtended(this);
        this.cube_r11.setRotationPoint(0.0F, -0.5F, 6.0F);
        this.bone2.addChild(cube_r11);
        this.setRotateAngle(cube_r11, -0.3491F, 0.0F, 0.0F);
        this.cube_r11.cubeList.add(new ModelBox(cube_r11, 62, 0, -1.0F, 0.01F, 0.0F, 2, 1, 6, 0.01F, false));

        this.cube_r12 = new AdvancedModelRendererExtended(this);
        this.cube_r12.setRotationPoint(0.0F, 0.0F, 6.0F);
        this.bone2.addChild(cube_r12);
        this.setRotateAngle(cube_r12, -0.3054F, 0.0F, 0.0F);
        this.cube_r12.cubeList.add(new ModelBox(cube_r12, 28, 44, -3.5F, 0.01F, 0.0F, 7, 2, 6, 0.01F, false));

        updateDefaultPose();
        animator = ModelAnimator.create();
    }

    @Override
    public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        animate((IAnimatedEntity) entity, f, f1, f2, f3, f4, f5);
        this.Hupehsuchus.render(f5);
    }

    public void renderStaticFloor(float f) {
        this.setRotateAngle(Neck, 0.4F, 0.3F, 0.0F);
        this.setRotateAngle(Head, -0.3F, 0.3F, 0.0F);
        this.setRotateAngle(Jaw, 0.0F, 0.0F, 0.0F);
        this.setRotateAngle(Body, -0.1F, 0.3F, 0.0F);
        this.setRotateAngle(Body2, -0.1F, 0.3F, 0.0F);
        this.setRotateAngle(Tail, -0.1F, -0.1F, 0.0F);
        this.setRotateAngle(Tail2, 0.1F, -0.2F, 0.0F);
        this.setRotateAngle(Tail3, 0.2F, -0.3F, 0.0F);
        this.setRotateAngle(Tail4, 0.2F, -0.3F, 0.0F);
        this.setRotateAngle(LArm, 0.3F, 0.3F, -0.3F);
        this.setRotateAngle(RArm, 0.3F, -0.3F, 0.3F);
        this.Hupehsuchus.offsetY = -0.14F;
        this.Hupehsuchus.render(0.01F);
        resetToDefaultPose();
    }

    public void renderStaticWall(float f) {
        this.Neck.rotateAngleX = (float) Math.toRadians(90);
        this.setRotateAngle(Neck, 0.0F, 0.0F, 0.0F);
        this.setRotateAngle(Head, 0.0F, 0.0F, 0.0F);
        this.setRotateAngle(Jaw, 0.3F, 0.0F, 0.0F);
        this.Neck.offsetY = -0.03F;
        this.Neck.offsetX = 0.0F;
        this.Neck.offsetZ = -0.3F;
        this.Neck.render(0.01F);
        resetToDefaultPose();
    }

    public void setRotateAngle(AdvancedModelRenderer AdvancedModelRenderer, float x, float y, float z) {
        AdvancedModelRenderer.rotateAngleX = x;
        AdvancedModelRenderer.rotateAngleY = y;
        AdvancedModelRenderer.rotateAngleZ = z;
    }

    @Override
    public void setRotationAngles(float f, float f1, float f2, float f3, float f4, float f5, Entity e) {
        super.setRotationAngles(f, f1, f2, f3, f4, f5, e);
        //this.resetToDefaultPose();
        //this.Eretmorhipis.offsetY = 1.16F;

        this.faceTarget(f3, f4, 5, Neck);
        this.faceTarget(f3, f4, 5, Head);

    }

    @Override
    public void setLivingAnimations(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime) {
        super.setLivingAnimations(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime);
        this.resetToDefaultPose();
        EntityPrehistoricFloraHupehsuchus ee = (EntityPrehistoricFloraHupehsuchus) entitylivingbaseIn;

        if (ee.isInWater()) {
            animWalking(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime);
        }
        else {
            //beached pose:
            animBeach(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime);
        }
        if (ee.getAnimation() == ee.ROAR_ANIMATION) { //The noise anim
            animNoise(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime, ee.getAnimationTick());
        }

    }

    public void animNoise(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime, double animTick) {
        EntityPrehistoricFloraHupehsuchus entity = (EntityPrehistoricFloraHupehsuchus) entitylivingbaseIn;
        int animCycle = 80;
        double tickAnim = animTick + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;
        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0D + (((tickAnim - 0D) / 10D) * (-10+Math.sin((Math.PI/180)*(((double)tickAnim/80D)*90))*2D-(0D)));
            yy = 0D + (((tickAnim - 0D) / 10D) * (0D-(0D)));
            zz = 0D + (((tickAnim - 0D) / 10D) * (0D-(0D)));
        }
        else if (tickAnim >= 10 && tickAnim < 60) {
            xx = -10+(Math.sin((Math.PI/180)*(((double)tickAnim/80D)*90))*2) + (((tickAnim - 10D) / 50D) * (-10+Math.sin((Math.PI/180)*(((double)tickAnim/80D)*90))*2D-(-10+Math.sin((Math.PI/180)*(((double)tickAnim/80D)*90))*2D)));
            yy = 0D + (((tickAnim - 10D) / 50D) * (0D-(0D)));
            zz = 0D + (((tickAnim - 10D) / 50D) * (0D-(0D)));
        }
        else if (tickAnim >= 60 && tickAnim < 80) {
            xx = -10+(Math.sin((Math.PI/180)*(((double)tickAnim/80D)*90))*2) + (((tickAnim - 60D) / 20D) * (0D-(-10+Math.sin((Math.PI/180)*(((double)tickAnim/80D)*90))*2D)));
            yy = 0D + (((tickAnim - 60D) / 20D) * (0D-(0D)));
            zz = 0D + (((tickAnim - 60D) / 20D) * (0D-(0D)));
        }
        this.setRotateAngle(Head, Head.rotateAngleX + (float) Math.toRadians(xx), Head.rotateAngleY + (float) Math.toRadians(yy), Head.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0D + (((tickAnim - 0D) / 10D) * (32.5+Math.sin((Math.PI/180)*(((double)tickAnim/80D)*90))*-3D-(0D)));
            yy = 0D + (((tickAnim - 0D) / 10D) * (0D-(0D)));
            zz = 0D + (((tickAnim - 0D) / 10D) * (0D-(0D)));
        }
        else if (tickAnim >= 10 && tickAnim < 60) {
            xx = 32.5+(Math.sin((Math.PI/180)*(((double)tickAnim/80D)*90))*-3) + (((tickAnim - 10D) / 50D) * (32.5+Math.sin((Math.PI/180)*(((double)tickAnim/80D)*90))*-3D-(32.5+Math.sin((Math.PI/180)*(((double)tickAnim/80D)*90))*-3D)));
            yy = 0D + (((tickAnim - 10D) / 50D) * (0D-(0D)));
            zz = 0D + (((tickAnim - 10D) / 50D) * (0D-(0D)));
        }
        else if (tickAnim >= 60 && tickAnim < 80) {
            xx = 32.5+(Math.sin((Math.PI/180)*(((double)tickAnim/80D)*90))*-3) + (((tickAnim - 60D) / 20D) * (0D-(32.5+Math.sin((Math.PI/180)*(((double)tickAnim/80D)*90))*-3D)));
            yy = 0D + (((tickAnim - 60D) / 20D) * (0D-(0D)));
            zz = 0D + (((tickAnim - 60D) / 20D) * (0D-(0D)));
        }
        this.setRotateAngle(Jaw, Jaw.rotateAngleX + (float) Math.toRadians(xx), Jaw.rotateAngleY + (float) Math.toRadians(yy), Jaw.rotateAngleZ + (float) Math.toRadians(zz));
        this.setRotateAngle(Throat, Throat.rotateAngleX + (float) Math.toRadians(-7.5+Math.sin((Math.PI/180)*((((double)tickAnim/80D)*4D)*180))*1), Throat.rotateAngleY + (float) Math.toRadians(0), Throat.rotateAngleZ + (float) Math.toRadians(0));
        this.setRotateAngle(Throat2, Throat2.rotateAngleX + (float) Math.toRadians(7.5+Math.sin((Math.PI/180)*((((double)tickAnim/80D)*4D)*180-150))*1), Throat2.rotateAngleY + (float) Math.toRadians(0), Throat2.rotateAngleZ + (float) Math.toRadians(0));
        this.setRotateAngle(Throat3, Throat3.rotateAngleX + (float) Math.toRadians(20+Math.sin((Math.PI/180)*((((double)tickAnim/80D)*4D)*180-250))*3.5), Throat3.rotateAngleY + (float) Math.toRadians(0), Throat3.rotateAngleZ + (float) Math.toRadians(0));
    }

    public void animWalking(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime) {
        EntityPrehistoricFloraHupehsuchus entity = (EntityPrehistoricFloraHupehsuchus) entitylivingbaseIn;
        int animCycle = 80;
        double tickAnim = (entity.ticksExisted + entity.getTickOffset()) - (int) (Math.floor((double) (entity.ticksExisted + entity.getTickOffset()) / (double) animCycle) * (double) animCycle) + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;
        this.setRotateAngle(Hupehsuchus, Hupehsuchus.rotateAngleX + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/80D)*4D)*180))*-3), Hupehsuchus.rotateAngleY + (float) Math.toRadians(0), Hupehsuchus.rotateAngleZ + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/80D)*4D)*90))*-2));
        this.Hupehsuchus.offsetX = (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/80D)*4D)*90))*0.5);
        this.Hupehsuchus.offsetY = (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/80D)*4D)*180-90))*0.5);
        this.Hupehsuchus.offsetZ = (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/80D)*4D)*180-90))*-0.25);
        this.setRotateAngle(LArm, LArm.rotateAngleX + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/80D)*4D)*180+260))*-25), LArm.rotateAngleY + (float) Math.toRadians(30+Math.sin((Math.PI/180)*((((double)tickAnim/80D)*4D)*180+190))*25), LArm.rotateAngleZ + (float) Math.toRadians(-40-Math.sin((Math.PI/180)*((((double)tickAnim/80D)*4D)*180-30))*-25));
        this.setRotateAngle(LArm2, LArm2.rotateAngleX + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/80D)*4D)*180+20))*15), LArm2.rotateAngleY + (float) Math.toRadians(7+Math.sin((Math.PI/180)*((((double)tickAnim/80D)*4D)*180))*-20), LArm2.rotateAngleZ + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/80D)*4D)*180-60))*10));
        this.setRotateAngle(RArm, RArm.rotateAngleX + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/80D)*4D)*180+260))*-25), RArm.rotateAngleY + (float) Math.toRadians(-30-Math.sin((Math.PI/180)*((((double)tickAnim/80D)*4D)*180-190))*25), RArm.rotateAngleZ + (float) Math.toRadians(40+Math.sin((Math.PI/180)*((((double)tickAnim/80D)*4D)*180-30))*-25));
        this.setRotateAngle(RArm2, RArm2.rotateAngleX + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/80D)*4D)*180+20))*15), RArm2.rotateAngleY + (float) Math.toRadians(-7-Math.sin((Math.PI/180)*((((double)tickAnim/80D)*4D)*180))*-20), RArm2.rotateAngleZ + (float) Math.toRadians(-Math.sin((Math.PI/180)*((((double)tickAnim/80D)*4D)*180-60))*10));
        this.setRotateAngle(Neck, Neck.rotateAngleX + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/80D)*4D)*180-100))*5), Neck.rotateAngleY + (float) Math.toRadians(0), Neck.rotateAngleZ + (float) Math.toRadians(0));
        this.setRotateAngle(Head, Head.rotateAngleX + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/80D)*4D)*180-180))*-5), Head.rotateAngleY + (float) Math.toRadians(0), Head.rotateAngleZ + (float) Math.toRadians(0));
        this.setRotateAngle(Body, Body.rotateAngleX + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/80D)*4D)*180-40))*-2), Body.rotateAngleY + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/80D)*4D)*90))*-1), Body.rotateAngleZ + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/80D)*4D)*90-20))*-1));
        this.setRotateAngle(Body2, Body2.rotateAngleX + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/80D)*4D)*180-100))*-2), Body2.rotateAngleY + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/80D)*4D)*90))*-2), Body2.rotateAngleZ + (float) Math.toRadians(0));
        this.setRotateAngle(LLeg, LLeg.rotateAngleX + (float) Math.toRadians(15+Math.sin((Math.PI/180)*((((double)tickAnim/80D)*4D)*180+160))*-30), LLeg.rotateAngleY + (float) Math.toRadians(30+Math.sin((Math.PI/180)*((((double)tickAnim/80D)*4D)*180+90))*20), LLeg.rotateAngleZ + (float) Math.toRadians(-20-Math.sin((Math.PI/180)*((((double)tickAnim/80D)*4D)*180-130))*-25));
        this.setRotateAngle(LLeg2, LLeg2.rotateAngleX + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/80D)*4D)*180))*5), LLeg2.rotateAngleY + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/80D)*4D)*180-150))*-10), LLeg2.rotateAngleZ + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/80D)*4D)*180-160))*5));
        this.setRotateAngle(RLeg, RLeg.rotateAngleX + (float) Math.toRadians(15+Math.sin((Math.PI/180)*((((double)tickAnim/80D)*4D)*180+160))*-30), RLeg.rotateAngleY + (float) Math.toRadians(-30-Math.sin((Math.PI/180)*((((double)tickAnim/80D)*4D)*180+90))*20), RLeg.rotateAngleZ + (float) Math.toRadians(20+Math.sin((Math.PI/180)*((((double)tickAnim/80D)*4D)*180-130))*-25));
        this.setRotateAngle(RLeg2, RLeg2.rotateAngleX + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/80D)*4D)*180))*5), RLeg2.rotateAngleY + (float) Math.toRadians(-Math.sin((Math.PI/180)*((((double)tickAnim/80D)*4D)*180-150))*-10), RLeg2.rotateAngleZ + (float) Math.toRadians(-Math.sin((Math.PI/180)*((((double)tickAnim/80D)*4D)*180-160))*5));
        this.setRotateAngle(Tail, Tail.rotateAngleX + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/80D)*4D)*180-160))*-3), Tail.rotateAngleY + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/80D)*4D)*90-40))*-3), Tail.rotateAngleZ + (float) Math.toRadians(0));
        this.setRotateAngle(Tail2, Tail2.rotateAngleX + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/80D)*4D)*180-180))*-5), Tail2.rotateAngleY + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/80D)*4D)*90-80))*-3), Tail2.rotateAngleZ + (float) Math.toRadians(0));
        this.setRotateAngle(Tail3, Tail3.rotateAngleX + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/80D)*4D)*180-200))*-5), Tail3.rotateAngleY + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/80D)*4D)*90-100))*-4), Tail3.rotateAngleZ + (float) Math.toRadians(0));
        this.setRotateAngle(Tail4, Tail4.rotateAngleX + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/80D)*4D)*180-210))*-5), Tail4.rotateAngleY + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/80D)*4D)*90-130))*-5), Tail4.rotateAngleZ + (float) Math.toRadians(0));

    }

    public void animBeach(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime) {
        EntityPrehistoricFloraHupehsuchus entity = (EntityPrehistoricFloraHupehsuchus) entitylivingbaseIn;

        int animCycle = 320;
        double tickAnim = (entity.ticksExisted + entity.getTickOffset()) - (int) (Math.floor((double) (entity.ticksExisted + entity.getTickOffset()) / (double) animCycle) * (double) animCycle) + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;
        this.setRotateAngle(Hupehsuchus, Hupehsuchus.rotateAngleX + (float) Math.toRadians(12.5+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360))*-1), Hupehsuchus.rotateAngleY + (float) Math.toRadians(0), Hupehsuchus.rotateAngleZ + (float) Math.toRadians(0));
        this.Hupehsuchus.rotationPointX = this.Hupehsuchus.rotationPointX + (float)(0);
        this.Hupehsuchus.rotationPointY = this.Hupehsuchus.rotationPointY - (float)(2);
        this.Hupehsuchus.rotationPointZ = this.Hupehsuchus.rotationPointZ + (float)(0);



        if (tickAnim >= 0 && tickAnim < 18) {
            xx = -30.89921 + (((tickAnim - 0) / 18) * (-40.94153-(-30.89921)));
            yy = 47.87008 + (((tickAnim - 0) / 18) * (55.12348-(47.87008)));
            zz = -57.7086+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720))*2 + (((tickAnim - 0) / 18) * (-73.80502-(-57.7086+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720))*2)));
        }
        else if (tickAnim >= 18 && tickAnim < 22) {
            xx = -40.94153 + (((tickAnim - 18) / 4) * (-36.26751-(-40.94153)));
            yy = 55.12348 + (((tickAnim - 18) / 4) * (70.874+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720))*2-(55.12348)));
            zz = -73.80502 + (((tickAnim - 18) / 4) * (-60.19846-(-73.80502)));
        }
        else if (tickAnim >= 22 && tickAnim < 48) {
            xx = -36.26751 + (((tickAnim - 22) / 26) * (-30.89921-(-36.26751)));
            yy = 70.874+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720))*2 + (((tickAnim - 22) / 26) * (47.87008-(70.874+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720))*2)));
            zz = -60.19846 + (((tickAnim - 22) / 26) * (-57.7086+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720))*2-(-60.19846)));
        }
        else if (tickAnim >= 48 && tickAnim < 65) {
            xx = -30.89921 + (((tickAnim - 48) / 17) * (-40.94153-(-30.89921)));
            yy = 47.87008 + (((tickAnim - 48) / 17) * (55.12348-(47.87008)));
            zz = -57.7086+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720))*2 + (((tickAnim - 48) / 17) * (-73.80502-(-57.7086+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720))*2)));
        }
        else if (tickAnim >= 65 && tickAnim < 69) {
            xx = -40.94153 + (((tickAnim - 65) / 4) * (-36.26751-(-40.94153)));
            yy = 55.12348 + (((tickAnim - 65) / 4) * (70.874+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720))*2-(55.12348)));
            zz = -73.80502 + (((tickAnim - 65) / 4) * (-60.19846-(-73.80502)));
        }
        else if (tickAnim >= 69 && tickAnim < 80) {
            xx = -36.26751 + (((tickAnim - 69) / 11) * (-30.89921-(-36.26751)));
            yy = 70.874+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720))*2 + (((tickAnim - 69) / 11) * (47.87008-(70.874+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720))*2)));
            zz = -60.19846 + (((tickAnim - 69) / 11) * (-57.70864-(-60.19846)));
        }
        else if (tickAnim >= 80 && tickAnim < 168) {
            xx = -30.89921 + (((tickAnim - 80) / 88) * (-30.89921-(-30.89921)));
            yy = 47.87008 + (((tickAnim - 80) / 88) * (47.87008-(47.87008)));
            zz = -57.70864 + (((tickAnim - 80) / 88) * (-57.7086+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720))*2-(-57.70864)));
        }
        else if (tickAnim >= 168 && tickAnim < 185) {
            xx = -30.89921 + (((tickAnim - 168) / 17) * (-40.94153-(-30.89921)));
            yy = 47.87008 + (((tickAnim - 168) / 17) * (55.12348-(47.87008)));
            zz = -57.7086+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720))*2 + (((tickAnim - 168) / 17) * (-73.80502-(-57.7086+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720))*2)));
        }
        else if (tickAnim >= 185 && tickAnim < 189) {
            xx = -40.94153 + (((tickAnim - 185) / 4) * (-36.26751-(-40.94153)));
            yy = 55.12348 + (((tickAnim - 185) / 4) * (70.874+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720))*2-(55.12348)));
            zz = -73.80502 + (((tickAnim - 185) / 4) * (-60.19846-(-73.80502)));
        }
        else if (tickAnim >= 189 && tickAnim < 289) {
            xx = -36.26751 + (((tickAnim - 189) / 100) * (-30.89921-(-36.26751)));
            yy = 70.874+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720))*2 + (((tickAnim - 189) / 100) * (47.87008-(70.874+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720))*2)));
            zz = -60.19846 + (((tickAnim - 189) / 100) * (-57.7086+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720))*2-(-60.19846)));
        }
        else if (tickAnim >= 289 && tickAnim < 307) {
            xx = -30.89921 + (((tickAnim - 289) / 18) * (-40.94153-(-30.89921)));
            yy = 47.87008 + (((tickAnim - 289) / 18) * (55.12348-(47.87008)));
            zz = -57.7086+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720))*2 + (((tickAnim - 289) / 18) * (-73.80502-(-57.7086+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720))*2)));
        }
        else if (tickAnim >= 307 && tickAnim < 311) {
            xx = -40.94153 + (((tickAnim - 307) / 4) * (-36.26751-(-40.94153)));
            yy = 55.12348 + (((tickAnim - 307) / 4) * (70.874+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720))*2-(55.12348)));
            zz = -73.80502 + (((tickAnim - 307) / 4) * (-60.19846-(-73.80502)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(LArm, LArm.rotateAngleX + (float) Math.toRadians(xx), LArm.rotateAngleY + (float) Math.toRadians(yy), LArm.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 18) {
            xx = 0 + (((tickAnim - 0) / 18) * (-2.59775-(0)));
            yy = Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-100))*2 + (((tickAnim - 0) / 18) * (12.38656-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-100))*2)));
            zz = Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-100))*2 + (((tickAnim - 0) / 18) * (-5.63304-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-100))*2)));
        }
        else if (tickAnim >= 18 && tickAnim < 22) {
            xx = -2.59775 + (((tickAnim - 18) / 4) * (0-(-2.59775)));
            yy = 12.38656 + (((tickAnim - 18) / 4) * (0-(12.38656)));
            zz = -5.63304 + (((tickAnim - 18) / 4) * (0-(-5.63304)));
        }
        else if (tickAnim >= 22 && tickAnim < 80) {
            xx = 0 + (((tickAnim - 22) / 58) * (0-(0)));
            yy = 0 + (((tickAnim - 22) / 58) * (0-(0)));
            zz = 0 + (((tickAnim - 22) / 58) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(LArm2, LArm2.rotateAngleX + (float) Math.toRadians(xx), LArm2.rotateAngleY + (float) Math.toRadians(yy), LArm2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 46) {
            xx = -30.89921 + (((tickAnim - 0) / 46) * (-30.89921-(-30.89921)));
            yy = -47.87008 + (((tickAnim - 0) / 46) * (-47.87008-(-47.87008)));
            zz = 57.7086 + (((tickAnim - 0) / 46) * (57.7086-(57.7086)));
        }
        else if (tickAnim >= 46 && tickAnim < 63) {
            xx = -30.89921 + (((tickAnim - 46) / 17) * (-40.94153-(-30.89921)));
            yy = -47.87008 + (((tickAnim - 46) / 17) * (-55.12348-(-47.87008)));
            zz = 57.7086 + (((tickAnim - 46) / 17) * (73.805+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720))*2-(57.7086)));
        }
        else if (tickAnim >= 63 && tickAnim < 68) {
            xx = -40.94153 + (((tickAnim - 63) / 5) * (-36.26751-(-40.94153)));
            yy = -55.12348 + (((tickAnim - 63) / 5) * (-70.874+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720))*2-(-55.12348)));
            zz = 73.805+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720))*2 + (((tickAnim - 63) / 5) * (60.19846-(73.805+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720))*2)));
        }
        else if (tickAnim >= 68 && tickAnim < 126) {
            xx = -36.26751 + (((tickAnim - 68) / 58) * (-30.89921-(-36.26751)));
            yy = -70.874+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720))*2 + (((tickAnim - 68) / 58) * (-47.87008-(-70.874+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720))*2)));
            zz = 60.19846 + (((tickAnim - 68) / 58) * (57.70864-(60.19846)));
        }
        else if (tickAnim >= 126 && tickAnim < 273) {
            xx = -30.89921 + (((tickAnim - 126) / 147) * (-30.89921-(-30.89921)));
            yy = -47.87008 + (((tickAnim - 126) / 147) * (-47.87008-(-47.87008)));
            zz = 57.70864 + (((tickAnim - 126) / 147) * (57.7086-(57.70864)));
        }
        else if (tickAnim >= 273 && tickAnim < 290) {
            xx = -30.89921 + (((tickAnim - 273) / 17) * (-40.94153-(-30.89921)));
            yy = -47.87008 + (((tickAnim - 273) / 17) * (-55.12348-(-47.87008)));
            zz = 57.7086 + (((tickAnim - 273) / 17) * (73.805+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720))*2-(57.7086)));
        }
        else if (tickAnim >= 290 && tickAnim < 294) {
            xx = -40.94153 + (((tickAnim - 290) / 4) * (-36.26751-(-40.94153)));
            yy = -55.12348 + (((tickAnim - 290) / 4) * (-70.874+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720))*2-(-55.12348)));
            zz = 73.805+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720))*2 + (((tickAnim - 290) / 4) * (60.19846-(73.805+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720))*2)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(RArm, RArm.rotateAngleX + (float) Math.toRadians(xx), RArm.rotateAngleY + (float) Math.toRadians(yy), RArm.rotateAngleZ + (float) Math.toRadians(zz));



        this.setRotateAngle(Neck, Neck.rotateAngleX + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360))*2), Neck.rotateAngleY + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*90))*5), Neck.rotateAngleZ + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*90-30))*-5));


        this.setRotateAngle(Head, Head.rotateAngleX + (float) Math.toRadians(-15.1515+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360))*0.25), Head.rotateAngleY + (float) Math.toRadians(-1.6845+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*90-100))*5), Head.rotateAngleZ + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*90-150))*-8.4547));


        this.setRotateAngle(Jaw, Jaw.rotateAngleX + (float) Math.toRadians(3-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360))*1), Jaw.rotateAngleY + (float) Math.toRadians(0), Jaw.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(Body, Body.rotateAngleX + (float) Math.toRadians(-12.5+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360))*2), Body.rotateAngleY + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*90+50))*1), Body.rotateAngleZ + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*90+50))*1));


        this.setRotateAngle(Body2, Body2.rotateAngleX + (float) Math.toRadians(-12.5+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360))*-2), Body2.rotateAngleY + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*90+20))*2), Body2.rotateAngleZ + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*90+20))*2));



        if (tickAnim >= 23 && tickAnim < 40) {
            xx = 13.50178 + (((tickAnim - 23) / 17) * (-11.64891-(13.50178)));
            yy = 25.39601 + (((tickAnim - 23) / 17) * (58.38603-(25.39601)));
            zz = -46.9787+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720))*2 + (((tickAnim - 23) / 17) * (-59.96255-(-46.9787+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720))*2)));
        }
        else if (tickAnim >= 40 && tickAnim < 46) {
            xx = -11.64891 + (((tickAnim - 40) / 6) * (21.92929-(-11.64891)));
            yy = 58.38603 + (((tickAnim - 40) / 6) * (61.61946-(58.38603)));
            zz = -59.96255 + (((tickAnim - 40) / 6) * (-27.5257+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720))*2-(-59.96255)));
        }
        else if (tickAnim >= 46 && tickAnim < 89) {
            xx = 21.92929 + (((tickAnim - 46) / 43) * (13.50178-(21.92929)));
            yy = 61.61946 + (((tickAnim - 46) / 43) * (25.39601-(61.61946)));
            zz = -27.5257+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720))*2 + (((tickAnim - 46) / 43) * (-46.9787-(-27.5257+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720))*2)));
        }
        else if (tickAnim >= 89 && tickAnim < 228) {
            xx = 13.50178 + (((tickAnim - 89) / 139) * (13.50178-(13.50178)));
            yy = 25.39601 + (((tickAnim - 89) / 139) * (25.39601-(25.39601)));
            zz = -46.9787 + (((tickAnim - 89) / 139) * (-46.9787+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720))*2-(-46.9787)));
        }
        else if (tickAnim >= 228 && tickAnim < 245) {
            xx = 13.50178 + (((tickAnim - 228) / 17) * (-11.64891-(13.50178)));
            yy = 25.39601 + (((tickAnim - 228) / 17) * (58.38603-(25.39601)));
            zz = -46.9787+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720))*2 + (((tickAnim - 228) / 17) * (-59.96255-(-46.9787+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720))*2)));
        }
        else if (tickAnim >= 245 && tickAnim < 251) {
            xx = -11.64891 + (((tickAnim - 245) / 6) * (21.92929-(-11.64891)));
            yy = 58.38603 + (((tickAnim - 245) / 6) * (61.61946-(58.38603)));
            zz = -59.96255 + (((tickAnim - 245) / 6) * (-27.5257+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720))*2-(-59.96255)));
        }
        else if (tickAnim >= 251 && tickAnim < 278) {
            xx = 21.92929 + (((tickAnim - 251) / 27) * (13.50178-(21.92929)));
            yy = 61.61946 + (((tickAnim - 251) / 27) * (25.39601-(61.61946)));
            zz = -27.5257+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720))*2 + (((tickAnim - 251) / 27) * (-46.9787+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720))*2-(-27.5257+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720))*2)));
        }
        else if (tickAnim >= 278 && tickAnim < 296) {
            xx = 13.50178 + (((tickAnim - 278) / 18) * (-11.64891-(13.50178)));
            yy = 25.39601 + (((tickAnim - 278) / 18) * (58.38603-(25.39601)));
            zz = -46.9787+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720))*2 + (((tickAnim - 278) / 18) * (-59.96255-(-46.9787+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720))*2)));
        }
        else if (tickAnim >= 296 && tickAnim < 302) {
            xx = -11.64891 + (((tickAnim - 296) / 6) * (21.92929-(-11.64891)));
            yy = 58.38603 + (((tickAnim - 296) / 6) * (61.61946-(58.38603)));
            zz = -59.96255 + (((tickAnim - 296) / 6) * (-27.5257+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720))*2-(-59.96255)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(LLeg, LLeg.rotateAngleX + (float) Math.toRadians(xx), LLeg.rotateAngleY + (float) Math.toRadians(yy), LLeg.rotateAngleZ + (float) Math.toRadians(zz));



        this.setRotateAngle(LLeg2, LLeg2.rotateAngleX + (float) Math.toRadians(0), LLeg2.rotateAngleY + (float) Math.toRadians(0), LLeg2.rotateAngleZ + (float) Math.toRadians(0));



        if (tickAnim >= 17 && tickAnim < 34) {
            xx = 13.50178 + (((tickAnim - 17) / 17) * (-11.64891-(13.50178)));
            yy = -25.39601 + (((tickAnim - 17) / 17) * (-58.38603-(-25.39601)));
            zz = 46.9787+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720))*2 + (((tickAnim - 17) / 17) * (59.96255-(46.9787+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720))*2)));
        }
        else if (tickAnim >= 34 && tickAnim < 40) {
            xx = -11.64891 + (((tickAnim - 34) / 6) * (21.92929-(-11.64891)));
            yy = -58.38603 + (((tickAnim - 34) / 6) * (-61.61946-(-58.38603)));
            zz = 59.96255 + (((tickAnim - 34) / 6) * (27.5257+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720))*2-(59.96255)));
        }
        else if (tickAnim >= 40 && tickAnim < 83) {
            xx = 21.92929 + (((tickAnim - 40) / 43) * (13.50178-(21.92929)));
            yy = -61.61946 + (((tickAnim - 40) / 43) * (-25.39601-(-61.61946)));
            zz = 27.5257+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720))*2 + (((tickAnim - 40) / 43) * (46.9787-(27.5257+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720))*2)));
        }
        else if (tickAnim >= 83 && tickAnim < 233) {
            xx = 13.50178 + (((tickAnim - 83) / 150) * (13.50178-(13.50178)));
            yy = -25.39601 + (((tickAnim - 83) / 150) * (-25.39601-(-25.39601)));
            zz = 46.9787 + (((tickAnim - 83) / 150) * (46.9787+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720))*2-(46.9787)));
        }
        else if (tickAnim >= 233 && tickAnim < 250) {
            xx = 13.50178 + (((tickAnim - 233) / 17) * (-11.64891-(13.50178)));
            yy = -25.39601 + (((tickAnim - 233) / 17) * (-58.38603-(-25.39601)));
            zz = 46.9787+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720))*2 + (((tickAnim - 233) / 17) * (59.96255-(46.9787+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720))*2)));
        }
        else if (tickAnim >= 250 && tickAnim < 256) {
            xx = -11.64891 + (((tickAnim - 250) / 6) * (21.92929-(-11.64891)));
            yy = -58.38603 + (((tickAnim - 250) / 6) * (-61.61946-(-58.38603)));
            zz = 59.96255 + (((tickAnim - 250) / 6) * (27.5257+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720))*2-(59.96255)));
        }
        else if (tickAnim >= 256 && tickAnim < 288) {
            xx = 21.92929 + (((tickAnim - 256) / 32) * (13.50178-(21.92929)));
            yy = -61.61946 + (((tickAnim - 256) / 32) * (-25.39601-(-61.61946)));
            zz = 27.5257+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720))*2 + (((tickAnim - 256) / 32) * (46.9787+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720))*2-(27.5257+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720))*2)));
        }
        else if (tickAnim >= 288 && tickAnim < 305) {
            xx = 13.50178 + (((tickAnim - 288) / 17) * (-11.64891-(13.50178)));
            yy = -25.39601 + (((tickAnim - 288) / 17) * (-58.38603-(-25.39601)));
            zz = 46.9787+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720))*2 + (((tickAnim - 288) / 17) * (59.96255-(46.9787+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720))*2)));
        }
        else if (tickAnim >= 305 && tickAnim < 311) {
            xx = -11.64891 + (((tickAnim - 305) / 6) * (21.92929-(-11.64891)));
            yy = -58.38603 + (((tickAnim - 305) / 6) * (-61.61946-(-58.38603)));
            zz = 59.96255 + (((tickAnim - 305) / 6) * (27.5257+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720))*2-(59.96255)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(RLeg, RLeg.rotateAngleX + (float) Math.toRadians(xx), RLeg.rotateAngleY + (float) Math.toRadians(yy), RLeg.rotateAngleZ + (float) Math.toRadians(zz));



        this.setRotateAngle(Tail, Tail.rotateAngleX + (float) Math.toRadians(12.5+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360))*1), Tail.rotateAngleY + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*22.5))*2), Tail.rotateAngleZ + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*45-50))*-10));


        this.setRotateAngle(Tail2, Tail2.rotateAngleX + (float) Math.toRadians(0), Tail2.rotateAngleY + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*22.5-50))*3), Tail2.rotateAngleZ + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*45-70))*-10));


        this.setRotateAngle(Tail3, Tail3.rotateAngleX + (float) Math.toRadians(0), Tail3.rotateAngleY + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*22.5-100))*2), Tail3.rotateAngleZ + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*45-160))*-15));


        this.setRotateAngle(Tail4, Tail4.rotateAngleX + (float) Math.toRadians(0), Tail4.rotateAngleY + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*22.5-10))*3), Tail4.rotateAngleZ + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*45-150))*-20));

    }

    public void animate(IAnimatedEntity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        animator.update(entity);
        //this.resetToDefaultPose();
    }
}
