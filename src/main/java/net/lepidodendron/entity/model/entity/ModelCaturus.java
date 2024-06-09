package net.lepidodendron.entity.model.entity;

import net.ilexiconn.llibrary.client.model.ModelAnimator;
import net.ilexiconn.llibrary.client.model.tools.AdvancedModelRenderer;
import net.ilexiconn.llibrary.server.animation.IAnimatedEntity;
import net.lepidodendron.entity.base.EntityPrehistoricFloraAgeableBase;
import net.lepidodendron.entity.model.ModelBasePalaeopedia;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

public class ModelCaturus extends ModelBasePalaeopedia {
    private final AdvancedModelRenderer Body;
    private final AdvancedModelRenderer cube_r1;
    private final AdvancedModelRenderer cube_r2;
    private final AdvancedModelRenderer cube_r3;
    private final AdvancedModelRenderer cube_r4;
    private final AdvancedModelRenderer cube_r5;
    private final AdvancedModelRenderer cube_r6;
    private final AdvancedModelRenderer cube_r7;
    private final AdvancedModelRenderer cube_r8;
    private final AdvancedModelRenderer DorsalFinR;
    private final AdvancedModelRenderer DorsalFinL;
    private final AdvancedModelRenderer jaw;
    private final AdvancedModelRenderer cube_r9;
    private final AdvancedModelRenderer Body2;
    private final AdvancedModelRenderer cube_r10;
    private final AdvancedModelRenderer PelvicFinR;
    private final AdvancedModelRenderer PelvicFinL;
    private final AdvancedModelRenderer Body3;
    private final AdvancedModelRenderer cube_r11;
    private final AdvancedModelRenderer Body4;
    private final AdvancedModelRenderer cube_r12;
    private final AdvancedModelRenderer cube_r13;
    private final AdvancedModelRenderer Body5;
    private final AdvancedModelRenderer cube_r14;
    private final AdvancedModelRenderer cube_r15;

    private ModelAnimator animator;

