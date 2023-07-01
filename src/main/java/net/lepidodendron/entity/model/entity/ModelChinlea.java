package net.lepidodendron.entity.model.entity;

import net.ilexiconn.llibrary.client.model.ModelAnimator;
import net.ilexiconn.llibrary.client.model.tools.AdvancedModelBase;
import net.ilexiconn.llibrary.client.model.tools.AdvancedModelRenderer;
import net.ilexiconn.llibrary.server.animation.IAnimatedEntity;
import net.lepidodendron.entity.base.EntityPrehistoricFloraAgeableBase;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

public class ModelChinlea extends AdvancedModelBase {
    private final AdvancedModelRenderer head;
    private final AdvancedModelRenderer cube_r1;
    private final AdvancedModelRenderer cube_r2;
    private final AdvancedModelRenderer cube_r3;
    private final AdvancedModelRenderer cube_r4;
    private final AdvancedModelRenderer cube_r5;
    private final AdvancedModelRenderer lowerjaw;
    private final AdvancedModelRenderer cube_r6;
    private final AdvancedModelRenderer cube_r7;
    private final AdvancedModelRenderer gillL;
    private final AdvancedModelRenderer gillR;
    private final AdvancedModelRenderer body;
    private final AdvancedModelRenderer body2;
    private final AdvancedModelRenderer cube_r8;
    private final AdvancedModelRenderer body3;
    private final AdvancedModelRenderer cube_r9;
    private final AdvancedModelRenderer body4;
    private final AdvancedModelRenderer body5;
    private final AdvancedModelRenderer body6;
    private final AdvancedModelRenderer pelvicfinL;
    private final AdvancedModelRenderer cube_r10;
    private final AdvancedModelRenderer pelvicfinR;
    private final AdvancedModelRenderer cube_r11;
    private final AdvancedModelRenderer pectoralfinL;
    private final AdvancedModelRenderer pectoralfinR;

    private ModelAnimator animator;

