package net.lepidodendron.entity.model.tile;

import net.ilexiconn.llibrary.client.model.tools.AdvancedModelRenderer;
import net.lepidodendron.entity.model.llibraryextensions.AdvancedModelBaseExtended;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;

public class ModelAnthracocerasShell extends AdvancedModelBaseExtended {
    private final AdvancedModelRenderer Root;
    private final AdvancedModelRenderer Shell1;
    private final AdvancedModelRenderer Shell2;
    private final AdvancedModelRenderer Shell3;
    private final AdvancedModelRenderer Shell4;
    private final AdvancedModelRenderer Shell5;
    private final AdvancedModelRenderer Shell6;
    private final AdvancedModelRenderer Shell7;
    private final AdvancedModelRenderer Shell8;
    private final AdvancedModelRenderer Shell9;
    private final AdvancedModelRenderer Mantle1;
    private final AdvancedModelRenderer Siphon;
    private final AdvancedModelRenderer rightEye;
    private final AdvancedModelRenderer cube_r1;
    private final AdvancedModelRenderer leftEye;
    private final AdvancedModelRenderer cube_r2;
    private final AdvancedModelRenderer Mantle2;
    private final AdvancedModelRenderer Tentacle1a;
    private final AdvancedModelRenderer Tentacle1b;
    private final AdvancedModelRenderer Tentacle1c;
    private final AdvancedModelRenderer Tentacle2a;
    private final AdvancedModelRenderer Tentacle2b;
    private final AdvancedModelRenderer Tentacle2c;
    private final AdvancedModelRenderer Tentacle3a;
    private final AdvancedModelRenderer Tentacle3b;
    private final AdvancedModelRenderer Tentacle3c;
    private final AdvancedModelRenderer Tentacle4a;
    private final AdvancedModelRenderer Tentacle4b;
    private final AdvancedModelRenderer Tentacle4c;
    private final AdvancedModelRenderer Tentacle5a;
    private final AdvancedModelRenderer Tentacle5b;
    private final AdvancedModelRenderer Tentacle15c;
    private final AdvancedModelRenderer Tentacle6a;
    private final AdvancedModelRenderer Tentacle6b;
    private final AdvancedModelRenderer Tentacle6c;
    private final AdvancedModelRenderer Tentacle7a;
    private final AdvancedModelRenderer Tentacle7b;
    private final AdvancedModelRenderer Tentacle7c;
    private final AdvancedModelRenderer Tentacle8a;
    private final AdvancedModelRenderer Tentacle8b;
    private final AdvancedModelRenderer Tentacle8c;
    private final AdvancedModelRenderer Tentacle9a;
    private final AdvancedModelRenderer Tentacle9b;
    private final AdvancedModelRenderer Tentacle9c;
    private final AdvancedModelRenderer Tentacle10a;
    private final AdvancedModelRenderer Tentacle10b;
    private final AdvancedModelRenderer Tentacle10c;

