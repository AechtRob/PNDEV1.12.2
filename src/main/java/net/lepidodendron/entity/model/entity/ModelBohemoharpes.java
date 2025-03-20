package net.lepidodendron.entity.model.entity;

import net.ilexiconn.llibrary.client.model.tools.AdvancedModelRenderer;
import net.lepidodendron.entity.EntityPrehistoricFloraBohemoharpes;
import net.lepidodendron.entity.model.ModelBasePalaeopedia;
import net.minecraft.block.material.Material;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;
import net.minecraft.util.math.BlockPos;

public class ModelBohemoharpes extends ModelBasePalaeopedia {
    private final AdvancedModelRenderer main;
    private final AdvancedModelRenderer cube_r1;
    private final AdvancedModelRenderer cube_r2;
    private final AdvancedModelRenderer cube_r3;
    private final AdvancedModelRenderer cube_r4;
    private final AdvancedModelRenderer cube_r5;
    private final AdvancedModelRenderer leg;
    private final AdvancedModelRenderer leg5;
    private final AdvancedModelRenderer leg2;
    private final AdvancedModelRenderer leg6;
    private final AdvancedModelRenderer leg3;
    private final AdvancedModelRenderer leg7;
    private final AdvancedModelRenderer leg4;
    private final AdvancedModelRenderer leg8;

