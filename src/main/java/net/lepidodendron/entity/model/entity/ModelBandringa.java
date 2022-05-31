package net.lepidodendron.entity.model.entity;

import net.ilexiconn.llibrary.client.model.ModelAnimator;
import net.ilexiconn.llibrary.client.model.tools.AdvancedModelBase;
import net.ilexiconn.llibrary.client.model.tools.AdvancedModelRenderer;
import net.ilexiconn.llibrary.server.animation.IAnimatedEntity;
import net.lepidodendron.entity.EntityPrehistoricFloraBandringa;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLiving;

public class ModelBandringa extends AdvancedModelBase {
    private final AdvancedModelRenderer body;
    private final AdvancedModelRenderer cube_r1;
    private final AdvancedModelRenderer cube_r2;
    private final AdvancedModelRenderer cube_r3;
    private final AdvancedModelRenderer cube_r4;
    private final AdvancedModelRenderer cube_r5;
    private final AdvancedModelRenderer cube_r6;
    private final AdvancedModelRenderer body3;
    private final AdvancedModelRenderer cube_r7;
    private final AdvancedModelRenderer pelvicfinL;
    private final AdvancedModelRenderer pelvicfinR;
    private final AdvancedModelRenderer body4;
    private final AdvancedModelRenderer body5;
    private final AdvancedModelRenderer body6;
    private final AdvancedModelRenderer body7;
    private final AdvancedModelRenderer pectoralfinR;
    private final AdvancedModelRenderer pectoralfinL;
    private final AdvancedModelRenderer lowerjaw;
    private final AdvancedModelRenderer cube_r8;

    private ModelAnimator animator;

