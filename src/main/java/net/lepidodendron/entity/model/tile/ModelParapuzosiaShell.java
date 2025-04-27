package net.lepidodendron.entity.model.tile;

import net.ilexiconn.llibrary.client.model.tools.AdvancedModelRenderer;
import net.lepidodendron.entity.model.llibraryextensions.AdvancedModelBaseExtended;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;

public class ModelParapuzosiaShell extends AdvancedModelBaseExtended {
    private final AdvancedModelRenderer root;
    private final AdvancedModelRenderer shell;
    private final AdvancedModelRenderer cube_r1;
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
    private final AdvancedModelRenderer Mantle;
    private final AdvancedModelRenderer Siphon;
    private final AdvancedModelRenderer eyeLeft;
    private final AdvancedModelRenderer eyeRight;
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
    private final AdvancedModelRenderer Tentacle1a_r1;
    private final AdvancedModelRenderer Tentacle4b;
    private final AdvancedModelRenderer Tentacle1b_r1;
    private final AdvancedModelRenderer Tentacle4c;
    private final AdvancedModelRenderer Tentacle1b_r2;
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
    private final AdvancedModelRenderer Tentacle1a_r2;
    private final AdvancedModelRenderer Tentacle9b;
    private final AdvancedModelRenderer Tentacle1b_r3;
    private final AdvancedModelRenderer Tentacle9c;
    private final AdvancedModelRenderer Tentacle1b_r4;
    private final AdvancedModelRenderer Tentacle10a;
    private final AdvancedModelRenderer Tentacle10b;
    private final AdvancedModelRenderer Tentacle10c;

