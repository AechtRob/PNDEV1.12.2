package net.lepidodendron.entity.model.entity;

import net.lepidodendron.entity.model.ModelBasePalaeopedia;
import net.lepidodendron.entity.model.llibraryextensions.AdvancedModelRendererExtended;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

public class ModelMooreoceras extends ModelBasePalaeopedia {
    private final AdvancedModelRendererExtended body;
    private final AdvancedModelRendererExtended cube_r1;
    private final AdvancedModelRendererExtended cube_r2;
    private final AdvancedModelRendererExtended arm1;
    private final AdvancedModelRendererExtended armb1;
    private final AdvancedModelRendererExtended arm2;
    private final AdvancedModelRendererExtended armb2;
    private final AdvancedModelRendererExtended arm3;
    private final AdvancedModelRendererExtended armb3;
    private final AdvancedModelRendererExtended arm4;
    private final AdvancedModelRendererExtended armb4;
    private final AdvancedModelRendererExtended arm5;
    private final AdvancedModelRendererExtended armb5;
    private final AdvancedModelRendererExtended arm6;
    private final AdvancedModelRendererExtended armb6;
    private final AdvancedModelRendererExtended arm7;
    private final AdvancedModelRendererExtended armb7;
    private final AdvancedModelRendererExtended arm8;
    private final AdvancedModelRendererExtended armb8;
    private final AdvancedModelRendererExtended arm9;
    private final AdvancedModelRendererExtended armb9;
    private final AdvancedModelRendererExtended arm10;
    private final AdvancedModelRendererExtended armb10;

