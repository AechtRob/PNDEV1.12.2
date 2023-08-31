package net.lepidodendron.entity.model.entity;

import net.lepidodendron.entity.model.llibraryextensions.AdvancedModelBaseExtended;
import net.lepidodendron.entity.model.llibraryextensions.AdvancedModelRendererExtended;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

public class ModelAmmonite_Perisphinctes extends AdvancedModelBaseExtended {
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
    private final AdvancedModelRendererExtended Tentacle1a;
    private final AdvancedModelRendererExtended Tentacle1b;
    private final AdvancedModelRendererExtended Tentacle2a;
    private final AdvancedModelRendererExtended Tentacle2b;
    private final AdvancedModelRendererExtended Tentacle3a;
    private final AdvancedModelRendererExtended Tentacle3b;
    private final AdvancedModelRendererExtended Tentacle4a;
    private final AdvancedModelRendererExtended Tentacle4b;
    private final AdvancedModelRendererExtended Tentacle5a;
    private final AdvancedModelRendererExtended Tentacle5b;
    private final AdvancedModelRendererExtended Tentacle6a;
    private final AdvancedModelRendererExtended Tentacle6b;
    private final AdvancedModelRendererExtended Tentacle7a;
    private final AdvancedModelRendererExtended Tentacle7b;
    private final AdvancedModelRendererExtended Tentacle8a;
    private final AdvancedModelRendererExtended Tentacle8b;
    private final AdvancedModelRendererExtended Tentacle9a;
    private final AdvancedModelRendererExtended Tentacle9b;
    private final AdvancedModelRendererExtended Tentacle10a;
    private final AdvancedModelRendererExtended Tentacle10b;
    private final AdvancedModelRendererExtended Shellbase;

