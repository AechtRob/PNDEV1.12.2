package net.lepidodendron.entity.model.entity;

import net.ilexiconn.llibrary.client.model.tools.AdvancedModelRenderer;
import net.lepidodendron.entity.model.ModelBasePalaeopedia;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLiving;

public class ModelParexus extends ModelBasePalaeopedia {
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
    private final AdvancedModelRenderer cube_r16;
    private final AdvancedModelRenderer cube_r17;
    private final AdvancedModelRenderer cube_r18;
    private final AdvancedModelRenderer cube_r19;
    private final AdvancedModelRenderer cube_r20;
    private final AdvancedModelRenderer cube_r21;
    private final AdvancedModelRenderer cube_r22;
    private final AdvancedModelRenderer cube_r23;
    private final AdvancedModelRenderer jaw;
    private final AdvancedModelRenderer cube_r24;
    private final AdvancedModelRenderer tail;
    private final AdvancedModelRenderer cube_r25;
    private final AdvancedModelRenderer cube_r26;
    private final AdvancedModelRenderer cube_r27;
    private final AdvancedModelRenderer cube_r28;
    private final AdvancedModelRenderer tail2;
    private final AdvancedModelRenderer cube_r29;
    private final AdvancedModelRenderer tail3;
    private final AdvancedModelRenderer cube_r30;
    private final AdvancedModelRenderer cube_r31;

