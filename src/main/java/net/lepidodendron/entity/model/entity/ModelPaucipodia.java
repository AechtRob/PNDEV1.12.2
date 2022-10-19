package net.lepidodendron.entity.model.entity;

import net.ilexiconn.llibrary.client.model.ModelAnimator;
import net.ilexiconn.llibrary.client.model.tools.AdvancedModelBase;
import net.ilexiconn.llibrary.client.model.tools.AdvancedModelRenderer;
import net.ilexiconn.llibrary.server.animation.IAnimatedEntity;
import net.lepidodendron.entity.EntityPrehistoricFloraPaucipodia;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.entity.Entity;

public class ModelPaucipodia extends AdvancedModelBase {
    private final AdvancedModelRenderer body4;
    private final AdvancedModelRenderer legR5;
    private final AdvancedModelRenderer legL5;
    private final AdvancedModelRenderer body5;
    private final AdvancedModelRenderer legR6;
    private final AdvancedModelRenderer legL6;
    private final AdvancedModelRenderer body6;
    private final AdvancedModelRenderer legR7;
    private final AdvancedModelRenderer legL7;
    private final AdvancedModelRenderer body7;
    private final AdvancedModelRenderer legR8;
    private final AdvancedModelRenderer legL8;
    private final AdvancedModelRenderer body8;
    private final AdvancedModelRenderer legR9;
    private final AdvancedModelRenderer legL9;
    private final AdvancedModelRenderer tail;
    private final AdvancedModelRenderer legR2;
    private final AdvancedModelRenderer legL2;
    private final AdvancedModelRenderer body3;
    private final AdvancedModelRenderer legR4;
    private final AdvancedModelRenderer legL4;
    private final AdvancedModelRenderer body2;
    private final AdvancedModelRenderer legR3;
    private final AdvancedModelRenderer legL3;
    private final AdvancedModelRenderer body;
    private final AdvancedModelRenderer legR;
    private final AdvancedModelRenderer legL;
    private final AdvancedModelRenderer head;

    private ModelAnimator animator;

