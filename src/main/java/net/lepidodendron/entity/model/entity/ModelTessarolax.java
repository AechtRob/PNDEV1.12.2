package net.lepidodendron.entity.model.entity;

import net.ilexiconn.llibrary.client.model.tools.AdvancedModelRenderer;
import net.lepidodendron.entity.model.ModelBasePalaeopedia;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

public class ModelTessarolax extends ModelBasePalaeopedia {
    private final AdvancedModelRenderer body;
    private final AdvancedModelRenderer tail;
    private final AdvancedModelRenderer tail2;
    private final AdvancedModelRenderer eye1;
    private final AdvancedModelRenderer eye2;
    private final AdvancedModelRenderer shell;
    private final AdvancedModelRenderer cube_r1;
    private final AdvancedModelRenderer cube_r2;
    private final AdvancedModelRenderer cube_r3;
    private final AdvancedModelRenderer cube_r4;
    private final AdvancedModelRenderer cube_r5;
    private final AdvancedModelRenderer cube_r6;
    private final AdvancedModelRenderer cube_r7;
    private final AdvancedModelRenderer cube_r8;
    private final AdvancedModelRenderer cube_r9;
    private final AdvancedModelRenderer cube_r10;
    private final AdvancedModelRenderer cube_r11;
    private final AdvancedModelRenderer cube_r12;
    private final AdvancedModelRenderer cube_r13;
    private final AdvancedModelRenderer cube_r14;

