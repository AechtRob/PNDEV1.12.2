package net.lepidodendron.entity.model.entity;

import net.ilexiconn.llibrary.client.model.tools.AdvancedModelRenderer;
import net.lepidodendron.entity.EntityPrehistoricFloraAlacaris;
import net.lepidodendron.entity.model.ModelBasePalaeopedia;
import net.minecraft.block.material.Material;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;
import net.minecraft.util.math.BlockPos;

public class ModelAlacaris extends ModelBasePalaeopedia {
    private final AdvancedModelRenderer head;
    private final AdvancedModelRenderer legR;
    private final AdvancedModelRenderer legR2;
    private final AdvancedModelRenderer legR3;
    private final AdvancedModelRenderer legR4;
    private final AdvancedModelRenderer legL;
    private final AdvancedModelRenderer legL2;
    private final AdvancedModelRenderer legL3;
    private final AdvancedModelRenderer legL4;
    private final AdvancedModelRenderer antennaL;
    private final AdvancedModelRenderer antennaR;
    private final AdvancedModelRenderer body;
    private final AdvancedModelRenderer legR5;
    private final AdvancedModelRenderer legR6;
    private final AdvancedModelRenderer legL5;
    private final AdvancedModelRenderer legL6;
    private final AdvancedModelRenderer body2;
    private final AdvancedModelRenderer legL7;
    private final AdvancedModelRenderer legL8;
    private final AdvancedModelRenderer legL9;
    private final AdvancedModelRenderer legR7;
    private final AdvancedModelRenderer legR8;
    private final AdvancedModelRenderer legR9;
    private final AdvancedModelRenderer body3;
    private final AdvancedModelRenderer legL10;
    private final AdvancedModelRenderer legL11;
    private final AdvancedModelRenderer legL12;
    private final AdvancedModelRenderer legR10;
    private final AdvancedModelRenderer legR11;
    private final AdvancedModelRenderer legR12;
    private final AdvancedModelRenderer body4;
    private final AdvancedModelRenderer legL13;
    private final AdvancedModelRenderer legL14;
    private final AdvancedModelRenderer legL15;
    private final AdvancedModelRenderer legR13;
    private final AdvancedModelRenderer legR14;
    private final AdvancedModelRenderer legR15;
    private final AdvancedModelRenderer body5;
    private final AdvancedModelRenderer legL16;
    private final AdvancedModelRenderer legR16;
    private final AdvancedModelRenderer body6;
    private final AdvancedModelRenderer body7;
    private final AdvancedModelRenderer tail;

