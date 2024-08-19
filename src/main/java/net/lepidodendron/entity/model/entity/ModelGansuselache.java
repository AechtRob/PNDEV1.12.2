package net.lepidodendron.entity.model.entity;

import net.ilexiconn.llibrary.client.model.ModelAnimator;
import net.ilexiconn.llibrary.client.model.tools.AdvancedModelRenderer;
import net.ilexiconn.llibrary.server.animation.IAnimatedEntity;
import net.lepidodendron.entity.base.EntityPrehistoricFloraAgeableBase;
import net.lepidodendron.entity.model.ModelBasePalaeopedia;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLiving;

public class ModelGansuselache extends ModelBasePalaeopedia {
    private final AdvancedModelRenderer base;
    private final AdvancedModelRenderer cube_r1;
    private final AdvancedModelRenderer cube_r2;
    private final AdvancedModelRenderer cube_r3;
    private final AdvancedModelRenderer cube_r4;
    private final AdvancedModelRenderer cube_r5;
    private final AdvancedModelRenderer cube_r6;
    private final AdvancedModelRenderer pectoralfinright;
    private final AdvancedModelRenderer pectoralfinleft;
    private final AdvancedModelRenderer body;
    private final AdvancedModelRenderer body2;
    private final AdvancedModelRenderer cube_r7;
    private final AdvancedModelRenderer cube_r8;
    private final AdvancedModelRenderer pelvicfinright;
    private final AdvancedModelRenderer pelvicfinleft;
    private final AdvancedModelRenderer body3;
    private final AdvancedModelRenderer cube_r9;
    private final AdvancedModelRenderer cube_r10;
    private final AdvancedModelRenderer cube_r11;
    private final AdvancedModelRenderer cube_r12;
    private final AdvancedModelRenderer body4;
    private final AdvancedModelRenderer cube_r13;
    private final AdvancedModelRenderer cube_r14;
    private final AdvancedModelRenderer jaw;
    private final AdvancedModelRenderer cube_r15;

    private ModelAnimator animator;

