package net.lepidodendron.entity.model.entity;

import net.ilexiconn.llibrary.client.model.tools.AdvancedModelRenderer;
import net.lepidodendron.entity.base.EntityPrehistoricFloraAgeableBase;
import net.lepidodendron.entity.model.ModelBasePalaeopedia;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

public class ModelAleosteus extends ModelBasePalaeopedia {
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
    private final AdvancedModelRenderer cube_r24;
    private final AdvancedModelRenderer cube_r25;
    private final AdvancedModelRenderer jaw;
    private final AdvancedModelRenderer cube_r26;
    private final AdvancedModelRenderer cube_r27;
    private final AdvancedModelRenderer cube_r28;
    private final AdvancedModelRenderer cube_r29;
    private final AdvancedModelRenderer frontLeftFin;
    private final AdvancedModelRenderer frontRightFin;
    private final AdvancedModelRenderer tail;
    private final AdvancedModelRenderer cube_r30;
    private final AdvancedModelRenderer cube_r31;
    private final AdvancedModelRenderer cube_r32;
    private final AdvancedModelRenderer backLeftFin;
    private final AdvancedModelRenderer backRightFin;
    private final AdvancedModelRenderer tail2;
    private final AdvancedModelRenderer cube_r33;
    private final AdvancedModelRenderer cube_r34;
    private final AdvancedModelRenderer tail3;
    private final AdvancedModelRenderer cube_r35;

