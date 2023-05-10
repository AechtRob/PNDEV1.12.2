package net.lepidodendron.entity.model.tile;

import net.ilexiconn.llibrary.client.model.tools.AdvancedModelBase;
import net.ilexiconn.llibrary.client.model.tools.AdvancedModelRenderer;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;

public class ModelSpirocerasShell extends AdvancedModelBase {
    private final AdvancedModelRenderer root;
    private final AdvancedModelRenderer Shell1;
    private final AdvancedModelRenderer Shell2;
    private final AdvancedModelRenderer Shell3;
    private final AdvancedModelRenderer Shell4;
    private final AdvancedModelRenderer Shell5;
    private final AdvancedModelRenderer Shell6;
    private final AdvancedModelRenderer Shell7;
    private final AdvancedModelRenderer Shell8;
    private final AdvancedModelRenderer Shell9;
    private final AdvancedModelRenderer Shellbase;

    public ModelSpirocerasShell() {
        this.textureWidth = 64;
        this.textureHeight = 64;

        this.root = new AdvancedModelRenderer(this);
        this.root.setRotationPoint(0.0F, 2.5F, 0.0F);
        this.setRotateAngle(root, 0.1309F, 0.0F, 0.0F);


        this.Shell1 = new AdvancedModelRenderer(this);
        this.Shell1.setRotationPoint(0.0F, 20.5F, 0.0F);
        this.root.addChild(Shell1);
        this.setRotateAngle(Shell1, 0.1792F, 0.0F, 0.0F);


        this.Shell2 = new AdvancedModelRenderer(this);
        this.Shell2.setRotationPoint(-0.01F, 0.2F, 2.5F);
        this.Shell1.addChild(Shell2);
        this.setRotateAngle(Shell2, -0.3136F, 0.0F, 0.0F);
        this.Shell2.cubeList.add(new ModelBox(Shell2, 0, 0, -1.99F, -2.5F, -8.0F, 4, 4, 8, 0.01F, false));
        this.Shell2.cubeList.add(new ModelBox(Shell2, 16, 4, -1.99F, 0.85F, -8.0F, 4, 1, 8, 0.0F, false));

        this.Shell3 = new AdvancedModelRenderer(this);
        this.Shell3.setRotationPoint(0.01F, 0.65F, -6.9F);
        this.Shell2.addChild(Shell3);
        this.setRotateAngle(Shell3, -0.5236F, 0.0F, 0.0F);
        this.Shell3.cubeList.add(new ModelBox(Shell3, 0, 12, -2.0F, -3.0F, -8.0F, 4, 4, 8, 0.0F, false));

        this.Shell4 = new AdvancedModelRenderer(this);
        this.Shell4.setRotationPoint(0.0F, -1.64F, -7.41F);
        this.Shell3.addChild(Shell4);
        this.setRotateAngle(Shell4, -0.8915F, 0.0F, 0.0F);
        this.Shell4.cubeList.add(new ModelBox(Shell4, 15, 15, -1.5F, -1.0F, -7.5F, 3, 3, 9, 0.01F, false));

        this.Shell5 = new AdvancedModelRenderer(this);
        this.Shell5.setRotationPoint(-0.01F, 1.02F, -7.25F);
        this.Shell4.addChild(Shell5);
        this.setRotateAngle(Shell5, -0.8927F, 0.0F, 0.0F);
        this.Shell5.cubeList.add(new ModelBox(Shell5, 16, 27, -1.49F, -1.25F, -6.5F, 3, 2, 7, 0.0F, false));

        this.Shell6 = new AdvancedModelRenderer(this);
        this.Shell6.setRotationPoint(0.0F, -0.05F, -5.75F);
        this.Shell5.addChild(Shell6);
        this.setRotateAngle(Shell6, -0.6569F, 0.0F, 0.0F);
        this.Shell6.cubeList.add(new ModelBox(Shell6, 30, 13, -0.99F, -1.0F, -6.0F, 2, 2, 6, 0.0F, false));

        this.Shell7 = new AdvancedModelRenderer(this);
        this.Shell7.setRotationPoint(0.01F, 0.2F, -5.8F);
        this.Shell6.addChild(Shell7);
        this.setRotateAngle(Shell7, -0.4753F, 0.0F, 0.0F);
        this.Shell7.cubeList.add(new ModelBox(Shell7, 40, 13, -1.0F, -1.25F, -3.8F, 2, 2, 4, -0.01F, false));

        this.Shell8 = new AdvancedModelRenderer(this);
        this.Shell8.setRotationPoint(0.0F, -0.55F, -3.15F);
        this.Shell7.addChild(Shell8);
        this.setRotateAngle(Shell8, -0.7063F, 0.0F, 0.0F);
        this.Shell8.cubeList.add(new ModelBox(Shell8, 31, 40, -0.5F, 0.0F, -5.1F, 1, 1, 5, 0.01F, false));

        this.Shell9 = new AdvancedModelRenderer(this);
        this.Shell9.setRotationPoint(-0.01F, -1.15F, -3.25F);
        this.Shell8.addChild(Shell9);
        this.setRotateAngle(Shell9, -0.6828F, 0.0F, 0.0F);
        this.Shell9.cubeList.add(new ModelBox(Shell9, 0, 19, 0.01F, -6.25F, -7.85F, 0, 9, 8, 0.0F, false));

        this.Shellbase = new AdvancedModelRenderer(this);
        this.Shellbase.setRotationPoint(0.01F, 2.96F, 0.0F);
        this.Shell1.addChild(Shellbase);
        this.setRotateAngle(Shellbase, -0.1274F, 0.0F, 0.0F);
        updateDefaultPose();
    }

    public void renderAll(float f) {
        this.resetToDefaultPose();
        this.root.offsetY = -1.5F;
        this.root.render(0.1f);
    }

    public void setRotateAngle(ModelRenderer modelRenderer, float x, float y, float z) {
        modelRenderer.rotateAngleX = x;
        modelRenderer.rotateAngleY = y;
        modelRenderer.rotateAngleZ = z;
    }

}
