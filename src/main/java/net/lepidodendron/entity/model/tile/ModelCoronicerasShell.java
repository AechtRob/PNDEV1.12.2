package net.lepidodendron.entity.model.tile;

import net.ilexiconn.llibrary.client.model.tools.AdvancedModelRenderer;
import net.lepidodendron.entity.model.llibraryextensions.AdvancedModelBaseExtended;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;

public class ModelCoronicerasShell extends AdvancedModelBaseExtended {
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
    private final AdvancedModelRenderer Shell12;
    private final AdvancedModelRenderer Mantle1;
    private final AdvancedModelRenderer Mantle2;
    private final AdvancedModelRenderer Siphon;
    private final AdvancedModelRenderer leftEye;
    private final AdvancedModelRenderer rightEye;
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
    private final AdvancedModelRenderer Tentacle9b2;
    private final AdvancedModelRenderer Tentacle10a;
    private final AdvancedModelRenderer Tentacle10b;
    private final AdvancedModelRenderer Tentacle10c;

    public ModelCoronicerasShell() {
        this.textureWidth = 78;
        this.textureHeight = 78;

        this.Root = new AdvancedModelRenderer(this);
        this.Root.setRotationPoint(0.0F, 24.0F, 0.0F);
        this.setRotateAngle(Root, 0.0F, 3.1416F, 0.0F);


        this.Shell1 = new AdvancedModelRenderer(this);
        this.Shell1.setRotationPoint(0.0F, -8.0F, -9.0F);
        this.Root.addChild(Shell1);
        this.setRotateAngle(Shell1, -0.829F, 0.0F, 0.0F);
        this.Shell1.cubeList.add(new ModelBox(Shell1, 0, 0, -3.0F, -6.0F, 0.0F, 6, 6, 9, 0.04F, false));
        this.Shell1.cubeList.add(new ModelBox(Shell1, 40, 43, -1.2F, -0.079F, 0.3235F, 0, 1, 9, 0.0F, false));
        this.Shell1.cubeList.add(new ModelBox(Shell1, 40, 43, 0.0F, -0.079F, 0.3235F, 0, 1, 9, 0.0F, true));
        this.Shell1.cubeList.add(new ModelBox(Shell1, 40, 43, 1.2F, -0.079F, 0.3235F, 0, 1, 9, 0.0F, true));

        this.Shell2 = new AdvancedModelRenderer(this);
        this.Shell2.setRotationPoint(0.0F, 0.0F, 9.0F);
        this.Shell1.addChild(Shell2);
        this.setRotateAngle(Shell2, 0.7854F, 0.0F, 0.0F);
        this.Shell2.cubeList.add(new ModelBox(Shell2, 20, 20, -3.0F, -5.0F, 0.0F, 6, 5, 8, 0.01F, false));
        this.Shell2.cubeList.add(new ModelBox(Shell2, 40, 44, -1.175F, -0.12F, -0.4224F, 0, 1, 9, 0.0F, false));
        this.Shell2.cubeList.add(new ModelBox(Shell2, 40, 44, -0.025F, -0.12F, -0.4224F, 0, 1, 9, 0.0F, false));
        this.Shell2.cubeList.add(new ModelBox(Shell2, 40, 44, 0.025F, -0.12F, -0.4224F, 0, 1, 9, 0.0F, true));
        this.Shell2.cubeList.add(new ModelBox(Shell2, 40, 41, 1.175F, -0.12F, -0.4224F, 0, 1, 9, 0.0F, false));

        this.Shell3 = new AdvancedModelRenderer(this);
        this.Shell3.setRotationPoint(0.0F, 0.0F, 8.0F);
        this.Shell2.addChild(Shell3);
        this.setRotateAngle(Shell3, 0.6109F, 0.0F, 0.0F);
        this.Shell3.cubeList.add(new ModelBox(Shell3, 0, 15, -3.0F, -5.0F, 0.0F, 6, 5, 8, 0.0F, false));
        this.Shell3.cubeList.add(new ModelBox(Shell3, 0, 47, -1.15F, -0.0479F, -0.0316F, 0, 1, 8, 0.0F, false));
        this.Shell3.cubeList.add(new ModelBox(Shell3, 0, 47, 0.0F, -0.0479F, -0.0316F, 0, 1, 8, 0.0F, false));
        this.Shell3.cubeList.add(new ModelBox(Shell3, 34, 46, 1.15F, -0.0479F, -0.0316F, 0, 1, 8, 0.0F, false));

        this.Shell4 = new AdvancedModelRenderer(this);
        this.Shell4.setRotationPoint(0.0F, 0.0F, 8.0F);
        this.Shell3.addChild(Shell4);
        this.setRotateAngle(Shell4, 0.6981F, 0.0F, 0.0F);
        this.Shell4.cubeList.add(new ModelBox(Shell4, 22, 7, -2.5F, -5.0F, 0.0F, 5, 5, 8, 0.04F, false));
        this.Shell4.cubeList.add(new ModelBox(Shell4, 0, 45, -1.125F, -0.2144F, -0.7005F, 0, 1, 9, 0.0F, false));
        this.Shell4.cubeList.add(new ModelBox(Shell4, 0, 45, -0.025F, -0.2144F, -0.7005F, 0, 1, 9, 0.0F, false));
        this.Shell4.cubeList.add(new ModelBox(Shell4, 0, 45, 0.025F, -0.2144F, -0.7005F, 0, 1, 9, 0.0F, true));
        this.Shell4.cubeList.add(new ModelBox(Shell4, 40, 17, 1.125F, -0.2144F, -0.7005F, 0, 1, 9, 0.0F, false));

        this.Shell5 = new AdvancedModelRenderer(this);
        this.Shell5.setRotationPoint(0.0F, 0.0F, 8.0F);
        this.Shell4.addChild(Shell5);
        this.setRotateAngle(Shell5, 0.829F, 0.0F, 0.0F);
        this.Shell5.cubeList.add(new ModelBox(Shell5, 16, 47, -1.1F, -0.2484F, -0.3769F, 0, 1, 8, 0.0F, false));
        this.Shell5.cubeList.add(new ModelBox(Shell5, 16, 47, 0.0F, -0.2484F, -0.3769F, 0, 1, 8, 0.0F, false));
        this.Shell5.cubeList.add(new ModelBox(Shell5, 18, 46, 1.1F, -0.2484F, -0.3769F, 0, 1, 8, 0.0F, false));
        this.Shell5.cubeList.add(new ModelBox(Shell5, 22, 33, -2.5F, -5.0F, 0.0F, 5, 5, 7, 0.01F, false));

        this.Shell6 = new AdvancedModelRenderer(this);
        this.Shell6.setRotationPoint(0.0F, 0.0F, 7.0F);
        this.Shell5.addChild(Shell6);
        this.setRotateAngle(Shell6, 0.7418F, 0.0F, 0.0F);
        this.Shell6.cubeList.add(new ModelBox(Shell6, 39, 38, -2.5F, -5.0F, 0.0F, 5, 5, 7, 0.0F, false));
        this.Shell6.cubeList.add(new ModelBox(Shell6, 0, 52, -1.075F, -0.0249F, -0.0483F, 0, 1, 7, 0.0F, false));
        this.Shell6.cubeList.add(new ModelBox(Shell6, 0, 52, -0.025F, -0.0249F, -0.0483F, 0, 1, 7, 0.0F, false));
        this.Shell6.cubeList.add(new ModelBox(Shell6, 0, 52, 0.025F, -0.0249F, -0.0483F, 0, 1, 7, 0.0F, true));
        this.Shell6.cubeList.add(new ModelBox(Shell6, 28, 51, 1.075F, -0.0249F, -0.0483F, 0, 1, 7, 0.0F, false));

        this.Shell7 = new AdvancedModelRenderer(this);
        this.Shell7.setRotationPoint(0.0F, 0.0F, 7.0F);
        this.Shell6.addChild(Shell7);
        this.setRotateAngle(Shell7, 0.7854F, 0.0F, 0.0F);
        this.Shell7.cubeList.add(new ModelBox(Shell7, 40, 0, -2.0F, -4.0F, 0.0F, 4, 4, 7, 0.04F, false));
        this.Shell7.cubeList.add(new ModelBox(Shell7, 32, 48, -1.05F, -0.3447F, -0.7237F, 0, 1, 8, 0.0F, false));
        this.Shell7.cubeList.add(new ModelBox(Shell7, 32, 48, 0.0F, -0.3447F, -0.7237F, 0, 1, 8, 0.0F, false));
        this.Shell7.cubeList.add(new ModelBox(Shell7, 16, 48, 1.05F, -0.3447F, -0.7237F, 0, 1, 8, 0.0F, false));

        this.Shell8 = new AdvancedModelRenderer(this);
        this.Shell8.setRotationPoint(0.0F, 0.0F, 7.0F);
        this.Shell7.addChild(Shell8);
        this.setRotateAngle(Shell8, 0.829F, 0.0F, 0.0F);
        this.Shell8.cubeList.add(new ModelBox(Shell8, 0, 44, -2.0F, -4.0F, 0.0F, 4, 4, 6, 0.01F, false));
        this.Shell8.cubeList.add(new ModelBox(Shell8, 14, 52, -1.025F, -0.3536F, -0.2965F, 0, 1, 7, 0.0F, false));
        this.Shell8.cubeList.add(new ModelBox(Shell8, 14, 52, -0.025F, -0.3536F, -0.2965F, 0, 1, 7, 0.0F, false));
        this.Shell8.cubeList.add(new ModelBox(Shell8, 14, 52, 0.025F, -0.3536F, -0.2965F, 0, 1, 7, 0.0F, true));
        this.Shell8.cubeList.add(new ModelBox(Shell8, 14, 51, 1.025F, -0.3536F, -0.2965F, 0, 1, 7, 0.0F, false));

        this.Shell9 = new AdvancedModelRenderer(this);
        this.Shell9.setRotationPoint(0.0F, 0.0F, 6.0F);
        this.Shell8.addChild(Shell9);
        this.setRotateAngle(Shell9, 0.6545F, 0.0F, 0.0F);
        this.Shell9.cubeList.add(new ModelBox(Shell9, 42, 27, -2.0F, -4.0F, 0.0F, 4, 4, 6, 0.0F, false));
        this.Shell9.cubeList.add(new ModelBox(Shell9, 0, 3, -1.0F, -0.0653F, 0.1457F, 0, 1, 3, 0.0F, false));
        this.Shell9.cubeList.add(new ModelBox(Shell9, 0, 3, 0.0F, -0.0653F, 0.1457F, 0, 1, 3, 0.0F, true));
        this.Shell9.cubeList.add(new ModelBox(Shell9, 0, 2, 1.0F, -0.0653F, 0.1457F, 0, 1, 3, 0.0F, false));

        this.Shell10 = new AdvancedModelRenderer(this);
        this.Shell10.setRotationPoint(0.0F, 0.0F, 6.0F);
        this.Shell9.addChild(Shell10);
        this.setRotateAngle(Shell10, 0.7854F, 0.0F, 0.0F);
        this.Shell10.cubeList.add(new ModelBox(Shell10, 54, 11, -1.5F, -4.0F, 0.0F, 3, 4, 5, 0.04F, false));

        this.Shell11 = new AdvancedModelRenderer(this);
        this.Shell11.setRotationPoint(0.0F, 0.0F, 5.0F);
        this.Shell10.addChild(Shell11);
        this.setRotateAngle(Shell11, 0.829F, 0.0F, 0.0F);
        this.Shell11.cubeList.add(new ModelBox(Shell11, 53, 50, -1.5F, -4.0F, 0.0F, 3, 4, 5, 0.01F, false));
        this.Shell11.cubeList.add(new ModelBox(Shell11, 0, 28, -1.0F, -11.0F, 0.0F, 2, 7, 9, 0.0F, false));

        this.Shell12 = new AdvancedModelRenderer(this);
        this.Shell12.setRotationPoint(0.0F, 0.0F, 5.0F);
        this.Shell11.addChild(Shell12);
        this.setRotateAngle(Shell12, 0.7418F, 0.0F, 0.0F);
        this.Shell12.cubeList.add(new ModelBox(Shell12, 41, 13, -1.5F, -3.0F, 0.0F, 3, 3, 7, 0.0F, false));

        this.Mantle1 = new AdvancedModelRenderer(this);
        this.Mantle1.setRotationPoint(0.0F, -11.9F, -4.775F);
        this.Root.addChild(Mantle1);
        this.setRotateAngle(Mantle1, -0.6981F, 0.0F, 0.0F);
        this.Mantle1.cubeList.add(new ModelBox(Mantle1, 64, 28, -2.5F, 0.0F, -2.0F, 5, 4, 2, -0.01F, false));

        this.Mantle2 = new AdvancedModelRenderer(this);
        this.Mantle2.setRotationPoint(0.0F, 0.0F, -2.0F);
        this.Mantle1.addChild(Mantle2);
        this.setRotateAngle(Mantle2, 0.7069F, 0.0F, 0.0F);
        this.Mantle2.cubeList.add(new ModelBox(Mantle2, 20, 45, -2.5F, 0.0F, -5.0F, 5, 4, 5, 0.0F, false));

        this.Siphon = new AdvancedModelRenderer(this);
        this.Siphon.setRotationPoint(0.0F, 3.6F, -1.15F);
        this.Mantle2.addChild(Siphon);
        this.setRotateAngle(Siphon, 0.2618F, 0.0F, 0.0F);
        this.Siphon.cubeList.add(new ModelBox(Siphon, 64, 20, -1.5F, -1.0F, -4.0F, 3, 2, 4, 0.0F, false));

        this.leftEye = new AdvancedModelRenderer(this);
        this.leftEye.setRotationPoint(1.3F, 0.792F, -1.282F);
        this.Mantle2.addChild(leftEye);
        this.setRotateAngle(leftEye, 0.0F, 0.0F, -0.2182F);
        this.leftEye.cubeList.add(new ModelBox(leftEye, 56, 39, -1.05F, -1.0F, -1.5F, 3, 2, 3, 0.0F, false));
        this.leftEye.cubeList.add(new ModelBox(leftEye, 0, 0, 1.05F, -0.5F, -1.0F, 1, 1, 2, 0.0F, false));

        this.rightEye = new AdvancedModelRenderer(this);
        this.rightEye.setRotationPoint(-1.3F, 0.792F, -1.282F);
        this.Mantle2.addChild(rightEye);
        this.setRotateAngle(rightEye, 0.0F, 0.0F, 0.2182F);
        this.rightEye.cubeList.add(new ModelBox(rightEye, 56, 39, -1.95F, -1.0F, -1.5F, 3, 2, 3, 0.0F, true));
        this.rightEye.cubeList.add(new ModelBox(rightEye, 0, 0, -2.05F, -0.5F, -1.0F, 1, 1, 2, 0.0F, true));

        this.Tentacle1a = new AdvancedModelRenderer(this);
        this.Tentacle1a.setRotationPoint(0.5F, 3.25F, -4.5F);
        this.Mantle2.addChild(Tentacle1a);
        this.setRotateAngle(Tentacle1a, -0.0436F, 0.0174F, -0.0008F);
        this.Tentacle1a.cubeList.add(new ModelBox(Tentacle1a, 63, 53, -0.5F, -0.5F, -6.0F, 1, 1, 6, 0.0F, false));

        this.Tentacle1b = new AdvancedModelRenderer(this);
        this.Tentacle1b.setRotationPoint(0.0F, 0.0F, -5.5F);
        this.Tentacle1a.addChild(Tentacle1b);
        this.setRotateAngle(Tentacle1b, -0.0436F, -0.0218F, 0.001F);
        this.Tentacle1b.cubeList.add(new ModelBox(Tentacle1b, 63, 39, -0.5F, -0.5F, -6.0F, 1, 1, 6, 0.0F, false));

        this.Tentacle1c = new AdvancedModelRenderer(this);
        this.Tentacle1c.setRotationPoint(0.0F, 0.0F, -5.5F);
        this.Tentacle1b.addChild(Tentacle1c);
        this.setRotateAngle(Tentacle1c, 0.0131F, 0.0305F, 0.0007F);
        this.Tentacle1c.cubeList.add(new ModelBox(Tentacle1c, 63, 1, -0.5F, -0.5F, -6.0F, 1, 1, 6, 0.0F, false));

        this.Tentacle2a = new AdvancedModelRenderer(this);
        this.Tentacle2a.setRotationPoint(1.75F, 3.25F, -4.5F);
        this.Mantle2.addChild(Tentacle2a);
        this.setRotateAngle(Tentacle2a, -0.0437F, 0.048F, 0.7848F);
        this.Tentacle2a.cubeList.add(new ModelBox(Tentacle2a, 44, 61, -0.5F, -0.5F, -6.0F, 1, 1, 6, 0.0F, false));

        this.Tentacle2b = new AdvancedModelRenderer(this);
        this.Tentacle2b.setRotationPoint(0.0F, 0.0F, -5.5F);
        this.Tentacle2a.addChild(Tentacle2b);
        this.setRotateAngle(Tentacle2b, 0.0F, 0.0306F, -0.0013F);
        this.Tentacle2b.cubeList.add(new ModelBox(Tentacle2b, 60, 60, -0.5F, -0.5F, -6.0F, 1, 1, 6, 0.0F, false));

        this.Tentacle2c = new AdvancedModelRenderer(this);
        this.Tentacle2c.setRotationPoint(0.0F, 0.0F, -5.5F);
        this.Tentacle2b.addChild(Tentacle2c);
        this.setRotateAngle(Tentacle2c, 0.0742F, 0.0392F, 0.0027F);
        this.Tentacle2c.cubeList.add(new ModelBox(Tentacle2c, 14, 60, -0.5F, -0.5F, -6.0F, 1, 1, 6, 0.0F, false));

        this.Tentacle3a = new AdvancedModelRenderer(this);
        this.Tentacle3a.setRotationPoint(1.75F, 2.0F, -4.5F);
        this.Mantle2.addChild(Tentacle3a);
        this.setRotateAngle(Tentacle3a, -0.0525F, -0.061F, 0.0032F);
        this.Tentacle3a.cubeList.add(new ModelBox(Tentacle3a, 0, 60, -0.5F, -0.5F, -6.0F, 1, 1, 6, 0.0F, false));
        this.Tentacle3a.cubeList.add(new ModelBox(Tentacle3a, 21, 0, 0.5F, 0.0F, -5.9956F, 2, 0, 6, 0.0F, false));

        this.Tentacle3b = new AdvancedModelRenderer(this);
        this.Tentacle3b.setRotationPoint(0.0F, 0.0F, -5.5F);
        this.Tentacle3a.addChild(Tentacle3b);
        this.setRotateAngle(Tentacle3b, 0.0567F, 0.1004F, 0.0F);
        this.Tentacle3b.cubeList.add(new ModelBox(Tentacle3b, 52, 59, -0.5F, -0.5F, -6.0F, 1, 1, 6, 0.0F, false));
        this.Tentacle3b.cubeList.add(new ModelBox(Tentacle3b, 15, 0, 0.5F, 0.0F, -5.9956F, 3, 0, 6, 0.0F, false));

        this.Tentacle3c = new AdvancedModelRenderer(this);
        this.Tentacle3c.setRotationPoint(0.0F, 0.0F, -5.5F);
        this.Tentacle3b.addChild(Tentacle3c);
        this.setRotateAngle(Tentacle3c, -0.0174F, 0.0698F, 0.001F);
        this.Tentacle3c.cubeList.add(new ModelBox(Tentacle3c, 22, 59, -0.5F, -0.5F, -6.0F, 1, 1, 6, 0.0F, false));
        this.Tentacle3c.cubeList.add(new ModelBox(Tentacle3c, 25, 0, 0.5F, 0.0F, -5.9956F, 2, 0, 6, 0.0F, false));

        this.Tentacle4a = new AdvancedModelRenderer(this);
        this.Tentacle4a.setRotationPoint(1.75F, 0.75F, -4.5F);
        this.Mantle2.addChild(Tentacle4a);
        this.setRotateAngle(Tentacle4a, 0.048F, 0.0F, 0.7854F);
        this.Tentacle4a.cubeList.add(new ModelBox(Tentacle4a, 36, 57, -0.5F, -0.5F, -6.0F, 1, 1, 6, 0.0F, false));

        this.Tentacle4b = new AdvancedModelRenderer(this);
        this.Tentacle4b.setRotationPoint(0.0F, 0.0F, -5.5F);
        this.Tentacle4a.addChild(Tentacle4b);
        this.setRotateAngle(Tentacle4b, -0.0086F, 0.0084F, 0.004F);
        this.Tentacle4b.cubeList.add(new ModelBox(Tentacle4b, 56, 32, -0.5F, -0.5F, -6.0F, 1, 1, 6, 0.0F, false));

        this.Tentacle4c = new AdvancedModelRenderer(this);
        this.Tentacle4c.setRotationPoint(0.0F, 0.0F, -5.5F);
        this.Tentacle4b.addChild(Tentacle4c);
        this.setRotateAngle(Tentacle4c, 0.0567F, -0.0087F, -0.0005F);
        this.Tentacle4c.cubeList.add(new ModelBox(Tentacle4c, 56, 21, -0.5F, -0.5F, -6.0F, 1, 1, 6, 0.0F, false));

        this.Tentacle5a = new AdvancedModelRenderer(this);
        this.Tentacle5a.setRotationPoint(0.5F, 0.75F, -4.5F);
        this.Mantle2.addChild(Tentacle5a);
        this.setRotateAngle(Tentacle5a, -0.0173F, 0.0349F, 0.0018F);
        this.Tentacle5a.cubeList.add(new ModelBox(Tentacle5a, 55, 0, -0.5F, -0.5F, -6.0F, 1, 1, 6, 0.0F, false));

        this.Tentacle5b = new AdvancedModelRenderer(this);
        this.Tentacle5b.setRotationPoint(0.0F, 0.0F, -5.5F);
        this.Tentacle5a.addChild(Tentacle5b);
        this.setRotateAngle(Tentacle5b, 0.0393F, -0.048F, -0.0013F);
        this.Tentacle5b.cubeList.add(new ModelBox(Tentacle5b, 44, 54, -0.5F, -0.5F, -6.0F, 1, 1, 6, 0.0F, false));

        this.Tentacle5c = new AdvancedModelRenderer(this);
        this.Tentacle5c.setRotationPoint(0.0F, 0.0F, -5.5F);
        this.Tentacle5b.addChild(Tentacle5c);
        this.setRotateAngle(Tentacle5c, 0.0306F, 0.0393F, 0.0012F);
        this.Tentacle5c.cubeList.add(new ModelBox(Tentacle5c, 29, 0, -0.5F, -0.5F, -6.0F, 1, 1, 6, 0.0F, false));

        this.Tentacle6a = new AdvancedModelRenderer(this);
        this.Tentacle6a.setRotationPoint(-0.5F, 3.25F, -4.5F);
        this.Mantle2.addChild(Tentacle6a);
        this.setRotateAngle(Tentacle6a, -0.0436F, -0.0174F, 0.0008F);
        this.Tentacle6a.cubeList.add(new ModelBox(Tentacle6a, 63, 53, -0.5F, -0.5F, -6.0F, 1, 1, 6, 0.0F, true));

        this.Tentacle6b = new AdvancedModelRenderer(this);
        this.Tentacle6b.setRotationPoint(0.0F, 0.0F, -5.5F);
        this.Tentacle6a.addChild(Tentacle6b);
        this.setRotateAngle(Tentacle6b, -0.0436F, 0.0218F, -0.001F);
        this.Tentacle6b.cubeList.add(new ModelBox(Tentacle6b, 63, 39, -0.5F, -0.5F, -6.0F, 1, 1, 6, 0.0F, true));

        this.Tentacle6c = new AdvancedModelRenderer(this);
        this.Tentacle6c.setRotationPoint(0.0F, 0.0F, -5.5F);
        this.Tentacle6b.addChild(Tentacle6c);
        this.setRotateAngle(Tentacle6c, 0.0131F, -0.0305F, -0.0007F);
        this.Tentacle6c.cubeList.add(new ModelBox(Tentacle6c, 63, 1, -0.5F, -0.5F, -6.0F, 1, 1, 6, 0.0F, true));

        this.Tentacle7a = new AdvancedModelRenderer(this);
        this.Tentacle7a.setRotationPoint(-1.75F, 3.25F, -4.5F);
        this.Mantle2.addChild(Tentacle7a);
        this.setRotateAngle(Tentacle7a, -0.0437F, -0.048F, -0.7848F);
        this.Tentacle7a.cubeList.add(new ModelBox(Tentacle7a, 44, 61, -0.5F, -0.5F, -6.0F, 1, 1, 6, 0.0F, true));

        this.Tentacle7b = new AdvancedModelRenderer(this);
        this.Tentacle7b.setRotationPoint(0.0F, 0.0F, -5.5F);
        this.Tentacle7a.addChild(Tentacle7b);
        this.setRotateAngle(Tentacle7b, 0.0F, -0.0306F, 0.0013F);
        this.Tentacle7b.cubeList.add(new ModelBox(Tentacle7b, 60, 60, -0.5F, -0.5F, -6.0F, 1, 1, 6, 0.0F, true));

        this.Tentacle7c = new AdvancedModelRenderer(this);
        this.Tentacle7c.setRotationPoint(0.0F, 0.0F, -5.5F);
        this.Tentacle7b.addChild(Tentacle7c);
        this.setRotateAngle(Tentacle7c, 0.0742F, -0.0392F, -0.0027F);
        this.Tentacle7c.cubeList.add(new ModelBox(Tentacle7c, 14, 60, -0.5F, -0.5F, -6.0F, 1, 1, 6, 0.0F, true));

        this.Tentacle8a = new AdvancedModelRenderer(this);
        this.Tentacle8a.setRotationPoint(-1.75F, 2.0F, -4.5F);
        this.Mantle2.addChild(Tentacle8a);
        this.setRotateAngle(Tentacle8a, -0.0525F, 0.061F, -0.0032F);
        this.Tentacle8a.cubeList.add(new ModelBox(Tentacle8a, 0, 60, -0.5F, -0.5F, -6.0F, 1, 1, 6, 0.0F, true));
        this.Tentacle8a.cubeList.add(new ModelBox(Tentacle8a, 21, 0, -2.5F, 0.0F, -5.9956F, 2, 0, 6, 0.0F, true));

        this.Tentacle8b = new AdvancedModelRenderer(this);
        this.Tentacle8b.setRotationPoint(0.0F, 0.0F, -5.5F);
        this.Tentacle8a.addChild(Tentacle8b);
        this.setRotateAngle(Tentacle8b, 0.0567F, -0.1004F, 0.0F);
        this.Tentacle8b.cubeList.add(new ModelBox(Tentacle8b, 52, 59, -0.5F, -0.5F, -6.0F, 1, 1, 6, 0.0F, true));
        this.Tentacle8b.cubeList.add(new ModelBox(Tentacle8b, 15, 0, -3.5F, 0.0F, -5.9956F, 3, 0, 6, 0.0F, true));

        this.Tentacle8c = new AdvancedModelRenderer(this);
        this.Tentacle8c.setRotationPoint(0.0F, 0.0F, -5.5F);
        this.Tentacle8b.addChild(Tentacle8c);
        this.setRotateAngle(Tentacle8c, -0.0174F, -0.0698F, -0.001F);
        this.Tentacle8c.cubeList.add(new ModelBox(Tentacle8c, 22, 59, -0.5F, -0.5F, -6.0F, 1, 1, 6, 0.0F, true));
        this.Tentacle8c.cubeList.add(new ModelBox(Tentacle8c, 25, 0, -2.5F, 0.0F, -5.9956F, 2, 0, 6, 0.0F, true));

        this.Tentacle9a = new AdvancedModelRenderer(this);
        this.Tentacle9a.setRotationPoint(-1.75F, 0.75F, -4.5F);
        this.Mantle2.addChild(Tentacle9a);
        this.setRotateAngle(Tentacle9a, 0.048F, 0.0F, -0.7854F);
        this.Tentacle9a.cubeList.add(new ModelBox(Tentacle9a, 36, 57, -0.5F, -0.5F, -6.0F, 1, 1, 6, 0.0F, true));

        this.Tentacle9b = new AdvancedModelRenderer(this);
        this.Tentacle9b.setRotationPoint(0.0F, 0.0F, -5.5F);
        this.Tentacle9a.addChild(Tentacle9b);
        this.setRotateAngle(Tentacle9b, -0.0086F, -0.0084F, -0.004F);
        this.Tentacle9b.cubeList.add(new ModelBox(Tentacle9b, 56, 32, -0.5F, -0.5F, -6.0F, 1, 1, 6, 0.0F, true));

        this.Tentacle9b2 = new AdvancedModelRenderer(this);
        this.Tentacle9b2.setRotationPoint(0.0F, 0.0F, -5.5F);
        this.Tentacle9b.addChild(Tentacle9b2);
        this.setRotateAngle(Tentacle9b2, 0.0567F, 0.0087F, 0.0005F);
        this.Tentacle9b2.cubeList.add(new ModelBox(Tentacle9b2, 56, 21, -0.5F, -0.5F, -6.0F, 1, 1, 6, 0.0F, true));

        this.Tentacle10a = new AdvancedModelRenderer(this);
        this.Tentacle10a.setRotationPoint(-0.5F, 0.75F, -4.5F);
        this.Mantle2.addChild(Tentacle10a);
        this.setRotateAngle(Tentacle10a, -0.0173F, -0.0349F, -0.0018F);
        this.Tentacle10a.cubeList.add(new ModelBox(Tentacle10a, 55, 0, -0.5F, -0.5F, -6.0F, 1, 1, 6, 0.0F, true));

        this.Tentacle10b = new AdvancedModelRenderer(this);
        this.Tentacle10b.setRotationPoint(0.0F, 0.0F, -5.5F);
        this.Tentacle10a.addChild(Tentacle10b);
        this.setRotateAngle(Tentacle10b, 0.0393F, 0.048F, 0.0013F);
        this.Tentacle10b.cubeList.add(new ModelBox(Tentacle10b, 44, 54, -0.5F, -0.5F, -6.0F, 1, 1, 6, 0.0F, true));

        this.Tentacle10c = new AdvancedModelRenderer(this);
        this.Tentacle10c.setRotationPoint(0.0F, 0.0F, -5.5F);
        this.Tentacle10b.addChild(Tentacle10c);
        this.setRotateAngle(Tentacle10c, 0.0306F, -0.0393F, -0.0012F);
        this.Tentacle10c.cubeList.add(new ModelBox(Tentacle10c, 29, 0, -0.5F, -0.5F, -6.0F, 1, 1, 6, 0.0F, true));
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
