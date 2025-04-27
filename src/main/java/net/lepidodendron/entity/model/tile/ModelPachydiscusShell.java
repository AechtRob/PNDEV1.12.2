package net.lepidodendron.entity.model.tile;

import net.ilexiconn.llibrary.client.model.tools.AdvancedModelRenderer;
import net.lepidodendron.entity.model.llibraryextensions.AdvancedModelBaseExtended;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;

public class ModelPachydiscusShell extends AdvancedModelBaseExtended {
    private final AdvancedModelRenderer root;
    private final AdvancedModelRenderer shell;
    private final AdvancedModelRenderer cube_r1;
    private final AdvancedModelRenderer cube_r2;
    private final AdvancedModelRenderer cube_r3;
    private final AdvancedModelRenderer cube_r4;
    private final AdvancedModelRenderer cube_r5;
    private final AdvancedModelRenderer cube_r6;
    private final AdvancedModelRenderer cube_r7;
    private final AdvancedModelRenderer cube_r8;
    private final AdvancedModelRenderer cube_r9;
    private final AdvancedModelRenderer mantle;
    private final AdvancedModelRenderer eyeRight;
    private final AdvancedModelRenderer eyeLeft;
    private final AdvancedModelRenderer finRight;
    private final AdvancedModelRenderer finLeft;
    private final AdvancedModelRenderer Siphon;
    private final AdvancedModelRenderer Tentacle1a;
    private final AdvancedModelRenderer Tentacle1b;
    private final AdvancedModelRenderer Tentacle1c;
    private final AdvancedModelRenderer Tentacle2a;
    private final AdvancedModelRenderer Tentacle2b;
    private final AdvancedModelRenderer Tentacle2c;
    private final AdvancedModelRenderer Tentacle2d;
    private final AdvancedModelRenderer Tentacle2e;
    private final AdvancedModelRenderer Tentacle2f;
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
    private final AdvancedModelRenderer Tentacle7d;
    private final AdvancedModelRenderer Tentacle7e;
    private final AdvancedModelRenderer Tentacle7f;
    private final AdvancedModelRenderer Tentacle8a;
    private final AdvancedModelRenderer Tentacle8b;
    private final AdvancedModelRenderer Tentacle8c;
    private final AdvancedModelRenderer Tentacle9a;
    private final AdvancedModelRenderer Tentacle9b;
    private final AdvancedModelRenderer Tentacle9c;
    private final AdvancedModelRenderer Tentacle10a;
    private final AdvancedModelRenderer Tentacle10b;
    private final AdvancedModelRenderer Tentacle10c;

