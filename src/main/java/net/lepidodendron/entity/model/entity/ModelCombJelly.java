package net.lepidodendron.entity.model.entity;

import net.ilexiconn.llibrary.client.model.tools.AdvancedModelBase;
import net.ilexiconn.llibrary.client.model.tools.AdvancedModelRenderer;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLiving;
import org.lwjgl.opengl.GL11;

public class ModelCombJelly extends AdvancedModelBase {
    private final AdvancedModelRenderer body;
    private final AdvancedModelRenderer cube_r1;
    private final AdvancedModelRenderer cube_r2;
    private final AdvancedModelRenderer fin1;
    private final AdvancedModelRenderer fin2;
    private final AdvancedModelRenderer fin3;
    private final AdvancedModelRenderer fin4;

    public ModelCombJelly() {
        this.textureWidth = 64;
        this.textureHeight = 64;

        this.body = new AdvancedModelRenderer(this);
        this.body.setRotationPoint(0.0F, 24.0F, 0.0F);
        this.body.cubeList.add(new ModelBox(body, 0, 16, 0.0F, -17.0F, -6.0F, 0, 8, 12, 0.0F, false));
        this.body.cubeList.add(new ModelBox(body, 0, 0, -2.0F, -16.0F, -2.0F, 4, 7, 4, 0.0F, false));
        this.body.cubeList.add(new ModelBox(body, 0, 0, -0.5F, -19.0F, -0.5F, 1, 2, 1, 0.0F, false));

        this.cube_r1 = new AdvancedModelRenderer(this);
        this.cube_r1.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.body.addChild(cube_r1);
        this.setRotateAngle(cube_r1, 0.0F, -1.0472F, 0.0F);
        this.cube_r1.cubeList.add(new ModelBox(cube_r1, 0, 8, 0.0F, -17.0F, -6.0F, 0, 8, 12, 0.0F, false));

        this.cube_r2 = new AdvancedModelRenderer(this);
        this.cube_r2.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.body.addChild(cube_r2);
        this.setRotateAngle(cube_r2, 0.0F, -2.0944F, 0.0F);
        this.cube_r2.cubeList.add(new ModelBox(cube_r2, 0, 0, 0.0F, -17.0F, -6.0F, 0, 8, 12, 0.0F, false));

        this.fin1 = new AdvancedModelRenderer(this);
        this.fin1.setRotationPoint(0.0F, -9.0F, -2.0F);
        this.body.addChild(fin1);
        this.setRotateAngle(fin1, -0.7854F, 0.0F, 0.0F);
        this.fin1.cubeList.add(new ModelBox(fin1, 24, 15, -2.5F, 0.0F, 0.0F, 5, 5, 0, 0.0F, false));

        this.fin2 = new AdvancedModelRenderer(this);
        this.fin2.setRotationPoint(0.0F, -9.0F, 2.0F);
        this.body.addChild(fin2);
        this.setRotateAngle(fin2, 0.7854F, 0.0F, 0.0F);
        this.fin2.cubeList.add(new ModelBox(fin2, 16, 0, -2.5F, 0.0F, 0.0F, 5, 5, 0, 0.0F, false));

        this.fin3 = new AdvancedModelRenderer(this);
        this.fin3.setRotationPoint(-2.0F, -9.0F, 0.0F);
        this.body.addChild(fin3);
        this.setRotateAngle(fin3, 0.0F, 0.0F, 0.7854F);
        this.fin3.cubeList.add(new ModelBox(fin3, 24, 5, 0.0F, 0.0F, -2.5F, 0, 5, 5, 0.0F, false));

        this.fin4 = new AdvancedModelRenderer(this);
        this.fin4.setRotationPoint(2.0F, -9.0F, 0.0F);
        this.body.addChild(fin4);
        this.setRotateAngle(fin4, 0.0F, 0.0F, -0.7854F);
        this.fin4.cubeList.add(new ModelBox(fin4, 16, 0, 0.0F, 0.0F, -2.5F, 0, 5, 5, 0.0F, false));

        updateDefaultPose();
    }

    @Override
    public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        GlStateManager.enableBlend();
        GlStateManager.blendFunc(GL11.GL_SRC_ALPHA, GL11.GL_ONE_MINUS_SRC_ALPHA);
        GlStateManager.color(1.0F, 1.0F, 1.0F, 0.94F);

        this.body.render(f5 * 0.28F);
        GlStateManager.disableBlend();

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
        this.body.setScaleX(1.0F);
        this.body.setScaleZ(1.0F);
        this.body.scaleChildren = false;
        this.body.offsetY = 1.12F;

        AdvancedModelRenderer[] tentacle1 = {this.fin1};
        AdvancedModelRenderer[] tentacle2 = {this.fin2};
        AdvancedModelRenderer[] tentacle3 = {this.fin3};
        AdvancedModelRenderer[] tentacle4 = {this.fin4};

        float speed = 0.07F;
        if (!e.isInWater()) {
            speed = 0.0F;
        }
        else {
            //pulsations:
            this.body.scaleChildren = false;
            float floatPulsate = this.moveBox(0.12F, 0.2F, false, f2, 1);
            //System.err.println("pulsate: " + floatPulsate);
            this.body.setScale(1-floatPulsate, 1, 1-floatPulsate);
        }
        if (e instanceof EntityLiving && !((EntityLiving) e).isAIDisabled()) {
            this.swing(body, speed * 0.4F, 0.2F, true, 0, 0, f2, 1);
            this.walk(body, speed * 0.3F, 0.4F, true, 0, 0, f2, 1);
            this.flap(body, speed * 0.2F, 0.4F, true, 0, 0, f2, 1);
            this.chainFlap(tentacle1, speed, 0.4F, -3, f2, 1);
            this.chainFlap(tentacle3, speed, -0.4F, -3, f2, 1);
            this.chainWave(tentacle2, speed, 0.4F, -3, f2, 1);
            this.chainWave(tentacle4, speed, -0.4F, -3, f2, 1);
            this.bob(body, -speed * 0.5F, 1F, false, f2, 1);

            if (!e.isInWater()) {
                this.resetToDefaultPose();
                this.body.rotateAngleZ = (float) Math.toRadians(90);
                this.body.offsetY = 1.08F;
                this.body.scaleChildren = true;
                this.body.setScaleX(0.2F);
                this.body.setScaleZ(1.2F);
            }
        }
    }
}
