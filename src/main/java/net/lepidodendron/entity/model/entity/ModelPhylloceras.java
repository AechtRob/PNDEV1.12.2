package net.lepidodendron.entity.model.entity;

import net.lepidodendron.entity.model.ModelBasePalaeopedia;
import net.lepidodendron.entity.model.llibraryextensions.AdvancedModelRendererExtended;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

public class ModelPhylloceras extends ModelBasePalaeopedia {
    private final AdvancedModelRendererExtended root;
    private final AdvancedModelRendererExtended Shell1;
    private final AdvancedModelRendererExtended Shell2;
    private final AdvancedModelRendererExtended Shell3;
    private final AdvancedModelRendererExtended Shell4;
    private final AdvancedModelRendererExtended Shell5;
    private final AdvancedModelRendererExtended Shell6;
    private final AdvancedModelRendererExtended Shell7;
    private final AdvancedModelRendererExtended Shell8;
    private final AdvancedModelRendererExtended Shell9;
    private final AdvancedModelRendererExtended Mantle;
    private final AdvancedModelRendererExtended Siphon;
    private final AdvancedModelRendererExtended arm1a;
    private final AdvancedModelRendererExtended arm1b;
    private final AdvancedModelRendererExtended arm6a;
    private final AdvancedModelRendererExtended arm6b;
    private final AdvancedModelRendererExtended arm2a;
    private final AdvancedModelRendererExtended arm2b;
    private final AdvancedModelRendererExtended arm7a;
    private final AdvancedModelRendererExtended arm7b;
    private final AdvancedModelRendererExtended arm3a;
    private final AdvancedModelRendererExtended arm3b;
    private final AdvancedModelRendererExtended arm8a;
    private final AdvancedModelRendererExtended arm8b;
    private final AdvancedModelRendererExtended arm4a;
    private final AdvancedModelRendererExtended arm4b;
    private final AdvancedModelRendererExtended arm9a;
    private final AdvancedModelRendererExtended arm9b;
    private final AdvancedModelRendererExtended arm5a;
    private final AdvancedModelRendererExtended arm5b;
    private final AdvancedModelRendererExtended arm10a;
    private final AdvancedModelRendererExtended arm10b;
    private final AdvancedModelRendererExtended Shellbase;

