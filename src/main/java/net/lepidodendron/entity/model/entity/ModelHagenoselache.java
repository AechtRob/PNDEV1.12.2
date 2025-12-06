package net.lepidodendron.entity.model.entity;

import net.ilexiconn.llibrary.client.model.ModelAnimator;
import net.ilexiconn.llibrary.client.model.tools.AdvancedModelRenderer;
import net.ilexiconn.llibrary.server.animation.IAnimatedEntity;
import net.lepidodendron.entity.EntityPrehistoricFloraHagenoselache;
import net.lepidodendron.entity.base.EntityPrehistoricFloraAgeableBase;
import net.lepidodendron.entity.model.ModelBasePalaeopedia;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

public class ModelHagenoselache extends ModelBasePalaeopedia {
    private final AdvancedModelRenderer base;
    private final AdvancedModelRenderer cube_r1;
    private final AdvancedModelRenderer cube_r2;
    private final AdvancedModelRenderer cube_r3;
    private final AdvancedModelRenderer cube_r4;
    private final AdvancedModelRenderer pectoralfinright;
    private final AdvancedModelRenderer pectoralfinleft;
    private final AdvancedModelRenderer body;
    private final AdvancedModelRenderer body2;
    private final AdvancedModelRenderer cube_r5;
    private final AdvancedModelRenderer pelvicfinright;
    private final AdvancedModelRenderer pelvicfinleft;
    private final AdvancedModelRenderer body3;
    private final AdvancedModelRenderer cube_r6;
    private final AdvancedModelRenderer cube_r7;
    private final AdvancedModelRenderer body4;
    private final AdvancedModelRenderer cube_r8;
    private final AdvancedModelRenderer jaw;

    private ModelAnimator animator;

