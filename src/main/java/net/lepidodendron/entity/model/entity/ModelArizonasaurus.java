package net.lepidodendron.entity.model.entity;

import net.ilexiconn.llibrary.client.model.ModelAnimator;
import net.ilexiconn.llibrary.client.model.tools.AdvancedModelRenderer;
import net.ilexiconn.llibrary.server.animation.IAnimatedEntity;
import net.lepidodendron.entity.EntityPrehistoricFloraArizonasaurus;
import net.lepidodendron.entity.model.llibraryextensions.AdvancedModelBaseExtended;
import net.lepidodendron.entity.model.llibraryextensions.AdvancedModelRendererExtended;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.entity.Entity;

public class ModelArizonasaurus extends AdvancedModelBaseExtended {
    private final AdvancedModelRendererExtended Base;
    private final AdvancedModelRendererExtended Body;
    private final AdvancedModelRendererExtended Body2;
    private final AdvancedModelRendererExtended RightArm;
    private final AdvancedModelRendererExtended RightArm2;
    private final AdvancedModelRendererExtended RightArmHand;
    private final AdvancedModelRendererExtended LeftArm;
    private final AdvancedModelRendererExtended LeftArm2;
    private final AdvancedModelRendererExtended LeftArmHand;
    private final AdvancedModelRendererExtended Neck;
    private final AdvancedModelRendererExtended cube_r1;
    private final AdvancedModelRendererExtended Neck2;
    private final AdvancedModelRendererExtended Head;
    private final AdvancedModelRendererExtended cube_r2;
    private final AdvancedModelRendererExtended cube_r3;
    private final AdvancedModelRendererExtended cube_r4;
    private final AdvancedModelRendererExtended Jaw;
    private final AdvancedModelRendererExtended cube_r5;
    private final AdvancedModelRendererExtended cube_r6;
    private final AdvancedModelRendererExtended RLeg;
    private final AdvancedModelRendererExtended RLeg2;
    private final AdvancedModelRendererExtended RFoot;
    private final AdvancedModelRendererExtended RFoot2;
    private final AdvancedModelRendererExtended Lleg;
    private final AdvancedModelRendererExtended Lleg2;
    private final AdvancedModelRendererExtended Lfoot;
    private final AdvancedModelRendererExtended Lfoot2;
    private final AdvancedModelRendererExtended Tail;
    private final AdvancedModelRendererExtended cube_r7;
    private final AdvancedModelRendererExtended Tail2;
    private final AdvancedModelRendererExtended Tail3;
    private final AdvancedModelRendererExtended Tail4;

    private ModelAnimator animator;

