package net.lepidodendron.entity.model.tile;

import net.ilexiconn.llibrary.client.model.tools.AdvancedModelRenderer;
import net.lepidodendron.entity.model.llibraryextensions.AdvancedModelBaseExtended;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;

public class ModelPachydesmocerasShell extends AdvancedModelBaseExtended {
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

    public ModelPachydesmocerasShell() {
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
    }

    public void renderAll(float f) {
        this.resetToDefaultPose();
        this.root.offsetY = -1.15F;
        this.root.render(0.08f);
    }

    public void setRotateAngle(ModelRenderer modelRenderer, float x, float y, float z) {
        modelRenderer.rotateAngleX = x;
        modelRenderer.rotateAngleY = y;
        modelRenderer.rotateAngleZ = z;
    }

}
