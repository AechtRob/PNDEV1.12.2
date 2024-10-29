package net.lepidodendron.entity.model.tile;

import net.ilexiconn.llibrary.client.model.tools.AdvancedModelBase;
import net.ilexiconn.llibrary.client.model.tools.AdvancedModelRenderer;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;

public class ModelTetramerocerasShell extends AdvancedModelBase {
    private final AdvancedModelRenderer root;
    private final AdvancedModelRenderer shell;
    private final AdvancedModelRenderer cube_r1;
    private final AdvancedModelRenderer cube_r2;
    private final AdvancedModelRenderer cube_r3;
    private final AdvancedModelRenderer cube_r4;
    private final AdvancedModelRenderer cube_r5;
    private final AdvancedModelRenderer cube_r6;
    private final AdvancedModelRenderer cube_r7;
    private final AdvancedModelRenderer cube_r8;
    private final AdvancedModelRenderer cube_r9;
    private final AdvancedModelRenderer cube_r10;
    private final AdvancedModelRenderer cube_r11;
    private final AdvancedModelRenderer cube_r12;
    private final AdvancedModelRenderer cube_r13;


    public ModelTetramerocerasShell() {
        this.textureWidth = 128;
        this.textureHeight = 128;

        this.root = new AdvancedModelRenderer(this);
        this.root.setRotationPoint(0.0F, 24.0F, 0.0F);


        this.shell = new AdvancedModelRenderer(this);
        this.shell.setRotationPoint(0.0F, -18.569F, 1.5911F);
        this.root.addChild(shell);
        this.setRotateAngle(shell, 0.6981F, 0.0F, 0.0F);
        this.shell.cubeList.add(new ModelBox(shell, 0, 57, -3.5F, 1.2802F, 2.0326F, 7, 3, 3, 0.0F, false));

        this.cube_r1 = new AdvancedModelRenderer(this);
        this.cube_r1.setRotationPoint(0.49F, 6.9066F, -8.8344F);
        this.shell.addChild(cube_r1);
        this.setRotateAngle(cube_r1, -0.9599F, 0.0F, 0.0F);
        this.cube_r1.cubeList.add(new ModelBox(cube_r1, 54, 35, -3.99F, -2.8809F, -3.8247F, 7, 3, 4, 0.0F, false));

        this.cube_r2 = new AdvancedModelRenderer(this);
        this.cube_r2.setRotationPoint(-1.01F, 3.7347F, -11.1209F);
        this.shell.addChild(cube_r2);
        this.setRotateAngle(cube_r2, -0.1745F, 0.0F, 0.0F);
        this.cube_r2.cubeList.add(new ModelBox(cube_r2, 44, 45, -2.49F, -4.8936F, 0.0139F, 7, 5, 5, 0.01F, false));

        this.cube_r3 = new AdvancedModelRenderer(this);
        this.cube_r3.setRotationPoint(-0.01F, -0.1436F, 7.1491F);
        this.shell.addChild(cube_r3);
        this.setRotateAngle(cube_r3, -2.0508F, 0.0F, 0.0F);
        this.cube_r3.cubeList.add(new ModelBox(cube_r3, 31, 9, -3.49F, 0.5F, -4.0F, 7, 3, 9, 0.01F, false));

        this.cube_r4 = new AdvancedModelRenderer(this);
        this.cube_r4.setRotationPoint(-0.01F, -5.4865F, 7.1194F);
        this.shell.addChild(cube_r4);
        this.setRotateAngle(cube_r4, -1.6144F, 0.0F, 0.0F);
        this.cube_r4.cubeList.add(new ModelBox(cube_r4, 38, 55, -3.49F, -1.5F, -2.5F, 7, 3, 4, -0.01F, false));

        this.cube_r5 = new AdvancedModelRenderer(this);
        this.cube_r5.setRotationPoint(-0.01F, -8.5549F, 5.4339F);
        this.shell.addChild(cube_r5);
        this.setRotateAngle(cube_r5, -2.2253F, 0.0F, 0.0F);
        this.cube_r5.cubeList.add(new ModelBox(cube_r5, 50, 21, -3.49F, -3.0F, -1.5F, 7, 4, 4, 0.0F, false));

        this.cube_r6 = new AdvancedModelRenderer(this);
        this.cube_r6.setRotationPoint(-0.01F, -4.7066F, -0.5586F);
        this.shell.addChild(cube_r6);
        this.setRotateAngle(cube_r6, -1.3963F, 0.0F, 0.0F);
        this.cube_r6.cubeList.add(new ModelBox(cube_r6, 21, 39, -3.49F, -7.0F, -4.5F, 7, 4, 7, -0.04F, false));

        this.cube_r7 = new AdvancedModelRenderer(this);
        this.cube_r7.setRotationPoint(-0.01F, -4.3536F, 0.5649F);
        this.shell.addChild(cube_r7);
        this.setRotateAngle(cube_r7, -1.1781F, 0.0F, 0.0F);
        this.cube_r7.cubeList.add(new ModelBox(cube_r7, 0, 18, -3.49F, -3.0F, -4.5F, 7, 7, 9, -0.01F, false));

        this.cube_r8 = new AdvancedModelRenderer(this);
        this.cube_r8.setRotationPoint(-0.51F, -1.1754F, -4.0684F);
        this.shell.addChild(cube_r8);
        this.setRotateAngle(cube_r8, -0.7418F, 0.0F, 0.0F);
        this.cube_r8.cubeList.add(new ModelBox(cube_r8, 0, 46, -2.99F, -3.75F, -4.5F, 7, 8, 3, 0.0F, false));

        this.cube_r9 = new AdvancedModelRenderer(this);
        this.cube_r9.setRotationPoint(0.0F, 2.8907F, -3.1126F);
        this.shell.addChild(cube_r9);
        this.setRotateAngle(cube_r9, -0.6981F, 0.0F, 0.0F);
        this.cube_r9.cubeList.add(new ModelBox(cube_r9, 30, 0, -4.0F, -12.85F, -3.325F, 8, 3, 6, 0.01F, false));
        this.cube_r9.cubeList.add(new ModelBox(cube_r9, 24, 26, -4.5F, -9.85F, -4.825F, 9, 5, 8, 0.01F, false));
        this.cube_r9.cubeList.add(new ModelBox(cube_r9, 0, 0, -5.0F, -4.85F, -5.825F, 10, 8, 10, 0.01F, false));

        this.cube_r10 = new AdvancedModelRenderer(this);
        this.cube_r10.setRotationPoint(0.0F, 7.7467F, -0.3433F);
        this.shell.addChild(cube_r10);
        this.setRotateAngle(cube_r10, -1.3177F, 0.0F, 0.0F);
        this.cube_r10.cubeList.add(new ModelBox(cube_r10, 0, 4, -1.0F, 0.25F, 0.5F, 2, 2, 2, 0.0F, false));

        this.cube_r11 = new AdvancedModelRenderer(this);
        this.cube_r11.setRotationPoint(0.99F, 4.1437F, 2.5364F);
        this.shell.addChild(cube_r11);
        this.setRotateAngle(cube_r11, -0.6981F, 0.0F, 0.0F);
        this.cube_r11.cubeList.add(new ModelBox(cube_r11, 54, 5, -4.49F, -1.5F, -2.0F, 7, 4, 4, 0.02F, false));

        this.cube_r12 = new AdvancedModelRenderer(this);
        this.cube_r12.setRotationPoint(0.49F, 7.1711F, -1.1138F);
        this.shell.addChild(cube_r12);
        this.setRotateAngle(cube_r12, -1.1868F, 0.0F, 0.0F);
        this.cube_r12.cubeList.add(new ModelBox(cube_r12, 20, 50, -3.99F, -3.25F, -2.5F, 7, 5, 4, 0.03F, false));

        this.cube_r13 = new AdvancedModelRenderer(this);
        this.cube_r13.setRotationPoint(0.0F, 7.0829F, -8.7948F);
        this.shell.addChild(cube_r13);
        this.setRotateAngle(cube_r13, -0.3054F, 0.0F, 0.0F);
        this.cube_r13.cubeList.add(new ModelBox(cube_r13, 0, 34, -3.5F, -4.945F, -0.0342F, 7, 5, 7, 0.04F, false));
        updateDefaultPose();
    }

    public void renderAll(float f) {
        this.resetToDefaultPose();
        this.root.offsetY = -2F;
        this.root.offsetX = -2F;
        this.root.rotateAngleZ = (float) Math.toRadians(90);
        this.root.render(0.1f);
    }

    public void setRotateAngle(ModelRenderer modelRenderer, float x, float y, float z) {
        modelRenderer.rotateAngleX = x;
        modelRenderer.rotateAngleY = y;
        modelRenderer.rotateAngleZ = z;
    }

}