    public ModelChinlea() {
        this.textureWidth = 128;
        this.textureHeight = 128;

        this.head = new AdvancedModelRenderer(this);
        this.head.setRotationPoint(0.0F, 24.0F, 0.0F);
        this.head.cubeList.add(new ModelBox(head, 48, 0, -3.0F, -5.15F, -23.23F, 6, 4, 1, -0.01F, false));
        this.head.cubeList.add(new ModelBox(head, 0, 45, -3.0F, -10.15F, -22.25F, 6, 9, 6, -0.01F, false));

        this.cube_r1 = new AdvancedModelRenderer(this);
        this.cube_r1.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.head.addChild(cube_r1);
        this.setRotateAngle(cube_r1, 0.3491F, 0.0F, 0.0F);
        this.cube_r1.cubeList.add(new ModelBox(cube_r1, 0, 1, 3.01F, -15.55F, -25.0F, 0, 1, 1, 0.0F, false));
        this.cube_r1.cubeList.add(new ModelBox(cube_r1, 2, 1, -3.01F, -15.55F, -25.0F, 0, 1, 1, 0.0F, false));
        this.cube_r1.cubeList.add(new ModelBox(cube_r1, 28, 0, -3.0F, -17.05F, -25.5F, 6, 5, 8, 0.0F, false));

        this.cube_r2 = new AdvancedModelRenderer(this);
        this.cube_r2.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.head.addChild(cube_r2);
        this.setRotateAngle(cube_r2, -0.3491F, 0.0F, 0.0F);
        this.cube_r2.cubeList.add(new ModelBox(cube_r2, 0, 0, -1.675F, 5.4F, -31.75F, 0, 1, 3, 0.0F, false));
        this.cube_r2.cubeList.add(new ModelBox(cube_r2, 0, 1, 1.675F, 5.4F, -31.75F, 0, 1, 3, 0.0F, false));
        this.cube_r2.cubeList.add(new ModelBox(cube_r2, 60, 48, -2.0F, 4.9F, -31.25F, 4, 1, 3, 0.02F, false));

        this.cube_r3 = new AdvancedModelRenderer(this);
        this.cube_r3.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.head.addChild(cube_r3);
        this.setRotateAngle(cube_r3, 0.2182F, 0.0F, 0.0F);
        this.cube_r3.cubeList.add(new ModelBox(cube_r3, 0, 0, -1.5F, -12.0F, -32.5F, 3, 1, 0, 0.0F, false));
        this.cube_r3.cubeList.add(new ModelBox(cube_r3, 0, 2, -1.65F, -12.0F, -31.75F, 0, 1, 3, 0.0F, false));
        this.cube_r3.cubeList.add(new ModelBox(cube_r3, 8, 0, 1.65F, -12.0F, -31.75F, 0, 1, 3, 0.0F, false));
        this.cube_r3.cubeList.add(new ModelBox(cube_r3, 30, 57, -2.0F, -13.5F, -32.75F, 4, 2, 6, 0.0F, false));

        this.cube_r4 = new AdvancedModelRenderer(this);
        this.cube_r4.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.head.addChild(cube_r4);
        this.setRotateAngle(cube_r4, -0.2182F, 0.0F, 0.0F);
        this.cube_r4.cubeList.add(new ModelBox(cube_r4, 0, 89, -2.5F, 0.55F, -27.95F, 5, 4, 1, 0.0F, false));
        this.cube_r4.cubeList.add(new ModelBox(cube_r4, 50, 59, -2.5F, 0.55F, -26.95F, 5, 4, 4, 0.0F, false));

        this.cube_r5 = new AdvancedModelRenderer(this);
        this.cube_r5.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.head.addChild(cube_r5);
        this.setRotateAngle(cube_r5, -0.0873F, 0.0F, 0.0F);
        this.cube_r5.cubeList.add(new ModelBox(cube_r5, 52, 29, -2.5F, -0.4F, -23.4F, 5, 2, 7, 0.01F, false));

        this.lowerjaw = new AdvancedModelRenderer(this);
        this.lowerjaw.setRotationPoint(0.0F, -4.0F, -26.75F);
        this.head.addChild(lowerjaw);
        this.setRotateAngle(lowerjaw, -0.0436F, 0.0F, 0.0F);


        this.cube_r6 = new AdvancedModelRenderer(this);
        this.cube_r6.setRotationPoint(0.0F, 4.0F, 26.75F);
        this.lowerjaw.addChild(cube_r6);
        this.setRotateAngle(cube_r6, -0.0611F, 0.0F, 0.0F);
        this.cube_r6.cubeList.add(new ModelBox(cube_r6, 0, 28, -1.4F, -2.75F, -33.4F, 0, 1, 4, 0.0F, false));
        this.cube_r6.cubeList.add(new ModelBox(cube_r6, 28, 0, 1.4F, -2.75F, -33.4F, 0, 1, 4, 0.0F, false));
        this.cube_r6.cubeList.add(new ModelBox(cube_r6, 0, 1, -1.5F, -2.75F, -34.15F, 3, 1, 0, 0.0F, false));
        this.cube_r6.cubeList.add(new ModelBox(cube_r6, 54, 40, -1.5F, -2.25F, -34.25F, 3, 1, 7, 0.0F, false));

        this.cube_r7 = new AdvancedModelRenderer(this);
        this.cube_r7.setRotationPoint(0.0F, 4.0F, 26.75F);
        this.lowerjaw.addChild(cube_r7);
        this.setRotateAngle(cube_r7, -0.2793F, 0.0F, 0.0F);
        this.cube_r7.cubeList.add(new ModelBox(cube_r7, 62, 8, -1.0F, 4.25F, -29.5F, 2, 1, 4, 0.0F, false));
        this.cube_r7.cubeList.add(new ModelBox(cube_r7, 1, 61, -1.0F, 5.25F, -33.3F, 2, 1, 6, 0.0F, false));

        this.gillL = new AdvancedModelRenderer(this);
        this.gillL.setRotationPoint(3.0F, -5.0F, -23.0F);
        this.head.addChild(gillL);
        this.setRotateAngle(gillL, 0.0F, 0.0873F, 0.0F);
        this.gillL.cubeList.add(new ModelBox(gillL, 54, 7, -1.0F, -3.85F, 0.0F, 1, 8, 6, 0.0F, false));

        this.gillR = new AdvancedModelRenderer(this);
        this.gillR.setRotationPoint(-3.0F, -5.0F, -23.0F);
        this.head.addChild(gillR);
        this.setRotateAngle(gillR, 0.0F, -0.0873F, 0.0F);
        this.gillR.cubeList.add(new ModelBox(gillR, 0, 0, 0.0F, -3.85F, 0.0F, 1, 8, 6, 0.0F, false));

        this.body = new AdvancedModelRenderer(this);
        this.body.setRotationPoint(0.0F, -6.0F, -17.5F);
        this.head.addChild(body);
        this.body.cubeList.add(new ModelBox(body, 0, 0, -3.5F, -4.75F, 0.5F, 7, 11, 14, 0.0F, false));
        this.body.cubeList.add(new ModelBox(body, 23, 14, 0.0F, -12.2F, 4.5F, 0, 8, 11, 0.0F, false));

        this.body2 = new AdvancedModelRenderer(this);
        this.body2.setRotationPoint(0.0F, 0.0F, 14.5F);
        this.body.addChild(body2);
        this.body2.cubeList.add(new ModelBox(body2, 0, 25, -3.0F, -4.0F, -1.0F, 6, 9, 11, 0.0F, false));

        this.cube_r8 = new AdvancedModelRenderer(this);
        this.cube_r8.setRotationPoint(0.0F, 6.0F, 3.0F);
        this.body2.addChild(cube_r8);
        this.setRotateAngle(cube_r8, -0.6109F, 0.0F, 0.0F);
        this.cube_r8.cubeList.add(new ModelBox(cube_r8, 0, 21, 0.0F, -17.35F, -2.15F, 0, 7, 4, 0.0F, false));

        this.body3 = new AdvancedModelRenderer(this);
        this.body3.setRotationPoint(0.0F, 0.0F, 10.0F);
        this.body2.addChild(body3);
        this.body3.cubeList.add(new ModelBox(body3, 34, 33, -2.5F, -2.5F, -1.0F, 5, 6, 8, 0.0F, false));

        this.cube_r9 = new AdvancedModelRenderer(this);
        this.cube_r9.setRotationPoint(0.0F, 6.0F, -7.0F);
        this.body3.addChild(cube_r9);
        this.setRotateAngle(cube_r9, -2.618F, 0.0F, 0.0F);
        this.cube_r9.cubeList.add(new ModelBox(cube_r9, 34, 29, 0.0F, -7.5F, -10.65F, 0, 6, 4, 0.0F, false));

        this.body4 = new AdvancedModelRenderer(this);
        this.body4.setRotationPoint(0.0F, 0.5F, 7.0F);
        this.body3.addChild(body4);
        this.body4.cubeList.add(new ModelBox(body4, 47, 48, -1.5F, -1.75F, -1.0F, 3, 4, 7, 0.0F, false));
        this.body4.cubeList.add(new ModelBox(body4, 24, 41, 0.0F, -7.5F, 0.0F, 0, 16, 6, 0.0F, false));

        this.body5 = new AdvancedModelRenderer(this);
        this.body5.setRotationPoint(0.0F, 0.0F, 6.0F);
        this.body4.addChild(body5);
        this.body5.cubeList.add(new ModelBox(body5, 24, 60, 0.0F, -7.5F, 0.0F, 0, 16, 3, 0.0F, false));
        this.body5.cubeList.add(new ModelBox(body5, 42, 13, -1.0F, -1.25F, 0.0F, 2, 3, 3, 0.0F, false));

        this.body6 = new AdvancedModelRenderer(this);
        this.body6.setRotationPoint(0.0F, 0.0F, 3.0F);
        this.body5.addChild(body6);
        this.body6.cubeList.add(new ModelBox(body6, 18, 57, 0.0F, -7.5F, 0.0F, 0, 16, 3, 0.0F, false));
        this.body6.cubeList.add(new ModelBox(body6, 36, 43, 0.0F, -1.75F, 5.25F, 0, 4, 8, 0.0F, false));
        this.body6.cubeList.add(new ModelBox(body6, 42, 13, -0.5F, -0.75F, 0.0F, 1, 2, 10, 0.0F, false));
        this.body6.cubeList.add(new ModelBox(body6, 0, 82, 0.0F, -1.25F, 4.25F, 0, 3, 1, 0.0F, false));

        this.pelvicfinL = new AdvancedModelRenderer(this);
        this.pelvicfinL.setRotationPoint(2.0F, 5.0F, 2.0F);
        this.body2.addChild(pelvicfinL);
        this.setRotateAngle(pelvicfinL, 0.0F, 0.0F, -0.3491F);


        this.cube_r10 = new AdvancedModelRenderer(this);
        this.cube_r10.setRotationPoint(0.0F, 1.0F, 1.0F);
        this.pelvicfinL.addChild(cube_r10);
        this.setRotateAngle(cube_r10, -0.5236F, 0.0F, 0.0F);
        this.cube_r10.cubeList.add(new ModelBox(cube_r10, 45, 16, 0.0F, -2.5F, -3.0F, 0, 4, 9, 0.0F, false));

        this.pelvicfinR = new AdvancedModelRenderer(this);
        this.pelvicfinR.setRotationPoint(-2.0F, 5.0F, 2.0F);
        this.body2.addChild(pelvicfinR);
        this.setRotateAngle(pelvicfinR, 0.0F, 0.0F, 0.3491F);


        this.cube_r11 = new AdvancedModelRenderer(this);
        this.cube_r11.setRotationPoint(0.0F, 1.0F, 1.0F);
        this.pelvicfinR.addChild(cube_r11);
        this.setRotateAngle(cube_r11, -0.5236F, 0.0F, 0.0F);
        this.cube_r11.cubeList.add(new ModelBox(cube_r11, 36, 38, 0.0F, -2.5F, -3.0F, 0, 4, 9, 0.0F, false));

        this.pectoralfinL = new AdvancedModelRenderer(this);
        this.pectoralfinL.setRotationPoint(3.15F, 4.0F, 1.5F);
        this.body.addChild(pectoralfinL);
        this.setRotateAngle(pectoralfinL, -0.6981F, 0.2618F, -0.2618F);
        this.pectoralfinL.cubeList.add(new ModelBox(pectoralfinL, 30, 60, 0.0F, -2.0F, 3.0F, 0, 4, 5, 0.0F, false));
        this.pectoralfinL.cubeList.add(new ModelBox(pectoralfinL, 0, 76, 0.0F, -1.5F, 2.0F, 0, 3, 1, 0.0F, false));
        this.pectoralfinL.cubeList.add(new ModelBox(pectoralfinL, 62, 15, -0.5F, -1.0F, 0.0F, 1, 2, 6, 0.0F, false));

        this.pectoralfinR = new AdvancedModelRenderer(this);
        this.pectoralfinR.setRotationPoint(-3.15F, 4.0F, 1.5F);
        this.body.addChild(pectoralfinR);
        this.setRotateAngle(pectoralfinR, -0.6981F, -0.2618F, 0.2618F);
        this.pectoralfinR.cubeList.add(new ModelBox(pectoralfinR, 45, 24, 0.0F, -2.0F, 4.0F, 0, 4, 5, 0.0F, false));
        this.pectoralfinR.cubeList.add(new ModelBox(pectoralfinR, 0, 71, 0.0F, -1.5F, 3.0F, 0, 3, 1, 0.0F, false));
        this.pectoralfinR.cubeList.add(new ModelBox(pectoralfinR, 62, 0, -0.5F, -1.0F, 0.0F, 1, 2, 6, 0.0F, false));

        updateDefaultPose();
        animator = ModelAnimator.create();
    }

