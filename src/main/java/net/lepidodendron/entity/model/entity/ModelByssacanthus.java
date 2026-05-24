package net.lepidodendron.entity.model.entity;

import net.ilexiconn.llibrary.client.model.tools.AdvancedModelRenderer;
import net.lepidodendron.entity.model.ModelBasePalaeopedia;
import net.minecraft.block.material.Material;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLiving;
import net.minecraft.util.math.BlockPos;

public class ModelByssacanthus extends ModelBasePalaeopedia {
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
    private final AdvancedModelRenderer leftSpike;
    private final AdvancedModelRenderer cube_r10;
    private final AdvancedModelRenderer rightSpike;
    private final AdvancedModelRenderer cube_r11;
    private final AdvancedModelRenderer jaw;
    private final AdvancedModelRenderer cube_r12;
    private final AdvancedModelRenderer tail;
    private final AdvancedModelRenderer cube_r13;
    private final AdvancedModelRenderer cube_r14;
    private final AdvancedModelRenderer cube_r15;
    private final AdvancedModelRenderer tail2;
    private final AdvancedModelRenderer cube_r16;
    private final AdvancedModelRenderer cube_r17;
    private final AdvancedModelRenderer tail3;
    private final AdvancedModelRenderer cube_r18;
    private final AdvancedModelRenderer cube_r19;

