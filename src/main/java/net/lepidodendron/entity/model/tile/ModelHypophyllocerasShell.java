package net.lepidodendron.entity.model.tile;

import net.ilexiconn.llibrary.client.model.tools.AdvancedModelRenderer;
import net.lepidodendron.entity.model.llibraryextensions.AdvancedModelBaseExtended;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;

public class ModelHypophyllocerasShell extends AdvancedModelBaseExtended {
    private final AdvancedModelRenderer root;
    private final AdvancedModelRenderer Shell1;
    private final AdvancedModelRenderer Shell2;
    private final AdvancedModelRenderer Shell3;
    private final AdvancedModelRenderer Shell4;
    private final AdvancedModelRenderer Shell5;
    private final AdvancedModelRenderer Shell6;
    private final AdvancedModelRenderer Shell7;
    private final AdvancedModelRenderer Shell8;
    private final AdvancedModelRenderer Shell9;
    private final AdvancedModelRenderer Mantle;
    private final AdvancedModelRenderer Mantle_r1;
    private final AdvancedModelRenderer Mantle_r2;
    private final AdvancedModelRenderer Siphon;
    private final AdvancedModelRenderer arm1a;
    private final AdvancedModelRenderer arm1b;
    private final AdvancedModelRenderer arm6a;
    private final AdvancedModelRenderer arm6b;
    private final AdvancedModelRenderer arm2a;
    private final AdvancedModelRenderer arm2b;
    private final AdvancedModelRenderer arm7a;
    private final AdvancedModelRenderer arm7b;
    private final AdvancedModelRenderer arm3a;
    private final AdvancedModelRenderer arm3b;
    private final AdvancedModelRenderer arm8a;
    private final AdvancedModelRenderer arm8b;
    private final AdvancedModelRenderer arm4a;
    private final AdvancedModelRenderer arm4b;
    private final AdvancedModelRenderer arm9a;
    private final AdvancedModelRenderer arm9b;
    private final AdvancedModelRenderer arm5a;
    private final AdvancedModelRenderer arm5b;
    private final AdvancedModelRenderer arm5b2;
    private final AdvancedModelRenderer arm5b3;
    private final AdvancedModelRenderer arm5a2;
    private final AdvancedModelRenderer arm5b4;
    private final AdvancedModelRenderer arm5b5;
    private final AdvancedModelRenderer arm5b6;
    private final AdvancedModelRenderer Shellbase;

