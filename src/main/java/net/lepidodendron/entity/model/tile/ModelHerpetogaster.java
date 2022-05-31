package net.lepidodendron.entity.model.tile;

import net.ilexiconn.llibrary.client.model.tools.AdvancedModelBase;
import net.ilexiconn.llibrary.client.model.tools.AdvancedModelRenderer;
import net.minecraft.client.model.ModelBox;

public class ModelHerpetogaster extends AdvancedModelBase {
    private final AdvancedModelRenderer stem1;
    private final AdvancedModelRenderer stem2;
    private final AdvancedModelRenderer body1;
    private final AdvancedModelRenderer cube_r1;
    private final AdvancedModelRenderer body2;
    private final AdvancedModelRenderer body3;
    private final AdvancedModelRenderer body4;
    private final AdvancedModelRenderer body5;
    private final AdvancedModelRenderer body6;
    private final AdvancedModelRenderer body7;
    private final AdvancedModelRenderer body8;
    private final AdvancedModelRenderer body9;
    private final AdvancedModelRenderer body10;
    private final AdvancedModelRenderer body11;
    private final AdvancedModelRenderer body12;
    private final AdvancedModelRenderer body13;
    private final AdvancedModelRenderer tentacle;
    private final AdvancedModelRenderer tentacle2;
    private final AdvancedModelRenderer tentacle3;
    private final AdvancedModelRenderer tentacle4;

