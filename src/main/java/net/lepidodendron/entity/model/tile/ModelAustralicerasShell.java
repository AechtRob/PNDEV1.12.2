package net.lepidodendron.entity.model.tile;

import net.ilexiconn.llibrary.client.model.tools.AdvancedModelRenderer;
import net.lepidodendron.entity.model.llibraryextensions.AdvancedModelBaseExtended;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;

public class ModelAustralicerasShell extends AdvancedModelBaseExtended {
    private final AdvancedModelRenderer Root;
    private final AdvancedModelRenderer Shell;
    private final AdvancedModelRenderer cube_r1;
    private final AdvancedModelRenderer Shell2;
    private final AdvancedModelRenderer cube_r2;
    private final AdvancedModelRenderer cube_r3;
    private final AdvancedModelRenderer cube_r4;
    private final AdvancedModelRenderer Shell3;
    private final AdvancedModelRenderer cube_r5;
    private final AdvancedModelRenderer Shell4;
    private final AdvancedModelRenderer Shell5;
    private final AdvancedModelRenderer Shell6;
    private final AdvancedModelRenderer Shell7;
    private final AdvancedModelRenderer Shell8;
    private final AdvancedModelRenderer Shell9;
    private final AdvancedModelRenderer Shell10;
    private final AdvancedModelRenderer Mantle;
    private final AdvancedModelRenderer Siphon;
    private final AdvancedModelRenderer cube_r6;
    private final AdvancedModelRenderer Tentacle1a;
    private final AdvancedModelRenderer Tentacle1b;
    private final AdvancedModelRenderer Tentacle2a;
    private final AdvancedModelRenderer Tentacle2b;
    private final AdvancedModelRenderer Tentacle2c;
    private final AdvancedModelRenderer Tentacle2d;
    private final AdvancedModelRenderer Tentacle3a;
    private final AdvancedModelRenderer Tentacle3b;
    private final AdvancedModelRenderer Tentacle4a;
    private final AdvancedModelRenderer Tentacle4b;
    private final AdvancedModelRenderer Tentacle5a;
    private final AdvancedModelRenderer Tentacle5a2;
    private final AdvancedModelRenderer Tentacle6a;
    private final AdvancedModelRenderer Tentacle6b;
    private final AdvancedModelRenderer Tentacle7a;
    private final AdvancedModelRenderer Tentacle7b;
    private final AdvancedModelRenderer Tentacle7c;
    private final AdvancedModelRenderer Tentacle7d;
    private final AdvancedModelRenderer Tentacle8a;
    private final AdvancedModelRenderer Tentacle8b;
    private final AdvancedModelRenderer Tentacle9a;
    private final AdvancedModelRenderer Tentacle9b;
    private final AdvancedModelRenderer Tentacle10a;
    private final AdvancedModelRenderer Tentacle10b;

