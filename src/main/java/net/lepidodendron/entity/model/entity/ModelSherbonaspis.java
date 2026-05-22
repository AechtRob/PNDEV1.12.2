package net.lepidodendron.entity.model.entity;

import net.ilexiconn.llibrary.client.model.tools.AdvancedModelRenderer;
import net.lepidodendron.entity.model.ModelBasePalaeopedia;
import net.minecraft.block.material.Material;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLiving;
import net.minecraft.util.math.BlockPos;

public class ModelSherbonaspis extends ModelBasePalaeopedia {
    private final AdvancedModelRenderer main;
    private final AdvancedModelRenderer cube_r1;
    private final AdvancedModelRenderer cube_r2;
    private final AdvancedModelRenderer cube_r3;
    private final AdvancedModelRenderer cube_r4;
    private final AdvancedModelRenderer cube_r5;
    private final AdvancedModelRenderer cube_r6;
    private final AdvancedModelRenderer cube_r7;
    private final AdvancedModelRenderer cube_r8;
    private final AdvancedModelRenderer leftSpike;
    private final AdvancedModelRenderer cube_r9;
    private final AdvancedModelRenderer rightSpike;
    private final AdvancedModelRenderer cube_r10;
    private final AdvancedModelRenderer head;
    private final AdvancedModelRenderer cube_r11;
    private final AdvancedModelRenderer cube_r12;
    private final AdvancedModelRenderer cube_r13;
    private final AdvancedModelRenderer cube_r14;
    private final AdvancedModelRenderer cube_r15;
    private final AdvancedModelRenderer jaw;
    private final AdvancedModelRenderer cube_r16;
    private final AdvancedModelRenderer tail;
    private final AdvancedModelRenderer cube_r17;
    private final AdvancedModelRenderer cube_r18;
    private final AdvancedModelRenderer tail2;
    private final AdvancedModelRenderer cube_r19;
    private final AdvancedModelRenderer cube_r20;
    private final AdvancedModelRenderer tail3;
    private final AdvancedModelRenderer cube_r21;
    private final AdvancedModelRenderer cube_r22;
    private final AdvancedModelRenderer tail4;
    private final AdvancedModelRenderer cube_r23;
    private final AdvancedModelRenderer cube_r24;
    private final AdvancedModelRenderer cube_r25;

