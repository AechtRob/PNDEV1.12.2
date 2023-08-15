package net.lepidodendron.entity.model.entity;

import net.lepidodendron.entity.model.llibraryextensions.AdvancedModelBaseExtended;
import net.lepidodendron.entity.model.llibraryextensions.AdvancedModelRendererExtended;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

public class ModelCenoceras extends AdvancedModelBaseExtended {
    private final AdvancedModelRendererExtended shell;
    private final AdvancedModelRendererExtended cube_r1;
    private final AdvancedModelRendererExtended hood;
    private final AdvancedModelRendererExtended cube_r2;
    private final AdvancedModelRendererExtended shell2;
    private final AdvancedModelRendererExtended shell3;
    private final AdvancedModelRendererExtended shell4;
    private final AdvancedModelRendererExtended shell5;
    private final AdvancedModelRendererExtended shell6;
    private final AdvancedModelRendererExtended shell7;
    private final AdvancedModelRendererExtended shell8;
    private final AdvancedModelRendererExtended body;
    private final AdvancedModelRendererExtended siphon;
    private final AdvancedModelRendererExtended eyeR;
    private final AdvancedModelRendererExtended eyeL;
    private final AdvancedModelRendererExtended cirrisR;
    private final AdvancedModelRendererExtended cirri;
    private final AdvancedModelRendererExtended cirria;
    private final AdvancedModelRendererExtended cirri2;
    private final AdvancedModelRendererExtended cirria2;
    private final AdvancedModelRendererExtended cirri3;
    private final AdvancedModelRendererExtended cirria3;
    private final AdvancedModelRendererExtended cirri4;
    private final AdvancedModelRendererExtended cirria4;
    private final AdvancedModelRendererExtended cirri5;
    private final AdvancedModelRendererExtended cirria5;
    private final AdvancedModelRendererExtended cirri6;
    private final AdvancedModelRendererExtended cirria6;
    private final AdvancedModelRendererExtended cirrisL;
    private final AdvancedModelRendererExtended cirri7;
    private final AdvancedModelRendererExtended cirria7;
    private final AdvancedModelRendererExtended cirri8;
    private final AdvancedModelRendererExtended cirria8;
    private final AdvancedModelRendererExtended cirri9;
    private final AdvancedModelRendererExtended cirria9;
    private final AdvancedModelRendererExtended cirri10;
    private final AdvancedModelRendererExtended cirria10;
    private final AdvancedModelRendererExtended cirri11;
    private final AdvancedModelRendererExtended cirria11;
    private final AdvancedModelRendererExtended cirri12;
    private final AdvancedModelRendererExtended cirria12;

