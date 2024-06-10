package net.lepidodendron.entity.model.entity;

import net.ilexiconn.llibrary.client.model.ModelAnimator;
import net.ilexiconn.llibrary.server.animation.IAnimatedEntity;
import net.lepidodendron.entity.EntityPrehistoricFloraPurlovia;
import net.lepidodendron.entity.model.ModelBasePalaeopedia;
import net.lepidodendron.entity.model.llibraryextensions.AdvancedModelRendererExtended;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

public class ModelPurlovia extends ModelBasePalaeopedia {
    private final AdvancedModelRendererExtended PurloviaBase;
    private final AdvancedModelRendererExtended LeftLeg;
    private final AdvancedModelRendererExtended LeftLeg2;
    private final AdvancedModelRendererExtended LeftLegFoot;
    private final AdvancedModelRendererExtended RightLeg;
    private final AdvancedModelRendererExtended RightLeg2;
    private final AdvancedModelRendererExtended RightLegFoot;
    private final AdvancedModelRendererExtended Body;
    private final AdvancedModelRendererExtended Body2;
    private final AdvancedModelRendererExtended LeftForelimb;
    private final AdvancedModelRendererExtended LeftForelimb2;
    private final AdvancedModelRendererExtended LeftForelimbHand;
    private final AdvancedModelRendererExtended RightForelimb;
    private final AdvancedModelRendererExtended RightForelimb2;
    private final AdvancedModelRendererExtended RightForelimbHand;
    private final AdvancedModelRendererExtended Neck;
    private final AdvancedModelRendererExtended Head;
    private final AdvancedModelRendererExtended cube_r1;
    private final AdvancedModelRendererExtended cube_r2;
    private final AdvancedModelRendererExtended Jaw;
    private final AdvancedModelRendererExtended cube_r3;
    private final AdvancedModelRendererExtended cube_r4;
    private final AdvancedModelRendererExtended Tail;
    private final AdvancedModelRendererExtended Tail2;
    private final AdvancedModelRendererExtended Tail3;

    private ModelAnimator animator;