    public ModelParexus() {
        this.textureWidth = 48;
        this.textureHeight = 48;

        this.main = new AdvancedModelRenderer(this);
        this.main.setRotationPoint(0.0F, 24.0F, 0.0F);
        this.main.cubeList.add(new ModelBox(main, 33, 31, -1.0F, -2.3021F, -7.7607F, 2, 1, 2, 0.006F, false));

        this.cube_r1 = new AdvancedModelRenderer(this);
        this.cube_r1.setRotationPoint(0.0F, -1.9771F, -6.9607F);
        this.main.addChild(cube_r1);
        this.setRotateAngle(cube_r1, 0.2618F, 0.0F, 0.0F);
        this.cube_r1.cubeList.add(new ModelBox(cube_r1, 0, 37, -1.05F, -0.5F, -0.5F, 1, 1, 1, 0.0F, true));
        this.cube_r1.cubeList.add(new ModelBox(cube_r1, 0, 37, 0.05F, -0.5F, -0.5F, 1, 1, 1, 0.0F, false));

        this.cube_r2 = new AdvancedModelRenderer(this);
        this.cube_r2.setRotationPoint(-0.5F, -3.1698F, -6.543F);
        this.main.addChild(cube_r2);
        this.setRotateAngle(cube_r2, 0.6109F, 0.0F, 0.0F);
        this.cube_r2.cubeList.add(new ModelBox(cube_r2, 35, 28, -0.5F, 0.0F, -1.5F, 2, 1, 1, -0.003F, false));
        this.cube_r2.cubeList.add(new ModelBox(cube_r2, 19, 7, -0.5F, 0.0F, -1.0F, 2, 1, 1, 0.0F, false));

        this.cube_r3 = new AdvancedModelRenderer(this);
        this.cube_r3.setRotationPoint(-0.5F, -4.015F, -4.7304F);
        this.main.addChild(cube_r3);
        this.setRotateAngle(cube_r3, 0.4363F, 0.0F, 0.0F);
        this.cube_r3.cubeList.add(new ModelBox(cube_r3, 28, 12, -0.5F, 0.0F, -2.0F, 2, 2, 2, 0.003F, false));

        this.cube_r4 = new AdvancedModelRenderer(this);
        this.cube_r4.setRotationPoint(-1.5F, -4.6644F, -1.8015F);
        this.main.addChild(cube_r4);
        this.setRotateAngle(cube_r4, -0.0611F, 0.0F, 0.0F);
        this.cube_r4.cubeList.add(new ModelBox(cube_r4, 13, 18, 0.5F, 0.0F, 0.0F, 2, 2, 4, 0.003F, false));

        this.cube_r5 = new AdvancedModelRenderer(this);
        this.cube_r5.setRotationPoint(-0.5F, -9.267F, 6.4846F);
        this.main.addChild(cube_r5);
        this.setRotateAngle(cube_r5, 0.5236F, 0.0F, 0.0F);
        this.cube_r5.cubeList.add(new ModelBox(cube_r5, 13, 25, 0.5F, -0.925F, -5.1F, 0, 1, 5, 0.0F, false));

        this.cube_r6 = new AdvancedModelRenderer(this);
        this.cube_r6.setRotationPoint(-2.0F, -7.3835F, 0.7008F);
        this.main.addChild(cube_r6);
        this.setRotateAngle(cube_r6, 0.48F, 0.0F, 0.0F);
        this.cube_r6.cubeList.add(new ModelBox(cube_r6, 13, 10, 1.5F, 0.0F, 0.0F, 1, 1, 6, 0.0F, false));

        this.cube_r7 = new AdvancedModelRenderer(this);
        this.cube_r7.setRotationPoint(-1.0F, -4.5184F, 0.2523F);
        this.main.addChild(cube_r7);
        this.setRotateAngle(cube_r7, 0.9163F, 0.0F, 0.0F);
        this.cube_r7.cubeList.add(new ModelBox(cube_r7, 32, 0, 1.0F, -1.425F, -0.925F, 0, 3, 3, 0.0F, false));

        this.cube_r8 = new AdvancedModelRenderer(this);
        this.cube_r8.setRotationPoint(-2.0F, -4.3397F, -3.2659F);
        this.main.addChild(cube_r8);
        this.setRotateAngle(cube_r8, 0.6545F, 0.0F, 0.0F);
        this.cube_r8.cubeList.add(new ModelBox(cube_r8, 19, 0, 1.5F, 0.0F, 0.0F, 1, 1, 5, 0.003F, false));

        this.cube_r9 = new AdvancedModelRenderer(this);
        this.cube_r9.setRotationPoint(-1.5F, -4.015F, -4.7304F);
        this.main.addChild(cube_r9);
        this.setRotateAngle(cube_r9, 0.2182F, 0.0F, 0.0F);
        this.cube_r9.cubeList.add(new ModelBox(cube_r9, 0, 26, 0.5F, 0.0F, 0.0F, 2, 2, 3, 0.0F, false));

        this.cube_r10 = new AdvancedModelRenderer(this);
        this.cube_r10.setRotationPoint(-1.0F, -0.5909F, -3.9122F);
        this.main.addChild(cube_r10);
        this.setRotateAngle(cube_r10, -0.0829F, 0.0F, 0.0F);
        this.cube_r10.cubeList.add(new ModelBox(cube_r10, 28, 7, -0.5F, -2.0F, -2.0F, 3, 2, 2, 0.0F, false));

        this.cube_r11 = new AdvancedModelRenderer(this);
        this.cube_r11.setRotationPoint(-0.75F, -0.8308F, 1.0821F);
        this.main.addChild(cube_r11);
        this.setRotateAngle(cube_r11, 0.5082F, -0.2739F, 0.452F);
        this.cube_r11.cubeList.add(new ModelBox(cube_r11, 28, 36, 0.0F, 0.0F, 0.0F, 0, 2, 2, 0.0F, true));

        this.cube_r12 = new AdvancedModelRenderer(this);
        this.cube_r12.setRotationPoint(-0.375F, -0.8308F, -0.1679F);
        this.main.addChild(cube_r12);
        this.setRotateAngle(cube_r12, 0.5082F, -0.2739F, 0.452F);
        this.cube_r12.cubeList.add(new ModelBox(cube_r12, 5, 37, 0.0F, 0.0F, 0.0F, 0, 1, 1, 0.0F, true));

        this.cube_r13 = new AdvancedModelRenderer(this);
        this.cube_r13.setRotationPoint(-0.375F, -0.8308F, -0.9179F);
        this.main.addChild(cube_r13);
        this.setRotateAngle(cube_r13, 0.4646F, -0.2739F, 0.452F);
        this.cube_r13.cubeList.add(new ModelBox(cube_r13, 37, 12, 0.0F, 0.0F, 0.0F, 0, 1, 1, 0.0F, true));

        this.cube_r14 = new AdvancedModelRenderer(this);
        this.cube_r14.setRotationPoint(-0.175F, -0.9308F, -1.7929F);
        this.main.addChild(cube_r14);
        this.setRotateAngle(cube_r14, 0.5519F, -0.2739F, 0.452F);
        this.cube_r14.cubeList.add(new ModelBox(cube_r14, 37, 18, 0.0F, 0.0F, 0.0F, 0, 1, 1, 0.0F, true));

        this.cube_r15 = new AdvancedModelRenderer(this);
        this.cube_r15.setRotationPoint(-0.075F, -1.0058F, -2.5179F);
        this.main.addChild(cube_r15);
        this.setRotateAngle(cube_r15, 0.5519F, -0.2739F, 0.452F);
        this.cube_r15.cubeList.add(new ModelBox(cube_r15, 37, 15, 0.0F, 0.0F, 0.0F, 0, 1, 1, 0.0F, true));

        this.cube_r16 = new AdvancedModelRenderer(this);
        this.cube_r16.setRotationPoint(-1.0F, -1.4643F, -3.7867F);
        this.main.addChild(cube_r16);
        this.setRotateAngle(cube_r16, 0.7979F, -0.5468F, 0.7189F);
        this.cube_r16.cubeList.add(new ModelBox(cube_r16, 23, 36, -0.5F, -0.5F, -0.5F, 1, 3, 1, 0.0F, true));

        this.cube_r17 = new AdvancedModelRenderer(this);
        this.cube_r17.setRotationPoint(0.075F, -1.0058F, -2.5179F);
        this.main.addChild(cube_r17);
        this.setRotateAngle(cube_r17, 0.5519F, 0.2739F, -0.452F);
        this.cube_r17.cubeList.add(new ModelBox(cube_r17, 37, 15, 0.0F, 0.0F, 0.0F, 0, 1, 1, 0.0F, false));

        this.cube_r18 = new AdvancedModelRenderer(this);
        this.cube_r18.setRotationPoint(0.175F, -0.9308F, -1.7929F);
        this.main.addChild(cube_r18);
        this.setRotateAngle(cube_r18, 0.5519F, 0.2739F, -0.452F);
        this.cube_r18.cubeList.add(new ModelBox(cube_r18, 37, 18, 0.0F, 0.0F, 0.0F, 0, 1, 1, 0.0F, false));

        this.cube_r19 = new AdvancedModelRenderer(this);
        this.cube_r19.setRotationPoint(0.375F, -0.8308F, -0.9179F);
        this.main.addChild(cube_r19);
        this.setRotateAngle(cube_r19, 0.4646F, 0.2739F, -0.452F);
        this.cube_r19.cubeList.add(new ModelBox(cube_r19, 37, 12, 0.0F, 0.0F, 0.0F, 0, 1, 1, 0.0F, false));

        this.cube_r20 = new AdvancedModelRenderer(this);
        this.cube_r20.setRotationPoint(0.375F, -0.8308F, -0.1679F);
        this.main.addChild(cube_r20);
        this.setRotateAngle(cube_r20, 0.5082F, 0.2739F, -0.452F);
        this.cube_r20.cubeList.add(new ModelBox(cube_r20, 5, 37, 0.0F, 0.0F, 0.0F, 0, 1, 1, 0.0F, false));

        this.cube_r21 = new AdvancedModelRenderer(this);
        this.cube_r21.setRotationPoint(0.75F, -0.8308F, 1.0821F);
        this.main.addChild(cube_r21);
        this.setRotateAngle(cube_r21, 0.5082F, 0.2739F, -0.452F);
        this.cube_r21.cubeList.add(new ModelBox(cube_r21, 28, 36, 0.0F, 0.0F, 0.0F, 0, 2, 2, 0.0F, false));

        this.cube_r22 = new AdvancedModelRenderer(this);
        this.cube_r22.setRotationPoint(1.0F, -1.4643F, -3.7867F);
        this.main.addChild(cube_r22);
        this.setRotateAngle(cube_r22, 0.7979F, 0.5468F, -0.7189F);
        this.cube_r22.cubeList.add(new ModelBox(cube_r22, 23, 36, -0.5F, -0.5F, -0.5F, 1, 3, 1, 0.0F, false));

        this.cube_r23 = new AdvancedModelRenderer(this);
        this.cube_r23.setRotationPoint(-1.5F, -1.0F, 2.0F);
        this.main.addChild(cube_r23);
        this.setRotateAngle(cube_r23, 0.048F, 0.0F, 0.0F);
        this.cube_r23.cubeList.add(new ModelBox(cube_r23, 0, 0, 0.0F, -2.875F, -5.925F, 3, 3, 6, 0.003F, false));

        this.jaw = new AdvancedModelRenderer(this);
        this.jaw.setRotationPoint(0.0F, -1.3898F, -5.8575F);
        this.main.addChild(jaw);
        this.setRotateAngle(jaw, -0.0873F, 0.0F, 0.0F);


        this.cube_r24 = new AdvancedModelRenderer(this);
        this.cube_r24.setRotationPoint(-0.5F, 0.5373F, 0.3104F);
        this.jaw.addChild(cube_r24);
        this.setRotateAngle(cube_r24, -0.0349F, 0.0F, 0.0F);
        this.cube_r24.cubeList.add(new ModelBox(cube_r24, 35, 24, -0.5F, -0.9F, -2.2F, 2, 1, 2, -0.003F, false));

        this.tail = new AdvancedModelRenderer(this);
        this.tail.setRotationPoint(0.0F, -2.8125F, 1.4086F);
        this.main.addChild(tail);


        this.cube_r25 = new AdvancedModelRenderer(this);
        this.cube_r25.setRotationPoint(-1.0F, -1.6231F, 0.4041F);
        this.tail.addChild(cube_r25);
        this.setRotateAngle(cube_r25, 0.589F, 0.0F, 0.0F);
        this.cube_r25.cubeList.add(new ModelBox(cube_r25, 9, 32, 1.0F, 0.225F, 0.125F, 0, 2, 3, 0.0F, false));

        this.cube_r26 = new AdvancedModelRenderer(this);
        this.cube_r26.setRotationPoint(-0.5F, -0.2853F, 2.7891F);
        this.tail.addChild(cube_r26);
        this.setRotateAngle(cube_r26, -0.2618F, 0.0F, 0.0F);
        this.cube_r26.cubeList.add(new ModelBox(cube_r26, 24, 25, -0.5F, -0.675F, -2.65F, 2, 2, 3, 0.0F, false));

        this.cube_r27 = new AdvancedModelRenderer(this);
        this.cube_r27.setRotationPoint(-1.5F, 1.7663F, 1.7138F);
        this.tail.addChild(cube_r27);
        this.setRotateAngle(cube_r27, -0.8727F, 0.0F, 0.0F);
        this.cube_r27.cubeList.add(new ModelBox(cube_r27, 16, 32, 1.5F, -2.0F, 0.0F, 0, 2, 3, 0.0F, false));

        this.cube_r28 = new AdvancedModelRenderer(this);
        this.cube_r28.setRotationPoint(-1.0F, 0.3125F, 2.8414F);
        this.tail.addChild(cube_r28);
        this.setRotateAngle(cube_r28, 0.0873F, 0.0F, 0.0F);
        this.cube_r28.cubeList.add(new ModelBox(cube_r28, 0, 20, -0.5F, -0.65F, -3.0F, 3, 2, 3, 0.0F, false));

        this.tail2 = new AdvancedModelRenderer(this);
        this.tail2.setRotationPoint(0.0F, 0.6295F, 2.6562F);
        this.tail.addChild(tail2);
        this.tail2.cubeList.add(new ModelBox(tail2, 26, 18, -1.0F, -0.992F, -0.0648F, 2, 2, 3, -0.003F, false));

        this.cube_r29 = new AdvancedModelRenderer(this);
        this.cube_r29.setRotationPoint(-1.0F, -0.992F, 2.9352F);
        this.tail2.addChild(cube_r29);
        this.setRotateAngle(cube_r29, -0.2051F, 0.0F, 0.0F);
        this.cube_r29.cubeList.add(new ModelBox(cube_r29, 24, 31, 0.5F, 0.0F, -3.0F, 1, 1, 3, 0.0F, false));

        this.tail3 = new AdvancedModelRenderer(this);
        this.tail3.setRotationPoint(0.0F, -0.5146F, 2.7753F);
        this.tail2.addChild(tail3);


        this.cube_r30 = new AdvancedModelRenderer(this);
        this.cube_r30.setRotationPoint(0.0F, 0.5476F, 0.1599F);
        this.tail3.addChild(cube_r30);
        this.setRotateAngle(cube_r30, 0.3054F, 0.0F, 0.0F);
        this.cube_r30.cubeList.add(new ModelBox(cube_r30, 33, 35, -0.5F, -1.0F, 0.0F, 1, 1, 2, 0.0F, false));

        this.cube_r31 = new AdvancedModelRenderer(this);
        this.cube_r31.setRotationPoint(-0.5F, -0.3929F, 2.7441F);
        this.tail3.addChild(cube_r31);
        this.setRotateAngle(cube_r31, 0.48F, 0.0F, 0.0F);
        this.cube_r31.cubeList.add(new ModelBox(cube_r31, 0, 10, 0.5F, -1.0F, -3.7F, 0, 3, 6, 0.0F, false));
        this.cube_r31.cubeList.add(new ModelBox(cube_r31, 0, 32, 0.0F, -1.0F, -3.0F, 1, 1, 3, 0.003F, false));

        updateDefaultPose();
    }

