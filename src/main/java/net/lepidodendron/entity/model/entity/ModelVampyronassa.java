package net.lepidodendron.entity.model.entity;

import net.lepidodendron.entity.model.llibraryextensions.AdvancedModelBaseExtended;
import net.lepidodendron.entity.model.llibraryextensions.AdvancedModelRendererExtended;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

public class ModelVampyronassa extends AdvancedModelBaseExtended {
    private final AdvancedModelRendererExtended body;
    private final AdvancedModelRendererExtended FinR;
    private final AdvancedModelRendererExtended FinL;
    private final AdvancedModelRendererExtended head;
    private final AdvancedModelRendererExtended cube_r1;
    private final AdvancedModelRendererExtended arm;
    private final AdvancedModelRendererExtended arms;
    private final AdvancedModelRendererExtended arm4;
    private final AdvancedModelRendererExtended arms4;
    private final AdvancedModelRendererExtended arm2;
    private final AdvancedModelRendererExtended arms2;
    private final AdvancedModelRendererExtended arm5;
    private final AdvancedModelRendererExtended arms5;
    private final AdvancedModelRendererExtended arm3;
    private final AdvancedModelRendererExtended cube_r2;
    private final AdvancedModelRendererExtended arms3;
    private final AdvancedModelRendererExtended arm6;
    private final AdvancedModelRendererExtended cube_r3;
    private final AdvancedModelRendererExtended arms6;
    private final AdvancedModelRendererExtended tentacle;
    private final AdvancedModelRendererExtended cube_r4;
    private final AdvancedModelRendererExtended tentacles;
    private final AdvancedModelRendererExtended cube_r5;
    private final AdvancedModelRendererExtended cube_r6;
    private final AdvancedModelRendererExtended tentacle2;
    private final AdvancedModelRendererExtended cube_r7;
    private final AdvancedModelRendererExtended tentacles2;
    private final AdvancedModelRendererExtended cube_r8;
    private final AdvancedModelRendererExtended cube_r9;

