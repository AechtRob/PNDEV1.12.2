package net.lepidodendron.entity.model.entity;

import net.ilexiconn.llibrary.client.model.ModelAnimator;
import net.ilexiconn.llibrary.client.model.tools.AdvancedModelBase;
import net.ilexiconn.llibrary.client.model.tools.AdvancedModelRenderer;
import net.ilexiconn.llibrary.server.animation.IAnimatedEntity;
import net.lepidodendron.entity.EntityPrehistoricFloraProtospinax;
import net.lepidodendron.entity.base.EntityPrehistoricFloraAgeableBase;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLiving;

public class ModelProtospinax extends AdvancedModelBase {
    private ModelAnimator animator;
    private final AdvancedModelRenderer base;
    private final AdvancedModelRenderer cube_r1;
    private final AdvancedModelRenderer cube_r2;
    private final AdvancedModelRenderer cube_r3;
    private final AdvancedModelRenderer cube_r4;
    private final AdvancedModelRenderer cube_r5;
    private final AdvancedModelRenderer cube_r6;
    private final AdvancedModelRenderer cube_r7;
    private final AdvancedModelRenderer cube_r8;
    private final AdvancedModelRenderer dorsalfinright;
    private final AdvancedModelRenderer dorsalfinleft;
    private final AdvancedModelRenderer body1;
    private final AdvancedModelRenderer cube_r9;
    private final AdvancedModelRenderer pelvicfinright;
    private final AdvancedModelRenderer pelvicfinleft;
    private final AdvancedModelRenderer body2;
    private final AdvancedModelRenderer body3;
    private final AdvancedModelRenderer body4;
    private final AdvancedModelRenderer jaw;

