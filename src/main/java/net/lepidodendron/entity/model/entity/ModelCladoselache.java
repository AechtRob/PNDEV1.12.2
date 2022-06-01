package net.lepidodendron.entity.model.entity;

import net.ilexiconn.llibrary.client.model.ModelAnimator;
import net.ilexiconn.llibrary.client.model.tools.AdvancedModelBase;
import net.ilexiconn.llibrary.client.model.tools.AdvancedModelRenderer;
import net.ilexiconn.llibrary.server.animation.IAnimatedEntity;
import net.lepidodendron.entity.base.EntityPrehistoricFloraAgeableBase;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.entity.Entity;

public class ModelCladoselache extends AdvancedModelBase {
    private final AdvancedModelRenderer body;
    private final AdvancedModelRenderer jaw;
    private final AdvancedModelRenderer head;
    private final AdvancedModelRenderer head1_r1;
    private final AdvancedModelRenderer body1;
    private final AdvancedModelRenderer gillR_r1;
    private final AdvancedModelRenderer body1_2_r1;
    private final AdvancedModelRenderer body1_1_r1;
    private final AdvancedModelRenderer gillL_r1;
    private final AdvancedModelRenderer body2;
    private final AdvancedModelRenderer pectoralfinL;
    private final AdvancedModelRenderer pectoralfinL_r1;
    private final AdvancedModelRenderer pectoralfinR;
    private final AdvancedModelRenderer pectoralfinR_r1;
    private final AdvancedModelRenderer body3;
    private final AdvancedModelRenderer pelvicfinL;
    private final AdvancedModelRenderer pelvicfinL_r1;
    private final AdvancedModelRenderer pelvicfinR;
    private final AdvancedModelRenderer pelvicfinR_r1;
    private final AdvancedModelRenderer body4;
    private final AdvancedModelRenderer body5;
    private final AdvancedModelRenderer body6;
    private final AdvancedModelRenderer caudalfin;
    private final AdvancedModelRenderer caudalfinD_r1;
    private final AdvancedModelRenderer caudalfinU_r1;

    private ModelAnimator animator;

