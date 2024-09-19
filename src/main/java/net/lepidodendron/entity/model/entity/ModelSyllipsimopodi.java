package net.lepidodendron.entity.model.entity;

import net.lepidodendron.entity.model.ModelBasePalaeopedia;
import net.lepidodendron.entity.model.llibraryextensions.AdvancedModelRendererExtended;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

public class ModelSyllipsimopodi extends ModelBasePalaeopedia {
    private final AdvancedModelRendererExtended body;
    private final AdvancedModelRendererExtended body2;
    private final AdvancedModelRendererExtended body3;
    private final AdvancedModelRendererExtended head;
    private final AdvancedModelRendererExtended cube_r1;
    private final AdvancedModelRendererExtended arm;
    private final AdvancedModelRendererExtended arms;
    private final AdvancedModelRendererExtended arm5;
    private final AdvancedModelRendererExtended arms5;
    private final AdvancedModelRendererExtended arm7;
    private final AdvancedModelRendererExtended arms7;
    private final AdvancedModelRendererExtended arm8;
    private final AdvancedModelRendererExtended arms8;
    private final AdvancedModelRendererExtended arm6;
    private final AdvancedModelRendererExtended arms6;
    private final AdvancedModelRendererExtended arm3;
    private final AdvancedModelRendererExtended arms3;
    private final AdvancedModelRendererExtended arm4;
    private final AdvancedModelRendererExtended arms4;
    private final AdvancedModelRendererExtended arm2;
    private final AdvancedModelRendererExtended arms2;
    private final AdvancedModelRendererExtended tentacle2;
    private final AdvancedModelRendererExtended tentacles2;
    private final AdvancedModelRendererExtended tentacle;
    private final AdvancedModelRendererExtended tentacles;

