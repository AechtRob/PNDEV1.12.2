package net.lepidodendron.entity.model.entity;

import net.ilexiconn.llibrary.client.model.tools.AdvancedModelBase;
import net.ilexiconn.llibrary.client.model.tools.AdvancedModelRenderer;
import net.minecraft.block.material.Material;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLiving;
import net.minecraft.util.math.BlockPos;

public class ModelSquatinactis extends AdvancedModelBase {
    private final AdvancedModelRenderer body;
    private final AdvancedModelRenderer cube_r1;
    private final AdvancedModelRenderer cube_r2;
    private final AdvancedModelRenderer cube_r3;
    private final AdvancedModelRenderer cube_r4;
    private final AdvancedModelRenderer cube_r5;
    private final AdvancedModelRenderer jaw;
    private final AdvancedModelRenderer finL;
    private final AdvancedModelRenderer finR;
    private final AdvancedModelRenderer body2;
    private final AdvancedModelRenderer body3;
    private final AdvancedModelRenderer body4;
    private final AdvancedModelRenderer body5;
    private final AdvancedModelRenderer body6;
    private final AdvancedModelRenderer cube_r6;
    private final AdvancedModelRenderer body7;
    private final AdvancedModelRenderer tailfin;

    public ModelSquatinactis() {
        this.textureWidth = 64;
        this.textureHeight = 64;

        this.body = new AdvancedModelRenderer(this);
        this.body.setRotationPoint(0.0F, 24.0F, 0.0F);
        this.body.cubeList.add(new ModelBox(body, 14, 28, -2.5F, -2.35F, -9.0F, 5, 2, 3, 0.0F, false));
        this.body.cubeList.add(new ModelBox(body, 0, 14, -2.5F, -3.0F, -3.0F, 5, 4, 7, 0.0F, false));
        this.body.cubeList.add(new ModelBox(body, 21, 22, -2.5F, -3.0F, -6.0F, 5, 3, 3, 0.0F, false));

        this.cube_r1 = new AdvancedModelRenderer(this);
        this.cube_r1.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.body.addChild(cube_r1);
        this.setRotateAngle(cube_r1, 0.0F, -0.0873F, 0.0F);
        this.cube_r1.cubeList.add(new ModelBox(cube_r1, 19, 33, -3.1F, -2.6F, -6.15F, 1, 3, 4, 0.0F, false));

        this.cube_r2 = new AdvancedModelRenderer(this);
        this.cube_r2.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.body.addChild(cube_r2);
        this.setRotateAngle(cube_r2, 0.0F, 0.0873F, 0.0F);
        this.cube_r2.cubeList.add(new ModelBox(cube_r2, 29, 34, 2.1F, -2.6F, -6.15F, 1, 3, 4, 0.0F, false));

        this.cube_r3 = new AdvancedModelRenderer(this);
        this.cube_r3.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.body.addChild(cube_r3);
        this.setRotateAngle(cube_r3, -0.0873F, 0.0F, 0.0F);
        this.cube_r3.cubeList.add(new ModelBox(cube_r3, 29, 14, -2.49F, 0.25F, -5.91F, 5, 1, 3, 0.0F, false));

        this.cube_r4 = new AdvancedModelRenderer(this);
        this.cube_r4.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.body.addChild(cube_r4);
        this.setRotateAngle(cube_r4, 0.1309F, 0.0F, 0.0F);
        this.cube_r4.cubeList.add(new ModelBox(cube_r4, 35, 36, -2.49F, -3.65F, -6.6F, 5, 1, 1, 0.0F, false));
        this.cube_r4.cubeList.add(new ModelBox(cube_r4, 31, 19, -2.99F, -3.65F, -8.6F, 6, 1, 2, 0.0F, false));

        this.cube_r5 = new AdvancedModelRenderer(this);
        this.cube_r5.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.body.addChild(cube_r5);
        this.setRotateAngle(cube_r5, 0.1745F, 0.0F, 0.0F);
        this.cube_r5.cubeList.add(new ModelBox(cube_r5, 9, 25, -2.49F, -3.925F, -8.85F, 5, 2, 1, 0.0F, false));

        this.jaw = new AdvancedModelRenderer(this);
        this.jaw.setRotationPoint(0.0F, 0.0F, -6.0F);
        this.body.addChild(jaw);
        this.jaw.cubeList.add(new ModelBox(jaw, 36, 0, -1.5F, -0.35F, -2.75F, 3, 1, 3, 0.0F, false));

        this.finL = new AdvancedModelRenderer(this);
        this.finL.setRotationPoint(2.5F, -1.0F, -2.0F);
        this.body.addChild(finL);
        this.finL.cubeList.add(new ModelBox(finL, 0, 7, 0.0F, 0.0F, -1.0F, 10, 0, 7, 0.0F, false));

        this.finR = new AdvancedModelRenderer(this);
        this.finR.setRotationPoint(-2.5F, -1.0F, -2.0F);
        this.body.addChild(finR);
        this.finR.cubeList.add(new ModelBox(finR, 0, 0, -10.0F, 0.0F, -1.0F, 10, 0, 7, 0.0F, false));

        this.body2 = new AdvancedModelRenderer(this);
        this.body2.setRotationPoint(0.0F, -1.0F, 4.0F);
        this.body.addChild(body2);
        this.body2.cubeList.add(new ModelBox(body2, 17, 14, -2.0F, -1.9F, 0.0F, 4, 3, 4, 0.0F, false));
        this.body2.cubeList.add(new ModelBox(body2, 26, 29, -1.5F, 0.85F, -0.01F, 3, 1, 4, 0.0F, false));

        this.body3 = new AdvancedModelRenderer(this);
        this.body3.setRotationPoint(0.0F, -0.5F, 4.0F);
        this.body2.addChild(body3);
        this.body3.cubeList.add(new ModelBox(body3, 7, 33, -1.0F, 1.1F, -0.01F, 2, 1, 4, 0.0F, false));
        this.body3.cubeList.add(new ModelBox(body3, 27, 7, -1.5F, -1.35F, 0.0F, 3, 3, 4, 0.0F, false));

        this.body4 = new AdvancedModelRenderer(this);
        this.body4.setRotationPoint(0.0F, 0.25F, 4.0F);
        this.body3.addChild(body4);
        this.body4.cubeList.add(new ModelBox(body4, 0, 25, -1.0F, -1.5F, 0.0F, 2, 3, 5, 0.0F, false));

        this.body5 = new AdvancedModelRenderer(this);
        this.body5.setRotationPoint(0.0F, -0.25F, 5.0F);
        this.body4.addChild(body5);
        this.body5.cubeList.add(new ModelBox(body5, 27, 0, -1.0F, -1.15F, 0.0F, 2, 2, 5, 0.0F, false));
        this.body5.cubeList.add(new ModelBox(body5, 32, 23, -0.5F, 0.35F, -0.01F, 1, 1, 5, 0.0F, false));

        this.body6 = new AdvancedModelRenderer(this);
        this.body6.setRotationPoint(0.0F, -0.25F, 5.0F);
        this.body5.addChild(body6);
        this.body6.cubeList.add(new ModelBox(body6, 0, 33, -0.5F, -0.8F, 0.0F, 1, 2, 5, 0.0F, false));

        this.cube_r6 = new AdvancedModelRenderer(this);
        this.cube_r6.setRotationPoint(0.0F, -1.0F, 0.0F);
        this.body6.addChild(cube_r6);
        this.setRotateAngle(cube_r6, -0.5236F, 0.0F, 0.0F);
        this.cube_r6.cubeList.add(new ModelBox(cube_r6, 0, 0, 0.0F, -2.8F, 0.0F, 0, 3, 1, 0.0F, false));

        this.body7 = new AdvancedModelRenderer(this);
        this.body7.setRotationPoint(0.0F, 0.0F, 5.0F);
        this.body6.addChild(body7);
        this.body7.cubeList.add(new ModelBox(body7, 36, 30, -0.5F, -0.79F, 0.0F, 1, 2, 4, 0.0F, false));

        this.tailfin = new AdvancedModelRenderer(this);
        this.tailfin.setRotationPoint(0.0F, 0.0F, 4.0F);
        this.body7.addChild(tailfin);
        this.tailfin.cubeList.add(new ModelBox(tailfin, 9, 24, 0.0F, -0.8F, 0.0F, 0, 2, 4, 0.0F, false));

        updateDefaultPose();
    }

