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

public class ModelPygopterus extends AdvancedModelBase {
    private final AdvancedModelRenderer body;
    private final AdvancedModelRenderer cube_r1;
    private final AdvancedModelRenderer cube_r2;
    private final AdvancedModelRenderer body2;
    private final AdvancedModelRenderer pelvicfinL;
    private final AdvancedModelRenderer pelvicfinR;
    private final AdvancedModelRenderer body3;
    private final AdvancedModelRenderer cube_r3;
    private final AdvancedModelRenderer cube_r4;
    private final AdvancedModelRenderer body4;
    private final AdvancedModelRenderer body5;
    private final AdvancedModelRenderer cube_r5;
    private final AdvancedModelRenderer pectoralfinR;
    private final AdvancedModelRenderer pectoralfinL;
    private final AdvancedModelRenderer head;
    private final AdvancedModelRenderer cube_r6;
    private final AdvancedModelRenderer cube_r7;
    private final AdvancedModelRenderer jaw;
    private final AdvancedModelRenderer cube_r8;

    private ModelAnimator animator;

    public ModelPygopterus() {
        this.textureWidth = 64;
        this.textureHeight = 64;

        this.body = new AdvancedModelRenderer(this);
        this.body.setRotationPoint(0.5F, 19.0F, -10.0F);
        this.body.cubeList.add(new ModelBox(body, 18, 15, -3.5F, -7.0F, -0.5F, 6, 7, 8, -0.01F, false));

        this.cube_r1 = new AdvancedModelRenderer(this);
        this.cube_r1.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.body.addChild(cube_r1);
        this.setRotateAngle(cube_r1, -0.1134F, 0.0F, 0.0F);
        this.cube_r1.cubeList.add(new ModelBox(cube_r1, 16, 3, -3.0F, -1.0F, 0.0F, 5, 1, 8, 0.0F, false));

        this.cube_r2 = new AdvancedModelRenderer(this);
        this.cube_r2.setRotationPoint(0.0F, -7.0F, 0.0F);
        this.body.addChild(cube_r2);
        this.setRotateAngle(cube_r2, 0.1134F, 0.0F, 0.0F);
        this.cube_r2.cubeList.add(new ModelBox(cube_r2, 34, 0, -3.0F, 0.0F, 0.0F, 5, 1, 8, 0.0F, false));

        this.body2 = new AdvancedModelRenderer(this);
        this.body2.setRotationPoint(-0.5F, -4.0F, 7.0F);
        this.body.addChild(body2);
        this.body2.cubeList.add(new ModelBox(body2, 21, 30, -3.0F, -4.0F, 0.0F, 6, 9, 7, 0.01F, false));

        this.pelvicfinL = new AdvancedModelRenderer(this);
        this.pelvicfinL.setRotationPoint(-2.0F, 5.0F, 3.0F);
        this.body2.addChild(pelvicfinL);
        this.setRotateAngle(pelvicfinL, -0.7854F, 0.0F, 0.4363F);
        this.pelvicfinL.cubeList.add(new ModelBox(pelvicfinL, 0, 0, 0.0F, -0.5F, -0.5F, 0, 1, 2, 0.0F, false));

        this.pelvicfinR = new AdvancedModelRenderer(this);
        this.pelvicfinR.setRotationPoint(2.0F, 5.0F, 3.0F);
        this.body2.addChild(pelvicfinR);
        this.setRotateAngle(pelvicfinR, -0.7854F, 0.0F, -0.4363F);
        this.pelvicfinR.cubeList.add(new ModelBox(pelvicfinR, 0, 0, 0.0F, -0.5F, -0.5F, 0, 1, 2, 0.0F, true));

        this.body3 = new AdvancedModelRenderer(this);
        this.body3.setRotationPoint(0.0F, 0.5F, 7.0F);
        this.body2.addChild(body3);
        this.body3.cubeList.add(new ModelBox(body3, 0, 0, -2.5F, -1.5F, -1.0F, 5, 4, 7, 0.0F, false));
        this.body3.cubeList.add(new ModelBox(body3, 0, 22, 0.0F, -5.75F, 0.5F, 0, 4, 6, 0.0F, false));
        this.body3.cubeList.add(new ModelBox(body3, 0, 17, 0.0F, 2.25F, 0.5F, 0, 5, 6, 0.0F, false));

        this.cube_r3 = new AdvancedModelRenderer(this);
        this.cube_r3.setRotationPoint(0.0F, 2.5F, 6.0F);
        this.body3.addChild(cube_r3);
        this.setRotateAngle(cube_r3, 0.2618F, 0.0F, 0.0F);
        this.cube_r3.cubeList.add(new ModelBox(cube_r3, 38, 9, -2.0F, -4.0F, -7.0F, 4, 4, 7, 0.0F, false));

        this.cube_r4 = new AdvancedModelRenderer(this);
        this.cube_r4.setRotationPoint(0.0F, -1.5F, 6.0F);
        this.body3.addChild(cube_r4);
        this.setRotateAngle(cube_r4, -0.4363F, 0.0F, 0.0F);
        this.cube_r4.cubeList.add(new ModelBox(cube_r4, 0, 39, -2.0F, 0.0F, -7.0F, 4, 4, 7, 0.0F, false));

        this.body4 = new AdvancedModelRenderer(this);
        this.body4.setRotationPoint(0.0F, 0.5F, 6.0F);
        this.body3.addChild(body4);
        this.body4.cubeList.add(new ModelBox(body4, 40, 39, -1.5F, -2.0F, -1.0F, 3, 4, 7, 0.0F, false));

        this.body5 = new AdvancedModelRenderer(this);
        this.body5.setRotationPoint(0.0F, -0.75F, 6.0F);
        this.body4.addChild(body5);


        this.cube_r5 = new AdvancedModelRenderer(this);
        this.cube_r5.setRotationPoint(0.0F, -1.0F, 0.0F);
        this.body5.addChild(cube_r5);
        this.setRotateAngle(cube_r5, 0.3229F, 0.0F, 0.0F);
        this.cube_r5.cubeList.add(new ModelBox(cube_r5, 0, 0, 0.0F, 1.0F, -1.25F, 0, 10, 13, 0.0F, false));
        this.cube_r5.cubeList.add(new ModelBox(cube_r5, 0, 23, -0.5F, 0.0F, -1.25F, 1, 1, 13, 0.0F, false));

        this.pectoralfinR = new AdvancedModelRenderer(this);
        this.pectoralfinR.setRotationPoint(-3.5F, -1.25F, 1.25F);
        this.body.addChild(pectoralfinR);
        this.setRotateAngle(pectoralfinR, 0.3927F, 0.0F, 0.3491F);
        this.pectoralfinR.cubeList.add(new ModelBox(pectoralfinR, 0, 34, 0.0F, 0.0F, -0.5F, 0, 7, 3, 0.0F, false));

        this.pectoralfinL = new AdvancedModelRenderer(this);
        this.pectoralfinL.setRotationPoint(2.5F, -1.25F, 1.25F);
        this.body.addChild(pectoralfinL);
        this.setRotateAngle(pectoralfinL, 0.3927F, 0.0F, -0.3491F);
        this.pectoralfinL.cubeList.add(new ModelBox(pectoralfinL, 0, 34, 0.0F, 0.0F, -0.5F, 0, 7, 3, 0.0F, true));

        this.head = new AdvancedModelRenderer(this);
        this.head.setRotationPoint(-0.5F, -2.5F, -0.5F);
        this.body.addChild(head);
        this.head.cubeList.add(new ModelBox(head, 40, 23, -2.5F, -2.0F, -5.5F, 5, 2, 7, 0.0F, false));
        this.head.cubeList.add(new ModelBox(head, 0, 11, -2.5F, -2.0F, -5.0F, 5, 1, 1, 0.02F, false));
        this.head.cubeList.add(new ModelBox(head, 44, 50, -2.5F, -2.5F, -5.5F, 5, 2, 2, 0.01F, false));

        this.cube_r6 = new AdvancedModelRenderer(this);
        this.cube_r6.setRotationPoint(0.5F, -2.5F, -4.5F);
        this.head.addChild(cube_r6);
        this.setRotateAngle(cube_r6, 0.4974F, 0.0F, 0.0F);
        this.cube_r6.cubeList.add(new ModelBox(cube_r6, 40, 32, -3.0F, -0.525F, -1.8F, 5, 2, 2, -0.02F, false));

        this.cube_r7 = new AdvancedModelRenderer(this);
        this.cube_r7.setRotationPoint(0.5F, -2.5F, -4.5F);
        this.head.addChild(cube_r7);
        this.setRotateAngle(cube_r7, 0.2356F, 0.0F, 0.0F);
        this.cube_r7.cubeList.add(new ModelBox(cube_r7, 16, 46, -3.0F, -0.55F, 0.0F, 5, 3, 6, -0.01F, false));

        this.jaw = new AdvancedModelRenderer(this);
        this.jaw.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.head.addChild(jaw);
        this.jaw.cubeList.add(new ModelBox(jaw, 0, 50, -2.0F, 0.0F, -5.5F, 4, 1, 7, 0.0F, false));

        this.cube_r8 = new AdvancedModelRenderer(this);
        this.cube_r8.setRotationPoint(0.5F, 1.0F, -5.5F);
        this.jaw.addChild(cube_r8);
        this.setRotateAngle(cube_r8, -0.1571F, 0.0F, 0.0F);
        this.cube_r8.cubeList.add(new ModelBox(cube_r8, 31, 50, -2.0F, -1.0F, 0.0F, 3, 1, 7, 0.0F, false));

        updateDefaultPose();
        animator = ModelAnimator.create();
    }

