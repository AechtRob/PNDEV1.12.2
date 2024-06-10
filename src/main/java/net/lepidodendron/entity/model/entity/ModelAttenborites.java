package net.lepidodendron.entity.model.entity;

import net.ilexiconn.llibrary.client.model.tools.AdvancedModelRenderer;
import net.lepidodendron.entity.model.ModelBasePalaeopedia;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLiving;
import org.lwjgl.opengl.GL11;

public class ModelAttenborites extends ModelBasePalaeopedia {
    private final AdvancedModelRenderer bb_main;

    public ModelAttenborites() {
        textureWidth = 16;
        textureHeight = 16;

        bb_main = new AdvancedModelRenderer(this);
        bb_main.setRotationPoint(0.0F, 21.0F, 5.0F);
        bb_main.cubeList.add(new ModelBox(bb_main, 0, 0, -1.0F, -6.0F, -6.5F, 2, 2, 3, -0.001F, false));
        bb_main.cubeList.add(new ModelBox(bb_main, 0, 5, -1.5F, -6.0F, -6.0F, 3, 2, 2, 0.001F, false));
        bb_main.cubeList.add(new ModelBox(bb_main, 8, 7, -1.0F, -6.5F, -6.0F, 2, 3, 2, 0.0F, false));
        bb_main.cubeList.add(new ModelBox(bb_main, 8, 12, -1.0F, -6.0F, -6.0F, 2, 2, 2, -0.2F, false));

        updateDefaultPose();
    }

    @Override
    public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        GlStateManager.enableBlend();
        GlStateManager.blendFunc(GL11.GL_SRC_ALPHA, GL11.GL_ONE_MINUS_SRC_ALPHA);
        GlStateManager.color(1.0F, 1.0F, 1.0F, 0.55F);
        this.bb_main.render(f5);
        GlStateManager.disableBlend();
    }

    public void renderStaticBook(float f) {
        //Rotations, positions and sizing:
        this.bb_main.offsetY = 1.45F;
        this.bb_main.offsetX = 1.40F;
        this.bb_main.rotateAngleY = (float)Math.toRadians(125);
        this.bb_main.rotateAngleX = (float)Math.toRadians(2);
        this.bb_main.rotateAngleZ = (float)Math.toRadians(-2);
        this.bb_main.scaleChildren = true;
        float scaler = 5.0F;
        this.bb_main.setScale(scaler, scaler * 1.5F, scaler);
        //Start of pose:

        //End of pose, now render the model:
        this.bb_main.render(f);
        //Reset rotations, positions and sizing:
        this.bb_main.setScale(1.0F, 1.0F, 1.0F);
        this.bb_main.scaleChildren = false;
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
        this.bb_main.offsetY = 0.4F;
        this.bb_main.setScaleX(1.0F);
        this.bb_main.setScaleZ(1.0F);
        this.bb_main.scaleChildren = false;

        float speed = 0.07F;
        if (!e.isInWater()) {
            speed = 0.0F;
        }
        else {
            //pulsations:
            this.bb_main.scaleChildren = false;
            float floatPulsate = this.moveBox(0.06F, 0.1F, false, f2, 1);
            float floatPulsateUp = this.moveBoxExtended(0.06F, 0.2F, false, 3.0F, f2, 1);
            //System.err.println("pulsate: " + floatPulsate);
            this.bb_main.setScale(1-floatPulsate, 1-floatPulsateUp, 1-floatPulsate);
        }
        if (e instanceof EntityLiving && !((EntityLiving) e).isAIDisabled()) {
            this.bob(bb_main, -speed * 0.25F, 1F, false, f2, 1);

            if (!e.isInWater()) {
                this.resetToDefaultPose();
                this.bb_main.rotateAngleZ = (float) Math.toRadians(90);
                this.bb_main.scaleChildren = true;
                this.bb_main.offsetY = 0.18F;
                this.bb_main.setScaleX(0.2F);
                this.bb_main.setScaleZ(1.2F);
            }
        }
    }
}
