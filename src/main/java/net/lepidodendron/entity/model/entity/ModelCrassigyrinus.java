package net.lepidodendron.entity.model.entity;

import net.ilexiconn.llibrary.client.model.ModelAnimator;
import net.ilexiconn.llibrary.client.model.tools.AdvancedModelRenderer;
import net.ilexiconn.llibrary.server.animation.IAnimatedEntity;
import net.lepidodendron.entity.EntityPrehistoricFloraCrassigyrinus;
import net.lepidodendron.entity.base.EntityPrehistoricFloraAgeableBase;
import net.lepidodendron.entity.model.llibraryextensions.AdvancedModelBaseExtended;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

public class ModelCrassigyrinus extends AdvancedModelBaseExtended {
    private final AdvancedModelRenderer body;
    private final AdvancedModelRenderer head;
    private final AdvancedModelRenderer upperjaw;
    private final AdvancedModelRenderer cube_r1;
    private final AdvancedModelRenderer lowerjaw;
    private final AdvancedModelRenderer cube_r2;
    private final AdvancedModelRenderer armR;
    private final AdvancedModelRenderer armR2;
    private final AdvancedModelRenderer armL;
    private final AdvancedModelRenderer armL2;
    private final AdvancedModelRenderer body2;
    private final AdvancedModelRenderer body3;
    private final AdvancedModelRenderer cube_r3;
    private final AdvancedModelRenderer legR;
    private final AdvancedModelRenderer legR2;
    private final AdvancedModelRenderer legR3;
    private final AdvancedModelRenderer legL;
    private final AdvancedModelRenderer legL2;
    private final AdvancedModelRenderer legL3;
    private final AdvancedModelRenderer tail;
    private final AdvancedModelRenderer tail2;
    private final AdvancedModelRenderer tail3;

    private ModelAnimator animator;

