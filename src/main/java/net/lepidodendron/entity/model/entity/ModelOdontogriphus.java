package net.lepidodendron.entity.model.entity;

import net.ilexiconn.llibrary.client.model.tools.AdvancedModelBase;
import net.ilexiconn.llibrary.client.model.tools.AdvancedModelRenderer;
import net.lepidodendron.entity.EntityPrehistoricFloraOdontogriphus;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.entity.Entity;

public class ModelOdontogriphus extends AdvancedModelBase {
    private final AdvancedModelRenderer all;
    private final AdvancedModelRenderer bone;
    private final AdvancedModelRenderer cube_r1;
    private final AdvancedModelRenderer cube_r2;
    private final AdvancedModelRenderer cube_r3;
    private final AdvancedModelRenderer cube_r4;
    private final AdvancedModelRenderer frontbit;
    private final AdvancedModelRenderer cube_r5;
    private final AdvancedModelRenderer cube_r6;

    public ModelOdontogriphus() {
        this.textureWidth = 64;
        this.textureHeight = 64;

        this.all = new AdvancedModelRenderer(this);
        this.all.setRotationPoint(0.0F, 24.0F, 0.0F);
        this.setRotateAngle(all, 0.0F, 3.1416F, 0.0F);
        this.all.cubeList.add(new ModelBox(all, 15, 11, -1.5F, -1.0F, -2.0F, 3, 1, 5, 0.0F, false));
        this.all.cubeList.add(new ModelBox(all, 9, 17, -2.0F, -1.0F, -2.2F, 1, 1, 5, 0.0F, false));
        this.all.cubeList.add(new ModelBox(all, 17, 1, 1.0F, -1.0F, -2.2F, 1, 1, 5, 0.0F, false));
        this.all.cubeList.add(new ModelBox(all, 0, 0, -3.0F, -2.0F, -2.0F, 6, 1, 5, 0.0F, false));

        this.bone = new AdvancedModelRenderer(this);
        this.bone.setRotationPoint(0.0F, -1.55F, -2.0F);
        this.all.addChild(bone);
        this.setRotateAngle(bone, 0.0F, 3.1416F, 0.0F);
        this.bone.cubeList.add(new ModelBox(bone, 0, 21, -2.0F, 0.55F, -0.2F, 1, 1, 4, 0.0F, false));
        this.bone.cubeList.add(new ModelBox(bone, 16, 17, 1.0F, 0.55F, -0.2F, 1, 1, 4, 0.0F, false));
        this.bone.cubeList.add(new ModelBox(bone, 0, 16, -1.49F, 0.55F, 0.0F, 3, 1, 4, 0.0F, false));

        this.cube_r1 = new AdvancedModelRenderer(this);
        this.cube_r1.setRotationPoint(4.0F, 0.0F, 5.0F);
        this.bone.addChild(cube_r1);
        this.setRotateAngle(cube_r1, 0.0F, 1.1257F, 0.0F);
        this.cube_r1.cubeList.add(new ModelBox(cube_r1, 19, 22, -1.6F, -0.451F, -3.5F, 2, 1, 2, 0.0F, false));

        this.cube_r2 = new AdvancedModelRenderer(this);
        this.cube_r2.setRotationPoint(-2.0F, 0.0F, 5.0F);
        this.bone.addChild(cube_r2);
        this.setRotateAngle(cube_r2, 0.0F, -1.0821F, 0.0F);
        this.cube_r2.cubeList.add(new ModelBox(cube_r2, 10, 23, -1.3F, -0.451F, -1.7F, 2, 1, 2, 0.0F, false));

        this.cube_r3 = new AdvancedModelRenderer(this);
        this.cube_r3.setRotationPoint(0.0F, 4.05F, 5.0F);
        this.bone.addChild(cube_r3);
        this.setRotateAngle(cube_r3, 0.0F, 0.0F, 0.0F);
        this.cube_r3.cubeList.add(new ModelBox(cube_r3, 0, 6, -2.99F, -4.5F, -5.0F, 6, 1, 4, 0.0F, false));

        this.cube_r4 = new AdvancedModelRenderer(this);
        this.cube_r4.setRotationPoint(0.0F, 4.05F, 0.0F);
        this.bone.addChild(cube_r4);
        this.setRotateAngle(cube_r4, 0.0F, 0.0F, 0.0F);
        this.cube_r4.cubeList.add(new ModelBox(cube_r4, 16, 7, -2.0F, -4.5F, 4.0F, 4, 1, 2, 0.0F, false));

        this.frontbit = new AdvancedModelRenderer(this);
        this.frontbit.setRotationPoint(0.0F, -1.5F, 3.0F);
        this.all.addChild(frontbit);
        this.frontbit.cubeList.add(new ModelBox(frontbit, 0, 0, -2.0F, 0.5F, -0.2F, 1, 1, 1, 0.0F, false));
        this.frontbit.cubeList.add(new ModelBox(frontbit, 0, 2, 1.0F, 0.5F, -0.2F, 1, 1, 1, 0.0F, false));
        this.frontbit.cubeList.add(new ModelBox(frontbit, 0, 11, -2.99F, -0.5F, 0.0F, 6, 1, 4, 0.0F, false));
        this.frontbit.cubeList.add(new ModelBox(frontbit, 17, 25, -1.49F, 0.5F, 0.0F, 3, 1, 1, 0.0F, false));
        this.frontbit.cubeList.add(new ModelBox(frontbit, 0, 6, -0.5F, 0.0F, 2.5F, 1, 1, 1, 0.0F, false));
        this.frontbit.cubeList.add(new ModelBox(frontbit, 22, 17, -2.0F, -0.5F, 4.0F, 4, 1, 2, 0.0F, false));

        this.cube_r5 = new AdvancedModelRenderer(this);
        this.cube_r5.setRotationPoint(4.0F, -0.05F, 5.0F);
        this.frontbit.addChild(cube_r5);
        this.setRotateAngle(cube_r5, 0.0F, 1.1432F, 0.0F);
        this.cube_r5.cubeList.add(new ModelBox(cube_r5, 24, 0, -1.6F, -0.451F, -3.5F, 2, 1, 2, 0.0F, false));

        this.cube_r6 = new AdvancedModelRenderer(this);
        this.cube_r6.setRotationPoint(-2.0F, -0.05F, 5.0F);
        this.frontbit.addChild(cube_r6);
        this.setRotateAngle(cube_r6, 0.0F, -1.0821F, 0.0F);
        this.cube_r6.cubeList.add(new ModelBox(cube_r6, 24, 3, -1.3F, -0.451F, -1.7F, 2, 1, 2, 0.0F, false));

        updateDefaultPose();
    }

