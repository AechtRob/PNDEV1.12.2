package net.lepidodendron.entity.model.entity;

import net.lepidodendron.entity.model.llibraryextensions.AdvancedModelBaseExtended;
import net.lepidodendron.entity.model.llibraryextensions.AdvancedModelRendererExtended;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

public class ModelSphooceras extends AdvancedModelBaseExtended {
    private final AdvancedModelRendererExtended shell;
    private final AdvancedModelRendererExtended shell_r1;
    private final AdvancedModelRendererExtended shell_r2;
    private final AdvancedModelRendererExtended shell_r3;
    private final AdvancedModelRendererExtended head;
    private final AdvancedModelRendererExtended cube_r1;
    private final AdvancedModelRendererExtended arm;
    private final AdvancedModelRendererExtended arm3;
    private final AdvancedModelRendererExtended arm4;
    private final AdvancedModelRendererExtended arm5;
    private final AdvancedModelRendererExtended arm6;
    private final AdvancedModelRendererExtended arm2;

    public ModelSphooceras() {
        this.textureWidth = 64;
        this.textureHeight = 64;

        this.shell = new AdvancedModelRendererExtended(this);
        this.shell.setRotationPoint(0.5F, 29.75F, 0.0F);
        this.shell.cubeList.add(new ModelBox(shell, 0, 0, -3.0F, -9.75F, -7.25F, 5, 4, 12, 0.0F, false));
        this.shell.cubeList.add(new ModelBox(shell, 0, 16, -2.5F, -9.75F, 4.75F, 4, 4, 3, 0.0F, false));

        this.shell_r1 = new AdvancedModelRendererExtended(this);
        this.shell_r1.setRotationPoint(-0.5F, -5.75F, 7.75F);
        this.shell.addChild(shell_r1);
        this.setRotateAngle(shell_r1, 0.2836F, 0.0F, 0.0F);
        this.shell_r1.cubeList.add(new ModelBox(shell_r1, 0, 5, -1.5F, -2.0F, 0.0F, 3, 2, 3, 0.01F, false));

        this.shell_r2 = new AdvancedModelRendererExtended(this);
        this.shell_r2.setRotationPoint(-0.5F, -9.75F, 7.75F);
        this.shell.addChild(shell_r2);
        this.setRotateAngle(shell_r2, -0.3491F, 0.0F, 0.0F);
        this.shell_r2.cubeList.add(new ModelBox(shell_r2, 14, 16, -1.5F, 0.0F, 0.0F, 3, 2, 4, 0.0F, false));

        this.shell_r3 = new AdvancedModelRendererExtended(this);
        this.shell_r3.setRotationPoint(-0.5F, -9.75F, -7.25F);
        this.shell.addChild(shell_r3);
        this.setRotateAngle(shell_r3, 0.3927F, 0.0F, 0.0F);
        this.shell_r3.cubeList.add(new ModelBox(shell_r3, 22, 0, -2.5F, 0.0F, -1.0F, 5, 3, 1, -0.01F, false));

        this.head = new AdvancedModelRendererExtended(this);
        this.head.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.shell.addChild(head);
        this.head.cubeList.add(new ModelBox(head, 0, 0, -2.5F, -9.0F, -9.0F, 4, 3, 2, 0.0F, false));
        this.head.cubeList.add(new ModelBox(head, 0, 10, -2.6F, -8.525F, -8.525F, 1, 1, 1, 0.0F, false));
        this.head.cubeList.add(new ModelBox(head, 0, 10, 0.6F, -8.525F, -8.525F, 1, 1, 1, 0.0F, true));

        this.cube_r1 = new AdvancedModelRendererExtended(this);
        this.cube_r1.setRotationPoint(-1.0F, -6.1F, -8.0F);
        this.head.addChild(cube_r1);
        this.setRotateAngle(cube_r1, 0.2051F, 0.0F, 0.0F);
        this.cube_r1.cubeList.add(new ModelBox(cube_r1, 11, 16, 0.0F, -0.5F, -0.65F, 1, 1, 2, 0.0F, false));

        this.arm = new AdvancedModelRendererExtended(this);
        this.arm.setRotationPoint(-1.75F, -8.1F, -9.0F);
        this.head.addChild(arm);
        this.arm.cubeList.add(new ModelBox(arm, 26, 23, -0.5F, -0.5F, -4.0F, 1, 1, 4, 0.0F, false));

        this.arm3 = new AdvancedModelRendererExtended(this);
        this.arm3.setRotationPoint(0.75F, -8.1F, -9.0F);
        this.head.addChild(arm3);
        this.arm3.cubeList.add(new ModelBox(arm3, 26, 23, -0.5F, -0.5F, -4.0F, 1, 1, 4, 0.0F, true));

        this.arm4 = new AdvancedModelRendererExtended(this);
        this.arm4.setRotationPoint(-1.75F, -6.85F, -9.0F);
        this.head.addChild(arm4);
        this.arm4.cubeList.add(new ModelBox(arm4, 20, 22, -0.5F, -0.5F, -4.0F, 1, 1, 4, 0.0F, false));

        this.arm5 = new AdvancedModelRendererExtended(this);
        this.arm5.setRotationPoint(0.75F, -6.85F, -9.0F);
        this.head.addChild(arm5);
        this.arm5.cubeList.add(new ModelBox(arm5, 20, 22, -0.5F, -0.5F, -4.0F, 1, 1, 4, 0.0F, true));

        this.arm6 = new AdvancedModelRendererExtended(this);
        this.arm6.setRotationPoint(-0.5F, -6.65F, -9.0F);
        this.head.addChild(arm6);
        this.arm6.cubeList.add(new ModelBox(arm6, 22, 4, -0.5F, -0.5F, -4.0F, 1, 1, 4, 0.0F, false));

        this.arm2 = new AdvancedModelRendererExtended(this);
        this.arm2.setRotationPoint(-0.5F, -8.35F, -9.0F);
        this.head.addChild(arm2);
        this.arm2.cubeList.add(new ModelBox(arm2, 26, 18, -0.5F, -0.5F, -4.0F, 1, 1, 4, 0.0F, false));

        updateDefaultPose();
    }

