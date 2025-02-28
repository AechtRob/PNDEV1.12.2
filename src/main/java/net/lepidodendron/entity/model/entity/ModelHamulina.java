package net.lepidodendron.entity.model.entity;

import net.ilexiconn.llibrary.client.model.ModelAnimator;
import net.ilexiconn.llibrary.client.model.tools.AdvancedModelRenderer;
import net.ilexiconn.llibrary.server.animation.IAnimatedEntity;
import net.lepidodendron.entity.EntityPrehistoricFloraHamulina;
import net.lepidodendron.entity.model.ModelBasePalaeopedia;
import net.minecraft.client.model.ModelBox;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;

public class ModelHamulina extends ModelBasePalaeopedia {
    private final AdvancedModelRenderer Root;
    private final AdvancedModelRenderer Shell1;
    private final AdvancedModelRenderer cube_r1;
    private final AdvancedModelRenderer cube_r2;
    private final AdvancedModelRenderer cube_r3;
    private final AdvancedModelRenderer cube_r4;
    private final AdvancedModelRenderer cube_r5;
    private final AdvancedModelRenderer cube_r6;
    private final AdvancedModelRenderer cube_r7;
    private final AdvancedModelRenderer Shell2;
    private final AdvancedModelRenderer Shell3;
    private final AdvancedModelRenderer Shell4;
    private final AdvancedModelRenderer Shell5;
    private final AdvancedModelRenderer Shell6;
    private final AdvancedModelRenderer Shell7;
    private final AdvancedModelRenderer cube_r8;
    private final AdvancedModelRenderer Mantle;
    private final AdvancedModelRenderer Siphon;
    private final AdvancedModelRenderer Tentacle1a;
    private final AdvancedModelRenderer Tentacle1b;
    private final AdvancedModelRenderer Tentacle2a;
    private final AdvancedModelRenderer Tentacle2b;
    private final AdvancedModelRenderer Tentacle2c;
    private final AdvancedModelRenderer Tentacle2d;
    private final AdvancedModelRenderer Tentacle2e;
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
    private final AdvancedModelRenderer Tentacle7e;
    private final AdvancedModelRenderer Tentacle8a;
    private final AdvancedModelRenderer Tentacle8b;
    private final AdvancedModelRenderer Tentacle9a;
    private final AdvancedModelRenderer Tentacle9b;
    private final AdvancedModelRenderer Tentacle10a;
    private final AdvancedModelRenderer Tentacle10b;

    private ModelAnimator animator;

