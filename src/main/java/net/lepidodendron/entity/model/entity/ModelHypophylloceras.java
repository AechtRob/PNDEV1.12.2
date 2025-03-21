package net.lepidodendron.entity.model.entity;

import net.ilexiconn.llibrary.client.model.ModelAnimator;
import net.ilexiconn.llibrary.client.model.tools.AdvancedModelRenderer;
import net.ilexiconn.llibrary.server.animation.IAnimatedEntity;
import net.lepidodendron.entity.EntityPrehistoricFloraHypophylloceras;
import net.lepidodendron.entity.model.ModelBasePalaeopedia;
import net.minecraft.client.model.ModelBox;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;

public class ModelHypophylloceras extends ModelBasePalaeopedia {
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
    private final AdvancedModelRenderer arm2a;
    private final AdvancedModelRenderer arm2b;
    private final AdvancedModelRenderer arm3a;
    private final AdvancedModelRenderer arm3b;
    private final AdvancedModelRenderer arm4a;
    private final AdvancedModelRenderer arm4b;
    private final AdvancedModelRenderer arm5a;
    private final AdvancedModelRenderer arm5b;
    private final AdvancedModelRenderer arm5c;
    private final AdvancedModelRenderer arm5d;
    private final AdvancedModelRenderer arm5e;
    private final AdvancedModelRenderer arm5f;
    private final AdvancedModelRenderer arm5g;
    private final AdvancedModelRenderer arm5h;
    private final AdvancedModelRenderer arm5i;
    private final AdvancedModelRenderer arm6a;
    private final AdvancedModelRenderer arm6b;
    private final AdvancedModelRenderer arm7a;
    private final AdvancedModelRenderer arm7b;
    private final AdvancedModelRenderer arm8a;
    private final AdvancedModelRenderer arm8b;
    private final AdvancedModelRenderer arm9a;
    private final AdvancedModelRenderer arm9b;
    private final AdvancedModelRenderer arm10a;
    private final AdvancedModelRenderer arm10b;
    private final AdvancedModelRenderer arm10c;
    private final AdvancedModelRenderer arm10d;
    private final AdvancedModelRenderer arm10e;
    private final AdvancedModelRenderer arm10f;
    private final AdvancedModelRenderer arm10g;
    private final AdvancedModelRenderer arm10h;
    private final AdvancedModelRenderer arm10i;
    private final AdvancedModelRenderer Shellbase;

    private ModelAnimator animator;

