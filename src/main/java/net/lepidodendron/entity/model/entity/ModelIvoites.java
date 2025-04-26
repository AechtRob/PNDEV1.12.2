package net.lepidodendron.entity.model.entity;

import net.lepidodendron.entity.model.ModelBasePalaeopedia;
import net.lepidodendron.entity.model.llibraryextensions.AdvancedModelRendererExtended;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

public class ModelIvoites extends ModelBasePalaeopedia {
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
    private final AdvancedModelRendererExtended Shell10_r1;
    private final AdvancedModelRendererExtended Mantle;
    private final AdvancedModelRendererExtended Siphon;
    private final AdvancedModelRendererExtended Tentacle1;
    private final AdvancedModelRendererExtended Tentacles1;
    private final AdvancedModelRendererExtended Tentacle6;
    private final AdvancedModelRendererExtended Tentacles6;
    private final AdvancedModelRendererExtended Tentacle2;
    private final AdvancedModelRendererExtended Temtacles2;
    private final AdvancedModelRendererExtended Tentacle7;
    private final AdvancedModelRendererExtended Tentacles7;
    private final AdvancedModelRendererExtended Tentacle3;
    private final AdvancedModelRendererExtended Tentacles3;
    private final AdvancedModelRendererExtended Tentacle8;
    private final AdvancedModelRendererExtended Tentacles8;
    private final AdvancedModelRendererExtended Tentacle4;
    private final AdvancedModelRendererExtended Tentacles4;
    private final AdvancedModelRendererExtended Tentacle9;
    private final AdvancedModelRendererExtended Tentacles9;
    private final AdvancedModelRendererExtended Tentacle5;
    private final AdvancedModelRendererExtended Tentacles5;
    private final AdvancedModelRendererExtended Tentacle10;
    private final AdvancedModelRendererExtended Tentacles10;

