package net.lepidodendron.entity.model.tile;

import net.ilexiconn.llibrary.client.model.tools.AdvancedModelBase;
import net.ilexiconn.llibrary.client.model.tools.AdvancedModelRenderer;
import net.minecraft.client.model.ModelBox;

public class ModelGigarimaneta extends AdvancedModelBase {
    private final AdvancedModelRenderer gigarimaneta;
    private final AdvancedModelRenderer cube_r1;
    private final AdvancedModelRenderer cube_r2;
    private final AdvancedModelRenderer cube_r3;
    private final AdvancedModelRenderer cube_r4;
    private final AdvancedModelRenderer frond1;
    private final AdvancedModelRenderer frond2;
    private final AdvancedModelRenderer frond3;
    private final AdvancedModelRenderer frond4;
    private final AdvancedModelRenderer frond5;
    private final AdvancedModelRenderer frond6;
    private final AdvancedModelRenderer frond7;
    private final AdvancedModelRenderer frond8;
    private final AdvancedModelRenderer frond9;

    public ModelGigarimaneta() {
        textureWidth = 64;
        textureHeight = 64;

        gigarimaneta = new AdvancedModelRenderer(this);
        gigarimaneta.setRotationPoint(-0.85F, 24.0F, -8.0F);
        gigarimaneta.cubeList.add(new ModelBox(gigarimaneta, 0, 0, 1.5F, -1.0F, -1.0F, 5, 1, 9, 0.0F, false));
        gigarimaneta.cubeList.add(new ModelBox(gigarimaneta, 40, 36, -5.4F, -1.0F, 2.0F, 4, 1, 6, 0.0F, false));
        gigarimaneta.cubeList.add(new ModelBox(gigarimaneta, 29, 0, -8.5F, -1.0F, 8.0F, 5, 1, 8, 0.0F, false));
        gigarimaneta.cubeList.add(new ModelBox(gigarimaneta, 27, 31, 0.4F, -1.0F, 7.0F, 4, 1, 5, -0.002F, false));
        gigarimaneta.cubeList.add(new ModelBox(gigarimaneta, 20, 40, 7.0F, -1.0F, 5.5F, 6, 1, 5, 0.0F, false));

        cube_r1 = new AdvancedModelRenderer(this);
        cube_r1.setRotationPoint(-8.5F, 0.0F, 0.0F);
        gigarimaneta.addChild(cube_r1);
        setRotateAngle(cube_r1, 0.0F, -0.7854F, 0.0F);
        cube_r1.cubeList.add(new ModelBox(cube_r1, 0, 31, 14.2028F, -1.0F, -6.3891F, 8, 1, 5, -0.001F, false));

        cube_r2 = new AdvancedModelRenderer(this);
        cube_r2.setRotationPoint(-8.5F, 0.0F, 0.0F);
        gigarimaneta.addChild(cube_r2);
        setRotateAngle(cube_r2, 0.0F, 0.3927F, 0.0F);
        cube_r2.cubeList.add(new ModelBox(cube_r2, 0, 11, -0.0974F, -1.0F, 8.5719F, 5, 1, 8, -0.001F, false));
        cube_r2.cubeList.add(new ModelBox(cube_r2, 0, 38, -5.8279F, -1.0F, 6.2304F, 6, 1, 5, -0.001F, false));
        cube_r2.cubeList.add(new ModelBox(cube_r2, 0, 21, 4.1393F, -1.0F, 3.4092F, 5, 1, 8, 0.001F, false));

        cube_r3 = new AdvancedModelRenderer(this);
        cube_r3.setRotationPoint(-8.5F, 0.0F, 0.0F);
        gigarimaneta.addChild(cube_r3);
        setRotateAngle(cube_r3, 0.0F, 0.7854F, 0.0F);
        cube_r3.cubeList.add(new ModelBox(cube_r3, 27, 11, -5.682F, -1.0F, 0.1317F, 5, 1, 8, 0.002F, false));

        cube_r4 = new AdvancedModelRenderer(this);
        cube_r4.setRotationPoint(-8.5F, 0.0F, 0.0F);
        gigarimaneta.addChild(cube_r4);
        setRotateAngle(cube_r4, 0.0F, -0.3927F, 0.0F);
        cube_r4.cubeList.add(new ModelBox(cube_r4, 27, 21, 14.8816F, -1.0F, -6.5406F, 5, 1, 8, 0.002F, false));

        frond1 = new AdvancedModelRenderer(this);
        frond1.setRotationPoint(10.05F, 0.0F, 0.6F);
        gigarimaneta.addChild(frond1);
        setRotateAngle(frond1, 0.0F, -0.3927F, 0.0F);
        frond1.cubeList.add(new ModelBox(frond1, 19, 31, -1.9844F, -0.16F, -3.9928F, 4, 0, 4, -0.002F, false));

        frond2 = new AdvancedModelRenderer(this);
        frond2.setRotationPoint(4.0F, 0.0F, -1.0F);
        gigarimaneta.addChild(frond2);
        frond2.cubeList.add(new ModelBox(frond2, 13, 12, -2.0F, -0.16F, -6.0F, 4, 0, 6, -0.002F, false));

        frond3 = new AdvancedModelRenderer(this);
        frond3.setRotationPoint(-1.0654F, 0.0F, 0.6231F);
        gigarimaneta.addChild(frond3);
        setRotateAngle(frond3, 0.0F, 0.3927F, 0.0F);
        frond3.cubeList.add(new ModelBox(frond3, 41, 0, -1.9908F, -0.16F, -6.9944F, 4, 0, 7, -0.002F, false));

        frond4 = new AdvancedModelRenderer(this);
        frond4.setRotationPoint(-10.9596F, 0.0F, 2.0061F);
        gigarimaneta.addChild(frond4);
        setRotateAngle(frond4, 0.0F, 0.7854F, 0.0F);
        frond4.cubeList.add(new ModelBox(frond4, 40, 22, -1.9931F, -0.16F, -5.4902F, 4, 0, 6, -0.002F, false));

        frond5 = new AdvancedModelRenderer(this);
        frond5.setRotationPoint(-10.5269F, 0.0F, 10.2904F);
        gigarimaneta.addChild(frond5);
        setRotateAngle(frond5, 0.0F, 0.3927F, 0.0F);
        frond5.cubeList.add(new ModelBox(frond5, 17, 0, -6.9956F, -0.16F, -2.0046F, 7, 0, 4, -0.002F, false));

        frond6 = new AdvancedModelRenderer(this);
        frond6.setRotationPoint(-6.0F, 0.0F, 16.0F);
        gigarimaneta.addChild(frond6);
        frond6.cubeList.add(new ModelBox(frond6, -7, 0, -2.0F, -0.16F, 0.0F, 4, 0, 7, -0.002F, false));

        frond7 = new AdvancedModelRenderer(this);
        frond7.setRotationPoint(-0.0169F, 0.0F, 14.3233F);
        gigarimaneta.addChild(frond7);
        setRotateAngle(frond7, 0.0F, 0.3927F, 0.0F);
        frond7.cubeList.add(new ModelBox(frond7, 39, 11, -1.9898F, -0.16F, 0.0196F, 4, 0, 7, -0.002F, false));

        frond8 = new AdvancedModelRenderer(this);
        frond8.setRotationPoint(9.95F, 0.0F, 12.95F);
        gigarimaneta.addChild(frond8);
        setRotateAngle(frond8, 0.0F, -0.7854F, 0.0F);
        frond8.cubeList.add(new ModelBox(frond8, 37, 31, -0.0094F, -0.16F, -2.0064F, 7, 0, 4, -0.002F, false));

        frond9 = new AdvancedModelRenderer(this);
        frond9.setRotationPoint(13.0F, 0.0F, 8.175F);
        gigarimaneta.addChild(frond9);
        frond9.cubeList.add(new ModelBox(frond9, 15, 24, -0.0093F, -0.16F, -2.0094F, 7, 0, 4, -0.002F, false));

        updateDefaultPose();
    }

    public void renderAll(float f) {
        this.resetToDefaultPose();

        frond1.walk(0.035F, 0.1F, false, 0F, -0.1F, f, 1F);
        frond2.walk(0.055F, 0.1F, false, 1F, -0.1F, f, 1F);
        frond3.walk(0.030F, 0.1F, false, 2F, -0.1F, f, 1F);
        frond4.walk(0.045F, 0.05F, false, 1.5F, -0.05F, f, 1F);
        frond5.flap(0.1F, -0.05F, false, 1.5F, 0.05F, f, 1F);
        frond6.walk(0.02F, -0.09F, false, 1.5F, 0.09F, f, 1F);
        frond7.walk(0.025F, -0.12F, false, 2.5F, 0.12F, f, 1F);
        frond8.flap(0.035F, 0.12F, false, 0.5F, -0.12F, f, 1F);
        frond9.flap(0.12F, 0.05F, false, 1.5F, -0.05F, f, 1F);

        this.gigarimaneta.render(0.1f);
    }

    public void setRotateAngle(AdvancedModelRenderer modelRenderer, float x, float y, float z) {
        modelRenderer.rotateAngleX = x;
        modelRenderer.rotateAngleY = y;
        modelRenderer.rotateAngleZ = z;
    }

}
