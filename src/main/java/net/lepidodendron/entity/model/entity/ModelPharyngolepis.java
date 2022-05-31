package net.lepidodendron.entity.model.entity;

import net.ilexiconn.llibrary.client.model.tools.AdvancedModelBase;
import net.ilexiconn.llibrary.client.model.tools.AdvancedModelRenderer;
import net.minecraft.block.material.Material;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLiving;
import net.minecraft.util.math.BlockPos;

public class ModelPharyngolepis extends AdvancedModelBase {
    private final AdvancedModelRenderer body;
    private final AdvancedModelRenderer cube_r1;
    private final AdvancedModelRenderer cube_r2;
    private final AdvancedModelRenderer cube_r3;
    private final AdvancedModelRenderer cube_r4;
    private final AdvancedModelRenderer cube_r5;
    private final AdvancedModelRenderer cube_r6;
    private final AdvancedModelRenderer cube_r7;
    private final AdvancedModelRenderer cube_r8;
    private final AdvancedModelRenderer cube_r9;
    private final AdvancedModelRenderer cube_r10;
    private final AdvancedModelRenderer cube_r11;
    private final AdvancedModelRenderer cube_r12;
    private final AdvancedModelRenderer body2;
    private final AdvancedModelRenderer cube_r13;
    private final AdvancedModelRenderer cube_r14;
    private final AdvancedModelRenderer cube_r15;
    private final AdvancedModelRenderer body3;
    private final AdvancedModelRenderer cube_r16;
    private final AdvancedModelRenderer body4;
    private final AdvancedModelRenderer cube_r17;
    private final AdvancedModelRenderer cube_r18;
    private final AdvancedModelRenderer cube_r19;
    private final AdvancedModelRenderer cube_r20;

