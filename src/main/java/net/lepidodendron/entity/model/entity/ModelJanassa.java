package net.lepidodendron.entity.model.entity;

import net.ilexiconn.llibrary.client.model.tools.AdvancedModelBase;
import net.ilexiconn.llibrary.client.model.tools.AdvancedModelRenderer;
import net.minecraft.block.material.Material;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLiving;
import net.minecraft.util.math.BlockPos;

public class ModelJanassa extends AdvancedModelBase {
    private final AdvancedModelRenderer body;
    private final AdvancedModelRenderer cube_r1;
    private final AdvancedModelRenderer cube_r2;
    private final AdvancedModelRenderer cube_r3;
    private final AdvancedModelRenderer cube_r4;
    private final AdvancedModelRenderer cube_r5;
    private final AdvancedModelRenderer cube_r6;
    private final AdvancedModelRenderer jawupper;
    private final AdvancedModelRenderer cube_r7;
    private final AdvancedModelRenderer jawlower;
    private final AdvancedModelRenderer cube_r8;
    private final AdvancedModelRenderer pectoralfinL;
    private final AdvancedModelRenderer pectoralfinR;
    private final AdvancedModelRenderer body2;
    private final AdvancedModelRenderer pelvicfinL;
    private final AdvancedModelRenderer pelvicfinR;
    private final AdvancedModelRenderer body3;
    private final AdvancedModelRenderer cube_r9;
    private final AdvancedModelRenderer body4;
    private final AdvancedModelRenderer body5;

