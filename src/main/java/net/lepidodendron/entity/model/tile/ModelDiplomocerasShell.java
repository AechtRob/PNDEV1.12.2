package net.lepidodendron.entity.model.tile;

import net.ilexiconn.llibrary.client.model.tools.AdvancedModelRenderer;
import net.lepidodendron.entity.model.llibraryextensions.AdvancedModelBaseExtended;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;

public class ModelDiplomocerasShell extends AdvancedModelBaseExtended {
    private final AdvancedModelRenderer base;
    private final AdvancedModelRenderer shell;
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
    private final AdvancedModelRenderer cube_r1;
    private final AdvancedModelRenderer shell12;
    private final AdvancedModelRenderer cube_r2;
    private final AdvancedModelRenderer shell13;
    private final AdvancedModelRenderer cube_r3;
    private final AdvancedModelRenderer cube_r4;
    private final AdvancedModelRenderer mantle;
    private final AdvancedModelRenderer leftEye;
    private final AdvancedModelRenderer rightEye;
    private final AdvancedModelRenderer siphon;
    private final AdvancedModelRenderer cube_r5;
    private final AdvancedModelRenderer tentacle1a;
    private final AdvancedModelRenderer tentacle1b;
    private final AdvancedModelRenderer tentacle2a;
    private final AdvancedModelRenderer tentacle2b;
    private final AdvancedModelRenderer tentacle3a;
    private final AdvancedModelRenderer tentacle3b;
    private final AdvancedModelRenderer tentacle4a;
    private final AdvancedModelRenderer tentacle4b;
    private final AdvancedModelRenderer tentacle5a;
    private final AdvancedModelRenderer tentacle5b;
    private final AdvancedModelRenderer tentacle6a;
    private final AdvancedModelRenderer tentacle6b;
    private final AdvancedModelRenderer tentacle7a;
    private final AdvancedModelRenderer tentacle7b;
    private final AdvancedModelRenderer tentacle8a;
    private final AdvancedModelRenderer tentacle8b;
    private final AdvancedModelRenderer tentacle9a;
    private final AdvancedModelRenderer tentacle9b;
    private final AdvancedModelRenderer tentacle10a;
    private final AdvancedModelRenderer tentacle10b;

