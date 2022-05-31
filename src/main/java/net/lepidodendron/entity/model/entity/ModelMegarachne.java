package net.lepidodendron.entity.model.entity;

import net.ilexiconn.llibrary.client.model.tools.AdvancedModelBase;
import net.ilexiconn.llibrary.client.model.tools.AdvancedModelRenderer;
import net.minecraft.block.material.Material;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.entity.Entity;
import net.minecraft.util.math.BlockPos;

public class ModelMegarachne extends AdvancedModelBase {
    private final AdvancedModelRenderer body;
    private final AdvancedModelRenderer segments;
    private final AdvancedModelRenderer body2;
    private final AdvancedModelRenderer body3;
    private final AdvancedModelRenderer body4;
    private final AdvancedModelRenderer body5;
    private final AdvancedModelRenderer leg1L;
    private final AdvancedModelRenderer leg1L2;
    private final AdvancedModelRenderer leg1L3;
    private final AdvancedModelRenderer leg2L;
    private final AdvancedModelRenderer leg2L2;
    private final AdvancedModelRenderer leg2L3;
    private final AdvancedModelRenderer leg3L;
    private final AdvancedModelRenderer leg3L2;
    private final AdvancedModelRenderer leg3L3;
    private final AdvancedModelRenderer leg4L;
    private final AdvancedModelRenderer leg4L2;
    private final AdvancedModelRenderer leg4L3;
    private final AdvancedModelRenderer leg1R;
    private final AdvancedModelRenderer leg1R2;
    private final AdvancedModelRenderer leg1R3;
    private final AdvancedModelRenderer leg2R;
    private final AdvancedModelRenderer leg2R2;
    private final AdvancedModelRenderer leg2R3;
    private final AdvancedModelRenderer leg3R;
    private final AdvancedModelRenderer leg3R2;
    private final AdvancedModelRenderer leg3R3;
    private final AdvancedModelRenderer leg4R;
    private final AdvancedModelRenderer leg4R2;
    private final AdvancedModelRenderer leg4R3;

