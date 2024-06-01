package net.lepidodendron.entity.model.entity;

import net.ilexiconn.llibrary.client.model.ModelAnimator;
import net.ilexiconn.llibrary.client.model.tools.AdvancedModelRenderer;
import net.ilexiconn.llibrary.server.animation.IAnimatedEntity;
import net.lepidodendron.entity.EntityPrehistoricFloraTiktaalik;
import net.lepidodendron.entity.base.EntityPrehistoricFloraAgeableBase;
import net.lepidodendron.entity.model.llibraryextensions.AdvancedModelBaseExtended;
import net.lepidodendron.entity.model.llibraryextensions.AdvancedModelRendererExtended;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

public class ModelTiktaalik extends AdvancedModelBaseExtended {
    private final AdvancedModelRendererExtended body;
    private final AdvancedModelRendererExtended body2;
    private final AdvancedModelRendererExtended body3;
    private final AdvancedModelRendererExtended hindlegL;
    private final AdvancedModelRendererExtended hindlegL2;
    private final AdvancedModelRendererExtended hindlegR;
    private final AdvancedModelRendererExtended hindlegR2;
    private final AdvancedModelRendererExtended body4;
    private final AdvancedModelRendererExtended analfin;
    private final AdvancedModelRendererExtended body5;
    private final AdvancedModelRendererExtended body6;
    private final AdvancedModelRendererExtended head;
    private final AdvancedModelRendererExtended lowerjaw;
    private final AdvancedModelRendererExtended cube_r1;
    private final AdvancedModelRendererExtended cube_r2;
    private final AdvancedModelRendererExtended bone2;
    private final AdvancedModelRendererExtended cube_r3;
    private final AdvancedModelRendererExtended cube_r4;
    private final AdvancedModelRendererExtended upperjaw;
    private final AdvancedModelRendererExtended cube_r5;
    private final AdvancedModelRendererExtended cube_r6;
    private final AdvancedModelRendererExtended cube_r7;
    private final AdvancedModelRendererExtended cube_r8;
    private final AdvancedModelRendererExtended cube_r9;
    private final AdvancedModelRendererExtended bone;
    private final AdvancedModelRendererExtended cube_r10;
    private final AdvancedModelRendererExtended cube_r11;
    private final AdvancedModelRendererExtended forelegL;
    private final AdvancedModelRendererExtended forelegL2;
    private final AdvancedModelRendererExtended forelegR;
    private final AdvancedModelRendererExtended forelegR2;

    private ModelAnimator animator;

