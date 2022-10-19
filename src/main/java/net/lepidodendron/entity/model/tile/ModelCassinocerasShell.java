package net.lepidodendron.entity.model.tile;

import net.ilexiconn.llibrary.client.model.tools.AdvancedModelBase;
import net.ilexiconn.llibrary.client.model.tools.AdvancedModelRenderer;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;

public class ModelCassinocerasShell extends AdvancedModelBase {
    private final AdvancedModelRenderer shell;
    private final AdvancedModelRenderer cube_r1;
    private final AdvancedModelRenderer cube_r2;
    private final AdvancedModelRenderer cube_r3;
    private final AdvancedModelRenderer cube_r4;
    private final AdvancedModelRenderer cube_r5;
    private final AdvancedModelRenderer cube_r6;
    private final AdvancedModelRenderer cube_r7;
    private final AdvancedModelRenderer cube_r8;

    public ModelCassinocerasShell() {
        this.textureWidth = 64;
        this.textureHeight = 64;

        this.shell = new AdvancedModelRenderer(this);
        this.shell.setRotationPoint(0.0F, 20.551F, 7.3753F);
        this.setRotateAngle(shell, -0.3316F, 0.0F, 0.0F);


        this.cube_r1 = new AdvancedModelRenderer(this);
        this.cube_r1.setRotationPoint(0.0F, 2.6391F, 2.7135F);
        this.shell.addChild(cube_r1);
        this.setRotateAngle(cube_r1, 0.5672F, 0.0F, 0.0F);
        this.cube_r1.cubeList.add(new ModelBox(cube_r1, 11, 32, -1.5F, -1.8892F, 3.1557F, 3, 2, 1, -0.02F, false));
        this.cube_r1.cubeList.add(new ModelBox(cube_r1, 34, 36, -1.5F, -1.8892F, -0.0943F, 3, 2, 4, -0.01F, false));

        this.cube_r2 = new AdvancedModelRenderer(this);
        this.cube_r2.setRotationPoint(0.0F, 0.1896F, 6.242F);
        this.shell.addChild(cube_r2);
        this.setRotateAngle(cube_r2, 0.6283F, 0.0F, 0.0F);
        this.cube_r2.cubeList.add(new ModelBox(cube_r2, 0, 0, -1.0F, -0.799F, -0.1597F, 2, 1, 1, -0.002F, false));
        this.cube_r2.cubeList.add(new ModelBox(cube_r2, 44, 9, -1.0F, -0.799F, 0.0903F, 2, 1, 2, -0.01F, false));

        this.cube_r3 = new AdvancedModelRenderer(this);
        this.cube_r3.setRotationPoint(0.0F, -5.2233F, -7.9247F);
        this.shell.addChild(cube_r3);
        this.setRotateAngle(cube_r3, 0.0873F, 0.0F, 0.0F);
        this.cube_r3.cubeList.add(new ModelBox(cube_r3, 36, 46, -1.0F, 4.7029F, 13.5315F, 2, 1, 2, 0.0F, false));
        this.cube_r3.cubeList.add(new ModelBox(cube_r3, 34, 8, -1.5F, 2.9529F, 9.6315F, 3, 4, 4, 0.0F, false));
        this.cube_r3.cubeList.add(new ModelBox(cube_r3, 18, 31, -2.0F, 0.9529F, 5.9315F, 4, 8, 4, 0.0F, false));
        this.cube_r3.cubeList.add(new ModelBox(cube_r3, 0, 16, -2.5F, -0.0471F, -0.0685F, 5, 10, 6, 0.0F, false));

        this.cube_r4 = new AdvancedModelRenderer(this);
        this.cube_r4.setRotationPoint(0.0F, 4.1524F, -1.1496F);
        this.shell.addChild(cube_r4);
        this.setRotateAngle(cube_r4, 0.3316F, 0.0F, 0.0F);
        this.cube_r4.cubeList.add(new ModelBox(cube_r4, 16, 8, -2.5F, -2.0026F, -8.0008F, 5, 2, 8, -0.01F, false));
        this.cube_r4.cubeList.add(new ModelBox(cube_r4, 34, 31, -2.0F, -1.0026F, -0.0008F, 4, 1, 4, -0.01F, false));

        this.cube_r5 = new AdvancedModelRenderer(this);
        this.cube_r5.setRotationPoint(0.0F, -3.2343F, 6.5819F);
        this.shell.addChild(cube_r5);
        this.setRotateAngle(cube_r5, -0.7941F, 0.0F, 0.0F);
        this.cube_r5.cubeList.add(new ModelBox(cube_r5, 46, 31, -1.0F, 0.0122F, -0.0071F, 2, 2, 2, -0.001F, false));

        this.cube_r6 = new AdvancedModelRenderer(this);
        this.cube_r6.setRotationPoint(0.0F, -5.0858F, 1.9473F);
        this.shell.addChild(cube_r6);
        this.setRotateAngle(cube_r6, -0.3883F, 0.0F, 0.0F);
        this.cube_r6.cubeList.add(new ModelBox(cube_r6, 0, 32, -1.5F, -0.0291F, -0.0166F, 3, 2, 5, -0.001F, false));

        this.cube_r7 = new AdvancedModelRenderer(this);
        this.cube_r7.setRotationPoint(0.0F, -5.7383F, -1.984F);
        this.shell.addChild(cube_r7);
        this.setRotateAngle(cube_r7, -0.1658F, 0.0F, 0.0F);
        this.cube_r7.cubeList.add(new ModelBox(cube_r7, 36, 18, -2.0F, -0.0267F, -0.0316F, 4, 1, 4, 0.01F, false));

        this.cube_r8 = new AdvancedModelRenderer(this);
        this.cube_r8.setRotationPoint(0.0F, 4.399F, -7.3753F);
        this.shell.addChild(cube_r8);
        this.setRotateAngle(cube_r8, 0.4363F, 0.0F, 0.0F);
        this.cube_r8.cubeList.add(new ModelBox(cube_r8, 0, 0, -3.0F, -9.0F, -2.5F, 6, 10, 6, 0.0F, false));

        updateDefaultPose();
    }

    public void renderAll(float f) {
        this.resetToDefaultPose();
        this.shell.offsetY = -0.40F; //negative makes higher
        this.shell.render(0.034f);
    }

    public void setRotateAngle(ModelRenderer modelRenderer, float x, float y, float z) {
        modelRenderer.rotateAngleX = x;
        modelRenderer.rotateAngleY = y;
        modelRenderer.rotateAngleZ = z;
    }

}
