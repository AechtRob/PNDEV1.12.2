package net.lepidodendron.entity.model.tile;

import net.ilexiconn.llibrary.client.model.tools.AdvancedModelRenderer;
import net.lepidodendron.entity.model.llibraryextensions.AdvancedModelBaseExtended;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;

public class ModelPravitocerasShell extends AdvancedModelBaseExtended {
    private final AdvancedModelRenderer base;
    private final AdvancedModelRenderer shell;
    private final AdvancedModelRenderer mantle;
    private final AdvancedModelRenderer rightEye;
    private final AdvancedModelRenderer leftEye;
    private final AdvancedModelRenderer siphon;
    private final AdvancedModelRenderer tentacle1a;
    private final AdvancedModelRenderer tentacle1b;
    private final AdvancedModelRenderer tentacle1c;
    private final AdvancedModelRenderer tentacle1d;
    private final AdvancedModelRenderer tentacl6a;
    private final AdvancedModelRenderer tentacle6b;
    private final AdvancedModelRenderer tentacle6c;
    private final AdvancedModelRenderer tentacle6d;
    private final AdvancedModelRenderer tentacle2;
    private final AdvancedModelRenderer tentacle7;
    private final AdvancedModelRenderer tentacle3;
    private final AdvancedModelRenderer tentacle8;
    private final AdvancedModelRenderer tentacle4;
    private final AdvancedModelRenderer tentacle9;
    private final AdvancedModelRenderer tentacle5;
    private final AdvancedModelRenderer tentacle10;
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
    private final AdvancedModelRenderer shell12;
    private final AdvancedModelRenderer shell13;
    private final AdvancedModelRenderer shell14;
    private final AdvancedModelRenderer shell15;
    private final AdvancedModelRenderer shell16;

