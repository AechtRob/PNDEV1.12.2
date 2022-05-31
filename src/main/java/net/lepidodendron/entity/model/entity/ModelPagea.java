package net.lepidodendron.entity.model.entity;

import net.ilexiconn.llibrary.client.model.ModelAnimator;
import net.ilexiconn.llibrary.client.model.tools.AdvancedModelBase;
import net.ilexiconn.llibrary.client.model.tools.AdvancedModelRenderer;
import net.ilexiconn.llibrary.server.animation.IAnimatedEntity;
import net.lepidodendron.entity.base.EntityPrehistoricFloraAgeableBase;
import net.minecraft.block.material.Material;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLiving;
import net.minecraft.util.math.BlockPos;

public class ModelPagea extends AdvancedModelBase {
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
    private final AdvancedModelRenderer body5;
    private final AdvancedModelRenderer body6;

    private ModelAnimator animator;


    public ModelPagea() {
        this.textureWidth = 64;
        this.textureHeight = 64;

        this.carapace = new AdvancedModelRenderer(this);
        this.carapace.setRotationPoint(0.0F, 20.25F, -1.0F);
        this.carapace.cubeList.add(new ModelBox(carapace, 0, 9, -3.5F, -3.0F, -7.0F, 7, 2, 7, 0.0F, false));
        this.carapace.cubeList.add(new ModelBox(carapace, 13, 24, -2.0F, -3.01F, -4.5F, 4, 0, 1, 0.0F, false));
        this.carapace.cubeList.add(new ModelBox(carapace, 0, 18, -3.0F, -1.75F, -5.25F, 6, 1, 5, 0.0F, false));
        this.carapace.cubeList.add(new ModelBox(carapace, 31, 6, -2.0F, -1.75F, -6.25F, 4, 1, 1, 0.0F, false));
        this.carapace.cubeList.add(new ModelBox(carapace, 39, 37, -1.0F, -1.5F, -5.3F, 2, 1, 5, 0.0F, false));
        this.carapace.cubeList.add(new ModelBox(carapace, 2, 4, -1.25F, -0.9F, -7.0F, 1, 0, 1, 0.0F, false));
        this.carapace.cubeList.add(new ModelBox(carapace, 0, 4, 0.25F, -0.9F, -7.0F, 1, 0, 1, 0.0F, false));

        this.legL1 = new AdvancedModelRenderer(this);
        this.legL1.setRotationPoint(2.5F, -1.25F, -6.0F);
        this.carapace.addChild(legL1);
        this.setRotateAngle(legL1, 0.6981F, -0.6981F, 0.0F);
        this.legL1.cubeList.add(new ModelBox(legL1, 12, 18, -0.5F, 0.5F, -7.0F, 2, 0, 5, 0.0F, false));
        this.legL1.cubeList.add(new ModelBox(legL1, 38, 6, -0.5F, 0.0F, -6.0F, 1, 1, 6, 0.0F, false));

        this.legR1 = new AdvancedModelRenderer(this);
        this.legR1.setRotationPoint(-2.5F, -1.25F, -6.0F);
        this.carapace.addChild(legR1);
        this.setRotateAngle(legR1, 0.6981F, 0.6981F, 0.0F);
        this.legR1.cubeList.add(new ModelBox(legR1, 16, 10, -1.5F, 0.5F, -7.0F, 2, 0, 5, 0.0F, false));
        this.legR1.cubeList.add(new ModelBox(legR1, 8, 35, -0.5F, 0.0F, -6.0F, 1, 1, 6, 0.0F, false));

        this.legL2 = new AdvancedModelRenderer(this);
        this.legL2.setRotationPoint(2.75F, -1.5F, -4.5F);
        this.carapace.addChild(legL2);
        this.setRotateAngle(legL2, 0.1745F, -1.0472F, 0.0F);
        this.legL2.cubeList.add(new ModelBox(legL2, 0, 45, -0.5F, 0.0F, -3.0F, 1, 1, 3, 0.0F, false));

        this.legL2_2 = new AdvancedModelRenderer(this);
        this.legL2_2.setRotationPoint(0.0F, 0.0F, -3.0F);
        this.legL2.addChild(legL2_2);
        this.setRotateAngle(legL2_2, 0.48F, 0.0F, 0.0F);
        this.legL2_2.cubeList.add(new ModelBox(legL2_2, 0, 38, -0.49F, -0.01F, -6.0F, 1, 1, 6, 0.0F, false));
        this.legL2_2.cubeList.add(new ModelBox(legL2_2, 21, 10, -0.5F, 0.5F, -7.0F, 2, 0, 7, 0.0F, false));

        this.legR2 = new AdvancedModelRenderer(this);
        this.legR2.setRotationPoint(-2.75F, -1.5F, -4.5F);
        this.carapace.addChild(legR2);
        this.setRotateAngle(legR2, 0.1745F, 1.0472F, 0.0F);
        this.legR2.cubeList.add(new ModelBox(legR2, 42, 43, -0.5F, 0.0F, -3.0F, 1, 1, 3, 0.0F, false));

        this.legR2_2 = new AdvancedModelRenderer(this);
        this.legR2_2.setRotationPoint(0.0F, 0.0F, -3.0F);
        this.legR2.addChild(legR2_2);
        this.setRotateAngle(legR2_2, 0.48F, 0.0F, 0.0F);
        this.legR2_2.cubeList.add(new ModelBox(legR2_2, 34, 23, -0.51F, -0.01F, -6.0F, 1, 1, 6, 0.0F, false));
        this.legR2_2.cubeList.add(new ModelBox(legR2_2, 18, 0, -1.5F, 0.5F, -7.0F, 2, 0, 7, 0.0F, false));

        this.legL3 = new AdvancedModelRenderer(this);
        this.legL3.setRotationPoint(2.75F, -1.5F, -3.5F);
        this.carapace.addChild(legL3);
        this.setRotateAngle(legL3, 0.0873F, -1.5708F, 0.0F);
        this.legL3.cubeList.add(new ModelBox(legL3, 42, 23, -0.5F, 0.0F, -4.0F, 1, 1, 4, 0.0F, false));
        this.legL3.cubeList.add(new ModelBox(legL3, 0, 2, -0.5F, 0.5F, -4.0F, 2, 0, 2, 0.0F, false));

        this.legL3_2 = new AdvancedModelRenderer(this);
        this.legL3_2.setRotationPoint(0.0F, 0.0F, -4.0F);
        this.legL3.addChild(legL3_2);
        this.setRotateAngle(legL3_2, 0.6109F, 0.0F, 0.0F);
        this.legL3_2.cubeList.add(new ModelBox(legL3_2, 31, 37, -0.49F, -0.01F, -6.0F, 1, 1, 6, 0.0F, false));
        this.legL3_2.cubeList.add(new ModelBox(legL3_2, 17, 18, -0.5F, 0.5F, -7.0F, 2, 0, 7, 0.0F, false));

        this.legR3 = new AdvancedModelRenderer(this);
        this.legR3.setRotationPoint(-2.75F, -1.5F, -3.5F);
        this.carapace.addChild(legR3);
        this.setRotateAngle(legR3, 0.0873F, 1.5708F, 0.0F);
        this.legR3.cubeList.add(new ModelBox(legR3, 16, 35, -0.5F, 0.0F, -4.0F, 1, 1, 4, 0.0F, false));
        this.legR3.cubeList.add(new ModelBox(legR3, 0, 0, -1.5F, 0.5F, -4.0F, 2, 0, 2, 0.0F, false));

        this.legR3_2 = new AdvancedModelRenderer(this);
        this.legR3_2.setRotationPoint(0.0F, 0.0F, -4.0F);
        this.legR3.addChild(legR3_2);
        this.setRotateAngle(legR3_2, 0.6109F, 0.0F, 0.0F);
        this.legR3_2.cubeList.add(new ModelBox(legR3_2, 23, 34, -0.51F, -0.01F, -6.0F, 1, 1, 6, 0.0F, false));
        this.legR3_2.cubeList.add(new ModelBox(legR3_2, 14, 0, -1.5F, 0.5F, -7.0F, 2, 0, 7, 0.0F, false));

        this.legL4 = new AdvancedModelRenderer(this);
        this.legL4.setRotationPoint(2.5F, -1.5F, -2.5F);
        this.carapace.addChild(legL4);
        this.setRotateAngle(legL4, -0.1745F, -1.9199F, 0.0F);
        this.legL4.cubeList.add(new ModelBox(legL4, 31, 44, -0.5F, 0.0F, -3.0F, 1, 1, 3, 0.0F, false));

        this.legL4_2 = new AdvancedModelRenderer(this);
        this.legL4_2.setRotationPoint(0.0F, 0.0F, -3.0F);
        this.legL4.addChild(legL4_2);
        this.setRotateAngle(legL4_2, 0.3491F, 0.0F, 0.0F);
        this.legL4_2.cubeList.add(new ModelBox(legL4_2, 24, 41, -0.49F, -0.01F, -4.0F, 1, 1, 4, 0.0F, false));

        this.legL4_3 = new AdvancedModelRenderer(this);
        this.legL4_3.setRotationPoint(0.0F, 0.0F, -4.0F);
        this.legL4_2.addChild(legL4_3);
        this.setRotateAngle(legL4_3, 0.5672F, 0.0F, 0.0F);
        this.legL4_3.cubeList.add(new ModelBox(legL4_3, 35, 30, -0.5F, 0.0F, -6.0F, 1, 1, 6, 0.0F, false));
        this.legL4_3.cubeList.add(new ModelBox(legL4_3, 4, 5, -0.5F, 0.5F, -7.0F, 1, 0, 1, 0.0F, false));

        this.legR4 = new AdvancedModelRenderer(this);
        this.legR4.setRotationPoint(-2.5F, -1.5F, -2.5F);
        this.carapace.addChild(legR4);
        this.setRotateAngle(legR4, -0.1745F, 1.9199F, 0.0F);
        this.legR4.cubeList.add(new ModelBox(legR4, 43, 30, -0.5F, 0.0F, -3.0F, 1, 1, 3, 0.0F, false));

        this.legR4_2 = new AdvancedModelRenderer(this);
        this.legR4_2.setRotationPoint(0.0F, 0.0F, -3.0F);
        this.legR4.addChild(legR4_2);
        this.setRotateAngle(legR4_2, 0.3491F, 0.0F, 0.0F);
        this.legR4_2.cubeList.add(new ModelBox(legR4_2, 22, 27, -0.51F, -0.01F, -4.0F, 1, 1, 4, 0.0F, false));

        this.legR4_3 = new AdvancedModelRenderer(this);
        this.legR4_3.setRotationPoint(0.0F, 0.0F, -4.0F);
        this.legR4_2.addChild(legR4_3);
        this.setRotateAngle(legR4_3, 0.5672F, 0.0F, 0.0F);
        this.legR4_3.cubeList.add(new ModelBox(legR4_3, 0, 31, -0.5F, 0.0F, -6.0F, 1, 1, 6, 0.0F, false));
        this.legR4_3.cubeList.add(new ModelBox(legR4_3, 0, 5, -0.5F, 0.5F, -7.0F, 1, 0, 1, 0.0F, false));

        this.legL5 = new AdvancedModelRenderer(this);
        this.legL5.setRotationPoint(3.0F, -1.5F, -1.5F);
        this.carapace.addChild(legL5);
        this.setRotateAngle(legL5, -0.2618F, -2.618F, 0.0F);
        this.legL5.cubeList.add(new ModelBox(legL5, 9, 42, -0.5F, 0.0F, -5.0F, 1, 1, 5, 0.0F, false));

        this.legL5_2 = new AdvancedModelRenderer(this);
        this.legL5_2.setRotationPoint(0.0F, 0.0F, -5.0F);
        this.legL5.addChild(legL5_2);
        this.setRotateAngle(legL5_2, 0.3491F, 0.0F, 0.0F);
        this.legL5_2.cubeList.add(new ModelBox(legL5_2, 25, 26, -0.49F, -0.01F, -7.0F, 1, 1, 7, 0.0F, false));

        this.legL5_3 = new AdvancedModelRenderer(this);
        this.legL5_3.setRotationPoint(0.0F, 0.0F, -7.0F);
        this.legL5_2.addChild(legL5_3);
        this.setRotateAngle(legL5_3, 0.5672F, 0.0F, 0.0F);
        this.legL5_3.cubeList.add(new ModelBox(legL5_3, 21, 1, -0.5F, 0.0F, -8.0F, 1, 1, 8, 0.0F, false));
        this.legL5_3.cubeList.add(new ModelBox(legL5_3, 2, 5, -0.5F, 0.5F, -9.0F, 1, 0, 1, 0.0F, false));

        this.legR5 = new AdvancedModelRenderer(this);
        this.legR5.setRotationPoint(-3.0F, -1.5F, -1.5F);
        this.carapace.addChild(legR5);
        this.setRotateAngle(legR5, -0.2618F, 2.618F, 0.0F);
        this.legR5.cubeList.add(new ModelBox(legR5, 17, 41, -0.5F, 0.0F, -5.0F, 1, 1, 5, 0.0F, false));

        this.legR5_2 = new AdvancedModelRenderer(this);
        this.legR5_2.setRotationPoint(0.0F, 0.0F, -5.0F);
        this.legR5.addChild(legR5_2);
        this.setRotateAngle(legR5_2, 0.3491F, 0.0F, 0.0F);
        this.legR5_2.cubeList.add(new ModelBox(legR5_2, 24, 18, -0.51F, -0.01F, -7.0F, 1, 1, 7, 0.0F, false));

        this.legR5_3 = new AdvancedModelRenderer(this);
        this.legR5_3.setRotationPoint(0.0F, 0.0F, -7.0F);
        this.legR5_2.addChild(legR5_3);
        this.setRotateAngle(legR5_3, 0.5672F, 0.0F, 0.0F);
        this.legR5_3.cubeList.add(new ModelBox(legR5_3, 14, 18, -0.5F, 0.0F, -8.0F, 1, 1, 8, 0.0F, false));
        this.legR5_3.cubeList.add(new ModelBox(legR5_3, 4, 4, -0.5F, 0.5F, -9.0F, 1, 0, 1, 0.0F, false));

        this.body = new AdvancedModelRenderer(this);
        this.body.setRotationPoint(0.0F, -2.25F, 0.0F);
        this.carapace.addChild(body);
        this.body.cubeList.add(new ModelBox(body, 0, 0, -3.49F, -0.74F, 1.0F, 7, 2, 7, 0.0F, false));
        this.body.cubeList.add(new ModelBox(body, 38, 13, -2.99F, -0.74F, 0.0F, 6, 2, 1, 0.0F, false));

        this.body1 = new AdvancedModelRenderer(this);
        this.body1.setRotationPoint(0.0F, 0.0F, 8.0F);
        this.body.addChild(body1);
        this.body1.cubeList.add(new ModelBox(body1, 33, 18, -3.0F, -0.73F, 0.0F, 6, 2, 3, 0.0F, false));

        this.body2 = new AdvancedModelRenderer(this);
        this.body2.setRotationPoint(0.0F, 0.0F, 3.0F);
        this.body1.addChild(body2);
        this.body2.cubeList.add(new ModelBox(body2, 31, 0, -2.5F, -0.72F, 0.0F, 5, 2, 4, 0.0F, false));

        this.body5 = new AdvancedModelRenderer(this);
        this.body5.setRotationPoint(0.0F, 0.0F, 4.0F);
        this.body2.addChild(body5);
        this.body5.cubeList.add(new ModelBox(body5, 0, 24, -2.0F, -0.19F, 0.0F, 4, 1, 6, 0.0F, false));
        this.body5.cubeList.add(new ModelBox(body5, 31, 14, -1.0F, -0.48F, -0.1F, 2, 1, 3, 0.0F, false));
        this.body5.cubeList.add(new ModelBox(body5, 0, 50, -0.5F, -0.48F, 2.9F, 1, 1, 3, 0.0F, false));

        this.body6 = new AdvancedModelRenderer(this);
        this.body6.setRotationPoint(0.0F, 0.0F, 6.0F);
        this.body5.addChild(body6);
        this.body6.cubeList.add(new ModelBox(body6, 13, 27, -0.5F, -0.23F, -0.1F, 1, 1, 7, 0.0F, false));

        updateDefaultPose();
        animator = ModelAnimator.create();
    }

