package net.lepidodendron.entity.model.entity;

import net.lepidodendron.entity.model.llibraryextensions.AdvancedModelBaseExtended;
import net.lepidodendron.entity.model.llibraryextensions.AdvancedModelRendererExtended;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

public class ModelPassaloteuthis extends AdvancedModelBaseExtended {
    private final AdvancedModelRendererExtended body;
    private final AdvancedModelRendererExtended siphon_r1;
    private final AdvancedModelRendererExtended HookR;
    private final AdvancedModelRendererExtended HookL;
    private final AdvancedModelRendererExtended finR;
    private final AdvancedModelRendererExtended finL;
    private final AdvancedModelRendererExtended arm;
    private final AdvancedModelRendererExtended arms;
    private final AdvancedModelRendererExtended arm6;
    private final AdvancedModelRendererExtended arms6;
    private final AdvancedModelRendererExtended arm2;
    private final AdvancedModelRendererExtended arms2;
    private final AdvancedModelRendererExtended arm7;
    private final AdvancedModelRendererExtended arms7;
    private final AdvancedModelRendererExtended arm3;
    private final AdvancedModelRendererExtended arms3;
    private final AdvancedModelRendererExtended arm8;
    private final AdvancedModelRendererExtended arms8;
    private final AdvancedModelRendererExtended arm4;
    private final AdvancedModelRendererExtended arms4;
    private final AdvancedModelRendererExtended arm9;
    private final AdvancedModelRendererExtended arms9;
    private final AdvancedModelRendererExtended arm5;
    private final AdvancedModelRendererExtended arms5;
    private final AdvancedModelRendererExtended arm10;
    private final AdvancedModelRendererExtended arms10;