    public ModelAlacaris() {
        this.textureWidth = 32;
        this.textureHeight = 32;

        this.head = new AdvancedModelRenderer(this);
        this.head.setRotationPoint(0.0F, 22.5F, 0.0F);
        this.head.cubeList.add(new ModelBox(head, 0, 0, -2.5F, -2.0F, -8.0F, 5, 2, 3, 0.0F, false));
        this.head.cubeList.add(new ModelBox(head, 13, 18, 0.25F, -1.75F, -8.75F, 1, 1, 1, 0.0F, false));
        this.head.cubeList.add(new ModelBox(head, 9, 18, -1.25F, -1.75F, -8.75F, 1, 1, 1, 0.0F, false));

        this.legR = new AdvancedModelRenderer(this);
        this.legR.setRotationPoint(-0.25F, 0.0F, -7.5F);
        this.head.addChild(legR);
        this.setRotateAngle(legR, 0.0F, 0.0F, 0.8727F);
        this.legR.cubeList.add(new ModelBox(legR, 0, 0, -1.0F, -0.5F, 0.0F, 1, 3, 0, 0.0F, false));

        this.legR2 = new AdvancedModelRenderer(this);
        this.legR2.setRotationPoint(-0.25F, 0.0F, -7.0F);
        this.head.addChild(legR2);
        this.setRotateAngle(legR2, 0.0F, 0.0F, 0.8727F);
        this.legR2.cubeList.add(new ModelBox(legR2, 0, 0, -1.0F, -0.5F, 0.0F, 1, 3, 0, 0.0F, false));

        this.legR3 = new AdvancedModelRenderer(this);
        this.legR3.setRotationPoint(-0.25F, 0.0F, -6.5F);
        this.head.addChild(legR3);
        this.setRotateAngle(legR3, 0.0F, 0.0F, 0.8727F);
        this.legR3.cubeList.add(new ModelBox(legR3, 0, 0, -1.0F, -0.5F, 0.0F, 1, 3, 0, 0.0F, false));

        this.legR4 = new AdvancedModelRenderer(this);
        this.legR4.setRotationPoint(-0.25F, 0.0F, -5.9F);
        this.head.addChild(legR4);
        this.setRotateAngle(legR4, 0.0F, 0.0F, 0.8727F);
        this.legR4.cubeList.add(new ModelBox(legR4, 0, 0, -1.0F, -0.5F, 0.0F, 1, 3, 0, 0.0F, false));

        this.legL = new AdvancedModelRenderer(this);
        this.legL.setRotationPoint(0.25F, 0.0F, -7.5F);
        this.head.addChild(legL);
        this.setRotateAngle(legL, 0.0F, 0.0F, -0.8727F);
        this.legL.cubeList.add(new ModelBox(legL, 0, 19, 0.0F, -0.5F, 0.0F, 1, 3, 0, 0.0F, false));

        this.legL2 = new AdvancedModelRenderer(this);
        this.legL2.setRotationPoint(0.25F, 0.0F, -7.0F);
        this.head.addChild(legL2);
        this.setRotateAngle(legL2, 0.0F, 0.0F, -0.8727F);
        this.legL2.cubeList.add(new ModelBox(legL2, 0, 19, 0.0F, -0.5F, 0.0F, 1, 3, 0, 0.0F, false));

        this.legL3 = new AdvancedModelRenderer(this);
        this.legL3.setRotationPoint(0.25F, 0.0F, -6.5F);
        this.head.addChild(legL3);
        this.setRotateAngle(legL3, 0.0F, 0.0F, -0.8727F);
        this.legL3.cubeList.add(new ModelBox(legL3, 0, 19, 0.0F, -0.5F, 0.0F, 1, 3, 0, 0.0F, false));

        this.legL4 = new AdvancedModelRenderer(this);
        this.legL4.setRotationPoint(0.25F, 0.0F, -5.9F);
        this.head.addChild(legL4);
        this.setRotateAngle(legL4, 0.0F, 0.0F, -0.8727F);
        this.legL4.cubeList.add(new ModelBox(legL4, 0, 19, 0.0F, -0.5F, 0.0F, 1, 3, 0, 0.0F, false));

        this.antennaL = new AdvancedModelRenderer(this);
        this.antennaL.setRotationPoint(1.0F, -1.0F, -8.0F);
        this.head.addChild(antennaL);
        this.setRotateAngle(antennaL, 0.0F, -0.2618F, 0.0F);
        this.antennaL.cubeList.add(new ModelBox(antennaL, 8, 5, 0.0F, 0.0F, -2.0F, 2, 0, 2, 0.0F, false));

        this.antennaR = new AdvancedModelRenderer(this);
        this.antennaR.setRotationPoint(-1.0F, -1.0F, -8.0F);
        this.head.addChild(antennaR);
        this.setRotateAngle(antennaR, 0.0F, 0.2618F, 0.0F);
        this.antennaR.cubeList.add(new ModelBox(antennaR, 17, 0, -2.0F, 0.0F, -2.0F, 2, 0, 2, 0.0F, false));

        this.body = new AdvancedModelRenderer(this);
        this.body.setRotationPoint(0.0F, -1.0F, -6.1F);
        this.head.addChild(body);
        this.body.cubeList.add(new ModelBox(body, 10, 7, -2.0F, -0.9F, 0.0F, 4, 2, 2, 0.0F, false));

        this.legR5 = new AdvancedModelRenderer(this);
        this.legR5.setRotationPoint(-0.25F, 1.0F, 0.85F);
        this.body.addChild(legR5);
        this.setRotateAngle(legR5, 0.0F, 0.0F, 0.8727F);
        this.legR5.cubeList.add(new ModelBox(legR5, 0, 0, -1.0F, -0.5F, 0.0F, 1, 3, 0, 0.0F, false));

        this.legR6 = new AdvancedModelRenderer(this);
        this.legR6.setRotationPoint(-0.25F, 1.0F, 1.5F);
        this.body.addChild(legR6);
        this.setRotateAngle(legR6, 0.0F, 0.0F, 0.8727F);
        this.legR6.cubeList.add(new ModelBox(legR6, 0, 0, -1.0F, -0.5F, 0.0F, 1, 3, 0, 0.0F, false));

        this.legL5 = new AdvancedModelRenderer(this);
        this.legL5.setRotationPoint(0.25F, 1.0F, 0.85F);
        this.body.addChild(legL5);
        this.setRotateAngle(legL5, 0.0F, 0.0F, -0.8727F);
        this.legL5.cubeList.add(new ModelBox(legL5, 0, 19, 0.0F, -0.5F, 0.0F, 1, 3, 0, 0.0F, false));

        this.legL6 = new AdvancedModelRenderer(this);
        this.legL6.setRotationPoint(0.25F, 1.0F, 1.5F);
        this.body.addChild(legL6);
        this.setRotateAngle(legL6, 0.0F, 0.0F, -0.8727F);
        this.legL6.cubeList.add(new ModelBox(legL6, 0, 19, 0.0F, -0.5F, 0.0F, 1, 3, 0, 0.0F, false));

        this.body2 = new AdvancedModelRenderer(this);
        this.body2.setRotationPoint(0.0F, 0.0F, 2.0F);
        this.body.addChild(body2);
        this.body2.cubeList.add(new ModelBox(body2, 0, 9, -1.99F, -0.89F, 0.0F, 4, 2, 2, 0.0F, false));

        this.legL7 = new AdvancedModelRenderer(this);
        this.legL7.setRotationPoint(0.25F, 1.0F, 0.1F);
        this.body2.addChild(legL7);
        this.setRotateAngle(legL7, 0.0F, 0.0F, -0.8727F);
        this.legL7.cubeList.add(new ModelBox(legL7, 0, 19, 0.0F, -0.5F, 0.0F, 1, 3, 0, 0.0F, false));

        this.legL8 = new AdvancedModelRenderer(this);
        this.legL8.setRotationPoint(0.25F, 1.0F, 0.8F);
        this.body2.addChild(legL8);
        this.setRotateAngle(legL8, 0.0F, 0.0F, -0.8727F);
        this.legL8.cubeList.add(new ModelBox(legL8, 0, 19, 0.0F, -0.5F, 0.0F, 1, 3, 0, 0.0F, false));

        this.legL9 = new AdvancedModelRenderer(this);
        this.legL9.setRotationPoint(0.25F, 1.0F, 1.55F);
        this.body2.addChild(legL9);
        this.setRotateAngle(legL9, 0.0F, 0.0F, -0.8727F);
        this.legL9.cubeList.add(new ModelBox(legL9, 0, 19, 0.0F, -0.5F, 0.0F, 1, 3, 0, 0.0F, false));

        this.legR7 = new AdvancedModelRenderer(this);
        this.legR7.setRotationPoint(-0.25F, 1.0F, 0.1F);
        this.body2.addChild(legR7);
        this.setRotateAngle(legR7, 0.0F, 0.0F, 0.8727F);
        this.legR7.cubeList.add(new ModelBox(legR7, 0, 0, -1.0F, -0.5F, 0.0F, 1, 3, 0, 0.0F, false));

        this.legR8 = new AdvancedModelRenderer(this);
        this.legR8.setRotationPoint(-0.25F, 1.0F, 0.8F);
        this.body2.addChild(legR8);
        this.setRotateAngle(legR8, 0.0F, 0.0F, 0.8727F);
        this.legR8.cubeList.add(new ModelBox(legR8, 0, 0, -1.0F, -0.5F, 0.0F, 1, 3, 0, 0.0F, false));

        this.legR9 = new AdvancedModelRenderer(this);
        this.legR9.setRotationPoint(-0.25F, 1.0F, 1.55F);
        this.body2.addChild(legR9);
        this.setRotateAngle(legR9, 0.0F, 0.0F, 0.8727F);
        this.legR9.cubeList.add(new ModelBox(legR9, 0, 0, -1.0F, -0.5F, 0.0F, 1, 3, 0, 0.0F, false));

        this.body3 = new AdvancedModelRenderer(this);
        this.body3.setRotationPoint(0.0F, 0.0F, 2.0F);
        this.body2.addChild(body3);
        this.body3.cubeList.add(new ModelBox(body3, 0, 5, -2.0F, -0.88F, 0.0F, 4, 2, 2, 0.0F, false));

        this.legL10 = new AdvancedModelRenderer(this);
        this.legL10.setRotationPoint(0.25F, 1.0F, 0.3F);
        this.body3.addChild(legL10);
        this.setRotateAngle(legL10, 0.0F, 0.0F, -0.8727F);
        this.legL10.cubeList.add(new ModelBox(legL10, 0, 19, 0.0F, -0.5F, 0.0F, 1, 3, 0, 0.0F, false));

        this.legL11 = new AdvancedModelRenderer(this);
        this.legL11.setRotationPoint(0.25F, 1.0F, 1.0F);
        this.body3.addChild(legL11);
        this.setRotateAngle(legL11, 0.0F, 0.0F, -0.8727F);
        this.legL11.cubeList.add(new ModelBox(legL11, 0, 19, 0.0F, -0.5F, 0.0F, 1, 3, 0, 0.0F, false));

        this.legL12 = new AdvancedModelRenderer(this);
        this.legL12.setRotationPoint(0.25F, 1.0F, 1.7F);
        this.body3.addChild(legL12);
        this.setRotateAngle(legL12, 0.0F, 0.0F, -0.8727F);
        this.legL12.cubeList.add(new ModelBox(legL12, 0, 19, 0.0F, -0.5F, 0.0F, 1, 3, 0, 0.0F, false));

        this.legR10 = new AdvancedModelRenderer(this);
        this.legR10.setRotationPoint(-0.25F, 1.0F, 0.3F);
        this.body3.addChild(legR10);
        this.setRotateAngle(legR10, 0.0F, 0.0F, 0.8727F);
        this.legR10.cubeList.add(new ModelBox(legR10, 0, 0, -1.0F, -0.5F, 0.0F, 1, 3, 0, 0.0F, false));

        this.legR11 = new AdvancedModelRenderer(this);
        this.legR11.setRotationPoint(-0.25F, 1.0F, 1.0F);
        this.body3.addChild(legR11);
        this.setRotateAngle(legR11, 0.0F, 0.0F, 0.8727F);
        this.legR11.cubeList.add(new ModelBox(legR11, 0, 0, -1.0F, -0.5F, 0.0F, 1, 3, 0, 0.0F, false));

        this.legR12 = new AdvancedModelRenderer(this);
        this.legR12.setRotationPoint(-0.25F, 1.0F, 1.7F);
        this.body3.addChild(legR12);
        this.setRotateAngle(legR12, 0.0F, 0.0F, 0.8727F);
        this.legR12.cubeList.add(new ModelBox(legR12, 0, 0, -1.0F, -0.5F, 0.0F, 1, 3, 0, 0.0F, false));

        this.body4 = new AdvancedModelRenderer(this);
        this.body4.setRotationPoint(0.0F, 0.0F, 2.0F);
        this.body3.addChild(body4);
        this.setRotateAngle(body4, -0.0436F, 0.0F, 0.0F);
        this.body4.cubeList.add(new ModelBox(body4, 0, 16, -1.49F, -0.86F, 0.0F, 3, 1, 2, 0.0F, false));
        this.body4.cubeList.add(new ModelBox(body4, 8, 15, -1.493F, -0.155F, 0.005F, 3, 1, 2, 0.0F, false));

        this.legL13 = new AdvancedModelRenderer(this);
        this.legL13.setRotationPoint(0.25F, 0.9F, 0.45F);
        this.body4.addChild(legL13);
        this.setRotateAngle(legL13, 0.0F, 0.0F, -0.8727F);
        this.legL13.cubeList.add(new ModelBox(legL13, 0, 19, 0.0F, -0.5F, 0.0F, 1, 3, 0, 0.0F, false));

        this.legL14 = new AdvancedModelRenderer(this);
        this.legL14.setRotationPoint(0.25F, 0.8F, 1.2F);
        this.body4.addChild(legL14);
        this.setRotateAngle(legL14, 0.0F, 0.0F, -0.8727F);
        this.legL14.cubeList.add(new ModelBox(legL14, 0, 19, 0.0F, -0.5F, 0.0F, 1, 3, 0, 0.0F, false));

        this.legL15 = new AdvancedModelRenderer(this);
        this.legL15.setRotationPoint(0.25F, 0.7F, 1.95F);
        this.body4.addChild(legL15);
        this.setRotateAngle(legL15, 0.0F, 0.0F, -0.8727F);
        this.legL15.cubeList.add(new ModelBox(legL15, 0, 19, 0.0F, -0.5F, 0.0F, 1, 3, 0, 0.0F, false));

        this.legR13 = new AdvancedModelRenderer(this);
        this.legR13.setRotationPoint(-0.25F, 0.9F, 0.45F);
        this.body4.addChild(legR13);
        this.setRotateAngle(legR13, 0.0F, 0.0F, 0.8727F);
        this.legR13.cubeList.add(new ModelBox(legR13, 0, 0, -1.0F, -0.5F, 0.0F, 1, 3, 0, 0.0F, false));

        this.legR14 = new AdvancedModelRenderer(this);
        this.legR14.setRotationPoint(-0.25F, 0.8F, 1.2F);
        this.body4.addChild(legR14);
        this.setRotateAngle(legR14, 0.0F, 0.0F, 0.8727F);
        this.legR14.cubeList.add(new ModelBox(legR14, 0, 0, -1.0F, -0.5F, 0.0F, 1, 3, 0, 0.0F, false));

        this.legR15 = new AdvancedModelRenderer(this);
        this.legR15.setRotationPoint(-0.25F, 0.7F, 1.95F);
        this.body4.addChild(legR15);
        this.setRotateAngle(legR15, 0.0F, 0.0F, 0.8727F);
        this.legR15.cubeList.add(new ModelBox(legR15, 0, 0, -1.0F, -0.5F, 0.0F, 1, 3, 0, 0.0F, false));

        this.body5 = new AdvancedModelRenderer(this);
        this.body5.setRotationPoint(0.0F, 0.0F, 1.9F);
        this.body4.addChild(body5);
        this.setRotateAngle(body5, -0.1309F, 0.0F, 0.0F);
        this.body5.cubeList.add(new ModelBox(body5, 0, 13, -1.5F, -0.85F, 0.0F, 3, 1, 2, 0.0F, false));
        this.body5.cubeList.add(new ModelBox(body5, 14, 3, -1.495F, -0.405F, 0.005F, 3, 1, 2, 0.0F, false));

        this.legL16 = new AdvancedModelRenderer(this);
        this.legL16.setRotationPoint(0.25F, 0.45F, 0.6F);
        this.body5.addChild(legL16);
        this.setRotateAngle(legL16, 0.1745F, 0.0F, -0.8727F);
        this.legL16.cubeList.add(new ModelBox(legL16, 0, 19, 0.0F, -0.5F, 0.0F, 1, 3, 0, 0.0F, false));

        this.legR16 = new AdvancedModelRenderer(this);
        this.legR16.setRotationPoint(-0.25F, 0.45F, 0.6F);
        this.body5.addChild(legR16);
        this.setRotateAngle(legR16, 0.1745F, 0.0F, 0.8727F);
        this.legR16.cubeList.add(new ModelBox(legR16, 0, 0, -1.0F, -0.5F, 0.0F, 1, 3, 0, 0.0F, false));

        this.body6 = new AdvancedModelRenderer(this);
        this.body6.setRotationPoint(0.0F, -0.25F, 2.0F);
        this.body5.addChild(body6);
        this.body6.cubeList.add(new ModelBox(body6, 16, 16, -0.99F, -0.59F, 0.0F, 2, 1, 2, 0.0F, false));
        this.body6.cubeList.add(new ModelBox(body6, 16, 11, -0.995F, -0.405F, 0.005F, 2, 1, 2, 0.0F, false));

        this.body7 = new AdvancedModelRenderer(this);
        this.body7.setRotationPoint(0.0F, -0.25F, 2.0F);
        this.body6.addChild(body7);
        this.body7.cubeList.add(new ModelBox(body7, 9, 11, -1.0F, -0.33F, 0.0F, 2, 1, 3, 0.0F, false));

        this.tail = new AdvancedModelRenderer(this);
        this.tail.setRotationPoint(0.0F, 0.0F, 3.0F);
        this.body7.addChild(tail);
        this.tail.cubeList.add(new ModelBox(tail, 10, 0, -1.5F, 0.1F, -0.5F, 3, 0, 3, 0.0F, false));

        updateDefaultPose();
    }