    @Override
    public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        animate((IAnimatedEntity) entity, f, f1, f2, f3, f4, f5);
        this.carapace.render(f5 * 0.7F);
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
        this.carapace.offsetY = 0.05F;

        float speedMultiplier = 1F;
        EntityPrehistoricFloraAgeableBase ee = (EntityPrehistoricFloraAgeableBase) e;
        if (ee.getIsFast()) {
            speedMultiplier = 1.75F;
        }
        AdvancedModelRenderer[] fishBody = {this.carapace, this.body,this.body1, this.body2, this.body5, this.body6};
        AdvancedModelRenderer[] fishTail = {this.body1, this.body2, this.body5, this.body6};
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

                    this.flap(legR2, speed, 0.2F, true, 3F, 0.5F, f2, 1F);
                    this.flap(legR3, speed, 0.2F, true, 0F, 0.5F, f2, 1F);
                    this.flap(legR4, speed, 0.2F, true, 3F, 0.5F, f2, 1F);
                    this.flap(legR5, speed, 0.2F, true, 0F, 0.5F, f2, 1F);

                    this.swing(legL2, speed * 2F, 0.35F, false, 3F, 0.4F, f2, 1F);
                    this.swing(legL3, speed * 2F, 0.35F, false, 0F, 0.4F, f2, 1F);
                    this.swing(legL4, speed * 2F, 0.35F, false, 3F, 0.4F, f2, 1F);
                    this.swing(legL5, speed * 2F, 0.5F, false, 0F, 0.4F, f2, 1F);

