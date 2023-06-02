package net.lepidodendron.entity.model.entity;

import net.ilexiconn.llibrary.client.model.ModelAnimator;
import net.ilexiconn.llibrary.client.model.tools.AdvancedModelRenderer;
import net.ilexiconn.llibrary.server.animation.IAnimatedEntity;
import net.lepidodendron.entity.EntityPrehistoricFloraPanzhousaurus;
import net.lepidodendron.entity.base.EntityPrehistoricFloraAgeableBase;
import net.lepidodendron.entity.model.llibraryextensions.AdvancedModelBaseExtended;
import net.lepidodendron.entity.model.llibraryextensions.AdvancedModelRendererExtended;
import net.minecraft.client.model.ModelBox;
import net.minecraft.entity.Entity;

public class ModelPanzhousaurus extends AdvancedModelBaseExtended {
    private final AdvancedModelRendererExtended main;
    private final AdvancedModelRendererExtended body;
    private final AdvancedModelRendererExtended body3;
    private final AdvancedModelRendererExtended frontleftleg;
    private final AdvancedModelRendererExtended frontleftleg2;
    private final AdvancedModelRendererExtended frontleftleg3;
    private final AdvancedModelRendererExtended frontrightleg;
    private final AdvancedModelRendererExtended frontrightleg2;
    private final AdvancedModelRendererExtended frontrightleg3;
    private final AdvancedModelRendererExtended neck;
    private final AdvancedModelRendererExtended neck2;
    private final AdvancedModelRendererExtended neck3;
    private final AdvancedModelRendererExtended head;
    private final AdvancedModelRendererExtended upperjaw;
    private final AdvancedModelRendererExtended cube_r1;
    private final AdvancedModelRendererExtended lowerjaw;
    private final AdvancedModelRendererExtended body2;
    private final AdvancedModelRendererExtended backleftleg;
    private final AdvancedModelRendererExtended backleftleg2;
    private final AdvancedModelRendererExtended backleftleg3;
    private final AdvancedModelRendererExtended backrightleg4;
    private final AdvancedModelRendererExtended backrightleg5;
    private final AdvancedModelRendererExtended backrightleg6;
    private final AdvancedModelRendererExtended tail;
    private final AdvancedModelRendererExtended tail2;
    private final AdvancedModelRendererExtended tail3;
    private final AdvancedModelRendererExtended tail4;

    private ModelAnimator animator;

