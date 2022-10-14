package net.lepidodendron.entity.model.entity;

import net.ilexiconn.llibrary.client.model.tools.AdvancedModelBase;
import net.ilexiconn.llibrary.client.model.tools.AdvancedModelRenderer;
import net.lepidodendron.entity.EntityPrehistoricFloraParvancorina;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.entity.Entity;

public class ModelParvancorina extends AdvancedModelBase {
    private final AdvancedModelRenderer bone;
    private final AdvancedModelRenderer cube_r1;
    private final AdvancedModelRenderer cube_r2;
    private final AdvancedModelRenderer cube_r3;
    private final AdvancedModelRenderer cube_r4;
    private final AdvancedModelRenderer cube_r5;
    private final AdvancedModelRenderer cube_r6;

    public ModelParvancorina() {
        this.textureWidth = 32;
        this.textureHeight = 32;

        this.bone = new AdvancedModelRenderer(this);
        this.bone.setRotationPoint(0.0F, 24.0F, 0.0F);
        this.bone.cubeList.add(new ModelBox(bone, 18, 3, -2.0F, -1.25F, -4.0F, 4, 1, 1, 0.0F, false));
        this.bone.cubeList.add(new ModelBox(bone, 10, 3, -0.5F, -1.25F, -3.0F, 1, 1, 6, 0.0F, false));
        this.bone.cubeList.add(new ModelBox(bone, 10, 0, -4.0F, -1.0F, -2.75F, 8, 1, 2, 0.0F, false));
        this.bone.cubeList.add(new ModelBox(bone, 0, 14, -2.0F, -1.0F, -4.75F, 4, 1, 2, 0.0F, false));
        this.bone.cubeList.add(new ModelBox(bone, 0, 0, -0.5F, -1.0F, 3.25F, 1, 1, 1, 0.0F, false));
        this.bone.cubeList.add(new ModelBox(bone, 13, 11, -1.5F, -1.0F, -0.75F, 3, 1, 3, 0.0F, false));

        this.cube_r1 = new AdvancedModelRenderer(this);
        this.cube_r1.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.bone.addChild(cube_r1);
        this.setRotateAngle(cube_r1, 0.0F, -0.5672F, 0.0F);
        this.cube_r1.cubeList.add(new ModelBox(cube_r1, 0, 0, 0.7F, -0.98F, -2.75F, 2, 1, 6, 0.0F, false));

        this.cube_r2 = new AdvancedModelRenderer(this);
        this.cube_r2.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.bone.addChild(cube_r2);
        this.setRotateAngle(cube_r2, 0.0F, 0.5672F, 0.0F);
        this.cube_r2.cubeList.add(new ModelBox(cube_r2, 0, 7, -2.7F, -0.99F, -2.75F, 2, 1, 6, 0.0F, false));

        this.cube_r3 = new AdvancedModelRenderer(this);
        this.cube_r3.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.bone.addChild(cube_r3);
        this.setRotateAngle(cube_r3, 0.0F, 0.7854F, 0.0F);
        this.cube_r3.cubeList.add(new ModelBox(cube_r3, 10, 15, -1.0F, -1.01F, -4.75F, 3, 1, 2, 0.0F, false));

        this.cube_r4 = new AdvancedModelRenderer(this);
        this.cube_r4.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.bone.addChild(cube_r4);
        this.setRotateAngle(cube_r4, 0.0F, -0.7854F, 0.0F);
        this.cube_r4.cubeList.add(new ModelBox(cube_r4, 0, 17, -2.0F, -1.01F, -4.75F, 3, 1, 2, 0.0F, false));

        this.cube_r5 = new AdvancedModelRenderer(this);
        this.cube_r5.setRotationPoint(0.0F, 0.75F, 0.0F);
        this.bone.addChild(cube_r5);
        this.setRotateAngle(cube_r5, 0.0F, -0.9599F, 0.0F);
        this.cube_r5.cubeList.add(new ModelBox(cube_r5, 18, 5, -2.15F, -1.99F, -3.95F, 3, 1, 1, 0.0F, false));

        this.cube_r6 = new AdvancedModelRenderer(this);
        this.cube_r6.setRotationPoint(0.0F, 0.75F, 0.0F);
        this.bone.addChild(cube_r6);
        this.setRotateAngle(cube_r6, 0.0F, 0.9599F, 0.0F);
        this.cube_r6.cubeList.add(new ModelBox(cube_r6, 18, 7, -0.85F, -1.99F, -3.95F, 3, 1, 1, 0.0F, false));

        updateDefaultPose();
    }

    @Override
    public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        this.bone.render(f5 * 0.425F);
    }
    public void renderStatic(float f) {
        //GlStateManager.pushMatrix();
        //GlStateManager.enableBlend();
        //GlStateManager.blendFunc(GlStateManager.SourceFactor.SRC_ALPHA, GlStateManager.DestFactor.ONE_MINUS_SRC_ALPHA);
        //GlStateManager.disableCull();
        //this.body.offsetZ = -0.1F;
        this.bone.render(0.01F);
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

        this.bone.offsetY = 0.86F;

        EntityPrehistoricFloraParvancorina ee = (EntityPrehistoricFloraParvancorina) e;

        this.bone.scaleChildren = true;
        float scaler = ((float)(((double)ee.getSlitherStage())/5.5D) * 0.08F) + 1F;
        this.bone.setScaleZ(scaler);
        float scaler2 = 2F - (float)((((double)ee.getSlitherStage())/5.5D) * 0.08F);
        this.bone.setScaleX(scaler2 * 0.5F);

    }
}
