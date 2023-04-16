package net.lepidodendron.entity.model.entity;

import net.ilexiconn.llibrary.client.model.tools.AdvancedModelBase;
import net.ilexiconn.llibrary.client.model.tools.AdvancedModelRenderer;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.entity.Entity;

public class ModelCanadaspis extends AdvancedModelBase {
    private final AdvancedModelRenderer body;
    private final AdvancedModelRenderer antennaL;
    private final AdvancedModelRenderer antennaR;
    private final AdvancedModelRenderer shell;
    private final AdvancedModelRenderer cube_r1;
    private final AdvancedModelRenderer cube_r2;
    private final AdvancedModelRenderer cube_r3;
    private final AdvancedModelRenderer cube_r4;
    private final AdvancedModelRenderer cube_r5;
    private final AdvancedModelRenderer cube_r6;
    private final AdvancedModelRenderer body1;
    private final AdvancedModelRenderer body2;
    private final AdvancedModelRenderer body3;
    private final AdvancedModelRenderer body4;
    private final AdvancedModelRenderer legR;
    private final AdvancedModelRenderer legR2;
    private final AdvancedModelRenderer legR3;
    private final AdvancedModelRenderer legR4;
    private final AdvancedModelRenderer legR5;
    private final AdvancedModelRenderer legR6;
    private final AdvancedModelRenderer legR7;
    private final AdvancedModelRenderer legR8;
    private final AdvancedModelRenderer legR9;
    private final AdvancedModelRenderer legR10;
    private final AdvancedModelRenderer legL;
    private final AdvancedModelRenderer legL2;
    private final AdvancedModelRenderer legL3;
    private final AdvancedModelRenderer legL4;
    private final AdvancedModelRenderer legL5;
    private final AdvancedModelRenderer legL6;
    private final AdvancedModelRenderer legL7;
    private final AdvancedModelRenderer legL8;
    private final AdvancedModelRenderer legL9;
    private final AdvancedModelRenderer legL10;

