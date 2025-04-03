package net.lepidodendron.entity.model.entity;

import net.ilexiconn.llibrary.client.model.tools.AdvancedModelRenderer;
import net.lepidodendron.entity.model.ModelBasePalaeopedia;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

public class ModelFurcaster extends ModelBasePalaeopedia {
    public AdvancedModelRenderer core;
    public AdvancedModelRenderer arm1base;
    public AdvancedModelRenderer arm2base;
    public AdvancedModelRenderer arm5base;
    public AdvancedModelRenderer arm3base;
    public AdvancedModelRenderer arm4base;
    public AdvancedModelRenderer arm1a;
    public AdvancedModelRenderer arm1b;
    public AdvancedModelRenderer arm1c;
    public AdvancedModelRenderer arm1d;
    public AdvancedModelRenderer arm1e;
    public AdvancedModelRenderer arm2a;
    public AdvancedModelRenderer arm2b;
    public AdvancedModelRenderer arm2c;
    public AdvancedModelRenderer arm2d;
    public AdvancedModelRenderer arm2e;
    public AdvancedModelRenderer arm5a;
    public AdvancedModelRenderer arm5b;
    public AdvancedModelRenderer arm5c;
    public AdvancedModelRenderer arm5d;
    public AdvancedModelRenderer arm5e;
    public AdvancedModelRenderer arm3a;
    public AdvancedModelRenderer arm3b;
    public AdvancedModelRenderer arm3c;
    public AdvancedModelRenderer arm3d;
    public AdvancedModelRenderer arm3e;
    public AdvancedModelRenderer arm4a;
    public AdvancedModelRenderer arm4b;
    public AdvancedModelRenderer arm4c;
    public AdvancedModelRenderer arm4d;
    public AdvancedModelRenderer arm4e;