    @Override
    public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        this.shell.render(f5);
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
        this.shell.offsetY = 1.1F;
        this.shell.rotateAngleY = (float) Math.toRadians(180);
        //this.body.offsetZ = -1F;

        AdvancedModelRendererExtended[] t1 = {this.arm};
        AdvancedModelRendererExtended[] t2 = {this.arm2};
        AdvancedModelRendererExtended[] t3 = {this.arm3};
        AdvancedModelRendererExtended[] t4 = {this.arm4};
        AdvancedModelRendererExtended[] t5 = {this.arm5};
        AdvancedModelRendererExtended[] t6 = {this.arm6};


        float speed = 0.10F;
        if (!e.isInWater()) {
            speed = 0.5F;
        }

        //Left:
        //
        this.chainWave(t5, speed, 0.25F, -2, f2, 0.5F);
        this.chainSwing(t5, speed, -0.1F, -2, f2, 0.5F);
        //Left lower middle:
        this.chainWave(t6, speed, 0.3F, -2, f2, 0.5F);
        //Left upper top:
        this.chainWave(t3, speed, -0.25F, -2, f2, 0.5F);
        this.chainSwing(t3, speed, -0.1F, -2, f2, 0.5F);

        //Right:
        //Right lower bottom:
        this.chainWave(t4, speed, 0.25F, -2, f2, 0.5F);
        this.chainSwing(t4, speed, 0.1F, -2, f2, 0.5F);
        //Right upper middle:
        this.chainWave(t2, speed, -0.3F, -2, f2, 0.5F);
        //Right upper top:
        this.chainWave(t1, speed, -0.25F, -2, f2, 0.5F);
        this.chainSwing(t1, speed, 0.1F, -2, f2, 0.5F);

        if (e.isInWater()) {
            float bobSpeed = 0.1F;
            this.bob(shell, bobSpeed, 0.8F, false, f2, 2);
            this.shell.offsetZ = this.moveBoxExtended(speed, 0.05F, false, 0.5F, f2, 1);
        }
        else {
            this.shell.rotateAngleZ = (float) Math.toRadians(90);
            this.shell.offsetY = 1.08F;
        }

    }

}
