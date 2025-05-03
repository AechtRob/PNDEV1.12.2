package net.lepidodendron.entity.model.entity;

import net.ilexiconn.llibrary.client.model.tools.AdvancedModelRenderer;
import net.lepidodendron.entity.model.ModelBasePalaeopedia;
import net.minecraft.block.material.Material;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLiving;
import net.minecraft.util.math.BlockPos;

public class ModelTorpedaspis extends ModelBasePalaeopedia {
    private final AdvancedModelRenderer body;
    private final AdvancedModelRenderer cube_r1;
    private final AdvancedModelRenderer cube_r2;
    private final AdvancedModelRenderer cube_r3;
    private final AdvancedModelRenderer cube_r4;
    private final AdvancedModelRenderer cube_r5;
    private final AdvancedModelRenderer cube_r6;
    private final AdvancedModelRenderer cube_r7;
    private final AdvancedModelRenderer cube_r8;
    private final AdvancedModelRenderer cube_r9;
    private final AdvancedModelRenderer body2;
    private final AdvancedModelRenderer body3;
    private final AdvancedModelRenderer body4;
    private final AdvancedModelRenderer body5;
    private final AdvancedModelRenderer cube_r10;
    private final AdvancedModelRenderer cube_r11;
    private final AdvancedModelRenderer cube_r12;
    private final AdvancedModelRenderer cube_r13;
    private final AdvancedModelRenderer bone;
    private final AdvancedModelRenderer cube_r14;
    private final AdvancedModelRenderer cube_r15;
    private final AdvancedModelRenderer cube_r16;
    private final AdvancedModelRenderer cube_r17;
    private final AdvancedModelRenderer cube_r18;
    private final AdvancedModelRenderer cube_r19;
    private final AdvancedModelRenderer cube_r20;
    private final AdvancedModelRenderer cube_r21;
    private final AdvancedModelRenderer bone4;
    private final AdvancedModelRenderer cube_r22;
    private final AdvancedModelRenderer cube_r23;

