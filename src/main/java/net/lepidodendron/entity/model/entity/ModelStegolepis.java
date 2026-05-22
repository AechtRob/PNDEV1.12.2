package net.lepidodendron.entity.model.entity;

import net.ilexiconn.llibrary.client.model.tools.AdvancedModelRenderer;
import net.lepidodendron.entity.model.ModelBasePalaeopedia;
import net.minecraft.block.material.Material;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLiving;
import net.minecraft.util.math.BlockPos;

public class ModelStegolepis extends ModelBasePalaeopedia {
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
    private final AdvancedModelRenderer leftSpike;
    private final AdvancedModelRenderer cube_r17;
    private final AdvancedModelRenderer rightSpike;
    private final AdvancedModelRenderer cube_r18;
    private final AdvancedModelRenderer tail;
    private final AdvancedModelRenderer cube_r19;
    private final AdvancedModelRenderer cube_r20;
    private final AdvancedModelRenderer tail2;
    private final AdvancedModelRenderer cube_r21;
    private final AdvancedModelRenderer cube_r22;
    private final AdvancedModelRenderer tail3;
    private final AdvancedModelRenderer cube_r23;
    private final AdvancedModelRenderer cube_r24;
    private final AdvancedModelRenderer cube_r25;

    public ModelStegolepis() {
        this.textureWidth = 48;
        this.textureHeight = 48;

        this.main = new AdvancedModelRenderer(this);
        this.main.setRotationPoint(0.0F, 24.0F, 0.0F);


        this.cube_r1 = new AdvancedModelRenderer(this);
        this.cube_r1.setRotationPoint(-0.5F, -2.2484F, -7.7159F);
        this.main.addChild(cube_r1);
        this.setRotateAngle(cube_r1, 1.1737F, 0.0F, 0.0F);
        this.cube_r1.cubeList.add(new ModelBox(cube_r1, 35, 28, -0.5F, 1.35F, -1.0F, 2, 1, 1, -0.003F, false));
        this.cube_r1.cubeList.add(new ModelBox(cube_r1, 29, 35, -0.5F, 0.0F, -1.0F, 2, 2, 1, 0.003F, false));

        this.cube_r2 = new AdvancedModelRenderer(this);
        this.cube_r2.setRotationPoint(1.0F, -2.2484F, -7.7159F);
        this.main.addChild(cube_r2);
        this.setRotateAngle(cube_r2, 1.2312F, 0.1467F, -0.0554F);
        this.cube_r2.cubeList.add(new ModelBox(cube_r2, 7, 36, -1.0F, 0.0F, -1.0F, 1, 3, 1, 0.003F, false));

        this.cube_r3 = new AdvancedModelRenderer(this);
        this.cube_r3.setRotationPoint(-0.425F, -2.4461F, -6.9804F);
        this.main.addChild(cube_r3);
        this.setRotateAngle(cube_r3, 0.6447F, 0.1873F, -0.2427F);
        this.cube_r3.cubeList.add(new ModelBox(cube_r3, 12, 36, -0.5F, -0.5F, -0.5F, 1, 1, 1, 0.0F, true));

        this.cube_r4 = new AdvancedModelRenderer(this);
        this.cube_r4.setRotationPoint(0.425F, -2.4461F, -6.9804F);
        this.main.addChild(cube_r4);
        this.setRotateAngle(cube_r4, 0.6447F, -0.1873F, 0.2427F);
        this.cube_r4.cubeList.add(new ModelBox(cube_r4, 12, 36, -0.5F, -0.5F, -0.5F, 1, 1, 1, 0.0F, false));

        this.cube_r5 = new AdvancedModelRenderer(this);
        this.cube_r5.setRotationPoint(-0.5F, -3.4865F, -6.1452F);
        this.main.addChild(cube_r5);
        this.setRotateAngle(cube_r5, 0.6676F, 0.0F, 0.0F);
        this.cube_r5.cubeList.add(new ModelBox(cube_r5, 11, 31, -0.5F, 0.0F, -2.0F, 2, 2, 2, 0.0F, false));

        this.cube_r6 = new AdvancedModelRenderer(this);
        this.cube_r6.setRotationPoint(-1.0F, -3.4865F, -6.1452F);
        this.main.addChild(cube_r6);
        this.setRotateAngle(cube_r6, 0.2356F, 0.0F, 0.0F);
        this.cube_r6.cubeList.add(new ModelBox(cube_r6, 17, 12, -0.5F, 0.0F, 0.0F, 3, 1, 1, -0.003F, false));

        this.cube_r7 = new AdvancedModelRenderer(this);
        this.cube_r7.setRotationPoint(0.0F, -1.7472F, -5.3325F);
        this.main.addChild(cube_r7);
        this.setRotateAngle(cube_r7, 0.0873F, 0.0F, 0.0F);
        this.cube_r7.cubeList.add(new ModelBox(cube_r7, 29, 31, -1.5F, -1.0F, -0.5F, 3, 2, 1, 0.006F, false));

        this.cube_r8 = new AdvancedModelRenderer(this);
        this.cube_r8.setRotationPoint(-2.0497F, -2.6594F, -2.2982F);
        this.main.addChild(cube_r8);
        this.setRotateAngle(cube_r8, 0.0F, 0.0F, -1.8326F);
        this.cube_r8.cubeList.add(new ModelBox(cube_r8, 0, 0, -2.0F, 0.0F, -3.0F, 2, 1, 6, 0.003F, true));

        this.cube_r9 = new AdvancedModelRenderer(this);
        this.cube_r9.setRotationPoint(-1.4374F, -3.4501F, -2.2982F);
        this.main.addChild(cube_r9);
        this.setRotateAngle(cube_r9, 0.0F, 0.0F, -0.9119F);
        this.cube_r9.cubeList.add(new ModelBox(cube_r9, 0, 15, -1.0F, 0.0F, -3.0F, 1, 1, 6, 0.0F, true));

        this.cube_r10 = new AdvancedModelRenderer(this);
        this.cube_r10.setRotationPoint(2.0497F, -2.6594F, -2.2982F);
        this.main.addChild(cube_r10);
        this.setRotateAngle(cube_r10, 0.0F, 0.0F, 1.8326F);
        this.cube_r10.cubeList.add(new ModelBox(cube_r10, 0, 0, 0.0F, 0.0F, -3.0F, 2, 1, 6, 0.003F, false));

        this.cube_r11 = new AdvancedModelRenderer(this);
        this.cube_r11.setRotationPoint(1.4374F, -3.4501F, -2.2982F);
        this.main.addChild(cube_r11);
        this.setRotateAngle(cube_r11, 0.0F, 0.0F, 0.9119F);
        this.cube_r11.cubeList.add(new ModelBox(cube_r11, 0, 15, 0.0F, 0.0F, -3.0F, 1, 1, 6, 0.0F, false));

        this.cube_r12 = new AdvancedModelRenderer(this);
        this.cube_r12.setRotationPoint(-1.0F, -3.9638F, -1.1873F);
        this.main.addChild(cube_r12);
        this.setRotateAngle(cube_r12, -0.0305F, 0.0F, 0.0F);
        this.cube_r12.cubeList.add(new ModelBox(cube_r12, 13, 25, -0.5F, 0.0F, 0.0F, 3, 3, 2, 0.003F, false));

        this.cube_r13 = new AdvancedModelRenderer(this);
        this.cube_r13.setRotationPoint(0.0F, -3.8112F, -3.6827F);
        this.main.addChild(cube_r13);
        this.setRotateAngle(cube_r13, 0.4538F, 0.0F, 0.0F);
        this.cube_r13.cubeList.add(new ModelBox(cube_r13, 32, 0, 0.0F, 0.0F, 0.0F, 0, 1, 3, 0.0F, false));

        this.cube_r14 = new AdvancedModelRenderer(this);
        this.cube_r14.setRotationPoint(-1.0F, -3.9638F, -1.1873F);
        this.main.addChild(cube_r14);
        this.setRotateAngle(cube_r14, 0.0611F, 0.0F, 0.0F);
        this.cube_r14.cubeList.add(new ModelBox(cube_r14, 17, 0, -0.5F, 0.0F, -4.0F, 3, 1, 4, 0.0F, false));

        this.cube_r15 = new AdvancedModelRenderer(this);
        this.cube_r15.setRotationPoint(-0.5F, -0.0014F, -3.9848F);
        this.main.addChild(cube_r15);
        this.setRotateAngle(cube_r15, -0.2182F, 0.0F, 0.0F);
        this.cube_r15.cubeList.add(new ModelBox(cube_r15, 30, 6, -1.0F, -1.0F, -2.0F, 3, 1, 2, 0.0F, false));

        this.cube_r16 = new AdvancedModelRenderer(this);
        this.cube_r16.setRotationPoint(-0.5F, -0.35F, 0.0F);
        this.main.addChild(cube_r16);
        this.setRotateAngle(cube_r16, 0.0873F, 0.0F, 0.0F);
        this.cube_r16.cubeList.add(new ModelBox(cube_r16, 0, 8, -1.0F, -1.0F, -4.0F, 3, 1, 5, -0.003F, false));

        this.leftSpike = new AdvancedModelRenderer(this);
        this.leftSpike.setRotationPoint(1.3F, -0.9484F, -5.7159F);
        this.main.addChild(leftSpike);
        this.setRotateAngle(leftSpike, 0.0F, 0.6981F, 0.0F);
        this.leftSpike.cubeList.add(new ModelBox(leftSpike, 17, 36, -0.5F, -0.5F, 0.0F, 1, 1, 1, -0.003F, false));
        this.leftSpike.cubeList.add(new ModelBox(leftSpike, 0, 34, -0.5F, -0.7F, 0.4F, 1, 1, 2, 0.003F, false));
        this.leftSpike.cubeList.add(new ModelBox(leftSpike, 35, 24, -0.5F, -0.3F, 0.4F, 1, 1, 2, 0.0F, false));

        this.cube_r17 = new AdvancedModelRenderer(this);
        this.cube_r17.setRotationPoint(0.5F, 0.5F, 2.4F);
        this.leftSpike.addChild(cube_r17);
        this.setRotateAngle(cube_r17, 0.0F, -0.3927F, 0.0F);
        this.cube_r17.cubeList.add(new ModelBox(cube_r17, 20, 31, -1.0F, -1.0F, 0.0F, 1, 1, 3, 0.0F, false));

        this.rightSpike = new AdvancedModelRenderer(this);
        this.rightSpike.setRotationPoint(-1.3F, -0.9484F, -5.7159F);
        this.main.addChild(rightSpike);
        this.setRotateAngle(rightSpike, 0.0F, -0.6981F, 0.0F);
        this.rightSpike.cubeList.add(new ModelBox(rightSpike, 17, 36, -0.5F, -0.5F, 0.0F, 1, 1, 1, -0.003F, true));
        this.rightSpike.cubeList.add(new ModelBox(rightSpike, 0, 34, -0.5F, -0.7F, 0.4F, 1, 1, 2, 0.003F, true));
        this.rightSpike.cubeList.add(new ModelBox(rightSpike, 35, 24, -0.5F, -0.3F, 0.4F, 1, 1, 2, 0.0F, true));

        this.cube_r18 = new AdvancedModelRenderer(this);
        this.cube_r18.setRotationPoint(-0.5F, 0.5F, 2.4F);
        this.rightSpike.addChild(cube_r18);
        this.setRotateAngle(cube_r18, 0.0F, 0.3927F, 0.0F);
        this.cube_r18.cubeList.add(new ModelBox(cube_r18, 20, 31, 0.0F, -1.0F, 0.0F, 1, 1, 3, 0.0F, true));

        this.tail = new AdvancedModelRenderer(this);
        this.tail.setRotationPoint(0.0F, -2.4472F, 0.0232F);
        this.main.addChild(tail);


        this.cube_r19 = new AdvancedModelRenderer(this);
        this.cube_r19.setRotationPoint(-1.0F, 1.0494F, 2.8026F);
        this.tail.addChild(cube_r19);
        this.setRotateAngle(cube_r19, 0.1309F, 0.0F, 0.0F);
        this.cube_r19.cubeList.add(new ModelBox(cube_r19, 0, 23, -0.5F, -1.35F, -3.0F, 3, 2, 3, -0.009F, false));

        this.cube_r20 = new AdvancedModelRenderer(this);
        this.cube_r20.setRotationPoint(-1.0F, -1.3527F, -0.0232F);
        this.tail.addChild(cube_r20);
        this.setRotateAngle(cube_r20, -0.1745F, 0.0F, 0.0F);
        this.cube_r20.cubeList.add(new ModelBox(cube_r20, 17, 6, -0.5F, -0.15F, 0.2F, 3, 2, 3, 0.0F, false));

        this.tail2 = new AdvancedModelRenderer(this);
        this.tail2.setRotationPoint(0.0F, 0.0722F, 2.4768F);
        this.tail.addChild(tail2);


        this.cube_r21 = new AdvancedModelRenderer(this);
        this.cube_r21.setRotationPoint(-0.5F, 1.3197F, 2.8718F);
        this.tail2.addChild(cube_r21);
        this.setRotateAngle(cube_r21, 0.0436F, 0.0F, 0.0F);
        this.cube_r21.cubeList.add(new ModelBox(cube_r21, 0, 29, -0.5F, -0.825F, -3.0F, 2, 1, 3, 0.0F, false));

        this.cube_r22 = new AdvancedModelRenderer(this);
        this.cube_r22.setRotationPoint(-0.5F, -1.0F, 0.0F);
        this.tail2.addChild(cube_r22);
        this.setRotateAngle(cube_r22, -0.1309F, 0.0F, 0.0F);
        this.cube_r22.cubeList.add(new ModelBox(cube_r22, 24, 25, -0.5F, -0.075F, 0.15F, 2, 2, 3, 0.003F, false));

        this.tail3 = new AdvancedModelRenderer(this);
        this.tail3.setRotationPoint(0.0F, 0.0212F, 2.5373F);
        this.tail2.addChild(tail3);


        this.cube_r23 = new AdvancedModelRenderer(this);
        this.cube_r23.setRotationPoint(0.0F, -0.0512F, 3.0213F);
        this.tail3.addChild(cube_r23);
        this.setRotateAngle(cube_r23, 0.4276F, 0.0F, 0.0F);
        this.cube_r23.cubeList.add(new ModelBox(cube_r23, 28, 18, -0.5F, -0.825F, -3.3F, 1, 1, 4, -0.003F, false));

        this.cube_r24 = new AdvancedModelRenderer(this);
        this.cube_r24.setRotationPoint(-0.5F, -0.1212F, -0.0373F);
        this.tail3.addChild(cube_r24);
        this.setRotateAngle(cube_r24, 0.3491F, 0.0F, 0.0F);
        this.cube_r24.cubeList.add(new ModelBox(cube_r24, 15, 15, 0.5F, -0.325F, -0.225F, 0, 3, 6, 0.0F, false));

        this.cube_r25 = new AdvancedModelRenderer(this);
        this.cube_r25.setRotationPoint(0.0F, -0.1212F, -0.0373F);
        this.tail3.addChild(cube_r25);
        this.setRotateAngle(cube_r25, 0.1745F, 0.0F, 0.0F);
        this.cube_r25.cubeList.add(new ModelBox(cube_r25, 28, 12, -0.5F, -0.4F, 0.0F, 1, 1, 4, 0.0F, false));

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
        AdvancedModelRenderer[] fishTail = {this.tail, this.tail2, this.tail3};


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