    public ModelPassaloteuthis() {
        this.textureWidth = 55;
        this.textureHeight = 55;

        this.body = new AdvancedModelRendererExtended(this);
        this.body.setRotationPoint(0.5F, 23.0F, 0.0F);
        this.body.cubeList.add(new ModelBox(body, 0, 11, -4.0F, -6.0F, -3.0F, 7, 5, 10, 0.0F, false));
        this.body.cubeList.add(new ModelBox(body, 0, 26, -3.0F, -6.0F, -8.0F, 5, 5, 5, 0.0F, false));
        this.body.cubeList.add(new ModelBox(body, 0, 5, -3.5F, -5.0F, -6.75F, 1, 3, 3, 0.0F, false));
        this.body.cubeList.add(new ModelBox(body, 0, 5, 1.5F, -5.0F, -6.75F, 1, 3, 3, 0.0F, true));
        this.body.cubeList.add(new ModelBox(body, 0, 37, -2.0F, -5.0F, 13.0F, 3, 3, 4, 0.0F, false));
        this.body.cubeList.add(new ModelBox(body, 24, 5, -3.0F, -6.0F, 7.0F, 5, 5, 6, 0.0F, false));
        this.body.cubeList.add(new ModelBox(body, 0, 0, -1.0F, -4.0F, 17.0F, 1, 1, 4, 0.0F, false));

        this.siphon_r1 = new AdvancedModelRendererExtended(this);
        this.siphon_r1.setRotationPoint(-0.5F, -1.0F, -4.0F);
        this.body.addChild(siphon_r1);
        this.setRotateAngle(siphon_r1, 0.1745F, 0.0F, 0.0F);
        this.siphon_r1.cubeList.add(new ModelBox(siphon_r1, 20, 26, -1.0F, -1.75F, -3.5F, 2, 2, 7, 0.0F, false));

        this.HookR = new AdvancedModelRendererExtended(this);
        this.HookR.setRotationPoint(-2.25F, -3.85F, -7.5F);
        this.body.addChild(HookR);
        this.setRotateAngle(HookR, 0.0F, 0.6109F, 0.0F);
        this.HookR.cubeList.add(new ModelBox(HookR, 18, 42, -0.5F, 0.0F, -6.5F, 5, 0, 7, 0.0F, false));

        this.HookL = new AdvancedModelRendererExtended(this);
        this.HookL.setRotationPoint(1.25F, -3.85F, -7.5F);
        this.body.addChild(HookL);
        this.setRotateAngle(HookL, 0.0F, -0.6109F, 0.0F);
        this.HookL.cubeList.add(new ModelBox(HookL, 18, 42, -4.5F, 0.0F, -6.5F, 5, 0, 7, 0.0F, true));

        this.finR = new AdvancedModelRendererExtended(this);
        this.finR.setRotationPoint(-1.0F, -3.5F, 14.0F);
        this.body.addChild(finR);
        this.finR.cubeList.add(new ModelBox(finR, 0, 0, -8.5F, 0.0F, -4.0F, 9, 0, 11, 0.0F, false));

        this.finL = new AdvancedModelRendererExtended(this);
        this.finL.setRotationPoint(0.0F, -3.5F, 14.0F);
        this.body.addChild(finL);
        this.finL.cubeList.add(new ModelBox(finL, 0, 0, -0.5F, 0.0F, -4.0F, 9, 0, 11, 0.0F, true));

        this.arm = new AdvancedModelRendererExtended(this);
        this.arm.setRotationPoint(-1.05F, -5.25F, -8.0F);
        this.body.addChild(arm);
        this.setRotateAngle(arm, 0.0F, 0.0F, -0.1745F);
        this.arm.cubeList.add(new ModelBox(arm, 31, 28, -0.5F, -0.5F, -7.0F, 1, 1, 7, 0.01F, false));
        this.arm.cubeList.add(new ModelBox(arm, 14, 29, -0.25F, 0.0F, -7.0F, 0, 1, 7, 0.0F, false));
        this.arm.cubeList.add(new ModelBox(arm, 14, 29, 0.25F, 0.0F, -7.0F, 0, 1, 7, 0.0F, false));

        this.arms = new AdvancedModelRendererExtended(this);
        this.arms.setRotationPoint(0.0F, 0.0F, -7.0F);
        this.arm.addChild(arms);
        this.arms.cubeList.add(new ModelBox(arms, 0, 29, -0.25F, 0.0F, -7.0F, 0, 1, 7, 0.0F, false));
        this.arms.cubeList.add(new ModelBox(arms, 0, 29, 0.25F, 0.0F, -7.0F, 0, 1, 7, 0.0F, false));
        this.arms.cubeList.add(new ModelBox(arms, 31, 19, -0.5F, -0.5F, -7.0F, 1, 1, 7, 0.0F, false));

        this.arm6 = new AdvancedModelRendererExtended(this);
        this.arm6.setRotationPoint(0.05F, -5.25F, -8.0F);
        this.body.addChild(arm6);
        this.setRotateAngle(arm6, 0.0F, 0.0F, 0.1745F);
        this.arm6.cubeList.add(new ModelBox(arm6, 31, 28, -0.5F, -0.5F, -7.0F, 1, 1, 7, 0.01F, true));
        this.arm6.cubeList.add(new ModelBox(arm6, 14, 29, 0.25F, 0.0F, -7.0F, 0, 1, 7, 0.0F, true));
        this.arm6.cubeList.add(new ModelBox(arm6, 14, 29, -0.25F, 0.0F, -7.0F, 0, 1, 7, 0.0F, true));

        this.arms6 = new AdvancedModelRendererExtended(this);
        this.arms6.setRotationPoint(0.0F, 0.0F, -7.0F);
        this.arm6.addChild(arms6);
        this.arms6.cubeList.add(new ModelBox(arms6, 0, 29, 0.25F, 0.0F, -7.0F, 0, 1, 7, 0.0F, true));
        this.arms6.cubeList.add(new ModelBox(arms6, 0, 29, -0.25F, 0.0F, -7.0F, 0, 1, 7, 0.0F, true));
        this.arms6.cubeList.add(new ModelBox(arms6, 31, 19, -0.5F, -0.5F, -7.0F, 1, 1, 7, 0.0F, true));

        this.arm2 = new AdvancedModelRendererExtended(this);
        this.arm2.setRotationPoint(-2.3F, -4.75F, -8.0F);
        this.body.addChild(arm2);
        this.setRotateAngle(arm2, 0.0F, 0.0F, -0.829F);
        this.arm2.cubeList.add(new ModelBox(arm2, 31, 28, -0.5F, -0.5F, -7.0F, 1, 1, 7, 0.01F, false));
        this.arm2.cubeList.add(new ModelBox(arm2, 14, 29, -0.25F, 0.0F, -7.0F, 0, 1, 7, 0.0F, false));
        this.arm2.cubeList.add(new ModelBox(arm2, 14, 29, 0.25F, 0.0F, -7.0F, 0, 1, 7, 0.0F, false));

        this.arms2 = new AdvancedModelRendererExtended(this);
        this.arms2.setRotationPoint(0.0F, 0.0F, -7.0F);
        this.arm2.addChild(arms2);
        this.arms2.cubeList.add(new ModelBox(arms2, 0, 29, -0.25F, 0.0F, -7.0F, 0, 1, 7, 0.0F, false));
        this.arms2.cubeList.add(new ModelBox(arms2, 0, 29, 0.25F, 0.0F, -7.0F, 0, 1, 7, 0.0F, false));
        this.arms2.cubeList.add(new ModelBox(arms2, 31, 19, -0.5F, -0.5F, -7.0F, 1, 1, 7, 0.0F, false));

        this.arm7 = new AdvancedModelRendererExtended(this);
        this.arm7.setRotationPoint(1.3F, -4.75F, -8.0F);
        this.body.addChild(arm7);
        this.setRotateAngle(arm7, 0.0F, 0.0F, 0.829F);
        this.arm7.cubeList.add(new ModelBox(arm7, 31, 28, -0.5F, -0.5F, -7.0F, 1, 1, 7, 0.01F, true));
        this.arm7.cubeList.add(new ModelBox(arm7, 14, 29, 0.25F, 0.0F, -7.0F, 0, 1, 7, 0.0F, true));
        this.arm7.cubeList.add(new ModelBox(arm7, 14, 29, -0.25F, 0.0F, -7.0F, 0, 1, 7, 0.0F, true));

        this.arms7 = new AdvancedModelRendererExtended(this);
        this.arms7.setRotationPoint(0.0F, 0.0F, -7.0F);
        this.arm7.addChild(arms7);
        this.arms7.cubeList.add(new ModelBox(arms7, 0, 29, 0.25F, 0.0F, -7.0F, 0, 1, 7, 0.0F, true));
        this.arms7.cubeList.add(new ModelBox(arms7, 0, 29, -0.25F, 0.0F, -7.0F, 0, 1, 7, 0.0F, true));
        this.arms7.cubeList.add(new ModelBox(arms7, 31, 19, -0.5F, -0.5F, -7.0F, 1, 1, 7, 0.0F, true));

        this.arm3 = new AdvancedModelRendererExtended(this);
        this.arm3.setRotationPoint(-2.5F, -3.25F, -8.0F);
        this.body.addChild(arm3);
        this.setRotateAngle(arm3, 0.0F, 0.0F, -1.5708F);
        this.arm3.cubeList.add(new ModelBox(arm3, 31, 28, -0.5F, -0.5F, -7.0F, 1, 1, 7, 0.01F, false));
        this.arm3.cubeList.add(new ModelBox(arm3, 14, 29, -0.25F, 0.0F, -7.0F, 0, 1, 7, 0.0F, false));
        this.arm3.cubeList.add(new ModelBox(arm3, 14, 29, 0.25F, 0.0F, -7.0F, 0, 1, 7, 0.0F, false));

        this.arms3 = new AdvancedModelRendererExtended(this);
        this.arms3.setRotationPoint(0.0F, 0.0F, -7.0F);
        this.arm3.addChild(arms3);
        this.arms3.cubeList.add(new ModelBox(arms3, 0, 29, -0.25F, 0.0F, -7.0F, 0, 1, 7, 0.0F, false));
        this.arms3.cubeList.add(new ModelBox(arms3, 0, 29, 0.25F, 0.0F, -7.0F, 0, 1, 7, 0.0F, false));
        this.arms3.cubeList.add(new ModelBox(arms3, 31, 19, -0.5F, -0.5F, -7.0F, 1, 1, 7, 0.0F, false));

        this.arm8 = new AdvancedModelRendererExtended(this);
        this.arm8.setRotationPoint(1.5F, -3.25F, -8.0F);
        this.body.addChild(arm8);
        this.setRotateAngle(arm8, 0.0F, 0.0F, 1.5708F);
        this.arm8.cubeList.add(new ModelBox(arm8, 31, 28, -0.5F, -0.5F, -7.0F, 1, 1, 7, 0.01F, true));
        this.arm8.cubeList.add(new ModelBox(arm8, 14, 29, 0.25F, 0.0F, -7.0F, 0, 1, 7, 0.0F, true));
        this.arm8.cubeList.add(new ModelBox(arm8, 14, 29, -0.25F, 0.0F, -7.0F, 0, 1, 7, 0.0F, true));

        this.arms8 = new AdvancedModelRendererExtended(this);
        this.arms8.setRotationPoint(0.0F, 0.0F, -7.0F);
        this.arm8.addChild(arms8);
        this.arms8.cubeList.add(new ModelBox(arms8, 0, 29, 0.25F, 0.0F, -7.0F, 0, 1, 7, 0.0F, true));
        this.arms8.cubeList.add(new ModelBox(arms8, 0, 29, -0.25F, 0.0F, -7.0F, 0, 1, 7, 0.0F, true));
        this.arms8.cubeList.add(new ModelBox(arms8, 31, 19, -0.5F, -0.5F, -7.0F, 1, 1, 7, 0.0F, true));

        this.arm4 = new AdvancedModelRendererExtended(this);
        this.arm4.setRotationPoint(-2.25F, -1.95F, -8.0F);
        this.body.addChild(arm4);
        this.setRotateAngle(arm4, 0.0F, 0.0F, -2.3998F);
        this.arm4.cubeList.add(new ModelBox(arm4, 31, 28, -0.5F, -0.5F, -7.0F, 1, 1, 7, 0.01F, false));
        this.arm4.cubeList.add(new ModelBox(arm4, 14, 29, -0.25F, 0.0F, -7.0F, 0, 1, 7, 0.0F, false));
        this.arm4.cubeList.add(new ModelBox(arm4, 14, 29, 0.25F, 0.0F, -7.0F, 0, 1, 7, 0.0F, false));

        this.arms4 = new AdvancedModelRendererExtended(this);
        this.arms4.setRotationPoint(0.0F, 0.0F, -7.0F);
        this.arm4.addChild(arms4);
        this.arms4.cubeList.add(new ModelBox(arms4, 0, 29, -0.25F, 0.0F, -7.0F, 0, 1, 7, 0.0F, false));
        this.arms4.cubeList.add(new ModelBox(arms4, 0, 29, 0.25F, 0.0F, -7.0F, 0, 1, 7, 0.0F, false));
        this.arms4.cubeList.add(new ModelBox(arms4, 31, 19, -0.5F, -0.5F, -7.0F, 1, 1, 7, 0.0F, false));

        this.arm9 = new AdvancedModelRendererExtended(this);
        this.arm9.setRotationPoint(1.25F, -1.95F, -8.0F);
        this.body.addChild(arm9);
        this.setRotateAngle(arm9, 0.0F, 0.0F, 2.3998F);
        this.arm9.cubeList.add(new ModelBox(arm9, 31, 28, -0.5F, -0.5F, -7.0F, 1, 1, 7, 0.01F, true));
        this.arm9.cubeList.add(new ModelBox(arm9, 14, 29, 0.25F, 0.0F, -7.0F, 0, 1, 7, 0.0F, true));
        this.arm9.cubeList.add(new ModelBox(arm9, 14, 29, -0.25F, 0.0F, -7.0F, 0, 1, 7, 0.0F, true));

        this.arms9 = new AdvancedModelRendererExtended(this);
        this.arms9.setRotationPoint(0.0F, 0.0F, -7.0F);
        this.arm9.addChild(arms9);
        this.arms9.cubeList.add(new ModelBox(arms9, 0, 29, 0.25F, 0.0F, -7.0F, 0, 1, 7, 0.0F, true));
        this.arms9.cubeList.add(new ModelBox(arms9, 0, 29, -0.25F, 0.0F, -7.0F, 0, 1, 7, 0.0F, true));
        this.arms9.cubeList.add(new ModelBox(arms9, 31, 19, -0.5F, -0.5F, -7.0F, 1, 1, 7, 0.0F, true));

        this.arm5 = new AdvancedModelRendererExtended(this);
        this.arm5.setRotationPoint(-1.05F, -1.5F, -8.0F);
        this.body.addChild(arm5);
        this.setRotateAngle(arm5, 0.0F, 0.0F, -2.9671F);
        this.arm5.cubeList.add(new ModelBox(arm5, 31, 28, -0.5F, -0.5F, -7.0F, 1, 1, 7, 0.01F, false));
        this.arm5.cubeList.add(new ModelBox(arm5, 14, 29, -0.25F, 0.0F, -7.0F, 0, 1, 7, 0.0F, false));
        this.arm5.cubeList.add(new ModelBox(arm5, 14, 29, 0.25F, 0.0F, -7.0F, 0, 1, 7, 0.0F, false));

        this.arms5 = new AdvancedModelRendererExtended(this);
        this.arms5.setRotationPoint(0.0F, 0.0F, -7.0F);
        this.arm5.addChild(arms5);
        this.arms5.cubeList.add(new ModelBox(arms5, 0, 29, -0.25F, 0.0F, -7.0F, 0, 1, 7, 0.0F, false));
        this.arms5.cubeList.add(new ModelBox(arms5, 0, 29, 0.25F, 0.0F, -7.0F, 0, 1, 7, 0.0F, false));
        this.arms5.cubeList.add(new ModelBox(arms5, 31, 19, -0.5F, -0.5F, -7.0F, 1, 1, 7, 0.0F, false));

        this.arm10 = new AdvancedModelRendererExtended(this);
        this.arm10.setRotationPoint(0.05F, -1.5F, -8.0F);
        this.body.addChild(arm10);
        this.setRotateAngle(arm10, 0.0F, 0.0F, 2.9671F);
        this.arm10.cubeList.add(new ModelBox(arm10, 31, 28, -0.5F, -0.5F, -7.0F, 1, 1, 7, 0.01F, true));
        this.arm10.cubeList.add(new ModelBox(arm10, 14, 29, 0.25F, 0.0F, -7.0F, 0, 1, 7, 0.0F, true));
        this.arm10.cubeList.add(new ModelBox(arm10, 14, 29, -0.25F, 0.0F, -7.0F, 0, 1, 7, 0.0F, true));

        this.arms10 = new AdvancedModelRendererExtended(this);
        this.arms10.setRotationPoint(0.0F, 0.0F, -7.0F);
        this.arm10.addChild(arms10);
        this.arms10.cubeList.add(new ModelBox(arms10, 0, 29, 0.25F, 0.0F, -7.0F, 0, 1, 7, 0.0F, true));
        this.arms10.cubeList.add(new ModelBox(arms10, 0, 29, -0.25F, 0.0F, -7.0F, 0, 1, 7, 0.0F, true));
        this.arms10.cubeList.add(new ModelBox(arms10, 31, 19, -0.5F, -0.5F, -7.0F, 1, 1, 7, 0.0F, true));

        updateDefaultPose();
    }

