package net.lepidodendron.entity.model.tile;

import net.ilexiconn.llibrary.client.model.tools.AdvancedModelRenderer;
import net.lepidodendron.entity.model.llibraryextensions.AdvancedModelBaseExtended;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;

public class ModelAraxocerasShell extends AdvancedModelBaseExtended {
    private final AdvancedModelRenderer base;
    private final AdvancedModelRenderer shell;
    private final AdvancedModelRenderer leftEdge;
    private final AdvancedModelRenderer rightEdge;
    private final AdvancedModelRenderer shell2;
    private final AdvancedModelRenderer shell3;
    private final AdvancedModelRenderer shell4;
    private final AdvancedModelRenderer shell5;
    private final AdvancedModelRenderer cube_r1;
    private final AdvancedModelRenderer shell6;
    private final AdvancedModelRenderer cube_r2;
    private final AdvancedModelRenderer shell7;
    private final AdvancedModelRenderer cube_r3;
    private final AdvancedModelRenderer shell8;
    private final AdvancedModelRenderer cube_r4;
    private final AdvancedModelRenderer shell9;
    private final AdvancedModelRenderer leftEye;
    private final AdvancedModelRenderer rightEye;
    private final AdvancedModelRenderer mantle;
    private final AdvancedModelRenderer siphon;
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

