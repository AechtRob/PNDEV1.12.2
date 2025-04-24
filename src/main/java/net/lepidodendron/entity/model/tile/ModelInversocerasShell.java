package net.lepidodendron.entity.model.tile;

import net.ilexiconn.llibrary.client.model.tools.AdvancedModelBase;
import net.ilexiconn.llibrary.client.model.tools.AdvancedModelRenderer;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;

public class ModelInversocerasShell extends AdvancedModelBase {
    private final AdvancedModelRenderer base;
    private final AdvancedModelRenderer shell;
    private final AdvancedModelRenderer cube_r1;
    private final AdvancedModelRenderer cube_r2;
    private final AdvancedModelRenderer cube_r3;
    private final AdvancedModelRenderer shell2;
    private final AdvancedModelRenderer shell3;
    private final AdvancedModelRenderer mantle;
    private final AdvancedModelRenderer siphon;
    private final AdvancedModelRenderer rightEye;
    private final AdvancedModelRenderer leftEye;
    private final AdvancedModelRenderer rightFrontTentacle;
    private final AdvancedModelRenderer cube_r4;
    private final AdvancedModelRenderer leftFrontTentacle;
    private final AdvancedModelRenderer cube_r5;
    private final AdvancedModelRenderer rightSideTentacle;
    private final AdvancedModelRenderer leftSideTentacle;


