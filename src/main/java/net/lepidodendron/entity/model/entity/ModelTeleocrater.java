package net.lepidodendron.entity.model.entity;

import net.ilexiconn.llibrary.client.model.ModelAnimator;
import net.ilexiconn.llibrary.client.model.tools.AdvancedModelRenderer;
import net.ilexiconn.llibrary.server.animation.IAnimatedEntity;
import net.lepidodendron.entity.EntityPrehistoricFloraTeleocrater;
import net.lepidodendron.entity.model.llibraryextensions.AdvancedModelBaseExtended;
import net.lepidodendron.entity.model.llibraryextensions.AdvancedModelRendererExtended;
import net.minecraft.client.model.ModelBox;
import net.minecraft.entity.Entity;

public class ModelTeleocrater extends AdvancedModelBaseExtended {
    private final AdvancedModelRendererExtended body;
    private final AdvancedModelRendererExtended legR;
    private final AdvancedModelRendererExtended legR2;
    private final AdvancedModelRendererExtended legR3;
    private final AdvancedModelRendererExtended legR4;
    private final AdvancedModelRendererExtended legL;
    private final AdvancedModelRendererExtended legL2;
    private final AdvancedModelRendererExtended legL3;
    private final AdvancedModelRendererExtended legL4;
    private final AdvancedModelRendererExtended body2;
    private final AdvancedModelRendererExtended armL;
    private final AdvancedModelRendererExtended armL2;
    private final AdvancedModelRendererExtended armL3;
    private final AdvancedModelRendererExtended armR;
    private final AdvancedModelRendererExtended armR2;
    private final AdvancedModelRendererExtended armR3;
    private final AdvancedModelRendererExtended neck;
    private final AdvancedModelRendererExtended neck2;
    private final AdvancedModelRendererExtended head;
    private final AdvancedModelRendererExtended cube_r1;
    private final AdvancedModelRendererExtended jaw;
    private final AdvancedModelRendererExtended tail;
    private final AdvancedModelRendererExtended tail2;
    private final AdvancedModelRendererExtended tail3;

    private ModelAnimator animator;