    public ModelHypophylloceras() {
        textureWidth = 64;
        textureHeight = 64;

        root = new AdvancedModelRenderer(this);
        root.setRotationPoint(0.0F, 19.0F, 0.0F);


        Shell1 = new AdvancedModelRenderer(this);
        Shell1.setRotationPoint(0.0F, 2.5F, 0.5F);
        root.addChild(Shell1);
        setRotateAngle(Shell1, 1.2984F, 0.0F, 0.0F);
        Shell1.cubeList.add(new ModelBox(Shell1, 0, 31, -2.5F, -3.175F, 3.0F, 5, 8, 3, 0.01F, false));

        Shell2 = new AdvancedModelRenderer(this);
        Shell2.setRotationPoint(-0.01F, 4.85F, 3.0F);
        Shell1.addChild(Shell2);
        setRotateAngle(Shell2, -0.6109F, 0.0F, 0.0F);
        Shell2.cubeList.add(new ModelBox(Shell2, 0, 13, -2.49F, -8.0F, -5.0F, 5, 8, 5, 0.0F, false));

        Shell3 = new AdvancedModelRenderer(this);
        Shell3.setRotationPoint(0.0F, 0.0F, -5.0F);
        Shell2.addChild(Shell3);
        setRotateAngle(Shell3, -0.6981F, 0.0F, 0.0F);
        Shell3.cubeList.add(new ModelBox(Shell3, 0, 0, -1.99F, -7.0F, -6.0F, 4, 7, 6, -0.01F, false));

        Shell4 = new AdvancedModelRenderer(this);
        Shell4.setRotationPoint(0.0F, 0.0F, -6.0F);
        Shell3.addChild(Shell4);
        setRotateAngle(Shell4, -0.6545F, 0.0F, 0.0F);
        Shell4.cubeList.add(new ModelBox(Shell4, 20, 12, -1.99F, -7.0F, -5.0F, 4, 7, 5, 0.01F, false));

        Shell5 = new AdvancedModelRenderer(this);
        Shell5.setRotationPoint(0.0F, 0.0F, -5.0F);
        Shell4.addChild(Shell5);
        setRotateAngle(Shell5, -0.8727F, 0.0F, 0.0F);
        Shell5.cubeList.add(new ModelBox(Shell5, 20, 0, -1.49F, -6.0F, -6.0F, 3, 6, 6, 0.0F, false));

        Shell6 = new AdvancedModelRenderer(this);
        Shell6.setRotationPoint(0.0F, 0.0F, -6.0F);
        Shell5.addChild(Shell6);
        setRotateAngle(Shell6, -0.7854F, 0.0F, 0.0F);
        Shell6.cubeList.add(new ModelBox(Shell6, 29, 30, -1.49F, -6.0F, -4.0F, 3, 6, 4, -0.01F, false));

        Shell7 = new AdvancedModelRenderer(this);
        Shell7.setRotationPoint(0.0F, 0.0F, -4.0F);
        Shell6.addChild(Shell7);
        setRotateAngle(Shell7, -0.8727F, 0.0F, 0.0F);
        Shell7.cubeList.add(new ModelBox(Shell7, 33, 7, -0.99F, -4.0F, -5.0F, 2, 4, 5, 0.01F, false));

        Shell8 = new AdvancedModelRenderer(this);
        Shell8.setRotationPoint(0.0F, 0.0F, -5.0F);
        Shell7.addChild(Shell8);
        setRotateAngle(Shell8, -1.0036F, 0.0F, 0.0F);
        Shell8.cubeList.add(new ModelBox(Shell8, 51, 38, -0.99F, -4.0F, -3.0F, 2, 4, 3, 0.0F, false));

        Shell9 = new AdvancedModelRenderer(this);
        Shell9.setRotationPoint(0.0F, 0.0F, -3.0F);
        Shell8.addChild(Shell9);
        setRotateAngle(Shell9, -0.5236F, 0.0F, 0.0F);
        Shell9.cubeList.add(new ModelBox(Shell9, 51, 14, -0.99F, -4.0F, -3.0F, 2, 4, 3, -0.01F, false));

        Mantle = new AdvancedModelRenderer(this);
        Mantle.setRotationPoint(0.0F, -1.65F, 6.05F);
        Shell1.addChild(Mantle);
        setRotateAngle(Mantle, -0.691F, 0.0F, 0.0F);
        Mantle.cubeList.add(new ModelBox(Mantle, 15, 24, -2.0F, 0.0F, -1.0F, 4, 5, 5, 0.0F, false));

        Mantle_r1 = new AdvancedModelRenderer(this);
        Mantle_r1.setRotationPoint(-2.8F, 1.225F, 2.575F);
        Mantle.addChild(Mantle_r1);
        setRotateAngle(Mantle_r1, 0.0464F, -0.3487F, -0.0159F);
        Mantle_r1.cubeList.add(new ModelBox(Mantle_r1, 15, 13, -0.7F, -1.0F, -1.0F, 2, 2, 2, 0.0F, true));
        Mantle_r1.cubeList.add(new ModelBox(Mantle_r1, 0, 0, -0.8F, -0.5F, -0.5F, 1, 1, 1, 0.0F, true));

        Mantle_r2 = new AdvancedModelRenderer(this);
        Mantle_r2.setRotationPoint(2.8F, 1.225F, 2.575F);
        Mantle.addChild(Mantle_r2);
        setRotateAngle(Mantle_r2, 0.0464F, 0.3487F, 0.0159F);
        Mantle_r2.cubeList.add(new ModelBox(Mantle_r2, 0, 0, -0.2F, -0.5F, -0.5F, 1, 1, 1, 0.0F, false));
        Mantle_r2.cubeList.add(new ModelBox(Mantle_r2, 15, 13, -1.3F, -1.0F, -1.0F, 2, 2, 2, 0.0F, false));

        Siphon = new AdvancedModelRenderer(this);
        Siphon.setRotationPoint(0.0F, 2.9F, 0.0F);
        Mantle.addChild(Siphon);
        setRotateAngle(Siphon, -0.2122F, 0.0F, 0.0F);
        Siphon.cubeList.add(new ModelBox(Siphon, 33, 19, -1.0F, 0.0F, 0.0F, 2, 2, 5, 0.0F, false));

        arm1a = new AdvancedModelRenderer(this);
        arm1a.setRotationPoint(-0.65F, 0.5F, 3.5F);
        Mantle.addChild(arm1a);
        setRotateAngle(arm1a, -0.2913F, -0.1321F, 0.0F);
        arm1a.cubeList.add(new ModelBox(arm1a, 33, 48, -0.5F, -0.5F, 0.0F, 1, 1, 5, 0.0F, false));

        arm1b = new AdvancedModelRenderer(this);
        arm1b.setRotationPoint(0.0F, 0.0F, 4.5F);
        arm1a.addChild(arm1b);
        setRotateAngle(arm1b, -0.2335F, 0.1061F, 0.0F);
        arm1b.cubeList.add(new ModelBox(arm1b, 49, 6, -0.5F, -0.5F, 0.0F, 1, 1, 5, 0.0F, false));

        arm2a = new AdvancedModelRenderer(this);
        arm2a.setRotationPoint(-1.15F, 1.25F, 3.5F);
        Mantle.addChild(arm2a);
        setRotateAngle(arm2a, -0.3786F, -0.1758F, 0.0F);
        arm2a.cubeList.add(new ModelBox(arm2a, 44, 47, -0.5F, -0.5F, 0.0F, 1, 1, 5, 0.0F, false));

        arm2b = new AdvancedModelRenderer(this);
        arm2b.setRotationPoint(0.0F, 0.0F, 4.5F);
        arm2a.addChild(arm2b);
        setRotateAngle(arm2b, -0.2335F, 0.1061F, 0.0F);
        arm2b.cubeList.add(new ModelBox(arm2b, 0, 48, -0.5F, -0.5F, 0.0F, 1, 1, 5, 0.0F, false));

        arm3a = new AdvancedModelRenderer(this);
        arm3a.setRotationPoint(-1.4F, 2.0F, 3.5F);
        Mantle.addChild(arm3a);
        setRotateAngle(arm3a, -0.4658F, -0.2194F, 0.0F);
        arm3a.cubeList.add(new ModelBox(arm3a, 46, 23, -0.5F, -0.5F, 0.0F, 1, 1, 5, 0.0F, false));

        arm3b = new AdvancedModelRenderer(this);
        arm3b.setRotationPoint(0.0F, 0.0F, 4.5F);
        arm3a.addChild(arm3b);
        setRotateAngle(arm3b, -0.2335F, 0.1061F, 0.0F);
        arm3b.cubeList.add(new ModelBox(arm3b, 26, 47, -0.5F, -0.5F, 0.0F, 1, 1, 5, 0.0F, false));

        arm4a = new AdvancedModelRenderer(this);
        arm4a.setRotationPoint(-1.15F, 2.5F, 3.0F);
        Mantle.addChild(arm4a);
        setRotateAngle(arm4a, -0.5531F, -0.2194F, 0.0F);
        arm4a.cubeList.add(new ModelBox(arm4a, 7, 46, -0.5F, -0.5F, 0.0F, 1, 1, 5, 0.0F, false));

        arm4b = new AdvancedModelRenderer(this);
        arm4b.setRotationPoint(0.0F, 0.0F, 4.5F);
        arm4a.addChild(arm4b);
        setRotateAngle(arm4b, -0.2335F, 0.1061F, 0.0F);
        arm4b.cubeList.add(new ModelBox(arm4b, 19, 46, -0.5F, -0.5F, 0.0F, 1, 1, 5, 0.0F, false));

        arm5a = new AdvancedModelRenderer(this);
        arm5a.setRotationPoint(-0.9F, 3.0F, 2.5F);
        Mantle.addChild(arm5a);
        setRotateAngle(arm5a, -0.6404F, -0.263F, 0.0F);
        arm5a.cubeList.add(new ModelBox(arm5a, 45, 32, -0.5F, -0.5F, 0.0F, 1, 1, 5, 0.0F, false));

        arm5b = new AdvancedModelRenderer(this);
        arm5b.setRotationPoint(0.0F, 0.0F, 4.5F);
        arm5a.addChild(arm5b);
        setRotateAngle(arm5b, -0.2335F, 0.1061F, 0.0F);
        arm5b.cubeList.add(new ModelBox(arm5b, 46, 0, -0.5F, -0.5F, 0.0F, 1, 1, 5, 0.0F, false));

        arm5c = new AdvancedModelRenderer(this);
        arm5c.setRotationPoint(0.0F, 0.0F, 4.5F);
        arm5b.addChild(arm5c);
        setRotateAngle(arm5c, 0.1155F, 0.1061F, 0.0F);
        arm5c.cubeList.add(new ModelBox(arm5c, 39, 26, -0.5F, -0.5F, 0.0F, 1, 1, 5, 0.0F, false));

        arm5d = new AdvancedModelRenderer(this);
        arm5d.setRotationPoint(0.0F, 0.0F, 4.75F);
        arm5c.addChild(arm5d);
        setRotateAngle(arm5d, 0.1592F, 0.1061F, 0.0F);
        arm5d.cubeList.add(new ModelBox(arm5d, 39, 1, -0.5F, -0.5F, 0.0F, 1, 1, 5, 0.0F, false));

        arm5e = new AdvancedModelRenderer(this);
        arm5e.setRotationPoint(0.0F, 0.0F, 4.5F);
        arm5d.addChild(arm5e);
        setRotateAngle(arm5e, 0.0413F, -0.0117F, -0.0013F);
        arm5e.cubeList.add(new ModelBox(arm5e, 39, 1, -0.5F, -0.5F, 0.0F, 1, 1, 5, 0.0F, false));

        arm5f = new AdvancedModelRenderer(this);
        arm5f.setRotationPoint(0.0F, 0.0F, 4.5F);
        arm5e.addChild(arm5f);
        setRotateAngle(arm5f, 0.0413F, -0.0117F, -0.0013F);
        arm5f.cubeList.add(new ModelBox(arm5f, 39, 1, -0.5F, -0.5F, 0.0F, 1, 1, 5, 0.0F, false));

        arm5g = new AdvancedModelRenderer(this);
        arm5g.setRotationPoint(0.0F, 0.0F, 4.5F);
        arm5f.addChild(arm5g);
        setRotateAngle(arm5g, 0.0413F, -0.0117F, -0.0013F);
        arm5g.cubeList.add(new ModelBox(arm5g, 39, 1, -0.5F, -0.5F, 0.0F, 1, 1, 5, 0.0F, false));

        arm5h = new AdvancedModelRenderer(this);
        arm5h.setRotationPoint(0.0F, 0.0F, 4.5F);
        arm5g.addChild(arm5h);
        setRotateAngle(arm5h, 0.0413F, -0.0117F, -0.0013F);
        arm5h.cubeList.add(new ModelBox(arm5h, 39, 1, -0.5F, -0.5F, 0.0F, 1, 1, 5, 0.0F, false));

        arm5i = new AdvancedModelRenderer(this);
        arm5i.setRotationPoint(0.0F, 0.0F, 4.5F);
        arm5h.addChild(arm5i);
        setRotateAngle(arm5i, 0.0413F, -0.0117F, -0.0013F);
        arm5i.cubeList.add(new ModelBox(arm5i, 39, 1, -0.5F, -0.5F, 0.0F, 1, 1, 5, 0.0F, false));

        arm6a = new AdvancedModelRenderer(this);
        arm6a.setRotationPoint(0.65F, 0.5F, 3.5F);
        Mantle.addChild(arm6a);
        setRotateAngle(arm6a, -0.2913F, 0.1321F, 0.0F);
        arm6a.cubeList.add(new ModelBox(arm6a, 37, 42, -0.5F, -0.5F, 0.0F, 1, 1, 5, 0.0F, false));

        arm6b = new AdvancedModelRenderer(this);
        arm6b.setRotationPoint(0.0F, 0.0F, 4.5F);
        arm6a.addChild(arm6b);
        setRotateAngle(arm6b, -0.2335F, -0.1061F, 0.0F);
        arm6b.cubeList.add(new ModelBox(arm6b, 44, 41, -0.5F, -0.5F, 0.0F, 1, 1, 5, 0.0F, false));

        arm7a = new AdvancedModelRenderer(this);
        arm7a.setRotationPoint(1.15F, 1.25F, 3.5F);
        Mantle.addChild(arm7a);
        setRotateAngle(arm7a, -0.3786F, 0.1758F, 0.0F);
        arm7a.cubeList.add(new ModelBox(arm7a, 42, 11, -0.5F, -0.5F, 0.0F, 1, 1, 5, 0.0F, false));

        arm7b = new AdvancedModelRenderer(this);
        arm7b.setRotationPoint(0.0F, 0.0F, 4.5F);
        arm7a.addChild(arm7b);
        setRotateAngle(arm7b, -0.2335F, -0.1061F, 0.0F);
        arm7b.cubeList.add(new ModelBox(arm7b, 42, 17, -0.5F, -0.5F, 0.0F, 1, 1, 5, 0.0F, false));

        arm8a = new AdvancedModelRenderer(this);
        arm8a.setRotationPoint(1.4F, 2.0F, 3.5F);
        Mantle.addChild(arm8a);
        setRotateAngle(arm8a, -0.4658F, 0.2194F, 0.0F);
        arm8a.cubeList.add(new ModelBox(arm8a, 30, 41, -0.5F, -0.5F, 0.0F, 1, 1, 5, 0.0F, false));

        arm8b = new AdvancedModelRenderer(this);
        arm8b.setRotationPoint(0.0F, 0.0F, 4.5F);
        arm8a.addChild(arm8b);
        setRotateAngle(arm8b, -0.2335F, -0.1061F, 0.0F);
        arm8b.cubeList.add(new ModelBox(arm8b, 0, 42, -0.5F, -0.5F, 0.0F, 1, 1, 5, 0.0F, false));

        arm9a = new AdvancedModelRenderer(this);
        arm9a.setRotationPoint(1.15F, 2.5F, 3.0F);
        Mantle.addChild(arm9a);
        setRotateAngle(arm9a, -0.5531F, 0.2194F, 0.0F);
        arm9a.cubeList.add(new ModelBox(arm9a, 11, 40, -0.5F, -0.5F, 0.0F, 1, 1, 5, 0.0F, false));

        arm9b = new AdvancedModelRenderer(this);
        arm9b.setRotationPoint(0.0F, 0.0F, 4.5F);
        arm9a.addChild(arm9b);
        setRotateAngle(arm9b, -0.2335F, -0.1061F, 0.0F);
        arm9b.cubeList.add(new ModelBox(arm9b, 23, 40, -0.5F, -0.5F, 0.0F, 1, 1, 5, 0.0F, false));

        arm10a = new AdvancedModelRenderer(this);
        arm10a.setRotationPoint(0.9F, 3.0F, 2.5F);
        Mantle.addChild(arm10a);
        setRotateAngle(arm10a, -0.6404F, 0.263F, 0.0F);
        arm10a.cubeList.add(new ModelBox(arm10a, 45, 32, -0.5F, -0.5F, 0.0F, 1, 1, 5, 0.0F, true));

        arm10b = new AdvancedModelRenderer(this);
        arm10b.setRotationPoint(0.0F, 0.0F, 4.5F);
        arm10a.addChild(arm10b);
        setRotateAngle(arm10b, -0.2335F, -0.1061F, 0.0F);
        arm10b.cubeList.add(new ModelBox(arm10b, 46, 0, -0.5F, -0.5F, 0.0F, 1, 1, 5, 0.0F, true));

        arm10c = new AdvancedModelRenderer(this);
        arm10c.setRotationPoint(0.0F, 0.0F, 4.5F);
        arm10b.addChild(arm10c);
        setRotateAngle(arm10c, 0.1155F, -0.1061F, 0.0F);
        arm10c.cubeList.add(new ModelBox(arm10c, 39, 26, -0.5F, -0.5F, 0.0F, 1, 1, 5, 0.0F, true));

        arm10d = new AdvancedModelRenderer(this);
        arm10d.setRotationPoint(0.0F, 0.0F, 4.75F);
        arm10c.addChild(arm10d);
        setRotateAngle(arm10d, 0.1592F, -0.1061F, 0.0F);
        arm10d.cubeList.add(new ModelBox(arm10d, 39, 1, -0.5F, -0.5F, 0.0F, 1, 1, 5, 0.0F, true));

        arm10e = new AdvancedModelRenderer(this);
        arm10e.setRotationPoint(0.0F, 0.0F, 4.5F);
        arm10d.addChild(arm10e);
        setRotateAngle(arm10e, 0.0413F, 0.0117F, 0.0013F);
        arm10e.cubeList.add(new ModelBox(arm10e, 39, 1, -0.5F, -0.5F, 0.0F, 1, 1, 5, 0.0F, true));

        arm10f = new AdvancedModelRenderer(this);
        arm10f.setRotationPoint(0.0F, 0.0F, 4.5F);
        arm10e.addChild(arm10f);
        setRotateAngle(arm10f, 0.0413F, 0.0117F, 0.0013F);
        arm10f.cubeList.add(new ModelBox(arm10f, 39, 1, -0.5F, -0.5F, 0.0F, 1, 1, 5, 0.0F, true));

        arm10g = new AdvancedModelRenderer(this);
        arm10g.setRotationPoint(0.0F, 0.0F, 4.5F);
        arm10f.addChild(arm10g);
        setRotateAngle(arm10g, 0.0413F, 0.0117F, 0.0013F);
        arm10g.cubeList.add(new ModelBox(arm10g, 39, 1, -0.5F, -0.5F, 0.0F, 1, 1, 5, 0.0F, true));

        arm10h = new AdvancedModelRenderer(this);
        arm10h.setRotationPoint(0.0F, 0.0F, 4.5F);
        arm10g.addChild(arm10h);
        setRotateAngle(arm10h, 0.0413F, 0.0117F, 0.0013F);
        arm10h.cubeList.add(new ModelBox(arm10h, 39, 1, -0.5F, -0.5F, 0.0F, 1, 1, 5, 0.0F, true));

        arm10i = new AdvancedModelRenderer(this);
        arm10i.setRotationPoint(0.0F, 0.0F, 4.5F);
        arm10h.addChild(arm10i);
        setRotateAngle(arm10i, 0.0413F, 0.0117F, 0.0013F);
        arm10i.cubeList.add(new ModelBox(arm10i, 39, 1, -0.5F, -0.5F, 0.0F, 1, 1, 5, 0.0F, true));

        Shellbase = new AdvancedModelRenderer(this);
        Shellbase.setRotationPoint(0.01F, 2.96F, 0.0F);
        Shell1.addChild(Shellbase);
        setRotateAngle(Shellbase, -0.1274F, 0.0F, 0.0F);
        
        updateDefaultPose();
        animator = ModelAnimator.create();
    }

