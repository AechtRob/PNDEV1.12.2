package net.lepidodendron.entity.model.entity;

import net.ilexiconn.llibrary.client.model.tools.AdvancedModelRenderer;
import net.lepidodendron.entity.model.ModelBasePalaeopedia;
import net.minecraft.block.material.Material;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLiving;
import net.minecraft.util.math.BlockPos;

public class ModelGrossaspis extends ModelBasePalaeopedia {
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
    private final AdvancedModelRenderer rightSpike;
    private final AdvancedModelRenderer cube_r17;
    private final AdvancedModelRenderer leftSpike;
    private final AdvancedModelRenderer cube_r18;
    private final AdvancedModelRenderer head;
    private final AdvancedModelRenderer cube_r19;
    private final AdvancedModelRenderer cube_r20;
    private final AdvancedModelRenderer cube_r21;
    private final AdvancedModelRenderer cube_r22;
    private final AdvancedModelRenderer cube_r23;
    private final AdvancedModelRenderer tail;
    private final AdvancedModelRenderer cube_r24;
    private final AdvancedModelRenderer cube_r25;
    private final AdvancedModelRenderer tail2;
    private final AdvancedModelRenderer cube_r26;
    private final AdvancedModelRenderer cube_r27;
    private final AdvancedModelRenderer tail3;
    private final AdvancedModelRenderer cube_r28;
    private final AdvancedModelRenderer cube_r29;
    private final AdvancedModelRenderer tail4;
    private final AdvancedModelRenderer cube_r30;
    private final AdvancedModelRenderer cube_r31;

