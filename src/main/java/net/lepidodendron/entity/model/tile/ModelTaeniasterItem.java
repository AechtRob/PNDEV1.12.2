package net.lepidodendron.entity.model.tile;

import net.ilexiconn.llibrary.client.model.tools.AdvancedModelBase;
import net.ilexiconn.llibrary.client.model.tools.AdvancedModelRenderer;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;

public class ModelTaeniasterItem extends AdvancedModelBase {
    private final AdvancedModelRenderer main;
    private final AdvancedModelRenderer cube_r1;
    private final AdvancedModelRenderer cube_r2;
    private final AdvancedModelRenderer cube_r3;
    private final AdvancedModelRenderer cube_r4;
    private final AdvancedModelRenderer cube_r5;
    private final AdvancedModelRenderer armA;
    private final AdvancedModelRenderer armA2;
    private final AdvancedModelRenderer armA3;
    private final AdvancedModelRenderer armB;
    private final AdvancedModelRenderer armB2;
    private final AdvancedModelRenderer armB3;
    private final AdvancedModelRenderer armD;
    private final AdvancedModelRenderer armD2;
    private final AdvancedModelRenderer armD3;
    private final AdvancedModelRenderer armE;
    private final AdvancedModelRenderer armE2;
    private final AdvancedModelRenderer armE3;
    private final AdvancedModelRenderer armC;
    private final AdvancedModelRenderer armC2;
    private final AdvancedModelRenderer armC3;

