package net.lepidodendron.entity.model.entity;

import net.ilexiconn.llibrary.client.model.ModelAnimator;
import net.ilexiconn.llibrary.client.model.tools.AdvancedModelRenderer;
import net.ilexiconn.llibrary.server.animation.IAnimatedEntity;
import net.lepidodendron.entity.EntityPrehistoricFloraAmmonite_Pachydesmoceras;
import net.lepidodendron.entity.model.ModelBasePalaeopedia;
import net.minecraft.client.model.ModelBox;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;

public class ModelPachydesmoceras extends ModelBasePalaeopedia {
    private final AdvancedModelRenderer root;
    private final AdvancedModelRenderer shell;
    private final AdvancedModelRenderer shell2;
    private final AdvancedModelRenderer shell3;
    private final AdvancedModelRenderer shell4;
    private final AdvancedModelRenderer shell5;
    private final AdvancedModelRenderer shell6;
    private final AdvancedModelRenderer shell7;
    private final AdvancedModelRenderer shell8;
    private final AdvancedModelRenderer mantle;
    private final AdvancedModelRenderer eyeLeft;
    private final AdvancedModelRenderer cube_r1;
    private final AdvancedModelRenderer eyeRight;
    private final AdvancedModelRenderer cube_r2;
    private final AdvancedModelRenderer siphon;
    private final AdvancedModelRenderer tentacle1a;
    private final AdvancedModelRenderer tentacle1b;
    private final AdvancedModelRenderer tentacle1c;
    private final AdvancedModelRenderer tentacle2a;
    private final AdvancedModelRenderer tentacle2b;
    private final AdvancedModelRenderer tentacle2c;
    private final AdvancedModelRenderer tentacle3a;
    private final AdvancedModelRenderer tentacle3b;
    private final AdvancedModelRenderer tentacle3c;
    private final AdvancedModelRenderer tentacle4a;
    private final AdvancedModelRenderer cube_r3;
    private final AdvancedModelRenderer tentacle4b;
    private final AdvancedModelRenderer cube_r4;
    private final AdvancedModelRenderer tentacle4c;
    private final AdvancedModelRenderer cube_r5;
    private final AdvancedModelRenderer tentacle5a;
    private final AdvancedModelRenderer tentacle5b;
    private final AdvancedModelRenderer tentacle5c;
    private final AdvancedModelRenderer tentacle6a;
    private final AdvancedModelRenderer tentacle6b;
    private final AdvancedModelRenderer tentacle6c;
    private final AdvancedModelRenderer tentacle7a;
    private final AdvancedModelRenderer tentacle7b;
    private final AdvancedModelRenderer tentacle7c;
    private final AdvancedModelRenderer tentacle8a;
    private final AdvancedModelRenderer tentacle8b;
    private final AdvancedModelRenderer tentacle8c;
    private final AdvancedModelRenderer tentacle9a;
    private final AdvancedModelRenderer cube_r6;
    private final AdvancedModelRenderer tentacle9b;
    private final AdvancedModelRenderer cube_r7;
    private final AdvancedModelRenderer tentacle9c;
    private final AdvancedModelRenderer cube_r8;
    private final AdvancedModelRenderer tentacle10a;
    private final AdvancedModelRenderer tentacle10b;
    private final AdvancedModelRenderer tentacle10c;

    private ModelAnimator animator;

