package net.lepidodendron.entity.model.entity;

import net.ilexiconn.llibrary.client.model.ModelAnimator;
import net.ilexiconn.llibrary.client.model.tools.AdvancedModelRenderer;
import net.ilexiconn.llibrary.server.animation.IAnimatedEntity;
import net.lepidodendron.entity.base.EntityPrehistoricFloraAgeableBase;
import net.lepidodendron.entity.model.ModelBasePalaeopedia;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

public class ModelOxyosteus extends ModelBasePalaeopedia {
    private final AdvancedModelRenderer Body;
    private final AdvancedModelRenderer cube_r1;
    private final AdvancedModelRenderer cube_r2;
    private final AdvancedModelRenderer cube_r3;
    private final AdvancedModelRenderer cube_r4;
    private final AdvancedModelRenderer cube_r5;
    private final AdvancedModelRenderer cube_r6;
    private final AdvancedModelRenderer cube_r7;
    private final AdvancedModelRenderer Body2;
    private final AdvancedModelRenderer Body3;
    private final AdvancedModelRenderer PelvicfinR;
    private final AdvancedModelRenderer PelvicfinL;
    private final AdvancedModelRenderer Body4;
    private final AdvancedModelRenderer Body5;
    private final AdvancedModelRenderer Tail;
    private final AdvancedModelRenderer PectoralfinR;
    private final AdvancedModelRenderer PectoralfinL;
    private final AdvancedModelRenderer Jaw;
    private final AdvancedModelRenderer cube_r8;

    private ModelAnimator animator;

