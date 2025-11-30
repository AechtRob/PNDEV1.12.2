package net.lepidodendron.entity.model.entity;

import net.ilexiconn.llibrary.client.model.ModelAnimator;
import net.ilexiconn.llibrary.client.model.tools.AdvancedModelRenderer;
import net.ilexiconn.llibrary.server.animation.IAnimatedEntity;
import net.lepidodendron.entity.EntityPrehistoricFloraTriodus;
import net.lepidodendron.entity.base.EntityPrehistoricFloraAgeableBase;
import net.lepidodendron.entity.model.ModelBasePalaeopedia;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

public class ModelTriodus extends ModelBasePalaeopedia {
    private final AdvancedModelRenderer base;
    private final AdvancedModelRenderer cube_r1;
    private final AdvancedModelRenderer cube_r2;
    private final AdvancedModelRenderer cube_r3;
    private final AdvancedModelRenderer cube_r4;
    private final AdvancedModelRenderer cube_r5;
    private final AdvancedModelRenderer cube_r6;
    private final AdvancedModelRenderer cube_r7;
    private final AdvancedModelRenderer pectoralfinright;
    private final AdvancedModelRenderer pectoralfinleft;
    private final AdvancedModelRenderer body;
    private final AdvancedModelRenderer body2;
    private final AdvancedModelRenderer cube_r8;
    private final AdvancedModelRenderer pelvicfinright;
    private final AdvancedModelRenderer pelvicfinleft;
    private final AdvancedModelRenderer body3;
    private final AdvancedModelRenderer cube_r9;
    private final AdvancedModelRenderer cube_r10;
    private final AdvancedModelRenderer body4;
    private final AdvancedModelRenderer cube_r11;
    private final AdvancedModelRenderer cube_r12;
    private final AdvancedModelRenderer cube_r13;
    private final AdvancedModelRenderer cube_r14;
    private final AdvancedModelRenderer cube_r15;
    private final AdvancedModelRenderer body5;
    private final AdvancedModelRenderer jaw;
    private final AdvancedModelRenderer cube_r16;

    private ModelAnimator animator;

