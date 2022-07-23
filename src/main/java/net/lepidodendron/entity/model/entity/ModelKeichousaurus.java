package net.lepidodendron.entity.model.entity;

import net.ilexiconn.llibrary.client.model.ModelAnimator;
import net.ilexiconn.llibrary.client.model.tools.AdvancedModelRenderer;
import net.ilexiconn.llibrary.server.animation.IAnimatedEntity;
import net.lepidodendron.entity.EntityPrehistoricFloraKeichousaurus;
import net.lepidodendron.entity.EntityPrehistoricFloraMesosaurus;
import net.lepidodendron.entity.base.EntityPrehistoricFloraAgeableBase;
import net.lepidodendron.entity.model.llibraryextensions.AdvancedModelBaseExtended;
import net.lepidodendron.entity.model.llibraryextensions.AdvancedModelRendererExtended;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.entity.Entity;

public class ModelKeichousaurus extends AdvancedModelBaseExtended {
    private final AdvancedModelRenderer Keichousaurus;
    private final AdvancedModelRenderer upperbody;
    private final AdvancedModelRenderer cube_r1;
    private final AdvancedModelRenderer neck;
    private final AdvancedModelRenderer cube_r2;
    private final AdvancedModelRenderer neck2;
    private final AdvancedModelRenderer head;
    private final AdvancedModelRenderer lowerJaw;
    private final AdvancedModelRenderer leftarm;
    private final AdvancedModelRenderer leftarm2;
    private final AdvancedModelRenderer lefthand;
    private final AdvancedModelRenderer rightarm3;
    private final AdvancedModelRenderer rightarm4;
    private final AdvancedModelRenderer righthand;
    private final AdvancedModelRenderer body;
    private final AdvancedModelRenderer body2;
    private final AdvancedModelRenderer tail;
    private final AdvancedModelRenderer cube_r3;
    private final AdvancedModelRenderer tail2;
    private final AdvancedModelRenderer tail3;
    private final AdvancedModelRenderer tail4;
    private final AdvancedModelRenderer tail5;
    private final AdvancedModelRenderer leftleg;
    private final AdvancedModelRenderer leftleg2;
    private final AdvancedModelRenderer leftfoot;
    private final AdvancedModelRenderer rightleg3;
    private final AdvancedModelRenderer rightleg4;
    private final AdvancedModelRenderer rightfoot;

    private ModelAnimator animator;

