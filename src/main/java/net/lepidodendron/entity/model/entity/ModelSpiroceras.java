package net.lepidodendron.entity.model.entity;

import net.lepidodendron.entity.model.llibraryextensions.AdvancedModelBaseExtended;
import net.lepidodendron.entity.model.llibraryextensions.AdvancedModelRendererExtended;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

public class ModelSpiroceras extends AdvancedModelBaseExtended {
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
    private final AdvancedModelRendererExtended Tentaclea;
    private final AdvancedModelRendererExtended Tentacleb;
    private final AdvancedModelRendererExtended Tentaclea6;
    private final AdvancedModelRendererExtended Tentacleb6;
    private final AdvancedModelRendererExtended Tentaclea2;
    private final AdvancedModelRendererExtended Tentacleb2;
    private final AdvancedModelRendererExtended Tentaclea7;
    private final AdvancedModelRendererExtended Tentacleb7;
    private final AdvancedModelRendererExtended Tentaclea3;
    private final AdvancedModelRendererExtended Tentacleb3;
    private final AdvancedModelRendererExtended Tentaclea8;
    private final AdvancedModelRendererExtended Tentacleb8;
    private final AdvancedModelRendererExtended Tentaclea4;
    private final AdvancedModelRendererExtended Tentacleb4;
    private final AdvancedModelRendererExtended Tentaclea9;
    private final AdvancedModelRendererExtended Tentacleb9;
    private final AdvancedModelRendererExtended Tentaclea5;
    private final AdvancedModelRendererExtended Tentacleb5;
    private final AdvancedModelRendererExtended Tentaclea10;
    private final AdvancedModelRendererExtended Tentacleb10;
    private final AdvancedModelRendererExtended Shellbase;