    @Override
    public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        animate((IAnimatedEntity) entity, f, f1, f2, f3, f4, f5);
        this.root.render(f5);
    }

    public void renderStaticWall(float f) {
        this.root.rotateAngleY = (float) Math.toRadians(90);
        this.root.offsetY = -0.2F;
        this.root.offsetX = -0.15F;
        this.root.offsetZ = -0.4F;
        this.root.render(0.01F);
        resetToDefaultPose();
    }

    public void renderStaticFloor(float f) {
        this.root.offsetZ = -0.1F;
        this.root.offsetY = -0.03F;
        this.root.offsetX = -0.02F;
        this.root.render(0.01F);
        resetToDefaultPose();
    }

    @Override
    public void renderStaticBook(float f) {
        //Rotations, positions and sizing:
        this.root.offsetY = -1.2F;
        this.root.offsetX = 1.2F;
        this.root.rotateAngleY = (float)Math.toRadians(242);
        this.root.rotateAngleX = (float)Math.toRadians(-18);
        this.root.rotateAngleZ = (float)Math.toRadians(-8);
        this.root.scaleChildren = true;
        float scaler = 1.23F;
        this.root.setScale(scaler, scaler, scaler);
        //Start of pose:

        //End of pose, now render the model:
        this.root.render(f);
        //Reset rotations, positions and sizing:
        this.root.setScale(1.0F, 1.0F, 1.0F);
        this.root.scaleChildren = false;
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
        EntityPrehistoricFloraHypophylloceras ee = (EntityPrehistoricFloraHypophylloceras) entitylivingbaseIn;

            if (ee.getIsFast()) { //Running
                animRunning(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime);
            } else {
                animWalking(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime);
            }
            

    }

    public void animWalking(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime) {
        EntityPrehistoricFloraHypophylloceras entity = (EntityPrehistoricFloraHypophylloceras) entitylivingbaseIn;
        int animCycle = 25;
        double tickAnim = (entity.ticksExisted + entity.getTickOffset()) - (int) (Math.floor((double) (entity.ticksExisted + entity.getTickOffset()) / (double) animCycle) * (double) animCycle) + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;
        this.setRotateAngle(Shell1, Shell1.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*60/0.209-20))*1.2), Shell1.rotateAngleY + (float) Math.toRadians(0), Shell1.rotateAngleZ + (float) Math.toRadians(0));
        this.Shell1.rotationPointX = this.Shell1.rotationPointX + (float)(0);
        this.Shell1.rotationPointY = this.Shell1.rotationPointY - (float)(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180/0.625+5))*0.2);
        this.Shell1.rotationPointZ = this.Shell1.rotationPointZ + (float)(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180/0.625+5))*0.15);

        this.setRotateAngle(Mantle, Mantle.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*60/0.209-50))*0.3), Mantle.rotateAngleY + (float) Math.toRadians(0), Mantle.rotateAngleZ + (float) Math.toRadians(0));
        this.Mantle.setScale((float)1,(float)1,(float)(1+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180/0.623))*-0.01));
        this.Siphon.setScale((float)1,(float)(1+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180/0.623))*0.08),(float)(1+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180/0.623))*0.02));
        this.setRotateAngle(arm1a, arm1a.rotateAngleX + (float) Math.toRadians(0.1111+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*60/0.209-50))*0.5), arm1a.rotateAngleY + (float) Math.toRadians(3.58592), arm1a.rotateAngleZ + (float) Math.toRadians(-1.10291));
        this.setRotateAngle(arm1b, arm1b.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*60/0.209-100))*1.5), arm1b.rotateAngleY + (float) Math.toRadians(0), arm1b.rotateAngleZ + (float) Math.toRadians(0));
        this.setRotateAngle(arm6a, arm6a.rotateAngleX + (float) Math.toRadians(0.1111+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*60/0.209-50))*0.5), arm6a.rotateAngleY + (float) Math.toRadians(-3.5859), arm6a.rotateAngleZ + (float) Math.toRadians(-1.10291));
        this.setRotateAngle(arm6b, arm6b.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*60/0.209-100))*1.5), arm6b.rotateAngleY + (float) Math.toRadians(0), arm6b.rotateAngleZ + (float) Math.toRadians(0));
        this.setRotateAngle(arm2a, arm2a.rotateAngleX + (float) Math.toRadians(0.2557+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*60/0.209-100))*0.5), arm2a.rotateAngleY + (float) Math.toRadians(4.6346), arm2a.rotateAngleZ + (float) Math.toRadians(1.89425));
        this.setRotateAngle(arm2b, arm2b.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*60/0.209-150))*1.5), arm2b.rotateAngleY + (float) Math.toRadians(0), arm2b.rotateAngleZ + (float) Math.toRadians(0));
        this.setRotateAngle(arm7a, arm7a.rotateAngleX + (float) Math.toRadians(0.2557+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*60/0.209-100))*0.5), arm7a.rotateAngleY + (float) Math.toRadians(-4.63456), arm7a.rotateAngleZ + (float) Math.toRadians(1.89425));
        this.setRotateAngle(arm7b, arm7b.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*60/0.209-150))*1.5), arm7b.rotateAngleY + (float) Math.toRadians(0), arm7b.rotateAngleZ + (float) Math.toRadians(0));
        this.setRotateAngle(arm3a, arm3a.rotateAngleX + (float) Math.toRadians(0.5874+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*60/0.209+200))*0.5), arm3a.rotateAngleY + (float) Math.toRadians(7.60539), arm3a.rotateAngleZ + (float) Math.toRadians(1.16492));
        this.setRotateAngle(arm3b, arm3b.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*60/0.209-150))*1.5), arm3b.rotateAngleY + (float) Math.toRadians(0), arm3b.rotateAngleZ + (float) Math.toRadians(0));
        this.setRotateAngle(arm8a, arm8a.rotateAngleX + (float) Math.toRadians(0.5874+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*60/0.209+200))*0.5), arm8a.rotateAngleY + (float) Math.toRadians(-7.6054), arm8a.rotateAngleZ + (float) Math.toRadians(1.16492));
        this.setRotateAngle(arm8b, arm8b.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*60/0.209-150))*1.5), arm8b.rotateAngleY + (float) Math.toRadians(0), arm8b.rotateAngleZ + (float) Math.toRadians(0));
        this.setRotateAngle(arm4a, arm4a.rotateAngleX + (float) Math.toRadians(0.5247+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*60/0.209-300))*-0.5), arm4a.rotateAngleY + (float) Math.toRadians(4.67242), arm4a.rotateAngleZ + (float) Math.toRadians(1.35721));
        this.setRotateAngle(arm4b, arm4b.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*60/0.209-350))*-1.5), arm4b.rotateAngleY + (float) Math.toRadians(0), arm4b.rotateAngleZ + (float) Math.toRadians(0));
        this.setRotateAngle(arm9a, arm9a.rotateAngleX + (float) Math.toRadians(0.4065+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*60/0.209-300))*-0.5), arm9a.rotateAngleY + (float) Math.toRadians(-3.39556), arm9a.rotateAngleZ + (float) Math.toRadians(2.15327));
        this.setRotateAngle(arm9b, arm9b.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*60/0.209-350))*-1.5), arm9b.rotateAngleY + (float) Math.toRadians(0), arm9b.rotateAngleZ + (float) Math.toRadians(0));
        this.setRotateAngle(arm5a, arm5a.rotateAngleX + (float) Math.toRadians(-0.8387+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*60/0.209-300))*-0.2), arm5a.rotateAngleY + (float) Math.toRadians(0), arm5a.rotateAngleZ + (float) Math.toRadians(2.89264));
        this.setRotateAngle(arm5b, arm5b.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*60/0.209-350))*-0.5), arm5b.rotateAngleY + (float) Math.toRadians(0), arm5b.rotateAngleZ + (float) Math.toRadians(0));
        this.setRotateAngle(arm5c, arm5c.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*60/0.209-400))*-0.5), arm5c.rotateAngleY + (float) Math.toRadians(0), arm5c.rotateAngleZ + (float) Math.toRadians(0));
        this.setRotateAngle(arm5d, arm5d.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*60/0.209-450))*0.8), arm5d.rotateAngleY + (float) Math.toRadians(0), arm5d.rotateAngleZ + (float) Math.toRadians(0));
        this.setRotateAngle(arm5e, arm5e.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*60/0.209-420))*1), arm5e.rotateAngleY + (float) Math.toRadians(0), arm5e.rotateAngleZ + (float) Math.toRadians(0));
        this.setRotateAngle(arm5f, arm5f.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*60/0.209-450))*1.2), arm5f.rotateAngleY + (float) Math.toRadians(0), arm5f.rotateAngleZ + (float) Math.toRadians(0));
        this.setRotateAngle(arm5g, arm5g.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*60/0.209-500))*1.5), arm5g.rotateAngleY + (float) Math.toRadians(0), arm5g.rotateAngleZ + (float) Math.toRadians(0));
        this.setRotateAngle(arm5h, arm5h.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*60/0.209-550))*1), arm5h.rotateAngleY + (float) Math.toRadians(0), arm5h.rotateAngleZ + (float) Math.toRadians(0));
        this.setRotateAngle(arm5i, arm5i.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*60/0.209-150))*2), arm5i.rotateAngleY + (float) Math.toRadians(0), arm5i.rotateAngleZ + (float) Math.toRadians(0));
        this.setRotateAngle(arm10a, arm10a.rotateAngleX + (float) Math.toRadians(-0.8387+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*60/0.209-300))*-0.2), arm10a.rotateAngleY + (float) Math.toRadians(0), arm10a.rotateAngleZ + (float) Math.toRadians(0));
        this.setRotateAngle(arm10b, arm10b.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*60/0.209-350))*-0.5), arm10b.rotateAngleY + (float) Math.toRadians(0), arm10b.rotateAngleZ + (float) Math.toRadians(0));
        this.setRotateAngle(arm10c, arm10c.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*60/0.209-400))*-0.5), arm10c.rotateAngleY + (float) Math.toRadians(0), arm10c.rotateAngleZ + (float) Math.toRadians(0));
        this.setRotateAngle(arm10d, arm10d.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*60/0.209-450))*0.8), arm10d.rotateAngleY + (float) Math.toRadians(0), arm10d.rotateAngleZ + (float) Math.toRadians(0));
        this.setRotateAngle(arm10e, arm10e.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*60/0.209-420))*1), arm10e.rotateAngleY + (float) Math.toRadians(0), arm10e.rotateAngleZ + (float) Math.toRadians(0));
        this.setRotateAngle(arm10f, arm10f.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*60/0.209-450))*1.2), arm10f.rotateAngleY + (float) Math.toRadians(0), arm10f.rotateAngleZ + (float) Math.toRadians(0));
        this.setRotateAngle(arm10g, arm10g.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*60/0.209-500))*1.5), arm10g.rotateAngleY + (float) Math.toRadians(0), arm10g.rotateAngleZ + (float) Math.toRadians(0));
        this.setRotateAngle(arm10h, arm10h.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*60/0.209-550))*1), arm10h.rotateAngleY + (float) Math.toRadians(0), arm10h.rotateAngleZ + (float) Math.toRadians(0));
        this.setRotateAngle(arm10i, arm10i.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*60/0.209-150))*2), arm10i.rotateAngleY + (float) Math.toRadians(0), arm10i.rotateAngleZ + (float) Math.toRadians(0));


    }
    public void animRunning(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime) {
        EntityPrehistoricFloraHypophylloceras entity = (EntityPrehistoricFloraHypophylloceras) entitylivingbaseIn;
        int animCycle = 15;
        double tickAnim = (entity.ticksExisted + entity.getTickOffset()) - (int) (Math.floor((double) (entity.ticksExisted + entity.getTickOffset()) / (double) animCycle) * (double) animCycle) + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;
        this.setRotateAngle(Shell1, Shell1.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*60/0.125-20))*3.5), Shell1.rotateAngleY + (float) Math.toRadians(0), Shell1.rotateAngleZ + (float) Math.toRadians(0));
        this.Shell1.rotationPointX = this.Shell1.rotationPointX + (float)(0);
        this.Shell1.rotationPointY = this.Shell1.rotationPointY - (float)(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180/0.378+20))*0.2);
        this.Shell1.rotationPointZ = this.Shell1.rotationPointZ + (float)(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180/0.376+15))*1.5);
        this.setRotateAngle(Mantle, Mantle.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*60/0.126-120))*1.5), Mantle.rotateAngleY + (float) Math.toRadians(0), Mantle.rotateAngleZ + (float) Math.toRadians(0));
        this.Mantle.setScale((float)1,(float)1,(float)(1+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180/0.37))*-0.009));
        this.Siphon.setScale((float)1,(float)(1+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180/0.37))*0.08),(float)(1+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180/0.37))*0.02));
        this.setRotateAngle(arm1a, arm1a.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*60/0.126-120))*0.5), arm1a.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*60/0.126-90))*4), arm1a.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*60/0.125+90))*1));
        this.setRotateAngle(arm1b, arm1b.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*60/0.126-120))*0.5), arm1b.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*60/0.125-170))*8), arm1b.rotateAngleZ + (float) Math.toRadians(0));
        this.setRotateAngle(arm6a, arm6a.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*60/0.126-120))*0.5), arm6a.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*60/0.126-90))*-4), arm6a.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*60/0.125+90))*1));
        this.setRotateAngle(arm6b, arm6b.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*60/0.126-120))*0.5), arm6b.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*60/0.125-170))*-8), arm6b.rotateAngleZ + (float) Math.toRadians(0));
        this.setRotateAngle(arm2a, arm2a.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*60/0.126-120))*0.5), arm2a.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*60/0.126-90))*4), arm2a.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*60/0.125+90))*1));
        this.setRotateAngle(arm2b, arm2b.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*60/0.126-120))*0.5), arm2b.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*60/0.125-170))*10), arm2b.rotateAngleZ + (float) Math.toRadians(0));
        this.setRotateAngle(arm7a, arm7a.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*60/0.126-120))*0.5), arm7a.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*60/0.126-90))*-4), arm7a.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*60/0.125+90))*1));
        this.setRotateAngle(arm7b, arm7b.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*60/0.126-120))*0.5), arm7b.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*60/0.125-170))*-10), arm7b.rotateAngleZ + (float) Math.toRadians(0));
        this.setRotateAngle(arm3a, arm3a.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*60/0.126-120))*0.5), arm3a.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*60/0.126-90))*4), arm3a.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*60/0.125+90))*1));
        this.setRotateAngle(arm3b, arm3b.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*60/0.126-120))*0.5), arm3b.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*60/0.125-170))*15), arm3b.rotateAngleZ + (float) Math.toRadians(0));
        this.setRotateAngle(arm8a, arm8a.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*60/0.126-120))*0.5), arm8a.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*60/0.126-90))*-4), arm8a.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*60/0.125+90))*1));
        this.setRotateAngle(arm8b, arm8b.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*60/0.126-120))*0.5), arm8b.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*60/0.125-170))*-15), arm8b.rotateAngleZ + (float) Math.toRadians(0));
        this.setRotateAngle(arm4a, arm4a.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*60/0.126-120))*0.5), arm4a.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*60/0.126-90))*4), arm4a.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*60/0.125+90))*1));
        this.setRotateAngle(arm4b, arm4b.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*60/0.126-120))*0.5), arm4b.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*60/0.125-170))*20), arm4b.rotateAngleZ + (float) Math.toRadians(0));
        this.setRotateAngle(arm9a, arm9a.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*60/0.126-120))*0.5), arm9a.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*60/0.126-90))*-4), arm9a.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*60/0.125+90))*1));
        this.setRotateAngle(arm9b, arm9b.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*60/0.126-120))*0.5), arm9b.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*60/0.125-170))*-20), arm9b.rotateAngleZ + (float) Math.toRadians(0));
        this.setRotateAngle(arm5a, arm5a.rotateAngleX + (float) Math.toRadians(-2.25+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*60/0.126-120))*0.5), arm5a.rotateAngleY + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*60/0.126-180))*-3), arm5a.rotateAngleZ + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*60/0.125+90))*1));
        this.setRotateAngle(arm5b, arm5b.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*60/0.126-120))*0.5), arm5b.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*60/0.126-220))*-5), arm5b.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*60/0.125+90))*1));
        this.setRotateAngle(arm5c, arm5c.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*60/0.126-120))*0.5), arm5c.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*60/0.126-320))*-8), arm5c.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*60/0.125+90))*1));
        this.setRotateAngle(arm5d, arm5d.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*60/0.126-120))*0.5), arm5d.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*60/0.126-370))*-12), arm5d.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*60/0.125+90))*1));
        this.setRotateAngle(arm5e, arm5e.rotateAngleX + (float) Math.toRadians(-3.75+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*60/0.126-120))*0.5), arm5e.rotateAngleY + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*60/0.126-180))*3), arm5e.rotateAngleZ + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*60/0.125+90))*1));
        this.setRotateAngle(arm5f, arm5f.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*60/0.126-120))*0.5), arm5f.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*60/0.126-220))*5), arm5f.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*60/0.125+90))*1));
        this.setRotateAngle(arm5g, arm5g.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*60/0.126-120))*0.5), arm5g.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*60/0.126-320))*8), arm5g.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*60/0.125+90))*1));
        this.setRotateAngle(arm5h, arm5h.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*60/0.126-120))*0.5), arm5h.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*60/0.126-370))*12), arm5h.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*60/0.125+90))*1));
        
    }

    @Override
    public void setRotationAngles(float f, float f1, float f2, float f3, float f4, float f5, Entity e) {
        super.setRotationAngles(f, f1, f2, f3, f4, f5, e);
        //this.resetToDefaultPose();

        //this.body.offsetY = 1.50F;

        EntityPrehistoricFloraHypophylloceras ee = (EntityPrehistoricFloraHypophylloceras) e;

        if (!e.isInWater()) {
            this.root.rotateAngleZ = (float) Math.toRadians(90);
            this.root.offsetY = 0.175F;
        }

    }

    public void animate(IAnimatedEntity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        animator.update(entity);
    }
}

