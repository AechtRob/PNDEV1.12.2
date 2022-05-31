package net.lepidodendron.entity.model.entity;

import net.ilexiconn.llibrary.client.model.tools.AdvancedModelBase;
import net.ilexiconn.llibrary.client.model.tools.AdvancedModelRenderer;
import net.lepidodendron.entity.EntityPrehistoricFloraWiwaxia;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

public class ModelWiwaxia extends AdvancedModelBase {
    private final AdvancedModelRenderer body;
    private final AdvancedModelRenderer thornR7;
    private final AdvancedModelRenderer thornR6;
    private final AdvancedModelRenderer thornR5;
    private final AdvancedModelRenderer thornR4;
    private final AdvancedModelRenderer thornR3;
    private final AdvancedModelRenderer thornR2;
    private final AdvancedModelRenderer thornR1;
    private final AdvancedModelRenderer thorn7;
    private final AdvancedModelRenderer thorn6;
    private final AdvancedModelRenderer thorn5;
    private final AdvancedModelRenderer thorn4;
    private final AdvancedModelRenderer thorn3;
    private final AdvancedModelRenderer thorn2;
    private final AdvancedModelRenderer thorn1;

    public ModelWiwaxia() {
        this.textureWidth = 32;
        this.textureHeight = 32;

        this.body = new AdvancedModelRenderer(this);
        this.body.setRotationPoint(0.0F, 24.0F, 0.0F);
        this.body.cubeList.add(new ModelBox(body, 0, 0, -3.0F, -4.0F, -5.0F, 6, 4, 8, 0.0F, false));

        this.thornR7 = new AdvancedModelRenderer(this);
        this.thornR7.setRotationPoint(-1.5F, -4.0F, 2.0F);
        this.body.addChild(thornR7);
        this.setRotateAngle(thornR7, 0.0F, 0.0F, -0.1745F);
        this.thornR7.cubeList.add(new ModelBox(thornR7, 12, 17, -1.0F, -4.0F, 0.0F, 2, 4, 0, 0.0F, false));

        this.thornR6 = new AdvancedModelRenderer(this);
        this.thornR6.setRotationPoint(-1.5F, -4.0F, 1.0F);
        this.body.addChild(thornR6);
        this.setRotateAngle(thornR6, 0.0F, 0.0F, -0.1745F);
        this.thornR6.cubeList.add(new ModelBox(thornR6, 0, 12, -1.0F, -5.0F, 0.0F, 2, 5, 0, 0.0F, false));

        this.thornR5 = new AdvancedModelRenderer(this);
        this.thornR5.setRotationPoint(-1.5F, -4.0F, 0.0F);
        this.body.addChild(thornR5);
        this.setRotateAngle(thornR5, 0.0F, 0.0F, -0.1745F);
        this.thornR5.cubeList.add(new ModelBox(thornR5, 4, 12, -1.0F, -5.0F, 0.0F, 2, 5, 0, 0.0F, false));

        this.thornR4 = new AdvancedModelRenderer(this);
        this.thornR4.setRotationPoint(-1.5F, -4.0F, -1.0F);
        this.body.addChild(thornR4);
        this.setRotateAngle(thornR4, 0.0F, 0.0F, -0.1745F);
        this.thornR4.cubeList.add(new ModelBox(thornR4, 0, 0, -1.0F, -6.0F, 0.0F, 2, 6, 0, 0.0F, false));

        this.thornR3 = new AdvancedModelRenderer(this);
        this.thornR3.setRotationPoint(-1.5F, -4.0F, -2.0F);
        this.body.addChild(thornR3);
        this.setRotateAngle(thornR3, 0.0F, 0.0F, -0.1745F);
        this.thornR3.cubeList.add(new ModelBox(thornR3, 8, 12, -1.0F, -5.0F, 0.0F, 2, 5, 0, 0.0F, false));

        this.thornR2 = new AdvancedModelRenderer(this);
        this.thornR2.setRotationPoint(-1.5F, -4.0F, -3.0F);
        this.body.addChild(thornR2);
        this.setRotateAngle(thornR2, 0.0F, 0.0F, -0.1745F);
        this.thornR2.cubeList.add(new ModelBox(thornR2, 12, 12, -1.0F, -5.0F, 0.0F, 2, 5, 0, 0.0F, false));

        this.thornR1 = new AdvancedModelRenderer(this);
        this.thornR1.setRotationPoint(-1.5F, -4.0F, -4.0F);
        this.body.addChild(thornR1);
        this.setRotateAngle(thornR1, 0.0F, 0.0F, -0.1745F);
        this.thornR1.cubeList.add(new ModelBox(thornR1, 16, 17, -1.0F, -4.0F, 0.0F, 2, 4, 0, 0.0F, false));

        this.thorn7 = new AdvancedModelRenderer(this);
        this.thorn7.setRotationPoint(1.5F, -4.0F, 2.0F);
        this.body.addChild(thorn7);
        this.setRotateAngle(thorn7, 0.0F, 0.0F, 0.1745F);
        this.thorn7.cubeList.add(new ModelBox(thorn7, 20, 0, -1.0F, -4.0F, 0.0F, 2, 4, 0, 0.0F, false));

        this.thorn6 = new AdvancedModelRenderer(this);
        this.thorn6.setRotationPoint(1.5F, -4.0F, 1.0F);
        this.body.addChild(thorn6);
        this.setRotateAngle(thorn6, 0.0F, 0.0F, 0.1745F);
        this.thorn6.cubeList.add(new ModelBox(thorn6, 16, 12, -1.0F, -5.0F, 0.0F, 2, 5, 0, 0.0F, false));

        this.thorn5 = new AdvancedModelRenderer(this);
        this.thorn5.setRotationPoint(1.5F, -4.0F, 0.0F);
        this.body.addChild(thorn5);
        this.setRotateAngle(thorn5, 0.0F, 0.0F, 0.1745F);
        this.thorn5.cubeList.add(new ModelBox(thorn5, 0, 17, -1.0F, -5.0F, 0.0F, 2, 5, 0, 0.0F, false));

        this.thorn4 = new AdvancedModelRenderer(this);
        this.thorn4.setRotationPoint(1.5F, -4.0F, -1.0F);
        this.body.addChild(thorn4);
        this.setRotateAngle(thorn4, 0.0F, 0.0F, 0.1745F);
        this.thorn4.cubeList.add(new ModelBox(thorn4, 4, 0, -1.0F, -6.0F, 0.0F, 2, 6, 0, 0.0F, false));

        this.thorn3 = new AdvancedModelRenderer(this);
        this.thorn3.setRotationPoint(1.5F, -4.0F, -2.0F);
        this.body.addChild(thorn3);
        this.setRotateAngle(thorn3, 0.0F, 0.0F, 0.1745F);
        this.thorn3.cubeList.add(new ModelBox(thorn3, 4, 17, -1.0F, -5.0F, 0.0F, 2, 5, 0, 0.0F, false));

        this.thorn2 = new AdvancedModelRenderer(this);
        this.thorn2.setRotationPoint(1.5F, -4.0F, -3.0F);
        this.body.addChild(thorn2);
        this.setRotateAngle(thorn2, 0.0F, 0.0F, 0.1745F);
        this.thorn2.cubeList.add(new ModelBox(thorn2, 8, 17, -1.0F, -5.0F, 0.0F, 2, 5, 0, 0.0F, false));

        this.thorn1 = new AdvancedModelRenderer(this);
        this.thorn1.setRotationPoint(1.5F, -4.0F, -4.0F);
        this.body.addChild(thorn1);
        this.setRotateAngle(thorn1, 0.0F, 0.0F, 0.1745F);
        this.thorn1.cubeList.add(new ModelBox(thorn1, 20, 4, -1.0F, -4.0F, 0.0F, 2, 4, 0, 0.0F, false));

        updateDefaultPose();
    }