    public ModelBandringa() {
        this.textureWidth = 64;
        this.textureHeight = 64;

        this.body = new AdvancedModelRenderer(this);
        this.body.setRotationPoint(0.0F, 24.0F, -7.0F);
        this.body.cubeList.add(new ModelBox(body, 15, 13, -1.5F, -2.25F, -13.75F, 3, 1, 7, 0.0F, false));
        this.body.cubeList.add(new ModelBox(body, 17, 0, -1.0F, -2.25F, -6.75F, 2, 1, 7, 0.0F, false));
        this.body.cubeList.add(new ModelBox(body, 28, 25, -1.5F, -3.0F, 1.25F, 3, 2, 3, 0.0F, false));
        this.body.cubeList.add(new ModelBox(body, 0, 20, -1.5F, -2.0F, 0.25F, 3, 1, 1, 0.0F, false));
        this.body.cubeList.add(new ModelBox(body, 28, 12, -1.5F, -2.0F, 4.0F, 3, 2, 3, 0.0F, false));
        this.body.cubeList.add(new ModelBox(body, 0, 0, -2.0F, -4.0F, 7.0F, 4, 4, 9, 0.0F, false));
        this.body.cubeList.add(new ModelBox(body, 0, 13, -1.5F, -4.75F, 7.01F, 3, 5, 9, 0.0F, false));

        this.cube_r1 = new AdvancedModelRenderer(this);
        this.cube_r1.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.body.addChild(cube_r1);
        this.setRotateAngle(cube_r1, 0.3491F, 0.0F, 0.0F);
        this.cube_r1.cubeList.add(new ModelBox(cube_r1, 19, 25, -1.01F, -2.4F, 0.2F, 2, 1, 5, 0.0F, false));

        this.cube_r2 = new AdvancedModelRenderer(this);
        this.cube_r2.setRotationPoint(0.0F, -4.75F, 7.25F);
        this.body.addChild(cube_r2);
        this.setRotateAngle(cube_r2, -0.1745F, 0.0F, 0.0F);
        this.cube_r2.cubeList.add(new ModelBox(cube_r2, 0, 0, 0.0F, -3.5F, 0.0F, 0, 4, 4, 0.0F, false));

        this.cube_r3 = new AdvancedModelRenderer(this);
        this.cube_r3.setRotationPoint(-1.5F, -1.45F, 4.0F);
        this.body.addChild(cube_r3);
        this.setRotateAngle(cube_r3, 0.0F, -0.0873F, 0.0F);
        this.cube_r3.cubeList.add(new ModelBox(cube_r3, 0, 34, 0.0F, -1.5F, 0.0F, 1, 3, 3, 0.0F, false));

        this.cube_r4 = new AdvancedModelRenderer(this);
        this.cube_r4.setRotationPoint(1.5F, -1.45F, 4.0F);
        this.body.addChild(cube_r4);
        this.setRotateAngle(cube_r4, 0.0F, 0.0873F, 0.0F);
        this.cube_r4.cubeList.add(new ModelBox(cube_r4, 27, 35, -1.0F, -1.5F, 0.0F, 1, 3, 3, 0.0F, false));

        this.cube_r5 = new AdvancedModelRenderer(this);
        this.cube_r5.setRotationPoint(0.0F, -4.5F, 8.0F);
        this.body.addChild(cube_r5);
        this.setRotateAngle(cube_r5, 0.1134F, 0.0F, 0.0F);
        this.cube_r5.cubeList.add(new ModelBox(cube_r5, 30, 30, -1.5F, 0.0F, -4.0F, 3, 2, 3, 0.0F, false));

        this.cube_r6 = new AdvancedModelRenderer(this);
        this.cube_r6.setRotationPoint(0.0F, -1.0F, 4.0F);
        this.body.addChild(cube_r6);
        this.setRotateAngle(cube_r6, 0.3491F, 0.0F, 0.0F);
        this.cube_r6.cubeList.add(new ModelBox(cube_r6, 33, 3, -1.0F, -1.25F, -3.0F, 2, 1, 3, 0.0F, false));

        this.body3 = new AdvancedModelRenderer(this);
        this.body3.setRotationPoint(0.0F, -2.0F, 16.0F);
        this.body.addChild(body3);
        this.body3.cubeList.add(new ModelBox(body3, 0, 0, -1.0F, -2.5F, 0.0F, 2, 1, 2, 0.0F, false));
        this.body3.cubeList.add(new ModelBox(body3, 34, 19, -1.5F, -2.0F, 0.01F, 3, 4, 2, 0.0F, false));
        this.body3.cubeList.add(new ModelBox(body3, 35, 20, -1.5F, -1.99F, -0.99F, 3, 4, 1, 0.0F, false));
        this.body3.cubeList.add(new ModelBox(body3, 1, 1, -1.0F, -2.5F, -1.0F, 2, 1, 1, 0.0F, false));

        this.cube_r7 = new AdvancedModelRenderer(this);
        this.cube_r7.setRotationPoint(0.0F, -2.0F, 0.75F);
        this.body3.addChild(cube_r7);
        this.setRotateAngle(cube_r7, -0.3491F, 0.0F, 0.0F);
        this.cube_r7.cubeList.add(new ModelBox(cube_r7, 0, 9, 0.0F, -3.4F, 0.0F, 0, 3, 4, 0.0F, false));

        this.pelvicfinL = new AdvancedModelRenderer(this);
        this.pelvicfinL.setRotationPoint(1.5F, 1.25F, 1.0F);
        this.body3.addChild(pelvicfinL);
        this.setRotateAngle(pelvicfinL, 0.0F, -0.7854F, 0.5236F);
        this.pelvicfinL.cubeList.add(new ModelBox(pelvicfinL, 25, 3, 0.0F, 0.0F, 0.0F, 4, 0, 3, 0.0F, false));

        this.pelvicfinR = new AdvancedModelRenderer(this);
        this.pelvicfinR.setRotationPoint(-1.5F, 1.25F, 1.0F);
        this.body3.addChild(pelvicfinR);
        this.setRotateAngle(pelvicfinR, 0.0F, 0.7854F, -0.5236F);
        this.pelvicfinR.cubeList.add(new ModelBox(pelvicfinR, 25, 0, -4.0F, 0.0F, 0.0F, 4, 0, 3, 0.0F, false));

        this.body4 = new AdvancedModelRenderer(this);
        this.body4.setRotationPoint(0.0F, -0.5F, 2.0F);
        this.body3.addChild(body4);
        this.body4.cubeList.add(new ModelBox(body4, 9, 33, -1.0F, -1.5F, 0.0F, 2, 3, 3, 0.0F, false));
        this.body4.cubeList.add(new ModelBox(body4, 11, 35, -1.0F, -1.49F, -1.0F, 2, 3, 1, 0.0F, false));

        this.body5 = new AdvancedModelRenderer(this);
        this.body5.setRotationPoint(0.0F, -0.5F, 3.0F);
        this.body4.addChild(body5);
        this.body5.cubeList.add(new ModelBox(body5, 0, 12, 0.0F, 0.75F, 0.5F, 0, 2, 4, 0.0F, false));
        this.body5.cubeList.add(new ModelBox(body5, 0, 27, -0.5F, -0.76F, 0.0F, 1, 2, 5, 0.0F, false));

        this.body6 = new AdvancedModelRenderer(this);
        this.body6.setRotationPoint(0.0F, 0.0F, 5.0F);
        this.body5.addChild(body6);
        this.body6.cubeList.add(new ModelBox(body6, 0, 14, 0.0F, 0.5F, 0.0F, 0, 2, 4, 0.0F, false));
        this.body6.cubeList.add(new ModelBox(body6, 20, 31, -0.5F, -0.75F, 0.0F, 1, 2, 4, 0.0F, false));

        this.body7 = new AdvancedModelRenderer(this);
        this.body7.setRotationPoint(0.0F, 0.0F, 4.0F);
        this.body6.addChild(body7);
        this.body7.cubeList.add(new ModelBox(body7, 7, 22, 0.0F, 0.25F, 0.0F, 0, 2, 5, 0.0F, false));
        this.body7.cubeList.add(new ModelBox(body7, 12, 27, -0.5F, -0.5F, 0.0F, 1, 1, 5, 0.0F, false));

        this.pectoralfinR = new AdvancedModelRenderer(this);
        this.pectoralfinR.setRotationPoint(-2.0F, -1.0F, 7.0F);
        this.body.addChild(pectoralfinR);
        this.setRotateAngle(pectoralfinR, 0.0F, 0.2618F, -0.2618F);
        this.pectoralfinR.cubeList.add(new ModelBox(pectoralfinR, 20, 21, -5.0F, 0.0F, 0.0F, 5, 0, 4, 0.0F, false));

        this.pectoralfinL = new AdvancedModelRenderer(this);
        this.pectoralfinL.setRotationPoint(2.0F, -1.0F, 7.0F);
        this.body.addChild(pectoralfinL);
        this.setRotateAngle(pectoralfinL, 0.0F, -0.2618F, 0.2618F);
        this.pectoralfinL.cubeList.add(new ModelBox(pectoralfinL, 22, 8, 0.0F, 0.0F, 0.0F, 5, 0, 4, 0.0F, false));

        this.lowerjaw = new AdvancedModelRenderer(this);
        this.lowerjaw.setRotationPoint(0.0F, -1.0F, 3.25F);
        this.body.addChild(lowerjaw);


        this.cube_r8 = new AdvancedModelRenderer(this);
        this.cube_r8.setRotationPoint(0.0F, 0.65F, -3.0F);
        this.lowerjaw.addChild(cube_r8);
        this.setRotateAngle(cube_r8, 0.3491F, 0.0F, 0.0F);
        this.cube_r8.cubeList.add(new ModelBox(cube_r8, 35, 35, -1.0F, 0.425F, 1.0F, 2, 1, 3, 0.0F, false));

        updateDefaultPose();
        animator = ModelAnimator.create();
    }

