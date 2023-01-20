package net.lepidodendron.entity.model.entity;

import net.ilexiconn.llibrary.client.model.tools.AdvancedModelBase;
import net.ilexiconn.llibrary.client.model.tools.AdvancedModelRenderer;
import net.minecraft.block.material.Material;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLiving;
import net.minecraft.util.math.BlockPos;

public class ModelEugaleaspis extends AdvancedModelBase {
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
    private final AdvancedModelRenderer body;
    private final AdvancedModelRenderer tail2;
    private final AdvancedModelRenderer tail3;
    private final AdvancedModelRenderer tail4;
    private final AdvancedModelRenderer tail5;

    public ModelEugaleaspis() {
        this.textureWidth = 32;
        this.textureHeight = 32;

        this.main = new AdvancedModelRenderer(this);
        this.main.setRotationPoint(-0.5F, 23.9F, 4.0F);
        this.main.cubeList.add(new ModelBox(main, 0, 0, -1.0F, -1.0F, -12.25F, 3, 1, 6, 0.0F, false));

        this.cube_r1 = new AdvancedModelRenderer(this);
        this.cube_r1.setRotationPoint(5.5692F, -0.5F, -5.2175F);
        this.main.addChild(cube_r1);
        this.setRotateAngle(cube_r1, 0.0F, -1.7235F, 0.0F);
        this.cube_r1.cubeList.add(new ModelBox(cube_r1, 0, 0, -0.925F, -0.5F, -0.675F, 1, 1, 2, 0.0F, true));

        this.cube_r2 = new AdvancedModelRenderer(this);
        this.cube_r2.setRotationPoint(-4.5692F, -0.5F, -5.2175F);
        this.main.addChild(cube_r2);
        this.setRotateAngle(cube_r2, 0.0F, 1.7235F, 0.0F);
        this.cube_r2.cubeList.add(new ModelBox(cube_r2, 0, 0, -0.075F, -0.5F, -0.675F, 1, 1, 2, 0.0F, false));

        this.cube_r3 = new AdvancedModelRenderer(this);
        this.cube_r3.setRotationPoint(5.1063F, -1.0F, -9.6746F);
        this.main.addChild(cube_r3);
        this.setRotateAngle(cube_r3, 0.0F, -1.2654F, 0.0F);
        this.cube_r3.cubeList.add(new ModelBox(cube_r3, 18, 11, -0.11F, 0.0F, -0.1012F, 4, 1, 2, 0.01F, true));

        this.cube_r4 = new AdvancedModelRenderer(this);
        this.cube_r4.setRotationPoint(-4.1063F, -1.0F, -9.6746F);
        this.main.addChild(cube_r4);
        this.setRotateAngle(cube_r4, 0.0F, 1.2654F, 0.0F);
        this.cube_r4.cubeList.add(new ModelBox(cube_r4, 18, 11, -3.89F, 0.0F, -0.1012F, 4, 1, 2, 0.01F, false));

        this.cube_r5 = new AdvancedModelRenderer(this);
        this.cube_r5.setRotationPoint(4.1619F, -0.5F, -7.0414F);
        this.main.addChild(cube_r5);
        this.setRotateAngle(cube_r5, 0.0F, -0.5934F, 0.0F);
        this.cube_r5.cubeList.add(new ModelBox(cube_r5, 18, 21, -0.925F, -0.5F, -0.65F, 2, 1, 2, 0.002F, true));

        this.cube_r6 = new AdvancedModelRenderer(this);
        this.cube_r6.setRotationPoint(-3.1619F, -0.5F, -7.0414F);
        this.main.addChild(cube_r6);
        this.setRotateAngle(cube_r6, 0.0F, 0.5934F, 0.0F);
        this.cube_r6.cubeList.add(new ModelBox(cube_r6, 18, 21, -1.075F, -0.5F, -0.65F, 2, 1, 2, 0.002F, false));

        this.cube_r7 = new AdvancedModelRenderer(this);
        this.cube_r7.setRotationPoint(2.6675F, -0.5F, -7.3455F);
        this.main.addChild(cube_r7);
        this.setRotateAngle(cube_r7, 0.0F, -0.2007F, 0.0F);
        this.cube_r7.cubeList.add(new ModelBox(cube_r7, 0, 23, -1.3F, -0.5F, -1.0F, 2, 1, 2, 0.001F, true));

        this.cube_r8 = new AdvancedModelRenderer(this);
        this.cube_r8.setRotationPoint(-1.6675F, -0.5F, -7.3455F);
        this.main.addChild(cube_r8);
        this.setRotateAngle(cube_r8, 0.0F, 0.2007F, 0.0F);
        this.cube_r8.cubeList.add(new ModelBox(cube_r8, 0, 23, -0.7F, -0.5F, -1.0F, 2, 1, 2, 0.001F, false));

        this.cube_r9 = new AdvancedModelRenderer(this);
        this.cube_r9.setRotationPoint(2.0F, -1.0F, -12.25F);
        this.main.addChild(cube_r9);
        this.setRotateAngle(cube_r9, 0.0F, -0.6501F, 0.0F);
        this.cube_r9.cubeList.add(new ModelBox(cube_r9, 12, 7, 0.0F, 0.0F, 0.0F, 4, 1, 3, -0.001F, true));

        this.cube_r10 = new AdvancedModelRenderer(this);
        this.cube_r10.setRotationPoint(-1.0F, -1.0F, -12.25F);
        this.main.addChild(cube_r10);
        this.setRotateAngle(cube_r10, 0.0F, 0.6501F, 0.0F);
        this.cube_r10.cubeList.add(new ModelBox(cube_r10, 12, 7, -4.0F, 0.0F, 0.0F, 4, 1, 3, -0.001F, false));

        this.cube_r11 = new AdvancedModelRenderer(this);
        this.cube_r11.setRotationPoint(2.0F, -2.439F, -8.6805F);
        this.main.addChild(cube_r11);
        this.setRotateAngle(cube_r11, 0.1242F, -0.0414F, 0.3203F);
        this.cube_r11.cubeList.add(new ModelBox(cube_r11, 0, 9, 0.5F, 0.6457F, -1.6153F, 1, 1, 1, 0.0F, true));
        this.cube_r11.cubeList.add(new ModelBox(cube_r11, 10, 19, 0.0F, 0.6957F, -1.1153F, 2, 1, 3, 0.0F, true));

        this.cube_r12 = new AdvancedModelRenderer(this);
        this.cube_r12.setRotationPoint(-1.0F, -2.439F, -8.6805F);
        this.main.addChild(cube_r12);
        this.setRotateAngle(cube_r12, 0.1242F, 0.0414F, -0.3203F);
        this.cube_r12.cubeList.add(new ModelBox(cube_r12, 0, 9, -1.5F, 0.6457F, -1.6153F, 1, 1, 1, 0.0F, false));
        this.cube_r12.cubeList.add(new ModelBox(cube_r12, 10, 19, -2.0F, 0.6957F, -1.1153F, 2, 1, 3, 0.0F, false));

        this.cube_r13 = new AdvancedModelRenderer(this);
        this.cube_r13.setRotationPoint(0.5F, -2.5F, -8.25F);
        this.main.addChild(cube_r13);
        this.setRotateAngle(cube_r13, 0.2793F, 0.0F, 0.0F);
        this.cube_r13.cubeList.add(new ModelBox(cube_r13, 0, 7, -1.5F, 0.4F, -4.0F, 3, 1, 6, -0.01F, false));

        this.body = new AdvancedModelRenderer(this);
        this.body.setRotationPoint(0.5F, 0.0F, -7.0F);
        this.main.addChild(body);
        this.body.cubeList.add(new ModelBox(body, 12, 0, -2.0F, -2.0F, 0.25F, 4, 2, 3, -0.02F, false));

        this.tail2 = new AdvancedModelRenderer(this);
        this.tail2.setRotationPoint(0.0F, -0.75F, 3.25F);
        this.body.addChild(tail2);
        this.tail2.cubeList.add(new ModelBox(tail2, 10, 14, -1.5F, -1.25F, 0.0F, 3, 2, 3, 0.0F, false));
        this.tail2.cubeList.add(new ModelBox(tail2, 0, 0, 0.0F, -3.25F, 0.5F, 0, 2, 3, 0.0F, false));

        this.tail3 = new AdvancedModelRenderer(this);
        this.tail3.setRotationPoint(0.0F, 0.0F, 3.0F);
        this.tail2.addChild(tail3);
        this.tail3.cubeList.add(new ModelBox(tail3, 0, 18, -1.0F, -1.25F, 0.0F, 2, 2, 3, 0.0F, false));
        this.tail3.cubeList.add(new ModelBox(tail3, 0, 4, 0.0F, -3.25F, 1.5F, 0, 2, 3, 0.0F, false));

        this.tail4 = new AdvancedModelRenderer(this);
        this.tail4.setRotationPoint(0.0F, -0.25F, 3.0F);
        this.tail3.addChild(tail4);
        this.tail4.cubeList.add(new ModelBox(tail4, 19, 16, -0.5F, -1.0F, 0.0F, 1, 2, 3, 0.0F, false));

        this.tail5 = new AdvancedModelRenderer(this);
        this.tail5.setRotationPoint(0.0F, -0.05F, 3.0F);
        this.tail4.addChild(tail5);
        this.tail5.cubeList.add(new ModelBox(tail5, 0, 9, 0.0F, -2.0F, 0.0F, 0, 4, 5, 0.0F, false));

        updateDefaultPose();
    }

