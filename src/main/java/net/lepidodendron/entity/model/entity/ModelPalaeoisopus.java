package net.lepidodendron.entity.model.entity;

import net.ilexiconn.llibrary.client.model.tools.AdvancedModelBase;
import net.ilexiconn.llibrary.client.model.tools.AdvancedModelRenderer;
import net.minecraft.block.material.Material;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.entity.Entity;
import net.minecraft.util.math.BlockPos;

public class ModelPalaeoisopus extends AdvancedModelBase {
    private final AdvancedModelRenderer body;
    private final AdvancedModelRenderer proboscis;
    private final AdvancedModelRenderer palp_ovigerR;
    private final AdvancedModelRenderer ovigerR;
    private final AdvancedModelRenderer palpR;
    private final AdvancedModelRenderer palp_ovigerL;
    private final AdvancedModelRenderer ovigerL;
    private final AdvancedModelRenderer palpL;
    private final AdvancedModelRenderer body1;
    private final AdvancedModelRenderer body2;
    private final AdvancedModelRenderer body3;
    private final AdvancedModelRenderer body4;
    private final AdvancedModelRenderer body5;
    private final AdvancedModelRenderer body6;
    private final AdvancedModelRenderer legL3;
    private final AdvancedModelRenderer legL3_1;
    private final AdvancedModelRenderer legL4;
    private final AdvancedModelRenderer legL4_1;
    private final AdvancedModelRenderer legL2;
    private final AdvancedModelRenderer legL2_1;
    private final AdvancedModelRenderer legR2;
    private final AdvancedModelRenderer legR2_1;
    private final AdvancedModelRenderer legR3;
    private final AdvancedModelRenderer legR3_1;
    private final AdvancedModelRenderer legR4;
    private final AdvancedModelRenderer legR4_1;
    private final AdvancedModelRenderer legL1;
    private final AdvancedModelRenderer legL1_1;
    private final AdvancedModelRenderer chelicerateL;
    private final AdvancedModelRenderer chelicerateL1;
    private final AdvancedModelRenderer cube_r1;
    private final AdvancedModelRenderer chelicerateR;
    private final AdvancedModelRenderer chelicerateR1;
    private final AdvancedModelRenderer cube_r2;
    private final AdvancedModelRenderer legR1;
    private final AdvancedModelRenderer legR1_1;