    @Override
    public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        this.body.render(f5 * 0.15F);
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

        this.body.offsetY = 1.275F;

        EntityPrehistoricFloraWiwaxia ee = (EntityPrehistoricFloraWiwaxia) e;

        this.body.scaleChildren = false;
        float scaler = ((float)(((double)ee.getSlitherStage())/10D) * 0.125F) + 1F;
        this.body.setScaleZ(scaler);
        float scaler2 = 2F - (float)((((double)ee.getSlitherStage())/10D) * 0.125F);
        this.body.setScaleX(scaler2 * 0.5F);

        float moveWeight = 0.20F;
        this.flap(thorn1, 0.2F, -moveWeight, false, 0, -moveWeight, f2, 0.3F);
        this.flap(thornR1, 0.2F, moveWeight, false, 0, moveWeight, f2, 0.3F);
        this.flap(thorn2, 0.2F, -moveWeight, false, 1.0F, -moveWeight, f2, 0.3F);
        this.flap(thornR2, 0.2F, moveWeight, false, 1.0F, moveWeight, f2, 0.3F);
        this.flap(thorn3, 0.2F, -moveWeight, false, 2.0F, -moveWeight, f2, 0.3F);
        this.flap(thornR3, 0.2F, moveWeight, false, 2.0F, moveWeight, f2, 0.3F);
        this.flap(thorn4, 0.2F, -moveWeight, false, 3.0F, -moveWeight, f2, 0.3F);
        this.flap(thornR4, 0.2F, moveWeight, false, 3.0F, moveWeight, f2, 0.3F);
        this.flap(thorn5, 0.2F, -moveWeight, false, 4.0F, -moveWeight, f2, 0.3F);
        this.flap(thornR5, 0.2F, moveWeight, false, 4.0F, moveWeight, f2, 0.3F);
        this.flap(thorn6, 0.2F, -moveWeight, false, 5.0F, -moveWeight, f2, 0.3F);
        this.flap(thornR6, 0.2F, moveWeight, false, 5.0F, moveWeight, f2, 0.3F);
        this.flap(thorn7, 0.2F, -moveWeight, false, 6.0F, -moveWeight, f2, 0.3F);
        this.flap(thornR7, 0.2F, moveWeight, false, 6.0F, moveWeight, f2, 0.3F);