    public ModelJanassa() {
        this.textureWidth = 64;
        this.textureHeight = 64;

        this.body = new AdvancedModelRenderer(this);
        this.body.setRotationPoint(0.0F, 23.0F, 0.0F);
        this.body.cubeList.add(new ModelBox(body, 21, 15, -3.0F, -1.0F, -5.1F, 6, 1, 13, 0.0F, false));
        this.body.cubeList.add(new ModelBox(body, 0, 29, -2.5F, -1.9F, -5.5F, 5, 1, 13, 0.0F, false));
        this.body.cubeList.add(new ModelBox(body, 23, 29, -1.49F, -2.8F, -4.25F, 3, 1, 11, 0.0F, false));
        this.body.cubeList.add(new ModelBox(body, 40, 29, -0.5F, -1.0F, -10.8F, 1, 1, 3, 0.0F, false));
        this.body.cubeList.add(new ModelBox(body, 0, 19, -2.0F, -1.01F, -6.0F, 4, 1, 1, 0.0F, false));
        this.body.cubeList.add(new ModelBox(body, 36, 41, -1.5F, -1.01F, -7.0F, 3, 1, 1, 0.0F, false));
        this.body.cubeList.add(new ModelBox(body, 0, 0, -1.0F, -1.01F, -7.5F, 2, 1, 1, 0.0F, false));

        this.cube_r1 = new AdvancedModelRenderer(this);
        this.cube_r1.setRotationPoint(0.0F, 0.2F, -0.45F);
        this.body.addChild(cube_r1);
        this.setRotateAngle(cube_r1, 0.2182F, 0.0F, -0.1745F);
        this.cube_r1.cubeList.add(new ModelBox(cube_r1, 0, 45, 1.0F, -3.5F, -5.5F, 1, 1, 1, 0.0F, false));

        this.cube_r2 = new AdvancedModelRenderer(this);
        this.cube_r2.setRotationPoint(0.0F, 0.2F, -0.45F);
        this.body.addChild(cube_r2);
        this.setRotateAngle(cube_r2, 0.2182F, 0.0F, 0.1745F);
        this.cube_r2.cubeList.add(new ModelBox(cube_r2, 0, 43, -2.0F, -3.5F, -5.5F, 1, 1, 1, 0.0F, false));

        this.cube_r3 = new AdvancedModelRenderer(this);
        this.cube_r3.setRotationPoint(0.0F, -1.0F, -8.6F);
        this.body.addChild(cube_r3);
        this.setRotateAngle(cube_r3, 0.3491F, 0.0F, 0.0F);
        this.cube_r3.cubeList.add(new ModelBox(cube_r3, 40, 36, -0.99F, 0.0F, 0.35F, 2, 1, 2, 0.0F, false));

        this.cube_r4 = new AdvancedModelRenderer(this);
        this.cube_r4.setRotationPoint(0.0F, -1.0F, -8.5F);
        this.body.addChild(cube_r4);
        this.setRotateAngle(cube_r4, 0.3491F, 0.0F, 0.0F);
        this.cube_r4.cubeList.add(new ModelBox(cube_r4, 23, 38, -1.51F, 0.775F, 2.15F, 3, 1, 1, 0.0F, false));
        this.cube_r4.cubeList.add(new ModelBox(cube_r4, 0, 33, -1.51F, -0.225F, 1.65F, 3, 1, 3, 0.0F, false));

        this.cube_r5 = new AdvancedModelRenderer(this);
        this.cube_r5.setRotationPoint(-3.0F, -1.125F, -5.0F);
        this.body.addChild(cube_r5);
        this.setRotateAngle(cube_r5, 0.0F, -0.6807F, 0.0F);
        this.cube_r5.cubeList.add(new ModelBox(cube_r5, 0, 37, -0.1F, 0.1F, -4.1F, 1, 1, 4, 0.0F, false));

        this.cube_r6 = new AdvancedModelRenderer(this);
        this.cube_r6.setRotationPoint(3.0F, -1.125F, -5.0F);
        this.body.addChild(cube_r6);
        this.setRotateAngle(cube_r6, 0.0F, 0.6807F, 0.0F);
        this.cube_r6.cubeList.add(new ModelBox(cube_r6, 40, 10, -0.9F, 0.11F, -4.1F, 1, 1, 4, 0.0F, false));

        this.jawupper = new AdvancedModelRenderer(this);
        this.jawupper.setRotationPoint(0.0F, 0.025F, -7.0F);
        this.body.addChild(jawupper);


        this.cube_r7 = new AdvancedModelRenderer(this);
        this.cube_r7.setRotationPoint(0.0F, 0.0F, -0.45F);
        this.jawupper.addChild(cube_r7);
        this.setRotateAngle(cube_r7, -0.0873F, 0.0F, 0.0F);
        this.cube_r7.cubeList.add(new ModelBox(cube_r7, 40, 33, -1.0F, -1.075F, 0.0F, 2, 1, 2, 0.0F, false));

        this.jawlower = new AdvancedModelRenderer(this);
        this.jawlower.setRotationPoint(0.0F, -0.1F, -4.45F);
        this.body.addChild(jawlower);


        this.cube_r8 = new AdvancedModelRenderer(this);
        this.cube_r8.setRotationPoint(0.0F, 0.025F, 0.0F);
        this.jawlower.addChild(cube_r8);
        this.setRotateAngle(cube_r8, 0.0873F, 0.0F, 0.0F);
        this.cube_r8.cubeList.add(new ModelBox(cube_r8, 0, 2, -0.99F, -0.915F, -0.9F, 2, 1, 1, 0.0F, false));

        this.pectoralfinL = new AdvancedModelRenderer(this);
        this.pectoralfinL.setRotationPoint(1.0F, 0.0F, -1.0F);
        this.body.addChild(pectoralfinL);
        this.setRotateAngle(pectoralfinL, 0.0F, 0.0F, 0.0873F);
        this.pectoralfinL.cubeList.add(new ModelBox(pectoralfinL, 16, 43, 0.0F, 0.02F, -6.6F, 10, 0, 14, 0.0F, false));
        this.pectoralfinL.cubeList.add(new ModelBox(pectoralfinL, 0, 14, 0.0F, 0.01F, -6.6F, 10, 0, 14, 0.0F, false));

        this.pectoralfinR = new AdvancedModelRenderer(this);
        this.pectoralfinR.setRotationPoint(-1.0F, 0.0F, -1.0F);
        this.body.addChild(pectoralfinR);
        this.setRotateAngle(pectoralfinR, 0.0F, 0.0F, -0.0873F);
        this.pectoralfinR.cubeList.add(new ModelBox(pectoralfinR, -4, 43, -10.0F, 0.02F, -6.6F, 10, 0, 14, 0.0F, false));
        this.pectoralfinR.cubeList.add(new ModelBox(pectoralfinR, 0, 0, -10.0F, 0.01F, -6.6F, 10, 0, 14, 0.0F, false));

        this.body2 = new AdvancedModelRenderer(this);
        this.body2.setRotationPoint(0.0F, -1.75F, 6.75F);
        this.body.addChild(body2);
        this.body2.cubeList.add(new ModelBox(body2, 34, 0, -2.0F, -0.4F, -1.0F, 4, 2, 7, 0.0F, false));
        this.body2.cubeList.add(new ModelBox(body2, 0, 21, -1.0F, -0.75F, -1.01F, 2, 1, 7, 0.0F, false));
        this.body2.cubeList.add(new ModelBox(body2, 0, 43, -0.5F, -0.76F, -1.01F, 1, 0, 7, 0.0F, false));

        this.pelvicfinL = new AdvancedModelRenderer(this);
        this.pelvicfinL.setRotationPoint(1.55F, 1.6F, 2.75F);
        this.body2.addChild(pelvicfinL);
        this.setRotateAngle(pelvicfinL, -0.0873F, -0.2618F, 0.2618F);
        this.pelvicfinL.cubeList.add(new ModelBox(pelvicfinL, 0, 6, 0.0F, 0.01F, -1.1F, 4, 0, 6, 0.0F, false));
        this.pelvicfinL.cubeList.add(new ModelBox(pelvicfinL, 46, 9, 0.0F, 0.02F, -1.1F, 4, 0, 6, 0.0F, false));

        this.pelvicfinR = new AdvancedModelRenderer(this);
        this.pelvicfinR.setRotationPoint(-1.55F, 1.6F, 2.75F);
        this.body2.addChild(pelvicfinR);
        this.setRotateAngle(pelvicfinR, -0.0873F, 0.2618F, -0.2618F);
        this.pelvicfinR.cubeList.add(new ModelBox(pelvicfinR, 0, 0, -4.0F, 0.01F, -1.1F, 4, 0, 6, 0.0F, false));
        this.pelvicfinR.cubeList.add(new ModelBox(pelvicfinR, 46, 15, -4.0F, 0.02F, -1.1F, 4, 0, 6, 0.0F, false));

        this.body3 = new AdvancedModelRenderer(this);
        this.body3.setRotationPoint(0.0F, 0.5F, 6.0F);
        this.body2.addChild(body3);
        this.body3.cubeList.add(new ModelBox(body3, 0, 12, -1.01F, -1.0F, -1.0F, 2, 2, 5, 0.0F, false));

        this.cube_r9 = new AdvancedModelRenderer(this);
        this.cube_r9.setRotationPoint(0.0F, -1.0F, 0.0F);
        this.body3.addChild(cube_r9);
        this.setRotateAngle(cube_r9, -0.1745F, 0.0F, 0.0F);
        this.cube_r9.cubeList.add(new ModelBox(cube_r9, 23, 31, -0.01F, -2.5F, 0.0F, 0, 3, 4, 0.0F, false));

        this.body4 = new AdvancedModelRenderer(this);
        this.body4.setRotationPoint(0.0F, 0.0F, 4.0F);
        this.body3.addChild(body4);
        this.body4.cubeList.add(new ModelBox(body4, 23, 29, -0.5F, -0.99F, 0.0F, 1, 2, 4, 0.0F, false));

        this.body5 = new AdvancedModelRenderer(this);
        this.body5.setRotationPoint(0.0F, 0.0F, 4.0F);
        this.body4.addChild(body5);
        this.body5.cubeList.add(new ModelBox(body5, 0, 24, 0.0F, -2.0F, 1.0F, 0, 4, 5, 0.0F, false));
        this.body5.cubeList.add(new ModelBox(body5, 34, 9, -0.49F, -0.5F, 0.0F, 1, 1, 4, 0.0F, false));

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
        AdvancedModelRenderer[] fishTail = {this.body2, this.body3, this.body4, this.body5};

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
            this.flap(pectoralfinL, (float) (speed * 0.75), 0.12F, true, 0, 0, f2, 1);
            this.swing(pectoralfinL, (float) (speed * 0.75), 0.12F, true, 0, 0, f2, 1);
            this.flap(pectoralfinR, (float) (speed * 0.75), -0.12F, true, 0, 0, f2, 1);
            this.swing(pectoralfinR, (float) (speed * 0.75), 0.12F, true, 0, 0, f2, 1);
            this.flap(pelvicfinL, (float) (speed * 0.75), 0.07F, true, 0, 0, f2, 1);
            this.swing(pelvicfinL, (float) (speed * 0.75), 0.07F, true, 0, 0, f2, 1);
            this.flap(pelvicfinR, (float) (speed * 0.75), -0.07F, true, 0, 0, f2, 1);
            this.swing(pelvicfinR, (float) (speed * 0.75), 0.07F, true, 0, 0, f2, 1);

            if (!e.isInWater()) {
                //this.Bodyfront.rotateAngleZ = (float) Math.toRadians(90);
                this.body.offsetY = 1.0F;
                this.bob(body, -speed, 2F, false, f2, 1);
                this.chainWave(fishTail, speed, 0.2F, -3, f2, 1);
            }
        }
    }
}
