package net.lepidodendron.entity.model.entity;

import net.ilexiconn.llibrary.client.model.tools.AdvancedModelRenderer;
import net.lepidodendron.entity.model.ModelBasePalaeopedia;
import net.minecraft.block.material.Material;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLiving;
import net.minecraft.util.math.BlockPos;

public class ModelMicrobrachius extends ModelBasePalaeopedia {
    private final AdvancedModelRenderer Body;
    private final AdvancedModelRenderer cube_r1;
    private final AdvancedModelRenderer cube_r2;
    private final AdvancedModelRenderer cube_r3;
    private final AdvancedModelRenderer cube_r4;
    private final AdvancedModelRenderer FinR1;
    private final AdvancedModelRenderer FinR2;
    private final AdvancedModelRenderer FinL1;
    private final AdvancedModelRenderer FinL2;
    private final AdvancedModelRenderer Body2;
    private final AdvancedModelRenderer Body3;
    private final AdvancedModelRenderer Body4;
    private final AdvancedModelRenderer cube_r5;
    private final AdvancedModelRenderer Body5;
    private final AdvancedModelRenderer jaw;
    private final AdvancedModelRenderer cube_r6;

    public ModelMicrobrachius() {
        this.textureWidth = 32;
        this.textureHeight = 32;

        this.Body = new AdvancedModelRenderer(this);
        this.Body.setRotationPoint(0.0F, 23.5F, -1.0F);
        this.Body.cubeList.add(new ModelBox(Body, 0, 7, -3.0F, 0.45F, 0.5F, 6, 0, 3, 0.0F, false));
        this.Body.cubeList.add(new ModelBox(Body, 0, 0, -2.5F, -1.5F, -4.0F, 5, 2, 5, 0.0F, false));
        this.Body.cubeList.add(new ModelBox(Body, 17, 10, -1.0F, -1.95F, 0.975F, 2, 1, 1, 0.0F, false));
        this.Body.cubeList.add(new ModelBox(Body, 12, 22, -1.5F, -0.5F, 0.975F, 3, 1, 1, -0.01F, false));

        this.cube_r1 = new AdvancedModelRenderer(this);
        this.cube_r1.setRotationPoint(2.5F, -1.5F, -1.5F);
        this.Body.addChild(cube_r1);
        this.setRotateAngle(cube_r1, 0.0F, 0.0F, 0.3054F);
        this.cube_r1.cubeList.add(new ModelBox(cube_r1, 10, 7, -2.63F, 0.0F, -2.5F, 1, 1, 5, -0.015F, true));
        this.cube_r1.cubeList.add(new ModelBox(cube_r1, 0, 10, -2.0F, 0.0F, -2.5F, 2, 1, 5, -0.01F, true));

        this.cube_r2 = new AdvancedModelRenderer(this);
        this.cube_r2.setRotationPoint(-2.5F, -1.5F, -1.5F);
        this.Body.addChild(cube_r2);
        this.setRotateAngle(cube_r2, 0.0F, 0.0F, -0.3054F);
        this.cube_r2.cubeList.add(new ModelBox(cube_r2, 10, 7, 1.63F, 0.0F, -2.5F, 1, 1, 5, -0.018F, false));
        this.cube_r2.cubeList.add(new ModelBox(cube_r2, 0, 10, 0.0F, 0.0F, -2.5F, 2, 1, 5, -0.01F, false));

        this.cube_r3 = new AdvancedModelRenderer(this);
        this.cube_r3.setRotationPoint(0.0F, -0.5F, -6.0F);
        this.Body.addChild(cube_r3);
        this.setRotateAngle(cube_r3, 0.5323F, 0.0F, 0.0F);
        this.cube_r3.cubeList.add(new ModelBox(cube_r3, 20, 5, -2.0F, 0.0F, 1.35F, 4, 1, 1, -0.02F, false));
        this.cube_r3.cubeList.add(new ModelBox(cube_r3, 0, 0, 0.25F, 0.0F, 1.0F, 1, 0, 1, 0.0F, true));
        this.cube_r3.cubeList.add(new ModelBox(cube_r3, 0, 0, -1.25F, 0.0F, 1.0F, 1, 0, 1, 0.0F, false));
        this.cube_r3.cubeList.add(new ModelBox(cube_r3, 17, 7, -2.0F, 0.0F, 0.05F, 4, 1, 2, -0.01F, false));

        this.cube_r4 = new AdvancedModelRenderer(this);
        this.cube_r4.setRotationPoint(0.0F, 0.5F, -6.0F);
        this.Body.addChild(cube_r4);
        this.setRotateAngle(cube_r4, 0.0436F, 0.0F, 0.0F);
        this.cube_r4.cubeList.add(new ModelBox(cube_r4, 10, 18, -2.0F, -1.0F, 0.1F, 4, 1, 2, 0.0F, false));

        this.FinR1 = new AdvancedModelRenderer(this);
        this.FinR1.setRotationPoint(-2.5F, 0.0F, -3.9F);
        this.Body.addChild(FinR1);
        this.setRotateAngle(FinR1, 0.0F, -0.6109F, 0.0F);
        this.FinR1.cubeList.add(new ModelBox(FinR1, 6, 21, 0.0F, -0.4F, 0.0F, 1, 1, 2, 0.0F, false));

        this.FinR2 = new AdvancedModelRenderer(this);
        this.FinR2.setRotationPoint(0.5F, 0.0F, 2.05F);
        this.FinR1.addChild(FinR2);
        this.setRotateAngle(FinR2, 0.0F, 0.2618F, 0.0F);
        this.FinR2.cubeList.add(new ModelBox(FinR2, 21, 0, -0.375F, -0.4F, -0.55F, 1, 1, 2, -0.01F, false));

        this.FinL1 = new AdvancedModelRenderer(this);
        this.FinL1.setRotationPoint(2.5F, 0.0F, -3.9F);
        this.Body.addChild(FinL1);
        this.setRotateAngle(FinL1, 0.0F, 0.6109F, 0.0F);
        this.FinL1.cubeList.add(new ModelBox(FinL1, 6, 21, -1.0F, -0.4F, 0.0F, 1, 1, 2, 0.0F, true));

        this.FinL2 = new AdvancedModelRenderer(this);
        this.FinL2.setRotationPoint(-0.5F, 0.0F, 2.05F);
        this.FinL1.addChild(FinL2);
        this.setRotateAngle(FinL2, 0.0F, -0.2618F, 0.0F);
        this.FinL2.cubeList.add(new ModelBox(FinL2, 21, 0, -0.625F, -0.4F, -0.55F, 1, 1, 2, -0.01F, true));

        this.Body2 = new AdvancedModelRenderer(this);
        this.Body2.setRotationPoint(0.0F, -0.75F, 1.0F);
        this.Body.addChild(Body2);
        this.Body2.cubeList.add(new ModelBox(Body2, 11, 13, -1.5F, -0.95F, -0.5F, 3, 2, 3, 0.0F, false));

        this.Body3 = new AdvancedModelRenderer(this);
        this.Body3.setRotationPoint(0.0F, 0.0F, 2.5F);
        this.Body2.addChild(Body3);
        this.Body3.cubeList.add(new ModelBox(Body3, 0, 16, -1.0F, -0.95F, -0.5F, 2, 2, 3, -0.01F, false));
        this.Body3.cubeList.add(new ModelBox(Body3, 0, 0, 0.0F, -2.45F, 0.0F, 0, 2, 2, 0.0F, false));

        this.Body4 = new AdvancedModelRenderer(this);
        this.Body4.setRotationPoint(0.0F, -0.25F, 2.5F);
        this.Body3.addChild(Body4);
        this.Body4.cubeList.add(new ModelBox(Body4, 20, 10, -0.5F, -0.45F, -0.5F, 1, 1, 3, 0.0F, false));

        this.cube_r5 = new AdvancedModelRenderer(this);
        this.cube_r5.setRotationPoint(0.0F, 1.0F, 0.0F);
        this.Body4.addChild(cube_r5);
        this.setRotateAngle(cube_r5, 0.1047F, 0.0F, 0.0F);
        this.cube_r5.cubeList.add(new ModelBox(cube_r5, 19, 18, -0.5F, -0.85F, -0.5F, 1, 1, 3, -0.01F, false));

        this.Body5 = new AdvancedModelRenderer(this);
        this.Body5.setRotationPoint(0.0F, 0.0F, 2.5F);
        this.Body4.addChild(Body5);
        this.Body5.cubeList.add(new ModelBox(Body5, 15, 0, -0.5F, -0.3F, -0.25F, 1, 1, 4, -0.02F, false));
        this.Body5.cubeList.add(new ModelBox(Body5, 0, 17, 0.0F, -0.2F, 1.5F, 0, 2, 4, 0.0F, false));

        this.jaw = new AdvancedModelRenderer(this);
        this.jaw.setRotationPoint(0.0F, 0.5F, -4.0F);
        this.Body.addChild(jaw);
        this.setRotateAngle(jaw, -0.0873F, 0.0F, 0.0F);


        this.cube_r6 = new AdvancedModelRenderer(this);
        this.cube_r6.setRotationPoint(0.0F, 0.0F, -2.1F);
        this.jaw.addChild(cube_r6);
        this.setRotateAngle(cube_r6, 0.0436F, 0.0F, 0.0F);
        this.cube_r6.cubeList.add(new ModelBox(cube_r6, 9, 10, -1.0F, -0.9F, 1.1F, 2, 1, 1, 0.0F, false));

        updateDefaultPose();
    }