    public ModelParapuzosiaShell() {
        this.textureWidth = 170;
        this.textureHeight = 170;

        this.root = new AdvancedModelRenderer(this);
        this.root.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.setRotateAngle(root, -0.0873F, 0.0F, 0.0F);


        this.shell = new AdvancedModelRenderer(this);
        this.shell.setRotationPoint(0.0F, 24.0F, 0.0F);
        this.root.addChild(shell);
        this.shell.cubeList.add(new ModelBox(shell, 0, 36, -6.0F, -18.0F, -8.0F, 12, 18, 16, 0.0F, false));
        this.shell.cubeList.add(new ModelBox(shell, 0, 105, -3.5F, -33.0F, -10.0F, 7, 15, 13, 0.0F, false));

        this.cube_r1 = new AdvancedModelRenderer(this);
        this.cube_r1.setRotationPoint(0.0F, 3.694F, 0.9039F);
        this.shell.addChild(cube_r1);
        this.setRotateAngle(cube_r1, 0.48F, 0.0F, 0.0F);
        this.cube_r1.cubeList.add(new ModelBox(cube_r1, 0, 0, -6.5F, -20.0F, 8.0F, 13, 20, 16, 0.0F, false));

        this.shell2 = new AdvancedModelRenderer(this);
        this.shell2.setRotationPoint(0.0F, 0.0F, -8.0F);
        this.shell.addChild(shell2);
        this.setRotateAngle(shell2, -0.6109F, 0.0F, 0.0F);
        this.shell2.cubeList.add(new ModelBox(shell2, 40, 54, -5.5F, -18.0F, -16.0F, 11, 18, 16, 0.0F, false));

        this.shell3 = new AdvancedModelRenderer(this);
        this.shell3.setRotationPoint(0.0F, 0.0F, -16.0F);
        this.shell2.addChild(shell3);
        this.setRotateAngle(shell3, -0.6545F, 0.0F, 0.0F);
        this.shell3.cubeList.add(new ModelBox(shell3, 56, 20, -5.0F, -17.0F, -16.0F, 10, 17, 16, 0.0F, false));

        this.shell4 = new AdvancedModelRenderer(this);
        this.shell4.setRotationPoint(0.0F, 0.0F, -16.0F);
        this.shell3.addChild(shell4);
        this.setRotateAngle(shell4, -0.637F, 0.0F, 0.0F);
        this.shell4.cubeList.add(new ModelBox(shell4, 0, 72, -4.5F, -15.0F, -16.0F, 9, 15, 16, 0.0F, false));

        this.shell5 = new AdvancedModelRenderer(this);
        this.shell5.setRotationPoint(0.0F, 0.0F, -16.0F);
        this.shell4.addChild(shell5);
        this.setRotateAngle(shell5, -0.7636F, 0.0F, 0.0F);
        this.shell5.cubeList.add(new ModelBox(shell5, 34, 88, -4.0F, -14.0F, -16.0F, 8, 14, 16, 0.0F, false));

        this.shell6 = new AdvancedModelRenderer(this);
        this.shell6.setRotationPoint(0.0F, 0.0F, -16.0F);
        this.shell5.addChild(shell6);
        this.setRotateAngle(shell6, -0.7199F, 0.0F, 0.0F);
        this.shell6.cubeList.add(new ModelBox(shell6, 92, 0, -4.0F, -13.0F, -14.0F, 8, 13, 14, -0.01F, false));

        this.shell7 = new AdvancedModelRenderer(this);
        this.shell7.setRotationPoint(0.0F, 0.0F, -14.0F);
        this.shell6.addChild(shell7);
        this.setRotateAngle(shell7, -0.7199F, 0.0F, 0.0F);
        this.shell7.cubeList.add(new ModelBox(shell7, 94, 39, -4.0F, -12.0F, -14.0F, 8, 12, 14, -0.02F, false));

        this.shell8 = new AdvancedModelRenderer(this);
        this.shell8.setRotationPoint(0.0F, 0.0F, -14.0F);
        this.shell7.addChild(shell8);
        this.setRotateAngle(shell8, -0.8072F, 0.0F, 0.0F);
        this.shell8.cubeList.add(new ModelBox(shell8, 77, 71, -4.0F, -12.0F, -17.0F, 8, 12, 17, -0.03F, false));

        this.shell9 = new AdvancedModelRenderer(this);
        this.shell9.setRotationPoint(0.0F, 0.0F, -13.0F);
        this.shell8.addChild(shell9);
        this.setRotateAngle(shell9, -0.8945F, 0.0F, 0.0F);


        this.shell10 = new AdvancedModelRenderer(this);
        this.shell10.setRotationPoint(0.0F, 0.0F, -12.0F);
        this.shell9.addChild(shell10);
        this.setRotateAngle(shell10, -0.8945F, 0.0F, 0.0F);


        this.shell11 = new AdvancedModelRenderer(this);
        this.shell11.setRotationPoint(0.0F, 0.0F, -12.0F);
        this.shell10.addChild(shell11);
        this.setRotateAngle(shell11, -0.8945F, 0.0F, 0.0F);


        this.Mantle = new AdvancedModelRenderer(this);
        this.Mantle.setRotationPoint(0.0F, -23.4F, 13.8F);
        this.shell.addChild(Mantle);
        this.setRotateAngle(Mantle, 0.0944F, 0.0F, 0.0F);
        this.Mantle.cubeList.add(new ModelBox(Mantle, 82, 100, -5.5F, -1.0F, -1.0F, 11, 14, 11, 0.0F, false));

        this.Siphon = new AdvancedModelRenderer(this);
        this.Siphon.setRotationPoint(0.0F, 11.9F, 6.0F);
        this.Mantle.addChild(Siphon);
        this.setRotateAngle(Siphon, -0.2995F, 0.0F, 0.0F);
        this.Siphon.cubeList.add(new ModelBox(Siphon, 109, 140, -2.5F, -1.0F, -2.0F, 5, 4, 7, 0.0F, false));

        this.eyeLeft = new AdvancedModelRenderer(this);
        this.eyeLeft.setRotationPoint(-5.5F, 0.675F, 6.5F);
        this.Mantle.addChild(eyeLeft);
        this.setRotateAngle(eyeLeft, -0.0999F, 0.5148F, -0.2009F);
        this.eyeLeft.cubeList.add(new ModelBox(eyeLeft, 141, 98, -3.0F, -0.4F, -3.5F, 5, 5, 5, 0.0F, false));

        this.eyeRight = new AdvancedModelRenderer(this);
        this.eyeRight.setRotationPoint(5.5F, 0.675F, 6.5F);
        this.Mantle.addChild(eyeRight);
        this.setRotateAngle(eyeRight, -0.0999F, -0.5148F, 0.2009F);
        this.eyeRight.cubeList.add(new ModelBox(eyeRight, 110, 77, -2.0F, -0.4F, -3.5F, 5, 5, 5, 0.0F, false));

        this.Tentacle1a = new AdvancedModelRenderer(this);
        this.Tentacle1a.setRotationPoint(-2.4F, 10.75F, 9.125F);
        this.Mantle.addChild(Tentacle1a);
        this.Tentacle1a.cubeList.add(new ModelBox(Tentacle1a, 85, 140, -1.4898F, -1.452F, 0.0443F, 3, 3, 9, 0.0F, false));

        this.Tentacle1b = new AdvancedModelRenderer(this);
        this.Tentacle1b.setRotationPoint(0.0F, 0.0F, 9.0F);
        this.Tentacle1a.addChild(Tentacle1b);
        this.Tentacle1b.cubeList.add(new ModelBox(Tentacle1b, 138, 42, -1.4898F, -1.4534F, -0.1557F, 3, 3, 9, -0.2F, false));

        this.Tentacle1c = new AdvancedModelRenderer(this);
        this.Tentacle1c.setRotationPoint(0.0F, 0.0F, 8.6F);
        this.Tentacle1b.addChild(Tentacle1c);
        this.Tentacle1c.cubeList.add(new ModelBox(Tentacle1c, 70, 137, -1.4898F, -1.4549F, -0.3557F, 3, 3, 9, -0.4F, false));

        this.Tentacle2a = new AdvancedModelRenderer(this);
        this.Tentacle2a.setRotationPoint(-3.4F, 8.25F, 9.125F);
        this.Mantle.addChild(Tentacle2a);
        this.Tentacle2a.cubeList.add(new ModelBox(Tentacle2a, 137, 3, -1.4898F, -1.452F, 0.0443F, 3, 3, 9, 0.0F, false));

        this.Tentacle2b = new AdvancedModelRenderer(this);
        this.Tentacle2b.setRotationPoint(0.0F, 0.0F, 9.0F);
        this.Tentacle2a.addChild(Tentacle2b);
        this.Tentacle2b.cubeList.add(new ModelBox(Tentacle2b, 15, 136, -1.4898F, -1.4534F, -0.1557F, 3, 3, 9, -0.2F, false));

        this.Tentacle2c = new AdvancedModelRenderer(this);
        this.Tentacle2c.setRotationPoint(0.0F, 0.0F, 8.6F);
        this.Tentacle2b.addChild(Tentacle2c);
        this.Tentacle2c.cubeList.add(new ModelBox(Tentacle2c, 133, 131, -1.4898F, -1.4549F, -0.3557F, 3, 3, 9, -0.4F, false));

        this.Tentacle3a = new AdvancedModelRenderer(this);
        this.Tentacle3a.setRotationPoint(-3.65F, 5.75F, 9.125F);
        this.Mantle.addChild(Tentacle3a);
        this.Tentacle3a.cubeList.add(new ModelBox(Tentacle3a, 133, 119, -1.4898F, -1.452F, 0.0443F, 3, 3, 9, 0.0F, false));

        this.Tentacle3b = new AdvancedModelRenderer(this);
        this.Tentacle3b.setRotationPoint(0.0F, 0.0F, 9.0F);
        this.Tentacle3a.addChild(Tentacle3b);
        this.Tentacle3b.cubeList.add(new ModelBox(Tentacle3b, 133, 80, -1.4898F, -1.4534F, -0.1557F, 3, 3, 9, -0.2F, false));

        this.Tentacle3c = new AdvancedModelRenderer(this);
        this.Tentacle3c.setRotationPoint(0.0F, 0.0F, 8.6F);
        this.Tentacle3b.addChild(Tentacle3c);
        this.Tentacle3c.cubeList.add(new ModelBox(Tentacle3c, 0, 133, -1.4898F, -1.4549F, -0.3557F, 3, 3, 9, -0.4F, false));

        this.Tentacle4a = new AdvancedModelRenderer(this);
        this.Tentacle4a.setRotationPoint(-3.4F, 3.25F, 9.125F);
        this.Mantle.addChild(Tentacle4a);


        this.Tentacle1a_r1 = new AdvancedModelRenderer(this);
        this.Tentacle1a_r1.setRotationPoint(0.0102F, 0.048F, 4.5443F);
        this.Tentacle4a.addChild(Tentacle1a_r1);
        this.setRotateAngle(Tentacle1a_r1, 0.0F, 0.0F, -1.5708F);
        this.Tentacle1a_r1.cubeList.add(new ModelBox(Tentacle1a_r1, 55, 130, -1.5F, -1.5F, -4.5F, 3, 3, 9, 0.0F, false));

        this.Tentacle4b = new AdvancedModelRenderer(this);
        this.Tentacle4b.setRotationPoint(0.0F, 0.0F, 9.0F);
        this.Tentacle4a.addChild(Tentacle4b);


        this.Tentacle1b_r1 = new AdvancedModelRenderer(this);
        this.Tentacle1b_r1.setRotationPoint(0.0102F, 0.048F, 4.5443F);
        this.Tentacle4b.addChild(Tentacle1b_r1);
        this.setRotateAngle(Tentacle1b_r1, 0.0F, 0.0F, -1.5708F);
        this.Tentacle1b_r1.cubeList.add(new ModelBox(Tentacle1b_r1, 31, 130, -1.4986F, -1.5F, -4.7F, 3, 3, 9, -0.2F, false));

        this.Tentacle4c = new AdvancedModelRenderer(this);
        this.Tentacle4c.setRotationPoint(0.0F, 0.0F, 8.6F);
        this.Tentacle4b.addChild(Tentacle4c);


        this.Tentacle1b_r2 = new AdvancedModelRenderer(this);
        this.Tentacle1b_r2.setRotationPoint(0.0102F, 0.048F, 4.5443F);
        this.Tentacle4c.addChild(Tentacle1b_r2);
        this.setRotateAngle(Tentacle1b_r2, 0.0F, 0.0F, -1.5708F);
        this.Tentacle1b_r2.cubeList.add(new ModelBox(Tentacle1b_r2, 129, 56, -1.4971F, -1.5F, -4.9F, 3, 3, 9, -0.4F, false));

        this.Tentacle5a = new AdvancedModelRenderer(this);
        this.Tentacle5a.setRotationPoint(-2.4F, 0.75F, 9.125F);
        this.Mantle.addChild(Tentacle5a);
        this.Tentacle5a.cubeList.add(new ModelBox(Tentacle5a, 118, 128, -1.4898F, -1.452F, 0.0443F, 3, 3, 9, 0.0F, false));

        this.Tentacle5b = new AdvancedModelRenderer(this);
        this.Tentacle5b.setRotationPoint(0.0F, 0.0F, 9.0F);
        this.Tentacle5a.addChild(Tentacle5b);
        this.Tentacle5b.cubeList.add(new ModelBox(Tentacle5b, 94, 128, -1.4898F, -1.4534F, -0.1557F, 3, 3, 9, -0.2F, false));

        this.Tentacle5c = new AdvancedModelRenderer(this);
        this.Tentacle5c.setRotationPoint(0.0F, 0.0F, 8.6F);
        this.Tentacle5b.addChild(Tentacle5c);
        this.Tentacle5c.cubeList.add(new ModelBox(Tentacle5c, 127, 18, -1.4898F, -1.4549F, -0.3557F, 3, 3, 9, -0.4F, false));

        this.Tentacle6a = new AdvancedModelRenderer(this);
        this.Tentacle6a.setRotationPoint(2.4F, 10.75F, 9.125F);
        this.Mantle.addChild(Tentacle6a);
        this.Tentacle6a.cubeList.add(new ModelBox(Tentacle6a, 110, 65, -1.5102F, -1.452F, 0.0443F, 3, 3, 9, 0.0F, false));

        this.Tentacle6b = new AdvancedModelRenderer(this);
        this.Tentacle6b.setRotationPoint(0.0F, 0.0F, 9.0F);
        this.Tentacle6a.addChild(Tentacle6b);
        this.Tentacle6b.cubeList.add(new ModelBox(Tentacle6b, 108, 27, -1.5102F, -1.4534F, -0.1557F, 3, 3, 9, -0.2F, false));

        this.Tentacle6c = new AdvancedModelRenderer(this);
        this.Tentacle6c.setRotationPoint(0.0F, 0.0F, 8.6F);
        this.Tentacle6b.addChild(Tentacle6c);
        this.Tentacle6c.cubeList.add(new ModelBox(Tentacle6c, 78, 56, -1.5102F, -1.4549F, -0.3557F, 3, 3, 9, -0.4F, false));

        this.Tentacle7a = new AdvancedModelRenderer(this);
        this.Tentacle7a.setRotationPoint(3.4F, 8.25F, 9.125F);
        this.Mantle.addChild(Tentacle7a);
        this.Tentacle7a.cubeList.add(new ModelBox(Tentacle7a, 64, 118, -1.5102F, -1.452F, 0.0443F, 3, 3, 9, 0.0F, false));

        this.Tentacle7b = new AdvancedModelRenderer(this);
        this.Tentacle7b.setRotationPoint(0.0F, 0.0F, 9.0F);
        this.Tentacle7a.addChild(Tentacle7b);
        this.Tentacle7b.cubeList.add(new ModelBox(Tentacle7b, 40, 118, -1.5102F, -1.4534F, -0.1557F, 3, 3, 9, -0.2F, false));

        this.Tentacle7c = new AdvancedModelRenderer(this);
        this.Tentacle7c.setRotationPoint(0.0F, 0.0F, 8.6F);
        this.Tentacle7b.addChild(Tentacle7c);
        this.Tentacle7c.cubeList.add(new ModelBox(Tentacle7c, 117, 116, -1.5102F, -1.4549F, -0.3557F, 3, 3, 9, -0.4F, false));

        this.Tentacle8a = new AdvancedModelRenderer(this);
        this.Tentacle8a.setRotationPoint(3.65F, 5.75F, 9.125F);
        this.Mantle.addChild(Tentacle8a);
        this.Tentacle8a.cubeList.add(new ModelBox(Tentacle8a, 72, 0, -1.5102F, -1.452F, 0.0443F, 3, 3, 9, 0.0F, false));

        this.Tentacle8b = new AdvancedModelRenderer(this);
        this.Tentacle8b.setRotationPoint(0.0F, 0.0F, 9.0F);
        this.Tentacle8a.addChild(Tentacle8b);
        this.Tentacle8b.cubeList.add(new ModelBox(Tentacle8b, 57, 3, -1.5102F, -1.4534F, -0.1557F, 3, 3, 9, -0.2F, false));

        this.Tentacle8c = new AdvancedModelRenderer(this);
        this.Tentacle8c.setRotationPoint(0.0F, 0.0F, 8.6F);
        this.Tentacle8b.addChild(Tentacle8c);
        this.Tentacle8c.cubeList.add(new ModelBox(Tentacle8c, 42, 0, -1.5102F, -1.4549F, -0.3557F, 3, 3, 9, -0.4F, false));

        this.Tentacle9a = new AdvancedModelRenderer(this);
        this.Tentacle9a.setRotationPoint(3.4F, 3.25F, 9.125F);
        this.Mantle.addChild(Tentacle9a);


        this.Tentacle1a_r2 = new AdvancedModelRenderer(this);
        this.Tentacle1a_r2.setRotationPoint(-0.0102F, 0.048F, 4.5443F);
        this.Tentacle9a.addChild(Tentacle1a_r2);
        this.setRotateAngle(Tentacle1a_r2, 0.0F, 0.0F, 1.5708F);
        this.Tentacle1a_r2.cubeList.add(new ModelBox(Tentacle1a_r2, 124, 30, -1.5F, -1.5F, -4.5F, 3, 3, 9, 0.0F, false));

        this.Tentacle9b = new AdvancedModelRenderer(this);
        this.Tentacle9b.setRotationPoint(0.0F, 0.0F, 9.0F);
        this.Tentacle9a.addChild(Tentacle9b);


        this.Tentacle1b_r3 = new AdvancedModelRenderer(this);
        this.Tentacle1b_r3.setRotationPoint(-0.0102F, 0.048F, 4.5443F);
        this.Tentacle9b.addChild(Tentacle1b_r3);
        this.setRotateAngle(Tentacle1b_r3, 0.0F, 0.0F, 1.5708F);
        this.Tentacle1b_r3.cubeList.add(new ModelBox(Tentacle1b_r3, 122, 0, -1.5014F, -1.5F, -4.7F, 3, 3, 9, -0.2F, false));

        this.Tentacle9c = new AdvancedModelRenderer(this);
        this.Tentacle9c.setRotationPoint(0.0F, 0.0F, 8.6F);
        this.Tentacle9b.addChild(Tentacle9c);


        this.Tentacle1b_r4 = new AdvancedModelRenderer(this);
        this.Tentacle1b_r4.setRotationPoint(-0.0102F, 0.048F, 4.5443F);
        this.Tentacle9c.addChild(Tentacle1b_r4);
        this.setRotateAngle(Tentacle1b_r4, 0.0F, 0.0F, 1.5708F);
        this.Tentacle1b_r4.cubeList.add(new ModelBox(Tentacle1b_r4, 118, 91, -1.5029F, -1.5F, -4.9F, 3, 3, 9, -0.4F, false));

        this.Tentacle10a = new AdvancedModelRenderer(this);
        this.Tentacle10a.setRotationPoint(2.4F, 0.75F, 9.125F);
        this.Mantle.addChild(Tentacle10a);
        this.Tentacle10a.cubeList.add(new ModelBox(Tentacle10a, 126, 103, -1.5102F, -1.452F, 0.0443F, 3, 3, 9, 0.0F, false));

        this.Tentacle10b = new AdvancedModelRenderer(this);
        this.Tentacle10b.setRotationPoint(0.0F, 0.0F, 9.0F);
        this.Tentacle10a.addChild(Tentacle10b);
        this.Tentacle10b.cubeList.add(new ModelBox(Tentacle10b, 79, 125, -1.5102F, -1.4534F, -0.1557F, 3, 3, 9, -0.2F, false));

        this.Tentacle10c = new AdvancedModelRenderer(this);
        this.Tentacle10c.setRotationPoint(0.0F, 0.0F, 8.6F);
        this.Tentacle10b.addChild(Tentacle10c);
        this.Tentacle10c.cubeList.add(new ModelBox(Tentacle10c, 125, 68, -1.5102F, -1.4549F, -0.3557F, 3, 3, 9, -0.4F, false));
        updateDefaultPose();
    }

    public void renderAll(float f) {
        this.resetToDefaultPose();
        this.root.offsetY = 0.0F;
        this.root.render(0.08f);
    }

    public void setRotateAngle(ModelRenderer modelRenderer, float x, float y, float z) {
        modelRenderer.rotateAngleX = x;
        modelRenderer.rotateAngleY = y;
        modelRenderer.rotateAngleZ = z;
    }

}
