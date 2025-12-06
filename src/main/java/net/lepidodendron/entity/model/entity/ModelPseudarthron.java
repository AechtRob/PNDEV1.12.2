package net.lepidodendron.entity.model.entity;

import net.ilexiconn.llibrary.client.model.tools.AdvancedModelRenderer;
import net.lepidodendron.entity.model.ModelBasePalaeopedia;
import net.minecraft.block.material.Material;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLiving;
import net.minecraft.util.math.BlockPos;

public class ModelPseudarthron extends ModelBasePalaeopedia {
    private final AdvancedModelRenderer main;
    private final AdvancedModelRenderer cephalon;
    private final AdvancedModelRenderer anntennae;
    private final AdvancedModelRenderer anntennae2;
    private final AdvancedModelRenderer thorax;
    private final AdvancedModelRenderer leftLeg_1;
    private final AdvancedModelRenderer leftLeg_2;
    private final AdvancedModelRenderer leftLeg_3;
    private final AdvancedModelRenderer leftLeg_4;
    private final AdvancedModelRenderer rightLeg_1;
    private final AdvancedModelRenderer rightLeg_2;
    private final AdvancedModelRenderer rightLeg_3;
    private final AdvancedModelRenderer rightLeg_4;
    private final AdvancedModelRenderer furace;
    private final AdvancedModelRenderer furace2;

    public ModelPseudarthron() {
        this.textureWidth = 32;
        this.textureHeight = 32;

        this.main = new AdvancedModelRenderer(this);
        this.main.setRotationPoint(0.0F, 24.0F, 0.0F);


        this.cephalon = new AdvancedModelRenderer(this);
        this.cephalon.setRotationPoint(0.0F, -1.9F, -3.0F);
        this.main.addChild(cephalon);
        this.cephalon.cubeList.add(new ModelBox(cephalon, -1, 7, -1.5F, 1.01F, -1.05F, 3, 0, 1, 0.0F, false));

        this.anntennae = new AdvancedModelRenderer(this);
        this.anntennae.setRotationPoint(0.625F, 1.05F, -0.55F);
        this.cephalon.addChild(anntennae);
        this.anntennae.cubeList.add(new ModelBox(anntennae, 10, 0, -0.5F, 0.0F, -2.5F, 3, 0, 3, 0.0F, false));

        this.anntennae2 = new AdvancedModelRenderer(this);
        this.anntennae2.setRotationPoint(-0.625F, 1.05F, -0.55F);
        this.cephalon.addChild(anntennae2);
        this.anntennae2.cubeList.add(new ModelBox(anntennae2, 10, 0, -2.5F, 0.0F, -2.5F, 3, 0, 3, 0.0F, true));

        this.thorax = new AdvancedModelRenderer(this);
        this.thorax.setRotationPoint(0.0F, 0.5F, 1.2F);
        this.cephalon.addChild(thorax);
        this.thorax.cubeList.add(new ModelBox(thorax, 0, 9, -0.5F, 0.0F, -1.25F, 1, 1, 6, 0.0F, false));
        this.thorax.cubeList.add(new ModelBox(thorax, -7, 0, -3.0F, 0.5F, -1.25F, 6, 0, 7, 0.0F, false));

        this.leftLeg_1 = new AdvancedModelRenderer(this);
        this.leftLeg_1.setRotationPoint(0.3172F, 0.9627F, 0.1372F);
        this.thorax.addChild(leftLeg_1);
        this.setRotateAngle(leftLeg_1, 0.0F, 0.0F, 0.1484F);
        this.leftLeg_1.cubeList.add(new ModelBox(leftLeg_1, 7, 12, 0.0F, 0.0F, -1.5F, 2, 0, 2, 0.0F, false));

        this.leftLeg_2 = new AdvancedModelRenderer(this);
        this.leftLeg_2.setRotationPoint(0.3172F, 0.9627F, 1.3872F);
        this.thorax.addChild(leftLeg_2);
        this.setRotateAngle(leftLeg_2, 0.0F, 0.0F, 0.1484F);
        this.leftLeg_2.cubeList.add(new ModelBox(leftLeg_2, 5, 7, 0.0F, 0.0F, -0.5F, 3, 0, 1, 0.0F, false));

        this.leftLeg_3 = new AdvancedModelRenderer(this);
        this.leftLeg_3.setRotationPoint(0.3172F, 0.9627F, 2.8872F);
        this.thorax.addChild(leftLeg_3);
        this.setRotateAngle(leftLeg_3, 0.0F, 0.0F, 0.1484F);
        this.leftLeg_3.cubeList.add(new ModelBox(leftLeg_3, 5, 7, 0.0F, 0.0F, -0.5F, 3, 0, 1, 0.0F, false));

        this.leftLeg_4 = new AdvancedModelRenderer(this);
        this.leftLeg_4.setRotationPoint(0.3172F, 0.9627F, 4.1372F);
        this.thorax.addChild(leftLeg_4);
        this.setRotateAngle(leftLeg_4, 0.0F, 0.0F, 0.1484F);
        this.leftLeg_4.cubeList.add(new ModelBox(leftLeg_4, 7, 9, 0.0F, 0.0F, -0.5F, 2, 0, 2, 0.0F, false));

        this.rightLeg_1 = new AdvancedModelRenderer(this);
        this.rightLeg_1.setRotationPoint(-0.3172F, 0.9627F, 0.1372F);
        this.thorax.addChild(rightLeg_1);
        this.setRotateAngle(rightLeg_1, 0.0F, 0.0F, -0.1484F);
        this.rightLeg_1.cubeList.add(new ModelBox(rightLeg_1, 7, 12, -2.0F, 0.0F, -1.5F, 2, 0, 2, 0.0F, true));

        this.rightLeg_2 = new AdvancedModelRenderer(this);
        this.rightLeg_2.setRotationPoint(-0.3172F, 0.9627F, 1.3872F);
        this.thorax.addChild(rightLeg_2);
        this.setRotateAngle(rightLeg_2, 0.0F, 0.0F, -0.1484F);
        this.rightLeg_2.cubeList.add(new ModelBox(rightLeg_2, 5, 7, -3.0F, 0.0F, -0.5F, 3, 0, 1, 0.0F, true));

        this.rightLeg_3 = new AdvancedModelRenderer(this);
        this.rightLeg_3.setRotationPoint(-0.3172F, 0.9627F, 2.8872F);
        this.thorax.addChild(rightLeg_3);
        this.setRotateAngle(rightLeg_3, 0.0F, 0.0F, -0.1484F);
        this.rightLeg_3.cubeList.add(new ModelBox(rightLeg_3, 5, 7, -3.0F, 0.0F, -0.5F, 3, 0, 1, 0.0F, true));

        this.rightLeg_4 = new AdvancedModelRenderer(this);
        this.rightLeg_4.setRotationPoint(-0.3172F, 0.9627F, 4.1372F);
        this.thorax.addChild(rightLeg_4);
        this.setRotateAngle(rightLeg_4, 0.0F, 0.0F, -0.1484F);
        this.rightLeg_4.cubeList.add(new ModelBox(rightLeg_4, 7, 9, -2.0F, 0.0F, -0.5F, 2, 0, 2, 0.0F, true));

        this.furace = new AdvancedModelRenderer(this);
        this.furace.setRotationPoint(0.1F, 0.6F, 4.25F);
        this.thorax.addChild(furace);
        this.setRotateAngle(furace, 0.0F, 0.3927F, 0.0F);
        this.furace.cubeList.add(new ModelBox(furace, -3, 9, -0.5F, 0.0F, 0.0F, 1, 0, 4, 0.0F, false));

        this.furace2 = new AdvancedModelRenderer(this);
        this.furace2.setRotationPoint(-0.1F, 0.6F, 4.25F);
        this.thorax.addChild(furace2);
        this.setRotateAngle(furace2, 0.0F, -0.3927F, 0.0F);
        this.furace2.cubeList.add(new ModelBox(furace2, -3, 9, -0.5F, 0.0F, 0.0F, 1, 0, 4, 0.0F, false));

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
        this.main.render(0.02F);
        //GlStateManager.enableCull();
        //GlStateManager.disableBlend();
        //GlStateManager.popMatrix();
    }