    public ModelPaucipodia() {
        this.textureWidth = 32;
        this.textureHeight = 32;

        this.body4 = new AdvancedModelRenderer(this);
        this.body4.setRotationPoint(0.0F, 16.5F, -2.0F);
        this.body4.cubeList.add(new ModelBox(body4, 0, 0, -0.99F, -1.01F, 0.0F, 2, 2, 6, 0.0F, false));

        this.legR5 = new AdvancedModelRenderer(this);
        this.legR5.setRotationPoint(0.0F, 1.0F, 1.0F);
        this.body4.addChild(legR5);
        this.setRotateAngle(legR5, 0.0F, 0.0F, 0.1745F);
        this.legR5.cubeList.add(new ModelBox(legR5, 4, 16, -1.0F, -1.25F, -0.5F, 1, 8, 1, 0.0F, false));

        this.legL5 = new AdvancedModelRenderer(this);
        this.legL5.setRotationPoint(0.0F, 1.0F, 1.0F);
        this.body4.addChild(legL5);
        this.setRotateAngle(legL5, 0.0F, 0.0F, -0.1745F);
        this.legL5.cubeList.add(new ModelBox(legL5, 16, 5, 0.0F, -1.25F, -0.5F, 1, 8, 1, 0.0F, false));

        this.body5 = new AdvancedModelRenderer(this);
        this.body5.setRotationPoint(0.0F, 0.0F, 6.0F);
        this.body4.addChild(body5);
        this.setRotateAngle(body5, 0.0436F, 0.0F, 0.0F);
        this.body5.cubeList.add(new ModelBox(body5, 0, 0, -1.0F, -1.0F, 0.0F, 2, 2, 6, 0.0F, false));

        this.legR6 = new AdvancedModelRenderer(this);
        this.legR6.setRotationPoint(-0.1F, 1.25F, 1.0F);
        this.body5.addChild(legR6);
        this.setRotateAngle(legR6, -0.0436F, 0.0F, 0.1745F);
        this.legR6.cubeList.add(new ModelBox(legR6, 4, 16, -1.0F, -1.25F, -0.5F, 1, 8, 1, 0.0F, false));

        this.legL6 = new AdvancedModelRenderer(this);
        this.legL6.setRotationPoint(0.1F, 1.25F, 1.0F);
        this.body5.addChild(legL6);
        this.setRotateAngle(legL6, -0.0436F, 0.0F, -0.1745F);
        this.legL6.cubeList.add(new ModelBox(legL6, 16, 5, 0.0F, -1.25F, -0.5F, 1, 8, 1, 0.0F, false));

        this.body6 = new AdvancedModelRenderer(this);
        this.body6.setRotationPoint(0.0F, 0.0F, 6.0F);
        this.body5.addChild(body6);
        this.setRotateAngle(body6, -0.0436F, 0.0F, 0.0F);
        this.body6.cubeList.add(new ModelBox(body6, 0, 0, -0.99F, -1.01F, 0.0F, 2, 2, 6, 0.0F, false));

        this.legR7 = new AdvancedModelRenderer(this);
        this.legR7.setRotationPoint(-0.25F, 1.75F, 1.0F);
        this.body6.addChild(legR7);
        this.setRotateAngle(legR7, 0.0F, 0.0F, 0.1745F);
        this.legR7.cubeList.add(new ModelBox(legR7, 4, 16, -1.0F, -1.25F, -0.5F, 1, 8, 1, 0.0F, false));

        this.legL7 = new AdvancedModelRenderer(this);
        this.legL7.setRotationPoint(0.25F, 1.75F, 1.0F);
        this.body6.addChild(legL7);
        this.setRotateAngle(legL7, 0.0F, 0.0F, -0.1745F);
        this.legL7.cubeList.add(new ModelBox(legL7, 16, 5, 0.0F, -1.25F, -0.5F, 1, 8, 1, 0.0F, false));

        this.body7 = new AdvancedModelRenderer(this);
        this.body7.setRotationPoint(0.0F, -0.1F, 6.0F);
        this.body6.addChild(body7);
        this.setRotateAngle(body7, -0.0436F, 0.0F, 0.0F);
        this.body7.cubeList.add(new ModelBox(body7, 0, 0, -1.0F, -1.0F, 0.0F, 2, 2, 6, 0.0F, false));

        this.legR8 = new AdvancedModelRenderer(this);
        this.legR8.setRotationPoint(-0.25F, 2.0F, 1.0F);
        this.body7.addChild(legR8);
        this.setRotateAngle(legR8, 0.0F, 0.0F, 0.1745F);
        this.legR8.cubeList.add(new ModelBox(legR8, 4, 16, -1.0F, -1.15F, -0.5F, 1, 8, 1, 0.0F, false));

        this.legL8 = new AdvancedModelRenderer(this);
        this.legL8.setRotationPoint(0.25F, 2.0F, 1.25F);
        this.body7.addChild(legL8);
        this.setRotateAngle(legL8, 0.0F, 0.0F, -0.1745F);
        this.legL8.cubeList.add(new ModelBox(legL8, 16, 5, 0.0F, -1.15F, -0.5F, 1, 8, 1, 0.0F, false));

        this.body8 = new AdvancedModelRenderer(this);
        this.body8.setRotationPoint(0.0F, -0.1F, 6.0F);
        this.body7.addChild(body8);
        this.setRotateAngle(body8, -0.0436F, 0.0F, 0.0F);
        this.body8.cubeList.add(new ModelBox(body8, 0, 0, -0.99F, -1.01F, 0.0F, 2, 2, 6, 0.0F, false));

        this.legR9 = new AdvancedModelRenderer(this);
        this.legR9.setRotationPoint(-0.25F, 2.0F, 1.0F);
        this.body8.addChild(legR9);
        this.setRotateAngle(legR9, 0.0436F, 0.0F, 0.1745F);
        this.legR9.cubeList.add(new ModelBox(legR9, 4, 16, -1.0F, -1.25F, -0.5F, 1, 8, 1, 0.0F, false));

        this.legL9 = new AdvancedModelRenderer(this);
        this.legL9.setRotationPoint(0.25F, 2.0F, 1.0F);
        this.body8.addChild(legL9);
        this.setRotateAngle(legL9, 0.0436F, 0.0F, -0.1745F);
        this.legL9.cubeList.add(new ModelBox(legL9, 16, 5, 0.0F, -1.25F, -0.5F, 1, 8, 1, 0.0F, false));

        this.tail = new AdvancedModelRenderer(this);
        this.tail.setRotationPoint(0.0F, 0.1F, 6.0F);
        this.body8.addChild(tail);
        this.setRotateAngle(tail, -0.0873F, 0.0F, 0.0F);
        this.tail.cubeList.add(new ModelBox(tail, 10, 0, -1.0F, -1.0F, 0.0F, 2, 2, 3, 0.0F, false));

        this.legR2 = new AdvancedModelRenderer(this);
        this.legR2.setRotationPoint(-0.25F, 1.55F, 1.0F);
        this.tail.addChild(legR2);
        this.setRotateAngle(legR2, 0.1745F, 0.0F, 0.1745F);
        this.legR2.cubeList.add(new ModelBox(legR2, 0, 16, -1.0F, -1.25F, -0.5F, 1, 8, 1, 0.0F, false));

        this.legL2 = new AdvancedModelRenderer(this);
        this.legL2.setRotationPoint(0.25F, 1.55F, 1.0F);
        this.tail.addChild(legL2);
        this.setRotateAngle(legL2, 0.1745F, 0.0F, -0.1745F);
        this.legL2.cubeList.add(new ModelBox(legL2, 15, 15, 0.0F, -1.25F, -0.5F, 1, 8, 1, 0.0F, false));

        this.body3 = new AdvancedModelRenderer(this);
        this.body3.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.body4.addChild(body3);
        this.body3.cubeList.add(new ModelBox(body3, 0, 0, -1.0F, -1.0F, -6.0F, 2, 2, 6, 0.0F, false));

        this.legR4 = new AdvancedModelRenderer(this);
        this.legR4.setRotationPoint(0.0F, 1.0F, -5.0F);
        this.body3.addChild(legR4);
        this.setRotateAngle(legR4, 0.0F, 0.0F, 0.1745F);
        this.legR4.cubeList.add(new ModelBox(legR4, 4, 16, -1.0F, -1.25F, -0.5F, 1, 8, 1, 0.0F, false));

        this.legL4 = new AdvancedModelRenderer(this);
        this.legL4.setRotationPoint(0.0F, 1.0F, -5.0F);
        this.body3.addChild(legL4);
        this.setRotateAngle(legL4, 0.0F, 0.0F, -0.1745F);
        this.legL4.cubeList.add(new ModelBox(legL4, 16, 5, 0.0F, -1.25F, -0.5F, 1, 8, 1, 0.0F, false));

        this.body2 = new AdvancedModelRenderer(this);
        this.body2.setRotationPoint(0.0F, 0.0F, -6.0F);
        this.body3.addChild(body2);
        this.body2.cubeList.add(new ModelBox(body2, 0, 0, -0.99F, -1.01F, -6.0F, 2, 2, 6, 0.0F, false));

        this.legR3 = new AdvancedModelRenderer(this);
        this.legR3.setRotationPoint(0.0F, 1.0F, -5.0F);
        this.body2.addChild(legR3);
        this.setRotateAngle(legR3, 0.0F, 0.0F, 0.1745F);
        this.legR3.cubeList.add(new ModelBox(legR3, 4, 16, -1.0F, -1.25F, -0.5F, 1, 8, 1, 0.0F, false));

        this.legL3 = new AdvancedModelRenderer(this);
        this.legL3.setRotationPoint(0.0F, 1.0F, -5.0F);
        this.body2.addChild(legL3);
        this.setRotateAngle(legL3, 0.0F, 0.0F, -0.1745F);
        this.legL3.cubeList.add(new ModelBox(legL3, 16, 5, 0.0F, -1.25F, -0.5F, 1, 8, 1, 0.0F, false));

        this.body = new AdvancedModelRenderer(this);
        this.body.setRotationPoint(0.0F, 0.0F, -6.0F);
        this.body2.addChild(body);
        this.body.cubeList.add(new ModelBox(body, 0, 0, -1.0F, -1.0F, -6.0F, 2, 2, 6, 0.0F, false));

        this.legR = new AdvancedModelRenderer(this);
        this.legR.setRotationPoint(0.0F, 1.0F, -5.0F);
        this.body.addChild(legR);
        this.setRotateAngle(legR, 0.0F, 0.0F, 0.1745F);
        this.legR.cubeList.add(new ModelBox(legR, 4, 16, -1.0F, -1.25F, -0.5F, 1, 8, 1, 0.0F, false));

        this.legL = new AdvancedModelRenderer(this);
        this.legL.setRotationPoint(0.0F, 1.0F, -5.0F);
        this.body.addChild(legL);
        this.setRotateAngle(legL, 0.0F, 0.0F, -0.1745F);
        this.legL.cubeList.add(new ModelBox(legL, 16, 5, 0.0F, -1.25F, -0.5F, 1, 8, 1, 0.0F, false));

        this.head = new AdvancedModelRenderer(this);
        this.head.setRotationPoint(0.0F, 0.0F, -6.0F);
        this.body.addChild(head);
        this.head.cubeList.add(new ModelBox(head, 0, 0, 0.25F, -1.02F, -4.0F, 1, 0, 1, 0.0F, false));
        this.head.cubeList.add(new ModelBox(head, 0, 1, -1.25F, -1.02F, -4.0F, 1, 0, 1, 0.0F, false));
        this.head.cubeList.add(new ModelBox(head, 0, 8, -0.99F, -1.01F, -6.0F, 2, 2, 6, 0.0F, false));
        this.head.cubeList.add(new ModelBox(head, 0, 4, -0.5F, -0.5F, -6.01F, 1, 1, 0, 0.0F, false));

        updateDefaultPose();
        animator = ModelAnimator.create();
    }

