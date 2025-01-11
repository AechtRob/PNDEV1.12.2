package net.lepidodendron.entity.model.tile;

import net.ilexiconn.llibrary.client.model.tools.AdvancedModelBase;
import net.ilexiconn.llibrary.client.model.tools.AdvancedModelRenderer;
import net.minecraft.client.model.ModelBox;

public class ModelParviscopa extends AdvancedModelBase {
    private final AdvancedModelRenderer bone;
    private final AdvancedModelRenderer frond1;
    private final AdvancedModelRenderer frond2;
    private final AdvancedModelRenderer frond3;
    private final AdvancedModelRenderer frond4;
    private final AdvancedModelRenderer frond5;
    private final AdvancedModelRenderer frond6;
    private final AdvancedModelRenderer frond7;
    private final AdvancedModelRenderer cube_r1;
    private final AdvancedModelRenderer frond8;
    private final AdvancedModelRenderer cube_r2;
    private final AdvancedModelRenderer cube_r3;
    private final AdvancedModelRenderer frond9;
    private final AdvancedModelRenderer cube_r4;
    private final AdvancedModelRenderer cube_r5;
    private final AdvancedModelRenderer frond10;
    private final AdvancedModelRenderer frond11;
    private final AdvancedModelRenderer frond12;
    private final AdvancedModelRenderer cube_r6;
    private final AdvancedModelRenderer frond13;
    private final AdvancedModelRenderer frond14;