    public ModelTessarolax() {
        this.textureWidth = 32;
        this.textureHeight = 32;

        this.body = new AdvancedModelRenderer(this);
        this.body.setRotationPoint(0.0F, 23.0F, -2.5F);
        this.body.cubeList.add(new ModelBox(body, 0, 13, -1.5F, 0.0F, -2.0F, 3, 1, 4, 0.0F, false));
        this.body.cubeList.add(new ModelBox(body, 0, 10, -1.0F, 0.0F, -3.0F, 2, 1, 1, 0.0F, false));
        this.body.cubeList.add(new ModelBox(body, 11, 17, -1.0F, -0.75F, -1.45F, 2, 1, 3, 0.0F, false));

        this.tail = new AdvancedModelRenderer(this);
        this.tail.setRotationPoint(1.0F, 1.0F, 2.5F);
        this.body.addChild(tail);
        this.tail.cubeList.add(new ModelBox(tail, 0, 8, -2.0F, -0.99F, -0.5F, 2, 1, 1, 0.0F, false));

        this.tail2 = new AdvancedModelRenderer(this);
        this.tail2.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.tail.addChild(tail2);
        this.tail2.cubeList.add(new ModelBox(tail2, 0, 14, -1.5F, -1.0F, 0.5F, 1, 1, 1, 0.0F, false));

        this.eye1 = new AdvancedModelRenderer(this);
        this.eye1.setRotationPoint(0.5F, 0.25F, -2.5F);
        this.body.addChild(eye1);
        this.setRotateAngle(eye1, 1.0472F, 0.0F, 0.1745F);
        this.eye1.cubeList.add(new ModelBox(eye1, 14, 14, 0.0F, -1.75F, -0.5F, 0, 2, 1, 0.0F, false));

        this.eye2 = new AdvancedModelRenderer(this);
        this.eye2.setRotationPoint(-0.5F, 0.25F, -2.5F);
        this.body.addChild(eye2);
        this.setRotateAngle(eye2, 1.0472F, 0.0F, -0.1745F);
        this.eye2.cubeList.add(new ModelBox(eye2, 14, 12, 0.0F, -1.75F, -0.5F, 0, 2, 1, 0.0F, false));

        this.shell = new AdvancedModelRenderer(this);
        this.shell.setRotationPoint(-22.05F, -0.7F, -3.425F);
        this.body.addChild(shell);


        this.cube_r1 = new AdvancedModelRenderer(this);
        this.cube_r1.setRotationPoint(22.5F, -1.0F, 6.5F);
        this.shell.addChild(cube_r1);
        this.setRotateAngle(cube_r1, 0.0F, 0.0F, -1.9199F);
        this.cube_r1.cubeList.add(new ModelBox(cube_r1, 11, 12, -0.5F, 0.0F, -0.5F, 2, 0, 5, 0.0F, false));

        this.cube_r2 = new AdvancedModelRenderer(this);
        this.cube_r2.setRotationPoint(20.5F, -1.0F, 3.5F);
        this.shell.addChild(cube_r2);
        this.setRotateAngle(cube_r2, 0.1041F, 0.152F, 0.5115F);
        this.cube_r2.cubeList.add(new ModelBox(cube_r2, 0, 0, -6.5F, 0.0F, -0.5F, 7, 0, 7, 0.0F, false));

        this.cube_r3 = new AdvancedModelRenderer(this);
        this.cube_r3.setRotationPoint(20.75F, -1.0434F, 2.406F);
        this.shell.addChild(cube_r3);
        this.setRotateAngle(cube_r3, 0.5473F, -0.2037F, 0.7594F);
        this.cube_r3.cubeList.add(new ModelBox(cube_r3, 0, 7, -4.5F, -0.1612F, -6.0371F, 5, 0, 6, 0.0F, false));

        this.cube_r4 = new AdvancedModelRenderer(this);
        this.cube_r4.setRotationPoint(22.05F, -1.0F, 1.75F);
        this.shell.addChild(cube_r4);
        this.setRotateAngle(cube_r4, 0.0F, 0.0F, 0.5672F);
        this.cube_r4.cubeList.add(new ModelBox(cube_r4, 11, 7, -0.5F, 0.0F, -4.75F, 5, 0, 5, 0.0F, false));

        this.cube_r5 = new AdvancedModelRenderer(this);
        this.cube_r5.setRotationPoint(21.9019F, -1.4062F, 6.2389F);
        this.shell.addChild(cube_r5);
        this.setRotateAngle(cube_r5, 0.0F, 0.1745F, 0.0F);
        this.cube_r5.cubeList.add(new ModelBox(cube_r5, 10, 13, 0.0F, 0.0F, -1.5F, 1, 1, 1, 0.01F, false));

        this.cube_r6 = new AdvancedModelRenderer(this);
        this.cube_r6.setRotationPoint(22.2269F, -1.4062F, 6.1639F);
        this.shell.addChild(cube_r6);
        this.setRotateAngle(cube_r6, 0.0F, 0.1745F, 0.0F);
        this.cube_r6.cubeList.add(new ModelBox(cube_r6, 0, 12, 0.0F, 0.0F, -1.5F, 1, 1, 1, 0.04F, false));

        this.cube_r7 = new AdvancedModelRenderer(this);
        this.cube_r7.setRotationPoint(23.5519F, -0.9062F, 3.6389F);
        this.shell.addChild(cube_r7);
        this.setRotateAngle(cube_r7, -0.1827F, -0.2991F, 0.5599F);
        this.cube_r7.cubeList.add(new ModelBox(cube_r7, 0, 6, -1.0603F, 0.0F, -0.842F, 2, 1, 1, 0.04F, false));

        this.cube_r8 = new AdvancedModelRenderer(this);
        this.cube_r8.setRotationPoint(22.3269F, -1.4062F, 2.3389F);
        this.shell.addChild(cube_r8);
        this.setRotateAngle(cube_r8, 0.0F, 0.1745F, 0.0F);
        this.cube_r8.cubeList.add(new ModelBox(cube_r8, 10, 15, -1.0F, 0.0F, -0.5F, 1, 1, 1, 0.04F, false));

        this.cube_r9 = new AdvancedModelRenderer(this);
        this.cube_r9.setRotationPoint(22.9519F, -1.4062F, 5.9139F);
        this.shell.addChild(cube_r9);
        this.setRotateAngle(cube_r9, 0.0F, 0.1745F, 0.0F);
        this.cube_r9.cubeList.add(new ModelBox(cube_r9, 8, 18, -1.0F, 0.0F, -0.5F, 1, 1, 1, 0.0F, false));

        this.cube_r10 = new AdvancedModelRenderer(this);
        this.cube_r10.setRotationPoint(22.3019F, -0.9062F, 4.2389F);
        this.shell.addChild(cube_r10);
        this.setRotateAngle(cube_r10, 0.0F, 0.1745F, 0.0F);
        this.cube_r10.cubeList.add(new ModelBox(cube_r10, 0, 0, -1.0F, -1.0F, -0.5F, 2, 2, 1, 0.0F, false));

        this.cube_r11 = new AdvancedModelRenderer(this);
        this.cube_r11.setRotationPoint(21.959F, -0.9062F, 2.7455F);
        this.shell.addChild(cube_r11);
        this.setRotateAngle(cube_r11, 0.0F, -0.1309F, 0.0F);
        this.cube_r11.cubeList.add(new ModelBox(cube_r11, 0, 3, -0.5F, -1.0F, -0.5F, 2, 2, 1, 0.0F, false));

        this.cube_r12 = new AdvancedModelRenderer(this);
        this.cube_r12.setRotationPoint(20.6572F, -0.4062F, 2.7434F);
        this.shell.addChild(cube_r12);
        this.setRotateAngle(cube_r12, 0.0F, -1.0734F, 0.0F);
        this.cube_r12.cubeList.add(new ModelBox(cube_r12, 18, 15, -0.5F, -1.0F, -1.5F, 2, 1, 2, -0.01F, false));

        this.cube_r13 = new AdvancedModelRenderer(this);
        this.cube_r13.setRotationPoint(22.75F, -2.9062F, 3.3892F);
        this.shell.addChild(cube_r13);
        this.setRotateAngle(cube_r13, -0.1614F, 0.0F, 0.0F);
        this.cube_r13.cubeList.add(new ModelBox(cube_r13, 0, 20, -0.5F, -3.0F, -0.5F, 0, 5, 1, 0.0F, false));

        this.cube_r14 = new AdvancedModelRenderer(this);
        this.cube_r14.setRotationPoint(22.25F, -0.9062F, 3.3892F);
        this.shell.addChild(cube_r14);
        this.setRotateAngle(cube_r14, 0.0F, 0.3054F, 0.0F);
        this.cube_r14.cubeList.add(new ModelBox(cube_r14, 0, 18, -1.5F, -1.0F, -0.5F, 3, 2, 1, 0.04F, false));

        updateDefaultPose();
    }

    @Override
    public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        //this.body.render(f5 * 0.2F);
        body.render(f5);
    }
    public void renderStaticFloor(float f) {
        this.setRotateAngle(eye1, 0.0F, 0.0F, 0.0F);
        this.setRotateAngle(eye2, 0.0F, 0.15F, 0.0F);
        this.body.offsetY = -0.5F;
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
        //this.snail.offsetY = 0.122F;

        this.swing(eye1, 0.22F, 0.15F, false, 0, 0.15F, f2, 0.8F);
        this.swing(eye2, 0.22F, 0.15F, true, 0, 0.15F, f2, 0.8F);
        this.flap(eye1, 0.22F, 0.15F, false, 0, 0.15F, f2, 0.8F);
        this.flap(eye2, 0.22F, 0.15F, true, 0, 0.15F, f2, 0.8F);

        this.eye1.rotateAngleZ += f3 / (180F / (float) Math.PI) * 0.5;
        this.eye1.rotateAngleX += f3 / (180F / (float) Math.PI) * 0.5;
        this.eye2.rotateAngleZ += f3 / (180F / (float) Math.PI) * 0.5;
        this.eye2.rotateAngleX += f3 / (180F / (float) Math.PI) * 0.5;
    }
}
