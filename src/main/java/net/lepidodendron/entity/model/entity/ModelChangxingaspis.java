package net.lepidodendron.entity.model.entity;

import net.ilexiconn.llibrary.client.model.tools.AdvancedModelRenderer;
import net.lepidodendron.entity.model.ModelBasePalaeopedia;
import net.minecraft.client.model.ModelBox;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLiving;

public class ModelChangxingaspis extends ModelBasePalaeopedia {
    private final AdvancedModelRenderer main;
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
    private final AdvancedModelRenderer tail;
    private final AdvancedModelRenderer cube_r15;
    private final AdvancedModelRenderer tail2;
    private final AdvancedModelRenderer cube_r16;
    private final AdvancedModelRenderer tail3;
    private final AdvancedModelRenderer tail4;
    private final AdvancedModelRenderer cube_r17;

    public ModelChangxingaspis() {
        this.textureWidth = 32;
        this.textureHeight = 32;

        this.main = new AdvancedModelRenderer(this);
        this.main.setRotationPoint(0.0F, 23.5F, 0.0F);
        this.main.cubeList.add(new ModelBox(main, 0, 18, -2.0F, -1.8658F, -3.1948F, 4, 2, 2, -0.001F, false));
        this.main.cubeList.add(new ModelBox(main, 17, 8, -2.0F, -0.6529F, -3.1842F, 4, 1, 2, 0.0F, false));
        this.main.cubeList.add(new ModelBox(main, 13, 0, -1.0F, -1.025F, -7.55F, 2, 0, 1, 0.0F, false));

        this.cube_r1 = new AdvancedModelRenderer(this);
        this.cube_r1.setRotationPoint(-3.2038F, -0.5F, -0.0562F);
        this.main.addChild(cube_r1);
        this.setRotateAngle(cube_r1, 0.0F, 2.3126F, 0.0F);
        this.cube_r1.cubeList.add(new ModelBox(cube_r1, 26, 4, -1.0F, -0.5F, 0.0F, 1, 1, 1, 0.0F, true));

        this.cube_r2 = new AdvancedModelRenderer(this);
        this.cube_r2.setRotationPoint(-3.3723F, -0.5F, -0.011F);
        this.main.addChild(cube_r2);
        this.setRotateAngle(cube_r2, 0.0F, 1.2654F, 0.0F);
        this.cube_r2.cubeList.add(new ModelBox(cube_r2, 9, 12, 0.6F, -0.5F, 0.0F, 2, 1, 1, -0.002F, true));

        this.cube_r3 = new AdvancedModelRenderer(this);
        this.cube_r3.setRotationPoint(-3.8052F, -0.5F, -1.9636F);
        this.main.addChild(cube_r3);
        this.setRotateAngle(cube_r3, 0.0F, 1.8762F, 0.0F);
        this.cube_r3.cubeList.add(new ModelBox(cube_r3, 23, 12, -2.0F, -0.5F, 0.0F, 2, 1, 1, -0.001F, true));

        this.cube_r4 = new AdvancedModelRenderer(this);
        this.cube_r4.setRotationPoint(-3.5438F, -0.5F, -4.9522F);
        this.main.addChild(cube_r4);
        this.setRotateAngle(cube_r4, 0.0F, 1.4835F, 0.0F);
        this.cube_r4.cubeList.add(new ModelBox(cube_r4, 22, 0, -3.0F, -0.5F, 0.0F, 3, 1, 2, 0.0F, true));

        this.cube_r5 = new AdvancedModelRenderer(this);
        this.cube_r5.setRotationPoint(-1.9319F, -0.5F, -7.4824F);
        this.main.addChild(cube_r5);
        this.setRotateAngle(cube_r5, 0.0F, 1.0036F, 0.0F);
        this.cube_r5.cubeList.add(new ModelBox(cube_r5, 0, 23, -3.0F, -0.5F, 0.0F, 3, 1, 2, -0.001F, true));

        this.cube_r6 = new AdvancedModelRenderer(this);
        this.cube_r6.setRotationPoint(0.0F, -0.5F, -8.0F);
        this.main.addChild(cube_r6);
        this.setRotateAngle(cube_r6, 0.0F, 0.2618F, 0.0F);
        this.cube_r6.cubeList.add(new ModelBox(cube_r6, 25, 17, -2.0F, -0.5F, 0.0F, 2, 1, 1, 0.001F, true));

        this.cube_r7 = new AdvancedModelRenderer(this);
        this.cube_r7.setRotationPoint(3.3723F, -0.5F, -0.011F);
        this.main.addChild(cube_r7);
        this.setRotateAngle(cube_r7, 0.0F, -1.2654F, 0.0F);
        this.cube_r7.cubeList.add(new ModelBox(cube_r7, 9, 12, -2.6F, -0.5F, 0.0F, 2, 1, 1, -0.002F, false));

        this.cube_r8 = new AdvancedModelRenderer(this);
        this.cube_r8.setRotationPoint(3.2038F, -0.5F, -0.0562F);
        this.main.addChild(cube_r8);
        this.setRotateAngle(cube_r8, 0.0F, -2.3126F, 0.0F);
        this.cube_r8.cubeList.add(new ModelBox(cube_r8, 26, 4, 0.0F, -0.5F, 0.0F, 1, 1, 1, 0.0F, false));

        this.cube_r9 = new AdvancedModelRenderer(this);
        this.cube_r9.setRotationPoint(3.8052F, -0.5F, -1.9636F);
        this.main.addChild(cube_r9);
        this.setRotateAngle(cube_r9, 0.0F, -1.8762F, 0.0F);
        this.cube_r9.cubeList.add(new ModelBox(cube_r9, 23, 12, 0.0F, -0.5F, 0.0F, 2, 1, 1, -0.001F, false));

        this.cube_r10 = new AdvancedModelRenderer(this);
        this.cube_r10.setRotationPoint(3.5438F, -0.5F, -4.9522F);
        this.main.addChild(cube_r10);
        this.setRotateAngle(cube_r10, 0.0F, -1.4835F, 0.0F);
        this.cube_r10.cubeList.add(new ModelBox(cube_r10, 22, 0, 0.0F, -0.5F, 0.0F, 3, 1, 2, 0.0F, false));

        this.cube_r11 = new AdvancedModelRenderer(this);
        this.cube_r11.setRotationPoint(1.9319F, -0.5F, -7.4824F);
        this.main.addChild(cube_r11);
        this.setRotateAngle(cube_r11, 0.0F, -1.0036F, 0.0F);
        this.cube_r11.cubeList.add(new ModelBox(cube_r11, 0, 23, 0.0F, -0.5F, 0.0F, 3, 1, 2, -0.001F, false));

        this.cube_r12 = new AdvancedModelRenderer(this);
        this.cube_r12.setRotationPoint(0.0F, -0.5F, -8.0F);
        this.main.addChild(cube_r12);
        this.setRotateAngle(cube_r12, 0.0F, -0.2618F, 0.0F);
        this.cube_r12.cubeList.add(new ModelBox(cube_r12, 25, 17, 0.0F, -0.5F, 0.0F, 2, 1, 1, 0.0F, false));

        this.cube_r13 = new AdvancedModelRenderer(this);
        this.cube_r13.setRotationPoint(0.0F, -1.0F, -7.1F);
        this.main.addChild(cube_r13);
        this.setRotateAngle(cube_r13, 0.2182F, 0.0F, 0.0F);
        this.cube_r13.cubeList.add(new ModelBox(cube_r13, 13, 8, -1.5F, -0.025F, 0.4F, 1, 0, 1, 0.001F, true));
        this.cube_r13.cubeList.add(new ModelBox(cube_r13, 13, 8, 0.5F, -0.025F, 0.4F, 1, 0, 1, 0.001F, false));
        this.cube_r13.cubeList.add(new ModelBox(cube_r13, 0, 0, -2.0F, 0.0F, 0.0F, 4, 1, 4, 0.002F, false));

        this.cube_r14 = new AdvancedModelRenderer(this);
        this.cube_r14.setRotationPoint(-0.5F, 0.0F, -7.1F);
        this.main.addChild(cube_r14);
        this.setRotateAngle(cube_r14, -0.0873F, 0.0F, 0.0F);
        this.cube_r14.cubeList.add(new ModelBox(cube_r14, 4, 27, 0.0F, 0.025F, 0.0F, 1, 0, 1, 0.001F, false));
        this.cube_r14.cubeList.add(new ModelBox(cube_r14, 0, 6, -1.5F, -1.0F, -0.05F, 4, 1, 4, 0.001F, false));

        this.tail = new AdvancedModelRenderer(this);
        this.tail.setRotationPoint(0.0F, -0.775F, -1.5F);
        this.main.addChild(tail);
        this.tail.cubeList.add(new ModelBox(tail, 13, 12, -1.5F, -1.0F, 0.0F, 3, 2, 3, 0.0F, false));

        this.cube_r15 = new AdvancedModelRenderer(this);
        this.cube_r15.setRotationPoint(0.0F, -1.0F, 1.0F);
        this.tail.addChild(cube_r15);
        this.setRotateAngle(cube_r15, -0.3927F, 0.0F, 0.0F);
        this.cube_r15.cubeList.add(new ModelBox(cube_r15, 0, 6, 0.0F, -1.0F, 0.0F, 0, 1, 1, 0.0F, false));

        this.tail2 = new AdvancedModelRenderer(this);
        this.tail2.setRotationPoint(0.0F, -0.025F, 2.5F);
        this.tail.addChild(tail2);
        this.tail2.cubeList.add(new ModelBox(tail2, 13, 2, -1.0F, -0.875F, 0.0F, 2, 1, 4, 0.0F, false));
        this.tail2.cubeList.add(new ModelBox(tail2, 0, 12, -1.0F, -0.125F, 0.0F, 2, 1, 4, -0.001F, false));

        this.cube_r16 = new AdvancedModelRenderer(this);
        this.cube_r16.setRotationPoint(0.0F, -0.825F, 0.525F);
        this.tail2.addChild(cube_r16);
        this.setRotateAngle(cube_r16, -0.3927F, 0.0F, 0.0F);
        this.cube_r16.cubeList.add(new ModelBox(cube_r16, 0, 0, 0.0F, -1.0F, 0.0F, 0, 1, 1, 0.0F, false));

        this.tail3 = new AdvancedModelRenderer(this);
        this.tail3.setRotationPoint(0.0F, -0.075F, 3.5F);
        this.tail2.addChild(tail3);
        this.tail3.cubeList.add(new ModelBox(tail3, 20, 20, -0.5F, -0.7F, 0.0F, 1, 1, 4, 0.0F, false));
        this.tail3.cubeList.add(new ModelBox(tail3, 13, 18, -0.5F, -0.3F, 0.0F, 1, 1, 4, -0.001F, false));

        this.tail4 = new AdvancedModelRenderer(this);
        this.tail4.setRotationPoint(0.0F, -0.3553F, 3.6561F);
        this.tail3.addChild(tail4);


        this.cube_r17 = new AdvancedModelRenderer(this);
        this.cube_r17.setRotationPoint(0.0F, 0.6553F, 0.3439F);
        this.tail4.addChild(cube_r17);
        this.setRotateAngle(cube_r17, 0.7854F, 0.0F, 0.0F);
        this.cube_r17.cubeList.add(new ModelBox(cube_r17, 11, 24, -0.5F, -0.725F, -0.3F, 1, 2, 2, -0.002F, false));
        updateDefaultPose();
    }

