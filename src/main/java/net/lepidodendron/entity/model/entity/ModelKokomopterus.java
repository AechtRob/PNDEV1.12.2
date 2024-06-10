package net.lepidodendron.entity.model.entity;

import net.ilexiconn.llibrary.client.model.ModelAnimator;
import net.ilexiconn.llibrary.client.model.tools.AdvancedModelRenderer;
import net.ilexiconn.llibrary.server.animation.IAnimatedEntity;
import net.lepidodendron.entity.base.EntityPrehistoricFloraAgeableBase;
import net.lepidodendron.entity.model.ModelBasePalaeopedia;
import net.minecraft.block.material.Material;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLiving;
import net.minecraft.util.math.BlockPos;

public class ModelKokomopterus extends ModelBasePalaeopedia {
    private final AdvancedModelRenderer carapace;
    private final AdvancedModelRenderer legL1;
    private final AdvancedModelRenderer legR1;
    private final AdvancedModelRenderer legL2;
    private final AdvancedModelRenderer legL2_2;
    private final AdvancedModelRenderer legR2;
    private final AdvancedModelRenderer legR2_2;
    private final AdvancedModelRenderer legL3;
    private final AdvancedModelRenderer legL3_2;
    private final AdvancedModelRenderer legR3;
    private final AdvancedModelRenderer legR3_2;
    private final AdvancedModelRenderer legL4;
    private final AdvancedModelRenderer legL4_2;
    private final AdvancedModelRenderer legL4_3;
    private final AdvancedModelRenderer legR4;
    private final AdvancedModelRenderer legR4_2;
    private final AdvancedModelRenderer legR4_3;
    private final AdvancedModelRenderer legL5;
    private final AdvancedModelRenderer legL5_2;
    private final AdvancedModelRenderer legL5_3;
    private final AdvancedModelRenderer legR5;
    private final AdvancedModelRenderer legR5_2;
    private final AdvancedModelRenderer legR5_3;
    private final AdvancedModelRenderer body;
    private final AdvancedModelRenderer body1;
    private final AdvancedModelRenderer body2;
    private final AdvancedModelRenderer body3;
    private final AdvancedModelRenderer body4;
    private final AdvancedModelRenderer body5;
    private final AdvancedModelRenderer body6;

    private ModelAnimator animator;


