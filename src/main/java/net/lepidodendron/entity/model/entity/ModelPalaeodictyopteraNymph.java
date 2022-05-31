package net.lepidodendron.entity.model.entity;

import net.ilexiconn.llibrary.client.model.tools.AdvancedModelBase;
import net.ilexiconn.llibrary.client.model.tools.AdvancedModelRenderer;
import net.minecraft.block.material.Material;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLiving;
import net.minecraft.util.math.BlockPos;

public class ModelPalaeodictyopteraNymph extends AdvancedModelBase {
    private final AdvancedModelRenderer body;
    private final AdvancedModelRenderer mouthpart;
    private final AdvancedModelRenderer body2;
    private final AdvancedModelRenderer body3;
    private final AdvancedModelRenderer body4;
    private final AdvancedModelRenderer body5;
    private final AdvancedModelRenderer legL;
    private final AdvancedModelRenderer legL2;
    private final AdvancedModelRenderer legL3;
    private final AdvancedModelRenderer legR;
    private final AdvancedModelRenderer legR2;
    private final AdvancedModelRenderer legR3;

    public ModelPalaeodictyopteraNymph() {
        this.textureWidth = 32;
        this.textureHeight = 32;

        this.body = new AdvancedModelRenderer(this);
        this.body.setRotationPoint(0.0F, 24.0F, 0.0F);
        this.body.cubeList.add(new ModelBox(body, 0, 0, -4.5F, -0.6F, -4.0F, 9, 0, 3, 0.0F, false));
        this.body.cubeList.add(new ModelBox(body, 18, 7, -2.0F, -0.75F, -9.0F, 4, 0, 1, 0.0F, false));
        this.body.cubeList.add(new ModelBox(body, 0, 3, -4.5F, -0.75F, -6.0F, 9, 0, 3, 0.0F, false));
        this.body.cubeList.add(new ModelBox(body, 9, 11, -3.5F, -0.75F, -8.0F, 7, 0, 2, 0.0F, false));
        this.body.cubeList.add(new ModelBox(body, 0, 9, -1.5F, -1.0F, -7.0F, 3, 1, 5, 0.0F, false));
        this.body.cubeList.add(new ModelBox(body, 11, 19, -1.5F, -1.0F, -8.0F, 3, 1, 1, 0.0F, false));

        this.mouthpart = new AdvancedModelRenderer(this);
        this.mouthpart.setRotationPoint(0.0F, -0.5F, -7.5F);
        this.body.addChild(mouthpart);
        this.setRotateAngle(mouthpart, -0.7854F, 0.0F, 0.0F);
        this.mouthpart.cubeList.add(new ModelBox(mouthpart, 0, 0, 0.0F, 0.0F, -0.5F, 0, 2, 1, 0.0F, false));

        this.body2 = new AdvancedModelRenderer(this);
        this.body2.setRotationPoint(0.0F, -0.5F, -2.0F);
        this.body.addChild(body2);
        this.body2.cubeList.add(new ModelBox(body2, 0, 6, -4.0F, 0.05F, 0.0F, 8, 0, 3, 0.0F, false));
        this.body2.cubeList.add(new ModelBox(body2, 0, 15, -2.0F, -0.5F, 0.0F, 4, 1, 3, 0.0F, false));

        this.body3 = new AdvancedModelRenderer(this);
        this.body3.setRotationPoint(0.0F, 0.0F, 3.0F);
        this.body2.addChild(body3);
        this.body3.cubeList.add(new ModelBox(body3, 14, 15, -1.5F, -0.49F, 0.0F, 3, 1, 3, 0.0F, false));
        this.body3.cubeList.add(new ModelBox(body3, 9, 9, -3.5F, 0.06F, 0.0F, 7, 0, 2, 0.0F, false));
        this.body3.cubeList.add(new ModelBox(body3, 15, 13, -3.0F, 0.07F, 2.0F, 6, 0, 1, 0.0F, false));

        this.body4 = new AdvancedModelRenderer(this);
        this.body4.setRotationPoint(0.0F, 0.0F, 3.0F);
        this.body3.addChild(body4);
        this.body4.cubeList.add(new ModelBox(body4, 5, 19, -1.0F, -0.48F, 0.0F, 2, 1, 2, 0.0F, false));
        this.body4.cubeList.add(new ModelBox(body4, 15, 14, -3.0F, 0.08F, 0.0F, 6, 0, 1, 0.0F, false));
        this.body4.cubeList.add(new ModelBox(body4, 18, 6, -2.5F, 0.09F, 1.0F, 5, 0, 1, 0.0F, false));

        this.body5 = new AdvancedModelRenderer(this);
        this.body5.setRotationPoint(0.0F, 0.0F, 2.0F);
        this.body4.addChild(body5);
        this.body5.cubeList.add(new ModelBox(body5, 0, 19, -0.5F, -0.47F, 0.0F, 1, 1, 3, 0.0F, false));
        this.body5.cubeList.add(new ModelBox(body5, 8, 15, -1.0F, 0.15F, 0.0F, 2, 0, 3, 0.0F, false));

        this.legL = new AdvancedModelRenderer(this);
        this.legL.setRotationPoint(1.5F, 0.0F, -6.5F);
        this.body.addChild(legL);
        this.legL.cubeList.add(new ModelBox(legL, 21, 0, 0.0F, -0.5F, 0.0F, 3, 2, 0, 0.0F, false));

        this.legL2 = new AdvancedModelRenderer(this);
        this.legL2.setRotationPoint(1.5F, 0.0F, -5.0F);
        this.body.addChild(legL2);
        this.legL2.cubeList.add(new ModelBox(legL2, 21, 0, 0.0F, -0.5F, 0.0F, 3, 2, 0, 0.0F, false));

        this.legL3 = new AdvancedModelRenderer(this);
        this.legL3.setRotationPoint(1.5F, 0.0F, -3.0F);
        this.body.addChild(legL3);
        this.legL3.cubeList.add(new ModelBox(legL3, 21, 0, 0.0F, -0.5F, 0.0F, 3, 2, 0, 0.0F, false));

        this.legR = new AdvancedModelRenderer(this);
        this.legR.setRotationPoint(-1.5F, 0.0F, -6.5F);
        this.body.addChild(legR);
        this.legR.cubeList.add(new ModelBox(legR, 19, 19, -3.0F, -0.5F, 0.0F, 3, 2, 0, 0.0F, false));

        this.legR2 = new AdvancedModelRenderer(this);
        this.legR2.setRotationPoint(-1.5F, 0.0F, -5.0F);
        this.body.addChild(legR2);
        this.legR2.cubeList.add(new ModelBox(legR2, 19, 19, -3.0F, -0.5F, 0.0F, 3, 2, 0, 0.0F, false));

        this.legR3 = new AdvancedModelRenderer(this);
        this.legR3.setRotationPoint(-1.5F, 0.0F, -3.0F);
        this.body.addChild(legR3);
        this.legR3.cubeList.add(new ModelBox(legR3, 19, 19, -3.0F, -0.5F, 0.0F, 3, 2, 0, 0.0F, false));

        updateDefaultPose();
    }

