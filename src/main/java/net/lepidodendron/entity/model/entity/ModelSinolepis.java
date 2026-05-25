package net.lepidodendron.entity.model.entity;

import net.ilexiconn.llibrary.client.model.tools.AdvancedModelRenderer;
import net.lepidodendron.entity.model.ModelBasePalaeopedia;
import net.minecraft.block.material.Material;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLiving;
import net.minecraft.util.math.BlockPos;

public class ModelSinolepis extends ModelBasePalaeopedia {
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
    private final AdvancedModelRenderer tail1;
    private final AdvancedModelRenderer cube_r10;
    private final AdvancedModelRenderer tail2;
    private final AdvancedModelRenderer tail3;
    private final AdvancedModelRenderer cube_r11;
    private final AdvancedModelRenderer cube_r12;
    private final AdvancedModelRenderer leftFin;
    private final AdvancedModelRenderer cube_r13;
    private final AdvancedModelRenderer cube_r14;
    private final AdvancedModelRenderer cube_r15;
    private final AdvancedModelRenderer cube_r16;
    private final AdvancedModelRenderer jaw;
    private final AdvancedModelRenderer cube_r17;
    private final AdvancedModelRenderer rightFin4;
    private final AdvancedModelRenderer cube_r18;
    private final AdvancedModelRenderer cube_r19;
    private final AdvancedModelRenderer cube_r20;
    private final AdvancedModelRenderer cube_r21;

