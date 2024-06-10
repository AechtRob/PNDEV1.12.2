package net.lepidodendron.entity.model.entity;

import net.ilexiconn.llibrary.client.model.tools.AdvancedModelRenderer;
import net.lepidodendron.entity.model.ModelBasePalaeopedia;
import net.minecraft.block.material.Material;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLiving;
import net.minecraft.util.math.BlockPos;

public class ModelPolybranchiaspis extends ModelBasePalaeopedia {
    private final AdvancedModelRenderer Polybranchiaspis;
    private final AdvancedModelRenderer body;
    private final AdvancedModelRenderer tail2;
    private final AdvancedModelRenderer tail3;
    private final AdvancedModelRenderer tail4;
    private final AdvancedModelRenderer tail5;
    private final AdvancedModelRenderer main;
    private final AdvancedModelRenderer cube_r1;
    private final AdvancedModelRenderer cube_r2;
    private final AdvancedModelRenderer Leftside;
    private final AdvancedModelRenderer cube_r3;
    private final AdvancedModelRenderer cube_r4;
    private final AdvancedModelRenderer cube_r5;
    private final AdvancedModelRenderer cube_r6;
    private final AdvancedModelRenderer cube_r7;
    private final AdvancedModelRenderer cube_r8;
    private final AdvancedModelRenderer Rightside;
    private final AdvancedModelRenderer cube_r9;
    private final AdvancedModelRenderer cube_r10;
    private final AdvancedModelRenderer cube_r11;
    private final AdvancedModelRenderer cube_r12;
    private final AdvancedModelRenderer cube_r13;
    private final AdvancedModelRenderer cube_r14;
    public ModelPolybranchiaspis() {
        this.textureWidth = 64;
        this.textureHeight = 64;

        this.Polybranchiaspis = new AdvancedModelRenderer(this);
        this.Polybranchiaspis.setRotationPoint(0.0F, 24.0F, 0.0F);


        this.body = new AdvancedModelRenderer(this);
        this.body.setRotationPoint(0.0F, -1.1F, 1.7F);
        this.Polybranchiaspis.addChild(body);
        this.body.cubeList.add(new ModelBox(body, 0, 22, -3.0F, -1.0F, 0.25F, 6, 2, 3, -0.02F, false));
        this.body.cubeList.add(new ModelBox(body, 33, 0, -3.0F, 0.0F, -0.65F, 6, 1, 1, -0.02F, false));

        this.tail2 = new AdvancedModelRenderer(this);
        this.tail2.setRotationPoint(0.0F, -0.25F, 3.05F);
        this.body.addChild(tail2);
        this.tail2.cubeList.add(new ModelBox(tail2, 15, 24, -2.0F, -0.75F, -0.3F, 4, 2, 4, -0.001F, false));
        this.tail2.cubeList.add(new ModelBox(tail2, 3, 2, 0.0F, -1.75F, 0.7F, 0, 1, 2, 0.0F, false));

        this.tail3 = new AdvancedModelRenderer(this);
        this.tail3.setRotationPoint(0.0F, 0.5F, 3.8F);
        this.tail2.addChild(tail3);
        this.tail3.cubeList.add(new ModelBox(tail3, 0, 28, -1.5F, -1.25F, -0.4F, 3, 2, 4, 0.0F, false));
        this.tail3.cubeList.add(new ModelBox(tail3, 0, 4, 0.0F, -2.05F, 0.8F, 0, 1, 2, 0.0F, false));

        this.tail4 = new AdvancedModelRenderer(this);
        this.tail4.setRotationPoint(0.0F, -0.25F, 3.7F);
        this.tail3.addChild(tail4);
        this.tail4.cubeList.add(new ModelBox(tail4, 11, 31, -1.0F, -1.0F, -0.6F, 2, 2, 4, -0.001F, false));
        this.tail4.cubeList.add(new ModelBox(tail4, 0, 0, 0.0F, -1.8F, 0.4F, 0, 1, 2, 0.0F, false));

        this.tail5 = new AdvancedModelRenderer(this);
        this.tail5.setRotationPoint(0.0F, -0.05F, 3.4F);
        this.tail4.addChild(tail5);
        this.tail5.cubeList.add(new ModelBox(tail5, 27, 26, 0.0F, -2.0F, 0.0F, 0, 4, 5, 0.0F, false));

        this.main = new AdvancedModelRenderer(this);
        this.main.setRotationPoint(-0.2F, -0.1F, -5.2F);
        this.Polybranchiaspis.addChild(main);
        this.main.cubeList.add(new ModelBox(main, 0, 0, -2.0F, -1.0F, -3.25F, 4, 1, 10, 0.001F, false));

        this.cube_r1 = new AdvancedModelRenderer(this);
        this.cube_r1.setRotationPoint(0.5F, -2.1F, 0.75F);
        this.main.addChild(cube_r1);
        this.setRotateAngle(cube_r1, 0.072F, 0.0F, 0.0054F);
        this.cube_r1.cubeList.add(new ModelBox(cube_r1, 16, 15, -2.5F, 0.0155F, 0.1103F, 4, 1, 7, -0.01F, false));

        this.cube_r2 = new AdvancedModelRenderer(this);
        this.cube_r2.setRotationPoint(0.5F, -2.5F, 0.75F);
        this.main.addChild(cube_r2);
        this.setRotateAngle(cube_r2, 0.2793F, 0.0F, 0.0F);
        this.cube_r2.cubeList.add(new ModelBox(cube_r2, 25, 9, -2.5F, 0.4F, -4.0F, 4, 1, 4, -0.01F, false));

        this.Leftside = new AdvancedModelRenderer(this);
        this.Leftside.setRotationPoint(5.7692F, -0.5F, 5.7825F);
        this.main.addChild(Leftside);
        this.Leftside.cubeList.add(new ModelBox(Leftside, 19, 0, -3.7692F, -0.5F, -6.5325F, 3, 1, 7, 0.002F, false));

        this.cube_r3 = new AdvancedModelRenderer(this);
        this.cube_r3.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.Leftside.addChild(cube_r3);
        this.setRotateAngle(cube_r3, 0.0F, -2.2646F, 0.0F);
        this.cube_r3.cubeList.add(new ModelBox(cube_r3, 33, 24, 0.0287F, -0.5F, -0.1731F, 3, 1, 2, -0.001F, false));

        this.cube_r4 = new AdvancedModelRenderer(this);
        this.cube_r4.setRotationPoint(-0.2F, 0.0F, -2.0F);
        this.Leftside.addChild(cube_r4);
        this.setRotateAngle(cube_r4, 0.0F, -1.7235F, 0.0F);
        this.cube_r4.cubeList.add(new ModelBox(cube_r4, 0, 35, -0.925F, -0.5F, -0.675F, 3, 1, 2, 0.0F, false));

        this.cube_r5 = new AdvancedModelRenderer(this);
        this.cube_r5.setRotationPoint(-0.6629F, -0.5F, -6.4571F);
        this.Leftside.addChild(cube_r5);
        this.setRotateAngle(cube_r5, 0.0F, -1.2654F, 0.0F);
        this.cube_r5.cubeList.add(new ModelBox(cube_r5, 33, 3, -0.11F, 0.0F, -0.1012F, 4, 1, 2, 0.01F, false));

        this.cube_r6 = new AdvancedModelRenderer(this);
        this.cube_r6.setRotationPoint(-3.7692F, -0.5F, -9.0325F);
        this.Leftside.addChild(cube_r6);
        this.setRotateAngle(cube_r6, 0.0F, -0.6501F, 0.0F);
        this.cube_r6.cubeList.add(new ModelBox(cube_r6, 32, 15, 0.0F, 0.0F, 0.0F, 4, 1, 3, -0.001F, false));

        this.cube_r7 = new AdvancedModelRenderer(this);
        this.cube_r7.setRotationPoint(-2.4692F, -0.739F, -6.963F);
        this.Leftside.addChild(cube_r7);
        this.setRotateAngle(cube_r7, 0.2813F, -0.0414F, 0.3203F);
        this.cube_r7.cubeList.add(new ModelBox(cube_r7, 5, 6, -1.3482F, 0.0156F, -0.2715F, 1, 1, 1, 0.0F, false));

        this.cube_r8 = new AdvancedModelRenderer(this);
        this.cube_r8.setRotationPoint(-3.7692F, -0.939F, -6.263F);
        this.Leftside.addChild(cube_r8);
        this.setRotateAngle(cube_r8, 0.059F, -0.0345F, 0.1982F);
        this.cube_r8.cubeList.add(new ModelBox(cube_r8, 0, 12, -0.2815F, -0.1455F, -0.1916F, 3, 1, 8, 0.0F, false));

        this.Rightside = new AdvancedModelRenderer(this);
        this.Rightside.setRotationPoint(-5.7692F, -0.5F, 5.7825F);
        this.main.addChild(Rightside);
        this.Rightside.cubeList.add(new ModelBox(Rightside, 19, 0, 0.7692F, -0.5F, -6.5325F, 3, 1, 7, 0.002F, true));

        this.cube_r9 = new AdvancedModelRenderer(this);
        this.cube_r9.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.Rightside.addChild(cube_r9);
        this.setRotateAngle(cube_r9, 0.0F, 2.2646F, 0.0F);
        this.cube_r9.cubeList.add(new ModelBox(cube_r9, 33, 24, -3.0287F, -0.5F, -0.1731F, 3, 1, 2, -0.001F, true));

        this.cube_r10 = new AdvancedModelRenderer(this);
        this.cube_r10.setRotationPoint(0.2F, 0.0F, -2.0F);
        this.Rightside.addChild(cube_r10);
        this.setRotateAngle(cube_r10, 0.0F, 1.7235F, 0.0F);
        this.cube_r10.cubeList.add(new ModelBox(cube_r10, 0, 35, -2.075F, -0.5F, -0.675F, 3, 1, 2, 0.0F, true));

        this.cube_r11 = new AdvancedModelRenderer(this);
        this.cube_r11.setRotationPoint(0.6629F, -0.5F, -6.4571F);
        this.Rightside.addChild(cube_r11);
        this.setRotateAngle(cube_r11, 0.0F, 1.2654F, 0.0F);
        this.cube_r11.cubeList.add(new ModelBox(cube_r11, 33, 3, -3.89F, 0.0F, -0.1012F, 4, 1, 2, 0.01F, true));

        this.cube_r12 = new AdvancedModelRenderer(this);
        this.cube_r12.setRotationPoint(3.7692F, -0.5F, -9.0325F);
        this.Rightside.addChild(cube_r12);
        this.setRotateAngle(cube_r12, 0.0F, 0.6501F, 0.0F);
        this.cube_r12.cubeList.add(new ModelBox(cube_r12, 32, 15, -4.0F, 0.0F, 0.0F, 4, 1, 3, -0.001F, true));

        this.cube_r13 = new AdvancedModelRenderer(this);
        this.cube_r13.setRotationPoint(2.4692F, -0.739F, -6.963F);
        this.Rightside.addChild(cube_r13);
        this.setRotateAngle(cube_r13, 0.2813F, 0.0414F, -0.3203F);
        this.cube_r13.cubeList.add(new ModelBox(cube_r13, 5, 6, 0.3482F, 0.0156F, -0.2715F, 1, 1, 1, 0.0F, true));

        this.cube_r14 = new AdvancedModelRenderer(this);
        this.cube_r14.setRotationPoint(3.7692F, -0.939F, -6.263F);
        this.Rightside.addChild(cube_r14);
        this.setRotateAngle(cube_r14, 0.059F, 0.0345F, -0.1982F);
        this.cube_r14.cubeList.add(new ModelBox(cube_r14, 0, 12, -2.7185F, -0.1455F, -0.1916F, 3, 1, 8, 0.0F, true));

        updateDefaultPose();
    }

    @Override
    public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        this.Polybranchiaspis.render(f5);
    }
    public void renderStaticWall(float f) {
        this.Polybranchiaspis.rotateAngleX = (float) Math.toRadians(90);
        this.Polybranchiaspis.offsetY = -0.14F;
        this.Polybranchiaspis.offsetX = 0.0F;
        this.Polybranchiaspis.offsetZ = 0.005F;
        this.Polybranchiaspis.render(0.01F);
        resetToDefaultPose();
    }
    public void renderStaticFloor(float f) {
        this.Polybranchiaspis.offsetY = 0.15F;
        this.Polybranchiaspis.render(0.01F);
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
        //this.head.offsetY = 1.05F;

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
                //this.head.offsetY = 1.0F;
                this.bob(Polybranchiaspis, -speed, 2F, false, f2, 1);
                this.chainWave(fishTail, speed, 0.2F, -3, f2, 1);
            }
        }
    }
}
