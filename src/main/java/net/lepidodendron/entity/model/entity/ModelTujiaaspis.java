package net.lepidodendron.entity.model.entity;

import net.ilexiconn.llibrary.client.model.tools.AdvancedModelRenderer;
import net.lepidodendron.entity.model.ModelBasePalaeopedia;
import net.minecraft.client.model.ModelBox;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLiving;

public class ModelTujiaaspis extends ModelBasePalaeopedia {
    private final AdvancedModelRenderer main;
    private final AdvancedModelRenderer cube_r1;
    private final AdvancedModelRenderer cube_r2;
    private final AdvancedModelRenderer cube_r3;
    private final AdvancedModelRenderer cube_r4;
    private final AdvancedModelRenderer cube_r5;
    private final AdvancedModelRenderer cube_r6;
    private final AdvancedModelRenderer left;
    private final AdvancedModelRenderer cube_r7;
    private final AdvancedModelRenderer cube_r8;
    private final AdvancedModelRenderer cube_r9;
    private final AdvancedModelRenderer cube_r10;
    private final AdvancedModelRenderer cube_r11;
    private final AdvancedModelRenderer cube_r12;
    private final AdvancedModelRenderer cube_r13;
    private final AdvancedModelRenderer right;
    private final AdvancedModelRenderer cube_r14;
    private final AdvancedModelRenderer cube_r15;
    private final AdvancedModelRenderer cube_r16;
    private final AdvancedModelRenderer cube_r17;
    private final AdvancedModelRenderer cube_r18;
    private final AdvancedModelRenderer cube_r19;
    private final AdvancedModelRenderer cube_r20;
    private final AdvancedModelRenderer body;
    private final AdvancedModelRenderer cube_r21;
    private final AdvancedModelRenderer cube_r22;
    private final AdvancedModelRenderer cube_r23;
    private final AdvancedModelRenderer body2;
    private final AdvancedModelRenderer cube_r24;
    private final AdvancedModelRenderer body3;
    private final AdvancedModelRenderer body4;
    private final AdvancedModelRenderer cube_r25;
    private final AdvancedModelRenderer cube_r26;

