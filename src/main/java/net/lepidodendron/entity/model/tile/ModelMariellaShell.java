package net.lepidodendron.entity.model.tile;

import net.ilexiconn.llibrary.client.model.tools.AdvancedModelRenderer;
import net.lepidodendron.entity.model.llibraryextensions.AdvancedModelBaseExtended;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;

public class ModelMariellaShell extends AdvancedModelBaseExtended {
    private final AdvancedModelRenderer base;
    private final AdvancedModelRenderer shell;
    private final AdvancedModelRenderer shell4;
    private final AdvancedModelRenderer shell3;
    private final AdvancedModelRenderer aperture;
    private final AdvancedModelRenderer mantle;
    private final AdvancedModelRenderer siphon;
    private final AdvancedModelRenderer cube_r1;
    private final AdvancedModelRenderer leftEye;
    private final AdvancedModelRenderer rightEye;
    private final AdvancedModelRenderer mantle2;
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

    public ModelMariellaShell() {
        this.textureWidth = 88;
        this.textureHeight = 88;

        this.base = new AdvancedModelRenderer(this);
        this.base.setRotationPoint(0.0F, 24.0F, 0.0F);


        this.shell = new AdvancedModelRenderer(this);
        this.shell.setRotationPoint(-3.0F, 1.75F, -3.75F);
        this.base.addChild(shell);
        this.shell.cubeList.add(new ModelBox(shell, 0, 0, -5.5F, -17.75F, -3.25F, 11, 6, 11, 0.0F, false));
        this.shell.cubeList.add(new ModelBox(shell, 0, 18, -6.0F, -11.9953F, -3.8073F, 12, 6, 6, 0.01F, false));
        this.shell.cubeList.add(new ModelBox(shell, 0, 31, -4.0F, -21.75F, -2.75F, 8, 4, 8, 0.0F, false));
        this.shell.cubeList.add(new ModelBox(shell, 0, 44, -3.5F, -24.75F, -2.25F, 7, 3, 7, 0.0F, false));
        this.shell.cubeList.add(new ModelBox(shell, 0, 55, -2.0F, -27.75F, -1.5F, 4, 3, 4, 0.0F, false));
        this.shell.cubeList.add(new ModelBox(shell, 59, 48, -1.5F, -29.75F, -1.25F, 3, 2, 3, 0.0F, false));
        this.shell.cubeList.add(new ModelBox(shell, 62, 43, -1.0F, -30.25F, -1.0F, 2, 1, 2, 0.0F, false));

        this.shell4 = new AdvancedModelRenderer(this);
        this.shell4.setRotationPoint(4.0F, -5.9953F, 2.1927F);
        this.shell.addChild(shell4);
        this.setRotateAngle(shell4, 0.7941F, 0.0F, 0.0F);
        this.shell4.cubeList.add(new ModelBox(shell4, 0, 74, -9.44F, -4.0798F, -0.0103F, 5, 4, 8, 0.01F, false));

        this.shell3 = new AdvancedModelRenderer(this);
        this.shell3.setRotationPoint(4.0F, -5.9953F, -3.8073F);
        this.shell.addChild(shell3);
        this.setRotateAngle(shell3, 1.0254F, 0.0F, 0.0F);
        this.shell3.cubeList.add(new ModelBox(shell3, 29, 48, -3.0F, 0.0F, 0.0F, 4, 11, 2, 0.0F, false));

        this.aperture = new AdvancedModelRenderer(this);
        this.aperture.setRotationPoint(4.0F, -11.9953F, 2.1927F);
        this.shell.addChild(aperture);
        this.setRotateAngle(aperture, -1.2217F, 0.0F, 0.0F);
        this.aperture.cubeList.add(new ModelBox(aperture, 37, 18, -4.0F, 0.0F, 0.0F, 6, 4, 8, 0.0F, false));
        this.aperture.cubeList.add(new ModelBox(aperture, 42, 57, -4.0F, 0.0F, 8.0F, 6, 2, 2, 0.0F, false));

        this.mantle = new AdvancedModelRenderer(this);
        this.mantle.setRotationPoint(4.5F, -11.75F, 1.75F);
        this.shell.addChild(mantle);
        this.setRotateAngle(mantle, -0.0611F, 0.0F, 0.0F);
        this.mantle.cubeList.add(new ModelBox(mantle, 33, 31, -4.0F, 0.0F, 0.0F, 5, 7, 9, -0.01F, false));

        this.siphon = new AdvancedModelRenderer(this);
        this.siphon.setRotationPoint(-1.5F, 6.5F, 2.0F);
        this.mantle.addChild(siphon);
        this.setRotateAngle(siphon, -0.5236F, 0.0F, 0.0F);


        this.cube_r1 = new AdvancedModelRenderer(this);
        this.cube_r1.setRotationPoint(2.0F, -3.5F, -1.0F);
        this.siphon.addChild(cube_r1);
        this.setRotateAngle(cube_r1, -0.0873F, 0.0F, 0.0F);
        this.cube_r1.cubeList.add(new ModelBox(cube_r1, 42, 48, -3.0F, 2.0F, 2.0F, 2, 2, 6, 0.01F, false));

        this.leftEye = new AdvancedModelRenderer(this);
        this.leftEye.setRotationPoint(0.5F, 0.0F, 7.5F);
        this.mantle.addChild(leftEye);
        this.setRotateAngle(leftEye, 0.0F, 0.0F, 0.096F);
        this.leftEye.cubeList.add(new ModelBox(leftEye, 66, 21, -0.5F, -3.0F, -1.5F, 1, 3, 3, 0.0F, false));

        this.rightEye = new AdvancedModelRenderer(this);
        this.rightEye.setRotationPoint(-3.5F, 0.0F, 7.5F);
        this.mantle.addChild(rightEye);
        this.setRotateAngle(rightEye, 0.0F, 0.0F, -0.096F);
        this.rightEye.cubeList.add(new ModelBox(rightEye, 66, 21, -0.5F, -3.0F, -1.5F, 1, 3, 3, 0.0F, true));

        this.mantle2 = new AdvancedModelRenderer(this);
        this.mantle2.setRotationPoint(0.0F, 0.0F, 9.0F);
        this.mantle.addChild(mantle2);
        this.setRotateAngle(mantle2, -0.9774F, 0.0F, 0.0F);
        this.mantle2.cubeList.add(new ModelBox(mantle2, 45, 0, -4.0F, 0.0F, 0.0F, 5, 7, 7, 0.0F, false));

        this.tentacle1a = new AdvancedModelRenderer(this);
        this.tentacle1a.setRotationPoint(-2.75F, 6.5F, 6.5F);
        this.mantle2.addChild(tentacle1a);
        this.setRotateAngle(tentacle1a, 0.0873F, 0.0F, 0.7854F);
        this.tentacle1a.cubeList.add(new ModelBox(tentacle1a, 17, 55, -0.5F, -0.5F, 0.0F, 1, 1, 4, 0.0F, false));
        this.tentacle1a.cubeList.add(new ModelBox(tentacle1a, 59, 54, -1.0F, -0.25F, 0.0F, 2, 0, 4, 0.0F, false));

        this.tentacle1b = new AdvancedModelRenderer(this);
        this.tentacle1b.setRotationPoint(0.0F, 0.0F, 3.5F);
        this.tentacle1a.addChild(tentacle1b);
        this.setRotateAngle(tentacle1b, -0.2054F, -0.0555F, 0.0116F);
        this.tentacle1b.cubeList.add(new ModelBox(tentacle1b, 17, 61, -0.5F, -0.5F, 0.0F, 1, 1, 4, 0.0F, false));
        this.tentacle1b.cubeList.add(new ModelBox(tentacle1b, 45, 15, -1.0F, -0.25F, 0.0F, 2, 0, 2, 0.0F, false));

        this.tentacle2a = new AdvancedModelRenderer(this);
        this.tentacle2a.setRotationPoint(-3.25F, 4.5F, 6.5F);
        this.mantle2.addChild(tentacle2a);
        this.setRotateAngle(tentacle2a, 0.0F, -0.1309F, 0.0F);
        this.tentacle2a.cubeList.add(new ModelBox(tentacle2a, 28, 62, -0.5F, -0.5F, 0.0F, 1, 1, 4, 0.0F, false));
        this.tentacle2a.cubeList.add(new ModelBox(tentacle2a, 29, 68, 0.25F, -1.0F, 0.0F, 0, 2, 4, 0.0F, false));

        this.tentacle2b = new AdvancedModelRenderer(this);
        this.tentacle2b.setRotationPoint(0.0F, 0.0F, 3.5F);
        this.tentacle2a.addChild(tentacle2b);
        this.setRotateAngle(tentacle2b, -0.088F, 0.1304F, -0.0115F);
        this.tentacle2b.cubeList.add(new ModelBox(tentacle2b, 62, 31, -0.5F, -0.5F, 0.0F, 1, 1, 4, 0.0F, false));
        this.tentacle2b.cubeList.add(new ModelBox(tentacle2b, 0, 69, 0.25F, -1.0F, 0.0F, 0, 2, 2, 0.0F, false));

        this.tentacle3a = new AdvancedModelRenderer(this);
        this.tentacle3a.setRotationPoint(-3.5F, 2.5F, 6.5F);
        this.mantle2.addChild(tentacle3a);
        this.setRotateAngle(tentacle3a, 0.0F, -0.1091F, 0.0F);
        this.tentacle3a.cubeList.add(new ModelBox(tentacle3a, 62, 37, -0.5F, -0.5F, 0.0F, 1, 1, 4, 0.0F, false));
        this.tentacle3a.cubeList.add(new ModelBox(tentacle3a, 20, 68, 0.25F, -1.0F, 0.0F, 0, 2, 4, 0.0F, false));

        this.tentacle3b = new AdvancedModelRenderer(this);
        this.tentacle3b.setRotationPoint(0.0F, 0.0F, 3.5F);
        this.tentacle3a.addChild(tentacle3b);
        this.setRotateAngle(tentacle3b, -0.0829F, 0.1309F, 0.0F);
        this.tentacle3b.cubeList.add(new ModelBox(tentacle3b, 39, 62, -0.5F, -0.5F, 0.0F, 1, 1, 4, 0.0F, false));
        this.tentacle3b.cubeList.add(new ModelBox(tentacle3b, 38, 68, 0.25F, -1.0F, 0.0F, 0, 2, 2, 0.0F, false));

        this.tentacle4a = new AdvancedModelRenderer(this);
        this.tentacle4a.setRotationPoint(-3.25F, 0.75F, 6.5F);
        this.mantle2.addChild(tentacle4a);
        this.setRotateAngle(tentacle4a, 0.0F, 0.0F, 0.6545F);
        this.tentacle4a.cubeList.add(new ModelBox(tentacle4a, 0, 63, -0.5F, -0.5F, 0.0F, 1, 1, 4, 0.0F, false));
        this.tentacle4a.cubeList.add(new ModelBox(tentacle4a, 11, 67, 0.25F, -1.0F, 0.0F, 0, 2, 4, 0.0F, false));

        this.tentacle4b = new AdvancedModelRenderer(this);
        this.tentacle4b.setRotationPoint(0.0F, 0.0F, 3.5F);
        this.tentacle4a.addChild(tentacle4b);
        this.setRotateAngle(tentacle4b, -0.0436F, 0.0044F, 0.0F);
        this.tentacle4b.cubeList.add(new ModelBox(tentacle4b, 50, 64, -0.5F, -0.5F, 0.0F, 1, 1, 4, 0.0F, false));
        this.tentacle4b.cubeList.add(new ModelBox(tentacle4b, 43, 68, 0.25F, -1.0F, 0.0F, 0, 2, 2, 0.0F, false));

        this.tentacle5a = new AdvancedModelRenderer(this);
        this.tentacle5a.setRotationPoint(-2.0F, 0.5F, 6.5F);
        this.mantle2.addChild(tentacle5a);
        this.setRotateAngle(tentacle5a, 0.0873F, -0.013F, -0.0011F);
        this.tentacle5a.cubeList.add(new ModelBox(tentacle5a, 61, 64, -0.5F, -0.5F, 0.0F, 1, 1, 4, 0.0F, false));
        this.tentacle5a.cubeList.add(new ModelBox(tentacle5a, 59, 59, -1.0F, 0.5F, 0.0F, 2, 0, 4, 0.0F, false));

        this.tentacle5b = new AdvancedModelRenderer(this);
        this.tentacle5b.setRotationPoint(0.0F, 0.0F, 3.5F);
        this.tentacle5a.addChild(tentacle5b);
        this.setRotateAngle(tentacle5b, -0.1134F, -0.0742F, 0.0F);
        this.tentacle5b.cubeList.add(new ModelBox(tentacle5b, 66, 15, -0.5F, -0.5F, 0.0F, 1, 1, 4, 0.0F, false));
        this.tentacle5b.cubeList.add(new ModelBox(tentacle5b, 54, 15, -1.0F, 0.5F, 0.0F, 2, 0, 2, 0.0F, false));

        this.tentacle6a = new AdvancedModelRenderer(this);
        this.tentacle6a.setRotationPoint(-0.25F, 6.5F, 6.5F);
        this.mantle2.addChild(tentacle6a);
        this.setRotateAngle(tentacle6a, 0.0873F, 0.0F, -0.7854F);
        this.tentacle6a.cubeList.add(new ModelBox(tentacle6a, 17, 55, -0.5F, -0.5F, 0.0F, 1, 1, 4, 0.0F, true));
        this.tentacle6a.cubeList.add(new ModelBox(tentacle6a, 59, 54, -1.0F, -0.25F, 0.0F, 2, 0, 4, 0.0F, true));

        this.tentacle6b = new AdvancedModelRenderer(this);
        this.tentacle6b.setRotationPoint(0.0F, 0.0F, 3.5F);
        this.tentacle6a.addChild(tentacle6b);
        this.setRotateAngle(tentacle6b, -0.2054F, 0.0555F, -0.0116F);
        this.tentacle6b.cubeList.add(new ModelBox(tentacle6b, 17, 61, -0.5F, -0.5F, 0.0F, 1, 1, 4, 0.0F, true));
        this.tentacle6b.cubeList.add(new ModelBox(tentacle6b, 45, 15, -1.0F, -0.25F, 0.0F, 2, 0, 2, 0.0F, true));

        this.tentacle7a = new AdvancedModelRenderer(this);
        this.tentacle7a.setRotationPoint(0.25F, 4.5F, 6.5F);
        this.mantle2.addChild(tentacle7a);
        this.setRotateAngle(tentacle7a, 0.0F, 0.1309F, 0.0F);
        this.tentacle7a.cubeList.add(new ModelBox(tentacle7a, 28, 62, -0.5F, -0.5F, 0.0F, 1, 1, 4, 0.0F, true));
        this.tentacle7a.cubeList.add(new ModelBox(tentacle7a, 29, 68, -0.25F, -1.0F, 0.0F, 0, 2, 4, 0.0F, true));

        this.tentacle7b = new AdvancedModelRenderer(this);
        this.tentacle7b.setRotationPoint(0.0F, 0.0F, 3.5F);
        this.tentacle7a.addChild(tentacle7b);
        this.setRotateAngle(tentacle7b, -0.088F, -0.1304F, 0.0115F);
        this.tentacle7b.cubeList.add(new ModelBox(tentacle7b, 62, 31, -0.5F, -0.5F, 0.0F, 1, 1, 4, 0.0F, true));
        this.tentacle7b.cubeList.add(new ModelBox(tentacle7b, 0, 69, -0.25F, -1.0F, 0.0F, 0, 2, 2, 0.0F, true));

        this.tentacle8a = new AdvancedModelRenderer(this);
        this.tentacle8a.setRotationPoint(0.5F, 2.5F, 6.5F);
        this.mantle2.addChild(tentacle8a);
        this.setRotateAngle(tentacle8a, 0.0F, 0.1091F, 0.0F);
        this.tentacle8a.cubeList.add(new ModelBox(tentacle8a, 62, 37, -0.5F, -0.5F, 0.0F, 1, 1, 4, 0.0F, true));
        this.tentacle8a.cubeList.add(new ModelBox(tentacle8a, 20, 68, -0.25F, -1.0F, 0.0F, 0, 2, 4, 0.0F, true));

        this.tentacle8b = new AdvancedModelRenderer(this);
        this.tentacle8b.setRotationPoint(0.0F, 0.0F, 3.5F);
        this.tentacle8a.addChild(tentacle8b);
        this.setRotateAngle(tentacle8b, -0.0829F, -0.1309F, 0.0F);
        this.tentacle8b.cubeList.add(new ModelBox(tentacle8b, 39, 62, -0.5F, -0.5F, 0.0F, 1, 1, 4, 0.0F, true));
        this.tentacle8b.cubeList.add(new ModelBox(tentacle8b, 38, 68, -0.25F, -1.0F, 0.0F, 0, 2, 2, 0.0F, true));

        this.tentacle9a = new AdvancedModelRenderer(this);
        this.tentacle9a.setRotationPoint(0.25F, 0.75F, 6.5F);
        this.mantle2.addChild(tentacle9a);
        this.setRotateAngle(tentacle9a, 0.0F, 0.0F, -0.6545F);
        this.tentacle9a.cubeList.add(new ModelBox(tentacle9a, 0, 63, -0.5F, -0.5F, 0.0F, 1, 1, 4, 0.0F, true));
        this.tentacle9a.cubeList.add(new ModelBox(tentacle9a, 11, 67, -0.25F, -1.0F, 0.0F, 0, 2, 4, 0.0F, true));

        this.tentacle9b = new AdvancedModelRenderer(this);
        this.tentacle9b.setRotationPoint(0.0F, 0.0F, 3.5F);
        this.tentacle9a.addChild(tentacle9b);
        this.setRotateAngle(tentacle9b, -0.0436F, -0.0044F, 0.0F);
        this.tentacle9b.cubeList.add(new ModelBox(tentacle9b, 50, 64, -0.5F, -0.5F, 0.0F, 1, 1, 4, 0.0F, true));
        this.tentacle9b.cubeList.add(new ModelBox(tentacle9b, 43, 68, -0.25F, -1.0F, 0.0F, 0, 2, 2, 0.0F, true));

        this.tentacle10a = new AdvancedModelRenderer(this);
        this.tentacle10a.setRotationPoint(-1.0F, 0.5F, 6.5F);
        this.mantle2.addChild(tentacle10a);
        this.setRotateAngle(tentacle10a, 0.0873F, 0.013F, 0.0011F);
        this.tentacle10a.cubeList.add(new ModelBox(tentacle10a, 61, 64, -0.5F, -0.5F, 0.0F, 1, 1, 4, 0.0F, true));
        this.tentacle10a.cubeList.add(new ModelBox(tentacle10a, 59, 59, -1.0F, 0.5F, 0.0F, 2, 0, 4, 0.0F, true));

        this.tentacle10b = new AdvancedModelRenderer(this);
        this.tentacle10b.setRotationPoint(0.0F, 0.0F, 3.5F);
        this.tentacle10a.addChild(tentacle10b);
        this.setRotateAngle(tentacle10b, -0.1134F, 0.0742F, 0.0F);
        this.tentacle10b.cubeList.add(new ModelBox(tentacle10b, 66, 15, -0.5F, -0.5F, 0.0F, 1, 1, 4, 0.0F, true));
        this.tentacle10b.cubeList.add(new ModelBox(tentacle10b, 54, 15, -1.0F, 0.5F, 0.0F, 2, 0, 2, 0.0F, true));
        updateDefaultPose();
    }

    public void renderAll(float f) {
        this.resetToDefaultPose();
        this.base.offsetY = -2F;
        this.base.offsetZ = 1F;
        //this.Root.offsetZ = 1.0F;
        this.base.rotateAngleX = (float) Math.toRadians(100);
        this.base.render(0.08f);
    }

    public void setRotateAngle(ModelRenderer modelRenderer, float x, float y, float z) {
        modelRenderer.rotateAngleX = x;
        modelRenderer.rotateAngleY = y;
        modelRenderer.rotateAngleZ = z;
    }

}
