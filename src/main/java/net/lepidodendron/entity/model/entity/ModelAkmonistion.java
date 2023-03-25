package net.lepidodendron.entity.model.entity;

import net.ilexiconn.llibrary.client.model.ModelAnimator;
import net.ilexiconn.llibrary.client.model.tools.AdvancedModelBase;
import net.ilexiconn.llibrary.client.model.tools.AdvancedModelRenderer;
import net.ilexiconn.llibrary.server.animation.IAnimatedEntity;
import net.lepidodendron.entity.base.EntityPrehistoricFloraAgeableBase;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLiving;

public class ModelAkmonistion extends AdvancedModelBase {
    private final AdvancedModelRenderer body;
    private final AdvancedModelRenderer head;
    private final AdvancedModelRenderer nose_r1;
    private final AdvancedModelRenderer jaw;
    private final AdvancedModelRenderer body1;
    private final AdvancedModelRenderer body1_1_r1;
    private final AdvancedModelRenderer anvil3_r1;
    private final AdvancedModelRenderer anvil2_r1;
    private final AdvancedModelRenderer anvil1_r1;
    private final AdvancedModelRenderer body2;
    private final AdvancedModelRenderer fin1L;
    private final AdvancedModelRenderer fin1R;
    private final AdvancedModelRenderer fin2L;
    private final AdvancedModelRenderer fin2R;
    private final AdvancedModelRenderer body3;
    private final AdvancedModelRenderer body3_2_r1;
    private final AdvancedModelRenderer body3_1_r1;
    private final AdvancedModelRenderer body4;
    private final AdvancedModelRenderer caudalfin;
    private final AdvancedModelRenderer caudalfin_r1;

    private ModelAnimator animator;