    public ModelBohemoharpes() {
        this.textureWidth = 64;
        this.textureHeight = 64;

        this.main = new AdvancedModelRenderer(this);
        this.main.setRotationPoint(0.0F, 24.0F, 0.0F);
        this.main.cubeList.add(new ModelBox(main, 0, 8, -1.5F, -1.0F, 3.0F, 3, 1, 2, 0.0F, false));
        this.main.cubeList.add(new ModelBox(main, 0, 20, -1.0F, -0.95F, 4.5F, 2, 1, 1, 0.0F, false));
        this.main.cubeList.add(new ModelBox(main, 14, 12, -2.0F, -1.0F, 0.0F, 4, 1, 3, 0.0F, false));
        this.main.cubeList.add(new ModelBox(main, 0, 12, -2.5F, -1.0F, -4.0F, 5, 1, 4, 0.0F, false));
        this.main.cubeList.add(new ModelBox(main, 0, 0, -5.5F, -0.15F, -7.0F, 11, 0, 12, 0.0F, false));
        this.main.cubeList.add(new ModelBox(main, 6, 14, 2.5F, -1.15F, 1.0F, 0, 1, 3, 0.0F, false));
        this.main.cubeList.add(new ModelBox(main, 6, 8, -2.5F, -1.15F, 1.0F, 0, 1, 3, 0.0F, false));
        this.main.cubeList.add(new ModelBox(main, 0, 0, -1.5F, -1.5F, -2.85F, 3, 1, 3, 0.0F, false));
        this.main.cubeList.add(new ModelBox(main, 16, 16, -1.0F, -1.4F, 0.075F, 2, 1, 2, 0.0F, false));
        this.main.cubeList.add(new ModelBox(main, 10, 17, -0.5F, -1.275F, 2.05F, 1, 1, 2, 0.0F, false));

        this.cube_r1 = new AdvancedModelRenderer(this);
        this.cube_r1.setRotationPoint(0.0F, -1.0F, -2.125F);
        this.main.addChild(cube_r1);
        this.setRotateAngle(cube_r1, 0.1745F, 0.0F, 0.0F);
        this.cube_r1.cubeList.add(new ModelBox(cube_r1, 0, 4, -1.0F, -0.675F, -1.5F, 2, 1, 3, 0.0F, false));

        this.cube_r2 = new AdvancedModelRenderer(this);
        this.cube_r2.setRotationPoint(-2.5F, -0.65F, 1.0F);
        this.main.addChild(cube_r2);
        this.setRotateAngle(cube_r2, 0.0F, -0.4363F, 0.0F);
        this.cube_r2.cubeList.add(new ModelBox(cube_r2, 0, 8, 0.0F, -0.5F, -3.0F, 0, 1, 3, 0.0F, false));

        this.cube_r3 = new AdvancedModelRenderer(this);
        this.cube_r3.setRotationPoint(-2.5F, -0.65F, 2.0F);
        this.main.addChild(cube_r3);
        this.setRotateAngle(cube_r3, 0.0F, -0.4363F, 0.0F);
        this.cube_r3.cubeList.add(new ModelBox(cube_r3, 5, 4, -1.0F, 0.525F, -2.0F, 1, 0, 2, 0.0F, false));

        this.cube_r4 = new AdvancedModelRenderer(this);
        this.cube_r4.setRotationPoint(2.5F, -0.65F, 2.0F);
        this.main.addChild(cube_r4);
        this.setRotateAngle(cube_r4, 0.0F, 0.4363F, 0.0F);
        this.cube_r4.cubeList.add(new ModelBox(cube_r4, 7, 0, 0.0F, 0.525F, -2.0F, 1, 0, 2, 0.0F, false));

        this.cube_r5 = new AdvancedModelRenderer(this);
        this.cube_r5.setRotationPoint(2.5F, -0.65F, 1.0F);
        this.main.addChild(cube_r5);
        this.setRotateAngle(cube_r5, 0.0F, 0.4363F, 0.0F);
        this.cube_r5.cubeList.add(new ModelBox(cube_r5, 0, 14, 0.0F, -0.5F, -3.0F, 0, 1, 3, 0.0F, false));

        this.leg = new AdvancedModelRenderer(this);
        this.leg.setRotationPoint(0.5F, 0.0F, 0.5F);
        this.main.addChild(leg);
        this.setRotateAngle(leg, 0.0F, 0.0F, 0.1309F);
        this.leg.cubeList.add(new ModelBox(leg, 4, 19, 0.0F, 0.0F, -0.5F, 2, 0, 1, 0.0F, false));

        this.leg5 = new AdvancedModelRenderer(this);
        this.leg5.setRotationPoint(-0.5F, 0.0F, 0.5F);
        this.main.addChild(leg5);
        this.setRotateAngle(leg5, 0.0F, 0.0F, -0.1309F);
        this.leg5.cubeList.add(new ModelBox(leg5, 13, 17, -2.0F, 0.0F, -0.5F, 2, 0, 1, 0.0F, false));

        this.leg2 = new AdvancedModelRenderer(this);
        this.leg2.setRotationPoint(0.5F, 0.0F, 1.75F);
        this.main.addChild(leg2);
        this.setRotateAngle(leg2, 0.0F, 0.0F, 0.1309F);
        this.leg2.cubeList.add(new ModelBox(leg2, 0, 19, 0.0F, 0.0F, -0.5F, 2, 0, 1, 0.0F, false));

        this.leg6 = new AdvancedModelRenderer(this);
        this.leg6.setRotationPoint(-0.5F, 0.0F, 1.75F);
        this.main.addChild(leg6);
        this.setRotateAngle(leg6, 0.0F, 0.0F, -0.1309F);
        this.leg6.cubeList.add(new ModelBox(leg6, 7, 9, -2.0F, 0.0F, -0.5F, 2, 0, 1, 0.0F, false));

        this.leg3 = new AdvancedModelRenderer(this);
        this.leg3.setRotationPoint(0.5F, 0.0F, 3.0F);
        this.main.addChild(leg3);
        this.setRotateAngle(leg3, 0.0F, 0.0F, 0.1309F);
        this.leg3.cubeList.add(new ModelBox(leg3, 4, 18, 0.0F, 0.0F, -0.5F, 2, 0, 1, 0.0F, false));

        this.leg7 = new AdvancedModelRenderer(this);
        this.leg7.setRotationPoint(-0.5F, 0.0F, 3.0F);
        this.main.addChild(leg7);
        this.setRotateAngle(leg7, 0.0F, 0.0F, -0.1309F);
        this.leg7.cubeList.add(new ModelBox(leg7, 7, 8, -2.0F, 0.0F, -0.5F, 2, 0, 1, 0.0F, false));

        this.leg4 = new AdvancedModelRenderer(this);
        this.leg4.setRotationPoint(0.5F, 0.0F, 4.25F);
        this.main.addChild(leg4);
        this.setRotateAngle(leg4, 0.0F, 0.0F, 0.1309F);
        this.leg4.cubeList.add(new ModelBox(leg4, 0, 18, 0.0F, 0.0F, -0.5F, 2, 0, 1, 0.0F, false));

        this.leg8 = new AdvancedModelRenderer(this);
        this.leg8.setRotationPoint(-0.5F, 0.0F, 4.25F);
        this.main.addChild(leg8);
        this.setRotateAngle(leg8, 0.0F, 0.0F, -0.1309F);
        this.leg8.cubeList.add(new ModelBox(leg8, 6, 6, -2.0F, 0.0F, -0.5F, 2, 0, 1, 0.0F, false));

        updateDefaultPose();
    }