    @Override
    public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        this.body.render(f5);
    }
    public void renderStaticWall(float f) {
        this.body.rotateAngleX = (float) Math.toRadians(90);
        this.setRotateAngle(arm, 0.0F, 0.0F, 0.0F);
        this.setRotateAngle(arms, 0.0F, 0.0F, 0.0F);
        this.setRotateAngle(arm2, 0.0F, 0.0F, 0.0F);
        this.setRotateAngle(arms2, 0.0F, 0.0F, 0.0F);
        this.body.offsetY = -0.2F;
        this.body.offsetX = 0.0F;
        this.body.offsetZ = 0.0F;
        this.body.render(0.01F);
        resetToDefaultPose();
    }

    public void renderStaticFloor(float f) {
        this.setRotateAngle(body, 0.4F, 0.0F, 0.0F);
        this.setRotateAngle(finL, 0.0F, 0.F, 0.0F);
        this.setRotateAngle(arm, -0.2F, 0.0F, 0.0F);
        this.setRotateAngle(arms, -0.2F, 0.0F, 0.0F);
        this.setRotateAngle(arm2, -0.2F, 0.0F, -0.7F);
        this.setRotateAngle(arms2, -0.2F, 0.0F, 0.0F);
        this.setRotateAngle(arm3, -0.2F, 0.0F, -1.5F);
        this.setRotateAngle(arms3, -0.2F, 0.0F, 0.0F);
        this.setRotateAngle(arm4, -0.2F, 0.0F, -2.5F);
        this.setRotateAngle(arms4, -0.2F, 0.0F, 0.0F);
        this.setRotateAngle(arm5, -0.2F, 0.0F, 3.2F);
        this.setRotateAngle(arms5, -0.2F, 0.0F, 0.0F);
        this.setRotateAngle(arm6, -0.2F, 0.0F, 0.2F);
        this.setRotateAngle(arms6, -0.2F, 0.0F, 0.0F);
        this.setRotateAngle(arm7, -0.2F, 0.0F, 0.7F);
        this.setRotateAngle(arms7, -0.2F, 0.0F, 0.0F);
        this.setRotateAngle(arm8, -0.2F, 0.0F, 1.5F);
        this.setRotateAngle(arms8, -0.2F, 0.0F, 0.0F);
        this.setRotateAngle(arm9, -0.2F, 0.0F, 2.5F);
        this.setRotateAngle(arms9, -0.2F, 0.0F, 0.0F);
        this.setRotateAngle(arm10, -0.2F, 0.0F, -3.2F);
        this.setRotateAngle(arms10, -0.2F, 0.0F, 0.0F);
        this.body.offsetY = -0.14F;
        this.body.render(0.01F);
        resetToDefaultPose();
    }
    public void renderStaticSuspended(float f) {
        this.setRotateAngle(body, 0.0F, 0.0F, 0.4F);
        this.setRotateAngle(finL, 0.0F, 0.0F, 0.4F);
        this.setRotateAngle(finR, 0.0F, 0.0F, -0.4F);
        this.body.offsetY = 0.09F;
        this.body.render(0.01F);
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
        //this.body.offsetY = 1.3F;
        this.body.rotateAngleY = (float) Math.toRadians(180);
        //this.body.offsetZ = -1F;

        AdvancedModelRendererExtended[] tentacle1 = {this.arm, this.arms};
        AdvancedModelRendererExtended[] tentacle2 = {this.arm2, this.arms2};
        AdvancedModelRendererExtended[] tentacle3 = {this.arm3, this.arms3};
        AdvancedModelRendererExtended[] tentacle4 = {this.arm4, this.arms4};
        AdvancedModelRendererExtended[] tentacle5 = {this.arm5, this.arms5};
        AdvancedModelRendererExtended[] tentacle6 = {this.arm6, this.arms6};
        AdvancedModelRendererExtended[] tentacle7 = {this.arm7, this.arms7};
        AdvancedModelRendererExtended[] tentacle8 = {this.arm8, this.arms8};
        AdvancedModelRendererExtended[] tentacle9 = {this.arm9, this.arms9};
        AdvancedModelRendererExtended[] tentacle10 = {this.arm10, this.arms10};


        float speed = 0.13F;
        if (!e.isInWater()) {
            speed = 0.5F;
        }

        float degreeTentacle =0.1F;

        this.chainWave(tentacle1, speed, degreeTentacle, 0, f2, 1F);
        this.chainWave(tentacle2, speed, degreeTentacle, 0, f2, 1F);
        this.chainWave(tentacle3, speed, degreeTentacle, 0, f2, 1F);
        this.chainWave(tentacle4, speed, degreeTentacle, 0, f2, 1F);
        this.chainWave(tentacle5, speed, degreeTentacle, 0, f2, 1F);
        this.chainWave(tentacle6, speed, degreeTentacle, 0, f2, 1F);
        this.chainWave(tentacle7, speed, degreeTentacle, 0, f2, 1F);
        this.chainWave(tentacle8, speed, degreeTentacle, 0, f2, 1F);
        this.chainWave(tentacle9, speed, degreeTentacle, 0, f2, 1F);
        this.chainWave(tentacle10, speed, degreeTentacle, 0, f2, 1F);
        this.swing(HookL, (float) (speed), 0.15F, true, 0, 0, f2, 1);
        this.swing(HookR, (float) (speed), 0.15F, true, 0, 0, f2, 1);



        if (e.isInWater()) {
            float bobSpeed = 0.1F;
            this.bobExtended(body, bobSpeed, 0.5F, false, 0.1F, f2, 2);
            this.body.offsetZ = this.moveBoxExtended(speed, 0.50F, false, 3, f2, 1);
        }
        else {
            this.body.rotateAngleZ = (float) Math.toRadians(90);
            //this.body.offsetY = 0.25F;
        }

    }

}