    public ModelVampyronassa() {
        this.textureWidth = 32;
        this.textureHeight = 32;

        this.body = new AdvancedModelRendererExtended(this);
        this.body.setRotationPoint(0.0F, 24.0F, 1.0F);
        this.body.cubeList.add(new ModelBox(body, 0, 0, -2.0F, -3.5F, -5.0F, 4, 4, 5, 0.01F, false));
        this.body.cubeList.add(new ModelBox(body, 11, 13, -1.5F, -3.0F, -0.5F, 3, 3, 3, 0.0F, false));

        this.FinR = new AdvancedModelRendererExtended(this);
        this.FinR.setRotationPoint(-1.3F, -1.5F, 2.0F);
        this.body.addChild(FinR);
        this.setRotateAngle(FinR, 0.0F, 0.3491F, 0.3491F);
        this.FinR.cubeList.add(new ModelBox(FinR, 10, 10, -2.35F, 0.0F, -0.5F, 3, 0, 1, 0.0F, false));

        this.FinL = new AdvancedModelRendererExtended(this);
        this.FinL.setRotationPoint(1.3F, -1.5F, 2.0F);
        this.body.addChild(FinL);
        this.setRotateAngle(FinL, 0.0F, -0.3491F, -0.3491F);
        this.FinL.cubeList.add(new ModelBox(FinL, 10, 10, -0.65F, 0.0F, -0.5F, 3, 0, 1, 0.0F, true));

        this.head = new AdvancedModelRendererExtended(this);
        this.head.setRotationPoint(0.0F, -2.5F, -4.9F);
        this.body.addChild(head);
        this.setRotateAngle(head, 0.0873F, 0.0F, 0.0F);
        this.head.cubeList.add(new ModelBox(head, 0, 9, -2.0F, -1.0F, -3.0F, 4, 4, 3, 0.0F, false));
        this.head.cubeList.add(new ModelBox(head, 16, 10, -1.0F, 0.0F, -3.75F, 2, 2, 1, 0.0F, false));
        this.head.cubeList.add(new ModelBox(head, 0, 16, -0.5F, 0.5F, -3.76F, 1, 1, 1, 0.0F, false));
        this.head.cubeList.add(new ModelBox(head, 17, 0, -2.25F, -0.1F, -2.25F, 1, 2, 2, 0.0F, false));
        this.head.cubeList.add(new ModelBox(head, 0, 18, -2.3F, 0.4F, -1.75F, 1, 1, 1, 0.0F, false));
        this.head.cubeList.add(new ModelBox(head, 0, 18, 1.3F, 0.4F, -1.75F, 1, 1, 1, 0.0F, true));
        this.head.cubeList.add(new ModelBox(head, 17, 0, 1.25F, -0.1F, -2.25F, 1, 2, 2, 0.0F, true));

        this.cube_r1 = new AdvancedModelRendererExtended(this);
        this.cube_r1.setRotationPoint(0.0F, 2.5F, 6.0F);
        this.head.addChild(cube_r1);
        this.setRotateAngle(cube_r1, 0.2182F, 0.0F, 0.0F);
        this.cube_r1.cubeList.add(new ModelBox(cube_r1, 0, 3, -0.5F, -1.8F, -6.55F, 1, 1, 1, 0.0F, false));

        this.arm = new AdvancedModelRendererExtended(this);
        this.arm.setRotationPoint(-1.75F, 0.35F, -3.0F);
        this.head.addChild(arm);
        this.setRotateAngle(arm, 0.1745F, 0.3491F, 0.6981F);
        this.arm.cubeList.add(new ModelBox(arm, 18, 19, -0.5F, -0.5F, -2.0F, 1, 1, 2, 0.0F, false));
        this.arm.cubeList.add(new ModelBox(arm, 0, 0, 0.0F, -1.5F, -1.65F, 0, 1, 2, 0.0F, false));
        this.arm.cubeList.add(new ModelBox(arm, 10, 9, -0.25F, -0.25F, -2.0F, 1, 0, 1, 0.0F, false));
        this.arm.cubeList.add(new ModelBox(arm, 0, 10, -0.25F, 0.25F, -2.0F, 1, 0, 1, 0.0F, false));

        this.arms = new AdvancedModelRendererExtended(this);
        this.arms.setRotationPoint(0.0F, 0.0F, -2.0F);
        this.arm.addChild(arms);
        this.arms.cubeList.add(new ModelBox(arms, 0, 9, -0.25F, 0.25F, -1.75F, 1, 0, 1, 0.0F, false));
        this.arms.cubeList.add(new ModelBox(arms, 2, 3, -0.25F, -0.25F, -1.75F, 1, 0, 1, 0.0F, false));
        this.arms.cubeList.add(new ModelBox(arms, 12, 19, -0.5F, -0.5F, -1.975F, 1, 1, 2, -0.01F, false));

        this.arm4 = new AdvancedModelRendererExtended(this);
        this.arm4.setRotationPoint(1.75F, 0.35F, -3.0F);
        this.head.addChild(arm4);
        this.setRotateAngle(arm4, 0.1745F, -0.3491F, -0.6981F);
        this.arm4.cubeList.add(new ModelBox(arm4, 18, 19, -0.5F, -0.5F, -2.0F, 1, 1, 2, 0.0F, true));
        this.arm4.cubeList.add(new ModelBox(arm4, 0, 0, 0.0F, -1.5F, -1.65F, 0, 1, 2, 0.0F, true));
        this.arm4.cubeList.add(new ModelBox(arm4, 10, 9, -0.75F, -0.25F, -2.0F, 1, 0, 1, 0.0F, true));
        this.arm4.cubeList.add(new ModelBox(arm4, 0, 10, -0.75F, 0.25F, -2.0F, 1, 0, 1, 0.0F, true));

        this.arms4 = new AdvancedModelRendererExtended(this);
        this.arms4.setRotationPoint(0.0F, 0.0F, -2.0F);
        this.arm4.addChild(arms4);
        this.arms4.cubeList.add(new ModelBox(arms4, 0, 9, -0.75F, 0.25F, -1.75F, 1, 0, 1, 0.0F, true));
        this.arms4.cubeList.add(new ModelBox(arms4, 2, 3, -0.75F, -0.25F, -1.75F, 1, 0, 1, 0.0F, true));
        this.arms4.cubeList.add(new ModelBox(arms4, 12, 19, -0.5F, -0.5F, -1.975F, 1, 1, 2, -0.01F, true));

        this.arm2 = new AdvancedModelRendererExtended(this);
        this.arm2.setRotationPoint(-1.6F, 1.65F, -3.0F);
        this.head.addChild(arm2);
        this.setRotateAngle(arm2, 0.0873F, 0.3927F, -0.2618F);
        this.arm2.cubeList.add(new ModelBox(arm2, 18, 19, -0.5F, -0.5F, -2.0F, 1, 1, 2, 0.0F, false));
        this.arm2.cubeList.add(new ModelBox(arm2, 0, 0, 0.0F, -1.5F, -1.65F, 0, 1, 2, 0.0F, false));
        this.arm2.cubeList.add(new ModelBox(arm2, 10, 9, -0.25F, -0.25F, -2.0F, 1, 0, 1, 0.0F, false));
        this.arm2.cubeList.add(new ModelBox(arm2, 0, 10, -0.25F, 0.25F, -2.0F, 1, 0, 1, 0.0F, false));

        this.arms2 = new AdvancedModelRendererExtended(this);
        this.arms2.setRotationPoint(0.0F, 0.0F, -2.0F);
        this.arm2.addChild(arms2);
        this.arms2.cubeList.add(new ModelBox(arms2, 0, 9, -0.25F, 0.25F, -1.75F, 1, 0, 1, 0.0F, false));
        this.arms2.cubeList.add(new ModelBox(arms2, 2, 3, -0.25F, -0.25F, -1.75F, 1, 0, 1, 0.0F, false));
        this.arms2.cubeList.add(new ModelBox(arms2, 12, 19, -0.5F, -0.5F, -1.975F, 1, 1, 2, -0.01F, false));

        this.arm5 = new AdvancedModelRendererExtended(this);
        this.arm5.setRotationPoint(1.6F, 1.65F, -3.0F);
        this.head.addChild(arm5);
        this.setRotateAngle(arm5, 0.0873F, -0.3927F, 0.2618F);
        this.arm5.cubeList.add(new ModelBox(arm5, 18, 19, -0.5F, -0.5F, -2.0F, 1, 1, 2, 0.0F, true));
        this.arm5.cubeList.add(new ModelBox(arm5, 0, 0, 0.0F, -1.5F, -1.65F, 0, 1, 2, 0.0F, true));
        this.arm5.cubeList.add(new ModelBox(arm5, 10, 9, -0.75F, -0.25F, -2.0F, 1, 0, 1, 0.0F, true));
        this.arm5.cubeList.add(new ModelBox(arm5, 0, 10, -0.75F, 0.25F, -2.0F, 1, 0, 1, 0.0F, true));

        this.arms5 = new AdvancedModelRendererExtended(this);
        this.arms5.setRotationPoint(0.0F, 0.0F, -2.0F);
        this.arm5.addChild(arms5);
        this.arms5.cubeList.add(new ModelBox(arms5, 0, 9, -0.75F, 0.25F, -1.75F, 1, 0, 1, 0.0F, true));
        this.arms5.cubeList.add(new ModelBox(arms5, 2, 3, -0.75F, -0.25F, -1.75F, 1, 0, 1, 0.0F, true));
        this.arms5.cubeList.add(new ModelBox(arms5, 12, 19, -0.5F, -0.5F, -1.975F, 1, 1, 2, -0.01F, true));

        this.arm3 = new AdvancedModelRendererExtended(this);
        this.arm3.setRotationPoint(-0.65F, 2.65F, -3.0F);
        this.head.addChild(arm3);
        this.setRotateAngle(arm3, -0.0873F, 0.4363F, -1.0472F);
        this.arm3.cubeList.add(new ModelBox(arm3, 18, 19, -0.5F, -0.5F, -2.0F, 1, 1, 2, 0.0F, false));
        this.arm3.cubeList.add(new ModelBox(arm3, 0, 0, 0.0F, -1.5F, -1.65F, 0, 1, 2, 0.0F, false));
        this.arm3.cubeList.add(new ModelBox(arm3, 10, 9, -0.25F, -0.25F, -2.0F, 1, 0, 1, 0.0F, false));
        this.arm3.cubeList.add(new ModelBox(arm3, 0, 10, -0.25F, 0.25F, -2.0F, 1, 0, 1, 0.0F, false));

        this.cube_r2 = new AdvancedModelRendererExtended(this);
        this.cube_r2.setRotationPoint(0.0F, 0.8F, 0.0F);
        this.arm3.addChild(cube_r2);
        this.setRotateAngle(cube_r2, 0.0F, 0.0F, 1.1345F);
        this.cube_r2.cubeList.add(new ModelBox(cube_r2, 0, 0, -0.65F, 0.0F, -1.75F, 1, 0, 2, 0.0F, false));

        this.arms3 = new AdvancedModelRendererExtended(this);
        this.arms3.setRotationPoint(0.0F, 0.0F, -2.0F);
        this.arm3.addChild(arms3);
        this.arms3.cubeList.add(new ModelBox(arms3, 0, 9, -0.25F, 0.25F, -1.75F, 1, 0, 1, 0.0F, false));
        this.arms3.cubeList.add(new ModelBox(arms3, 2, 3, -0.25F, -0.25F, -1.75F, 1, 0, 1, 0.0F, false));
        this.arms3.cubeList.add(new ModelBox(arms3, 12, 19, -0.5F, -0.5F, -1.975F, 1, 1, 2, -0.01F, false));

        this.arm6 = new AdvancedModelRendererExtended(this);
        this.arm6.setRotationPoint(0.65F, 2.65F, -3.0F);
        this.head.addChild(arm6);
        this.setRotateAngle(arm6, -0.0873F, -0.4363F, 1.0472F);
        this.arm6.cubeList.add(new ModelBox(arm6, 18, 19, -0.5F, -0.5F, -2.0F, 1, 1, 2, 0.0F, true));
        this.arm6.cubeList.add(new ModelBox(arm6, 0, 0, 0.0F, -1.5F, -1.65F, 0, 1, 2, 0.0F, true));
        this.arm6.cubeList.add(new ModelBox(arm6, 10, 9, -0.75F, -0.25F, -2.0F, 1, 0, 1, 0.0F, true));
        this.arm6.cubeList.add(new ModelBox(arm6, 0, 10, -0.75F, 0.25F, -2.0F, 1, 0, 1, 0.0F, true));

        this.cube_r3 = new AdvancedModelRendererExtended(this);
        this.cube_r3.setRotationPoint(0.0F, 0.8F, 0.0F);
        this.arm6.addChild(cube_r3);
        this.setRotateAngle(cube_r3, 0.0F, 0.0F, -1.1345F);
        this.cube_r3.cubeList.add(new ModelBox(cube_r3, 0, 0, -0.35F, 0.0F, -1.75F, 1, 0, 2, 0.0F, true));

        this.arms6 = new AdvancedModelRendererExtended(this);
        this.arms6.setRotationPoint(0.0F, 0.0F, -2.0F);
        this.arm6.addChild(arms6);
        this.arms6.cubeList.add(new ModelBox(arms6, 0, 9, -0.75F, 0.25F, -1.75F, 1, 0, 1, 0.0F, true));
        this.arms6.cubeList.add(new ModelBox(arms6, 2, 3, -0.75F, -0.25F, -1.75F, 1, 0, 1, 0.0F, true));
        this.arms6.cubeList.add(new ModelBox(arms6, 12, 19, -0.5F, -0.5F, -1.975F, 1, 1, 2, -0.01F, true));

        this.tentacle = new AdvancedModelRendererExtended(this);
        this.tentacle.setRotationPoint(-0.5F, -0.5F, -3.0F);
        this.head.addChild(tentacle);
        this.setRotateAngle(tentacle, -0.1745F, 0.3491F, -0.1745F);
        this.tentacle.cubeList.add(new ModelBox(tentacle, 0, 16, -0.5F, -0.5F, -4.0F, 1, 1, 4, 0.0F, false));

        this.cube_r4 = new AdvancedModelRendererExtended(this);
        this.cube_r4.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.tentacle.addChild(cube_r4);
        this.setRotateAngle(cube_r4, 0.0F, -0.2618F, 0.0F);
        this.cube_r4.cubeList.add(new ModelBox(cube_r4, 0, 0, -0.3F, -0.25F, -1.75F, 1, 0, 2, 0.0F, false));

        this.tentacles = new AdvancedModelRendererExtended(this);
        this.tentacles.setRotationPoint(0.0F, 0.0F, -4.0F);
        this.tentacle.addChild(tentacles);
        this.setRotateAngle(tentacles, -0.2182F, 0.1745F, 0.0F);
        this.tentacles.cubeList.add(new ModelBox(tentacles, 13, 4, -0.5F, -0.5F, -4.975F, 1, 1, 5, -0.01F, false));

        this.cube_r5 = new AdvancedModelRendererExtended(this);
        this.cube_r5.setRotationPoint(-0.5F, 0.5F, -2.0F);
        this.tentacles.addChild(cube_r5);
        this.setRotateAngle(cube_r5, 0.0F, 0.0F, -0.6981F);
        this.cube_r5.cubeList.add(new ModelBox(cube_r5, 8, 0, -0.5F, 0.0F, -2.875F, 1, 0, 5, 0.0F, false));

        this.cube_r6 = new AdvancedModelRendererExtended(this);
        this.cube_r6.setRotationPoint(0.5F, 0.5F, -2.0F);
        this.tentacles.addChild(cube_r6);
        this.setRotateAngle(cube_r6, 0.0F, 0.0F, 0.6981F);
        this.cube_r6.cubeList.add(new ModelBox(cube_r6, 10, 0, -0.5F, 0.0F, -2.875F, 1, 0, 5, 0.0F, false));

        this.tentacle2 = new AdvancedModelRendererExtended(this);
        this.tentacle2.setRotationPoint(0.5F, -0.5F, -3.0F);
        this.head.addChild(tentacle2);
        this.setRotateAngle(tentacle2, -0.1745F, -0.3491F, 0.1745F);
        this.tentacle2.cubeList.add(new ModelBox(tentacle2, 0, 16, -0.5F, -0.5F, -4.0F, 1, 1, 4, 0.0F, true));

        this.cube_r7 = new AdvancedModelRendererExtended(this);
        this.cube_r7.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.tentacle2.addChild(cube_r7);
        this.setRotateAngle(cube_r7, 0.0F, 0.2618F, 0.0F);
        this.cube_r7.cubeList.add(new ModelBox(cube_r7, 0, 0, -0.7F, -0.25F, -1.75F, 1, 0, 2, 0.0F, true));

        this.tentacles2 = new AdvancedModelRendererExtended(this);
        this.tentacles2.setRotationPoint(0.0F, 0.0F, -4.0F);
        this.tentacle2.addChild(tentacles2);
        this.setRotateAngle(tentacles2, -0.2182F, -0.1745F, 0.0F);
        this.tentacles2.cubeList.add(new ModelBox(tentacles2, 13, 4, -0.5F, -0.5F, -4.975F, 1, 1, 5, -0.01F, true));

        this.cube_r8 = new AdvancedModelRendererExtended(this);
        this.cube_r8.setRotationPoint(0.5F, 0.5F, -2.0F);
        this.tentacles2.addChild(cube_r8);
        this.setRotateAngle(cube_r8, 0.0F, 0.0F, 0.6981F);
        this.cube_r8.cubeList.add(new ModelBox(cube_r8, 8, 0, -0.5F, 0.0F, -2.875F, 1, 0, 5, 0.0F, true));

        this.cube_r9 = new AdvancedModelRendererExtended(this);
        this.cube_r9.setRotationPoint(-0.5F, 0.5F, -2.0F);
        this.tentacles2.addChild(cube_r9);
        this.setRotateAngle(cube_r9, 0.0F, 0.0F, -0.6981F);
        this.cube_r9.cubeList.add(new ModelBox(cube_r9, 10, 0, -0.5F, 0.0F, -2.875F, 1, 0, 5, 0.0F, true));

        updateDefaultPose();
    }

