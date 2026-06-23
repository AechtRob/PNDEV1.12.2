package net.lepidodendron.entity.model.entity;

import net.ilexiconn.llibrary.client.model.ModelAnimator;
import net.ilexiconn.llibrary.client.model.tools.AdvancedModelRenderer;
import net.ilexiconn.llibrary.server.animation.IAnimatedEntity;
import net.lepidodendron.entity.EntityPrehistoricFloraEromangateuthis;
import net.lepidodendron.entity.model.ModelBasePalaeopedia;
import net.minecraft.client.model.ModelBox;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;

public class ModelEromangateuthis extends ModelBasePalaeopedia {
    private final AdvancedModelRenderer base;
    private final AdvancedModelRenderer body;
    private final AdvancedModelRenderer FinL;
    private final AdvancedModelRenderer FinL2;
    private final AdvancedModelRenderer body2;
    private final AdvancedModelRenderer siphon;
    private final AdvancedModelRenderer arm1a;
    private final AdvancedModelRenderer arm1b;
    private final AdvancedModelRenderer arm1c;
    private final AdvancedModelRenderer arm2a;
    private final AdvancedModelRenderer arm2b;
    private final AdvancedModelRenderer arm2c;
    private final AdvancedModelRenderer arm3a;
    private final AdvancedModelRenderer arm3b;
    private final AdvancedModelRenderer arm3c;
    private final AdvancedModelRenderer arm4a;
    private final AdvancedModelRenderer arm4b;
    private final AdvancedModelRenderer arm4c;
    private final AdvancedModelRenderer arm5a;
    private final AdvancedModelRenderer arm5b;
    private final AdvancedModelRenderer arm5c;
    private final AdvancedModelRenderer arm6a;
    private final AdvancedModelRenderer arm6b;
    private final AdvancedModelRenderer arm6c;
    private final AdvancedModelRenderer arm7a;
    private final AdvancedModelRenderer arm7b;
    private final AdvancedModelRenderer arm7c;
    private final AdvancedModelRenderer arm8a;
    private final AdvancedModelRenderer arm8b;
    private final AdvancedModelRenderer arm8c;
    private final AdvancedModelRenderer arm9a;
    private final AdvancedModelRenderer arm9b;
    private final AdvancedModelRenderer arm9c;
    private final AdvancedModelRenderer arm10a;
    private final AdvancedModelRenderer arm10b;
    private final AdvancedModelRenderer arm10c;

    private ModelAnimator animator;

