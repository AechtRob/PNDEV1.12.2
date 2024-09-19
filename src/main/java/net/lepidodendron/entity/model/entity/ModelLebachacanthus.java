package net.lepidodendron.entity.model.entity;

import net.ilexiconn.llibrary.client.model.ModelAnimator;
import net.ilexiconn.llibrary.client.model.tools.AdvancedModelRenderer;
import net.ilexiconn.llibrary.server.animation.IAnimatedEntity;
import net.lepidodendron.entity.base.EntityPrehistoricFloraAgeableBase;
import net.lepidodendron.entity.model.ModelBasePalaeopedia;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

public class ModelLebachacanthus extends ModelBasePalaeopedia {
    private final AdvancedModelRenderer body;
    private final AdvancedModelRenderer gill3_r1;
    private final AdvancedModelRenderer pectoralfinR;
    private final AdvancedModelRenderer pectoralfinL;
    private final AdvancedModelRenderer tohead;
    private final AdvancedModelRenderer head;
    private final AdvancedModelRenderer headbase;
    private final AdvancedModelRenderer head_r1;
    private final AdvancedModelRenderer face_r1;
    private final AdvancedModelRenderer face_r2;
    private final AdvancedModelRenderer jaw;
    private final AdvancedModelRenderer jaw_r1;
    private final AdvancedModelRenderer body1;
    private final AdvancedModelRenderer spike;
    private final AdvancedModelRenderer body2;
    private final AdvancedModelRenderer pelvicfinR;
    private final AdvancedModelRenderer pelvicfinL;
    private final AdvancedModelRenderer body3;
    private final AdvancedModelRenderer belly3_r1;
    private final AdvancedModelRenderer body4;
    private final AdvancedModelRenderer belly5_r1;
    private final AdvancedModelRenderer belly4_r1;
    private final AdvancedModelRenderer body5;
    private final AdvancedModelRenderer analfinA_r1;
    private final AdvancedModelRenderer belly5_r2;
    private final AdvancedModelRenderer body6;
    private final AdvancedModelRenderer body7_r1;
    private final AdvancedModelRenderer analfinA_r2;
    private final AdvancedModelRenderer body7;

    private ModelAnimator animator;

