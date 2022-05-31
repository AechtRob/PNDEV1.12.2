package net.lepidodendron.entity.model.entity;

import net.ilexiconn.llibrary.client.model.ModelAnimator;
import net.ilexiconn.llibrary.client.model.tools.AdvancedModelBase;
import net.ilexiconn.llibrary.client.model.tools.AdvancedModelRenderer;
import net.ilexiconn.llibrary.server.animation.IAnimatedEntity;
import net.lepidodendron.entity.base.EntityPrehistoricFloraAgeableBase;
import net.minecraft.block.material.Material;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLiving;
import net.minecraft.util.math.BlockPos;

public class ModelMixopterus extends AdvancedModelBase {
    private final AdvancedModelRenderer carapace;
    private final AdvancedModelRenderer legsR;
    private final AdvancedModelRenderer l1R;
    private final AdvancedModelRenderer l2R;
    private final AdvancedModelRenderer leg2_1R_r1;
    private final AdvancedModelRenderer leg22R;
    private final AdvancedModelRenderer leg2_2R_r1;
    private final AdvancedModelRenderer l3R;
    private final AdvancedModelRenderer l4R;
    private final AdvancedModelRenderer l5R;
    private final AdvancedModelRenderer legsL;
    private final AdvancedModelRenderer l1L;
    private final AdvancedModelRenderer l2L;
    private final AdvancedModelRenderer leg2_1L_r1;
    private final AdvancedModelRenderer leg22L;
    private final AdvancedModelRenderer leg2_2L_r1;
    private final AdvancedModelRenderer l3L;
    private final AdvancedModelRenderer l4L;
    private final AdvancedModelRenderer l5L;
    private final AdvancedModelRenderer body;
    private final AdvancedModelRenderer body2;
    private final AdvancedModelRenderer body3;
    private final AdvancedModelRenderer body4;
    private final AdvancedModelRenderer tail;
    private final AdvancedModelRenderer tail2;
    private final AdvancedModelRenderer tail3;
    private final AdvancedModelRenderer tail4;
    private final AdvancedModelRenderer tail5;
    private final AdvancedModelRenderer tail6;

    private ModelAnimator animator;


