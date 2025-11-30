package net.lepidodendron.entity.model.entity;

import net.ilexiconn.llibrary.client.model.tools.AdvancedModelRenderer;
import net.lepidodendron.entity.model.ModelBasePalaeopedia;
import net.minecraft.block.material.Material;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLiving;
import net.minecraft.util.math.BlockPos;

public class ModelAmericaspis extends ModelBasePalaeopedia {
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
    private final AdvancedModelRenderer tail;
    private final AdvancedModelRenderer tail2;
    private final AdvancedModelRenderer cube_r13;
    private final AdvancedModelRenderer tail3;
    private final AdvancedModelRenderer cube_r14;
    private final AdvancedModelRenderer cube_r15;

    public ModelAmericaspis() {
        this.textureWidth = 45;
        this.textureHeight = 45;

        this.main = new AdvancedModelRenderer(this);
        this.main.setRotationPoint(0.0F, 24.0F, 0.0F);
        this.main.cubeList.add(new ModelBox(main, 14, 4, -2.0F, -4.0F, -3.0F, 4, 2, 5, 0.002F, false));
        this.main.cubeList.add(new ModelBox(main, 14, 12, -1.75F, -2.0F, -3.0F, 3, 2, 5, -0.001F, false));
        this.main.cubeList.add(new ModelBox(main, 20, 23, 0.75F, -2.0F, -3.0F, 1, 2, 5, 0.0F, false));

        this.cube_r1 = new AdvancedModelRenderer(this);
        this.cube_r1.setRotationPoint(0.5F, -3.6084F, -5.9743F);
        this.main.addChild(cube_r1);
        this.setRotateAngle(cube_r1, 0.4363F, 0.0F, 0.0F);
        this.cube_r1.cubeList.add(new ModelBox(cube_r1, 20, 20, -1.5F, 0.0F, -3.0F, 2, 1, 1, 0.0F, false));
        this.cube_r1.cubeList.add(new ModelBox(cube_r1, 33, 7, -2.0F, 0.0F, -2.0F, 3, 1, 2, -0.001F, false));

        this.cube_r2 = new AdvancedModelRenderer(this);
        this.cube_r2.setRotationPoint(2.0F, -4.0F, -3.0F);
        this.main.addChild(cube_r2);
        this.setRotateAngle(cube_r2, 0.1283F, 0.1764F, -0.0033F);
        this.cube_r2.cubeList.add(new ModelBox(cube_r2, 23, 31, -1.0F, 0.0F, -3.0F, 1, 2, 3, -0.001F, true));

        this.cube_r3 = new AdvancedModelRenderer(this);
        this.cube_r3.setRotationPoint(-2.0F, -4.0F, -3.0F);
        this.main.addChild(cube_r3);
        this.setRotateAngle(cube_r3, 0.1283F, -0.1764F, 0.0033F);
        this.cube_r3.cubeList.add(new ModelBox(cube_r3, 23, 31, 0.0F, 0.0F, -3.0F, 1, 2, 3, -0.001F, false));

        this.cube_r4 = new AdvancedModelRenderer(this);
        this.cube_r4.setRotationPoint(-1.0F, -4.0F, -3.0F);
        this.main.addChild(cube_r4);
        this.setRotateAngle(cube_r4, 0.1309F, 0.0F, 0.0F);
        this.cube_r4.cubeList.add(new ModelBox(cube_r4, 10, 29, -0.5F, 0.0F, -3.0F, 3, 2, 3, 0.0F, false));

        this.cube_r5 = new AdvancedModelRenderer(this);
        this.cube_r5.setRotationPoint(0.75F, -1.9831F, -6.6857F);
        this.main.addChild(cube_r5);
        this.setRotateAngle(cube_r5, 0.3491F, 0.0F, 0.0F);
        this.cube_r5.cubeList.add(new ModelBox(cube_r5, 13, 12, -0.5F, -0.5F, -0.325F, 1, 1, 1, 0.0F, true));
        this.cube_r5.cubeList.add(new ModelBox(cube_r5, 13, 12, -2.0F, -0.5F, -0.325F, 1, 1, 1, 0.0F, false));

        this.cube_r6 = new AdvancedModelRenderer(this);
        this.cube_r6.setRotationPoint(-0.5F, -0.5209F, -5.9544F);
        this.main.addChild(cube_r6);
        this.setRotateAngle(cube_r6, -0.6981F, 0.0F, 0.0F);
        this.cube_r6.cubeList.add(new ModelBox(cube_r6, 32, 34, -0.5F, -2.0F, -2.0F, 2, 2, 2, -0.001F, false));

        this.cube_r7 = new AdvancedModelRenderer(this);
        this.cube_r7.setRotationPoint(-1.0F, 0.0F, -3.0F);
        this.main.addChild(cube_r7);
        this.setRotateAngle(cube_r7, -0.1745F, 0.0F, 0.0F);
        this.cube_r7.cubeList.add(new ModelBox(cube_r7, 28, 17, -0.5F, -2.0F, -3.0F, 3, 2, 3, -0.001F, false));

        this.cube_r8 = new AdvancedModelRenderer(this);
        this.cube_r8.setRotationPoint(1.5F, 0.0F, 2.0F);
        this.main.addChild(cube_r8);
        this.setRotateAngle(cube_r8, 0.4363F, 0.0F, 0.0F);
        this.cube_r8.cubeList.add(new ModelBox(cube_r8, 11, 35, -0.75F, -2.0F, 0.0F, 1, 2, 2, -0.001F, false));
        this.cube_r8.cubeList.add(new ModelBox(cube_r8, 0, 33, -3.25F, -2.0F, 0.0F, 3, 2, 2, -0.002F, false));

        this.cube_r9 = new AdvancedModelRenderer(this);
        this.cube_r9.setRotationPoint(0.0F, -1.0603F, 1.9804F);
        this.main.addChild(cube_r9);
        this.setRotateAngle(cube_r9, 0.096F, 0.0F, 0.0F);
        this.cube_r9.cubeList.add(new ModelBox(cube_r9, 13, 0, -2.0F, -1.0F, 0.0F, 4, 1, 2, -0.001F, false));

        this.cube_r10 = new AdvancedModelRenderer(this);
        this.cube_r10.setRotationPoint(0.5F, -1.0603F, 1.9804F);
        this.main.addChild(cube_r10);
        this.setRotateAngle(cube_r10, -0.3229F, 0.0F, 0.0F);
        this.cube_r10.cubeList.add(new ModelBox(cube_r10, 26, 12, -2.5F, -1.0F, -3.0F, 4, 1, 3, 0.001F, false));

        this.cube_r11 = new AdvancedModelRenderer(this);
        this.cube_r11.setRotationPoint(0.0F, -2.7719F, 3.8686F);
        this.main.addChild(cube_r11);
        this.setRotateAngle(cube_r11, -0.0305F, 0.0F, 0.0F);
        this.cube_r11.cubeList.add(new ModelBox(cube_r11, 0, 0, -0.5F, -1.075F, -0.5F, 1, 1, 1, 0.0F, false));

        this.cube_r12 = new AdvancedModelRenderer(this);
        this.cube_r12.setRotationPoint(-0.5F, -4.0F, 2.0F);
        this.main.addChild(cube_r12);
        this.setRotateAngle(cube_r12, -0.0742F, 0.0F, 0.0F);
        this.cube_r12.cubeList.add(new ModelBox(cube_r12, 28, 23, -1.5F, 0.0F, 0.0F, 4, 2, 2, 0.0F, false));

        this.tail = new AdvancedModelRenderer(this);
        this.tail.setRotationPoint(0.0F, -2.0F, 3.5F);
        this.main.addChild(tail);
        this.tail.cubeList.add(new ModelBox(tail, 0, 0, -1.5F, -1.5F, 0.0F, 3, 2, 6, 0.0F, false));
        this.tail.cubeList.add(new ModelBox(tail, 0, 17, -0.5F, -1.75F, 0.0F, 1, 1, 6, -0.001F, false));
        this.tail.cubeList.add(new ModelBox(tail, 0, 9, -1.5F, 0.1F, 0.0F, 3, 1, 6, -0.001F, false));

        this.tail2 = new AdvancedModelRenderer(this);
        this.tail2.setRotationPoint(0.0F, -0.25F, 5.5F);
        this.tail.addChild(tail2);
        this.tail2.cubeList.add(new ModelBox(tail2, 10, 20, -1.0F, -1.0F, 0.0F, 2, 2, 5, 0.0F, false));

        this.cube_r13 = new AdvancedModelRenderer(this);
        this.cube_r13.setRotationPoint(0.0F, -1.475F, 0.45F);
        this.tail2.addChild(cube_r13);
        this.setRotateAngle(cube_r13, -0.0436F, 0.0F, 0.0F);
        this.cube_r13.cubeList.add(new ModelBox(cube_r13, 0, 25, -0.5F, 0.225F, -0.45F, 1, 1, 5, -0.002F, false));

        this.tail3 = new AdvancedModelRenderer(this);
        this.tail3.setRotationPoint(0.0F, 0.025F, 4.5F);
        this.tail2.addChild(tail3);


        this.cube_r14 = new AdvancedModelRenderer(this);
        this.cube_r14.setRotationPoint(0.0F, -1.0F, 0.5F);
        this.tail3.addChild(cube_r14);
        this.setRotateAngle(cube_r14, 0.3491F, 0.0F, 0.0F);
        this.cube_r14.cubeList.add(new ModelBox(cube_r14, 0, 9, -0.5F, 1.0F, 2.0F, 1, 2, 1, 0.0F, false));
        this.cube_r14.cubeList.add(new ModelBox(cube_r14, 29, 28, -0.5F, 0.0F, -1.0F, 1, 1, 4, 0.002F, false));

        this.cube_r15 = new AdvancedModelRenderer(this);
        this.cube_r15.setRotationPoint(0.0F, 0.0F, 0.5F);
        this.tail3.addChild(cube_r15);
        this.setRotateAngle(cube_r15, -0.3491F, 0.0F, 0.0F);
        this.cube_r15.cubeList.add(new ModelBox(cube_r15, 26, 0, -0.5F, -1.6F, 0.7F, 1, 1, 2, -0.001F, false));
        this.cube_r15.cubeList.add(new ModelBox(cube_r15, 28, 0, -0.5F, -0.6F, 0.0F, 1, 1, 5, 0.001F, false));
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
        this.main.offsetY = -1.6F;
        this.main.offsetX = 0.1F;
        this.main.rotateAngleY = (float)Math.toRadians(230);
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
                this.main.rotateAngleZ = (float) Math.toRadians(90);
                //this.main.offsetY = 0.95F;
                this.bob(main, -speed, 2F, false, f2, 1);
                this.chainWave(fishTail, speed, 0.2F, -3, f2, 1);
            }
        }
    }
}