    public ModelAustralicerasShell() {
        this.textureWidth = 64;
        this.textureHeight = 64;

        this.Root = new AdvancedModelRenderer(this);
        this.Root.setRotationPoint(0.0F, 21.0F, 0.0F);


        this.Shell = new AdvancedModelRenderer(this);
        this.Shell.setRotationPoint(0.0F, 0.0F, 8.0131F);
        this.Root.addChild(Shell);
        this.setRotateAngle(Shell, 0.7854F, 0.0F, 0.0F);
        this.Shell.cubeList.add(new ModelBox(Shell, 0, 29, -2.0F, -5.0F, -3.0F, 4, 5, 3, 0.0F, false));

        this.cube_r1 = new AdvancedModelRenderer(this);
        this.cube_r1.setRotationPoint(0.5F, -1.625F, -1.475F);
        this.Shell.addChild(cube_r1);
        this.setRotateAngle(cube_r1, -0.2007F, 0.0F, 0.0F);
        this.cube_r1.cubeList.add(new ModelBox(cube_r1, 30, 17, -3.0F, -2.5F, -0.5F, 5, 5, 1, 0.0F, false));

        this.Shell2 = new AdvancedModelRenderer(this);
        this.Shell2.setRotationPoint(0.0F, 0.0F, -3.0F);
        this.Shell.addChild(Shell2);
        this.setRotateAngle(Shell2, -0.6981F, 0.0F, 0.0F);
        this.Shell2.cubeList.add(new ModelBox(Shell2, 0, 0, -2.0F, -4.0F, -6.0F, 4, 4, 6, -0.01F, false));

        this.cube_r2 = new AdvancedModelRenderer(this);
        this.cube_r2.setRotationPoint(1.0F, -1.25F, -5.2F);
        this.Shell2.addChild(cube_r2);
        this.setRotateAngle(cube_r2, -0.2182F, 0.0F, 0.0F);
        this.cube_r2.cubeList.add(new ModelBox(cube_r2, 14, 33, -3.5F, -2.0F, -0.5F, 5, 4, 1, 0.0F, false));

        this.cube_r3 = new AdvancedModelRenderer(this);
        this.cube_r3.setRotationPoint(1.0F, -1.5F, -3.3F);
        this.Shell2.addChild(cube_r3);
        this.setRotateAngle(cube_r3, 0.0436F, 0.0F, 0.0F);
        this.cube_r3.cubeList.add(new ModelBox(cube_r3, 26, 33, -3.5F, -1.5F, -0.5F, 5, 4, 1, 0.0F, false));

        this.cube_r4 = new AdvancedModelRenderer(this);
        this.cube_r4.setRotationPoint(1.0F, -1.85F, -1.5F);
        this.Shell2.addChild(cube_r4);
        this.setRotateAngle(cube_r4, 0.336F, 0.0F, 0.0F);
        this.cube_r4.cubeList.add(new ModelBox(cube_r4, 34, 23, -3.5F, -1.5F, -0.5F, 5, 4, 1, 0.0F, false));

        this.Shell3 = new AdvancedModelRenderer(this);
        this.Shell3.setRotationPoint(0.0F, 0.0F, -6.0F);
        this.Shell2.addChild(Shell3);
        this.setRotateAngle(Shell3, -0.5672F, 0.0F, 0.0F);
        this.Shell3.cubeList.add(new ModelBox(Shell3, 12, 14, -1.5F, -4.0F, -6.0F, 3, 4, 6, 0.0F, false));
        this.Shell3.cubeList.add(new ModelBox(Shell3, 10, 38, -2.0F, -3.25F, -2.5F, 4, 4, 1, 0.0F, false));

        this.cube_r5 = new AdvancedModelRenderer(this);
        this.cube_r5.setRotationPoint(0.0F, -1.25F, -4.0F);
        this.Shell3.addChild(cube_r5);
        this.setRotateAngle(cube_r5, -0.1353F, 0.0F, 0.0F);
        this.cube_r5.cubeList.add(new ModelBox(cube_r5, 14, 0, -2.0F, -1.5F, -0.5F, 4, 3, 1, 0.0F, false));

        this.Shell4 = new AdvancedModelRenderer(this);
        this.Shell4.setRotationPoint(0.0F, 0.0F, -6.0F);
        this.Shell3.addChild(Shell4);
        this.setRotateAngle(Shell4, -0.7418F, 0.0F, 0.0F);
        this.Shell4.cubeList.add(new ModelBox(Shell4, 14, 4, -1.5F, -4.0F, -6.0F, 3, 4, 6, -0.01F, false));

        this.Shell5 = new AdvancedModelRenderer(this);
        this.Shell5.setRotationPoint(0.0F, 0.0F, -6.0F);
        this.Shell4.addChild(Shell5);
        this.setRotateAngle(Shell5, -0.7418F, 0.0F, 0.0F);
        this.Shell5.cubeList.add(new ModelBox(Shell5, 0, 10, -1.5F, -4.0F, -6.0F, 3, 4, 6, -0.04F, false));

        this.Shell6 = new AdvancedModelRenderer(this);
        this.Shell6.setRotationPoint(0.0F, 0.0F, -6.0F);
        this.Shell5.addChild(Shell6);
        this.setRotateAngle(Shell6, -0.7854F, 0.0F, 0.0F);
        this.Shell6.cubeList.add(new ModelBox(Shell6, 0, 20, -1.0F, -3.0F, -6.0F, 2, 3, 6, 0.0F, false));

        this.Shell7 = new AdvancedModelRenderer(this);
        this.Shell7.setRotationPoint(0.0F, 0.0F, -6.0F);
        this.Shell6.addChild(Shell7);
        this.setRotateAngle(Shell7, -0.7854F, 0.0F, 0.0F);
        this.Shell7.cubeList.add(new ModelBox(Shell7, 26, 0, -1.0F, -3.0F, -5.0F, 2, 3, 5, -0.01F, false));

        this.Shell8 = new AdvancedModelRenderer(this);
        this.Shell8.setRotationPoint(0.0F, 0.0F, -5.0F);
        this.Shell7.addChild(Shell8);
        this.setRotateAngle(Shell8, -0.7636F, 0.0F, 0.0F);
        this.Shell8.cubeList.add(new ModelBox(Shell8, 28, 10, -1.0F, -3.0F, -4.0F, 2, 3, 4, -0.04F, false));

        this.Shell9 = new AdvancedModelRenderer(this);
        this.Shell9.setRotationPoint(0.0F, 0.0F, -4.0F);
        this.Shell8.addChild(Shell9);
        this.setRotateAngle(Shell9, -0.9687F, 0.0F, 0.0F);
        this.Shell9.cubeList.add(new ModelBox(Shell9, 36, 4, -0.5F, -2.0F, -4.0F, 1, 2, 4, 0.0F, false));

        this.Shell10 = new AdvancedModelRenderer(this);
        this.Shell10.setRotationPoint(0.0F, 0.0F, -4.0F);
        this.Shell9.addChild(Shell10);
        this.setRotateAngle(Shell10, -0.8508F, 0.0F, 0.0F);
        this.Shell10.cubeList.add(new ModelBox(Shell10, 34, 34, -0.5F, -2.0F, -4.0F, 1, 2, 4, -0.01F, false));
        this.Shell10.cubeList.add(new ModelBox(Shell10, 16, 18, 0.0F, -6.0F, -6.0F, 0, 6, 6, 0.0F, false));

        this.Mantle = new AdvancedModelRenderer(this);
        this.Mantle.setRotationPoint(0.0F, -1.875F, 4.0631F);
        this.Root.addChild(Mantle);
        this.setRotateAngle(Mantle, 0.1004F, 0.0F, 0.0F);
        this.Mantle.cubeList.add(new ModelBox(Mantle, 23, 25, -1.5F, -1.5F, 0.5F, 3, 3, 5, -0.04F, false));
        this.Mantle.cubeList.add(new ModelBox(Mantle, 26, 8, -2.0F, -1.0F, 2.0F, 4, 1, 1, 0.0F, false));

        this.Siphon = new AdvancedModelRenderer(this);
        this.Siphon.setRotationPoint(0.0F, 1.7F, 1.825F);
        this.Mantle.addChild(Siphon);
        this.setRotateAngle(Siphon, -0.1745F, 0.0F, 0.0F);


        this.cube_r6 = new AdvancedModelRenderer(this);
        this.cube_r6.setRotationPoint(0.5F, -1.0F, 0.0F);
        this.Siphon.addChild(cube_r6);
        this.setRotateAngle(cube_r6, 0.1396F, 0.0F, 0.0F);
        this.cube_r6.cubeList.add(new ModelBox(cube_r6, 0, 42, -1.0F, 0.5F, -1.5F, 1, 1, 4, 0.0F, false));

        this.Tentacle1a = new AdvancedModelRenderer(this);
        this.Tentacle1a.setRotationPoint(-0.5F, 1.0F, 5.425F);
        this.Mantle.addChild(Tentacle1a);
        this.setRotateAngle(Tentacle1a, -0.1789F, -0.0215F, 0.0039F);
        this.Tentacle1a.cubeList.add(new ModelBox(Tentacle1a, 43, 30, -0.5F, -0.55F, 0.0F, 1, 1, 4, 0.0F, false));

        this.Tentacle1b = new AdvancedModelRenderer(this);
        this.Tentacle1b.setRotationPoint(0.0F, 0.0F, 3.5F);
        this.Tentacle1a.addChild(Tentacle1b);
        this.setRotateAngle(Tentacle1b, 0.385F, 0.0728F, 0.0295F);
        this.Tentacle1b.cubeList.add(new ModelBox(Tentacle1b, 48, 11, -0.5F, -0.55F, 0.0F, 1, 1, 4, 0.0F, false));

        this.Tentacle2a = new AdvancedModelRenderer(this);
        this.Tentacle2a.setRotationPoint(-1.45F, 1.0F, 5.425F);
        this.Mantle.addChild(Tentacle2a);
        this.setRotateAngle(Tentacle2a, -0.1178F, 0.0F, 0.6109F);
        this.Tentacle2a.cubeList.add(new ModelBox(Tentacle2a, 16, 43, -0.5F, -0.55F, 0.0F, 1, 1, 4, 0.0F, false));

        this.Tentacle2b = new AdvancedModelRenderer(this);
        this.Tentacle2b.setRotationPoint(0.0F, 0.0F, 3.5F);
        this.Tentacle2a.addChild(Tentacle2b);
        this.Tentacle2b.cubeList.add(new ModelBox(Tentacle2b, 6, 48, -0.5F, -0.55F, 0.0F, 1, 1, 4, 0.0F, false));

        this.Tentacle2c = new AdvancedModelRenderer(this);
        this.Tentacle2c.setRotationPoint(0.0F, 0.0F, 3.5F);
        this.Tentacle2b.addChild(Tentacle2c);
        this.setRotateAngle(Tentacle2c, 0.0859F, -0.0151F, 0.1739F);
        this.Tentacle2c.cubeList.add(new ModelBox(Tentacle2c, 37, 29, -0.5F, -0.55F, 0.0F, 1, 1, 4, 0.0F, false));

        this.Tentacle2d = new AdvancedModelRenderer(this);
        this.Tentacle2d.setRotationPoint(0.0F, 0.0F, 3.5F);
        this.Tentacle2c.addChild(Tentacle2d);
        this.setRotateAngle(Tentacle2d, 0.0F, -0.0436F, 0.0F);
        this.Tentacle2d.cubeList.add(new ModelBox(Tentacle2d, 6, 43, -0.5F, -0.55F, 0.0F, 1, 1, 4, 0.0F, false));

        this.Tentacle3a = new AdvancedModelRenderer(this);
        this.Tentacle3a.setRotationPoint(-1.45F, 0.0F, 5.425F);
        this.Mantle.addChild(Tentacle3a);
        this.setRotateAngle(Tentacle3a, 0.0F, -0.2487F, 0.0F);
        this.Tentacle3a.cubeList.add(new ModelBox(Tentacle3a, 38, 41, -0.5F, -0.5F, 0.0F, 1, 1, 4, 0.0F, false));

        this.Tentacle3b = new AdvancedModelRenderer(this);
        this.Tentacle3b.setRotationPoint(0.0F, 0.0F, 3.5F);
        this.Tentacle3a.addChild(Tentacle3b);
        this.setRotateAngle(Tentacle3b, -0.0785F, 0.5534F, -0.0209F);
        this.Tentacle3b.cubeList.add(new ModelBox(Tentacle3b, 46, 35, -0.5F, -0.5F, 0.0F, 1, 1, 4, 0.0F, false));

        this.Tentacle4a = new AdvancedModelRenderer(this);
        this.Tentacle4a.setRotationPoint(-1.45F, -0.925F, 5.425F);
        this.Mantle.addChild(Tentacle4a);
        this.setRotateAngle(Tentacle4a, 0.1614F, 0.0F, -0.7854F);
        this.Tentacle4a.cubeList.add(new ModelBox(Tentacle4a, 40, 36, -0.5F, -0.5F, 0.0F, 1, 1, 4, 0.0F, false));

        this.Tentacle4b = new AdvancedModelRenderer(this);
        this.Tentacle4b.setRotationPoint(0.0F, 0.0F, 3.5F);
        this.Tentacle4a.addChild(Tentacle4b);
        this.setRotateAngle(Tentacle4b, -0.2227F, -0.0426F, 0.0096F);
        this.Tentacle4b.cubeList.add(new ModelBox(Tentacle4b, 34, 46, -0.5F, -0.5F, 0.0F, 1, 1, 4, 0.0F, false));

        this.Tentacle5a = new AdvancedModelRenderer(this);
        this.Tentacle5a.setRotationPoint(-0.45F, -0.925F, 5.425F);
        this.Mantle.addChild(Tentacle5a);
        this.setRotateAngle(Tentacle5a, 0.2662F, -0.0253F, -0.0069F);
        this.Tentacle5a.cubeList.add(new ModelBox(Tentacle5a, 32, 40, -0.5F, -0.5F, 0.0F, 1, 1, 4, 0.0F, false));

        this.Tentacle5a2 = new AdvancedModelRenderer(this);
        this.Tentacle5a2.setRotationPoint(0.0F, 0.0F, 3.5F);
        this.Tentacle5a.addChild(Tentacle5a2);
        this.setRotateAngle(Tentacle5a2, -0.336F, 0.0206F, -0.0072F);
        this.Tentacle5a2.cubeList.add(new ModelBox(Tentacle5a2, 46, 5, -0.5F, -0.5F, 0.0F, 1, 1, 4, 0.0F, false));

        this.Tentacle6a = new AdvancedModelRenderer(this);
        this.Tentacle6a.setRotationPoint(0.5F, 1.0F, 5.425F);
        this.Mantle.addChild(Tentacle6a);
        this.setRotateAngle(Tentacle6a, -0.1789F, 0.0215F, -0.0039F);
        this.Tentacle6a.cubeList.add(new ModelBox(Tentacle6a, 42, 24, -0.5F, -0.55F, 0.0F, 1, 1, 4, 0.0F, false));

        this.Tentacle6b = new AdvancedModelRenderer(this);
        this.Tentacle6b.setRotationPoint(0.0F, 0.0F, 3.5F);
        this.Tentacle6a.addChild(Tentacle6b);
        this.setRotateAngle(Tentacle6b, 0.385F, -0.0728F, -0.0295F);
        this.Tentacle6b.cubeList.add(new ModelBox(Tentacle6b, 40, 47, -0.5F, -0.55F, 0.0F, 1, 1, 4, 0.0F, false));

        this.Tentacle7a = new AdvancedModelRenderer(this);
        this.Tentacle7a.setRotationPoint(1.45F, 1.0F, 5.425F);
        this.Mantle.addChild(Tentacle7a);
        this.setRotateAngle(Tentacle7a, -0.1178F, 0.0F, -0.6109F);
        this.Tentacle7a.cubeList.add(new ModelBox(Tentacle7a, 42, 15, -0.5F, -0.55F, 0.0F, 1, 1, 4, 0.0F, false));

        this.Tentacle7b = new AdvancedModelRenderer(this);
        this.Tentacle7b.setRotationPoint(0.0F, 0.0F, 3.5F);
        this.Tentacle7a.addChild(Tentacle7b);
        this.Tentacle7b.cubeList.add(new ModelBox(Tentacle7b, 0, 47, -0.5F, -0.55F, 0.0F, 1, 1, 4, 0.0F, false));

        this.Tentacle7c = new AdvancedModelRenderer(this);
        this.Tentacle7c.setRotationPoint(0.0F, 0.0F, 3.5F);
        this.Tentacle7b.addChild(Tentacle7c);
        this.setRotateAngle(Tentacle7c, 0.0859F, 0.0151F, -0.1739F);
        this.Tentacle7c.cubeList.add(new ModelBox(Tentacle7c, 0, 37, -0.5F, -0.55F, 0.0F, 1, 1, 4, 0.0F, false));

        this.Tentacle7d = new AdvancedModelRenderer(this);
        this.Tentacle7d.setRotationPoint(0.0F, 0.0F, 3.5F);
        this.Tentacle7c.addChild(Tentacle7d);
        this.setRotateAngle(Tentacle7d, 0.0F, 0.0436F, 0.0F);
        this.Tentacle7d.cubeList.add(new ModelBox(Tentacle7d, 42, 0, -0.5F, -0.55F, 0.0F, 1, 1, 4, 0.0F, false));

        this.Tentacle8a = new AdvancedModelRenderer(this);
        this.Tentacle8a.setRotationPoint(1.45F, 0.0F, 5.425F);
        this.Mantle.addChild(Tentacle8a);
        this.setRotateAngle(Tentacle8a, 0.0F, 0.2487F, 0.0F);
        this.Tentacle8a.cubeList.add(new ModelBox(Tentacle8a, 40, 10, -0.5F, -0.5F, 0.0F, 1, 1, 4, 0.0F, false));

        this.Tentacle8b = new AdvancedModelRenderer(this);
        this.Tentacle8b.setRotationPoint(0.0F, 0.0F, 3.5F);
        this.Tentacle8a.addChild(Tentacle8b);
        this.setRotateAngle(Tentacle8b, -0.0785F, -0.5534F, 0.0209F);
        this.Tentacle8b.cubeList.add(new ModelBox(Tentacle8b, 28, 45, -0.5F, -0.5F, 0.0F, 1, 1, 4, 0.0F, false));

        this.Tentacle9a = new AdvancedModelRenderer(this);
        this.Tentacle9a.setRotationPoint(1.45F, -0.925F, 5.425F);
        this.Mantle.addChild(Tentacle9a);
        this.setRotateAngle(Tentacle9a, 0.1614F, 0.0F, 0.7854F);
        this.Tentacle9a.cubeList.add(new ModelBox(Tentacle9a, 26, 39, -0.5F, -0.5F, 0.0F, 1, 1, 4, 0.0F, false));

        this.Tentacle9b = new AdvancedModelRenderer(this);
        this.Tentacle9b.setRotationPoint(0.0F, 0.0F, 3.5F);
        this.Tentacle9a.addChild(Tentacle9b);
        this.setRotateAngle(Tentacle9b, -0.2227F, 0.0426F, -0.0096F);
        this.Tentacle9b.cubeList.add(new ModelBox(Tentacle9b, 44, 42, -0.5F, -0.5F, 0.0F, 1, 1, 4, 0.0F, false));

        this.Tentacle10a = new AdvancedModelRenderer(this);
        this.Tentacle10a.setRotationPoint(0.45F, -0.925F, 5.425F);
        this.Mantle.addChild(Tentacle10a);
        this.setRotateAngle(Tentacle10a, 0.2662F, 0.0253F, 0.0069F);
        this.Tentacle10a.cubeList.add(new ModelBox(Tentacle10a, 20, 38, -0.5F, -0.5F, 0.0F, 1, 1, 4, 0.0F, false));

        this.Tentacle10b = new AdvancedModelRenderer(this);
        this.Tentacle10b.setRotationPoint(0.0F, 0.0F, 3.5F);
        this.Tentacle10a.addChild(Tentacle10b);
        this.setRotateAngle(Tentacle10b, -0.336F, -0.0206F, 0.0072F);
        this.Tentacle10b.cubeList.add(new ModelBox(Tentacle10b, 22, 44, -0.5F, -0.5F, 0.0F, 1, 1, 4, 0.0F, false));
        updateDefaultPose();
    }

    public void renderAll(float f) {
        this.resetToDefaultPose();
        this.Root.offsetY = -1.75F;
        //this.Root.offsetZ = 1.0F;
        this.Root.render(0.08f);
    }

    public void setRotateAngle(ModelRenderer modelRenderer, float x, float y, float z) {
        modelRenderer.rotateAngleX = x;
        modelRenderer.rotateAngleY = y;
        modelRenderer.rotateAngleZ = z;
    }

}