    @Override
    public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        this.body.render(f5);
    }
    public void renderStatic(float f) {
        //GlStateManager.pushMatrix();
        //GlStateManager.enableBlend();
        //GlStateManager.blendFunc(GlStateManager.SourceFactor.SRC_ALPHA, GlStateManager.DestFactor.ONE_MINUS_SRC_ALPHA);
        //GlStateManager.disableCull();
        //this.body.offsetZ = 0.1F;
        this.body.render(0.014F);
        //GlStateManager.enableCull();
        //GlStateManager.disableBlend();
        //GlStateManager.popMatrix();
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

        AdvancedModelRendererExtended[] topRightT = {this.arm, this.arms};
        AdvancedModelRendererExtended[] topLeftT = {this.arm2, this.arms2};
        AdvancedModelRendererExtended[] centerRightT = {this.arm3, this.arms3};
        AdvancedModelRendererExtended[] centerLeftT = {this.arm4, this.arms4};
        AdvancedModelRendererExtended[] bottomRightT = {this.arm5, this.arms5};
        AdvancedModelRendererExtended[] bottomLeftT = {this.arm6, this.arms6};
        AdvancedModelRendererExtended[] longTentacleLeft = {this.tentacle, this.tentacles};
        AdvancedModelRendererExtended[] longTentacleRight = {this.tentacle2, this.tentacles2};

        float speed = 0.10F;
        if (!e.isInWater()) {
            speed = 0.5F;
        }

        //this.chainWave(head, speed, 0.15F, 0, f2, 1F);

        //Left middle:
        this.chainSwing(centerLeftT, speed, -0.3F, 2, f2, 1F);
        //Left lower middle:
        this.chainWave(bottomLeftT, speed, 0.3F, -1.5, f2, 1F);
        this.chainSwing(bottomLeftT, speed, -0.3F, -1.5, f2, 1F);
        //Left lower bottom:
        //this.chainWave(bottomMidLeftT, speed, 0.25F, -2, f2, 1F);
        //this.chainSwing(bottomMidLeftT, speed, -0.1F, -1.5, f2, 1F);
        //Left upper middle:
        this.chainWaveExtended(longTentacleLeft, speed, 0.3F, -2, 3F, f2, 1F);
        this.chainSwingExtended(longTentacleLeft, speed, -0.3F, -1.5, 3F, f2, 1F);
        //Left upper top:
        this.chainWave(topLeftT, speed, -0.25F, -2, f2, 1F);
        this.chainSwing(topLeftT, speed, -0.1F, -1.5, f2, 1F);

        //Right middle:
        this.chainSwing(centerRightT, speed, 0.3F, -2, f2, 1F);
        //Right lower middle:
        this.chainWave(bottomRightT, speed, 0.3F, -1.5, f2, 1F);
        this.chainSwing(bottomRightT, speed, 0.3F, -1.5, f2, 1F);
        //Right lower bottom:
        //this.chainWave(bottomMidRightT, speed, 0.25F, -2, f2, 1F);
        //this.chainSwing(bottomMidRightT, speed, 0.1F, -1.5, f2, 1F);
        //Right upper middle:
        this.chainWaveExtended(longTentacleRight, speed, 0.3F, -2, 3F, f2, 1F);
        this.chainSwingExtended(longTentacleRight, speed, 0.3F, -1.5, 3F, f2, 1F);
        //Right upper top:
        this.chainWave(topRightT, speed, -0.25F, -2, f2, 1F);
        this.chainSwing(topRightT, speed, 0.1F, -1.5, f2, 1F);

        if (e.isInWater()) {
            float bobSpeed = 0.1F;
            this.bob(body, bobSpeed, 0.8F, false, f2, 2);
            this.body.offsetZ = this.moveBoxExtended(speed, 0.125F, false, 0, f2, 1);
        }
        else {
            this.body.rotateAngleZ = (float) Math.toRadians(90);
            this.body.offsetY = 1.25F;
        }

    }

}
