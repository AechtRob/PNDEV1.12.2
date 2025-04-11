package net.lepidodendron.entity.model.tile;

import net.ilexiconn.llibrary.client.model.tools.AdvancedModelRenderer;
import net.lepidodendron.entity.model.llibraryextensions.AdvancedModelBaseExtended;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;

public class ModelCyclolobusShell extends AdvancedModelBaseExtended {
    private final AdvancedModelRenderer Root;
    private final AdvancedModelRenderer Shell1;
    private final AdvancedModelRenderer Shell2;
    private final AdvancedModelRenderer Shell3;
    private final AdvancedModelRenderer Shell4;
    private final AdvancedModelRenderer Shell5;
    private final AdvancedModelRenderer Shell6;
    private final AdvancedModelRenderer Shell7;
    private final AdvancedModelRenderer Shell8;
    private final AdvancedModelRenderer mantle;
    private final AdvancedModelRenderer eyeRight;
    private final AdvancedModelRenderer eyeLeft;
    private final AdvancedModelRenderer siphon;
    private final AdvancedModelRenderer Tentacle1a;
    private final AdvancedModelRenderer Tentacle1b;
    private final AdvancedModelRenderer Tentacle1c;
    private final AdvancedModelRenderer Tentacle2a;
    private final AdvancedModelRenderer Tentacle2b;
    private final AdvancedModelRenderer Tentacle2c;
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
    private final AdvancedModelRenderer Tentacle8a;
    private final AdvancedModelRenderer Tentacle8b;
    private final AdvancedModelRenderer Tentacle8c;
    private final AdvancedModelRenderer Tentacle9a;
    private final AdvancedModelRenderer Tentacle9b;
    private final AdvancedModelRenderer Tentacle9c;
    private final AdvancedModelRenderer Tentacle10a;
    private final AdvancedModelRenderer Tentacle10b;
    private final AdvancedModelRenderer Tentacle10c;