    public ModelByssacanthus() {
        this.textureWidth = 48;
        this.textureHeight = 48;

        this.main = new AdvancedModelRenderer(this);
        this.main.setRotationPoint(0.0F, 24.0F, 0.0F);
        this.main.cubeList.add(new ModelBox(main, 15, 17, -2.0F, -4.0F, -1.0F, 4, 4, 3, 0.0F, false));
        this.main.cubeList.add(new ModelBox(main, 0, 0, -2.5F, -4.0F, -5.0F, 5, 4, 4, 0.0F, false));

        this.cube_r1 = new AdvancedModelRenderer(this);
        this.cube_r1.setRotationPoint(-1.0F, 0.0F, -4.0F);
        this.main.addChild(cube_r1);
        this.setRotateAngle(cube_r1, -0.1309F, 0.0F, 0.0F);
        this.cube_r1.cubeList.add(new ModelBox(cube_r1, 32, 7, -1.0F, -2.0F, -3.0F, 4, 2, 2, -0.006F, false));
        this.cube_r1.cubeList.add(new ModelBox(cube_r1, 0, 27, -1.5F, -3.0F, -2.0F, 5, 3, 2, -0.003F, false));

        this.cube_r2 = new AdvancedModelRenderer(this);
        this.cube_r2.setRotationPoint(-1.5F, -1.9986F, -7.7066F);
        this.main.addChild(cube_r2);
        this.setRotateAngle(cube_r2, 1.2915F, 0.0F, 0.0F);
        this.cube_r2.cubeList.add(new ModelBox(cube_r2, 34, 0, -0.5F, 0.0F, -1.0F, 4, 2, 1, 0.0F, false));

        this.cube_r3 = new AdvancedModelRenderer(this);
        this.cube_r3.setRotationPoint(-0.475F, -3.3764F, -6.1375F);
        this.main.addChild(cube_r3);
        this.setRotateAngle(cube_r3, 0.6329F, 0.0777F, -0.1054F);
        this.cube_r3.cubeList.add(new ModelBox(cube_r3, 0, 39, -0.5F, -0.5F, -0.5F, 1, 1, 1, 0.0F, true));

        this.cube_r4 = new AdvancedModelRenderer(this);
        this.cube_r4.setRotationPoint(0.475F, -3.3764F, -6.1375F);
        this.main.addChild(cube_r4);
        this.setRotateAngle(cube_r4, 0.6329F, -0.0777F, 0.1054F);
        this.cube_r4.cubeList.add(new ModelBox(cube_r4, 0, 39, -0.5F, -0.5F, -0.5F, 1, 1, 1, 0.0F, false));

        this.cube_r5 = new AdvancedModelRenderer(this);
        this.cube_r5.setRotationPoint(-1.5F, -3.6166F, -6.531F);
        this.main.addChild(cube_r5);
        this.setRotateAngle(cube_r5, 0.9425F, 0.0F, 0.0F);
        this.cube_r5.cubeList.add(new ModelBox(cube_r5, 30, 24, -0.5F, 0.0F, -2.0F, 4, 2, 2, 0.003F, false));

        this.cube_r6 = new AdvancedModelRenderer(this);
        this.cube_r6.setRotationPoint(-1.5F, -4.6616F, -4.8258F);
        this.main.addChild(cube_r6);
        this.setRotateAngle(cube_r6, 0.5498F, 0.0F, 0.0F);
        this.cube_r6.cubeList.add(new ModelBox(cube_r6, 30, 29, -0.5F, 0.0F, -2.0F, 4, 2, 2, 0.0F, false));

        this.cube_r7 = new AdvancedModelRenderer(this);
        this.cube_r7.setRotationPoint(0.0F, -6.1276F, -1.1041F);
        this.main.addChild(cube_r7);
        this.setRotateAngle(cube_r7, 0.5498F, 0.0F, 0.0F);
        this.cube_r7.cubeList.add(new ModelBox(cube_r7, 26, 34, -0.5F, 0.0F, 0.0F, 1, 1, 3, 0.0F, false));

        this.cube_r8 = new AdvancedModelRenderer(this);
        this.cube_r8.setRotationPoint(-1.5F, -6.1276F, -1.1041F);
        this.main.addChild(cube_r8);
        this.setRotateAngle(cube_r8, 0.3752F, 0.0F, 0.0F);
        this.cube_r8.cubeList.add(new ModelBox(cube_r8, 15, 9, -0.5F, 0.0F, -4.0F, 4, 3, 4, -0.006F, false));

        this.cube_r9 = new AdvancedModelRenderer(this);
        this.cube_r9.setRotationPoint(-1.0F, -6.1276F, -1.1041F);
        this.main.addChild(cube_r9);
        this.setRotateAngle(cube_r9, -0.5411F, 0.0F, 0.0F);
        this.cube_r9.cubeList.add(new ModelBox(cube_r9, 19, 0, -0.5F, 0.0F, 0.0F, 3, 2, 4, 0.006F, false));

        this.leftSpike = new AdvancedModelRenderer(this);
        this.leftSpike.setRotationPoint(2.5F, -0.75F, -5.75F);
        this.main.addChild(leftSpike);
        this.setRotateAngle(leftSpike, 0.0F, -1.0036F, 0.0F);
        this.leftSpike.cubeList.add(new ModelBox(leftSpike, 34, 4, 0.0F, -0.5F, 0.0F, 3, 1, 1, 0.0F, false));
        this.leftSpike.cubeList.add(new ModelBox(leftSpike, 11, 38, 0.0F, -0.95F, 0.0F, 3, 1, 1, -0.003F, false));

        this.cube_r10 = new AdvancedModelRenderer(this);
        this.cube_r10.setRotationPoint(3.0F, -0.25F, 0.0F);
        this.leftSpike.addChild(cube_r10);
        this.setRotateAngle(cube_r10, 0.0F, -0.3054F, 0.0F);
        this.cube_r10.cubeList.add(new ModelBox(cube_r10, 35, 38, 0.0F, -0.5F, 0.0F, 3, 1, 1, 0.0F, false));

        this.rightSpike = new AdvancedModelRenderer(this);
        this.rightSpike.setRotationPoint(-2.5F, -0.75F, -5.75F);
        this.main.addChild(rightSpike);
        this.setRotateAngle(rightSpike, 0.0F, 1.0036F, 0.0F);
        this.rightSpike.cubeList.add(new ModelBox(rightSpike, 34, 4, -3.0F, -0.5F, 0.0F, 3, 1, 1, 0.0F, true));
        this.rightSpike.cubeList.add(new ModelBox(rightSpike, 11, 38, -3.0F, -0.95F, 0.0F, 3, 1, 1, -0.003F, true));

        this.cube_r11 = new AdvancedModelRenderer(this);
        this.cube_r11.setRotationPoint(-3.0F, -0.25F, 0.0F);
        this.rightSpike.addChild(cube_r11);
        this.setRotateAngle(cube_r11, 0.0F, 0.3054F, 0.0F);
        this.cube_r11.cubeList.add(new ModelBox(cube_r11, 35, 38, -3.0F, -0.5F, 0.0F, 3, 1, 1, 0.0F, true));

        this.jaw = new AdvancedModelRenderer(this);
        this.jaw.setRotationPoint(0.0F, -0.9181F, -6.0954F);
        this.main.addChild(jaw);


        this.cube_r12 = new AdvancedModelRenderer(this);
        this.cube_r12.setRotationPoint(-0.5F, -0.0358F, -0.8705F);
        this.jaw.addChild(cube_r12);
        this.setRotateAngle(cube_r12, 1.4224F, 0.0F, 0.0F);
        this.cube_r12.cubeList.add(new ModelBox(cube_r12, 35, 34, -1.0F, -0.925F, -0.525F, 3, 2, 1, 0.0F, false));

        this.tail = new AdvancedModelRenderer(this);
        this.tail.setRotationPoint(0.0F, -2.5525F, 1.4151F);
        this.main.addChild(tail);


        this.cube_r13 = new AdvancedModelRenderer(this);
        this.cube_r13.setRotationPoint(0.0F, 2.5275F, 0.0849F);
        this.tail.addChild(cube_r13);
        this.setRotateAngle(cube_r13, 0.1745F, 0.0F, 0.0F);
        this.cube_r13.cubeList.add(new ModelBox(cube_r13, 15, 25, -1.5F, -2.0F, 0.0F, 3, 2, 4, 0.0F, false));

        this.cube_r14 = new AdvancedModelRenderer(this);
        this.cube_r14.setRotationPoint(0.0F, -1.2962F, 3.894F);
        this.tail.addChild(cube_r14);
        this.setRotateAngle(cube_r14, -0.5672F, 0.0F, 0.0F);
        this.cube_r14.cubeList.add(new ModelBox(cube_r14, 20, 38, 0.0F, -1.0F, -1.0F, 0, 2, 2, 0.0F, false));

        this.cube_r15 = new AdvancedModelRenderer(this);
        this.cube_r15.setRotationPoint(-1.0F, -1.4475F, 0.0849F);
        this.tail.addChild(cube_r15);
        this.setRotateAngle(cube_r15, -0.2182F, 0.0F, 0.0F);
        this.cube_r15.cubeList.add(new ModelBox(cube_r15, 0, 20, -0.5F, -0.25F, 0.0F, 3, 2, 4, 0.003F, false));

        this.tail2 = new AdvancedModelRenderer(this);
        this.tail2.setRotationPoint(0.0F, 0.3832F, 3.4499F);
        this.tail.addChild(tail2);


        this.cube_r16 = new AdvancedModelRenderer(this);
        this.cube_r16.setRotationPoint(-0.5F, 1.159F, 2.912F);
        this.tail2.addChild(cube_r16);
        this.setRotateAngle(cube_r16, 0.1309F, 0.0F, 0.0F);
        this.cube_r16.cubeList.add(new ModelBox(cube_r16, 32, 12, -0.5F, -1.0F, -3.0F, 2, 1, 3, -0.003F, false));

        this.cube_r17 = new AdvancedModelRenderer(this);
        this.cube_r17.setRotationPoint(-0.5F, -1.1307F, -0.115F);
        this.tail2.addChild(cube_r17);
        this.setRotateAngle(cube_r17, -0.1309F, 0.0F, 0.0F);
        this.cube_r17.cubeList.add(new ModelBox(cube_r17, 15, 32, -0.5F, -0.125F, 0.3F, 2, 2, 3, 0.0F, false));

        this.tail3 = new AdvancedModelRenderer(this);
        this.tail3.setRotationPoint(0.0F, -0.4499F, 2.7358F);
        this.tail2.addChild(tail3);


        this.cube_r18 = new AdvancedModelRenderer(this);
        this.cube_r18.setRotationPoint(0.0F, 1.6124F, 0.0722F);
        this.tail3.addChild(cube_r18);
        this.setRotateAngle(cube_r18, 0.4756F, 0.0F, 0.0F);
        this.cube_r18.cubeList.add(new ModelBox(cube_r18, 0, 33, -0.5F, -1.0F, 0.0F, 1, 1, 4, -0.003F, false));

        this.cube_r19 = new AdvancedModelRenderer(this);
        this.cube_r19.setRotationPoint(-0.5F, 0.1191F, -0.1008F);
        this.tail3.addChild(cube_r19);
        this.setRotateAngle(cube_r19, 0.2618F, 0.0F, 0.0F);
        this.cube_r19.cubeList.add(new ModelBox(cube_r19, 0, 9, 0.5F, -0.475F, 0.0F, 0, 3, 7, 0.0F, false));
        this.cube_r19.cubeList.add(new ModelBox(cube_r19, 30, 17, 0.0F, -0.35F, 0.0F, 1, 1, 5, 0.0F, false));

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