    public ModelMixopterus() {
        this.textureWidth = 64;
        this.textureHeight = 64;

        this.carapace = new AdvancedModelRenderer(this);
        this.carapace.setRotationPoint(0.0F, 24.0F, 0.0F);
        this.carapace.cubeList.add(new ModelBox(carapace, 20, 20, -4.0F, -5.0F, -8.0F, 8, 3, 8, 0.0F, false));

        this.legsR = new AdvancedModelRenderer(this);
        this.legsR.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.carapace.addChild(legsR);


        this.l1R = new AdvancedModelRenderer(this);
        this.l1R.setRotationPoint(-2.0F, -2.0F, -8.0F);
        this.legsR.addChild(l1R);
        this.l1R.cubeList.add(new ModelBox(l1R, 0, 24, -4.5F, -0.1F, -8.0F, 6, 0, 8, 0.0F, false));

        this.l2R = new AdvancedModelRenderer(this);
        this.l2R.setRotationPoint(-3.0F, -2.0F, -7.0F);
        this.legsR.addChild(l2R);


        this.leg2_1R_r1 = new AdvancedModelRenderer(this);
        this.leg2_1R_r1.setRotationPoint(3.0F, 2.0F, 7.0F);
        this.l2R.addChild(leg2_1R_r1);
        this.setRotateAngle(leg2_1R_r1, 0.0F, -0.5236F, 0.0F);
        this.leg2_1R_r1.cubeList.add(new ModelBox(leg2_1R_r1, 42, 31, -12.0F, -2.5F, -6.0F, 6, 2, 2, 0.0F, false));

        this.leg22R = new AdvancedModelRenderer(this);
        this.leg22R.setRotationPoint(-4.5F, 0.5F, -3.5F);
        this.l2R.addChild(leg22R);
        this.setRotateAngle(leg22R, 0.0F, 0.3491F, 0.0F);


        this.leg2_2R_r1 = new AdvancedModelRenderer(this);
        this.leg2_2R_r1.setRotationPoint(7.5F, 1.5F, 10.5F);
        this.leg22R.addChild(leg2_2R_r1);
        this.setRotateAngle(leg2_2R_r1, 0.0F, 0.2618F, 0.0F);
        this.leg2_2R_r1.cubeList.add(new ModelBox(leg2_2R_r1, 0, 0, -6.0F, -1.5F, -24.0F, 8, 0, 12, 0.0F, false));

        this.l3R = new AdvancedModelRenderer(this);
        this.l3R.setRotationPoint(-3.0F, -2.0F, -5.0F);
        this.legsR.addChild(l3R);
        this.l3R.cubeList.add(new ModelBox(l3R, 44, 24, -6.0F, 0.0F, 0.0F, 6, 1, 1, 0.0F, false));
        this.l3R.cubeList.add(new ModelBox(l3R, 46, 41, -6.0F, 0.5F, 0.5F, 5, 0, 1, 0.0F, false));

        this.l4R = new AdvancedModelRenderer(this);
        this.l4R.setRotationPoint(-3.0F, -2.0F, -3.0F);
        this.legsR.addChild(l4R);
        this.l4R.cubeList.add(new ModelBox(l4R, 46, 41, -6.0F, 0.5F, 0.5F, 5, 0, 1, 0.0F, false));
        this.l4R.cubeList.add(new ModelBox(l4R, 44, 26, -6.0F, 0.0F, 0.0F, 6, 1, 1, 0.0F, false));

        this.l5R = new AdvancedModelRenderer(this);
        this.l5R.setRotationPoint(-3.0F, -2.0F, 0.0F);
        this.legsR.addChild(l5R);
        this.l5R.cubeList.add(new ModelBox(l5R, 0, 32, -10.0F, 0.0F, -1.0F, 6, 1, 3, 0.0F, false));
        this.l5R.cubeList.add(new ModelBox(l5R, 0, 24, -12.0F, 0.0F, -1.0F, 2, 1, 2, 0.0F, false));
        this.l5R.cubeList.add(new ModelBox(l5R, 0, 16, -4.0F, 0.0F, -1.0F, 4, 1, 2, 0.0F, false));

        this.legsL = new AdvancedModelRenderer(this);
        this.legsL.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.carapace.addChild(legsL);


        this.l1L = new AdvancedModelRenderer(this);
        this.l1L.setRotationPoint(2.0F, -2.0F, -8.0F);
        this.legsL.addChild(l1L);
        this.l1L.cubeList.add(new ModelBox(l1L, 20, 12, -1.5F, -0.1F, -8.0F, 6, 0, 8, 0.0F, false));

        this.l2L = new AdvancedModelRenderer(this);
        this.l2L.setRotationPoint(3.0F, -2.0F, -7.0F);
        this.legsL.addChild(l2L);


        this.leg2_1L_r1 = new AdvancedModelRenderer(this);
        this.leg2_1L_r1.setRotationPoint(-3.0F, 2.0F, 7.0F);
        this.l2L.addChild(leg2_1L_r1);
        this.setRotateAngle(leg2_1L_r1, 0.0F, 0.5236F, 0.0F);
        this.leg2_1L_r1.cubeList.add(new ModelBox(leg2_1L_r1, 0, 43, 6.0F, -2.5F, -6.0F, 6, 2, 2, 0.0F, false));

        this.leg22L = new AdvancedModelRenderer(this);
        this.leg22L.setRotationPoint(4.5F, 0.5F, -3.5F);
        this.l2L.addChild(leg22L);
        this.setRotateAngle(leg22L, 0.0F, -0.3491F, 0.0F);


        this.leg2_2L_r1 = new AdvancedModelRenderer(this);
        this.leg2_2L_r1.setRotationPoint(-7.5F, 1.5F, 10.5F);
        this.leg22L.addChild(leg2_2L_r1);
        this.setRotateAngle(leg2_2L_r1, 0.0F, -0.2618F, 0.0F);
        this.leg2_2L_r1.cubeList.add(new ModelBox(leg2_2L_r1, 0, 12, -2.0F, -1.5F, -24.0F, 8, 0, 12, 0.0F, false));

        this.l3L = new AdvancedModelRenderer(this);
        this.l3L.setRotationPoint(3.0F, -2.0F, -5.0F);
        this.legsL.addChild(l3L);
        this.l3L.cubeList.add(new ModelBox(l3L, 42, 35, 0.0F, 0.0F, 0.0F, 6, 1, 1, 0.0F, false));
        this.l3L.cubeList.add(new ModelBox(l3L, 46, 41, 1.0F, 0.5F, 0.5F, 5, 0, 1, 0.0F, false));

        this.l4L = new AdvancedModelRenderer(this);
        this.l4L.setRotationPoint(3.0F, -2.0F, -3.0F);
        this.legsL.addChild(l4L);
        this.l4L.cubeList.add(new ModelBox(l4L, 46, 41, 1.0F, 0.5F, 0.5F, 5, 0, 1, 0.0F, false));
        this.l4L.cubeList.add(new ModelBox(l4L, 0, 36, 0.0F, 0.0F, 0.0F, 6, 1, 1, 0.0F, false));

        this.l5L = new AdvancedModelRenderer(this);
        this.l5L.setRotationPoint(3.0F, -2.0F, 0.0F);
        this.legsL.addChild(l5L);
        this.l5L.cubeList.add(new ModelBox(l5L, 20, 24, 10.0F, 0.0F, -1.0F, 2, 1, 2, 0.0F, false));
        this.l5L.cubeList.add(new ModelBox(l5L, 0, 39, 4.0F, 0.0F, -1.0F, 6, 1, 3, 0.0F, false));
        this.l5L.cubeList.add(new ModelBox(l5L, 0, 19, 0.0F, 0.0F, -1.0F, 4, 1, 2, 0.0F, false));

        this.body = new AdvancedModelRenderer(this);
        this.body.setRotationPoint(0.0F, -4.0F, 0.0F);
        this.carapace.addChild(body);
        this.body.cubeList.add(new ModelBox(body, 26, 45, -2.5F, -1.0F, 0.0F, 5, 3, 2, 0.0F, false));
        this.body.cubeList.add(new ModelBox(body, 0, 51, -2.99F, -1.01F, 2.0F, 6, 3, 1, 0.0F, false));
        this.body.cubeList.add(new ModelBox(body, 46, 37, 2.5F, 0.0F, 0.0F, 2, 1, 3, 0.0F, false));
        this.body.cubeList.add(new ModelBox(body, 40, 45, -4.5F, 0.0F, 0.0F, 2, 1, 3, 0.0F, false));

        this.body2 = new AdvancedModelRenderer(this);
        this.body2.setRotationPoint(0.0F, 0.5F, 3.0F);
        this.body.addChild(body2);
        this.body2.cubeList.add(new ModelBox(body2, 34, 34, 3.0F, -0.5F, 0.0F, 2, 1, 4, 0.0F, false));
        this.body2.cubeList.add(new ModelBox(body2, 33, 5, -3.0F, -1.5F, 0.0F, 6, 3, 4, 0.0F, false));
        this.body2.cubeList.add(new ModelBox(body2, 16, 34, -5.0F, -0.5F, 0.0F, 2, 1, 4, 0.0F, false));

        this.body3 = new AdvancedModelRenderer(this);
        this.body3.setRotationPoint(0.0F, 0.0F, 4.0F);
        this.body2.addChild(body3);
        this.body3.cubeList.add(new ModelBox(body3, 0, 55, -3.0F, -1.5F, 0.0F, 6, 3, 3, 0.0F, false));
        this.body3.cubeList.add(new ModelBox(body3, 32, 51, 3.01F, -0.49F, 0.0F, 2, 1, 3, 0.0F, false));
        this.body3.cubeList.add(new ModelBox(body3, 20, 51, -5.01F, -0.49F, 0.0F, 2, 1, 3, 0.0F, false));

        this.body4 = new AdvancedModelRenderer(this);
        this.body4.setRotationPoint(0.0F, 0.0F, 3.0F);
        this.body3.addChild(body4);
        this.body4.cubeList.add(new ModelBox(body4, 0, 51, -2.99F, -1.51F, 0.0F, 6, 3, 1, 0.0F, false));
        this.body4.cubeList.add(new ModelBox(body4, 0, 11, 2.5F, -0.5F, 0.0F, 2, 1, 4, 0.0F, false));
        this.body4.cubeList.add(new ModelBox(body4, 18, 39, -2.5F, -1.5F, 1.0F, 5, 3, 3, 0.0F, false));
        this.body4.cubeList.add(new ModelBox(body4, 0, 6, -4.5F, -0.5F, 0.0F, 2, 1, 4, 0.0F, false));

        this.tail = new AdvancedModelRenderer(this);
        this.tail.setRotationPoint(0.0F, -0.5F, 4.0F);
        this.body4.addChild(tail);
        this.tail.cubeList.add(new ModelBox(tail, 40, 12, -2.0F, -0.5F, 0.0F, 4, 2, 4, 0.0F, false));

        this.tail2 = new AdvancedModelRenderer(this);
        this.tail2.setRotationPoint(0.0F, 0.0F, 4.0F);
        this.tail.addChild(tail2);
        this.tail2.cubeList.add(new ModelBox(tail2, 34, 39, -1.999F, -0.51F, 0.0F, 4, 2, 4, 0.0F, false));

        this.tail3 = new AdvancedModelRenderer(this);
        this.tail3.setRotationPoint(0.0F, 0.0F, 4.0F);
        this.tail2.addChild(tail3);
        this.tail3.cubeList.add(new ModelBox(tail3, 12, 45, -1.5F, -0.5F, 0.0F, 3, 2, 4, 0.0F, false));

        this.tail4 = new AdvancedModelRenderer(this);
        this.tail4.setRotationPoint(0.0F, 0.0F, 4.0F);
        this.tail3.addChild(tail4);
        this.tail4.cubeList.add(new ModelBox(tail4, 44, 18, -1.499F, -0.51F, 0.0F, 3, 2, 4, 0.0F, false));

        this.tail5 = new AdvancedModelRenderer(this);
        this.tail5.setRotationPoint(0.0F, 0.0F, 4.0F);
        this.tail4.addChild(tail5);
        this.tail5.cubeList.add(new ModelBox(tail5, 0, 0, -1.0F, -0.5F, 0.0F, 2, 2, 4, 0.0F, false));

        this.tail6 = new AdvancedModelRenderer(this);
        this.tail6.setRotationPoint(0.0F, 0.0F, 4.0F);
        this.tail5.addChild(tail6);
        this.tail6.cubeList.add(new ModelBox(tail6, 24, 31, -0.5F, 0.0F, 0.0F, 1, 1, 6, 0.0F, false));

        updateDefaultPose();
        animator = ModelAnimator.create();
    }