    @Override
    public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        this.main.render(f5);
    }
    public void renderStatic(float f) {
        //GlStateManager.pushMatrix();
        //GlStateManager.enableBlend();
        //GlStateManager.blendFunc(GlStateManager.SourceFactor.SRC_ALPHA, GlStateManager.DestFactor.ONE_MINUS_SRC_ALPHA);
        //GlStateManager.disableCull();
        //this.body.offsetZ = -0.1F;
        this.main.render(0.01F);
        //GlStateManager.enableCull();
        //GlStateManager.disableBlend();
        //GlStateManager.popMatrix();
    }
    @Override
    public void renderStaticBook(float f) {
        //Rotations, positions and sizing:
        this.main.offsetY = -1.5F;
        this.main.offsetX = -0.25F;
        this.main.offsetZ = 1.0F;
        this.main.rotateAngleY = (float)Math.toRadians(120);
        this.main.rotateAngleX = (float)Math.toRadians(1);
        this.main.rotateAngleZ = (float)Math.toRadians(0);
        this.main.scaleChildren = true;
        float scaler = 6.0F;
        this.main.setScale(scaler, scaler, scaler);
        //Start of pose:
        this.setRotateAngle(main, 0.6F, 3.8F, -0.2F);
        //End of pose, now render the model:
        this.main.render(f);
        //Reset rotations, positions and sizing:
        this.main.setScale(1.0F, 1.0F, 1.0F);
        this.main.scaleChildren = false;
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
        //this.main.offsetY = 1.05F;

        boolean isAtBottom = false;
        if (e.getPosition().getY() - 1 > 1) {
            BlockPos pos = new BlockPos(e.getPosition().getX(), e.getPosition().getY() - 1, e.getPosition().getZ());
            isAtBottom = ((e.isInsideOfMaterial(Material.WATER) || e.isInsideOfMaterial(Material.CORAL))
                    && ((e.world.getBlockState(pos)).getMaterial() != Material.WATER)
                    && ((double)e.getPosition().getY() + 0.334D) > e.posY);
        }

        AdvancedModelRenderer[] legsL = {this.leg, this.leg2, this.leg3, this.leg4};
        AdvancedModelRenderer[] legsR = {this.leg5, this.leg6, this.leg7, this.leg8};

        if (isAtBottom) {
            if (((EntityPrehistoricFloraBohemoharpes) e).getIsMoving()) {
                this.chainWave(legsL, 0.2F, 0.2F, -3, f2, 1);
                this.chainWave(legsR, 0.6F, 0.2F, -3, f2, 1);
                this.flap(leg, 0.5F, -0.5F, false, 0, -0.5F, f2, 0.3F);
                this.flap(leg5, 0.5F, 0.5F, false, 0, 0.5F, f2, 0.3F);
                this.flap(leg2, 0.5F, -0.5F, false, 1.0F, -0.5F, f2, 0.3F);
                this.flap(leg6, 0.5F, 0.5F, false, 1.0F, 0.5F, f2, 0.3F);
                this.flap(leg3, 0.5F, -0.5F, false, 2.0F, -0.5F, f2, 0.3F);
                this.flap(leg7, 0.5F, 0.5F, false, 2.0F, 0.5F, f2, 0.3F);
                this.flap(leg4, 0.5F, -0.5F, false, 3.0F, -0.5F, f2, 0.3F);
                this.flap(leg8, 0.5F, 0.5F, false, 3.0F, 0.5F, f2, 0.3F);
            }
            this.bob(main, 0.0F, 0.0F, false, f2, 1);
        }
        else {
            this.chainWave(legsL, 0.2F, 0.2F, -3, f2, 1);
            this.chainWave(legsR, 0.25F, 0.2F, -3, f2, 1);
            this.flap(leg, 0.2F, -0.5F, false, 0, -0.5F, f2, 0.3F);
            this.flap(leg5, 0.2F, 0.5F, false, 0, 0.5F, f2, 0.3F);
            this.flap(leg2, 0.2F, -0.5F, false, 1.0F, -0.5F, f2, 0.3F);
            this.flap(leg6, 0.2F, 0.5F, false, 1.0F, 0.5F, f2, 0.3F);
            this.flap(leg3, 0.2F, -0.5F, false, 2.0F, -0.5F, f2, 0.3F);
            this.flap(leg7, 0.2F, 0.5F, false, 2.0F, 0.5F, f2, 0.3F);
            this.flap(leg4, 0.2F, -0.5F, false, 3.0F, -0.5F, f2, 0.3F);
            this.flap(leg8, 0.2F, 0.5F, false, 3.0F, 0.5F, f2, 0.3F);
            this.bob(main, 0.2F, 0.2F, false, f2, 1);
        }


    }
}
