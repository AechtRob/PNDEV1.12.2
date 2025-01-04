package net.lepidodendron.entity.model.tile;

import net.ilexiconn.llibrary.client.model.tools.AdvancedModelRenderer;
import net.lepidodendron.entity.model.llibraryextensions.AdvancedModelBaseExtended;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;

public class ModelMoutonicerasShell extends AdvancedModelBaseExtended {
    private final AdvancedModelRenderer Root;
    private final AdvancedModelRenderer shell1;
    private final AdvancedModelRenderer cube_r1;
    private final AdvancedModelRenderer cube_r2;
    private final AdvancedModelRenderer cube_r3;
    private final AdvancedModelRenderer cube_r4;
    private final AdvancedModelRenderer cube_r5;
    private final AdvancedModelRenderer shell2;
    private final AdvancedModelRenderer shell3;
    private final AdvancedModelRenderer shell4;
    private final AdvancedModelRenderer shell5;
    private final AdvancedModelRenderer shell6;
    private final AdvancedModelRenderer shell7;
    private final AdvancedModelRenderer shell8;
    private final AdvancedModelRenderer shell9;
    private final AdvancedModelRenderer shell10;
    private final AdvancedModelRenderer shell11;
    private final AdvancedModelRenderer shell12;
    private final AdvancedModelRenderer shell13;
    private final AdvancedModelRenderer shell14;
    private final AdvancedModelRenderer shell15;
    private final AdvancedModelRenderer shell16;
    private final AdvancedModelRenderer shell17;
    private final AdvancedModelRenderer shell18;
    private final AdvancedModelRenderer shell19;
    private final AdvancedModelRenderer shell20;
    private final AdvancedModelRenderer shell21;
    private final AdvancedModelRenderer shell22;
    private final AdvancedModelRenderer Mantle;
    private final AdvancedModelRenderer Siphon;
    private final AdvancedModelRenderer Mantle2;
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
    private final AdvancedModelRenderer cube_r6;
    private final AdvancedModelRenderer Tentacle9c;
    private final AdvancedModelRenderer Tentacle10a;
    private final AdvancedModelRenderer Tentacle10b;
    private final AdvancedModelRenderer Tentacle10c;

