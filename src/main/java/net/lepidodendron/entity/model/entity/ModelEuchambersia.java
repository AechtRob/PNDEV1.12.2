package net.lepidodendron.entity.model.entity;

import net.ilexiconn.llibrary.client.model.ModelAnimator;
import net.ilexiconn.llibrary.server.animation.IAnimatedEntity;
import net.lepidodendron.entity.EntityPrehistoricFloraEuchambersia;
import net.lepidodendron.entity.model.ModelBasePalaeopedia;
import net.lepidodendron.entity.model.llibraryextensions.AdvancedModelRendererExtended;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

public class ModelEuchambersia extends ModelBasePalaeopedia {
    private final AdvancedModelRendererExtended Euchambersia;
    private final AdvancedModelRendererExtended LArm;
    private final AdvancedModelRendererExtended LArm2;
    private final AdvancedModelRendererExtended LHand;
    private final AdvancedModelRendererExtended Neck;
    private final AdvancedModelRendererExtended Head;
    private final AdvancedModelRendererExtended cube_r1;
    private final AdvancedModelRendererExtended cube_r2;
    private final AdvancedModelRendererExtended cube_r3;
    private final AdvancedModelRendererExtended cube_r4;
    private final AdvancedModelRendererExtended cube_r5;
    private final AdvancedModelRendererExtended Jaw;
    private final AdvancedModelRendererExtended cube_r6;
    private final AdvancedModelRendererExtended cube_r7;
    private final AdvancedModelRendererExtended cube_r8;
    private final AdvancedModelRendererExtended cube_r9;
    private final AdvancedModelRendererExtended Body;
    private final AdvancedModelRendererExtended Body2;
    private final AdvancedModelRendererExtended Tail;
    private final AdvancedModelRendererExtended Tail2;
    private final AdvancedModelRendererExtended LLeg;
    private final AdvancedModelRendererExtended LLeg2;
    private final AdvancedModelRendererExtended LFoot;
    private final AdvancedModelRendererExtended RLeg;
    private final AdvancedModelRendererExtended RLeg2;
    private final AdvancedModelRendererExtended RFoot;
    private final AdvancedModelRendererExtended RArm;
    private final AdvancedModelRendererExtended RArm2;
    private final AdvancedModelRendererExtended RHand;

    private ModelAnimator animator;