    @Override
    public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        animate((IAnimatedEntity) entity, f, f1, f2, f3, f4, f5);
        this.body.render(f5 * 0.4f);
    }
    public void renderStatic(float f) {
        GlStateManager.pushMatrix();
        GlStateManager.enableBlend();
        GlStateManager.blendFunc(GlStateManager.SourceFactor.SRC_ALPHA, GlStateManager.DestFactor.ONE_MINUS_SRC_ALPHA);
        this.body.rotateAngleY = (float) Math.toRadians(90);
        this.body.render(0.01F);
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
        this.body.offsetY = 0.9F;

        EntityPrehistoricFloraBandringa Bandringa = (EntityPrehistoricFloraBandringa) e;

        this.faceTarget(f3, f4, 2, body);

        float speed = 0.32F;
        if (Bandringa.getIsFeeding()) {
            speed = 0.15F;
        }
        if (!e.isInWater()) {
            speed = 0.72F;
        }

        AdvancedModelRenderer[] Tail = {this.body3, this.body4, this.body5, this.body6, this.body7};

        if (e instanceof EntityLiving && !((EntityLiving) e).isAIDisabled()) {
            this.chainWave(Tail, speed, 0.05F, -3, f2, 1);
            this.chainSwing(Tail, speed, 0.2F, -1.5, f2, 1);
            this.swing(body, speed, 0.12F, true, 0, 0, f2, 1);
            this.walk(lowerjaw, (float) (speed * 0.75), 0.2F, true, 0, 0, f2, 1);
            this.walk(pectoralfinL, (float) (speed * 0.75), 0.2F, true, 0, 0, f2, 1);
            this.swing(pectoralfinL, (float) (speed * 0.75), 0.2F, true, 0, 0, f2, 1);
            this.walk(pectoralfinR, (float) (speed * 0.75), 0.2F, true, 0, 0, f2, 1);
            this.swing(pectoralfinR, (float) (speed * 0.75), 0.2F, true, 0, 0, f2, 1);
            if (!e.isInWater()) {
                this.body.rotateAngleZ = (float) Math.toRadians(90);
                this.body.offsetY = 0.875F;
                this.bob(body, -speed, 5F, false, f2, 1);
            }
        }
    }

    public void animate(IAnimatedEntity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        EntityPrehistoricFloraBandringa e = (EntityPrehistoricFloraBandringa) entity;
        animator.update(entity);
        this.resetToDefaultPose();
        setRotationAngles(f, f1, f2, f3, f4, f5, (Entity) entity);

        animator.setAnimation(e.FEED_ANIMATION); //duration 100
        animator.startKeyframe(20);
        animator.move(this.body, 0 , 12,0);
        animator.rotate(this.body, (float) Math.toRadians(45), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(this.body5, (float) Math.toRadians(-7.5), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(this.body4, (float) Math.toRadians(-12.5), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(this.body3, (float) Math.toRadians(-15), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.endKeyframe();
        animator.setStaticKeyframe(5);
        animator.startKeyframe(2);
        animator.move(this.body, 0 , 12,0);
        animator.rotate(this.body, (float) Math.toRadians(45), (float) Math.toRadians(0), (float) Math.toRadians(-20));
        animator.rotate(this.body5, (float) Math.toRadians(-7.5), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(this.body4, (float) Math.toRadians(-12.5), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(this.body3, (float) Math.toRadians(-15), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.endKeyframe();
        animator.setStaticKeyframe(2);
        animator.startKeyframe(2);
        animator.move(this.body, 0 , 12,0);
        animator.rotate(this.body, (float) Math.toRadians(45), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(this.body5, (float) Math.toRadians(-7.5), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(this.body4, (float) Math.toRadians(-12.5), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(this.body3, (float) Math.toRadians(-15), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.endKeyframe();
        animator.setStaticKeyframe(2);
        animator.startKeyframe(2);
        animator.move(this.body, 0 , 12,0);
        animator.rotate(this.body, (float) Math.toRadians(45), (float) Math.toRadians(0), (float) Math.toRadians(20));
        animator.rotate(this.body5, (float) Math.toRadians(-7.5), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(this.body4, (float) Math.toRadians(-12.5), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(this.body3, (float) Math.toRadians(-15), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.endKeyframe();
        animator.setStaticKeyframe(2);
        animator.startKeyframe(2);
        animator.move(this.body, 0 , 12,0);
        animator.rotate(this.body, (float) Math.toRadians(45), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(this.body5, (float) Math.toRadians(-7.5), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(this.body4, (float) Math.toRadians(-12.5), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(this.body3, (float) Math.toRadians(-15), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.endKeyframe();
        animator.startKeyframe(5);
        animator.move(this.body, 0 , 12,0);
        animator.rotate(this.body, (float) Math.toRadians(45), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(this.body5, (float) Math.toRadians(-7.5), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(this.body4, (float) Math.toRadians(-12.5), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(this.body3, (float) Math.toRadians(-15), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.endKeyframe();
        animator.setStaticKeyframe(1);
        animator.startKeyframe(5);
        animator.move(this.body, 0 , 5,0);
        animator.rotate(this.body, (float) Math.toRadians(35), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(this.body5, (float) Math.toRadians(-20.0), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(this.body4, (float) Math.toRadians(-12.5), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(this.body3, (float) Math.toRadians(-15), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(this.body6, (float) Math.toRadians(-10), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.endKeyframe();
        animator.setStaticKeyframe(1);
        animator.startKeyframe(20);
        animator.move(this.body, 0 , 12,0);
        animator.rotate(this.body, (float) Math.toRadians(45), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(this.body5, (float) Math.toRadians(-7.5), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(this.body4, (float) Math.toRadians(-12.5), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(this.body3, (float) Math.toRadians(-15), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.endKeyframe();
        animator.setStaticKeyframe(5);
        animator.startKeyframe(2);
        animator.move(this.body, 0 , 12,0);
        animator.rotate(this.body, (float) Math.toRadians(45), (float) Math.toRadians(0), (float) Math.toRadians(-20));
        animator.rotate(this.body5, (float) Math.toRadians(-7.5), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(this.body4, (float) Math.toRadians(-12.5), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(this.body3, (float) Math.toRadians(-15), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.endKeyframe();
        animator.setStaticKeyframe(2);
        animator.startKeyframe(2);
        animator.move(this.body, 0 , 12,0);
        animator.rotate(this.body, (float) Math.toRadians(45), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(this.body5, (float) Math.toRadians(-7.5), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(this.body4, (float) Math.toRadians(-12.5), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(this.body3, (float) Math.toRadians(-15), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.endKeyframe();
        animator.setStaticKeyframe(2);
        animator.startKeyframe(2);
        animator.move(this.body, 0 , 12,0);
        animator.rotate(this.body, (float) Math.toRadians(45), (float) Math.toRadians(0), (float) Math.toRadians(20));
        animator.rotate(this.body5, (float) Math.toRadians(-7.5), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(this.body4, (float) Math.toRadians(-12.5), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(this.body3, (float) Math.toRadians(-15), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.endKeyframe();
        animator.setStaticKeyframe(2);
        animator.startKeyframe(2);
        animator.move(this.body, 0 , 12,0);
        animator.rotate(this.body, (float) Math.toRadians(45), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(this.body5, (float) Math.toRadians(-7.5), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(this.body4, (float) Math.toRadians(-12.5), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(this.body3, (float) Math.toRadians(-15), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.endKeyframe();
        animator.startKeyframe(5);
        animator.move(this.body, 0 , 12,0);
        animator.rotate(this.body, (float) Math.toRadians(45), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(this.body5, (float) Math.toRadians(-7.5), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(this.body4, (float) Math.toRadians(-12.5), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(this.body3, (float) Math.toRadians(-15), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.endKeyframe();
        animator.setStaticKeyframe(1);
        animator.startKeyframe(5);
        animator.move(this.body, 0 , 5,0);
        animator.rotate(this.body, (float) Math.toRadians(35), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(this.body5, (float) Math.toRadians(-20.0), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(this.body4, (float) Math.toRadians(-12.5), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(this.body3, (float) Math.toRadians(-15), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(this.body6, (float) Math.toRadians(-10), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.endKeyframe();
        animator.setStaticKeyframe(1);
        animator.startKeyframe(5);
        animator.move(this.body, 0 , 5,0);
        animator.rotate(this.body, (float) Math.toRadians(35), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(this.body5, (float) Math.toRadians(-20.0), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(this.body4, (float) Math.toRadians(-12.5), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(this.body3, (float) Math.toRadians(-15), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(this.body6, (float) Math.toRadians(-10), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.endKeyframe();
        animator.setStaticKeyframe(1);
        animator.resetKeyframe(10);

    }
}
