package net.lepidodendron.entity.model.entity;

import net.ilexiconn.llibrary.client.model.ModelAnimator;
import net.ilexiconn.llibrary.client.model.tools.AdvancedModelRenderer;
import net.ilexiconn.llibrary.server.animation.IAnimatedEntity;
import net.lepidodendron.entity.EntityPrehistoricFloraMooreodontus;
import net.lepidodendron.entity.base.EntityPrehistoricFloraAgeableBase;
import net.lepidodendron.entity.model.ModelBasePalaeopedia;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

public class ModelMooreodontus extends ModelBasePalaeopedia {
    private final AdvancedModelRenderer base;
    private final AdvancedModelRenderer cube_r1;
    private final AdvancedModelRenderer cube_r2;
    private final AdvancedModelRenderer cube_r3;
    private final AdvancedModelRenderer cube_r4;
    private final AdvancedModelRenderer pectoralfinright;
    private final AdvancedModelRenderer pectoralfinleft;
    private final AdvancedModelRenderer body;
    private final AdvancedModelRenderer cube_r5;
    private final AdvancedModelRenderer body2;
    private final AdvancedModelRenderer cube_r6;
    private final AdvancedModelRenderer cube_r7;
    private final AdvancedModelRenderer pelvicfinright;
    private final AdvancedModelRenderer pelvicfinleft;
    private final AdvancedModelRenderer body3;
    private final AdvancedModelRenderer cube_r8;
    private final AdvancedModelRenderer cube_r9;
    private final AdvancedModelRenderer body4;
    private final AdvancedModelRenderer jaw;
    private final AdvancedModelRenderer cube_r10;

    private ModelAnimator animator;