    public ModelTaeniasterItem() {
        this.textureWidth = 14;
        this.textureHeight = 11;

        this.main = new AdvancedModelRenderer(this);
        this.main.setRotationPoint(0.0F, 23.95F, 0.0F);
        this.main.cubeList.add(new ModelBox(main, 9, 4, -0.5F, -1.175F, -1.0F, 1, 1, 1, 0.0F, false));

        this.cube_r1 = new AdvancedModelRenderer(this);
        this.cube_r1.setRotationPoint(-0.0922F, -0.475F, -0.3202F);
        this.main.addChild(cube_r1);
        this.setRotateAngle(cube_r1, -3.1416F, -1.2654F, -3.1416F);
        this.cube_r1.cubeList.add(new ModelBox(cube_r1, 0, 9, -1.642F, -0.5F, -2.1934F, 3, 1, 1, -0.003F, true));

        this.cube_r2 = new AdvancedModelRenderer(this);
        this.cube_r2.setRotationPoint(0.0922F, -0.475F, -0.3202F);
        this.main.addChild(cube_r2);
        this.setRotateAngle(cube_r2, -3.1416F, 1.2654F, 3.1416F);
        this.cube_r2.cubeList.add(new ModelBox(cube_r2, 0, 9, -1.358F, -0.5F, -2.1934F, 3, 1, 1, 0.0F, false));

        this.cube_r3 = new AdvancedModelRenderer(this);
        this.cube_r3.setRotationPoint(-0.2861F, -0.475F, -0.4202F);
        this.main.addChild(cube_r3);
        this.setRotateAngle(cube_r3, 0.0F, 3.1416F, 0.0F);
        this.cube_r3.cubeList.add(new ModelBox(cube_r3, 0, 0, -1.7861F, -0.5F, -2.0778F, 3, 1, 2, 0.003F, false));

        this.cube_r4 = new AdvancedModelRenderer(this);
        this.cube_r4.setRotationPoint(-0.0922F, -0.475F, -0.3202F);
        this.main.addChild(cube_r4);
        this.setRotateAngle(cube_r4, 0.0F, -0.5236F, 0.0F);
        this.cube_r4.cubeList.add(new ModelBox(cube_r4, 0, 0, -1.2139F, -0.5F, -2.0778F, 3, 1, 2, 0.0F, true));

        this.cube_r5 = new AdvancedModelRenderer(this);
        this.cube_r5.setRotationPoint(0.0922F, -0.475F, -0.3202F);
        this.main.addChild(cube_r5);
        this.setRotateAngle(cube_r5, 0.0F, 0.5236F, 0.0F);
        this.cube_r5.cubeList.add(new ModelBox(cube_r5, 0, 0, -1.7861F, -0.5F, -2.0778F, 3, 1, 2, 0.006F, false));

        this.armA = new AdvancedModelRenderer(this);
        this.armA.setRotationPoint(0.0F, -1.0F, -0.75F);
        this.main.addChild(armA);
        this.armA.cubeList.add(new ModelBox(armA, 0, 4, -0.5F, 0.0F, -3.0F, 1, 1, 3, -0.003F, false));

        this.armA2 = new AdvancedModelRenderer(this);
        this.armA2.setRotationPoint(0.0F, 0.5F, -3.0F);
        this.armA.addChild(armA2);
        this.armA2.cubeList.add(new ModelBox(armA2, 1, 5, -0.5F, -0.5F, -2.0F, 1, 1, 2, -0.003F, false));

        this.armA3 = new AdvancedModelRenderer(this);
        this.armA3.setRotationPoint(0.0F, 0.0F, -2.0F);
        this.armA2.addChild(armA3);
        this.armA3.cubeList.add(new ModelBox(armA3, 1, 5, -0.5F, -0.5F, -2.0F, 1, 1, 2, -0.003F, false));

        this.armB = new AdvancedModelRenderer(this);
        this.armB.setRotationPoint(-0.3638F, -0.5F, -0.3199F);
        this.main.addChild(armB);
        this.setRotateAngle(armB, 0.0F, 1.1345F, 0.0F);
        this.armB.cubeList.add(new ModelBox(armB, 0, 4, -0.5F, -0.5F, -3.0F, 1, 1, 3, -0.003F, false));

        this.armB2 = new AdvancedModelRenderer(this);
        this.armB2.setRotationPoint(0.0F, 0.0F, -3.0F);
        this.armB.addChild(armB2);
        this.armB2.cubeList.add(new ModelBox(armB2, 1, 5, -0.5F, -0.5F, -2.0F, 1, 1, 2, -0.003F, false));

        this.armB3 = new AdvancedModelRenderer(this);
        this.armB3.setRotationPoint(0.0F, 0.0F, -2.0F);
        this.armB2.addChild(armB3);
        this.armB3.cubeList.add(new ModelBox(armB3, 1, 5, -0.5F, -0.5F, -2.0F, 1, 1, 2, -0.003F, false));

        this.armD = new AdvancedModelRenderer(this);
        this.armD.setRotationPoint(-0.677F, -0.525F, 0.095F);
        this.main.addChild(armD);
        this.setRotateAngle(armD, 0.0F, 2.5744F, 0.0F);
        this.armD.cubeList.add(new ModelBox(armD, 0, 4, -0.5F, -0.5F, -3.0F, 1, 1, 3, -0.003F, false));

        this.armD2 = new AdvancedModelRenderer(this);
        this.armD2.setRotationPoint(0.8608F, 0.0F, -3.0F);
        this.armD.addChild(armD2);
        this.armD2.cubeList.add(new ModelBox(armD2, 1, 5, -1.3608F, -0.5F, -2.0F, 1, 1, 2, -0.003F, false));

        this.armD3 = new AdvancedModelRenderer(this);
        this.armD3.setRotationPoint(0.0F, 0.0F, -2.0F);
        this.armD2.addChild(armD3);
        this.armD3.cubeList.add(new ModelBox(armD3, 1, 5, -1.3608F, -0.5F, -2.0F, 1, 1, 2, -0.003F, false));

        this.armE = new AdvancedModelRenderer(this);
        this.armE.setRotationPoint(0.677F, -0.525F, 0.095F);
        this.main.addChild(armE);
        this.setRotateAngle(armE, 0.0F, -2.5744F, 0.0F);
        this.armE.cubeList.add(new ModelBox(armE, 0, 4, -0.5F, -0.5F, -3.0F, 1, 1, 3, -0.003F, true));

        this.armE2 = new AdvancedModelRenderer(this);
        this.armE2.setRotationPoint(-0.8608F, 0.0F, -3.0F);
        this.armE.addChild(armE2);
        this.armE2.cubeList.add(new ModelBox(armE2, 1, 5, 0.3608F, -0.5F, -2.0F, 1, 1, 2, -0.003F, true));

        this.armE3 = new AdvancedModelRenderer(this);
        this.armE3.setRotationPoint(0.0F, 0.0F, -2.0F);
        this.armE2.addChild(armE3);
        this.armE3.cubeList.add(new ModelBox(armE3, 1, 5, 0.3608F, -0.5F, -2.0F, 1, 1, 2, -0.003F, true));

        this.armC = new AdvancedModelRenderer(this);
        this.armC.setRotationPoint(0.3638F, -0.5F, -0.3199F);
        this.main.addChild(armC);
        this.setRotateAngle(armC, 0.0F, -1.1345F, 0.0F);
        this.armC.cubeList.add(new ModelBox(armC, 0, 4, -0.5F, -0.5F, -3.0F, 1, 1, 3, -0.003F, true));

        this.armC2 = new AdvancedModelRenderer(this);
        this.armC2.setRotationPoint(0.0F, 0.0F, -3.0F);
        this.armC.addChild(armC2);
        this.armC2.cubeList.add(new ModelBox(armC2, 1, 5, -0.5F, -0.5F, -2.0F, 1, 1, 2, -0.003F, true));

        this.armC3 = new AdvancedModelRenderer(this);
        this.armC3.setRotationPoint(0.0F, 0.0F, -2.0F);
        this.armC2.addChild(armC3);
        this.armC3.cubeList.add(new ModelBox(armC3, 1, 5, -0.5F, -0.5F, -2.0F, 1, 1, 2, -0.003F, true));

        updateDefaultPose();
    }

    public void renderAll(float f) {
        this.resetToDefaultPose();
        this.main.offsetY = -25F;
        this.main.render(1f);
    }

    public void setRotateAngle(ModelRenderer modelRenderer, float x, float y, float z) {
        modelRenderer.rotateAngleX = x;
        modelRenderer.rotateAngleY = y;
        modelRenderer.rotateAngleZ = z;
    }

}