    public ModelTeleocrater() {
        this.textureWidth = 64;
        this.textureHeight = 64;

        this.body = new AdvancedModelRendererExtended(this);
        this.body.setRotationPoint(0.0F, 23.75F, 0.0F);
        this.body.cubeList.add(new ModelBox(body, 22, 0, -2.0F, -12.0F, 4.0F, 4, 5, 6, 0.0F, false));

        this.legR = new AdvancedModelRendererExtended(this);
        this.legR.setRotationPoint(-2.0F, -10.75F, 7.75F);
        this.body.addChild(legR);
        this.setRotateAngle(legR, -0.6981F, 0.0F, 0.0F);
        this.legR.cubeList.add(new ModelBox(legR, 0, 0, -1.25F, 0.0F, -1.5F, 2, 6, 3, 0.01F, true));

        this.legR2 = new AdvancedModelRendererExtended(this);
        this.legR2.setRotationPoint(-1.0F, 5.55F, -1.1F);
        this.legR.addChild(legR2);
        this.setRotateAngle(legR2, 0.829F, 0.0F, 0.0F);
        this.legR2.cubeList.add(new ModelBox(legR2, 34, 21, -0.25F, 0.0455F, -0.4771F, 2, 7, 2, 0.0F, true));

        this.legR3 = new AdvancedModelRendererExtended(this);
        this.legR3.setRotationPoint(0.0F, 6.6773F, 1.1704F);
        this.legR2.addChild(legR3);
        this.setRotateAngle(legR3, -0.1309F, 0.0F, 0.0F);
        this.legR3.cubeList.add(new ModelBox(legR3, 0, 35, -0.75F, 0.1F, -2.5F, 3, 1, 3, 0.0F, true));

        this.legR4 = new AdvancedModelRendererExtended(this);
        this.legR4.setRotationPoint(0.0F, 0.5F, -2.5F);
        this.legR3.addChild(legR4);
        this.legR4.cubeList.add(new ModelBox(legR4, 0, 9, -0.75F, -0.4F, -1.7F, 3, 1, 2, -0.001F, true));

        this.legL = new AdvancedModelRendererExtended(this);
        this.legL.setRotationPoint(2.0F, -10.75F, 7.75F);
        this.body.addChild(legL);
        this.setRotateAngle(legL, -0.6981F, 0.0F, 0.0F);
        this.legL.cubeList.add(new ModelBox(legL, 0, 0, -0.75F, 0.0F, -1.5F, 2, 6, 3, 0.01F, false));

        this.legL2 = new AdvancedModelRendererExtended(this);
        this.legL2.setRotationPoint(1.0F, 5.55F, -1.1F);
        this.legL.addChild(legL2);
        this.setRotateAngle(legL2, 0.829F, 0.0F, 0.0F);
        this.legL2.cubeList.add(new ModelBox(legL2, 34, 21, -1.75F, 0.0455F, -0.4771F, 2, 7, 2, 0.0F, false));

        this.legL3 = new AdvancedModelRendererExtended(this);
        this.legL3.setRotationPoint(0.0F, 6.6773F, 1.1704F);
        this.legL2.addChild(legL3);
        this.setRotateAngle(legL3, -0.1309F, 0.0F, 0.0F);
        this.legL3.cubeList.add(new ModelBox(legL3, 0, 35, -2.25F, 0.1F, -2.5F, 3, 1, 3, 0.0F, false));

        this.legL4 = new AdvancedModelRendererExtended(this);
        this.legL4.setRotationPoint(0.0F, 0.5F, -2.5F);
        this.legL3.addChild(legL4);
        this.legL4.cubeList.add(new ModelBox(legL4, 0, 9, -2.25F, -0.4F, -1.7F, 3, 1, 2, -0.001F, false));

        this.body2 = new AdvancedModelRendererExtended(this);
        this.body2.setRotationPoint(0.0F, -10.0F, 5.0F);
        this.body.addChild(body2);
        this.body2.cubeList.add(new ModelBox(body2, 18, 18, -2.0F, -2.0F, -14.0F, 4, 5, 2, 0.0F, false));
        this.body2.cubeList.add(new ModelBox(body2, 0, 0, -2.5F, -2.25F, -12.0F, 5, 6, 12, 0.0F, false));

        this.armL = new AdvancedModelRendererExtended(this);
        this.armL.setRotationPoint(2.0F, 2.0F, -12.75F);
        this.body2.addChild(armL);
        this.setRotateAngle(armL, 0.7854F, 0.0F, 0.0F);
        this.armL.cubeList.add(new ModelBox(armL, 40, 32, -0.75F, 0.0F, -1.0F, 2, 4, 2, 0.01F, false));

        this.armL2 = new AdvancedModelRendererExtended(this);
        this.armL2.setRotationPoint(1.0F, 3.5F, 0.7F);
        this.armL.addChild(armL2);
        this.setRotateAngle(armL2, -0.7854F, 0.0F, 0.0F);
        this.armL2.cubeList.add(new ModelBox(armL2, 12, 35, -1.75F, 0.1364F, -1.495F, 2, 6, 2, 0.0F, false));

        this.armL3 = new AdvancedModelRendererExtended(this);
        this.armL3.setRotationPoint(0.0F, 5.4364F, -0.595F);
        this.armL2.addChild(armL3);
        this.armL3.cubeList.add(new ModelBox(armL3, 0, 39, -1.75F, 0.0F, -2.9F, 2, 1, 3, 0.01F, false));

        this.armR = new AdvancedModelRendererExtended(this);
        this.armR.setRotationPoint(-2.0F, 2.0F, -12.75F);
        this.body2.addChild(armR);
        this.setRotateAngle(armR, 0.7854F, 0.0F, 0.0F);
        this.armR.cubeList.add(new ModelBox(armR, 40, 32, -1.25F, 0.0F, -1.0F, 2, 4, 2, 0.01F, true));

        this.armR2 = new AdvancedModelRendererExtended(this);
        this.armR2.setRotationPoint(-1.0F, 3.5F, 0.7F);
        this.armR.addChild(armR2);
        this.setRotateAngle(armR2, -0.7854F, 0.0F, 0.0F);
        this.armR2.cubeList.add(new ModelBox(armR2, 12, 35, -0.25F, 0.1364F, -1.495F, 2, 6, 2, 0.0F, true));

        this.armR3 = new AdvancedModelRendererExtended(this);
        this.armR3.setRotationPoint(0.0F, 5.4364F, -0.595F);
        this.armR2.addChild(armR3);
        this.armR3.cubeList.add(new ModelBox(armR3, 0, 39, -0.25F, 0.0F, -2.9F, 2, 1, 3, 0.01F, true));

        this.neck = new AdvancedModelRendererExtended(this);
        this.neck.setRotationPoint(0.0F, 0.0F, -14.0F);
        this.body2.addChild(neck);
        this.setRotateAngle(neck, -0.2618F, 0.0F, 0.0F);
        this.neck.cubeList.add(new ModelBox(neck, 34, 11, -1.5F, -1.5F, -6.0F, 3, 3, 7, 0.01F, false));

        this.neck2 = new AdvancedModelRendererExtended(this);
        this.neck2.setRotationPoint(0.0F, 0.0F, -5.75F);
        this.neck.addChild(neck2);
        this.setRotateAngle(neck2, 0.0873F, 0.0F, 0.0F);
        this.neck2.cubeList.add(new ModelBox(neck2, 0, 18, -1.0F, -1.5F, -6.0F, 2, 3, 6, -0.01F, false));

        this.head = new AdvancedModelRendererExtended(this);
        this.head.setRotationPoint(1.0F, -0.5F, -5.8F);
        this.neck2.addChild(head);
        this.setRotateAngle(head, 0.2618F, 0.0F, 0.0F);
        this.head.cubeList.add(new ModelBox(head, 42, 4, -2.0F, 0.0F, -6.0F, 2, 1, 3, 0.0F, false));
        this.head.cubeList.add(new ModelBox(head, 36, 0, -2.0F, 0.25F, -6.0F, 2, 1, 3, -0.01F, false));
        this.head.cubeList.add(new ModelBox(head, 20, 35, -2.0F, -1.0F, -3.0F, 2, 2, 3, 0.01F, false));

        this.cube_r1 = new AdvancedModelRendererExtended(this);
        this.cube_r1.setRotationPoint(0.0F, 0.0F, -6.0F);
        this.head.addChild(cube_r1);
        this.setRotateAngle(cube_r1, 0.3142F, 0.0F, 0.0F);
        this.cube_r1.cubeList.add(new ModelBox(cube_r1, 40, 38, -2.0F, 0.0F, 0.15F, 2, 1, 3, -0.01F, false));

        this.jaw = new AdvancedModelRendererExtended(this);
        this.jaw.setRotationPoint(-1.0F, 1.0F, -0.25F);
        this.head.addChild(jaw);
        this.jaw.cubeList.add(new ModelBox(jaw, 0, 27, -1.0F, 0.0F, -5.75F, 2, 1, 6, 0.0F, false));
        this.jaw.cubeList.add(new ModelBox(jaw, 18, 25, -1.0F, -0.25F, -5.75F, 2, 1, 4, -0.01F, false));
        this.jaw.cubeList.add(new ModelBox(jaw, 42, 21, -1.0F, -1.9F, -1.75F, 2, 2, 2, -0.02F, false));

        this.tail = new AdvancedModelRendererExtended(this);
        this.tail.setRotationPoint(0.0F, -11.0F, 10.0F);
        this.body.addChild(tail);
        this.setRotateAngle(tail, -0.0873F, 0.0F, 0.0F);
        this.tail.cubeList.add(new ModelBox(tail, 23, 32, -1.5F, -0.8F, -1.0F, 3, 3, 11, 0.0F, false));

        this.tail2 = new AdvancedModelRendererExtended(this);
        this.tail2.setRotationPoint(0.0F, 0.5F, 10.0F);
        this.tail.addChild(tail2);
        this.setRotateAngle(tail2, -0.1745F, 0.0F, 0.0F);
        this.tail2.cubeList.add(new ModelBox(tail2, 18, 18, -1.0F, -0.8F, -1.0F, 2, 2, 12, 0.0F, false));

        this.tail3 = new AdvancedModelRendererExtended(this);
        this.tail3.setRotationPoint(0.0F, 0.1F, 11.0F);
        this.tail2.addChild(tail3);
        this.setRotateAngle(tail3, 0.0436F, 0.0F, 0.0F);
        this.tail3.cubeList.add(new ModelBox(tail3, 0, 18, -0.5F, -0.4F, -1.0F, 1, 1, 16, 0.0F, false));

        updateDefaultPose();
        animator = ModelAnimator.create();
    }

