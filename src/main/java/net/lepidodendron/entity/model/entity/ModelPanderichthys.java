package net.lepidodendron.entity.model.entity;

import net.ilexiconn.llibrary.client.model.ModelAnimator;
import net.ilexiconn.llibrary.client.model.tools.AdvancedModelBase;
import net.ilexiconn.llibrary.client.model.tools.AdvancedModelRenderer;
import net.ilexiconn.llibrary.server.animation.IAnimatedEntity;
import net.lepidodendron.entity.EntityPrehistoricFloraPanderichthys;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

public class ModelPanderichthys extends AdvancedModelBase {
    private final AdvancedModelRenderer body;
    private final AdvancedModelRenderer body2;
    private final AdvancedModelRenderer body3;
    private final AdvancedModelRenderer body4;
    private final AdvancedModelRenderer pelvicfinL;
    private final AdvancedModelRenderer pelvicfinR;
    private final AdvancedModelRenderer body5;
    private final AdvancedModelRenderer body6;
    private final AdvancedModelRenderer body7;
    private final AdvancedModelRenderer upperjaw;
    private final AdvancedModelRenderer cube_r1;
    private final AdvancedModelRenderer cube_r2;
    private final AdvancedModelRenderer cube_r3;
    private final AdvancedModelRenderer bone;
    private final AdvancedModelRenderer cube_r4;
    private final AdvancedModelRenderer cube_r5;
    private final AdvancedModelRenderer cube_r6;
    private final AdvancedModelRenderer cube_r7;
    private final AdvancedModelRenderer lowerjaw;
    private final AdvancedModelRenderer cube_r8;
    private final AdvancedModelRenderer cube_r9;
    private final AdvancedModelRenderer pectoralfinL;
    private final AdvancedModelRenderer pectoralfinR;

    private ModelAnimator animator;

