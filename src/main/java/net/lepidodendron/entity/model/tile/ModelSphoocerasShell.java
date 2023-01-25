package net.lepidodendron.entity.model.tile;

import net.ilexiconn.llibrary.client.model.tools.AdvancedModelBase;
import net.ilexiconn.llibrary.client.model.tools.AdvancedModelRenderer;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;

public class ModelSphoocerasShell extends AdvancedModelBase {

    private final AdvancedModelRenderer shell;
    private final  AdvancedModelRenderer shell_r1;
    private final  AdvancedModelRenderer shell_r2;
    private final  AdvancedModelRenderer shell_r3;

    public ModelSphoocerasShell() {
        this.textureWidth = 64;
        this.textureHeight = 64;

        this.shell = new  AdvancedModelRenderer(this);
        this.shell.setRotationPoint(0.5F, 29.75F, 0.0F);
        this.shell.cubeList.add(new ModelBox(shell, 0, 0, -3.0F, -9.75F, -7.25F, 5, 4, 12, 0.0F, false));
        this.shell.cubeList.add(new ModelBox(shell, 0, 16, -2.5F, -9.75F, 4.75F, 4, 4, 3, 0.0F, false));

        this.shell_r1 = new  AdvancedModelRenderer(this);
        this.shell_r1.setRotationPoint(-0.5F, -5.75F, 7.75F);
        this.shell.addChild(shell_r1);
        this.setRotateAngle(shell_r1, 0.2836F, 0.0F, 0.0F);
        this.shell_r1.cubeList.add(new ModelBox(shell_r1, 0, 5, -1.5F, -2.0F, 0.0F, 3, 2, 3, 0.01F, false));

        this.shell_r2 = new  AdvancedModelRenderer(this);
        this.shell_r2.setRotationPoint(-0.5F, -9.75F, 7.75F);
        this.shell.addChild(shell_r2);
        this.setRotateAngle(shell_r2, -0.3491F, 0.0F, 0.0F);
        this.shell_r2.cubeList.add(new ModelBox(shell_r2, 14, 16, -1.5F, 0.0F, 0.0F, 3, 2, 4, 0.0F, false));

        this.shell_r3 = new  AdvancedModelRenderer(this);
        this.shell_r3.setRotationPoint(-0.5F, -9.75F, -7.25F);
        this.shell.addChild(shell_r3);
        this.setRotateAngle(shell_r3, 0.3927F, 0.0F, 0.0F);
        this.shell_r3.cubeList.add(new ModelBox(shell_r3, 22, 0, -2.5F, 0.0F, -1.0F, 5, 3, 1, -0.01F, false));

        updateDefaultPose();
    }

    public void renderAll(float f) {
        this.resetToDefaultPose();
        this.shell.offsetY = -0.75F; //negative makes higher
        this.shell.render(0.034f);
    }

    public void setRotateAngle(ModelRenderer modelRenderer, float x, float y, float z) {
        modelRenderer.rotateAngleX = x;
        modelRenderer.rotateAngleY = y;
        modelRenderer.rotateAngleZ = z;
    }

}