        this.walk(thorn1, 0.2F, -moveWeight, false, 0, -moveWeight, f2, 0.3F);
        this.walk(thornR1, 0.2F, moveWeight, false, 0, moveWeight, f2, 0.3F);
        this.walk(thorn2, 0.2F, -moveWeight, false, 1.0F, -moveWeight, f2, 0.3F);
        this.walk(thornR2, 0.2F, moveWeight, false, 1.0F, moveWeight, f2, 0.3F);
        this.walk(thorn3, 0.2F, -moveWeight, false, 2.0F, -moveWeight, f2, 0.3F);
        this.walk(thornR3, 0.2F, moveWeight, false, 2.0F, moveWeight, f2, 0.3F);
        this.walk(thorn4, 0.2F, -moveWeight, false, 3.0F, -moveWeight, f2, 0.3F);
        this.walk(thornR4, 0.2F, moveWeight, false, 3.0F, moveWeight, f2, 0.3F);
        this.walk(thorn5, 0.2F, -moveWeight, false, 4.0F, -moveWeight, f2, 0.3F);
        this.walk(thornR5, 0.2F, moveWeight, false, 4.0F, moveWeight, f2, 0.3F);
        this.walk(thorn6, 0.2F, -moveWeight, false, 5.0F, -moveWeight, f2, 0.3F);
        this.walk(thornR6, 0.2F, moveWeight, false, 5.0F, moveWeight, f2, 0.3F);
        this.walk(thorn7, 0.2F, -moveWeight, false, 6.0F, -moveWeight, f2, 0.3F);
        this.walk(thornR7, 0.2F, moveWeight, false, 6.0F, moveWeight, f2, 0.3F);


    }
}