    public ModelPanzhousaurus() {
        this.textureWidth = 64;
        this.textureHeight = 64;

        this.main = new AdvancedModelRendererExtended(this);
        this.main.setRotationPoint(-0.5F, 24.0F, 0.0F);


        this.body = new AdvancedModelRendererExtended(this);
        this.body.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.main.addChild(body);
        this.body.cubeList.add(new ModelBox(body, 0, 0, -4.0F, -7.0F, -4.0F, 9, 7, 10, 0.0F, false));

        this.body3 = new AdvancedModelRendererExtended(this);
        this.body3.setRotationPoint(0.0F, -4.75F, -5.0F);
        this.body.addChild(body3);
        this.body3.cubeList.add(new ModelBox(body3, 0, 17, -3.0F, -2.0F, -3.0F, 7, 6, 5, -0.01F, false));

        this.frontleftleg = new AdvancedModelRendererExtended(this);
        this.frontleftleg.setRotationPoint(4.0F, 0.0F, -0.5F);
        this.body3.addChild(frontleftleg);
        this.setRotateAngle(frontleftleg, 0.2075F, -0.5788F, 0.1562F);
        this.frontleftleg.cubeList.add(new ModelBox(frontleftleg, 32, 42, -1.5F, 0.0F, -1.5F, 5, 3, 3, 0.0F, false));

        this.frontleftleg2 = new AdvancedModelRendererExtended(this);
        this.frontleftleg2.setRotationPoint(3.5F, 0.5F, 0.0F);
        this.frontleftleg.addChild(frontleftleg2);
        this.setRotateAngle(frontleftleg2, 0.0934F, 0.1974F, 0.4456F);
        this.frontleftleg2.cubeList.add(new ModelBox(frontleftleg2, 44, 0, -0.3274F, -0.0937F, -1.5F, 4, 2, 3, 0.0F, false));

        this.frontleftleg3 = new AdvancedModelRendererExtended(this);
        this.frontleftleg3.setRotationPoint(3.6726F, 0.9063F, 0.0F);
        this.frontleftleg2.addChild(frontleftleg3);
        this.setRotateAngle(frontleftleg3, -0.1832F, -0.3405F, -0.2317F);
        this.frontleftleg3.cubeList.add(new ModelBox(frontleftleg3, 25, 34, -1.0F, 0.0F, -1.5F, 5, 0, 3, 0.0F, false));

        this.frontrightleg = new AdvancedModelRendererExtended(this);
        this.frontrightleg.setRotationPoint(-3.0F, 0.0F, -0.5F);
        this.body3.addChild(frontrightleg);
        this.setRotateAngle(frontrightleg, 0.2075F, 0.5788F, -0.1562F);
        this.frontrightleg.cubeList.add(new ModelBox(frontrightleg, 32, 42, -3.5F, 0.0F, -1.5F, 5, 3, 3, 0.0F, true));

        this.frontrightleg2 = new AdvancedModelRendererExtended(this);
        this.frontrightleg2.setRotationPoint(-3.5F, 1.5F, 0.0F);
        this.frontrightleg.addChild(frontrightleg2);
        this.setRotateAngle(frontrightleg2, 0.0934F, -0.1974F, -0.4456F);
        this.frontrightleg2.cubeList.add(new ModelBox(frontrightleg2, 44, 0, -3.25F, -1.0F, -1.5F, 4, 2, 3, 0.0F, true));

        this.frontrightleg3 = new AdvancedModelRendererExtended(this);
        this.frontrightleg3.setRotationPoint(-3.6726F, -0.0937F, 0.0F);
        this.frontrightleg2.addChild(frontrightleg3);
        this.setRotateAngle(frontrightleg3, -0.1832F, 0.3405F, 0.2317F);
        this.frontrightleg3.cubeList.add(new ModelBox(frontrightleg3, 25, 34, -4.0F, 0.0F, -1.5F, 5, 0, 3, 0.0F, true));

        this.neck = new AdvancedModelRendererExtended(this);
        this.neck.setRotationPoint(0.5F, 0.25F, -3.0F);
        this.body3.addChild(neck);
        this.neck.cubeList.add(new ModelBox(neck, 28, 0, -2.5F, -2.0F, -4.5F, 5, 4, 6, 0.01F, false));

        this.neck2 = new AdvancedModelRendererExtended(this);
        this.neck2.setRotationPoint(0.0F, -0.5F, -4.5F);
        this.neck.addChild(neck2);
        this.neck2.cubeList.add(new ModelBox(neck2, 0, 28, -2.0F, -1.5F, -6.0F, 4, 3, 7, 0.0F, false));

        this.neck3 = new AdvancedModelRendererExtended(this);
        this.neck3.setRotationPoint(0.0F, 0.0F, -6.0F);
        this.neck2.addChild(neck3);
        this.neck3.cubeList.add(new ModelBox(neck3, 35, 34, -1.5F, -1.5F, -4.5F, 3, 3, 5, -0.01F, false));

        this.head = new AdvancedModelRendererExtended(this);
        this.head.setRotationPoint(0.0F, 0.0F, -4.25F);
        this.neck3.addChild(head);


        this.upperjaw = new AdvancedModelRendererExtended(this);
        this.upperjaw.setRotationPoint(0.0F, 0.5F, -0.25F);
        this.head.addChild(upperjaw);
        this.upperjaw.cubeList.add(new ModelBox(upperjaw, 21, 44, -1.0F, -2.0F, -1.75F, 2, 2, 2, 0.01F, false));
        this.upperjaw.cubeList.add(new ModelBox(upperjaw, 3, 48, 1.01F, -1.5F, -1.5F, 0, 1, 1, 0.01F, false));
        this.upperjaw.cubeList.add(new ModelBox(upperjaw, 3, 48, -1.01F, -1.5F, -1.5F, 0, 1, 1, 0.01F, true));
        this.upperjaw.cubeList.add(new ModelBox(upperjaw, 13, 44, -0.5F, -1.0F, -4.5F, 1, 1, 3, 0.0F, false));

        this.cube_r1 = new AdvancedModelRendererExtended(this);
        this.cube_r1.setRotationPoint(0.0F, -2.0F, -2.5F);
        this.upperjaw.addChild(cube_r1);
        this.setRotateAngle(cube_r1, 0.2618F, 0.0F, 0.0F);
        this.cube_r1.cubeList.add(new ModelBox(cube_r1, 0, 0, -0.5F, 0.25F, -2.25F, 1, 1, 3, -0.01F, false));

        this.lowerjaw = new AdvancedModelRendererExtended(this);
        this.lowerjaw.setRotationPoint(0.0F, 0.5F, -0.25F);
        this.head.addChild(lowerjaw);
        this.lowerjaw.cubeList.add(new ModelBox(lowerjaw, 10, 38, -1.0F, 0.0F, -1.75F, 2, 1, 2, 0.0F, false));
        this.lowerjaw.cubeList.add(new ModelBox(lowerjaw, 0, 28, -1.0F, -1.75F, -0.75F, 2, 2, 1, -0.02F, false));
        this.lowerjaw.cubeList.add(new ModelBox(lowerjaw, 0, 4, -0.5F, 0.01F, -4.5F, 1, 1, 3, 0.0F, false));

        this.body2 = new AdvancedModelRendererExtended(this);
        this.body2.setRotationPoint(0.5F, -3.75F, 6.0F);
        this.body.addChild(body2);
        this.body2.cubeList.add(new ModelBox(body2, 19, 23, -3.5F, -3.0F, -1.0F, 7, 6, 5, 0.0F, false));

        this.backleftleg = new AdvancedModelRendererExtended(this);
        this.backleftleg.setRotationPoint(3.5F, -1.0F, 1.5F);
        this.body2.addChild(backleftleg);
        this.setRotateAngle(backleftleg, 0.0F, -0.3491F, 0.6545F);
        this.backleftleg.cubeList.add(new ModelBox(backleftleg, 38, 21, -1.5F, 0.0F, -1.5F, 5, 3, 3, 0.0F, false));

        this.backleftleg2 = new AdvancedModelRendererExtended(this);
        this.backleftleg2.setRotationPoint(3.5F, 1.5F, 0.0F);
        this.backleftleg.addChild(backleftleg2);
        this.setRotateAngle(backleftleg2, 0.0F, -0.5236F, 0.0F);
        this.backleftleg2.cubeList.add(new ModelBox(backleftleg2, 43, 27, -0.75F, -1.0F, -1.5F, 4, 2, 3, 0.0F, false));

        this.backleftleg3 = new AdvancedModelRendererExtended(this);
        this.backleftleg3.setRotationPoint(3.25F, 0.0F, 0.0F);
        this.backleftleg2.addChild(backleftleg3);
        this.setRotateAngle(backleftleg3, 0.0F, -0.3491F, 0.0F);
        this.backleftleg3.cubeList.add(new ModelBox(backleftleg3, 16, 17, -1.0F, 0.0F, -1.5F, 5, 0, 3, 0.0F, false));

        this.backrightleg4 = new AdvancedModelRendererExtended(this);
        this.backrightleg4.setRotationPoint(-3.5F, -1.0F, 1.5F);
        this.body2.addChild(backrightleg4);
        this.setRotateAngle(backrightleg4, 0.0F, 0.3491F, -0.6545F);
        this.backrightleg4.cubeList.add(new ModelBox(backrightleg4, 38, 21, -3.5F, 0.0F, -1.5F, 5, 3, 3, 0.0F, true));

        this.backrightleg5 = new AdvancedModelRendererExtended(this);
        this.backrightleg5.setRotationPoint(-3.5F, 1.5F, 0.0F);
        this.backrightleg4.addChild(backrightleg5);
        this.setRotateAngle(backrightleg5, 0.0F, 0.5236F, 0.0F);
        this.backrightleg5.cubeList.add(new ModelBox(backrightleg5, 43, 27, -3.25F, -1.0F, -1.5F, 4, 2, 3, 0.0F, true));

        this.backrightleg6 = new AdvancedModelRendererExtended(this);
        this.backrightleg6.setRotationPoint(-3.25F, 0.0F, 0.0F);
        this.backrightleg5.addChild(backrightleg6);
        this.setRotateAngle(backrightleg6, 0.0F, 0.3491F, 0.0F);
        this.backrightleg6.cubeList.add(new ModelBox(backrightleg6, 16, 17, -4.0F, 0.0F, -1.5F, 5, 0, 3, 0.0F, true));

        this.tail = new AdvancedModelRendererExtended(this);
        this.tail.setRotationPoint(0.0F, -1.75F, 4.0F);
        this.body2.addChild(tail);
        this.setRotateAngle(tail, -0.0873F, 0.0F, 0.0F);
        this.tail.cubeList.add(new ModelBox(tail, 32, 11, -2.5F, -0.75F, -0.5F, 5, 4, 6, 0.0F, false));

        this.tail2 = new AdvancedModelRendererExtended(this);
        this.tail2.setRotationPoint(0.0F, 1.0F, 5.5F);
        this.tail.addChild(tail2);
        this.setRotateAngle(tail2, -0.0873F, 0.0F, 0.0F);
        this.tail2.cubeList.add(new ModelBox(tail2, 15, 34, -1.5F, -1.5F, -1.0F, 3, 3, 7, 0.0F, false));

        this.tail3 = new AdvancedModelRendererExtended(this);
        this.tail3.setRotationPoint(0.0F, -0.25F, 6.0F);
        this.tail2.addChild(tail3);
        this.setRotateAngle(tail3, -0.1309F, 0.0F, 0.0F);
        this.tail3.cubeList.add(new ModelBox(tail3, 0, 38, -1.0F, -1.0F, -1.0F, 2, 2, 6, 0.0F, false));

        this.tail4 = new AdvancedModelRendererExtended(this);
        this.tail4.setRotationPoint(0.0F, -0.25F, 5.0F);
        this.tail3.addChild(tail4);
        this.setRotateAngle(tail4, -0.0436F, 0.0F, 0.0F);
        this.tail4.cubeList.add(new ModelBox(tail4, 24, 17, -0.5F, -0.5F, 0.0F, 1, 1, 5, 0.0F, false));

        updateDefaultPose();
        animator = ModelAnimator.create();
    }