    public ModelPharyngolepis() {
        this.textureWidth = 64;
        this.textureHeight = 64;

        this.body = new AdvancedModelRenderer(this);
        this.body.setRotationPoint(0.0F, 32.0F, -7.0F);
        this.body.cubeList.add(new ModelBox(body, 0, 0, -2.5F, -16.0F, 0.0F, 5, 7, 16, 0.0F, false));
        this.body.cubeList.add(new ModelBox(body, 10, 23, -2.0F, -9.0F, 6.0F, 4, 1, 10, 0.0F, false));

        this.cube_r1 = new AdvancedModelRenderer(this);
        this.cube_r1.setRotationPoint(0.0F, -14.0F, 0.0F);
        this.body.addChild(cube_r1);
        this.setRotateAngle(cube_r1, 0.0F, 1.5708F, 0.0F);
        this.cube_r1.cubeList.add(new ModelBox(cube_r1, 0, 48, -16.01F, -2.15F, -0.5F, 16, 1, 1, 0.0F, false));

        this.cube_r2 = new AdvancedModelRenderer(this);
        this.cube_r2.setRotationPoint(-2.0F, -9.0F, 5.0F);
        this.body.addChild(cube_r2);
        this.setRotateAngle(cube_r2, -0.6981F, 1.2217F, -0.6981F);
        this.cube_r2.cubeList.add(new ModelBox(cube_r2, 0, 5, -1.25F, -0.5F, -0.5F, 2, 1, 0, 0.0F, false));

        this.cube_r3 = new AdvancedModelRenderer(this);
        this.cube_r3.setRotationPoint(2.0F, -9.0F, 5.0F);
        this.body.addChild(cube_r3);
        this.setRotateAngle(cube_r3, -0.6981F, -1.2217F, 0.6981F);
        this.cube_r3.cubeList.add(new ModelBox(cube_r3, 12, 14, -0.75F, -0.5F, -0.5F, 2, 1, 0, 0.0F, false));

        this.cube_r4 = new AdvancedModelRenderer(this);
        this.cube_r4.setRotationPoint(-2.0F, -8.0F, 12.0F);
        this.body.addChild(cube_r4);
        this.setRotateAngle(cube_r4, 0.0F, 0.0F, 0.5236F);
        this.cube_r4.cubeList.add(new ModelBox(cube_r4, 0, 22, -0.34F, -1.35F, -6.0F, 0, 2, 12, 0.0F, false));

        this.cube_r5 = new AdvancedModelRenderer(this);
        this.cube_r5.setRotationPoint(2.0F, -8.0F, 12.0F);
        this.body.addChild(cube_r5);
        this.setRotateAngle(cube_r5, 0.0F, 0.0F, -0.5236F);
        this.cube_r5.cubeList.add(new ModelBox(cube_r5, 0, 24, 0.34F, -1.35F, -6.0F, 0, 2, 12, 0.0F, false));

        this.cube_r6 = new AdvancedModelRenderer(this);
        this.cube_r6.setRotationPoint(0.0F, 0.1F, 0.0F);
        this.body.addChild(cube_r6);
        this.setRotateAngle(cube_r6, -0.2618F, 0.0F, 0.0F);
        this.cube_r6.cubeList.add(new ModelBox(cube_r6, 6, 0, -1.95F, -11.95F, -8.25F, 1, 3, 2, 0.0F, false));
        this.cube_r6.cubeList.add(new ModelBox(cube_r6, 12, 38, -1.95F, -13.95F, -6.25F, 1, 5, 4, 0.0F, false));
        this.cube_r6.cubeList.add(new ModelBox(cube_r6, 28, 23, 0.95F, -11.95F, -8.25F, 1, 3, 2, 0.0F, false));
        this.cube_r6.cubeList.add(new ModelBox(cube_r6, 40, 40, 0.95F, -13.95F, -6.25F, 1, 5, 4, 0.0F, false));

        this.cube_r7 = new AdvancedModelRenderer(this);
        this.cube_r7.setRotationPoint(0.0F, -12.9F, -5.0F);
        this.body.addChild(cube_r7);
        this.setRotateAngle(cube_r7, 0.3491F, 0.0F, 0.0F);
        this.cube_r7.cubeList.add(new ModelBox(cube_r7, 12, 6, -1.7F, -0.2441F, -1.1303F, 1, 2, 1, 0.0F, false));

        this.cube_r8 = new AdvancedModelRenderer(this);
        this.cube_r8.setRotationPoint(0.0F, -12.9F, -4.925F);
        this.body.addChild(cube_r8);
        this.setRotateAngle(cube_r8, 0.3491F, 0.0F, 0.0F);
        this.cube_r8.cubeList.add(new ModelBox(cube_r8, 12, 9, 0.7F, -0.2441F, -1.2053F, 1, 2, 1, 0.0F, false));

        this.cube_r9 = new AdvancedModelRenderer(this);
        this.cube_r9.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.body.addChild(cube_r9);
        this.setRotateAngle(cube_r9, -0.0873F, 0.0F, 0.0F);
        this.cube_r9.cubeList.add(new ModelBox(cube_r9, 28, 23, -2.0F, -9.525F, -0.725F, 4, 1, 6, 0.0F, false));

        this.cube_r10 = new AdvancedModelRenderer(this);
        this.cube_r10.setRotationPoint(0.0F, 0.1F, 0.0F);
        this.body.addChild(cube_r10);
        this.setRotateAngle(cube_r10, -0.2182F, 0.0F, 0.0F);
        this.cube_r10.cubeList.add(new ModelBox(cube_r10, 18, 34, -1.5F, -9.625F, -7.825F, 3, 1, 6, 0.0F, false));

        this.cube_r11 = new AdvancedModelRenderer(this);
        this.cube_r11.setRotationPoint(0.0F, -15.9F, 0.075F);
        this.body.addChild(cube_r11);
        this.setRotateAngle(cube_r11, 0.48F, 0.0F, 0.0F);
        this.cube_r11.cubeList.add(new ModelBox(cube_r11, 28, 30, -1.5F, -0.75F, -7.0F, 3, 1, 1, 0.0F, false));

        this.cube_r12 = new AdvancedModelRenderer(this);
        this.cube_r12.setRotationPoint(0.0F, -15.9F, 0.0F);
        this.body.addChild(cube_r12);
        this.setRotateAngle(cube_r12, 0.3491F, 0.0F, 0.0F);
        this.cube_r12.cubeList.add(new ModelBox(cube_r12, 36, 5, -2.0F, 1.0F, -6.0F, 1, 1, 6, 0.0F, false));
        this.cube_r12.cubeList.add(new ModelBox(cube_r12, 30, 37, 1.0F, 1.0F, -6.0F, 1, 1, 6, 0.0F, false));
        this.cube_r12.cubeList.add(new ModelBox(cube_r12, 4, 0, -2.05F, 0.3F, -5.25F, 1, 1, 1, 0.0F, false));
        this.cube_r12.cubeList.add(new ModelBox(cube_r12, 10, 0, 1.05F, 0.3F, -5.25F, 1, 1, 1, 0.0F, false));
        this.cube_r12.cubeList.add(new ModelBox(cube_r12, 32, 30, -2.0F, 0.0F, -6.0F, 4, 1, 6, 0.0F, false));

        this.body2 = new AdvancedModelRenderer(this);
        this.body2.setRotationPoint(0.0F, -12.0F, 16.0F);
        this.body.addChild(body2);
        this.body2.cubeList.add(new ModelBox(body2, 26, 0, -2.0F, -3.5F, 0.0F, 4, 7, 4, 0.0F, false));
        this.body2.cubeList.add(new ModelBox(body2, 12, 0, 0.0F, 2.5F, 2.0F, 0, 4, 2, 0.0F, false));

        this.cube_r13 = new AdvancedModelRenderer(this);
        this.cube_r13.setRotationPoint(1.25F, 3.0F, 2.25F);
        this.body2.addChild(cube_r13);
        this.setRotateAngle(cube_r13, 0.0F, -1.2217F, 0.3491F);
        this.cube_r13.cubeList.add(new ModelBox(cube_r13, 8, 5, -0.25F, -0.5F, -0.75F, 2, 1, 0, 0.0F, false));

        this.cube_r14 = new AdvancedModelRenderer(this);
        this.cube_r14.setRotationPoint(-1.25F, 3.0F, 2.25F);
        this.body2.addChild(cube_r14);
        this.setRotateAngle(cube_r14, 0.0F, 1.2217F, -0.3491F);
        this.cube_r14.cubeList.add(new ModelBox(cube_r14, 4, 5, -1.75F, -0.5F, -0.75F, 2, 1, 0, 0.0F, false));

        this.cube_r15 = new AdvancedModelRenderer(this);
        this.cube_r15.setRotationPoint(0.0F, -4.0F, -16.0F);
        this.body2.addChild(cube_r15);
        this.setRotateAngle(cube_r15, 0.0F, 1.5708F, 0.0F);
        this.cube_r15.cubeList.add(new ModelBox(cube_r15, 0, 50, -20.01F, 0.35F, -0.5F, 4, 1, 1, 0.0F, false));

        this.body3 = new AdvancedModelRenderer(this);
        this.body3.setRotationPoint(0.0F, 0.0F, 4.0F);
        this.body2.addChild(body3);
        this.body3.cubeList.add(new ModelBox(body3, 26, 8, 0.0F, 2.5F, 0.0F, 0, 4, 3, 0.0F, false));
        this.body3.cubeList.add(new ModelBox(body3, 0, 38, -1.5F, -2.5F, 0.0F, 3, 5, 3, 0.0F, false));

        this.cube_r16 = new AdvancedModelRenderer(this);
        this.cube_r16.setRotationPoint(0.0F, -4.0F, -20.0F);
        this.body3.addChild(cube_r16);
        this.setRotateAngle(cube_r16, 0.0F, 1.5708F, 0.0F);
        this.cube_r16.cubeList.add(new ModelBox(cube_r16, 0, 53, -23.01F, 1.35F, -0.5F, 3, 1, 1, 0.0F, false));

        this.body4 = new AdvancedModelRenderer(this);
        this.body4.setRotationPoint(0.0F, 0.0F, 3.0F);
        this.body3.addChild(body4);


        this.cube_r17 = new AdvancedModelRenderer(this);
        this.cube_r17.setRotationPoint(0.0F, 4.0F, -23.0F);
        this.body4.addChild(cube_r17);
        this.setRotateAngle(cube_r17, -0.1745F, 0.0F, 0.0F);
        this.cube_r17.cubeList.add(new ModelBox(cube_r17, 0, 13, 0.0F, -15.0F, 27.6F, 0, 9, 10, 0.0F, false));
        this.cube_r17.cubeList.add(new ModelBox(cube_r17, 0, 0, 0.0F, -15.0F, 21.6F, 0, 9, 6, 0.0F, false));

        this.cube_r18 = new AdvancedModelRenderer(this);
        this.cube_r18.setRotationPoint(0.0F, -1.75F, 0.0F);
        this.body4.addChild(cube_r18);
        this.setRotateAngle(cube_r18, -0.2182F, 0.0F, 0.0F);
        this.cube_r18.cubeList.add(new ModelBox(cube_r18, 32, 11, -0.5F, 0.775F, 8.0F, 1, 2, 2, 0.0F, false));
        this.cube_r18.cubeList.add(new ModelBox(cube_r18, 0, 0, -0.49F, 0.275F, 6.0F, 1, 3, 2, 0.0F, false));

        this.cube_r19 = new AdvancedModelRenderer(this);
        this.cube_r19.setRotationPoint(0.0F, -1.75F, 0.0F);
        this.body4.addChild(cube_r19);
        this.setRotateAngle(cube_r19, -0.1745F, 0.0F, 0.0F);
        this.cube_r19.cubeList.add(new ModelBox(cube_r19, 12, 12, -0.49F, 1.775F, 9.75F, 1, 1, 1, 0.0F, false));
        this.cube_r19.cubeList.add(new ModelBox(cube_r19, 42, 12, -0.5F, -0.125F, 3.0F, 1, 4, 3, 0.0F, false));

        this.cube_r20 = new AdvancedModelRenderer(this);
        this.cube_r20.setRotationPoint(0.0F, -1.75F, 0.0F);
        this.body4.addChild(cube_r20);
        this.setRotateAngle(cube_r20, -0.1309F, 0.0F, 0.0F);
        this.cube_r20.cubeList.add(new ModelBox(cube_r20, 22, 41, -1.0F, 0.0F, 0.0F, 2, 4, 3, 0.0F, false));

        updateDefaultPose();
    }

