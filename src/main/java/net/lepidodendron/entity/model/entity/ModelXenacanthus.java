package net.lepidodendron.entity.model.entity;

import net.ilexiconn.llibrary.client.model.ModelAnimator;
import net.ilexiconn.llibrary.client.model.tools.AdvancedModelRenderer;
import net.ilexiconn.llibrary.server.animation.IAnimatedEntity;
import net.lepidodendron.entity.EntityPrehistoricFloraXenacanthus;
import net.lepidodendron.entity.base.EntityPrehistoricFloraAgeableBase;
import net.lepidodendron.entity.model.ModelBasePalaeopedia;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

public class ModelXenacanthus extends ModelBasePalaeopedia {
    private final AdvancedModelRenderer base;
    private final AdvancedModelRenderer cube_r1;
    private final AdvancedModelRenderer cube_r2;
    private final AdvancedModelRenderer cube_r3;
    private final AdvancedModelRenderer cube_r4;
    private final AdvancedModelRenderer cube_r5;
    private final AdvancedModelRenderer pectoralfinright;
    private final AdvancedModelRenderer pectoralfinleft;
    private final AdvancedModelRenderer spine;
    private final AdvancedModelRenderer body;
    private final AdvancedModelRenderer cube_r6;
    private final AdvancedModelRenderer body2;
    private final AdvancedModelRenderer cube_r7;
    private final AdvancedModelRenderer pelvicfinright;
    private final AdvancedModelRenderer pelvicfinleft;
    private final AdvancedModelRenderer body3;
    private final AdvancedModelRenderer cube_r8;
    private final AdvancedModelRenderer cube_r9;
    private final AdvancedModelRenderer cube_r10;
    private final AdvancedModelRenderer body4;
    private final AdvancedModelRenderer body5;
    private final AdvancedModelRenderer jaw;
    private final AdvancedModelRenderer cube_r11;

    private ModelAnimator animator;