    public ModelEromangateuthis() {
        this.textureWidth = 64;
        this.textureHeight = 64;

        this.base = new AdvancedModelRenderer(this);
        this.base.setRotationPoint(0.0F, 24.0F, 3.0F);


        this.body = new AdvancedModelRenderer(this);
        this.body.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.base.addChild(body);
        this.body.cubeList.add(new ModelBox(body, 0, 0, -4.5F, -6.0F, -7.0F, 9, 6, 10, 0.0F, false));
        this.body.cubeList.add(new ModelBox(body, 0, 16, -4.0F, -6.0F, -12.0F, 8, 6, 5, 0.0F, false));
        this.body.cubeList.add(new ModelBox(body, 0, 28, -3.5F, -5.5F, -16.0F, 7, 5, 4, 0.0F, false));
        this.body.cubeList.add(new ModelBox(body, 22, 32, -3.0F, -5.5F, -20.0F, 6, 5, 4, 0.0F, false));
        this.body.cubeList.add(new ModelBox(body, 0, 37, -2.5F, -5.0F, -23.0F, 5, 4, 3, 0.0F, false));
        this.body.cubeList.add(new ModelBox(body, 46, 0, -2.0F, -4.5F, -26.0F, 4, 3, 3, 0.0F, false));
        this.body.cubeList.add(new ModelBox(body, 54, 17, -1.5F, -4.0F, -27.0F, 3, 2, 1, 0.0F, false));

        this.FinL = new AdvancedModelRenderer(this);
        this.FinL.setRotationPoint(1.5F, -3.0F, -24.35F);
        this.body.addChild(FinL);
        this.FinL.cubeList.add(new ModelBox(FinL, 23, 0, 0.0F, 0.0F, -2.5F, 8, 0, 5, 0.0F, false));

        this.FinL2 = new AdvancedModelRenderer(this);
        this.FinL2.setRotationPoint(-1.5F, -3.0F, -24.35F);
        this.body.addChild(FinL2);
        this.FinL2.cubeList.add(new ModelBox(FinL2, 16, 16, -8.0F, 0.0F, -2.5F, 8, 0, 5, 0.0F, false));

        this.body2 = new AdvancedModelRenderer(this);
        this.body2.setRotationPoint(0.0F, -4.225F, 3.825F);
        this.body.addChild(body2);
        this.setRotateAngle(body2, -0.0873F, 0.0F, 0.0F);
        this.body2.cubeList.add(new ModelBox(body2, 21, 22, -3.5F, -1.25F, -1.0F, 7, 5, 5, 0.0F, false));
        this.body2.cubeList.add(new ModelBox(body2, 47, 10, 2.0F, -0.35F, 0.0F, 2, 3, 3, 0.0F, false));
        this.body2.cubeList.add(new ModelBox(body2, 0, 0, -4.0F, -0.35F, 0.0F, 2, 3, 3, 0.0F, false));

        this.siphon = new AdvancedModelRenderer(this);
        this.siphon.setRotationPoint(0.0F, 3.5F, 0.0F);
        this.body2.addChild(siphon);
        this.setRotateAngle(siphon, -0.1309F, 0.0F, 0.0F);
        this.siphon.cubeList.add(new ModelBox(siphon, 37, 11, -1.0F, -1.0F, -1.0F, 2, 2, 5, 0.0F, false));

        this.arm1a = new AdvancedModelRenderer(this);
        this.arm1a.setRotationPoint(-1.05F, 2.575F, 4.0F);
        this.body2.addChild(arm1a);
        this.setRotateAngle(arm1a, 0.0436F, 0.0F, -2.9671F);
        this.arm1a.cubeList.add(new ModelBox(arm1a, 10, 47, -0.5F, -1.0F, -0.5F, 1, 1, 4, 0.01F, false));
        this.arm1a.cubeList.add(new ModelBox(arm1a, 0, 3, -0.25F, -0.5F, -0.5F, 0, 1, 4, 0.0F, false));
        this.arm1a.cubeList.add(new ModelBox(arm1a, 0, 2, 0.25F, -0.5F, -0.5F, 0, 1, 4, 0.0F, false));

        this.arm1b = new AdvancedModelRenderer(this);
        this.arm1b.setRotationPoint(0.0F, 0.0F, 3.475F);
        this.arm1a.addChild(arm1b);
        this.setRotateAngle(arm1b, -0.0436F, 0.0F, 0.0F);
        this.arm1b.cubeList.add(new ModelBox(arm1b, 38, 47, -0.25F, -0.5F, 0.0F, 0, 1, 4, 0.0F, false));
        this.arm1b.cubeList.add(new ModelBox(arm1b, 28, 47, 0.25F, -0.5F, 0.0F, 0, 1, 4, 0.0F, false));
        this.arm1b.cubeList.add(new ModelBox(arm1b, 0, 51, -0.5F, -1.0F, 0.0F, 1, 1, 4, 0.0F, false));

        this.arm1c = new AdvancedModelRenderer(this);
        this.arm1c.setRotationPoint(0.0F, 0.0F, 4.0F);
        this.arm1b.addChild(arm1c);
        this.setRotateAngle(arm1c, -0.0873F, 0.0F, 0.0F);
        this.arm1c.cubeList.add(new ModelBox(arm1c, 26, 15, -0.25F, -0.5F, 0.0F, 0, 1, 6, 0.0F, false));
        this.arm1c.cubeList.add(new ModelBox(arm1c, 0, 21, 0.25F, -0.5F, 0.0F, 0, 1, 6, 0.0F, false));
        this.arm1c.cubeList.add(new ModelBox(arm1c, 36, 35, -0.5F, -1.0F, -0.1F, 1, 1, 6, -0.01F, false));

        this.arm2a = new AdvancedModelRenderer(this);
        this.arm2a.setRotationPoint(-2.05F, 2.15F, 4.0F);
        this.body2.addChild(arm2a);
        this.setRotateAngle(arm2a, 0.0436F, 0.0F, -2.2689F);
        this.arm2a.cubeList.add(new ModelBox(arm2a, 47, 26, -0.5F, -1.0F, -0.5F, 1, 1, 4, 0.01F, false));
        this.arm2a.cubeList.add(new ModelBox(arm2a, 0, 5, -0.25F, -0.5F, -0.5F, 0, 1, 4, 0.0F, false));
        this.arm2a.cubeList.add(new ModelBox(arm2a, 0, 4, 0.25F, -0.5F, -0.5F, 0, 1, 4, 0.0F, false));

        this.arm2b = new AdvancedModelRenderer(this);
        this.arm2b.setRotationPoint(0.0F, 0.0F, 3.475F);
        this.arm2a.addChild(arm2b);
        this.setRotateAngle(arm2b, -0.0436F, 0.0F, 0.0F);
        this.arm2b.cubeList.add(new ModelBox(arm2b, 28, 48, -0.25F, -0.5F, 0.0F, 0, 1, 4, 0.0F, false));
        this.arm2b.cubeList.add(new ModelBox(arm2b, 48, 19, 0.25F, -0.5F, 0.0F, 0, 1, 4, 0.0F, false));
        this.arm2b.cubeList.add(new ModelBox(arm2b, 6, 52, -0.5F, -1.0F, 0.0F, 1, 1, 4, 0.0F, false));

        this.arm2c = new AdvancedModelRenderer(this);
        this.arm2c.setRotationPoint(0.0F, 0.0F, 4.0F);
        this.arm2b.addChild(arm2c);
        this.setRotateAngle(arm2c, -0.0873F, 0.0F, 0.0F);
        this.arm2c.cubeList.add(new ModelBox(arm2c, 28, 2, -0.25F, -0.5F, 0.0F, 0, 1, 6, 0.0F, false));
        this.arm2c.cubeList.add(new ModelBox(arm2c, 28, 1, 0.25F, -0.5F, 0.0F, 0, 1, 6, 0.0F, false));
        this.arm2c.cubeList.add(new ModelBox(arm2c, 38, 0, -0.5F, -1.0F, -0.1F, 1, 1, 6, -0.01F, false));

        this.arm3a = new AdvancedModelRenderer(this);
        this.arm3a.setRotationPoint(-2.3F, 0.9F, 4.0F);
        this.body2.addChild(arm3a);
        this.setRotateAngle(arm3a, 0.0436F, 0.0F, -1.5708F);
        this.arm3a.cubeList.add(new ModelBox(arm3a, 16, 48, -0.5F, -1.0F, -0.5F, 1, 1, 4, 0.01F, false));
        this.arm3a.cubeList.add(new ModelBox(arm3a, 28, 1, -0.25F, -0.5F, -0.5F, 0, 1, 4, 0.0F, false));
        this.arm3a.cubeList.add(new ModelBox(arm3a, 12, 23, 0.25F, -0.5F, -0.5F, 0, 1, 4, 0.0F, false));

        this.arm3b = new AdvancedModelRenderer(this);
        this.arm3b.setRotationPoint(0.0F, 0.0F, 3.475F);
        this.arm3a.addChild(arm3b);
        this.setRotateAngle(arm3b, -0.0436F, 0.0F, 0.0F);
        this.arm3b.cubeList.add(new ModelBox(arm3b, 24, 50, -0.25F, -0.5F, 0.0F, 0, 1, 4, 0.0F, false));
        this.arm3b.cubeList.add(new ModelBox(arm3b, 38, 48, 0.25F, -0.5F, 0.0F, 0, 1, 4, 0.0F, false));
        this.arm3b.cubeList.add(new ModelBox(arm3b, 52, 21, -0.5F, -1.0F, 0.0F, 1, 1, 4, 0.0F, false));

        this.arm3c = new AdvancedModelRenderer(this);
        this.arm3c.setRotationPoint(0.0F, 0.0F, 4.0F);
        this.arm3b.addChild(arm3c);
        this.setRotateAngle(arm3c, -0.0873F, 0.0F, 0.0F);
        this.arm3c.cubeList.add(new ModelBox(arm3c, 34, 36, -0.25F, -0.5F, 0.0F, 0, 1, 6, 0.0F, false));
        this.arm3c.cubeList.add(new ModelBox(arm3c, 28, 3, 0.25F, -0.5F, 0.0F, 0, 1, 6, 0.0F, false));
        this.arm3c.cubeList.add(new ModelBox(arm3c, 10, 38, -0.5F, -1.0F, -0.1F, 1, 1, 6, -0.01F, false));

        this.arm4a = new AdvancedModelRenderer(this);
        this.arm4a.setRotationPoint(-1.8F, -0.1F, 4.0F);
        this.body2.addChild(arm4a);
        this.setRotateAngle(arm4a, 0.0436F, 0.0F, -0.6981F);
        this.arm4a.cubeList.add(new ModelBox(arm4a, 48, 16, -0.5F, -1.0F, -0.5F, 1, 1, 4, 0.01F, false));
        this.arm4a.cubeList.add(new ModelBox(arm4a, 13, 33, -0.25F, -0.5F, -0.5F, 0, 1, 4, 0.0F, false));
        this.arm4a.cubeList.add(new ModelBox(arm4a, 28, 2, 0.25F, -0.5F, -0.5F, 0, 1, 4, 0.0F, false));

        this.arm4b = new AdvancedModelRenderer(this);
        this.arm4b.setRotationPoint(0.0F, 0.0F, 3.475F);
        this.arm4a.addChild(arm4b);
        this.setRotateAngle(arm4b, -0.0436F, 0.0F, 0.0F);
        this.arm4b.cubeList.add(new ModelBox(arm4b, 24, 51, -0.25F, -0.5F, 0.0F, 0, 1, 4, 0.0F, false));
        this.arm4b.cubeList.add(new ModelBox(arm4b, 34, 50, 0.25F, -0.5F, 0.0F, 0, 1, 4, 0.0F, false));
        this.arm4b.cubeList.add(new ModelBox(arm4b, 52, 31, -0.5F, -1.0F, 0.0F, 1, 1, 4, 0.0F, false));

        this.arm4c = new AdvancedModelRenderer(this);
        this.arm4c.setRotationPoint(0.0F, 0.0F, 4.0F);
        this.arm4b.addChild(arm4c);
        this.setRotateAngle(arm4c, -0.0873F, 0.0F, 0.0F);
        this.arm4c.cubeList.add(new ModelBox(arm4c, 38, 4, -0.25F, -0.5F, 0.0F, 0, 1, 6, 0.0F, false));
        this.arm4c.cubeList.add(new ModelBox(arm4c, 34, 37, 0.25F, -0.5F, 0.0F, 0, 1, 6, 0.0F, false));
        this.arm4c.cubeList.add(new ModelBox(arm4c, 39, 26, -0.5F, -1.0F, -0.1F, 1, 1, 6, -0.01F, false));

        this.arm5a = new AdvancedModelRenderer(this);
        this.arm5a.setRotationPoint(-0.55F, -0.1F, 4.0F);
        this.body2.addChild(arm5a);
        this.setRotateAngle(arm5a, 0.0436F, 0.0F, -0.0873F);
        this.arm5a.cubeList.add(new ModelBox(arm5a, 48, 40, -0.5F, -1.0F, -0.5F, 1, 1, 4, 0.01F, false));
        this.arm5a.cubeList.add(new ModelBox(arm5a, 37, 14, -0.25F, -0.5F, -0.5F, 0, 1, 4, 0.0F, false));
        this.arm5a.cubeList.add(new ModelBox(arm5a, 36, 1, 0.25F, -0.5F, -0.5F, 0, 1, 4, 0.0F, false));

        this.arm5b = new AdvancedModelRenderer(this);
        this.arm5b.setRotationPoint(0.0F, 0.0F, 3.475F);
        this.arm5a.addChild(arm5b);
        this.setRotateAngle(arm5b, -0.0436F, 0.0F, 0.0F);
        this.arm5b.cubeList.add(new ModelBox(arm5b, 42, 51, -0.25F, -0.5F, 0.0F, 0, 1, 4, 0.0F, false));
        this.arm5b.cubeList.add(new ModelBox(arm5b, 34, 51, 0.25F, -0.5F, 0.0F, 0, 1, 4, 0.0F, false));
        this.arm5b.cubeList.add(new ModelBox(arm5b, 12, 53, -0.5F, -1.0F, 0.0F, 1, 1, 4, 0.0F, false));

        this.arm5c = new AdvancedModelRenderer(this);
        this.arm5c.setRotationPoint(0.0F, 0.0F, 4.0F);
        this.arm5b.addChild(arm5c);
        this.setRotateAngle(arm5c, -0.0873F, 0.0F, 0.0F);
        this.arm5c.cubeList.add(new ModelBox(arm5c, 38, 28, -0.25F, -0.5F, 0.0F, 0, 1, 6, 0.0F, false));
        this.arm5c.cubeList.add(new ModelBox(arm5c, 38, 27, 0.25F, -0.5F, 0.0F, 0, 1, 6, 0.0F, false));
        this.arm5c.cubeList.add(new ModelBox(arm5c, 40, 18, -0.5F, -1.0F, -0.1F, 1, 1, 6, -0.01F, false));

        this.arm6a = new AdvancedModelRenderer(this);
        this.arm6a.setRotationPoint(1.05F, 2.575F, 4.0F);
        this.body2.addChild(arm6a);
        this.setRotateAngle(arm6a, 0.0436F, 0.0F, 2.9671F);
        this.arm6a.cubeList.add(new ModelBox(arm6a, 22, 49, -0.5F, -1.0F, -0.5F, 1, 1, 4, 0.01F, false));
        this.arm6a.cubeList.add(new ModelBox(arm6a, 37, 16, 0.25F, -0.5F, -0.5F, 0, 1, 4, 0.0F, false));
        this.arm6a.cubeList.add(new ModelBox(arm6a, 37, 15, -0.25F, -0.5F, -0.5F, 0, 1, 4, 0.0F, false));

        this.arm6b = new AdvancedModelRenderer(this);
        this.arm6b.setRotationPoint(0.0F, 0.0F, 3.475F);
        this.arm6a.addChild(arm6b);
        this.setRotateAngle(arm6b, -0.0436F, 0.0F, 0.0F);
        this.arm6b.cubeList.add(new ModelBox(arm6b, 48, 18, 0.25F, -0.5F, 0.0F, 0, 1, 4, 0.0F, false));
        this.arm6b.cubeList.add(new ModelBox(arm6b, 48, 17, -0.25F, -0.5F, 0.0F, 0, 1, 4, 0.0F, false));
        this.arm6b.cubeList.add(new ModelBox(arm6b, 54, 6, -0.5F, -1.0F, 0.0F, 1, 1, 4, 0.0F, false));

        this.arm6c = new AdvancedModelRenderer(this);
        this.arm6c.setRotationPoint(0.0F, 0.0F, 4.0F);
        this.arm6b.addChild(arm6c);
        this.setRotateAngle(arm6c, -0.0873F, 0.0F, 0.0F);
        this.arm6c.cubeList.add(new ModelBox(arm6c, 8, 39, 0.25F, -0.5F, 0.0F, 0, 1, 6, 0.0F, false));
        this.arm6c.cubeList.add(new ModelBox(arm6c, 34, 38, -0.25F, -0.5F, 0.0F, 0, 1, 6, 0.0F, false));
        this.arm6c.cubeList.add(new ModelBox(arm6c, 18, 41, -0.5F, -1.0F, -0.125F, 1, 1, 6, -0.01F, false));

        this.arm7a = new AdvancedModelRenderer(this);
        this.arm7a.setRotationPoint(2.05F, 2.15F, 4.0F);
        this.body2.addChild(arm7a);
        this.setRotateAngle(arm7a, 0.0436F, 0.0F, 2.2689F);
        this.arm7a.cubeList.add(new ModelBox(arm7a, 32, 49, -0.5F, -1.0F, -0.5F, 1, 1, 4, 0.01F, false));
        this.arm7a.cubeList.add(new ModelBox(arm7a, 38, 17, 0.25F, -0.5F, -0.5F, 0, 1, 4, 0.0F, false));
        this.arm7a.cubeList.add(new ModelBox(arm7a, 26, 37, -0.25F, -0.5F, -0.5F, 0, 1, 4, 0.0F, false));

        this.arm7b = new AdvancedModelRenderer(this);
        this.arm7b.setRotationPoint(0.0F, 0.0F, 3.475F);
        this.arm7a.addChild(arm7b);
        this.setRotateAngle(arm7b, -0.0436F, 0.0F, 0.0F);
        this.arm7b.cubeList.add(new ModelBox(arm7b, 24, 52, 0.25F, -0.5F, 0.0F, 0, 1, 4, 0.0F, false));
        this.arm7b.cubeList.add(new ModelBox(arm7b, 50, 51, -0.25F, -0.5F, 0.0F, 0, 1, 4, 0.0F, false));
        this.arm7b.cubeList.add(new ModelBox(arm7b, 54, 12, -0.5F, -1.0F, 0.0F, 1, 1, 4, 0.0F, false));

        this.arm7c = new AdvancedModelRenderer(this);
        this.arm7c.setRotationPoint(0.0F, 0.0F, 4.0F);
        this.arm7b.addChild(arm7c);
        this.setRotateAngle(arm7c, -0.0873F, 0.0F, 0.0F);
        this.arm7c.cubeList.add(new ModelBox(arm7c, 40, 1, 0.25F, -0.5F, 0.0F, 0, 1, 6, 0.0F, false));
        this.arm7c.cubeList.add(new ModelBox(arm7c, 34, 39, -0.25F, -0.5F, 0.0F, 0, 1, 6, 0.0F, false));
        this.arm7c.cubeList.add(new ModelBox(arm7c, 26, 42, -0.5F, -1.0F, -0.125F, 1, 1, 6, -0.01F, false));

        this.arm8a = new AdvancedModelRenderer(this);
        this.arm8a.setRotationPoint(2.3F, 0.9F, 4.0F);
        this.body2.addChild(arm8a);
        this.setRotateAngle(arm8a, 0.0436F, 0.0F, 1.5708F);
        this.arm8a.cubeList.add(new ModelBox(arm8a, 42, 49, -0.5F, -1.0F, -0.5F, 1, 1, 4, 0.01F, false));
        this.arm8a.cubeList.add(new ModelBox(arm8a, 28, 45, 0.25F, -0.5F, -0.5F, 0, 1, 4, 0.0F, false));
        this.arm8a.cubeList.add(new ModelBox(arm8a, 44, 36, -0.25F, -0.5F, -0.5F, 0, 1, 4, 0.0F, false));

        this.arm8b = new AdvancedModelRenderer(this);
        this.arm8b.setRotationPoint(0.0F, 0.0F, 3.475F);
        this.arm8a.addChild(arm8b);
        this.setRotateAngle(arm8b, -0.0436F, 0.0F, 0.0F);
        this.arm8b.cubeList.add(new ModelBox(arm8b, 42, 52, 0.25F, -0.5F, 0.0F, 0, 1, 4, 0.0F, false));
        this.arm8b.cubeList.add(new ModelBox(arm8b, 34, 52, -0.25F, -0.5F, 0.0F, 0, 1, 4, 0.0F, false));
        this.arm8b.cubeList.add(new ModelBox(arm8b, 18, 54, -0.5F, -1.0F, 0.0F, 1, 1, 4, 0.0F, false));

        this.arm8c = new AdvancedModelRenderer(this);
        this.arm8c.setRotationPoint(0.0F, 0.0F, 4.0F);
        this.arm8b.addChild(arm8c);
        this.setRotateAngle(arm8c, -0.0873F, 0.0F, 0.0F);
        this.arm8c.cubeList.add(new ModelBox(arm8c, 40, 3, 0.25F, -0.5F, 0.0F, 0, 1, 6, 0.0F, false));
        this.arm8c.cubeList.add(new ModelBox(arm8c, 40, 2, -0.25F, -0.5F, 0.0F, 0, 1, 6, 0.0F, false));
        this.arm8c.cubeList.add(new ModelBox(arm8c, 40, 42, -0.5F, -1.0F, -0.1F, 1, 1, 6, -0.01F, false));

        this.arm9a = new AdvancedModelRenderer(this);
        this.arm9a.setRotationPoint(1.8F, -0.1F, 4.0F);
        this.body2.addChild(arm9a);
        this.setRotateAngle(arm9a, 0.0436F, 0.0F, 0.6981F);
        this.arm9a.cubeList.add(new ModelBox(arm9a, 50, 45, -0.5F, -1.0F, -0.5F, 1, 1, 4, 0.01F, false));
        this.arm9a.cubeList.add(new ModelBox(arm9a, 28, 46, 0.25F, -0.5F, -0.5F, 0, 1, 4, 0.0F, false));
        this.arm9a.cubeList.add(new ModelBox(arm9a, 38, 45, -0.25F, -0.5F, -0.5F, 0, 1, 4, 0.0F, false));

        this.arm9b = new AdvancedModelRenderer(this);
        this.arm9b.setRotationPoint(0.0F, 0.0F, 3.475F);
        this.arm9a.addChild(arm9b);
        this.setRotateAngle(arm9b, -0.0436F, 0.0F, 0.0F);
        this.arm9b.cubeList.add(new ModelBox(arm9b, 0, 53, 0.25F, -0.5F, 0.0F, 0, 1, 4, 0.0F, false));
        this.arm9b.cubeList.add(new ModelBox(arm9b, 50, 52, -0.25F, -0.5F, 0.0F, 0, 1, 4, 0.0F, false));
        this.arm9b.cubeList.add(new ModelBox(arm9b, 28, 54, -0.5F, -1.0F, 0.0F, 1, 1, 4, 0.0F, false));

        this.arm9c = new AdvancedModelRenderer(this);
        this.arm9c.setRotationPoint(0.0F, 0.0F, 4.0F);
        this.arm9b.addChild(arm9c);
        this.setRotateAngle(arm9c, -0.0873F, 0.0F, 0.0F);
        this.arm9c.cubeList.add(new ModelBox(arm9c, 40, 19, 0.25F, -0.5F, 0.0F, 0, 1, 6, 0.0F, false));
        this.arm9c.cubeList.add(new ModelBox(arm9c, 8, 40, -0.25F, -0.5F, 0.0F, 0, 1, 6, 0.0F, false));
        this.arm9c.cubeList.add(new ModelBox(arm9c, 0, 44, -0.5F, -1.0F, -0.075F, 1, 1, 6, -0.01F, false));

        this.arm10a = new AdvancedModelRenderer(this);
        this.arm10a.setRotationPoint(0.55F, -0.1F, 4.0F);
        this.body2.addChild(arm10a);
        this.setRotateAngle(arm10a, 0.0436F, 0.0F, 0.0873F);
        this.arm10a.cubeList.add(new ModelBox(arm10a, 48, 50, -0.5F, -1.0F, -0.5F, 1, 1, 4, 0.01F, false));
        this.arm10a.cubeList.add(new ModelBox(arm10a, 47, 27, 0.25F, -0.5F, -0.5F, 0, 1, 4, 0.0F, false));
        this.arm10a.cubeList.add(new ModelBox(arm10a, 38, 46, -0.25F, -0.5F, -0.5F, 0, 1, 4, 0.0F, false));

        this.arm10b = new AdvancedModelRenderer(this);
        this.arm10b.setRotationPoint(0.0F, 0.0F, 3.475F);
        this.arm10a.addChild(arm10b);
        this.setRotateAngle(arm10b, -0.0436F, 0.0F, 0.0F);
        this.arm10b.cubeList.add(new ModelBox(arm10b, 53, 23, 0.25F, -0.5F, 0.0F, 0, 1, 4, 0.0F, false));
        this.arm10b.cubeList.add(new ModelBox(arm10b, 53, 22, -0.25F, -0.5F, 0.0F, 0, 1, 4, 0.0F, false));
        this.arm10b.cubeList.add(new ModelBox(arm10b, 54, 36, -0.5F, -1.0F, 0.0F, 1, 1, 4, 0.0F, false));

        this.arm10c = new AdvancedModelRenderer(this);
        this.arm10c.setRotationPoint(0.0F, 0.0F, 3.9F);
        this.arm10b.addChild(arm10c);
        this.setRotateAngle(arm10c, -0.0873F, 0.0F, 0.0F);
        this.arm10c.cubeList.add(new ModelBox(arm10c, 34, 41, 0.25F, -0.5F, 0.0F, 0, 1, 6, 0.0F, false));
        this.arm10c.cubeList.add(new ModelBox(arm10c, 34, 40, -0.25F, -0.5F, 0.0F, 0, 1, 6, 0.0F, false));
        this.arm10c.cubeList.add(new ModelBox(arm10c, 44, 33, -0.5F, -1.0F, 0.0F, 1, 1, 6, -0.01F, false));

        updateDefaultPose();
        animator = ModelAnimator.create();
    }

