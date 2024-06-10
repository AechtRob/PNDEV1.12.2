package net.lepidodendron.entity.model.entity;

import net.ilexiconn.llibrary.client.model.ModelAnimator;
import net.ilexiconn.llibrary.client.model.tools.AdvancedModelRenderer;
import net.ilexiconn.llibrary.server.animation.IAnimatedEntity;
import net.lepidodendron.entity.EntityPrehistoricFloraEusthenopteron;
import net.lepidodendron.entity.base.EntityPrehistoricFloraAgeableBase;
import net.lepidodendron.entity.model.ModelBasePalaeopedia;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

public class ModelEusthenopteron extends ModelBasePalaeopedia {
    private final AdvancedModelRenderer body;
    private final AdvancedModelRenderer body3_r1;
    private final AdvancedModelRenderer body2_r1;
    private final AdvancedModelRenderer pectoralfinL;
    private final AdvancedModelRenderer pectoralfinR;
    private final AdvancedModelRenderer dorsalfin1;
    private final AdvancedModelRenderer head;
    private final AdvancedModelRenderer headlow_r1;
    private final AdvancedModelRenderer head_r1;
    private final AdvancedModelRenderer upperjaw;
    private final AdvancedModelRenderer tooth3_r1;
    private final AdvancedModelRenderer tooth2_r1;
    private final AdvancedModelRenderer head1_r1;
    private final AdvancedModelRenderer head2_r1;
    private final AdvancedModelRenderer jaw;
    private final AdvancedModelRenderer jaw2_r1;
    private final AdvancedModelRenderer jaw1_r1;
    private final AdvancedModelRenderer tooth3_r2;
    private final AdvancedModelRenderer tooth2_r2;
    private final AdvancedModelRenderer body2;
    private final AdvancedModelRenderer pelvicfinL;
    private final AdvancedModelRenderer pelvicfinR;
    private final AdvancedModelRenderer body3;
    private final AdvancedModelRenderer body4;
    private final AdvancedModelRenderer dorsalfin2;
    private final AdvancedModelRenderer analfin;
    private final AdvancedModelRenderer body5;
    private final AdvancedModelRenderer finbase2_r1;
    private final AdvancedModelRenderer finbase1_r1;

    private ModelAnimator animator;