    public ModelMegarachne() {
        this.textureWidth = 64;
        this.textureHeight = 64;

        this.body = new AdvancedModelRenderer(this);
        this.body.setRotationPoint(0.0F, 21.0F, -3.0F);
        this.body.cubeList.add(new ModelBox(body, 20, 28, -2.5F, 0.0F, -4.0F, 5, 1, 4, 0.0F, false));
        this.body.cubeList.add(new ModelBox(body, 23, 28, -1.5F, -0.5F, -2.0F, 3, 1, 2, 0.0F, false));

        this.segments = new AdvancedModelRenderer(this);
        this.segments.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.body.addChild(segments);
        this.segments.cubeList.add(new ModelBox(segments, 0, 24, -3.0F, -1.0F, 0.0F, 6, 2, 6, 0.0F, false));
        this.segments.cubeList.add(new ModelBox(segments, 28, 0, -2.0F, -1.3F, 4.0F, 4, 1, 4, 0.0F, false));

        this.body2 = new AdvancedModelRenderer(this);
        this.body2.setRotationPoint(0.0F, 0.0F, 6.0F);
        this.segments.addChild(body2);
        this.body2.cubeList.add(new ModelBox(body2, 28, 5, -2.5F, -1.0F, 0.0F, 5, 2, 2, 0.0F, false));

        this.body3 = new AdvancedModelRenderer(this);
        this.body3.setRotationPoint(0.0F, 0.0F, 2.0F);
        this.body2.addChild(body3);
        this.setRotateAngle(body3, -0.1309F, 0.0F, 0.0F);
        this.body3.cubeList.add(new ModelBox(body3, 28, 13, -2.0F, -1.0F, 0.0F, 4, 2, 2, 0.0F, false));

        this.body4 = new AdvancedModelRenderer(this);
        this.body4.setRotationPoint(0.0F, 0.0F, 2.0F);
        this.body3.addChild(body4);
        this.body4.cubeList.add(new ModelBox(body4, 19, 25, -1.5F, 0.0F, 0.0F, 3, 1, 1, 0.0F, false));

        this.body5 = new AdvancedModelRenderer(this);
        this.body5.setRotationPoint(0.0F, 0.0F, 1.0F);
        this.body4.addChild(body5);
        this.body5.cubeList.add(new ModelBox(body5, 28, 9, -1.5F, 0.0F, 0.0F, 3, 1, 3, 0.0F, false));
        this.body5.cubeList.add(new ModelBox(body5, 0, 0, -0.5F, 0.0F, 3.0F, 1, 1, 1, 0.0F, false));

        this.leg1L = new AdvancedModelRenderer(this);
        this.leg1L.setRotationPoint(1.0F, 1.0F, -4.0F);
        this.body.addChild(leg1L);
        this.setRotateAngle(leg1L, 0.0F, 0.8727F, 0.0436F);
        this.leg1L.cubeList.add(new ModelBox(leg1L, 1, 5, 0.0F, 0.01F, 0.0F, 3, 0, 1, 0.0F, false));

        this.leg1L2 = new AdvancedModelRenderer(this);
        this.leg1L2.setRotationPoint(3.0F, 0.0F, 0.0F);
        this.leg1L.addChild(leg1L2);
        this.setRotateAngle(leg1L2, 0.0F, -0.3491F, 0.0F);
        this.leg1L2.cubeList.add(new ModelBox(leg1L2, 6, 5, 0.0F, 0.02F, 0.0F, 3, 0, 1, 0.0F, false));

        this.leg1L3 = new AdvancedModelRenderer(this);
        this.leg1L3.setRotationPoint(3.0F, 0.0F, 0.0F);
        this.leg1L2.addChild(leg1L3);
        this.setRotateAngle(leg1L3, 0.0F, -0.3491F, 0.0F);
        this.leg1L3.cubeList.add(new ModelBox(leg1L3, 1, 2, 0.0F, 0.03F, 0.0F, 4, 0, 2, 0.0F, false));

        this.leg2L = new AdvancedModelRenderer(this);
        this.leg2L.setRotationPoint(2.0F, 1.0F, -3.0F);
        this.body.addChild(leg2L);
        this.setRotateAngle(leg2L, 0.0F, 0.3491F, 0.2618F);
        this.leg2L.cubeList.add(new ModelBox(leg2L, 1, 5, 0.0F, 0.01F, 0.0F, 3, 0, 1, 0.0F, false));

        this.leg2L2 = new AdvancedModelRenderer(this);
        this.leg2L2.setRotationPoint(3.0F, 0.0F, 0.0F);
        this.leg2L.addChild(leg2L2);
        this.setRotateAngle(leg2L2, 0.0F, -0.3491F, 0.0F);
        this.leg2L2.cubeList.add(new ModelBox(leg2L2, 6, 5, 0.0F, 0.02F, 0.0F, 3, 0, 1, 0.0F, false));

        this.leg2L3 = new AdvancedModelRenderer(this);
        this.leg2L3.setRotationPoint(3.0F, 0.0F, 0.0F);
        this.leg2L2.addChild(leg2L3);
        this.setRotateAngle(leg2L3, 0.0F, -0.3491F, 0.0F);
        this.leg2L3.cubeList.add(new ModelBox(leg2L3, 1, 2, 0.0F, 0.03F, 0.0F, 4, 0, 2, 0.0F, false));

        this.leg3L = new AdvancedModelRenderer(this);
        this.leg3L.setRotationPoint(2.0F, 1.0F, -2.0F);
        this.body.addChild(leg3L);
        this.setRotateAngle(leg3L, 0.0F, -0.1745F, 0.2618F);
        this.leg3L.cubeList.add(new ModelBox(leg3L, 1, 5, 0.0F, 0.01F, 0.0F, 3, 0, 1, 0.0F, false));

        this.leg3L2 = new AdvancedModelRenderer(this);
        this.leg3L2.setRotationPoint(3.0F, 0.0F, 0.0F);
        this.leg3L.addChild(leg3L2);
        this.setRotateAngle(leg3L2, 0.0F, -0.3491F, 0.0F);
        this.leg3L2.cubeList.add(new ModelBox(leg3L2, 6, 5, -0.0436F, 0.02F, 0.001F, 3, 0, 1, 0.0F, false));

        this.leg3L3 = new AdvancedModelRenderer(this);
        this.leg3L3.setRotationPoint(3.0F, 0.0F, 0.0F);
        this.leg3L2.addChild(leg3L3);
        this.setRotateAngle(leg3L3, 0.0F, -0.3491F, 0.0F);
        this.leg3L3.cubeList.add(new ModelBox(leg3L3, 0, 6, -0.0436F, 0.03F, 0.001F, 4, 0, 2, 0.0F, false));

        this.leg4L = new AdvancedModelRenderer(this);
        this.leg4L.setRotationPoint(2.0F, 1.0F, -1.0F);
        this.body.addChild(leg4L);
        this.setRotateAngle(leg4L, 0.0F, -0.5236F, 0.2618F);
        this.leg4L.cubeList.add(new ModelBox(leg4L, 1, 5, 0.0F, 0.01F, 0.0F, 3, 0, 1, 0.0F, false));

        this.leg4L2 = new AdvancedModelRenderer(this);
        this.leg4L2.setRotationPoint(3.0F, 0.0F, 0.0F);
        this.leg4L.addChild(leg4L2);
        this.setRotateAngle(leg4L2, 0.0F, -0.3491F, 0.0F);
        this.leg4L2.cubeList.add(new ModelBox(leg4L2, 6, 5, -0.0436F, 0.02F, 0.001F, 3, 0, 1, 0.0F, false));

        this.leg4L3 = new AdvancedModelRenderer(this);
        this.leg4L3.setRotationPoint(3.0F, 0.0F, 0.0F);
        this.leg4L2.addChild(leg4L3);
        this.setRotateAngle(leg4L3, 0.0F, -0.3491F, 0.0F);
        this.leg4L3.cubeList.add(new ModelBox(leg4L3, 0, 6, -0.0436F, 0.03F, 0.001F, 4, 0, 2, 0.0F, false));

        this.leg1R = new AdvancedModelRenderer(this);
        this.leg1R.setRotationPoint(-1.0F, 1.0F, -4.0F);
        this.body.addChild(leg1R);
        this.setRotateAngle(leg1R, 0.0F, -0.8727F, -0.0436F);
        this.leg1R.cubeList.add(new ModelBox(leg1R, 1, 5, -3.0F, 0.01F, 0.0F, 3, 0, 1, 0.0F, true));

        this.leg1R2 = new AdvancedModelRenderer(this);
        this.leg1R2.setRotationPoint(-3.0F, 0.0F, 0.0F);
        this.leg1R.addChild(leg1R2);
        this.setRotateAngle(leg1R2, 0.0F, 0.3491F, 0.0F);
        this.leg1R2.cubeList.add(new ModelBox(leg1R2, 6, 5, -3.0F, 0.02F, 0.0F, 3, 0, 1, 0.0F, true));

        this.leg1R3 = new AdvancedModelRenderer(this);
        this.leg1R3.setRotationPoint(-3.0F, 0.0F, 0.0F);
        this.leg1R2.addChild(leg1R3);
        this.setRotateAngle(leg1R3, 0.0F, 0.3491F, 0.0F);
        this.leg1R3.cubeList.add(new ModelBox(leg1R3, 1, 2, -4.0F, 0.03F, 0.0F, 4, 0, 2, 0.0F, true));

        this.leg2R = new AdvancedModelRenderer(this);
        this.leg2R.setRotationPoint(-2.0F, 1.0F, -3.0F);
        this.body.addChild(leg2R);
        this.setRotateAngle(leg2R, 0.0F, -0.3491F, -0.2618F);
        this.leg2R.cubeList.add(new ModelBox(leg2R, 1, 5, -3.0F, 0.01F, 0.0F, 3, 0, 1, 0.0F, true));

        this.leg2R2 = new AdvancedModelRenderer(this);
        this.leg2R2.setRotationPoint(-3.0F, 0.0F, 0.0F);
        this.leg2R.addChild(leg2R2);
        this.setRotateAngle(leg2R2, 0.0F, 0.3491F, 0.0F);
        this.leg2R2.cubeList.add(new ModelBox(leg2R2, 6, 5, -3.0F, 0.02F, 0.0F, 3, 0, 1, 0.0F, true));

        this.leg2R3 = new AdvancedModelRenderer(this);
        this.leg2R3.setRotationPoint(-3.0F, 0.0F, 0.0F);
        this.leg2R2.addChild(leg2R3);
        this.setRotateAngle(leg2R3, 0.0F, 0.3491F, 0.0F);
        this.leg2R3.cubeList.add(new ModelBox(leg2R3, 1, 2, -4.0F, 0.03F, 0.0F, 4, 0, 2, 0.0F, true));

        this.leg3R = new AdvancedModelRenderer(this);
        this.leg3R.setRotationPoint(-2.0F, 1.0F, -2.0F);
        this.body.addChild(leg3R);
        this.setRotateAngle(leg3R, 0.0F, 0.1745F, -0.2618F);
        this.leg3R.cubeList.add(new ModelBox(leg3R, 1, 5, -3.0F, 0.01F, 0.0F, 3, 0, 1, 0.0F, true));

        this.leg3R2 = new AdvancedModelRenderer(this);
        this.leg3R2.setRotationPoint(-3.0F, 0.0F, 0.0F);
        this.leg3R.addChild(leg3R2);
        this.setRotateAngle(leg3R2, 0.0F, 0.3491F, 0.0F);
        this.leg3R2.cubeList.add(new ModelBox(leg3R2, 6, 5, -2.9564F, 0.02F, 0.001F, 3, 0, 1, 0.0F, true));

        this.leg3R3 = new AdvancedModelRenderer(this);
        this.leg3R3.setRotationPoint(-3.0F, 0.0F, 0.0F);
        this.leg3R2.addChild(leg3R3);
        this.setRotateAngle(leg3R3, 0.0F, 0.3491F, 0.0F);
        this.leg3R3.cubeList.add(new ModelBox(leg3R3, 0, 6, -3.9564F, 0.03F, 0.001F, 4, 0, 2, 0.0F, true));

        this.leg4R = new AdvancedModelRenderer(this);
        this.leg4R.setRotationPoint(-2.0F, 1.0F, -1.0F);
        this.body.addChild(leg4R);
        this.setRotateAngle(leg4R, 0.0F, 0.5236F, -0.2618F);
        this.leg4R.cubeList.add(new ModelBox(leg4R, 1, 5, -3.0F, 0.01F, 0.0F, 3, 0, 1, 0.0F, true));

        this.leg4R2 = new AdvancedModelRenderer(this);
        this.leg4R2.setRotationPoint(-3.0F, 0.0F, 0.0F);
        this.leg4R.addChild(leg4R2);
        this.setRotateAngle(leg4R2, 0.0F, 0.3491F, 0.0F);
        this.leg4R2.cubeList.add(new ModelBox(leg4R2, 6, 5, -2.9564F, 0.02F, 0.001F, 3, 0, 1, 0.0F, true));

        this.leg4R3 = new AdvancedModelRenderer(this);
        this.leg4R3.setRotationPoint(-3.0F, 0.0F, 0.0F);
        this.leg4R2.addChild(leg4R3);
        this.setRotateAngle(leg4R3, 0.0F, 0.3491F, 0.0F);
        this.leg4R3.cubeList.add(new ModelBox(leg4R3, 0, 6, -3.9564F, 0.03F, 0.001F, 4, 0, 2, 0.0F, true));

        updateDefaultPose();
    }

