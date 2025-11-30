package net.lepidodendron.entity.model.entity;

import net.ilexiconn.llibrary.client.model.tools.AdvancedModelRenderer;
import net.lepidodendron.entity.model.ModelBasePalaeopedia;
import net.minecraft.client.model.ModelBox;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLiving;

public class ModelXiyuichthys extends ModelBasePalaeopedia {
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
    private final AdvancedModelRenderer cube_r15;
    private final AdvancedModelRenderer tail;
    private final AdvancedModelRenderer cube_r16;
    private final AdvancedModelRenderer cube_r17;
    private final AdvancedModelRenderer tail2;
    private final AdvancedModelRenderer cube_r18;
    private final AdvancedModelRenderer tail3;
    private final AdvancedModelRenderer tail4;
    private final AdvancedModelRenderer cube_r19;

    public ModelXiyuichthys() {
        this.textureWidth = 64;
        this.textureHeight = 64;

        this.main = new AdvancedModelRenderer(this);
        this.main.setRotationPoint(0.0F, 24.0F, 0.0F);
        this.main.cubeList.add(new ModelBox(main, 0, 0, -3.5F, -1.2F, -5.175F, 7, 1, 6, 0.0F, false));

        this.cube_r1 = new AdvancedModelRenderer(this);
        this.cube_r1.setRotationPoint(-2.0F, -2.1521F, -4.2388F);
        this.main.addChild(cube_r1);
        this.setRotateAngle(cube_r1, 0.0221F, 0.0188F, -0.436F);
        this.cube_r1.cubeList.add(new ModelBox(cube_r1, 14, 10, -3.0F, -0.0079F, 0.025F, 3, 1, 5, -0.01F, true));

        this.cube_r2 = new AdvancedModelRenderer(this);
        this.cube_r2.setRotationPoint(2.0F, -2.1521F, -4.2388F);
        this.main.addChild(cube_r2);
        this.setRotateAngle(cube_r2, 0.0221F, -0.0188F, 0.436F);
        this.cube_r2.cubeList.add(new ModelBox(cube_r2, 14, 10, 0.0F, -0.0079F, 0.025F, 3, 1, 5, -0.01F, false));

        this.cube_r3 = new AdvancedModelRenderer(this);
        this.cube_r3.setRotationPoint(0.0F, -1.0F, -7.0F);
        this.main.addChild(cube_r3);
        this.setRotateAngle(cube_r3, -0.0131F, 0.0F, 0.0F);
        this.cube_r3.cubeList.add(new ModelBox(cube_r3, 0, 28, -1.0F, 0.0F, 0.0F, 2, 1, 2, -0.001F, false));

        this.cube_r4 = new AdvancedModelRenderer(this);
        this.cube_r4.setRotationPoint(0.0F, -2.1481F, -4.2284F);
        this.main.addChild(cube_r4);
        this.setRotateAngle(cube_r4, 0.0436F, 0.0F, 0.0F);
        this.cube_r4.cubeList.add(new ModelBox(cube_r4, 0, 8, -2.0F, 0.0F, 0.0F, 4, 1, 5, -0.001F, false));

        this.cube_r5 = new AdvancedModelRenderer(this);
        this.cube_r5.setRotationPoint(0.0F, -1.0F, -7.0F);
        this.main.addChild(cube_r5);
        this.setRotateAngle(cube_r5, 0.3927F, 0.0F, 0.0F);
        this.cube_r5.cubeList.add(new ModelBox(cube_r5, 20, 23, -2.0F, 0.0F, 1.0F, 4, 1, 2, -0.002F, false));
        this.cube_r5.cubeList.add(new ModelBox(cube_r5, 9, 22, -1.0F, 0.0F, 0.0F, 2, 1, 1, 0.0F, false));

        this.cube_r6 = new AdvancedModelRenderer(this);
        this.cube_r6.setRotationPoint(0.0F, 0.0F, -7.4F);
        this.main.addChild(cube_r6);
        this.setRotateAngle(cube_r6, 0.0F, 0.3054F, 0.0F);
        this.cube_r6.cubeList.add(new ModelBox(cube_r6, 24, 27, -3.0F, -1.0F, 0.0F, 3, 1, 2, -0.001F, true));

        this.cube_r7 = new AdvancedModelRenderer(this);
        this.cube_r7.setRotationPoint(-2.8612F, 0.0F, -6.4979F);
        this.main.addChild(cube_r7);
        this.setRotateAngle(cube_r7, 0.0F, 0.8727F, 0.0F);
        this.cube_r7.cubeList.add(new ModelBox(cube_r7, 26, 10, -3.0F, -1.0F, 0.0F, 3, 1, 2, 0.001F, true));

        this.cube_r8 = new AdvancedModelRenderer(this);
        this.cube_r8.setRotationPoint(-4.7895F, 0.0F, -4.1997F);
        this.main.addChild(cube_r8);
        this.setRotateAngle(cube_r8, 0.0F, 1.309F, 0.0F);
        this.cube_r8.cubeList.add(new ModelBox(cube_r8, 25, 6, -3.0F, -1.0F, 0.0F, 3, 1, 2, 0.0F, true));

        this.cube_r9 = new AdvancedModelRenderer(this);
        this.cube_r9.setRotationPoint(-5.566F, 0.0F, -1.302F);
        this.main.addChild(cube_r9);
        this.setRotateAngle(cube_r9, 0.0F, 1.7453F, 0.0F);
        this.cube_r9.cubeList.add(new ModelBox(cube_r9, 7, 30, -2.0F, -1.0F, 0.0F, 2, 1, 2, 0.001F, true));

        this.cube_r10 = new AdvancedModelRenderer(this);
        this.cube_r10.setRotationPoint(-5.2187F, 0.0F, 0.6676F);
        this.main.addChild(cube_r10);
        this.setRotateAngle(cube_r10, 0.0F, 2.3126F, 0.0F);
        this.cube_r10.cubeList.add(new ModelBox(cube_r10, 28, 17, -2.0F, -1.0F, 0.0F, 2, 1, 2, 0.0F, true));
        this.cube_r10.cubeList.add(new ModelBox(cube_r10, 0, 0, -3.0F, -1.0F, 0.0F, 1, 1, 1, 0.0F, true));

        this.cube_r11 = new AdvancedModelRenderer(this);
        this.cube_r11.setRotationPoint(5.2187F, 0.0F, 0.6676F);
        this.main.addChild(cube_r11);
        this.setRotateAngle(cube_r11, 0.0F, -2.3126F, 0.0F);
        this.cube_r11.cubeList.add(new ModelBox(cube_r11, 0, 0, 2.0F, -1.0F, 0.0F, 1, 1, 1, 0.0F, false));
        this.cube_r11.cubeList.add(new ModelBox(cube_r11, 28, 17, 0.0F, -1.0F, 0.0F, 2, 1, 2, 0.0F, false));

        this.cube_r12 = new AdvancedModelRenderer(this);
        this.cube_r12.setRotationPoint(5.566F, 0.0F, -1.302F);
        this.main.addChild(cube_r12);
        this.setRotateAngle(cube_r12, 0.0F, -1.7453F, 0.0F);
        this.cube_r12.cubeList.add(new ModelBox(cube_r12, 7, 30, 0.0F, -1.0F, 0.0F, 2, 1, 2, 0.001F, false));

        this.cube_r13 = new AdvancedModelRenderer(this);
        this.cube_r13.setRotationPoint(4.7895F, 0.0F, -4.1997F);
        this.main.addChild(cube_r13);
        this.setRotateAngle(cube_r13, 0.0F, -1.309F, 0.0F);
        this.cube_r13.cubeList.add(new ModelBox(cube_r13, 25, 6, 0.0F, -1.0F, 0.0F, 3, 1, 2, 0.0F, false));

        this.cube_r14 = new AdvancedModelRenderer(this);
        this.cube_r14.setRotationPoint(2.8612F, 0.0F, -6.4979F);
        this.main.addChild(cube_r14);
        this.setRotateAngle(cube_r14, 0.0F, -0.8727F, 0.0F);
        this.cube_r14.cubeList.add(new ModelBox(cube_r14, 26, 10, 0.0F, -1.0F, 0.0F, 3, 1, 2, 0.001F, false));

        this.cube_r15 = new AdvancedModelRenderer(this);
        this.cube_r15.setRotationPoint(0.0F, 0.0F, -7.4F);
        this.main.addChild(cube_r15);
        this.setRotateAngle(cube_r15, 0.0F, -0.3054F, 0.0F);
        this.cube_r15.cubeList.add(new ModelBox(cube_r15, 24, 27, 0.0F, -1.0F, 0.0F, 3, 1, 2, 0.0F, false));

        this.tail = new AdvancedModelRenderer(this);
        this.tail.setRotationPoint(0.0F, -1.25F, 0.4426F);
        this.main.addChild(tail);
        this.tail.cubeList.add(new ModelBox(tail, 0, 15, -2.0F, -1.0F, 0.0F, 4, 2, 4, -0.01F, false));

        this.cube_r16 = new AdvancedModelRenderer(this);
        this.cube_r16.setRotationPoint(0.0F, -1.0F, 0.0F);
        this.tail.addChild(cube_r16);
        this.setRotateAngle(cube_r16, -0.48F, 0.0F, 0.0F);
        this.cube_r16.cubeList.add(new ModelBox(cube_r16, 0, 8, 0.0F, -2.15F, 2.275F, 0, 2, 1, 0.0F, false));

        this.cube_r17 = new AdvancedModelRenderer(this);
        this.cube_r17.setRotationPoint(0.0F, -1.0F, -0.3F);
        this.tail.addChild(cube_r17);
        this.setRotateAngle(cube_r17, -0.48F, 0.0F, 0.0F);
        this.cube_r17.cubeList.add(new ModelBox(cube_r17, 14, 8, 0.0F, -1.75F, 0.675F, 0, 2, 1, 0.0F, false));

        this.tail2 = new AdvancedModelRenderer(this);
        this.tail2.setRotationPoint(0.0F, -0.25F, 3.5F);
        this.tail.addChild(tail2);
        this.tail2.cubeList.add(new ModelBox(tail2, 21, 0, -1.5F, -0.5F, 0.0F, 3, 1, 4, 0.0F, false));
        this.tail2.cubeList.add(new ModelBox(tail2, 17, 17, -1.5F, 0.1F, 0.0F, 3, 1, 4, -0.001F, false));

        this.cube_r18 = new AdvancedModelRenderer(this);
        this.cube_r18.setRotationPoint(0.0F, -0.7F, 2.5F);
        this.tail2.addChild(cube_r18);
        this.setRotateAngle(cube_r18, -0.5236F, 0.0F, 0.0F);
        this.cube_r18.cubeList.add(new ModelBox(cube_r18, 0, 3, 0.0F, -0.5F, -0.5F, 0, 1, 1, 0.0F, false));

        this.tail3 = new AdvancedModelRenderer(this);
        this.tail3.setRotationPoint(0.0F, 0.2F, 3.5F);
        this.tail2.addChild(tail3);
        this.tail3.cubeList.add(new ModelBox(tail3, 0, 22, -1.0F, -0.5F, 0.0F, 2, 1, 4, 0.0F, false));

        this.tail4 = new AdvancedModelRenderer(this);
        this.tail4.setRotationPoint(0.0F, -0.5F, 3.5F);
        this.tail3.addChild(tail4);


        this.cube_r19 = new AdvancedModelRenderer(this);
        this.cube_r19.setRotationPoint(-0.5F, 0.0F, 0.0F);
        this.tail4.addChild(cube_r19);
        this.setRotateAngle(cube_r19, 0.4363F, 0.0F, 0.0F);
        this.cube_r19.cubeList.add(new ModelBox(cube_r19, 13, 23, 0.0F, 0.0F, 0.0F, 1, 2, 4, 0.0F, false));

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
        this.main.rotateAngleY = (float)Math.toRadians(230);
        this.main.rotateAngleX = (float)Math.toRadians(20);
        this.main.rotateAngleZ = (float)Math.toRadians(-8);
        this.main.scaleChildren = true;
        float scaler = 2.63F;
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