    public ModelPhylloceras() {
        this.textureWidth = 64;
        this.textureHeight = 64;

        this.root = new AdvancedModelRendererExtended(this);
        this.root.setRotationPoint(0.0F, 19.0F, 0.0F);


        this.Shell1 = new AdvancedModelRendererExtended(this);
        this.Shell1.setRotationPoint(0.0F, 2.5F, 0.5F);
        this.root.addChild(Shell1);
        this.setRotateAngle(Shell1, 1.2984F, 0.0F, 0.0F);
        this.Shell1.cubeList.add(new ModelBox(Shell1, 0, 31, -2.5F, -3.175F, 3.0F, 5, 8, 3, 0.01F, false));

        this.Shell2 = new AdvancedModelRendererExtended(this);
        this.Shell2.setRotationPoint(-0.01F, 4.85F, 3.0F);
        this.Shell1.addChild(Shell2);
        this.setRotateAngle(Shell2, -0.6109F, 0.0F, 0.0F);
        this.Shell2.cubeList.add(new ModelBox(Shell2, 0, 13, -2.49F, -8.0F, -5.0F, 5, 8, 5, 0.0F, false));

        this.Shell3 = new AdvancedModelRendererExtended(this);
        this.Shell3.setRotationPoint(0.0F, 0.0F, -5.0F);
        this.Shell2.addChild(Shell3);
        this.setRotateAngle(Shell3, -0.6981F, 0.0F, 0.0F);
        this.Shell3.cubeList.add(new ModelBox(Shell3, 0, 0, -1.99F, -7.0F, -6.0F, 4, 7, 6, -0.01F, false));

        this.Shell4 = new AdvancedModelRendererExtended(this);
        this.Shell4.setRotationPoint(0.0F, 0.0F, -6.0F);
        this.Shell3.addChild(Shell4);
        this.setRotateAngle(Shell4, -0.6545F, 0.0F, 0.0F);
        this.Shell4.cubeList.add(new ModelBox(Shell4, 20, 12, -1.99F, -7.0F, -5.0F, 4, 7, 5, 0.01F, false));

        this.Shell5 = new AdvancedModelRendererExtended(this);
        this.Shell5.setRotationPoint(0.0F, 0.0F, -5.0F);
        this.Shell4.addChild(Shell5);
        this.setRotateAngle(Shell5, -0.8727F, 0.0F, 0.0F);
        this.Shell5.cubeList.add(new ModelBox(Shell5, 20, 0, -1.49F, -6.0F, -6.0F, 3, 6, 6, 0.0F, false));

        this.Shell6 = new AdvancedModelRendererExtended(this);
        this.Shell6.setRotationPoint(0.0F, 0.0F, -6.0F);
        this.Shell5.addChild(Shell6);
        this.setRotateAngle(Shell6, -0.7854F, 0.0F, 0.0F);
        this.Shell6.cubeList.add(new ModelBox(Shell6, 29, 30, -1.49F, -6.0F, -4.0F, 3, 6, 4, -0.01F, false));

        this.Shell7 = new AdvancedModelRendererExtended(this);
        this.Shell7.setRotationPoint(0.0F, 0.0F, -4.0F);
        this.Shell6.addChild(Shell7);
        this.setRotateAngle(Shell7, -0.8727F, 0.0F, 0.0F);
        this.Shell7.cubeList.add(new ModelBox(Shell7, 33, 7, -0.99F, -4.0F, -5.0F, 2, 4, 5, 0.01F, false));

        this.Shell8 = new AdvancedModelRendererExtended(this);
        this.Shell8.setRotationPoint(0.0F, 0.0F, -5.0F);
        this.Shell7.addChild(Shell8);
        this.setRotateAngle(Shell8, -1.0036F, 0.0F, 0.0F);
        this.Shell8.cubeList.add(new ModelBox(Shell8, 42, 41, -0.99F, -4.0F, -3.0F, 2, 4, 3, 0.0F, false));

        this.Shell9 = new AdvancedModelRendererExtended(this);
        this.Shell9.setRotationPoint(0.0F, 0.0F, -3.0F);
        this.Shell8.addChild(Shell9);
        this.setRotateAngle(Shell9, -0.5236F, 0.0F, 0.0F);
        this.Shell9.cubeList.add(new ModelBox(Shell9, 42, 16, -0.99F, -4.0F, -3.0F, 2, 4, 3, -0.01F, false));

        this.Mantle = new AdvancedModelRendererExtended(this);
        this.Mantle.setRotationPoint(0.0F, -1.65F, 6.05F);
        this.Shell1.addChild(Mantle);
        this.setRotateAngle(Mantle, -0.691F, 0.0F, 0.0F);
        this.Mantle.cubeList.add(new ModelBox(Mantle, 15, 24, -2.0F, 0.0F, -1.0F, 4, 5, 5, 0.0F, false));
        this.Mantle.cubeList.add(new ModelBox(Mantle, 0, 0, -1.5F, -1.0F, 2.0F, 1, 1, 2, 0.0F, false));
        this.Mantle.cubeList.add(new ModelBox(Mantle, 0, 0, 0.5F, -1.0F, 2.0F, 1, 1, 2, 0.0F, true));

        this.Siphon = new AdvancedModelRendererExtended(this);
        this.Siphon.setRotationPoint(0.0F, 2.9F, 0.0F);
        this.Mantle.addChild(Siphon);
        this.setRotateAngle(Siphon, -0.2122F, 0.0F, 0.0F);
        this.Siphon.cubeList.add(new ModelBox(Siphon, 33, 19, -1.0F, 0.0F, 0.0F, 2, 2, 5, 0.0F, false));

        this.arm1a = new AdvancedModelRendererExtended(this);
        this.arm1a.setRotationPoint(-0.65F, 0.5F, 3.5F);
        this.Mantle.addChild(arm1a);
        this.setRotateAngle(arm1a, -0.2913F, -0.1321F, 0.0F);
        this.arm1a.cubeList.add(new ModelBox(arm1a, 30, 41, -0.5F, -0.5F, 0.0F, 1, 1, 5, 0.0F, false));

        this.arm1b = new AdvancedModelRendererExtended(this);
        this.arm1b.setRotationPoint(0.0F, 0.0F, 4.5F);
        this.arm1a.addChild(arm1b);
        this.setRotateAngle(arm1b, -0.2335F, 0.1061F, 0.0F);
        this.arm1b.cubeList.add(new ModelBox(arm1b, 0, 42, -0.5F, -0.5F, 0.0F, 1, 1, 5, 0.0F, false));

        this.arm6a = new AdvancedModelRendererExtended(this);
        this.arm6a.setRotationPoint(0.65F, 0.5F, 3.5F);
        this.Mantle.addChild(arm6a);
        this.setRotateAngle(arm6a, -0.2913F, 0.1321F, 0.0F);
        this.arm6a.cubeList.add(new ModelBox(arm6a, 30, 41, -0.5F, -0.5F, 0.0F, 1, 1, 5, 0.0F, true));

        this.arm6b = new AdvancedModelRendererExtended(this);
        this.arm6b.setRotationPoint(0.0F, 0.0F, 4.5F);
        this.arm6a.addChild(arm6b);
        this.setRotateAngle(arm6b, -0.2335F, -0.1061F, 0.0F);
        this.arm6b.cubeList.add(new ModelBox(arm6b, 0, 42, -0.5F, -0.5F, 0.0F, 1, 1, 5, 0.0F, true));

        this.arm2a = new AdvancedModelRendererExtended(this);
        this.arm2a.setRotationPoint(-1.15F, 1.25F, 3.5F);
        this.Mantle.addChild(arm2a);
        this.setRotateAngle(arm2a, -0.3786F, -0.1758F, 0.0F);
        this.arm2a.cubeList.add(new ModelBox(arm2a, 11, 40, -0.5F, -0.5F, 0.0F, 1, 1, 5, 0.0F, false));

        this.arm2b = new AdvancedModelRendererExtended(this);
        this.arm2b.setRotationPoint(0.0F, 0.0F, 4.5F);
        this.arm2a.addChild(arm2b);
        this.setRotateAngle(arm2b, -0.2335F, 0.1061F, 0.0F);
        this.arm2b.cubeList.add(new ModelBox(arm2b, 23, 40, -0.5F, -0.5F, 0.0F, 1, 1, 5, 0.0F, false));

        this.arm7a = new AdvancedModelRendererExtended(this);
        this.arm7a.setRotationPoint(1.15F, 1.25F, 3.5F);
        this.Mantle.addChild(arm7a);
        this.setRotateAngle(arm7a, -0.3786F, 0.1758F, 0.0F);
        this.arm7a.cubeList.add(new ModelBox(arm7a, 11, 40, -0.5F, -0.5F, 0.0F, 1, 1, 5, 0.0F, true));

        this.arm7b = new AdvancedModelRendererExtended(this);
        this.arm7b.setRotationPoint(0.0F, 0.0F, 4.5F);
        this.arm7a.addChild(arm7b);
        this.setRotateAngle(arm7b, -0.2335F, -0.1061F, 0.0F);
        this.arm7b.cubeList.add(new ModelBox(arm7b, 23, 40, -0.5F, -0.5F, 0.0F, 1, 1, 5, 0.0F, true));

        this.arm3a = new AdvancedModelRendererExtended(this);
        this.arm3a.setRotationPoint(-1.4F, 2.0F, 3.5F);
        this.Mantle.addChild(arm3a);
        this.setRotateAngle(arm3a, -0.4658F, -0.2194F, 0.0F);
        this.arm3a.cubeList.add(new ModelBox(arm3a, 39, 1, -0.5F, -0.5F, 0.0F, 1, 1, 5, 0.0F, false));

        this.arm3b = new AdvancedModelRendererExtended(this);
        this.arm3b.setRotationPoint(0.0F, 0.0F, 4.5F);
        this.arm3a.addChild(arm3b);
        this.setRotateAngle(arm3b, -0.2335F, 0.1061F, 0.0F);
        this.arm3b.cubeList.add(new ModelBox(arm3b, 39, 26, -0.5F, -0.5F, 0.0F, 1, 1, 5, 0.0F, false));

        this.arm8a = new AdvancedModelRendererExtended(this);
        this.arm8a.setRotationPoint(1.4F, 2.0F, 3.5F);
        this.Mantle.addChild(arm8a);
        this.setRotateAngle(arm8a, -0.4658F, 0.2194F, 0.0F);
        this.arm8a.cubeList.add(new ModelBox(arm8a, 39, 1, -0.5F, -0.5F, 0.0F, 1, 1, 5, 0.0F, true));

        this.arm8b = new AdvancedModelRendererExtended(this);
        this.arm8b.setRotationPoint(0.0F, 0.0F, 4.5F);
        this.arm8a.addChild(arm8b);
        this.setRotateAngle(arm8b, -0.2335F, -0.1061F, 0.0F);
        this.arm8b.cubeList.add(new ModelBox(arm8b, 39, 26, -0.5F, -0.5F, 0.0F, 1, 1, 5, 0.0F, true));

        this.arm4a = new AdvancedModelRendererExtended(this);
        this.arm4a.setRotationPoint(-1.15F, 2.5F, 3.0F);
        this.Mantle.addChild(arm4a);
        this.setRotateAngle(arm4a, -0.5531F, -0.2194F, 0.0F);
        this.arm4a.cubeList.add(new ModelBox(arm4a, 16, 34, -0.5F, -0.5F, 0.0F, 1, 1, 5, 0.0F, false));

        this.arm4b = new AdvancedModelRendererExtended(this);
        this.arm4b.setRotationPoint(0.0F, 0.0F, 4.5F);
        this.arm4a.addChild(arm4b);
        this.setRotateAngle(arm4b, -0.2335F, 0.1061F, 0.0F);
        this.arm4b.cubeList.add(new ModelBox(arm4b, 38, 35, -0.5F, -0.5F, 0.0F, 1, 1, 5, 0.0F, false));

        this.arm9a = new AdvancedModelRendererExtended(this);
        this.arm9a.setRotationPoint(1.15F, 2.5F, 3.0F);
        this.Mantle.addChild(arm9a);
        this.setRotateAngle(arm9a, -0.5531F, 0.2194F, 0.0F);
        this.arm9a.cubeList.add(new ModelBox(arm9a, 16, 34, -0.5F, -0.5F, 0.0F, 1, 1, 5, 0.0F, true));

        this.arm9b = new AdvancedModelRendererExtended(this);
        this.arm9b.setRotationPoint(0.0F, 0.0F, 4.5F);
        this.arm9a.addChild(arm9b);
        this.setRotateAngle(arm9b, -0.2335F, -0.1061F, 0.0F);
        this.arm9b.cubeList.add(new ModelBox(arm9b, 38, 35, -0.5F, -0.5F, 0.0F, 1, 1, 5, 0.0F, true));

        this.arm5a = new AdvancedModelRendererExtended(this);
        this.arm5a.setRotationPoint(-0.9F, 3.0F, 2.5F);
        this.Mantle.addChild(arm5a);
        this.setRotateAngle(arm5a, -0.6404F, -0.263F, 0.0F);
        this.arm5a.cubeList.add(new ModelBox(arm5a, 14, 0, -0.5F, -0.5F, 0.0F, 1, 1, 5, 0.0F, false));

        this.arm5b = new AdvancedModelRendererExtended(this);
        this.arm5b.setRotationPoint(0.0F, 0.0F, 4.5F);
        this.arm5a.addChild(arm5b);
        this.setRotateAngle(arm5b, -0.2335F, 0.1061F, 0.0F);
        this.arm5b.cubeList.add(new ModelBox(arm5b, 32, 0, -0.5F, -0.5F, 0.0F, 1, 1, 5, 0.0F, false));

        this.arm10a = new AdvancedModelRendererExtended(this);
        this.arm10a.setRotationPoint(0.9F, 3.0F, 2.5F);
        this.Mantle.addChild(arm10a);
        this.setRotateAngle(arm10a, -0.6404F, 0.263F, 0.0F);
        this.arm10a.cubeList.add(new ModelBox(arm10a, 14, 0, -0.5F, -0.5F, 0.0F, 1, 1, 5, 0.0F, true));

        this.arm10b = new AdvancedModelRendererExtended(this);
        this.arm10b.setRotationPoint(0.0F, 0.0F, 4.5F);
        this.arm10a.addChild(arm10b);
        this.setRotateAngle(arm10b, -0.2335F, -0.1061F, 0.0F);
        this.arm10b.cubeList.add(new ModelBox(arm10b, 32, 0, -0.5F, -0.5F, 0.0F, 1, 1, 5, 0.0F, true));

        this.Shellbase = new AdvancedModelRendererExtended(this);
        this.Shellbase.setRotationPoint(0.01F, 2.96F, 0.0F);
        this.Shell1.addChild(Shellbase);
        this.setRotateAngle(Shellbase, -0.1274F, 0.0F, 0.0F);

        //2

        updateDefaultPose();
    }