    public ModelCrassigyrinus() {
        this.textureWidth = 128;
        this.textureHeight = 128;

        this.body = new AdvancedModelRenderer(this);
        this.body.setRotationPoint(0.0F, 27.0F, 4.0F);
        this.body.cubeList.add(new ModelBox(body, 0, 0, -3.5F, -11.0F, -13.75F, 7, 8, 15, 0.0F, false));

        this.head = new AdvancedModelRenderer(this);
        this.head.setRotationPoint(0.0F, -6.9F, -13.5F);
        this.body.addChild(head);


        this.upperjaw = new AdvancedModelRenderer(this);
        this.upperjaw.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.head.addChild(upperjaw);
        this.upperjaw.cubeList.add(new ModelBox(upperjaw, 40, 15, -3.0F, -4.0F, -8.0F, 6, 4, 8, 0.0F, false));
        this.upperjaw.cubeList.add(new ModelBox(upperjaw, 0, 0, -3.0F, -3.5F, -7.5F, 6, 1, 1, 0.01F, false));
        this.upperjaw.cubeList.add(new ModelBox(upperjaw, 60, 17, -3.0F, -2.0F, -12.0F, 6, 2, 4, 0.0F, false));
        this.upperjaw.cubeList.add(new ModelBox(upperjaw, 45, 0, -3.0F, -0.25F, -10.9F, 6, 1, 8, -0.01F, false));
        this.upperjaw.cubeList.add(new ModelBox(upperjaw, 5, 2, -2.5F, -0.25F, -11.9F, 5, 1, 0, 0.0F, false));

        this.cube_r1 = new AdvancedModelRenderer(this);
        this.cube_r1.setRotationPoint(0.0F, -2.0F, -12.0F);
        this.upperjaw.addChild(cube_r1);
        this.setRotateAngle(cube_r1, 0.3927F, 0.0F, 0.0F);
        this.cube_r1.cubeList.add(new ModelBox(cube_r1, 62, 37, -3.0F, 0.0F, 0.0F, 6, 2, 5, -0.01F, false));

        this.lowerjaw = new AdvancedModelRenderer(this);
        this.lowerjaw.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.head.addChild(lowerjaw);
        this.lowerjaw.cubeList.add(new ModelBox(lowerjaw, 0, 75, -3.0F, -2.9F, -3.0F, 6, 3, 3, -0.01F, false));
        this.lowerjaw.cubeList.add(new ModelBox(lowerjaw, 60, 9, -3.0F, 0.0F, -5.0F, 6, 3, 5, 0.0F, false));
        this.lowerjaw.cubeList.add(new ModelBox(lowerjaw, 43, 56, -3.0F, 0.0F, -12.0F, 6, 1, 7, 0.0F, false));
        this.lowerjaw.cubeList.add(new ModelBox(lowerjaw, 54, 27, -3.0F, -0.75F, -11.4F, 6, 1, 8, -0.02F, false));
        this.lowerjaw.cubeList.add(new ModelBox(lowerjaw, 5, 3, -2.5F, -0.75F, -11.875F, 5, 1, 0, 0.0F, false));

        this.cube_r2 = new AdvancedModelRenderer(this);
        this.cube_r2.setRotationPoint(0.0F, 1.0F, -12.0F);
        this.lowerjaw.addChild(cube_r2);
        this.setRotateAngle(cube_r2, -0.2443F, 0.0F, 0.0F);
        this.cube_r2.cubeList.add(new ModelBox(cube_r2, 17, 55, -2.5F, -1.0F, 0.0F, 5, 1, 8, 0.0F, false));
        this.cube_r2.cubeList.add(new ModelBox(cube_r2, 45, 9, -2.5F, -2.0F, 4.0F, 5, 1, 3, 0.0F, false));

        this.armR = new AdvancedModelRenderer(this);
        this.armR.setRotationPoint(-3.25F, -5.0F, -13.5F);
        this.body.addChild(armR);
        this.setRotateAngle(armR, -0.3491F, -0.6545F, 0.0F);
        this.armR.cubeList.add(new ModelBox(armR, 0, 7, -0.5F, -0.5F, 0.0F, 1, 1, 3, 0.0F, false));

        this.armR2 = new AdvancedModelRenderer(this);
        this.armR2.setRotationPoint(0.0F, 0.0F, 3.0F);
        this.armR.addChild(armR2);
        this.setRotateAngle(armR2, 0.0F, 0.3927F, 0.0F);
        this.armR2.cubeList.add(new ModelBox(armR2, 0, 1, 0.0F, -0.5F, 0.0F, 0, 1, 1, 0.0F, false));

        this.armL = new AdvancedModelRenderer(this);
        this.armL.setRotationPoint(3.25F, -5.0F, -13.5F);
        this.body.addChild(armL);
        this.setRotateAngle(armL, -0.3491F, 0.6545F, 0.0F);
        this.armL.cubeList.add(new ModelBox(armL, 0, 7, -0.5F, -0.5F, 0.0F, 1, 1, 3, 0.0F, true));

        this.armL2 = new AdvancedModelRenderer(this);
        this.armL2.setRotationPoint(0.0F, 0.0F, 3.0F);
        this.armL.addChild(armL2);
        this.setRotateAngle(armL2, 0.0F, -0.3927F, 0.0F);
        this.armL2.cubeList.add(new ModelBox(armL2, 0, 1, 0.0F, -0.5F, 0.0F, 0, 1, 1, 0.0F, true));

        this.body2 = new AdvancedModelRenderer(this);
        this.body2.setRotationPoint(0.0F, -8.0F, 1.25F);
        this.body.addChild(body2);
        this.body2.cubeList.add(new ModelBox(body2, 18, 23, -3.0F, -2.75F, -1.0F, 6, 7, 10, 0.0F, false));

        this.body3 = new AdvancedModelRenderer(this);
        this.body3.setRotationPoint(0.0F, 0.0F, 9.0F);
        this.body2.addChild(body3);
        this.body3.cubeList.add(new ModelBox(body3, 43, 42, -2.5F, -2.5F, -1.0F, 5, 5, 9, 0.0F, false));

        this.cube_r3 = new AdvancedModelRenderer(this);
        this.cube_r3.setRotationPoint(0.0F, 2.5F, 8.0F);
        this.body3.addChild(cube_r3);
        this.setRotateAngle(cube_r3, 0.1745F, 0.0F, 0.0F);
        this.cube_r3.cubeList.add(new ModelBox(cube_r3, 0, 55, -2.0F, -2.0F, -9.0F, 4, 2, 9, 0.0F, false));

        this.legR = new AdvancedModelRenderer(this);
        this.legR.setRotationPoint(-2.25F, 2.0F, 0.25F);
        this.body3.addChild(legR);
        this.setRotateAngle(legR, -0.3927F, -0.48F, 0.0F);
        this.legR.cubeList.add(new ModelBox(legR, 0, 2, -0.5F, -1.5F, 0.0F, 1, 2, 3, 0.0F, false));

        this.legR2 = new AdvancedModelRenderer(this);
        this.legR2.setRotationPoint(0.25F, 0.0F, 3.0F);
        this.legR.addChild(legR2);
        this.setRotateAngle(legR2, 0.2618F, 0.2618F, 0.0F);
        this.legR2.cubeList.add(new ModelBox(legR2, 5, 4, -0.5F, -0.75F, -0.75F, 1, 1, 3, -0.01F, false));

        this.legR3 = new AdvancedModelRenderer(this);
        this.legR3.setRotationPoint(0.25F, -0.25F, 2.25F);
        this.legR2.addChild(legR3);
        this.setRotateAngle(legR3, 0.0F, 0.2182F, 0.0F);
        this.legR3.cubeList.add(new ModelBox(legR3, 5, 6, 0.0F, -1.0F, -1.0F, 0, 2, 2, 0.0F, false));

        this.legL = new AdvancedModelRenderer(this);
        this.legL.setRotationPoint(2.25F, 2.0F, 0.25F);
        this.body3.addChild(legL);
        this.setRotateAngle(legL, -0.3927F, 0.48F, 0.0F);
        this.legL.cubeList.add(new ModelBox(legL, 0, 2, -0.5F, -1.5F, 0.0F, 1, 2, 3, 0.0F, true));

        this.legL2 = new AdvancedModelRenderer(this);
        this.legL2.setRotationPoint(-0.25F, 0.0F, 3.0F);
        this.legL.addChild(legL2);
        this.setRotateAngle(legL2, 0.2618F, -0.2618F, 0.0F);
        this.legL2.cubeList.add(new ModelBox(legL2, 5, 4, -0.5F, -0.75F, -0.75F, 1, 1, 3, -0.01F, true));

        this.legL3 = new AdvancedModelRenderer(this);
        this.legL3.setRotationPoint(-0.25F, -0.25F, 2.25F);
        this.legL2.addChild(legL3);
        this.setRotateAngle(legL3, 0.0F, -0.2182F, 0.0F);
        this.legL3.cubeList.add(new ModelBox(legL3, 5, 6, 0.0F, -1.0F, -1.0F, 0, 2, 2, 0.0F, true));

        this.tail = new AdvancedModelRenderer(this);
        this.tail.setRotationPoint(0.0F, -0.75F, 8.0F);
        this.body3.addChild(tail);
        this.tail.cubeList.add(new ModelBox(tail, 30, 31, 0.0F, -5.25F, 0.0F, 0, 9, 11, 0.0F, false));
        this.tail.cubeList.add(new ModelBox(tail, 12, 40, -1.5F, -1.25F, -1.0F, 3, 3, 12, 0.0F, false));

        this.tail2 = new AdvancedModelRenderer(this);
        this.tail2.setRotationPoint(0.0F, 0.0F, 11.0F);
        this.tail.addChild(tail2);
        this.tail2.cubeList.add(new ModelBox(tail2, 37, 27, -1.0F, -0.75F, -1.0F, 2, 2, 13, 0.0F, false));
        this.tail2.cubeList.add(new ModelBox(tail2, 0, 28, 0.0F, -5.25F, 0.0F, 0, 9, 12, 0.0F, false));

        this.tail3 = new AdvancedModelRenderer(this);
        this.tail3.setRotationPoint(0.0F, 0.25F, 12.0F);
        this.tail2.addChild(tail3);
        this.tail3.cubeList.add(new ModelBox(tail3, 0, 9, 0.0F, -5.5F, 0.0F, 0, 9, 14, 0.0F, false));
        this.tail3.cubeList.add(new ModelBox(tail3, 29, 0, -0.5F, -0.5F, -1.0F, 1, 1, 14, 0.0F, false));

        updateDefaultPose();
        animator = ModelAnimator.create();
    }