    @Override
    public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        animate((IAnimatedEntity) entity, f, f1, f2, f3, f4, f5);
        this.body.render(f5 );
    }
    public void renderStaticFloor(float f) {
        this.setRotateAngle(armL, 0.48F, 0.0F, 0.0F);
        this.setRotateAngle(armL2, -1.1781F, 0.0F, 0.0F);
        this.setRotateAngle(armL3, 0.9599F, 0.0F, 0.0F);
        this.setRotateAngle(armR, 0.48F, 0.0F, 0.0F);
        this.setRotateAngle(armR2, -1.1781F, 0.0F, 0.0F);
        this.setRotateAngle(armR3, 0.9599F, 0.0F, 0.0F);
        this.setRotateAngle(body, -0.1309F, 0.0F, 0.0F);
        this.setRotateAngle(body2, -0.1309F, -0.1309F, 0.0F);
        this.setRotateAngle(cube_r1, 0.3142F, 0.0F, 0.0F);
        this.setRotateAngle(head, 0.3054F, -0.0436F, -0.0436F);
        this.setRotateAngle(jaw, 0.1309F, 0.0F, 0.0F);
        this.setRotateAngle(legL, -1.4835F, 0.0F, 0.0F);
        this.setRotateAngle(legL2, 1.8762F, 0.0F, 0.0F);
        this.setRotateAngle(legL3, -0.2618F, 0.0F, 0.0F);
        this.setRotateAngle(legR, -1.4835F, 0.0F, 0.0F);
        this.setRotateAngle(legR2, 1.8762F, 0.0F, 0.0F);
        this.setRotateAngle(legR3, -0.2618F, 0.0F, 0.0F);
        this.setRotateAngle(neck, -0.2182F, -0.0873F, -0.0436F);
        this.setRotateAngle(neck2, 0.1309F, -0.1745F, -0.0436F);
        this.setRotateAngle(tail, -0.1745F, 0.1309F, 0.0F);
        this.setRotateAngle(tail2, 0.2356F, 0.2182F, 0.0873F);
        this.setRotateAngle(tail3, 0.0436F, 0.3054F, 0.0436F);
        this.body.offsetY = 0.01F;
        this.body.render(0.01F);
        resetToDefaultPose();
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
        //this.body.offsetY = 0.63F;
        //this.basin.offsetZ = 0.2F;

        EntityPrehistoricFloraTeleocrater Teleocrater = (EntityPrehistoricFloraTeleocrater) e;
        float masterSpeed = Teleocrater.getTravelSpeed();

        this.faceTarget(f3, f4, 8, neck);
        this.faceTarget(f3, f4, 8, neck2);
        this.faceTarget(f3, f4, 8, head);

        //float speed = 0.2F;

        AdvancedModelRenderer[] Tail = {this.tail, this.tail2, this.tail3};
        AdvancedModelRenderer[] Neck = {this.neck, this.neck2, this.head};


        //AdvancedModelRenderer[] Whole = {this.neck2, this.neck, this.body, this.body2, this.body3, this.tail, this.tail2, this.tail3, this.tail4, this.tail5};

        if (Teleocrater.getAnimation() == Teleocrater.LAY_ANIMATION) {
            this.chainSwing(Neck, 0.5F, 0.10F, 0.5, f2, 0.8F);
            this.chainWave(Neck, 0.5F * 2, -0.02F, 0.5F, f2, 0.8F);
            //Other stuff

            return;
        }
        
        if (!Teleocrater.isReallyInWater()) {

            if (f3 == 0.0F || !Teleocrater.getIsMoving()) {
                this.chainSwing(Neck, 0.05F, 0.10F, 0.5, f2, 0.8F);
                this.chainWave(Neck, 0.05F * 2, -0.02F, 0.5F, f2, 0.8F);

                this.chainWave(Tail, (0.15F * 0.5F), 0.125F * 0.35F, 0.2F, f2, 1F);
                this.chainSwing(Tail, (0.15F * 0.5F) * 4F, 0.05F * 0.65F, 0.12F, f2, 1F);

                return;
           }

            if (Teleocrater.getIsFast()) { //Running
                float speed = masterSpeed / 1.2F;
                //this.basin.offsetY = 0.75F;
                this.legL.offsetY = this.moveBoxExtended(speed, (float) Math.toRadians(0.625), false, 3, f2, 1.5F);
                this.legR.offsetY = this.moveBoxExtended(speed, (float) Math.toRadians(0.625), false, 0, f2, 1.5F);

                this.walk(armL, speed, (float)Math.toRadians(22), true, 8.0F, -(float)Math.toRadians(15), f2, 1.0F);
                this.walk(armR, speed, (float)Math.toRadians(22), true, 5.0F, -(float)Math.toRadians(15), f2, 1.0F);

                this.walk(armL2, speed, 0.56F, true, 3.5F, 0F, f2, 1F);
                this.walk(armR2, speed, 0.56F, true, 6.5F, 0F, f2, 1F);

                this.walk(armL3, speed, (float)Math.toRadians(5), false, 4.0F, (float)Math.toRadians(3), f2, 1F);
                this.walk(armR3, speed, (float)Math.toRadians(5), false, 1.0F, (float)Math.toRadians(3), f2, 1F);


                //---
                this.walk(legL, speed, (float)Math.toRadians(40), true, 8.0F, -(float)Math.toRadians(28), f2, 1.0F);
                this.walk(legR, speed, (float)Math.toRadians(40), true, 5.0F, -(float)Math.toRadians(28), f2, 1.0F);

                this.walk(legL2, speed, 0.36F, true, 6.5F, 0F, f2, 1F);
                this.walk(legR2, speed, 0.36F, true, 3.5F, 0F, f2, 1F);

                this.walk(legL3, speed, (float)Math.toRadians(25), false, 4.0F, (float)Math.toRadians(15), f2, 1F);
                this.walk(legR3, speed, (float)Math.toRadians(25), false, 1.0F, (float)Math.toRadians(15), f2, 1F);

                this.walk(legL4, speed, 0.6F, true, 4.5F, 0.535F, f2, 1F);
                this.walk(legR4, speed, 0.6F, true, 1.5F, 0.535F, f2, 1F);

                this.bobExtended(body, speed * 2F, 0.73F, false, 3.5F, f2, 1F);

                this.bobExtended(legL, speed, 0.8F, false, 3.0F, f2, 1F);
                this.bobExtended(legR, speed, 0.8F, false, 0.0F, f2, 1F);

                this.flap(body, speed, 0.08F, false, 6.0F, 0.03F, f2, 1.0F);
                this.flap(body2, speed, -0.08F, false, 6.0F, -0.03F, f2, 1.0F);
                //this.flap(chest1, speed, -0.06F, false, 6.0F, -0.02F, f2, 1.0F);
                this.flap(neck, speed, -0.06F, false, 6.0F, -0.02F, f2, 1.0F);

                this.flap(legL, speed, -0.08F, false, 6.0F, -0.04F, f2, 1.0F);
                this.flap(legR, speed, -0.08F, false, 6.0F, -0.04F, f2, 1.0F);

                this.walk(body2, speed * 2, 0.009F, false, 2.5F, -0.01F, f2, 0.8F);
                //this.walk(chest1, speed * 2, 0.025F, false, 2.5F, -0.01F, f2, 0.8F);

                this.body.offsetZ = this.moveBoxExtended(speed * 2, (float) Math.toRadians(1.5), false, 1.75F, f2, 1) + 0.2F;

                //---


                this.walk(neck, speed * 4, -0.1F, false, 2.5F, 0F, f2, 0.5F);
                this.walk(neck2, speed * 4, -0.04F, false, 2.5F, 0F, f2, 0.5F);
                this.walk(head, speed * 4, 0.1F, false, 2.5F, 0F, f2, 0.5F);

                this.chainWave(Tail, (speed * 1.2F), 0.125F, 0.5F, f2, 1F);
                this.chainSwing(Tail, (speed * 0.6F) * 4F, 0.05F, 0.12F, f2, 1F);

            }
            else { //Walking
                float speed = masterSpeed / 2.0F;
                //this.basin.offsetY = 0.815F;
                this.legL.offsetY = this.moveBoxExtended(speed, (float) Math.toRadians(0.225), false, 3, f2, 1.5F);
                this.legR.offsetY = this.moveBoxExtended(speed, (float) Math.toRadians(0.225), false, 0, f2, 1.5F);

                this.walk(armL, speed, (float)Math.toRadians(18), true, 5.0F, (float)Math.toRadians(9), f2, 1.0F);
                this.walk(armR, speed, (float)Math.toRadians(18), true, 8.0F, (float)Math.toRadians(9), f2, 1.0F);

                this.walk(armL2, speed, 0.46F, true, 3.5F, 0F, f2, 1F);
                this.walk(armR2, speed, 0.46F, true, 6.5F, 0F, f2, 1F);

                this.walk(armL3, speed, (float)Math.toRadians(5), false, 4.0F, (float)Math.toRadians(3), f2, 1F);
                this.walk(armR3, speed, (float)Math.toRadians(5), false, 1.0F, (float)Math.toRadians(3), f2, 1F);

                this.walk(legL, speed, (float)Math.toRadians(30), true, 8.0F, -(float)Math.toRadians(16), f2, 1.0F);
                this.walk(legR, speed, (float)Math.toRadians(30), true, 5.0F, -(float)Math.toRadians(16), f2, 1.0F);

                this.walk(legL2, speed, 0.36F, true, 6.5F, 0F, f2, 1F);
                this.walk(legR2, speed, 0.36F, true, 3.5F, 0F, f2, 1F);

                this.walk(legL3, speed, (float)Math.toRadians(25), false, 4.0F, (float)Math.toRadians(15), f2, 1F);
                this.walk(legR3, speed, (float)Math.toRadians(25), false, 1.0F, (float)Math.toRadians(15), f2, 1F);

                this.walk(legL4, speed, 0.6F, true, 4.5F, 0.535F, f2, 0.8F);
                this.walk(legR4, speed, 0.6F, true, 1.5F, 0.535F, f2, 0.8F);

                this.bobExtended(body, speed * 2F, 0.33F, false, 3.5F, f2, 1F);

                this.bobExtended(legL, speed, 0.8F, false, 3.0F, f2, 1F);
                this.bobExtended(legR, speed, 0.8F, false, 0.0F, f2, 1F);

                this.flap(body, speed, 0.08F, false, 6.0F, 0.03F, f2, 1.0F);
                this.flap(body2, speed, -0.08F, false, 6.0F, -0.03F, f2, 1.0F);
                //this.flap(chest1, speed, -0.06F, false, 6.0F, -0.02F, f2, 1.0F);
                this.flap(neck, speed, 0.06F, false, 6.0F, 0.02F, f2, 1.0F);

                this.flap(legL, speed, -0.08F, false, 6.0F, -0.04F, f2, 1.0F);
                this.flap(legR, speed, -0.08F, false, 6.0F, -0.04F, f2, 1.0F);

                this.walk(body2, speed * 2, 0.009F, false, 2.5F, -0.01F, f2, 0.8F);
                //this.walk(chest1, speed * 2, 0.025F, false, 2.5F, -0.01F, f2, 0.8F);

                this.walk(neck, speed * 0.5F, -0.10F * 2.25F, false, 2.5F, 0F, f2, 0.9F);
                this.walk(neck2, speed * 0.5F, -0.10F * 2.25F, false, 2.5F, 0F, f2, 0.9F);
                this.walk(head, speed * 0.5F, 0.10F * 2.25F, false, 2.5F, 0F, f2, 0.9F);

                this.chainWave(Tail, (speed * 0.5F), 0.125F * 0.55F, 0.2F, f2, 1F);
                this.chainSwing(Tail, (speed * 0.5F) * 4F, 0.05F * 0.65F, 0.12F, f2, 1F);

                this.body.offsetZ = this.moveBoxExtended(speed * 2, (float) Math.toRadians(1.2), false, 1.75F, f2, 1) + 0.2F;

            }
        }
        else {
            //Swimming pose:
            if (f3 == 0.0F) { //static in water
                return;
            }
            //moving in water
            return;
        }
    }

    public void animate(IAnimatedEntity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        EntityPrehistoricFloraTeleocrater e = (EntityPrehistoricFloraTeleocrater) entity;
        animator.update(entity);
        this.resetToDefaultPose();
        setRotationAngles(f, f1, f2, f3, f4, f5, (Entity) entity);

        animator.setAnimation(e.DRINK_ANIMATION);
        animator.startKeyframe(10);
        animator.move(this.body, 0,(float) Math.toRadians(2),0);
        animator.rotate(tail, (float) Math.toRadians(-22.5), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(body, (float) Math.toRadians(15), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(legL, (float) Math.toRadians(-15), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(legR, (float) Math.toRadians(-15), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(body2, (float) Math.toRadians(15), (float) Math.toRadians(0), (float) Math.toRadians(0));
        //animator.rotate(chest1, (float) Math.toRadians(20), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(neck, (float) Math.toRadians(40), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(neck2, (float) Math.toRadians(25), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.endKeyframe();
        animator.setStaticKeyframe(2);
        animator.startKeyframe(3);
        animator.move(this.body, 0,(float) Math.toRadians(2),0);
        animator.rotate(tail, (float) Math.toRadians(-22.5), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(body, (float) Math.toRadians(15), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(legL, (float) Math.toRadians(-15), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(legR, (float) Math.toRadians(-15), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(body2, (float) Math.toRadians(15), (float) Math.toRadians(0), (float) Math.toRadians(0));
        //animator.rotate(chest1, (float) Math.toRadians(20), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(neck, (float) Math.toRadians(40), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(neck2, (float) Math.toRadians(25), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.endKeyframe();
        animator.setStaticKeyframe(2);
        animator.startKeyframe(3);
        animator.move(this.body, 0,(float) Math.toRadians(2),0);
        animator.rotate(tail, (float) Math.toRadians(-22.5), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(body, (float) Math.toRadians(15), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(legL, (float) Math.toRadians(-15), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(legR, (float) Math.toRadians(-15), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(body2, (float) Math.toRadians(15), (float) Math.toRadians(0), (float) Math.toRadians(0));
        //animator.rotate(chest1, (float) Math.toRadians(20), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(neck, (float) Math.toRadians(40), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(neck2, (float) Math.toRadians(25), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.endKeyframe();
        animator.setStaticKeyframe(2);
        animator.startKeyframe(3);
        animator.move(this.body, 0,(float) Math.toRadians(2),0);
        animator.rotate(tail, (float) Math.toRadians(-22.5), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(body, (float) Math.toRadians(15), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(legL, (float) Math.toRadians(-15), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(legR, (float) Math.toRadians(-15), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(body2, (float) Math.toRadians(15), (float) Math.toRadians(0), (float) Math.toRadians(0));
        //animator.rotate(chest1, (float) Math.toRadians(20), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(neck, (float) Math.toRadians(40), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(neck2, (float) Math.toRadians(25), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.endKeyframe();
        animator.setStaticKeyframe(2);
        animator.startKeyframe(3);
        animator.move(this.body, 0,(float) Math.toRadians(2),0);
        animator.rotate(tail, (float) Math.toRadians(-22.5), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(body, (float) Math.toRadians(15), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(legL, (float) Math.toRadians(-15), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(legR, (float) Math.toRadians(-15), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(body2, (float) Math.toRadians(15), (float) Math.toRadians(0), (float) Math.toRadians(0));
        //animator.rotate(chest1, (float) Math.toRadians(20), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(neck, (float) Math.toRadians(40), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(neck2, (float) Math.toRadians(25), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.endKeyframe();
        animator.setStaticKeyframe(2);
        animator.resetKeyframe(10);

        animator.setAnimation(e.ATTACK_ANIMATION);
        animator.startKeyframe(5);
        animator.rotate(head, (float) Math.toRadians(-28), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(jaw, (float) Math.toRadians(50), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(neck2, (float) Math.toRadians(28.7), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.endKeyframe();
        animator.setStaticKeyframe(2);
        animator.resetKeyframe(6);

        animator.setAnimation(e.EAT_ANIMATION);
        animator.startKeyframe(5);
        animator.rotate(head, (float) Math.toRadians(-28), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(jaw, (float) Math.toRadians(50), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(neck2, (float) Math.toRadians(50), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.endKeyframe();
        animator.setStaticKeyframe(2);
        animator.resetKeyframe(6);

        animator.setAnimation(e.NOISE_ANIMATION);
        animator.startKeyframe(8);
        animator.rotate(neck, (float) Math.toRadians(-5), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(neck2, (float) Math.toRadians(35), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(head, (float) Math.toRadians(-50), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(jaw, (float) Math.toRadians(30), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.endKeyframe();
        animator.setStaticKeyframe(8);
        animator.resetKeyframe(9);

        animator.setAnimation(e.ROAR_ANIMATION);
        animator.startKeyframe(10);
        animator.rotate(neck, (float) Math.toRadians(-15), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(neck2, (float) Math.toRadians(-20), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(head, (float) Math.toRadians(-50), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(jaw, (float) Math.toRadians(60), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.endKeyframe();
        animator.setStaticKeyframe(10);
        animator.resetKeyframe(10);
    }
}
