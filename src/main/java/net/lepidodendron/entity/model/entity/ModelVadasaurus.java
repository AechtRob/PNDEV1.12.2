package net.lepidodendron.entity.model.entity;

import net.ilexiconn.llibrary.client.model.ModelAnimator;
import net.ilexiconn.llibrary.client.model.tools.AdvancedModelRenderer;
import net.ilexiconn.llibrary.server.animation.IAnimatedEntity;
import net.lepidodendron.entity.EntityPrehistoricFloraVadasaurus;
import net.lepidodendron.entity.base.EntityPrehistoricFloraAgeableBase;
import net.lepidodendron.entity.model.ModelBasePalaeopedia;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

public class ModelVadasaurus extends ModelBasePalaeopedia {
    private final AdvancedModelRenderer Hips;
    private final AdvancedModelRenderer Body;
    private final AdvancedModelRenderer Neck;
    private final AdvancedModelRenderer Head;
    private final AdvancedModelRenderer bone;
    private final AdvancedModelRenderer cube_r1;
    private final AdvancedModelRenderer Jaw;
    private final AdvancedModelRenderer cube_r2;
    private final AdvancedModelRenderer cube_r3;
    private final AdvancedModelRenderer UpperArmR;
    private final AdvancedModelRenderer LowerArmR;
    private final AdvancedModelRenderer HandR;
    private final AdvancedModelRenderer cube_r4;
    private final AdvancedModelRenderer UpperArmL;
    private final AdvancedModelRenderer LowerArmL;
    private final AdvancedModelRenderer HandL;
    private final AdvancedModelRenderer cube_r5;
    private final AdvancedModelRenderer Tail;
    private final AdvancedModelRenderer Tail2;
    private final AdvancedModelRenderer Tail3;
    private final AdvancedModelRenderer UpperLegR;
    private final AdvancedModelRenderer LowerLegR;
    private final AdvancedModelRenderer FootR;
    private final AdvancedModelRenderer cube_r6;
    private final AdvancedModelRenderer UpperLegL;
    private final AdvancedModelRenderer LowerLegL;
    private final AdvancedModelRenderer FootL;
    private final AdvancedModelRenderer cube_r7;

    private ModelAnimator animator;