    @Override
    public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        animate((IAnimatedEntity) entity, f, f1, f2, f3, f4, f5);
        this.carapace.render(f5 * 0.3F);
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
        this.carapace.offsetY = 1.0F;

        float speedMultiplier = 1F;
        EntityPrehistoricFloraAgeableBase ee = (EntityPrehistoricFloraAgeableBase) e;
        if (ee.getIsFast()) {
            speedMultiplier = 1.75F;
        }
        AdvancedModelRenderer[] fishTail = {this.tail, this.tail2, this.tail3, this.tail4, this.tail5};
        AdvancedModelRenderer[] fishBody = {this.body, this.body2, this.body3, this.body4, this.tail, this.tail2, this.tail3, this.tail4, this.tail5};
        AdvancedModelRenderer[] fishfinL = {this.l5L};
        AdvancedModelRenderer[] fishfinR = {this.l5R};

        //mouthparts:
        this.swing(l2L, 0.4F, -0.3F, false, 0, -0.1F, f2, 0.8F);
        this.swing(l2R, 0.4F, 0.3F, false, 0, 0.1F, f2, 0.8F);
        this.swing(l1L, 0.4F, 0.2F, false, 0, -0.1F, f2, 0.8F);
        this.swing(l1R, 0.4F, -0.2F, false, 0, 0.1F, f2, 0.8F);