    public ModelEuchambersia() {
        this.textureWidth = 64;
        this.textureHeight = 64;

        this.Euchambersia = new AdvancedModelRendererExtended(this);
        this.Euchambersia.setRotationPoint(0.0F, 13.0F, -8.0F);
        this.setRotateAngle(Euchambersia, 0.0873F, 0.0F, 0.0F);
        this.Euchambersia.cubeList.add(new ModelBox(Euchambersia, 25, 20, -3.0F, -3.0F, -3.0F, 6, 6, 6, 0.01F, false));

        this.LArm = new AdvancedModelRendererExtended(this);
        this.LArm.setRotationPoint(3.0F, 1.0F, -0.5F);
        this.Euchambersia.addChild(LArm);
        this.setRotateAngle(LArm, 0.6981F, 0.0F, 0.0F);
        this.LArm.cubeList.add(new ModelBox(LArm, 49, 48, -1.0F, -1.0F, -1.5F, 2, 6, 3, 0.0F, false));

        this.LArm2 = new AdvancedModelRendererExtended(this);
        this.LArm2.setRotationPoint(0.25F, 3.5F, 0.0F);
        this.LArm.addChild(LArm2);
        this.setRotateAngle(LArm2, -0.7854F, 0.0F, 0.0F);
        this.LArm2.cubeList.add(new ModelBox(LArm2, 0, 0, -1.25F, 0.5F, -1.5F, 2, 6, 3, -0.01F, false));

        this.LHand = new AdvancedModelRendererExtended(this);
        this.LHand.setRotationPoint(0.0F, 6.5F, 0.0F);
        this.LArm2.addChild(LHand);
        this.LHand.cubeList.add(new ModelBox(LHand, 0, 46, -1.75F, -1.0F, -3.5F, 3, 2, 5, 0.0F, false));

        this.Neck = new AdvancedModelRendererExtended(this);
        this.Neck.setRotationPoint(0.0F, 0.0F, -1.5F);
        this.Euchambersia.addChild(Neck);
        this.setRotateAngle(Neck, -0.3054F, 0.0F, 0.0F);
        this.Neck.cubeList.add(new ModelBox(Neck, 0, 33, -2.0F, -3.0F, -6.5F, 4, 6, 6, -0.01F, false));

        this.Head = new AdvancedModelRendererExtended(this);
        this.Head.setRotationPoint(0.0F, 0.0F, -6.5F);
        this.Neck.addChild(Head);
        this.setRotateAngle(Head, 0.2618F, 0.0F, 0.0F);
        this.Head.cubeList.add(new ModelBox(Head, 44, 0, -2.5F, -3.0F, -3.0F, 5, 3, 4, 0.0F, false));

        this.cube_r1 = new AdvancedModelRendererExtended(this);
        this.cube_r1.setRotationPoint(0.0F, -3.0F, -3.0F);
        this.Head.addChild(cube_r1);
        this.setRotateAngle(cube_r1, 0.0873F, 0.0F, 0.0F);
        this.cube_r1.cubeList.add(new ModelBox(cube_r1, 51, 36, -1.5F, 0.0F, -3.0F, 3, 3, 3, 0.0F, false));

        this.cube_r2 = new AdvancedModelRendererExtended(this);
        this.cube_r2.setRotationPoint(0.0F, 0.6F, -3.7F);
        this.Head.addChild(cube_r2);
        this.setRotateAngle(cube_r2, -0.1752F, 0.0F, 0.0F);
        this.cube_r2.cubeList.add(new ModelBox(cube_r2, 0, 54, -1.5F, -1.0F, -1.97F, 3, 1, 2, -0.02F, false));

        this.cube_r3 = new AdvancedModelRendererExtended(this);
        this.cube_r3.setRotationPoint(0.0F, 0.3F, -5.5F);
        this.Head.addChild(cube_r3);
        this.setRotateAngle(cube_r3, 0.2182F, 0.0F, 0.0F);
        this.cube_r3.cubeList.add(new ModelBox(cube_r3, 34, 33, -1.0F, -0.05F, 0.0F, 2, 1, 3, 0.0F, false));

        this.cube_r4 = new AdvancedModelRendererExtended(this);
        this.cube_r4.setRotationPoint(0.0F, 0.5F, -4.5F);
        this.Head.addChild(cube_r4);
        this.setRotateAngle(cube_r4, 0.0436F, 0.0F, 0.0F);
        this.cube_r4.cubeList.add(new ModelBox(cube_r4, 0, 20, -1.46F, -0.45F, 0.0F, 1, 2, 1, 0.0F, false));

        this.cube_r5 = new AdvancedModelRendererExtended(this);
        this.cube_r5.setRotationPoint(0.0F, 0.6F, -3.7F);
        this.Head.addChild(cube_r5);
        this.setRotateAngle(cube_r5, 0.3595F, 0.0F, 0.0F);
        this.cube_r5.cubeList.add(new ModelBox(cube_r5, 30, 54, -1.5F, -1.0F, 0.0F, 3, 1, 2, -0.01F, false));

        this.Jaw = new AdvancedModelRendererExtended(this);
        this.Jaw.setRotationPoint(0.0F, 0.0F, 1.0F);
        this.Head.addChild(Jaw);
        this.Jaw.cubeList.add(new ModelBox(Jaw, 46, 29, -2.5F, 0.0F, -4.0F, 5, 2, 4, 0.0F, false));

        this.cube_r6 = new AdvancedModelRendererExtended(this);
        this.cube_r6.setRotationPoint(0.0F, 0.75F, -6.0F);
        this.Jaw.addChild(cube_r6);
        this.setRotateAngle(cube_r6, -0.1309F, 0.0F, 0.0F);
        this.cube_r6.cubeList.add(new ModelBox(cube_r6, 19, 20, -1.0F, -2.0F, 0.0F, 2, 2, 3, 0.0F, false));

        this.cube_r7 = new AdvancedModelRendererExtended(this);
        this.cube_r7.setRotationPoint(0.0F, 3.0F, 0.0F);
        this.Jaw.addChild(cube_r7);
        this.setRotateAngle(cube_r7, -0.2496F, 0.0F, 0.0F);
        this.cube_r7.cubeList.add(new ModelBox(cube_r7, 32, 48, -2.0F, -1.0F, -4.0F, 4, 1, 4, -0.02F, false));

        this.cube_r8 = new AdvancedModelRendererExtended(this);
        this.cube_r8.setRotationPoint(0.0F, 0.0F, -4.0F);
        this.Jaw.addChild(cube_r8);
        this.setRotateAngle(cube_r8, 0.0873F, 0.0F, 0.0F);
        this.cube_r8.cubeList.add(new ModelBox(cube_r8, 15, 33, -1.5F, 0.0F, -2.73F, 3, 2, 3, -0.03F, false));

        this.cube_r9 = new AdvancedModelRendererExtended(this);
        this.cube_r9.setRotationPoint(0.0F, 0.0F, -3.0F);
        this.Jaw.addChild(cube_r9);
        this.setRotateAngle(cube_r9, -0.4014F, 0.0F, 0.0F);
        this.cube_r9.cubeList.add(new ModelBox(cube_r9, 50, 23, -2.0F, -2.5F, 0.1F, 4, 3, 2, 0.0F, false));

        this.Body = new AdvancedModelRendererExtended(this);
        this.Body.setRotationPoint(0.0F, 0.0F, 3.0F);
        this.Euchambersia.addChild(Body);
        this.setRotateAngle(Body, -0.0436F, 0.0F, 0.0F);
        this.Body.cubeList.add(new ModelBox(Body, 0, 0, -3.5F, -3.0F, -1.0F, 7, 7, 12, 0.02F, false));

        this.Body2 = new AdvancedModelRendererExtended(this);
        this.Body2.setRotationPoint(0.0F, 0.0F, 10.0F);
        this.Body.addChild(Body2);
        this.setRotateAngle(Body2, -0.3054F, 0.0F, 0.0F);
        this.Body2.cubeList.add(new ModelBox(Body2, 0, 20, -3.0F, -3.0F, 0.0F, 6, 6, 6, 0.0F, false));

        this.Tail = new AdvancedModelRendererExtended(this);
        this.Tail.setRotationPoint(0.0F, -1.0F, 5.0F);
        this.Body2.addChild(Tail);
        this.setRotateAngle(Tail, -0.48F, 0.0F, 0.0F);
        this.Tail.cubeList.add(new ModelBox(Tail, 36, 38, -2.0F, -1.5F, 0.0F, 4, 3, 6, 0.0F, false));

        this.Tail2 = new AdvancedModelRendererExtended(this);
        this.Tail2.setRotationPoint(0.0F, 0.0F, 5.0F);
        this.Tail.addChild(Tail2);
        this.setRotateAngle(Tail2, -0.1745F, 0.0F, 0.0F);
        this.Tail2.cubeList.add(new ModelBox(Tail2, 21, 33, -1.0F, -1.0F, 0.0F, 2, 2, 8, 0.0F, false));

        this.LLeg = new AdvancedModelRendererExtended(this);
        this.LLeg.setRotationPoint(3.0F, -1.0F, 2.5F);
        this.Body2.addChild(LLeg);
        this.LLeg.cubeList.add(new ModelBox(LLeg, 44, 11, -1.5F, -1.0F, -2.5F, 3, 6, 5, 0.0F, false));

        this.LLeg2 = new AdvancedModelRendererExtended(this);
        this.LLeg2.setRotationPoint(0.0F, 4.0F, 0.0F);
        this.LLeg.addChild(LLeg2);
        this.setRotateAngle(LLeg2, 0.2618F, 0.0F, 0.0F);
        this.LLeg2.cubeList.add(new ModelBox(LLeg2, 17, 44, -1.5F, 0.0F, -2.0F, 3, 7, 4, -0.01F, false));

        this.LFoot = new AdvancedModelRendererExtended(this);
        this.LFoot.setRotationPoint(0.0F, 7.0F, 0.5F);
        this.LLeg2.addChild(LFoot);
        this.LFoot.cubeList.add(new ModelBox(LFoot, 27, 0, -2.0F, -1.0F, -6.0F, 4, 2, 8, 0.0F, false));

        this.RLeg = new AdvancedModelRendererExtended(this);
        this.RLeg.setRotationPoint(-3.0F, -1.0F, 2.5F);
        this.Body2.addChild(RLeg);
        this.RLeg.cubeList.add(new ModelBox(RLeg, 44, 11, -1.5F, -1.0F, -2.5F, 3, 6, 5, 0.0F, true));

        this.RLeg2 = new AdvancedModelRendererExtended(this);
        this.RLeg2.setRotationPoint(0.0F, 4.0F, 0.0F);
        this.RLeg.addChild(RLeg2);
        this.setRotateAngle(RLeg2, 0.2618F, 0.0F, 0.0F);
        this.RLeg2.cubeList.add(new ModelBox(RLeg2, 17, 44, -1.5F, 0.0F, -2.0F, 3, 7, 4, -0.01F, true));

        this.RFoot = new AdvancedModelRendererExtended(this);
        this.RFoot.setRotationPoint(0.0F, 7.0F, 0.5F);
        this.RLeg2.addChild(RFoot);
        this.RFoot.cubeList.add(new ModelBox(RFoot, 27, 0, -2.0F, -1.0F, -6.0F, 4, 2, 8, 0.0F, true));

        this.RArm = new AdvancedModelRendererExtended(this);
        this.RArm.setRotationPoint(-3.0F, 1.0F, -0.5F);
        this.Euchambersia.addChild(RArm);
        this.setRotateAngle(RArm, 0.6981F, 0.0F, 0.0F);
        this.RArm.cubeList.add(new ModelBox(RArm, 49, 48, -1.0F, -1.0F, -1.5F, 2, 6, 3, 0.0F, true));

        this.RArm2 = new AdvancedModelRendererExtended(this);
        this.RArm2.setRotationPoint(-0.25F, 3.5F, 0.0F);
        this.RArm.addChild(RArm2);
        this.setRotateAngle(RArm2, -0.7854F, 0.0F, 0.0F);
        this.RArm2.cubeList.add(new ModelBox(RArm2, 0, 0, -0.75F, 0.5F, -1.5F, 2, 6, 3, -0.01F, true));

        this.RHand = new AdvancedModelRendererExtended(this);
        this.RHand.setRotationPoint(0.0F, 6.5F, 0.0F);
        this.RArm2.addChild(RHand);
        this.RHand.cubeList.add(new ModelBox(RHand, 0, 46, -1.25F, -1.0F, -3.5F, 3, 2, 5, 0.0F, true));

        updateDefaultPose();
        animator = ModelAnimator.create();
    }