    public ModelProtospinax() {
        this.textureWidth = 64;
        this.textureHeight = 64;

        this.base = new AdvancedModelRenderer(this);
        this.base.setRotationPoint(-0.5F, 24.0F, -5.0F);
        this.base.cubeList.add(new ModelBox(base, 0, 10, -3.5F, -5.0F, 1.0F, 8, 5, 9, 0.01F, false));
        this.base.cubeList.add(new ModelBox(base, 0, 24, -0.5F, -2.5F, -8.0F, 2, 2, 10, 0.0F, false));
        this.base.cubeList.add(new ModelBox(base, 38, 24, -3.0F, -4.0F, -1.5F, 7, 4, 3, 0.0F, false));

        this.cube_r1 = new AdvancedModelRenderer(this);
        this.cube_r1.setRotationPoint(1.5F, -0.5F, -8.0F);
        this.base.addChild(cube_r1);
        this.setRotateAngle(cube_r1, 0.0F, 0.3054F, 0.0F);
        this.cube_r1.cubeList.add(new ModelBox(cube_r1, 20, 36, -2.0F, -2.0F, 0.0F, 2, 2, 8, -0.01F, true));

        this.cube_r2 = new AdvancedModelRenderer(this);
        this.cube_r2.setRotationPoint(1.5F, -2.5F, -8.0F);
        this.base.addChild(cube_r2);
        this.setRotateAngle(cube_r2, 0.2443F, 0.2618F, 0.0F);
        this.cube_r2.cubeList.add(new ModelBox(cube_r2, 0, 0, -1.5F, -0.5F, 4.25F, 1, 1, 2, 0.0F, true));

        this.cube_r3 = new AdvancedModelRenderer(this);
        this.cube_r3.setRotationPoint(1.5F, -2.5F, -8.0F);
        this.base.addChild(cube_r3);
        this.setRotateAngle(cube_r3, 0.2443F, 0.3011F, 0.0F);
        this.cube_r3.cubeList.add(new ModelBox(cube_r3, 33, 43, -2.0F, 0.0F, 0.0F, 2, 2, 7, -0.01F, true));

        this.cube_r4 = new AdvancedModelRenderer(this);
        this.cube_r4.setRotationPoint(-0.5F, -2.5F, -8.0F);
        this.base.addChild(cube_r4);
        this.setRotateAngle(cube_r4, 0.2443F, -0.2618F, 0.0F);
        this.cube_r4.cubeList.add(new ModelBox(cube_r4, 0, 0, 0.5F, -0.5F, 4.25F, 1, 1, 2, 0.0F, false));

        this.cube_r5 = new AdvancedModelRenderer(this);
        this.cube_r5.setRotationPoint(-0.5F, -2.5F, -8.0F);
        this.base.addChild(cube_r5);
        this.setRotateAngle(cube_r5, 0.2443F, 0.0F, 0.0F);
        this.cube_r5.cubeList.add(new ModelBox(cube_r5, 34, 14, 0.0F, 0.0F, 0.0F, 2, 2, 8, 0.01F, false));

        this.cube_r6 = new AdvancedModelRenderer(this);
        this.cube_r6.setRotationPoint(-0.5F, -2.5F, -8.0F);
        this.base.addChild(cube_r6);
        this.setRotateAngle(cube_r6, 0.2443F, -0.3011F, 0.0F);
        this.cube_r6.cubeList.add(new ModelBox(cube_r6, 33, 43, 0.0F, 0.0F, 0.0F, 2, 2, 7, -0.01F, false));

        this.cube_r7 = new AdvancedModelRenderer(this);
        this.cube_r7.setRotationPoint(-0.5F, -0.5F, -8.0F);
        this.base.addChild(cube_r7);
        this.setRotateAngle(cube_r7, 0.0F, -0.3054F, 0.0F);
        this.cube_r7.cubeList.add(new ModelBox(cube_r7, 20, 36, 0.0F, -2.0F, 0.0F, 2, 2, 8, -0.01F, false));

        this.cube_r8 = new AdvancedModelRenderer(this);
        this.cube_r8.setRotationPoint(0.0F, -4.0F, -1.0F);
        this.base.addChild(cube_r8);
        this.setRotateAngle(cube_r8, 0.2618F, 0.0F, 0.0F);
        this.cube_r8.cubeList.add(new ModelBox(cube_r8, 38, 0, -2.5F, -0.35F, -0.5F, 6, 1, 3, 0.0F, false));

        this.dorsalfinright = new AdvancedModelRenderer(this);
        this.dorsalfinright.setRotationPoint(-3.5F, -1.5F, 2.5F);
        this.base.addChild(dorsalfinright);
        this.setRotateAngle(dorsalfinright, 0.0F, 0.0F, -0.1745F);
        this.dorsalfinright.cubeList.add(new ModelBox(dorsalfinright, 0, 0, -8.0F, 0.0F, -1.0F, 9, 0, 10, 0.0F, false));
        this.dorsalfinright.cubeList.add(new ModelBox(dorsalfinright, -10, 47, -8.0F, 0.05F, -1.0F, 9, 0, 10, 0.0F, false));

        this.dorsalfinleft = new AdvancedModelRenderer(this);
        this.dorsalfinleft.setRotationPoint(4.5F, -1.5F, 2.5F);
        this.base.addChild(dorsalfinleft);
        this.setRotateAngle(dorsalfinleft, 0.0F, 0.0F, 0.1745F);
        this.dorsalfinleft.cubeList.add(new ModelBox(dorsalfinleft, 0, 0, -1.0F, 0.0F, -1.0F, 9, 0, 10, 0.0F, true));
        this.dorsalfinleft.cubeList.add(new ModelBox(dorsalfinleft, -10, 47, -1.0F, 0.05F, -1.0F, 9, 0, 10, 0.0F, true));

        this.body1 = new AdvancedModelRenderer(this);
        this.body1.setRotationPoint(0.5F, -2.5F, 10.0F);
        this.base.addChild(body1);
        this.body1.cubeList.add(new ModelBox(body1, 32, 4, -3.0F, -1.5F, -0.75F, 6, 4, 6, 0.0F, false));

        this.cube_r9 = new AdvancedModelRenderer(this);
        this.cube_r9.setRotationPoint(-0.5F, -1.5F, 5.25F);
        this.body1.addChild(cube_r9);
        this.setRotateAngle(cube_r9, -0.1309F, 0.0F, 0.0F);
        this.cube_r9.cubeList.add(new ModelBox(cube_r9, 32, 36, -2.0F, 0.0F, -6.0F, 5, 1, 6, 0.0F, false));

        this.pelvicfinright = new AdvancedModelRenderer(this);
        this.pelvicfinright.setRotationPoint(-2.5F, 1.5F, 0.5F);
        this.body1.addChild(pelvicfinright);
        this.setRotateAngle(pelvicfinright, 0.0F, 0.0F, -0.1745F);
        this.pelvicfinright.cubeList.add(new ModelBox(pelvicfinright, 18, 0, -4.75F, 0.0F, -1.0F, 5, 0, 10, 0.0F, false));
        this.pelvicfinright.cubeList.add(new ModelBox(pelvicfinright, 8, 47, -4.75F, 0.025F, -1.0F, 5, 0, 10, 0.0F, false));

        this.pelvicfinleft = new AdvancedModelRenderer(this);
        this.pelvicfinleft.setRotationPoint(2.5F, 1.5F, 0.5F);
        this.body1.addChild(pelvicfinleft);
        this.setRotateAngle(pelvicfinleft, 0.0F, 0.0F, 0.1745F);
        this.pelvicfinleft.cubeList.add(new ModelBox(pelvicfinleft, 18, 0, -0.25F, 0.0F, -1.0F, 5, 0, 10, 0.0F, true));
        this.pelvicfinleft.cubeList.add(new ModelBox(pelvicfinleft, 8, 47, -0.25F, 0.025F, -1.0F, 5, 0, 10, 0.0F, true));

        this.body2 = new AdvancedModelRenderer(this);
        this.body2.setRotationPoint(0.0F, 0.5F, 5.75F);
        this.body1.addChild(body2);
        this.body2.cubeList.add(new ModelBox(body2, 24, 24, -1.5F, -2.0F, -1.0F, 3, 4, 8, -0.01F, false));
        this.body2.cubeList.add(new ModelBox(body2, 0, 5, 0.0F, -6.75F, -0.75F, 0, 5, 4, 0.0F, false));

        this.body3 = new AdvancedModelRenderer(this);
        this.body3.setRotationPoint(0.0F, 0.0F, 7.0F);
        this.body2.addChild(body3);
        this.body3.cubeList.add(new ModelBox(body3, 0, 0, 0.0F, -5.75F, 4.25F, 0, 5, 4, 0.0F, false));
        this.body3.cubeList.add(new ModelBox(body3, 0, 36, -1.0F, -1.5F, -1.0F, 2, 3, 8, 0.0F, false));

        this.body4 = new AdvancedModelRenderer(this);
        this.body4.setRotationPoint(0.0F, 0.0F, 7.0F);
        this.body3.addChild(body4);
        this.body4.cubeList.add(new ModelBox(body4, 44, 45, -0.5F, -1.0F, -1.0F, 1, 2, 7, 0.0F, false));
        this.body4.cubeList.add(new ModelBox(body4, 14, 16, 0.0F, -4.25F, 3.5F, 0, 6, 8, 0.0F, false));

        this.jaw = new AdvancedModelRenderer(this);
        this.jaw.setRotationPoint(0.5F, -0.1F, -1.5F);
        this.base.addChild(jaw);
        this.setRotateAngle(jaw, -0.0873F, 0.0F, 0.0F);
        this.jaw.cubeList.add(new ModelBox(jaw, 25, 14, -2.0F, -1.0F, -2.25F, 4, 1, 3, 0.0F, false));

        updateDefaultPose();
        animator = ModelAnimator.create();
    }

