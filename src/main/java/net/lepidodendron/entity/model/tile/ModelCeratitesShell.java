package net.lepidodendron.entity.model.tile;

import net.ilexiconn.llibrary.client.model.tools.AdvancedModelRenderer;
import net.lepidodendron.entity.model.llibraryextensions.AdvancedModelBaseExtended;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;

public class ModelCeratitesShell extends AdvancedModelBaseExtended {
    private final AdvancedModelRenderer root;
    private final AdvancedModelRenderer Shell;
    private final AdvancedModelRenderer Shell2_r1;
    private final AdvancedModelRenderer Shell4_r1;
    private final AdvancedModelRenderer Shell6_r1;
    private final AdvancedModelRenderer Shell8_r1;
    private final AdvancedModelRenderer Shell7_r1;
    private final AdvancedModelRenderer Shell5_r1;
    private final AdvancedModelRenderer Shell3_r1;
    private final AdvancedModelRenderer Shell1_r1;
    private final AdvancedModelRenderer Shell2_r2;
    private final AdvancedModelRenderer Shell3_r2;
    private final AdvancedModelRenderer cube_r1;
    private final AdvancedModelRenderer cube_r2;
    private final AdvancedModelRenderer cube_r3;
    private final AdvancedModelRenderer cube_r4;
    private final AdvancedModelRenderer cube_r5;
    private final AdvancedModelRenderer cube_r6;
    private final AdvancedModelRenderer cube_r7;
    private final AdvancedModelRenderer cube_r8;
    private final AdvancedModelRenderer cube_r9;
    private final AdvancedModelRenderer cube_r10;
    private final AdvancedModelRenderer cube_r11;
    private final AdvancedModelRenderer Mantle;
    private final AdvancedModelRenderer Siphon;
    private final AdvancedModelRenderer Mantle2;
    private final AdvancedModelRenderer Tentacle1a;
    private final AdvancedModelRenderer Tentacle2a;
    private final AdvancedModelRenderer Tentacle3a;
    private final AdvancedModelRenderer Tentacle4a;
    private final AdvancedModelRenderer Tentacle5a;
    private final AdvancedModelRenderer Tentacle6a;
    private final AdvancedModelRenderer Tentacle7a;
    private final AdvancedModelRenderer Tentacle8a;
    private final AdvancedModelRenderer Tentacle9a;
    private final AdvancedModelRenderer Tentacle10a;
    private final AdvancedModelRenderer eyeRight;
    private final AdvancedModelRenderer eyeLeft;