    public ModelAkmonistion() {
        this.textureWidth = 64;
        this.textureHeight = 64;

        this.body = new AdvancedModelRenderer(this);
        this.body.setRotationPoint(0.0F, 24.0F, 0.0F);


        this.head = new AdvancedModelRenderer(this);
        this.head.setRotationPoint(0.0F, -3.0F, -4.0F);
        this.body.addChild(head);
        this.head.cubeList.add(new ModelBox(head, 25, 32, -1.5F, -1.0F, -4.0F, 3, 2, 4, 0.0F, false));

        this.nose_r1 = new AdvancedModelRenderer(this);
        this.nose_r1.setRotationPoint(0.0F, 3.0F, 4.0F);
        this.head.addChild(nose_r1);
        this.setRotateAngle(nose_r1, 0.3491F, 0.0F, 0.0F);
        this.nose_r1.cubeList.add(new ModelBox(nose_r1, 12, 17, -1.0F, -6.5F, -7.0F, 2, 2, 1, 0.0F, false));

        this.jaw = new AdvancedModelRenderer(this);
        this.jaw.setRotationPoint(0.0F, 1.0F, 0.0F);
        this.head.addChild(jaw);
        this.jaw.cubeList.add(new ModelBox(jaw, 30, 20, -1.5F, 0.0F, -4.0F, 3, 1, 4, 0.0F, false));

        this.body1 = new AdvancedModelRenderer(this);
        this.body1.setRotationPoint(1.5F, -3.0F, -4.0F);
        this.body.addChild(body1);
        this.body1.cubeList.add(new ModelBox(body1, 0, 26, -2.999F, -1.01F, 0.0F, 3, 3, 5, 0.0F, false));
        this.body1.cubeList.add(new ModelBox(body1, 11, 31, -2.51F, -6.0F, 2.75F, 2, 1, 5, 0.0F, false));
        this.body1.cubeList.add(new ModelBox(body1, 6, 9, -3.0F, -6.0F, 5.0F, 3, 1, 0, 0.0F, false));
        this.body1.cubeList.add(new ModelBox(body1, 0, 7, -3.0F, -6.0F, 5.5F, 3, 1, 0, 0.0F, false));
        this.body1.cubeList.add(new ModelBox(body1, 12, 7, -3.0F, -6.0F, 6.0F, 3, 1, 0, 0.0F, false));
        this.body1.cubeList.add(new ModelBox(body1, 0, 9, -3.0F, -6.0F, 6.5F, 3, 1, 0, 0.0F, false));
        this.body1.cubeList.add(new ModelBox(body1, 12, 9, -3.0F, -6.0F, 7.0F, 3, 1, 0, 0.0F, false));

        this.body1_1_r1 = new AdvancedModelRenderer(this);
        this.body1_1_r1.setRotationPoint(-0.5F, 2.0F, 0.0F);
        this.body1.addChild(body1_1_r1);
        this.setRotateAngle(body1_1_r1, -0.0873F, 0.0F, 0.0F);
        this.body1_1_r1.cubeList.add(new ModelBox(body1_1_r1, 26, 14, -1.99F, -1.0F, 0.0F, 2, 1, 5, 0.0F, false));

        this.anvil3_r1 = new AdvancedModelRenderer(this);
        this.anvil3_r1.setRotationPoint(-2.0F, 3.0F, 5.25F);
        this.body1.addChild(anvil3_r1);
        this.setRotateAngle(anvil3_r1, -0.1745F, 0.0F, 0.0F);
        this.anvil3_r1.cubeList.add(new ModelBox(anvil3_r1, 0, 34, 0.0F, -8.25F, -3.75F, 1, 5, 2, 0.0F, false));

        this.anvil2_r1 = new AdvancedModelRenderer(this);
        this.anvil2_r1.setRotationPoint(-2.0F, 2.25F, 1.5F);
        this.body1.addChild(anvil2_r1);
        this.setRotateAngle(anvil2_r1, -0.5236F, 0.0F, 0.0F);
        this.anvil2_r1.cubeList.add(new ModelBox(anvil2_r1, 0, 0, -0.01F, -9.0F, -0.75F, 1, 5, 2, 0.0F, false));

        this.anvil1_r1 = new AdvancedModelRenderer(this);
        this.anvil1_r1.setRotationPoint(-2.0F, 3.0F, 4.0F);
        this.body1.addChild(anvil1_r1);
        this.setRotateAngle(anvil1_r1, 0.5236F, 0.0F, 0.0F);
        this.anvil1_r1.cubeList.add(new ModelBox(anvil1_r1, 32, 25, 0.01F, -5.75F, -2.0F, 1, 2, 4, 0.0F, false));

        this.body2 = new AdvancedModelRenderer(this);
        this.body2.setRotationPoint(-1.5F, 0.5F, 5.0F);
        this.body1.addChild(body2);
        this.body2.cubeList.add(new ModelBox(body2, 12, 12, -1.5F, -1.5F, 0.0F, 3, 3, 8, 0.0F, false));
        this.body2.cubeList.add(new ModelBox(body2, 0, 0, -1.0F, 1.0F, 0.0F, 2, 1, 8, 0.0F, false));
        this.body2.cubeList.add(new ModelBox(body2, 0, 14, 0.0F, -4.0F, 5.0F, 0, 3, 3, 0.0F, false));

        this.fin1L = new AdvancedModelRenderer(this);
        this.fin1L.setRotationPoint(1.5F, 1.0F, 0.0F);
        this.body2.addChild(fin1L);
        this.setRotateAngle(fin1L, 0.0F, 0.0873F, 0.5236F);
        this.fin1L.cubeList.add(new ModelBox(fin1L, 13, 0, 0.0F, 0.0F, -1.0F, 4, 0, 7, 0.0F, false));

        this.fin1R = new AdvancedModelRenderer(this);
        this.fin1R.setRotationPoint(-1.5F, 1.0F, 0.0F);
        this.body2.addChild(fin1R);
        this.setRotateAngle(fin1R, 0.0F, -0.0873F, -0.5236F);
        this.fin1R.cubeList.add(new ModelBox(fin1R, 5, 0, -4.0F, 0.0F, -1.0F, 4, 0, 7, 0.0F, false));

        this.fin2L = new AdvancedModelRenderer(this);
        this.fin2L.setRotationPoint(1.0F, 1.5F, 7.0F);
        this.body2.addChild(fin2L);
        this.setRotateAngle(fin2L, 0.0F, 0.0F, 0.6981F);
        this.fin2L.cubeList.add(new ModelBox(fin2L, 21, 0, 0.0F, 0.0F, -1.0F, 3, 0, 7, 0.0F, false));

        this.fin2R = new AdvancedModelRenderer(this);
        this.fin2R.setRotationPoint(-1.0F, 1.5F, 7.0F);
        this.body2.addChild(fin2R);
        this.setRotateAngle(fin2R, 0.0F, 0.0F, -0.6981F);
        this.fin2R.cubeList.add(new ModelBox(fin2R, 19, 7, -3.0F, 0.0F, -1.0F, 3, 0, 7, 0.0F, false));

        this.body3 = new AdvancedModelRenderer(this);
        this.body3.setRotationPoint(0.0F, 0.0F, 8.0F);
        this.body2.addChild(body3);
        this.body3.cubeList.add(new ModelBox(body3, 0, 17, -1.5F, -1.0F, 0.0F, 3, 2, 6, 0.0F, false));

        this.body3_2_r1 = new AdvancedModelRenderer(this);
        this.body3_2_r1.setRotationPoint(1.0F, 2.0F, -0.25F);
        this.body3.addChild(body3_2_r1);
        this.setRotateAngle(body3_2_r1, 0.1745F, 0.0F, 0.0F);
        this.body3_2_r1.cubeList.add(new ModelBox(body3_2_r1, 12, 23, -1.99F, -2.0F, 0.0F, 2, 2, 6, 0.0F, false));

        this.body3_1_r1 = new AdvancedModelRenderer(this);
        this.body3_1_r1.setRotationPoint(1.0F, -0.5F, -0.25F);
        this.body3.addChild(body3_1_r1);
        this.setRotateAngle(body3_1_r1, -0.0873F, 0.0F, 0.0F);
        this.body3_1_r1.cubeList.add(new ModelBox(body3_1_r1, 22, 25, -2.0F, -1.0F, 0.0F, 2, 1, 6, 0.0F, false));

        this.body4 = new AdvancedModelRenderer(this);
        this.body4.setRotationPoint(0.0F, 0.0F, 6.0F);
        this.body3.addChild(body4);
        this.body4.cubeList.add(new ModelBox(body4, 32, 3, -1.0F, -0.99F, 0.0F, 2, 2, 4, 0.0F, false));

        this.caudalfin = new AdvancedModelRenderer(this);
        this.caudalfin.setRotationPoint(0.0F, 0.0F, 4.0F);
        this.body4.addChild(caudalfin);
        this.caudalfin.cubeList.add(new ModelBox(caudalfin, 0, 20, -0.5F, -1.0F, 0.0F, 1, 2, 1, 0.0F, false));

        this.caudalfin_r1 = new AdvancedModelRenderer(this);
        this.caudalfin_r1.setRotationPoint(0.0F, 1.0F, 0.0F);
        this.caudalfin.addChild(caudalfin_r1);
        this.setRotateAngle(caudalfin_r1, -0.3491F, -0.0436F, 0.0F);
        this.caudalfin_r1.cubeList.add(new ModelBox(caudalfin_r1, 0, 40, 0.0F, -8.0F, 0.0F, 0, 8, 12, 0.0F, false));

        updateDefaultPose();
        animator = ModelAnimator.create();
    }

