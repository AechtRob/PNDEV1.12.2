package net.lepidodendron.entity.model.entity;

import net.ilexiconn.llibrary.client.model.ModelAnimator;
import net.ilexiconn.llibrary.client.model.tools.AdvancedModelRenderer;
import net.ilexiconn.llibrary.server.animation.IAnimatedEntity;
import net.lepidodendron.entity.EntityPrehistoricFloraTeyujagua;
import net.lepidodendron.entity.model.ModelBasePalaeopedia;
import net.minecraft.client.model.ModelBox;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;

public class ModelTropidosuchus extends ModelBasePalaeopedia {
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

    public ModelTropidosuchus() {
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

    @Override
    public void renderStaticBook(float f) {

    }

    public void renderStaticFloor(float f) {

        resetToDefaultPose();
    }
    public void renderStaticWall(float f) {

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
            animNest(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime, ee.getAnimationTick());
        }
        else if (ee.getAnimation() == ee.MAKE_NEST_ANIMATION) {
            animLay(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime, ee.getAnimationTick());
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

    }

    public void animNoise(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime, double animTick) {
        EntityPrehistoricFloraTeyujagua entity = (EntityPrehistoricFloraTeyujagua) entitylivingbaseIn;

    }
    public void animIdle(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime, double animTick) {
        EntityPrehistoricFloraTeyujagua entity = (EntityPrehistoricFloraTeyujagua) entitylivingbaseIn;

    }
    public void animLay(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime, double animTick) {
        EntityPrehistoricFloraTeyujagua entity = (EntityPrehistoricFloraTeyujagua) entitylivingbaseIn;

    }
    public void animAttack(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime, double animTick) {
        EntityPrehistoricFloraTeyujagua entity = (EntityPrehistoricFloraTeyujagua) entitylivingbaseIn;

    }
    public void animEat(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime, double animTick) {
        EntityPrehistoricFloraTeyujagua entity = (EntityPrehistoricFloraTeyujagua) entitylivingbaseIn;

    }

    public void animRunning(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime) {
        EntityPrehistoricFloraTeyujagua entity = (EntityPrehistoricFloraTeyujagua) entitylivingbaseIn;


    }

    public void animWalking(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime) {
        EntityPrehistoricFloraTeyujagua entity = (EntityPrehistoricFloraTeyujagua) entitylivingbaseIn;


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