    public ModelHypophyllocerasShell() {
        this.textureWidth = 64;
        this.textureHeight = 64;

        this.root = new AdvancedModelRenderer(this);
        this.root.setRotationPoint(0.0F, 19.0F, 0.0F);


        this.Shell1 = new AdvancedModelRenderer(this);
        this.Shell1.setRotationPoint(0.0F, 2.5F, 0.5F);
        this.root.addChild(Shell1);
        this.setRotateAngle(Shell1, 1.2984F, 0.0F, 0.0F);
        this.Shell1.cubeList.add(new ModelBox(Shell1, 0, 31, -2.5F, -3.175F, 3.0F, 5, 8, 3, 0.01F, false));

        this.Shell2 = new AdvancedModelRenderer(this);
        this.Shell2.setRotationPoint(-0.01F, 4.85F, 3.0F);
        this.Shell1.addChild(Shell2);
        this.setRotateAngle(Shell2, -0.6109F, 0.0F, 0.0F);
        this.Shell2.cubeList.add(new ModelBox(Shell2, 0, 13, -2.49F, -8.0F, -5.0F, 5, 8, 5, 0.0F, false));

        this.Shell3 = new AdvancedModelRenderer(this);
        this.Shell3.setRotationPoint(0.0F, 0.0F, -5.0F);
        this.Shell2.addChild(Shell3);
        this.setRotateAngle(Shell3, -0.6981F, 0.0F, 0.0F);
        this.Shell3.cubeList.add(new ModelBox(Shell3, 0, 0, -1.99F, -7.0F, -6.0F, 4, 7, 6, -0.01F, false));

        this.Shell4 = new AdvancedModelRenderer(this);
        this.Shell4.setRotationPoint(0.0F, 0.0F, -6.0F);
        this.Shell3.addChild(Shell4);
        this.setRotateAngle(Shell4, -0.6545F, 0.0F, 0.0F);
        this.Shell4.cubeList.add(new ModelBox(Shell4, 20, 12, -1.99F, -7.0F, -5.0F, 4, 7, 5, 0.01F, false));

        this.Shell5 = new AdvancedModelRenderer(this);
        this.Shell5.setRotationPoint(0.0F, 0.0F, -5.0F);
        this.Shell4.addChild(Shell5);
        this.setRotateAngle(Shell5, -0.8727F, 0.0F, 0.0F);
        this.Shell5.cubeList.add(new ModelBox(Shell5, 20, 0, -1.49F, -6.0F, -6.0F, 3, 6, 6, 0.0F, false));

        this.Shell6 = new AdvancedModelRenderer(this);
        this.Shell6.setRotationPoint(0.0F, 0.0F, -6.0F);
        this.Shell5.addChild(Shell6);
        this.setRotateAngle(Shell6, -0.7854F, 0.0F, 0.0F);
        this.Shell6.cubeList.add(new ModelBox(Shell6, 29, 30, -1.49F, -6.0F, -4.0F, 3, 6, 4, -0.01F, false));

        this.Shell7 = new AdvancedModelRenderer(this);
        this.Shell7.setRotationPoint(0.0F, 0.0F, -4.0F);
        this.Shell6.addChild(Shell7);
        this.setRotateAngle(Shell7, -0.8727F, 0.0F, 0.0F);
        this.Shell7.cubeList.add(new ModelBox(Shell7, 33, 7, -0.99F, -4.0F, -5.0F, 2, 4, 5, 0.01F, false));

        this.Shell8 = new AdvancedModelRenderer(this);
        this.Shell8.setRotationPoint(0.0F, 0.0F, -5.0F);
        this.Shell7.addChild(Shell8);
        this.setRotateAngle(Shell8, -1.0036F, 0.0F, 0.0F);
        this.Shell8.cubeList.add(new ModelBox(Shell8, 51, 38, -0.99F, -4.0F, -3.0F, 2, 4, 3, 0.0F, false));

        this.Shell9 = new AdvancedModelRenderer(this);
        this.Shell9.setRotationPoint(0.0F, 0.0F, -3.0F);
        this.Shell8.addChild(Shell9);
        this.setRotateAngle(Shell9, -0.5236F, 0.0F, 0.0F);
        this.Shell9.cubeList.add(new ModelBox(Shell9, 51, 14, -0.99F, -4.0F, -3.0F, 2, 4, 3, -0.01F, false));

        this.Mantle = new AdvancedModelRenderer(this);
        this.Mantle.setRotationPoint(0.0F, -1.65F, 6.05F);
        this.Shell1.addChild(Mantle);
        this.setRotateAngle(Mantle, -0.691F, 0.0F, 0.0F);
        this.Mantle.cubeList.add(new ModelBox(Mantle, 15, 24, -2.0F, 0.0F, -1.0F, 4, 5, 5, 0.0F, false));

        this.Mantle_r1 = new AdvancedModelRenderer(this);
        this.Mantle_r1.setRotationPoint(-2.8F, 1.225F, 2.575F);
        this.Mantle.addChild(Mantle_r1);
        this.setRotateAngle(Mantle_r1, 0.0464F, -0.3487F, -0.0159F);
        this.Mantle_r1.cubeList.add(new ModelBox(Mantle_r1, 15, 13, -0.7F, -1.0F, -1.0F, 2, 2, 2, 0.0F, true));
        this.Mantle_r1.cubeList.add(new ModelBox(Mantle_r1, 0, 0, -0.8F, -0.5F, -0.5F, 1, 1, 1, 0.0F, true));

        this.Mantle_r2 = new AdvancedModelRenderer(this);
        this.Mantle_r2.setRotationPoint(2.8F, 1.225F, 2.575F);
        this.Mantle.addChild(Mantle_r2);
        this.setRotateAngle(Mantle_r2, 0.0464F, 0.3487F, 0.0159F);
        this.Mantle_r2.cubeList.add(new ModelBox(Mantle_r2, 0, 0, -0.2F, -0.5F, -0.5F, 1, 1, 1, 0.0F, false));
        this.Mantle_r2.cubeList.add(new ModelBox(Mantle_r2, 15, 13, -1.3F, -1.0F, -1.0F, 2, 2, 2, 0.0F, false));

        this.Siphon = new AdvancedModelRenderer(this);
        this.Siphon.setRotationPoint(0.0F, 2.9F, 0.0F);
        this.Mantle.addChild(Siphon);
        this.setRotateAngle(Siphon, -0.2122F, 0.0F, 0.0F);
        this.Siphon.cubeList.add(new ModelBox(Siphon, 33, 19, -1.0F, 0.0F, 0.0F, 2, 2, 5, 0.0F, false));

        this.arm1a = new AdvancedModelRenderer(this);
        this.arm1a.setRotationPoint(-0.65F, 0.5F, 3.5F);
        this.Mantle.addChild(arm1a);
        this.setRotateAngle(arm1a, -0.2913F, -0.1321F, 0.0F);
        this.arm1a.cubeList.add(new ModelBox(arm1a, 33, 48, -0.5F, -0.5F, 0.0F, 1, 1, 5, 0.0F, false));

        this.arm1b = new AdvancedModelRenderer(this);
        this.arm1b.setRotationPoint(0.0F, 0.0F, 4.5F);
        this.arm1a.addChild(arm1b);
        this.setRotateAngle(arm1b, -0.2335F, 0.1061F, 0.0F);
        this.arm1b.cubeList.add(new ModelBox(arm1b, 49, 6, -0.5F, -0.5F, 0.0F, 1, 1, 5, 0.0F, false));

        this.arm6a = new AdvancedModelRenderer(this);
        this.arm6a.setRotationPoint(0.65F, 0.5F, 3.5F);
        this.Mantle.addChild(arm6a);
        this.setRotateAngle(arm6a, -0.2913F, 0.1321F, 0.0F);
        this.arm6a.cubeList.add(new ModelBox(arm6a, 37, 42, -0.5F, -0.5F, 0.0F, 1, 1, 5, 0.0F, false));

        this.arm6b = new AdvancedModelRenderer(this);
        this.arm6b.setRotationPoint(0.0F, 0.0F, 4.5F);
        this.arm6a.addChild(arm6b);
        this.setRotateAngle(arm6b, -0.2335F, -0.1061F, 0.0F);
        this.arm6b.cubeList.add(new ModelBox(arm6b, 44, 41, -0.5F, -0.5F, 0.0F, 1, 1, 5, 0.0F, false));

        this.arm2a = new AdvancedModelRenderer(this);
        this.arm2a.setRotationPoint(-1.15F, 1.25F, 3.5F);
        this.Mantle.addChild(arm2a);
        this.setRotateAngle(arm2a, -0.3786F, -0.1758F, 0.0F);
        this.arm2a.cubeList.add(new ModelBox(arm2a, 44, 47, -0.5F, -0.5F, 0.0F, 1, 1, 5, 0.0F, false));

        this.arm2b = new AdvancedModelRenderer(this);
        this.arm2b.setRotationPoint(0.0F, 0.0F, 4.5F);
        this.arm2a.addChild(arm2b);
        this.setRotateAngle(arm2b, -0.2335F, 0.1061F, 0.0F);
        this.arm2b.cubeList.add(new ModelBox(arm2b, 0, 48, -0.5F, -0.5F, 0.0F, 1, 1, 5, 0.0F, false));

        this.arm7a = new AdvancedModelRenderer(this);
        this.arm7a.setRotationPoint(1.15F, 1.25F, 3.5F);
        this.Mantle.addChild(arm7a);
        this.setRotateAngle(arm7a, -0.3786F, 0.1758F, 0.0F);
        this.arm7a.cubeList.add(new ModelBox(arm7a, 42, 11, -0.5F, -0.5F, 0.0F, 1, 1, 5, 0.0F, false));

        this.arm7b = new AdvancedModelRenderer(this);
        this.arm7b.setRotationPoint(0.0F, 0.0F, 4.5F);
        this.arm7a.addChild(arm7b);
        this.setRotateAngle(arm7b, -0.2335F, -0.1061F, 0.0F);
        this.arm7b.cubeList.add(new ModelBox(arm7b, 42, 17, -0.5F, -0.5F, 0.0F, 1, 1, 5, 0.0F, false));

        this.arm3a = new AdvancedModelRenderer(this);
        this.arm3a.setRotationPoint(-1.4F, 2.0F, 3.5F);
        this.Mantle.addChild(arm3a);
        this.setRotateAngle(arm3a, -0.4658F, -0.2194F, 0.0F);
        this.arm3a.cubeList.add(new ModelBox(arm3a, 46, 23, -0.5F, -0.5F, 0.0F, 1, 1, 5, 0.0F, false));

        this.arm3b = new AdvancedModelRenderer(this);
        this.arm3b.setRotationPoint(0.0F, 0.0F, 4.5F);
        this.arm3a.addChild(arm3b);
        this.setRotateAngle(arm3b, -0.2335F, 0.1061F, 0.0F);
        this.arm3b.cubeList.add(new ModelBox(arm3b, 26, 47, -0.5F, -0.5F, 0.0F, 1, 1, 5, 0.0F, false));

        this.arm8a = new AdvancedModelRenderer(this);
        this.arm8a.setRotationPoint(1.4F, 2.0F, 3.5F);
        this.Mantle.addChild(arm8a);
        this.setRotateAngle(arm8a, -0.4658F, 0.2194F, 0.0F);
        this.arm8a.cubeList.add(new ModelBox(arm8a, 30, 41, -0.5F, -0.5F, 0.0F, 1, 1, 5, 0.0F, false));

        this.arm8b = new AdvancedModelRenderer(this);
        this.arm8b.setRotationPoint(0.0F, 0.0F, 4.5F);
        this.arm8a.addChild(arm8b);
        this.setRotateAngle(arm8b, -0.2335F, -0.1061F, 0.0F);
        this.arm8b.cubeList.add(new ModelBox(arm8b, 0, 42, -0.5F, -0.5F, 0.0F, 1, 1, 5, 0.0F, false));

        this.arm4a = new AdvancedModelRenderer(this);
        this.arm4a.setRotationPoint(-1.15F, 2.5F, 3.0F);
        this.Mantle.addChild(arm4a);
        this.setRotateAngle(arm4a, -0.5531F, -0.2194F, 0.0F);
        this.arm4a.cubeList.add(new ModelBox(arm4a, 7, 46, -0.5F, -0.5F, 0.0F, 1, 1, 5, 0.0F, false));

        this.arm4b = new AdvancedModelRenderer(this);
        this.arm4b.setRotationPoint(0.0F, 0.0F, 4.5F);
        this.arm4a.addChild(arm4b);
        this.setRotateAngle(arm4b, -0.2335F, 0.1061F, 0.0F);
        this.arm4b.cubeList.add(new ModelBox(arm4b, 19, 46, -0.5F, -0.5F, 0.0F, 1, 1, 5, 0.0F, false));

        this.arm9a = new AdvancedModelRenderer(this);
        this.arm9a.setRotationPoint(1.15F, 2.5F, 3.0F);
        this.Mantle.addChild(arm9a);
        this.setRotateAngle(arm9a, -0.5531F, 0.2194F, 0.0F);
        this.arm9a.cubeList.add(new ModelBox(arm9a, 11, 40, -0.5F, -0.5F, 0.0F, 1, 1, 5, 0.0F, false));

        this.arm9b = new AdvancedModelRenderer(this);
        this.arm9b.setRotationPoint(0.0F, 0.0F, 4.5F);
        this.arm9a.addChild(arm9b);
        this.setRotateAngle(arm9b, -0.2335F, -0.1061F, 0.0F);
        this.arm9b.cubeList.add(new ModelBox(arm9b, 23, 40, -0.5F, -0.5F, 0.0F, 1, 1, 5, 0.0F, false));

        this.arm5a = new AdvancedModelRenderer(this);
        this.arm5a.setRotationPoint(-0.9F, 3.0F, 2.5F);
        this.Mantle.addChild(arm5a);
        this.setRotateAngle(arm5a, -0.6404F, -0.263F, 0.0F);
        this.arm5a.cubeList.add(new ModelBox(arm5a, 45, 32, -0.5F, -0.5F, 0.0F, 1, 1, 5, 0.0F, false));

        this.arm5b = new AdvancedModelRenderer(this);
        this.arm5b.setRotationPoint(0.0F, 0.0F, 4.5F);
        this.arm5a.addChild(arm5b);
        this.setRotateAngle(arm5b, -0.2335F, 0.1061F, 0.0F);
        this.arm5b.cubeList.add(new ModelBox(arm5b, 46, 0, -0.5F, -0.5F, 0.0F, 1, 1, 5, 0.0F, false));

        this.arm5b2 = new AdvancedModelRenderer(this);
        this.arm5b2.setRotationPoint(0.0F, 0.0F, 4.5F);
        this.arm5b.addChild(arm5b2);
        this.setRotateAngle(arm5b2, 0.1155F, 0.1061F, 0.0F);
        this.arm5b2.cubeList.add(new ModelBox(arm5b2, 39, 26, -0.5F, -0.5F, 0.0F, 1, 1, 5, 0.0F, false));

        this.arm5b3 = new AdvancedModelRenderer(this);
        this.arm5b3.setRotationPoint(0.0F, 0.0F, 4.75F);
        this.arm5b2.addChild(arm5b3);
        this.setRotateAngle(arm5b3, 0.1592F, 0.1061F, 0.0F);
        this.arm5b3.cubeList.add(new ModelBox(arm5b3, 39, 1, -0.5F, -0.5F, 0.0F, 1, 1, 5, 0.0F, false));

        this.arm5a2 = new AdvancedModelRenderer(this);
        this.arm5a2.setRotationPoint(0.9F, 3.0F, 2.5F);
        this.Mantle.addChild(arm5a2);
        this.setRotateAngle(arm5a2, -0.6404F, 0.263F, 0.0F);
        this.arm5a2.cubeList.add(new ModelBox(arm5a2, 14, 0, -0.5F, -0.5F, 0.0F, 1, 1, 5, 0.0F, false));

        this.arm5b4 = new AdvancedModelRenderer(this);
        this.arm5b4.setRotationPoint(0.0F, 0.0F, 4.5F);
        this.arm5a2.addChild(arm5b4);
        this.setRotateAngle(arm5b4, -0.2335F, -0.1061F, 0.0F);
        this.arm5b4.cubeList.add(new ModelBox(arm5b4, 38, 35, -0.5F, -0.5F, 0.0F, 1, 1, 5, 0.0F, false));

        this.arm5b5 = new AdvancedModelRenderer(this);
        this.arm5b5.setRotationPoint(0.0F, 0.0F, 4.5F);
        this.arm5b4.addChild(arm5b5);
        this.setRotateAngle(arm5b5, 0.1155F, -0.1061F, 0.0F);
        this.arm5b5.cubeList.add(new ModelBox(arm5b5, 16, 34, -0.5F, -0.5F, 0.0F, 1, 1, 5, 0.0F, false));

        this.arm5b6 = new AdvancedModelRenderer(this);
        this.arm5b6.setRotationPoint(0.0F, 0.0F, 4.75F);
        this.arm5b5.addChild(arm5b6);
        this.setRotateAngle(arm5b6, 0.1592F, -0.1061F, 0.0F);
        this.arm5b6.cubeList.add(new ModelBox(arm5b6, 32, 0, -0.5F, -0.5F, 0.0F, 1, 1, 5, 0.0F, false));

        this.Shellbase = new AdvancedModelRenderer(this);
        this.Shellbase.setRotationPoint(0.01F, 2.96F, 0.0F);
        this.Shell1.addChild(Shellbase);
        this.setRotateAngle(Shellbase, -0.1274F, 0.0F, 0.0F);
        updateDefaultPose();
    }

    public void renderAll(float f) {
        this.resetToDefaultPose();
        this.Shell1.offsetY = -0.2F;
        this.Shell1.render(0.08f);
    }

    public void setRotateAngle(ModelRenderer modelRenderer, float x, float y, float z) {
        modelRenderer.rotateAngleX = x;
        modelRenderer.rotateAngleY = y;
        modelRenderer.rotateAngleZ = z;
    }

}
