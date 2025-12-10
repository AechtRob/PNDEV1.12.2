package net.lepidodendron.entity.model.entity;

import net.ilexiconn.llibrary.client.model.ModelAnimator;
import net.ilexiconn.llibrary.client.model.tools.AdvancedModelRenderer;
import net.ilexiconn.llibrary.server.animation.IAnimatedEntity;
import net.lepidodendron.entity.EntityPrehistoricFloraTeyujagua;
import net.lepidodendron.entity.model.ModelBasePalaeopedia;
import net.minecraft.client.model.ModelBox;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;

public class ModelTeyujagua extends ModelBasePalaeopedia {
    private final AdvancedModelRenderer Root;
    private final AdvancedModelRenderer Base;
    private final AdvancedModelRenderer Body;
    private final AdvancedModelRenderer Chest;
    private final AdvancedModelRenderer Neck;
    private final AdvancedModelRenderer Neck2;
    private final AdvancedModelRenderer Head;
    private final AdvancedModelRenderer cube_r1;
    private final AdvancedModelRenderer cube_r2;
    private final AdvancedModelRenderer cube_r3;
    private final AdvancedModelRenderer cube_r4;
    private final AdvancedModelRenderer cube_r5;
    private final AdvancedModelRenderer Jaw;
    private final AdvancedModelRenderer cube_r6;
    private final AdvancedModelRenderer cube_r7;
    private final AdvancedModelRenderer cube_r8;
    private final AdvancedModelRenderer eye;
    private final AdvancedModelRenderer cube_r9;
    private final AdvancedModelRenderer cube_r10;
    private final AdvancedModelRenderer RightArm;
    private final AdvancedModelRenderer RightArm2;
    private final AdvancedModelRenderer RightArmHand;
    private final AdvancedModelRenderer LeftArm;
    private final AdvancedModelRenderer LeftArm2;
    private final AdvancedModelRenderer LeftArmHand;
    private final AdvancedModelRenderer RightLeg;
    private final AdvancedModelRenderer RightLeg2;
    private final AdvancedModelRenderer RightLegFoot;
    private final AdvancedModelRenderer LeftLeg;
    private final AdvancedModelRenderer LeftLeg2;
    private final AdvancedModelRenderer LeftLegFoot;
    private final AdvancedModelRenderer Tail;
    private final AdvancedModelRenderer Tail2;
    private final AdvancedModelRenderer Tail3;
    private final AdvancedModelRenderer Tail4;

    private ModelAnimator animator;

    public ModelTeyujagua() {
        this.textureWidth = 80;
        this.textureHeight = 80;

        this.Root = new AdvancedModelRenderer(this);
        this.Root.setRotationPoint(0.0F, 14.0F, -0.5F);


        this.Base = new AdvancedModelRenderer(this);
        this.Base.setRotationPoint(0.0F, 0.425F, 9.0F);
        this.Root.addChild(Base);
        this.setRotateAngle(Base, -0.0873F, 0.0F, 0.0F);
        this.Base.cubeList.add(new ModelBox(Base, 34, 11, -2.5F, -2.5F, -3.5F, 5, 5, 8, 0.0F, false));
        this.Base.cubeList.add(new ModelBox(Base, 56, 29, -1.0F, -3.0F, -3.5F, 0, 1, 8, 0.0F, false));
        this.Base.cubeList.add(new ModelBox(Base, 56, 29, 1.0F, -3.0F, -3.5F, 0, 1, 8, 0.0F, true));

        this.Body = new AdvancedModelRenderer(this);
        this.Body.setRotationPoint(0.0F, 0.5F, -3.5F);
        this.Base.addChild(Body);
        this.setRotateAngle(Body, 0.0873F, 0.0F, 0.0F);
        this.Body.cubeList.add(new ModelBox(Body, 0, 0, -3.0F, -3.0F, -11.0F, 6, 6, 12, 0.01F, false));
        this.Body.cubeList.add(new ModelBox(Body, 51, 25, -1.5F, -3.5F, -11.0F, 0, 1, 12, 0.0F, false));
        this.Body.cubeList.add(new ModelBox(Body, 51, 25, 1.5F, -3.5F, -11.0F, 0, 1, 12, 0.0F, true));

        this.Chest = new AdvancedModelRenderer(this);
        this.Chest.setRotationPoint(0.0F, -1.0F, -10.0F);
        this.Body.addChild(Chest);
        this.setRotateAngle(Chest, 0.0873F, 0.0F, 0.0F);
        this.Chest.cubeList.add(new ModelBox(Chest, 25, 42, -2.5F, -2.0F, -6.0F, 5, 6, 6, 0.0F, false));
        this.Chest.cubeList.add(new ModelBox(Chest, 59, 32, -1.0F, -2.5F, -6.0F, 0, 1, 5, 0.0F, false));
        this.Chest.cubeList.add(new ModelBox(Chest, 59, 32, 1.0F, -2.5F, -6.0F, 0, 1, 5, 0.0F, true));

        this.Neck = new AdvancedModelRenderer(this);
        this.Neck.setRotationPoint(0.0F, -0.5F, -5.0F);
        this.Chest.addChild(Neck);
        this.setRotateAngle(Neck, -0.0873F, 0.0F, 0.0F);
        this.Neck.cubeList.add(new ModelBox(Neck, 25, 0, -2.0F, -1.5F, -5.0F, 4, 5, 5, -0.01F, false));
        this.Neck.cubeList.add(new ModelBox(Neck, 60, 33, -1.0F, -2.0F, -5.0F, 0, 1, 4, 0.0F, false));
        this.Neck.cubeList.add(new ModelBox(Neck, 60, 33, 1.0F, -2.0F, -5.0F, 0, 1, 4, 0.0F, true));

        this.Neck2 = new AdvancedModelRenderer(this);
        this.Neck2.setRotationPoint(0.0F, 0.0F, -4.0F);
        this.Neck.addChild(Neck2);
        this.setRotateAngle(Neck2, -0.0873F, 0.0F, 0.0F);
        this.Neck2.cubeList.add(new ModelBox(Neck2, 44, 0, -1.5F, -1.5F, -5.0F, 3, 5, 5, -0.02F, false));
        this.Neck2.cubeList.add(new ModelBox(Neck2, 60, 34, -0.5F, -2.0F, -4.0F, 0, 1, 3, 0.0F, false));
        this.Neck2.cubeList.add(new ModelBox(Neck2, 60, 34, 0.5F, -2.0F, -4.0F, 0, 1, 3, 0.0F, true));

        this.Head = new AdvancedModelRenderer(this);
        this.Head.setRotationPoint(0.0F, 1.0F, -4.0F);
        this.Neck2.addChild(Head);
        this.setRotateAngle(Head, 0.0873F, 0.0F, 0.0F);
        this.Head.cubeList.add(new ModelBox(Head, 53, 11, -2.0F, -2.0F, -3.0F, 4, 3, 3, 0.0F, false));
        this.Head.cubeList.add(new ModelBox(Head, 12, 52, -1.0F, 0.0F, -8.0F, 2, 1, 5, 0.0F, false));
        this.Head.cubeList.add(new ModelBox(Head, 34, 31, -1.0F, -1.0F, -5.7F, 2, 1, 2, 0.0F, false));
        this.Head.cubeList.add(new ModelBox(Head, 26, 19, -1.0F, 0.0F, -8.3F, 2, 1, 1, -0.01F, false));

        this.cube_r1 = new AdvancedModelRenderer(this);
        this.cube_r1.setRotationPoint(0.0F, -2.5F, 0.0F);
        this.Head.addChild(cube_r1);
        this.setRotateAngle(cube_r1, 0.1571F, 0.0F, 0.0F);
        this.cube_r1.cubeList.add(new ModelBox(cube_r1, 56, 0, -1.5F, 0.0F, -3.0F, 3, 1, 3, -0.03F, false));

        this.cube_r2 = new AdvancedModelRenderer(this);
        this.cube_r2.setRotationPoint(0.0F, 1.0F, -7.8F);
        this.Head.addChild(cube_r2);
        this.setRotateAngle(cube_r2, 0.1309F, 0.0F, 0.0F);
        this.cube_r2.cubeList.add(new ModelBox(cube_r2, 42, 42, -1.0F, -0.3F, -0.2F, 2, 1, 3, -0.01F, false));

        this.cube_r3 = new AdvancedModelRenderer(this);
        this.cube_r3.setRotationPoint(2.0F, 0.0F, -3.0F);
        this.Head.addChild(cube_r3);
        this.setRotateAngle(cube_r3, 0.0F, 0.5236F, 0.0F);
        this.cube_r3.cubeList.add(new ModelBox(cube_r3, 39, 0, -1.0F, -1.01F, -2.0F, 1, 2, 2, 0.0F, true));

        this.cube_r4 = new AdvancedModelRenderer(this);
        this.cube_r4.setRotationPoint(-2.0F, 0.0F, -3.0F);
        this.Head.addChild(cube_r4);
        this.setRotateAngle(cube_r4, 0.0F, -0.5236F, 0.0F);
        this.cube_r4.cubeList.add(new ModelBox(cube_r4, 39, 0, 0.0F, -1.01F, -2.0F, 1, 2, 2, 0.0F, false));

        this.cube_r5 = new AdvancedModelRenderer(this);
        this.cube_r5.setRotationPoint(0.0F, -2.0F, -3.0F);
        this.Head.addChild(cube_r5);
        this.setRotateAngle(cube_r5, 0.3491F, 0.0F, 0.0F);
        this.cube_r5.cubeList.add(new ModelBox(cube_r5, 48, 42, -1.0F, 0.01F, -6.0F, 2, 1, 6, 0.01F, false));

        this.Jaw = new AdvancedModelRenderer(this);
        this.Jaw.setRotationPoint(0.0F, 1.0F, 0.0F);
        this.Head.addChild(Jaw);
        this.setRotateAngle(Jaw, -0.0035F, 0.0F, 0.0F);
        this.Jaw.cubeList.add(new ModelBox(Jaw, 55, 50, -2.0F, -0.01F, -2.99F, 4, 1, 3, -0.01F, false));
        this.Jaw.cubeList.add(new ModelBox(Jaw, 0, 49, -1.0F, -0.01F, -8.32F, 2, 1, 6, -0.02F, false));
        this.Jaw.cubeList.add(new ModelBox(Jaw, 0, 35, -0.75F, -0.5F, -7.5F, 0, 1, 3, 0.0F, false));
        this.Jaw.cubeList.add(new ModelBox(Jaw, 0, 35, 0.75F, -0.5F, -7.5F, 0, 1, 3, 0.0F, true));

        this.cube_r6 = new AdvancedModelRenderer(this);
        this.cube_r6.setRotationPoint(0.0F, 0.0F, -3.0F);
        this.Jaw.addChild(cube_r6);
        this.setRotateAngle(cube_r6, -0.3264F, 0.0F, 0.0F);
        this.cube_r6.cubeList.add(new ModelBox(cube_r6, 33, 25, -1.5F, -2.0F, 0.0F, 3, 2, 3, 0.0F, false));

        this.cube_r7 = new AdvancedModelRenderer(this);
        this.cube_r7.setRotationPoint(2.0F, -1.0F, -3.0F);
        this.Jaw.addChild(cube_r7);
        this.setRotateAngle(cube_r7, 0.0F, 0.5411F, 0.0F);
        this.cube_r7.cubeList.add(new ModelBox(cube_r7, 24, 39, -1.01F, 0.97F, -1.98F, 1, 1, 2, -0.01F, true));

        this.cube_r8 = new AdvancedModelRenderer(this);
        this.cube_r8.setRotationPoint(-2.0F, -1.0F, -3.0F);
        this.Jaw.addChild(cube_r8);
        this.setRotateAngle(cube_r8, 0.0F, -0.5411F, 0.0F);
        this.cube_r8.cubeList.add(new ModelBox(cube_r8, 24, 39, 0.01F, 0.97F, -1.98F, 1, 1, 2, -0.01F, false));

        this.eye = new AdvancedModelRenderer(this);
        this.eye.scaleChildren = true;
        this.eye.setRotationPoint(0.0F, -0.8F, -3.621F);
        this.Head.addChild(eye);


        this.cube_r9 = new AdvancedModelRenderer(this);
        this.cube_r9.setRotationPoint(-2.0F, 0.8F, 0.621F);
        this.eye.addChild(cube_r9);
        this.setRotateAngle(cube_r9, 0.0F, -0.5236F, 0.0F);
        this.cube_r9.cubeList.add(new ModelBox(cube_r9, 17, 39, -0.01F, -1.3F, -2.0F, 1, 1, 2, 0.0F, false));

        this.cube_r10 = new AdvancedModelRenderer(this);
        this.cube_r10.setRotationPoint(2.0F, 0.8F, 0.621F);
        this.eye.addChild(cube_r10);
        this.setRotateAngle(cube_r10, 0.0F, 0.5236F, 0.0F);
        this.cube_r10.cubeList.add(new ModelBox(cube_r10, 17, 39, -0.99F, -1.3F, -2.0F, 1, 1, 2, 0.0F, true));

        this.RightArm = new AdvancedModelRenderer(this);
        this.RightArm.setRotationPoint(-2.0F, 2.0F, -4.0F);
        this.Chest.addChild(RightArm);
        this.setRotateAngle(RightArm, 0.8496F, -0.5214F, 0.0565F);
        this.RightArm.cubeList.add(new ModelBox(RightArm, 18, 19, -1.0F, 0.0F, -1.5F, 2, 5, 3, 0.0F, false));

        this.RightArm2 = new AdvancedModelRenderer(this);
        this.RightArm2.setRotationPoint(0.0F, 5.0F, 1.5F);
        this.RightArm.addChild(RightArm2);
        this.setRotateAngle(RightArm2, -0.9599F, 0.0F, 0.0F);
        this.RightArm2.cubeList.add(new ModelBox(RightArm2, 0, 19, -1.0F, 0.0F, -3.0F, 2, 6, 3, -0.01F, false));

        this.RightArmHand = new AdvancedModelRenderer(this);
        this.RightArmHand.setRotationPoint(0.0F, 6.0F, -1.5F);
        this.RightArm2.addChild(RightArmHand);
        this.setRotateAngle(RightArmHand, 0.0F, 0.48F, 0.0F);
        this.RightArmHand.cubeList.add(new ModelBox(RightArmHand, 23, 55, -1.5F, -0.5F, -3.0F, 3, 1, 4, 0.0F, false));

        this.LeftArm = new AdvancedModelRenderer(this);
        this.LeftArm.setRotationPoint(2.0F, 2.0F, -4.0F);
        this.Chest.addChild(LeftArm);
        this.setRotateAngle(LeftArm, 0.8496F, 0.5214F, -0.0565F);
        this.LeftArm.cubeList.add(new ModelBox(LeftArm, 18, 19, -1.0F, 0.0F, -1.5F, 2, 5, 3, 0.0F, true));

        this.LeftArm2 = new AdvancedModelRenderer(this);
        this.LeftArm2.setRotationPoint(0.0F, 5.0F, 1.5F);
        this.LeftArm.addChild(LeftArm2);
        this.setRotateAngle(LeftArm2, -0.9599F, 0.0F, 0.0F);
        this.LeftArm2.cubeList.add(new ModelBox(LeftArm2, 0, 19, -1.0F, 0.0F, -3.0F, 2, 6, 3, -0.01F, true));

        this.LeftArmHand = new AdvancedModelRenderer(this);
        this.LeftArmHand.setRotationPoint(0.0F, 6.0F, -1.5F);
        this.LeftArm2.addChild(LeftArmHand);
        this.setRotateAngle(LeftArmHand, 0.0F, -0.5236F, 0.0F);
        this.LeftArmHand.cubeList.add(new ModelBox(LeftArmHand, 23, 55, -1.5F, -0.5F, -3.0F, 3, 1, 4, 0.0F, true));

        this.RightLeg = new AdvancedModelRenderer(this);
        this.RightLeg.setRotationPoint(-2.5F, -1.0F, 1.0F);
        this.Base.addChild(RightLeg);
        this.setRotateAngle(RightLeg, -0.4976F, 0.4853F, 0.0892F);
        this.RightLeg.cubeList.add(new ModelBox(RightLeg, 48, 25, -1.0F, 0.0F, -2.0F, 3, 6, 4, 0.0F, false));

        this.RightLeg2 = new AdvancedModelRenderer(this);
        this.RightLeg2.setRotationPoint(0.5F, 6.0F, -1.5F);
        this.RightLeg.addChild(RightLeg2);
        this.setRotateAngle(RightLeg2, 0.6109F, 0.0F, 0.0F);
        this.RightLeg2.cubeList.add(new ModelBox(RightLeg2, 0, 0, -1.0F, 0.0F, 0.0F, 2, 6, 3, 0.0F, false));

        this.RightLegFoot = new AdvancedModelRenderer(this);
        this.RightLegFoot.setRotationPoint(0.0F, 6.0F, 2.0F);
        this.RightLeg2.addChild(RightLegFoot);
        this.setRotateAngle(RightLegFoot, 0.0002F, -0.0094F, -0.0426F);
        this.RightLegFoot.cubeList.add(new ModelBox(RightLegFoot, 43, 50, -1.5F, -0.5F, -4.5F, 3, 1, 5, 0.0F, false));

        this.LeftLeg = new AdvancedModelRenderer(this);
        this.LeftLeg.setRotationPoint(2.5F, -1.0F, 1.0F);
        this.Base.addChild(LeftLeg);
        this.setRotateAngle(LeftLeg, -0.4976F, -0.4853F, -0.0892F);
        this.LeftLeg.cubeList.add(new ModelBox(LeftLeg, 48, 25, -2.0F, 0.0F, -2.0F, 3, 6, 4, 0.0F, true));

        this.LeftLeg2 = new AdvancedModelRenderer(this);
        this.LeftLeg2.setRotationPoint(-0.5F, 6.0F, -1.5F);
        this.LeftLeg.addChild(LeftLeg2);
        this.setRotateAngle(LeftLeg2, 0.6109F, 0.0F, 0.0F);
        this.LeftLeg2.cubeList.add(new ModelBox(LeftLeg2, 0, 0, -1.0F, 0.0F, 0.0F, 2, 6, 3, 0.0F, true));

        this.LeftLegFoot = new AdvancedModelRenderer(this);
        this.LeftLegFoot.setRotationPoint(0.0F, 6.0F, 2.0F);
        this.LeftLeg2.addChild(LeftLegFoot);
        this.setRotateAngle(LeftLegFoot, 0.0002F, 0.0094F, 0.0426F);
        this.LeftLegFoot.cubeList.add(new ModelBox(LeftLegFoot, 43, 50, -1.5F, -0.5F, -4.5F, 3, 1, 5, 0.0F, true));

        this.Tail = new AdvancedModelRenderer(this);
        this.Tail.setRotationPoint(0.0F, 0.0F, 3.5F);
        this.Base.addChild(Tail);
        this.setRotateAngle(Tail, -0.1309F, 0.0F, 0.0F);
        this.Tail.cubeList.add(new ModelBox(Tail, 0, 35, -2.0F, -2.5F, 0.0F, 4, 5, 8, -0.01F, false));
        this.Tail.cubeList.add(new ModelBox(Tail, 57, 29, -1.0F, -3.0F, 0.0F, 0, 1, 8, 0.0F, false));
        this.Tail.cubeList.add(new ModelBox(Tail, 57, 29, 1.0F, -3.0F, 0.0F, 0, 1, 8, 0.0F, true));

        this.Tail2 = new AdvancedModelRenderer(this);
        this.Tail2.setRotationPoint(0.0F, 0.0F, 7.0F);
        this.Tail.addChild(Tail2);
        this.setRotateAngle(Tail2, -0.1309F, 0.0F, 0.0F);
        this.Tail2.cubeList.add(new ModelBox(Tail2, 0, 19, -1.5F, -2.0F, 0.0F, 3, 4, 11, 0.0F, false));
        this.Tail2.cubeList.add(new ModelBox(Tail2, 53, 26, -0.5F, -2.5F, 0.0F, 0, 1, 11, 0.0F, false));
        this.Tail2.cubeList.add(new ModelBox(Tail2, 53, 26, 0.5F, -2.5F, 0.0F, 0, 1, 11, 0.0F, true));

        this.Tail3 = new AdvancedModelRenderer(this);
        this.Tail3.setRotationPoint(0.0F, 0.0F, 10.0F);
        this.Tail2.addChild(Tail3);
        this.setRotateAngle(Tail3, 0.1745F, 0.0F, 0.0F);
        this.Tail3.cubeList.add(new ModelBox(Tail3, 18, 24, -1.0F, -1.5F, 0.0F, 2, 3, 11, 0.0F, false));
        this.Tail3.cubeList.add(new ModelBox(Tail3, 53, 27, -0.5F, -2.0F, 1.0F, 0, 1, 10, 0.0F, false));
        this.Tail3.cubeList.add(new ModelBox(Tail3, 53, 27, 0.5F, -2.0F, 1.0F, 0, 1, 10, 0.0F, true));

        this.Tail4 = new AdvancedModelRenderer(this);
        this.Tail4.setRotationPoint(0.0F, 0.0F, 10.0F);
        this.Tail3.addChild(Tail4);
        this.setRotateAngle(Tail4, 0.0436F, 0.0F, 0.0F);
        this.Tail4.cubeList.add(new ModelBox(Tail4, 35, 29, -0.5F, -1.0F, 0.0F, 1, 2, 10, 0.0F, false));
        this.Tail4.cubeList.add(new ModelBox(Tail4, 54, 28, 0.0F, -1.75F, 1.0F, 0, 1, 9, 0.0F, false));


        updateDefaultPose();
        animator = ModelAnimator.create();
    }

