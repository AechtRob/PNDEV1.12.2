package net.lepidodendron.entity.model.entity;

import net.ilexiconn.llibrary.client.model.tools.AdvancedModelRenderer;
import net.lepidodendron.entity.model.ModelBasePalaeopedia;
import net.minecraft.block.material.Material;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLiving;
import net.minecraft.util.math.BlockPos;

public class ModelAnglaspis extends ModelBasePalaeopedia {
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
    private final AdvancedModelRenderer cube_r18;
    private final AdvancedModelRenderer cube_r19;
    private final AdvancedModelRenderer cube_r20;
    private final AdvancedModelRenderer tail2;
    private final AdvancedModelRenderer cube_r21;
    private final AdvancedModelRenderer cube_r22;
    private final AdvancedModelRenderer cube_r23;
    private final AdvancedModelRenderer cube_r24;
    private final AdvancedModelRenderer tail3;
    private final AdvancedModelRenderer cube_r25;
    private final AdvancedModelRenderer cube_r26;
    private final AdvancedModelRenderer cube_r27;
    private final AdvancedModelRenderer tail4;
    private final AdvancedModelRenderer cube_r28;

    public ModelAnglaspis() {
        this.textureWidth = 38;
        this.textureHeight = 38;

        this.main = new AdvancedModelRenderer(this);
        this.main.setRotationPoint(0.0F, 23.75F, -1.0F);


        this.cube_r1 = new AdvancedModelRenderer(this);
        this.cube_r1.setRotationPoint(0.5F, 0.2285F, -2.9895F);
        this.main.addChild(cube_r1);
        this.setRotateAngle(cube_r1, 0.1082F, -0.0142F, 0.1301F);
        this.cube_r1.cubeList.add(new ModelBox(cube_r1, 0, 20, -0.5F, -2.05F, 0.0F, 1, 2, 4, -0.001F, true));

        this.cube_r2 = new AdvancedModelRenderer(this);
        this.cube_r2.setRotationPoint(0.5F, 0.2285F, -2.9895F);
        this.main.addChild(cube_r2);
        this.setRotateAngle(cube_r2, -0.11F, -0.0142F, 0.1301F);
        this.cube_r2.cubeList.add(new ModelBox(cube_r2, 7, 20, -0.49F, -2.0F, -2.0F, 1, 1, 2, 0.0F, true));

        this.cube_r3 = new AdvancedModelRenderer(this);
        this.cube_r3.setRotationPoint(1.1797F, -0.9065F, -4.8603F);
        this.main.addChild(cube_r3);
        this.setRotateAngle(cube_r3, -0.5039F, 0.1348F, 0.039F);
        this.cube_r3.cubeList.add(new ModelBox(cube_r3, 0, 0, -1.0F, -1.0F, -2.0F, 1, 1, 2, 0.0F, true));

        this.cube_r4 = new AdvancedModelRenderer(this);
        this.cube_r4.setRotationPoint(1.0741F, -2.3547F, -6.4743F);
        this.main.addChild(cube_r4);
        this.setRotateAngle(cube_r4, 0.1686F, 0.0128F, 0.0191F);
        this.cube_r4.cubeList.add(new ModelBox(cube_r4, 0, 4, -1.0F, -0.725F, -0.175F, 1, 1, 1, 0.0F, true));

        this.cube_r5 = new AdvancedModelRenderer(this);
        this.cube_r5.setRotationPoint(-1.1797F, -0.9065F, -4.8603F);
        this.main.addChild(cube_r5);
        this.setRotateAngle(cube_r5, -0.5039F, -0.1348F, -0.039F);
        this.cube_r5.cubeList.add(new ModelBox(cube_r5, 0, 0, 0.0F, -1.0F, -2.0F, 1, 1, 2, 0.0F, false));

        this.cube_r6 = new AdvancedModelRenderer(this);
        this.cube_r6.setRotationPoint(-0.5F, 0.2285F, -2.9895F);
        this.main.addChild(cube_r6);
        this.setRotateAngle(cube_r6, -0.11F, 0.0142F, -0.1301F);
        this.cube_r6.cubeList.add(new ModelBox(cube_r6, 7, 20, -0.51F, -2.0F, -2.0F, 1, 1, 2, 0.0F, false));

        this.cube_r7 = new AdvancedModelRenderer(this);
        this.cube_r7.setRotationPoint(-0.5F, 0.2285F, -2.9895F);
        this.main.addChild(cube_r7);
        this.setRotateAngle(cube_r7, 0.1082F, 0.0142F, -0.1301F);
        this.cube_r7.cubeList.add(new ModelBox(cube_r7, 0, 20, -0.5F, -2.05F, 0.0F, 1, 2, 4, -0.001F, false));

        this.cube_r8 = new AdvancedModelRenderer(this);
        this.cube_r8.setRotationPoint(-0.5F, 0.2285F, -2.9895F);
        this.main.addChild(cube_r8);
        this.setRotateAngle(cube_r8, 0.1091F, 0.0F, 0.0F);
        this.cube_r8.cubeList.add(new ModelBox(cube_r8, 13, 7, -0.5F, -4.0F, 0.0F, 2, 4, 4, 0.001F, false));

        this.cube_r9 = new AdvancedModelRenderer(this);
        this.cube_r9.setRotationPoint(-0.5F, 0.2285F, -2.9895F);
        this.main.addChild(cube_r9);
        this.setRotateAngle(cube_r9, -0.3709F, 0.0F, 0.0F);
        this.cube_r9.cubeList.add(new ModelBox(cube_r9, 26, 10, -0.5F, -3.0F, -2.0F, 2, 3, 2, -0.001F, false));

        this.cube_r10 = new AdvancedModelRenderer(this);
        this.cube_r10.setRotationPoint(-0.5F, -2.4744F, -7.109F);
        this.main.addChild(cube_r10);
        this.setRotateAngle(cube_r10, -0.7199F, 0.0F, 0.0F);
        this.cube_r10.cubeList.add(new ModelBox(cube_r10, 28, 28, -0.5F, -3.0F, 2.0F, 2, 2, 1, 0.0F, false));
        this.cube_r10.cubeList.add(new ModelBox(cube_r10, 30, 0, -0.5F, -2.5F, 1.0F, 2, 2, 1, -0.001F, false));

        this.cube_r11 = new AdvancedModelRenderer(this);
        this.cube_r11.setRotationPoint(-0.5F, -0.4964F, -4.8535F);
        this.main.addChild(cube_r11);
        this.setRotateAngle(cube_r11, -0.6676F, 0.0F, 0.0F);
        this.cube_r11.cubeList.add(new ModelBox(cube_r11, 11, 22, -0.5F, -1.0F, -3.0F, 2, 1, 3, 0.0F, false));

        this.cube_r12 = new AdvancedModelRenderer(this);
        this.cube_r12.setRotationPoint(-1.0741F, -2.3547F, -6.4743F);
        this.main.addChild(cube_r12);
        this.setRotateAngle(cube_r12, 0.1686F, -0.0128F, -0.0191F);
        this.cube_r12.cubeList.add(new ModelBox(cube_r12, 0, 4, 0.0F, -0.725F, -0.175F, 1, 1, 1, 0.0F, false));

        this.cube_r13 = new AdvancedModelRenderer(this);
        this.cube_r13.setRotationPoint(-0.5F, -3.2638F, -8.0519F);
        this.main.addChild(cube_r13);
        this.setRotateAngle(cube_r13, 0.0742F, 0.0F, 0.0F);
        this.cube_r13.cubeList.add(new ModelBox(cube_r13, 26, 16, -0.5F, 0.0F, 0.0F, 2, 1, 2, 0.001F, false));

        this.cube_r14 = new AdvancedModelRenderer(this);
        this.cube_r14.setRotationPoint(-1.0F, -4.3918F, -2.4881F);
        this.main.addChild(cube_r14);
        this.setRotateAngle(cube_r14, 0.0349F, 0.0F, 0.0F);
        this.cube_r14.cubeList.add(new ModelBox(cube_r14, 13, 16, -0.5F, 0.0F, 0.0F, 3, 2, 3, 0.001F, false));

        this.cube_r15 = new AdvancedModelRenderer(this);
        this.cube_r15.setRotationPoint(0.0F, -4.3918F, -2.4881F);
        this.main.addChild(cube_r15);
        this.setRotateAngle(cube_r15, 0.2531F, 0.0F, 0.0F);
        this.cube_r15.cubeList.add(new ModelBox(cube_r15, 8, 0, -1.5F, 0.0F, -4.0F, 3, 1, 4, 0.0F, false));

        this.tail = new AdvancedModelRenderer(this);
        this.tail.setRotationPoint(0.0F, -3.35F, 0.0F);
        this.main.addChild(tail);
        this.tail.cubeList.add(new ModelBox(tail, 0, 11, -1.0F, -1.0F, 0.0F, 2, 4, 4, 0.0F, false));

        this.cube_r16 = new AdvancedModelRenderer(this);
        this.cube_r16.setRotationPoint(0.5F, -1.0F, 2.5F);
        this.tail.addChild(cube_r16);
        this.setRotateAngle(cube_r16, 0.6545F, 0.0F, 0.0F);
        this.cube_r16.cubeList.add(new ModelBox(cube_r16, 14, 27, -1.0F, 0.0F, 0.0F, 1, 1, 2, -0.001F, false));

        this.cube_r17 = new AdvancedModelRenderer(this);
        this.cube_r17.setRotationPoint(0.5F, -1.0F, 1.5F);
        this.tail.addChild(cube_r17);
        this.setRotateAngle(cube_r17, 0.6981F, 0.0F, 0.0F);
        this.cube_r17.cubeList.add(new ModelBox(cube_r17, 28, 20, -1.0F, 0.0F, 0.0F, 1, 1, 2, 0.0F, false));

        this.cube_r18 = new AdvancedModelRenderer(this);
        this.cube_r18.setRotationPoint(0.5F, -1.0F, 0.0F);
        this.tail.addChild(cube_r18);
        this.setRotateAngle(cube_r18, 0.4363F, 0.0F, 0.0F);
        this.cube_r18.cubeList.add(new ModelBox(cube_r18, 21, 28, -1.0F, 0.0F, 0.0F, 1, 1, 2, -0.001F, false));

        this.cube_r19 = new AdvancedModelRenderer(this);
        this.cube_r19.setRotationPoint(-0.5F, 2.9F, 2.45F);
        this.tail.addChild(cube_r19);
        this.setRotateAngle(cube_r19, 1.0472F, 0.0F, 0.0F);
        this.cube_r19.cubeList.add(new ModelBox(cube_r19, 10, 31, 0.0F, 0.0F, 0.0F, 1, 2, 1, -0.001F, false));

        this.cube_r20 = new AdvancedModelRenderer(this);
        this.cube_r20.setRotationPoint(-0.5F, 2.9F, 0.7F);
        this.tail.addChild(cube_r20);
        this.setRotateAngle(cube_r20, 1.1781F, 0.0F, 0.0F);
        this.cube_r20.cubeList.add(new ModelBox(cube_r20, 19, 0, 0.0F, 0.0F, 0.0F, 1, 2, 1, 0.0F, false));

        this.tail2 = new AdvancedModelRenderer(this);
        this.tail2.setRotationPoint(0.0F, 0.25F, 3.5F);
        this.tail.addChild(tail2);
        this.tail2.cubeList.add(new ModelBox(tail2, 22, 3, -1.0F, -1.0F, 0.0F, 2, 3, 3, -0.002F, false));

        this.cube_r21 = new AdvancedModelRenderer(this);
        this.cube_r21.setRotationPoint(0.5F, -1.025F, 1.4F);
        this.tail2.addChild(cube_r21);
        this.setRotateAngle(cube_r21, 0.4363F, 0.0F, 0.0F);
        this.cube_r21.cubeList.add(new ModelBox(cube_r21, 0, 27, -1.0F, 0.0F, 0.0F, 1, 1, 2, -0.001F, false));

        this.cube_r22 = new AdvancedModelRenderer(this);
        this.cube_r22.setRotationPoint(0.5F, -1.025F, 0.0F);
        this.tail2.addChild(cube_r22);
        this.setRotateAngle(cube_r22, 0.4363F, 0.0F, 0.0F);
        this.cube_r22.cubeList.add(new ModelBox(cube_r22, 7, 27, -1.0F, 0.0F, 0.0F, 1, 1, 2, 0.0F, false));

        this.cube_r23 = new AdvancedModelRenderer(this);
        this.cube_r23.setRotationPoint(-0.5F, 2.15F, 1.425F);
        this.tail2.addChild(cube_r23);
        this.setRotateAngle(cube_r23, 1.2217F, 0.0F, 0.0F);
        this.cube_r23.cubeList.add(new ModelBox(cube_r23, 31, 24, 0.0F, 0.0F, 0.0F, 1, 2, 1, -0.001F, false));

        this.cube_r24 = new AdvancedModelRenderer(this);
        this.cube_r24.setRotationPoint(-0.5F, 2.15F, -0.025F);
        this.tail2.addChild(cube_r24);
        this.setRotateAngle(cube_r24, 1.0472F, 0.0F, 0.0F);
        this.cube_r24.cubeList.add(new ModelBox(cube_r24, 15, 31, 0.0F, 0.0F, 0.0F, 1, 2, 1, 0.0F, false));

        this.tail3 = new AdvancedModelRenderer(this);
        this.tail3.setRotationPoint(0.0F, 0.25F, 2.5F);
        this.tail2.addChild(tail3);
        this.tail3.cubeList.add(new ModelBox(tail3, 22, 22, -0.5F, -1.0F, 0.0F, 1, 2, 3, 0.0F, false));

        this.cube_r25 = new AdvancedModelRenderer(this);
        this.cube_r25.setRotationPoint(1.0F, -1.025F, 1.65F);
        this.tail3.addChild(cube_r25);
        this.setRotateAngle(cube_r25, 0.4363F, 0.0F, 0.0F);
        this.cube_r25.cubeList.add(new ModelBox(cube_r25, 0, 31, -1.0F, 0.0F, 0.0F, 0, 1, 2, 0.0F, false));

        this.cube_r26 = new AdvancedModelRenderer(this);
        this.cube_r26.setRotationPoint(0.025F, -1.025F, 0.25F);
        this.tail3.addChild(cube_r26);
        this.setRotateAngle(cube_r26, 0.4363F, 0.0F, 0.0F);
        this.cube_r26.cubeList.add(new ModelBox(cube_r26, 5, 31, 0.0F, 0.0F, 0.0F, 0, 1, 2, 0.0F, false));

        this.cube_r27 = new AdvancedModelRenderer(this);
        this.cube_r27.setRotationPoint(-1.0F, 1.225F, 0.375F);
        this.tail3.addChild(cube_r27);
        this.setRotateAngle(cube_r27, 1.3526F, 0.0F, 0.0F);
        this.cube_r27.cubeList.add(new ModelBox(cube_r27, 20, 32, 1.0F, 0.0F, 0.0F, 0, 3, 1, 0.0F, false));

        this.tail4 = new AdvancedModelRenderer(this);
        this.tail4.setRotationPoint(0.0F, 0.0F, 3.0F);
        this.tail3.addChild(tail4);


        this.cube_r28 = new AdvancedModelRenderer(this);
        this.cube_r28.setRotationPoint(-0.025F, -1.0F, 0.0F);
        this.tail4.addChild(cube_r28);
        this.setRotateAngle(cube_r28, -0.1309F, 0.0F, 0.0F);
        this.cube_r28.cubeList.add(new ModelBox(cube_r28, 0, 0, 0.0F, -0.925F, 0.0F, 0, 3, 7, 0.0F, false));

        updateDefaultPose();
    }

    @Override
    public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        this.main.render(f5);
    }
    public void renderStaticWall(float f) {
        this.main.rotateAngleY = (float) Math.toRadians(90);
        this.main.render(0.01F);
        resetToDefaultPose();
    }
    public void renderStaticFloor(float f) {
        this.main.render(0.01F);
        resetToDefaultPose();
    }
    @Override
    public void renderStaticBook(float f) {
        //Rotations, positions and sizing:
        this.main.offsetY = -1.8F;
        this.main.offsetX = 0.6F;
        this.main.rotateAngleY = (float)Math.toRadians(242);
        this.main.rotateAngleX = (float)Math.toRadians(20);
        this.main.rotateAngleZ = (float)Math.toRadians(-8);
        this.main.scaleChildren = true;
        float scaler = 3.0F;
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
        //this.main.offsetY = 1.0F;

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
                this.main.rotateAngleZ = (float) Math.toRadians(90);
                //this.main.offsetY = 0.95F;
                this.bob(main, -speed, 2F, false, f2, 1);
                this.chainWave(fishTail, speed, 0.2F, -3, f2, 1);
            }
        }
    }
}