    @Override
    public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        this.body.render(f5 * 0.204F);
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
        this.body.offsetY = 1.1F;

        //this.Tailfin.setScale(1.1F, 1.1F, 1.1F);
        AdvancedModelRenderer[] fishTail = {this.body2, this.body3, this.body4};

        float speed = 0.4F;
        float taildegree = 0.35F;

        if (!e.isInWater()) {
            speed = 0.7F;
        }

        boolean isAtBottom = false;
        if (e.getPosition().getY() - 1 > 1) {
            BlockPos pos = new BlockPos(e.getPosition().getX(), e.getPosition().getY() - 1, e.getPosition().getZ());
            isAtBottom = ((e.isInsideOfMaterial(Material.WATER) || e.isInsideOfMaterial(Material.CORAL))
                && ((e.world.getBlockState(pos)).getMaterial() != Material.WATER)
                && ((double)e.getPosition().getY() + 0.334D) > e.posY);
        }
        if (isAtBottom) {
            //System.err.println("Animation at bottom");
            speed = 0.15F;
            taildegree = 0.15F;
        }

        if (e instanceof EntityLiving && !((EntityLiving) e).isAIDisabled()) {
            this.chainWave(fishTail, speed, 0.05F, -2, f2, 1);
            this.chainSwing(fishTail, speed, taildegree, -2, f2, 1);
            this.swing(body, speed, 0.3F, true, 0, 0, f2, 1);

            if (!e.isInWater()) {
                this.body.rotateAngleZ = (float) Math.toRadians(90);
                this.body.offsetY = 0.98F;
                this.bob(body, -speed, 2F, false, f2, 1);
                this.chainWave(fishTail, speed, 0.2F, -2, f2, 1);
            }
        }
    }
}