    public ModelAmmonite_Perisphinctes() {
        this.textureWidth = 64;
        this.textureHeight = 64;

        this.root = new AdvancedModelRendererExtended(this);
        this.root.setRotationPoint(0.0F, 0.0F, 0.0F);


        this.Shell1 = new AdvancedModelRendererExtended(this);
        this.Shell1.setRotationPoint(0.0F, 20.5F, 0.0F);
        this.root.addChild(Shell1);
        this.setRotateAngle(Shell1, 0.6156F, 0.0F, 0.0F);
        this.Shell1.cubeList.add(new ModelBox(Shell1, 0, 52, -2.5F, -3.0F, 0.0F, 5, 6, 6, 0.0F, false));

        this.Shell2 = new AdvancedModelRendererExtended(this);
        this.Shell2.setRotationPoint(-0.01F, 0.35F, 1.4F);
        this.Shell1.addChild(Shell2);
        this.setRotateAngle(Shell2, -0.4882F, 0.0F, 0.0F);
        this.Shell2.cubeList.add(new ModelBox(Shell2, 0, 38, -2.5F, -3.0F, -7.0F, 5, 6, 7, 0.0F, false));

        this.Shell3 = new AdvancedModelRendererExtended(this);
        this.Shell3.setRotationPoint(0.01F, 0.9F, -4.9F);
        this.Shell2.addChild(Shell3);
        this.setRotateAngle(Shell3, -0.7854F, 0.0F, 0.0F);
        this.Shell3.cubeList.add(new ModelBox(Shell3, 0, 24, -2.5F, -3.0F, -7.0F, 5, 6, 7, 0.0F, false));

        this.Shell4 = new AdvancedModelRendererExtended(this);
        this.Shell4.setRotationPoint(0.0F, 1.11F, -4.66F);
        this.Shell3.addChild(Shell4);
        this.setRotateAngle(Shell4, -0.8915F, 0.0F, 0.0F);
        this.Shell4.cubeList.add(new ModelBox(Shell4, 24, 51, -2.0F, -3.0F, -7.0F, 4, 6, 7, 0.0F, false));

        this.Shell5 = new AdvancedModelRendererExtended(this);
        this.Shell5.setRotationPoint(-0.01F, 1.02F, -4.75F);
        this.Shell4.addChild(Shell5);
        this.setRotateAngle(Shell5, -0.8491F, 0.0F, 0.0F);
        this.Shell5.cubeList.add(new ModelBox(Shell5, 27, 38, -2.0F, -3.0F, -6.0F, 4, 6, 6, 0.0F, false));

        this.Shell6 = new AdvancedModelRendererExtended(this);
        this.Shell6.setRotationPoint(0.0F, 1.1F, -4.35F);
        this.Shell5.addChild(Shell6);
        this.setRotateAngle(Shell6, -0.7006F, 0.0F, 0.0F);
        this.Shell6.cubeList.add(new ModelBox(Shell6, 27, 26, -1.5F, -2.5F, -6.0F, 3, 5, 6, 0.0F, false));

        this.Shell7 = new AdvancedModelRendererExtended(this);
        this.Shell7.setRotationPoint(0.01F, 1.04F, -3.96F);
        this.Shell6.addChild(Shell7);
        this.setRotateAngle(Shell7, -0.9552F, 0.0F, 0.0F);
        this.Shell7.cubeList.add(new ModelBox(Shell7, 46, 47, -1.5F, -2.5F, -5.0F, 3, 5, 5, 0.0F, false));

        this.Shell8 = new AdvancedModelRendererExtended(this);
        this.Shell8.setRotationPoint(0.01F, 0.4F, -3.6F);
        this.Shell7.addChild(Shell8);
        this.setRotateAngle(Shell8, -0.5732F, 0.0F, 0.0F);
        this.Shell8.cubeList.add(new ModelBox(Shell8, 48, 33, -1.5F, -2.5F, -5.0F, 3, 5, 5, 0.0F, false));

        this.Shell9 = new AdvancedModelRendererExtended(this);
        this.Shell9.setRotationPoint(-0.01F, -1.9F, -3.6F);
        this.Shell8.addChild(Shell9);
        this.setRotateAngle(Shell9, -1.9953F, 0.0F, 0.0F);
        this.Shell9.cubeList.add(new ModelBox(Shell9, 50, 23, -1.0F, -2.5F, -4.0F, 2, 5, 4, 0.0F, false));

        this.Mantle = new AdvancedModelRendererExtended(this);
        this.Mantle.setRotationPoint(0.0F, -2.9F, 5.8F);
        this.Shell1.addChild(Mantle);
        this.setRotateAngle(Mantle, -0.2972F, 0.0F, 0.0F);
        this.Mantle.cubeList.add(new ModelBox(Mantle, 0, 14, -2.0F, 0.0F, 0.0F, 4, 5, 4, 0.0F, false));

        this.Siphon = new AdvancedModelRendererExtended(this);
        this.Siphon.setRotationPoint(0.0F, 3.2F, 0.0F);
        this.Mantle.addChild(Siphon);
        this.setRotateAngle(Siphon, -0.2972F, 0.0F, 0.0F);
        this.Siphon.cubeList.add(new ModelBox(Siphon, 9, 2, -1.0F, 0.0F, 0.0F, 2, 2, 5, 0.0F, false));

        this.Tentacle1a = new AdvancedModelRendererExtended(this);
        this.Tentacle1a.setRotationPoint(-1.0F, 3.5F, 3.5F);
        this.Mantle.addChild(Tentacle1a);
        this.setRotateAngle(Tentacle1a, 0.5732F, -0.4882F, -2.4199F);
        this.Tentacle1a.cubeList.add(new ModelBox(Tentacle1a, 0, 7, -0.5F, -0.5F, 0.0F, 1, 1, 5, 0.0F, false));

        this.Tentacle1b = new AdvancedModelRendererExtended(this);
        this.Tentacle1b.setRotationPoint(0.0F, 0.0F, 4.5F);
        this.Tentacle1a.addChild(Tentacle1b);
        this.setRotateAngle(Tentacle1b, -0.2759F, 0.0848F, 0.0F);
        this.Tentacle1b.cubeList.add(new ModelBox(Tentacle1b, 1, 0, -0.5F, -0.5F, 0.0F, 1, 1, 5, 0.0F, false));

        this.Tentacle2a = new AdvancedModelRendererExtended(this);
        this.Tentacle2a.setRotationPoint(-1.15F, 2.9F, 3.5F);
        this.Mantle.addChild(Tentacle2a);
        this.setRotateAngle(Tentacle2a, -0.3183F, 0.5308F, 1.1675F);
        this.Tentacle2a.cubeList.add(new ModelBox(Tentacle2a, 0, 7, -0.5F, -0.5F, 0.0F, 1, 1, 5, 0.0F, false));

        this.Tentacle2b = new AdvancedModelRendererExtended(this);
        this.Tentacle2b.setRotationPoint(0.0F, 0.0F, 4.5F);
        this.Tentacle2a.addChild(Tentacle2b);
        this.setRotateAngle(Tentacle2b, 0.1698F, -0.0424F, 0.0F);
        this.Tentacle2b.cubeList.add(new ModelBox(Tentacle2b, 1, 0, -0.5F, -0.5F, 0.0F, 1, 1, 5, 0.0F, false));

        this.Tentacle3a = new AdvancedModelRendererExtended(this);
        this.Tentacle3a.setRotationPoint(-1.2F, 2.3F, 3.5F);
        this.Mantle.addChild(Tentacle3a);
        this.setRotateAngle(Tentacle3a, -0.0213F, -0.5732F, -1.2099F);
        this.Tentacle3a.cubeList.add(new ModelBox(Tentacle3a, 0, 7, -0.5F, -0.5F, 0.0F, 1, 1, 5, 0.0F, false));

        this.Tentacle3b = new AdvancedModelRendererExtended(this);
        this.Tentacle3b.setRotationPoint(0.0F, 0.0F, 4.5F);
        this.Tentacle3a.addChild(Tentacle3b);
        this.setRotateAngle(Tentacle3b, -0.2122F, 0.1911F, 0.0F);
        this.Tentacle3b.cubeList.add(new ModelBox(Tentacle3b, 1, 0, -0.5F, -0.5F, 0.0F, 1, 1, 5, 0.0F, false));

        this.Tentacle4a = new AdvancedModelRendererExtended(this);
        this.Tentacle4a.setRotationPoint(-0.95F, 1.8F, 3.5F);
        this.Mantle.addChild(Tentacle4a);
        this.setRotateAngle(Tentacle4a, -0.2546F, -0.3396F, -0.6793F);
        this.Tentacle4a.cubeList.add(new ModelBox(Tentacle4a, 0, 7, -0.5F, -0.5F, 0.0F, 1, 1, 5, 0.0F, false));

        this.Tentacle4b = new AdvancedModelRendererExtended(this);
        this.Tentacle4b.setRotationPoint(0.0F, 0.0F, 4.5F);
        this.Tentacle4a.addChild(Tentacle4b);
        this.setRotateAngle(Tentacle4b, -0.0848F, 0.0637F, 0.0F);
        this.Tentacle4b.cubeList.add(new ModelBox(Tentacle4b, 1, 0, -0.5F, -0.5F, 0.0F, 1, 1, 5, 0.0F, false));

        this.Tentacle5a = new AdvancedModelRendererExtended(this);
        this.Tentacle5a.setRotationPoint(-0.4F, 1.4F, 3.5F);
        this.Mantle.addChild(Tentacle5a);
        this.setRotateAngle(Tentacle5a, -0.3609F, -0.1485F, -0.1485F);
        this.Tentacle5a.cubeList.add(new ModelBox(Tentacle5a, 0, 7, -0.5F, -0.5F, 0.0F, 1, 1, 5, 0.0F, false));

        this.Tentacle5b = new AdvancedModelRendererExtended(this);
        this.Tentacle5b.setRotationPoint(0.0F, 0.0F, 4.5F);
        this.Tentacle5a.addChild(Tentacle5b);
        this.setRotateAngle(Tentacle5b, -0.0424F, 0.1061F, 0.0F);
        this.Tentacle5b.cubeList.add(new ModelBox(Tentacle5b, 1, 0, -0.5F, -0.5F, 0.0F, 1, 1, 5, 0.0F, false));

        this.Tentacle6a = new AdvancedModelRendererExtended(this);
        this.Tentacle6a.setRotationPoint(1.0F, 3.5F, 3.5F);
        this.Mantle.addChild(Tentacle6a);
        this.setRotateAngle(Tentacle6a, 0.5732F, 0.4882F, 2.4199F);
        this.Tentacle6a.cubeList.add(new ModelBox(Tentacle6a, 0, 7, -0.5F, -0.5F, 0.0F, 1, 1, 5, 0.0F, false));

        this.Tentacle6b = new AdvancedModelRendererExtended(this);
        this.Tentacle6b.setRotationPoint(0.0F, 0.0F, 4.5F);
        this.Tentacle6a.addChild(Tentacle6b);
        this.setRotateAngle(Tentacle6b, -0.2759F, -0.0848F, 0.0F);
        this.Tentacle6b.cubeList.add(new ModelBox(Tentacle6b, 1, 0, -0.5F, -0.5F, 0.0F, 1, 1, 5, 0.0F, false));

        this.Tentacle7a = new AdvancedModelRendererExtended(this);
        this.Tentacle7a.setRotationPoint(1.15F, 3.0F, 3.5F);
        this.Mantle.addChild(Tentacle7a);
        this.setRotateAngle(Tentacle7a, -0.3183F, -0.5308F, -1.1675F);
        this.Tentacle7a.cubeList.add(new ModelBox(Tentacle7a, 0, 7, -0.5F, -0.5F, 0.0F, 1, 1, 5, 0.0F, false));

        this.Tentacle7b = new AdvancedModelRendererExtended(this);
        this.Tentacle7b.setRotationPoint(0.0F, 0.0F, 4.5F);
        this.Tentacle7a.addChild(Tentacle7b);
        this.setRotateAngle(Tentacle7b, 0.1698F, 0.0424F, 0.0F);
        this.Tentacle7b.cubeList.add(new ModelBox(Tentacle7b, 1, 0, -0.5F, -0.5F, 0.0F, 1, 1, 5, 0.0F, false));

        this.Tentacle8a = new AdvancedModelRendererExtended(this);
        this.Tentacle8a.setRotationPoint(1.2F, 2.3F, 3.5F);
        this.Mantle.addChild(Tentacle8a);
        this.setRotateAngle(Tentacle8a, -0.0213F, 0.5732F, 1.2099F);
        this.Tentacle8a.cubeList.add(new ModelBox(Tentacle8a, 0, 7, -0.5F, -0.5F, 0.0F, 1, 1, 5, 0.0F, false));

        this.Tentacle8b = new AdvancedModelRendererExtended(this);
        this.Tentacle8b.setRotationPoint(0.0F, 0.0F, 4.5F);
        this.Tentacle8a.addChild(Tentacle8b);
        this.setRotateAngle(Tentacle8b, -0.2122F, -0.1911F, 0.0F);
        this.Tentacle8b.cubeList.add(new ModelBox(Tentacle8b, 1, 0, -0.5F, -0.5F, 0.0F, 1, 1, 5, 0.0F, false));

        this.Tentacle9a = new AdvancedModelRendererExtended(this);
        this.Tentacle9a.setRotationPoint(0.95F, 1.8F, 3.5F);
        this.Mantle.addChild(Tentacle9a);
        this.setRotateAngle(Tentacle9a, -0.2546F, 0.3396F, 0.6793F);
        this.Tentacle9a.cubeList.add(new ModelBox(Tentacle9a, 0, 7, -0.5F, -0.5F, 0.0F, 1, 1, 5, 0.0F, false));

        this.Tentacle9b = new AdvancedModelRendererExtended(this);
        this.Tentacle9b.setRotationPoint(0.0F, 0.0F, 4.5F);
        this.Tentacle9a.addChild(Tentacle9b);
        this.setRotateAngle(Tentacle9b, -0.0848F, -0.0637F, 0.0F);
        this.Tentacle9b.cubeList.add(new ModelBox(Tentacle9b, 1, 0, -0.5F, -0.5F, 0.0F, 1, 1, 5, 0.0F, false));

        this.Tentacle10a = new AdvancedModelRendererExtended(this);
        this.Tentacle10a.setRotationPoint(0.4F, 1.4F, 3.5F);
        this.Mantle.addChild(Tentacle10a);
        this.setRotateAngle(Tentacle10a, -0.3609F, 0.1485F, 0.1485F);
        this.Tentacle10a.cubeList.add(new ModelBox(Tentacle10a, 0, 7, -0.5F, -0.5F, 0.0F, 1, 1, 5, 0.0F, false));

        this.Tentacle10b = new AdvancedModelRendererExtended(this);
        this.Tentacle10b.setRotationPoint(0.0F, 0.0F, 4.5F);
        this.Tentacle10a.addChild(Tentacle10b);
        this.setRotateAngle(Tentacle10b, -0.0424F, -0.1061F, 0.0F);
        this.Tentacle10b.cubeList.add(new ModelBox(Tentacle10b, 1, 0, -0.5F, -0.5F, 0.0F, 1, 1, 5, 0.0F, false));

        this.Shellbase = new AdvancedModelRendererExtended(this);
        this.Shellbase.setRotationPoint(0.01F, 2.96F, 0.0F);
        this.Shell1.addChild(Shellbase);
        this.setRotateAngle(Shellbase, -0.0637F, 0.0F, 0.0F);
        this.Shellbase.cubeList.add(new ModelBox(Shellbase, 20, 17, -2.5F, -2.0F, 0.0F, 5, 2, 6, 0.0F, false));

        //2

        updateDefaultPose();
    }

