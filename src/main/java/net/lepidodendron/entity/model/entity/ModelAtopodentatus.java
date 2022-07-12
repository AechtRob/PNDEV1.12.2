package net.lepidodendron.entity.model.entity;

import net.ilexiconn.llibrary.client.model.ModelAnimator;
import net.ilexiconn.llibrary.client.model.tools.AdvancedModelRenderer;
import net.ilexiconn.llibrary.server.animation.IAnimatedEntity;
import net.lepidodendron.entity.EntityPrehistoricFloraAtopodentatus;
import net.lepidodendron.entity.base.EntityPrehistoricFloraAgeableBase;
import net.lepidodendron.entity.model.llibraryextensions.AdvancedModelBaseExtended;
import net.lepidodendron.entity.model.llibraryextensions.AdvancedModelRendererExtended;
import net.minecraft.client.model.ModelBox;
import net.minecraft.entity.Entity;

public class ModelAtopodentatus extends AdvancedModelBaseExtended {
    private final AdvancedModelRendererExtended body;
    private final AdvancedModelRendererExtended body2;
    private final AdvancedModelRendererExtended body3;
    private final AdvancedModelRendererExtended leg1;
    private final AdvancedModelRendererExtended lrgpiece1;
    private final AdvancedModelRendererExtended legfinger1;
    private final AdvancedModelRendererExtended leg2;
    private final AdvancedModelRendererExtended lrgpiece2;
    private final AdvancedModelRendererExtended legfinger2;
    private final AdvancedModelRendererExtended tail;
    private final AdvancedModelRendererExtended tail2;
    private final AdvancedModelRendererExtended tail3;
    private final AdvancedModelRendererExtended tail4;
    private final AdvancedModelRendererExtended arm1;
    private final AdvancedModelRendererExtended armpiece1;
    private final AdvancedModelRendererExtended arm1finger1;
    private final AdvancedModelRendererExtended arm2;
    private final AdvancedModelRendererExtended armpiece2;
    private final AdvancedModelRendererExtended arm1finger2;
    private final AdvancedModelRendererExtended neck;
    private final AdvancedModelRendererExtended neck3;
    private final AdvancedModelRendererExtended head;
    private final AdvancedModelRendererExtended upperjaw;
    private final AdvancedModelRendererExtended cube_r1;
    private final AdvancedModelRendererExtended cube_r2;
    private final AdvancedModelRendererExtended cube_r3;
    private final AdvancedModelRendererExtended jaw;
    private final AdvancedModelRendererExtended cube_r4;

    private ModelAnimator animator;