    @Override
    public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        this.head.render(f5 * 0.28F);
    }
    public void renderStatic(float f) {
        //GlStateManager.pushMatrix();
        //GlStateManager.enableBlend();
        //GlStateManager.blendFunc(GlStateManager.SourceFactor.SRC_ALPHA, GlStateManager.DestFactor.ONE_MINUS_SRC_ALPHA);
        //GlStateManager.disableCull();
        this.head.render(0.01F);
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
        this.head.offsetY = 1.1F;

        boolean isAtBottom = false;
        if (e.getPosition().getY() - 1 > 1) {
            BlockPos pos = new BlockPos(e.getPosition().getX(), e.getPosition().getY() - 1, e.getPosition().getZ());
            isAtBottom = ((e.isInsideOfMaterial(Material.WATER) || e.isInsideOfMaterial(Material.CORAL))
                    && ((e.world.getBlockState(pos)).getMaterial() != Material.WATER)
                    && ((double)e.getPosition().getY() + 0.334D) > e.posY);
        }

        AdvancedModelRenderer[] legsL = {this.legL, this.legL2, this.legL3, this.legL4, this.legL5, this.legL6, this.legL7, this.legL8, this.legL9, this.legL10, this.legL11, this.legL12, this.legL13, this.legL14, this.legL15, this.legL16};
        AdvancedModelRenderer[] legsR = {this.legR, this.legR2, this.legR3, this.legR4, this.legR5, this.legR6, this.legR7, this.legR8, this.legR9, this.legR10, this.legR11, this.legR12, this.legR13, this.legR14, this.legR15, this.legR16};
        AdvancedModelRenderer[] bodyF = {this.body4,this.body5,this.body6,this.body7};

        if (isAtBottom) {
            if (((EntityPrehistoricFloraAlacaris)e).getIsMoving()) {
                this.chainWave(legsL, 0.2F, 0.2F, -3, f2, 1);
                this.chainWave(legsR, 0.6F, 0.2F, -3, f2, 1);
                this.flap(legL, 0.5F, -0.5F, false, 0, -0.5F, f2, 0.3F);
                this.flap(legR, 0.5F, 0.5F, false, 0, 0.5F, f2, 0.3F);
                this.flap(legL2, 0.5F, -0.5F, false, 1.0F, -0.5F, f2, 0.3F);
                this.flap(legR2, 0.5F, 0.5F, false, 1.0F, 0.5F, f2, 0.3F);
                this.flap(legL3, 0.5F, -0.5F, false, 2.0F, -0.5F, f2, 0.3F);
                this.flap(legR3, 0.5F, 0.5F, false, 2.0F, 0.5F, f2, 0.3F);
                this.flap(legL4, 0.5F, -0.5F, false, 3.0F, -0.5F, f2, 0.3F);
                this.flap(legR4, 0.5F, 0.5F, false, 3.0F, 0.5F, f2, 0.3F);
                this.flap(legL5, 0.5F, -0.5F, false, 4.0F, -0.5F, f2, 0.3F);
                this.flap(legR5, 0.5F, 0.5F, false, 4.0F, 0.5F, f2, 0.3F);
                this.flap(legL6, 0.5F, -0.5F, false, 5.0F, -0.5F, f2, 0.3F);
                this.flap(legR6, 0.5F, 0.5F, false, 5.0F, 0.5F, f2, 0.3F);
                this.flap(legL7, 0.5F, -0.5F, false, 6.0F, -0.5F, f2, 0.3F);
                this.flap(legR7, 0.5F, 0.5F, false, 6.0F, 0.5F, f2, 0.3F);
                this.flap(legL8, 0.5F, -0.5F, false, 7.0F, -0.5F, f2, 0.3F);
                this.flap(legR8, 0.5F, 0.5F, false, 7.0F, 0.5F, f2, 0.3F);
                this.flap(legL9, 0.5F, -0.5F, false, 8.0F, -0.5F, f2, 0.3F);
                this.flap(legR9, 0.5F, 0.5F, false, 8.0F, 0.5F, f2, 0.3F);
                this.flap(legL10, 0.5F, -0.5F, false, 9.0F, -0.5F, f2, 0.3F);
                this.flap(legR10, 0.5F, 0.5F, false, 9.0F, 0.5F, f2, 0.3F);
                this.flap(legL11, 0.5F, -0.5F, false, 10.0F, -0.5F, f2, 0.3F);
                this.flap(legR11, 0.5F, 0.5F, false, 10.0F, 0.5F, f2, 0.3F);
                this.flap(legL12, 0.5F, -0.5F, false, 11.0F, -0.5F, f2, 0.3F);
                this.flap(legR12, 0.5F, 0.5F, false, 11.0F, 0.5F, f2, 0.3F);
                this.flap(legL13, 0.5F, -0.5F, false, 12.0F, -0.5F, f2, 0.3F);
                this.flap(legR13, 0.5F, 0.5F, false, 12.0F, 0.5F, f2, 0.3F);
                this.flap(legL14, 0.5F, -0.5F, false, 13.0F, -0.5F, f2, 0.3F);
                this.flap(legR14, 0.5F, 0.5F, false, 13.0F, 0.5F, f2, 0.3F);
                this.flap(legL15, 0.5F, -0.5F, false, 14.0F, -0.5F, f2, 0.3F);
                this.flap(legR15, 0.5F, 0.5F, false, 14.0F, 0.5F, f2, 0.3F);
                this.flap(legL16, 0.5F, -0.5F, false, 15.0F, -0.5F, f2, 0.3F);
                this.flap(legR16, 0.5F, 0.5F, false, 15.0F, 0.5F, f2, 0.3F);
                this.bob(head, 1F, 0.05F, false, f2, 1);
                this.walk(body6, 0.8F, -0.015f, false, 2, 0.2F, f2, 1F);
                this.chainWave(bodyF, 0.8F, 0.03f, 0.5, f2, 0.4F);
            }
            this.chainSwing(bodyF, 0.1F, 0.1F, -3, f2, 1.0F);
        }
        else {
            this.chainWave(legsL, 0.2F, 0.2F, -3, f2, 1);
            this.chainWave(legsR, 0.25F, 0.2F, -3, f2, 1);
            this.flap(legL, 0.2F, -0.5F, false, 0, -0.5F, f2, 0.3F);
            this.flap(legR, 0.2F, 0.5F, false, 0, 0.5F, f2, 0.3F);
            this.flap(legL2, 0.2F, -0.5F, false, 1.0F, -0.5F, f2, 0.3F);
            this.flap(legR2, 0.2F, 0.5F, false, 1.0F, 0.5F, f2, 0.3F);
            this.flap(legL3, 0.2F, -0.5F, false, 2.0F, -0.5F, f2, 0.3F);
            this.flap(legR3, 0.2F, 0.5F, false, 2.0F, 0.5F, f2, 0.3F);
            this.flap(legL4, 0.2F, -0.5F, false, 3.0F, -0.5F, f2, 0.3F);
            this.flap(legR4, 0.2F, 0.5F, false, 3.0F, 0.5F, f2, 0.3F);
            this.flap(legL5, 0.2F, -0.5F, false, 4.0F, -0.5F, f2, 0.3F);
            this.flap(legR5, 0.2F, 0.5F, false, 4.0F, 0.5F, f2, 0.3F);
            this.flap(legL6, 0.2F, -0.5F, false, 5.0F, -0.5F, f2, 0.3F);
            this.flap(legR6, 0.2F, 0.5F, false, 5.0F, 0.5F, f2, 0.3F);
            this.flap(legL7, 0.2F, -0.5F, false, 6.0F, -0.5F, f2, 0.3F);
            this.flap(legR7, 0.2F, 0.5F, false, 6.0F, 0.5F, f2, 0.3F);
            this.flap(legL8, 0.2F, -0.5F, false, 7.0F, -0.5F, f2, 0.3F);
            this.flap(legR8, 0.2F, 0.5F, false, 7.0F, 0.5F, f2, 0.3F);
            this.flap(legL9, 0.2F, -0.5F, false, 8.0F, -0.5F, f2, 0.3F);
            this.flap(legR9, 0.2F, 0.5F, false, 8.0F, 0.5F, f2, 0.3F);
            this.flap(legL10, 0.2F, -0.5F, false, 9.0F, -0.5F, f2, 0.3F);
            this.flap(legR10, 0.2F, 0.5F, false, 9.0F, 0.5F, f2, 0.3F);
            this.flap(legL11, 0.2F, -0.5F, false, 10.0F, -0.5F, f2, 0.3F);
            this.flap(legR11, 0.2F, 0.5F, false, 10.0F, 0.5F, f2, 0.3F);
            this.flap(legL12, 0.2F, -0.5F, false, 11.0F, -0.5F, f2, 0.3F);
            this.flap(legR12, 0.2F, 0.5F, false, 11.0F, 0.5F, f2, 0.3F);
            this.flap(legL13, 0.2F, -0.5F, false, 12.0F, -0.5F, f2, 0.3F);
            this.flap(legR13, 0.2F, 0.5F, false, 12.0F, 0.5F, f2, 0.3F);
            this.flap(legL14, 0.2F, -0.5F, false, 13.0F, -0.5F, f2, 0.3F);
            this.flap(legR14, 0.2F, 0.5F, false, 13.0F, 0.5F, f2, 0.3F);
            this.flap(legL15, 0.2F, -0.5F, false, 14.0F, -0.5F, f2, 0.3F);
            this.flap(legR15, 0.2F, 0.5F, false, 14.0F, 0.5F, f2, 0.3F);
            this.flap(legL16, 0.2F, -0.5F, false, 15.0F, -0.5F, f2, 0.3F);
            this.flap(legR16, 0.2F, 0.5F, false, 15.0F, 0.5F, f2, 0.3F);
            this.chainSwing(bodyF, 0.2F, 0.2F, -3, f2, 0.5F);
            this.chainWave(bodyF, 0.5F, 0.3f, -3, f2, 0.8F);
            this.bob(head, 0.2F, 0.2F, false, f2, 1);
        }

        this.swing(antennaL, 0.8F, -0.3F, false, 0, -0.1F, f2, 0.8F);
        this.swing(antennaR, 0.8F, 0.3F, false, 0, 0.1F, f2, 0.8F);

    }
}