    @Override
    public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        animate((IAnimatedEntity) entity, f, f1, f2, f3, f4, f5);
        this.base.render(f5);
    }

    public void renderStaticWall(float f) {
        this.base.rotateAngleX = (float) Math.toRadians(90);
        this.base.rotateAngleZ = (float) Math.toRadians(90);
        this.base.offsetX = -0.02F;
        this.base.offsetZ = -0.01F;
        this.base.offsetY = -0.245F;
        this.base.render(0.01F);
        resetToDefaultPose();
    }
    public void renderStaticFloor(float f) {
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
        //this.Root.offsetY = 1.45F;
        EntityPrehistoricFloraAgeableBase ee = (EntityPrehistoricFloraAgeableBase) e;

        AdvancedModelRenderer[] fishTail = {this.body2, this.body3, this.body4};
        float speed = 0.1F;
        if (!e.isInWater()) { // if not in water
            speed = 0.7F * 0.5F;
        } else if (!ee.getIsMoving()) {
            speed = 0.7F * 0.13F;
        }


        if (e instanceof EntityLiving && !((EntityLiving) e).isAIDisabled()) {
            if (!e.isInWater()) {
                //this.Root.offsetY = 1.55F;
                //this.bob(body, speed, 5F, false, f2, 1);
                this.chainWave(fishTail, speed*0.1F, 0.05F, -3, f2, 1);
                this.chainSwing(fishTail, speed*0.1F, 0.1F, -3, f2, 1);
                return;
            }


            this.flap(pelvicfinleft, (float) (speed * 0.75), 0.2F, true, 0, 0, f2, 1);
            this.swing(pelvicfinleft, (float) (speed * 0.75), 0.2F, true, 0, 0, f2, 1);
            if(ee.getIsMoving()|| e.isInWater()) { //if moving, slap fins
                this.flap(dorsalfinleft, speed * 2.5F, 0.4F, true, -3, 0, f2, 1);
                this.flap(dorsalfinright, speed* 2.5F, -0.4F, true, -3, 0, f2, 1);
                this.chainWave(fishTail, speed* 2.5F, 0.05F, -3, f2, 1);
                this.chainSwing(fishTail, speed* 2.5F, 0.25F, -3, f2, 1);
            }

            else{ //if not accelerating swing fins instead
                //this.swing(leftFrontFin, (float)(speed*0.15), (float)Math.toRadians(45), false, -0, -0.5F, f2, 1);
                //this.swing(rightFrontFin, (float)(speed*0.15), (float)Math.toRadians(45), false, -3, 0.5F, f2, 1);
                this.flap(dorsalfinleft, (speed), 0.25F, true, -3, 0, f2, 1);
                this.flap(dorsalfinright, (speed), -0.25F, true, -3, 0, f2, 1);
                this.chainWave(fishTail, speed, 0.05F, -3, f2, 1);
                this.chainSwing(fishTail, speed, 0.3F, -3, f2, 1);
            }


            this.flap(pelvicfinright, (float) (speed), 0.2F, true, 0, 0, f2, 1);
            this.swing(pelvicfinright, (float) (speed), 0.2F, true, 0, 0, f2, 1);



        }
    }
    public void animate(IAnimatedEntity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        EntityPrehistoricFloraProtospinax e = (EntityPrehistoricFloraProtospinax) entity;
        animator.update(entity);
        this.resetToDefaultPose();
        setRotationAngles(f, f1, f2, f3, f4, f5, (Entity) entity);

        animator.setAnimation(e.ATTACK_ANIMATION);
        animator.startKeyframe(20);
        animator.rotate(this.jaw, (float) Math.toRadians(35), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.endKeyframe();
        animator.setStaticKeyframe(5);
        animator.resetKeyframe(2);

    }
}
