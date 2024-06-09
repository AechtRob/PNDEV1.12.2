package net.lepidodendron.entity.model.entity;

import net.ilexiconn.llibrary.client.model.ModelAnimator;
import net.ilexiconn.llibrary.client.model.tools.AdvancedModelRenderer;
import net.ilexiconn.llibrary.server.animation.IAnimatedEntity;
import net.lepidodendron.entity.base.EntityPrehistoricFloraAgeableBase;
import net.lepidodendron.entity.model.ModelBasePalaeopedia;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

public class ModelNotidanoides extends ModelBasePalaeopedia {
    private final AdvancedModelRenderer body;
    private final AdvancedModelRenderer pectoralfinR;
    private final AdvancedModelRenderer pectoralfinL;
    private final AdvancedModelRenderer body0;
    private final AdvancedModelRenderer cube_r1;
    private final AdvancedModelRenderer cube_r2;
    private final AdvancedModelRenderer cube_r3;
    private final AdvancedModelRenderer head;
    private final AdvancedModelRenderer cube_r4;
    private final AdvancedModelRenderer cube_r5;
    private final AdvancedModelRenderer cube_r6;
    private final AdvancedModelRenderer lowerjaw;
    private final AdvancedModelRenderer cube_r7;
    private final AdvancedModelRenderer body2;
    private final AdvancedModelRenderer body3;
    private final AdvancedModelRenderer pelvicfinR;
    private final AdvancedModelRenderer pelvicfinL;
    private final AdvancedModelRenderer body4;
    private final AdvancedModelRenderer cube_r8;
    private final AdvancedModelRenderer body5;
    private final AdvancedModelRenderer tail;

    private ModelAnimator animator;