    public ModelPurlovia() {
        this.textureWidth = 64;
        this.textureHeight = 64;

        this.PurloviaBase = new AdvancedModelRendererExtended(this);
        this.PurloviaBase.setRotationPoint(0.0F, 15.0F, 8.0F);
        this.setRotateAngle(PurloviaBase, -0.2618F, 0.0F, 0.0F);
        this.PurloviaBase.cubeList.add(new ModelBox(PurloviaBase, 0, 17, -2.5F, -2.0F, -3.0F, 5, 5, 6, 0.0F, false));

        this.LeftLeg = new AdvancedModelRendererExtended(this);
        this.LeftLeg.setRotationPoint(2.5F, 0.5F, 0.5F);
        this.PurloviaBase.addChild(LeftLeg);
        this.setRotateAngle(LeftLeg, -0.1309F, 0.0F, 0.0F);
        this.LeftLeg.cubeList.add(new ModelBox(LeftLeg, 36, 6, -1.0F, -1.0F, -2.0F, 2, 4, 4, 0.01F, false));

        this.LeftLeg2 = new AdvancedModelRendererExtended(this);
        this.LeftLeg2.setRotationPoint(0.0F, 2.0F, -0.5F);
        this.LeftLeg.addChild(LeftLeg2);
        this.setRotateAngle(LeftLeg2, 0.4014F, 0.0F, 0.0F);
        this.LeftLeg2.cubeList.add(new ModelBox(LeftLeg2, 31, 37, -1.0F, 0.0F, -1.5F, 2, 6, 3, 0.0F, false));

        this.LeftLegFoot = new AdvancedModelRendererExtended(this);
        this.LeftLegFoot.setRotationPoint(0.0F, 6.0F, 0.0F);
        this.LeftLeg2.addChild(LeftLegFoot);
        this.LeftLegFoot.cubeList.add(new ModelBox(LeftLegFoot, 34, 0, -1.5F, -0.5F, -3.0F, 3, 1, 4, 0.0F, false));

        this.RightLeg = new AdvancedModelRendererExtended(this);
        this.RightLeg.setRotationPoint(-2.5F, 0.5F, 0.5F);
        this.PurloviaBase.addChild(RightLeg);
        this.setRotateAngle(RightLeg, -0.1309F, 0.0F, 0.0F);
        this.RightLeg.cubeList.add(new ModelBox(RightLeg, 36, 6, -1.0F, -1.0F, -2.0F, 2, 4, 4, 0.01F, true));

        this.RightLeg2 = new AdvancedModelRendererExtended(this);
        this.RightLeg2.setRotationPoint(0.0F, 2.0F, -0.5F);
        this.RightLeg.addChild(RightLeg2);
        this.setRotateAngle(RightLeg2, 0.4014F, 0.0F, 0.0F);
        this.RightLeg2.cubeList.add(new ModelBox(RightLeg2, 31, 37, -1.0F, 0.0F, -1.5F, 2, 6, 3, 0.0F, true));

        this.RightLegFoot = new AdvancedModelRendererExtended(this);
        this.RightLegFoot.setRotationPoint(0.0F, 6.0F, 0.0F);
        this.RightLeg2.addChild(RightLegFoot);
        this.RightLegFoot.cubeList.add(new ModelBox(RightLegFoot, 34, 0, -1.5F, -0.5F, -3.0F, 3, 1, 4, 0.0F, true));

        this.Body = new AdvancedModelRendererExtended(this);
        this.Body.setRotationPoint(0.0F, 1.0F, -3.0F);
        this.PurloviaBase.addChild(Body);
        this.setRotateAngle(Body, 0.2618F, 0.0F, 0.0F);
        this.Body.cubeList.add(new ModelBox(Body, 0, 0, -3.0F, -3.0F, -9.0F, 6, 6, 10, 0.01F, false));

        this.Body2 = new AdvancedModelRendererExtended(this);
        this.Body2.setRotationPoint(0.0F, 0.0F, -8.0F);
        this.Body.addChild(Body2);
        this.Body2.cubeList.add(new ModelBox(Body2, 23, 17, -2.5F, -3.0F, -5.0F, 5, 6, 5, 0.0F, false));

        this.LeftForelimb = new AdvancedModelRendererExtended(this);
        this.LeftForelimb.setRotationPoint(2.5F, 0.5F, -3.0F);
        this.Body2.addChild(LeftForelimb);
        this.setRotateAngle(LeftForelimb, 0.5236F, 0.0F, 0.0F);
        this.LeftForelimb.cubeList.add(new ModelBox(LeftForelimb, 44, 20, -1.0F, -1.0F, -1.5F, 2, 5, 3, 0.0F, false));

        this.LeftForelimb2 = new AdvancedModelRendererExtended(this);
        this.LeftForelimb2.setRotationPoint(0.0F, 3.0F, 0.0F);
        this.LeftForelimb.addChild(LeftForelimb2);
        this.setRotateAngle(LeftForelimb2, -0.5236F, 0.0F, 0.0F);
        this.LeftForelimb2.cubeList.add(new ModelBox(LeftForelimb2, 42, 37, -1.0F, 0.0F, -1.5F, 2, 5, 3, -0.01F, false));

        this.LeftForelimbHand = new AdvancedModelRendererExtended(this);
        this.LeftForelimbHand.setRotationPoint(0.0F, 5.0F, 0.0F);
        this.LeftForelimb2.addChild(LeftForelimbHand);
        this.LeftForelimbHand.cubeList.add(new ModelBox(LeftForelimbHand, 0, 39, -1.5F, -0.5F, -3.0F, 3, 1, 4, 0.0F, false));

        this.RightForelimb = new AdvancedModelRendererExtended(this);
        this.RightForelimb.setRotationPoint(-2.5F, 0.5F, -3.0F);
        this.Body2.addChild(RightForelimb);
        this.setRotateAngle(RightForelimb, 0.5236F, 0.0F, 0.0F);
        this.RightForelimb.cubeList.add(new ModelBox(RightForelimb, 44, 20, -1.0F, -1.0F, -1.5F, 2, 5, 3, 0.0F, true));

        this.RightForelimb2 = new AdvancedModelRendererExtended(this);
        this.RightForelimb2.setRotationPoint(0.0F, 3.0F, 0.0F);
        this.RightForelimb.addChild(RightForelimb2);
        this.setRotateAngle(RightForelimb2, -0.5236F, 0.0F, 0.0F);
        this.RightForelimb2.cubeList.add(new ModelBox(RightForelimb2, 42, 37, -1.0F, 0.0F, -1.5F, 2, 5, 3, -0.01F, true));

        this.RightForelimbHand = new AdvancedModelRendererExtended(this);
        this.RightForelimbHand.setRotationPoint(0.0F, 5.0F, 0.0F);
        this.RightForelimb2.addChild(RightForelimbHand);
        this.RightForelimbHand.cubeList.add(new ModelBox(RightForelimbHand, 0, 39, -1.5F, -0.5F, -3.0F, 3, 1, 4, 0.0F, true));

        this.Neck = new AdvancedModelRendererExtended(this);
        this.Neck.setRotationPoint(0.0F, -1.0F, -4.0F);
        this.Body2.addChild(Neck);
        this.setRotateAngle(Neck, -0.1745F, 0.0F, 0.0F);
        this.Neck.cubeList.add(new ModelBox(Neck, 17, 29, -2.0F, -2.0F, -4.0F, 4, 5, 4, -0.02F, false));

        this.Head = new AdvancedModelRendererExtended(this);
        this.Head.setRotationPoint(0.0F, 0.0F, -4.0F);
        this.Neck.addChild(Head);
        this.setRotateAngle(Head, 0.2182F, 0.0F, 0.0F);
        this.Head.cubeList.add(new ModelBox(Head, 34, 29, -2.5F, -2.0F, -3.0F, 5, 3, 4, 0.0F, false));
        this.Head.cubeList.add(new ModelBox(Head, 46, 3, -1.5F, -2.0F, -6.0F, 3, 3, 3, 0.0F, false));
        this.Head.cubeList.add(new ModelBox(Head, 3, 3, 0.81F, 0.5F, -4.0F, 0, 1, 1, 0.0F, false));
        this.Head.cubeList.add(new ModelBox(Head, 3, 3, -0.81F, 0.5F, -4.0F, 0, 1, 1, 0.0F, true));

        this.cube_r1 = new AdvancedModelRendererExtended(this);
        this.cube_r1.setRotationPoint(-1.5F, 1.0F, -5.0F);
        this.Head.addChild(cube_r1);
        this.setRotateAngle(cube_r1, 0.0F, 0.0F, 0.1309F);
        this.cube_r1.cubeList.add(new ModelBox(cube_r1, 0, 0, 0.0F, -0.2F, -0.5F, 1, 1, 1, 0.0F, true));

        this.cube_r2 = new AdvancedModelRendererExtended(this);
        this.cube_r2.setRotationPoint(1.5F, 1.0F, -5.0F);
        this.Head.addChild(cube_r2);
        this.setRotateAngle(cube_r2, 0.0F, 0.0F, -0.1309F);
        this.cube_r2.cubeList.add(new ModelBox(cube_r2, 0, 0, -1.0F, -0.2F, -0.5F, 1, 1, 1, 0.0F, false));

        this.Jaw = new AdvancedModelRendererExtended(this);
        this.Jaw.setRotationPoint(0.0F, 1.0F, 0.0F);
        this.Head.addChild(Jaw);
        this.Jaw.cubeList.add(new ModelBox(Jaw, 0, 45, -2.0F, 0.0F, -3.0F, 4, 1, 3, 0.0F, false));
        this.Jaw.cubeList.add(new ModelBox(Jaw, 39, 46, -1.0F, 0.0F, -6.0F, 2, 1, 3, 0.0F, false));
        this.Jaw.cubeList.add(new ModelBox(Jaw, 5, 0, 0.8F, -0.8F, -5.0F, 0, 1, 1, 0.0F, false));
        this.Jaw.cubeList.add(new ModelBox(Jaw, 5, 0, -0.8F, -0.8F, -5.0F, 0, 1, 1, 0.0F, true));
        this.Jaw.cubeList.add(new ModelBox(Jaw, 0, 3, 0.8F, -0.5F, -3.5F, 0, 1, 1, 0.0F, false));
        this.Jaw.cubeList.add(new ModelBox(Jaw, 0, 3, -0.8F, -0.5F, -3.5F, 0, 1, 1, 0.0F, true));

        this.cube_r3 = new AdvancedModelRendererExtended(this);
        this.cube_r3.setRotationPoint(0.0F, 2.0F, 0.0F);
        this.Jaw.addChild(cube_r3);
        this.setRotateAngle(cube_r3, -0.3491F, 0.0F, 0.0F);
        this.cube_r3.cubeList.add(new ModelBox(cube_r3, 39, 15, -2.0F, -1.0F, -3.0F, 4, 1, 3, -0.03F, false));

        this.cube_r4 = new AdvancedModelRendererExtended(this);
        this.cube_r4.setRotationPoint(0.0F, 0.0F, -2.0F);
        this.Jaw.addChild(cube_r4);
        this.setRotateAngle(cube_r4, -0.4747F, 0.0F, 0.0F);
        this.cube_r4.cubeList.add(new ModelBox(cube_r4, 17, 17, -1.5F, -2.0F, 0.0F, 3, 2, 2, -0.01F, false));

        this.Tail = new AdvancedModelRendererExtended(this);
        this.Tail.setRotationPoint(0.0F, 0.0F, 2.0F);
        this.PurloviaBase.addChild(Tail);
        this.setRotateAngle(Tail, -0.2618F, 0.0F, 0.0F);
        this.Tail.cubeList.add(new ModelBox(Tail, 0, 29, -1.5F, -2.0F, 0.0F, 3, 4, 5, 0.0F, false));

        this.Tail2 = new AdvancedModelRendererExtended(this);
        this.Tail2.setRotationPoint(0.0F, 0.0F, 4.0F);
        this.Tail.addChild(Tail2);
        this.setRotateAngle(Tail2, -0.0436F, 0.0F, 0.0F);
        this.Tail2.cubeList.add(new ModelBox(Tail2, 23, 0, -1.0F, -2.0F, 0.0F, 2, 3, 6, 0.0F, false));

        this.Tail3 = new AdvancedModelRendererExtended(this);
        this.Tail3.setRotationPoint(0.0F, -0.5F, 5.0F);
        this.Tail2.addChild(Tail3);
        this.setRotateAngle(Tail3, 0.1745F, 0.0F, 0.0F);
        this.Tail3.cubeList.add(new ModelBox(Tail3, 15, 39, -0.5F, -1.0F, 0.0F, 1, 2, 5, 0.0F, false));

        updateDefaultPose();
        animator = ModelAnimator.create();
    }

