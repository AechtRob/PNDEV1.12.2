package net.lepidodendron.entity.model.entity;

import net.ilexiconn.llibrary.client.model.tools.AdvancedModelRenderer;
import net.lepidodendron.entity.model.ModelBasePalaeopedia;
import net.minecraft.block.material.Material;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLiving;
import net.minecraft.util.math.BlockPos;

public class ModelParameteoraspis extends ModelBasePalaeopedia {
    private final AdvancedModelRenderer Parameteoraspis;
    private final AdvancedModelRenderer head2;
    private final AdvancedModelRenderer cube_r1;
    private final AdvancedModelRenderer eyes_r1;
    private final AdvancedModelRenderer cube_r2;
    private final AdvancedModelRenderer headleft;
    private final AdvancedModelRenderer cube_r3;
    private final AdvancedModelRenderer cube_r4;
    private final AdvancedModelRenderer cube_r5;
    private final AdvancedModelRenderer cube_r6;
    private final AdvancedModelRenderer cube_r7;
    private final AdvancedModelRenderer cube_r8;
    private final AdvancedModelRenderer cube_r9;
    private final AdvancedModelRenderer cube_r10;
    private final AdvancedModelRenderer headright;
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
    private final AdvancedModelRenderer body4;
    private final AdvancedModelRenderer cube_r21;
    private final AdvancedModelRenderer cube_r22;
    private final AdvancedModelRenderer body5;
    private final AdvancedModelRenderer cube_r23;
    private final AdvancedModelRenderer cube_r24;
    private final AdvancedModelRenderer body6;
    private final AdvancedModelRenderer body7;
    private final AdvancedModelRenderer tailfin3;
    private final AdvancedModelRenderer cube_r25;
    private final AdvancedModelRenderer FinLeft;
    private final AdvancedModelRenderer cube_r26;
    private final AdvancedModelRenderer FinRight;
    private final AdvancedModelRenderer cube_r27;