    public ModelEusthenopteron() {
        this.textureWidth = 128;
        this.textureHeight = 128;

        this.body = new AdvancedModelRenderer(this);
        this.body.setRotationPoint(0.0F, 24.0F, -12.0F);
        this.body.cubeList.add(new ModelBox(body, 42, 0, -4.5F, -9.0F, 8.5F, 9, 10, 8, 0.0F, false));
        this.body.cubeList.add(new ModelBox(body, 0, 0, -4.5F, -9.5F, 16.5F, 9, 11, 24, 0.0F, false));

        this.body3_r1 = new AdvancedModelRenderer(this);
        this.body3_r1.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.body.addChild(body3_r1);
        this.setRotateAngle(body3_r1, -0.0436F, 0.0F, 0.0F);
        this.body3_r1.cubeList.add(new ModelBox(body3_r1, 70, 20, -4.0F, -0.25F, 8.75F, 8, 1, 8, 0.0F, false));

        this.body2_r1 = new AdvancedModelRenderer(this);
        this.body2_r1.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.body.addChild(body2_r1);
        this.setRotateAngle(body2_r1, 0.0436F, 0.0F, 0.0F);
        this.body2_r1.cubeList.add(new ModelBox(body2_r1, 73, 38, -4.0F, -8.75F, 8.85F, 8, 1, 8, 0.0F, false));

        this.pectoralfinL = new AdvancedModelRenderer(this);
        this.pectoralfinL.setRotationPoint(3.5F, -1.25F, 9.75F);
        this.body.addChild(pectoralfinL);
        this.setRotateAngle(pectoralfinL, -0.4363F, -0.7854F, 0.5236F);
        this.pectoralfinL.cubeList.add(new ModelBox(pectoralfinL, 54, 20, 0.0F, 0.0F, -1.0F, 4, 2, 2, 0.0F, false));
        this.pectoralfinL.cubeList.add(new ModelBox(pectoralfinL, 35, 44, 4.0F, 0.0F, -0.5F, 2, 2, 1, 0.0F, false));
        this.pectoralfinL.cubeList.add(new ModelBox(pectoralfinL, 68, 0, 5.0F, -1.5F, 0.0F, 8, 5, 0, 0.0F, false));

        this.pectoralfinR = new AdvancedModelRenderer(this);
        this.pectoralfinR.setRotationPoint(-3.5F, -1.25F, 9.75F);
        this.body.addChild(pectoralfinR);
        this.setRotateAngle(pectoralfinR, -0.4363F, 0.7854F, -0.5236F);
        this.pectoralfinR.cubeList.add(new ModelBox(pectoralfinR, 42, 20, -4.0F, 0.0F, -1.0F, 4, 2, 2, 0.0F, false));
        this.pectoralfinR.cubeList.add(new ModelBox(pectoralfinR, 29, 44, -6.0F, 0.0F, -0.5F, 2, 2, 1, 0.0F, false));
        this.pectoralfinR.cubeList.add(new ModelBox(pectoralfinR, 30, 65, -13.0F, -1.5F, 0.0F, 8, 5, 0, 0.0F, false));

        this.dorsalfin1 = new AdvancedModelRenderer(this);
        this.dorsalfin1.setRotationPoint(0.0F, -9.0F, 40.0F);
        this.body.addChild(dorsalfin1);
        this.setRotateAngle(dorsalfin1, -0.6981F, 0.0F, 0.0F);
        this.dorsalfin1.cubeList.add(new ModelBox(dorsalfin1, 29, 29, 0.0F, -8.5F, -1.0F, 0, 9, 6, 0.0F, false));

        this.head = new AdvancedModelRenderer(this);
        this.head.setRotationPoint(0.0F, -4.0F, 9.0F);
        this.body.addChild(head);
        this.head.cubeList.add(new ModelBox(head, 0, 77, -4.5F, -4.0F, -5.5F, 9, 8, 5, 0.0F, false));

        this.headlow_r1 = new AdvancedModelRenderer(this);
        this.headlow_r1.setRotationPoint(0.0F, 4.0F, -9.0F);
        this.head.addChild(headlow_r1);
        this.setRotateAngle(headlow_r1, -0.0873F, 0.0F, 0.0F);
        this.headlow_r1.cubeList.add(new ModelBox(headlow_r1, 0, 0, -3.5F, -1.0F, 3.5F, 7, 1, 5, 0.0F, false));

        this.head_r1 = new AdvancedModelRenderer(this);
        this.head_r1.setRotationPoint(0.0F, 4.0F, -9.0F);
        this.head.addChild(head_r1);
        this.setRotateAngle(head_r1, 0.1309F, 0.0F, 0.0F);
        this.head_r1.cubeList.add(new ModelBox(head_r1, 77, 54, -3.0F, -5.0F, -1.5F, 6, 1, 8, 0.0F, false));
        this.head_r1.cubeList.add(new ModelBox(head_r1, 0, 35, -2.99F, -8.0F, -7.4F, 6, 3, 17, 0.0F, false));

        this.upperjaw = new AdvancedModelRenderer(this);
        this.upperjaw.setRotationPoint(0.0F, 3.25F, -5.45F);
        this.head.addChild(upperjaw);
        this.setRotateAngle(upperjaw, -0.1745F, 0.0F, 0.0F);
        this.upperjaw.cubeList.add(new ModelBox(upperjaw, 29, 35, -3.0F, -4.0F, -12.9F, 6, 3, 12, 0.0F, false));
        this.upperjaw.cubeList.add(new ModelBox(upperjaw, 0, 6, -2.5F, -1.25F, -12.65F, 5, 1, 0, 0.0F, false));

        this.tooth3_r1 = new AdvancedModelRenderer(this);
        this.tooth3_r1.setRotationPoint(0.0F, 4.0F, -5.0F);
        this.upperjaw.addChild(tooth3_r1);
        this.setRotateAngle(tooth3_r1, 0.0F, -0.1309F, 0.0F);
        this.tooth3_r1.cubeList.add(new ModelBox(tooth3_r1, 0, 12, -3.65F, -5.35F, -7.0F, 0, 1, 10, 0.0F, false));

        this.tooth2_r1 = new AdvancedModelRenderer(this);
        this.tooth2_r1.setRotationPoint(0.0F, 4.0F, -5.0F);
        this.upperjaw.addChild(tooth2_r1);
        this.setRotateAngle(tooth2_r1, 0.0F, 0.1309F, 0.0F);
        this.tooth2_r1.cubeList.add(new ModelBox(tooth2_r1, 0, 13, 3.65F, -5.35F, -7.0F, 0, 1, 10, 0.0F, false));

        this.head1_r1 = new AdvancedModelRenderer(this);
        this.head1_r1.setRotationPoint(0.0F, 4.0F, -3.7F);
        this.upperjaw.addChild(head1_r1);
        this.setRotateAngle(head1_r1, 0.0F, 0.1309F, 0.0F);
        this.head1_r1.cubeList.add(new ModelBox(head1_r1, 56, 38, 2.25F, -8.01F, -8.5F, 2, 3, 13, 0.0F, false));

        this.head2_r1 = new AdvancedModelRenderer(this);
        this.head2_r1.setRotationPoint(0.0F, 4.0F, -3.7F);
        this.upperjaw.addChild(head2_r1);
        this.setRotateAngle(head2_r1, 0.0F, -0.1309F, 0.0F);
        this.head2_r1.cubeList.add(new ModelBox(head2_r1, 53, 22, -4.25F, -8.01F, -8.5F, 2, 3, 13, 0.0F, false));

        this.jaw = new AdvancedModelRenderer(this);
        this.jaw.setRotationPoint(0.0F, 1.65F, -6.5F);
        this.head.addChild(jaw);
        this.setRotateAngle(jaw, -0.1745F, 0.0F, 0.0F);
        this.jaw.cubeList.add(new ModelBox(jaw, 14, 21, -1.5F, -0.75F, -11.35F, 3, 1, 0, 0.0F, false));
        this.jaw.cubeList.add(new ModelBox(jaw, 33, 50, -2.5F, 0.0F, -11.5F, 5, 2, 13, 0.0F, false));

        this.jaw2_r1 = new AdvancedModelRenderer(this);
        this.jaw2_r1.setRotationPoint(0.0F, 2.0F, -3.4F);
        this.jaw.addChild(jaw2_r1);
        this.setRotateAngle(jaw2_r1, 0.0F, 0.1309F, 0.0F);
        this.jaw2_r1.cubeList.add(new ModelBox(jaw2_r1, 63, 5, 1.7F, -2.01F, -7.5F, 2, 2, 13, 0.0F, false));

        this.jaw1_r1 = new AdvancedModelRenderer(this);
        this.jaw1_r1.setRotationPoint(0.0F, 2.0F, -3.4F);
        this.jaw.addChild(jaw1_r1);
        this.setRotateAngle(jaw1_r1, 0.0F, -0.1309F, 0.0F);
        this.jaw1_r1.cubeList.add(new ModelBox(jaw1_r1, 13, 62, -3.7F, -2.01F, -7.5F, 2, 2, 13, 0.0F, false));

        this.tooth3_r2 = new AdvancedModelRenderer(this);
        this.tooth3_r2.setRotationPoint(0.0F, 2.0F, -3.5F);
        this.jaw.addChild(tooth3_r2);
        this.setRotateAngle(tooth3_r2, 0.0F, -0.1309F, 0.0F);
        this.tooth3_r2.cubeList.add(new ModelBox(tooth3_r2, 42, 8, -3.4F, -2.76F, -7.5F, 0, 1, 10, 0.0F, false));

        this.tooth2_r2 = new AdvancedModelRenderer(this);
        this.tooth2_r2.setRotationPoint(0.0F, 2.0F, -3.5F);
        this.jaw.addChild(tooth2_r2);
        this.setRotateAngle(tooth2_r2, 0.0F, 0.1309F, 0.0F);
        this.tooth2_r2.cubeList.add(new ModelBox(tooth2_r2, 42, 9, 3.4F, -2.76F, -7.5F, 0, 1, 10, 0.0F, false));

        this.body2 = new AdvancedModelRenderer(this);
        this.body2.setRotationPoint(0.0F, -5.0F, 40.0F);
        this.body.addChild(body2);
        this.body2.cubeList.add(new ModelBox(body2, 36, 70, -3.5F, -3.75F, 0.5F, 7, 9, 7, 0.0F, false));

        this.pelvicfinL = new AdvancedModelRenderer(this);
        this.pelvicfinL.setRotationPoint(2.25F, 3.25F, 0.0F);
        this.body2.addChild(pelvicfinL);
        this.setRotateAngle(pelvicfinL, -0.4363F, -0.7854F, 0.5236F);
        this.pelvicfinL.cubeList.add(new ModelBox(pelvicfinL, 14, 10, 1.0F, 0.0F, -1.0F, 3, 2, 2, 0.0F, false));
        this.pelvicfinL.cubeList.add(new ModelBox(pelvicfinL, 42, 5, 4.0F, 0.0F, -0.5F, 2, 2, 1, 0.0F, false));
        this.pelvicfinL.cubeList.add(new ModelBox(pelvicfinL, 26, 55, 5.0F, -1.5F, 0.0F, 8, 5, 0, 0.0F, false));

        this.pelvicfinR = new AdvancedModelRenderer(this);
        this.pelvicfinR.setRotationPoint(-2.25F, 3.25F, 0.0F);
        this.body2.addChild(pelvicfinR);
        this.setRotateAngle(pelvicfinR, -0.4363F, 0.7854F, -0.5236F);
        this.pelvicfinR.cubeList.add(new ModelBox(pelvicfinR, 14, 6, -4.0F, 0.0F, -1.0F, 3, 2, 2, 0.0F, false));
        this.pelvicfinR.cubeList.add(new ModelBox(pelvicfinR, 14, 18, -6.0F, 0.0F, -0.5F, 2, 2, 1, 0.0F, false));
        this.pelvicfinR.cubeList.add(new ModelBox(pelvicfinR, 0, 47, -13.0F, -1.5F, 0.0F, 8, 5, 0, 0.0F, false));

        this.body3 = new AdvancedModelRenderer(this);
        this.body3.setRotationPoint(0.0F, 0.0F, 7.0F);
        this.body2.addChild(body3);
        this.body3.cubeList.add(new ModelBox(body3, 64, 72, -3.0F, -3.749F, 0.5F, 6, 9, 7, 0.0F, false));

        this.body4 = new AdvancedModelRenderer(this);
        this.body4.setRotationPoint(0.0F, 0.0F, 7.25F);
        this.body3.addChild(body4);
        this.body4.cubeList.add(new ModelBox(body4, 59, 55, -2.0F, -2.75F, 0.25F, 4, 7, 10, 0.0F, false));

        this.dorsalfin2 = new AdvancedModelRenderer(this);
        this.dorsalfin2.setRotationPoint(0.0F, -3.0F, -0.25F);
        this.body4.addChild(dorsalfin2);
        this.setRotateAngle(dorsalfin2, -0.6109F, 0.0F, 0.0F);
        this.dorsalfin2.cubeList.add(new ModelBox(dorsalfin2, 0, 28, 0.0F, -11.75F, -1.5F, 0, 12, 7, 0.0F, false));

        this.analfin = new AdvancedModelRenderer(this);
        this.analfin.setRotationPoint(0.0F, 4.0F, -0.25F);
        this.body4.addChild(analfin);
        this.setRotateAngle(analfin, 0.7854F, 0.0F, 0.0F);
        this.analfin.cubeList.add(new ModelBox(analfin, 0, 0, 0.0F, 0.25F, -1.5F, 0, 15, 7, 0.0F, false));

        this.body5 = new AdvancedModelRenderer(this);
        this.body5.setRotationPoint(0.0F, 0.25F, 9.75F);
        this.body4.addChild(body5);
        this.body5.cubeList.add(new ModelBox(body5, 0, 94, -0.01F, -10.0F, 1.0F, 0, 20, 14, 0.0F, false));
        this.body5.cubeList.add(new ModelBox(body5, 14, 14, -0.5F, -0.7F, 7.5F, 1, 1, 3, 0.0F, false));
        this.body5.cubeList.add(new ModelBox(body5, 0, 0, -0.5F, -1.0F, 6.5F, 1, 2, 1, 0.0F, false));
        this.body5.cubeList.add(new ModelBox(body5, 42, 0, -0.5F, -1.25F, 4.5F, 1, 3, 2, 0.0F, false));

        this.finbase2_r1 = new AdvancedModelRenderer(this);
        this.finbase2_r1.setRotationPoint(0.0F, 6.75F, -62.0F);
        this.body5.addChild(finbase2_r1);
        this.setRotateAngle(finbase2_r1, 0.3142F, 0.0F, 0.0F);
        this.finbase2_r1.cubeList.add(new ModelBox(finbase2_r1, 80, 0, -1.0F, 12.725F, 59.95F, 2, 4, 6, 0.0F, false));

        this.finbase1_r1 = new AdvancedModelRenderer(this);
        this.finbase1_r1.setRotationPoint(0.0F, 6.75F, -62.0F);
        this.body5.addChild(finbase1_r1);
        this.setRotateAngle(finbase1_r1, -0.3491F, 0.0F, 0.0F);
        this.finbase1_r1.cubeList.add(new ModelBox(finbase1_r1, 53, 38, -1.5F, -30.6F, 55.4F, 3, 4, 5, 0.0F, false));

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
        this.body.offsetX = -0.25F;
        this.body.offsetZ = 0.08F;
        this.body.render(0.01F);
        this.resetToDefaultPose();
    }
    public void renderStaticFloor(float f) {
        this.setRotateAngle(body, 0.1F, -0.1F, 0.0F);
        this.setRotateAngle(head, 0.0F, -0.2F, 0.0F);
        this.setRotateAngle(jaw, -0.1F, 0.0F, 0.0F);
        this.setRotateAngle(body2, 0.0F, 0.05F, 0.0F);
        this.setRotateAngle(body3, 0.0F, 0.1F, 0.0F);
        this.setRotateAngle(body4, 0.0F, 0.1F, 0.0F);
        this.setRotateAngle(body5, 0.0F, 0.2F, 0.0F);
        this.body.offsetZ = -0.2F;
        this.body.offsetY = -0.05F;
        this.body.offsetX = 0.032F;
        this.body.render(0.01F);
        this.resetToDefaultPose();
    }