    public ModelCladoselache() {
        this.textureWidth = 128;
        this.textureHeight = 128;

        this.body = new AdvancedModelRenderer(this);
        this.body.setRotationPoint(0.0F, 24.0F, 0.0F);


        this.jaw = new AdvancedModelRenderer(this);
        this.jaw.setRotationPoint(0.0F, -6.0F, -2.0F);
        this.body.addChild(jaw);
        this.jaw.cubeList.add(new ModelBox(jaw, 46, 28, -2.0F, 0.0F, -6.0F, 4, 1, 6, 0.0F, false));

        this.head = new AdvancedModelRenderer(this);
        this.head.setRotationPoint(0.0F, -6.0F, -2.0F);
        this.body.addChild(head);
        this.head.cubeList.add(new ModelBox(head, 42, 0, -2.5F, -2.0F, -6.0F, 5, 2, 6, 0.0F, false));

        this.head1_r1 = new AdvancedModelRenderer(this);
        this.head1_r1.setRotationPoint(0.0F, 6.0F, 2.0F);
        this.head.addChild(head1_r1);
        this.setRotateAngle(head1_r1, 0.1309F, 0.0F, 0.0F);
        this.head1_r1.cubeList.add(new ModelBox(head1_r1, 43, 11, -1.5F, -9.25F, -7.5F, 3, 2, 7, 0.0F, false));

        this.body1 = new AdvancedModelRenderer(this);
        this.body1.setRotationPoint(0.0F, -7.0F, -2.0F);
        this.body.addChild(body1);
        this.body1.cubeList.add(new ModelBox(body1, 30, 34, -2.5F, -2.0F, 0.0F, 5, 4, 6, 0.0F, false));

        this.gillR_r1 = new AdvancedModelRenderer(this);
        this.gillR_r1.setRotationPoint(0.0F, 7.0F, 2.0F);
        this.body1.addChild(gillR_r1);
        this.setRotateAngle(gillR_r1, 0.0F, -0.0436F, 0.0F);
        this.gillR_r1.cubeList.add(new ModelBox(gillR_r1, 22, 48, -2.75F, -8.001F, -1.75F, 1, 3, 6, 0.0F, false));

        this.body1_2_r1 = new AdvancedModelRenderer(this);
        this.body1_2_r1.setRotationPoint(0.0F, 7.0F, 2.0F);
        this.body1.addChild(body1_2_r1);
        this.setRotateAngle(body1_2_r1, -0.0873F, 0.0F, 0.0F);
        this.body1_2_r1.cubeList.add(new ModelBox(body1_2_r1, 44, 20, -2.0F, -5.75F, -2.0F, 4, 1, 6, 0.0F, false));

        this.body1_1_r1 = new AdvancedModelRenderer(this);
        this.body1_1_r1.setRotationPoint(0.0F, 7.0F, 2.0F);
        this.body1.addChild(body1_1_r1);
        this.setRotateAngle(body1_1_r1, 0.0873F, 0.0F, 0.0F);
        this.body1_1_r1.cubeList.add(new ModelBox(body1_1_r1, 38, 44, -2.0F, -9.25F, -1.0F, 4, 1, 6, 0.0F, false));

        this.gillL_r1 = new AdvancedModelRenderer(this);
        this.gillL_r1.setRotationPoint(0.0F, 7.0F, 2.0F);
        this.body1.addChild(gillL_r1);
        this.setRotateAngle(gillL_r1, 0.0F, 0.0436F, 0.0F);
        this.gillL_r1.cubeList.add(new ModelBox(gillL_r1, 10, 51, 1.75F, -8.001F, -1.75F, 1, 3, 6, 0.0F, false));

        this.body2 = new AdvancedModelRenderer(this);
        this.body2.setRotationPoint(0.0F, 0.0F, 6.0F);
        this.body1.addChild(body2);
        this.body2.cubeList.add(new ModelBox(body2, 28, 36, 0.0F, -6.0F, 2.0F, 0, 4, 8, 0.0F, false));
        this.body2.cubeList.add(new ModelBox(body2, 0, 0, -3.0F, -2.5F, 0.0F, 6, 5, 12, 0.0F, false));
        this.body2.cubeList.add(new ModelBox(body2, 0, 17, -2.5F, 1.75F, 0.5F, 5, 1, 11, 0.0F, false));

        this.pectoralfinL = new AdvancedModelRenderer(this);
        this.pectoralfinL.setRotationPoint(3.0F, 2.0F, 2.0F);
        this.body2.addChild(pectoralfinL);


        this.pectoralfinL_r1 = new AdvancedModelRenderer(this);
        this.pectoralfinL_r1.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.pectoralfinL.addChild(pectoralfinL_r1);
        this.setRotateAngle(pectoralfinL_r1, 0.0F, 0.0F, 0.4363F);
        this.pectoralfinL_r1.cubeList.add(new ModelBox(pectoralfinL_r1, 16, 34, 0.0F, 0.0F, -3.0F, 7, 0, 6, 0.0F, false));

        this.pectoralfinR = new AdvancedModelRenderer(this);
        this.pectoralfinR.setRotationPoint(-3.0F, 2.0F, 2.0F);
        this.body2.addChild(pectoralfinR);


        this.pectoralfinR_r1 = new AdvancedModelRenderer(this);
        this.pectoralfinR_r1.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.pectoralfinR.addChild(pectoralfinR_r1);
        this.setRotateAngle(pectoralfinR_r1, 0.0F, 0.0F, -0.4363F);
        this.pectoralfinR_r1.cubeList.add(new ModelBox(pectoralfinR_r1, 30, 12, -7.0F, 0.0F, -3.0F, 7, 0, 6, 0.0F, false));

        this.body3 = new AdvancedModelRenderer(this);
        this.body3.setRotationPoint(0.0F, 0.0F, 12.0F);
        this.body2.addChild(body3);
        this.body3.cubeList.add(new ModelBox(body3, 0, 0, 0.0F, -5.0F, 6.0F, 0, 3, 6, 0.0F, false));
        this.body3.cubeList.add(new ModelBox(body3, 24, 21, -3.0F, -2.51F, 0.0F, 6, 5, 8, 0.0F, false));

        this.pelvicfinL = new AdvancedModelRenderer(this);
        this.pelvicfinL.setRotationPoint(3.0F, 2.0F, 7.0F);
        this.body3.addChild(pelvicfinL);


        this.pelvicfinL_r1 = new AdvancedModelRenderer(this);
        this.pelvicfinL_r1.setRotationPoint(-1.0F, 0.0F, 0.0F);
        this.pelvicfinL.addChild(pelvicfinL_r1);
        this.setRotateAngle(pelvicfinL_r1, 0.0F, 0.0F, 0.2618F);
        this.pelvicfinL_r1.cubeList.add(new ModelBox(pelvicfinL_r1, 0, 17, 0.5F, 0.0F, -1.5F, 3, 0, 4, 0.0F, false));

        this.pelvicfinR = new AdvancedModelRenderer(this);
        this.pelvicfinR.setRotationPoint(-3.0F, 2.0F, 7.0F);
        this.body3.addChild(pelvicfinR);


        this.pelvicfinR_r1 = new AdvancedModelRenderer(this);
        this.pelvicfinR_r1.setRotationPoint(1.0F, 0.0F, 0.0F);
        this.pelvicfinR.addChild(pelvicfinR_r1);
        this.setRotateAngle(pelvicfinR_r1, 0.0F, 0.0F, -0.2618F);
        this.pelvicfinR_r1.cubeList.add(new ModelBox(pelvicfinR_r1, 0, 0, -3.5F, 0.0F, -1.5F, 3, 0, 4, 0.0F, false));

        this.body4 = new AdvancedModelRenderer(this);
        this.body4.setRotationPoint(0.0F, 0.0F, 8.0F);
        this.body3.addChild(body4);
        this.body4.cubeList.add(new ModelBox(body4, 24, 0, -2.5F, -2.0F, 0.0F, 5, 4, 8, 0.0F, false));

        this.body5 = new AdvancedModelRenderer(this);
        this.body5.setRotationPoint(0.0F, 0.0F, 8.0F);
        this.body4.addChild(body5);
        this.body5.cubeList.add(new ModelBox(body5, 0, 29, -2.5F, -2.01F, 0.0F, 5, 4, 6, 0.0F, false));

        this.body6 = new AdvancedModelRenderer(this);
        this.body6.setRotationPoint(0.0F, 0.0F, 6.0F);
        this.body5.addChild(body6);
        this.body6.cubeList.add(new ModelBox(body6, 0, 48, -2.0F, -2.0F, 0.0F, 4, 4, 4, 0.0F, false));
        this.body6.cubeList.add(new ModelBox(body6, 36, 52, -2.5F, 0.0F, 0.0F, 5, 0, 5, 0.0F, false));

        this.caudalfin = new AdvancedModelRenderer(this);
        this.caudalfin.setRotationPoint(0.0F, 0.0F, 4.0F);
        this.body6.addChild(caudalfin);
        this.caudalfin.cubeList.add(new ModelBox(caudalfin, 0, 19, -0.5F, -2.0F, 0.0F, 1, 4, 2, 0.0F, false));

        this.caudalfinD_r1 = new AdvancedModelRenderer(this);
        this.caudalfinD_r1.setRotationPoint(0.0F, 7.0F, -42.0F);
        this.caudalfin.addChild(caudalfinD_r1);
        this.setRotateAngle(caudalfinD_r1, 0.5236F, 0.0F, 0.0F);
        this.caudalfinD_r1.cubeList.add(new ModelBox(caudalfinD_r1, 14, 33, 0.0F, 16.0F, 39.0F, 0, 9, 7, 0.0F, false));

        this.caudalfinU_r1 = new AdvancedModelRenderer(this);
        this.caudalfinU_r1.setRotationPoint(0.0F, 7.0F, -42.0F);
        this.caudalfin.addChild(caudalfinU_r1);
        this.setRotateAngle(caudalfinU_r1, -0.5236F, 0.0F, 0.0F);
        this.caudalfinU_r1.cubeList.add(new ModelBox(caudalfinU_r1, 0, 32, -0.001F, -37.0F, 32.0F, 0, 9, 7, 0.0F, false));

        updateDefaultPose();
        animator = ModelAnimator.create();
    }