    @Override
    public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        this.body.render(f5 * 0.29F);
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
        this.body.offsetY = 1.05F;

        //this.Tailfin.setScale(1.1F, 1.1F, 1.1F);
        AdvancedModelRenderer[] fishTail = {this.body4, this.body5, this.body6};

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
            this.chainWave(fishTail, speed, 0.05F, -3, f2, 1);
            this.chainSwing(fishTail, speed, taildegree, -3, f2, 1);
            this.swing(body, speed, 0.3F, true, 0, 0, f2, 1);
            this.walk(jaw, (float) (speed * 0.75), -0.5F, true, 0, 0, f2, 1);
            this.flap(finL, (float) (speed * 0.75), 0.12F, true, 0, 0, f2, 1);
            this.swing(finL, (float) (speed * 0.75), 0.12F, true, 0, 0, f2, 1);
            this.flap(finR, (float) (speed * 0.75), -0.12F, true, 0, 0, f2, 1);
            this.swing(finR, (float) (speed * 0.75), 0.12F, true, 0, 0, f2, 1);
            if (!e.isInWater()) {
                //this.Bodyfront.rotateAngleZ = (float) Math.toRadians(90);
                this.body.offsetY = 1.0F;
                this.bob(body, -speed, 2F, false, f2, 1);
                this.chainWave(fishTail, speed, 0.2F, -3, f2, 1);
            }
        }
    }
}