    public ModelHamulina() {
        this.textureWidth = 70;
        this.textureHeight = 70;

        this.Root = new AdvancedModelRenderer(this);
        this.Root.setRotationPoint(0.0F, 17.75F, -6.0F);


        this.Shell1 = new AdvancedModelRenderer(this);
        this.Shell1.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.Root.addChild(Shell1);
        this.Shell1.cubeList.add(new ModelBox(Shell1, 0, 28, -1.5F, 2.0F, -6.0F, 3, 4, 6, 0.01F, false));
        this.Shell1.cubeList.add(new ModelBox(Shell1, 28, 8, -1.5F, 3.0F, -10.0F, 3, 3, 4, 0.0F, false));

        this.cube_r1 = new AdvancedModelRenderer(this);
        this.cube_r1.setRotationPoint(-0.5F, 2.0F, -6.0F);
        this.Shell1.addChild(cube_r1);
        this.setRotateAngle(cube_r1, 0.0829F, 0.0F, 0.0F);
        this.cube_r1.cubeList.add(new ModelBox(cube_r1, 0, 11, -1.0F, 0.0F, -8.0F, 3, 1, 8, -0.04F, false));

        this.cube_r2 = new AdvancedModelRenderer(this);
        this.cube_r2.setRotationPoint(0.0F, 4.2F, -9.0F);
        this.Shell1.addChild(cube_r2);
        this.setRotateAngle(cube_r2, -0.1222F, 0.0F, 0.0F);
        this.cube_r2.cubeList.add(new ModelBox(cube_r2, 20, 39, -2.0F, -2.5F, 0.0F, 4, 5, 0, 0.0F, false));

        this.cube_r3 = new AdvancedModelRenderer(this);
        this.cube_r3.setRotationPoint(0.0F, 4.2F, -7.5F);
        this.Shell1.addChild(cube_r3);
        this.setRotateAngle(cube_r3, -0.1222F, 0.0F, 0.0F);
        this.cube_r3.cubeList.add(new ModelBox(cube_r3, 40, 16, -2.0F, -2.5F, 0.0F, 4, 5, 0, 0.0F, false));

        this.cube_r4 = new AdvancedModelRenderer(this);
        this.cube_r4.setRotationPoint(0.0F, 4.1F, -6.0F);
        this.Shell1.addChild(cube_r4);
        this.setRotateAngle(cube_r4, -0.1222F, 0.0F, 0.0F);
        this.cube_r4.cubeList.add(new ModelBox(cube_r4, 0, 43, -2.0F, -2.5F, 0.0F, 4, 5, 0, 0.0F, false));

        this.cube_r5 = new AdvancedModelRenderer(this);
        this.cube_r5.setRotationPoint(0.0F, 4.0F, -4.5F);
        this.Shell1.addChild(cube_r5);
        this.setRotateAngle(cube_r5, -0.1222F, 0.0F, 0.0F);
        this.cube_r5.cubeList.add(new ModelBox(cube_r5, 0, 11, -2.0F, -2.5F, 0.0F, 4, 5, 0, 0.0F, false));

        this.cube_r6 = new AdvancedModelRenderer(this);
        this.cube_r6.setRotationPoint(0.0F, 4.0F, -3.0F);
        this.Shell1.addChild(cube_r6);
        this.setRotateAngle(cube_r6, -0.1222F, 0.0F, 0.0F);
        this.cube_r6.cubeList.add(new ModelBox(cube_r6, 14, 11, -2.0F, -2.5F, 0.0F, 4, 5, 0, 0.0F, false));

        this.cube_r7 = new AdvancedModelRenderer(this);
        this.cube_r7.setRotationPoint(0.0F, 4.0F, -1.5F);
        this.Shell1.addChild(cube_r7);
        this.setRotateAngle(cube_r7, -0.1222F, 0.0F, 0.0F);
        this.cube_r7.cubeList.add(new ModelBox(cube_r7, 39, 0, -2.0F, -2.5F, 0.0F, 4, 5, 0, 0.0F, false));

        this.Shell2 = new AdvancedModelRenderer(this);
        this.Shell2.setRotationPoint(0.0F, 0.0F, -10.0F);
        this.Shell1.addChild(Shell2);
        this.setRotateAngle(Shell2, -0.0916F, 0.0F, 0.0F);
        this.Shell2.cubeList.add(new ModelBox(Shell2, 28, 0, -1.5F, 2.9748F, -4.451F, 3, 3, 5, -0.01F, false));

        this.Shell3 = new AdvancedModelRenderer(this);
        this.Shell3.setRotationPoint(0.0F, 0.0F, -5.0F);
        this.Shell2.addChild(Shell3);
        this.setRotateAngle(Shell3, -0.5192F, 0.0F, 0.0F);
        this.Shell3.cubeList.add(new ModelBox(Shell3, 12, 28, -1.0F, 1.9149F, 0.4415F, 2, 3, 3, 0.01F, false));

        this.Shell4 = new AdvancedModelRenderer(this);
        this.Shell4.setRotationPoint(0.0F, 0.0F, -3.0F);
        this.Shell3.addChild(Shell4);
        this.setRotateAngle(Shell4, -0.8552F, 0.0F, 0.0F);
        this.Shell4.cubeList.add(new ModelBox(Shell4, 0, 0, -1.0F, -3.3728F, 2.9671F, 2, 4, 3, 0.0F, false));

        this.Shell5 = new AdvancedModelRenderer(this);
        this.Shell5.setRotationPoint(0.0F, 0.0F, -3.0F);
        this.Shell4.addChild(Shell5);
        this.setRotateAngle(Shell5, -1.0385F, 0.0F, 0.0F);
        this.Shell5.cubeList.add(new ModelBox(Shell5, 28, 15, -1.0F, -7.8231F, 0.5689F, 2, 3, 3, -0.01F, false));

        this.Shell6 = new AdvancedModelRenderer(this);
        this.Shell6.setRotationPoint(0.0F, 0.0F, -3.0F);
        this.Shell5.addChild(Shell6);
        this.setRotateAngle(Shell6, -0.5192F, 0.0F, 0.0F);
        this.Shell6.cubeList.add(new ModelBox(Shell6, 12, 0, -1.0F, -8.9584F, -2.2948F, 2, 3, 3, -0.04F, false));

        this.Shell7 = new AdvancedModelRenderer(this);
        this.Shell7.setRotationPoint(0.0F, 0.0F, -3.0F);
        this.Shell6.addChild(Shell7);
        this.setRotateAngle(Shell7, -0.1527F, 0.0F, 0.0F);
        this.Shell7.cubeList.add(new ModelBox(Shell7, 0, 0, -0.5F, -6.9963F, -26.2094F, 1, 1, 26, 0.04F, false));
        this.Shell7.cubeList.add(new ModelBox(Shell7, 0, 0, 0.25F, -6.4963F, -22.2094F, 1, 0, 22, 0.0F, false));
        this.Shell7.cubeList.add(new ModelBox(Shell7, 0, 5, 0.25F, -6.2463F, -22.2094F, 0, 1, 22, 0.0F, false));
        this.Shell7.cubeList.add(new ModelBox(Shell7, 0, 5, -0.25F, -6.2463F, -22.2094F, 0, 1, 22, 0.0F, true));
        this.Shell7.cubeList.add(new ModelBox(Shell7, 0, 0, -1.25F, -6.4963F, -22.2094F, 1, 0, 22, 0.0F, true));
        this.Shell7.cubeList.add(new ModelBox(Shell7, 0, 0, -0.5F, -7.9963F, -10.2094F, 1, 1, 10, 0.0F, false));

        this.cube_r8 = new AdvancedModelRenderer(this);
        this.cube_r8.setRotationPoint(0.5F, -3.0F, -0.375F);
        this.Shell7.addChild(cube_r8);
        this.setRotateAngle(cube_r8, 0.1047F, 0.0F, 0.0F);
        this.cube_r8.cubeList.add(new ModelBox(cube_r8, 25, 27, -1.0F, -5.9854F, -18.5815F, 1, 1, 19, 0.01F, false));

        this.Mantle = new AdvancedModelRenderer(this);
        this.Mantle.setRotationPoint(0.0F, 3.7F, -0.575F);
        this.Root.addChild(Mantle);
        this.Mantle.cubeList.add(new ModelBox(Mantle, 0, 20, -1.5F, -1.5F, 0.5F, 3, 3, 3, -0.04F, false));
        this.Mantle.cubeList.add(new ModelBox(Mantle, 0, 7, -2.0F, -1.0F, 0.75F, 4, 1, 1, 0.0F, false));

        this.Siphon = new AdvancedModelRenderer(this);
        this.Siphon.setRotationPoint(0.0F, 1.7F, 1.825F);
        this.Mantle.addChild(Siphon);
        this.setRotateAngle(Siphon, -0.1745F, 0.0F, 0.0F);
        this.Siphon.cubeList.add(new ModelBox(Siphon, 12, 6, -0.5F, -0.5F, -1.5F, 1, 1, 3, 0.0F, false));

        this.Tentacle1a = new AdvancedModelRenderer(this);
        this.Tentacle1a.setRotationPoint(-0.5F, 1.0F, 3.425F);
        this.Mantle.addChild(Tentacle1a);
        this.setRotateAngle(Tentacle1a, -0.1789F, -0.0215F, 0.0039F);
        this.Tentacle1a.cubeList.add(new ModelBox(Tentacle1a, 30, 38, -0.5F, -0.55F, 0.0F, 1, 1, 4, 0.0F, false));

        this.Tentacle1b = new AdvancedModelRenderer(this);
        this.Tentacle1b.setRotationPoint(0.0F, 0.0F, 3.5F);
        this.Tentacle1a.addChild(Tentacle1b);
        this.setRotateAngle(Tentacle1b, 0.385F, 0.0728F, 0.0295F);
        this.Tentacle1b.cubeList.add(new ModelBox(Tentacle1b, 34, 28, -0.5F, -0.55F, 0.0F, 1, 1, 4, 0.0F, false));

        this.Tentacle2a = new AdvancedModelRenderer(this);
        this.Tentacle2a.setRotationPoint(-1.45F, 1.0F, 3.425F);
        this.Mantle.addChild(Tentacle2a);
        this.setRotateAngle(Tentacle2a, -0.1178F, 0.0F, 0.6109F);
        this.Tentacle2a.cubeList.add(new ModelBox(Tentacle2a, 38, 11, -0.5F, -0.55F, 0.0F, 1, 1, 4, 0.0F, false));

        this.Tentacle2b = new AdvancedModelRenderer(this);
        this.Tentacle2b.setRotationPoint(0.0F, 0.0F, 3.5F);
        this.Tentacle2a.addChild(Tentacle2b);
        this.Tentacle2b.cubeList.add(new ModelBox(Tentacle2b, 24, 34, -0.5F, -0.55F, 0.0F, 1, 1, 4, 0.0F, false));

        this.Tentacle2c = new AdvancedModelRenderer(this);
        this.Tentacle2c.setRotationPoint(0.0F, 0.0F, 3.5F);
        this.Tentacle2b.addChild(Tentacle2c);
        this.setRotateAngle(Tentacle2c, 0.0859F, -0.0151F, 0.1739F);
        this.Tentacle2c.cubeList.add(new ModelBox(Tentacle2c, 28, 29, -0.5F, -0.55F, 0.0F, 1, 1, 4, 0.0F, false));

        this.Tentacle2d = new AdvancedModelRenderer(this);
        this.Tentacle2d.setRotationPoint(0.0F, 0.0F, 3.5F);
        this.Tentacle2c.addChild(Tentacle2d);
        this.setRotateAngle(Tentacle2d, 0.0F, -0.0436F, 0.0F);
        this.Tentacle2d.cubeList.add(new ModelBox(Tentacle2d, 12, 20, -1.0F, -0.55F, 0.0F, 2, 1, 4, 0.0F, false));

        this.Tentacle2e = new AdvancedModelRenderer(this);
        this.Tentacle2e.setRotationPoint(0.0F, 0.0F, 3.5F);
        this.Tentacle2d.addChild(Tentacle2e);
        this.setRotateAngle(Tentacle2e, 0.2182F, 0.0F, 0.0F);
        this.Tentacle2e.cubeList.add(new ModelBox(Tentacle2e, 34, 17, -0.5F, -0.55F, 0.0F, 1, 1, 4, 0.0F, false));

        this.Tentacle3a = new AdvancedModelRenderer(this);
        this.Tentacle3a.setRotationPoint(-1.45F, 0.0F, 3.425F);
        this.Mantle.addChild(Tentacle3a);
        this.setRotateAngle(Tentacle3a, 0.0F, -0.2487F, 0.0F);
        this.Tentacle3a.cubeList.add(new ModelBox(Tentacle3a, 10, 38, -0.5F, -0.5F, 0.0F, 1, 1, 4, 0.0F, false));

        this.Tentacle3b = new AdvancedModelRenderer(this);
        this.Tentacle3b.setRotationPoint(0.0F, 0.0F, 3.5F);
        this.Tentacle3a.addChild(Tentacle3b);
        this.setRotateAngle(Tentacle3b, -0.0785F, 0.5534F, -0.0209F);
        this.Tentacle3b.cubeList.add(new ModelBox(Tentacle3b, 18, 33, -0.5F, -0.5F, 0.0F, 1, 1, 4, 0.0F, false));

        this.Tentacle4a = new AdvancedModelRenderer(this);
        this.Tentacle4a.setRotationPoint(-1.45F, -0.925F, 3.425F);
        this.Mantle.addChild(Tentacle4a);
        this.setRotateAngle(Tentacle4a, 0.1614F, 0.0F, -0.7854F);
        this.Tentacle4a.cubeList.add(new ModelBox(Tentacle4a, 0, 38, -0.5F, -0.5F, 0.0F, 1, 1, 4, 0.0F, false));

        this.Tentacle4b = new AdvancedModelRenderer(this);
        this.Tentacle4b.setRotationPoint(0.0F, 0.0F, 3.5F);
        this.Tentacle4a.addChild(Tentacle4b);
        this.setRotateAngle(Tentacle4b, -0.2227F, -0.0426F, 0.0096F);
        this.Tentacle4b.cubeList.add(new ModelBox(Tentacle4b, 22, 28, -0.5F, -0.5F, 0.0F, 1, 1, 4, 0.0F, false));

        this.Tentacle5a = new AdvancedModelRenderer(this);
        this.Tentacle5a.setRotationPoint(-0.45F, -0.925F, 3.425F);
        this.Mantle.addChild(Tentacle5a);
        this.setRotateAngle(Tentacle5a, 0.2662F, -0.0253F, -0.0069F);
        this.Tentacle5a.cubeList.add(new ModelBox(Tentacle5a, 34, 33, -0.5F, -0.5F, 0.0F, 1, 1, 4, 0.0F, false));

        this.Tentacle5a2 = new AdvancedModelRenderer(this);
        this.Tentacle5a2.setRotationPoint(0.0F, 0.0F, 3.5F);
        this.Tentacle5a.addChild(Tentacle5a2);
        this.setRotateAngle(Tentacle5a2, -0.336F, 0.0206F, -0.0072F);
        this.Tentacle5a2.cubeList.add(new ModelBox(Tentacle5a2, 28, 21, -0.5F, -0.5F, 0.0F, 1, 1, 4, 0.0F, false));

        this.Tentacle6a = new AdvancedModelRenderer(this);
        this.Tentacle6a.setRotationPoint(0.5F, 1.0F, 3.425F);
        this.Mantle.addChild(Tentacle6a);
        this.setRotateAngle(Tentacle6a, -0.1789F, 0.0215F, -0.0039F);
        this.Tentacle6a.cubeList.add(new ModelBox(Tentacle6a, 30, 38, -0.5F, -0.55F, 0.0F, 1, 1, 4, 0.0F, true));

        this.Tentacle6b = new AdvancedModelRenderer(this);
        this.Tentacle6b.setRotationPoint(0.0F, 0.0F, 3.5F);
        this.Tentacle6a.addChild(Tentacle6b);
        this.setRotateAngle(Tentacle6b, 0.385F, -0.0728F, -0.0295F);
        this.Tentacle6b.cubeList.add(new ModelBox(Tentacle6b, 34, 28, -0.5F, -0.55F, 0.0F, 1, 1, 4, 0.0F, true));

        this.Tentacle7a = new AdvancedModelRenderer(this);
        this.Tentacle7a.setRotationPoint(1.45F, 1.0F, 3.425F);
        this.Mantle.addChild(Tentacle7a);
        this.setRotateAngle(Tentacle7a, -0.1178F, 0.0F, -0.6109F);
        this.Tentacle7a.cubeList.add(new ModelBox(Tentacle7a, 38, 11, -0.5F, -0.55F, 0.0F, 1, 1, 4, 0.0F, true));

        this.Tentacle7b = new AdvancedModelRenderer(this);
        this.Tentacle7b.setRotationPoint(0.0F, 0.0F, 3.5F);
        this.Tentacle7a.addChild(Tentacle7b);
        this.Tentacle7b.cubeList.add(new ModelBox(Tentacle7b, 24, 34, -0.5F, -0.55F, 0.0F, 1, 1, 4, 0.0F, true));

        this.Tentacle7c = new AdvancedModelRenderer(this);
        this.Tentacle7c.setRotationPoint(0.0F, 0.0F, 3.5F);
        this.Tentacle7b.addChild(Tentacle7c);
        this.setRotateAngle(Tentacle7c, 0.0859F, 0.0151F, -0.1739F);
        this.Tentacle7c.cubeList.add(new ModelBox(Tentacle7c, 28, 29, -0.5F, -0.55F, 0.0F, 1, 1, 4, 0.0F, true));

        this.Tentacle7d = new AdvancedModelRenderer(this);
        this.Tentacle7d.setRotationPoint(0.0F, 0.0F, 3.5F);
        this.Tentacle7c.addChild(Tentacle7d);
        this.setRotateAngle(Tentacle7d, 0.0F, 0.0436F, 0.0F);
        this.Tentacle7d.cubeList.add(new ModelBox(Tentacle7d, 12, 20, -1.0F, -0.55F, 0.0F, 2, 1, 4, 0.0F, true));

        this.Tentacle7e = new AdvancedModelRenderer(this);
        this.Tentacle7e.setRotationPoint(0.0F, 0.0F, 3.5F);
        this.Tentacle7d.addChild(Tentacle7e);
        this.setRotateAngle(Tentacle7e, 0.2182F, 0.0F, 0.0F);
        this.Tentacle7e.cubeList.add(new ModelBox(Tentacle7e, 34, 17, -0.5F, -0.55F, 0.0F, 1, 1, 4, 0.0F, true));

        this.Tentacle8a = new AdvancedModelRenderer(this);
        this.Tentacle8a.setRotationPoint(1.45F, 0.0F, 3.425F);
        this.Mantle.addChild(Tentacle8a);
        this.setRotateAngle(Tentacle8a, 0.0F, 0.2487F, 0.0F);
        this.Tentacle8a.cubeList.add(new ModelBox(Tentacle8a, 10, 38, -0.5F, -0.5F, 0.0F, 1, 1, 4, 0.0F, true));

        this.Tentacle8b = new AdvancedModelRenderer(this);
        this.Tentacle8b.setRotationPoint(0.0F, 0.0F, 3.5F);
        this.Tentacle8a.addChild(Tentacle8b);
        this.setRotateAngle(Tentacle8b, -0.0785F, -0.5534F, 0.0209F);
        this.Tentacle8b.cubeList.add(new ModelBox(Tentacle8b, 18, 33, -0.5F, -0.5F, 0.0F, 1, 1, 4, 0.0F, true));

        this.Tentacle9a = new AdvancedModelRenderer(this);
        this.Tentacle9a.setRotationPoint(1.45F, -0.925F, 3.425F);
        this.Mantle.addChild(Tentacle9a);
        this.setRotateAngle(Tentacle9a, 0.1614F, 0.0F, 0.7854F);
        this.Tentacle9a.cubeList.add(new ModelBox(Tentacle9a, 0, 38, -0.5F, -0.5F, 0.0F, 1, 1, 4, 0.0F, true));

        this.Tentacle9b = new AdvancedModelRenderer(this);
        this.Tentacle9b.setRotationPoint(0.0F, 0.0F, 3.5F);
        this.Tentacle9a.addChild(Tentacle9b);
        this.setRotateAngle(Tentacle9b, -0.2227F, 0.0426F, -0.0096F);
        this.Tentacle9b.cubeList.add(new ModelBox(Tentacle9b, 22, 28, -0.5F, -0.5F, 0.0F, 1, 1, 4, 0.0F, true));

        this.Tentacle10a = new AdvancedModelRenderer(this);
        this.Tentacle10a.setRotationPoint(0.45F, -0.925F, 3.425F);
        this.Mantle.addChild(Tentacle10a);
        this.setRotateAngle(Tentacle10a, 0.2662F, 0.0253F, 0.0069F);
        this.Tentacle10a.cubeList.add(new ModelBox(Tentacle10a, 34, 33, -0.5F, -0.5F, 0.0F, 1, 1, 4, 0.0F, true));

        this.Tentacle10b = new AdvancedModelRenderer(this);
        this.Tentacle10b.setRotationPoint(0.0F, 0.0F, 3.5F);
        this.Tentacle10a.addChild(Tentacle10b);
        this.setRotateAngle(Tentacle10b, -0.336F, -0.0206F, 0.0072F);
        this.Tentacle10b.cubeList.add(new ModelBox(Tentacle10b, 28, 21, -0.5F, -0.5F, 0.0F, 1, 1, 4, 0.0F, true));
        updateDefaultPose();
        animator = ModelAnimator.create();
    }