    public ModelPalaeoisopus() {
        this.textureWidth = 64;
        this.textureHeight = 64;

        this.body = new AdvancedModelRenderer(this);
        this.body.setRotationPoint(0.0F, 22.0F, 7.0F);
        this.body.cubeList.add(new ModelBox(body, 0, 0, -1.15F, -1.51F, -8.0F, 1, 0, 1, 0.0F, false));
        this.body.cubeList.add(new ModelBox(body, 0, 0, 0.15F, -1.51F, -8.0F, 1, 0, 1, 0.0F, false));
        this.body.cubeList.add(new ModelBox(body, 0, 22, -1.5F, -1.5F, -8.0F, 3, 2, 3, 0.0F, false));

        this.proboscis = new AdvancedModelRenderer(this);
        this.proboscis.setRotationPoint(0.0F, 0.5F, -7.0F);
        this.body.addChild(proboscis);
        this.setRotateAngle(proboscis, 0.8727F, 0.0F, 0.0F);
        this.proboscis.cubeList.add(new ModelBox(proboscis, 0, 35, -0.5F, -0.75F, -0.5F, 1, 3, 1, 0.0F, false));

        this.palp_ovigerR = new AdvancedModelRenderer(this);
        this.palp_ovigerR.setRotationPoint(-1.25F, 0.0F, -7.75F);
        this.body.addChild(palp_ovigerR);
        this.setRotateAngle(palp_ovigerR, 0.0F, 0.1745F, 0.0F);


        this.ovigerR = new AdvancedModelRenderer(this);
        this.ovigerR.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.palp_ovigerR.addChild(ovigerR);
        this.setRotateAngle(ovigerR, 0.4363F, 0.0F, 0.0F);
        this.ovigerR.cubeList.add(new ModelBox(ovigerR, 0, 39, 0.1F, 0.0F, -4.0F, 0, 3, 4, 0.0F, false));

        this.palpR = new AdvancedModelRenderer(this);
        this.palpR.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.palp_ovigerR.addChild(palpR);
        this.setRotateAngle(palpR, 0.3491F, 0.1745F, 0.0F);
        this.palpR.cubeList.add(new ModelBox(palpR, 0, 0, 0.0F, -3.0F, -4.0F, 0, 3, 4, 0.0F, false));

        this.palp_ovigerL = new AdvancedModelRenderer(this);
        this.palp_ovigerL.setRotationPoint(1.25F, 0.0F, -7.75F);
        this.body.addChild(palp_ovigerL);
        this.setRotateAngle(palp_ovigerL, 0.0F, -0.1745F, 0.0F);


        this.ovigerL = new AdvancedModelRenderer(this);
        this.ovigerL.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.palp_ovigerL.addChild(ovigerL);
        this.setRotateAngle(ovigerL, 0.4363F, 0.0F, 0.0F);
        this.ovigerL.cubeList.add(new ModelBox(ovigerL, 0, 39, -0.1F, 0.0F, -4.0F, 0, 3, 4, 0.0F, true));

        this.palpL = new AdvancedModelRenderer(this);
        this.palpL.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.palp_ovigerL.addChild(palpL);
        this.setRotateAngle(palpL, 0.3491F, -0.1745F, 0.0F);
        this.palpL.cubeList.add(new ModelBox(palpL, 0, 0, 0.0F, -3.0F, -4.0F, 0, 3, 4, 0.0F, true));

        this.body1 = new AdvancedModelRenderer(this);
        this.body1.setRotationPoint(0.0F, -0.5F, -5.0F);
        this.body.addChild(body1);
        this.body1.cubeList.add(new ModelBox(body1, 12, 22, -1.49F, -0.5F, -0.005F, 3, 1, 3, 0.0F, false));

        this.body2 = new AdvancedModelRenderer(this);
        this.body2.setRotationPoint(0.0F, 0.0F, 3.0F);
        this.body1.addChild(body2);
        this.body2.cubeList.add(new ModelBox(body2, 0, 13, -1.0F, -0.49F, 0.0F, 2, 1, 2, 0.0F, false));

        this.body3 = new AdvancedModelRenderer(this);
        this.body3.setRotationPoint(0.0F, 0.0F, 2.0F);
        this.body2.addChild(body3);
        this.body3.cubeList.add(new ModelBox(body3, 0, 31, -0.15F, -0.48F, 0.0F, 1, 1, 2, 0.0F, false));
        this.body3.cubeList.add(new ModelBox(body3, 28, 28, -0.85F, -0.49F, 0.01F, 1, 1, 2, 0.0F, false));

        this.body4 = new AdvancedModelRenderer(this);
        this.body4.setRotationPoint(0.0F, 0.0F, 2.0F);
        this.body3.addChild(body4);
        this.body4.cubeList.add(new ModelBox(body4, 11, 30, -0.25F, -0.46F, 0.0F, 1, 1, 2, 0.0F, false));
        this.body4.cubeList.add(new ModelBox(body4, 22, 28, -0.75F, -0.47F, 0.01F, 1, 1, 2, 0.0F, false));

        this.body5 = new AdvancedModelRenderer(this);
        this.body5.setRotationPoint(0.0F, 0.0F, 2.0F);
        this.body4.addChild(body5);
        this.body5.cubeList.add(new ModelBox(body5, 9, 22, -0.5F, -0.45F, 0.0F, 1, 1, 2, 0.0F, false));

        this.body6 = new AdvancedModelRenderer(this);
        this.body6.setRotationPoint(0.0F, 0.0F, 2.0F);
        this.body5.addChild(body6);
        this.body6.cubeList.add(new ModelBox(body6, 17, 28, -0.49F, -0.44F, 0.0F, 1, 1, 3, 0.0F, false));

        this.legL3 = new AdvancedModelRenderer(this);
        this.legL3.setRotationPoint(1.5F, 0.1F, 1.5F);
        this.body1.addChild(legL3);
        this.setRotateAngle(legL3, 0.0F, -0.1745F, 0.5672F);
        this.legL3.cubeList.add(new ModelBox(legL3, 11, 26, -0.5F, -0.25F, -0.5F, 4, 1, 1, 0.0F, false));

        this.legL3_1 = new AdvancedModelRenderer(this);
        this.legL3_1.setRotationPoint(3.5F, 0.25F, 0.0F);
        this.legL3.addChild(legL3_1);
        this.setRotateAngle(legL3_1, 0.0F, 0.0F, 0.3491F);
        this.legL3_1.cubeList.add(new ModelBox(legL3_1, 0, 16, 0.0F, -5.75F, 0.0F, 9, 6, 0, 0.0F, false));

        this.legL4 = new AdvancedModelRenderer(this);
        this.legL4.setRotationPoint(1.5F, 0.1F, 2.5F);
        this.body1.addChild(legL4);
        this.setRotateAngle(legL4, 0.0F, -0.4363F, 0.6109F);
        this.legL4.cubeList.add(new ModelBox(legL4, 11, 26, -0.5F, -0.25F, -0.5F, 4, 1, 1, 0.0F, false));

        this.legL4_1 = new AdvancedModelRenderer(this);
        this.legL4_1.setRotationPoint(3.5F, 0.25F, 0.0F);
        this.legL4.addChild(legL4_1);
        this.setRotateAngle(legL4_1, 0.0F, 0.0F, 0.3491F);
        this.legL4_1.cubeList.add(new ModelBox(legL4_1, 0, 16, 0.0F, -5.75F, 0.0F, 9, 6, 0, 0.0F, false));

        this.legL2 = new AdvancedModelRenderer(this);
        this.legL2.setRotationPoint(1.5F, 0.1F, 0.5F);
        this.body1.addChild(legL2);
        this.setRotateAngle(legL2, 0.0F, 0.0F, 0.5236F);
        this.legL2.cubeList.add(new ModelBox(legL2, 11, 26, -0.5F, -0.25F, -0.5F, 4, 1, 1, 0.0F, false));

        this.legL2_1 = new AdvancedModelRenderer(this);
        this.legL2_1.setRotationPoint(3.5F, 0.25F, 0.0F);
        this.legL2.addChild(legL2_1);
        this.setRotateAngle(legL2_1, 0.0F, 0.0F, 0.3491F);
        this.legL2_1.cubeList.add(new ModelBox(legL2_1, 0, 16, 0.0F, -5.75F, 0.0F, 9, 6, 0, 0.0F, false));

        this.legR2 = new AdvancedModelRenderer(this);
        this.legR2.setRotationPoint(-1.5F, 0.1F, 0.5F);
        this.body1.addChild(legR2);
        this.setRotateAngle(legR2, 0.0F, 0.0F, -0.5236F);
        this.legR2.cubeList.add(new ModelBox(legR2, 10, 28, -3.5F, -0.25F, -0.5F, 4, 1, 1, 0.0F, false));

        this.legR2_1 = new AdvancedModelRenderer(this);
        this.legR2_1.setRotationPoint(-3.5F, 0.25F, 0.0F);
        this.legR2.addChild(legR2_1);
        this.setRotateAngle(legR2_1, 0.0F, 0.0F, -0.3491F);
        this.legR2_1.cubeList.add(new ModelBox(legR2_1, 18, 16, -9.0F, -5.75F, 0.0F, 9, 6, 0, 0.0F, false));

        this.legR3 = new AdvancedModelRenderer(this);
        this.legR3.setRotationPoint(-1.5F, 0.1F, 1.5F);
        this.body1.addChild(legR3);
        this.setRotateAngle(legR3, 0.0F, 0.1745F, -0.5672F);
        this.legR3.cubeList.add(new ModelBox(legR3, 10, 28, -3.5F, -0.25F, -0.5F, 4, 1, 1, 0.0F, false));

        this.legR3_1 = new AdvancedModelRenderer(this);
        this.legR3_1.setRotationPoint(-3.5F, 0.25F, 0.0F);
        this.legR3.addChild(legR3_1);
        this.setRotateAngle(legR3_1, 0.0F, 0.0F, -0.3491F);
        this.legR3_1.cubeList.add(new ModelBox(legR3_1, 18, 16, -9.0F, -5.75F, 0.0F, 9, 6, 0, 0.0F, false));

        this.legR4 = new AdvancedModelRenderer(this);
        this.legR4.setRotationPoint(-1.5F, 0.1F, 2.5F);
        this.body1.addChild(legR4);
        this.setRotateAngle(legR4, 0.0F, 0.4363F, -0.6109F);
        this.legR4.cubeList.add(new ModelBox(legR4, 10, 28, -3.5F, -0.25F, -0.5F, 4, 1, 1, 0.0F, false));

        this.legR4_1 = new AdvancedModelRenderer(this);
        this.legR4_1.setRotationPoint(-3.5F, 0.25F, 0.0F);
        this.legR4.addChild(legR4_1);
        this.setRotateAngle(legR4_1, 0.0F, 0.0F, -0.3491F);
        this.legR4_1.cubeList.add(new ModelBox(legR4_1, 18, 16, -9.0F, -5.75F, 0.0F, 9, 6, 0, 0.0F, false));

        this.legL1 = new AdvancedModelRenderer(this);
        this.legL1.setRotationPoint(1.25F, -0.5F, -6.25F);
        this.body.addChild(legL1);
        this.setRotateAngle(legL1, 0.0F, 0.1745F, 0.1745F);
        this.legL1.cubeList.add(new ModelBox(legL1, 21, 22, -0.25F, -0.5F, -1.25F, 4, 1, 2, 0.0F, false));

        this.legL1_1 = new AdvancedModelRenderer(this);
        this.legL1_1.setRotationPoint(3.75F, 0.0F, -0.25F);
        this.legL1.addChild(legL1_1);
        this.setRotateAngle(legL1_1, 0.0F, 0.1745F, 0.0F);
        this.legL1_1.cubeList.add(new ModelBox(legL1_1, 0, 0, 0.0F, 0.0F, -8.0F, 12, 0, 8, 0.0F, false));

        this.chelicerateL = new AdvancedModelRenderer(this);
        this.chelicerateL.setRotationPoint(0.0F, -1.0F, -8.0F);
        this.body.addChild(chelicerateL);
        this.setRotateAngle(chelicerateL, 0.0F, -0.1745F, 0.0F);
        this.chelicerateL.cubeList.add(new ModelBox(chelicerateL, 0, 27, 0.0F, 0.0F, -2.5F, 1, 1, 3, 0.0F, false));

        this.chelicerateL1 = new AdvancedModelRenderer(this);
        this.chelicerateL1.setRotationPoint(1.0F, 0.5F, -2.5F);
        this.chelicerateL.addChild(chelicerateL1);
        this.setRotateAngle(chelicerateL1, 0.5236F, 0.0F, 0.0F);


        this.cube_r1 = new AdvancedModelRenderer(this);
        this.cube_r1.setRotationPoint(-0.5F, 0.0F, 2.5F);
        this.chelicerateL1.addChild(cube_r1);
        this.setRotateAngle(cube_r1, 0.0F, 0.0F, 1.309F);
        this.cube_r1.cubeList.add(new ModelBox(cube_r1, 0, 0, -1.0F, 0.0F, -5.5F, 2, 0, 3, 0.0F, false));

        this.chelicerateR = new AdvancedModelRenderer(this);
        this.chelicerateR.setRotationPoint(0.0F, -1.0F, -8.0F);
        this.body.addChild(chelicerateR);
        this.setRotateAngle(chelicerateR, 0.0F, 0.1745F, 0.0F);
        this.chelicerateR.cubeList.add(new ModelBox(chelicerateR, 5, 28, -1.0F, 0.0F, -2.5F, 1, 1, 3, 0.0F, false));

        this.chelicerateR1 = new AdvancedModelRenderer(this);
        this.chelicerateR1.setRotationPoint(-1.0F, 0.5F, -2.5F);
        this.chelicerateR.addChild(chelicerateR1);
        this.setRotateAngle(chelicerateR1, 0.5236F, 0.0F, 0.0F);


        this.cube_r2 = new AdvancedModelRenderer(this);
        this.cube_r2.setRotationPoint(0.5F, 0.0F, 2.5F);
        this.chelicerateR1.addChild(cube_r2);
        this.setRotateAngle(cube_r2, 0.0F, 0.0F, -1.309F);
        this.cube_r2.cubeList.add(new ModelBox(cube_r2, 0, 7, -1.0F, 0.0F, -5.5F, 2, 0, 3, 0.0F, false));

        this.legR1 = new AdvancedModelRenderer(this);
        this.legR1.setRotationPoint(-1.25F, -0.5F, -6.25F);
        this.body.addChild(legR1);
        this.setRotateAngle(legR1, 0.0F, -0.1745F, -0.1745F);
        this.legR1.cubeList.add(new ModelBox(legR1, 22, 25, -3.75F, -0.5F, -1.25F, 4, 1, 2, 0.0F, false));

        this.legR1_1 = new AdvancedModelRenderer(this);
        this.legR1_1.setRotationPoint(-3.75F, 0.0F, -0.25F);
        this.legR1.addChild(legR1_1);
        this.setRotateAngle(legR1_1, 0.0F, -0.1745F, 0.0F);
        this.legR1_1.cubeList.add(new ModelBox(legR1_1, 0, 8, -12.0F, 0.0F, -8.0F, 12, 0, 8, 0.0F, false));

        updateDefaultPose();
    }