    public ModelHagenoselache() {
        this.textureWidth = 64;
        this.textureHeight = 64;

        this.base = new AdvancedModelRenderer(this);
        this.base.setRotationPoint(0.0F, 24.0F, -5.0F);
        this.base.cubeList.add(new ModelBox(base, 18, 6, -2.0F, -7.25F, -7.0F, 4, 3, 8, -0.01F, false));
        this.base.cubeList.add(new ModelBox(base, 34, 8, -1.5F, -6.25F, -11.1F, 3, 1, 5, 0.01F, false));
        this.base.cubeList.add(new ModelBox(base, 0, 0, -1.5F, -6.5F, -10.6F, 3, 1, 1, 0.02F, false));

        this.cube_r1 = new AdvancedModelRenderer(this);
        this.cube_r1.setRotationPoint(1.0F, -4.0F, -7.0F);
        this.base.addChild(cube_r1);
        this.setRotateAngle(cube_r1, -0.0873F, 0.0F, 0.0F);
        this.cube_r1.cubeList.add(new ModelBox(cube_r1, 0, 28, -3.0F, -1.0F, 0.0F, 4, 1, 8, -0.02F, false));

        this.cube_r2 = new AdvancedModelRenderer(this);
        this.cube_r2.setRotationPoint(0.0F, -7.65F, -2.75F);
        this.base.addChild(cube_r2);
        this.setRotateAngle(cube_r2, 0.7418F, 0.0F, 0.0F);
        this.cube_r2.cubeList.add(new ModelBox(cube_r2, 0, 0, 0.0F, 0.0F, 0.0F, 0, 1, 3, 0.0F, false));

        this.cube_r3 = new AdvancedModelRenderer(this);
        this.cube_r3.setRotationPoint(0.5F, -7.25F, -7.0F);
        this.base.addChild(cube_r3);
        this.setRotateAngle(cube_r3, 0.0873F, 0.0F, 0.0F);
        this.cube_r3.cubeList.add(new ModelBox(cube_r3, 24, 28, -2.0F, 0.0F, 0.0F, 3, 1, 8, 0.0F, false));

        this.cube_r4 = new AdvancedModelRenderer(this);
        this.cube_r4.setRotationPoint(0.5F, -6.6F, -11.25F);
        this.base.addChild(cube_r4);
        this.setRotateAngle(cube_r4, 0.1309F, 0.0F, 0.0F);
        this.cube_r4.cubeList.add(new ModelBox(cube_r4, 17, 0, -2.0F, 0.0F, 0.0F, 3, 1, 5, 0.0F, false));

        this.pectoralfinright = new AdvancedModelRenderer(this);
        this.pectoralfinright.setRotationPoint(-2.0F, -3.85F, -3.1F);
        this.base.addChild(pectoralfinright);
        this.setRotateAngle(pectoralfinright, -0.3054F, -0.3054F, 0.3054F);
        this.pectoralfinright.cubeList.add(new ModelBox(pectoralfinright, 30, 10, 0.0F, -1.75F, 0.0F, 0, 4, 7, 0.0F, false));

        this.pectoralfinleft = new AdvancedModelRenderer(this);
        this.pectoralfinleft.setRotationPoint(2.0F, -3.85F, -3.1F);
        this.base.addChild(pectoralfinleft);
        this.setRotateAngle(pectoralfinleft, -0.3054F, 0.3054F, -0.3054F);
        this.pectoralfinleft.cubeList.add(new ModelBox(pectoralfinleft, 30, 10, 0.0F, -1.75F, 0.0F, 0, 4, 7, 0.0F, true));

        this.body = new AdvancedModelRenderer(this);
        this.body.setRotationPoint(0.0F, -6.0F, 0.0F);
        this.base.addChild(body);
        this.body.cubeList.add(new ModelBox(body, 0, 0, -2.0F, -2.0F, 0.0F, 4, 5, 9, 0.0F, false));
        this.body.cubeList.add(new ModelBox(body, 0, 28, 0.0F, -3.75F, 0.0F, 0, 2, 9, 0.0F, false));

        this.body2 = new AdvancedModelRenderer(this);
        this.body2.setRotationPoint(0.0F, 0.05F, 9.0F);
        this.body.addChild(body2);
        this.body2.cubeList.add(new ModelBox(body2, 0, 14, -1.5F, -2.0F, -1.0F, 3, 4, 9, 0.0F, false));
        this.body2.cubeList.add(new ModelBox(body2, 0, 0, 0.0F, -3.8F, 0.0F, 0, 2, 4, 0.0F, false));

        this.cube_r5 = new AdvancedModelRenderer(this);
        this.cube_r5.setRotationPoint(0.5F, 2.0F, 8.0F);
        this.body2.addChild(cube_r5);
        this.setRotateAngle(cube_r5, 0.0873F, 0.0F, 0.0F);
        this.cube_r5.cubeList.add(new ModelBox(cube_r5, 15, 18, -2.0F, -1.0F, -9.0F, 3, 1, 9, -0.01F, false));

        this.pelvicfinright = new AdvancedModelRenderer(this);
        this.pelvicfinright.setRotationPoint(-0.75F, 2.0F, 1.5F);
        this.body2.addChild(pelvicfinright);
        this.setRotateAngle(pelvicfinright, 0.0F, 0.0F, 0.8727F);
        this.pelvicfinright.cubeList.add(new ModelBox(pelvicfinright, 16, 21, 0.0F, -0.5F, -1.0F, 0, 5, 7, 0.0F, false));

        this.pelvicfinleft = new AdvancedModelRenderer(this);
        this.pelvicfinleft.setRotationPoint(0.75F, 2.0F, 1.5F);
        this.body2.addChild(pelvicfinleft);
        this.setRotateAngle(pelvicfinleft, 0.0F, 0.0F, -0.8727F);
        this.pelvicfinleft.cubeList.add(new ModelBox(pelvicfinleft, 16, 21, 0.0F, -0.5F, -1.0F, 0, 5, 7, 0.0F, true));

        this.body3 = new AdvancedModelRenderer(this);
        this.body3.setRotationPoint(0.0F, -0.65F, 8.0F);
        this.body2.addChild(body3);
        this.body3.cubeList.add(new ModelBox(body3, 34, 0, -1.0F, -1.25F, -0.5F, 2, 3, 5, 0.0F, false));

        this.cube_r6 = new AdvancedModelRenderer(this);
        this.cube_r6.setRotationPoint(-1.0F, 2.5F, 3.35F);
        this.body3.addChild(cube_r6);
        this.setRotateAngle(cube_r6, 0.6545F, 0.0F, 0.0F);
        this.cube_r6.cubeList.add(new ModelBox(cube_r6, 4, 12, 1.0F, -1.0F, 0.0F, 0, 3, 2, 0.0F, false));

        this.cube_r7 = new AdvancedModelRenderer(this);
        this.cube_r7.setRotationPoint(-1.0F, -1.0F, 0.85F);
        this.body3.addChild(cube_r7);
        this.setRotateAngle(cube_r7, -0.2182F, 0.0F, 0.0F);
        this.cube_r7.cubeList.add(new ModelBox(cube_r7, 0, 3, 1.0F, -2.0F, -1.0F, 0, 2, 3, 0.0F, false));

        this.body4 = new AdvancedModelRenderer(this);
        this.body4.setRotationPoint(0.0F, 0.0F, 4.5F);
        this.body3.addChild(body4);
        this.body4.cubeList.add(new ModelBox(body4, 13, 37, -0.5F, -0.9F, -0.25F, 1, 2, 5, 0.0F, false));
        this.body4.cubeList.add(new ModelBox(body4, 30, 14, 0.0F, -3.4F, -0.25F, 0, 4, 7, 0.0F, false));

        this.cube_r8 = new AdvancedModelRenderer(this);
        this.cube_r8.setRotationPoint(-1.0F, 2.75F, 3.9F);
        this.body4.addChild(cube_r8);
        this.setRotateAngle(cube_r8, 0.9163F, 0.0F, 0.0F);
        this.cube_r8.cubeList.add(new ModelBox(cube_r8, 0, 12, 1.0F, -3.0F, 0.0F, 0, 5, 2, 0.0F, false));

        this.jaw = new AdvancedModelRenderer(this);
        this.jaw.setRotationPoint(0.0F, -5.25F, -7.0F);
        this.base.addChild(jaw);
        this.jaw.cubeList.add(new ModelBox(jaw, 20, 37, -1.5F, 0.0F, -3.35F, 3, 1, 4, 0.0F, false));
        this.jaw.cubeList.add(new ModelBox(jaw, 28, 0, -1.5F, -1.25F, -2.0F, 3, 2, 2, -0.01F, false));

        updateDefaultPose();
        animator = ModelAnimator.create();
    }