    @Override
    public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        //animate((IAnimatedEntity) entity, f, f1, f2, f3, f4, f5);
        this.body.render(f5 * 0.55F);
    }
    public void renderStatic(float f) {
        GlStateManager.pushMatrix();
        GlStateManager.enableBlend();
        GlStateManager.blendFunc(GlStateManager.SourceFactor.SRC_ALPHA, GlStateManager.DestFactor.ONE_MINUS_SRC_ALPHA);
        this.body.render(0.01F);
        GlStateManager.disableBlend();
        GlStateManager.popMatrix();
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
        this.body.offsetY = 0.69F;

        AdvancedModelRenderer[] Leg1L = {this.leg1L, this.leg1L2, this.leg1L3};
        AdvancedModelRenderer[] Leg1R = {this.leg1R, this.leg1R2, this.leg1R3};
        AdvancedModelRenderer[] Leg2L = {this.leg2L, this.leg2L2, this.leg2L3};
        AdvancedModelRenderer[] Leg2R = {this.leg2R, this.leg2R2, this.leg2R3};
        AdvancedModelRenderer[] Leg3L = {this.leg3L, this.leg3L2, this.leg3L3};
        AdvancedModelRenderer[] Leg3R = {this.leg3R, this.leg3R2, this.leg3R3};
        AdvancedModelRenderer[] Leg4L = {this.leg4L, this.leg4L2, this.leg4L3};
        AdvancedModelRenderer[] Leg4R = {this.leg4R, this.leg4R2, this.leg4R3};
        AdvancedModelRenderer[] Tail = {this.body3, this.body4, this.body5};

        boolean isAtBottom = false;

        if (e.getPosition().getY() - 1 > 1) {
            BlockPos pos = new BlockPos(e.getPosition().getX(), e.getPosition().getY() - 1, e.getPosition().getZ());
            isAtBottom = ((e.isInsideOfMaterial(Material.WATER) || e.isInsideOfMaterial(Material.CORAL))
                    && ((e.world.getBlockState(pos)).getMaterial() != Material.WATER)
                    && ((double)e.getPosition().getY() + 0.334D) > e.posY);
        }

        float speed = 0.35F;
        if (!e.isInWater()) {
            speed = 0.7F;
        }
        if (isAtBottom) {
            speed = 0.5F;
        }

        if (f3 == 0.0F) {
            this.chainSwing(Leg1L, speed * 0.7F, 0.3F, 0, f2, 0.3F);
            this.chainSwing(Leg2L, speed * 0.7F, 0.3F, 0, f2, 0.3F);
            this.chainSwing(Leg3L, speed * 0.7F, 0.3F, 0, f2, 0.3F);
            this.chainSwing(Leg4L, speed * 0.7F, 0.3F, 0, f2, 0.3F);

            this.chainSwing(Leg1R, speed * 0.7F, -0.3F, 0, f2, 0.3F);
            this.chainSwing(Leg2R, speed * 0.7F, -0.3F, 0, f2, 0.3F);
            this.chainSwing(Leg3R, speed * 0.7F, -0.3F, 0, f2, 0.3F);
            this.chainSwing(Leg4R, speed * 0.7F, -0.3F, 0, f2, 0.3F);
        } else {
            this.chainSwing(Leg1L, speed, 0.3F, 0, f2, 1);
            this.chainSwing(Leg2L, speed, 0.3F, 0, f2, 1);
            this.chainSwing(Leg3L, speed, 0.3F, 0, f2, 1);
            this.chainSwing(Leg4L, speed, 0.3F, 0, f2, 1);

            this.chainSwing(Leg1R, speed, -0.3F, 0, f2, 1);
            this.chainSwing(Leg2R, speed, -0.3F, 0, f2, 1);
            this.chainSwing(Leg3R, speed, -0.3F, 0, f2, 1);
            this.chainSwing(Leg4R, speed, -0.3F, 0, f2, 1);

            this.chainSwing(Tail, speed, -0.1F, 0, f2, 0.4F);
            if (!isAtBottom) {
                this.chainWave(Tail, speed, -0.3F, 1, f2, 0.5F);
            }
        }

        if (!isAtBottom) {
            this.bob(body, -speed * 0.5F, 2.5F, false, f2, 2);
        }
        if (!e.isInWater()) {
            this.bob(body, -speed * 2F, 1F, false, f2, 1);
            this.chainSwing(Tail, speed * 1.5F, -0.2F, 0, f2, 0.5F);
            this.chainWave(Tail, speed * 1.5F, -0.2F, 0, f2, 0.3F);
        }
    }

}