    public ModelPachydesmoceras() {
        this.textureWidth = 128;
        this.textureHeight = 128;

        this.root = new AdvancedModelRenderer(this);
        this.root.setRotationPoint(0.0F, 24.0F, 0.0F);
        this.setRotateAngle(root, 0.0F, 3.1416F, 0.0F);


        this.shell = new AdvancedModelRenderer(this);
        this.shell.setRotationPoint(0.0F, -6.5F, -4.0F);
        this.root.addChild(shell);
        this.setRotateAngle(shell, -0.3491F, 0.0F, 0.0F);
        this.shell.cubeList.add(new ModelBox(shell, 18, 12, -3.0F, -3.5F, -4.0F, 6, 8, 10, 0.0F, false));
        this.shell.cubeList.add(new ModelBox(shell, 0, 0, -1.0F, -13.5F, -4.0F, 2, 10, 12, 0.0F, false));

        this.shell2 = new AdvancedModelRenderer(this);
        this.shell2.setRotationPoint(0.0F, 4.5F, 6.0F);
        this.shell.addChild(shell2);
        this.setRotateAngle(shell2, 0.7418F, 0.0F, 0.0F);
        this.shell2.cubeList.add(new ModelBox(shell2, 30, 30, -2.5F, -7.0F, 0.0F, 5, 7, 10, 0.02F, false));

        this.shell3 = new AdvancedModelRenderer(this);
        this.shell3.setRotationPoint(0.0F, 0.0F, 10.0F);
        this.shell2.addChild(shell3);
        this.setRotateAngle(shell3, 0.7418F, 0.0F, 0.0F);
        this.shell3.cubeList.add(new ModelBox(shell3, 0, 30, -2.5F, -7.0F, 0.0F, 5, 7, 10, 0.01F, false));

        this.shell4 = new AdvancedModelRenderer(this);
        this.shell4.setRotationPoint(0.0F, 0.0F, 10.0F);
        this.shell3.addChild(shell4);
        this.setRotateAngle(shell4, 0.829F, 0.0F, 0.0F);
        this.shell4.cubeList.add(new ModelBox(shell4, 40, 0, -2.0F, -7.0F, 0.0F, 4, 7, 10, 0.02F, false));

        this.shell5 = new AdvancedModelRenderer(this);
        this.shell5.setRotationPoint(0.0F, 0.0F, 10.0F);
        this.shell4.addChild(shell5);
        this.setRotateAngle(shell5, 0.829F, 0.0F, 0.0F);
        this.shell5.cubeList.add(new ModelBox(shell5, 26, 47, -2.0F, -7.0F, 0.0F, 4, 7, 9, 0.01F, false));

        this.shell6 = new AdvancedModelRenderer(this);
        this.shell6.setRotationPoint(0.0F, 0.0F, 9.0F);
        this.shell5.addChild(shell6);
        this.setRotateAngle(shell6, 0.8727F, 0.0F, 0.0F);
        this.shell6.cubeList.add(new ModelBox(shell6, 0, 47, -2.0F, -7.0F, 0.0F, 4, 7, 9, 0.004F, false));

        this.shell7 = new AdvancedModelRenderer(this);
        this.shell7.setRotationPoint(0.0F, 0.0F, 9.0F);
        this.shell6.addChild(shell7);
        this.setRotateAngle(shell7, 0.9163F, 0.0F, 0.0F);
        this.shell7.cubeList.add(new ModelBox(shell7, 52, 39, -2.0F, -6.0F, 0.0F, 4, 6, 8, 0.0F, false));

        this.shell8 = new AdvancedModelRenderer(this);
        this.shell8.setRotationPoint(0.0F, 0.0F, 8.0F);
        this.shell7.addChild(shell8);
        this.setRotateAngle(shell8, 0.6545F, 0.0F, 0.0F);
        this.shell8.cubeList.add(new ModelBox(shell8, 50, 17, -2.0F, -6.0F, 0.0F, 4, 6, 9, -0.01F, false));

        this.mantle = new AdvancedModelRenderer(this);
        this.mantle.setRotationPoint(0.5F, -3.0F, -4.0F);
        this.shell.addChild(mantle);
        this.setRotateAngle(mantle, 0.3054F, 0.0F, 0.0F);
        this.mantle.cubeList.add(new ModelBox(mantle, 16, 0, -3.0F, 0.0F, -6.0F, 5, 6, 6, 0.0F, false));

        this.eyeLeft = new AdvancedModelRenderer(this);
        this.eyeLeft.setRotationPoint(2.0F, 1.25F, -2.0F);
        this.mantle.addChild(eyeLeft);
        this.setRotateAngle(eyeLeft, 0.1634F, -0.5457F, -0.3076F);
        this.eyeLeft.cubeList.add(new ModelBox(eyeLeft, 40, 17, -1.0F, -1.0F, -1.0F, 4, 2, 2, 0.0F, false));

        this.cube_r1 = new AdvancedModelRenderer(this);
        this.cube_r1.setRotationPoint(3.0F, -1.0F, 1.0F);
        this.eyeLeft.addChild(cube_r1);
        this.setRotateAngle(cube_r1, 0.0F, -0.7418F, 0.0F);
        this.cube_r1.cubeList.add(new ModelBox(cube_r1, 10, 22, -4.0F, -2.0F, 0.0F, 4, 2, 0, 0.0F, false));

        this.eyeRight = new AdvancedModelRenderer(this);
        this.eyeRight.setRotationPoint(-3.0F, 1.25F, -2.0F);
        this.mantle.addChild(eyeRight);
        this.setRotateAngle(eyeRight, 0.1634F, 0.5457F, 0.3076F);
        this.eyeRight.cubeList.add(new ModelBox(eyeRight, 38, 6, -3.0F, -1.0F, -1.0F, 4, 2, 2, 0.0F, false));

        this.cube_r2 = new AdvancedModelRenderer(this);
        this.cube_r2.setRotationPoint(-3.0F, -1.0F, 1.0F);
        this.eyeRight.addChild(cube_r2);
        this.setRotateAngle(cube_r2, 0.0F, 0.7418F, 0.0F);
        this.cube_r2.cubeList.add(new ModelBox(cube_r2, 10, 24, 0.0F, -2.0F, 0.0F, 4, 2, 0, 0.0F, false));

        this.siphon = new AdvancedModelRenderer(this);
        this.siphon.setRotationPoint(0.0F, 6.0F, -2.0F);
        this.mantle.addChild(siphon);
        this.setRotateAngle(siphon, 0.2182F, 0.0F, 0.0F);
        this.siphon.cubeList.add(new ModelBox(siphon, 0, 22, -2.0F, -1.0F, -3.825F, 3, 2, 4, 0.0F, false));

        this.tentacle1a = new AdvancedModelRenderer(this);
        this.tentacle1a.setRotationPoint(0.5F, 5.5F, -6.0F);
        this.mantle.addChild(tentacle1a);
        this.tentacle1a.cubeList.add(new ModelBox(tentacle1a, 64, 68, -0.5F, -0.5F, -5.0F, 1, 1, 5, 0.0F, false));

        this.tentacle1b = new AdvancedModelRenderer(this);
        this.tentacle1b.setRotationPoint(0.0F, 0.0F, -4.5F);
        this.tentacle1a.addChild(tentacle1b);
        this.tentacle1b.cubeList.add(new ModelBox(tentacle1b, 68, 59, -0.5F, -0.5F, -5.0F, 1, 1, 5, -0.1F, false));

        this.tentacle1c = new AdvancedModelRenderer(this);
        this.tentacle1c.setRotationPoint(0.0F, 0.0F, -4.5F);
        this.tentacle1b.addChild(tentacle1c);
        this.tentacle1c.cubeList.add(new ModelBox(tentacle1c, 68, 38, -0.5F, -0.5F, -5.0F, 1, 1, 5, -0.2F, false));

        this.tentacle2a = new AdvancedModelRenderer(this);
        this.tentacle2a.setRotationPoint(1.5F, 4.25F, -6.0F);
        this.mantle.addChild(tentacle2a);
        this.tentacle2a.cubeList.add(new ModelBox(tentacle2a, 57, 67, -0.5F, -0.5F, -5.0F, 1, 1, 5, 0.0F, false));

        this.tentacle2b = new AdvancedModelRenderer(this);
        this.tentacle2b.setRotationPoint(0.0F, 0.0F, -4.5F);
        this.tentacle2a.addChild(tentacle2b);
        this.tentacle2b.cubeList.add(new ModelBox(tentacle2b, 67, 18, -0.5F, -0.5F, -5.0F, 1, 1, 5, -0.1F, false));

        this.tentacle2c = new AdvancedModelRenderer(this);
        this.tentacle2c.setRotationPoint(0.0F, 0.0F, -4.5F);
        this.tentacle2b.addChild(tentacle2c);
        this.tentacle2c.cubeList.add(new ModelBox(tentacle2c, 67, 12, -0.5F, -0.5F, -5.0F, 1, 1, 5, -0.2F, false));

        this.tentacle3a = new AdvancedModelRenderer(this);
        this.tentacle3a.setRotationPoint(1.5F, 3.0F, -6.0F);
        this.mantle.addChild(tentacle3a);
        this.tentacle3a.cubeList.add(new ModelBox(tentacle3a, 66, 53, -0.5F, -0.5F, -5.0F, 1, 1, 5, 0.0F, false));

        this.tentacle3b = new AdvancedModelRenderer(this);
        this.tentacle3b.setRotationPoint(0.0F, 0.0F, -4.5F);
        this.tentacle3a.addChild(tentacle3b);
        this.tentacle3b.cubeList.add(new ModelBox(tentacle3b, 50, 66, -0.5F, -0.5F, -5.0F, 1, 1, 5, -0.1F, false));

        this.tentacle3c = new AdvancedModelRenderer(this);
        this.tentacle3c.setRotationPoint(0.0F, 0.0F, -4.5F);
        this.tentacle3b.addChild(tentacle3c);
        this.tentacle3c.cubeList.add(new ModelBox(tentacle3c, 43, 65, -0.5F, -0.5F, -5.0F, 1, 1, 5, -0.2F, false));

        this.tentacle4a = new AdvancedModelRenderer(this);
        this.tentacle4a.setRotationPoint(1.5F, 1.75F, -6.0F);
        this.mantle.addChild(tentacle4a);


        this.cube_r3 = new AdvancedModelRenderer(this);
        this.cube_r3.setRotationPoint(0.0F, 0.0F, -2.5F);
        this.tentacle4a.addChild(cube_r3);
        this.setRotateAngle(cube_r3, 0.0F, 0.0F, 1.5708F);
        this.cube_r3.cubeList.add(new ModelBox(cube_r3, 65, 1, -0.5F, -0.5F, -2.5F, 1, 1, 5, 0.0F, false));

        this.tentacle4b = new AdvancedModelRenderer(this);
        this.tentacle4b.setRotationPoint(0.0F, 0.0F, -4.5F);
        this.tentacle4a.addChild(tentacle4b);


        this.cube_r4 = new AdvancedModelRenderer(this);
        this.cube_r4.setRotationPoint(0.0F, 0.0F, -2.5F);
        this.tentacle4b.addChild(cube_r4);
        this.setRotateAngle(cube_r4, 0.0F, 0.0F, 1.5708F);
        this.cube_r4.cubeList.add(new ModelBox(cube_r4, 64, 32, -0.5F, -0.5F, -2.5F, 1, 1, 5, -0.1F, false));

        this.tentacle4c = new AdvancedModelRenderer(this);
        this.tentacle4c.setRotationPoint(0.0F, 0.0F, -4.5F);
        this.tentacle4b.addChild(tentacle4c);
        this.setRotateAngle(tentacle4c, 0.0F, 0.0F, 0.0F);


        this.cube_r5 = new AdvancedModelRenderer(this);
        this.cube_r5.setRotationPoint(0.0F, 0.0F, -2.5F);
        this.tentacle4c.addChild(cube_r5);
        this.setRotateAngle(cube_r5, 0.0F, 0.0F, 1.5708F);
        this.cube_r5.cubeList.add(new ModelBox(cube_r5, 36, 63, -0.5F, -0.5F, -2.5F, 1, 1, 5, -0.2F, false));

        this.tentacle5a = new AdvancedModelRenderer(this);
        this.tentacle5a.setRotationPoint(0.5F, 0.5F, -6.0F);
        this.mantle.addChild(tentacle5a);
        this.tentacle5a.cubeList.add(new ModelBox(tentacle5a, 24, 63, -0.5F, -0.5F, -5.0F, 1, 1, 5, 0.0F, false));

        this.tentacle5b = new AdvancedModelRenderer(this);
        this.tentacle5b.setRotationPoint(0.0F, 0.0F, -4.5F);
        this.tentacle5a.addChild(tentacle5b);
        this.tentacle5b.cubeList.add(new ModelBox(tentacle5b, 12, 63, -0.5F, -0.5F, -5.0F, 1, 1, 5, -0.1F, false));

        this.tentacle5c = new AdvancedModelRenderer(this);
        this.tentacle5c.setRotationPoint(0.0F, 0.0F, -4.5F);
        this.tentacle5b.addChild(tentacle5c);
        this.tentacle5c.cubeList.add(new ModelBox(tentacle5c, 0, 63, -0.5F, -0.5F, -5.0F, 1, 1, 5, -0.2F, false));

        this.tentacle6a = new AdvancedModelRenderer(this);
        this.tentacle6a.setRotationPoint(-1.5F, 5.5F, -6.0F);
        this.mantle.addChild(tentacle6a);
        this.tentacle6a.cubeList.add(new ModelBox(tentacle6a, 61, 61, -0.5F, -0.5F, -5.0F, 1, 1, 5, 0.0F, false));

        this.tentacle6b = new AdvancedModelRenderer(this);
        this.tentacle6b.setRotationPoint(0.0F, 0.0F, -4.5F);
        this.tentacle6a.addChild(tentacle6b);
        this.tentacle6b.cubeList.add(new ModelBox(tentacle6b, 54, 60, -0.5F, -0.5F, -5.0F, 1, 1, 5, -0.1F, false));

        this.tentacle6c = new AdvancedModelRenderer(this);
        this.tentacle6c.setRotationPoint(0.0F, 0.0F, -4.5F);
        this.tentacle6b.addChild(tentacle6c);
        this.tentacle6c.cubeList.add(new ModelBox(tentacle6c, 59, 54, -0.5F, -0.5F, -5.0F, 1, 1, 5, -0.2F, false));

        this.tentacle7a = new AdvancedModelRenderer(this);
        this.tentacle7a.setRotationPoint(-2.5F, 4.25F, -6.0F);
        this.mantle.addChild(tentacle7a);
        this.tentacle7a.cubeList.add(new ModelBox(tentacle7a, 47, 59, -0.5F, -0.5F, -5.0F, 1, 1, 5, 0.0F, false));

        this.tentacle7b = new AdvancedModelRenderer(this);
        this.tentacle7b.setRotationPoint(0.0F, 0.0F, -4.5F);
        this.tentacle7a.addChild(tentacle7b);
        this.tentacle7b.cubeList.add(new ModelBox(tentacle7b, 58, 0, -0.5F, -0.5F, -5.0F, 1, 1, 5, -0.1F, false));

        this.tentacle7c = new AdvancedModelRenderer(this);
        this.tentacle7c.setRotationPoint(0.0F, 0.0F, -4.5F);
        this.tentacle7b.addChild(tentacle7c);
        this.tentacle7c.cubeList.add(new ModelBox(tentacle7c, 57, 33, -0.5F, -0.5F, -5.0F, 1, 1, 5, -0.2F, false));

        this.tentacle8a = new AdvancedModelRenderer(this);
        this.tentacle8a.setRotationPoint(-2.5F, 3.0F, -6.0F);
        this.mantle.addChild(tentacle8a);
        this.tentacle8a.cubeList.add(new ModelBox(tentacle8a, 52, 53, -0.5F, -0.5F, -5.0F, 1, 1, 5, 0.0F, false));

        this.tentacle8b = new AdvancedModelRenderer(this);
        this.tentacle8b.setRotationPoint(0.0F, 0.0F, -4.5F);
        this.tentacle8a.addChild(tentacle8b);
        this.tentacle8b.cubeList.add(new ModelBox(tentacle8b, 50, 32, -0.5F, -0.5F, -5.0F, 1, 1, 5, -0.1F, false));

        this.tentacle8c = new AdvancedModelRenderer(this);
        this.tentacle8c.setRotationPoint(0.0F, 0.0F, -4.5F);
        this.tentacle8b.addChild(tentacle8c);
        this.tentacle8c.cubeList.add(new ModelBox(tentacle8c, 43, 48, -0.5F, -0.5F, -5.0F, 1, 1, 5, -0.2F, false));

        this.tentacle9a = new AdvancedModelRenderer(this);
        this.tentacle9a.setRotationPoint(-2.5F, 1.75F, -6.0F);
        this.mantle.addChild(tentacle9a);


        this.cube_r6 = new AdvancedModelRenderer(this);
        this.cube_r6.setRotationPoint(0.0F, 0.0F, -2.5F);
        this.tentacle9a.addChild(cube_r6);
        this.setRotateAngle(cube_r6, 0.0F, 0.0F, -1.5708F);
        this.cube_r6.cubeList.add(new ModelBox(cube_r6, 17, 47, -0.5F, -0.5F, -2.5F, 1, 1, 5, 0.0F, false));

        this.tentacle9b = new AdvancedModelRenderer(this);
        this.tentacle9b.setRotationPoint(0.0F, 0.0F, -4.5F);
        this.tentacle9a.addChild(tentacle9b);


        this.cube_r7 = new AdvancedModelRenderer(this);
        this.cube_r7.setRotationPoint(0.0F, 0.0F, -2.5F);
        this.tentacle9b.addChild(cube_r7);
        this.setRotateAngle(cube_r7, 0.0F, 0.0F, -1.5708F);
        this.cube_r7.cubeList.add(new ModelBox(cube_r7, 32, 0, -0.5F, -0.5F, -2.5F, 1, 1, 5, -0.1F, false));

        this.tentacle9c = new AdvancedModelRenderer(this);
        this.tentacle9c.setRotationPoint(0.0F, 0.0F, -4.5F);
        this.tentacle9b.addChild(tentacle9c);
        this.setRotateAngle(tentacle9c, 0.0F, 0.0F, 0.0F);


        this.cube_r8 = new AdvancedModelRenderer(this);
        this.cube_r8.setRotationPoint(0.0F, 0.0F, -2.5F);
        this.tentacle9c.addChild(cube_r8);
        this.setRotateAngle(cube_r8, 0.0F, 0.0F, -1.5708F);
        this.cube_r8.cubeList.add(new ModelBox(cube_r8, 27, 31, -0.5F, -0.5F, -2.5F, 1, 1, 5, -0.2F, false));

        this.tentacle10a = new AdvancedModelRenderer(this);
        this.tentacle10a.setRotationPoint(-1.5F, 0.5F, -6.0F);
        this.mantle.addChild(tentacle10a);
        this.tentacle10a.cubeList.add(new ModelBox(tentacle10a, 20, 30, -0.5F, -0.5F, -5.0F, 1, 1, 5, 0.0F, false));

        this.tentacle10b = new AdvancedModelRenderer(this);
        this.tentacle10b.setRotationPoint(0.0F, 0.0F, -4.5F);
        this.tentacle10a.addChild(tentacle10b);
        this.tentacle10b.cubeList.add(new ModelBox(tentacle10b, 0, 6, -0.5F, -0.5F, -5.0F, 1, 1, 5, -0.1F, false));

        this.tentacle10c = new AdvancedModelRenderer(this);
        this.tentacle10c.setRotationPoint(0.0F, 0.0F, -4.5F);
        this.tentacle10b.addChild(tentacle10c);
        this.tentacle10c.cubeList.add(new ModelBox(tentacle10c, 0, 0, -0.5F, -0.5F, -5.0F, 1, 1, 5, -0.2F, false));

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
        EntityPrehistoricFloraAmmonite_Pachydesmoceras ee = (EntityPrehistoricFloraAmmonite_Pachydesmoceras) entitylivingbaseIn;
        animWalking(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime);



    }

