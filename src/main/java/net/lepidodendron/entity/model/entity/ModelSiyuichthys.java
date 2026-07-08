package net.lepidodendron.entity.model.entity;

import net.ilexiconn.llibrary.client.model.tools.AdvancedModelRenderer;
import net.lepidodendron.entity.model.ModelBasePalaeopedia;
import net.minecraft.block.material.Material;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLiving;
import net.minecraft.util.math.BlockPos;

public class ModelSiyuichthys extends ModelBasePalaeopedia {
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
    private final AdvancedModelRenderer frontLeftFin;
    private final AdvancedModelRenderer frontRightFin;
    private final AdvancedModelRenderer frontBackFin;
    private final AdvancedModelRenderer frontBackFin2;
    private final AdvancedModelRenderer jaw;
    private final AdvancedModelRenderer cube_r12;
    private final AdvancedModelRenderer tail1;
    private final AdvancedModelRenderer cube_r13;
    private final AdvancedModelRenderer cube_r14;
    private final AdvancedModelRenderer tail2;
    private final AdvancedModelRenderer cube_r15;
    private final AdvancedModelRenderer cube_r16;
    private final AdvancedModelRenderer cube_r17;
    private final AdvancedModelRenderer tail3;

    public ModelSiyuichthys() {
        this.textureWidth = 48;
        this.textureHeight = 48;

        this.main = new AdvancedModelRenderer(this);
        this.main.setRotationPoint(0.0F, 19.525F, 0.0F);
        this.main.cubeList.add(new ModelBox(main, 0, 0, -1.5F, -2.0F, -4.0F, 3, 4, 5, 0.0F, false));
        this.main.cubeList.add(new ModelBox(main, 0, 9, -1.5F, -1.5F, -6.0F, 3, 3, 3, 0.01F, false));
        this.main.cubeList.add(new ModelBox(main, 18, 23, -1.0F, -0.75F, -8.0F, 2, 2, 2, 0.01F, false));

        this.cube_r1 = new AdvancedModelRenderer(this);
        this.cube_r1.setRotationPoint(0.0F, -2.5312F, -0.083F);
        this.main.addChild(cube_r1);
        this.setRotateAngle(cube_r1, -1.9199F, 0.0F, 0.0F);
        this.cube_r1.cubeList.add(new ModelBox(cube_r1, 30, 4, 0.0F, -3.0F, -2.0F, 0, 3, 2, 0.0F, false));

        this.cube_r2 = new AdvancedModelRenderer(this);
        this.cube_r2.setRotationPoint(0.0F, -2.7491F, -2.3235F);
        this.main.addChild(cube_r2);
        this.setRotateAngle(cube_r2, -1.6581F, 0.0F, 0.0F);
        this.cube_r2.cubeList.add(new ModelBox(cube_r2, 18, 27, -1.0F, -3.0F, 0.0F, 2, 3, 1, -0.01F, false));

        this.cube_r3 = new AdvancedModelRenderer(this);
        this.cube_r3.setRotationPoint(0.0F, -2.5748F, -4.3159F);
        this.main.addChild(cube_r3);
        this.setRotateAngle(cube_r3, -1.4835F, 0.0F, 0.0F);
        this.cube_r3.cubeList.add(new ModelBox(cube_r3, 0, 25, -1.0F, -2.0F, 0.0F, 2, 2, 2, 0.0F, false));

        this.cube_r4 = new AdvancedModelRenderer(this);
        this.cube_r4.setRotationPoint(0.0F, -1.6727F, -7.177F);
        this.main.addChild(cube_r4);
        this.setRotateAngle(cube_r4, -1.2654F, 0.0F, 0.0F);
        this.cube_r4.cubeList.add(new ModelBox(cube_r4, 10, 23, -1.0F, -3.0F, 0.0F, 2, 3, 2, -0.01F, false));

        this.cube_r5 = new AdvancedModelRenderer(this);
        this.cube_r5.setRotationPoint(-12.0F, -0.7492F, -8.9511F);
        this.main.addChild(cube_r5);
        this.setRotateAngle(cube_r5, -1.0908F, 0.0F, 0.0F);
        this.cube_r5.cubeList.add(new ModelBox(cube_r5, 0, 29, 11.0F, -2.0F, 0.0F, 2, 2, 1, 0.0F, false));

        this.cube_r6 = new AdvancedModelRenderer(this);
        this.cube_r6.setRotationPoint(0.0F, 2.9059F, -1.7811F);
        this.main.addChild(cube_r6);
        this.setRotateAngle(cube_r6, 0.1309F, 0.0F, 0.0F);
        this.cube_r6.cubeList.add(new ModelBox(cube_r6, 20, 19, -1.0F, -1.0F, 0.0F, 2, 1, 3, -0.01F, false));

        this.cube_r7 = new AdvancedModelRenderer(this);
        this.cube_r7.setRotationPoint(0.0F, 2.7751F, -4.7783F);
        this.main.addChild(cube_r7);
        this.setRotateAngle(cube_r7, -0.0436F, 0.0F, 0.0F);
        this.cube_r7.cubeList.add(new ModelBox(cube_r7, 20, 6, -1.0F, -2.0F, 0.0F, 2, 2, 3, 0.0F, false));

        this.cube_r8 = new AdvancedModelRenderer(this);
        this.cube_r8.setRotationPoint(0.0F, 2.3835F, -7.7526F);
        this.main.addChild(cube_r8);
        this.setRotateAngle(cube_r8, -0.1309F, 0.0F, 0.0F);
        this.cube_r8.cubeList.add(new ModelBox(cube_r8, 10, 18, -1.0F, -2.0F, 0.0F, 2, 2, 3, -0.01F, false));

        this.cube_r9 = new AdvancedModelRenderer(this);
        this.cube_r9.setRotationPoint(-1.0F, -0.7492F, -8.9511F);
        this.main.addChild(cube_r9);
        this.setRotateAngle(cube_r9, -0.7931F, -0.1231F, 0.124F);
        this.cube_r9.cubeList.add(new ModelBox(cube_r9, 26, 4, -0.05F, -0.55F, 0.95F, 1, 1, 1, 0.0F, true));
        this.cube_r9.cubeList.add(new ModelBox(cube_r9, 26, 23, 0.0F, 0.0F, 0.0F, 1, 1, 3, 0.0F, true));

        this.cube_r10 = new AdvancedModelRenderer(this);
        this.cube_r10.setRotationPoint(1.0F, -0.7492F, -8.9511F);
        this.main.addChild(cube_r10);
        this.setRotateAngle(cube_r10, -0.7931F, 0.1231F, -0.124F);
        this.cube_r10.cubeList.add(new ModelBox(cube_r10, 26, 4, -0.95F, -0.55F, 0.95F, 1, 1, 1, 0.0F, false));
        this.cube_r10.cubeList.add(new ModelBox(cube_r10, 26, 23, -1.0F, 0.0F, 0.0F, 1, 1, 3, 0.0F, false));

        this.cube_r11 = new AdvancedModelRenderer(this);
        this.cube_r11.setRotationPoint(-7.0F, -0.7492F, -8.9511F);
        this.main.addChild(cube_r11);
        this.setRotateAngle(cube_r11, -0.7418F, 0.0F, 0.0F);
        this.cube_r11.cubeList.add(new ModelBox(cube_r11, 20, 15, 6.0F, 0.0F, 0.0F, 2, 1, 3, 0.0F, false));

        this.frontLeftFin = new AdvancedModelRenderer(this);
        this.frontLeftFin.setRotationPoint(1.0F, 2.2864F, -4.5067F);
        this.main.addChild(frontLeftFin);
        this.setRotateAngle(frontLeftFin, -0.4363F, 0.6109F, -0.2618F);
        this.frontLeftFin.cubeList.add(new ModelBox(frontLeftFin, 8, 28, 0.0F, -0.5F, 0.0F, 0, 1, 3, 0.0F, false));

        this.frontRightFin = new AdvancedModelRenderer(this);
        this.frontRightFin.setRotationPoint(-1.0F, 2.2864F, -4.5067F);
        this.main.addChild(frontRightFin);
        this.setRotateAngle(frontRightFin, -0.4363F, -0.6109F, 0.2618F);
        this.frontRightFin.cubeList.add(new ModelBox(frontRightFin, 8, 28, 0.0F, -0.5F, 0.0F, 0, 1, 3, 0.0F, true));

        this.frontBackFin = new AdvancedModelRenderer(this);
        this.frontBackFin.setRotationPoint(1.0F, 2.0364F, 0.2433F);
        this.main.addChild(frontBackFin);
        this.setRotateAngle(frontBackFin, -0.2182F, 0.3927F, 0.0F);
        this.frontBackFin.cubeList.add(new ModelBox(frontBackFin, 16, 6, 0.0F, -0.5F, 0.0F, 0, 1, 2, 0.0F, false));

        this.frontBackFin2 = new AdvancedModelRenderer(this);
        this.frontBackFin2.setRotationPoint(-1.0F, 2.0364F, 0.2433F);
        this.main.addChild(frontBackFin2);
        this.setRotateAngle(frontBackFin2, -0.2182F, -0.3927F, 0.0F);
        this.frontBackFin2.cubeList.add(new ModelBox(frontBackFin2, 16, 6, 0.0F, -0.5F, 0.0F, 0, 1, 2, 0.0F, true));

        this.jaw = new AdvancedModelRenderer(this);
        this.jaw.setRotationPoint(0.0F, 1.7508F, -7.4511F);
        this.main.addChild(jaw);


        this.cube_r12 = new AdvancedModelRenderer(this);
        this.cube_r12.setRotationPoint(0.0F, -2.5F, -1.5F);
        this.jaw.addChild(cube_r12);
        this.setRotateAngle(cube_r12, -0.7418F, 0.0F, 0.0F);
        this.cube_r12.cubeList.add(new ModelBox(cube_r12, 20, 11, -1.0F, 0.5F, 0.1F, 2, 1, 3, -0.02F, false));

        this.tail1 = new AdvancedModelRenderer(this);
        this.tail1.setRotationPoint(0.0F, 0.0075F, 0.624F);
        this.main.addChild(tail1);
        this.tail1.cubeList.add(new ModelBox(tail1, 0, 15, -1.0F, -1.5075F, -0.124F, 2, 3, 3, 0.01F, false));

        this.cube_r13 = new AdvancedModelRenderer(this);
        this.cube_r13.setRotationPoint(0.0F, 2.6374F, -0.4222F);
        this.tail1.addChild(cube_r13);
        this.setRotateAngle(cube_r13, 0.2618F, 0.0F, 0.0F);
        this.cube_r13.cubeList.add(new ModelBox(cube_r13, 0, 21, -1.0F, -1.0F, 0.5F, 2, 1, 3, 0.0F, false));

        this.cube_r14 = new AdvancedModelRenderer(this);
        this.cube_r14.setRotationPoint(0.0F, -2.4951F, 0.0411F);
        this.tail1.addChild(cube_r14);
        this.setRotateAngle(cube_r14, -1.7191F, 0.0F, 0.0F);
        this.cube_r14.cubeList.add(new ModelBox(cube_r14, 24, 27, -1.0F, -3.0F, 0.0F, 2, 3, 1, 0.0F, false));

        this.tail2 = new AdvancedModelRenderer(this);
        this.tail2.setRotationPoint(0.0F, 0.0F, 2.5F);
        this.tail1.addChild(tail2);
        this.tail2.cubeList.add(new ModelBox(tail2, 16, 0, -0.5F, -1.0075F, -0.1239F, 1, 2, 4, 0.01F, false));

        this.cube_r15 = new AdvancedModelRenderer(this);
        this.cube_r15.setRotationPoint(7.5F, -2.0F, 0.5F);
        this.tail2.addChild(cube_r15);
        this.setRotateAngle(cube_r15, -1.7366F, 0.0F, 0.0F);
        this.cube_r15.cubeList.add(new ModelBox(cube_r15, 14, 28, -8.0F, -3.5F, 0.0F, 1, 4, 1, 0.0F, false));

        this.cube_r16 = new AdvancedModelRenderer(this);
        this.cube_r16.setRotationPoint(8.0F, 1.8609F, -0.0244F);
        this.tail2.addChild(cube_r16);
        this.setRotateAngle(cube_r16, 0.3054F, 0.0F, 0.0F);
        this.cube_r16.cubeList.add(new ModelBox(cube_r16, 26, 0, -8.5F, -1.0F, 0.0F, 1, 1, 3, 0.0F, false));

        this.cube_r17 = new AdvancedModelRenderer(this);
        this.cube_r17.setRotationPoint(0.0F, 1.5602F, 0.9293F);
        this.tail2.addChild(cube_r17);
        this.setRotateAngle(cube_r17, -0.9163F, 0.0F, 0.0F);
        this.cube_r17.cubeList.add(new ModelBox(cube_r17, 30, 9, 0.0F, -2.0F, 0.0F, 0, 2, 2, 0.0F, false));

        this.tail3 = new AdvancedModelRenderer(this);
        this.tail3.setRotationPoint(0.0F, -0.2575F, 3.8761F);
        this.tail2.addChild(tail3);
        this.tail3.cubeList.add(new ModelBox(tail3, 12, 9, 0.0F, -2.5F, 0.0F, 0, 5, 4, 0.0F, false));

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
        this.main.offsetY = -1.2F;
        this.main.offsetX = -0.2F;
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
        AdvancedModelRenderer[] fishTail = {this.tail1, this.tail2, this.tail3};

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