                    this.swing(legR2, speed * 2F, 0.35F, true, 3F, 0.4F, f2, 1F);
                    this.swing(legR3, speed * 2F, 0.35F, true, 0F, 0.4F, f2, 1F);
                    this.swing(legR4, speed * 2F, 0.35F, true, 3F, 0.4F, f2, 1F);
                    this.swing(legR5, speed * 2F, 0.5F, true, 0F, 0.4F, f2, 1F);
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

                        this.swing(legR2, speed * 2F, 0.3F, true, 3F, 0.4F, f2, 0.8F);
                        this.swing(legR3, speed * 2F, 0.3F, true, 0F, 0.4F, f2, 0.8F);
                        this.swing(legR4, speed * 2F, 0.3F, true, 3F, 0.4F, f2, 0.8F);
                        this.swing(legR5, speed * 2F, 0.4F, true, 0F, 0.4F, f2, 0.8F);
                    }
                }
            }

            //this.swing(body, speed, 0.3F, true, 0, 0, f2, 1);
            if (!isAtBottom) {
                this.bob(carapace, -speed * 0.5F, 0.5F, false, f2, 0.8F);
            }
            if (!e.isInWater()) {
                //this.Bodyfront.rotateAngleZ = (float) Math.toRadians(90);
                this.carapace.offsetY = 0.1F;
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
        animator.startKeyframe(6);
        animator.rotate(this.legL1, (float) Math.toRadians(-25), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(this.legL2, (float) Math.toRadians(-25), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(this.legL3, (float) Math.toRadians(-30), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(this.legL4, (float) Math.toRadians(-35), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(this.legL5, (float) Math.toRadians(-45), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(this.legR1, (float) Math.toRadians(25), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(this.legR2, (float) Math.toRadians(25), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(this.legR3, (float) Math.toRadians(30), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(this.legR4, (float) Math.toRadians(35), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(this.legR5, (float) Math.toRadians(45), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.endKeyframe();
        animator.setStaticKeyframe(13);
        animator.resetKeyframe(11);
    }
}
