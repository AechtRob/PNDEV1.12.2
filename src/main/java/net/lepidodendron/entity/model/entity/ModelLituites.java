package net.lepidodendron.entity.model.entity;

import net.lepidodendron.entity.model.llibraryextensions.AdvancedModelBaseExtended;
import net.lepidodendron.entity.model.llibraryextensions.AdvancedModelRendererExtended;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

public class ModelLituites extends AdvancedModelBaseExtended {
    private final AdvancedModelRendererExtended body;
    private final AdvancedModelRendererExtended cube_r1;
    private final AdvancedModelRendererExtended cube_r2;
    private final AdvancedModelRendererExtended shelldontmove;
    private final AdvancedModelRendererExtended cube_r3;
    private final AdvancedModelRendererExtended bone2;
    private final AdvancedModelRendererExtended bone;
    private final AdvancedModelRendererExtended cube_r4;
    private final AdvancedModelRendererExtended cube_r5;
    private final AdvancedModelRendererExtended cube_r6;
    private final AdvancedModelRendererExtended cube_r7;
    private final AdvancedModelRendererExtended bone3;
    private final AdvancedModelRendererExtended cube_r8;
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

    public ModelLituites() {
        this.textureWidth = 128;
        this.textureHeight = 128;

        this.body = new AdvancedModelRendererExtended(this);
        this.body.setRotationPoint(0.0F, 24.0F, 0.0F);
        this.body.cubeList.add(new ModelBox(body, 0, 7, -3.4F, -5.25F, 0.5F, 1, 2, 2, 0.0F, false));
        this.body.cubeList.add(new ModelBox(body, 36, 15, -3.0F, -6.25F, -2.0F, 6, 6, 6, 0.0F, false));
        this.body.cubeList.add(new ModelBox(body, 0, 0, -3.5F, -7.25F, 4.0F, 7, 7, 14, 0.0F, false));
        this.body.cubeList.add(new ModelBox(body, 0, 21, -3.0F, -6.75F, 18.0F, 6, 6, 12, 0.0F, false));
        this.body.cubeList.add(new ModelBox(body, 46, 34, -3.5F, -1.2F, 2.0F, 7, 1, 2, 0.0F, false));
        this.body.cubeList.add(new ModelBox(body, 24, 29, -2.5F, -7.25F, -2.0F, 5, 1, 1, 0.0F, false));
        this.body.cubeList.add(new ModelBox(body, 22, 44, -3.0F, -7.25F, -1.0F, 6, 1, 5, 0.0F, false));
        this.body.cubeList.add(new ModelBox(body, 8, 0, 2.4F, -5.25F, 0.5F, 1, 2, 2, 0.0F, false));
        this.body.cubeList.add(new ModelBox(body, 8, 9, 2.425F, -4.75F, 1.0F, 1, 1, 1, 0.0F, false));
        this.body.cubeList.add(new ModelBox(body, 8, 7, 2.41F, -4.24F, 1.01F, 1, 1, 1, 0.0F, false));
        this.body.cubeList.add(new ModelBox(body, 1, 3, -3.425F, -4.75F, 1.0F, 1, 1, 1, 0.0F, false));
        this.body.cubeList.add(new ModelBox(body, 8, 4, -3.41F, -4.24F, 1.01F, 1, 1, 1, 0.0F, false));
        this.body.cubeList.add(new ModelBox(body, 0, 0, -0.5F, -7.251F, -1.0F, 1, 0, 3, 0.0F, false));

        this.cube_r1 = new AdvancedModelRendererExtended(this);
        this.cube_r1.setRotationPoint(0.0F, -0.5F, 2.0F);
        this.body.addChild(cube_r1);
        this.setRotateAngle(cube_r1, 0.2182F, 0.0F, 0.0F);
        this.cube_r1.cubeList.add(new ModelBox(cube_r1, 54, 0, -1.0F, -0.7F, -4.0F, 2, 1, 5, 0.0F, false));

        this.cube_r2 = new AdvancedModelRendererExtended(this);
        this.cube_r2.setRotationPoint(0.0F, -2.45F, 2.0F);
        this.body.addChild(cube_r2);
        this.setRotateAngle(cube_r2, -0.5236F, 0.0F, 0.0F);
        this.cube_r2.cubeList.add(new ModelBox(cube_r2, 44, 44, -3.5F, -2.925F, 0.6F, 7, 4, 2, 0.01F, false));

        this.shelldontmove = new AdvancedModelRendererExtended(this);
        this.shelldontmove.setRotationPoint(0.0F, -1.75F, 30.0F);
        this.body.addChild(shelldontmove);
        this.setRotateAngle(shelldontmove, 0.0436F, 0.0F, 0.0F);
        this.shelldontmove.cubeList.add(new ModelBox(shelldontmove, 26, 29, -2.5F, -4.5F, -0.05F, 5, 5, 10, 0.0F, false));

        this.cube_r3 = new AdvancedModelRendererExtended(this);
        this.cube_r3.setRotationPoint(0.0F, -4.5F, 10.0F);
        this.shelldontmove.addChild(cube_r3);
        this.setRotateAngle(cube_r3, 0.0436F, 0.0F, 0.0F);
        this.cube_r3.cubeList.add(new ModelBox(cube_r3, 28, 0, -2.0F, 0.5F, -1.0F, 4, 4, 10, 0.01F, false));

        this.bone2 = new AdvancedModelRendererExtended(this);
        this.bone2.setRotationPoint(0.0F, 0.55F, 17.0F);
        this.shelldontmove.addChild(bone2);
        this.setRotateAngle(bone2, 0.1309F, 0.0F, 0.0F);
        this.bone2.cubeList.add(new ModelBox(bone2, 0, 39, -1.5F, -4.0F, 0.0F, 3, 3, 8, 0.01F, false));

        this.bone = new AdvancedModelRendererExtended(this);
        this.bone.setRotationPoint(0.0F, -0.525F, 8.0833F);
        this.bone2.addChild(bone);
        this.setRotateAngle(bone, 0.3927F, 0.0F, 0.0F);


        this.cube_r4 = new AdvancedModelRendererExtended(this);
        this.cube_r4.setRotationPoint(0.0F, -3.0F, 0.9167F);
        this.bone.addChild(cube_r4);
        this.setRotateAngle(cube_r4, -0.0873F, 0.0F, 0.0F);
        this.cube_r4.cubeList.add(new ModelBox(cube_r4, 24, 21, -1.5F, 0.0F, -1.0F, 3, 2, 6, 0.0F, false));

        this.cube_r5 = new AdvancedModelRendererExtended(this);
        this.cube_r5.setRotationPoint(0.0F, -6.0F, 8.9167F);
        this.bone.addChild(cube_r5);
        this.setRotateAngle(cube_r5, 2.5307F, 0.0F, 0.0F);
        this.cube_r5.cubeList.add(new ModelBox(cube_r5, 28, 0, -0.5F, -0.9429F, 0.098F, 1, 1, 4, -0.01F, false));

        this.cube_r6 = new AdvancedModelRendererExtended(this);
        this.cube_r6.setRotationPoint(0.0F, -3.0F, 8.9167F);
        this.bone.addChild(cube_r6);
        this.setRotateAngle(cube_r6, 1.5708F, 0.0F, 0.0F);
        this.cube_r6.cubeList.add(new ModelBox(cube_r6, 28, 5, -0.5F, -1.0429F, 0.098F, 1, 1, 3, 0.0F, false));

        this.cube_r7 = new AdvancedModelRendererExtended(this);
        this.cube_r7.setRotationPoint(0.0F, -0.5F, 5.9167F);
        this.bone.addChild(cube_r7);
        this.setRotateAngle(cube_r7, 0.6109F, 0.0F, 0.0F);
        this.cube_r7.cubeList.add(new ModelBox(cube_r7, 24, 57, -1.0F, -2.175F, -0.1F, 2, 2, 4, 0.0F, false));

        this.bone3 = new AdvancedModelRendererExtended(this);
        this.bone3.setRotationPoint(0.0F, -8.5F, 5.6667F);
        this.bone.addChild(bone3);
        this.setRotateAngle(bone3, -0.0175F, 0.0F, 0.0F);


        this.cube_r8 = new AdvancedModelRendererExtended(this);
        this.cube_r8.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.bone3.addChild(cube_r8);
        this.setRotateAngle(cube_r8, -2.6616F, 0.0F, 0.0F);
        this.cube_r8.cubeList.add(new ModelBox(cube_r8, 0, 16, 0.0F, -5.0462F, 0.1014F, 0, 5, 5, 0.0F, false));
        this.cube_r8.cubeList.add(new ModelBox(cube_r8, 0, 0, 0.0F, -5.0462F, -0.8986F, 0, 3, 1, 0.0F, false));

        this.arm1 = new AdvancedModelRendererExtended(this);
        this.arm1.setRotationPoint(0.75F, -5.6F, -1.75F);
        this.body.addChild(arm1);
        this.arm1.cubeList.add(new ModelBox(arm1, 50, 51, -0.5F, -0.5F, -6.0F, 1, 1, 6, 0.0F, false));

        this.armb1 = new AdvancedModelRendererExtended(this);
        this.armb1.setRotationPoint(0.0F, 0.0F, -6.0F);
        this.arm1.addChild(armb1);
        this.armb1.cubeList.add(new ModelBox(armb1, 12, 57, -0.49F, -0.51F, -5.0F, 1, 1, 5, 0.0F, false));

        this.arm2 = new AdvancedModelRendererExtended(this);
        this.arm2.setRotationPoint(2.0F, -4.7F, -1.75F);
        this.body.addChild(arm2);
        this.arm2.cubeList.add(new ModelBox(arm2, 42, 50, -0.5F, -0.5F, -6.0F, 1, 1, 6, 0.0F, false));

        this.armb2 = new AdvancedModelRendererExtended(this);
        this.armb2.setRotationPoint(0.0F, 0.0F, -6.0F);
        this.arm2.addChild(armb2);
        this.armb2.cubeList.add(new ModelBox(armb2, 0, 57, -0.49F, -0.501F, -5.0F, 1, 1, 5, 0.0F, false));

        this.arm3 = new AdvancedModelRendererExtended(this);
        this.arm3.setRotationPoint(2.0F, -1.8F, -1.75F);
        this.body.addChild(arm3);
        this.arm3.cubeList.add(new ModelBox(arm3, 28, 50, -0.5F, -0.5F, -6.0F, 1, 1, 6, 0.0F, false));

        this.armb3 = new AdvancedModelRendererExtended(this);
        this.armb3.setRotationPoint(0.0F, 0.0F, -6.0F);
        this.arm3.addChild(armb3);
        this.armb3.cubeList.add(new ModelBox(armb3, 56, 37, -0.49F, -0.501F, -5.0F, 1, 1, 5, 0.0F, false));

        this.arm4 = new AdvancedModelRendererExtended(this);
        this.arm4.setRotationPoint(0.75F, -0.9F, -1.75F);
        this.body.addChild(arm4);
        this.arm4.cubeList.add(new ModelBox(arm4, 14, 50, -0.5F, -0.5F, -6.0F, 1, 1, 6, 0.0F, false));

        this.armb4 = new AdvancedModelRendererExtended(this);
        this.armb4.setRotationPoint(0.0F, 0.0F, -6.0F);
        this.arm4.addChild(armb4);
        this.armb4.cubeList.add(new ModelBox(armb4, 54, 27, -0.49F, -0.51F, -5.0F, 1, 1, 5, 0.0F, false));

        this.arm5 = new AdvancedModelRendererExtended(this);
        this.arm5.setRotationPoint(2.25F, -3.25F, -1.75F);
        this.body.addChild(arm5);
        this.arm5.cubeList.add(new ModelBox(arm5, 50, 8, -0.5F, -0.5F, -6.0F, 1, 1, 6, 0.0F, false));

        this.armb5 = new AdvancedModelRendererExtended(this);
        this.armb5.setRotationPoint(0.0F, 0.0F, -6.0F);
        this.arm5.addChild(armb5);
        this.armb5.cubeList.add(new ModelBox(armb5, 54, 15, -0.49F, -0.51F, -5.0F, 1, 1, 5, 0.0F, false));

        this.arm6 = new AdvancedModelRendererExtended(this);
        this.arm6.setRotationPoint(-0.75F, -5.6F, -1.75F);
        this.body.addChild(arm6);
        this.arm6.cubeList.add(new ModelBox(arm6, 0, 50, -0.5F, -0.5F, -6.0F, 1, 1, 6, 0.0F, false));

        this.armb6 = new AdvancedModelRendererExtended(this);
        this.armb6.setRotationPoint(0.0F, 0.0F, -6.0F);
        this.arm6.addChild(armb6);
        this.armb6.cubeList.add(new ModelBox(armb6, 36, 50, -0.51F, -0.51F, -5.0F, 1, 1, 5, 0.0F, false));

        this.arm7 = new AdvancedModelRendererExtended(this);
        this.arm7.setRotationPoint(-2.0F, -4.7F, -1.75F);
        this.body.addChild(arm7);
        this.arm7.cubeList.add(new ModelBox(arm7, 46, 27, -0.5F, -0.5F, -6.0F, 1, 1, 6, 0.0F, false));

        this.armb7 = new AdvancedModelRendererExtended(this);
        this.armb7.setRotationPoint(0.0F, 0.0F, -6.0F);
        this.arm7.addChild(armb7);
        this.armb7.cubeList.add(new ModelBox(armb7, 22, 50, -0.51F, -0.501F, -5.0F, 1, 1, 5, 0.0F, false));

        this.arm8 = new AdvancedModelRendererExtended(this);
        this.arm8.setRotationPoint(-2.0F, -1.8F, -1.75F);
        this.body.addChild(arm8);
        this.arm8.cubeList.add(new ModelBox(arm8, 46, 0, -0.5F, -0.5F, -6.0F, 1, 1, 6, 0.0F, false));

        this.armb8 = new AdvancedModelRendererExtended(this);
        this.armb8.setRotationPoint(0.0F, 0.0F, -6.0F);
        this.arm8.addChild(armb8);
        this.armb8.cubeList.add(new ModelBox(armb8, 8, 50, -0.51F, -0.501F, -5.0F, 1, 1, 5, 0.0F, false));

        this.arm9 = new AdvancedModelRendererExtended(this);
        this.arm9.setRotationPoint(-0.75F, -0.9F, -1.75F);
        this.body.addChild(arm9);
        this.arm9.cubeList.add(new ModelBox(arm9, 0, 7, -0.5F, -0.5F, -6.0F, 1, 1, 6, 0.0F, false));

        this.armb9 = new AdvancedModelRendererExtended(this);
        this.armb9.setRotationPoint(0.0F, 0.0F, -6.0F);
        this.arm9.addChild(armb9);
        this.armb9.cubeList.add(new ModelBox(armb9, 14, 39, -0.51F, -0.51F, -5.0F, 1, 1, 5, 0.0F, false));

        this.arm10 = new AdvancedModelRendererExtended(this);
        this.arm10.setRotationPoint(-2.25F, -3.25F, -1.75F);
        this.body.addChild(arm10);
        this.arm10.cubeList.add(new ModelBox(arm10, 0, 0, -0.5F, -0.5F, -6.0F, 1, 1, 6, 0.0F, false));

        this.armb10 = new AdvancedModelRendererExtended(this);
        this.armb10.setRotationPoint(0.0F, 0.0F, -6.0F);
        this.arm10.addChild(armb10);
        this.armb10.cubeList.add(new ModelBox(armb10, 0, 26, -0.51F, -0.51F, -5.0F, 1, 1, 5, 0.0F, false));

        updateDefaultPose();
    }