    public ModelAnthracocerasShell() {
        this.textureWidth = 78;
        this.textureHeight = 78;

        this.Root = new AdvancedModelRenderer(this);
        this.Root.setRotationPoint(0.0F, 24.0F, 0.0F);
        this.setRotateAngle(Root, 0.48F, 0.0F, 0.0F);


        this.Shell1 = new AdvancedModelRenderer(this);
        this.Shell1.setRotationPoint(0.0F, -7.975F, -8.95F);
        this.Root.addChild(Shell1);
        this.setRotateAngle(Shell1, -0.9163F, 0.0F, 0.0F);
        this.Shell1.cubeList.add(new ModelBox(Shell1, 0, 16, -4.0F, -9.0F, 1.0F, 8, 9, 6, 0.0F, false));

        this.Shell2 = new AdvancedModelRenderer(this);
        this.Shell2.setRotationPoint(0.0F, 0.0F, 7.0F);
        this.Shell1.addChild(Shell2);
        this.setRotateAngle(Shell2, 0.6109F, 0.0F, 0.0F);
        this.Shell2.cubeList.add(new ModelBox(Shell2, 0, 0, -3.5F, -9.0F, 0.0F, 7, 9, 7, 0.01F, false));

        this.Shell3 = new AdvancedModelRenderer(this);
        this.Shell3.setRotationPoint(0.0F, 0.0F, 7.0F);
        this.Shell2.addChild(Shell3);
        this.setRotateAngle(Shell3, 0.829F, 0.0F, 0.0F);
        this.Shell3.cubeList.add(new ModelBox(Shell3, 21, 24, -3.5F, -8.0F, 0.0F, 7, 8, 7, 0.0F, false));
        this.Shell3.cubeList.add(new ModelBox(Shell3, 60, 54, -1.5F, -11.0F, 3.0F, 3, 3, 3, 0.0F, false));

        this.Shell4 = new AdvancedModelRenderer(this);
        this.Shell4.setRotationPoint(0.0F, 0.0F, 7.0F);
        this.Shell3.addChild(Shell4);
        this.setRotateAngle(Shell4, 0.6109F, 0.0F, 0.0F);
        this.Shell4.cubeList.add(new ModelBox(Shell4, 24, 39, -3.0F, -8.0F, 0.0F, 6, 8, 6, 0.01F, false));

        this.Shell5 = new AdvancedModelRenderer(this);
        this.Shell5.setRotationPoint(0.0F, 0.0F, 6.0F);
        this.Shell4.addChild(Shell5);
        this.setRotateAngle(Shell5, 0.6109F, 0.0F, 0.0F);
        this.Shell5.cubeList.add(new ModelBox(Shell5, 0, 33, -3.0F, -8.0F, 0.0F, 6, 8, 6, 0.0F, false));

        this.Shell6 = new AdvancedModelRenderer(this);
        this.Shell6.setRotationPoint(0.0F, 0.0F, 6.0F);
        this.Shell5.addChild(Shell6);
        this.setRotateAngle(Shell6, 0.8727F, 0.0F, 0.0F);
        this.Shell6.cubeList.add(new ModelBox(Shell6, 42, 16, -2.5F, -7.0F, 0.0F, 5, 7, 6, 0.01F, false));

        this.Shell7 = new AdvancedModelRenderer(this);
        this.Shell7.setRotationPoint(0.0F, 0.0F, 6.0F);
        this.Shell6.addChild(Shell7);
        this.setRotateAngle(Shell7, 0.6981F, 0.0F, 0.0F);
        this.Shell7.cubeList.add(new ModelBox(Shell7, 44, 34, -2.5F, -6.0F, 0.0F, 5, 6, 5, 0.0F, false));

        this.Shell8 = new AdvancedModelRenderer(this);
        this.Shell8.setRotationPoint(0.0F, 0.0F, 5.0F);
        this.Shell7.addChild(Shell8);
        this.setRotateAngle(Shell8, 0.6981F, 0.0F, 0.0F);
        this.Shell8.cubeList.add(new ModelBox(Shell8, 0, 47, -2.0F, -5.0F, 0.0F, 4, 5, 5, 0.01F, false));

        this.Shell9 = new AdvancedModelRenderer(this);
        this.Shell9.setRotationPoint(0.0F, 0.0F, 5.0F);
        this.Shell8.addChild(Shell9);
        this.setRotateAngle(Shell9, 0.6981F, 0.0F, 0.0F);
        this.Shell9.cubeList.add(new ModelBox(Shell9, 43, 48, -2.0F, -4.0F, 0.0F, 4, 4, 5, 0.0F, false));

        this.Mantle1 = new AdvancedModelRenderer(this);
        this.Mantle1.setRotationPoint(0.0F, -10.625F, -1.65F);
        this.Root.addChild(Mantle1);
        this.setRotateAngle(Mantle1, -0.4363F, 0.0F, 0.0F);
        this.Mantle1.cubeList.add(new ModelBox(Mantle1, 22, 10, -3.5F, -0.8528F, -6.6383F, 7, 6, 6, -0.01F, false));
        this.Mantle1.cubeList.add(new ModelBox(Mantle1, 18, 48, -2.5F, -3.8528F, -6.6383F, 0, 3, 5, 0.0F, false));
        this.Mantle1.cubeList.add(new ModelBox(Mantle1, 13, 42, -1.0F, -3.8528F, -6.6383F, 0, 3, 5, 0.0F, false));
        this.Mantle1.cubeList.add(new ModelBox(Mantle1, 18, 48, 2.5F, -3.8528F, -6.6383F, 0, 3, 5, 0.0F, true));
        this.Mantle1.cubeList.add(new ModelBox(Mantle1, 13, 42, 1.0F, -3.8528F, -6.6383F, 0, 3, 5, 0.0F, true));

        this.Siphon = new AdvancedModelRenderer(this);
        this.Siphon.setRotationPoint(0.5F, 5.5972F, -4.5133F);
        this.Mantle1.addChild(Siphon);
        this.setRotateAngle(Siphon, 0.3054F, 0.0F, 0.0F);
        this.Siphon.cubeList.add(new ModelBox(Siphon, 21, 0, -2.0F, -2.0F, -3.0F, 3, 2, 4, -0.01F, false));

        this.rightEye = new AdvancedModelRenderer(this);
        this.rightEye.setRotationPoint(-3.6375F, 1.2472F, -5.6133F);
        this.Mantle1.addChild(rightEye);
        this.setRotateAngle(rightEye, 0.0F, 0.0F, 0.2618F);
        this.rightEye.cubeList.add(new ModelBox(rightEye, 26, 65, -0.4625F, -1.5F, -1.5F, 1, 3, 3, -0.01F, false));
        this.rightEye.cubeList.add(new ModelBox(rightEye, 24, 39, -0.5375F, -1.0F, -1.0F, 1, 2, 2, -0.01F, false));

        this.cube_r1 = new AdvancedModelRenderer(this);
        this.cube_r1.setRotationPoint(-0.5625F, -1.5F, 0.0F);
        this.rightEye.addChild(cube_r1);
        this.setRotateAngle(cube_r1, 0.0F, 0.0F, -0.7418F);
        this.cube_r1.cubeList.add(new ModelBox(cube_r1, 48, 41, 0.1F, -1.875F, -1.5F, 0, 3, 4, 0.0F, false));

        this.leftEye = new AdvancedModelRenderer(this);
        this.leftEye.setRotationPoint(3.6375F, 1.2472F, -5.6133F);
        this.Mantle1.addChild(leftEye);
        this.setRotateAngle(leftEye, 0.0F, 0.0F, -0.2618F);
        this.leftEye.cubeList.add(new ModelBox(leftEye, 26, 65, -0.5375F, -1.5F, -1.5F, 1, 3, 3, -0.01F, true));
        this.leftEye.cubeList.add(new ModelBox(leftEye, 24, 39, -0.4625F, -1.0F, -1.0F, 1, 2, 2, -0.01F, true));

        this.cube_r2 = new AdvancedModelRenderer(this);
        this.cube_r2.setRotationPoint(0.5625F, -1.5F, 0.0F);
        this.leftEye.addChild(cube_r2);
        this.setRotateAngle(cube_r2, 0.0F, 0.0F, 0.7418F);
        this.cube_r2.cubeList.add(new ModelBox(cube_r2, 48, 41, -0.1F, -1.875F, -1.5F, 0, 3, 4, 0.0F, true));

        this.Mantle2 = new AdvancedModelRenderer(this);
        this.Mantle2.setRotationPoint(0.0F, -0.8528F, -6.6383F);
        this.Mantle1.addChild(Mantle2);
        this.setRotateAngle(Mantle2, 0.6109F, 0.0F, 0.0F);
        this.Mantle2.cubeList.add(new ModelBox(Mantle2, 42, 0, -3.5F, 0.0F, -5.0F, 7, 6, 5, 0.0F, false));
        this.Mantle2.cubeList.add(new ModelBox(Mantle2, 2, 0, -4.5F, 1.0F, -5.0F, 1, 0, 3, 0.0F, false));
        this.Mantle2.cubeList.add(new ModelBox(Mantle2, 0, 0, -4.5F, 3.0F, -5.0F, 1, 0, 3, 0.0F, false));
        this.Mantle2.cubeList.add(new ModelBox(Mantle2, 42, 6, -2.5F, -3.0F, -5.0F, 0, 3, 5, 0.0F, false));
        this.Mantle2.cubeList.add(new ModelBox(Mantle2, 28, 1, -1.0F, -3.0F, -5.0F, 0, 3, 5, 0.0F, false));
        this.Mantle2.cubeList.add(new ModelBox(Mantle2, 28, 1, 1.0F, -3.0F, -5.0F, 0, 3, 5, 0.0F, true));
        this.Mantle2.cubeList.add(new ModelBox(Mantle2, 42, 6, 2.5F, -3.0F, -5.0F, 0, 3, 5, 0.0F, true));
        this.Mantle2.cubeList.add(new ModelBox(Mantle2, 2, 0, 3.5F, 1.0F, -5.0F, 1, 0, 3, 0.0F, true));
        this.Mantle2.cubeList.add(new ModelBox(Mantle2, 0, 0, 3.5F, 3.0F, -5.0F, 1, 0, 3, 0.0F, true));

        this.Tentacle1a = new AdvancedModelRenderer(this);
        this.Tentacle1a.setRotationPoint(1.0F, 5.0F, -5.0F);
        this.Mantle2.addChild(Tentacle1a);
        this.setRotateAngle(Tentacle1a, 2.0445F, 0.0803F, -0.1551F);
        this.Tentacle1a.cubeList.add(new ModelBox(Tentacle1a, 59, 29, -1.0F, -1.0F, -4.0F, 2, 2, 4, 0.0F, false));

        this.Tentacle1b = new AdvancedModelRenderer(this);
        this.Tentacle1b.setRotationPoint(0.0F, 0.0F, -3.5F);
        this.Tentacle1a.addChild(Tentacle1b);
        this.setRotateAngle(Tentacle1b, 0.4851F, -0.4891F, -0.195F);
        this.Tentacle1b.cubeList.add(new ModelBox(Tentacle1b, 67, 15, -1.0F, -1.0F, -3.0F, 2, 2, 3, 0.0F, false));

        this.Tentacle1c = new AdvancedModelRenderer(this);
        this.Tentacle1c.setRotationPoint(0.0F, 0.0F, -2.5F);
        this.Tentacle1b.addChild(Tentacle1c);
        this.setRotateAngle(Tentacle1c, 0.2618F, -0.2618F, 0.0F);
        this.Tentacle1c.cubeList.add(new ModelBox(Tentacle1c, 7, 67, -1.0F, -1.0F, -3.0F, 2, 2, 3, 0.0F, false));

        this.Tentacle2a = new AdvancedModelRenderer(this);
        this.Tentacle2a.setRotationPoint(2.5F, 5.0F, -5.0F);
        this.Mantle2.addChild(Tentacle2a);
        this.setRotateAngle(Tentacle2a, 1.8371F, 0.192F, -0.8117F);
        this.Tentacle2a.cubeList.add(new ModelBox(Tentacle2a, 22, 59, -1.0F, -1.0F, -4.0F, 2, 2, 4, 0.0F, false));

        this.Tentacle2b = new AdvancedModelRenderer(this);
        this.Tentacle2b.setRotationPoint(0.0F, 0.0F, -3.5F);
        this.Tentacle2a.addChild(Tentacle2b);
        this.setRotateAngle(Tentacle2b, 0.4051F, -0.2415F, -0.1022F);
        this.Tentacle2b.cubeList.add(new ModelBox(Tentacle2b, 66, 10, -1.0F, -1.0F, -3.0F, 2, 2, 3, 0.0F, false));

        this.Tentacle2c = new AdvancedModelRenderer(this);
        this.Tentacle2c.setRotationPoint(0.0F, 0.0F, -2.5F);
        this.Tentacle2b.addChild(Tentacle2c);
        this.setRotateAngle(Tentacle2c, 0.3491F, -0.4363F, 0.0F);
        this.Tentacle2c.cubeList.add(new ModelBox(Tentacle2c, 66, 5, -1.0F, -1.0F, -3.0F, 2, 2, 3, 0.0F, false));

        this.Tentacle3a = new AdvancedModelRenderer(this);
        this.Tentacle3a.setRotationPoint(2.5F, 3.0F, -5.0F);
        this.Mantle2.addChild(Tentacle3a);
        this.setRotateAngle(Tentacle3a, 0.6441F, -0.8287F, -0.2838F);
        this.Tentacle3a.cubeList.add(new ModelBox(Tentacle3a, 58, 11, -1.0F, -1.0F, -4.0F, 2, 2, 4, 0.0F, false));

        this.Tentacle3b = new AdvancedModelRenderer(this);
        this.Tentacle3b.setRotationPoint(0.0F, 0.0F, -3.5F);
        this.Tentacle3a.addChild(Tentacle3b);
        this.setRotateAngle(Tentacle3b, -0.2618F, -0.5236F, 0.0F);
        this.Tentacle3b.cubeList.add(new ModelBox(Tentacle3b, 58, 65, -1.0F, -1.0F, -3.0F, 2, 2, 3, 0.0F, false));

        this.Tentacle3c = new AdvancedModelRenderer(this);
        this.Tentacle3c.setRotationPoint(0.0F, 0.0F, -2.5F);
        this.Tentacle3b.addChild(Tentacle3c);
        this.setRotateAngle(Tentacle3c, -0.3124F, -0.2079F, 0.0666F);
        this.Tentacle3c.cubeList.add(new ModelBox(Tentacle3c, 65, 48, -1.0F, -1.0F, -3.0F, 2, 2, 3, 0.0F, false));

        this.Tentacle4a = new AdvancedModelRenderer(this);
        this.Tentacle4a.setRotationPoint(2.5F, 1.0F, -5.0F);
        this.Mantle2.addChild(Tentacle4a);
        this.setRotateAngle(Tentacle4a, -0.0579F, -0.683F, 0.6792F);
        this.Tentacle4a.cubeList.add(new ModelBox(Tentacle4a, 52, 57, -1.0F, -1.0F, -4.0F, 2, 2, 4, 0.0F, false));
        this.Tentacle4a.cubeList.add(new ModelBox(Tentacle4a, 0, 27, 0.0F, -3.0F, -4.0F, 0, 2, 4, 0.0F, false));

        this.Tentacle4b = new AdvancedModelRenderer(this);
        this.Tentacle4b.setRotationPoint(0.0F, 0.0F, -3.5F);
        this.Tentacle4a.addChild(Tentacle4b);
        this.setRotateAngle(Tentacle4b, -0.1107F, 0.3736F, -0.1239F);
        this.Tentacle4b.cubeList.add(new ModelBox(Tentacle4b, 16, 65, -1.0F, -1.0F, -3.0F, 2, 2, 3, 0.0F, false));
        this.Tentacle4b.cubeList.add(new ModelBox(Tentacle4b, 0, 2, 0.0F, -3.0F, -3.0F, 0, 2, 3, 0.0F, false));

        this.Tentacle4c = new AdvancedModelRenderer(this);
        this.Tentacle4c.setRotationPoint(0.0F, 0.0F, -2.5F);
        this.Tentacle4b.addChild(Tentacle4c);
        this.setRotateAngle(Tentacle4c, -0.588F, 0.4478F, -0.281F);
        this.Tentacle4c.cubeList.add(new ModelBox(Tentacle4c, 64, 40, -1.0F, -1.0F, -3.0F, 2, 2, 3, 0.0F, false));
        this.Tentacle4c.cubeList.add(new ModelBox(Tentacle4c, 0, 0, 0.0F, -3.0F, -3.0F, 0, 2, 3, 0.0F, false));

        this.Tentacle5a = new AdvancedModelRenderer(this);
        this.Tentacle5a.setRotationPoint(1.0F, 1.0F, -5.0F);
        this.Mantle2.addChild(Tentacle5a);
        this.setRotateAngle(Tentacle5a, 0.3646F, -0.2865F, -0.1074F);
        this.Tentacle5a.cubeList.add(new ModelBox(Tentacle5a, 40, 57, -1.0F, -1.0F, -4.0F, 2, 2, 4, 0.0F, false));
        this.Tentacle5a.cubeList.add(new ModelBox(Tentacle5a, 28, 18, 0.0F, -3.0F, -4.0F, 0, 2, 4, 0.0F, false));

        this.Tentacle5b = new AdvancedModelRenderer(this);
        this.Tentacle5b.setRotationPoint(0.0F, 0.0F, -3.5F);
        this.Tentacle5a.addChild(Tentacle5b);
        this.setRotateAngle(Tentacle5b, -0.4363F, 0.3491F, 0.0F);
        this.Tentacle5b.cubeList.add(new ModelBox(Tentacle5b, 64, 35, -1.0F, -1.0F, -3.0F, 2, 2, 3, 0.0F, false));
        this.Tentacle5b.cubeList.add(new ModelBox(Tentacle5b, 0, 30, 0.0F, -3.0F, -3.0F, 0, 2, 3, 0.0F, false));

        this.Tentacle15c = new AdvancedModelRenderer(this);
        this.Tentacle15c.setRotationPoint(0.0F, 0.0F, -2.5F);
        this.Tentacle5b.addChild(Tentacle15c);
        this.setRotateAngle(Tentacle15c, -0.4498F, 0.2368F, -0.1128F);
        this.Tentacle15c.cubeList.add(new ModelBox(Tentacle15c, 64, 22, -1.0F, -1.0F, -3.0F, 2, 2, 3, 0.0F, false));
        this.Tentacle15c.cubeList.add(new ModelBox(Tentacle15c, 0, 17, 0.0F, -3.0F, -3.0F, 0, 2, 3, 0.0F, false));

        this.Tentacle6a = new AdvancedModelRenderer(this);
        this.Tentacle6a.setRotationPoint(-1.0F, 5.0F, -5.0F);
        this.Mantle2.addChild(Tentacle6a);
        this.setRotateAngle(Tentacle6a, 2.0445F, -0.0803F, 0.1551F);
        this.Tentacle6a.cubeList.add(new ModelBox(Tentacle6a, 0, 57, -1.0F, -1.0F, -4.0F, 2, 2, 4, 0.0F, false));

        this.Tentacle6b = new AdvancedModelRenderer(this);
        this.Tentacle6b.setRotationPoint(0.0F, 0.0F, -3.5F);
        this.Tentacle6a.addChild(Tentacle6b);
        this.setRotateAngle(Tentacle6b, 0.4851F, 0.4891F, 0.195F);
        this.Tentacle6b.cubeList.add(new ModelBox(Tentacle6b, 0, 64, -1.0F, -1.0F, -3.0F, 2, 2, 3, 0.0F, false));

        this.Tentacle6c = new AdvancedModelRenderer(this);
        this.Tentacle6c.setRotationPoint(0.0F, 0.0F, -2.5F);
        this.Tentacle6b.addChild(Tentacle6c);
        this.setRotateAngle(Tentacle6c, 0.2618F, 0.2618F, 0.0F);
        this.Tentacle6c.cubeList.add(new ModelBox(Tentacle6c, 51, 63, -1.0F, -1.0F, -3.0F, 2, 2, 3, 0.0F, false));

        this.Tentacle7a = new AdvancedModelRenderer(this);
        this.Tentacle7a.setRotationPoint(-2.5F, 5.0F, -5.0F);
        this.Mantle2.addChild(Tentacle7a);
        this.setRotateAngle(Tentacle7a, 1.8371F, -0.192F, 0.8117F);
        this.Tentacle7a.cubeList.add(new ModelBox(Tentacle7a, 56, 45, -1.0F, -1.0F, -4.0F, 2, 2, 4, 0.0F, false));

        this.Tentacle7b = new AdvancedModelRenderer(this);
        this.Tentacle7b.setRotationPoint(0.0F, 0.0F, -3.5F);
        this.Tentacle7a.addChild(Tentacle7b);
        this.setRotateAngle(Tentacle7b, 0.4051F, 0.2415F, 0.1022F);
        this.Tentacle7b.cubeList.add(new ModelBox(Tentacle7b, 41, 63, -1.0F, -1.0F, -3.0F, 2, 2, 3, 0.0F, false));

        this.Tentacle7c = new AdvancedModelRenderer(this);
        this.Tentacle7c.setRotationPoint(0.0F, 0.0F, -2.5F);
        this.Tentacle7b.addChild(Tentacle7c);
        this.setRotateAngle(Tentacle7c, 0.3491F, 0.4363F, 0.0F);
        this.Tentacle7c.cubeList.add(new ModelBox(Tentacle7c, 31, 62, -1.0F, -1.0F, -3.0F, 2, 2, 3, 0.0F, false));

        this.Tentacle8a = new AdvancedModelRenderer(this);
        this.Tentacle8a.setRotationPoint(-2.5F, 3.0F, -5.0F);
        this.Mantle2.addChild(Tentacle8a);
        this.setRotateAngle(Tentacle8a, 0.6441F, 0.8287F, 0.2838F);
        this.Tentacle8a.cubeList.add(new ModelBox(Tentacle8a, 14, 56, -1.0F, -1.0F, -4.0F, 2, 2, 4, 0.0F, false));

        this.Tentacle8b = new AdvancedModelRenderer(this);
        this.Tentacle8b.setRotationPoint(0.0F, 0.0F, -3.5F);
        this.Tentacle8a.addChild(Tentacle8b);
        this.setRotateAngle(Tentacle8b, -0.2618F, 0.5236F, 0.0F);
        this.Tentacle8b.cubeList.add(new ModelBox(Tentacle8b, 9, 62, -1.0F, -1.0F, -3.0F, 2, 2, 3, 0.0F, false));

        this.Tentacle8c = new AdvancedModelRenderer(this);
        this.Tentacle8c.setRotationPoint(0.0F, 0.0F, -2.5F);
        this.Tentacle8b.addChild(Tentacle8c);
        this.setRotateAngle(Tentacle8c, -0.3124F, 0.2079F, -0.0666F);
        this.Tentacle8c.cubeList.add(new ModelBox(Tentacle8c, 61, 60, -1.0F, -1.0F, -3.0F, 2, 2, 3, 0.0F, false));

        this.Tentacle9a = new AdvancedModelRenderer(this);
        this.Tentacle9a.setRotationPoint(-2.5F, 1.0F, -5.0F);
        this.Mantle2.addChild(Tentacle9a);
        this.setRotateAngle(Tentacle9a, -0.0579F, 0.683F, -0.6792F);
        this.Tentacle9a.cubeList.add(new ModelBox(Tentacle9a, 32, 55, -1.0F, -1.0F, -4.0F, 2, 2, 4, 0.0F, false));
        this.Tentacle9a.cubeList.add(new ModelBox(Tentacle9a, 8, 27, 0.0F, -3.0F, -4.0F, 0, 2, 4, 0.0F, false));

        this.Tentacle9b = new AdvancedModelRenderer(this);
        this.Tentacle9b.setRotationPoint(0.0F, 0.0F, -3.5F);
        this.Tentacle9a.addChild(Tentacle9b);
        this.setRotateAngle(Tentacle9b, -0.1107F, -0.3736F, 0.1239F);
        this.Tentacle9b.cubeList.add(new ModelBox(Tentacle9b, 61, 0, -1.0F, -1.0F, -3.0F, 2, 2, 3, 0.0F, false));
        this.Tentacle9b.cubeList.add(new ModelBox(Tentacle9b, 0, 15, 0.0F, -3.0F, -3.0F, 0, 2, 3, 0.0F, false));

        this.Tentacle9c = new AdvancedModelRenderer(this);
        this.Tentacle9c.setRotationPoint(0.0F, 0.0F, -2.5F);
        this.Tentacle9b.addChild(Tentacle9c);
        this.setRotateAngle(Tentacle9c, -0.588F, -0.4478F, 0.281F);
        this.Tentacle9c.cubeList.add(new ModelBox(Tentacle9c, 58, 17, -1.0F, -1.0F, -3.0F, 2, 2, 3, 0.0F, false));
        this.Tentacle9c.cubeList.add(new ModelBox(Tentacle9c, 0, 13, 0.0F, -3.0F, -3.0F, 0, 2, 3, 0.0F, false));

        this.Tentacle10a = new AdvancedModelRenderer(this);
        this.Tentacle10a.setRotationPoint(-1.0F, 1.0F, -5.0F);
        this.Mantle2.addChild(Tentacle10a);
        this.setRotateAngle(Tentacle10a, 0.3646F, 0.2865F, 0.1074F);
        this.Tentacle10a.cubeList.add(new ModelBox(Tentacle10a, 24, 53, -1.0F, -1.0F, -4.0F, 2, 2, 4, 0.0F, false));
        this.Tentacle10a.cubeList.add(new ModelBox(Tentacle10a, 42, 10, 0.0F, -3.0F, -4.0F, 0, 2, 4, 0.0F, false));

        this.Tentacle10b = new AdvancedModelRenderer(this);
        this.Tentacle10b.setRotationPoint(0.0F, 0.0F, -3.5F);
        this.Tentacle10a.addChild(Tentacle10b);
        this.setRotateAngle(Tentacle10b, -0.4363F, -0.3491F, 0.0F);
        this.Tentacle10b.cubeList.add(new ModelBox(Tentacle10b, 49, 29, -1.0F, -1.0F, -3.0F, 2, 2, 3, 0.0F, false));
        this.Tentacle10b.cubeList.add(new ModelBox(Tentacle10b, 0, 34, 0.0F, -3.0F, -3.0F, 0, 2, 3, 0.0F, false));

        this.Tentacle10c = new AdvancedModelRenderer(this);
        this.Tentacle10c.setRotationPoint(0.0F, 0.0F, -2.5F);
        this.Tentacle10b.addChild(Tentacle10c);
        this.setRotateAngle(Tentacle10c, -0.4498F, -0.2368F, 0.1128F);
        this.Tentacle10c.cubeList.add(new ModelBox(Tentacle10c, 35, 0, -1.0F, -1.0F, -3.0F, 2, 2, 3, 0.0F, false));
        this.Tentacle10c.cubeList.add(new ModelBox(Tentacle10c, 0, 32, 0.0F, -3.0F, -3.0F, 0, 2, 3, 0.0F, false));

        updateDefaultPose();
    }

    public void renderAll(float f) {
        this.resetToDefaultPose();
        this.Shell1.offsetY = 0.7F;
        this.Shell1.render(0.08f);
    }

    public void setRotateAngle(ModelRenderer modelRenderer, float x, float y, float z) {
        modelRenderer.rotateAngleX = x;
        modelRenderer.rotateAngleY = y;
        modelRenderer.rotateAngleZ = z;
    }

}