    public ModelCaturus() {
        this.textureWidth = 128;
        this.textureHeight = 128;

        this.Body = new AdvancedModelRenderer(this);
        this.Body.setRotationPoint(0.0F, 26.0F, -1.0F);
        this.setRotateAngle(Body, 0.0873F, 0.0F, 0.0F);
        this.Body.cubeList.add(new ModelBox(Body, 20, 20, -2.5F, -13.0F, -4.0F, 5, 9, 5, 0.01F, false));
        this.Body.cubeList.add(new ModelBox(Body, 28, 48, -2.0F, -9.0F, -7.0F, 4, 4, 3, -0.01F, false));
        this.Body.cubeList.add(new ModelBox(Body, 7, 35, -2.0F, -11.25F, -9.0F, 4, 2, 2, 0.02F, false));
        this.Body.cubeList.add(new ModelBox(Body, 0, 0, -2.0F, -10.75F, -8.5F, 4, 1, 1, 0.03F, false));

        this.cube_r1 = new AdvancedModelRenderer(this);
        this.cube_r1.setRotationPoint(-1.0F, -4.0F, -4.0F);
        this.Body.addChild(cube_r1);
        this.setRotateAngle(cube_r1, -0.1309F, 0.0F, 0.0F);
        this.cube_r1.cubeList.add(new ModelBox(cube_r1, 40, 28, -1.0F, -0.9F, 0.0F, 4, 1, 5, 0.01F, false));

        this.cube_r2 = new AdvancedModelRenderer(this);
        this.cube_r2.setRotationPoint(-0.5F, -11.3F, -11.7F);
        this.Body.addChild(cube_r2);
        this.setRotateAngle(cube_r2, -0.4363F, 0.0F, 0.0F);
        this.cube_r2.cubeList.add(new ModelBox(cube_r2, 46, 34, -1.0F, 1.275F, -0.15F, 3, 1, 4, 0.01F, false));
        this.cube_r2.cubeList.add(new ModelBox(cube_r2, 50, 47, -1.0F, 0.525F, -0.4F, 3, 1, 4, 0.02F, false));

        this.cube_r3 = new AdvancedModelRenderer(this);
        this.cube_r3.setRotationPoint(-0.5F, -12.55F, -8.9F);
        this.Body.addChild(cube_r3);
        this.setRotateAngle(cube_r3, 0.4363F, 0.0F, 0.0F);
        this.cube_r3.cubeList.add(new ModelBox(cube_r3, 0, 2, -1.0F, -0.025F, -3.75F, 3, 1, 1, -0.01F, false));
        this.cube_r3.cubeList.add(new ModelBox(cube_r3, 53, 20, -1.0F, -0.025F, -3.0F, 3, 2, 3, 0.0F, false));

        this.cube_r4 = new AdvancedModelRenderer(this);
        this.cube_r4.setRotationPoint(-0.5F, -6.25F, -6.75F);
        this.Body.addChild(cube_r4);
        this.setRotateAngle(cube_r4, -0.6981F, 0.0F, 0.0F);
        this.cube_r4.cubeList.add(new ModelBox(cube_r4, 0, 54, -1.0F, -0.4F, -3.25F, 3, 1, 3, 0.01F, false));
        this.cube_r4.cubeList.add(new ModelBox(cube_r4, 40, 20, -1.5F, -3.0F, -5.0F, 4, 3, 5, 0.01F, false));

        this.cube_r5 = new AdvancedModelRenderer(this);
        this.cube_r5.setRotationPoint(-0.5F, -5.0F, -7.0F);
        this.Body.addChild(cube_r5);
        this.setRotateAngle(cube_r5, -0.2618F, 0.0F, 0.0F);
        this.cube_r5.cubeList.add(new ModelBox(cube_r5, 49, 39, -1.0F, -0.9F, 0.0F, 3, 1, 4, 0.0F, false));

        this.cube_r6 = new AdvancedModelRenderer(this);
        this.cube_r6.setRotationPoint(-0.5F, -13.0F, -4.0F);
        this.Body.addChild(cube_r6);
        this.setRotateAngle(cube_r6, 0.0873F, 0.0F, 0.0F);
        this.cube_r6.cubeList.add(new ModelBox(cube_r6, 33, 34, -1.5F, 0.0F, -5.0F, 4, 4, 5, 0.0F, false));

        this.cube_r7 = new AdvancedModelRenderer(this);
        this.cube_r7.setRotationPoint(1.75F, -9.0F, -4.0F);
        this.Body.addChild(cube_r7);
        this.setRotateAngle(cube_r7, 0.0F, 0.0873F, 0.0F);
        this.cube_r7.cubeList.add(new ModelBox(cube_r7, 0, 35, -0.25F, -2.5F, 0.0F, 1, 7, 5, 0.01F, true));

        this.cube_r8 = new AdvancedModelRenderer(this);
        this.cube_r8.setRotationPoint(-1.75F, -9.0F, -4.0F);
        this.Body.addChild(cube_r8);
        this.setRotateAngle(cube_r8, 0.0F, -0.0873F, 0.0F);
        this.cube_r8.cubeList.add(new ModelBox(cube_r8, 0, 35, -0.75F, -2.5F, 0.0F, 1, 7, 5, 0.01F, false));

        this.DorsalFinR = new AdvancedModelRenderer(this);
        this.DorsalFinR.setRotationPoint(-2.75F, -4.5F, 0.75F);
        this.Body.addChild(DorsalFinR);
        this.setRotateAngle(DorsalFinR, 0.2182F, -0.0873F, 0.3491F);
        this.DorsalFinR.cubeList.add(new ModelBox(DorsalFinR, 42, 47, 0.0F, -1.0F, -0.25F, 0, 6, 4, 0.0F, false));

        this.DorsalFinL = new AdvancedModelRenderer(this);
        this.DorsalFinL.setRotationPoint(2.75F, -4.5F, 0.75F);
        this.Body.addChild(DorsalFinL);
        this.setRotateAngle(DorsalFinL, 0.2182F, 0.0873F, -0.3491F);
        this.DorsalFinL.cubeList.add(new ModelBox(DorsalFinL, 42, 47, 0.0F, -1.0F, -0.25F, 0, 6, 4, 0.0F, true));

        this.jaw = new AdvancedModelRenderer(this);
        this.jaw.setRotationPoint(-0.5F, -6.0F, -7.0F);
        this.Body.addChild(jaw);
        this.setRotateAngle(jaw, -0.5236F, 0.0F, 0.0F);
        this.jaw.cubeList.add(new ModelBox(jaw, 33, 1, -1.0F, -0.5F, -6.5F, 3, 1, 7, 0.0F, false));
        this.jaw.cubeList.add(new ModelBox(jaw, 20, 0, -1.0F, -1.25F, -6.5F, 3, 1, 7, -0.02F, false));

        this.cube_r9 = new AdvancedModelRenderer(this);
        this.cube_r9.setRotationPoint(0.0F, 0.5F, -3.5F);
        this.jaw.addChild(cube_r9);
        this.setRotateAngle(cube_r9, -0.1309F, 0.0F, 0.0F);
        this.cube_r9.cubeList.add(new ModelBox(cube_r9, 50, 52, -0.5F, -1.0F, 0.0F, 2, 1, 4, 0.0F, false));

        this.Body2 = new AdvancedModelRenderer(this);
        this.Body2.setRotationPoint(0.0F, -8.9F, 1.5F);
        this.Body.addChild(Body2);
        this.setRotateAngle(Body2, -0.0873F, 0.0F, 0.0F);
        this.Body2.cubeList.add(new ModelBox(Body2, 0, 0, -2.5F, -4.0F, -1.0F, 5, 9, 10, 0.0F, false));
        this.Body2.cubeList.add(new ModelBox(Body2, 33, 37, 0.0F, -8.75F, 5.0F, 0, 5, 6, 0.0F, false));

        this.cube_r10 = new AdvancedModelRenderer(this);
        this.cube_r10.setRotationPoint(0.0F, 5.0F, 9.0F);
        this.Body2.addChild(cube_r10);
        this.setRotateAngle(cube_r10, 0.0873F, 0.0F, 0.0F);
        this.cube_r10.cubeList.add(new ModelBox(cube_r10, 20, 9, -2.0F, -1.0F, -10.0F, 4, 1, 10, 0.0F, false));

        this.PelvicFinR = new AdvancedModelRenderer(this);
        this.PelvicFinR.setRotationPoint(-1.0F, 5.15F, 6.5F);
        this.Body2.addChild(PelvicFinR);
        this.setRotateAngle(PelvicFinR, 0.3491F, -0.0873F, 0.3491F);
        this.PelvicFinR.cubeList.add(new ModelBox(PelvicFinR, 28, 30, 0.0F, -0.25F, -0.25F, 0, 4, 4, 0.0F, false));

        this.PelvicFinL = new AdvancedModelRenderer(this);
        this.PelvicFinL.setRotationPoint(1.0F, 5.15F, 6.5F);
        this.Body2.addChild(PelvicFinL);
        this.setRotateAngle(PelvicFinL, 0.3491F, 0.0873F, -0.3491F);
        this.PelvicFinL.cubeList.add(new ModelBox(PelvicFinL, 28, 30, 0.0F, -0.25F, -0.25F, 0, 4, 4, 0.0F, true));

        this.Body3 = new AdvancedModelRenderer(this);
        this.Body3.setRotationPoint(0.0F, 0.75F, 9.0F);
        this.Body2.addChild(Body3);
        this.Body3.cubeList.add(new ModelBox(Body3, 15, 34, -2.0F, -4.0F, -0.5F, 4, 8, 5, 0.0F, false));

        this.cube_r11 = new AdvancedModelRenderer(this);
        this.cube_r11.setRotationPoint(0.0F, -4.0F, 4.5F);
        this.Body3.addChild(cube_r11);
        this.setRotateAngle(cube_r11, -0.1309F, 0.0F, 0.0F);
        this.cube_r11.cubeList.add(new ModelBox(cube_r11, 46, 0, -1.5F, 0.0F, -5.0F, 3, 1, 5, 0.0F, false));

        this.Body4 = new AdvancedModelRenderer(this);
        this.Body4.setRotationPoint(0.0F, -1.0F, 4.5F);
        this.Body3.addChild(Body4);
        this.setRotateAngle(Body4, -0.0436F, 0.0F, 0.0F);
        this.Body4.cubeList.add(new ModelBox(Body4, 38, 9, -1.5F, -2.0F, -0.5F, 3, 5, 5, 0.0F, false));

        this.cube_r12 = new AdvancedModelRenderer(this);
        this.cube_r12.setRotationPoint(-0.5F, -2.0F, 4.5F);
        this.Body4.addChild(cube_r12);
        this.setRotateAngle(cube_r12, -0.1745F, 0.0F, 0.0F);
        this.cube_r12.cubeList.add(new ModelBox(cube_r12, 49, 14, -0.5F, 0.0F, -5.0F, 2, 1, 5, 0.0F, false));

        this.cube_r13 = new AdvancedModelRenderer(this);
        this.cube_r13.setRotationPoint(-0.5F, 3.0F, 4.5F);
        this.Body4.addChild(cube_r13);
        this.setRotateAngle(cube_r13, 0.3491F, 0.0F, 0.0F);
        this.cube_r13.cubeList.add(new ModelBox(cube_r13, 0, 0, 0.5F, -0.5F, -5.0F, 0, 5, 5, 0.0F, false));
        this.cube_r13.cubeList.add(new ModelBox(cube_r13, 14, 47, -0.5F, -2.0F, -5.0F, 2, 2, 5, 0.0F, false));

        this.Body5 = new AdvancedModelRenderer(this);
        this.Body5.setRotationPoint(0.0F, 0.0F, 4.5F);
        this.Body4.addChild(Body5);
        this.Body5.cubeList.add(new ModelBox(Body5, 40, 43, -1.0F, -1.5F, -0.75F, 2, 3, 5, 0.0F, false));
        this.Body5.cubeList.add(new ModelBox(Body5, 0, 9, 0.0F, -9.0F, 3.5F, 0, 16, 10, 0.0F, false));

        this.cube_r14 = new AdvancedModelRenderer(this);
        this.cube_r14.setRotationPoint(0.0F, -1.5F, 4.25F);
        this.Body5.addChild(cube_r14);
        this.setRotateAngle(cube_r14, -0.0873F, 0.0F, 0.0F);
        this.cube_r14.cubeList.add(new ModelBox(cube_r14, 49, 6, -1.0F, 0.0F, -5.0F, 2, 1, 5, -0.01F, false));

        this.cube_r15 = new AdvancedModelRenderer(this);
        this.cube_r15.setRotationPoint(0.0F, 1.5F, 4.25F);
        this.Body5.addChild(cube_r15);
        this.setRotateAngle(cube_r15, 0.2618F, 0.0F, 0.0F);
        this.cube_r15.cubeList.add(new ModelBox(cube_r15, 0, 47, -1.0F, -2.0F, -5.0F, 2, 2, 5, -0.01F, false));

        updateDefaultPose();
        animator = ModelAnimator.create();
    }