    @Override
    public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        animate((IAnimatedEntity) entity, f, f1, f2, f3, f4, f5);
        this.body.render(f5 * 0.52F);
    }
    public void renderStatic(float f) {
        GlStateManager.pushMatrix();
        GlStateManager.enableBlend();
        GlStateManager.blendFunc(GlStateManager.SourceFactor.SRC_ALPHA, GlStateManager.DestFactor.ONE_MINUS_SRC_ALPHA);
        GlStateManager.disableCull();
        this.body.rotateAngleY = (float) Math.toRadians(90);
        this.body.rotateAngleX = (float) Math.toRadians(-15);
        this.body1.rotateAngleX = (float) Math.toRadians(5);
        this.body2.rotateAngleX = (float) Math.toRadians(7.5);
        this.body3.rotateAngleX = (float) Math.toRadians(7.5);
        this.body4.rotateAngleX = (float) Math.toRadians(10);
        this.body5.rotateAngleX = (float) Math.toRadians(10);
        this.body6.rotateAngleX = (float) Math.toRadians(10);
        this.caudalfin.rotateAngleX = (float) Math.toRadians(10);
        this.jaw.rotateAngleX = (float) Math.toRadians(25);
        this.body.render(0.01F);
        GlStateManager.enableCull();
        GlStateManager.disableBlend();
        GlStateManager.popMatrix();
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

        this.body.offsetY = 0.5F;

        AdvancedModelRenderer[] fishTail = {this.body3, this.body4, this.body5, this.body6};

        float speed = 0.22F;
        EntityPrehistoricFloraAgeableBase ee = (EntityPrehistoricFloraAgeableBase) e;
        if (ee.getIsFast()) {
            speed = speed * 3F;
        }
        float still = 1f;
        if (f3 == 0.0F) {
            still = 0.6F;
        }
        if (!e.isInWater()) {
            speed = 0.35F;
        }

        //if (f3 != 0.0F) {this.walk(Jaw, (float) (speed * 1.5), 0.2F, true, 0, 0, f2, 1);}
        if (e.isInWater()) {
            this.chainWave(fishTail, speed * still, 0.065F * still, -0.2, f2, 0.8F * still);
            this.chainSwing(fishTail, speed * still, 0.55F * still, -0.25, f2, 0.45F * still);
            this.swing(body, speed, 0.2F * still, true, 0, 0, f2, 0.5F);
        }
        else {
            this.swing(body, speed, 0.1F, true, 0, 0, f2, 0.5F);
        }
        this.flap(pectoralfinL, (float) (speed * 0.65), 0.1F, false, 0.8F, 0, f2, 0.5F);
        this.swing(pectoralfinL, (float) (speed * 0.65), 0.1F, true, 0, 0, f2, 0.5F);
        this.flap(pectoralfinR, (float) (speed * 0.65), -0.1F, false, 0.8F, 0, f2, 0.5F);
        this.swing(pectoralfinR, (float) (speed * 0.65), -0.1F, true, 0, 0, f2, 0.5F);

        this.flap(pelvicfinL, (float) (speed * 0.65), 0.1F, false, 1.8F, 0, f2, 0.5F);
        this.swing(pelvicfinL, (float) (speed * 0.65), 0.1F, true, 1, 0, f2, 0.5F);
        this.flap(pelvicfinR, (float) (speed * 0.65), -0.1F, false, 1.8F, 0, f2, 0.5F);
        this.swing(pelvicfinR, (float) (speed * 0.65), -0.1F, true, 1, 0, f2, 0.5F);

        if (!e.isInWater()) {
            this.body.rotateAngleZ = (float) Math.toRadians(90);
            this.body.offsetY = 0.6F;
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
        animator.move(this.head, 0,0,-0.5F);
        animator.rotate(this.head, (float) Math.toRadians(-15), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(this.jaw, (float) Math.toRadians(40), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.endKeyframe();
        animator.setStaticKeyframe(5);
        animator.resetKeyframe(2);

    }
}