    public ModelSyllipsimopodi() {
        this.textureWidth = 64;
        this.textureHeight = 64;

        this.body = new AdvancedModelRendererExtended(this);
        this.body.setRotationPoint(0.0F, 24.0F, 2.0F);
        this.body.cubeList.add(new ModelBox(body, 0, 0, -2.5F, -3.5F, -6.0F, 5, 3, 11, 0.0F, false));
        this.body.cubeList.add(new ModelBox(body, 0, 0, -2.5F, -3.5F, -4.0F, 5, 3, 11, -0.01F, false));

        this.body2 = new AdvancedModelRendererExtended(this);
        this.body2.setRotationPoint(0.0F, -2.0F, 5.75F);
        this.body.addChild(body2);
        this.setRotateAngle(body2, -0.0436F, 0.0F, 0.0F);
        this.body2.cubeList.add(new ModelBox(body2, 0, 14, -2.0F, -1.0F, 1.0F, 4, 2, 6, 0.0F, false));
        this.body2.cubeList.add(new ModelBox(body2, 0, 14, -2.0F, -1.0F, 5.0F, 4, 2, 6, -0.01F, false));
        this.body2.cubeList.add(new ModelBox(body2, 32, 20, -1.5F, -1.0F, 11.0F, 3, 2, 5, 0.0F, false));

        this.body3 = new AdvancedModelRendererExtended(this);
        this.body3.setRotationPoint(0.0F, 0.0F, 14.75F);
        this.body2.addChild(body3);
        this.body3.cubeList.add(new ModelBox(body3, 8, 23, -1.0F, -0.5F, 0.0F, 2, 1, 4, 0.0F, false));
        this.body3.cubeList.add(new ModelBox(body3, 8, 23, -1.0F, -0.5F, 4.0F, 2, 1, 4, 0.0F, false));
        this.body3.cubeList.add(new ModelBox(body3, 24, 11, -0.5F, -0.5F, 8.0F, 1, 1, 8, 0.0F, false));
        this.body3.cubeList.add(new ModelBox(body3, -9, 30, -1.5F, 0.0F, 1.75F, 3, 0, 9, 0.0F, false));
        this.body3.cubeList.add(new ModelBox(body3, -5, 39, -1.0F, 0.0F, 10.75F, 2, 0, 5, 0.0F, false));
        this.body3.cubeList.add(new ModelBox(body3, -1, 51, -0.5F, 0.0F, 15.75F, 1, 0, 1, 0.0F, false));

        this.head = new AdvancedModelRendererExtended(this);
        this.head.setRotationPoint(0.0F, -3.5F, -5.0F);
        this.body.addChild(head);
        this.setRotateAngle(head, 0.1309F, 0.0F, 0.0F);
        this.head.cubeList.add(new ModelBox(head, 16, 20, -2.0F, 0.0F, -4.0F, 4, 3, 4, 0.0F, false));
        this.head.cubeList.add(new ModelBox(head, 0, 14, -2.6F, 0.5F, -3.25F, 1, 2, 2, 0.0F, false));
        this.head.cubeList.add(new ModelBox(head, 5, 0, -2.65F, 1.0F, -2.75F, 1, 1, 1, 0.0F, false));
        this.head.cubeList.add(new ModelBox(head, 0, 14, 1.6F, 0.5F, -3.25F, 1, 2, 2, 0.0F, true));
        this.head.cubeList.add(new ModelBox(head, 5, 0, 1.7F, 1.0F, -2.75F, 1, 1, 1, 0.0F, true));

        this.cube_r1 = new AdvancedModelRendererExtended(this);
        this.cube_r1.setRotationPoint(0.0F, 3.0F, 0.0F);
        this.head.addChild(cube_r1);
        this.setRotateAngle(cube_r1, 0.2182F, 0.0F, 0.0F);
        this.cube_r1.cubeList.add(new ModelBox(cube_r1, 0, 0, -0.5F, -1.0F, -2.5F, 1, 1, 3, 0.0F, false));

        this.arm = new AdvancedModelRendererExtended(this);
        this.arm.setRotationPoint(-0.5F, 0.6F, -4.0F);
        this.head.addChild(arm);
        this.setRotateAngle(arm, -0.1745F, 0.0873F, 0.0F);
        this.arm.cubeList.add(new ModelBox(arm, 22, 8, -0.5F, -0.5F, -2.0F, 1, 1, 2, 0.0F, false));

        this.arms = new AdvancedModelRendererExtended(this);
        this.arms.setRotationPoint(0.0F, 0.0F, -2.0F);
        this.arm.addChild(arms);
        this.arms.cubeList.add(new ModelBox(arms, 1, 5, -0.5F, -0.5F, -1.975F, 1, 1, 2, -0.01F, false));

        this.arm5 = new AdvancedModelRendererExtended(this);
        this.arm5.setRotationPoint(-1.5F, 2.6F, -4.0F);
        this.head.addChild(arm5);
        this.setRotateAngle(arm5, 0.1745F, 0.1745F, 0.0F);
        this.arm5.cubeList.add(new ModelBox(arm5, 22, 8, -0.5F, -0.5F, -2.0F, 1, 1, 2, 0.0F, false));

        this.arms5 = new AdvancedModelRendererExtended(this);
        this.arms5.setRotationPoint(0.0F, 0.0F, -2.0F);
        this.arm5.addChild(arms5);
        this.arms5.cubeList.add(new ModelBox(arms5, 1, 5, -0.5F, -0.5F, -1.975F, 1, 1, 2, -0.01F, false));

        this.arm7 = new AdvancedModelRendererExtended(this);
        this.arm7.setRotationPoint(-0.5F, 2.6F, -4.0F);
        this.head.addChild(arm7);
        this.setRotateAngle(arm7, 0.2618F, 0.0873F, 0.0F);
        this.arm7.cubeList.add(new ModelBox(arm7, 22, 8, -0.5F, -0.5F, -2.0F, 1, 1, 2, 0.0F, false));

        this.arms7 = new AdvancedModelRendererExtended(this);
        this.arms7.setRotationPoint(0.0F, 0.0F, -2.0F);
        this.arm7.addChild(arms7);
        this.arms7.cubeList.add(new ModelBox(arms7, 1, 5, -0.5F, -0.5F, -1.975F, 1, 1, 2, -0.01F, false));

        this.arm8 = new AdvancedModelRendererExtended(this);
        this.arm8.setRotationPoint(0.5F, 2.6F, -4.0F);
        this.head.addChild(arm8);
        this.setRotateAngle(arm8, 0.2618F, -0.0873F, 0.0F);
        this.arm8.cubeList.add(new ModelBox(arm8, 22, 8, -0.5F, -0.5F, -2.0F, 1, 1, 2, 0.0F, true));

        this.arms8 = new AdvancedModelRendererExtended(this);
        this.arms8.setRotationPoint(0.0F, 0.0F, -2.0F);
        this.arm8.addChild(arms8);
        this.arms8.cubeList.add(new ModelBox(arms8, 1, 5, -0.5F, -0.5F, -1.975F, 1, 1, 2, -0.01F, true));

        this.arm6 = new AdvancedModelRendererExtended(this);
        this.arm6.setRotationPoint(1.5F, 2.6F, -4.0F);
        this.head.addChild(arm6);
        this.setRotateAngle(arm6, 0.1745F, -0.1745F, 0.0F);
        this.arm6.cubeList.add(new ModelBox(arm6, 22, 8, -0.5F, -0.5F, -2.0F, 1, 1, 2, 0.0F, true));

        this.arms6 = new AdvancedModelRendererExtended(this);
        this.arms6.setRotationPoint(0.0F, 0.0F, -2.0F);
        this.arm6.addChild(arms6);
        this.arms6.cubeList.add(new ModelBox(arms6, 1, 5, -0.5F, -0.5F, -1.975F, 1, 1, 2, -0.01F, true));

        this.arm3 = new AdvancedModelRendererExtended(this);
        this.arm3.setRotationPoint(-1.5F, 1.6F, -4.0F);
        this.head.addChild(arm3);
        this.setRotateAngle(arm3, 0.0F, 0.1745F, 0.0F);
        this.arm3.cubeList.add(new ModelBox(arm3, 22, 8, -0.5F, -0.5F, -2.0F, 1, 1, 2, 0.0F, false));

        this.arms3 = new AdvancedModelRendererExtended(this);
        this.arms3.setRotationPoint(0.0F, 0.0F, -2.0F);
        this.arm3.addChild(arms3);
        this.arms3.cubeList.add(new ModelBox(arms3, 1, 5, -0.5F, -0.5F, -1.975F, 1, 1, 2, -0.01F, false));

        this.arm4 = new AdvancedModelRendererExtended(this);
        this.arm4.setRotationPoint(1.5F, 1.6F, -4.0F);
        this.head.addChild(arm4);
        this.setRotateAngle(arm4, 0.0F, -0.1745F, 0.0F);
        this.arm4.cubeList.add(new ModelBox(arm4, 22, 8, -0.5F, -0.5F, -2.0F, 1, 1, 2, 0.0F, true));

        this.arms4 = new AdvancedModelRendererExtended(this);
        this.arms4.setRotationPoint(0.0F, 0.0F, -2.0F);
        this.arm4.addChild(arms4);
        this.arms4.cubeList.add(new ModelBox(arms4, 1, 5, -0.5F, -0.5F, -1.975F, 1, 1, 2, -0.01F, true));

        this.arm2 = new AdvancedModelRendererExtended(this);
        this.arm2.setRotationPoint(0.5F, 0.6F, -4.0F);
        this.head.addChild(arm2);
        this.setRotateAngle(arm2, -0.1745F, -0.0873F, 0.0F);
        this.arm2.cubeList.add(new ModelBox(arm2, 22, 8, -0.5F, -0.5F, -2.0F, 1, 1, 2, 0.0F, true));

        this.arms2 = new AdvancedModelRendererExtended(this);
        this.arms2.setRotationPoint(0.0F, 0.0F, -2.0F);
        this.arm2.addChild(arms2);
        this.arms2.cubeList.add(new ModelBox(arms2, 1, 5, -0.5F, -0.5F, -1.975F, 1, 1, 2, -0.01F, true));

        this.tentacle2 = new AdvancedModelRendererExtended(this);
        this.tentacle2.setRotationPoint(1.5F, 0.6F, -4.0F);
        this.head.addChild(tentacle2);
        this.setRotateAngle(tentacle2, -0.0873F, -0.3491F, 0.0F);
        this.tentacle2.cubeList.add(new ModelBox(tentacle2, 22, 8, -0.5F, -0.5F, -2.0F, 1, 1, 2, 0.0F, true));

        this.tentacles2 = new AdvancedModelRendererExtended(this);
        this.tentacles2.setRotationPoint(0.0F, 0.0F, -2.0F);
        this.tentacle2.addChild(tentacles2);
        this.tentacles2.cubeList.add(new ModelBox(tentacles2, 1, 5, -0.5F, -0.5F, -1.975F, 1, 1, 2, -0.01F, true));

        this.tentacle = new AdvancedModelRendererExtended(this);
        this.tentacle.setRotationPoint(-1.5F, 0.6F, -4.0F);
        this.head.addChild(tentacle);
        this.setRotateAngle(tentacle, -0.0873F, 0.3491F, 0.0F);
        this.tentacle.cubeList.add(new ModelBox(tentacle, 22, 8, -0.5F, -0.5F, -2.0F, 1, 1, 2, 0.0F, false));

        this.tentacles = new AdvancedModelRendererExtended(this);
        this.tentacles.setRotationPoint(0.0F, 0.0F, -2.0F);
        this.tentacle.addChild(tentacles);
        this.tentacles.cubeList.add(new ModelBox(tentacles, 1, 5, -0.5F, -0.5F, -1.975F, 1, 1, 2, -0.01F, false));

        updateDefaultPose();
    }

