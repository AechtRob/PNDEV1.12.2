package net.lepidodendron.entity.model.entity;

import net.ilexiconn.llibrary.client.model.ModelAnimator;
import net.ilexiconn.llibrary.client.model.tools.AdvancedModelBase;
import net.ilexiconn.llibrary.client.model.tools.AdvancedModelRenderer;
import net.ilexiconn.llibrary.server.animation.IAnimatedEntity;
import net.lepidodendron.entity.base.EntityPrehistoricFloraAgeableBase;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

public class ModelXenacanthus extends AdvancedModelBase {
    private final AdvancedModelRenderer body;
    private final AdvancedModelRenderer tohead;
    private final AdvancedModelRenderer gill1_r1;
    private final AdvancedModelRenderer head;
    private final AdvancedModelRenderer headbase;
    private final AdvancedModelRenderer head_r1;
    private final AdvancedModelRenderer head_r2;
    private final AdvancedModelRenderer spike;
    private final AdvancedModelRenderer jaw;
    private final AdvancedModelRenderer body1;
    private final AdvancedModelRenderer pectoralfinR;
    private final AdvancedModelRenderer pectoralfinL;
    private final AdvancedModelRenderer body2;
    private final AdvancedModelRenderer body3;
    private final AdvancedModelRenderer body4;
    private final AdvancedModelRenderer pelvicfinR;
    private final AdvancedModelRenderer pelvicfinL;
    private final AdvancedModelRenderer body5;
    private final AdvancedModelRenderer body6;
    private final AdvancedModelRenderer body7;
    private final AdvancedModelRenderer analfinB_r1;
    private final AdvancedModelRenderer body8;
    private final AdvancedModelRenderer body9;
    private final AdvancedModelRenderer body10;
    private final AdvancedModelRenderer body11;
    private final AdvancedModelRenderer body12;

    private ModelAnimator animator;