    public ModelXenacanthus() {
        this.textureWidth = 64;
        this.textureHeight = 64;

        this.base = new AdvancedModelRenderer(this);
        this.base.setRotationPoint(0.0F, 25.25F, -2.5F);
        this.base.cubeList.add(new ModelBox(base, 0, 32, -2.5F, -8.25F, -7.5F, 5, 5, 6, 0.0F, false));
        this.base.cubeList.add(new ModelBox(base, 47, 23, -2.0F, -6.5F, -9.75F, 4, 2, 3, 0.005F, false));
        this.base.cubeList.add(new ModelBox(base, 0, 0, -2.0F, -7.45F, -11.25F, 4, 1, 1, 0.03F, false));

        this.cube_r1 = new AdvancedModelRenderer(this);
        this.cube_r1.setRotationPoint(1.0F, -5.95F, -10.0F);
        this.base.addChild(cube_r1);
        this.setRotateAngle(cube_r1, 0.0873F, 0.0F, 0.0F);
        this.cube_r1.cubeList.add(new ModelBox(cube_r1, 18, 43, -3.0F, -2.0F, -1.0F, 4, 2, 4, 0.02F, false));

        this.cube_r2 = new AdvancedModelRenderer(this);
        this.cube_r2.setRotationPoint(1.0F, -6.125F, -10.775F);
        this.base.addChild(cube_r2);
        this.setRotateAngle(cube_r2, 0.3054F, 0.0F, 0.0F);
        this.cube_r2.cubeList.add(new ModelBox(cube_r2, 0, 2, -3.0F, -1.0F, -1.0F, 4, 1, 1, -0.02F, false));

        this.cube_r3 = new AdvancedModelRenderer(this);
        this.cube_r3.setRotationPoint(1.0F, -6.625F, -11.775F);
        this.base.addChild(cube_r3);
        this.setRotateAngle(cube_r3, 0.3054F, 0.0F, 0.0F);
        this.cube_r3.cubeList.add(new ModelBox(cube_r3, 34, 0, -3.0F, -1.0F, -1.0F, 4, 1, 2, -0.01F, false));

        this.cube_r4 = new AdvancedModelRenderer(this);
        this.cube_r4.setRotationPoint(0.0F, -6.0F, -7.35F);
        this.base.addChild(cube_r4);
        this.setRotateAngle(cube_r4, -0.4363F, 0.0F, 0.0F);
        this.cube_r4.cubeList.add(new ModelBox(cube_r4, 21, 0, -2.0F, 1.0F, -5.0F, 4, 1, 5, 0.0F, false));

        this.cube_r5 = new AdvancedModelRenderer(this);
        this.cube_r5.setRotationPoint(0.0F, -3.25F, -7.5F);
        this.base.addChild(cube_r5);
        this.setRotateAngle(cube_r5, -0.1702F, 0.0F, 0.0F);
        this.cube_r5.cubeList.add(new ModelBox(cube_r5, 38, 28, -2.0F, -1.0F, 0.0F, 4, 1, 6, 0.0F, false));

        this.pectoralfinright = new AdvancedModelRenderer(this);
        this.pectoralfinright.setRotationPoint(-2.3F, -3.25F, -3.5F);
        this.base.addChild(pectoralfinright);
        this.setRotateAngle(pectoralfinright, -0.48F, -0.5236F, 0.4363F);
        this.pectoralfinright.cubeList.add(new ModelBox(pectoralfinright, 0, 36, 0.0F, -3.0F, 0.0F, 0, 5, 7, 0.0F, false));

        this.pectoralfinleft = new AdvancedModelRenderer(this);
        this.pectoralfinleft.setRotationPoint(2.3F, -3.25F, -3.5F);
        this.base.addChild(pectoralfinleft);
        this.setRotateAngle(pectoralfinleft, -0.48F, 0.5236F, -0.4363F);
        this.pectoralfinleft.cubeList.add(new ModelBox(pectoralfinleft, 0, 36, 0.0F, -3.0F, 0.0F, 0, 5, 7, 0.0F, true));

        this.spine = new AdvancedModelRenderer(this);
        this.spine.setRotationPoint(0.0F, -8.25F, -6.0F);
        this.base.addChild(spine);
        this.setRotateAngle(spine, -1.0472F, 0.0F, 0.0F);
        this.spine.cubeList.add(new ModelBox(spine, 0, 16, 0.0F, -7.75F, -0.5F, 0, 9, 1, 0.0F, false));

        this.body = new AdvancedModelRenderer(this);
        this.body.setRotationPoint(0.0F, -5.25F, -1.5F);
        this.base.addChild(body);
        this.body.cubeList.add(new ModelBox(body, 0, 0, -2.5F, -3.0F, -1.0F, 5, 6, 11, 0.01F, false));
        this.body.cubeList.add(new ModelBox(body, 18, 8, 0.0F, -7.0F, 0.0F, 0, 4, 10, 0.0F, false));

        this.cube_r6 = new AdvancedModelRenderer(this);
        this.cube_r6.setRotationPoint(1.0F, 3.1F, 0.0F);
        this.body.addChild(cube_r6);
        this.setRotateAngle(cube_r6, -0.0436F, 0.0F, 0.0F);
        this.cube_r6.cubeList.add(new ModelBox(cube_r6, 21, 6, -3.0F, -1.0F, -1.0F, 4, 1, 11, 0.0F, false));

        this.body2 = new AdvancedModelRenderer(this);
        this.body2.setRotationPoint(0.0F, 0.1F, 10.0F);
        this.body.addChild(body2);
        this.body2.cubeList.add(new ModelBox(body2, 0, 17, -2.0F, -3.0F, -1.0F, 4, 5, 10, 0.0F, false));
        this.body2.cubeList.add(new ModelBox(body2, 16, 25, 0.0F, -6.85F, 0.0F, 0, 4, 9, 0.0F, false));

        this.cube_r7 = new AdvancedModelRenderer(this);
        this.cube_r7.setRotationPoint(0.5F, 3.25F, 0.0F);
        this.body2.addChild(cube_r7);
        this.setRotateAngle(cube_r7, 0.0873F, 0.0F, 0.0F);
        this.cube_r7.cubeList.add(new ModelBox(cube_r7, 18, 22, -2.0F, -2.0F, -1.0F, 3, 2, 10, 0.0F, false));

        this.pelvicfinright = new AdvancedModelRenderer(this);
        this.pelvicfinright.setRotationPoint(-1.5F, 2.0F, 1.0F);
        this.body2.addChild(pelvicfinright);
        this.setRotateAngle(pelvicfinright, 0.0F, -0.1309F, 0.7418F);
        this.pelvicfinright.cubeList.add(new ModelBox(pelvicfinright, 34, 14, 0.0F, 0.0F, -1.0F, 0, 4, 8, 0.0F, false));

        this.pelvicfinleft = new AdvancedModelRenderer(this);
        this.pelvicfinleft.setRotationPoint(1.5F, 2.0F, 1.0F);
        this.body2.addChild(pelvicfinleft);
        this.setRotateAngle(pelvicfinleft, 0.0F, 0.1309F, -0.7418F);
        this.pelvicfinleft.cubeList.add(new ModelBox(pelvicfinleft, 34, 14, 0.0F, 0.0F, -1.0F, 0, 4, 8, 0.0F, true));

        this.body3 = new AdvancedModelRenderer(this);
        this.body3.setRotationPoint(0.5F, -0.5F, 9.0F);
        this.body2.addChild(body3);
        this.body3.cubeList.add(new ModelBox(body3, 40, 0, -2.0F, -2.25F, -1.0F, 3, 4, 6, 0.0F, false));
        this.body3.cubeList.add(new ModelBox(body3, 0, 0, -0.51F, -6.1F, 0.0F, 0, 4, 5, 0.0F, false));

        this.cube_r8 = new AdvancedModelRenderer(this);
        this.cube_r8.setRotationPoint(-2.0F, 0.5F, 4.05F);
        this.body3.addChild(cube_r8);
        this.setRotateAngle(cube_r8, 1.1781F, 0.0F, 0.0F);
        this.cube_r8.cubeList.add(new ModelBox(cube_r8, 8, 16, 1.49F, -0.0711F, -1.6493F, 0, 3, 1, 0.0F, false));

        this.cube_r9 = new AdvancedModelRenderer(this);
        this.cube_r9.setRotationPoint(-2.0F, 1.5F, 1.75F);
        this.body3.addChild(cube_r9);
        this.setRotateAngle(cube_r9, 0.9599F, 0.0F, 0.0F);
        this.cube_r9.cubeList.add(new ModelBox(cube_r9, 2, 15, 1.5F, -1.0711F, -1.6493F, 0, 4, 2, 0.0F, false));

        this.cube_r10 = new AdvancedModelRenderer(this);
        this.cube_r10.setRotationPoint(-1.0F, -0.25F, 0.0F);
        this.body3.addChild(cube_r10);
        this.setRotateAngle(cube_r10, 0.2182F, 0.0F, 0.0F);
        this.cube_r10.cubeList.add(new ModelBox(cube_r10, 8, 43, -0.5F, 1.9289F, -1.6493F, 2, 1, 6, 0.0F, false));

        this.body4 = new AdvancedModelRenderer(this);
        this.body4.setRotationPoint(-0.5F, -0.5F, 5.0F);
        this.body3.addChild(body4);
        this.body4.cubeList.add(new ModelBox(body4, 31, 36, -1.0F, -1.5F, -1.0F, 2, 3, 7, 0.0F, false));
        this.body4.cubeList.add(new ModelBox(body4, 34, 20, 0.0F, -3.0F, 0.0F, 0, 2, 6, 0.0F, false));
        this.body4.cubeList.add(new ModelBox(body4, 34, 29, 0.0F, 1.3F, 0.0F, 0, 1, 6, 0.0F, false));

        this.body5 = new AdvancedModelRenderer(this);
        this.body5.setRotationPoint(0.0F, 0.0F, 6.0F);
        this.body4.addChild(body5);
        this.body5.cubeList.add(new ModelBox(body5, 43, 42, -0.5F, -1.0F, -1.0F, 1, 2, 6, 0.0F, false));
        this.body5.cubeList.add(new ModelBox(body5, 22, 30, 0.0F, -2.85F, 0.0F, 0, 5, 8, 0.0F, false));
        this.body5.cubeList.add(new ModelBox(body5, 4, 19, -0.5F, -0.5F, 4.75F, 1, 1, 2, -0.01F, false));

        this.jaw = new AdvancedModelRenderer(this);
        this.jaw.setRotationPoint(1.0F, -4.225F, -7.5F);
        this.base.addChild(jaw);
        this.setRotateAngle(jaw, -0.2182F, 0.0F, 0.0F);
        this.jaw.cubeList.add(new ModelBox(jaw, 40, 10, -3.0F, -1.0F, -5.5F, 4, 1, 6, -0.01F, false));

        this.cube_r11 = new AdvancedModelRenderer(this);
        this.cube_r11.setRotationPoint(0.0F, 0.125F, -4.425F);
        this.jaw.addChild(cube_r11);
        this.setRotateAngle(cube_r11, -0.1658F, 0.0F, 0.0F);
        this.cube_r11.cubeList.add(new ModelBox(cube_r11, 42, 35, -3.0F, -1.0F, -1.0F, 4, 1, 6, -0.02F, false));

        updateDefaultPose();
        animator = ModelAnimator.create();
    }