    public ModelDiplomocerasShell() {
        this.textureWidth = 128;
        this.textureHeight = 128;

        this.base = new AdvancedModelRenderer(this);
        this.base.setRotationPoint(0.0F, 24.0F, -15.0F);


        this.shell = new AdvancedModelRenderer(this);
        this.shell.setRotationPoint(0.0F, -2.0F, 40.0F);
        this.base.addChild(shell);
        this.setRotateAngle(shell, -0.0436F, 0.0F, 0.0F);
        this.shell.cubeList.add(new ModelBox(shell, 0, 38, -2.0F, -4.0F, -19.0F, 4, 4, 19, 0.0F, false));

        this.shell2 = new AdvancedModelRenderer(this);
        this.shell2.setRotationPoint(0.0F, -0.75F, -18.0F);
        this.shell.addChild(shell2);
        this.setRotateAngle(shell2, 0.0873F, 0.0F, 0.0F);
        this.shell2.cubeList.add(new ModelBox(shell2, 0, 0, -1.5F, -3.0F, -34.0F, 3, 3, 34, 0.0F, false));

        this.shell3 = new AdvancedModelRenderer(this);
        this.shell3.setRotationPoint(0.0F, -3.0F, -34.0F);
        this.shell2.addChild(shell3);
        this.setRotateAngle(shell3, 0.1309F, 0.0F, 0.0F);
        this.shell3.cubeList.add(new ModelBox(shell3, 0, 62, -1.5F, 0.0F, -10.0F, 3, 3, 10, -0.01F, false));

        this.shell4 = new AdvancedModelRenderer(this);
        this.shell4.setRotationPoint(0.0F, 3.0F, -10.0F);
        this.shell3.addChild(shell4);
        this.setRotateAngle(shell4, -0.6981F, 0.0F, 0.0F);
        this.shell4.cubeList.add(new ModelBox(shell4, 75, 33, -1.0F, -2.0F, -2.0F, 2, 2, 2, 0.04F, false));

        this.shell5 = new AdvancedModelRenderer(this);
        this.shell5.setRotationPoint(0.0F, 0.0F, -2.0F);
        this.shell4.addChild(shell5);
        this.setRotateAngle(shell5, -0.5236F, 0.0F, 0.0F);
        this.shell5.cubeList.add(new ModelBox(shell5, 86, 67, -1.0F, -2.0F, -3.0F, 2, 2, 3, 0.02F, false));

        this.shell6 = new AdvancedModelRenderer(this);
        this.shell6.setRotationPoint(0.0F, 0.0F, -3.0F);
        this.shell5.addChild(shell6);
        this.setRotateAngle(shell6, -0.6981F, 0.0F, 0.0F);
        this.shell6.cubeList.add(new ModelBox(shell6, 84, 33, -1.0F, -2.0F, -2.0F, 2, 2, 2, 0.01F, false));

        this.shell7 = new AdvancedModelRenderer(this);
        this.shell7.setRotationPoint(0.0F, 0.0F, -2.0F);
        this.shell6.addChild(shell7);
        this.setRotateAngle(shell7, -0.7854F, 0.0F, 0.0F);
        this.shell7.cubeList.add(new ModelBox(shell7, 86, 73, -1.0F, -2.0F, -3.0F, 2, 2, 3, 0.0F, false));

        this.shell8 = new AdvancedModelRenderer(this);
        this.shell8.setRotationPoint(0.0F, 0.0F, -3.0F);
        this.shell7.addChild(shell8);
        this.setRotateAngle(shell8, -0.48F, 0.0F, 0.0F);
        this.shell8.cubeList.add(new ModelBox(shell8, 47, 38, -1.0F, -2.0F, -19.0F, 2, 2, 19, -0.01F, false));

        this.shell9 = new AdvancedModelRenderer(this);
        this.shell9.setRotationPoint(0.0F, 0.0F, -19.0F);
        this.shell8.addChild(shell9);
        this.setRotateAngle(shell9, -0.1091F, 0.0F, 0.0F);
        this.shell9.cubeList.add(new ModelBox(shell9, 75, 0, -1.0F, -2.0F, -11.0F, 2, 2, 11, -0.02F, false));

        this.shell10 = new AdvancedModelRenderer(this);
        this.shell10.setRotationPoint(0.0F, -2.0F, -10.975F);
        this.shell9.addChild(shell10);
        this.setRotateAngle(shell10, 0.0873F, 0.0F, 0.0F);
        this.shell10.cubeList.add(new ModelBox(shell10, 27, 74, -1.0F, 0.0F, -7.0F, 2, 2, 7, -0.04F, false));

        this.shell11 = new AdvancedModelRenderer(this);
        this.shell11.setRotationPoint(0.0F, 2.0F, -7.0F);
        this.shell10.addChild(shell11);
        this.setRotateAngle(shell11, -1.0036F, 0.0F, 0.0F);


        this.cube_r1 = new AdvancedModelRenderer(this);
        this.cube_r1.setRotationPoint(0.0F, 0.0F, -1.0F);
        this.shell11.addChild(cube_r1);
        this.setRotateAngle(cube_r1, -0.0436F, 0.0F, 0.0F);
        this.cube_r1.cubeList.add(new ModelBox(cube_r1, 39, 87, -0.5F, -1.0F, -2.0F, 1, 1, 3, 0.0F, false));

        this.shell12 = new AdvancedModelRenderer(this);
        this.shell12.setRotationPoint(0.0F, -0.125F, -2.95F);
        this.shell11.addChild(shell12);
        this.setRotateAngle(shell12, -1.1781F, 0.0F, 0.0F);


        this.cube_r2 = new AdvancedModelRenderer(this);
        this.cube_r2.setRotationPoint(0.0F, 0.0F, -1.0F);
        this.shell12.addChild(cube_r2);
        this.setRotateAngle(cube_r2, -0.0436F, 0.0F, 0.0F);
        this.cube_r2.cubeList.add(new ModelBox(cube_r2, 55, 87, -0.5F, -1.0F, -1.0F, 1, 1, 2, -0.01F, false));

        this.shell13 = new AdvancedModelRenderer(this);
        this.shell13.setRotationPoint(0.0F, -0.075F, -2.0F);
        this.shell12.addChild(shell13);
        this.setRotateAngle(shell13, -0.9468F, 0.0F, 0.0F);


        this.cube_r3 = new AdvancedModelRenderer(this);
        this.cube_r3.setRotationPoint(0.0F, -0.55F, -11.05F);
        this.shell13.addChild(cube_r3);
        this.setRotateAngle(cube_r3, -0.096F, 0.0F, 0.0F);
        this.cube_r3.cubeList.add(new ModelBox(cube_r3, 27, 62, 0.0F, -2.0F, -8.0F, 0, 2, 9, 0.0F, false));

        this.cube_r4 = new AdvancedModelRenderer(this);
        this.cube_r4.setRotationPoint(0.0F, 0.0F, -1.0F);
        this.shell13.addChild(cube_r4);
        this.setRotateAngle(cube_r4, -0.0436F, 0.0F, 0.0F);
        this.cube_r4.cubeList.add(new ModelBox(cube_r4, 47, 60, -0.5F, -1.0F, -17.0F, 1, 1, 18, -0.02F, false));

        this.mantle = new AdvancedModelRenderer(this);
        this.mantle.setRotationPoint(0.0F, -2.25F, -0.25F);
        this.shell.addChild(mantle);
        this.setRotateAngle(mantle, -0.1134F, 0.0F, 0.0F);
        this.mantle.cubeList.add(new ModelBox(mantle, 75, 14, -1.5F, -1.5F, 0.0F, 3, 3, 6, 0.0F, false));

        this.leftEye = new AdvancedModelRenderer(this);
        this.leftEye.setRotationPoint(1.5375F, 0.0F, 1.5F);
        this.mantle.addChild(leftEye);
        this.setRotateAngle(leftEye, 0.2182F, 0.0F, 0.0F);
        this.leftEye.cubeList.add(new ModelBox(leftEye, 48, 87, -0.5375F, -1.0F, -1.0F, 1, 2, 2, 0.0F, false));
        this.leftEye.cubeList.add(new ModelBox(leftEye, 39, 84, -0.4625F, -0.5F, -0.5F, 1, 1, 1, 0.0F, false));

        this.rightEye = new AdvancedModelRenderer(this);
        this.rightEye.setRotationPoint(-1.5375F, 0.0F, 1.5F);
        this.mantle.addChild(rightEye);
        this.setRotateAngle(rightEye, 0.2182F, 0.0F, 0.0F);
        this.rightEye.cubeList.add(new ModelBox(rightEye, 48, 87, -0.4625F, -1.0F, -1.0F, 1, 2, 2, 0.0F, true));
        this.rightEye.cubeList.add(new ModelBox(rightEye, 39, 84, -0.5375F, -0.5F, -0.5F, 1, 1, 1, 0.0F, true));

        this.siphon = new AdvancedModelRenderer(this);
        this.siphon.setRotationPoint(0.5F, 1.5F, 0.0F);
        this.mantle.addChild(siphon);
        this.setRotateAngle(siphon, 0.0611F, 0.0F, 0.0F);


        this.cube_r5 = new AdvancedModelRenderer(this);
        this.cube_r5.setRotationPoint(0.0F, -2.5F, 0.0F);
        this.siphon.addChild(cube_r5);
        this.setRotateAngle(cube_r5, -0.1134F, 0.0F, 0.0F);
        this.cube_r5.cubeList.add(new ModelBox(cube_r5, 75, 24, -1.5F, 2.0F, 0.0F, 2, 1, 7, 0.0F, false));

        this.tentacle1a = new AdvancedModelRenderer(this);
        this.tentacle1a.setRotationPoint(-0.5F, 1.0F, 5.5F);
        this.mantle.addChild(tentacle1a);
        this.setRotateAngle(tentacle1a, -0.0873F, -0.0217F, 0.0019F);
        this.tentacle1a.cubeList.add(new ModelBox(tentacle1a, 0, 76, -0.5F, -0.5F, 0.0F, 1, 1, 5, 0.0F, false));

        this.tentacle1b = new AdvancedModelRenderer(this);
        this.tentacle1b.setRotationPoint(0.0F, 0.0F, 4.5F);
        this.tentacle1a.addChild(tentacle1b);
        this.setRotateAngle(tentacle1b, -0.3056F, 0.0333F, -0.0105F);
        this.tentacle1b.cubeList.add(new ModelBox(tentacle1b, 13, 76, -0.5F, -0.5F, 0.0F, 1, 1, 5, 0.0F, false));

        this.tentacle2a = new AdvancedModelRenderer(this);
        this.tentacle2a.setRotationPoint(-1.25F, 0.75F, 5.5F);
        this.mantle.addChild(tentacle2a);
        this.setRotateAngle(tentacle2a, -0.1058F, -0.1432F, -0.7702F);
        this.tentacle2a.cubeList.add(new ModelBox(tentacle2a, 46, 80, -0.5F, -0.5F, 0.0F, 1, 1, 5, 0.0F, false));

        this.tentacle2b = new AdvancedModelRenderer(this);
        this.tentacle2b.setRotationPoint(0.0F, 0.0F, 4.5F);
        this.tentacle2a.addChild(tentacle2b);
        this.setRotateAngle(tentacle2b, -0.144F, -0.2836F, 0.0F);
        this.tentacle2b.cubeList.add(new ModelBox(tentacle2b, 59, 80, -0.5F, -0.5F, 0.0F, 1, 1, 5, 0.0F, false));

        this.tentacle3a = new AdvancedModelRenderer(this);
        this.tentacle3a.setRotationPoint(-1.5F, 0.0F, 5.5F);
        this.mantle.addChild(tentacle3a);
        this.setRotateAngle(tentacle3a, -0.1614F, -0.1396F, 0.0F);
        this.tentacle3a.cubeList.add(new ModelBox(tentacle3a, 72, 80, -0.5F, -0.5F, 0.0F, 1, 1, 5, 0.0F, false));

        this.tentacle3b = new AdvancedModelRenderer(this);
        this.tentacle3b.setRotationPoint(0.0F, 0.0F, 4.5F);
        this.tentacle3a.addChild(tentacle3b);
        this.setRotateAngle(tentacle3b, -0.2705F, -0.192F, 0.0F);
        this.tentacle3b.cubeList.add(new ModelBox(tentacle3b, 0, 83, -0.5F, -0.5F, 0.0F, 1, 1, 5, 0.0F, false));

        this.tentacle4a = new AdvancedModelRenderer(this);
        this.tentacle4a.setRotationPoint(-1.25F, -0.75F, 5.5F);
        this.mantle.addChild(tentacle4a);
        this.setRotateAngle(tentacle4a, 0.0349F, -0.1745F, -0.7854F);
        this.tentacle4a.cubeList.add(new ModelBox(tentacle4a, 13, 83, -0.5F, -0.5F, 0.0F, 1, 1, 5, 0.0F, false));

        this.tentacle4b = new AdvancedModelRenderer(this);
        this.tentacle4b.setRotationPoint(0.0F, 0.0F, 4.5F);
        this.tentacle4a.addChild(tentacle4b);
        this.setRotateAngle(tentacle4b, -0.1265F, -0.2531F, 0.0F);
        this.tentacle4b.cubeList.add(new ModelBox(tentacle4b, 26, 84, -0.5F, -0.5F, 0.0F, 1, 1, 5, 0.0F, false));

        this.tentacle5a = new AdvancedModelRenderer(this);
        this.tentacle5a.setRotationPoint(-0.5F, -1.0F, 5.5F);
        this.mantle.addChild(tentacle5a);
        this.setRotateAngle(tentacle5a, -0.1178F, -0.0218F, 0.0F);
        this.tentacle5a.cubeList.add(new ModelBox(tentacle5a, 85, 80, -0.5F, -0.5F, 0.0F, 1, 1, 5, 0.0F, false));

        this.tentacle5b = new AdvancedModelRenderer(this);
        this.tentacle5b.setRotationPoint(0.0F, 0.0F, 4.5F);
        this.tentacle5a.addChild(tentacle5b);
        this.setRotateAngle(tentacle5b, -0.2799F, -0.0671F, 0.0193F);
        this.tentacle5b.cubeList.add(new ModelBox(tentacle5b, 86, 60, -0.5F, -0.5F, 0.0F, 1, 1, 5, 0.0F, false));

        this.tentacle6a = new AdvancedModelRenderer(this);
        this.tentacle6a.setRotationPoint(0.5F, 1.0F, 5.5F);
        this.mantle.addChild(tentacle6a);
        this.setRotateAngle(tentacle6a, -0.0873F, 0.0217F, -0.0019F);
        this.tentacle6a.cubeList.add(new ModelBox(tentacle6a, 0, 76, -0.5F, -0.5F, 0.0F, 1, 1, 5, 0.0F, true));

        this.tentacle6b = new AdvancedModelRenderer(this);
        this.tentacle6b.setRotationPoint(0.0F, 0.0F, 4.5F);
        this.tentacle6a.addChild(tentacle6b);
        this.setRotateAngle(tentacle6b, -0.3056F, -0.0333F, 0.0105F);
        this.tentacle6b.cubeList.add(new ModelBox(tentacle6b, 13, 76, -0.5F, -0.5F, 0.0F, 1, 1, 5, 0.0F, true));

        this.tentacle7a = new AdvancedModelRenderer(this);
        this.tentacle7a.setRotationPoint(1.25F, 0.75F, 5.5F);
        this.mantle.addChild(tentacle7a);
        this.setRotateAngle(tentacle7a, -0.1058F, 0.1432F, 0.7702F);
        this.tentacle7a.cubeList.add(new ModelBox(tentacle7a, 46, 80, -0.5F, -0.5F, 0.0F, 1, 1, 5, 0.0F, true));

        this.tentacle7b = new AdvancedModelRenderer(this);
        this.tentacle7b.setRotationPoint(0.0F, 0.0F, 4.5F);
        this.tentacle7a.addChild(tentacle7b);
        this.setRotateAngle(tentacle7b, -0.144F, 0.2836F, 0.0F);
        this.tentacle7b.cubeList.add(new ModelBox(tentacle7b, 59, 80, -0.5F, -0.5F, 0.0F, 1, 1, 5, 0.0F, true));

        this.tentacle8a = new AdvancedModelRenderer(this);
        this.tentacle8a.setRotationPoint(1.5F, 0.0F, 5.5F);
        this.mantle.addChild(tentacle8a);
        this.setRotateAngle(tentacle8a, -0.1614F, 0.1396F, 0.0F);
        this.tentacle8a.cubeList.add(new ModelBox(tentacle8a, 72, 80, -0.5F, -0.5F, 0.0F, 1, 1, 5, 0.0F, true));

        this.tentacle8b = new AdvancedModelRenderer(this);
        this.tentacle8b.setRotationPoint(0.0F, 0.0F, 4.5F);
        this.tentacle8a.addChild(tentacle8b);
        this.setRotateAngle(tentacle8b, -0.2705F, 0.192F, 0.0F);
        this.tentacle8b.cubeList.add(new ModelBox(tentacle8b, 0, 83, -0.5F, -0.5F, 0.0F, 1, 1, 5, 0.0F, true));

        this.tentacle9a = new AdvancedModelRenderer(this);
        this.tentacle9a.setRotationPoint(1.25F, -0.75F, 5.5F);
        this.mantle.addChild(tentacle9a);
        this.setRotateAngle(tentacle9a, 0.0349F, 0.1745F, 0.7854F);
        this.tentacle9a.cubeList.add(new ModelBox(tentacle9a, 13, 83, -0.5F, -0.5F, 0.0F, 1, 1, 5, 0.0F, true));

        this.tentacle9b = new AdvancedModelRenderer(this);
        this.tentacle9b.setRotationPoint(0.0F, 0.0F, 4.5F);
        this.tentacle9a.addChild(tentacle9b);
        this.setRotateAngle(tentacle9b, -0.1265F, 0.2531F, 0.0F);
        this.tentacle9b.cubeList.add(new ModelBox(tentacle9b, 26, 84, -0.5F, -0.5F, 0.0F, 1, 1, 5, 0.0F, true));

        this.tentacle10a = new AdvancedModelRenderer(this);
        this.tentacle10a.setRotationPoint(0.5F, -1.0F, 5.5F);
        this.mantle.addChild(tentacle10a);
        this.setRotateAngle(tentacle10a, -0.1178F, 0.0218F, 0.0F);
        this.tentacle10a.cubeList.add(new ModelBox(tentacle10a, 85, 80, -0.5F, -0.5F, 0.0F, 1, 1, 5, 0.0F, true));

        this.tentacle10b = new AdvancedModelRenderer(this);
        this.tentacle10b.setRotationPoint(0.0F, 0.0F, 4.5F);
        this.tentacle10a.addChild(tentacle10b);
        this.setRotateAngle(tentacle10b, -0.2799F, 0.0671F, -0.0193F);
        this.tentacle10b.cubeList.add(new ModelBox(tentacle10b, 86, 60, -0.5F, -0.5F, 0.0F, 1, 1, 5, 0.0F, true));
        updateDefaultPose();
    }

    public void renderAll(float f) {
        this.resetToDefaultPose();
        this.base.offsetY = -1.85F;
        //this.Root.offsetZ = 1.0F;
        this.base.offsetX = 0.5F;
        this.base.rotateAngleZ = (float) Math.toRadians(270);
        this.base.render(0.08f);
    }

    public void setRotateAngle(ModelRenderer modelRenderer, float x, float y, float z) {
        modelRenderer.rotateAngleX = x;
        modelRenderer.rotateAngleY = y;
        modelRenderer.rotateAngleZ = z;
    }

}
