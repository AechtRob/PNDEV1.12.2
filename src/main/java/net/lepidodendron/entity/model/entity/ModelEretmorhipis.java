package net.lepidodendron.entity.model.entity;

import net.ilexiconn.llibrary.client.model.ModelAnimator;
import net.ilexiconn.llibrary.client.model.tools.AdvancedModelRenderer;
import net.ilexiconn.llibrary.server.animation.IAnimatedEntity;
import net.lepidodendron.entity.EntityPrehistoricFloraEretmorhipis;
import net.lepidodendron.entity.EntityPrehistoricFloraPanzhousaurus;
import net.lepidodendron.entity.base.EntityPrehistoricFloraAgeableBase;
import net.lepidodendron.entity.model.llibraryextensions.AdvancedModelBaseExtended;
import net.lepidodendron.entity.model.llibraryextensions.AdvancedModelRendererExtended;
import net.minecraft.client.model.ModelBox;
import net.minecraft.entity.Entity;

public class ModelEretmorhipis extends AdvancedModelBaseExtended {
    private final AdvancedModelRendererExtended Eretmorhipis;
    private final AdvancedModelRendererExtended LArm;
    private final AdvancedModelRendererExtended LArm2;
    private final AdvancedModelRendererExtended RArm;
    private final AdvancedModelRendererExtended RArm2;
    private final AdvancedModelRendererExtended Neck;
    private final AdvancedModelRendererExtended cube_r1;
    private final AdvancedModelRendererExtended Head;
    private final AdvancedModelRendererExtended cube_r2;
    private final AdvancedModelRendererExtended cube_r3;
    private final AdvancedModelRendererExtended Jaw;
    private final AdvancedModelRendererExtended Throat;
    private final AdvancedModelRendererExtended Body;
    private final AdvancedModelRendererExtended Body2;
    private final AdvancedModelRendererExtended LLeg;
    private final AdvancedModelRendererExtended LLeg2;
    private final AdvancedModelRendererExtended RLeg;
    private final AdvancedModelRendererExtended RLeg2;
    private final AdvancedModelRendererExtended Tail;
    private final AdvancedModelRendererExtended Tail2;
    private final AdvancedModelRendererExtended Tail3;
    private final AdvancedModelRendererExtended Tail4;

    private ModelAnimator animator;