    public ModelPanderichthys() {
        this.textureWidth = 70;
        this.textureHeight = 64;

        this.body = new AdvancedModelRenderer(this);
        this.body.setRotationPoint(0.0F, 20.0F, -3.0F);
        this.body.cubeList.add(new ModelBox(body, 0, 0, -4.5F, -2.0F, 0.0F, 9, 6, 10, 0.0F, false));

        this.body2 = new AdvancedModelRenderer(this);
        this.body2.setRotationPoint(0.0F, 0.5F, 10.0F);
        this.body.addChild(body2);
        this.body2.cubeList.add(new ModelBox(body2, 0, 16, -4.0F, -2.49F, -1.0F, 8, 6, 7, 0.0F, false));

        this.body3 = new AdvancedModelRenderer(this);
        this.body3.setRotationPoint(0.0F, 0.5F, 6.0F);
        this.body2.addChild(body3);
        this.body3.cubeList.add(new ModelBox(body3, 33, 37, -3.0F, -2.98F, -1.0F, 6, 6, 6, 0.0F, false));

        this.body4 = new AdvancedModelRenderer(this);
        this.body4.setRotationPoint(0.0F, 0.0F, 5.0F);
        this.body3.addChild(body4);
        this.body4.cubeList.add(new ModelBox(body4, 0, 41, -2.5F, -2.5F, -1.0F, 5, 5, 5, 0.0F, false));

        this.pelvicfinL = new AdvancedModelRenderer(this);
        this.pelvicfinL.setRotationPoint(2.5F, 1.25F, 2.75F);
        this.body4.addChild(pelvicfinL);
        this.setRotateAngle(pelvicfinL, -0.3491F, -1.2217F, 0.3491F);
        this.pelvicfinL.cubeList.add(new ModelBox(pelvicfinL, 57, 7, -1.5F, 0.0F, 0.0F, 5, 1, 1, 0.0F, false));
        this.pelvicfinL.cubeList.add(new ModelBox(pelvicfinL, 18, 56, -1.49F, -0.5F, 0.01F, 5, 1, 1, 0.0F, false));
        this.pelvicfinL.cubeList.add(new ModelBox(pelvicfinL, 0, 18, 2.0F, -0.75F, 0.5F, 3, 2, 0, 0.0F, false));
        this.pelvicfinL.cubeList.add(new ModelBox(pelvicfinL, 2, 3, 5.0F, -0.25F, 0.5F, 1, 1, 0, 0.0F, false));

        this.pelvicfinR = new AdvancedModelRenderer(this);
        this.pelvicfinR.setRotationPoint(-2.5F, 1.25F, 2.75F);
        this.body4.addChild(pelvicfinR);
        this.setRotateAngle(pelvicfinR, -0.3491F, 1.2217F, -0.3491F);
        this.pelvicfinR.cubeList.add(new ModelBox(pelvicfinR, 51, 41, -3.5F, 0.0F, 0.0F, 5, 1, 1, 0.0F, false));
        this.pelvicfinR.cubeList.add(new ModelBox(pelvicfinR, 34, 18, -3.51F, -0.5F, 0.01F, 5, 1, 1, 0.0F, false));
        this.pelvicfinR.cubeList.add(new ModelBox(pelvicfinR, 0, 16, -5.0F, -0.75F, 0.5F, 3, 2, 0, 0.0F, false));
        this.pelvicfinR.cubeList.add(new ModelBox(pelvicfinR, 0, 3, -6.0F, -0.25F, 0.5F, 1, 1, 0, 0.0F, false));

        this.body5 = new AdvancedModelRenderer(this);
        this.body5.setRotationPoint(0.0F, 0.0F, 4.0F);
        this.body4.addChild(body5);
        this.body5.cubeList.add(new ModelBox(body5, 20, 43, -1.5F, -2.0F, -1.0F, 3, 4, 6, 0.0F, false));

        this.body6 = new AdvancedModelRenderer(this);
        this.body6.setRotationPoint(0.0F, 0.0F, 5.0F);
        this.body5.addChild(body6);
        this.body6.cubeList.add(new ModelBox(body6, 51, 32, -1.0F, -1.5F, -1.0F, 2, 3, 6, 0.0F, false));
        this.body6.cubeList.add(new ModelBox(body6, 0, 24, 0.0F, -3.0F, 0.0F, 0, 6, 5, 0.0F, false));

        this.body7 = new AdvancedModelRenderer(this);
        this.body7.setRotationPoint(0.0F, 0.0F, 5.0F);
        this.body6.addChild(body7);
        this.body7.cubeList.add(new ModelBox(body7, 52, 44, -0.5F, -1.0F, -1.0F, 1, 2, 5, 0.0F, false));
        this.body7.cubeList.add(new ModelBox(body7, 6, 0, -0.5F, -0.75F, 4.0F, 1, 1, 1, 0.0F, false));
        this.body7.cubeList.add(new ModelBox(body7, 28, 22, 0.0F, -2.5F, 0.0F, 0, 5, 10, 0.0F, false));

        this.upperjaw = new AdvancedModelRenderer(this);
        this.upperjaw.setRotationPoint(0.0F, 0.65F, 0.0F);
        this.body.addChild(upperjaw);


        this.cube_r1 = new AdvancedModelRenderer(this);
        this.cube_r1.setRotationPoint(0.0F, -0.5F, -11.5F);
        this.upperjaw.addChild(cube_r1);
        this.setRotateAngle(cube_r1, 0.0873F, 0.0F, 0.0F);
        this.cube_r1.cubeList.add(new ModelBox(cube_r1, 47, 24, -1.5F, -1.05F, 0.75F, 3, 2, 4, 0.0F, false));

        this.cube_r2 = new AdvancedModelRenderer(this);
        this.cube_r2.setRotationPoint(0.0F, -0.5F, -11.5F);
        this.upperjaw.addChild(cube_r2);
        this.setRotateAngle(cube_r2, 0.0436F, 0.0F, 0.0F);
        this.cube_r2.cubeList.add(new ModelBox(cube_r2, 42, 7, -2.5F, -1.6F, 7.0F, 5, 3, 5, 0.0F, false));

        this.cube_r3 = new AdvancedModelRenderer(this);
        this.cube_r3.setRotationPoint(0.0F, -0.5F, -5.5F);
        this.upperjaw.addChild(cube_r3);
        this.setRotateAngle(cube_r3, 0.0436F, 0.0F, 0.0F);
        this.cube_r3.cubeList.add(new ModelBox(cube_r3, 28, 0, -2.0F, -1.85F, -1.85F, 4, 2, 3, 0.0F, false));

        this.bone = new AdvancedModelRenderer(this);
        this.bone.setRotationPoint(0.0F, -1.25F, -11.0F);
        this.upperjaw.addChild(bone);
        this.setRotateAngle(bone, -0.1134F, 0.0F, 0.0F);
        this.bone.cubeList.add(new ModelBox(bone, 42, 0, -3.0F, 0.63F, 5.5F, 6, 1, 6, 0.0F, false));
        this.bone.cubeList.add(new ModelBox(bone, 26, 53, -2.0F, 0.63F, 3.5F, 4, 1, 2, 0.0F, false));
        this.bone.cubeList.add(new ModelBox(bone, 27, 54, -2.0F, 0.63F, 2.5F, 4, 1, 1, 0.0F, false));

        this.cube_r4 = new AdvancedModelRenderer(this);
        this.cube_r4.setRotationPoint(-2.0F, 1.65F, 12.25F);
        this.bone.addChild(cube_r4);
        this.setRotateAngle(cube_r4, 0.0F, -0.3072F, 0.0F);
        this.cube_r4.cubeList.add(new ModelBox(cube_r4, 19, 18, -3.0F, -2.0F, -11.15F, 2, 2, 11, 0.0F, false));

        this.cube_r5 = new AdvancedModelRenderer(this);
        this.cube_r5.setRotationPoint(-2.0F, 1.65F, 12.25F);
        this.bone.addChild(cube_r5);
        this.setRotateAngle(cube_r5, 0.1396F, -0.3054F, 0.0F);
        this.cube_r5.cubeList.add(new ModelBox(cube_r5, 40, 49, -2.9F, -3.51F, -6.15F, 3, 2, 6, 0.0F, false));

        this.cube_r6 = new AdvancedModelRenderer(this);
        this.cube_r6.setRotationPoint(2.0F, 1.65F, 12.25F);
        this.bone.addChild(cube_r6);
        this.setRotateAngle(cube_r6, 0.1396F, 0.3054F, 0.0F);
        this.cube_r6.cubeList.add(new ModelBox(cube_r6, 0, 51, -0.1F, -3.51F, -6.15F, 3, 2, 6, 0.0F, false));

        this.cube_r7 = new AdvancedModelRenderer(this);
        this.cube_r7.setRotationPoint(2.0F, 1.65F, 12.25F);
        this.bone.addChild(cube_r7);
        this.setRotateAngle(cube_r7, 0.0F, 0.3072F, 0.0F);
        this.cube_r7.cubeList.add(new ModelBox(cube_r7, 27, 5, 1.0F, -2.01F, -11.15F, 2, 2, 11, 0.0F, false));

        this.lowerjaw = new AdvancedModelRenderer(this);
        this.lowerjaw.setRotationPoint(0.0F, 2.7F, 0.25F);
        this.body.addChild(lowerjaw);
        this.setRotateAngle(lowerjaw, -0.1484F, 0.0F, 0.0F);
        this.lowerjaw.cubeList.add(new ModelBox(lowerjaw, 0, 29, -1.0F, 0.0F, -10.9F, 2, 1, 11, 0.0F, false));

        this.cube_r8 = new AdvancedModelRenderer(this);
        this.cube_r8.setRotationPoint(1.5F, 1.0F, -11.0F);
        this.lowerjaw.addChild(cube_r8);
        this.setRotateAngle(cube_r8, 0.0F, 0.2618F, -0.0873F);
        this.cube_r8.cubeList.add(new ModelBox(cube_r8, 15, 31, -1.5F, -1.21F, 0.0F, 1, 1, 11, 0.0F, false));
        this.cube_r8.cubeList.add(new ModelBox(cube_r8, 0, 0, -3.5F, -1.21F, 7.0F, 1, 1, 4, 0.0F, false));
        this.cube_r8.cubeList.add(new ModelBox(cube_r8, 47, 15, -2.5F, -1.21F, 3.0F, 1, 1, 8, 0.0F, false));

        this.cube_r9 = new AdvancedModelRenderer(this);
        this.cube_r9.setRotationPoint(-1.5F, 1.0F, -11.0F);
        this.lowerjaw.addChild(cube_r9);
        this.setRotateAngle(cube_r9, 0.0F, -0.2618F, 0.0873F);
        this.cube_r9.cubeList.add(new ModelBox(cube_r9, 0, 5, 2.5F, -1.21F, 7.0F, 1, 1, 4, 0.0F, false));
        this.cube_r9.cubeList.add(new ModelBox(cube_r9, 30, 49, 1.5F, -1.21F, 3.0F, 1, 1, 8, 0.0F, false));
        this.cube_r9.cubeList.add(new ModelBox(cube_r9, 34, 20, 0.5F, -1.21F, 0.0F, 1, 1, 11, 0.0F, false));

        this.pectoralfinL = new AdvancedModelRenderer(this);
        this.pectoralfinL.setRotationPoint(4.5F, 2.5F, 2.0F);
        this.body.addChild(pectoralfinL);
        this.setRotateAngle(pectoralfinL, -0.3491F, -1.0472F, 0.3491F);
        this.pectoralfinL.cubeList.add(new ModelBox(pectoralfinL, 12, 53, -1.0F, -0.75F, 0.0F, 5, 2, 1, 0.0F, false));
        this.pectoralfinL.cubeList.add(new ModelBox(pectoralfinL, 15, 31, 4.5F, -2.0F, 0.5F, 4, 4, 0, 0.0F, false));
        this.pectoralfinL.cubeList.add(new ModelBox(pectoralfinL, 0, 5, 2.5F, -1.25F, 0.5F, 2, 3, 0, 0.0F, false));

        this.pectoralfinR = new AdvancedModelRenderer(this);
        this.pectoralfinR.setRotationPoint(-4.5F, 2.5F, 2.0F);
        this.body.addChild(pectoralfinR);
        this.setRotateAngle(pectoralfinR, -0.3491F, 1.0472F, -0.3491F);
        this.pectoralfinR.cubeList.add(new ModelBox(pectoralfinR, 53, 51, -4.0F, -0.75F, 0.0F, 5, 2, 1, 0.0F, false));
        this.pectoralfinR.cubeList.add(new ModelBox(pectoralfinR, 28, 5, -8.5F, -2.0F, 0.5F, 4, 4, 0, 0.0F, false));
        this.pectoralfinR.cubeList.add(new ModelBox(pectoralfinR, 0, 0, -4.5F, -1.25F, 0.5F, 2, 3, 0, 0.0F, false));

        updateDefaultPose();
        animator = ModelAnimator.create();
    }

