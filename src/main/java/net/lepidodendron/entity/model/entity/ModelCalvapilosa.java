package net.lepidodendron.entity.model.entity;

import net.ilexiconn.llibrary.client.model.tools.AdvancedModelBase;
import net.ilexiconn.llibrary.client.model.tools.AdvancedModelRenderer;
import net.lepidodendron.entity.EntityPrehistoricFloraCalvapilosa;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.entity.Entity;

public class ModelCalvapilosa extends AdvancedModelBase {
    private final AdvancedModelRenderer body;
    private final AdvancedModelRenderer back;
    private final AdvancedModelRenderer cube_r1;
    private final AdvancedModelRenderer head;
    private final AdvancedModelRenderer cube_r2;
    private final AdvancedModelRenderer bone;
    private final AdvancedModelRenderer cube_r3;

    public ModelCalvapilosa() {
        this.textureWidth = 64;
        this.textureHeight = 64;

        this.body = new AdvancedModelRenderer(this);
        this.body.setRotationPoint(0.0F, 24.0F, 0.0F);
        this.body.cubeList.add(new ModelBox(body, 0, 7, -4.0F, -1.0F, -4.0F, 8, 1, 7, 0.0F, false));
        this.body.cubeList.add(new ModelBox(body, 23, 5, -3.5F, -1.5F, -4.0F, 0, 1, 7, 0.0F, false));
        this.body.cubeList.add(new ModelBox(body, 23, 5, 3.5F, -1.5F, -4.0F, 0, 1, 7, 0.0F, true));
        this.body.cubeList.add(new ModelBox(body, 23, 24, -2.0F, -0.75F, -4.0F, 4, 1, 7, 0.01F, false));
        this.body.cubeList.add(new ModelBox(body, 0, 0, -4.5F, -0.5F, -4.0F, 9, 0, 7, 0.0F, false));
        this.body.cubeList.add(new ModelBox(body, 14, 15, -3.0F, -3.0F, -4.0F, 6, 2, 7, 0.0F, false));
        this.body.cubeList.add(new ModelBox(body, 0, 16, -2.5F, -3.5F, -4.0F, 0, 1, 7, 0.0F, false));
        this.body.cubeList.add(new ModelBox(body, 0, 16, -0.5F, -3.5F, -4.0F, 0, 1, 7, 0.0F, false));
        this.body.cubeList.add(new ModelBox(body, 0, 15, -1.5F, -3.5F, -4.0F, 0, 1, 7, 0.0F, false));
        this.body.cubeList.add(new ModelBox(body, 0, 15, 1.5F, -3.5F, -4.0F, 0, 1, 7, 0.0F, true));
        this.body.cubeList.add(new ModelBox(body, 0, 16, 2.5F, -3.5F, -4.0F, 0, 1, 7, 0.0F, true));
        this.body.cubeList.add(new ModelBox(body, 0, 16, 0.5F, -3.5F, -4.0F, 0, 1, 7, 0.0F, true));
        this.body.cubeList.add(new ModelBox(body, 0, 15, -3.5F, -2.25F, -4.0F, 7, 0, 7, 0.0F, false));

        this.back = new AdvancedModelRenderer(this);
        this.back.setRotationPoint(0.0F, -0.025F, 2.75F);
        this.body.addChild(back);
        this.back.cubeList.add(new ModelBox(back, 0, 30, -3.5F, -1.0F, 0.0F, 7, 1, 5, 0.0F, false));
        this.back.cubeList.add(new ModelBox(back, 19, 25, -3.0F, -1.5F, 0.0F, 0, 1, 5, 0.0F, false));
        this.back.cubeList.add(new ModelBox(back, 19, 25, 3.0F, -1.5F, 0.0F, 0, 1, 5, 0.0F, true));
        this.back.cubeList.add(new ModelBox(back, 18, 7, -4.0F, -0.5F, 0.0F, 8, 0, 5, 0.0F, false));
        this.back.cubeList.add(new ModelBox(back, 36, 0, -2.0F, -0.75F, 0.0F, 4, 1, 5, -0.01F, false));
        this.back.cubeList.add(new ModelBox(back, 30, 19, -3.0F, -0.5F, 4.5F, 6, 0, 3, 0.0F, false));
        this.back.cubeList.add(new ModelBox(back, 38, 26, -2.5F, -1.0F, 5.0F, 5, 1, 2, 0.0F, false));
        this.back.cubeList.add(new ModelBox(back, 35, 6, -2.5F, -1.5F, 6.0F, 5, 1, 0, 0.0F, false));

        this.cube_r1 = new AdvancedModelRenderer(this);
        this.cube_r1.setRotationPoint(0.0F, -2.75F, 0.0F);
        this.back.addChild(cube_r1);
        this.setRotateAngle(cube_r1, -0.1309F, 0.0F, 0.0F);
        this.cube_r1.cubeList.add(new ModelBox(cube_r1, 0, 24, -3.0F, 0.25F, -0.5F, 6, 0, 6, 0.0F, false));
        this.cube_r1.cubeList.add(new ModelBox(cube_r1, 25, 0, 0.0F, -0.5F, 0.0F, 0, 1, 5, 0.0F, true));
        this.cube_r1.cubeList.add(new ModelBox(cube_r1, 25, 0, 2.0F, -0.5F, 0.0F, 0, 1, 5, 0.0F, true));
        this.cube_r1.cubeList.add(new ModelBox(cube_r1, 23, 8, 1.0F, -0.5F, 0.0F, 0, 1, 5, 0.0F, true));
        this.cube_r1.cubeList.add(new ModelBox(cube_r1, 23, 8, -1.0F, -0.5F, 0.0F, 0, 1, 5, 0.0F, false));
        this.cube_r1.cubeList.add(new ModelBox(cube_r1, 25, 0, -2.0F, -0.5F, 0.0F, 0, 1, 5, 0.0F, false));
        this.cube_r1.cubeList.add(new ModelBox(cube_r1, 33, 12, -2.5F, 0.0F, 0.0F, 5, 2, 5, 0.0F, false));

        this.head = new AdvancedModelRenderer(this);
        this.head.setRotationPoint(0.0F, -0.025F, -3.75F);
        this.body.addChild(head);
        this.head.cubeList.add(new ModelBox(head, 38, 29, -2.5F, -1.0F, -6.0F, 5, 1, 1, 0.0F, false));
        this.head.cubeList.add(new ModelBox(head, 38, 32, -2.5F, -1.5F, -5.5F, 5, 1, 0, 0.0F, false));
        this.head.cubeList.add(new ModelBox(head, 15, 38, -2.0F, -0.75F, -5.0F, 4, 1, 5, -0.01F, false));
        this.head.cubeList.add(new ModelBox(head, 0, 0, -0.5F, 0.26F, -4.0F, 1, 0, 1, 0.0F, false));
        this.head.cubeList.add(new ModelBox(head, 19, 32, -3.5F, -1.0F, -5.0F, 7, 1, 5, 0.0F, false));
        this.head.cubeList.add(new ModelBox(head, 28, 33, -3.0F, -1.5F, -5.0F, 0, 1, 5, 0.0F, false));
        this.head.cubeList.add(new ModelBox(head, 28, 33, 3.0F, -1.5F, -5.0F, 0, 1, 5, 0.0F, true));
        this.head.cubeList.add(new ModelBox(head, 20, 0, -4.0F, -0.5F, -5.0F, 8, 0, 5, 0.0F, false));
        this.head.cubeList.add(new ModelBox(head, 36, 24, -3.0F, -0.5F, -6.5F, 6, 0, 2, 0.0F, false));

        this.cube_r2 = new AdvancedModelRenderer(this);
        this.cube_r2.setRotationPoint(0.0F, -2.75F, 0.0F);
        this.head.addChild(cube_r2);
        this.setRotateAngle(cube_r2, 0.1309F, 0.0F, 0.0F);
        this.cube_r2.cubeList.add(new ModelBox(cube_r2, 12, 24, -3.0F, 0.5F, -5.5F, 6, 0, 6, 0.0F, false));
        this.cube_r2.cubeList.add(new ModelBox(cube_r2, 25, 1, 1.75F, -0.5F, -5.0F, 0, 1, 5, 0.0F, true));
        this.cube_r2.cubeList.add(new ModelBox(cube_r2, 25, 1, -1.75F, -0.5F, -5.0F, 0, 1, 5, 0.0F, false));
        this.cube_r2.cubeList.add(new ModelBox(cube_r2, 0, 36, -2.5F, 0.0F, -5.0F, 5, 2, 5, 0.0F, false));

        this.bone = new AdvancedModelRenderer(this);
        this.bone.setRotationPoint(0.0F, -2.75F, -3.0F);
        this.head.addChild(bone);
        this.setRotateAngle(bone, 0.1309F, 0.0F, 0.0F);


        this.cube_r3 = new AdvancedModelRenderer(this);
        this.cube_r3.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.bone.addChild(cube_r3);
        this.setRotateAngle(cube_r3, 0.0F, -0.7854F, 0.0F);
        this.cube_r3.cubeList.add(new ModelBox(cube_r3, 38, 33, -1.0F, 0.0F, -1.0F, 2, 1, 2, 0.0F, false));

        updateDefaultPose();
    }