    @Override
    public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        this.all.render(f5 * 0.21F);
    }
    public void renderStatic(float f) {
        //GlStateManager.pushMatrix();
        //GlStateManager.enableBlend();
        //GlStateManager.blendFunc(GlStateManager.SourceFactor.SRC_ALPHA, GlStateManager.DestFactor.ONE_MINUS_SRC_ALPHA);
        //GlStateManager.disableCull();
        //this.body.offsetZ = -0.1F;
        this.all.render(0.01F);
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

        this.all.offsetY = 1.175F;

        EntityPrehistoricFloraOdontogriphus ee = (EntityPrehistoricFloraOdontogriphus) e;

        this.all.scaleChildren = true;
        float scaler = ((float)(((double)ee.getSlitherStage())/10D) * 0.1F) + 1F;
        this.all.setScaleZ(scaler);
        float scaler2 = 2F - (float)((((double)ee.getSlitherStage())/10D) * 0.1F);
        this.all.setScaleX(scaler2 * 0.85F);

        float moveWeight = 0.50F;
        this.walk(frontbit, 0.05F, -moveWeight, false, 0, moveWeight, f2, 0.5F);
        this.swing(frontbit, 0.1F, -moveWeight * 0.5F, false, 0, 0, f2, 0.5F);
        this.swing(bone, 0.09F, -moveWeight * 0.4F, false, 3, 0, f2, 0.5F);

    }
}
