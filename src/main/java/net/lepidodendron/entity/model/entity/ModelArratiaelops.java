package net.lepidodendron.entity.model.entity;

import net.ilexiconn.llibrary.client.model.ModelAnimator;
import net.ilexiconn.llibrary.client.model.tools.AdvancedModelRenderer;
import net.ilexiconn.llibrary.server.animation.IAnimatedEntity;
import net.lepidodendron.entity.base.EntityPrehistoricFloraAgeableBase;
import net.lepidodendron.entity.model.ModelBasePalaeopedia;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

public class ModelArratiaelops extends ModelBasePalaeopedia {
    private final AdvancedModelRenderer body;
    private final AdvancedModelRenderer cube_r1;
    private final AdvancedModelRenderer cube_r2;
    private final AdvancedModelRenderer cube_r3;
    private final AdvancedModelRenderer cube_r4;
    private final AdvancedModelRenderer cube_r5;
    private final AdvancedModelRenderer cube_r6;
    private final AdvancedModelRenderer cube_r7;
    private final AdvancedModelRenderer cube_r8;
    private final AdvancedModelRenderer pectoralfinright;
    private final AdvancedModelRenderer pectoralfinleft;
    private final AdvancedModelRenderer jaw;
    private final AdvancedModelRenderer cube_r9;
    private final AdvancedModelRenderer cube_r10;
    private final AdvancedModelRenderer body2;
    private final AdvancedModelRenderer body3;
    private final AdvancedModelRenderer cube_r11;
    private final AdvancedModelRenderer cube_r12;
    private final AdvancedModelRenderer cube_r13;
    private final AdvancedModelRenderer cube_r14;
    private final AdvancedModelRenderer body4;
    private final AdvancedModelRenderer cube_r15;
    private final AdvancedModelRenderer cube_r16;
    private final AdvancedModelRenderer cube_r17;
    private final AdvancedModelRenderer body5;
    private final AdvancedModelRenderer cube_r18;
    private final AdvancedModelRenderer pelvicfinright;
    private final AdvancedModelRenderer pelvicfinleft;

    private ModelAnimator animator;

