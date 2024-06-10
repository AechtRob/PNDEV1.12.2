package net.lepidodendron.entity.model.entity;

import net.ilexiconn.llibrary.client.model.tools.AdvancedModelRenderer;
import net.lepidodendron.entity.model.ModelBasePalaeopedia;
import net.minecraft.block.material.Material;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLiving;
import net.minecraft.util.math.BlockPos;

public class ModelAthenaegis extends ModelBasePalaeopedia {
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
    private final AdvancedModelRenderer jawdontmove;
    private final AdvancedModelRenderer cube_r10;
    private final AdvancedModelRenderer cube_r11;
    private final AdvancedModelRenderer tail;
    private final AdvancedModelRenderer cube_r12;
    private final AdvancedModelRenderer cube_r13;
    private final AdvancedModelRenderer tail2;
    private final AdvancedModelRenderer cube_r14;
    private final AdvancedModelRenderer cube_r15;
    private final AdvancedModelRenderer tail3;
    private final AdvancedModelRenderer cube_r16;
    private final AdvancedModelRenderer cube_r17;

    public ModelAthenaegis() {
        this.textureWidth = 64;
        this.textureHeight = 64;

        this.main = new AdvancedModelRenderer(this);
        this.main.setRotationPoint(-0.5F, 26.0F, 0.0F);


        this.cube_r1 = new AdvancedModelRenderer(this);
        this.cube_r1.setRotationPoint(-0.25F, -5.0F, -4.75F);
        this.main.addChild(cube_r1);
        this.setRotateAngle(cube_r1, 0.2182F, 0.0F, 0.0F);
        this.cube_r1.cubeList.add(new ModelBox(cube_r1, 17, 0, -1.375F, -0.075F, -1.05F, 2, 1, 2, 0.0F, true));
        this.cube_r1.cubeList.add(new ModelBox(cube_r1, 17, 0, 0.875F, -0.075F, -1.05F, 2, 1, 2, 0.0F, false));
        this.cube_r1.cubeList.add(new ModelBox(cube_r1, 23, 15, -1.4F, -1.35F, -1.05F, 2, 1, 2, 0.0F, true));
        this.cube_r1.cubeList.add(new ModelBox(cube_r1, 23, 15, 0.9F, -1.35F, -1.05F, 2, 1, 2, 0.0F, false));

        this.cube_r2 = new AdvancedModelRenderer(this);
        this.cube_r2.setRotationPoint(0.425F, -5.1248F, -4.8801F);
        this.main.addChild(cube_r2);
        this.setRotateAngle(cube_r2, 0.2182F, 0.0F, 0.0F);
        this.cube_r2.cubeList.add(new ModelBox(cube_r2, 12, 25, -2.0F, -0.5F, -0.5F, 2, 1, 1, 0.0F, true));
        this.cube_r2.cubeList.add(new ModelBox(cube_r2, 12, 25, 0.15F, -0.5F, -0.5F, 2, 1, 1, 0.0F, false));

        this.cube_r3 = new AdvancedModelRenderer(this);
        this.cube_r3.setRotationPoint(0.0F, -7.8484F, -4.6886F);
        this.main.addChild(cube_r3);
        this.setRotateAngle(cube_r3, 0.5672F, 0.0F, 0.0F);
        this.cube_r3.cubeList.add(new ModelBox(cube_r3, 37, 9, -1.5F, -0.0073F, -2.9799F, 4, 2, 3, -0.01F, false));

        this.cube_r4 = new AdvancedModelRenderer(this);
        this.cube_r4.setRotationPoint(0.0F, -6.2234F, -7.1886F);
        this.main.addChild(cube_r4);
        this.setRotateAngle(cube_r4, 1.4399F, 0.0F, 0.0F);
        this.cube_r4.cubeList.add(new ModelBox(cube_r4, 0, 37, -1.5F, -0.0346F, -1.9733F, 4, 4, 2, 0.0F, false));

        this.cube_r5 = new AdvancedModelRenderer(this);
        this.cube_r5.setRotationPoint(0.0F, -9.3734F, 0.0614F);
        this.main.addChild(cube_r5);
        this.setRotateAngle(cube_r5, 0.3403F, 0.0F, 0.0F);
        this.cube_r5.cubeList.add(new ModelBox(cube_r5, 16, 25, -0.5F, -0.1562F, -4.9186F, 2, 2, 5, -0.001F, false));

        this.cube_r6 = new AdvancedModelRenderer(this);
        this.cube_r6.setRotationPoint(0.0F, -9.3734F, 0.0614F);
        this.main.addChild(cube_r6);
        this.setRotateAngle(cube_r6, 0.3054F, 0.0F, 0.0F);
        this.cube_r6.cubeList.add(new ModelBox(cube_r6, 15, 18, -2.0F, 0.0188F, -4.9686F, 5, 2, 5, 0.0F, false));

        this.cube_r7 = new AdvancedModelRenderer(this);
        this.cube_r7.setRotationPoint(0.5F, -2.817F, -4.3055F);
        this.main.addChild(cube_r7);
        this.setRotateAngle(cube_r7, -0.4014F, 0.0F, 0.0F);
        this.cube_r7.cubeList.add(new ModelBox(cube_r7, 15, 14, -1.5F, -1.0106F, -2.0485F, 3, 1, 2, 0.01F, false));

        this.cube_r8 = new AdvancedModelRenderer(this);
        this.cube_r8.setRotationPoint(0.5F, -3.5926F, -1.576F);
        this.main.addChild(cube_r8);
        this.setRotateAngle(cube_r8, -0.0873F, 0.0F, 0.0F);
        this.cube_r8.cubeList.add(new ModelBox(cube_r8, 17, 7, -2.5F, -1.0F, -2.7F, 5, 2, 5, 0.01F, false));

        this.cube_r9 = new AdvancedModelRenderer(this);
        this.cube_r9.setRotationPoint(0.0F, -6.3431F, 2.7275F);
        this.main.addChild(cube_r9);
        this.setRotateAngle(cube_r9, 0.0436F, 0.0F, 0.0F);
        this.cube_r9.cubeList.add(new ModelBox(cube_r9, 12, 35, -2.0F, -1.125F, -6.75F, 5, 4, 2, -0.01F, false));
        this.cube_r9.cubeList.add(new ModelBox(cube_r9, 22, 0, -2.0F, -1.125F, -5.5F, 5, 4, 3, -0.001F, false));
        this.cube_r9.cubeList.add(new ModelBox(cube_r9, 25, 30, -0.5F, -3.325F, -2.5F, 2, 1, 5, -0.01F, false));
        this.cube_r9.cubeList.add(new ModelBox(cube_r9, 0, 0, -2.5F, -3.125F, -2.5F, 6, 7, 5, 0.0F, false));

        this.jawdontmove = new AdvancedModelRenderer(this);
        this.jawdontmove.setRotationPoint(0.75F, -3.661F, -6.1932F);
        this.main.addChild(jawdontmove);
        this.setRotateAngle(jawdontmove, -0.3491F, 0.0F, 0.0F);


        this.cube_r10 = new AdvancedModelRenderer(this);
        this.cube_r10.setRotationPoint(-0.25F, 0.1036F, -0.2484F);
        this.jawdontmove.addChild(cube_r10);
        this.setRotateAngle(cube_r10, 0.1362F, 0.4066F, -1.2372F);
        this.cube_r10.cubeList.add(new ModelBox(cube_r10, 0, 0, -0.0394F, -1.9686F, -0.4585F, 0, 2, 1, 0.0F, false));

        this.cube_r11 = new AdvancedModelRenderer(this);
        this.cube_r11.setRotationPoint(-0.25F, 0.1036F, -0.2484F);
        this.jawdontmove.addChild(cube_r11);
        this.setRotateAngle(cube_r11, 0.1362F, -0.4066F, 1.2372F);
        this.cube_r11.cubeList.add(new ModelBox(cube_r11, 0, 2, 0.0394F, -1.9686F, -0.4585F, 0, 2, 1, 0.0F, false));

        this.tail = new AdvancedModelRenderer(this);
        this.tail.setRotationPoint(0.5F, -5.9129F, 4.6598F);
        this.main.addChild(tail);


        this.cube_r12 = new AdvancedModelRenderer(this);
        this.cube_r12.setRotationPoint(0.0F, 4.2764F, 0.2626F);
        this.tail.addChild(cube_r12);
        this.setRotateAngle(cube_r12, 0.1614F, 0.0F, 0.0F);
        this.cube_r12.cubeList.add(new ModelBox(cube_r12, 25, 25, -2.0F, -1.9664F, 0.2805F, 4, 1, 4, -0.01F, false));

        this.cube_r13 = new AdvancedModelRenderer(this);
        this.cube_r13.setRotationPoint(0.0F, -0.5871F, 2.4152F);
        this.tail.addChild(cube_r13);
        this.setRotateAngle(cube_r13, -0.0436F, 0.0F, 0.0F);
        this.cube_r13.cubeList.add(new ModelBox(cube_r13, 0, 12, -2.5F, -2.9F, -2.675F, 5, 6, 5, 0.0F, false));

        this.tail2 = new AdvancedModelRenderer(this);
        this.tail2.setRotationPoint(0.0F, -0.7517F, 4.3887F);
        this.tail.addChild(tail2);
        this.tail2.cubeList.add(new ModelBox(tail2, 0, 23, -2.0F, -1.9605F, -0.3485F, 4, 4, 4, 0.0F, false));

        this.cube_r14 = new AdvancedModelRenderer(this);
        this.cube_r14.setRotationPoint(-0.5F, 3.0395F, 0.1515F);
        this.tail2.addChild(cube_r14);
        this.setRotateAngle(cube_r14, 0.3142F, 0.0F, 0.0F);
        this.cube_r14.cubeList.add(new ModelBox(cube_r14, 0, 31, -1.0F, -1.8604F, -0.5472F, 3, 2, 4, -0.01F, false));

        this.cube_r15 = new AdvancedModelRenderer(this);
        this.cube_r15.setRotationPoint(-0.5F, -2.4605F, 0.4015F);
        this.tail2.addChild(cube_r15);
        this.setRotateAngle(cube_r15, -0.1222F, 0.0F, 0.0F);
        this.cube_r15.cubeList.add(new ModelBox(cube_r15, 37, 22, -0.5F, 0.0F, -0.75F, 2, 1, 4, 0.0F, false));

        this.tail3 = new AdvancedModelRenderer(this);
        this.tail3.setRotationPoint(-0.5F, 0.0395F, 3.1515F);
        this.tail2.addChild(tail3);
        this.tail3.cubeList.add(new ModelBox(tail3, 30, 14, -0.5F, -2.0F, 0.0F, 2, 4, 4, -0.01F, false));
        this.tail3.cubeList.add(new ModelBox(tail3, 26, 36, 0.0F, -2.0F, 3.5F, 1, 4, 4, -0.02F, false));

        this.cube_r16 = new AdvancedModelRenderer(this);
        this.cube_r16.setRotationPoint(0.0F, 0.75F, 2.5F);
        this.tail3.addChild(cube_r16);
        this.setRotateAngle(cube_r16, -0.3054F, 0.0F, 0.0F);
        this.cube_r16.cubeList.add(new ModelBox(cube_r16, 33, 2, 0.0F, -1.275F, 0.25F, 1, 2, 5, 0.0F, false));

        this.cube_r17 = new AdvancedModelRenderer(this);
        this.cube_r17.setRotationPoint(0.0F, -1.5F, 3.75F);
        this.tail3.addChild(cube_r17);
        this.setRotateAngle(cube_r17, 0.3054F, 0.0F, 0.0F);
        this.cube_r17.cubeList.add(new ModelBox(cube_r17, 34, 31, 0.0F, -0.775F, -1.0F, 1, 2, 5, 0.0F, false));

        updateDefaultPose();
    }

    @Override
    public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        this.main.render(f5);
    }
    public void renderStaticWall(float f) {
        this.main.rotateAngleY = (float) Math.toRadians(90);
        this.main.offsetY = -0.20F;
        this.main.offsetX = -0.06F;
        this.main.render(0.01F);
        resetToDefaultPose();
    }
    public void renderStaticFloor(float f) {
        this.setRotateAngle(tail, 0.0F, 0.1F, 0.0F);
        this.setRotateAngle(tail2, 0.0F, -0.3F, 0.0F);
        this.setRotateAngle(tail3, 0.0F, 0.5F, 0.0F);
        this.main.offsetY = -0.05F;
        this.main.render(0.01F);
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
        //this.main.offsetY = 1.05F;

        //this.Tailfin.setScale(1.1F, 1.1F, 1.1F);
        AdvancedModelRenderer[] fishTail = {this.tail, this.tail2, this.tail3};

        float speed = 0.4F;
        float taildegree = 0.35F;

        if (!e.isInWater()) {
            speed = 0.6F;
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
                this.main.offsetY = -0.2F;
                this.main.offsetX = -0.2F;
                this.bob(main, -speed, 5F, false, f2, 1);
            }
        }
    }
}