    @Override
    public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        animate((IAnimatedEntity) entity, f, f1, f2, f3, f4, f5);
        this.Root.render(f5);
    }

    public void renderStaticWall(float f) {
        this.Root.rotateAngleY = (float) Math.toRadians(90);
        this.Root.offsetY = -0.2F;
        this.Root.offsetX = -0.15F;
        this.Root.offsetZ = -0.4F;
        this.Root.render(0.01F);
        resetToDefaultPose();
    }

    public void renderStaticFloor(float f) {
        this.Root.offsetZ = -0.1F;
        this.Root.offsetY = -0.03F;
        this.Root.offsetX = -0.02F;
        this.Root.render(0.01F);
        resetToDefaultPose();
    }

    @Override
    public void renderStaticBook(float f) {
        //Rotations, positions and sizing:
        this.Root.offsetY = -1.2F;
        this.Root.offsetX = 0.038F;
        this.Root.rotateAngleY = (float)Math.toRadians(242);
        this.Root.rotateAngleX = (float)Math.toRadians(8);
        this.Root.rotateAngleZ = (float)Math.toRadians(-8);
        this.Root.scaleChildren = true;
        float scaler = 1.53F;
        this.Root.setScale(scaler, scaler, scaler);
        //Start of pose:

        //End of pose, now render the model:
        this.Root.render(f);
        //Reset rotations, positions and sizing:
        this.Root.setScale(1.0F, 1.0F, 1.0F);
        this.Root.scaleChildren = false;
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
        EntityPrehistoricFloraHamulina ee = (EntityPrehistoricFloraHamulina) entitylivingbaseIn;

            if (ee.getIsFast()) { //Running
                animRunning(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime);
            } else {
                animWalking(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime);
            }
            

    }

    public void animWalking(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime) {
        EntityPrehistoricFloraHamulina entity = (EntityPrehistoricFloraHamulina) entitylivingbaseIn;
        int animCycle = 25;
        double tickAnim = (entity.ticksExisted + entity.getTickOffset()) - (int) (Math.floor((double) (entity.ticksExisted + entity.getTickOffset()) / (double) animCycle) * (double) animCycle) + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;
        this.setRotateAngle(Root, Root.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*288))*0.5), Root.rotateAngleY + (float) Math.toRadians(0), Root.rotateAngleZ + (float) Math.toRadians(0));
        this.Root.rotationPointX = this.Root.rotationPointX + (float)(0);
        this.Root.rotationPointY = this.Root.rotationPointY - (float)(0);
        this.Root.rotationPointZ = this.Root.rotationPointZ + (float)(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*90/0.314-50))*0.2);
        this.setRotateAngle(Mantle, Mantle.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*288))*0.3), Mantle.rotateAngleY + (float) Math.toRadians(0), Mantle.rotateAngleZ + (float) Math.toRadians(0));
        this.Mantle.setScale((float)1,(float)1,(float)(1+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*288))*0.006));
        this.Siphon.setScale((float)(1+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*288))*0.02),(float)(1+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*288))*0.05),(float)(1+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*288))*0.07));
        this.setRotateAngle(Tentacle1a, Tentacle1a.rotateAngleX + (float) Math.toRadians(-1.5+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*90/0.314-20))*-1.5), Tentacle1a.rotateAngleY + (float) Math.toRadians(0), Tentacle1a.rotateAngleZ + (float) Math.toRadians(0));
        this.setRotateAngle(Tentacle1b, Tentacle1b.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*90/0.314-120))*-2), Tentacle1b.rotateAngleY + (float) Math.toRadians(0), Tentacle1b.rotateAngleZ + (float) Math.toRadians(0));
        this.setRotateAngle(Tentacle2a, Tentacle2a.rotateAngleX + (float) Math.toRadians(3.75+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*90/0.313+30))*-0.3), Tentacle2a.rotateAngleY + (float) Math.toRadians(0), Tentacle2a.rotateAngleZ + (float) Math.toRadians(0));
        this.setRotateAngle(Tentacle2b, Tentacle2b.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*90/0.313+50))*-0.8), Tentacle2b.rotateAngleY + (float) Math.toRadians(0), Tentacle2b.rotateAngleZ + (float) Math.toRadians(0));
        this.setRotateAngle(Tentacle2c, Tentacle2c.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*90/0.313+100))*1.2), Tentacle2c.rotateAngleY + (float) Math.toRadians(0), Tentacle2c.rotateAngleZ + (float) Math.toRadians(0));
        this.setRotateAngle(Tentacle2d, Tentacle2d.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*90/0.313+200))*1.8), Tentacle2d.rotateAngleY + (float) Math.toRadians(0), Tentacle2d.rotateAngleZ + (float) Math.toRadians(0));
        this.setRotateAngle(Tentacle2e, Tentacle2e.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*90/0.313+250))*-2.5), Tentacle2e.rotateAngleY + (float) Math.toRadians(0), Tentacle2e.rotateAngleZ + (float) Math.toRadians(0));
        this.setRotateAngle(Tentacle3a, Tentacle3a.rotateAngleX + (float) Math.toRadians(0), Tentacle3a.rotateAngleY + (float) Math.toRadians(7+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*90/0.314+50))*-1.3), Tentacle3a.rotateAngleZ + (float) Math.toRadians(0));
        this.setRotateAngle(Tentacle3b, Tentacle3b.rotateAngleX + (float) Math.toRadians(0), Tentacle3b.rotateAngleY + (float) Math.toRadians(-13.5+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*90/0.314+120))*2.5), Tentacle3b.rotateAngleZ + (float) Math.toRadians(0));
        this.setRotateAngle(Tentacle4a, Tentacle4a.rotateAngleX + (float) Math.toRadians(-10.25+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*90/0.314+10))*0.8), Tentacle4a.rotateAngleY + (float) Math.toRadians(0), Tentacle4a.rotateAngleZ + (float) Math.toRadians(0));
        this.setRotateAngle(Tentacle4b, Tentacle4b.rotateAngleX + (float) Math.toRadians(4.25+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*90/0.314-50))*2), Tentacle4b.rotateAngleY + (float) Math.toRadians(0), Tentacle4b.rotateAngleZ + (float) Math.toRadians(0));
        this.setRotateAngle(Tentacle5a, Tentacle5a.rotateAngleX + (float) Math.toRadians(-9.75+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*90/0.314-30))*1.5), Tentacle5a.rotateAngleY + (float) Math.toRadians(0), Tentacle5a.rotateAngleZ + (float) Math.toRadians(0));
        this.setRotateAngle(Tentacle5a2, Tentacle5a2.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*90/0.314-130))*2), Tentacle5a2.rotateAngleY + (float) Math.toRadians(0), Tentacle5a2.rotateAngleZ + (float) Math.toRadians(0));
        this.setRotateAngle(Tentacle6a, Tentacle6a.rotateAngleX + (float) Math.toRadians(-1.5+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*90/0.314-20))*-1.5), Tentacle6a.rotateAngleY + (float) Math.toRadians(0), Tentacle6a.rotateAngleZ + (float) Math.toRadians(0));
        this.setRotateAngle(Tentacle6b, Tentacle6b.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*90/0.314-120))*-2), Tentacle6b.rotateAngleY + (float) Math.toRadians(0), Tentacle6b.rotateAngleZ + (float) Math.toRadians(0));
        this.setRotateAngle(Tentacle7a, Tentacle7a.rotateAngleX + (float) Math.toRadians(3.75+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*90/0.313+30))*-0.3), Tentacle7a.rotateAngleY + (float) Math.toRadians(0), Tentacle7a.rotateAngleZ + (float) Math.toRadians(0));
        this.setRotateAngle(Tentacle7b, Tentacle7b.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*90/0.313+50))*-0.8), Tentacle7b.rotateAngleY + (float) Math.toRadians(0), Tentacle7b.rotateAngleZ + (float) Math.toRadians(0));
        this.setRotateAngle(Tentacle7c, Tentacle7c.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*90/0.313+100))*1.2), Tentacle7c.rotateAngleY + (float) Math.toRadians(0), Tentacle7c.rotateAngleZ + (float) Math.toRadians(0));
        this.setRotateAngle(Tentacle7d, Tentacle7d.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*90/0.313+209))*1.8), Tentacle7d.rotateAngleY + (float) Math.toRadians(0), Tentacle7d.rotateAngleZ + (float) Math.toRadians(0));
        this.setRotateAngle(Tentacle7e, Tentacle7e.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*90/0.313+255))*-2.5), Tentacle7e.rotateAngleY + (float) Math.toRadians(0), Tentacle7e.rotateAngleZ + (float) Math.toRadians(0));
        this.setRotateAngle(Tentacle8a, Tentacle8a.rotateAngleX + (float) Math.toRadians(0), Tentacle8a.rotateAngleY + (float) Math.toRadians(-7+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*90/0.314+50))*1.3), Tentacle8a.rotateAngleZ + (float) Math.toRadians(0));
        this.setRotateAngle(Tentacle8b, Tentacle8b.rotateAngleX + (float) Math.toRadians(0), Tentacle8b.rotateAngleY + (float) Math.toRadians(13.5+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*90/0.314+120))*-2.5), Tentacle8b.rotateAngleZ + (float) Math.toRadians(0));
        this.setRotateAngle(Tentacle9a, Tentacle9a.rotateAngleX + (float) Math.toRadians(-10.25+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*90/0.314+10))*0.8), Tentacle9a.rotateAngleY + (float) Math.toRadians(0), Tentacle9a.rotateAngleZ + (float) Math.toRadians(0));
        this.setRotateAngle(Tentacle9b, Tentacle9b.rotateAngleX + (float) Math.toRadians(4.25+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*90/0.314-50))*2), Tentacle9b.rotateAngleY + (float) Math.toRadians(0), Tentacle9b.rotateAngleZ + (float) Math.toRadians(0));
        this.setRotateAngle(Tentacle10a, Tentacle10a.rotateAngleX + (float) Math.toRadians(-9.75+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*90/0.314-20))*1.5), Tentacle10a.rotateAngleY + (float) Math.toRadians(0), Tentacle10a.rotateAngleZ + (float) Math.toRadians(0));
        this.setRotateAngle(Tentacle10b, Tentacle10b.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*90/0.314-120))*2), Tentacle10b.rotateAngleY + (float) Math.toRadians(0), Tentacle10b.rotateAngleZ + (float) Math.toRadians(0));
      
    }
    public void animRunning(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime) {
        EntityPrehistoricFloraHamulina entity = (EntityPrehistoricFloraHamulina) entitylivingbaseIn;
        int animCycle = 15;
        double tickAnim = (entity.ticksExisted + entity.getTickOffset()) - (int) (Math.floor((double) (entity.ticksExisted + entity.getTickOffset()) / (double) animCycle) * (double) animCycle) + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;
        this.setRotateAngle(Root, Root.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*480))*0.8), Root.rotateAngleY + (float) Math.toRadians(0), Root.rotateAngleZ + (float) Math.toRadians(0));
        this.Root.rotationPointX = this.Root.rotationPointX + (float)(0);
        this.Root.rotationPointY = this.Root.rotationPointY - (float)(0);
        this.Root.rotationPointZ = this.Root.rotationPointZ + (float)(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*90/0.187-50))*0.45);
        this.setRotateAngle(Mantle, Mantle.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*480))*0.5), Mantle.rotateAngleY + (float) Math.toRadians(0), Mantle.rotateAngleZ + (float) Math.toRadians(0));
        this.Mantle.setScale((float)1,(float)1,(float)(1+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*480))*0.02));
        this.Siphon.setScale((float)(1+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*480))*0.05),(float)(1+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*480))*0.08),(float)(1+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*480))*0.1));
        this.setRotateAngle(Tentacle1a, Tentacle1a.rotateAngleX + (float) Math.toRadians(-6.25+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*90/0.188-20))*-5), Tentacle1a.rotateAngleY + (float) Math.toRadians(0), Tentacle1a.rotateAngleZ + (float) Math.toRadians(0));
        this.Tentacle1a.setScale((float)1,(float)1,(float)(1+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*480))*0.015));
        this.setRotateAngle(Tentacle1b, Tentacle1b.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*90/0.1875-90))*-15), Tentacle1b.rotateAngleY + (float) Math.toRadians(0), Tentacle1b.rotateAngleZ + (float) Math.toRadians(0));
        this.Tentacle1b.setScale((float)1,(float)1,(float)(1+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*480))*0.015));
        this.setRotateAngle(Tentacle2a, Tentacle2a.rotateAngleX + (float) Math.toRadians(-2.75+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*90/0.188+30))*-3), Tentacle2a.rotateAngleY + (float) Math.toRadians(0), Tentacle2a.rotateAngleZ + (float) Math.toRadians(0));
        this.setRotateAngle(Tentacle2b, Tentacle2b.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*90/0.188+50))*-5), Tentacle2b.rotateAngleY + (float) Math.toRadians(0), Tentacle2b.rotateAngleZ + (float) Math.toRadians(0));
        this.setRotateAngle(Tentacle2c, Tentacle2c.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*90/0.187+120))*7.5), Tentacle2c.rotateAngleY + (float) Math.toRadians(0), Tentacle2c.rotateAngleZ + (float) Math.toRadians(0));
        this.setRotateAngle(Tentacle2d, Tentacle2d.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*90/0.188+259))*-5.9), Tentacle2d.rotateAngleY + (float) Math.toRadians(0), Tentacle2d.rotateAngleZ + (float) Math.toRadians(0));
        this.setRotateAngle(Tentacle2e, Tentacle2e.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*90/0.188+225))*-9.8), Tentacle2e.rotateAngleY + (float) Math.toRadians(0), Tentacle2e.rotateAngleZ + (float) Math.toRadians(0));
        this.setRotateAngle(Tentacle3a, Tentacle3a.rotateAngleX + (float) Math.toRadians(0), Tentacle3a.rotateAngleY + (float) Math.toRadians(4+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*90/0.187+30))*-6), Tentacle3a.rotateAngleZ + (float) Math.toRadians(0));
        this.Tentacle3a.setScale((float)1,(float)1,(float)(1+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*480))*0.015));
        this.setRotateAngle(Tentacle3b, Tentacle3b.rotateAngleX + (float) Math.toRadians(0), Tentacle3b.rotateAngleY + (float) Math.toRadians(-13.5+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*90/0.188+130))*15), Tentacle3b.rotateAngleZ + (float) Math.toRadians(0));
        this.Tentacle3b.setScale((float)1,(float)1,(float)(1+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*480))*0.015));
        this.setRotateAngle(Tentacle4a, Tentacle4a.rotateAngleX + (float) Math.toRadians(-6.75+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*90/0.188))*8), Tentacle4a.rotateAngleY + (float) Math.toRadians(0), Tentacle4a.rotateAngleZ + (float) Math.toRadians(0));
        this.Tentacle4a.setScale((float)1,(float)1,(float)(1+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*480))*0.015));
        this.setRotateAngle(Tentacle4b, Tentacle4b.rotateAngleX + (float) Math.toRadians(4.25+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*90/0.187-80))*12), Tentacle4b.rotateAngleY + (float) Math.toRadians(0), Tentacle4b.rotateAngleZ + (float) Math.toRadians(0));
        this.Tentacle4b.setScale((float)1,(float)1,(float)(1+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*480))*0.015));
        this.setRotateAngle(Tentacle5a, Tentacle5a.rotateAngleX + (float) Math.toRadians(-3.25+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*90/0.188-20))*5), Tentacle5a.rotateAngleY + (float) Math.toRadians(0), Tentacle5a.rotateAngleZ + (float) Math.toRadians(0));
        this.Tentacle5a.setScale((float)1,(float)1,(float)(1+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*480))*0.015));
        this.setRotateAngle(Tentacle5a2, Tentacle5a2.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*90/0.188-100))*15), Tentacle5a2.rotateAngleY + (float) Math.toRadians(0), Tentacle5a2.rotateAngleZ + (float) Math.toRadians(0));
        this.Tentacle5a2.setScale((float)1,(float)1,(float)(1+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*480))*0.015));
        this.setRotateAngle(Tentacle6a, Tentacle6a.rotateAngleX + (float) Math.toRadians(-6.25+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*90/0.188-20))*-5), Tentacle6a.rotateAngleY + (float) Math.toRadians(0), Tentacle6a.rotateAngleZ + (float) Math.toRadians(0));
        this.Tentacle6a.setScale((float)1,(float)1,(float)(1+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*480))*0.015));
        this.setRotateAngle(Tentacle6b, Tentacle6b.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*90/0.1875-90))*-15), Tentacle6b.rotateAngleY + (float) Math.toRadians(0), Tentacle6b.rotateAngleZ + (float) Math.toRadians(0));
        this.Tentacle6b.setScale((float)1,(float)1,(float)(1+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*480))*0.015));
        this.setRotateAngle(Tentacle7a, Tentacle7a.rotateAngleX + (float) Math.toRadians(-2.75+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*90/0.188+30))*-3), Tentacle7a.rotateAngleY + (float) Math.toRadians(0), Tentacle7a.rotateAngleZ + (float) Math.toRadians(0));
        this.setRotateAngle(Tentacle7b, Tentacle7b.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*90/0.188+50))*-5), Tentacle7b.rotateAngleY + (float) Math.toRadians(0), Tentacle7b.rotateAngleZ + (float) Math.toRadians(0));
        this.setRotateAngle(Tentacle7c, Tentacle7c.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*90/0.187+120))*7.5), Tentacle7c.rotateAngleY + (float) Math.toRadians(0), Tentacle7c.rotateAngleZ + (float) Math.toRadians(0));
        this.setRotateAngle(Tentacle7d, Tentacle7d.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*90/0.188+259))*-5.9), Tentacle7d.rotateAngleY + (float) Math.toRadians(0), Tentacle7d.rotateAngleZ + (float) Math.toRadians(0));
        this.Tentacle7d.setScale((float)1,(float)1,(float)(1+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*480))*0.015));
        this.setRotateAngle(Tentacle7e, Tentacle7e.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*90/0.188+225))*-9.8), Tentacle7e.rotateAngleY + (float) Math.toRadians(0), Tentacle7e.rotateAngleZ + (float) Math.toRadians(0));
        this.setRotateAngle(Tentacle8a, Tentacle8a.rotateAngleX + (float) Math.toRadians(0), Tentacle8a.rotateAngleY + (float) Math.toRadians(-4+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*90/0.187+30))*6), Tentacle8a.rotateAngleZ + (float) Math.toRadians(0));
        this.Tentacle8a.setScale((float)1,(float)1,(float)(1+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*480))*0.015));
        this.setRotateAngle(Tentacle8b, Tentacle8b.rotateAngleX + (float) Math.toRadians(0), Tentacle8b.rotateAngleY + (float) Math.toRadians(13.5+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*90/0.188+130))*-15), Tentacle8b.rotateAngleZ + (float) Math.toRadians(0));
        this.Tentacle8b.setScale((float)1,(float)1,(float)(1+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*480))*0.015));
        this.setRotateAngle(Tentacle9a, Tentacle9a.rotateAngleX + (float) Math.toRadians(-6.75+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*90/0.188))*8), Tentacle9a.rotateAngleY + (float) Math.toRadians(0), Tentacle9a.rotateAngleZ + (float) Math.toRadians(0));
        this.Tentacle9a.setScale((float)1,(float)1,(float)(1+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*480))*0.015));
        this.setRotateAngle(Tentacle9b, Tentacle9b.rotateAngleX + (float) Math.toRadians(4.25+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*90/0.187-80))*12), Tentacle9b.rotateAngleY + (float) Math.toRadians(0), Tentacle9b.rotateAngleZ + (float) Math.toRadians(0));
        this.Tentacle9b.setScale((float)1,(float)1,(float)(1+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*480))*0.015));
        this.setRotateAngle(Tentacle10a, Tentacle10a.rotateAngleX + (float) Math.toRadians(-3.25+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*90/0.188-20))*5), Tentacle10a.rotateAngleY + (float) Math.toRadians(0), Tentacle10a.rotateAngleZ + (float) Math.toRadians(0));
        this.Tentacle10a.setScale((float)1,(float)1,(float)(1+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*480))*0.015));
        this.setRotateAngle(Tentacle10b, Tentacle10b.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*90/0.187-100))*15), Tentacle10b.rotateAngleY + (float) Math.toRadians(0), Tentacle10b.rotateAngleZ + (float) Math.toRadians(0));
        this.Tentacle10b.setScale((float)1,(float)1,(float)(1+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*480))*0.015));
        
    }



    @Override
    public void setRotationAngles(float f, float f1, float f2, float f3, float f4, float f5, Entity e) {
        super.setRotationAngles(f, f1, f2, f3, f4, f5, e);
        //this.resetToDefaultPose();

        //this.body.offsetY = 1.50F;

        EntityPrehistoricFloraHamulina ee = (EntityPrehistoricFloraHamulina) e;

        if (!e.isInWater()) {
            this.Root.rotateAngleZ = (float) Math.toRadians(90);
            this.Root.offsetY = 0.3F;
            this.Root.offsetZ = 0.5F;
            this.Root.offsetX = 0.2F;
        }

    }

    public void animate(IAnimatedEntity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        animator.update(entity);
    }
}