    public ModelInversocerasShell() {
        this.textureWidth = 32;
        this.textureHeight = 32;

        this.base = new AdvancedModelRenderer(this);
        this.base.setRotationPoint(0.0F, 24.0F, 0.0F);


        this.shell = new AdvancedModelRenderer(this);
        this.shell.setRotationPoint(0.0F, -2.0F, 2.0F);
        this.base.addChild(shell);
        this.setRotateAngle(shell, -0.1309F, 0.0F, 0.0F);
        this.shell.cubeList.add(new ModelBox(shell, 0, 0, -1.5F, -7.0F, -3.0F, 3, 8, 3, 0.01F, false));

        this.cube_r1 = new AdvancedModelRenderer(this);
        this.cube_r1.setRotationPoint(-0.5F, 0.325F, -1.0F);
        this.shell.addChild(cube_r1);
        this.setRotateAngle(cube_r1, 0.3927F, 0.0F, 0.0F);
        this.cube_r1.cubeList.add(new ModelBox(cube_r1, 0, 12, -1.0F, -1.0F, -3.5F, 3, 2, 5, 0.02F, false));

        this.cube_r2 = new AdvancedModelRenderer(this);
        this.cube_r2.setRotationPoint(0.0F, -6.9753F, -3.3723F);
        this.shell.addChild(cube_r2);
        this.setRotateAngle(cube_r2, 0.1222F, 0.0F, 0.0F);
        this.cube_r2.cubeList.add(new ModelBox(cube_r2, 17, 17, -1.0F, -5.0F, 0.0F, 2, 6, 1, 0.0F, false));

        this.cube_r3 = new AdvancedModelRenderer(this);
        this.cube_r3.setRotationPoint(0.5F, 1.0F, -4.0F);
        this.shell.addChild(cube_r3);
        this.setRotateAngle(cube_r3, -0.0785F, 0.0F, 0.0F);
        this.cube_r3.cubeList.add(new ModelBox(cube_r3, 13, 0, -2.0F, -8.0F, 0.0F, 3, 8, 1, 0.0F, false));

        this.shell2 = new AdvancedModelRenderer(this);
        this.shell2.setRotationPoint(0.0F, -7.0F, 0.0F);
        this.shell.addChild(shell2);
        this.setRotateAngle(shell2, 0.48F, 0.0F, 0.0F);
        this.shell2.cubeList.add(new ModelBox(shell2, 17, 10, -1.0F, -4.0257F, -2.0705F, 2, 4, 2, 0.02F, false));

        this.shell3 = new AdvancedModelRenderer(this);
        this.shell3.setRotationPoint(0.0F, -4.0F, 0.0F);
        this.shell2.addChild(shell3);
        this.setRotateAngle(shell3, 0.1134F, 0.0F, 0.0F);
        this.shell3.cubeList.add(new ModelBox(shell3, 0, 20, -1.0F, -4.0335F, -1.0671F, 2, 4, 1, 0.01F, false));

        this.mantle = new AdvancedModelRenderer(this);
        this.mantle.setRotationPoint(0.0F, 1.0F, -1.0F);
        this.shell.addChild(mantle);


        this.siphon = new AdvancedModelRenderer(this);
        this.siphon.setRotationPoint(0.0F, -0.25F, 1.0F);
        this.mantle.addChild(siphon);
        this.setRotateAngle(siphon, 1.309F, 0.0F, 0.0F);
        this.siphon.cubeList.add(new ModelBox(siphon, 22, 6, -0.5F, -0.5F, -0.5F, 1, 2, 1, 0.0F, false));

        this.rightEye = new AdvancedModelRenderer(this);
        this.rightEye.setRotationPoint(-1.425F, 1.1206F, -3.0467F);
        this.mantle.addChild(rightEye);
        this.setRotateAngle(rightEye, 0.8891F, 1.0188F, 0.6387F);
        this.rightEye.cubeList.add(new ModelBox(rightEye, 24, 17, 0.0F, -0.5206F, -1.4033F, 0, 1, 2, 0.0F, false));

        this.leftEye = new AdvancedModelRenderer(this);
        this.leftEye.setRotationPoint(1.425F, 1.1206F, -3.0467F);
        this.mantle.addChild(leftEye);
        this.setRotateAngle(leftEye, 0.8891F, -1.0188F, -0.6387F);
        this.leftEye.cubeList.add(new ModelBox(leftEye, 24, 17, 0.0F, -0.5206F, -1.4033F, 0, 1, 2, 0.0F, true));

        this.rightFrontTentacle = new AdvancedModelRenderer(this);
        this.rightFrontTentacle.setRotationPoint(-0.175F, 1.1206F, -3.0467F);
        this.mantle.addChild(rightFrontTentacle);


        this.cube_r4 = new AdvancedModelRenderer(this);
        this.cube_r4.setRotationPoint(0.0F, -0.0206F, 0.0967F);
        this.rightFrontTentacle.addChild(cube_r4);
        this.setRotateAngle(cube_r4, 0.4378F, 0.0791F, 0.037F);
        this.cube_r4.cubeList.add(new ModelBox(cube_r4, 7, 20, 0.0F, -0.5F, -2.5F, 0, 2, 3, 0.0F, false));

        this.leftFrontTentacle = new AdvancedModelRenderer(this);
        this.leftFrontTentacle.setRotationPoint(0.175F, 1.1206F, -3.0467F);
        this.mantle.addChild(leftFrontTentacle);


        this.cube_r5 = new AdvancedModelRenderer(this);
        this.cube_r5.setRotationPoint(0.0F, -0.0206F, 0.0967F);
        this.leftFrontTentacle.addChild(cube_r5);
        this.setRotateAngle(cube_r5, 0.4378F, -0.0791F, -0.037F);
        this.cube_r5.cubeList.add(new ModelBox(cube_r5, 7, 20, 0.0F, -0.5F, -2.5F, 0, 2, 3, 0.0F, true));

        this.rightSideTentacle = new AdvancedModelRenderer(this);
        this.rightSideTentacle.setRotationPoint(-0.8F, 1.1206F, -3.0467F);
        this.mantle.addChild(rightSideTentacle);
        this.setRotateAngle(rightSideTentacle, 0.8013F, 0.3233F, 0.5944F);
        this.rightSideTentacle.cubeList.add(new ModelBox(rightSideTentacle, 22, 0, 0.0F, -0.5206F, -2.4033F, 0, 2, 3, 0.0F, false));

        this.leftSideTentacle = new AdvancedModelRenderer(this);
        this.leftSideTentacle.setRotationPoint(0.8F, 1.1206F, -3.0467F);
        this.mantle.addChild(leftSideTentacle);
        this.setRotateAngle(leftSideTentacle, 0.8013F, -0.3233F, -0.5944F);
        this.leftSideTentacle.cubeList.add(new ModelBox(leftSideTentacle, 22, 0, 0.0F, -0.5206F, -2.4033F, 0, 2, 3, 0.0F, true));
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
