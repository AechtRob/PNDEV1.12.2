package net.lepidodendron.entity.model.entity;

import net.ilexiconn.llibrary.client.model.ModelAnimator;
import net.ilexiconn.llibrary.client.model.tools.AdvancedModelRenderer;
import net.ilexiconn.llibrary.server.animation.IAnimatedEntity;
import net.lepidodendron.entity.EntityPrehistoricFloraAmmonite_Pachydiscus;
import net.lepidodendron.entity.model.ModelBasePalaeopedia;
import net.minecraft.client.model.ModelBox;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;

public class ModelPachydiscus extends ModelBasePalaeopedia {
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

    private ModelAnimator animator;

    public ModelPachydiscus() {
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
        this.root.offsetX = 1.2F;
        this.root.rotateAngleY = (float)Math.toRadians(242);
        this.root.rotateAngleX = (float)Math.toRadians(-18);
        this.root.rotateAngleZ = (float)Math.toRadians(-8);
        this.root.scaleChildren = true;
        float scaler = 1.23F;
        this.root.setScale(scaler, scaler, scaler);
        //Start of pose:

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
        EntityPrehistoricFloraAmmonite_Pachydiscus ee = (EntityPrehistoricFloraAmmonite_Pachydiscus) entitylivingbaseIn;

        if(ee.isReallyInWater()) {
            if (ee.getIsFast()) { //Running
                animRunning(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime);
            } else {
                animWalking(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime);
            }
        }

    }