    @Override
    public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        animate((IAnimatedEntity) entity, f, f1, f2, f3, f4, f5);
        this.base.render(f5);
    }
    public void renderStaticFloor(float f) {
        this.setRotateAngle(base, -0.05F, 0.0F, 0.0F);
        this.setRotateAngle(body, 0.01F, 0.2F, 0.0F);
        this.setRotateAngle(body2, 0.01F, -0.2F, 0.0F);
        this.setRotateAngle(body3, 0.02F, -0.2F, 0.0F);
        this.setRotateAngle(body4, 0.03F, -0.2F, 0.0F);
        this.setRotateAngle(jaw, 0.0F, 0.0F, 0.0F);
        this.base.offsetX = -0.01F;
        this.base.offsetY = -0.2F;
        this.base.render(0.01F);
        this.resetToDefaultPose();
    }
    public void renderStaticWall(float f) {
        this.base.rotateAngleY = (float) Math.toRadians(90);
        this.setRotateAngle(jaw, 0.3F, 0.0F, 0.0F);
        this.base.offsetX = -0.075F;
        this.base.offsetZ = -0.12F;
        this.base.offsetY = -0.2F;
        this.base.render(0.01F);
        this.resetToDefaultPose();
    }

    @Override
    public void renderStaticBook(float f) {
        //Rotations, positions and sizing:
        this.base.offsetY = -0.20F;
        this.base.offsetX = 0.1F;
        this.base.rotateAngleY = (float)Math.toRadians(130);
        this.base.rotateAngleX = (float)Math.toRadians(9);
        this.base.rotateAngleZ = (float)Math.toRadians(-2);
        this.base.scaleChildren = true;
        float scaler = 1.4F;
        this.base.setScale(scaler, scaler, scaler);
        //Start of pose:
        this.setRotateAngle(base, 0.6F, 3.8F, -0.2F);
        this.setRotateAngle(body, 0.01F, 0.4F, 0.0F);
        this.setRotateAngle(body2, 0.01F, -0.7F, 0.0F);
        this.setRotateAngle(body3, 0.02F, -0.6F, 0.0F);
        this.setRotateAngle(body4, 0.03F, -0.6F, 0.0F);
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
        ((EntityPrehistoricFloraHagenoselache)e).tailBuffer.applyChainSwingBuffer(fishTail);

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
        animator.rotate(this.jaw, (float) Math.toRadians(22.5), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.endKeyframe();
        animator.setStaticKeyframe(5);
        animator.resetKeyframe(2);

    }
}

