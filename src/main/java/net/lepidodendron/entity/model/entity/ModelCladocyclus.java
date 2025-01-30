package net.lepidodendron.entity.model.entity;

import net.ilexiconn.llibrary.client.model.ModelAnimator;
import net.ilexiconn.llibrary.client.model.tools.AdvancedModelRenderer;
import net.ilexiconn.llibrary.server.animation.IAnimatedEntity;
import net.lepidodendron.entity.base.EntityPrehistoricFloraAgeableBase;
import net.lepidodendron.entity.model.ModelBasePalaeopedia;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

public class ModelCladocyclus extends ModelBasePalaeopedia {
    private final AdvancedModelRenderer base;
    private final AdvancedModelRenderer cube_r1;
    private final AdvancedModelRenderer cube_r2;
    private final AdvancedModelRenderer cube_r3;
    private final AdvancedModelRenderer cube_r4;
    private final AdvancedModelRenderer cube_r5;
    private final AdvancedModelRenderer cube_r6;
    private final AdvancedModelRenderer cube_r7;
    private final AdvancedModelRenderer cube_r8;
    private final AdvancedModelRenderer jaw;
    private final AdvancedModelRenderer cube_r9;
    private final AdvancedModelRenderer body;
    private final AdvancedModelRenderer cube_r10;
    private final AdvancedModelRenderer pectoralfinright;
    private final AdvancedModelRenderer pectoralfinleft;
    private final AdvancedModelRenderer body2;
    private final AdvancedModelRenderer body3;
    private final AdvancedModelRenderer cube_r11;
    private final AdvancedModelRenderer cube_r12;
    private final AdvancedModelRenderer pelvicfinright;
    private final AdvancedModelRenderer cube_r13;
    private final AdvancedModelRenderer pelvicfinleft;
    private final AdvancedModelRenderer cube_r14;
    private final AdvancedModelRenderer body4;
    private final AdvancedModelRenderer cube_r15;
    private final AdvancedModelRenderer cube_r16;
    private final AdvancedModelRenderer cube_r17;
    private final AdvancedModelRenderer cube_r18;
    private final AdvancedModelRenderer body5;
    private final AdvancedModelRenderer cube_r19;
    private final AdvancedModelRenderer cube_r20;

    private ModelAnimator animator;