    public ModelEretmorhipis() {
        this.textureWidth = 64;
        this.textureHeight = 64;

        this.Eretmorhipis = new AdvancedModelRendererExtended(this);
        this.Eretmorhipis.setRotationPoint(0.0F, 21.0F, -6.5F);
        this.setRotateAngle(Eretmorhipis, 0.0175F, 0.0F, 0.0F);
        this.Eretmorhipis.cubeList.add(new ModelBox(Eretmorhipis, 38, 0, -2.0F, -2.0F, -1.5F, 4, 5, 5, 0.01F, false));
        this.Eretmorhipis.cubeList.add(new ModelBox(Eretmorhipis, 45, 43, -0.5F, -2.5F, -0.5F, 1, 1, 2, 0.0F, false));

        this.LArm = new AdvancedModelRendererExtended(this);
        this.LArm.setRotationPoint(1.0F, 2.0F, -0.5F);
        this.Eretmorhipis.addChild(LArm);
        this.setRotateAngle(LArm, 0.3286F, -0.8268F, 1.0574F);
        this.LArm.cubeList.add(new ModelBox(LArm, 0, 46, 0.0F, -1.0F, -1.0F, 3, 1, 3, 0.0F, false));

        this.LArm2 = new AdvancedModelRendererExtended(this);
        this.LArm2.setRotationPoint(2.0F, -0.5F, 0.5F);
        this.LArm.addChild(LArm2);
        this.setRotateAngle(LArm2, 0.0F, 0.2618F, 0.0F);
        this.LArm2.cubeList.add(new ModelBox(LArm2, 38, 11, 0.0F, -0.5F, -1.5F, 4, 1, 4, -0.01F, false));
        this.LArm2.cubeList.add(new ModelBox(LArm2, 18, 22, 2.0F, 0.0F, -1.49F, 6, 0, 5, 0.0F, false));

        this.RArm = new AdvancedModelRendererExtended(this);
        this.RArm.setRotationPoint(-1.0F, 2.0F, -0.5F);
        this.Eretmorhipis.addChild(RArm);
        this.setRotateAngle(RArm, 0.3286F, 0.8268F, -1.0574F);
        this.RArm.cubeList.add(new ModelBox(RArm, 0, 46, -3.0F, -1.0F, -1.0F, 3, 1, 3, 0.0F, true));

        this.RArm2 = new AdvancedModelRendererExtended(this);
        this.RArm2.setRotationPoint(-2.0F, -0.5F, 0.5F);
        this.RArm.addChild(RArm2);
        this.setRotateAngle(RArm2, 0.0F, -0.2618F, 0.0F);
        this.RArm2.cubeList.add(new ModelBox(RArm2, 38, 11, -4.0F, -0.5F, -1.5F, 4, 1, 4, -0.01F, true));
        this.RArm2.cubeList.add(new ModelBox(RArm2, 18, 22, -8.0F, 0.0F, -1.49F, 6, 0, 5, 0.0F, true));

        this.Neck = new AdvancedModelRendererExtended(this);
        this.Neck.setRotationPoint(0.0F, -0.5F, -0.5F);
        this.Eretmorhipis.addChild(Neck);
        this.setRotateAngle(Neck, 0.0436F, 0.0F, 0.0F);
        this.Neck.cubeList.add(new ModelBox(Neck, 19, 40, -1.5F, -1.5F, -5.0F, 3, 2, 5, 0.0F, false));

        this.cube_r1 = new AdvancedModelRendererExtended(this);
        this.cube_r1.setRotationPoint(0.0F, 0.5F, -5.0F);
        this.Neck.addChild(cube_r1);
        this.setRotateAngle(cube_r1, -0.48F, 0.0F, 0.0F);
        this.cube_r1.cubeList.add(new ModelBox(cube_r1, 38, 23, -1.5F, -2.0F, 0.0F, 3, 2, 5, -0.01F, false));

        this.Head = new AdvancedModelRendererExtended(this);
        this.Head.setRotationPoint(0.0F, -1.0F, -4.5F);
        this.Neck.addChild(Head);
        this.setRotateAngle(Head, -0.0873F, 0.0F, 0.0F);
        this.Head.cubeList.add(new ModelBox(Head, 0, 21, -1.0F, 0.0F, -2.0F, 2, 1, 2, -0.01F, false));
        this.Head.cubeList.add(new ModelBox(Head, 0, 5, -1.5F, 0.0F, -3.98F, 3, 1, 2, 0.0F, false));

        this.cube_r2 = new AdvancedModelRendererExtended(this);
        this.cube_r2.setRotationPoint(0.0F, 0.3F, -1.2F);
        this.Head.addChild(cube_r2);
        this.setRotateAngle(cube_r2, 0.0873F, 0.0F, 0.0F);
        this.cube_r2.cubeList.add(new ModelBox(cube_r2, 0, 25, -1.0F, -0.5F, -0.5F, 2, 1, 1, 0.0F, false));

        this.cube_r3 = new AdvancedModelRendererExtended(this);
        this.cube_r3.setRotationPoint(0.0F, -0.5F, 0.0F);
        this.Head.addChild(cube_r3);
        this.setRotateAngle(cube_r3, 0.1309F, 0.0F, 0.0F);
        this.cube_r3.cubeList.add(new ModelBox(cube_r3, 36, 43, -1.0F, 0.0F, -4.0F, 2, 1, 4, -0.02F, false));

        this.Jaw = new AdvancedModelRendererExtended(this);
        this.Jaw.setRotationPoint(0.0F, 1.0F, 0.0F);
        this.Head.addChild(Jaw);
        this.setRotateAngle(Jaw, 0.0F, 0.0F, 0.0F);
        this.Jaw.cubeList.add(new ModelBox(Jaw, 11, 36, -1.0F, -0.5F, -3.95F, 2, 1, 4, -0.03F, false));

        this.Throat = new AdvancedModelRendererExtended(this);
        this.Throat.setRotationPoint(0.0F, 0.47F, -3.92F);
        this.Jaw.addChild(Throat);
        this.Throat.cubeList.add(new ModelBox(Throat, 47, 34, -1.0F, -0.97F, 0.0F, 2, 1, 4, -0.04F, false));

        this.Body = new AdvancedModelRendererExtended(this);
        this.Body.setRotationPoint(0.0F, 0.0F, 3.5F);
        this.Eretmorhipis.addChild(Body);
        this.setRotateAngle(Body, -0.0175F, 0.0F, 0.0F);
        this.Body.cubeList.add(new ModelBox(Body, 31, 41, -0.5F, -2.5F, -1.0F, 1, 1, 2, 0.0F, false));
        this.Body.cubeList.add(new ModelBox(Body, 0, 38, -0.5F, -2.5F, 2.0F, 1, 1, 2, 0.0F, false));
        this.Body.cubeList.add(new ModelBox(Body, 35, 0, -0.5F, -2.5F, 8.0F, 1, 1, 2, 0.0F, false));
        this.Body.cubeList.add(new ModelBox(Body, 22, 5, -0.5F, -2.5F, 5.0F, 1, 1, 2, 0.0F, false));
        this.Body.cubeList.add(new ModelBox(Body, 0, 0, -2.5F, -2.0F, -1.0F, 5, 5, 11, 0.02F, false));

        this.Body2 = new AdvancedModelRendererExtended(this);
        this.Body2.setRotationPoint(0.0F, 0.0F, 9.0F);
        this.Body.addChild(Body2);
        this.setRotateAngle(Body2, -0.0175F, 0.0F, 0.0F);
        this.Body2.cubeList.add(new ModelBox(Body2, 36, 22, -0.5F, -2.5F, 2.0F, 1, 1, 2, 0.0F, false));
        this.Body2.cubeList.add(new ModelBox(Body2, 23, 28, -2.0F, -2.0F, 0.0F, 4, 5, 6, 0.01F, false));

        this.LLeg = new AdvancedModelRendererExtended(this);
        this.LLeg.setRotationPoint(1.5F, 1.5F, 4.0F);
        this.Body2.addChild(LLeg);
        this.setRotateAngle(LLeg, 0.0F, -0.48F, 0.9163F);
        this.LLeg.cubeList.add(new ModelBox(LLeg, 0, 17, 0.0F, -0.5F, -1.0F, 2, 1, 2, 0.0F, false));

        this.LLeg2 = new AdvancedModelRendererExtended(this);
        this.LLeg2.setRotationPoint(1.5F, -0.5F, 0.0F);
        this.LLeg.addChild(LLeg2);
        this.setRotateAngle(LLeg2, 0.0F, -0.2618F, 0.0F);
        this.LLeg2.cubeList.add(new ModelBox(LLeg2, 0, 0, 0.0F, 0.0F, -1.0F, 2, 1, 3, -0.01F, false));
        this.LLeg2.cubeList.add(new ModelBox(LLeg2, 22, 0, 1.0F, 0.5F, -1.0F, 4, 0, 4, 0.0F, false));

        this.RLeg = new AdvancedModelRendererExtended(this);
        this.RLeg.setRotationPoint(-1.5F, 1.5F, 4.0F);
        this.Body2.addChild(RLeg);
        this.setRotateAngle(RLeg, 0.0F, 0.48F, -0.9163F);
        this.RLeg.cubeList.add(new ModelBox(RLeg, 0, 17, -2.0F, -0.5F, -1.0F, 2, 1, 2, 0.0F, true));

        this.RLeg2 = new AdvancedModelRendererExtended(this);
        this.RLeg2.setRotationPoint(-1.5F, -0.5F, 0.0F);
        this.RLeg.addChild(RLeg2);
        this.setRotateAngle(RLeg2, 0.0F, 0.2618F, 0.0F);
        this.RLeg2.cubeList.add(new ModelBox(RLeg2, 0, 0, -2.0F, 0.0F, -1.0F, 2, 1, 3, -0.01F, true));
        this.RLeg2.cubeList.add(new ModelBox(RLeg2, 22, 0, -5.0F, 0.5F, -1.0F, 4, 0, 4, 0.0F, true));

        this.Tail = new AdvancedModelRendererExtended(this);
        this.Tail.setRotationPoint(0.0F, 0.0F, 5.0F);
        this.Body2.addChild(Tail);
        this.setRotateAngle(Tail, 0.0175F, 0.0F, 0.0F);
        this.Tail.cubeList.add(new ModelBox(Tail, 0, 34, -0.5F, -2.5F, 0.0F, 1, 1, 2, 0.0F, false));
        this.Tail.cubeList.add(new ModelBox(Tail, 0, 17, -1.5F, -2.0F, 0.0F, 3, 5, 11, 0.0F, false));

        this.Tail2 = new AdvancedModelRendererExtended(this);
        this.Tail2.setRotationPoint(0.0F, 0.0F, 10.5F);
        this.Tail.addChild(Tail2);
        this.Tail2.cubeList.add(new ModelBox(Tail2, 22, 6, -1.0F, -1.5F, 0.0F, 2, 4, 11, -0.01F, false));

        this.Tail3 = new AdvancedModelRendererExtended(this);
        this.Tail3.setRotationPoint(0.0F, 0.0F, 10.5F);
        this.Tail2.addChild(Tail3);
        this.Tail3.cubeList.add(new ModelBox(Tail3, 0, 34, -0.5F, -1.0F, 0.0F, 1, 3, 8, -0.02F, false));

        this.Tail4 = new AdvancedModelRendererExtended(this);
        this.Tail4.setRotationPoint(0.0F, 0.0F, 7.5F);
        this.Tail3.addChild(Tail4);
        this.Tail4.cubeList.add(new ModelBox(Tail4, 37, 33, -0.5F, -0.5F, 0.0F, 1, 2, 7, -0.03F, false));

        updateDefaultPose();
        animator = ModelAnimator.create();
    }

