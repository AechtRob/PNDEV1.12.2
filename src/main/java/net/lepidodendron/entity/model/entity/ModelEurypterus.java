package net.lepidodendron.entity.model.entity;

import net.ilexiconn.llibrary.client.model.tools.AdvancedModelBase;
import net.ilexiconn.llibrary.client.model.tools.AdvancedModelRenderer;
import net.minecraft.block.material.Material;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLiving;
import net.minecraft.util.math.BlockPos;

public class ModelEurypterus extends AdvancedModelBase {
    private final AdvancedModelRenderer body;
    private final AdvancedModelRenderer frontlegr;
    private final AdvancedModelRenderer leg2R_r1;
    private final AdvancedModelRenderer frontlegL;
    private final AdvancedModelRenderer leg2L_r1;
    private final AdvancedModelRenderer paddleL;
    private final AdvancedModelRenderer paddleL2;
    private final AdvancedModelRenderer paddleR;
    private final AdvancedModelRenderer paddleR2;
    private final AdvancedModelRenderer head;
    private final AdvancedModelRenderer body2;
    private final AdvancedModelRenderer body3;
    private final AdvancedModelRenderer body4;
    private final AdvancedModelRenderer tail_end;

    public ModelEurypterus() {
        textureWidth = 64;
        textureHeight = 64;

        body = new AdvancedModelRenderer(this);
        body.setRotationPoint(0.0F, 21.0F, -1.0F);
        body.cubeList.add(new ModelBox(body, 0, 0, -4.0F, -1.0F, 0.0F, 8, 2, 8, 0.0F, false));

        frontlegr = new AdvancedModelRenderer(this);
        frontlegr.setRotationPoint(0.0F, 0.0F, 0.0F);
        body.addChild(frontlegr);


        leg2R_r1 = new AdvancedModelRenderer(this);
        leg2R_r1.setRotationPoint(-3.0F, 1.0F, -3.0F);
        frontlegr.addChild(leg2R_r1);
        leg2R_r1.cubeList.add(new ModelBox(leg2R_r1, 22, 31, -5.0F, -0.5F, 0.0F, 5, 1, 1, 0.0F, false));

        frontlegL = new AdvancedModelRenderer(this);
        frontlegL.setRotationPoint(0.0F, 0.0F, 0.0F);
        body.addChild(frontlegL);


        leg2L_r1 = new AdvancedModelRenderer(this);
        leg2L_r1.setRotationPoint(3.0F, 1.0F, -3.0F);
        frontlegL.addChild(leg2L_r1);
        leg2L_r1.cubeList.add(new ModelBox(leg2L_r1, 10, 31, 0.0F, -0.5F, 0.0F, 5, 1, 1, 0.0F, false));

        paddleL = new AdvancedModelRenderer(this);
        paddleL.setRotationPoint(3.0F, 1.0F, 0.0F);
        body.addChild(paddleL);
        paddleL.cubeList.add(new ModelBox(paddleL, 0, 31, 0.0F, -0.5F, -1.0F, 4, 1, 2, 0.0F, false));

        paddleL2 = new AdvancedModelRenderer(this);
        paddleL2.setRotationPoint(0.0F, 0.0F, 0.0F);
        paddleL.addChild(paddleL2);
        paddleL2.cubeList.add(new ModelBox(paddleL2, 28, 16, 4.0F, -0.5F, -1.0F, 5, 1, 3, 0.0F, false));

        paddleR = new AdvancedModelRenderer(this);
        paddleR.setRotationPoint(-3.0F, 1.0F, 0.0F);
        body.addChild(paddleR);
        paddleR.cubeList.add(new ModelBox(paddleR, 30, 20, -4.0F, -0.5F, -1.0F, 4, 1, 2, 0.0F, false));

        paddleR2 = new AdvancedModelRenderer(this);
        paddleR2.setRotationPoint(0.0F, 0.0F, 0.0F);
        paddleR.addChild(paddleR2);
        paddleR2.cubeList.add(new ModelBox(paddleR2, 22, 27, -9.0F, -0.5F, -1.0F, 5, 1, 3, 0.0F, false));

        head = new AdvancedModelRenderer(this);
        head.setRotationPoint(0.0F, 0.0F, 0.0F);
        body.addChild(head);
        head.cubeList.add(new ModelBox(head, 0, 11, -4.0F, -1.0F, -6.0F, 8, 2, 6, 0.0F, false));
        head.cubeList.add(new ModelBox(head, 17, 11, -5.0F, 1.1F, -8.0F, 10, 0, 5, 0.0F, false));

        body2 = new AdvancedModelRenderer(this);
        body2.setRotationPoint(0.0F, 0.0F, 8.0F);
        body.addChild(body2);
        body2.cubeList.add(new ModelBox(body2, 14, 20, -3.0F, -1.0F, 0.0F, 6, 2, 4, 0.0F, false));

        body3 = new AdvancedModelRenderer(this);
        body3.setRotationPoint(0.0F, 0.0F, 4.0F);
        body2.addChild(body3);
        body3.cubeList.add(new ModelBox(body3, 4, 24, -1.5F, -1.0F, 0.0F, 3, 2, 4, 0.0F, false));

        body4 = new AdvancedModelRenderer(this);
        body4.setRotationPoint(-1.0F, 0.0F, 4.0F);
        body3.addChild(body4);
        body4.cubeList.add(new ModelBox(body4, 4, 24, -0.5F, -1.0F, 0.0F, 3, 2, 4, 0.0F, false));
        body4.cubeList.add(new ModelBox(body4, 0, 34, -1.0F, 0.0F, 2.0F, 4, 0, 4, 0.0F, false));

        tail_end = new AdvancedModelRenderer(this);
        tail_end.setRotationPoint(1.0F, 0.0F, 4.0F);
        body4.addChild(tail_end);
        tail_end.cubeList.add(new ModelBox(tail_end, 0, 38, -0.5F, -0.5F, 0.0F, 1, 1, 10, 0.0F, false));

        updateDefaultPose();
    }