    @Override
    public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        animate((IAnimatedEntity) entity, f, f1, f2, f3, f4, f5);
        this.Root.render(f5);
    }

    public void renderStaticWall(float f) {
        this.Neck.offsetZ = -0.15F;
        this.Neck.offsetY = -0.0F;
        this.Neck.offsetX = -0.0F;
        this.Neck.render(0.01F);
        resetToDefaultPose();
    }
    public void renderStaticFloor(float f) {
        this.setRotateAngle(Base, 0.0F, 0.0F, 0.0F);
        this.setRotateAngle(Body, 0.0F, 0.1F, 0.0F);
        this.setRotateAngle(Chest, 0.0F, 0.1F, 0.0F);
        this.setRotateAngle(Neck, -0.2F, 0.1F, 0.0F);
        this.setRotateAngle(Neck2, -0.2F, 0.1F, 0.0F);
        this.setRotateAngle(Head, 0.0F, 0.0F, 0.0F);
        this.setRotateAngle(Tail, -0.1F, 0.2F, 0.0F);
        this.setRotateAngle(Tail2, 0.0F, 0.2F, 0.0F);
        this.setRotateAngle(Tail3, 0.0F, 0.2F, 0.0F);
        this.setRotateAngle(Tail4, 0.0F, 0.2F, 0.0F);
        this.setRotateAngle(LeftArm, 0.0F, 0.0F, -0.9F);
        this.setRotateAngle(LeftArm2, -1.4F, 0.0F, 0.5F);
        this.setRotateAngle(LeftArmHand, 1.3F, -0.3F, 0.0F);
        this.setRotateAngle(RightArm, 0.0F, 0.0F, 0.9F);
        this.setRotateAngle(RightArm2, -1.4F, 0.0F, -0.5F);
        this.setRotateAngle(RightArmHand, 1.3F, 0.3F, 0.0F);
        this.setRotateAngle(LeftLeg, -1.4F, -0.5F, 0.0F);
        this.setRotateAngle(LeftLeg2, 1.5F, 0.0F, 0.0F);
        this.setRotateAngle(LeftLegFoot, -0.1F, 0.0F, 0.0F);
        this.setRotateAngle(RightLeg, -1.4F, 0.5F, 0.0F);
        this.setRotateAngle(RightLeg2, 1.5F, 0.0F, 0.0F);
        this.setRotateAngle(RightLegFoot, -0.1F, 0.0F, 0.0F);
        this.Root.offsetY = 0.07F;
        this.Root.render(0.01F);
        resetToDefaultPose();
    }

    @Override
    public void renderStaticBook(float f) {
        //Rotations, positions and sizing:
        this.Root.offsetY = -0.80F;
        this.Root.offsetX = 0.3F;
        this.Root.rotateAngleY = (float)Math.toRadians(130);
        this.Root.rotateAngleX = (float)Math.toRadians(16);
        this.Root.rotateAngleZ = (float)Math.toRadians(12);
        this.Root.scaleChildren = true;
        float scaler = 1.0F;
        this.Root.setScale(scaler, scaler, scaler);
        //Start of pose:
        this.setRotateAngle(Root, 0.2F, 3.8F, -0.1F);
        //End of pose, now render the model:
        this.Root.render(f);
        //Reset rotations, positions and sizing:
        this.Root.setScale(1.0F, 1.0F, 1.0F);
        this.Root.scaleChildren = false;
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
        //this.resetToDefaultPose();
        this.Base.offsetY = 0.0F;

        EntityPrehistoricFloraTeyujagua proteros = (EntityPrehistoricFloraTeyujagua) e;

        this.faceTarget(f3, f4, 10, Neck);
        this.faceTarget(f3, f4, 10, Neck2);
        this.faceTarget(f3, f4, 10, Head);

        AdvancedModelRenderer[] Tail = {this.Tail, this.Tail2, this.Tail3, this.Tail4};
        AdvancedModelRenderer[] Neck = {this.Neck, this.Neck2, this.Head};
        //AdvancedModelRenderer[] ArmL = {this.leftarm, this.leftarm2, this.leftarm3};
        //AdvancedModelRenderer[] ArmR = {this.rightarm, this.rightarm2, this.rightarm3};

        proteros.tailBuffer.applyChainSwingBuffer(Tail);

        if (proteros.getAnimation() == proteros.LAY_ANIMATION) {
            this.chainSwing(Neck, 0.5F, 0.10F, 0.5, f2, 0.8F);
            this.chainWave(Neck, 0.5F * 2, -0.02F, 0.5F, f2, 0.8F);
        }
        else {
            if (!proteros.isReallyInWater()) {

                if (f3 == 0.0F || !proteros.getIsMoving()) {
                    if (proteros.getAnimation() != proteros.EAT_ANIMATION
                        && proteros.getAnimation() != proteros.DRINK_ANIMATION) {
                        this.chainSwing(Neck, 0.05F, 0.10F, 0.5, f2, 0.8F);
                        this.chainWave(Neck, 0.05F * 2, -0.02F, 0.5F, f2, 0.8F);
                    }

                    this.chainWave(Tail, (0.15F * 0.35F), 0.125F * 0.15F, 0.2F, f2, 1F);
                    this.chainSwing(Tail, (0.15F * 0.35F) * 4F, 0.05F * 0.35F, 0.12F, f2, 1F);


                    return;
                }

            }
        }
    }


    @Override
    public void setLivingAnimations(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime) {
        super.setLivingAnimations(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime);
        this.resetToDefaultPose();
        this.eye.setScale(1,1,1);
        EntityPrehistoricFloraTeyujagua ee = (EntityPrehistoricFloraTeyujagua) entitylivingbaseIn;

        if (!ee.isReallyInWater()) {
            if (ee.getIsMoving()) {
                if (ee.getIsFast()) { //Running
                    animRunning(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime);
                } else { //Walking
                    animWalking(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime);
                }
            }
        }
        else {
            //Swimming pose:
            if (!ee.getIsMoving()) { //static in water
                //
            }
            else {
                //moving in water
                //
            }
        }
        if (ee.getAnimation() == ee.EAT_ANIMATION) {
            animEat(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime, ee.getAnimationTick());
        }
        else if (ee.getAnimation() == ee.ATTACK_ANIMATION) {
            animAttack(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime, ee.getAnimationTick());
        }
        else if (ee.getAnimation() == ee.LAY_ANIMATION) {
            animLay(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime, ee.getAnimationTick());
        }
        else if (ee.getAnimation() == ee.MAKE_NEST_ANIMATION) {
            animNest(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime, ee.getAnimationTick());
        }
        else if (ee.getAnimation() == ee.ROAR_ANIMATION) { //The noise anim
            animNoise(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime, ee.getAnimationTick());
        }
        else if (ee.getAnimation() == ee.STAND_ANIMATION) { //The noise anim
            animIdle(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime, ee.getAnimationTick());
        }


    }
    public void animNest(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime, double animTick) {
        EntityPrehistoricFloraTeyujagua entity = (EntityPrehistoricFloraTeyujagua) entitylivingbaseIn;
        int animCycle = 50;
        double tickAnim = animTick + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;


        this.setRotateAngle(Chest, Chest.rotateAngleX + (float) Math.toRadians(0), Chest.rotateAngleY + (float) Math.toRadians(0), Chest.rotateAngleZ + (float) Math.toRadians(0));



        if (tickAnim >= 0 && tickAnim < 5) {
            xx = 3.5 + (((tickAnim - 0) / 5) * (3.48278-(3.5)));
            yy = -9.75 + (((tickAnim - 0) / 5) * (-12.99887-(-9.75)));
            zz = 0 + (((tickAnim - 0) / 5) * (0.08727-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 10) {
            xx = 3.48278 + (((tickAnim - 5) / 5) * (3.97625-(3.48278)));
            yy = -12.99887 + (((tickAnim - 5) / 5) * (-14.49864-(-12.99887)));
            zz = 0.08727 + (((tickAnim - 5) / 5) * (0.11477-(0.08727)));
        }
        else if (tickAnim >= 10 && tickAnim < 18) {
            xx = 3.97625 + (((tickAnim - 10) / 8) * (2.94582-(3.97625)));
            yy = -14.49864 + (((tickAnim - 10) / 8) * (-14.39116-(-14.49864)));
            zz = 0.11477 + (((tickAnim - 10) / 8) * (4.24391-(0.11477)));
        }
        else if (tickAnim >= 18 && tickAnim < 25) {
            xx = 2.94582 + (((tickAnim - 18) / 7) * (3.97625-(2.94582)));
            yy = -14.39116 + (((tickAnim - 18) / 7) * (-14.49864-(-14.39116)));
            zz = 4.24391 + (((tickAnim - 18) / 7) * (0.11477-(4.24391)));
        }
        else if (tickAnim >= 25 && tickAnim < 33) {
            xx = 3.97625 + (((tickAnim - 25) / 8) * (2.94582-(3.97625)));
            yy = -14.49864 + (((tickAnim - 25) / 8) * (-14.39116-(-14.49864)));
            zz = 0.11477 + (((tickAnim - 25) / 8) * (4.24391-(0.11477)));
        }
        else if (tickAnim >= 33 && tickAnim < 40) {
            xx = 2.94582 + (((tickAnim - 33) / 7) * (3.97625-(2.94582)));
            yy = -14.39116 + (((tickAnim - 33) / 7) * (-14.49864-(-14.39116)));
            zz = 4.24391 + (((tickAnim - 33) / 7) * (0.11477-(4.24391)));
        }
        else if (tickAnim >= 40 && tickAnim < 50) {
            xx = 3.97625 + (((tickAnim - 40) / 10) * (3.5-(3.97625)));
            yy = -14.49864 + (((tickAnim - 40) / 10) * (-9.75-(-14.49864)));
            zz = 0.11477 + (((tickAnim - 40) / 10) * (0-(0.11477)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Neck, Neck.rotateAngleX + (float) Math.toRadians(xx), Neck.rotateAngleY + (float) Math.toRadians(yy), Neck.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 5) {
            xx = -1.19947 + (((tickAnim - 0) / 5) * (-1.28372-(-1.19947)));
            yy = -20.18277 + (((tickAnim - 0) / 5) * (-22.17092-(-20.18277)));
            zz = 3.44967 + (((tickAnim - 0) / 5) * (3.68285-(3.44967)));
        }
        else if (tickAnim >= 5 && tickAnim < 18) {
            xx = -1.28372 + (((tickAnim - 5) / 13) * (-1.97133-(-1.28372)));
            yy = -22.17092 + (((tickAnim - 5) / 13) * (-24.51004-(-22.17092)));
            zz = 3.68285 + (((tickAnim - 5) / 13) * (5.34908-(3.68285)));
        }
        else if (tickAnim >= 18 && tickAnim < 40) {
            xx = -1.97133 + (((tickAnim - 18) / 22) * (-1.97133-(-1.97133)));
            yy = -24.51004 + (((tickAnim - 18) / 22) * (-24.51004-(-24.51004)));
            zz = 5.34908 + (((tickAnim - 18) / 22) * (5.34908-(5.34908)));
        }
        else if (tickAnim >= 40 && tickAnim < 50) {
            xx = -1.97133 + (((tickAnim - 40) / 10) * (-1.19947-(-1.97133)));
            yy = -24.51004 + (((tickAnim - 40) / 10) * (-20.18277-(-24.51004)));
            zz = 5.34908 + (((tickAnim - 40) / 10) * (3.44967-(5.34908)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Neck2, Neck2.rotateAngleX + (float) Math.toRadians(xx), Neck2.rotateAngleY + (float) Math.toRadians(yy), Neck2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 0) / 5) * (0-(0)));
            yy = -9.25 + (((tickAnim - 0) / 5) * (-15.25-(-9.25)));
            zz = 0 + (((tickAnim - 0) / 5) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 18) {
            xx = 0 + (((tickAnim - 5) / 13) * (-1.22824-(0)));
            yy = -15.25 + (((tickAnim - 5) / 13) * (-19.51775-(-15.25)));
            zz = 0 + (((tickAnim - 5) / 13) * (3.69952-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 40) {
            xx = -1.22824 + (((tickAnim - 18) / 22) * (-1.22824-(-1.22824)));
            yy = -19.51775 + (((tickAnim - 18) / 22) * (-19.51775-(-19.51775)));
            zz = 3.69952 + (((tickAnim - 18) / 22) * (3.69952-(3.69952)));
        }
        else if (tickAnim >= 40 && tickAnim < 50) {
            xx = -1.22824 + (((tickAnim - 40) / 10) * (0-(-1.22824)));
            yy = -19.51775 + (((tickAnim - 40) / 10) * (-9.25-(-19.51775)));
            zz = 3.69952 + (((tickAnim - 40) / 10) * (0-(3.69952)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Head, Head.rotateAngleX + (float) Math.toRadians(xx), Head.rotateAngleY + (float) Math.toRadians(yy), Head.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 0) / 5) * (-14.33068-(0)));
            yy = 0 + (((tickAnim - 0) / 5) * (7.01129-(0)));
            zz = 0 + (((tickAnim - 0) / 5) * (-0.70068-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 10) {
            xx = -14.33068 + (((tickAnim - 5) / 5) * (-8.66137-(-14.33068)));
            yy = 7.01129 + (((tickAnim - 5) / 5) * (14.02257-(7.01129)));
            zz = -0.70068 + (((tickAnim - 5) / 5) * (-1.40137-(-0.70068)));
        }
        else if (tickAnim >= 10 && tickAnim < 18) {
            xx = -8.66137 + (((tickAnim - 10) / 8) * (36.58863-(-8.66137)));
            yy = 14.02257 + (((tickAnim - 10) / 8) * (14.02257-(14.02257)));
            zz = -1.40137 + (((tickAnim - 10) / 8) * (-1.40137-(-1.40137)));
        }
        else if (tickAnim >= 18 && tickAnim < 25) {
            xx = 36.58863 + (((tickAnim - 18) / 7) * (-8.66137-(36.58863)));
            yy = 14.02257 + (((tickAnim - 18) / 7) * (14.02257-(14.02257)));
            zz = -1.40137 + (((tickAnim - 18) / 7) * (-1.40137-(-1.40137)));
        }
        else if (tickAnim >= 25 && tickAnim < 33) {
            xx = -8.66137 + (((tickAnim - 25) / 8) * (36.58863-(-8.66137)));
            yy = 14.02257 + (((tickAnim - 25) / 8) * (14.02257-(14.02257)));
            zz = -1.40137 + (((tickAnim - 25) / 8) * (-1.40137-(-1.40137)));
        }
        else if (tickAnim >= 33 && tickAnim < 40) {
            xx = 36.58863 + (((tickAnim - 33) / 7) * (-8.66137-(36.58863)));
            yy = 14.02257 + (((tickAnim - 33) / 7) * (14.02257-(14.02257)));
            zz = -1.40137 + (((tickAnim - 33) / 7) * (-1.40137-(-1.40137)));
        }
        else if (tickAnim >= 40 && tickAnim < 48) {
            xx = -8.66137 + (((tickAnim - 40) / 8) * (36.58863-(-8.66137)));
            yy = 14.02257 + (((tickAnim - 40) / 8) * (14.02257-(14.02257)));
            zz = -1.40137 + (((tickAnim - 40) / 8) * (-1.40137-(-1.40137)));
        }
        else if (tickAnim >= 48 && tickAnim < 50) {
            xx = 36.58863 + (((tickAnim - 48) / 2) * (0-(36.58863)));
            yy = 14.02257 + (((tickAnim - 48) / 2) * (0-(14.02257)));
            zz = -1.40137 + (((tickAnim - 48) / 2) * (0-(-1.40137)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(LeftLeg, LeftLeg.rotateAngleX + (float) Math.toRadians(xx), LeftLeg.rotateAngleY + (float) Math.toRadians(yy), LeftLeg.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 0) / 5) * (12.13-(0)));
            yy = 0 + (((tickAnim - 0) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 5) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 10) {
            xx = 12.13 + (((tickAnim - 5) / 5) * (-8.75-(12.13)));
            yy = 0 + (((tickAnim - 5) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 5) / 5) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 18) {
            xx = -8.75 + (((tickAnim - 10) / 8) * (32.75-(-8.75)));
            yy = 0 + (((tickAnim - 10) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 8) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 22) {
            xx = 32.75 + (((tickAnim - 18) / 4) * (-0.06-(32.75)));
            yy = 0 + (((tickAnim - 18) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 18) / 4) * (0-(0)));
        }
        else if (tickAnim >= 22 && tickAnim < 25) {
            xx = -0.06 + (((tickAnim - 22) / 3) * (-8.75-(-0.06)));
            yy = 0 + (((tickAnim - 22) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 22) / 3) * (0-(0)));
        }
        else if (tickAnim >= 25 && tickAnim < 33) {
            xx = -8.75 + (((tickAnim - 25) / 8) * (32.75-(-8.75)));
            yy = 0 + (((tickAnim - 25) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 25) / 8) * (0-(0)));
        }
        else if (tickAnim >= 33 && tickAnim < 37) {
            xx = 32.75 + (((tickAnim - 33) / 4) * (-0.06-(32.75)));
            yy = 0 + (((tickAnim - 33) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 33) / 4) * (0-(0)));
        }
        else if (tickAnim >= 37 && tickAnim < 40) {
            xx = -0.06 + (((tickAnim - 37) / 3) * (-8.75-(-0.06)));
            yy = 0 + (((tickAnim - 37) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 37) / 3) * (0-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 48) {
            xx = -8.75 + (((tickAnim - 40) / 8) * (32.75-(-8.75)));
            yy = 0 + (((tickAnim - 40) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 40) / 8) * (0-(0)));
        }
        else if (tickAnim >= 48 && tickAnim < 50) {
            xx = 32.75 + (((tickAnim - 48) / 2) * (0-(32.75)));
            yy = 0 + (((tickAnim - 48) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 48) / 2) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(LeftLeg2, LeftLeg2.rotateAngleX + (float) Math.toRadians(xx), LeftLeg2.rotateAngleY + (float) Math.toRadians(yy), LeftLeg2.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 10) * (-0.475-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 18) {
            xx = 0 + (((tickAnim - 10) / 8) * (0-(0)));
            yy = -0.475 + (((tickAnim - 10) / 8) * (0-(-0.475)));
            zz = 0 + (((tickAnim - 10) / 8) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 22) {
            xx = 0 + (((tickAnim - 18) / 4) * (0-(0)));
            yy = 0 + (((tickAnim - 18) / 4) * (0.865-(0)));
            zz = 0 + (((tickAnim - 18) / 4) * (0-(0)));
        }
        else if (tickAnim >= 22 && tickAnim < 25) {
            xx = 0 + (((tickAnim - 22) / 3) * (0-(0)));
            yy = 0.865 + (((tickAnim - 22) / 3) * (-0.475-(0.865)));
            zz = 0 + (((tickAnim - 22) / 3) * (0-(0)));
        }
        else if (tickAnim >= 25 && tickAnim < 33) {
            xx = 0 + (((tickAnim - 25) / 8) * (0-(0)));
            yy = -0.475 + (((tickAnim - 25) / 8) * (0-(-0.475)));
            zz = 0 + (((tickAnim - 25) / 8) * (0-(0)));
        }
        else if (tickAnim >= 33 && tickAnim < 37) {
            xx = 0 + (((tickAnim - 33) / 4) * (0-(0)));
            yy = 0 + (((tickAnim - 33) / 4) * (0.865-(0)));
            zz = 0 + (((tickAnim - 33) / 4) * (0-(0)));
        }
        else if (tickAnim >= 37 && tickAnim < 40) {
            xx = 0 + (((tickAnim - 37) / 3) * (0-(0)));
            yy = 0.865 + (((tickAnim - 37) / 3) * (-0.475-(0.865)));
            zz = 0 + (((tickAnim - 37) / 3) * (0-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 48) {
            xx = 0 + (((tickAnim - 40) / 8) * (0-(0)));
            yy = -0.475 + (((tickAnim - 40) / 8) * (0-(-0.475)));
            zz = 0 + (((tickAnim - 40) / 8) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.LeftLeg2.rotationPointX = this.LeftLeg2.rotationPointX + (float)(xx);
        this.LeftLeg2.rotationPointY = this.LeftLeg2.rotationPointY - (float)(yy);
        this.LeftLeg2.rotationPointZ = this.LeftLeg2.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 0) / 5) * (19.5-(0)));
            yy = 0 + (((tickAnim - 0) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 5) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 10) {
            xx = 19.5 + (((tickAnim - 5) / 5) * (17.5-(19.5)));
            yy = 0 + (((tickAnim - 5) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 5) / 5) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 14) {
            xx = 17.5 + (((tickAnim - 10) / 4) * (-18.36-(17.5)));
            yy = 0 + (((tickAnim - 10) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 4) * (0-(0)));
        }
        else if (tickAnim >= 14 && tickAnim < 18) {
            xx = -18.36 + (((tickAnim - 14) / 4) * (49.25-(-18.36)));
            yy = 0 + (((tickAnim - 14) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 14) / 4) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 22) {
            xx = 49.25 + (((tickAnim - 18) / 4) * (20.61-(49.25)));
            yy = 0 + (((tickAnim - 18) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 18) / 4) * (0-(0)));
        }
        else if (tickAnim >= 22 && tickAnim < 25) {
            xx = 20.61 + (((tickAnim - 22) / 3) * (17.5-(20.61)));
            yy = 0 + (((tickAnim - 22) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 22) / 3) * (0-(0)));
        }
        else if (tickAnim >= 25 && tickAnim < 29) {
            xx = 17.5 + (((tickAnim - 25) / 4) * (-18.36-(17.5)));
            yy = 0 + (((tickAnim - 25) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 25) / 4) * (0-(0)));
        }
        else if (tickAnim >= 29 && tickAnim < 33) {
            xx = -18.36 + (((tickAnim - 29) / 4) * (49.25-(-18.36)));
            yy = 0 + (((tickAnim - 29) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 29) / 4) * (0-(0)));
        }
        else if (tickAnim >= 33 && tickAnim < 37) {
            xx = 49.25 + (((tickAnim - 33) / 4) * (20.61-(49.25)));
            yy = 0 + (((tickAnim - 33) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 33) / 4) * (0-(0)));
        }
        else if (tickAnim >= 37 && tickAnim < 40) {
            xx = 20.61 + (((tickAnim - 37) / 3) * (17.5-(20.61)));
            yy = 0 + (((tickAnim - 37) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 37) / 3) * (0-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 44) {
            xx = 17.5 + (((tickAnim - 40) / 4) * (-18.36-(17.5)));
            yy = 0 + (((tickAnim - 40) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 40) / 4) * (0-(0)));
        }
        else if (tickAnim >= 44 && tickAnim < 48) {
            xx = -18.36 + (((tickAnim - 44) / 4) * (49.25-(-18.36)));
            yy = 0 + (((tickAnim - 44) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 44) / 4) * (0-(0)));
        }
        else if (tickAnim >= 48 && tickAnim < 50) {
            xx = 49.25 + (((tickAnim - 48) / 2) * (0-(49.25)));
            yy = 0 + (((tickAnim - 48) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 48) / 2) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(LeftLegFoot, LeftLegFoot.rotateAngleX + (float) Math.toRadians(xx), LeftLegFoot.rotateAngleY + (float) Math.toRadians(yy), LeftLegFoot.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 10) * (-0.15-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 18) {
            xx = 0 + (((tickAnim - 10) / 8) * (0-(0)));
            yy = -0.15 + (((tickAnim - 10) / 8) * (0-(-0.15)));
            zz = 0 + (((tickAnim - 10) / 8) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 22) {
            xx = 0 + (((tickAnim - 18) / 4) * (0-(0)));
            yy = 0 + (((tickAnim - 18) / 4) * (2.025-(0)));
            zz = 0 + (((tickAnim - 18) / 4) * (0-(0)));
        }
        else if (tickAnim >= 22 && tickAnim < 25) {
            xx = 0 + (((tickAnim - 22) / 3) * (0-(0)));
            yy = 2.025 + (((tickAnim - 22) / 3) * (-0.15-(2.025)));
            zz = 0 + (((tickAnim - 22) / 3) * (0-(0)));
        }
        else if (tickAnim >= 25 && tickAnim < 33) {
            xx = 0 + (((tickAnim - 25) / 8) * (0-(0)));
            yy = -0.15 + (((tickAnim - 25) / 8) * (0-(-0.15)));
            zz = 0 + (((tickAnim - 25) / 8) * (0-(0)));
        }
        else if (tickAnim >= 33 && tickAnim < 37) {
            xx = 0 + (((tickAnim - 33) / 4) * (0-(0)));
            yy = 0 + (((tickAnim - 33) / 4) * (2.025-(0)));
            zz = 0 + (((tickAnim - 33) / 4) * (0-(0)));
        }
        else if (tickAnim >= 37 && tickAnim < 40) {
            xx = 0 + (((tickAnim - 37) / 3) * (0-(0)));
            yy = 2.025 + (((tickAnim - 37) / 3) * (-0.15-(2.025)));
            zz = 0 + (((tickAnim - 37) / 3) * (0-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 48) {
            xx = 0 + (((tickAnim - 40) / 8) * (0-(0)));
            yy = -0.15 + (((tickAnim - 40) / 8) * (0-(-0.15)));
            zz = 0 + (((tickAnim - 40) / 8) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.LeftLegFoot.rotationPointX = this.LeftLegFoot.rotationPointX + (float)(xx);
        this.LeftLegFoot.rotationPointY = this.LeftLegFoot.rotationPointY - (float)(yy);
        this.LeftLegFoot.rotationPointZ = this.LeftLegFoot.rotationPointZ + (float)(zz);

    }

    public void animLay(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime, double animTick) {
        EntityPrehistoricFloraTeyujagua entity = (EntityPrehistoricFloraTeyujagua) entitylivingbaseIn;
        int animCycle = 50;
        double tickAnim = animTick + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;
         if (tickAnim >= 0 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 0) / 15) * (-7.25-(0)));
            yy = 0 + (((tickAnim - 0) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 15) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 35) {
            xx = -7.25 + (((tickAnim - 15) / 20) * (-7.25-(-7.25)));
            yy = 0 + (((tickAnim - 15) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 20) * (0-(0)));
        }
        else if (tickAnim >= 35 && tickAnim < 50) {
            xx = -7.25 + (((tickAnim - 35) / 15) * (0-(-7.25)));
            yy = 0 + (((tickAnim - 35) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 35) / 15) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Base, Base.rotateAngleX + (float) Math.toRadians(xx), Base.rotateAngleY + (float) Math.toRadians(yy), Base.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 0) / 15) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 15) * (-2.875-(0)));
            zz = 0 + (((tickAnim - 0) / 15) * (0.75-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 35) {
            xx = 0 + (((tickAnim - 15) / 20) * (0-(0)));
            yy = -2.875 + (((tickAnim - 15) / 20) * (-2.875-(-2.875)));
            zz = 0.75 + (((tickAnim - 15) / 20) * (0.75-(0.75)));
        }
        else if (tickAnim >= 35 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 35) / 15) * (0-(0)));
            yy = -2.875 + (((tickAnim - 35) / 15) * (0-(-2.875)));
            zz = 0.75 + (((tickAnim - 35) / 15) * (0-(0.75)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.Base.rotationPointX = this.Base.rotationPointX + (float)(xx);
        this.Base.rotationPointY = this.Base.rotationPointY - (float)(yy);
        this.Base.rotationPointZ = this.Base.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 0) / 15) * (3.5-(0)));
            yy = 0 + (((tickAnim - 0) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 15) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 35) {
            xx = 3.5 + (((tickAnim - 15) / 20) * (3.5-(3.5)));
            yy = 0 + (((tickAnim - 15) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 20) * (0-(0)));
        }
        else if (tickAnim >= 35 && tickAnim < 50) {
            xx = 3.5 + (((tickAnim - 35) / 15) * (0-(3.5)));
            yy = 0 + (((tickAnim - 35) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 35) / 15) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Body, Body.rotateAngleX + (float) Math.toRadians(xx), Body.rotateAngleY + (float) Math.toRadians(yy), Body.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 0) / 15) * (3.5-(0)));
            yy = 0 + (((tickAnim - 0) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 15) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 35) {
            xx = 3.5 + (((tickAnim - 15) / 20) * (3.5-(3.5)));
            yy = 0 + (((tickAnim - 15) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 20) * (0-(0)));
        }
        else if (tickAnim >= 35 && tickAnim < 50) {
            xx = 3.5 + (((tickAnim - 35) / 15) * (0-(3.5)));
            yy = 0 + (((tickAnim - 35) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 35) / 15) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Chest, Chest.rotateAngleX + (float) Math.toRadians(xx), Chest.rotateAngleY + (float) Math.toRadians(yy), Chest.rotateAngleZ + (float) Math.toRadians(zz));



        this.setRotateAngle(Neck, Neck.rotateAngleX + (float) Math.toRadians(0), Neck.rotateAngleY + (float) Math.toRadians(0), Neck.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(Neck2, Neck2.rotateAngleX + (float) Math.toRadians(0), Neck2.rotateAngleY + (float) Math.toRadians(0), Neck2.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(Head, Head.rotateAngleX + (float) Math.toRadians(0), Head.rotateAngleY + (float) Math.toRadians(0), Head.rotateAngleZ + (float) Math.toRadians(0));



        if (tickAnim >= 0 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 0) / 15) * (14-(0)));
            yy = 0 + (((tickAnim - 0) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 15) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 35) {
            xx = 14 + (((tickAnim - 15) / 20) * (14-(14)));
            yy = 0 + (((tickAnim - 15) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 20) * (0-(0)));
        }
        else if (tickAnim >= 35 && tickAnim < 50) {
            xx = 14 + (((tickAnim - 35) / 15) * (0-(14)));
            yy = 0 + (((tickAnim - 35) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 35) / 15) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(RightArm, RightArm.rotateAngleX + (float) Math.toRadians(xx), RightArm.rotateAngleY + (float) Math.toRadians(yy), RightArm.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 0) / 15) * (-13.5-(0)));
            yy = 0 + (((tickAnim - 0) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 15) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 35) {
            xx = -13.5 + (((tickAnim - 15) / 20) * (-13.5-(-13.5)));
            yy = 0 + (((tickAnim - 15) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 20) * (0-(0)));
        }
        else if (tickAnim >= 35 && tickAnim < 50) {
            xx = -13.5 + (((tickAnim - 35) / 15) * (0-(-13.5)));
            yy = 0 + (((tickAnim - 35) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 35) / 15) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(RightArm2, RightArm2.rotateAngleX + (float) Math.toRadians(xx), RightArm2.rotateAngleY + (float) Math.toRadians(yy), RightArm2.rotateAngleZ + (float) Math.toRadians(zz));



        this.setRotateAngle(RightArmHand, RightArmHand.rotateAngleX + (float) Math.toRadians(0), RightArmHand.rotateAngleY + (float) Math.toRadians(0), RightArmHand.rotateAngleZ + (float) Math.toRadians(0));



        if (tickAnim >= 0 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 0) / 15) * (14-(0)));
            yy = 0 + (((tickAnim - 0) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 15) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 35) {
            xx = 14 + (((tickAnim - 15) / 20) * (14-(14)));
            yy = 0 + (((tickAnim - 15) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 20) * (0-(0)));
        }
        else if (tickAnim >= 35 && tickAnim < 50) {
            xx = 14 + (((tickAnim - 35) / 15) * (0-(14)));
            yy = 0 + (((tickAnim - 35) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 35) / 15) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(LeftArm, LeftArm.rotateAngleX + (float) Math.toRadians(xx), LeftArm.rotateAngleY + (float) Math.toRadians(yy), LeftArm.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 0) / 15) * (-13.5-(0)));
            yy = 0 + (((tickAnim - 0) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 15) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 35) {
            xx = -13.5 + (((tickAnim - 15) / 20) * (-13.5-(-13.5)));
            yy = 0 + (((tickAnim - 15) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 20) * (0-(0)));
        }
        else if (tickAnim >= 35 && tickAnim < 50) {
            xx = -13.5 + (((tickAnim - 35) / 15) * (0-(-13.5)));
            yy = 0 + (((tickAnim - 35) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 35) / 15) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(LeftArm2, LeftArm2.rotateAngleX + (float) Math.toRadians(xx), LeftArm2.rotateAngleY + (float) Math.toRadians(yy), LeftArm2.rotateAngleZ + (float) Math.toRadians(zz));



        this.setRotateAngle(LeftArmHand, LeftArmHand.rotateAngleX + (float) Math.toRadians(0), LeftArmHand.rotateAngleY + (float) Math.toRadians(0), LeftArmHand.rotateAngleZ + (float) Math.toRadians(0));



        if (tickAnim >= 0 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 0) / 15) * (-21.75-(0)));
            yy = 0 + (((tickAnim - 0) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 15) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 35) {
            xx = -21.75 + (((tickAnim - 15) / 20) * (-21.75-(-21.75)));
            yy = 0 + (((tickAnim - 15) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 20) * (0-(0)));
        }
        else if (tickAnim >= 35 && tickAnim < 50) {
            xx = -21.75 + (((tickAnim - 35) / 15) * (0-(-21.75)));
            yy = 0 + (((tickAnim - 35) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 35) / 15) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(RightLeg, RightLeg.rotateAngleX + (float) Math.toRadians(xx), RightLeg.rotateAngleY + (float) Math.toRadians(yy), RightLeg.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 0) / 15) * (35.25-(0)));
            yy = 0 + (((tickAnim - 0) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 15) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 35) {
            xx = 35.25 + (((tickAnim - 15) / 20) * (35.25-(35.25)));
            yy = 0 + (((tickAnim - 15) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 20) * (0-(0)));
        }
        else if (tickAnim >= 35 && tickAnim < 50) {
            xx = 35.25 + (((tickAnim - 35) / 15) * (0-(35.25)));
            yy = 0 + (((tickAnim - 35) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 35) / 15) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(RightLeg2, RightLeg2.rotateAngleX + (float) Math.toRadians(xx), RightLeg2.rotateAngleY + (float) Math.toRadians(yy), RightLeg2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 0) / 15) * (-7.01452-(0)));
            yy = 0 + (((tickAnim - 0) / 15) * (-0.24362-(0)));
            zz = 0 + (((tickAnim - 0) / 15) * (2.7352-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 35) {
            xx = -7.01452 + (((tickAnim - 15) / 20) * (-7.01452-(-7.01452)));
            yy = -0.24362 + (((tickAnim - 15) / 20) * (-0.24362-(-0.24362)));
            zz = 2.7352 + (((tickAnim - 15) / 20) * (2.7352-(2.7352)));
        }
        else if (tickAnim >= 35 && tickAnim < 50) {
            xx = -7.01452 + (((tickAnim - 35) / 15) * (0-(-7.01452)));
            yy = -0.24362 + (((tickAnim - 35) / 15) * (0-(-0.24362)));
            zz = 2.7352 + (((tickAnim - 35) / 15) * (0-(2.7352)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(RightLegFoot, RightLegFoot.rotateAngleX + (float) Math.toRadians(xx), RightLegFoot.rotateAngleY + (float) Math.toRadians(yy), RightLegFoot.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 0) / 15) * (-21.75-(0)));
            yy = 0 + (((tickAnim - 0) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 15) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 35) {
            xx = -21.75 + (((tickAnim - 15) / 20) * (-21.75-(-21.75)));
            yy = 0 + (((tickAnim - 15) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 20) * (0-(0)));
        }
        else if (tickAnim >= 35 && tickAnim < 50) {
            xx = -21.75 + (((tickAnim - 35) / 15) * (0-(-21.75)));
            yy = 0 + (((tickAnim - 35) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 35) / 15) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(LeftLeg, LeftLeg.rotateAngleX + (float) Math.toRadians(xx), LeftLeg.rotateAngleY + (float) Math.toRadians(yy), LeftLeg.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 0) / 15) * (35.25-(0)));
            yy = 0 + (((tickAnim - 0) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 15) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 35) {
            xx = 35.25 + (((tickAnim - 15) / 20) * (35.25-(35.25)));
            yy = 0 + (((tickAnim - 15) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 20) * (0-(0)));
        }
        else if (tickAnim >= 35 && tickAnim < 50) {
            xx = 35.25 + (((tickAnim - 35) / 15) * (0-(35.25)));
            yy = 0 + (((tickAnim - 35) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 35) / 15) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(LeftLeg2, LeftLeg2.rotateAngleX + (float) Math.toRadians(xx), LeftLeg2.rotateAngleY + (float) Math.toRadians(yy), LeftLeg2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 0) / 15) * (-7.01452-(0)));
            yy = 0 + (((tickAnim - 0) / 15) * (-0.24362-(0)));
            zz = 0 + (((tickAnim - 0) / 15) * (-2.73516-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 35) {
            xx = -7.01452 + (((tickAnim - 15) / 20) * (-7.01452-(-7.01452)));
            yy = -0.24362 + (((tickAnim - 15) / 20) * (-0.24362-(-0.24362)));
            zz = -2.73516 + (((tickAnim - 15) / 20) * (-2.73516-(-2.73516)));
        }
        else if (tickAnim >= 35 && tickAnim < 50) {
            xx = -7.01452 + (((tickAnim - 35) / 15) * (0-(-7.01452)));
            yy = -0.24362 + (((tickAnim - 35) / 15) * (0-(-0.24362)));
            zz = -2.73516 + (((tickAnim - 35) / 15) * (0-(-2.73516)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(LeftLegFoot, LeftLegFoot.rotateAngleX + (float) Math.toRadians(xx), LeftLegFoot.rotateAngleY + (float) Math.toRadians(yy), LeftLegFoot.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 0) / 15) * (5-(0)));
            yy = 0 + (((tickAnim - 0) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 15) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 35) {
            xx = 5 + (((tickAnim - 15) / 20) * (5-(5)));
            yy = 0 + (((tickAnim - 15) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 20) * (0-(0)));
        }
        else if (tickAnim >= 35 && tickAnim < 50) {
            xx = 5 + (((tickAnim - 35) / 15) * (0-(5)));
            yy = 0 + (((tickAnim - 35) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 35) / 15) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Tail, Tail.rotateAngleX + (float) Math.toRadians(xx), Tail.rotateAngleY + (float) Math.toRadians(yy), Tail.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 0) / 15) * (6.5-(0)));
            yy = 0 + (((tickAnim - 0) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 15) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 35) {
            xx = 6.5 + (((tickAnim - 15) / 20) * (6.5-(6.5)));
            yy = 0 + (((tickAnim - 15) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 20) * (0-(0)));
        }
        else if (tickAnim >= 35 && tickAnim < 50) {
            xx = 6.5 + (((tickAnim - 35) / 15) * (0-(6.5)));
            yy = 0 + (((tickAnim - 35) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 35) / 15) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Tail2, Tail2.rotateAngleX + (float) Math.toRadians(xx), Tail2.rotateAngleY + (float) Math.toRadians(yy), Tail2.rotateAngleZ + (float) Math.toRadians(zz));

    }

    public void animNoise(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime, double animTick) {
        EntityPrehistoricFloraTeyujagua entity = (EntityPrehistoricFloraTeyujagua) entitylivingbaseIn;
        int animCycle = 15;
        double tickAnim = animTick + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;
         if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 0) / 10) * (0.5-(0)));
            yy = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 15) {
            xx = 0.5 + (((tickAnim - 10) / 5) * (0-(0.5)));
            yy = 0 + (((tickAnim - 10) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 5) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Neck, Neck.rotateAngleX + (float) Math.toRadians(xx), Neck.rotateAngleY + (float) Math.toRadians(yy), Neck.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 0) / 10) * (0.5-(0)));
            yy = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 15) {
            xx = 0.5 + (((tickAnim - 10) / 5) * (0-(0.5)));
            yy = 0 + (((tickAnim - 10) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 5) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Neck2, Neck2.rotateAngleX + (float) Math.toRadians(xx), Neck2.rotateAngleY + (float) Math.toRadians(yy), Neck2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 0) / 10) * (-3.75-(0)));
            yy = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 15) {
            xx = -3.75 + (((tickAnim - 10) / 5) * (0-(-3.75)));
            yy = 0 + (((tickAnim - 10) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 5) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Head, Head.rotateAngleX + (float) Math.toRadians(xx), Head.rotateAngleY + (float) Math.toRadians(yy), Head.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 0) / 10) * (17.5-(0)));
            yy = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 15) {
            xx = 17.5 + (((tickAnim - 10) / 5) * (0-(17.5)));
            yy = 0 + (((tickAnim - 10) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 5) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Jaw, Jaw.rotateAngleX + (float) Math.toRadians(xx), Jaw.rotateAngleY + (float) Math.toRadians(yy), Jaw.rotateAngleZ + (float) Math.toRadians(zz));

    }

    public void animEat(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime, double animTick) {
        EntityPrehistoricFloraTeyujagua entity = (EntityPrehistoricFloraTeyujagua) entitylivingbaseIn;
        int animCycle = 20;
        double tickAnim = animTick + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;
         if (tickAnim >= 0 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 0) / 8) * (7.5-(0)));
            yy = 0 + (((tickAnim - 0) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 8) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 11) {
            xx = 7.5 + (((tickAnim - 8) / 3) * (8-(7.5)));
            yy = 0 + (((tickAnim - 8) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 3) * (0-(0)));
        }
        else if (tickAnim >= 11 && tickAnim < 14) {
            xx = 8 + (((tickAnim - 11) / 3) * (3-(8)));
            yy = 0 + (((tickAnim - 11) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 11) / 3) * (0-(0)));
        }
        else if (tickAnim >= 14 && tickAnim < 20) {
            xx = 3 + (((tickAnim - 14) / 6) * (0-(3)));
            yy = 0 + (((tickAnim - 14) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 14) / 6) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Neck, Neck.rotateAngleX + (float) Math.toRadians(xx), Neck.rotateAngleY + (float) Math.toRadians(yy), Neck.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 0) / 8) * (11.25-(0)));
            yy = 0 + (((tickAnim - 0) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 8) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 11) {
            xx = 11.25 + (((tickAnim - 8) / 3) * (18.5-(11.25)));
            yy = 0 + (((tickAnim - 8) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 3) * (0-(0)));
        }
        else if (tickAnim >= 11 && tickAnim < 14) {
            xx = 18.5 + (((tickAnim - 11) / 3) * (23.75-(18.5)));
            yy = 0 + (((tickAnim - 11) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 11) / 3) * (0-(0)));
        }
        else if (tickAnim >= 14 && tickAnim < 20) {
            xx = 23.75 + (((tickAnim - 14) / 6) * (0-(23.75)));
            yy = 0 + (((tickAnim - 14) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 14) / 6) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Neck2, Neck2.rotateAngleX + (float) Math.toRadians(xx), Neck2.rotateAngleY + (float) Math.toRadians(yy), Neck2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 4) {
            xx = 0 + (((tickAnim - 0) / 4) * (23.22-(0)));
            yy = 0 + (((tickAnim - 0) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 4) * (0-(0)));
        }
        else if (tickAnim >= 4 && tickAnim < 8) {
            xx = 23.22 + (((tickAnim - 4) / 4) * (24.25-(23.22)));
            yy = 0 + (((tickAnim - 4) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 4) / 4) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 11) {
            xx = 24.25 + (((tickAnim - 8) / 3) * (17-(24.25)));
            yy = 0 + (((tickAnim - 8) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 3) * (0-(0)));
        }
        else if (tickAnim >= 11 && tickAnim < 14) {
            xx = 17 + (((tickAnim - 11) / 3) * (23.75-(17)));
            yy = 0 + (((tickAnim - 11) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 11) / 3) * (0-(0)));
        }
        else if (tickAnim >= 14 && tickAnim < 20) {
            xx = 23.75 + (((tickAnim - 14) / 6) * (0-(23.75)));
            yy = 0 + (((tickAnim - 14) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 14) / 6) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Head, Head.rotateAngleX + (float) Math.toRadians(xx), Head.rotateAngleY + (float) Math.toRadians(yy), Head.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 0) / 8) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 8) * (0.25-(0)));
            zz = 0 + (((tickAnim - 0) / 8) * (0.275-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 8) / 12) * (0-(0)));
            yy = 0.25 + (((tickAnim - 8) / 12) * (0-(0.25)));
            zz = 0.275 + (((tickAnim - 8) / 12) * (0-(0.275)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.Head.rotationPointX = this.Head.rotationPointX + (float)(xx);
        this.Head.rotationPointY = this.Head.rotationPointY - (float)(yy);
        this.Head.rotationPointZ = this.Head.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 0) / 8) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 8) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 11) {
            xx = 0 + (((tickAnim - 8) / 3) * (15.5-(0)));
            yy = 0 + (((tickAnim - 8) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 3) * (0-(0)));
        }
        else if (tickAnim >= 11 && tickAnim < 14) {
            xx = 15.5 + (((tickAnim - 11) / 3) * (0-(15.5)));
            yy = 0 + (((tickAnim - 11) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 11) / 3) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Jaw, Jaw.rotateAngleX + (float) Math.toRadians(xx), Jaw.rotateAngleY + (float) Math.toRadians(yy), Jaw.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 1 + (((tickAnim - 0) / 3) * (1-(1)));
            yy = 1 + (((tickAnim - 0) / 3) * (-0.005-(1)));
            zz = 1 + (((tickAnim - 0) / 3) * (1-(1)));
        }
        else if (tickAnim >= 3 && tickAnim < 5) {
            xx = 1 + (((tickAnim - 3) / 2) * (1-(1)));
            yy = -0.005 + (((tickAnim - 3) / 2) * (1-(-0.005)));
            zz = 1 + (((tickAnim - 3) / 2) * (1-(1)));
        }
        else {
            xx = 1;
            yy = 1;
            zz = 1;
        }
        this.eye.setScale((float)xx, (float)yy, (float)zz);

    }

    public void animAttack(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime, double animTick) {
        EntityPrehistoricFloraTeyujagua entity = (EntityPrehistoricFloraTeyujagua) entitylivingbaseIn;
        int animCycle = 15;
        double tickAnim = animTick + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;
         if (tickAnim >= 0 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 0) / 5) * (7.25-(0)));
            yy = 0 + (((tickAnim - 0) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 5) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 10) {
            xx = 7.25 + (((tickAnim - 5) / 5) * (-5.25-(7.25)));
            yy = 0 + (((tickAnim - 5) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 5) / 5) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 12) {
            xx = -5.25 + (((tickAnim - 10) / 2) * (0-(-5.25)));
            yy = 0 + (((tickAnim - 10) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 2) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Neck, Neck.rotateAngleX + (float) Math.toRadians(xx), Neck.rotateAngleY + (float) Math.toRadians(yy), Neck.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 0) / 5) * (-6-(0)));
            yy = 0 + (((tickAnim - 0) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 5) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 10) {
            xx = -6 + (((tickAnim - 5) / 5) * (8-(-6)));
            yy = 0 + (((tickAnim - 5) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 5) / 5) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 12) {
            xx = 8 + (((tickAnim - 10) / 2) * (0-(8)));
            yy = 0 + (((tickAnim - 10) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 2) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Neck2, Neck2.rotateAngleX + (float) Math.toRadians(xx), Neck2.rotateAngleY + (float) Math.toRadians(yy), Neck2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 0) / 5) * (-3.25-(0)));
            yy = 0 + (((tickAnim - 0) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 5) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 10) {
            xx = -3.25 + (((tickAnim - 5) / 5) * (-1.75-(-3.25)));
            yy = 0 + (((tickAnim - 5) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 5) / 5) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 12) {
            xx = -1.75 + (((tickAnim - 10) / 2) * (-3.5-(-1.75)));
            yy = 0 + (((tickAnim - 10) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 2) * (0-(0)));
        }
        else if (tickAnim >= 12 && tickAnim < 15) {
            xx = -3.5 + (((tickAnim - 12) / 3) * (0-(-3.5)));
            yy = 0 + (((tickAnim - 12) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 12) / 3) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Head, Head.rotateAngleX + (float) Math.toRadians(xx), Head.rotateAngleY + (float) Math.toRadians(yy), Head.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 0) / 5) * (4-(0)));
            yy = 0 + (((tickAnim - 0) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 5) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 10) {
            xx = 4 + (((tickAnim - 5) / 5) * (29.5-(4)));
            yy = 0 + (((tickAnim - 5) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 5) / 5) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 12) {
            xx = 29.5 + (((tickAnim - 10) / 2) * (0-(29.5)));
            yy = 0 + (((tickAnim - 10) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 2) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Jaw, Jaw.rotateAngleX + (float) Math.toRadians(xx), Jaw.rotateAngleY + (float) Math.toRadians(yy), Jaw.rotateAngleZ + (float) Math.toRadians(zz));

    }

    public void animIdle(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime, double animTick) {
        EntityPrehistoricFloraTeyujagua entity = (EntityPrehistoricFloraTeyujagua) entitylivingbaseIn;
        int animCycle = 395;
        double tickAnim = animTick + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;
         if (tickAnim >= 0 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 0) / 15) * (-9-(0)));
            yy = 0 + (((tickAnim - 0) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 15) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 35) {
            xx = -9 + (((tickAnim - 15) / 20) * (0-(-9)));
            yy = 0 + (((tickAnim - 15) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 20) * (0-(0)));
        }
        else if (tickAnim >= 35 && tickAnim < 373) {
            xx = 0 + (((tickAnim - 35) / 338) * (0-(0)));
            yy = 0 + (((tickAnim - 35) / 338) * (0-(0)));
            zz = 0 + (((tickAnim - 35) / 338) * (0-(0)));
        }
        else if (tickAnim >= 373 && tickAnim < 383) {
            xx = 0 + (((tickAnim - 373) / 10) * (-7.5-(0)));
            yy = 0 + (((tickAnim - 373) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 373) / 10) * (0-(0)));
        }
        else if (tickAnim >= 383 && tickAnim < 395) {
            xx = -7.5 + (((tickAnim - 383) / 12) * (0-(-7.5)));
            yy = 0 + (((tickAnim - 383) / 12) * (0-(0)));
            zz = 0 + (((tickAnim - 383) / 12) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Base, Base.rotateAngleX + (float) Math.toRadians(xx), Base.rotateAngleY + (float) Math.toRadians(yy), Base.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 0) / 15) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 15) * (-3.3-(0)));
            zz = 0 + (((tickAnim - 0) / 15) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 35) {
            xx = 0 + (((tickAnim - 15) / 20) * (0-(0)));
            yy = -3.3 + (((tickAnim - 15) / 20) * (-5.05-(-3.3)));
            zz = 0 + (((tickAnim - 15) / 20) * (0-(0)));
        }
        else if (tickAnim >= 35 && tickAnim < 373) {
            xx = 0 + (((tickAnim - 35) / 338) * (0-(0)));
            yy = -5.05 + (((tickAnim - 35) / 338) * (-5.05-(-5.05)));
            zz = 0 + (((tickAnim - 35) / 338) * (0-(0)));
        }
        else if (tickAnim >= 373 && tickAnim < 383) {
            xx = 0 + (((tickAnim - 373) / 10) * (0-(0)));
            yy = -5.05 + (((tickAnim - 373) / 10) * (-5.05-(-5.05)));
            zz = 0 + (((tickAnim - 373) / 10) * (0-(0)));
        }
        else if (tickAnim >= 383 && tickAnim < 395) {
            xx = 0 + (((tickAnim - 383) / 12) * (0-(0)));
            yy = -5.05 + (((tickAnim - 383) / 12) * (0-(-5.05)));
            zz = 0 + (((tickAnim - 383) / 12) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.Base.rotationPointX = this.Base.rotationPointX + (float)(xx);
        this.Base.rotationPointY = this.Base.rotationPointY - (float)(yy);
        this.Base.rotationPointZ = this.Base.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 35) {
            xx = 0 + (((tickAnim - 0) / 35) * (1.75-(0)));
            yy = 0 + (((tickAnim - 0) / 35) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 35) * (0-(0)));
        }
        else if (tickAnim >= 35 && tickAnim < 358) {
            xx = 1.75 + (((tickAnim - 35) / 323) * (1.75-(1.75)));
            yy = 0 + (((tickAnim - 35) / 323) * (0-(0)));
            zz = 0 + (((tickAnim - 35) / 323) * (0-(0)));
        }
        else if (tickAnim >= 358 && tickAnim < 365) {
            xx = 1.75 + (((tickAnim - 358) / 7) * (-3.5-(1.75)));
            yy = 0 + (((tickAnim - 358) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 358) / 7) * (0-(0)));
        }
        else if (tickAnim >= 365 && tickAnim < 373) {
            xx = -3.5 + (((tickAnim - 365) / 8) * (-3.5-(-3.5)));
            yy = 0 + (((tickAnim - 365) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 365) / 8) * (0-(0)));
        }
        else if (tickAnim >= 373 && tickAnim < 395) {
            xx = -3.5 + (((tickAnim - 373) / 22) * (0-(-3.5)));
            yy = 0 + (((tickAnim - 373) / 22) * (0-(0)));
            zz = 0 + (((tickAnim - 373) / 22) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Body, Body.rotateAngleX + (float) Math.toRadians(xx), Body.rotateAngleY + (float) Math.toRadians(yy), Body.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 35) {
            xx = 0 + (((tickAnim - 0) / 35) * (0.25-(0)));
            yy = 0 + (((tickAnim - 0) / 35) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 35) * (0-(0)));
        }
        else if (tickAnim >= 35 && tickAnim < 358) {
            xx = 0.25 + (((tickAnim - 35) / 323) * (0.25-(0.25)));
            yy = 0 + (((tickAnim - 35) / 323) * (0-(0)));
            zz = 0 + (((tickAnim - 35) / 323) * (0-(0)));
        }
        else if (tickAnim >= 358 && tickAnim < 365) {
            xx = 0.25 + (((tickAnim - 358) / 7) * (-3.5-(0.25)));
            yy = 0 + (((tickAnim - 358) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 358) / 7) * (0-(0)));
        }
        else if (tickAnim >= 365 && tickAnim < 373) {
            xx = -3.5 + (((tickAnim - 365) / 8) * (-3.5-(-3.5)));
            yy = 0 + (((tickAnim - 365) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 365) / 8) * (0-(0)));
        }
        else if (tickAnim >= 373 && tickAnim < 395) {
            xx = -3.5 + (((tickAnim - 373) / 22) * (0-(-3.5)));
            yy = 0 + (((tickAnim - 373) / 22) * (0-(0)));
            zz = 0 + (((tickAnim - 373) / 22) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Chest, Chest.rotateAngleX + (float) Math.toRadians(xx), Chest.rotateAngleY + (float) Math.toRadians(yy), Chest.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 0) / 15) * (5-(0)));
            yy = 0 + (((tickAnim - 0) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 15) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 27) {
            xx = 5 + (((tickAnim - 15) / 12) * (4-(5)));
            yy = 0 + (((tickAnim - 15) / 12) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 12) * (0-(0)));
        }
        else if (tickAnim >= 27 && tickAnim < 35) {
            xx = 4 + (((tickAnim - 27) / 8) * (5-(4)));
            yy = 0 + (((tickAnim - 27) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 27) / 8) * (0-(0)));
        }
        else if (tickAnim >= 35 && tickAnim < 45) {
            xx = 5 + (((tickAnim - 35) / 10) * (5-(5)));
            yy = 0 + (((tickAnim - 35) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 35) / 10) * (0-(0)));
        }
        else if (tickAnim >= 45 && tickAnim < 51) {
            xx = 5 + (((tickAnim - 45) / 6) * (4.5-(5)));
            yy = 0 + (((tickAnim - 45) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 45) / 6) * (0-(0)));
        }
        else if (tickAnim >= 51 && tickAnim < 56) {
            xx = 4.5 + (((tickAnim - 51) / 5) * (3.5-(4.5)));
            yy = 0 + (((tickAnim - 51) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 51) / 5) * (0-(0)));
        }
        else if (tickAnim >= 56 && tickAnim < 65) {
            xx = 3.5 + (((tickAnim - 56) / 9) * (3-(3.5)));
            yy = 0 + (((tickAnim - 56) / 9) * (0-(0)));
            zz = 0 + (((tickAnim - 56) / 9) * (0-(0)));
        }
        else if (tickAnim >= 65 && tickAnim < 75) {
            xx = 3 + (((tickAnim - 65) / 10) * (-1-(3)));
            yy = 0 + (((tickAnim - 65) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 65) / 10) * (0-(0)));
        }
        else if (tickAnim >= 75 && tickAnim < 80) {
            xx = -1 + (((tickAnim - 75) / 5) * (-1.5-(-1)));
            yy = 0 + (((tickAnim - 75) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 75) / 5) * (0-(0)));
        }
        else if (tickAnim >= 80 && tickAnim < 90) {
            xx = -1.5 + (((tickAnim - 80) / 10) * (3-(-1.5)));
            yy = 0 + (((tickAnim - 80) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 80) / 10) * (0-(0)));
        }
        else if (tickAnim >= 90 && tickAnim < 105) {
            xx = 3 + (((tickAnim - 90) / 15) * (3.75-(3)));
            yy = 0 + (((tickAnim - 90) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 90) / 15) * (0-(0)));
        }
        else if (tickAnim >= 105 && tickAnim < 120) {
            xx = 3.75 + (((tickAnim - 105) / 15) * (12.25-(3.75)));
            yy = 0 + (((tickAnim - 105) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 105) / 15) * (0-(0)));
        }
        else if (tickAnim >= 120 && tickAnim < 130) {
            xx = 12.25 + (((tickAnim - 120) / 10) * (11.75-(12.25)));
            yy = 0 + (((tickAnim - 120) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 120) / 10) * (0-(0)));
        }
        else if (tickAnim >= 130 && tickAnim < 148) {
            xx = 11.75 + (((tickAnim - 130) / 18) * (10-(11.75)));
            yy = 0 + (((tickAnim - 130) / 18) * (0-(0)));
            zz = 0 + (((tickAnim - 130) / 18) * (0-(0)));
        }
        else if (tickAnim >= 148 && tickAnim < 175) {
            xx = 10 + (((tickAnim - 148) / 27) * (10-(10)));
            yy = 0 + (((tickAnim - 148) / 27) * (0-(0)));
            zz = 0 + (((tickAnim - 148) / 27) * (0-(0)));
        }
        else if (tickAnim >= 175 && tickAnim < 210) {
            xx = 10 + (((tickAnim - 175) / 35) * (10-(10)));
            yy = 0 + (((tickAnim - 175) / 35) * (0-(0)));
            zz = 0 + (((tickAnim - 175) / 35) * (0-(0)));
        }
        else if (tickAnim >= 210 && tickAnim < 237) {
            xx = 10 + (((tickAnim - 210) / 27) * (10-(10)));
            yy = 0 + (((tickAnim - 210) / 27) * (0-(0)));
            zz = 0 + (((tickAnim - 210) / 27) * (0-(0)));
        }
        else if (tickAnim >= 237 && tickAnim < 255) {
            xx = 10 + (((tickAnim - 237) / 18) * (10-(10)));
            yy = 0 + (((tickAnim - 237) / 18) * (0-(0)));
            zz = 0 + (((tickAnim - 237) / 18) * (0-(0)));
        }
        else if (tickAnim >= 255 && tickAnim < 282) {
            xx = 10 + (((tickAnim - 255) / 27) * (10-(10)));
            yy = 0 + (((tickAnim - 255) / 27) * (0-(0)));
            zz = 0 + (((tickAnim - 255) / 27) * (0-(0)));
        }
        else if (tickAnim >= 282 && tickAnim < 300) {
            xx = 10 + (((tickAnim - 282) / 18) * (9.5-(10)));
            yy = 0 + (((tickAnim - 282) / 18) * (0-(0)));
            zz = 0 + (((tickAnim - 282) / 18) * (0-(0)));
        }
        else if (tickAnim >= 300 && tickAnim < 327) {
            xx = 9.5 + (((tickAnim - 300) / 27) * (9-(9.5)));
            yy = 0 + (((tickAnim - 300) / 27) * (0-(0)));
            zz = 0 + (((tickAnim - 300) / 27) * (0-(0)));
        }
        else if (tickAnim >= 327 && tickAnim < 345) {
            xx = 9 + (((tickAnim - 327) / 18) * (8.75-(9)));
            yy = 0 + (((tickAnim - 327) / 18) * (0-(0)));
            zz = 0 + (((tickAnim - 327) / 18) * (0-(0)));
        }
        else if (tickAnim >= 345 && tickAnim < 358) {
            xx = 8.75 + (((tickAnim - 345) / 13) * (8.25-(8.75)));
            yy = 0 + (((tickAnim - 345) / 13) * (0-(0)));
            zz = 0 + (((tickAnim - 345) / 13) * (0-(0)));
        }
        else if (tickAnim >= 358 && tickAnim < 362) {
            xx = 8.25 + (((tickAnim - 358) / 4) * (10-(8.25)));
            yy = 0 + (((tickAnim - 358) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 358) / 4) * (0-(0)));
        }
        else if (tickAnim >= 362 && tickAnim < 365) {
            xx = 10 + (((tickAnim - 362) / 3) * (-2.75-(10)));
            yy = 0 + (((tickAnim - 362) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 362) / 3) * (0-(0)));
        }
        else if (tickAnim >= 365 && tickAnim < 369) {
            xx = -2.75 + (((tickAnim - 365) / 4) * (-7.25-(-2.75)));
            yy = 0 + (((tickAnim - 365) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 365) / 4) * (0-(0)));
        }
        else if (tickAnim >= 369 && tickAnim < 373) {
            xx = -7.25 + (((tickAnim - 369) / 4) * (-7.75-(-7.25)));
            yy = 0 + (((tickAnim - 369) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 369) / 4) * (0-(0)));
        }
        else if (tickAnim >= 373 && tickAnim < 383) {
            xx = -7.75 + (((tickAnim - 373) / 10) * (9.5-(-7.75)));
            yy = 0 + (((tickAnim - 373) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 373) / 10) * (0-(0)));
        }
        else if (tickAnim >= 383 && tickAnim < 395) {
            xx = 9.5 + (((tickAnim - 383) / 12) * (0-(9.5)));
            yy = 0 + (((tickAnim - 383) / 12) * (0-(0)));
            zz = 0 + (((tickAnim - 383) / 12) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Neck, Neck.rotateAngleX + (float) Math.toRadians(xx), Neck.rotateAngleY + (float) Math.toRadians(yy), Neck.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 0) / 15) * (7.25-(0)));
            yy = 0 + (((tickAnim - 0) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 15) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 27) {
            xx = 7.25 + (((tickAnim - 15) / 12) * (0.38-(7.25)));
            yy = 0 + (((tickAnim - 15) / 12) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 12) * (0-(0)));
        }
        else if (tickAnim >= 27 && tickAnim < 35) {
            xx = 0.38 + (((tickAnim - 27) / 8) * (-0.25-(0.38)));
            yy = 0 + (((tickAnim - 27) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 27) / 8) * (0-(0)));
        }
        else if (tickAnim >= 35 && tickAnim < 45) {
            xx = -0.25 + (((tickAnim - 35) / 10) * (-0.25-(-0.25)));
            yy = 0 + (((tickAnim - 35) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 35) / 10) * (0-(0)));
        }
        else if (tickAnim >= 45 && tickAnim < 51) {
            xx = -0.25 + (((tickAnim - 45) / 6) * (0.25-(-0.25)));
            yy = 0 + (((tickAnim - 45) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 45) / 6) * (0-(0)));
        }
        else if (tickAnim >= 51 && tickAnim < 56) {
            xx = 0.25 + (((tickAnim - 51) / 5) * (1.25-(0.25)));
            yy = 0 + (((tickAnim - 51) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 51) / 5) * (0-(0)));
        }
        else if (tickAnim >= 56 && tickAnim < 65) {
            xx = 1.25 + (((tickAnim - 56) / 9) * (1.75-(1.25)));
            yy = 0 + (((tickAnim - 56) / 9) * (0-(0)));
            zz = 0 + (((tickAnim - 56) / 9) * (0-(0)));
        }
        else if (tickAnim >= 65 && tickAnim < 75) {
            xx = 1.75 + (((tickAnim - 65) / 10) * (-0.5-(1.75)));
            yy = 0 + (((tickAnim - 65) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 65) / 10) * (0-(0)));
        }
        else if (tickAnim >= 75 && tickAnim < 80) {
            xx = -0.5 + (((tickAnim - 75) / 5) * (-1-(-0.5)));
            yy = 0 + (((tickAnim - 75) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 75) / 5) * (0-(0)));
        }
        else if (tickAnim >= 80 && tickAnim < 90) {
            xx = -1 + (((tickAnim - 80) / 10) * (1.75-(-1)));
            yy = 0 + (((tickAnim - 80) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 80) / 10) * (0-(0)));
        }
        else if (tickAnim >= 90 && tickAnim < 105) {
            xx = 1.75 + (((tickAnim - 90) / 15) * (2.5-(1.75)));
            yy = 0 + (((tickAnim - 90) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 90) / 15) * (0-(0)));
        }
        else if (tickAnim >= 105 && tickAnim < 120) {
            xx = 2.5 + (((tickAnim - 105) / 15) * (1.5-(2.5)));
            yy = 0 + (((tickAnim - 105) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 105) / 15) * (0-(0)));
        }
        else if (tickAnim >= 120 && tickAnim < 130) {
            xx = 1.5 + (((tickAnim - 120) / 10) * (2.75-(1.5)));
            yy = 0 + (((tickAnim - 120) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 120) / 10) * (0-(0)));
        }
        else if (tickAnim >= 130 && tickAnim < 148) {
            xx = 2.75 + (((tickAnim - 130) / 18) * (5.25-(2.75)));
            yy = 0 + (((tickAnim - 130) / 18) * (0-(0)));
            zz = 0 + (((tickAnim - 130) / 18) * (0-(0)));
        }
        else if (tickAnim >= 148 && tickAnim < 175) {
            xx = 5.25 + (((tickAnim - 148) / 27) * (5.75-(5.25)));
            yy = 0 + (((tickAnim - 148) / 27) * (0-(0)));
            zz = 0 + (((tickAnim - 148) / 27) * (0-(0)));
        }
        else if (tickAnim >= 175 && tickAnim < 210) {
            xx = 5.75 + (((tickAnim - 175) / 35) * (5.25-(5.75)));
            yy = 0 + (((tickAnim - 175) / 35) * (0-(0)));
            zz = 0 + (((tickAnim - 175) / 35) * (0-(0)));
        }
        else if (tickAnim >= 210 && tickAnim < 237) {
            xx = 5.25 + (((tickAnim - 210) / 27) * (5.75-(5.25)));
            yy = 0 + (((tickAnim - 210) / 27) * (0-(0)));
            zz = 0 + (((tickAnim - 210) / 27) * (0-(0)));
        }
        else if (tickAnim >= 237 && tickAnim < 257) {
            xx = 5.75 + (((tickAnim - 237) / 20) * (5.25-(5.75)));
            yy = 0 + (((tickAnim - 237) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 237) / 20) * (0-(0)));
        }
        else if (tickAnim >= 257 && tickAnim < 283) {
            xx = 5.25 + (((tickAnim - 257) / 26) * (5.75-(5.25)));
            yy = 0 + (((tickAnim - 257) / 26) * (0-(0)));
            zz = 0 + (((tickAnim - 257) / 26) * (0-(0)));
        }
        else if (tickAnim >= 283 && tickAnim < 318) {
            xx = 5.75 + (((tickAnim - 283) / 35) * (5.25-(5.75)));
            yy = 0 + (((tickAnim - 283) / 35) * (0-(0)));
            zz = 0 + (((tickAnim - 283) / 35) * (0-(0)));
        }
        else if (tickAnim >= 318 && tickAnim < 345) {
            xx = 5.25 + (((tickAnim - 318) / 27) * (5.75-(5.25)));
            yy = 0 + (((tickAnim - 318) / 27) * (0-(0)));
            zz = 0 + (((tickAnim - 318) / 27) * (0-(0)));
        }
        else if (tickAnim >= 345 && tickAnim < 358) {
            xx = 5.75 + (((tickAnim - 345) / 13) * (5.25-(5.75)));
            yy = 0 + (((tickAnim - 345) / 13) * (0-(0)));
            zz = 0 + (((tickAnim - 345) / 13) * (0-(0)));
        }
        else if (tickAnim >= 358 && tickAnim < 365) {
            xx = 5.25 + (((tickAnim - 358) / 7) * (-7.30265-(5.25)));
            yy = 0 + (((tickAnim - 358) / 7) * (7.71077-(0)));
            zz = 0 + (((tickAnim - 358) / 7) * (-0.78118-(0)));
        }
        else if (tickAnim >= 365 && tickAnim < 369) {
            xx = -7.30265 + (((tickAnim - 365) / 4) * (-9.55265-(-7.30265)));
            yy = 7.71077 + (((tickAnim - 365) / 4) * (7.71077-(7.71077)));
            zz = -0.78118 + (((tickAnim - 365) / 4) * (-0.78118-(-0.78118)));
        }
        else if (tickAnim >= 369 && tickAnim < 373) {
            xx = -9.55265 + (((tickAnim - 369) / 4) * (-8.30265-(-9.55265)));
            yy = 7.71077 + (((tickAnim - 369) / 4) * (7.71077-(7.71077)));
            zz = -0.78118 + (((tickAnim - 369) / 4) * (-0.78118-(-0.78118)));
        }
        else if (tickAnim >= 373 && tickAnim < 383) {
            xx = -8.30265 + (((tickAnim - 373) / 10) * (8.75162-(-8.30265)));
            yy = 7.71077 + (((tickAnim - 373) / 10) * (5.7642-(7.71077)));
            zz = -0.78118 + (((tickAnim - 373) / 10) * (-0.31874-(-0.78118)));
        }
        else if (tickAnim >= 383 && tickAnim < 395) {
            xx = 8.75162 + (((tickAnim - 383) / 12) * (0-(8.75162)));
            yy = 5.7642 + (((tickAnim - 383) / 12) * (0-(5.7642)));
            zz = -0.31874 + (((tickAnim - 383) / 12) * (0-(-0.31874)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Neck2, Neck2.rotateAngleX + (float) Math.toRadians(xx), Neck2.rotateAngleY + (float) Math.toRadians(yy), Neck2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 27) {
            xx = 0 + (((tickAnim - 0) / 27) * (6.1-(0)));
            yy = 0 + (((tickAnim - 0) / 27) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 27) * (0-(0)));
        }
        else if (tickAnim >= 27 && tickAnim < 35) {
            xx = 6.1 + (((tickAnim - 27) / 8) * (-2.5-(6.1)));
            yy = 0 + (((tickAnim - 27) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 27) / 8) * (0-(0)));
        }
        else if (tickAnim >= 35 && tickAnim < 45) {
            xx = -2.5 + (((tickAnim - 35) / 10) * (-2.5-(-2.5)));
            yy = 0 + (((tickAnim - 35) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 35) / 10) * (0-(0)));
        }
        else if (tickAnim >= 45 && tickAnim < 51) {
            xx = -2.5 + (((tickAnim - 45) / 6) * (-2.5-(-2.5)));
            yy = 0 + (((tickAnim - 45) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 45) / 6) * (0-(0)));
        }
        else if (tickAnim >= 51 && tickAnim < 56) {
            xx = -2.5 + (((tickAnim - 51) / 5) * (-3.25-(-2.5)));
            yy = 0 + (((tickAnim - 51) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 51) / 5) * (0-(0)));
        }
        else if (tickAnim >= 56 && tickAnim < 65) {
            xx = -3.25 + (((tickAnim - 56) / 9) * (-3.25-(-3.25)));
            yy = 0 + (((tickAnim - 56) / 9) * (0-(0)));
            zz = 0 + (((tickAnim - 56) / 9) * (0-(0)));
        }
        else if (tickAnim >= 65 && tickAnim < 75) {
            xx = -3.25 + (((tickAnim - 65) / 10) * (-5.75-(-3.25)));
            yy = 0 + (((tickAnim - 65) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 65) / 10) * (0-(0)));
        }
        else if (tickAnim >= 75 && tickAnim < 80) {
            xx = -5.75 + (((tickAnim - 75) / 5) * (-9-(-5.75)));
            yy = 0 + (((tickAnim - 75) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 75) / 5) * (0-(0)));
        }
        else if (tickAnim >= 80 && tickAnim < 90) {
            xx = -9 + (((tickAnim - 80) / 10) * (-3.25-(-9)));
            yy = 0 + (((tickAnim - 80) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 80) / 10) * (0-(0)));
        }
        else if (tickAnim >= 90 && tickAnim < 105) {
            xx = -3.25 + (((tickAnim - 90) / 15) * (3.62-(-3.25)));
            yy = 0 + (((tickAnim - 90) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 90) / 15) * (0-(0)));
        }
        else if (tickAnim >= 105 && tickAnim < 120) {
            xx = 3.62 + (((tickAnim - 105) / 15) * (-11.75-(3.62)));
            yy = 0 + (((tickAnim - 105) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 105) / 15) * (0-(0)));
        }
        else if (tickAnim >= 120 && tickAnim < 148) {
            xx = -11.75 + (((tickAnim - 120) / 28) * (-14-(-11.75)));
            yy = 0 + (((tickAnim - 120) / 28) * (0-(0)));
            zz = 0 + (((tickAnim - 120) / 28) * (0-(0)));
        }
        else if (tickAnim >= 148 && tickAnim < 358) {
            xx = -14 + (((tickAnim - 148) / 210) * (-11.5-(-14)));
            yy = 0 + (((tickAnim - 148) / 210) * (0-(0)));
            zz = 0 + (((tickAnim - 148) / 210) * (0-(0)));
        }
        else if (tickAnim >= 358 && tickAnim < 365) {
            xx = -11.5 + (((tickAnim - 358) / 7) * (12.01313-(-11.5)));
            yy = 0 + (((tickAnim - 358) / 7) * (25.97662-(0)));
            zz = 0 + (((tickAnim - 358) / 7) * (7.63336-(0)));
        }
        else if (tickAnim >= 365 && tickAnim < 369) {
            xx = 12.01313 + (((tickAnim - 365) / 4) * (25.40342-(12.01313)));
            yy = 25.97662 + (((tickAnim - 365) / 4) * (23.04602-(25.97662)));
            zz = 7.63336 + (((tickAnim - 365) / 4) * (13.38898-(7.63336)));
        }
        else if (tickAnim >= 369 && tickAnim < 373) {
            xx = 25.40342 + (((tickAnim - 369) / 4) * (25.40342-(25.40342)));
            yy = 23.04602 + (((tickAnim - 369) / 4) * (23.04602-(23.04602)));
            zz = 13.38898 + (((tickAnim - 369) / 4) * (13.38898-(13.38898)));
        }
        else if (tickAnim >= 373 && tickAnim < 383) {
            xx = 25.40342 + (((tickAnim - 373) / 10) * (22.7875-(25.40342)));
            yy = 23.04602 + (((tickAnim - 373) / 10) * (-2.65016-(23.04602)));
            zz = 13.38898 + (((tickAnim - 373) / 10) * (-0.94353-(13.38898)));
        }
        else if (tickAnim >= 383 && tickAnim < 395) {
            xx = 22.7875 + (((tickAnim - 383) / 12) * (0-(22.7875)));
            yy = -2.65016 + (((tickAnim - 383) / 12) * (0-(-2.65016)));
            zz = -0.94353 + (((tickAnim - 383) / 12) * (0-(-0.94353)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Head, Head.rotateAngleX + (float) Math.toRadians(xx), Head.rotateAngleY + (float) Math.toRadians(yy), Head.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 65) {
            xx = 0 + (((tickAnim - 0) / 65) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 65) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 65) * (0-(0)));
        }
        else if (tickAnim >= 65 && tickAnim < 75) {
            xx = 0 + (((tickAnim - 65) / 10) * (17.5-(0)));
            yy = 0 + (((tickAnim - 65) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 65) / 10) * (0-(0)));
        }
        else if (tickAnim >= 75 && tickAnim < 80) {
            xx = 17.5 + (((tickAnim - 75) / 5) * (21.5-(17.5)));
            yy = 0 + (((tickAnim - 75) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 75) / 5) * (0-(0)));
        }
        else if (tickAnim >= 80 && tickAnim < 90) {
            xx = 21.5 + (((tickAnim - 80) / 10) * (0-(21.5)));
            yy = 0 + (((tickAnim - 80) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 80) / 10) * (0-(0)));
        }
        else if (tickAnim >= 90 && tickAnim < 95) {
            xx = 0 + (((tickAnim - 90) / 5) * (4-(0)));
            yy = 0 + (((tickAnim - 90) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 90) / 5) * (0-(0)));
        }
        else if (tickAnim >= 95 && tickAnim < 100) {
            xx = 4 + (((tickAnim - 95) / 5) * (0-(4)));
            yy = 0 + (((tickAnim - 95) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 95) / 5) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Jaw, Jaw.rotateAngleX + (float) Math.toRadians(xx), Jaw.rotateAngleY + (float) Math.toRadians(yy), Jaw.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 0) / 15) * (-0.77668-(0)));
            yy = 0 + (((tickAnim - 0) / 15) * (6.2249-(0)));
            zz = 0 + (((tickAnim - 0) / 15) * (12.1585-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 35) {
            xx = -0.77668 + (((tickAnim - 15) / 20) * (-44.04244-(-0.77668)));
            yy = 6.2249 + (((tickAnim - 15) / 20) * (24.6028-(6.2249)));
            zz = 12.1585 + (((tickAnim - 15) / 20) * (66.4431-(12.1585)));
        }
        else if (tickAnim >= 35 && tickAnim < 358) {
            xx = -44.04244 + (((tickAnim - 35) / 323) * (-44.04244-(-44.04244)));
            yy = 24.6028 + (((tickAnim - 35) / 323) * (24.6028-(24.6028)));
            zz = 66.4431 + (((tickAnim - 35) / 323) * (66.4431-(66.4431)));
        }
        else if (tickAnim >= 358 && tickAnim < 365) {
            xx = -44.04244 + (((tickAnim - 358) / 7) * (-43.12316-(-44.04244)));
            yy = 24.6028 + (((tickAnim - 358) / 7) * (25.5831-(24.6028)));
            zz = 66.4431 + (((tickAnim - 358) / 7) * (55.4484-(66.4431)));
        }
        else if (tickAnim >= 365 && tickAnim < 373) {
            xx = -43.12316 + (((tickAnim - 365) / 8) * (-43.12316-(-43.12316)));
            yy = 25.5831 + (((tickAnim - 365) / 8) * (25.5831-(25.5831)));
            zz = 55.4484 + (((tickAnim - 365) / 8) * (55.4484-(55.4484)));
        }
        else if (tickAnim >= 373 && tickAnim < 383) {
            xx = -43.12316 + (((tickAnim - 373) / 10) * (-4.39765-(-43.12316)));
            yy = 25.5831 + (((tickAnim - 373) / 10) * (35.03057-(25.5831)));
            zz = 55.4484 + (((tickAnim - 373) / 10) * (28.10375-(55.4484)));
        }
        else if (tickAnim >= 383 && tickAnim < 395) {
            xx = -4.39765 + (((tickAnim - 383) / 12) * (0-(-4.39765)));
            yy = 35.03057 + (((tickAnim - 383) / 12) * (0-(35.03057)));
            zz = 28.10375 + (((tickAnim - 383) / 12) * (0-(28.10375)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(RightArm, RightArm.rotateAngleX + (float) Math.toRadians(xx), RightArm.rotateAngleY + (float) Math.toRadians(yy), RightArm.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 0) / 15) * (-16-(0)));
            yy = 0 + (((tickAnim - 0) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 15) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 35) {
            xx = -16 + (((tickAnim - 15) / 20) * (-44.24816-(-16)));
            yy = 0 + (((tickAnim - 15) / 20) * (-8.2635-(0)));
            zz = 0 + (((tickAnim - 15) / 20) * (-76.3556-(0)));
        }
        else if (tickAnim >= 35 && tickAnim < 358) {
            xx = -44.24816 + (((tickAnim - 35) / 323) * (-44.24816-(-44.24816)));
            yy = -8.2635 + (((tickAnim - 35) / 323) * (-8.2635-(-8.2635)));
            zz = -76.3556 + (((tickAnim - 35) / 323) * (-76.3556-(-76.3556)));
        }
        else if (tickAnim >= 358 && tickAnim < 365) {
            xx = -44.24816 + (((tickAnim - 358) / 7) * (-28.25037-(-44.24816)));
            yy = -8.2635 + (((tickAnim - 358) / 7) * (-6.1723-(-8.2635)));
            zz = -76.3556 + (((tickAnim - 358) / 7) * (-64.4438-(-76.3556)));
        }
        else if (tickAnim >= 365 && tickAnim < 373) {
            xx = -28.25037 + (((tickAnim - 365) / 8) * (-28.25037-(-28.25037)));
            yy = -6.1723 + (((tickAnim - 365) / 8) * (-6.1723-(-6.1723)));
            zz = -64.4438 + (((tickAnim - 365) / 8) * (-64.4438-(-64.4438)));
        }
        else if (tickAnim >= 373 && tickAnim < 383) {
            xx = -28.25037 + (((tickAnim - 373) / 10) * (-20.17672-(-28.25037)));
            yy = -6.1723 + (((tickAnim - 373) / 10) * (-2.48062-(-6.1723)));
            zz = -64.4438 + (((tickAnim - 373) / 10) * (-26.06564-(-64.4438)));
        }
        else if (tickAnim >= 383 && tickAnim < 395) {
            xx = -20.17672 + (((tickAnim - 383) / 12) * (0-(-20.17672)));
            yy = -2.48062 + (((tickAnim - 383) / 12) * (0-(-2.48062)));
            zz = -26.06564 + (((tickAnim - 383) / 12) * (0-(-26.06564)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(RightArm2, RightArm2.rotateAngleX + (float) Math.toRadians(xx), RightArm2.rotateAngleY + (float) Math.toRadians(yy), RightArm2.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 15 && tickAnim < 35) {
            xx = 0 + (((tickAnim - 15) / 20) * (1.975-(0)));
            yy = 0 + (((tickAnim - 15) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 20) * (-0.675-(0)));
        }
        else if (tickAnim >= 35 && tickAnim < 358) {
            xx = 1.975 + (((tickAnim - 35) / 323) * (1.975-(1.975)));
            yy = 0 + (((tickAnim - 35) / 323) * (0-(0)));
            zz = -0.675 + (((tickAnim - 35) / 323) * (-0.675-(-0.675)));
        }
        else if (tickAnim >= 358 && tickAnim < 373) {
            xx = 1.975 + (((tickAnim - 358) / 15) * (1.975-(1.975)));
            yy = 0 + (((tickAnim - 358) / 15) * (0-(0)));
            zz = -0.675 + (((tickAnim - 358) / 15) * (-0.675-(-0.675)));
        }
        else if (tickAnim >= 373 && tickAnim < 383) {
            xx = 1.975 + (((tickAnim - 373) / 10) * (0.625-(1.975)));
            yy = 0 + (((tickAnim - 373) / 10) * (0-(0)));
            zz = -0.675 + (((tickAnim - 373) / 10) * (0-(-0.675)));
        }
        else if (tickAnim >= 383 && tickAnim < 395) {
            xx = 0.625 + (((tickAnim - 383) / 12) * (0-(0.625)));
            yy = 0 + (((tickAnim - 383) / 12) * (0-(0)));
            zz = 0 + (((tickAnim - 383) / 12) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.RightArm2.rotationPointX = this.RightArm2.rotationPointX + (float)(xx);
        this.RightArm2.rotationPointY = this.RightArm2.rotationPointY - (float)(yy);
        this.RightArm2.rotationPointZ = this.RightArm2.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 0) / 10) * (16.69332-(0)));
            yy = 0 + (((tickAnim - 0) / 10) * (2.74537-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (-5.30736-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 15) {
            xx = 16.69332 + (((tickAnim - 10) / 5) * (24.37742-(16.69332)));
            yy = 2.74537 + (((tickAnim - 10) / 5) * (0.1262-(2.74537)));
            zz = -5.30736 + (((tickAnim - 10) / 5) * (-6.2032-(-5.30736)));
        }
        else if (tickAnim >= 15 && tickAnim < 35) {
            xx = 24.37742 + (((tickAnim - 15) / 20) * (87.37771-(24.37742)));
            yy = 0.1262 + (((tickAnim - 15) / 20) * (-37.4888-(0.1262)));
            zz = -6.2032 + (((tickAnim - 15) / 20) * (-1.02365-(-6.2032)));
        }
        else if (tickAnim >= 35 && tickAnim < 358) {
            xx = 87.37771 + (((tickAnim - 35) / 323) * (87.37771-(87.37771)));
            yy = -37.4888 + (((tickAnim - 35) / 323) * (-37.4888-(-37.4888)));
            zz = -1.02365 + (((tickAnim - 35) / 323) * (-1.02365-(-1.02365)));
        }
        else if (tickAnim >= 358 && tickAnim < 365) {
            xx = 87.37771 + (((tickAnim - 358) / 7) * (80.37771-(87.37771)));
            yy = -37.4888 + (((tickAnim - 358) / 7) * (-37.4888-(-37.4888)));
            zz = -1.02365 + (((tickAnim - 358) / 7) * (1.0236-(-1.02365)));
        }
        else if (tickAnim >= 365 && tickAnim < 373) {
            xx = 80.37771 + (((tickAnim - 365) / 8) * (80.37771-(80.37771)));
            yy = -37.4888 + (((tickAnim - 365) / 8) * (-37.4888-(-37.4888)));
            zz = 1.0236 + (((tickAnim - 365) / 8) * (1.0236-(1.0236)));
        }
        else if (tickAnim >= 373 && tickAnim < 383) {
            xx = 80.37771 + (((tickAnim - 373) / 10) * (45.3824-(80.37771)));
            yy = -37.4888 + (((tickAnim - 373) / 10) * (-27.99196-(-37.4888)));
            zz = 1.0236 + (((tickAnim - 373) / 10) * (-12.27885-(1.0236)));
        }
        else if (tickAnim >= 383 && tickAnim < 395) {
            xx = 45.3824 + (((tickAnim - 383) / 12) * (0-(45.3824)));
            yy = -27.99196 + (((tickAnim - 383) / 12) * (0-(-27.99196)));
            zz = -12.27885 + (((tickAnim - 383) / 12) * (0-(-12.27885)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(RightArmHand, RightArmHand.rotateAngleX + (float) Math.toRadians(xx), RightArmHand.rotateAngleY + (float) Math.toRadians(yy), RightArmHand.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 0) / 15) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 15) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 25) {
            xx = 0 + (((tickAnim - 15) / 10) * (0-(0)));
            yy = 0 + (((tickAnim - 15) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 10) * (-0.375-(0)));
        }
        else if (tickAnim >= 25 && tickAnim < 35) {
            xx = 0 + (((tickAnim - 25) / 10) * (0-(0)));
            yy = 0 + (((tickAnim - 25) / 10) * (0-(0)));
            zz = -0.375 + (((tickAnim - 25) / 10) * (0-(-0.375)));
        }
        else if (tickAnim >= 35 && tickAnim < 358) {
            xx = 0 + (((tickAnim - 35) / 323) * (0-(0)));
            yy = 0 + (((tickAnim - 35) / 323) * (0-(0)));
            zz = 0 + (((tickAnim - 35) / 323) * (0-(0)));
        }
        else if (tickAnim >= 358 && tickAnim < 373) {
            xx = 0 + (((tickAnim - 358) / 15) * (0-(0)));
            yy = 0 + (((tickAnim - 358) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 358) / 15) * (0-(0)));
        }
        else if (tickAnim >= 373 && tickAnim < 383) {
            xx = 0 + (((tickAnim - 373) / 10) * (0-(0)));
            yy = 0 + (((tickAnim - 373) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 373) / 10) * (-1.025-(0)));
        }
        else if (tickAnim >= 383 && tickAnim < 390) {
            xx = 0 + (((tickAnim - 383) / 7) * (0-(0)));
            yy = 0 + (((tickAnim - 383) / 7) * (0.575-(0)));
            zz = -1.025 + (((tickAnim - 383) / 7) * (0-(-1.025)));
        }
        else if (tickAnim >= 390 && tickAnim < 395) {
            xx = 0 + (((tickAnim - 390) / 5) * (0-(0)));
            yy = 0.575 + (((tickAnim - 390) / 5) * (0-(0.575)));
            zz = 0 + (((tickAnim - 390) / 5) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.RightArmHand.rotationPointX = this.RightArmHand.rotationPointX + (float)(xx);
        this.RightArmHand.rotationPointY = this.RightArmHand.rotationPointY - (float)(yy);
        this.RightArmHand.rotationPointZ = this.RightArmHand.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 0) / 15) * (-0.77668-(0)));
            yy = 0 + (((tickAnim - 0) / 15) * (-6.22488-(0)));
            zz = 0 + (((tickAnim - 0) / 15) * (-12.15854-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 35) {
            xx = -0.77668 + (((tickAnim - 15) / 20) * (-44.04244-(-0.77668)));
            yy = -6.22488 + (((tickAnim - 15) / 20) * (-24.60277-(-6.22488)));
            zz = -12.15854 + (((tickAnim - 15) / 20) * (-66.4431-(-12.15854)));
        }
        else if (tickAnim >= 35 && tickAnim < 358) {
            xx = -44.04244 + (((tickAnim - 35) / 323) * (-44.04244-(-44.04244)));
            yy = -24.60277 + (((tickAnim - 35) / 323) * (-24.60277-(-24.60277)));
            zz = -66.4431 + (((tickAnim - 35) / 323) * (-66.4431-(-66.4431)));
        }
        else if (tickAnim >= 358 && tickAnim < 365) {
            xx = -44.04244 + (((tickAnim - 358) / 7) * (-43.12316-(-44.04244)));
            yy = -24.60277 + (((tickAnim - 358) / 7) * (-25.58308-(-24.60277)));
            zz = -66.4431 + (((tickAnim - 358) / 7) * (-55.44836-(-66.4431)));
        }
        else if (tickAnim >= 365 && tickAnim < 373) {
            xx = -43.12316 + (((tickAnim - 365) / 8) * (-43.12316-(-43.12316)));
            yy = -25.58308 + (((tickAnim - 365) / 8) * (-25.58308-(-25.58308)));
            zz = -55.44836 + (((tickAnim - 365) / 8) * (-55.44836-(-55.44836)));
        }
        else if (tickAnim >= 373 && tickAnim < 383) {
            xx = -43.12316 + (((tickAnim - 373) / 10) * (-17.08282-(-43.12316)));
            yy = -25.58308 + (((tickAnim - 373) / 10) * (-26.53025-(-25.58308)));
            zz = -55.44836 + (((tickAnim - 373) / 10) * (-46.22637-(-55.44836)));
        }
        else if (tickAnim >= 383 && tickAnim < 395) {
            xx = -17.08282 + (((tickAnim - 383) / 12) * (0-(-17.08282)));
            yy = -26.53025 + (((tickAnim - 383) / 12) * (0-(-26.53025)));
            zz = -46.22637 + (((tickAnim - 383) / 12) * (0-(-46.22637)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(LeftArm, LeftArm.rotateAngleX + (float) Math.toRadians(xx), LeftArm.rotateAngleY + (float) Math.toRadians(yy), LeftArm.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 0) / 15) * (-16-(0)));
            yy = 0 + (((tickAnim - 0) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 15) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 35) {
            xx = -16 + (((tickAnim - 15) / 20) * (-44.24816-(-16)));
            yy = 0 + (((tickAnim - 15) / 20) * (8.26348-(0)));
            zz = 0 + (((tickAnim - 15) / 20) * (76.35564-(0)));
        }
        else if (tickAnim >= 35 && tickAnim < 358) {
            xx = -44.24816 + (((tickAnim - 35) / 323) * (-44.24816-(-44.24816)));
            yy = 8.26348 + (((tickAnim - 35) / 323) * (8.26348-(8.26348)));
            zz = 76.35564 + (((tickAnim - 35) / 323) * (76.35564-(76.35564)));
        }
        else if (tickAnim >= 358 && tickAnim < 365) {
            xx = -44.24816 + (((tickAnim - 358) / 7) * (-28.25037-(-44.24816)));
            yy = 8.26348 + (((tickAnim - 358) / 7) * (6.17225-(8.26348)));
            zz = 76.35564 + (((tickAnim - 358) / 7) * (64.44385-(76.35564)));
        }
        else if (tickAnim >= 365 && tickAnim < 373) {
            xx = -28.25037 + (((tickAnim - 365) / 8) * (-28.25037-(-28.25037)));
            yy = 6.17225 + (((tickAnim - 365) / 8) * (6.17225-(6.17225)));
            zz = 64.44385 + (((tickAnim - 365) / 8) * (64.44385-(64.44385)));
        }
        else if (tickAnim >= 373 && tickAnim < 383) {
            xx = -28.25037 + (((tickAnim - 373) / 10) * (-16.49234-(-28.25037)));
            yy = 6.17225 + (((tickAnim - 373) / 10) * (-0.7924-(6.17225)));
            zz = 64.44385 + (((tickAnim - 373) / 10) * (40.06961-(64.44385)));
        }
        else if (tickAnim >= 383 && tickAnim < 395) {
            xx = -16.49234 + (((tickAnim - 383) / 12) * (0-(-16.49234)));
            yy = -0.7924 + (((tickAnim - 383) / 12) * (0-(-0.7924)));
            zz = 40.06961 + (((tickAnim - 383) / 12) * (0-(40.06961)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(LeftArm2, LeftArm2.rotateAngleX + (float) Math.toRadians(xx), LeftArm2.rotateAngleY + (float) Math.toRadians(yy), LeftArm2.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 0) / 15) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 15) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 35) {
            xx = 0 + (((tickAnim - 15) / 20) * (-1.975-(0)));
            yy = 0 + (((tickAnim - 15) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 20) * (-0.675-(0)));
        }
        else if (tickAnim >= 35 && tickAnim < 358) {
            xx = -1.975 + (((tickAnim - 35) / 323) * (-1.975-(-1.975)));
            yy = 0 + (((tickAnim - 35) / 323) * (0-(0)));
            zz = -0.675 + (((tickAnim - 35) / 323) * (-0.675-(-0.675)));
        }
        else if (tickAnim >= 358 && tickAnim < 373) {
            xx = -1.975 + (((tickAnim - 358) / 15) * (-1.975-(-1.975)));
            yy = 0 + (((tickAnim - 358) / 15) * (0-(0)));
            zz = -0.675 + (((tickAnim - 358) / 15) * (-0.675-(-0.675)));
        }
        else if (tickAnim >= 373 && tickAnim < 395) {
            xx = -1.975 + (((tickAnim - 373) / 22) * (0-(-1.975)));
            yy = 0 + (((tickAnim - 373) / 22) * (0-(0)));
            zz = -0.675 + (((tickAnim - 373) / 22) * (0-(-0.675)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.LeftArm2.rotationPointX = this.LeftArm2.rotationPointX + (float)(xx);
        this.LeftArm2.rotationPointY = this.LeftArm2.rotationPointY - (float)(yy);
        this.LeftArm2.rotationPointZ = this.LeftArm2.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 0) / 10) * (16.69332-(0)));
            yy = 0 + (((tickAnim - 0) / 10) * (-2.74537-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (5.45131-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 15) {
            xx = 16.69332 + (((tickAnim - 10) / 5) * (22.12742-(16.69332)));
            yy = -2.74537 + (((tickAnim - 10) / 5) * (-0.1262-(-2.74537)));
            zz = 5.45131 + (((tickAnim - 10) / 5) * (6.2032-(5.45131)));
        }
        else if (tickAnim >= 15 && tickAnim < 35) {
            xx = 22.12742 + (((tickAnim - 15) / 20) * (87.37771-(22.12742)));
            yy = -0.1262 + (((tickAnim - 15) / 20) * (37.48885-(-0.1262)));
            zz = 6.2032 + (((tickAnim - 15) / 20) * (-1.02365-(6.2032)));
        }
        else if (tickAnim >= 35 && tickAnim < 358) {
            xx = 87.37771 + (((tickAnim - 35) / 323) * (87.37771-(87.37771)));
            yy = 37.48885 + (((tickAnim - 35) / 323) * (37.48885-(37.48885)));
            zz = -1.02365 + (((tickAnim - 35) / 323) * (-1.02365-(-1.02365)));
        }
        else if (tickAnim >= 358 && tickAnim < 365) {
            xx = 87.37771 + (((tickAnim - 358) / 7) * (80.37771-(87.37771)));
            yy = 37.48885 + (((tickAnim - 358) / 7) * (37.48885-(37.48885)));
            zz = -1.02365 + (((tickAnim - 358) / 7) * (-1.02365-(-1.02365)));
        }
        else if (tickAnim >= 365 && tickAnim < 373) {
            xx = 80.37771 + (((tickAnim - 365) / 8) * (80.37771-(80.37771)));
            yy = 37.48885 + (((tickAnim - 365) / 8) * (37.48885-(37.48885)));
            zz = -1.02365 + (((tickAnim - 365) / 8) * (-1.02365-(-1.02365)));
        }
        else if (tickAnim >= 373 && tickAnim < 383) {
            xx = 80.37771 + (((tickAnim - 373) / 10) * (57.69741-(80.37771)));
            yy = 37.48885 + (((tickAnim - 373) / 10) * (23.9348-(37.48885)));
            zz = -1.02365 + (((tickAnim - 373) / 10) * (7.0051-(-1.02365)));
        }
        else if (tickAnim >= 383 && tickAnim < 395) {
            xx = 57.69741 + (((tickAnim - 383) / 12) * (0-(57.69741)));
            yy = 23.9348 + (((tickAnim - 383) / 12) * (0-(23.9348)));
            zz = 7.0051 + (((tickAnim - 383) / 12) * (0-(7.0051)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(LeftArmHand, LeftArmHand.rotateAngleX + (float) Math.toRadians(xx), LeftArmHand.rotateAngleY + (float) Math.toRadians(yy), LeftArmHand.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 15 && tickAnim < 25) {
            xx = 0 + (((tickAnim - 15) / 10) * (0-(0)));
            yy = 0 + (((tickAnim - 15) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 10) * (-0.375-(0)));
        }
        else if (tickAnim >= 25 && tickAnim < 35) {
            xx = 0 + (((tickAnim - 25) / 10) * (0-(0)));
            yy = 0 + (((tickAnim - 25) / 10) * (0-(0)));
            zz = -0.375 + (((tickAnim - 25) / 10) * (0-(-0.375)));
        }
        else if (tickAnim >= 35 && tickAnim < 358) {
            xx = 0 + (((tickAnim - 35) / 323) * (0-(0)));
            yy = 0 + (((tickAnim - 35) / 323) * (0-(0)));
            zz = 0 + (((tickAnim - 35) / 323) * (0-(0)));
        }
        else if (tickAnim >= 358 && tickAnim < 373) {
            xx = 0 + (((tickAnim - 358) / 15) * (0-(0)));
            yy = 0 + (((tickAnim - 358) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 358) / 15) * (0-(0)));
        }
        else if (tickAnim >= 373 && tickAnim < 383) {
            xx = 0 + (((tickAnim - 373) / 10) * (0-(0)));
            yy = 0 + (((tickAnim - 373) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 373) / 10) * (0-(0)));
        }
        else if (tickAnim >= 383 && tickAnim < 390) {
            xx = 0 + (((tickAnim - 383) / 7) * (0-(0)));
            yy = 0 + (((tickAnim - 383) / 7) * (0.75-(0)));
            zz = 0 + (((tickAnim - 383) / 7) * (0-(0)));
        }
        else if (tickAnim >= 390 && tickAnim < 395) {
            xx = 0 + (((tickAnim - 390) / 5) * (0-(0)));
            yy = 0.75 + (((tickAnim - 390) / 5) * (0-(0.75)));
            zz = 0 + (((tickAnim - 390) / 5) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.LeftArmHand.rotationPointX = this.LeftArmHand.rotationPointX + (float)(xx);
        this.LeftArmHand.rotationPointY = this.LeftArmHand.rotationPointY - (float)(yy);
        this.LeftArmHand.rotationPointZ = this.LeftArmHand.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 0) / 15) * (-18-(0)));
            yy = 0 + (((tickAnim - 0) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 15) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 35) {
            xx = -18 + (((tickAnim - 15) / 20) * (-43-(-18)));
            yy = 0 + (((tickAnim - 15) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 20) * (0-(0)));
        }
        else if (tickAnim >= 35 && tickAnim < 373) {
            xx = -43 + (((tickAnim - 35) / 338) * (-43-(-43)));
            yy = 0 + (((tickAnim - 35) / 338) * (0-(0)));
            zz = 0 + (((tickAnim - 35) / 338) * (0-(0)));
        }
        else if (tickAnim >= 373 && tickAnim < 383) {
            xx = -43 + (((tickAnim - 373) / 10) * (-34.25-(-43)));
            yy = 0 + (((tickAnim - 373) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 373) / 10) * (0-(0)));
        }
        else if (tickAnim >= 383 && tickAnim < 395) {
            xx = -34.25 + (((tickAnim - 383) / 12) * (0-(-34.25)));
            yy = 0 + (((tickAnim - 383) / 12) * (0-(0)));
            zz = 0 + (((tickAnim - 383) / 12) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(RightLeg, RightLeg.rotateAngleX + (float) Math.toRadians(xx), RightLeg.rotateAngleY + (float) Math.toRadians(yy), RightLeg.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 35) {
            xx = 0 + (((tickAnim - 0) / 35) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 35) * (-0.475-(0)));
            zz = 0 + (((tickAnim - 0) / 35) * (0-(0)));
        }
        else if (tickAnim >= 35 && tickAnim < 373) {
            xx = 0 + (((tickAnim - 35) / 338) * (0-(0)));
            yy = -0.475 + (((tickAnim - 35) / 338) * (-0.475-(-0.475)));
            zz = 0 + (((tickAnim - 35) / 338) * (0-(0)));
        }
        else if (tickAnim >= 373 && tickAnim < 395) {
            xx = 0 + (((tickAnim - 373) / 22) * (0-(0)));
            yy = -0.475 + (((tickAnim - 373) / 22) * (0-(-0.475)));
            zz = 0 + (((tickAnim - 373) / 22) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.RightLeg.rotationPointX = this.RightLeg.rotationPointX + (float)(xx);
        this.RightLeg.rotationPointY = this.RightLeg.rotationPointY - (float)(yy);
        this.RightLeg.rotationPointZ = this.RightLeg.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 0) / 15) * (38-(0)));
            yy = 0 + (((tickAnim - 0) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 15) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 35) {
            xx = 38 + (((tickAnim - 15) / 20) * (54.25-(38)));
            yy = 0 + (((tickAnim - 15) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 20) * (0-(0)));
        }
        else if (tickAnim >= 35 && tickAnim < 383) {
            xx = 54.25 + (((tickAnim - 35) / 348) * (54.25-(54.25)));
            yy = 0 + (((tickAnim - 35) / 348) * (0-(0)));
            zz = 0 + (((tickAnim - 35) / 348) * (0-(0)));
        }
        else if (tickAnim >= 383 && tickAnim < 395) {
            xx = 54.25 + (((tickAnim - 383) / 12) * (0-(54.25)));
            yy = 0 + (((tickAnim - 383) / 12) * (0-(0)));
            zz = 0 + (((tickAnim - 383) / 12) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(RightLeg2, RightLeg2.rotateAngleX + (float) Math.toRadians(xx), RightLeg2.rotateAngleY + (float) Math.toRadians(yy), RightLeg2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 0) / 15) * (-12.01758-(0)));
            yy = 0 + (((tickAnim - 0) / 15) * (-0.4045-(0)));
            zz = 0 + (((tickAnim - 0) / 15) * (2.9727-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 383) {
            xx = -12.01758 + (((tickAnim - 15) / 368) * (-12.01758-(-12.01758)));
            yy = -0.4045 + (((tickAnim - 15) / 368) * (-0.4045-(-0.4045)));
            zz = 2.9727 + (((tickAnim - 15) / 368) * (2.9727-(2.9727)));
        }
        else if (tickAnim >= 383 && tickAnim < 395) {
            xx = -12.01758 + (((tickAnim - 383) / 12) * (0-(-12.01758)));
            yy = -0.4045 + (((tickAnim - 383) / 12) * (0-(-0.4045)));
            zz = 2.9727 + (((tickAnim - 383) / 12) * (0-(2.9727)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(RightLegFoot, RightLegFoot.rotateAngleX + (float) Math.toRadians(xx), RightLegFoot.rotateAngleY + (float) Math.toRadians(yy), RightLegFoot.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 0) / 15) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 15) * (0.425-(0)));
            zz = 0 + (((tickAnim - 0) / 15) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 383) {
            xx = 0 + (((tickAnim - 15) / 368) * (0-(0)));
            yy = 0.425 + (((tickAnim - 15) / 368) * (0.425-(0.425)));
            zz = 0 + (((tickAnim - 15) / 368) * (0-(0)));
        }
        else if (tickAnim >= 383 && tickAnim < 395) {
            xx = 0 + (((tickAnim - 383) / 12) * (0-(0)));
            yy = 0.425 + (((tickAnim - 383) / 12) * (0-(0.425)));
            zz = 0 + (((tickAnim - 383) / 12) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.RightLegFoot.rotationPointX = this.RightLegFoot.rotationPointX + (float)(xx);
        this.RightLegFoot.rotationPointY = this.RightLegFoot.rotationPointY - (float)(yy);
        this.RightLegFoot.rotationPointZ = this.RightLegFoot.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 0) / 15) * (-18-(0)));
            yy = 0 + (((tickAnim - 0) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 15) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 35) {
            xx = -18 + (((tickAnim - 15) / 20) * (-43-(-18)));
            yy = 0 + (((tickAnim - 15) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 20) * (0-(0)));
        }
        else if (tickAnim >= 35 && tickAnim < 373) {
            xx = -43 + (((tickAnim - 35) / 338) * (-43-(-43)));
            yy = 0 + (((tickAnim - 35) / 338) * (0-(0)));
            zz = 0 + (((tickAnim - 35) / 338) * (0-(0)));
        }
        else if (tickAnim >= 373 && tickAnim < 383) {
            xx = -43 + (((tickAnim - 373) / 10) * (-34.75-(-43)));
            yy = 0 + (((tickAnim - 373) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 373) / 10) * (0-(0)));
        }
        else if (tickAnim >= 383 && tickAnim < 395) {
            xx = -34.75 + (((tickAnim - 383) / 12) * (0-(-34.75)));
            yy = 0 + (((tickAnim - 383) / 12) * (0-(0)));
            zz = 0 + (((tickAnim - 383) / 12) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(LeftLeg, LeftLeg.rotateAngleX + (float) Math.toRadians(xx), LeftLeg.rotateAngleY + (float) Math.toRadians(yy), LeftLeg.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 35) {
            xx = 0 + (((tickAnim - 0) / 35) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 35) * (-0.475-(0)));
            zz = 0 + (((tickAnim - 0) / 35) * (0-(0)));
        }
        else if (tickAnim >= 35 && tickAnim < 373) {
            xx = 0 + (((tickAnim - 35) / 338) * (0-(0)));
            yy = -0.475 + (((tickAnim - 35) / 338) * (-0.475-(-0.475)));
            zz = 0 + (((tickAnim - 35) / 338) * (0-(0)));
        }
        else if (tickAnim >= 373 && tickAnim < 395) {
            xx = 0 + (((tickAnim - 373) / 22) * (0-(0)));
            yy = -0.475 + (((tickAnim - 373) / 22) * (0-(-0.475)));
            zz = 0 + (((tickAnim - 373) / 22) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.LeftLeg.rotationPointX = this.LeftLeg.rotationPointX + (float)(xx);
        this.LeftLeg.rotationPointY = this.LeftLeg.rotationPointY - (float)(yy);
        this.LeftLeg.rotationPointZ = this.LeftLeg.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 0) / 15) * (38-(0)));
            yy = 0 + (((tickAnim - 0) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 15) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 35) {
            xx = 38 + (((tickAnim - 15) / 20) * (54.25-(38)));
            yy = 0 + (((tickAnim - 15) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 20) * (0-(0)));
        }
        else if (tickAnim >= 35 && tickAnim < 383) {
            xx = 54.25 + (((tickAnim - 35) / 348) * (54.25-(54.25)));
            yy = 0 + (((tickAnim - 35) / 348) * (0-(0)));
            zz = 0 + (((tickAnim - 35) / 348) * (0-(0)));
        }
        else if (tickAnim >= 383 && tickAnim < 395) {
            xx = 54.25 + (((tickAnim - 383) / 12) * (0-(54.25)));
            yy = 0 + (((tickAnim - 383) / 12) * (0-(0)));
            zz = 0 + (((tickAnim - 383) / 12) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(LeftLeg2, LeftLeg2.rotateAngleX + (float) Math.toRadians(xx), LeftLeg2.rotateAngleY + (float) Math.toRadians(yy), LeftLeg2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 0) / 15) * (-12.01758-(0)));
            yy = 0 + (((tickAnim - 0) / 15) * (-0.4045-(0)));
            zz = 0 + (((tickAnim - 0) / 15) * (-2.97266-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 383) {
            xx = -12.01758 + (((tickAnim - 15) / 368) * (-12.01758-(-12.01758)));
            yy = -0.4045 + (((tickAnim - 15) / 368) * (-0.4045-(-0.4045)));
            zz = -2.97266 + (((tickAnim - 15) / 368) * (-2.97266-(-2.97266)));
        }
        else if (tickAnim >= 383 && tickAnim < 395) {
            xx = -12.01758 + (((tickAnim - 383) / 12) * (0-(-12.01758)));
            yy = -0.4045 + (((tickAnim - 383) / 12) * (0-(-0.4045)));
            zz = -2.97266 + (((tickAnim - 383) / 12) * (0-(-2.97266)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(LeftLegFoot, LeftLegFoot.rotateAngleX + (float) Math.toRadians(xx), LeftLegFoot.rotateAngleY + (float) Math.toRadians(yy), LeftLegFoot.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 0) / 15) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 15) * (0.425-(0)));
            zz = 0 + (((tickAnim - 0) / 15) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 383) {
            xx = 0 + (((tickAnim - 15) / 368) * (0-(0)));
            yy = 0.425 + (((tickAnim - 15) / 368) * (0.425-(0.425)));
            zz = 0 + (((tickAnim - 15) / 368) * (0-(0)));
        }
        else if (tickAnim >= 383 && tickAnim < 395) {
            xx = 0 + (((tickAnim - 383) / 12) * (0-(0)));
            yy = 0.425 + (((tickAnim - 383) / 12) * (0-(0.425)));
            zz = 0 + (((tickAnim - 383) / 12) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.LeftLegFoot.rotationPointX = this.LeftLegFoot.rotationPointX + (float)(xx);
        this.LeftLegFoot.rotationPointY = this.LeftLegFoot.rotationPointY - (float)(yy);
        this.LeftLegFoot.rotationPointZ = this.LeftLegFoot.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 0) / 5) * (-0.18496-(0)));
            yy = 0 + (((tickAnim - 0) / 5) * (-0.05578-(0)));
            zz = 0 + (((tickAnim - 0) / 5) * (-0.01766-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 15) {
            xx = -0.18496 + (((tickAnim - 5) / 10) * (2.73868-(-0.18496)));
            yy = -0.05578 + (((tickAnim - 5) / 10) * (-0.14342-(-0.05578)));
            zz = -0.01766 + (((tickAnim - 5) / 10) * (-0.0454-(-0.01766)));
        }
        else if (tickAnim >= 15 && tickAnim < 35) {
            xx = 2.73868 + (((tickAnim - 15) / 20) * (-3.76132-(2.73868)));
            yy = -0.14342 + (((tickAnim - 15) / 20) * (-0.14342-(-0.14342)));
            zz = -0.0454 + (((tickAnim - 15) / 20) * (-0.0454-(-0.0454)));
        }
        else if (tickAnim >= 35 && tickAnim < 373) {
            xx = -3.76132 + (((tickAnim - 35) / 338) * (-3.76132-(-3.76132)));
            yy = -0.14342 + (((tickAnim - 35) / 338) * (-0.14342-(-0.14342)));
            zz = -0.0454 + (((tickAnim - 35) / 338) * (-0.0454-(-0.0454)));
        }
        else if (tickAnim >= 373 && tickAnim < 383) {
            xx = -3.76132 + (((tickAnim - 373) / 10) * (6.98868-(-3.76132)));
            yy = -0.14342 + (((tickAnim - 373) / 10) * (-0.14342-(-0.14342)));
            zz = -0.0454 + (((tickAnim - 373) / 10) * (-0.0454-(-0.0454)));
        }
        else if (tickAnim >= 383 && tickAnim < 395) {
            xx = 6.98868 + (((tickAnim - 383) / 12) * (0-(6.98868)));
            yy = -0.14342 + (((tickAnim - 383) / 12) * (0-(-0.14342)));
            zz = -0.0454 + (((tickAnim - 383) / 12) * (0-(-0.0454)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Tail, Tail.rotateAngleX + (float) Math.toRadians(xx), Tail.rotateAngleY + (float) Math.toRadians(yy), Tail.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 0) / 15) * (17-(0)));
            yy = 0 + (((tickAnim - 0) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 15) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 373) {
            xx = 17 + (((tickAnim - 15) / 358) * (17-(17)));
            yy = 0 + (((tickAnim - 15) / 358) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 358) * (0-(0)));
        }
        else if (tickAnim >= 373 && tickAnim < 383) {
            xx = 17 + (((tickAnim - 373) / 10) * (11.93-(17)));
            yy = 0 + (((tickAnim - 373) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 373) / 10) * (0-(0)));
        }
        else if (tickAnim >= 383 && tickAnim < 395) {
            xx = 11.93 + (((tickAnim - 383) / 12) * (0-(11.93)));
            yy = 0 + (((tickAnim - 383) / 12) * (0-(0)));
            zz = 0 + (((tickAnim - 383) / 12) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Tail2, Tail2.rotateAngleX + (float) Math.toRadians(xx), Tail2.rotateAngleY + (float) Math.toRadians(yy), Tail2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 0) / 15) * (-3.25-(0)));
            yy = 0 + (((tickAnim - 0) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 15) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 373) {
            xx = -3.25 + (((tickAnim - 15) / 358) * (-3.25-(-3.25)));
            yy = 0 + (((tickAnim - 15) / 358) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 358) * (0-(0)));
        }
        else if (tickAnim >= 373 && tickAnim < 383) {
            xx = -3.25 + (((tickAnim - 373) / 10) * (-1.25-(-3.25)));
            yy = 0 + (((tickAnim - 373) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 373) / 10) * (0-(0)));
        }
        else if (tickAnim >= 383 && tickAnim < 390) {
            xx = -1.25 + (((tickAnim - 383) / 7) * (-5.46-(-1.25)));
            yy = 0 + (((tickAnim - 383) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 383) / 7) * (0-(0)));
        }
        else if (tickAnim >= 390 && tickAnim < 393) {
            xx = -5.46 + (((tickAnim - 390) / 3) * (-5.41-(-5.46)));
            yy = 0 + (((tickAnim - 390) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 390) / 3) * (0-(0)));
        }
        else if (tickAnim >= 393 && tickAnim < 395) {
            xx = -5.41 + (((tickAnim - 393) / 2) * (0-(-5.41)));
            yy = 0 + (((tickAnim - 393) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 393) / 2) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Tail3, Tail3.rotateAngleX + (float) Math.toRadians(xx), Tail3.rotateAngleY + (float) Math.toRadians(yy), Tail3.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 0) / 15) * (-4.25-(0)));
            yy = 0 + (((tickAnim - 0) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 15) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 373) {
            xx = -4.25 + (((tickAnim - 15) / 358) * (-4.25-(-4.25)));
            yy = 0 + (((tickAnim - 15) / 358) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 358) * (0-(0)));
        }
        else if (tickAnim >= 373 && tickAnim < 383) {
            xx = -4.25 + (((tickAnim - 373) / 10) * (-3.25-(-4.25)));
            yy = 0 + (((tickAnim - 373) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 373) / 10) * (0-(0)));
        }
        else if (tickAnim >= 383 && tickAnim < 390) {
            xx = -3.25 + (((tickAnim - 383) / 7) * (5.82-(-3.25)));
            yy = 0 + (((tickAnim - 383) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 383) / 7) * (0-(0)));
        }
        else if (tickAnim >= 390 && tickAnim < 395) {
            xx = 5.82 + (((tickAnim - 390) / 5) * (0-(5.82)));
            yy = 0 + (((tickAnim - 390) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 390) / 5) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Tail4, Tail4.rotateAngleX + (float) Math.toRadians(xx), Tail4.rotateAngleY + (float) Math.toRadians(yy), Tail4.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 120 && tickAnim < 130) {
            xx = 1 + (((tickAnim - 120) / 10) * (1-(1)));
            yy = 1 + (((tickAnim - 120) / 10) * (0.005-(1)));
            zz = 1 + (((tickAnim - 120) / 10) * (1-(1)));
        }
        else if (tickAnim >= 130 && tickAnim < 358) {
            xx = 1 + (((tickAnim - 130) / 228) * (1-(1)));
            yy = 0.005 + (((tickAnim - 130) / 228) * (0.005-(0.005)));
            zz = 1 + (((tickAnim - 130) / 228) * (1-(1)));
        }
        else if (tickAnim >= 358 && tickAnim < 365) {
            xx = 1 + (((tickAnim - 358) / 7) * (1-(1)));
            yy = 0.005 + (((tickAnim - 358) / 7) * (1-(0.005)));
            zz = 1 + (((tickAnim - 358) / 7) * (1-(1)));
        }
        else {
            xx = 1;
            yy = 1;
            zz = 1;
        }
        this.eye.setScale((float)xx, (float)yy, (float)zz);

    }

    public void animWalking(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime) {
        EntityPrehistoricFloraTeyujagua entity = (EntityPrehistoricFloraTeyujagua) entitylivingbaseIn;
        int animCycle = 25;
        double tickAnim = (entity.ticksExisted + entity.getTickOffset()) - (int) (Math.floor((double) (entity.ticksExisted + entity.getTickOffset()) / (double) animCycle) * (double) animCycle) + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;

        if (tickAnim >= 0 && tickAnim < 5) {
            xx = 22.64721 + (((tickAnim - 0) / 5) * (-3.98544-(22.64721)));
            yy = 11.5147 + (((tickAnim - 0) / 5) * (5.6094-(11.5147)));
            zz = 1.7379 + (((tickAnim - 0) / 5) * (25.321-(1.7379)));
        }
        else if (tickAnim >= 5 && tickAnim < 11) {
            xx = -3.98544 + (((tickAnim - 5) / 6) * (-62.10539-(-3.98544)));
            yy = 5.6094 + (((tickAnim - 5) / 6) * (15.4041-(5.6094)));
            zz = 25.321 + (((tickAnim - 5) / 6) * (33.4637-(25.321)));
        }
        else if (tickAnim >= 11 && tickAnim < 25) {
            xx = -62.10539 + (((tickAnim - 11) / 14) * (22.64721-(-62.10539)));
            yy = 15.4041 + (((tickAnim - 11) / 14) * (11.5147-(15.4041)));
            zz = 33.4637 + (((tickAnim - 11) / 14) * (1.7379-(33.4637)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(RightArm, RightArm.rotateAngleX + (float) Math.toRadians(xx), RightArm.rotateAngleY + (float) Math.toRadians(yy), RightArm.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 5) {
            xx = 20.5 + (((tickAnim - 0) / 5) * (4.31401-(20.5)));
            yy = 0 + (((tickAnim - 0) / 5) * (0.0902-(0)));
            zz = 0 + (((tickAnim - 0) / 5) * (-11.1216-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 8) {
            xx = 4.31401 + (((tickAnim - 5) / 3) * (-8.43938-(4.31401)));
            yy = 0.0902 + (((tickAnim - 5) / 3) * (-4.07245-(0.0902)));
            zz = -11.1216 + (((tickAnim - 5) / 3) * (-11.9496-(-11.1216)));
        }
        else if (tickAnim >= 8 && tickAnim < 11) {
            xx = -8.43938 + (((tickAnim - 8) / 3) * (9.05723-(-8.43938)));
            yy = -4.07245 + (((tickAnim - 8) / 3) * (-8.2351-(-4.07245)));
            zz = -11.9496 + (((tickAnim - 8) / 3) * (-12.7776-(-11.9496)));
        }
        else if (tickAnim >= 11 && tickAnim < 25) {
            xx = 9.05723 + (((tickAnim - 11) / 14) * (20.5-(9.05723)));
            yy = -8.2351 + (((tickAnim - 11) / 14) * (0-(-8.2351)));
            zz = -12.7776 + (((tickAnim - 11) / 14) * (0-(-12.7776)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(RightArm2, RightArm2.rotateAngleX + (float) Math.toRadians(xx), RightArm2.rotateAngleY + (float) Math.toRadians(yy), RightArm2.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 0) / 5) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 5) * (0.895-(0)));
            zz = 0 + (((tickAnim - 0) / 5) * (0.14-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 11) {
            xx = 0 + (((tickAnim - 5) / 6) * (0-(0)));
            yy = 0.895 + (((tickAnim - 5) / 6) * (0-(0.895)));
            zz = 0.14 + (((tickAnim - 5) / 6) * (0-(0.14)));
        }
        else if (tickAnim >= 11 && tickAnim < 25) {
            xx = 0 + (((tickAnim - 11) / 14) * (0-(0)));
            yy = 0 + (((tickAnim - 11) / 14) * (0-(0)));
            zz = 0 + (((tickAnim - 11) / 14) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.RightArm2.rotationPointX = this.RightArm2.rotationPointX + (float)(xx);
        this.RightArm2.rotationPointY = this.RightArm2.rotationPointY - (float)(yy);
        this.RightArm2.rotationPointZ = this.RightArm2.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 5) {
            xx = 102.73714 + (((tickAnim - 0) / 5) * (65.30313-(102.73714)));
            yy = -18.6172 + (((tickAnim - 0) / 5) * (-19.8426-(-18.6172)));
            zz = -10.2889 + (((tickAnim - 0) / 5) * (-9.4027-(-10.2889)));
        }
        else if (tickAnim >= 5 && tickAnim < 8) {
            xx = 65.30313 + (((tickAnim - 5) / 3) * (74.4629-(65.30313)));
            yy = -19.8426 + (((tickAnim - 5) / 3) * (-9.2481-(-19.8426)));
            zz = -9.4027 + (((tickAnim - 5) / 3) * (-5.56115-(-9.4027)));
        }
        else if (tickAnim >= 8 && tickAnim < 11) {
            xx = 74.4629 + (((tickAnim - 8) / 3) * (45.83137-(74.4629)));
            yy = -9.2481 + (((tickAnim - 8) / 3) * (0.73669-(-9.2481)));
            zz = -5.56115 + (((tickAnim - 8) / 3) * (-1.17029-(-5.56115)));
        }
        else if (tickAnim >= 11 && tickAnim < 14) {
            xx = 45.83137 + (((tickAnim - 11) / 3) * (27.29952-(45.83137)));
            yy = 0.73669 + (((tickAnim - 11) / 3) * (-10.68794-(0.73669)));
            zz = -1.17029 + (((tickAnim - 11) / 3) * (-5.33522-(-1.17029)));
        }
        else if (tickAnim >= 14 && tickAnim < 19) {
            xx = 27.29952 + (((tickAnim - 14) / 5) * (-2.00545-(27.29952)));
            yy = -10.68794 + (((tickAnim - 14) / 5) * (-12.54496-(-10.68794)));
            zz = -5.33522 + (((tickAnim - 14) / 5) * (-10.73935-(-5.33522)));
        }
        else if (tickAnim >= 19 && tickAnim < 25) {
            xx = -2.00545 + (((tickAnim - 19) / 6) * (102.73714-(-2.00545)));
            yy = -12.54496 + (((tickAnim - 19) / 6) * (-18.6172-(-12.54496)));
            zz = -10.73935 + (((tickAnim - 19) / 6) * (-10.2889-(-10.73935)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(RightArmHand, RightArmHand.rotateAngleX + (float) Math.toRadians(xx), RightArmHand.rotateAngleY + (float) Math.toRadians(yy), RightArmHand.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 0) / 5) * (0-(0)));
            yy = 0.775 + (((tickAnim - 0) / 5) * (1.35-(0.775)));
            zz = 0 + (((tickAnim - 0) / 5) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 5) / 3) * (0-(0)));
            yy = 1.35 + (((tickAnim - 5) / 3) * (0.895-(1.35)));
            zz = 0 + (((tickAnim - 5) / 3) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 11) {
            xx = 0 + (((tickAnim - 8) / 3) * (0-(0)));
            yy = 0.895 + (((tickAnim - 8) / 3) * (0-(0.895)));
            zz = 0 + (((tickAnim - 8) / 3) * (0-(0)));
        }
        else if (tickAnim >= 11 && tickAnim < 14) {
            xx = 0 + (((tickAnim - 11) / 3) * (0-(0)));
            yy = 0 + (((tickAnim - 11) / 3) * (1.375-(0)));
            zz = 0 + (((tickAnim - 11) / 3) * (0-(0)));
        }
        else if (tickAnim >= 14 && tickAnim < 19) {
            xx = 0 + (((tickAnim - 14) / 5) * (0-(0)));
            yy = 1.375 + (((tickAnim - 14) / 5) * (0.85-(1.375)));
            zz = 0 + (((tickAnim - 14) / 5) * (0-(0)));
        }
        else if (tickAnim >= 19 && tickAnim < 25) {
            xx = 0 + (((tickAnim - 19) / 6) * (0-(0)));
            yy = 0.85 + (((tickAnim - 19) / 6) * (0.775-(0.85)));
            zz = 0 + (((tickAnim - 19) / 6) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.RightArmHand.rotationPointX = this.RightArmHand.rotationPointX + (float)(xx);
        this.RightArmHand.rotationPointY = this.RightArmHand.rotationPointY - (float)(yy);
        this.RightArmHand.rotationPointZ = this.RightArmHand.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 6) {
            xx = -62.10539 + (((tickAnim - 0) / 6) * (-18.53285-(-62.10539)));
            yy = -15.40408 + (((tickAnim - 0) / 6) * (-13.7372-(-15.40408)));
            zz = -33.46369 + (((tickAnim - 0) / 6) * (-19.86692-(-33.46369)));
        }
        else if (tickAnim >= 6 && tickAnim < 13) {
            xx = -18.53285 + (((tickAnim - 6) / 7) * (22.64721-(-18.53285)));
            yy = -13.7372 + (((tickAnim - 6) / 7) * (-11.5147-(-13.7372)));
            zz = -19.86692 + (((tickAnim - 6) / 7) * (-1.7379-(-19.86692)));
        }
        else if (tickAnim >= 13 && tickAnim < 16) {
            xx = 22.64721 + (((tickAnim - 13) / 3) * (-3.98544-(22.64721)));
            yy = -11.5147 + (((tickAnim - 13) / 3) * (-5.60941-(-11.5147)));
            zz = -1.7379 + (((tickAnim - 13) / 3) * (-25.32098-(-1.7379)));
        }
        else if (tickAnim >= 16 && tickAnim < 19) {
            xx = -3.98544 + (((tickAnim - 16) / 3) * (-29.83601-(-3.98544)));
            yy = -5.60941 + (((tickAnim - 16) / 3) * (-1.46853-(-5.60941)));
            zz = -25.32098 + (((tickAnim - 16) / 3) * (-46.96794-(-25.32098)));
        }
        else if (tickAnim >= 19 && tickAnim < 25) {
            xx = -29.83601 + (((tickAnim - 19) / 6) * (-62.10539-(-29.83601)));
            yy = -1.46853 + (((tickAnim - 19) / 6) * (-15.40408-(-1.46853)));
            zz = -46.96794 + (((tickAnim - 19) / 6) * (-33.46369-(-46.96794)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(LeftArm, LeftArm.rotateAngleX + (float) Math.toRadians(xx), LeftArm.rotateAngleY + (float) Math.toRadians(yy), LeftArm.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 6) {
            xx = 9.05723 + (((tickAnim - 0) / 6) * (3.88984-(9.05723)));
            yy = 8.23505 + (((tickAnim - 0) / 6) * (4.70575-(8.23505)));
            zz = 12.77759 + (((tickAnim - 0) / 6) * (7.30148-(12.77759)));
        }
        else if (tickAnim >= 6 && tickAnim < 13) {
            xx = 3.88984 + (((tickAnim - 6) / 7) * (21.25-(3.88984)));
            yy = 4.70575 + (((tickAnim - 6) / 7) * (0-(4.70575)));
            zz = 7.30148 + (((tickAnim - 6) / 7) * (0-(7.30148)));
        }
        else if (tickAnim >= 13 && tickAnim < 16) {
            xx = 21.25 + (((tickAnim - 13) / 3) * (16.56401-(21.25)));
            yy = 0 + (((tickAnim - 13) / 3) * (-0.09022-(0)));
            zz = 0 + (((tickAnim - 13) / 3) * (11.12157-(0)));
        }
        else if (tickAnim >= 16 && tickAnim < 19) {
            xx = 16.56401 + (((tickAnim - 16) / 3) * (17.1289-(16.56401)));
            yy = -0.09022 + (((tickAnim - 16) / 3) * (0.4412-(-0.09022)));
            zz = 11.12157 + (((tickAnim - 16) / 3) * (23.02644-(11.12157)));
        }
        else if (tickAnim >= 19 && tickAnim < 23) {
            xx = 17.1289 + (((tickAnim - 19) / 4) * (-2.12634-(17.1289)));
            yy = 0.4412 + (((tickAnim - 19) / 4) * (4.89483-(0.4412)));
            zz = 23.02644 + (((tickAnim - 19) / 4) * (17.16995-(23.02644)));
        }
        else if (tickAnim >= 23 && tickAnim < 25) {
            xx = -2.12634 + (((tickAnim - 23) / 2) * (9.05723-(-2.12634)));
            yy = 4.89483 + (((tickAnim - 23) / 2) * (8.23505-(4.89483)));
            zz = 17.16995 + (((tickAnim - 23) / 2) * (12.77759-(17.16995)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(LeftArm2, LeftArm2.rotateAngleX + (float) Math.toRadians(xx), LeftArm2.rotateAngleY + (float) Math.toRadians(yy), LeftArm2.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 0) / 13) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 13) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 13) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 16) {
            xx = 0 + (((tickAnim - 13) / 3) * (0-(0)));
            yy = 0 + (((tickAnim - 13) / 3) * (0.895-(0)));
            zz = 0 + (((tickAnim - 13) / 3) * (0.14-(0)));
        }
        else if (tickAnim >= 16 && tickAnim < 19) {
            xx = 0 + (((tickAnim - 16) / 3) * (0-(0)));
            yy = 0.895 + (((tickAnim - 16) / 3) * (1.45-(0.895)));
            zz = 0.14 + (((tickAnim - 16) / 3) * (0.275-(0.14)));
        }
        else if (tickAnim >= 19 && tickAnim < 25) {
            xx = 0 + (((tickAnim - 19) / 6) * (0-(0)));
            yy = 1.45 + (((tickAnim - 19) / 6) * (0-(1.45)));
            zz = 0.275 + (((tickAnim - 19) / 6) * (0-(0.275)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.LeftArm2.rotationPointX = this.LeftArm2.rotationPointX + (float)(xx);
        this.LeftArm2.rotationPointY = this.LeftArm2.rotationPointY - (float)(yy);
        this.LeftArm2.rotationPointZ = this.LeftArm2.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 6) {
            xx = 45.83137 + (((tickAnim - 0) / 6) * (5.9063-(45.83137)));
            yy = 0.73669 + (((tickAnim - 0) / 6) * (6.9293-(0.73669)));
            zz = -1.17029 + (((tickAnim - 0) / 6) * (8.08959-(-1.17029)));
        }
        else if (tickAnim >= 6 && tickAnim < 8) {
            xx = 5.9063 + (((tickAnim - 6) / 2) * (-3.42828-(5.9063)));
            yy = 6.9293 + (((tickAnim - 6) / 2) * (12.77325-(6.9293)));
            zz = 8.08959 + (((tickAnim - 6) / 2) * (9.18925-(8.08959)));
        }
        else if (tickAnim >= 8 && tickAnim < 13) {
            xx = -3.42828 + (((tickAnim - 8) / 5) * (114.23714-(-3.42828)));
            yy = 12.77325 + (((tickAnim - 8) / 5) * (18.6172-(12.77325)));
            zz = 9.18925 + (((tickAnim - 8) / 5) * (10.2889-(9.18925)));
        }
        else if (tickAnim >= 13 && tickAnim < 16) {
            xx = 114.23714 + (((tickAnim - 13) / 3) * (86.55313-(114.23714)));
            yy = 18.6172 + (((tickAnim - 13) / 3) * (19.84263-(18.6172)));
            zz = 10.2889 + (((tickAnim - 13) / 3) * (9.40268-(10.2889)));
        }
        else if (tickAnim >= 16 && tickAnim < 19) {
            xx = 86.55313 + (((tickAnim - 16) / 3) * (63.39111-(86.55313)));
            yy = 19.84263 + (((tickAnim - 16) / 3) * (21.47654-(19.84263)));
            zz = 9.40268 + (((tickAnim - 16) / 3) * (8.22105-(9.40268)));
        }
        else if (tickAnim >= 19 && tickAnim < 23) {
            xx = 63.39111 + (((tickAnim - 19) / 4) * (57.77343-(63.39111)));
            yy = 21.47654 + (((tickAnim - 19) / 4) * (8.43484-(21.47654)));
            zz = 8.22105 + (((tickAnim - 19) / 4) * (4.50591-(8.22105)));
        }
        else if (tickAnim >= 23 && tickAnim < 25) {
            xx = 57.77343 + (((tickAnim - 23) / 2) * (45.83137-(57.77343)));
            yy = 8.43484 + (((tickAnim - 23) / 2) * (0.73669-(8.43484)));
            zz = 4.50591 + (((tickAnim - 23) / 2) * (-1.17029-(4.50591)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(LeftArmHand, LeftArmHand.rotateAngleX + (float) Math.toRadians(xx), LeftArmHand.rotateAngleY + (float) Math.toRadians(yy), LeftArmHand.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 4) {
            xx = 0 + (((tickAnim - 0) / 4) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 4) * (0.775-(0)));
            zz = 0 + (((tickAnim - 0) / 4) * (0-(0)));
        }
        else if (tickAnim >= 4 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 4) / 4) * (0-(0)));
            yy = 0.775 + (((tickAnim - 4) / 4) * (0-(0.775)));
            zz = 0 + (((tickAnim - 4) / 4) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 8) / 5) * (0-(0)));
            yy = 0 + (((tickAnim - 8) / 5) * (0.775-(0)));
            zz = 0 + (((tickAnim - 8) / 5) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 16) {
            xx = 0 + (((tickAnim - 13) / 3) * (0-(0)));
            yy = 0.775 + (((tickAnim - 13) / 3) * (1.35-(0.775)));
            zz = 0 + (((tickAnim - 13) / 3) * (0-(0)));
        }
        else if (tickAnim >= 16 && tickAnim < 19) {
            xx = 0 + (((tickAnim - 16) / 3) * (0-(0)));
            yy = 1.35 + (((tickAnim - 16) / 3) * (1.66-(1.35)));
            zz = 0 + (((tickAnim - 16) / 3) * (0-(0)));
        }
        else if (tickAnim >= 19 && tickAnim < 25) {
            xx = 0 + (((tickAnim - 19) / 6) * (0-(0)));
            yy = 1.66 + (((tickAnim - 19) / 6) * (0-(1.66)));
            zz = 0 + (((tickAnim - 19) / 6) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.LeftArmHand.rotationPointX = this.LeftArmHand.rotationPointX + (float)(xx);
        this.LeftArmHand.rotationPointY = this.LeftArmHand.rotationPointY - (float)(yy);
        this.LeftArmHand.rotationPointZ = this.LeftArmHand.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 4.25113 + (((tickAnim - 0) / 10) * (36.57571-(4.25113)));
            yy = -20.19358 + (((tickAnim - 0) / 10) * (-17.5963-(-20.19358)));
            zz = -1.74632 + (((tickAnim - 0) / 10) * (-1.6885-(-1.74632)));
        }
        else if (tickAnim >= 10 && tickAnim < 17) {
            xx = 36.57571 + (((tickAnim - 10) / 7) * (21.36123-(36.57571)));
            yy = -17.5963 + (((tickAnim - 10) / 7) * (-14.60237-(-17.5963)));
            zz = -1.6885 + (((tickAnim - 10) / 7) * (23.65032-(-1.6885)));
        }
        else if (tickAnim >= 17 && tickAnim < 23) {
            xx = 21.36123 + (((tickAnim - 17) / 6) * (-3.74887-(21.36123)));
            yy = -14.60237 + (((tickAnim - 17) / 6) * (-20.19358-(-14.60237)));
            zz = 23.65032 + (((tickAnim - 17) / 6) * (-1.74632-(23.65032)));
        }
        else if (tickAnim >= 23 && tickAnim < 25) {
            xx = -3.74887 + (((tickAnim - 23) / 2) * (4.25113-(-3.74887)));
            yy = -20.19358 + (((tickAnim - 23) / 2) * (-20.19358-(-20.19358)));
            zz = -1.74632 + (((tickAnim - 23) / 2) * (-1.74632-(-1.74632)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(RightLeg, RightLeg.rotateAngleX + (float) Math.toRadians(xx), RightLeg.rotateAngleY + (float) Math.toRadians(yy), RightLeg.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 10) {
            xx = -9 + (((tickAnim - 0) / 10) * (32.5-(-9)));
            yy = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 17) {
            xx = 32.5 + (((tickAnim - 10) / 7) * (-16.43597-(32.5)));
            yy = 0 + (((tickAnim - 10) / 7) * (4.01522-(0)));
            zz = 0 + (((tickAnim - 10) / 7) * (-8.68776-(0)));
        }
        else if (tickAnim >= 17 && tickAnim < 23) {
            xx = -16.43597 + (((tickAnim - 17) / 6) * (-12.75-(-16.43597)));
            yy = 4.01522 + (((tickAnim - 17) / 6) * (0-(4.01522)));
            zz = -8.68776 + (((tickAnim - 17) / 6) * (0-(-8.68776)));
        }
        else if (tickAnim >= 23 && tickAnim < 25) {
            xx = -12.75 + (((tickAnim - 23) / 2) * (-9-(-12.75)));
            yy = 0 + (((tickAnim - 23) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 23) / 2) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(RightLeg2, RightLeg2.rotateAngleX + (float) Math.toRadians(xx), RightLeg2.rotateAngleY + (float) Math.toRadians(yy), RightLeg2.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            yy = 0.35 + (((tickAnim - 0) / 10) * (0-(0.35)));
            zz = 0 + (((tickAnim - 0) / 10) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 17) {
            xx = 0 + (((tickAnim - 10) / 7) * (0-(0)));
            yy = 0 + (((tickAnim - 10) / 7) * (2.6-(0)));
            zz = 0 + (((tickAnim - 10) / 7) * (0-(0)));
        }
        else if (tickAnim >= 17 && tickAnim < 23) {
            xx = 0 + (((tickAnim - 17) / 6) * (0-(0)));
            yy = 2.6 + (((tickAnim - 17) / 6) * (0-(2.6)));
            zz = 0 + (((tickAnim - 17) / 6) * (0-(0)));
        }
        else if (tickAnim >= 23 && tickAnim < 25) {
            xx = 0 + (((tickAnim - 23) / 2) * (0-(0)));
            yy = 0 + (((tickAnim - 23) / 2) * (0.35-(0)));
            zz = 0 + (((tickAnim - 23) / 2) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.RightLeg2.rotationPointX = this.RightLeg2.rotationPointX + (float)(xx);
        this.RightLeg2.rotationPointY = this.RightLeg2.rotationPointY - (float)(yy);
        this.RightLeg2.rotationPointZ = this.RightLeg2.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 2 + (((tickAnim - 0) / 3) * (-16.08-(2)));
            yy = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 3) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 6) {
            xx = -16.08 + (((tickAnim - 3) / 3) * (-13.02-(-16.08)));
            yy = 0 + (((tickAnim - 3) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 3) / 3) * (0-(0)));
        }
        else if (tickAnim >= 6 && tickAnim < 10) {
            xx = -13.02 + (((tickAnim - 6) / 4) * (38.75-(-13.02)));
            yy = 0 + (((tickAnim - 6) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 6) / 4) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 17) {
            xx = 38.75 + (((tickAnim - 10) / 7) * (62.25-(38.75)));
            yy = 0 + (((tickAnim - 10) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 7) * (0-(0)));
        }
        else if (tickAnim >= 17 && tickAnim < 21) {
            xx = 62.25 + (((tickAnim - 17) / 4) * (-4.71-(62.25)));
            yy = 0 + (((tickAnim - 17) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 17) / 4) * (0-(0)));
        }
        else if (tickAnim >= 21 && tickAnim < 23) {
            xx = -4.71 + (((tickAnim - 21) / 2) * (13.75-(-4.71)));
            yy = 0 + (((tickAnim - 21) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 21) / 2) * (0-(0)));
        }
        else if (tickAnim >= 23 && tickAnim < 25) {
            xx = 13.75 + (((tickAnim - 23) / 2) * (2-(13.75)));
            yy = 0 + (((tickAnim - 23) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 23) / 2) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(RightLegFoot, RightLegFoot.rotateAngleX + (float) Math.toRadians(xx), RightLegFoot.rotateAngleY + (float) Math.toRadians(yy), RightLegFoot.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 17) {
            xx = 0 + (((tickAnim - 0) / 17) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 17) * (2.125-(0)));
            zz = 0 + (((tickAnim - 0) / 17) * (0-(0)));
        }
        else if (tickAnim >= 17 && tickAnim < 21) {
            xx = 0 + (((tickAnim - 17) / 4) * (0-(0)));
            yy = 2.125 + (((tickAnim - 17) / 4) * (0-(2.125)));
            zz = 0 + (((tickAnim - 17) / 4) * (0-(0)));
        }
        else if (tickAnim >= 21 && tickAnim < 23) {
            xx = 0 + (((tickAnim - 21) / 2) * (0-(0)));
            yy = 0 + (((tickAnim - 21) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 21) / 2) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.RightLegFoot.rotationPointX = this.RightLegFoot.rotationPointX + (float)(xx);
        this.RightLegFoot.rotationPointY = this.RightLegFoot.rotationPointY - (float)(yy);
        this.RightLegFoot.rotationPointZ = this.RightLegFoot.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 6) {
            xx = 36.57571 + (((tickAnim - 0) / 6) * (22.90115-(36.57571)));
            yy = 17.5963 + (((tickAnim - 0) / 6) * (15.76588-(17.5963)));
            zz = 1.68854 + (((tickAnim - 0) / 6) * (-21.94451-(1.68854)));
        }
        else if (tickAnim >= 6 && tickAnim < 11) {
            xx = 22.90115 + (((tickAnim - 6) / 5) * (-1.24887-(22.90115)));
            yy = 15.76588 + (((tickAnim - 6) / 5) * (20.1936-(15.76588)));
            zz = -21.94451 + (((tickAnim - 6) / 5) * (1.7463-(-21.94451)));
        }
        else if (tickAnim >= 11 && tickAnim < 25) {
            xx = -1.24887 + (((tickAnim - 11) / 14) * (36.57571-(-1.24887)));
            yy = 20.1936 + (((tickAnim - 11) / 14) * (17.5963-(20.1936)));
            zz = 1.7463 + (((tickAnim - 11) / 14) * (1.68854-(1.7463)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(LeftLeg, LeftLeg.rotateAngleX + (float) Math.toRadians(xx), LeftLeg.rotateAngleY + (float) Math.toRadians(yy), LeftLeg.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 6) {
            xx = 32.5 + (((tickAnim - 0) / 6) * (-10.87765-(32.5)));
            yy = 0 + (((tickAnim - 0) / 6) * (-2.56276-(0)));
            zz = 0 + (((tickAnim - 0) / 6) * (5.70232-(0)));
        }
        else if (tickAnim >= 6 && tickAnim < 11) {
            xx = -10.87765 + (((tickAnim - 6) / 5) * (-12-(-10.87765)));
            yy = -2.56276 + (((tickAnim - 6) / 5) * (0-(-2.56276)));
            zz = 5.70232 + (((tickAnim - 6) / 5) * (0-(5.70232)));
        }
        else if (tickAnim >= 11 && tickAnim < 25) {
            xx = -12 + (((tickAnim - 11) / 14) * (32.5-(-12)));
            yy = 0 + (((tickAnim - 11) / 14) * (0-(0)));
            zz = 0 + (((tickAnim - 11) / 14) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(LeftLeg2, LeftLeg2.rotateAngleX + (float) Math.toRadians(xx), LeftLeg2.rotateAngleY + (float) Math.toRadians(yy), LeftLeg2.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 6) {
            xx = 0 + (((tickAnim - 0) / 6) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 6) * (1.63-(0)));
            zz = 0 + (((tickAnim - 0) / 6) * (-0.35-(0)));
        }
        else if (tickAnim >= 6 && tickAnim < 11) {
            xx = 0 + (((tickAnim - 6) / 5) * (0-(0)));
            yy = 1.63 + (((tickAnim - 6) / 5) * (0.35-(1.63)));
            zz = -0.35 + (((tickAnim - 6) / 5) * (0-(-0.35)));
        }
        else if (tickAnim >= 11 && tickAnim < 25) {
            xx = 0 + (((tickAnim - 11) / 14) * (0-(0)));
            yy = 0.35 + (((tickAnim - 11) / 14) * (0-(0.35)));
            zz = 0 + (((tickAnim - 11) / 14) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.LeftLeg2.rotationPointX = this.LeftLeg2.rotationPointX + (float)(xx);
        this.LeftLeg2.rotationPointY = this.LeftLeg2.rotationPointY - (float)(yy);
        this.LeftLeg2.rotationPointZ = this.LeftLeg2.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 6) {
            xx = 38.75 + (((tickAnim - 0) / 6) * (54.88-(38.75)));
            yy = 0 + (((tickAnim - 0) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 6) * (0-(0)));
        }
        else if (tickAnim >= 6 && tickAnim < 9) {
            xx = 54.88 + (((tickAnim - 6) / 3) * (-7.8-(54.88)));
            yy = 0 + (((tickAnim - 6) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 6) / 3) * (0-(0)));
        }
        else if (tickAnim >= 9 && tickAnim < 11) {
            xx = -7.8 + (((tickAnim - 9) / 2) * (13.25-(-7.8)));
            yy = 0 + (((tickAnim - 9) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 9) / 2) * (0-(0)));
        }
        else if (tickAnim >= 11 && tickAnim < 13) {
            xx = 13.25 + (((tickAnim - 11) / 2) * (-4.71-(13.25)));
            yy = 0 + (((tickAnim - 11) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 11) / 2) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 17) {
            xx = -4.71 + (((tickAnim - 13) / 4) * (-14.42-(-4.71)));
            yy = 0 + (((tickAnim - 13) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 13) / 4) * (0-(0)));
        }
        else if (tickAnim >= 17 && tickAnim < 20) {
            xx = -14.42 + (((tickAnim - 17) / 3) * (-12.65-(-14.42)));
            yy = 0 + (((tickAnim - 17) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 17) / 3) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 25) {
            xx = -12.65 + (((tickAnim - 20) / 5) * (38.75-(-12.65)));
            yy = 0 + (((tickAnim - 20) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 5) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(LeftLegFoot, LeftLegFoot.rotateAngleX + (float) Math.toRadians(xx), LeftLegFoot.rotateAngleY + (float) Math.toRadians(yy), LeftLegFoot.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            yy = 0.425 + (((tickAnim - 0) / 3) * (2.585-(0.425)));
            zz = 0.2 + (((tickAnim - 0) / 3) * (0.575-(0.2)));
        }
        else if (tickAnim >= 3 && tickAnim < 6) {
            xx = 0 + (((tickAnim - 3) / 3) * (0-(0)));
            yy = 2.585 + (((tickAnim - 3) / 3) * (2.6-(2.585)));
            zz = 0.575 + (((tickAnim - 3) / 3) * (0-(0.575)));
        }
        else if (tickAnim >= 6 && tickAnim < 9) {
            xx = 0 + (((tickAnim - 6) / 3) * (0-(0)));
            yy = 2.6 + (((tickAnim - 6) / 3) * (0-(2.6)));
            zz = 0 + (((tickAnim - 6) / 3) * (0-(0)));
        }
        else if (tickAnim >= 9 && tickAnim < 11) {
            xx = 0 + (((tickAnim - 9) / 2) * (0-(0)));
            yy = 0 + (((tickAnim - 9) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 9) / 2) * (0-(0)));
        }
        else if (tickAnim >= 11 && tickAnim < 17) {
            xx = 0 + (((tickAnim - 11) / 6) * (0-(0)));
            yy = 0 + (((tickAnim - 11) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 11) / 6) * (0-(0)));
        }
        else if (tickAnim >= 17 && tickAnim < 25) {
            xx = 0 + (((tickAnim - 17) / 8) * (0-(0)));
            yy = 0 + (((tickAnim - 17) / 8) * (0.425-(0)));
            zz = 0 + (((tickAnim - 17) / 8) * (0.2-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.LeftLegFoot.rotationPointX = this.LeftLegFoot.rotationPointX + (float)(xx);
        this.LeftLegFoot.rotationPointY = this.LeftLegFoot.rotationPointY - (float)(yy);
        this.LeftLegFoot.rotationPointZ = this.LeftLegFoot.rotationPointZ + (float)(zz);



        this.setRotateAngle(Base, Base.rotateAngleX + (float) Math.toRadians(0), Base.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*288-5))*3), Base.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*288-30))*2));
        this.Base.rotationPointX = this.Base.rotationPointX + (float)(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*288))*0.1);
        this.Base.rotationPointY = this.Base.rotationPointY - (float)(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*288/0.5-30))*-0.1);
        this.Base.rotationPointZ = this.Base.rotationPointZ + (float)(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*288/0.5))*-0.1);


        this.setRotateAngle(Body, Body.rotateAngleX + (float) Math.toRadians(0), Body.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*288+100))*3), Body.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*288-60))*-4));


        this.setRotateAngle(Chest, Chest.rotateAngleX + (float) Math.toRadians(0), Chest.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*288+190))*3), Chest.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*288-120))*-2));


        this.setRotateAngle(Neck, Neck.rotateAngleX + (float) Math.toRadians(0), Neck.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*288+250))*5), Neck.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*288-150))*-2));


        this.setRotateAngle(Neck2, Neck2.rotateAngleX + (float) Math.toRadians(0), Neck2.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*288+320))*3), Neck2.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*288-190))*-2));


        this.setRotateAngle(Head, Head.rotateAngleX + (float) Math.toRadians(0), Head.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*288+330))*-3), Head.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*288-220))*-2));


        this.setRotateAngle(Tail, Tail.rotateAngleX + (float) Math.toRadians(0), Tail.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*288-20))*3), Tail.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*288-80))*-2));


        this.setRotateAngle(Tail2, Tail2.rotateAngleX + (float) Math.toRadians(0), Tail2.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*288-70))*3), Tail2.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*288-80))*-2));


        this.setRotateAngle(Tail3, Tail3.rotateAngleX + (float) Math.toRadians(0), Tail3.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*288-150))*3), Tail3.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*288-80))*-2));


        this.setRotateAngle(Tail4, Tail4.rotateAngleX + (float) Math.toRadians(0), Tail4.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*288-190))*3), Tail4.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*288-80))*-2));


    }

    public void animRunning(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime) {
        EntityPrehistoricFloraTeyujagua entity = (EntityPrehistoricFloraTeyujagua) entitylivingbaseIn;
        int animCycle = 12;
        double tickAnim = (entity.ticksExisted + entity.getTickOffset()) - (int) (Math.floor((double) (entity.ticksExisted + entity.getTickOffset()) / (double) animCycle) * (double) animCycle) + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;
        this.setRotateAngle(Base, Base.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*587/0.5))*-0.7), Base.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*578))*7), Base.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*578+30))*-5));
        this.Base.rotationPointX = this.Base.rotationPointX + (float)(0);
        this.Base.rotationPointY = this.Base.rotationPointY - (float)(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*578/0.5))*-0.3);
        this.Base.rotationPointZ = this.Base.rotationPointZ + (float)(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*570/0.5))*0.2);


        this.setRotateAngle(Body, Body.rotateAngleX + (float) Math.toRadians(0), Body.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*578+130))*7), Body.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*578-20))*5));
        this.Body.rotationPointX = this.Body.rotationPointX + (float)(0);
        this.Body.rotationPointY = this.Body.rotationPointY - (float)(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*578/0.5-30))*-0.2);
        this.Body.rotationPointZ = this.Body.rotationPointZ + (float)(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*570/0.5))*-0.1);


        this.setRotateAngle(Chest, Chest.rotateAngleX + (float) Math.toRadians(0), Chest.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*578+160))*7), Chest.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*578+70))*5));
        this.Chest.rotationPointX = this.Chest.rotationPointX + (float)(0);
        this.Chest.rotationPointY = this.Chest.rotationPointY - (float)(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*578/0.5-60))*-0.1);
        this.Chest.rotationPointZ = this.Chest.rotationPointZ + (float)(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*570/0.5))*-0.1);


        this.setRotateAngle(Neck, Neck.rotateAngleX + (float) Math.toRadians(0), Neck.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*578+230))*7), Neck.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*578))*5));
        this.Neck.rotationPointX = this.Neck.rotationPointX + (float)(0);
        this.Neck.rotationPointY = this.Neck.rotationPointY - (float)(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*578/0.5-90))*-0.1);
        this.Neck.rotationPointZ = this.Neck.rotationPointZ + (float)(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*570/0.5))*-0.1);


        this.setRotateAngle(Neck2, Neck2.rotateAngleX + (float) Math.toRadians(0), Neck2.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*578+270))*7), Neck2.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*578))*2));
        this.Neck2.rotationPointX = this.Neck2.rotationPointX + (float)(0);
        this.Neck2.rotationPointY = this.Neck2.rotationPointY - (float)(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*578/0.5-120))*-0.1);
        this.Neck2.rotationPointZ = this.Neck2.rotationPointZ + (float)(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*570/0.5))*-0.1);


        this.setRotateAngle(Head, Head.rotateAngleX + (float) Math.toRadians(0), Head.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*578+320))*7), Head.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*578))*2));
        this.Head.rotationPointX = this.Head.rotationPointX + (float)(0);
        this.Head.rotationPointY = this.Head.rotationPointY - (float)(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*578/0.5-150))*-0.1);
        this.Head.rotationPointZ = this.Head.rotationPointZ + (float)(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*570/0.5))*-0.1);



        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 23.75 + (((tickAnim - 0) / 3) * (-37.79449-(23.75)));
            yy = 0 + (((tickAnim - 0) / 3) * (14.35976-(0)));
            zz = 0 + (((tickAnim - 0) / 3) * (41.30752-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 6) {
            xx = -37.79449 + (((tickAnim - 3) / 3) * (-64.55431-(-37.79449)));
            yy = 14.35976 + (((tickAnim - 3) / 3) * (19.2803-(14.35976)));
            zz = 41.30752 + (((tickAnim - 3) / 3) * (17.3326-(41.30752)));
        }
        else if (tickAnim >= 6 && tickAnim < 13) {
            xx = -64.55431 + (((tickAnim - 6) / 7) * (23.75-(-64.55431)));
            yy = 19.2803 + (((tickAnim - 6) / 7) * (0-(19.2803)));
            zz = 17.3326 + (((tickAnim - 6) / 7) * (0-(17.3326)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(RightArm, RightArm.rotateAngleX + (float) Math.toRadians(xx), RightArm.rotateAngleY + (float) Math.toRadians(yy), RightArm.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 16.5 + (((tickAnim - 0) / 3) * (-31.93-(16.5)));
            yy = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 3) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 6) {
            xx = -31.93 + (((tickAnim - 3) / 3) * (12-(-31.93)));
            yy = 0 + (((tickAnim - 3) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 3) / 3) * (0-(0)));
        }
        else if (tickAnim >= 6 && tickAnim < 13) {
            xx = 12 + (((tickAnim - 6) / 7) * (16.5-(12)));
            yy = 0 + (((tickAnim - 6) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 6) / 7) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(RightArm2, RightArm2.rotateAngleX + (float) Math.toRadians(xx), RightArm2.rotateAngleY + (float) Math.toRadians(yy), RightArm2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 111 + (((tickAnim - 0) / 3) * (100.55142-(111)));
            yy = 0 + (((tickAnim - 0) / 3) * (-2.8872-(0)));
            zz = 0 + (((tickAnim - 0) / 3) * (-1.43714-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 6) {
            xx = 100.55142 + (((tickAnim - 3) / 3) * (52.26329-(100.55142)));
            yy = -2.8872 + (((tickAnim - 3) / 3) * (-10.1052-(-2.8872)));
            zz = -1.43714 + (((tickAnim - 3) / 3) * (-5.03-(-1.43714)));
        }
        else if (tickAnim >= 6 && tickAnim < 8) {
            xx = 52.26329 + (((tickAnim - 6) / 2) * (16.40608-(52.26329)));
            yy = -10.1052 + (((tickAnim - 6) / 2) * (-11.89078-(-10.1052)));
            zz = -5.03 + (((tickAnim - 6) / 2) * (-5.66483-(-5.03)));
        }
        else if (tickAnim >= 8 && tickAnim < 11) {
            xx = 16.40608 + (((tickAnim - 8) / 3) * (19.91243-(16.40608)));
            yy = -11.89078 + (((tickAnim - 8) / 3) * (-4.75631-(-11.89078)));
            zz = -5.66483 + (((tickAnim - 8) / 3) * (-2.26593-(-5.66483)));
        }
        else if (tickAnim >= 11 && tickAnim < 13) {
            xx = 19.91243 + (((tickAnim - 11) / 2) * (111-(19.91243)));
            yy = -4.75631 + (((tickAnim - 11) / 2) * (0-(-4.75631)));
            zz = -2.26593 + (((tickAnim - 11) / 2) * (0-(-2.26593)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(RightArmHand, RightArmHand.rotateAngleX + (float) Math.toRadians(xx), RightArmHand.rotateAngleY + (float) Math.toRadians(yy), RightArmHand.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            yy = 0.75 + (((tickAnim - 0) / 3) * (1.39-(0.75)));
            zz = 0.23 + (((tickAnim - 0) / 3) * (-0.12-(0.23)));
        }
        else if (tickAnim >= 3 && tickAnim < 6) {
            xx = 0 + (((tickAnim - 3) / 3) * (0-(0)));
            yy = 1.39 + (((tickAnim - 3) / 3) * (0.15-(1.39)));
            zz = -0.12 + (((tickAnim - 3) / 3) * (0.225-(-0.12)));
        }
        else if (tickAnim >= 6 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 6) / 2) * (0-(0)));
            yy = 0.15 + (((tickAnim - 6) / 2) * (1.8-(0.15)));
            zz = 0.225 + (((tickAnim - 6) / 2) * (0-(0.225)));
        }
        else if (tickAnim >= 8 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 8) / 5) * (0-(0)));
            yy = 1.8 + (((tickAnim - 8) / 5) * (0.75-(1.8)));
            zz = 0 + (((tickAnim - 8) / 5) * (0.23-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.RightArmHand.rotationPointX = this.RightArmHand.rotationPointX + (float)(xx);
        this.RightArmHand.rotationPointY = this.RightArmHand.rotationPointY - (float)(yy);
        this.RightArmHand.rotationPointZ = this.RightArmHand.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 6) {
            xx = -64.55431 + (((tickAnim - 0) / 6) * (23.75-(-64.55431)));
            yy = -19.28027 + (((tickAnim - 0) / 6) * (0-(-19.28027)));
            zz = -17.33259 + (((tickAnim - 0) / 6) * (0-(-17.33259)));
        }
        else if (tickAnim >= 6 && tickAnim < 9) {
            xx = 23.75 + (((tickAnim - 6) / 3) * (-35.18531-(23.75)));
            yy = 0 + (((tickAnim - 6) / 3) * (1.93868-(0)));
            zz = 0 + (((tickAnim - 6) / 3) * (-41.45143-(0)));
        }
        else if (tickAnim >= 9 && tickAnim < 13) {
            xx = -35.18531 + (((tickAnim - 9) / 4) * (-64.55431-(-35.18531)));
            yy = 1.93868 + (((tickAnim - 9) / 4) * (-19.28027-(1.93868)));
            zz = -41.45143 + (((tickAnim - 9) / 4) * (-17.33259-(-41.45143)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(LeftArm, LeftArm.rotateAngleX + (float) Math.toRadians(xx), LeftArm.rotateAngleY + (float) Math.toRadians(yy), LeftArm.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 6) {
            xx = 12 + (((tickAnim - 0) / 6) * (16.5-(12)));
            yy = 0 + (((tickAnim - 0) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 6) * (0-(0)));
        }
        else if (tickAnim >= 6 && tickAnim < 10) {
            xx = 16.5 + (((tickAnim - 6) / 4) * (-13.57-(16.5)));
            yy = 0 + (((tickAnim - 6) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 6) / 4) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 13) {
            xx = -13.57 + (((tickAnim - 10) / 3) * (12-(-13.57)));
            yy = 0 + (((tickAnim - 10) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 3) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(LeftArm2, LeftArm2.rotateAngleX + (float) Math.toRadians(xx), LeftArm2.rotateAngleY + (float) Math.toRadians(yy), LeftArm2.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 6 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 6) / 2) * (0-(0)));
            yy = 0 + (((tickAnim - 6) / 2) * (0.46-(0)));
            zz = 0 + (((tickAnim - 6) / 2) * (0.175-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 8) / 2) * (0-(0)));
            yy = 0.46 + (((tickAnim - 8) / 2) * (0.425-(0.46)));
            zz = 0.175 + (((tickAnim - 8) / 2) * (0-(0.175)));
        }
        else if (tickAnim >= 10 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 10) / 3) * (0-(0)));
            yy = 0.425 + (((tickAnim - 10) / 3) * (0-(0.425)));
            zz = 0 + (((tickAnim - 10) / 3) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.LeftArm2.rotationPointX = this.LeftArm2.rotationPointX + (float)(xx);
        this.LeftArm2.rotationPointY = this.LeftArm2.rotationPointY - (float)(yy);
        this.LeftArm2.rotationPointZ = this.LeftArm2.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 52.26329 + (((tickAnim - 0) / 3) * (15.53956-(52.26329)));
            yy = 10.10516 + (((tickAnim - 0) / 3) * (6.31573-(10.10516)));
            zz = 5.03003 + (((tickAnim - 0) / 3) * (3.14377-(5.03003)));
        }
        else if (tickAnim >= 3 && tickAnim < 4) {
            xx = 15.53956 + (((tickAnim - 3) / 1) * (16.24868-(15.53956)));
            yy = 6.31573 + (((tickAnim - 3) / 1) * (14.31986-(6.31573)));
            zz = 3.14377 + (((tickAnim - 3) / 1) * (5.29786-(3.14377)));
        }
        else if (tickAnim >= 4 && tickAnim < 6) {
            xx = 16.24868 + (((tickAnim - 4) / 2) * (111-(16.24868)));
            yy = 14.31986 + (((tickAnim - 4) / 2) * (0-(14.31986)));
            zz = 5.29786 + (((tickAnim - 4) / 2) * (0-(5.29786)));
        }
        else if (tickAnim >= 6 && tickAnim < 13) {
            xx = 111 + (((tickAnim - 6) / 7) * (52.26329-(111)));
            yy = 0 + (((tickAnim - 6) / 7) * (10.10516-(0)));
            zz = 0 + (((tickAnim - 6) / 7) * (5.03003-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(LeftArmHand, LeftArmHand.rotateAngleX + (float) Math.toRadians(xx), LeftArmHand.rotateAngleY + (float) Math.toRadians(yy), LeftArmHand.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 1) {
            xx = 0 + (((tickAnim - 0) / 1) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 1) * (1.39-(0)));
            zz = 0.225 + (((tickAnim - 0) / 1) * (0.23-(0.225)));
        }
        else if (tickAnim >= 1 && tickAnim < 3) {
            xx = 0 + (((tickAnim - 1) / 2) * (0-(0)));
            yy = 1.39 + (((tickAnim - 1) / 2) * (1.905-(1.39)));
            zz = 0.23 + (((tickAnim - 1) / 2) * (0.23-(0.23)));
        }
        else if (tickAnim >= 3 && tickAnim < 6) {
            xx = 0 + (((tickAnim - 3) / 3) * (0-(0)));
            yy = 1.905 + (((tickAnim - 3) / 3) * (0.75-(1.905)));
            zz = 0.23 + (((tickAnim - 3) / 3) * (0.23-(0.23)));
        }
        else if (tickAnim >= 6 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 6) / 2) * (0-(0)));
            yy = 0.75 + (((tickAnim - 6) / 2) * (2.385-(0.75)));
            zz = 0.23 + (((tickAnim - 6) / 2) * (-0.25-(0.23)));
        }
        else if (tickAnim >= 8 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 8) / 2) * (0-(0)));
            yy = 2.385 + (((tickAnim - 8) / 2) * (1.67-(2.385)));
            zz = -0.25 + (((tickAnim - 8) / 2) * (-0.72-(-0.25)));
        }
        else if (tickAnim >= 10 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 10) / 3) * (0-(0)));
            yy = 1.67 + (((tickAnim - 10) / 3) * (0-(1.67)));
            zz = -0.72 + (((tickAnim - 10) / 3) * (0.225-(-0.72)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.LeftArmHand.rotationPointX = this.LeftArmHand.rotationPointX + (float)(xx);
        this.LeftArmHand.rotationPointY = this.LeftArmHand.rotationPointY - (float)(yy);
        this.LeftArmHand.rotationPointZ = this.LeftArmHand.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 6) {
            xx = -7.82153 + (((tickAnim - 0) / 6) * (46.71831-(-7.82153)));
            yy = -19.45961 + (((tickAnim - 0) / 6) * (-12.2626-(-19.45961)));
            zz = -4.23079 + (((tickAnim - 0) / 6) * (0.9834-(-4.23079)));
        }
        else if (tickAnim >= 6 && tickAnim < 9) {
            xx = 46.71831 + (((tickAnim - 6) / 3) * (22.0906-(46.71831)));
            yy = -12.2626 + (((tickAnim - 6) / 3) * (-14.27258-(-12.2626)));
            zz = 0.9834 + (((tickAnim - 6) / 3) * (10.31385-(0.9834)));
        }
        else if (tickAnim >= 9 && tickAnim < 13) {
            xx = 22.0906 + (((tickAnim - 9) / 4) * (-7.82153-(22.0906)));
            yy = -14.27258 + (((tickAnim - 9) / 4) * (-19.45961-(-14.27258)));
            zz = 10.31385 + (((tickAnim - 9) / 4) * (-4.23079-(10.31385)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(RightLeg, RightLeg.rotateAngleX + (float) Math.toRadians(xx), RightLeg.rotateAngleY + (float) Math.toRadians(yy), RightLeg.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 6) {
            xx = -20.75 + (((tickAnim - 0) / 6) * (26.98109-(-20.75)));
            yy = 0 + (((tickAnim - 0) / 6) * (-0.30051-(0)));
            zz = 0 + (((tickAnim - 0) / 6) * (0.19546-(0)));
        }
        else if (tickAnim >= 6 && tickAnim < 8) {
            xx = 26.98109 + (((tickAnim - 6) / 2) * (31.04831-(26.98109)));
            yy = -0.30051 + (((tickAnim - 6) / 2) * (-0.22538-(-0.30051)));
            zz = 0.19546 + (((tickAnim - 6) / 2) * (0.1466-(0.19546)));
        }
        else if (tickAnim >= 8 && tickAnim < 10) {
            xx = 31.04831 + (((tickAnim - 8) / 2) * (-2.85084-(31.04831)));
            yy = -0.22538 + (((tickAnim - 8) / 2) * (-0.11269-(-0.22538)));
            zz = 0.1466 + (((tickAnim - 8) / 2) * (0.0733-(0.1466)));
        }
        else if (tickAnim >= 10 && tickAnim < 13) {
            xx = -2.85084 + (((tickAnim - 10) / 3) * (-20.75-(-2.85084)));
            yy = -0.11269 + (((tickAnim - 10) / 3) * (0-(-0.11269)));
            zz = 0.0733 + (((tickAnim - 10) / 3) * (0-(0.0733)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(RightLeg2, RightLeg2.rotateAngleX + (float) Math.toRadians(xx), RightLeg2.rotateAngleY + (float) Math.toRadians(yy), RightLeg2.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 6) {
            xx = 0 + (((tickAnim - 0) / 6) * (0-(0)));
            yy = -0.3 + (((tickAnim - 0) / 6) * (0-(-0.3)));
            zz = 0 + (((tickAnim - 0) / 6) * (0-(0)));
        }
        else if (tickAnim >= 6 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 6) / 2) * (0-(0)));
            yy = 0 + (((tickAnim - 6) / 2) * (0.355-(0)));
            zz = 0 + (((tickAnim - 6) / 2) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 8) / 2) * (0-(0)));
            yy = 0.355 + (((tickAnim - 8) / 2) * (1.88-(0.355)));
            zz = 0 + (((tickAnim - 8) / 2) * (-0.275-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 10) / 3) * (0-(0)));
            yy = 1.88 + (((tickAnim - 10) / 3) * (-0.3-(1.88)));
            zz = -0.275 + (((tickAnim - 10) / 3) * (0-(-0.275)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.RightLeg2.rotationPointX = this.RightLeg2.rotationPointX + (float)(xx);
        this.RightLeg2.rotationPointY = this.RightLeg2.rotationPointY - (float)(yy);
        this.RightLeg2.rotationPointZ = this.RightLeg2.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 28 + (((tickAnim - 0) / 3) * (-13.75-(28)));
            yy = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 3) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 4) {
            xx = -13.75 + (((tickAnim - 3) / 1) * (-2.87-(-13.75)));
            yy = 0 + (((tickAnim - 3) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 3) / 1) * (0-(0)));
        }
        else if (tickAnim >= 4 && tickAnim < 6) {
            xx = -2.87 + (((tickAnim - 4) / 2) * (52.5-(-2.87)));
            yy = 0 + (((tickAnim - 4) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 4) / 2) * (0-(0)));
        }
        else if (tickAnim >= 6 && tickAnim < 13) {
            xx = 52.5 + (((tickAnim - 6) / 7) * (28-(52.5)));
            yy = 0 + (((tickAnim - 6) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 6) / 7) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(RightLegFoot, RightLegFoot.rotateAngleX + (float) Math.toRadians(xx), RightLegFoot.rotateAngleY + (float) Math.toRadians(yy), RightLegFoot.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 2) {
            xx = 0 + (((tickAnim - 0) / 2) * (0-(0)));
            yy = 0.225 + (((tickAnim - 0) / 2) * (1.415-(0.225)));
            zz = 0 + (((tickAnim - 0) / 2) * (0-(0)));
        }
        else if (tickAnim >= 2 && tickAnim < 3) {
            xx = 0 + (((tickAnim - 2) / 1) * (0-(0)));
            yy = 1.415 + (((tickAnim - 2) / 1) * (1.05-(1.415)));
            zz = 0 + (((tickAnim - 2) / 1) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 4) {
            xx = 0 + (((tickAnim - 3) / 1) * (0-(0)));
            yy = 1.05 + (((tickAnim - 3) / 1) * (1.18-(1.05)));
            zz = 0 + (((tickAnim - 3) / 1) * (0.3-(0)));
        }
        else if (tickAnim >= 4 && tickAnim < 6) {
            xx = 0 + (((tickAnim - 4) / 2) * (0-(0)));
            yy = 1.18 + (((tickAnim - 4) / 2) * (0-(1.18)));
            zz = 0.3 + (((tickAnim - 4) / 2) * (0-(0.3)));
        }
        else if (tickAnim >= 6 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 6) / 2) * (0-(0)));
            yy = 0 + (((tickAnim - 6) / 2) * (1.55-(0)));
            zz = 0 + (((tickAnim - 6) / 2) * (0.175-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 8) / 2) * (0-(0)));
            yy = 1.55 + (((tickAnim - 8) / 2) * (1.945-(1.55)));
            zz = 0.175 + (((tickAnim - 8) / 2) * (0.18-(0.175)));
        }
        else if (tickAnim >= 10 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 10) / 3) * (0-(0)));
            yy = 1.945 + (((tickAnim - 10) / 3) * (0.225-(1.945)));
            zz = 0.18 + (((tickAnim - 10) / 3) * (0-(0.18)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.RightLegFoot.rotationPointX = this.RightLegFoot.rotationPointX + (float)(xx);
        this.RightLegFoot.rotationPointY = this.RightLegFoot.rotationPointY - (float)(yy);
        this.RightLegFoot.rotationPointZ = this.RightLegFoot.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 46.71831 + (((tickAnim - 0) / 3) * (21.79328-(46.71831)));
            yy = 12.2626 + (((tickAnim - 0) / 3) * (14.41557-(12.2626)));
            zz = -0.98339 + (((tickAnim - 0) / 3) * (-9.03695-(-0.98339)));
        }
        else if (tickAnim >= 3 && tickAnim < 5) {
            xx = 21.79328 + (((tickAnim - 3) / 2) * (-7.82153-(21.79328)));
            yy = 14.41557 + (((tickAnim - 3) / 2) * (19.4596-(14.41557)));
            zz = -9.03695 + (((tickAnim - 3) / 2) * (4.2308-(-9.03695)));
        }
        else if (tickAnim >= 5 && tickAnim < 13) {
            xx = -7.82153 + (((tickAnim - 5) / 8) * (46.71831-(-7.82153)));
            yy = 19.4596 + (((tickAnim - 5) / 8) * (12.2626-(19.4596)));
            zz = 4.2308 + (((tickAnim - 5) / 8) * (-0.98339-(4.2308)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(LeftLeg, LeftLeg.rotateAngleX + (float) Math.toRadians(xx), LeftLeg.rotateAngleY + (float) Math.toRadians(yy), LeftLeg.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 2) {
            xx = 23.5 + (((tickAnim - 0) / 2) * (36.08-(23.5)));
            yy = 0 + (((tickAnim - 0) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 2) * (0-(0)));
        }
        else if (tickAnim >= 2 && tickAnim < 5) {
            xx = 36.08 + (((tickAnim - 2) / 3) * (-20.75-(36.08)));
            yy = 0 + (((tickAnim - 2) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 2) / 3) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 13) {
            xx = -20.75 + (((tickAnim - 5) / 8) * (23.5-(-20.75)));
            yy = 0 + (((tickAnim - 5) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 5) / 8) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(LeftLeg2, LeftLeg2.rotateAngleX + (float) Math.toRadians(xx), LeftLeg2.rotateAngleY + (float) Math.toRadians(yy), LeftLeg2.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 3) * (0.85-(0)));
            zz = 0 + (((tickAnim - 0) / 3) * (-0.4-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 3) / 2) * (0-(0)));
            yy = 0.85 + (((tickAnim - 3) / 2) * (-0.3-(0.85)));
            zz = -0.4 + (((tickAnim - 3) / 2) * (0-(-0.4)));
        }
        else if (tickAnim >= 5 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 5) / 3) * (0-(0)));
            yy = -0.3 + (((tickAnim - 5) / 3) * (0-(-0.3)));
            zz = 0 + (((tickAnim - 5) / 3) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 8) / 5) * (0-(0)));
            yy = 0 + (((tickAnim - 8) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 5) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.LeftLeg2.rotationPointX = this.LeftLeg2.rotationPointX + (float)(xx);
        this.LeftLeg2.rotationPointY = this.LeftLeg2.rotationPointY - (float)(yy);
        this.LeftLeg2.rotationPointZ = this.LeftLeg2.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 2) {
            xx = 52.5 + (((tickAnim - 0) / 2) * (61.33-(52.5)));
            yy = 0 + (((tickAnim - 0) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 2) * (0-(0)));
        }
        else if (tickAnim >= 2 && tickAnim < 5) {
            xx = 61.33 + (((tickAnim - 2) / 3) * (28-(61.33)));
            yy = 0 + (((tickAnim - 2) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 2) / 3) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 8) {
            xx = 28 + (((tickAnim - 5) / 3) * (-13.11-(28)));
            yy = 0 + (((tickAnim - 5) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 5) / 3) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 11) {
            xx = -13.11 + (((tickAnim - 8) / 3) * (-21.74-(-13.11)));
            yy = 0 + (((tickAnim - 8) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 3) * (0-(0)));
        }
        else if (tickAnim >= 11 && tickAnim < 13) {
            xx = -21.74 + (((tickAnim - 11) / 2) * (52.5-(-21.74)));
            yy = 0 + (((tickAnim - 11) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 11) / 2) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(LeftLegFoot, LeftLegFoot.rotateAngleX + (float) Math.toRadians(xx), LeftLegFoot.rotateAngleY + (float) Math.toRadians(yy), LeftLegFoot.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 2) {
            xx = 0 + (((tickAnim - 0) / 2) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 2) * (1.125-(0)));
            zz = 0 + (((tickAnim - 0) / 2) * (0-(0)));
        }
        else if (tickAnim >= 2 && tickAnim < 3) {
            xx = 0 + (((tickAnim - 2) / 1) * (0-(0)));
            yy = 1.125 + (((tickAnim - 2) / 1) * (2.78-(1.125)));
            zz = 0 + (((tickAnim - 2) / 1) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 3) / 2) * (0-(0)));
            yy = 2.78 + (((tickAnim - 3) / 2) * (0-(2.78)));
            zz = 0 + (((tickAnim - 3) / 2) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 7) {
            xx = 0 + (((tickAnim - 5) / 2) * (0-(0)));
            yy = 0 + (((tickAnim - 5) / 2) * (1.025-(0)));
            zz = 0 + (((tickAnim - 5) / 2) * (0-(0)));
        }
        else if (tickAnim >= 7 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 7) / 1) * (0-(0)));
            yy = 1.025 + (((tickAnim - 7) / 1) * (1.175-(1.025)));
            zz = 0 + (((tickAnim - 7) / 1) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 8) / 5) * (0-(0)));
            yy = 1.175 + (((tickAnim - 8) / 5) * (0-(1.175)));
            zz = 0 + (((tickAnim - 8) / 5) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.LeftLegFoot.rotationPointX = this.LeftLegFoot.rotationPointX + (float)(xx);
        this.LeftLegFoot.rotationPointY = this.LeftLegFoot.rotationPointY - (float)(yy);
        this.LeftLegFoot.rotationPointZ = this.LeftLegFoot.rotationPointZ + (float)(zz);



        this.setRotateAngle(Tail, Tail.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*587/0.5))*-0.7), Tail.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*578))*7), Tail.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*578+30))*-5));


        this.setRotateAngle(Tail2, Tail2.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*587/0.5))*0.7), Tail2.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*578-50))*7), Tail2.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*578+30))*-5));


        this.setRotateAngle(Tail3, Tail3.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*587/0.5))*0.7), Tail3.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*578-100))*7), Tail3.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*578+30))*-5));


        this.setRotateAngle(Tail4, Tail4.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*587/0.5))*0.7), Tail4.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*578-150))*7), Tail4.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*578+30))*-5));


    }



        public void animate(IAnimatedEntity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        EntityPrehistoricFloraTeyujagua e = (EntityPrehistoricFloraTeyujagua) entity;
        animator.update(entity);

//        animator.setAnimation(e.EAT_ANIMATION); //10 ticks
//        animator.startKeyframe(4);
//        animator.rotate(this.upperbody2, (float) Math.toRadians(10), (float) Math.toRadians(0), (float) Math.toRadians(0));
//        animator.rotate(this.upperbody, (float) Math.toRadians(7.5), (float) Math.toRadians(0), (float) Math.toRadians(0));
//        animator.rotate(this.neck, (float) Math.toRadians(30), (float) Math.toRadians(0), (float) Math.toRadians(0));
//        animator.rotate(this.head, (float) Math.toRadians(15), (float) Math.toRadians(0), (float) Math.toRadians(0));
//        animator.rotate(this.jaw, (float) Math.toRadians(25), (float) Math.toRadians(0), (float) Math.toRadians(0));
//        animator.endKeyframe();
//        animator.setStaticKeyframe(3);
//        animator.resetKeyframe(3);

    }
}