    public ModelHerpetogaster() {
        this.textureWidth = 32;
        this.textureHeight = 32;

        this.stem1 = new AdvancedModelRenderer(this);
        this.stem1.setRotationPoint(0.0F, 24.0F, 0.0F);
        this.stem1.cubeList.add(new ModelBox(stem1, 16, 17, -0.5F, -3.0F, -0.5F, 1, 3, 1, 0.0F, false));

        this.stem2 = new AdvancedModelRenderer(this);
        this.stem2.setRotationPoint(0.0F, -3.0F, 0.0F);
        this.stem1.addChild(stem2);
        this.setRotateAngle(stem2, 0.0873F, 0.0F, 0.0F);
        this.stem2.cubeList.add(new ModelBox(stem2, 12, 17, -0.49F, -3.0F, -0.51F, 1, 3, 1, 0.0F, false));

        this.body1 = new AdvancedModelRenderer(this);
        this.body1.setRotationPoint(0.0F, -3.0F, 0.0F);
        this.stem2.addChild(body1);
        this.body1.cubeList.add(new ModelBox(body1, 8, 10, -1.0F, -2.0F, -1.0F, 2, 2, 2, 0.0F, false));

        this.cube_r1 = new AdvancedModelRenderer(this);
        this.cube_r1.setRotationPoint(0.0F, 3.0F, 0.0F);
        this.body1.addChild(cube_r1);
        this.setRotateAngle(cube_r1, -0.5236F, 0.0F, 0.0F);
        this.cube_r1.cubeList.add(new ModelBox(cube_r1, 14, 3, -1.01F, -4.725F, -3.75F, 2, 1, 2, 0.0F, false));

        this.body2 = new AdvancedModelRenderer(this);
        this.body2.setRotationPoint(0.0F, 0.0F, 1.0F);
        this.body1.addChild(body2);
        this.setRotateAngle(body2, 0.5236F, 0.0F, 0.0F);
        this.body2.cubeList.add(new ModelBox(body2, 16, 10, -0.99F, -2.0F, 0.01F, 2, 2, 1, 0.0F, false));

        this.body3 = new AdvancedModelRenderer(this);
        this.body3.setRotationPoint(-0.5F, 0.0F, 1.0F);
        this.body2.addChild(body3);
        this.setRotateAngle(body3, 0.4363F, 0.0F, 0.0F);
        this.body3.cubeList.add(new ModelBox(body3, 0, 18, 0.26F, -1.0F, 0.01F, 1, 1, 1, 0.0F, false));
        this.body3.cubeList.add(new ModelBox(body3, 0, 18, -0.24F, -1.01F, 0.01F, 1, 1, 1, 0.0F, false));
        this.body3.cubeList.add(new ModelBox(body3, 6, 10, -0.26F, -1.75F, 0.0F, 1, 1, 1, 0.0F, false));
        this.body3.cubeList.add(new ModelBox(body3, 6, 10, 0.24F, -1.75F, 0.0F, 1, 1, 1, 0.0F, false));

        this.body4 = new AdvancedModelRenderer(this);
        this.body4.setRotationPoint(0.0F, 0.0F, 1.0F);
        this.body3.addChild(body4);
        this.setRotateAngle(body4, 0.48F, 0.0F, 0.0F);
        this.body4.cubeList.add(new ModelBox(body4, 14, 0, 0.0F, -1.0F, 0.01F, 1, 1, 1, 0.0F, false));
        this.body4.cubeList.add(new ModelBox(body4, 6, 10, -0.01F, -1.65F, 0.01F, 1, 1, 1, 0.0F, false));

        this.body5 = new AdvancedModelRenderer(this);
        this.body5.setRotationPoint(0.0F, -0.25F, 1.0F);
        this.body4.addChild(body5);
        this.setRotateAngle(body5, 0.2618F, 0.0F, 0.0F);
        this.body5.cubeList.add(new ModelBox(body5, 16, 0, 0.01F, -1.0F, -0.49F, 1, 1, 2, 0.0F, false));

        this.body6 = new AdvancedModelRenderer(this);
        this.body6.setRotationPoint(0.0F, 0.0F, -1.0F);
        this.body1.addChild(body6);
        this.setRotateAngle(body6, -0.3491F, 0.0F, 0.0F);
        this.body6.cubeList.add(new ModelBox(body6, 0, 15, -0.99F, -2.0F, -0.99F, 2, 2, 1, 0.0F, false));

        this.body7 = new AdvancedModelRenderer(this);
        this.body7.setRotationPoint(0.0F, 0.0F, -1.0F);
        this.body6.addChild(body7);
        this.setRotateAngle(body7, -0.2618F, 0.0F, 0.0F);
        this.body7.cubeList.add(new ModelBox(body7, 13, 14, -1.02F, -2.0F, -0.99F, 2, 2, 1, 0.0F, false));

        this.body8 = new AdvancedModelRenderer(this);
        this.body8.setRotationPoint(0.0F, 0.0F, -1.0F);
        this.body7.addChild(body8);
        this.setRotateAngle(body8, -0.2618F, 0.0F, 0.0F);
        this.body8.cubeList.add(new ModelBox(body8, 7, 14, -0.99F, -3.0F, -0.99F, 2, 3, 1, 0.0F, false));

        this.body9 = new AdvancedModelRenderer(this);
        this.body9.setRotationPoint(0.0F, 0.0F, -1.0F);
        this.body8.addChild(body9);
        this.setRotateAngle(body9, -0.5236F, 0.0F, 0.0F);
        this.body9.cubeList.add(new ModelBox(body9, 0, 10, -1.0F, -3.0F, -1.99F, 2, 3, 2, 0.0F, false));

        this.body10 = new AdvancedModelRenderer(this);
        this.body10.setRotationPoint(0.0F, 0.0F, -2.0F);
        this.body9.addChild(body10);
        this.setRotateAngle(body10, -0.2618F, 0.0F, 0.0F);
        this.body10.cubeList.add(new ModelBox(body10, 14, 6, -0.99F, -3.0F, -0.99F, 2, 3, 1, 0.0F, false));

        this.body11 = new AdvancedModelRenderer(this);
        this.body11.setRotationPoint(0.0F, 0.0F, -1.0F);
        this.body10.addChild(body11);
        this.setRotateAngle(body11, -0.0873F, 0.0F, 0.0F);
        this.body11.cubeList.add(new ModelBox(body11, 6, 5, -1.0F, -3.0F, -1.99F, 2, 3, 2, 0.0F, false));

        this.body12 = new AdvancedModelRenderer(this);
        this.body12.setRotationPoint(0.0F, 0.175F, -1.0F);
        this.body11.addChild(body12);
        this.setRotateAngle(body12, -0.1745F, 0.0F, 0.0F);
        this.body12.cubeList.add(new ModelBox(body12, 6, 0, -1.5F, -3.0F, -2.99F, 3, 3, 2, 0.0F, false));

        this.body13 = new AdvancedModelRenderer(this);
        this.body13.setRotationPoint(-0.5F, -0.5F, -1.0F);
        this.body12.addChild(body13);
        this.body13.cubeList.add(new ModelBox(body13, 0, 0, -0.5F, -2.0F, -2.99F, 2, 2, 1, 0.0F, false));
        this.body13.cubeList.add(new ModelBox(body13, 0, 20, 0.0F, -1.5F, -3.0F, 1, 1, 0, 0.0F, false));

        this.tentacle = new AdvancedModelRenderer(this);
        this.tentacle.setRotationPoint(1.0F, -0.5F, -3.0F);
        this.body13.addChild(tentacle);
        this.setRotateAngle(tentacle, 0.1745F, 0.0F, -0.7854F);
        this.tentacle.cubeList.add(new ModelBox(tentacle, 0, 0, 0.0F, 0.0F, -3.0F, 0, 7, 3, 0.0F, false));

        this.tentacle2 = new AdvancedModelRenderer(this);
        this.tentacle2.setRotationPoint(0.0F, -0.5F, -3.0F);
        this.body13.addChild(tentacle2);
        this.setRotateAngle(tentacle2, 0.1745F, 0.0F, 0.7854F);
        this.tentacle2.cubeList.add(new ModelBox(tentacle2, 0, 0, 0.0F, 0.0F, -3.0F, 0, 7, 3, 0.0F, false));

        this.tentacle3 = new AdvancedModelRenderer(this);
        this.tentacle3.setRotationPoint(0.0F, -1.5F, -3.0F);
        this.body13.addChild(tentacle3);
        this.setRotateAngle(tentacle3, 0.1745F, 0.0F, 2.3562F);
        this.tentacle3.cubeList.add(new ModelBox(tentacle3, 0, 0, 0.0F, 0.0F, -3.0F, 0, 7, 3, 0.0F, false));

        this.tentacle4 = new AdvancedModelRenderer(this);
        this.tentacle4.setRotationPoint(1.0F, -1.5F, -3.0F);
        this.body13.addChild(tentacle4);
        this.setRotateAngle(tentacle4, 0.1745F, 0.0F, -2.3562F);
        this.tentacle4.cubeList.add(new ModelBox(tentacle4, 0, 0, 0.0F, 0.0F, -3.0F, 0, 7, 3, 0.0F, false));

        updateDefaultPose();
    }