    public ModelGansuselache() {
        this.textureWidth = 48;
        this.textureHeight = 40;

        this.base = new AdvancedModelRenderer(this);
        this.base.setRotationPoint(0.0F, 22.45F, -5.9F);
        this.base.cubeList.add(new ModelBox(base, 0, 0, -2.5F, -3.7F, -0.1F, 5, 5, 5, 0.01F, false));
        this.base.cubeList.add(new ModelBox(base, 33, 24, -2.5F, -2.1F, -2.25F, 5, 1, 1, 0.02F, false));

        this.cube_r1 = new AdvancedModelRenderer(this);
        this.cube_r1.setRotationPoint(1.5F, 1.625F, 1.1F);
        this.base.addChild(cube_r1);
        this.setRotateAngle(cube_r1, -0.6545F, 0.0F, 0.0F);
        this.cube_r1.cubeList.add(new ModelBox(cube_r1, 0, 34, -4.0F, -2.0F, -3.5F, 5, 2, 2, -0.01F, false));

        this.cube_r2 = new AdvancedModelRenderer(this);
        this.cube_r2.setRotationPoint(1.5F, 0.0F, 0.0F);
        this.base.addChild(cube_r2);
        this.setRotateAngle(cube_r2, -0.2182F, 0.0F, 0.0F);
        this.cube_r2.cubeList.add(new ModelBox(cube_r2, 20, 0, -4.0F, -2.0F, -3.5F, 5, 2, 4, 0.0F, false));

        this.cube_r3 = new AdvancedModelRenderer(this);
        this.cube_r3.setRotationPoint(-1.0F, -2.45F, 6.65F);
        this.base.addChild(cube_r3);
        this.setRotateAngle(cube_r3, 0.3927F, 0.0F, 0.0F);
        this.cube_r3.cubeList.add(new ModelBox(cube_r3, 20, 2, 1.0F, -2.0F, -1.0F, 0, 2, 4, 0.0F, false));

        this.cube_r4 = new AdvancedModelRenderer(this);
        this.cube_r4.setRotationPoint(-0.5F, -2.95F, 3.65F);
        this.base.addChild(cube_r4);
        this.setRotateAngle(cube_r4, 0.3927F, 0.0F, 0.0F);
        this.cube_r4.cubeList.add(new ModelBox(cube_r4, 25, 23, 0.0F, -1.0F, -1.0F, 1, 1, 6, 0.0F, false));

        this.cube_r5 = new AdvancedModelRenderer(this);
        this.cube_r5.setRotationPoint(2.4F, -2.55F, -0.075F);
        this.base.addChild(cube_r5);
        this.setRotateAngle(cube_r5, 0.2618F, 0.0F, 0.0F);
        this.cube_r5.cubeList.add(new ModelBox(cube_r5, 0, 0, -1.0F, -1.0F, -1.5F, 1, 1, 1, -0.01F, true));
        this.cube_r5.cubeList.add(new ModelBox(cube_r5, 0, 0, -4.8F, -1.0F, -1.5F, 1, 1, 1, -0.01F, false));

        this.cube_r6 = new AdvancedModelRenderer(this);
        this.cube_r6.setRotationPoint(1.0F, -1.65F, -0.075F);
        this.base.addChild(cube_r6);
        this.setRotateAngle(cube_r6, 0.2618F, 0.0F, 0.0F);
        this.cube_r6.cubeList.add(new ModelBox(cube_r6, 26, 6, -3.0F, -2.0F, -3.5F, 4, 2, 4, -0.01F, false));

        this.pectoralfinright = new AdvancedModelRenderer(this);
        this.pectoralfinright.setRotationPoint(-2.5F, 0.3F, 2.15F);
        this.base.addChild(pectoralfinright);
        this.setRotateAngle(pectoralfinright, 0.0F, 0.0F, -0.5236F);
        this.pectoralfinright.cubeList.add(new ModelBox(pectoralfinright, 15, 18, -4.0F, 0.0F, -0.5F, 4, 0, 5, 0.0F, false));

        this.pectoralfinleft = new AdvancedModelRenderer(this);
        this.pectoralfinleft.setRotationPoint(2.5F, 0.3F, 2.15F);
        this.base.addChild(pectoralfinleft);
        this.setRotateAngle(pectoralfinleft, 0.0F, 0.0F, 0.5236F);
        this.pectoralfinleft.cubeList.add(new ModelBox(pectoralfinleft, 15, 18, 0.0F, 0.0F, -0.5F, 4, 0, 5, 0.0F, true));

        this.body = new AdvancedModelRenderer(this);
        this.body.setRotationPoint(0.0F, -1.2F, 4.9F);
        this.base.addChild(body);
        this.body.cubeList.add(new ModelBox(body, 0, 14, -2.0F, -2.5F, -0.5F, 4, 5, 6, 0.0F, false));

        this.body2 = new AdvancedModelRenderer(this);
        this.body2.setRotationPoint(0.0F, 0.0F, 5.5F);
        this.body.addChild(body2);


        this.cube_r7 = new AdvancedModelRenderer(this);
        this.cube_r7.setRotationPoint(0.5F, 2.2F, 0.15F);
        this.body2.addChild(cube_r7);
        this.setRotateAngle(cube_r7, 0.0436F, 0.0F, 0.0F);
        this.cube_r7.cubeList.add(new ModelBox(cube_r7, 15, 23, -2.0F, -1.0F, -1.0F, 3, 1, 5, -0.01F, false));

        this.cube_r8 = new AdvancedModelRenderer(this);
        this.cube_r8.setRotationPoint(0.5F, 1.7F, 0.15F);
        this.body2.addChild(cube_r8);
        this.setRotateAngle(cube_r8, -0.0873F, 0.0F, 0.0F);
        this.cube_r8.cubeList.add(new ModelBox(cube_r8, 15, 9, -2.0F, -4.0F, -1.0F, 3, 4, 5, 0.0F, false));

        this.pelvicfinright = new AdvancedModelRenderer(this);
        this.pelvicfinright.setRotationPoint(-1.0F, 2.2F, 1.65F);
        this.body2.addChild(pelvicfinright);
        this.setRotateAngle(pelvicfinright, 0.0F, 0.0F, 0.9163F);
        this.pelvicfinright.cubeList.add(new ModelBox(pelvicfinright, 0, 18, 0.0F, -0.75F, -0.75F, 0, 3, 7, 0.0F, false));

        this.pelvicfinleft = new AdvancedModelRenderer(this);
        this.pelvicfinleft.setRotationPoint(1.0F, 2.2F, 1.65F);
        this.body2.addChild(pelvicfinleft);
        this.setRotateAngle(pelvicfinleft, 0.0F, 0.0F, -0.9163F);
        this.pelvicfinleft.cubeList.add(new ModelBox(pelvicfinleft, 0, 18, 0.0F, -0.75F, -0.75F, 0, 3, 7, 0.0F, true));

        this.body3 = new AdvancedModelRenderer(this);
        this.body3.setRotationPoint(0.0F, 0.0F, 4.25F);
        this.body2.addChild(body3);


        this.cube_r9 = new AdvancedModelRenderer(this);
        this.cube_r9.setRotationPoint(0.0F, 1.85F, 0.5F);
        this.body3.addChild(cube_r9);
        this.setRotateAngle(cube_r9, 0.1309F, 0.0F, 0.0F);
        this.cube_r9.cubeList.add(new ModelBox(cube_r9, 31, 30, -1.0F, -1.0F, -1.0F, 2, 1, 4, -0.01F, false));

        this.cube_r10 = new AdvancedModelRenderer(this);
        this.cube_r10.setRotationPoint(-1.0F, -1.15F, 1.5F);
        this.body3.addChild(cube_r10);
        this.setRotateAngle(cube_r10, -0.7418F, 0.0F, 0.0F);
        this.cube_r10.cubeList.add(new ModelBox(cube_r10, 0, 0, 1.0F, -3.0F, -1.0F, 0, 3, 2, 0.0F, false));

        this.cube_r11 = new AdvancedModelRenderer(this);
        this.cube_r11.setRotationPoint(-0.5F, -1.15F, 0.75F);
        this.body3.addChild(cube_r11);
        this.setRotateAngle(cube_r11, -0.7418F, 0.0F, 0.0F);
        this.cube_r11.cubeList.add(new ModelBox(cube_r11, 0, 14, 0.0F, -3.0F, -1.0F, 1, 3, 1, 0.0F, false));

        this.cube_r12 = new AdvancedModelRenderer(this);
        this.cube_r12.setRotationPoint(0.0F, 1.25F, 0.5F);
        this.body3.addChild(cube_r12);
        this.setRotateAngle(cube_r12, -0.0873F, 0.0F, 0.0F);
        this.cube_r12.cubeList.add(new ModelBox(cube_r12, 12, 29, -1.0F, -3.0F, -1.0F, 2, 3, 4, 0.0F, false));

        this.body4 = new AdvancedModelRenderer(this);
        this.body4.setRotationPoint(0.0F, -0.15F, 3.5F);
        this.body3.addChild(body4);
        this.setRotateAngle(body4, 0.0873F, 0.0F, 0.0F);
        this.body4.cubeList.add(new ModelBox(body4, 28, 13, -0.5F, -1.2093F, -0.5673F, 1, 2, 5, 0.0F, false));

        this.cube_r13 = new AdvancedModelRenderer(this);
        this.cube_r13.setRotationPoint(-1.0F, 2.8907F, 3.1827F);
        this.body4.addChild(cube_r13);
        this.setRotateAngle(cube_r13, 0.2182F, 0.0F, 0.0F);
        this.cube_r13.cubeList.add(new ModelBox(cube_r13, 0, 0, 1.0F, -4.0F, -1.0F, 0, 4, 10, 0.0F, false));

        this.cube_r14 = new AdvancedModelRenderer(this);
        this.cube_r14.setRotationPoint(-0.5F, 1.2907F, 0.4327F);
        this.body4.addChild(cube_r14);
        this.setRotateAngle(cube_r14, 0.1309F, 0.0F, 0.0F);
        this.cube_r14.cubeList.add(new ModelBox(cube_r14, 24, 30, 0.0F, -1.0F, -1.0F, 1, 1, 5, -0.01F, false));

        this.jaw = new AdvancedModelRenderer(this);
        this.jaw.setRotationPoint(0.0F, 0.25F, 0.0F);
        this.base.addChild(jaw);
        this.setRotateAngle(jaw, -0.1745F, 0.0F, 0.0F);
        this.jaw.cubeList.add(new ModelBox(jaw, 0, 28, -2.0F, -0.5F, -3.25F, 4, 1, 4, 0.0F, false));

        this.cube_r15 = new AdvancedModelRenderer(this);
        this.cube_r15.setRotationPoint(0.5F, 0.5F, -2.25F);
        this.jaw.addChild(cube_r15);
        this.setRotateAngle(cube_r15, -0.1309F, 0.0F, 0.0F);
        this.cube_r15.cubeList.add(new ModelBox(cube_r15, 33, 20, -2.0F, -1.0F, 0.0F, 3, 1, 3, -0.01F, false));

        updateDefaultPose();
        animator = ModelAnimator.create();
    }

