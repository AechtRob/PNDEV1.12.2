package net.lepidodendron.entity.model.tile;

import net.ilexiconn.llibrary.client.model.tools.AdvancedModelRenderer;
import net.lepidodendron.entity.model.llibraryextensions.AdvancedModelBaseExtended;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;

public class ModelGoniatitesShell extends AdvancedModelBaseExtended {
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
    private final AdvancedModelRenderer cube_r1;
    private final AdvancedModelRenderer cube_r2;
    private final AdvancedModelRenderer Siphon;
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

    public ModelGoniatitesShell() {
        this.textureWidth = 78;
        this.textureHeight = 78;

        this.Root = new AdvancedModelRenderer(this);
        this.Root.setRotationPoint(0.0F, 24.0F, 0.0F);
        this.setRotateAngle(Root, 0.48F, 0.0F, 0.0F);


        this.Shell1 = new AdvancedModelRenderer(this);
        this.Shell1.setRotationPoint(0.0F, -7.4F, -7.275F);
        this.Root.addChild(Shell1);
        this.setRotateAngle(Shell1, -0.9163F, 0.0F, 0.0F);
        this.Shell1.cubeList.add(new ModelBox(Shell1, 23, 23, -4.0F, -8.0F, 0.0F, 8, 8, 7, 0.04F, false));

        this.Shell2 = new AdvancedModelRenderer(this);
        this.Shell2.setRotationPoint(0.0F, 0.0F, 7.0F);
        this.Shell1.addChild(Shell2);
        this.setRotateAngle(Shell2, 0.8727F, 0.0F, 0.0F);
        this.Shell2.cubeList.add(new ModelBox(Shell2, 0, 15, -4.0F, -8.0F, 0.0F, 8, 8, 7, 0.01F, false));

        this.Shell3 = new AdvancedModelRenderer(this);
        this.Shell3.setRotationPoint(0.0F, 0.0F, 7.0F);
        this.Shell2.addChild(Shell3);
        this.setRotateAngle(Shell3, 0.6545F, 0.0F, 0.0F);
        this.Shell3.cubeList.add(new ModelBox(Shell3, 0, 0, -4.0F, -8.0F, 0.0F, 8, 8, 7, 0.0F, false));
        this.Shell3.cubeList.add(new ModelBox(Shell3, 37, 0, -2.0F, -11.0F, 2.0F, 4, 3, 3, 0.0F, false));

        this.Shell4 = new AdvancedModelRenderer(this);
        this.Shell4.setRotationPoint(0.0F, 0.0F, 7.0F);
        this.Shell3.addChild(Shell4);
        this.setRotateAngle(Shell4, 0.7854F, 0.0F, 0.0F);
        this.Shell4.cubeList.add(new ModelBox(Shell4, 23, 8, -4.0F, -7.0F, 0.0F, 8, 7, 7, -0.01F, false));

        this.Shell5 = new AdvancedModelRenderer(this);
        this.Shell5.setRotationPoint(0.0F, 0.0F, 7.0F);
        this.Shell4.addChild(Shell5);
        this.setRotateAngle(Shell5, 0.7854F, 0.0F, 0.0F);
        this.Shell5.cubeList.add(new ModelBox(Shell5, 0, 31, -3.5F, -7.0F, 0.0F, 7, 7, 7, 0.04F, false));

        this.Shell6 = new AdvancedModelRenderer(this);
        this.Shell6.setRotationPoint(0.0F, 0.0F, 7.0F);
        this.Shell5.addChild(Shell6);
        this.setRotateAngle(Shell6, 0.829F, 0.0F, 0.0F);
        this.Shell6.cubeList.add(new ModelBox(Shell6, 46, 0, -3.5F, -6.0F, 0.0F, 7, 6, 6, 0.01F, false));

        this.Shell7 = new AdvancedModelRenderer(this);
        this.Shell7.setRotationPoint(0.0F, 0.0F, 6.0F);
        this.Shell6.addChild(Shell7);
        this.setRotateAngle(Shell7, 0.6981F, 0.0F, 0.0F);
        this.Shell7.cubeList.add(new ModelBox(Shell7, 0, 45, -3.5F, -6.0F, 0.0F, 7, 6, 6, 0.0F, false));

        this.Shell8 = new AdvancedModelRenderer(this);
        this.Shell8.setRotationPoint(0.0F, 0.0F, 6.0F);
        this.Shell7.addChild(Shell8);
        this.setRotateAngle(Shell8, 0.7418F, 0.0F, 0.0F);
        this.Shell8.cubeList.add(new ModelBox(Shell8, 48, 33, -3.0F, -6.0F, 0.0F, 6, 6, 5, 0.01F, false));

        this.Shell9 = new AdvancedModelRenderer(this);
        this.Shell9.setRotationPoint(0.0F, 0.0F, 5.0F);
        this.Shell8.addChild(Shell9);
        this.setRotateAngle(Shell9, 0.7418F, 0.0F, 0.0F);
        this.Shell9.cubeList.add(new ModelBox(Shell9, 49, 45, -3.0F, -5.0F, 0.0F, 6, 5, 5, 0.0F, false));

        this.Mantle1 = new AdvancedModelRenderer(this);
        this.Mantle1.setRotationPoint(0.0F, -10.625F, -1.65F);
        this.Root.addChild(Mantle1);
        this.setRotateAngle(Mantle1, -0.4363F, 0.0F, 0.0F);
        this.Mantle1.cubeList.add(new ModelBox(Mantle1, 28, 38, -3.5F, -0.8528F, -6.6383F, 7, 6, 6, -0.01F, false));

        this.cube_r1 = new AdvancedModelRenderer(this);
        this.cube_r1.setRotationPoint(4.0F, 1.6472F, -5.1383F);
        this.Mantle1.addChild(cube_r1);
        this.setRotateAngle(cube_r1, 0.0F, 0.1745F, 0.0F);
        this.cube_r1.cubeList.add(new ModelBox(cube_r1, 20, 45, -1.1F, -1.5F, -1.5F, 1, 3, 3, -0.01F, false));
        this.cube_r1.cubeList.add(new ModelBox(cube_r1, 0, 0, -1.0F, -1.0F, -1.0F, 1, 2, 2, -0.01F, false));

        this.cube_r2 = new AdvancedModelRenderer(this);
        this.cube_r2.setRotationPoint(-4.0F, 1.6472F, -5.1383F);
        this.Mantle1.addChild(cube_r2);
        this.setRotateAngle(cube_r2, 0.0F, -0.1745F, 0.0F);
        this.cube_r2.cubeList.add(new ModelBox(cube_r2, 0, 15, 0.0F, -1.0F, -1.0F, 1, 2, 2, -0.01F, false));
        this.cube_r2.cubeList.add(new ModelBox(cube_r2, 68, 67, 0.1F, -1.5F, -1.5F, 1, 3, 3, -0.01F, false));

        this.Siphon = new AdvancedModelRenderer(this);
        this.Siphon.setRotationPoint(0.5F, 5.5972F, -4.5133F);
        this.Mantle1.addChild(Siphon);
        this.setRotateAngle(Siphon, 0.3054F, 0.0F, 0.0F);
        this.Siphon.cubeList.add(new ModelBox(Siphon, 23, 0, -2.0F, -2.0F, -3.0F, 3, 2, 4, -0.01F, false));

        this.Mantle2 = new AdvancedModelRenderer(this);
        this.Mantle2.setRotationPoint(0.0F, -0.8528F, -6.6383F);
        this.Mantle1.addChild(Mantle2);
        this.setRotateAngle(Mantle2, 0.6109F, 0.0F, 0.0F);
        this.Mantle2.cubeList.add(new ModelBox(Mantle2, 48, 17, -3.5F, 0.0F, -5.0F, 7, 6, 5, 0.0F, false));

        this.Tentacle1a = new AdvancedModelRenderer(this);
        this.Tentacle1a.setRotationPoint(1.0F, 5.0F, -5.0F);
        this.Mantle2.addChild(Tentacle1a);
        this.setRotateAngle(Tentacle1a, 2.0445F, 0.0803F, -0.1551F);
        this.Tentacle1a.cubeList.add(new ModelBox(Tentacle1a, 20, 62, -1.0F, -1.0F, -4.0F, 2, 2, 4, 0.0F, false));

        this.Tentacle1b = new AdvancedModelRenderer(this);
        this.Tentacle1b.setRotationPoint(0.0F, 0.0F, -3.5F);
        this.Tentacle1a.addChild(Tentacle1b);
        this.setRotateAngle(Tentacle1b, 0.4851F, -0.4891F, -0.195F);
        this.Tentacle1b.cubeList.add(new ModelBox(Tentacle1b, 49, 68, -1.0F, -1.0F, -3.0F, 2, 2, 3, 0.0F, false));

        this.Tentacle1c = new AdvancedModelRenderer(this);
        this.Tentacle1c.setRotationPoint(0.0F, 0.0F, -2.5F);
        this.Tentacle1b.addChild(Tentacle1c);
        this.setRotateAngle(Tentacle1c, 0.2618F, -0.2618F, 0.0F);
        this.Tentacle1c.cubeList.add(new ModelBox(Tentacle1c, 27, 68, -1.0F, -1.0F, -3.0F, 2, 2, 3, 0.0F, false));

        this.Tentacle2a = new AdvancedModelRenderer(this);
        this.Tentacle2a.setRotationPoint(2.5F, 5.0F, -5.0F);
        this.Mantle2.addChild(Tentacle2a);
        this.setRotateAngle(Tentacle2a, 1.8371F, 0.192F, -0.8117F);
        this.Tentacle2a.cubeList.add(new ModelBox(Tentacle2a, 42, 61, -1.0F, -1.0F, -4.0F, 2, 2, 4, 0.0F, false));

        this.Tentacle2b = new AdvancedModelRenderer(this);
        this.Tentacle2b.setRotationPoint(0.0F, 0.0F, -3.5F);
        this.Tentacle2a.addChild(Tentacle2b);
        this.setRotateAngle(Tentacle2b, 0.4051F, -0.2415F, -0.1022F);
        this.Tentacle2b.cubeList.add(new ModelBox(Tentacle2b, 17, 68, -1.0F, -1.0F, -3.0F, 2, 2, 3, 0.0F, false));

        this.Tentacle2c = new AdvancedModelRenderer(this);
        this.Tentacle2c.setRotationPoint(0.0F, 0.0F, -2.5F);
        this.Tentacle2b.addChild(Tentacle2c);
        this.setRotateAngle(Tentacle2c, 0.3491F, -0.4363F, 0.0F);
        this.Tentacle2c.cubeList.add(new ModelBox(Tentacle2c, 0, 68, -1.0F, -1.0F, -3.0F, 2, 2, 3, 0.0F, false));

        this.Tentacle3a = new AdvancedModelRenderer(this);
        this.Tentacle3a.setRotationPoint(2.5F, 3.0F, -5.0F);
        this.Mantle2.addChild(Tentacle3a);
        this.setRotateAngle(Tentacle3a, 0.6441F, -0.8287F, -0.2838F);
        this.Tentacle3a.cubeList.add(new ModelBox(Tentacle3a, 12, 58, -1.0F, -1.0F, -4.0F, 2, 2, 4, 0.0F, false));

        this.Tentacle3b = new AdvancedModelRenderer(this);
        this.Tentacle3b.setRotationPoint(0.0F, 0.0F, -3.5F);
        this.Tentacle3a.addChild(Tentacle3b);
        this.setRotateAngle(Tentacle3b, -0.2618F, -0.5236F, 0.0F);
        this.Tentacle3b.cubeList.add(new ModelBox(Tentacle3b, 39, 67, -1.0F, -1.0F, -3.0F, 2, 2, 3, 0.0F, false));

        this.Tentacle3c = new AdvancedModelRenderer(this);
        this.Tentacle3c.setRotationPoint(0.0F, 0.0F, -2.5F);
        this.Tentacle3b.addChild(Tentacle3c);
        this.setRotateAngle(Tentacle3c, -0.3124F, -0.2079F, 0.0666F);
        this.Tentacle3c.cubeList.add(new ModelBox(Tentacle3c, 67, 17, -1.0F, -1.0F, -3.0F, 2, 2, 3, 0.0F, false));

        this.Tentacle4a = new AdvancedModelRenderer(this);
        this.Tentacle4a.setRotationPoint(2.5F, 1.0F, -5.0F);
        this.Mantle2.addChild(Tentacle4a);
        this.setRotateAngle(Tentacle4a, -0.0579F, -0.683F, 0.6792F);
        this.Tentacle4a.cubeList.add(new ModelBox(Tentacle4a, 54, 57, -1.0F, -1.0F, -4.0F, 2, 2, 4, 0.0F, false));

        this.Tentacle4b = new AdvancedModelRenderer(this);
        this.Tentacle4b.setRotationPoint(0.0F, 0.0F, -3.5F);
        this.Tentacle4a.addChild(Tentacle4b);
        this.setRotateAngle(Tentacle4b, -0.1107F, 0.3736F, -0.1239F);
        this.Tentacle4b.cubeList.add(new ModelBox(Tentacle4b, 66, 44, -1.0F, -1.0F, -3.0F, 2, 2, 3, 0.0F, false));

        this.Tentacle4c = new AdvancedModelRenderer(this);
        this.Tentacle4c.setRotationPoint(0.0F, 0.0F, -2.5F);
        this.Tentacle4b.addChild(Tentacle4c);
        this.setRotateAngle(Tentacle4c, -0.588F, 0.4478F, -0.281F);
        this.Tentacle4c.cubeList.add(new ModelBox(Tentacle4c, 66, 0, -1.0F, -1.0F, -3.0F, 2, 2, 3, 0.0F, false));

        this.Tentacle5a = new AdvancedModelRenderer(this);
        this.Tentacle5a.setRotationPoint(1.0F, 1.0F, -5.0F);
        this.Mantle2.addChild(Tentacle5a);
        this.setRotateAngle(Tentacle5a, 0.3646F, -0.2865F, -0.1074F);
        this.Tentacle5a.cubeList.add(new ModelBox(Tentacle5a, 34, 57, -1.0F, -1.0F, -4.0F, 2, 2, 4, 0.0F, false));

        this.Tentacle5b = new AdvancedModelRenderer(this);
        this.Tentacle5b.setRotationPoint(0.0F, 0.0F, -3.5F);
        this.Tentacle5a.addChild(Tentacle5b);
        this.setRotateAngle(Tentacle5b, -0.4363F, 0.3491F, 0.0F);
        this.Tentacle5b.cubeList.add(new ModelBox(Tentacle5b, 61, 65, -1.0F, -1.0F, -3.0F, 2, 2, 3, -0.003F, false));

        this.Tentacle15c = new AdvancedModelRenderer(this);
        this.Tentacle15c.setRotationPoint(0.0F, 0.0F, -2.5F);
        this.Tentacle5b.addChild(Tentacle15c);
        this.setRotateAngle(Tentacle15c, -0.4498F, 0.2368F, -0.1128F);
        this.Tentacle15c.cubeList.add(new ModelBox(Tentacle15c, 65, 33, -1.0F, -1.0F, -3.0F, 2, 2, 3, 0.0F, false));

        this.Tentacle6a = new AdvancedModelRenderer(this);
        this.Tentacle6a.setRotationPoint(-1.0F, 5.0F, -5.0F);
        this.Mantle2.addChild(Tentacle6a);
        this.setRotateAngle(Tentacle6a, 2.0445F, -0.0803F, 0.1551F);
        this.Tentacle6a.cubeList.add(new ModelBox(Tentacle6a, 0, 57, -1.0F, -1.0F, -4.0F, 2, 2, 4, 0.0F, false));

        this.Tentacle6b = new AdvancedModelRenderer(this);
        this.Tentacle6b.setRotationPoint(0.0F, 0.0F, -3.5F);
        this.Tentacle6a.addChild(Tentacle6b);
        this.setRotateAngle(Tentacle6b, 0.4851F, 0.4891F, 0.195F);
        this.Tentacle6b.cubeList.add(new ModelBox(Tentacle6b, 10, 64, -1.0F, -1.0F, -3.0F, 2, 2, 3, 0.0F, false));

        this.Tentacle6c = new AdvancedModelRenderer(this);
        this.Tentacle6c.setRotationPoint(0.0F, 0.0F, -2.5F);
        this.Tentacle6b.addChild(Tentacle6c);
        this.setRotateAngle(Tentacle6c, 0.2618F, 0.2618F, 0.0F);
        this.Tentacle6c.cubeList.add(new ModelBox(Tentacle6c, 63, 60, -1.0F, -1.0F, -3.0F, 2, 2, 3, 0.0F, false));

        this.Tentacle7a = new AdvancedModelRenderer(this);
        this.Tentacle7a.setRotationPoint(-2.5F, 5.0F, -5.0F);
        this.Mantle2.addChild(Tentacle7a);
        this.setRotateAngle(Tentacle7a, 1.8371F, -0.192F, 0.8117F);
        this.Tentacle7a.cubeList.add(new ModelBox(Tentacle7a, 22, 56, -1.0F, -1.0F, -4.0F, 2, 2, 4, 0.0F, false));

        this.Tentacle7b = new AdvancedModelRenderer(this);
        this.Tentacle7b.setRotationPoint(0.0F, 0.0F, -3.5F);
        this.Tentacle7a.addChild(Tentacle7b);
        this.setRotateAngle(Tentacle7b, 0.4051F, 0.2415F, 0.1022F);
        this.Tentacle7b.cubeList.add(new ModelBox(Tentacle7b, 54, 63, -1.0F, -1.0F, -3.0F, 2, 2, 3, 0.0F, false));

        this.Tentacle7c = new AdvancedModelRenderer(this);
        this.Tentacle7c.setRotationPoint(0.0F, 0.0F, -2.5F);
        this.Tentacle7b.addChild(Tentacle7c);
        this.setRotateAngle(Tentacle7c, 0.3491F, 0.4363F, 0.0F);
        this.Tentacle7c.cubeList.add(new ModelBox(Tentacle7c, 32, 63, -1.0F, -1.0F, -3.0F, 2, 2, 3, 0.0F, false));

        this.Tentacle8a = new AdvancedModelRenderer(this);
        this.Tentacle8a.setRotationPoint(-2.5F, 3.0F, -5.0F);
        this.Mantle2.addChild(Tentacle8a);
        this.setRotateAngle(Tentacle8a, 0.6441F, 0.8287F, 0.2838F);
        this.Tentacle8a.cubeList.add(new ModelBox(Tentacle8a, 46, 55, -1.0F, -1.0F, -4.0F, 2, 2, 4, 0.0F, false));

        this.Tentacle8b = new AdvancedModelRenderer(this);
        this.Tentacle8b.setRotationPoint(0.0F, 0.0F, -3.5F);
        this.Tentacle8a.addChild(Tentacle8b);
        this.setRotateAngle(Tentacle8b, -0.2618F, 0.5236F, 0.0F);
        this.Tentacle8b.cubeList.add(new ModelBox(Tentacle8b, 63, 28, -1.0F, -1.0F, -3.0F, 2, 2, 3, 0.0F, false));

        this.Tentacle8c = new AdvancedModelRenderer(this);
        this.Tentacle8c.setRotationPoint(0.0F, 0.0F, -2.5F);
        this.Tentacle8b.addChild(Tentacle8c);
        this.setRotateAngle(Tentacle8c, -0.3124F, 0.2079F, -0.0666F);
        this.Tentacle8c.cubeList.add(new ModelBox(Tentacle8c, 63, 12, -1.0F, -1.0F, -3.0F, 2, 2, 3, 0.0F, false));

        this.Tentacle9a = new AdvancedModelRenderer(this);
        this.Tentacle9a.setRotationPoint(-2.5F, 1.0F, -5.0F);
        this.Mantle2.addChild(Tentacle9a);
        this.setRotateAngle(Tentacle9a, -0.0579F, 0.683F, -0.6792F);
        this.Tentacle9a.cubeList.add(new ModelBox(Tentacle9a, 38, 51, -1.0F, -1.0F, -4.0F, 2, 2, 4, 0.0F, false));

        this.Tentacle9b = new AdvancedModelRenderer(this);
        this.Tentacle9b.setRotationPoint(0.0F, 0.0F, -3.5F);
        this.Tentacle9a.addChild(Tentacle9b);
        this.setRotateAngle(Tentacle9b, -0.1107F, -0.3736F, 0.1239F);
        this.Tentacle9b.cubeList.add(new ModelBox(Tentacle9b, 0, 63, -1.0F, -1.0F, -3.0F, 2, 2, 3, 0.0F, false));

        this.Tentacle9c = new AdvancedModelRenderer(this);
        this.Tentacle9c.setRotationPoint(0.0F, 0.0F, -2.5F);
        this.Tentacle9b.addChild(Tentacle9c);
        this.setRotateAngle(Tentacle9c, -0.588F, -0.4478F, 0.281F);
        this.Tentacle9c.cubeList.add(new ModelBox(Tentacle9c, 62, 55, -1.0F, -1.0F, -3.0F, 2, 2, 3, 0.0F, false));

        this.Tentacle10a = new AdvancedModelRenderer(this);
        this.Tentacle10a.setRotationPoint(-1.0F, 1.0F, -5.0F);
        this.Mantle2.addChild(Tentacle10a);
        this.setRotateAngle(Tentacle10a, 0.3646F, 0.2865F, 0.1074F);
        this.Tentacle10a.cubeList.add(new ModelBox(Tentacle10a, 26, 50, -1.0F, -1.0F, -4.0F, 2, 2, 4, 0.0F, false));

        this.Tentacle10b = new AdvancedModelRenderer(this);
        this.Tentacle10b.setRotationPoint(0.0F, 0.0F, -3.5F);
        this.Tentacle10a.addChild(Tentacle10b);
        this.setRotateAngle(Tentacle10b, -0.4363F, -0.3491F, 0.0F);
        this.Tentacle10b.cubeList.add(new ModelBox(Tentacle10b, 53, 28, -1.0F, -1.0F, -3.0F, 2, 2, 3, -0.003F, false));

        this.Tentacle10c = new AdvancedModelRenderer(this);
        this.Tentacle10c.setRotationPoint(0.0F, 0.0F, -2.5F);
        this.Tentacle10b.addChild(Tentacle10c);
        this.setRotateAngle(Tentacle10c, -0.4498F, -0.2368F, 0.1128F);
        this.Tentacle10c.cubeList.add(new ModelBox(Tentacle10c, 53, 12, -1.0F, -1.0F, -3.0F, 2, 2, 3, 0.0F, false));
        updateDefaultPose();
    }

    public void renderAll(float f) {
        this.resetToDefaultPose();
        this.Root.offsetY = -1.5F;
        this.Root.render(0.08f);
    }

    public void setRotateAngle(ModelRenderer modelRenderer, float x, float y, float z) {
        modelRenderer.rotateAngleX = x;
        modelRenderer.rotateAngleY = y;
        modelRenderer.rotateAngleZ = z;
    }

}
