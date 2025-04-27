package net.lepidodendron.entity.model.tile;

import net.ilexiconn.llibrary.client.model.tools.AdvancedModelRenderer;
import net.lepidodendron.entity.model.llibraryextensions.AdvancedModelBaseExtended;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;

public class ModelPerisphinctesShell extends AdvancedModelBaseExtended {
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
    private final AdvancedModelRenderer Shell10;
    private final AdvancedModelRenderer Shell11;
    private final AdvancedModelRenderer cube_r1;
    private final AdvancedModelRenderer Mantle1;
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
    private final AdvancedModelRenderer Tentacle5c;
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
    private final AdvancedModelRenderer Siphon;

    public ModelPerisphinctesShell() {
        this.textureWidth = 90;
        this.textureHeight = 90;

        this.Root = new AdvancedModelRenderer(this);
        this.Root.setRotationPoint(0.0F, 24.0F, 0.0F);
        this.setRotateAngle(Root, 0.0F, 3.1416F, 0.0F);


        this.Shell1 = new AdvancedModelRenderer(this);
        this.Shell1.setRotationPoint(0.0F, -6.0F, -8.0F);
        this.Root.addChild(Shell1);
        this.setRotateAngle(Shell1, -0.829F, 0.0F, 0.0F);
        this.Shell1.cubeList.add(new ModelBox(Shell1, 0, 31, -4.0F, -7.0F, 0.0F, 8, 7, 7, 0.01F, false));

        this.Shell2 = new AdvancedModelRenderer(this);
        this.Shell2.setRotationPoint(0.0F, 0.0F, 7.0F);
        this.Shell1.addChild(Shell2);
        this.setRotateAngle(Shell2, 0.7418F, 0.0F, 0.0F);
        this.Shell2.cubeList.add(new ModelBox(Shell2, 0, 0, -4.0F, -7.0F, 0.0F, 8, 7, 9, 0.0F, false));

        this.Shell3 = new AdvancedModelRenderer(this);
        this.Shell3.setRotationPoint(0.0F, 0.0F, 9.0F);
        this.Shell2.addChild(Shell3);
        this.setRotateAngle(Shell3, 0.7418F, 0.0F, 0.0F);
        this.Shell3.cubeList.add(new ModelBox(Shell3, 23, 22, -3.5F, -6.0F, 0.0F, 7, 6, 9, 0.01F, false));

        this.Shell4 = new AdvancedModelRenderer(this);
        this.Shell4.setRotationPoint(0.0F, 0.0F, 9.0F);
        this.Shell3.addChild(Shell4);
        this.setRotateAngle(Shell4, 0.7854F, 0.0F, 0.0F);
        this.Shell4.cubeList.add(new ModelBox(Shell4, 0, 16, -3.5F, -6.0F, 0.0F, 7, 6, 9, 0.0F, false));

        this.Shell5 = new AdvancedModelRenderer(this);
        this.Shell5.setRotationPoint(0.0F, 0.0F, 9.0F);
        this.Shell4.addChild(Shell5);
        this.setRotateAngle(Shell5, 0.829F, 0.0F, 0.0F);
        this.Shell5.cubeList.add(new ModelBox(Shell5, 26, 8, -3.0F, -5.0F, 0.0F, 6, 5, 8, 0.0F, false));

        this.Shell6 = new AdvancedModelRenderer(this);
        this.Shell6.setRotationPoint(0.0F, 0.0F, 8.0F);
        this.Shell5.addChild(Shell6);
        this.setRotateAngle(Shell6, 0.7854F, 0.0F, 0.0F);
        this.Shell6.cubeList.add(new ModelBox(Shell6, 22, 37, -2.5F, -4.0F, 0.0F, 5, 4, 8, 0.01F, false));

        this.Shell7 = new AdvancedModelRenderer(this);
        this.Shell7.setRotationPoint(0.0F, 0.0F, 8.0F);
        this.Shell6.addChild(Shell7);
        this.setRotateAngle(Shell7, 0.8727F, 0.0F, 0.0F);
        this.Shell7.cubeList.add(new ModelBox(Shell7, 46, 0, -2.5F, -4.0F, 0.0F, 5, 4, 7, 0.0F, false));

        this.Shell8 = new AdvancedModelRenderer(this);
        this.Shell8.setRotationPoint(0.0F, 0.0F, 7.0F);
        this.Shell7.addChild(Shell8);
        this.setRotateAngle(Shell8, 0.829F, 0.0F, 0.0F);
        this.Shell8.cubeList.add(new ModelBox(Shell8, 0, 45, -2.5F, -4.0F, 0.0F, 5, 4, 7, -0.01F, false));

        this.Shell9 = new AdvancedModelRenderer(this);
        this.Shell9.setRotationPoint(0.0F, 0.0F, 7.0F);
        this.Shell8.addChild(Shell9);
        this.setRotateAngle(Shell9, 0.9163F, 0.0F, 0.0F);
        this.Shell9.cubeList.add(new ModelBox(Shell9, 18, 50, -2.0F, -4.0F, 0.0F, 4, 4, 6, 0.01F, false));
        this.Shell9.cubeList.add(new ModelBox(Shell9, 41, 42, -1.5F, -12.0F, 0.0F, 3, 8, 7, 0.0F, false));

        this.Shell10 = new AdvancedModelRenderer(this);
        this.Shell10.setRotationPoint(0.0F, 0.0F, 6.0F);
        this.Shell9.addChild(Shell10);
        this.setRotateAngle(Shell10, 0.6981F, 0.0F, 0.0F);
        this.Shell10.cubeList.add(new ModelBox(Shell10, 54, 11, -2.0F, -4.0F, 0.0F, 4, 4, 5, 0.0F, false));

        this.Shell11 = new AdvancedModelRenderer(this);
        this.Shell11.setRotationPoint(0.0F, 0.0F, 5.0F);
        this.Shell10.addChild(Shell11);
        this.setRotateAngle(Shell11, 0.7854F, 0.0F, 0.0F);


        this.cube_r1 = new AdvancedModelRenderer(this);
        this.cube_r1.setRotationPoint(0.0F, 0.0F, 1.0F);
        this.Shell11.addChild(cube_r1);
        this.setRotateAngle(cube_r1, -0.0305F, 0.0F, 0.0F);
        this.cube_r1.cubeList.add(new ModelBox(cube_r1, 48, 30, -2.0F, -4.0F, -1.0F, 4, 4, 7, -0.01F, false));

        this.Mantle1 = new AdvancedModelRenderer(this);
        this.Mantle1.setRotationPoint(0.0F, -9.9F, -3.775F);
        this.Root.addChild(Mantle1);
        this.setRotateAngle(Mantle1, -0.6981F, 0.0F, 0.0F);
        this.Mantle1.cubeList.add(new ModelBox(Mantle1, 25, 0, -3.5F, 0.0F, -2.0F, 7, 5, 2, -0.01F, false));

        this.Mantle2 = new AdvancedModelRenderer(this);
        this.Mantle2.setRotationPoint(0.0F, 0.0F, -2.0F);
        this.Mantle1.addChild(Mantle2);
        this.setRotateAngle(Mantle2, 0.7069F, 0.0F, 0.0F);
        this.Mantle2.cubeList.add(new ModelBox(Mantle2, 46, 21, -3.5F, 0.0F, -5.0F, 7, 4, 5, 0.0F, false));
        this.Mantle2.cubeList.add(new ModelBox(Mantle2, 67, 12, -3.5F, 0.5F, -1.5F, 7, 1, 1, 0.01F, false));

        this.Tentacle1a = new AdvancedModelRenderer(this);
        this.Tentacle1a.setRotationPoint(0.75F, 3.25F, -4.5F);
        this.Mantle2.addChild(Tentacle1a);
        this.setRotateAngle(Tentacle1a, -0.1309F, 0.026F, -0.0034F);
        this.Tentacle1a.cubeList.add(new ModelBox(Tentacle1a, 16, 60, -0.5F, -0.5F, -6.0F, 1, 1, 6, 0.0F, false));

        this.Tentacle1b = new AdvancedModelRenderer(this);
        this.Tentacle1b.setRotationPoint(0.0F, 0.0F, -5.5F);
        this.Tentacle1a.addChild(Tentacle1b);
        this.setRotateAngle(Tentacle1b, 0.0393F, -0.0131F, -0.0005F);
        this.Tentacle1b.cubeList.add(new ModelBox(Tentacle1b, 0, 69, -0.5F, -0.5F, -5.0F, 1, 1, 5, 0.0F, false));

        this.Tentacle1c = new AdvancedModelRenderer(this);
        this.Tentacle1c.setRotationPoint(0.0F, 0.0F, -4.5F);
        this.Tentacle1b.addChild(Tentacle1c);
        this.setRotateAngle(Tentacle1c, 0.0873F, -0.0261F, -0.0018F);
        this.Tentacle1c.cubeList.add(new ModelBox(Tentacle1c, 21, 68, -0.5F, -0.5F, -5.0F, 1, 1, 5, 0.0F, false));

        this.Tentacle2a = new AdvancedModelRenderer(this);
        this.Tentacle2a.setRotationPoint(2.25F, 3.25F, -4.5F);
        this.Mantle2.addChild(Tentacle2a);
        this.setRotateAngle(Tentacle2a, 0.0131F, 0.1222F, 0.9599F);
        this.Tentacle2a.cubeList.add(new ModelBox(Tentacle2a, 24, 61, -0.5F, -0.5F, -6.0F, 1, 1, 6, 0.0F, false));

        this.Tentacle2b = new AdvancedModelRenderer(this);
        this.Tentacle2b.setRotationPoint(0.0F, 0.0F, -5.5F);
        this.Tentacle2a.addChild(Tentacle2b);
        this.setRotateAngle(Tentacle2b, -0.0131F, -0.0567F, 0.0F);
        this.Tentacle2b.cubeList.add(new ModelBox(Tentacle2b, 69, 36, -0.5F, -0.5F, -5.0F, 1, 1, 5, 0.0F, false));

        this.Tentacle2c = new AdvancedModelRenderer(this);
        this.Tentacle2c.setRotationPoint(0.0F, 0.0F, -4.5F);
        this.Tentacle2b.addChild(Tentacle2c);
        this.setRotateAngle(Tentacle2c, 0.0262F, -0.0218F, 0.0001F);
        this.Tentacle2c.cubeList.add(new ModelBox(Tentacle2c, 28, 69, -0.5F, -0.5F, -5.0F, 1, 1, 5, 0.0F, false));

        this.Tentacle3a = new AdvancedModelRenderer(this);
        this.Tentacle3a.setRotationPoint(2.75F, 2.0F, -4.5F);
        this.Mantle2.addChild(Tentacle3a);
        this.setRotateAngle(Tentacle3a, -0.0482F, 0.1614F, -0.0015F);
        this.Tentacle3a.cubeList.add(new ModelBox(Tentacle3a, 56, 59, -0.5F, -0.5F, -6.0F, 1, 1, 6, 0.0F, false));

        this.Tentacle3b = new AdvancedModelRenderer(this);
        this.Tentacle3b.setRotationPoint(0.0F, 0.0F, -5.5F);
        this.Tentacle3a.addChild(Tentacle3b);
        this.setRotateAngle(Tentacle3b, 0.0087F, -0.0916F, 0.0F);
        this.Tentacle3b.cubeList.add(new ModelBox(Tentacle3b, 14, 67, -0.5F, -0.5F, -5.0F, 1, 1, 5, 0.0F, false));

        this.Tentacle3c = new AdvancedModelRenderer(this);
        this.Tentacle3c.setRotationPoint(0.0F, 0.0F, -4.5F);
        this.Tentacle3b.addChild(Tentacle3c);
        this.setRotateAngle(Tentacle3c, 0.1353F, -0.0916F, 0.0F);
        this.Tentacle3c.cubeList.add(new ModelBox(Tentacle3c, 67, 6, -0.5F, -0.5F, -5.0F, 1, 1, 5, 0.0F, false));

        this.Tentacle4a = new AdvancedModelRenderer(this);
        this.Tentacle4a.setRotationPoint(2.25F, 0.75F, -4.5F);
        this.Mantle2.addChild(Tentacle4a);
        this.setRotateAngle(Tentacle4a, 0.1265F, 0.0F, 1.0472F);
        this.Tentacle4a.cubeList.add(new ModelBox(Tentacle4a, 48, 58, -0.5F, -0.5F, -6.0F, 1, 1, 6, 0.0F, false));

        this.Tentacle4b = new AdvancedModelRenderer(this);
        this.Tentacle4b.setRotationPoint(0.0F, 0.0F, -5.5F);
        this.Tentacle4a.addChild(Tentacle4b);
        this.setRotateAngle(Tentacle4b, -0.0917F, 0.0348F, -0.0032F);
        this.Tentacle4b.cubeList.add(new ModelBox(Tentacle4b, 53, 66, -0.5F, -0.5F, -5.0F, 1, 1, 5, 0.0F, false));

        this.Tentacle4c = new AdvancedModelRenderer(this);
        this.Tentacle4c.setRotationPoint(0.0F, 0.0F, -4.5F);
        this.Tentacle4b.addChild(Tentacle4c);
        this.setRotateAngle(Tentacle4c, -0.0306F, -0.0698F, 0.0017F);
        this.Tentacle4c.cubeList.add(new ModelBox(Tentacle4c, 65, 65, -0.5F, -0.5F, -5.0F, 1, 1, 5, 0.0F, false));

        this.Tentacle5a = new AdvancedModelRenderer(this);
        this.Tentacle5a.setRotationPoint(0.75F, 0.5F, -4.5F);
        this.Mantle2.addChild(Tentacle5a);
        this.setRotateAngle(Tentacle5a, 0.0742F, 0.0305F, 0.0019F);
        this.Tentacle5a.cubeList.add(new ModelBox(Tentacle5a, 40, 57, -0.5F, -0.5F, -6.0F, 1, 1, 6, 0.0F, false));

        this.Tentacle5b = new AdvancedModelRenderer(this);
        this.Tentacle5b.setRotationPoint(0.0F, 0.0F, -5.5F);
        this.Tentacle5a.addChild(Tentacle5b);
        this.setRotateAngle(Tentacle5b, -0.0436F, -0.0262F, 0.0011F);
        this.Tentacle5b.cubeList.add(new ModelBox(Tentacle5b, 46, 65, -0.5F, -0.5F, -5.0F, 1, 1, 5, 0.0F, false));

        this.Tentacle5c = new AdvancedModelRenderer(this);
        this.Tentacle5c.setRotationPoint(0.0F, 0.0F, -4.5F);
        this.Tentacle5b.addChild(Tentacle5c);
        this.setRotateAngle(Tentacle5c, -0.0087F, -0.0217F, 0.0017F);
        this.Tentacle5c.cubeList.add(new ModelBox(Tentacle5c, 65, 20, -0.5F, -0.5F, -5.0F, 1, 1, 5, 0.0F, false));

        this.Tentacle6a = new AdvancedModelRenderer(this);
        this.Tentacle6a.setRotationPoint(-0.75F, 3.25F, -4.5F);
        this.Mantle2.addChild(Tentacle6a);
        this.setRotateAngle(Tentacle6a, -0.1309F, -0.026F, 0.0034F);
        this.Tentacle6a.cubeList.add(new ModelBox(Tentacle6a, 8, 57, -0.5F, -0.5F, -6.0F, 1, 1, 6, 0.0F, false));

        this.Tentacle6b = new AdvancedModelRenderer(this);
        this.Tentacle6b.setRotationPoint(0.0F, 0.0F, -5.5F);
        this.Tentacle6a.addChild(Tentacle6b);
        this.setRotateAngle(Tentacle6b, 0.0393F, 0.0131F, 0.0005F);
        this.Tentacle6b.cubeList.add(new ModelBox(Tentacle6b, 64, 59, -0.5F, -0.5F, -5.0F, 1, 1, 5, 0.0F, false));

        this.Tentacle6c = new AdvancedModelRenderer(this);
        this.Tentacle6c.setRotationPoint(0.0F, 0.0F, -4.5F);
        this.Tentacle6b.addChild(Tentacle6c);
        this.setRotateAngle(Tentacle6c, 0.0873F, 0.0261F, 0.0018F);
        this.Tentacle6c.cubeList.add(new ModelBox(Tentacle6c, 64, 53, -0.5F, -0.5F, -5.0F, 1, 1, 5, 0.0F, false));

        this.Tentacle7a = new AdvancedModelRenderer(this);
        this.Tentacle7a.setRotationPoint(-2.25F, 3.25F, -4.5F);
        this.Mantle2.addChild(Tentacle7a);
        this.setRotateAngle(Tentacle7a, 0.0131F, -0.1222F, -0.9599F);
        this.Tentacle7a.cubeList.add(new ModelBox(Tentacle7a, 0, 56, -0.5F, -0.5F, -6.0F, 1, 1, 6, 0.0F, false));

        this.Tentacle7b = new AdvancedModelRenderer(this);
        this.Tentacle7b.setRotationPoint(0.0F, 0.0F, -5.5F);
        this.Tentacle7a.addChild(Tentacle7b);
        this.setRotateAngle(Tentacle7b, -0.0131F, 0.0567F, 0.0F);
        this.Tentacle7b.cubeList.add(new ModelBox(Tentacle7b, 39, 64, -0.5F, -0.5F, -5.0F, 1, 1, 5, 0.0F, false));

        this.Tentacle7c = new AdvancedModelRenderer(this);
        this.Tentacle7c.setRotationPoint(0.0F, 0.0F, -4.5F);
        this.Tentacle7b.addChild(Tentacle7c);
        this.setRotateAngle(Tentacle7c, 0.0262F, 0.0218F, -0.0001F);
        this.Tentacle7c.cubeList.add(new ModelBox(Tentacle7c, 7, 64, -0.5F, -0.5F, -5.0F, 1, 1, 5, 0.0F, false));

        this.Tentacle8a = new AdvancedModelRenderer(this);
        this.Tentacle8a.setRotationPoint(-2.75F, 2.0F, -4.5F);
        this.Mantle2.addChild(Tentacle8a);
        this.setRotateAngle(Tentacle8a, -0.0482F, -0.1614F, 0.0015F);
        this.Tentacle8a.cubeList.add(new ModelBox(Tentacle8a, 55, 51, -0.5F, -0.5F, -6.0F, 1, 1, 6, 0.0F, false));

        this.Tentacle8b = new AdvancedModelRenderer(this);
        this.Tentacle8b.setRotationPoint(0.0F, 0.0F, -5.5F);
        this.Tentacle8a.addChild(Tentacle8b);
        this.setRotateAngle(Tentacle8b, 0.0087F, 0.0916F, 0.0F);
        this.Tentacle8b.cubeList.add(new ModelBox(Tentacle8b, 63, 47, -0.5F, -0.5F, -5.0F, 1, 1, 5, 0.0F, false));

        this.Tentacle8c = new AdvancedModelRenderer(this);
        this.Tentacle8c.setRotationPoint(0.0F, 0.0F, -4.5F);
        this.Tentacle8b.addChild(Tentacle8c);
        this.setRotateAngle(Tentacle8c, 0.1353F, 0.0916F, 0.0F);
        this.Tentacle8c.cubeList.add(new ModelBox(Tentacle8c, 63, 30, -0.5F, -0.5F, -5.0F, 1, 1, 5, 0.0F, false));

        this.Tentacle9a = new AdvancedModelRenderer(this);
        this.Tentacle9a.setRotationPoint(-2.25F, 0.75F, -4.5F);
        this.Mantle2.addChild(Tentacle9a);
        this.setRotateAngle(Tentacle9a, 0.1265F, 0.0F, -1.0472F);
        this.Tentacle9a.cubeList.add(new ModelBox(Tentacle9a, 54, 41, -0.5F, -0.5F, -6.0F, 1, 1, 6, 0.0F, false));

        this.Tentacle9b = new AdvancedModelRenderer(this);
        this.Tentacle9b.setRotationPoint(0.0F, 0.0F, -5.5F);
        this.Tentacle9a.addChild(Tentacle9b);
        this.setRotateAngle(Tentacle9b, -0.0917F, -0.0348F, 0.0032F);
        this.Tentacle9b.cubeList.add(new ModelBox(Tentacle9b, 63, 0, -0.5F, -0.5F, -5.0F, 1, 1, 5, 0.0F, false));

        this.Tentacle9c = new AdvancedModelRenderer(this);
        this.Tentacle9c.setRotationPoint(0.0F, 0.0F, -4.5F);
        this.Tentacle9b.addChild(Tentacle9c);
        this.setRotateAngle(Tentacle9c, -0.0306F, 0.0698F, -0.0017F);
        this.Tentacle9c.cubeList.add(new ModelBox(Tentacle9c, 0, 63, -0.5F, -0.5F, -5.0F, 1, 1, 5, 0.0F, false));

        this.Tentacle10a = new AdvancedModelRenderer(this);
        this.Tentacle10a.setRotationPoint(-0.75F, 0.5F, -4.5F);
        this.Mantle2.addChild(Tentacle10a);
        this.setRotateAngle(Tentacle10a, 0.0742F, -0.0305F, -0.0019F);
        this.Tentacle10a.cubeList.add(new ModelBox(Tentacle10a, 32, 54, -0.5F, -0.5F, -6.0F, 1, 1, 6, 0.0F, false));

        this.Tentacle10b = new AdvancedModelRenderer(this);
        this.Tentacle10b.setRotationPoint(0.0F, 0.0F, -5.5F);
        this.Tentacle10a.addChild(Tentacle10b);
        this.setRotateAngle(Tentacle10b, -0.0436F, 0.0262F, -0.0011F);
        this.Tentacle10b.cubeList.add(new ModelBox(Tentacle10b, 62, 41, -0.5F, -0.5F, -5.0F, 1, 1, 5, 0.0F, false));

        this.Tentacle10c = new AdvancedModelRenderer(this);
        this.Tentacle10c.setRotationPoint(0.0F, 0.0F, -4.5F);
        this.Tentacle10b.addChild(Tentacle10c);
        this.setRotateAngle(Tentacle10c, -0.0087F, 0.0217F, -0.0017F);
        this.Tentacle10c.cubeList.add(new ModelBox(Tentacle10c, 32, 61, -0.5F, -0.5F, -5.0F, 1, 1, 5, 0.0F, false));

        this.Siphon = new AdvancedModelRenderer(this);
        this.Siphon.setRotationPoint(0.0F, 3.875F, -2.15F);
        this.Mantle2.addChild(Siphon);
        this.setRotateAngle(Siphon, 0.2618F, 0.0F, 0.0F);
        this.Siphon.cubeList.add(new ModelBox(Siphon, 46, 11, -1.5F, -1.0F, -3.0F, 3, 2, 3, 0.0F, false));
        updateDefaultPose();
    }

    public void renderAll(float f) {
        this.resetToDefaultPose();
        this.Root.offsetY = -1F;
        this.Root.render(0.08f);
    }

    public void setRotateAngle(ModelRenderer modelRenderer, float x, float y, float z) {
        modelRenderer.rotateAngleX = x;
        modelRenderer.rotateAngleY = y;
        modelRenderer.rotateAngleZ = z;
    }

}