    public ModelCanadaspis() {
        this.textureWidth = 32;
        this.textureHeight = 32;

        this.body = new AdvancedModelRenderer(this);
        this.body.setRotationPoint(0.0F, 21.25F, 0.0F);
        this.body.cubeList.add(new ModelBox(body, 16, 14, -1.5F, -3.0F, -5.0F, 3, 3, 3, 0.0F, false));
        this.body.cubeList.add(new ModelBox(body, 11, 14, -1.75F, -2.5F, -6.0F, 1, 1, 1, 0.0F, false));
        this.body.cubeList.add(new ModelBox(body, 0, 14, 0.75F, -2.5F, -6.0F, 1, 1, 1, 0.0F, false));

        this.antennaL = new AdvancedModelRenderer(this);
        this.antennaL.setRotationPoint(0.0F, -1.0F, -4.75F);
        this.body.addChild(antennaL);
        this.setRotateAngle(antennaL, 0.0F, -0.3054F, 0.0F);
        this.antennaL.cubeList.add(new ModelBox(antennaL, 0, 3, 0.0F, 0.0F, -3.0F, 2, 0, 3, 0.0F, false));

        this.antennaR = new AdvancedModelRenderer(this);
        this.antennaR.setRotationPoint(0.0F, -1.0F, -4.75F);
        this.body.addChild(antennaR);
        this.setRotateAngle(antennaR, 0.0F, 0.3054F, 0.0F);
        this.antennaR.cubeList.add(new ModelBox(antennaR, 0, 0, -2.0F, 0.0F, -3.0F, 2, 0, 3, 0.0F, false));

        this.shell = new AdvancedModelRenderer(this);
        this.shell.setRotationPoint(0.0F, -3.25F, -5.25F);
        this.body.addChild(shell);
        this.setRotateAngle(shell, 0.0873F, 0.0F, 0.0F);
        this.shell.cubeList.add(new ModelBox(shell, 8, 0, -0.5F, -0.5F, -0.5F, 1, 0, 9, 0.0F, false));

        this.cube_r1 = new AdvancedModelRenderer(this);
        this.cube_r1.setRotationPoint(-0.5F, -0.5F, 4.25F);
        this.shell.addChild(cube_r1);
        this.setRotateAngle(cube_r1, 0.0F, 0.0F, -0.5236F);
        this.cube_r1.cubeList.add(new ModelBox(cube_r1, 0, 0, -2.0F, 0.0F, -4.5F, 2, 0, 9, 0.0F, false));

        this.cube_r2 = new AdvancedModelRenderer(this);
        this.cube_r2.setRotationPoint(0.5F, -0.5F, 4.25F);
        this.shell.addChild(cube_r2);
        this.setRotateAngle(cube_r2, 0.0F, 0.0F, 0.5236F);
        this.cube_r2.cubeList.add(new ModelBox(cube_r2, 0, 0, 0.0F, 0.0F, -4.5F, 2, 0, 9, 0.0F, true));

        this.cube_r3 = new AdvancedModelRenderer(this);
        this.cube_r3.setRotationPoint(-2.4F, 0.4F, 4.75F);
        this.shell.addChild(cube_r3);
        this.setRotateAngle(cube_r3, 0.0F, 0.0F, 0.3054F);
        this.cube_r3.cubeList.add(new ModelBox(cube_r3, 0, 0, 0.2F, 0.05F, -5.0F, 0, 4, 9, 0.0F, true));

        this.cube_r4 = new AdvancedModelRenderer(this);
        this.cube_r4.setRotationPoint(2.4F, 0.4F, 4.75F);
        this.shell.addChild(cube_r4);
        this.setRotateAngle(cube_r4, 0.0F, 0.0F, -0.3054F);
        this.cube_r4.cubeList.add(new ModelBox(cube_r4, 0, 0, -0.2F, 0.05F, -5.0F, 0, 4, 9, 0.0F, false));

        this.cube_r5 = new AdvancedModelRenderer(this);
        this.cube_r5.setRotationPoint(-2.4F, 0.4F, 4.75F);
        this.shell.addChild(cube_r5);
        this.setRotateAngle(cube_r5, 0.0F, 0.0F, -0.3491F);
        this.cube_r5.cubeList.add(new ModelBox(cube_r5, 0, 23, -2.3075F, 3.3386F, -2.0F, 0, 1, 5, 0.0F, true));

        this.cube_r6 = new AdvancedModelRenderer(this);
        this.cube_r6.setRotationPoint(2.4F, 0.4F, 4.75F);
        this.shell.addChild(cube_r6);
        this.setRotateAngle(cube_r6, 0.0F, 0.0F, 0.3491F);
        this.cube_r6.cubeList.add(new ModelBox(cube_r6, 0, 23, 2.3075F, 3.3386F, -2.0F, 0, 1, 5, 0.0F, false));

        this.body1 = new AdvancedModelRenderer(this);
        this.body1.setRotationPoint(0.0F, -2.0F, -2.0F);
        this.body.addChild(body1);
        this.body1.cubeList.add(new ModelBox(body1, 0, 14, -1.49F, -1.01F, 0.0F, 3, 3, 5, 0.0F, false));

        this.body2 = new AdvancedModelRenderer(this);
        this.body2.setRotationPoint(0.0F, 0.0F, 5.0F);
        this.body1.addChild(body2);
        this.setRotateAngle(body2, -0.0873F, 0.0F, 0.0F);
        this.body2.cubeList.add(new ModelBox(body2, 14, 20, -1.5F, -1.0F, 0.0F, 3, 3, 2, 0.0F, false));

        this.body3 = new AdvancedModelRenderer(this);
        this.body3.setRotationPoint(0.0F, 0.0F, 2.0F);
        this.body2.addChild(body3);
        this.setRotateAngle(body3, -0.0873F, 0.0F, 0.0F);
        this.body3.cubeList.add(new ModelBox(body3, 19, 0, -1.49F, -1.01F, 0.0F, 3, 3, 2, 0.0F, false));

        this.body4 = new AdvancedModelRenderer(this);
        this.body4.setRotationPoint(0.0F, 0.0F, 2.0F);
        this.body3.addChild(body4);
        this.setRotateAngle(body4, -0.0873F, 0.0F, 0.0F);
        this.body4.cubeList.add(new ModelBox(body4, 19, 5, -1.0F, -0.5F, 0.0F, 2, 2, 2, 0.0F, false));
        this.body4.cubeList.add(new ModelBox(body4, 5, 2, 0.25F, 1.05F, 1.5F, 1, 0, 2, 0.0F, false));
        this.body4.cubeList.add(new ModelBox(body4, 5, 0, -1.25F, 1.05F, 1.5F, 1, 0, 2, 0.0F, false));

        this.legR = new AdvancedModelRenderer(this);
        this.legR.setRotationPoint(-0.25F, 1.75F, 0.1F);
        this.body1.addChild(legR);
        this.setRotateAngle(legR, -0.3491F, 0.0F, 0.1745F);
        this.legR.cubeList.add(new ModelBox(legR, 0, 6, -2.0F, 0.0F, 0.0F, 2, 3, 0, 0.0F, false));

        this.legR2 = new AdvancedModelRenderer(this);
        this.legR2.setRotationPoint(-0.25F, 1.75F, 0.6F);
        this.body1.addChild(legR2);
        this.setRotateAngle(legR2, -0.2618F, 0.0F, 0.1745F);
        this.legR2.cubeList.add(new ModelBox(legR2, 0, 6, -2.0F, 0.0F, 0.0F, 2, 3, 0, 0.0F, false));

        this.legR3 = new AdvancedModelRenderer(this);
        this.legR3.setRotationPoint(-0.25F, 1.75F, 1.1F);
        this.body1.addChild(legR3);
        this.setRotateAngle(legR3, -0.0873F, 0.0F, 0.1745F);
        this.legR3.cubeList.add(new ModelBox(legR3, 0, 6, -2.0F, 0.0F, 0.0F, 2, 3, 0, 0.0F, false));

        this.legR4 = new AdvancedModelRenderer(this);
        this.legR4.setRotationPoint(-0.25F, 1.75F, 1.6F);
        this.body1.addChild(legR4);
        this.setRotateAngle(legR4, 0.0436F, 0.0F, 0.1745F);
        this.legR4.cubeList.add(new ModelBox(legR4, 0, 6, -2.0F, 0.0F, 0.0F, 2, 3, 0, 0.0F, false));

        this.legR5 = new AdvancedModelRenderer(this);
        this.legR5.setRotationPoint(-0.25F, 1.75F, 2.1F);
        this.body1.addChild(legR5);
        this.setRotateAngle(legR5, 0.1309F, 0.0F, 0.1745F);
        this.legR5.cubeList.add(new ModelBox(legR5, 0, 6, -2.0F, 0.0F, 0.0F, 2, 3, 0, 0.0F, false));

        this.legR6 = new AdvancedModelRenderer(this);
        this.legR6.setRotationPoint(-0.25F, 1.75F, 2.6F);
        this.body1.addChild(legR6);
        this.setRotateAngle(legR6, 0.1745F, 0.0F, 0.1745F);
        this.legR6.cubeList.add(new ModelBox(legR6, 0, 6, -2.0F, 0.0F, 0.0F, 2, 3, 0, 0.0F, false));

        this.legR7 = new AdvancedModelRenderer(this);
        this.legR7.setRotationPoint(-0.25F, 1.75F, 3.1F);
        this.body1.addChild(legR7);
        this.setRotateAngle(legR7, 0.2182F, 0.0F, 0.1745F);
        this.legR7.cubeList.add(new ModelBox(legR7, 0, 6, -2.0F, 0.0F, 0.0F, 2, 3, 0, 0.0F, false));

        this.legR8 = new AdvancedModelRenderer(this);
        this.legR8.setRotationPoint(-0.25F, 1.75F, 3.6F);
        this.body1.addChild(legR8);
        this.setRotateAngle(legR8, 0.2618F, 0.0F, 0.1745F);
        this.legR8.cubeList.add(new ModelBox(legR8, 0, 6, -2.0F, 0.0F, 0.0F, 2, 3, 0, 0.0F, false));

        this.legR9 = new AdvancedModelRenderer(this);
        this.legR9.setRotationPoint(-0.25F, 1.75F, 4.1F);
        this.body1.addChild(legR9);
        this.setRotateAngle(legR9, 0.3054F, 0.0F, 0.1745F);
        this.legR9.cubeList.add(new ModelBox(legR9, 0, 6, -2.0F, 0.0F, 0.0F, 2, 3, 0, 0.0F, false));

        this.legR10 = new AdvancedModelRenderer(this);
        this.legR10.setRotationPoint(-0.25F, 1.75F, 4.6F);
        this.body1.addChild(legR10);
        this.setRotateAngle(legR10, 0.3491F, 0.0F, 0.1745F);
        this.legR10.cubeList.add(new ModelBox(legR10, 0, 6, -2.0F, 0.0F, 0.0F, 2, 3, 0, 0.0F, false));

        this.legL = new AdvancedModelRenderer(this);
        this.legL.setRotationPoint(0.25F, 1.75F, 0.1F);
        this.body1.addChild(legL);
        this.setRotateAngle(legL, -0.3491F, 0.0F, -0.1745F);
        this.legL.cubeList.add(new ModelBox(legL, 4, 6, 0.0F, 0.0F, 0.0F, 2, 3, 0, 0.0F, false));

        this.legL2 = new AdvancedModelRenderer(this);
        this.legL2.setRotationPoint(0.25F, 1.75F, 0.6F);
        this.body1.addChild(legL2);
        this.setRotateAngle(legL2, -0.2618F, 0.0F, -0.1745F);
        this.legL2.cubeList.add(new ModelBox(legL2, 4, 6, 0.0F, 0.0F, 0.0F, 2, 3, 0, 0.0F, false));

        this.legL3 = new AdvancedModelRenderer(this);
        this.legL3.setRotationPoint(0.25F, 1.75F, 1.1F);
        this.body1.addChild(legL3);
        this.setRotateAngle(legL3, -0.0873F, 0.0F, -0.1745F);
        this.legL3.cubeList.add(new ModelBox(legL3, 4, 6, 0.0F, 0.0F, 0.0F, 2, 3, 0, 0.0F, false));

        this.legL4 = new AdvancedModelRenderer(this);
        this.legL4.setRotationPoint(0.25F, 1.75F, 1.6F);
        this.body1.addChild(legL4);
        this.setRotateAngle(legL4, 0.0436F, 0.0F, -0.1745F);
        this.legL4.cubeList.add(new ModelBox(legL4, 4, 6, 0.0F, 0.0F, 0.0F, 2, 3, 0, 0.0F, false));

        this.legL5 = new AdvancedModelRenderer(this);
        this.legL5.setRotationPoint(0.25F, 1.75F, 2.1F);
        this.body1.addChild(legL5);
        this.setRotateAngle(legL5, 0.1309F, 0.0F, -0.1745F);
        this.legL5.cubeList.add(new ModelBox(legL5, 4, 6, 0.0F, 0.0F, 0.0F, 2, 3, 0, 0.0F, false));

        this.legL6 = new AdvancedModelRenderer(this);
        this.legL6.setRotationPoint(0.25F, 1.75F, 2.6F);
        this.body1.addChild(legL6);
        this.setRotateAngle(legL6, 0.1745F, 0.0F, -0.1745F);
        this.legL6.cubeList.add(new ModelBox(legL6, 4, 6, 0.0F, 0.0F, 0.0F, 2, 3, 0, 0.0F, false));

        this.legL7 = new AdvancedModelRenderer(this);
        this.legL7.setRotationPoint(0.25F, 1.75F, 3.1F);
        this.body1.addChild(legL7);
        this.setRotateAngle(legL7, 0.2182F, 0.0F, -0.1745F);
        this.legL7.cubeList.add(new ModelBox(legL7, 4, 6, 0.0F, 0.0F, 0.0F, 2, 3, 0, 0.0F, false));

        this.legL8 = new AdvancedModelRenderer(this);
        this.legL8.setRotationPoint(0.25F, 1.75F, 3.6F);
        this.body1.addChild(legL8);
        this.setRotateAngle(legL8, 0.2618F, 0.0F, -0.1745F);
        this.legL8.cubeList.add(new ModelBox(legL8, 4, 6, 0.0F, 0.0F, 0.0F, 2, 3, 0, 0.0F, false));

        this.legL9 = new AdvancedModelRenderer(this);
        this.legL9.setRotationPoint(0.25F, 1.75F, 4.1F);
        this.body1.addChild(legL9);
        this.setRotateAngle(legL9, 0.3054F, 0.0F, -0.1745F);
        this.legL9.cubeList.add(new ModelBox(legL9, 4, 6, 0.0F, 0.0F, 0.0F, 2, 3, 0, 0.0F, false));

        this.legL10 = new AdvancedModelRenderer(this);
        this.legL10.setRotationPoint(0.25F, 1.75F, 4.6F);
        this.body1.addChild(legL10);
        this.setRotateAngle(legL10, 0.3491F, 0.0F, -0.1745F);
        this.legL10.cubeList.add(new ModelBox(legL10, 4, 6, 0.0F, 0.0F, 0.0F, 2, 3, 0, 0.0F, false));

        updateDefaultPose();
    }

