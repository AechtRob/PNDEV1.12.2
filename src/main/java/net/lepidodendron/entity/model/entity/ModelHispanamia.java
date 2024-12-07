package net.lepidodendron.entity.model.entity;

import net.ilexiconn.llibrary.client.model.ModelAnimator;
import net.ilexiconn.llibrary.client.model.tools.AdvancedModelRenderer;
import net.ilexiconn.llibrary.server.animation.IAnimatedEntity;
import net.lepidodendron.entity.EntityPrehistoricFloraHispanamia;
import net.lepidodendron.entity.base.EntityPrehistoricFloraAgeableBase;
import net.lepidodendron.entity.model.ModelBasePalaeopedia;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

public class ModelHispanamia extends ModelBasePalaeopedia {
    private final AdvancedModelRenderer base;
    private final AdvancedModelRenderer cube_r1;
    private final AdvancedModelRenderer cube_r2;
    private final AdvancedModelRenderer cube_r3;
    private final AdvancedModelRenderer cube_r4;
    private final AdvancedModelRenderer cube_r5;
    private final AdvancedModelRenderer cube_r6;
    private final AdvancedModelRenderer cube_r7;
    private final AdvancedModelRenderer cube_r8;
    private final AdvancedModelRenderer body;
    private final AdvancedModelRenderer cube_r9;
    private final AdvancedModelRenderer cube_r10;
    private final AdvancedModelRenderer pelvicfinright;
    private final AdvancedModelRenderer pelvicfinleft;
    private final AdvancedModelRenderer body2;
    private final AdvancedModelRenderer cube_r11;
    private final AdvancedModelRenderer cube_r12;
    private final AdvancedModelRenderer cube_r13;
    private final AdvancedModelRenderer body3;
    private final AdvancedModelRenderer cube_r14;
    private final AdvancedModelRenderer cube_r15;
    private final AdvancedModelRenderer cube_r16;
    private final AdvancedModelRenderer body4;
    private final AdvancedModelRenderer cube_r17;
    private final AdvancedModelRenderer cube_r18;
    private final AdvancedModelRenderer pectoralfinright;
    private final AdvancedModelRenderer pectoralfinleft;
    private final AdvancedModelRenderer jaw;

    private ModelAnimator animator;