    public ModelKokomopterus() {
        this.textureWidth = 64;
        this.textureHeight = 64;

        this.carapace = new AdvancedModelRenderer(this);
        this.carapace.setRotationPoint(0.0F, 22.25F, 2.0F);
        this.carapace.cubeList.add(new ModelBox(carapace, 0, 9, -3.5F, -3.0F, -8.0F, 7, 2, 6, 0.0F, false));
        this.carapace.cubeList.add(new ModelBox(carapace, 11, 17, -3.0F, -1.75F, -6.25F, 6, 1, 4, 0.0F, false));
        this.carapace.cubeList.add(new ModelBox(carapace, 33, 19, -2.0F, -1.75F, -7.25F, 4, 1, 1, 0.0F, false));
        this.carapace.cubeList.add(new ModelBox(carapace, 0, 27, -1.0F, -1.5F, -6.3F, 2, 1, 4, 0.0F, false));
        this.carapace.cubeList.add(new ModelBox(carapace, 0, 1, -1.25F, -0.9F, -8.0F, 1, 0, 1, 0.0F, false));
        this.carapace.cubeList.add(new ModelBox(carapace, 0, 0, 0.25F, -0.9F, -8.0F, 1, 0, 1, 0.0F, false));

        this.legL1 = new AdvancedModelRenderer(this);
        this.legL1.setRotationPoint(2.0F, -1.25F, -7.25F);
        this.carapace.addChild(legL1);
        this.setRotateAngle(legL1, 0.6981F, -0.5236F, 0.0F);
        this.legL1.cubeList.add(new ModelBox(legL1, 11, 22, -0.5F, 0.5F, -4.0F, 2, 0, 4, 0.0F, false));
        this.legL1.cubeList.add(new ModelBox(legL1, 33, 38, -0.5F, 0.0F, -3.0F, 1, 1, 3, 0.0F, false));

        this.legR1 = new AdvancedModelRenderer(this);
        this.legR1.setRotationPoint(-2.0F, -1.25F, -7.25F);
        this.carapace.addChild(legR1);
        this.setRotateAngle(legR1, 0.6981F, 0.5236F, 0.0F);
        this.legR1.cubeList.add(new ModelBox(legR1, 0, 22, -1.5F, 0.5F, -4.0F, 2, 0, 4, 0.0F, false));
        this.legR1.cubeList.add(new ModelBox(legR1, 37, 0, -0.5F, 0.0F, -3.0F, 1, 1, 3, 0.0F, false));

        this.legL2 = new AdvancedModelRenderer(this);
        this.legL2.setRotationPoint(2.75F, -1.5F, -6.0F);
        this.carapace.addChild(legL2);
        this.setRotateAngle(legL2, 0.1745F, -1.0472F, 0.0F);
        this.legL2.cubeList.add(new ModelBox(legL2, 38, 25, -0.5F, 0.0F, -3.0F, 1, 1, 3, 0.0F, false));
        this.legL2.cubeList.add(new ModelBox(legL2, 9, 22, -0.5F, 0.5F, -3.0F, 2, 0, 2, 0.0F, false));

        this.legL2_2 = new AdvancedModelRenderer(this);
        this.legL2_2.setRotationPoint(0.0F, 0.0F, -3.0F);
        this.legL2.addChild(legL2_2);
        this.setRotateAngle(legL2_2, 0.4363F, 0.0F, 0.0F);
        this.legL2_2.cubeList.add(new ModelBox(legL2_2, 13, 38, -0.49F, -0.01F, -3.0F, 1, 1, 3, 0.0F, false));
        this.legL2_2.cubeList.add(new ModelBox(legL2_2, 7, 22, -0.5F, 0.5F, -4.0F, 2, 0, 4, 0.0F, false));

        this.legR2 = new AdvancedModelRenderer(this);
        this.legR2.setRotationPoint(-2.75F, -1.5F, -6.0F);
        this.carapace.addChild(legR2);
        this.setRotateAngle(legR2, 0.1745F, 1.0472F, 0.0F);
        this.legR2.cubeList.add(new ModelBox(legR2, 28, 35, -0.5F, 0.0F, -3.0F, 1, 1, 3, 0.0F, false));
        this.legR2.cubeList.add(new ModelBox(legR2, 9, 17, -1.5F, 0.5F, -3.0F, 2, 0, 2, 0.0F, false));

        this.legR2_2 = new AdvancedModelRenderer(this);
        this.legR2_2.setRotationPoint(0.0F, 0.0F, -3.0F);
        this.legR2.addChild(legR2_2);
        this.setRotateAngle(legR2_2, 0.4363F, 0.0F, 0.0F);
        this.legR2_2.cubeList.add(new ModelBox(legR2_2, 0, 37, -0.51F, -0.01F, -3.0F, 1, 1, 3, 0.0F, false));
        this.legR2_2.cubeList.add(new ModelBox(legR2_2, 7, 17, -1.5F, 0.5F, -4.0F, 2, 0, 4, 0.0F, false));

        this.legL3 = new AdvancedModelRenderer(this);
        this.legL3.setRotationPoint(2.75F, -1.5F, -5.0F);
        this.carapace.addChild(legL3);
        this.setRotateAngle(legL3, 0.0873F, -1.5708F, 0.0F);
        this.legL3.cubeList.add(new ModelBox(legL3, 32, 28, -0.5F, 0.0F, -4.0F, 1, 1, 4, 0.0F, false));
        this.legL3.cubeList.add(new ModelBox(legL3, 25, 14, -0.5F, 0.5F, -4.0F, 2, 0, 2, 0.0F, false));

        this.legL3_2 = new AdvancedModelRenderer(this);
        this.legL3_2.setRotationPoint(0.0F, 0.0F, -4.0F);
        this.legL3.addChild(legL3_2);
        this.setRotateAngle(legL3_2, 0.4363F, 0.0F, 0.0F);
        this.legL3_2.cubeList.add(new ModelBox(legL3_2, 33, 14, -0.49F, -0.01F, -4.0F, 1, 1, 4, 0.0F, false));
        this.legL3_2.cubeList.add(new ModelBox(legL3_2, 22, 14, -0.5F, 0.5F, -5.0F, 2, 0, 5, 0.0F, false));

        this.legR3 = new AdvancedModelRenderer(this);
        this.legR3.setRotationPoint(-2.75F, -1.5F, -5.0F);
        this.carapace.addChild(legR3);
        this.setRotateAngle(legR3, 0.0873F, 1.5708F, 0.0F);
        this.legR3.cubeList.add(new ModelBox(legR3, 26, 30, -0.5F, 0.0F, -4.0F, 1, 1, 4, 0.0F, false));
        this.legR3.cubeList.add(new ModelBox(legR3, 3, 17, -1.5F, 0.5F, -4.0F, 2, 0, 2, 0.0F, false));

        this.legR3_2 = new AdvancedModelRenderer(this);
        this.legR3_2.setRotationPoint(0.0F, 0.0F, -4.0F);
        this.legR3.addChild(legR3_2);
        this.setRotateAngle(legR3_2, 0.4363F, 0.0F, 0.0F);
        this.legR3_2.cubeList.add(new ModelBox(legR3_2, 31, 0, -0.51F, -0.01F, -4.0F, 1, 1, 4, 0.0F, false));
        this.legR3_2.cubeList.add(new ModelBox(legR3_2, 0, 17, -1.5F, 0.5F, -5.0F, 2, 0, 5, 0.0F, false));

        this.legL4 = new AdvancedModelRenderer(this);
        this.legL4.setRotationPoint(2.5F, -1.5F, -4.0F);
        this.carapace.addChild(legL4);
        this.setRotateAngle(legL4, -0.1745F, -1.9199F, 0.0F);
        this.legL4.cubeList.add(new ModelBox(legL4, 8, 37, -0.5F, 0.0F, -3.0F, 1, 1, 3, 0.0F, false));

        this.legL4_2 = new AdvancedModelRenderer(this);
        this.legL4_2.setRotationPoint(0.0F, 0.0F, -3.0F);
        this.legL4.addChild(legL4_2);
        this.setRotateAngle(legL4_2, 0.3491F, 0.0F, 0.0F);
        this.legL4_2.cubeList.add(new ModelBox(legL4_2, 38, 9, -0.49F, -0.01F, -3.0F, 1, 1, 3, 0.0F, false));

        this.legL4_3 = new AdvancedModelRenderer(this);
        this.legL4_3.setRotationPoint(0.0F, 0.0F, -3.0F);
        this.legL4_2.addChild(legL4_3);
        this.setRotateAngle(legL4_3, 0.4363F, 0.0F, 0.0F);
        this.legL4_3.cubeList.add(new ModelBox(legL4_3, 10, 32, -0.5F, 0.0F, -4.0F, 1, 1, 4, 0.0F, false));
        this.legL4_3.cubeList.add(new ModelBox(legL4_3, 20, 0, -0.5F, 0.5F, -5.0F, 2, 0, 5, 0.0F, false));

        this.legR4 = new AdvancedModelRenderer(this);
        this.legR4.setRotationPoint(-2.5F, -1.5F, -4.0F);
        this.carapace.addChild(legR4);
        this.setRotateAngle(legR4, -0.1745F, 1.9199F, 0.0F);
        this.legR4.cubeList.add(new ModelBox(legR4, 6, 32, -0.5F, 0.0F, -3.0F, 1, 1, 3, 0.0F, false));

        this.legR4_2 = new AdvancedModelRenderer(this);
        this.legR4_2.setRotationPoint(0.0F, 0.0F, -3.0F);
        this.legR4.addChild(legR4_2);
        this.setRotateAngle(legR4_2, 0.3491F, 0.0F, 0.0F);
        this.legR4_2.cubeList.add(new ModelBox(legR4_2, 35, 21, -0.51F, -0.01F, -3.0F, 1, 1, 3, 0.0F, false));

        this.legR4_3 = new AdvancedModelRenderer(this);
        this.legR4_3.setRotationPoint(0.0F, 0.0F, -3.0F);
        this.legR4_2.addChild(legR4_3);
        this.setRotateAngle(legR4_3, 0.4363F, 0.0F, 0.0F);
        this.legR4_3.cubeList.add(new ModelBox(legR4_3, 29, 23, -0.5F, 0.0F, -4.0F, 1, 1, 4, 0.0F, false));
        this.legR4_3.cubeList.add(new ModelBox(legR4_3, 16, 0, -1.5F, 0.5F, -5.0F, 2, 0, 5, 0.0F, false));

        this.legL5 = new AdvancedModelRenderer(this);
        this.legL5.setRotationPoint(3.0F, -1.5F, -3.0F);
        this.carapace.addChild(legL5);
        this.setRotateAngle(legL5, -0.2618F, -2.618F, 0.0F);
        this.legL5.cubeList.add(new ModelBox(legL5, 0, 32, -0.5F, 0.0F, -4.0F, 1, 1, 4, 0.0F, false));

        this.legL5_2 = new AdvancedModelRenderer(this);
        this.legL5_2.setRotationPoint(0.0F, 0.0F, -4.0F);
        this.legL5.addChild(legL5_2);
        this.setRotateAngle(legL5_2, 0.3491F, 0.0F, 0.0F);
        this.legL5_2.cubeList.add(new ModelBox(legL5_2, 26, 17, -0.49F, -0.01F, -5.0F, 1, 1, 5, 0.0F, false));

        this.legL5_3 = new AdvancedModelRenderer(this);
        this.legL5_3.setRotationPoint(0.0F, 0.0F, -5.0F);
        this.legL5_2.addChild(legL5_3);
        this.setRotateAngle(legL5_3, 0.5236F, 0.0F, 0.0F);
        this.legL5_3.cubeList.add(new ModelBox(legL5_3, 24, 0, -0.5F, 0.0F, -5.0F, 1, 1, 5, 0.0F, false));
        this.legL5_3.cubeList.add(new ModelBox(legL5_3, 2, 0, -0.5F, 0.5F, -6.0F, 1, 0, 1, 0.0F, false));

        this.legR5 = new AdvancedModelRenderer(this);
        this.legR5.setRotationPoint(-3.0F, -1.5F, -3.0F);
        this.carapace.addChild(legR5);
        this.setRotateAngle(legR5, -0.2618F, 2.618F, 0.0F);
        this.legR5.cubeList.add(new ModelBox(legR5, 20, 29, -0.5F, 0.0F, -4.0F, 1, 1, 4, 0.0F, false));

        this.legR5_2 = new AdvancedModelRenderer(this);
        this.legR5_2.setRotationPoint(0.0F, 0.0F, -4.0F);
        this.legR5.addChild(legR5_2);
        this.setRotateAngle(legR5_2, 0.3491F, 0.0F, 0.0F);
        this.legR5_2.cubeList.add(new ModelBox(legR5_2, 22, 23, -0.51F, -0.01F, -5.0F, 1, 1, 5, 0.0F, false));

        this.legR5_3 = new AdvancedModelRenderer(this);
        this.legR5_3.setRotationPoint(0.0F, 0.0F, -5.0F);
        this.legR5_2.addChild(legR5_3);
        this.setRotateAngle(legR5_3, 0.5236F, 0.0F, 0.0F);
        this.legR5_3.cubeList.add(new ModelBox(legR5_3, 15, 22, -0.5F, 0.0F, -5.0F, 1, 1, 5, 0.0F, false));
        this.legR5_3.cubeList.add(new ModelBox(legR5_3, 0, 2, -0.5F, 0.5F, -6.0F, 1, 0, 1, 0.0F, false));

        this.body = new AdvancedModelRenderer(this);
        this.body.setRotationPoint(0.0F, -2.25F, -2.0F);
        this.carapace.addChild(body);
        this.body.cubeList.add(new ModelBox(body, 0, 0, -3.49F, -0.74F, 0.0F, 7, 2, 7, 0.0F, false));

        this.body1 = new AdvancedModelRenderer(this);
        this.body1.setRotationPoint(0.0F, 0.0F, 7.0F);
        this.body.addChild(body1);
        this.setRotateAngle(body1, 0.0436F, 0.0F, 0.0F);
        this.body1.cubeList.add(new ModelBox(body1, 20, 9, -3.0F, -0.73F, 0.0F, 6, 2, 3, 0.0F, false));

        this.body2 = new AdvancedModelRenderer(this);
        this.body2.setRotationPoint(0.0F, 0.0F, 3.0F);
        this.body1.addChild(body2);
        this.setRotateAngle(body2, 0.0436F, 0.0F, 0.0F);
        this.body2.cubeList.add(new ModelBox(body2, 12, 28, -2.0F, -0.72F, 0.0F, 4, 2, 2, 0.0F, false));

        this.body3 = new AdvancedModelRenderer(this);
        this.body3.setRotationPoint(0.0F, 0.0F, 2.0F);
        this.body2.addChild(body3);
        this.setRotateAngle(body3, 0.0436F, 0.0F, 0.0F);
        this.body3.cubeList.add(new ModelBox(body3, 18, 35, -1.5F, -0.71F, 0.0F, 3, 2, 2, 0.0F, false));

        this.body4 = new AdvancedModelRenderer(this);
        this.body4.setRotationPoint(0.0F, 0.0F, 2.0F);
        this.body3.addChild(body4);
        this.setRotateAngle(body4, 0.0873F, 0.0F, 0.0F);
        this.body4.cubeList.add(new ModelBox(body4, 34, 5, -1.49F, -0.7F, 0.0F, 3, 2, 2, 0.0F, false));

        this.body5 = new AdvancedModelRenderer(this);
        this.body5.setRotationPoint(0.0F, 0.0F, 2.0F);
        this.body4.addChild(body5);
        this.setRotateAngle(body5, 0.1309F, 0.0F, 0.0F);
        this.body5.cubeList.add(new ModelBox(body5, 33, 33, -1.0F, -0.69F, 0.0F, 2, 2, 3, 0.0F, false));

        this.body6 = new AdvancedModelRenderer(this);
        this.body6.setRotationPoint(0.0F, 0.0F, 3.0F);
        this.body5.addChild(body6);
        this.setRotateAngle(body6, 0.1745F, 0.0F, 0.0F);
        this.body6.cubeList.add(new ModelBox(body6, 0, 17, -0.5F, -0.23F, -0.1F, 1, 1, 9, 0.0F, false));

        updateDefaultPose();
        animator = ModelAnimator.create();
    }

