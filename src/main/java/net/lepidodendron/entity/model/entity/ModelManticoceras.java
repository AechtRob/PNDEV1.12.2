package net.lepidodendron.entity.model.entity;

import net.ilexiconn.llibrary.client.model.ModelAnimator;
import net.ilexiconn.llibrary.client.model.tools.AdvancedModelRenderer;
import net.ilexiconn.llibrary.server.animation.IAnimatedEntity;
import net.lepidodendron.entity.EntityPrehistoricFloraAmmonite_Manticoceras;
import net.lepidodendron.entity.model.ModelBasePalaeopedia;
import net.minecraft.client.model.ModelBox;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;

public class ModelManticoceras extends ModelBasePalaeopedia {
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
    private final AdvancedModelRenderer Mantle;
    private final AdvancedModelRenderer Siphon;
    private final AdvancedModelRenderer eyeLeft;
    private final AdvancedModelRenderer eyeRight;
    private final AdvancedModelRenderer Tentacle1a;
    private final AdvancedModelRenderer Tentacle1b;
    private final AdvancedModelRenderer Tentacle1c;
    private final AdvancedModelRenderer Tentacle1d;
    private final AdvancedModelRenderer Tentacle2a;
    private final AdvancedModelRenderer Tentacle2b;
    private final AdvancedModelRenderer Tentacle2c;
    private final AdvancedModelRenderer Tentacle2d;
    private final AdvancedModelRenderer Tentacle3a;
    private final AdvancedModelRenderer Tentacle3b;
    private final AdvancedModelRenderer Tentacle3c;
    private final AdvancedModelRenderer Tentacle3d;
    private final AdvancedModelRenderer Tentacle4a;
    private final AdvancedModelRenderer Tentacle1a_r1;
    private final AdvancedModelRenderer Tentacle4b;
    private final AdvancedModelRenderer Tentacle1b_r1;
    private final AdvancedModelRenderer Tentacle4c;
    private final AdvancedModelRenderer Tentacle1b_r2;
    private final AdvancedModelRenderer Tentacle4d;
    private final AdvancedModelRenderer Tentacle1b_r3;
    private final AdvancedModelRenderer Tentacle5a;
    private final AdvancedModelRenderer Tentacle5b;
    private final AdvancedModelRenderer Tentacle5c;
    private final AdvancedModelRenderer Tentacle5d;
    private final AdvancedModelRenderer Tentacle6a;
    private final AdvancedModelRenderer Tentacle6b;
    private final AdvancedModelRenderer Tentacle6c;
    private final AdvancedModelRenderer Tentacle6d;
    private final AdvancedModelRenderer Tentacle7a;
    private final AdvancedModelRenderer Tentacle7b;
    private final AdvancedModelRenderer Tentacle7c;
    private final AdvancedModelRenderer Tentacle7d;
    private final AdvancedModelRenderer Tentacle8a;
    private final AdvancedModelRenderer Tentacle8b;
    private final AdvancedModelRenderer Tentacle8c;
    private final AdvancedModelRenderer Tentacle8d;
    private final AdvancedModelRenderer Tentacle9a;
    private final AdvancedModelRenderer Tentacle1a_r2;
    private final AdvancedModelRenderer Tentacle9b;
    private final AdvancedModelRenderer Tentacle1b_r4;
    private final AdvancedModelRenderer Tentacle9c;
    private final AdvancedModelRenderer Tentacle1b_r5;
    private final AdvancedModelRenderer Tentacle9d;
    private final AdvancedModelRenderer Tentacle1b_r6;
    private final AdvancedModelRenderer Tentacle10a;
    private final AdvancedModelRenderer Tentacle10b;
    private final AdvancedModelRenderer Tentacle10c;
    private final AdvancedModelRenderer Tentacle10d;

    private ModelAnimator animator;