    public ModelCeratitesShell() {
        this.textureWidth = 64;
        this.textureHeight = 64;

        this.root = new AdvancedModelRenderer(this);
        this.root.setRotationPoint(0.0F, 24.0F, 0.0F);


        this.Shell = new AdvancedModelRenderer(this);
        this.Shell.setRotationPoint(0.0F, -6.0652F, 4.2727F);
        this.root.addChild(Shell);
        this.Shell.cubeList.add(new ModelBox(Shell, 0, 28, 2.4F, 1.8909F, -5.3496F, 2, 3, 0, 0.0F, false));
        this.Shell.cubeList.add(new ModelBox(Shell, 0, 4, -4.4F, 1.8909F, -5.3496F, 2, 3, 0, 0.0F, false));

        this.Shell2_r1 = new AdvancedModelRenderer(this);
        this.Shell2_r1.setRotationPoint(0.01F, 5.2236F, -3.1223F);
        this.Shell.addChild(Shell2_r1);
        this.setRotateAngle(Shell2_r1, -0.0188F, 0.0F, 0.0F);
        this.Shell2_r1.cubeList.add(new ModelBox(Shell2_r1, 0, 0, -3.01F, -6.15F, -5.6F, 6, 6, 7, 0.0F, false));

        this.Shell4_r1 = new AdvancedModelRenderer(this);
        this.Shell4_r1.setRotationPoint(0.0F, 7.8919F, -13.0088F);
        this.Shell.addChild(Shell4_r1);
        this.setRotateAngle(Shell4_r1, -1.783F, 0.0F, 0.0F);
        this.Shell4_r1.cubeList.add(new ModelBox(Shell4_r1, 0, 24, -2.0F, -3.14F, -15.16F, 4, 5, 7, 0.01F, false));

        this.Shell6_r1 = new AdvancedModelRenderer(this);
        this.Shell6_r1.setRotationPoint(0.01F, -14.2057F, -23.1961F);
        this.Shell.addChild(Shell6_r1);
        this.setRotateAngle(Shell6_r1, 2.6887F, 0.0F, 0.0F);
        this.Shell6_r1.cubeList.add(new ModelBox(Shell6_r1, 0, 36, -1.51F, -0.52F, -23.26F, 3, 4, 6, 0.01F, false));

        this.Shell8_r1 = new AdvancedModelRenderer(this);
        this.Shell8_r1.setRotationPoint(0.01F, -40.2833F, 1.4465F);
        this.Shell.addChild(Shell8_r1);
        this.setRotateAngle(Shell8_r1, 1.2453F, 0.0F, 0.0F);
        this.Shell8_r1.cubeList.add(new ModelBox(Shell8_r1, 43, 40, -1.01F, 2.78F, -40.06F, 2, 5, 5, 0.0F, false));

        this.Shell7_r1 = new AdvancedModelRenderer(this);
        this.Shell7_r1.setRotationPoint(0.01F, -27.3416F, -8.6101F);
        this.Shell.addChild(Shell7_r1);
        this.setRotateAngle(Shell7_r1, 1.7335F, 0.0F, 0.0F);
        this.Shell7_r1.cubeList.add(new ModelBox(Shell7_r1, 30, 35, -1.51F, 0.48F, -27.26F, 3, 4, 6, 0.0F, false));

        this.Shell5_r1 = new AdvancedModelRenderer(this);
        this.Shell5_r1.setRotationPoint(0.01F, 0.5974F, -22.23F);
        this.Shell.addChild(Shell5_r1);
        this.setRotateAngle(Shell5_r1, -2.7194F, 0.0F, 0.0F);
        this.Shell5_r1.cubeList.add(new ModelBox(Shell5_r1, 16, 30, -2.01F, -2.12F, -18.91F, 4, 5, 6, 0.0F, false));

        this.Shell3_r1 = new AdvancedModelRenderer(this);
        this.Shell3_r1.setRotationPoint(0.0F, 7.22F, -5.9361F);
        this.Shell.addChild(Shell3_r1);
        this.setRotateAngle(Shell3_r1, -0.8915F, 0.0F, 0.0F);
        this.Shell3_r1.cubeList.add(new ModelBox(Shell3_r1, 19, 17, -2.5F, -5.25F, -10.5F, 5, 6, 7, 0.0F, false));

        this.Shell1_r1 = new AdvancedModelRenderer(this);
        this.Shell1_r1.setRotationPoint(0.5F, 5.5245F, -1.4556F);
        this.Shell.addChild(Shell1_r1);
        this.setRotateAngle(Shell1_r1, 0.5566F, 0.0F, 0.0F);
        this.Shell1_r1.cubeList.add(new ModelBox(Shell1_r1, 0, 13, -4.0F, -5.5F, 0.0F, 7, 5, 6, 0.0F, false));
        this.Shell1_r1.cubeList.add(new ModelBox(Shell1_r1, 30, 30, -4.0F, -6.5F, 0.0F, 7, 1, 4, 0.0F, false));

        this.Shell2_r2 = new AdvancedModelRenderer(this);
        this.Shell2_r2.setRotationPoint(0.5F, 1.9303F, 3.3747F);
        this.Shell.addChild(Shell2_r2);
        this.setRotateAngle(Shell2_r2, 1.4293F, 0.0F, 0.0F);
        this.Shell2_r2.cubeList.add(new ModelBox(Shell2_r2, 26, 0, -4.0F, -6.0F, 0.0F, 7, 6, 4, 0.04F, false));

        this.Shell3_r2 = new AdvancedModelRenderer(this);
        this.Shell3_r2.setRotationPoint(0.5F, 1.9303F, 3.3747F);
        this.Shell.addChild(Shell3_r2);
        this.setRotateAngle(Shell3_r2, 1.2547F, 0.0F, 0.0F);
        this.Shell3_r2.cubeList.add(new ModelBox(Shell3_r2, 36, 18, -4.0F, -1.0F, 0.0F, 7, 1, 4, 0.01F, false));

        this.cube_r1 = new AdvancedModelRenderer(this);
        this.cube_r1.setRotationPoint(-6.0F, -0.4724F, 0.6755F);
        this.Shell.addChild(cube_r1);
        this.setRotateAngle(cube_r1, 1.3526F, 0.0F, 0.0F);
        this.cube_r1.cubeList.add(new ModelBox(cube_r1, 0, 24, 0.5F, -1.0F, 1.175F, 2, 4, 0, 0.0F, false));
        this.cube_r1.cubeList.add(new ModelBox(cube_r1, 34, 10, 9.5F, -1.0F, 1.175F, 2, 4, 0, 0.0F, false));

        this.cube_r2 = new AdvancedModelRenderer(this);
        this.cube_r2.setRotationPoint(-6.0F, 1.7975F, 0.1723F);
        this.Shell.addChild(cube_r2);
        this.setRotateAngle(cube_r2, 1.0036F, 0.0F, 0.0F);
        this.cube_r2.cubeList.add(new ModelBox(cube_r2, 23, 0, 0.5F, -1.975F, 0.575F, 2, 4, 0, 0.0F, false));
        this.cube_r2.cubeList.add(new ModelBox(cube_r2, 30, 30, 9.5F, -1.975F, 0.575F, 2, 4, 0, 0.0F, false));

        this.cube_r3 = new AdvancedModelRenderer(this);
        this.cube_r3.setRotationPoint(-6.0F, 3.7406F, -2.2216F);
        this.Shell.addChild(cube_r3);
        this.setRotateAngle(cube_r3, 0.5672F, 0.0F, 0.0F);
        this.cube_r3.cubeList.add(new ModelBox(cube_r3, 0, 39, 0.75F, -1.925F, 0.5F, 2, 3, 0, 0.0F, false));
        this.cube_r3.cubeList.add(new ModelBox(cube_r3, 0, 46, 9.25F, -1.925F, 0.5F, 2, 3, 0, 0.0F, false));

        this.cube_r4 = new AdvancedModelRenderer(this);
        this.cube_r4.setRotationPoint(-6.0F, 2.7159F, -8.8496F);
        this.Shell.addChild(cube_r4);
        this.setRotateAngle(cube_r4, -0.48F, 0.0F, 0.0F);
        this.cube_r4.cubeList.add(new ModelBox(cube_r4, 36, 18, 1.75F, -1.875F, 0.275F, 2, 3, 0, 0.0F, false));
        this.cube_r4.cubeList.add(new ModelBox(cube_r4, 35, 45, 8.25F, -1.875F, 0.275F, 2, 3, 0, 0.0F, false));

        this.cube_r5 = new AdvancedModelRenderer(this);
        this.cube_r5.setRotationPoint(-6.0F, 0.0072F, -11.0754F);
        this.Shell.addChild(cube_r5);
        this.setRotateAngle(cube_r5, -0.9163F, 0.0F, 0.0F);
        this.cube_r5.cubeList.add(new ModelBox(cube_r5, 0, 36, 2.25F, -1.725F, 0.85F, 2, 3, 0, 0.0F, false));
        this.cube_r5.cubeList.add(new ModelBox(cube_r5, 44, 0, 7.75F, -1.725F, 0.85F, 2, 3, 0, 0.0F, false));

        this.cube_r6 = new AdvancedModelRenderer(this);
        this.cube_r6.setRotationPoint(-6.0F, -2.6017F, -10.4858F);
        this.Shell.addChild(cube_r6);
        this.setRotateAngle(cube_r6, -1.3963F, 0.0F, 0.0F);
        this.cube_r6.cubeList.add(new ModelBox(cube_r6, 15, 29, 2.25F, 0.0F, 0.5F, 2, 2, 0, 0.0F, false));
        this.cube_r6.cubeList.add(new ModelBox(cube_r6, 7, 46, 7.75F, 0.0F, 0.5F, 2, 2, 0, 0.0F, false));

        this.cube_r7 = new AdvancedModelRenderer(this);
        this.cube_r7.setRotationPoint(-6.0F, -6.5409F, -11.1803F);
        this.Shell.addChild(cube_r7);
        this.setRotateAngle(cube_r7, -1.789F, 0.0F, 0.0F);
        this.cube_r7.cubeList.add(new ModelBox(cube_r7, 4, 6, 3.05F, -0.825F, 1.45F, 1, 1, 0, 0.0F, false));
        this.cube_r7.cubeList.add(new ModelBox(cube_r7, 0, 14, 7.95F, -0.825F, 1.45F, 1, 1, 0, 0.0F, false));

        this.cube_r8 = new AdvancedModelRenderer(this);
        this.cube_r8.setRotationPoint(-6.0F, -9.1236F, -8.7385F);
        this.Shell.addChild(cube_r8);
        this.setRotateAngle(cube_r8, -2.5744F, 0.0F, 0.0F);
        this.cube_r8.cubeList.add(new ModelBox(cube_r8, 0, 1, 3.4F, -1.5F, 0.15F, 1, 1, 0, 0.0F, false));
        this.cube_r8.cubeList.add(new ModelBox(cube_r8, 4, 1, 7.6F, -1.5F, 0.15F, 1, 1, 0, 0.0F, false));

        this.cube_r9 = new AdvancedModelRenderer(this);
        this.cube_r9.setRotationPoint(-6.0F, -9.026F, -4.7042F);
        this.Shell.addChild(cube_r9);
        this.setRotateAngle(cube_r9, 3.0107F, 0.0F, 0.0F);
        this.cube_r9.cubeList.add(new ModelBox(cube_r9, 0, 0, 3.75F, -0.95F, 0.15F, 1, 1, 0, 0.0F, false));
        this.cube_r9.cubeList.add(new ModelBox(cube_r9, 4, 0, 7.25F, -0.95F, 0.15F, 1, 1, 0, 0.0F, false));

        this.cube_r10 = new AdvancedModelRenderer(this);
        this.cube_r10.setRotationPoint(-6.0F, -6.3286F, -2.7724F);
        this.Shell.addChild(cube_r10);
        this.setRotateAngle(cube_r10, 2.5831F, 0.0F, 0.0F);
        this.cube_r10.cubeList.add(new ModelBox(cube_r10, 4, 5, 4.0F, 0.175F, 0.5F, 1, 1, 0, 0.0F, false));
        this.cube_r10.cubeList.add(new ModelBox(cube_r10, 4, 13, 7.0F, 0.175F, 0.5F, 1, 1, 0, 0.0F, false));

        this.cube_r11 = new AdvancedModelRenderer(this);
        this.cube_r11.setRotationPoint(-6.0F, -4.2089F, 0.6198F);
        this.Shell.addChild(cube_r11);
        this.setRotateAngle(cube_r11, 1.9722F, 0.0F, 0.0F);
        this.cube_r11.cubeList.add(new ModelBox(cube_r11, 4, 4, 4.0F, -1.85F, 2.2F, 1, 1, 0, 0.0F, false));
        this.cube_r11.cubeList.add(new ModelBox(cube_r11, 0, 13, 7.0F, -1.85F, 2.2F, 1, 1, 0, 0.0F, false));

        this.Mantle = new AdvancedModelRenderer(this);
        this.Mantle.setRotationPoint(-0.5F, -2.874F, -1.8229F);
        this.Shell.addChild(Mantle);
        this.setRotateAngle(Mantle, 0.651F, 0.0F, 0.0F);
        this.Mantle.cubeList.add(new ModelBox(Mantle, 36, 10, -2.5F, 0.0F, 0.0F, 6, 4, 4, 0.0F, false));

        this.Siphon = new AdvancedModelRenderer(this);
        this.Siphon.setRotationPoint(0.5F, 4.0522F, 4.6023F);
        this.Mantle.addChild(Siphon);
        this.setRotateAngle(Siphon, -0.954F, 0.0F, 0.0F);
        this.Siphon.cubeList.add(new ModelBox(Siphon, 43, 24, -1.5F, -0.5F, -2.0F, 3, 1, 4, 0.0F, false));

        this.Mantle2 = new AdvancedModelRenderer(this);
        this.Mantle2.setRotationPoint(0.0F, -0.325F, 3.0F);
        this.Mantle.addChild(Mantle2);
        this.setRotateAngle(Mantle2, -0.3419F, 0.0F, 0.0F);
        this.Mantle2.cubeList.add(new ModelBox(Mantle2, 15, 43, -2.5F, 0.0F, 1.0F, 6, 4, 3, -0.01F, false));

        this.Tentacle1a = new AdvancedModelRenderer(this);
        this.Tentacle1a.setRotationPoint(-0.5F, 3.5F, 3.5F);
        this.Mantle2.addChild(Tentacle1a);
        this.Tentacle1a.cubeList.add(new ModelBox(Tentacle1a, 42, 50, -0.5F, -0.5F, 0.0F, 1, 1, 5, -0.01F, false));
        this.Tentacle1a.cubeList.add(new ModelBox(Tentacle1a, 38, 23, -1.0F, 0.0F, 0.0F, 2, 0, 5, 0.0F, false));

        this.Tentacle2a = new AdvancedModelRenderer(this);
        this.Tentacle2a.setRotationPoint(-1.5F, 3.0F, 3.5F);
        this.Mantle2.addChild(Tentacle2a);
        this.setRotateAngle(Tentacle2a, 0.0F, 0.0F, 0.0F);
        this.Tentacle2a.cubeList.add(new ModelBox(Tentacle2a, 48, 0, -0.5F, -0.5F, 0.0F, 1, 1, 5, -0.01F, false));
        this.Tentacle2a.cubeList.add(new ModelBox(Tentacle2a, 7, 36, -1.0F, 0.0F, 0.0F, 2, 0, 5, 0.0F, false));

        this.Tentacle3a = new AdvancedModelRenderer(this);
        this.Tentacle3a.setRotationPoint(-2.0F, 2.0F, 3.5F);
        this.Mantle2.addChild(Tentacle3a);
        this.Tentacle3a.cubeList.add(new ModelBox(Tentacle3a, 49, 51, -0.5F, -0.5F, 0.0F, 1, 1, 5, -0.01F, false));
        this.Tentacle3a.cubeList.add(new ModelBox(Tentacle3a, 18, 36, 0.0F, -1.0F, 0.0F, 0, 2, 5, 0.0F, false));

        this.Tentacle4a = new AdvancedModelRenderer(this);
        this.Tentacle4a.setRotationPoint(-1.5F, 1.0F, 3.5F);
        this.Mantle2.addChild(Tentacle4a);
        this.setRotateAngle(Tentacle4a, 0.0F, 0.0F, 0.0F);
        this.Tentacle4a.cubeList.add(new ModelBox(Tentacle4a, 47, 30, -0.5F, -0.5F, 0.0F, 1, 1, 5, -0.01F, false));
        this.Tentacle4a.cubeList.add(new ModelBox(Tentacle4a, 25, 10, -1.0F, 0.0F, 0.0F, 2, 0, 5, 0.0F, false));

        this.Tentacle5a = new AdvancedModelRenderer(this);
        this.Tentacle5a.setRotationPoint(-0.5F, 0.5F, 3.5F);
        this.Mantle2.addChild(Tentacle5a);
        this.Tentacle5a.cubeList.add(new ModelBox(Tentacle5a, 14, 50, -0.5F, -0.5F, 0.0F, 1, 1, 5, -0.01F, false));
        this.Tentacle5a.cubeList.add(new ModelBox(Tentacle5a, 37, 35, -1.0F, 0.0F, 0.0F, 2, 0, 5, 0.0F, false));

        this.Tentacle6a = new AdvancedModelRenderer(this);
        this.Tentacle6a.setRotationPoint(1.5F, 3.5F, 3.5F);
        this.Mantle2.addChild(Tentacle6a);
        this.Tentacle6a.cubeList.add(new ModelBox(Tentacle6a, 7, 47, -0.5F, -0.5F, 0.0F, 1, 1, 5, -0.01F, false));
        this.Tentacle6a.cubeList.add(new ModelBox(Tentacle6a, 10, 24, -1.0F, 0.0F, 0.0F, 2, 0, 5, 0.0F, false));

        this.Tentacle7a = new AdvancedModelRenderer(this);
        this.Tentacle7a.setRotationPoint(2.5F, 3.0F, 3.5F);
        this.Mantle2.addChild(Tentacle7a);
        this.setRotateAngle(Tentacle7a, 0.0F, 0.0F, 0.0F);
        this.Tentacle7a.cubeList.add(new ModelBox(Tentacle7a, 35, 46, -0.5F, -0.5F, 0.0F, 1, 1, 5, -0.01F, false));
        this.Tentacle7a.cubeList.add(new ModelBox(Tentacle7a, 21, 10, -1.0F, 0.0F, 0.0F, 2, 0, 5, 0.0F, false));

        this.Tentacle8a = new AdvancedModelRenderer(this);
        this.Tentacle8a.setRotationPoint(3.0F, 2.0F, 3.5F);
        this.Mantle2.addChild(Tentacle8a);
        this.Tentacle8a.cubeList.add(new ModelBox(Tentacle8a, 21, 51, -0.5F, -0.5F, 0.0F, 1, 1, 5, -0.01F, false));
        this.Tentacle8a.cubeList.add(new ModelBox(Tentacle8a, 24, 10, 0.0F, -1.0F, 0.0F, 0, 2, 5, 0.0F, false));

        this.Tentacle9a = new AdvancedModelRenderer(this);
        this.Tentacle9a.setRotationPoint(2.5F, 1.0F, 3.5F);
        this.Mantle2.addChild(Tentacle9a);
        this.setRotateAngle(Tentacle9a, 0.0F, 0.0F, 0.0F);
        this.Tentacle9a.cubeList.add(new ModelBox(Tentacle9a, 0, 46, -0.5F, -0.5F, 0.0F, 1, 1, 5, -0.01F, false));
        this.Tentacle9a.cubeList.add(new ModelBox(Tentacle9a, 15, 13, -1.0F, 0.0F, 0.0F, 2, 0, 5, 0.0F, false));

        this.Tentacle10a = new AdvancedModelRenderer(this);
        this.Tentacle10a.setRotationPoint(1.5F, 0.5F, 3.5F);
        this.Mantle2.addChild(Tentacle10a);
        this.Tentacle10a.cubeList.add(new ModelBox(Tentacle10a, 28, 45, -0.5F, -0.5F, 0.0F, 1, 1, 5, -0.01F, false));
        this.Tentacle10a.cubeList.add(new ModelBox(Tentacle10a, 14, 0, -1.0F, 0.0F, 0.0F, 2, 0, 5, 0.0F, false));

        this.eyeRight = new AdvancedModelRenderer(this);
        this.eyeRight.setRotationPoint(3.5F, 1.35F, 3.5F);
        this.Mantle.addChild(eyeRight);
        this.eyeRight.cubeList.add(new ModelBox(eyeRight, 0, 13, -0.5F, -1.0F, -1.0F, 1, 2, 2, 0.0F, false));
        this.eyeRight.cubeList.add(new ModelBox(eyeRight, 19, 5, -0.475F, -0.5F, -0.5F, 1, 1, 1, 0.0F, false));

        this.eyeLeft = new AdvancedModelRenderer(this);
        this.eyeLeft.setRotationPoint(-2.5F, 1.35F, 3.5F);
        this.Mantle.addChild(eyeLeft);
        this.eyeLeft.cubeList.add(new ModelBox(eyeLeft, 0, 0, -0.5F, -1.0F, -1.0F, 1, 2, 2, 0.0F, false));
        this.eyeLeft.cubeList.add(new ModelBox(eyeLeft, 0, 17, -0.525F, -0.5F, -0.5F, 1, 1, 1, 0.0F, false));
        updateDefaultPose();
    }

    public void renderAll(float f) {
        this.resetToDefaultPose();
        this.root.offsetY = -1F;
        this.root.render(0.08f);
    }

    public void setRotateAngle(ModelRenderer modelRenderer, float x, float y, float z) {
        modelRenderer.rotateAngleX = x;
        modelRenderer.rotateAngleY = y;
        modelRenderer.rotateAngleZ = z;
    }

}