    public ModelTiktaalik() {
        this.textureWidth = 86;
        this.textureHeight = 86;

        this.body = new AdvancedModelRendererExtended(this);
        this.body.setRotationPoint(0.0F, 24.0F, 0.0F);
        this.body.cubeList.add(new ModelBox(body, 0, 0, -5.0F, -6.0F, -2.5F, 10, 6, 12, 0.0F, false));

        this.body2 = new AdvancedModelRendererExtended(this);
        this.body2.setRotationPoint(0.0F, -3.5F, 10.0F);
        this.body.addChild(body2);
        this.body2.cubeList.add(new ModelBox(body2, 0, 18, -4.0F, -2.49F, -1.0F, 8, 6, 11, 0.0F, false));

        this.body3 = new AdvancedModelRendererExtended(this);
        this.body3.setRotationPoint(0.0F, 0.5F, 10.0F);
        this.body2.addChild(body3);
        this.body3.cubeList.add(new ModelBox(body3, 15, 36, -3.0F, -2.73F, -1.0F, 6, 5, 9, 0.0F, false));

        this.hindlegL = new AdvancedModelRendererExtended(this);
        this.hindlegL.setRotationPoint(1.9F, 1.35F, 5.75F);
        this.body3.addChild(hindlegL);
        this.setRotateAngle(hindlegL, 1.0472F, -0.1309F, -1.0472F);
        this.hindlegL.cubeList.add(new ModelBox(hindlegL, 36, 36, -0.5F, 0.0F, -1.0F, 1, 4, 2, 0.01F, false));

        this.hindlegL2 = new AdvancedModelRendererExtended(this);
        this.hindlegL2.setRotationPoint(0.0F, 4.0F, 0.0F);
        this.hindlegL.addChild(hindlegL2);
        this.setRotateAngle(hindlegL2, 0.0873F, 0.0F, -0.1745F);
        this.hindlegL2.cubeList.add(new ModelBox(hindlegL2, 4, 22, -0.5F, 0.0F, -1.0F, 1, 4, 2, 0.0F, false));
        this.hindlegL2.cubeList.add(new ModelBox(hindlegL2, 0, 15, 0.0F, 0.0F, -1.5F, 0, 6, 3, 0.0F, false));

        this.hindlegR = new AdvancedModelRendererExtended(this);
        this.hindlegR.setRotationPoint(-1.9F, 1.35F, 5.75F);
        this.body3.addChild(hindlegR);
        this.setRotateAngle(hindlegR, 1.0472F, 0.1309F, 1.0472F);
        this.hindlegR.cubeList.add(new ModelBox(hindlegR, 36, 36, -0.5F, 0.0F, -1.0F, 1, 4, 2, 0.01F, true));

        this.hindlegR2 = new AdvancedModelRendererExtended(this);
        this.hindlegR2.setRotationPoint(0.0F, 4.0F, 0.0F);
        this.hindlegR.addChild(hindlegR2);
        this.setRotateAngle(hindlegR2, 0.0873F, 0.0F, 0.1745F);
        this.hindlegR2.cubeList.add(new ModelBox(hindlegR2, 4, 22, -0.5F, 0.0F, -1.0F, 1, 4, 2, 0.0F, true));
        this.hindlegR2.cubeList.add(new ModelBox(hindlegR2, 0, 15, 0.0F, 0.0F, -1.5F, 0, 6, 3, 0.0F, true));

        this.body4 = new AdvancedModelRendererExtended(this);
        this.body4.setRotationPoint(0.0F, -0.5F, 8.0F);
        this.body3.addChild(body4);
        this.body4.cubeList.add(new ModelBox(body4, 33, 38, -2.0F, -2.0F, -1.0F, 4, 4, 12, 0.0F, false));

        this.analfin = new AdvancedModelRendererExtended(this);
        this.analfin.setRotationPoint(0.0F, 2.0F, 9.25F);
        this.body4.addChild(analfin);
        this.setRotateAngle(analfin, 0.8727F, 0.0F, 0.0F);
        this.analfin.cubeList.add(new ModelBox(analfin, 6, 16, 0.0F, -0.5F, -0.5F, 0, 4, 2, 0.0F, false));

        this.body5 = new AdvancedModelRendererExtended(this);
        this.body5.setRotationPoint(0.0F, 0.0F, 11.0F);
        this.body4.addChild(body5);
        this.body5.cubeList.add(new ModelBox(body5, 17, 50, -1.0F, -1.5F, -1.0F, 2, 3, 11, 0.0F, false));
        this.body5.cubeList.add(new ModelBox(body5, 0, 59, 0.0F, -4.5F, 4.0F, 0, 9, 6, 0.0F, false));

        this.body6 = new AdvancedModelRendererExtended(this);
        this.body6.setRotationPoint(0.0F, 0.0F, 10.0F);
        this.body5.addChild(body6);
        this.body6.cubeList.add(new ModelBox(body6, 52, 54, -0.5F, -1.0F, -1.0F, 1, 2, 8, 0.0F, false));
        this.body6.cubeList.add(new ModelBox(body6, 0, 23, 0.0F, -4.5F, 0.0F, 0, 9, 12, 0.0F, false));

        this.head = new AdvancedModelRendererExtended(this);
        this.head.setRotationPoint(0.0F, -2.75F, -2.25F);
        this.body.addChild(head);


        this.lowerjaw = new AdvancedModelRendererExtended(this);
        this.lowerjaw.setRotationPoint(0.0F, 0.5F, 0.5F);
        this.head.addChild(lowerjaw);
        this.lowerjaw.cubeList.add(new ModelBox(lowerjaw, 0, 53, -1.5F, -0.86F, -13.725F, 3, 1, 0, 0.0F, false));
        this.lowerjaw.cubeList.add(new ModelBox(lowerjaw, 32, 7, -1.5F, -0.3F, -14.0F, 3, 1, 1, 0.01F, false));

        this.cube_r1 = new AdvancedModelRendererExtended(this);
        this.cube_r1.setRotationPoint(0.0F, 0.75F, -14.0F);
        this.lowerjaw.addChild(cube_r1);
        this.setRotateAngle(cube_r1, -0.1309F, 0.0F, 0.0F);
        this.cube_r1.cubeList.add(new ModelBox(cube_r1, 53, 43, -2.0F, -1.05F, 2.975F, 4, 1, 5, -0.01F, false));
        this.cube_r1.cubeList.add(new ModelBox(cube_r1, 0, 0, -1.5F, -1.05F, 0.0F, 3, 1, 3, 0.0F, false));

        this.cube_r2 = new AdvancedModelRendererExtended(this);
        this.cube_r2.setRotationPoint(0.0F, 1.5F, -14.0F);
        this.lowerjaw.addChild(cube_r2);
        this.setRotateAngle(cube_r2, -0.0611F, 0.0F, 0.0F);
        this.cube_r2.cubeList.add(new ModelBox(cube_r2, 50, 9, -3.0F, -2.25F, 7.0F, 6, 2, 7, 0.01F, false));

        this.bone2 = new AdvancedModelRendererExtended(this);
        this.bone2.setRotationPoint(0.0F, -1.0F, -13.75F);
        this.lowerjaw.addChild(bone2);
        this.bone2.cubeList.add(new ModelBox(bone2, 0, 50, -3.0F, 0.63F, 5.5F, 6, 1, 8, 0.0F, false));
        this.bone2.cubeList.add(new ModelBox(bone2, 53, 36, -3.0F, -1.77F, 9.5F, 6, 3, 4, -0.01F, false));
        this.bone2.cubeList.add(new ModelBox(bone2, 0, 8, -2.0F, 0.63F, 3.5F, 4, 1, 2, 0.0F, false));

        this.cube_r3 = new AdvancedModelRendererExtended(this);
        this.cube_r3.setRotationPoint(-2.0F, 1.65F, 12.25F);
        this.bone2.addChild(cube_r3);
        this.setRotateAngle(cube_r3, 0.0F, -0.3054F, 0.0F);
        this.cube_r3.cubeList.add(new ModelBox(cube_r3, 27, 10, -2.9F, -1.51F, -12.0F, 0, 1, 10, 0.0F, true));
        this.cube_r3.cubeList.add(new ModelBox(cube_r3, 24, 21, -3.4F, -1.0F, -12.0F, 3, 1, 14, 0.0F, true));

        this.cube_r4 = new AdvancedModelRendererExtended(this);
        this.cube_r4.setRotationPoint(2.0F, 1.65F, 12.25F);
        this.bone2.addChild(cube_r4);
        this.setRotateAngle(cube_r4, 0.0F, 0.3054F, 0.0F);
        this.cube_r4.cubeList.add(new ModelBox(cube_r4, 27, 10, 2.9F, -1.51F, -12.0F, 0, 1, 10, 0.0F, false));
        this.cube_r4.cubeList.add(new ModelBox(cube_r4, 24, 21, 0.4F, -1.01F, -12.0F, 3, 1, 14, 0.0F, false));

        this.upperjaw = new AdvancedModelRendererExtended(this);
        this.upperjaw.setRotationPoint(0.0F, -2.25F, 0.25F);
        this.head.addChild(upperjaw);
        this.setRotateAngle(upperjaw, 0.1134F, 0.0F, 0.0F);


        this.cube_r5 = new AdvancedModelRendererExtended(this);
        this.cube_r5.setRotationPoint(-1.0F, 0.0F, -6.0F);
        this.upperjaw.addChild(cube_r5);
        this.setRotateAngle(cube_r5, 0.0F, -0.1745F, 0.0F);
        this.cube_r5.cubeList.add(new ModelBox(cube_r5, 0, 26, -1.15F, -1.2F, -2.0F, 1, 1, 2, 0.0F, true));

        this.cube_r6 = new AdvancedModelRendererExtended(this);
        this.cube_r6.setRotationPoint(1.0F, 0.0F, -6.0F);
        this.upperjaw.addChild(cube_r6);
        this.setRotateAngle(cube_r6, 0.0F, 0.1745F, 0.0F);
        this.cube_r6.cubeList.add(new ModelBox(cube_r6, 0, 26, 0.15F, -1.2F, -2.0F, 1, 1, 2, 0.0F, false));

        this.cube_r7 = new AdvancedModelRendererExtended(this);
        this.cube_r7.setRotationPoint(0.0F, 1.5F, -14.0F);
        this.upperjaw.addChild(cube_r7);
        this.setRotateAngle(cube_r7, 0.0436F, 0.0F, 0.0F);
        this.cube_r7.cubeList.add(new ModelBox(cube_r7, 32, 0, -2.0F, -1.675F, 2.975F, 4, 1, 3, -0.01F, false));

        this.cube_r8 = new AdvancedModelRendererExtended(this);
        this.cube_r8.setRotationPoint(0.0F, 1.5F, -14.0F);
        this.upperjaw.addChild(cube_r8);
        this.setRotateAngle(cube_r8, -0.0262F, 0.0F, 0.0F);
        this.cube_r8.cubeList.add(new ModelBox(cube_r8, 0, 4, -1.5F, -1.8F, 0.1F, 3, 1, 3, 0.0F, false));

        this.cube_r9 = new AdvancedModelRendererExtended(this);
        this.cube_r9.setRotationPoint(0.0F, 1.5F, -14.0F);
        this.upperjaw.addChild(cube_r9);
        this.setRotateAngle(cube_r9, -0.0175F, 0.0F, 0.0F);
        this.cube_r9.cubeList.add(new ModelBox(cube_r9, 44, 19, -3.0F, -2.2F, 5.55F, 6, 2, 9, 0.015F, false));

        this.bone = new AdvancedModelRendererExtended(this);
        this.bone.setRotationPoint(0.0F, -0.75F, -13.5F);
        this.upperjaw.addChild(bone);
        this.setRotateAngle(bone, -0.1134F, 0.0F, 0.0F);
        this.bone.cubeList.add(new ModelBox(bone, 27, 27, -1.5F, 0.64F, -0.25F, 3, 1, 1, 0.015F, false));
        this.bone.cubeList.add(new ModelBox(bone, 0, 53, -1.5F, 1.14F, 0.025F, 3, 1, 0, 0.0F, false));
        this.bone.cubeList.add(new ModelBox(bone, 50, 0, -3.0F, 0.64F, 5.5F, 6, 1, 8, 0.02F, false));
        this.bone.cubeList.add(new ModelBox(bone, 32, 4, -2.0F, 0.63F, 3.5F, 4, 1, 2, 0.0F, false));

        this.cube_r10 = new AdvancedModelRendererExtended(this);
        this.cube_r10.setRotationPoint(-2.0F, 1.65F, 12.25F);
        this.bone.addChild(cube_r10);
        this.setRotateAngle(cube_r10, 0.0F, -0.3054F, 0.0F);
        this.cube_r10.cubeList.add(new ModelBox(cube_r10, 27, 9, -3.0F, -0.51F, -12.0F, 0, 1, 10, 0.0F, true));
        this.cube_r10.cubeList.add(new ModelBox(cube_r10, 30, 4, -3.5F, -1.0F, -12.0F, 3, 1, 14, 0.0F, true));

        this.cube_r11 = new AdvancedModelRendererExtended(this);
        this.cube_r11.setRotationPoint(2.0F, 1.65F, 12.25F);
        this.bone.addChild(cube_r11);
        this.setRotateAngle(cube_r11, 0.0F, 0.3054F, 0.0F);
        this.cube_r11.cubeList.add(new ModelBox(cube_r11, 27, 9, 3.0F, -0.51F, -12.0F, 0, 1, 10, 0.0F, false));
        this.cube_r11.cubeList.add(new ModelBox(cube_r11, 30, 4, 0.5F, -1.01F, -12.0F, 3, 1, 14, 0.0F, false));

        this.forelegL = new AdvancedModelRendererExtended(this);
        this.forelegL.setRotationPoint(4.25F, -2.0F, 1.0F);
        this.body.addChild(forelegL);
        this.setRotateAngle(forelegL, 0.7418F, -0.2182F, -0.7854F);
        this.forelegL.cubeList.add(new ModelBox(forelegL, 6, 44, -0.5F, 0.0F, -1.0F, 1, 4, 2, 0.01F, false));

        this.forelegL2 = new AdvancedModelRendererExtended(this);
        this.forelegL2.setRotationPoint(0.0F, 4.0F, 0.0F);
        this.forelegL.addChild(forelegL2);
        this.setRotateAngle(forelegL2, -0.2618F, 0.0F, -0.5236F);
        this.forelegL2.cubeList.add(new ModelBox(forelegL2, 0, 44, -0.5F, 0.0F, -1.0F, 1, 4, 2, 0.0F, false));
        this.forelegL2.cubeList.add(new ModelBox(forelegL2, 27, 18, 0.0F, 0.0F, -1.5F, 0, 6, 3, 0.0F, false));

        this.forelegR = new AdvancedModelRendererExtended(this);
        this.forelegR.setRotationPoint(-4.25F, -2.0F, 1.0F);
        this.body.addChild(forelegR);
        this.setRotateAngle(forelegR, 0.7418F, 0.2182F, 0.7854F);
        this.forelegR.cubeList.add(new ModelBox(forelegR, 6, 44, -0.5F, 0.0F, -1.0F, 1, 4, 2, 0.01F, true));

        this.forelegR2 = new AdvancedModelRendererExtended(this);
        this.forelegR2.setRotationPoint(0.0F, 4.0F, 0.0F);
        this.forelegR.addChild(forelegR2);
        this.setRotateAngle(forelegR2, -0.2618F, 0.0F, 0.5236F);
        this.forelegR2.cubeList.add(new ModelBox(forelegR2, 0, 44, -0.5F, 0.0F, -1.0F, 1, 4, 2, 0.0F, true));
        this.forelegR2.cubeList.add(new ModelBox(forelegR2, 27, 18, 0.0F, 0.0F, -1.5F, 0, 6, 3, 0.0F, true));

        updateDefaultPose();
        animator = ModelAnimator.create();
    }

