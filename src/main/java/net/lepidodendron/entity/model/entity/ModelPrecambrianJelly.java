package net.lepidodendron.entity.model.entity;

import net.ilexiconn.llibrary.client.model.tools.AdvancedModelRenderer;
import net.lepidodendron.entity.EntityPrehistoricFloraEoandromeda;
import net.lepidodendron.entity.base.EntityPrehistoricFloraSlitheringWaterBase;
import net.lepidodendron.entity.model.ModelBasePalaeopedia;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLiving;
import org.lwjgl.opengl.GL11;

public class ModelPrecambrianJelly extends ModelBasePalaeopedia {
    private final AdvancedModelRenderer main;
    private final AdvancedModelRenderer cyclomedusabase;
    private final AdvancedModelRenderer ediacariabase;

    public ModelPrecambrianJelly() {
        this.textureWidth = 32;
        this.textureHeight = 32;

        this.main = new AdvancedModelRenderer(this);
        this.main.setRotationPoint(0.0F, 24.0F, 0.0F);
        this.main.cubeList.add(new ModelBox(main, 0, 20, -1.0F, -1.5F, -1.0F, 2, 1, 2, 0.0F, false));
        this.main.cubeList.add(new ModelBox(main, 22, 0, -0.5F, -1.975F, -0.5F, 1, 1, 1, 0.0F, false));

        this.cyclomedusabase = new AdvancedModelRenderer(this);
        this.cyclomedusabase.setRotationPoint(-0.5F, -0.3F, -0.5F);
        this.main.addChild(cyclomedusabase);
        this.cyclomedusabase.cubeList.add(new ModelBox(cyclomedusabase, 0, 7, -1.5F, -1.0F, -1.5F, 4, 1, 4, 0.0F, false));
        this.cyclomedusabase.cubeList.add(new ModelBox(cyclomedusabase, 20, 10, -0.5F, -1.0F, -1.5F, 2, 1, 4, 0.0F, false));
        this.cyclomedusabase.cubeList.add(new ModelBox(cyclomedusabase, 20, 5, -1.5F, -1.0F, -0.5F, 4, 1, 2, 0.0F, false));
        this.cyclomedusabase.cubeList.add(new ModelBox(cyclomedusabase, 15, 25, 2.5F, -1.0F, -0.5F, 1, 1, 2, 0.0F, false));
        this.cyclomedusabase.cubeList.add(new ModelBox(cyclomedusabase, 22, 25, -2.5F, -1.0F, -0.5F, 1, 1, 2, 0.0F, true));
        this.cyclomedusabase.cubeList.add(new ModelBox(cyclomedusabase, 17, 21, -0.5F, -1.0F, -2.5F, 2, 1, 1, 0.0F, false));
        this.cyclomedusabase.cubeList.add(new ModelBox(cyclomedusabase, 17, 21, -0.5F, -1.0F, 2.5F, 2, 1, 1, 0.0F, true));

        this.ediacariabase = new AdvancedModelRenderer(this);
        this.ediacariabase.setRotationPoint(-0.5F, 0.0F, -0.5F);
        this.main.addChild(ediacariabase);
        this.ediacariabase.cubeList.add(new ModelBox(ediacariabase, 0, 13, -0.5F, -0.975F, -0.5F, 2, 1, 2, -0.01F, false));
        this.ediacariabase.cubeList.add(new ModelBox(ediacariabase, 0, 0, 0.0F, -0.475F, 0.0F, 1, 1, 1, 0.0F, false));
        this.ediacariabase.cubeList.add(new ModelBox(ediacariabase, 0, 0, -2.0F, -1.0F, -2.0F, 5, 1, 5, 0.0F, false));

        updateDefaultPose();
    }

    @Override
    public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        GlStateManager.enableBlend();
        GlStateManager.blendFunc(GL11.GL_SRC_ALPHA, GL11.GL_ONE_MINUS_SRC_ALPHA);
        GlStateManager.color(1.0F, 1.0F, 1.0F, 0.90F);

        this.main.render(f5);
        GlStateManager.disableBlend();

    }

    @Override
    public void renderStaticBook(float f) {
        //Rotations, positions and sizing:
        this.main.offsetY = -0.25F;
        this.main.offsetX = -0.20F;
        this.main.rotateAngleY = (float)Math.toRadians(125);
        this.main.rotateAngleX = (float)Math.toRadians(2);
        this.main.rotateAngleZ = (float)Math.toRadians(-2);
        this.main.scaleChildren = true;
        float scaler = 0.25F;
        this.main.setScale(scaler, scaler, scaler);
        //Start of pose:

        //End of pose, now render the model:
        GlStateManager.enableBlend();
        GlStateManager.blendFunc(GL11.GL_SRC_ALPHA, GL11.GL_ONE_MINUS_SRC_ALPHA);
        GlStateManager.color(1.0F, 1.0F, 1.0F, 0.45F);
        this.main.render(f);
        GlStateManager.disableBlend();

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

        float speed = 0.1F;
        if (e instanceof EntityLiving && !((EntityLiving) e).isAIDisabled() && e.isInWater()) {
            this.main.scaleChildren = true;
            this.main.setScale(1.0F, 1.0F, 1.0F);
            if (e instanceof EntityPrehistoricFloraSlitheringWaterBase) {
                EntityPrehistoricFloraSlitheringWaterBase ee = (EntityPrehistoricFloraSlitheringWaterBase) e;
                this.main.scaleChildren = true;
                float scaler = ((float)(((double)ee.getSlitherStage())/10D) * 0.065F) + 1F;
                this.main.setScaleZ(scaler);
                float scaler2 = 2F - (float)((((double)ee.getSlitherStage())/10D) * 0.065F);
                this.main.setScaleX(scaler2 * 0.5F);
            }
            else {
                this.swing(main, speed * 0.4F, 0.25F, true, 0, 0, f2, 0.6F);
                this.walk(main, speed * 0.3F, 0.4F, true, 0, 0, f2, 0.6F);
                this.flap(main, speed * 0.2F, 0.4F, true, 0, 0, f2, 0.6F);
                this.bob(main, -speed * 0.5F, 0.5F, false, f2, 0.6F);
                if (e instanceof EntityPrehistoricFloraEoandromeda) {
                    EntityPrehistoricFloraEoandromeda ee = (EntityPrehistoricFloraEoandromeda) e;
                    this.main.rotateAngleY = (float) Math.toRadians(ee.getRotationDegree());
                }
            }
        }
        else {
            this.main.scaleChildren = true;
            this.main.setScale(1.25F, 0.1F, 1.25F);
        }

    }
}