    @Override
    public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        animate((IAnimatedEntity) entity, f, f1, f2, f3, f4, f5);
        this.Eretmorhipis.render(f5 * 0.215f);
    }
    public void renderStatic(float f) {
        //GlStateManager.pushMatrix();
        //GlStateManager.enableBlend();
        //GlStateManager.blendFunc(GlStateManager.SourceFactor.SRC_ALPHA, GlStateManager.DestFactor.ONE_MINUS_SRC_ALPHA);
        //GlStateManager.disableCull();
        this.setRotateAngle(Eretmorhipis, 0.0175F, 0.0F, 0.0F);
        this.setRotateAngle(LArm, 0.1195F, -0.1796F, 0.0727F);
        this.setRotateAngle(LArm2, 0.0F, 0.2618F, 0.0F);
        this.setRotateAngle(RArm, 0.1071F, 0.2454F, -0.1313F);
        this.setRotateAngle(RArm2, 0.0F, -0.2618F, 0.0F);
        this.setRotateAngle(Neck, 0.0457F, -0.3051F, -0.0138F);
        this.setRotateAngle(cube_r1, -0.48F, 0.0F, 0.0F);
        this.setRotateAngle(Head, -0.0873F, 0.0F, 0.0F);
        this.setRotateAngle(cube_r2, 0.0873F, 0.0F, 0.0F);
        this.setRotateAngle(cube_r3, 0.1309F, 0.0F, 0.0F);
        this.setRotateAngle(Jaw, 0.0F, 0.0F, 0.0F);
        this.setRotateAngle(Body, -0.0175F, 0.0873F, -0.0015F);
        this.setRotateAngle(Body2, -0.0177F, 0.1745F, -0.0031F);
        this.setRotateAngle(LLeg, -0.1353F, -0.4091F, 0.1079F);
        this.setRotateAngle(LLeg2, 0.0F, -0.2618F, 0.0F);
        this.setRotateAngle(RLeg, -0.0262F, 0.3172F, -0.028F);
        this.setRotateAngle(RLeg2, 0.0F, 0.2618F, 0.0F);
        this.setRotateAngle(Tail, 0.0183F, 0.3054F, 0.0055F);
        this.setRotateAngle(Tail2, 0.0F, -0.2618F, 0.0F);
        this.setRotateAngle(Tail3, 0.0F, -0.5672F, 0.0F);
        this.setRotateAngle(Tail4, 0.0F, -0.6545F, 0.0F);
        this.Eretmorhipis.offsetZ = -1F;
        this.Eretmorhipis.render(0.1F);
        //GlStateManager.enableCull();
        //GlStateManager.disableBlend();
        //GlStateManager.popMatrix();
    }
    public void setRotateAngle(AdvancedModelRenderer AdvancedModelRenderer, float x, float y, float z) {
        AdvancedModelRenderer.rotateAngleX = x;
        AdvancedModelRenderer.rotateAngleY = y;
        AdvancedModelRenderer.rotateAngleZ = z;
    }

    @Override
    public void setRotationAngles(float f, float f1, float f2, float f3, float f4, float f5, Entity e) {
        super.setRotationAngles(f, f1, f2, f3, f4, f5, e);
        this.resetToDefaultPose();
        this.Eretmorhipis.offsetY = 1.16F;

        EntityPrehistoricFloraEretmorhipis Eretmorhipis = (EntityPrehistoricFloraEretmorhipis) e;

        this.faceTarget(f3, f4, 5, Neck);
        this.faceTarget(f3, f4, 5, Head);

        float speed = 0.15F;
        AdvancedModelRenderer[] Tail = {this.Body2, this.Tail, this.Tail2, this.Tail3, this.Tail4};

        AdvancedModelRenderer[] FL = {this.LArm, this.LArm2};
        AdvancedModelRenderer[] FR = {this.RArm, this.RArm2};
        AdvancedModelRenderer[] BL = {this.LLeg, this.LLeg2};
        AdvancedModelRenderer[] BR = {this.RLeg, this.RLeg2};

        if (!Eretmorhipis.isReallyInWater()) {//on land

            this.setRotateAngle(LArm, -(float) Math.toRadians(-3.4736), -(float) Math.toRadians(-8.9173), -(float) Math.toRadians(-10.0869));
            this.setRotateAngle(RArm, (float) Math.toRadians(-3.4736), (float) Math.toRadians(-8.9173), (float) Math.toRadians(-10.0869));
            this.setRotateAngle(LLeg, -(float) Math.toRadians(-15.6263), -(float) Math.toRadians(-22.9193), -(float) Math.toRadians(-16.8133));
            this.setRotateAngle(RLeg, (float) Math.toRadians(-15.6263), (float) Math.toRadians(-22.9193), (float) Math.toRadians(-16.8133));
            return;
        }
        else {
            speed = speed * 2F;
/*
            this.leftarm2.rotateAngleZ = (float) Math.toRadians(32);
            this.rightarm2.rotateAngleZ = (float) Math.toRadians(-32);

            this.leftleg2.rotateAngleZ = (float) Math.toRadians(28);
            this.rightleg2.rotateAngleZ = (float) Math.toRadians(-28);


 */




           // this.chainSwing(Torso, speed, 0.09F, -3, f2, 1);
            if (f3 == 0.0F) {//idle
                this.chainFlapExtended(FR, speed * 0.1F, 0.2F, 0, 0, f2, 0.8F);
                this.chainFlapExtended(FL, speed * 0.1F, 0.2F, 0, 3F, f2, 0.8F);

                this.chainFlapExtended(BR, speed * 0.1F, 0.1F, 0, 3F, f2, 0.8F);
                this.chainFlapExtended(BL, speed * 0.1F, 0.1F, 0, 0, f2, 0.8F);

                this.chainWave(Tail, speed*0.1F, 0.05F, -3, f2, 1);
                this.chainSwing(Tail, speed*0.1F, 0.35F, -3, f2, 1F);
                return;
            }


            this.chainFlapExtended(FR, speed * 0.8F, 0.35F, 0, -3, f2, 0.8F);
            this.chainFlapExtended(FL, speed * 0.8F, 0.35F, 0, 3F, f2, 0.8F);
            this.chainSwingExtended(FR, speed * 0.8F, 0.2F, 0, -3, f2, 0.8F);
            this.chainSwingExtended(FL, speed * 0.8F, 0.2F, 0, 3F, f2, 0.8F);
            this.chainFlapExtended(BR, speed * 0.8F, 0.2F, 0, 3F, f2, 0.8F);
            this.chainFlapExtended(BL, speed * 0.8F, 0.2F, 0, -3, f2, 0.8F);
/*
            this.chainSwingExtended(FR, speed * 0.8F, 0.28F, -0, 0, f2, 0.8F);
            this.chainSwingExtended(FL, speed * 0.8F, 0.28F, -0, 3F, f2, 0.8F);

            this.chainSwingExtended(BR, speed * 0.8F, 0.22F, -0, 3F, f2, 0.8F);
            this.chainSwingExtended(BL, speed * 0.8F, 0.22F, -0, 0, f2, 0.8F);

            this.chainSwingExtended(FR, speed * 0.8F, 0.28F, -0, 0, f2, 0.8F);
            this.chainSwingExtended(FL, speed * 0.8F, 0.28F, -0, 3F, f2, 0.8F);
            this.chainSwingExtended(BR, speed * 0.8F, 0.22F, -0, 3F, f2, 0.8F);
            this.chainSwingExtended(BL, speed * 0.8F, 0.22F, -0, 0, f2, 0.8F);

 */

            this.chainWave(Tail, speed, 0.05F, -3, f2, 1);
            this.chainSwing(Tail, speed, 0.35F, -3, f2, 1F);

        }
    }

    public void animate(IAnimatedEntity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        EntityPrehistoricFloraAgeableBase e = (EntityPrehistoricFloraAgeableBase) entity;
        animator.update(entity);
        this.resetToDefaultPose();
        setRotationAngles(f, f1, f2, f3, f4, f5, (Entity) entity);

        animator.setAnimation(e.ATTACK_ANIMATION);
        animator.startKeyframe(5);
        animator.rotate(this.Head, (float) Math.toRadians(-17.5), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(this.Jaw, (float) Math.toRadians(40), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.endKeyframe();
        animator.setStaticKeyframe(2);
        animator.resetKeyframe(2);

        animator.setAnimation(e.ROAR_ANIMATION);
        animator.startKeyframe(5);
        animator.rotate(this.Head, (float) Math.toRadians(-17.5), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(this.Jaw, (float) Math.toRadians(35), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(this.Neck, (float) Math.toRadians(0), (float) Math.toRadians(25), (float) Math.toRadians(0));
        animator.endKeyframe();
        animator.setStaticKeyframe(5);
        animator.resetKeyframe(10);
    }
}