    public void animWalking(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime) {
        EntityPrehistoricFloraAmmonite_Pachydesmoceras entity = (EntityPrehistoricFloraAmmonite_Pachydesmoceras) entitylivingbaseIn;
        int animCycle = 80;
        double tickAnim = (entity.ticksExisted + entity.getTickOffset()) - (int) (Math.floor((double) (entity.ticksExisted + entity.getTickOffset()) / (double) animCycle) * (double) animCycle) + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;
        this.setRotateAngle(shell, shell.rotateAngleX + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180))*5), shell.rotateAngleY + (float) Math.toRadians(0), shell.rotateAngleZ + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*90))*2.5));
        this.shell.rotationPointX = this.shell.rotationPointX + (float)(0);
        this.shell.rotationPointY = this.shell.rotationPointY - (float)(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180-90))*-1);
        this.shell.rotationPointZ = this.shell.rotationPointZ + (float)(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180))*2);


        this.setRotateAngle(mantle, mantle.rotateAngleX + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180+60))*-2.5), mantle.rotateAngleY + (float) Math.toRadians(0), mantle.rotateAngleZ + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*90))*-2.5));
        this.mantle.setScale((float)(1+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360))*0.01),(float)(1+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360))*0.01),(float)(1.1+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180))*-0.01));


        this.setRotateAngle(eyeRight, eyeRight.rotateAngleX + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180+30))*5), eyeRight.rotateAngleY + (float) Math.toRadians(0), eyeRight.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(eyeLeft, eyeLeft.rotateAngleX + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180+30))*5), eyeLeft.rotateAngleY + (float) Math.toRadians(0), eyeLeft.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(siphon, siphon.rotateAngleX + (float) Math.toRadians(-4.5+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180+60))*2.5), siphon.rotateAngleY + (float) Math.toRadians(0), siphon.rotateAngleZ + (float) Math.toRadians(0));
        this.siphon.rotationPointX = this.siphon.rotationPointX + (float)(0);
        this.siphon.rotationPointY = this.siphon.rotationPointY - (float)(0);
        this.siphon.rotationPointZ = this.siphon.rotationPointZ + (float)(0.575);
        this.siphon.setScale((float)(1+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180-30))*0.02),(float)(0.8+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180-30))*0.02),(float)(1+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180-30))*0.1));


        this.setRotateAngle(tentacle1a, tentacle1a.rotateAngleX + (float) Math.toRadians(-20+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360))*-2.5), tentacle1a.rotateAngleY + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360))*1.25), tentacle1a.rotateAngleZ + (float) Math.toRadians(-5));
        this.tentacle1a.setScale((float)1.5,(float)1,(float)(1.05+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360+30))*-0.05));


        this.setRotateAngle(tentacle1b, tentacle1b.rotateAngleX + (float) Math.toRadians(20+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360-60))*-5), tentacle1b.rotateAngleY + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360-60))*1.25), tentacle1b.rotateAngleZ + (float) Math.toRadians(0));
        this.tentacle1b.setScale((float)0.75,(float)1,(float)1);


        this.setRotateAngle(tentacle1c, tentacle1c.rotateAngleX + (float) Math.toRadians(10+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360-120))*-2.5), tentacle1c.rotateAngleY + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360-120))*1.25), tentacle1c.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(tentacle2a, tentacle2a.rotateAngleX + (float) Math.toRadians(-15+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360))*-1.25), tentacle2a.rotateAngleY + (float) Math.toRadians(2.5+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360))*2.5), tentacle2a.rotateAngleZ + (float) Math.toRadians(15));
        this.tentacle2a.setScale((float)1,(float)1.5,(float)(1.05+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360+30))*-0.05));


        this.setRotateAngle(tentacle2b, tentacle2b.rotateAngleX + (float) Math.toRadians(10+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360-60))*-1.25), tentacle2b.rotateAngleY + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360-60))*2.5), tentacle2b.rotateAngleZ + (float) Math.toRadians(0));
        this.tentacle2b.setScale((float)1,(float)0.75,(float)1);


        this.setRotateAngle(tentacle2c, tentacle2c.rotateAngleX + (float) Math.toRadians(10+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360-120))*-1.25), tentacle2c.rotateAngleY + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360-120))*2.5), tentacle2c.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(tentacle3a, tentacle3a.rotateAngleX + (float) Math.toRadians(-15), tentacle3a.rotateAngleY + (float) Math.toRadians(2.5+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360))*2.5), tentacle3a.rotateAngleZ + (float) Math.toRadians(0));
        this.tentacle3a.setScale((float)1,(float)1.5,(float)(1.05+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360+30))*-0.05));


        this.setRotateAngle(tentacle3b, tentacle3b.rotateAngleX + (float) Math.toRadians(10), tentacle3b.rotateAngleY + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360-60))*2.5), tentacle3b.rotateAngleZ + (float) Math.toRadians(0));
        this.tentacle3b.setScale((float)1,(float)0.75,(float)1);


        this.setRotateAngle(tentacle3c, tentacle3c.rotateAngleX + (float) Math.toRadians(10), tentacle3c.rotateAngleY + (float) Math.toRadians(2.5+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360-120))*2.5), tentacle3c.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(tentacle4a, tentacle4a.rotateAngleX + (float) Math.toRadians(-15+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360))*1.25), tentacle4a.rotateAngleY + (float) Math.toRadians(2.5+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360))*2.5), tentacle4a.rotateAngleZ + (float) Math.toRadians(-15));
        this.tentacle4a.rotationPointX = this.tentacle4a.rotationPointX + (float)(-0.5);
        this.tentacle4a.rotationPointY = this.tentacle4a.rotationPointY - (float)(0);
        this.tentacle4a.rotationPointZ = this.tentacle4a.rotationPointZ + (float)(0);
        this.tentacle4a.setScale((float)1,(float)1.5,(float)(1.05+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360+30))*-0.05));


        this.setRotateAngle(tentacle4b, tentacle4b.rotateAngleX + (float) Math.toRadians(10+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360-60))*1.25), tentacle4b.rotateAngleY + (float) Math.toRadians(-2.5+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360-60))*2.5), tentacle4b.rotateAngleZ + (float) Math.toRadians(0));
        this.tentacle4b.setScale((float)1,(float)0.75,(float)1);


        this.setRotateAngle(tentacle4c, tentacle4c.rotateAngleX + (float) Math.toRadians(10+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360-120))*1.25), tentacle4c.rotateAngleY + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360-120))*2.5), tentacle4c.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(tentacle5a, tentacle5a.rotateAngleX + (float) Math.toRadians(-10+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360))*2.5), tentacle5a.rotateAngleY + (float) Math.toRadians(1.25+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360))*1.25), tentacle5a.rotateAngleZ + (float) Math.toRadians(5));
        this.tentacle5a.rotationPointX = this.tentacle5a.rotationPointX + (float)(-0.5);
        this.tentacle5a.rotationPointY = this.tentacle5a.rotationPointY - (float)(0);
        this.tentacle5a.rotationPointZ = this.tentacle5a.rotationPointZ + (float)(0);
        this.tentacle5a.setScale((float)1.5,(float)1,(float)(1.05+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360+30))*-0.05));


        this.setRotateAngle(tentacle5b, tentacle5b.rotateAngleX + (float) Math.toRadians(10+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360-60))*2.5), tentacle5b.rotateAngleY + (float) Math.toRadians(0), tentacle5b.rotateAngleZ + (float) Math.toRadians(0));
        this.tentacle5b.setScale((float)0.75,(float)1,(float)1);


        this.setRotateAngle(tentacle5c, tentacle5c.rotateAngleX + (float) Math.toRadians(10+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360-120))*2.5), tentacle5c.rotateAngleY + (float) Math.toRadians(0), tentacle5c.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(tentacle6a, tentacle6a.rotateAngleX + (float) Math.toRadians(-20+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360))*-2.5), tentacle6a.rotateAngleY + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360))*-1.25), tentacle6a.rotateAngleZ + (float) Math.toRadians(5));
        this.tentacle6a.setScale((float)1.5,(float)1,(float)(1.05+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360+30))*-0.05));


        this.setRotateAngle(tentacle6b, tentacle6b.rotateAngleX + (float) Math.toRadians(20+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360-60))*-5), tentacle6b.rotateAngleY + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360-60))*-1.25), tentacle6b.rotateAngleZ + (float) Math.toRadians(0));
        this.tentacle6b.setScale((float)0.75,(float)1,(float)1);


        this.setRotateAngle(tentacle6c, tentacle6c.rotateAngleX + (float) Math.toRadians(10+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360-120))*-2.5), tentacle6c.rotateAngleY + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360-120))*-1.25), tentacle6c.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(tentacle7a, tentacle7a.rotateAngleX + (float) Math.toRadians(-15+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360))*-1.25), tentacle7a.rotateAngleY + (float) Math.toRadians(-2.5+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360))*-2.5), tentacle7a.rotateAngleZ + (float) Math.toRadians(-15));
        this.tentacle7a.setScale((float)1,(float)1.5,(float)(1.05+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360+30))*-0.05));


        this.setRotateAngle(tentacle7b, tentacle7b.rotateAngleX + (float) Math.toRadians(10+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360-60))*-1.25), tentacle7b.rotateAngleY + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360-60))*-2.5), tentacle7b.rotateAngleZ + (float) Math.toRadians(0));
        this.tentacle7b.setScale((float)1,(float)0.75,(float)1);


        this.setRotateAngle(tentacle7c, tentacle7c.rotateAngleX + (float) Math.toRadians(10+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360-120))*-1.25), tentacle7c.rotateAngleY + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360-120))*-2.5), tentacle7c.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(tentacle8a, tentacle8a.rotateAngleX + (float) Math.toRadians(-15), tentacle8a.rotateAngleY + (float) Math.toRadians(-2.5+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360))*-2.5), tentacle8a.rotateAngleZ + (float) Math.toRadians(0));
        this.tentacle8a.setScale((float)1,(float)1.5,(float)(1.05+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360+30))*-0.05));


        this.setRotateAngle(tentacle8b, tentacle8b.rotateAngleX + (float) Math.toRadians(10), tentacle8b.rotateAngleY + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360-60))*-2.5), tentacle8b.rotateAngleZ + (float) Math.toRadians(0));
        this.tentacle8b.setScale((float)1,(float)0.75,(float)1);


        this.setRotateAngle(tentacle8c, tentacle8c.rotateAngleX + (float) Math.toRadians(10), tentacle8c.rotateAngleY + (float) Math.toRadians(2.5+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360-120))*-2.5), tentacle8c.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(tentacle9a, tentacle9a.rotateAngleX + (float) Math.toRadians(-15+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360))*1.25), tentacle9a.rotateAngleY + (float) Math.toRadians(-2.5+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360))*-2.5), tentacle9a.rotateAngleZ + (float) Math.toRadians(15));
        this.tentacle9a.rotationPointX = this.tentacle9a.rotationPointX + (float)(0.5);
        this.tentacle9a.rotationPointY = this.tentacle9a.rotationPointY - (float)(0);
        this.tentacle9a.rotationPointZ = this.tentacle9a.rotationPointZ + (float)(0);
        this.tentacle9a.setScale((float)1,(float)1.5,(float)(1.05+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360+30))*-0.05));


        this.setRotateAngle(tentacle9b, tentacle9b.rotateAngleX + (float) Math.toRadians(10+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360-60))*1.25), tentacle9b.rotateAngleY + (float) Math.toRadians(2.5+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360-60))*-2.5), tentacle9b.rotateAngleZ + (float) Math.toRadians(0));
        this.tentacle9b.setScale((float)1,(float)0.75,(float)1);


        this.setRotateAngle(tentacle9c, tentacle9c.rotateAngleX + (float) Math.toRadians(10+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360-120))*1.25), tentacle9c.rotateAngleY + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360-120))*-2.5), tentacle9c.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(tentacle10a, tentacle10a.rotateAngleX + (float) Math.toRadians(-10+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360))*2.5), tentacle10a.rotateAngleY + (float) Math.toRadians(-1.25+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360))*-1.25), tentacle10a.rotateAngleZ + (float) Math.toRadians(-5));
        this.tentacle10a.rotationPointX = this.tentacle10a.rotationPointX + (float)(0.5);
        this.tentacle10a.rotationPointY = this.tentacle10a.rotationPointY - (float)(0);
        this.tentacle10a.rotationPointZ = this.tentacle10a.rotationPointZ + (float)(0);
        this.tentacle10a.setScale((float)1.5,(float)1,(float)(1.05+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360+30))*-0.05));


        this.setRotateAngle(tentacle10b, tentacle10b.rotateAngleX + (float) Math.toRadians(10+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360-60))*2.5), tentacle10b.rotateAngleY + (float) Math.toRadians(0), tentacle10b.rotateAngleZ + (float) Math.toRadians(0));
        this.tentacle10b.setScale((float)0.75,(float)1,(float)1);


        this.setRotateAngle(tentacle10c, tentacle10c.rotateAngleX + (float) Math.toRadians(10+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360-120))*2.5), tentacle10c.rotateAngleY + (float) Math.toRadians(0), tentacle10c.rotateAngleZ + (float) Math.toRadians(0));

    }

    @Override
    public void setRotationAngles(float f, float f1, float f2, float f3, float f4, float f5, Entity e) {
        super.setRotationAngles(f, f1, f2, f3, f4, f5, e);
        //this.resetToDefaultPose();

        //this.body.offsetY = 1.50F;

        EntityPrehistoricFloraAmmonite_Pachydesmoceras ee = (EntityPrehistoricFloraAmmonite_Pachydesmoceras) e;

        if (!e.isInWater()) {
            this.root.rotateAngleZ = (float) Math.toRadians(90);
            this.root.offsetY = -0.1F;
            this.root.offsetX = -0.6F;
        }

    }

    public void animate(IAnimatedEntity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        animator.update(entity);
    }
}