    public void setRotateAngle(ModelRenderer AdvancedModelRenderer, float x, float y, float z) {
        AdvancedModelRenderer.rotateAngleX = x;
        AdvancedModelRenderer.rotateAngleY = y;
        AdvancedModelRenderer.rotateAngleZ = z;
    }

    @Override
    public void setRotationAngles(float f, float f1, float f2, float f3, float f4, float f5, Entity e) {
        super.setRotationAngles(f, f1, f2, f3, f4, f5, e);
        this.resetToDefaultPose();

        this.body.offsetY = -0.2F;
        this.body.offsetZ = -0.55F;

        AdvancedModelRenderer[] fishTail = {this.body2, this.body3, this.body4, this.body5};
        ((EntityPrehistoricFloraEusthenopteron)e).tailBuffer.applyChainSwingBuffer(fishTail);

        float speed = 0.198F;
        EntityPrehistoricFloraAgeableBase ee = (EntityPrehistoricFloraAgeableBase) e;
        if (ee.getIsFast()) {
            speed = speed * 2.2F;
        }
        float still = 1f;
        if (f3 == 0.0F) {
            still = 0.6F;
        }
        if (!e.isInWater()) {
            speed = 0.225F;
        }

        speed = speed * 1.3F;

        if (e.isInWater()) {
            this.chainWave(fishTail, speed * still, 0.02F * still, -0.2, f2, 0.8F * still);
            this.chainSwing(fishTail, speed * still, 0.40F * still, -1.05, f2, 0.5F * still);
            this.swing(body, speed, 0.16F, true, 0, 0, f2, 0.8F);
        }
        else {
            this.swing(body, speed, 0.05F, true, 0, 0, f2, 0.5F);
        }

        this.walk(pectoralfinL, (float) (speed * 0.75), 0.2F, true, 3, 0, f2, 1);
        this.swing(pectoralfinL, (float) (speed * 0.75), 0.2F, true, 3, 0, f2, 1);
        this.walk(pectoralfinR, (float) (speed * 0.75), 0.2F, true, 0, 0, f2, 1);
        this.swing(pectoralfinR, (float) (speed * 0.75), -0.2F, true, 0, 0, f2, 1);

        this.walk(pelvicfinL, (float) (speed * 0.75), 0.2F, true, 0, 0, f2, 1);
        this.swing(pelvicfinL, (float) (speed * 0.75), 0.2F, true, 0, 0, f2, 1);
        this.flap(pelvicfinL, (float) (speed * 0.75), 0.2F, true, 0, 0, f2, 1);

        this.walk(pelvicfinR, (float) (speed * 0.75), 0.2F, true, 3, 0, f2, 1);
        this.swing(pelvicfinR, (float) (speed * 0.75), -0.2F, true, 3, 0, f2, 1);
        this.flap(pelvicfinR, (float) (speed * 0.75), 0.2F, true, 3, 0, f2, 1);

        this.walk(dorsalfin1, (float) (speed * 0.75), 0.1F, true, 0, -0.05F, f2, 0.5F);
        this.swing(dorsalfin1, (float) (speed * 0.75 * 0.5), 0.1F, true, 0, 0.05F, f2, 1);

        if (!e.isInWater()) {
            this.body.rotateAngleZ = (float) Math.toRadians(90);
            this.body.offsetY = -0.3F;
            this.bob(body, -speed * 1.8F, 2.5F, false, f2, 1);
            this.chainWave(fishTail, speed * 1.5F, 0.02F, -0.2, f2, 0.8F * still);
            this.chainSwing(fishTail, speed * 1.5F, 0.2F, -0.55, f2, 0.4F * still);

        }

    }

    public void animate(IAnimatedEntity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        EntityPrehistoricFloraAgeableBase e = (EntityPrehistoricFloraAgeableBase) entity;
        animator.update(entity);
        this.resetToDefaultPose();
        setRotationAngles(f, f1, f2, f3, f4, f5, (Entity) entity);

        animator.setAnimation(e.ATTACK_ANIMATION);
        animator.startKeyframe(5);
        animator.rotate(this.jaw, (float) Math.toRadians(40), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(this.head, (float) Math.toRadians(-7.5), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.endKeyframe();
        animator.setStaticKeyframe(4);
        animator.resetKeyframe(3);
    }
}