    public ModelKeichousaurus() {
        this.textureWidth = 64;
        this.textureHeight = 64;

        this.Keichousaurus = new AdvancedModelRenderer(this);
        this.Keichousaurus.setRotationPoint(0.0F, 24.0F, 0.0F);


        this.upperbody = new AdvancedModelRenderer(this);
        this.upperbody.setRotationPoint(0.0F, -4.0F, -6.0F);
        this.Keichousaurus.addChild(upperbody);
        this.upperbody.cubeList.add(new ModelBox(upperbody, 25, 0, -2.0F, -2.0F, -5.0F, 4, 5, 5, 0.0F, false));

        this.cube_r1 = new AdvancedModelRenderer(this);
        this.cube_r1.setRotationPoint(0.0F, 3.5F, -2.5F);
        this.upperbody.addChild(cube_r1);
        this.setRotateAngle(cube_r1, -0.1745F, 0.0F, 0.0F);
        this.cube_r1.cubeList.add(new ModelBox(cube_r1, 31, 37, -1.5F, -1.0F, -2.5F, 3, 1, 5, 0.0F, false));

        this.neck = new AdvancedModelRenderer(this);
        this.neck.setRotationPoint(0.0F, -0.3085F, -4.9271F);
        this.upperbody.addChild(neck);
        this.setRotateAngle(neck, -0.1745F, 0.0F, 0.0F);
        this.neck.cubeList.add(new ModelBox(neck, 16, 21, -1.5F, -1.6915F, -7.3229F, 3, 3, 8, 0.011F, false));

        this.cube_r2 = new AdvancedModelRenderer(this);
        this.cube_r2.setRotationPoint(0.0F, 3.3085F, 0.6771F);
        this.neck.addChild(cube_r2);
        this.setRotateAngle(cube_r2, -0.4363F, 0.0F, 0.0F);
        this.cube_r2.cubeList.add(new ModelBox(cube_r2, 43, 14, -1.5F, -2.4574F, -3.8235F, 3, 2, 4, -0.01F, false));

        this.neck2 = new AdvancedModelRenderer(this);
        this.neck2.setRotationPoint(0.0F, -0.1915F, -6.3229F);
        this.neck.addChild(neck2);
        this.setRotateAngle(neck2, 0.2618F, 0.0F, 0.0F);
        this.neck2.cubeList.add(new ModelBox(neck2, 0, 17, -1.5F, -1.5F, -9.0F, 3, 3, 9, 0.0F, false));

        this.head = new AdvancedModelRenderer(this);
        this.head.setRotationPoint(0.0F, -0.5F, -8.5F);
        this.neck2.addChild(head);
        this.setRotateAngle(head, 0.2618F, 0.0F, 0.0F);
        this.head.cubeList.add(new ModelBox(head, 30, 18, -2.0F, -1.0F, -5.0F, 4, 2, 5, 0.01F, false));
        this.head.cubeList.add(new ModelBox(head, 42, 37, -1.5F, -1.0F, -7.0F, 3, 2, 3, 0.0F, false));

        this.lowerJaw = new AdvancedModelRenderer(this);
        this.lowerJaw.setRotationPoint(0.0F, 1.5F, -0.25F);
        this.head.addChild(lowerJaw);
        this.lowerJaw.cubeList.add(new ModelBox(lowerJaw, 18, 32, -2.0F, -0.5F, -4.75F, 4, 1, 5, 0.0F, false));
        this.lowerJaw.cubeList.add(new ModelBox(lowerJaw, 0, 5, -1.5F, -2.5F, -1.75F, 3, 2, 2, -0.01F, false));
        this.lowerJaw.cubeList.add(new ModelBox(lowerJaw, 23, 18, -1.5F, -0.5F, -6.75F, 3, 1, 2, 0.0F, false));

        this.leftarm = new AdvancedModelRenderer(this);
        this.leftarm.setRotationPoint(2.0F, -0.5F, -2.25F);
        this.upperbody.addChild(leftarm);
        this.setRotateAngle(leftarm, -0.3663F, -0.5553F, 0.6291F);
        this.leftarm.cubeList.add(new ModelBox(leftarm, 38, 0, -2.0F, 1.0F, -1.0F, 6, 2, 2, 0.0F, false));

        this.leftarm2 = new AdvancedModelRenderer(this);
        this.leftarm2.setRotationPoint(4.0F, 2.0F, -0.25F);
        this.leftarm.addChild(leftarm2);
        this.setRotateAngle(leftarm2, 0.0F, -0.4363F, 0.0F);
        this.leftarm2.cubeList.add(new ModelBox(leftarm2, 23, 38, 0.0F, -1.0F, -0.75F, 4, 2, 2, -0.01F, false));

        this.lefthand = new AdvancedModelRenderer(this);
        this.lefthand.setRotationPoint(3.25F, -0.25F, 0.0F);
        this.leftarm2.addChild(lefthand);
        this.setRotateAngle(lefthand, 0.0F, -0.0873F, 0.0F);
        this.lefthand.cubeList.add(new ModelBox(lefthand, 27, 25, 0.5F, 0.0F, -1.5F, 5, 0, 4, 0.0F, false));

        this.rightarm3 = new AdvancedModelRenderer(this);
        this.rightarm3.setRotationPoint(-2.0F, -0.5F, -2.25F);
        this.upperbody.addChild(rightarm3);
        this.setRotateAngle(rightarm3, -0.3663F, 0.5553F, -0.6291F);
        this.rightarm3.cubeList.add(new ModelBox(rightarm3, 38, 0, -4.0F, 1.0F, -1.0F, 6, 2, 2, 0.0F, true));

        this.rightarm4 = new AdvancedModelRenderer(this);
        this.rightarm4.setRotationPoint(-4.0F, 2.0F, -0.25F);
        this.rightarm3.addChild(rightarm4);
        this.setRotateAngle(rightarm4, 0.0F, 0.4363F, 0.0F);
        this.rightarm4.cubeList.add(new ModelBox(rightarm4, 23, 38, -4.0F, -1.0F, -0.75F, 4, 2, 2, -0.01F, true));

        this.righthand = new AdvancedModelRenderer(this);
        this.righthand.setRotationPoint(-3.25F, -0.25F, 0.0F);
        this.rightarm4.addChild(righthand);
        this.setRotateAngle(righthand, 0.0F, 0.0873F, 0.0F);
        this.righthand.cubeList.add(new ModelBox(righthand, 27, 25, -5.5F, 0.0F, -1.5F, 5, 0, 4, 0.0F, true));

        this.body = new AdvancedModelRenderer(this);
        this.body.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.Keichousaurus.addChild(body);
        this.body.cubeList.add(new ModelBox(body, 0, 0, -3.5F, -6.0F, -7.0F, 7, 6, 11, 0.01F, false));

        this.body2 = new AdvancedModelRenderer(this);
        this.body2.setRotationPoint(0.0F, -3.0F, 4.0F);
        this.body.addChild(body2);
        this.body2.cubeList.add(new ModelBox(body2, 0, 29, -2.4128F, -2.5F, -0.9962F, 5, 5, 4, 0.0F, false));

        this.tail = new AdvancedModelRenderer(this);
        this.tail.setRotationPoint(0.0872F, 0.0837F, 2.9748F);
        this.body2.addChild(tail);
        this.tail.cubeList.add(new ModelBox(tail, 42, 25, -1.5F, -2.0837F, -0.971F, 3, 3, 4, 0.0F, false));

        this.cube_r3 = new AdvancedModelRenderer(this);
        this.cube_r3.setRotationPoint(0.0F, 1.4163F, 1.029F);
        this.tail.addChild(cube_r3);
        this.setRotateAngle(cube_r3, 0.5236F, 0.0F, 0.0F);
        this.cube_r3.cubeList.add(new ModelBox(cube_r3, 0, 0, -1.0F, -2.0F, -2.0F, 2, 2, 3, 0.0F, false));

        this.tail2 = new AdvancedModelRenderer(this);
        this.tail2.setRotationPoint(0.0F, -1.0837F, 3.029F);
        this.tail.addChild(tail2);
        this.tail2.cubeList.add(new ModelBox(tail2, 32, 29, -1.0F, -1.0F, -1.0F, 2, 2, 6, -0.01F, false));

        this.tail3 = new AdvancedModelRenderer(this);
        this.tail3.setRotationPoint(0.0F, 0.0F, 5.0F);
        this.tail2.addChild(tail3);
        this.tail3.cubeList.add(new ModelBox(tail3, 40, 5, -1.0F, -1.0F, 0.0F, 2, 2, 5, 0.0F, false));

        this.tail4 = new AdvancedModelRenderer(this);
        this.tail4.setRotationPoint(0.0F, -0.25F, 5.0F);
        this.tail3.addChild(tail4);
        this.tail4.cubeList.add(new ModelBox(tail4, 29, 10, -1.0F, -0.5F, 0.0F, 2, 1, 7, 0.0F, false));

        this.tail5 = new AdvancedModelRenderer(this);
        this.tail5.setRotationPoint(0.0F, 0.0F, 7.0F);
        this.tail4.addChild(tail5);
        this.tail5.cubeList.add(new ModelBox(tail5, 0, 38, -0.5F, -0.5F, 0.0F, 1, 1, 6, 0.0F, false));

        this.leftleg = new AdvancedModelRenderer(this);
        this.leftleg.setRotationPoint(2.8372F, 0.5F, 0.0038F);
        this.body2.addChild(leftleg);
        this.setRotateAngle(leftleg, -0.8333F, 0.6527F, -0.3932F);
        this.leftleg.cubeList.add(new ModelBox(leftleg, 14, 38, -1.0F, -1.0F, -0.75F, 2, 2, 5, 0.0F, false));

        this.leftleg2 = new AdvancedModelRenderer(this);
        this.leftleg2.setRotationPoint(0.0F, 0.0F, 4.25F);
        this.leftleg.addChild(leftleg2);
        this.setRotateAngle(leftleg2, 0.0F, -0.2182F, 0.0F);
        this.leftleg2.cubeList.add(new ModelBox(leftleg2, 0, 17, -1.0F, -1.0F, 0.0F, 2, 2, 2, 0.0F, false));

        this.leftfoot = new AdvancedModelRenderer(this);
        this.leftfoot.setRotationPoint(0.0F, -0.25F, 2.0F);
        this.leftleg2.addChild(leftfoot);
        this.setRotateAngle(leftfoot, 0.0F, -0.1745F, 0.0F);
        this.leftfoot.cubeList.add(new ModelBox(leftfoot, 31, 43, -3.5F, 0.0F, -0.25F, 6, 0, 7, 0.0F, false));

        this.rightleg3 = new AdvancedModelRenderer(this);
        this.rightleg3.setRotationPoint(-2.6628F, 0.5F, 0.0038F);
        this.body2.addChild(rightleg3);
        this.setRotateAngle(rightleg3, -0.8333F, -0.6527F, 0.3932F);
        this.rightleg3.cubeList.add(new ModelBox(rightleg3, 14, 38, -1.0F, -1.0F, -0.75F, 2, 2, 5, 0.0F, true));

        this.rightleg4 = new AdvancedModelRenderer(this);
        this.rightleg4.setRotationPoint(0.0F, 0.0F, 4.25F);
        this.rightleg3.addChild(rightleg4);
        this.setRotateAngle(rightleg4, 0.0F, 0.2182F, 0.0F);
        this.rightleg4.cubeList.add(new ModelBox(rightleg4, 0, 17, -1.0F, -1.0F, 0.0F, 2, 2, 2, 0.0F, true));

        this.rightfoot = new AdvancedModelRenderer(this);
        this.rightfoot.setRotationPoint(0.0F, -0.25F, 2.0F);
        this.rightleg4.addChild(rightfoot);
        this.setRotateAngle(rightfoot, 0.0F, 0.1745F, 0.0F);
        this.rightfoot.cubeList.add(new ModelBox(rightfoot, 31, 43, -2.5F, 0.0F, -0.25F, 6, 0, 7, 0.0F, true));

        updateDefaultPose();
        animator = ModelAnimator.create();
    }