    @Override
    public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        //setRotationAngles(f, f1, f2, f3, f4, f5, entity);

        this.body.render(f5 * 0.295F);

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
        this.body.offsetY = 0.95F;

        //this.Tailfin.setScale(1.1F, 1.1F, 1.1F);
        AdvancedModelRenderer[] body2 = {this.body3, this.body4, this.body5};

        float speed = 0.4F;
        float tailVdegree = 1.0F;
        float tailHdegree = 0.0F;
        float tailSwing = 1.0F;

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
            speed = 0.2F;
            tailVdegree = 0.06F;
            tailHdegree = 0.2F;
            tailSwing = 0.4F;
        }


        if (e instanceof EntityLiving && !((EntityLiving) e).isAIDisabled()) {
            this.chainWave(body2, speed, tailVdegree * 0.3f, -3, f2, 1);
            this.chainSwing(body2, speed, tailHdegree, -2.5, f2, tailSwing);
            this.flap(legL, 0.7F, -0.5F, false, 0, -0.5F, f2, 0.3F);
            this.flap(legR, 0.7F, 0.5F, false, 0, 0.5F, f2, 0.3F);
            this.flap(legL2, 0.7F, -0.5F, false, 1.0F, -0.5F, f2, 0.3F);
            this.flap(legR2, 0.7F, 0.5F, false, 1.0F, 0.5F, f2, 0.3F);
            this.flap(legL3, 0.7F, -0.5F, false, 2.0F, -0.5F, f2, 0.3F);
            this.flap(legR3, 0.7F, 0.5F, false, 2.0F, 0.5F, f2, 0.3F);

            //this.swing(body, speed, 0.3F, true, 0, 0, f2, 1);
            if (!isAtBottom) {
                this.bob(body, -speed, 0.7F, false, f2, 2);
                 }
            if (!e.isInWater()) {
                //this.Bodyfront.rotateAngleZ = (float) Math.toRadians(90);
                this.body.offsetY = 1.0F;
                this.bob(body, -speed, 1F, false, f2, 1);
                this.chainWave(body2, speed, tailHdegree, -3, f2, 1);
                this.chainSwing(body2, speed, tailVdegree, -3, f2, 1);
            }
        }
    }
}