    @Override
    public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        animate((IAnimatedEntity) entity, f, f1, f2, f3, f4, f5);
        this.body.render(f5 * 0.465F);
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
        this.body.offsetY = 0.75F; //72

        EntityPrehistoricFloraCrassigyrinus Crassigyrinus = (EntityPrehistoricFloraCrassigyrinus) e;

        this.faceTarget(f3, f4, 4, body);

        float speed = 0.225F / 2F;
        if (Crassigyrinus.getIsFast()) {
            speed = speed * 1.52F;
        }
        AdvancedModelRenderer[] Tail = {this.body2, this.body3, this.tail, this.tail2, this.tail3};
        AdvancedModelRenderer[] Torso = {this.head, this.body, this.body2};

        if (!Crassigyrinus.isReallyInWater()) {

            if (f3 == 0.0F || !Crassigyrinus.getIsMoving()) { //Not moving
                return;
            }

            this.flap(legL, speed, 0.45F, false, 0, -0.35F, f2, 0.5F);
            this.swing(legL, speed, -0.5F, true, 5, 0.25F, f2, 0.5F);
            this.walk(legL2, speed, -0.6F, true, 5, 0F, f2, 0.8F);
            this.walk(legL3, speed, 0.6F, false, 1, 0.3F, f2, 0.5F);

            this.flap(legR, speed, -0.45F, false, 3, 0.35F, f2, 0.5F);
            this.swing(legR, speed, -0.5F, true, 8, 0.25F, f2, 0.5F);
            this.walk(legR2, speed, -0.6F, true, 8, 0F, f2, 0.8F);
            this.walk(legR3, speed, 0.6F, false, 4, 0.3F, f2, 0.5F);

            this.flap(armL, speed, 0.45F, false, 3, -0.35F, f2, 0.5F);
            this.swing(armL, speed, -0.5F, true, 8, 0.25F, f2, 0.5F);
            this.walk(armL2, speed, -0.6F, true, 8, 0.4F, f2, 0.8F);

            this.flap(armR, speed, -0.45F, false, 0, 0.35F, f2, 0.5F);
            this.swing(armR, speed, -0.5F, true, 5, 0.25F, f2, 0.5F);
            this.walk(armR2, speed, 0.6F, false, 1, 0.3F, f2, 0.5F);

            this.chainWave(Tail, speed, 0.05F, -0.2, f2, 0.7F);
            this.chainSwing(Tail, speed, 0.1F, -0.2, f2, 0.5F);
            this.chainSwing(Torso, speed, 0.1F, -0.2, f2, 0.7F);
            //this.bob(body, speed*2, 0.3F, false, f2, 1F);

            this.body.offsetZ = this.moveBoxExtended(speed * 2, (float) Math.toRadians(1.5), false, 1.5F, f2, 1);

        }
        else {
            speed = speed * 4F;

            //Feet:

            AdvancedModelRenderer[] BackL = {this.legL, this.legL2};
            AdvancedModelRenderer[] BackR = {this.legR, this.legR2};

            this.flap(legL, speed, 0.1F, false, 0F, 0.05F, f2, 1F);
            this.flap(legR, speed, 0.1F, false, 3F, 0.05F, f2, 1F);
            this.chainWaveExtended(BackL, speed, -0.3F, -1, 0F, f2, 1);
            this.chainWaveExtended(BackR, speed, -0.3F, -1, 3F, f2, 1);

            this.flap(armL, speed, 0.45F, false, 3, -0.35F, f2, 0.5F);
            this.swing(armL, speed, -0.4F, true, 8, 0.2F, f2, 0.5F);
            this.walk(armL2, speed, 0.8F, false, 3, 0.4F, f2, 0.5F);

            this.flap(armR, speed, -0.45F, false, 0, 0.35F, f2, 0.5F);
            this.swing(armR, speed, -0.4F, true, 5, 0.2F, f2, 0.5F);
            this.walk(armR2, speed, 0.8F, false, 0, 0.4F, f2, 0.5F);

            this.chainWave(Tail, speed, 0.012F, -0.2, f2, 0.5F);
            this.chainSwing(Tail, speed, 0.35F, -2.8, f2, 0.5F);
            this.chainSwing(Torso, speed, 0.2F, -0.12, f2, 0.7F);
            this.swing(body, speed, 0.2F, true, 0, 0, f2, 1);
        }
    }

    public void animate(IAnimatedEntity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        EntityPrehistoricFloraAgeableBase e = (EntityPrehistoricFloraAgeableBase) entity;
        animator.update(entity);
        this.resetToDefaultPose();
        setRotationAngles(f, f1, f2, f3, f4, f5, (Entity) entity);

        animator.setAnimation(e.ATTACK_ANIMATION);
        animator.startKeyframe(5);
        animator.move(this.head, 0,0,-0.3F);
        animator.rotate(this.head, (float) Math.toRadians(-15), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(this.lowerjaw, (float) Math.toRadians(35), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.endKeyframe();
        animator.setStaticKeyframe(5);
        animator.resetKeyframe(2);

        animator.setAnimation(e.ROAR_ANIMATION);
        animator.startKeyframe(10);
        animator.move(this.head, 0,0,-0.3F);
        animator.rotate(this.head, (float) Math.toRadians(-45), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(this.lowerjaw, (float) Math.toRadians(20), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.endKeyframe();
        animator.setStaticKeyframe(10);
        animator.resetKeyframe(10);
    }
}