    public ModelCyclolobusShell() {
        this.textureWidth = 64;
        this.textureHeight = 64;

        this.Root = new AdvancedModelRenderer(this);
        this.Root.setRotationPoint(0.0F, 24.0F, 0.0F);


        this.Shell1 = new AdvancedModelRenderer(this);
        this.Shell1.setRotationPoint(0.0F, -3.625F, 6.0F);
        this.Root.addChild(Shell1);
        this.setRotateAngle(Shell1, 0.5672F, 0.0F, 0.0F);
        this.Shell1.cubeList.add(new ModelBox(Shell1, 0, 16, -3.0F, -9.0F, -7.0F, 6, 9, 7, 0.01F, false));

        this.Shell2 = new AdvancedModelRenderer(this);
        this.Shell2.setRotationPoint(0.0F, 0.0F, -7.0F);
        this.Shell1.addChild(Shell2);
        this.setRotateAngle(Shell2, -0.6545F, 0.0F, 0.0F);
        this.Shell2.cubeList.add(new ModelBox(Shell2, 0, 0, -3.0F, -9.0F, -7.0F, 6, 9, 7, 0.0F, false));

        this.Shell3 = new AdvancedModelRenderer(this);
        this.Shell3.setRotationPoint(0.0F, 0.0F, -7.0F);
        this.Shell2.addChild(Shell3);
        this.setRotateAngle(Shell3, -0.8727F, 0.0F, 0.0F);
        this.Shell3.cubeList.add(new ModelBox(Shell3, 19, 25, -2.5F, -8.0F, -7.0F, 5, 8, 7, 0.01F, false));

        this.Shell4 = new AdvancedModelRenderer(this);
        this.Shell4.setRotationPoint(0.0F, 0.0F, -7.0F);
        this.Shell3.addChild(Shell4);
        this.setRotateAngle(Shell4, -0.7854F, 0.0F, 0.0F);
        this.Shell4.cubeList.add(new ModelBox(Shell4, 19, 9, -2.5F, -7.0F, -7.0F, 5, 7, 7, 0.0F, false));

        this.Shell5 = new AdvancedModelRenderer(this);
        this.Shell5.setRotationPoint(0.0F, 0.0F, -7.0F);
        this.Shell4.addChild(Shell5);
        this.setRotateAngle(Shell5, -0.8858F, 0.0F, 0.0F);
        this.Shell5.cubeList.add(new ModelBox(Shell5, 36, 0, -2.0F, -7.0F, -6.0F, 4, 7, 6, 0.01F, false));

        this.Shell6 = new AdvancedModelRenderer(this);
        this.Shell6.setRotationPoint(0.0F, 0.0F, -6.0F);
        this.Shell5.addChild(Shell6);
        this.setRotateAngle(Shell6, -0.7898F, 0.0F, 0.0F);
        this.Shell6.cubeList.add(new ModelBox(Shell6, 38, 18, -2.0F, -7.0F, -5.0F, 4, 7, 5, 0.0F, false));

        this.Shell7 = new AdvancedModelRenderer(this);
        this.Shell7.setRotationPoint(0.0F, 0.0F, -5.0F);
        this.Shell6.addChild(Shell7);
        this.setRotateAngle(Shell7, -0.877F, 0.0F, 0.0F);
        this.Shell7.cubeList.add(new ModelBox(Shell7, 39, 36, -1.5F, -4.0F, -4.0F, 3, 4, 4, 0.01F, false));

        this.Shell8 = new AdvancedModelRenderer(this);
        this.Shell8.setRotationPoint(0.0F, 0.0F, -4.0F);
        this.Shell7.addChild(Shell8);
        this.setRotateAngle(Shell8, -0.3534F, 0.0F, 0.0F);
        this.Shell8.cubeList.add(new ModelBox(Shell8, 19, 5, -1.5F, -1.0F, -1.0F, 3, 1, 1, 0.0F, false));

        this.mantle = new AdvancedModelRenderer(this);
        this.mantle.setRotationPoint(0.0F, -9.85F, 1.925F);
        this.Root.addChild(mantle);
        this.mantle.cubeList.add(new ModelBox(mantle, 0, 34, -2.5F, 0.0F, 0.0F, 5, 5, 6, 0.0F, false));

        this.eyeRight = new AdvancedModelRenderer(this);
        this.eyeRight.setRotationPoint(2.7F, 1.45F, 2.775F);
        this.mantle.addChild(eyeRight);
        this.setRotateAngle(eyeRight, 0.5642F, 0.5789F, 0.1552F);
        this.eyeRight.cubeList.add(new ModelBox(eyeRight, 49, 36, -1.0F, -1.0F, -1.0F, 3, 2, 2, 0.0F, false));
        this.eyeRight.cubeList.add(new ModelBox(eyeRight, 0, 2, 1.025F, -0.5F, -0.5F, 1, 1, 1, 0.0F, false));

        this.eyeLeft = new AdvancedModelRenderer(this);
        this.eyeLeft.setRotationPoint(-2.7F, 1.45F, 2.775F);
        this.mantle.addChild(eyeLeft);
        this.setRotateAngle(eyeLeft, 0.5642F, -0.5789F, -0.1552F);
        this.eyeLeft.cubeList.add(new ModelBox(eyeLeft, 49, 13, -2.0F, -1.0F, -1.0F, 3, 2, 2, 0.0F, false));
        this.eyeLeft.cubeList.add(new ModelBox(eyeLeft, 0, 0, -2.025F, -0.5F, -0.5F, 1, 1, 1, 0.0F, false));

        this.siphon = new AdvancedModelRenderer(this);
        this.siphon.setRotationPoint(0.0F, 4.8658F, 4.0908F);
        this.mantle.addChild(siphon);
        this.setRotateAngle(siphon, -0.3054F, 0.0F, 0.0F);
        this.siphon.cubeList.add(new ModelBox(siphon, 19, 0, -1.5F, -1.025F, -1.0F, 3, 2, 3, -0.01F, false));

        this.Tentacle1a = new AdvancedModelRenderer(this);
        this.Tentacle1a.setRotationPoint(-0.4F, 3.8753F, 5.413F);
        this.mantle.addChild(Tentacle1a);
        this.setRotateAngle(Tentacle1a, -0.2182F, 0.0F, 0.0F);
        this.Tentacle1a.cubeList.add(new ModelBox(Tentacle1a, 30, 45, -0.6F, -0.5F, 0.0F, 1, 1, 4, 0.0F, false));

        this.Tentacle1b = new AdvancedModelRenderer(this);
        this.Tentacle1b.setRotationPoint(0.0F, 0.0F, 3.5F);
        this.Tentacle1a.addChild(Tentacle1b);
        this.setRotateAngle(Tentacle1b, -0.4363F, 0.004F, -0.0018F);
        this.Tentacle1b.cubeList.add(new ModelBox(Tentacle1b, 42, 50, -0.6F, -0.5F, 0.0F, 1, 1, 4, 0.0F, false));

        this.Tentacle1c = new AdvancedModelRenderer(this);
        this.Tentacle1c.setRotationPoint(0.0F, 0.0F, 3.5F);
        this.Tentacle1b.addChild(Tentacle1c);
        this.setRotateAngle(Tentacle1c, -0.3493F, -0.0328F, 0.0119F);
        this.Tentacle1c.cubeList.add(new ModelBox(Tentacle1c, 48, 50, -0.6F, -0.5F, 0.0F, 1, 1, 3, 0.0F, false));

        this.Tentacle2a = new AdvancedModelRenderer(this);
        this.Tentacle2a.setRotationPoint(-1.65F, 3.8753F, 5.413F);
        this.mantle.addChild(Tentacle2a);
        this.setRotateAngle(Tentacle2a, -0.0567F, 0.0524F, -0.9163F);
        this.Tentacle2a.cubeList.add(new ModelBox(Tentacle2a, 20, 45, -0.6F, -0.5F, 0.0F, 1, 1, 4, 0.0F, false));

        this.Tentacle2b = new AdvancedModelRenderer(this);
        this.Tentacle2b.setRotationPoint(0.0F, 0.0F, 3.5F);
        this.Tentacle2a.addChild(Tentacle2b);
        this.setRotateAngle(Tentacle2b, -0.2668F, -0.4348F, 0.0124F);
        this.Tentacle2b.cubeList.add(new ModelBox(Tentacle2b, 30, 50, -0.6F, -0.5F, 0.0F, 1, 1, 4, 0.0F, false));

        this.Tentacle2c = new AdvancedModelRenderer(this);
        this.Tentacle2c.setRotationPoint(0.0F, 0.0F, 3.5F);
        this.Tentacle2b.addChild(Tentacle2c);
        this.setRotateAngle(Tentacle2c, -0.3229F, -0.2923F, 0.0F);
        this.Tentacle2c.cubeList.add(new ModelBox(Tentacle2c, 50, 45, -0.6F, -0.5F, 0.0F, 1, 1, 3, 0.0F, false));

        this.Tentacle3a = new AdvancedModelRenderer(this);
        this.Tentacle3a.setRotationPoint(-1.65F, 2.2253F, 5.413F);
        this.mantle.addChild(Tentacle3a);
        this.setRotateAngle(Tentacle3a, -0.201F, -0.0602F, 0.0106F);
        this.Tentacle3a.cubeList.add(new ModelBox(Tentacle3a, 10, 45, -0.6F, -0.5F, 0.0F, 1, 1, 4, 0.0F, false));

        this.Tentacle3b = new AdvancedModelRenderer(this);
        this.Tentacle3b.setRotationPoint(0.0F, 0.0F, 3.5F);
        this.Tentacle3a.addChild(Tentacle3b);
        this.setRotateAngle(Tentacle3b, -0.2269F, 0.1745F, 0.0F);
        this.Tentacle3b.cubeList.add(new ModelBox(Tentacle3b, 20, 50, -0.6F, -0.5F, 0.0F, 1, 1, 4, 0.0F, false));

        this.Tentacle3c = new AdvancedModelRenderer(this);
        this.Tentacle3c.setRotationPoint(0.0F, 0.0F, 3.5F);
        this.Tentacle3b.addChild(Tentacle3c);
        this.setRotateAngle(Tentacle3c, -0.2923F, -0.0042F, 0.0013F);
        this.Tentacle3c.cubeList.add(new ModelBox(Tentacle3c, 26, 50, -0.6F, -0.5F, 0.0F, 1, 1, 3, 0.0F, false));

        this.Tentacle4a = new AdvancedModelRenderer(this);
        this.Tentacle4a.setRotationPoint(-1.65F, 0.5503F, 5.413F);
        this.mantle.addChild(Tentacle4a);
        this.setRotateAngle(Tentacle4a, -0.2443F, -0.1458F, -0.5959F);
        this.Tentacle4a.cubeList.add(new ModelBox(Tentacle4a, 0, 45, -0.6F, -0.5F, 0.0F, 1, 1, 4, 0.0F, false));

        this.Tentacle4b = new AdvancedModelRenderer(this);
        this.Tentacle4b.setRotationPoint(0.0F, 0.0F, 3.5F);
        this.Tentacle4a.addChild(Tentacle4b);
        this.setRotateAngle(Tentacle4b, -0.1182F, -0.078F, 0.0093F);
        this.Tentacle4b.cubeList.add(new ModelBox(Tentacle4b, 10, 50, -0.6F, -0.5F, 0.0F, 1, 1, 4, 0.0F, false));

        this.Tentacle4c = new AdvancedModelRenderer(this);
        this.Tentacle4c.setRotationPoint(0.0F, 0.0F, 3.5F);
        this.Tentacle4b.addChild(Tentacle4c);
        this.setRotateAngle(Tentacle4c, -0.24F, 0.0F, 0.0F);
        this.Tentacle4c.cubeList.add(new ModelBox(Tentacle4c, 16, 50, -0.6F, -0.5F, 0.0F, 1, 1, 3, 0.0F, false));

        this.Tentacle5a = new AdvancedModelRenderer(this);
        this.Tentacle5a.setRotationPoint(-0.475F, 0.5503F, 5.413F);
        this.mantle.addChild(Tentacle5a);
        this.setRotateAngle(Tentacle5a, -0.2182F, 0.0F, 0.0F);
        this.Tentacle5a.cubeList.add(new ModelBox(Tentacle5a, 38, 44, -0.6F, -0.5F, 0.0F, 1, 1, 4, 0.0F, false));

        this.Tentacle5b = new AdvancedModelRenderer(this);
        this.Tentacle5b.setRotationPoint(0.0F, 0.0F, 3.5F);
        this.Tentacle5a.addChild(Tentacle5b);
        this.setRotateAngle(Tentacle5b, -0.0785F, 0.0088F, 0.0007F);
        this.Tentacle5b.cubeList.add(new ModelBox(Tentacle5b, 50, 0, -0.6F, -0.5F, 0.0F, 1, 1, 4, 0.0F, false));

        this.Tentacle5c = new AdvancedModelRenderer(this);
        this.Tentacle5c.setRotationPoint(0.0F, 0.0F, 3.5F);
        this.Tentacle5b.addChild(Tentacle5c);
        this.setRotateAngle(Tentacle5c, -0.1354F, -0.0295F, 0.008F);
        this.Tentacle5c.cubeList.add(new ModelBox(Tentacle5c, 6, 50, -0.6F, -0.5F, 0.0F, 1, 1, 3, 0.0F, false));

        this.Tentacle6a = new AdvancedModelRenderer(this);
        this.Tentacle6a.setRotationPoint(0.4F, 3.8753F, 5.413F);
        this.mantle.addChild(Tentacle6a);
        this.setRotateAngle(Tentacle6a, -0.2182F, 0.0F, 0.0F);
        this.Tentacle6a.cubeList.add(new ModelBox(Tentacle6a, 43, 30, -0.4F, -0.5F, 0.0F, 1, 1, 4, 0.0F, false));

        this.Tentacle6b = new AdvancedModelRenderer(this);
        this.Tentacle6b.setRotationPoint(0.0F, 0.0F, 3.5F);
        this.Tentacle6a.addChild(Tentacle6b);
        this.setRotateAngle(Tentacle6b, -0.4363F, -0.004F, 0.0018F);
        this.Tentacle6b.cubeList.add(new ModelBox(Tentacle6b, 0, 50, -0.4F, -0.5F, 0.0F, 1, 1, 4, 0.0F, false));

        this.Tentacle6c = new AdvancedModelRenderer(this);
        this.Tentacle6c.setRotationPoint(0.0F, 0.0F, 3.5F);
        this.Tentacle6b.addChild(Tentacle6c);
        this.setRotateAngle(Tentacle6c, -0.3493F, 0.0328F, -0.0119F);
        this.Tentacle6c.cubeList.add(new ModelBox(Tentacle6c, 26, 45, -0.4F, -0.5F, 0.0F, 1, 1, 3, 0.0F, false));

        this.Tentacle7a = new AdvancedModelRenderer(this);
        this.Tentacle7a.setRotationPoint(1.65F, 3.8753F, 5.413F);
        this.mantle.addChild(Tentacle7a);
        this.setRotateAngle(Tentacle7a, -0.0567F, -0.0524F, 0.9163F);
        this.Tentacle7a.cubeList.add(new ModelBox(Tentacle7a, 43, 13, -0.4F, -0.5F, 0.0F, 1, 1, 4, 0.0F, false));

        this.Tentacle7b = new AdvancedModelRenderer(this);
        this.Tentacle7b.setRotationPoint(0.0F, 0.0F, 3.5F);
        this.Tentacle7a.addChild(Tentacle7b);
        this.setRotateAngle(Tentacle7b, -0.2668F, 0.4348F, -0.0124F);
        this.Tentacle7b.cubeList.add(new ModelBox(Tentacle7b, 49, 40, -0.4F, -0.5F, 0.0F, 1, 1, 4, 0.0F, false));

        this.Tentacle7c = new AdvancedModelRenderer(this);
        this.Tentacle7c.setRotationPoint(0.0F, 0.0F, 3.5F);
        this.Tentacle7b.addChild(Tentacle7c);
        this.setRotateAngle(Tentacle7c, -0.3229F, 0.2923F, 0.0F);
        this.Tentacle7c.cubeList.add(new ModelBox(Tentacle7c, 16, 45, -0.4F, -0.5F, 0.0F, 1, 1, 3, 0.0F, false));

        this.Tentacle8a = new AdvancedModelRenderer(this);
        this.Tentacle8a.setRotationPoint(1.65F, 2.2253F, 5.413F);
        this.mantle.addChild(Tentacle8a);
        this.setRotateAngle(Tentacle8a, -0.201F, 0.0602F, -0.0106F);
        this.Tentacle8a.cubeList.add(new ModelBox(Tentacle8a, 32, 40, -0.4F, -0.5F, 0.0F, 1, 1, 4, 0.0F, false));

        this.Tentacle8b = new AdvancedModelRenderer(this);
        this.Tentacle8b.setRotationPoint(0.0F, 0.0F, 3.5F);
        this.Tentacle8a.addChild(Tentacle8b);
        this.setRotateAngle(Tentacle8b, -0.2269F, -0.1745F, 0.0F);
        this.Tentacle8b.cubeList.add(new ModelBox(Tentacle8b, 36, 49, -0.4F, -0.5F, 0.0F, 1, 1, 4, 0.0F, false));

        this.Tentacle8c = new AdvancedModelRenderer(this);
        this.Tentacle8c.setRotationPoint(0.0F, 0.0F, 3.5F);
        this.Tentacle8b.addChild(Tentacle8c);
        this.setRotateAngle(Tentacle8c, -0.2923F, 0.0042F, -0.0013F);
        this.Tentacle8c.cubeList.add(new ModelBox(Tentacle8c, 6, 45, -0.4F, -0.5F, 0.0F, 1, 1, 3, 0.0F, false));

        this.Tentacle9a = new AdvancedModelRenderer(this);
        this.Tentacle9a.setRotationPoint(1.65F, 0.5503F, 5.413F);
        this.mantle.addChild(Tentacle9a);
        this.setRotateAngle(Tentacle9a, -0.2443F, 0.1458F, 0.5959F);
        this.Tentacle9a.cubeList.add(new ModelBox(Tentacle9a, 22, 40, -0.4F, -0.5F, 0.0F, 1, 1, 4, 0.0F, false));

        this.Tentacle9b = new AdvancedModelRenderer(this);
        this.Tentacle9b.setRotationPoint(0.0F, 0.0F, 3.5F);
        this.Tentacle9a.addChild(Tentacle9b);
        this.setRotateAngle(Tentacle9b, -0.1182F, 0.078F, -0.0093F);
        this.Tentacle9b.cubeList.add(new ModelBox(Tentacle9b, 49, 31, -0.4F, -0.5F, 0.0F, 1, 1, 4, 0.0F, false));

        this.Tentacle9c = new AdvancedModelRenderer(this);
        this.Tentacle9c.setRotationPoint(0.0F, 0.0F, 3.5F);
        this.Tentacle9b.addChild(Tentacle9c);
        this.setRotateAngle(Tentacle9c, -0.24F, 0.0F, 0.0F);
        this.Tentacle9c.cubeList.add(new ModelBox(Tentacle9c, 28, 40, -0.4F, -0.5F, 0.0F, 1, 1, 3, 0.0F, false));

        this.Tentacle10a = new AdvancedModelRenderer(this);
        this.Tentacle10a.setRotationPoint(0.475F, 0.5503F, 5.413F);
        this.mantle.addChild(Tentacle10a);
        this.setRotateAngle(Tentacle10a, -0.2182F, 0.0F, 0.0F);
        this.Tentacle10a.cubeList.add(new ModelBox(Tentacle10a, 27, 1, -0.4F, -0.5F, 0.0F, 1, 1, 4, 0.0F, false));

        this.Tentacle10b = new AdvancedModelRenderer(this);
        this.Tentacle10b.setRotationPoint(0.0F, 0.0F, 3.5F);
        this.Tentacle10a.addChild(Tentacle10b);
        this.setRotateAngle(Tentacle10b, -0.0785F, -0.0088F, -0.0007F);
        this.Tentacle10b.cubeList.add(new ModelBox(Tentacle10b, 44, 45, -0.4F, -0.5F, 0.0F, 1, 1, 4, 0.0F, false));

        this.Tentacle10c = new AdvancedModelRenderer(this);
        this.Tentacle10c.setRotationPoint(0.0F, 0.0F, 3.5F);
        this.Tentacle10b.addChild(Tentacle10c);
        this.setRotateAngle(Tentacle10c, -0.1354F, 0.0295F, -0.008F);
        this.Tentacle10c.cubeList.add(new ModelBox(Tentacle10c, 33, 0, -0.4F, -0.5F, 0.0F, 1, 1, 3, 0.0F, false));
        updateDefaultPose();
    }

    public void renderAll(float f) {
        this.resetToDefaultPose();
        this.Root.offsetY = -1F;
        this.Root.render(0.08f);
    }

    public void setRotateAngle(ModelRenderer modelRenderer, float x, float y, float z) {
        modelRenderer.rotateAngleX = x;
        modelRenderer.rotateAngleY = y;
        modelRenderer.rotateAngleZ = z;
    }

}