    @Override
    public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        //this.main.rotateAngleY = (float)Math.toRadians(((EntityPrehistoricFloraEromangateuthis)entity).getRotationAngle());
        animate((IAnimatedEntity) entity, f, f1, f2, f3, f4, f5);
        this.base.render(f5);
    }

    public void renderStaticWall(float f) {

        resetToDefaultPose();
    }

    @Override
    public void renderStaticBook(float f) {
        //Rotations, positions and sizing:
        this.base.offsetY = -0.7F;
        this.base.offsetX = 0.3F;
        this.base.rotateAngleY = (float)Math.toRadians(140);
        this.base.rotateAngleX = (float)Math.toRadians(40);
        this.base.rotateAngleZ = (float)Math.toRadians(-10);
        this.base.scaleChildren = true;
        float scaler = 0.7F;
        this.base.setScale(scaler, scaler, scaler);
        //Start of pose:

        //End of pose, now render the model:
        this.base.render(f);
        //Reset rotations, positions and sizing:
        this.base.setScale(1.0F, 1.0F, 1.0F);
        this.base.scaleChildren = false;
        resetToDefaultPose();
    }

    public void renderStaticFloor(float f) {

        resetToDefaultPose();
    }

    public void setRotateAngle(AdvancedModelRenderer AdvancedModelRenderer, float x, float y, float z) {
        AdvancedModelRenderer.rotateAngleX = x;
        AdvancedModelRenderer.rotateAngleY = y;
        AdvancedModelRenderer.rotateAngleZ = z;
    }

    @Override
    public void setRotationAngles(float f, float f1, float f2, float f3, float f4, float f5, Entity e) {
        super.setRotationAngles(f, f1, f2, f3, f4, f5, e);

    }


    @Override
    public void setLivingAnimations(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime) {
        super.setLivingAnimations(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime);
        this.resetToDefaultPose();

        EntityPrehistoricFloraEromangateuthis ee = (EntityPrehistoricFloraEromangateuthis) entitylivingbaseIn;

        if (!ee.isReallyInWater()) {
            if (ee.getIsMoving()) {
                if (ee.getIsFast()) { //Running
                    if (ee.getIsSneaking()) {
                        animFront(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime);
                    }
                    else {
                        animFast(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime);
                    }
                } else { //Walking
                    animBack(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime);
                }
            }
        }
        else {
            //Swimming pose:
            if (!ee.getIsMoving()) { //static in water
                if (ee.getIsFast()) { //Running
                    animFront(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime);
                } else { //Walking
                    animBack(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime);
                }
            }
            else {
                if (ee.getIsFast()) { //Running
                    animFront(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime);
                } else { //Walking
                    animBack(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime);
                }

            }
        }
        if (ee.getAnimation() == ee.ATTACK_ANIMATION) {
            animAttack(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime, ee.getAnimationTick());
        }


    }

    public void animAttack(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime, double animTick) {
        EntityPrehistoricFloraEromangateuthis entity = (EntityPrehistoricFloraEromangateuthis) entitylivingbaseIn;
        int animCycle = 20;
        double tickAnim = animTick + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;
        if (tickAnim >= 0 && tickAnim < 8) {
            xx = -182.3767-Math.sin((Math.PI/180)*(((double)tickAnim/20)*360+30))*-5 + (((tickAnim - 0) / 8) * (-175.254-Math.sin((Math.PI/180)*(((double)tickAnim/20)*360+30))*-5-(-182.3767-Math.sin((Math.PI/180)*(((double)tickAnim/20)*360+30))*-5)));
            yy = 0.49915 + (((tickAnim - 0) / 8) * (0.24141-(0.49915)));
            zz = 179.97919 + (((tickAnim - 0) / 8) * (180.22773-(179.97919)));
        }
        else if (tickAnim >= 8 && tickAnim < 14) {
            xx = -175.254-Math.sin((Math.PI/180)*(((double)tickAnim/20)*360+30))*-5 + (((tickAnim - 8) / 6) * (-175.254-Math.sin((Math.PI/180)*(((double)tickAnim/20)*360+30))*-7-(-175.254-Math.sin((Math.PI/180)*(((double)tickAnim/20)*360+30))*-5)));
            yy = 0.24141 + (((tickAnim - 8) / 6) * (0.24141-(0.24141)));
            zz = 180.22773 + (((tickAnim - 8) / 6) * (180.22773-(180.22773)));
        }
        else if (tickAnim >= 14 && tickAnim < 20) {
            xx = -175.254-Math.sin((Math.PI/180)*(((double)tickAnim/20)*360+30))*-7 + (((tickAnim - 14) / 6) * (-182.3767-Math.sin((Math.PI/180)*(((double)tickAnim/20)*360+30))*-5-(-175.254-Math.sin((Math.PI/180)*(((double)tickAnim/20)*360+30))*-7)));
            yy = 0.24141 + (((tickAnim - 14) / 6) * (0.49915-(0.24141)));
            zz = 180.22773 + (((tickAnim - 14) / 6) * (179.97919-(180.22773)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(base, base.rotateAngleX + (float) Math.toRadians(xx), base.rotateAngleY + (float) Math.toRadians(yy), base.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 0) / 8) * (0-(0)));
            yy = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.5))*-0.5 + (((tickAnim - 0) / 8) * (0.725-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.5))*-0.5)));
            zz = 1.525+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360+50))*-2 + (((tickAnim - 0) / 8) * (1.425+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360))*5-(1.525+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360+50))*-2)));
        }
        else if (tickAnim >= 8 && tickAnim < 14) {
            xx = 0 + (((tickAnim - 8) / 6) * (0-(0)));
            yy = 0.725 + (((tickAnim - 8) / 6) * (0-(0.725)));
            zz = 1.425+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360))*5 + (((tickAnim - 8) / 6) * (-0.85+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360))*10-(1.425+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360))*5)));
        }
        else if (tickAnim >= 14 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 14) / 6) * (0-(0)));
            yy = 0 + (((tickAnim - 14) / 6) * (0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.5))*-0.5-(0)));
            zz = -0.85+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360))*10 + (((tickAnim - 14) / 6) * (1.525+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360+50))*-2-(-0.85+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360))*10)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.base.rotationPointX = this.base.rotationPointX + (float)(xx);
        this.base.rotationPointY = this.base.rotationPointY - (float)(yy);
        this.base.rotationPointZ = this.base.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 9) {
            xx = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*660-180))*-30 + (((tickAnim - 0) / 9) * (0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*660-180))*-30-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*660-180))*-30)));
            yy = 0 + (((tickAnim - 0) / 9) * (0-(0)));
            zz = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*660-100))*30 + (((tickAnim - 0) / 9) * (0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*660-100))*30-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*660-100))*30)));
        }
        else if (tickAnim >= 9 && tickAnim < 11) {
            xx = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*660-180))*-30 + (((tickAnim - 9) / 2) * (0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*860-230))*-30-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*660-180))*-30)));
            yy = 0 + (((tickAnim - 9) / 2) * (0-(0)));
            zz = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*660-100))*30 + (((tickAnim - 9) / 2) * (0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*860-150))*30-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*660-100))*30)));
        }
        else if (tickAnim >= 11 && tickAnim < 20) {
            xx = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*860-230))*-30 + (((tickAnim - 11) / 9) * (0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*660-180))*-30-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*860-230))*-30)));
            yy = 0 + (((tickAnim - 11) / 9) * (0-(0)));
            zz = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*860-150))*30 + (((tickAnim - 11) / 9) * (0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*660-100))*30-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*860-150))*30)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(FinL, FinL.rotateAngleX + (float) Math.toRadians(xx), FinL.rotateAngleY + (float) Math.toRadians(yy), FinL.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 9) {
            xx = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*660-180))*-30 + (((tickAnim - 0) / 9) * (0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*660-180))*-30-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*660-180))*-30)));
            yy = 0 + (((tickAnim - 0) / 9) * (0-(0)));
            zz = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*660-100))*-30 + (((tickAnim - 0) / 9) * (0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*660-100))*-30-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*660-100))*-30)));
        }
        else if (tickAnim >= 9 && tickAnim < 11) {
            xx = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*660-180))*-30 + (((tickAnim - 9) / 2) * (0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*860-230))*-30-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*660-180))*-30)));
            yy = 0 + (((tickAnim - 9) / 2) * (0-(0)));
            zz = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*660-100))*-30 + (((tickAnim - 9) / 2) * (0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*860-150))*-30-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*660-100))*-30)));
        }
        else if (tickAnim >= 11 && tickAnim < 20) {
            xx = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*860-230))*-30 + (((tickAnim - 11) / 9) * (0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*660-180))*-30-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*860-230))*-30)));
            yy = 0 + (((tickAnim - 11) / 9) * (0-(0)));
            zz = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*860-150))*-30 + (((tickAnim - 11) / 9) * (0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*660-100))*-30-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*860-150))*-30)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(FinL2, FinL2.rotateAngleX + (float) Math.toRadians(xx), FinL2.rotateAngleY + (float) Math.toRadians(yy), FinL2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 9) {
            xx = 0 + (((tickAnim - 0) / 9) * (8.25-(0)));
            yy = 0 + (((tickAnim - 0) / 9) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 9) * (0-(0)));
        }
        else if (tickAnim >= 9 && tickAnim < 14) {
            xx = 8.25 + (((tickAnim - 9) / 5) * (0-(8.25)));
            yy = 0 + (((tickAnim - 9) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 9) / 5) * (0-(0)));
        }
        else if (tickAnim >= 14 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 14) / 6) * (0-(0)));
            yy = 0 + (((tickAnim - 14) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 14) / 6) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(body2, body2.rotateAngleX + (float) Math.toRadians(xx), body2.rotateAngleY + (float) Math.toRadians(yy), body2.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 9) {
            xx = 1 + (((tickAnim - 0) / 9) * (1-(1)));
            yy = 1 + (((tickAnim - 0) / 9) * (1-(1)));
            zz = 1 + (((tickAnim - 0) / 9) * (1-(1)));
        }
        else if (tickAnim >= 9 && tickAnim < 14) {
            xx = 1 + (((tickAnim - 9) / 5) * (1-(1)));
            yy = 1 + (((tickAnim - 9) / 5) * (1-(1)));
            zz = 1 + (((tickAnim - 9) / 5) * (1.1-(1)));
        }
        else if (tickAnim >= 14 && tickAnim < 20) {
            xx = 1 + (((tickAnim - 14) / 6) * (1-(1)));
            yy = 1 + (((tickAnim - 14) / 6) * (1-(1)));
            zz = 1.1 + (((tickAnim - 14) / 6) * (1-(1.1)));
        }
        else {
            xx = 1;
            yy = 1;
            zz = 1;
        }
        this.body2.setScale((float)xx, (float)yy, (float)zz);



        this.setRotateAngle(siphon, siphon.rotateAngleX + (float) Math.toRadians(0), siphon.rotateAngleY + (float) Math.toRadians(0), siphon.rotateAngleZ + (float) Math.toRadians(0));
        this.siphon.rotationPointX = this.siphon.rotationPointX + (float)(0);
        this.siphon.rotationPointY = this.siphon.rotationPointY - (float)(0);
        this.siphon.rotationPointZ = this.siphon.rotationPointZ + (float)(0);



        if (tickAnim >= 0 && tickAnim < 9) {
            xx = 37.625-Math.sin((Math.PI/180)*(((double)tickAnim/20)*360-50))*-50 + (((tickAnim - 0) / 9) * (39.25-(37.625-Math.sin((Math.PI/180)*(((double)tickAnim/20)*360-50))*-50)));
            yy = 0 + (((tickAnim - 0) / 9) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 9) * (0-(0)));
        }
        else if (tickAnim >= 9 && tickAnim < 14) {
            xx = 39.25 + (((tickAnim - 9) / 5) * (0-(39.25)));
            yy = 0 + (((tickAnim - 9) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 9) / 5) * (0-(0)));
        }
        else if (tickAnim >= 14 && tickAnim < 18) {
            xx = 0 + (((tickAnim - 14) / 4) * (-5.25-(0)));
            yy = 0 + (((tickAnim - 14) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 14) / 4) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 20) {
            xx = -5.25 + (((tickAnim - 18) / 2) * (0-(-5.25)));
            yy = 0 + (((tickAnim - 18) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 18) / 2) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(arm1a, arm1a.rotateAngleX + (float) Math.toRadians(xx), arm1a.rotateAngleY + (float) Math.toRadians(yy), arm1a.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 9 && tickAnim < 14) {
            xx = 1 + (((tickAnim - 9) / 5) * (1-(1)));
            yy = 1 + (((tickAnim - 9) / 5) * (1-(1)));
            zz = 1 + (((tickAnim - 9) / 5) * (1.2-(1)));
        }
        else if (tickAnim >= 14 && tickAnim < 20) {
            xx = 1 + (((tickAnim - 14) / 6) * (1-(1)));
            yy = 1 + (((tickAnim - 14) / 6) * (1-(1)));
            zz = 1.2 + (((tickAnim - 14) / 6) * (1-(1.2)));
        }
        else {
            xx = 1;
            yy = 1;
            zz = 1;
        }
        this.arm1a.setScale((float)xx, (float)yy, (float)zz);




        if (tickAnim >= 0 && tickAnim < 9) {
            xx = 0.35-Math.sin((Math.PI/180)*(((double)tickAnim/20)*360))*90 + (((tickAnim - 0) / 9) * (32.75-(0.35-Math.sin((Math.PI/180)*(((double)tickAnim/20)*360))*90)));
            yy = 0 + (((tickAnim - 0) / 9) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 9) * (0-(0)));
        }
        else if (tickAnim >= 9 && tickAnim < 12) {
            xx = 32.75 + (((tickAnim - 9) / 3) * (49.75-(32.75)));
            yy = 0 + (((tickAnim - 9) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 9) / 3) * (0-(0)));
        }
        else if (tickAnim >= 12 && tickAnim < 14) {
            xx = 49.75 + (((tickAnim - 12) / 2) * (0-(49.75)));
            yy = 0 + (((tickAnim - 12) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 12) / 2) * (0-(0)));
        }
        else if (tickAnim >= 14 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 14) / 6) * (0-(0)));
            yy = 0 + (((tickAnim - 14) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 14) / 6) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(arm1b, arm1b.rotateAngleX + (float) Math.toRadians(xx), arm1b.rotateAngleY + (float) Math.toRadians(yy), arm1b.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 3) * (0.3-(0)));
            zz = 0 + (((tickAnim - 0) / 3) * (-0.675-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 9) {
            xx = 0 + (((tickAnim - 3) / 6) * (0-(0)));
            yy = 0.3 + (((tickAnim - 3) / 6) * (0-(0.3)));
            zz = -0.675 + (((tickAnim - 3) / 6) * (0-(-0.675)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.arm1b.rotationPointX = this.arm1b.rotationPointX + (float)(xx);
        this.arm1b.rotationPointY = this.arm1b.rotationPointY - (float)(yy);
        this.arm1b.rotationPointZ = this.arm1b.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 9) {
            xx = -147.375-Math.sin((Math.PI/180)*(((double)tickAnim/20)*360-100))*150 + (((tickAnim - 0) / 9) * (43.75-(-147.375-Math.sin((Math.PI/180)*(((double)tickAnim/20)*360-100))*150)));
            yy = 0 + (((tickAnim - 0) / 9) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 9) * (0-(0)));
        }
        else if (tickAnim >= 9 && tickAnim < 12) {
            xx = 43.75 + (((tickAnim - 9) / 3) * (45.87-(43.75)));
            yy = 0 + (((tickAnim - 9) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 9) / 3) * (0-(0)));
        }
        else if (tickAnim >= 12 && tickAnim < 14) {
            xx = 45.87 + (((tickAnim - 12) / 2) * (0-(45.87)));
            yy = 0 + (((tickAnim - 12) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 12) / 2) * (0-(0)));
        }
        else if (tickAnim >= 14 && tickAnim < 18) {
            xx = 0 + (((tickAnim - 14) / 4) * (11.75-(0)));
            yy = 0 + (((tickAnim - 14) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 14) / 4) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 20) {
            xx = 11.75 + (((tickAnim - 18) / 2) * (0-(11.75)));
            yy = 0 + (((tickAnim - 18) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 18) / 2) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(arm1c, arm1c.rotateAngleX + (float) Math.toRadians(xx), arm1c.rotateAngleY + (float) Math.toRadians(yy), arm1c.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 7) {
            xx = 0 + (((tickAnim - 0) / 7) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 7) * (0.2-(0)));
            zz = 0 + (((tickAnim - 0) / 7) * (-0.6-(0)));
        }
        else if (tickAnim >= 7 && tickAnim < 9) {
            xx = 0 + (((tickAnim - 7) / 2) * (0-(0)));
            yy = 0.2 + (((tickAnim - 7) / 2) * (0-(0.2)));
            zz = -0.6 + (((tickAnim - 7) / 2) * (0-(-0.6)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.arm1c.rotationPointX = this.arm1c.rotationPointX + (float)(xx);
        this.arm1c.rotationPointY = this.arm1c.rotationPointY - (float)(yy);
        this.arm1c.rotationPointZ = this.arm1c.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 9) {
            xx = 37.625-Math.sin((Math.PI/180)*(((double)tickAnim/20)*360-50))*-50 + (((tickAnim - 0) / 9) * (44.75-(37.625-Math.sin((Math.PI/180)*(((double)tickAnim/20)*360-50))*-50)));
            yy = 0 + (((tickAnim - 0) / 9) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 9) * (0-(0)));
        }
        else if (tickAnim >= 9 && tickAnim < 14) {
            xx = 44.75 + (((tickAnim - 9) / 5) * (0-(44.75)));
            yy = 0 + (((tickAnim - 9) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 9) / 5) * (0-(0)));
        }
        else if (tickAnim >= 14 && tickAnim < 18) {
            xx = 0 + (((tickAnim - 14) / 4) * (-6.75-(0)));
            yy = 0 + (((tickAnim - 14) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 14) / 4) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 20) {
            xx = -6.75 + (((tickAnim - 18) / 2) * (0-(-6.75)));
            yy = 0 + (((tickAnim - 18) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 18) / 2) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(arm2a, arm2a.rotateAngleX + (float) Math.toRadians(xx), arm2a.rotateAngleY + (float) Math.toRadians(yy), arm2a.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 9 && tickAnim < 14) {
            xx = 1 + (((tickAnim - 9) / 5) * (1-(1)));
            yy = 1 + (((tickAnim - 9) / 5) * (1-(1)));
            zz = 1 + (((tickAnim - 9) / 5) * (1.2-(1)));
        }
        else if (tickAnim >= 14 && tickAnim < 20) {
            xx = 1 + (((tickAnim - 14) / 6) * (1-(1)));
            yy = 1 + (((tickAnim - 14) / 6) * (1-(1)));
            zz = 1.2 + (((tickAnim - 14) / 6) * (1-(1.2)));
        }
        else {
            xx = 1;
            yy = 1;
            zz = 1;
        }
        this.arm2a.setScale((float)xx, (float)yy, (float)zz);




        if (tickAnim >= 0 && tickAnim < 9) {
            xx = 0.35-Math.sin((Math.PI/180)*(((double)tickAnim/20)*360))*90 + (((tickAnim - 0) / 9) * (32.75-(0.35-Math.sin((Math.PI/180)*(((double)tickAnim/20)*360))*90)));
            yy = 0 + (((tickAnim - 0) / 9) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 9) * (0-(0)));
        }
        else if (tickAnim >= 9 && tickAnim < 12) {
            xx = 32.75 + (((tickAnim - 9) / 3) * (55.25-(32.75)));
            yy = 0 + (((tickAnim - 9) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 9) / 3) * (0-(0)));
        }
        else if (tickAnim >= 12 && tickAnim < 14) {
            xx = 55.25 + (((tickAnim - 12) / 2) * (0-(55.25)));
            yy = 0 + (((tickAnim - 12) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 12) / 2) * (0-(0)));
        }
        else if (tickAnim >= 14 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 14) / 6) * (0-(0)));
            yy = 0 + (((tickAnim - 14) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 14) / 6) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(arm2b, arm2b.rotateAngleX + (float) Math.toRadians(xx), arm2b.rotateAngleY + (float) Math.toRadians(yy), arm2b.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 3) * (0.3-(0)));
            zz = 0 + (((tickAnim - 0) / 3) * (-0.675-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 9) {
            xx = 0 + (((tickAnim - 3) / 6) * (0-(0)));
            yy = 0.3 + (((tickAnim - 3) / 6) * (0-(0.3)));
            zz = -0.675 + (((tickAnim - 3) / 6) * (0-(-0.675)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.arm2b.rotationPointX = this.arm2b.rotationPointX + (float)(xx);
        this.arm2b.rotationPointY = this.arm2b.rotationPointY - (float)(yy);
        this.arm2b.rotationPointZ = this.arm2b.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 9) {
            xx = -147.375-Math.sin((Math.PI/180)*(((double)tickAnim/20)*360-100))*150 + (((tickAnim - 0) / 9) * (43.75-(-147.375-Math.sin((Math.PI/180)*(((double)tickAnim/20)*360-100))*150)));
            yy = 0 + (((tickAnim - 0) / 9) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 9) * (0-(0)));
        }
        else if (tickAnim >= 9 && tickAnim < 12) {
            xx = 43.75 + (((tickAnim - 9) / 3) * (29.5-(43.75)));
            yy = 0 + (((tickAnim - 9) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 9) / 3) * (0-(0)));
        }
        else if (tickAnim >= 12 && tickAnim < 14) {
            xx = 29.5 + (((tickAnim - 12) / 2) * (0-(29.5)));
            yy = 0 + (((tickAnim - 12) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 12) / 2) * (0-(0)));
        }
        else if (tickAnim >= 14 && tickAnim < 18) {
            xx = 0 + (((tickAnim - 14) / 4) * (14.75-(0)));
            yy = 0 + (((tickAnim - 14) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 14) / 4) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 20) {
            xx = 14.75 + (((tickAnim - 18) / 2) * (0-(14.75)));
            yy = 0 + (((tickAnim - 18) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 18) / 2) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(arm2c, arm2c.rotateAngleX + (float) Math.toRadians(xx), arm2c.rotateAngleY + (float) Math.toRadians(yy), arm2c.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 7) {
            xx = 0 + (((tickAnim - 0) / 7) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 7) * (0.2-(0)));
            zz = 0 + (((tickAnim - 0) / 7) * (-0.6-(0)));
        }
        else if (tickAnim >= 7 && tickAnim < 9) {
            xx = 0 + (((tickAnim - 7) / 2) * (0-(0)));
            yy = 0.2 + (((tickAnim - 7) / 2) * (0-(0.2)));
            zz = -0.6 + (((tickAnim - 7) / 2) * (0-(-0.6)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.arm2c.rotationPointX = this.arm2c.rotationPointX + (float)(xx);
        this.arm2c.rotationPointY = this.arm2c.rotationPointY - (float)(yy);
        this.arm2c.rotationPointZ = this.arm2c.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 9) {
            xx = 37.625-Math.sin((Math.PI/180)*(((double)tickAnim/20)*360-50))*-50 + (((tickAnim - 0) / 9) * (48.75-(37.625-Math.sin((Math.PI/180)*(((double)tickAnim/20)*360-50))*-50)));
            yy = 0 + (((tickAnim - 0) / 9) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 9) * (0-(0)));
        }
        else if (tickAnim >= 9 && tickAnim < 14) {
            xx = 48.75 + (((tickAnim - 9) / 5) * (0-(48.75)));
            yy = 0 + (((tickAnim - 9) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 9) / 5) * (0-(0)));
        }
        else if (tickAnim >= 14 && tickAnim < 18) {
            xx = 0 + (((tickAnim - 14) / 4) * (-7.5-(0)));
            yy = 0 + (((tickAnim - 14) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 14) / 4) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 20) {
            xx = -7.5 + (((tickAnim - 18) / 2) * (0-(-7.5)));
            yy = 0 + (((tickAnim - 18) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 18) / 2) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(arm3a, arm3a.rotateAngleX + (float) Math.toRadians(xx), arm3a.rotateAngleY + (float) Math.toRadians(yy), arm3a.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 9 && tickAnim < 14) {
            xx = 1 + (((tickAnim - 9) / 5) * (1-(1)));
            yy = 1 + (((tickAnim - 9) / 5) * (1-(1)));
            zz = 1 + (((tickAnim - 9) / 5) * (1.2-(1)));
        }
        else if (tickAnim >= 14 && tickAnim < 20) {
            xx = 1 + (((tickAnim - 14) / 6) * (1-(1)));
            yy = 1 + (((tickAnim - 14) / 6) * (1-(1)));
            zz = 1.2 + (((tickAnim - 14) / 6) * (1-(1.2)));
        }
        else {
            xx = 1;
            yy = 1;
            zz = 1;
        }
        this.arm3a.setScale((float)xx, (float)yy, (float)zz);




        if (tickAnim >= 0 && tickAnim < 9) {
            xx = 0.35-Math.sin((Math.PI/180)*(((double)tickAnim/20)*360))*90 + (((tickAnim - 0) / 9) * (32.75-(0.35-Math.sin((Math.PI/180)*(((double)tickAnim/20)*360))*90)));
            yy = 0 + (((tickAnim - 0) / 9) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 9) * (0-(0)));
        }
        else if (tickAnim >= 9 && tickAnim < 14) {
            xx = 32.75 + (((tickAnim - 9) / 5) * (0-(32.75)));
            yy = 0 + (((tickAnim - 9) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 9) / 5) * (0-(0)));
        }
        else if (tickAnim >= 14 && tickAnim < 18) {
            xx = 0 + (((tickAnim - 14) / 4) * (6-(0)));
            yy = 0 + (((tickAnim - 14) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 14) / 4) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 20) {
            xx = 6 + (((tickAnim - 18) / 2) * (0-(6)));
            yy = 0 + (((tickAnim - 18) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 18) / 2) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(arm3b, arm3b.rotateAngleX + (float) Math.toRadians(xx), arm3b.rotateAngleY + (float) Math.toRadians(yy), arm3b.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 3) * (0.3-(0)));
            zz = 0 + (((tickAnim - 0) / 3) * (-0.675-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 9) {
            xx = 0 + (((tickAnim - 3) / 6) * (0-(0)));
            yy = 0.3 + (((tickAnim - 3) / 6) * (0-(0.3)));
            zz = -0.675 + (((tickAnim - 3) / 6) * (0-(-0.675)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.arm3b.rotationPointX = this.arm3b.rotationPointX + (float)(xx);
        this.arm3b.rotationPointY = this.arm3b.rotationPointY - (float)(yy);
        this.arm3b.rotationPointZ = this.arm3b.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 9) {
            xx = -147.375-Math.sin((Math.PI/180)*(((double)tickAnim/20)*360-100))*150 + (((tickAnim - 0) / 9) * (43.75-(-147.375-Math.sin((Math.PI/180)*(((double)tickAnim/20)*360-100))*150)));
            yy = 0 + (((tickAnim - 0) / 9) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 9) * (0-(0)));
        }
        else if (tickAnim >= 9 && tickAnim < 14) {
            xx = 43.75 + (((tickAnim - 9) / 5) * (0-(43.75)));
            yy = 0 + (((tickAnim - 9) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 9) / 5) * (0-(0)));
        }
        else if (tickAnim >= 14 && tickAnim < 18) {
            xx = 0 + (((tickAnim - 14) / 4) * (5.25-(0)));
            yy = 0 + (((tickAnim - 14) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 14) / 4) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 20) {
            xx = 5.25 + (((tickAnim - 18) / 2) * (0-(5.25)));
            yy = 0 + (((tickAnim - 18) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 18) / 2) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(arm3c, arm3c.rotateAngleX + (float) Math.toRadians(xx), arm3c.rotateAngleY + (float) Math.toRadians(yy), arm3c.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 7) {
            xx = 0 + (((tickAnim - 0) / 7) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 7) * (0.2-(0)));
            zz = 0 + (((tickAnim - 0) / 7) * (-0.6-(0)));
        }
        else if (tickAnim >= 7 && tickAnim < 9) {
            xx = 0 + (((tickAnim - 7) / 2) * (0-(0)));
            yy = 0.2 + (((tickAnim - 7) / 2) * (0-(0.2)));
            zz = -0.6 + (((tickAnim - 7) / 2) * (0-(-0.6)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.arm3c.rotationPointX = this.arm3c.rotationPointX + (float)(xx);
        this.arm3c.rotationPointY = this.arm3c.rotationPointY - (float)(yy);
        this.arm3c.rotationPointZ = this.arm3c.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 9) {
            xx = 38.5-Math.sin((Math.PI/180)*(((double)tickAnim/20)*360-50))*-50 + (((tickAnim - 0) / 9) * (53.75-(38.5-Math.sin((Math.PI/180)*(((double)tickAnim/20)*360-50))*-50)));
            yy = 0 + (((tickAnim - 0) / 9) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 9) * (0-(0)));
        }
        else if (tickAnim >= 9 && tickAnim < 14) {
            xx = 53.75 + (((tickAnim - 9) / 5) * (0-(53.75)));
            yy = 0 + (((tickAnim - 9) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 9) / 5) * (0-(0)));
        }
        else if (tickAnim >= 14 && tickAnim < 18) {
            xx = 0 + (((tickAnim - 14) / 4) * (-3.5-(0)));
            yy = 0 + (((tickAnim - 14) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 14) / 4) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 20) {
            xx = -3.5 + (((tickAnim - 18) / 2) * (0-(-3.5)));
            yy = 0 + (((tickAnim - 18) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 18) / 2) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(arm4a, arm4a.rotateAngleX + (float) Math.toRadians(xx), arm4a.rotateAngleY + (float) Math.toRadians(yy), arm4a.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 9 && tickAnim < 14) {
            xx = 1 + (((tickAnim - 9) / 5) * (1-(1)));
            yy = 1 + (((tickAnim - 9) / 5) * (1-(1)));
            zz = 1 + (((tickAnim - 9) / 5) * (1.2-(1)));
        }
        else if (tickAnim >= 14 && tickAnim < 20) {
            xx = 1 + (((tickAnim - 14) / 6) * (1-(1)));
            yy = 1 + (((tickAnim - 14) / 6) * (1-(1)));
            zz = 1.2 + (((tickAnim - 14) / 6) * (1-(1.2)));
        }
        else {
            xx = 1;
            yy = 1;
            zz = 1;
        }
        this.arm4a.setScale((float)xx, (float)yy, (float)zz);




        if (tickAnim >= 0 && tickAnim < 9) {
            xx = -0-Math.sin((Math.PI/180)*(((double)tickAnim/20)*360))*90 + (((tickAnim - 0) / 9) * (29.75-(-0-Math.sin((Math.PI/180)*(((double)tickAnim/20)*360))*90)));
            yy = 0 + (((tickAnim - 0) / 9) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 9) * (0-(0)));
        }
        else if (tickAnim >= 9 && tickAnim < 12) {
            xx = 29.75 + (((tickAnim - 9) / 3) * (35-(29.75)));
            yy = 0 + (((tickAnim - 9) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 9) / 3) * (0-(0)));
        }
        else if (tickAnim >= 12 && tickAnim < 14) {
            xx = 35 + (((tickAnim - 12) / 2) * (0-(35)));
            yy = 0 + (((tickAnim - 12) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 12) / 2) * (0-(0)));
        }
        else if (tickAnim >= 14 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 14) / 6) * (0-(0)));
            yy = 0 + (((tickAnim - 14) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 14) / 6) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(arm4b, arm4b.rotateAngleX + (float) Math.toRadians(xx), arm4b.rotateAngleY + (float) Math.toRadians(yy), arm4b.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 3) * (0.25-(0)));
            zz = 0 + (((tickAnim - 0) / 3) * (-0.7-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 9) {
            xx = 0 + (((tickAnim - 3) / 6) * (0-(0)));
            yy = 0.25 + (((tickAnim - 3) / 6) * (0-(0.25)));
            zz = -0.7 + (((tickAnim - 3) / 6) * (0-(-0.7)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.arm4b.rotationPointX = this.arm4b.rotationPointX + (float)(xx);
        this.arm4b.rotationPointY = this.arm4b.rotationPointY - (float)(yy);
        this.arm4b.rotationPointZ = this.arm4b.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 9) {
            xx = -147.225-Math.sin((Math.PI/180)*(((double)tickAnim/20)*360-100))*150 + (((tickAnim - 0) / 9) * (36.5-(-147.225-Math.sin((Math.PI/180)*(((double)tickAnim/20)*360-100))*150)));
            yy = 0 + (((tickAnim - 0) / 9) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 9) * (0-(0)));
        }
        else if (tickAnim >= 9 && tickAnim < 12) {
            xx = 36.5 + (((tickAnim - 9) / 3) * (26.25-(36.5)));
            yy = 0 + (((tickAnim - 9) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 9) / 3) * (0-(0)));
        }
        else if (tickAnim >= 12 && tickAnim < 14) {
            xx = 26.25 + (((tickAnim - 12) / 2) * (0-(26.25)));
            yy = 0 + (((tickAnim - 12) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 12) / 2) * (0-(0)));
        }
        else if (tickAnim >= 14 && tickAnim < 18) {
            xx = 0 + (((tickAnim - 14) / 4) * (10.75-(0)));
            yy = 0 + (((tickAnim - 14) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 14) / 4) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 20) {
            xx = 10.75 + (((tickAnim - 18) / 2) * (0-(10.75)));
            yy = 0 + (((tickAnim - 18) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 18) / 2) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(arm4c, arm4c.rotateAngleX + (float) Math.toRadians(xx), arm4c.rotateAngleY + (float) Math.toRadians(yy), arm4c.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 6) {
            xx = 0 + (((tickAnim - 0) / 6) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 6) * (0.3-(0)));
            zz = 0 + (((tickAnim - 0) / 6) * (-0.675-(0)));
        }
        else if (tickAnim >= 6 && tickAnim < 9) {
            xx = 0 + (((tickAnim - 6) / 3) * (0-(0)));
            yy = 0.3 + (((tickAnim - 6) / 3) * (0-(0.3)));
            zz = -0.675 + (((tickAnim - 6) / 3) * (0-(-0.675)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.arm4c.rotationPointX = this.arm4c.rotationPointX + (float)(xx);
        this.arm4c.rotationPointY = this.arm4c.rotationPointY - (float)(yy);
        this.arm4c.rotationPointZ = this.arm4c.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 9) {
            xx = 37.7-Math.sin((Math.PI/180)*(((double)tickAnim/20)*360-50))*-50 + (((tickAnim - 0) / 9) * (53.75-(37.7-Math.sin((Math.PI/180)*(((double)tickAnim/20)*360-50))*-50)));
            yy = 0 + (((tickAnim - 0) / 9) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 9) * (0-(0)));
        }
        else if (tickAnim >= 9 && tickAnim < 14) {
            xx = 53.75 + (((tickAnim - 9) / 5) * (0-(53.75)));
            yy = 0 + (((tickAnim - 9) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 9) / 5) * (0-(0)));
        }
        else if (tickAnim >= 14 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 14) / 6) * (0-(0)));
            yy = 0 + (((tickAnim - 14) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 14) / 6) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(arm5a, arm5a.rotateAngleX + (float) Math.toRadians(xx), arm5a.rotateAngleY + (float) Math.toRadians(yy), arm5a.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 9 && tickAnim < 14) {
            xx = 1 + (((tickAnim - 9) / 5) * (1-(1)));
            yy = 1 + (((tickAnim - 9) / 5) * (1-(1)));
            zz = 1 + (((tickAnim - 9) / 5) * (1.2-(1)));
        }
        else if (tickAnim >= 14 && tickAnim < 20) {
            xx = 1 + (((tickAnim - 14) / 6) * (1-(1)));
            yy = 1 + (((tickAnim - 14) / 6) * (1-(1)));
            zz = 1.2 + (((tickAnim - 14) / 6) * (1-(1.2)));
        }
        else {
            xx = 1;
            yy = 1;
            zz = 1;
        }
        this.arm5a.setScale((float)xx, (float)yy, (float)zz);




        if (tickAnim >= 0 && tickAnim < 9) {
            xx = -0-Math.sin((Math.PI/180)*(((double)tickAnim/20)*360))*90 + (((tickAnim - 0) / 9) * (40.75-(-0-Math.sin((Math.PI/180)*(((double)tickAnim/20)*360))*90)));
            yy = 0 + (((tickAnim - 0) / 9) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 9) * (0-(0)));
        }
        else if (tickAnim >= 9 && tickAnim < 12) {
            xx = 40.75 + (((tickAnim - 9) / 3) * (27.62-(40.75)));
            yy = 0 + (((tickAnim - 9) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 9) / 3) * (0-(0)));
        }
        else if (tickAnim >= 12 && tickAnim < 14) {
            xx = 27.62 + (((tickAnim - 12) / 2) * (0-(27.62)));
            yy = 0 + (((tickAnim - 12) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 12) / 2) * (0-(0)));
        }
        else if (tickAnim >= 14 && tickAnim < 18) {
            xx = 0 + (((tickAnim - 14) / 4) * (-5.75-(0)));
            yy = 0 + (((tickAnim - 14) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 14) / 4) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 20) {
            xx = -5.75 + (((tickAnim - 18) / 2) * (0-(-5.75)));
            yy = 0 + (((tickAnim - 18) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 18) / 2) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(arm5b, arm5b.rotateAngleX + (float) Math.toRadians(xx), arm5b.rotateAngleY + (float) Math.toRadians(yy), arm5b.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 3) * (0.25-(0)));
            zz = 0 + (((tickAnim - 0) / 3) * (-0.625-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 9) {
            xx = 0 + (((tickAnim - 3) / 6) * (0-(0)));
            yy = 0.25 + (((tickAnim - 3) / 6) * (0-(0.25)));
            zz = -0.625 + (((tickAnim - 3) / 6) * (0-(-0.625)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.arm5b.rotationPointX = this.arm5b.rotationPointX + (float)(xx);
        this.arm5b.rotationPointY = this.arm5b.rotationPointY - (float)(yy);
        this.arm5b.rotationPointZ = this.arm5b.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 9) {
            xx = -147.375-Math.sin((Math.PI/180)*(((double)tickAnim/20)*360-100))*150 + (((tickAnim - 0) / 9) * (48.25-(-147.375-Math.sin((Math.PI/180)*(((double)tickAnim/20)*360-100))*150)));
            yy = 0 + (((tickAnim - 0) / 9) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 9) * (0-(0)));
        }
        else if (tickAnim >= 9 && tickAnim < 12) {
            xx = 48.25 + (((tickAnim - 9) / 3) * (42.37-(48.25)));
            yy = 0 + (((tickAnim - 9) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 9) / 3) * (0-(0)));
        }
        else if (tickAnim >= 12 && tickAnim < 14) {
            xx = 42.37 + (((tickAnim - 12) / 2) * (0-(42.37)));
            yy = 0 + (((tickAnim - 12) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 12) / 2) * (0-(0)));
        }
        else if (tickAnim >= 14 && tickAnim < 18) {
            xx = 0 + (((tickAnim - 14) / 4) * (10.75-(0)));
            yy = 0 + (((tickAnim - 14) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 14) / 4) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 20) {
            xx = 10.75 + (((tickAnim - 18) / 2) * (0-(10.75)));
            yy = 0 + (((tickAnim - 18) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 18) / 2) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(arm5c, arm5c.rotateAngleX + (float) Math.toRadians(xx), arm5c.rotateAngleY + (float) Math.toRadians(yy), arm5c.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 6) {
            xx = 0 + (((tickAnim - 0) / 6) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 6) * (0.35-(0)));
            zz = 0 + (((tickAnim - 0) / 6) * (-0.675-(0)));
        }
        else if (tickAnim >= 6 && tickAnim < 9) {
            xx = 0 + (((tickAnim - 6) / 3) * (0-(0)));
            yy = 0.35 + (((tickAnim - 6) / 3) * (0-(0.35)));
            zz = -0.675 + (((tickAnim - 6) / 3) * (0-(-0.675)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.arm5c.rotationPointX = this.arm5c.rotationPointX + (float)(xx);
        this.arm5c.rotationPointY = this.arm5c.rotationPointY - (float)(yy);
        this.arm5c.rotationPointZ = this.arm5c.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 9) {
            xx = 37.625-Math.sin((Math.PI/180)*(((double)tickAnim/20)*360-50))*-50 + (((tickAnim - 0) / 9) * (47.25-(37.625-Math.sin((Math.PI/180)*(((double)tickAnim/20)*360-50))*-50)));
            yy = 0 + (((tickAnim - 0) / 9) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 9) * (0-(0)));
        }
        else if (tickAnim >= 9 && tickAnim < 14) {
            xx = 47.25 + (((tickAnim - 9) / 5) * (0-(47.25)));
            yy = 0 + (((tickAnim - 9) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 9) / 5) * (0-(0)));
        }
        else if (tickAnim >= 14 && tickAnim < 18) {
            xx = 0 + (((tickAnim - 14) / 4) * (-4.75-(0)));
            yy = 0 + (((tickAnim - 14) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 14) / 4) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 20) {
            xx = -4.75 + (((tickAnim - 18) / 2) * (0-(-4.75)));
            yy = 0 + (((tickAnim - 18) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 18) / 2) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(arm6a, arm6a.rotateAngleX + (float) Math.toRadians(xx), arm6a.rotateAngleY + (float) Math.toRadians(yy), arm6a.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 9 && tickAnim < 14) {
            xx = 1 + (((tickAnim - 9) / 5) * (1-(1)));
            yy = 1 + (((tickAnim - 9) / 5) * (1-(1)));
            zz = 1 + (((tickAnim - 9) / 5) * (1.2-(1)));
        }
        else if (tickAnim >= 14 && tickAnim < 20) {
            xx = 1 + (((tickAnim - 14) / 6) * (1-(1)));
            yy = 1 + (((tickAnim - 14) / 6) * (1-(1)));
            zz = 1.2 + (((tickAnim - 14) / 6) * (1-(1.2)));
        }
        else {
            xx = 1;
            yy = 1;
            zz = 1;
        }
        this.arm6a.setScale((float)xx, (float)yy, (float)zz);




        if (tickAnim >= 0 && tickAnim < 9) {
            xx = 0.35-Math.sin((Math.PI/180)*(((double)tickAnim/20)*360))*90 + (((tickAnim - 0) / 9) * (32.75-(0.35-Math.sin((Math.PI/180)*(((double)tickAnim/20)*360))*90)));
            yy = 0 + (((tickAnim - 0) / 9) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 9) * (0-(0)));
        }
        else if (tickAnim >= 9 && tickAnim < 12) {
            xx = 32.75 + (((tickAnim - 9) / 3) * (45.5-(32.75)));
            yy = 0 + (((tickAnim - 9) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 9) / 3) * (0-(0)));
        }
        else if (tickAnim >= 12 && tickAnim < 14) {
            xx = 45.5 + (((tickAnim - 12) / 2) * (0-(45.5)));
            yy = 0 + (((tickAnim - 12) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 12) / 2) * (0-(0)));
        }
        else if (tickAnim >= 14 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 14) / 6) * (0-(0)));
            yy = 0 + (((tickAnim - 14) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 14) / 6) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(arm6b, arm6b.rotateAngleX + (float) Math.toRadians(xx), arm6b.rotateAngleY + (float) Math.toRadians(yy), arm6b.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 3) * (0.3-(0)));
            zz = 0 + (((tickAnim - 0) / 3) * (-0.675-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 9) {
            xx = 0 + (((tickAnim - 3) / 6) * (0-(0)));
            yy = 0.3 + (((tickAnim - 3) / 6) * (0-(0.3)));
            zz = -0.675 + (((tickAnim - 3) / 6) * (0-(-0.675)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.arm6b.rotationPointX = this.arm6b.rotationPointX + (float)(xx);
        this.arm6b.rotationPointY = this.arm6b.rotationPointY - (float)(yy);
        this.arm6b.rotationPointZ = this.arm6b.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 9) {
            xx = -147.375-Math.sin((Math.PI/180)*(((double)tickAnim/20)*360-100))*150 + (((tickAnim - 0) / 9) * (43.75-(-147.375-Math.sin((Math.PI/180)*(((double)tickAnim/20)*360-100))*150)));
            yy = 0 + (((tickAnim - 0) / 9) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 9) * (0-(0)));
        }
        else if (tickAnim >= 9 && tickAnim < 12) {
            xx = 43.75 + (((tickAnim - 9) / 3) * (45.75-(43.75)));
            yy = 0 + (((tickAnim - 9) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 9) / 3) * (0-(0)));
        }
        else if (tickAnim >= 12 && tickAnim < 14) {
            xx = 45.75 + (((tickAnim - 12) / 2) * (0-(45.75)));
            yy = 0 + (((tickAnim - 12) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 12) / 2) * (0-(0)));
        }
        else if (tickAnim >= 14 && tickAnim < 18) {
            xx = 0 + (((tickAnim - 14) / 4) * (10.25-(0)));
            yy = 0 + (((tickAnim - 14) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 14) / 4) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 20) {
            xx = 10.25 + (((tickAnim - 18) / 2) * (0-(10.25)));
            yy = 0 + (((tickAnim - 18) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 18) / 2) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(arm6c, arm6c.rotateAngleX + (float) Math.toRadians(xx), arm6c.rotateAngleY + (float) Math.toRadians(yy), arm6c.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 7) {
            xx = 0 + (((tickAnim - 0) / 7) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 7) * (0.2-(0)));
            zz = 0 + (((tickAnim - 0) / 7) * (-0.6-(0)));
        }
        else if (tickAnim >= 7 && tickAnim < 9) {
            xx = 0 + (((tickAnim - 7) / 2) * (0-(0)));
            yy = 0.2 + (((tickAnim - 7) / 2) * (0-(0.2)));
            zz = -0.6 + (((tickAnim - 7) / 2) * (0-(-0.6)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.arm6c.rotationPointX = this.arm6c.rotationPointX + (float)(xx);
        this.arm6c.rotationPointY = this.arm6c.rotationPointY - (float)(yy);
        this.arm6c.rotationPointZ = this.arm6c.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 9) {
            xx = 37.625-Math.sin((Math.PI/180)*(((double)tickAnim/20)*360-50))*-50 + (((tickAnim - 0) / 9) * (29.25-(37.625-Math.sin((Math.PI/180)*(((double)tickAnim/20)*360-50))*-50)));
            yy = 0 + (((tickAnim - 0) / 9) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 9) * (0-(0)));
        }
        else if (tickAnim >= 9 && tickAnim < 14) {
            xx = 29.25 + (((tickAnim - 9) / 5) * (0-(29.25)));
            yy = 0 + (((tickAnim - 9) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 9) / 5) * (0-(0)));
        }
        else if (tickAnim >= 14 && tickAnim < 18) {
            xx = 0 + (((tickAnim - 14) / 4) * (-9.75-(0)));
            yy = 0 + (((tickAnim - 14) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 14) / 4) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 20) {
            xx = -9.75 + (((tickAnim - 18) / 2) * (0-(-9.75)));
            yy = 0 + (((tickAnim - 18) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 18) / 2) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(arm7a, arm7a.rotateAngleX + (float) Math.toRadians(xx), arm7a.rotateAngleY + (float) Math.toRadians(yy), arm7a.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 9 && tickAnim < 14) {
            xx = 1 + (((tickAnim - 9) / 5) * (1-(1)));
            yy = 1 + (((tickAnim - 9) / 5) * (1-(1)));
            zz = 1 + (((tickAnim - 9) / 5) * (1.2-(1)));
        }
        else if (tickAnim >= 14 && tickAnim < 20) {
            xx = 1 + (((tickAnim - 14) / 6) * (1-(1)));
            yy = 1 + (((tickAnim - 14) / 6) * (1-(1)));
            zz = 1.2 + (((tickAnim - 14) / 6) * (1-(1.2)));
        }
        else {
            xx = 1;
            yy = 1;
            zz = 1;
        }
        this.arm7a.setScale((float)xx, (float)yy, (float)zz);




        if (tickAnim >= 0 && tickAnim < 9) {
            xx = 0.35-Math.sin((Math.PI/180)*(((double)tickAnim/20)*360))*90 + (((tickAnim - 0) / 9) * (32.75-(0.35-Math.sin((Math.PI/180)*(((double)tickAnim/20)*360))*90)));
            yy = 0 + (((tickAnim - 0) / 9) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 9) * (0-(0)));
        }
        else if (tickAnim >= 9 && tickAnim < 12) {
            xx = 32.75 + (((tickAnim - 9) / 3) * (38.5-(32.75)));
            yy = 0 + (((tickAnim - 9) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 9) / 3) * (0-(0)));
        }
        else if (tickAnim >= 12 && tickAnim < 14) {
            xx = 38.5 + (((tickAnim - 12) / 2) * (0-(38.5)));
            yy = 0 + (((tickAnim - 12) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 12) / 2) * (0-(0)));
        }
        else if (tickAnim >= 14 && tickAnim < 18) {
            xx = 0 + (((tickAnim - 14) / 4) * (4.25-(0)));
            yy = 0 + (((tickAnim - 14) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 14) / 4) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 20) {
            xx = 4.25 + (((tickAnim - 18) / 2) * (0-(4.25)));
            yy = 0 + (((tickAnim - 18) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 18) / 2) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(arm7b, arm7b.rotateAngleX + (float) Math.toRadians(xx), arm7b.rotateAngleY + (float) Math.toRadians(yy), arm7b.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 3) * (0.3-(0)));
            zz = 0 + (((tickAnim - 0) / 3) * (-0.675-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 9) {
            xx = 0 + (((tickAnim - 3) / 6) * (0-(0)));
            yy = 0.3 + (((tickAnim - 3) / 6) * (0-(0.3)));
            zz = -0.675 + (((tickAnim - 3) / 6) * (0-(-0.675)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.arm7b.rotationPointX = this.arm7b.rotationPointX + (float)(xx);
        this.arm7b.rotationPointY = this.arm7b.rotationPointY - (float)(yy);
        this.arm7b.rotationPointZ = this.arm7b.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 9) {
            xx = -147.375-Math.sin((Math.PI/180)*(((double)tickAnim/20)*360-100))*150 + (((tickAnim - 0) / 9) * (43.75-(-147.375-Math.sin((Math.PI/180)*(((double)tickAnim/20)*360-100))*150)));
            yy = 0 + (((tickAnim - 0) / 9) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 9) * (0-(0)));
        }
        else if (tickAnim >= 9 && tickAnim < 12) {
            xx = 43.75 + (((tickAnim - 9) / 3) * (42.37-(43.75)));
            yy = 0 + (((tickAnim - 9) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 9) / 3) * (0-(0)));
        }
        else if (tickAnim >= 12 && tickAnim < 14) {
            xx = 42.37 + (((tickAnim - 12) / 2) * (0-(42.37)));
            yy = 0 + (((tickAnim - 12) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 12) / 2) * (0-(0)));
        }
        else if (tickAnim >= 14 && tickAnim < 18) {
            xx = 0 + (((tickAnim - 14) / 4) * (10.75-(0)));
            yy = 0 + (((tickAnim - 14) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 14) / 4) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 20) {
            xx = 10.75 + (((tickAnim - 18) / 2) * (0-(10.75)));
            yy = 0 + (((tickAnim - 18) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 18) / 2) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(arm7c, arm7c.rotateAngleX + (float) Math.toRadians(xx), arm7c.rotateAngleY + (float) Math.toRadians(yy), arm7c.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 7) {
            xx = 0 + (((tickAnim - 0) / 7) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 7) * (0.2-(0)));
            zz = 0 + (((tickAnim - 0) / 7) * (-0.6-(0)));
        }
        else if (tickAnim >= 7 && tickAnim < 9) {
            xx = 0 + (((tickAnim - 7) / 2) * (0-(0)));
            yy = 0.2 + (((tickAnim - 7) / 2) * (0-(0.2)));
            zz = -0.6 + (((tickAnim - 7) / 2) * (0-(-0.6)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.arm7c.rotationPointX = this.arm7c.rotationPointX + (float)(xx);
        this.arm7c.rotationPointY = this.arm7c.rotationPointY - (float)(yy);
        this.arm7c.rotationPointZ = this.arm7c.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 9) {
            xx = 37.625-Math.sin((Math.PI/180)*(((double)tickAnim/20)*360-50))*-50 + (((tickAnim - 0) / 9) * (34-(37.625-Math.sin((Math.PI/180)*(((double)tickAnim/20)*360-50))*-50)));
            yy = 0 + (((tickAnim - 0) / 9) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 9) * (0-(0)));
        }
        else if (tickAnim >= 9 && tickAnim < 14) {
            xx = 34 + (((tickAnim - 9) / 5) * (0-(34)));
            yy = 0 + (((tickAnim - 9) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 9) / 5) * (0-(0)));
        }
        else if (tickAnim >= 14 && tickAnim < 18) {
            xx = 0 + (((tickAnim - 14) / 4) * (-6.75-(0)));
            yy = 0 + (((tickAnim - 14) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 14) / 4) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 20) {
            xx = -6.75 + (((tickAnim - 18) / 2) * (0-(-6.75)));
            yy = 0 + (((tickAnim - 18) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 18) / 2) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(arm8a, arm8a.rotateAngleX + (float) Math.toRadians(xx), arm8a.rotateAngleY + (float) Math.toRadians(yy), arm8a.rotateAngleZ + (float) Math.toRadians(zz));

        this.arm8a.rotationPointX = this.arm8a.rotationPointX + (float)(0);
        this.arm8a.rotationPointY = this.arm8a.rotationPointY - (float)(0);
        this.arm8a.rotationPointZ = this.arm8a.rotationPointZ + (float)(0);

        if (tickAnim >= 9 && tickAnim < 14) {
            xx = 1 + (((tickAnim - 9) / 5) * (1-(1)));
            yy = 1 + (((tickAnim - 9) / 5) * (1-(1)));
            zz = 1 + (((tickAnim - 9) / 5) * (1.2-(1)));
        }
        else if (tickAnim >= 14 && tickAnim < 20) {
            xx = 1 + (((tickAnim - 14) / 6) * (1-(1)));
            yy = 1 + (((tickAnim - 14) / 6) * (1-(1)));
            zz = 1.2 + (((tickAnim - 14) / 6) * (1-(1.2)));
        }
        else {
            xx = 1;
            yy = 1;
            zz = 1;
        }
        this.arm8a.setScale((float)xx, (float)yy, (float)zz);




        if (tickAnim >= 0 && tickAnim < 9) {
            xx = 0.35-Math.sin((Math.PI/180)*(((double)tickAnim/20)*360))*90 + (((tickAnim - 0) / 9) * (32.75-(0.35-Math.sin((Math.PI/180)*(((double)tickAnim/20)*360))*90)));
            yy = 0 + (((tickAnim - 0) / 9) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 9) * (0-(0)));
        }
        else if (tickAnim >= 9 && tickAnim < 12) {
            xx = 32.75 + (((tickAnim - 9) / 3) * (37.37-(32.75)));
            yy = 0 + (((tickAnim - 9) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 9) / 3) * (0-(0)));
        }
        else if (tickAnim >= 12 && tickAnim < 14) {
            xx = 37.37 + (((tickAnim - 12) / 2) * (0-(37.37)));
            yy = 0 + (((tickAnim - 12) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 12) / 2) * (0-(0)));
        }
        else if (tickAnim >= 14 && tickAnim < 18) {
            xx = 0 + (((tickAnim - 14) / 4) * (3.5-(0)));
            yy = 0 + (((tickAnim - 14) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 14) / 4) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 20) {
            xx = 3.5 + (((tickAnim - 18) / 2) * (0-(3.5)));
            yy = 0 + (((tickAnim - 18) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 18) / 2) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(arm8b, arm8b.rotateAngleX + (float) Math.toRadians(xx), arm8b.rotateAngleY + (float) Math.toRadians(yy), arm8b.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 3) * (0.3-(0)));
            zz = 0 + (((tickAnim - 0) / 3) * (-0.675-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 9) {
            xx = 0 + (((tickAnim - 3) / 6) * (0-(0)));
            yy = 0.3 + (((tickAnim - 3) / 6) * (0-(0.3)));
            zz = -0.675 + (((tickAnim - 3) / 6) * (0-(-0.675)));
        }
        else if (tickAnim >= 9 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 9) / 11) * (0-(0)));
            yy = 0 + (((tickAnim - 9) / 11) * (0-(0)));
            zz = 0 + (((tickAnim - 9) / 11) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.arm8b.rotationPointX = this.arm8b.rotationPointX + (float)(xx);
        this.arm8b.rotationPointY = this.arm8b.rotationPointY - (float)(yy);
        this.arm8b.rotationPointZ = this.arm8b.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 9) {
            xx = -147.375-Math.sin((Math.PI/180)*(((double)tickAnim/20)*360-100))*150 + (((tickAnim - 0) / 9) * (43.75-(-147.375-Math.sin((Math.PI/180)*(((double)tickAnim/20)*360-100))*150)));
            yy = 0 + (((tickAnim - 0) / 9) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 9) * (0-(0)));
        }
        else if (tickAnim >= 9 && tickAnim < 12) {
            xx = 43.75 + (((tickAnim - 9) / 3) * (39.37-(43.75)));
            yy = 0 + (((tickAnim - 9) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 9) / 3) * (0-(0)));
        }
        else if (tickAnim >= 12 && tickAnim < 14) {
            xx = 39.37 + (((tickAnim - 12) / 2) * (0-(39.37)));
            yy = 0 + (((tickAnim - 12) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 12) / 2) * (0-(0)));
        }
        else if (tickAnim >= 14 && tickAnim < 18) {
            xx = 0 + (((tickAnim - 14) / 4) * (7-(0)));
            yy = 0 + (((tickAnim - 14) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 14) / 4) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 20) {
            xx = 7 + (((tickAnim - 18) / 2) * (0-(7)));
            yy = 0 + (((tickAnim - 18) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 18) / 2) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(arm8c, arm8c.rotateAngleX + (float) Math.toRadians(xx), arm8c.rotateAngleY + (float) Math.toRadians(yy), arm8c.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 7) {
            xx = 0 + (((tickAnim - 0) / 7) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 7) * (0.2-(0)));
            zz = 0 + (((tickAnim - 0) / 7) * (-0.6-(0)));
        }
        else if (tickAnim >= 7 && tickAnim < 9) {
            xx = 0 + (((tickAnim - 7) / 2) * (0-(0)));
            yy = 0.2 + (((tickAnim - 7) / 2) * (0-(0.2)));
            zz = -0.6 + (((tickAnim - 7) / 2) * (0-(-0.6)));
        }
        else if (tickAnim >= 9 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 9) / 11) * (0-(0)));
            yy = 0 + (((tickAnim - 9) / 11) * (0-(0)));
            zz = 0 + (((tickAnim - 9) / 11) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.arm8c.rotationPointX = this.arm8c.rotationPointX + (float)(xx);
        this.arm8c.rotationPointY = this.arm8c.rotationPointY - (float)(yy);
        this.arm8c.rotationPointZ = this.arm8c.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 9) {
            xx = 38.5-Math.sin((Math.PI/180)*(((double)tickAnim/20)*360-50))*-50 + (((tickAnim - 0) / 9) * (36-(38.5-Math.sin((Math.PI/180)*(((double)tickAnim/20)*360-50))*-50)));
            yy = 0 + (((tickAnim - 0) / 9) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 9) * (0-(0)));
        }
        else if (tickAnim >= 9 && tickAnim < 14) {
            xx = 36 + (((tickAnim - 9) / 5) * (0-(36)));
            yy = 0 + (((tickAnim - 9) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 9) / 5) * (0-(0)));
        }
        else if (tickAnim >= 14 && tickAnim < 18) {
            xx = 0 + (((tickAnim - 14) / 4) * (-5-(0)));
            yy = 0 + (((tickAnim - 14) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 14) / 4) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 20) {
            xx = -5 + (((tickAnim - 18) / 2) * (0-(-5)));
            yy = 0 + (((tickAnim - 18) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 18) / 2) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(arm9a, arm9a.rotateAngleX + (float) Math.toRadians(xx), arm9a.rotateAngleY + (float) Math.toRadians(yy), arm9a.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 9 && tickAnim < 14) {
            xx = 1 + (((tickAnim - 9) / 5) * (1-(1)));
            yy = 1 + (((tickAnim - 9) / 5) * (1-(1)));
            zz = 1 + (((tickAnim - 9) / 5) * (1.2-(1)));
        }
        else if (tickAnim >= 14 && tickAnim < 20) {
            xx = 1 + (((tickAnim - 14) / 6) * (1-(1)));
            yy = 1 + (((tickAnim - 14) / 6) * (1-(1)));
            zz = 1.2 + (((tickAnim - 14) / 6) * (1-(1.2)));
        }
        else {
            xx = 1;
            yy = 1;
            zz = 1;
        }
        this.arm9a.setScale((float)xx, (float)yy, (float)zz);




        if (tickAnim >= 0 && tickAnim < 9) {
            xx = -0-Math.sin((Math.PI/180)*(((double)tickAnim/20)*360))*90 + (((tickAnim - 0) / 9) * (29.75-(-0-Math.sin((Math.PI/180)*(((double)tickAnim/20)*360))*90)));
            yy = 0 + (((tickAnim - 0) / 9) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 9) * (0-(0)));
        }
        else if (tickAnim >= 9 && tickAnim < 12) {
            xx = 29.75 + (((tickAnim - 9) / 3) * (38.37-(29.75)));
            yy = 0 + (((tickAnim - 9) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 9) / 3) * (0-(0)));
        }
        else if (tickAnim >= 12 && tickAnim < 14) {
            xx = 38.37 + (((tickAnim - 12) / 2) * (0-(38.37)));
            yy = 0 + (((tickAnim - 12) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 12) / 2) * (0-(0)));
        }
        else if (tickAnim >= 14 && tickAnim < 18) {
            xx = 0 + (((tickAnim - 14) / 4) * (4.5-(0)));
            yy = 0 + (((tickAnim - 14) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 14) / 4) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 20) {
            xx = 4.5 + (((tickAnim - 18) / 2) * (0-(4.5)));
            yy = 0 + (((tickAnim - 18) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 18) / 2) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(arm9b, arm9b.rotateAngleX + (float) Math.toRadians(xx), arm9b.rotateAngleY + (float) Math.toRadians(yy), arm9b.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 3) * (0.25-(0)));
            zz = 0 + (((tickAnim - 0) / 3) * (-0.7-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 9) {
            xx = 0 + (((tickAnim - 3) / 6) * (0-(0)));
            yy = 0.25 + (((tickAnim - 3) / 6) * (0-(0.25)));
            zz = -0.7 + (((tickAnim - 3) / 6) * (0-(-0.7)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.arm9b.rotationPointX = this.arm9b.rotationPointX + (float)(xx);
        this.arm9b.rotationPointY = this.arm9b.rotationPointY - (float)(yy);
        this.arm9b.rotationPointZ = this.arm9b.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 9) {
            xx = -147.225-Math.sin((Math.PI/180)*(((double)tickAnim/20)*360-100))*150 + (((tickAnim - 0) / 9) * (36.5-(-147.225-Math.sin((Math.PI/180)*(((double)tickAnim/20)*360-100))*150)));
            yy = 0 + (((tickAnim - 0) / 9) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 9) * (0-(0)));
        }
        else if (tickAnim >= 9 && tickAnim < 12) {
            xx = 36.5 + (((tickAnim - 9) / 3) * (39-(36.5)));
            yy = 0 + (((tickAnim - 9) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 9) / 3) * (0-(0)));
        }
        else if (tickAnim >= 12 && tickAnim < 14) {
            xx = 39 + (((tickAnim - 12) / 2) * (0-(39)));
            yy = 0 + (((tickAnim - 12) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 12) / 2) * (0-(0)));
        }
        else if (tickAnim >= 14 && tickAnim < 18) {
            xx = 0 + (((tickAnim - 14) / 4) * (7.75-(0)));
            yy = 0 + (((tickAnim - 14) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 14) / 4) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 20) {
            xx = 7.75 + (((tickAnim - 18) / 2) * (0-(7.75)));
            yy = 0 + (((tickAnim - 18) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 18) / 2) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(arm9c, arm9c.rotateAngleX + (float) Math.toRadians(xx), arm9c.rotateAngleY + (float) Math.toRadians(yy), arm9c.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 6) {
            xx = 0 + (((tickAnim - 0) / 6) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 6) * (0.3-(0)));
            zz = 0 + (((tickAnim - 0) / 6) * (-0.675-(0)));
        }
        else if (tickAnim >= 6 && tickAnim < 9) {
            xx = 0 + (((tickAnim - 6) / 3) * (0-(0)));
            yy = 0.3 + (((tickAnim - 6) / 3) * (0-(0.3)));
            zz = -0.675 + (((tickAnim - 6) / 3) * (0-(-0.675)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.arm9c.rotationPointX = this.arm9c.rotationPointX + (float)(xx);
        this.arm9c.rotationPointY = this.arm9c.rotationPointY - (float)(yy);
        this.arm9c.rotationPointZ = this.arm9c.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 9) {
            xx = 37.7-Math.sin((Math.PI/180)*(((double)tickAnim/20)*360-50))*-50 + (((tickAnim - 0) / 9) * (50.25-(37.7-Math.sin((Math.PI/180)*(((double)tickAnim/20)*360-50))*-50)));
            yy = 0 + (((tickAnim - 0) / 9) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 9) * (0-(0)));
        }
        else if (tickAnim >= 9 && tickAnim < 14) {
            xx = 50.25 + (((tickAnim - 9) / 5) * (0-(50.25)));
            yy = 0 + (((tickAnim - 9) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 9) / 5) * (0-(0)));
        }
        else if (tickAnim >= 14 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 14) / 6) * (0-(0)));
            yy = 0 + (((tickAnim - 14) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 14) / 6) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(arm10a, arm10a.rotateAngleX + (float) Math.toRadians(xx), arm10a.rotateAngleY + (float) Math.toRadians(yy), arm10a.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 9 && tickAnim < 14) {
            xx = 1 + (((tickAnim - 9) / 5) * (1-(1)));
            yy = 1 + (((tickAnim - 9) / 5) * (1-(1)));
            zz = 1 + (((tickAnim - 9) / 5) * (1.2-(1)));
        }
        else if (tickAnim >= 14 && tickAnim < 20) {
            xx = 1 + (((tickAnim - 14) / 6) * (1-(1)));
            yy = 1 + (((tickAnim - 14) / 6) * (1-(1)));
            zz = 1.2 + (((tickAnim - 14) / 6) * (1-(1.2)));
        }
        else {
            xx = 1;
            yy = 1;
            zz = 1;
        }
        this.arm10a.setScale((float)xx, (float)yy, (float)zz);




        if (tickAnim >= 0 && tickAnim < 9) {
            xx = -0-Math.sin((Math.PI/180)*(((double)tickAnim/20)*360))*90 + (((tickAnim - 0) / 9) * (36.75-(-0-Math.sin((Math.PI/180)*(((double)tickAnim/20)*360))*90)));
            yy = 0 + (((tickAnim - 0) / 9) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 9) * (0-(0)));
        }
        else if (tickAnim >= 9 && tickAnim < 12) {
            xx = 36.75 + (((tickAnim - 9) / 3) * (41.12-(36.75)));
            yy = 0 + (((tickAnim - 9) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 9) / 3) * (0-(0)));
        }
        else if (tickAnim >= 12 && tickAnim < 14) {
            xx = 41.12 + (((tickAnim - 12) / 2) * (0-(41.12)));
            yy = 0 + (((tickAnim - 12) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 12) / 2) * (0-(0)));
        }
        else if (tickAnim >= 14 && tickAnim < 18) {
            xx = 0 + (((tickAnim - 14) / 4) * (-5.75-(0)));
            yy = 0 + (((tickAnim - 14) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 14) / 4) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 20) {
            xx = -5.75 + (((tickAnim - 18) / 2) * (0-(-5.75)));
            yy = 0 + (((tickAnim - 18) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 18) / 2) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(arm10b, arm10b.rotateAngleX + (float) Math.toRadians(xx), arm10b.rotateAngleY + (float) Math.toRadians(yy), arm10b.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 3) * (0.25-(0)));
            zz = 0 + (((tickAnim - 0) / 3) * (-0.625-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 9) {
            xx = 0 + (((tickAnim - 3) / 6) * (0-(0)));
            yy = 0.25 + (((tickAnim - 3) / 6) * (0-(0.25)));
            zz = -0.625 + (((tickAnim - 3) / 6) * (0-(-0.625)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.arm10b.rotationPointX = this.arm10b.rotationPointX + (float)(xx);
        this.arm10b.rotationPointY = this.arm10b.rotationPointY - (float)(yy);
        this.arm10b.rotationPointZ = this.arm10b.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 9) {
            xx = -147.375-Math.sin((Math.PI/180)*(((double)tickAnim/20)*360-100))*150 + (((tickAnim - 0) / 9) * (38.25-(-147.375-Math.sin((Math.PI/180)*(((double)tickAnim/20)*360-100))*150)));
            yy = 0 + (((tickAnim - 0) / 9) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 9) * (0-(0)));
        }
        else if (tickAnim >= 9 && tickAnim < 12) {
            xx = 38.25 + (((tickAnim - 9) / 3) * (44.62-(38.25)));
            yy = 0 + (((tickAnim - 9) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 9) / 3) * (0-(0)));
        }
        else if (tickAnim >= 12 && tickAnim < 14) {
            xx = 44.62 + (((tickAnim - 12) / 2) * (0-(44.62)));
            yy = 0 + (((tickAnim - 12) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 12) / 2) * (0-(0)));
        }
        else if (tickAnim >= 14 && tickAnim < 18) {
            xx = 0 + (((tickAnim - 14) / 4) * (9.75-(0)));
            yy = 0 + (((tickAnim - 14) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 14) / 4) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 20) {
            xx = 9.75 + (((tickAnim - 18) / 2) * (0-(9.75)));
            yy = 0 + (((tickAnim - 18) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 18) / 2) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(arm10c, arm10c.rotateAngleX + (float) Math.toRadians(xx), arm10c.rotateAngleY + (float) Math.toRadians(yy), arm10c.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 6) {
            xx = 0 + (((tickAnim - 0) / 6) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 6) * (0.35-(0)));
            zz = 0 + (((tickAnim - 0) / 6) * (-0.675-(0)));
        }
        else if (tickAnim >= 6 && tickAnim < 9) {
            xx = 0 + (((tickAnim - 6) / 3) * (0-(0)));
            yy = 0.35 + (((tickAnim - 6) / 3) * (0-(0.35)));
            zz = -0.675 + (((tickAnim - 6) / 3) * (0-(-0.675)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.arm10c.rotationPointX = this.arm10c.rotationPointX + (float)(xx);
        this.arm10c.rotationPointY = this.arm10c.rotationPointY - (float)(yy);
        this.arm10c.rotationPointZ = this.arm10c.rotationPointZ + (float)(zz);


    }
    public void animBack(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime) {
        EntityPrehistoricFloraEromangateuthis entity = (EntityPrehistoricFloraEromangateuthis) entitylivingbaseIn;
        int animCycle = 72;
        double tickAnim = (entity.ticksExisted + entity.getTickOffset()) - (int) (Math.floor((double) (entity.ticksExisted + entity.getTickOffset()) / (double) animCycle) * (double) animCycle) + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;
        this.setRotateAngle(base, base.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*297.8-150))*3), base.rotateAngleY + (float) Math.toRadians(0), base.rotateAngleZ + (float) Math.toRadians(0-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*99.5-50))*2));
        this.base.rotationPointX = this.base.rotationPointX + (float)(-0-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*99.5-100))*0.2);
        this.base.rotationPointY = this.base.rotationPointY - (float)(0);
        this.base.rotationPointZ = this.base.rotationPointZ + (float)(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*297.8-100))*1.5);
        this.base.setScale((float)(1+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*297.8-100))*0.01),(float)(1+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*297.8-100))*0.01),(float)1);


        this.setRotateAngle(FinL, FinL.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*297.8-180))*20), FinL.rotateAngleY + (float) Math.toRadians(0), FinL.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*297.8-100))*-20));


        this.setRotateAngle(FinL2, FinL2.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*297.8-180))*20), FinL2.rotateAngleY + (float) Math.toRadians(0), FinL2.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*297.8-100))*20));


        this.setRotateAngle(body2, body2.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*297.8-120))*-2), body2.rotateAngleY + (float) Math.toRadians(0), body2.rotateAngleZ + (float) Math.toRadians(0));


        this.siphon.setScale((float)1,(float)1,(float)(1+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*297.8-80))*0.1));


        this.setRotateAngle(arm1a, arm1a.rotateAngleX + (float) Math.toRadians(-4.25+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*297.8-120))*-1), arm1a.rotateAngleY + (float) Math.toRadians(0), arm1a.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(arm1b, arm1b.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*297.8-170))*-2), arm1b.rotateAngleY + (float) Math.toRadians(0), arm1b.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(arm1c, arm1c.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*297.8-300))*-3), arm1c.rotateAngleY + (float) Math.toRadians(0), arm1c.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(arm2a, arm2a.rotateAngleX + (float) Math.toRadians(-5.5+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*297.8-100))*-1), arm2a.rotateAngleY + (float) Math.toRadians(0), arm2a.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(arm2b, arm2b.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*297.8-150))*2), arm2b.rotateAngleY + (float) Math.toRadians(0), arm2b.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(arm2c, arm2c.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*297.8-250))*-3), arm2c.rotateAngleY + (float) Math.toRadians(0), arm2c.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(arm3a, arm3a.rotateAngleX + (float) Math.toRadians(-4.75+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*297.8-80))*-1), arm3a.rotateAngleY + (float) Math.toRadians(0), arm3a.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(arm3b, arm3b.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*297.8-130))*2), arm3b.rotateAngleY + (float) Math.toRadians(0), arm3b.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(arm3c, arm3c.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*297.8-180))*-3), arm3c.rotateAngleY + (float) Math.toRadians(0), arm3c.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(arm4a, arm4a.rotateAngleX + (float) Math.toRadians(-5.5+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*297.8-100))*-1), arm4a.rotateAngleY + (float) Math.toRadians(0), arm4a.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(arm4b, arm4b.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*297.8-150))*-2), arm4b.rotateAngleY + (float) Math.toRadians(0), arm4b.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(arm4c, arm4c.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*297.8-250))*-3), arm4c.rotateAngleY + (float) Math.toRadians(0), arm4c.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(arm5a, arm5a.rotateAngleX + (float) Math.toRadians(-4.25+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*297.8-125))*-1), arm5a.rotateAngleY + (float) Math.toRadians(0), arm5a.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(arm5b, arm5b.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*297.8-175))*-2), arm5b.rotateAngleY + (float) Math.toRadians(0), arm5b.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(arm5c, arm5c.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*297.8-305))*-3), arm5c.rotateAngleY + (float) Math.toRadians(0), arm5c.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(arm6a, arm6a.rotateAngleX + (float) Math.toRadians(-4.25+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*297.8-120))*-1), arm6a.rotateAngleY + (float) Math.toRadians(0), arm6a.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(arm6b, arm6b.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*297.8-170))*-2), arm6b.rotateAngleY + (float) Math.toRadians(0), arm6b.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(arm6c, arm6c.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*297.8-300))*-3), arm6c.rotateAngleY + (float) Math.toRadians(0), arm6c.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(arm7a, arm7a.rotateAngleX + (float) Math.toRadians(-5.5+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*297.8-100))*-1), arm7a.rotateAngleY + (float) Math.toRadians(0), arm7a.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(arm7b, arm7b.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*297.8-150))*2), arm7b.rotateAngleY + (float) Math.toRadians(0), arm7b.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(arm7c, arm7c.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*297.8-250))*-3), arm7c.rotateAngleY + (float) Math.toRadians(0), arm7c.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(arm8a, arm8a.rotateAngleX + (float) Math.toRadians(-4.75+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*297.8-80))*1), arm8a.rotateAngleY + (float) Math.toRadians(0), arm8a.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(arm8b, arm8b.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*297.8-130))*-2), arm8b.rotateAngleY + (float) Math.toRadians(0), arm8b.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(arm8c, arm8c.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*297.8-180))*3), arm8c.rotateAngleY + (float) Math.toRadians(0), arm8c.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(arm9a, arm9a.rotateAngleX + (float) Math.toRadians(-5.5+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*297.8-100))*-1), arm9a.rotateAngleY + (float) Math.toRadians(0), arm9a.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(arm9b, arm9b.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*297.8-150))*-2), arm9b.rotateAngleY + (float) Math.toRadians(0), arm9b.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(arm9c, arm9c.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*297.8-250))*-3), arm9c.rotateAngleY + (float) Math.toRadians(0), arm9c.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(arm10a, arm10a.rotateAngleX + (float) Math.toRadians(-4.25+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*297.8-120))*-1), arm10a.rotateAngleY + (float) Math.toRadians(0), arm10a.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(arm10b, arm10b.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*297.8-170))*-2), arm10b.rotateAngleY + (float) Math.toRadians(0), arm10b.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(arm10c, arm10c.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*297.8-300))*-3), arm10c.rotateAngleY + (float) Math.toRadians(0), arm10c.rotateAngleZ + (float) Math.toRadians(0));
       
    }
    public void animFast(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime) {
        EntityPrehistoricFloraEromangateuthis entity = (EntityPrehistoricFloraEromangateuthis) entitylivingbaseIn;
        int animCycle = 40;
        double tickAnim = (entity.ticksExisted + entity.getTickOffset()) - (int) (Math.floor((double) (entity.ticksExisted + entity.getTickOffset()) / (double) animCycle) * (double) animCycle) + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;
        this.setRotateAngle(base, base.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*359-150))*3), base.rotateAngleY + (float) Math.toRadians(0), base.rotateAngleZ + (float) Math.toRadians(0-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180-50))*2));
        this.base.rotationPointX = this.base.rotationPointX + (float)(-0-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180-100))*0.3);
        this.base.rotationPointY = this.base.rotationPointY - (float)(0);
        this.base.rotationPointZ = this.base.rotationPointZ + (float)(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*359-100))*2);
        this.base.setScale((float)(1+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360-100))*0.01),(float)(1+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360-100))*0.01),(float)1);


        this.setRotateAngle(FinL, FinL.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360-180))*30), FinL.rotateAngleY + (float) Math.toRadians(0), FinL.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360-100))*-30));


        this.setRotateAngle(FinL2, FinL2.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360-180))*30), FinL2.rotateAngleY + (float) Math.toRadians(0), FinL2.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360-100))*30));


        this.setRotateAngle(body2, body2.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360-120))*-2), body2.rotateAngleY + (float) Math.toRadians(0), body2.rotateAngleZ + (float) Math.toRadians(0));


        this.siphon.setScale((float)1,(float)1,(float)(1+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360-80))*0.2));


        this.setRotateAngle(arm1a, arm1a.rotateAngleX + (float) Math.toRadians(-4.25+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360-120))*-1), arm1a.rotateAngleY + (float) Math.toRadians(0), arm1a.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(arm1b, arm1b.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360-170))*-2), arm1b.rotateAngleY + (float) Math.toRadians(0), arm1b.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(arm1c, arm1c.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360-300))*-3), arm1c.rotateAngleY + (float) Math.toRadians(0), arm1c.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(arm2a, arm2a.rotateAngleX + (float) Math.toRadians(-5.5+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360-100))*-1), arm2a.rotateAngleY + (float) Math.toRadians(0), arm2a.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(arm2b, arm2b.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360-150))*2), arm2b.rotateAngleY + (float) Math.toRadians(0), arm2b.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(arm2c, arm2c.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360-250))*-3), arm2c.rotateAngleY + (float) Math.toRadians(0), arm2c.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(arm3a, arm3a.rotateAngleX + (float) Math.toRadians(-4.75+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360-80))*-1), arm3a.rotateAngleY + (float) Math.toRadians(0), arm3a.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(arm3b, arm3b.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360-130))*2), arm3b.rotateAngleY + (float) Math.toRadians(0), arm3b.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(arm3c, arm3c.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360-180))*-3), arm3c.rotateAngleY + (float) Math.toRadians(0), arm3c.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(arm4a, arm4a.rotateAngleX + (float) Math.toRadians(-5.5+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360-100))*-1), arm4a.rotateAngleY + (float) Math.toRadians(0), arm4a.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(arm4b, arm4b.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360-150))*-2), arm4b.rotateAngleY + (float) Math.toRadians(0), arm4b.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(arm4c, arm4c.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360-250))*-3), arm4c.rotateAngleY + (float) Math.toRadians(0), arm4c.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(arm5a, arm5a.rotateAngleX + (float) Math.toRadians(-4.25+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360-125))*-1), arm5a.rotateAngleY + (float) Math.toRadians(0), arm5a.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(arm5b, arm5b.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360-175))*-2), arm5b.rotateAngleY + (float) Math.toRadians(0), arm5b.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(arm5c, arm5c.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360-305))*-3), arm5c.rotateAngleY + (float) Math.toRadians(0), arm5c.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(arm6a, arm6a.rotateAngleX + (float) Math.toRadians(-4.25+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360-120))*-1), arm6a.rotateAngleY + (float) Math.toRadians(0), arm6a.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(arm6b, arm6b.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360-170))*-2), arm6b.rotateAngleY + (float) Math.toRadians(0), arm6b.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(arm6c, arm6c.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360-300))*-3), arm6c.rotateAngleY + (float) Math.toRadians(0), arm6c.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(arm7a, arm7a.rotateAngleX + (float) Math.toRadians(-5.5+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*297.8-100))*-1), arm7a.rotateAngleY + (float) Math.toRadians(0), arm7a.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(arm7b, arm7b.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*297.8-150))*2), arm7b.rotateAngleY + (float) Math.toRadians(0), arm7b.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(arm7c, arm7c.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*297.8-250))*-3), arm7c.rotateAngleY + (float) Math.toRadians(0), arm7c.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(arm8a, arm8a.rotateAngleX + (float) Math.toRadians(-4.75+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360-80))*1), arm8a.rotateAngleY + (float) Math.toRadians(0), arm8a.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(arm8b, arm8b.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360-130))*-2), arm8b.rotateAngleY + (float) Math.toRadians(0), arm8b.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(arm8c, arm8c.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360-180))*3), arm8c.rotateAngleY + (float) Math.toRadians(0), arm8c.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(arm9a, arm9a.rotateAngleX + (float) Math.toRadians(-5.5+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360-100))*-1), arm9a.rotateAngleY + (float) Math.toRadians(0), arm9a.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(arm9b, arm9b.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360-150))*-2), arm9b.rotateAngleY + (float) Math.toRadians(0), arm9b.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(arm9c, arm9c.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360-250))*-3), arm9c.rotateAngleY + (float) Math.toRadians(0), arm9c.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(arm10a, arm10a.rotateAngleX + (float) Math.toRadians(-4.25+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360-120))*-1), arm10a.rotateAngleY + (float) Math.toRadians(0), arm10a.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(arm10b, arm10b.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360-170))*-2), arm10b.rotateAngleY + (float) Math.toRadians(0), arm10b.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(arm10c, arm10c.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360-300))*-3), arm10c.rotateAngleY + (float) Math.toRadians(0), arm10c.rotateAngleZ + (float) Math.toRadians(0));

    }
    public void animFront(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime) {
        EntityPrehistoricFloraEromangateuthis entity = (EntityPrehistoricFloraEromangateuthis) entitylivingbaseIn;
        int animCycle = 40;
        double tickAnim = (entity.ticksExisted + entity.getTickOffset()) - (int) (Math.floor((double) (entity.ticksExisted + entity.getTickOffset()) / (double) animCycle) * (double) animCycle) + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;
        this.setRotateAngle(base, base.rotateAngleX + (float) Math.toRadians(176.9988+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*359-150))*-3), base.rotateAngleY + (float) Math.toRadians(2.49915), base.rotateAngleZ + (float) Math.toRadians(-180.0657-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180-50))*-2));
        this.base.rotationPointX = this.base.rotationPointX + (float)(-0-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180-100))*0.3);
        this.base.rotationPointY = this.base.rotationPointY - (float)(0);
        this.base.rotationPointZ = this.base.rotationPointZ + (float)(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*359-100))*2);
        this.base.setScale((float)(1+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360-100))*0.01),(float)(1+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360-100))*0.01),(float)1);


        this.setRotateAngle(FinL, FinL.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360-180))*-30), FinL.rotateAngleY + (float) Math.toRadians(0), FinL.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360-100))*30));


        this.setRotateAngle(FinL2, FinL2.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360-180))*-30), FinL2.rotateAngleY + (float) Math.toRadians(0), FinL2.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360-100))*-30));


        this.setRotateAngle(body2, body2.rotateAngleX + (float) Math.toRadians(5+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360-120))*2), body2.rotateAngleY + (float) Math.toRadians(0), body2.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(siphon, siphon.rotateAngleX + (float) Math.toRadians(-146.2976), siphon.rotateAngleY + (float) Math.toRadians(0.92821), siphon.rotateAngleZ + (float) Math.toRadians(-0.01724));
        this.siphon.rotationPointX = this.siphon.rotationPointX + (float)(0);
        this.siphon.rotationPointY = this.siphon.rotationPointY - (float)(0.45);
        this.siphon.rotationPointZ = this.siphon.rotationPointZ + (float)(0);
        this.siphon.setScale((float)1,(float)1,(float)(1+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360-80))*-0.15));

        this.setRotateAngle(arm1a, arm1a.rotateAngleX + (float) Math.toRadians(-4.25+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360-120))*-1), arm1a.rotateAngleY + (float) Math.toRadians(0), arm1a.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(arm1b, arm1b.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360-170))*-2), arm1b.rotateAngleY + (float) Math.toRadians(0), arm1b.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(arm1c, arm1c.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360-300))*-3), arm1c.rotateAngleY + (float) Math.toRadians(0), arm1c.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(arm2a, arm2a.rotateAngleX + (float) Math.toRadians(-5.5+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360-100))*-1), arm2a.rotateAngleY + (float) Math.toRadians(0), arm2a.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(arm2b, arm2b.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360-150))*2), arm2b.rotateAngleY + (float) Math.toRadians(0), arm2b.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(arm2c, arm2c.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360-250))*-3), arm2c.rotateAngleY + (float) Math.toRadians(0), arm2c.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(arm3a, arm3a.rotateAngleX + (float) Math.toRadians(-4.75+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360-80))*-1), arm3a.rotateAngleY + (float) Math.toRadians(0), arm3a.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(arm3b, arm3b.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360-130))*2), arm3b.rotateAngleY + (float) Math.toRadians(0), arm3b.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(arm3c, arm3c.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360-180))*-3), arm3c.rotateAngleY + (float) Math.toRadians(0), arm3c.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(arm4a, arm4a.rotateAngleX + (float) Math.toRadians(-5.5+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360-100))*-1), arm4a.rotateAngleY + (float) Math.toRadians(0), arm4a.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(arm4b, arm4b.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360-150))*-2), arm4b.rotateAngleY + (float) Math.toRadians(0), arm4b.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(arm4c, arm4c.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360-250))*-3), arm4c.rotateAngleY + (float) Math.toRadians(0), arm4c.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(arm5a, arm5a.rotateAngleX + (float) Math.toRadians(-4.25+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360-125))*-1), arm5a.rotateAngleY + (float) Math.toRadians(0), arm5a.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(arm5b, arm5b.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360-175))*-2), arm5b.rotateAngleY + (float) Math.toRadians(0), arm5b.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(arm5c, arm5c.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360-305))*-3), arm5c.rotateAngleY + (float) Math.toRadians(0), arm5c.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(arm6a, arm6a.rotateAngleX + (float) Math.toRadians(-4.25+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360-120))*-1), arm6a.rotateAngleY + (float) Math.toRadians(0), arm6a.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(arm6b, arm6b.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360-170))*-2), arm6b.rotateAngleY + (float) Math.toRadians(0), arm6b.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(arm6c, arm6c.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360-300))*-3), arm6c.rotateAngleY + (float) Math.toRadians(0), arm6c.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(arm7a, arm7a.rotateAngleX + (float) Math.toRadians(-5.5+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*297.8-100))*-1), arm7a.rotateAngleY + (float) Math.toRadians(0), arm7a.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(arm7b, arm7b.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*297.8-150))*2), arm7b.rotateAngleY + (float) Math.toRadians(0), arm7b.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(arm7c, arm7c.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*297.8-250))*-3), arm7c.rotateAngleY + (float) Math.toRadians(0), arm7c.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(arm8a, arm8a.rotateAngleX + (float) Math.toRadians(-4.75+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360-80))*1), arm8a.rotateAngleY + (float) Math.toRadians(0), arm8a.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(arm8b, arm8b.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360-130))*-2), arm8b.rotateAngleY + (float) Math.toRadians(0), arm8b.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(arm8c, arm8c.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360-180))*3), arm8c.rotateAngleY + (float) Math.toRadians(0), arm8c.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(arm9a, arm9a.rotateAngleX + (float) Math.toRadians(-5.5+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360-100))*-1), arm9a.rotateAngleY + (float) Math.toRadians(0), arm9a.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(arm9b, arm9b.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360-150))*-2), arm9b.rotateAngleY + (float) Math.toRadians(0), arm9b.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(arm9c, arm9c.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360-250))*-3), arm9c.rotateAngleY + (float) Math.toRadians(0), arm9c.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(arm10a, arm10a.rotateAngleX + (float) Math.toRadians(-4.25+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360-120))*-1), arm10a.rotateAngleY + (float) Math.toRadians(0), arm10a.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(arm10b, arm10b.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360-170))*-2), arm10b.rotateAngleY + (float) Math.toRadians(0), arm10b.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(arm10c, arm10c.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360-300))*-3), arm10c.rotateAngleY + (float) Math.toRadians(0), arm10c.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(body, body.rotateAngleX + (float) Math.toRadians(-1.25), body.rotateAngleY + (float) Math.toRadians(0), body.rotateAngleZ + (float) Math.toRadians(0));


    }


    public void animate(IAnimatedEntity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        EntityPrehistoricFloraEromangateuthis e = (EntityPrehistoricFloraEromangateuthis) entity;
        animator.update(entity);

    }
}