    public ModelArratiaelops() {
        this.textureWidth = 80;
        this.textureHeight = 72;

        this.body = new AdvancedModelRenderer(this);
        this.body.setRotationPoint(0.0F, 24.0F, 0.0F);
        this.body.cubeList.add(new ModelBox(body, 34, 37, -2.5F, -9.0F, -8.5F, 5, 6, 4, 0.01F, false));
        this.body.cubeList.add(new ModelBox(body, 16, 50, -2.0F, -8.0F, -12.0F, 4, 5, 4, 0.0F, false));
        this.body.cubeList.add(new ModelBox(body, 64, 17, -2.0F, -7.05F, -12.0F, 4, 1, 1, 0.015F, false));
        this.body.cubeList.add(new ModelBox(body, 0, 65, -2.0F, -7.55F, -12.0F, 4, 1, 1, 0.01F, false));
        this.body.cubeList.add(new ModelBox(body, 10, 65, -2.0F, -7.55F, -11.5F, 4, 1, 1, 0.015F, false));
        this.body.cubeList.add(new ModelBox(body, 44, 65, -2.0F, -7.3F, -11.75F, 4, 1, 1, 0.02F, false));
        this.body.cubeList.add(new ModelBox(body, 20, 65, -2.0F, -7.05F, -11.5F, 4, 1, 1, 0.01F, false));
        this.body.cubeList.add(new ModelBox(body, 64, 8, -1.5F, -7.8F, -13.975F, 3, 2, 3, 0.0F, false));

        this.cube_r1 = new AdvancedModelRenderer(this);
        this.cube_r1.setRotationPoint(-0.5F, -3.875F, -12.3F);
        this.body.addChild(cube_r1);
        this.setRotateAngle(cube_r1, -0.1745F, 0.0F, 0.0F);
        this.cube_r1.cubeList.add(new ModelBox(cube_r1, 46, 59, -1.0F, -1.0F, 0.0F, 3, 2, 4, 0.0F, false));

        this.cube_r2 = new AdvancedModelRenderer(this);
        this.cube_r2.setRotationPoint(0.0F, -3.175F, -8.55F);
        this.body.addChild(cube_r2);
        this.setRotateAngle(cube_r2, -0.0436F, 0.0F, 0.0F);
        this.cube_r2.cubeList.add(new ModelBox(cube_r2, 30, 11, -2.0F, -1.0F, 0.0F, 4, 2, 4, 0.01F, false));

        this.cube_r3 = new AdvancedModelRenderer(this);
        this.cube_r3.setRotationPoint(0.0F, -9.7F, -8.525F);
        this.body.addChild(cube_r3);
        this.setRotateAngle(cube_r3, 0.0742F, 0.0F, 0.0F);
        this.cube_r3.cubeList.add(new ModelBox(cube_r3, 52, 54, -2.0F, 0.0F, 0.0F, 4, 1, 4, 0.0F, false));

        this.cube_r4 = new AdvancedModelRenderer(this);
        this.cube_r4.setRotationPoint(2.1F, -5.0F, -11.6F);
        this.body.addChild(cube_r4);
        this.setRotateAngle(cube_r4, -0.5672F, 0.1833F, 0.0F);
        this.cube_r4.cubeList.add(new ModelBox(cube_r4, 60, 64, -1.0F, 0.0F, -3.5F, 1, 1, 4, 0.0F, true));

        this.cube_r5 = new AdvancedModelRenderer(this);
        this.cube_r5.setRotationPoint(-2.1F, -5.0F, -11.6F);
        this.body.addChild(cube_r5);
        this.setRotateAngle(cube_r5, -0.5672F, -0.1833F, 0.0F);
        this.cube_r5.cubeList.add(new ModelBox(cube_r5, 60, 64, 0.0F, 0.0F, -3.5F, 1, 1, 4, 0.0F, false));

        this.cube_r6 = new AdvancedModelRenderer(this);
        this.cube_r6.setRotationPoint(0.5F, -5.8F, -11.6F);
        this.body.addChild(cube_r6);
        this.setRotateAngle(cube_r6, -0.3927F, 0.0F, 0.0F);
        this.cube_r6.cubeList.add(new ModelBox(cube_r6, 60, 59, -2.0F, 0.0F, -3.5F, 3, 1, 4, 0.02F, false));

        this.cube_r7 = new AdvancedModelRenderer(this);
        this.cube_r7.setRotationPoint(0.5F, -8.525F, -12.3F);
        this.body.addChild(cube_r7);
        this.setRotateAngle(cube_r7, 0.3927F, 0.0F, 0.0F);
        this.cube_r7.cubeList.add(new ModelBox(cube_r7, 0, 60, -2.0F, 0.0F, -3.5F, 3, 1, 4, -0.01F, false));

        this.cube_r8 = new AdvancedModelRenderer(this);
        this.cube_r8.setRotationPoint(0.5F, -9.6F, -8.5F);
        this.body.addChild(cube_r8);
        this.setRotateAngle(cube_r8, 0.2618F, 0.0F, 0.0F);
        this.cube_r8.cubeList.add(new ModelBox(cube_r8, 16, 59, -2.0F, 0.0F, -3.5F, 3, 2, 4, 0.0F, false));

        this.pectoralfinright = new AdvancedModelRenderer(this);
        this.pectoralfinright.setRotationPoint(-2.5F, -3.05F, -6.5F);
        this.body.addChild(pectoralfinright);
        this.setRotateAngle(pectoralfinright, -0.0436F, -0.1745F, 0.0F);
        this.pectoralfinright.cubeList.add(new ModelBox(pectoralfinright, 0, 49, 0.0F, -1.5F, 0.0F, 0, 3, 8, 0.0F, false));

        this.pectoralfinleft = new AdvancedModelRenderer(this);
        this.pectoralfinleft.setRotationPoint(2.5F, -3.05F, -6.5F);
        this.body.addChild(pectoralfinleft);
        this.setRotateAngle(pectoralfinleft, -0.0436F, 0.1745F, 0.0F);
        this.pectoralfinleft.cubeList.add(new ModelBox(pectoralfinleft, 0, 49, 0.0F, -1.5F, 0.0F, 0, 3, 8, 0.0F, true));

        this.jaw = new AdvancedModelRenderer(this);
        this.jaw.setRotationPoint(0.0F, -4.0F, -12.0F);
        this.body.addChild(jaw);
        this.setRotateAngle(jaw, -0.0873F, 0.0F, 0.0F);


        this.cube_r9 = new AdvancedModelRenderer(this);
        this.cube_r9.setRotationPoint(-0.5F, -2.6F, -4.0F);
        this.jaw.addChild(cube_r9);
        this.setRotateAngle(cube_r9, -0.5934F, 0.0F, 0.0F);
        this.cube_r9.cubeList.add(new ModelBox(cube_r9, 52, 42, -1.0F, 0.0F, 0.125F, 3, 1, 5, -0.01F, false));

        this.cube_r10 = new AdvancedModelRenderer(this);
        this.cube_r10.setRotationPoint(-0.5F, -2.625F, -4.0F);
        this.jaw.addChild(cube_r10);
        this.setRotateAngle(cube_r10, -0.4363F, 0.0F, 0.0F);
        this.cube_r10.cubeList.add(new ModelBox(cube_r10, 52, 36, -1.0F, 0.0F, 0.0F, 3, 1, 5, 0.01F, false));

        this.body2 = new AdvancedModelRenderer(this);
        this.body2.setRotationPoint(0.0F, -6.0F, -4.5F);
        this.body.addChild(body2);
        this.body2.cubeList.add(new ModelBox(body2, 0, 0, -2.5F, -3.5F, -1.0F, 5, 7, 10, 0.0F, false));
        this.body2.cubeList.add(new ModelBox(body2, 24, 17, -2.0F, -4.0F, -0.5F, 4, 1, 9, 0.01F, false));
        this.body2.cubeList.add(new ModelBox(body2, 24, 27, -2.0F, 3.0F, -0.4F, 4, 1, 9, 0.0F, false));

        this.body3 = new AdvancedModelRenderer(this);
        this.body3.setRotationPoint(0.0F, -0.75F, 8.5F);
        this.body2.addChild(body3);
        this.body3.cubeList.add(new ModelBox(body3, 0, 17, -2.0F, -2.5F, -0.5F, 4, 6, 8, 0.0F, false));
        this.body3.cubeList.add(new ModelBox(body3, 50, 8, 0.0F, -7.5F, 2.05F, 0, 5, 7, 0.0F, false));

        this.cube_r11 = new AdvancedModelRenderer(this);
        this.cube_r11.setRotationPoint(-1.0F, 4.15F, 5.45F);
        this.body3.addChild(cube_r11);
        this.setRotateAngle(cube_r11, 0.2182F, 0.0F, 0.0F);
        this.cube_r11.cubeList.add(new ModelBox(cube_r11, 64, 13, -0.5F, -1.0F, -1.0F, 3, 1, 3, 0.0F, false));

        this.cube_r12 = new AdvancedModelRenderer(this);
        this.cube_r12.setRotationPoint(-1.0F, -1.1F, 4.4F);
        this.body3.addChild(cube_r12);
        this.setRotateAngle(cube_r12, -0.0654F, 0.0F, 0.0F);
        this.cube_r12.cubeList.add(new ModelBox(cube_r12, 30, 63, -0.5F, -2.0F, -1.0F, 3, 1, 4, 0.0F, false));

        this.cube_r13 = new AdvancedModelRenderer(this);
        this.cube_r13.setRotationPoint(-1.0F, -1.225F, 0.2F);
        this.body3.addChild(cube_r13);
        this.setRotateAngle(cube_r13, -0.0131F, 0.0F, 0.0F);
        this.cube_r13.cubeList.add(new ModelBox(cube_r13, 52, 48, -0.5F, -2.0F, -1.0F, 3, 1, 5, 0.01F, false));

        this.cube_r14 = new AdvancedModelRenderer(this);
        this.cube_r14.setRotationPoint(0.0F, 4.65F, 0.5F);
        this.body3.addChild(cube_r14);
        this.setRotateAngle(cube_r14, 0.0698F, 0.0F, 0.0F);
        this.cube_r14.cubeList.add(new ModelBox(cube_r14, 50, 29, -1.5F, -2.0F, -1.0F, 3, 2, 5, 0.01F, false));

        this.body4 = new AdvancedModelRenderer(this);
        this.body4.setRotationPoint(0.0F, -0.25F, 7.5F);
        this.body3.addChild(body4);
        this.body4.cubeList.add(new ModelBox(body4, 30, 0, -1.5F, -2.1F, -1.0F, 3, 4, 7, 0.0F, false));

        this.cube_r15 = new AdvancedModelRenderer(this);
        this.cube_r15.setRotationPoint(0.0F, -1.35F, 6.0F);
        this.body4.addChild(cube_r15);
        this.setRotateAngle(cube_r15, -0.0436F, 0.0F, 0.0F);
        this.cube_r15.cubeList.add(new ModelBox(cube_r15, 50, 0, -1.0F, -1.0F, -7.0F, 2, 1, 7, 0.0F, false));

        this.cube_r16 = new AdvancedModelRenderer(this);
        this.cube_r16.setRotationPoint(0.0F, 1.9F, 6.0F);
        this.body4.addChild(cube_r16);
        this.setRotateAngle(cube_r16, 0.3054F, 0.0F, 0.0F);
        this.cube_r16.cubeList.add(new ModelBox(cube_r16, 34, 47, -1.0F, -2.0F, -7.0F, 2, 2, 7, 0.0F, false));

        this.cube_r17 = new AdvancedModelRenderer(this);
        this.cube_r17.setRotationPoint(0.0F, 2.15F, 0.45F);
        this.body4.addChild(cube_r17);
        this.setRotateAngle(cube_r17, 0.3054F, 0.0F, 0.0F);
        this.cube_r17.cubeList.add(new ModelBox(cube_r17, 16, 37, 0.0F, 1.0F, -1.0F, 0, 4, 9, 0.0F, false));

        this.body5 = new AdvancedModelRenderer(this);
        this.body5.setRotationPoint(0.0F, -0.6F, 6.0F);
        this.body4.addChild(body5);
        this.body5.cubeList.add(new ModelBox(body5, 50, 20, -1.0F, -1.5F, -0.75F, 2, 3, 6, -0.01F, false));
        this.body5.cubeList.add(new ModelBox(body5, 0, 31, 0.0F, -4.5F, 2.75F, 0, 9, 8, 0.0F, false));

        this.cube_r18 = new AdvancedModelRenderer(this);
        this.cube_r18.setRotationPoint(-0.5F, 2.275F, 0.0F);
        this.body5.addChild(cube_r18);
        this.setRotateAngle(cube_r18, 0.1745F, 0.0F, 0.0F);
        this.cube_r18.cubeList.add(new ModelBox(cube_r18, 32, 56, 0.0F, -1.0F, -1.0F, 1, 1, 6, 0.0F, false));

        this.pelvicfinright = new AdvancedModelRenderer(this);
        this.pelvicfinright.setRotationPoint(-1.5F, 4.0F, 1.0F);
        this.body3.addChild(pelvicfinright);
        this.setRotateAngle(pelvicfinright, -0.0436F, -0.0873F, 0.0F);
        this.pelvicfinright.cubeList.add(new ModelBox(pelvicfinright, 16, 31, 0.0F, -0.5F, 0.0F, 0, 2, 4, 0.0F, false));

        this.pelvicfinleft = new AdvancedModelRenderer(this);
        this.pelvicfinleft.setRotationPoint(1.5F, 4.0F, 1.0F);
        this.body3.addChild(pelvicfinleft);
        this.setRotateAngle(pelvicfinleft, -0.0436F, 0.0873F, 0.0F);
        this.pelvicfinleft.cubeList.add(new ModelBox(pelvicfinleft, 16, 31, 0.0F, -0.5F, 0.0F, 0, 2, 4, 0.0F, true));

        updateDefaultPose();
        animator = ModelAnimator.create();
    }

