package net.lepidodendron.entity.model.tile;

import net.ilexiconn.llibrary.client.model.tools.AdvancedModelBase;
import net.ilexiconn.llibrary.client.model.tools.AdvancedModelRenderer;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;

public class ModelAscocerasShell extends AdvancedModelBase {

    private final AdvancedModelRenderer shell;
    private final AdvancedModelRenderer cube_r1;
    private final AdvancedModelRenderer cube_r2;
    private final AdvancedModelRenderer cube_r3;
    private final AdvancedModelRenderer cube_r4;
    private final AdvancedModelRenderer cube_r5;
    private final AdvancedModelRenderer cube_r6;
    private final AdvancedModelRenderer cube_r7;

    public ModelAscocerasShell() {
        this.textureWidth = 64;
        this.textureHeight = 64;

        this.shell = new AdvancedModelRenderer(this);
        this.shell.setRotationPoint(0.5F, 31.0F, 0.0F);


        this.cube_r1 = new AdvancedModelRenderer(this);
        this.cube_r1.setRotationPoint(0.0F, -9.8388F, 9.7026F);
        this.shell.addChild(cube_r1);
        this.setRotateAngle(cube_r1, 0.4669F, 0.0F, 0.0F);
        this.cube_r1.cubeList.add(new ModelBox(cube_r1, 24, 22, -3.0F, -2.0F, 0.0F, 5, 2, 3, 0.0F, false));

        this.cube_r2 = new AdvancedModelRenderer(this);
        this.cube_r2.setRotationPoint(0.0F, -13.6995F, 8.5754F);
        this.shell.addChild(cube_r2);
        this.setRotateAngle(cube_r2, -0.24F, 0.0F, 0.0F);
        this.cube_r2.cubeList.add(new ModelBox(cube_r2, 27, 27, -3.0F, 0.0107F, 0.0022F, 5, 2, 3, 0.01F, false));

        this.cube_r3 = new AdvancedModelRenderer(this);
        this.cube_r3.setRotationPoint(0.0F, -11.453F, 6.463F);
        this.shell.addChild(cube_r3);
        this.setRotateAngle(cube_r3, 0.2836F, 0.0F, 0.0F);
        this.cube_r3.cubeList.add(new ModelBox(cube_r3, 19, 7, -3.0F, -1.5549F, -0.3411F, 5, 4, 3, -0.01F, false));

        this.cube_r4 = new AdvancedModelRenderer(this);
        this.cube_r4.setRotationPoint(0.0F, -10.1555F, 0.8373F);
        this.shell.addChild(cube_r4);
        this.setRotateAngle(cube_r4, 0.1658F, 0.0F, 0.0F);
        this.cube_r4.cubeList.add(new ModelBox(cube_r4, 0, 0, -3.0F, -1.8561F, -0.2785F, 5, 4, 6, 0.0F, false));

        this.cube_r5 = new AdvancedModelRenderer(this);
        this.cube_r5.setRotationPoint(-0.5F, -9.2752F, -5.8021F);
        this.shell.addChild(cube_r5);
        this.setRotateAngle(cube_r5, 0.3316F, 0.0F, 0.0F);
        this.cube_r5.cubeList.add(new ModelBox(cube_r5, 0, 28, -2.0F, -0.125F, -1.5F, 4, 2, 3, 0.0F, false));

        this.cube_r6 = new AdvancedModelRenderer(this);
        this.cube_r6.setRotationPoint(-0.5F, -11.725F, -5.2226F);
        this.shell.addChild(cube_r6);
        this.setRotateAngle(cube_r6, 0.3316F, 0.0F, 0.0F);
        this.cube_r6.cubeList.add(new ModelBox(cube_r6, 14, 29, -2.0F, 0.0024F, -3.0259F, 4, 1, 3, 0.0F, false));
        this.cube_r6.cubeList.add(new ModelBox(cube_r6, 32, 7, -2.0F, 1.0024F, -1.0259F, 4, 1, 1, 0.0F, false));

        this.cube_r7 = new AdvancedModelRenderer(this);
        this.cube_r7.setRotationPoint(0.0F, -9.75F, -2.0F);
        this.shell.addChild(cube_r7);
        this.setRotateAngle(cube_r7, 0.048F, 0.0F, 0.0F);
        this.cube_r7.cubeList.add(new ModelBox(cube_r7, 0, 10, -3.0F, -2.125F, -3.15F, 5, 4, 6, 0.01F, false));

        updateDefaultPose();
    }

    public void renderAll(float f) {
        this.resetToDefaultPose();
        this.shell.offsetY = -0.45F; //negative makes higher
        this.shell.render(0.034f);
    }

    public void setRotateAngle(ModelRenderer modelRenderer, float x, float y, float z) {
        modelRenderer.rotateAngleX = x;
        modelRenderer.rotateAngleY = y;
        modelRenderer.rotateAngleZ = z;
    }

}