    public ModelTorpedaspis() {
        this.textureWidth = 64;
        this.textureHeight = 64;

        this.body = new AdvancedModelRenderer(this);
        this.body.setRotationPoint(0.0F, 26.75F, 0.0F);
        this.body.cubeList.add(new ModelBox(body, 0, 0, -4.0F, -8.075F, -5.0F, 8, 1, 9, 0.0F, false));
        this.body.cubeList.add(new ModelBox(body, 0, 10, -4.0F, -7.15F, -2.1F, 8, 3, 6, -0.01F, false));
        this.body.cubeList.add(new ModelBox(body, 42, 25, -1.0F, -7.99F, 3.5F, 2, 1, 6, 0.0F, false));
        this.body.cubeList.add(new ModelBox(body, 25, 0, -3.5F, -4.75F, -4.5F, 7, 2, 5, 0.0F, false));
        this.body.cubeList.add(new ModelBox(body, 31, 30, -1.0F, -4.75F, 0.5F, 2, 2, 7, 0.0F, false));

        this.cube_r1 = new AdvancedModelRenderer(this);
        this.cube_r1.setRotationPoint(1.0F, -2.75F, 6.5F);
        this.body.addChild(cube_r1);
        this.setRotateAngle(cube_r1, 0.0F, -1.0036F, 0.0F);
        this.cube_r1.cubeList.add(new ModelBox(cube_r1, 0, 0, -2.0F, -2.02F, -2.0F, 2, 2, 2, 0.0F, true));

        this.cube_r2 = new AdvancedModelRenderer(this);
        this.cube_r2.setRotationPoint(3.5F, -2.75F, 0.5F);
        this.body.addChild(cube_r2);
        this.setRotateAngle(cube_r2, 0.0F, -0.1745F, 0.0F);
        this.cube_r2.cubeList.add(new ModelBox(cube_r2, 13, 42, -3.0F, -2.01F, 0.0F, 3, 2, 5, 0.0F, true));

        this.cube_r3 = new AdvancedModelRenderer(this);
        this.cube_r3.setRotationPoint(-1.0F, -2.75F, 6.5F);
        this.body.addChild(cube_r3);
        this.setRotateAngle(cube_r3, 0.0F, 1.0036F, 0.0F);
        this.cube_r3.cubeList.add(new ModelBox(cube_r3, 0, 0, 0.0F, -2.02F, -2.0F, 2, 2, 2, 0.0F, false));

        this.cube_r4 = new AdvancedModelRenderer(this);
        this.cube_r4.setRotationPoint(-3.5F, -2.75F, 0.5F);
        this.body.addChild(cube_r4);
        this.setRotateAngle(cube_r4, 0.0F, 0.1745F, 0.0F);
        this.cube_r4.cubeList.add(new ModelBox(cube_r4, 13, 42, 0.0F, -2.01F, 0.0F, 3, 2, 5, 0.0F, false));

        this.cube_r5 = new AdvancedModelRenderer(this);
        this.cube_r5.setRotationPoint(0.0F, -3.825F, -2.0F);
        this.body.addChild(cube_r5);
        this.setRotateAngle(cube_r5, -0.2705F, 0.0F, 0.0F);
        this.cube_r5.cubeList.add(new ModelBox(cube_r5, 0, 32, -4.0F, -3.325F, -3.2F, 8, 3, 3, -0.02F, false));

        this.cube_r6 = new AdvancedModelRenderer(this);
        this.cube_r6.setRotationPoint(4.0F, -7.0F, 4.0F);
        this.body.addChild(cube_r6);
        this.setRotateAngle(cube_r6, 0.0F, -0.2443F, 0.0F);
        this.cube_r6.cubeList.add(new ModelBox(cube_r6, 40, 16, -3.2F, -0.98F, -0.75F, 3, 4, 5, 0.0F, true));

        this.cube_r7 = new AdvancedModelRenderer(this);
        this.cube_r7.setRotationPoint(1.0F, -7.0F, 9.0F);
        this.body.addChild(cube_r7);
        this.setRotateAngle(cube_r7, 0.0F, -1.0472F, 0.0F);
        this.cube_r7.cubeList.add(new ModelBox(cube_r7, 28, 25, -2.0F, -0.97F, -2.0F, 2, 2, 2, 0.0F, true));

        this.cube_r8 = new AdvancedModelRenderer(this);
        this.cube_r8.setRotationPoint(-4.0F, -7.0F, 4.0F);
        this.body.addChild(cube_r8);
        this.setRotateAngle(cube_r8, 0.0F, 0.2443F, 0.0F);
        this.cube_r8.cubeList.add(new ModelBox(cube_r8, 40, 16, 0.2F, -0.98F, -0.75F, 3, 4, 5, 0.0F, false));

        this.cube_r9 = new AdvancedModelRenderer(this);
        this.cube_r9.setRotationPoint(-1.0F, -7.0F, 9.0F);
        this.body.addChild(cube_r9);
        this.setRotateAngle(cube_r9, 0.0F, 1.0472F, 0.0F);
        this.cube_r9.cubeList.add(new ModelBox(cube_r9, 28, 25, 0.0F, -0.97F, -2.0F, 2, 2, 2, 0.0F, false));

        this.body2 = new AdvancedModelRenderer(this);
        this.body2.setRotationPoint(0.0F, -5.0F, 6.0F);
        this.body.addChild(body2);
        this.body2.cubeList.add(new ModelBox(body2, 34, 7, -2.0F, -2.0F, 0.0F, 4, 4, 5, 0.01F, false));
        this.body2.cubeList.add(new ModelBox(body2, 47, 7, -0.5F, 1.225F, 1.0F, 1, 1, 4, 0.0F, false));
        this.body2.cubeList.add(new ModelBox(body2, 24, 32, -0.5F, -2.75F, 3.0F, 1, 1, 2, 0.0F, false));

        this.body3 = new AdvancedModelRenderer(this);
        this.body3.setRotationPoint(0.0F, 0.0F, 5.0F);
        this.body2.addChild(body3);
        this.body3.cubeList.add(new ModelBox(body3, 0, 46, -1.5F, -2.0F, -1.0F, 3, 4, 4, 0.0F, false));
        this.body3.cubeList.add(new ModelBox(body3, 0, 24, -0.5F, 1.2F, 0.0F, 1, 1, 3, 0.0F, false));
        this.body3.cubeList.add(new ModelBox(body3, 28, 21, -0.5F, -2.5F, 0.0F, 1, 1, 3, 0.0F, false));

        this.body4 = new AdvancedModelRenderer(this);
        this.body4.setRotationPoint(0.0F, 0.0F, 3.0F);
        this.body3.addChild(body4);
        this.body4.cubeList.add(new ModelBox(body4, 0, 19, -0.5F, 1.0F, 0.0F, 1, 1, 4, 0.0F, false));
        this.body4.cubeList.add(new ModelBox(body4, 45, 34, -1.0F, -1.5F, -1.0F, 2, 3, 5, 0.0F, false));
        this.body4.cubeList.add(new ModelBox(body4, 14, 21, -0.5F, -2.25F, 0.0F, 1, 1, 4, 0.0F, false));

        this.body5 = new AdvancedModelRenderer(this);
        this.body5.setRotationPoint(0.0F, -0.25F, 4.0F);
        this.body4.addChild(body5);


        this.cube_r10 = new AdvancedModelRenderer(this);
        this.cube_r10.setRotationPoint(0.0F, -0.75F, 0.0F);
        this.body5.addChild(cube_r10);
        this.setRotateAngle(cube_r10, -0.2793F, 0.0F, 0.0F);
        this.cube_r10.cubeList.add(new ModelBox(cube_r10, 0, 10, -0.5F, -3.6F, 4.65F, 1, 4, 2, -0.02F, false));

        this.cube_r11 = new AdvancedModelRenderer(this);
        this.cube_r11.setRotationPoint(0.0F, -0.75F, 0.0F);
        this.body5.addChild(cube_r11);
        this.setRotateAngle(cube_r11, 1.0559F, 0.0F, 0.0F);
        this.cube_r11.cubeList.add(new ModelBox(cube_r11, 22, 10, -0.5F, 1.65F, 3.325F, 1, 4, 2, 0.0F, false));

        this.cube_r12 = new AdvancedModelRenderer(this);
        this.cube_r12.setRotationPoint(0.0F, -0.75F, 0.0F);
        this.body5.addChild(cube_r12);
        this.setRotateAngle(cube_r12, 0.0873F, 0.0F, 0.0F);
        this.cube_r12.cubeList.add(new ModelBox(cube_r12, 15, 32, -0.5F, -0.25F, -1.0F, 1, 3, 7, -0.01F, false));

        this.cube_r13 = new AdvancedModelRenderer(this);
        this.cube_r13.setRotationPoint(0.0F, -0.75F, 0.0F);
        this.body5.addChild(cube_r13);
        this.setRotateAngle(cube_r13, 0.4363F, 0.0F, 0.0F);
        this.cube_r13.cubeList.add(new ModelBox(cube_r13, 37, 40, -0.5F, -1.7F, -0.75F, 1, 4, 6, 0.01F, false));

        this.bone = new AdvancedModelRenderer(this);
        this.bone.setRotationPoint(0.0F, -8.0F, -5.0F);
        this.body.addChild(bone);
        this.setRotateAngle(bone, 0.1047F, 0.0F, 0.0F);
        this.bone.cubeList.add(new ModelBox(bone, 18, 10, -1.5F, 0.0F, -10.0F, 3, 1, 10, 0.0F, false));

        this.cube_r14 = new AdvancedModelRenderer(this);
        this.cube_r14.setRotationPoint(1.5F, 1.0F, -10.0F);
        this.bone.addChild(cube_r14);
        this.setRotateAngle(cube_r14, -0.1963F, 0.3796F, 0.0F);
        this.cube_r14.cubeList.add(new ModelBox(cube_r14, 24, 46, -2.02F, -0.98F, 0.0F, 2, 1, 5, 0.0F, true));

        this.cube_r15 = new AdvancedModelRenderer(this);
        this.cube_r15.setRotationPoint(1.5F, 2.0F, -10.0F);
        this.bone.addChild(cube_r15);
        this.setRotateAngle(cube_r15, 0.0F, 0.3796F, 0.0F);
        this.cube_r15.cubeList.add(new ModelBox(cube_r15, 46, 45, -2.0F, -1.98F, 0.0F, 2, 1, 5, 0.0F, true));

        this.cube_r16 = new AdvancedModelRenderer(this);
        this.cube_r16.setRotationPoint(4.0F, 2.0F, 0.0F);
        this.bone.addChild(cube_r16);
        this.setRotateAngle(cube_r16, -0.2094F, 0.1047F, 0.0F);
        this.cube_r16.cubeList.add(new ModelBox(cube_r16, 25, 39, -3.1F, -0.015F, -5.4F, 3, 1, 6, 0.0F, true));

        this.cube_r17 = new AdvancedModelRenderer(this);
        this.cube_r17.setRotationPoint(4.0F, 2.0F, 0.0F);
        this.bone.addChild(cube_r17);
        this.setRotateAngle(cube_r17, 0.0F, 0.1047F, 0.0F);
        this.cube_r17.cubeList.add(new ModelBox(cube_r17, 0, 38, -3.075F, -1.99F, -5.5F, 3, 2, 6, 0.0F, true));

        this.cube_r18 = new AdvancedModelRenderer(this);
        this.cube_r18.setRotationPoint(-4.0F, 2.0F, 0.0F);
        this.bone.addChild(cube_r18);
        this.setRotateAngle(cube_r18, -0.2094F, -0.1047F, 0.0F);
        this.cube_r18.cubeList.add(new ModelBox(cube_r18, 25, 39, 0.1F, -0.015F, -5.4F, 3, 1, 6, 0.0F, false));

        this.cube_r19 = new AdvancedModelRenderer(this);
        this.cube_r19.setRotationPoint(-4.0F, 2.0F, 0.0F);
        this.bone.addChild(cube_r19);
        this.setRotateAngle(cube_r19, 0.0F, -0.1047F, 0.0F);
        this.cube_r19.cubeList.add(new ModelBox(cube_r19, 0, 38, 0.075F, -1.99F, -5.5F, 3, 2, 6, 0.0F, false));

        this.cube_r20 = new AdvancedModelRenderer(this);
        this.cube_r20.setRotationPoint(-1.5F, 1.0F, -10.0F);
        this.bone.addChild(cube_r20);
        this.setRotateAngle(cube_r20, -0.1963F, -0.3796F, 0.0F);
        this.cube_r20.cubeList.add(new ModelBox(cube_r20, 24, 46, 0.02F, -0.98F, 0.0F, 2, 1, 5, 0.0F, false));

        this.cube_r21 = new AdvancedModelRenderer(this);
        this.cube_r21.setRotationPoint(-1.5F, 2.0F, -10.0F);
        this.bone.addChild(cube_r21);
        this.setRotateAngle(cube_r21, 0.0F, -0.3796F, 0.0F);
        this.cube_r21.cubeList.add(new ModelBox(cube_r21, 46, 45, 0.0F, -1.98F, 0.0F, 2, 1, 5, 0.0F, false));

        this.bone4 = new AdvancedModelRenderer(this);
        this.bone4.setRotationPoint(0.0F, -2.9F, -4.5F);
        this.body.addChild(bone4);
        this.setRotateAngle(bone4, -0.2705F, 0.0F, 0.0F);
        this.bone4.cubeList.add(new ModelBox(bone4, 14, 21, -1.0F, -1.0F, -10.0F, 2, 1, 10, 0.01F, false));

        this.cube_r22 = new AdvancedModelRenderer(this);
        this.cube_r22.setRotationPoint(1.0F, 0.0F, -10.0F);
        this.bone4.addChild(cube_r22);
        this.setRotateAngle(cube_r22, 0.0F, 0.2269F, 0.0F);
        this.cube_r22.cubeList.add(new ModelBox(cube_r22, 14, 26, -3.0F, -1.0F, 8.0F, 1, 1, 2, 0.0F, true));
        this.cube_r22.cubeList.add(new ModelBox(cube_r22, 28, 21, -2.0F, -2.0F, 3.0F, 2, 1, 8, 0.0F, true));
        this.cube_r22.cubeList.add(new ModelBox(cube_r22, 0, 19, -2.0F, -1.0F, 0.0F, 2, 1, 10, 0.0F, true));

        this.cube_r23 = new AdvancedModelRenderer(this);
        this.cube_r23.setRotationPoint(-1.0F, 0.0F, -10.0F);
        this.bone4.addChild(cube_r23);
        this.setRotateAngle(cube_r23, 0.0F, -0.2269F, 0.0F);
        this.cube_r23.cubeList.add(new ModelBox(cube_r23, 14, 26, 2.0F, -1.0F, 8.0F, 1, 1, 2, 0.0F, false));
        this.cube_r23.cubeList.add(new ModelBox(cube_r23, 28, 21, 0.0F, -2.0F, 3.0F, 2, 1, 8, 0.0F, false));
        this.cube_r23.cubeList.add(new ModelBox(cube_r23, 0, 19, 0.0F, -1.0F, 0.0F, 2, 1, 10, 0.0F, false));

        updateDefaultPose();
    }