    public ModelMooreoceras() {
        this.textureWidth = 64;
        this.textureHeight = 64;

        this.body = new AdvancedModelRendererExtended(this);
        this.body.setRotationPoint(0.0F, 24.0F, -2.0F);
        this.body.cubeList.add(new ModelBox(body, 0, 0, -3.4F, -5.25F, 0.5F, 1, 2, 2, 0.0F, false));
        this.body.cubeList.add(new ModelBox(body, 36, 15, -3.0F, -6.25F, -2.0F, 6, 6, 6, 0.0F, false));
        this.body.cubeList.add(new ModelBox(body, 0, 0, -3.5F, -7.25F, 4.0F, 7, 7, 14, 0.0F, false));
        this.body.cubeList.add(new ModelBox(body, 0, 21, -3.0F, -6.75F, 18.0F, 6, 6, 12, 0.0F, false));
        this.body.cubeList.add(new ModelBox(body, 26, 29, -2.5F, -6.25F, 30.0F, 5, 5, 10, 0.0F, false));
        this.body.cubeList.add(new ModelBox(body, 28, 0, -2.0F, -5.75F, 40.0F, 4, 4, 8, 0.0F, false));
        this.body.cubeList.add(new ModelBox(body, 16, 44, -1.5F, -5.25F, 48.0F, 3, 3, 6, 0.0F, false));
        this.body.cubeList.add(new ModelBox(body, 0, 21, -1.0F, -4.75F, 54.0F, 2, 2, 4, 0.0F, false));
        this.body.cubeList.add(new ModelBox(body, 8, 0, -0.5F, -4.25F, 58.0F, 1, 1, 2, 0.0F, false));
        this.body.cubeList.add(new ModelBox(body, 42, 12, -3.5F, -1.2F, 2.0F, 7, 1, 2, 0.0F, false));
        this.body.cubeList.add(new ModelBox(body, 24, 21, -2.5F, -7.25F, -2.0F, 5, 1, 1, 0.0F, false));
        this.body.cubeList.add(new ModelBox(body, 0, 39, -3.0F, -7.25F, -1.0F, 6, 1, 5, 0.0F, false));
        this.body.cubeList.add(new ModelBox(body, 0, 7, 2.4F, -5.25F, 0.5F, 1, 2, 2, 0.0F, false));
        this.body.cubeList.add(new ModelBox(body, 8, 9, 2.425F, -4.75F, 1.0F, 1, 1, 1, 0.0F, false));
        this.body.cubeList.add(new ModelBox(body, 8, 7, 2.41F, -4.24F, 1.01F, 1, 1, 1, 0.0F, false));
        this.body.cubeList.add(new ModelBox(body, 0, 4, -3.425F, -4.75F, 1.0F, 1, 1, 1, 0.0F, false));
        this.body.cubeList.add(new ModelBox(body, 8, 3, -3.41F, -4.24F, 1.01F, 1, 1, 1, 0.0F, false));
        this.body.cubeList.add(new ModelBox(body, 0, 45, -0.5F, -7.251F, -1.0F, 1, 0, 3, 0.0F, false));

        this.cube_r1 = new AdvancedModelRendererExtended(this);
        this.cube_r1.setRotationPoint(0.0F, -0.5F, 2.0F);
        this.body.addChild(cube_r1);
        this.setRotateAngle(cube_r1, 0.1745F, 0.0F, 0.0F);
        this.cube_r1.cubeList.add(new ModelBox(cube_r1, 0, 58, -1.0F, -0.7F, -4.25F, 2, 1, 5, 0.0F, false));

        this.cube_r2 = new AdvancedModelRendererExtended(this);
        this.cube_r2.setRotationPoint(0.0F, -2.45F, 2.0F);
        this.body.addChild(cube_r2);
        this.setRotateAngle(cube_r2, -0.5236F, 0.0F, 0.0F);
        this.cube_r2.cubeList.add(new ModelBox(cube_r2, 44, 0, -3.49F, -2.925F, 0.6F, 7, 4, 2, 0.0F, false));

        this.arm1 = new AdvancedModelRendererExtended(this);
        this.arm1.setRotationPoint(0.75F, -5.6F, -1.75F);
        this.body.addChild(arm1);
        this.setRotateAngle(arm1, -0.2618F, 0.0F, 0.0F);
        this.arm1.cubeList.add(new ModelBox(arm1, 0, 7, -0.5F, -0.5F, -6.0F, 1, 1, 6, 0.0F, false));

        this.armb1 = new AdvancedModelRendererExtended(this);
        this.armb1.setRotationPoint(0.0F, 0.0F, -6.0F);
        this.arm1.addChild(armb1);
        this.armb1.cubeList.add(new ModelBox(armb1, 0, 0, -0.49F, -0.51F, -6.0F, 1, 1, 6, 0.0F, false));

        this.arm2 = new AdvancedModelRendererExtended(this);
        this.arm2.setRotationPoint(2.0F, -4.7F, -1.75F);
        this.body.addChild(arm2);
        this.setRotateAngle(arm2, -0.1745F, -0.1745F, 0.0F);
        this.arm2.cubeList.add(new ModelBox(arm2, 0, 7, -0.5F, -0.5F, -6.0F, 1, 1, 6, 0.0F, false));

        this.armb2 = new AdvancedModelRendererExtended(this);
        this.armb2.setRotationPoint(0.0F, 0.0F, -6.0F);
        this.arm2.addChild(armb2);
        this.armb2.cubeList.add(new ModelBox(armb2, 0, 0, -0.49F, -0.501F, -6.0F, 1, 1, 6, 0.0F, false));

        this.arm3 = new AdvancedModelRendererExtended(this);
        this.arm3.setRotationPoint(2.0F, -1.8F, -1.75F);
        this.body.addChild(arm3);
        this.setRotateAngle(arm3, 0.1745F, -0.1745F, 0.0F);
        this.arm3.cubeList.add(new ModelBox(arm3, 0, 7, -0.5F, -0.5F, -6.0F, 1, 1, 6, 0.0F, false));

        this.armb3 = new AdvancedModelRendererExtended(this);
        this.armb3.setRotationPoint(0.0F, 0.0F, -6.0F);
        this.arm3.addChild(armb3);
        this.armb3.cubeList.add(new ModelBox(armb3, 0, 0, -0.49F, -0.501F, -6.0F, 1, 1, 6, 0.0F, false));

        this.arm4 = new AdvancedModelRendererExtended(this);
        this.arm4.setRotationPoint(0.75F, -0.9F, -1.75F);
        this.body.addChild(arm4);
        this.setRotateAngle(arm4, 0.2618F, 0.0F, 0.0F);
        this.arm4.cubeList.add(new ModelBox(arm4, 0, 7, -0.5F, -0.5F, -6.0F, 1, 1, 6, 0.0F, false));

        this.armb4 = new AdvancedModelRendererExtended(this);
        this.armb4.setRotationPoint(0.0F, 0.0F, -6.0F);
        this.arm4.addChild(armb4);
        this.armb4.cubeList.add(new ModelBox(armb4, 0, 0, -0.49F, -0.51F, -6.0F, 1, 1, 6, 0.0F, false));

        this.arm5 = new AdvancedModelRendererExtended(this);
        this.arm5.setRotationPoint(2.25F, -3.25F, -1.75F);
        this.body.addChild(arm5);
        this.setRotateAngle(arm5, 0.0F, -0.1309F, 0.0F);
        this.arm5.cubeList.add(new ModelBox(arm5, 0, 7, -0.5F, -0.5F, -6.0F, 1, 1, 6, 0.0F, false));

        this.armb5 = new AdvancedModelRendererExtended(this);
        this.armb5.setRotationPoint(0.0F, 0.0F, -6.0F);
        this.arm5.addChild(armb5);
        this.armb5.cubeList.add(new ModelBox(armb5, 0, 0, -0.49F, -0.51F, -6.0F, 1, 1, 6, 0.0F, false));

        this.arm6 = new AdvancedModelRendererExtended(this);
        this.arm6.setRotationPoint(-0.75F, -5.6F, -1.75F);
        this.body.addChild(arm6);
        this.setRotateAngle(arm6, -0.2618F, 0.0F, 0.0F);
        this.arm6.cubeList.add(new ModelBox(arm6, 0, 7, -0.5F, -0.5F, -6.0F, 1, 1, 6, 0.0F, true));

        this.armb6 = new AdvancedModelRendererExtended(this);
        this.armb6.setRotationPoint(0.0F, 0.0F, -6.0F);
        this.arm6.addChild(armb6);
        this.armb6.cubeList.add(new ModelBox(armb6, 0, 0, -0.51F, -0.51F, -6.0F, 1, 1, 6, 0.0F, true));

        this.arm7 = new AdvancedModelRendererExtended(this);
        this.arm7.setRotationPoint(-2.0F, -4.7F, -1.75F);
        this.body.addChild(arm7);
        this.setRotateAngle(arm7, -0.2182F, 0.1745F, 0.0F);
        this.arm7.cubeList.add(new ModelBox(arm7, 0, 7, -0.5F, -0.5F, -6.0F, 1, 1, 6, 0.0F, true));

        this.armb7 = new AdvancedModelRendererExtended(this);
        this.armb7.setRotationPoint(0.0F, 0.0F, -6.0F);
        this.arm7.addChild(armb7);
        this.armb7.cubeList.add(new ModelBox(armb7, 0, 0, -0.51F, -0.501F, -6.0F, 1, 1, 6, 0.0F, true));

        this.arm8 = new AdvancedModelRendererExtended(this);
        this.arm8.setRotationPoint(-2.0F, -1.8F, -1.75F);
        this.body.addChild(arm8);
        this.setRotateAngle(arm8, 0.1745F, 0.1745F, 0.0F);
        this.arm8.cubeList.add(new ModelBox(arm8, 0, 7, -0.5F, -0.5F, -6.0F, 1, 1, 6, 0.0F, true));

        this.armb8 = new AdvancedModelRendererExtended(this);
        this.armb8.setRotationPoint(0.0F, 0.0F, -6.0F);
        this.arm8.addChild(armb8);
        this.armb8.cubeList.add(new ModelBox(armb8, 0, 0, -0.51F, -0.501F, -6.0F, 1, 1, 6, 0.0F, true));

        this.arm9 = new AdvancedModelRendererExtended(this);
        this.arm9.setRotationPoint(-0.75F, -0.9F, -1.75F);
        this.body.addChild(arm9);
        this.setRotateAngle(arm9, 0.2618F, 0.0F, 0.0F);
        this.arm9.cubeList.add(new ModelBox(arm9, 0, 7, -0.5F, -0.5F, -6.0F, 1, 1, 6, 0.0F, true));

        this.armb9 = new AdvancedModelRendererExtended(this);
        this.armb9.setRotationPoint(0.0F, 0.0F, -6.0F);
        this.arm9.addChild(armb9);
        this.armb9.cubeList.add(new ModelBox(armb9, 0, 0, -0.51F, -0.51F, -6.0F, 1, 1, 6, 0.0F, true));

        this.arm10 = new AdvancedModelRendererExtended(this);
        this.arm10.setRotationPoint(-2.25F, -3.25F, -1.75F);
        this.body.addChild(arm10);
        this.setRotateAngle(arm10, 0.0F, 0.1309F, 0.0F);
        this.arm10.cubeList.add(new ModelBox(arm10, 0, 7, -0.5F, -0.5F, -6.0F, 1, 1, 6, 0.0F, true));

        this.armb10 = new AdvancedModelRendererExtended(this);
        this.armb10.setRotationPoint(0.0F, 0.0F, -6.0F);
        this.arm10.addChild(armb10);
        this.armb10.cubeList.add(new ModelBox(armb10, 0, 0, -0.51F, -0.51F, -6.0F, 1, 1, 6, 0.0F, true));

        updateDefaultPose();
    }

