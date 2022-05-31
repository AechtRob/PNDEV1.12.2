package net.lepidodendron.entity.model.tile;

import net.ilexiconn.llibrary.client.model.tools.AdvancedModelBase;
import net.ilexiconn.llibrary.client.model.tools.AdvancedModelRenderer;
import net.minecraft.client.model.ModelBox;

public class ModelPrimocandelabrum extends AdvancedModelBase {
    private final AdvancedModelRenderer bone;
    private final AdvancedModelRenderer frond1;
    private final AdvancedModelRenderer frond2;
    private final AdvancedModelRenderer frond3;
    private final AdvancedModelRenderer frond4;
    private final AdvancedModelRenderer frond5;
    private final AdvancedModelRenderer frond6;
    private final AdvancedModelRenderer frond7;
    private final AdvancedModelRenderer frond8;
    private final AdvancedModelRenderer frond9;
    private final AdvancedModelRenderer frond10;
    private final AdvancedModelRenderer frond11;
    private final AdvancedModelRenderer frond12;
    private final AdvancedModelRenderer frond13;
    private final AdvancedModelRenderer frond14;
    private final AdvancedModelRenderer frond15;
    private final AdvancedModelRenderer frond16;
    private final AdvancedModelRenderer frond17;

    public ModelPrimocandelabrum() {
        this.textureWidth = 16;
        this.textureHeight = 16;

        this.bone = new AdvancedModelRenderer(this);
        this.bone.setRotationPoint(8.0F, 24.0F, -8.0F);
        this.bone.cubeList.add(new ModelBox(bone, 0, 6, -9.0F, -2.0F, 7.0F, 2, 2, 2, 0.0F, false));

        this.frond1 = new AdvancedModelRenderer(this);
        this.frond1.setRotationPoint(-8.0F, -2.0F, 8.0F);
        this.bone.addChild(frond1);
        this.frond1.cubeList.add(new ModelBox(frond1, 0, 14, -0.5F, -1.0F, -0.5F, 1, 1, 1, 0.0F, false));

        this.frond2 = new AdvancedModelRenderer(this);
        this.frond2.setRotationPoint(0.0F, -1.0F, 0.0F);
        this.frond1.addChild(frond2);
        this.frond2.cubeList.add(new ModelBox(frond2, 0, 13, -0.5F, -1.0F, -0.5F, 1, 1, 1, 0.0F, false));

        this.frond3 = new AdvancedModelRenderer(this);
        this.frond3.setRotationPoint(0.0F, -1.0F, 0.0F);
        this.frond2.addChild(frond3);
        this.frond3.cubeList.add(new ModelBox(frond3, 0, 12, -0.5F, -1.0F, -0.5F, 1, 1, 1, 0.0F, false));

        this.frond4 = new AdvancedModelRenderer(this);
        this.frond4.setRotationPoint(0.0F, -1.0F, 0.0F);
        this.frond3.addChild(frond4);
        this.frond4.cubeList.add(new ModelBox(frond4, 0, 11, -0.5F, -1.0F, -0.5F, 1, 1, 1, 0.0F, false));

        this.frond5 = new AdvancedModelRenderer(this);
        this.frond5.setRotationPoint(0.0F, -1.0F, 0.0F);
        this.frond4.addChild(frond5);
        this.frond5.cubeList.add(new ModelBox(frond5, 0, 4, 0.5F, -1.0F, -0.5F, 1, 1, 1, 0.0F, false));
        this.frond5.cubeList.add(new ModelBox(frond5, 0, 4, -1.5F, -1.0F, -0.5F, 1, 1, 1, 0.0F, false));
        this.frond5.cubeList.add(new ModelBox(frond5, 0, 0, -1.5F, -1.0F, 0.0F, 3, 1, 0, 0.0F, false));

        this.frond6 = new AdvancedModelRenderer(this);
        this.frond6.setRotationPoint(0.0F, -1.0F, 0.0F);
        this.frond5.addChild(frond6);
        this.frond6.cubeList.add(new ModelBox(frond6, 0, 4, -2.5F, -1.0F, -0.5F, 1, 1, 1, 0.0F, false));
        this.frond6.cubeList.add(new ModelBox(frond6, 0, 4, 0.5F, -1.0F, -0.5F, 1, 1, 1, 0.0F, false));
        this.frond6.cubeList.add(new ModelBox(frond6, 0, 0, -3.0F, -1.0F, 0.0F, 5, 1, 0, 0.0F, false));

        this.frond7 = new AdvancedModelRenderer(this);
        this.frond7.setRotationPoint(0.0F, -1.0F, 0.0F);
        this.frond6.addChild(frond7);
        this.frond7.cubeList.add(new ModelBox(frond7, 0, 4, -3.5F, -1.0F, -0.5F, 1, 1, 1, 0.0F, false));
        this.frond7.cubeList.add(new ModelBox(frond7, 0, 4, -0.5F, -1.0F, -0.5F, 1, 1, 1, 0.0F, false));
        this.frond7.cubeList.add(new ModelBox(frond7, 0, 4, 1.5F, -1.0F, -0.5F, 1, 1, 1, 0.0F, false));
        this.frond7.cubeList.add(new ModelBox(frond7, 0, 0, -3.5F, -1.0F, 0.0F, 6, 1, 0, 0.0F, false));

        this.frond8 = new AdvancedModelRenderer(this);
        this.frond8.setRotationPoint(0.0F, -1.0F, 0.0F);
        this.frond7.addChild(frond8);
        this.frond8.cubeList.add(new ModelBox(frond8, 0, 4, -3.5F, -1.0F, -0.5F, 1, 1, 1, 0.0F, false));
        this.frond8.cubeList.add(new ModelBox(frond8, 0, 4, -0.5F, -1.0F, -0.5F, 1, 1, 1, 0.0F, false));
        this.frond8.cubeList.add(new ModelBox(frond8, 0, 4, 2.5F, -1.0F, -0.5F, 1, 1, 1, 0.0F, false));
        this.frond8.cubeList.add(new ModelBox(frond8, 0, 0, -3.0F, -1.0F, 0.0F, 6, 1, 0, 0.0F, false));

        this.frond9 = new AdvancedModelRenderer(this);
        this.frond9.setRotationPoint(0.0F, -1.0F, 0.0F);
        this.frond8.addChild(frond9);
        this.frond9.cubeList.add(new ModelBox(frond9, 0, 4, -4.5F, -1.0F, -0.5F, 1, 1, 1, 0.0F, false));
        this.frond9.cubeList.add(new ModelBox(frond9, 0, 4, -0.5F, -1.0F, -0.5F, 1, 1, 1, 0.0F, false));
        this.frond9.cubeList.add(new ModelBox(frond9, 0, 4, -2.5F, -1.0F, -0.5F, 1, 1, 1, 0.0F, false));
        this.frond9.cubeList.add(new ModelBox(frond9, 0, 4, 1.5F, -1.0F, -0.5F, 1, 1, 1, 0.0F, false));
        this.frond9.cubeList.add(new ModelBox(frond9, 0, 4, 3.5F, -1.0F, -0.5F, 1, 1, 1, 0.0F, false));
        this.frond9.cubeList.add(new ModelBox(frond9, 0, 0, -4.5F, -1.0F, 0.0F, 9, 1, 0, 0.0F, false));

        this.frond10 = new AdvancedModelRenderer(this);
        this.frond10.setRotationPoint(0.0F, -1.0F, 0.0F);
        this.frond9.addChild(frond10);
        this.frond10.cubeList.add(new ModelBox(frond10, 0, 4, -2.5F, -1.0F, -0.5F, 1, 1, 1, 0.0F, false));
        this.frond10.cubeList.add(new ModelBox(frond10, 0, 4, -0.5F, -1.0F, -0.5F, 1, 1, 1, 0.0F, false));
        this.frond10.cubeList.add(new ModelBox(frond10, 0, 4, 4.5F, -1.0F, -0.5F, 1, 1, 1, 0.0F, false));
        this.frond10.cubeList.add(new ModelBox(frond10, 0, 4, -5.5F, -1.0F, -0.5F, 1, 1, 1, 0.0F, false));
        this.frond10.cubeList.add(new ModelBox(frond10, 0, 4, -6.5F, -2.0F, -0.5F, 1, 1, 1, 0.0F, false));
        this.frond10.cubeList.add(new ModelBox(frond10, 0, 4, 1.5F, -1.0F, -0.5F, 1, 1, 1, 0.0F, false));
        this.frond10.cubeList.add(new ModelBox(frond10, 0, 0, -6.0F, -1.0F, 0.0F, 11, 1, 0, 0.0F, false));

        this.frond11 = new AdvancedModelRenderer(this);
        this.frond11.setRotationPoint(0.0F, -1.0F, 0.0F);
        this.frond10.addChild(frond11);
        this.frond11.cubeList.add(new ModelBox(frond11, 0, 4, -3.5F, -1.0F, -0.5F, 1, 1, 1, 0.0F, false));
        this.frond11.cubeList.add(new ModelBox(frond11, 0, 4, -0.5F, -1.0F, -0.5F, 1, 1, 1, 0.0F, false));
        this.frond11.cubeList.add(new ModelBox(frond11, 0, 4, 4.5F, -1.0F, -0.5F, 1, 1, 1, 0.0F, false));
        this.frond11.cubeList.add(new ModelBox(frond11, 0, 4, -5.5F, -1.0F, -0.5F, 1, 1, 1, 0.0F, false));
        this.frond11.cubeList.add(new ModelBox(frond11, 0, 4, 1.5F, -1.0F, -0.5F, 1, 1, 1, 0.0F, false));
        this.frond11.cubeList.add(new ModelBox(frond11, 0, 0, -7.0F, -1.0F, 0.0F, 12, 1, 0, 0.0F, false));

        this.frond12 = new AdvancedModelRenderer(this);
        this.frond12.setRotationPoint(0.0F, -1.0F, 0.0F);
        this.frond11.addChild(frond12);
        this.frond12.cubeList.add(new ModelBox(frond12, 0, 4, -3.5F, -1.0F, -0.5F, 1, 1, 1, 0.0F, false));
        this.frond12.cubeList.add(new ModelBox(frond12, 0, 4, -1.5F, -1.0F, -0.5F, 1, 1, 1, 0.0F, false));
        this.frond12.cubeList.add(new ModelBox(frond12, 0, 4, 5.5F, -1.0F, -0.5F, 1, 1, 1, 0.0F, false));
        this.frond12.cubeList.add(new ModelBox(frond12, 0, 4, 3.5F, -1.0F, -0.5F, 1, 1, 1, 0.0F, false));
        this.frond12.cubeList.add(new ModelBox(frond12, 0, 4, -5.5F, -1.0F, -0.5F, 1, 1, 1, 0.0F, false));
        this.frond12.cubeList.add(new ModelBox(frond12, 0, 4, 1.5F, -1.0F, -0.5F, 1, 1, 1, 0.0F, false));
        this.frond12.cubeList.add(new ModelBox(frond12, 0, 0, -6.0F, -1.0F, 0.0F, 12, 1, 0, 0.0F, false));

        this.frond13 = new AdvancedModelRenderer(this);
        this.frond13.setRotationPoint(0.0F, -1.0F, 0.0F);
        this.frond12.addChild(frond13);
        this.frond13.cubeList.add(new ModelBox(frond13, 0, 4, -3.5F, -1.0F, -0.5F, 1, 1, 1, 0.0F, false));
        this.frond13.cubeList.add(new ModelBox(frond13, 0, 4, -1.5F, -1.0F, -0.5F, 1, 1, 1, 0.0F, false));
        this.frond13.cubeList.add(new ModelBox(frond13, 0, 4, 6.5F, -1.0F, -0.5F, 1, 1, 1, 0.0F, false));
        this.frond13.cubeList.add(new ModelBox(frond13, 0, 4, 3.5F, -1.0F, -0.5F, 1, 1, 1, 0.0F, false));
        this.frond13.cubeList.add(new ModelBox(frond13, 0, 4, -6.5F, -1.0F, -0.5F, 1, 1, 1, 0.0F, false));
        this.frond13.cubeList.add(new ModelBox(frond13, 0, 4, 1.5F, -1.0F, -0.5F, 1, 1, 1, 0.0F, false));
        this.frond13.cubeList.add(new ModelBox(frond13, 0, 0, -6.0F, -1.0F, 0.0F, 13, 1, 0, 0.0F, false));

        this.frond14 = new AdvancedModelRenderer(this);
        this.frond14.setRotationPoint(0.0F, -1.0F, 0.0F);
        this.frond13.addChild(frond14);
        this.frond14.cubeList.add(new ModelBox(frond14, 0, 4, -3.5F, -1.0F, -0.5F, 1, 1, 1, 0.0F, false));
        this.frond14.cubeList.add(new ModelBox(frond14, 0, 4, -1.5F, -1.0F, -0.5F, 1, 1, 1, 0.0F, false));
        this.frond14.cubeList.add(new ModelBox(frond14, 0, 4, 3.5F, -1.0F, -0.5F, 1, 1, 1, 0.0F, false));
        this.frond14.cubeList.add(new ModelBox(frond14, 0, 4, 1.5F, -1.0F, -0.5F, 1, 1, 1, 0.0F, false));
        this.frond14.cubeList.add(new ModelBox(frond14, 0, 0, -4.5F, -1.0F, 0.0F, 10, 1, 0, 0.0F, false));

        this.frond15 = new AdvancedModelRenderer(this);
        this.frond15.setRotationPoint(0.0F, -1.0F, 0.0F);
        this.frond14.addChild(frond15);
        this.frond15.cubeList.add(new ModelBox(frond15, 0, 4, -4.5F, -1.0F, -0.5F, 1, 1, 1, 0.0F, false));
        this.frond15.cubeList.add(new ModelBox(frond15, 0, 4, -0.5F, -1.0F, -0.5F, 1, 1, 1, 0.0F, false));
        this.frond15.cubeList.add(new ModelBox(frond15, 0, 4, 4.5F, -1.0F, -0.5F, 1, 1, 1, 0.0F, false));
        this.frond15.cubeList.add(new ModelBox(frond15, 0, 4, 1.5F, -1.0F, -0.5F, 1, 1, 1, 0.0F, false));
        this.frond15.cubeList.add(new ModelBox(frond15, 0, 0, -4.0F, -1.0F, 0.0F, 9, 1, 0, 0.0F, false));

        this.frond16 = new AdvancedModelRenderer(this);
        this.frond16.setRotationPoint(0.0F, -1.0F, 0.0F);
        this.frond15.addChild(frond16);
        this.frond16.cubeList.add(new ModelBox(frond16, 0, 4, -4.5F, -1.0F, -0.5F, 1, 1, 1, 0.0F, false));
        this.frond16.cubeList.add(new ModelBox(frond16, 0, 4, -1.5F, -1.0F, -0.5F, 1, 1, 1, 0.0F, false));
        this.frond16.cubeList.add(new ModelBox(frond16, 0, 4, 4.5F, -1.0F, -0.5F, 1, 1, 1, 0.0F, false));
        this.frond16.cubeList.add(new ModelBox(frond16, 0, 4, 2.5F, -1.0F, -0.5F, 1, 1, 1, 0.0F, false));
        this.frond16.cubeList.add(new ModelBox(frond16, 0, 0, -4.0F, -1.0F, 0.0F, 9, 1, 0, 0.0F, false));

        this.frond17 = new AdvancedModelRenderer(this);
        this.frond17.setRotationPoint(0.0F, -1.0F, 0.0F);
        this.frond16.addChild(frond17);
        this.frond17.cubeList.add(new ModelBox(frond17, 0, 4, -1.5F, -1.0F, -0.5F, 1, 1, 1, 0.0F, false));
        this.frond17.cubeList.add(new ModelBox(frond17, 0, 4, 1.5F, -1.0F, -0.5F, 1, 1, 1, 0.0F, false));
        this.frond17.cubeList.add(new ModelBox(frond17, 10, 0, -1.0F, -1.0F, 0.0F, 3, 1, 0, 0.0F, false));

        updateDefaultPose();
    }

    public void renderAll(float f) {
        this.resetToDefaultPose();
        AdvancedModelRenderer[] Frond = {this.frond1,this.frond2,this.frond3,this.frond4,this.frond5,this.frond6,this.frond7,this.frond8,this.frond9,this.frond10,this.frond11,this.frond12,this.frond13,this.frond14,this.frond15,this.frond16,this.frond17};
        float speed = 0.035F;
        this.chainWave(Frond, speed, 0.15F, 4, f, 0.38F);
        this.frond1.swing(0.05F, 0.1F, false, 0F, 0F, f, -0.5F);
        this.bone.render(0.1f);
    }

    public void setRotateAngle(AdvancedModelRenderer modelRenderer, float x, float y, float z) {
        modelRenderer.rotateAngleX = x;
        modelRenderer.rotateAngleY = y;
        modelRenderer.rotateAngleZ = z;
    }

}
