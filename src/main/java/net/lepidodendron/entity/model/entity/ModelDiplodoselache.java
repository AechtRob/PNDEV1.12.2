package net.lepidodendron.entity.model.entity;

import net.ilexiconn.llibrary.client.model.ModelAnimator;
import net.ilexiconn.llibrary.client.model.tools.AdvancedModelRenderer;
import net.ilexiconn.llibrary.server.animation.IAnimatedEntity;
import net.lepidodendron.entity.EntityPrehistoricFloraDiplodoselache;
import net.lepidodendron.entity.base.EntityPrehistoricFloraAgeableBase;
import net.lepidodendron.entity.model.ModelBasePalaeopedia;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

public class ModelDiplodoselache extends ModelBasePalaeopedia {
    private final AdvancedModelRenderer body;
    private final AdvancedModelRenderer cube_r1;
    private final AdvancedModelRenderer pectoralfinright;
    private final AdvancedModelRenderer pectoralfinleft;
    private final AdvancedModelRenderer head;
    private final AdvancedModelRenderer cube_r2;
    private final AdvancedModelRenderer cube_r3;
    private final AdvancedModelRenderer cube_r4;
    private final AdvancedModelRenderer jaw;
    private final AdvancedModelRenderer cube_r5;
    private final AdvancedModelRenderer cube_r6;
    private final AdvancedModelRenderer body2;
    private final AdvancedModelRenderer cube_r7;
    private final AdvancedModelRenderer body3;
    private final AdvancedModelRenderer pelvicfinright;
    private final AdvancedModelRenderer pelvicfinleft;
    private final AdvancedModelRenderer body4;
    private final AdvancedModelRenderer body5;

    private ModelAnimator animator;

