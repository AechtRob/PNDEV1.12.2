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
    private final AdvancedModelRenderer cube_r1;
    private final AdvancedModelRenderer body2;
    private final AdvancedModelRenderer body3;
    private final AdvancedModelRenderer body4;
    private final AdvancedModelRenderer pelvicfinR;
    private final AdvancedModelRenderer pelvicfinL;
    private final AdvancedModelRenderer body5;
    private final AdvancedModelRenderer tail;
    private final AdvancedModelRenderer pectoralfinR;
    private final AdvancedModelRenderer pectoralfinL;
    private final AdvancedModelRenderer head;
    private final AdvancedModelRenderer cube_r2;
    private final AdvancedModelRenderer jaw;
    private final AdvancedModelRenderer cube_r3;

    private ModelAnimator animator;

    public ModelCladoselache() {
        this.textureWidth = 128;
        this.textureHeight = 128;

        this.body = new AdvancedModelRenderer(this);
        this.body.setRotationPoint(-0.5F, 17.75F, -16.5F);
        this.body.cubeList.add(new ModelBox(body, 0, 22, -3.5F, -5.0F, 5.0F, 8, 6, 9, 0.0F, false));

        this.cube_r1 = new AdvancedModelRenderer(this);
        this.cube_r1.setRotationPoint(0.0F, -5.0F, 5.0F);
        this.body.addChild(cube_r1);
        this.setRotateAngle(cube_r1, 0.2182F, 0.0F, 0.0F);
        this.cube_r1.cubeList.add(new ModelBox(cube_r1, 50, 25, -3.0F, 0.0F, 0.0F, 7, 2, 8, 0.0F, false));

        this.body2 = new AdvancedModelRenderer(this);
        this.body2.setRotationPoint(0.5F, -2.75F, 12.5F);
        this.body.addChild(body2);
        this.body2.cubeList.add(new ModelBox(body2, 0, 0, -4.5F, -4.0F, 0.0F, 9, 8, 14, 0.0F, false));
        this.body2.cubeList.add(new ModelBox(body2, 14, 43, 0.0F, -9.0F, 3.75F, 0, 5, 8, 0.0F, false));

        this.body3 = new AdvancedModelRenderer(this);
        this.body3.setRotationPoint(0.0F, 0.0F, 14.0F);
        this.body2.addChild(body3);
        this.body3.cubeList.add(new ModelBox(body3, 26, 29, -4.0F, -3.5F, -1.0F, 8, 7, 8, 0.0F, false));

        this.body4 = new AdvancedModelRenderer(this);
        this.body4.setRotationPoint(0.0F, 0.0F, 7.0F);
        this.body3.addChild(body4);
        this.body4.cubeList.add(new ModelBox(body4, 0, 0, 0.0F, -5.0F, 0.0F, 0, 3, 3, 0.0F, false));
        this.body4.cubeList.add(new ModelBox(body4, 0, 37, -3.5F, -2.5F, -1.0F, 7, 5, 9, 0.01F, false));

        this.pelvicfinR = new AdvancedModelRenderer(this);
        this.pelvicfinR.setRotationPoint(-1.0F, 2.5F, 2.0F);
        this.body4.addChild(pelvicfinR);
        this.setRotateAngle(pelvicfinR, 0.0F, 0.0F, 0.5236F);
        this.pelvicfinR.cubeList.add(new ModelBox(pelvicfinR, 0, 0, 0.0F, 0.0F, -2.0F, 0, 3, 6, 0.0F, false));

        this.pelvicfinL = new AdvancedModelRenderer(this);
        this.pelvicfinL.setRotationPoint(1.0F, 2.5F, 2.0F);
        this.body4.addChild(pelvicfinL);
        this.setRotateAngle(pelvicfinL, 0.0F, 0.0F, -0.5236F);
        this.pelvicfinL.cubeList.add(new ModelBox(pelvicfinL, 0, 0, 0.0F, 0.0F, -2.0F, 0, 3, 6, 0.0F, true));

        this.body5 = new AdvancedModelRenderer(this);
        this.body5.setRotationPoint(0.0F, 0.0F, 8.0F);
        this.body4.addChild(body5);
        this.body5.cubeList.add(new ModelBox(body5, 60, 9, -2.0F, -2.0F, -1.0F, 4, 4, 11, 0.0F, false));
        this.body5.cubeList.add(new ModelBox(body5, 36, 14, -3.0F, -0.25F, -1.25F, 6, 1, 10, 0.0F, false));
        this.body5.cubeList.add(new ModelBox(body5, 39, 11, -2.5F, -0.25F, 8.75F, 5, 1, 2, 0.0F, false));

        this.tail = new AdvancedModelRenderer(this);
        this.tail.setRotationPoint(0.0F, 0.0F, 9.25F);
        this.body5.addChild(tail);
        this.tail.cubeList.add(new ModelBox(tail, 32, 35, 0.0F, -8.0F, -1.0F, 0, 16, 9, 0.0F, false));

        this.pectoralfinR = new AdvancedModelRenderer(this);
        this.pectoralfinR.setRotationPoint(-4.5F, 2.0F, 0.0F);
        this.body2.addChild(pectoralfinR);
        this.setRotateAngle(pectoralfinR, 0.1745F, 0.0F, 0.6981F);
        this.pectoralfinR.cubeList.add(new ModelBox(pectoralfinR, 0, 44, 0.0F, 0.0F, -0.25F, 0, 10, 7, 0.0F, false));

        this.pectoralfinL = new AdvancedModelRenderer(this);
        this.pectoralfinL.setRotationPoint(4.5F, 2.0F, 0.0F);
        this.body2.addChild(pectoralfinL);
        this.setRotateAngle(pectoralfinL, 0.1745F, 0.0F, -0.6981F);
        this.pectoralfinL.cubeList.add(new ModelBox(pectoralfinL, 0, 44, 0.0F, 0.0F, -0.25F, 0, 10, 7, 0.0F, true));

        this.head = new AdvancedModelRenderer(this);
        this.head.setRotationPoint(0.5F, -1.0F, 5.0F);
        this.body.addChild(head);
        this.head.cubeList.add(new ModelBox(head, 50, 52, -3.5F, -2.0F, -5.0F, 7, 2, 5, 0.0F, false));

        this.cube_r2 = new AdvancedModelRenderer(this);
        this.cube_r2.setRotationPoint(-0.5F, -3.75F, -0.5F);
        this.head.addChild(cube_r2);
        this.setRotateAngle(cube_r2, 0.3054F, 0.0F, 0.0F);
        this.cube_r2.cubeList.add(new ModelBox(cube_r2, 50, 44, -2.5F, 0.0F, -5.5F, 6, 2, 6, 0.0F, false));

        this.jaw = new AdvancedModelRenderer(this);
        this.jaw.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.head.addChild(jaw);
        this.jaw.cubeList.add(new ModelBox(jaw, 9, 56, -3.0F, 0.0F, -5.0F, 6, 1, 5, 0.0F, false));

        this.cube_r3 = new AdvancedModelRenderer(this);
        this.cube_r3.setRotationPoint(-0.5F, 1.0F, -5.0F);
        this.jaw.addChild(cube_r3);
        this.setRotateAngle(cube_r3, -0.1309F, 0.0F, 0.0F);
        this.cube_r3.cubeList.add(new ModelBox(cube_r3, 53, 0, -2.0F, -1.0F, 0.0F, 5, 1, 6, 0.0F, false));

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
        this.body2.rotateAngleX = (float) Math.toRadians(5);
        this.body3.rotateAngleX = (float) Math.toRadians(7.5);
        this.body4.rotateAngleX = (float) Math.toRadians(7.5);
        this.body5.rotateAngleX = (float) Math.toRadians(10);
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

        AdvancedModelRenderer[] fishTail = {this.body3, this.body4, this.body5, this.tail};

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