    public ModelOxyosteus() {
        this.textureWidth = 64;
        this.textureHeight = 64;

        this.Body = new AdvancedModelRenderer(this);
        this.Body.setRotationPoint(0.0F, 23.75F, -2.2F);
        this.Body.cubeList.add(new ModelBox(Body, 13, 16, -1.5F, -6.75F, -6.05F, 3, 5, 7, -0.01F, false));
        this.Body.cubeList.add(new ModelBox(Body, 0, 0, -1.0F, -5.75F, -10.0F, 2, 1, 1, 0.03F, false));

        this.cube_r1 = new AdvancedModelRenderer(this);
        this.cube_r1.setRotationPoint(0.0F, -6.55F, -9.8F);
        this.Body.addChild(cube_r1);
        this.setRotateAngle(cube_r1, -0.1571F, 0.0F, 0.0F);
        this.cube_r1.cubeList.add(new ModelBox(cube_r1, 38, 5, -1.0F, 1.425F, -3.0F, 2, 1, 2, -0.015F, false));
        this.cube_r1.cubeList.add(new ModelBox(cube_r1, 31, 0, -1.0F, 1.025F, -3.0F, 2, 1, 4, -0.01F, false));

        this.cube_r2 = new AdvancedModelRenderer(this);
        this.cube_r2.setRotationPoint(0.0F, -6.55F, -9.8F);
        this.Body.addChild(cube_r2);
        this.setRotateAngle(cube_r2, 0.2182F, 0.0F, 0.0F);
        this.cube_r2.cubeList.add(new ModelBox(cube_r2, 18, 0, -0.5F, -0.25F, -6.6F, 1, 1, 3, 0.0F, false));

        this.cube_r3 = new AdvancedModelRenderer(this);
        this.cube_r3.setRotationPoint(0.0F, -6.55F, -9.8F);
        this.Body.addChild(cube_r3);
        this.setRotateAngle(cube_r3, 0.1309F, 0.0F, 0.0F);
        this.cube_r3.cubeList.add(new ModelBox(cube_r3, 37, 18, -1.0F, 0.05F, -3.6F, 2, 1, 4, 0.0F, false));

        this.cube_r4 = new AdvancedModelRenderer(this);
        this.cube_r4.setRotationPoint(0.0F, -2.05F, -9.8F);
        this.Body.addChild(cube_r4);
        this.setRotateAngle(cube_r4, 0.4451F, 0.0F, 0.0F);
        this.cube_r4.cubeList.add(new ModelBox(cube_r4, 9, 34, -1.0F, -2.95F, 0.0F, 2, 3, 2, 0.0F, false));

        this.cube_r5 = new AdvancedModelRenderer(this);
        this.cube_r5.setRotationPoint(0.0F, -2.05F, -9.8F);
        this.Body.addChild(cube_r5);
        this.setRotateAngle(cube_r5, -0.1309F, 0.0F, 0.0F);
        this.cube_r5.cubeList.add(new ModelBox(cube_r5, 0, 34, -1.0F, -2.95F, 0.0F, 2, 3, 5, 0.005F, false));

        this.cube_r6 = new AdvancedModelRenderer(this);
        this.cube_r6.setRotationPoint(0.0F, -6.75F, -5.8F);
        this.Body.addChild(cube_r6);
        this.setRotateAngle(cube_r6, 0.0436F, 0.0F, 0.0F);
        this.cube_r6.cubeList.add(new ModelBox(cube_r6, 0, 0, -1.0F, 0.0F, -4.0F, 2, 3, 6, 0.01F, false));

        this.cube_r7 = new AdvancedModelRenderer(this);
        this.cube_r7.setRotationPoint(0.0F, -1.75F, -6.0F);
        this.Body.addChild(cube_r7);
        this.setRotateAngle(cube_r7, -0.3316F, 0.0F, 0.0F);
        this.cube_r7.cubeList.add(new ModelBox(cube_r7, 0, 23, -1.5F, -5.0F, -0.05F, 3, 5, 6, -0.02F, false));

        this.Body2 = new AdvancedModelRenderer(this);
        this.Body2.setRotationPoint(0.0F, -3.75F, -0.8F);
        this.Body.addChild(Body2);
        this.Body2.cubeList.add(new ModelBox(Body2, 18, 28, -1.5F, -3.0F, 0.0F, 3, 7, 5, 0.0F, false));

        this.Body3 = new AdvancedModelRenderer(this);
        this.Body3.setRotationPoint(0.0F, 0.0F, 5.0F);
        this.Body2.addChild(Body3);
        this.Body3.cubeList.add(new ModelBox(Body3, 20, 0, -1.0F, -2.75F, -1.0F, 2, 6, 7, 0.0F, false));
        this.Body3.cubeList.add(new ModelBox(Body3, 26, 11, 0.0F, -6.5F, 0.0F, 0, 4, 7, 0.0F, false));

        this.PelvicfinR = new AdvancedModelRenderer(this);
        this.PelvicfinR.setRotationPoint(-0.5F, 3.25F, 4.0F);
        this.Body3.addChild(PelvicfinR);
        this.setRotateAngle(PelvicfinR, 0.0F, 0.0F, 0.3054F);
        this.PelvicfinR.cubeList.add(new ModelBox(PelvicfinR, 0, 0, 0.0F, 0.0F, -0.5F, 0, 2, 3, 0.0F, false));

        this.PelvicfinL = new AdvancedModelRenderer(this);
        this.PelvicfinL.setRotationPoint(0.5F, 3.25F, 4.0F);
        this.Body3.addChild(PelvicfinL);
        this.setRotateAngle(PelvicfinL, 0.0F, 0.0F, -0.3054F);
        this.PelvicfinL.cubeList.add(new ModelBox(PelvicfinL, 0, 0, 0.0F, 0.0F, -0.5F, 0, 2, 3, 0.0F, true));

        this.Body4 = new AdvancedModelRenderer(this);
        this.Body4.setRotationPoint(0.0F, 0.0F, 6.0F);
        this.Body3.addChild(Body4);
        this.Body4.cubeList.add(new ModelBox(Body4, 34, 31, -0.5F, -1.75F, -0.75F, 1, 4, 5, 0.0F, false));
        this.Body4.cubeList.add(new ModelBox(Body4, 10, 0, 0.0F, 1.75F, 3.0F, 0, 2, 2, 0.0F, false));

        this.Body5 = new AdvancedModelRenderer(this);
        this.Body5.setRotationPoint(0.0F, 0.0F, 4.25F);
        this.Body4.addChild(Body5);
        this.Body5.cubeList.add(new ModelBox(Body5, 29, 22, -0.5F, -1.25F, -0.5F, 1, 3, 6, -0.01F, false));

        this.Tail = new AdvancedModelRenderer(this);
        this.Tail.setRotationPoint(0.0F, 0.25F, 5.5F);
        this.Body5.addChild(Tail);
        this.Tail.cubeList.add(new ModelBox(Tail, 0, 0, 0.0F, -7.5F, -1.0F, 0, 13, 10, 0.0F, false));

        this.PectoralfinR = new AdvancedModelRenderer(this);
        this.PectoralfinR.setRotationPoint(-1.5F, -1.75F, -3.8F);
        this.Body.addChild(PectoralfinR);
        this.setRotateAngle(PectoralfinR, 0.0F, 0.0F, 0.5236F);
        this.PectoralfinR.cubeList.add(new ModelBox(PectoralfinR, 26, 6, 0.0F, 0.0F, -1.5F, 0, 5, 7, 0.0F, false));

        this.PectoralfinL = new AdvancedModelRenderer(this);
        this.PectoralfinL.setRotationPoint(1.5F, -1.75F, -3.8F);
        this.Body.addChild(PectoralfinL);
        this.setRotateAngle(PectoralfinL, 0.0F, 0.0F, -0.5236F);
        this.PectoralfinL.cubeList.add(new ModelBox(PectoralfinL, 26, 6, 0.0F, 0.0F, -1.5F, 0, 5, 7, 0.0F, true));

        this.Jaw = new AdvancedModelRenderer(this);
        this.Jaw.setRotationPoint(0.0F, -3.75F, -10.0F);
        this.Body.addChild(Jaw);
        this.setRotateAngle(Jaw, -0.3054F, 0.0F, 0.0F);
        this.Jaw.cubeList.add(new ModelBox(Jaw, 37, 23, -1.0F, -0.25F, -3.05F, 2, 1, 3, -0.02F, false));

        this.cube_r8 = new AdvancedModelRenderer(this);
        this.cube_r8.setRotationPoint(0.0F, 0.75F, -3.0F);
        this.Jaw.addChild(cube_r8);
        this.setRotateAngle(cube_r8, -0.2182F, 0.0F, 0.0F);
        this.cube_r8.cubeList.add(new ModelBox(cube_r8, 10, 0, -1.0F, -1.0F, -0.05F, 2, 1, 4, -0.025F, false));

        updateDefaultPose();
        animator = ModelAnimator.create();
    }