    @Override
    public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        this.main.render(f5);
    }

    @Override
    public void renderStaticBook(float f) {
        //Rotations, positions and sizing:
        this.main.offsetY = -1.2F;
        this.main.offsetX = 0.238F;
        this.main.rotateAngleY = (float)Math.toRadians(222);
        this.main.rotateAngleX = (float)Math.toRadians(30);
        this.main.rotateAngleZ = (float)Math.toRadians(-8);
        this.main.scaleChildren = true;
        float scaler = 3.63F;
        this.main.setScale(scaler, scaler, scaler);
        //Start of pose:

        //End of pose, now render the model:
        this.main.render(f);
        //Reset rotations, positions and sizing:
        this.main.setScale(1.0F, 1.0F, 1.0F);
        this.main.scaleChildren = false;
        resetToDefaultPose();
    }

    public void renderStaticWall(float f) {
        this.main.rotateAngleY = (float) Math.toRadians(90);
        this.main.offsetZ = -0.34F;
        this.main.offsetY = -0.18F;
        this.main.offsetX = -0.0F;
        this.main.render(0.01F);
        resetToDefaultPose();
    }
    public void renderStaticFloor(float f) {
        this.setRotateAngle(main, -0.1F, 0.0F, 0.0F);
        this.setRotateAngle(tail, 0.0F, 0.2F, 0.0F);
        this.setRotateAngle(tail2, 0.0F, -0.4F, 0.0F);
        this.setRotateAngle(tail3, 0.0F, -0.6F, 0.0F);
        this.setRotateAngle(tail4, 0.0F, -0.6F, 0.0F);
        this.main.offsetY = -0.14F;
        this.main.offsetZ = 0.015F;
        this.main.render(0.01F);
        resetToDefaultPose();
    }
    public void setRotateAngle(AdvancedModelRenderer AdvancedModelRenderer, float x, float y, float z) {
        AdvancedModelRenderer.rotateAngleX = x;
        AdvancedModelRenderer.rotateAngleY = y;
        AdvancedModelRenderer.rotateAngleZ = z;
    }

    @Override
    public void setRotationAngles(float f, float f1, float f2, float f3, float f4, float f5, Entity e) {
        super.setRotationAngles(f, f1, f2, f3, f4, f5, e);
        this.resetToDefaultPose();
        //this.main.offsetY = 0F;

        //this.Tailfin.setScale(1.1F, 1.1F, 1.1F);
        AdvancedModelRenderer[] fishTail = {this.tail, this.tail2, this.tail3, this.tail4};
        float speed = 0.5F;
        if (!e.isInWater()) {
            speed = 0.8F;
        }
        if (e instanceof EntityLiving && !((EntityLiving) e).isAIDisabled()) {
            this.chainSwing(fishTail, speed*0.8F, 0.27F, 0, f2, 1);


            this.swing(main, speed*0.8F, 0.2F, true, 0, 0, f2, 1);
             if (!e.isInWater()) {
                this.main.rotateAngleZ = (float) Math.toRadians(90);
                this.main.offsetY = -0.1F;
                this.bob(main, -speed, 5F, false, f2, 1);
            }
        }
    }
}