    @Override
    public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        this.Shell1.render(f5);
    }
    public void renderStaticFloor(float f) {
        this.root.offsetY = -0.2F;
        this.root.render(0.01F);
        resetToDefaultPose();
    }
    public void renderStaticSuspended(float f) {
        this.root.offsetY = 0.1F;
        this.root.render(0.01F);
        resetToDefaultPose();
    }
    @Override
    public void renderStaticBook(float f) {
        //Rotations, positions and sizing:
        this.root.offsetY = -1.2F;
        this.root.offsetX = -0.7F;
        this.root.rotateAngleY = (float)Math.toRadians(50);
        this.root.rotateAngleX = (float)Math.toRadians(-50);
        this.root.rotateAngleZ = (float)Math.toRadians(-8);
        this.root.scaleChildren = true;
        float scaler = 2.9F;
        this.root.setScale(scaler, scaler, scaler);
        //Start of pose:
        this.setRotateAngle(root, -0.6F, 1.05F, 0.0F);
        //End of pose, now render the model:
        this.root.render(f);
        //Reset rotations, positions and sizing:
        this.root.setScale(1.0F, 1.0F, 1.0F);
        this.root.scaleChildren = false;
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
        this.Shell1.offsetY = 1.25F;
        this.Shell1.rotateAngleX = (float) Math.toRadians(50);

        AdvancedModelRendererExtended[] tentacle1 = {this.arm1a, this.arm1b};
        AdvancedModelRendererExtended[] tentacle2 = {this.arm2a, this.arm2b};
        AdvancedModelRendererExtended[] tentacle3 = {this.arm3a, this.arm3b};
        AdvancedModelRendererExtended[] tentacle4 = {this.arm4a, this.arm4b};
        AdvancedModelRendererExtended[] tentacle5 = {this.arm5a, this.arm5b};
        AdvancedModelRendererExtended[] tentacle6 = {this.arm6a, this.arm6b};
        AdvancedModelRendererExtended[] tentacle7 = {this.arm7a, this.arm7b};
        AdvancedModelRendererExtended[] tentacle8 = {this.arm8a, this.arm8b};
        AdvancedModelRendererExtended[] tentacle9 = {this.arm9a, this.arm9b};
        AdvancedModelRendererExtended[] tentacle10 = {this.arm10a, this.arm10b};

        float speed = 0.2F;
        if (!e.isInWater()) {
            speed = 0.5F;
        }

        //Left:
        this.chainWave(tentacle3, speed, 0.3F, -2, f2, 1F);
        //Left lower middle:
        this.chainWave(tentacle4, speed, 0.3F, -2, f2, 1F);
        //Left lower bottom:
        this.chainWave(tentacle5, speed, 0.3F, -2, f2, 1F);
        //Left upper middle:
        this.chainWave(tentacle2, speed, 0.3F, -2, f2, 1F);
        //Left upper top:
        this.chainWave(tentacle1, speed, 0.3F, -2, f2, 1F);

        //Right:
        this.chainWave(tentacle8, speed, 0.3F, -2, f2, 1F);
        //Right lower middle:
        this.chainWave(tentacle9, speed, 0.3F, -2, f2, 1F);
        //Right lower bottom:
        this.chainWave(tentacle10, speed, 0.3F, -2, f2, 1F);
        //Right upper middle:
        this.chainWave(tentacle7, speed, 0.3F, -2, f2, 1F);
        //Right upper top:
        this.chainWave(tentacle6, speed, 0.3F, -2, f2, 1F);

        if (e.isInWater()) {
            this.bob(Shell1, 0.1F, 2.0F, false, f2, 2);
            this.Shell1.offsetZ = this.moveBoxExtended(speed, 0.40F, false, 3, f2, 1);
        }
        else {
            this.Shell1.rotateAngleZ = (float) Math.toRadians(90);
            //this.Shell1.offsetY = 0.08F;
        }

    }

}
