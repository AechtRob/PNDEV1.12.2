package net.lepidodendron.entity.model.tile;

import net.ilexiconn.llibrary.client.model.tools.AdvancedModelBase;
import net.ilexiconn.llibrary.client.model.tools.AdvancedModelRenderer;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;

public class ModelCenocerasShell extends AdvancedModelBase {
    private final AdvancedModelRenderer shell;
    private final AdvancedModelRenderer cube_r1;
    private final AdvancedModelRenderer shell2;
    private final AdvancedModelRenderer shell3;
    private final AdvancedModelRenderer shell4;
    private final AdvancedModelRenderer shell5;
    private final AdvancedModelRenderer shell6;
    private final AdvancedModelRenderer shell7;
    private final AdvancedModelRenderer shell8;

    public ModelCenocerasShell() {
        this.textureWidth = 64;
        this.textureHeight = 64;

        this.shell = new AdvancedModelRenderer(this);
        this.shell.setRotationPoint(0.0F, 22.75F, 5.0F);
        this.shell.cubeList.add(new ModelBox(shell, 25, 10, -3.0F, -7.05F, -5.4F, 6, 8, 5, 0.0F, false));

        this.cube_r1 = new AdvancedModelRenderer(this);
        this.cube_r1.setRotationPoint(0.0F, -7.1F, -0.5F);
        this.shell.addChild(cube_r1);
        this.setRotateAngle(cube_r1, 0.2443F, 0.0F, 0.0F);
        this.cube_r1.cubeList.add(new ModelBox(cube_r1, 22, 39, -3.0F, -0.15F, -1.9F, 6, 8, 2, -0.01F, false));

        this.shell2 = new AdvancedModelRenderer(this);
        this.shell2.setRotationPoint(0.0F, 0.95F, -5.4F);
        this.shell.addChild(shell2);
        this.setRotateAngle(shell2, -0.6109F, 0.0F, 0.0F);
        this.shell2.cubeList.add(new ModelBox(shell2, 0, 15, -3.0F, -8.0F, -6.0F, 6, 8, 6, 0.01F, false));

        this.shell3 = new AdvancedModelRenderer(this);
        this.shell3.setRotationPoint(0.0F, 0.0F, -6.0F);
        this.shell2.addChild(shell3);
        this.setRotateAngle(shell3, -0.7418F, 0.0F, 0.0F);
        this.shell3.cubeList.add(new ModelBox(shell3, 18, 23, -2.5F, -7.0F, -6.0F, 5, 7, 6, 0.0F, false));

        this.shell4 = new AdvancedModelRenderer(this);
        this.shell4.setRotationPoint(0.0F, 0.0F, -6.0F);
        this.shell3.addChild(shell4);
        this.setRotateAngle(shell4, -0.6545F, 0.0F, 0.0F);
        this.shell4.cubeList.add(new ModelBox(shell4, 0, 30, -2.5F, -6.0F, -6.0F, 5, 6, 6, 0.01F, false));

        this.shell5 = new AdvancedModelRenderer(this);
        this.shell5.setRotationPoint(0.0F, 0.0F, -6.0F);
        this.shell4.addChild(shell5);
        this.setRotateAngle(shell5, -0.9163F, 0.0F, 0.0F);
        this.shell5.cubeList.add(new ModelBox(shell5, 20, 0, -2.0F, -4.0F, -6.0F, 4, 4, 6, 0.0F, false));

        this.shell6 = new AdvancedModelRenderer(this);
        this.shell6.setRotationPoint(0.0F, 0.0F, -6.0F);
        this.shell5.addChild(shell6);
        this.setRotateAngle(shell6, -0.9599F, 0.0F, 0.0F);
        this.shell6.cubeList.add(new ModelBox(shell6, 35, 31, -2.0F, -3.0F, -5.0F, 4, 3, 5, 0.01F, false));

        this.shell7 = new AdvancedModelRenderer(this);
        this.shell7.setRotationPoint(0.0F, 0.0F, -5.0F);
        this.shell6.addChild(shell7);
        this.setRotateAngle(shell7, -0.9599F, 0.0F, 0.0F);
        this.shell7.cubeList.add(new ModelBox(shell7, 40, 23, -1.5F, -3.0F, -4.0F, 3, 3, 4, 0.0F, false));

        this.shell8 = new AdvancedModelRenderer(this);
        this.shell8.setRotationPoint(0.0F, 0.0F, -4.0F);
        this.shell7.addChild(shell8);
        this.setRotateAngle(shell8, -0.9163F, 0.0F, 0.0F);
        this.shell8.cubeList.add(new ModelBox(shell8, 40, 0, -1.0F, -5.0F, -4.0F, 2, 5, 4, 0.0F, false));
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
