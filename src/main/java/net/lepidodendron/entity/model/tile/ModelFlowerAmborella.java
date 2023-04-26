package net.lepidodendron.entity.model.tile;

import net.ilexiconn.llibrary.client.model.tools.AdvancedModelBase;
import net.ilexiconn.llibrary.client.model.tools.AdvancedModelRenderer;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;

public class ModelFlowerAmborella extends AdvancedModelBase {
    private final AdvancedModelRenderer bone;
    private final AdvancedModelRenderer flower1;
    private final AdvancedModelRenderer flower2;
    private final AdvancedModelRenderer flower3;
    private final AdvancedModelRenderer flower5;
    private final AdvancedModelRenderer flower4;

    public ModelFlowerAmborella() {
        this.textureWidth = 16;
        this.textureHeight = 16;

        this.bone = new AdvancedModelRenderer(this);
        this.bone.setRotationPoint(0.0F, 24.0F, 0.0F);


        this.flower1 = new AdvancedModelRenderer(this);
        this.flower1.setRotationPoint(-1.0F, 0.0F, 0.0F);
        this.bone.addChild(flower1);
        this.flower1.cubeList.add(new ModelBox(flower1, 0, 0, 2.0F, -1.025F, -1.0F, 1, 1, 1, 0.0F, false));
        this.flower1.cubeList.add(new ModelBox(flower1, 0, 0, 0.5F, -0.95F, -2.5F, 4, 0, 4, 0.0F, false));
        this.flower1.cubeList.add(new ModelBox(flower1, 0, 4, 1.0F, -1.05F, -2.0F, 3, 0, 3, 0.0F, false));

        this.flower2 = new AdvancedModelRenderer(this);
        this.flower2.setRotationPoint(-4.0F, 0.0F, 2.0F);
        this.bone.addChild(flower2);
        this.setRotateAngle(flower2, 0.0F, -1.5708F, 0.0F);
        this.flower2.cubeList.add(new ModelBox(flower2, 0, 0, 2.0F, -1.025F, -1.0F, 1, 1, 1, 0.0F, false));
        this.flower2.cubeList.add(new ModelBox(flower2, 0, 0, 0.5F, -0.95F, -2.5F, 4, 0, 4, 0.0F, false));
        this.flower2.cubeList.add(new ModelBox(flower2, 0, 4, 1.0F, -1.05F, -2.0F, 3, 0, 3, 0.0F, false));

        this.flower3 = new AdvancedModelRenderer(this);
        this.flower3.setRotationPoint(-4.0F, 0.0F, -2.0F);
        this.bone.addChild(flower3);
        this.setRotateAngle(flower3, 0.0F, 1.5708F, 0.0F);
        this.flower3.cubeList.add(new ModelBox(flower3, 0, 0, 2.0F, -1.025F, -1.0F, 1, 1, 1, 0.0F, false));
        this.flower3.cubeList.add(new ModelBox(flower3, 0, 0, 0.5F, -0.95F, -2.5F, 4, 0, 4, 0.0F, false));
        this.flower3.cubeList.add(new ModelBox(flower3, 0, 4, 1.0F, -1.05F, -2.0F, 3, 0, 3, 0.0F, false));

        this.flower5 = new AdvancedModelRenderer(this);
        this.flower5.setRotationPoint(4.0F, 0.0F, 7.0F);
        this.bone.addChild(flower5);
        this.setRotateAngle(flower5, 0.0F, 1.5708F, 0.0F);
        this.flower5.cubeList.add(new ModelBox(flower5, 0, 0, 2.0F, -1.025F, -1.0F, 1, 1, 1, 0.0F, false));
        this.flower5.cubeList.add(new ModelBox(flower5, 0, 0, 0.5F, -0.95F, -2.5F, 4, 0, 4, 0.0F, false));
        this.flower5.cubeList.add(new ModelBox(flower5, 0, 4, 1.0F, -1.05F, -2.0F, 3, 0, 3, 0.0F, false));

        this.flower4 = new AdvancedModelRenderer(this);
        this.flower4.setRotationPoint(3.0F, 0.0F, -5.0F);
        this.bone.addChild(flower4);
        this.flower4.cubeList.add(new ModelBox(flower4, 0, 0, 2.0F, -1.025F, -1.0F, 1, 1, 1, 0.0F, false));
        this.flower4.cubeList.add(new ModelBox(flower4, 0, 0, 0.5F, -0.95F, -2.5F, 4, 0, 4, 0.0F, false));
        this.flower4.cubeList.add(new ModelBox(flower4, 0, 4, 1.0F, -1.05F, -2.0F, 3, 0, 3, 0.0F, false));

        updateDefaultPose();
    }

    public void renderAll(float f) {
        this.resetToDefaultPose();
        //this.base.offsetY = -1.5F;
        //this.base.render(0.1f);
        this.bone.render(1f);
    }

    public void setRotateAngle(ModelRenderer modelRenderer, float x, float y, float z) {
        modelRenderer.rotateAngleX = x;
        modelRenderer.rotateAngleY = y;
        modelRenderer.rotateAngleZ = z;
    }

}