    public ModelCenoceras() {
        this.textureWidth = 64;
        this.textureHeight = 64;

        this.shell = new AdvancedModelRendererExtended(this);
        this.shell.setRotationPoint(0.0F, 21.75F, 5.0F);
        this.setRotateAngle(shell, 0.2618F, 0.0F, 0.0F);
        this.shell.cubeList.add(new ModelBox(shell, 25, 10, -3.0F, -7.05F, -5.4F, 6, 8, 5, 0.0F, false));

        this.cube_r1 = new AdvancedModelRendererExtended(this);
        this.cube_r1.setRotationPoint(0.0F, -7.1F, -0.5F);
        this.shell.addChild(cube_r1);
        this.setRotateAngle(cube_r1, 0.2443F, 0.0F, 0.0F);
        this.cube_r1.cubeList.add(new ModelBox(cube_r1, 22, 39, -3.0F, -0.15F, -1.9F, 6, 8, 2, -0.01F, false));

        this.hood = new AdvancedModelRendererExtended(this);
        this.hood.setRotationPoint(0.0F, -7.0F, -0.5F);
        this.shell.addChild(hood);
        this.setRotateAngle(hood, -0.7418F, 0.0F, 0.0F);


        this.cube_r2 = new AdvancedModelRendererExtended(this);
        this.cube_r2.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.hood.addChild(cube_r2);
        this.setRotateAngle(cube_r2, -0.0873F, 0.0F, 0.0F);
        this.cube_r2.cubeList.add(new ModelBox(cube_r2, 0, 0, -2.5F, -3.5F, -2.35F, 5, 5, 10, 0.0F, false));

        this.shell2 = new AdvancedModelRendererExtended(this);
        this.shell2.setRotationPoint(0.0F, 0.95F, -5.4F);
        this.shell.addChild(shell2);
        this.setRotateAngle(shell2, -0.6109F, 0.0F, 0.0F);
        this.shell2.cubeList.add(new ModelBox(shell2, 0, 15, -3.0F, -8.0F, -6.0F, 6, 8, 6, 0.01F, false));

        this.shell3 = new AdvancedModelRendererExtended(this);
        this.shell3.setRotationPoint(0.0F, 0.0F, -6.0F);
        this.shell2.addChild(shell3);
        this.setRotateAngle(shell3, -0.7418F, 0.0F, 0.0F);
        this.shell3.cubeList.add(new ModelBox(shell3, 18, 23, -2.5F, -7.0F, -6.0F, 5, 7, 6, 0.0F, false));

        this.shell4 = new AdvancedModelRendererExtended(this);
        this.shell4.setRotationPoint(0.0F, 0.0F, -6.0F);
        this.shell3.addChild(shell4);
        this.setRotateAngle(shell4, -0.6545F, 0.0F, 0.0F);
        this.shell4.cubeList.add(new ModelBox(shell4, 0, 30, -2.5F, -6.0F, -6.0F, 5, 6, 6, 0.01F, false));

        this.shell5 = new AdvancedModelRendererExtended(this);
        this.shell5.setRotationPoint(0.0F, 0.0F, -6.0F);
        this.shell4.addChild(shell5);
        this.setRotateAngle(shell5, -0.9163F, 0.0F, 0.0F);
        this.shell5.cubeList.add(new ModelBox(shell5, 20, 0, -2.0F, -4.0F, -6.0F, 4, 4, 6, 0.0F, false));

        this.shell6 = new AdvancedModelRendererExtended(this);
        this.shell6.setRotationPoint(0.0F, 0.0F, -6.0F);
        this.shell5.addChild(shell6);
        this.setRotateAngle(shell6, -0.9599F, 0.0F, 0.0F);
        this.shell6.cubeList.add(new ModelBox(shell6, 35, 31, -2.0F, -3.0F, -5.0F, 4, 3, 5, 0.01F, false));

        this.shell7 = new AdvancedModelRendererExtended(this);
        this.shell7.setRotationPoint(0.0F, 0.0F, -5.0F);
        this.shell6.addChild(shell7);
        this.setRotateAngle(shell7, -0.9599F, 0.0F, 0.0F);
        this.shell7.cubeList.add(new ModelBox(shell7, 40, 23, -1.5F, -3.0F, -4.0F, 3, 3, 4, 0.0F, false));

        this.shell8 = new AdvancedModelRendererExtended(this);
        this.shell8.setRotationPoint(0.0F, 0.0F, -4.0F);
        this.shell7.addChild(shell8);
        this.setRotateAngle(shell8, -0.9163F, 0.0F, 0.0F);
        this.shell8.cubeList.add(new ModelBox(shell8, 40, 0, -1.0F, -5.0F, -4.0F, 2, 5, 4, 0.0F, false));

        this.body = new AdvancedModelRendererExtended(this);
        this.body.setRotationPoint(0.0F, 0.0F, 2.0F);
        this.shell.addChild(body);
        this.body.cubeList.add(new ModelBox(body, 38, 39, -2.0F, -6.75F, -3.25F, 4, 7, 3, 0.0F, false));

        this.siphon = new AdvancedModelRendererExtended(this);
        this.siphon.setRotationPoint(0.0F, -1.0F, -1.0F);
        this.body.addChild(siphon);
        this.setRotateAngle(siphon, -0.0873F, 0.0F, 0.0F);
        this.siphon.cubeList.add(new ModelBox(siphon, 0, 42, -1.0F, -0.75F, -0.25F, 2, 2, 4, 0.0F, false));

        this.eyeR = new AdvancedModelRendererExtended(this);
        this.eyeR.setRotationPoint(0.0F, -6.1F, -2.25F);
        this.body.addChild(eyeR);
        this.setRotateAngle(eyeR, -0.2182F, 0.0F, 0.0F);
        this.eyeR.cubeList.add(new ModelBox(eyeR, 0, 6, -2.6F, -1.0F, -0.25F, 1, 2, 2, 0.0F, false));
        this.eyeR.cubeList.add(new ModelBox(eyeR, 0, 2, -2.6F, 0.0F, 0.25F, 1, 1, 1, 0.01F, false));
        this.eyeR.cubeList.add(new ModelBox(eyeR, 0, 0, -2.6F, -0.5F, 0.25F, 1, 1, 1, 0.02F, false));

        this.eyeL = new AdvancedModelRendererExtended(this);
        this.eyeL.setRotationPoint(0.0F, -6.1F, -2.25F);
        this.body.addChild(eyeL);
        this.setRotateAngle(eyeL, -0.2182F, 0.0F, 0.0F);
        this.eyeL.cubeList.add(new ModelBox(eyeL, 0, 6, 1.6F, -1.0F, -0.25F, 1, 2, 2, 0.0F, true));
        this.eyeL.cubeList.add(new ModelBox(eyeL, 0, 2, 1.6F, 0.0F, 0.25F, 1, 1, 1, 0.01F, true));
        this.eyeL.cubeList.add(new ModelBox(eyeL, 0, 0, 1.6F, -0.5F, 0.25F, 1, 1, 1, 0.02F, true));

        this.cirrisR = new AdvancedModelRendererExtended(this);
        this.cirrisR.setRotationPoint(-1.25F, -5.75F, -0.25F);
        this.body.addChild(cirrisR);


        this.cirri = new AdvancedModelRendererExtended(this);
        this.cirri.setRotationPoint(-0.25F, 0.0F, 0.0F);
        this.cirrisR.addChild(cirri);
        this.setRotateAngle(cirri, -0.3491F, -0.1309F, 0.0F);
        this.cirri.cubeList.add(new ModelBox(cirri, 0, 0, -0.5F, -0.5F, -0.75F, 1, 1, 4, 0.0F, false));

        this.cirria = new AdvancedModelRendererExtended(this);
        this.cirria.setRotationPoint(0.0F, 0.0F, 3.25F);
        this.cirri.addChild(cirria);
        this.setRotateAngle(cirria, -0.2618F, 0.0F, 0.0F);
        this.cirria.cubeList.add(new ModelBox(cirria, 0, 0, 0.0F, -0.5F, -0.1F, 0, 1, 5, 0.0F, false));

        this.cirri2 = new AdvancedModelRendererExtended(this);
        this.cirri2.setRotationPoint(-0.25F, 1.0F, 0.0F);
        this.cirrisR.addChild(cirri2);
        this.setRotateAngle(cirri2, -0.3927F, -0.2182F, 0.0F);
        this.cirri2.cubeList.add(new ModelBox(cirri2, 0, 0, -0.5F, -0.5F, -0.75F, 1, 1, 4, 0.0F, false));

        this.cirria2 = new AdvancedModelRendererExtended(this);
        this.cirria2.setRotationPoint(0.0F, 0.0F, 3.25F);
        this.cirri2.addChild(cirria2);
        this.setRotateAngle(cirria2, -0.2618F, 0.0F, 0.0F);
        this.cirria2.cubeList.add(new ModelBox(cirria2, 0, 0, 0.0F, -0.5F, -0.1F, 0, 1, 5, 0.0F, false));

        this.cirri3 = new AdvancedModelRendererExtended(this);
        this.cirri3.setRotationPoint(-0.25F, 2.0F, 0.0F);
        this.cirrisR.addChild(cirri3);
        this.setRotateAngle(cirri3, -0.4363F, -0.3054F, 0.0F);
        this.cirri3.cubeList.add(new ModelBox(cirri3, 0, 0, -0.5F, -0.5F, -0.75F, 1, 1, 4, 0.0F, false));

        this.cirria3 = new AdvancedModelRendererExtended(this);
        this.cirria3.setRotationPoint(0.0F, 0.0F, 3.25F);
        this.cirri3.addChild(cirria3);
        this.setRotateAngle(cirria3, -0.2618F, 0.0F, 0.0F);
        this.cirria3.cubeList.add(new ModelBox(cirria3, 0, 0, 0.0F, -0.5F, -0.1F, 0, 1, 5, 0.0F, false));

        this.cirri4 = new AdvancedModelRendererExtended(this);
        this.cirri4.setRotationPoint(-0.25F, 3.0F, 0.0F);
        this.cirrisR.addChild(cirri4);
        this.setRotateAngle(cirri4, -0.48F, -0.3927F, 0.0F);
        this.cirri4.cubeList.add(new ModelBox(cirri4, 0, 0, -0.5F, -0.5F, -0.75F, 1, 1, 4, 0.0F, false));

        this.cirria4 = new AdvancedModelRendererExtended(this);
        this.cirria4.setRotationPoint(0.0F, 0.0F, 3.25F);
        this.cirri4.addChild(cirria4);
        this.setRotateAngle(cirria4, -0.2618F, 0.0F, 0.0F);
        this.cirria4.cubeList.add(new ModelBox(cirria4, 0, 0, 0.0F, -0.5F, -0.1F, 0, 1, 5, 0.0F, false));

        this.cirri5 = new AdvancedModelRendererExtended(this);
        this.cirri5.setRotationPoint(-0.25F, 4.0F, 0.0F);
        this.cirrisR.addChild(cirri5);
        this.setRotateAngle(cirri5, -0.5672F, -0.48F, 0.0F);
        this.cirri5.cubeList.add(new ModelBox(cirri5, 0, 0, -0.5F, -0.5F, -0.75F, 1, 1, 4, 0.0F, false));

        this.cirria5 = new AdvancedModelRendererExtended(this);
        this.cirria5.setRotationPoint(0.0F, 0.0F, 3.25F);
        this.cirri5.addChild(cirria5);
        this.setRotateAngle(cirria5, -0.2618F, 0.0F, 0.0F);
        this.cirria5.cubeList.add(new ModelBox(cirria5, 0, 0, 0.0F, -0.5F, -0.1F, 0, 1, 5, 0.0F, false));

        this.cirri6 = new AdvancedModelRendererExtended(this);
        this.cirri6.setRotationPoint(0.65F, -0.25F, 0.0F);
        this.cirrisR.addChild(cirri6);
        this.setRotateAngle(cirri6, -0.3491F, -0.0873F, 0.0F);
        this.cirri6.cubeList.add(new ModelBox(cirri6, 0, 0, -0.5F, -0.5F, -0.75F, 1, 1, 4, 0.0F, false));

        this.cirria6 = new AdvancedModelRendererExtended(this);
        this.cirria6.setRotationPoint(0.0F, 0.0F, 3.25F);
        this.cirri6.addChild(cirria6);
        this.setRotateAngle(cirria6, -0.2618F, 0.0F, 0.0F);
        this.cirria6.cubeList.add(new ModelBox(cirria6, 0, 0, 0.0F, -0.5F, -0.1F, 0, 1, 5, 0.0F, false));

        this.cirrisL = new AdvancedModelRendererExtended(this);
        this.cirrisL.setRotationPoint(1.25F, -5.75F, -0.25F);
        this.body.addChild(cirrisL);


        this.cirri7 = new AdvancedModelRendererExtended(this);
        this.cirri7.setRotationPoint(0.25F, 0.0F, 0.0F);
        this.cirrisL.addChild(cirri7);
        this.setRotateAngle(cirri7, -0.3491F, 0.1309F, 0.0F);
        this.cirri7.cubeList.add(new ModelBox(cirri7, 0, 0, -0.5F, -0.5F, -0.75F, 1, 1, 4, 0.0F, true));

        this.cirria7 = new AdvancedModelRendererExtended(this);
        this.cirria7.setRotationPoint(0.0F, 0.0F, 3.25F);
        this.cirri7.addChild(cirria7);
        this.setRotateAngle(cirria7, -0.2618F, 0.0F, 0.0F);
        this.cirria7.cubeList.add(new ModelBox(cirria7, 0, 0, 0.0F, -0.5F, -0.1F, 0, 1, 5, 0.0F, true));

        this.cirri8 = new AdvancedModelRendererExtended(this);
        this.cirri8.setRotationPoint(0.25F, 1.0F, 0.0F);
        this.cirrisL.addChild(cirri8);
        this.setRotateAngle(cirri8, -0.3927F, 0.2182F, 0.0F);
        this.cirri8.cubeList.add(new ModelBox(cirri8, 0, 0, -0.5F, -0.5F, -0.75F, 1, 1, 4, 0.0F, true));

        this.cirria8 = new AdvancedModelRendererExtended(this);
        this.cirria8.setRotationPoint(0.0F, 0.0F, 3.25F);
        this.cirri8.addChild(cirria8);
        this.setRotateAngle(cirria8, -0.2618F, 0.0F, 0.0F);
        this.cirria8.cubeList.add(new ModelBox(cirria8, 0, 0, 0.0F, -0.5F, -0.1F, 0, 1, 5, 0.0F, true));

        this.cirri9 = new AdvancedModelRendererExtended(this);
        this.cirri9.setRotationPoint(0.25F, 2.0F, 0.0F);
        this.cirrisL.addChild(cirri9);
        this.setRotateAngle(cirri9, -0.4363F, 0.3054F, 0.0F);
        this.cirri9.cubeList.add(new ModelBox(cirri9, 0, 0, -0.5F, -0.5F, -0.75F, 1, 1, 4, 0.0F, true));

        this.cirria9 = new AdvancedModelRendererExtended(this);
        this.cirria9.setRotationPoint(0.0F, 0.0F, 3.25F);
        this.cirri9.addChild(cirria9);
        this.setRotateAngle(cirria9, -0.2618F, 0.0F, 0.0F);
        this.cirria9.cubeList.add(new ModelBox(cirria9, 0, 0, 0.0F, -0.5F, -0.1F, 0, 1, 5, 0.0F, true));

        this.cirri10 = new AdvancedModelRendererExtended(this);
        this.cirri10.setRotationPoint(0.25F, 3.0F, 0.0F);
        this.cirrisL.addChild(cirri10);
        this.setRotateAngle(cirri10, -0.48F, 0.3927F, 0.0F);
        this.cirri10.cubeList.add(new ModelBox(cirri10, 0, 0, -0.5F, -0.5F, -0.75F, 1, 1, 4, 0.0F, true));

        this.cirria10 = new AdvancedModelRendererExtended(this);
        this.cirria10.setRotationPoint(0.0F, 0.0F, 3.25F);
        this.cirri10.addChild(cirria10);
        this.setRotateAngle(cirria10, -0.2618F, 0.0F, 0.0F);
        this.cirria10.cubeList.add(new ModelBox(cirria10, 0, 0, 0.0F, -0.5F, -0.1F, 0, 1, 5, 0.0F, true));

        this.cirri11 = new AdvancedModelRendererExtended(this);
        this.cirri11.setRotationPoint(0.25F, 4.0F, 0.0F);
        this.cirrisL.addChild(cirri11);
        this.setRotateAngle(cirri11, -0.5672F, 0.48F, 0.0F);
        this.cirri11.cubeList.add(new ModelBox(cirri11, 0, 0, -0.5F, -0.5F, -0.75F, 1, 1, 4, 0.0F, true));

        this.cirria11 = new AdvancedModelRendererExtended(this);
        this.cirria11.setRotationPoint(0.0F, 0.0F, 3.25F);
        this.cirri11.addChild(cirria11);
        this.setRotateAngle(cirria11, -0.2618F, 0.0F, 0.0F);
        this.cirria11.cubeList.add(new ModelBox(cirria11, 0, 0, 0.0F, -0.5F, -0.1F, 0, 1, 5, 0.0F, true));

        this.cirri12 = new AdvancedModelRendererExtended(this);
        this.cirri12.setRotationPoint(-0.65F, -0.25F, 0.0F);
        this.cirrisL.addChild(cirri12);
        this.setRotateAngle(cirri12, -0.3491F, 0.0873F, 0.0F);
        this.cirri12.cubeList.add(new ModelBox(cirri12, 0, 0, -0.5F, -0.5F, -0.75F, 1, 1, 4, 0.0F, true));

        this.cirria12 = new AdvancedModelRendererExtended(this);
        this.cirria12.setRotationPoint(0.0F, 0.0F, 3.25F);
        this.cirri12.addChild(cirria12);
        this.setRotateAngle(cirria12, -0.2618F, 0.0F, 0.0F);
        this.cirria12.cubeList.add(new ModelBox(cirria12, 0, 0, 0.0F, -0.5F, -0.1F, 0, 1, 5, 0.0F, true));

        //2

        updateDefaultPose();
    }