    @Override
    public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        animate((IAnimatedEntity) entity, f, f1, f2, f3, f4, f5);
        this.body.render(f5 * 0.115f);
    }
    public void renderStatic(float f) {
        //GlStateManager.pushMatrix();
        //GlStateManager.enableBlend();
        //GlStateManager.blendFunc(GlStateManager.SourceFactor.SRC_ALPHA, GlStateManager.DestFactor.ONE_MINUS_SRC_ALPHA);
        //GlStateManager.disableCull();
        this.body.offsetZ = -0.1F;
        this.body.render(0.1F);
        //GlStateManager.enableCull();
        //GlStateManager.disableBlend();
        //GlStateManager.popMatrix();
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
        this.body.offsetY = 1.49F;

        EntityPrehistoricFloraPanzhousaurus Panzhousaurus = (EntityPrehistoricFloraPanzhousaurus) e;

        this.faceTarget(f3, f4, 5, neck);
        this.faceTarget(f3, f4, 5, neck2);
        this.faceTarget(f3, f4, 5, neck3);
        this.faceTarget(f3, f4, 5, head);

        float speed = 0.2F;
        AdvancedModelRenderer[] Tail = {this.body2, this.tail, this.tail2, this.tail3, this.tail4};
        AdvancedModelRenderer[] Torso = {this.neck3, this.neck2, this.neck};
        Panzhousaurus.tailBuffer.applyChainSwingBuffer(Tail);

        AdvancedModelRenderer[] FL = {this.frontleftleg, this.frontleftleg2, this.frontleftleg3};
        AdvancedModelRenderer[] FR = {this.frontrightleg, this.frontrightleg2, this.frontrightleg3};
        AdvancedModelRenderer[] BL = {this.backleftleg, this.backleftleg2, this.backleftleg3};
        AdvancedModelRenderer[] BR = {this.backrightleg4, this.backrightleg5, this.backrightleg6};

        if (!Panzhousaurus.isReallyInWater()) {
            this.frontleftleg.rotateAngleY = -(float) Math.toRadians(-35.6376);
            this.frontrightleg.rotateAngleY = -(float) Math.toRadians(35.6376);
            /*
            this.leftleg2.rotateAngleY = (float) Math.toRadians(-55);
            this.rightleg2.rotateAngleY = (float) Math.toRadians(55);

             */

            if (f3 == 0.0F || !Panzhousaurus.getIsMoving()) {
                return;
            }
            this.chainSwing(FR, speed *0.6F, 0.5F, -3, f2, 1);
            this.chainSwing(FL, speed*0.6F, 0.5F, -3, f2, 1);
           // this.swing(this.rightarm2, speed * 0.6F, 0.8F,false, -0.8F,0.8F, f2, 1F);
            //this.swing(this.leftarm2, speed * 0.6F, 0.8F,true, 0.8F,0.8F, f2, 1F);

            //this.flap(this.rightarm2, speed * 0.6F, 0.2F,false, -0.2F,0.2F, f2, 1F);
            //this.flap(this.leftarm2, speed * 0.6F, 0.2F,true, 0.2F,0.2F, f2, 1F);

            //this.swing(this.rightleg1, speed * 0.6F, -0.4F,false, -0.8F,0.8F, f2, 1F);
            //this.swing(this.leftleg1, speed * 0.6F, -0.4F,true, 0.8F,0.8F, f2, 1F);

            //this.flap(this.rightarm2, speed * 0.6F, 0.2F,false, -0.2F,0.2F, f2, 1F);
            //this.flap(this.leftarm2, speed * 0.6F, 0.2F,true, 0.2F,0.2F, f2, 1F);

            this.chainWave(Tail, speed, 0.05F, -3, f2, 1);
            this.chainSwing(Tail, speed * 0.8F, 0.12F, -3, f2, 0.8F);
            this.chainSwing(Torso, speed, 0.1F, -3, f2, 1);
        }
        else {
            speed = speed * 2F;
/*
            this.leftarm2.rotateAngleZ = (float) Math.toRadians(32);
            this.rightarm2.rotateAngleZ = (float) Math.toRadians(-32);

            this.leftleg2.rotateAngleZ = (float) Math.toRadians(28);
            this.rightleg2.rotateAngleZ = (float) Math.toRadians(-28);


 */

            this.neck.rotateAngleX = -(float) Math.toRadians(-7.5);
            this.neck2.rotateAngleX = -(float) Math.toRadians(-7.5);
            this.neck3.rotateAngleX = -(float) Math.toRadians(-7.5);

            this.chainFlapExtended(FR, speed * 0.8F, -0.12F, 1.5, 0, f2, 0.8F);
            this.chainFlapExtended(FL, speed * 0.8F, -0.12F, 1.5, 3F, f2, 0.8F);
            this.chainWaveExtended(BR, speed * 0.8F, -0.12F, 1.5, 3F, f2, 0.8F);
            this.chainWaveExtended(BL, speed * 0.8F, -0.12F, 1.5, 0, f2, 0.8F);

            this.chainFlapExtended(FR, speed * 0.8F, -0.12F, 1.5, 0, f2, 0.8F);
            this.chainFlapExtended(FL, speed * 0.8F, -0.12F, 1.5, 3F, f2, 0.8F);
            this.chainWaveExtended(BR, speed * 0.8F, -0.12F, 1.5, 3F, f2, 0.8F);
            this.chainWaveExtended(BL, speed * 0.8F, -0.12F, 1.5, 0, f2, 0.8F);

           // this.chainSwing(Torso, speed, 0.09F, -3, f2, 1);
            this.chainWave(Torso, speed, 0.07F, -3, f2, 1);
            if (f3 == 0.0F) {
                animator.rotate(this.neck3, -(float) Math.toRadians(7.5), (float) Math.toRadians(0), (float) Math.toRadians(0));
                return;
            }

            this.chainSwingExtended(FR, speed * 0.8F, 0.18F, -1.5, 0, f2, 0.8F);
            this.chainSwingExtended(FL, speed * 0.8F, 0.18F, -1.5, 3F, f2, 0.8F);

            this.chainSwingExtended(BR, speed * 0.8F, 0.12F, -1.5, 3F, f2, 0.8F);
            this.chainSwingExtended(BL, speed * 0.8F, 0.12F, -1.5, 0, f2, 0.8F);

            this.chainSwingExtended(FR, speed * 0.8F, 0.18F, -1.5, 0, f2, 0.8F);
            this.chainSwingExtended(FL, speed * 0.8F, 0.18F, -1.5, 3F, f2, 0.8F);
            this.chainSwingExtended(BR, speed * 0.8F, 0.12F, -1.5, 3F, f2, 0.8F);
            this.chainSwingExtended(BL, speed * 0.8F, 0.12F, -1.5, 0, f2, 0.8F);

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
        animator.move(this.neck, 0,0,-2F);
        animator.rotate(this.head, (float) Math.toRadians(-20), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(this.lowerjaw, (float) Math.toRadians(40), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.endKeyframe();
        animator.setStaticKeyframe(2);
        animator.resetKeyframe(2);

        animator.setAnimation(e.ROAR_ANIMATION);
        animator.startKeyframe(5);
        animator.move(this.neck, 0,0,-2F);
        animator.rotate(this.head, (float) Math.toRadians(-35), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(this.lowerjaw, (float) Math.toRadians(35), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(this.neck, (float) Math.toRadians(0), (float) Math.toRadians(25), (float) Math.toRadians(0));
        animator.endKeyframe();
        animator.setStaticKeyframe(5);
        animator.resetKeyframe(10);
    }
}