    @Override
    public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        animate((IAnimatedEntity) entity, f, f1, f2, f3, f4, f5);
        this.body.render(f5 * 0.4715F);
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

        EntityPrehistoricFloraPanderichthys Panderichthys = (EntityPrehistoricFloraPanderichthys) e;

        this.body.offsetY = 0.65F;

        AdvancedModelRenderer[] fishTail = {this.body2, this.body3, this.body4, this.body5, this.body6, this.body7};

        float speed = 0.136F;

        float still = 1f;
        if (f3 == 0.0F) {
            still = 0.6F;
        }
        if (!e.isInWater()) {
            speed = 0.225F;
        }

        if (e.isInWater()) {
            this.chainWave(fishTail, speed * still, 0.02F * still, -0.2, f2, 0.8F * still);
            this.chainSwing(fishTail, speed * still, 0.40F * still, -1.05, f2, 0.5F * still);
            this.swing(body, speed, 0.2F, true, 0, 0, f2, 0.8F);
        }
        else {
            this.swing(body, speed, 0.1F, true, 0, 0, f2, 0.5F);
        }

        if (Panderichthys.getAnimation() != Panderichthys.BREATHE_ANIMATION) {
            this.walk(pectoralfinL, (float) (speed * 0.75), 0.2F, true, 3, 0, f2, 1);
            this.swing(pectoralfinL, (float) (speed * 0.75), 0.2F, true, 3, 0, f2, 1);
            this.walk(pectoralfinR, (float) (speed * 0.75), 0.2F, true, 3, 0, f2, 1);
            this.swing(pectoralfinR, (float) (speed * 0.75), -0.2F, true, 3, 0, f2, 1);
        }