    @Override
    public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        animate((IAnimatedEntity) entity, f, f1, f2, f3, f4, f5);
        this.body.render(f5);
    }
    public void renderStaticWall(float f) {
        this.body.rotateAngleY = (float) Math.toRadians(90);
        this.body.offsetY = -0.25F;
        this.body.offsetX = -0.1F;
        this.body.render(0.01F);
        resetToDefaultPose();
    }
    public void renderStaticFloor(float f) {
        this.body.offsetY = -0.2F;
        this.body.offsetZ = -0.1F;
        this.body.offsetX = 0F;
        this.body.render(0.01F);
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
        //this.body.offsetY = 1.0F;

        AdvancedModelRenderer[] fishTail = {this.body2, this.body3, this.body4};
        float speed = 0.2F;
        EntityPrehistoricFloraAgeableBase ee = (EntityPrehistoricFloraAgeableBase) e;
        if (ee.getIsFast()) {
            speed = speed * 3F;
        }
        if (!e.isInWater()) {
            speed = 0.7F;
        }
        if (e instanceof EntityLiving && !((EntityLiving) e).isAIDisabled()) {
            this.chainWave(fishTail, speed, 0.06F, -3, f2, 0.6F);
            this.chainSwing(fishTail, speed, 0.65F, -3, f2, 0.7F);
            this.swing(body, speed, 0.1F, true, 0, 0, f2, 0.5F);
            this.walk(fin1L, (float) (speed * 0.75), 0.1F, true, 0, 0, f2, 0.5F);
            this.swing(fin1L, (float) (speed * 0.75), 0.1F, true, 0, 0, f2, 0.5F);
            this.walk(fin1R, (float) (speed * 0.75), 0.1F, true, 0, 0, f2, 0.5F);
            this.swing(fin1R, (float) (speed * 0.75), 0.1F, true, 0, 0, f2, 0.5F);
            this.walk(fin2L, (float) (speed * 0.75), 0.1F, true, 1, 0, f2, 0.5F);
            this.walk(fin2R, (float) (speed * 0.75), 0.1F, true, 1, 0, f2, 0.5F);

            if (!e.isInWater()) {
                this.body.rotateAngleZ = (float) Math.toRadians(90);
                //this.body.offsetY = 1.0F;
                this.bob(body, -speed, 5F, false, f2, 1);
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
        animator.rotate(this.head, (float) Math.toRadians(-10), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(this.jaw, (float) Math.toRadians(22.5), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.endKeyframe();
        animator.setStaticKeyframe(4);
        animator.resetKeyframe(3);
    }
}