    @Override
    public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        animate((IAnimatedEntity) entity, f, f1, f2, f3, f4, f5);
        this.base.render(f5);
    }
    public void renderStaticWall(float f) {
        this.base.rotateAngleY = (float) Math.toRadians(90);
        this.setRotateAngle(jaw, 0.3F, 0.0F, 0.0F);
        this.base.offsetY = -0.2F;
        this.base.offsetX = -0.09F;
        this.base.offsetZ = -0.135F;
        this.base.render(0.01F);
        resetToDefaultPose();
    }

    public void renderStaticFloor(float f) {
        this.setRotateAngle(base, 0.0F, 0.0F, 0.0F);
        this.setRotateAngle(body, 0.0F, 0.2F, 0.0F);
        this.setRotateAngle(body2, 0.0F, 0.0F, 0.0F);
        this.setRotateAngle(body3, 0.0F, -0.2F, 0.0F);
        this.setRotateAngle(body4, 0.0F, -0.2F, 0.0F);
        this.setRotateAngle(body5, 0.0F, -0.2F, 0.0F);
        this.base.offsetZ = -0.03F;
        this.base.offsetY = -0.14F;
        this.base.offsetX = -0.012F;
        this.base.render(0.01F);
        resetToDefaultPose();
    }
    @Override
    public void renderStaticBook(float f) {
        //Rotations, positions and sizing:
        //Rotations, positions and sizing:
        this.base.offsetY = -0.65F;
        this.base.offsetX = 0.5F;
        this.base.rotateAngleX = (float)Math.toRadians(25);
        this.base.rotateAngleY = (float)Math.toRadians(240);
        this.base.rotateAngleZ = (float)Math.toRadians(-20);
        this.base.scaleChildren = true;
        float scaler = 0.9F;
        this.base.setScale(scaler, scaler, scaler);
        //Start of pose:

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

        AdvancedModelRenderer[] fishTail = {this.body2, this.body3, this.body4, this.body5};
        ((EntityPrehistoricFloraXenacanthus)e).tailBuffer.applyChainSwingBuffer(fishTail);

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