    public ModelIvoites() {
        this.textureWidth = 64;
        this.textureHeight = 64;

        this.root = new AdvancedModelRendererExtended(this);
        this.root.setRotationPoint(0.0F, 0.0F, 0.0F);


        this.Shell1 = new AdvancedModelRendererExtended(this);
        this.Shell1.setRotationPoint(0.0F, 19.5F, 0.0F);
        this.root.addChild(Shell1);
        this.setRotateAngle(Shell1, 0.2665F, 0.0F, 0.0F);
        this.Shell1.cubeList.add(new ModelBox(Shell1, 0, 0, -3.0F, -3.0F, -4.0F, 6, 6, 10, 0.0F, false));

        this.Shell2 = new AdvancedModelRendererExtended(this);
        this.Shell2.setRotationPoint(-0.01F, 0.1F, -2.3F);
        this.Shell1.addChild(Shell2);
        this.setRotateAngle(Shell2, -0.5318F, 0.0F, 0.0F);
        this.Shell2.cubeList.add(new ModelBox(Shell2, 0, 16, -2.5F, -1.75F, -10.0F, 5, 5, 10, 0.0F, false));

        this.Shell3 = new AdvancedModelRendererExtended(this);
        this.Shell3.setRotationPoint(0.01F, 0.55F, -8.7F);
        this.Shell2.addChild(Shell3);
        this.setRotateAngle(Shell3, -0.48F, 0.0F, 0.0F);
        this.Shell3.cubeList.add(new ModelBox(Shell3, 20, 21, -2.5F, -2.0F, -10.0F, 5, 5, 10, 0.0F, false));

        this.Shell4 = new AdvancedModelRendererExtended(this);
        this.Shell4.setRotationPoint(0.0F, 0.56F, -8.16F);
        this.Shell3.addChild(Shell4);
        this.setRotateAngle(Shell4, -0.717F, 0.0F, 0.0F);
        this.Shell4.cubeList.add(new ModelBox(Shell4, 23, 7, -2.0F, -1.0F, -9.0F, 4, 4, 9, 0.0F, false));

        this.Shell5 = new AdvancedModelRendererExtended(this);
        this.Shell5.setRotationPoint(-0.01F, 1.32F, -6.55F);
        this.Shell4.addChild(Shell5);
        this.setRotateAngle(Shell5, -1.0236F, 0.0F, 0.0F);
        this.Shell5.cubeList.add(new ModelBox(Shell5, 11, 36, -2.0F, 0.0F, -9.0F, 4, 3, 9, 0.0F, false));

        this.Shell6 = new AdvancedModelRendererExtended(this);
        this.Shell6.setRotationPoint(0.0F, 1.85F, -7.85F);
        this.Shell5.addChild(Shell6);
        this.setRotateAngle(Shell6, -0.9624F, 0.0F, 0.0F);
        this.Shell6.cubeList.add(new ModelBox(Shell6, 37, 36, -1.5F, -1.5F, -7.0F, 3, 3, 7, 0.0F, false));

        this.Shell7 = new AdvancedModelRendererExtended(this);
        this.Shell7.setRotationPoint(0.01F, -0.2F, -5.05F);
        this.Shell6.addChild(Shell7);
        this.setRotateAngle(Shell7, -0.868F, 0.0F, 0.0F);
        this.Shell7.cubeList.add(new ModelBox(Shell7, 28, 36, -1.5F, 0.5F, -5.0F, 3, 2, 5, 0.0F, false));

        this.Shell8 = new AdvancedModelRendererExtended(this);
        this.Shell8.setRotationPoint(0.0F, 0.55F, -3.3F);
        this.Shell7.addChild(Shell8);
        this.setRotateAngle(Shell8, -0.7063F, 0.0F, 0.0F);
        this.Shell8.cubeList.add(new ModelBox(Shell8, 40, 20, -1.0F, 0.5F, -6.0F, 2, 2, 6, 0.0F, false));

        this.Shell9 = new AdvancedModelRendererExtended(this);
        this.Shell9.setRotationPoint(-0.01F, 1.1F, -5.1F);
        this.Shell8.addChild(Shell9);
        this.setRotateAngle(Shell9, -1.0755F, 0.0F, 0.0F);
        this.Shell9.cubeList.add(new ModelBox(Shell9, 40, 9, -0.49F, 0.4F, -5.4F, 1, 1, 6, 0.0F, false));

        this.Shell10_r1 = new AdvancedModelRendererExtended(this);
        this.Shell10_r1.setRotationPoint(0.01F, 0.37F, -4.59F);
        this.Shell9.addChild(Shell10_r1);
        this.setRotateAngle(Shell10_r1, 0.0873F, 0.0F, 0.0F);
        this.Shell10_r1.cubeList.add(new ModelBox(Shell10_r1, 0, 21, 0.0F, -8.87F, -3.66F, 0, 10, 10, 0.0F, false));

        this.Mantle = new AdvancedModelRendererExtended(this);
        this.Mantle.setRotationPoint(0.0F, -2.9F, 5.8F);
        this.Shell1.addChild(Mantle);
        this.setRotateAngle(Mantle, -0.2972F, 0.0F, 0.0F);
        this.Mantle.cubeList.add(new ModelBox(Mantle, 40, 0, -2.5F, 0.0F, 0.0F, 5, 5, 4, 0.0F, false));

        this.Siphon = new AdvancedModelRendererExtended(this);
        this.Siphon.setRotationPoint(0.0F, 1.75F, 0.0F);
        this.Mantle.addChild(Siphon);
        this.setRotateAngle(Siphon, -0.2972F, 0.0F, 0.0F);
        this.Siphon.cubeList.add(new ModelBox(Siphon, 22, 0, -1.5F, 1.0F, 0.0F, 3, 2, 5, 0.0F, false));

        this.Tentacle1 = new AdvancedModelRendererExtended(this);
        this.Tentacle1.setRotationPoint(-1.4F, 3.5F, 3.5F);
        this.Mantle.addChild(Tentacle1);
        this.setRotateAngle(Tentacle1, -0.7854F, 0.0424F, 0.0F);
        this.Tentacle1.cubeList.add(new ModelBox(Tentacle1, 50, 28, -0.5F, -0.5F, 0.0F, 1, 1, 5, 0.0F, false));

        this.Tentacles1 = new AdvancedModelRendererExtended(this);
        this.Tentacles1.setRotationPoint(0.0F, 0.0F, 4.5F);
        this.Tentacle1.addChild(Tentacles1);
        this.setRotateAngle(Tentacles1, -0.2335F, 0.1061F, 0.0F);
        this.Tentacles1.cubeList.add(new ModelBox(Tentacles1, 50, 34, -0.5F, -0.5F, 0.0F, 1, 1, 5, 0.0F, false));

        this.Tentacle6 = new AdvancedModelRendererExtended(this);
        this.Tentacle6.setRotationPoint(1.4F, 3.5F, 3.5F);
        this.Mantle.addChild(Tentacle6);
        this.setRotateAngle(Tentacle6, -0.7854F, -0.0424F, 0.0F);
        this.Tentacle6.cubeList.add(new ModelBox(Tentacle6, 50, 28, -0.5F, -0.5F, 0.0F, 1, 1, 5, 0.0F, true));

        this.Tentacles6 = new AdvancedModelRendererExtended(this);
        this.Tentacles6.setRotationPoint(0.0F, 0.0F, 4.5F);
        this.Tentacle6.addChild(Tentacles6);
        this.setRotateAngle(Tentacles6, -0.2335F, -0.1061F, 0.0F);
        this.Tentacles6.cubeList.add(new ModelBox(Tentacles6, 50, 34, -0.5F, -0.5F, 0.0F, 1, 1, 5, 0.0F, true));

        this.Tentacle2 = new AdvancedModelRendererExtended(this);
        this.Tentacle2.setRotationPoint(-1.55F, 2.9F, 3.5F);
        this.Mantle.addChild(Tentacle2);
        this.setRotateAngle(Tentacle2, -0.6793F, -0.1698F, 0.0F);
        this.Tentacle2.cubeList.add(new ModelBox(Tentacle2, 0, 49, -0.5F, -0.5F, 0.0F, 1, 1, 5, 0.0F, false));

        this.Temtacles2 = new AdvancedModelRendererExtended(this);
        this.Temtacles2.setRotationPoint(0.0F, 0.0F, 4.5F);
        this.Tentacle2.addChild(Temtacles2);
        this.setRotateAngle(Temtacles2, -0.3183F, 0.3609F, 0.0F);
        this.Temtacles2.cubeList.add(new ModelBox(Temtacles2, 50, 15, -0.5F, -0.5F, 0.0F, 1, 1, 5, 0.0F, false));

        this.Tentacle7 = new AdvancedModelRendererExtended(this);
        this.Tentacle7.setRotationPoint(1.55F, 2.9F, 3.5F);
        this.Mantle.addChild(Tentacle7);
        this.setRotateAngle(Tentacle7, -0.6793F, 0.1698F, 0.0F);
        this.Tentacle7.cubeList.add(new ModelBox(Tentacle7, 0, 49, -0.5F, -0.5F, 0.0F, 1, 1, 5, 0.0F, true));

        this.Tentacles7 = new AdvancedModelRendererExtended(this);
        this.Tentacles7.setRotationPoint(0.0F, 0.0F, 4.5F);
        this.Tentacle7.addChild(Tentacles7);
        this.setRotateAngle(Tentacles7, -0.3183F, -0.3609F, 0.0F);
        this.Tentacles7.cubeList.add(new ModelBox(Tentacles7, 50, 15, -0.5F, -0.5F, 0.0F, 1, 1, 5, 0.0F, true));

        this.Tentacle3 = new AdvancedModelRendererExtended(this);
        this.Tentacle3.setRotationPoint(-1.8F, 2.2F, 3.5F);
        this.Mantle.addChild(Tentacle3);
        this.setRotateAngle(Tentacle3, -0.6156F, -0.0424F, 0.0F);
        this.Tentacle3.cubeList.add(new ModelBox(Tentacle3, 48, 9, -0.5F, -0.5F, 0.0F, 1, 1, 5, 0.0F, false));

        this.Tentacles3 = new AdvancedModelRendererExtended(this);
        this.Tentacles3.setRotationPoint(0.0F, 0.0F, 4.5F);
        this.Tentacle3.addChild(Tentacles3);
        this.setRotateAngle(Tentacles3, -0.2759F, 0.1698F, 0.0F);
        this.Tentacles3.cubeList.add(new ModelBox(Tentacles3, 19, 48, -0.5F, -0.5F, 0.0F, 1, 1, 5, 0.0F, false));

        this.Tentacle8 = new AdvancedModelRendererExtended(this);
        this.Tentacle8.setRotationPoint(1.8F, 2.2F, 3.5F);
        this.Mantle.addChild(Tentacle8);
        this.setRotateAngle(Tentacle8, -0.6156F, 0.0424F, 0.0F);
        this.Tentacle8.cubeList.add(new ModelBox(Tentacle8, 48, 9, -0.5F, -0.5F, 0.0F, 1, 1, 5, 0.0F, true));

        this.Tentacles8 = new AdvancedModelRendererExtended(this);
        this.Tentacles8.setRotationPoint(0.0F, 0.0F, 4.5F);
        this.Tentacle8.addChild(Tentacles8);
        this.setRotateAngle(Tentacles8, -0.2759F, -0.1698F, 0.0F);
        this.Tentacles8.cubeList.add(new ModelBox(Tentacles8, 19, 48, -0.5F, -0.5F, 0.0F, 1, 1, 5, 0.0F, true));

        this.Tentacle4 = new AdvancedModelRendererExtended(this);
        this.Tentacle4.setRotationPoint(-1.45F, 1.8F, 3.5F);
        this.Mantle.addChild(Tentacle4);
        this.setRotateAngle(Tentacle4, -0.5095F, 0.0637F, 0.0F);
        this.Tentacle4.cubeList.add(new ModelBox(Tentacle4, 44, 46, -0.5F, -0.5F, 0.0F, 1, 1, 5, 0.0F, false));

        this.Tentacles4 = new AdvancedModelRendererExtended(this);
        this.Tentacles4.setRotationPoint(0.0F, 0.0F, 4.5F);
        this.Tentacle4.addChild(Tentacles4);
        this.setRotateAngle(Tentacles4, -0.2972F, -0.0637F, 0.0F);
        this.Tentacles4.cubeList.add(new ModelBox(Tentacles4, 7, 48, -0.5F, -0.5F, 0.0F, 1, 1, 5, 0.0F, false));

        this.Tentacle9 = new AdvancedModelRendererExtended(this);
        this.Tentacle9.setRotationPoint(1.45F, 1.8F, 3.5F);
        this.Mantle.addChild(Tentacle9);
        this.setRotateAngle(Tentacle9, -0.5095F, -0.0637F, 0.0F);
        this.Tentacle9.cubeList.add(new ModelBox(Tentacle9, 44, 46, -0.5F, -0.5F, 0.0F, 1, 1, 5, 0.0F, true));

        this.Tentacles9 = new AdvancedModelRendererExtended(this);
        this.Tentacles9.setRotationPoint(0.0F, 0.0F, 4.5F);
        this.Tentacle9.addChild(Tentacles9);
        this.setRotateAngle(Tentacles9, -0.2972F, 0.0637F, 0.0F);
        this.Tentacles9.cubeList.add(new ModelBox(Tentacles9, 7, 48, -0.5F, -0.5F, 0.0F, 1, 1, 5, 0.0F, true));

        this.Tentacle5 = new AdvancedModelRendererExtended(this);
        this.Tentacle5.setRotationPoint(-0.8F, 1.4F, 3.5F);
        this.Mantle.addChild(Tentacle5);
        this.setRotateAngle(Tentacle5, -0.4671F, 0.0637F, 0.0F);
        this.Tentacle5.cubeList.add(new ModelBox(Tentacle5, 0, 43, -0.5F, -0.5F, 0.0F, 1, 1, 5, 0.0F, false));

        this.Tentacles5 = new AdvancedModelRendererExtended(this);
        this.Tentacles5.setRotationPoint(0.0F, 0.0F, 4.5F);
        this.Tentacle5.addChild(Tentacles5);
        this.setRotateAngle(Tentacles5, -0.2546F, -0.1061F, 0.0F);
        this.Tentacles5.cubeList.add(new ModelBox(Tentacles5, 32, 46, -0.5F, -0.5F, 0.0F, 1, 1, 5, 0.0F, false));

        this.Tentacle10 = new AdvancedModelRendererExtended(this);
        this.Tentacle10.setRotationPoint(0.8F, 1.4F, 3.5F);
        this.Mantle.addChild(Tentacle10);
        this.setRotateAngle(Tentacle10, -0.4671F, -0.0637F, 0.0F);
        this.Tentacle10.cubeList.add(new ModelBox(Tentacle10, 0, 43, -0.5F, -0.5F, 0.0F, 1, 1, 5, 0.0F, true));

        this.Tentacles10 = new AdvancedModelRendererExtended(this);
        this.Tentacles10.setRotationPoint(0.0F, 0.0F, 4.5F);
        this.Tentacle10.addChild(Tentacles10);
        this.setRotateAngle(Tentacles10, -0.2546F, 0.1061F, 0.0F);
        this.Tentacles10.cubeList.add(new ModelBox(Tentacles10, 32, 46, -0.5F, -0.5F, 0.0F, 1, 1, 5, 0.0F, true));

        //2

        updateDefaultPose();
    }