    public ModelFurcaster() {
        this.textureWidth = 128;
        this.textureHeight = 128;
        this.arm4e = new AdvancedModelRenderer(this, 30, 26);
        this.arm4e.setRotationPoint(0.0F, 0.0F, -12.0F);
        this.arm4e.addBox(-0.5F, -0.5F, -12.0F, 1, 1, 12, 0.0F);
        this.arm3base = new AdvancedModelRenderer(this, 0, 25);
        this.arm3base.setRotationPoint(-1.0F, -0.5F, 1.2F);
        this.arm3base.addBox(-2.0F, -0.5F, -3.0F, 4, 1, 3, 0.0F);
        this.setRotateAngle(arm3base, 0.0F, 2.443460952792061F, 0.0F);
        this.arm4c = new AdvancedModelRenderer(this, 34, 0);
        this.arm4c.setRotationPoint(0.0F, 0.0F, -10.0F);
        this.arm4c.addBox(-1.0F, -0.5F, -9.0F, 2, 1, 9, 0.0F);
        this.arm5base = new AdvancedModelRenderer(this, 0, 25);
        this.arm5base.setRotationPoint(1.4F, -0.5F, -0.5F);
        this.arm5base.addBox(-2.0F, -0.5F, -3.0F, 4, 1, 3, 0.0F);
        this.setRotateAngle(arm5base, 0.0F, -1.117010721276371F, 0.0F);
        this.arm1b = new AdvancedModelRenderer(this, 0, 49);
        this.arm1b.setRotationPoint(0.0F, 0.0F, -11.0F);
        this.arm1b.addBox(-1.0F, -0.5F, -10.0F, 2, 1, 10, 0.0F);
        this.arm2b = new AdvancedModelRenderer(this, 0, 49);
        this.arm2b.setRotationPoint(0.0F, 0.0F, -11.0F);
        this.arm2b.addBox(-1.0F, -0.5F, -10.0F, 2, 1, 10, 0.0F);
        this.core = new AdvancedModelRenderer(this, 0, 13);
        this.core.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.core.addBox(-2.5F, -2.0F, -2.5F, 5, 2, 5, 0.0F);
        this.arm4b = new AdvancedModelRenderer(this, 0, 49);
        this.arm4b.setRotationPoint(0.0F, 0.0F, -11.0F);
        this.arm4b.addBox(-1.0F, -0.5F, -10.0F, 2, 1, 10, 0.0F);
        this.arm2d = new AdvancedModelRenderer(this, 16, 25);
        this.arm2d.setRotationPoint(0.0F, 0.0F, -9.0F);
        this.arm2d.addBox(-0.5F, -0.5F, -12.0F, 1, 1, 12, 0.0F);
        this.arm3c = new AdvancedModelRenderer(this, 34, 0);
        this.arm3c.setRotationPoint(0.0F, 0.0F, -10.0F);
        this.arm3c.addBox(-1.0F, -0.5F, -9.0F, 2, 1, 9, 0.0F);
        this.arm5c = new AdvancedModelRenderer(this, 34, 0);
        this.arm5c.setRotationPoint(0.0F, 0.0F, -10.0F);
        this.arm5c.addBox(-1.0F, -0.5F, -9.0F, 2, 1, 9, 0.0F);
        this.arm3d = new AdvancedModelRenderer(this, 16, 25);
        this.arm3d.setRotationPoint(0.0F, 0.0F, -9.0F);
        this.arm3d.addBox(-0.5F, -0.5F, -12.0F, 1, 1, 12, 0.0F);
        this.arm4base = new AdvancedModelRenderer(this, 0, 25);
        this.arm4base.setRotationPoint(1.0F, -0.5F, 1.2F);
        this.arm4base.addBox(-2.0F, -0.5F, -3.0F, 4, 1, 3, 0.0F);
        this.setRotateAngle(arm4base, 0.0F, -2.443460952792061F, 0.0F);
        this.arm3a = new AdvancedModelRenderer(this, 0, 0);
        this.arm3a.setRotationPoint(0.0F, 0.0F, -3.0F);
        this.arm3a.addBox(-1.5F, -0.5F, -11.0F, 3, 1, 11, 0.0F);
        this.arm1base = new AdvancedModelRenderer(this, 0, 25);
        this.arm1base.setRotationPoint(0.0F, -0.5F, -1.5F);
        this.arm1base.addBox(-2.0F, -0.5F, -3.0F, 4, 1, 3, 0.0F);
        this.arm1d = new AdvancedModelRenderer(this, 16, 25);
        this.arm1d.setRotationPoint(0.0F, 0.0F, -9.0F);
        this.arm1d.addBox(-0.5F, -0.5F, -12.0F, 1, 1, 12, 0.0F);
        this.arm5e = new AdvancedModelRenderer(this, 30, 26);
        this.arm5e.setRotationPoint(0.0F, 0.0F, -12.0F);
        this.arm5e.addBox(-0.5F, -0.5F, -12.0F, 1, 1, 12, 0.0F);
        this.arm1a = new AdvancedModelRenderer(this, 0, 0);
        this.arm1a.setRotationPoint(0.0F, 0.0F, -3.0F);
        this.arm1a.addBox(-1.5F, -0.5F, -11.0F, 3, 1, 11, 0.0F);
        this.arm5b = new AdvancedModelRenderer(this, 0, 49);
        this.arm5b.setRotationPoint(0.0F, 0.0F, -11.0F);
        this.arm5b.addBox(-1.0F, -0.5F, -10.0F, 2, 1, 10, 0.0F);
        this.arm5d = new AdvancedModelRenderer(this, 16, 25);
        this.arm5d.setRotationPoint(0.0F, 0.0F, -9.0F);
        this.arm5d.addBox(-0.5F, -0.5F, -12.0F, 1, 1, 12, 0.0F);
        this.arm2base = new AdvancedModelRenderer(this, 0, 25);
        this.arm2base.setRotationPoint(-1.4F, -0.5F, -0.5F);
        this.arm2base.addBox(-2.0F, -0.5F, -3.0F, 4, 1, 3, 0.0F);
        this.setRotateAngle(arm2base, 0.0F, 1.117010721276371F, 0.0F);
        this.arm1e = new AdvancedModelRenderer(this, 30, 26);
        this.arm1e.setRotationPoint(0.0F, 0.0F, -12.0F);
        this.arm1e.addBox(-0.5F, -0.5F, -12.0F, 1, 1, 12, 0.0F);
        this.arm2c = new AdvancedModelRenderer(this, 34, 0);
        this.arm2c.setRotationPoint(0.0F, 0.0F, -10.0F);
        this.arm2c.addBox(-1.0F, -0.5F, -9.0F, 2, 1, 9, 0.0F);
        this.arm2e = new AdvancedModelRenderer(this, 30, 26);
        this.arm2e.setRotationPoint(0.0F, 0.0F, -12.0F);
        this.arm2e.addBox(-0.5F, -0.5F, -12.0F, 1, 1, 12, 0.0F);
        this.arm5a = new AdvancedModelRenderer(this, 0, 0);
        this.arm5a.setRotationPoint(0.0F, 0.0F, -3.0F);
        this.arm5a.addBox(-1.5F, -0.5F, -11.0F, 3, 1, 11, 0.0F);
        this.arm4a = new AdvancedModelRenderer(this, 0, 0);
        this.arm4a.setRotationPoint(0.0F, 0.0F, -3.0F);
        this.arm4a.addBox(-1.5F, -0.5F, -11.0F, 3, 1, 11, 0.0F);
        this.arm3e = new AdvancedModelRenderer(this, 30, 26);
        this.arm3e.setRotationPoint(0.0F, 0.0F, -12.0F);
        this.arm3e.addBox(-0.5F, -0.5F, -12.0F, 1, 1, 12, 0.0F);
        this.arm3b = new AdvancedModelRenderer(this, 0, 49);
        this.arm3b.setRotationPoint(0.0F, 0.0F, -11.0F);
        this.arm3b.addBox(-1.0F, -0.5F, -10.0F, 2, 1, 10, 0.0F);
        this.arm4d = new AdvancedModelRenderer(this, 16, 25);
        this.arm4d.setRotationPoint(0.0F, 0.0F, -9.0F);
        this.arm4d.addBox(-0.5F, -0.5F, -12.0F, 1, 1, 12, 0.0F);
        this.arm1c = new AdvancedModelRenderer(this, 34, 0);
        this.arm1c.setRotationPoint(0.0F, 0.0F, -10.0F);
        this.arm1c.addBox(-1.0F, -0.5F, -9.0F, 2, 1, 9, 0.0F);
        this.arm2a = new AdvancedModelRenderer(this, 0, 0);
        this.arm2a.setRotationPoint(0.0F, 0.0F, -3.0F);
        this.arm2a.addBox(-1.5F, -0.5F, -11.0F, 3, 1, 11, 0.0F);
        this.arm4d.addChild(this.arm4e);
        this.core.addChild(this.arm3base);
        this.arm4b.addChild(this.arm4c);
        this.core.addChild(this.arm5base);
        this.arm1a.addChild(this.arm1b);
        this.arm2a.addChild(this.arm2b);
        this.arm4a.addChild(this.arm4b);
        this.arm2c.addChild(this.arm2d);
        this.arm3b.addChild(this.arm3c);
        this.arm5b.addChild(this.arm5c);
        this.arm3c.addChild(this.arm3d);
        this.core.addChild(this.arm4base);
        this.arm3base.addChild(this.arm3a);
        this.core.addChild(this.arm1base);
        this.arm1c.addChild(this.arm1d);
        this.arm5d.addChild(this.arm5e);
        this.arm1base.addChild(this.arm1a);
        this.arm5a.addChild(this.arm5b);
        this.arm5c.addChild(this.arm5d);
        this.core.addChild(this.arm2base);
        this.arm1d.addChild(this.arm1e);
        this.arm2b.addChild(this.arm2c);
        this.arm2d.addChild(this.arm2e);
        this.arm5base.addChild(this.arm5a);
        this.arm4base.addChild(this.arm4a);
        this.arm3d.addChild(this.arm3e);
        this.arm3a.addChild(this.arm3b);
        this.arm4c.addChild(this.arm4d);
        this.arm1b.addChild(this.arm1c);
        this.arm2base.addChild(this.arm2a);

        updateDefaultPose();
    }