        float speed = 0.4F * speedMultiplier;
        float tailHdegree = 0.0F;
        float paddleVdegree = 0.4F;
        float paddleHdegree = 0.4F;
        float tailSwing = 1.0F;

        if (!e.isInWater()) {
            speed = 0.7F;
        }

        boolean isAtBottom = false;

        if (e.getPosition().getY() - 1 > 1) {
            BlockPos pos = new BlockPos(e.getPosition().getX(), e.getPosition().getY() - 1, e.getPosition().getZ());
            isAtBottom = ((e.isInsideOfMaterial(Material.WATER) || e.isInsideOfMaterial(Material.CORAL))
                    && ((e.world.getBlockState(pos)).getMaterial() != Material.WATER)
                    && ((double)e.getPosition().getY() + 0.334D) > e.posY);
        }

        if (isAtBottom) {
            //System.err.println("Animation at bottom");
            speed = 0.15F * speedMultiplier;
            tailHdegree = 0.4F;
            tailSwing = 0.25F;
            paddleVdegree = 0.1F;
            this.l5L.defaultRotationY = 0F;
            this.l5R.defaultRotationY = 0F;

            this.l3R.rotateAngleZ = -0.6109F;
            this.l4R.rotateAngleZ = -0.6109F;
            this.l3L.rotateAngleZ = 0.6109F;
            this.l4L.rotateAngleZ = 0.6109F;
        }