    public ModelDiplodoselache() {
        this.textureWidth = 64;
        this.textureHeight = 64;

        this.body = new AdvancedModelRenderer(this);
        this.body.setRotationPoint(0.0F, 24.0F, 0.0F);
        this.body.cubeList.add(new ModelBox(body, 0, 0, -3.0F, -7.15F, -11.5F, 6, 5, 8, 0.0F, false));

        this.cube_r1 = new AdvancedModelRenderer(this);
        this.cube_r1.setRotationPoint(0.5F, -7.15F, -11.5F);
        this.body.addChild(cube_r1);
        this.setRotateAngle(cube_r1, 0.1047F, 0.0F, 0.0F);
        this.cube_r1.cubeList.add(new ModelBox(cube_r1, 20, 5, -3.0F, 0.0F, 0.0F, 5, 1, 8, -0.01F, false));

        this.pectoralfinright = new AdvancedModelRenderer(this);
        this.pectoralfinright.setRotationPoint(-3.0F, -3.0F, -9.0F);
        this.body.addChild(pectoralfinright);
        this.setRotateAngle(pectoralfinright, -0.2618F, -0.0436F, 0.9599F);
        this.pectoralfinright.cubeList.add(new ModelBox(pectoralfinright, 0, 36, 0.0F, -0.5F, -0.5F, 0, 4, 7, 0.0F, false));

        this.pectoralfinleft = new AdvancedModelRenderer(this);
        this.pectoralfinleft.setRotationPoint(3.0F, -3.0F, -9.0F);
        this.body.addChild(pectoralfinleft);
        this.setRotateAngle(pectoralfinleft, -0.2618F, 0.0436F, -0.9599F);
        this.pectoralfinleft.cubeList.add(new ModelBox(pectoralfinleft, 0, 36, 0.0F, -0.5F, -0.5F, 0, 4, 7, 0.0F, true));

        this.head = new AdvancedModelRenderer(this);
        this.head.setRotationPoint(0.0F, -4.0F, -11.5F);
        this.body.addChild(head);
        this.head.cubeList.add(new ModelBox(head, 24, 29, -2.5F, -2.15F, -5.7F, 5, 2, 6, 0.0F, false));
        this.head.cubeList.add(new ModelBox(head, 22, 44, -2.0F, -1.15F, -7.15F, 4, 1, 2, -0.005F, false));
        this.head.cubeList.add(new ModelBox(head, 16, 29, -2.5F, -1.8F, -4.85F, 5, 1, 1, 0.01F, false));

        this.cube_r2 = new AdvancedModelRenderer(this);
        this.cube_r2.setRotationPoint(0.5F, -2.15F, -5.65F);
        this.head.addChild(cube_r2);
        this.setRotateAngle(cube_r2, 0.7287F, 0.0F, 0.0F);
        this.cube_r2.cubeList.add(new ModelBox(cube_r2, 44, 40, -2.5F, -0.2F, -1.825F, 4, 1, 2, -0.01F, false));

        this.cube_r3 = new AdvancedModelRenderer(this);
        this.cube_r3.setRotationPoint(0.0F, -2.15F, -5.65F);
        this.head.addChild(cube_r3);
        this.setRotateAngle(cube_r3, 0.1178F, 0.0F, 0.0F);
        this.cube_r3.cubeList.add(new ModelBox(cube_r3, 16, 37, -2.0F, -0.25F, -0.05F, 4, 1, 6, 0.0F, false));

        this.cube_r4 = new AdvancedModelRenderer(this);
        this.cube_r4.setRotationPoint(0.5F, -0.15F, -3.7F);
        this.head.addChild(cube_r4);
        this.setRotateAngle(cube_r4, -0.2618F, 0.0F, 0.0F);
        this.cube_r4.cubeList.add(new ModelBox(cube_r4, 20, 0, -3.0F, -1.0F, -0.15F, 5, 1, 4, 0.01F, false));

        this.jaw = new AdvancedModelRenderer(this);
        this.jaw.setRotationPoint(0.0F, -0.15F, 0.0F);
        this.head.addChild(jaw);
        this.setRotateAngle(jaw, -0.0044F, 0.0F, 0.0F);
        this.jaw.cubeList.add(new ModelBox(jaw, 38, 9, -2.0F, 0.0F, -7.1F, 4, 1, 2, -0.01F, false));
        this.jaw.cubeList.add(new ModelBox(jaw, 0, 36, -2.5F, 0.0F, -5.7F, 5, 1, 6, -0.005F, false));
        this.jaw.cubeList.add(new ModelBox(jaw, 40, 29, -2.5F, -1.9F, -2.7F, 5, 2, 3, -0.01F, false));

        this.cube_r5 = new AdvancedModelRenderer(this);
        this.cube_r5.setRotationPoint(0.5F, 1.0F, -7.1F);
        this.jaw.addChild(cube_r5);
        this.setRotateAngle(cube_r5, -0.1745F, 0.0F, 0.0F);
        this.cube_r5.cubeList.add(new ModelBox(cube_r5, 44, 35, -2.5F, -1.025F, 0.025F, 4, 1, 4, -0.02F, false));

        this.cube_r6 = new AdvancedModelRenderer(this);
        this.cube_r6.setRotationPoint(0.5F, 4.15F, 11.5F);
        this.jaw.addChild(cube_r6);
        this.setRotateAngle(cube_r6, -0.0436F, 0.0F, 0.0F);
        this.cube_r6.cubeList.add(new ModelBox(cube_r6, 10, 44, -2.5F, -2.8F, -14.8F, 4, 1, 4, 0.0F, false));

        this.body2 = new AdvancedModelRenderer(this);
        this.body2.setRotationPoint(0.0F, -5.5F, -4.0F);
        this.body.addChild(body2);
        this.body2.cubeList.add(new ModelBox(body2, 19, 14, -2.5F, -2.5F, 0.0F, 5, 6, 9, 0.0F, false));
        this.body2.cubeList.add(new ModelBox(body2, 30, 30, 0.0F, -4.5F, 2.0F, 0, 2, 7, 0.0F, false));
        this.body2.cubeList.add(new ModelBox(body2, 36, 45, 0.0F, -3.25F, 1.0F, 0, 1, 1, 0.0F, false));

        this.cube_r7 = new AdvancedModelRenderer(this);
        this.cube_r7.setRotationPoint(0.0F, -2.5F, 0.0F);
        this.body2.addChild(cube_r7);
        this.setRotateAngle(cube_r7, -0.9163F, 0.0F, 0.0F);
        this.cube_r7.cubeList.add(new ModelBox(cube_r7, 0, 0, -0.5F, -3.75F, 0.0F, 1, 4, 1, 0.0F, false));

        this.body3 = new AdvancedModelRenderer(this);
        this.body3.setRotationPoint(0.0F, 0.0F, 9.0F);
        this.body2.addChild(body3);
        this.body3.cubeList.add(new ModelBox(body3, 0, 23, -2.0F, -2.25F, -0.9F, 4, 5, 8, 0.0F, false));
        this.body3.cubeList.add(new ModelBox(body3, 36, 36, 0.0F, -4.5F, 0.0F, 0, 3, 7, 0.0F, false));

        this.pelvicfinright = new AdvancedModelRenderer(this);
        this.pelvicfinright.setRotationPoint(-1.0F, 2.75F, 1.0F);
        this.body3.addChild(pelvicfinright);
        this.setRotateAngle(pelvicfinright, 0.0F, 0.0F, 0.8727F);
        this.pelvicfinright.cubeList.add(new ModelBox(pelvicfinright, 30, 32, 0.0F, 0.0F, -1.0F, 0, 4, 7, 0.0F, false));

        this.pelvicfinleft = new AdvancedModelRenderer(this);
        this.pelvicfinleft.setRotationPoint(1.0F, 2.75F, 1.0F);
        this.body3.addChild(pelvicfinleft);
        this.setRotateAngle(pelvicfinleft, 0.0F, 0.0F, -0.8727F);
        this.pelvicfinleft.cubeList.add(new ModelBox(pelvicfinleft, 30, 32, 0.0F, 0.0F, -1.0F, 0, 4, 7, 0.0F, true));

        this.body4 = new AdvancedModelRenderer(this);
        this.body4.setRotationPoint(0.0F, 0.5F, 6.75F);
        this.body3.addChild(body4);
        this.body4.cubeList.add(new ModelBox(body4, 38, 0, -1.5F, -2.25F, -0.5F, 3, 4, 5, 0.0F, false));

        this.body5 = new AdvancedModelRenderer(this);
        this.body5.setRotationPoint(0.0F, -0.5F, 4.5F);
        this.body4.addChild(body5);
        this.body5.cubeList.add(new ModelBox(body5, 38, 14, -1.0F, -1.5F, -0.75F, 2, 3, 5, 0.0F, false));
        this.body5.cubeList.add(new ModelBox(body5, 0, 0, 0.0F, -4.525F, -1.05F, 0, 9, 14, 0.0F, false));

        updateDefaultPose();
        animator = ModelAnimator.create();
    }

