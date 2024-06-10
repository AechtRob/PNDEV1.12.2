package net.lepidodendron.entity.model.entity;

import net.ilexiconn.llibrary.client.model.tools.AdvancedModelRenderer;
import net.lepidodendron.entity.model.ModelBasePalaeopedia;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLiving;

public class ModelEnoploura extends ModelBasePalaeopedia {
    private final AdvancedModelRenderer body;
    private final AdvancedModelRenderer antennaL;
    private final AdvancedModelRenderer antennaR;
    private final AdvancedModelRenderer body2;
    private final AdvancedModelRenderer finL;
    private final AdvancedModelRenderer finR;
    private final AdvancedModelRenderer finL2;
    private final AdvancedModelRenderer finR2;
    private final AdvancedModelRenderer body3;
    private final AdvancedModelRenderer body4;

    public ModelEnoploura() {
        this.textureWidth = 32;
        this.textureHeight = 32;

        this.body = new AdvancedModelRenderer(this);
        this.body.setRotationPoint(0.0F, 24.0F, 2.0F);
        this.body.cubeList.add(new ModelBox(body, 0, 0, -2.5F, -2.0F, -7.0F, 5, 2, 8, 0.0F, false));
        this.body.cubeList.add(new ModelBox(body, 0, 0, -1.0F, -1.5F, -8.0F, 2, 1, 1, 0.0F, false));

        this.antennaL = new AdvancedModelRenderer(this);
        this.antennaL.setRotationPoint(2.4F, -1.0F, -7.0F);
        this.body.addChild(antennaL);
        this.setRotateAngle(antennaL, 0.0F, -0.3491F, 0.0F);
        this.antennaL.cubeList.add(new ModelBox(antennaL, 0, 3, 0.0F, -0.5F, -4.0F, 0, 1, 4, 0.0F, false));

        this.antennaR = new AdvancedModelRenderer(this);
        this.antennaR.setRotationPoint(-2.4F, -1.0F, -7.0F);
        this.body.addChild(antennaR);
        this.setRotateAngle(antennaR, 0.0F, 0.3491F, 0.0F);
        this.antennaR.cubeList.add(new ModelBox(antennaR, 0, 2, 0.0F, -0.5F, -4.0F, 0, 1, 4, 0.0F, false));

        this.body2 = new AdvancedModelRenderer(this);
        this.body2.setRotationPoint(0.0F, -1.0F, 1.0F);
        this.body.addChild(body2);
        this.body2.cubeList.add(new ModelBox(body2, 6, 10, -1.0F, -0.5F, 0.0F, 2, 1, 3, 0.0F, false));

        this.finL = new AdvancedModelRenderer(this);
        this.finL.setRotationPoint(1.0F, 0.0F, 2.9F);
        this.body2.addChild(finL);
        this.setRotateAngle(finL, 0.0F, -0.3491F, -0.0873F);
        this.finL.cubeList.add(new ModelBox(finL, 0, 5, 0.0F, -1.0F, 0.0F, 2, 1, 0, 0.0F, false));

        this.finR = new AdvancedModelRenderer(this);
        this.finR.setRotationPoint(-1.0F, 0.0F, 2.9F);
        this.body2.addChild(finR);
        this.setRotateAngle(finR, 0.0F, 0.3491F, 0.0873F);
        this.finR.cubeList.add(new ModelBox(finR, 0, 3, -2.0F, -1.0F, 0.0F, 2, 1, 0, 0.0F, false));

        this.finL2 = new AdvancedModelRenderer(this);
        this.finL2.setRotationPoint(1.0F, 0.0F, 2.9F);
        this.body2.addChild(finL2);
        this.setRotateAngle(finL2, 0.0F, -0.3491F, 0.0873F);
        this.finL2.cubeList.add(new ModelBox(finL2, 0, 4, 0.0F, 0.0F, 0.0F, 2, 1, 0, 0.0F, false));

        this.finR2 = new AdvancedModelRenderer(this);
        this.finR2.setRotationPoint(-1.0F, 0.0F, 2.9F);
        this.body2.addChild(finR2);
        this.setRotateAngle(finR2, 0.0F, 0.3491F, -0.0873F);
        this.finR2.cubeList.add(new ModelBox(finR2, 0, 2, -2.0F, 0.0F, 0.0F, 2, 1, 0, 0.0F, false));

        this.body3 = new AdvancedModelRenderer(this);
        this.body3.setRotationPoint(0.0F, 0.0F, 3.0F);
        this.body2.addChild(body3);
        this.body3.cubeList.add(new ModelBox(body3, 0, 10, -0.5F, -0.49F, 0.0F, 1, 1, 4, 0.0F, false));

        this.body4 = new AdvancedModelRenderer(this);
        this.body4.setRotationPoint(0.0F, 0.0F, 4.0F);
        this.body3.addChild(body4);
        this.body4.cubeList.add(new ModelBox(body4, 0, 0, -0.5F, 0.0F, 0.0F, 1, 0, 6, 0.0F, false));

        updateDefaultPose();
    }