    public ModelNotidanoides() {
        this.textureWidth = 64;
        this.textureHeight = 64;

        this.body = new AdvancedModelRenderer(this);
        this.body.setRotationPoint(0.0F, 27.0F, 8.0F);
        this.body.cubeList.add(new ModelBox(body, 23, 17, -3.0F, -9.0F, -7.0F, 6, 6, 13, 0.0F, false));

        this.pectoralfinR = new AdvancedModelRenderer(this);
        this.pectoralfinR.setRotationPoint(-3.0F, -3.0F, -6.0F);
        this.body.addChild(pectoralfinR);
        this.setRotateAngle(pectoralfinR, 0.0F, 0.0F, 1.2217F);
        this.pectoralfinR.cubeList.add(new ModelBox(pectoralfinR, 0, 0, 0.0F, 0.0F, -1.0F, 0, 4, 5, 0.0F, false));

        this.pectoralfinL = new AdvancedModelRenderer(this);
        this.pectoralfinL.setRotationPoint(3.0F, -3.0F, -6.0F);
        this.body.addChild(pectoralfinL);
        this.setRotateAngle(pectoralfinL, 0.0F, 0.0F, -1.2217F);
        this.pectoralfinL.cubeList.add(new ModelBox(pectoralfinL, 0, 0, 0.0F, 0.0F, -1.0F, 0, 4, 5, 0.0F, true));

        this.body0 = new AdvancedModelRenderer(this);
        this.body0.setRotationPoint(0.0F, -6.0F, -7.0F);
        this.body.addChild(body0);
        this.body0.cubeList.add(new ModelBox(body0, 31, 36, -2.5F, -2.9F, -3.0F, 5, 5, 4, 0.01F, false));

        this.cube_r1 = new AdvancedModelRenderer(this);
        this.cube_r1.setRotationPoint(0.0F, 3.0F, 0.0F);
        this.body0.addChild(cube_r1);
        this.setRotateAngle(cube_r1, -0.0436F, 0.0F, 0.0F);
        this.cube_r1.cubeList.add(new ModelBox(cube_r1, 12, 45, -2.0F, -1.15F, -3.0F, 4, 1, 4, 0.0F, false));

        this.cube_r2 = new AdvancedModelRenderer(this);
        this.cube_r2.setRotationPoint(3.0F, 0.0F, -3.0F);
        this.body0.addChild(cube_r2);
        this.setRotateAngle(cube_r2, 0.0F, 0.0873F, 0.0F);
        this.cube_r2.cubeList.add(new ModelBox(cube_r2, 44, 45, -1.45F, -2.15F, 0.0F, 1, 4, 3, 0.01F, true));

        this.cube_r3 = new AdvancedModelRenderer(this);
        this.cube_r3.setRotationPoint(-3.0F, 0.0F, -3.0F);
        this.body0.addChild(cube_r3);
        this.setRotateAngle(cube_r3, 0.0F, -0.0873F, 0.0F);
        this.cube_r3.cubeList.add(new ModelBox(cube_r3, 44, 45, 0.45F, -2.15F, 0.0F, 1, 4, 3, 0.01F, false));

        this.head = new AdvancedModelRenderer(this);
        this.head.setRotationPoint(0.0F, 0.0F, -3.0F);
        this.body0.addChild(head);
        this.head.cubeList.add(new ModelBox(head, 36, 0, -2.5F, -2.4F, -3.0F, 5, 4, 4, 0.0F, false));
        this.head.cubeList.add(new ModelBox(head, 28, 45, -2.5F, -1.9F, -6.0F, 5, 2, 3, 0.0F, false));
        this.head.cubeList.add(new ModelBox(head, 0, 0, -1.5F, -0.4F, -5.85F, 3, 1, 0, 0.0F, false));
        this.head.cubeList.add(new ModelBox(head, 0, 0, -1.85F, -0.4F, -5.75F, 0, 1, 3, 0.0F, false));
        this.head.cubeList.add(new ModelBox(head, 0, 0, 1.85F, -0.4F, -5.75F, 0, 1, 3, 0.0F, true));

        this.cube_r4 = new AdvancedModelRenderer(this);
        this.cube_r4.setRotationPoint(0.0F, -3.0F, 0.0F);
        this.head.addChild(cube_r4);
        this.setRotateAngle(cube_r4, -0.3054F, 0.0F, 0.0F);
        this.cube_r4.cubeList.add(new ModelBox(cube_r4, 47, 8, -2.0F, 3.15F, -6.4F, 4, 1, 2, -0.01F, false));

        this.cube_r5 = new AdvancedModelRenderer(this);
        this.cube_r5.setRotationPoint(0.0F, -3.0F, 0.0F);
        this.head.addChild(cube_r5);
        this.setRotateAngle(cube_r5, 0.0873F, 0.0F, 0.0F);
        this.cube_r5.cubeList.add(new ModelBox(cube_r5, 20, 0, -2.0F, 0.2F, -7.5F, 4, 1, 8, 0.0F, false));

        this.cube_r6 = new AdvancedModelRenderer(this);
        this.cube_r6.setRotationPoint(0.0F, 1.0F, -6.0F);
        this.head.addChild(cube_r6);
        this.setRotateAngle(cube_r6, -0.2356F, 0.0F, 0.0F);
        this.cube_r6.cubeList.add(new ModelBox(cube_r6, 0, 47, -2.0F, -0.85F, 4.25F, 4, 1, 2, -0.01F, false));

        this.lowerjaw = new AdvancedModelRenderer(this);
        this.lowerjaw.setRotationPoint(0.0F, 0.0F, -1.0F);
        this.head.addChild(lowerjaw);
        this.lowerjaw.cubeList.add(new ModelBox(lowerjaw, 32, 50, -2.0F, 0.1F, -5.0F, 4, 1, 4, 0.0F, false));
        this.lowerjaw.cubeList.add(new ModelBox(lowerjaw, 0, 1, -1.75F, -0.4F, -4.75F, 0, 1, 3, 0.0F, false));
        this.lowerjaw.cubeList.add(new ModelBox(lowerjaw, 0, 1, 1.75F, -0.4F, -4.75F, 0, 1, 3, 0.0F, true));
        this.lowerjaw.cubeList.add(new ModelBox(lowerjaw, 0, 1, -1.5F, -0.4F, -4.75F, 3, 1, 0, 0.0F, false));

        this.cube_r7 = new AdvancedModelRenderer(this);
        this.cube_r7.setRotationPoint(0.0F, 1.0F, -5.0F);
        this.lowerjaw.addChild(cube_r7);
        this.setRotateAngle(cube_r7, -0.2356F, 0.0F, 0.0F);
        this.cube_r7.cubeList.add(new ModelBox(cube_r7, 23, 9, -1.5F, -0.9F, 0.025F, 3, 1, 7, 0.0F, false));

        this.body2 = new AdvancedModelRenderer(this);
        this.body2.setRotationPoint(0.0F, -6.0F, 6.0F);
        this.body.addChild(body2);
        this.body2.cubeList.add(new ModelBox(body2, 0, 0, -2.5F, -2.6F, -0.75F, 5, 5, 10, 0.0F, false));

        this.body3 = new AdvancedModelRenderer(this);
        this.body3.setRotationPoint(0.0F, -0.25F, 9.25F);
        this.body2.addChild(body3);
        this.body3.cubeList.add(new ModelBox(body3, 0, 30, -2.0F, -2.0F, -1.0F, 4, 4, 6, 0.0F, false));
        this.body3.cubeList.add(new ModelBox(body3, 6, 0, 0.0F, -5.0F, 3.0F, 0, 3, 2, 0.0F, false));

        this.pelvicfinR = new AdvancedModelRenderer(this);
        this.pelvicfinR.setRotationPoint(-1.5F, 2.0F, 0.75F);
        this.body3.addChild(pelvicfinR);
        this.setRotateAngle(pelvicfinR, 0.1745F, 0.1309F, 1.0472F);
        this.pelvicfinR.cubeList.add(new ModelBox(pelvicfinR, 0, 9, 0.0F, 0.0F, -0.75F, 0, 3, 6, 0.0F, false));

        this.pelvicfinL = new AdvancedModelRenderer(this);
        this.pelvicfinL.setRotationPoint(1.5F, 2.0F, 0.75F);
        this.body3.addChild(pelvicfinL);
        this.setRotateAngle(pelvicfinL, 0.1745F, -0.1309F, -1.0472F);
        this.pelvicfinL.cubeList.add(new ModelBox(pelvicfinL, 0, 9, 0.0F, 0.0F, -0.75F, 0, 3, 6, 0.0F, true));

        this.body4 = new AdvancedModelRenderer(this);
        this.body4.setRotationPoint(0.0F, -0.5F, 5.0F);
        this.body3.addChild(body4);
        this.body4.cubeList.add(new ModelBox(body4, 20, 0, 0.0F, -4.5F, 0.0F, 0, 4, 4, 0.0F, false));
        this.body4.cubeList.add(new ModelBox(body4, 0, 40, -1.5F, -1.0F, -0.75F, 3, 2, 5, 0.0F, false));
        this.body4.cubeList.add(new ModelBox(body4, 12, 10, 0.0F, 1.0F, 1.5F, 0, 3, 5, 0.0F, false));

        this.cube_r8 = new AdvancedModelRenderer(this);
        this.cube_r8.setRotationPoint(0.0F, 1.0F, 4.25F);
        this.body4.addChild(cube_r8);
        this.setRotateAngle(cube_r8, 0.3054F, 0.0F, 0.0F);
        this.cube_r8.cubeList.add(new ModelBox(cube_r8, 36, 9, -1.5F, -2.0F, -5.0F, 3, 2, 5, -0.01F, false));

        this.body5 = new AdvancedModelRenderer(this);
        this.body5.setRotationPoint(0.0F, 0.0F, 4.25F);
        this.body4.addChild(body5);
        this.body5.cubeList.add(new ModelBox(body5, 13, 36, -1.0F, -0.9F, -1.0F, 2, 2, 7, 0.0F, false));

        this.tail = new AdvancedModelRenderer(this);
        this.tail.setRotationPoint(0.0F, 0.0F, 5.5F);
        this.body5.addChild(tail);
        this.tail.cubeList.add(new ModelBox(tail, 0, 0, 0.0F, -7.25F, -0.25F, 0, 12, 18, 0.0F, false));

        updateDefaultPose();
        animator = ModelAnimator.create();
    }

