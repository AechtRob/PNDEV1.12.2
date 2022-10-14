package net.lepidodendron.entity.model.entity;

import net.ilexiconn.llibrary.client.model.tools.AdvancedModelBase;
import net.ilexiconn.llibrary.client.model.tools.AdvancedModelRenderer;
import net.minecraft.block.material.Material;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.entity.Entity;
import net.minecraft.util.math.BlockPos;

public class ModelAdelophthalmus extends AdvancedModelBase {
    private final AdvancedModelRenderer carapace;
    private final AdvancedModelRenderer legL5;
    private final AdvancedModelRenderer legsegL5;
    private final AdvancedModelRenderer legR5;
    private final AdvancedModelRenderer legsegR5;
    private final AdvancedModelRenderer legL1;
    private final AdvancedModelRenderer legR1;
    private final AdvancedModelRenderer legL2;
    private final AdvancedModelRenderer legR2;
    private final AdvancedModelRenderer legL3;
    private final AdvancedModelRenderer legR3;
    private final AdvancedModelRenderer legL4;
    private final AdvancedModelRenderer legR4;
    private final AdvancedModelRenderer segment;
    private final AdvancedModelRenderer segment2;
    private final AdvancedModelRenderer segment3;
    private final AdvancedModelRenderer segment4;
    private final AdvancedModelRenderer segment5;
    private final AdvancedModelRenderer segment6;