    @Override
    public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        //setRotationAngles(f, f1, f2, f3, f4, f5, entity);
        //this.Bodyfront.render(0.5F);
        this.leg2R_r1.defaultRotationZ = -0.6109F;
        this.leg2L_r1.defaultRotationZ = 0.6109F;
        this.body.render(f5);

    }

    public void renderStatic(float f) {
        //GlStateManager.pushMatrix();
        //GlStateManager.enableBlend();
        //GlStateManager.blendFunc(GlStateManager.SourceFactor.SRC_ALPHA, GlStateManager.DestFactor.ONE_MINUS_SRC_ALPHA);
        //GlStateManager.disableCull();
        this.body.offsetZ = -0.16F;
        this.body.render(0.02F);
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
        //this.body.offsetY = 1.0F;

        //this.Tailfin.setScale(1.1F, 1.1F, 1.1F);
        AdvancedModelRenderer[] fishTail = {this.body2, this.body3, this.body4, this.tail_end};
        //AdvancedModelRenderer[] fishTail = {this.body2, this.body3, this.body4};
        //AdvancedModelRenderer[] fishfinL = {this.paddleL, this.paddleL2};
        //AdvancedModelRenderer[] fishfinR = {this.paddleR, this.paddleR2};
        AdvancedModelRenderer[] fishfinL = {this.paddleL};
        AdvancedModelRenderer[] fishfinR = {this.paddleR};
        AdvancedModelRenderer[] fishfinL2 = {this.paddleL2};
        AdvancedModelRenderer[] fishfinR2 = {this.paddleR2};

        float speed = 0.4F;
        float tailVdegree = 1.0F;
        float tailHdegree = 0.0F;
        float paddleVdegree = 0.4F;
        float paddleHdegree = 0.4F;
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
            speed = 0.15F;
            tailVdegree = 0.1F;
            tailHdegree = 0.4F;
            tailSwing = 0.6F;
            paddleVdegree = 0.1F;
            this.paddleL.defaultRotationY = 0F;
            this.paddleR.defaultRotationY = 0F;
        }


        if (e instanceof EntityLiving && !((EntityLiving) e).isAIDisabled()) {
            this.chainWave(fishTail, speed, tailVdegree * 0.3f, -3, f2, 1);
            this.chainSwing(fishTail, speed, tailHdegree, -2.5, f2, tailSwing);

            this.chainSwing(fishfinL, speed, -paddleHdegree, -3, f2, 1);
            this.chainWave(fishfinL, speed, paddleVdegree, -3, f2, 2);
            this.chainSwing(fishfinR, speed, paddleHdegree, -3, f2, 1);
            this.chainWave(fishfinR, speed, paddleVdegree, -3, f2, 2);

            this.chainSwing(fishfinL2, speed, -paddleHdegree * 0.2F, -3, f2, 1.0F);
            this.chainSwing(fishfinR2, speed, paddleHdegree * 0.2F, -3, f2, 1.0F);

            //this.swing(body, speed, 0.3F, true, 0, 0, f2, 1);
            if (!isAtBottom) {
                this.bob(body, -speed, 2.5F, false, f2, 2);
            }
            if (!e.isInWater()) {
                //this.Bodyfront.rotateAngleZ = (float) Math.toRadians(90);
                this.body.offsetY = 1.0F - 1.0F;
                this.bob(body, -speed, 2F, false, f2, 1);
                this.chainWave(fishTail, speed, tailHdegree, -3, f2, 1);
                this.chainSwing(fishTail, speed, tailVdegree, -3, f2, 1);
            }
        }
    }
}