    @Override
    public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        this.body.render(f5 * 0.15F);
    }
    public void renderStatic(float f) {
        //GlStateManager.pushMatrix();
        //GlStateManager.enableBlend();
        //GlStateManager.blendFunc(GlStateManager.SourceFactor.SRC_ALPHA, GlStateManager.DestFactor.ONE_MINUS_SRC_ALPHA);
        //GlStateManager.disableCull();
        //this.body.offsetZ = -0.1F;
        this.body.render(0.01F);
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

        this.body.offsetY = 1.28F;

        EntityPrehistoricFloraCalvapilosa ee = (EntityPrehistoricFloraCalvapilosa) e;

        this.body.scaleChildren = true;
        float scaler = ((float)(((double)ee.getSlitherStage())/10D) * 0.1F) + 1F;
        this.body.setScaleZ(scaler);
        float scaler2 = 2F - (float)((((double)ee.getSlitherStage())/10D) * 0.1F);
        this.body.setScaleX(scaler2 * 0.85F);

        float moveWeight = 0.50F;
        this.walk(head, 0.05F, -moveWeight, true, 0, moveWeight, f2, 0.5F);
        this.swing(head, 0.1F, -moveWeight * 0.5F, false, 0, 0, f2, 0.5F);
        this.swing(back, 0.09F, -moveWeight * 0.4F, false, 3, 0, f2, 0.5F);

    }
}