    public ModelTujiaaspis() {
        this.textureWidth = 40;
        this.textureHeight = 40;

        this.main = new AdvancedModelRenderer(this);
        this.main.setRotationPoint(0.0F, 24.0F, 0.0F);
        this.main.cubeList.add(new ModelBox(main, 28, 9, -1.0F, -1.0F, -8.0F, 2, 1, 2, 0.001F, false));
        this.main.cubeList.add(new ModelBox(main, 11, 12, -3.0F, -1.0F, -6.0F, 6, 1, 2, 0.0F, false));
        this.main.cubeList.add(new ModelBox(main, 0, 0, -4.0F, -1.0F, -4.0F, 8, 1, 3, -0.001F, false));

        this.cube_r1 = new AdvancedModelRenderer(this);
        this.cube_r1.setRotationPoint(-1.0F, -2.0F, -2.75F);
        this.main.addChild(cube_r1);
        this.setRotateAngle(cube_r1, 0.0F, -0.0436F, 1.2217F);
        this.cube_r1.cubeList.add(new ModelBox(cube_r1, 10, 22, -0.3F, -0.25F, -1.5F, 1, 4, 3, 0.0F, true));

        this.cube_r2 = new AdvancedModelRenderer(this);
        this.cube_r2.setRotationPoint(-2.7246F, -1.6216F, -4.2617F);
        this.main.addChild(cube_r2);
        this.setRotateAngle(cube_r2, -0.0233F, -0.2608F, 1.3121F);
        this.cube_r2.cubeList.add(new ModelBox(cube_r2, 27, 26, 0.0F, -2.0F, -3.0F, 1, 2, 3, 0.0F, true));
        this.cube_r2.cubeList.add(new ModelBox(cube_r2, 21, 34, -0.025F, -1.6F, -2.125F, 0, 1, 1, 0.0F, true));

        this.cube_r3 = new AdvancedModelRenderer(this);
        this.cube_r3.setRotationPoint(2.7246F, -1.6216F, -4.2617F);
        this.main.addChild(cube_r3);
        this.setRotateAngle(cube_r3, -0.0233F, 0.2608F, -1.3121F);
        this.cube_r3.cubeList.add(new ModelBox(cube_r3, 21, 34, 0.025F, -1.6F, -2.125F, 0, 1, 1, 0.0F, false));
        this.cube_r3.cubeList.add(new ModelBox(cube_r3, 27, 26, -1.0F, -2.0F, -3.0F, 1, 2, 3, 0.0F, false));

        this.cube_r4 = new AdvancedModelRenderer(this);
        this.cube_r4.setRotationPoint(1.0F, -2.0F, -2.75F);
        this.main.addChild(cube_r4);
        this.setRotateAngle(cube_r4, 0.0F, 0.0436F, -1.2217F);
        this.cube_r4.cubeList.add(new ModelBox(cube_r4, 10, 22, -0.7F, -0.25F, -1.5F, 1, 4, 3, 0.0F, false));

        this.cube_r5 = new AdvancedModelRenderer(this);
        this.cube_r5.setRotationPoint(0.0F, -2.2679F, -5.2811F);
        this.main.addChild(cube_r5);
        this.setRotateAngle(cube_r5, 0.0873F, 0.0F, 0.0F);
        this.cube_r5.cubeList.add(new ModelBox(cube_r5, 17, 5, -1.0F, 0.0F, 0.0F, 2, 1, 4, 0.001F, false));

        this.cube_r6 = new AdvancedModelRenderer(this);
        this.cube_r6.setRotationPoint(0.0F, -1.0F, -8.0F);
        this.main.addChild(cube_r6);
        this.setRotateAngle(cube_r6, 0.4363F, 0.0F, 0.0F);
        this.cube_r6.cubeList.add(new ModelBox(cube_r6, 20, 29, -0.5F, -0.025F, 0.5F, 1, 0, 2, 0.0F, false));
        this.cube_r6.cubeList.add(new ModelBox(cube_r6, 19, 24, -1.0F, 0.0F, 0.0F, 2, 1, 3, 0.0F, false));

        this.left = new AdvancedModelRenderer(this);
        this.left.setRotationPoint(1.0F, 0.05F, -8.0F);
        this.main.addChild(left);


        this.cube_r7 = new AdvancedModelRenderer(this);
        this.cube_r7.setRotationPoint(3.668F, 0.0F, 8.8695F);
        this.left.addChild(cube_r7);
        this.setRotateAngle(cube_r7, 0.0F, 1.2654F, 0.0F);
        this.cube_r7.cubeList.add(new ModelBox(cube_r7, 13, 5, 0.0F, -1.0F, -2.0F, 1, 1, 2, -0.002F, false));

        this.cube_r8 = new AdvancedModelRenderer(this);
        this.cube_r8.setRotationPoint(4.8608F, 0.0F, 8.1096F);
        this.left.addChild(cube_r8);
        this.setRotateAngle(cube_r8, 0.0F, -0.2182F, 0.0F);
        this.cube_r8.cubeList.add(new ModelBox(cube_r8, 9, 30, -1.0F, -1.0F, 0.0F, 1, 1, 2, 0.0F, false));

        this.cube_r9 = new AdvancedModelRenderer(this);
        this.cube_r9.setRotationPoint(1.7432F, 0.0F, 8.7128F);
        this.left.addChild(cube_r9);
        this.setRotateAngle(cube_r9, 0.0F, 1.8762F, 0.0F);
        this.cube_r9.cubeList.add(new ModelBox(cube_r9, 30, 23, -0.7F, -1.0F, 0.0F, 3, 1, 1, 0.0F, false));

        this.cube_r10 = new AdvancedModelRenderer(this);
        this.cube_r10.setRotationPoint(4.6865F, 0.0F, 6.1172F);
        this.left.addChild(cube_r10);
        this.setRotateAngle(cube_r10, 0.0F, 0.0873F, 0.0F);
        this.cube_r10.cubeList.add(new ModelBox(cube_r10, 26, 5, -3.0F, -1.0F, 0.0F, 3, 1, 2, 0.001F, false));

        this.cube_r11 = new AdvancedModelRenderer(this);
        this.cube_r11.setRotationPoint(3.6604F, 0.0F, 3.2981F);
        this.left.addChild(cube_r11);
        this.setRotateAngle(cube_r11, 0.0F, 0.3491F, 0.0F);
        this.cube_r11.cubeList.add(new ModelBox(cube_r11, 25, 13, -2.0F, -1.0F, 0.0F, 2, 1, 3, 0.0F, false));

        this.cube_r12 = new AdvancedModelRenderer(this);
        this.cube_r12.setRotationPoint(1.7321F, 0.0F, 1.0F);
        this.left.addChild(cube_r12);
        this.setRotateAngle(cube_r12, 0.0F, 0.6981F, 0.0F);
        this.cube_r12.cubeList.add(new ModelBox(cube_r12, 0, 27, -2.0F, -1.0F, 0.0F, 2, 1, 3, 0.001F, false));

        this.cube_r13 = new AdvancedModelRenderer(this);
        this.cube_r13.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.left.addChild(cube_r13);
        this.setRotateAngle(cube_r13, 0.0F, 1.0472F, 0.0F);
        this.cube_r13.cubeList.add(new ModelBox(cube_r13, 27, 18, -2.0F, -1.0F, 0.0F, 2, 1, 2, 0.0F, false));

        this.right = new AdvancedModelRenderer(this);
        this.right.setRotationPoint(-1.0F, 0.05F, -8.0F);
        this.main.addChild(right);


        this.cube_r14 = new AdvancedModelRenderer(this);
        this.cube_r14.setRotationPoint(-3.668F, 0.0F, 8.8695F);
        this.right.addChild(cube_r14);
        this.setRotateAngle(cube_r14, 0.0F, -1.2654F, 0.0F);
        this.cube_r14.cubeList.add(new ModelBox(cube_r14, 13, 5, -1.0F, -1.0F, -2.0F, 1, 1, 2, -0.002F, true));

        this.cube_r15 = new AdvancedModelRenderer(this);
        this.cube_r15.setRotationPoint(-4.8608F, 0.0F, 8.1096F);
        this.right.addChild(cube_r15);
        this.setRotateAngle(cube_r15, 0.0F, 0.2182F, 0.0F);
        this.cube_r15.cubeList.add(new ModelBox(cube_r15, 9, 30, 0.0F, -1.0F, 0.0F, 1, 1, 2, 0.0F, true));

        this.cube_r16 = new AdvancedModelRenderer(this);
        this.cube_r16.setRotationPoint(-1.7432F, 0.0F, 8.7128F);
        this.right.addChild(cube_r16);
        this.setRotateAngle(cube_r16, 0.0F, -1.8762F, 0.0F);
        this.cube_r16.cubeList.add(new ModelBox(cube_r16, 30, 23, -2.3F, -1.0F, 0.0F, 3, 1, 1, 0.0F, true));

        this.cube_r17 = new AdvancedModelRenderer(this);
        this.cube_r17.setRotationPoint(-4.6865F, 0.0F, 6.1172F);
        this.right.addChild(cube_r17);
        this.setRotateAngle(cube_r17, 0.0F, -0.0873F, 0.0F);
        this.cube_r17.cubeList.add(new ModelBox(cube_r17, 26, 5, 0.0F, -1.0F, 0.0F, 3, 1, 2, 0.001F, true));

        this.cube_r18 = new AdvancedModelRenderer(this);
        this.cube_r18.setRotationPoint(-3.6604F, 0.0F, 3.2981F);
        this.right.addChild(cube_r18);
        this.setRotateAngle(cube_r18, 0.0F, -0.3491F, 0.0F);
        this.cube_r18.cubeList.add(new ModelBox(cube_r18, 25, 13, 0.0F, -1.0F, 0.0F, 2, 1, 3, 0.0F, true));

        this.cube_r19 = new AdvancedModelRenderer(this);
        this.cube_r19.setRotationPoint(-1.7321F, 0.0F, 1.0F);
        this.right.addChild(cube_r19);
        this.setRotateAngle(cube_r19, 0.0F, -0.6981F, 0.0F);
        this.cube_r19.cubeList.add(new ModelBox(cube_r19, 0, 27, 0.0F, -1.0F, 0.0F, 2, 1, 3, 0.001F, true));

        this.cube_r20 = new AdvancedModelRenderer(this);
        this.cube_r20.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.right.addChild(cube_r20);
        this.setRotateAngle(cube_r20, 0.0F, -1.0472F, 0.0F);
        this.cube_r20.cubeList.add(new ModelBox(cube_r20, 27, 18, 0.0F, -1.0F, 0.0F, 2, 1, 2, 0.0F, true));

        this.body = new AdvancedModelRenderer(this);
        this.body.setRotationPoint(0.0F, -0.5F, -1.5F);
        this.main.addChild(body);
        this.body.cubeList.add(new ModelBox(body, 0, 5, -2.0F, -1.5F, 0.0F, 4, 2, 4, 0.0F, false));

        this.cube_r21 = new AdvancedModelRenderer(this);
        this.cube_r21.setRotationPoint(0.0F, -1.9155F, 3.5345F);
        this.body.addChild(cube_r21);
        this.setRotateAngle(cube_r21, -0.5585F, 0.0F, 0.0F);
        this.cube_r21.cubeList.add(new ModelBox(cube_r21, 0, 5, 0.0F, -1.05F, -0.75F, 0, 2, 1, 0.0F, false));

        this.cube_r22 = new AdvancedModelRenderer(this);
        this.cube_r22.setRotationPoint(0.0F, -1.5059F, 1.4382F);
        this.body.addChild(cube_r22);
        this.setRotateAngle(cube_r22, -0.4712F, 0.0F, 0.0F);
        this.cube_r22.cubeList.add(new ModelBox(cube_r22, 0, 12, 0.0F, -1.6F, -0.8F, 0, 2, 1, 0.0F, false));

        this.cube_r23 = new AdvancedModelRenderer(this);
        this.cube_r23.setRotationPoint(0.0F, -2.0F, 0.0F);
        this.body.addChild(cube_r23);
        this.setRotateAngle(cube_r23, -0.1658F, 0.0F, 0.0F);
        this.cube_r23.cubeList.add(new ModelBox(cube_r23, 23, 0, -1.0F, 0.0F, 0.0F, 2, 1, 3, 0.0F, false));

        this.body2 = new AdvancedModelRenderer(this);
        this.body2.setRotationPoint(0.0F, 0.5F, 3.5F);
        this.body.addChild(body2);
        this.body2.cubeList.add(new ModelBox(body2, 0, 12, -1.5F, -2.0F, 0.0F, 3, 2, 4, -0.001F, false));

        this.cube_r24 = new AdvancedModelRenderer(this);
        this.cube_r24.setRotationPoint(0.0F, -2.0F, 3.0F);
        this.body2.addChild(cube_r24);
        this.setRotateAngle(cube_r24, -0.3054F, 0.0F, 0.0F);
        this.cube_r24.cubeList.add(new ModelBox(cube_r24, 0, 0, 0.0F, -1.0F, 0.0F, 0, 1, 1, 0.0F, false));

        this.body3 = new AdvancedModelRenderer(this);
        this.body3.setRotationPoint(0.0F, -0.75F, 3.5F);
        this.body2.addChild(body3);
        this.body3.cubeList.add(new ModelBox(body3, 0, 19, -1.0F, -0.5F, 0.0F, 2, 1, 4, -0.002F, false));
        this.body3.cubeList.add(new ModelBox(body3, 11, 16, -1.0F, -1.0F, 0.0F, 2, 1, 4, 0.0F, false));

        this.body4 = new AdvancedModelRenderer(this);
        this.body4.setRotationPoint(0.0F, -0.2F, 3.5F);
        this.body3.addChild(body4);


        this.cube_r25 = new AdvancedModelRenderer(this);
        this.cube_r25.setRotationPoint(0.0F, -0.5F, 1.0F);
        this.body4.addChild(cube_r25);
        this.setRotateAngle(cube_r25, 0.4363F, 0.0F, 0.0F);
        this.cube_r25.cubeList.add(new ModelBox(cube_r25, 16, 29, 0.0F, -0.2F, -0.475F, 0, 1, 3, -0.001F, false));

        this.cube_r26 = new AdvancedModelRenderer(this);
        this.cube_r26.setRotationPoint(-2.5F, 0.5F, 0.5F);
        this.body4.addChild(cube_r26);
        this.setRotateAngle(cube_r26, -0.2182F, 0.0F, 0.0F);
        this.cube_r26.cubeList.add(new ModelBox(cube_r26, 20, 18, 2.0F, -1.0F, -0.5F, 1, 1, 4, -0.001F, false));

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
        this.setRotateAngle(body, 0.0F, 0.2F, 0.0F);
        this.setRotateAngle(body2, 0.0F, -0.4F, 0.0F);
        this.setRotateAngle(body3, 0.0F, -0.6F, 0.0F);
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
        AdvancedModelRenderer[] fishTail = {this.body, this.body2, this.body3, this.body4};
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
