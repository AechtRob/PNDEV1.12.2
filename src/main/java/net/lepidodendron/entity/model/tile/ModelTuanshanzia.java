package net.lepidodendron.entity.model.tile;

import net.ilexiconn.llibrary.client.model.tools.AdvancedModelBase;
import net.ilexiconn.llibrary.client.model.tools.AdvancedModelRenderer;
import net.minecraft.client.model.ModelBox;

public class ModelTuanshanzia extends AdvancedModelBase {
    private final AdvancedModelRenderer group1;
    private final AdvancedModelRenderer group2;
    private final AdvancedModelRenderer group3;
    private final AdvancedModelRenderer group4;
    private final AdvancedModelRenderer group5;
    private final AdvancedModelRenderer group6;
    private final AdvancedModelRenderer group7;
    private final AdvancedModelRenderer group8;
    private final AdvancedModelRenderer group9;
    private final AdvancedModelRenderer group10;
    private final AdvancedModelRenderer group11;
    private final AdvancedModelRenderer group;

    public ModelTuanshanzia() {
        textureWidth = 16;
        textureHeight = 16;

        group1 = new AdvancedModelRenderer(this);
        group1.setRotationPoint(-1.0F, 23.3F, 0.4F);
        group1.cubeList.add(new ModelBox(group1, 0, 0, 0.0F, -0.3F, -1.4F, 2, 1, 2, 0.0F, false));

        group2 = new AdvancedModelRenderer(this);
        group2.setRotationPoint(1.0F, -0.3F, -0.4F);
        group1.addChild(group2);
        group2.cubeList.add(new ModelBox(group2, 0, 9, 0.0F, -1.0F, -2.5F, 0, 1, 5, 0.0F, false));

        group3 = new AdvancedModelRenderer(this);
        group3.setRotationPoint(0.0F, -1.0F, 0.0F);
        group2.addChild(group3);
        group3.cubeList.add(new ModelBox(group3, 3, 11, 0.0F, -1.0F, -1.0F, 0, 1, 2, 0.0F, false));

        group4 = new AdvancedModelRenderer(this);
        group4.setRotationPoint(0.0F, -1.0F, 0.0F);
        group3.addChild(group4);
        group4.cubeList.add(new ModelBox(group4, 2, 9, 0.0F, -1.0F, -1.5F, 0, 1, 3, 0.0F, false));

        group5 = new AdvancedModelRenderer(this);
        group5.setRotationPoint(0.0F, -1.0F, 0.0F);
        group4.addChild(group5);
        group5.cubeList.add(new ModelBox(group5, 1, 7, 0.0F, -1.0F, -2.0F, 0, 1, 4, 0.0F, false));

        group6 = new AdvancedModelRenderer(this);
        group6.setRotationPoint(0.0F, -1.0F, 0.0F);
        group5.addChild(group6);
        group6.cubeList.add(new ModelBox(group6, 1, 6, 0.0F, -1.0F, -2.0F, 0, 1, 4, 0.0F, false));

        group7 = new AdvancedModelRenderer(this);
        group7.setRotationPoint(0.0F, -1.0F, 0.0F);
        group6.addChild(group7);
        group7.cubeList.add(new ModelBox(group7, 1, 5, 0.0F, -1.0F, -2.0F, 0, 1, 4, 0.0F, false));

        group8 = new AdvancedModelRenderer(this);
        group8.setRotationPoint(0.0F, -1.0F, 0.0F);
        group7.addChild(group8);
        group8.cubeList.add(new ModelBox(group8, 1, 4, 0.0F, -1.0F, -2.0F, 0, 1, 4, 0.0F, false));

        group9 = new AdvancedModelRenderer(this);
        group9.setRotationPoint(0.0F, -1.0F, 0.0F);
        group8.addChild(group9);
        group9.cubeList.add(new ModelBox(group9, 1, 3, 0.0F, -1.0F, -2.0F, 0, 1, 4, 0.0F, false));

        group10 = new AdvancedModelRenderer(this);
        group10.setRotationPoint(0.0F, -1.0F, 0.0F);
        group9.addChild(group10);
        group10.cubeList.add(new ModelBox(group10, 1, 2, 0.0F, -1.0F, -2.0F, 0, 1, 4, 0.0F, false));

        group11 = new AdvancedModelRenderer(this);
        group11.setRotationPoint(0.0F, -1.0F, 0.0F);
        group10.addChild(group11);
        group11.cubeList.add(new ModelBox(group11, 1, 1, 0.0F, -1.0F, -2.0F, 0, 1, 4, 0.0F, false));

        group = new AdvancedModelRenderer(this);
        group.setRotationPoint(0.0F, -1.0F, 0.0F);
        group11.addChild(group);
        group.cubeList.add(new ModelBox(group, 0, -1, 0.0F, -1.0F, -2.5F, 0, 1, 5, 0.0F, false));

        updateDefaultPose();
    }

    public void renderAll(float f) {
        this.resetToDefaultPose();
        AdvancedModelRenderer[] bodyFull = {this.group2,this.group3,this.group4,this.group5,this.group6,this.group7,this.group8,this.group9,this.group10,this.group11,this.group};
        AdvancedModelRenderer[] bodyBase = {this.group2,this.group3};
        float speed = 0.051F;
        this.chainFlap(bodyFull, speed, 0.18F, 3, f, 0.42F);
        this.chainSwing(bodyBase, speed / 4F, 0.13F, 2, f, 1.00F);
        this.chainWave(bodyBase, speed / 2F, 0.13F, 2, f, 1.00F);
        this.group1.render(0.06f);
    }

    public void setRotateAngle(AdvancedModelRenderer modelRenderer, float x, float y, float z) {
        modelRenderer.rotateAngleX = x;
        modelRenderer.rotateAngleY = y;
        modelRenderer.rotateAngleZ = z;
    }

}