    public ModelAleosteus() {
        this.textureWidth = 55;
        this.textureHeight = 55;

        this.main = new AdvancedModelRenderer(this);
        this.main.setRotationPoint(0.0F, 24.0F, 0.0F);
        this.main.cubeList.add(new ModelBox(main, 0, 0, -2.5F, -4.0F, -3.0F, 5, 3, 5, 0.006F, false));

        this.cube_r1 = new AdvancedModelRenderer(this);
        this.cube_r1.setRotationPoint(-1.0F, -5.1471F, -1.3617F);
        this.main.addChild(cube_r1);
        this.setRotateAngle(cube_r1, -0.2618F, 0.0F, 0.0F);
        this.cube_r1.cubeList.add(new ModelBox(cube_r1, 0, 17, -1.0F, 0.0F, 0.0F, 4, 1, 4, -0.003F, false));

        this.cube_r2 = new AdvancedModelRenderer(this);
        this.cube_r2.setRotationPoint(0.0F, -4.0F, -3.0F);
        this.main.addChild(cube_r2);
        this.setRotateAngle(cube_r2, 0.6109F, 0.0F, 0.0F);
        this.cube_r2.cubeList.add(new ModelBox(cube_r2, 13, 34, -2.0F, 0.0F, 0.0F, 4, 2, 2, 0.0F, false));

        this.cube_r3 = new AdvancedModelRenderer(this);
        this.cube_r3.setRotationPoint(-2.1562F, -0.5332F, -4.272F);
        this.main.addChild(cube_r3);
        this.setRotateAngle(cube_r3, -0.2819F, -0.7307F, 0.0034F);
        this.cube_r3.cubeList.add(new ModelBox(cube_r3, 35, 38, -0.275F, -2.0F, -0.5F, 2, 2, 2, 0.003F, true));

        this.cube_r4 = new AdvancedModelRenderer(this);
        this.cube_r4.setRotationPoint(-3.4633F, -1.0397F, -1.9428F);
        this.main.addChild(cube_r4);
        this.setRotateAngle(cube_r4, 1.4749F, -1.4697F, -2.9556F);
        this.cube_r4.cubeList.add(new ModelBox(cube_r4, 43, 16, -1.0F, 0.025F, -2.0F, 2, 1, 2, 0.0F, true));

        this.cube_r5 = new AdvancedModelRenderer(this);
        this.cube_r5.setRotationPoint(-3.2917F, -0.1275F, -3.4191F);
        this.main.addChild(cube_r5);
        this.setRotateAngle(cube_r5, 0.0506F, -0.4907F, -0.1568F);
        this.cube_r5.cubeList.add(new ModelBox(cube_r5, 26, 38, 0.175F, -1.0F, 0.0F, 1, 1, 3, 0.003F, true));

        this.cube_r6 = new AdvancedModelRenderer(this);
        this.cube_r6.setRotationPoint(3.4633F, -1.0397F, -1.9428F);
        this.main.addChild(cube_r6);
        this.setRotateAngle(cube_r6, 1.4749F, 1.4697F, 2.9556F);
        this.cube_r6.cubeList.add(new ModelBox(cube_r6, 43, 16, -1.0F, 0.025F, -2.0F, 2, 1, 2, 0.0F, false));

        this.cube_r7 = new AdvancedModelRenderer(this);
        this.cube_r7.setRotationPoint(3.366F, -0.2182F, -1.1861F);
        this.main.addChild(cube_r7);
        this.setRotateAngle(cube_r7, 2.7838F, 1.4697F, 2.9556F);
        this.cube_r7.cubeList.add(new ModelBox(cube_r7, 9, 43, -0.275F, -1.0F, -2.0F, 2, 1, 2, 0.003F, false));

        this.cube_r8 = new AdvancedModelRenderer(this);
        this.cube_r8.setRotationPoint(3.2917F, -0.1275F, -3.4191F);
        this.main.addChild(cube_r8);
        this.setRotateAngle(cube_r8, 0.0506F, 0.4907F, 0.1568F);
        this.cube_r8.cubeList.add(new ModelBox(cube_r8, 26, 38, -1.175F, -1.0F, 0.0F, 1, 1, 3, 0.003F, false));

        this.cube_r9 = new AdvancedModelRenderer(this);
        this.cube_r9.setRotationPoint(2.1562F, -0.5332F, -4.272F);
        this.main.addChild(cube_r9);
        this.setRotateAngle(cube_r9, -0.2819F, 0.7307F, -0.0034F);
        this.cube_r9.cubeList.add(new ModelBox(cube_r9, 35, 38, -1.725F, -2.0F, -0.5F, 2, 2, 2, 0.003F, false));

        this.cube_r10 = new AdvancedModelRenderer(this);
        this.cube_r10.setRotationPoint(-1.9014F, -1.1633F, -6.153F);
        this.main.addChild(cube_r10);
        this.setRotateAngle(cube_r10, -0.2872F, -0.197F, -0.201F);
        this.cube_r10.cubeList.add(new ModelBox(cube_r10, 41, 31, 0.0F, -1.0F, -0.05F, 2, 1, 2, 0.0F, true));

        this.cube_r11 = new AdvancedModelRenderer(this);
        this.cube_r11.setRotationPoint(-1.0162F, -1.9279F, -7.7752F);
        this.main.addChild(cube_r11);
        this.setRotateAngle(cube_r11, -0.3161F, -0.5483F, -0.1519F);
        this.cube_r11.cubeList.add(new ModelBox(cube_r11, 41, 27, 0.0F, -1.0F, -0.05F, 2, 1, 2, 0.0F, true));

        this.cube_r12 = new AdvancedModelRenderer(this);
        this.cube_r12.setRotationPoint(-2.9154F, -2.8202F, -3.3177F);
        this.main.addChild(cube_r12);
        this.setRotateAngle(cube_r12, 0.2731F, -0.2457F, -0.0914F);
        this.cube_r12.cubeList.add(new ModelBox(cube_r12, 15, 27, 0.0F, -0.825F, -3.0F, 2, 2, 4, 0.0F, true));

        this.cube_r13 = new AdvancedModelRenderer(this);
        this.cube_r13.setRotationPoint(-2.1245F, -1.9047F, -6.1106F);
        this.main.addChild(cube_r13);
        this.setRotateAngle(cube_r13, 0.0627F, -0.5846F, -0.1342F);
        this.cube_r13.cubeList.add(new ModelBox(cube_r13, 41, 23, 0.0F, -1.0F, -2.05F, 2, 1, 2, 0.0F, true));

        this.cube_r14 = new AdvancedModelRenderer(this);
        this.cube_r14.setRotationPoint(1.9014F, -1.1633F, -6.153F);
        this.main.addChild(cube_r14);
        this.setRotateAngle(cube_r14, -0.2872F, 0.197F, 0.201F);
        this.cube_r14.cubeList.add(new ModelBox(cube_r14, 41, 31, -2.0F, -1.0F, -0.05F, 2, 1, 2, 0.0F, false));

        this.cube_r15 = new AdvancedModelRenderer(this);
        this.cube_r15.setRotationPoint(1.0162F, -1.9279F, -7.7752F);
        this.main.addChild(cube_r15);
        this.setRotateAngle(cube_r15, -0.3161F, 0.5483F, 0.1519F);
        this.cube_r15.cubeList.add(new ModelBox(cube_r15, 41, 27, -2.0F, -1.0F, -0.05F, 2, 1, 2, 0.0F, false));

        this.cube_r16 = new AdvancedModelRenderer(this);
        this.cube_r16.setRotationPoint(2.1245F, -1.9047F, -6.1106F);
        this.main.addChild(cube_r16);
        this.setRotateAngle(cube_r16, 0.0627F, 0.5846F, 0.1342F);
        this.cube_r16.cubeList.add(new ModelBox(cube_r16, 41, 23, -2.0F, -1.0F, -2.05F, 2, 1, 2, 0.0F, false));

        this.cube_r17 = new AdvancedModelRenderer(this);
        this.cube_r17.setRotationPoint(2.9154F, -2.8202F, -3.3177F);
        this.main.addChild(cube_r17);
        this.setRotateAngle(cube_r17, 0.2731F, 0.2457F, 0.0914F);
        this.cube_r17.cubeList.add(new ModelBox(cube_r17, 15, 27, -2.0F, -0.825F, -3.0F, 2, 2, 4, 0.0F, false));

        this.cube_r18 = new AdvancedModelRenderer(this);
        this.cube_r18.setRotationPoint(0.5F, -4.0F, -3.0F);
        this.main.addChild(cube_r18);
        this.setRotateAngle(cube_r18, 0.3491F, 0.0F, 0.0F);
        this.cube_r18.cubeList.add(new ModelBox(cube_r18, 21, 5, -2.0F, 0.0F, -2.0F, 3, 1, 2, 0.0F, false));

        this.cube_r19 = new AdvancedModelRenderer(this);
        this.cube_r19.setRotationPoint(-1.0F, -2.536F, -7.4373F);
        this.main.addChild(cube_r19);
        this.setRotateAngle(cube_r19, -0.1434F, -0.5481F, 0.071F);
        this.cube_r19.cubeList.add(new ModelBox(cube_r19, 41, 35, -0.55F, -0.45F, -0.4F, 1, 1, 1, 0.0F, true));

        this.cube_r20 = new AdvancedModelRenderer(this);
        this.cube_r20.setRotationPoint(1.0F, -2.536F, -7.4373F);
        this.main.addChild(cube_r20);
        this.setRotateAngle(cube_r20, -0.1434F, 0.5481F, -0.071F);
        this.cube_r20.cubeList.add(new ModelBox(cube_r20, 41, 35, -0.45F, -0.45F, -0.4F, 1, 1, 1, 0.0F, false));

        this.cube_r21 = new AdvancedModelRenderer(this);
        this.cube_r21.setRotationPoint(-1.0F, -1.035F, -6.2893F);
        this.main.addChild(cube_r21);
        this.setRotateAngle(cube_r21, -0.2182F, 0.0F, 0.0F);
        this.cube_r21.cubeList.add(new ModelBox(cube_r21, 32, 11, -0.5F, -1.0F, 0.0F, 3, 1, 3, 0.003F, false));
        this.cube_r21.cubeList.add(new ModelBox(cube_r21, 33, 43, 0.175F, -1.175F, -1.625F, 0, 1, 2, 0.0F, true));
        this.cube_r21.cubeList.add(new ModelBox(cube_r21, 33, 43, 1.825F, -1.175F, -1.625F, 0, 1, 2, 0.0F, false));

        this.cube_r22 = new AdvancedModelRenderer(this);
        this.cube_r22.setRotationPoint(-0.5F, -2.035F, -8.0213F);
        this.main.addChild(cube_r22);
        this.setRotateAngle(cube_r22, -0.5236F, 0.0F, 0.0F);
        this.cube_r22.cubeList.add(new ModelBox(cube_r22, 13, 39, -0.5F, -1.0F, 0.0F, 2, 1, 2, 0.0F, false));

        this.cube_r23 = new AdvancedModelRenderer(this);
        this.cube_r23.setRotationPoint(0.0F, -2.7183F, -3.5977F);
        this.main.addChild(cube_r23);
        this.setRotateAngle(cube_r23, 0.1309F, 0.0F, 0.0F);
        this.cube_r23.cubeList.add(new ModelBox(cube_r23, 28, 27, -1.0F, -0.9F, -4.475F, 2, 1, 4, 0.003F, false));

        this.cube_r24 = new AdvancedModelRenderer(this);
        this.cube_r24.setRotationPoint(-0.5F, -0.0125F, -0.9299F);
        this.main.addChild(cube_r24);
        this.setRotateAngle(cube_r24, 0.0873F, 0.0F, 0.0F);
        this.cube_r24.cubeList.add(new ModelBox(cube_r24, 0, 23, -1.5F, -1.0F, 0.0F, 4, 1, 3, 0.003F, false));

        this.cube_r25 = new AdvancedModelRenderer(this);
        this.cube_r25.setRotationPoint(-1.5F, -0.025F, 0.075F);
        this.main.addChild(cube_r25);
        this.setRotateAngle(cube_r25, -0.0873F, 0.0F, 0.0F);
        this.cube_r25.cubeList.add(new ModelBox(cube_r25, 21, 0, -0.5F, -0.9F, -4.0F, 4, 1, 3, 0.0F, false));

        this.jaw = new AdvancedModelRenderer(this);
        this.jaw.setRotationPoint(0.0F, -1.3587F, -3.8745F);
        this.main.addChild(jaw);


        this.cube_r26 = new AdvancedModelRenderer(this);
        this.cube_r26.setRotationPoint(-0.5F, -0.4958F, -3.0435F);
        this.jaw.addChild(cube_r26);
        this.setRotateAngle(cube_r26, -0.3518F, -0.123F, 0.045F);
        this.cube_r26.cubeList.add(new ModelBox(cube_r26, 28, 43, -0.425F, -0.5F, -0.775F, 0, 1, 2, 0.0F, true));

        this.cube_r27 = new AdvancedModelRenderer(this);
        this.cube_r27.setRotationPoint(0.5F, -0.4958F, -3.0435F);
        this.jaw.addChild(cube_r27);
        this.setRotateAngle(cube_r27, -0.3518F, 0.123F, -0.045F);
        this.cube_r27.cubeList.add(new ModelBox(cube_r27, 28, 43, 0.425F, -0.5F, -0.775F, 0, 1, 2, 0.0F, false));

        this.cube_r28 = new AdvancedModelRenderer(this);
        this.cube_r28.setRotationPoint(-0.5F, 0.6408F, -1.9674F);
        this.jaw.addChild(cube_r28);
        this.setRotateAngle(cube_r28, -0.3901F, -0.0111F, -0.0094F);
        this.cube_r28.cubeList.add(new ModelBox(cube_r28, 0, 40, -0.5F, -0.95F, -2.4F, 2, 1, 2, -0.006F, false));

        this.cube_r29 = new AdvancedModelRenderer(this);
        this.cube_r29.setRotationPoint(-1.0F, 1.0737F, -0.0148F);
        this.jaw.addChild(cube_r29);
        this.setRotateAngle(cube_r29, -0.2182F, 0.0F, 0.0F);
        this.cube_r29.cubeList.add(new ModelBox(cube_r29, 28, 33, -0.5F, -1.0F, -3.0F, 3, 1, 3, -0.003F, false));

        this.frontLeftFin = new AdvancedModelRenderer(this);
        this.frontLeftFin.setRotationPoint(2.5381F, -0.7168F, -1.4457F);
        this.main.addChild(frontLeftFin);
        this.setRotateAngle(frontLeftFin, -0.1266F, -0.6699F, 0.3365F);
        this.frontLeftFin.cubeList.add(new ModelBox(frontLeftFin, 30, 23, 0.0F, 0.0F, 0.0F, 3, 0, 2, 0.0F, false));

        this.frontRightFin = new AdvancedModelRenderer(this);
        this.frontRightFin.setRotationPoint(-2.5381F, -0.7168F, -1.4457F);
        this.main.addChild(frontRightFin);
        this.setRotateAngle(frontRightFin, -0.1266F, 0.6699F, -0.3365F);
        this.frontRightFin.cubeList.add(new ModelBox(frontRightFin, 30, 23, -3.0F, 0.0F, 0.0F, 3, 0, 2, 0.0F, true));

        this.tail = new AdvancedModelRenderer(this);
        this.tail.setRotationPoint(0.25F, -1.9548F, 2.256F);
        this.main.addChild(tail);
        this.tail.cubeList.add(new ModelBox(tail, 0, 9, -2.25F, -1.7952F, -1.256F, 4, 3, 4, 0.0F, false));

        this.cube_r30 = new AdvancedModelRenderer(this);
        this.cube_r30.setRotationPoint(-1.75F, -1.8173F, 2.2783F);
        this.tail.addChild(cube_r30);
        this.setRotateAngle(cube_r30, 1.0472F, 0.0F, 0.0F);
        this.cube_r30.cubeList.add(new ModelBox(cube_r30, 23, 43, 1.5F, -1.925F, -0.975F, 0, 2, 2, 0.0F, false));

        this.cube_r31 = new AdvancedModelRenderer(this);
        this.cube_r31.setRotationPoint(-0.75F, 1.2048F, 2.744F);
        this.tail.addChild(cube_r31);
        this.setRotateAngle(cube_r31, 0.1484F, 0.0F, 0.0F);
        this.cube_r31.cubeList.add(new ModelBox(cube_r31, 0, 35, -1.0F, -1.0F, -3.0F, 3, 1, 3, 0.0F, false));

        this.cube_r32 = new AdvancedModelRenderer(this);
        this.cube_r32.setRotationPoint(-1.25F, -1.7952F, 2.744F);
        this.tail.addChild(cube_r32);
        this.setRotateAngle(cube_r32, -0.1309F, 0.0F, 0.0F);
        this.cube_r32.cubeList.add(new ModelBox(cube_r32, 36, 0, -0.5F, 0.0F, -3.0F, 3, 1, 3, 0.0F, false));

        this.backLeftFin = new AdvancedModelRenderer(this);
        this.backLeftFin.setRotationPoint(1.25F, 1.2048F, -0.256F);
        this.tail.addChild(backLeftFin);
        this.setRotateAngle(backLeftFin, 0.2597F, 0.0338F, -1.0864F);
        this.backLeftFin.cubeList.add(new ModelBox(backLeftFin, 18, 43, 0.0F, 0.0F, 0.0F, 0, 2, 2, 0.0F, false));

        this.backRightFin = new AdvancedModelRenderer(this);
        this.backRightFin.setRotationPoint(-1.75F, 1.2048F, -0.256F);
        this.tail.addChild(backRightFin);
        this.setRotateAngle(backRightFin, 0.2597F, -0.0338F, 1.0864F);
        this.backRightFin.cubeList.add(new ModelBox(backRightFin, 18, 43, 0.0F, 0.0F, 0.0F, 0, 2, 2, 0.0F, true));

        this.tail2 = new AdvancedModelRenderer(this);
        this.tail2.setRotationPoint(-0.375F, -0.2327F, 2.27F);
        this.tail.addChild(tail2);
        this.tail2.cubeList.add(new ModelBox(tail2, 17, 9, -0.875F, -1.0625F, -0.0259F, 2, 2, 5, 0.003F, false));

        this.cube_r33 = new AdvancedModelRenderer(this);
        this.cube_r33.setRotationPoint(-0.375F, -1.0625F, 3.9741F);
        this.tail2.addChild(cube_r33);
        this.setRotateAngle(cube_r33, -0.1309F, 0.0F, 0.0F);
        this.cube_r33.cubeList.add(new ModelBox(cube_r33, 30, 17, -0.5F, 0.0F, -4.0F, 2, 1, 4, 0.0F, false));

        this.cube_r34 = new AdvancedModelRenderer(this);
        this.cube_r34.setRotationPoint(-0.375F, 0.9375F, 3.9741F);
        this.tail2.addChild(cube_r34);
        this.setRotateAngle(cube_r34, 0.1309F, 0.0F, 0.0F);
        this.cube_r34.cubeList.add(new ModelBox(cube_r34, 32, 5, -0.5F, -1.0F, -4.0F, 2, 1, 4, 0.0F, false));

        this.tail3 = new AdvancedModelRenderer(this);
        this.tail3.setRotationPoint(0.125F, -0.5607F, 4.7298F);
        this.tail2.addChild(tail3);


        this.cube_r35 = new AdvancedModelRenderer(this);
        this.cube_r35.setRotationPoint(-0.5F, 0.2482F, -0.0057F);
        this.tail3.addChild(cube_r35);
        this.setRotateAngle(cube_r35, 0.2182F, 0.0F, 0.0F);
        this.cube_r35.cubeList.add(new ModelBox(cube_r35, 17, 17, 0.5F, -0.7F, -0.25F, 0, 3, 6, 0.0F, false));
        this.cube_r35.cubeList.add(new ModelBox(cube_r35, 0, 28, 0.0F, -0.7F, -0.25F, 1, 1, 5, 0.0F, false));
        updateDefaultPose();
    }