    @Override
    public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        this.body.render(f5 * 0.14F);
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
        this.body.offsetY = 1.15F;
        this.body.rotateAngleY = (float) Math.toRadians(180);
        //this.body.offsetZ = -1F;

        AdvancedModelRendererExtended[] topRightT = {this.arm, this.arms};
        AdvancedModelRendererExtended[] topLeftT = {this.arm2, this.arms2};
        AdvancedModelRendererExtended[] centerRightT = {this.arm3, this.arms3};
        AdvancedModelRendererExtended[] centerLeftT = {this.arm4, this.arms4};
        AdvancedModelRendererExtended[] bottomRightT = {this.arm5, this.arms5};
        AdvancedModelRendererExtended[] bottomLeftT = {this.arm6, this.arms6};
        AdvancedModelRendererExtended[] bottomMidRightT = {this.arm7, this.arms7};
        AdvancedModelRendererExtended[] bottomMidLeftT = {this.arm8, this.arms8};
        AdvancedModelRendererExtended[] longTentacleLeft = {this.tentacle, this.tentacles};
        AdvancedModelRendererExtended[] longTentacleRight = {this.tentacle2, this.tentacles2};
        AdvancedModelRendererExtended[] head = {this.body2, this.body3};

        float speed = 0.10F;
        if (!e.isInWater()) {
            speed = 0.5F;
        }

        this.chainWave(head, speed, 0.05F, 0, f2, 1F);

        //Left middle:
        this.chainSwing(centerLeftT, speed, -0.3F, -2, f2, 1F);
        //Left lower middle:
        this.chainWave(bottomLeftT, speed, 0.3F, -1.5, f2, 1F);
        this.chainSwing(bottomLeftT, speed, -0.3F, -1.5, f2, 1F);
        //Left lower bottom:
        this.chainWave(bottomMidLeftT, speed, 0.25F, -2, f2, 1F);
        this.chainSwing(bottomMidLeftT, speed, -0.1F, -1.5, f2, 1F);
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
        this.chainWave(bottomMidRightT, speed, 0.25F, -2, f2, 1F);
        this.chainSwing(bottomMidRightT, speed, 0.1F, -1.5, f2, 1F);
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