    @Override
    public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        this.body.render(f5 * 0.21F);
    }
    public void renderStaticWall(float f) {
        this.body.rotateAngleY = (float) Math.toRadians(90);
        this.body.offsetY = -0.23F;
        this.body.offsetX = -0.23F;
        this.body.offsetZ = -0.03F;
        this.body.render(0.01F);
        resetToDefaultPose();
    }
    public void renderStaticFloor(float f) {
        this.setRotateAngle(body, 0.1F, 0.0F, 0.0F);
        this.setRotateAngle(arm1, -0.2F, 0.0F, 0.0F);
        this.setRotateAngle(armb1, -0.2F, 0.0F, 0.0F);
        this.setRotateAngle(arm2, -0.2F, 0.0F, 0.4F);
        this.setRotateAngle(armb2, -0.2F, 0.0F, 0.0F);
        this.setRotateAngle(arm3, 0.2F, 0.0F, -0.4F);
        this.setRotateAngle(armb3, 0.2F, 0.0F, 0.0F);
        this.setRotateAngle(arm4, 0.2F, 0.0F, 0.0F);
        this.setRotateAngle(armb4, 0.2F, 0.0F, 0.0F);
        this.setRotateAngle(arm5, 0.2F, 0.F, -1.5F);
        this.setRotateAngle(armb5, 0.2F, 0.0F, 0.0F);
        this.setRotateAngle(arm6, -0.2F, 0.0F, 0.0F);
        this.setRotateAngle(armb6, -0.2F, 0.0F, 0.0F);
        this.setRotateAngle(arm7, -0.2F, 0.0F, -0.2F);
        this.setRotateAngle(armb7, -0.2F, 0.0F, 0.0F);
        this.setRotateAngle(arm8, 0.2F, 0.0F, 0.4F);
        this.setRotateAngle(armb8, 0.2F, 0.0F, 0.0F);
        this.setRotateAngle(arm9, 0.2F, 0.0F, 0.0F);
        this.setRotateAngle(armb9, 0.2F, 0.0F, 0.0F);
        this.setRotateAngle(arm10, 0.2F, 0.0F, 1.5F);
        this.setRotateAngle(armb10, 0.2F, 0.0F, 0.0F);
        this.body.offsetY = -0.028F;
        this.body.offsetZ = -0.2F;
        this.body.render(0.01F);
        resetToDefaultPose();
    }

    @Override
    public void renderStaticBook(float f) {

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
        this.body.offsetY = 1.1F;
        this.body.rotateAngleY = (float) Math.toRadians(180);
        //this.body.offsetZ = -1F;

        AdvancedModelRendererExtended[] tentacle1 = {this.arm1, this.armb1};
        AdvancedModelRendererExtended[] tentacle2 = {this.arm2, this.armb2};
        AdvancedModelRendererExtended[] tentacle3 = {this.arm3, this.armb3};
        AdvancedModelRendererExtended[] tentacle4 = {this.arm4, this.armb4};
        AdvancedModelRendererExtended[] tentacle5 = {this.arm5, this.armb5};
        AdvancedModelRendererExtended[] tentacle6 = {this.arm6, this.armb6};
        AdvancedModelRendererExtended[] tentacle7 = {this.arm7, this.armb7};
        AdvancedModelRendererExtended[] tentacle8 = {this.arm8, this.armb8};
        AdvancedModelRendererExtended[] tentacle9 = {this.arm9, this.armb9};
        AdvancedModelRendererExtended[] tentacle10 = {this.arm10, this.armb10};

        float speed = 0.10F;
        if (!e.isInWater()) {
            speed = 0.5F;
        }

        //Left:
        this.chainSwing(tentacle5, speed, -0.3F, -2, f2, 1F);
        //Left lower middle:
        this.chainWave(tentacle3, speed, 0.3F, -1.5, f2, 1F);
        this.chainSwing(tentacle3, speed, -0.3F, -1.5, f2, 1F);
        //Left lower bottom:
        this.chainWave(tentacle4, speed, 0.25F, -2, f2, 1F);
        this.chainSwing(tentacle4, speed, -0.1F, -1.5, f2, 1F);
        //Left upper middle:
        this.chainWave(tentacle2, speed, -0.3F, -1.5, f2, 1F);
        this.chainSwing(tentacle2, speed, -0.3F, -1.5, f2, 1F);
        //Left upper top:
        this.chainWave(tentacle1, speed, -0.25F, -2, f2, 1F);
        this.chainSwing(tentacle1, speed, -0.1F, -1.5, f2, 1F);

        //Right:
        this.chainSwing(tentacle10, speed, 0.3F, -2, f2, 1F);
        //Right lower middle:
        this.chainWave(tentacle8, speed, 0.3F, -1.5, f2, 1F);
        this.chainSwing(tentacle8, speed, 0.3F, -1.5, f2, 1F);
        //Right lower bottom:
        this.chainWave(tentacle9, speed, 0.25F, -2, f2, 1F);
        this.chainSwing(tentacle9, speed, 0.1F, -1.5, f2, 1F);
        //Right upper middle:
        this.chainWave(tentacle7, speed, -0.3F, -1.5, f2, 1F);
        this.chainSwing(tentacle7, speed, 0.3F, -1.5, f2, 1F);
        //Right upper top:
        this.chainWave(tentacle6, speed, -0.25F, -2, f2, 1F);
        this.chainSwing(tentacle6, speed, 0.1F, -1.5, f2, 1F);

        if (e.isInWater()) {
            float bobSpeed = 0.1F;
            this.bob(body, bobSpeed, 0.8F, false, f2, 2);
            this.body.offsetZ = this.moveBoxExtended(speed, 0.125F, false, 3, f2, 1);
        }
        else {
            this.body.rotateAngleZ = (float) Math.toRadians(90);
            this.body.offsetY = 1.15F;
        }

    }

}