    public ModelXenacanthus() {
        this.textureWidth = 64;
        this.textureHeight = 64;

        this.body = new AdvancedModelRenderer(this);
        this.body.setRotationPoint(0.0F, 24.0F, -5.0F);


        this.tohead = new AdvancedModelRenderer(this);
        this.tohead.setRotationPoint(0.0F, -2.0F, 2.0F);
        this.body.addChild(tohead);
        this.tohead.cubeList.add(new ModelBox(tohead, 0, 0, -2.0F, -2.0F, -5.0F, 4, 4, 5, 0.0F, false));

        this.gill1_r1 = new AdvancedModelRenderer(this);
        this.gill1_r1.setRotationPoint(0.0F, 2.0F, -2.0F);
        this.tohead.addChild(gill1_r1);
        this.setRotateAngle(gill1_r1, 0.1745F, 0.0F, 0.0F);
        this.gill1_r1.cubeList.add(new ModelBox(gill1_r1, 28, 15, -1.5F, -4.45F, -2.2F, 3, 2, 5, 0.0F, false));

        this.head = new AdvancedModelRenderer(this);
        this.head.setRotationPoint(0.0F, 0.0F, -5.0F);
        this.tohead.addChild(head);


        this.headbase = new AdvancedModelRenderer(this);
        this.headbase.setRotationPoint(0.0F, 1.0F, 0.0F);
        this.head.addChild(headbase);
        this.headbase.cubeList.add(new ModelBox(headbase, 11, 28, -2.0F, -2.0F, -5.0F, 4, 2, 5, 0.0F, false));

        this.head_r1 = new AdvancedModelRenderer(this);
        this.head_r1.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.headbase.addChild(head_r1);
        this.setRotateAngle(head_r1, 0.5236F, 0.0F, 0.0F);
        this.head_r1.cubeList.add(new ModelBox(head_r1, 19, 61, -1.5F, -4.6F, -4.3F, 3, 2, 1, 0.0F, false));

        this.head_r2 = new AdvancedModelRenderer(this);
        this.head_r2.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.headbase.addChild(head_r2);
        this.setRotateAngle(head_r2, 0.0873F, 0.0F, 0.0F);
        this.head_r2.cubeList.add(new ModelBox(head_r2, 14, 3, -1.49F, -2.8F, -4.9692F, 3, 2, 6, 0.0F, false));

        this.spike = new AdvancedModelRenderer(this);
        this.spike.setRotationPoint(0.0F, -2.75F, -0.5F);
        this.headbase.addChild(spike);
        this.setRotateAngle(spike, -1.0472F, 0.0F, 0.0F);
        this.spike.cubeList.add(new ModelBox(spike, 18, 0, 0.0F, -7.5F, -0.5F, 0, 8, 1, 0.0F, false));

        this.jaw = new AdvancedModelRenderer(this);
        this.jaw.setRotationPoint(0.0F, 1.0F, 0.0F);
        this.head.addChild(jaw);
        this.jaw.cubeList.add(new ModelBox(jaw, 27, 9, -1.5F, 0.01F, -4.75F, 3, 1, 5, 0.0F, false));

        this.body1 = new AdvancedModelRenderer(this);
        this.body1.setRotationPoint(0.0F, -2.0F, 2.0F);
        this.body.addChild(body1);
        this.body1.cubeList.add(new ModelBox(body1, 26, 0, -2.0F, -3.0F, 0.0F, 4, 5, 4, 0.0F, false));
        this.body1.cubeList.add(new ModelBox(body1, 10, 32, 0.0F, -4.0F, 0.0F, 0, 1, 4, 0.0F, false));
        this.body1.cubeList.add(new ModelBox(body1, 36, 22, -1.5F, 1.25F, 0.0F, 3, 1, 4, 0.0F, false));

        this.pectoralfinR = new AdvancedModelRenderer(this);
        this.pectoralfinR.setRotationPoint(-2.0F, 1.0F, 0.0F);
        this.body1.addChild(pectoralfinR);
        this.setRotateAngle(pectoralfinR, 0.0F, 0.0F, 0.6981F);
        this.pectoralfinR.cubeList.add(new ModelBox(pectoralfinR, 0, 2, -0.01F, 0.0F, 0.0F, 0, 5, 7, 0.0F, false));

        this.pectoralfinL = new AdvancedModelRenderer(this);
        this.pectoralfinL.setRotationPoint(2.0F, 1.0F, 0.0F);
        this.body1.addChild(pectoralfinL);
        this.setRotateAngle(pectoralfinL, 0.0F, 0.0F, -0.6981F);
        this.pectoralfinL.cubeList.add(new ModelBox(pectoralfinL, 14, 14, 0.01F, 0.0F, 0.0F, 0, 5, 7, 0.0F, false));

        this.body2 = new AdvancedModelRenderer(this);
        this.body2.setRotationPoint(0.0F, 0.0F, 4.0F);
        this.body1.addChild(body2);
        this.body2.cubeList.add(new ModelBox(body2, 24, 24, -2.0F, -3.01F, 0.0F, 4, 5, 4, 0.0F, false));
        this.body2.cubeList.add(new ModelBox(body2, 38, 5, -1.5F, 1.51F, 0.0F, 3, 1, 4, 0.0F, false));
        this.body2.cubeList.add(new ModelBox(body2, 18, 31, 0.0F, -4.0F, 0.0F, 0, 1, 4, 0.0F, false));

        this.body3 = new AdvancedModelRenderer(this);
        this.body3.setRotationPoint(0.0F, 0.0F, 4.0F);
        this.body2.addChild(body3);
        this.body3.cubeList.add(new ModelBox(body3, 0, 24, -2.0F, -3.0F, 0.0F, 4, 5, 4, 0.0F, false));
        this.body3.cubeList.add(new ModelBox(body3, 35, 37, -1.5F, 1.5F, 0.0F, 3, 1, 4, 0.0F, false));
        this.body3.cubeList.add(new ModelBox(body3, 10, 31, 0.0F, -4.0F, 0.0F, 0, 1, 4, 0.0F, false));

        this.body4 = new AdvancedModelRenderer(this);
        this.body4.setRotationPoint(0.0F, 0.0F, 4.0F);
        this.body3.addChild(body4);
        this.body4.cubeList.add(new ModelBox(body4, 14, 11, -2.0F, -3.01F, 0.0F, 4, 5, 4, 0.0F, false));
        this.body4.cubeList.add(new ModelBox(body4, 14, 16, 0.0F, -4.0F, 0.0F, 0, 1, 4, 0.0F, false));
        this.body4.cubeList.add(new ModelBox(body4, 35, 37, -1.5F, 1.25F, -0.01F, 3, 1, 4, 0.0F, false));

        this.pelvicfinR = new AdvancedModelRenderer(this);
        this.pelvicfinR.setRotationPoint(-2.0F, 1.0F, 3.0F);
        this.body4.addChild(pelvicfinR);
        this.setRotateAngle(pelvicfinR, 0.0F, 0.0F, 0.6981F);
        this.pelvicfinR.cubeList.add(new ModelBox(pelvicfinR, 0, 7, -0.01F, 0.0F, -1.0F, 0, 5, 7, 0.0F, false));

        this.pelvicfinL = new AdvancedModelRenderer(this);
        this.pelvicfinL.setRotationPoint(2.0F, 1.0F, 3.0F);
        this.body4.addChild(pelvicfinL);
        this.setRotateAngle(pelvicfinL, 0.0F, 0.0F, -0.6981F);
        this.pelvicfinL.cubeList.add(new ModelBox(pelvicfinL, 0, 12, 0.01F, 0.0F, -1.0F, 0, 5, 7, 0.0F, false));

        this.body5 = new AdvancedModelRenderer(this);
        this.body5.setRotationPoint(0.0F, -1.0F, 4.0F);
        this.body4.addChild(body5);
        this.body5.cubeList.add(new ModelBox(body5, 42, 0, -1.0F, 1.75F, 0.0F, 2, 1, 4, 0.0F, false));
        this.body5.cubeList.add(new ModelBox(body5, 36, 29, -1.5F, -1.75F, 0.0F, 3, 4, 4, 0.0F, false));
        this.body5.cubeList.add(new ModelBox(body5, 28, 18, 0.0F, -3.0F, 0.0F, 0, 2, 4, 0.0F, false));

        this.body6 = new AdvancedModelRenderer(this);
        this.body6.setRotationPoint(0.0F, 0.0F, 4.0F);
        this.body5.addChild(body6);
        this.body6.cubeList.add(new ModelBox(body6, 25, 33, -1.5F, -1.76F, 0.0F, 3, 4, 4, 0.0F, false));
        this.body6.cubeList.add(new ModelBox(body6, 20, 22, 0.0F, -3.0F, 0.0F, 0, 2, 4, 0.0F, false));

        this.body7 = new AdvancedModelRenderer(this);
        this.body7.setRotationPoint(0.0F, 0.0F, 4.0F);
        this.body6.addChild(body7);
        this.body7.cubeList.add(new ModelBox(body7, 0, 33, -1.5F, -1.75F, 0.0F, 3, 4, 4, 0.0F, false));
        this.body7.cubeList.add(new ModelBox(body7, 12, 22, 0.0F, -3.0F, 0.0F, 0, 2, 4, 0.0F, false));

        this.analfinB_r1 = new AdvancedModelRenderer(this);
        this.analfinB_r1.setRotationPoint(0.0F, 3.0F, -26.0F);
        this.body7.addChild(analfinB_r1);
        this.setRotateAngle(analfinB_r1, 0.3491F, 0.0F, 0.0F);
        this.analfinB_r1.cubeList.add(new ModelBox(analfinB_r1, 2, 0, 0.0F, 9.0F, 27.5F, 0, 3, 1, 0.0F, false));
        this.analfinB_r1.cubeList.add(new ModelBox(analfinB_r1, 0, 0, 0.0F, 8.0F, 24.5F, 0, 3, 1, 0.0F, false));

        this.body8 = new AdvancedModelRenderer(this);
        this.body8.setRotationPoint(0.0F, 0.0F, 4.0F);
        this.body7.addChild(body8);
        this.body8.cubeList.add(new ModelBox(body8, 20, 44, 0.0F, -2.5F, 1.0F, 0, 4, 3, 0.0F, false));
        this.body8.cubeList.add(new ModelBox(body8, 20, 46, 0.0F, -0.75F, 1.0F, 0, 3, 3, 0.0F, false));
        this.body8.cubeList.add(new ModelBox(body8, 32, 42, -1.0F, 0.75F, 0.0F, 2, 1, 4, 0.0F, false));
        this.body8.cubeList.add(new ModelBox(body8, 10, 37, -1.5F, -1.5F, 0.0F, 3, 3, 4, 0.0F, false));

        this.body9 = new AdvancedModelRenderer(this);
        this.body9.setRotationPoint(0.0F, 0.0F, 4.0F);
        this.body8.addChild(body9);
        this.body9.cubeList.add(new ModelBox(body9, 12, 40, 0.0F, -2.75F, 0.0F, 0, 4, 4, 0.0F, false));
        this.body9.cubeList.add(new ModelBox(body9, 12, 41, 0.0F, -1.5F, 0.0F, 0, 4, 4, 0.0F, false));
        this.body9.cubeList.add(new ModelBox(body9, 39, 11, -1.0F, -1.51F, 0.0F, 2, 3, 4, 0.0F, false));

        this.body10 = new AdvancedModelRenderer(this);
        this.body10.setRotationPoint(0.0F, 0.0F, 4.0F);
        this.body9.addChild(body10);
        this.body10.cubeList.add(new ModelBox(body10, 0, 41, -1.0F, -1.01F, 0.0F, 2, 2, 4, 0.0F, false));
        this.body10.cubeList.add(new ModelBox(body10, 40, 38, 0.0F, -2.5F, 0.0F, 0, 3, 4, 0.0F, false));
        this.body10.cubeList.add(new ModelBox(body10, 40, 39, 0.0F, -1.0F, 0.0F, 0, 3, 4, 0.0F, false));

        this.body11 = new AdvancedModelRenderer(this);
        this.body11.setRotationPoint(0.0F, 0.0F, 4.0F);
        this.body10.addChild(body11);
        this.body11.cubeList.add(new ModelBox(body11, 0, 43, 0.0F, -2.0F, 0.0F, 0, 3, 4, 0.0F, false));
        this.body11.cubeList.add(new ModelBox(body11, 0, 44, 0.0F, -1.25F, 0.0F, 0, 3, 4, 0.0F, false));
        this.body11.cubeList.add(new ModelBox(body11, 20, 41, -1.0F, -1.0F, 0.0F, 2, 2, 4, 0.0F, false));

        this.body12 = new AdvancedModelRenderer(this);
        this.body12.setRotationPoint(0.0F, 0.0F, 4.0F);
        this.body11.addChild(body12);
        this.body12.cubeList.add(new ModelBox(body12, 26, 8, 0.0F, -1.5F, 0.0F, 0, 3, 3, 0.0F, false));
        this.body12.cubeList.add(new ModelBox(body12, 20, 0, -0.5F, -0.5F, 0.0F, 1, 1, 2, 0.0F, false));

        updateDefaultPose();
        animator = ModelAnimator.create();
    }