    public ModelLebachacanthus() {
        this.textureWidth = 88;
        this.textureHeight = 104;

        this.body = new AdvancedModelRenderer(this);
        this.body.setRotationPoint(0.0F, 21.0F, -6.0F);
        this.body.cubeList.add(new ModelBox(body, 0, 33, -3.5F, -5.75F, -5.9F, 7, 7, 6, -0.01F, false));

        this.gill3_r1 = new AdvancedModelRenderer(this);
        this.gill3_r1.setRotationPoint(0.0F, 1.0F, -6.0F);
        this.body.addChild(gill3_r1);
        this.setRotateAngle(gill3_r1, -0.1309F, 0.0F, 0.0F);
        this.gill3_r1.cubeList.add(new ModelBox(gill3_r1, 34, 59, -2.5F, -0.75F, 0.2F, 5, 1, 6, 0.0F, false));

        this.pectoralfinR = new AdvancedModelRenderer(this);
        this.pectoralfinR.setRotationPoint(-3.25F, 1.0F, 0.0F);
        this.body.addChild(pectoralfinR);
        this.setRotateAngle(pectoralfinR, -0.1745F, 0.0F, 0.7854F);
        this.pectoralfinR.cubeList.add(new ModelBox(pectoralfinR, 0, 56, -0.01F, -1.0F, -1.0F, 0, 8, 14, 0.0F, false));

        this.pectoralfinL = new AdvancedModelRenderer(this);
        this.pectoralfinL.setRotationPoint(3.25F, 1.0F, 0.0F);
        this.body.addChild(pectoralfinL);
        this.setRotateAngle(pectoralfinL, -0.1745F, 0.0F, -0.7854F);
        this.pectoralfinL.cubeList.add(new ModelBox(pectoralfinL, 0, 56, 0.01F, -1.0F, -1.0F, 0, 8, 14, 0.0F, true));

        this.tohead = new AdvancedModelRenderer(this);
        this.tohead.setRotationPoint(0.0F, -2.0F, -6.0F);
        this.body.addChild(tohead);


        this.head = new AdvancedModelRenderer(this);
        this.head.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.tohead.addChild(head);


        this.headbase = new AdvancedModelRenderer(this);
        this.headbase.setRotationPoint(0.0F, 1.0F, 1.0F);
        this.head.addChild(headbase);
        this.headbase.cubeList.add(new ModelBox(headbase, 18, 39, -3.0F, -3.0F, -8.0F, 6, 3, 8, 0.0F, false));
        this.headbase.cubeList.add(new ModelBox(headbase, 63, 94, -3.0F, -2.35F, -7.6F, 6, 1, 1, 0.01F, false));
        this.headbase.cubeList.add(new ModelBox(headbase, 54, 31, -2.5F, -0.5F, -7.85F, 5, 1, 7, -0.01F, false));

        this.head_r1 = new AdvancedModelRenderer(this);
        this.head_r1.setRotationPoint(0.0F, 0.0F, -3.0F);
        this.headbase.addChild(head_r1);
        this.setRotateAngle(head_r1, -0.6981F, 0.0F, 0.0F);
        this.head_r1.cubeList.add(new ModelBox(head_r1, 60, 19, -2.5F, 0.15F, -5.8F, 5, 3, 2, 0.0F, false));

        this.face_r1 = new AdvancedModelRenderer(this);
        this.face_r1.setRotationPoint(0.0F, 1.0F, 0.0F);
        this.headbase.addChild(face_r1);
        this.setRotateAngle(face_r1, 0.1309F, 0.0F, 0.0F);
        this.face_r1.cubeList.add(new ModelBox(face_r1, 52, 0, -2.5F, -5.6F, -6.85F, 5, 2, 7, 0.01F, false));

        this.face_r2 = new AdvancedModelRenderer(this);
        this.face_r2.setRotationPoint(0.0F, 2.7F, 3.0F);
        this.headbase.addChild(face_r2);
        this.setRotateAngle(face_r2, -0.2182F, 0.0F, 0.0F);
        this.face_r2.cubeList.add(new ModelBox(face_r2, 63, 83, -3.0F, -2.0F, -8.0F, 6, 1, 4, -0.01F, false));

        this.jaw = new AdvancedModelRenderer(this);
        this.jaw.setRotationPoint(0.0F, 1.0F, 0.0F);
        this.head.addChild(jaw);
        this.jaw.cubeList.add(new ModelBox(jaw, 55, 52, -2.5F, 0.01F, -6.85F, 5, 1, 7, 0.0F, false));
        this.jaw.cubeList.add(new ModelBox(jaw, 64, 88, -2.5F, -2.99F, -2.85F, 5, 3, 3, 0.0F, false));
        this.jaw.cubeList.add(new ModelBox(jaw, 60, 12, -2.5F, -0.49F, -6.75F, 5, 1, 6, -0.02F, false));

        this.jaw_r1 = new AdvancedModelRenderer(this);
        this.jaw_r1.setRotationPoint(0.0F, 1.0F, -6.85F);
        this.jaw.addChild(jaw_r1);
        this.setRotateAngle(jaw_r1, -0.1571F, 0.0F, 0.0F);
        this.jaw_r1.cubeList.add(new ModelBox(jaw_r1, 26, 8, -2.0F, -1.99F, 6.3F, 4, 1, 1, 0.0F, false));
        this.jaw_r1.cubeList.add(new ModelBox(jaw_r1, 18, 0, -2.0F, -0.99F, 0.0F, 4, 1, 7, 0.0F, false));

        this.body1 = new AdvancedModelRenderer(this);
        this.body1.setRotationPoint(0.0F, -2.0F, 0.0F);
        this.body.addChild(body1);
        this.body1.cubeList.add(new ModelBox(body1, 20, 21, -3.5F, -3.85F, 0.0F, 7, 8, 10, 0.0F, false));
        this.body1.cubeList.add(new ModelBox(body1, 20, 47, 0.0F, -7.5F, 0.0F, 0, 4, 10, 0.0F, false));

        this.spike = new AdvancedModelRenderer(this);
        this.spike.setRotationPoint(0.0F, -3.35F, 1.0F);
        this.body1.addChild(spike);
        this.setRotateAngle(spike, -1.4399F, 0.0F, 0.0F);
        this.spike.cubeList.add(new ModelBox(spike, 4, 0, -0.5F, -3.5F, -0.5F, 1, 3, 1, 0.0F, false));
        this.spike.cubeList.add(new ModelBox(spike, 4, 0, -0.5F, -3.0F, -0.5F, 1, 3, 1, -0.01F, false));

        this.body2 = new AdvancedModelRenderer(this);
        this.body2.setRotationPoint(0.0F, -0.25F, 10.0F);
        this.body1.addChild(body2);
        this.body2.cubeList.add(new ModelBox(body2, 30, 0, -3.0F, -3.51F, -1.0F, 6, 8, 10, -0.01F, false));
        this.body2.cubeList.add(new ModelBox(body2, 0, 37, 0.0F, -6.75F, 0.0F, 0, 4, 9, 0.0F, false));

        this.pelvicfinR = new AdvancedModelRenderer(this);
        this.pelvicfinR.setRotationPoint(-1.5F, 4.0F, 9.5F);
        this.body2.addChild(pelvicfinR);
        this.setRotateAngle(pelvicfinR, 0.0F, 0.0F, 0.5672F);
        this.pelvicfinR.cubeList.add(new ModelBox(pelvicfinR, 0, 0, 0.04F, -2.0F, -3.0F, 0, 8, 15, 0.0F, false));

        this.pelvicfinL = new AdvancedModelRenderer(this);
        this.pelvicfinL.setRotationPoint(1.5F, 4.0F, 9.5F);
        this.body2.addChild(pelvicfinL);
        this.setRotateAngle(pelvicfinL, 0.0F, 0.0F, -0.5672F);
        this.pelvicfinL.cubeList.add(new ModelBox(pelvicfinL, 0, 0, -0.04F, -2.0F, -3.0F, 0, 8, 15, 0.0F, true));

        this.body3 = new AdvancedModelRenderer(this);
        this.body3.setRotationPoint(0.0F, -0.5F, 9.0F);
        this.body2.addChild(body3);
        this.body3.cubeList.add(new ModelBox(body3, 0, 0, -2.5F, -2.75F, -1.0F, 5, 7, 8, 0.0F, false));
        this.body3.cubeList.add(new ModelBox(body3, 58, 53, 0.0F, -6.35F, 0.0F, 0, 4, 7, 0.0F, false));

        this.belly3_r1 = new AdvancedModelRenderer(this);
        this.belly3_r1.setRotationPoint(0.0F, 4.75F, 0.0F);
        this.body3.addChild(belly3_r1);
        this.setRotateAngle(belly3_r1, 0.0436F, 0.0F, 0.0F);
        this.belly3_r1.cubeList.add(new ModelBox(belly3_r1, 54, 39, -2.0F, -1.0F, -1.0F, 4, 1, 8, 0.0F, false));

        this.body4 = new AdvancedModelRenderer(this);
        this.body4.setRotationPoint(0.0F, 0.0F, 7.0F);
        this.body3.addChild(body4);
        this.body4.cubeList.add(new ModelBox(body4, 44, 18, -2.0F, -2.51F, -1.0F, 4, 5, 8, 0.0F, false));
        this.body4.cubeList.add(new ModelBox(body4, 54, 41, 0.0F, -6.0F, 0.0F, 0, 4, 7, 0.0F, false));

        this.belly5_r1 = new AdvancedModelRenderer(this);
        this.belly5_r1.setRotationPoint(0.0F, 1.75F, 0.0F);
        this.body4.addChild(belly5_r1);
        this.setRotateAngle(belly5_r1, 0.0524F, 0.0F, 0.0F);
        this.belly5_r1.cubeList.add(new ModelBox(belly5_r1, 0, 58, -1.5F, 0.0F, -1.01F, 3, 1, 8, 0.0F, false));

        this.belly4_r1 = new AdvancedModelRenderer(this);
        this.belly4_r1.setRotationPoint(0.0F, 2.75F, 0.0F);
        this.body4.addChild(belly4_r1);
        this.setRotateAngle(belly4_r1, 0.0524F, 0.0F, 0.0F);
        this.belly4_r1.cubeList.add(new ModelBox(belly4_r1, 0, 58, -1.5F, 0.0F, -1.01F, 3, 1, 8, 0.0F, false));

        this.body5 = new AdvancedModelRenderer(this);
        this.body5.setRotationPoint(0.0F, -0.75F, 7.0F);
        this.body4.addChild(body5);
        this.body5.cubeList.add(new ModelBox(body5, 40, 47, -1.5F, -1.5F, -1.0F, 3, 4, 8, 0.0F, false));
        this.body5.cubeList.add(new ModelBox(body5, 26, 54, 0.0F, -4.75F, 0.0F, 0, 4, 7, 0.0F, false));

        this.analfinA_r1 = new AdvancedModelRenderer(this);
        this.analfinA_r1.setRotationPoint(0.0F, 4.7F, -14.5F);
        this.body5.addChild(analfinA_r1);
        this.setRotateAngle(analfinA_r1, 0.9163F, 0.0F, 0.0F);
        this.analfinA_r1.cubeList.add(new ModelBox(analfinA_r1, 32, 66, 0.0F, 11.0F, 9.5F, 0, 7, 4, 0.0F, false));

        this.belly5_r2 = new AdvancedModelRenderer(this);
        this.belly5_r2.setRotationPoint(-0.5F, 3.0F, 0.0F);
        this.body5.addChild(belly5_r2);
        this.setRotateAngle(belly5_r2, 0.0524F, 0.0F, 0.0F);
        this.belly5_r2.cubeList.add(new ModelBox(belly5_r2, 66, 60, -0.5F, -1.0F, -1.01F, 2, 2, 8, -0.01F, false));

        this.body6 = new AdvancedModelRenderer(this);
        this.body6.setRotationPoint(0.0F, -0.25F, 7.0F);
        this.body5.addChild(body6);
        this.body6.cubeList.add(new ModelBox(body6, 16, 61, -1.0F, -1.01F, -1.0F, 2, 3, 6, 0.0F, false));
        this.body6.cubeList.add(new ModelBox(body6, 69, 73, 0.0F, -5.25F, 0.0F, 0, 5, 5, 0.0F, false));

        this.body7_r1 = new AdvancedModelRenderer(this);
        this.body7_r1.setRotationPoint(0.0F, 7.0F, -21.575F);
        this.body6.addChild(body7_r1);
        this.setRotateAngle(body7_r1, 0.0873F, 0.0F, 0.0F);
        this.body7_r1.cubeList.add(new ModelBox(body7_r1, 67, 70, -1.0F, -3.51F, 21.0F, 2, 2, 6, -0.02F, false));

        this.analfinA_r2 = new AdvancedModelRenderer(this);
        this.analfinA_r2.setRotationPoint(0.0F, 4.9F, -22.1F);
        this.body6.addChild(analfinA_r2);
        this.setRotateAngle(analfinA_r2, 0.9338F, 0.0F, 0.0F);
        this.analfinA_r2.cubeList.add(new ModelBox(analfinA_r2, 58, 67, 0.0F, 15.5F, 14.5F, 0, 9, 4, 0.0F, false));

        this.body7 = new AdvancedModelRenderer(this);
        this.body7.setRotationPoint(0.0F, 0.0F, 5.0F);
        this.body6.addChild(body7);
        this.body7.cubeList.add(new ModelBox(body7, 36, 79, 0.0F, -5.25F, 0.0F, 0, 9, 10, 0.0F, false));
        this.body7.cubeList.add(new ModelBox(body7, 49, 60, -0.5F, -0.75F, -1.0F, 1, 3, 7, 0.0F, false));

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
        this.body.rotateAngleX = (float) Math.toRadians(-15);
        this.body2.rotateAngleX = (float) Math.toRadians(5);
        this.body3.rotateAngleX = (float) Math.toRadians(7.5);
        this.body4.rotateAngleX = (float) Math.toRadians(7.5);
        this.body5.rotateAngleX = (float) Math.toRadians(10);
        this.body.offsetY = -0.2F;
        this.body.offsetX = -0.1F;
        this.body.offsetZ = 0.075F;
        this.jaw.rotateAngleX = (float) Math.toRadians(25);
        this.body.render(0.01F);
        this.resetToDefaultPose();
    }
    public void renderStaticFloor(float f) {
        this.setRotateAngle(body, 0.1F, -0.4F, 0.0F);
        this.setRotateAngle(head, -0.2F, -0.3F, 0.0F);
        this.setRotateAngle(body2, 0.1F, 0.2F, 0.0F);
        this.setRotateAngle(body3, 0.2F, 0.3F, 0.0F);
        this.setRotateAngle(body4, 0.2F, 0.5F, 0.0F);
        this.setRotateAngle(body5, 0.2F, 0.5F, 0.0F);
        this.setRotateAngle(body6, 0.2F, 0.5F, 0.0F);
        this.setRotateAngle(jaw, 0.4F, 0.0F, 0.0F);
        this.body.offsetZ = -0.1F;
        this.body.offsetY = -0.2F;
        this.body.offsetX = 0.05F;
        this.body.render(0.01F);
        this.resetToDefaultPose();
    }
    public void renderStaticSuspended(float f) {
        this.setRotateAngle(body, 0.1F, -0.4F, 0.0F);
        this.setRotateAngle(head, 0.0F, -0.3F, 0.0F);
        this.setRotateAngle(body2, 0.0F, 0.2F, 0.0F);
        this.setRotateAngle(body3, 0.0F, -0.3F, 0.0F);
        this.setRotateAngle(body4, 0.0F, -0.5F, 0.0F);
        this.setRotateAngle(body5, 0.0F, -0.5F, 0.0F);
        this.setRotateAngle(body6, 0.0F, -0.5F, 0.0F);
        this.setRotateAngle(jaw, 0.4F, 0.0F, 0.0F);
        this.body.offsetZ = -0.1F;
        this.body.offsetY = -0.2F;
        this.body.offsetX = 0.05F;
        this.body.render(0.01F);
        this.resetToDefaultPose();
    }

    @Override
    public void renderStaticBook(float f) {

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

        //this.body.offsetY = 0.5F;

        AdvancedModelRenderer[] fishTail = {this.body2, this.body3, this.body4, this.body5, this.body6, this.body7};

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
            this.body.offsetY = 0.05F;
            this.bob(body, -speed * 1.8F, 2.5F, false, f2, 1);
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
        animator.rotate(this.jaw, (float) Math.toRadians(27.5), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.endKeyframe();
        animator.setStaticKeyframe(5);
        animator.resetKeyframe(2);

    }
}