    public ModelVadasaurus() {
        this.textureWidth = 64;
        this.textureHeight = 64;

        this.Hips = new AdvancedModelRenderer(this);
        this.Hips.setRotationPoint(0.0F, 21.25F, 8.0F);
        this.setRotateAngle(Hips, -0.1309F, 0.0F, 0.0F);
        this.Hips.cubeList.add(new ModelBox(Hips, 0, 28, -1.5F, -1.5F, -4.0F, 3, 3, 4, 0.0F, false));
        this.Hips.cubeList.add(new ModelBox(Hips, 0, 6, 0.0F, -2.25F, -4.35F, 0, 1, 3, 0.0F, false));

        this.Body = new AdvancedModelRenderer(this);
        this.Body.setRotationPoint(0.0F, 0.0F, -4.0F);
        this.Hips.addChild(Body);
        this.setRotateAngle(Body, 0.1309F, 0.0F, 0.0F);
        this.Body.cubeList.add(new ModelBox(Body, 0, 0, -2.0F, -1.5F, -9.0F, 4, 4, 10, 0.0F, false));
        this.Body.cubeList.add(new ModelBox(Body, 12, 5, 0.0F, -2.25F, -9.0F, 0, 1, 9, 0.0F, false));

        this.Neck = new AdvancedModelRenderer(this);
        this.Neck.setRotationPoint(0.0F, 0.1F, -8.5F);
        this.Body.addChild(Neck);
        this.setRotateAngle(Neck, -0.3054F, 0.0F, 0.0F);
        this.Neck.cubeList.add(new ModelBox(Neck, 14, 28, -1.5F, -1.5F, -4.0F, 3, 3, 4, -0.02F, false));
        this.Neck.cubeList.add(new ModelBox(Neck, 0, 31, 0.0F, 1.0F, -4.0F, 0, 2, 4, 0.0F, false));
        this.Neck.cubeList.add(new ModelBox(Neck, 0, 5, 0.0F, -2.1F, -4.25F, 0, 1, 3, 0.0F, false));

        this.Head = new AdvancedModelRenderer(this);
        this.Head.setRotationPoint(0.0F, -0.1F, -3.5F);
        this.Neck.addChild(Head);
        this.setRotateAngle(Head, 0.3054F, 0.0F, 0.0F);
        this.Head.cubeList.add(new ModelBox(Head, 0, 14, -1.5F, -1.5F, -2.0F, 3, 2, 2, 0.0F, false));
        this.Head.cubeList.add(new ModelBox(Head, 10, 28, -1.0F, -0.5F, -4.0F, 2, 1, 2, 0.0F, false));
        this.Head.cubeList.add(new ModelBox(Head, 22, 28, -0.5F, 0.51F, -4.0F, 1, 0, 2, 0.0F, false));
        this.Head.cubeList.add(new ModelBox(Head, 18, 3, -1.0F, -1.0F, -3.0F, 2, 1, 1, 0.01F, false));

        this.bone = new AdvancedModelRenderer(this);
        this.bone.setRotationPoint(0.0F, -1.5F, -2.0F);
        this.Head.addChild(bone);
        this.setRotateAngle(bone, 0.0873F, 0.0F, 0.0F);
        this.bone.cubeList.add(new ModelBox(bone, 24, 22, -1.0F, 0.01F, -2.0F, 2, 1, 2, -0.01F, false));

        this.cube_r1 = new AdvancedModelRenderer(this);
        this.cube_r1.setRotationPoint(0.0F, 0.0F, -2.0F);
        this.bone.addChild(cube_r1);
        this.setRotateAngle(cube_r1, -0.6981F, 0.0F, 0.0F);
        this.cube_r1.cubeList.add(new ModelBox(cube_r1, 0, 0, -0.5F, 0.75F, 0.45F, 1, 1, 0, 0.0F, false));
        this.cube_r1.cubeList.add(new ModelBox(cube_r1, 18, 5, -0.5F, 0.5F, 0.0F, 1, 1, 1, -0.01F, false));
        this.cube_r1.cubeList.add(new ModelBox(cube_r1, 6, 21, -0.5F, 0.02F, 0.0F, 1, 1, 1, 0.0F, false));

        this.Jaw = new AdvancedModelRenderer(this);
        this.Jaw.setRotationPoint(0.0F, 0.5F, 0.0F);
        this.Head.addChild(Jaw);
        this.setRotateAngle(Jaw, -0.0873F, 0.0F, 0.0F);
        this.Jaw.cubeList.add(new ModelBox(Jaw, 0, 18, -1.5F, -0.01F, -1.99F, 3, 1, 2, -0.01F, false));
        this.Jaw.cubeList.add(new ModelBox(Jaw, 0, 21, -1.0F, -0.01F, -3.97F, 2, 1, 2, -0.01F, false));
        this.Jaw.cubeList.add(new ModelBox(Jaw, 24, 28, -0.5F, -0.01F, -4.0F, 1, 0, 2, 0.0F, false));

        this.cube_r2 = new AdvancedModelRenderer(this);
        this.cube_r2.setRotationPoint(0.0F, 0.0F, -0.3F);
        this.Jaw.addChild(cube_r2);
        this.setRotateAngle(cube_r2, -0.1745F, 0.0F, 0.0F);
        this.cube_r2.cubeList.add(new ModelBox(cube_r2, 18, 0, -1.0F, -1.0F, -1.0F, 2, 2, 1, 0.0F, false));

        this.cube_r3 = new AdvancedModelRenderer(this);
        this.cube_r3.setRotationPoint(0.0F, 1.0F, -3.94F);
        this.Jaw.addChild(cube_r3);
        this.setRotateAngle(cube_r3, -0.2618F, 0.0F, 0.0F);
        this.cube_r3.cubeList.add(new ModelBox(cube_r3, 6, 8, -0.5F, -1.02F, -1.0F, 1, 1, 1, -0.02F, false));

        this.UpperArmR = new AdvancedModelRenderer(this);
        this.UpperArmR.setRotationPoint(-1.5F, 1.0F, -8.0F);
        this.Body.addChild(UpperArmR);
        this.setRotateAngle(UpperArmR, 0.0F, 0.3491F, -0.0873F);
        this.UpperArmR.cubeList.add(new ModelBox(UpperArmR, 0, 4, -3.0F, -1.0F, -1.0F, 3, 2, 2, 0.0F, false));

        this.LowerArmR = new AdvancedModelRenderer(this);
        this.LowerArmR.setRotationPoint(-3.0F, 0.0F, 0.0F);
        this.UpperArmR.addChild(LowerArmR);
        this.setRotateAngle(LowerArmR, 0.6534F, -0.0091F, 0.0328F);
        this.LowerArmR.cubeList.add(new ModelBox(LowerArmR, 0, 0, -0.5F, -0.5F, -3.0F, 2, 1, 3, 0.0F, false));

        this.HandR = new AdvancedModelRenderer(this);
        this.HandR.setRotationPoint(0.5F, 0.0F, -2.8F);
        this.LowerArmR.addChild(HandR);
        this.setRotateAngle(HandR, -0.6619F, -0.1382F, 0.1069F);


        this.cube_r4 = new AdvancedModelRenderer(this);
        this.cube_r4.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.HandR.addChild(cube_r4);
        this.setRotateAngle(cube_r4, 0.0F, -0.48F, 0.0F);
        this.cube_r4.cubeList.add(new ModelBox(cube_r4, 8, 20, -3.75F, 0.0F, -3.25F, 4, 0, 4, 0.0F, false));

        this.UpperArmL = new AdvancedModelRenderer(this);
        this.UpperArmL.setRotationPoint(1.5F, 1.0F, -8.0F);
        this.Body.addChild(UpperArmL);
        this.setRotateAngle(UpperArmL, 0.0F, -0.3491F, 0.0873F);
        this.UpperArmL.cubeList.add(new ModelBox(UpperArmL, 0, 4, 0.0F, -1.0F, -1.0F, 3, 2, 2, 0.0F, true));

        this.LowerArmL = new AdvancedModelRenderer(this);
        this.LowerArmL.setRotationPoint(3.0F, 0.0F, 0.0F);
        this.UpperArmL.addChild(LowerArmL);
        this.setRotateAngle(LowerArmL, 0.6534F, 0.0091F, -0.0328F);
        this.LowerArmL.cubeList.add(new ModelBox(LowerArmL, 0, 0, -1.5F, -0.5F, -3.0F, 2, 1, 3, 0.0F, true));

        this.HandL = new AdvancedModelRenderer(this);
        this.HandL.setRotationPoint(-0.5F, 0.0F, -2.8F);
        this.LowerArmL.addChild(HandL);
        this.setRotateAngle(HandL, -0.6619F, 0.1382F, -0.1069F);


        this.cube_r5 = new AdvancedModelRenderer(this);
        this.cube_r5.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.HandL.addChild(cube_r5);
        this.setRotateAngle(cube_r5, 0.0F, 0.48F, 0.0F);
        this.cube_r5.cubeList.add(new ModelBox(cube_r5, 8, 20, -0.25F, 0.0F, -3.25F, 4, 0, 4, 0.0F, true));

        this.Tail = new AdvancedModelRenderer(this);
        this.Tail.setRotationPoint(0.0F, -0.25F, -1.0F);
        this.Hips.addChild(Tail);
        this.setRotateAngle(Tail, -0.0611F, 0.0F, 0.0F);
        this.Tail.cubeList.add(new ModelBox(Tail, 18, 0, -1.0F, -1.0F, 0.0F, 2, 2, 7, -0.01F, false));
        this.Tail.cubeList.add(new ModelBox(Tail, 18, 2, 0.0F, -1.75F, -0.25F, 0, 1, 7, 0.0F, false));

        this.Tail2 = new AdvancedModelRenderer(this);
        this.Tail2.setRotationPoint(0.0F, 0.0F, 7.0F);
        this.Tail.addChild(Tail2);
        this.setRotateAngle(Tail2, 0.0436F, 0.0F, 0.0F);
        this.Tail2.cubeList.add(new ModelBox(Tail2, 12, 15, -0.5F, -0.5F, -1.0F, 1, 1, 10, 0.01F, false));
        this.Tail2.cubeList.add(new ModelBox(Tail2, 0, 17, 0.0F, -2.0F, 0.0F, 0, 2, 9, 0.0F, false));

        this.Tail3 = new AdvancedModelRenderer(this);
        this.Tail3.setRotationPoint(0.0F, 0.0F, 8.5F);
        this.Tail2.addChild(Tail3);
        this.setRotateAngle(Tail3, 0.1309F, 0.0F, 0.0F);
        this.Tail3.cubeList.add(new ModelBox(Tail3, 0, 14, -0.5F, -0.5F, 0.0F, 1, 1, 10, 0.0F, false));
        this.Tail3.cubeList.add(new ModelBox(Tail3, 18, 17, 0.0F, -2.25F, 0.5F, 0, 2, 9, 0.0F, false));

        this.UpperLegR = new AdvancedModelRenderer(this);
        this.UpperLegR.setRotationPoint(-1.0F, 0.0F, -1.5F);
        this.Hips.addChild(UpperLegR);
        this.setRotateAngle(UpperLegR, 0.0361F, -0.3911F, -0.2253F);
        this.UpperLegR.cubeList.add(new ModelBox(UpperLegR, 31, 10, -4.0F, -1.0F, -1.5F, 4, 2, 3, 0.0F, false));

        this.LowerLegR = new AdvancedModelRenderer(this);
        this.LowerLegR.setRotationPoint(-4.0F, 0.0F, -1.0F);
        this.UpperLegR.addChild(LowerLegR);
        this.setRotateAngle(LowerLegR, -0.3052F, -0.0236F, 0.057F);
        this.LowerLegR.cubeList.add(new ModelBox(LowerLegR, 24, 15, -0.5F, -1.0F, 0.0F, 2, 2, 5, 0.0F, false));

        this.FootR = new AdvancedModelRenderer(this);
        this.FootR.setRotationPoint(0.5F, 0.0F, 4.5F);
        this.LowerLegR.addChild(FootR);
        this.setRotateAngle(FootR, 0.9303F, -1.0203F, -0.8677F);


        this.cube_r6 = new AdvancedModelRenderer(this);
        this.cube_r6.setRotationPoint(0.3633F, 0.0084F, -0.4774F);
        this.FootR.addChild(cube_r6);
        this.setRotateAngle(cube_r6, 0.0F, 0.1745F, 0.0F);
        this.cube_r6.cubeList.add(new ModelBox(cube_r6, 7, 15, -1.0F, 0.0F, 0.0F, 5, 0, 5, 0.0F, false));

        this.UpperLegL = new AdvancedModelRenderer(this);
        this.UpperLegL.setRotationPoint(1.0F, 0.0F, -1.5F);
        this.Hips.addChild(UpperLegL);
        this.setRotateAngle(UpperLegL, 0.0361F, 0.3911F, 0.2253F);
        this.UpperLegL.cubeList.add(new ModelBox(UpperLegL, 31, 10, 0.0F, -1.0F, -1.5F, 4, 2, 3, 0.0F, true));

        this.LowerLegL = new AdvancedModelRenderer(this);
        this.LowerLegL.setRotationPoint(4.0F, 0.0F, -1.0F);
        this.UpperLegL.addChild(LowerLegL);
        this.setRotateAngle(LowerLegL, -0.3052F, 0.0236F, -0.057F);
        this.LowerLegL.cubeList.add(new ModelBox(LowerLegL, 24, 15, -1.5F, -1.0F, 0.0F, 2, 2, 5, 0.0F, true));

        this.FootL = new AdvancedModelRenderer(this);
        this.FootL.setRotationPoint(-0.5F, 0.0F, 4.5F);
        this.LowerLegL.addChild(FootL);
        this.setRotateAngle(FootL, 0.9303F, 1.0203F, 0.8677F);


        this.cube_r7 = new AdvancedModelRenderer(this);
        this.cube_r7.setRotationPoint(-0.3633F, 0.0084F, -0.4774F);
        this.FootL.addChild(cube_r7);
        this.setRotateAngle(cube_r7, 0.0F, -0.1745F, 0.0F);
        this.cube_r7.cubeList.add(new ModelBox(cube_r7, 7, 15, -4.0F, 0.0F, 0.0F, 5, 0, 5, 0.0F, true));

        updateDefaultPose();
        animator = ModelAnimator.create();
    }

