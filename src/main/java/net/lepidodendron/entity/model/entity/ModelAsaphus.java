package net.lepidodendron.entity.model.entity;

import net.ilexiconn.llibrary.client.model.tools.AdvancedModelRenderer;
import net.lepidodendron.entity.EntityPrehistoricFloraAsaphus;
import net.lepidodendron.entity.model.ModelBasePalaeopedia;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

public class ModelAsaphus extends ModelBasePalaeopedia {
    private final AdvancedModelRenderer body;
    private final AdvancedModelRenderer cube_r1;
    private final AdvancedModelRenderer cube_r2;
    private final AdvancedModelRenderer cube_r3;
    private final AdvancedModelRenderer cube_r4;
    private final AdvancedModelRenderer eyeL;
    private final AdvancedModelRenderer eyeR;
    private final AdvancedModelRenderer antennaL;
    private final AdvancedModelRenderer antennaR;
    private final AdvancedModelRenderer legR1;
    private final AdvancedModelRenderer legR2;
    private final AdvancedModelRenderer legR3;
    private final AdvancedModelRenderer legR4;
    private final AdvancedModelRenderer legR5;
    private final AdvancedModelRenderer legR6;
    private final AdvancedModelRenderer legR7;
    private final AdvancedModelRenderer legL1;
    private final AdvancedModelRenderer legL2;
    private final AdvancedModelRenderer legL3;
    private final AdvancedModelRenderer legL4;
    private final AdvancedModelRenderer legL5;
    private final AdvancedModelRenderer legL6;
    private final AdvancedModelRenderer legL7;