    @Override
    public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        this.main.render(f5);
    }

    public void renderStaticWall(float f) {
        this.main.rotateAngleZ = (float) Math.toRadians(0);
        this.main.rotateAngleY = (float) Math.toRadians(180);
        this.main.rotateAngleX = (float) Math.toRadians(270);
        this.main.offsetY = -0.2F;
        this.main.offsetZ = -0.1F;
        this.main.render(0.01F);
        this.resetToDefaultPose();
    }
    public void renderStaticFloor(float f) {
        this.main.offsetZ = -0.05F;
        this.main.offsetY = -0.2F;
        this.main.render(0.01F);
        this.resetToDefaultPose();
    }

    @Override
    public void renderStaticBook(float f) {
        //Rotations, positions and sizing:
        this.main.offsetY = -0.6F;
        this.main.offsetX = 0.8F;
        this.main.offsetZ = 2.0F;
        this.main.rotateAngleY = (float)Math.toRadians(120);
        this.main.rotateAngleX = (float)Math.toRadians(1);
        this.main.rotateAngleZ = (float)Math.toRadians(0);
        this.main.scaleChildren = true;
        float scaler = 1.0F;
        this.main.setScale(scaler, scaler, scaler);
        //Start of pose:
        this.setRotateAngle(main, 0.6F, 3.6F, -0.2F);
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

        //this.head.offsetY = 0.8F;

        AdvancedModelRenderer[] fishTail = {this.tail, this.tail2, this.tail3};

        float speed = 0.186F;
        EntityPrehistoricFloraAgeableBase ee = (EntityPrehistoricFloraAgeableBase) e;
        if (ee.getIsFast()) {
            speed = speed * 2.6F;
        }
        float still = 1f;
        if (f3 == 0.0F) {
            still = 0.8F;
        }
        if (!e.isInWater()) {
            speed = 0.26F;
        }

        //this.head.rotateAngleY += f3 / (180F / (float) Math.PI);
        //this.head.rotateAngleX += f4 / (180F / (float) Math.PI);

        //if (f3 != 0.0F) {this.walk(Jaw, (float) (speed * 1.5), 0.2F, true, 0, 0, f2, 1);}
        if (e.isInWater()) {
            this.chainWave(fishTail, speed * still, 0.02F * still, -0.2, f2, 0.8F * still);
            this.chainSwing(fishTail, speed * still, 0.29F * still, -0.85, f2, 0.5F * still);
            this.swing(main, speed, 0.2F, true, 0, 0, f2, 0.8F);
        }
        else {
            this.swing(main, speed, 0.1F, true, 0, 0, f2, 0.5F);
        }
        this.flap(frontLeftFin, (float) (speed * 0.65), 0.28F, false, 0.8F, 0, f2, 0.5F);
        this.swing(frontLeftFin, (float) (speed * 0.65), 0.18F, true, 0, 0, f2, 0.5F);
        this.flap(frontRightFin, (float) (speed * 0.65), -0.28F, false, 0.8F, 0, f2, 0.5F);
        this.swing(frontRightFin, (float) (speed * 0.65), -0.18F, true, 0, 0, f2, 0.5F);

        this.flap(backLeftFin, (float) (speed * 0.65), 0.28F, false, 1.8F, 0, f2, 0.5F);
        this.swing(backLeftFin, (float) (speed * 0.65), 0.18F, true, 1, 0, f2, 0.5F);
        this.flap(backRightFin, (float) (speed * 0.65), -0.28F, false, 1.8F, 0, f2, 0.5F);
        this.swing(backRightFin, (float) (speed * 0.65), -0.18F, true, 1, 0, f2, 0.5F);


        if (!e.isInWater()) {
            this.main.rotateAngleZ = (float) Math.toRadians(270);
//            this.body.offsetY = -0.05F;
//            this.body.offsetX = -0.5F;
            this.bob(main, -speed * 1.9F, 2.5F, false, f2, 1);
            this.chainWave(fishTail, speed * 1.7F, 0.028F, -3, f2, 1F * still);
            this.chainSwing(fishTail, speed * 1.7F, 0.15F, -3, f2, 1F * still);

        }

    }}