    public void animWalking(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime) {
        EntityPrehistoricFloraAmmonite_Pachydiscus entity = (EntityPrehistoricFloraAmmonite_Pachydiscus) entitylivingbaseIn;
        int animCycle = 80;
        double tickAnim = (entity.ticksExisted + entity.getTickOffset()) - (int) (Math.floor((double) (entity.ticksExisted + entity.getTickOffset()) / (double) animCycle) * (double) animCycle) + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;
        this.setRotateAngle(shell, shell.rotateAngleX + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180))*5), shell.rotateAngleY + (float) Math.toRadians(0), shell.rotateAngleZ + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*90))*2.5));
        this.shell.rotationPointX = this.shell.rotationPointX + (float)(0);
        this.shell.rotationPointY = this.shell.rotationPointY - (float)(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180-90))*-1);
        this.shell.rotationPointZ = this.shell.rotationPointZ + (float)(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180-60))*3);


        this.setRotateAngle(mantle, mantle.rotateAngleX + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180+60))*-0.75), mantle.rotateAngleY + (float) Math.toRadians(0), mantle.rotateAngleZ + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*90))*-2.5));
        this.mantle.setScale((float)(1+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360))*0.01),(float)(1+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360))*0.01),(float)(1+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180))*-0.01));


        this.setRotateAngle(eyeRight, eyeRight.rotateAngleX + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180+30))*5), eyeRight.rotateAngleY + (float) Math.toRadians(60), eyeRight.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(eyeLeft, eyeLeft.rotateAngleX + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180+30))*5), eyeLeft.rotateAngleY + (float) Math.toRadians(-60), eyeLeft.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(finRight, finRight.rotateAngleX + (float) Math.toRadians(0), finRight.rotateAngleY + (float) Math.toRadians(0), finRight.rotateAngleZ + (float) Math.toRadians(20+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360))*30+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*720))*5));
        this.finRight.setScale((float)1,(float)1,(float)1.5);


        this.setRotateAngle(finLeft, finLeft.rotateAngleX + (float) Math.toRadians(0), finLeft.rotateAngleY + (float) Math.toRadians(0), finLeft.rotateAngleZ + (float) Math.toRadians(-20+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360))*-30+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*720))*-5));
        this.finLeft.setScale((float)1,(float)1,(float)1.5);


        this.setRotateAngle(Siphon, Siphon.rotateAngleX + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180+60))*2.5+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180))*-5), Siphon.rotateAngleY + (float) Math.toRadians(0), Siphon.rotateAngleZ + (float) Math.toRadians(0));
        this.Siphon.setScale((float)(1+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180-30))*0.05),(float)(1+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180-30))*0.05),(float)(0.7+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180-30))*0.08));


        this.setRotateAngle(Tentacle1a, Tentacle1a.rotateAngleX + (float) Math.toRadians(20+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360))*-2.5), Tentacle1a.rotateAngleY + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360))*-1.25), Tentacle1a.rotateAngleZ + (float) Math.toRadians(5));
        this.Tentacle1a.setScale((float)1.5,(float)1,(float)(1.05+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360+30))*-0.05));


        this.setRotateAngle(Tentacle1b, Tentacle1b.rotateAngleX + (float) Math.toRadians(-20+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360-60))*-5), Tentacle1b.rotateAngleY + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360-60))*1.25), Tentacle1b.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(Tentacle1c, Tentacle1c.rotateAngleX + (float) Math.toRadians(-10+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360-120))*-2.5), Tentacle1c.rotateAngleY + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360-120))*1.25), Tentacle1c.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(Tentacle2a, Tentacle2a.rotateAngleX + (float) Math.toRadians(-5+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360))*-2.5), Tentacle2a.rotateAngleY + (float) Math.toRadians(2.5+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360))*-2.5), Tentacle2a.rotateAngleZ + (float) Math.toRadians(0));
        this.Tentacle2a.setScale((float)1,(float)1.5,(float)(1.05+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360+30))*-0.05));


        this.setRotateAngle(Tentacle2b, Tentacle2b.rotateAngleX + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360-60))*-2.5), Tentacle2b.rotateAngleY + (float) Math.toRadians(-2.5+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360-60))*-2.5), Tentacle2b.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(Tentacle2c, Tentacle2c.rotateAngleX + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360-120))*-2.5), Tentacle2c.rotateAngleY + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360-120))*-2.5), Tentacle2c.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(Tentacle2d, Tentacle2d.rotateAngleX + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360-180))*-2.5), Tentacle2d.rotateAngleY + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360-180))*-2.5), Tentacle2d.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(Tentacle2e, Tentacle2e.rotateAngleX + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360-240))*-2.5), Tentacle2e.rotateAngleY + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360-240))*-2.5), Tentacle2e.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(Tentacle2f, Tentacle2f.rotateAngleX + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360-270))*-2.5), Tentacle2f.rotateAngleY + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360-270))*-2.5), Tentacle2f.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(Tentacle3a, Tentacle3a.rotateAngleX + (float) Math.toRadians(5), Tentacle3a.rotateAngleY + (float) Math.toRadians(-2.5+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360))*-2.5), Tentacle3a.rotateAngleZ + (float) Math.toRadians(0));
        this.Tentacle3a.setScale((float)1,(float)1.5,(float)(1.05+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360+30))*-0.05));


        this.setRotateAngle(Tentacle3b, Tentacle3b.rotateAngleX + (float) Math.toRadians(-5), Tentacle3b.rotateAngleY + (float) Math.toRadians(5+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360-60))*-2.5), Tentacle3b.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(Tentacle3c, Tentacle3c.rotateAngleX + (float) Math.toRadians(-5), Tentacle3c.rotateAngleY + (float) Math.toRadians(2.5+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360-120))*-2.5), Tentacle3c.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(Tentacle4a, Tentacle4a.rotateAngleX + (float) Math.toRadians(5+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360))*1.25), Tentacle4a.rotateAngleY + (float) Math.toRadians(2.5+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360))*-2.5), Tentacle4a.rotateAngleZ + (float) Math.toRadians(15));
        this.Tentacle4a.setScale((float)1,(float)1.5,(float)(1.05+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360+30))*-0.05));


        this.setRotateAngle(Tentacle4b, Tentacle4b.rotateAngleX + (float) Math.toRadians(-5+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360-60))*1.25), Tentacle4b.rotateAngleY + (float) Math.toRadians(2.5+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360-60))*-2.5), Tentacle4b.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(Tentacle4c, Tentacle4c.rotateAngleX + (float) Math.toRadians(-5+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360-120))*1.25), Tentacle4c.rotateAngleY + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360-120))*-2.5), Tentacle4c.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(Tentacle5a, Tentacle5a.rotateAngleX + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360))*2.5), Tentacle5a.rotateAngleY + (float) Math.toRadians(-1.25+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360))*-1.25), Tentacle5a.rotateAngleZ + (float) Math.toRadians(-5));
        this.Tentacle5a.rotationPointX = this.Tentacle5a.rotationPointX + (float)(0);
        this.Tentacle5a.rotationPointY = this.Tentacle5a.rotationPointY - (float)(0);
        this.Tentacle5a.rotationPointZ = this.Tentacle5a.rotationPointZ + (float)(0);
        this.Tentacle5a.setScale((float)1.5,(float)1,(float)(1.05+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360+30))*-0.05));


        this.setRotateAngle(Tentacle5b, Tentacle5b.rotateAngleX + (float) Math.toRadians(-5+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360-60))*2.5), Tentacle5b.rotateAngleY + (float) Math.toRadians(2.5), Tentacle5b.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(Tentacle5c, Tentacle5c.rotateAngleX + (float) Math.toRadians(-5+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360-120))*2.5), Tentacle5c.rotateAngleY + (float) Math.toRadians(0), Tentacle5c.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(Tentacle6a, Tentacle6a.rotateAngleX + (float) Math.toRadians(20+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360))*-2.5), Tentacle6a.rotateAngleY + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360))*1.25), Tentacle6a.rotateAngleZ + (float) Math.toRadians(-5));
        this.Tentacle6a.setScale((float)1.5,(float)1,(float)(1.05+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360+30))*-0.05));


        this.setRotateAngle(Tentacle6b, Tentacle6b.rotateAngleX + (float) Math.toRadians(-20+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360-60))*-5), Tentacle6b.rotateAngleY + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360-60))*-1.25), Tentacle6b.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(Tentacle6c, Tentacle6c.rotateAngleX + (float) Math.toRadians(-10+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360-120))*-2.5), Tentacle6c.rotateAngleY + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360-120))*-1.25), Tentacle6c.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(Tentacle7a, Tentacle7a.rotateAngleX + (float) Math.toRadians(-5+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360))*-2.5), Tentacle7a.rotateAngleY + (float) Math.toRadians(-2.5+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360))*2.5), Tentacle7a.rotateAngleZ + (float) Math.toRadians(0));
        this.Tentacle7a.setScale((float)1,(float)1.5,(float)(1.05+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360+30))*-0.05));


        this.setRotateAngle(Tentacle7b, Tentacle7b.rotateAngleX + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360-60))*-2.5), Tentacle7b.rotateAngleY + (float) Math.toRadians(2.5+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360-60))*2.5), Tentacle7b.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(Tentacle7c, Tentacle7c.rotateAngleX + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360-120))*-2.5), Tentacle7c.rotateAngleY + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360-120))*2.5), Tentacle7c.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(Tentacle7d, Tentacle7d.rotateAngleX + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360-180))*-2.5), Tentacle7d.rotateAngleY + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360-180))*2.5), Tentacle7d.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(Tentacle7e, Tentacle7e.rotateAngleX + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360-240))*-2.5), Tentacle7e.rotateAngleY + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360-240))*2.5), Tentacle7e.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(Tentacle7f, Tentacle7f.rotateAngleX + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360-270))*-2.5), Tentacle7f.rotateAngleY + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360-270))*2.5), Tentacle7f.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(Tentacle8a, Tentacle8a.rotateAngleX + (float) Math.toRadians(5), Tentacle8a.rotateAngleY + (float) Math.toRadians(2.5+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360))*2.5), Tentacle8a.rotateAngleZ + (float) Math.toRadians(0));
        this.Tentacle8a.setScale((float)1,(float)1.5,(float)(1.05+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360+30))*-0.05));


        this.setRotateAngle(Tentacle8b, Tentacle8b.rotateAngleX + (float) Math.toRadians(-5), Tentacle8b.rotateAngleY + (float) Math.toRadians(-5+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360-60))*2.5), Tentacle8b.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(Tentacle8c, Tentacle8c.rotateAngleX + (float) Math.toRadians(-5), Tentacle8c.rotateAngleY + (float) Math.toRadians(-2.5+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360-120))*2.5), Tentacle8c.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(Tentacle9a, Tentacle9a.rotateAngleX + (float) Math.toRadians(5+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360))*1.25), Tentacle9a.rotateAngleY + (float) Math.toRadians(-2.5+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360))*2.5), Tentacle9a.rotateAngleZ + (float) Math.toRadians(-15));
        this.Tentacle9a.setScale((float)1,(float)1.5,(float)(1.05+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360+30))*-0.05));


        this.setRotateAngle(Tentacle9b, Tentacle9b.rotateAngleX + (float) Math.toRadians(-5+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360-60))*1.25), Tentacle9b.rotateAngleY + (float) Math.toRadians(-2.5+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360-60))*2.5), Tentacle9b.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(Tentacle9c, Tentacle9c.rotateAngleX + (float) Math.toRadians(-5+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360-120))*1.25), Tentacle9c.rotateAngleY + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360-120))*2.5), Tentacle9c.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(Tentacle10a, Tentacle10a.rotateAngleX + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360))*2.5), Tentacle10a.rotateAngleY + (float) Math.toRadians(1.25+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360))*1.25), Tentacle10a.rotateAngleZ + (float) Math.toRadians(5));
        this.Tentacle10a.rotationPointX = this.Tentacle10a.rotationPointX + (float)(0);
        this.Tentacle10a.rotationPointY = this.Tentacle10a.rotationPointY - (float)(0);
        this.Tentacle10a.rotationPointZ = this.Tentacle10a.rotationPointZ + (float)(0);
        this.Tentacle10a.setScale((float)1.5,(float)1,(float)(1.05+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360+30))*-0.05));


        this.setRotateAngle(Tentacle10b, Tentacle10b.rotateAngleX + (float) Math.toRadians(-5+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360-60))*2.5), Tentacle10b.rotateAngleY + (float) Math.toRadians(-2.5), Tentacle10b.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(Tentacle10c, Tentacle10c.rotateAngleX + (float) Math.toRadians(-5+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360-120))*2.5), Tentacle10c.rotateAngleY + (float) Math.toRadians(0), Tentacle10c.rotateAngleZ + (float) Math.toRadians(0));

    }
    public void animRunning(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime) {
        EntityPrehistoricFloraAmmonite_Pachydiscus entity = (EntityPrehistoricFloraAmmonite_Pachydiscus) entitylivingbaseIn;
        int animCycle = 80;
        double tickAnim = (entity.ticksExisted + entity.getTickOffset()) - (int) (Math.floor((double) (entity.ticksExisted + entity.getTickOffset()) / (double) animCycle) * (double) animCycle) + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;

        if (tickAnim >= 0 && tickAnim < 30) {
            xx = Math.sin((Math.PI/180)*(((double)tickAnim/20)*360+60))*-5 + (((tickAnim - 0) / 30) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*360+60))*-5-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*360+60))*-5)));
            yy = 0 + (((tickAnim - 0) / 30) * (0-(0)));
            zz = Math.sin((Math.PI/180)*(((double)tickAnim/20)*90))*2.5 + (((tickAnim - 0) / 30) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*90))*2.5-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*90))*2.5)));
        }
        else if (tickAnim >= 30 && tickAnim < 40) {
            xx = Math.sin((Math.PI/180)*(((double)tickAnim/20)*360+60))*-5 + (((tickAnim - 30) / 10) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*180+60))*-2.5-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*360+60))*-5)));
            yy = 0 + (((tickAnim - 30) / 10) * (0-(0)));
            zz = Math.sin((Math.PI/180)*(((double)tickAnim/20)*90))*2.5 + (((tickAnim - 30) / 10) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*90))*-2.5-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*90))*2.5)));
        }
        else if (tickAnim >= 40 && tickAnim < 70) {
            xx = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180+60))*-2.5 + (((tickAnim - 40) / 30) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*180+60))*-2.5-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180+60))*-2.5)));
            yy = 0 + (((tickAnim - 40) / 30) * (0-(0)));
            zz = Math.sin((Math.PI/180)*(((double)tickAnim/20)*90))*-2.5 + (((tickAnim - 40) / 30) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*90))*-2.5-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*90))*-2.5)));
        }
        else if (tickAnim >= 70 && tickAnim < 80) {
            xx = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180+60))*-2.5 + (((tickAnim - 70) / 10) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*360+60))*-5-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180+60))*-2.5)));
            yy = 0 + (((tickAnim - 70) / 10) * (0-(0)));
            zz = Math.sin((Math.PI/180)*(((double)tickAnim/20)*90))*-2.5 + (((tickAnim - 70) / 10) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*90))*2.5-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*90))*-2.5)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(mantle, mantle.rotateAngleX + (float) Math.toRadians(xx), mantle.rotateAngleY + (float) Math.toRadians(yy), mantle.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 30) {
            xx = 1+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360+120))*-0.05 + (((tickAnim - 0) / 30) * (1+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360+120))*-0.05-(1+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360+120))*-0.05)));
            yy = 1+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360+120))*-0.05 + (((tickAnim - 0) / 30) * (1+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360+120))*-0.05-(1+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360+120))*-0.05)));
            zz = 1+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360+120))*0.03 + (((tickAnim - 0) / 30) * (1.3+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360+120))*0.03-(1+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360+120))*0.03)));
        }
        else if (tickAnim >= 30 && tickAnim < 40) {
            xx = 1+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360+120))*-0.05 + (((tickAnim - 30) / 10) * (1+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360))*0.05-(1+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360+120))*-0.05)));
            yy = 1+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360+120))*-0.05 + (((tickAnim - 30) / 10) * (1+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360))*0.05-(1+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360+120))*-0.05)));
            zz = 1.3+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360+120))*0.03 + (((tickAnim - 30) / 10) * (1.1+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180))*-0.01-(1.3+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360+120))*0.03)));
        }
        else if (tickAnim >= 40 && tickAnim < 70) {
            xx = 1+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360))*0.05 + (((tickAnim - 40) / 30) * (1+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360))*0.05-(1+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360))*0.05)));
            yy = 1+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360))*0.05 + (((tickAnim - 40) / 30) * (1+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360))*0.05-(1+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360))*0.05)));
            zz = 1.1+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180))*-0.01 + (((tickAnim - 40) / 30) * (1.1+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180))*-0.01-(1.1+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180))*-0.01)));
        }
        else if (tickAnim >= 70 && tickAnim < 80) {
            xx = 1+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360))*0.05 + (((tickAnim - 70) / 10) * (1+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360+120))*-0.05-(1+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360))*0.05)));
            yy = 1+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360))*0.05 + (((tickAnim - 70) / 10) * (1+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360+120))*-0.05-(1+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360))*0.05)));
            zz = 1.1+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180))*-0.01 + (((tickAnim - 70) / 10) * (1+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360+120))*0.03-(1.1+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180))*-0.01)));
        }
        else {
            xx = 1;
            yy = 1;
            zz = 1;
        }
        this.mantle.setScale((float)xx, (float)yy, (float)zz);




        if (tickAnim >= 0 && tickAnim < 30) {
            xx = Math.sin((Math.PI/180)*(((double)tickAnim/20)*360))*-5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360+60))*5 + (((tickAnim - 0) / 30) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*360))*-5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360+60))*5-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*360))*-5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360+60))*5)));
            yy = 0 + (((tickAnim - 0) / 30) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 30) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 40) {
            xx = Math.sin((Math.PI/180)*(((double)tickAnim/20)*360))*-5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360+60))*5 + (((tickAnim - 30) / 10) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*180+60))*2.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180))*-5-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*360))*-5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360+60))*5)));
            yy = 0 + (((tickAnim - 30) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 30) / 10) * (0-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 70) {
            xx = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180+60))*2.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180))*-5 + (((tickAnim - 40) / 30) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*180+60))*2.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180))*-5-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180+60))*2.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180))*-5)));
            yy = 0 + (((tickAnim - 40) / 30) * (0-(0)));
            zz = 0 + (((tickAnim - 40) / 30) * (0-(0)));
        }
        else if (tickAnim >= 70 && tickAnim < 80) {
            xx = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180+60))*2.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180))*-5 + (((tickAnim - 70) / 10) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*360))*-5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360+60))*5-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180+60))*2.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180))*-5)));
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
            xx = 1+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360+180))*-0.05 + (((tickAnim - 0) / 30) * (1+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360+180))*-0.05-(1+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360+180))*-0.05)));
            yy = 0.8+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360+180))*-0.02 + (((tickAnim - 0) / 30) * (0.8+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360+180))*-0.02-(0.8+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360+180))*-0.02)));
            zz = 0.8+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360+240))*0.02 + (((tickAnim - 0) / 30) * (0.8+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360+240))*0.02-(0.8+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360+240))*0.02)));
        }
        else if (tickAnim >= 30 && tickAnim < 40) {
            xx = 1+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360+180))*-0.05 + (((tickAnim - 30) / 10) * (1+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180-30))*0.05-(1+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360+180))*-0.05)));
            yy = 0.8+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360+180))*-0.02 + (((tickAnim - 30) / 10) * (1+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180-30))*0.02-(0.8+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360+180))*-0.02)));
            zz = 0.8+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360+240))*0.02 + (((tickAnim - 30) / 10) * (0.8+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180-30))*-0.01-(0.8+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360+240))*0.02)));
        }
        else if (tickAnim >= 40 && tickAnim < 70) {
            xx = 1+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180-30))*0.05 + (((tickAnim - 40) / 30) * (1+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180-30))*0.05-(1+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180-30))*0.05)));
            yy = 1+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180-30))*0.02 + (((tickAnim - 40) / 30) * (1+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180-30))*0.02-(1+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180-30))*0.02)));
            zz = 0.8+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180-30))*-0.01 + (((tickAnim - 40) / 30) * (0.8+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180-30))*-0.01-(0.8+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180-30))*-0.01)));
        }
        else if (tickAnim >= 70 && tickAnim < 80) {
            xx = 1+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180-30))*0.05 + (((tickAnim - 70) / 10) * (1+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360+180))*-0.05-(1+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180-30))*0.05)));
            yy = 1+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180-30))*0.02 + (((tickAnim - 70) / 10) * (0.8+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360+180))*-0.02-(1+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180-30))*0.02)));
            zz = 0.8+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180-30))*-0.01 + (((tickAnim - 70) / 10) * (0.8+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360+240))*0.02-(0.8+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180-30))*-0.01)));
        }
        else {
            xx = 1;
            yy = 1;
            zz = 1;
        }
        this.Siphon.setScale((float)xx, (float)yy, (float)zz);




        if (tickAnim >= 0 && tickAnim < 30) {
            xx = -20+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360+60))*30 + (((tickAnim - 0) / 30) * (-20+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360+60))*30-(-20+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360+60))*30)));
            yy = Math.sin((Math.PI/180)*(((double)tickAnim/20)*360+60))*-2.5 + (((tickAnim - 0) / 30) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*360+60))*-2.5-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*360+60))*-2.5)));
            zz = 10 + (((tickAnim - 0) / 30) * (10-(10)));
        }
        else if (tickAnim >= 30 && tickAnim < 40) {
            xx = -20+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360+60))*30 + (((tickAnim - 30) / 10) * (20+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360))*-2.5-(-20+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360+60))*30)));
            yy = Math.sin((Math.PI/180)*(((double)tickAnim/20)*360+60))*-2.5 + (((tickAnim - 30) / 10) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*360))*-1.25-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*360+60))*-2.5)));
            zz = 10 + (((tickAnim - 30) / 10) * (5-(10)));
        }
        else if (tickAnim >= 40 && tickAnim < 70) {
            xx = 20+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360))*-2.5 + (((tickAnim - 40) / 30) * (20+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360))*-2.5-(20+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360))*-2.5)));
            yy = Math.sin((Math.PI/180)*(((double)tickAnim/20)*360))*-1.25 + (((tickAnim - 40) / 30) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*360))*-1.25-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*360))*-1.25)));
            zz = 5 + (((tickAnim - 40) / 30) * (5-(5)));
        }
        else if (tickAnim >= 70 && tickAnim < 80) {
            xx = 20+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360))*-2.5 + (((tickAnim - 70) / 10) * (-20+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360+60))*30-(20+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360))*-2.5)));
            yy = Math.sin((Math.PI/180)*(((double)tickAnim/20)*360))*-1.25 + (((tickAnim - 70) / 10) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*360+60))*-2.5-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*360))*-1.25)));
            zz = 5 + (((tickAnim - 70) / 10) * (10-(5)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Tentacle1a, Tentacle1a.rotateAngleX + (float) Math.toRadians(xx), Tentacle1a.rotateAngleY + (float) Math.toRadians(yy), Tentacle1a.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 30) {
            xx = 1 + (((tickAnim - 0) / 30) * (1-(1)));
            yy = 1 + (((tickAnim - 0) / 30) * (1-(1)));
            zz = 1.1+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360+60))*0.1 + (((tickAnim - 0) / 30) * (1.1+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360+60))*0.1-(1.1+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360+60))*0.1)));
        }
        else if (tickAnim >= 30 && tickAnim < 40) {
            xx = 1 + (((tickAnim - 30) / 10) * (1.5-(1)));
            yy = 1 + (((tickAnim - 30) / 10) * (1-(1)));
            zz = 1.1+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360+60))*0.1 + (((tickAnim - 30) / 10) * (1.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360+30))*-0.05-(1.1+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360+60))*0.1)));
        }
        else if (tickAnim >= 40 && tickAnim < 70) {
            xx = 1.5 + (((tickAnim - 40) / 30) * (1.5-(1.5)));
            yy = 1 + (((tickAnim - 40) / 30) * (1-(1)));
            zz = 1.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360+30))*-0.05 + (((tickAnim - 40) / 30) * (1.05+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360+30))*-0.05-(1.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360+30))*-0.05)));
        }
        else if (tickAnim >= 70 && tickAnim < 80) {
            xx = 1.5 + (((tickAnim - 70) / 10) * (1-(1.5)));
            yy = 1 + (((tickAnim - 70) / 10) * (1-(1)));
            zz = 1.05+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360+30))*-0.05 + (((tickAnim - 70) / 10) * (1.1+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360+60))*0.1-(1.05+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360+30))*-0.05)));
        }
        else {
            xx = 1;
            yy = 1;
            zz = 1;
        }
        this.Tentacle1a.setScale((float)xx, (float)yy, (float)zz);




        if (tickAnim >= 0 && tickAnim < 30) {
            xx = -10+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360-60))*40 + (((tickAnim - 0) / 30) * (-10+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360-60))*40-(-10+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360-60))*40)));
            yy = 0 + (((tickAnim - 0) / 30) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 30) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 40) {
            xx = -10+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360-60))*40 + (((tickAnim - 30) / 10) * (-20+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360-60))*-5-(-10+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360-60))*40)));
            yy = 0 + (((tickAnim - 30) / 10) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*360-60))*1.25-(0)));
            zz = 0 + (((tickAnim - 30) / 10) * (0-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 70) {
            xx = -20+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360-60))*-5 + (((tickAnim - 40) / 30) * (-20+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360-60))*-5-(-20+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360-60))*-5)));
            yy = Math.sin((Math.PI/180)*(((double)tickAnim/20)*360-60))*1.25 + (((tickAnim - 40) / 30) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*360-60))*1.25-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*360-60))*1.25)));
            zz = 0 + (((tickAnim - 40) / 30) * (0-(0)));
        }
        else if (tickAnim >= 70 && tickAnim < 80) {
            xx = -20+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360-60))*-5 + (((tickAnim - 70) / 10) * (-10+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360-60))*40-(-20+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360-60))*-5)));
            yy = Math.sin((Math.PI/180)*(((double)tickAnim/20)*360-60))*1.25 + (((tickAnim - 70) / 10) * (0-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*360-60))*1.25)));
            zz = 0 + (((tickAnim - 70) / 10) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Tentacle1b, Tentacle1b.rotateAngleX + (float) Math.toRadians(xx), Tentacle1b.rotateAngleY + (float) Math.toRadians(yy), Tentacle1b.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 30) {
            xx = -10+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360-90))*40 + (((tickAnim - 0) / 30) * (-10+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360-90))*40-(-10+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360-90))*40)));
            yy = 0 + (((tickAnim - 0) / 30) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 30) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 40) {
            xx = -10+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360-90))*40 + (((tickAnim - 30) / 10) * (-10+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360-120))*-2.5-(-10+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360-90))*40)));
            yy = 0 + (((tickAnim - 30) / 10) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*360-120))*1.25-(0)));
            zz = 0 + (((tickAnim - 30) / 10) * (0-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 70) {
            xx = -10+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360-120))*-2.5 + (((tickAnim - 40) / 30) * (-10+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360-120))*-2.5-(-10+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360-120))*-2.5)));
            yy = Math.sin((Math.PI/180)*(((double)tickAnim/20)*360-120))*1.25 + (((tickAnim - 40) / 30) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*360-120))*1.25-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*360-120))*1.25)));
            zz = 0 + (((tickAnim - 40) / 30) * (0-(0)));
        }
        else if (tickAnim >= 70 && tickAnim < 80) {
            xx = -10+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360-120))*-2.5 + (((tickAnim - 70) / 10) * (-10+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360-90))*40-(-10+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360-120))*-2.5)));
            yy = Math.sin((Math.PI/180)*(((double)tickAnim/20)*360-120))*1.25 + (((tickAnim - 70) / 10) * (0-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*360-120))*1.25)));
            zz = 0 + (((tickAnim - 70) / 10) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Tentacle1c, Tentacle1c.rotateAngleX + (float) Math.toRadians(xx), Tentacle1c.rotateAngleY + (float) Math.toRadians(yy), Tentacle1c.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 30) {
            xx = -5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360+60))*5 + (((tickAnim - 0) / 30) * (-5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360+60))*5-(-5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360+60))*5)));
            yy = -20+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360+60))*20 + (((tickAnim - 0) / 30) * (-20+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360+60))*20-(-20+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360+60))*20)));
            zz = -20 + (((tickAnim - 0) / 30) * (-20-(-20)));
        }
        else if (tickAnim >= 30 && tickAnim < 70) {
            xx = -5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360+60))*5 + (((tickAnim - 30) / 40) * (-5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360))*-2.5-(-5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360+60))*5)));
            yy = -20+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360+60))*20 + (((tickAnim - 30) / 40) * (2.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360))*-2.5-(-20+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360+60))*20)));
            zz = -20 + (((tickAnim - 30) / 40) * (0-(-20)));
        }
        else if (tickAnim >= 70 && tickAnim < 80) {
            xx = -5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360))*-2.5 + (((tickAnim - 70) / 10) * (-5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360+60))*5-(-5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360))*-2.5)));
            yy = 2.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360))*-2.5 + (((tickAnim - 70) / 10) * (-20+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360+60))*20-(2.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360))*-2.5)));
            zz = 0 + (((tickAnim - 70) / 10) * (-20-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Tentacle2a, Tentacle2a.rotateAngleX + (float) Math.toRadians(xx), Tentacle2a.rotateAngleY + (float) Math.toRadians(yy), Tentacle2a.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 30) {
            xx = 1 + (((tickAnim - 0) / 30) * (1-(1)));
            yy = 1 + (((tickAnim - 0) / 30) * (1-(1)));
            zz = 1.1+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360+60))*0.1 + (((tickAnim - 0) / 30) * (1.1+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360+60))*0.1-(1.1+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360+60))*0.1)));
        }
        else if (tickAnim >= 30 && tickAnim < 40) {
            xx = 1 + (((tickAnim - 30) / 10) * (1-(1)));
            yy = 1 + (((tickAnim - 30) / 10) * (1.5-(1)));
            zz = 1.1+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360+60))*0.1 + (((tickAnim - 30) / 10) * (1.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360+30))*-0.05-(1.1+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360+60))*0.1)));
        }
        else if (tickAnim >= 40 && tickAnim < 80) {
            xx = 1 + (((tickAnim - 40) / 40) * (1-(1)));
            yy = 1.5 + (((tickAnim - 40) / 40) * (1-(1.5)));
            zz = 1.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360+30))*-0.05 + (((tickAnim - 40) / 40) * (1.1+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360+60))*0.1-(1.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360+30))*-0.05)));
        }
        else {
            xx = 1;
            yy = 1;
            zz = 1;
        }
        this.Tentacle2a.setScale((float)xx, (float)yy, (float)zz);




        if (tickAnim >= 0 && tickAnim < 30) {
            xx = 0 + (((tickAnim - 0) / 30) * (0-(0)));
            yy = -10+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360-60))*30 + (((tickAnim - 0) / 30) * (-10+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360-60))*30-(-10+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360-60))*30)));
            zz = 0 + (((tickAnim - 0) / 30) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 70) {
            xx = 0 + (((tickAnim - 30) / 40) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*360-60))*-2.5-(0)));
            yy = -10+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360-60))*30 + (((tickAnim - 30) / 40) * (-2.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360-60))*-2.5-(-10+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360-60))*30)));
            zz = 0 + (((tickAnim - 30) / 40) * (0-(0)));
        }
        else if (tickAnim >= 70 && tickAnim < 80) {
            xx = Math.sin((Math.PI/180)*(((double)tickAnim/20)*360-60))*-2.5 + (((tickAnim - 70) / 10) * (0-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*360-60))*-2.5)));
            yy = -2.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360-60))*-2.5 + (((tickAnim - 70) / 10) * (-10+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360-60))*30-(-2.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360-60))*-2.5)));
            zz = 0 + (((tickAnim - 70) / 10) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Tentacle2b, Tentacle2b.rotateAngleX + (float) Math.toRadians(xx), Tentacle2b.rotateAngleY + (float) Math.toRadians(yy), Tentacle2b.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 30) {
            xx = 0 + (((tickAnim - 0) / 30) * (0-(0)));
            yy = -10+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360-90))*30 + (((tickAnim - 0) / 30) * (-10+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360-90))*30-(-10+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360-90))*30)));
            zz = 0 + (((tickAnim - 0) / 30) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 70) {
            xx = 0 + (((tickAnim - 30) / 40) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*360-120))*-2.5-(0)));
            yy = -10+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360-90))*30 + (((tickAnim - 30) / 40) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*360-120))*-2.5-(-10+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360-90))*30)));
            zz = 0 + (((tickAnim - 30) / 40) * (0-(0)));
        }
        else if (tickAnim >= 70 && tickAnim < 80) {
            xx = Math.sin((Math.PI/180)*(((double)tickAnim/20)*360-120))*-2.5 + (((tickAnim - 70) / 10) * (0-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*360-120))*-2.5)));
            yy = Math.sin((Math.PI/180)*(((double)tickAnim/20)*360-120))*-2.5 + (((tickAnim - 70) / 10) * (-10+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360-90))*30-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*360-120))*-2.5)));
            zz = 0 + (((tickAnim - 70) / 10) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Tentacle2c, Tentacle2c.rotateAngleX + (float) Math.toRadians(xx), Tentacle2c.rotateAngleY + (float) Math.toRadians(yy), Tentacle2c.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 30) {
            xx = 0 + (((tickAnim - 0) / 30) * (0-(0)));
            yy = -20+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360+60))*30 + (((tickAnim - 0) / 30) * (-20+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360+60))*30-(-20+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360+60))*30)));
            zz = 0 + (((tickAnim - 0) / 30) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 40) {
            xx = 0 + (((tickAnim - 30) / 10) * (5-(0)));
            yy = -20+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360+60))*30 + (((tickAnim - 30) / 10) * (-2.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360))*-2.5-(-20+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360+60))*30)));
            zz = 0 + (((tickAnim - 30) / 10) * (0-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 70) {
            xx = 5 + (((tickAnim - 40) / 30) * (5-(5)));
            yy = -2.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360))*-2.5 + (((tickAnim - 40) / 30) * (-2.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360))*-2.5-(-2.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360))*-2.5)));
            zz = 0 + (((tickAnim - 40) / 30) * (0-(0)));
        }
        else if (tickAnim >= 70 && tickAnim < 80) {
            xx = 5 + (((tickAnim - 70) / 10) * (0-(5)));
            yy = -2.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360))*-2.5 + (((tickAnim - 70) / 10) * (-20+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360+60))*30-(-2.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360))*-2.5)));
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
            yy = 1 + (((tickAnim - 0) / 30) * (1-(1)));
            zz = 1.1+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360+60))*0.1 + (((tickAnim - 0) / 30) * (1.1+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360+60))*0.1-(1.1+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360+60))*0.1)));
        }
        else if (tickAnim >= 30 && tickAnim < 40) {
            xx = 1 + (((tickAnim - 30) / 10) * (1-(1)));
            yy = 1 + (((tickAnim - 30) / 10) * (1.5-(1)));
            zz = 1.1+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360+60))*0.1 + (((tickAnim - 30) / 10) * (1.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360+30))*-0.05-(1.1+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360+60))*0.1)));
        }
        else if (tickAnim >= 40 && tickAnim < 70) {
            xx = 1 + (((tickAnim - 40) / 30) * (1-(1)));
            yy = 1.5 + (((tickAnim - 40) / 30) * (1.5-(1.5)));
            zz = 1.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360+30))*-0.05 + (((tickAnim - 40) / 30) * (1.05+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360+30))*-0.05-(1.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360+30))*-0.05)));
        }
        else if (tickAnim >= 70 && tickAnim < 80) {
            xx = 1 + (((tickAnim - 70) / 10) * (1-(1)));
            yy = 1.5 + (((tickAnim - 70) / 10) * (1-(1.5)));
            zz = 1.05+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360+30))*-0.05 + (((tickAnim - 70) / 10) * (1.1+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360+60))*0.1-(1.05+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360+30))*-0.05)));
        }
        else {
            xx = 1;
            yy = 1;
            zz = 1;
        }
        this.Tentacle3a.setScale((float)xx, (float)yy, (float)zz);




        if (tickAnim >= 0 && tickAnim < 30) {
            xx = 0 + (((tickAnim - 0) / 30) * (0-(0)));
            yy = -10+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360-60))*40 + (((tickAnim - 0) / 30) * (-10+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360-60))*40-(-10+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360-60))*40)));
            zz = 0 + (((tickAnim - 0) / 30) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 40) {
            xx = 0 + (((tickAnim - 30) / 10) * (-5-(0)));
            yy = -10+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360-60))*40 + (((tickAnim - 30) / 10) * (5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360-60))*-2.5-(-10+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360-60))*40)));
            zz = 0 + (((tickAnim - 30) / 10) * (0-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 70) {
            xx = -5 + (((tickAnim - 40) / 30) * (-5-(-5)));
            yy = 5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360-60))*-2.5 + (((tickAnim - 40) / 30) * (5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360-60))*-2.5-(5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360-60))*-2.5)));
            zz = 0 + (((tickAnim - 40) / 30) * (0-(0)));
        }
        else if (tickAnim >= 70 && tickAnim < 80) {
            xx = -5 + (((tickAnim - 70) / 10) * (0-(-5)));
            yy = 5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360-60))*-2.5 + (((tickAnim - 70) / 10) * (-10+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360-60))*40-(5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360-60))*-2.5)));
            zz = 0 + (((tickAnim - 70) / 10) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Tentacle3b, Tentacle3b.rotateAngleX + (float) Math.toRadians(xx), Tentacle3b.rotateAngleY + (float) Math.toRadians(yy), Tentacle3b.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 30) {
            xx = 0 + (((tickAnim - 0) / 30) * (0-(0)));
            yy = -10+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360-90))*40 + (((tickAnim - 0) / 30) * (-10+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360-90))*40-(-10+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360-90))*40)));
            zz = 0 + (((tickAnim - 0) / 30) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 40) {
            xx = 0 + (((tickAnim - 30) / 10) * (-5-(0)));
            yy = -10+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360-90))*40 + (((tickAnim - 30) / 10) * (2.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360-120))*-2.5-(-10+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360-90))*40)));
            zz = 0 + (((tickAnim - 30) / 10) * (0-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 70) {
            xx = -5 + (((tickAnim - 40) / 30) * (-5-(-5)));
            yy = 2.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360-120))*-2.5 + (((tickAnim - 40) / 30) * (2.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360-120))*-2.5-(2.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360-120))*-2.5)));
            zz = 0 + (((tickAnim - 40) / 30) * (0-(0)));
        }
        else if (tickAnim >= 70 && tickAnim < 80) {
            xx = -5 + (((tickAnim - 70) / 10) * (0-(-5)));
            yy = 2.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360-120))*-2.5 + (((tickAnim - 70) / 10) * (-10+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360-90))*40-(2.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360-120))*-2.5)));
            zz = 0 + (((tickAnim - 70) / 10) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Tentacle3c, Tentacle3c.rotateAngleX + (float) Math.toRadians(xx), Tentacle3c.rotateAngleY + (float) Math.toRadians(yy), Tentacle3c.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 30) {
            xx = 5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360+60))*-5 + (((tickAnim - 0) / 30) * (5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360+60))*-5-(5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360+60))*-5)));
            yy = -20+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360+60))*30 + (((tickAnim - 0) / 30) * (-20+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360+60))*30-(-20+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360+60))*30)));
            zz = 20 + (((tickAnim - 0) / 30) * (20-(20)));
        }
        else if (tickAnim >= 30 && tickAnim < 40) {
            xx = 5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360+60))*-5 + (((tickAnim - 30) / 10) * (5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360))*1.25-(5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360+60))*-5)));
            yy = -20+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360+60))*30 + (((tickAnim - 30) / 10) * (2.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360))*-2.5-(-20+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360+60))*30)));
            zz = 20 + (((tickAnim - 30) / 10) * (15-(20)));
        }
        else if (tickAnim >= 40 && tickAnim < 70) {
            xx = 5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360))*1.25 + (((tickAnim - 40) / 30) * (5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360))*1.25-(5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360))*1.25)));
            yy = 2.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360))*-2.5 + (((tickAnim - 40) / 30) * (2.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360))*-2.5-(2.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360))*-2.5)));
            zz = 15 + (((tickAnim - 40) / 30) * (15-(15)));
        }
        else if (tickAnim >= 70 && tickAnim < 80) {
            xx = 5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360))*1.25 + (((tickAnim - 70) / 10) * (5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360+60))*-5-(5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360))*1.25)));
            yy = 2.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360))*-2.5 + (((tickAnim - 70) / 10) * (-20+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360+60))*30-(2.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360))*-2.5)));
            zz = 15 + (((tickAnim - 70) / 10) * (20-(15)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Tentacle4a, Tentacle4a.rotateAngleX + (float) Math.toRadians(xx), Tentacle4a.rotateAngleY + (float) Math.toRadians(yy), Tentacle4a.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 30) {
            xx = 1 + (((tickAnim - 0) / 30) * (1-(1)));
            yy = 1 + (((tickAnim - 0) / 30) * (1-(1)));
            zz = 1.1+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360+60))*0.1 + (((tickAnim - 0) / 30) * (1.1+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360+60))*0.1-(1.1+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360+60))*0.1)));
        }
        else if (tickAnim >= 30 && tickAnim < 40) {
            xx = 1 + (((tickAnim - 30) / 10) * (1-(1)));
            yy = 1 + (((tickAnim - 30) / 10) * (1.5-(1)));
            zz = 1.1+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360+60))*0.1 + (((tickAnim - 30) / 10) * (1.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360+30))*-0.05-(1.1+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360+60))*0.1)));
        }
        else if (tickAnim >= 40 && tickAnim < 70) {
            xx = 1 + (((tickAnim - 40) / 30) * (1-(1)));
            yy = 1.5 + (((tickAnim - 40) / 30) * (1.5-(1.5)));
            zz = 1.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360+30))*-0.05 + (((tickAnim - 40) / 30) * (1.05+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360+30))*-0.05-(1.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360+30))*-0.05)));
        }
        else if (tickAnim >= 70 && tickAnim < 80) {
            xx = 1 + (((tickAnim - 70) / 10) * (1-(1)));
            yy = 1.5 + (((tickAnim - 70) / 10) * (1-(1.5)));
            zz = 1.05+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360+30))*-0.05 + (((tickAnim - 70) / 10) * (1.1+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360+60))*0.1-(1.05+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360+30))*-0.05)));
        }
        else {
            xx = 1;
            yy = 1;
            zz = 1;
        }
        this.Tentacle4a.setScale((float)xx, (float)yy, (float)zz);




        if (tickAnim >= 0 && tickAnim < 30) {
            xx = 0 + (((tickAnim - 0) / 30) * (0-(0)));
            yy = -10+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360-60))*40 + (((tickAnim - 0) / 30) * (-10+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360-60))*40-(-10+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360-60))*40)));
            zz = 0 + (((tickAnim - 0) / 30) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 40) {
            xx = 0 + (((tickAnim - 30) / 10) * (-5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360-60))*1.25-(0)));
            yy = -10+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360-60))*40 + (((tickAnim - 30) / 10) * (2.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360-60))*-2.5-(-10+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360-60))*40)));
            zz = 0 + (((tickAnim - 30) / 10) * (0-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 70) {
            xx = -5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360-60))*1.25 + (((tickAnim - 40) / 30) * (-5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360-60))*1.25-(-5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360-60))*1.25)));
            yy = 2.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360-60))*-2.5 + (((tickAnim - 40) / 30) * (2.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360-60))*-2.5-(2.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360-60))*-2.5)));
            zz = 0 + (((tickAnim - 40) / 30) * (0-(0)));
        }
        else if (tickAnim >= 70 && tickAnim < 80) {
            xx = -5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360-60))*1.25 + (((tickAnim - 70) / 10) * (0-(-5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360-60))*1.25)));
            yy = 2.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360-60))*-2.5 + (((tickAnim - 70) / 10) * (-10+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360-60))*40-(2.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360-60))*-2.5)));
            zz = 0 + (((tickAnim - 70) / 10) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Tentacle4b, Tentacle4b.rotateAngleX + (float) Math.toRadians(xx), Tentacle4b.rotateAngleY + (float) Math.toRadians(yy), Tentacle4b.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 30) {
            xx = 0 + (((tickAnim - 0) / 30) * (0-(0)));
            yy = -10+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360-90))*40 + (((tickAnim - 0) / 30) * (-10+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360-90))*40-(-10+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360-90))*40)));
            zz = 0 + (((tickAnim - 0) / 30) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 40) {
            xx = 0 + (((tickAnim - 30) / 10) * (-5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360-120))*1.25-(0)));
            yy = -10+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360-90))*40 + (((tickAnim - 30) / 10) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*360-120))*-2.5-(-10+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360-90))*40)));
            zz = 0 + (((tickAnim - 30) / 10) * (0-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 70) {
            xx = -5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360-120))*1.25 + (((tickAnim - 40) / 30) * (-5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360-120))*1.25-(-5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360-120))*1.25)));
            yy = Math.sin((Math.PI/180)*(((double)tickAnim/20)*360-120))*-2.5 + (((tickAnim - 40) / 30) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*360-120))*-2.5-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*360-120))*-2.5)));
            zz = 0 + (((tickAnim - 40) / 30) * (0-(0)));
        }
        else if (tickAnim >= 70 && tickAnim < 80) {
            xx = -5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360-120))*1.25 + (((tickAnim - 70) / 10) * (0-(-5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360-120))*1.25)));
            yy = Math.sin((Math.PI/180)*(((double)tickAnim/20)*360-120))*-2.5 + (((tickAnim - 70) / 10) * (-10+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360-90))*40-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*360-120))*-2.5)));
            zz = 0 + (((tickAnim - 70) / 10) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Tentacle4c, Tentacle4c.rotateAngleX + (float) Math.toRadians(xx), Tentacle4c.rotateAngleY + (float) Math.toRadians(yy), Tentacle4c.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 30) {
            xx = 20+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360+60))*-30 + (((tickAnim - 0) / 30) * (20+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360+60))*-30-(20+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360+60))*-30)));
            yy = Math.sin((Math.PI/180)*(((double)tickAnim/20)*360+60))*-2.5 + (((tickAnim - 0) / 30) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*360+60))*-2.5-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*360+60))*-2.5)));
            zz = -10 + (((tickAnim - 0) / 30) * (-10-(-10)));
        }
        else if (tickAnim >= 30 && tickAnim < 40) {
            xx = 20+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360+60))*-30 + (((tickAnim - 30) / 10) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*360))*2.5-(20+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360+60))*-30)));
            yy = Math.sin((Math.PI/180)*(((double)tickAnim/20)*360+60))*-2.5 + (((tickAnim - 30) / 10) * (-1.25+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360))*-1.25-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*360+60))*-2.5)));
            zz = -10 + (((tickAnim - 30) / 10) * (-5-(-10)));
        }
        else if (tickAnim >= 40 && tickAnim < 70) {
            xx = Math.sin((Math.PI/180)*(((double)tickAnim/20)*360))*2.5 + (((tickAnim - 40) / 30) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*360))*2.5-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*360))*2.5)));
            yy = -1.25+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360))*-1.25 + (((tickAnim - 40) / 30) * (-1.25+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360))*-1.25-(-1.25+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360))*-1.25)));
            zz = -5 + (((tickAnim - 40) / 30) * (-5-(-5)));
        }
        else if (tickAnim >= 70 && tickAnim < 80) {
            xx = Math.sin((Math.PI/180)*(((double)tickAnim/20)*360))*2.5 + (((tickAnim - 70) / 10) * (20+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360+60))*-30-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*360))*2.5)));
            yy = -1.25+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360))*-1.25 + (((tickAnim - 70) / 10) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*360+60))*-2.5-(-1.25+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360))*-1.25)));
            zz = -5 + (((tickAnim - 70) / 10) * (-10-(-5)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Tentacle5a, Tentacle5a.rotateAngleX + (float) Math.toRadians(xx), Tentacle5a.rotateAngleY + (float) Math.toRadians(yy), Tentacle5a.rotateAngleZ + (float) Math.toRadians(zz));


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
        this.Tentacle5a.rotationPointX = this.Tentacle5a.rotationPointX + (float)(xx);
        this.Tentacle5a.rotationPointY = this.Tentacle5a.rotationPointY - (float)(yy);
        this.Tentacle5a.rotationPointZ = this.Tentacle5a.rotationPointZ + (float)(zz);


        if (tickAnim >= 0 && tickAnim < 30) {
            xx = 1 + (((tickAnim - 0) / 30) * (1-(1)));
            yy = 1 + (((tickAnim - 0) / 30) * (1-(1)));
            zz = 1.1+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360+60))*0.1 + (((tickAnim - 0) / 30) * (1.1+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360+60))*0.1-(1.1+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360+60))*0.1)));
        }
        else if (tickAnim >= 30 && tickAnim < 40) {
            xx = 1 + (((tickAnim - 30) / 10) * (1.5-(1)));
            yy = 1 + (((tickAnim - 30) / 10) * (1-(1)));
            zz = 1.1+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360+60))*0.1 + (((tickAnim - 30) / 10) * (1.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360+30))*-0.05-(1.1+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360+60))*0.1)));
        }
        else if (tickAnim >= 40 && tickAnim < 70) {
            xx = 1.5 + (((tickAnim - 40) / 30) * (1.5-(1.5)));
            yy = 1 + (((tickAnim - 40) / 30) * (1-(1)));
            zz = 1.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360+30))*-0.05 + (((tickAnim - 40) / 30) * (1.05+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360+30))*-0.05-(1.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360+30))*-0.05)));
        }
        else if (tickAnim >= 70 && tickAnim < 80) {
            xx = 1.5 + (((tickAnim - 70) / 10) * (1-(1.5)));
            yy = 1 + (((tickAnim - 70) / 10) * (1-(1)));
            zz = 1.05+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360+30))*-0.05 + (((tickAnim - 70) / 10) * (1.1+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360+60))*0.1-(1.05+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360+30))*-0.05)));
        }
        else {
            xx = 1;
            yy = 1;
            zz = 1;
        }
        this.Tentacle5a.setScale((float)xx, (float)yy, (float)zz);




        if (tickAnim >= 0 && tickAnim < 30) {
            xx = 10+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360-60))*-40 + (((tickAnim - 0) / 30) * (10+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360-60))*-40-(10+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360-60))*-40)));
            yy = 0 + (((tickAnim - 0) / 30) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 30) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 40) {
            xx = 10+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360-60))*-40 + (((tickAnim - 30) / 10) * (-5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360-60))*2.5-(10+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360-60))*-40)));
            yy = 0 + (((tickAnim - 30) / 10) * (2.5-(0)));
            zz = 0 + (((tickAnim - 30) / 10) * (0-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 70) {
            xx = -5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360-60))*2.5 + (((tickAnim - 40) / 30) * (-5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360-60))*2.5-(-5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360-60))*2.5)));
            yy = 2.5 + (((tickAnim - 40) / 30) * (2.5-(2.5)));
            zz = 0 + (((tickAnim - 40) / 30) * (0-(0)));
        }
        else if (tickAnim >= 70 && tickAnim < 80) {
            xx = -5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360-60))*2.5 + (((tickAnim - 70) / 10) * (10+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360-60))*-40-(-5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360-60))*2.5)));
            yy = 2.5 + (((tickAnim - 70) / 10) * (0-(2.5)));
            zz = 0 + (((tickAnim - 70) / 10) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Tentacle5b, Tentacle5b.rotateAngleX + (float) Math.toRadians(xx), Tentacle5b.rotateAngleY + (float) Math.toRadians(yy), Tentacle5b.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 30) {
            xx = 10+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360-90))*-40 + (((tickAnim - 0) / 30) * (10+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360-90))*-40-(10+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360-90))*-40)));
            yy = 0 + (((tickAnim - 0) / 30) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 30) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 40) {
            xx = 10+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360-90))*-40 + (((tickAnim - 30) / 10) * (-5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360-120))*2.5-(10+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360-90))*-40)));
            yy = 0 + (((tickAnim - 30) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 30) / 10) * (0-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 70) {
            xx = -5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360-120))*2.5 + (((tickAnim - 40) / 30) * (-5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360-120))*2.5-(-5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360-120))*2.5)));
            yy = 0 + (((tickAnim - 40) / 30) * (0-(0)));
            zz = 0 + (((tickAnim - 40) / 30) * (0-(0)));
        }
        else if (tickAnim >= 70 && tickAnim < 80) {
            xx = -5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360-120))*2.5 + (((tickAnim - 70) / 10) * (10+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360-90))*-40-(-5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360-120))*2.5)));
            yy = 0 + (((tickAnim - 70) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 70) / 10) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Tentacle5c, Tentacle5c.rotateAngleX + (float) Math.toRadians(xx), Tentacle5c.rotateAngleY + (float) Math.toRadians(yy), Tentacle5c.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 30) {
            xx = -20+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360+60))*30 + (((tickAnim - 0) / 30) * (-20+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360+60))*30-(-20+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360+60))*30)));
            yy = Math.sin((Math.PI/180)*(((double)tickAnim/20)*360+60))*2.5 + (((tickAnim - 0) / 30) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*360+60))*2.5-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*360+60))*2.5)));
            zz = -10 + (((tickAnim - 0) / 30) * (-10-(-10)));
        }
        else if (tickAnim >= 30 && tickAnim < 40) {
            xx = -20+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360+60))*30 + (((tickAnim - 30) / 10) * (20+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360))*-2.5-(-20+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360+60))*30)));
            yy = Math.sin((Math.PI/180)*(((double)tickAnim/20)*360+60))*2.5 + (((tickAnim - 30) / 10) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*360))*1.25-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*360+60))*2.5)));
            zz = -10 + (((tickAnim - 30) / 10) * (-5-(-10)));
        }
        else if (tickAnim >= 40 && tickAnim < 70) {
            xx = 20+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360))*-2.5 + (((tickAnim - 40) / 30) * (20+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360))*-2.5-(20+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360))*-2.5)));
            yy = Math.sin((Math.PI/180)*(((double)tickAnim/20)*360))*1.25 + (((tickAnim - 40) / 30) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*360))*1.25-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*360))*1.25)));
            zz = -5 + (((tickAnim - 40) / 30) * (-5-(-5)));
        }
        else if (tickAnim >= 70 && tickAnim < 80) {
            xx = 20+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360))*-2.5 + (((tickAnim - 70) / 10) * (-20+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360+60))*30-(20+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360))*-2.5)));
            yy = Math.sin((Math.PI/180)*(((double)tickAnim/20)*360))*1.25 + (((tickAnim - 70) / 10) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*360+60))*2.5-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*360))*1.25)));
            zz = -5 + (((tickAnim - 70) / 10) * (-10-(-5)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Tentacle6a, Tentacle6a.rotateAngleX + (float) Math.toRadians(xx), Tentacle6a.rotateAngleY + (float) Math.toRadians(yy), Tentacle6a.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 30) {
            xx = 1 + (((tickAnim - 0) / 30) * (1-(1)));
            yy = 1 + (((tickAnim - 0) / 30) * (1-(1)));
            zz = 1.1+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360+60))*0.1 + (((tickAnim - 0) / 30) * (1.1+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360+60))*0.1-(1.1+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360+60))*0.1)));
        }
        else if (tickAnim >= 30 && tickAnim < 40) {
            xx = 1 + (((tickAnim - 30) / 10) * (1.5-(1)));
            yy = 1 + (((tickAnim - 30) / 10) * (1-(1)));
            zz = 1.1+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360+60))*0.1 + (((tickAnim - 30) / 10) * (1.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360+30))*-0.05-(1.1+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360+60))*0.1)));
        }
        else if (tickAnim >= 40 && tickAnim < 70) {
            xx = 1.5 + (((tickAnim - 40) / 30) * (1.5-(1.5)));
            yy = 1 + (((tickAnim - 40) / 30) * (1-(1)));
            zz = 1.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360+30))*-0.05 + (((tickAnim - 40) / 30) * (1.05+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360+30))*-0.05-(1.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360+30))*-0.05)));
        }
        else if (tickAnim >= 70 && tickAnim < 80) {
            xx = 1.5 + (((tickAnim - 70) / 10) * (1-(1.5)));
            yy = 1 + (((tickAnim - 70) / 10) * (1-(1)));
            zz = 1.05+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360+30))*-0.05 + (((tickAnim - 70) / 10) * (1.1+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360+60))*0.1-(1.05+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360+30))*-0.05)));
        }
        else {
            xx = 1;
            yy = 1;
            zz = 1;
        }
        this.Tentacle6a.setScale((float)xx, (float)yy, (float)zz);




        if (tickAnim >= 0 && tickAnim < 30) {
            xx = -10+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360-60))*40 + (((tickAnim - 0) / 30) * (-10+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360-60))*40-(-10+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360-60))*40)));
            yy = 0 + (((tickAnim - 0) / 30) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 30) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 40) {
            xx = -10+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360-60))*40 + (((tickAnim - 30) / 10) * (-20+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360-60))*-5-(-10+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360-60))*40)));
            yy = 0 + (((tickAnim - 30) / 10) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*360-60))*-1.25-(0)));
            zz = 0 + (((tickAnim - 30) / 10) * (0-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 70) {
            xx = -20+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360-60))*-5 + (((tickAnim - 40) / 30) * (-20+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360-60))*-5-(-20+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360-60))*-5)));
            yy = Math.sin((Math.PI/180)*(((double)tickAnim/20)*360-60))*-1.25 + (((tickAnim - 40) / 30) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*360-60))*-1.25-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*360-60))*-1.25)));
            zz = 0 + (((tickAnim - 40) / 30) * (0-(0)));
        }
        else if (tickAnim >= 70 && tickAnim < 80) {
            xx = -20+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360-60))*-5 + (((tickAnim - 70) / 10) * (-10+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360-60))*40-(-20+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360-60))*-5)));
            yy = Math.sin((Math.PI/180)*(((double)tickAnim/20)*360-60))*-1.25 + (((tickAnim - 70) / 10) * (0-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*360-60))*-1.25)));
            zz = 0 + (((tickAnim - 70) / 10) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Tentacle6b, Tentacle6b.rotateAngleX + (float) Math.toRadians(xx), Tentacle6b.rotateAngleY + (float) Math.toRadians(yy), Tentacle6b.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 30) {
            xx = -10+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360-90))*40 + (((tickAnim - 0) / 30) * (-10+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360-90))*40-(-10+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360-90))*40)));
            yy = 0 + (((tickAnim - 0) / 30) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 30) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 40) {
            xx = -10+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360-90))*40 + (((tickAnim - 30) / 10) * (-10+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360-120))*-2.5-(-10+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360-90))*40)));
            yy = 0 + (((tickAnim - 30) / 10) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*360-120))*-1.25-(0)));
            zz = 0 + (((tickAnim - 30) / 10) * (0-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 70) {
            xx = -10+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360-120))*-2.5 + (((tickAnim - 40) / 30) * (-10+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360-120))*-2.5-(-10+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360-120))*-2.5)));
            yy = Math.sin((Math.PI/180)*(((double)tickAnim/20)*360-120))*-1.25 + (((tickAnim - 40) / 30) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*360-120))*-1.25-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*360-120))*-1.25)));
            zz = 0 + (((tickAnim - 40) / 30) * (0-(0)));
        }
        else if (tickAnim >= 70 && tickAnim < 80) {
            xx = -10+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360-120))*-2.5 + (((tickAnim - 70) / 10) * (-10+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360-90))*40-(-10+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360-120))*-2.5)));
            yy = Math.sin((Math.PI/180)*(((double)tickAnim/20)*360-120))*-1.25 + (((tickAnim - 70) / 10) * (0-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*360-120))*-1.25)));
            zz = 0 + (((tickAnim - 70) / 10) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Tentacle6c, Tentacle6c.rotateAngleX + (float) Math.toRadians(xx), Tentacle6c.rotateAngleY + (float) Math.toRadians(yy), Tentacle6c.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 30) {
            xx = -5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360+60))*5 + (((tickAnim - 0) / 30) * (-5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360+60))*5-(-5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360+60))*5)));
            yy = 20+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360+60))*-20 + (((tickAnim - 0) / 30) * (20+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360+60))*-20-(20+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360+60))*-20)));
            zz = 20 + (((tickAnim - 0) / 30) * (20-(20)));
        }
        else if (tickAnim >= 30 && tickAnim < 70) {
            xx = -5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360+60))*5 + (((tickAnim - 30) / 40) * (-5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360))*-2.5-(-5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360+60))*5)));
            yy = 20+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360+60))*-20 + (((tickAnim - 30) / 40) * (-2.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360))*2.5-(20+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360+60))*-20)));
            zz = 20 + (((tickAnim - 30) / 40) * (0-(20)));
        }
        else if (tickAnim >= 70 && tickAnim < 80) {
            xx = -5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360))*-2.5 + (((tickAnim - 70) / 10) * (-5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360+60))*5-(-5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360))*-2.5)));
            yy = -2.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360))*2.5 + (((tickAnim - 70) / 10) * (20+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360+60))*-20-(-2.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360))*2.5)));
            zz = 0 + (((tickAnim - 70) / 10) * (20-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Tentacle7a, Tentacle7a.rotateAngleX + (float) Math.toRadians(xx), Tentacle7a.rotateAngleY + (float) Math.toRadians(yy), Tentacle7a.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 30) {
            xx = 1 + (((tickAnim - 0) / 30) * (1-(1)));
            yy = 1 + (((tickAnim - 0) / 30) * (1-(1)));
            zz = 1.1+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360+60))*0.1 + (((tickAnim - 0) / 30) * (1.1+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360+60))*0.1-(1.1+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360+60))*0.1)));
        }
        else if (tickAnim >= 30 && tickAnim < 40) {
            xx = 1 + (((tickAnim - 30) / 10) * (1-(1)));
            yy = 1 + (((tickAnim - 30) / 10) * (1.5-(1)));
            zz = 1.1+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360+60))*0.1 + (((tickAnim - 30) / 10) * (1.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360+30))*-0.05-(1.1+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360+60))*0.1)));
        }
        else if (tickAnim >= 40 && tickAnim < 80) {
            xx = 1 + (((tickAnim - 40) / 40) * (1-(1)));
            yy = 1.5 + (((tickAnim - 40) / 40) * (1-(1.5)));
            zz = 1.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360+30))*-0.05 + (((tickAnim - 40) / 40) * (1.1+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360+60))*0.1-(1.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360+30))*-0.05)));
        }
        else {
            xx = 1;
            yy = 1;
            zz = 1;
        }
        this.Tentacle7a.setScale((float)xx, (float)yy, (float)zz);




        if (tickAnim >= 0 && tickAnim < 30) {
            xx = 0 + (((tickAnim - 0) / 30) * (0-(0)));
            yy = 10+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360-60))*-30 + (((tickAnim - 0) / 30) * (10+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360-60))*-30-(10+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360-60))*-30)));
            zz = 0 + (((tickAnim - 0) / 30) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 70) {
            xx = 0 + (((tickAnim - 30) / 40) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*360-60))*-2.5-(0)));
            yy = 10+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360-60))*-30 + (((tickAnim - 30) / 40) * (2.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360-60))*2.5-(10+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360-60))*-30)));
            zz = 0 + (((tickAnim - 30) / 40) * (0-(0)));
        }
        else if (tickAnim >= 70 && tickAnim < 80) {
            xx = Math.sin((Math.PI/180)*(((double)tickAnim/20)*360-60))*-2.5 + (((tickAnim - 70) / 10) * (0-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*360-60))*-2.5)));
            yy = 2.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360-60))*2.5 + (((tickAnim - 70) / 10) * (10+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360-60))*-30-(2.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360-60))*2.5)));
            zz = 0 + (((tickAnim - 70) / 10) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Tentacle7b, Tentacle7b.rotateAngleX + (float) Math.toRadians(xx), Tentacle7b.rotateAngleY + (float) Math.toRadians(yy), Tentacle7b.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 30) {
            xx = 0 + (((tickAnim - 0) / 30) * (0-(0)));
            yy = 10+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360-90))*-30 + (((tickAnim - 0) / 30) * (10+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360-90))*-30-(10+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360-90))*-30)));
            zz = 0 + (((tickAnim - 0) / 30) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 70) {
            xx = 0 + (((tickAnim - 30) / 40) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*360-120))*-2.5-(0)));
            yy = 10+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360-90))*-30 + (((tickAnim - 30) / 40) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*360-120))*2.5-(10+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360-90))*-30)));
            zz = 0 + (((tickAnim - 30) / 40) * (0-(0)));
        }
        else if (tickAnim >= 70 && tickAnim < 80) {
            xx = Math.sin((Math.PI/180)*(((double)tickAnim/20)*360-120))*-2.5 + (((tickAnim - 70) / 10) * (0-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*360-120))*-2.5)));
            yy = Math.sin((Math.PI/180)*(((double)tickAnim/20)*360-120))*2.5 + (((tickAnim - 70) / 10) * (10+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360-90))*-30-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*360-120))*2.5)));
            zz = 0 + (((tickAnim - 70) / 10) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Tentacle7c, Tentacle7c.rotateAngleX + (float) Math.toRadians(xx), Tentacle7c.rotateAngleY + (float) Math.toRadians(yy), Tentacle7c.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 30) {
            xx = 0 + (((tickAnim - 0) / 30) * (0-(0)));
            yy = 20+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360+60))*-30 + (((tickAnim - 0) / 30) * (20+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360+60))*-30-(20+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360+60))*-30)));
            zz = 0 + (((tickAnim - 0) / 30) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 40) {
            xx = 0 + (((tickAnim - 30) / 10) * (5-(0)));
            yy = 20+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360+60))*-30 + (((tickAnim - 30) / 10) * (2.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360))*2.5-(20+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360+60))*-30)));
            zz = 0 + (((tickAnim - 30) / 10) * (0-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 70) {
            xx = 5 + (((tickAnim - 40) / 30) * (5-(5)));
            yy = 2.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360))*2.5 + (((tickAnim - 40) / 30) * (2.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360))*2.5-(2.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360))*2.5)));
            zz = 0 + (((tickAnim - 40) / 30) * (0-(0)));
        }
        else if (tickAnim >= 70 && tickAnim < 80) {
            xx = 5 + (((tickAnim - 70) / 10) * (0-(5)));
            yy = 2.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360))*2.5 + (((tickAnim - 70) / 10) * (20+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360+60))*-30-(2.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360))*2.5)));
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
            yy = 1 + (((tickAnim - 0) / 30) * (1-(1)));
            zz = 1.1+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360+60))*0.1 + (((tickAnim - 0) / 30) * (1.1+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360+60))*0.1-(1.1+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360+60))*0.1)));
        }
        else if (tickAnim >= 30 && tickAnim < 40) {
            xx = 1 + (((tickAnim - 30) / 10) * (1-(1)));
            yy = 1 + (((tickAnim - 30) / 10) * (1.5-(1)));
            zz = 1.1+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360+60))*0.1 + (((tickAnim - 30) / 10) * (1.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360+30))*-0.05-(1.1+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360+60))*0.1)));
        }
        else if (tickAnim >= 40 && tickAnim < 70) {
            xx = 1 + (((tickAnim - 40) / 30) * (1-(1)));
            yy = 1.5 + (((tickAnim - 40) / 30) * (1.5-(1.5)));
            zz = 1.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360+30))*-0.05 + (((tickAnim - 40) / 30) * (1.05+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360+30))*-0.05-(1.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360+30))*-0.05)));
        }
        else if (tickAnim >= 70 && tickAnim < 80) {
            xx = 1 + (((tickAnim - 70) / 10) * (1-(1)));
            yy = 1.5 + (((tickAnim - 70) / 10) * (1-(1.5)));
            zz = 1.05+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360+30))*-0.05 + (((tickAnim - 70) / 10) * (1.1+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360+60))*0.1-(1.05+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360+30))*-0.05)));
        }
        else {
            xx = 1;
            yy = 1;
            zz = 1;
        }
        this.Tentacle8a.setScale((float)xx, (float)yy, (float)zz);




        if (tickAnim >= 0 && tickAnim < 30) {
            xx = 0 + (((tickAnim - 0) / 30) * (0-(0)));
            yy = 10+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360-60))*-40 + (((tickAnim - 0) / 30) * (10+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360-60))*-40-(10+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360-60))*-40)));
            zz = 0 + (((tickAnim - 0) / 30) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 40) {
            xx = 0 + (((tickAnim - 30) / 10) * (-5-(0)));
            yy = 10+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360-60))*-40 + (((tickAnim - 30) / 10) * (-5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360-60))*2.5-(10+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360-60))*-40)));
            zz = 0 + (((tickAnim - 30) / 10) * (0-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 70) {
            xx = -5 + (((tickAnim - 40) / 30) * (-5-(-5)));
            yy = -5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360-60))*2.5 + (((tickAnim - 40) / 30) * (-5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360-60))*2.5-(-5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360-60))*2.5)));
            zz = 0 + (((tickAnim - 40) / 30) * (0-(0)));
        }
        else if (tickAnim >= 70 && tickAnim < 80) {
            xx = -5 + (((tickAnim - 70) / 10) * (0-(-5)));
            yy = -5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360-60))*2.5 + (((tickAnim - 70) / 10) * (10+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360-60))*-40-(-5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360-60))*2.5)));
            zz = 0 + (((tickAnim - 70) / 10) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Tentacle8b, Tentacle8b.rotateAngleX + (float) Math.toRadians(xx), Tentacle8b.rotateAngleY + (float) Math.toRadians(yy), Tentacle8b.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 30) {
            xx = 0 + (((tickAnim - 0) / 30) * (0-(0)));
            yy = 10+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360-90))*-40 + (((tickAnim - 0) / 30) * (10+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360-90))*-40-(10+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360-90))*-40)));
            zz = 0 + (((tickAnim - 0) / 30) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 40) {
            xx = 0 + (((tickAnim - 30) / 10) * (-5-(0)));
            yy = 10+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360-90))*-40 + (((tickAnim - 30) / 10) * (-2.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360-120))*2.5-(10+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360-90))*-40)));
            zz = 0 + (((tickAnim - 30) / 10) * (0-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 70) {
            xx = -5 + (((tickAnim - 40) / 30) * (-5-(-5)));
            yy = -2.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360-120))*2.5 + (((tickAnim - 40) / 30) * (-2.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360-120))*2.5-(-2.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360-120))*2.5)));
            zz = 0 + (((tickAnim - 40) / 30) * (0-(0)));
        }
        else if (tickAnim >= 70 && tickAnim < 80) {
            xx = -5 + (((tickAnim - 70) / 10) * (0-(-5)));
            yy = -2.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360-120))*2.5 + (((tickAnim - 70) / 10) * (10+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360-90))*-40-(-2.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360-120))*2.5)));
            zz = 0 + (((tickAnim - 70) / 10) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Tentacle8c, Tentacle8c.rotateAngleX + (float) Math.toRadians(xx), Tentacle8c.rotateAngleY + (float) Math.toRadians(yy), Tentacle8c.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 30) {
            xx = 5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360+60))*-5 + (((tickAnim - 0) / 30) * (5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360+60))*-5-(5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360+60))*-5)));
            yy = 20+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360+60))*-30 + (((tickAnim - 0) / 30) * (20+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360+60))*-30-(20+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360+60))*-30)));
            zz = -20 + (((tickAnim - 0) / 30) * (-20-(-20)));
        }
        else if (tickAnim >= 30 && tickAnim < 40) {
            xx = 5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360+60))*-5 + (((tickAnim - 30) / 10) * (5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360))*1.25-(5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360+60))*-5)));
            yy = 20+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360+60))*-30 + (((tickAnim - 30) / 10) * (-2.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360))*2.5-(20+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360+60))*-30)));
            zz = -20 + (((tickAnim - 30) / 10) * (-15-(-20)));
        }
        else if (tickAnim >= 40 && tickAnim < 70) {
            xx = 5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360))*1.25 + (((tickAnim - 40) / 30) * (5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360))*1.25-(5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360))*1.25)));
            yy = -2.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360))*2.5 + (((tickAnim - 40) / 30) * (-2.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360))*2.5-(-2.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360))*2.5)));
            zz = -15 + (((tickAnim - 40) / 30) * (-15-(-15)));
        }
        else if (tickAnim >= 70 && tickAnim < 80) {
            xx = 5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360))*1.25 + (((tickAnim - 70) / 10) * (5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360+60))*-5-(5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360))*1.25)));
            yy = -2.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360))*2.5 + (((tickAnim - 70) / 10) * (20+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360+60))*-30-(-2.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360))*2.5)));
            zz = -15 + (((tickAnim - 70) / 10) * (-20-(-15)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Tentacle9a, Tentacle9a.rotateAngleX + (float) Math.toRadians(xx), Tentacle9a.rotateAngleY + (float) Math.toRadians(yy), Tentacle9a.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 30) {
            xx = 1 + (((tickAnim - 0) / 30) * (1-(1)));
            yy = 1 + (((tickAnim - 0) / 30) * (1-(1)));
            zz = 1.1+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360+60))*0.1 + (((tickAnim - 0) / 30) * (1.1+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360+60))*0.1-(1.1+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360+60))*0.1)));
        }
        else if (tickAnim >= 30 && tickAnim < 40) {
            xx = 1 + (((tickAnim - 30) / 10) * (1-(1)));
            yy = 1 + (((tickAnim - 30) / 10) * (1.5-(1)));
            zz = 1.1+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360+60))*0.1 + (((tickAnim - 30) / 10) * (1.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360+30))*-0.05-(1.1+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360+60))*0.1)));
        }
        else if (tickAnim >= 40 && tickAnim < 70) {
            xx = 1 + (((tickAnim - 40) / 30) * (1-(1)));
            yy = 1.5 + (((tickAnim - 40) / 30) * (1.5-(1.5)));
            zz = 1.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360+30))*-0.05 + (((tickAnim - 40) / 30) * (1.05+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360+30))*-0.05-(1.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360+30))*-0.05)));
        }
        else if (tickAnim >= 70 && tickAnim < 80) {
            xx = 1 + (((tickAnim - 70) / 10) * (1-(1)));
            yy = 1.5 + (((tickAnim - 70) / 10) * (1-(1.5)));
            zz = 1.05+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360+30))*-0.05 + (((tickAnim - 70) / 10) * (1.1+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360+60))*0.1-(1.05+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360+30))*-0.05)));
        }
        else {
            xx = 1;
            yy = 1;
            zz = 1;
        }
        this.Tentacle9a.setScale((float)xx, (float)yy, (float)zz);




        if (tickAnim >= 0 && tickAnim < 30) {
            xx = 0 + (((tickAnim - 0) / 30) * (0-(0)));
            yy = 10+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360-60))*-40 + (((tickAnim - 0) / 30) * (10+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360-60))*-40-(10+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360-60))*-40)));
            zz = 0 + (((tickAnim - 0) / 30) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 40) {
            xx = 0 + (((tickAnim - 30) / 10) * (-5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360-60))*1.25-(0)));
            yy = 10+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360-60))*-40 + (((tickAnim - 30) / 10) * (-2.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360-60))*2.5-(10+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360-60))*-40)));
            zz = 0 + (((tickAnim - 30) / 10) * (0-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 70) {
            xx = -5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360-60))*1.25 + (((tickAnim - 40) / 30) * (-5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360-60))*1.25-(-5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360-60))*1.25)));
            yy = -2.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360-60))*2.5 + (((tickAnim - 40) / 30) * (-2.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360-60))*2.5-(-2.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360-60))*2.5)));
            zz = 0 + (((tickAnim - 40) / 30) * (0-(0)));
        }
        else if (tickAnim >= 70 && tickAnim < 80) {
            xx = -5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360-60))*1.25 + (((tickAnim - 70) / 10) * (0-(-5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360-60))*1.25)));
            yy = -2.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360-60))*2.5 + (((tickAnim - 70) / 10) * (10+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360-60))*-40-(-2.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360-60))*2.5)));
            zz = 0 + (((tickAnim - 70) / 10) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Tentacle9b, Tentacle9b.rotateAngleX + (float) Math.toRadians(xx), Tentacle9b.rotateAngleY + (float) Math.toRadians(yy), Tentacle9b.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 30) {
            xx = 0 + (((tickAnim - 0) / 30) * (0-(0)));
            yy = 10+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360-90))*-40 + (((tickAnim - 0) / 30) * (10+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360-90))*-40-(10+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360-90))*-40)));
            zz = 0 + (((tickAnim - 0) / 30) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 40) {
            xx = 0 + (((tickAnim - 30) / 10) * (-5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360-120))*1.25-(0)));
            yy = 10+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360-90))*-40 + (((tickAnim - 30) / 10) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*360-120))*2.5-(10+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360-90))*-40)));
            zz = 0 + (((tickAnim - 30) / 10) * (0-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 70) {
            xx = -5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360-120))*1.25 + (((tickAnim - 40) / 30) * (-5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360-120))*1.25-(-5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360-120))*1.25)));
            yy = Math.sin((Math.PI/180)*(((double)tickAnim/20)*360-120))*2.5 + (((tickAnim - 40) / 30) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*360-120))*2.5-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*360-120))*2.5)));
            zz = 0 + (((tickAnim - 40) / 30) * (0-(0)));
        }
        else if (tickAnim >= 70 && tickAnim < 80) {
            xx = -5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360-120))*1.25 + (((tickAnim - 70) / 10) * (0-(-5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360-120))*1.25)));
            yy = Math.sin((Math.PI/180)*(((double)tickAnim/20)*360-120))*2.5 + (((tickAnim - 70) / 10) * (10+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360-90))*-40-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*360-120))*2.5)));
            zz = 0 + (((tickAnim - 70) / 10) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Tentacle9c, Tentacle9c.rotateAngleX + (float) Math.toRadians(xx), Tentacle9c.rotateAngleY + (float) Math.toRadians(yy), Tentacle9c.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 30) {
            xx = 20+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360+60))*-30 + (((tickAnim - 0) / 30) * (20+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360+60))*-30-(20+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360+60))*-30)));
            yy = Math.sin((Math.PI/180)*(((double)tickAnim/20)*360+60))*2.5 + (((tickAnim - 0) / 30) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*360+60))*2.5-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*360+60))*2.5)));
            zz = 10 + (((tickAnim - 0) / 30) * (10-(10)));
        }
        else if (tickAnim >= 30 && tickAnim < 40) {
            xx = 20+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360+60))*-30 + (((tickAnim - 30) / 10) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*360))*2.5-(20+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360+60))*-30)));
            yy = Math.sin((Math.PI/180)*(((double)tickAnim/20)*360+60))*2.5 + (((tickAnim - 30) / 10) * (1.25+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360))*1.25-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*360+60))*2.5)));
            zz = 10 + (((tickAnim - 30) / 10) * (5-(10)));
        }
        else if (tickAnim >= 40 && tickAnim < 70) {
            xx = Math.sin((Math.PI/180)*(((double)tickAnim/20)*360))*2.5 + (((tickAnim - 40) / 30) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*360))*2.5-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*360))*2.5)));
            yy = 1.25+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360))*1.25 + (((tickAnim - 40) / 30) * (1.25+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360))*1.25-(1.25+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360))*1.25)));
            zz = 5 + (((tickAnim - 40) / 30) * (5-(5)));
        }
        else if (tickAnim >= 70 && tickAnim < 80) {
            xx = Math.sin((Math.PI/180)*(((double)tickAnim/20)*360))*2.5 + (((tickAnim - 70) / 10) * (20+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360+60))*-30-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*360))*2.5)));
            yy = 1.25+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360))*1.25 + (((tickAnim - 70) / 10) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*360+60))*2.5-(1.25+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360))*1.25)));
            zz = 5 + (((tickAnim - 70) / 10) * (10-(5)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Tentacle10a, Tentacle10a.rotateAngleX + (float) Math.toRadians(xx), Tentacle10a.rotateAngleY + (float) Math.toRadians(yy), Tentacle10a.rotateAngleZ + (float) Math.toRadians(zz));


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
        this.Tentacle10a.rotationPointX = this.Tentacle10a.rotationPointX + (float)(xx);
        this.Tentacle10a.rotationPointY = this.Tentacle10a.rotationPointY - (float)(yy);
        this.Tentacle10a.rotationPointZ = this.Tentacle10a.rotationPointZ + (float)(zz);


        if (tickAnim >= 0 && tickAnim < 30) {
            xx = 1 + (((tickAnim - 0) / 30) * (1-(1)));
            yy = 1 + (((tickAnim - 0) / 30) * (1-(1)));
            zz = 1.1+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360+60))*0.1 + (((tickAnim - 0) / 30) * (1.1+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360+60))*0.1-(1.1+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360+60))*0.1)));
        }
        else if (tickAnim >= 30 && tickAnim < 40) {
            xx = 1 + (((tickAnim - 30) / 10) * (1.5-(1)));
            yy = 1 + (((tickAnim - 30) / 10) * (1-(1)));
            zz = 1.1+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360+60))*0.1 + (((tickAnim - 30) / 10) * (1.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360+30))*-0.05-(1.1+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360+60))*0.1)));
        }
        else if (tickAnim >= 40 && tickAnim < 70) {
            xx = 1.5 + (((tickAnim - 40) / 30) * (1.5-(1.5)));
            yy = 1 + (((tickAnim - 40) / 30) * (1-(1)));
            zz = 1.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360+30))*-0.05 + (((tickAnim - 40) / 30) * (1.05+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360+30))*-0.05-(1.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360+30))*-0.05)));
        }
        else if (tickAnim >= 70 && tickAnim < 80) {
            xx = 1.5 + (((tickAnim - 70) / 10) * (1-(1.5)));
            yy = 1 + (((tickAnim - 70) / 10) * (1-(1)));
            zz = 1.05+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360+30))*-0.05 + (((tickAnim - 70) / 10) * (1.1+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360+60))*0.1-(1.05+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360+30))*-0.05)));
        }
        else {
            xx = 1;
            yy = 1;
            zz = 1;
        }
        this.Tentacle10a.setScale((float)xx, (float)yy, (float)zz);




        if (tickAnim >= 0 && tickAnim < 30) {
            xx = 10+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360-60))*-40 + (((tickAnim - 0) / 30) * (10+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360-60))*-40-(10+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360-60))*-40)));
            yy = 0 + (((tickAnim - 0) / 30) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 30) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 40) {
            xx = 10+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360-60))*-40 + (((tickAnim - 30) / 10) * (-5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360-60))*2.5-(10+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360-60))*-40)));
            yy = 0 + (((tickAnim - 30) / 10) * (-2.5-(0)));
            zz = 0 + (((tickAnim - 30) / 10) * (0-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 70) {
            xx = -5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360-60))*2.5 + (((tickAnim - 40) / 30) * (-5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360-60))*2.5-(-5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360-60))*2.5)));
            yy = -2.5 + (((tickAnim - 40) / 30) * (-2.5-(-2.5)));
            zz = 0 + (((tickAnim - 40) / 30) * (0-(0)));
        }
        else if (tickAnim >= 70 && tickAnim < 80) {
            xx = -5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360-60))*2.5 + (((tickAnim - 70) / 10) * (10+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360-60))*-40-(-5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360-60))*2.5)));
            yy = -2.5 + (((tickAnim - 70) / 10) * (0-(-2.5)));
            zz = 0 + (((tickAnim - 70) / 10) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Tentacle10b, Tentacle10b.rotateAngleX + (float) Math.toRadians(xx), Tentacle10b.rotateAngleY + (float) Math.toRadians(yy), Tentacle10b.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 30) {
            xx = 10+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360-90))*-40 + (((tickAnim - 0) / 30) * (10+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360-90))*-40-(10+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360-90))*-40)));
            yy = 0 + (((tickAnim - 0) / 30) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 30) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 40) {
            xx = 10+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360-90))*-40 + (((tickAnim - 30) / 10) * (-5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360-120))*2.5-(10+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360-90))*-40)));
            yy = 0 + (((tickAnim - 30) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 30) / 10) * (0-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 70) {
            xx = -5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360-120))*2.5 + (((tickAnim - 40) / 30) * (-5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360-120))*2.5-(-5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360-120))*2.5)));
            yy = 0 + (((tickAnim - 40) / 30) * (0-(0)));
            zz = 0 + (((tickAnim - 40) / 30) * (0-(0)));
        }
        else if (tickAnim >= 70 && tickAnim < 80) {
            xx = -5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360-120))*2.5 + (((tickAnim - 70) / 10) * (10+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360-90))*-40-(-5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360-120))*2.5)));
            yy = 0 + (((tickAnim - 70) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 70) / 10) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Tentacle10c, Tentacle10c.rotateAngleX + (float) Math.toRadians(xx), Tentacle10c.rotateAngleY + (float) Math.toRadians(yy), Tentacle10c.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 30) {
            xx = Math.sin((Math.PI/180)*(((double)tickAnim/20)*360))*5 + (((tickAnim - 0) / 30) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*360))*5-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*360))*5)));
            yy = 0 + (((tickAnim - 0) / 30) * (0-(0)));
            zz = Math.sin((Math.PI/180)*(((double)tickAnim/20)*90))*-5 + (((tickAnim - 0) / 30) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*90))*-5-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*90))*-5)));
        }
        else if (tickAnim >= 30 && tickAnim < 40) {
            xx = Math.sin((Math.PI/180)*(((double)tickAnim/20)*360))*5 + (((tickAnim - 30) / 10) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*180))*5-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*360))*5)));
            yy = 0 + (((tickAnim - 30) / 10) * (0-(0)));
            zz = Math.sin((Math.PI/180)*(((double)tickAnim/20)*90))*-5 + (((tickAnim - 30) / 10) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*90))*2.5-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*90))*-5)));
        }
        else if (tickAnim >= 40 && tickAnim < 70) {
            xx = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180))*5 + (((tickAnim - 40) / 30) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*180))*5-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180))*5)));
            yy = 0 + (((tickAnim - 40) / 30) * (0-(0)));
            zz = Math.sin((Math.PI/180)*(((double)tickAnim/20)*90))*2.5 + (((tickAnim - 40) / 30) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*90))*2.5-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*90))*2.5)));
        }
        else if (tickAnim >= 70 && tickAnim < 80) {
            xx = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180))*5 + (((tickAnim - 70) / 10) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*360))*5-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180))*5)));
            yy = 0 + (((tickAnim - 70) / 10) * (0-(0)));
            zz = Math.sin((Math.PI/180)*(((double)tickAnim/20)*90))*2.5 + (((tickAnim - 70) / 10) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*90))*-5-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*90))*2.5)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(shell, shell.rotateAngleX + (float) Math.toRadians(xx), shell.rotateAngleY + (float) Math.toRadians(yy), shell.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 30) {
            xx = 0 + (((tickAnim - 0) / 30) * (0-(0)));
            yy = Math.sin((Math.PI/180)*(((double)tickAnim/20)*360-90))*-1 + (((tickAnim - 0) / 30) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*360-90))*-1-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*360-90))*-1)));
            zz = Math.sin((Math.PI/180)*(((double)tickAnim/20)*360-120))*3+Math.sin((Math.PI/180)*(((double)tickAnim/20)*90-90))*-5 + (((tickAnim - 0) / 30) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*360-120))*3+Math.sin((Math.PI/180)*(((double)tickAnim/20)*90-90))*-5-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*360-120))*3+Math.sin((Math.PI/180)*(((double)tickAnim/20)*90-90))*-5)));
        }
        else if (tickAnim >= 30 && tickAnim < 40) {
            xx = 0 + (((tickAnim - 30) / 10) * (0-(0)));
            yy = Math.sin((Math.PI/180)*(((double)tickAnim/20)*360-90))*-1 + (((tickAnim - 30) / 10) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*180-90))*-1-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*360-90))*-1)));
            zz = Math.sin((Math.PI/180)*(((double)tickAnim/20)*360-120))*3+Math.sin((Math.PI/180)*(((double)tickAnim/20)*90-90))*-5 + (((tickAnim - 30) / 10) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*180-60))*3+Math.sin((Math.PI/180)*(((double)tickAnim/20)*90-90))*-5-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*360-120))*3+Math.sin((Math.PI/180)*(((double)tickAnim/20)*90-90))*-5)));
        }
        else if (tickAnim >= 40 && tickAnim < 70) {
            xx = 0 + (((tickAnim - 40) / 30) * (0-(0)));
            yy = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180-90))*-1 + (((tickAnim - 40) / 30) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*180-90))*-1-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180-90))*-1)));
            zz = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180-60))*3+Math.sin((Math.PI/180)*(((double)tickAnim/20)*90-90))*-5 + (((tickAnim - 40) / 30) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*180-60))*3+Math.sin((Math.PI/180)*(((double)tickAnim/20)*90-90))*-5-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180-60))*3+Math.sin((Math.PI/180)*(((double)tickAnim/20)*90-90))*-5)));
        }
        else if (tickAnim >= 70 && tickAnim < 80) {
            xx = 0 + (((tickAnim - 70) / 10) * (0-(0)));
            yy = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180-90))*-1 + (((tickAnim - 70) / 10) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*360-90))*-1-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180-90))*-1)));
            zz = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180-60))*3+Math.sin((Math.PI/180)*(((double)tickAnim/20)*90-90))*-5 + (((tickAnim - 70) / 10) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*360-120))*3+Math.sin((Math.PI/180)*(((double)tickAnim/20)*90-90))*-5-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180-60))*3+Math.sin((Math.PI/180)*(((double)tickAnim/20)*90-90))*-5)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.shell.rotationPointX = this.shell.rotationPointX + (float)(xx);
        this.shell.rotationPointY = this.shell.rotationPointY - (float)(yy);
        this.shell.rotationPointZ = this.shell.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 30) {
            xx = Math.sin((Math.PI/180)*(((double)tickAnim/20)*360+60))*5 + (((tickAnim - 0) / 30) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*360+60))*5-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*360+60))*5)));
            yy = 60 + (((tickAnim - 0) / 30) * (60-(60)));
            zz = 0 + (((tickAnim - 0) / 30) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 40) {
            xx = Math.sin((Math.PI/180)*(((double)tickAnim/20)*360+60))*5 + (((tickAnim - 30) / 10) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*180+30))*5-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*360+60))*5)));
            yy = 60 + (((tickAnim - 30) / 10) * (60-(60)));
            zz = 0 + (((tickAnim - 30) / 10) * (0-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 70) {
            xx = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180+30))*5 + (((tickAnim - 40) / 30) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*180+30))*5-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180+30))*5)));
            yy = 60 + (((tickAnim - 40) / 30) * (60-(60)));
            zz = 0 + (((tickAnim - 40) / 30) * (0-(0)));
        }
        else if (tickAnim >= 70 && tickAnim < 80) {
            xx = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180+30))*5 + (((tickAnim - 70) / 10) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*360+60))*5-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180+30))*5)));
            yy = 60 + (((tickAnim - 70) / 10) * (60-(60)));
            zz = 0 + (((tickAnim - 70) / 10) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(eyeRight, eyeRight.rotateAngleX + (float) Math.toRadians(xx), eyeRight.rotateAngleY + (float) Math.toRadians(yy), eyeRight.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 30) {
            xx = Math.sin((Math.PI/180)*(((double)tickAnim/20)*360+60))*5 + (((tickAnim - 0) / 30) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*360+60))*5-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*360+60))*5)));
            yy = -60 + (((tickAnim - 0) / 30) * (-60-(-60)));
            zz = 0 + (((tickAnim - 0) / 30) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 40) {
            xx = Math.sin((Math.PI/180)*(((double)tickAnim/20)*360+60))*5 + (((tickAnim - 30) / 10) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*180+30))*5-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*360+60))*5)));
            yy = -60 + (((tickAnim - 30) / 10) * (-60-(-60)));
            zz = 0 + (((tickAnim - 30) / 10) * (0-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 70) {
            xx = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180+30))*5 + (((tickAnim - 40) / 30) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*180+30))*5-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180+30))*5)));
            yy = -60 + (((tickAnim - 40) / 30) * (-60-(-60)));
            zz = 0 + (((tickAnim - 40) / 30) * (0-(0)));
        }
        else if (tickAnim >= 70 && tickAnim < 80) {
            xx = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180+30))*5 + (((tickAnim - 70) / 10) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*360+60))*5-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180+30))*5)));
            yy = -60 + (((tickAnim - 70) / 10) * (-60-(-60)));
            zz = 0 + (((tickAnim - 70) / 10) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(eyeLeft, eyeLeft.rotateAngleX + (float) Math.toRadians(xx), eyeLeft.rotateAngleY + (float) Math.toRadians(yy), eyeLeft.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 30) {
            xx = 0 + (((tickAnim - 0) / 30) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 30) * (0-(0)));
            zz = Math.sin((Math.PI/180)*(((double)tickAnim/20)*720))*5 + (((tickAnim - 0) / 30) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*720))*5-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*720))*5)));
        }
        else if (tickAnim >= 30 && tickAnim < 40) {
            xx = 0 + (((tickAnim - 30) / 10) * (0-(0)));
            yy = 0 + (((tickAnim - 30) / 10) * (0-(0)));
            zz = Math.sin((Math.PI/180)*(((double)tickAnim/20)*720))*5 + (((tickAnim - 30) / 10) * (20+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360))*30+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720))*5-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*720))*5)));
        }
        else if (tickAnim >= 40 && tickAnim < 70) {
            xx = 0 + (((tickAnim - 40) / 30) * (0-(0)));
            yy = 0 + (((tickAnim - 40) / 30) * (0-(0)));
            zz = 20+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360))*30+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720))*5 + (((tickAnim - 40) / 30) * (20+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360))*30+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720))*5-(20+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360))*30+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720))*5)));
        }
        else if (tickAnim >= 70 && tickAnim < 80) {
            xx = 0 + (((tickAnim - 70) / 10) * (0-(0)));
            yy = 0 + (((tickAnim - 70) / 10) * (0-(0)));
            zz = 20+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360))*30+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720))*5 + (((tickAnim - 70) / 10) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*720))*5-(20+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360))*30+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720))*5)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(finRight, finRight.rotateAngleX + (float) Math.toRadians(xx), finRight.rotateAngleY + (float) Math.toRadians(yy), finRight.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 30) {
            xx = 0.5 + (((tickAnim - 0) / 30) * (0.5-(0.5)));
            yy = 1 + (((tickAnim - 0) / 30) * (1-(1)));
            zz = 1.5 + (((tickAnim - 0) / 30) * (1.5-(1.5)));
        }
        else if (tickAnim >= 30 && tickAnim < 40) {
            xx = 0.5 + (((tickAnim - 30) / 10) * (1-(0.5)));
            yy = 1 + (((tickAnim - 30) / 10) * (1-(1)));
            zz = 1.5 + (((tickAnim - 30) / 10) * (1.5-(1.5)));
        }
        else if (tickAnim >= 40 && tickAnim < 70) {
            xx = 1 + (((tickAnim - 40) / 30) * (1-(1)));
            yy = 1 + (((tickAnim - 40) / 30) * (1-(1)));
            zz = 1.5 + (((tickAnim - 40) / 30) * (1.5-(1.5)));
        }
        else if (tickAnim >= 70 && tickAnim < 80) {
            xx = 1 + (((tickAnim - 70) / 10) * (0.5-(1)));
            yy = 1 + (((tickAnim - 70) / 10) * (1-(1)));
            zz = 1.5 + (((tickAnim - 70) / 10) * (1.5-(1.5)));
        }
        else {
            xx = 1;
            yy = 1;
            zz = 1;
        }
        this.finRight.setScale((float)xx, (float)yy, (float)zz);




        if (tickAnim >= 0 && tickAnim < 30) {
            xx = 0 + (((tickAnim - 0) / 30) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 30) * (0-(0)));
            zz = Math.sin((Math.PI/180)*(((double)tickAnim/20)*720))*-5 + (((tickAnim - 0) / 30) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*720))*-5-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*720))*-5)));
        }
        else if (tickAnim >= 30 && tickAnim < 40) {
            xx = 0 + (((tickAnim - 30) / 10) * (0-(0)));
            yy = 0 + (((tickAnim - 30) / 10) * (0-(0)));
            zz = Math.sin((Math.PI/180)*(((double)tickAnim/20)*720))*-5 + (((tickAnim - 30) / 10) * (-20+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360))*-30+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720))*-5-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*720))*-5)));
        }
        else if (tickAnim >= 40 && tickAnim < 70) {
            xx = 0 + (((tickAnim - 40) / 30) * (0-(0)));
            yy = 0 + (((tickAnim - 40) / 30) * (0-(0)));
            zz = -20+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360))*-30+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720))*-5 + (((tickAnim - 40) / 30) * (-20+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360))*-30+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720))*-5-(-20+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360))*-30+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720))*-5)));
        }
        else if (tickAnim >= 70 && tickAnim < 80) {
            xx = 0 + (((tickAnim - 70) / 10) * (0-(0)));
            yy = 0 + (((tickAnim - 70) / 10) * (0-(0)));
            zz = -20+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360))*-30+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720))*-5 + (((tickAnim - 70) / 10) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*720))*-5-(-20+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360))*-30+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720))*-5)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(finLeft, finLeft.rotateAngleX + (float) Math.toRadians(xx), finLeft.rotateAngleY + (float) Math.toRadians(yy), finLeft.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 30) {
            xx = 0.5 + (((tickAnim - 0) / 30) * (0.5-(0.5)));
            yy = 1 + (((tickAnim - 0) / 30) * (1-(1)));
            zz = 1.5 + (((tickAnim - 0) / 30) * (1.5-(1.5)));
        }
        else if (tickAnim >= 30 && tickAnim < 40) {
            xx = 0.5 + (((tickAnim - 30) / 10) * (1-(0.5)));
            yy = 1 + (((tickAnim - 30) / 10) * (1-(1)));
            zz = 1.5 + (((tickAnim - 30) / 10) * (1.5-(1.5)));
        }
        else if (tickAnim >= 40 && tickAnim < 70) {
            xx = 1 + (((tickAnim - 40) / 30) * (1-(1)));
            yy = 1 + (((tickAnim - 40) / 30) * (1-(1)));
            zz = 1.5 + (((tickAnim - 40) / 30) * (1.5-(1.5)));
        }
        else if (tickAnim >= 70 && tickAnim < 80) {
            xx = 1 + (((tickAnim - 70) / 10) * (0.5-(1)));
            yy = 1 + (((tickAnim - 70) / 10) * (1-(1)));
            zz = 1.5 + (((tickAnim - 70) / 10) * (1.5-(1.5)));
        }
        else {
            xx = 1;
            yy = 1;
            zz = 1;
        }
        this.finLeft.setScale((float)xx, (float)yy, (float)zz);




        if (tickAnim >= 0 && tickAnim < 30) {
            xx = 0 + (((tickAnim - 0) / 30) * (0-(0)));
            yy = Math.sin((Math.PI/180)*(((double)tickAnim/20)*360-150))*30 + (((tickAnim - 0) / 30) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*360-150))*30-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*360-150))*30)));
            zz = 0 + (((tickAnim - 0) / 30) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 70) {
            xx = 0 + (((tickAnim - 30) / 40) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*360-180))*-2.5-(0)));
            yy = Math.sin((Math.PI/180)*(((double)tickAnim/20)*360-150))*30 + (((tickAnim - 30) / 40) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*360-180))*-2.5-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*360-150))*30)));
            zz = 0 + (((tickAnim - 30) / 40) * (0-(0)));
        }
        else if (tickAnim >= 70 && tickAnim < 80) {
            xx = Math.sin((Math.PI/180)*(((double)tickAnim/20)*360-180))*-2.5 + (((tickAnim - 70) / 10) * (0-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*360-180))*-2.5)));
            yy = Math.sin((Math.PI/180)*(((double)tickAnim/20)*360-180))*-2.5 + (((tickAnim - 70) / 10) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*360-150))*30-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*360-180))*-2.5)));
            zz = 0 + (((tickAnim - 70) / 10) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Tentacle2d, Tentacle2d.rotateAngleX + (float) Math.toRadians(xx), Tentacle2d.rotateAngleY + (float) Math.toRadians(yy), Tentacle2d.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 30) {
            xx = 0 + (((tickAnim - 0) / 30) * (0-(0)));
            yy = Math.sin((Math.PI/180)*(((double)tickAnim/20)*360-210))*30 + (((tickAnim - 0) / 30) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*360-210))*30-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*360-210))*30)));
            zz = 0 + (((tickAnim - 0) / 30) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 70) {
            xx = 0 + (((tickAnim - 30) / 40) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*360-240))*-2.5-(0)));
            yy = Math.sin((Math.PI/180)*(((double)tickAnim/20)*360-210))*30 + (((tickAnim - 30) / 40) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*360-240))*-2.5-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*360-210))*30)));
            zz = 0 + (((tickAnim - 30) / 40) * (0-(0)));
        }
        else if (tickAnim >= 70 && tickAnim < 80) {
            xx = Math.sin((Math.PI/180)*(((double)tickAnim/20)*360-240))*-2.5 + (((tickAnim - 70) / 10) * (0-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*360-240))*-2.5)));
            yy = Math.sin((Math.PI/180)*(((double)tickAnim/20)*360-240))*-2.5 + (((tickAnim - 70) / 10) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*360-210))*30-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*360-240))*-2.5)));
            zz = 0 + (((tickAnim - 70) / 10) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Tentacle2e, Tentacle2e.rotateAngleX + (float) Math.toRadians(xx), Tentacle2e.rotateAngleY + (float) Math.toRadians(yy), Tentacle2e.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 30) {
            xx = 0 + (((tickAnim - 0) / 30) * (0-(0)));
            yy = Math.sin((Math.PI/180)*(((double)tickAnim/20)*360-270))*30 + (((tickAnim - 0) / 30) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*360-270))*30-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*360-270))*30)));
            zz = 0 + (((tickAnim - 0) / 30) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 70) {
            xx = 0 + (((tickAnim - 30) / 40) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*360-270))*-2.5-(0)));
            yy = Math.sin((Math.PI/180)*(((double)tickAnim/20)*360-270))*30 + (((tickAnim - 30) / 40) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*360-270))*-2.5-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*360-270))*30)));
            zz = 0 + (((tickAnim - 30) / 40) * (0-(0)));
        }
        else if (tickAnim >= 70 && tickAnim < 80) {
            xx = Math.sin((Math.PI/180)*(((double)tickAnim/20)*360-270))*-2.5 + (((tickAnim - 70) / 10) * (0-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*360-270))*-2.5)));
            yy = Math.sin((Math.PI/180)*(((double)tickAnim/20)*360-270))*-2.5 + (((tickAnim - 70) / 10) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*360-270))*30-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*360-270))*-2.5)));
            zz = 0 + (((tickAnim - 70) / 10) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Tentacle2f, Tentacle2f.rotateAngleX + (float) Math.toRadians(xx), Tentacle2f.rotateAngleY + (float) Math.toRadians(yy), Tentacle2f.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 30) {
            xx = 0 + (((tickAnim - 0) / 30) * (0-(0)));
            yy = Math.sin((Math.PI/180)*(((double)tickAnim/20)*360-150))*-30 + (((tickAnim - 0) / 30) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*360-150))*-30-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*360-150))*-30)));
            zz = 0 + (((tickAnim - 0) / 30) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 70) {
            xx = 0 + (((tickAnim - 30) / 40) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*360-180))*-2.5-(0)));
            yy = Math.sin((Math.PI/180)*(((double)tickAnim/20)*360-150))*-30 + (((tickAnim - 30) / 40) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*360-180))*2.5-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*360-150))*-30)));
            zz = 0 + (((tickAnim - 30) / 40) * (0-(0)));
        }
        else if (tickAnim >= 70 && tickAnim < 80) {
            xx = Math.sin((Math.PI/180)*(((double)tickAnim/20)*360-180))*-2.5 + (((tickAnim - 70) / 10) * (0-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*360-180))*-2.5)));
            yy = Math.sin((Math.PI/180)*(((double)tickAnim/20)*360-180))*2.5 + (((tickAnim - 70) / 10) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*360-150))*-30-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*360-180))*2.5)));
            zz = 0 + (((tickAnim - 70) / 10) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Tentacle7d, Tentacle7d.rotateAngleX + (float) Math.toRadians(xx), Tentacle7d.rotateAngleY + (float) Math.toRadians(yy), Tentacle7d.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 30) {
            xx = 0 + (((tickAnim - 0) / 30) * (0-(0)));
            yy = Math.sin((Math.PI/180)*(((double)tickAnim/20)*360-210))*-30 + (((tickAnim - 0) / 30) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*360-210))*-30-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*360-210))*-30)));
            zz = 0 + (((tickAnim - 0) / 30) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 70) {
            xx = 0 + (((tickAnim - 30) / 40) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*360-240))*-2.5-(0)));
            yy = Math.sin((Math.PI/180)*(((double)tickAnim/20)*360-210))*-30 + (((tickAnim - 30) / 40) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*360-240))*2.5-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*360-210))*-30)));
            zz = 0 + (((tickAnim - 30) / 40) * (0-(0)));
        }
        else if (tickAnim >= 70 && tickAnim < 80) {
            xx = Math.sin((Math.PI/180)*(((double)tickAnim/20)*360-240))*-2.5 + (((tickAnim - 70) / 10) * (0-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*360-240))*-2.5)));
            yy = Math.sin((Math.PI/180)*(((double)tickAnim/20)*360-240))*2.5 + (((tickAnim - 70) / 10) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*360-210))*-30-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*360-240))*2.5)));
            zz = 0 + (((tickAnim - 70) / 10) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Tentacle7e, Tentacle7e.rotateAngleX + (float) Math.toRadians(xx), Tentacle7e.rotateAngleY + (float) Math.toRadians(yy), Tentacle7e.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 30) {
            xx = 0 + (((tickAnim - 0) / 30) * (0-(0)));
            yy = Math.sin((Math.PI/180)*(((double)tickAnim/20)*360-270))*-30 + (((tickAnim - 0) / 30) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*360-270))*-30-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*360-270))*-30)));
            zz = 0 + (((tickAnim - 0) / 30) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 70) {
            xx = 0 + (((tickAnim - 30) / 40) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*360-270))*-2.5-(0)));
            yy = Math.sin((Math.PI/180)*(((double)tickAnim/20)*360-270))*-30 + (((tickAnim - 30) / 40) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*360-270))*2.5-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*360-270))*-30)));
            zz = 0 + (((tickAnim - 30) / 40) * (0-(0)));
        }
        else if (tickAnim >= 70 && tickAnim < 80) {
            xx = Math.sin((Math.PI/180)*(((double)tickAnim/20)*360-270))*-2.5 + (((tickAnim - 70) / 10) * (0-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*360-270))*-2.5)));
            yy = Math.sin((Math.PI/180)*(((double)tickAnim/20)*360-270))*2.5 + (((tickAnim - 70) / 10) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*360-270))*-30-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*360-270))*2.5)));
            zz = 0 + (((tickAnim - 70) / 10) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Tentacle7f, Tentacle7f.rotateAngleX + (float) Math.toRadians(xx), Tentacle7f.rotateAngleY + (float) Math.toRadians(yy), Tentacle7f.rotateAngleZ + (float) Math.toRadians(zz));

    }

    @Override
    public void setRotationAngles(float f, float f1, float f2, float f3, float f4, float f5, Entity e) {
        super.setRotationAngles(f, f1, f2, f3, f4, f5, e);
        //this.resetToDefaultPose();

        //this.body.offsetY = 1.50F;

        EntityPrehistoricFloraAmmonite_Pachydiscus ee = (EntityPrehistoricFloraAmmonite_Pachydiscus) e;

        if (!e.isInWater()) {
            this.root.rotateAngleZ = (float) Math.toRadians(90);
            //this.root.offsetY = 0.175F;
        }

    }

    public void animate(IAnimatedEntity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        animator.update(entity);
    }
}