    @Override
    public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        animate((IAnimatedEntity) entity, f, f1, f2, f3, f4, f5);
        this.PurloviaBase.render(f5);
    }
    public void renderStaticFloor(float f) {
        this.setRotateAngle(Body, 0.3927F, 0.0F, 0.0F);
        this.setRotateAngle(Body2, 0.0436F, 0.0F, 0.0F);
        this.setRotateAngle(cube_r1, 0.0F, 0.0F, 0.1309F);
        this.setRotateAngle(cube_r2, 0.0F, 0.0F, -0.1309F);
        this.setRotateAngle(cube_r3, -0.3491F, 0.0F, 0.0F);
        this.setRotateAngle(cube_r4, -0.4747F, 0.0F, 0.0F);
        this.setRotateAngle(Head, 0.3927F, 0.0F, 0.0F);
        this.setRotateAngle(Jaw, 0.3054F, 0.0F, 0.0F);
        this.setRotateAngle(LeftForelimb, 1.0472F, 0.0F, 0.0F);
        this.setRotateAngle(LeftForelimb2, -1.2217F, 0.0F, 0.0F);
        this.setRotateAngle(LeftLeg, -0.1309F, 0.0F, 0.0F);
        this.setRotateAngle(LeftLeg2, 0.4014F, 0.0F, 0.0F);
        this.setRotateAngle(Neck, 0.1309F, 0.0F, 0.0F);
        this.setRotateAngle(PurloviaBase, -0.2618F, 0.0F, 0.0F);
        this.setRotateAngle(RightForelimb, 1.0472F, 0.0F, 0.0F);
        this.setRotateAngle(RightForelimb2, -1.2217F, 0.0F, 0.0F);
        this.setRotateAngle(RightLeg, -0.1309F, 0.0F, 0.0F);
        this.setRotateAngle(RightLeg2, 0.4014F, 0.0F, 0.0F);
        this.setRotateAngle(Tail, -0.0873F, 0.0F, 0.0F);
        this.setRotateAngle(Tail2, 0.1309F, 0.0F, 0.0F);
        this.setRotateAngle(Tail3, 0.2182F, 0.0F, 0.0F);
        this.PurloviaBase.offsetY = -0.05F;
        this.PurloviaBase.offsetZ = -0.1F;
        this.PurloviaBase.render(0.01F);
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
        //this.PurloviaBase.offsetY = 0.83F;

        EntityPrehistoricFloraPurlovia PurloviaEntity = (EntityPrehistoricFloraPurlovia) e;
        float masterSpeed = PurloviaEntity.getTravelSpeed();

        this.faceTarget(f3, f4, 2, Neck);
        this.faceTarget(f3, f4, 4, Head);

        AdvancedModelRendererExtended[] Tail = {this.Tail, this.Tail2};

        if (PurloviaEntity.getAnimation() == PurloviaEntity.LAY_ANIMATION) {
            this.swing(Neck, 0.5F, 0.10F, false, 0.5F,-0.05F, f2, 0.8F);
            this.walk(Neck, 0.5F * 2, -0.02F, false, 0.5F,0.01F, f2, 0.8F);
            return;
        }

        if (PurloviaEntity.getScreaming()) {
            this.Neck.rotateAngleX = (float) Math.toRadians(-55);
            this.walk(Jaw, 1.5F, 0.15F, false, 0, 1.5F, f2, 1F);
        }

        if (f3 == 0.0F || !PurloviaEntity.getIsMoving()) { //Not moving
            this.swing(Neck, 0.06F, 0.10F, false, 0.5F,-0.05F, f2, 0.8F);
            this.walk(Neck, 0.06F * 2F, -0.02F, false, 0.5F,0.01F, f2, 0.8F);
            this.chainWave(Tail, (0.06F*0.9F), 0.10F, 0.10F, f2, 1F);
            this.chainSwing(Tail, (0.06F*0.9F) * 2F, 0.05F, 0.06F, f2, 1F);
            return;
        }

        float speed = masterSpeed / 0.965F;
        if (PurloviaEntity.getIsFast()) {
            speed = speed * 1.5F;
        }

        this.LeftForelimb.offsetY = this.moveBoxExtended(speed, (float) Math.toRadians(0.4), false, 1, f2, 1.5F);;
        this.RightForelimb.offsetY = this.moveBoxExtended(speed, (float) Math.toRadians(0.4), false, 4, f2, 1.5F);;
        this.LeftLeg.offsetY = this.moveBoxExtended(speed, (float) Math.toRadians(0.3), false, 4, f2, 1.5F);;
        this.RightLeg.offsetY = this.moveBoxExtended(speed, (float) Math.toRadians(0.3), false, 1, f2, 1.5F);;

        this.flap(LeftForelimb, speed, -0.025F, true, 4, 0.005F, f2, 1F);
        this.flap(RightForelimb, speed, 0.025F, true, 7, -0.005F, f2, 1F);
        this.flap(LeftLeg, speed, 0.025F, false, 7, -0.005F, f2, 1F);
        this.flap(RightLeg, speed, -0.025F, false, 4, 0.005F, f2, 1F);

        this.walk(LeftLeg, speed, 0.15F, true, 4, 0.05F, f2, 1F);
        this.walk(RightLeg, speed, 0.15F, true, 7, 0.05F, f2, 1F);
        this.walk(LeftLeg, speed, 0.15F, false, 7, 0.05F, f2, 1F);
        this.walk(RightLeg, speed, 0.15F, false, 4, 0.05F, f2, 1F);

        this.swing(LeftForelimb, speed, -0.40F, true, 5, 0.18F, f2, 1F);
        this.swing(RightForelimb, speed, 0.40F, true, 8, -0.18F, f2, 1F);
        this.swing(LeftLeg, speed, -0.30F, true, 8, 0F, f2, 1F);
        this.swing(RightLeg, speed, 0.30F, true, 5, 0F, f2, 1F);

        this.swing(LeftForelimb2, speed, -0.25F, true, 6, 0F, f2, 1F);
        this.swing(RightForelimb2, speed, 0.25F, true, 9, 0F, f2, 1F);
        this.swing(LeftLeg2, speed, -0.20F, true, 9, 0F, f2, 1F);
        this.swing(RightLeg2, speed, 0.20F, true, 6, 0F, f2, 1F);

        this.flap(LeftForelimb2, speed, 0.10F, true, 0, 0.05F, f2, 1F);
        this.flap(RightForelimb2, speed, -0.10F, true, 3, -0.05F, f2, 1F);
        this.flap(LeftLeg2, speed, -0.10F, false, 3, -0.05F, f2, 1F);
        this.flap(RightLeg2, speed, 0.10F, false, 0, 0.05F, f2, 1F);

        this.swing(LeftForelimbHand, speed, -0.30F, true, 2, 0.10F, f2, 1F);
        this.swing(RightForelimbHand, speed, 0.30F, true, 5, -0.10F, f2, 1F);
        this.swing(LeftLegFoot, speed, -0.25F, true, 5, 0.08F, f2, 1F);
        this.swing(RightLegFoot, speed, 0.25F, true, 2, -0.08F, f2, 1F);

        this.bobExtended(PurloviaBase, speed * 2F, 0.145F, false, 2.5F,  f2, 1F);

        this.flap(PurloviaBase, speed, 0.05F, false, 5.0F,0.025F, f2, 1.0F);
        this.flap(Body, speed, -0.05F, false, 5.0F,-0.025F, f2, 1.0F);
        this.flap(Body2, speed, -0.05F, false, 5.0F,-0.025F, f2, 1.0F);

        this.walk(Body2, speed * 2, 0.05F, false, 2.5F,-0.01F, f2, 0.8F);

        this.swing(Neck, speed, 0.10F, false, 0.5F,-0.05F, f2, 0.8F);
        this.walk(Neck, speed * 2, -0.02F, false, 0.5F,0.01F, f2, 0.8F);
        this.chainWave(Tail, (speed*0.6F), 0.20F, 0.2F, f2, 1F);
        this.chainSwing(Tail, (speed*0.6F) * 2F, 0.10F, 0.12F, f2, 1F);

        this.PurloviaBase.offsetZ = this.moveBoxExtended(speed * 2, (float) Math.toRadians(1.8), false, 1.5F, f2, 1);

    }

    public void animate(IAnimatedEntity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        EntityPrehistoricFloraPurlovia e = (EntityPrehistoricFloraPurlovia) entity;
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