    @Override
    public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        this.Shell1.render(f5);
    }
    public void renderStaticFloor(float f) {
        this.Shell1.rotateAngleY = (float) Math.toRadians(90);
        this.Shell1.offsetY = -0.45F;
        this.Shell1.render(0.01F);
        resetToDefaultPose();
    }

    @Override
    public void renderStaticBook(float f) {
        //Rotations, positions and sizing:
        this.Shell1.offsetY = -2.6F;
        this.Shell1.offsetX = 0.0F;
        this.Shell1.offsetZ = 2.0F;
        this.Shell1.rotateAngleY = (float)Math.toRadians(120);
        this.Shell1.rotateAngleX = (float)Math.toRadians(1);
        this.Shell1.rotateAngleZ = (float)Math.toRadians(0);
        this.Shell1.scaleChildren = true;
        float scaler = 3.2F;
        this.Shell1.setScale(scaler, scaler, scaler);
        //Start of pose:
        this.setRotateAngle(Shell1, -0.6F, 0.8F, -0.2F);
        //End of pose, now render the model:
        this.Shell1.render(f);
        //Reset rotations, positions and sizing:
        this.Shell1.setScale(1.0F, 1.0F, 1.0F);
        this.Shell1.scaleChildren = false;
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
        //this.Shell1.offsetY = 1.25F;

        AdvancedModelRendererExtended[] tentacle1 = {this.Tentacles1, this.Tentacle1};
        AdvancedModelRendererExtended[] tentacle2 = {this.Temtacles2, this.Tentacle2};
        AdvancedModelRendererExtended[] tentacle3 = {this.Tentacles3, this.Tentacle3};
        AdvancedModelRendererExtended[] tentacle4 = {this.Tentacles4, this.Tentacle4};
        AdvancedModelRendererExtended[] tentacle5 = {this.Tentacles5, this.Tentacle5};
        AdvancedModelRendererExtended[] tentacle6 = {this.Tentacles6, this.Tentacle6};
        AdvancedModelRendererExtended[] tentacle7 = {this.Tentacles7, this.Tentacle7};
        AdvancedModelRendererExtended[] tentacle8 = {this.Tentacles8, this.Tentacle8};
        AdvancedModelRendererExtended[] tentacle9 = {this.Tentacles9, this.Tentacle9};
        AdvancedModelRendererExtended[] tentacle10 = {this.Tentacles10, this.Tentacle10};

        float speed = 0.2F;
        if (!e.isInWater()) {
            speed = 0.5F;
        }

        //Left:
        this.chainWave(tentacle3, speed, 0.3F, -2, f2, 1F);
        //Left lower middle:
        this.chainWave(tentacle2, speed, 0.3F, -2, f2, 1F);
        //Left lower bottom:
        this.chainWave(tentacle1, speed, 0.3F, -2, f2, 1F);
        //Left upper middle:
        this.chainWave(tentacle4, speed, 0.3F, -2, f2, 1F);
        //Left upper top:
        this.chainWave(tentacle5, speed, 0.3F, -2, f2, 1F);

        //Right:
        this.chainWave(tentacle8, speed, 0.3F, -2, f2, 1F);
        //Right lower middle:
        this.chainWave(tentacle7, speed, 0.3F, -2, f2, 1F);
        //Right lower bottom:
        this.chainWave(tentacle6, speed, 0.3F, -2, f2, 1F);
        //Right upper middle:
        this.chainWave(tentacle9, speed, 0.3F, -2, f2, 1F);
        //Right upper top:
        this.chainWave(tentacle10, speed, 0.3F, -2, f2, 1F);

        if (e.isInWater()) {
            this.bob(Shell1, 0.1F, 2.0F, false, f2, 2);
            this.Shell1.offsetZ = this.moveBoxExtended(speed, 0.40F, false, 3, f2, 1);
        }
        else {
            this.Shell1.rotateAngleZ = (float) Math.toRadians(90);
            this.Shell1.offsetY = 0.08F;
        }

    }

}
