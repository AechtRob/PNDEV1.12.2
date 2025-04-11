package net.lepidodendron.entity.model.tile;

import net.ilexiconn.llibrary.client.model.tools.AdvancedModelRenderer;
import net.lepidodendron.entity.model.llibraryextensions.AdvancedModelBaseExtended;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;

public class ModelPinacocerasShell extends AdvancedModelBaseExtended {
    private final AdvancedModelRenderer Root;
    private final AdvancedModelRenderer Shell1;
    private final AdvancedModelRenderer Shellfront1;
    private final AdvancedModelRenderer Shellfront2;
    private final AdvancedModelRenderer Shellfront3;
    private final AdvancedModelRenderer cube_r1;
    private final AdvancedModelRenderer Shell2;
    private final AdvancedModelRenderer Shell3;
    private final AdvancedModelRenderer Shell4;
    private final AdvancedModelRenderer Shell5;
    private final AdvancedModelRenderer Shell6;
    private final AdvancedModelRenderer Shell7;
    private final AdvancedModelRenderer Mantle1;
    private final AdvancedModelRenderer Mantle2;
    private final AdvancedModelRenderer Tentacle1a;
    private final AdvancedModelRenderer Tentacle1b;
    private final AdvancedModelRenderer Tentacle2a;
    private final AdvancedModelRenderer Tentacle2b;
    private final AdvancedModelRenderer Tentacle3a;
    private final AdvancedModelRenderer Tentacle3b;
    private final AdvancedModelRenderer Tentacle4a;
    private final AdvancedModelRenderer Tentacle4b;
    private final AdvancedModelRenderer Tentacle5a;
    private final AdvancedModelRenderer Tentacle5b;
    private final AdvancedModelRenderer Tentacle6a;
    private final AdvancedModelRenderer Tentacle6b;
    private final AdvancedModelRenderer Tentacle7a;
    private final AdvancedModelRenderer Tentacle7b;
    private final AdvancedModelRenderer Tentacle8a;
    private final AdvancedModelRenderer Tentacle8b;
    private final AdvancedModelRenderer Tentacle9a;
    private final AdvancedModelRenderer Tentacle9b;
    private final AdvancedModelRenderer Tentacle10a;
    private final AdvancedModelRenderer Tentacle10b;
    private final AdvancedModelRenderer eyeRight;
    private final AdvancedModelRenderer eyeLeft;
    private final AdvancedModelRenderer Mantle3;
    private final AdvancedModelRenderer cube_r2;