        if (e instanceof EntityLiving && !((EntityLiving) e).isAIDisabled()) {
            this.chainWave(fishBody, speed, 0.1F, -3, f2, 0.5F);
            this.chainSwing(fishTail, speed, tailHdegree, -2, f2, tailSwing);

            this.chainSwing(fishfinL, speed, -paddleHdegree, -3, f2, 1);
            this.chainWave(fishfinL, speed, paddleVdegree, -3, f2, 2);
            this.chainSwing(fishfinR, speed, paddleHdegree, -3, f2, 1);
            this.chainWave(fishfinR, speed, paddleVdegree, -3, f2, 2);

            if (e.isInWater()) {
                if (!isAtBottom) {
                    this.swing(l3L, speed, 0.2F, false, 0F, 0.4F, f2, 1F);
                    this.swing(l4L, speed, 0.2F, false, 0F, 0.4F, f2, 1F);
                    this.swing(l3R, speed, 0.2F, true, 0F, 0.4F, f2, 1F);
                    this.swing(l4R, speed, 0.2F, true, 0F, 0.4F, f2, 1F);
                } else { //Walking
                    if (f3 != 0.0F) {
                        this.flap(l3L, speed, 0.2F, false, 0F, 0.5F, f2, 1F);
                        this.flap(l4L, speed, 0.2F, false, 3F, 0.5F, f2, 1F);
                        this.flap(l3R, speed, 0.2F, true, 3F, 0.5F, f2, 1F);
                        this.flap(l4R, speed, 0.2F, true, 0F, 0.5F, f2, 1F);

                        this.swing(l3L, speed, 0.2F, false, 0F, 0.4F, f2, 0.8F);
                        this.swing(l4L, speed, 0.2F, false, 3F, 0.4F, f2, 0.8F);
                        this.swing(l3R, speed, 0.2F, true, 3F, 0.4F, f2, 0.8F);
                        this.swing(l4R, speed, 0.2F, true, 0F, 0.4F, f2, 0.8F);
                    }
                }
            }

            //this.swing(body, speed, 0.3F, true, 0, 0, f2, 1);
            if (!isAtBottom) {
                this.bob(carapace, -speed * 0.5F, 2.5F, false, f2, 2);
            }
            if (!e.isInWater()) {
                //this.Bodyfront.rotateAngleZ = (float) Math.toRadians(90);
                this.carapace.offsetY = 1.1F;
                this.bob(carapace, -speed * 1.5F, 2F, false, f2, 1);
                this.chainWave(fishTail, speed, tailHdegree, -3, f2, 1);
                this.chainSwing(fishBody, speed, 0.1F, -2, f2, 1);
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
        animator.rotate(this.body, (float) Math.toRadians(27.5), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(this.body2, (float) Math.toRadians(27.5), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(this.body3, (float) Math.toRadians(27.5), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(this.body4, (float) Math.toRadians(25), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(this.tail, (float) Math.toRadians(25), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(this.tail2, (float) Math.toRadians(22.5), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(this.tail3, (float) Math.toRadians(25), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(this.tail5, (float) Math.toRadians(22.5), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(this.tail6, (float) Math.toRadians(17.5), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.endKeyframe();
        animator.setStaticKeyframe(5);
        animator.resetKeyframe(20);
    }
}