        this.walk(pelvicfinL, (float) (speed * 0.75), 0.2F, true, 3, 0, f2, 1);
        this.swing(pelvicfinL, (float) (speed * 0.75), 0.2F, true, 3, 0, f2, 1);
        this.flap(pelvicfinL, (float) (speed * 0.75), 0.2F, true, 3, 0, f2, 1);

        this.walk(pelvicfinR, (float) (speed * 0.75), 0.2F, true, 3, 0, f2, 1);
        this.swing(pelvicfinR, (float) (speed * 0.75), -0.2F, true, 3, 0, f2, 1);
        this.flap(pelvicfinR, (float) (speed * 0.75), 0.2F, true, 3, 0, f2, 1);

        if (!e.isInWater()) {
            //this.body.rotateAngleZ = (float) Math.toRadians(90);
            this.body.offsetY = 0.80F;
            this.bob(body, -speed * 3.3F, 2.5F, false, f2, 1);
            this.chainWave(fishTail, speed * 3.3F, 0.02F, -0.2, f2, 0.8F * still);
            this.chainSwing(fishTail, speed * 3.3F, 0.2F, -0.55, f2, 0.4F * still);

        }

    }

    public void animate(IAnimatedEntity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        EntityPrehistoricFloraPanderichthys e = (EntityPrehistoricFloraPanderichthys) entity;
        animator.update(entity);
        this.resetToDefaultPose();
        setRotationAngles(f, f1, f2, f3, f4, f5, (Entity) entity);

        animator.setAnimation(e.BREATHE_ANIMATION);
        animator.startKeyframe(5);
        animator.move(this.body, 0 , -10,0);
        animator.rotate(this.body, (float) Math.toRadians(-15), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(this.body2, (float) Math.toRadians(15), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(this.pectoralfinL, (float) Math.toRadians(-30), (float) Math.toRadians(30), (float) Math.toRadians(10));
        animator.rotate(this.pectoralfinR, (float) Math.toRadians(-30), (float) Math.toRadians(30), (float) Math.toRadians(-10));
        animator.rotate(this.upperjaw, (float) Math.toRadians(-40), (float) Math.toRadians(5), (float) Math.toRadians(0));
        animator.rotate(this.lowerjaw, (float) Math.toRadians(22.5), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.endKeyframe();
        animator.setStaticKeyframe(4);
        animator.startKeyframe(2);
        animator.move(this.body, 0 , -10,0);
        animator.rotate(this.body, (float) Math.toRadians(-15), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(this.body2, (float) Math.toRadians(15), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(this.pectoralfinL, (float) Math.toRadians(-30), (float) Math.toRadians(30), (float) Math.toRadians(10));
        animator.rotate(this.pectoralfinR, (float) Math.toRadians(-30), (float) Math.toRadians(30), (float) Math.toRadians(-10));
        animator.rotate(this.upperjaw, (float) Math.toRadians(-35), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.endKeyframe();
        animator.setStaticKeyframe(4);
        animator.startKeyframe(5);
        animator.move(this.body, 0 , -10,0);
        animator.rotate(this.body, (float) Math.toRadians(-15), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(this.body2, (float) Math.toRadians(15), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(this.pectoralfinL, (float) Math.toRadians(-30), (float) Math.toRadians(30), (float) Math.toRadians(10));
        animator.rotate(this.pectoralfinR, (float) Math.toRadians(-30), (float) Math.toRadians(30), (float) Math.toRadians(-10));
        animator.rotate(this.upperjaw, (float) Math.toRadians(-40), (float) Math.toRadians(-5), (float) Math.toRadians(0));
        animator.rotate(this.lowerjaw, (float) Math.toRadians(22.5), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.endKeyframe();
        animator.setStaticKeyframe(2);
        animator.startKeyframe(2);
        animator.move(this.body, 0 , -10,0);
        animator.rotate(this.body, (float) Math.toRadians(-15), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(this.body2, (float) Math.toRadians(15), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(this.pectoralfinL, (float) Math.toRadians(-30), (float) Math.toRadians(30), (float) Math.toRadians(10));
        animator.rotate(this.pectoralfinR, (float) Math.toRadians(-30), (float) Math.toRadians(30), (float) Math.toRadians(-10));
        animator.rotate(this.upperjaw, (float) Math.toRadians(-35), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.endKeyframe();
        animator.setStaticKeyframe(4);
        animator.startKeyframe(5);
        animator.move(this.body, 0 , -10,0);
        animator.rotate(this.body, (float) Math.toRadians(-15), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(this.body2, (float) Math.toRadians(15), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(this.pectoralfinL, (float) Math.toRadians(-30), (float) Math.toRadians(30), (float) Math.toRadians(10));
        animator.rotate(this.pectoralfinR, (float) Math.toRadians(-30), (float) Math.toRadians(30), (float) Math.toRadians(-10));
        animator.rotate(this.upperjaw, (float) Math.toRadians(-40), (float) Math.toRadians(5), (float) Math.toRadians(0));
        animator.rotate(this.lowerjaw, (float) Math.toRadians(22.5), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.endKeyframe();
        animator.setStaticKeyframe(4);
        animator.startKeyframe(2);
        animator.move(this.body, 0 , -10,0);
        animator.rotate(this.body, (float) Math.toRadians(-15), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(this.body2, (float) Math.toRadians(15), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(this.pectoralfinL, (float) Math.toRadians(-30), (float) Math.toRadians(30), (float) Math.toRadians(10));
        animator.rotate(this.pectoralfinR, (float) Math.toRadians(-30), (float) Math.toRadians(30), (float) Math.toRadians(-10));
        animator.rotate(this.upperjaw, (float) Math.toRadians(-35), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.endKeyframe();
        animator.resetKeyframe(10);
    }
}