    public ModelAdelophthalmus() {
        this.textureWidth = 32;
        this.textureHeight = 32;

        this.carapace = new AdvancedModelRenderer(this);
        this.carapace.setRotationPoint(0.0F, 22.5F, 0.0F);
        this.carapace.cubeList.add(new ModelBox(carapace, 0, 14, -3.5F, -2.0F, -8.0F, 7, 2, 5, 0.0F, false));

        this.legL5 = new AdvancedModelRenderer(this);
        this.legL5.setRotationPoint(3.0F, 0.0F, -3.5F);
        this.carapace.addChild(legL5);
        this.setRotateAngle(legL5, 0.0F, -0.5672F, 0.2618F);
        this.legL5.cubeList.add(new ModelBox(legL5, 19, 17, 0.0F, -0.49F, -0.5F, 3, 1, 1, 0.0F, false));

        this.legsegL5 = new AdvancedModelRenderer(this);
        this.legsegL5.setRotationPoint(3.0F, 0.0F, 0.0F);
        this.legL5.addChild(legsegL5);
        this.setRotateAngle(legsegL5, 0.0F, 0.6109F, 0.0F);
        this.legsegL5.cubeList.add(new ModelBox(legsegL5, 0, 5, -1.0F, -0.49F, 0.0F, 2, 1, 4, 0.01F, false));

        this.legR5 = new AdvancedModelRenderer(this);
        this.legR5.setRotationPoint(-3.0F, 0.0F, -3.5F);
        this.carapace.addChild(legR5);
        this.setRotateAngle(legR5, 0.0F, 0.5672F, -0.2618F);
        this.legR5.cubeList.add(new ModelBox(legR5, 0, 12, -3.0F, -0.49F, -0.5F, 3, 1, 1, 0.0F, false));

        this.legsegR5 = new AdvancedModelRenderer(this);
        this.legsegR5.setRotationPoint(-3.0F, 0.0F, 0.0F);
        this.legR5.addChild(legsegR5);
        this.setRotateAngle(legsegR5, 0.0F, -0.6109F, 0.0F);
        this.legsegR5.cubeList.add(new ModelBox(legsegR5, 0, 0, -1.0F, -0.49F, 0.0F, 2, 1, 4, 0.01F, false));

        this.legL1 = new AdvancedModelRenderer(this);
        this.legL1.setRotationPoint(1.0F, 0.0F, -7.0F);
        this.carapace.addChild(legL1);
        this.setRotateAngle(legL1, 0.2182F, 0.7854F, 0.5236F);
        this.legL1.cubeList.add(new ModelBox(legL1, 7, 2, 0.0F, 0.01F, -0.5F, 2, 0, 1, 0.0F, false));

        this.legR1 = new AdvancedModelRenderer(this);
        this.legR1.setRotationPoint(-1.0F, 0.0F, -7.0F);
        this.carapace.addChild(legR1);
        this.setRotateAngle(legR1, 0.2182F, -0.7854F, -0.5236F);
        this.legR1.cubeList.add(new ModelBox(legR1, 7, 1, -2.0F, 0.01F, -0.5F, 2, 0, 1, 0.0F, false));

        this.legL2 = new AdvancedModelRenderer(this);
        this.legL2.setRotationPoint(2.25F, 0.0F, -6.5F);
        this.carapace.addChild(legL2);
        this.setRotateAngle(legL2, 0.1745F, 0.3491F, 0.4363F);
        this.legL2.cubeList.add(new ModelBox(legL2, 7, 3, 0.0F, 0.01F, -0.5F, 2, 0, 1, 0.0F, false));

        this.legR2 = new AdvancedModelRenderer(this);
        this.legR2.setRotationPoint(-2.25F, 0.0F, -6.5F);
        this.carapace.addChild(legR2);
        this.setRotateAngle(legR2, 0.1745F, -0.3491F, -0.4363F);
        this.legR2.cubeList.add(new ModelBox(legR2, 7, 0, -2.0F, 0.01F, -0.5F, 2, 0, 1, 0.0F, false));

        this.legL3 = new AdvancedModelRenderer(this);
        this.legL3.setRotationPoint(3.0F, 0.0F, -5.5F);
        this.carapace.addChild(legL3);
        this.setRotateAngle(legL3, 0.0F, 0.1745F, 0.3491F);
        this.legL3.cubeList.add(new ModelBox(legL3, 17, 22, 0.0F, 0.01F, -0.5F, 3, 0, 1, 0.0F, false));

        this.legR3 = new AdvancedModelRenderer(this);
        this.legR3.setRotationPoint(-3.0F, 0.0F, -5.5F);
        this.carapace.addChild(legR3);
        this.setRotateAngle(legR3, 0.0F, -0.1745F, -0.3491F);
        this.legR3.cubeList.add(new ModelBox(legR3, 17, 21, -3.0F, 0.01F, -0.5F, 3, 0, 1, 0.0F, false));

        this.legL4 = new AdvancedModelRenderer(this);
        this.legL4.setRotationPoint(3.0F, 0.0F, -4.5F);
        this.carapace.addChild(legL4);
        this.setRotateAngle(legL4, 0.0F, -0.2182F, 0.3054F);
        this.legL4.cubeList.add(new ModelBox(legL4, 0, 11, 0.0F, 0.01F, -0.5F, 4, 0, 1, 0.0F, false));

        this.legR4 = new AdvancedModelRenderer(this);
        this.legR4.setRotationPoint(-3.0F, 0.0F, -4.5F);
        this.carapace.addChild(legR4);
        this.setRotateAngle(legR4, 0.0F, 0.2182F, -0.3054F);
        this.legR4.cubeList.add(new ModelBox(legR4, 0, 10, -4.0F, 0.01F, -0.5F, 4, 0, 1, 0.0F, false));

        this.segment = new AdvancedModelRenderer(this);
        this.segment.setRotationPoint(0.0F, -1.5F, -3.0F);
        this.carapace.addChild(segment);
        this.segment.cubeList.add(new ModelBox(segment, 8, 6, -4.0F, -0.5F, 0.0F, 8, 2, 6, 0.0F, false));

        this.segment2 = new AdvancedModelRenderer(this);
        this.segment2.setRotationPoint(0.0F, 0.25F, 6.0F);
        this.segment.addChild(segment2);
        this.segment2.cubeList.add(new ModelBox(segment2, 14, 0, -3.0F, -0.425F, 0.0F, 6, 1, 2, 0.01F, false));
        this.segment2.cubeList.add(new ModelBox(segment2, 14, 3, -3.0F, 0.225F, 0.0F, 6, 1, 2, 0.0F, false));

        this.segment3 = new AdvancedModelRenderer(this);
        this.segment3.setRotationPoint(0.0F, 0.25F, 2.0F);
        this.segment2.addChild(segment3);
        this.setRotateAngle(segment3, -0.0436F, 0.0F, 0.0F);
        this.segment3.cubeList.add(new ModelBox(segment3, 10, 21, -1.5F, -0.25F, 0.0F, 3, 1, 2, 0.01F, false));

        this.segment4 = new AdvancedModelRenderer(this);
        this.segment4.setRotationPoint(0.0F, 0.0F, 2.0F);
        this.segment3.addChild(segment4);
        this.segment4.cubeList.add(new ModelBox(segment4, 0, 21, -1.5F, -0.25F, 0.0F, 3, 1, 2, 0.0F, false));

        this.segment5 = new AdvancedModelRenderer(this);
        this.segment5.setRotationPoint(0.0F, 0.0F, 2.0F);
        this.segment4.addChild(segment5);
        this.segment5.cubeList.add(new ModelBox(segment5, 19, 14, -1.5F, -0.25F, -0.025F, 3, 1, 2, -0.01F, false));

        this.segment6 = new AdvancedModelRenderer(this);
        this.segment6.setRotationPoint(0.0F, 0.0F, 2.0F);
        this.segment5.addChild(segment6);
        this.segment6.cubeList.add(new ModelBox(segment6, 19, 23, -1.0F, -0.25F, -0.05F, 2, 1, 1, 0.0F, false));
        this.segment6.cubeList.add(new ModelBox(segment6, 0, 0, -0.5F, 0.25F, 0.95F, 1, 0, 12, 0.0F, false));

        updateDefaultPose();
    }

