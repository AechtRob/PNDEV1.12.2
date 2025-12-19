package net.lepidodendron.entity.model.entity;

import net.ilexiconn.llibrary.client.model.tools.AdvancedModelRenderer;
import net.lepidodendron.entity.model.ModelBasePalaeopedia;
import net.minecraft.block.material.Material;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLiving;
import net.minecraft.util.math.BlockPos;

public class ModelBothriolepis extends ModelBasePalaeopedia {
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
    private final AdvancedModelRenderer leftSpine;
    private final AdvancedModelRenderer cube_r15;
    private final AdvancedModelRenderer cube_r16;
    private final AdvancedModelRenderer cube_r17;
    private final AdvancedModelRenderer rightSpine;
    private final AdvancedModelRenderer cube_r18;
    private final AdvancedModelRenderer cube_r19;
    private final AdvancedModelRenderer cube_r20;
    private final AdvancedModelRenderer jaw;
    private final AdvancedModelRenderer cube_r21;
    private final AdvancedModelRenderer tail;
    private final AdvancedModelRenderer cube_r22;
    private final AdvancedModelRenderer cube_r23;
    private final AdvancedModelRenderer tail2;
    private final AdvancedModelRenderer cube_r24;
    private final AdvancedModelRenderer cube_r25;
    private final AdvancedModelRenderer tail3;
    private final AdvancedModelRenderer cube_r26;
    private final AdvancedModelRenderer cube_r27;
    private final AdvancedModelRenderer cube_r28;
    private final AdvancedModelRenderer tail4;
    private final AdvancedModelRenderer cube_r29;
    private final AdvancedModelRenderer cube_r30;
    private final AdvancedModelRenderer cube_r31;