    public ModelParameteoraspis() {
        this.textureWidth = 128;
        this.textureHeight = 128;

        this.Parameteoraspis = new AdvancedModelRenderer(this);
        this.Parameteoraspis.setRotationPoint(0.0F, 24.0F, 0.0F);


        this.head2 = new AdvancedModelRenderer(this);
        this.head2.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.Parameteoraspis.addChild(head2);
        this.head2.cubeList.add(new ModelBox(head2, 24, 3, -3.0F, -1.05F, -6.0F, 6, 1, 11, 0.0F, false));
        this.head2.cubeList.add(new ModelBox(head2, 61, 12, -1.99F, -1.1F, -7.75F, 4, 1, 2, 0.0F, false));

        this.cube_r1 = new AdvancedModelRenderer(this);
        this.cube_r1.setRotationPoint(0.0F, 0.0F, 2.0F);
        this.head2.addChild(cube_r1);
        this.setRotateAngle(cube_r1, 0.5672F, 0.0F, 0.0F);
        this.cube_r1.cubeList.add(new ModelBox(cube_r1, 0, 14, -1.5F, -6.2F, -7.45F, 3, 1, 2, 0.0F, false));

        this.eyes_r1 = new AdvancedModelRenderer(this);
        this.eyes_r1.setRotationPoint(0.0F, 0.0F, 3.0F);
        this.head2.addChild(eyes_r1);
        this.setRotateAngle(eyes_r1, 0.1309F, 0.0F, 0.0F);
        this.eyes_r1.cubeList.add(new ModelBox(eyes_r1, 22, 16, -3.0F, -3.405F, -5.75F, 6, 0, 3, 0.0F, false));
        this.eyes_r1.cubeList.add(new ModelBox(eyes_r1, 0, 29, -3.0F, -3.4F, -8.55F, 6, 2, 9, 0.0F, false));

        this.cube_r2 = new AdvancedModelRenderer(this);
        this.cube_r2.setRotationPoint(0.0F, 0.0F, 3.0F);
        this.head2.addChild(cube_r2);
        this.setRotateAngle(cube_r2, 0.0873F, 0.0F, 0.0F);
        this.cube_r2.cubeList.add(new ModelBox(cube_r2, 53, 57, -5.0F, -3.4F, 0.25F, 10, 3, 2, 0.0F, false));

        this.headleft = new AdvancedModelRenderer(this);
        this.headleft.setRotationPoint(12.3F, -0.25F, 7.25F);
        this.head2.addChild(headleft);


        this.cube_r3 = new AdvancedModelRenderer(this);
        this.cube_r3.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.headleft.addChild(cube_r3);
        this.setRotateAngle(cube_r3, 0.0F, -0.0349F, 0.0F);
        this.cube_r3.cubeList.add(new ModelBox(cube_r3, 0, 6, -0.779F, -0.13F, -0.0665F, 1, 0, 2, 0.0F, false));

        this.cube_r4 = new AdvancedModelRenderer(this);
        this.cube_r4.setRotationPoint(-6.0F, 0.0F, -1.7F);
        this.headleft.addChild(cube_r4);
        this.setRotateAngle(cube_r4, 0.0F, 0.0873F, 0.0F);
        this.cube_r4.cubeList.add(new ModelBox(cube_r4, 0, 3, 4.05F, -0.13F, 0.15F, 2, 0, 2, 0.0F, false));

        this.cube_r5 = new AdvancedModelRenderer(this);
        this.cube_r5.setRotationPoint(-6.0F, 0.0F, -1.7F);
        this.headleft.addChild(cube_r5);
        this.setRotateAngle(cube_r5, 0.0F, 0.1745F, 0.0F);
        this.cube_r5.cubeList.add(new ModelBox(cube_r5, 0, 18, 3.1F, -0.14F, -1.15F, 3, 0, 2, 0.0F, false));

        this.cube_r6 = new AdvancedModelRenderer(this);
        this.cube_r6.setRotationPoint(-1.4F, 0.25F, -7.7F);
        this.headleft.addChild(cube_r6);
        this.setRotateAngle(cube_r6, 0.0F, 0.3491F, 0.0F);
        this.cube_r6.cubeList.add(new ModelBox(cube_r6, 32, 55, -3.9956F, -1.16F, -0.0028F, 4, 1, 4, -0.001F, false));

        this.cube_r7 = new AdvancedModelRenderer(this);
        this.cube_r7.setRotationPoint(-10.4F, 0.35F, -14.85F);
        this.headleft.addChild(cube_r7);
        this.setRotateAngle(cube_r7, 0.0F, 1.1519F, 0.0F);
        this.cube_r7.cubeList.add(new ModelBox(cube_r7, 50, 23, -3.8762F, -1.26F, -0.1173F, 4, 1, 3, 0.0F, false));

        this.cube_r8 = new AdvancedModelRenderer(this);
        this.cube_r8.setRotationPoint(-7.8F, 0.35F, -13.7F);
        this.headleft.addChild(cube_r8);
        this.setRotateAngle(cube_r8, 0.0F, 1.0297F, 0.0F);
        this.cube_r8.cubeList.add(new ModelBox(cube_r8, 62, 42, -5.2249F, -1.25F, -0.0793F, 4, 1, 2, -0.002F, false));
        this.cube_r8.cubeList.add(new ModelBox(cube_r8, 62, 42, -3.8249F, -1.25F, -0.0793F, 4, 1, 2, -0.001F, false));

        this.cube_r9 = new AdvancedModelRenderer(this);
        this.cube_r9.setRotationPoint(-6.1F, 0.35F, -12.8F);
        this.headleft.addChild(cube_r9);
        this.setRotateAngle(cube_r9, 0.0F, 0.8727F, 0.0F);
        this.cube_r9.cubeList.add(new ModelBox(cube_r9, 48, 0, -6.929F, -1.25F, 0.0F, 7, 1, 3, 0.0F, false));

        this.cube_r10 = new AdvancedModelRenderer(this);
        this.cube_r10.setRotationPoint(-3.8F, 0.25F, -10.7F);
        this.headleft.addChild(cube_r10);
        this.setRotateAngle(cube_r10, 0.0F, 0.6283F, 0.0F);
        this.cube_r10.cubeList.add(new ModelBox(cube_r10, 54, 36, -9.8173F, -1.16F, -0.1651F, 10, 1, 4, 0.0F, false));

        this.headright = new AdvancedModelRenderer(this);
        this.headright.setRotationPoint(-12.3F, -0.25F, 7.25F);
        this.head2.addChild(headright);


        this.cube_r11 = new AdvancedModelRenderer(this);
        this.cube_r11.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.headright.addChild(cube_r11);
        this.setRotateAngle(cube_r11, 0.0F, 0.0349F, 0.0F);
        this.cube_r11.cubeList.add(new ModelBox(cube_r11, 0, 6, -0.221F, -0.13F, -0.0665F, 1, 0, 2, 0.0F, true));

        this.cube_r12 = new AdvancedModelRenderer(this);
        this.cube_r12.setRotationPoint(6.0F, 0.0F, -1.7F);
        this.headright.addChild(cube_r12);
        this.setRotateAngle(cube_r12, 0.0F, -0.0873F, 0.0F);
        this.cube_r12.cubeList.add(new ModelBox(cube_r12, 0, 3, -6.05F, -0.13F, 0.15F, 2, 0, 2, 0.0F, true));

        this.cube_r13 = new AdvancedModelRenderer(this);
        this.cube_r13.setRotationPoint(6.0F, 0.0F, -1.7F);
        this.headright.addChild(cube_r13);
        this.setRotateAngle(cube_r13, 0.0F, -0.1745F, 0.0F);
        this.cube_r13.cubeList.add(new ModelBox(cube_r13, 0, 18, -6.1F, -0.14F, -1.15F, 3, 0, 2, 0.0F, true));

        this.cube_r14 = new AdvancedModelRenderer(this);
        this.cube_r14.setRotationPoint(1.4F, 0.25F, -7.7F);
        this.headright.addChild(cube_r14);
        this.setRotateAngle(cube_r14, 0.0F, -0.3491F, 0.0F);
        this.cube_r14.cubeList.add(new ModelBox(cube_r14, 32, 55, -0.0044F, -1.16F, -0.0028F, 4, 1, 4, -0.001F, true));

        this.cube_r15 = new AdvancedModelRenderer(this);
        this.cube_r15.setRotationPoint(10.4F, 0.35F, -14.85F);
        this.headright.addChild(cube_r15);
        this.setRotateAngle(cube_r15, 0.0F, -1.1519F, 0.0F);
        this.cube_r15.cubeList.add(new ModelBox(cube_r15, 50, 23, -0.1238F, -1.26F, -0.1173F, 4, 1, 3, 0.0F, true));

        this.cube_r16 = new AdvancedModelRenderer(this);
        this.cube_r16.setRotationPoint(7.8F, 0.35F, -13.7F);
        this.headright.addChild(cube_r16);
        this.setRotateAngle(cube_r16, 0.0F, -1.0297F, 0.0F);
        this.cube_r16.cubeList.add(new ModelBox(cube_r16, 62, 42, 1.8249F, -1.25F, -0.0793F, 4, 1, 2, -0.02F, true));
        this.cube_r16.cubeList.add(new ModelBox(cube_r16, 62, 42, -0.1751F, -1.25F, -0.0793F, 4, 1, 2, -0.001F, true));

        this.cube_r17 = new AdvancedModelRenderer(this);
        this.cube_r17.setRotationPoint(6.1F, 0.35F, -12.8F);
        this.headright.addChild(cube_r17);
        this.setRotateAngle(cube_r17, 0.0F, -0.8727F, 0.0F);
        this.cube_r17.cubeList.add(new ModelBox(cube_r17, 48, 0, -0.071F, -1.25F, 0.0F, 7, 1, 3, 0.0F, true));

        this.cube_r18 = new AdvancedModelRenderer(this);
        this.cube_r18.setRotationPoint(15.6354F, -1.2562F, -8.4402F);
        this.headright.addChild(cube_r18);
        this.setRotateAngle(cube_r18, 0.0865F, 0.0114F, 0.4368F);
        this.cube_r18.cubeList.add(new ModelBox(cube_r18, 0, 57, -1.5F, -0.5F, -4.425F, 3, 1, 9, 0.0F, false));

        this.cube_r19 = new AdvancedModelRenderer(this);
        this.cube_r19.setRotationPoint(8.9646F, -1.2562F, -8.4402F);
        this.headright.addChild(cube_r19);
        this.setRotateAngle(cube_r19, 0.0865F, -0.0114F, -0.4368F);
        this.cube_r19.cubeList.add(new ModelBox(cube_r19, 0, 57, -1.5F, -0.5F, -4.425F, 3, 1, 9, 0.0F, true));

        this.cube_r20 = new AdvancedModelRenderer(this);
        this.cube_r20.setRotationPoint(3.8F, 0.25F, -10.7F);
        this.headright.addChild(cube_r20);
        this.setRotateAngle(cube_r20, 0.0F, -0.6283F, 0.0F);
        this.cube_r20.cubeList.add(new ModelBox(cube_r20, 54, 36, -0.1827F, -1.16F, -0.1651F, 10, 1, 4, 0.0F, true));

        this.body4 = new AdvancedModelRenderer(this);
        this.body4.setRotationPoint(0.0F, -1.1F, 4.4F);
        this.head2.addChild(body4);
        this.body4.cubeList.add(new ModelBox(body4, 24, 20, -3.99F, -2.0F, -0.4F, 8, 3, 9, 0.0F, false));

        this.cube_r21 = new AdvancedModelRenderer(this);
        this.cube_r21.setRotationPoint(0.0F, 2.1F, 1.4F);
        this.body4.addChild(cube_r21);
        this.setRotateAngle(cube_r21, 0.1222F, 0.0F, 0.0F);
        this.cube_r21.cubeList.add(new ModelBox(cube_r21, 42, 43, -2.49F, -4.45F, -0.99F, 5, 2, 9, 0.0F, false));

        this.cube_r22 = new AdvancedModelRenderer(this);
        this.cube_r22.setRotationPoint(0.0F, 1.9F, 0.4F);
        this.body4.addChild(cube_r22);
        this.setRotateAngle(cube_r22, 0.1222F, 0.0F, 0.0F);
        this.cube_r22.cubeList.add(new ModelBox(cube_r22, 55, 63, -0.49F, -4.45F, 0.68F, 1, 2, 8, 0.0F, false));

        this.body5 = new AdvancedModelRenderer(this);
        this.body5.setRotationPoint(0.0F, -0.1F, 8.2F);
        this.body4.addChild(body5);
        this.body5.cubeList.add(new ModelBox(body5, 0, 0, -3.5F, -1.9F, -0.1F, 7, 3, 10, -0.001F, false));

        this.cube_r23 = new AdvancedModelRenderer(this);
        this.cube_r23.setRotationPoint(-0.5F, -0.65F, -4.8F);
        this.body5.addChild(cube_r23);
        this.setRotateAngle(cube_r23, -0.1222F, 0.0F, 0.0F);
        this.cube_r23.cubeList.add(new ModelBox(cube_r23, 0, 43, -1.0F, -3.2F, 4.99F, 3, 2, 10, 0.0F, false));

        this.cube_r24 = new AdvancedModelRenderer(this);
        this.cube_r24.setRotationPoint(0.0F, -0.75F, -4.8F);
        this.body5.addChild(cube_r24);
        this.setRotateAngle(cube_r24, -0.1222F, 0.0F, 0.0F);
        this.cube_r24.cubeList.add(new ModelBox(cube_r24, 61, 0, -0.51F, -3.35F, 4.78F, 1, 1, 10, 0.0F, false));

        this.body6 = new AdvancedModelRenderer(this);
        this.body6.setRotationPoint(0.0F, -0.1F, 9.4F);
        this.body5.addChild(body6);
        this.setRotateAngle(body6, 0.0873F, 0.0F, 0.0F);
        this.body6.cubeList.add(new ModelBox(body6, 0, 14, -2.5F, -1.8F, 0.0F, 5, 3, 11, 0.0F, false));
        this.body6.cubeList.add(new ModelBox(body6, 21, 33, 0.0F, -11.1F, 2.15F, 0, 9, 10, 0.0F, false));
        this.body6.cubeList.add(new ModelBox(body6, 54, 23, -0.49F, -2.25F, -0.01F, 1, 1, 11, 0.0F, false));

        this.body7 = new AdvancedModelRenderer(this);
        this.body7.setRotationPoint(0.0F, -1.0F, 10.7F);
        this.body6.addChild(body7);
        this.setRotateAngle(body7, 0.2618F, 0.0F, 0.0F);
        this.body7.cubeList.add(new ModelBox(body7, 17, 53, -1.0F, -1.0F, 0.0F, 2, 2, 10, 0.0F, false));
        this.body7.cubeList.add(new ModelBox(body7, 50, 6, 0.0F, 1.0F, 0.0F, 0, 6, 10, 0.0F, false));

        this.tailfin3 = new AdvancedModelRenderer(this);
        this.tailfin3.setRotationPoint(0.0F, -0.1F, 9.5F);
        this.body7.addChild(tailfin3);
        this.setRotateAngle(tailfin3, -0.1309F, 0.0F, 0.0F);


        this.cube_r25 = new AdvancedModelRenderer(this);
        this.cube_r25.setRotationPoint(0.0F, 0.6772F, -12.6785F);
        this.tailfin3.addChild(cube_r25);
        this.setRotateAngle(cube_r25, 0.3927F, 0.0F, 0.0F);
        this.cube_r25.cubeList.add(new ModelBox(cube_r25, 62, 46, -0.5F, 3.5F, 12.0F, 1, 1, 9, 0.0F, false));
        this.cube_r25.cubeList.add(new ModelBox(cube_r25, 42, 55, 0.0F, 4.5F, 11.0F, 0, 5, 10, 0.0F, false));

        this.FinLeft = new AdvancedModelRenderer(this);
        this.FinLeft.setRotationPoint(7.5F, -0.5F, -1.0F);
        this.head2.addChild(FinLeft);
        this.setRotateAngle(FinLeft, -0.0873F, 0.1745F, 0.0F);
        this.FinLeft.cubeList.add(new ModelBox(FinLeft, 32, 33, -4.0209F, -0.2575F, 3.9432F, 6, 0, 9, 0.0F, false));

        this.cube_r26 = new AdvancedModelRenderer(this);
        this.cube_r26.setRotationPoint(-3.0F, 0.5F, 2.0F);
        this.FinLeft.addChild(cube_r26);
        this.setRotateAngle(cube_r26, 0.0F, 0.3054F, 0.0F);
        this.cube_r26.cubeList.add(new ModelBox(cube_r26, 0, 0, 0.7291F, -0.7575F, 0.9432F, 2, 0, 2, 0.0F, false));

        this.FinRight = new AdvancedModelRenderer(this);
        this.FinRight.setRotationPoint(-7.5F, -0.5F, -1.0F);
        this.head2.addChild(FinRight);
        this.setRotateAngle(FinRight, -0.0873F, -0.1745F, 0.0F);
        this.FinRight.cubeList.add(new ModelBox(FinRight, 32, 33, -1.9791F, -0.2575F, 3.9432F, 6, 0, 9, 0.0F, true));

        this.cube_r27 = new AdvancedModelRenderer(this);
        this.cube_r27.setRotationPoint(3.0F, 0.5F, 2.0F);
        this.FinRight.addChild(cube_r27);
        this.setRotateAngle(cube_r27, 0.0F, -0.3054F, 0.0F);
        this.cube_r27.cubeList.add(new ModelBox(cube_r27, 0, 0, -2.7291F, -0.7575F, 0.9432F, 2, 0, 2, 0.0F, true));

        updateDefaultPose();
    }

