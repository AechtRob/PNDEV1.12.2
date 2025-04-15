package net.lepidodendron.entity.model.tile;

import net.ilexiconn.llibrary.client.model.tools.AdvancedModelRenderer;
import net.lepidodendron.entity.model.llibraryextensions.AdvancedModelBaseExtended;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;

public class ModelBaculitesShell extends AdvancedModelBaseExtended {
    private final AdvancedModelRenderer base;
    private final AdvancedModelRenderer shell;
    private final AdvancedModelRenderer shell2;
    private final AdvancedModelRenderer shell3;
    private final AdvancedModelRenderer shell4;
    private final AdvancedModelRenderer mantle;
    private final AdvancedModelRenderer siphon;
    private final AdvancedModelRenderer rightEye;
    private final AdvancedModelRenderer leftEye;
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
    private final AdvancedModelRenderer tentacle4b;
    private final AdvancedModelRenderer tentacle4c;
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
    private final AdvancedModelRenderer tentacle9b;
    private final AdvancedModelRenderer tentacle9c;
    private final AdvancedModelRenderer tentacle10a;
    private final AdvancedModelRenderer tentacle10b;
    private final AdvancedModelRenderer tentacle10c;

    public ModelBaculitesShell() {
        this.textureWidth = 44;
        this.textureHeight = 44;

        this.base = new AdvancedModelRenderer(this);
        this.base.setRotationPoint(0.0F, 24.0F, 0.0F);
        this.setRotateAngle(base, 0.0F, 3.1416F, 0.0F);


        this.shell = new AdvancedModelRenderer(this);
        this.shell.setRotationPoint(0.0F, -14.0F, 2.0F);
        this.base.addChild(shell);
        this.setRotateAngle(shell, -0.1309F, 0.0F, 0.0F);
        this.shell.cubeList.add(new ModelBox(shell, 0, 0, -1.5F, -16.0F, -4.0F, 3, 16, 4, 0.0F, false));
        this.shell.cubeList.add(new ModelBox(shell, 26, 0, -1.0F, 1.0F, -1.0F, 2, 3, 1, 0.01F, false));
        this.shell.cubeList.add(new ModelBox(shell, 24, 20, -1.5F, 0.0F, -2.0F, 3, 1, 2, 0.0F, false));
        this.shell.cubeList.add(new ModelBox(shell, 26, 14, -1.0F, -0.1F, -4.0F, 2, 1, 1, -0.01F, false));

        this.shell2 = new AdvancedModelRenderer(this);
        this.shell2.setRotationPoint(0.0F, -16.0F, -0.5F);
        this.shell.addChild(shell2);
        this.setRotateAngle(shell2, 0.2182F, 0.0F, 0.0F);
        this.shell2.cubeList.add(new ModelBox(shell2, 15, 0, -1.0F, -16.0F, -3.0F, 2, 16, 3, 0.0F, false));

        this.shell3 = new AdvancedModelRenderer(this);
        this.shell3.setRotationPoint(0.0F, -16.0F, -0.5F);
        this.shell2.addChild(shell3);
        this.setRotateAngle(shell3, 0.2618F, 0.0F, 0.0F);
        this.shell3.cubeList.add(new ModelBox(shell3, 15, 20, -1.0F, -10.0F, -2.0F, 2, 10, 2, 0.0F, false));

        this.shell4 = new AdvancedModelRenderer(this);
        this.shell4.setRotationPoint(0.0F, -10.0F, -0.5F);
        this.shell3.addChild(shell4);
        this.setRotateAngle(shell4, 0.1658F, 0.0F, 0.0F);
        this.shell4.cubeList.add(new ModelBox(shell4, 24, 24, -0.5F, -7.0F, -1.0F, 1, 7, 1, 0.0F, false));
        this.shell4.cubeList.add(new ModelBox(shell4, 29, 24, -0.5F, -7.0F, -2.0F, 1, 2, 1, 0.0F, false));

        this.mantle = new AdvancedModelRenderer(this);
        this.mantle.setRotationPoint(1.0F, 0.0F, -2.0F);
        this.shell.addChild(mantle);
        this.mantle.cubeList.add(new ModelBox(mantle, 0, 21, -2.0F, 0.0F, -1.5F, 2, 5, 3, 0.0F, false));
        this.mantle.cubeList.add(new ModelBox(mantle, 0, 35, -1.5F, 4.075F, -1.0F, 1, 1, 2, 0.0F, false));

        this.siphon = new AdvancedModelRenderer(this);
        this.siphon.setRotationPoint(-1.0F, 4.0F, 1.5F);
        this.mantle.addChild(siphon);
        this.setRotateAngle(siphon, -0.1309F, 0.0F, 0.0F);
        this.siphon.cubeList.add(new ModelBox(siphon, 26, 10, -0.5F, 0.0F, 0.0F, 1, 1, 2, 0.0F, false));

        this.rightEye = new AdvancedModelRenderer(this);
        this.rightEye.setRotationPoint(-2.0F, 1.25F, 0.75F);
        this.mantle.addChild(rightEye);
        this.setRotateAngle(rightEye, 0.0F, -0.2618F, -0.2182F);
        this.rightEye.cubeList.add(new ModelBox(rightEye, 26, 5, -1.0F, 0.0F, -2.0F, 1, 2, 2, 0.0F, false));
        this.rightEye.cubeList.add(new ModelBox(rightEye, 26, 17, -1.025F, 0.5F, -1.5F, 1, 1, 1, 0.0F, false));

        this.leftEye = new AdvancedModelRenderer(this);
        this.leftEye.setRotationPoint(0.0F, 1.25F, 0.75F);
        this.mantle.addChild(leftEye);
        this.setRotateAngle(leftEye, 0.0F, 0.2618F, 0.2182F);
        this.leftEye.cubeList.add(new ModelBox(leftEye, 26, 5, 0.0F, 0.0F, -2.0F, 1, 2, 2, 0.0F, true));
        this.leftEye.cubeList.add(new ModelBox(leftEye, 26, 17, 0.025F, 0.5F, -1.5F, 1, 1, 1, 0.0F, true));

        this.tentacle1a = new AdvancedModelRenderer(this);
        this.tentacle1a.setRotationPoint(-0.75F, 5.0F, 1.0F);
        this.mantle.addChild(tentacle1a);
        this.setRotateAngle(tentacle1a, -0.0916F, -0.4843F, 0.0F);
        this.tentacle1a.cubeList.add(new ModelBox(tentacle1a, 11, 21, 0.0F, 0.0F, -0.5F, 0, 3, 1, 0.0F, false));

        this.tentacle1b = new AdvancedModelRenderer(this);
        this.tentacle1b.setRotationPoint(0.0F, 3.0F, 0.0F);
        this.tentacle1a.addChild(tentacle1b);
        this.setRotateAngle(tentacle1b, 0.0653F, -0.0043F, 0.0653F);
        this.tentacle1b.cubeList.add(new ModelBox(tentacle1b, 11, 26, 0.0F, 0.0F, -0.5F, 0, 3, 1, 0.0F, false));

        this.tentacle1c = new AdvancedModelRenderer(this);
        this.tentacle1c.setRotationPoint(0.0F, 3.0F, 0.0F);
        this.tentacle1b.addChild(tentacle1c);
        this.setRotateAngle(tentacle1c, 0.0F, 0.0F, -0.0524F);
        this.tentacle1c.cubeList.add(new ModelBox(tentacle1c, 29, 28, 0.0F, 0.0F, -0.5F, 0, 3, 1, 0.0F, false));

        this.tentacle2a = new AdvancedModelRenderer(this);
        this.tentacle2a.setRotationPoint(-0.25F, 5.0F, 1.0F);
        this.mantle.addChild(tentacle2a);
        this.setRotateAngle(tentacle2a, 0.0F, -0.3927F, 0.0F);
        this.tentacle2a.cubeList.add(new ModelBox(tentacle2a, 0, 30, 0.0F, 0.0F, -0.5F, 0, 3, 1, 0.0F, false));

        this.tentacle2b = new AdvancedModelRenderer(this);
        this.tentacle2b.setRotationPoint(0.0F, 3.0F, 0.0F);
        this.tentacle2a.addChild(tentacle2b);
        this.setRotateAngle(tentacle2b, 0.0F, 0.0F, 0.1134F);
        this.tentacle2b.cubeList.add(new ModelBox(tentacle2b, 3, 30, 0.0F, 0.0F, -0.5F, 0, 3, 1, 0.0F, false));

        this.tentacle2c = new AdvancedModelRenderer(this);
        this.tentacle2c.setRotationPoint(0.0F, 3.0F, 0.0F);
        this.tentacle2b.addChild(tentacle2c);
        this.setRotateAngle(tentacle2c, 0.0F, 0.0F, -0.1222F);
        this.tentacle2c.cubeList.add(new ModelBox(tentacle2c, 6, 30, 0.0F, 0.0F, -0.5F, 0, 3, 1, 0.0F, false));

        this.tentacle3a = new AdvancedModelRenderer(this);
        this.tentacle3a.setRotationPoint(0.0F, 5.0F, 0.0F);
        this.mantle.addChild(tentacle3a);
        this.tentacle3a.cubeList.add(new ModelBox(tentacle3a, 9, 31, 0.0F, 0.0F, -0.5F, 0, 3, 1, 0.0F, false));

        this.tentacle3b = new AdvancedModelRenderer(this);
        this.tentacle3b.setRotationPoint(0.0F, 3.0F, 0.0F);
        this.tentacle3a.addChild(tentacle3b);
        this.setRotateAngle(tentacle3b, 0.0F, 0.0F, 0.1745F);
        this.tentacle3b.cubeList.add(new ModelBox(tentacle3b, 12, 31, 0.0F, 0.0F, -0.5F, 0, 3, 1, 0.0F, false));

        this.tentacle3c = new AdvancedModelRenderer(this);
        this.tentacle3c.setRotationPoint(0.0F, 3.0F, 0.0F);
        this.tentacle3b.addChild(tentacle3c);
        this.setRotateAngle(tentacle3c, 0.0F, 0.0F, -0.1745F);
        this.tentacle3c.cubeList.add(new ModelBox(tentacle3c, 32, 28, 0.0F, 0.0F, -0.5F, 0, 3, 1, 0.0F, false));

        this.tentacle4a = new AdvancedModelRenderer(this);
        this.tentacle4a.setRotationPoint(-0.25F, 5.0F, -1.0F);
        this.mantle.addChild(tentacle4a);
        this.setRotateAngle(tentacle4a, -0.0349F, 0.3491F, 0.0F);
        this.tentacle4a.cubeList.add(new ModelBox(tentacle4a, 33, 0, 0.0F, 0.0F, -0.5F, 0, 3, 1, 0.0F, false));

        this.tentacle4b = new AdvancedModelRenderer(this);
        this.tentacle4b.setRotationPoint(0.0F, 3.0F, 0.0F);
        this.tentacle4a.addChild(tentacle4b);
        this.setRotateAngle(tentacle4b, 0.096F, 0.0F, 0.1091F);
        this.tentacle4b.cubeList.add(new ModelBox(tentacle4b, 33, 5, 0.0F, 0.0F, -0.5F, 0, 3, 1, 0.0F, false));

        this.tentacle4c = new AdvancedModelRenderer(this);
        this.tentacle4c.setRotationPoint(0.0F, 3.0F, 0.0F);
        this.tentacle4b.addChild(tentacle4c);
        this.setRotateAngle(tentacle4c, 0.0F, 0.0F, -0.1178F);
        this.tentacle4c.cubeList.add(new ModelBox(tentacle4c, 33, 10, 0.0F, 0.0F, -0.5F, 0, 3, 1, 0.0F, false));

        this.tentacle5a = new AdvancedModelRenderer(this);
        this.tentacle5a.setRotationPoint(-0.5F, 5.0F, -1.0F);
        this.mantle.addChild(tentacle5a);
        this.setRotateAngle(tentacle5a, 0.1386F, 0.4469F, 0.06F);
        this.tentacle5a.cubeList.add(new ModelBox(tentacle5a, 15, 33, 0.0F, 0.0F, -0.5F, 0, 3, 1, 0.0F, false));

        this.tentacle5b = new AdvancedModelRenderer(this);
        this.tentacle5b.setRotationPoint(0.0F, 3.0F, 0.0F);
        this.tentacle5a.addChild(tentacle5b);
        this.setRotateAngle(tentacle5b, -0.1265F, 0.0F, 0.0654F);
        this.tentacle5b.cubeList.add(new ModelBox(tentacle5b, 33, 15, 0.0F, 0.0F, -0.5F, 0, 3, 1, 0.0F, false));

        this.tentacle5c = new AdvancedModelRenderer(this);
        this.tentacle5c.setRotationPoint(0.0F, 3.0F, 0.0F);
        this.tentacle5b.addChild(tentacle5c);
        this.setRotateAngle(tentacle5c, 0.061F, -0.0035F, -0.1179F);
        this.tentacle5c.cubeList.add(new ModelBox(tentacle5c, 18, 33, 0.0F, 0.0F, -0.5F, 0, 3, 1, 0.0F, false));

        this.tentacle6a = new AdvancedModelRenderer(this);
        this.tentacle6a.setRotationPoint(-1.25F, 5.0F, 1.0F);
        this.mantle.addChild(tentacle6a);
        this.setRotateAngle(tentacle6a, -0.0916F, 0.4843F, 0.0F);
        this.tentacle6a.cubeList.add(new ModelBox(tentacle6a, 11, 21, 0.0F, 0.0F, -0.5F, 0, 3, 1, 0.0F, true));

        this.tentacle6b = new AdvancedModelRenderer(this);
        this.tentacle6b.setRotationPoint(0.0F, 3.0F, 0.0F);
        this.tentacle6a.addChild(tentacle6b);
        this.setRotateAngle(tentacle6b, 0.0653F, 0.0043F, -0.0653F);
        this.tentacle6b.cubeList.add(new ModelBox(tentacle6b, 11, 26, 0.0F, 0.0F, -0.5F, 0, 3, 1, 0.0F, true));

        this.tentacle6c = new AdvancedModelRenderer(this);
        this.tentacle6c.setRotationPoint(0.0F, 3.0F, 0.0F);
        this.tentacle6b.addChild(tentacle6c);
        this.setRotateAngle(tentacle6c, 0.0F, 0.0F, 0.0524F);
        this.tentacle6c.cubeList.add(new ModelBox(tentacle6c, 29, 28, 0.0F, 0.0F, -0.5F, 0, 3, 1, 0.0F, true));

        this.tentacle7a = new AdvancedModelRenderer(this);
        this.tentacle7a.setRotationPoint(-1.75F, 5.0F, 1.0F);
        this.mantle.addChild(tentacle7a);
        this.setRotateAngle(tentacle7a, 0.0F, 0.3927F, 0.0F);
        this.tentacle7a.cubeList.add(new ModelBox(tentacle7a, 0, 30, 0.0F, 0.0F, -0.5F, 0, 3, 1, 0.0F, true));

        this.tentacle7b = new AdvancedModelRenderer(this);
        this.tentacle7b.setRotationPoint(0.0F, 3.0F, 0.0F);
        this.tentacle7a.addChild(tentacle7b);
        this.setRotateAngle(tentacle7b, 0.0F, 0.0F, -0.1134F);
        this.tentacle7b.cubeList.add(new ModelBox(tentacle7b, 3, 30, 0.0F, 0.0F, -0.5F, 0, 3, 1, 0.0F, true));

        this.tentacle7c = new AdvancedModelRenderer(this);
        this.tentacle7c.setRotationPoint(0.0F, 3.0F, 0.0F);
        this.tentacle7b.addChild(tentacle7c);
        this.setRotateAngle(tentacle7c, 0.0F, 0.0F, 0.1222F);
        this.tentacle7c.cubeList.add(new ModelBox(tentacle7c, 6, 30, 0.0F, 0.0F, -0.5F, 0, 3, 1, 0.0F, true));

        this.tentacle8a = new AdvancedModelRenderer(this);
        this.tentacle8a.setRotationPoint(-2.0F, 5.0F, 0.0F);
        this.mantle.addChild(tentacle8a);
        this.tentacle8a.cubeList.add(new ModelBox(tentacle8a, 9, 31, 0.0F, 0.0F, -0.5F, 0, 3, 1, 0.0F, true));

        this.tentacle8b = new AdvancedModelRenderer(this);
        this.tentacle8b.setRotationPoint(0.0F, 3.0F, 0.0F);
        this.tentacle8a.addChild(tentacle8b);
        this.setRotateAngle(tentacle8b, 0.0F, 0.0F, -0.1745F);
        this.tentacle8b.cubeList.add(new ModelBox(tentacle8b, 12, 31, 0.0F, 0.0F, -0.5F, 0, 3, 1, 0.0F, true));

        this.tentacle8c = new AdvancedModelRenderer(this);
        this.tentacle8c.setRotationPoint(0.0F, 3.0F, 0.0F);
        this.tentacle8b.addChild(tentacle8c);
        this.setRotateAngle(tentacle8c, 0.0F, 0.0F, 0.1745F);
        this.tentacle8c.cubeList.add(new ModelBox(tentacle8c, 32, 28, 0.0F, 0.0F, -0.5F, 0, 3, 1, 0.0F, true));

        this.tentacle9a = new AdvancedModelRenderer(this);
        this.tentacle9a.setRotationPoint(-1.75F, 5.0F, -1.0F);
        this.mantle.addChild(tentacle9a);
        this.setRotateAngle(tentacle9a, -0.0349F, -0.3491F, 0.0F);
        this.tentacle9a.cubeList.add(new ModelBox(tentacle9a, 33, 0, 0.0F, 0.0F, -0.5F, 0, 3, 1, 0.0F, true));

        this.tentacle9b = new AdvancedModelRenderer(this);
        this.tentacle9b.setRotationPoint(0.0F, 3.0F, 0.0F);
        this.tentacle9a.addChild(tentacle9b);
        this.setRotateAngle(tentacle9b, 0.096F, 0.0F, -0.1091F);
        this.tentacle9b.cubeList.add(new ModelBox(tentacle9b, 33, 5, 0.0F, 0.0F, -0.5F, 0, 3, 1, 0.0F, true));

        this.tentacle9c = new AdvancedModelRenderer(this);
        this.tentacle9c.setRotationPoint(0.0F, 3.0F, 0.0F);
        this.tentacle9b.addChild(tentacle9c);
        this.setRotateAngle(tentacle9c, 0.0F, 0.0F, 0.1178F);
        this.tentacle9c.cubeList.add(new ModelBox(tentacle9c, 33, 10, 0.0F, 0.0F, -0.5F, 0, 3, 1, 0.0F, true));

        this.tentacle10a = new AdvancedModelRenderer(this);
        this.tentacle10a.setRotationPoint(-1.5F, 5.0F, -1.0F);
        this.mantle.addChild(tentacle10a);
        this.setRotateAngle(tentacle10a, 0.1386F, -0.4469F, -0.06F);
        this.tentacle10a.cubeList.add(new ModelBox(tentacle10a, 15, 33, 0.0F, 0.0F, -0.5F, 0, 3, 1, 0.0F, true));

        this.tentacle10b = new AdvancedModelRenderer(this);
        this.tentacle10b.setRotationPoint(0.0F, 3.0F, 0.0F);
        this.tentacle10a.addChild(tentacle10b);
        this.setRotateAngle(tentacle10b, -0.1265F, 0.0F, -0.0654F);
        this.tentacle10b.cubeList.add(new ModelBox(tentacle10b, 33, 15, 0.0F, 0.0F, -0.5F, 0, 3, 1, 0.0F, true));

        this.tentacle10c = new AdvancedModelRenderer(this);
        this.tentacle10c.setRotationPoint(0.0F, 3.0F, 0.0F);
        this.tentacle10b.addChild(tentacle10c);
        this.setRotateAngle(tentacle10c, 0.061F, 0.0035F, 0.1179F);
        this.tentacle10c.cubeList.add(new ModelBox(tentacle10c, 18, 33, 0.0F, 0.0F, -0.5F, 0, 3, 1, 0.0F, true));
        updateDefaultPose();
    }

    public void renderAll(float f) {
        this.resetToDefaultPose();
        this.base.offsetY = -1.95F;
        //this.Root.offsetZ = 1.0F;
        this.base.offsetZ = 2F;
        this.base.rotateAngleX = (float) Math.toRadians(270);
        this.base.render(0.08f);
    }

    public void setRotateAngle(ModelRenderer modelRenderer, float x, float y, float z) {
        modelRenderer.rotateAngleX = x;
        modelRenderer.rotateAngleY = y;
        modelRenderer.rotateAngleZ = z;
    }

}