    public ModelManticoceras() {
        this.textureWidth = 128;
        this.textureHeight = 128;

        this.root = new AdvancedModelRenderer(this);
        this.root.setRotationPoint(0.0F, 24.0F, 0.0F);


        this.shell = new AdvancedModelRenderer(this);
        this.shell.setRotationPoint(0.0F, 0.0F, 5.0F);
        this.root.addChild(shell);
        this.shell.cubeList.add(new ModelBox(shell, 26, 0, -2.5F, -17.0F, -9.25F, 5, 5, 4, 0.0F, false));
        this.shell.cubeList.add(new ModelBox(shell, 0, 22, -4.0F, -12.0F, -10.0F, 8, 12, 10, 0.01F, false));

        this.cube_r1 = new AdvancedModelRenderer(this);
        this.cube_r1.setRotationPoint(0.0F, -3.0438F, 3.9668F);
        this.shell.addChild(cube_r1);
        this.setRotateAngle(cube_r1, 0.6545F, 0.0F, 0.0F);
        this.cube_r1.cubeList.add(new ModelBox(cube_r1, 0, 0, -4.0F, -12.0F, -5.0F, 8, 12, 10, 0.04F, false));

        this.shell2 = new AdvancedModelRenderer(this);
        this.shell2.setRotationPoint(0.0F, 0.0F, -10.0F);
        this.shell.addChild(shell2);
        this.setRotateAngle(shell2, -0.6981F, 0.0F, 0.0F);
        this.shell2.cubeList.add(new ModelBox(shell2, 26, 34, -4.0F, -11.0F, -10.0F, 8, 11, 10, 0.0F, false));

        this.shell3 = new AdvancedModelRenderer(this);
        this.shell3.setRotationPoint(0.0F, 0.0F, -10.0F);
        this.shell2.addChild(shell3);
        this.setRotateAngle(shell3, -0.6545F, 0.0F, 0.0F);
        this.shell3.cubeList.add(new ModelBox(shell3, 0, 46, -3.5F, -10.0F, -9.0F, 7, 10, 9, 0.04F, false));

        this.shell4 = new AdvancedModelRenderer(this);
        this.shell4.setRotationPoint(0.0F, 0.0F, -9.0F);
        this.shell3.addChild(shell4);
        this.setRotateAngle(shell4, -0.6981F, 0.0F, 0.0F);
        this.shell4.cubeList.add(new ModelBox(shell4, 27, 13, -3.5F, -10.0F, -9.0F, 7, 10, 9, 0.01F, false));

        this.shell5 = new AdvancedModelRenderer(this);
        this.shell5.setRotationPoint(0.0F, 0.0F, -9.0F);
        this.shell4.addChild(shell5);
        this.setRotateAngle(shell5, -0.829F, 0.0F, 0.0F);
        this.shell5.cubeList.add(new ModelBox(shell5, 50, 0, -3.0F, -9.0F, -9.0F, 6, 9, 9, 0.04F, false));

        this.shell6 = new AdvancedModelRenderer(this);
        this.shell6.setRotationPoint(0.0F, 0.0F, -9.0F);
        this.shell5.addChild(shell6);
        this.setRotateAngle(shell6, -0.829F, 0.0F, 0.0F);
        this.shell6.cubeList.add(new ModelBox(shell6, 52, 24, -3.0F, -8.0F, -8.0F, 6, 8, 8, 0.01F, false));

        this.shell7 = new AdvancedModelRenderer(this);
        this.shell7.setRotationPoint(0.0F, 0.0F, -8.0F);
        this.shell6.addChild(shell7);
        this.setRotateAngle(shell7, -0.829F, 0.0F, 0.0F);
        this.shell7.cubeList.add(new ModelBox(shell7, 60, 61, -3.0F, -6.0F, -7.0F, 6, 6, 7, 0.0F, false));

        this.shell8 = new AdvancedModelRenderer(this);
        this.shell8.setRotationPoint(0.0F, 0.0F, -7.0F);
        this.shell7.addChild(shell8);
        this.setRotateAngle(shell8, -0.7418F, 0.0F, 0.0F);
        this.shell8.cubeList.add(new ModelBox(shell8, 55, 48, -3.0F, -6.0F, -7.0F, 6, 6, 7, -0.01F, false));

        this.Mantle = new AdvancedModelRenderer(this);
        this.Mantle.setRotationPoint(0.0F, -15.425F, 0.725F);
        this.shell.addChild(Mantle);
        this.setRotateAngle(Mantle, 0.0873F, 0.0F, 0.0F);
        this.Mantle.cubeList.add(new ModelBox(Mantle, 32, 55, -3.5F, 0.0F, 0.0F, 7, 7, 7, 0.0F, false));

        this.Siphon = new AdvancedModelRenderer(this);
        this.Siphon.setRotationPoint(0.5F, 8.075F, 7.0F);
        this.Mantle.addChild(Siphon);
        this.setRotateAngle(Siphon, -0.3491F, 0.0F, 0.0F);
        this.Siphon.cubeList.add(new ModelBox(Siphon, 59, 18, -2.5F, -1.25F, -2.75F, 4, 3, 3, 0.0F, false));

        this.eyeLeft = new AdvancedModelRenderer(this);
        this.eyeLeft.setRotationPoint(-3.5F, 1.9809F, 3.4435F);
        this.Mantle.addChild(eyeLeft);
        this.setRotateAngle(eyeLeft, -0.48F, 0.0F, 0.0F);
        this.eyeLeft.cubeList.add(new ModelBox(eyeLeft, 0, 5, -0.5F, -1.0F, -1.5F, 1, 2, 3, 0.0F, false));
        this.eyeLeft.cubeList.add(new ModelBox(eyeLeft, 52, 0, -0.55F, -0.5F, -1.0F, 1, 1, 2, 0.0F, false));

        this.eyeRight = new AdvancedModelRenderer(this);
        this.eyeRight.setRotationPoint(3.5F, 1.9809F, 3.4435F);
        this.Mantle.addChild(eyeRight);
        this.setRotateAngle(eyeRight, -0.48F, 0.0F, 0.0F);
        this.eyeRight.cubeList.add(new ModelBox(eyeRight, 0, 0, -0.5F, -1.0F, -1.5F, 1, 2, 3, 0.0F, false));
        this.eyeRight.cubeList.add(new ModelBox(eyeRight, 0, 52, -0.45F, -0.5F, -1.0F, 1, 1, 2, 0.0F, false));

        this.Tentacle1a = new AdvancedModelRenderer(this);
        this.Tentacle1a.setRotationPoint(-1.15F, 6.025F, 6.575F);
        this.Mantle.addChild(Tentacle1a);
        this.Tentacle1a.cubeList.add(new ModelBox(Tentacle1a, 44, 76, -0.5F, -0.5F, 0.0F, 1, 1, 6, 0.0F, false));

        this.Tentacle1b = new AdvancedModelRenderer(this);
        this.Tentacle1b.setRotationPoint(0.0F, 0.0F, 5.5F);
        this.Tentacle1a.addChild(Tentacle1b);
        this.Tentacle1b.cubeList.add(new ModelBox(Tentacle1b, 52, 77, -0.5F, -0.5F, 0.0F, 1, 1, 6, -0.05F, false));

        this.Tentacle1c = new AdvancedModelRenderer(this);
        this.Tentacle1c.setRotationPoint(0.0F, 0.0F, 5.5F);
        this.Tentacle1b.addChild(Tentacle1c);
        this.Tentacle1c.cubeList.add(new ModelBox(Tentacle1c, 79, 62, -0.5F, -0.5F, 0.0F, 1, 1, 3, -0.1F, false));

        this.Tentacle1d = new AdvancedModelRenderer(this);
        this.Tentacle1d.setRotationPoint(0.0F, 0.0F, 2.5F);
        this.Tentacle1c.addChild(Tentacle1d);
        this.Tentacle1d.cubeList.add(new ModelBox(Tentacle1d, 79, 58, -0.5F, -0.5F, 0.0F, 1, 1, 3, -0.15F, false));

        this.Tentacle2a = new AdvancedModelRenderer(this);
        this.Tentacle2a.setRotationPoint(-2.4F, 4.775F, 6.575F);
        this.Mantle.addChild(Tentacle2a);
        this.Tentacle2a.cubeList.add(new ModelBox(Tentacle2a, 30, 76, -0.5F, -0.5F, 0.0F, 1, 1, 6, 0.0F, false));

        this.Tentacle2b = new AdvancedModelRenderer(this);
        this.Tentacle2b.setRotationPoint(0.0F, 0.0F, 5.5F);
        this.Tentacle2a.addChild(Tentacle2b);
        this.Tentacle2b.cubeList.add(new ModelBox(Tentacle2b, 74, 74, -0.5F, -0.5F, 0.0F, 1, 1, 6, -0.05F, false));

        this.Tentacle2c = new AdvancedModelRenderer(this);
        this.Tentacle2c.setRotationPoint(0.0F, 0.0F, 5.5F);
        this.Tentacle2b.addChild(Tentacle2c);
        this.Tentacle2c.cubeList.add(new ModelBox(Tentacle2c, 16, 79, -0.5F, -0.5F, 0.0F, 1, 1, 3, -0.1F, false));

        this.Tentacle2d = new AdvancedModelRenderer(this);
        this.Tentacle2d.setRotationPoint(0.0F, 0.0F, 2.5F);
        this.Tentacle2c.addChild(Tentacle2d);
        this.Tentacle2d.cubeList.add(new ModelBox(Tentacle2d, 8, 79, -0.5F, -0.5F, 0.0F, 1, 1, 3, -0.15F, false));

        this.Tentacle3a = new AdvancedModelRenderer(this);
        this.Tentacle3a.setRotationPoint(-2.9F, 3.275F, 6.575F);
        this.Mantle.addChild(Tentacle3a);
        this.Tentacle3a.cubeList.add(new ModelBox(Tentacle3a, 60, 74, -0.5F, -0.5F, 0.0F, 1, 1, 6, 0.0F, false));

        this.Tentacle3b = new AdvancedModelRenderer(this);
        this.Tentacle3b.setRotationPoint(0.0F, 0.0F, 5.5F);
        this.Tentacle3a.addChild(Tentacle3b);
        this.Tentacle3b.cubeList.add(new ModelBox(Tentacle3b, 74, 48, -0.5F, -0.5F, 0.0F, 1, 1, 6, -0.05F, false));

        this.Tentacle3c = new AdvancedModelRenderer(this);
        this.Tentacle3c.setRotationPoint(0.0F, 0.0F, 5.5F);
        this.Tentacle3b.addChild(Tentacle3c);
        this.setRotateAngle(Tentacle3c, 0.0F, 0.0F, 0.0F);
        this.Tentacle3c.cubeList.add(new ModelBox(Tentacle3c, 79, 0, -0.5F, -0.5F, 0.0F, 1, 1, 3, -0.1F, false));

        this.Tentacle3d = new AdvancedModelRenderer(this);
        this.Tentacle3d.setRotationPoint(0.0F, 0.0F, 2.5F);
        this.Tentacle3c.addChild(Tentacle3d);
        this.Tentacle3d.cubeList.add(new ModelBox(Tentacle3d, 0, 79, -0.5F, -0.5F, 0.0F, 1, 1, 3, -0.15F, false));

        this.Tentacle4a = new AdvancedModelRenderer(this);
        this.Tentacle4a.setRotationPoint(-2.4F, 1.775F, 6.575F);
        this.Mantle.addChild(Tentacle4a);


        this.Tentacle1a_r1 = new AdvancedModelRenderer(this);
        this.Tentacle1a_r1.setRotationPoint(0.0F, 0.0F, 3.0F);
        this.Tentacle4a.addChild(Tentacle1a_r1);
        this.setRotateAngle(Tentacle1a_r1, 0.0F, 0.0F, -1.5708F);
        this.Tentacle1a_r1.cubeList.add(new ModelBox(Tentacle1a_r1, 74, 34, -0.5F, -0.5F, -3.0F, 1, 1, 6, 0.0F, false));

        this.Tentacle4b = new AdvancedModelRenderer(this);
        this.Tentacle4b.setRotationPoint(0.0F, 0.0F, 5.5F);
        this.Tentacle4a.addChild(Tentacle4b);


        this.Tentacle1b_r1 = new AdvancedModelRenderer(this);
        this.Tentacle1b_r1.setRotationPoint(0.0F, 0.0F, 3.0F);
        this.Tentacle4b.addChild(Tentacle1b_r1);
        this.setRotateAngle(Tentacle1b_r1, 0.0F, 0.0F, -1.5708F);
        this.Tentacle1b_r1.cubeList.add(new ModelBox(Tentacle1b_r1, 22, 73, -0.5F, -0.5F, -3.0F, 1, 1, 6, -0.05F, false));

        this.Tentacle4c = new AdvancedModelRenderer(this);
        this.Tentacle4c.setRotationPoint(0.0F, 0.0F, 5.5F);
        this.Tentacle4b.addChild(Tentacle4c);


        this.Tentacle1b_r2 = new AdvancedModelRenderer(this);
        this.Tentacle1b_r2.setRotationPoint(0.0F, 0.0F, 1.5F);
        this.Tentacle4c.addChild(Tentacle1b_r2);
        this.setRotateAngle(Tentacle1b_r2, 0.0F, 0.0F, -1.5708F);
        this.Tentacle1b_r2.cubeList.add(new ModelBox(Tentacle1b_r2, 78, 41, -0.5F, -0.5F, -1.5F, 1, 1, 3, -0.1F, false));

        this.Tentacle4d = new AdvancedModelRenderer(this);
        this.Tentacle4d.setRotationPoint(0.0F, 0.0F, 2.5F);
        this.Tentacle4c.addChild(Tentacle4d);


        this.Tentacle1b_r3 = new AdvancedModelRenderer(this);
        this.Tentacle1b_r3.setRotationPoint(0.0F, 0.0F, 1.5F);
        this.Tentacle4d.addChild(Tentacle1b_r3);
        this.setRotateAngle(Tentacle1b_r3, 0.0F, 0.0F, -1.5708F);
        this.Tentacle1b_r3.cubeList.add(new ModelBox(Tentacle1b_r3, 38, 76, -0.5F, -0.5F, -1.5F, 1, 1, 3, -0.15F, false));

        this.Tentacle5a = new AdvancedModelRenderer(this);
        this.Tentacle5a.setRotationPoint(-1.15F, 0.525F, 6.575F);
        this.Mantle.addChild(Tentacle5a);
        this.Tentacle5a.cubeList.add(new ModelBox(Tentacle5a, 72, 25, -0.5F, -0.5F, 0.0F, 1, 1, 6, 0.0F, false));

        this.Tentacle5b = new AdvancedModelRenderer(this);
        this.Tentacle5b.setRotationPoint(0.0F, 0.0F, 5.5F);
        this.Tentacle5a.addChild(Tentacle5b);
        this.Tentacle5b.cubeList.add(new ModelBox(Tentacle5b, 72, 18, -0.5F, -0.5F, 0.0F, 1, 1, 6, -0.05F, false));

        this.Tentacle5c = new AdvancedModelRenderer(this);
        this.Tentacle5c.setRotationPoint(0.0F, 0.0F, 5.5F);
        this.Tentacle5b.addChild(Tentacle5c);
        this.Tentacle5c.cubeList.add(new ModelBox(Tentacle5c, 68, 74, -0.5F, -0.5F, 0.0F, 1, 1, 3, -0.1F, false));

        this.Tentacle5d = new AdvancedModelRenderer(this);
        this.Tentacle5d.setRotationPoint(0.0F, 0.0F, 2.5F);
        this.Tentacle5c.addChild(Tentacle5d);
        this.Tentacle5d.cubeList.add(new ModelBox(Tentacle5d, 8, 72, -0.5F, -0.5F, 0.0F, 1, 1, 3, -0.15F, false));

        this.Tentacle6a = new AdvancedModelRenderer(this);
        this.Tentacle6a.setRotationPoint(1.15F, 6.025F, 6.575F);
        this.Mantle.addChild(Tentacle6a);
        this.Tentacle6a.cubeList.add(new ModelBox(Tentacle6a, 14, 72, -0.5F, -0.5F, 0.0F, 1, 1, 6, 0.0F, false));

        this.Tentacle6b = new AdvancedModelRenderer(this);
        this.Tentacle6b.setRotationPoint(0.0F, 0.0F, 5.5F);
        this.Tentacle6a.addChild(Tentacle6b);
        this.Tentacle6b.cubeList.add(new ModelBox(Tentacle6b, 0, 72, -0.5F, -0.5F, 0.0F, 1, 1, 6, -0.05F, false));

        this.Tentacle6c = new AdvancedModelRenderer(this);
        this.Tentacle6c.setRotationPoint(0.0F, 0.0F, 5.5F);
        this.Tentacle6b.addChild(Tentacle6c);
        this.Tentacle6c.cubeList.add(new ModelBox(Tentacle6c, 38, 69, -0.5F, -0.5F, 0.0F, 1, 1, 3, -0.1F, false));

        this.Tentacle6d = new AdvancedModelRenderer(this);
        this.Tentacle6d.setRotationPoint(0.0F, 0.0F, 2.5F);
        this.Tentacle6c.addChild(Tentacle6d);
        this.Tentacle6d.cubeList.add(new ModelBox(Tentacle6d, 8, 65, -0.5F, -0.5F, 0.0F, 1, 1, 3, -0.15F, false));

        this.Tentacle7a = new AdvancedModelRenderer(this);
        this.Tentacle7a.setRotationPoint(2.4F, 4.775F, 6.575F);
        this.Mantle.addChild(Tentacle7a);
        this.Tentacle7a.cubeList.add(new ModelBox(Tentacle7a, 71, 0, -0.5F, -0.5F, 0.0F, 1, 1, 6, 0.0F, false));

        this.Tentacle7b = new AdvancedModelRenderer(this);
        this.Tentacle7b.setRotationPoint(0.0F, 0.0F, 5.5F);
        this.Tentacle7a.addChild(Tentacle7b);
        this.Tentacle7b.cubeList.add(new ModelBox(Tentacle7b, 52, 70, -0.5F, -0.5F, 0.0F, 1, 1, 6, -0.05F, false));

        this.Tentacle7c = new AdvancedModelRenderer(this);
        this.Tentacle7c.setRotationPoint(0.0F, 0.0F, 5.5F);
        this.Tentacle7b.addChild(Tentacle7c);
        this.Tentacle7c.cubeList.add(new ModelBox(Tentacle7c, 60, 40, -0.5F, -0.5F, 0.0F, 1, 1, 3, -0.1F, false));

        this.Tentacle7d = new AdvancedModelRenderer(this);
        this.Tentacle7d.setRotationPoint(0.0F, 0.0F, 2.5F);
        this.Tentacle7c.addChild(Tentacle7d);
        this.Tentacle7d.cubeList.add(new ModelBox(Tentacle7d, 52, 40, -0.5F, -0.5F, 0.0F, 1, 1, 3, -0.15F, false));

        this.Tentacle8a = new AdvancedModelRenderer(this);
        this.Tentacle8a.setRotationPoint(2.9F, 3.275F, 6.575F);
        this.Mantle.addChild(Tentacle8a);
        this.Tentacle8a.cubeList.add(new ModelBox(Tentacle8a, 30, 69, -0.5F, -0.5F, 0.0F, 1, 1, 6, 0.0F, false));

        this.Tentacle8b = new AdvancedModelRenderer(this);
        this.Tentacle8b.setRotationPoint(0.0F, 0.0F, 5.5F);
        this.Tentacle8a.addChild(Tentacle8b);
        this.Tentacle8b.cubeList.add(new ModelBox(Tentacle8b, 22, 66, -0.5F, -0.5F, 0.0F, 1, 1, 6, -0.05F, false));

        this.Tentacle8c = new AdvancedModelRenderer(this);
        this.Tentacle8c.setRotationPoint(0.0F, 0.0F, 5.5F);
        this.Tentacle8b.addChild(Tentacle8c);
        this.setRotateAngle(Tentacle8c, 0.0F, 0.0F, 0.0F);
        this.Tentacle8c.cubeList.add(new ModelBox(Tentacle8c, 0, 44, -0.5F, -0.5F, 0.0F, 1, 1, 3, -0.1F, false));

        this.Tentacle8d = new AdvancedModelRenderer(this);
        this.Tentacle8d.setRotationPoint(0.0F, 0.0F, 2.5F);
        this.Tentacle8c.addChild(Tentacle8d);
        this.Tentacle8d.cubeList.add(new ModelBox(Tentacle8d, 41, 7, -0.5F, -0.5F, 0.0F, 1, 1, 3, -0.15F, false));

        this.Tentacle9a = new AdvancedModelRenderer(this);
        this.Tentacle9a.setRotationPoint(2.4F, 1.775F, 6.575F);
        this.Mantle.addChild(Tentacle9a);


        this.Tentacle1a_r2 = new AdvancedModelRenderer(this);
        this.Tentacle1a_r2.setRotationPoint(0.0F, 0.0F, 3.0F);
        this.Tentacle9a.addChild(Tentacle1a_r2);
        this.setRotateAngle(Tentacle1a_r2, 0.0F, 0.0F, 1.5708F);
        this.Tentacle1a_r2.cubeList.add(new ModelBox(Tentacle1a_r2, 14, 65, -0.5F, -0.5F, -3.0F, 1, 1, 6, 0.0F, false));

        this.Tentacle9b = new AdvancedModelRenderer(this);
        this.Tentacle9b.setRotationPoint(0.0F, 0.0F, 5.5F);
        this.Tentacle9a.addChild(Tentacle9b);


        this.Tentacle1b_r4 = new AdvancedModelRenderer(this);
        this.Tentacle1b_r4.setRotationPoint(0.0F, 0.0F, 3.0F);
        this.Tentacle9b.addChild(Tentacle1b_r4);
        this.setRotateAngle(Tentacle1b_r4, 0.0F, 0.0F, 1.5708F);
        this.Tentacle1b_r4.cubeList.add(new ModelBox(Tentacle1b_r4, 0, 65, -0.5F, -0.5F, -3.0F, 1, 1, 6, -0.05F, false));

        this.Tentacle9c = new AdvancedModelRenderer(this);
        this.Tentacle9c.setRotationPoint(0.0F, 0.0F, 5.5F);
        this.Tentacle9b.addChild(Tentacle9c);


        this.Tentacle1b_r5 = new AdvancedModelRenderer(this);
        this.Tentacle1b_r5.setRotationPoint(0.0F, 0.0F, 1.5F);
        this.Tentacle9c.addChild(Tentacle1b_r5);
        this.setRotateAngle(Tentacle1b_r5, 0.0F, 0.0F, 1.5708F);
        this.Tentacle1b_r5.cubeList.add(new ModelBox(Tentacle1b_r5, 40, 0, -0.5F, -0.5F, -1.5F, 1, 1, 3, -0.1F, false));

        this.Tentacle9d = new AdvancedModelRenderer(this);
        this.Tentacle9d.setRotationPoint(0.0F, 0.0F, 2.5F);
        this.Tentacle9c.addChild(Tentacle9d);


        this.Tentacle1b_r6 = new AdvancedModelRenderer(this);
        this.Tentacle1b_r6.setRotationPoint(0.0F, 0.0F, 1.5F);
        this.Tentacle9d.addChild(Tentacle1b_r6);
        this.setRotateAngle(Tentacle1b_r6, 0.0F, 0.0F, 1.5708F);
        this.Tentacle1b_r6.cubeList.add(new ModelBox(Tentacle1b_r6, 36, 9, -0.5F, -0.5F, -1.5F, 1, 1, 3, -0.15F, false));

        this.Tentacle10a = new AdvancedModelRenderer(this);
        this.Tentacle10a.setRotationPoint(1.15F, 0.525F, 6.575F);
        this.Mantle.addChild(Tentacle10a);
        this.Tentacle10a.cubeList.add(new ModelBox(Tentacle10a, 62, 40, -0.5F, -0.5F, 0.0F, 1, 1, 6, 0.0F, false));

        this.Tentacle10b = new AdvancedModelRenderer(this);
        this.Tentacle10b.setRotationPoint(0.0F, 0.0F, 5.5F);
        this.Tentacle10a.addChild(Tentacle10b);
        this.Tentacle10b.cubeList.add(new ModelBox(Tentacle10b, 44, 0, -0.5F, -0.5F, 0.0F, 1, 1, 6, -0.05F, false));

        this.Tentacle10c = new AdvancedModelRenderer(this);
        this.Tentacle10c.setRotationPoint(0.0F, 0.0F, 5.5F);
        this.Tentacle10b.addChild(Tentacle10c);
        this.Tentacle10c.cubeList.add(new ModelBox(Tentacle10c, 0, 26, -0.5F, -0.5F, 0.0F, 1, 1, 3, -0.1F, false));

        this.Tentacle10d = new AdvancedModelRenderer(this);
        this.Tentacle10d.setRotationPoint(0.0F, 0.0F, 2.5F);
        this.Tentacle10c.addChild(Tentacle10d);
        this.Tentacle10d.cubeList.add(new ModelBox(Tentacle10d, 0, 22, -0.5F, -0.5F, 0.0F, 1, 1, 3, -0.15F, false));
        
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
        EntityPrehistoricFloraAmmonite_Manticoceras ee = (EntityPrehistoricFloraAmmonite_Manticoceras) entitylivingbaseIn;

        animWalking(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime);


    }