    public ModelGrossaspis() {
        this.textureWidth = 52;
        this.textureHeight = 50;

        this.main = new AdvancedModelRenderer(this);
        this.main.setRotationPoint(0.0F, 24.0F, -6.0F);


        this.cube_r1 = new AdvancedModelRenderer(this);
        this.cube_r1.setRotationPoint(0.0F, -0.0653F, 3.5043F);
        this.main.addChild(cube_r1);
        this.setRotateAngle(cube_r1, 0.1571F, 0.0F, 0.0F);
        this.cube_r1.cubeList.add(new ModelBox(cube_r1, 0, 0, -2.0F, -1.0F, 0.0F, 4, 1, 4, -0.006F, false));

        this.cube_r2 = new AdvancedModelRenderer(this);
        this.cube_r2.setRotationPoint(0.5F, -4.9214F, 5.6754F);
        this.main.addChild(cube_r2);
        this.setRotateAngle(cube_r2, -1.1432F, 0.0F, 0.0F);
        this.cube_r2.cubeList.add(new ModelBox(cube_r2, 42, 46, -1.0F, 0.975F, -3.075F, 1, 1, 1, -0.01F, false));
        this.cube_r2.cubeList.add(new ModelBox(cube_r2, 43, 6, -1.0F, 1.0F, -2.825F, 1, 1, 3, 0.0F, false));
        this.cube_r2.cubeList.add(new ModelBox(cube_r2, 26, 21, -1.0F, 0.0F, -4.825F, 1, 1, 5, 0.0F, false));

        this.cube_r3 = new AdvancedModelRenderer(this);
        this.cube_r3.setRotationPoint(0.5F, -5.0213F, 6.054F);
        this.main.addChild(cube_r3);
        this.setRotateAngle(cube_r3, -0.8552F, 0.0F, 0.0F);
        this.cube_r3.cubeList.add(new ModelBox(cube_r3, 0, 43, -1.0F, 0.0F, -2.0F, 1, 1, 3, -0.01F, false));

        this.cube_r4 = new AdvancedModelRenderer(this);
        this.cube_r4.setRotationPoint(0.5F, -4.9345F, 2.3055F);
        this.main.addChild(cube_r4);
        this.setRotateAngle(cube_r4, 0.637F, 0.0F, 0.0F);
        this.cube_r4.cubeList.add(new ModelBox(cube_r4, 24, 44, -1.0F, -0.7F, -1.8F, 1, 1, 3, 0.0F, false));

        this.cube_r5 = new AdvancedModelRenderer(this);
        this.cube_r5.setRotationPoint(0.5F, -4.928F, 2.2943F);
        this.main.addChild(cube_r5);
        this.setRotateAngle(cube_r5, 1.5097F, 0.0F, 0.0F);
        this.cube_r5.cubeList.add(new ModelBox(cube_r5, 0, 24, -1.0F, 0.1F, -0.55F, 1, 1, 5, 0.01F, false));

        this.cube_r6 = new AdvancedModelRenderer(this);
        this.cube_r6.setRotationPoint(0.0F, -5.6043F, 2.7367F);
        this.main.addChild(cube_r6);
        this.setRotateAngle(cube_r6, -0.1309F, 0.0F, 0.0F);
        this.cube_r6.cubeList.add(new ModelBox(cube_r6, 41, 12, -2.0F, 0.0F, 1.175F, 4, 2, 1, -0.001F, false));
        this.cube_r6.cubeList.add(new ModelBox(cube_r6, 39, 20, -2.0F, 0.0F, 0.0F, 4, 2, 2, 0.01F, false));

        this.cube_r7 = new AdvancedModelRenderer(this);
        this.cube_r7.setRotationPoint(0.0F, -4.2114F, -0.6912F);
        this.main.addChild(cube_r7);
        this.setRotateAngle(cube_r7, 0.3927F, 0.0F, 0.0F);
        this.cube_r7.cubeList.add(new ModelBox(cube_r7, 17, 0, -2.0F, 0.025F, 0.7F, 4, 2, 3, 0.0F, false));

        this.cube_r8 = new AdvancedModelRenderer(this);
        this.cube_r8.setRotationPoint(-0.003F, -3.0785F, 4.9531F);
        this.main.addChild(cube_r8);
        this.setRotateAngle(cube_r8, 0.3491F, 0.0F, 0.0F);
        this.cube_r8.cubeList.add(new ModelBox(cube_r8, 39, 36, -2.0F, -1.0F, -1.0F, 4, 3, 1, -0.01F, false));

        this.cube_r9 = new AdvancedModelRenderer(this);
        this.cube_r9.setRotationPoint(0.0F, -4.8911F, 5.7983F);
        this.main.addChild(cube_r9);
        this.setRotateAngle(cube_r9, -0.4363F, 0.0F, 0.0F);
        this.cube_r9.cubeList.add(new ModelBox(cube_r9, 26, 40, -2.0F, 0.0F, -1.0F, 4, 2, 1, 0.0F, false));

        this.cube_r10 = new AdvancedModelRenderer(this);
        this.cube_r10.setRotationPoint(-2.5548F, -3.0549F, 2.762F);
        this.main.addChild(cube_r10);
        this.setRotateAngle(cube_r10, -0.1059F, 0.0344F, 0.3485F);
        this.cube_r10.cubeList.add(new ModelBox(cube_r10, 13, 35, 0.0F, -1.625F, -2.0F, 2, 1, 4, -0.005F, false));
        this.cube_r10.cubeList.add(new ModelBox(cube_r10, 26, 34, 0.0F, -1.0F, -1.975F, 2, 1, 4, 0.003F, false));

        this.cube_r11 = new AdvancedModelRenderer(this);
        this.cube_r11.setRotationPoint(2.5548F, -3.0549F, 2.762F);
        this.main.addChild(cube_r11);
        this.setRotateAngle(cube_r11, -0.1059F, -0.0344F, -0.3485F);
        this.cube_r11.cubeList.add(new ModelBox(cube_r11, 32, 0, -2.0F, -1.625F, -2.0F, 2, 1, 4, -0.005F, false));
        this.cube_r11.cubeList.add(new ModelBox(cube_r11, 0, 31, -2.0F, -1.0F, -1.975F, 2, 1, 4, 0.003F, false));

        this.cube_r12 = new AdvancedModelRenderer(this);
        this.cube_r12.setRotationPoint(-1.6533F, -1.6977F, 3.5699F);
        this.main.addChild(cube_r12);
        this.setRotateAngle(cube_r12, -0.1065F, -0.0324F, -0.2588F);
        this.cube_r12.cubeList.add(new ModelBox(cube_r12, 28, 13, -0.55F, -1.45F, -2.95F, 2, 2, 4, 0.003F, false));

        this.cube_r13 = new AdvancedModelRenderer(this);
        this.cube_r13.setRotationPoint(1.6533F, -1.6977F, 3.5699F);
        this.main.addChild(cube_r13);
        this.setRotateAngle(cube_r13, -0.1065F, 0.0324F, 0.2588F);
        this.cube_r13.cubeList.add(new ModelBox(cube_r13, 13, 28, -1.45F, -1.45F, -2.95F, 2, 2, 4, 0.003F, false));

        this.cube_r14 = new AdvancedModelRenderer(this);
        this.cube_r14.setRotationPoint(0.0F, -1.5066F, 0.482F);
        this.main.addChild(cube_r14);
        this.setRotateAngle(cube_r14, 0.7505F, 0.0F, 0.0F);
        this.cube_r14.cubeList.add(new ModelBox(cube_r14, 41, 16, -1.5F, -0.55F, -1.05F, 3, 1, 2, 0.02F, false));

        this.cube_r15 = new AdvancedModelRenderer(this);
        this.cube_r15.setRotationPoint(0.5F, -0.0914F, 0.5044F);
        this.main.addChild(cube_r15);
        this.setRotateAngle(cube_r15, -0.1134F, 0.0F, 0.0F);
        this.cube_r15.cubeList.add(new ModelBox(cube_r15, 13, 41, -2.0F, -1.05F, -1.825F, 3, 1, 2, 0.03F, false));

        this.cube_r16 = new AdvancedModelRenderer(this);
        this.cube_r16.setRotationPoint(0.0F, -0.0653F, 3.5043F);
        this.main.addChild(cube_r16);
        this.setRotateAngle(cube_r16, -0.0087F, 0.0F, 0.0F);
        this.cube_r16.cubeList.add(new ModelBox(cube_r16, 13, 14, -2.0F, -2.975F, -3.0F, 4, 3, 3, -0.006F, false));

        this.rightSpike = new AdvancedModelRenderer(this);
        this.rightSpike.setRotationPoint(-1.3022F, -1.04F, -0.7715F);
        this.main.addChild(rightSpike);
        this.setRotateAngle(rightSpike, 1.4096F, -0.9192F, 0.1156F);
        this.rightSpike.cubeList.add(new ModelBox(rightSpike, 18, 45, -0.25F, 0.0F, -0.75F, 1, 2, 1, 0.003F, true));

        this.cube_r17 = new AdvancedModelRenderer(this);
        this.cube_r17.setRotationPoint(-0.25F, 2.0F, 0.0F);
        this.rightSpike.addChild(cube_r17);
        this.setRotateAngle(cube_r17, 0.0F, 0.0F, -0.4276F);
        this.cube_r17.cubeList.add(new ModelBox(cube_r17, 46, 41, 0.0F, -0.025F, -0.3F, 1, 4, 0, -0.006F, true));

        this.leftSpike = new AdvancedModelRenderer(this);
        this.leftSpike.setRotationPoint(1.3022F, -1.04F, -0.7715F);
        this.main.addChild(leftSpike);
        this.setRotateAngle(leftSpike, 1.4096F, 0.9192F, -0.1156F);
        this.leftSpike.cubeList.add(new ModelBox(leftSpike, 18, 45, -0.75F, 0.0F, -0.75F, 1, 2, 1, 0.003F, false));

        this.cube_r18 = new AdvancedModelRenderer(this);
        this.cube_r18.setRotationPoint(0.25F, 2.0F, 0.0F);
        this.leftSpike.addChild(cube_r18);
        this.setRotateAngle(cube_r18, 0.0F, 0.0F, 0.4276F);
        this.cube_r18.cubeList.add(new ModelBox(cube_r18, 46, 41, -1.0F, -0.025F, -0.3F, 1, 4, 0, -0.006F, false));

        this.head = new AdvancedModelRenderer(this);
        this.head.setRotationPoint(-0.5F, -4.1903F, -0.2957F);
        this.main.addChild(head);


        this.cube_r19 = new AdvancedModelRenderer(this);
        this.cube_r19.setRotationPoint(0.5F, 0.435F, -0.2474F);
        this.head.addChild(cube_r19);
        this.setRotateAngle(cube_r19, 0.8029F, 0.0F, 0.0F);
        this.cube_r19.cubeList.add(new ModelBox(cube_r19, 9, 45, -1.5F, 0.0F, 0.0F, 3, 2, 1, 0.003F, false));

        this.cube_r20 = new AdvancedModelRenderer(this);
        this.cube_r20.setRotationPoint(0.075F, 1.368F, -0.8384F);
        this.head.addChild(cube_r20);
        this.setRotateAngle(cube_r20, 1.2449F, 0.3259F, -0.1229F);
        this.cube_r20.cubeList.add(new ModelBox(cube_r20, 47, 46, -0.7F, -0.025F, -0.5F, 1, 1, 1, 0.0F, true));

        this.cube_r21 = new AdvancedModelRenderer(this);
        this.cube_r21.setRotationPoint(0.925F, 1.368F, -0.8384F);
        this.head.addChild(cube_r21);
        this.setRotateAngle(cube_r21, 1.2449F, -0.3259F, 0.1229F);
        this.cube_r21.cubeList.add(new ModelBox(cube_r21, 47, 46, -0.3F, -0.025F, -0.5F, 1, 1, 1, 0.0F, false));

        this.cube_r22 = new AdvancedModelRenderer(this);
        this.cube_r22.setRotationPoint(0.5F, 2.3316F, -0.882F);
        this.head.addChild(cube_r22);
        this.setRotateAngle(cube_r22, 1.5272F, 0.0F, 0.0F);
        this.cube_r22.cubeList.add(new ModelBox(cube_r22, 33, 46, -1.5F, 0.0F, -1.0F, 3, 2, 1, 0.003F, false));

        this.cube_r23 = new AdvancedModelRenderer(this);
        this.cube_r23.setRotationPoint(0.5F, 0.435F, -0.2474F);
        this.head.addChild(cube_r23);
        this.setRotateAngle(cube_r23, 1.2479F, 0.0F, 0.0F);
        this.cube_r23.cubeList.add(new ModelBox(cube_r23, 39, 31, -1.5F, 0.0F, -2.0F, 3, 2, 2, 0.01F, false));

        this.tail = new AdvancedModelRenderer(this);
        this.tail.setRotationPoint(0.0F, -3.4357F, 5.8099F);
        this.main.addChild(tail);


        this.cube_r24 = new AdvancedModelRenderer(this);
        this.cube_r24.setRotationPoint(-3.0F, 1.9903F, 2.7875F);
        this.tail.addChild(cube_r24);
        this.setRotateAngle(cube_r24, 0.1789F, 0.0F, 0.0F);
        this.cube_r24.cubeList.add(new ModelBox(cube_r24, 15, 6, 1.5F, -1.575F, -3.9F, 3, 2, 4, -0.01F, false));

        this.cube_r25 = new AdvancedModelRenderer(this);
        this.cube_r25.setRotationPoint(-1.0F, -1.3643F, 0.1901F);
        this.tail.addChild(cube_r25);
        this.setRotateAngle(cube_r25, -0.1265F, 0.0F, 0.0F);
        this.cube_r25.cubeList.add(new ModelBox(cube_r25, 0, 6, -0.5F, 0.0F, -1.0F, 3, 3, 4, 0.01F, false));

        this.tail2 = new AdvancedModelRenderer(this);
        this.tail2.setRotationPoint(0.0F, -0.4786F, 2.8646F);
        this.tail.addChild(tail2);
        this.setRotateAngle(tail2, -0.0873F, 0.0F, 0.0F);
        this.tail2.cubeList.add(new ModelBox(tail2, 26, 28, -1.5F, -0.4858F, -0.4745F, 3, 2, 3, 0.0F, false));

        this.cube_r26 = new AdvancedModelRenderer(this);
        this.cube_r26.setRotationPoint(-1.5F, -0.4858F, 0.0255F);
        this.tail2.addChild(cube_r26);
        this.setRotateAngle(cube_r26, 1.1345F, 0.0F, 0.0F);
        this.cube_r26.cubeList.add(new ModelBox(cube_r26, 45, 0, 1.5F, 0.35F, -0.5F, 0, 2, 3, 0.0F, false));

        this.cube_r27 = new AdvancedModelRenderer(this);
        this.cube_r27.setRotationPoint(-1.0F, 2.8692F, -0.2031F);
        this.tail2.addChild(cube_r27);
        this.setRotateAngle(cube_r27, 0.2662F, 0.0F, 0.0F);
        this.cube_r27.cubeList.add(new ModelBox(cube_r27, 30, 6, -0.5F, -1.975F, 0.0F, 3, 2, 3, -0.02F, false));

        this.tail3 = new AdvancedModelRenderer(this);
        this.tail3.setRotationPoint(0.0F, -0.11F, 2.2642F);
        this.tail2.addChild(tail3);


        this.cube_r28 = new AdvancedModelRenderer(this);
        this.cube_r28.setRotationPoint(-0.5F, 2.1802F, 0.229F);
        this.tail3.addChild(cube_r28);
        this.setRotateAngle(cube_r28, 0.2051F, 0.0F, 0.0F);
        this.cube_r28.cubeList.add(new ModelBox(cube_r28, 0, 37, -0.5F, -0.975F, -0.325F, 2, 1, 4, -0.006F, false));

        this.cube_r29 = new AdvancedModelRenderer(this);
        this.cube_r29.setRotationPoint(-0.5F, 0.7563F, -0.1442F);
        this.tail3.addChild(cube_r29);
        this.setRotateAngle(cube_r29, 0.0873F, 0.0F, 0.0F);
        this.cube_r29.cubeList.add(new ModelBox(cube_r29, 13, 21, -0.5F, -1.075F, -0.1F, 2, 2, 4, 0.0F, false));

        this.tail4 = new AdvancedModelRenderer(this);
        this.tail4.setRotationPoint(0.0F, 0.0225F, 3.2467F);
        this.tail3.addChild(tail4);
        this.setRotateAngle(tail4, 0.1745F, 0.0F, 0.0F);


        this.cube_r30 = new AdvancedModelRenderer(this);
        this.cube_r30.setRotationPoint(0.0F, -0.2239F, 2.8041F);
        this.tail4.addChild(cube_r30);
        this.setRotateAngle(cube_r30, 0.5672F, 0.0F, 0.0F);
        this.cube_r30.cubeList.add(new ModelBox(cube_r30, 37, 41, -0.5F, -1.0F, -3.0F, 1, 1, 3, -0.006F, false));

        this.cube_r31 = new AdvancedModelRenderer(this);
        this.cube_r31.setRotationPoint(-1.5F, 0.9615F, -3.5328F);
        this.tail4.addChild(cube_r31);
        this.setRotateAngle(cube_r31, 0.3054F, 0.0F, 0.0F);
        this.cube_r31.cubeList.add(new ModelBox(cube_r31, 0, 14, 1.5F, -0.2F, 3.4F, 0, 3, 6, 0.0F, false));
        this.cube_r31.cubeList.add(new ModelBox(cube_r31, 39, 25, 1.0F, -0.225F, 3.4F, 1, 1, 4, 0.0F, false));

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


            if (!e.isInWater()) {
                //this.mainfront.rotateAngleZ = (float) Math.toRadians(90);
                this.main.offsetY = 0.01F;
                this.bob(main, -speed, 2F, false, f2, 1);
                this.chainWave(fishTail, speed, 0.2F, -3, f2, 1);
            }
        }
    }
}