    public ModelCladocyclus() {
        this.textureWidth = 64;
        this.textureHeight = 64;

        this.base = new AdvancedModelRenderer(this);
        this.base.setRotationPoint(0.0F, 22.85F, -9.5F);
        this.base.cubeList.add(new ModelBox(base, 12, 34, -2.0F, -6.0F, -1.0F, 4, 6, 3, 0.0F, false));

        this.cube_r1 = new AdvancedModelRenderer(this);
        this.cube_r1.setRotationPoint(2.2F, -0.75F, 0.0F);
        this.base.addChild(cube_r1);
        this.setRotateAngle(cube_r1, 0.0F, 0.0873F, 0.0F);
        this.cube_r1.cubeList.add(new ModelBox(cube_r1, 0, 0, -1.0F, -5.0F, -1.0F, 1, 5, 3, 0.0F, true));

        this.cube_r2 = new AdvancedModelRenderer(this);
        this.cube_r2.setRotationPoint(-2.2F, -0.75F, 0.0F);
        this.base.addChild(cube_r2);
        this.setRotateAngle(cube_r2, 0.0F, -0.0873F, 0.0F);
        this.cube_r2.cubeList.add(new ModelBox(cube_r2, 0, 0, 0.0F, -5.0F, -1.0F, 1, 5, 3, 0.0F, false));

        this.cube_r3 = new AdvancedModelRenderer(this);
        this.cube_r3.setRotationPoint(1.5F, -4.55F, -4.375F);
        this.base.addChild(cube_r3);
        this.setRotateAngle(cube_r3, 0.2618F, 0.0F, -0.1309F);
        this.cube_r3.cubeList.add(new ModelBox(cube_r3, 17, 2, -1.0F, 0.0F, 0.0F, 1, 3, 1, 0.0F, false));

        this.cube_r4 = new AdvancedModelRenderer(this);
        this.cube_r4.setRotationPoint(-1.5F, -4.55F, -4.375F);
        this.base.addChild(cube_r4);
        this.setRotateAngle(cube_r4, 0.2618F, 0.0F, 0.1309F);
        this.cube_r4.cubeList.add(new ModelBox(cube_r4, 0, 19, 0.0F, 0.0F, 0.0F, 1, 3, 1, 0.0F, false));

        this.cube_r5 = new AdvancedModelRenderer(this);
        this.cube_r5.setRotationPoint(-0.5F, -3.9F, -1.9F);
        this.base.addChild(cube_r5);
        this.setRotateAngle(cube_r5, 0.3927F, 0.0F, 0.0F);
        this.cube_r5.cubeList.add(new ModelBox(cube_r5, 17, 0, -1.0F, -1.0F, -1.0F, 3, 1, 1, 0.02F, false));

        this.cube_r6 = new AdvancedModelRenderer(this);
        this.cube_r6.setRotationPoint(-1.0F, -1.25F, -1.9F);
        this.base.addChild(cube_r6);
        this.setRotateAngle(cube_r6, 0.3927F, 0.0F, 0.0F);
        this.cube_r6.cubeList.add(new ModelBox(cube_r6, 17, 6, 0.0F, -3.3F, -1.375F, 2, 1, 1, 0.0F, false));
        this.cube_r6.cubeList.add(new ModelBox(cube_r6, 36, 8, -0.5F, -4.0F, -1.0F, 3, 4, 4, 0.01F, false));

        this.cube_r7 = new AdvancedModelRenderer(this);
        this.cube_r7.setRotationPoint(-0.5F, -0.4F, -1.9F);
        this.base.addChild(cube_r7);
        this.setRotateAngle(cube_r7, -0.2618F, 0.0F, 0.0F);
        this.cube_r7.cubeList.add(new ModelBox(cube_r7, 28, 39, -1.0F, -2.0F, -1.0F, 3, 2, 2, 0.0F, false));

        this.cube_r8 = new AdvancedModelRenderer(this);
        this.cube_r8.setRotationPoint(-0.5F, -6.1F, -1.0F);
        this.base.addChild(cube_r8);
        this.setRotateAngle(cube_r8, 0.0785F, 0.0F, 0.0F);
        this.cube_r8.cubeList.add(new ModelBox(cube_r8, 37, 0, -1.0F, 0.0F, 0.0F, 3, 1, 3, 0.0F, false));

        this.jaw = new AdvancedModelRenderer(this);
        this.jaw.setRotationPoint(0.0F, -0.7F, -2.65F);
        this.base.addChild(jaw);
        this.setRotateAngle(jaw, -0.6981F, 0.0F, 0.0F);
        this.jaw.cubeList.add(new ModelBox(jaw, 38, 29, -1.0F, -1.0F, -3.0F, 2, 1, 3, -0.01F, false));
        this.jaw.cubeList.add(new ModelBox(jaw, 14, 21, -1.0F, -1.0F, -3.5F, 2, 1, 1, -0.02F, false));

        this.cube_r9 = new AdvancedModelRenderer(this);
        this.cube_r9.setRotationPoint(0.0F, -0.35F, -1.95F);
        this.jaw.addChild(cube_r9);
        this.setRotateAngle(cube_r9, -0.1309F, 0.0F, 0.0F);
        this.cube_r9.cubeList.add(new ModelBox(cube_r9, 23, 31, -1.0F, -1.0F, -1.5F, 2, 1, 3, -0.03F, false));

        this.body = new AdvancedModelRenderer(this);
        this.body.setRotationPoint(0.0F, -3.35F, 1.25F);
        this.base.addChild(body);
        this.body.cubeList.add(new ModelBox(body, 20, 10, -2.5F, -2.55F, 0.0F, 5, 6, 6, 0.0F, false));

        this.cube_r10 = new AdvancedModelRenderer(this);
        this.cube_r10.setRotationPoint(0.0F, -2.75F, -2.25F);
        this.body.addChild(cube_r10);
        this.setRotateAngle(cube_r10, 0.0785F, 0.0F, 0.0F);
        this.cube_r10.cubeList.add(new ModelBox(cube_r10, 26, 22, -2.0F, -0.025F, 2.4F, 4, 1, 6, -0.01F, false));

        this.pectoralfinright = new AdvancedModelRenderer(this);
        this.pectoralfinright.setRotationPoint(-2.5F, 2.2F, 1.75F);
        this.body.addChild(pectoralfinright);
        this.setRotateAngle(pectoralfinright, -0.2618F, -0.1745F, 0.0F);
        this.pectoralfinright.cubeList.add(new ModelBox(pectoralfinright, 12, 24, 0.0F, -1.5F, 0.0F, 0, 3, 7, 0.0F, false));

        this.pectoralfinleft = new AdvancedModelRenderer(this);
        this.pectoralfinleft.setRotationPoint(2.5F, 2.2F, 1.75F);
        this.body.addChild(pectoralfinleft);
        this.setRotateAngle(pectoralfinleft, -0.2618F, 0.1745F, 0.0F);
        this.pectoralfinleft.cubeList.add(new ModelBox(pectoralfinleft, 12, 24, 0.0F, -1.5F, 0.0F, 0, 3, 7, 0.0F, true));

        this.body2 = new AdvancedModelRenderer(this);
        this.body2.setRotationPoint(0.0F, 0.0F, 6.0F);
        this.body.addChild(body2);
        this.body2.cubeList.add(new ModelBox(body2, 0, 0, -2.0F, -3.5F, -0.5F, 4, 7, 9, 0.0F, false));

        this.body3 = new AdvancedModelRenderer(this);
        this.body3.setRotationPoint(0.0F, -0.5F, 8.5F);
        this.body2.addChild(body3);
        this.body3.cubeList.add(new ModelBox(body3, 0, 16, -1.5F, -2.5F, -1.0F, 3, 6, 8, 0.0F, false));

        this.cube_r11 = new AdvancedModelRenderer(this);
        this.cube_r11.setRotationPoint(-1.5F, 3.95F, 0.0F);
        this.body3.addChild(cube_r11);
        this.setRotateAngle(cube_r11, 0.0524F, 0.0F, 0.0F);
        this.cube_r11.cubeList.add(new ModelBox(cube_r11, 17, 0, 0.5F, -1.0F, -1.0F, 2, 1, 8, 0.0F, false));

        this.cube_r12 = new AdvancedModelRenderer(this);
        this.cube_r12.setRotationPoint(-1.5F, -1.925F, 0.0F);
        this.body3.addChild(cube_r12);
        this.setRotateAngle(cube_r12, -0.0611F, 0.0F, 0.0F);
        this.cube_r12.cubeList.add(new ModelBox(cube_r12, 14, 22, 0.5F, -1.0F, -1.0F, 2, 1, 8, 0.0F, false));

        this.pelvicfinright = new AdvancedModelRenderer(this);
        this.pelvicfinright.setRotationPoint(-0.5F, 3.45F, 5.5F);
        this.body3.addChild(pelvicfinright);
        this.setRotateAngle(pelvicfinright, 0.0F, 0.0F, 0.3491F);


        this.cube_r13 = new AdvancedModelRenderer(this);
        this.cube_r13.setRotationPoint(-1.0F, 0.75F, 1.85F);
        this.pelvicfinright.addChild(cube_r13);
        this.setRotateAngle(cube_r13, 0.829F, 0.0F, 0.0F);
        this.cube_r13.cubeList.add(new ModelBox(cube_r13, 0, 0, 1.0F, -2.0F, -1.0F, 0, 2, 1, 0.0F, false));

        this.pelvicfinleft = new AdvancedModelRenderer(this);
        this.pelvicfinleft.setRotationPoint(0.5F, 3.45F, 5.5F);
        this.body3.addChild(pelvicfinleft);
        this.setRotateAngle(pelvicfinleft, 0.0F, 0.0F, -0.3491F);


        this.cube_r14 = new AdvancedModelRenderer(this);
        this.cube_r14.setRotationPoint(1.0F, 0.75F, 1.85F);
        this.pelvicfinleft.addChild(cube_r14);
        this.setRotateAngle(cube_r14, 0.829F, 0.0F, 0.0F);
        this.cube_r14.cubeList.add(new ModelBox(cube_r14, 0, 0, -1.0F, -2.0F, -1.0F, 0, 2, 1, 0.0F, true));

        this.body4 = new AdvancedModelRenderer(this);
        this.body4.setRotationPoint(0.0F, 0.35F, 7.0F);
        this.body3.addChild(body4);
        this.body4.cubeList.add(new ModelBox(body4, 28, 29, -1.0F, -1.75F, -0.35F, 2, 4, 6, 0.0F, false));

        this.cube_r15 = new AdvancedModelRenderer(this);
        this.cube_r15.setRotationPoint(-2.0F, 2.25F, 5.65F);
        this.body4.addChild(cube_r15);
        this.setRotateAngle(cube_r15, 0.1658F, 0.0F, 0.0F);
        this.cube_r15.cubeList.add(new ModelBox(cube_r15, 20, 37, 1.5F, -1.0F, -6.0F, 1, 1, 6, 0.0F, false));

        this.cube_r16 = new AdvancedModelRenderer(this);
        this.cube_r16.setRotationPoint(0.5F, 3.6F, 4.7F);
        this.body4.addChild(cube_r16);
        this.setRotateAngle(cube_r16, 0.1745F, 0.0F, 0.0F);
        this.cube_r16.cubeList.add(new ModelBox(cube_r16, 0, 12, -0.5F, -1.7F, -3.0F, 0, 3, 4, 0.0F, false));

        this.cube_r17 = new AdvancedModelRenderer(this);
        this.cube_r17.setRotationPoint(0.5F, 0.25F, 4.9F);
        this.body4.addChild(cube_r17);
        this.setRotateAngle(cube_r17, -1.1781F, 0.0F, 0.0F);
        this.cube_r17.cubeList.add(new ModelBox(cube_r17, 14, 14, -0.5F, -4.0F, -3.0F, 0, 5, 2, 0.0F, false));

        this.cube_r18 = new AdvancedModelRenderer(this);
        this.cube_r18.setRotationPoint(-2.0F, -1.75F, 5.65F);
        this.body4.addChild(cube_r18);
        this.setRotateAngle(cube_r18, -0.1745F, 0.0F, 0.0F);
        this.cube_r18.cubeList.add(new ModelBox(cube_r18, 38, 33, 1.5F, 0.0F, -6.0F, 1, 1, 6, 0.0F, false));

        this.body5 = new AdvancedModelRenderer(this);
        this.body5.setRotationPoint(0.0F, 0.25F, 5.65F);
        this.body4.addChild(body5);
        this.body5.cubeList.add(new ModelBox(body5, 29, 0, -0.5F, -1.0F, -0.5F, 1, 2, 6, 0.0F, false));
        this.body5.cubeList.add(new ModelBox(body5, 0, 24, 0.0F, -4.5F, 4.35F, 0, 9, 6, 0.0F, false));

        this.cube_r19 = new AdvancedModelRenderer(this);
        this.cube_r19.setRotationPoint(-2.0F, -0.825F, 0.2F);
        this.body5.addChild(cube_r19);
        this.setRotateAngle(cube_r19, -0.2793F, 0.0F, 0.0F);
        this.cube_r19.cubeList.add(new ModelBox(cube_r19, 0, 39, 1.5F, -1.0F, -1.0F, 1, 1, 4, -0.01F, false));

        this.cube_r20 = new AdvancedModelRenderer(this);
        this.cube_r20.setRotationPoint(-2.0F, 1.75F, 0.5F);
        this.body5.addChild(cube_r20);
        this.setRotateAngle(cube_r20, 0.2618F, 0.0F, 0.0F);
        this.cube_r20.cubeList.add(new ModelBox(cube_r20, 6, 40, 1.5F, -1.0F, -1.0F, 1, 1, 4, -0.01F, false));

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
        this.base.offsetY = -2.0F;
        this.base.offsetX = -1.338F;
        this.base.rotateAngleY = (float)Math.toRadians(200);
        this.base.rotateAngleX = (float)Math.toRadians(8);
        this.base.rotateAngleZ = (float)Math.toRadians(-8);
        this.base.scaleChildren = true;
        float scaler = 1.63F;
        this.base.setScale(scaler, scaler, scaler);
        //Start of pose:

        //End of pose, now render the model:
        this.base.render(f);
        //Reset rotations, positions and sizing:
        this.base.setScale(1.0F, 1.0F, 1.0F);
        this.base.scaleChildren = false;
        resetToDefaultPose();

    }