    @Override
    public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        animate((IAnimatedEntity) entity, f, f1, f2, f3, f4, f5);
        this.body4.render(f5 * 0.16F);
    }
    public void renderStatic(float f) {
        GlStateManager.pushMatrix();
        GlStateManager.enableBlend();
        GlStateManager.blendFunc(GlStateManager.SourceFactor.SRC_ALPHA, GlStateManager.DestFactor.ONE_MINUS_SRC_ALPHA);
        GlStateManager.disableCull();
        //this.body.offsetZ = -0.1F;
        this.body4.render(0.01F);
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
        this.body4.offsetY = 1.263F;

        AdvancedModelRenderer[] bodyF = {this.body3, this.body2, this.body, this.head};
        AdvancedModelRenderer[] bodyB = {this.body5, this.body6, this.body7, this.body8, this.tail};

        EntityPrehistoricFloraPaucipodia ee = (EntityPrehistoricFloraPaucipodia) e;

        if (ee.getAnimation() != ee.LOOK_ANIMATION) {
            this.faceTarget(f3, f4, 6, head);
            this.faceTarget(f3, f4, 10, body);
        }

        float legFlapDegree = 0.3F;
        float legWalkDegree = 0.5F;
        float legSpeed = 0.2F;
        if (f3 != 0.0f || ee.getAnimation() == ee.LOOK_ANIMATION) {
            this.flap(legL, legSpeed, -legFlapDegree, false, 0, -legFlapDegree, f2, 0.3F);
            this.flap(legR, legSpeed, legFlapDegree, false, 2F, legFlapDegree, f2, 0.3F);
            this.flap(legL2, legSpeed, -legFlapDegree, false, 2.0F, -legFlapDegree, f2, 0.3F);
            this.flap(legR2, legSpeed, legFlapDegree, false, 4.0F, legFlapDegree, f2, 0.3F);
            this.flap(legL3, legSpeed, -legFlapDegree, false, 4.0F, -legFlapDegree, f2, 0.3F);
            this.flap(legR3, legSpeed, legFlapDegree, false, 6.0F, legFlapDegree, f2, 0.3F);
            this.flap(legL4, legSpeed, -legFlapDegree, false, 6.0F, -legFlapDegree, f2, 0.3F);
            this.flap(legR4, legSpeed, legFlapDegree, false, 6.0F, legFlapDegree, f2, 0.3F);
        }
        if (ee.getAnimation() != ee.LOOK_ANIMATION && f3 != 0.0F) {
            this.flap(legL5, legSpeed, -legFlapDegree, false, 8.0F, -legFlapDegree, f2, 0.3F);
            this.flap(legR5, legSpeed, legFlapDegree, false, 10.0F, legFlapDegree, f2, 0.3F);
            this.flap(legL6, legSpeed * 1.1F, -legFlapDegree, false, 10.0F, -legFlapDegree, f2, 0.3F);
            this.flap(legR6, legSpeed * 1.1F, legFlapDegree, false, 12.0F, legFlapDegree, f2, 0.3F);
            this.flap(legL7, legSpeed * 1.2F, -legFlapDegree, false, 12.0F, -legFlapDegree, f2, 0.3F);
            this.flap(legR7, legSpeed * 1.2F, legFlapDegree, false, 14.0F, legFlapDegree, f2, 0.3F);
            this.flap(legL8, legSpeed * 1.3F, -legFlapDegree, false, 14.0F, -legFlapDegree, f2, 0.3F);
            this.flap(legR8, legSpeed * 1.3F, legFlapDegree, false, 16.0F, legFlapDegree, f2, 0.3F);
            this.flap(legL9, legSpeed * 1.3F, -legFlapDegree, false, 16.0F, -legFlapDegree, f2, 0.3F);
            this.flap(legR9, legSpeed * 1.3F, legFlapDegree, false, 18.0F, legFlapDegree, f2, 0.3F);
        }

        if (f3 != 0.0f || ee.getAnimation() == ee.LOOK_ANIMATION) {
            this.walk(legL, legSpeed, -legWalkDegree, false, 0, -legWalkDegree, f2, 0.3F);
            this.walk(legR, legSpeed, legWalkDegree, false, 2F, legWalkDegree, f2, 0.3F);
            this.walk(legL2, legSpeed, -legWalkDegree, false, 2.0F, -legWalkDegree, f2, 0.3F);
            this.walk(legR2, legSpeed, legWalkDegree, false, 4.0F, legWalkDegree, f2, 0.3F);
            this.walk(legL3, legSpeed, -legWalkDegree, false, 4.0F, -legWalkDegree, f2, 0.3F);
            this.walk(legR3, legSpeed, legWalkDegree, false, 6.0F, legWalkDegree, f2, 0.3F);
            this.walk(legL4, legSpeed, -legWalkDegree, false, 6.0F, -legWalkDegree, f2, 0.3F);
            this.walk(legR4, legSpeed, legWalkDegree, false, 8.0F, legWalkDegree, f2, 0.3F);
        }
        if (ee.getAnimation() != ee.LOOK_ANIMATION && f3 != 0.0F) {
            this.walk(legL5, legSpeed, -legWalkDegree, false, 8.0F, -legWalkDegree, f2, 0.3F);
            this.walk(legR5, legSpeed, legWalkDegree, false, 10.0F, legWalkDegree, f2, 0.3F);
            this.walk(legL6, legSpeed * 1.1F, -legWalkDegree * 1.1F, false, 10.0F, -legWalkDegree, f2, 0.3F);
            this.walk(legR6, legSpeed * 1.1F, legWalkDegree * 1.1F, false, 12.0F, legWalkDegree, f2, 0.3F);
            this.walk(legL7, legSpeed * 1.2F, -legWalkDegree * 1.2F, false, 12.0F, -legWalkDegree, f2, 0.3F);
            this.walk(legR7, legSpeed * 1.2F, legWalkDegree * 1.2F, false, 14.0F, legWalkDegree, f2, 0.3F);
            this.walk(legL8, legSpeed * 1.3F, -legWalkDegree * 1.3F, false, 14.0F, -legWalkDegree, f2, 0.3F);
            this.walk(legR8, legSpeed * 1.3F, legWalkDegree * 1.3F, false, 16.0F, legWalkDegree, f2, 0.3F);
            this.walk(legL9, legSpeed * 1.3F, -legWalkDegree * 1.3F, false, 16.0F, -legWalkDegree, f2, 0.3F);
            this.walk(legR9, legSpeed * 1.3F, legWalkDegree * 1.3F, false, 18.0F, legWalkDegree, f2, 0.3F);
        }

        if (ee.getAnimation() != ee.LOOK_ANIMATION && f3 != 0.0F) {
            this.bob(body4, 1F, 0.05F, false, f2, 1);
        }
        //this.walk(body6, 0.8F, -0.010f, false, 2, 0.15F, f2, 0.8F);
        this.chainWave(bodyF, 0.4F, 0.04f, 0.1, f2, 0.2F);
        this.chainSwing(bodyB, 0.085F, 0.25f, 0.1, f2, 0.15F);
        this.chainSwing(bodyF, 0.06F, 0.4F, -1, f2, 0.25F);
        //}
    }


    public void animate(IAnimatedEntity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        EntityPrehistoricFloraPaucipodia e = (EntityPrehistoricFloraPaucipodia) entity;
        animator.update(entity);
        this.resetToDefaultPose();
        setRotationAngles(f, f1, f2, f3, f4, f5, (Entity) entity);

        animator.setAnimation(e.LOOK_ANIMATION);
        animator.startKeyframe(60);
        animator.rotate(this.body3, (float) Math.toRadians(-17.5), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(this.body2, (float) Math.toRadians(-17.5), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(this.body, (float) Math.toRadians(-7.5), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(this.head, (float) Math.toRadians(20), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.endKeyframe();
        animator.setStaticKeyframe(15);
        animator.startKeyframe(30);
        animator.rotate(this.body3, (float) Math.toRadians(-17.5), (float) Math.toRadians(12.5), (float) Math.toRadians(0));
        animator.rotate(this.body2, (float) Math.toRadians(-17.5), (float) Math.toRadians(5), (float) Math.toRadians(0));
        animator.rotate(this.body, (float) Math.toRadians(-7.5), (float) Math.toRadians(5), (float) Math.toRadians(0));
        animator.rotate(this.head, (float) Math.toRadians(20), (float) Math.toRadians(5), (float) Math.toRadians(0));
        animator.endKeyframe();
        animator.setStaticKeyframe(15);
        animator.startKeyframe(30);
        animator.rotate(this.body3, (float) Math.toRadians(-17.5), (float) Math.toRadians(-12.5), (float) Math.toRadians(0));
        animator.rotate(this.body2, (float) Math.toRadians(-17.5), (float) Math.toRadians(-5), (float) Math.toRadians(0));
        animator.rotate(this.body, (float) Math.toRadians(-7.5), (float) Math.toRadians(-5), (float) Math.toRadians(0));
        animator.rotate(this.head, (float) Math.toRadians(20), (float) Math.toRadians(-5), (float) Math.toRadians(0));
        animator.endKeyframe();
        animator.setStaticKeyframe(15);
        animator.startKeyframe(30);
        animator.rotate(this.body3, (float) Math.toRadians(-17.5), (float) Math.toRadians(12.5), (float) Math.toRadians(0));
        animator.rotate(this.body2, (float) Math.toRadians(-17.5), (float) Math.toRadians(5), (float) Math.toRadians(0));
        animator.rotate(this.body, (float) Math.toRadians(-7.5), (float) Math.toRadians(5), (float) Math.toRadians(0));
        animator.rotate(this.head, (float) Math.toRadians(20), (float) Math.toRadians(5), (float) Math.toRadians(0));
        animator.endKeyframe();
        animator.setStaticKeyframe(15);
        animator.startKeyframe(30);
        animator.rotate(this.body3, (float) Math.toRadians(-17.5), (float) Math.toRadians(-12.5), (float) Math.toRadians(0));
        animator.rotate(this.body2, (float) Math.toRadians(-17.5), (float) Math.toRadians(-5), (float) Math.toRadians(0));
        animator.rotate(this.body, (float) Math.toRadians(-7.5), (float) Math.toRadians(-5), (float) Math.toRadians(0));
        animator.rotate(this.head, (float) Math.toRadians(20), (float) Math.toRadians(-5), (float) Math.toRadians(0));
        animator.endKeyframe();
        animator.setStaticKeyframe(15);
        animator.resetKeyframe(60);
    }
}