    @Override
    public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        this.body.render(f5);
    }
    public void renderStaticWall(float f) {
        this.body.rotateAngleY = (float) Math.toRadians(90);
        this.body.offsetY = -0.2F;
        this.body.offsetX = -0.05F;
        this.body.offsetZ = -0.0F;
        this.body.render(0.01F);
        resetToDefaultPose();
    }
    public void renderStaticFloor(float f) {
        this.setRotateAngle(body, -0.1F, 0.0F, -0.1F);
        this.setRotateAngle(body2, 0.05F, 0.05F, 0.0F);
        this.setRotateAngle(body3, 0.05F, 0.05F, 0.0F);
        this.setRotateAngle(body4, 0.05F, 0.1F, 0.0F);
        this.setRotateAngle(body5, 0.05F, 0.1F, 0.0F);
        this.body.offsetY = -0.0F;
        this.body.render(0.01F);
        resetToDefaultPose();
    }
    @Override
    public void renderStaticBook(float f) {
        //Rotations, positions and sizing:
        this.body.offsetY = -1.2F;
        this.body.offsetX = 0.3F;
        this.body.offsetZ = 2.0F;
        this.body.rotateAngleY = (float)Math.toRadians(120);
        this.body.rotateAngleX = (float)Math.toRadians(0);
        this.body.rotateAngleZ = (float)Math.toRadians(0);
        this.body.scaleChildren = true;
        float scaler = 2.0F;
        this.body.setScale(scaler, scaler, scaler);
        //Start of pose:
        this.setRotateAngle(body, 0.6F, 3.8F, -0.2F);
        this.setRotateAngle(body2, 0.05F, 0.05F, 0.0F);
        this.setRotateAngle(body3, 0.05F, 0.05F, 0.0F);
        this.setRotateAngle(body4, 0.05F, 0.1F, 0.0F);
        this.setRotateAngle(body5, 0.05F, 0.1F, 0.0F);
        //End of pose, now render the model:
        this.body.render(f);
        //Reset rotations, positions and sizing:
        this.body.setScale(1.0F, 1.0F, 1.0F);
        this.body.scaleChildren = false;
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
        //this.body.offsetY = 0.95F;

        //this.Tailfin.setScale(1.1F, 1.1F, 1.1F);
        AdvancedModelRenderer[] fishTail = {this.body2, this.body3, this.body4, this.body5};

        float speed = 0.422F;
        float taildegree = 0.325F;

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
            speed = 0.125F;
            taildegree = 0.125F;
        }

        if (e instanceof EntityLiving && !((EntityLiving) e).isAIDisabled()) {
            this.chainWave(fishTail, speed, 0.05F, -3, f2, 1);
            this.chainSwing(fishTail, speed, taildegree, -3, f2, 1);
            if (f3 != 0) {
                this.swing(body, speed, 0.12F, true, 0, 0, f2, 1);
            }

            if (!e.isInWater()) {
                //this.Bodyfront.rotateAngleZ = (float) Math.toRadians(90);
                this.body.offsetY = 0.15F;
                this.bob(body, -speed, 2F, false, f2, 1);
                this.chainWave(fishTail, speed, 0.2F, -3, f2, 1);
            }
        }
    }
}