    @Override
    public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        animate((IAnimatedEntity) entity, f, f1, f2, f3, f4, f5);
        this.body.render(f5);
    }
    public void renderStaticFloor(float f) {
        this.setRotateAngle(body, -0.2F, 0.0F, 0.0F);
        this.setRotateAngle(body2, 0.1F, 0.2F, 0.0F);
        this.setRotateAngle(body3, 0.2F, 0.2F, 0.0F);
        this.setRotateAngle(body4, 0.2F, 0.2F, 0.0F);
        this.setRotateAngle(body5, 0.2F, 0.3F, 0.0F);
        this.setRotateAngle(jaw, 0.3F, 0.0F, 0.0F);
        this.body.offsetX = -0.01F;
        this.body.offsetY = -0.2F;
        this.body.render(0.01F);
        this.resetToDefaultPose();
    }
    public void renderStaticWall(float f) {
        this.body.rotateAngleY = (float) Math.toRadians(80);
        this.setRotateAngle(jaw, 0.3F, 0.0F, 0.0F);
        this.setRotateAngle(body2, 0.0F, 0.1F, 0.0F);
        this.setRotateAngle(body3, 0.0F, 0.1F, 0.0F);
        this.setRotateAngle(body4, 0.0F, 0.1F, 0.0F);
        this.setRotateAngle(body5, 0.0F, 0.05F, 0.0F);
        this.body.offsetX = -0.01F;
        this.body.offsetZ = -0.12F;
        this.body.offsetY = -0.2F;
        this.body.render(0.01F);
        this.resetToDefaultPose();
    }

    @Override
    public void renderStaticBook(float f) {
        //Rotations, positions and sizing:
        this.body.offsetY = -0.50F;
        this.body.offsetX = -0.15F;
        this.body.rotateAngleY = (float)Math.toRadians(75);
        this.body.rotateAngleX = (float)Math.toRadians(9);
        this.body.rotateAngleZ = (float)Math.toRadians(-2);
        this.body.scaleChildren = true;
        float scaler = 0.62F;
        this.body.setScale(scaler, scaler, scaler);
        //Start of pose:

        //End of pose, now render the model:
        this.body.render(f);
        //Reset rotations, positions and sizing:
        this.body.setScale(1.0F, 1.0F, 1.0F);
        this.body.scaleChildren = false;
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

        AdvancedModelRenderer[] fishTail = {this.body3, this.body4, this.body5};
        ((EntityPrehistoricFloraDiplodoselache)e).tailBuffer.applyChainSwingBuffer(fishTail);

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

            this.swing(body, speed, 0.25F * still, true, 2, 0, f2, 0.5F);
        }
        else {
            this.swing(body, speed, 0.1F, true, 0, 0, f2, 0.5F);
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
            this.body.rotateAngleZ = (float) Math.toRadians(90);
            this.body.offsetY = -0.2F;
            this.bob(body, -speed * 1.8F, 2.5F, false, f2, 1);
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
        animator.rotate(this.jaw, (float) Math.toRadians(37.5), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.endKeyframe();
        animator.setStaticKeyframe(5);
        animator.resetKeyframe(2);

    }
}