    public ModelPinacocerasShell() {
        this.textureWidth = 78;
        this.textureHeight = 78;

        this.Root = new AdvancedModelRenderer(this);
        this.Root.setRotationPoint(0.0F, 5.0F, -3.0F);
        this.setRotateAngle(Root, 0.0F, 3.1416F, 0.0F);


        this.Shell1 = new AdvancedModelRenderer(this);
        this.Shell1.setRotationPoint(0.0F, 19.0464F, -8.2271F);
        this.Root.addChild(Shell1);
        this.Shell1.cubeList.add(new ModelBox(Shell1, 0, 0, -1.5F, -12.0F, 0.0F, 3, 12, 10, 0.01F, false));
        this.Shell1.cubeList.add(new ModelBox(Shell1, 0, 0, -0.5F, -15.0F, 5.0F, 1, 4, 4, -0.04F, false));

        this.Shellfront1 = new AdvancedModelRenderer(this);
        this.Shellfront1.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.Shell1.addChild(Shellfront1);
        this.setRotateAngle(Shellfront1, -0.48F, 0.0F, 0.0F);
        this.Shellfront1.cubeList.add(new ModelBox(Shellfront1, 42, 39, -2.0F, -12.0F, -6.0F, 4, 12, 6, 0.0F, false));

        this.Shellfront2 = new AdvancedModelRenderer(this);
        this.Shellfront2.setRotationPoint(0.0F, 0.0F, -6.0F);
        this.Shellfront1.addChild(Shellfront2);
        this.setRotateAngle(Shellfront2, -0.2182F, 0.0F, 0.0F);
        this.Shellfront2.cubeList.add(new ModelBox(Shellfront2, 53, 14, -2.0F, -7.0F, -6.0F, 4, 7, 6, 0.01F, false));

        this.Shellfront3 = new AdvancedModelRenderer(this);
        this.Shellfront3.setRotationPoint(0.0F, 0.0F, -6.0F);
        this.Shellfront2.addChild(Shellfront3);
        this.setRotateAngle(Shellfront3, -0.5236F, 0.0F, 0.0F);


        this.cube_r1 = new AdvancedModelRenderer(this);
        this.cube_r1.setRotationPoint(0.0F, 0.0F, -1.0F);
        this.Shellfront3.addChild(cube_r1);
        this.setRotateAngle(cube_r1, -0.1745F, 0.0F, 0.0F);
        this.cube_r1.cubeList.add(new ModelBox(cube_r1, 24, 33, -2.0F, -17.0F, -4.0F, 4, 17, 5, 0.04F, false));

        this.Shell2 = new AdvancedModelRenderer(this);
        this.Shell2.setRotationPoint(0.0F, 0.0F, 10.0F);
        this.Shell1.addChild(Shell2);
        this.setRotateAngle(Shell2, 0.6109F, 0.0F, 0.0F);
        this.Shell2.cubeList.add(new ModelBox(Shell2, 16, 12, -1.5F, -11.0F, 0.0F, 3, 11, 10, 0.0F, false));

        this.Shell3 = new AdvancedModelRenderer(this);
        this.Shell3.setRotationPoint(0.0F, 0.0F, 10.0F);
        this.Shell2.addChild(Shell3);
        this.setRotateAngle(Shell3, 0.7854F, 0.0F, 0.0F);
        this.Shell3.cubeList.add(new ModelBox(Shell3, 0, 23, -1.0F, -11.0F, 0.0F, 2, 11, 10, 0.01F, false));

        this.Shell4 = new AdvancedModelRenderer(this);
        this.Shell4.setRotationPoint(0.0F, 0.0F, 10.0F);
        this.Shell3.addChild(Shell4);
        this.setRotateAngle(Shell4, 0.7854F, 0.0F, 0.0F);
        this.Shell4.cubeList.add(new ModelBox(Shell4, 32, 0, -1.0F, -10.0F, 0.0F, 2, 10, 10, 0.0F, false));

        this.Shell5 = new AdvancedModelRenderer(this);
        this.Shell5.setRotationPoint(0.0F, 0.0F, 10.0F);
        this.Shell4.addChild(Shell5);
        this.setRotateAngle(Shell5, 0.8727F, 0.0F, 0.0F);
        this.Shell5.cubeList.add(new ModelBox(Shell5, 42, 20, -0.5F, -10.0F, 0.0F, 1, 10, 9, 0.04F, false));

        this.Shell6 = new AdvancedModelRenderer(this);
        this.Shell6.setRotationPoint(0.0F, 0.0F, 9.0F);
        this.Shell5.addChild(Shell6);
        this.setRotateAngle(Shell6, 0.829F, 0.0F, 0.0F);
        this.Shell6.cubeList.add(new ModelBox(Shell6, 0, 44, -0.5F, -9.0F, 0.0F, 1, 9, 8, 0.01F, false));

        this.Shell7 = new AdvancedModelRenderer(this);
        this.Shell7.setRotationPoint(0.0F, 0.0F, 8.0F);
        this.Shell6.addChild(Shell7);
        this.setRotateAngle(Shell7, 0.6981F, 0.0F, 0.0F);
        this.Shell7.cubeList.add(new ModelBox(Shell7, 10, 53, -0.5F, -8.0F, 0.0F, 1, 8, 8, 0.0F, false));

        this.Mantle1 = new AdvancedModelRenderer(this);
        this.Mantle1.setRotationPoint(0.0F, 6.0464F, -9.4771F);
        this.Root.addChild(Mantle1);
        this.setRotateAngle(Mantle1, -0.829F, 0.0F, 0.0F);
        this.Mantle1.cubeList.add(new ModelBox(Mantle1, 28, 55, -1.5F, 0.0F, -4.0F, 3, 6, 4, 0.01F, false));

        this.Mantle2 = new AdvancedModelRenderer(this);
        this.Mantle2.setRotationPoint(0.0F, 0.0F, -4.0F);
        this.Mantle1.addChild(Mantle2);
        this.setRotateAngle(Mantle2, 0.7418F, 0.0F, 0.0F);
        this.Mantle2.cubeList.add(new ModelBox(Mantle2, 46, 0, -1.5F, 0.0F, -5.0F, 3, 3, 5, 0.0F, false));

        this.Tentacle1a = new AdvancedModelRenderer(this);
        this.Tentacle1a.setRotationPoint(0.5F, 2.5F, -5.0F);
        this.Mantle2.addChild(Tentacle1a);
        this.setRotateAngle(Tentacle1a, 0.0437F, -0.0436F, -0.0019F);
        this.Tentacle1a.cubeList.add(new ModelBox(Tentacle1a, 62, 31, -0.5F, -0.5F, -3.0F, 1, 1, 3, 0.0F, false));

        this.Tentacle1b = new AdvancedModelRenderer(this);
        this.Tentacle1b.setRotationPoint(0.0F, 0.0F, -2.5F);
        this.Tentacle1a.addChild(Tentacle1b);
        this.setRotateAngle(Tentacle1b, -0.1309F, 0.0436F, 0.0F);
        this.Tentacle1b.cubeList.add(new ModelBox(Tentacle1b, 62, 5, -0.5F, -0.5F, -4.0F, 1, 1, 4, 0.0F, false));

        this.Tentacle2a = new AdvancedModelRenderer(this);
        this.Tentacle2a.setRotationPoint(1.0F, 2.5F, -5.0F);
        this.Mantle2.addChild(Tentacle2a);
        this.setRotateAngle(Tentacle2a, 0.0F, -0.2182F, 0.0F);
        this.Tentacle2a.cubeList.add(new ModelBox(Tentacle2a, 62, 27, -0.5F, -0.5F, -3.0F, 1, 1, 3, 0.0F, false));

        this.Tentacle2b = new AdvancedModelRenderer(this);
        this.Tentacle2b.setRotationPoint(0.0F, 0.0F, -2.5F);
        this.Tentacle2a.addChild(Tentacle2b);
        this.setRotateAngle(Tentacle2b, -0.0873F, 0.1309F, 0.0F);
        this.Tentacle2b.cubeList.add(new ModelBox(Tentacle2b, 0, 61, -0.5F, -0.5F, -4.0F, 1, 1, 4, 0.0F, false));

        this.Tentacle3a = new AdvancedModelRenderer(this);
        this.Tentacle3a.setRotationPoint(1.0F, 1.5F, -5.0F);
        this.Mantle2.addChild(Tentacle3a);
        this.setRotateAngle(Tentacle3a, 0.0F, -0.3054F, 0.0F);
        this.Tentacle3a.cubeList.add(new ModelBox(Tentacle3a, 48, 57, -0.5F, -0.5F, -3.0F, 1, 1, 3, 0.0F, false));

        this.Tentacle3b = new AdvancedModelRenderer(this);
        this.Tentacle3b.setRotationPoint(0.0F, 0.0F, -2.5F);
        this.Tentacle3a.addChild(Tentacle3b);
        this.setRotateAngle(Tentacle3b, -0.0218F, 0.1745F, 0.0F);
        this.Tentacle3b.cubeList.add(new ModelBox(Tentacle3b, 58, 58, -0.5F, -0.5F, -4.0F, 1, 1, 4, 0.0F, false));

        this.Tentacle4a = new AdvancedModelRenderer(this);
        this.Tentacle4a.setRotationPoint(1.0F, 0.5F, -5.0F);
        this.Mantle2.addChild(Tentacle4a);
        this.setRotateAngle(Tentacle4a, -0.0039F, -0.2181F, 0.0443F);
        this.Tentacle4a.cubeList.add(new ModelBox(Tentacle4a, 20, 55, -0.5F, -0.5F, -3.0F, 1, 1, 3, 0.0F, false));

        this.Tentacle4b = new AdvancedModelRenderer(this);
        this.Tentacle4b.setRotationPoint(0.0F, 0.0F, -2.5F);
        this.Tentacle4a.addChild(Tentacle4b);
        this.setRotateAngle(Tentacle4b, 0.1772F, 0.1719F, 0.0306F);
        this.Tentacle4b.cubeList.add(new ModelBox(Tentacle4b, 58, 53, -0.5F, -0.5F, -4.0F, 1, 1, 4, 0.0F, false));

        this.Tentacle5a = new AdvancedModelRenderer(this);
        this.Tentacle5a.setRotationPoint(0.5F, 0.5F, -5.0F);
        this.Mantle2.addChild(Tentacle5a);
        this.setRotateAngle(Tentacle5a, 0.0435F, -0.0433F, 0.0057F);
        this.Tentacle5a.cubeList.add(new ModelBox(Tentacle5a, 0, 48, -0.5F, -0.5F, -3.0F, 1, 1, 3, 0.0F, false));

        this.Tentacle5b = new AdvancedModelRenderer(this);
        this.Tentacle5b.setRotationPoint(0.0F, 0.0F, -2.5F);
        this.Tentacle5a.addChild(Tentacle5b);
        this.setRotateAngle(Tentacle5b, 0.0873F, 0.0436F, 0.0F);
        this.Tentacle5b.cubeList.add(new ModelBox(Tentacle5b, 52, 57, -0.5F, -0.5F, -4.0F, 1, 1, 4, 0.0F, false));

        this.Tentacle6a = new AdvancedModelRenderer(this);
        this.Tentacle6a.setRotationPoint(-0.5F, 2.5F, -5.0F);
        this.Mantle2.addChild(Tentacle6a);
        this.setRotateAngle(Tentacle6a, 0.0437F, 0.0436F, 0.0019F);
        this.Tentacle6a.cubeList.add(new ModelBox(Tentacle6a, 16, 44, -0.5F, -0.5F, -3.0F, 1, 1, 3, 0.0F, false));

        this.Tentacle6b = new AdvancedModelRenderer(this);
        this.Tentacle6b.setRotationPoint(0.0F, 0.0F, -2.5F);
        this.Tentacle6a.addChild(Tentacle6b);
        this.setRotateAngle(Tentacle6b, -0.1309F, -0.0436F, 0.0F);
        this.Tentacle6b.cubeList.add(new ModelBox(Tentacle6b, 42, 57, -0.5F, -0.5F, -4.0F, 1, 1, 4, 0.0F, false));

        this.Tentacle7a = new AdvancedModelRenderer(this);
        this.Tentacle7a.setRotationPoint(-1.0F, 2.5F, -5.0F);
        this.Mantle2.addChild(Tentacle7a);
        this.setRotateAngle(Tentacle7a, 0.0F, 0.2182F, 0.0F);
        this.Tentacle7a.cubeList.add(new ModelBox(Tentacle7a, 0, 44, -0.5F, -0.5F, -3.0F, 1, 1, 3, 0.0F, false));

        this.Tentacle7b = new AdvancedModelRenderer(this);
        this.Tentacle7b.setRotationPoint(0.0F, 0.0F, -2.5F);
        this.Tentacle7a.addChild(Tentacle7b);
        this.setRotateAngle(Tentacle7b, -0.0873F, -0.1309F, 0.0F);
        this.Tentacle7b.cubeList.add(new ModelBox(Tentacle7b, 57, 0, -0.5F, -0.5F, -4.0F, 1, 1, 4, 0.0F, false));

        this.Tentacle8a = new AdvancedModelRenderer(this);
        this.Tentacle8a.setRotationPoint(-1.0F, 1.5F, -5.0F);
        this.Mantle2.addChild(Tentacle8a);
        this.setRotateAngle(Tentacle8a, 0.0F, 0.3054F, 0.0F);
        this.Tentacle8a.cubeList.add(new ModelBox(Tentacle8a, 42, 24, -0.5F, -0.5F, -3.0F, 1, 1, 3, 0.0F, false));

        this.Tentacle8b = new AdvancedModelRenderer(this);
        this.Tentacle8b.setRotationPoint(0.0F, 0.0F, -2.5F);
        this.Tentacle8a.addChild(Tentacle8b);
        this.setRotateAngle(Tentacle8b, -0.0131F, -0.1745F, 0.0F);
        this.Tentacle8b.cubeList.add(new ModelBox(Tentacle8b, 56, 39, -0.5F, -0.5F, -4.0F, 1, 1, 4, 0.0F, false));

        this.Tentacle9a = new AdvancedModelRenderer(this);
        this.Tentacle9a.setRotationPoint(-1.0F, 0.5F, -5.0F);
        this.Mantle2.addChild(Tentacle9a);
        this.setRotateAngle(Tentacle9a, -0.0039F, 0.2181F, -0.0443F);
        this.Tentacle9a.cubeList.add(new ModelBox(Tentacle9a, 42, 20, -0.5F, -0.5F, -3.0F, 1, 1, 3, 0.0F, false));

        this.Tentacle9b = new AdvancedModelRenderer(this);
        this.Tentacle9b.setRotationPoint(0.0F, 0.0F, -2.5F);
        this.Tentacle9a.addChild(Tentacle9b);
        this.setRotateAngle(Tentacle9b, 0.1772F, -0.1719F, -0.0306F);
        this.Tentacle9b.cubeList.add(new ModelBox(Tentacle9b, 56, 8, -0.5F, -0.5F, -4.0F, 1, 1, 4, 0.0F, false));

        this.Tentacle10a = new AdvancedModelRenderer(this);
        this.Tentacle10a.setRotationPoint(-0.5F, 0.5F, -5.0F);
        this.Mantle2.addChild(Tentacle10a);
        this.setRotateAngle(Tentacle10a, 0.0435F, 0.0433F, -0.0057F);
        this.Tentacle10a.cubeList.add(new ModelBox(Tentacle10a, 0, 29, -0.5F, -0.5F, -3.0F, 1, 1, 3, 0.0F, false));

        this.Tentacle10b = new AdvancedModelRenderer(this);
        this.Tentacle10b.setRotationPoint(0.0F, 0.0F, -2.5F);
        this.Tentacle10a.addChild(Tentacle10b);
        this.setRotateAngle(Tentacle10b, 0.0873F, -0.0436F, 0.0F);
        this.Tentacle10b.cubeList.add(new ModelBox(Tentacle10b, 10, 44, -0.5F, -0.5F, -4.0F, 1, 1, 4, 0.0F, false));

        this.eyeRight = new AdvancedModelRenderer(this);
        this.eyeRight.setRotationPoint(-0.95F, 0.475F, -1.5F);
        this.Mantle2.addChild(eyeRight);
        this.setRotateAngle(eyeRight, 0.0F, 0.0F, -0.3054F);
        this.eyeRight.cubeList.add(new ModelBox(eyeRight, 32, 0, -0.5F, -4.0F, -1.5F, 1, 4, 3, 0.0F, false));

        this.eyeLeft = new AdvancedModelRenderer(this);
        this.eyeLeft.setRotationPoint(0.95F, 0.475F, -1.5F);
        this.Mantle2.addChild(eyeLeft);
        this.setRotateAngle(eyeLeft, 0.0F, 0.0F, 0.3054F);
        this.eyeLeft.cubeList.add(new ModelBox(eyeLeft, 0, 22, -0.5F, -4.0F, -1.5F, 1, 4, 3, 0.0F, false));

        this.Mantle3 = new AdvancedModelRenderer(this);
        this.Mantle3.setRotationPoint(0.0F, 2.75F, -3.85F);
        this.Mantle1.addChild(Mantle3);
        this.setRotateAngle(Mantle3, 0.7418F, 0.0F, 0.0F);


        this.cube_r2 = new AdvancedModelRenderer(this);
        this.cube_r2.setRotationPoint(0.5F, 2.0F, -1.0F);
        this.Mantle3.addChild(cube_r2);
        this.setRotateAngle(cube_r2, 0.1309F, 0.0F, 0.0F);
        this.cube_r2.cubeList.add(new ModelBox(cube_r2, 16, 0, -1.5F, -1.75F, -5.0F, 2, 2, 6, 0.0F, false));
        updateDefaultPose();
    }

    public void renderAll(float f) {
        this.resetToDefaultPose();
        this.Root.offsetY = -1.6F;
        //this.Root.offsetZ = 1.0F;
        this.Root.render(0.08f);
    }

    public void setRotateAngle(ModelRenderer modelRenderer, float x, float y, float z) {
        modelRenderer.rotateAngleX = x;
        modelRenderer.rotateAngleY = y;
        modelRenderer.rotateAngleZ = z;
    }

}