    @Override
    public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        animate((IAnimatedEntity) entity, f, f1, f2, f3, f4, f5);
        this.body.render(f5);
    }

    @Override
    public void renderStaticBook(float f) {
        //Rotations, positions and sizing:
        this.body.offsetY = -2.0F;
        this.body.offsetX = -1.338F;
        this.body.rotateAngleY = (float)Math.toRadians(200);
        this.body.rotateAngleX = (float)Math.toRadians(8);
        this.body.rotateAngleZ = (float)Math.toRadians(-8);
        this.body.scaleChildren = true;
        float scaler = 1.63F;
        this.body.setScale(scaler, scaler, scaler);
        //Start of pose:

        //End of pose, now render the model:
        this.body.render(f);
        //Reset rotations, positions and sizing:
        this.body.setScale(1.0F, 1.0F, 1.0F);
        this.body.scaleChildren = false;
        resetToDefaultPose();

    }

    public void renderStaticWall(float f) {
        this.body.rotateAngleY = (float) Math.toRadians(90);
        this.body.offsetX = -0.14F;
        this.body.offsetY = -0.19F;
        this.body.offsetZ = 0.06F;
        this.body.render(0.01F);
        this.resetToDefaultPose();
    }

    public void renderStaticFloor(float f) {
        this.body.offsetY = -0.18F;
        this.body.render(0.01F);
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

        AdvancedModelRenderer[] fishTail = {this.body2, this.body3, this.body4, this.body5};

        float speed = 0.186F;
        EntityPrehistoricFloraAgeableBase ee = (EntityPrehistoricFloraAgeableBase) e;
        if (ee.getIsFast()) {
            speed = speed * 2.6F;
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
            this.chainSwing(fishTail, speed * still, 0.29F * still, -0.85, f2, 0.5F * still);
            this.swing(body, speed, 0.2F, true, 0, 0, f2, 0.8F);
        }
        else {
            this.swing(body, speed, 0.1F, true, 0, 0, f2, 0.5F);
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
            this.body.rotateAngleZ = (float) Math.toRadians(90);
            this.body.offsetY = -0.05F;
            this.body.offsetX = -0.5F;
            this.bob(body, -speed * 1.9F, 2.5F, false, f2, 1);
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