    public ModelPachydiscusShell() {
        this.textureWidth = 128;
        this.textureHeight = 128;

        this.root = new AdvancedModelRenderer(this);
        this.root.setRotationPoint(0.0F, 24.0F, 0.0F);


        this.shell = new AdvancedModelRenderer(this);
        this.shell.setRotationPoint(0.0F, -2.0F, 3.0F);
        this.root.addChild(shell);


        this.cube_r1 = new AdvancedModelRenderer(this);
        this.cube_r1.setRotationPoint(0.0F, 0.6493F, -2.9289F);
        this.shell.addChild(cube_r1);
        this.setRotateAngle(cube_r1, 0.2182F, 0.0F, 0.0F);
        this.cube_r1.cubeList.add(new ModelBox(cube_r1, 0, 0, -4.0F, -12.0F, -6.0F, 8, 12, 9, 0.0F, false));
        this.cube_r1.cubeList.add(new ModelBox(cube_r1, 34, 0, -2.0F, -17.0F, -6.0F, 4, 5, 6, 0.0F, false));

        this.cube_r2 = new AdvancedModelRenderer(this);
        this.cube_r2.setRotationPoint(0.0F, -3.6526F, 4.7601F);
        this.shell.addChild(cube_r2);
        this.setRotateAngle(cube_r2, 0.6545F, 0.0F, 0.0F);
        this.cube_r2.cubeList.add(new ModelBox(cube_r2, 0, 44, -4.0F, -12.0F, -6.0F, 8, 12, 6, 0.01F, false));

        this.cube_r3 = new AdvancedModelRenderer(this);
        this.cube_r3.setRotationPoint(0.0F, -17.2663F, -0.7742F);
        this.shell.addChild(cube_r3);
        this.setRotateAngle(cube_r3, 1.4835F, 0.0F, 0.0F);
        this.cube_r3.cubeList.add(new ModelBox(cube_r3, 56, 23, -2.5F, -6.0F, -8.0F, 5, 6, 8, 0.0F, false));

        this.cube_r4 = new AdvancedModelRenderer(this);
        this.cube_r4.setRotationPoint(0.0F, -23.0004F, -4.7892F);
        this.shell.addChild(cube_r4);
        this.setRotateAngle(cube_r4, 2.1817F, 0.0F, 0.0F);
        this.cube_r4.cubeList.add(new ModelBox(cube_r4, 48, 58, -2.5F, -7.0F, -7.0F, 5, 7, 7, 0.1F, false));

        this.cube_r5 = new AdvancedModelRenderer(this);
        this.cube_r5.setRotationPoint(0.0F, -23.0004F, -12.7892F);
        this.shell.addChild(cube_r5);
        this.setRotateAngle(cube_r5, 3.1416F, 0.0F, 0.0F);
        this.cube_r5.cubeList.add(new ModelBox(cube_r5, 45, 42, -3.0F, -8.0F, -8.0F, 6, 8, 8, 0.0F, false));

        this.cube_r6 = new AdvancedModelRenderer(this);
        this.cube_r6.setRotationPoint(0.0F, -18.702F, -19.5363F);
        this.shell.addChild(cube_r6);
        this.setRotateAngle(cube_r6, -2.5744F, 0.0F, 0.0F);
        this.cube_r6.cubeList.add(new ModelBox(cube_r6, 20, 54, -3.0F, -8.0F, -8.0F, 6, 8, 8, 0.01F, false));

        this.cube_r7 = new AdvancedModelRenderer(this);
        this.cube_r7.setRotationPoint(0.0F, -12.7931F, -20.5782F);
        this.shell.addChild(cube_r7);
        this.setRotateAngle(cube_r7, -1.7453F, 0.0F, 0.0F);
        this.cube_r7.cubeList.add(new ModelBox(cube_r7, 23, 32, -3.0F, -9.0F, -6.0F, 6, 9, 9, 0.04F, false));

        this.cube_r8 = new AdvancedModelRenderer(this);
        this.cube_r8.setRotationPoint(0.0F, -4.5166F, -18.3287F);
        this.shell.addChild(cube_r8);
        this.setRotateAngle(cube_r8, -1.0908F, 0.0F, 0.0F);
        this.cube_r8.cubeList.add(new ModelBox(cube_r8, 32, 12, -3.5F, -10.0F, -6.0F, 7, 10, 9, 0.0F, false));

        this.cube_r9 = new AdvancedModelRenderer(this);
        this.cube_r9.setRotationPoint(0.0F, 0.6801F, -11.5056F);
        this.shell.addChild(cube_r9);
        this.setRotateAngle(cube_r9, -0.4363F, 0.0F, 0.0F);
        this.cube_r9.cubeList.add(new ModelBox(cube_r9, 0, 21, -3.5F, -11.0F, -6.0F, 7, 11, 9, 0.01F, false));

        this.mantle = new AdvancedModelRenderer(this);
        this.mantle.setRotationPoint(-0.5F, -13.0F, -2.5F);
        this.shell.addChild(mantle);
        this.setRotateAngle(mantle, 0.0436F, 0.0F, 0.0F);
        this.mantle.cubeList.add(new ModelBox(mantle, 55, 0, -3.0F, 0.0F, 0.0F, 7, 7, 7, 0.0F, false));

        this.eyeRight = new AdvancedModelRenderer(this);
        this.eyeRight.setRotationPoint(4.5F, 1.125F, 3.5F);
        this.mantle.addChild(eyeRight);
        this.setRotateAngle(eyeRight, 0.0F, -0.5672F, 0.0F);
        this.eyeRight.cubeList.add(new ModelBox(eyeRight, 65, 45, -2.0F, -1.0F, -1.5F, 3, 2, 3, 0.0F, false));
        this.eyeRight.cubeList.add(new ModelBox(eyeRight, 23, 21, 0.025F, -0.5F, -1.0F, 1, 1, 2, 0.0F, false));

        this.eyeLeft = new AdvancedModelRenderer(this);
        this.eyeLeft.setRotationPoint(-3.5F, 1.125F, 3.5F);
        this.mantle.addChild(eyeLeft);
        this.setRotateAngle(eyeLeft, 0.0F, 0.5672F, 0.0F);
        this.eyeLeft.cubeList.add(new ModelBox(eyeLeft, 57, 37, -1.0F, -1.0F, -1.5F, 3, 2, 3, 0.0F, false));
        this.eyeLeft.cubeList.add(new ModelBox(eyeLeft, 0, 6, -1.025F, -0.5F, -1.0F, 1, 1, 2, 0.0F, false));

        this.finRight = new AdvancedModelRenderer(this);
        this.finRight.setRotationPoint(4.0F, 5.0F, 5.0F);
        this.mantle.addChild(finRight);
        this.finRight.cubeList.add(new ModelBox(finRight, 21, 4, 0.0F, 0.0F, -2.0F, 4, 0, 4, 0.0F, false));

        this.finLeft = new AdvancedModelRenderer(this);
        this.finLeft.setRotationPoint(-3.0F, 5.0F, 5.0F);
        this.mantle.addChild(finLeft);
        this.finLeft.cubeList.add(new ModelBox(finLeft, 21, 0, -4.0F, 0.0F, -2.0F, 4, 0, 4, 0.0F, false));

        this.Siphon = new AdvancedModelRenderer(this);
        this.Siphon.setRotationPoint(0.5F, 6.925F, 1.95F);
        this.mantle.addChild(Siphon);
        this.setRotateAngle(Siphon, -0.2182F, 0.0F, 0.0F);
        this.Siphon.cubeList.add(new ModelBox(Siphon, 0, 62, -1.5F, -1.5F, -0.5F, 3, 3, 7, 0.0F, false));

        this.Tentacle1a = new AdvancedModelRenderer(this);
        this.Tentacle1a.setRotationPoint(-0.4F, 6.45F, 6.55F);
        this.mantle.addChild(Tentacle1a);
        this.Tentacle1a.cubeList.add(new ModelBox(Tentacle1a, 80, 15, -0.5F, -0.5F, 0.0F, 1, 1, 5, 0.0F, false));

        this.Tentacle1b = new AdvancedModelRenderer(this);
        this.Tentacle1b.setRotationPoint(0.0F, 0.0F, 4.5F);
        this.Tentacle1a.addChild(Tentacle1b);
        this.Tentacle1b.cubeList.add(new ModelBox(Tentacle1b, 80, 43, -0.5F, -0.5F, 0.0F, 1, 1, 5, -0.01F, false));

        this.Tentacle1c = new AdvancedModelRenderer(this);
        this.Tentacle1c.setRotationPoint(0.0F, 0.0F, 4.5F);
        this.Tentacle1b.addChild(Tentacle1c);
        this.Tentacle1c.cubeList.add(new ModelBox(Tentacle1c, 38, 71, -0.5F, -0.5F, 0.0F, 1, 1, 7, -0.02F, false));

        this.Tentacle2a = new AdvancedModelRenderer(this);
        this.Tentacle2a.setRotationPoint(-1.9F, 4.7F, 6.55F);
        this.mantle.addChild(Tentacle2a);
        this.Tentacle2a.cubeList.add(new ModelBox(Tentacle2a, 80, 9, -0.5F, -0.5F, 0.0F, 1, 1, 5, 0.0F, false));

        this.Tentacle2b = new AdvancedModelRenderer(this);
        this.Tentacle2b.setRotationPoint(0.0F, 0.0F, 4.5F);
        this.Tentacle2a.addChild(Tentacle2b);
        this.Tentacle2b.cubeList.add(new ModelBox(Tentacle2b, 55, 79, -0.5F, -0.5F, 0.0F, 1, 1, 5, -0.01F, false));

        this.Tentacle2c = new AdvancedModelRenderer(this);
        this.Tentacle2c.setRotationPoint(0.0F, 0.0F, 4.5F);
        this.Tentacle2b.addChild(Tentacle2c);
        this.Tentacle2c.cubeList.add(new ModelBox(Tentacle2c, 43, 79, -0.5F, -0.5F, 0.0F, 1, 1, 5, -0.02F, false));

        this.Tentacle2d = new AdvancedModelRenderer(this);
        this.Tentacle2d.setRotationPoint(0.0F, 0.0F, 4.5F);
        this.Tentacle2c.addChild(Tentacle2d);
        this.Tentacle2d.cubeList.add(new ModelBox(Tentacle2d, 31, 79, -0.5F, -0.5F, 0.0F, 1, 1, 5, -0.03F, false));

        this.Tentacle2e = new AdvancedModelRenderer(this);
        this.Tentacle2e.setRotationPoint(0.0F, 0.0F, 4.5F);
        this.Tentacle2d.addChild(Tentacle2e);
        this.setRotateAngle(Tentacle2e, 0.0F, 0.0F, 0.0F);
        this.Tentacle2e.cubeList.add(new ModelBox(Tentacle2e, 24, 78, -0.5F, -0.5F, 0.0F, 1, 1, 5, 0.0F, false));

        this.Tentacle2f = new AdvancedModelRenderer(this);
        this.Tentacle2f.setRotationPoint(0.0F, 0.0F, 5.0F);
        this.Tentacle2e.addChild(Tentacle2f);
        this.setRotateAngle(Tentacle2f, 0.0F, 0.0F, 0.0F);
        this.Tentacle2f.cubeList.add(new ModelBox(Tentacle2f, 26, 26, -0.5F, -1.0F, 4.0F, 1, 2, 1, 0.0F, false));
        this.Tentacle2f.cubeList.add(new ModelBox(Tentacle2f, 0, 27, -0.5F, -0.5F, 5.0F, 1, 1, 1, 0.0F, false));
        this.Tentacle2f.cubeList.add(new ModelBox(Tentacle2f, 23, 24, -0.5F, -1.0F, 0.0F, 1, 2, 1, 0.0F, false));
        this.Tentacle2f.cubeList.add(new ModelBox(Tentacle2f, 0, 21, -0.5F, -1.5F, 1.0F, 1, 3, 3, 0.0F, false));

        this.Tentacle3a = new AdvancedModelRenderer(this);
        this.Tentacle3a.setRotationPoint(-2.4F, 3.45F, 6.55F);
        this.mantle.addChild(Tentacle3a);
        this.Tentacle3a.cubeList.add(new ModelBox(Tentacle3a, 12, 78, -0.5F, -0.5F, 0.0F, 1, 1, 5, 0.0F, false));

        this.Tentacle3b = new AdvancedModelRenderer(this);
        this.Tentacle3b.setRotationPoint(0.0F, 0.0F, 4.5F);
        this.Tentacle3a.addChild(Tentacle3b);
        this.Tentacle3b.cubeList.add(new ModelBox(Tentacle3b, 0, 78, -0.5F, -0.5F, 0.0F, 1, 1, 5, -0.01F, false));

        this.Tentacle3c = new AdvancedModelRenderer(this);
        this.Tentacle3c.setRotationPoint(0.0F, 0.0F, 4.5F);
        this.Tentacle3b.addChild(Tentacle3c);
        this.Tentacle3c.cubeList.add(new ModelBox(Tentacle3c, 29, 70, -0.5F, -0.5F, 0.0F, 1, 1, 7, -0.02F, false));

        this.Tentacle4a = new AdvancedModelRenderer(this);
        this.Tentacle4a.setRotationPoint(-1.9F, 1.7F, 6.55F);
        this.mantle.addChild(Tentacle4a);
        this.setRotateAngle(Tentacle4a, 0.0F, 0.0F, 0.0F);
        this.Tentacle4a.cubeList.add(new ModelBox(Tentacle4a, 76, 0, -0.5F, -0.5F, 0.0F, 1, 1, 5, 0.0F, false));

        this.Tentacle4b = new AdvancedModelRenderer(this);
        this.Tentacle4b.setRotationPoint(0.0F, 0.0F, 4.5F);
        this.Tentacle4a.addChild(Tentacle4b);
        this.Tentacle4b.cubeList.add(new ModelBox(Tentacle4b, 75, 51, -0.5F, -0.5F, 0.0F, 1, 1, 5, -0.01F, false));

        this.Tentacle4c = new AdvancedModelRenderer(this);
        this.Tentacle4c.setRotationPoint(0.0F, 0.0F, 4.5F);
        this.Tentacle4b.addChild(Tentacle4c);
        this.Tentacle4c.cubeList.add(new ModelBox(Tentacle4c, 13, 70, -0.5F, -0.5F, 0.0F, 1, 1, 7, -0.02F, false));

        this.Tentacle5a = new AdvancedModelRenderer(this);
        this.Tentacle5a.setRotationPoint(-0.4F, 0.7F, 6.55F);
        this.mantle.addChild(Tentacle5a);
        this.Tentacle5a.cubeList.add(new ModelBox(Tentacle5a, 73, 74, -0.5F, -0.5F, 0.0F, 1, 1, 5, 0.0F, false));

        this.Tentacle5b = new AdvancedModelRenderer(this);
        this.Tentacle5b.setRotationPoint(0.0F, 0.0F, 4.5F);
        this.Tentacle5a.addChild(Tentacle5b);
        this.Tentacle5b.cubeList.add(new ModelBox(Tentacle5b, 74, 66, -0.5F, -0.5F, 0.0F, 1, 1, 5, -0.01F, false));

        this.Tentacle5c = new AdvancedModelRenderer(this);
        this.Tentacle5c.setRotationPoint(0.0F, 0.0F, 4.5F);
        this.Tentacle5b.addChild(Tentacle5c);
        this.setRotateAngle(Tentacle5c, 0.0F, 0.0F, 0.0F);
        this.Tentacle5c.cubeList.add(new ModelBox(Tentacle5c, 66, 51, -0.5F, -0.5F, 0.0F, 1, 1, 7, -0.02F, false));

        this.Tentacle6a = new AdvancedModelRenderer(this);
        this.Tentacle6a.setRotationPoint(1.4F, 6.45F, 6.55F);
        this.mantle.addChild(Tentacle6a);
        this.Tentacle6a.cubeList.add(new ModelBox(Tentacle6a, 74, 60, -0.5F, -0.5F, 0.0F, 1, 1, 5, 0.0F, false));

        this.Tentacle6b = new AdvancedModelRenderer(this);
        this.Tentacle6b.setRotationPoint(0.0F, 0.0F, 4.5F);
        this.Tentacle6a.addChild(Tentacle6b);
        this.Tentacle6b.cubeList.add(new ModelBox(Tentacle6b, 74, 37, -0.5F, -0.5F, 0.0F, 1, 1, 5, -0.01F, false));

        this.Tentacle6c = new AdvancedModelRenderer(this);
        this.Tentacle6c.setRotationPoint(0.0F, 0.0F, 4.5F);
        this.Tentacle6b.addChild(Tentacle6c);
        this.Tentacle6c.cubeList.add(new ModelBox(Tentacle6c, 65, 65, -0.5F, -0.5F, 0.0F, 1, 1, 7, -0.02F, false));

        this.Tentacle7a = new AdvancedModelRenderer(this);
        this.Tentacle7a.setRotationPoint(2.9F, 4.7F, 6.55F);
        this.mantle.addChild(Tentacle7a);
        this.Tentacle7a.cubeList.add(new ModelBox(Tentacle7a, 0, 72, -0.5F, -0.5F, 0.0F, 1, 1, 5, 0.0F, false));

        this.Tentacle7b = new AdvancedModelRenderer(this);
        this.Tentacle7b.setRotationPoint(0.0F, 0.0F, 4.5F);
        this.Tentacle7a.addChild(Tentacle7b);
        this.Tentacle7b.cubeList.add(new ModelBox(Tentacle7b, 22, 70, -0.5F, -0.5F, 0.0F, 1, 1, 5, -0.01F, false));

        this.Tentacle7c = new AdvancedModelRenderer(this);
        this.Tentacle7c.setRotationPoint(0.0F, 0.0F, 4.5F);
        this.Tentacle7b.addChild(Tentacle7c);
        this.Tentacle7c.cubeList.add(new ModelBox(Tentacle7c, 65, 59, -0.5F, -0.5F, 0.0F, 1, 1, 5, -0.02F, false));

        this.Tentacle7d = new AdvancedModelRenderer(this);
        this.Tentacle7d.setRotationPoint(0.0F, 0.0F, 4.5F);
        this.Tentacle7c.addChild(Tentacle7d);
        this.Tentacle7d.cubeList.add(new ModelBox(Tentacle7d, 55, 14, -0.5F, -0.5F, 0.0F, 1, 1, 5, -0.03F, false));

        this.Tentacle7e = new AdvancedModelRenderer(this);
        this.Tentacle7e.setRotationPoint(0.0F, 0.0F, 4.5F);
        this.Tentacle7d.addChild(Tentacle7e);
        this.setRotateAngle(Tentacle7e, 0.0F, 0.0F, 0.0F);
        this.Tentacle7e.cubeList.add(new ModelBox(Tentacle7e, 48, 0, -0.5F, -0.5F, 0.0F, 1, 1, 5, 0.0F, false));

        this.Tentacle7f = new AdvancedModelRenderer(this);
        this.Tentacle7f.setRotationPoint(0.0F, 0.0F, 5.0F);
        this.Tentacle7e.addChild(Tentacle7f);
        this.setRotateAngle(Tentacle7f, 0.0F, 0.0F, 0.0F);
        this.Tentacle7f.cubeList.add(new ModelBox(Tentacle7f, 5, 21, -0.5F, -1.0F, 4.0F, 1, 2, 1, 0.0F, false));
        this.Tentacle7f.cubeList.add(new ModelBox(Tentacle7f, 4, 6, -0.5F, -0.5F, 5.0F, 1, 1, 1, 0.0F, false));
        this.Tentacle7f.cubeList.add(new ModelBox(Tentacle7f, 5, 0, -0.5F, -1.0F, 0.0F, 1, 2, 1, 0.0F, false));
        this.Tentacle7f.cubeList.add(new ModelBox(Tentacle7f, 0, 0, -0.5F, -1.5F, 1.0F, 1, 3, 3, 0.0F, false));

        this.Tentacle8a = new AdvancedModelRenderer(this);
        this.Tentacle8a.setRotationPoint(3.4F, 3.45F, 6.55F);
        this.mantle.addChild(Tentacle8a);
        this.Tentacle8a.cubeList.add(new ModelBox(Tentacle8a, 74, 22, -0.5F, -0.5F, 0.0F, 1, 1, 5, 0.0F, false));

        this.Tentacle8b = new AdvancedModelRenderer(this);
        this.Tentacle8b.setRotationPoint(0.0F, 0.0F, 4.5F);
        this.Tentacle8a.addChild(Tentacle8b);
        this.Tentacle8b.cubeList.add(new ModelBox(Tentacle8b, 66, 73, -0.5F, -0.5F, 0.0F, 1, 1, 5, 0.0F, false));

        this.Tentacle8c = new AdvancedModelRenderer(this);
        this.Tentacle8c.setRotationPoint(0.0F, 0.0F, 4.5F);
        this.Tentacle8b.addChild(Tentacle8c);
        this.Tentacle8c.cubeList.add(new ModelBox(Tentacle8c, 65, 37, -0.5F, -0.5F, 0.0F, 1, 1, 7, -0.02F, false));

        this.Tentacle9a = new AdvancedModelRenderer(this);
        this.Tentacle9a.setRotationPoint(2.9F, 1.7F, 6.55F);
        this.mantle.addChild(Tentacle9a);
        this.setRotateAngle(Tentacle9a, 0.0F, 0.0F, 0.0F);
        this.Tentacle9a.cubeList.add(new ModelBox(Tentacle9a, 54, 73, -0.5F, -0.5F, 0.0F, 1, 1, 5, 0.0F, false));

        this.Tentacle9b = new AdvancedModelRenderer(this);
        this.Tentacle9b.setRotationPoint(0.0F, 0.0F, 4.5F);
        this.Tentacle9a.addChild(Tentacle9b);
        this.Tentacle9b.cubeList.add(new ModelBox(Tentacle9b, 73, 45, -0.5F, -0.5F, 0.0F, 1, 1, 5, -0.01F, false));

        this.Tentacle9c = new AdvancedModelRenderer(this);
        this.Tentacle9c.setRotationPoint(0.0F, 0.0F, 4.5F);
        this.Tentacle9b.addChild(Tentacle9c);
        this.Tentacle9c.cubeList.add(new ModelBox(Tentacle9c, 64, 14, -0.5F, -0.5F, 0.0F, 1, 1, 7, -0.02F, false));

        this.Tentacle10a = new AdvancedModelRenderer(this);
        this.Tentacle10a.setRotationPoint(1.4F, 0.7F, 6.55F);
        this.mantle.addChild(Tentacle10a);
        this.Tentacle10a.cubeList.add(new ModelBox(Tentacle10a, 73, 14, -0.5F, -0.5F, 0.0F, 1, 1, 5, 0.0F, false));

        this.Tentacle10b = new AdvancedModelRenderer(this);
        this.Tentacle10b.setRotationPoint(0.0F, 0.0F, 4.5F);
        this.Tentacle10a.addChild(Tentacle10b);
        this.Tentacle10b.cubeList.add(new ModelBox(Tentacle10b, 47, 72, -0.5F, -0.5F, 0.0F, 1, 1, 5, -0.01F, false));

        this.Tentacle10c = new AdvancedModelRenderer(this);
        this.Tentacle10c.setRotationPoint(0.0F, 0.0F, 4.5F);
        this.Tentacle10b.addChild(Tentacle10c);
        this.setRotateAngle(Tentacle10c, 0.0F, 0.0F, 0.0F);
        this.Tentacle10c.cubeList.add(new ModelBox(Tentacle10c, 44, 31, -0.5F, -0.5F, 0.0F, 1, 1, 7, -0.02F, false));
        updateDefaultPose();
    }

    public void renderAll(float f) {
        this.resetToDefaultPose();
        this.root.offsetY = -0.2F;
        this.root.render(0.08f);
    }

    public void setRotateAngle(ModelRenderer modelRenderer, float x, float y, float z) {
        modelRenderer.rotateAngleX = x;
        modelRenderer.rotateAngleY = y;
        modelRenderer.rotateAngleZ = z;
    }

}