    @Override
    public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        animate((IAnimatedEntity) entity, f, f1, f2, f3, f4, f5);
        this.Body.render(f5);
    }

    @Override
    public void renderStaticBook(float f) {
        //Rotations, positions and sizing:
        this.Body.offsetY = -0.8F;
        this.Body.offsetX = 0.4F;
        this.Body.offsetZ = 2.0F;
        this.Body.rotateAngleY = (float)Math.toRadians(120);
        this.Body.rotateAngleX = (float)Math.toRadians(1);
        this.Body.rotateAngleZ = (float)Math.toRadians(0);
        this.Body.scaleChildren = true;
        float scaler = 2.2F;
        this.Body.setScale(scaler, scaler, scaler);
        //Start of pose:
        this.setRotateAngle(Body, 0.6F, 3.8F, -0.2F);
        this.setRotateAngle(cube_r1, -0.1571F, 0.0F, 0.0F);
        this.setRotateAngle(cube_r2, 0.2182F, 0.0F, 0.0F);
        this.setRotateAngle(cube_r3, 0.1309F, 0.0F, 0.0F);
        this.setRotateAngle(cube_r4, 0.4451F, 0.0F, 0.0F);
        this.setRotateAngle(cube_r5, -0.1309F, 0.0F, 0.0F);
        this.setRotateAngle(cube_r6, 0.0436F, 0.0F, 0.0F);
        this.setRotateAngle(cube_r7, -0.3316F, 0.0F, 0.0F);
        this.setRotateAngle(Body2, 0.0F, 0.0873F, 0.0F);
        this.setRotateAngle(Body3, 0.0F, 0.0873F, 0.0F);
        this.setRotateAngle(PelvicfinR, 0.0F, 0.0F, 0.3054F);
        this.setRotateAngle(PelvicfinL, 0.0F, 0.0F, -0.3054F);
        this.setRotateAngle(Body4, 0.0F, -0.0873F, 0.0F);
        this.setRotateAngle(Body5, 0.0F, -0.1309F, 0.0F);
        this.setRotateAngle(Tail, 0.0F, -0.1745F, 0.0F);
        this.setRotateAngle(PectoralfinR, 0.0F, 0.0F, 0.5236F);
        this.setRotateAngle(PectoralfinL, 0.0F, 0.0F, -0.5236F);
        this.setRotateAngle(Jaw, -0.3054F, 0.0F, 0.0F);
        this.setRotateAngle(cube_r8, -0.2182F, 0.0F, 0.0F);
        //End of pose, now render the model:
        this.Body.render(f);
        //Reset rotations, positions and sizing:
        this.Body.setScale(1.0F, 1.0F, 1.0F);
        this.Body.scaleChildren = false;
        resetToDefaultPose();

    }

    public void renderStaticWall(float f) {
        this.Body.rotateAngleY = (float) Math.toRadians(90);
        this.Body.offsetX = -0.06F;
        this.Body.offsetY = -0.19F;
        this.Body.render(0.01F);
        resetToDefaultPose();
    }
    public void renderStaticFloor(float f) {
        this.setRotateAngle(cube_r1, -0.1571F, 0.0F, 0.0F);
        this.setRotateAngle(cube_r2, 0.2182F, 0.0F, 0.0F);
        this.setRotateAngle(cube_r3, 0.1309F, 0.0F, 0.0F);
        this.setRotateAngle(cube_r4, 0.4451F, 0.0F, 0.0F);
        this.setRotateAngle(cube_r5, -0.1309F, 0.0F, 0.0F);
        this.setRotateAngle(cube_r6, 0.0436F, 0.0F, 0.0F);
        this.setRotateAngle(cube_r7, -0.3316F, 0.0F, 0.0F);
        this.setRotateAngle(Body2, 0.0F, 0.0873F, 0.0F);
        this.setRotateAngle(Body3, 0.0F, 0.0873F, 0.0F);
        this.setRotateAngle(PelvicfinR, 0.0F, 0.0F, 0.3054F);
        this.setRotateAngle(PelvicfinL, 0.0F, 0.0F, -0.3054F);
        this.setRotateAngle(Body4, 0.0F, -0.0873F, 0.0F);
        this.setRotateAngle(Body5, 0.0F, -0.1309F, 0.0F);
        this.setRotateAngle(Tail, 0.0F, -0.1745F, 0.0F);
        this.setRotateAngle(PectoralfinR, 0.0F, 0.0F, 0.5236F);
        this.setRotateAngle(PectoralfinL, 0.0F, 0.0F, -0.5236F);
        this.setRotateAngle(Jaw, -0.3054F, 0.0F, 0.0F);
        this.setRotateAngle(cube_r8, -0.2182F, 0.0F, 0.0F);
        this.Body.rotateAngleY = (float) Math.toRadians(90);
        this.Body.offsetX = -0.F;
        this.Body.offsetY = -0.23F;
        this.Body.offsetZ = 0.02F;
        this.Body.render(0.01F);
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


        AdvancedModelRenderer[] fishTail = {this.Body4, this.Body5, this.Tail};

        float speed = 0.186F;
        EntityPrehistoricFloraAgeableBase ee = (EntityPrehistoricFloraAgeableBase) e;
        if (ee.getIsFast()) {
            speed = speed * 2.6F;
        }
        float still = 1f;
        if (f3 == 0.0F) {
            still = 0.9F;
        }
        if (!e.isInWater()) {
            speed = 0.34F;
        }

        //this.head.rotateAngleY += f3 / (180F / (float) Math.PI);
        //this.head.rotateAngleX += f4 / (180F / (float) Math.PI);

        //if (f3 != 0.0F) {this.walk(Jaw, (float) (speed * 1.5), 0.2F, true, 0, 0, f2, 1);}
        if (e.isInWater()) {
            this.chainWave(fishTail, speed * still, 0.02F * still, -0.2, f2, 0.8F * still);
            this.chainSwing(fishTail, speed * still, 0.25F * still, -0.85, f2, 0.5F * still);
            this.swing(Body, speed * still, 0.1F, true, 0, 0, f2, 0.8F);
        }
        else {
            this.swing(Body, speed, 0.1F, true, 0, 0, f2, 0.5F);
        }
        this.flap(PectoralfinL, (float) (speed * 0.65), 0.28F, false, 0.8F, 0, f2, 0.5F);
        this.swing(PectoralfinL, (float) (speed * 0.65), 0.18F, true, 0, 0, f2, 0.5F);
        this.flap(PectoralfinR, (float) (speed * 0.65), -0.28F, false, 0.8F, 0, f2, 0.5F);
        this.swing(PectoralfinR, (float) (speed * 0.65), -0.18F, true, 0, 0, f2, 0.5F);

        this.flap(PelvicfinL, (float) (speed * 0.65), 0.28F, false, 1.8F, 0, f2, 0.5F);
        this.swing(PelvicfinL, (float) (speed * 0.65), 0.18F, true, 1, 0, f2, 0.5F);
        this.flap(PelvicfinR, (float) (speed * 0.65), -0.28F, false, 1.8F, 0, f2, 0.5F);
        this.swing(PelvicfinR, (float) (speed * 0.65), -0.18F, true, 1, 0, f2, 0.5F);


        if (!e.isInWater()) {
            this.Body.rotateAngleZ = (float) Math.toRadians(90);
            //this.Body.offsetY = -0.3F;
            this.bob(Body, speed *1.7F, 0.1F, false, f2, 1);
            this.chainWave(fishTail, speed * 1.7F, 0.028F, -0.2, f2, 0.8F * still);
            this.chainSwing(fishTail, speed * 1.7F, 0.15F, -0.55, f2, 0.4F * still);

        }

    }

    public void animate(IAnimatedEntity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        EntityPrehistoricFloraAgeableBase e = (EntityPrehistoricFloraAgeableBase) entity;
        animator.update(entity);
        this.resetToDefaultPose();
        setRotationAngles(f, f1, f2, f3, f4, f5, (Entity) entity);

        animator.setAnimation(e.ATTACK_ANIMATION);
        animator.startKeyframe(8);
        animator.rotate(this.Jaw, (float) Math.toRadians(40), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.endKeyframe();
        animator.setStaticKeyframe(5);
        animator.resetKeyframe(2);

        animator.setAnimation(e.ROAR_ANIMATION);
        animator.startKeyframe(8);
        animator.rotate(this.Jaw, (float) Math.toRadians(37.5), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.endKeyframe();
        animator.setStaticKeyframe(5);
        animator.resetKeyframe(2);

    }
}