    public ModelHispanamia() {
        this.textureWidth = 48;
        this.textureHeight = 48;

        this.base = new AdvancedModelRenderer(this);
        this.base.setRotationPoint(0.0F, 27.0F, -1.0F);
        this.base.cubeList.add(new ModelBox(base, 28, 19, -2.0F, -8.15F, -4.25F, 4, 5, 2, 0.01F, false));

        this.cube_r1 = new AdvancedModelRenderer(this);
        this.cube_r1.setRotationPoint(0.0F, -5.1F, -2.4F);
        this.base.addChild(cube_r1);
        this.setRotateAngle(cube_r1, -0.1745F, 0.0F, 0.0F);
        this.cube_r1.cubeList.add(new ModelBox(cube_r1, 10, 43, -1.0F, -1.0F, -5.0F, 2, 1, 1, 0.02F, false));

        this.cube_r2 = new AdvancedModelRenderer(this);
        this.cube_r2.setRotationPoint(0.0F, -7.925F, -3.75F);
        this.base.addChild(cube_r2);
        this.setRotateAngle(cube_r2, 0.384F, 0.0F, 0.0F);
        this.cube_r2.cubeList.add(new ModelBox(cube_r2, 34, 32, -1.0F, -0.025F, -3.8F, 2, 3, 3, 0.0F, false));
        this.cube_r2.cubeList.add(new ModelBox(cube_r2, 0, 27, -1.0F, -1.0F, -4.9F, 2, 1, 5, 0.005F, false));

        this.cube_r3 = new AdvancedModelRenderer(this);
        this.cube_r3.setRotationPoint(1.725F, -3.6F, -4.95F);
        this.base.addChild(cube_r3);
        this.setRotateAngle(cube_r3, -0.48F, 0.1745F, 0.0F);
        this.cube_r3.cubeList.add(new ModelBox(cube_r3, 10, 38, -1.0F, -1.0F, -5.1F, 1, 1, 4, 0.01F, true));

        this.cube_r4 = new AdvancedModelRenderer(this);
        this.cube_r4.setRotationPoint(-1.725F, -3.6F, -4.95F);
        this.base.addChild(cube_r4);
        this.setRotateAngle(cube_r4, -0.48F, -0.1745F, 0.0F);
        this.cube_r4.cubeList.add(new ModelBox(cube_r4, 10, 38, 0.0F, -1.0F, -5.1F, 1, 1, 4, 0.01F, false));

        this.cube_r5 = new AdvancedModelRenderer(this);
        this.cube_r5.setRotationPoint(0.0F, -6.55F, -8.75F);
        this.base.addChild(cube_r5);
        this.setRotateAngle(cube_r5, -0.2618F, -0.3491F, 0.0F);
        this.cube_r5.cubeList.add(new ModelBox(cube_r5, 19, 10, 0.0F, 0.0F, -1.0F, 1, 0, 1, 0.0F, true));

        this.cube_r6 = new AdvancedModelRenderer(this);
        this.cube_r6.setRotationPoint(0.0F, -6.55F, -8.75F);
        this.base.addChild(cube_r6);
        this.setRotateAngle(cube_r6, -0.2618F, 0.3491F, 0.0F);
        this.cube_r6.cubeList.add(new ModelBox(cube_r6, 19, 10, -1.0F, 0.0F, -1.0F, 1, 0, 1, 0.0F, false));

        this.cube_r7 = new AdvancedModelRenderer(this);
        this.cube_r7.setRotationPoint(0.0F, -4.3F, -4.5F);
        this.base.addChild(cube_r7);
        this.setRotateAngle(cube_r7, -0.3927F, 0.0F, 0.0F);
        this.cube_r7.cubeList.add(new ModelBox(cube_r7, 32, 9, -1.0F, -1.0F, -5.0F, 2, 1, 4, 0.01F, false));

        this.cube_r8 = new AdvancedModelRenderer(this);
        this.cube_r8.setRotationPoint(0.5F, -4.15F, -3.95F);
        this.base.addChild(cube_r8);
        this.setRotateAngle(cube_r8, -0.2182F, 0.0F, 0.0F);
        this.cube_r8.cubeList.add(new ModelBox(cube_r8, 14, 31, -2.0F, -4.0F, -2.0F, 3, 5, 2, 0.0F, false));

        this.body = new AdvancedModelRenderer(this);
        this.body.setRotationPoint(0.0F, -6.85F, -2.95F);
        this.base.addChild(body);
        this.body.cubeList.add(new ModelBox(body, 0, 0, -2.0F, -1.9F, -0.05F, 4, 5, 6, 0.0F, false));

        this.cube_r9 = new AdvancedModelRenderer(this);
        this.cube_r9.setRotationPoint(0.0F, -0.8F, 2.25F);
        this.body.addChild(cube_r9);
        this.setRotateAngle(cube_r9, 0.2182F, 0.0F, 0.0F);
        this.cube_r9.cubeList.add(new ModelBox(cube_r9, 0, 11, -1.5F, -2.0F, -3.0F, 3, 2, 7, 0.01F, false));

        this.cube_r10 = new AdvancedModelRenderer(this);
        this.cube_r10.setRotationPoint(-0.5F, 3.725F, 0.925F);
        this.body.addChild(cube_r10);
        this.setRotateAngle(cube_r10, -0.0262F, 0.0F, 0.0F);
        this.cube_r10.cubeList.add(new ModelBox(cube_r10, 0, 20, -1.0F, -1.0F, -1.0F, 3, 1, 6, 0.0F, false));

        this.pelvicfinright = new AdvancedModelRenderer(this);
        this.pelvicfinright.setRotationPoint(-0.75F, 3.6F, 4.95F);
        this.body.addChild(pelvicfinright);
        this.setRotateAngle(pelvicfinright, 0.8727F, 0.0F, 0.3927F);
        this.pelvicfinright.cubeList.add(new ModelBox(pelvicfinright, 14, 27, 0.0F, -0.35F, -0.25F, 0, 3, 1, 0.0F, false));

        this.pelvicfinleft = new AdvancedModelRenderer(this);
        this.pelvicfinleft.setRotationPoint(0.75F, 3.6F, 4.95F);
        this.body.addChild(pelvicfinleft);
        this.setRotateAngle(pelvicfinleft, 0.8727F, 0.0F, -0.3927F);
        this.pelvicfinleft.cubeList.add(new ModelBox(pelvicfinleft, 14, 27, 0.0F, -0.35F, -0.25F, 0, 3, 1, 0.0F, true));

        this.body2 = new AdvancedModelRenderer(this);
        this.body2.setRotationPoint(0.0F, 0.2F, 6.0F);
        this.body.addChild(body2);
        this.body2.cubeList.add(new ModelBox(body2, 20, 0, -1.5F, -2.475F, -1.025F, 3, 5, 4, 0.0F, false));

        this.cube_r11 = new AdvancedModelRenderer(this);
        this.cube_r11.setRotationPoint(0.0F, -0.075F, 3.1F);
        this.body2.addChild(cube_r11);
        this.setRotateAngle(cube_r11, 0.5585F, 0.0F, 0.0F);
        this.cube_r11.cubeList.add(new ModelBox(cube_r11, 20, 9, 0.0F, -5.0F, -1.0F, 0, 4, 6, 0.0F, false));

        this.cube_r12 = new AdvancedModelRenderer(this);
        this.cube_r12.setRotationPoint(0.0F, -1.575F, -0.05F);
        this.body2.addChild(cube_r12);
        this.setRotateAngle(cube_r12, -0.1833F, 0.0F, 0.0F);
        this.cube_r12.cubeList.add(new ModelBox(cube_r12, 28, 26, -1.0F, -2.0F, -1.0F, 2, 2, 4, 0.0F, false));

        this.cube_r13 = new AdvancedModelRenderer(this);
        this.cube_r13.setRotationPoint(0.0F, 3.525F, -0.025F);
        this.body2.addChild(cube_r13);
        this.setRotateAngle(cube_r13, 0.0873F, 0.0F, 0.0F);
        this.cube_r13.cubeList.add(new ModelBox(cube_r13, 34, 0, -1.0F, -1.0F, -1.0F, 2, 1, 4, 0.0F, false));

        this.body3 = new AdvancedModelRenderer(this);
        this.body3.setRotationPoint(0.0F, -0.325F, 2.95F);
        this.body2.addChild(body3);
        this.body3.cubeList.add(new ModelBox(body3, 24, 32, -1.0F, -1.65F, -0.5F, 2, 4, 3, 0.0F, false));

        this.cube_r14 = new AdvancedModelRenderer(this);
        this.cube_r14.setRotationPoint(0.0F, -1.55F, 0.5F);
        this.body3.addChild(cube_r14);
        this.setRotateAngle(cube_r14, -0.1309F, 0.0F, 0.0F);
        this.cube_r14.cubeList.add(new ModelBox(cube_r14, 34, 5, -1.0F, -1.0F, -1.0F, 2, 1, 3, -0.01F, false));

        this.cube_r15 = new AdvancedModelRenderer(this);
        this.cube_r15.setRotationPoint(0.0F, 3.3F, 1.0F);
        this.body3.addChild(cube_r15);
        this.setRotateAngle(cube_r15, 1.0036F, 0.0F, 0.0F);
        this.cube_r15.cubeList.add(new ModelBox(cube_r15, 40, 19, 0.0F, -1.3F, -1.0F, 0, 4, 3, 0.0F, false));

        this.cube_r16 = new AdvancedModelRenderer(this);
        this.cube_r16.setRotationPoint(0.0F, 3.3F, 0.6F);
        this.body3.addChild(cube_r16);
        this.setRotateAngle(cube_r16, 0.2182F, 0.0F, 0.0F);
        this.cube_r16.cubeList.add(new ModelBox(cube_r16, 0, 40, -1.0F, -2.0F, -1.0F, 2, 2, 3, -0.01F, false));

        this.body4 = new AdvancedModelRenderer(this);
        this.body4.setRotationPoint(0.0F, -0.05F, 2.5F);
        this.body3.addChild(body4);
        this.body4.cubeList.add(new ModelBox(body4, 0, 33, -0.5F, -1.2F, -1.0F, 1, 3, 4, 0.01F, false));
        this.body4.cubeList.add(new ModelBox(body4, 18, 20, 0.0F, -2.95F, 1.75F, 0, 6, 5, 0.0F, false));

        this.cube_r17 = new AdvancedModelRenderer(this);
        this.cube_r17.setRotationPoint(-0.5F, -1.125F, -0.1F);
        this.body4.addChild(cube_r17);
        this.setRotateAngle(cube_r17, -0.0873F, 0.0F, 0.0F);
        this.cube_r17.cubeList.add(new ModelBox(cube_r17, 20, 39, 0.0F, -1.0F, -1.0F, 1, 1, 4, 0.0F, false));

        this.cube_r18 = new AdvancedModelRenderer(this);
        this.cube_r18.setRotationPoint(-0.5F, 2.8F, 0.0F);
        this.body4.addChild(cube_r18);
        this.setRotateAngle(cube_r18, 0.2182F, 0.0F, 0.0F);
        this.cube_r18.cubeList.add(new ModelBox(cube_r18, 34, 38, 0.0F, -1.0F, -1.0F, 1, 1, 4, 0.0F, false));

        this.pectoralfinright = new AdvancedModelRenderer(this);
        this.pectoralfinright.setRotationPoint(-2.0F, -3.15F, -2.25F);
        this.base.addChild(pectoralfinright);
        this.setRotateAngle(pectoralfinright, -0.4363F, -0.3054F, 0.0F);
        this.pectoralfinright.cubeList.add(new ModelBox(pectoralfinright, 40, 26, 0.0F, -1.5F, -0.25F, 0, 2, 3, 0.0F, false));

        this.pectoralfinleft = new AdvancedModelRenderer(this);
        this.pectoralfinleft.setRotationPoint(2.0F, -3.15F, -2.25F);
        this.base.addChild(pectoralfinleft);
        this.setRotateAngle(pectoralfinleft, -0.4363F, 0.3054F, 0.0F);
        this.pectoralfinleft.cubeList.add(new ModelBox(pectoralfinleft, 40, 26, 0.0F, -1.5F, -0.25F, 0, 2, 3, 0.0F, true));

        this.jaw = new AdvancedModelRenderer(this);
        this.jaw.setRotationPoint(0.0F, -4.2F, -5.95F);
        this.base.addChild(jaw);
        this.setRotateAngle(jaw, -0.4363F, 0.0F, 0.0F);
        this.jaw.cubeList.add(new ModelBox(jaw, 32, 14, -1.0F, -0.475F, -3.5F, 2, 1, 4, -0.01F, false));

        updateDefaultPose();
        animator = ModelAnimator.create();
    }

