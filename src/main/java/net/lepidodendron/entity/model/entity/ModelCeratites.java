package net.lepidodendron.entity.model.entity;

import net.ilexiconn.llibrary.client.model.ModelAnimator;
import net.ilexiconn.llibrary.client.model.tools.AdvancedModelRenderer;
import net.ilexiconn.llibrary.server.animation.IAnimatedEntity;
import net.lepidodendron.entity.EntityPrehistoricFloraAmmonite_Ceratites;
import net.lepidodendron.entity.model.ModelBasePalaeopedia;
import net.minecraft.client.model.ModelBox;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;

public class ModelCeratites extends ModelBasePalaeopedia {
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

    private ModelAnimator animator;

    public ModelCeratites() {
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
        animator = ModelAnimator.create();
    }

    @Override
    public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        animate((IAnimatedEntity) entity, f, f1, f2, f3, f4, f5);
        this.root.render(f5);
    }

    public void renderStaticWall(float f) {
        this.root.rotateAngleY = (float) Math.toRadians(90);
        this.root.offsetY = -0.2F;
        this.root.offsetX = -0.15F;
        this.root.offsetZ = -0.4F;
        this.root.render(0.01F);
        resetToDefaultPose();
    }

    public void renderStaticFloor(float f) {
        this.root.offsetZ = -0.1F;
        this.root.offsetY = -0.03F;
        this.root.offsetX = -0.02F;
        this.root.render(0.01F);
        resetToDefaultPose();
    }
    @Override
    public void renderStaticBook(float f) {
        //Rotations, positions and sizing:
        this.root.offsetY = -1.2F;
        this.root.offsetX = -0.4F;
        this.root.offsetZ = 2.0F;
        this.root.rotateAngleY = (float)Math.toRadians(120);
        this.root.rotateAngleX = (float)Math.toRadians(0);
        this.root.rotateAngleZ = (float)Math.toRadians(0);
        this.root.scaleChildren = true;
        float scaler = 2.0F;
        this.root.setScale(scaler, scaler, scaler);
        //Start of pose:
        this.setRotateAngle(root, -0.6F, 0.8F, -0.2F);
        //End of pose, now render the model:
        this.root.render(f);
        //Reset rotations, positions and sizing:
        this.root.setScale(1.0F, 1.0F, 1.0F);
        this.root.scaleChildren = false;
        resetToDefaultPose();

    }

    public void setRotateAngle(AdvancedModelRenderer AdvancedAdvancedModelRenderer, float x, float y, float z) {
        AdvancedAdvancedModelRenderer.rotateAngleX = x;
        AdvancedAdvancedModelRenderer.rotateAngleY = y;
        AdvancedAdvancedModelRenderer.rotateAngleZ = z;
    }


    @Override
    public void setLivingAnimations(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime) {
        super.setLivingAnimations(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime);
        this.resetToDefaultPose();
        EntityPrehistoricFloraAmmonite_Ceratites ee = (EntityPrehistoricFloraAmmonite_Ceratites) entitylivingbaseIn;

            if (ee.getIsFast()) { //Running
                animRunning(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime);
            } else {
                animWalking(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime);
            }
            

    }

    public void animWalking(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime) {
        EntityPrehistoricFloraAmmonite_Ceratites entity = (EntityPrehistoricFloraAmmonite_Ceratites) entitylivingbaseIn;
        int animCycle = 80;
        double tickAnim = (entity.ticksExisted + entity.getTickOffset()) - (int) (Math.floor((double) (entity.ticksExisted + entity.getTickOffset()) / (double) animCycle) * (double) animCycle) + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;
        this.setRotateAngle(Mantle, Mantle.rotateAngleX + (float) Math.toRadians(-2.5+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180+60))*-2.5), Mantle.rotateAngleY + (float) Math.toRadians(0), Mantle.rotateAngleZ + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*90))*-2.5));
        this.Mantle.setScale((float)(1+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360))*0.01),(float)(1+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360))*0.01),(float)(1.1+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180))*-0.01));



        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 14.25+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180+60))*2.5 + (((tickAnim - 0) / 10) * (8.25+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180+60))*2.5-(14.25+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180+60))*2.5)));
            yy = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 28) {
            xx = 8.25+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180+60))*2.5 + (((tickAnim - 10) / 18) * (14.25+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180+60))*2.5-(8.25+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180+60))*2.5)));
            yy = 0 + (((tickAnim - 10) / 18) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 18) * (0-(0)));
        }
        else if (tickAnim >= 28 && tickAnim < 50) {
            xx = 14.25+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180+60))*2.5 + (((tickAnim - 28) / 22) * (8.25+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180+60))*2.5-(14.25+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180+60))*2.5)));
            yy = 0 + (((tickAnim - 28) / 22) * (0-(0)));
            zz = 0 + (((tickAnim - 28) / 22) * (0-(0)));
        }
        else if (tickAnim >= 50 && tickAnim < 80) {
            xx = 8.25+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180+60))*2.5 + (((tickAnim - 50) / 30) * (14.25+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180+60))*2.5-(8.25+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180+60))*2.5)));
            yy = 0 + (((tickAnim - 50) / 30) * (0-(0)));
            zz = 0 + (((tickAnim - 50) / 30) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Siphon, Siphon.rotateAngleX + (float) Math.toRadians(xx), Siphon.rotateAngleY + (float) Math.toRadians(yy), Siphon.rotateAngleZ + (float) Math.toRadians(zz));

        this.Siphon.setScale((float)(1+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180-30))*0.05),(float)(1+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180-30))*0.1),(float)(1+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180-30))*-0.2));


        this.setRotateAngle(Mantle2, Mantle2.rotateAngleX + (float) Math.toRadians(0), Mantle2.rotateAngleY + (float) Math.toRadians(0), Mantle2.rotateAngleZ + (float) Math.toRadians(0));
        this.Mantle2.setScale((float)(0.95+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360-60))*0.01),(float)(0.95+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360-60))*0.01),(float)(0.95+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180))*-0.01));


        this.setRotateAngle(Tentacle1a, Tentacle1a.rotateAngleX + (float) Math.toRadians(5+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360))*-5), Tentacle1a.rotateAngleY + (float) Math.toRadians(2.5+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360))*-2.5), Tentacle1a.rotateAngleZ + (float) Math.toRadians(5));
        this.Tentacle1a.setScale((float)1,(float)1,(float)(1.1+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360+30))*-0.1));


        this.setRotateAngle(Tentacle2a, Tentacle2a.rotateAngleX + (float) Math.toRadians(5+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360))*-5), Tentacle2a.rotateAngleY + (float) Math.toRadians(0), Tentacle2a.rotateAngleZ + (float) Math.toRadians(45));
        this.Tentacle2a.setScale((float)1,(float)1,(float)(1.1+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360+30))*-0.1));


        this.setRotateAngle(Tentacle3a, Tentacle3a.rotateAngleX + (float) Math.toRadians(0), Tentacle3a.rotateAngleY + (float) Math.toRadians(5+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360))*-5), Tentacle3a.rotateAngleZ + (float) Math.toRadians(0));
        this.Tentacle3a.setScale((float)1,(float)1,(float)(1.1+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360+30))*-0.1));


        this.setRotateAngle(Tentacle4a, Tentacle4a.rotateAngleX + (float) Math.toRadians(-5+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360))*5), Tentacle4a.rotateAngleY + (float) Math.toRadians(0), Tentacle4a.rotateAngleZ + (float) Math.toRadians(-45));
        this.Tentacle4a.setScale((float)1,(float)1,(float)(1.1+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360+30))*-0.1));


        this.setRotateAngle(Tentacle5a, Tentacle5a.rotateAngleX + (float) Math.toRadians(-5+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360))*5), Tentacle5a.rotateAngleY + (float) Math.toRadians(2.5+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360))*-2.5), Tentacle5a.rotateAngleZ + (float) Math.toRadians(-5));
        this.Tentacle5a.setScale((float)1,(float)1,(float)(1.1+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360+30))*-0.1));


        this.setRotateAngle(Tentacle6a, Tentacle6a.rotateAngleX + (float) Math.toRadians(5+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360))*-5), Tentacle6a.rotateAngleY + (float) Math.toRadians(-2.5+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360))*2.5), Tentacle6a.rotateAngleZ + (float) Math.toRadians(-5));
        this.Tentacle6a.setScale((float)1,(float)1,(float)(1.1+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360+30))*-0.1));


        this.setRotateAngle(Tentacle7a, Tentacle7a.rotateAngleX + (float) Math.toRadians(5+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360))*-5), Tentacle7a.rotateAngleY + (float) Math.toRadians(0), Tentacle7a.rotateAngleZ + (float) Math.toRadians(-45));
        this.Tentacle7a.setScale((float)1,(float)1,(float)(1.1+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360+30))*-0.1));


        this.setRotateAngle(Tentacle8a, Tentacle8a.rotateAngleX + (float) Math.toRadians(0), Tentacle8a.rotateAngleY + (float) Math.toRadians(-5+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360))*5), Tentacle8a.rotateAngleZ + (float) Math.toRadians(0));
        this.Tentacle8a.setScale((float)1,(float)1,(float)(1.1+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360+30))*-0.1));


        this.setRotateAngle(Tentacle9a, Tentacle9a.rotateAngleX + (float) Math.toRadians(-5+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360))*5), Tentacle9a.rotateAngleY + (float) Math.toRadians(0), Tentacle9a.rotateAngleZ + (float) Math.toRadians(45));
        this.Tentacle9a.setScale((float)1,(float)1,(float)(1.1+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360+30))*-0.1));


        this.setRotateAngle(Tentacle10a, Tentacle10a.rotateAngleX + (float) Math.toRadians(-5+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360))*5), Tentacle10a.rotateAngleY + (float) Math.toRadians(-2.5+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360))*2.5), Tentacle10a.rotateAngleZ + (float) Math.toRadians(5));
        this.Tentacle10a.setScale((float)1,(float)1,(float)(1.1+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360+30))*-0.1));


        this.setRotateAngle(Shell, Shell.rotateAngleX + (float) Math.toRadians(-5+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180))*5), Shell.rotateAngleY + (float) Math.toRadians(0), Shell.rotateAngleZ + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*90))*5));
        this.Shell.rotationPointX = this.Shell.rotationPointX + (float)(0);
        this.Shell.rotationPointY = this.Shell.rotationPointY - (float)(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180-90))*-0.5);
        this.Shell.rotationPointZ = this.Shell.rotationPointZ + (float)(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180-60))*1);

    }
    public void animRunning(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime) {
        EntityPrehistoricFloraAmmonite_Ceratites entity = (EntityPrehistoricFloraAmmonite_Ceratites) entitylivingbaseIn;
        int animCycle = 80;
        double tickAnim = (entity.ticksExisted + entity.getTickOffset()) - (int) (Math.floor((double) (entity.ticksExisted + entity.getTickOffset()) / (double) animCycle) * (double) animCycle) + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;

        if (tickAnim >= 0 && tickAnim < 30) {
            xx = -5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360+60))*-5 + (((tickAnim - 0) / 30) * (-5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360+60))*-5-(-5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360+60))*-5)));
            yy = 0 + (((tickAnim - 0) / 30) * (0-(0)));
            zz = Math.sin((Math.PI/180)*(((double)tickAnim/20)*90))*2.5 + (((tickAnim - 0) / 30) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*90))*2.5-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*90))*2.5)));
        }
        else if (tickAnim >= 30 && tickAnim < 40) {
            xx = -5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360+60))*-5 + (((tickAnim - 30) / 10) * (-10+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180+60))*-2.5-(-5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360+60))*-5)));
            yy = 0 + (((tickAnim - 30) / 10) * (0-(0)));
            zz = Math.sin((Math.PI/180)*(((double)tickAnim/20)*90))*2.5 + (((tickAnim - 30) / 10) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*90))*-2.5-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*90))*2.5)));
        }
        else if (tickAnim >= 40 && tickAnim < 70) {
            xx = -10+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180+60))*-2.5 + (((tickAnim - 40) / 30) * (-10+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180+60))*-2.5-(-10+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180+60))*-2.5)));
            yy = 0 + (((tickAnim - 40) / 30) * (0-(0)));
            zz = Math.sin((Math.PI/180)*(((double)tickAnim/20)*90))*-2.5 + (((tickAnim - 40) / 30) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*90))*-2.5-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*90))*-2.5)));
        }
        else if (tickAnim >= 70 && tickAnim < 80) {
            xx = -10+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180+60))*-2.5 + (((tickAnim - 70) / 10) * (-5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360+60))*-5-(-10+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180+60))*-2.5)));
            yy = 0 + (((tickAnim - 70) / 10) * (0-(0)));
            zz = Math.sin((Math.PI/180)*(((double)tickAnim/20)*90))*-2.5 + (((tickAnim - 70) / 10) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*90))*2.5-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*90))*-2.5)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Mantle, Mantle.rotateAngleX + (float) Math.toRadians(xx), Mantle.rotateAngleY + (float) Math.toRadians(yy), Mantle.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 30) {
            xx = 1+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360+120))*-0.05 + (((tickAnim - 0) / 30) * (1+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360+120))*-0.05-(1+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360+120))*-0.05)));
            yy = 1+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360+120))*-0.05 + (((tickAnim - 0) / 30) * (1+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360+120))*-0.05-(1+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360+120))*-0.05)));
            zz = 1.3+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360+120))*0.1 + (((tickAnim - 0) / 30) * (1.3+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360+120))*0.1-(1.3+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360+120))*0.1)));
        }
        else if (tickAnim >= 30 && tickAnim < 40) {
            xx = 1+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360+120))*-0.05 + (((tickAnim - 30) / 10) * (1+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360))*0.01-(1+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360+120))*-0.05)));
            yy = 1+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360+120))*-0.05 + (((tickAnim - 30) / 10) * (1+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360))*0.05-(1+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360+120))*-0.05)));
            zz = 1.3+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360+120))*0.1 + (((tickAnim - 30) / 10) * (1.1+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180))*-0.1-(1.3+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360+120))*0.1)));
        }
        else if (tickAnim >= 40 && tickAnim < 70) {
            xx = 1+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360))*0.01 + (((tickAnim - 40) / 30) * (1+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360))*0.01-(1+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360))*0.01)));
            yy = 1+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360))*0.05 + (((tickAnim - 40) / 30) * (1+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360))*0.05-(1+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360))*0.05)));
            zz = 1.1+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180))*-0.1 + (((tickAnim - 40) / 30) * (1.1+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180))*-0.1-(1.1+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180))*-0.1)));
        }
        else if (tickAnim >= 70 && tickAnim < 80) {
            xx = 1+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360))*0.01 + (((tickAnim - 70) / 10) * (1+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360+120))*-0.05-(1+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360))*0.01)));
            yy = 1+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360))*0.05 + (((tickAnim - 70) / 10) * (1+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360+120))*-0.05-(1+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360))*0.05)));
            zz = 1.1+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180))*-0.1 + (((tickAnim - 70) / 10) * (1.3+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360+120))*0.1-(1.1+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180))*-0.1)));
        }
        else {
            xx = 1;
            yy = 1;
            zz = 1;
        }
        this.Mantle.setScale((float)xx, (float)yy, (float)zz);




        if (tickAnim >= 0 && tickAnim < 30) {
            xx = 25.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360-120))*-1 + (((tickAnim - 0) / 30) * (24.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360-120))*-9.5-(25.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360-120))*-1)));
            yy = 0 + (((tickAnim - 0) / 30) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 30) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 40) {
            xx = 24.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360-120))*-9.5 + (((tickAnim - 30) / 10) * (28.75+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180+60))*2.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180))*-5-(24.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360-120))*-9.5)));
            yy = 0 + (((tickAnim - 30) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 30) / 10) * (0-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 70) {
            xx = 28.75+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180+60))*2.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180))*-5 + (((tickAnim - 40) / 30) * (27.75+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180+60))*2.5-(28.75+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180+60))*2.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180))*-5)));
            yy = 0 + (((tickAnim - 40) / 30) * (0-(0)));
            zz = 0 + (((tickAnim - 40) / 30) * (0-(0)));
        }
        else if (tickAnim >= 70 && tickAnim < 80) {
            xx = 27.75+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180+60))*2.5 + (((tickAnim - 70) / 10) * (25.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360-120))*-1-(27.75+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180+60))*2.5)));
            yy = 0 + (((tickAnim - 70) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 70) / 10) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Siphon, Siphon.rotateAngleX + (float) Math.toRadians(xx), Siphon.rotateAngleY + (float) Math.toRadians(yy), Siphon.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 30) {
            xx = 0 + (((tickAnim - 0) / 30) * (0-(0)));
            yy = 0.2 + (((tickAnim - 0) / 30) * (0.2-(0.2)));
            zz = -0.975 + (((tickAnim - 0) / 30) * (-0.975-(-0.975)));
        }
        else if (tickAnim >= 30 && tickAnim < 40) {
            xx = 0 + (((tickAnim - 30) / 10) * (0-(0)));
            yy = 0.2 + (((tickAnim - 30) / 10) * (0.8-(0.2)));
            zz = -0.975 + (((tickAnim - 30) / 10) * (-2.395-(-0.975)));
        }
        else if (tickAnim >= 40 && tickAnim < 54) {
            xx = 0 + (((tickAnim - 40) / 14) * (0-(0)));
            yy = 0.8 + (((tickAnim - 40) / 14) * (0.73-(0.8)));
            zz = -2.395 + (((tickAnim - 40) / 14) * (-1.91-(-2.395)));
        }
        else if (tickAnim >= 54 && tickAnim < 70) {
            xx = 0 + (((tickAnim - 54) / 16) * (0-(0)));
            yy = 0.73 + (((tickAnim - 54) / 16) * (0.65-(0.73)));
            zz = -1.91 + (((tickAnim - 54) / 16) * (-2.75-(-1.91)));
        }
        else if (tickAnim >= 70 && tickAnim < 80) {
            xx = 0 + (((tickAnim - 70) / 10) * (0-(0)));
            yy = 0.65 + (((tickAnim - 70) / 10) * (0.2-(0.65)));
            zz = -2.75 + (((tickAnim - 70) / 10) * (-0.975-(-2.75)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.Siphon.rotationPointX = this.Siphon.rotationPointX + (float)(xx);
        this.Siphon.rotationPointY = this.Siphon.rotationPointY - (float)(yy);
        this.Siphon.rotationPointZ = this.Siphon.rotationPointZ + (float)(zz);


        if (tickAnim >= 0 && tickAnim < 30) {
            xx = 1+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360+180))*-0.05 + (((tickAnim - 0) / 30) * (1+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360+180))*-0.05-(1+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360+180))*-0.05)));
            yy = 1+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360+180))*-0.2 + (((tickAnim - 0) / 30) * (1+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360+180))*-0.2-(1+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360+180))*-0.2)));
            zz = 1+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360+240))*0.2 + (((tickAnim - 0) / 30) * (1+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360+240))*0.2-(1+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360+240))*0.2)));
        }
        else if (tickAnim >= 30 && tickAnim < 40) {
            xx = 1+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360+180))*-0.05 + (((tickAnim - 30) / 10) * (1+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180-30))*0.05-(1+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360+180))*-0.05)));
            yy = 1+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360+180))*-0.2 + (((tickAnim - 30) / 10) * (0.9+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180-30))*0.1-(1+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360+180))*-0.2)));
            zz = 1+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360+240))*0.2 + (((tickAnim - 30) / 10) * (1.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180-30))*-0.2-(1+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360+240))*0.2)));
        }
        else if (tickAnim >= 40 && tickAnim < 70) {
            xx = 1+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180-30))*0.05 + (((tickAnim - 40) / 30) * (1+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180-30))*0.05-(1+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180-30))*0.05)));
            yy = 0.9+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180-30))*0.1 + (((tickAnim - 40) / 30) * (0.9+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180-30))*0.1-(0.9+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180-30))*0.1)));
            zz = 1.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180-30))*-0.2 + (((tickAnim - 40) / 30) * (1.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180-30))*-0.2-(1.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180-30))*-0.2)));
        }
        else if (tickAnim >= 70 && tickAnim < 80) {
            xx = 1+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180-30))*0.05 + (((tickAnim - 70) / 10) * (1+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360+180))*-0.05-(1+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180-30))*0.05)));
            yy = 0.9+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180-30))*0.1 + (((tickAnim - 70) / 10) * (1+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360+180))*-0.2-(0.9+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180-30))*0.1)));
            zz = 1.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180-30))*-0.2 + (((tickAnim - 70) / 10) * (1+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360+240))*0.2-(1.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180-30))*-0.2)));
        }
        else {
            xx = 1;
            yy = 1;
            zz = 1;
        }
        this.Siphon.setScale((float)xx, (float)yy, (float)zz);




        if (tickAnim >= 0 && tickAnim < 30) {
            xx = 0 + (((tickAnim - 0) / 30) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 30) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 30) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 40) {
            xx = 0 + (((tickAnim - 30) / 10) * (0-(0)));
            yy = 0 + (((tickAnim - 30) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 30) / 10) * (0-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 70) {
            xx = 0 + (((tickAnim - 40) / 30) * (0-(0)));
            yy = 0 + (((tickAnim - 40) / 30) * (0-(0)));
            zz = 0 + (((tickAnim - 40) / 30) * (0-(0)));
        }
        else if (tickAnim >= 70 && tickAnim < 80) {
            xx = 0 + (((tickAnim - 70) / 10) * (0-(0)));
            yy = 0 + (((tickAnim - 70) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 70) / 10) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Mantle2, Mantle2.rotateAngleX + (float) Math.toRadians(xx), Mantle2.rotateAngleY + (float) Math.toRadians(yy), Mantle2.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 30) {
            xx = 0.95+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360+60))*-0.05 + (((tickAnim - 0) / 30) * (0.95+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360+60))*-0.05-(0.95+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360+60))*-0.05)));
            yy = 0.95+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360+60))*-0.05 + (((tickAnim - 0) / 30) * (0.95+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360+60))*-0.05-(0.95+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360+60))*-0.05)));
            zz = 0.95+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360+60))*0.01 + (((tickAnim - 0) / 30) * (1.2+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360+60))*0.01-(0.95+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360+60))*0.01)));
        }
        else if (tickAnim >= 30 && tickAnim < 40) {
            xx = 0.95+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360+60))*-0.05 + (((tickAnim - 30) / 10) * (0.95+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360-60))*0.01-(0.95+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360+60))*-0.05)));
            yy = 0.95+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360+60))*-0.05 + (((tickAnim - 30) / 10) * (0.95+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360-60))*0.05-(0.95+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360+60))*-0.05)));
            zz = 1.2+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360+60))*0.01 + (((tickAnim - 30) / 10) * (0.95+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180))*-0.01-(1.2+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360+60))*0.01)));
        }
        else if (tickAnim >= 40 && tickAnim < 70) {
            xx = 0.95+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360-60))*0.01 + (((tickAnim - 40) / 30) * (0.95+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360-60))*0.05-(0.95+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360-60))*0.01)));
            yy = 0.95+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360-60))*0.05 + (((tickAnim - 40) / 30) * (0.95+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360-60))*0.05-(0.95+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360-60))*0.05)));
            zz = 0.95+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180))*-0.01 + (((tickAnim - 40) / 30) * (0.95+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180))*-0.01-(0.95+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180))*-0.01)));
        }
        else if (tickAnim >= 70 && tickAnim < 80) {
            xx = 0.95+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360-60))*0.05 + (((tickAnim - 70) / 10) * (0.95+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360+60))*-0.05-(0.95+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360-60))*0.05)));
            yy = 0.95+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360-60))*0.05 + (((tickAnim - 70) / 10) * (0.95+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360+60))*-0.05-(0.95+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360-60))*0.05)));
            zz = 0.95+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180))*-0.01 + (((tickAnim - 70) / 10) * (0.95+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360+60))*0.01-(0.95+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180))*-0.01)));
        }
        else {
            xx = 1;
            yy = 1;
            zz = 1;
        }
        this.Mantle2.setScale((float)xx, (float)yy, (float)zz);




        if (tickAnim >= 0 && tickAnim < 30) {
            xx = -20+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360+60))*30 + (((tickAnim - 0) / 30) * (-20+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360+60))*30-(-20+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360+60))*30)));
            yy = Math.sin((Math.PI/180)*(((double)tickAnim/20)*360+60))*5 + (((tickAnim - 0) / 30) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*360+60))*5-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*360+60))*5)));
            zz = 10 + (((tickAnim - 0) / 30) * (10-(10)));
        }
        else if (tickAnim >= 30 && tickAnim < 40) {
            xx = -20+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360+60))*30 + (((tickAnim - 30) / 10) * (5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360))*-5-(-20+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360+60))*30)));
            yy = Math.sin((Math.PI/180)*(((double)tickAnim/20)*360+60))*5 + (((tickAnim - 30) / 10) * (2.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360))*-2.5-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*360+60))*5)));
            zz = 10 + (((tickAnim - 30) / 10) * (5-(10)));
        }
        else if (tickAnim >= 40 && tickAnim < 70) {
            xx = 5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360))*-5 + (((tickAnim - 40) / 30) * (5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360))*-5-(5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360))*-5)));
            yy = 2.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360))*-2.5 + (((tickAnim - 40) / 30) * (2.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360))*-2.5-(2.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360))*-2.5)));
            zz = 5 + (((tickAnim - 40) / 30) * (5-(5)));
        }
        else if (tickAnim >= 70 && tickAnim < 80) {
            xx = 5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360))*-5 + (((tickAnim - 70) / 10) * (-20+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360+60))*30-(5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360))*-5)));
            yy = 2.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360))*-2.5 + (((tickAnim - 70) / 10) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*360+60))*5-(2.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360))*-2.5)));
            zz = 5 + (((tickAnim - 70) / 10) * (10-(5)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Tentacle1a, Tentacle1a.rotateAngleX + (float) Math.toRadians(xx), Tentacle1a.rotateAngleY + (float) Math.toRadians(yy), Tentacle1a.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 30) {
            xx = 1+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360))*-0.3 + (((tickAnim - 0) / 30) * (1+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360))*-0.3-(1+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360))*-0.3)));
            yy = 1 + (((tickAnim - 0) / 30) * (1-(1)));
            zz = 1.1+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360+60))*0.1 + (((tickAnim - 0) / 30) * (1.1+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360+60))*0.1-(1.1+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360+60))*0.1)));
        }
        else if (tickAnim >= 30 && tickAnim < 40) {
            xx = 1+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360))*-0.3 + (((tickAnim - 30) / 10) * (1-(1+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360))*-0.3)));
            yy = 1 + (((tickAnim - 30) / 10) * (1-(1)));
            zz = 1.1+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360+60))*0.1 + (((tickAnim - 30) / 10) * (1.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360+30))*-0.1-(1.1+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360+60))*0.1)));
        }
        else if (tickAnim >= 40 && tickAnim < 70) {
            xx = 1 + (((tickAnim - 40) / 30) * (1-(1)));
            yy = 1 + (((tickAnim - 40) / 30) * (1-(1)));
            zz = 1.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360+30))*-0.1 + (((tickAnim - 40) / 30) * (1.1+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360+30))*-0.1-(1.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360+30))*-0.1)));
        }
        else if (tickAnim >= 70 && tickAnim < 80) {
            xx = 1 + (((tickAnim - 70) / 10) * (1+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360))*-0.3-(1)));
            yy = 1 + (((tickAnim - 70) / 10) * (1-(1)));
            zz = 1.1+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360+30))*-0.1 + (((tickAnim - 70) / 10) * (1.1+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360+60))*0.1-(1.1+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360+30))*-0.1)));
        }
        else {
            xx = 1;
            yy = 1;
            zz = 1;
        }
        this.Tentacle1a.setScale((float)xx, (float)yy, (float)zz);




        if (tickAnim >= 0 && tickAnim < 30) {
            xx = -20+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360+60))*30 + (((tickAnim - 0) / 30) * (-20+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360+60))*30-(-20+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360+60))*30)));
            yy = 0 + (((tickAnim - 0) / 30) * (0-(0)));
            zz = 45 + (((tickAnim - 0) / 30) * (45-(45)));
        }
        else if (tickAnim >= 30 && tickAnim < 40) {
            xx = -20+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360+60))*30 + (((tickAnim - 30) / 10) * (5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360))*-5-(-20+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360+60))*30)));
            yy = 0 + (((tickAnim - 30) / 10) * (0-(0)));
            zz = 45 + (((tickAnim - 30) / 10) * (45-(45)));
        }
        else if (tickAnim >= 40 && tickAnim < 70) {
            xx = 5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360))*-5 + (((tickAnim - 40) / 30) * (5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360))*-5-(5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360))*-5)));
            yy = 0 + (((tickAnim - 40) / 30) * (0-(0)));
            zz = 45 + (((tickAnim - 40) / 30) * (45-(45)));
        }
        else if (tickAnim >= 70 && tickAnim < 80) {
            xx = 5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360))*-5 + (((tickAnim - 70) / 10) * (-20+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360+60))*30-(5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360))*-5)));
            yy = 0 + (((tickAnim - 70) / 10) * (0-(0)));
            zz = 45 + (((tickAnim - 70) / 10) * (45-(45)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Tentacle2a, Tentacle2a.rotateAngleX + (float) Math.toRadians(xx), Tentacle2a.rotateAngleY + (float) Math.toRadians(yy), Tentacle2a.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 30) {
            xx = 1+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360))*-0.3 + (((tickAnim - 0) / 30) * (1+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360))*-0.3-(1+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360))*-0.3)));
            yy = 1 + (((tickAnim - 0) / 30) * (1-(1)));
            zz = 1.1+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360+60))*0.1 + (((tickAnim - 0) / 30) * (1.1+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360+60))*0.1-(1.1+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360+60))*0.1)));
        }
        else if (tickAnim >= 30 && tickAnim < 40) {
            xx = 1+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360))*-0.3 + (((tickAnim - 30) / 10) * (1-(1+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360))*-0.3)));
            yy = 1 + (((tickAnim - 30) / 10) * (1-(1)));
            zz = 1.1+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360+60))*0.1 + (((tickAnim - 30) / 10) * (1.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360+30))*-0.1-(1.1+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360+60))*0.1)));
        }
        else if (tickAnim >= 40 && tickAnim < 70) {
            xx = 1 + (((tickAnim - 40) / 30) * (1-(1)));
            yy = 1 + (((tickAnim - 40) / 30) * (1-(1)));
            zz = 1.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360+30))*-0.1 + (((tickAnim - 40) / 30) * (1.1+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360+30))*-0.1-(1.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360+30))*-0.1)));
        }
        else if (tickAnim >= 70 && tickAnim < 80) {
            xx = 1 + (((tickAnim - 70) / 10) * (1+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360))*-0.3-(1)));
            yy = 1 + (((tickAnim - 70) / 10) * (1-(1)));
            zz = 1.1+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360+30))*-0.1 + (((tickAnim - 70) / 10) * (1.1+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360+60))*0.1-(1.1+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360+30))*-0.1)));
        }
        else {
            xx = 1;
            yy = 1;
            zz = 1;
        }
        this.Tentacle2a.setScale((float)xx, (float)yy, (float)zz);




        if (tickAnim >= 0 && tickAnim < 30) {
            xx = 0 + (((tickAnim - 0) / 30) * (0-(0)));
            yy = -20+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360+60))*30 + (((tickAnim - 0) / 30) * (-20+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360+60))*30-(-20+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360+60))*30)));
            zz = 0 + (((tickAnim - 0) / 30) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 40) {
            xx = 0 + (((tickAnim - 30) / 10) * (0-(0)));
            yy = -20+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360+60))*30 + (((tickAnim - 30) / 10) * (5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360))*-5-(-20+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360+60))*30)));
            zz = 0 + (((tickAnim - 30) / 10) * (0-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 70) {
            xx = 0 + (((tickAnim - 40) / 30) * (0-(0)));
            yy = 5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360))*-5 + (((tickAnim - 40) / 30) * (5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360))*-5-(5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360))*-5)));
            zz = 0 + (((tickAnim - 40) / 30) * (0-(0)));
        }
        else if (tickAnim >= 70 && tickAnim < 80) {
            xx = 0 + (((tickAnim - 70) / 10) * (0-(0)));
            yy = 5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360))*-5 + (((tickAnim - 70) / 10) * (-20+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360+60))*30-(5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360))*-5)));
            zz = 0 + (((tickAnim - 70) / 10) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Tentacle3a, Tentacle3a.rotateAngleX + (float) Math.toRadians(xx), Tentacle3a.rotateAngleY + (float) Math.toRadians(yy), Tentacle3a.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 30) {
            xx = 1 + (((tickAnim - 0) / 30) * (1-(1)));
            yy = 1+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360))*-0.3 + (((tickAnim - 0) / 30) * (1+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360))*-0.3-(1+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360))*-0.3)));
            zz = 1.1+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360+60))*0.1 + (((tickAnim - 0) / 30) * (1.1+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360+60))*0.1-(1.1+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360+60))*0.1)));
        }
        else if (tickAnim >= 30 && tickAnim < 40) {
            xx = 1 + (((tickAnim - 30) / 10) * (1-(1)));
            yy = 1+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360))*-0.3 + (((tickAnim - 30) / 10) * (1-(1+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360))*-0.3)));
            zz = 1.1+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360+60))*0.1 + (((tickAnim - 30) / 10) * (1.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360+30))*-0.1-(1.1+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360+60))*0.1)));
        }
        else if (tickAnim >= 40 && tickAnim < 70) {
            xx = 1 + (((tickAnim - 40) / 30) * (1-(1)));
            yy = 1 + (((tickAnim - 40) / 30) * (1-(1)));
            zz = 1.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360+30))*-0.1 + (((tickAnim - 40) / 30) * (1.1+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360+30))*-0.1-(1.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360+30))*-0.1)));
        }
        else if (tickAnim >= 70 && tickAnim < 80) {
            xx = 1 + (((tickAnim - 70) / 10) * (1-(1)));
            yy = 1 + (((tickAnim - 70) / 10) * (1+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360))*-0.3-(1)));
            zz = 1.1+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360+30))*-0.1 + (((tickAnim - 70) / 10) * (1.1+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360+60))*0.1-(1.1+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360+30))*-0.1)));
        }
        else {
            xx = 1;
            yy = 1;
            zz = 1;
        }
        this.Tentacle3a.setScale((float)xx, (float)yy, (float)zz);




        if (tickAnim >= 0 && tickAnim < 30) {
            xx = 20+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360+60))*-30 + (((tickAnim - 0) / 30) * (20+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360+60))*-30-(20+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360+60))*-30)));
            yy = 0 + (((tickAnim - 0) / 30) * (0-(0)));
            zz = -45 + (((tickAnim - 0) / 30) * (-45-(-45)));
        }
        else if (tickAnim >= 30 && tickAnim < 40) {
            xx = 20+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360+60))*-30 + (((tickAnim - 30) / 10) * (-5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360))*5-(20+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360+60))*-30)));
            yy = 0 + (((tickAnim - 30) / 10) * (0-(0)));
            zz = -45 + (((tickAnim - 30) / 10) * (-45-(-45)));
        }
        else if (tickAnim >= 40 && tickAnim < 70) {
            xx = -5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360))*5 + (((tickAnim - 40) / 30) * (-5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360))*5-(-5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360))*5)));
            yy = 0 + (((tickAnim - 40) / 30) * (0-(0)));
            zz = -45 + (((tickAnim - 40) / 30) * (-45-(-45)));
        }
        else if (tickAnim >= 70 && tickAnim < 80) {
            xx = -5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360))*5 + (((tickAnim - 70) / 10) * (20+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360+60))*-30-(-5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360))*5)));
            yy = 0 + (((tickAnim - 70) / 10) * (0-(0)));
            zz = -45 + (((tickAnim - 70) / 10) * (-45-(-45)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Tentacle4a, Tentacle4a.rotateAngleX + (float) Math.toRadians(xx), Tentacle4a.rotateAngleY + (float) Math.toRadians(yy), Tentacle4a.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 30) {
            xx = 1+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360))*-0.3 + (((tickAnim - 0) / 30) * (1+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360))*-0.3-(1+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360))*-0.3)));
            yy = 1 + (((tickAnim - 0) / 30) * (1-(1)));
            zz = 1.1+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360+60))*0.1 + (((tickAnim - 0) / 30) * (1.1+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360+60))*0.1-(1.1+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360+60))*0.1)));
        }
        else if (tickAnim >= 30 && tickAnim < 40) {
            xx = 1+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360))*-0.3 + (((tickAnim - 30) / 10) * (1-(1+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360))*-0.3)));
            yy = 1 + (((tickAnim - 30) / 10) * (1-(1)));
            zz = 1.1+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360+60))*0.1 + (((tickAnim - 30) / 10) * (1.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360+30))*-0.1-(1.1+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360+60))*0.1)));
        }
        else if (tickAnim >= 40 && tickAnim < 70) {
            xx = 1 + (((tickAnim - 40) / 30) * (1-(1)));
            yy = 1 + (((tickAnim - 40) / 30) * (1-(1)));
            zz = 1.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360+30))*-0.1 + (((tickAnim - 40) / 30) * (1.1+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360+30))*-0.1-(1.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360+30))*-0.1)));
        }
        else if (tickAnim >= 70 && tickAnim < 80) {
            xx = 1 + (((tickAnim - 70) / 10) * (1+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360))*-0.3-(1)));
            yy = 1 + (((tickAnim - 70) / 10) * (1-(1)));
            zz = 1.1+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360+30))*-0.1 + (((tickAnim - 70) / 10) * (1.1+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360+60))*0.1-(1.1+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360+30))*-0.1)));
        }
        else {
            xx = 1;
            yy = 1;
            zz = 1;
        }
        this.Tentacle4a.setScale((float)xx, (float)yy, (float)zz);




        if (tickAnim >= 0 && tickAnim < 30) {
            xx = 20+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360+60))*-30 + (((tickAnim - 0) / 30) * (20+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360+60))*-30-(20+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360+60))*-30)));
            yy = Math.sin((Math.PI/180)*(((double)tickAnim/20)*360+60))*5 + (((tickAnim - 0) / 30) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*360+60))*5-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*360+60))*5)));
            zz = -10 + (((tickAnim - 0) / 30) * (-10-(-10)));
        }
        else if (tickAnim >= 30 && tickAnim < 40) {
            xx = 20+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360+60))*-30 + (((tickAnim - 30) / 10) * (-5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360))*5-(20+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360+60))*-30)));
            yy = Math.sin((Math.PI/180)*(((double)tickAnim/20)*360+60))*5 + (((tickAnim - 30) / 10) * (2.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360))*-2.5-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*360+60))*5)));
            zz = -10 + (((tickAnim - 30) / 10) * (-5-(-10)));
        }
        else if (tickAnim >= 40 && tickAnim < 70) {
            xx = -5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360))*5 + (((tickAnim - 40) / 30) * (-5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360))*5-(-5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360))*5)));
            yy = 2.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360))*-2.5 + (((tickAnim - 40) / 30) * (2.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360))*-2.5-(2.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360))*-2.5)));
            zz = -5 + (((tickAnim - 40) / 30) * (-5-(-5)));
        }
        else if (tickAnim >= 70 && tickAnim < 80) {
            xx = -5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360))*5 + (((tickAnim - 70) / 10) * (20+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360+60))*-30-(-5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360))*5)));
            yy = 2.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360))*-2.5 + (((tickAnim - 70) / 10) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*360+60))*5-(2.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360))*-2.5)));
            zz = -5 + (((tickAnim - 70) / 10) * (-10-(-5)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Tentacle5a, Tentacle5a.rotateAngleX + (float) Math.toRadians(xx), Tentacle5a.rotateAngleY + (float) Math.toRadians(yy), Tentacle5a.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 30) {
            xx = 1+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360))*-0.3 + (((tickAnim - 0) / 30) * (1+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360))*-0.3-(1+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360))*-0.3)));
            yy = 1 + (((tickAnim - 0) / 30) * (1-(1)));
            zz = 1.1+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360+60))*0.1 + (((tickAnim - 0) / 30) * (1.1+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360+60))*0.1-(1.1+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360+60))*0.1)));
        }
        else if (tickAnim >= 30 && tickAnim < 40) {
            xx = 1+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360))*-0.3 + (((tickAnim - 30) / 10) * (1-(1+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360))*-0.3)));
            yy = 1 + (((tickAnim - 30) / 10) * (1-(1)));
            zz = 1.1+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360+60))*0.1 + (((tickAnim - 30) / 10) * (1.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360+30))*-0.1-(1.1+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360+60))*0.1)));
        }
        else if (tickAnim >= 40 && tickAnim < 70) {
            xx = 1 + (((tickAnim - 40) / 30) * (1-(1)));
            yy = 1 + (((tickAnim - 40) / 30) * (1-(1)));
            zz = 1.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360+30))*-0.1 + (((tickAnim - 40) / 30) * (1.1+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360+30))*-0.1-(1.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360+30))*-0.1)));
        }
        else if (tickAnim >= 70 && tickAnim < 80) {
            xx = 1 + (((tickAnim - 70) / 10) * (1+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360))*-0.3-(1)));
            yy = 1 + (((tickAnim - 70) / 10) * (1-(1)));
            zz = 1.1+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360+30))*-0.1 + (((tickAnim - 70) / 10) * (1.1+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360+60))*0.1-(1.1+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360+30))*-0.1)));
        }
        else {
            xx = 1;
            yy = 1;
            zz = 1;
        }
        this.Tentacle5a.setScale((float)xx, (float)yy, (float)zz);




        if (tickAnim >= 0 && tickAnim < 30) {
            xx = -20+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360+60))*30 + (((tickAnim - 0) / 30) * (-20+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360+60))*30-(-20+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360+60))*30)));
            yy = Math.sin((Math.PI/180)*(((double)tickAnim/20)*360+60))*-5 + (((tickAnim - 0) / 30) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*360+60))*-5-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*360+60))*-5)));
            zz = -10 + (((tickAnim - 0) / 30) * (-10-(-10)));
        }
        else if (tickAnim >= 30 && tickAnim < 40) {
            xx = -20+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360+60))*30 + (((tickAnim - 30) / 10) * (5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360))*-5-(-20+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360+60))*30)));
            yy = Math.sin((Math.PI/180)*(((double)tickAnim/20)*360+60))*-5 + (((tickAnim - 30) / 10) * (-2.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360))*2.5-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*360+60))*-5)));
            zz = -10 + (((tickAnim - 30) / 10) * (-5-(-10)));
        }
        else if (tickAnim >= 40 && tickAnim < 70) {
            xx = 5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360))*-5 + (((tickAnim - 40) / 30) * (5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360))*-5-(5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360))*-5)));
            yy = -2.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360))*2.5 + (((tickAnim - 40) / 30) * (-2.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360))*2.5-(-2.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360))*2.5)));
            zz = -5 + (((tickAnim - 40) / 30) * (-5-(-5)));
        }
        else if (tickAnim >= 70 && tickAnim < 80) {
            xx = 5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360))*-5 + (((tickAnim - 70) / 10) * (-20+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360+60))*30-(5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360))*-5)));
            yy = -2.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360))*2.5 + (((tickAnim - 70) / 10) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*360+60))*-5-(-2.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360))*2.5)));
            zz = -5 + (((tickAnim - 70) / 10) * (-10-(-5)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Tentacle6a, Tentacle6a.rotateAngleX + (float) Math.toRadians(xx), Tentacle6a.rotateAngleY + (float) Math.toRadians(yy), Tentacle6a.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 30) {
            xx = 1+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360))*-0.3 + (((tickAnim - 0) / 30) * (1+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360))*-0.3-(1+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360))*-0.3)));
            yy = 1 + (((tickAnim - 0) / 30) * (1-(1)));
            zz = 1.1+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360+60))*0.1 + (((tickAnim - 0) / 30) * (1.1+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360+60))*0.1-(1.1+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360+60))*0.1)));
        }
        else if (tickAnim >= 30 && tickAnim < 40) {
            xx = 1+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360))*-0.3 + (((tickAnim - 30) / 10) * (1-(1+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360))*-0.3)));
            yy = 1 + (((tickAnim - 30) / 10) * (1-(1)));
            zz = 1.1+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360+60))*0.1 + (((tickAnim - 30) / 10) * (1.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360+30))*-0.1-(1.1+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360+60))*0.1)));
        }
        else if (tickAnim >= 40 && tickAnim < 70) {
            xx = 1 + (((tickAnim - 40) / 30) * (1-(1)));
            yy = 1 + (((tickAnim - 40) / 30) * (1-(1)));
            zz = 1.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360+30))*-0.1 + (((tickAnim - 40) / 30) * (1.1+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360+30))*-0.1-(1.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360+30))*-0.1)));
        }
        else if (tickAnim >= 70 && tickAnim < 80) {
            xx = 1 + (((tickAnim - 70) / 10) * (1+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360))*-0.3-(1)));
            yy = 1 + (((tickAnim - 70) / 10) * (1-(1)));
            zz = 1.1+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360+30))*-0.1 + (((tickAnim - 70) / 10) * (1.1+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360+60))*0.1-(1.1+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360+30))*-0.1)));
        }
        else {
            xx = 1;
            yy = 1;
            zz = 1;
        }
        this.Tentacle6a.setScale((float)xx, (float)yy, (float)zz);




        if (tickAnim >= 0 && tickAnim < 30) {
            xx = -20+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360+60))*30 + (((tickAnim - 0) / 30) * (-20+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360+60))*30-(-20+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360+60))*30)));
            yy = 0 + (((tickAnim - 0) / 30) * (0-(0)));
            zz = -45 + (((tickAnim - 0) / 30) * (-45-(-45)));
        }
        else if (tickAnim >= 30 && tickAnim < 40) {
            xx = -20+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360+60))*30 + (((tickAnim - 30) / 10) * (5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360))*-5-(-20+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360+60))*30)));
            yy = 0 + (((tickAnim - 30) / 10) * (0-(0)));
            zz = -45 + (((tickAnim - 30) / 10) * (-45-(-45)));
        }
        else if (tickAnim >= 40 && tickAnim < 70) {
            xx = 5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360))*-5 + (((tickAnim - 40) / 30) * (5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360))*-5-(5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360))*-5)));
            yy = 0 + (((tickAnim - 40) / 30) * (0-(0)));
            zz = -45 + (((tickAnim - 40) / 30) * (-45-(-45)));
        }
        else if (tickAnim >= 70 && tickAnim < 80) {
            xx = 5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360))*-5 + (((tickAnim - 70) / 10) * (-20+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360+60))*30-(5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360))*-5)));
            yy = 0 + (((tickAnim - 70) / 10) * (0-(0)));
            zz = -45 + (((tickAnim - 70) / 10) * (-45-(-45)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Tentacle7a, Tentacle7a.rotateAngleX + (float) Math.toRadians(xx), Tentacle7a.rotateAngleY + (float) Math.toRadians(yy), Tentacle7a.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 30) {
            xx = 1+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360))*-0.3 + (((tickAnim - 0) / 30) * (1+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360))*-0.3-(1+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360))*-0.3)));
            yy = 1 + (((tickAnim - 0) / 30) * (1-(1)));
            zz = 1.1+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360+60))*0.1 + (((tickAnim - 0) / 30) * (1.1+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360+60))*0.1-(1.1+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360+60))*0.1)));
        }
        else if (tickAnim >= 30 && tickAnim < 40) {
            xx = 1+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360))*-0.3 + (((tickAnim - 30) / 10) * (1-(1+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360))*-0.3)));
            yy = 1 + (((tickAnim - 30) / 10) * (1-(1)));
            zz = 1.1+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360+60))*0.1 + (((tickAnim - 30) / 10) * (1.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360+30))*-0.1-(1.1+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360+60))*0.1)));
        }
        else if (tickAnim >= 40 && tickAnim < 70) {
            xx = 1 + (((tickAnim - 40) / 30) * (1-(1)));
            yy = 1 + (((tickAnim - 40) / 30) * (1-(1)));
            zz = 1.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360+30))*-0.1 + (((tickAnim - 40) / 30) * (1.1+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360+30))*-0.1-(1.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360+30))*-0.1)));
        }
        else if (tickAnim >= 70 && tickAnim < 80) {
            xx = 1 + (((tickAnim - 70) / 10) * (1+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360))*-0.3-(1)));
            yy = 1 + (((tickAnim - 70) / 10) * (1-(1)));
            zz = 1.1+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360+30))*-0.1 + (((tickAnim - 70) / 10) * (1.1+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360+60))*0.1-(1.1+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360+30))*-0.1)));
        }
        else {
            xx = 1;
            yy = 1;
            zz = 1;
        }
        this.Tentacle7a.setScale((float)xx, (float)yy, (float)zz);




        if (tickAnim >= 0 && tickAnim < 30) {
            xx = 0 + (((tickAnim - 0) / 30) * (0-(0)));
            yy = 20+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360+60))*-30 + (((tickAnim - 0) / 30) * (20+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360+60))*-30-(20+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360+60))*-30)));
            zz = 0 + (((tickAnim - 0) / 30) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 40) {
            xx = 0 + (((tickAnim - 30) / 10) * (0-(0)));
            yy = 20+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360+60))*-30 + (((tickAnim - 30) / 10) * (-5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360))*5-(20+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360+60))*-30)));
            zz = 0 + (((tickAnim - 30) / 10) * (0-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 70) {
            xx = 0 + (((tickAnim - 40) / 30) * (0-(0)));
            yy = -5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360))*5 + (((tickAnim - 40) / 30) * (-5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360))*5-(-5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360))*5)));
            zz = 0 + (((tickAnim - 40) / 30) * (0-(0)));
        }
        else if (tickAnim >= 70 && tickAnim < 80) {
            xx = 0 + (((tickAnim - 70) / 10) * (0-(0)));
            yy = -5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360))*5 + (((tickAnim - 70) / 10) * (20+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360+60))*-30-(-5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360))*5)));
            zz = 0 + (((tickAnim - 70) / 10) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Tentacle8a, Tentacle8a.rotateAngleX + (float) Math.toRadians(xx), Tentacle8a.rotateAngleY + (float) Math.toRadians(yy), Tentacle8a.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 30) {
            xx = 1 + (((tickAnim - 0) / 30) * (1-(1)));
            yy = 1+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360))*-0.3 + (((tickAnim - 0) / 30) * (1+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360))*-0.3-(1+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360))*-0.3)));
            zz = 1.1+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360+60))*0.1 + (((tickAnim - 0) / 30) * (1.1+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360+60))*0.1-(1.1+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360+60))*0.1)));
        }
        else if (tickAnim >= 30 && tickAnim < 40) {
            xx = 1 + (((tickAnim - 30) / 10) * (1-(1)));
            yy = 1+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360))*-0.3 + (((tickAnim - 30) / 10) * (1-(1+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360))*-0.3)));
            zz = 1.1+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360+60))*0.1 + (((tickAnim - 30) / 10) * (1.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360+30))*-0.1-(1.1+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360+60))*0.1)));
        }
        else if (tickAnim >= 40 && tickAnim < 70) {
            xx = 1 + (((tickAnim - 40) / 30) * (1-(1)));
            yy = 1 + (((tickAnim - 40) / 30) * (1-(1)));
            zz = 1.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360+30))*-0.1 + (((tickAnim - 40) / 30) * (1.1+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360+30))*-0.1-(1.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360+30))*-0.1)));
        }
        else if (tickAnim >= 70 && tickAnim < 80) {
            xx = 1 + (((tickAnim - 70) / 10) * (1-(1)));
            yy = 1 + (((tickAnim - 70) / 10) * (1+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360))*-0.3-(1)));
            zz = 1.1+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360+30))*-0.1 + (((tickAnim - 70) / 10) * (1.1+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360+60))*0.1-(1.1+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360+30))*-0.1)));
        }
        else {
            xx = 1;
            yy = 1;
            zz = 1;
        }
        this.Tentacle8a.setScale((float)xx, (float)yy, (float)zz);




        if (tickAnim >= 0 && tickAnim < 30) {
            xx = 20+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360+60))*-30 + (((tickAnim - 0) / 30) * (20+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360+60))*-30-(20+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360+60))*-30)));
            yy = 0 + (((tickAnim - 0) / 30) * (0-(0)));
            zz = 45 + (((tickAnim - 0) / 30) * (45-(45)));
        }
        else if (tickAnim >= 30 && tickAnim < 40) {
            xx = 20+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360+60))*-30 + (((tickAnim - 30) / 10) * (-5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360))*5-(20+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360+60))*-30)));
            yy = 0 + (((tickAnim - 30) / 10) * (0-(0)));
            zz = 45 + (((tickAnim - 30) / 10) * (45-(45)));
        }
        else if (tickAnim >= 40 && tickAnim < 70) {
            xx = -5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360))*5 + (((tickAnim - 40) / 30) * (-5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360))*5-(-5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360))*5)));
            yy = 0 + (((tickAnim - 40) / 30) * (0-(0)));
            zz = 45 + (((tickAnim - 40) / 30) * (45-(45)));
        }
        else if (tickAnim >= 70 && tickAnim < 80) {
            xx = -5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360))*5 + (((tickAnim - 70) / 10) * (20+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360+60))*-30-(-5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360))*5)));
            yy = 0 + (((tickAnim - 70) / 10) * (0-(0)));
            zz = 45 + (((tickAnim - 70) / 10) * (45-(45)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Tentacle9a, Tentacle9a.rotateAngleX + (float) Math.toRadians(xx), Tentacle9a.rotateAngleY + (float) Math.toRadians(yy), Tentacle9a.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 30) {
            xx = 1+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360))*-0.3 + (((tickAnim - 0) / 30) * (1+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360))*-0.3-(1+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360))*-0.3)));
            yy = 1 + (((tickAnim - 0) / 30) * (1-(1)));
            zz = 1.1+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360+60))*0.1 + (((tickAnim - 0) / 30) * (1.1+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360+60))*0.1-(1.1+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360+60))*0.1)));
        }
        else if (tickAnim >= 30 && tickAnim < 40) {
            xx = 1+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360))*-0.3 + (((tickAnim - 30) / 10) * (1-(1+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360))*-0.3)));
            yy = 1 + (((tickAnim - 30) / 10) * (1-(1)));
            zz = 1.1+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360+60))*0.1 + (((tickAnim - 30) / 10) * (1.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360+30))*-0.1-(1.1+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360+60))*0.1)));
        }
        else if (tickAnim >= 40 && tickAnim < 70) {
            xx = 1 + (((tickAnim - 40) / 30) * (1-(1)));
            yy = 1 + (((tickAnim - 40) / 30) * (1-(1)));
            zz = 1.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360+30))*-0.1 + (((tickAnim - 40) / 30) * (1.1+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360+30))*-0.1-(1.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360+30))*-0.1)));
        }
        else if (tickAnim >= 70 && tickAnim < 80) {
            xx = 1 + (((tickAnim - 70) / 10) * (1+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360))*-0.3-(1)));
            yy = 1 + (((tickAnim - 70) / 10) * (1-(1)));
            zz = 1.1+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360+30))*-0.1 + (((tickAnim - 70) / 10) * (1.1+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360+60))*0.1-(1.1+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360+30))*-0.1)));
        }
        else {
            xx = 1;
            yy = 1;
            zz = 1;
        }
        this.Tentacle9a.setScale((float)xx, (float)yy, (float)zz);




        if (tickAnim >= 0 && tickAnim < 30) {
            xx = 20+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360+60))*-30 + (((tickAnim - 0) / 30) * (20+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360+60))*-30-(20+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360+60))*-30)));
            yy = Math.sin((Math.PI/180)*(((double)tickAnim/20)*360+60))*-5 + (((tickAnim - 0) / 30) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*360+60))*-5-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*360+60))*-5)));
            zz = 10 + (((tickAnim - 0) / 30) * (10-(10)));
        }
        else if (tickAnim >= 30 && tickAnim < 40) {
            xx = 20+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360+60))*-30 + (((tickAnim - 30) / 10) * (-5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360))*5-(20+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360+60))*-30)));
            yy = Math.sin((Math.PI/180)*(((double)tickAnim/20)*360+60))*-5 + (((tickAnim - 30) / 10) * (-2.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360))*2.5-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*360+60))*-5)));
            zz = 10 + (((tickAnim - 30) / 10) * (5-(10)));
        }
        else if (tickAnim >= 40 && tickAnim < 70) {
            xx = -5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360))*5 + (((tickAnim - 40) / 30) * (-5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360))*5-(-5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360))*5)));
            yy = -2.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360))*2.5 + (((tickAnim - 40) / 30) * (-2.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360))*2.5-(-2.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360))*2.5)));
            zz = 5 + (((tickAnim - 40) / 30) * (5-(5)));
        }
        else if (tickAnim >= 70 && tickAnim < 80) {
            xx = -5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360))*5 + (((tickAnim - 70) / 10) * (20+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360+60))*-30-(-5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360))*5)));
            yy = -2.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360))*2.5 + (((tickAnim - 70) / 10) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*360+60))*-5-(-2.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360))*2.5)));
            zz = 5 + (((tickAnim - 70) / 10) * (10-(5)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Tentacle10a, Tentacle10a.rotateAngleX + (float) Math.toRadians(xx), Tentacle10a.rotateAngleY + (float) Math.toRadians(yy), Tentacle10a.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 30) {
            xx = 1+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360))*-0.3 + (((tickAnim - 0) / 30) * (1+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360))*-0.3-(1+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360))*-0.3)));
            yy = 1 + (((tickAnim - 0) / 30) * (1-(1)));
            zz = 1.1+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360+60))*0.1 + (((tickAnim - 0) / 30) * (1.1+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360+60))*0.1-(1.1+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360+60))*0.1)));
        }
        else if (tickAnim >= 30 && tickAnim < 40) {
            xx = 1+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360))*-0.3 + (((tickAnim - 30) / 10) * (1-(1+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360))*-0.3)));
            yy = 1 + (((tickAnim - 30) / 10) * (1-(1)));
            zz = 1.1+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360+60))*0.1 + (((tickAnim - 30) / 10) * (1.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360+30))*-0.1-(1.1+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360+60))*0.1)));
        }
        else if (tickAnim >= 40 && tickAnim < 70) {
            xx = 1 + (((tickAnim - 40) / 30) * (1-(1)));
            yy = 1 + (((tickAnim - 40) / 30) * (1-(1)));
            zz = 1.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360+30))*-0.1 + (((tickAnim - 40) / 30) * (1.1+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360+30))*-0.1-(1.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360+30))*-0.1)));
        }
        else if (tickAnim >= 70 && tickAnim < 80) {
            xx = 1 + (((tickAnim - 70) / 10) * (1+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360))*-0.3-(1)));
            yy = 1 + (((tickAnim - 70) / 10) * (1-(1)));
            zz = 1.1+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360+30))*-0.1 + (((tickAnim - 70) / 10) * (1.1+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360+60))*0.1-(1.1+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360+30))*-0.1)));
        }
        else {
            xx = 1;
            yy = 1;
            zz = 1;
        }
        this.Tentacle10a.setScale((float)xx, (float)yy, (float)zz);




        if (tickAnim >= 0 && tickAnim < 30) {
            xx = -0.5225+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360+60))*5 + (((tickAnim - 0) / 30) * (0.4778+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360+60))*5-(-0.5225+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360+60))*5)));
            yy = 10.04919 + (((tickAnim - 0) / 30) * (13.29194-(10.04919)));
            zz = -1.5028 + (((tickAnim - 0) / 30) * (1.28115-(-1.5028)));
        }
        else if (tickAnim >= 30 && tickAnim < 40) {
            xx = 0.4778+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360+60))*5 + (((tickAnim - 30) / 10) * (-0.2236+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180+30))*5-(0.4778+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360+60))*5)));
            yy = 13.29194 + (((tickAnim - 30) / 10) * (18.01032-(13.29194)));
            zz = 1.28115 + (((tickAnim - 30) / 10) * (-0.5464-(1.28115)));
        }
        else if (tickAnim >= 40 && tickAnim < 70) {
            xx = -0.2236+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180+30))*5 + (((tickAnim - 40) / 30) * (0.4735+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180+30))*5-(-0.2236+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180+30))*5)));
            yy = 18.01032 + (((tickAnim - 40) / 30) * (13.54138-(18.01032)));
            zz = -0.5464 + (((tickAnim - 40) / 30) * (1.26393-(-0.5464)));
        }
        else if (tickAnim >= 70 && tickAnim < 80) {
            xx = 0.4735+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180+30))*5 + (((tickAnim - 70) / 10) * (-0.5225+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360+60))*5-(0.4735+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180+30))*5)));
            yy = 13.54138 + (((tickAnim - 70) / 10) * (10.04919-(13.54138)));
            zz = 1.26393 + (((tickAnim - 70) / 10) * (-1.5028-(1.26393)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(eyeRight, eyeRight.rotateAngleX + (float) Math.toRadians(xx), eyeRight.rotateAngleY + (float) Math.toRadians(yy), eyeRight.rotateAngleZ + (float) Math.toRadians(zz));

        this.eyeRight.rotationPointX = this.eyeRight.rotationPointX + (float)(-0.225);
        this.eyeRight.rotationPointY = this.eyeRight.rotationPointY - (float)(0);
        this.eyeRight.rotationPointZ = this.eyeRight.rotationPointZ + (float)(0);



        if (tickAnim >= 0 && tickAnim < 30) {
            xx = -0.4479+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360+60))*5 + (((tickAnim - 0) / 30) * (0.256+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360+60))*5-(-0.4479+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360+60))*5)));
            yy = -15.038 + (((tickAnim - 0) / 30) * (-23.01875-(-15.038)));
            zz = -1.15943 + (((tickAnim - 0) / 30) * (-0.57283-(-1.15943)));
        }
        else if (tickAnim >= 30 && tickAnim < 40) {
            xx = 0.256+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360+60))*5 + (((tickAnim - 30) / 10) * (-0.065+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180+30))*5-(0.256+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360+60))*5)));
            yy = -23.01875 + (((tickAnim - 30) / 10) * (-15.2544-(-23.01875)));
            zz = -0.57283 + (((tickAnim - 30) / 10) * (0.21451-(-0.57283)));
        }
        else if (tickAnim >= 40 && tickAnim < 70) {
            xx = -0.065+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180+30))*5 + (((tickAnim - 40) / 30) * (0.0576+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180+30))*5-(-0.065+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180+30))*5)));
            yy = -15.2544 + (((tickAnim - 40) / 30) * (-17.75634-(-15.2544)));
            zz = 0.21451 + (((tickAnim - 40) / 30) * (-0.17834-(0.21451)));
        }
        else if (tickAnim >= 70 && tickAnim < 80) {
            xx = 0.0576+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180+30))*5 + (((tickAnim - 70) / 10) * (-0.4479+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360+60))*5-(0.0576+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180+30))*5)));
            yy = -17.75634 + (((tickAnim - 70) / 10) * (-15.038-(-17.75634)));
            zz = -0.17834 + (((tickAnim - 70) / 10) * (-1.15943-(-0.17834)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(eyeLeft, eyeLeft.rotateAngleX + (float) Math.toRadians(xx), eyeLeft.rotateAngleY + (float) Math.toRadians(yy), eyeLeft.rotateAngleZ + (float) Math.toRadians(zz));

        this.eyeLeft.rotationPointX = this.eyeLeft.rotationPointX + (float)(0.05);
        this.eyeLeft.rotationPointY = this.eyeLeft.rotationPointY - (float)(0);
        this.eyeLeft.rotationPointZ = this.eyeLeft.rotationPointZ + (float)(0);



        if (tickAnim >= 0 && tickAnim < 30) {
            xx = -20+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360))*5 + (((tickAnim - 0) / 30) * (-20+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360))*5-(-20+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360))*5)));
            yy = 0 + (((tickAnim - 0) / 30) * (0-(0)));
            zz = Math.sin((Math.PI/180)*(((double)tickAnim/20)*90))*-5 + (((tickAnim - 0) / 30) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*90))*-5-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*90))*-5)));
        }
        else if (tickAnim >= 30 && tickAnim < 40) {
            xx = -20+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360))*5 + (((tickAnim - 30) / 10) * (-5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180))*5-(-20+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360))*5)));
            yy = 0 + (((tickAnim - 30) / 10) * (0-(0)));
            zz = Math.sin((Math.PI/180)*(((double)tickAnim/20)*90))*-5 + (((tickAnim - 30) / 10) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*90))*5-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*90))*-5)));
        }
        else if (tickAnim >= 40 && tickAnim < 70) {
            xx = -5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180))*5 + (((tickAnim - 40) / 30) * (-5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180))*5-(-5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180))*5)));
            yy = 0 + (((tickAnim - 40) / 30) * (0-(0)));
            zz = Math.sin((Math.PI/180)*(((double)tickAnim/20)*90))*5 + (((tickAnim - 40) / 30) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*90))*5-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*90))*5)));
        }
        else if (tickAnim >= 70 && tickAnim < 80) {
            xx = -5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180))*5 + (((tickAnim - 70) / 10) * (-20+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360))*5-(-5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180))*5)));
            yy = 0 + (((tickAnim - 70) / 10) * (0-(0)));
            zz = Math.sin((Math.PI/180)*(((double)tickAnim/20)*90))*5 + (((tickAnim - 70) / 10) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*90))*-5-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*90))*5)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Shell, Shell.rotateAngleX + (float) Math.toRadians(xx), Shell.rotateAngleY + (float) Math.toRadians(yy), Shell.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 30) {
            xx = 0 + (((tickAnim - 0) / 30) * (0-(0)));
            yy = Math.sin((Math.PI/180)*(((double)tickAnim/20)*360-90))*-0.5 + (((tickAnim - 0) / 30) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*360-90))*-0.5-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*360-90))*-0.5)));
            zz = Math.sin((Math.PI/180)*(((double)tickAnim/20)*360-120))*2+Math.sin((Math.PI/180)*(((double)tickAnim/20)*90-90))*-3 + (((tickAnim - 0) / 30) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*360-120))*2+Math.sin((Math.PI/180)*(((double)tickAnim/20)*90-90))*-3-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*360-120))*2+Math.sin((Math.PI/180)*(((double)tickAnim/20)*90-90))*-3)));
        }
        else if (tickAnim >= 30 && tickAnim < 40) {
            xx = 0 + (((tickAnim - 30) / 10) * (0-(0)));
            yy = Math.sin((Math.PI/180)*(((double)tickAnim/20)*360-90))*-0.5 + (((tickAnim - 30) / 10) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*180-90))*-0.5-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*360-90))*-0.5)));
            zz = Math.sin((Math.PI/180)*(((double)tickAnim/20)*360-120))*2+Math.sin((Math.PI/180)*(((double)tickAnim/20)*90-90))*-3 + (((tickAnim - 30) / 10) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*180-60))*1+Math.sin((Math.PI/180)*(((double)tickAnim/20)*90-90))*-3-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*360-120))*2+Math.sin((Math.PI/180)*(((double)tickAnim/20)*90-90))*-3)));
        }
        else if (tickAnim >= 40 && tickAnim < 70) {
            xx = 0 + (((tickAnim - 40) / 30) * (0-(0)));
            yy = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180-90))*-0.5 + (((tickAnim - 40) / 30) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*180-90))*-0.5-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180-90))*-0.5)));
            zz = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180-60))*1+Math.sin((Math.PI/180)*(((double)tickAnim/20)*90-90))*-3 + (((tickAnim - 40) / 30) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*180-60))*1+Math.sin((Math.PI/180)*(((double)tickAnim/20)*90-90))*-3-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180-60))*1+Math.sin((Math.PI/180)*(((double)tickAnim/20)*90-90))*-3)));
        }
        else if (tickAnim >= 70 && tickAnim < 80) {
            xx = 0 + (((tickAnim - 70) / 10) * (0-(0)));
            yy = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180-90))*-0.5 + (((tickAnim - 70) / 10) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*360-90))*-0.5-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180-90))*-0.5)));
            zz = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180-60))*1+Math.sin((Math.PI/180)*(((double)tickAnim/20)*90-90))*-3 + (((tickAnim - 70) / 10) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*360-120))*2+Math.sin((Math.PI/180)*(((double)tickAnim/20)*90-90))*-3-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180-60))*1+Math.sin((Math.PI/180)*(((double)tickAnim/20)*90-90))*-3)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.Shell.rotationPointX = this.Shell.rotationPointX + (float)(xx);
        this.Shell.rotationPointY = this.Shell.rotationPointY - (float)(yy);
        this.Shell.rotationPointZ = this.Shell.rotationPointZ + (float)(zz);

    }

    @Override
    public void setRotationAngles(float f, float f1, float f2, float f3, float f4, float f5, Entity e) {
        super.setRotationAngles(f, f1, f2, f3, f4, f5, e);
        //this.resetToDefaultPose();

        //this.body.offsetY = 1.50F;

        EntityPrehistoricFloraAmmonite_Ceratites ee = (EntityPrehistoricFloraAmmonite_Ceratites) e;

        if (!e.isInWater()) {
            this.root.rotateAngleZ = (float) Math.toRadians(90);
            this.root.offsetY = -0.4F;
        }

    }

    public void animate(IAnimatedEntity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        animator.update(entity);
    }
}