    public ModelBothriolepis() {
        this.textureWidth = 64;
        this.textureHeight = 64;

        this.main = new AdvancedModelRenderer(this);
        this.main.setRotationPoint(0.0F, 24.0F, 6.0F);
        this.main.cubeList.add(new ModelBox(main, 0, 0, -4.0F, -1.0F, -10.925F, 8, 1, 7, 0.003F, false));
        this.main.cubeList.add(new ModelBox(main, 31, 0, -3.5F, -4.0F, -4.175F, 7, 4, 2, -0.003F, false));
        this.main.cubeList.add(new ModelBox(main, 36, 31, -4.0F, -3.0F, -11.925F, 8, 3, 1, -0.006F, false));
        this.main.cubeList.add(new ModelBox(main, 44, 20, -3.0F, -3.0F, -12.9F, 6, 3, 1, -0.003F, false));
        this.main.cubeList.add(new ModelBox(main, 21, 20, -4.0F, -5.3F, -8.0F, 8, 2, 3, 0.003F, false));

        this.cube_r1 = new AdvancedModelRenderer(this);
        this.cube_r1.setRotationPoint(0.0F, -0.6288F, -13.9479F);
        this.main.addChild(cube_r1);
        this.setRotateAngle(cube_r1, -0.1309F, 0.0F, 0.0F);
        this.cube_r1.cubeList.add(new ModelBox(cube_r1, 51, 1, -2.0F, -0.45F, -0.3F, 4, 1, 1, -0.006F, false));

        this.cube_r2 = new AdvancedModelRenderer(this);
        this.cube_r2.setRotationPoint(-1.05F, -3.0463F, -13.5523F);
        this.main.addChild(cube_r2);
        this.setRotateAngle(cube_r2, 1.0356F, 0.235F, -0.1178F);
        this.cube_r2.cubeList.add(new ModelBox(cube_r2, 7, 54, -0.0152F, -0.0236F, -0.5F, 1, 1, 1, 0.0F, true));

        this.cube_r3 = new AdvancedModelRenderer(this);
        this.cube_r3.setRotationPoint(1.05F, -3.0463F, -13.5523F);
        this.main.addChild(cube_r3);
        this.setRotateAngle(cube_r3, 1.0356F, -0.235F, 0.1178F);
        this.cube_r3.cubeList.add(new ModelBox(cube_r3, 7, 54, -0.9848F, -0.0236F, -0.5F, 1, 1, 1, 0.0F, false));

        this.cube_r4 = new AdvancedModelRenderer(this);
        this.cube_r4.setRotationPoint(0.5F, -1.3344F, -14.3299F);
        this.main.addChild(cube_r4);
        this.setRotateAngle(cube_r4, 1.6144F, 0.0F, 0.0F);
        this.cube_r4.cubeList.add(new ModelBox(cube_r4, 28, 49, -3.0F, 0.0F, -1.0F, 5, 4, 1, 0.003F, false));

        this.cube_r5 = new AdvancedModelRenderer(this);
        this.cube_r5.setRotationPoint(0.5F, -1.3344F, -14.3299F);
        this.main.addChild(cube_r5);
        this.setRotateAngle(cube_r5, 1.0341F, 0.0F, 0.0F);
        this.cube_r5.cubeList.add(new ModelBox(cube_r5, 51, 51, -3.0F, 0.0F, 0.0F, 5, 1, 2, 0.0F, false));

        this.cube_r6 = new AdvancedModelRenderer(this);
        this.cube_r6.setRotationPoint(0.5F, -2.0366F, -11.9146F);
        this.main.addChild(cube_r6);
        this.setRotateAngle(cube_r6, 0.4363F, 0.0F, 0.0F);
        this.cube_r6.cubeList.add(new ModelBox(cube_r6, 36, 36, -3.0F, -1.025F, -1.5F, 5, 2, 3, 0.006F, false));

        this.cube_r7 = new AdvancedModelRenderer(this);
        this.cube_r7.setRotationPoint(2.0F, -3.7649F, -12.7128F);
        this.main.addChild(cube_r7);
        this.setRotateAngle(cube_r7, 0.8988F, 0.0F, 0.0F);
        this.cube_r7.cubeList.add(new ModelBox(cube_r7, 41, 49, -5.0F, 0.0F, -1.0F, 6, 1, 1, 0.0F, false));

        this.cube_r8 = new AdvancedModelRenderer(this);
        this.cube_r8.setRotationPoint(0.0F, -4.9527F, -9.9696F);
        this.main.addChild(cube_r8);
        this.setRotateAngle(cube_r8, 0.4102F, 0.0F, 0.0F);
        this.cube_r8.cubeList.add(new ModelBox(cube_r8, 39, 14, -3.0F, 0.0F, -3.0F, 6, 2, 3, 0.003F, false));

        this.cube_r9 = new AdvancedModelRenderer(this);
        this.cube_r9.setRotationPoint(0.0F, -5.3F, -8.0F);
        this.main.addChild(cube_r9);
        this.setRotateAngle(cube_r9, 0.1745F, 0.0F, 0.0F);
        this.cube_r9.cubeList.add(new ModelBox(cube_r9, 19, 26, -4.0F, 0.0F, -2.0F, 8, 2, 2, 0.0F, false));

        this.cube_r10 = new AdvancedModelRenderer(this);
        this.cube_r10.setRotationPoint(-2.0F, -5.561F, -3.0171F);
        this.main.addChild(cube_r10);
        this.setRotateAngle(cube_r10, -0.2182F, 0.0F, 0.0F);
        this.cube_r10.cubeList.add(new ModelBox(cube_r10, 55, 11, 1.0F, 0.161F, 0.05F, 2, 1, 1, -0.003F, false));

        this.cube_r11 = new AdvancedModelRenderer(this);
        this.cube_r11.setRotationPoint(-2.0F, -5.3F, -5.0F);
        this.main.addChild(cube_r11);
        this.setRotateAngle(cube_r11, 0.0436F, 0.0F, 0.0F);
        this.cube_r11.cubeList.add(new ModelBox(cube_r11, 55, 7, 1.0F, 0.0F, 0.0F, 2, 1, 2, 0.0F, false));

        this.cube_r12 = new AdvancedModelRenderer(this);
        this.cube_r12.setRotationPoint(0.0F, -5.3F, -5.0F);
        this.main.addChild(cube_r12);
        this.setRotateAngle(cube_r12, -0.0873F, 0.0F, 0.0F);
        this.cube_r12.cubeList.add(new ModelBox(cube_r12, 0, 33, -3.0F, 0.0F, 0.0F, 6, 2, 3, 0.0F, false));

        this.cube_r13 = new AdvancedModelRenderer(this);
        this.cube_r13.setRotationPoint(-4.5F, -4.0F, -7.425F);
        this.main.addChild(cube_r13);
        this.setRotateAngle(cube_r13, 0.0F, 0.0F, -0.1658F);
        this.cube_r13.cubeList.add(new ModelBox(cube_r13, 21, 9, 0.0F, 0.1F, -3.5F, 2, 3, 7, 0.006F, true));

        this.cube_r14 = new AdvancedModelRenderer(this);
        this.cube_r14.setRotationPoint(4.5F, -4.0F, -7.425F);
        this.main.addChild(cube_r14);
        this.setRotateAngle(cube_r14, 0.0F, 0.0F, 0.1658F);
        this.cube_r14.cubeList.add(new ModelBox(cube_r14, 21, 9, -2.0F, 0.1F, -3.5F, 2, 3, 7, 0.006F, false));

        this.leftSpine = new AdvancedModelRenderer(this);
        this.leftSpine.setRotationPoint(3.5783F, -1.25F, -11.3064F);
        this.main.addChild(leftSpine);
        this.setRotateAngle(leftSpine, -0.0398F, 0.3928F, 0.0082F);
        this.leftSpine.cubeList.add(new ModelBox(leftSpine, 13, 52, -1.5F, -1.0F, 0.0F, 2, 2, 3, 0.0F, false));

        this.cube_r15 = new AdvancedModelRenderer(this);
        this.cube_r15.setRotationPoint(-2.3523F, 0.5F, 8.1991F);
        this.leftSpine.addChild(cube_r15);
        this.setRotateAngle(cube_r15, 0.0F, -0.4363F, 0.0F);
        this.cube_r15.cubeList.add(new ModelBox(cube_r15, 53, 36, -1.0F, -1.0F, -3.0F, 1, 1, 3, -0.003F, false));

        this.cube_r16 = new AdvancedModelRenderer(this);
        this.cube_r16.setRotationPoint(-0.5261F, 0.5F, 5.8191F);
        this.leftSpine.addChild(cube_r16);
        this.setRotateAngle(cube_r16, 0.0F, -0.6545F, 0.0F);
        this.cube_r16.cubeList.add(new ModelBox(cube_r16, 15, 40, -1.0F, -1.0F, 0.0F, 1, 1, 6, 0.0F, false));

        this.cube_r17 = new AdvancedModelRenderer(this);
        this.cube_r17.setRotationPoint(0.5F, 0.5F, 3.0F);
        this.leftSpine.addChild(cube_r17);
        this.setRotateAngle(cube_r17, 0.0F, -0.3491F, 0.0F);
        this.cube_r17.cubeList.add(new ModelBox(cube_r17, 41, 52, -2.0F, -1.5F, 0.0F, 2, 2, 3, 0.003F, false));

        this.rightSpine = new AdvancedModelRenderer(this);
        this.rightSpine.setRotationPoint(-3.5783F, -1.25F, -11.3064F);
        this.main.addChild(rightSpine);
        this.setRotateAngle(rightSpine, -0.0398F, -0.3928F, -0.0082F);
        this.rightSpine.cubeList.add(new ModelBox(rightSpine, 13, 52, -0.5F, -1.0F, 0.0F, 2, 2, 3, 0.0F, true));

        this.cube_r18 = new AdvancedModelRenderer(this);
        this.cube_r18.setRotationPoint(2.3523F, 0.5F, 8.1991F);
        this.rightSpine.addChild(cube_r18);
        this.setRotateAngle(cube_r18, 0.0F, 0.4363F, 0.0F);
        this.cube_r18.cubeList.add(new ModelBox(cube_r18, 53, 36, 0.0F, -1.0F, -3.0F, 1, 1, 3, -0.003F, true));

        this.cube_r19 = new AdvancedModelRenderer(this);
        this.cube_r19.setRotationPoint(0.5261F, 0.5F, 5.8191F);
        this.rightSpine.addChild(cube_r19);
        this.setRotateAngle(cube_r19, 0.0F, 0.6545F, 0.0F);
        this.cube_r19.cubeList.add(new ModelBox(cube_r19, 15, 40, 0.0F, -1.0F, 0.0F, 1, 1, 6, 0.0F, true));

        this.cube_r20 = new AdvancedModelRenderer(this);
        this.cube_r20.setRotationPoint(-0.5F, 0.5F, 3.0F);
        this.rightSpine.addChild(cube_r20);
        this.setRotateAngle(cube_r20, 0.0F, 0.3491F, 0.0F);
        this.cube_r20.cubeList.add(new ModelBox(cube_r20, 41, 52, 0.0F, -1.5F, 0.0F, 2, 2, 3, 0.003F, true));

        this.jaw = new AdvancedModelRenderer(this);
        this.jaw.setRotationPoint(0.0F, -0.6093F, -12.4985F);
        this.main.addChild(jaw);


        this.cube_r21 = new AdvancedModelRenderer(this);
        this.cube_r21.setRotationPoint(0.0F, -0.0631F, -0.4503F);
        this.jaw.addChild(cube_r21);
        this.setRotateAngle(cube_r21, 0.0436F, 0.0F, 0.0F);
        this.cube_r21.cubeList.add(new ModelBox(cube_r21, 25, 58, -2.0F, -0.325F, -0.425F, 4, 1, 1, -0.01F, false));

        this.tail = new AdvancedModelRenderer(this);
        this.tail.setRotationPoint(0.0F, -3.0943F, -2.9841F);
        this.main.addChild(tail);


        this.cube_r22 = new AdvancedModelRenderer(this);
        this.cube_r22.setRotationPoint(-1.0F, -1.9057F, 0.3341F);
        this.tail.addChild(cube_r22);
        this.setRotateAngle(cube_r22, -0.1745F, 0.0F, 0.0F);
        this.cube_r22.cubeList.add(new ModelBox(cube_r22, 0, 24, -1.5F, 0.0F, 0.0F, 5, 4, 4, 0.0F, false));

        this.cube_r23 = new AdvancedModelRenderer(this);
        this.cube_r23.setRotationPoint(-1.0F, 3.0943F, 0.3591F);
        this.tail.addChild(cube_r23);
        this.setRotateAngle(cube_r23, 0.0436F, 0.0F, 0.0F);
        this.cube_r23.cubeList.add(new ModelBox(cube_r23, 40, 26, -1.5F, -1.025F, 0.225F, 5, 1, 3, -0.003F, false));

        this.tail2 = new AdvancedModelRenderer(this);
        this.tail2.setRotationPoint(0.0F, -0.124F, 3.5924F);
        this.tail.addChild(tail2);


        this.cube_r24 = new AdvancedModelRenderer(this);
        this.cube_r24.setRotationPoint(-1.0F, 3.2183F, -3.2333F);
        this.tail2.addChild(cube_r24);
        this.setRotateAngle(cube_r24, 0.0436F, 0.0F, 0.0F);
        this.cube_r24.cubeList.add(new ModelBox(cube_r24, 30, 42, -0.5F, -2.05F, 2.675F, 3, 2, 4, -0.003F, false));

        this.cube_r25 = new AdvancedModelRenderer(this);
        this.cube_r25.setRotationPoint(-1.0F, -1.1502F, 0.1733F);
        this.tail2.addChild(cube_r25);
        this.setRotateAngle(cube_r25, -0.2618F, 0.0F, 0.0F);
        this.cube_r25.cubeList.add(new ModelBox(cube_r25, 0, 39, -0.5F, 0.0F, 0.0F, 3, 3, 4, 0.0F, false));

        this.tail3 = new AdvancedModelRenderer(this);
        this.tail3.setRotationPoint(0.0F, 1.506F, 3.213F);
        this.tail2.addChild(tail3);


        this.cube_r26 = new AdvancedModelRenderer(this);
        this.cube_r26.setRotationPoint(-0.5F, 0.9681F, 5.0365F);
        this.tail3.addChild(cube_r26);
        this.setRotateAngle(cube_r26, 0.0742F, 0.0F, 0.0F);
        this.cube_r26.cubeList.add(new ModelBox(cube_r26, 45, 42, -0.5F, -0.975F, -5.0F, 2, 1, 5, -0.003F, false));

        this.cube_r27 = new AdvancedModelRenderer(this);
        this.cube_r27.setRotationPoint(-4.5F, -1.7923F, 0.2936F);
        this.tail3.addChild(cube_r27);
        this.setRotateAngle(cube_r27, -0.3927F, 0.0F, 0.0F);
        this.cube_r27.cubeList.add(new ModelBox(cube_r27, 0, 54, 4.5F, -2.85F, 0.5F, 0, 3, 3, 0.0F, false));

        this.cube_r28 = new AdvancedModelRenderer(this);
        this.cube_r28.setRotationPoint(-0.5F, -0.7876F, 2.1786F);
        this.tail3.addChild(cube_r28);
        this.setRotateAngle(cube_r28, -0.1309F, 0.0F, 0.0F);
        this.cube_r28.cubeList.add(new ModelBox(cube_r28, 40, 7, -0.5F, -0.6F, -2.0F, 2, 2, 5, 0.0F, false));

        this.tail4 = new AdvancedModelRenderer(this);
        this.tail4.setRotationPoint(0.0F, -0.8343F, 4.6725F);
        this.tail3.addChild(tail4);


        this.cube_r29 = new AdvancedModelRenderer(this);
        this.cube_r29.setRotationPoint(0.0F, -0.617F, 6.9463F);
        this.tail4.addChild(cube_r29);
        this.setRotateAngle(cube_r29, 0.0436F, 0.0F, 0.0F);
        this.cube_r29.cubeList.add(new ModelBox(cube_r29, 0, 47, -0.5F, -0.55F, -0.075F, 1, 1, 5, 0.0F, false));

        this.cube_r30 = new AdvancedModelRenderer(this);
        this.cube_r30.setRotationPoint(-0.5F, 0.2966F, 0.0062F);
        this.tail4.addChild(cube_r30);
        this.setRotateAngle(cube_r30, 0.1527F, 0.0F, 0.0F);
        this.cube_r30.cubeList.add(new ModelBox(cube_r30, 0, 9, 0.5F, -1.4F, 0.0F, 0, 4, 10, 0.0F, false));

        this.cube_r31 = new AdvancedModelRenderer(this);
        this.cube_r31.setRotationPoint(0.0F, 0.2966F, 0.0062F);
        this.tail4.addChild(cube_r31);
        this.setRotateAngle(cube_r31, 0.1745F, 0.0F, 0.0F);
        this.cube_r31.cubeList.add(new ModelBox(cube_r31, 19, 31, -0.5F, -0.25F, 0.0F, 1, 1, 7, 0.003F, false));

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
        this.setRotateAngle(main, 0.1F, -0.1F, 0.0F);
        this.setRotateAngle(cube_r1, -0.1309F, 0.0F, 0.0F);
        this.setRotateAngle(cube_r10, -0.2182F, 0.0F, 0.0F);
        this.setRotateAngle(cube_r11, 0.0436F, 0.0F, 0.0F);
        this.setRotateAngle(cube_r12, -0.0873F, 0.0F, 0.0F);
        this.setRotateAngle(cube_r13, 0.0F, 0.0F, -0.1658F);
        this.setRotateAngle(cube_r14, 0.0F, 0.0F, 0.1658F);
        this.setRotateAngle(cube_r15, 0.0F, -0.4363F, 0.0F);
        this.setRotateAngle(cube_r16, 0.0F, -0.6545F, 0.0F);
        this.setRotateAngle(cube_r17, 0.0F, -0.3491F, 0.0F);
        this.setRotateAngle(cube_r18, 0.0F, 0.4363F, 0.0F);
        this.setRotateAngle(cube_r19, 0.0F, 0.6545F, 0.0F);
        this.setRotateAngle(cube_r2, 1.0356F, 0.235F, -0.1178F);
        this.setRotateAngle(cube_r20, 0.0F, 0.3491F, 0.0F);
        this.setRotateAngle(cube_r21, 0.0436F, 0.0F, 0.0F);
        this.setRotateAngle(cube_r22, -0.1745F, 0.0F, 0.0F);
        this.setRotateAngle(cube_r23, 0.0436F, 0.0F, 0.0F);
        this.setRotateAngle(cube_r24, 0.0436F, 0.0F, 0.0F);
        this.setRotateAngle(cube_r25, -0.2618F, 0.0F, 0.0F);
        this.setRotateAngle(cube_r26, 0.0742F, 0.0F, 0.0F);
        this.setRotateAngle(cube_r27, -0.3927F, 0.0F, 0.0F);
        this.setRotateAngle(cube_r28, -0.1309F, 0.0F, 0.0F);
        this.setRotateAngle(cube_r29, 0.0436F, 0.0F, 0.0F);
        this.setRotateAngle(cube_r3, 1.0356F, -0.235F, 0.1178F);
        this.setRotateAngle(cube_r30, 0.1527F, 0.0F, 0.0F);
        this.setRotateAngle(cube_r31, 0.1745F, 0.0F, 0.0F);
        this.setRotateAngle(cube_r4, 1.6144F, 0.0F, 0.0F);
        this.setRotateAngle(cube_r5, 1.0341F, 0.0F, 0.0F);
        this.setRotateAngle(cube_r6, 0.4363F, 0.0F, 0.0F);
        this.setRotateAngle(cube_r7, 0.8988F, 0.0F, 0.0F);
        this.setRotateAngle(cube_r8, 0.4102F, 0.0F, 0.0F);
        this.setRotateAngle(cube_r9, 0.1745F, 0.0F, 0.0F);
        this.setRotateAngle(jaw, 1.3134F, 0.0F, 0.0F);
        this.setRotateAngle(leftSpine, -0.0398F, 0.3928F, 0.0082F);
        this.setRotateAngle(main, -0.4084F, -0.1093F, -0.0957F);
        this.setRotateAngle(rightSpine, -0.0398F, -0.3928F, -0.0082F);
        this.setRotateAngle(tail, 0.1538F, 0.1164F, 0.018F);
        this.setRotateAngle(tail2, 0.0F, 0.2269F, 0.0F);
        this.setRotateAngle(tail3, 0.0987F, 0.2345F, 0.023F);
        this.setRotateAngle(tail4, 0.0F, 0.4145F, 0.0F);
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
        //this.main.offsetY = 0.95F;

        //this.Tailfin.setScale(1.1F, 1.1F, 1.1F);
        AdvancedModelRenderer[] fishTail = {this.tail, this.tail2, this.tail3, this.tail4};


        float speed = 0.4F;
        float taildegree = 0.35F;

        if (!e.isInWater()) {
            speed = 0.7F;
        }

        boolean isAtBottom = false;
        if (e.getPosition().getY() - 1 > 1) {
            BlockPos pos = new BlockPos(e.getPosition().getX(), e.getPosition().getY() - 1, e.getPosition().getZ());
            isAtBottom = ((e.isInsideOfMaterial(Material.WATER) || e.isInsideOfMaterial(Material.CORAL))
                    && ((e.world.getBlockState(pos)).getMaterial() != Material.WATER)
                    && ((double)e.getPosition().getY() + 0.334D) > e.posY);
        }
        if (isAtBottom) {
            //System.err.println("Animation at bottom");
            speed = 0.15F;
            taildegree = 0.15F;
        }

        if (e instanceof EntityLiving && !((EntityLiving) e).isAIDisabled()) {
            this.chainWave(fishTail, speed, 0.05F, -3, f2, 1);
            this.chainSwing(fishTail, speed, taildegree, -3, f2, 1);
            this.swing(main, speed, 0.3F, true, 0, 0, f2, 1);
            this.walk(jaw, (float) (speed * 0.75), -0.3F, true, 0, 0, f2, 1);


            if (!e.isInWater()) {
                //this.mainfront.rotateAngleZ = (float) Math.toRadians(90);
                this.main.offsetY = 0.95F -0.95F;
                this.bob(main, -speed, 2F, false, f2, 1);
                this.chainWave(fishTail, speed, 0.2F, -3, f2, 1);
            }
        }
    }
}