    public ModelArizonasaurus() {
        this.textureWidth = 128;
        this.textureHeight = 128;

        this.Base = new AdvancedModelRendererExtended(this);
        this.Base.setRotationPoint(0.0F, 10.75F, 5.0F);
        this.setRotateAngle(Base, -0.0436F, 0.0F, 0.0F);
        this.Base.cubeList.add(new ModelBox(Base, 40, 0, -2.5F, -3.5F, -3.0F, 5, 9, 7, 0.0F, false));
        this.Base.cubeList.add(new ModelBox(Base, 49, 45, 0.0F, -16.5F, -3.0F, 0, 13, 8, 0.0F, false));

        this.Body = new AdvancedModelRendererExtended(this);
        this.Body.setRotationPoint(0.0F, -0.5F, -2.0F);
        this.Base.addChild(Body);
        this.Body.cubeList.add(new ModelBox(Body, 0, 0, -3.0F, -3.0F, -10.0F, 6, 8, 10, 0.01F, false));
        this.Body.cubeList.add(new ModelBox(Body, 21, 27, -0.01F, -16.0F, -10.0F, 0, 13, 10, 0.0F, false));

        this.Body2 = new AdvancedModelRendererExtended(this);
        this.Body2.setRotationPoint(0.0F, -0.5F, -9.0F);
        this.Body.addChild(Body2);
        this.setRotateAngle(Body2, -0.0436F, 0.0F, 0.0F);
        this.Body2.cubeList.add(new ModelBox(Body2, 0, 54, 0.0F, -15.5F, -5.0F, 0, 13, 5, 0.0F, false));
        this.Body2.cubeList.add(new ModelBox(Body2, 45, 31, -2.5F, -2.5F, -5.0F, 5, 7, 5, 0.0F, false));

        this.RightArm = new AdvancedModelRendererExtended(this);
        this.RightArm.setRotationPoint(2.5F, 3.0F, -3.5F);
        this.Body2.addChild(RightArm);
        this.setRotateAngle(RightArm, 1.2266F, 0.0594F, 0.1642F);
        this.RightArm.cubeList.add(new ModelBox(RightArm, 0, 19, 0.0F, -0.5F, -1.0F, 2, 6, 2, 0.0F, false));

        this.RightArm2 = new AdvancedModelRendererExtended(this);
        this.RightArm2.setRotationPoint(1.0F, 4.5F, 0.0F);
        this.RightArm.addChild(RightArm2);
        this.setRotateAngle(RightArm2, -1.1345F, 0.0F, 0.0F);
        this.RightArm2.cubeList.add(new ModelBox(RightArm2, 0, 0, -1.0F, 0.0F, -1.0F, 2, 6, 2, -0.01F, false));

        this.RightArmHand = new AdvancedModelRendererExtended(this);
        this.RightArmHand.setRotationPoint(1.0F, 5.99F, 0.0F);
        this.RightArm2.addChild(RightArmHand);
        this.setRotateAngle(RightArmHand, 0.0F, 0.0F, 0.4363F);
        this.RightArmHand.cubeList.add(new ModelBox(RightArmHand, 45, 44, -1.0F, -0.01F, -1.0F, 1, 3, 2, -0.02F, false));

        this.LeftArm = new AdvancedModelRendererExtended(this);
        this.LeftArm.setRotationPoint(-2.5F, 3.0F, -3.5F);
        this.Body2.addChild(LeftArm);
        this.setRotateAngle(LeftArm, 1.2266F, -0.0594F, -0.1642F);
        this.LeftArm.cubeList.add(new ModelBox(LeftArm, 0, 19, -2.0F, -0.5F, -1.0F, 2, 6, 2, 0.0F, true));

        this.LeftArm2 = new AdvancedModelRendererExtended(this);
        this.LeftArm2.setRotationPoint(-1.0F, 4.5F, 0.0F);
        this.LeftArm.addChild(LeftArm2);
        this.setRotateAngle(LeftArm2, -1.1345F, 0.0F, 0.0F);
        this.LeftArm2.cubeList.add(new ModelBox(LeftArm2, 0, 0, -1.0F, 0.0F, -1.0F, 2, 6, 2, -0.01F, true));

        this.LeftArmHand = new AdvancedModelRendererExtended(this);
        this.LeftArmHand.setRotationPoint(-1.0F, 5.99F, 0.0F);
        this.LeftArm2.addChild(LeftArmHand);
        this.setRotateAngle(LeftArmHand, 0.0F, 0.0F, -0.4363F);
        this.LeftArmHand.cubeList.add(new ModelBox(LeftArmHand, 45, 44, 0.0F, -0.01F, -1.0F, 1, 3, 2, -0.02F, true));

        this.Neck = new AdvancedModelRendererExtended(this);
        this.Neck.setRotationPoint(0.0F, 0.5F, -4.0F);
        this.Body2.addChild(Neck);
        this.setRotateAngle(Neck, -0.0436F, 0.0F, 0.0F);
        this.Neck.cubeList.add(new ModelBox(Neck, 61, 63, -2.0F, -3.0F, -4.0F, 4, 5, 4, -0.01F, false));

        this.cube_r1 = new AdvancedModelRendererExtended(this);
        this.cube_r1.setRotationPoint(0.0F, -3.0F, 0.0F);
        this.Neck.addChild(cube_r1);
        this.setRotateAngle(cube_r1, 0.6109F, 0.0F, 0.0F);
        this.cube_r1.cubeList.add(new ModelBox(cube_r1, 38, 0, -0.5F, -2.0F, -3.0F, 1, 2, 3, 0.0F, false));

        this.Neck2 = new AdvancedModelRendererExtended(this);
        this.Neck2.setRotationPoint(0.0F, -0.5F, -3.0F);
        this.Neck.addChild(Neck2);
        this.setRotateAngle(Neck2, -0.0436F, 0.0F, 0.0F);
        this.Neck2.cubeList.add(new ModelBox(Neck2, 36, 62, -1.5F, -2.5F, -5.0F, 3, 5, 5, -0.02F, false));

        this.Head = new AdvancedModelRendererExtended(this);
        this.Head.setRotationPoint(0.0F, 0.0F, -5.0F);
        this.Neck2.addChild(Head);
        this.setRotateAngle(Head, 0.2182F, 0.0F, 0.0F);
        this.Head.cubeList.add(new ModelBox(Head, 58, 0, -2.0F, -2.5F, -2.0F, 4, 3, 3, 0.0F, false));
        this.Head.cubeList.add(new ModelBox(Head, 62, 25, -1.0F, -2.0F, -9.0F, 2, 2, 6, 0.0F, false));
        this.Head.cubeList.add(new ModelBox(Head, 23, 0, -1.5F, -1.5F, -6.0F, 3, 2, 4, 0.0F, false));
        this.Head.cubeList.add(new ModelBox(Head, 69, 3, -1.0F, 0.0F, -5.0F, 2, 1, 4, -0.03F, false));

        this.cube_r2 = new AdvancedModelRendererExtended(this);
        this.cube_r2.setRotationPoint(0.0F, -2.5F, -2.0F);
        this.Head.addChild(cube_r2);
        this.setRotateAngle(cube_r2, 0.0698F, 0.0F, 0.0F);
        this.cube_r2.cubeList.add(new ModelBox(cube_r2, 0, 37, -1.0F, 0.0F, -6.96F, 2, 1, 3, -0.01F, false));
        this.cube_r2.cubeList.add(new ModelBox(cube_r2, 66, 34, -1.5F, 0.0F, -3.98F, 3, 1, 4, -0.01F, false));

        this.cube_r3 = new AdvancedModelRendererExtended(this);
        this.cube_r3.setRotationPoint(0.0F, -0.5F, -8.5F);
        this.Head.addChild(cube_r3);
        this.setRotateAngle(cube_r3, -0.1309F, 0.0F, 0.0F);
        this.cube_r3.cubeList.add(new ModelBox(cube_r3, 42, 31, 0.7F, 0.0F, 0.0F, 0, 1, 3, 0.0F, true));
        this.cube_r3.cubeList.add(new ModelBox(cube_r3, 42, 31, -0.7F, 0.0F, 0.0F, 0, 1, 3, 0.0F, false));

        this.cube_r4 = new AdvancedModelRendererExtended(this);
        this.cube_r4.setRotationPoint(0.0F, 0.5F, -6.0F);
        this.Head.addChild(cube_r4);
        this.setRotateAngle(cube_r4, -0.2059F, 0.0F, 0.0F);
        this.cube_r4.cubeList.add(new ModelBox(cube_r4, 20, 24, -1.0F, -1.0F, -3.0F, 2, 1, 3, -0.01F, false));

        this.Jaw = new AdvancedModelRendererExtended(this);
        this.Jaw.setRotationPoint(0.0F, 0.5F, 1.0F);
        this.Head.addChild(Jaw);
        this.Jaw.cubeList.add(new ModelBox(Jaw, 6, 54, -2.0F, 0.0F, -3.0F, 4, 1, 3, 0.0F, false));
        this.Jaw.cubeList.add(new ModelBox(Jaw, 0, 42, -1.5F, -1.99F, -2.0F, 3, 2, 2, -0.01F, false));

        this.cube_r5 = new AdvancedModelRendererExtended(this);
        this.cube_r5.setRotationPoint(0.0F, 1.0F, -3.0F);
        this.Jaw.addChild(cube_r5);
        this.setRotateAngle(cube_r5, -0.1047F, 0.0F, 0.0F);
        this.cube_r5.cubeList.add(new ModelBox(cube_r5, 65, 53, 0.69F, -1.5F, -6.5F, 0, 1, 6, 0.0F, true));
        this.cube_r5.cubeList.add(new ModelBox(cube_r5, 65, 53, -0.69F, -1.5F, -6.5F, 0, 1, 6, 0.0F, false));
        this.cube_r5.cubeList.add(new ModelBox(cube_r5, 58, 44, -1.0F, -1.0F, -7.0F, 2, 1, 7, -0.02F, false));

        this.cube_r6 = new AdvancedModelRendererExtended(this);
        this.cube_r6.setRotationPoint(0.0F, 2.0F, 0.0F);
        this.Jaw.addChild(cube_r6);
        this.setRotateAngle(cube_r6, -0.3316F, 0.0F, 0.0F);
        this.cube_r6.cubeList.add(new ModelBox(cube_r6, 21, 70, -1.5F, -1.0F, -3.0F, 3, 1, 3, -0.04F, false));

        this.RLeg = new AdvancedModelRendererExtended(this);
        this.RLeg.setRotationPoint(2.5F, -1.0F, 1.0F);
        this.Base.addChild(RLeg);
        this.setRotateAngle(RLeg, -0.3054F, 0.0F, 0.0F);
        this.RLeg.cubeList.add(new ModelBox(RLeg, 60, 12, -0.5F, -1.0F, -2.5F, 3, 7, 5, 0.0F, false));

        this.RLeg2 = new AdvancedModelRendererExtended(this);
        this.RLeg2.setRotationPoint(1.0F, 4.0F, 0.0F);
        this.RLeg.addChild(RLeg2);
        this.setRotateAngle(RLeg2, 0.48F, 0.0F, 0.0F);
        this.RLeg2.cubeList.add(new ModelBox(RLeg2, 11, 59, -1.0F, 0.0F, -2.5F, 2, 9, 4, -0.01F, false));

        this.RFoot = new AdvancedModelRendererExtended(this);
        this.RFoot.setRotationPoint(0.0F, 9.0F, -0.5F);
        this.RLeg2.addChild(RFoot);
        this.setRotateAngle(RFoot, -0.1309F, 0.0F, 0.0F);
        this.RFoot.cubeList.add(new ModelBox(RFoot, 20, 53, -1.5F, -1.0F, -5.0F, 3, 2, 7, 0.0F, false));

        this.RFoot2 = new AdvancedModelRendererExtended(this);
        this.RFoot2.setRotationPoint(0.0F, 0.0F, -4.0F);
        this.RFoot.addChild(RFoot2);
        this.RFoot2.cubeList.add(new ModelBox(RFoot2, 34, 53, -1.5F, -1.0F, -4.0F, 3, 2, 4, -0.01F, false));

        this.Lleg = new AdvancedModelRendererExtended(this);
        this.Lleg.setRotationPoint(-2.5F, -1.0F, 1.0F);
        this.Base.addChild(Lleg);
        this.setRotateAngle(Lleg, -0.3054F, 0.0F, 0.0F);
        this.Lleg.cubeList.add(new ModelBox(Lleg, 60, 12, -2.5F, -1.0F, -2.5F, 3, 7, 5, 0.0F, true));

        this.Lleg2 = new AdvancedModelRendererExtended(this);
        this.Lleg2.setRotationPoint(-1.0F, 4.0F, 0.0F);
        this.Lleg.addChild(Lleg2);
        this.setRotateAngle(Lleg2, 0.48F, 0.0F, 0.0F);
        this.Lleg2.cubeList.add(new ModelBox(Lleg2, 11, 59, -1.0F, 0.0F, -2.5F, 2, 9, 4, -0.01F, true));

        this.Lfoot = new AdvancedModelRendererExtended(this);
        this.Lfoot.setRotationPoint(0.0F, 9.0F, -0.5F);
        this.Lleg2.addChild(Lfoot);
        this.setRotateAngle(Lfoot, -0.1309F, 0.0F, 0.0F);
        this.Lfoot.cubeList.add(new ModelBox(Lfoot, 20, 53, -1.5F, -1.0F, -5.0F, 3, 2, 7, 0.0F, true));

        this.Lfoot2 = new AdvancedModelRendererExtended(this);
        this.Lfoot2.setRotationPoint(0.0F, 0.0F, -4.0F);
        this.Lfoot.addChild(Lfoot2);
        this.Lfoot2.cubeList.add(new ModelBox(Lfoot2, 34, 53, -1.5F, -1.0F, -4.0F, 3, 2, 4, -0.01F, true));

        this.Tail = new AdvancedModelRendererExtended(this);
        this.Tail.setRotationPoint(0.0F, 0.0F, 3.0F);
        this.Base.addChild(Tail);
        this.Tail.cubeList.add(new ModelBox(Tail, 0, 19, -2.0F, -3.49F, 0.0F, 4, 6, 11, 0.0F, false));

        this.cube_r7 = new AdvancedModelRendererExtended(this);
        this.cube_r7.setRotationPoint(0.0F, -5.0F, 0.0F);
        this.Tail.addChild(cube_r7);
        this.setRotateAngle(cube_r7, -0.1798F, 0.0F, 0.0F);
        this.cube_r7.cubeList.add(new ModelBox(cube_r7, 0, 40, -1.0F, 0.0F, 0.0F, 2, 2, 11, 0.0F, false));

        this.Tail2 = new AdvancedModelRendererExtended(this);
        this.Tail2.setRotationPoint(0.0F, -1.5F, 10.0F);
        this.Tail.addChild(Tail2);
        this.setRotateAngle(Tail2, 0.0436F, 0.0F, 0.0F);
        this.Tail2.cubeList.add(new ModelBox(Tail2, 21, 7, -1.5F, -1.98F, 0.0F, 3, 4, 12, 0.0F, false));

        this.Tail3 = new AdvancedModelRendererExtended(this);
        this.Tail3.setRotationPoint(0.0F, -0.5F, 11.0F);
        this.Tail2.addChild(Tail3);
        this.setRotateAngle(Tail3, -0.0873F, 0.0F, 0.0F);
        this.Tail3.cubeList.add(new ModelBox(Tail3, 41, 17, -1.0F, -1.47F, 0.0F, 2, 3, 11, 0.0F, false));

        this.Tail4 = new AdvancedModelRendererExtended(this);
        this.Tail4.setRotationPoint(0.0F, -0.5F, 10.5F);
        this.Tail3.addChild(Tail4);
        this.setRotateAngle(Tail4, -0.1309F, 0.0F, 0.0F);
        this.Tail4.cubeList.add(new ModelBox(Tail4, 30, 39, -0.5F, -0.96F, 0.0F, 1, 2, 12, 0.0F, false));

        updateDefaultPose();
        animator = ModelAnimator.create();
    }