    @Override
    public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        this.body.render(f5 * 0.21F);
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
        float offsetZ = 0.2F;

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
        this.chainSwing(tentacle5, speed, -0.18F, -2, f2, 1F);
        //Left lower middle:
        this.chainWave(tentacle3, speed, 0.18F, -1.5, f2, 1F);
        this.chainSwing(tentacle3, speed, -0.18F, -1.5, f2, 1F);
        //Left lower bottom:
        this.chainWave(tentacle4, speed, 0.2F, -2, f2, 1F);
        this.chainSwing(tentacle4, speed, -0.1F, -1.5, f2, 1F);
        //Left upper middle:
        this.chainWave(tentacle2, speed, -0.18F, -1.5, f2, 1F);
        this.chainSwing(tentacle2, speed, -0.18F, -1.5, f2, 1F);
        //Left upper top:
        this.chainWave(tentacle1, speed, -0.2F, -2, f2, 1F);
        this.chainSwing(tentacle1, speed, -0.1F, -1.5, f2, 1F);

        //Right:
        this.chainSwing(tentacle10, speed, 0.18F, -2, f2, 1F);
        //Right lower middle:
        this.chainWave(tentacle8, speed, 0.18F, -1.5, f2, 1F);
        this.chainSwing(tentacle8, speed, 0.18F, -1.5, f2, 1F);
        //Right lower bottom:
        this.chainWave(tentacle9, speed, 0.2F, -2, f2, 1F);
        this.chainSwing(tentacle9, speed, 0.1F, -1.5, f2, 1F);
        //Right upper middle:
        this.chainWave(tentacle7, speed, -0.18F, -1.5, f2, 1F);
        this.chainSwing(tentacle7, speed, 0.18F, -1.5, f2, 1F);
        //Right upper top:
        this.chainWave(tentacle6, speed, -0.2F, -2, f2, 1F);
        this.chainSwing(tentacle6, speed, 0.1F, -1.5, f2, 1F);

        if (e.isInWater()) {
            float bobSpeed = 0.1F;
            this.bob(body, bobSpeed, 0.8F, false, f2, 2);
            this.body.offsetZ = this.moveBoxExtended(speed, 0.125F, false, 3, f2, 1) + offsetZ;
        }
        else {
            this.body.rotateAngleZ = (float) Math.toRadians(90);
            this.body.offsetY = 1.15F;
            this.body.offsetZ = offsetZ;
        }

    }

}