    @Override
    public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        animate((IAnimatedEntity) entity, f, f1, f2, f3, f4, f5);
        this.base.render(f5);
    }

    @Override
    public void renderStaticBook(float f) {
        //Rotations, positions and sizing:
        this.base.offsetY = -0.30F;
        this.base.offsetX = 1.2F;
        this.base.rotateAngleY = (float)Math.toRadians(130);
        this.base.rotateAngleX = (float)Math.toRadians(0);
        this.base.rotateAngleZ = (float)Math.toRadians(0);
        this.base.scaleChildren = true;
        float scaler = 2.0F;
        this.base.setScale(scaler, scaler, scaler);
        //Start of pose:
        this.setRotateAngle(base, 0.0F, 0.0F, 0.0F);
        this.setRotateAngle(body, 0.0F, 0.0F, 0.0F);
        this.setRotateAngle(body2, 0.0F, 0.0F, 0.0F);
        this.setRotateAngle(body3, 0.0F, 0.0F, 0.0F);
        this.setRotateAngle(body4, 0.0F, 0.0F, 0.0F);
        //End of pose, now render the model:
        this.base.render(f);
        //Reset rotations, positions and sizing:
        this.base.setScale(1.0F, 1.0F, 1.0F);
        this.base.scaleChildren = false;
        resetToDefaultPose();
    }

    public void renderStaticWall(float f) {
        this.base.rotateAngleY = (float) Math.toRadians(90);
        this.setRotateAngle(jaw, 0.4F, 0.0F, 0.0F);
        this.base.offsetX = -0.03F;
        this.base.offsetY = -0.22F;
        this.base.offsetZ = -0.215F;
        this.base.render(0.01F);
        this.resetToDefaultPose();
    }

    public void renderStaticFloor(float f) {
        this.setRotateAngle(base, -0.2F, 0.2F, 0.05F);
        this.setRotateAngle(body, 0.0F, 0.2F, 0.0F);
        this.setRotateAngle(body2, 0.0F, 0.2F, 0.0F);
        this.setRotateAngle(body3, 0.0F, 0.2F, 0.0F);
        this.setRotateAngle(body4, 0.0F, 0.2F, 0.0F);
        this.base.offsetY = -0.18F;
        this.base.offsetX = -0.01F;
        this.base.render(0.01F);
        this.resetToDefaultPose();
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

        //this.head.offsetY = 0.8F;

        AdvancedModelRenderer[] fishTail = {this.body2, this.body3, this.body4};
        ((EntityPrehistoricFloraHispanamia)e).tailBuffer.applyChainSwingBuffer(fishTail);

        float speed = 0.186F;
        EntityPrehistoricFloraAgeableBase ee = (EntityPrehistoricFloraAgeableBase) e;
        if (ee.getIsFast()) {
            speed = speed * 2.6F;
        }
        float still = 1f;

        if (!e.isInWater()) {
            speed = 0.26F;
        }

        //this.head.rotateAngleY += f3 / (180F / (float) Math.PI);
        //this.head.rotateAngleX += f4 / (180F / (float) Math.PI);

        //if (f3 != 0.0F) {this.walk(Jaw, (float) (speed * 1.5), 0.2F, true, 0, 0, f2, 1);}
        if (e.isInWater()) {
            this.chainWave(fishTail, speed * still, 0.02F * still, -0.2, f2, 0.8F * still);
            this.chainSwing(fishTail, speed * still, 0.19F * still, -0.85, f2, 0.5F * still);
            this.swing(base, speed, 0.1F, true, 0, 0, f2, 0.8F);
        }
        else {
            this.swing(base, speed, 0.1F, true, 0, 0, f2, 0.5F);
        }
        this.flap(pectoralfinleft, (float) (speed * 0.65), 0.28F, false, 0.8F, 0, f2, 0.5F);
        this.swing(pectoralfinleft, (float) (speed * 0.65), 0.18F, true, 0, 0, f2, 0.5F);
        this.flap(pectoralfinright, (float) (speed * 0.65), -0.28F, false, 0.8F, 0, f2, 0.5F);
        this.swing(pectoralfinright, (float) (speed * 0.65), -0.18F, true, 0, 0, f2, 0.5F);

        this.flap(pelvicfinleft, (float) (speed * 0.65), 0.28F, false, 1.8F, 0, f2, 0.5F);
        this.swing(pelvicfinleft, (float) (speed * 0.65), 0.18F, true, 1, 0, f2, 0.5F);
        this.flap(pelvicfinright, (float) (speed * 0.65), -0.28F, false, 1.8F, 0, f2, 0.5F);
        this.swing(pelvicfinright, (float) (speed * 0.65), -0.18F, true, 1, 0, f2, 0.5F);


        if (!e.isInWater()) {
            this.base.rotateAngleZ = (float) Math.toRadians(90);
            this.base.offsetY = -0.3F;
            this.base.offsetX = -0.3F;
            this.bob(base, -speed * 1.9F, 2.5F, false, f2, 1);
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
        animator.rotate(this.jaw, (float) Math.toRadians(40), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.endKeyframe();
        animator.setStaticKeyframe(5);
        animator.resetKeyframe(2);

    }
}

