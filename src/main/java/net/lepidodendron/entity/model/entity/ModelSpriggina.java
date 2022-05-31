package net.lepidodendron.entity.model.entity;

import net.ilexiconn.llibrary.client.model.tools.AdvancedModelBase;
import net.ilexiconn.llibrary.client.model.tools.AdvancedModelRenderer;
import net.minecraft.block.material.Material;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;
import net.minecraft.util.math.BlockPos;

public class ModelSpriggina extends AdvancedModelBase {
    private final AdvancedModelRenderer body1;
    private final AdvancedModelRenderer head;
    private final AdvancedModelRenderer cube_r1;
    private final AdvancedModelRenderer cube_r2;
    private final AdvancedModelRenderer cube_r3;
    private final AdvancedModelRenderer body2;
    private final AdvancedModelRenderer body3;
    private final AdvancedModelRenderer body4;
    private final AdvancedModelRenderer body5;
    private final AdvancedModelRenderer body6;
    private final AdvancedModelRenderer body7;
    private final AdvancedModelRenderer body8;
    private final AdvancedModelRenderer body9;
    private final AdvancedModelRenderer body10;
    private final AdvancedModelRenderer body11;
    private final AdvancedModelRenderer body12;
    private final AdvancedModelRenderer body13;

    public ModelSpriggina() {
        this.textureWidth = 32;
        this.textureHeight = 32;

        this.body1 = new AdvancedModelRenderer(this);
        this.body1.setRotationPoint(0.0F, 23.5F, -6.0F);
        this.body1.cubeList.add(new ModelBox(body1, 12, 2, -1.99F, -0.51F, 0.0F, 4, 1, 1, 0.0F, false));

        this.head = new AdvancedModelRenderer(this);
        this.head.setRotationPoint(0.0F, 0.5F, 6.0F);
        this.body1.addChild(head);
        this.head.cubeList.add(new ModelBox(head, 0, 4, -2.0F, -1.0F, -8.0F, 4, 1, 2, 0.0F, false));

        this.cube_r1 = new AdvancedModelRenderer(this);
        this.cube_r1.setRotationPoint(0.0F, -1.0F, -8.0F);
        this.head.addChild(cube_r1);
        this.setRotateAngle(cube_r1, 0.0873F, 0.0F, 0.0F);
        this.cube_r1.cubeList.add(new ModelBox(cube_r1, 0, 0, -1.5F, 0.0F, 0.0F, 3, 1, 3, 0.0F, false));

        this.cube_r2 = new AdvancedModelRenderer(this);
        this.cube_r2.setRotationPoint(-2.0F, 0.0F, -8.0F);
        this.head.addChild(cube_r2);
        this.setRotateAngle(cube_r2, 0.0F, -0.1745F, 0.0F);
        this.cube_r2.cubeList.add(new ModelBox(cube_r2, 0, 11, 0.0F, -1.02F, 0.0F, 1, 1, 3, 0.0F, false));

        this.cube_r3 = new AdvancedModelRenderer(this);
        this.cube_r3.setRotationPoint(2.0F, 0.0F, -8.0F);
        this.head.addChild(cube_r3);
        this.setRotateAngle(cube_r3, 0.0F, 0.1745F, 0.0F);
        this.cube_r3.cubeList.add(new ModelBox(cube_r3, 5, 12, -1.0F, -1.02F, 0.0F, 1, 1, 3, 0.0F, false));

        this.body2 = new AdvancedModelRenderer(this);
        this.body2.setRotationPoint(0.0F, 0.0F, 1.0F);
        this.body1.addChild(body2);
        this.body2.cubeList.add(new ModelBox(body2, 11, 6, -2.0F, -0.5F, 0.0F, 4, 1, 1, 0.0F, false));

        this.body3 = new AdvancedModelRenderer(this);
        this.body3.setRotationPoint(0.0F, 0.0F, 1.0F);
        this.body2.addChild(body3);
        this.body3.cubeList.add(new ModelBox(body3, 9, 10, -1.99F, -0.51F, 0.0F, 4, 1, 1, 0.0F, false));

        this.body4 = new AdvancedModelRenderer(this);
        this.body4.setRotationPoint(0.0F, 0.0F, 1.0F);
        this.body3.addChild(body4);
        this.body4.cubeList.add(new ModelBox(body4, 10, 4, -2.0F, -0.5F, 0.0F, 4, 1, 1, 0.0F, false));

        this.body5 = new AdvancedModelRenderer(this);
        this.body5.setRotationPoint(0.0F, 0.0F, 1.0F);
        this.body4.addChild(body5);
        this.body5.cubeList.add(new ModelBox(body5, 9, 8, -1.99F, -0.51F, 0.0F, 4, 1, 1, 0.0F, false));

        this.body6 = new AdvancedModelRenderer(this);
        this.body6.setRotationPoint(0.0F, 0.0F, 1.0F);
        this.body5.addChild(body6);
        this.body6.cubeList.add(new ModelBox(body6, 9, 0, -2.0F, -0.5F, 0.0F, 4, 1, 1, 0.0F, false));

        this.body7 = new AdvancedModelRenderer(this);
        this.body7.setRotationPoint(0.0F, 0.0F, 1.0F);
        this.body6.addChild(body7);
        this.body7.cubeList.add(new ModelBox(body7, 0, 9, -1.99F, -0.51F, 0.0F, 4, 1, 1, 0.0F, false));

        this.body8 = new AdvancedModelRenderer(this);
        this.body8.setRotationPoint(0.0F, 0.0F, 1.0F);
        this.body7.addChild(body8);
        this.body8.cubeList.add(new ModelBox(body8, 0, 7, -2.0F, -0.5F, 0.0F, 4, 1, 1, 0.0F, false));

        this.body9 = new AdvancedModelRenderer(this);
        this.body9.setRotationPoint(0.0F, 0.0F, 1.0F);
        this.body8.addChild(body9);
        this.body9.cubeList.add(new ModelBox(body9, 0, 16, -1.49F, -0.51F, 0.0F, 3, 1, 1, 0.0F, false));

        this.body10 = new AdvancedModelRenderer(this);
        this.body10.setRotationPoint(0.0F, 0.0F, 1.0F);
        this.body9.addChild(body10);
        this.body10.cubeList.add(new ModelBox(body10, 13, 14, -1.5F, -0.5F, 0.0F, 3, 1, 1, 0.0F, false));

        this.body11 = new AdvancedModelRenderer(this);
        this.body11.setRotationPoint(0.0F, 0.0F, 1.0F);
        this.body10.addChild(body11);
        this.body11.cubeList.add(new ModelBox(body11, 10, 12, -1.49F, -0.51F, 0.0F, 3, 1, 1, 0.0F, false));

        this.body12 = new AdvancedModelRenderer(this);
        this.body12.setRotationPoint(0.0F, 0.0F, 1.0F);
        this.body11.addChild(body12);
        this.body12.cubeList.add(new ModelBox(body12, 14, 16, -1.0F, -0.5F, 0.0F, 2, 1, 1, 0.0F, false));

        this.body13 = new AdvancedModelRenderer(this);
        this.body13.setRotationPoint(0.0F, 0.0F, 1.0F);
        this.body12.addChild(body13);
        this.body13.cubeList.add(new ModelBox(body13, 8, 16, -0.99F, -0.51F, 0.0F, 2, 1, 1, 0.0F, false));

        updateDefaultPose();
    }