    @Override
    public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        this.body.render(f5);
    }

    public void renderStatic(float f) {
        //GlStateManager.pushMatrix();
        //GlStateManager.enableBlend();
        //GlStateManager.blendFunc(GlStateManager.SourceFactor.SRC_ALPHA, GlStateManager.DestFactor.ONE_MINUS_SRC_ALPHA);
        //GlStateManager.disableCull();
        this.body.render(0.01f);
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
        //this.body.offsetY = 1.15F;

        AdvancedModelRenderer[] TailF = {this.body2,this.body3,this.body4};
        float speed = 0.4F;
        if (!e.isInWater()) {
            speed = 0.7F;
        }

        float speedLeg = 1.5F;
        float degreeLeg = 0.3F;
        float weightLeg = -0.5F;
        this.flap(legL, speedLeg, -degreeLeg, false, 0, -weightLeg, f2, 0.7F);
        this.flap(legR, speedLeg, degreeLeg, false, 0, weightLeg, f2, 0.7F);
        this.flap(legL2, speedLeg, -degreeLeg, false, 0.5F, -weightLeg, f2, 0.7F);
        this.flap(legR2, speedLeg, degreeLeg, false, 0.5F, weightLeg, f2, 0.7F);
        this.flap(legL3, speedLeg, -degreeLeg, false, 1.0F, -weightLeg, f2, 0.7F);
        this.flap(legR3, speedLeg, degreeLeg, false, 1.0F, weightLeg, f2, 0.7F);
        this.flap(legL4, speedLeg, -degreeLeg, false, 1.5F, -weightLeg, f2, 0.7F);
        this.flap(legR4, speedLeg, degreeLeg, false, 1.5F, weightLeg, f2, 0.7F);
        this.flap(legL5, speedLeg, -degreeLeg, false, 2.0F, -weightLeg, f2, 0.7F);
        this.flap(legR5, speedLeg, degreeLeg, false, 2.0F, weightLeg, f2, 0.7F);
        this.flap(legL6, speedLeg, -degreeLeg, false, 2.5F, -weightLeg, f2, 0.7F);
        this.flap(legR6, speedLeg, degreeLeg, false, 2.5F, weightLeg, f2, 0.7F);
        this.flap(legL7, speedLeg, -degreeLeg, false, 3.0F, -weightLeg, f2, 0.7F);
        this.flap(legR7, speedLeg, degreeLeg, false, 3.0F, weightLeg, f2, 0.7F);
        this.flap(legL8, speedLeg, -degreeLeg, false, 3.5F, -weightLeg, f2, 0.7F);
        this.flap(legR8, speedLeg, degreeLeg, false, 3.5F, weightLeg, f2, 0.7F);
        this.flap(legL9, speedLeg, -degreeLeg, false, 4.0F, -weightLeg, f2, 0.7F);
        this.flap(legR9, speedLeg, degreeLeg, false, 4.0F, weightLeg, f2, 0.7F);
        this.flap(legL10, speedLeg, -degreeLeg, false, 4.5F, -weightLeg, f2, 0.7F);
        this.flap(legR10, speedLeg, degreeLeg, false, 4.5F, weightLeg, f2, 0.7F);

        if (f3 != 0) {
            this.chainWave(TailF, 0.65F, 0.045F, -1.5, f2, 0.8F);
        }
        else {
            this.chainWave(TailF, 0.25F, 0.015F, -1.5, f2, 0.8F);
        }

        if (!e.isInWater()) {
            this.bob(body, -speed * 1.5F, 2F, false, f2, 1);
        } else {
            if (f3 == 0.0F) {
                this.bob(body, -speed, 0.01F, false, f2, 2);
            } else {
                this.bob(body, -speed, 0.09F, false, f2, 2);
            }
        }

        this.swing(antennaL, 0.75F, -0.4F, false, 0, -0.1F, f2, 0.8F);
        this.swing(antennaR, 0.75F, 0.4F, false, 0, 0.1F, f2, 0.8F);

    }
}