    public ModelSpiroceras() {
        this.textureWidth = 64;
        this.textureHeight = 64;

        this.root = new AdvancedModelRendererExtended(this);
        this.root.setRotationPoint(0.0F, 0.0F, 0.0F);


        this.Shell1 = new AdvancedModelRendererExtended(this);
        this.Shell1.setRotationPoint(0.0F, 20.5F, 0.0F);
        this.root.addChild(Shell1);
        this.setRotateAngle(Shell1, 0.1792F, 0.0F, 0.0F);


        this.Shell2 = new AdvancedModelRendererExtended(this);
        this.Shell2.setRotationPoint(-0.01F, 0.2F, 2.5F);
        this.Shell1.addChild(Shell2);
        this.setRotateAngle(Shell2, -0.3136F, 0.0F, 0.0F);
        this.Shell2.cubeList.add(new ModelBox(Shell2, 0, 0, -1.99F, -2.5F, -8.0F, 4, 4, 8, 0.01F, false));
        this.Shell2.cubeList.add(new ModelBox(Shell2, 16, 4, -1.99F, 0.85F, -8.0F, 4, 1, 8, 0.0F, false));

        this.Shell3 = new AdvancedModelRendererExtended(this);
        this.Shell3.setRotationPoint(0.01F, 0.65F, -6.9F);
        this.Shell2.addChild(Shell3);
        this.setRotateAngle(Shell3, -0.5236F, 0.0F, 0.0F);
        this.Shell3.cubeList.add(new ModelBox(Shell3, 0, 12, -2.0F, -3.0F, -8.0F, 4, 4, 8, 0.0F, false));

        this.Shell4 = new AdvancedModelRendererExtended(this);
        this.Shell4.setRotationPoint(0.0F, -1.64F, -7.41F);
        this.Shell3.addChild(Shell4);
        this.setRotateAngle(Shell4, -0.8915F, 0.0F, 0.0F);
        this.Shell4.cubeList.add(new ModelBox(Shell4, 15, 15, -1.5F, -1.0F, -7.5F, 3, 3, 9, 0.01F, false));

        this.Shell5 = new AdvancedModelRendererExtended(this);
        this.Shell5.setRotationPoint(-0.01F, 1.02F, -7.25F);
        this.Shell4.addChild(Shell5);
        this.setRotateAngle(Shell5, -0.8927F, 0.0F, 0.0F);
        this.Shell5.cubeList.add(new ModelBox(Shell5, 16, 27, -1.49F, -1.25F, -6.5F, 3, 2, 7, 0.0F, false));

        this.Shell6 = new AdvancedModelRendererExtended(this);
        this.Shell6.setRotationPoint(0.0F, -0.05F, -5.75F);
        this.Shell5.addChild(Shell6);
        this.setRotateAngle(Shell6, -0.6569F, 0.0F, 0.0F);
        this.Shell6.cubeList.add(new ModelBox(Shell6, 30, 13, -0.99F, -1.0F, -6.0F, 2, 2, 6, 0.0F, false));

        this.Shell7 = new AdvancedModelRendererExtended(this);
        this.Shell7.setRotationPoint(0.01F, 0.2F, -5.8F);
        this.Shell6.addChild(Shell7);
        this.setRotateAngle(Shell7, -0.4753F, 0.0F, 0.0F);
        this.Shell7.cubeList.add(new ModelBox(Shell7, 40, 13, -1.0F, -1.25F, -3.8F, 2, 2, 4, -0.01F, false));

        this.Shell8 = new AdvancedModelRendererExtended(this);
        this.Shell8.setRotationPoint(0.0F, -0.55F, -3.15F);
        this.Shell7.addChild(Shell8);
        this.setRotateAngle(Shell8, -0.7063F, 0.0F, 0.0F);
        this.Shell8.cubeList.add(new ModelBox(Shell8, 31, 40, -0.5F, 0.0F, -5.1F, 1, 1, 5, 0.01F, false));

        this.Shell9 = new AdvancedModelRendererExtended(this);
        this.Shell9.setRotationPoint(-0.01F, -1.15F, -3.25F);
        this.Shell8.addChild(Shell9);
        this.setRotateAngle(Shell9, -0.6828F, 0.0F, 0.0F);
        this.Shell9.cubeList.add(new ModelBox(Shell9, 0, 19, 0.01F, -6.25F, -7.85F, 0, 9, 8, 0.0F, false));

        this.Mantle = new AdvancedModelRendererExtended(this);
        this.Mantle.setRotationPoint(0.0F, -2.5F, 1.6F);
        this.Shell1.addChild(Mantle);
        this.setRotateAngle(Mantle, -0.2536F, 0.0F, 0.0F);
        this.Mantle.cubeList.add(new ModelBox(Mantle, 29, 27, -1.5F, 0.0F, 1.0F, 3, 4, 3, 0.0F, false));
        this.Mantle.cubeList.add(new ModelBox(Mantle, 0, 0, -1.65F, -0.5F, 2.05F, 1, 1, 2, 0.0F, false));
        this.Mantle.cubeList.add(new ModelBox(Mantle, 0, 0, 0.65F, -0.5F, 2.05F, 1, 1, 2, 0.0F, true));

        this.Siphon = new AdvancedModelRendererExtended(this);
        this.Siphon.setRotationPoint(0.0F, 2.45F, 0.0F);
        this.Mantle.addChild(Siphon);
        this.setRotateAngle(Siphon, -0.3409F, 0.0F, 0.0F);
        this.Siphon.cubeList.add(new ModelBox(Siphon, 40, 7, -0.5F, 0.25F, 0.0F, 1, 1, 5, 0.0F, false));

        this.Tentaclea = new AdvancedModelRendererExtended(this);
        this.Tentaclea.setRotationPoint(-0.9F, 3.0F, 3.5F);
        this.Mantle.addChild(Tentaclea);
        this.setRotateAngle(Tentaclea, -0.7854F, -0.0873F, 0.0F);
        this.Tentaclea.cubeList.add(new ModelBox(Tentaclea, 38, 35, -0.5F, -0.5F, 0.0F, 1, 1, 5, 0.0F, false));

        this.Tentacleb = new AdvancedModelRendererExtended(this);
        this.Tentacleb.setRotationPoint(0.0F, 0.0F, 4.5F);
        this.Tentaclea.addChild(Tentacleb);
        this.setRotateAngle(Tentacleb, -0.2335F, 0.1061F, 0.0F);
        this.Tentacleb.cubeList.add(new ModelBox(Tentacleb, 39, 1, -0.5F, -0.5F, 0.0F, 1, 1, 5, 0.0F, false));

        this.Tentaclea6 = new AdvancedModelRendererExtended(this);
        this.Tentaclea6.setRotationPoint(0.9F, 3.0F, 3.5F);
        this.Mantle.addChild(Tentaclea6);
        this.setRotateAngle(Tentaclea6, -0.7854F, 0.0873F, 0.0F);
        this.Tentaclea6.cubeList.add(new ModelBox(Tentaclea6, 38, 35, -0.5F, -0.5F, 0.0F, 1, 1, 5, 0.0F, true));

        this.Tentacleb6 = new AdvancedModelRendererExtended(this);
        this.Tentacleb6.setRotationPoint(0.0F, 0.0F, 4.5F);
        this.Tentaclea6.addChild(Tentacleb6);
        this.setRotateAngle(Tentacleb6, -0.2335F, -0.1061F, 0.0F);
        this.Tentacleb6.cubeList.add(new ModelBox(Tentacleb6, 39, 1, -0.5F, -0.5F, 0.0F, 1, 1, 5, 0.0F, true));

        this.Tentaclea2 = new AdvancedModelRendererExtended(this);
        this.Tentaclea2.setRotationPoint(-1.05F, 2.4F, 3.5F);
        this.Mantle.addChild(Tentaclea2);
        this.setRotateAngle(Tentaclea2, -0.6793F, -0.3054F, 0.0F);
        this.Tentaclea2.cubeList.add(new ModelBox(Tentaclea2, 38, 22, -0.5F, -0.5F, 0.0F, 1, 1, 5, 0.0F, false));

        this.Tentacleb2 = new AdvancedModelRendererExtended(this);
        this.Tentacleb2.setRotationPoint(0.0F, 0.0F, 4.5F);
        this.Tentaclea2.addChild(Tentacleb2);
        this.setRotateAngle(Tentacleb2, -0.3183F, 0.3609F, 0.0F);
        this.Tentacleb2.cubeList.add(new ModelBox(Tentacleb2, 38, 29, -0.5F, -0.5F, 0.0F, 1, 1, 5, 0.0F, false));

        this.Tentaclea7 = new AdvancedModelRendererExtended(this);
        this.Tentaclea7.setRotationPoint(1.05F, 2.4F, 3.5F);
        this.Mantle.addChild(Tentaclea7);
        this.setRotateAngle(Tentaclea7, -0.6793F, 0.3054F, 0.0F);
        this.Tentaclea7.cubeList.add(new ModelBox(Tentaclea7, 38, 22, -0.5F, -0.5F, 0.0F, 1, 1, 5, 0.0F, true));

        this.Tentacleb7 = new AdvancedModelRendererExtended(this);
        this.Tentacleb7.setRotationPoint(0.0F, 0.0F, 4.5F);
        this.Tentaclea7.addChild(Tentacleb7);
        this.setRotateAngle(Tentacleb7, -0.3183F, -0.3609F, 0.0F);
        this.Tentacleb7.cubeList.add(new ModelBox(Tentacleb7, 38, 29, -0.5F, -0.5F, 0.0F, 1, 1, 5, 0.0F, true));

        this.Tentaclea3 = new AdvancedModelRendererExtended(this);
        this.Tentaclea3.setRotationPoint(-1.05F, 1.7F, 3.5F);
        this.Mantle.addChild(Tentaclea3);
        this.setRotateAngle(Tentaclea3, -0.6156F, -0.1745F, 0.0F);
        this.Tentaclea3.cubeList.add(new ModelBox(Tentaclea3, 12, 36, -0.5F, -0.5F, 0.0F, 1, 1, 5, 0.0F, false));

        this.Tentacleb3 = new AdvancedModelRendererExtended(this);
        this.Tentacleb3.setRotationPoint(0.0F, 0.0F, 4.5F);
        this.Tentaclea3.addChild(Tentacleb3);
        this.setRotateAngle(Tentacleb3, -0.2759F, 0.1698F, 0.0F);
        this.Tentacleb3.cubeList.add(new ModelBox(Tentacleb3, 24, 36, -0.5F, -0.5F, 0.0F, 1, 1, 5, 0.0F, false));

        this.Tentaclea8 = new AdvancedModelRendererExtended(this);
        this.Tentaclea8.setRotationPoint(1.05F, 1.7F, 3.5F);
        this.Mantle.addChild(Tentaclea8);
        this.setRotateAngle(Tentaclea8, -0.6156F, 0.1745F, 0.0F);
        this.Tentaclea8.cubeList.add(new ModelBox(Tentaclea8, 12, 36, -0.5F, -0.5F, 0.0F, 1, 1, 5, 0.0F, true));

        this.Tentacleb8 = new AdvancedModelRendererExtended(this);
        this.Tentacleb8.setRotationPoint(0.0F, 0.0F, 4.5F);
        this.Tentaclea8.addChild(Tentacleb8);
        this.setRotateAngle(Tentacleb8, -0.2759F, -0.1698F, 0.0F);
        this.Tentacleb8.cubeList.add(new ModelBox(Tentacleb8, 24, 36, -0.5F, -0.5F, 0.0F, 1, 1, 5, 0.0F, true));

        this.Tentaclea4 = new AdvancedModelRendererExtended(this);
        this.Tentaclea4.setRotationPoint(-0.95F, 1.3F, 3.5F);
        this.Mantle.addChild(Tentaclea4);
        this.setRotateAngle(Tentaclea4, -0.5095F, -0.0436F, 0.0F);
        this.Tentaclea4.cubeList.add(new ModelBox(Tentaclea4, 31, 34, -0.5F, -0.5F, 0.0F, 1, 1, 5, 0.0F, false));

        this.Tentacleb4 = new AdvancedModelRendererExtended(this);
        this.Tentacleb4.setRotationPoint(0.0F, 0.0F, 4.5F);
        this.Tentaclea4.addChild(Tentacleb4);
        this.setRotateAngle(Tentacleb4, -0.2972F, -0.0637F, 0.0F);
        this.Tentacleb4.cubeList.add(new ModelBox(Tentacleb4, 0, 36, -0.5F, -0.5F, 0.0F, 1, 1, 5, 0.0F, false));

        this.Tentaclea9 = new AdvancedModelRendererExtended(this);
        this.Tentaclea9.setRotationPoint(0.95F, 1.3F, 3.5F);
        this.Mantle.addChild(Tentaclea9);
        this.setRotateAngle(Tentaclea9, -0.5095F, 0.0436F, 0.0F);
        this.Tentaclea9.cubeList.add(new ModelBox(Tentaclea9, 31, 34, -0.5F, -0.5F, 0.0F, 1, 1, 5, 0.0F, true));

        this.Tentacleb9 = new AdvancedModelRendererExtended(this);
        this.Tentacleb9.setRotationPoint(0.0F, 0.0F, 4.5F);
        this.Tentaclea9.addChild(Tentacleb9);
        this.setRotateAngle(Tentacleb9, -0.2972F, 0.0637F, 0.0F);
        this.Tentacleb9.cubeList.add(new ModelBox(Tentacleb9, 0, 36, -0.5F, -0.5F, 0.0F, 1, 1, 5, 0.0F, true));

        this.Tentaclea5 = new AdvancedModelRendererExtended(this);
        this.Tentaclea5.setRotationPoint(-0.7F, 0.9F, 3.5F);
        this.Mantle.addChild(Tentaclea5);
        this.setRotateAngle(Tentaclea5, -0.4671F, 0.0F, 0.0F);
        this.Tentaclea5.cubeList.add(new ModelBox(Tentaclea5, 32, 0, -0.5F, -0.5F, 0.0F, 1, 1, 5, 0.0F, false));

        this.Tentacleb5 = new AdvancedModelRendererExtended(this);
        this.Tentacleb5.setRotationPoint(0.0F, 0.0F, 4.5F);
        this.Tentaclea5.addChild(Tentacleb5);
        this.setRotateAngle(Tentacleb5, -0.2546F, -0.1061F, 0.0F);
        this.Tentacleb5.cubeList.add(new ModelBox(Tentacleb5, 32, 6, -0.5F, -0.5F, 0.0F, 1, 1, 5, 0.0F, false));

        this.Tentaclea10 = new AdvancedModelRendererExtended(this);
        this.Tentaclea10.setRotationPoint(0.7F, 0.9F, 3.5F);
        this.Mantle.addChild(Tentaclea10);
        this.setRotateAngle(Tentaclea10, -0.4671F, 0.0F, 0.0F);
        this.Tentaclea10.cubeList.add(new ModelBox(Tentaclea10, 32, 0, -0.5F, -0.5F, 0.0F, 1, 1, 5, 0.0F, true));

        this.Tentacleb10 = new AdvancedModelRendererExtended(this);
        this.Tentacleb10.setRotationPoint(0.0F, 0.0F, 4.5F);
        this.Tentaclea10.addChild(Tentacleb10);
        this.setRotateAngle(Tentacleb10, -0.2546F, 0.1061F, 0.0F);
        this.Tentacleb10.cubeList.add(new ModelBox(Tentacleb10, 32, 6, -0.5F, -0.5F, 0.0F, 1, 1, 5, 0.0F, true));

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

        AdvancedModelRendererExtended[] tentacle1 = {this.Tentaclea, this.Tentacleb};
        AdvancedModelRendererExtended[] tentacle2 = {this.Tentaclea2, this.Tentacleb2};
        AdvancedModelRendererExtended[] tentacle3 = {this.Tentaclea3, this.Tentacleb3};
        AdvancedModelRendererExtended[] tentacle4 = {this.Tentaclea4, this.Tentacleb4};
        AdvancedModelRendererExtended[] tentacle5 = {this.Tentaclea5, this.Tentacleb5};
        AdvancedModelRendererExtended[] tentacle6 = {this.Tentaclea6, this.Tentacleb6};
        AdvancedModelRendererExtended[] tentacle7 = {this.Tentaclea7, this.Tentacleb7};
        AdvancedModelRendererExtended[] tentacle8 = {this.Tentaclea8, this.Tentacleb8};
        AdvancedModelRendererExtended[] tentacle9 = {this.Tentaclea9, this.Tentacleb9};
        AdvancedModelRendererExtended[] tentacle10 = {this.Tentaclea10, this.Tentacleb10};

        float speed = 0.2F;
        if (!e.isInWater()) {
            speed = 0.5F;
        }

        //Left:
        this.chainWave(tentacle8, speed, 0.3F, -2, f2, 1F);
        //Left lower middle:
        this.chainWave(tentacle7, speed, 0.3F, -2, f2, 1F);
        //Left lower bottom:
        this.chainWave(tentacle6, speed, 0.3F, -2, f2, 1F);
        //Left upper middle:
        this.chainWave(tentacle9, speed, 0.3F, -2, f2, 1F);
        //Left upper top:
        this.chainWave(tentacle10, speed, 0.3F, -2, f2, 1F);

        //Right:
        this.chainWave(tentacle3, speed, 0.3F, -2, f2, 1F);
        //Right lower middle:
        this.chainWave(tentacle2, speed, 0.3F, -2, f2, 1F);
        //Right lower bottom:
        this.chainWave(tentacle1, speed, 0.3F, -2, f2, 1F);
        //Right upper middle:
        this.chainWave(tentacle4, speed, 0.3F, -2, f2, 1F);
        //Right upper top:
        this.chainWave(tentacle5, speed, 0.3F, -2, f2, 1F);

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