    public ModelAtopodentatus() {
        this.textureWidth = 128;
        this.textureHeight = 128;

        this.body = new AdvancedModelRendererExtended(this);
        this.body.setRotationPoint(0.0F, 16.0F, 3.0F);
        this.body.cubeList.add(new ModelBox(body, 39, 69, -6.0F, -5.25F, -23.0F, 12, 10, 11, 0.0F, false));

        this.body2 = new AdvancedModelRendererExtended(this);
        this.body2.setRotationPoint(0.0F, -1.0F, -13.0F);
        this.body.addChild(body2);
        this.body2.cubeList.add(new ModelBox(body2, 0, 0, -7.0F, -5.0F, 0.0F, 14, 14, 30, 0.0F, false));

        this.body3 = new AdvancedModelRendererExtended(this);
        this.body3.setRotationPoint(0.0F, 0.0F, 30.0F);
        this.body2.addChild(body3);
        this.body3.cubeList.add(new ModelBox(body3, 80, 36, -6.0F, -4.75F, -1.0F, 12, 12, 8, 0.0F, false));

        this.leg1 = new AdvancedModelRendererExtended(this);
        this.leg1.setRotationPoint(5.5F, 2.0F, 4.0F);
        this.body3.addChild(leg1);
        this.setRotateAngle(leg1, 0.0F, -0.6109F, 0.6109F);
        this.leg1.cubeList.add(new ModelBox(leg1, 0, 19, -2.0F, -1.0F, -2.0F, 10, 3, 4, 0.0F, false));

        this.lrgpiece1 = new AdvancedModelRendererExtended(this);
        this.lrgpiece1.setRotationPoint(8.0F, 0.0F, 0.0F);
        this.leg1.addChild(lrgpiece1);
        this.setRotateAngle(lrgpiece1, 0.0F, -0.6981F, 0.2618F);
        this.lrgpiece1.cubeList.add(new ModelBox(lrgpiece1, 83, 0, -1.0F, -0.5F, -2.5F, 8, 2, 5, 0.0F, false));

        this.legfinger1 = new AdvancedModelRendererExtended(this);
        this.legfinger1.setRotationPoint(7.0F, 0.0F, 0.0F);
        this.lrgpiece1.addChild(legfinger1);
        this.setRotateAngle(legfinger1, 0.0F, -0.2182F, 0.3491F);
        this.legfinger1.cubeList.add(new ModelBox(legfinger1, 0, 72, 0.0F, 0.0F, -3.0F, 10, 1, 6, 0.0F, false));

        this.leg2 = new AdvancedModelRendererExtended(this);
        this.leg2.setRotationPoint(-5.5F, 2.0F, 4.0F);
        this.body3.addChild(leg2);
        this.setRotateAngle(leg2, 0.0F, 0.6109F, -0.6109F);
        this.leg2.cubeList.add(new ModelBox(leg2, 0, 12, -8.0F, -1.0F, -2.0F, 10, 3, 4, 0.0F, false));

        this.lrgpiece2 = new AdvancedModelRendererExtended(this);
        this.lrgpiece2.setRotationPoint(-8.0F, 0.0F, 0.0F);
        this.leg2.addChild(lrgpiece2);
        this.setRotateAngle(lrgpiece2, 0.0F, 0.6981F, -0.2618F);
        this.lrgpiece2.cubeList.add(new ModelBox(lrgpiece2, 0, 79, -7.0F, -0.5F, -2.5F, 8, 2, 5, 0.0F, false));

        this.legfinger2 = new AdvancedModelRendererExtended(this);
        this.legfinger2.setRotationPoint(-7.0F, 0.0F, 0.0F);
        this.lrgpiece2.addChild(legfinger2);
        this.setRotateAngle(legfinger2, 0.0F, 0.2182F, -0.3491F);
        this.legfinger2.cubeList.add(new ModelBox(legfinger2, 58, 23, -10.0F, 0.0F, -3.0F, 10, 1, 6, 0.0F, false));

        this.tail = new AdvancedModelRendererExtended(this);
        this.tail.setRotationPoint(0.0F, 0.0F, 7.0F);
        this.body3.addChild(tail);
        this.tail.cubeList.add(new ModelBox(tail, 0, 44, -3.5F, -4.0F, -1.0F, 7, 10, 18, 0.0F, false));

        this.tail2 = new AdvancedModelRendererExtended(this);
        this.tail2.setRotationPoint(0.0F, 0.0F, 17.0F);
        this.tail.addChild(tail2);
        this.tail2.cubeList.add(new ModelBox(tail2, 50, 44, -2.5F, -3.0F, -1.0F, 5, 7, 18, 0.0F, false));

        this.tail3 = new AdvancedModelRendererExtended(this);
        this.tail3.setRotationPoint(0.0F, 1.0F, 17.0F);
        this.tail2.addChild(tail3);
        this.tail3.cubeList.add(new ModelBox(tail3, 58, 0, -1.5F, -3.0F, -1.0F, 3, 4, 19, 0.0F, false));

        this.tail4 = new AdvancedModelRendererExtended(this);
        this.tail4.setRotationPoint(0.0F, -1.0F, 18.0F);
        this.tail3.addChild(tail4);
        this.tail4.cubeList.add(new ModelBox(tail4, 66, 71, -1.0F, -1.0F, -1.0F, 2, 2, 19, 0.0F, false));

        this.arm1 = new AdvancedModelRendererExtended(this);
        this.arm1.setRotationPoint(4.75F, 2.0F, -17.0F);
        this.body.addChild(arm1);
        this.setRotateAngle(arm1, 0.0F, -0.5236F, 0.6109F);
        this.arm1.cubeList.add(new ModelBox(arm1, 88, 26, 0.0F, -1.0F, -2.0F, 8, 3, 4, 0.0F, false));

        this.armpiece1 = new AdvancedModelRendererExtended(this);
        this.armpiece1.setRotationPoint(8.0F, 0.0F, 0.0F);
        this.arm1.addChild(armpiece1);
        this.setRotateAngle(armpiece1, 0.0F, 0.3491F, 0.0F);
        this.armpiece1.cubeList.add(new ModelBox(armpiece1, 89, 69, -1.0F, -0.5F, -1.5F, 7, 2, 3, 0.0F, false));

        this.arm1finger1 = new AdvancedModelRendererExtended(this);
        this.arm1finger1.setRotationPoint(6.0F, -1.0F, -1.0F);
        this.armpiece1.addChild(arm1finger1);
        this.setRotateAngle(arm1finger1, 0.0F, -0.5236F, 0.0F);
        this.arm1finger1.cubeList.add(new ModelBox(arm1finger1, 83, 7, 0.0F, 1.0F, -1.5F, 8, 1, 5, 0.0F, false));

        this.arm2 = new AdvancedModelRendererExtended(this);
        this.arm2.setRotationPoint(-4.75F, 2.0F, -17.0F);
        this.body.addChild(arm2);
        this.setRotateAngle(arm2, 0.0F, 0.5236F, -0.6109F);
        this.arm2.cubeList.add(new ModelBox(arm2, 0, 86, -8.0F, -1.0F, -2.0F, 8, 3, 4, 0.0F, false));

        this.armpiece2 = new AdvancedModelRendererExtended(this);
        this.armpiece2.setRotationPoint(-8.0F, 0.0F, 0.0F);
        this.arm2.addChild(armpiece2);
        this.setRotateAngle(armpiece2, 0.0F, -0.3491F, 0.0F);
        this.armpiece2.cubeList.add(new ModelBox(armpiece2, 83, 13, -6.0F, -0.5F, -1.5F, 7, 2, 3, 0.0F, false));

        this.arm1finger2 = new AdvancedModelRendererExtended(this);
        this.arm1finger2.setRotationPoint(-6.0F, -1.0F, -1.0F);
        this.armpiece2.addChild(arm1finger2);
        this.setRotateAngle(arm1finger2, 0.0F, 0.5236F, 0.0F);
        this.arm1finger2.cubeList.add(new ModelBox(arm1finger2, 78, 56, -8.0F, 1.0F, -1.5F, 8, 1, 5, 0.0F, false));

        this.neck = new AdvancedModelRendererExtended(this);
        this.neck.setRotationPoint(0.0F, -2.0F, -23.0F);
        this.body.addChild(neck);
        this.neck.cubeList.add(new ModelBox(neck, 32, 44, -3.5F, -2.5F, -8.0F, 7, 5, 9, 0.0F, false));

        this.neck3 = new AdvancedModelRendererExtended(this);
        this.neck3.setRotationPoint(0.0F, -1.0F, -8.0F);
        this.neck.addChild(neck3);
        this.neck3.cubeList.add(new ModelBox(neck3, 0, 0, -3.0F, -1.0F, -7.0F, 6, 4, 8, 0.0F, false));

        this.head = new AdvancedModelRendererExtended(this);
        this.head.setRotationPoint(0.0F, 0.5F, -7.0F);
        this.neck3.addChild(head);
        this.head.cubeList.add(new ModelBox(head, 55, 44, -1.49F, 0.0F, -2.25F, 3, 2, 3, 0.0F, false));

        this.upperjaw = new AdvancedModelRendererExtended(this);
        this.upperjaw.setRotationPoint(0.0F, 1.0F, 0.0F);
        this.head.addChild(upperjaw);
        this.upperjaw.cubeList.add(new ModelBox(upperjaw, 0, 51, -2.5F, -1.0F, -4.0F, 5, 1, 4, 0.0F, false));
        this.upperjaw.cubeList.add(new ModelBox(upperjaw, 58, 0, -2.0F, -1.0F, -6.0F, 4, 1, 2, 0.0F, false));
        this.upperjaw.cubeList.add(new ModelBox(upperjaw, 5, 97, -4.0F, -1.0F, -8.0F, 8, 1, 2, 0.0F, false));

        this.cube_r1 = new AdvancedModelRendererExtended(this);
        this.cube_r1.setRotationPoint(0.0F, -3.5F, 0.0F);
        this.upperjaw.addChild(cube_r1);
        this.setRotateAngle(cube_r1, 0.0873F, 0.0F, 0.0F);
        this.cube_r1.cubeList.add(new ModelBox(cube_r1, 55, 49, -2.0F, 1.1F, -1.45F, 4, 2, 2, 0.0F, false));

        this.cube_r2 = new AdvancedModelRendererExtended(this);
        this.cube_r2.setRotationPoint(0.0F, -3.5F, 0.0F);
        this.upperjaw.addChild(cube_r2);
        this.setRotateAngle(cube_r2, 0.2443F, 0.0F, 0.0F);
        this.cube_r2.cubeList.add(new ModelBox(cube_r2, 0, 56, -1.5F, 1.0F, -6.4F, 3, 1, 5, 0.0F, false));

        this.cube_r3 = new AdvancedModelRendererExtended(this);
        this.cube_r3.setRotationPoint(0.0F, -0.25F, 9.0F);
        this.upperjaw.addChild(cube_r3);
        this.setRotateAngle(cube_r3, 0.0698F, 0.0F, 0.0F);
        this.cube_r3.cubeList.add(new ModelBox(cube_r3, 0, 0, 0.7F, -2.75F, -12.4F, 1, 2, 3, 0.0F, false));
        this.cube_r3.cubeList.add(new ModelBox(cube_r3, 20, 3, -1.7F, -2.75F, -12.4F, 1, 2, 3, 0.0F, false));

        this.jaw = new AdvancedModelRendererExtended(this);
        this.jaw.setRotationPoint(0.0F, 1.0F, 0.0F);
        this.head.addChild(jaw);
        this.jaw.cubeList.add(new ModelBox(jaw, 26, 73, -2.0F, 0.0F, -6.0F, 4, 1, 6, 0.0F, false));
        this.jaw.cubeList.add(new ModelBox(jaw, 0, 102, -4.0F, 0.0F, -8.0F, 8, 1, 2, 0.0F, false));

        this.cube_r4 = new AdvancedModelRendererExtended(this);
        this.cube_r4.setRotationPoint(0.0F, 1.0F, -6.0F);
        this.jaw.addChild(cube_r4);
        this.setRotateAngle(cube_r4, -0.0436F, 0.0F, 0.0F);
        this.cube_r4.cubeList.add(new ModelBox(cube_r4, 0, 44, -1.5F, -1.0F, 0.0F, 3, 1, 6, 0.0F, false));

        updateDefaultPose();
        animator = ModelAnimator.create();
    }