    public ModelAraxocerasShell() {
        this.textureWidth = 88;
        this.textureHeight = 88;

        this.base = new AdvancedModelRenderer(this);
        this.base.setRotationPoint(0.0F, 24.0F, 0.0F);


        this.shell = new AdvancedModelRenderer(this);
        this.shell.setRotationPoint(0.0F, -10.0F, -0.75F);
        this.base.addChild(shell);
        this.setRotateAngle(shell, 0.3054F, 0.0F, 0.0F);
        this.shell.cubeList.add(new ModelBox(shell, 23, 39, -3.0F, 1.4727F, -3.0547F, 6, 8, 4, 0.0F, false));
        this.shell.cubeList.add(new ModelBox(shell, 0, 51, -1.0F, -1.5273F, -2.0547F, 2, 3, 4, 0.0F, false));

        this.leftEdge = new AdvancedModelRenderer(this);
        this.leftEdge.setRotationPoint(6.0F, 11.4727F, -0.0547F);
        this.shell.addChild(leftEdge);
        this.leftEdge.cubeList.add(new ModelBox(leftEdge, 48, 13, -3.0F, -10.0F, -2.0F, 4, 2, 3, 0.0F, false));
        this.leftEdge.cubeList.add(new ModelBox(leftEdge, 63, 13, -3.0F, -8.0F, -1.0F, 1, 1, 2, 0.0F, false));

        this.rightEdge = new AdvancedModelRenderer(this);
        this.rightEdge.setRotationPoint(-6.0F, 11.4727F, -0.0547F);
        this.shell.addChild(rightEdge);
        this.rightEdge.cubeList.add(new ModelBox(rightEdge, 48, 13, -1.0F, -10.0F, -2.0F, 4, 2, 3, 0.0F, true));
        this.rightEdge.cubeList.add(new ModelBox(rightEdge, 63, 13, 2.0F, -8.0F, -1.0F, 1, 1, 2, 0.0F, true));

        this.shell2 = new AdvancedModelRenderer(this);
        this.shell2.setRotationPoint(0.0F, 9.4727F, -3.0547F);
        this.shell.addChild(shell2);
        this.setRotateAngle(shell2, -0.6109F, 0.0F, 0.0F);
        this.shell2.cubeList.add(new ModelBox(shell2, 0, 40, -3.0F, -6.0F, -4.0F, 6, 6, 4, -0.01F, false));

        this.shell3 = new AdvancedModelRenderer(this);
        this.shell3.setRotationPoint(0.0F, 0.0F, -4.0F);
        this.shell2.addChild(shell3);
        this.setRotateAngle(shell3, -0.6109F, 0.0F, 0.0F);
        this.shell3.cubeList.add(new ModelBox(shell3, 0, 7, -3.0F, -7.0F, -6.0F, 6, 7, 6, -0.02F, false));
        this.shell3.cubeList.add(new ModelBox(shell3, 0, 0, -6.0F, -7.2861F, -6.0195F, 12, 2, 4, 0.0F, false));

        this.shell4 = new AdvancedModelRenderer(this);
        this.shell4.setRotationPoint(0.0F, 0.0F, -6.0F);
        this.shell3.addChild(shell4);
        this.setRotateAngle(shell4, -0.6109F, 0.0F, 0.0F);
        this.shell4.cubeList.add(new ModelBox(shell4, 25, 7, -2.5F, -6.0F, -6.0F, 5, 6, 6, 0.0F, false));

        this.shell5 = new AdvancedModelRenderer(this);
        this.shell5.setRotationPoint(0.0F, 0.0F, -6.0F);
        this.shell4.addChild(shell5);
        this.setRotateAngle(shell5, -0.7418F, 0.0F, 0.0F);
        this.shell5.cubeList.add(new ModelBox(shell5, 0, 27, -2.5F, -6.0F, -6.0F, 5, 6, 6, -0.01F, false));

        this.cube_r1 = new AdvancedModelRenderer(this);
        this.cube_r1.setRotationPoint(3.5F, -5.5F, -2.3F);
        this.shell5.addChild(cube_r1);
        this.setRotateAngle(cube_r1, 0.1178F, 0.0F, 0.0F);
        this.cube_r1.cubeList.add(new ModelBox(cube_r1, 0, 21, -9.0F, -0.5F, -2.5F, 11, 1, 4, 0.0F, false));

        this.shell6 = new AdvancedModelRenderer(this);
        this.shell6.setRotationPoint(0.0F, 0.0F, -6.0F);
        this.shell5.addChild(shell6);
        this.setRotateAngle(shell6, -0.9599F, 0.0F, 0.0F);
        this.shell6.cubeList.add(new ModelBox(shell6, 23, 27, -2.5F, -5.0F, -6.0F, 5, 5, 6, -0.02F, false));

        this.cube_r2 = new AdvancedModelRenderer(this);
        this.cube_r2.setRotationPoint(3.5F, -4.5F, -4.5F);
        this.shell6.addChild(cube_r2);
        this.setRotateAngle(cube_r2, -0.1789F, 0.0F, 0.0F);
        this.cube_r2.cubeList.add(new ModelBox(cube_r2, 31, 20, -8.0F, -0.5F, -1.5F, 9, 1, 3, 0.0F, false));

        this.shell7 = new AdvancedModelRenderer(this);
        this.shell7.setRotationPoint(0.0F, 0.0F, -6.0F);
        this.shell6.addChild(shell7);
        this.setRotateAngle(shell7, -0.829F, 0.0F, 0.0F);
        this.shell7.cubeList.add(new ModelBox(shell7, 44, 39, -2.0F, -4.0F, -5.0F, 4, 4, 5, 0.0F, false));

        this.cube_r3 = new AdvancedModelRenderer(this);
        this.cube_r3.setRotationPoint(3.0F, -3.5256F, -4.079F);
        this.shell7.addChild(cube_r3);
        this.setRotateAngle(cube_r3, -0.1963F, 0.0F, 0.0F);
        this.cube_r3.cubeList.add(new ModelBox(cube_r3, 48, 9, -7.0F, -0.5F, -1.0F, 8, 1, 2, 0.0F, false));

        this.shell8 = new AdvancedModelRenderer(this);
        this.shell8.setRotationPoint(0.0F, 0.0F, -5.0F);
        this.shell7.addChild(shell8);
        this.setRotateAngle(shell8, -0.829F, 0.0F, 0.0F);
        this.shell8.cubeList.add(new ModelBox(shell8, 46, 25, -2.0F, -3.0F, -5.0F, 4, 3, 5, -0.01F, false));

        this.cube_r4 = new AdvancedModelRenderer(this);
        this.cube_r4.setRotationPoint(3.0F, -2.9046F, -3.2278F);
        this.shell8.addChild(cube_r4);
        this.setRotateAngle(cube_r4, -0.384F, 0.0F, 0.0F);
        this.cube_r4.cubeList.add(new ModelBox(cube_r4, 46, 34, -7.0F, -0.5F, -2.0F, 8, 1, 3, -0.01F, false));

        this.shell9 = new AdvancedModelRenderer(this);
        this.shell9.setRotationPoint(0.0F, 0.0F, -5.0F);
        this.shell8.addChild(shell9);
        this.setRotateAngle(shell9, -0.829F, 0.0F, 0.0F);
        this.shell9.cubeList.add(new ModelBox(shell9, 48, 0, -2.0F, -3.0F, -5.0F, 4, 3, 5, -0.02F, false));

        this.leftEye = new AdvancedModelRenderer(this);
        this.leftEye.setRotationPoint(2.5F, 3.2227F, 0.4453F);
        this.shell.addChild(leftEye);
        this.setRotateAngle(leftEye, 0.3588F, 1.0847F, 0.1183F);
        this.leftEye.cubeList.add(new ModelBox(leftEye, 44, 49, -0.5F, -0.5F, 0.0F, 1, 1, 6, 0.0F, false));

        this.rightEye = new AdvancedModelRenderer(this);
        this.rightEye.setRotationPoint(-2.5F, 3.2227F, 0.4453F);
        this.shell.addChild(rightEye);
        this.setRotateAngle(rightEye, 0.3588F, -1.0847F, -0.1183F);
        this.rightEye.cubeList.add(new ModelBox(rightEye, 44, 49, -0.5F, -0.5F, 0.0F, 1, 1, 6, 0.0F, true));

        this.mantle = new AdvancedModelRenderer(this);
        this.mantle.setRotationPoint(0.0F, 5.6727F, 0.9453F);
        this.shell.addChild(mantle);
        this.setRotateAngle(mantle, -0.2618F, 0.0F, 0.0F);
        this.mantle.cubeList.add(new ModelBox(mantle, 33, 0, -2.0F, -1.0F, -1.0F, 4, 3, 3, 0.0F, false));

        this.siphon = new AdvancedModelRenderer(this);
        this.siphon.setRotationPoint(0.0F, 2.1712F, 0.8195F);
        this.mantle.addChild(siphon);
        this.setRotateAngle(siphon, -0.447F, 0.0F, 0.0F);
        this.siphon.cubeList.add(new ModelBox(siphon, 35, 52, -0.5F, -0.47F, -0.6802F, 1, 1, 3, 0.0F, false));

        this.tentacle1a = new AdvancedModelRenderer(this);
        this.tentacle1a.setRotationPoint(-0.5F, 1.5F, 1.5F);
        this.mantle.addChild(tentacle1a);
        this.setRotateAngle(tentacle1a, -0.2227F, -0.034F, 0.0077F);
        this.tentacle1a.cubeList.add(new ModelBox(tentacle1a, 13, 52, -0.5F, -0.5F, 0.0F, 1, 1, 4, 0.0F, false));

        this.tentacle1b = new AdvancedModelRenderer(this);
        this.tentacle1b.setRotationPoint(0.0F, 0.0F, 3.5F);
        this.tentacle1a.addChild(tentacle1b);
        this.setRotateAngle(tentacle1b, -0.2403F, -0.0509F, 0.0125F);
        this.tentacle1b.cubeList.add(new ModelBox(tentacle1b, 24, 52, -0.5F, -0.5F, 0.0F, 1, 1, 4, 0.0F, false));

        this.tentacle2a = new AdvancedModelRenderer(this);
        this.tentacle2a.setRotationPoint(-1.5F, 1.5F, 1.5F);
        this.mantle.addChild(tentacle2a);
        this.setRotateAngle(tentacle2a, 0.0F, -0.1833F, -0.7854F);
        this.tentacle2a.cubeList.add(new ModelBox(tentacle2a, 56, 19, -0.5F, -0.5F, 0.0F, 1, 1, 4, 0.0F, false));

        this.tentacle2b = new AdvancedModelRenderer(this);
        this.tentacle2b.setRotationPoint(0.0F, 0.0F, 3.5F);
        this.tentacle2a.addChild(tentacle2b);
        this.setRotateAngle(tentacle2b, 0.048F, -0.1658F, 0.0F);
        this.tentacle2b.cubeList.add(new ModelBox(tentacle2b, 35, 57, -0.5F, -0.5F, 0.0F, 1, 1, 4, 0.0F, false));

        this.tentacle3a = new AdvancedModelRenderer(this);
        this.tentacle3a.setRotationPoint(-1.5F, 0.5F, 1.5F);
        this.mantle.addChild(tentacle3a);
        this.setRotateAngle(tentacle3a, 0.0F, -0.2094F, 0.0F);
        this.tentacle3a.cubeList.add(new ModelBox(tentacle3a, 46, 57, -0.5F, -0.5F, 0.0F, 1, 1, 4, 0.0F, false));

        this.tentacle3b = new AdvancedModelRenderer(this);
        this.tentacle3b.setRotationPoint(0.0F, 0.0F, 3.5F);
        this.tentacle3a.addChild(tentacle3b);
        this.setRotateAngle(tentacle3b, 0.0135F, -0.2574F, -0.0034F);
        this.tentacle3b.cubeList.add(new ModelBox(tentacle3b, 57, 57, -0.5F, -0.5F, 0.0F, 1, 1, 4, 0.0F, false));

        this.tentacle4a = new AdvancedModelRenderer(this);
        this.tentacle4a.setRotationPoint(-1.5F, -0.5F, 1.5F);
        this.mantle.addChild(tentacle4a);
        this.setRotateAngle(tentacle4a, 0.0873F, 0.0F, -0.7854F);
        this.tentacle4a.cubeList.add(new ModelBox(tentacle4a, 13, 58, -0.5F, -0.5F, 0.0F, 1, 1, 4, 0.0F, false));

        this.tentacle4b = new AdvancedModelRenderer(this);
        this.tentacle4b.setRotationPoint(0.0F, 0.0F, 3.5F);
        this.tentacle4a.addChild(tentacle4b);
        this.setRotateAngle(tentacle4b, 0.371F, 0.0244F, 0.0095F);
        this.tentacle4b.cubeList.add(new ModelBox(tentacle4b, 24, 58, -0.5F, -0.5F, 0.0F, 1, 1, 4, 0.0F, false));

        this.tentacle5a = new AdvancedModelRenderer(this);
        this.tentacle5a.setRotationPoint(-0.5F, -0.5F, 1.5F);
        this.mantle.addChild(tentacle5a);
        this.setRotateAngle(tentacle5a, 0.2182F, -0.0128F, -0.0028F);
        this.tentacle5a.cubeList.add(new ModelBox(tentacle5a, 0, 59, -0.5F, -0.5F, 0.0F, 1, 1, 4, 0.0F, false));

        this.tentacle5b = new AdvancedModelRenderer(this);
        this.tentacle5b.setRotationPoint(0.0F, 0.0F, 3.5F);
        this.tentacle5a.addChild(tentacle5b);
        this.setRotateAngle(tentacle5b, 0.2226F, -0.0213F, -0.0048F);
        this.tentacle5b.cubeList.add(new ModelBox(tentacle5b, 59, 49, -0.5F, -0.5F, 0.0F, 1, 1, 4, 0.0F, false));

        this.tentacle6a = new AdvancedModelRenderer(this);
        this.tentacle6a.setRotationPoint(0.5F, 1.5F, 1.5F);
        this.mantle.addChild(tentacle6a);
        this.setRotateAngle(tentacle6a, -0.2227F, 0.034F, -0.0077F);
        this.tentacle6a.cubeList.add(new ModelBox(tentacle6a, 13, 52, -0.5F, -0.5F, 0.0F, 1, 1, 4, 0.0F, true));

        this.tentacle6b = new AdvancedModelRenderer(this);
        this.tentacle6b.setRotationPoint(0.0F, 0.0F, 3.5F);
        this.tentacle6a.addChild(tentacle6b);
        this.setRotateAngle(tentacle6b, -0.2403F, 0.0509F, -0.0125F);
        this.tentacle6b.cubeList.add(new ModelBox(tentacle6b, 24, 52, -0.5F, -0.5F, 0.0F, 1, 1, 4, 0.0F, true));

        this.tentacle7a = new AdvancedModelRenderer(this);
        this.tentacle7a.setRotationPoint(1.5F, 1.5F, 1.5F);
        this.mantle.addChild(tentacle7a);
        this.setRotateAngle(tentacle7a, 0.0F, 0.1833F, 0.7854F);
        this.tentacle7a.cubeList.add(new ModelBox(tentacle7a, 56, 19, -0.5F, -0.5F, 0.0F, 1, 1, 4, 0.0F, true));

        this.tentacle7b = new AdvancedModelRenderer(this);
        this.tentacle7b.setRotationPoint(0.0F, 0.0F, 3.5F);
        this.tentacle7a.addChild(tentacle7b);
        this.setRotateAngle(tentacle7b, 0.048F, 0.1658F, 0.0F);
        this.tentacle7b.cubeList.add(new ModelBox(tentacle7b, 35, 57, -0.5F, -0.5F, 0.0F, 1, 1, 4, 0.0F, true));

        this.tentacle8a = new AdvancedModelRenderer(this);
        this.tentacle8a.setRotationPoint(1.5F, 0.5F, 1.5F);
        this.mantle.addChild(tentacle8a);
        this.setRotateAngle(tentacle8a, 0.0F, 0.2094F, 0.0F);
        this.tentacle8a.cubeList.add(new ModelBox(tentacle8a, 46, 57, -0.5F, -0.5F, 0.0F, 1, 1, 4, 0.0F, true));

        this.tentacle8b = new AdvancedModelRenderer(this);
        this.tentacle8b.setRotationPoint(0.0F, 0.0F, 3.5F);
        this.tentacle8a.addChild(tentacle8b);
        this.setRotateAngle(tentacle8b, 0.0135F, 0.2574F, 0.0034F);
        this.tentacle8b.cubeList.add(new ModelBox(tentacle8b, 57, 57, -0.5F, -0.5F, 0.0F, 1, 1, 4, 0.0F, true));

        this.tentacle9a = new AdvancedModelRenderer(this);
        this.tentacle9a.setRotationPoint(1.5F, -0.5F, 1.5F);
        this.mantle.addChild(tentacle9a);
        this.setRotateAngle(tentacle9a, 0.0873F, 0.0F, 0.7854F);
        this.tentacle9a.cubeList.add(new ModelBox(tentacle9a, 13, 58, -0.5F, -0.5F, 0.0F, 1, 1, 4, 0.0F, true));

        this.tentacle9b = new AdvancedModelRenderer(this);
        this.tentacle9b.setRotationPoint(0.0F, 0.0F, 3.5F);
        this.tentacle9a.addChild(tentacle9b);
        this.setRotateAngle(tentacle9b, 0.371F, -0.0244F, -0.0095F);
        this.tentacle9b.cubeList.add(new ModelBox(tentacle9b, 24, 58, -0.5F, -0.5F, 0.0F, 1, 1, 4, 0.0F, true));

        this.tentacle10a = new AdvancedModelRenderer(this);
        this.tentacle10a.setRotationPoint(0.5F, -0.5F, 1.5F);
        this.mantle.addChild(tentacle10a);
        this.setRotateAngle(tentacle10a, 0.2182F, 0.0128F, 0.0028F);
        this.tentacle10a.cubeList.add(new ModelBox(tentacle10a, 0, 59, -0.5F, -0.5F, 0.0F, 1, 1, 4, 0.0F, true));

        this.tentacle10b = new AdvancedModelRenderer(this);
        this.tentacle10b.setRotationPoint(0.0F, 0.0F, 3.5F);
        this.tentacle10a.addChild(tentacle10b);
        this.setRotateAngle(tentacle10b, 0.2226F, 0.0213F, 0.0048F);
        this.tentacle10b.cubeList.add(new ModelBox(tentacle10b, 59, 49, -0.5F, -0.5F, 0.0F, 1, 1, 4, 0.0F, true));
        updateDefaultPose();
    }

    public void renderAll(float f) {
        this.resetToDefaultPose();
        this.base.offsetY = -1.3F;
        //this.Root.offsetZ = 1.0F;
        //this.base.rotateAngleX = (float) Math.toRadians(25);
        this.base.render(0.08f);
    }

    public void setRotateAngle(ModelRenderer modelRenderer, float x, float y, float z) {
        modelRenderer.rotateAngleX = x;
        modelRenderer.rotateAngleY = y;
        modelRenderer.rotateAngleZ = z;
    }

}