    public ModelPravitocerasShell() {
        this.textureWidth = 88;
        this.textureHeight = 88;

        this.base = new AdvancedModelRenderer(this);
        this.base.setRotationPoint(0.0F, 24.0F, 0.0F);


        this.shell = new AdvancedModelRenderer(this);
        this.shell.setRotationPoint(0.0F, -22.5F, -2.0F);
        this.base.addChild(shell);
        this.setRotateAngle(shell, 1.0908F, 0.0F, 0.0F);
        this.shell.cubeList.add(new ModelBox(shell, 0, 24, -2.0F, 13.303F, -15.0849F, 4, 4, 10, 0.02F, false));

        this.mantle = new AdvancedModelRenderer(this);
        this.mantle.setRotationPoint(0.0F, 13.553F, -5.0849F);
        this.shell.addChild(mantle);
        this.setRotateAngle(mantle, -0.5236F, 0.0F, 0.0F);
        this.mantle.cubeList.add(new ModelBox(mantle, 53, 61, -1.5F, 0.0F, 0.0F, 3, 3, 4, 0.0F, false));

        this.rightEye = new AdvancedModelRenderer(this);
        this.rightEye.setRotationPoint(-0.1F, 3.0F, 11.0F);
        this.mantle.addChild(rightEye);
        this.rightEye.cubeList.add(new ModelBox(rightEye, 11, 62, -1.9F, -2.5F, -9.5F, 1, 2, 2, 0.0F, false));
        this.rightEye.cubeList.add(new ModelBox(rightEye, 63, 56, -2.0F, -2.0F, -9.0F, 1, 1, 1, 0.0F, false));

        this.leftEye = new AdvancedModelRenderer(this);
        this.leftEye.setRotationPoint(0.1F, 3.0F, 11.0F);
        this.mantle.addChild(leftEye);
        this.leftEye.cubeList.add(new ModelBox(leftEye, 11, 62, 0.9F, -2.5F, -9.5F, 1, 2, 2, 0.0F, true));
        this.leftEye.cubeList.add(new ModelBox(leftEye, 63, 56, 1.0F, -2.0F, -9.0F, 1, 1, 1, 0.0F, true));

        this.siphon = new AdvancedModelRenderer(this);
        this.siphon.setRotationPoint(0.0F, 2.2544F, 1.8967F);
        this.mantle.addChild(siphon);
        this.setRotateAngle(siphon, -0.6545F, 0.0F, 0.0F);
        this.siphon.cubeList.add(new ModelBox(siphon, 11, 67, -0.5F, -0.3154F, 0.4021F, 1, 1, 2, 0.0F, false));

        this.tentacle1a = new AdvancedModelRenderer(this);
        this.tentacle1a.setRotationPoint(-0.5F, 2.5F, 4.0F);
        this.mantle.addChild(tentacle1a);
        this.setRotateAngle(tentacle1a, -0.5679F, -0.0442F, 0.0282F);
        this.tentacle1a.cubeList.add(new ModelBox(tentacle1a, 52, 44, -0.5F, -0.5F, 0.0F, 1, 1, 4, 0.0F, false));

        this.tentacle1b = new AdvancedModelRenderer(this);
        this.tentacle1b.setRotationPoint(0.0F, 0.0F, 4.0F);
        this.tentacle1a.addChild(tentacle1b);
        this.setRotateAngle(tentacle1b, 0.0873F, -0.1745F, 0.0F);
        this.tentacle1b.cubeList.add(new ModelBox(tentacle1b, 68, 56, -0.5F, -0.5F, 0.0F, 1, 1, 4, 0.0F, false));

        this.tentacle1c = new AdvancedModelRenderer(this);
        this.tentacle1c.setRotationPoint(0.0F, 0.0F, 4.0F);
        this.tentacle1b.addChild(tentacle1c);
        this.setRotateAngle(tentacle1c, 0.0F, -0.1745F, 0.0F);
        this.tentacle1c.cubeList.add(new ModelBox(tentacle1c, 21, 39, 0.0F, -0.5F, 0.0F, 0, 1, 3, 0.0F, false));

        this.tentacle1d = new AdvancedModelRenderer(this);
        this.tentacle1d.setRotationPoint(0.0F, 0.0F, 3.0F);
        this.tentacle1c.addChild(tentacle1d);
        this.setRotateAngle(tentacle1d, 0.0F, 0.2182F, 0.0F);
        this.tentacle1d.cubeList.add(new ModelBox(tentacle1d, 21, 44, 0.0F, -0.5F, 0.0F, 0, 1, 3, 0.0F, false));

        this.tentacl6a = new AdvancedModelRenderer(this);
        this.tentacl6a.setRotationPoint(0.5F, 2.5F, 4.0F);
        this.mantle.addChild(tentacl6a);
        this.setRotateAngle(tentacl6a, -0.5679F, 0.0442F, -0.0282F);
        this.tentacl6a.cubeList.add(new ModelBox(tentacl6a, 52, 44, -0.5F, -0.5F, 0.0F, 1, 1, 4, 0.0F, true));

        this.tentacle6b = new AdvancedModelRenderer(this);
        this.tentacle6b.setRotationPoint(0.0F, 0.0F, 4.0F);
        this.tentacl6a.addChild(tentacle6b);
        this.setRotateAngle(tentacle6b, 0.0873F, 0.1745F, 0.0F);
        this.tentacle6b.cubeList.add(new ModelBox(tentacle6b, 68, 56, -0.5F, -0.5F, 0.0F, 1, 1, 4, 0.0F, true));

        this.tentacle6c = new AdvancedModelRenderer(this);
        this.tentacle6c.setRotationPoint(0.0F, 0.0F, 4.0F);
        this.tentacle6b.addChild(tentacle6c);
        this.setRotateAngle(tentacle6c, 0.0F, 0.1745F, 0.0F);
        this.tentacle6c.cubeList.add(new ModelBox(tentacle6c, 21, 39, 0.0F, -0.5F, 0.0F, 0, 1, 3, 0.0F, true));

        this.tentacle6d = new AdvancedModelRenderer(this);
        this.tentacle6d.setRotationPoint(0.0F, 0.0F, 3.0F);
        this.tentacle6c.addChild(tentacle6d);
        this.setRotateAngle(tentacle6d, 0.0F, -0.2182F, 0.0F);
        this.tentacle6d.cubeList.add(new ModelBox(tentacle6d, 21, 44, 0.0F, -0.5F, 0.0F, 0, 1, 3, 0.0F, true));

        this.tentacle2 = new AdvancedModelRenderer(this);
        this.tentacle2.setRotationPoint(-1.5F, 2.5F, 4.0F);
        this.mantle.addChild(tentacle2);
        this.setRotateAngle(tentacle2, -0.2242F, -0.3469F, -0.7653F);
        this.tentacle2.cubeList.add(new ModelBox(tentacle2, 0, 62, -0.5F, -0.5F, 0.0F, 1, 1, 4, 0.0F, false));

        this.tentacle7 = new AdvancedModelRenderer(this);
        this.tentacle7.setRotationPoint(1.5F, 2.5F, 4.0F);
        this.mantle.addChild(tentacle7);
        this.setRotateAngle(tentacle7, -0.2242F, 0.3469F, 0.7653F);
        this.tentacle7.cubeList.add(new ModelBox(tentacle7, 0, 62, -0.5F, -0.5F, 0.0F, 1, 1, 4, 0.0F, true));

        this.tentacle3 = new AdvancedModelRenderer(this);
        this.tentacle3.setRotationPoint(-1.5F, 1.5F, 4.0F);
        this.mantle.addChild(tentacle3);
        this.setRotateAngle(tentacle3, -0.3491F, 0.0F, 0.0F);
        this.tentacle3.cubeList.add(new ModelBox(tentacle3, 63, 44, -0.5F, -0.5F, 0.0F, 1, 1, 4, 0.0F, false));

        this.tentacle8 = new AdvancedModelRenderer(this);
        this.tentacle8.setRotationPoint(1.5F, 1.5F, 4.0F);
        this.mantle.addChild(tentacle8);
        this.setRotateAngle(tentacle8, -0.3491F, 0.0F, 0.0F);
        this.tentacle8.cubeList.add(new ModelBox(tentacle8, 63, 44, -0.5F, -0.5F, 0.0F, 1, 1, 4, 0.0F, true));

        this.tentacle4 = new AdvancedModelRenderer(this);
        this.tentacle4.setRotationPoint(-1.5F, 0.5F, 4.0F);
        this.mantle.addChild(tentacle4);
        this.setRotateAngle(tentacle4, -0.1795F, -0.1639F, -0.7252F);
        this.tentacle4.cubeList.add(new ModelBox(tentacle4, 63, 50, -0.5F, -0.5F, 0.0F, 1, 1, 4, 0.0F, false));

        this.tentacle9 = new AdvancedModelRenderer(this);
        this.tentacle9.setRotationPoint(1.5F, 0.5F, 4.0F);
        this.mantle.addChild(tentacle9);
        this.setRotateAngle(tentacle9, -0.1795F, 0.1639F, 0.7252F);
        this.tentacle9.cubeList.add(new ModelBox(tentacle9, 63, 50, -0.5F, -0.5F, 0.0F, 1, 1, 4, 0.0F, true));

        this.tentacle5 = new AdvancedModelRenderer(this);
        this.tentacle5.setRotationPoint(-0.5F, 0.5F, 4.0F);
        this.mantle.addChild(tentacle5);
        this.setRotateAngle(tentacle5, -0.2618F, 0.0F, 0.0F);
        this.tentacle5.cubeList.add(new ModelBox(tentacle5, 0, 68, -0.5F, -0.5F, 0.0F, 1, 1, 4, 0.0F, false));

        this.tentacle10 = new AdvancedModelRenderer(this);
        this.tentacle10.setRotationPoint(0.5F, 0.5F, 4.0F);
        this.mantle.addChild(tentacle10);
        this.setRotateAngle(tentacle10, -0.2618F, 0.0F, 0.0F);
        this.tentacle10.cubeList.add(new ModelBox(tentacle10, 0, 68, -0.5F, -0.5F, 0.0F, 1, 1, 4, 0.0F, true));

        this.shell2 = new AdvancedModelRenderer(this);
        this.shell2.setRotationPoint(0.0F, 17.303F, -15.0849F);
        this.shell.addChild(shell2);
        this.setRotateAngle(shell2, -0.9076F, 0.0F, 0.0F);
        this.shell2.cubeList.add(new ModelBox(shell2, 29, 26, -2.0F, -4.0F, -7.0F, 4, 4, 7, 0.01F, false));

        this.shell3 = new AdvancedModelRenderer(this);
        this.shell3.setRotationPoint(0.0F, 0.0F, -7.0F);
        this.shell2.addChild(shell3);
        this.setRotateAngle(shell3, -0.9294F, 0.0F, 0.0F);
        this.shell3.cubeList.add(new ModelBox(shell3, 29, 38, -2.0F, -4.0F, -7.0F, 4, 4, 7, 0.0F, false));

        this.shell4 = new AdvancedModelRenderer(this);
        this.shell4.setRotationPoint(0.0F, 0.0F, -7.0F);
        this.shell3.addChild(shell4);
        this.setRotateAngle(shell4, -0.7418F, 0.0F, 0.0F);
        this.shell4.cubeList.add(new ModelBox(shell4, 48, 0, -2.0F, -4.0F, -6.0F, 4, 4, 6, -0.01F, false));

        this.shell5 = new AdvancedModelRenderer(this);
        this.shell5.setRotationPoint(0.0F, 0.0F, -6.0F);
        this.shell4.addChild(shell5);
        this.setRotateAngle(shell5, -0.9163F, 0.0F, 0.0F);
        this.shell5.cubeList.add(new ModelBox(shell5, 21, 50, -2.0F, -4.0F, -6.0F, 4, 4, 6, -0.02F, false));

        this.shell6 = new AdvancedModelRenderer(this);
        this.shell6.setRotationPoint(0.0F, 0.0F, -6.0F);
        this.shell5.addChild(shell6);
        this.setRotateAngle(shell6, -0.4363F, 0.0F, 0.0F);
        this.shell6.cubeList.add(new ModelBox(shell6, 42, 50, -2.0F, -4.0F, -6.0F, 4, 4, 6, -0.04F, false));

        this.shell7 = new AdvancedModelRenderer(this);
        this.shell7.setRotationPoint(0.0F, -4.0F, -6.0F);
        this.shell6.addChild(shell7);
        this.setRotateAngle(shell7, 0.6981F, 0.0F, 0.0F);
        this.shell7.cubeList.add(new ModelBox(shell7, 0, 39, -1.5F, 0.0F, -7.0F, 3, 4, 7, 0.0F, false));

        this.shell8 = new AdvancedModelRenderer(this);
        this.shell8.setRotationPoint(0.0F, 0.0F, -7.0F);
        this.shell7.addChild(shell8);
        this.setRotateAngle(shell8, 0.6981F, 0.0F, 0.0F);
        this.shell8.cubeList.add(new ModelBox(shell8, 25, 0, -1.5F, 0.0F, -8.0F, 3, 4, 8, -0.01F, false));

        this.shell9 = new AdvancedModelRenderer(this);
        this.shell9.setRotationPoint(0.0F, 0.0F, -8.0F);
        this.shell8.addChild(shell9);
        this.setRotateAngle(shell9, 0.6981F, 0.0F, 0.0F);
        this.shell9.cubeList.add(new ModelBox(shell9, 29, 13, -1.5F, 0.0F, -8.0F, 3, 4, 8, -0.02F, false));

        this.shell10 = new AdvancedModelRenderer(this);
        this.shell10.setRotationPoint(0.0F, 0.0F, -8.0F);
        this.shell9.addChild(shell10);
        this.setRotateAngle(shell10, 0.8727F, 0.0F, 0.0F);
        this.shell10.cubeList.add(new ModelBox(shell10, 0, 51, -1.0F, 0.0F, -7.0F, 2, 3, 7, 0.02F, false));

        this.shell11 = new AdvancedModelRenderer(this);
        this.shell11.setRotationPoint(0.0F, 0.0F, -7.0F);
        this.shell10.addChild(shell11);
        this.setRotateAngle(shell11, 0.6981F, 0.0F, 0.0F);
        this.shell11.cubeList.add(new ModelBox(shell11, 52, 11, -1.0F, 0.0F, -7.0F, 2, 3, 7, 0.01F, false));

        this.shell12 = new AdvancedModelRenderer(this);
        this.shell12.setRotationPoint(0.0F, 0.0F, -7.0F);
        this.shell11.addChild(shell12);
        this.setRotateAngle(shell12, 0.7418F, 0.0F, 0.0F);
        this.shell12.cubeList.add(new ModelBox(shell12, 52, 22, -1.0F, 0.0F, -7.0F, 2, 3, 7, 0.0F, false));

        this.shell13 = new AdvancedModelRenderer(this);
        this.shell13.setRotationPoint(0.0F, 0.0F, -7.0F);
        this.shell12.addChild(shell13);
        this.setRotateAngle(shell13, 0.9599F, 0.0F, 0.0F);
        this.shell13.cubeList.add(new ModelBox(shell13, 52, 33, -1.0F, 0.0F, -7.0F, 2, 3, 7, -0.01F, false));

        this.shell14 = new AdvancedModelRenderer(this);
        this.shell14.setRotationPoint(0.0F, 0.0F, -7.0F);
        this.shell13.addChild(shell14);
        this.setRotateAngle(shell14, 0.9599F, 0.0F, 0.0F);
        this.shell14.cubeList.add(new ModelBox(shell14, 19, 61, -0.5F, 0.0F, -7.0F, 1, 3, 7, -0.02F, false));

        this.shell15 = new AdvancedModelRenderer(this);
        this.shell15.setRotationPoint(0.0F, 0.0F, -7.0F);
        this.shell14.addChild(shell15);
        this.setRotateAngle(shell15, 0.9599F, 0.0F, 0.0F);
        this.shell15.cubeList.add(new ModelBox(shell15, 36, 61, -0.5F, 0.0F, -7.0F, 1, 3, 7, -0.04F, false));

        this.shell16 = new AdvancedModelRenderer(this);
        this.shell16.setRotationPoint(0.0F, 0.0F, -7.0F);
        this.shell14.addChild(shell16);
        this.setRotateAngle(shell16, 0.9599F, 0.0F, 0.0F);
        this.shell16.cubeList.add(new ModelBox(shell16, 0, 0, 0.0F, 0.0F, -11.0F, 0, 11, 12, 0.0F, false));
        updateDefaultPose();
    }

    public void renderAll(float f) {
        this.resetToDefaultPose();
        this.base.offsetY = -1.4F;
        //this.Root.offsetZ = 1.0F;
        this.base.render(0.08f);
    }

    public void setRotateAngle(ModelRenderer modelRenderer, float x, float y, float z) {
        modelRenderer.rotateAngleX = x;
        modelRenderer.rotateAngleY = y;
        modelRenderer.rotateAngleZ = z;
    }

}