    @Override
    public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        this.body.render(f5 * 0.2F);
    }
    public void renderStatic(float f) {
        //GlStateManager.pushMatrix();
        //GlStateManager.enableBlend();
        //GlStateManager.disableCull();
        //GlStateManager.blendFunc(GlStateManager.SourceFactor.SRC_ALPHA, GlStateManager.DestFactor.ONE_MINUS_SRC_ALPHA);
        this.body.offsetZ = -0.08F;
        this.body.render(0.021F);
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
        this.body.offsetY = 1.1F;
        //this.Gills.rotateAngleY = f3 / (180F / (float) Math.PI);
        //this.Gills.rotateAngleX = f4 / (180F / (float) Math.PI);

        //this.Tailfin.setScale(1.1F, 1.1F, 1.1F);
        AdvancedModelRenderer[] fishTail = {this.body2, this.body3, this.body4};
        float speed = 0.2F;
        if (!e.isInWater()) {
            speed = 0.5F;
        }
        if (e instanceof EntityLiving && !((EntityLiving) e).isAIDisabled()) {
            this.chainWave(fishTail, speed * 2, 0.15F, -3, f2, 1);
            this.chainSwing(fishTail, speed, 0.26F, -3, f2, 1);
            this.finL.flap(speed * 7, -(float)Math.toRadians(25), false, 0, -(float)Math.toRadians(25), f2, 1F);
            //this.finL2.flap(speed * 6, -(float)Math.toRadians(25), false, 0, -(float)Math.toRadians(25), f2, 1F);
            this.finR.flap(speed * 7, (float)Math.toRadians(25), false, 0, (float)Math.toRadians(25), f2, 1F);
            //this.finR2.flap(speed * 6, (float)Math.toRadians(25), false, 0, (float)Math.toRadians(25), f2, 1F);

            this.finL.swing(speed * 7, (float)Math.toRadians(35), false, 0, (float)Math.toRadians(35)*0.66F, f2, 1F);
            this.finL2.swing(speed * 7, (float)Math.toRadians(35), false, 0, (float)Math.toRadians(35)*0.66F, f2, 1F);
            this.finR.swing(speed * 7, -(float)Math.toRadians(35), false, 0, -(float)Math.toRadians(35)*0.66F, f2, 1F);
            this.finR2.swing(speed * 7, -(float)Math.toRadians(35), false, 0, -(float)Math.toRadians(35)*0.66F, f2, 1F);

            this.swing(body, speed, 0.06F, true, 0, 0, f2, 1);
            if (!e.isInWater()) {
                //this.body.rotateAngleZ = (float) Math.toRadians(90);
                this.body.offsetY = 1.2F;
                this.bob(body, -speed, 5F, false, f2, 1);
            }
        }
    }
}
