package net.lepidodendron.entity.model.entity;

import net.ilexiconn.llibrary.client.model.tools.AdvancedModelRenderer;
import net.lepidodendron.entity.EntityPrehistoricFloraEoandromeda;
import net.lepidodendron.entity.model.ModelBasePalaeopedia;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLiving;
import org.lwjgl.opengl.GL11;

public class ModelCambrianJelly extends ModelBasePalaeopedia {
    private final AdvancedModelRenderer main;

    public ModelCambrianJelly() {
        this.textureWidth = 64;
        this.textureHeight = 64;

        this.main = new AdvancedModelRenderer(this);
        this.main.setRotationPoint(0.0F, 24.0F, 0.0F);
        this.main.cubeList.add(new ModelBox(main, 0, 26, -4.0F, -12.0F, -4.0F, 8, 11, 8, 0.0F, false));
        this.main.cubeList.add(new ModelBox(main, 0, 0, -7.5F, -2.0F, -5.5F, 15, 2, 11, 0.0F, false));
        this.main.cubeList.add(new ModelBox(main, 31, 14, -5.5F, -2.0F, -7.5F, 11, 2, 2, 0.0F, false));
        this.main.cubeList.add(new ModelBox(main, 25, 26, -5.5F, -2.0F, 5.5F, 11, 2, 2, 0.0F, false));
        this.main.cubeList.add(new ModelBox(main, 0, 14, -5.0F, -2.9F, -5.0F, 10, 1, 10, 0.0F, false));
        this.main.cubeList.add(new ModelBox(main, 44, 40, -2.0F, -0.9F, -2.0F, 4, 1, 4, 0.0F, false));

        updateDefaultPose();
    }

    @Override
    public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        GlStateManager.enableBlend();
        GlStateManager.blendFunc(GL11.GL_SRC_ALPHA, GL11.GL_ONE_MINUS_SRC_ALPHA);
        GlStateManager.color(1.0F, 1.0F, 1.0F, 0.96F);

        this.main.render(f5);
        GlStateManager.disableBlend();

    }

    @Override
    public void renderStaticBook(float f) {
        //Rotations, positions and sizing:
        this.main.offsetY = -0.6F;
        this.main.offsetX = 0.0F;
        this.main.offsetZ = 2.0F;
        this.main.rotateAngleY = (float)Math.toRadians(120);
        this.main.rotateAngleX = (float)Math.toRadians(1);
        this.main.rotateAngleZ = (float)Math.toRadians(0);
        this.main.scaleChildren = true;
        float scaler = 2.0F;
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



        float speed = 0.07F;
        if (!e.isInWater()) {
            speed = 0.0F;
        }
        else {
            //pulsations:
            this.main.scaleChildren = false;
            float floatPulsate = this.moveBox(0.05F, 0.2F, false, f2, 1);
            //System.err.println("pulsate: " + floatPulsate);
            this.main.setScale(1-floatPulsate, 1, 1-floatPulsate);
        }
        if (e instanceof EntityLiving && !((EntityLiving) e).isAIDisabled()) {
            this.swing(main, speed * 0.4F, 0.25F, true, 0, 0, f2, 0.6F);
            this.walk(main, speed * 0.3F, 0.4F, true, 0, 0, f2, 0.6F);
            this.flap(main, speed * 0.2F, 0.4F, true, 0, 0, f2, 0.6F);
            this.bob(main, -speed * 0.5F, 0.5F, false, f2, 0.6F);
            EntityPrehistoricFloraEoandromeda ee = (EntityPrehistoricFloraEoandromeda) e;
            this.main.rotateAngleY = (float) Math.toRadians(ee.getRotationDegree());
            if (!e.isInWater()) {
                this.resetToDefaultPose();
                this.main.rotateAngleZ = (float) Math.toRadians(90);
                //this.main.offsetY = 0.2F;
                this.main.scaleChildren = true;
                this.main.setScaleX(0.2F);
                this.main.setScaleZ(1.2F);
            }
        }
    }
}