    @Override
    public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        animate((IAnimatedEntity) entity, f, f1, f2, f3, f4, f5);
        this.Hips.render(f5);
    }

    public void renderStaticFloor(float f) {
        this.setRotateAngle(UpperLegR, 0.571F, 0.9951F, -0.5221F);
        this.setRotateAngle(UpperLegL, 0.571F, -0.9951F, 0.5221F);
        this.setRotateAngle(UpperArmR, 1.4954F, 1.0104F, 0.1306F);
        this.setRotateAngle(UpperArmL, 1.4954F, -1.0104F, -0.1306F);
        this.setRotateAngle(Tail3, 0.0F, 0.3054F, 0.0F);
        this.setRotateAngle(Tail2, 0.0F, 0.1745F, 0.0F);
        this.setRotateAngle(Tail, 0.0262F, -0.1745F, 0.0F);
        this.setRotateAngle(Neck, -0.0436F, 0.1309F, 0.0F);
        this.setRotateAngle(LowerLegR, -0.3595F, -0.8432F, 0.1355F);
        this.setRotateAngle(LowerLegL, -0.3595F, 0.8432F, -0.1355F);
        this.setRotateAngle(LowerArmR, 0.4078F, 1.1481F, -0.2275F);
        this.setRotateAngle(LowerArmL, 0.4078F, -1.1481F, 0.2275F);
        this.setRotateAngle(Jaw, 0.0873F, 0.0F, 0.0F);
        this.setRotateAngle(Hips, -0.1309F, 0.0F, 0.0F);
        this.setRotateAngle(Head, 0.1309F, 0.1745F, 0.0F);
        this.setRotateAngle(HandR, -0.0947F, 0.6036F, 0.1069F);
        this.setRotateAngle(HandL, -0.0947F, -0.6036F, -0.1069F);
        this.setRotateAngle(FootR, 0.9303F, -1.0203F, -0.8677F);
        this.setRotateAngle(FootL, 0.9303F, 1.0203F, 0.8677F);
        this.setRotateAngle(cube_r7, 0.0F, 0.1745F, 0.0F);
        this.setRotateAngle(cube_r6, 0.0F, -0.48F, 0.0F);
        this.setRotateAngle(cube_r5, 0.0F, 0.0F, 0.0436F);
        this.setRotateAngle(cube_r4, 0.0F, 0.48F, 0.0F);
        this.setRotateAngle(cube_r3, -0.2618F, 0.0F, 0.0F);
        this.setRotateAngle(cube_r2, -0.1745F, 0.0F, 0.0F);
        this.setRotateAngle(cube_r1, -0.6981F, 0.0F, 0.0F);
        this.setRotateAngle(bone, 0.0873F, 0.0F, 0.0F);
        this.setRotateAngle(Body, 0.1309F, 0.1745F, 0.0F);
        this.Hips.offsetY = -0.45F;
        this.Hips.render(0.01F);
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
        this.Hips.offsetY = 0F;

        EntityPrehistoricFloraVadasaurus greer = (EntityPrehistoricFloraVadasaurus) e;

        this.faceTarget(f3, f4, 12, Head);

        float speed = 0.15F;

        AdvancedModelRenderer[] tail = {this.Tail, this.Tail2, this.Tail3};
        AdvancedModelRenderer[] Torso = {this.Body, this.Neck, this.Head};
        greer.tailBuffer.applyChainSwingBuffer(tail);

        AdvancedModelRenderer[] LeftArm = {this.UpperArmL, this.LowerArmL};
        AdvancedModelRenderer[] RightArm = {this.UpperArmR, this.LowerArmR};

        AdvancedModelRenderer[] LeftLeg = {this.UpperLegL, this.LowerLegL};
        AdvancedModelRenderer[] RightLeg = {this.UpperLegR, this.LowerLegR};

        if (greer.isReallyInWater()) {//in water
            this.setRotateAngle(Body, 0.1309F, 0.0F, 0.0F);
            this.setRotateAngle(bone, 0.0873F, 0.0F, 0.0F);
            this.setRotateAngle(cube_r1, -0.6981F, 0.0F, 0.0F);
            this.setRotateAngle(cube_r2, -0.1745F, 0.0F, 0.0F);
            this.setRotateAngle(cube_r3, -0.2618F, 0.0F, 0.0F);
            this.setRotateAngle(cube_r4, 0.0F, 0.48F, 0.0F);
            this.setRotateAngle(cube_r5, 0.0F, -0.48F, 0.0F);
            this.setRotateAngle(cube_r6, 0.0F, -0.1745F, 0.0F);
            this.setRotateAngle(cube_r7, 0.0F, 0.1745F, 0.0F);
            this.setRotateAngle(FootL, -0.2374F, 0.6191F, 0.0418F);
            this.setRotateAngle(FootR, -0.2374F, -0.6191F, -0.0418F);
            this.setRotateAngle(HandL, 0.0274F, 0.4068F, 0.4292F);
            this.setRotateAngle(HandR, 0.0274F, -0.4068F, -0.4292F);
            this.setRotateAngle(Head, 0.1745F, 0.0F, 0.0F);
            this.setRotateAngle(Hips, -0.1309F, 0.0F, 0.0F);
            this.setRotateAngle(Jaw, -0.0873F, 0.0F, 0.0F);
            this.setRotateAngle(LowerArmL, 2.1535F, -0.9154F, -1.5201F);
            this.setRotateAngle(LowerArmR, 2.1535F, 0.9154F, 1.5201F);
            this.setRotateAngle(LowerLegL, -0.6706F, 0.9301F, -0.4377F);
            this.setRotateAngle(LowerLegR, -0.6706F, -0.9301F, 0.4377F);
            this.setRotateAngle(Tail, -0.0611F, 0.0F, 0.0F);
            this.setRotateAngle(Tail2, 0.0436F, 0.0F, 0.0F);
            this.setRotateAngle(Tail3, 0.1309F, 0.0F, 0.0F);
            this.setRotateAngle(UpperArmL, 0.9284F, -0.927F, 0.4859F);
            this.setRotateAngle(UpperArmR, 0.9284F, 0.927F, -0.4859F);
            this.setRotateAngle(UpperLegL, 0.6923F, -0.9469F, 0.7445F);
            this.setRotateAngle(UpperLegR, 0.6923F, 0.9469F, -0.7445F);


            this.bob(Hips, speed * 1.5F, 2F, false, f2, 1F);
            if (f3 == 0.0F || !greer.getIsMoving()) {
                return;
            }

            this.chainSwingExtended(LeftArm, speed, -0.2F,0F,3.0F, f2, 0.7F);
            this.chainSwingExtended(RightArm, speed, 0.2F,0F,0, f2, 0.7F);

            this.chainSwingExtended(LeftLeg, speed, 0.2F,0F,3.0F, f2, 0.7F);
            this.chainSwingExtended(RightLeg, speed , -0.2F,0F,0, f2, 0.7F);

            this.chainWave(tail, speed* 2.2F, 0.15F, -3, f2, 1);
            this.chainSwing(tail, speed * 2.2F, 0.3F, -3, f2, 0.8F);
            this.chainSwing(Torso, speed, 0.1F, -3, f2, 1);
            this.chainWave(Torso, speed*1.5F, 0.15F, -3, f2, 1);


        }
        else { //on land
             speed = 0.85F;

            //EntityPrehistoricFloraentityCasineria entityCasineria = (EntityPrehistoricFloraentityCasineria) e;
            if (f3 == 0.0F || !greer.getIsMoving()) { //Not moving
                this.chainWave(tail, speed * 0.33F, 0.025F, -1.5, f2, 1);
                this.chainSwing(tail, speed * 0.2F, 0.08F, -1.8, f2, 0.8F);
                return;
            }

            this.flap(UpperLegL, speed, 0.45F, false, -3, -0.35F, f2, 0.5F);
            this.swing(UpperLegL, speed, -0.5F, true, -1, 1F, f2, 0.5F);
            this.walk(LowerLegL, speed, -0.6F, true, -3, 0.0F, f2, 0.8F);
            this.flap(LowerLegL, speed, -0.5F, true, 0, 0.25F, f2, 0.8F);
            this.flap(FootL, speed, 0.2F, false, 3, -0.1F, f2, 0.3F);
            this.walk(FootL, speed, 0.2F, false, 3, 0.4F, f2, 0.5F);
            this.swing(FootL, speed, 0.2F, false, 3, 0F, f2, 0.5F);

            this.flap(UpperLegR, speed, -0.45F, false, 0, 0.35F, f2, 0.5F);
            this.swing(UpperLegR, speed, 0.5F, true, 2, -1F, f2, 0.5F);
            this.walk(LowerLegR, speed, -0.6F, true, 0, 0.0F, f2, 0.8F);
            this.flap(LowerLegR, speed, 0.5F, true, 3, -0.25F, f2, 0.8F);
            this.flap(FootR, speed, -0.2F, false, 6, 0.1F, f2, 0.3F);
            this.walk(FootR, speed, 0.2F, false, 6, 0.4F, f2, 0.5F);
            this.swing(FootR, speed, -0.2F, false, 6, 0F, f2, 0.5F);

            this.flap(UpperArmL, speed, 0.45F, false, 0, -0.18F, f2, 0.5F);
            this.swing(UpperArmL, speed, -0.75F, true, 2, 0.5F, f2, 0.5F);
            this.walk(LowerArmL, speed, -0.2F, true, 0, 0.0F, f2, 0.8F);
            ///this.flap(HandL, speed, 0.2F, false, -1.5F, 0.4F, f2, 0.3F);
            this.walk(HandL, speed, 0.1F, false, -1.5F, 0.4F, f2, 0.5F);
            this.swing(HandL, speed, 0.1F, false, -1.5F, 0F, f2, 0.5F);

            this.flap(UpperArmR, speed, -0.45F, false, -3, 0.18F, f2, 0.5F);
            this.swing(UpperArmR, speed, 0.75F, true, -1, -0.5F, f2, 0.5F);
            this.walk(LowerArmR, speed, -0.2F, true, -3, 0.0F, f2, 0.8F);
//        this.flap(frontrightLeg6, speed, -0.2F, false, 1.5F, -0.4F, f2, 0.3F);
            this.walk(HandR, speed, 0.1F, false, 1.5F, 0.4F, f2, 0.5F);
            this.swing(HandR, speed, -0.1F, false, 1.5F, 0F, f2, 0.5F);

            this.chainWave(tail, speed, 0.1F, -3, f2, 1);
            this.chainSwing(tail, speed * 0.8F, 0.18F, -2.4, f2, 0.8F);
            this.chainSwing(Torso, speed, 0.08F, -2, f2, 0.75F);

        }
    }

    public void animate(IAnimatedEntity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        EntityPrehistoricFloraAgeableBase e = (EntityPrehistoricFloraAgeableBase) entity;
        animator.update(entity);
        this.resetToDefaultPose();
        setRotationAngles(f, f1, f2, f3, f4, f5, (Entity) entity);

        animator.setAnimation(e.ATTACK_ANIMATION);
        animator.startKeyframe(5);
        //animator.move(this.neck, 0,0,-2F);
        animator.rotate(this.Head, (float) Math.toRadians(-20), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(this.Jaw, (float) Math.toRadians(40), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.endKeyframe();
        animator.setStaticKeyframe(2);
        animator.resetKeyframe(2);

        animator.setAnimation(e.ROAR_ANIMATION);
        animator.startKeyframe(5);
        //animator.move(this.neck, 0,0,-2F);
        animator.rotate(this.Head, (float) Math.toRadians(-35), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(this.Jaw, (float) Math.toRadians(35), (float) Math.toRadians(0), (float) Math.toRadians(0));
        //animator.rotate(this.neck, (float) Math.toRadians(0), (float) Math.toRadians(25), (float) Math.toRadians(0));
        animator.endKeyframe();
        animator.setStaticKeyframe(5);
        animator.resetKeyframe(10);
    }
}