    @Override
    public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        animate((IAnimatedEntity) entity, f, f1, f2, f3, f4, f5);
        this.Keichousaurus.render(f5 * 0.25f);
    }
    public void renderStatic(float f) {
        GlStateManager.pushMatrix();
        GlStateManager.enableBlend();
        GlStateManager.blendFunc(GlStateManager.SourceFactor.SRC_ALPHA, GlStateManager.DestFactor.ONE_MINUS_SRC_ALPHA);
        GlStateManager.disableCull();
        this.lowerJaw.rotateAngleX = (float) Math.toRadians(10);
        this.neck2.rotateAngleY = (float) Math.toRadians(18);
        this.neck.rotateAngleY = (float) Math.toRadians(15);
        this.head.rotateAngleY = (float) Math.toRadians(10);
        this.Keichousaurus.rotateAngleY = (float) Math.toRadians(10);
        this.tail.rotateAngleY = (float) Math.toRadians(10);
        this.tail2.rotateAngleY = (float) Math.toRadians(20);
        this.tail3.rotateAngleY = (float) Math.toRadians(15);
        this.Keichousaurus.offsetZ = -0.1F;
        this.Keichousaurus.render(0.1F);
        GlStateManager.enableCull();
        GlStateManager.disableBlend();
        GlStateManager.popMatrix();
    }
    public void setRotateAngle(AdvancedModelRenderer AdvancedModelRenderer, float x, float y, float z) {
        AdvancedModelRenderer.rotateAngleX = x;
        AdvancedModelRenderer.rotateAngleY = y;
        AdvancedModelRenderer.rotateAngleZ = z;
    }

    @Override
    public void setRotationAngles(float f, float f1, float f2, float f3, float f4, float f5, Entity e) {
        super.setRotationAngles(f, f1, f2, f3, f4, f5, e);
        this.resetToDefaultPose();
        this.Keichousaurus.offsetY = 1.1F;

        EntityPrehistoricFloraKeichousaurus Keichousaurus = (EntityPrehistoricFloraKeichousaurus) e;

        this.faceTarget(f3, f4, 5, neck2);
        this.faceTarget(f3, f4, 5, neck);
        this.faceTarget(f3, f4, 5, head);

        float speed = 0.2F;
        AdvancedModelRenderer[] Tail = {this.tail, this.tail2, this.tail3, this.tail4, this.tail5};
        AdvancedModelRenderer[] Torso = {this.neck2, this.neck, this.upperbody};

        AdvancedModelRenderer[] FL = {this.leftarm, this.leftarm2, this.lefthand};
        AdvancedModelRenderer[] FR = {this.rightarm3, this.rightarm4, this.righthand};
        AdvancedModelRenderer[] BL = {this.leftleg, this.leftleg2, this.leftfoot};
        AdvancedModelRenderer[] BR = {this.rightleg3, this.rightleg4, this.rightfoot};

        if (!Keichousaurus.isReallyInWater()) {
            this.leftarm.rotateAngleZ = (float) Math.toRadians(15.6125);
            this.rightarm3.rotateAngleZ = (float) Math.toRadians(-18.662);

            this.leftleg.rotateAngleX = -(float) Math.toRadians(22.9232);
            this.rightleg3.rotateAngleX = -(float) Math.toRadians(22.9232);

            if (f3 == 0.0F || !Keichousaurus.getIsMoving()) {
                return;
            }

            this.swing(this.rightarm3, speed * 0.6F, 0.2F,false, -0.8F,0, f2, 1F);
            this.swing(this.leftarm, speed * 0.6F, 0.2F,true, 0.8F,0, f2, 1F);

            //this.flap(this.rightarm2, speed * 0.6F, 0.2F,false, -0.2F,0.2F, f2, 1F);
            //this.flap(this.leftarm2, speed * 0.6F, 0.2F,true, 0.2F,0.2F, f2, 1F);

            this.swing(this.rightleg3, speed * 0.6F, -0.3F,false, 0,0, f2, 1F);
            this.swing(this.leftleg, speed * 0.6F, -0.3F,true, 0,0, f2, 1F);

            //this.flap(this.rightarm2, speed * 0.6F, 0.2F,false, -0.2F,0.2F, f2, 1F);
            //this.flap(this.leftarm2, speed * 0.6F, 0.2F,true, 0.2F,0.2F, f2, 1F);

            this.chainWave(Tail, speed, 0.05F, -3, f2, 1);
            this.chainSwing(Tail, speed * 0.8F, 0.12F, -3, f2, 0.8F);
            this.chainSwing(Torso, speed, 0.1F, -3, f2, 1);
        }
        else {
            speed = speed * 2F;

            this.leftarm.rotateAngleZ = (float) Math.toRadians(15.6125);
            this.rightarm3.rotateAngleZ = (float) Math.toRadians(-18.662);
            this.leftarm.rotateAngleZ = (float) Math.toRadians(12);
            this.rightarm3.rotateAngleZ = (float) Math.toRadians(-12);

            this.leftleg.rotateAngleX = -(float) Math.toRadians(22.9232);
            this.rightleg3.rotateAngleX = -(float) Math.toRadians(22.9232);

            this.chainWaveExtended(FR, speed * 0.8F, -0.12F, 1.5, 0, f2, 0.8F);
            this.chainWaveExtended(FL, speed * 0.8F, -0.12F, 1.5, 3F, f2, 0.8F);
            this.chainFlapExtended(BR, speed * 0.8F, -0.12F, 1.5, 3F, f2, 0.8F);
            this.chainFlapExtended(BL, speed * 0.8F, -0.12F, 1.5, 0, f2, 0.8F);

            this.chainWaveExtended(FR, speed * 0.8F, -0.12F, 1.5, 0, f2, 0.8F);
            this.chainWaveExtended(FL, speed * 0.8F, -0.12F, 1.5, 3F, f2, 0.8F);
            this.chainFlapExtended(BR, speed * 0.8F, -0.12F, 1.5, 3F, f2, 0.8F);
            this.chainFlapExtended(BL, speed * 0.8F, -0.12F, 1.5, 0, f2, 0.8F);

            this.chainSwing(Torso, speed, 0.07F, -3, f2, 1);
            if (f3 == 0.0F) {
                return;
            }

            this.chainSwingExtended(FR, speed * 0.8F, 0.12F, -1.5, 0, f2, 0.8F);
            this.chainSwingExtended(FL, speed * 0.8F, 0.12F, -1.5, 3F, f2, 0.8F);
            this.chainSwingExtended(BR, speed * 0.8F, 0.08F, -1.5, 3F, f2, 0.8F);
            this.chainSwingExtended(BL, speed * 0.8F, 0.08F, -1.5, 0, f2, 0.8F);

            this.chainSwingExtended(FR, speed * 0.8F, 0.12F, -1.5, 0, f2, 0.8F);
            this.chainSwingExtended(FL, speed * 0.8F, 0.12F, -1.5, 3F, f2, 0.8F);
            this.chainSwingExtended(BR, speed * 0.8F, 0.08F, -1.5, 3F, f2, 0.8F);
            this.chainSwingExtended(BL, speed * 0.8F, 0.08F, -1.5, 0, f2, 0.8F);

            this.chainWave(Tail, speed, 0.05F, -3, f2, 1);
            this.chainSwing(Tail, speed, 0.35F, -3, f2, 1F);

        }
    }

    public void animate(IAnimatedEntity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        EntityPrehistoricFloraAgeableBase e = (EntityPrehistoricFloraAgeableBase) entity;
        animator.update(entity);
        this.resetToDefaultPose();
        setRotationAngles(f, f1, f2, f3, f4, f5, (Entity) entity);

        animator.setAnimation(e.ATTACK_ANIMATION);
        animator.startKeyframe(5);
       // animator.move(this.neck, 0,0,-2F);
        animator.rotate(this.head, (float) Math.toRadians(-20), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(this.lowerJaw, (float) Math.toRadians(40), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.endKeyframe();
        animator.setStaticKeyframe(2);
        animator.resetKeyframe(2);

    }
}