    @Override
    public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        this.carapace.render(f5 * 0.3F);

    }

    public void renderStatic(float f) {
        //GlStateManager.pushMatrix();
        GlStateManager.enableBlend();
        GlStateManager.blendFunc(GlStateManager.SourceFactor.SRC_ALPHA, GlStateManager.DestFactor.ONE_MINUS_SRC_ALPHA);
        this.carapace.offsetZ = -0.13F;
        this.carapace.render(0.02F);
        GlStateManager.disableBlend();
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
        this.carapace.offsetY = 1.0F;

        AdvancedModelRenderer[] Leg1L = {this.legL1};
        AdvancedModelRenderer[] Leg1R = {this.legR1};
        AdvancedModelRenderer[] Leg2L = {this.legL2};
        AdvancedModelRenderer[] Leg2R = {this.legR2};
        AdvancedModelRenderer[] Leg3L = {this.legL3};
        AdvancedModelRenderer[] Leg3R = {this.legR3};
        AdvancedModelRenderer[] Leg4L = {this.legL4};
        AdvancedModelRenderer[] Leg4R = {this.legR4};
        AdvancedModelRenderer[] Leg5L = {this.legL5, this.legsegL5};
        AdvancedModelRenderer[] Leg5R = {this.legR5, this.legsegR5};
        AdvancedModelRenderer[] Tail = {this.segment, this.segment2, this.segment3, this.segment4, this.segment5, this.segment6};

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
            this.chainSwing(Leg1R, speed * 0.7F, -0.3F, 0, f2, 0.3F);
            this.chainSwing(Tail, speed * 0.7F, -0.05F, 0, f2, 0.4F);
        } else {
            this.chainSwing(Leg1L, speed, 0.3F, 0, f2, 1);
            this.chainSwing(Leg2L, speed, 0.3F, 0, f2, 1);
            this.chainSwing(Leg3L, speed, 0.3F, 0, f2, 1);
            this.chainSwing(Leg4L, speed, 0.3F, 0, f2, 1);
            this.chainSwing(Leg5L, speed, 0.3F, 0, f2, 1);
            this.chainFlap(Leg5L, speed, 0.15F, 0, f2, 1);

            this.chainSwing(Leg1R, speed, -0.3F, 0, f2, 1);
            this.chainSwing(Leg2R, speed, -0.3F, 0, f2, 1);
            this.chainSwing(Leg3R, speed, -0.3F, 0, f2, 1);
            this.chainSwing(Leg4R, speed, -0.3F, 0, f2, 1);
            this.chainSwing(Leg5R, speed, -0.3F, 0, f2, 1);
            this.chainFlap(Leg5R, speed, 0.15F, 0, f2, 1);

            this.chainSwing(Tail, speed, -0.1F, 0, f2, 0.4F);
            if (!isAtBottom) {
                this.chainWave(Tail, speed, -0.15F, 1, f2, 0.5F);
            }
        }

        if (!isAtBottom) {
            this.bob(carapace, -speed * 0.5F, 2.5F, false, f2, 2);
        }
        if (!e.isInWater()) {
            this.bob(carapace, -speed * 2F, 1F, false, f2, 1);
            this.chainSwing(Tail, speed * 1.5F, -0.2F, 0, f2, 0.5F);
            this.chainWave(Tail, speed * 1.5F, -0.2F, 0, f2, 0.3F);
        }
    }

}