    @Override
    public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        animate((IAnimatedEntity) entity, f, f1, f2, f3, f4, f5);
        this.Body.render(f5);
    }

    public void renderStaticWall(float f) {
        this.Body.offsetY = -0.195F;
        this.Body.offsetX = -0.066F;
        this.Body.rotateAngleY = (float) Math.toRadians(90);
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

        //this.Body.offsetY = 1.0F;

        AdvancedModelRenderer[] fishTail = {this.Body2, this.Body3, this.Body4, this.Body5};

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
            this.swing(Body, speed, 0.2F, true, 0, 0, f2, 0.8F);
        }
        else {
            this.swing(Body, speed, 0.1F, true, 0, 0, f2, 0.5F);
        }
        this.flap(DorsalFinL, (float) (speed * 0.65), 0.28F, false, 0.8F, 0, f2, 0.5F);
        this.swing(DorsalFinL, (float) (speed * 0.65), 0.18F, true, 0, 0, f2, 0.5F);
        this.flap(DorsalFinR, (float) (speed * 0.65), -0.28F, false, 0.8F, 0, f2, 0.5F);
        this.swing(DorsalFinR, (float) (speed * 0.65), -0.18F, true, 0, 0, f2, 0.5F);

        this.flap(PelvicFinL, (float) (speed * 0.65), 0.28F, false, 1.8F, 0, f2, 0.5F);
        this.swing(PelvicFinL, (float) (speed * 0.65), 0.18F, true, 1, 0, f2, 0.5F);
        this.flap(PelvicFinR, (float) (speed * 0.65), -0.28F, false, 1.8F, 0, f2, 0.5F);
        this.swing(PelvicFinR, (float) (speed * 0.65), -0.18F, true, 1, 0, f2, 0.5F);


        if (!e.isInWater()) {
            this.Body.rotateAngleZ = (float) Math.toRadians(90);
            this.Body.offsetY = -0.27F;
            this.bob(Body, -speed * 3.2F, 2.5F, false, f2, 1);
            this.chainWave(fishTail, speed * 2.7F, 0.028F, -0.2, f2, 0.8F * still);
            this.chainSwing(fishTail, speed * 2.7F, 0.15F, -0.55, f2, 0.4F * still);

        }

    }

    public void animate(IAnimatedEntity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        EntityPrehistoricFloraAgeableBase e = (EntityPrehistoricFloraAgeableBase) entity;
        animator.update(entity);
        this.resetToDefaultPose();
        setRotationAngles(f, f1, f2, f3, f4, f5, (Entity) entity);

        animator.setAnimation(e.ATTACK_ANIMATION);
        animator.startKeyframe(5);
        //animator.move(this.Cephalon, 0,0,-0.5F);
       // animator.rotate(this.Cephalon, (float) Math.toRadians(-5), (float) Math.toRadians(0), (float) Math.toRadians(0));
       // animator.rotate(this.maxillae, -(float) Math.toRadians(17.5), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(this.jaw, (float) Math.toRadians(45), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.endKeyframe();
        animator.setStaticKeyframe(5);
        animator.resetKeyframe(2);

    }
}