    public ModelParviscopa() {
        textureWidth = 16;
        textureHeight = 16;

        bone = new AdvancedModelRenderer(this);
        bone.setRotationPoint(8.0F, 27.0F, -8.0F);


        frond1 = new AdvancedModelRenderer(this);
        frond1.setRotationPoint(-8.0F, -3.0F, 8.0F);
        bone.addChild(frond1);


        frond2 = new AdvancedModelRenderer(this);
        frond2.setRotationPoint(0.0F, 0.0F, 0.0F);
        frond1.addChild(frond2);
        frond2.cubeList.add(new ModelBox(frond2, 0, 14, -0.5F, -1.0F, -0.5F, 1, 1, 1, 0.0F, false));

        frond3 = new AdvancedModelRenderer(this);
        frond3.setRotationPoint(0.0F, -1.0F, 0.0F);
        frond2.addChild(frond3);
        frond3.cubeList.add(new ModelBox(frond3, 0, 13, -0.5F, -1.0F, -0.5F, 1, 1, 1, 0.0F, false));

        frond4 = new AdvancedModelRenderer(this);
        frond4.setRotationPoint(0.0F, -1.0F, 0.0F);
        frond3.addChild(frond4);
        frond4.cubeList.add(new ModelBox(frond4, 1, 13, -0.5F, -1.0F, 0.0F, 1, 1, 0, 0.0F, false));

        frond5 = new AdvancedModelRenderer(this);
        frond5.setRotationPoint(0.0F, -1.0F, 0.0F);
        frond4.addChild(frond5);
        frond5.cubeList.add(new ModelBox(frond5, 0, 12, -1.5F, -1.0F, 0.0F, 3, 1, 0, 0.0F, false));

        frond6 = new AdvancedModelRenderer(this);
        frond6.setRotationPoint(0.0F, -1.0F, 0.0F);
        frond5.addChild(frond6);
        frond6.cubeList.add(new ModelBox(frond6, 0, 11, -2.5F, -1.0F, 0.0F, 4, 1, 0, 0.0F, false));

        frond7 = new AdvancedModelRenderer(this);
        frond7.setRotationPoint(0.0F, -1.0F, 0.0F);
        frond6.addChild(frond7);
        frond7.cubeList.add(new ModelBox(frond7, 0, 10, -2.5F, -1.0F, 0.0F, 5, 1, 0, 0.0F, false));

        cube_r1 = new AdvancedModelRenderer(this);
        cube_r1.setRotationPoint(-2.5F, 0.0F, 0.0F);
        frond7.addChild(cube_r1);
        setRotateAngle(cube_r1, -0.3927F, 0.0F, 0.0F);
        cube_r1.cubeList.add(new ModelBox(cube_r1, 4, 14, 0.0F, -2.0F, 0.0F, 1, 2, 0, 0.0F, false));

        frond8 = new AdvancedModelRenderer(this);
        frond8.setRotationPoint(0.0F, -1.0F, 0.0F);
        frond7.addChild(frond8);
        frond8.cubeList.add(new ModelBox(frond8, 0, 9, -3.5F, -1.0F, 0.0F, 7, 1, 0, 0.0F, false));

        cube_r2 = new AdvancedModelRenderer(this);
        cube_r2.setRotationPoint(0.0F, 0.0F, 0.0F);
        frond8.addChild(cube_r2);
        setRotateAngle(cube_r2, 0.7854F, 0.0F, 0.0F);
        cube_r2.cubeList.add(new ModelBox(cube_r2, 14, 7, -0.5F, -3.0F, 0.0F, 1, 3, 0, 0.0F, false));

        cube_r3 = new AdvancedModelRenderer(this);
        cube_r3.setRotationPoint(4.0F, 0.0F, 0.0F);
        frond8.addChild(cube_r3);
        setRotateAngle(cube_r3, -0.3927F, 0.0F, 0.0F);
        cube_r3.cubeList.add(new ModelBox(cube_r3, 14, 7, -1.5F, -3.0F, 0.0F, 1, 3, 0, 0.0F, false));

        frond9 = new AdvancedModelRenderer(this);
        frond9.setRotationPoint(0.0F, -1.0F, 0.0F);
        frond8.addChild(frond9);
        frond9.cubeList.add(new ModelBox(frond9, 0, 8, -2.5F, -1.0F, 0.0F, 7, 1, 0, 0.0F, false));
        frond9.cubeList.add(new ModelBox(frond9, 6, 12, -4.5F, -1.0F, 0.0F, 2, 1, 0, 0.0F, false));

        cube_r4 = new AdvancedModelRenderer(this);
        cube_r4.setRotationPoint(4.0F, -1.0F, 0.0F);
        frond9.addChild(cube_r4);
        setRotateAngle(cube_r4, 0.3927F, 0.0F, 0.0F);
        cube_r4.cubeList.add(new ModelBox(cube_r4, 4, 14, -0.5F, -2.0F, 0.0F, 1, 2, 0, 0.0F, false));

        cube_r5 = new AdvancedModelRenderer(this);
        cube_r5.setRotationPoint(-3.0F, 0.0F, 0.0F);
        frond9.addChild(cube_r5);
        setRotateAngle(cube_r5, 0.3927F, 0.0F, 0.0F);
        cube_r5.cubeList.add(new ModelBox(cube_r5, 4, 14, -0.5F, -2.0F, 0.0F, 1, 2, 0, 0.0F, false));

        frond10 = new AdvancedModelRenderer(this);
        frond10.setRotationPoint(0.0F, -1.0F, 0.0F);
        frond9.addChild(frond10);
        frond10.cubeList.add(new ModelBox(frond10, 0, 7, -2.5F, -1.0F, 0.0F, 7, 1, 0, 0.0F, false));
        frond10.cubeList.add(new ModelBox(frond10, 10, 12, -5.5F, -1.0F, 0.0F, 3, 1, 0, 0.0F, false));

        frond11 = new AdvancedModelRenderer(this);
        frond11.setRotationPoint(0.0F, -1.0F, 0.0F);
        frond10.addChild(frond11);
        frond11.cubeList.add(new ModelBox(frond11, 0, 6, -1.5F, -1.0F, 0.0F, 7, 1, 0, 0.0F, false));
        frond11.cubeList.add(new ModelBox(frond11, 8, 11, -6.5F, -1.0F, 0.0F, 4, 1, 0, 0.0F, false));

        frond12 = new AdvancedModelRenderer(this);
        frond12.setRotationPoint(0.0F, -1.0F, 0.0F);
        frond11.addChild(frond12);
        frond12.cubeList.add(new ModelBox(frond12, 0, 5, -0.5F, -1.0F, 0.0F, 7, 1, 0, 0.0F, false));
        frond12.cubeList.add(new ModelBox(frond12, 6, 13, -5.5F, -1.0F, 0.0F, 5, 1, 0, 0.0F, false));

        cube_r6 = new AdvancedModelRenderer(this);
        cube_r6.setRotationPoint(-3.0F, 0.0F, 0.0F);
        frond12.addChild(cube_r6);
        setRotateAngle(cube_r6, -0.7854F, 0.0F, 0.0F);
        cube_r6.cubeList.add(new ModelBox(cube_r6, 4, 14, 1.5F, -2.0F, 0.0F, 1, 2, 0, 0.0F, false));

        frond13 = new AdvancedModelRenderer(this);
        frond13.setRotationPoint(0.0F, -1.0F, 0.0F);
        frond12.addChild(frond13);
        frond13.cubeList.add(new ModelBox(frond13, 0, 4, -3.5F, -1.0F, 0.0F, 8, 1, 0, 0.0F, false));

        frond14 = new AdvancedModelRenderer(this);
        frond14.setRotationPoint(0.0F, -1.0F, 0.0F);
        frond13.addChild(frond14);
        frond14.cubeList.add(new ModelBox(frond14, 10, 10, -1.5F, -1.0F, 0.0F, 3, 1, 0, 0.0F, false));

        updateDefaultPose();
    }

    public void renderAll(float f) {
        this.resetToDefaultPose();
        //this.bone.offsetY = 0.15F;
        AdvancedModelRenderer[] Frond = {this.frond1,this.frond2,this.frond3,this.frond4,this.frond5,this.frond6,this.frond7,this.frond8,this.frond9,this.frond10,this.frond11,this.frond12,this.frond13,this.frond14};
        float speed = 0.042F;
        this.chainWave(Frond, speed, 0.1F, 3.5, f, 0.45F);
        this.frond1.swing(0.07F, 0.1F, false, 0F, 0F, f, -0.8F);
        this.bone.render(0.1f);
    }

    public void setRotateAngle(AdvancedModelRenderer modelRenderer, float x, float y, float z) {
        modelRenderer.rotateAngleX = x;
        modelRenderer.rotateAngleY = y;
        modelRenderer.rotateAngleZ = z;
    }

}