    public ModelMoutonicerasShell() {
        this.textureWidth = 90;
        this.textureHeight = 90;

        this.Root = new AdvancedModelRenderer(this);
        this.Root.setRotationPoint(0.0F, 7.0F, 0.0F);
        this.setRotateAngle(Root, -0.6109F, 0.0F, 0.0F);


        this.shell1 = new AdvancedModelRenderer(this);
        this.shell1.setRotationPoint(0.0F, -6.0F, -3.0F);
        this.Root.addChild(shell1);
        this.shell1.cubeList.add(new ModelBox(shell1, 0, 0, -3.5F, 0.0F, 10.0F, 7, 13, 8, 0.0F, false));
        this.shell1.cubeList.add(new ModelBox(shell1, 44, 11, -4.0F, 0.4F, 12.775F, 8, 1, 6, 0.0F, false));

        this.cube_r1 = new AdvancedModelRenderer(this);
        this.cube_r1.setRotationPoint(0.0F, 16.325F, 14.95F);
        this.shell1.addChild(cube_r1);
        this.setRotateAngle(cube_r1, -0.685F, 0.0F, 0.0F);
        this.cube_r1.cubeList.add(new ModelBox(cube_r1, 0, 57, -4.0F, -0.5F, -3.0F, 8, 1, 5, 0.0F, false));

        this.cube_r2 = new AdvancedModelRenderer(this);
        this.cube_r2.setRotationPoint(0.0F, 13.0F, 15.325F);
        this.shell1.addChild(cube_r2);
        this.setRotateAngle(cube_r2, -0.3447F, 0.0F, 0.0F);
        this.cube_r2.cubeList.add(new ModelBox(cube_r2, 0, 50, -4.0F, -0.5F, -3.0F, 8, 1, 6, 0.0F, false));

        this.cube_r3 = new AdvancedModelRenderer(this);
        this.cube_r3.setRotationPoint(0.0F, 9.625F, 15.7F);
        this.shell1.addChild(cube_r3);
        this.setRotateAngle(cube_r3, -0.1265F, 0.0F, 0.0F);
        this.cube_r3.cubeList.add(new ModelBox(cube_r3, 40, 48, -4.0F, -0.5F, -3.0F, 8, 1, 6, 0.0F, false));

        this.cube_r4 = new AdvancedModelRenderer(this);
        this.cube_r4.setRotationPoint(0.0F, 6.75F, 15.85F);
        this.shell1.addChild(cube_r4);
        this.setRotateAngle(cube_r4, -0.0567F, 0.0F, 0.0F);
        this.cube_r4.cubeList.add(new ModelBox(cube_r4, 22, 55, -4.0F, -0.5F, -3.0F, 8, 1, 6, 0.0F, false));

        this.cube_r5 = new AdvancedModelRenderer(this);
        this.cube_r5.setRotationPoint(0.0F, 3.9F, 15.6F);
        this.shell1.addChild(cube_r5);
        this.setRotateAngle(cube_r5, -0.0218F, 0.0F, 0.0F);
        this.cube_r5.cubeList.add(new ModelBox(cube_r5, 49, 0, -4.0F, -0.5F, -3.0F, 8, 1, 6, 0.0F, false));

        this.shell2 = new AdvancedModelRenderer(this);
        this.shell2.setRotationPoint(0.0F, 13.0F, 0.0F);
        this.shell1.addChild(shell2);
        this.setRotateAngle(shell2, -0.5236F, 0.0F, 0.0F);
        this.shell2.cubeList.add(new ModelBox(shell2, 0, 21, -3.5F, -9.0F, 8.5885F, 7, 7, 7, -0.01F, false));

        this.shell3 = new AdvancedModelRenderer(this);
        this.shell3.setRotationPoint(0.0F, 7.0F, 0.0F);
        this.shell2.addChild(shell3);
        this.setRotateAngle(shell3, -0.5672F, 0.0F, 0.0F);
        this.shell3.cubeList.add(new ModelBox(shell3, 24, 15, -3.5F, -15.9662F, 2.3115F, 7, 7, 6, -0.04F, false));

        this.shell4 = new AdvancedModelRenderer(this);
        this.shell4.setRotationPoint(0.0F, 7.0F, 0.0F);
        this.shell3.addChild(shell4);
        this.setRotateAngle(shell4, -0.6981F, 0.0F, 0.0F);
        this.shell4.cubeList.add(new ModelBox(shell4, 28, 28, -3.0F, -17.5733F, -9.8959F, 6, 7, 6, 0.0F, false));

        this.shell5 = new AdvancedModelRenderer(this);
        this.shell5.setRotationPoint(0.0F, 7.0F, 0.0F);
        this.shell4.addChild(shell5);
        this.setRotateAngle(shell5, -0.5672F, 0.0F, 0.0F);
        this.shell5.cubeList.add(new ModelBox(shell5, 46, 35, -3.0F, -12.7279F, -18.7279F, 6, 7, 6, -0.01F, false));

        this.shell6 = new AdvancedModelRenderer(this);
        this.shell6.setRotationPoint(0.0F, 7.0F, 0.0F);
        this.shell5.addChild(shell6);
        this.setRotateAngle(shell6, -0.5672F, 0.0F, 0.0F);
        this.shell6.cubeList.add(new ModelBox(shell6, 22, 41, -3.0F, -3.8959F, -23.5733F, 6, 7, 6, -0.04F, false));

        this.shell7 = new AdvancedModelRenderer(this);
        this.shell7.setRotationPoint(0.0F, 7.0F, 0.0F);
        this.shell6.addChild(shell7);
        this.setRotateAngle(shell7, -0.2182F, 0.0F, 0.0F);
        this.shell7.cubeList.add(new ModelBox(shell7, 0, 35, -2.5F, 0.0F, -24.0F, 5, 9, 6, 0.0F, false));

        this.shell8 = new AdvancedModelRenderer(this);
        this.shell8.setRotationPoint(0.0F, 9.0F, 0.0F);
        this.shell7.addChild(shell8);
        this.setRotateAngle(shell8, -0.0873F, 0.0F, 0.0F);
        this.shell8.cubeList.add(new ModelBox(shell8, 50, 55, -2.5F, 1.5688F, -22.9315F, 5, 9, 5, -0.01F, false));

        this.shell9 = new AdvancedModelRenderer(this);
        this.shell9.setRotationPoint(0.0F, 9.0F, 0.0F);
        this.shell8.addChild(shell9);
        this.setRotateAngle(shell9, -0.0436F, 0.0F, 0.0F);
        this.shell9.cubeList.add(new ModelBox(shell9, 22, 62, -2.0F, 2.3495F, -21.846F, 4, 9, 4, 0.0F, false));

        this.shell10 = new AdvancedModelRenderer(this);
        this.shell10.setRotationPoint(0.0F, 9.0F, 0.0F);
        this.shell9.addChild(shell10);
        this.setRotateAngle(shell10, -0.48F, 0.0F, 0.0F);
        this.shell10.cubeList.add(new ModelBox(shell10, 0, 63, -2.0F, 10.3244F, -17.7447F, 4, 8, 3, -0.01F, false));

        this.shell11 = new AdvancedModelRenderer(this);
        this.shell11.setRotationPoint(0.0F, 8.0F, 0.0F);
        this.shell10.addChild(shell11);
        this.setRotateAngle(shell11, -0.7418F, 0.0F, 0.0F);
        this.shell11.cubeList.add(new ModelBox(shell11, 66, 7, -1.0F, 17.5733F, -6.8959F, 2, 7, 3, 0.01F, false));

        this.shell12 = new AdvancedModelRenderer(this);
        this.shell12.setRotationPoint(0.0F, 7.0F, 0.0F);
        this.shell11.addChild(shell12);
        this.setRotateAngle(shell12, -0.7418F, 0.0F, 0.0F);
        this.shell12.cubeList.add(new ModelBox(shell12, 38, 62, -1.0F, 15.5885F, 6.0F, 2, 7, 3, 0.0F, false));

        this.shell13 = new AdvancedModelRenderer(this);
        this.shell13.setRotationPoint(0.0F, 7.0F, 0.0F);
        this.shell12.addChild(shell13);
        this.setRotateAngle(shell13, -0.8247F, 0.0F, 0.0F);
        this.shell13.cubeList.add(new ModelBox(shell13, 0, 0, -1.0F, 3.9726F, 15.5562F, 2, 5, 2, -0.01F, false));

        this.shell14 = new AdvancedModelRenderer(this);
        this.shell14.setRotationPoint(0.0F, 5.0F, 0.0F);
        this.shell13.addChild(shell14);
        this.setRotateAngle(shell14, -0.5149F, 0.0F, 0.0F);
        this.shell14.cubeList.add(new ModelBox(shell14, 14, 63, -1.0F, -5.1875F, 15.2363F, 2, 4, 2, -0.02F, false));

        this.shell15 = new AdvancedModelRenderer(this);
        this.shell15.setRotationPoint(0.0F, 4.0F, 0.0F);
        this.shell14.addChild(shell15);
        this.setRotateAngle(shell15, -0.5149F, 0.0F, 0.0F);
        this.shell15.cubeList.add(new ModelBox(shell15, 28, 28, -0.5F, -13.0026F, 10.4472F, 1, 4, 2, 0.04F, false));

        this.shell16 = new AdvancedModelRenderer(this);
        this.shell16.setRotationPoint(0.0F, 4.0F, 0.0F);
        this.shell15.addChild(shell16);
        this.setRotateAngle(shell16, -0.6589F, 0.0F, 0.0F);
        this.shell16.cubeList.add(new ModelBox(shell16, 0, 21, -0.5F, -17.9014F, -0.1185F, 1, 4, 2, 0.01F, false));

        this.shell17 = new AdvancedModelRenderer(this);
        this.shell17.setRotationPoint(0.0F, 4.0F, -0.4F);
        this.shell16.addChild(shell17);
        this.setRotateAngle(shell17, -0.6589F, 0.0F, 0.0F);
        this.shell17.cubeList.add(new ModelBox(shell17, 30, 11, -0.5F, -15.3063F, -10.4719F, 1, 3, 1, 0.0F, false));

        this.shell18 = new AdvancedModelRenderer(this);
        this.shell18.setRotationPoint(0.0F, 3.0F, 0.0F);
        this.shell17.addChild(shell18);
        this.setRotateAngle(shell18, -0.6589F, 0.0F, 0.0F);
        this.shell18.cubeList.add(new ModelBox(shell18, 30, 0, -0.5F, -6.3037F, -17.8601F, 1, 3, 1, -0.01F, false));

        this.shell19 = new AdvancedModelRenderer(this);
        this.shell19.setRotationPoint(0.0F, 3.0F, 0.0F);
        this.shell18.addChild(shell19);
        this.setRotateAngle(shell19, -0.5716F, 0.0F, 0.0F);
        this.shell19.cubeList.add(new ModelBox(shell19, 22, 0, -0.5F, 3.8192F, -18.5902F, 1, 3, 1, -0.04F, false));

        this.shell20 = new AdvancedModelRenderer(this);
        this.shell20.setRotationPoint(0.0F, 3.0F, 0.0F);
        this.shell19.addChild(shell20);
        this.setRotateAngle(shell20, -0.7112F, 0.0F, 0.0F);
        this.shell20.cubeList.add(new ModelBox(shell20, 16, 35, -0.5F, 14.3754F, -11.8327F, 1, 2, 1, -0.06F, false));

        this.shell21 = new AdvancedModelRenderer(this);
        this.shell21.setRotationPoint(0.0F, 2.0F, 0.0F);
        this.shell20.addChild(shell21);
        this.setRotateAngle(shell21, -0.7112F, 0.0F, 0.0F);
        this.shell21.cubeList.add(new ModelBox(shell21, 0, 35, -0.5F, 17.9615F, 0.1773F, 1, 2, 1, -0.08F, false));

        this.shell22 = new AdvancedModelRenderer(this);
        this.shell22.setRotationPoint(0.0F, 2.0F, 0.0F);
        this.shell21.addChild(shell22);
        this.setRotateAngle(shell22, -1.0167F, 0.0F, 0.0F);
        this.shell22.cubeList.add(new ModelBox(shell22, 34, 11, -0.5F, 8.4505F, 14.8931F, 1, 2, 1, -0.1F, false));

        this.Mantle = new AdvancedModelRenderer(this);
        this.Mantle.setRotationPoint(0.0F, -6.0F, 7.5F);
        this.Root.addChild(Mantle);
        this.setRotateAngle(Mantle, -0.5236F, 0.0F, 0.0F);
        this.Mantle.cubeList.add(new ModelBox(Mantle, 46, 22, -3.0F, -5.0F, 0.0F, 6, 5, 6, -0.02F, false));

        this.Siphon = new AdvancedModelRenderer(this);
        this.Siphon.setRotationPoint(0.0F, -4.6F, 6.525F);
        this.Mantle.addChild(Siphon);
        this.setRotateAngle(Siphon, 0.5164F, 0.0F, 0.0F);
        this.Siphon.cubeList.add(new ModelBox(Siphon, 64, 18, -1.5F, -1.295F, -1.0445F, 3, 2, 5, 0.0F, false));

        this.Mantle2 = new AdvancedModelRenderer(this);
        this.Mantle2.setRotationPoint(0.0F, -5.0F, 0.0F);
        this.Mantle.addChild(Mantle2);
        this.setRotateAngle(Mantle2, 0.6981F, 0.0F, 0.0F);
        this.Mantle2.cubeList.add(new ModelBox(Mantle2, 30, 0, -3.0F, 0.0F, 0.0F, 6, 4, 7, 0.0F, false));

        this.leftEye = new AdvancedModelRenderer(this);
        this.leftEye.setRotationPoint(2.75F, 1.55F, 0.0F);
        this.Mantle2.addChild(leftEye);
        this.setRotateAngle(leftEye, 0.5742F, 0.2213F, -0.3271F);
        this.leftEye.cubeList.add(new ModelBox(leftEye, 16, 35, -1.0F, -1.0F, -2.0F, 2, 2, 4, 0.0F, false));

        this.rightEye = new AdvancedModelRenderer(this);
        this.rightEye.setRotationPoint(-2.75F, 1.55F, 0.0F);
        this.Mantle2.addChild(rightEye);
        this.setRotateAngle(rightEye, 0.5742F, -0.2213F, 0.3271F);
        this.rightEye.cubeList.add(new ModelBox(rightEye, 22, 0, -1.0F, -1.0F, -2.0F, 2, 2, 4, 0.0F, false));

        this.Tentacle1a = new AdvancedModelRenderer(this);
        this.Tentacle1a.setRotationPoint(-0.7F, 3.5F, 6.5F);
        this.Mantle2.addChild(Tentacle1a);
        this.setRotateAngle(Tentacle1a, -0.3796F, 0.0F, 0.0F);
        this.Tentacle1a.cubeList.add(new ModelBox(Tentacle1a, 76, 73, -0.5F, -0.5F, 0.0F, 1, 1, 5, 0.0F, false));

        this.Tentacle1b = new AdvancedModelRenderer(this);
        this.Tentacle1b.setRotationPoint(0.0F, 0.0F, 4.5F);
        this.Tentacle1a.addChild(Tentacle1b);
        this.setRotateAngle(Tentacle1b, -0.1134F, 0.0087F, -0.0003F);
        this.Tentacle1b.cubeList.add(new ModelBox(Tentacle1b, 76, 67, -0.5F, -0.5F, 0.0F, 1, 1, 5, 0.0F, false));

        this.Tentacle1c = new AdvancedModelRenderer(this);
        this.Tentacle1c.setRotationPoint(0.0F, 0.0F, 4.5F);
        this.Tentacle1b.addChild(Tentacle1c);
        this.setRotateAngle(Tentacle1c, 0.0393F, -0.0087F, 0.0F);
        this.Tentacle1c.cubeList.add(new ModelBox(Tentacle1c, 66, 76, -0.5F, -0.5F, 0.0F, 1, 1, 5, 0.0F, false));

        this.Tentacle2a = new AdvancedModelRenderer(this);
        this.Tentacle2a.setRotationPoint(-2.15F, 3.25F, 6.5F);
        this.Mantle2.addChild(Tentacle2a);
        this.setRotateAngle(Tentacle2a, -0.2563F, -0.3629F, -0.8227F);
        this.Tentacle2a.cubeList.add(new ModelBox(Tentacle2a, 54, 76, -0.5F, -0.5F, 0.0F, 1, 1, 5, 0.0F, false));

        this.Tentacle2b = new AdvancedModelRenderer(this);
        this.Tentacle2b.setRotationPoint(0.0F, 0.0F, 4.5F);
        this.Tentacle2a.addChild(Tentacle2b);
        this.setRotateAngle(Tentacle2b, -0.0218F, -0.0044F, 0.0F);
        this.Tentacle2b.cubeList.add(new ModelBox(Tentacle2b, 26, 76, -0.5F, -0.5F, 0.0F, 1, 1, 5, 0.0F, false));

        this.Tentacle2c = new AdvancedModelRenderer(this);
        this.Tentacle2c.setRotationPoint(0.0F, 0.0F, 4.5F);
        this.Tentacle2b.addChild(Tentacle2c);
        this.setRotateAngle(Tentacle2c, -0.0303F, 0.1002F, 0.0081F);
        this.Tentacle2c.cubeList.add(new ModelBox(Tentacle2c, 76, 6, -0.5F, -0.5F, 0.0F, 1, 1, 5, 0.0F, false));

        this.Tentacle3a = new AdvancedModelRenderer(this);
        this.Tentacle3a.setRotationPoint(-2.4F, 2.0F, 6.5F);
        this.Mantle2.addChild(Tentacle3a);
        this.setRotateAngle(Tentacle3a, -0.3848F, -0.1577F, 0.0643F);
        this.Tentacle3a.cubeList.add(new ModelBox(Tentacle3a, 47, 75, -0.5F, -0.5F, 0.0F, 1, 1, 5, 0.0F, false));

        this.Tentacle3b = new AdvancedModelRenderer(this);
        this.Tentacle3b.setRotationPoint(0.0F, 0.0F, 4.5F);
        this.Tentacle3a.addChild(Tentacle3b);
        this.setRotateAngle(Tentacle3b, -0.0436F, 0.0742F, 0.0F);
        this.Tentacle3b.cubeList.add(new ModelBox(Tentacle3b, 19, 75, -0.5F, -0.5F, 0.0F, 1, 1, 5, 0.0F, false));

        this.Tentacle3c = new AdvancedModelRenderer(this);
        this.Tentacle3c.setRotationPoint(0.0F, 0.0F, 4.5F);
        this.Tentacle3b.addChild(Tentacle3c);
        this.setRotateAngle(Tentacle3c, 0.0175F, 0.0873F, 0.0F);
        this.Tentacle3c.cubeList.add(new ModelBox(Tentacle3c, 7, 75, -0.5F, -0.5F, 0.0F, 1, 1, 5, 0.0F, false));

        this.Tentacle4a = new AdvancedModelRenderer(this);
        this.Tentacle4a.setRotationPoint(-2.15F, 0.85F, 6.5F);
        this.Mantle2.addChild(Tentacle4a);
        this.setRotateAngle(Tentacle4a, -0.1569F, -0.3025F, -0.7908F);
        this.Tentacle4a.cubeList.add(new ModelBox(Tentacle4a, 0, 74, -0.5F, -0.5F, 0.0F, 1, 1, 5, 0.0F, false));

        this.Tentacle4b = new AdvancedModelRenderer(this);
        this.Tentacle4b.setRotationPoint(0.0F, 0.0F, 4.5F);
        this.Tentacle4a.addChild(Tentacle4b);
        this.setRotateAngle(Tentacle4b, -0.1222F, -0.0087F, 0.0011F);
        this.Tentacle4b.cubeList.add(new ModelBox(Tentacle4b, 40, 73, -0.5F, -0.5F, 0.0F, 1, 1, 5, 0.0F, false));

        this.Tentacle4c = new AdvancedModelRenderer(this);
        this.Tentacle4c.setRotationPoint(0.0F, 0.0F, 4.5F);
        this.Tentacle4b.addChild(Tentacle4c);
        this.setRotateAngle(Tentacle4c, -0.0611F, 0.0044F, -0.0003F);
        this.Tentacle4c.cubeList.add(new ModelBox(Tentacle4c, 72, 61, -0.5F, -0.5F, 0.0F, 1, 1, 5, 0.0F, false));

        this.Tentacle5a = new AdvancedModelRenderer(this);
        this.Tentacle5a.setRotationPoint(-0.7F, 0.625F, 6.5F);
        this.Mantle2.addChild(Tentacle5a);
        this.setRotateAngle(Tentacle5a, -0.2225F, 0.0F, 0.0F);
        this.Tentacle5a.cubeList.add(new ModelBox(Tentacle5a, 72, 55, -0.5F, -0.5F, 0.0F, 1, 1, 5, 0.0F, false));

        this.Tentacle5b = new AdvancedModelRenderer(this);
        this.Tentacle5b.setRotationPoint(0.0F, 0.0F, 4.5F);
        this.Tentacle5a.addChild(Tentacle5b);
        this.setRotateAngle(Tentacle5b, -0.1396F, -0.013F, 0.0014F);
        this.Tentacle5b.cubeList.add(new ModelBox(Tentacle5b, 72, 49, -0.5F, -0.5F, 0.0F, 1, 1, 5, 0.0F, false));

        this.Tentacle5c = new AdvancedModelRenderer(this);
        this.Tentacle5c.setRotationPoint(0.0F, 0.0F, 4.5F);
        this.Tentacle5b.addChild(Tentacle5c);
        this.setRotateAngle(Tentacle5c, -0.2009F, -0.0378F, 0.0107F);
        this.Tentacle5c.cubeList.add(new ModelBox(Tentacle5c, 33, 72, -0.5F, -0.5F, 0.0F, 1, 1, 5, 0.0F, false));

        this.Tentacle6a = new AdvancedModelRenderer(this);
        this.Tentacle6a.setRotationPoint(0.7F, 3.5F, 6.5F);
        this.Mantle2.addChild(Tentacle6a);
        this.setRotateAngle(Tentacle6a, -0.3796F, 0.0F, 0.0F);
        this.Tentacle6a.cubeList.add(new ModelBox(Tentacle6a, 72, 12, -0.5F, -0.5F, 0.0F, 1, 1, 5, 0.0F, false));

        this.Tentacle6b = new AdvancedModelRenderer(this);
        this.Tentacle6b.setRotationPoint(0.0F, 0.0F, 4.5F);
        this.Tentacle6a.addChild(Tentacle6b);
        this.setRotateAngle(Tentacle6b, -0.1134F, -0.0087F, -0.0003F);
        this.Tentacle6b.cubeList.add(new ModelBox(Tentacle6b, 71, 37, -0.5F, -0.5F, 0.0F, 1, 1, 5, 0.0F, false));

        this.Tentacle6c = new AdvancedModelRenderer(this);
        this.Tentacle6c.setRotationPoint(0.0F, 0.0F, 4.5F);
        this.Tentacle6b.addChild(Tentacle6c);
        this.setRotateAngle(Tentacle6c, 0.0393F, -0.0087F, 0.0F);
        this.Tentacle6c.cubeList.add(new ModelBox(Tentacle6c, 71, 31, -0.5F, -0.5F, 0.0F, 1, 1, 5, 0.0F, false));

        this.Tentacle7a = new AdvancedModelRenderer(this);
        this.Tentacle7a.setRotationPoint(2.15F, 3.25F, 6.5F);
        this.Mantle2.addChild(Tentacle7a);
        this.setRotateAngle(Tentacle7a, -0.2563F, 0.3629F, 0.8227F);
        this.Tentacle7a.cubeList.add(new ModelBox(Tentacle7a, 71, 0, -0.5F, -0.5F, 0.0F, 1, 1, 5, 0.0F, false));

        this.Tentacle7b = new AdvancedModelRenderer(this);
        this.Tentacle7b.setRotationPoint(0.0F, 0.0F, 4.5F);
        this.Tentacle7a.addChild(Tentacle7b);
        this.setRotateAngle(Tentacle7b, -0.0218F, -0.0044F, 0.0F);
        this.Tentacle7b.cubeList.add(new ModelBox(Tentacle7b, 69, 70, -0.5F, -0.5F, 0.0F, 1, 1, 5, 0.0F, false));

        this.Tentacle7c = new AdvancedModelRenderer(this);
        this.Tentacle7c.setRotationPoint(0.0F, 0.0F, 4.5F);
        this.Tentacle7b.addChild(Tentacle7c);
        this.setRotateAngle(Tentacle7c, -0.0303F, -0.1002F, 0.0081F);
        this.Tentacle7c.cubeList.add(new ModelBox(Tentacle7c, 57, 70, -0.5F, -0.5F, 0.0F, 1, 1, 5, 0.0F, false));

        this.Tentacle8a = new AdvancedModelRenderer(this);
        this.Tentacle8a.setRotationPoint(2.4F, 2.0F, 6.5F);
        this.Mantle2.addChild(Tentacle8a);
        this.setRotateAngle(Tentacle8a, -0.3891F, 0.1577F, -0.0643F);
        this.Tentacle8a.cubeList.add(new ModelBox(Tentacle8a, 70, 25, -0.5F, -0.5F, 0.0F, 1, 1, 5, 0.0F, false));

        this.Tentacle8b = new AdvancedModelRenderer(this);
        this.Tentacle8b.setRotationPoint(0.0F, 0.0F, 4.5F);
        this.Tentacle8a.addChild(Tentacle8b);
        this.setRotateAngle(Tentacle8b, -0.0436F, -0.0742F, 0.0F);
        this.Tentacle8b.cubeList.add(new ModelBox(Tentacle8b, 50, 69, -0.5F, -0.5F, 0.0F, 1, 1, 5, 0.0F, false));

        this.Tentacle8c = new AdvancedModelRenderer(this);
        this.Tentacle8c.setRotationPoint(0.0F, 0.0F, 4.5F);
        this.Tentacle8b.addChild(Tentacle8c);
        this.setRotateAngle(Tentacle8c, 0.0175F, -0.0873F, 0.0F);
        this.Tentacle8c.cubeList.add(new ModelBox(Tentacle8c, 69, 43, -0.5F, -0.5F, 0.0F, 1, 1, 5, 0.0F, false));

        this.Tentacle9a = new AdvancedModelRenderer(this);
        this.Tentacle9a.setRotationPoint(2.15F, 0.85F, 6.5F);
        this.Mantle2.addChild(Tentacle9a);
        this.setRotateAngle(Tentacle9a, -0.1569F, 0.3025F, 0.7908F);
        this.Tentacle9a.cubeList.add(new ModelBox(Tentacle9a, 9, 69, -0.5F, -0.5F, 0.0F, 1, 1, 5, 0.0F, false));

        this.Tentacle9b = new AdvancedModelRenderer(this);
        this.Tentacle9b.setRotationPoint(0.0F, 0.0F, 4.5F);
        this.Tentacle9a.addChild(Tentacle9b);
        this.setRotateAngle(Tentacle9b, -0.1222F, 0.0F, 0.0F);


        this.cube_r6 = new AdvancedModelRenderer(this);
        this.cube_r6.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.Tentacle9b.addChild(cube_r6);
        this.setRotateAngle(cube_r6, 0.0F, 0.0087F, 0.0F);
        this.cube_r6.cubeList.add(new ModelBox(cube_r6, 43, 67, -0.5F, -0.5F, 0.0F, 1, 1, 5, 0.0F, false));

        this.Tentacle9c = new AdvancedModelRenderer(this);
        this.Tentacle9c.setRotationPoint(0.0F, 0.0F, 4.5F);
        this.Tentacle9b.addChild(Tentacle9c);
        this.setRotateAngle(Tentacle9c, -0.0611F, 0.0044F, -0.0003F);
        this.Tentacle9c.cubeList.add(new ModelBox(Tentacle9c, 65, 64, -0.5F, -0.5F, 0.0F, 1, 1, 5, 0.0F, false));

        this.Tentacle10a = new AdvancedModelRenderer(this);
        this.Tentacle10a.setRotationPoint(0.7F, 0.625F, 6.5F);
        this.Mantle2.addChild(Tentacle10a);
        this.setRotateAngle(Tentacle10a, -0.2225F, 0.0F, 0.0F);
        this.Tentacle10a.cubeList.add(new ModelBox(Tentacle10a, 65, 54, -0.5F, -0.5F, 0.0F, 1, 1, 5, 0.0F, false));

        this.Tentacle10b = new AdvancedModelRenderer(this);
        this.Tentacle10b.setRotationPoint(0.0F, 0.0F, 4.5F);
        this.Tentacle10a.addChild(Tentacle10b);
        this.setRotateAngle(Tentacle10b, -0.1396F, -0.013F, 0.0014F);
        this.Tentacle10b.cubeList.add(new ModelBox(Tentacle10b, 64, 33, -0.5F, -0.5F, 0.0F, 1, 1, 5, 0.0F, false));

        this.Tentacle10c = new AdvancedModelRenderer(this);
        this.Tentacle10c.setRotationPoint(0.0F, 0.0F, 4.5F);
        this.Tentacle10b.addChild(Tentacle10c);
        this.setRotateAngle(Tentacle10c, -0.2009F, 0.0378F, -0.0107F);
        this.Tentacle10c.cubeList.add(new ModelBox(Tentacle10c, 62, 48, -0.5F, -0.5F, 0.0F, 1, 1, 5, 0.0F, false));
        updateDefaultPose();
    }

    public void renderAll(float f) {
        this.resetToDefaultPose();
        this.Root.offsetY = -1.5F;
        this.Root.offsetZ = -0.4F;
        this.Root.rotateAngleX = (float) Math.toRadians(1);
        this.Root.render(0.08f);
    }

    public void setRotateAngle(ModelRenderer modelRenderer, float x, float y, float z) {
        modelRenderer.rotateAngleX = x;
        modelRenderer.rotateAngleY = y;
        modelRenderer.rotateAngleZ = z;
    }

}