    @Override
    public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        animate((IAnimatedEntity) entity, f, f1, f2, f3, f4, f5);
        this.body.render(f5 * 0.52F);
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

        this.body.offsetY = 0.4F;

        AdvancedModelRenderer[] fishTail = {this.body3, this.body4, this.body5, this.body6, this.body7, this.body8, this.body9, this.body10, this.body11};

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
        this.flap(pectoralfinL, (float) (speed * 0.65), 0.4F, false, 0.8F, 0, f2, 0.75F);
        this.swing(pectoralfinL, (float) (speed * 0.65), 0.3F, true, 0, 0, f2, 0.75F);
        this.flap(pectoralfinR, (float) (speed * 0.65), -0.4F, false, 0.8F, 0, f2, 0.75F);
        this.swing(pectoralfinR, (float) (speed * 0.65), -0.3F, true, 0, 0, f2, 0.75F);

        this.flap(pelvicfinL, (float) (speed * 0.65), 0.4F, false, 1.8F, 0, f2, 0.75F);
        this.swing(pelvicfinL, (float) (speed * 0.65), 0.3F, true, 1, 0, f2, 0.75F);
        this.flap(pelvicfinR, (float) (speed * 0.65), -0.4F, false, 1.8F, 0, f2, 0.75F);
        this.swing(pelvicfinR, (float) (speed * 0.65), -0.3F, true, 1, 0, f2, 0.75F);

        if (!e.isInWater()) {
            this.body.rotateAngleZ = (float) Math.toRadians(90);
            this.body.offsetY = 0.55F;
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
        animator.move(this.tohead, 0,0,-0.5F);
        animator.rotate(this.tohead, (float) Math.toRadians(-15), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(this.jaw, (float) Math.toRadians(40), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.endKeyframe();
        animator.setStaticKeyframe(5);
        animator.resetKeyframe(2);

    }
}