    @Override
    public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        animate((IAnimatedEntity) entity, f, f1, f2, f3, f4, f5);
        this.body.render(f5 * 1.0F);
    }

    public void setRotateAngle(AdvancedModelRenderer AdvancedAdvancedModelRenderer, float x, float y, float z) {
        AdvancedAdvancedModelRenderer.rotateAngleX = x;
        AdvancedAdvancedModelRenderer.rotateAngleY = y;
        AdvancedAdvancedModelRenderer.rotateAngleZ = z;
    }

    @Override
    public void setRotationAngles(float f, float f1, float f2, float f3, float f4, float f5, Entity e) {
        super.setRotationAngles(f, f1, f2, f3, f4, f5, e);
        this.resetToDefaultPose();

        this.body.offsetY = 0.00F;
        //this.body.offsetZ = 1.0F;

        this.faceTarget(f3, f4, 6, neck);
        this.faceTarget(f3, f4, 6, neck3);
        this.faceTarget(f3, f4, 6, head);

        AdvancedModelRenderer[] fishTail = {this.body2, this.body3, this.tail, this.tail2, this.tail3, this.tail4};
        AdvancedModelRenderer[] neckHead = {this.neck, this.neck3, this.head};

        AdvancedModelRenderer[] frontLeft = {this.arm1, this.armpiece1, this.arm1finger1};
        AdvancedModelRenderer[] frontRight = {this.arm2, this.armpiece2, this.arm1finger2};
        AdvancedModelRenderer[] backLeft = {this.leg1, this.lrgpiece1, this.legfinger1};
        AdvancedModelRenderer[] backRight = {this.leg2, this.lrgpiece2, this.legfinger2};

        EntityPrehistoricFloraAtopodentatus ee = (EntityPrehistoricFloraAtopodentatus) e;
        float speed = ee.getTravelSpeed()/4F;
        if (ee.getIsFast()) {
            speed = speed * 1.6F;
        }
        float still = 1f;
        if (f3 == 0.0F) {
            still = 0.5F;
        }
        if (!e.isInWater()) {
            speed = 0.26F;
        }

        //this.head.rotateAngleY += f3 / (180F / (float) Math.PI);
        //this.head.rotateAngleX += f4 / (180F / (float) Math.PI);

        //if (f3 != 0.0F) {this.walk(Jaw, (float) (speed * 1.5), 0.2F, true, 0, 0, f2, 1);}
        if (e.isInWater()) {
            if (!ee.getIsFast()) {
                this.chainWave(fishTail, speed * still, 0.225F * still, -1.25, f2, 0.6F * still);
                this.chainWave(neckHead, speed * still, 0.125F * still, -1.25, f2, 0.6F * still);
            } else {
                this.chainWave(fishTail, speed * still, 0.215F * still, -1.15, f2, 0.6F * still);
                this.chainWave(neckHead, speed * still, 0.115F * still, -1.15, f2, 0.6F * still);
            }

            this.chainSwing(fishTail, speed * still * 2, 0.2F * still, -1.0, f2, 0.8F * still);
            this.chainSwing(neckHead, speed * still * 2, 0.10F * still, -1.0, f2, 0.8F * still);

            this.swing(body, speed * 0.5F, 0.002F, true, 0, 0, f2, 0.8F);
            this.bob(body, speed * 0.5F, 0.05F, true, f2, 0.8F);

            this.chainFlapExtended(frontLeft, (float) (speed * 1.25), 0.75F,  0.8F, 0, f2, 0.5F);
            this.chainSwingExtended(frontLeft, (float) (speed * 1.25), 0.4F, 0, 0, f2, 0.5F);
            this.chainWaveExtended(frontLeft, (float) (speed * 1.25), 0.4F, 0, 0, f2, 0.5F);

            this.chainFlapExtended(frontRight, (float) (speed * 1.25), 0.75F,  0.8F,  3F, f2, 0.5F);
            this.chainSwingExtended(frontRight, (float) (speed * 1.25), 0.4F,  0, 3F, f2, 0.5F);
            this.chainWaveExtended(frontRight, (float) (speed * 1.25), 0.4F,  0, 3F, f2, 0.5F);

            this.chainFlapExtended(backLeft, (float) (speed * 1.25), 0.75F,  1.8F, 3F, f2, 0.5F);
            this.chainSwingExtended(backLeft, (float) (speed * 1.25), 0.4F,  1, 3F, f2, 0.5F);
            this.chainWaveExtended(backLeft, (float) (speed * 1.25), 0.4F,  1, 3F, f2, 0.5F);

            this.chainFlapExtended(backRight, (float) (speed * 1.25), 0.75F,  1.8F, 0, f2, 0.5F);
            this.chainSwingExtended(backRight, (float) (speed * 1.25), 0.4F,  1, 0, f2, 0.5F);
            this.chainWaveExtended(backRight, (float) (speed * 1.25), 0.4F, 1, 0, f2, 0.5F);
        }
        else {
            //On land:
            this.leg1.rotateAngleZ = (float)Math.toRadians(-15);
            this.leg2.rotateAngleZ = (float)Math.toRadians(15);
            this.legfinger1.rotateAngleZ = (float)Math.toRadians(-5);
            this.legfinger2.rotateAngleZ = (float)Math.toRadians(5);
            this.tail.rotateAngleX = (float)Math.toRadians(-7.5);
            this.tail2.rotateAngleX = (float)Math.toRadians(2.5);
            this.tail3.rotateAngleX = (float)Math.toRadians(2.5);

            this.chainSwing(fishTail, speed * still * 0.7F, 0.385F * still * 0.7F, -1.85, f2, 0.6F * still * 0.7F);
            this.chainSwing(neckHead, speed * still * 0.7F, 0.285F * still * 0.7F, -1.15, f2, 0.6F * still * 0.7F);

            if (f3 == 0 || !ee.getIsMoving()) {
                this.arm1.rotateAngleZ = (float)Math.toRadians(-17.5);
                this.arm2.rotateAngleZ = (float)Math.toRadians(17.5);
                return;
            }

            this.chainSwing(backLeft, (float) (speed * 0.65), 0.05F,  1, f2, 0.5F);
            this.chainSwing(backRight, (float) (speed * 0.65), 0.05F,  1, f2, 0.5F);

            this.arm1.rotateAngleY = (float) Math.toRadians((-50F * ee.getMoveAngle2()) + 20F);
            this.arm2.rotateAngleY = -(float) Math.toRadians((-50F * ee.getMoveAngle2()) + 20F);

            this.swing(body, speed * 0.5F * 0.7F, 0.002F, true, 0, 0, f2, 0.8F * 0.7F);

            if (ee.getMoveAngle() >= 0) {
                this.body.rotateAngleX = (float) Math.toRadians(-5.0 * ee.getMoveAngle());
                this.body2.rotateAngleX = (float) Math.toRadians(5.0 * ee.getMoveAngle());
                this.body.offsetY = 0.05F;

                this.arm1.rotateAngleZ = (float)Math.toRadians(-17.5 + (20 * ee.getMoveAngle()));
                this.arm2.rotateAngleZ = (float)Math.toRadians(17.5 - (20 * ee.getMoveAngle()));
            }
            else {
                this.arm1.rotateAngleZ = (float)Math.toRadians(-17.5);
                this.arm2.rotateAngleZ = (float)Math.toRadians(17.5);
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
        animator.move(this.head, 0,0,-0.2F);
        animator.rotate(this.head, (float) Math.toRadians(-5), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(this.jaw, (float) Math.toRadians(35), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.endKeyframe();
        animator.setStaticKeyframe(5);
        animator.resetKeyframe(2);

        animator.setAnimation(e.ROAR_ANIMATION);
        animator.startKeyframe(5);
        animator.move(this.head, 0,0,-0.2F);
        animator.rotate(this.head, (float) Math.toRadians(-15), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(this.jaw, (float) Math.toRadians(35), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.endKeyframe();
        animator.setStaticKeyframe(5);
        animator.resetKeyframe(2);

    }
}