    @Override
    public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        animate((IAnimatedEntity) entity, f, f1, f2, f3, f4, f5);
        this.body.render(f5 * 0.342F);
    }
    public void renderStatic(float f) {
        //GlStateManager.pushMatrix();
        //GlStateManager.enableBlend();
        //GlStateManager.blendFunc(GlStateManager.SourceFactor.SRC_ALPHA, GlStateManager.DestFactor.ONE_MINUS_SRC_ALPHA);
        //GlStateManager.disableCull();
        this.body.rotateAngleY = (float) Math.toRadians(90);
        this.body.offsetX = -0.16F;
        this.body.offsetY = -0.16F;
        this.body.offsetZ = 0.04F;
        this.body.render(0.01F);
        //GlStateManager.enableCull();
        //GlStateManager.disableBlend();
        //GlStateManager.popMatrix();
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

        this.body.offsetY = 1.0F;

        AdvancedModelRenderer[] fishTail = {this.body3, this.body4, this.body5};

        float speed = 0.186F;
        EntityPrehistoricFloraAgeableBase ee = (EntityPrehistoricFloraAgeableBase) e;
        if (ee.getIsFast()) {
            speed = speed * 2.6F;
        }
        float still = 1f;
        if (f3 == 0.0F) {
            still = 0.6F;
        }
        if (!e.isInWater()) {
            speed = 0.26F;
        }

        //this.head.rotateAngleY += f3 / (180F / (float) Math.PI);
        //this.head.rotateAngleX += f4 / (180F / (float) Math.PI);

        //if (f3 != 0.0F) {this.walk(Jaw, (float) (speed * 1.5), 0.2F, true, 0, 0, f2, 1);}
        if (e.isInWater()) {
            this.chainWave(fishTail, speed * still, 0.02F * still, -0.2, f2, 0.8F * still);
            this.chainSwing(fishTail, speed * still, 0.29F * still, -0.85, f2, 0.5F * still);
            this.swing(body, speed, 0.2F, true, 0, 0, f2, 0.8F);
        }
        else {
            this.swing(body, speed, 0.1F, true, 0, 0, f2, 0.5F);
        }
        this.flap(pectoralfinL, (float) (speed * 0.65), 0.28F, false, 0.8F, 0, f2, 0.5F);
        this.swing(pectoralfinL, (float) (speed * 0.65), 0.18F, true, 0, 0, f2, 0.5F);
        this.flap(pectoralfinR, (float) (speed * 0.65), -0.28F, false, 0.8F, 0, f2, 0.5F);
        this.swing(pectoralfinR, (float) (speed * 0.65), -0.18F, true, 0, 0, f2, 0.5F);

        if (!e.isInWater()) {
            this.body.rotateAngleZ = (float) Math.toRadians(90);
            this.body.offsetY = 1.05F;
            this.bob(body, -speed * 1.9F, 2.5F, false, f2, 1);
            this.chainWave(fishTail, speed * 1.7F, 0.028F, -0.2, f2, 0.8F * still);
            this.chainSwing(fishTail, speed * 1.7F, 0.28F, -0.55, f2, 0.4F * still);

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
        animator.rotate(this.jaw, (float) Math.toRadians(30), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.endKeyframe();
        animator.setStaticKeyframe(5);
        animator.resetKeyframe(2);

    }
}