    @Override
    public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        animate((IAnimatedEntity) entity, f, f1, f2, f3, f4, f5);
        this.base.render(f5);
    }
    public void renderStaticFloor(float f) {
        this.setRotateAngle(base, 0.0F, 0.0F, -0.2F);
        this.setRotateAngle(body, 0.0F, 0.1F, 0.0F);
        this.setRotateAngle(body2, 0.0F, 0.1F, 0.0F);
        this.setRotateAngle(body3, 0.0F, 0.2F, 0.0F);
        this.setRotateAngle(body4, 0.0F, 0.2F, 0.0F);
        this.setRotateAngle(jaw, 0.0F, 0.0F, 0.0F);
        this.base.offsetZ = -0.01F;
        this.base.offsetY = -0.145F;
        this.base.render(0.01F);
        this.resetToDefaultPose();
    }

    @Override
    public void renderStaticBook(float f) {
        //Rotations, positions and sizing:
        this.base.offsetY = -1.2F;
        this.base.offsetX = 1.05F;
        this.base.rotateAngleY = (float)Math.toRadians(245);
        this.base.rotateAngleX = (float)Math.toRadians(8);
        this.base.rotateAngleZ = (float)Math.toRadians(-8);
        this.base.scaleChildren = true;
        float scaler = 2.0F;
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
        //this.body.offsetY = 1.4F;
        //this.body.offsetZ = -0.65F;

        AdvancedModelRenderer[] fishTail = {this.body2, this.body3, this.body4};
        float speed = 0.4F;
        EntityPrehistoricFloraAgeableBase ee = (EntityPrehistoricFloraAgeableBase) e;
        if (!e.isInWater()) {
            speed = 0.7F;
        }
        if (e instanceof EntityLiving && !((EntityLiving) e).isAIDisabled()) {
            this.chainWave(fishTail, speed, 0.06F, -3, f2, 0.6F);
            this.chainSwing(fishTail, speed, 0.65F, -3, f2, 0.7F);
            this.swing(body, speed, 0.1F, true, 0, 0, f2, 0.5F);
            this.flap(pectoralfinleft, (float) (speed ), 0.5F, true, 0, 0, f2, 0.5F);
            this.swing(pectoralfinleft, (float) (speed), 0.2F, true, 0, 0, f2, 0.5F);
            this.flap(pectoralfinright, (float) (speed), 0.5F, true, -3, 0, f2, 0.5F);
            this.swing(pectoralfinright, (float) (speed), 0.2F, true, -3, 0, f2, 0.5F);
            this.flap(pelvicfinleft, (float) (speed * 0.75), 0.3F, true, 1, 0, f2, 0.5F);
            this.flap(pelvicfinright, (float) (speed * 0.75), 0.3F, true, 1, 0, f2, 0.5F);

            if (!e.isInWater()) {
                this.base.rotateAngleZ = (float) Math.toRadians(90);

                //this.base.offsetY = 1.25F;
                this.base.offsetZ = -0.2F;
                this.bob(base, -speed, 2F, false, f2, 1);
            }
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
        animator.setStaticKeyframe(4);
        animator.resetKeyframe(3);
    }


}