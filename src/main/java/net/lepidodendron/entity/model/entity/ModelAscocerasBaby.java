package net.lepidodendron.entity.model.entity;

import net.lepidodendron.entity.model.llibraryextensions.AdvancedModelBaseExtended;
import net.lepidodendron.entity.model.llibraryextensions.AdvancedModelRendererExtended;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

public class ModelAscocerasBaby extends AdvancedModelBaseExtended {
    private final AdvancedModelRendererExtended shell;
    private final AdvancedModelRendererExtended cube_r1;
    private final AdvancedModelRendererExtended cube_r2;
    private final AdvancedModelRendererExtended head;
    private final AdvancedModelRendererExtended cube_r3;
    private final AdvancedModelRendererExtended Outer;
    private final AdvancedModelRendererExtended tentacle5;
    private final AdvancedModelRendererExtended tentacle4;
    private final AdvancedModelRendererExtended tentacle3;
    private final AdvancedModelRendererExtended tentacle2;
    private final AdvancedModelRendererExtended tentacle;

    public ModelAscocerasBaby() {
        this.textureWidth = 16;
        this.textureHeight = 16;

        this.shell = new AdvancedModelRendererExtended(this);
        this.shell.setRotationPoint(0.0F, 22.3677F, 1.3251F);
        this.shell.cubeList.add(new ModelBox(shell, 0, 0, -1.0F, -0.3677F, -7.3251F, 2, 2, 4, 0.01F, false));

        this.cube_r1 = new AdvancedModelRendererExtended(this);
        this.cube_r1.setRotationPoint(0.0F, 0.6423F, 0.5039F);
        this.shell.addChild(cube_r1);
        this.setRotateAngle(cube_r1, 0.24F, 0.0F, 0.0F);
        this.cube_r1.cubeList.add(new ModelBox(cube_r1, 6, 2, 0.0F, -0.9434F, 2.8718F, 0, 1, 4, 0.0F, false));
        this.cube_r1.cubeList.add(new ModelBox(cube_r1, 6, 4, 0.0F, -1.4434F, -0.1282F, 0, 2, 3, 0.0F, false));

        this.cube_r2 = new AdvancedModelRendererExtended(this);
        this.cube_r2.setRotationPoint(0.0F, 0.6323F, -3.3251F);
        this.shell.addChild(cube_r2);
        this.setRotateAngle(cube_r2, 0.1134F, 0.0F, 0.0F);
        this.cube_r2.cubeList.add(new ModelBox(cube_r2, 0, 6, -0.5F, -1.0F, -0.2F, 1, 2, 4, 0.0F, false));

        this.head = new AdvancedModelRendererExtended(this);
        this.head.setRotationPoint(0.0F, 0.9356F, -7.0311F);
        this.shell.addChild(head);
        this.head.cubeList.add(new ModelBox(head, 10, 9, -1.0F, -1.2933F, -0.79F, 2, 2, 1, -0.01F, false));

        this.cube_r3 = new AdvancedModelRendererExtended(this);
        this.cube_r3.setRotationPoint(0.0F, 1.2067F, 0.21F);
        this.head.addChild(cube_r3);
        this.setRotateAngle(cube_r3, 0.1047F, 0.0F, 0.0F);
        this.cube_r3.cubeList.add(new ModelBox(cube_r3, 8, 0, -0.5F, -1.4F, -0.825F, 1, 1, 2, 0.0F, false));

        this.Outer = new AdvancedModelRendererExtended(this);
        this.Outer.setRotationPoint(0.0F, -0.3033F, -0.7939F);
        this.head.addChild(Outer);
        this.setRotateAngle(Outer, 0.3054F, 0.0F, 0.0F);


        this.tentacle5 = new AdvancedModelRendererExtended(this);
        this.tentacle5.setRotationPoint(0.0F, 0.51F, 0.079F);
        this.Outer.addChild(tentacle5);
        this.tentacle5.cubeList.add(new ModelBox(tentacle5, 0, 0, 0.0F, -0.5F, -2.0F, 0, 1, 2, 0.0F, false));

        this.tentacle4 = new AdvancedModelRendererExtended(this);
        this.tentacle4.setRotationPoint(-0.5F, 0.51F, 0.079F);
        this.Outer.addChild(tentacle4);
        this.tentacle4.cubeList.add(new ModelBox(tentacle4, 0, 1, 0.0F, -0.5F, -2.0F, 0, 1, 2, 0.0F, false));

        this.tentacle3 = new AdvancedModelRendererExtended(this);
        this.tentacle3.setRotationPoint(0.5F, 0.51F, 0.079F);
        this.Outer.addChild(tentacle3);
        this.tentacle3.cubeList.add(new ModelBox(tentacle3, 0, 4, 0.0F, -0.5F, -2.0F, 0, 1, 2, 0.0F, false));

        this.tentacle2 = new AdvancedModelRendererExtended(this);
        this.tentacle2.setRotationPoint(0.75F, 0.51F, 0.079F);
        this.Outer.addChild(tentacle2);
        this.tentacle2.cubeList.add(new ModelBox(tentacle2, 0, 5, 0.0F, -0.5F, -2.0F, 0, 1, 2, 0.0F, false));

        this.tentacle = new AdvancedModelRendererExtended(this);
        this.tentacle.setRotationPoint(-0.75F, 0.51F, 0.079F);
        this.Outer.addChild(tentacle);
        this.tentacle.cubeList.add(new ModelBox(tentacle, 0, 6, 0.0F, -0.5F, -2.0F, 0, 1, 2, 0.0F, false));

        updateDefaultPose();
    }

    @Override
    public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        this.shell.render(f5 * 0.21F);
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
        this.shell.offsetY = 1.2F;
        this.shell.rotateAngleY = (float) Math.toRadians(180);
        //this.body.offsetZ = -1F;

        AdvancedModelRendererExtended[] tentacle1 = {this.tentacle, this.tentacle2, this.tentacle3, this.tentacle4, this.tentacle5};


        float speed = 0.10F;
        if (!e.isInWater()) {
            speed = 0.5F;
        }

        //Left:
        this.chainWave(tentacle1, speed, -0.3F, -2, f2, 1F);


        if (e.isInWater()) {
            float bobSpeed = 0.1F;
            this.bob(shell, bobSpeed, 0.8F, false, f2, 2);
            this.shell.offsetZ = this.moveBoxExtended(speed, 0.125F, false, 3, f2, 1);
        }
        else {
            this.shell.rotateAngleZ = (float) Math.toRadians(90);
            this.shell.offsetY = 1.15F;
        }

    }

}