    @Override
    public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        this.Body.render(f5);
    }
    public void renderStaticWall(float f) {
        this.Body.rotateAngleX = (float) Math.toRadians(90);
        this.Body.rotateAngleZ = (float) Math.toRadians(90);
        this.Body.offsetY = -0.23F;
        this.Body.offsetX = -0.04F;
        this.Body.render(0.01F);
        resetToDefaultPose();
    }
    public void renderStaticFloor(float f) {
        this.setRotateAngle(Body, 0.0F, (float) Math.toRadians(90), 0.0F);
        this.setRotateAngle(cube_r1, 0.0F, 0.0F, 0.3054F);
        this.setRotateAngle(cube_r2, 0.0F, 0.0F, -0.3054F);
        this.setRotateAngle(cube_r3, 0.5323F, 0.0F, 0.0F);
        this.setRotateAngle(cube_r4, 0.0436F, 0.0F, 0.0F);
        this.setRotateAngle(FinR1, 0.4363F, -0.7418F, 0.0F);
        this.setRotateAngle(FinR2, -0.3054F, 0.7854F, 0.0F);
        this.setRotateAngle(FinL1, 0.0F, 0.6109F, 0.0F);
        this.setRotateAngle(FinL2, 0.0F, -0.2618F, 0.0F);
        this.setRotateAngle(Body2, 0.0F, 0.1309F, 0.0F);
        this.setRotateAngle(Body3, 0.0F, 0.2182F, 0.0F);
        this.setRotateAngle(Body4, 0.0F, 0.2182F, 0.0F);
        this.setRotateAngle(cube_r5, 0.1047F, 0.0F, 0.0F);
        this.setRotateAngle(Body5, 0.0F, 0.3054F, 0.0F);
        this.setRotateAngle(jaw, -0.0873F, 0.0F, 0.0F);
        this.setRotateAngle(cube_r6, 0.0436F, 0.0F, 0.0F);
        this.Body.offsetZ = 0.01F;
        this.Body.render(0.01F);
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
        this.Body.offsetY = -0.08F;

        //this.Tailfin.setScale(1.1F, 1.1F, 1.1F);
        AdvancedModelRenderer[] fishTail = {this.Body2, this.Body3, this.Body4, this.Body5};

        float speed = 0.4F;
        float taildegree = 0.35F;

        if (!e.isInWater()) {
            speed = 0.6F;
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
            this.chainWave(fishTail, speed, 0.05F, -3, f2, 1);
            this.chainSwing(fishTail, speed, taildegree, -3, f2, 1);
            this.swing(Body, speed, 0.3F, true, 0, 0, f2, 1);


            if (!e.isInWater()) {
                //this.Bodyfront.rotateAngleZ = (float) Math.toRadians(90);
                this.bob(Body, -speed, 2F, false, f2, 1);
                this.Body.offsetY = 0.08F;
                this.chainWave(fishTail, speed, 0.2F, -3, f2, 1);
            }
        }
    }
}