    public void animWalking(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime) {
        EntityPrehistoricFloraAmmonite_Manticoceras entity = (EntityPrehistoricFloraAmmonite_Manticoceras) entitylivingbaseIn;
        int animCycle = 80;
        double tickAnim = (entity.ticksExisted + entity.getTickOffset()) - (int) (Math.floor((double) (entity.ticksExisted + entity.getTickOffset()) / (double) animCycle) * (double) animCycle) + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;
        this.setRotateAngle(shell, shell.rotateAngleX + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180))*5), shell.rotateAngleY + (float) Math.toRadians(0), shell.rotateAngleZ + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*90))*2.5));
        this.shell.rotationPointX = this.shell.rotationPointX + (float)(0);
        this.shell.rotationPointY = this.shell.rotationPointY - (float)(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180-90))*-1);
        this.shell.rotationPointZ = this.shell.rotationPointZ + (float)(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180-60))*3);


        this.setRotateAngle(Mantle, Mantle.rotateAngleX + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180+60))*-2.5), Mantle.rotateAngleY + (float) Math.toRadians(0), Mantle.rotateAngleZ + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*90))*-2.5));
        this.Mantle.setScale((float)(1+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360))*0.01),(float)(1+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360))*0.01),(float)(1.1+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180))*-0.01));


        this.setRotateAngle(Siphon, Siphon.rotateAngleX + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180+60))*2.5+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180))*-5), Siphon.rotateAngleY + (float) Math.toRadians(0), Siphon.rotateAngleZ + (float) Math.toRadians(0));
        this.Siphon.rotationPointX = this.Siphon.rotationPointX + (float)(0);
        this.Siphon.rotationPointY = this.Siphon.rotationPointY - (float)(0);
        this.Siphon.rotationPointZ = this.Siphon.rotationPointZ + (float)(-0.625+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180))*0.5);
        this.Siphon.setScale((float)(1+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180-30))*0.01),(float)(1+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180-30))*0.01),(float)(1+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180))*0.1));


        this.setRotateAngle(eyeLeft, eyeLeft.rotateAngleX + (float) Math.toRadians(2.8919+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180+30))*5), eyeLeft.rotateAngleY + (float) Math.toRadians(-13.4729), eyeLeft.rotateAngleZ + (float) Math.toRadians(7.71767));


        this.setRotateAngle(eyeRight, eyeRight.rotateAngleX + (float) Math.toRadians(2.8919+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180+30))*5), eyeRight.rotateAngleY + (float) Math.toRadians(13.47289), eyeRight.rotateAngleZ + (float) Math.toRadians(7.71767));


        this.setRotateAngle(Tentacle1a, Tentacle1a.rotateAngleX + (float) Math.toRadians(20+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360))*-2.5), Tentacle1a.rotateAngleY + (float) Math.toRadians(2.5+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360))*-1.25), Tentacle1a.rotateAngleZ + (float) Math.toRadians(5));
        this.Tentacle1a.setScale((float)1.5,(float)1,(float)(1.05+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360+30))*-0.05));


        this.setRotateAngle(Tentacle1b, Tentacle1b.rotateAngleX + (float) Math.toRadians(-30+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360-60))*-5), Tentacle1b.rotateAngleY + (float) Math.toRadians(0), Tentacle1b.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(Tentacle1c, Tentacle1c.rotateAngleX + (float) Math.toRadians(-20+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360-120))*-2.5), Tentacle1c.rotateAngleY + (float) Math.toRadians(0), Tentacle1c.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(Tentacle2a, Tentacle2a.rotateAngleX + (float) Math.toRadians(10+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360))*-1.25), Tentacle2a.rotateAngleY + (float) Math.toRadians(5+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360))*-2.5), Tentacle2a.rotateAngleZ + (float) Math.toRadians(0));
        this.Tentacle2a.setScale((float)1,(float)1.5,(float)(1.05+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360+30))*-0.05));


        this.setRotateAngle(Tentacle2b, Tentacle2b.rotateAngleX + (float) Math.toRadians(-10+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360-60))*-2.5), Tentacle2b.rotateAngleY + (float) Math.toRadians(-2.5+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360-60))*-2.5), Tentacle2b.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(Tentacle2c, Tentacle2c.rotateAngleX + (float) Math.toRadians(-25+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360-120))*-2.5), Tentacle2c.rotateAngleY + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360-120))*-2.5), Tentacle2c.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(Tentacle2d, Tentacle2d.rotateAngleX + (float) Math.toRadians(-45+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360-180))*-15), Tentacle2d.rotateAngleY + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360-180))*-15), Tentacle2d.rotateAngleZ + (float) Math.toRadians(0));
        this.Tentacle2d.setScale((float)1,(float)1,(float)0.8);


        this.setRotateAngle(Tentacle3a, Tentacle3a.rotateAngleX + (float) Math.toRadians(10), Tentacle3a.rotateAngleY + (float) Math.toRadians(2.5+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360))*-2.5), Tentacle3a.rotateAngleZ + (float) Math.toRadians(0));
        this.Tentacle3a.setScale((float)1,(float)1.5,(float)(1.05+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360+30))*-0.05));


        this.setRotateAngle(Tentacle3b, Tentacle3b.rotateAngleX + (float) Math.toRadians(-10), Tentacle3b.rotateAngleY + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360-60))*-2.5), Tentacle3b.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(Tentacle3c, Tentacle3c.rotateAngleX + (float) Math.toRadians(-25), Tentacle3c.rotateAngleY + (float) Math.toRadians(5+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360-120))*-2.5), Tentacle3c.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(Tentacle4a, Tentacle4a.rotateAngleX + (float) Math.toRadians(5+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360))*1.25), Tentacle4a.rotateAngleY + (float) Math.toRadians(2.5+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360))*-2.5), Tentacle4a.rotateAngleZ + (float) Math.toRadians(15));
        this.Tentacle4a.setScale((float)1,(float)1.5,(float)(1.05+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360+30))*-0.05));


        this.setRotateAngle(Tentacle4b, Tentacle4b.rotateAngleX + (float) Math.toRadians(-5+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360-60))*1.25), Tentacle4b.rotateAngleY + (float) Math.toRadians(2.5+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360-60))*-2.5), Tentacle4b.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(Tentacle4c, Tentacle4c.rotateAngleX + (float) Math.toRadians(-25+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360-120))*1.25), Tentacle4c.rotateAngleY + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360-120))*-2.5), Tentacle4c.rotateAngleZ + (float) Math.toRadians(-15));


        this.setRotateAngle(Tentacle5a, Tentacle5a.rotateAngleX + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360))*2.5), Tentacle5a.rotateAngleY + (float) Math.toRadians(2.5+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360))*-1.25), Tentacle5a.rotateAngleZ + (float) Math.toRadians(-5));
        this.Tentacle5a.setScale((float)1.5,(float)1,(float)(1.05+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360+30))*-0.05));


        this.setRotateAngle(Tentacle5b, Tentacle5b.rotateAngleX + (float) Math.toRadians(-5+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360-60))*2.5), Tentacle5b.rotateAngleY + (float) Math.toRadians(0), Tentacle5b.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(Tentacle5c, Tentacle5c.rotateAngleX + (float) Math.toRadians(-30+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360-120))*2.5), Tentacle5c.rotateAngleY + (float) Math.toRadians(-5), Tentacle5c.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(Tentacle6a, Tentacle6a.rotateAngleX + (float) Math.toRadians(20+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360))*-2.5), Tentacle6a.rotateAngleY + (float) Math.toRadians(-2.5+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360))*1.25), Tentacle6a.rotateAngleZ + (float) Math.toRadians(-5));
        this.Tentacle6a.setScale((float)1.5,(float)1,(float)(1.05+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360+30))*-0.05));


        this.setRotateAngle(Tentacle6b, Tentacle6b.rotateAngleX + (float) Math.toRadians(-30+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360-60))*-5), Tentacle6b.rotateAngleY + (float) Math.toRadians(0), Tentacle6b.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(Tentacle6c, Tentacle6c.rotateAngleX + (float) Math.toRadians(-20+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360-120))*-2.5), Tentacle6c.rotateAngleY + (float) Math.toRadians(0), Tentacle6c.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(Tentacle7a, Tentacle7a.rotateAngleX + (float) Math.toRadians(10+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360))*-1.25), Tentacle7a.rotateAngleY + (float) Math.toRadians(-5+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360))*2.5), Tentacle7a.rotateAngleZ + (float) Math.toRadians(0));
        this.Tentacle7a.setScale((float)1,(float)1.5,(float)(1.05+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360+30))*-0.05));


        this.setRotateAngle(Tentacle7b, Tentacle7b.rotateAngleX + (float) Math.toRadians(-10+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360-60))*-2.5), Tentacle7b.rotateAngleY + (float) Math.toRadians(2.5+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360-60))*2.5), Tentacle7b.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(Tentacle7c, Tentacle7c.rotateAngleX + (float) Math.toRadians(-25+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360-120))*-2.5), Tentacle7c.rotateAngleY + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360-120))*2.5), Tentacle7c.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(Tentacle7d, Tentacle7d.rotateAngleX + (float) Math.toRadians(-45+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360-180))*-15), Tentacle7d.rotateAngleY + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360-180))*15), Tentacle7d.rotateAngleZ + (float) Math.toRadians(0));
        this.Tentacle7d.setScale((float)1,(float)1,(float)0.8);


        this.setRotateAngle(Tentacle8a, Tentacle8a.rotateAngleX + (float) Math.toRadians(10), Tentacle8a.rotateAngleY + (float) Math.toRadians(-2.5+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360))*2.5), Tentacle8a.rotateAngleZ + (float) Math.toRadians(0));
        this.Tentacle8a.setScale((float)1,(float)1.5,(float)(1.05+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360+30))*-0.05));


        this.setRotateAngle(Tentacle8b, Tentacle8b.rotateAngleX + (float) Math.toRadians(-10), Tentacle8b.rotateAngleY + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360-60))*2.5), Tentacle8b.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(Tentacle8c, Tentacle8c.rotateAngleX + (float) Math.toRadians(-25), Tentacle8c.rotateAngleY + (float) Math.toRadians(-5+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360-120))*2.5), Tentacle8c.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(Tentacle9a, Tentacle9a.rotateAngleX + (float) Math.toRadians(5+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360))*1.25), Tentacle9a.rotateAngleY + (float) Math.toRadians(-2.5+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360))*2.5), Tentacle9a.rotateAngleZ + (float) Math.toRadians(-15));
        this.Tentacle9a.setScale((float)1,(float)1.5,(float)(1.05+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360+30))*-0.05));


        this.setRotateAngle(Tentacle9b, Tentacle9b.rotateAngleX + (float) Math.toRadians(-5+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360-60))*1.25), Tentacle9b.rotateAngleY + (float) Math.toRadians(-2.5+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360-60))*2.5), Tentacle9b.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(Tentacle9c, Tentacle9c.rotateAngleX + (float) Math.toRadians(-25+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360-120))*1.25), Tentacle9c.rotateAngleY + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360-120))*2.5), Tentacle9c.rotateAngleZ + (float) Math.toRadians(15));


        this.setRotateAngle(Tentacle10a, Tentacle10a.rotateAngleX + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360))*2.5), Tentacle10a.rotateAngleY + (float) Math.toRadians(-2.5+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360))*1.25), Tentacle10a.rotateAngleZ + (float) Math.toRadians(5));
        this.Tentacle10a.setScale((float)1.5,(float)1,(float)(1.05+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360+30))*-0.05));


        this.setRotateAngle(Tentacle10b, Tentacle10b.rotateAngleX + (float) Math.toRadians(-5+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360-60))*2.5), Tentacle10b.rotateAngleY + (float) Math.toRadians(0), Tentacle10b.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(Tentacle10c, Tentacle10c.rotateAngleX + (float) Math.toRadians(-30+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360-120))*2.5), Tentacle10c.rotateAngleY + (float) Math.toRadians(5), Tentacle10c.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(Tentacle1d, Tentacle1d.rotateAngleX + (float) Math.toRadians(-40+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360-180))*-15), Tentacle1d.rotateAngleY + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360-180))*-5), Tentacle1d.rotateAngleZ + (float) Math.toRadians(0));
        this.Tentacle1d.setScale((float)1,(float)1,(float)1.2);


        this.setRotateAngle(Tentacle3d, Tentacle3d.rotateAngleX + (float) Math.toRadians(-35), Tentacle3d.rotateAngleY + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360-180))*-15), Tentacle3d.rotateAngleZ + (float) Math.toRadians(0));
        this.Tentacle3d.setScale((float)1,(float)1,(float)0.9);


        this.setRotateAngle(Tentacle4d, Tentacle4d.rotateAngleX + (float) Math.toRadians(-25+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360-180))*15), Tentacle4d.rotateAngleY + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360-180))*-15), Tentacle4d.rotateAngleZ + (float) Math.toRadians(0));



        this.setRotateAngle(Tentacle5d, Tentacle5d.rotateAngleX + (float) Math.toRadians(-25+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360-180))*15), Tentacle5d.rotateAngleY + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360-180))*-5), Tentacle5d.rotateAngleZ + (float) Math.toRadians(0));
        this.Tentacle5d.setScale((float)1,(float)1,(float)1.4);


        this.setRotateAngle(Tentacle6d, Tentacle6d.rotateAngleX + (float) Math.toRadians(-40+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360-180))*-15), Tentacle6d.rotateAngleY + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360-180))*5), Tentacle6d.rotateAngleZ + (float) Math.toRadians(0));
        this.Tentacle6d.setScale((float)1,(float)1,(float)1.2);


        this.setRotateAngle(Tentacle8d, Tentacle8d.rotateAngleX + (float) Math.toRadians(-35), Tentacle8d.rotateAngleY + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360-180))*15), Tentacle8d.rotateAngleZ + (float) Math.toRadians(0));
        this.Tentacle8d.setScale((float)1,(float)1,(float)0.9);


        this.setRotateAngle(Tentacle9d, Tentacle9d.rotateAngleX + (float) Math.toRadians(-25+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360-180))*15), Tentacle9d.rotateAngleY + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360-180))*15), Tentacle9d.rotateAngleZ + (float) Math.toRadians(0));



        this.setRotateAngle(Tentacle10d, Tentacle10d.rotateAngleX + (float) Math.toRadians(-25+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360-180))*15), Tentacle10d.rotateAngleY + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360-180))*5), Tentacle10d.rotateAngleZ + (float) Math.toRadians(0));
        this.Tentacle10d.setScale((float)1,(float)1,(float)1.4);

    }

    @Override
    public void setRotationAngles(float f, float f1, float f2, float f3, float f4, float f5, Entity e) {
        super.setRotationAngles(f, f1, f2, f3, f4, f5, e);
        //this.resetToDefaultPose();

        //this.body.offsetY = 1.50F;

        EntityPrehistoricFloraAmmonite_Manticoceras ee = (EntityPrehistoricFloraAmmonite_Manticoceras) e;

        if (!e.isInWater()) {
            this.root.rotateAngleZ = (float) Math.toRadians(90);
            this.root.offsetY = 0f;
        }

    }

    public void animate(IAnimatedEntity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        animator.update(entity);
    }
}