    @Override
    public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        this.Parameteoraspis.render(f5);
    }
    public void renderStaticWall(float f) {
        this.Parameteoraspis.offsetY = -0.05F;
        this.Parameteoraspis.offsetZ = 0.007F;
        this.Parameteoraspis.rotateAngleX = (float) Math.toRadians(90);
        this.Parameteoraspis.render(0.01F);
        resetToDefaultPose();
    }

    public void renderStaticFloor(float f) {
        this.setRotateAngle(body4, 0.0F, 0.1F, 0.0F);
        this.setRotateAngle(body5, 0.03F, 0.1F, 0.0F);
        this.setRotateAngle(body6, 0.05F, -0.05F, 0.0F);
        this.setRotateAngle(body7, 0.1F, -0.1F, 0.0F);
        this.Parameteoraspis.offsetY = -0.05F;
        this.Parameteoraspis.offsetZ = -0.2F;
        this.Parameteoraspis.render(0.01F);
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
        this.Parameteoraspis.offsetZ = -0.7F;

        //this.Tailfin.setScale(1.1F, 1.1F, 1.1F);
        AdvancedModelRenderer[] fishTail = {this.body5, this.body6, this.body7, this.tailfin3};

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
            taildegree = 0.25F;
        }

        if (e instanceof EntityLiving && !((EntityLiving) e).isAIDisabled()) {
            this.chainWave(fishTail, speed, 0.05F, -3, f2, 1);
            this.chainSwing(fishTail, speed, taildegree, -3, f2, 1);
            this.swing(head2, speed, 0.15F, true, 0, 0, f2, 1);
            this.flap(FinLeft, (float) (speed * 0.75), 0.12F, true, 0, 0, f2, 1);
            this.swing(FinLeft, (float) (speed * 0.75), 0.12F, true, 0, 0, f2, 1);
            this.flap(FinRight, (float) (speed * 0.75), -0.12F, true, 0, 0, f2, 1);
            this.swing(FinRight, (float) (speed * 0.75), 0.12F, true, 0, 0, f2, 1);
            if (!e.isInWater()) {
                //this.Bodyfront.rotateAngleZ = (float) Math.toRadians(90);
                //this.head.offsetY = 1.0F;
                this.bob(Parameteoraspis, -speed, 2F, false, f2, 1);
                this.chainWave(fishTail, speed, 0.05F, -3, f2, 1);
            }
        }
    }
}