    @Override
    public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        animate((IAnimatedEntity) entity, f, f1, f2, f3, f4, f5);
        this.body.render(f5);
    }
    public void renderStaticWall(float f) {
        this.body.rotateAngleY  = (float) Math.toRadians(90);
        this.body4.rotateAngleX = (float) Math.toRadians(7.5);
        this.body5.rotateAngleX = (float) Math.toRadians(10);
        this.lowerjaw.rotateAngleX = (float) Math.toRadians(25);
        this.body.offsetX = -0.06F;
        this.body.offsetY = -0.21F;
        this.body.render(0.01F);
        resetToDefaultPose();
    }

    public void renderStaticFloor(float f) {
        this.body.rotateAngleY  = (float) Math.toRadians(90);
        this.setRotateAngle(pectoralfinR, 0.0F, 0.0F, 1.2217F);
        this.setRotateAngle(pectoralfinL, 0.0F, 0.0F, -1.2217F);
        this.setRotateAngle(body0, 0.0F, -0.1309F, 0.0F);
        this.setRotateAngle(cube_r1, -0.0436F, 0.0F, 0.0F);
        this.setRotateAngle(cube_r2, 0.0F, 0.0873F, 0.0F);
        this.setRotateAngle(cube_r3, 0.0F, -0.0873F, 0.0F);
        this.setRotateAngle(cube_r4, -0.3054F, 0.0F, 0.0F);
        this.setRotateAngle(cube_r5, 0.0873F, 0.0F, 0.0F);
        this.setRotateAngle(cube_r6, -0.2356F, 0.0F, 0.0F);
        this.setRotateAngle(lowerjaw, 0.0873F, 0.0F, 0.0F);
        this.setRotateAngle(cube_r7, -0.2356F, 0.0F, 0.0F);
        this.setRotateAngle(body2, 0.0F, 0.2182F, 0.0F);
        this.setRotateAngle(body3, 0.0F, 0.2618F, 0.0F);
        this.setRotateAngle(pelvicfinR, 0.1745F, 0.1309F, 1.0472F);
        this.setRotateAngle(pelvicfinL, 0.1745F, -0.1309F, -1.0472F);
        this.setRotateAngle(body4, 0.0F, -0.2618F, 0.0F);
        this.setRotateAngle(cube_r8, 0.3054F, 0.0F, 0.0F);
        this.setRotateAngle(body5, 0.0F, -0.4363F, 0.0F);
        this.setRotateAngle(tail, 0.0F, -0.4363F, 0.0F);
        this.body.offsetX = -0.04F;
        this.body.offsetZ = -0.08F;
        this.body.offsetY = -0.28F;
        this.body.render(0.01F);
        resetToDefaultPose();
    }
    public void renderStaticSuspended(float f) {
        this.body.rotateAngleY  = (float) Math.toRadians(90);
        this.setRotateAngle(pectoralfinR, 0.0F, 0.0F, 1.2217F);
        this.setRotateAngle(pectoralfinL, 0.0F, 0.0F, -1.2217F);
        this.setRotateAngle(body0, 0.0F, -0.1309F, 0.0F);
        this.setRotateAngle(cube_r1, -0.0436F, 0.0F, 0.0F);
        this.setRotateAngle(cube_r2, 0.0F, 0.0873F, 0.0F);
        this.setRotateAngle(cube_r3, 0.0F, -0.0873F, 0.0F);
        this.setRotateAngle(cube_r4, -0.3054F, 0.0F, 0.0F);
        this.setRotateAngle(cube_r5, 0.0873F, 0.0F, 0.0F);
        this.setRotateAngle(cube_r6, -0.2356F, 0.0F, 0.0F);
        this.setRotateAngle(lowerjaw, 0.0873F, 0.0F, 0.0F);
        this.setRotateAngle(cube_r7, -0.2356F, 0.0F, 0.0F);
        this.setRotateAngle(body2, 0.0F, 0.2182F, 0.0F);
        this.setRotateAngle(body3, 0.0F, 0.2618F, 0.0F);
        this.setRotateAngle(pelvicfinR, 0.1745F, 0.1309F, 1.0472F);
        this.setRotateAngle(pelvicfinL, 0.1745F, -0.1309F, -1.0472F);
        this.setRotateAngle(body4, 0.0F, -0.2618F, 0.0F);
        this.setRotateAngle(cube_r8, 0.3054F, 0.0F, 0.0F);
        this.setRotateAngle(body5, 0.0F, -0.4363F, 0.0F);
        this.setRotateAngle(tail, 0.0F, -0.4363F, 0.0F);
        this.body.offsetX = -0.04F;
        this.body.offsetZ = -0.08F;
        this.body.offsetY = -0.05F;
        this.body.render(0.01F);
        resetToDefaultPose();
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

        //this.body.offsetY = 0.7F;

        AdvancedModelRenderer[] fishTail = {this.body2, this.body3, this.body4, this.body5, this.tail};

        float speed = 0.18F;
        EntityPrehistoricFloraAgeableBase ee = (EntityPrehistoricFloraAgeableBase) e;
        if (ee.getIsFast()) {
            speed = speed * 3F;
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
            this.chainSwing(fishTail, speed * still, 0.35F * still, -0.85, f2, 0.6F * still);
            this.swing(body, speed * still, 0.12F, true, 0, 0, f2, 0.8F);
        }
        else {
            this.swing(body, speed, 0.1F, true, 0, 0, f2, 0.5F);
        }
        this.flap(pectoralfinL, (float) (speed * 0.65), 0.4F, false, 0.8F, 0, f2, 0.5F);
        this.swing(pectoralfinL, (float) (speed * 0.65), 0.1F, true, 0, 0, f2, 0.5F);
        this.flap(pectoralfinR, (float) (speed * 0.65), -0.4F, false, 0.8F, 0, f2, 0.5F);
        this.swing(pectoralfinR, (float) (speed * 0.65), -0.1F, true, 0, 0, f2, 0.5F);

        this.flap(pelvicfinL, (float) (speed * 0.65), 0.2F, false, 1.8F, 0, f2, 0.5F);
        this.swing(pelvicfinL, (float) (speed * 0.65), 0.1F, true, 1, 0, f2, 0.5F);
        this.flap(pelvicfinR, (float) (speed * 0.65), -0.2F, false, 1.8F, 0, f2, 0.5F);
        this.swing(pelvicfinR, (float) (speed * 0.65), -0.1F, true, 1, 0, f2, 0.5F);

        if (!e.isInWater()) {
            this.body.rotateAngleZ = (float) Math.toRadians(90);
            this.body.offsetY = -0.35F;
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
        animator.move(this.head, 0,0,-0.2F);
        animator.rotate(this.head, (float) Math.toRadians(-15), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(this.lowerjaw, (float) Math.toRadians(40), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.endKeyframe();
        animator.setStaticKeyframe(5);
        animator.resetKeyframe(2);

    }
}