    @Override
    public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        this.core.render(f5);
    }

    @Override
    public void renderStaticBook(float f) {
        //Rotations, positions and sizing:
        this.core.offsetY = -3.8F;
        this.core.offsetX = 0.2F;
        this.core.offsetZ = 2.0F;
        this.core.rotateAngleY = (float)Math.toRadians(120);
        this.core.rotateAngleX = (float)Math.toRadians(1);
        this.core.rotateAngleZ = (float)Math.toRadians(0);
        this.core.scaleChildren = true;
        float scaler = 2.2F;
        this.core.setScale(scaler, scaler, scaler);
        //Start of pose:
        this.setRotateAngle(core, 0.6F, 3.8F, -0.2F);
        this.setRotateAngle(arm1a, 0.0F, 0.2F, -0.0F);
        this.setRotateAngle(arm1b, 0.0F, 0.2F, -0.0F);
        this.setRotateAngle(arm1c, 0.0F, 0.0F, -0.0F);
        this.setRotateAngle(arm1d, 0.0F, -0.2F, -0.0F);
        this.setRotateAngle(arm1e, 0.0F, -0.2F, -0.0F);
        this.setRotateAngle(arm2a, 0.0F, 0.2F, -0.0F);
        this.setRotateAngle(arm2b, 0.0F, 0.2F, -0.0F);
        this.setRotateAngle(arm2c, 0.0F, 0.0F, -0.0F);
        this.setRotateAngle(arm2d, 0.0F, -0.2F, -0.0F);
        this.setRotateAngle(arm2e, 0.0F, -0.2F, -0.0F);
        this.setRotateAngle(arm3a, 0.0F, 0.2F, -0.0F);
        this.setRotateAngle(arm3b, 0.0F, 0.2F, -0.0F);
        this.setRotateAngle(arm3c, 0.0F, 0.0F, -0.0F);
        this.setRotateAngle(arm3d, 0.0F, -0.2F, -0.0F);
        this.setRotateAngle(arm3e, 0.0F, -0.2F, -0.0F);
        this.setRotateAngle(arm4a, 0.0F, 0.2F, -0.0F);
        this.setRotateAngle(arm4b, 0.0F, 0.2F, -0.0F);
        this.setRotateAngle(arm4c, 0.0F, 0.0F, -0.0F);
        this.setRotateAngle(arm4d, 0.0F, -0.2F, -0.0F);
        this.setRotateAngle(arm4e, 0.0F, -0.2F, -0.0F);
        this.setRotateAngle(arm5a, 0.0F, 0.2F, -0.0F);
        this.setRotateAngle(arm5b, 0.0F, 0.2F, -0.0F);
        this.setRotateAngle(arm5c, 0.0F, 0.0F, -0.0F);
        this.setRotateAngle(arm5d, 0.0F, -0.2F, -0.0F);
        this.setRotateAngle(arm5e, 0.0F, -0.2F, -0.0F);
        //End of pose, now render the model:
        this.core.render(f);
        //Reset rotations, positions and sizing:
        this.core.setScale(1.0F, 1.0F, 1.0F);
        this.core.scaleChildren = false;
        resetToDefaultPose();

    }

    public void setRotateAngle(ModelRenderer modelRenderer, float x, float y, float z) {
        modelRenderer.rotateAngleX = x;
        modelRenderer.rotateAngleY = y;
        modelRenderer.rotateAngleZ = z;
    }

    @Override
    public void setRotationAngles(float f, float f1, float f2, float f3, float f4, float f5, Entity e) {
        super.setRotationAngles(f, f1, f2, f3, f4, f5, e);
        this.resetToDefaultPose();

        //this.core.offsetY = 1.5F;
        AdvancedModelRenderer[] Arm1 = {this.arm1a, this.arm1b, this.arm1c, this.arm1d, this.arm1e};
        AdvancedModelRenderer[] Arm2 = {this.arm2a, this.arm2b, this.arm2c, this.arm2d, this.arm2e};
        AdvancedModelRenderer[] Arm3 = {this.arm3a, this.arm3b, this.arm3c, this.arm3d, this.arm3e};
        AdvancedModelRenderer[] Arm4 = {this.arm4a, this.arm4b, this.arm4c, this.arm4d, this.arm4e};
        AdvancedModelRenderer[] Arm5 = {this.arm5a, this.arm5b, this.arm5c, this.arm5d, this.arm5e};

        float speed = 0.2F;
        this.chainSwing(Arm1, speed, 0.4F, -4, f2, 0.7F);
        this.chainSwing(Arm2, speed, 0.4F, -4, f2, 0.7F);
        this.chainSwing(Arm3, speed, 0.4F, -4, f2, 0.7F);
        this.chainSwing(Arm4, speed, 0.4F, -4, f2, 0.7F);
        this.chainSwing(Arm5, speed, 0.4F, -4, f2, 0.7F);

    }
}