    @Override
    public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        this.shell.render(f5);
    }
    public void renderStaticFloor(float f) {
        this.shell.offsetY = -0.2F;
        this.shell.render(0.01F);
        resetToDefaultPose();
    }
    public void renderStaticSuspended(float f) {
        this.shell.offsetY = 0.1F;
        this.shell.render(0.01F);
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
        //left
        AdvancedModelRendererExtended[] tentacle1 = {this.cirri, this.cirria};
        AdvancedModelRendererExtended[] tentacle2 = {this.cirri2, this.cirria2};
        AdvancedModelRendererExtended[] tentacle3 = {this.cirri3, this.cirria3};
        AdvancedModelRendererExtended[] tentacle4 = {this.cirri4, this.cirria4};
        AdvancedModelRendererExtended[] tentacle5 = {this.cirri5, this.cirria5};
        AdvancedModelRendererExtended[] tentacle6 = {this.cirri6, this.cirria6};
        //right
        AdvancedModelRendererExtended[] tentacle7 = {this.cirri7, this.cirria7};
        AdvancedModelRendererExtended[] tentacle8 = {this.cirri8, this.cirria8};
        AdvancedModelRendererExtended[] tentacle9 = {this.cirri9, this.cirria9};
        AdvancedModelRendererExtended[] tentacle10 = {this.cirri10, this.cirria10};
        AdvancedModelRendererExtended[] tentacle11 = {this.cirri11, this.cirria11};
        AdvancedModelRendererExtended[] tentacle12 = {this.cirri12, this.cirria12};

        float speed = 0.2F;
        if (!e.isInWater()) {
            speed = 0.2F;
        }

        //Left:
        this.chainWave(tentacle1, speed, 0.3F, -2, f2, 1F);
        //Left lower middle:
        this.chainWave(tentacle2, speed, 0.3F, -2, f2, 1F);
        //Left lower bottom:
        this.chainWave(tentacle3, speed, 0.3F, -2, f2, 1F);
        //Left upper middle:
        this.chainWave(tentacle4, speed, 0.3F, -2, f2, 1F);
        //Left upper top:
        this.chainWave(tentacle5, speed, 0.3F, -2, f2, 1F);

        this.chainWave(tentacle6, speed, 0.3F, -2, f2, 1F);

        //Right:
        this.chainWave(tentacle7, speed, 0.3F, -2, f2, 1F);
        //Right lower middle:
        this.chainWave(tentacle8, speed, 0.3F, -2, f2, 1F);
        //Right lower bottom:
        this.chainWave(tentacle9, speed, 0.3F, -2, f2, 1F);
        //Right upper middle:
        this.chainWave(tentacle10, speed, 0.3F, -2, f2, 1F);
        //Right upper top:
        this.chainWave(tentacle11, speed, 0.3F, -2, f2, 1F);

        this.chainWave(tentacle12, speed, 0.3F, -2, f2, 1F);

        this.swing(cirrisR, (float) (speed), 0.20F, true, 0, 0, f2, 1);
        this.swing(cirrisL, (float) (speed), 0.20F, false, 0, 0, f2, 1);



        if (e.isInWater()) {
            this.bob(shell, 0.1F, 2.0F, false, f2, 2);
            this.shell.offsetZ = this.moveBoxExtended(speed, 0.40F, false, 3, f2, 1);
        }
        else {
            this.shell.rotateAngleZ = (float) Math.toRadians(90);
            this.shell.offsetY = 0.08F;
        }

    }

}