    @Override
    public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        this.main.render(f5 );
    }
    public void renderStaticWall(float f) {
        this.main.rotateAngleX = (float) Math.toRadians(90);
        this.main.rotateAngleZ = (float) Math.toRadians(90);
        this.main.offsetX = 0.02F;
        this.main.offsetY = -0.24F;
        this.main.offsetZ = 0.051F;
        this.main.render(0.01F);
        resetToDefaultPose();
    }
    public void renderStaticFloor(float f) {
        //this.main.rotateAngleY = (float) Math.toRadians(90);
        this.setRotateAngle(main, -0.8683F, -0.2615F, 0.2964F);
        this.setRotateAngle(cube_r1, 0.0F, -1.7235F, 0.0F);
        this.setRotateAngle(cube_r2, 0.0F, 1.7235F, 0.0F);
        this.setRotateAngle(cube_r3, 0.0F, -1.2654F, 0.0F);
        this.setRotateAngle(cube_r4, 0.0F, 1.2654F, 0.0F);
        this.setRotateAngle(cube_r5, 0.0F, -0.5934F, 0.0F);
        this.setRotateAngle(cube_r6, 0.0F, 0.5934F, 0.0F);
        this.setRotateAngle(cube_r7, 0.0F, -0.2007F, 0.0F);
        this.setRotateAngle(cube_r8, 0.0F, 0.2007F, 0.0F);
        this.setRotateAngle(cube_r9, 0.0F, -0.6501F, 0.0F);
        this.setRotateAngle(cube_r10, 0.0F, 0.6501F, 0.0F);
        this.setRotateAngle(cube_r11, 0.1242F, -0.0414F, 0.3203F);
        this.setRotateAngle(cube_r12, 0.1242F, 0.0414F, -0.3203F);
        this.setRotateAngle(cube_r13, 0.2793F, 0.0F, 0.0F);
        this.setRotateAngle(tail2, 0.0443F, 0.1744F, 0.0077F);
        this.setRotateAngle(tail3, 0.1787F, 0.2148F, 0.0385F);
        this.setRotateAngle(tail4, 0.1787F, 0.2148F, 0.0385F);
        this.setRotateAngle(tail5, 0.2778F, 0.3367F, 0.0939F);
        this.main.offsetY = -0.029F;
        this.main.offsetX = -0.028F;
        this.main.offsetZ = -0.01F;
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
        this.main.offsetY = 0;

        //this.Tailfin.setScale(1.1F, 1.1F, 1.1F);
        AdvancedModelRenderer[] fishTail = {this.body, this.tail2, this.tail3, this.tail4, this.tail5};

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
            this.swing(body, speed, 0.3F, true, 0, 0, f2, 1);
            if (!e.isInWater()) {
                //this.Bodyfront.rotateAngleZ = (float) Math.toRadians(90);
                this.main.offsetY = 0F;
                this.bob(main, -speed, 2F, false, f2, 1);
                this.chainWave(fishTail, speed, 0.2F, -3, f2, 1);
            }
        }
    }
}