    public ModelMooreodontus() {
        this.textureWidth = 64;
        this.textureHeight = 64;

        this.base = new AdvancedModelRenderer(this);
        this.base.setRotationPoint(0.0F, 24.0F, 0.0F);
        this.base.cubeList.add(new ModelBox(base, 30, 0, -2.5F, -10.0F, -9.0F, 5, 5, 6, 0.01F, false));
        this.base.cubeList.add(new ModelBox(base, 0, 43, -2.0F, -9.25F, -10.75F, 4, 4, 2, 0.0F, false));
        this.base.cubeList.add(new ModelBox(base, 45, 26, -2.0F, -8.7F, -12.55F, 4, 2, 2, 0.02F, false));

        this.cube_r1 = new AdvancedModelRenderer(this);
        this.cube_r1.setRotationPoint(-2.0F, -9.65F, -9.0F);
        this.base.addChild(cube_r1);
        this.setRotateAngle(cube_r1, 0.5236F, 0.0F, 0.0F);
        this.cube_r1.cubeList.add(new ModelBox(cube_r1, 0, 3, 2.0F, -0.25F, 0.0F, 0, 1, 5, 0.0F, false));

        this.cube_r2 = new AdvancedModelRenderer(this);
        this.cube_r2.setRotationPoint(0.0F, -8.65F, -9.5F);
        this.base.addChild(cube_r2);
        this.setRotateAngle(cube_r2, 0.3054F, 0.0F, 0.0F);
        this.cube_r2.cubeList.add(new ModelBox(cube_r2, 36, 20, -2.0F, -1.0F, -4.0F, 4, 1, 5, -0.01F, false));

        this.cube_r3 = new AdvancedModelRenderer(this);
        this.cube_r3.setRotationPoint(0.0F, -5.55F, -10.6F);
        this.base.addChild(cube_r3);
        this.setRotateAngle(cube_r3, -0.5236F, 0.0F, 0.0F);
        this.cube_r3.cubeList.add(new ModelBox(cube_r3, 40, 40, -2.0F, -1.0F, -4.0F, 4, 1, 4, 0.01F, false));

        this.cube_r4 = new AdvancedModelRenderer(this);
        this.cube_r4.setRotationPoint(-0.5F, -4.25F, -8.25F);
        this.base.addChild(cube_r4);
        this.setRotateAngle(cube_r4, -0.1309F, 0.0F, 0.0F);
        this.cube_r4.cubeList.add(new ModelBox(cube_r4, 36, 12, -1.5F, -2.0F, -1.0F, 4, 2, 6, 0.0F, false));

        this.pectoralfinright = new AdvancedModelRenderer(this);
        this.pectoralfinright.setRotationPoint(-2.15F, -5.75F, -5.0F);
        this.base.addChild(pectoralfinright);
        this.setRotateAngle(pectoralfinright, -0.2618F, -0.1309F, 0.6981F);
        this.pectoralfinright.cubeList.add(new ModelBox(pectoralfinright, 0, 32, 0.0F, 0.0F, -0.5F, 0, 4, 7, 0.0F, false));

        this.pectoralfinleft = new AdvancedModelRenderer(this);
        this.pectoralfinleft.setRotationPoint(2.15F, -5.75F, -5.0F);
        this.base.addChild(pectoralfinleft);
        this.setRotateAngle(pectoralfinleft, -0.2618F, 0.1309F, -0.6981F);
        this.pectoralfinleft.cubeList.add(new ModelBox(pectoralfinleft, 0, 32, 0.0F, 0.0F, -0.5F, 0, 4, 7, 0.0F, true));

        this.body = new AdvancedModelRenderer(this);
        this.body.setRotationPoint(0.0F, -7.0F, -3.0F);
        this.base.addChild(body);
        this.body.cubeList.add(new ModelBox(body, 0, 0, -2.5F, -3.0F, -0.5F, 5, 6, 10, 0.0F, false));
        this.body.cubeList.add(new ModelBox(body, 18, 6, 0.0F, -5.0F, -1.0F, 0, 2, 10, 0.0F, false));

        this.cube_r5 = new AdvancedModelRenderer(this);
        this.cube_r5.setRotationPoint(1.0F, 3.4F, 0.0F);
        this.body.addChild(cube_r5);
        this.setRotateAngle(cube_r5, -0.0436F, 0.0F, 0.0F);
        this.cube_r5.cubeList.add(new ModelBox(cube_r5, 0, 16, -3.0F, -1.0F, -1.0F, 4, 1, 10, 0.01F, false));

        this.body2 = new AdvancedModelRenderer(this);
        this.body2.setRotationPoint(0.0F, 0.0F, 9.0F);
        this.body.addChild(body2);
        this.body2.cubeList.add(new ModelBox(body2, 15, 21, 0.0F, -4.75F, 0.0F, 0, 3, 10, 0.0F, false));

        this.cube_r6 = new AdvancedModelRenderer(this);
        this.cube_r6.setRotationPoint(0.5F, 3.527F, 0.646F);
        this.body2.addChild(cube_r6);
        this.setRotateAngle(cube_r6, 0.1745F, 0.0F, 0.0F);
        this.cube_r6.cubeList.add(new ModelBox(cube_r6, 0, 27, -2.0F, -3.175F, -1.0F, 3, 3, 9, 0.0F, false));

        this.cube_r7 = new AdvancedModelRenderer(this);
        this.cube_r7.setRotationPoint(1.0F, 1.477F, 0.446F);
        this.body2.addChild(cube_r7);
        this.setRotateAngle(cube_r7, -0.0873F, 0.0F, 0.0F);
        this.cube_r7.cubeList.add(new ModelBox(cube_r7, 19, 18, -3.0F, -4.175F, -1.0F, 4, 4, 9, 0.0F, false));

        this.pelvicfinright = new AdvancedModelRenderer(this);
        this.pelvicfinright.setRotationPoint(-1.5F, 2.777F, 2.646F);
        this.body2.addChild(pelvicfinright);
        this.setRotateAngle(pelvicfinright, 0.0873F, 0.0F, 0.6109F);
        this.pelvicfinright.cubeList.add(new ModelBox(pelvicfinright, 0, 11, 0.0F, 0.0F, -1.25F, 0, 3, 5, 0.0F, false));

        this.pelvicfinleft = new AdvancedModelRenderer(this);
        this.pelvicfinleft.setRotationPoint(1.5F, 2.777F, 2.646F);
        this.body2.addChild(pelvicfinleft);
        this.setRotateAngle(pelvicfinleft, 0.0873F, 0.0F, -0.6109F);
        this.pelvicfinleft.cubeList.add(new ModelBox(pelvicfinleft, 0, 11, 0.0F, 0.0F, -1.25F, 0, 3, 5, 0.0F, true));

        this.body3 = new AdvancedModelRenderer(this);
        this.body3.setRotationPoint(0.0F, 0.027F, 8.646F);
        this.body2.addChild(body3);
        this.body3.cubeList.add(new ModelBox(body3, 35, 31, -1.0F, -2.0F, -1.0F, 2, 2, 7, 0.0F, false));
        this.body3.cubeList.add(new ModelBox(body3, 30, 5, 0.0F, -3.5F, 0.0F, 0, 2, 6, 0.0F, false));
        this.body3.cubeList.add(new ModelBox(body3, 0, 0, 0.0F, -0.9F, 3.0F, 0, 2, 3, 0.0F, false));

        this.cube_r8 = new AdvancedModelRenderer(this);
        this.cube_r8.setRotationPoint(-1.0F, 4.15F, 0.8F);
        this.body3.addChild(cube_r8);
        this.setRotateAngle(cube_r8, 0.3927F, 0.0F, 0.0F);
        this.cube_r8.cubeList.add(new ModelBox(cube_r8, 0, 0, 1.0F, -3.0F, -1.0F, 0, 3, 5, 0.0F, false));

        this.cube_r9 = new AdvancedModelRenderer(this);
        this.cube_r9.setRotationPoint(0.0F, 1.55F, 0.55F);
        this.body3.addChild(cube_r9);
        this.setRotateAngle(cube_r9, 0.3927F, 0.0F, 0.0F);
        this.cube_r9.cubeList.add(new ModelBox(cube_r9, 26, 38, -1.0F, -2.0F, -1.0F, 2, 2, 5, -0.01F, false));

        this.body4 = new AdvancedModelRenderer(this);
        this.body4.setRotationPoint(0.0F, -1.25F, 6.0F);
        this.body3.addChild(body4);
        this.body4.cubeList.add(new ModelBox(body4, 0, 43, 0.0F, -2.4F, 0.0F, 0, 5, 9, 0.0F, false));
        this.body4.cubeList.add(new ModelBox(body4, 17, 38, -0.5F, -0.5F, 0.0F, 1, 1, 7, 0.0F, false));

        this.jaw = new AdvancedModelRenderer(this);
        this.jaw.setRotationPoint(0.0F, -5.4F, -8.75F);
        this.base.addChild(jaw);
        this.setRotateAngle(jaw, -0.3927F, 0.0F, 0.0F);
        this.jaw.cubeList.add(new ModelBox(jaw, 28, 45, -2.0F, 0.0F, -5.0F, 4, 1, 5, -0.01F, false));

        this.cube_r10 = new AdvancedModelRenderer(this);
        this.cube_r10.setRotationPoint(0.0F, 0.3F, -2.0F);
        this.jaw.addChild(cube_r10);
        this.setRotateAngle(cube_r10, -0.1745F, 0.0F, 0.0F);
        this.cube_r10.cubeList.add(new ModelBox(cube_r10, 28, 51, -2.0F, -2.0F, -1.0F, 4, 2, 4, -0.02F, false));

        updateDefaultPose();
        animator = ModelAnimator.create();
    }