    @Override
    public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        this.body1.render(f5 * 0.35F);
    }

    public void setRotateAngle(ModelRenderer AdvancedModelRenderer, float x, float y, float z) {
        AdvancedModelRenderer.rotateAngleX = x;
        AdvancedModelRenderer.rotateAngleY = y;
        AdvancedModelRenderer.rotateAngleZ = z;
    }

    @Override
    public void setRotationAngles(float f, float f1, float f2, float f3, float f4, float f5, Entity e) {
        super.setRotationAngles(f, f1, f2, f3, f4, f5, e);
        this.resetToDefaultPose();
        this.body1.offsetY = 0.982F;

        boolean isAtBottom = false;
        if (e.getPosition().getY() - 1 > 1) {
            BlockPos pos = new BlockPos(e.getPosition().getX(), e.getPosition().getY() - 1, e.getPosition().getZ());
            isAtBottom = ((e.isInsideOfMaterial(Material.WATER) || e.isInsideOfMaterial(Material.CORAL))
                    && ((e.world.getBlockState(pos)).getMaterial() != Material.WATER)
                    && ((double)e.getPosition().getY() + 0.334D) > e.posY);
        }

        this.body1.rotateAngleY = (f3 / (180F / (float) Math.PI)) * 0.1F;
        this.body1.rotateAngleX = (f4 / (180F / (float) Math.PI)) * 0.1F;

        this.head.rotateAngleY = (f3 / (180F / (float) Math.PI)) * 0.05F;
        this.head.rotateAngleX = (f4 / (180F / (float) Math.PI)) * 0.05F;

        AdvancedModelRenderer[] body = {this.body2, this.body3, this.body4, this.body5, this.body6, this.body7, this.body8, this.body9, this.body10, this.body11, this.body12, this.body13};

        if (e.isInWater()) {
            if (isAtBottom) {
                this.chainSwing(body, 0.1F, 0.08F, 0.5, f2, 0.3F);
                this.chainWave(body, 0.1F, 0.0f, 0.5, f2, 0F);
                this.bob(body1, 0.0F, 0.0F, false, f2, 1);
            } else {
                this.chainSwing(body, 0.2F, 0.05F, 0.5, f2, 0.3F);
                this.chainWave(body, 0.5F, 0.07f, 0.5, f2, 0.5F);
                this.bob(body1, 0.2F, 0.2F, false, f2, 1);
            }
        }
        else {
            this.body1.offsetY = 0.978F;
            this.chainSwing(body, 0.2F, 0.08F, 0.5, f2, 0.3F);
            this.chainWave(body, 0.8F, 0.07f, 0.5, f2, 0.5F);
            this.bob(body1, 0.8F, 0.5F, false, f2, 1);
        }

    }
}