    @Override
    public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        animate((IAnimatedEntity) entity, f, f1, f2, f3, f4, f5);
        this.Base.render(f5 * 0.615F);
    }
    public void renderStatic(float f) {
        //GlStateManager.pushMatrix();
        //GlStateManager.enableBlend();
        //GlStateManager.blendFunc(GlStateManager.SourceFactor.SRC_ALPHA, GlStateManager.DestFactor.ONE_MINUS_SRC_ALPHA);
        //GlStateManager.disableCull();
        this.Body2.offsetY = 0.04F;
        this.Head.rotateAngleX = (float)Math.toRadians(2.5);
        this.Neck2.rotateAngleX = (float)Math.toRadians(-12.5);
        this.Neck.rotateAngleX = (float)Math.toRadians(-5);
        this.Jaw.rotateAngleX = (float)Math.toRadians(30);
        this.RightArm.rotateAngleX = (float)Math.toRadians(35);
        this.RightArm2.rotateAngleX = (float)Math.toRadians(-105);
        this.LeftArm.rotateAngleX = (float)Math.toRadians(35);
        this.LeftArm2.rotateAngleX = (float)Math.toRadians(-105);
        this.Body2.render(0.01F);
        GlStateManager.enableCull();
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
        this.Base.offsetY = 0.60F;
        //this.basin.offsetZ = 0.2F;

        EntityPrehistoricFloraArizonasaurus Arizonasaurus = (EntityPrehistoricFloraArizonasaurus) e;
        float masterSpeed = Arizonasaurus.getTravelSpeed();

        this.faceTarget(f3, f4, 8, Neck);
        this.faceTarget(f3, f4, 8, Neck2);
        this.faceTarget(f3, f4, 8, Head);

        //float speed = 0.2F;

        AdvancedModelRenderer[] TailFull = {this.Tail, this.Tail2, this.Tail3, this.Tail4};
        AdvancedModelRenderer[] NeckFull = {this.Neck, this.Neck2, this.Head};

        AdvancedModelRenderer[] LeftArm = {this.LeftArm, this.LeftArm2};
        AdvancedModelRenderer[] RightArm = {this.RightArm, this.RightArm2};

        //AdvancedModelRenderer[] Whole = {this.Neck2, this.neck, this.body, this.body2, this.body3, this.tail, this.tail2, this.tail3, this.tail4, this.tail5};

        if (Arizonasaurus.getAnimation() == Arizonasaurus.LAY_ANIMATION) {
            this.chainSwing(NeckFull, 0.5F, 0.10F, 0.5, f2, 0.8F);
            this.chainWave(NeckFull, 0.5F * 2, -0.02F, 0.5F, f2, 0.8F);
            //Other stuff

            return;
        }
        
        if (!Arizonasaurus.isReallyInWater()) {

            if (f3 == 0.0F || !Arizonasaurus.getIsMoving()) {
                this.chainSwing(NeckFull, 0.05F, 0.10F, 0.5, f2, 0.8F);
                this.chainWave(NeckFull, 0.05F * 2, -0.02F, 0.5F, f2, 0.8F);

                this.chainWave(TailFull, (0.15F * 0.5F), 0.125F * 0.35F, 0.2F, f2, 1F);
                this.chainSwing(TailFull, (0.15F * 0.5F) * 4F, 0.05F * 0.65F, 0.12F, f2, 1F);

                return;
           }

            if (Arizonasaurus.getIsFast()) { //Running
                float speed = masterSpeed / 1.8F;
                //this.basin.offsetY = 0.75F;
                this.Lleg.offsetY = this.moveBoxExtended(speed, (float) Math.toRadians(0.825), false, 3, f2, 1.5F);
                this.RLeg.offsetY = this.moveBoxExtended(speed, (float) Math.toRadians(0.825), false, 0, f2, 1.5F);

                this.chainWaveExtended(LeftArm, speed, -(float)Math.toRadians(20), 0.5, 8, f2, 1F);
                this.chainWaveExtended(RightArm, speed, -(float)Math.toRadians(20), 0.5, 5, f2, 1F);


                //---
                this.walk(Lleg, speed, (float)Math.toRadians(40), true, 8.0F, -(float)Math.toRadians(28), f2, 1.0F);
                this.walk(RLeg, speed, (float)Math.toRadians(40), true, 5.0F, -(float)Math.toRadians(28), f2, 1.0F);

                this.walk(Lleg2, speed, 0.36F, true, 6.5F, 0F, f2, 1F);
                this.walk(RLeg2, speed, 0.36F, true, 3.5F, 0F, f2, 1F);

                this.walk(Lfoot, speed, (float)Math.toRadians(25), false, 4.0F, (float)Math.toRadians(15), f2, 1F);
                this.walk(RFoot, speed, (float)Math.toRadians(25), false, 1.0F, (float)Math.toRadians(15), f2, 1F);

                this.walk(Lfoot2, speed, 0.6F, true, 4.5F, 0.535F, f2, 1F);
                this.walk(RFoot2, speed, 0.6F, true, 1.5F, 0.535F, f2, 1F);

                this.bobExtended(Base, speed * 2F, 1.23F, false, 3.5F, f2, 1F);

                this.bobExtended(Lleg, speed, 0.8F, false, 3.0F, f2, 1F);
                this.bobExtended(RLeg, speed, 0.8F, false, 0.0F, f2, 1F);

                this.flap(Base, speed, 0.08F, false, 6.0F, 0.03F, f2, 1.0F);
                this.flap(Body, speed, -0.08F, false, 6.0F, -0.03F, f2, 1.0F);
                this.flap(Body2, speed, -0.06F, false, 6.0F, -0.02F, f2, 1.0F);
                this.flap(Neck, speed, 0.06F, false, 6.0F, 0.02F, f2, 1.0F);

                this.flap(Lleg, speed, -0.08F, false, 6.0F, -0.04F, f2, 1.0F);
                this.flap(RLeg, speed, -0.08F, false, 6.0F, -0.04F, f2, 1.0F);

                this.walk(Body, speed * 2, 0.009F, false, 2.5F, -0.01F, f2, 0.8F);
                this.walk(Body2, speed * 2, 0.025F, false, 2.5F, -0.01F, f2, 0.8F);

                this.Base.offsetZ = this.moveBoxExtended(speed * 2, (float) Math.toRadians(2.0), false, 1.75F, f2, 1) + 0.2F;

                //---


                this.walk(Neck, speed * 4, -0.1F, false, 2.5F, 0F, f2, 0.5F);
                this.walk(Neck2, speed * 4, -0.04F, false, 2.5F, 0F, f2, 0.5F);
                this.walk(Head, speed * 4, 0.1F, false, 2.5F, 0F, f2, 0.5F);

                this.chainWave(TailFull, (speed * 1.2F), 0.125F, 0.5F, f2, 1F);
                this.chainSwing(TailFull, (speed * 0.6F) * 4F, 0.05F, 0.12F, f2, 1F);

            }
            else { //Walking
                float speed = masterSpeed / 2.50F;
                //this.basin.offsetY = 0.815F;
                this.Lleg.offsetY = this.moveBoxExtended(speed, (float) Math.toRadians(0.325), false, 3, f2, 1.5F);
                this.RLeg.offsetY = this.moveBoxExtended(speed, (float) Math.toRadians(0.325), false, 0, f2, 1.5F);

                this.chainWaveExtended(LeftArm, speed, -(float)Math.toRadians(10), 0.5, 8, f2, 1F);
                this.chainWaveExtended(RightArm, speed, -(float)Math.toRadians(10), 0.5, 5, f2, 1F);

                this.walk(Lleg, speed, (float)Math.toRadians(35), true, 8.0F, -(float)Math.toRadians(20), f2, 1.0F);
                this.walk(RLeg, speed, (float)Math.toRadians(35), true, 5.0F, -(float)Math.toRadians(20), f2, 1.0F);

                this.walk(Lleg2, speed, 0.36F, true, 6.5F, 0F, f2, 1F);
                this.walk(RLeg2, speed, 0.36F, true, 3.5F, 0F, f2, 1F);

                this.walk(Lfoot, speed, (float)Math.toRadians(25), false, 4.0F, (float)Math.toRadians(15), f2, 1F);
                this.walk(RFoot, speed, (float)Math.toRadians(25), false, 1.0F, (float)Math.toRadians(15), f2, 1F);

                this.walk(Lfoot2, speed, 0.6F, true, 4.5F, 0.535F, f2, 0.8F);
                this.walk(RFoot2, speed, 0.6F, true, 1.5F, 0.535F, f2, 0.8F);

                this.bobExtended(Base, speed * 2F, 0.83F, false, 3.5F, f2, 1F);

                this.bobExtended(Lleg, speed, 0.8F, false, 3.0F, f2, 1F);
                this.bobExtended(RLeg, speed, 0.8F, false, 0.0F, f2, 1F);

                this.flap(Base, speed, 0.08F, false, 6.0F, 0.03F, f2, 1.0F);
                this.flap(Body, speed, -0.08F, false, 6.0F, -0.03F, f2, 1.0F);
                this.flap(Body2, speed, -0.06F, false, 6.0F, -0.02F, f2, 1.0F);
                this.flap(Neck, speed, 0.06F, false, 6.0F, 0.02F, f2, 1.0F);

                this.flap(Lleg, speed, -0.08F, false, 6.0F, -0.04F, f2, 1.0F);
                this.flap(RLeg, speed, -0.08F, false, 6.0F, -0.04F, f2, 1.0F);

                this.walk(Body, speed * 2, 0.009F, false, 2.5F, -0.01F, f2, 0.8F);
                this.walk(Body2, speed * 2, 0.025F, false, 2.5F, -0.01F, f2, 0.8F);

                this.walk(Neck, speed * 0.5F, -0.10F * 2.25F, false, 2.5F, 0F, f2, 0.9F);
                this.walk(Neck2, speed * 0.5F, -0.10F * 2.25F, false, 2.5F, 0F, f2, 0.9F);
                this.walk(Head, speed * 0.5F, 0.10F * 2.25F, false, 2.5F, 0F, f2, 0.9F);

                this.chainWave(TailFull, (speed * 0.5F), 0.125F * 0.55F, 0.2F, f2, 1F);
                this.chainSwing(TailFull, (speed * 0.5F) * 4F, 0.05F * 0.65F, 0.12F, f2, 1F);

                this.Base.offsetZ = this.moveBoxExtended(speed * 2, (float) Math.toRadians(2.0), false, 1.75F, f2, 1) + 0.2F;

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
        EntityPrehistoricFloraArizonasaurus e = (EntityPrehistoricFloraArizonasaurus) entity;
        animator.update(entity);
        this.resetToDefaultPose();
        setRotationAngles(f, f1, f2, f3, f4, f5, (Entity) entity);

        animator.setAnimation(e.DRINK_ANIMATION);
        animator.startKeyframe(10);
        animator.move(this.Base, 0,(float) Math.toRadians(2),0);
        animator.rotate(Tail, (float) Math.toRadians(-22.5), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(Base, (float) Math.toRadians(15), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(Lleg, (float) Math.toRadians(-15), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(RLeg, (float) Math.toRadians(-15), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(Body, (float) Math.toRadians(5), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(Body2, (float) Math.toRadians(20), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(Neck, (float) Math.toRadians(30), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(Neck2, (float) Math.toRadians(25), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.endKeyframe();
        animator.setStaticKeyframe(2);
        animator.startKeyframe(3);
        animator.move(this.Base, 0,(float) Math.toRadians(2),0);
        animator.rotate(Tail, (float) Math.toRadians(-22.5), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(Base, (float) Math.toRadians(15), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(Lleg, (float) Math.toRadians(-15), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(RLeg, (float) Math.toRadians(-15), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(Body, (float) Math.toRadians(5), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(Body2, (float) Math.toRadians(20), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(Neck, (float) Math.toRadians(30), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(Neck2, (float) Math.toRadians(25), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.endKeyframe();
        animator.setStaticKeyframe(2);
        animator.startKeyframe(3);
        animator.move(this.Base, 0,(float) Math.toRadians(2),0);
        animator.rotate(Tail, (float) Math.toRadians(-22.5), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(Base, (float) Math.toRadians(15), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(Lleg, (float) Math.toRadians(-15), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(RLeg, (float) Math.toRadians(-15), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(Body, (float) Math.toRadians(5), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(Body2, (float) Math.toRadians(20), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(Neck, (float) Math.toRadians(30), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(Neck2, (float) Math.toRadians(25), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.endKeyframe();
        animator.setStaticKeyframe(2);
        animator.startKeyframe(3);
        animator.move(this.Base, 0,(float) Math.toRadians(2),0);
        animator.rotate(Tail, (float) Math.toRadians(-22.5), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(Base, (float) Math.toRadians(15), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(Lleg, (float) Math.toRadians(-15), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(RLeg, (float) Math.toRadians(-15), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(Body, (float) Math.toRadians(5), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(Body2, (float) Math.toRadians(20), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(Neck, (float) Math.toRadians(30), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(Neck2, (float) Math.toRadians(25), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.endKeyframe();
        animator.setStaticKeyframe(2);
        animator.startKeyframe(3);
        animator.move(this.Base, 0,(float) Math.toRadians(2),0);
        animator.rotate(Tail, (float) Math.toRadians(-22.5), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(Base, (float) Math.toRadians(15), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(Lleg, (float) Math.toRadians(-15), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(RLeg, (float) Math.toRadians(-15), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(Body, (float) Math.toRadians(5), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(Body2, (float) Math.toRadians(20), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(Neck, (float) Math.toRadians(30), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(Neck2, (float) Math.toRadians(25), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.endKeyframe();
        animator.setStaticKeyframe(2);
        animator.resetKeyframe(10);

        animator.setAnimation(e.ATTACK_ANIMATION);
        animator.startKeyframe(5);
        animator.rotate(Head, (float) Math.toRadians(-28), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(Jaw, (float) Math.toRadians(50), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(Neck2, (float) Math.toRadians(28.7), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.endKeyframe();
        animator.setStaticKeyframe(2);
        animator.resetKeyframe(6);

        animator.setAnimation(e.EAT_ANIMATION);
        animator.startKeyframe(5);
        animator.rotate(Head, (float) Math.toRadians(-28), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(Jaw, (float) Math.toRadians(50), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(Neck2, (float) Math.toRadians(50), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.endKeyframe();
        animator.setStaticKeyframe(2);
        animator.resetKeyframe(6);

        animator.setAnimation(e.NOISE_ANIMATION);
        animator.startKeyframe(8);
        animator.rotate(Neck, (float) Math.toRadians(-5), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(Neck2, (float) Math.toRadians(35), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(Head, (float) Math.toRadians(-50), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(Jaw, (float) Math.toRadians(30), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.endKeyframe();
        animator.setStaticKeyframe(8);
        animator.resetKeyframe(9);

        animator.setAnimation(e.ROAR_ANIMATION);
        animator.startKeyframe(10);
        animator.rotate(Neck, (float) Math.toRadians(-15), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(Neck2, (float) Math.toRadians(-20), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(Head, (float) Math.toRadians(-50), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(Jaw, (float) Math.toRadians(60), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.endKeyframe();
        animator.setStaticKeyframe(10);
        animator.resetKeyframe(10);
    }
}