    @Override
    public void renderStaticBook(float f) {
        //Rotations, positions and sizing:
        this.main.offsetY = -1.8F;
        this.main.offsetX = -0.2F;
        this.main.offsetZ = 2.0F;
        this.main.rotateAngleY = (float)Math.toRadians(120);
        this.main.rotateAngleX = (float)Math.toRadians(1);
        this.main.rotateAngleZ = (float)Math.toRadians(0);
        this.main.scaleChildren = true;
        float scaler = 6.8F;
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

        float speed = 0.45F;
        float tailVdegree = 0.30F;
        float tailHdegree = 0.0F;
        float tailSwing = 0.3F;

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
            speed = 0.18F;
            tailVdegree = 0.05F;
            tailHdegree = 0.11F;
            tailSwing = 0.2F;
        }


        if (e instanceof EntityLiving && !((EntityLiving) e).isAIDisabled()) {
            this.flap(leftLeg_1, 0.5F, -0.5F, false, 1, -0.5F, f2, 0.3F);
            this.flap(rightLeg_1, 0.5F, 0.5F, false, 0, 0.5F, f2, 0.3F);
            this.flap(leftLeg_2, 0.5F, -0.5F, false, 1.0F, -0.5F, f2, 0.3F);
            this.flap(rightLeg_2, 0.5F, 0.5F, false, 1.0F, 0.5F, f2, 0.3F);
            this.flap(leftLeg_3, 0.5F, -0.5F, false, 2.0F, -0.5F, f2, 0.3F);
            this.flap(rightLeg_3, 0.5F, 0.5F, false, 2.0F, 0.5F, f2, 0.3F);
            this.flap(leftLeg_4, 0.5F, -0.5F, false, 3.0F, -0.5F, f2, 0.3F);
            this.flap(rightLeg_4, 0.5F, 0.5F, false, 3.0F, 0.5F, f2, 0.3F);

            this.swing(furace, 0.4F, -0.2F, false, 0, -0.1F, f2, 0.8F);
            this.swing(furace2, 0.4F, 0.2F, false, 0, 0.1F, f2, 0.8F);

            this.swing(anntennae, 0.4F, -0.2F, false, 0, -0.1F, f2, 0.8F);
            this.swing(anntennae2, 0.4F, 0.2F, false, 0, 0.1F, f2, 0.8F);
            //this.swing(body, speed, 0.3F, true, 0, 0, f2, 1);
            if (!isAtBottom) {
                this.bob(main, -speed, 0.12F, false, f2, 2);
            }
            if (!e.isInWater()) {
                //this.Bodyfront.rotateAngleZ = (float) Math.toRadians(90);
                this.main.offsetY = 0.0F;
                this.bob(main, -speed, 0.21F, false, f2, 1);
            }
        }
    }
}