    @Override
    public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        this.main.render(f5 * 0.155F);
    }
    public void renderStaticWall(float f) {
        this.main.rotateAngleY = (float) Math.toRadians(90);
        this.main.offsetY = -0.15F;
        this.main.offsetX = -0.1F;
        this.main.offsetZ = -0.48F;
        this.main.render(0.01F);
        resetToDefaultPose();
    }
    public void renderStaticFloor(float f) {
        this.setRotateAngle(main, 0.1F, 0.0F, 0.0F);

        this.main.offsetY = -0.12F;
        this.main.render(0.01F);
        resetToDefaultPose();
    }
    @Override
    public void renderStaticBook(float f) {
        //Rotations, positions and sizing:
        this.main.offsetY = 0.4F;
        this.main.offsetX = 0.2F;
        this.main.offsetZ = 2.0F;
        this.main.rotateAngleY = (float)Math.toRadians(120);
        this.main.rotateAngleX = (float)Math.toRadians(0);
        this.main.rotateAngleZ = (float)Math.toRadians(0);
        this.main.scaleChildren = true;
        float scaler = 0.4F;
        this.main.setScale(scaler, scaler, scaler);
        //Start of pose:

        //End of pose, now render the model:
        this.main.render(f);
        //Reset rotations, positions and sizing:
        this.main.setScale(1.0F, 1.0F, 1.0F);
        this.main.scaleChildren = false;
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
        this.main.offsetY = 1.3F;
        //this.Gills.rotateAngleY = f3 / (180F / (float) Math.PI);
        //this.Gills.rotateAngleX = f4 / (180F / (float) Math.PI);

        //this.Tailfin.setScale(1.1F, 1.1F, 1.1F);
        AdvancedModelRenderer[] fishTail = {this.tail, this.tail2, this.tail3};
        float speed = 0.42F;
        if (!e.isInWater()) {
            speed = 0.8F;
        }
        if (e instanceof EntityLiving && !((EntityLiving) e).isAIDisabled()) {
            this.chainWave(fishTail, speed, 0.05F, -3, f2, 1);
            this.chainSwing(fishTail, speed, 0.45F, -2, f2, 1);
            this.swing(main , speed, 0.3F, true, 0, 0, f2, 1);
            this.walk(jaw, (float) (speed * 0.75), 0.15F, true, 0, 0, f2, 1);


            if (!e.isInWater()) {
                this.main.rotateAngleZ = (float) Math.toRadians(90);
                this.main.offsetY = 1.25F;
                this.bob(main, -speed, 5F, false, f2, 1);
            }
        }
    }
}