    public ModelAsaphus() {
        this.textureWidth = 32;
        this.textureHeight = 32;

        this.body = new AdvancedModelRenderer(this);
        this.body.setRotationPoint(0.0F, 24.0F, -1.0F);
        this.body.cubeList.add(new ModelBox(body, 9, 6, -1.5F, -1.0F, -7.0F, 3, 1, 4, 0.0F, false));
        this.body.cubeList.add(new ModelBox(body, 11, 11, -2.0F, -1.5F, -5.51F, 4, 1, 3, 0.0F, false));
        this.body.cubeList.add(new ModelBox(body, 20, 20, -0.5F, -1.75F, -4.51F, 1, 1, 2, 0.0F, false));
        this.body.cubeList.add(new ModelBox(body, 19, 3, -0.5F, -1.5F, 2.49F, 1, 1, 3, 0.0F, false));
        this.body.cubeList.add(new ModelBox(body, 0, 14, -2.0F, -1.25F, 2.49F, 4, 1, 2, 0.0F, false));
        this.body.cubeList.add(new ModelBox(body, 8, 19, 0.25F, -0.99F, -4.5F, 3, 1, 2, 0.0F, false));
        this.body.cubeList.add(new ModelBox(body, 0, 17, -3.25F, -0.99F, -4.5F, 3, 1, 2, 0.0F, false));
        this.body.cubeList.add(new ModelBox(body, 19, 7, -1.5F, -1.5F, -6.5F, 3, 1, 1, 0.0F, false));
        this.body.cubeList.add(new ModelBox(body, 0, 6, -1.0F, -1.5F, -2.5F, 2, 1, 5, 0.0F, false));
        this.body.cubeList.add(new ModelBox(body, 0, 0, -3.0F, -1.0F, -2.5F, 6, 1, 5, 0.0F, false));
        this.body.cubeList.add(new ModelBox(body, 0, 12, -3.0F, -1.0F, 2.5F, 6, 1, 1, 0.0F, false));
        this.body.cubeList.add(new ModelBox(body, 17, 0, -1.5F, -1.0F, 3.75F, 3, 1, 2, 0.0F, false));

        this.cube_r1 = new AdvancedModelRenderer(this);
        this.cube_r1.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.body.addChild(cube_r1);
        this.setRotateAngle(cube_r1, 0.0F, 0.5236F, 0.0F);
        this.cube_r1.cubeList.add(new ModelBox(cube_r1, 16, 16, -4.25F, -0.99F, 1.25F, 2, 1, 3, 0.0F, false));

        this.cube_r2 = new AdvancedModelRenderer(this);
        this.cube_r2.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.body.addChild(cube_r2);
        this.setRotateAngle(cube_r2, 0.0F, -0.5236F, 0.0F);
        this.cube_r2.cubeList.add(new ModelBox(cube_r2, 9, 15, 2.25F, -0.985F, 1.25F, 2, 1, 3, 0.0F, false));

        this.cube_r3 = new AdvancedModelRenderer(this);
        this.cube_r3.setRotationPoint(0.0F, 0.0F, 1.0F);
        this.body.addChild(cube_r3);
        this.setRotateAngle(cube_r3, 0.0F, 0.5236F, 0.0F);
        this.cube_r3.cubeList.add(new ModelBox(cube_r3, 0, 20, 4.5F, -1.01F, -6.0F, 1, 1, 3, 0.0F, false));

        this.cube_r4 = new AdvancedModelRenderer(this);
        this.cube_r4.setRotationPoint(0.0F, 0.0F, 1.0F);
        this.body.addChild(cube_r4);
        this.setRotateAngle(cube_r4, 0.0F, -0.5236F, 0.0F);
        this.cube_r4.cubeList.add(new ModelBox(cube_r4, 15, 20, -5.5F, -1.01F, -6.0F, 1, 1, 3, 0.0F, false));

        this.eyeL = new AdvancedModelRenderer(this);
        this.eyeL.setRotationPoint(1.0F, -1.5F, -4.0F);
        this.body.addChild(eyeL);
        this.setRotateAngle(eyeL, 0.3491F, 0.0F, 0.0F);
        this.eyeL.cubeList.add(new ModelBox(eyeL, 17, 3, -0.25F, -0.5F, -0.5F, 1, 1, 1, 0.0F, false));
        this.eyeL.cubeList.add(new ModelBox(eyeL, 0, 0, -0.25F, -3.5F, -0.5F, 1, 3, 1, 0.0F, false));
        this.eyeL.cubeList.add(new ModelBox(eyeL, 9, 6, 0.0F, -4.5F, -0.5F, 1, 1, 1, 0.0F, false));

        this.eyeR = new AdvancedModelRenderer(this);
        this.eyeR.setRotationPoint(-1.0F, -1.5F, -4.0F);
        this.body.addChild(eyeR);
        this.setRotateAngle(eyeR, 0.3491F, 0.0F, 0.0F);
        this.eyeR.cubeList.add(new ModelBox(eyeR, 5, 21, -0.75F, -0.5F, -0.5F, 1, 1, 1, 0.0F, false));
        this.eyeR.cubeList.add(new ModelBox(eyeR, 0, 6, -0.75F, -3.5F, -0.5F, 1, 3, 1, 0.0F, false));
        this.eyeR.cubeList.add(new ModelBox(eyeR, 9, 8, -1.0F, -4.5F, -0.5F, 1, 1, 1, 0.0F, false));

        this.antennaL = new AdvancedModelRenderer(this);
        this.antennaL.setRotationPoint(1.0F, -0.25F, -7.0F);
        this.body.addChild(antennaL);
        this.setRotateAngle(antennaL, 0.0F, -0.5236F, 0.0F);
        this.antennaL.cubeList.add(new ModelBox(antennaL, 8, 28, -0.25F, 0.0F, -3.75F, 4, 0, 4, 0.0F, false));

        this.antennaR = new AdvancedModelRenderer(this);
        this.antennaR.setRotationPoint(-1.0F, -0.25F, -7.0F);
        this.body.addChild(antennaR);
        this.setRotateAngle(antennaR, 0.0F, 0.5236F, 0.0F);
        this.antennaR.cubeList.add(new ModelBox(antennaR, 0, 28, -3.75F, 0.0F, -3.75F, 4, 0, 4, 0.0F, false));

        this.legR1 = new AdvancedModelRenderer(this);
        this.legR1.setRotationPoint(-0.5F, 0.0F, -4.5F);
        this.body.addChild(legR1);
        this.setRotateAngle(legR1, 0.0F, 0.0F, -0.1745F);
        this.legR1.cubeList.add(new ModelBox(legR1, 18, 9, -3.0F, 0.02F, -0.5F, 3, 0, 1, 0.0F, false));

        this.legR2 = new AdvancedModelRenderer(this);
        this.legR2.setRotationPoint(-0.5F, 0.0F, -3.0F);
        this.body.addChild(legR2);
        this.setRotateAngle(legR2, 0.0F, 0.0F, -0.1745F);
        this.legR2.cubeList.add(new ModelBox(legR2, 18, 9, -3.0F, 0.02F, -0.5F, 3, 0, 1, 0.0F, false));

        this.legR3 = new AdvancedModelRenderer(this);
        this.legR3.setRotationPoint(-0.5F, 0.0F, -1.5F);
        this.body.addChild(legR3);
        this.setRotateAngle(legR3, 0.0F, 0.0F, -0.1745F);
        this.legR3.cubeList.add(new ModelBox(legR3, 18, 9, -3.0F, 0.02F, -0.5F, 3, 0, 1, 0.0F, false));

        this.legR4 = new AdvancedModelRenderer(this);
        this.legR4.setRotationPoint(-0.5F, 0.0F, 0.0F);
        this.body.addChild(legR4);
        this.setRotateAngle(legR4, 0.0F, 0.0F, -0.1745F);
        this.legR4.cubeList.add(new ModelBox(legR4, 18, 9, -3.0F, 0.02F, -0.5F, 3, 0, 1, 0.0F, false));

        this.legR5 = new AdvancedModelRenderer(this);
        this.legR5.setRotationPoint(-0.5F, 0.0F, 1.5F);
        this.body.addChild(legR5);
        this.setRotateAngle(legR5, 0.0F, 0.0F, -0.1745F);
        this.legR5.cubeList.add(new ModelBox(legR5, 18, 9, -3.0F, 0.02F, -0.5F, 3, 0, 1, 0.0F, false));

        this.legR6 = new AdvancedModelRenderer(this);
        this.legR6.setRotationPoint(-0.5F, 0.0F, 3.0F);
        this.body.addChild(legR6);
        this.setRotateAngle(legR6, 0.0F, 0.0F, -0.1745F);
        this.legR6.cubeList.add(new ModelBox(legR6, 18, 9, -3.0F, 0.02F, -0.5F, 3, 0, 1, 0.0F, false));

        this.legR7 = new AdvancedModelRenderer(this);
        this.legR7.setRotationPoint(-0.5F, 0.0F, 4.5F);
        this.body.addChild(legR7);
        this.setRotateAngle(legR7, 0.0F, 0.0F, -0.1745F);
        this.legR7.cubeList.add(new ModelBox(legR7, 18, 9, -3.0F, 0.02F, -0.5F, 3, 0, 1, 0.0F, false));

        this.legL1 = new AdvancedModelRenderer(this);
        this.legL1.setRotationPoint(0.5F, 0.0F, -4.5F);
        this.body.addChild(legL1);
        this.setRotateAngle(legL1, 0.0F, 0.0F, 0.1745F);
        this.legL1.cubeList.add(new ModelBox(legL1, 15, 15, 0.0F, 0.02F, -0.5F, 3, 0, 1, 0.0F, false));

        this.legL2 = new AdvancedModelRenderer(this);
        this.legL2.setRotationPoint(0.5F, 0.0F, -3.0F);
        this.body.addChild(legL2);
        this.setRotateAngle(legL2, 0.0F, 0.0F, 0.1745F);
        this.legL2.cubeList.add(new ModelBox(legL2, 15, 15, 0.0F, 0.02F, -0.5F, 3, 0, 1, 0.0F, false));

        this.legL3 = new AdvancedModelRenderer(this);
        this.legL3.setRotationPoint(0.5F, 0.0F, -1.5F);
        this.body.addChild(legL3);
        this.setRotateAngle(legL3, 0.0F, 0.0F, 0.1745F);
        this.legL3.cubeList.add(new ModelBox(legL3, 15, 15, 0.0F, 0.02F, -0.5F, 3, 0, 1, 0.0F, false));

        this.legL4 = new AdvancedModelRenderer(this);
        this.legL4.setRotationPoint(0.5F, 0.0F, 0.0F);
        this.body.addChild(legL4);
        this.setRotateAngle(legL4, 0.0F, 0.0F, 0.1745F);
        this.legL4.cubeList.add(new ModelBox(legL4, 15, 15, 0.0F, 0.02F, -0.5F, 3, 0, 1, 0.0F, false));

        this.legL5 = new AdvancedModelRenderer(this);
        this.legL5.setRotationPoint(0.5F, 0.0F, 1.5F);
        this.body.addChild(legL5);
        this.setRotateAngle(legL5, 0.0F, 0.0F, 0.1745F);
        this.legL5.cubeList.add(new ModelBox(legL5, 15, 15, 0.0F, 0.02F, -0.5F, 3, 0, 1, 0.0F, false));

        this.legL6 = new AdvancedModelRenderer(this);
        this.legL6.setRotationPoint(0.5F, 0.0F, 3.0F);
        this.body.addChild(legL6);
        this.setRotateAngle(legL6, 0.0F, 0.0F, 0.1745F);
        this.legL6.cubeList.add(new ModelBox(legL6, 15, 15, 0.0F, 0.02F, -0.5F, 3, 0, 1, 0.0F, false));

        this.legL7 = new AdvancedModelRenderer(this);
        this.legL7.setRotationPoint(0.5F, 0.0F, 4.5F);
        this.body.addChild(legL7);
        this.setRotateAngle(legL7, 0.0F, 0.0F, 0.1745F);
        this.legL7.cubeList.add(new ModelBox(legL7, 15, 15, 0.0F, 0.02F, -0.5F, 3, 0, 1, 0.0F, false));

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
        this.body.render(0.01F);
        //GlStateManager.enableCull();
        //GlStateManager.disableBlend();
        //GlStateManager.popMatrix();
    }
    @Override
    public void renderStaticBook(float f) {

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
        //this.body.offsetY = 0.91F;

        this.eyeL.rotateAngleZ += f3 / (180F / (float) Math.PI) * 0.5;
        this.eyeL.rotateAngleX += f3 / (180F / (float) Math.PI) * 0.5;
        this.eyeR.rotateAngleZ += f3 / (180F / (float) Math.PI) * 0.5;
        this.eyeR.rotateAngleX += f3 / (180F / (float) Math.PI) * 0.5;

        AdvancedModelRenderer[] legsL = {this.legL1, this.legL2, this.legL3, this.legL4, this.legL5, this.legL6, this.legL7};
        AdvancedModelRenderer[] legsR = {this.legR1, this.legR2, this.legR3, this.legR4, this.legR5, this.legR6, this.legR7};

        if (((EntityPrehistoricFloraAsaphus)e).getIsMoving()) {
            this.chainWave(legsL, 0.2F, 0.2F, -3, f2, 1);
            this.chainWave(legsR, 0.6F, 0.2F, -3, f2, 1);

            this.flap(legL1, 0.5F, -0.5F, false, 0, -0.5F, f2, 0.3F);
            this.flap(legR1, 0.5F, 0.5F, false, 0, 0.5F, f2, 0.3F);
            this.flap(legL2, 0.5F, -0.5F, false, 1.0F, -0.5F, f2, 0.3F);
            this.flap(legR2, 0.5F, 0.5F, false, 1.0F, 0.5F, f2, 0.3F);
            this.flap(legL3, 0.5F, -0.5F, false, 2.0F, -0.5F, f2, 0.3F);
            this.flap(legR3, 0.5F, 0.5F, false, 2.0F, 0.5F, f2, 0.3F);
            this.flap(legL4, 0.5F, -0.5F, false, 3.0F, -0.5F, f2, 0.3F);
            this.flap(legR4, 0.5F, 0.5F, false, 3.0F, 0.5F, f2, 0.3F);
            this.flap(legL5, 0.5F, -0.5F, false, 4.0F, -0.5F, f2, 0.3F);
            this.flap(legR5, 0.5F, 0.5F, false, 4.0F, 0.5F, f2, 0.3F);
            this.flap(legL6, 0.5F, -0.5F, false, 5.0F, -0.5F, f2, 0.3F);
            this.flap(legR6, 0.5F, 0.5F, false, 5.0F, 0.5F, f2, 0.3F);
            this.flap(legL7, 0.5F, -0.5F, false, 6.0F, -0.5F, f2, 0.3F);
            this.flap(legR7, 0.5F, 0.5F, false, 6.0F, 0.5F, f2, 0.3F);
        }

        this.swing(antennaL, 0.35F, -0.2F, false, 0, 0.1F, f2, 0.8F);
        this.swing(antennaR, 0.35F, 0.2F, false, 0, -0.1F, f2, 0.8F);

    }
}
