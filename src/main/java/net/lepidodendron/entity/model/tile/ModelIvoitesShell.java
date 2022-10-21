package net.lepidodendron.entity.model.tile;

import net.ilexiconn.llibrary.client.model.tools.AdvancedModelBase;
import net.ilexiconn.llibrary.client.model.tools.AdvancedModelRenderer;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;

public class ModelIvoitesShell extends AdvancedModelBase {
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
    private final AdvancedModelRenderer Shell10_r1;

    public ModelIvoitesShell() {
        this.textureWidth = 64;
        this.textureHeight = 64;

        this.root = new AdvancedModelRenderer(this);
        this.root.setRotationPoint(0.0F, 2.25F, 8.0F);
        this.setRotateAngle(root, -0.2618F, 0.0F, 0.0F);


        this.Shell1 = new AdvancedModelRenderer(this);
        this.Shell1.setRotationPoint(0.0F, 19.5F, 0.0F);
        this.root.addChild(Shell1);
        this.setRotateAngle(Shell1, 0.2665F, 0.0F, 0.0F);
        this.Shell1.cubeList.add(new ModelBox(Shell1, 0, 0, -3.0F, -3.0F, -4.0F, 6, 6, 10, 0.0F, false));

        this.Shell2 = new AdvancedModelRenderer(this);
        this.Shell2.setRotationPoint(-0.01F, 0.1F, -2.3F);
        this.Shell1.addChild(Shell2);
        this.setRotateAngle(Shell2, -0.5318F, 0.0F, 0.0F);
        this.Shell2.cubeList.add(new ModelBox(Shell2, 0, 16, -2.5F, -1.75F, -10.0F, 5, 5, 10, 0.0F, false));

        this.Shell3 = new AdvancedModelRenderer(this);
        this.Shell3.setRotationPoint(0.01F, 0.55F, -8.7F);
        this.Shell2.addChild(Shell3);
        this.setRotateAngle(Shell3, -0.48F, 0.0F, 0.0F);
        this.Shell3.cubeList.add(new ModelBox(Shell3, 20, 21, -2.5F, -2.0F, -10.0F, 5, 5, 10, 0.0F, false));

        this.Shell4 = new AdvancedModelRenderer(this);
        this.Shell4.setRotationPoint(0.0F, 0.56F, -8.16F);
        this.Shell3.addChild(Shell4);
        this.setRotateAngle(Shell4, -0.717F, 0.0F, 0.0F);
        this.Shell4.cubeList.add(new ModelBox(Shell4, 23, 7, -2.0F, -1.0F, -9.0F, 4, 4, 9, 0.0F, false));

        this.Shell5 = new AdvancedModelRenderer(this);
        this.Shell5.setRotationPoint(-0.01F, 1.32F, -6.55F);
        this.Shell4.addChild(Shell5);
        this.setRotateAngle(Shell5, -1.0236F, 0.0F, 0.0F);
        this.Shell5.cubeList.add(new ModelBox(Shell5, 11, 36, -2.0F, 0.0F, -9.0F, 4, 3, 9, 0.0F, false));

        this.Shell6 = new AdvancedModelRenderer(this);
        this.Shell6.setRotationPoint(0.0F, 1.85F, -7.85F);
        this.Shell5.addChild(Shell6);
        this.setRotateAngle(Shell6, -0.9624F, 0.0F, 0.0F);
        this.Shell6.cubeList.add(new ModelBox(Shell6, 37, 36, -1.5F, -1.5F, -7.0F, 3, 3, 7, 0.0F, false));

        this.Shell7 = new AdvancedModelRenderer(this);
        this.Shell7.setRotationPoint(0.01F, -0.2F, -5.05F);
        this.Shell6.addChild(Shell7);
        this.setRotateAngle(Shell7, -0.868F, 0.0F, 0.0F);
        this.Shell7.cubeList.add(new ModelBox(Shell7, 28, 36, -1.5F, 0.5F, -5.0F, 3, 2, 5, 0.0F, false));

        this.Shell8 = new AdvancedModelRenderer(this);
        this.Shell8.setRotationPoint(0.0F, 0.55F, -3.3F);
        this.Shell7.addChild(Shell8);
        this.setRotateAngle(Shell8, -0.7063F, 0.0F, 0.0F);
        this.Shell8.cubeList.add(new ModelBox(Shell8, 40, 20, -1.0F, 0.5F, -6.0F, 2, 2, 6, 0.0F, false));

        this.Shell9 = new AdvancedModelRenderer(this);
        this.Shell9.setRotationPoint(-0.01F, 1.1F, -5.1F);
        this.Shell8.addChild(Shell9);
        this.setRotateAngle(Shell9, -1.0755F, 0.0F, 0.0F);
        this.Shell9.cubeList.add(new ModelBox(Shell9, 40, 9, -0.49F, 0.4F, -5.4F, 1, 1, 6, 0.0F, false));

        this.Shell10_r1 = new AdvancedModelRenderer(this);
        this.Shell10_r1.setRotationPoint(0.01F, 0.37F, -4.59F);
        this.Shell9.addChild(Shell10_r1);
        this.setRotateAngle(Shell10_r1, 0.0873F, 0.0F, 0.0F);
        this.Shell10_r1.cubeList.add(new ModelBox(Shell10_r1, 0, 21, 0.0F, -8.87F, -3.66F, 0, 10, 10, 0.0F, false));

        updateDefaultPose();
    }

    public void renderAll(float f) {
        this.resetToDefaultPose();
        this.root.offsetY = -1.2F;
        this.root.render(0.08f);
    }

    public void setRotateAngle(ModelRenderer modelRenderer, float x, float y, float z) {
        modelRenderer.rotateAngleX = x;
        modelRenderer.rotateAngleY = y;
        modelRenderer.rotateAngleZ = z;
    }

}