    @Override
    public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        this.body.render(f5 * 0.38F);
    }

    public void renderStatic(float f) {
        GlStateManager.pushMatrix();
        GlStateManager.enableBlend();
        GlStateManager.blendFunc(GlStateManager.SourceFactor.SRC_ALPHA, GlStateManager.DestFactor.ONE_MINUS_SRC_ALPHA);
        this.body.render(0.023F);
        GlStateManager.disableBlend();
        GlStateManager.popMatrix();
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
        this.body.offsetY = 0.75F;

        boolean isAtBottom = false;
        if (e.getPosition().getY() - 1 > 1) {
            BlockPos pos = new BlockPos(e.getPosition().getX(), e.getPosition().getY() - 1, e.getPosition().getZ());
            isAtBottom = ((e.isInsideOfMaterial(Material.WATER) || e.isInsideOfMaterial(Material.CORAL))
                    && ((e.world.getBlockState(pos)).getMaterial() != Material.WATER)
                    && ((double)e.getPosition().getY() + 0.334D) > e.posY);
        }

        AdvancedModelRenderer[] armsL = {this.legL1, this.legL1_1};
        AdvancedModelRenderer[] armsR = {this.legR1, this.legR1_1};
        AdvancedModelRenderer[] legsL = {this.legL2, this.legL3, this.legL4};
        AdvancedModelRenderer[] legsR = {this.legR2, this.legR3, this.legR4};
        AdvancedModelRenderer[] tail = {this.body2, this.body3, this.body4, this.body5, this.body6};
        float move = 1;
        if (f3 == 0) { move = 0; }

        if (isAtBottom) {
            this.flap(legL2, 0.4F * move, 0.2F, false, 3F, 0.5F, f2, 1F);
            this.flap(legL3, 0.4F * move, 0.2F, false, 0F, 0.5F, f2, 1F);
            this.flap(legL4, 0.4F * move, 0.2F, false, 2F, 0.5F, f2, 1F);

            this.flap(legR2, 0.4F * move, 0.2F, true, 0F, 0.5F, f2, 1F);
            this.flap(legR3, 0.4F * move, 0.2F, true, 3F, 0.5F, f2, 1F);
            this.flap(legR4, 0.4F * move, 0.2F, true, -1F, 0.5F, f2, 1F);

            this.swing(legL2, 0.4F * move, 0.3F, false, 0F, 0.4F, f2, 0.8F);
            this.swing(legL3, 0.4F * move, 0.3F, false, 3F, 0.4F, f2, 0.8F);
            this.swing(legL4, 0.4F * move, 0.3F, false, 2F, 0.4F, f2, 0.8F);

            this.swing(legR2, 0.4F * move, 0.3F, true, 0F, 0.4F, f2, 0.8F);
            this.swing(legR3, 0.4F * move, 0.3F, true, 3F, 0.4F, f2, 0.8F);
            this.swing(legR4, 0.4F * move, 0.3F, true, -1F, 0.4F, f2, 0.8F);

            this.chainWave(tail, 0.5F, 0.05f, -1, f2, 0.4F);
            this.bob(body, 0.5F, 0.02F, true, f2, 0.5F);
            if (f3 != 0) {
                this.chainSwing(armsL, 0.4F, -0.2F, 1, f2, 0.6F);
                this.chainSwing(armsR, 0.4F, 0.2F, 1, f2, 0.6F);
            }
            else {
                this.chainSwing(armsL, 0.2F, -0.1F, 1, f2, 0.4F);
                this.chainSwing(armsR, 0.2F, 0.1F, 1, f2, 0.4F);
            }
        }
        else {
            this.chainWave(legsL, 0.25F, 0.4F, -3, f2, 1);
            this.chainWave(legsR, 0.25F, 0.4F, -3, f2, 1);
            this.flap(legL2, 0.25F, -0.6F, false, 0.0F, -0.5F, f2, 0.6F);
            this.flap(legR2, 0.25F, 0.6F, false, 1.0F, 0.5F, f2, 0.6F);
            this.flap(legL3, 0.25F, -0.6F, false, 2.0F, -0.5F, f2, 0.6F);
            this.flap(legR3, 0.25F, 0.6F, false, 0.0F, 0.5F, f2, 0.6F);
            this.flap(legL4, 0.25F, -0.6F, false, 1.0F, -0.5F, f2, 0.6F);
            this.flap(legR4, 0.25F, 0.6F, false, 2.0F, 0.5F, f2, 0.6F);
            this.chainWave(tail, 0.5F, 0.12f, -2, f2, 0.5F);
            this.bob(body, 0.25F, 0.2F, false, f2, 1);
            this.chainSwing(armsL, 0.25F, -0.05F, 1, f2, 0.4F);
            this.chainSwing(armsR, 0.25F, 0.05F, 1, f2, 0.4F);
            this.flap(legL1, 0.25F, -0.4F, false, 2.0F, -0.5F, f2, 0.3F);
            this.flap(legR1, 0.25F, 0.4F, false, 2.0F, 0.5F, f2, 0.3F);
        }

        this.swing(chelicerateL, 0.4F, -0.2F, false, 0.5F, -0.1F, f2, 0.8F);
        this.swing(chelicerateR, 0.4F, 0.2F, false, 0.5F, 0.1F, f2, 0.8F);
        this.walk(chelicerateL1, 0.4F, -0.2F, false, 0.5F, -0.1F, f2, 0.8F);
        this.walk(chelicerateR1, 0.4F, -0.2F, false, 0.5F, -0.1F, f2, 0.8F);

    }
}
