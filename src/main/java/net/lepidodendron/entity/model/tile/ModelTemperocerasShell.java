package net.lepidodendron.entity.model.tile;

import net.ilexiconn.llibrary.client.model.tools.AdvancedModelBase;
import net.ilexiconn.llibrary.client.model.tools.AdvancedModelRenderer;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;

public class ModelTemperocerasShell extends AdvancedModelBase {
    private final AdvancedModelRenderer shell;
    private final AdvancedModelRenderer bottomhalfshell_r1;

    public ModelTemperocerasShell() {
        this.textureWidth = 256;
        this.textureHeight = 256;

        this.shell = new AdvancedModelRenderer(this);
        this.shell.setRotationPoint(0.5F, 13.25F, -69.5F);
        this.setRotateAngle(shell, -1.5708F, 0.0F, 0.0F);
        this.shell.cubeList.add(new ModelBox(shell, 0, 0, -6.0F, -94.25F, -0.5F, 11, 133, 11, 0.0F, false));
        this.shell.cubeList.add(new ModelBox(shell, 44, 0, -5.0F, -144.25F, 1.0F, 9, 50, 8, 0.0F, false));
        this.shell.cubeList.add(new ModelBox(shell, 44, 58, -3.0F, -192.25F, 2.25F, 5, 48, 5, 0.0F, false));
        this.shell.cubeList.add(new ModelBox(shell, 64, 76, -2.0F, -223.25F, 3.25F, 3, 31, 3, 0.0F, false));
        this.shell.cubeList.add(new ModelBox(shell, 78, 44, -1.0F, -236.25F, 4.25F, 1, 13, 1, 0.0F, false));

        this.bottomhalfshell_r1 = new AdvancedModelRenderer(this);
        this.bottomhalfshell_r1.setRotationPoint(3.5F, 40.0F, 15.5F);
        this.shell.addChild(bottomhalfshell_r1);
        this.setRotateAngle(bottomhalfshell_r1, 0.0873F, 0.0F, 0.0F);
        this.bottomhalfshell_r1.cubeList.add(new ModelBox(bottomhalfshell_r1, 76, 76, -9.0F, -8.0F, -8.0F, 10, 10, 4, 0.0F, false));

        updateDefaultPose();
    }

    public void renderAll(float f) {
        this.resetToDefaultPose();
        this.shell.offsetY = -1.5F;
        this.shell.render(0.1f);
    }

    public void setRotateAngle(ModelRenderer modelRenderer, float x, float y, float z) {
        modelRenderer.rotateAngleX = x;
        modelRenderer.rotateAngleY = y;
        modelRenderer.rotateAngleZ = z;
    }

}