    public ModelSinolepis() {
        this.textureWidth = 42;
        this.textureHeight = 42;

        this.main = new AdvancedModelRenderer(this);
        this.main.setRotationPoint(0.0F, 24.325F, -4.875F);
        this.main.cubeList.add(new ModelBox(main, 0, 0, -3.0F, -2.325F, -0.325F, 6, 2, 6, 0.0F, false));
        this.main.cubeList.add(new ModelBox(main, 12, 24, -2.0F, -1.325F, -2.25F, 4, 1, 2, 0.0F, false));
        this.main.cubeList.add(new ModelBox(main, 27, 30, -1.5F, -1.375F, -4.125F, 3, 1, 2, 0.001F, false));

        this.cube_r1 = new AdvancedModelRenderer(this);
        this.cube_r1.setRotationPoint(-3.0F, -0.45F, -0.325F);
        this.main.addChild(cube_r1);
        this.setRotateAngle(cube_r1, 0.0F, -0.4014F, 0.0F);
        this.cube_r1.cubeList.add(new ModelBox(cube_r1, 24, 19, 0.0F, -1.0F, -4.0F, 1, 1, 4, -0.001F, true));

        this.cube_r2 = new AdvancedModelRenderer(this);
        this.cube_r2.setRotationPoint(0.05F, -1.925F, -1.75F);
        this.main.addChild(cube_r2);
        this.setRotateAngle(cube_r2, 0.4349F, -0.0424F, -0.2846F);
        this.cube_r2.cubeList.add(new ModelBox(cube_r2, 24, 6, -1.0F, -1.0F, -1.0F, 1, 1, 1, 0.0F, true));

        this.cube_r3 = new AdvancedModelRenderer(this);
        this.cube_r3.setRotationPoint(0.0F, -2.4F, -2.45F);
        this.main.addChild(cube_r3);
        this.setRotateAngle(cube_r3, 0.2313F, 0.0F, 0.0F);
        this.cube_r3.cubeList.add(new ModelBox(cube_r3, 0, 24, -2.0F, 0.0F, 0.0F, 4, 2, 2, -0.01F, false));

        this.cube_r4 = new AdvancedModelRenderer(this);
        this.cube_r4.setRotationPoint(0.0F, -1.375F, -4.125F);
        this.main.addChild(cube_r4);
        this.setRotateAngle(cube_r4, 0.5323F, 0.0F, 0.0F);
        this.cube_r4.cubeList.add(new ModelBox(cube_r4, 24, 24, -1.5F, 0.0F, 0.0F, 3, 1, 2, 0.0F, false));

        this.cube_r5 = new AdvancedModelRenderer(this);
        this.cube_r5.setRotationPoint(3.0F, -0.45F, -0.325F);
        this.main.addChild(cube_r5);
        this.setRotateAngle(cube_r5, 0.0F, 0.4014F, 0.0F);
        this.cube_r5.cubeList.add(new ModelBox(cube_r5, 24, 19, -1.0F, -1.0F, -4.0F, 1, 1, 4, -0.001F, false));

        this.cube_r6 = new AdvancedModelRenderer(this);
        this.cube_r6.setRotationPoint(-0.5F, -0.375F, -3.725F);
        this.main.addChild(cube_r6);
        this.setRotateAngle(cube_r6, -0.1178F, 0.0F, 0.0F);
        this.cube_r6.cubeList.add(new ModelBox(cube_r6, 30, 11, -1.0F, -1.025F, 0.0F, 3, 1, 1, 0.01F, false));

        this.cube_r7 = new AdvancedModelRenderer(this);
        this.cube_r7.setRotationPoint(0.0F, -3.3612F, 2.3045F);
        this.main.addChild(cube_r7);
        this.setRotateAngle(cube_r7, -0.0611F, 0.0F, 0.0F);
        this.cube_r7.cubeList.add(new ModelBox(cube_r7, 14, 8, -2.0F, 0.0F, 0.0F, 4, 2, 4, 0.01F, false));

        this.cube_r8 = new AdvancedModelRenderer(this);
        this.cube_r8.setRotationPoint(0.0F, -2.8274F, -0.6476F);
        this.main.addChild(cube_r8);
        this.setRotateAngle(cube_r8, 0.1789F, 0.0F, 0.0F);
        this.cube_r8.cubeList.add(new ModelBox(cube_r8, 14, 14, -2.0F, 0.0F, 0.0F, 4, 2, 3, 0.0F, false));

        this.cube_r9 = new AdvancedModelRenderer(this);
        this.cube_r9.setRotationPoint(-0.05F, -1.925F, -1.75F);
        this.main.addChild(cube_r9);
        this.setRotateAngle(cube_r9, 0.4349F, 0.0424F, 0.2846F);
        this.cube_r9.cubeList.add(new ModelBox(cube_r9, 24, 6, 0.0F, -1.0F, -1.0F, 1, 1, 1, 0.0F, false));

        this.tail1 = new AdvancedModelRenderer(this);
        this.tail1.setRotationPoint(0.0F, -1.575F, 6.125F);
        this.main.addChild(tail1);
        this.tail1.cubeList.add(new ModelBox(tail1, 12, 19, -1.5F, -0.975F, -1.0F, 3, 2, 3, 0.0F, false));

        this.cube_r10 = new AdvancedModelRenderer(this);
        this.cube_r10.setRotationPoint(0.0F, -1.0F, 2.0F);
        this.tail1.addChild(cube_r10);
        this.setRotateAngle(cube_r10, -0.2007F, 0.0F, 0.0F);
        this.cube_r10.cubeList.add(new ModelBox(cube_r10, 28, 27, -1.0F, 0.0F, -2.0F, 2, 1, 2, 0.0F, false));

        this.tail2 = new AdvancedModelRenderer(this);
        this.tail2.setRotationPoint(0.0F, 0.025F, 2.0F);
        this.tail1.addChild(tail2);
        this.tail2.cubeList.add(new ModelBox(tail2, 0, 18, -1.0F, -1.0F, -0.25F, 2, 2, 4, -0.001F, false));
        this.tail2.cubeList.add(new ModelBox(tail2, 30, 6, 0.0F, -3.0F, 0.0F, 0, 2, 3, 0.0F, false));

        this.tail3 = new AdvancedModelRenderer(this);
        this.tail3.setRotationPoint(0.0F, 0.0F, 3.725F);
        this.tail2.addChild(tail3);
        this.tail3.cubeList.add(new ModelBox(tail3, 24, 0, -0.5F, -1.0F, -0.125F, 1, 2, 4, -0.003F, false));

        this.cube_r11 = new AdvancedModelRenderer(this);
        this.cube_r11.setRotationPoint(0.0F, 2.2F, 3.975F);
        this.tail3.addChild(cube_r11);
        this.setRotateAngle(cube_r11, 0.3054F, 0.0F, 0.0F);
        this.cube_r11.cubeList.add(new ModelBox(cube_r11, 0, 8, 0.0F, -3.0F, 0.0F, 0, 3, 7, 0.0F, false));

        this.cube_r12 = new AdvancedModelRenderer(this);
        this.cube_r12.setRotationPoint(0.0F, -0.025F, 3.825F);
        this.tail3.addChild(cube_r12);
        this.setRotateAngle(cube_r12, 0.2618F, 0.0F, 0.0F);
        this.cube_r12.cubeList.add(new ModelBox(cube_r12, 0, 28, -0.5F, -1.0F, 0.0F, 1, 1, 3, -0.01F, false));

        this.leftFin = new AdvancedModelRenderer(this);
        this.leftFin.setRotationPoint(2.975F, 0.0F, 0.0F);
        this.main.addChild(leftFin);


        this.cube_r13 = new AdvancedModelRenderer(this);
        this.cube_r13.setRotationPoint(0.2818F, -0.5F, 4.4158F);
        this.leftFin.addChild(cube_r13);
        this.setRotateAngle(cube_r13, 0.0F, 0.1309F, 0.0F);
        this.cube_r13.cubeList.add(new ModelBox(cube_r13, 20, 27, 0.0F, -1.0F, -3.0F, 1, 1, 3, -0.001F, false));

        this.cube_r14 = new AdvancedModelRenderer(this);
        this.cube_r14.setRotationPoint(0.075F, -0.5F, 5.1F);
        this.leftFin.addChild(cube_r14);
        this.setRotateAngle(cube_r14, 0.0F, -0.2182F, 0.0F);
        this.cube_r14.cubeList.add(new ModelBox(cube_r14, 28, 14, 0.0F, -1.0F, -1.0F, 1, 1, 3, -0.01F, false));

        this.cube_r15 = new AdvancedModelRenderer(this);
        this.cube_r15.setRotationPoint(1.15F, -0.5F, 1.375F);
        this.leftFin.addChild(cube_r15);
        this.setRotateAngle(cube_r15, 0.0F, 0.0436F, 0.0F);
        this.cube_r15.cubeList.add(new ModelBox(cube_r15, 12, 27, -1.0F, -1.0F, 0.0F, 1, 1, 3, 0.001F, false));

        this.cube_r16 = new AdvancedModelRenderer(this);
        this.cube_r16.setRotationPoint(0.0F, -0.5F, -0.25F);
        this.leftFin.addChild(cube_r16);
        this.setRotateAngle(cube_r16, 0.0F, 0.6109F, 0.0F);
        this.cube_r16.cubeList.add(new ModelBox(cube_r16, 16, 31, -1.0F, -1.0F, 0.0F, 1, 1, 2, 0.0F, false));

        this.jaw = new AdvancedModelRenderer(this);
        this.jaw.setRotationPoint(0.0F, -1.825F, -2.05F);
        this.main.addChild(jaw);


        this.cube_r17 = new AdvancedModelRenderer(this);
        this.cube_r17.setRotationPoint(0.0F, 1.175F, -0.475F);
        this.jaw.addChild(cube_r17);
        this.setRotateAngle(cube_r17, 0.1745F, 0.0F, 0.0F);
        this.cube_r17.cubeList.add(new ModelBox(cube_r17, 8, 31, -1.5F, -0.6F, -0.2F, 3, 1, 1, -0.01F, false));

        this.rightFin4 = new AdvancedModelRenderer(this);
        this.rightFin4.setRotationPoint(-2.975F, 0.0F, 0.0F);
        this.main.addChild(rightFin4);


        this.cube_r18 = new AdvancedModelRenderer(this);
        this.cube_r18.setRotationPoint(-0.2818F, -0.5F, 4.4158F);
        this.rightFin4.addChild(cube_r18);
        this.setRotateAngle(cube_r18, 0.0F, -0.1309F, 0.0F);
        this.cube_r18.cubeList.add(new ModelBox(cube_r18, 20, 27, -1.0F, -1.0F, -3.0F, 1, 1, 3, -0.001F, true));

        this.cube_r19 = new AdvancedModelRenderer(this);
        this.cube_r19.setRotationPoint(-1.15F, -0.5F, 1.375F);
        this.rightFin4.addChild(cube_r19);
        this.setRotateAngle(cube_r19, 0.0F, -0.0436F, 0.0F);
        this.cube_r19.cubeList.add(new ModelBox(cube_r19, 12, 27, 0.0F, -1.0F, 0.0F, 1, 1, 3, 0.0F, true));

        this.cube_r20 = new AdvancedModelRenderer(this);
        this.cube_r20.setRotationPoint(-0.075F, -0.5F, 5.1F);
        this.rightFin4.addChild(cube_r20);
        this.setRotateAngle(cube_r20, 0.0F, 0.2182F, 0.0F);
        this.cube_r20.cubeList.add(new ModelBox(cube_r20, 28, 14, -1.0F, -1.0F, -1.0F, 1, 1, 3, -0.01F, true));

        this.cube_r21 = new AdvancedModelRenderer(this);
        this.cube_r21.setRotationPoint(0.0F, -0.5F, -0.25F);
        this.rightFin4.addChild(cube_r21);
        this.setRotateAngle(cube_r21, 0.0F, -0.6109F, 0.0F);
        this.cube_r21.cubeList.add(new ModelBox(cube_r21, 16, 31, 0.0F, -1.0F, 0.0F, 1, 1, 2, 0.001F, true));

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
                //this.mainfront.rotateAngleZ = (float) Math.toRadians(90);
                this.main.offsetY = 0.01F;
                this.bob(main, -speed, 2F, false, f2, 1);
                this.chainWave(fishTail, speed, 0.2F, -3, f2, 1);
            }
        }
    }
}