    public void renderAll(float f) {
        this.resetToDefaultPose();

        AdvancedModelRenderer[] stem = {this.stem1,this.stem2,this.body1};
        float speed = 0.051F;
        this.chainWave(stem, speed, 0.08F, 1, f, 0.32F);
        this.chainFlap(stem, speed, 0.08F, 1, f, 0.32F);
        this.walk(tentacle, 0.12F, -0.3F, false, 0F, -0.2F, f, 1f);
        this.walk(tentacle2, 0.12F, -0.3F, false, 0.5F, -0.2F, f, 1f);
        this.walk(tentacle3, 0.12F, -0.3F, false, 0F, -0.2F, f, 1f);
        this.walk(tentacle4, 0.12F, -0.3F, false, 0.5F, -0.2F, f, 1f);

        this.stem1.render(0.1f);
    }

    public void renderAllSide(float f) {
        this.resetToDefaultPose();

        this.setRotateAngle(body1, -0.7854F, 0.0F, 0.0F);
        this.setRotateAngle(stem2, -0.6545F, 0.0F, 0.0F);
        this.setRotateAngle(stem1, 1.5708F, 0.0F, 0.0F);

        AdvancedModelRenderer[] stem = {this.stem1,this.stem2,this.body1};
        float speed = 0.051F;
        this.chainWave(stem, speed, 0.08F, 1, f, 0.32F);
        this.chainFlap(stem, speed, 0.08F, 1, f, 0.32F);
        this.walk(tentacle, 0.12F, -0.3F, false, 0F, -0.2F, f, 1f);
        this.walk(tentacle2, 0.12F, -0.3F, false, 0.5F, -0.2F, f, 1f);
        this.walk(tentacle3, 0.12F, -0.3F, false, 0F, -0.2F, f, 1f);
        this.walk(tentacle4, 0.12F, -0.3F, false, 0.5F, -0.2F, f, 1f);

        this.stem1.render(0.1f);
    }

    public void setRotateAngle(AdvancedModelRenderer modelRenderer, float x, float y, float z) {
        modelRenderer.rotateAngleX = x;
        modelRenderer.rotateAngleY = y;
        modelRenderer.rotateAngleZ = z;
    }

}