    public ModelSherbonaspis() {
        this.textureWidth = 45;
        this.textureHeight = 45;

        this.main = new AdvancedModelRenderer(this);
        this.main.setRotationPoint(0.0F, 24.0F, -6.0F);


        this.cube_r1 = new AdvancedModelRenderer(this);
        this.cube_r1.setRotationPoint(0.0F, -0.0653F, 3.5043F);
        this.main.addChild(cube_r1);
        this.setRotateAngle(cube_r1, 0.1745F, 0.0F, 0.0F);
        this.cube_r1.cubeList.add(new ModelBox(cube_r1, 17, 14, -2.0F, -1.0F, 0.0F, 4, 1, 4, 0.0F, false));

        this.cube_r2 = new AdvancedModelRenderer(this);
        this.cube_r2.setRotationPoint(0.5F, -6.1654F, 3.3455F);
        this.main.addChild(cube_r2);
        this.setRotateAngle(cube_r2, -0.4276F, 0.0F, 0.0F);
        this.cube_r2.cubeList.add(new ModelBox(cube_r2, 34, 4, -1.0F, 0.0F, 0.0F, 1, 1, 3, -0.003F, false));

        this.cube_r3 = new AdvancedModelRenderer(this);
        this.cube_r3.setRotationPoint(0.5F, -5.3595F, 2.0805F);
        this.main.addChild(cube_r3);
        this.setRotateAngle(cube_r3, 0.5672F, 0.0F, 0.0F);
        this.cube_r3.cubeList.add(new ModelBox(cube_r3, 9, 37, -1.0F, 0.0F, -0.5F, 1, 1, 2, 0.0F, false));

        this.cube_r4 = new AdvancedModelRenderer(this);
        this.cube_r4.setRotationPoint(0.0F, -4.2114F, -0.6912F);
        this.main.addChild(cube_r4);
        this.setRotateAngle(cube_r4, 0.3927F, 0.0F, 0.0F);
        this.cube_r4.cubeList.add(new ModelBox(cube_r4, 17, 7, -2.0F, 0.0F, 0.0F, 4, 2, 4, 0.0F, false));

        this.cube_r5 = new AdvancedModelRenderer(this);
        this.cube_r5.setRotationPoint(0.0F, -4.7291F, 6.7736F);
        this.main.addChild(cube_r5);
        this.setRotateAngle(cube_r5, -0.2618F, 0.0F, 0.0F);
        this.cube_r5.cubeList.add(new ModelBox(cube_r5, 17, 0, -2.0F, 0.0F, -3.9F, 4, 2, 4, 0.003F, false));

        this.cube_r6 = new AdvancedModelRenderer(this);
        this.cube_r6.setRotationPoint(-2.4652F, -3.5792F, -0.217F);
        this.main.addChild(cube_r6);
        this.setRotateAngle(cube_r6, 0.1291F, 0.024F, -0.2648F);
        this.cube_r6.cubeList.add(new ModelBox(cube_r6, 0, 0, -0.3F, 0.0F, 0.0F, 1, 3, 7, 0.003F, true));

        this.cube_r7 = new AdvancedModelRenderer(this);
        this.cube_r7.setRotationPoint(2.4652F, -3.5792F, -0.217F);
        this.main.addChild(cube_r7);
        this.setRotateAngle(cube_r7, 0.1291F, -0.024F, 0.2648F);
        this.cube_r7.cubeList.add(new ModelBox(cube_r7, 0, 0, -0.7F, 0.0F, 0.0F, 1, 3, 7, 0.003F, false));

        this.cube_r8 = new AdvancedModelRenderer(this);
        this.cube_r8.setRotationPoint(0.0F, -0.0653F, 3.5043F);
        this.main.addChild(cube_r8);
        this.setRotateAngle(cube_r8, -0.0873F, 0.0F, 0.0F);
        this.cube_r8.cubeList.add(new ModelBox(cube_r8, 0, 11, -2.0F, -3.0F, -4.0F, 4, 3, 4, -0.006F, false));

        this.leftSpike = new AdvancedModelRenderer(this);
        this.leftSpike.setRotationPoint(1.9266F, -1.2153F, 0.2986F);
        this.main.addChild(leftSpike);
        this.setRotateAngle(leftSpike, 1.5708F, 0.6545F, 0.0F);
        this.leftSpike.cubeList.add(new ModelBox(leftSpike, 29, 36, -0.75F, 0.0F, -0.75F, 1, 2, 1, 0.003F, false));
        this.leftSpike.cubeList.add(new ModelBox(leftSpike, 16, 37, -0.75F, 0.0F, -0.25F, 1, 2, 1, 0.0F, false));

        this.cube_r9 = new AdvancedModelRenderer(this);
        this.cube_r9.setRotationPoint(0.25F, 2.0F, 0.0F);
        this.leftSpike.addChild(cube_r9);
        this.setRotateAngle(cube_r9, 0.0F, 0.0F, 0.4276F);
        this.cube_r9.cubeList.add(new ModelBox(cube_r9, 24, 36, -1.0F, 0.0F, -0.475F, 1, 4, 1, -0.006F, false));

        this.rightSpike = new AdvancedModelRenderer(this);
        this.rightSpike.setRotationPoint(-1.9266F, -1.2153F, 0.2986F);
        this.main.addChild(rightSpike);
        this.setRotateAngle(rightSpike, 1.5708F, -0.6545F, 0.0F);
        this.rightSpike.cubeList.add(new ModelBox(rightSpike, 29, 36, -0.25F, 0.0F, -0.75F, 1, 2, 1, 0.003F, true));
        this.rightSpike.cubeList.add(new ModelBox(rightSpike, 16, 37, -0.25F, 0.0F, -0.25F, 1, 2, 1, 0.0F, true));

        this.cube_r10 = new AdvancedModelRenderer(this);
        this.cube_r10.setRotationPoint(-0.25F, 2.0F, 0.0F);
        this.rightSpike.addChild(cube_r10);
        this.setRotateAngle(cube_r10, 0.0F, 0.0F, -0.4276F);
        this.cube_r10.cubeList.add(new ModelBox(cube_r10, 24, 36, 0.0F, 0.0F, -0.475F, 1, 4, 1, -0.006F, true));

        this.head = new AdvancedModelRenderer(this);
        this.head.setRotationPoint(-0.5F, -4.1903F, -0.2957F);
        this.main.addChild(head);


        this.cube_r11 = new AdvancedModelRenderer(this);
        this.cube_r11.setRotationPoint(-0.5F, 2.5161F, -1.9254F);
        this.head.addChild(cube_r11);
        this.setRotateAngle(cube_r11, 0.1745F, 0.0F, 0.0F);
        this.cube_r11.cubeList.add(new ModelBox(cube_r11, 34, 0, -0.5F, 0.0F, 0.0F, 3, 1, 2, 0.0F, false));

        this.cube_r12 = new AdvancedModelRenderer(this);
        this.cube_r12.setRotationPoint(0.1F, 1.368F, -0.8384F);
        this.head.addChild(cube_r12);
        this.setRotateAngle(cube_r12, 1.1252F, 0.1974F, -0.0934F);
        this.cube_r12.cubeList.add(new ModelBox(cube_r12, 0, 39, -0.5F, -0.625F, -0.5F, 1, 1, 1, 0.0F, true));

        this.cube_r13 = new AdvancedModelRenderer(this);
        this.cube_r13.setRotationPoint(0.9F, 1.368F, -0.8384F);
        this.head.addChild(cube_r13);
        this.setRotateAngle(cube_r13, 1.1252F, -0.1974F, 0.0934F);
        this.cube_r13.cubeList.add(new ModelBox(cube_r13, 0, 39, -0.5F, -0.625F, -0.5F, 1, 1, 1, 0.0F, false));

        this.cube_r14 = new AdvancedModelRenderer(this);
        this.cube_r14.setRotationPoint(-0.5F, 0.7035F, -1.0802F);
        this.head.addChild(cube_r14);
        this.setRotateAngle(cube_r14, 1.1345F, 0.0F, 0.0F);
        this.cube_r14.cubeList.add(new ModelBox(cube_r14, 30, 20, -0.5F, 0.0F, -2.0F, 3, 2, 2, 0.003F, false));

        this.cube_r15 = new AdvancedModelRenderer(this);
        this.cube_r15.setRotationPoint(-0.5F, -0.0036F, -0.3731F);
        this.head.addChild(cube_r15);
        this.setRotateAngle(cube_r15, 0.7854F, 0.0F, 0.0F);
        this.cube_r15.cubeList.add(new ModelBox(cube_r15, 34, 14, -0.5F, 0.0F, -1.0F, 3, 2, 1, 0.0F, false));

        this.jaw = new AdvancedModelRenderer(this);
        this.jaw.setRotationPoint(0.5F, 3.2095F, 0.3244F);
        this.head.addChild(jaw);


        this.cube_r16 = new AdvancedModelRenderer(this);
        this.cube_r16.setRotationPoint(-0.5F, 0.2915F, -2.0762F);
        this.jaw.addChild(cube_r16);
        this.setRotateAngle(cube_r16, -0.0785F, 0.0F, 0.0F);
        this.cube_r16.cubeList.add(new ModelBox(cube_r16, 35, 31, -0.5F, -0.875F, 0.05F, 2, 1, 2, -0.002F, false));

        this.tail = new AdvancedModelRenderer(this);
        this.tail.setRotationPoint(0.0F, -3.4357F, 5.8099F);
        this.main.addChild(tail);


        this.cube_r17 = new AdvancedModelRenderer(this);
        this.cube_r17.setRotationPoint(-2.5F, 1.9903F, 2.7875F);
        this.tail.addChild(cube_r17);
        this.setRotateAngle(cube_r17, 0.1789F, 0.0F, 0.0F);
        this.cube_r17.cubeList.add(new ModelBox(cube_r17, 15, 20, 0.5F, -0.575F, -2.9F, 4, 1, 3, -0.01F, false));

        this.cube_r18 = new AdvancedModelRenderer(this);
        this.cube_r18.setRotationPoint(-1.5F, -1.3643F, 0.1901F);
        this.tail.addChild(cube_r18);
        this.setRotateAngle(cube_r18, -0.1265F, 0.0F, 0.0F);
        this.cube_r18.cubeList.add(new ModelBox(cube_r18, 0, 19, -0.5F, 0.0F, 0.0F, 4, 3, 3, -0.003F, false));

        this.tail2 = new AdvancedModelRenderer(this);
        this.tail2.setRotationPoint(0.0F, -0.4786F, 2.8646F);
        this.tail.addChild(tail2);
        this.setRotateAngle(tail2, -0.0873F, 0.0F, 0.0F);
        this.tail2.cubeList.add(new ModelBox(tail2, 15, 25, -1.5F, -0.4858F, -0.4745F, 3, 2, 3, 0.0F, false));

        this.cube_r19 = new AdvancedModelRenderer(this);
        this.cube_r19.setRotationPoint(-1.5F, -0.4858F, 0.0255F);
        this.tail2.addChild(cube_r19);
        this.setRotateAngle(cube_r19, 1.1345F, 0.0F, 0.0F);
        this.cube_r19.cubeList.add(new ModelBox(cube_r19, 35, 35, 1.5F, 0.2F, -0.5F, 0, 2, 3, 0.0F, false));

        this.cube_r20 = new AdvancedModelRenderer(this);
        this.cube_r20.setRotationPoint(-1.0F, 2.8692F, -0.2031F);
        this.tail2.addChild(cube_r20);
        this.setRotateAngle(cube_r20, 0.2662F, 0.0F, 0.0F);
        this.cube_r20.cubeList.add(new ModelBox(cube_r20, 0, 26, -0.5F, -2.025F, 0.0F, 3, 2, 3, -0.003F, false));

        this.tail3 = new AdvancedModelRenderer(this);
        this.tail3.setRotationPoint(0.0F, -0.11F, 2.2642F);
        this.tail2.addChild(tail3);


        this.cube_r21 = new AdvancedModelRenderer(this);
        this.cube_r21.setRotationPoint(-0.5F, 2.1802F, 0.229F);
        this.tail3.addChild(cube_r21);
        this.setRotateAngle(cube_r21, 0.2051F, 0.0F, 0.0F);
        this.cube_r21.cubeList.add(new ModelBox(cube_r21, 24, 31, -0.5F, -0.975F, -0.3F, 2, 1, 3, -0.006F, false));

        this.cube_r22 = new AdvancedModelRenderer(this);
        this.cube_r22.setRotationPoint(-0.5F, 0.7563F, -0.1442F);
        this.tail3.addChild(cube_r22);
        this.setRotateAngle(cube_r22, 0.0873F, 0.0F, 0.0F);
        this.cube_r22.cubeList.add(new ModelBox(cube_r22, 28, 25, -0.5F, -1.075F, -0.1F, 2, 2, 3, 0.0F, false));

        this.tail4 = new AdvancedModelRenderer(this);
        this.tail4.setRotationPoint(0.0F, -0.0802F, 2.3886F);
        this.tail3.addChild(tail4);


        this.cube_r23 = new AdvancedModelRenderer(this);
        this.cube_r23.setRotationPoint(0.0F, -0.4396F, 1.9688F);
        this.tail4.addChild(cube_r23);
        this.setRotateAngle(cube_r23, 0.8727F, 0.0F, 0.0F);
        this.cube_r23.cubeList.add(new ModelBox(cube_r23, 34, 9, -0.5F, -0.9F, -2.625F, 1, 1, 3, -0.003F, false));

        this.cube_r24 = new AdvancedModelRenderer(this);
        this.cube_r24.setRotationPoint(-0.5F, -0.2755F, -0.3578F);
        this.tail4.addChild(cube_r24);
        this.setRotateAngle(cube_r24, 0.48F, 0.0F, 0.0F);
        this.cube_r24.cubeList.add(new ModelBox(cube_r24, 0, 32, 0.5F, 0.5F, -0.35F, 0, 2, 4, 0.0F, false));

        this.cube_r25 = new AdvancedModelRenderer(this);
        this.cube_r25.setRotationPoint(0.0F, -0.2755F, -0.3578F);
        this.tail4.addChild(cube_r25);
        this.setRotateAngle(cube_r25, 0.6109F, 0.0F, 0.0F);
        this.cube_r25.cubeList.add(new ModelBox(cube_r25, 13, 31, -0.5F, 0.2F, 0.0F, 1, 1, 4, 0.0F, false));

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