    @Override
    public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        animate((IAnimatedEntity) entity, f, f1, f2, f3, f4, f5);
        this.head.render(f5);
    }
    public void renderStaticWall(float f) {
        this.head.rotateAngleY = (float) Math.toRadians(90);
        this.head.offsetZ = -0.03F;
        this.head.offsetY = -0.15F;
        this.head.render(0.01F);
        resetToDefaultPose();
    }
    public void renderStaticFloor(float f) {
        this.setRotateAngle(body, -0.0873F, -0.0873F, 0.0F);
        this.setRotateAngle(body2, -0.0873F, -0.1745F, 0.0F);
        this.setRotateAngle(body3, -0.1309F, 0.1745F, 0.0F);
        this.setRotateAngle(body4, 0.0F, 0.2182F, 0.0F);
        this.setRotateAngle(body5, 0.0F, 0.2182F, 0.0F);
        this.setRotateAngle(body6, 0.0F, 0.2618F, 0.0F);
        this.setRotateAngle(cube_r1, 0.3491F, 0.0F, 0.0F);
        this.setRotateAngle(cube_r10, -0.5236F, 0.0F, 0.0F);
        this.setRotateAngle(cube_r11, -0.5236F, 0.0F, 0.0F);
        this.setRotateAngle(cube_r2, -0.3491F, 0.0F, 0.0F);
        this.setRotateAngle(cube_r3, 0.2182F, 0.0F, 0.0F);
        this.setRotateAngle(cube_r4, -0.2182F, 0.0F, 0.0F);
        this.setRotateAngle(cube_r5, -0.0873F, 0.0F, 0.0F);
        this.setRotateAngle(cube_r6, -0.0611F, 0.0F, 0.0F);
        this.setRotateAngle(cube_r7, -0.2793F, 0.0F, 0.0F);
        this.setRotateAngle(cube_r8, -0.6109F, 0.0F, 0.0F);
        this.setRotateAngle(cube_r9, -2.618F, 0.0F, 0.0F);
        this.setRotateAngle(gillL, 0.0F, 0.0873F, 0.0F);
        this.setRotateAngle(gillR, 0.0F, -0.0873F, 0.0F);
        this.setRotateAngle(head, 0.2182F, 0.0F, 0.0F);
        this.setRotateAngle(lowerjaw, 0.3054F, 0.0F, 0.0F);
        this.setRotateAngle(pectoralfinL, -0.6981F, 0.2618F, -0.2618F);
        this.setRotateAngle(pectoralfinR, -0.6981F, -0.2618F, 0.2618F);
        this.setRotateAngle(pelvicfinL, 0.0F, 0.0F, -0.3491F);
        this.setRotateAngle(pelvicfinR, 0.0F, 0.0F, 0.3491F);
        this.head.offsetY = -0.6F;
        this.head.render(0.01F);
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

        this.head.offsetY = 0F;

        AdvancedModelRenderer[] fishTail = {this.body2, this.body3, this.body4, this.body5, this.body6};

        float speed = 0.386F;
        EntityPrehistoricFloraAgeableBase ee = (EntityPrehistoricFloraAgeableBase) e;
        if (ee.getIsFast()) {
            speed = speed * 1.6F;
        }
        float still = 1f;
        if (f3 == 0.0F) {
            still = 0.8F;
        }
        if (!e.isInWater()) {
            speed = 0.26F;
        }

        //this.head.rotateAngleY += f3 / (180F / (float) Math.PI);
        //this.head.rotateAngleX += f4 / (180F / (float) Math.PI);

        //if (f3 != 0.0F) {this.walk(Jaw, (float) (speed * 1.5), 0.2F, true, 0, 0, f2, 1);}
        if (e.isInWater()) {
            this.chainWave(fishTail, speed * still, 0.02F * still, -0.2, f2, 0.8F * still);
            this.chainSwing(fishTail, speed * still, 0.4F * still, -0.85, f2, 0.5F * still);
            this.swing(head, speed, 0.1F, true, 0, 0, f2, 0.8F);
        }
        else {
            this.swing(head, speed, 0.1F, true, 0, 0, f2, 0.5F);
        }
        this.flap(pectoralfinL, (float) (speed * 0.65), 0.4F, true, 0.8F, 0, f2, 0.5F);
        this.swing(pectoralfinL, (float) (speed * 0.65), 0.18F, true, 0, 0, f2, 0.5F);
        this.flap(pectoralfinR, (float) (speed * 0.65), -0.4F, true, 0.8F, 0, f2, 0.5F);
        this.swing(pectoralfinR, (float) (speed * 0.65), -0.18F, true, 0, 0, f2, 0.5F);

        this.flap(pelvicfinL, (float) (speed * 0.65), 0.18F, true, 1.8F, 0, f2, 0.5F);
        this.swing(pelvicfinL, (float) (speed * 0.65), 0.4F, true, 1, 0, f2, 0.5F);
        this.flap(pelvicfinR, (float) (speed * 0.65), -0.18F, true, 1.8F, 0, f2, 0.5F);
        this.swing(pelvicfinR, (float) (speed * 0.65), -0.4F, true, 1, 0, f2, 0.5F);

        if (!e.isInWater()) {
            this.head.rotateAngleZ = (float) Math.toRadians(90);
            //this.head.offsetY = 1.05F;
            this.bob(head, -speed * 1.9F, 2.5F, false, f2, 1);
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
        animator.rotate(this.lowerjaw, (float) Math.toRadians(40), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.endKeyframe();
        animator.setStaticKeyframe(5);
        animator.resetKeyframe(2);

    }
}