    public void renderStaticWall(float f) {
        this.base.rotateAngleY = (float) Math.toRadians(90);
        this.setRotateAngle(jaw, 0.0F, 0.0F, 0.0F);
        this.base.offsetX = -0.14F;
        this.base.offsetY = -0.19F;
        this.base.offsetZ = 0.06F;
        this.base.render(0.01F);
        this.resetToDefaultPose();
    }
    public void renderStaticFloor(float f) {
        this.setRotateAngle(base, 0.0F, 0.0F, 0.0F);
        this.setRotateAngle(body, 0.0F, 0.0F, 0.0F);
        this.setRotateAngle(body2, 0.0F, 0.0F, 0.0F);
        this.setRotateAngle(body3, 0.0F, 0.0F, 0.0F);
        this.setRotateAngle(body4, 0.0F, 0.0F, 0.0F);
        this.setRotateAngle(body5, 0.0F, 0.0F, 0.0F);
        this.setRotateAngle(jaw, 0.0F, 0.0F, 0.0F);
        this.base.offsetY = 0.139F;
        this.base.render(0.01f);
        resetToDefaultPose();
    }
    public void renderStaticSuspended(float f) {
        this.setRotateAngle(base, 0.0F, 0.0F, 0.0F);
        this.setRotateAngle(body, 0.0F, 0.0F, 0.0F);
        this.setRotateAngle(body2, 0.0F, 0.0F, 0.0F);
        this.setRotateAngle(body3, 0.0F, 0.0F, 0.0F);
        this.setRotateAngle(body4, 0.0F, 0.0F, 0.0F);
        this.setRotateAngle(body5, 0.0F, 0.0F, 0.0F);
        this.setRotateAngle(jaw, 0.0F, 0.0F, 0.0F);
        this.base.offsetY = 0.139F;
        this.base.render(0.01f);
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
            this.swing(base, speed, 0.2F, true, 0, 0, f2, 0.8F);
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
            this.base.offsetY = -0.1F;
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