    @Override
    public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        animate((IAnimatedEntity) entity, f, f1, f2, f3, f4, f5);
        this.body.render(f5);
    }

    public void renderStaticFloor(float f) {
        this.setRotateAngle(body2, -0.0873F, -0.0873F, 0.0F);
        this.setRotateAngle(body3, -0.0436F, -0.2182F, 0.0F);
        this.setRotateAngle(hindlegL, 0.3624F, -0.0853F, -1.1706F);
        this.setRotateAngle(hindlegL2, 0.343F, 0.0521F, -0.5176F);
        this.setRotateAngle(hindlegR, 0.6639F, 0.0507F, 1.1511F);
        this.setRotateAngle(hindlegR2, 0.5219F, -0.0436F, 0.2502F);
        this.setRotateAngle(body4, 0.0F, -0.48F, 0.0F);
        this.setRotateAngle(analfin, 1.1781F, 0.0F, 0.0F);
        this.setRotateAngle(body5, -0.2351F, -0.5692F, 0.4181F);
        this.setRotateAngle(body6, 0.0F, -0.48F, 0.0F);
        this.setRotateAngle(head, -0.3927F, 0.0F, 0.0F);
        this.setRotateAngle(lowerjaw, 0.48F, 0.0F, 0.0F);
        this.setRotateAngle(cube_r1, -0.1309F, 0.0F, 0.0F);
        this.setRotateAngle(cube_r2, -0.0611F, 0.0F, 0.0F);
        this.setRotateAngle(cube_r3, 0.0F, -0.3054F, 0.0F);
        this.setRotateAngle(cube_r4, 0.0F, 0.3054F, 0.0F);
        this.setRotateAngle(upperjaw, 0.1134F, 0.0F, 0.0F);
        this.setRotateAngle(cube_r5, 0.0F, -0.1745F, 0.0F);
        this.setRotateAngle(cube_r6, 0.0F, 0.1745F, 0.0F);
        this.setRotateAngle(cube_r7, 0.0436F, 0.0F, 0.0F);
        this.setRotateAngle(cube_r8, -0.0262F, 0.0F, 0.0F);
        this.setRotateAngle(cube_r9, -0.0175F, 0.0F, 0.0F);
        this.setRotateAngle(bone, -0.1134F, 0.0F, 0.0F);
        this.setRotateAngle(cube_r10, 0.0F, -0.3054F, 0.0F);
        this.setRotateAngle(cube_r11, 0.0F, 0.3054F, 0.0F);
        this.setRotateAngle(forelegL, 0.0F, -0.2182F, -0.7854F);
        this.setRotateAngle(forelegL2, -0.2618F, 0.0F, -0.5236F);
        this.setRotateAngle(forelegR, 0.1745F, 0.2182F, 0.7854F);
        this.setRotateAngle(forelegR2, -0.2618F, 0.0F, 0.5236F);
        this.body.offsetY = -0.03F;
        this.body.offsetZ = -0.09F;
        this.body.render(0.01F);
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
        this.body.offsetY = 0F;

        EntityPrehistoricFloraTiktaalik Tiktaalik = (EntityPrehistoricFloraTiktaalik) e;

        this.faceTarget(f3, f4, 12, head);

        float speed = 0.15F;

        AdvancedModelRenderer[] Tail = {this.body4, this.body5, this.body6};
        AdvancedModelRenderer[] Torso = {this.body, this.body2, this.body3};
        Tiktaalik.tailBuffer.applyChainSwingBuffer(Tail);

        AdvancedModelRenderer[] LeftArm = {this.forelegL, this.forelegL2};
        AdvancedModelRenderer[] RightArm = {this.forelegR, this.forelegR2};

        AdvancedModelRenderer[] LeftLeg = {this.hindlegL, this.hindlegL2};
        AdvancedModelRenderer[] RightLeg = {this.hindlegR, this.hindlegR2};

        if (!Tiktaalik.isReallyInWater()) {
            this.forelegL.rotateAngleZ = -(float) Math.toRadians(65);
            this.forelegR.rotateAngleZ = (float) Math.toRadians(65);
            this.hindlegL.rotateAngleZ = -(float) Math.toRadians(75);
            this.hindlegR.rotateAngleZ = (float) Math.toRadians(75);

            if (f3 == 0.0F || !Tiktaalik.getIsMoving()) {
                return;
            }

            this.chainWaveExtended(LeftArm, speed * 0.4F, 0.2F,0F,0.0F, f2, 0.7F);
            this.chainWaveExtended(RightArm, speed * 0.4F, -0.2F,0F,0.0F, f2, 0.7F);

            this.chainWaveExtended(LeftLeg, speed * 0.4F, 0.2F,0F,3.0F, f2, 0.7F);
            this.chainWaveExtended(RightLeg, speed * 0.4F, -0.2F,0F,3.0F, f2, 0.7F);

            this.chainWave(Tail, speed, 0.05F, -3, f2, 1);
            this.chainSwing(Tail, speed * 0.45F, 0.12F, -3, f2, 0.8F);
            this.chainSwing(Torso, speed, 0.1F, -3, f2, 1);
        }
        else {
            speed = speed * 2F;
            if (Tiktaalik.getIsFast()) {
                speed = speed * 1.33F;
            }
            this.chainSwing(Torso, speed, 0.07F, -3, f2, 1);
            if (f3 == 0.0F) {
                return;
            }

            this.chainFlapExtended(LeftArm, speed * 0.7F, 0.3F,0F,0.0F, f2, 0.7F);
            this.chainFlapExtended(RightArm, speed * 0.7F, -0.3F,0F,0.0F, f2, 0.7F);
            this.chainWaveExtended(LeftArm, speed * 0.7F, 0.2F,0F,0.0F, f2, 0.7F);
            this.chainWaveExtended(RightArm, speed * 0.7F, -0.2F,0F,0.0F, f2, 0.7F);

            this.chainFlapExtended(LeftLeg, speed * 0.7F, 0.3F,0F,3.0F, f2, 0.7F);
            this.chainFlapExtended(RightLeg, speed * 0.7F, -0.3F,0F,3.0F, f2, 0.7F);
            this.chainWaveExtended(LeftLeg, speed * 0.7F, 0.2F,0F,3.0F, f2, 0.7F);
            this.chainWaveExtended(RightLeg, speed * 0.7F, -0.2F,0F,3.0F, f2, 0.7F);

            this.chainWave(Tail, speed, 0.03F, -3, f2, 1);
            this.chainSwing(Tail, speed, 0.25F, -3, f2, 1F);

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
        animator.rotate(this.head, (float) Math.toRadians(-20), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(this.lowerjaw, (float) Math.toRadians(40), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.endKeyframe();
        animator.setStaticKeyframe(2);
        animator.resetKeyframe(2);

        animator.setAnimation(e.ROAR_ANIMATION);
        animator.startKeyframe(5);
        //animator.move(this.neck, 0,0,-2F);
        animator.rotate(this.head, (float) Math.toRadians(-35), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(this.lowerjaw, (float) Math.toRadians(35), (float) Math.toRadians(0), (float) Math.toRadians(0));
        //animator.rotate(this.neck, (float) Math.toRadians(0), (float) Math.toRadians(25), (float) Math.toRadians(0));
        animator.endKeyframe();
        animator.setStaticKeyframe(5);
        animator.resetKeyframe(10);
    }
}
