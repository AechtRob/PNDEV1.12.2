package net.lepidodendron.entity.model.tile;

import net.ilexiconn.llibrary.client.model.tools.AdvancedModelBase;
import net.ilexiconn.llibrary.client.model.tools.AdvancedModelRenderer;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;

public class ModelTrimerocerasShell extends AdvancedModelBase {
    private final AdvancedModelRenderer base;
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
    private final AdvancedModelRenderer mantle;
    private final AdvancedModelRenderer siphon;
    private final AdvancedModelRenderer rightTentacle;
    private final AdvancedModelRenderer leftTentacle;
    private final AdvancedModelRenderer rightEye;
    private final AdvancedModelRenderer leftEye;


    public ModelTrimerocerasShell() {
        this.textureWidth = 44;
        this.textureHeight = 44;

        this.base = new AdvancedModelRenderer(this);
        this.base.setRotationPoint(0.0F, 24.0F, 0.0F);


        this.shell = new AdvancedModelRenderer(this);
        this.shell.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.base.addChild(shell);
        this.shell.cubeList.add(new ModelBox(shell, 0, 0, -3.0F, -9.0F, -2.0F, 6, 7, 4, 0.0F, false));
        this.shell.cubeList.add(new ModelBox(shell, 0, 28, -1.5F, -13.7785F, -0.5139F, 3, 3, 2, 0.0F, false));
        this.shell.cubeList.add(new ModelBox(shell, 13, 26, -2.0F, -2.0F, -2.0F, 4, 2, 2, 0.0F, false));
        this.shell.cubeList.add(new ModelBox(shell, 13, 20, -2.5F, -12.0F, -1.0F, 5, 3, 2, 0.0F, false));

        this.cube_r1 = new AdvancedModelRenderer(this);
        this.cube_r1.setRotationPoint(0.0F, 0.0F, -2.0F);
        this.shell.addChild(cube_r1);
        this.setRotateAngle(cube_r1, 0.336F, 0.0F, 0.0F);
        this.cube_r1.cubeList.add(new ModelBox(cube_r1, 0, 21, -2.0F, -4.0F, 0.0F, 4, 4, 2, -0.01F, false));

        this.cube_r2 = new AdvancedModelRenderer(this);
        this.cube_r2.setRotationPoint(0.0F, -14.1929F, -0.5393F);
        this.shell.addChild(cube_r2);
        this.setRotateAngle(cube_r2, -1.0036F, 0.0F, 0.0F);
        this.cube_r2.cubeList.add(new ModelBox(cube_r2, 28, 18, -1.0F, -4.0F, 0.0F, 2, 4, 1, 0.0F, false));

        this.cube_r3 = new AdvancedModelRenderer(this);
        this.cube_r3.setRotationPoint(1.0F, -9.7579F, -2.848F);
        this.shell.addChild(cube_r3);
        this.setRotateAngle(cube_r3, -0.48F, 0.0F, 0.0F);
        this.cube_r3.cubeList.add(new ModelBox(cube_r3, 13, 12, -3.0F, -5.0F, 0.0F, 4, 5, 2, -0.04F, false));

        this.cube_r4 = new AdvancedModelRenderer(this);
        this.cube_r4.setRotationPoint(0.0F, -3.7764F, -3.3188F);
        this.shell.addChild(cube_r4);
        this.setRotateAngle(cube_r4, -0.0785F, 0.0F, 0.0F);
        this.cube_r4.cubeList.add(new ModelBox(cube_r4, 0, 12, -2.0F, -6.0F, 0.0F, 4, 6, 2, -0.02F, false));

        this.cube_r5 = new AdvancedModelRenderer(this);
        this.cube_r5.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.shell.addChild(cube_r5);
        this.setRotateAngle(cube_r5, 0.7418F, 0.0F, 0.0F);
        this.cube_r5.cubeList.add(new ModelBox(cube_r5, 21, 0, -2.0F, -2.0F, 0.0F, 4, 2, 3, 0.01F, false));

        this.cube_r6 = new AdvancedModelRenderer(this);
        this.cube_r6.setRotationPoint(0.0F, -13.7785F, 1.4861F);
        this.shell.addChild(cube_r6);
        this.setRotateAngle(cube_r6, -0.781F, 0.0F, 0.0F);
        this.cube_r6.cubeList.add(new ModelBox(cube_r6, 11, 31, -1.0F, -2.0F, -1.0F, 2, 3, 1, -0.01F, false));

        this.cube_r7 = new AdvancedModelRenderer(this);
        this.cube_r7.setRotationPoint(1.0F, -9.9082F, 2.1946F);
        this.shell.addChild(cube_r7);
        this.setRotateAngle(cube_r7, 0.3622F, 0.0F, 0.0F);
        this.cube_r7.cubeList.add(new ModelBox(cube_r7, 26, 13, -3.0F, -2.0F, -2.0F, 4, 2, 2, -0.04F, false));

        this.cube_r8 = new AdvancedModelRenderer(this);
        this.cube_r8.setRotationPoint(0.0F, -5.969F, 2.8892F);
        this.shell.addChild(cube_r8);
        this.setRotateAngle(cube_r8, 0.1745F, 0.0F, 0.0F);
        this.cube_r8.cubeList.add(new ModelBox(cube_r8, 26, 6, -2.0F, -4.0F, -2.0F, 4, 4, 2, -0.02F, false));

        this.cube_r9 = new AdvancedModelRenderer(this);
        this.cube_r9.setRotationPoint(0.0F, -2.0268F, 2.2118F);
        this.shell.addChild(cube_r9);
        this.setRotateAngle(cube_r9, -0.1702F, 0.0F, 0.0F);
        this.cube_r9.cubeList.add(new ModelBox(cube_r9, 26, 26, -2.0F, -4.0F, -1.0F, 4, 4, 1, -0.01F, false));

        this.mantle = new AdvancedModelRenderer(this);
        this.mantle.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.shell.addChild(mantle);


        this.siphon = new AdvancedModelRenderer(this);
        this.siphon.setRotationPoint(0.0F, -1.0F, 1.0F);
        this.mantle.addChild(siphon);
        this.setRotateAngle(siphon, 0.7418F, 0.0F, 0.0F);
        this.siphon.cubeList.add(new ModelBox(siphon, 21, 6, -0.5F, -0.5F, -0.5F, 1, 2, 1, 0.0F, false));

        this.rightTentacle = new AdvancedModelRenderer(this);
        this.rightTentacle.setRotationPoint(-0.5F, -0.5F, -1.0F);
        this.mantle.addChild(rightTentacle);
        this.setRotateAngle(rightTentacle, -0.4363F, 0.0F, 0.1745F);
        this.rightTentacle.cubeList.add(new ModelBox(rightTentacle, 18, 31, -0.5F, 0.0F, -1.0F, 1, 2, 1, 0.0F, false));
        this.rightTentacle.cubeList.add(new ModelBox(rightTentacle, 28, 32, 0.0F, 1.5F, -0.5F, 0, 1, 1, 0.0F, false));

        this.leftTentacle = new AdvancedModelRenderer(this);
        this.leftTentacle.setRotationPoint(0.5F, -0.5F, -1.0F);
        this.mantle.addChild(leftTentacle);
        this.setRotateAngle(leftTentacle, -0.4363F, 0.0F, -0.1745F);
        this.leftTentacle.cubeList.add(new ModelBox(leftTentacle, 18, 31, -0.5F, 0.0F, -1.0F, 1, 2, 1, 0.0F, true));
        this.leftTentacle.cubeList.add(new ModelBox(leftTentacle, 28, 32, 0.0F, 1.5F, -0.5F, 0, 1, 1, 0.0F, true));

        this.rightEye = new AdvancedModelRenderer(this);
        this.rightEye.setRotationPoint(-1.5F, -0.5F, -1.0F);
        this.mantle.addChild(rightEye);
        this.setRotateAngle(rightEye, -0.4765F, 0.0603F, 0.7707F);
        this.rightEye.cubeList.add(new ModelBox(rightEye, 23, 32, -0.5F, 0.0F, -1.0F, 1, 2, 1, 0.0F, false));

        this.leftEye = new AdvancedModelRenderer(this);
        this.leftEye.setRotationPoint(1.5F, -0.5F, -1.0F);
        this.mantle.addChild(leftEye);
        this.setRotateAngle(leftEye, -0.4765F, -0.0603F, -0.7707F);
        this.leftEye.cubeList.add(new ModelBox(leftEye, 23, 32, -0.5F, 0.0F, -1.0F, 1, 2, 1, 0.0F, true));
        updateDefaultPose();
    }

    public void renderAll(float f) {
        this.resetToDefaultPose();
        this.base.offsetY = -2F;
        this.base.offsetX = -2F;
        this.base.rotateAngleZ = (float) Math.toRadians(90);
        this.base.render(0.1f);
    }

    public void setRotateAngle(ModelRenderer modelRenderer, float x, float y, float z) {
        modelRenderer.rotateAngleX = x;
        modelRenderer.rotateAngleY = y;
        modelRenderer.rotateAngleZ = z;
    }

}