    public ModelTriodus() {
        this.textureWidth = 48;
        this.textureHeight = 48;

        this.base = new AdvancedModelRenderer(this);
        this.base.setRotationPoint(0.0F, 21.85F, -5.05F);
        this.base.cubeList.add(new ModelBox(base, 26, 7, -1.025F, -2.9F, -6.1F, 1, 1, 1, 0.0F, false));
        this.base.cubeList.add(new ModelBox(base, 26, 7, 0.025F, -2.9F, -6.1F, 1, 1, 1, 0.0F, true));

        this.cube_r1 = new AdvancedModelRenderer(this);
        this.cube_r1.setRotationPoint(0.0F, -2.075F, -5.7F);
        this.base.addChild(cube_r1);
        this.setRotateAngle(cube_r1, 0.3229F, 0.0F, 0.0F);
        this.cube_r1.cubeList.add(new ModelBox(cube_r1, 18, 40, -1.0F, -1.0F, -1.0F, 2, 1, 2, 0.0F, false));

        this.cube_r2 = new AdvancedModelRenderer(this);
        this.cube_r2.setRotationPoint(0.0F, -1.65F, -5.5F);
        this.base.addChild(cube_r2);
        this.setRotateAngle(cube_r2, -0.1396F, 0.0F, 0.0F);
        this.cube_r2.cubeList.add(new ModelBox(cube_r2, 40, 13, -1.0F, -1.0F, -1.0F, 2, 1, 2, -0.01F, false));

        this.cube_r3 = new AdvancedModelRenderer(this);
        this.cube_r3.setRotationPoint(0.275F, -1.425F, -3.775F);
        this.base.addChild(cube_r3);
        this.setRotateAngle(cube_r3, 0.0873F, 0.0F, 0.0F);
        this.cube_r3.cubeList.add(new ModelBox(cube_r3, 18, 36, 0.0F, -2.0F, -1.0F, 1, 2, 2, 0.0F, true));
        this.cube_r3.cubeList.add(new ModelBox(cube_r3, 40, 35, -0.8F, -1.0F, -1.0F, 1, 1, 2, 0.01F, false));
        this.cube_r3.cubeList.add(new ModelBox(cube_r3, 18, 36, -1.55F, -2.0F, -1.0F, 1, 2, 2, 0.0F, false));

        this.cube_r4 = new AdvancedModelRenderer(this);
        this.cube_r4.setRotationPoint(0.0F, -2.45F, -3.975F);
        this.base.addChild(cube_r4);
        this.setRotateAngle(cube_r4, 0.1178F, 0.0F, 0.0F);
        this.cube_r4.cubeList.add(new ModelBox(cube_r4, 40, 16, -1.0F, -1.0F, -1.0F, 2, 1, 2, 0.01F, false));

        this.cube_r5 = new AdvancedModelRenderer(this);
        this.cube_r5.setRotationPoint(0.0F, -0.8F, 0.05F);
        this.base.addChild(cube_r5);
        this.setRotateAngle(cube_r5, 0.0567F, 0.0F, 0.0F);
        this.cube_r5.cubeList.add(new ModelBox(cube_r5, 0, 19, -1.5F, -3.0F, -3.0F, 3, 3, 4, 0.01F, false));

        this.cube_r6 = new AdvancedModelRenderer(this);
        this.cube_r6.setRotationPoint(0.0F, -1.1F, -2.05F);
        this.base.addChild(cube_r6);
        this.setRotateAngle(cube_r6, 0.4363F, 0.0F, 0.0F);
        this.cube_r6.cubeList.add(new ModelBox(cube_r6, 0, 35, 0.0F, -3.0F, -1.0F, 0, 1, 5, 0.0F, false));

        this.cube_r7 = new AdvancedModelRenderer(this);
        this.cube_r7.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.base.addChild(cube_r7);
        this.setRotateAngle(cube_r7, -0.0785F, 0.0F, 0.0F);
        this.cube_r7.cubeList.add(new ModelBox(cube_r7, 26, 29, -1.5F, -1.0F, -3.0F, 3, 1, 4, 0.0F, false));

        this.pectoralfinright = new AdvancedModelRenderer(this);
        this.pectoralfinright.setRotationPoint(-1.25F, -0.6F, -0.8F);
        this.base.addChild(pectoralfinright);
        this.setRotateAngle(pectoralfinright, -0.1745F, 0.0F, 0.8727F);
        this.pectoralfinright.cubeList.add(new ModelBox(pectoralfinright, 14, 21, 0.0F, 0.0F, 0.0F, 0, 3, 6, 0.0F, false));

        this.pectoralfinleft = new AdvancedModelRenderer(this);
        this.pectoralfinleft.setRotationPoint(1.25F, -0.6F, -0.8F);
        this.base.addChild(pectoralfinleft);
        this.setRotateAngle(pectoralfinleft, -0.1745F, 0.0F, -0.8727F);
        this.pectoralfinleft.cubeList.add(new ModelBox(pectoralfinleft, 14, 21, 0.0F, 0.0F, 0.0F, 0, 3, 6, 0.0F, true));

        this.body = new AdvancedModelRenderer(this);
        this.body.setRotationPoint(0.0F, -2.25F, 1.0F);
        this.base.addChild(body);
        this.body.cubeList.add(new ModelBox(body, 34, 0, 0.0F, -3.6F, -0.05F, 0, 2, 5, 0.0F, false));
        this.body.cubeList.add(new ModelBox(body, 0, 0, -1.5F, -1.65F, -0.5F, 3, 4, 6, 0.02F, false));

        this.body2 = new AdvancedModelRenderer(this);
        this.body2.setRotationPoint(0.0F, 0.0F, 5.0F);
        this.body.addChild(body2);
        this.body2.cubeList.add(new ModelBox(body2, 0, 10, -1.0F, -1.65F, 0.0F, 2, 3, 6, 0.0F, false));
        this.body2.cubeList.add(new ModelBox(body2, 26, 21, 0.0F, -3.6F, -0.05F, 0, 2, 6, 0.0F, false));

        this.cube_r8 = new AdvancedModelRenderer(this);
        this.cube_r8.setRotationPoint(-0.5F, 1.15F, 0.9F);
        this.body2.addChild(cube_r8);
        this.setRotateAngle(cube_r8, 0.144F, 0.0F, 0.0F);
        this.cube_r8.cubeList.add(new ModelBox(cube_r8, 18, 0, -0.5F, 0.0F, -1.0F, 2, 1, 6, -0.01F, false));

        this.pelvicfinright = new AdvancedModelRenderer(this);
        this.pelvicfinright.setRotationPoint(-1.0F, 1.65F, 2.7F);
        this.body2.addChild(pelvicfinright);
        this.setRotateAngle(pelvicfinright, 0.1309F, 0.0F, 0.48F);
        this.pelvicfinright.cubeList.add(new ModelBox(pelvicfinright, 0, 26, 0.0F, -0.5F, 0.0F, 0, 3, 6, 0.0F, false));

        this.pelvicfinleft = new AdvancedModelRenderer(this);
        this.pelvicfinleft.setRotationPoint(1.0F, 1.65F, 2.7F);
        this.body2.addChild(pelvicfinleft);
        this.setRotateAngle(pelvicfinleft, 0.1309F, 0.0F, -0.48F);
        this.pelvicfinleft.cubeList.add(new ModelBox(pelvicfinleft, 0, 26, 0.0F, -0.5F, 0.0F, 0, 3, 6, 0.0F, true));

        this.body3 = new AdvancedModelRenderer(this);
        this.body3.setRotationPoint(0.0F, -0.1F, 6.0F);
        this.body2.addChild(body3);
        this.body3.cubeList.add(new ModelBox(body3, 30, 13, 0.0F, -3.25F, -0.05F, 0, 2, 5, 0.0F, false));

        this.cube_r9 = new AdvancedModelRenderer(this);
        this.cube_r9.setRotationPoint(-0.25F, 0.55F, 0.65F);
        this.body3.addChild(cube_r9);
        this.setRotateAngle(cube_r9, -0.0436F, 0.0F, 0.0F);
        this.cube_r9.cubeList.add(new ModelBox(cube_r9, 24, 34, 0.0F, -2.0F, -1.0F, 1, 2, 4, 0.0F, true));
        this.cube_r9.cubeList.add(new ModelBox(cube_r9, 24, 34, -0.5F, -2.0F, -1.0F, 1, 2, 4, 0.0F, false));

        this.cube_r10 = new AdvancedModelRenderer(this);
        this.cube_r10.setRotationPoint(-0.275F, 1.35F, 0.675F);
        this.body3.addChild(cube_r10);
        this.setRotateAngle(cube_r10, 0.1047F, 0.0F, 0.0F);
        this.cube_r10.cubeList.add(new ModelBox(cube_r10, 34, 34, 0.0F, -2.0F, -1.0F, 1, 2, 4, 0.0F, true));
        this.cube_r10.cubeList.add(new ModelBox(cube_r10, 34, 34, -0.45F, -2.0F, -1.0F, 1, 2, 4, 0.0F, false));

        this.body4 = new AdvancedModelRenderer(this);
        this.body4.setRotationPoint(0.0F, -0.3F, 3.65F);
        this.body3.addChild(body4);
        this.body4.cubeList.add(new ModelBox(body4, 10, 36, 0.0F, -2.8F, 0.5F, 0, 2, 4, 0.0F, false));

        this.cube_r11 = new AdvancedModelRenderer(this);
        this.cube_r11.setRotationPoint(-0.5F, 1.35F, 0.4F);
        this.body4.addChild(cube_r11);
        this.setRotateAngle(cube_r11, 0.1396F, 0.0F, 0.0F);
        this.cube_r11.cubeList.add(new ModelBox(cube_r11, 38, 24, 0.0F, -1.75F, -0.75F, 1, 1, 3, 0.01F, false));

        this.cube_r12 = new AdvancedModelRenderer(this);
        this.cube_r12.setRotationPoint(-0.5F, 1.2F, 0.6F);
        this.body4.addChild(cube_r12);
        this.setRotateAngle(cube_r12, 0.1396F, 0.0F, 0.0F);
        this.cube_r12.cubeList.add(new ModelBox(cube_r12, 12, 30, 0.0F, -1.0F, -0.975F, 1, 1, 5, -0.01F, false));

        this.cube_r13 = new AdvancedModelRenderer(this);
        this.cube_r13.setRotationPoint(0.0F, 0.95F, 2.25F);
        this.body4.addChild(cube_r13);
        this.setRotateAngle(cube_r13, 1.1345F, 0.0F, 0.0F);
        this.cube_r13.cubeList.add(new ModelBox(cube_r13, 24, 30, 0.0F, 0.0F, 0.0F, 0, 2, 1, 0.0F, false));

        this.cube_r14 = new AdvancedModelRenderer(this);
        this.cube_r14.setRotationPoint(0.0F, 1.3F, 0.0F);
        this.body4.addChild(cube_r14);
        this.setRotateAngle(cube_r14, 1.1345F, 0.0F, 0.0F);
        this.cube_r14.cubeList.add(new ModelBox(cube_r14, 12, 26, 0.0F, 0.0F, 0.0F, 0, 2, 1, 0.0F, false));

        this.cube_r15 = new AdvancedModelRenderer(this);
        this.cube_r15.setRotationPoint(-0.5F, 0.0F, 0.5F);
        this.body4.addChild(cube_r15);
        this.setRotateAngle(cube_r15, -0.0349F, 0.0F, 0.0F);
        this.cube_r15.cubeList.add(new ModelBox(cube_r15, 30, 7, 0.0F, -1.0F, -1.0F, 1, 1, 5, 0.0F, false));

        this.body5 = new AdvancedModelRenderer(this);
        this.body5.setRotationPoint(0.0F, -0.3F, 4.5F);
        this.body4.addChild(body5);
        this.body5.cubeList.add(new ModelBox(body5, 16, 10, 0.0F, -2.5F, 0.0F, 0, 4, 7, 0.0F, false));

        this.jaw = new AdvancedModelRenderer(this);
        this.jaw.setRotationPoint(0.0F, -1.55F, -2.65F);
        this.base.addChild(jaw);
        this.setRotateAngle(jaw, -0.2182F, 0.0F, 0.0F);
        this.jaw.cubeList.add(new ModelBox(jaw, 38, 20, -1.0F, -0.75F, -1.775F, 2, 2, 2, 0.0F, false));

        this.cube_r16 = new AdvancedModelRenderer(this);
        this.cube_r16.setRotationPoint(0.0F, 1.25F, -1.75F);
        this.jaw.addChild(cube_r16);
        this.setRotateAngle(cube_r16, -0.1309F, 0.0F, 0.0F);
        this.cube_r16.cubeList.add(new ModelBox(cube_r16, 26, 40, -1.0F, -1.0F, -2.0F, 2, 1, 2, -0.02F, false));

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
        this.base.offsetY = -0.50F;
        this.base.offsetX = -0.3F;
        this.base.rotateAngleY = (float)Math.toRadians(130);
        this.base.rotateAngleX = (float)Math.toRadians(9);
        this.base.rotateAngleZ = (float)Math.toRadians(-2);
        this.base.scaleChildren = true;
        float scaler = 1.4F;
        this.base.setScale(scaler, scaler, scaler);
        //Start of pose:
        this.setRotateAngle(base, 0.2F, 2.5F, 0.0F);
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

        AdvancedModelRenderer[] fishTail = {this.body2, this.body3, this.body4, this.body5};
        ((EntityPrehistoricFloraTriodus)e).tailBuffer.applyChainSwingBuffer(fishTail);

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