    @Override
    public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        animate((IAnimatedEntity) entity, f, f1, f2, f3, f4, f5);
        this.base.render(f5);
    }
    public void renderStaticFloor(float f) {
        this.setRotateAngle(base, 0.1F, 0.0F, -0.2F);
        this.setRotateAngle(body, 0.1F, 0.2F, 0.0F);
        this.setRotateAngle(body2, 0.1F, -0.2F, 0.0F);
        this.setRotateAngle(body3, 0.1F, -0.3F, 0.0F);
        this.setRotateAngle(body4, 0.1F, -0.3F, 0.0F);
        this.setRotateAngle(jaw, 0.0F, 0.0F, 0.0F);
        this.base.offsetZ = -0.0F;
        this.base.offsetY = -0.2F;
        this.base.render(0.01F);
        this.resetToDefaultPose();
    }
    public void renderStaticWall(float f) {
        this.setRotateAngle(base, 0.0F, 1.6F, 0.0F);
        this.setRotateAngle(jaw, 0.0F, 0.0F, 0.0F);
        this.base.offsetZ = -0.11F;
        this.base.offsetY = -0.17F;
        this.base.offsetX = -0.04F;
        this.base.render(0.01F);
        this.resetToDefaultPose();
    }

    @Override
    public void renderStaticBook(float f) {
        //Rotations, positions and sizing:
        this.base.offsetY = -0.0F;
        this.base.offsetX = 0.2F;
        this.base.rotateAngleY = (float)Math.toRadians(130);
        this.base.rotateAngleX = (float)Math.toRadians(9);
        this.base.rotateAngleZ = (float)Math.toRadians(-2);
        this.base.scaleChildren = true;
        float scaler = 1.5F;
        this.base.setScale(scaler, scaler, scaler);
        //Start of pose:
        this.setRotateAngle(base, 0.1F, 3.5F, -0.2F);
        this.setRotateAngle(body, 0.1F, 0.2F, 0.0F);
        this.setRotateAngle(body2, 0.1F, -0.2F, 0.0F);
        this.setRotateAngle(body3, 0.1F, -0.3F, 0.0F);
        this.setRotateAngle(body4, 0.1F, -0.3F, 0.0F);
        this.setRotateAngle(jaw, 0.0F, 0.0F, 0.0F);
        //End of pose, now render the model:
        this.base.render(f);
        //Reset rotations, positions and sizing:
        this.base.setScale(1.0F, 1.0F, 1.0F);
        this.base.scaleChildren = false;
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

        //this.base.offsetY = 0.4F;

        AdvancedModelRenderer[] fishTail = {this.body2, this.body3, this.body4};
        ((EntityPrehistoricFloraMooreodontus)e).tailBuffer.applyChainSwingBuffer(fishTail);

        float speed = 0.18F;
        EntityPrehistoricFloraAgeableBase ee = (EntityPrehistoricFloraAgeableBase) e;
        if (ee.getIsFast()) {
            speed = speed * 3F;
        }
        float still = 1f;
        if (f3 == 0.0F) {
            still = 0.66F;
        }
        if (!e.isInWater()) {
            speed = 0.3F;
        }

        //this.tohead.rotateAngleY += f3 / (180F / (float) Math.PI);
        //this.tohead.rotateAngleX += f4 / (180F / (float) Math.PI);

        //if (f3 != 0.0F) {this.walk(Jaw, (float) (speed * 1.5), 0.2F, true, 0, 0, f2, 1);}
        if (e.isInWater()) {
            this.chainWave(fishTail, speed * still, 0.03F * still, -0.2, f2, 0.8F * still);
            this.chainSwing(fishTail, speed * still, 0.48F * still, -3, f2, 0.5F * still);

            this.swing(base, speed, 0.25F * still, true, 2, 0, f2, 0.5F);
        }
        else {
            this.swing(base, speed, 0.1F, true, 0, 0, f2, 0.5F);
        }
        this.flap(pectoralfinleft, (float) (speed * 0.65), 0.4F, false, 0.8F, 0, f2, 0.75F);
        this.swing(pectoralfinleft, (float) (speed * 0.65), 0.3F, true, 0, 0, f2, 0.75F);
        this.flap(pectoralfinright, (float) (speed * 0.65), -0.4F, false, 0.8F, 0, f2, 0.75F);
        this.swing(pectoralfinright, (float) (speed * 0.65), -0.3F, true, 0, 0, f2, 0.75F);

        this.flap(pelvicfinleft, (float) (speed * 0.65), 0.4F, false, 1.8F, 0, f2, 0.75F);
        this.swing(pelvicfinleft, (float) (speed * 0.65), 0.3F, true, 1, 0, f2, 0.75F);
        this.flap(pelvicfinright, (float) (speed * 0.65), -0.4F, false, 1.8F, 0, f2, 0.75F);
        this.swing(pelvicfinright, (float) (speed * 0.65), -0.3F, true, 1, 0, f2, 0.75F);

        if (!e.isInWater()) {
            this.base.rotateAngleZ = (float) Math.toRadians(90);
            this.base.offsetY = -0.2F;
            this.bob(base, -speed * 1.8F, 2.5F, false, f2, 1);
            this.chainWave(fishTail, speed * 1.5F, 0.2F, 0.2, f2, 0.8F * still);
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
        animator.rotate(this.jaw, (float) Math.toRadians(27.5), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.endKeyframe();
        animator.setStaticKeyframe(5);
        animator.resetKeyframe(2);

    }
}