    @Override
    public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        animate((IAnimatedEntity) entity, f, f1, f2, f3, f4, f5);
        this.Euchambersia.render(f5);
    }


    public void renderStaticFloor(float f) {
        this.Euchambersia.rotateAngleY = (float) Math.toRadians(90);
        this.Jaw.rotateAngleX = (float) Math.toRadians(32.5);
        this.Head.rotateAngleX = (float) Math.toRadians(-23.9);
        this.Head.rotateAngleY = (float) Math.toRadians(-32.6);
        this.Head.rotateAngleZ = (float) Math.toRadians(13.4);
        this.Neck.rotateAngleX = (float) Math.toRadians(1.7);
        this.Neck.rotateAngleY = (float) Math.toRadians(-16.6);
        this.Neck.rotateAngleZ = (float) Math.toRadians(-5.4);
        this.Euchambersia.rotateAngleX = (float) Math.toRadians(15);
        this.Body.rotateAngleX = (float) Math.toRadians(-17.7);
        this.Body.rotateAngleY = (float) Math.toRadians(12.1);
        this.Body.rotateAngleZ = (float) Math.toRadians(2.7);
        this.Body2.rotateAngleX = (float) Math.toRadians(-17.5);
        this.Body2.rotateAngleZ = (float) Math.toRadians(0);
        this.Tail.rotateAngleX = (float) Math.toRadians(-13);
        this.Tail.rotateAngleY = (float) Math.toRadians(11);
        this.Tail.rotateAngleZ = (float) Math.toRadians(5.8);
        this.Tail2.rotateAngleX = (float) Math.toRadians(-10);
        this.Tail2.rotateAngleY = (float) Math.toRadians(7.3);
        this.Tail2.rotateAngleZ = (float) Math.toRadians(1.3);
        this.RArm.rotateAngleX = (float) Math.toRadians(62.5);
        this.RArm2.rotateAngleX = (float) Math.toRadians(-60);
        this.RHand.rotateAngleX = (float) Math.toRadians(40);
        this.LArm.rotateAngleX = (float) Math.toRadians(32.5);
        this.LArm2.rotateAngleX = (float) Math.toRadians(-54.4);
        this.LHand.rotateAngleX = (float) Math.toRadians(7.5);
        this.LLeg.rotateAngleX = (float) Math.toRadians(20);
        this.LLeg2.rotateAngleX = (float) Math.toRadians(47.5);
        this.LFoot.rotateAngleX = (float) Math.toRadians(-10);
        this.RLeg.rotateAngleX = (float) Math.toRadians(-10);
        this.RLeg2.rotateAngleX = (float) Math.toRadians(25);
        this.RFoot.rotateAngleX = (float) Math.toRadians(5);
        this.Euchambersia.offsetY = 0.01F;
        this.Euchambersia.offsetZ = 0.1F;
        this.Euchambersia.offsetX = -0.1F;
        this.Euchambersia.render(0.01F);
        resetToDefaultPose();
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
        //this.Euchambersia.offsetY = 1.00F;

        EntityPrehistoricFloraEuchambersia EuchambersiaEntity = (EntityPrehistoricFloraEuchambersia) e;
        float masterSpeed = EuchambersiaEntity.getTravelSpeed();

        this.faceTarget(f3, f4, 2, Neck);
        this.faceTarget(f3, f4, 4, Head);

        AdvancedModelRendererExtended[] Tail = {this.Tail, this.Tail2};

        if (EuchambersiaEntity.getAnimation() == EuchambersiaEntity.LAY_ANIMATION) {
            this.swing(Neck, 0.5F, 0.10F, false, 0.5F,-0.05F, f2, 0.8F);
            this.walk(Neck, 0.5F * 2, -0.02F, false, 0.5F,0.01F, f2, 0.8F);
            return;
        }

        if (EuchambersiaEntity.getScreaming()) {
            this.Neck.rotateAngleX = (float) Math.toRadians(-55);
            this.walk(Jaw, 1.5F, 0.15F, false, 0, 1.5F, f2, 1F);
        }

        if (f3 == 0.0F || !EuchambersiaEntity.getIsMoving()) { //Not moving
            this.swing(Neck, 0.06F, 0.10F, false, 0.5F,-0.05F, f2, 0.8F);
            this.walk(Neck, 0.06F * 2F, -0.02F, false, 0.5F,0.01F, f2, 0.8F);
            this.chainWave(Tail, (0.06F*0.9F), 0.10F, 0.10F, f2, 1F);
            this.chainSwing(Tail, (0.06F*0.9F) * 2F, 0.05F, 0.06F, f2, 1F);
            return;
        }

        float speed = masterSpeed / 0.965F;
        if (EuchambersiaEntity.getIsFast()) {
            speed = speed * 1.5F;
        }

        this.LArm.offsetY = this.moveBoxExtended(speed, (float) Math.toRadians(0.4), false, 1, f2, 1.5F);;
        this.RArm.offsetY = this.moveBoxExtended(speed, (float) Math.toRadians(0.4), false, 4, f2, 1.5F);;
        this.LLeg.offsetY = this.moveBoxExtended(speed, (float) Math.toRadians(0.3), false, 4, f2, 1.5F);;
        this.RLeg.offsetY = this.moveBoxExtended(speed, (float) Math.toRadians(0.3), false, 1, f2, 1.5F);;

        this.flap(LArm, speed, -0.1F, true, 4, 0.05F, f2, 1F);
        this.flap(RArm, speed, 0.1F, true, 7, -0.05F, f2, 1F);
        this.flap(LLeg, speed, 0.05F, false, 7, -0.05F, f2, 1F);
        this.flap(RLeg, speed, -0.05F, false, 4, 0.05F, f2, 1F);

        this.walk(LLeg, speed, 0.1F, false, 7, 0.05F, f2, 1F);
        this.walk(RLeg, speed, 0.1F, false, 4, 0.05F, f2, 1F);

        this.swing(LArm, speed, -0.40F, true, 5, 0.18F, f2, 1F);
        this.swing(RArm, speed, 0.40F, true, 8, -0.18F, f2, 1F);
        this.swing(LLeg, speed, -0.30F, true, 8, 0F, f2, 1F);
        this.swing(RLeg, speed, 0.30F, true, 5, 0F, f2, 1F);

        this.swing(LArm2, speed, -0.25F, true, 6, 0F, f2, 1F);
        this.swing(RArm2, speed, 0.25F, true, 9, 0F, f2, 1F);
        this.swing(LLeg2, speed, -0.20F, true, 9, 0F, f2, 1F);
        this.swing(RLeg2, speed, 0.20F, true, 6, 0F, f2, 1F);

        this.flap(LArm2, speed, 0.10F, true, 0, 0.05F, f2, 1F);
        this.flap(RArm2, speed, -0.10F, true, 3, -0.05F, f2, 1F);
        this.flap(LLeg2, speed, -0.10F, false, 3, -0.05F, f2, 1F);
        this.flap(RLeg2, speed, 0.10F, false, 0, 0.05F, f2, 1F);

        this.swing(LHand, speed, -0.30F, true, 2, 0.10F, f2, 1F);
        this.swing(RHand, speed, 0.30F, true, 5, -0.10F, f2, 1F);
        this.swing(LFoot, speed, -0.25F, true, 5, 0.08F, f2, 1F);
        this.swing(RFoot, speed, 0.25F, true, 2, -0.08F, f2, 1F);

        this.bobExtended(Euchambersia, speed * 2F, 0.245F, false, 2.5F,  f2, 1F);

        this.flap(Body2, speed, 0.08F, false, 5.0F,0.04F, f2, 1.0F);
        this.flap(Body, speed, -0.08F, false, 5.0F,-0.04F, f2, 1.0F);
        this.flap(Euchambersia, speed, -0.08F, false, 5.0F,-0.04F, f2, 1.0F);

        this.walk(Euchambersia, speed * 2, 0.05F, false, 2.5F,-0.01F, f2, 0.8F);

        this.swing(Neck, speed, 0.10F, false, 0.5F,-0.05F, f2, 0.8F);
        this.walk(Neck, speed * 2, -0.02F, false, 0.5F,0.01F, f2, 0.8F);
        this.chainWave(Tail, (speed*0.6F), 0.20F, 0.2F, f2, 1F);
        this.chainSwing(Tail, (speed*0.6F) * 2F, 0.10F, 0.12F, f2, 1F);

        this.Euchambersia.offsetZ = this.moveBoxExtended(speed * 2, (float) Math.toRadians(1.2), false, 1.5F, f2, 1);

    }

    public void animate(IAnimatedEntity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        EntityPrehistoricFloraEuchambersia e = (EntityPrehistoricFloraEuchambersia) entity;
        animator.update(entity);
        this.resetToDefaultPose();
        setRotationAngles(f, f1, f2, f3, f4, f5, (Entity) entity);

        animator.setAnimation(e.ATTACK_ANIMATION); //20 ticks
        animator.startKeyframe(5);
        animator.rotate(this.Neck, (float) Math.toRadians(-27), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(this.Head, (float) Math.toRadians(-10), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(this.Jaw, (float) Math.toRadians(20), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.setStaticKeyframe(1);
        animator.resetKeyframe(9);

        animator.setAnimation(e.EAT_ANIMATION); //10 ticks
        animator.startKeyframe(4);
        animator.rotate(this.Neck, (float) Math.toRadians(45), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(this.Head, (float) Math.toRadians(-5), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(this.Jaw, (float) Math.toRadians(20), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.endKeyframe();
        animator.setStaticKeyframe(3);
        animator.resetKeyframe(3);

        animator.setAnimation(e.ROAR_ANIMATION);
        animator.startKeyframe(10);
        animator.rotate(this.Neck, (float) Math.toRadians(-27), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(this.Head, (float) Math.toRadians(-5), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(this.Jaw, (float) Math.toRadians(20), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.endKeyframe();
        animator.setStaticKeyframe(10);
        animator.resetKeyframe(10);

        animator.setAnimation(e.LAY_ANIMATION); //50 ticks
        animator.startKeyframe(10);
        animator.endKeyframe();
        animator.setStaticKeyframe(30);
        animator.resetKeyframe(10);
    }
}