    @Override
    public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        animate((IAnimatedEntity) entity, f, f1, f2, f3, f4, f5);
        this.carapace.render(f5 * 0.36F);
    }
    public void renderStatic(float f) {
        //GlStateManager.pushMatrix();
        //GlStateManager.enableBlend();
        //GlStateManager.blendFunc(GlStateManager.SourceFactor.SRC_ALPHA, GlStateManager.DestFactor.ONE_MINUS_SRC_ALPHA);
        //GlStateManager.disableCull();
        this.carapace.offsetZ = -0.1F;
        this.carapace.render(0.01F);
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
        this.carapace.offsetY = 0.9F;

        float speedMultiplier = 1F;
        EntityPrehistoricFloraAgeableBase ee = (EntityPrehistoricFloraAgeableBase) e;
        if (ee.getIsFast()) {
            speedMultiplier = 1.75F;
        }
        AdvancedModelRenderer[] fishBody = {this.carapace, this.body,this.body1, this.body2, this.body3, this.body4, this.body5, this.body6};
        AdvancedModelRenderer[] fishTail = {this.body1, this.body2, this.body3, this.body4, this.body5, this.body6};
        //AdvancedModelRenderer[] fishfinL = {this.legL5};
        //AdvancedModelRenderer[] fishfinR = {this.legR5};

        //mouthparts:
        //this.walk(legL1, 0.35F, -0.15F, false, 0, -0.1F, f2, 0.6F);
        //this.walk(legR1, 0.35F, 0.15F, false, -1, 0.1F, f2, 0.6F);

        float speed = 0.185F * speedMultiplier;
        float tailHdegree = 0.0F;
        float paddleVdegree = 0.2F;
        float paddleHdegree = 0.4F;
        float tailSwing = 0.50F;

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
            speed = 0.15F * speedMultiplier;
            tailHdegree = 0.4F;
            tailSwing = 0.25F;
            paddleVdegree = 0.1F;
            //this.legL5.defaultRotationY = 0F;
           // this.legR5.defaultRotationY = 0F;

            //this.legL2.rotateAngleZ = 0.4F;
            //this.legL3.rotateAngleZ = 0.4F;
            //this.legL4.rotateAngleZ = 0.4F;

            //this.legR2.rotateAngleZ = -0.4F;
            //this.legR3.rotateAngleZ = -0.4F;
            //this.legR4.rotateAngleZ = -0.4F;

        }
        else {
            this.legL2.rotateAngleZ = 0.4F;
            this.legL3.rotateAngleZ = 0.4F;
            this.legL4.rotateAngleZ = 0.4F;
            this.legL5.rotateAngleZ = 0.4F;

            this.legR2.rotateAngleZ = -0.4F;
            this.legR3.rotateAngleZ = -0.4F;
            this.legR4.rotateAngleZ = -0.4F;
            this.legR5.rotateAngleZ = -0.4F;
        }

        if (e instanceof EntityLiving && !((EntityLiving) e).isAIDisabled()) {
            //this.chainWave(fishBody, speed, 0.02F, -0.2F, f2, 0.2F);
            this.chainSwing(fishTail, speed, 0.1F, -0.6F, f2, 0.6F);
            //this.chainWave(fishTail, speed, 0.1F, -0.6F, f2, 0.6F);

            //this.chainSwing(fishfinL, speed, -paddleHdegree, -3, f2, 1);
            //this.chainWave(fishfinL, speed, paddleVdegree, -3, f2, 2);
            //this.chainSwing(fishfinR, speed, paddleHdegree, -3, f2, 1);
            //this.chainWave(fishfinR, speed, paddleVdegree, -3, f2, 2);

            //pincers:
            //this.swing(cheliceraL, 0.3F, -0.1F, false, 0, -0.1F, f2, 0.6F);
            //this.swing(cheliceraR, 0.3F, 0.1F, false, 0, 0.1F, f2, 0.6F);

            //this.flap(clawbaseL, 0.35F, -0.15F, false, 0, -0.1F, f2, 0.6F);
            //this.flap(clawbaseR, 0.35F, 0.15F, false, -1, 0.1F, f2, 0.6F);

            //this.swing(clawL, 0.4F, 0.2F, false, 0, -0.1F, f2, 0.8F);
            //this.swing(clawR, 0.4F, -0.2F, false, 0, 0.1F, f2, 0.8F);

            this.flap(legL1, speed, 0.2F, false, 3F, 0.5F, f2, 1F);
            this.flap(legR1, speed, 0.2F, true, 0F, 0.5F, f2, 1F);
            this.swing(legL1, speed * 2F, 0.3F, false, 0F, 0.4F, f2, 0.8F);
            this.swing(legR1, speed * 2F, 0.3F, true, 0F, 0.4F, f2, 0.8F);

            if (e.isInWater()) {
                if (!isAtBottom) { //Swimming
                    this.flap(legL2, speed, 0.2F, false, 3F, 0.5F, f2, 1F);
                    this.flap(legL3, speed, 0.2F, false, 0F, 0.5F, f2, 1F);
                    this.flap(legL4, speed, 0.2F, false, 3F, 0.5F, f2, 1F);
                    this.flap(legL5, speed, 0.2F, false, 0F, 0.5F, f2, 1F);

                    this.flap(legR2, speed, 0.2F, true, 0F, 0.5F, f2, 1F);
                    this.flap(legR3, speed, 0.2F, true, 3F, 0.5F, f2, 1F);
                    this.flap(legR4, speed, 0.2F, true, 0F, 0.5F, f2, 1F);
                    this.flap(legR5, speed, 0.2F, true, 3F, 0.5F, f2, 1F);

                    this.swing(legL2, speed * 2F, 0.35F, false, 3F, 0.4F, f2, 1F);
                    this.swing(legL3, speed * 2F, 0.35F, false, 0F, 0.4F, f2, 1F);
                    this.swing(legL4, speed * 2F, 0.35F, false, 3F, 0.4F, f2, 1F);
                    this.swing(legL5, speed * 2F, 0.5F, false, 0F, 0.4F, f2, 1F);

                    this.swing(legR2, speed * 2F, 0.35F, true, 0F, 0.4F, f2, 1F);
                    this.swing(legR3, speed * 2F, 0.35F, true, 3F, 0.4F, f2, 1F);
                    this.swing(legR4, speed * 2F, 0.35F, true, 0F, 0.4F, f2, 1F);
                    this.swing(legR5, speed * 2F, 0.5F, true, 3F, 0.4F, f2, 1F);
                } else { //Walking
                    if (f3 != 0.0F) {
                        this.flap(legL2, speed, 0.2F, false, 3F, 0.5F, f2, 1F);
                        this.flap(legL3, speed, 0.2F, false, 0F, 0.5F, f2, 1F);
                        this.flap(legL4, speed, 0.2F, false, 3F, 0.5F, f2, 1F);
                        this.flap(legL5, speed, 0.2F, false, 0F, 0.5F, f2, 1F);

                        this.flap(legR2, speed, 0.2F, true, 0F, 0.5F, f2, 1F);
                        this.flap(legR3, speed, 0.2F, true, 3F, 0.5F, f2, 1F);
                        this.flap(legR4, speed, 0.2F, true, 0F, 0.5F, f2, 1F);
                        this.flap(legR5, speed, 0.2F, true, 3F, 0.5F, f2, 1F);

                        this.swing(legL2, speed * 2F, 0.3F, false, 0F, 0.4F, f2, 0.8F);
                        this.swing(legL3, speed * 2F, 0.3F, false, 3F, 0.4F, f2, 0.8F);
                        this.swing(legL4, speed * 2F, 0.3F, false, 0F, 0.4F, f2, 0.8F);
                        this.swing(legL5, speed * 2F, 0.4F, false, 3F, 0.4F, f2, 0.8F);

                        this.swing(legR2, speed * 2F, 0.3F, true, 0F, 0.4F, f2, 0.8F);
                        this.swing(legR3, speed * 2F, 0.3F, true, 3F, 0.4F, f2, 0.8F);
                        this.swing(legR4, speed * 2F, 0.3F, true, 0F, 0.4F, f2, 0.8F);
                        this.swing(legR5, speed * 2F, 0.4F, true, 3F, 0.4F, f2, 0.8F);
                    }
                }
            }

            //this.swing(body, speed, 0.3F, true, 0, 0, f2, 1);
            if (!isAtBottom) {
                this.bob(carapace, -speed * 0.5F, 0.5F, false, f2, 0.8F);
            }
            if (!e.isInWater()) {
                //this.Bodyfront.rotateAngleZ = (float) Math.toRadians(90);
                this.carapace.offsetY = 0.92F;
                this.bob(carapace, -speed * 1.5F, 2F, false, f2, 1);
                this.chainSwing(fishBody, speed, 0.1F, -2, f2, 1);
            }
        }
    }

    public void animate(IAnimatedEntity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        EntityPrehistoricFloraAgeableBase e = (EntityPrehistoricFloraAgeableBase) entity;
        animator.update(entity);
        this.resetToDefaultPose();
        setRotationAngles(f, f1, f2, f3, f4, f5, (Entity) entity);

        animator.setAnimation(e.ATTACK_ANIMATION);
        animator.startKeyframe(5);
        animator.rotate(this.body, (float) Math.toRadians(25), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(this.body2, (float) Math.toRadians(25), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(this.body3, (float) Math.toRadians(25), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(this.body4, (float) Math.toRadians(25), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(this.body5, (float) Math.toRadians(25), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(this.body6, (float) Math.toRadians(25), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.endKeyframe();
        animator.setStaticKeyframe(5);
        animator.resetKeyframe(20);
    }
}