    public void renderAll(float f) {
        this.resetToDefaultPose();
        this.Shell1.offsetY = -1.5F;
        this.Shell1.render(0.1f);
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

        AdvancedModelRendererExtended[] tentacle1 = {this.Tentacle1a, this.Tentacle1b};
        AdvancedModelRendererExtended[] tentacle2 = {this.Tentacle2a, this.Tentacle2b};
        AdvancedModelRendererExtended[] tentacle3 = {this.Tentacle3a, this.Tentacle3b};
        AdvancedModelRendererExtended[] tentacle4 = {this.Tentacle4a, this.Tentacle4b};
        AdvancedModelRendererExtended[] tentacle5 = {this.Tentacle5a, this.Tentacle5b};
        AdvancedModelRendererExtended[] tentacle6 = {this.Tentacle6a, this.Tentacle6b};
        AdvancedModelRendererExtended[] tentacle7 = {this.Tentacle7a, this.Tentacle7b};
        AdvancedModelRendererExtended[] tentacle8 = {this.Tentacle8a, this.Tentacle8b};
        AdvancedModelRendererExtended[] tentacle9 = {this.Tentacle9a, this.Tentacle9b};
        AdvancedModelRendererExtended[] tentacle10 = {this.Tentacle10a, this.Tentacle10b};

        float speed = 0.2F;
        if (!e.isInWater()) {
            speed = 0.5F;
        }

        //Left:
        this.chainWave(tentacle8, speed, 0.2F, -2, f2, 1F);
        //Left lower middle:
        this.chainWave(tentacle7, speed, -0.2F, -2, f2, 1F);
        //Left lower bottom:
        this.chainWave(tentacle6, speed, 0.2F, -2, f2, 1F);
        //Left upper middle:
        this.chainWave(tentacle9, speed, 0.2F, -2, f2, 1F);
        //Left upper top:
        this.chainWave(tentacle10, speed, 0.2F, -2, f2, 1F);

        //Right:
        this.chainWave(tentacle3, speed, 0.2F, -2, f2, 1F);
        //Right lower middle:
        this.chainWave(tentacle2, speed, -0.2F, -2, f2, 1F);
        //Right lower bottom:
        this.chainWave(tentacle1, speed, 0.2F, -2, f2, 1F);
        //Right upper middle:
        this.chainWave(tentacle4, speed, 0.2F, -2, f2, 1F);
        //Right upper top:
        this.chainWave(tentacle5, speed, 0.2F, -2, f2, 1F);

        if (e.isInWater()) {
            this.bob(Shell1, 0.1F, 2.0F, false, f2, 2);
            this.Shell1.offsetZ = this.moveBoxExtended(speed, 0.40F, false, 0, f2, 1);
        }
        else {
            this.Shell1.rotateAngleZ = (float) Math.toRadians(90);
            this.Shell1.offsetY = 0.08F;
        }

    }

}
