package net.lepidodendron.entity.model.entity;

import net.ilexiconn.llibrary.client.model.tools.AdvancedModelRenderer;
import net.lepidodendron.entity.model.ModelBasePalaeopedia;
import net.minecraft.block.material.Material;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLiving;
import net.minecraft.util.math.BlockPos;

public class ModelNeeyambaspis extends ModelBasePalaeopedia {
    private final AdvancedModelRenderer main;
    private final AdvancedModelRenderer cube_r1;
    private final AdvancedModelRenderer cube_r2;
    private final AdvancedModelRenderer cube_r3;
    private final AdvancedModelRenderer cube_r4;
    private final AdvancedModelRenderer cube_r5;
    private final AdvancedModelRenderer cube_r6;
    private final AdvancedModelRenderer cube_r7;
    private final AdvancedModelRenderer frontleftfin;
    private final AdvancedModelRenderer cube_r8;
    private final AdvancedModelRenderer frontrightfin;
    private final AdvancedModelRenderer cube_r9;
    private final AdvancedModelRenderer spike;
    private final AdvancedModelRenderer cube_r10;
    private final AdvancedModelRenderer cube_r11;
    private final AdvancedModelRenderer cube_r12;
    private final AdvancedModelRenderer cube_r13;
    private final AdvancedModelRenderer spike2;
    private final AdvancedModelRenderer cube_r14;
    private final AdvancedModelRenderer cube_r15;
    private final AdvancedModelRenderer cube_r16;
    private final AdvancedModelRenderer cube_r17;
    private final AdvancedModelRenderer body;
    private final AdvancedModelRenderer cube_r18;
    private final AdvancedModelRenderer body2;
    private final AdvancedModelRenderer cube_r19;
    private final AdvancedModelRenderer tail;
    private final AdvancedModelRenderer cube_r20;
    private final AdvancedModelRenderer tail2;

    public ModelNeeyambaspis() {
        this.textureWidth = 64;
        this.textureHeight = 64;

        this.main = new AdvancedModelRenderer(this);
        this.main.setRotationPoint(3.5F, 24.0F, 0.0F);
        this.main.cubeList.add(new ModelBox(main, 0, 13, -6.0F, -2.0F, -4.0F, 5, 2, 3, 0.001F, false));
        this.main.cubeList.add(new ModelBox(main, 30, 19, -4.5F, -2.0F, -5.0F, 2, 2, 1, 0.0F, false));
        this.main.cubeList.add(new ModelBox(main, 0, 24, -4.0F, -1.5F, -10.0F, 1, 1, 5, 0.0F, false));
        this.main.cubeList.add(new ModelBox(main, 0, 0, -6.0F, -3.0F, -1.0F, 5, 3, 5, 0.0F, false));
        this.main.cubeList.add(new ModelBox(main, 0, 18, -5.5F, -3.0F, 4.0F, 4, 3, 3, 0.0F, false));
        this.main.cubeList.add(new ModelBox(main, 10, 21, -5.0F, -3.1943F, 0.6537F, 3, 1, 4, 0.0F, false));

        this.cube_r1 = new AdvancedModelRenderer(this);
        this.cube_r1.setRotationPoint(-3.5F, -3.1943F, 0.6537F);
        this.main.addChild(cube_r1);
        this.setRotateAngle(cube_r1, 0.2051F, 0.0F, 0.0F);
        this.cube_r1.cubeList.add(new ModelBox(cube_r1, 0, 30, -1.5F, 0.0F, -1.0F, 3, 1, 1, 0.0F, false));

        this.cube_r2 = new AdvancedModelRenderer(this);
        this.cube_r2.setRotationPoint(-3.5F, -2.75F, 6.75F);
        this.main.addChild(cube_r2);
        this.setRotateAngle(cube_r2, 0.0829F, 0.0F, 0.0F);
        this.cube_r2.cubeList.add(new ModelBox(cube_r2, 14, 27, -0.5F, -0.625F, -2.1F, 1, 1, 4, -0.01F, false));

        this.cube_r3 = new AdvancedModelRenderer(this);
        this.cube_r3.setRotationPoint(-3.5F, -3.0F, -1.0F);
        this.main.addChild(cube_r3);
        this.setRotateAngle(cube_r3, 0.2182F, 0.0F, 0.0F);
        this.cube_r3.cubeList.add(new ModelBox(cube_r3, 0, 8, -2.0F, 0.25F, -3.45F, 4, 1, 4, 0.0F, false));

        this.cube_r4 = new AdvancedModelRenderer(this);
        this.cube_r4.setRotationPoint(-2.5F, -1.0F, -7.0F);
        this.main.addChild(cube_r4);
        this.setRotateAngle(cube_r4, 0.0F, 0.1396F, 0.0F);
        this.cube_r4.cubeList.add(new ModelBox(cube_r4, 26, 7, -1.225F, -0.5F, -1.9F, 1, 1, 4, -0.01F, true));

        this.cube_r5 = new AdvancedModelRenderer(this);
        this.cube_r5.setRotationPoint(-4.5F, -1.0F, -7.0F);
        this.main.addChild(cube_r5);
        this.setRotateAngle(cube_r5, 0.0F, -0.1396F, 0.0F);
        this.cube_r5.cubeList.add(new ModelBox(cube_r5, 26, 7, 0.225F, -0.5F, -1.9F, 1, 1, 4, -0.01F, false));

        this.cube_r6 = new AdvancedModelRenderer(this);
        this.cube_r6.setRotationPoint(-1.5F, -1.0F, -4.5F);
        this.main.addChild(cube_r6);
        this.setRotateAngle(cube_r6, 0.0F, -0.6458F, 0.0F);
        this.cube_r6.cubeList.add(new ModelBox(cube_r6, 27, 12, -2.3F, -1.0F, 0.05F, 3, 2, 1, -0.001F, false));

        this.cube_r7 = new AdvancedModelRenderer(this);
        this.cube_r7.setRotationPoint(-5.5F, -1.0F, -4.5F);
        this.main.addChild(cube_r7);
        this.setRotateAngle(cube_r7, 0.0F, 0.6458F, 0.0F);
        this.cube_r7.cubeList.add(new ModelBox(cube_r7, 28, 24, -0.7F, -1.0F, 0.05F, 3, 2, 1, -0.01F, false));

        this.frontleftfin = new AdvancedModelRenderer(this);
        this.frontleftfin.setRotationPoint(-0.9673F, -0.075F, 1.1734F);
        this.main.addChild(frontleftfin);


        this.cube_r8 = new AdvancedModelRenderer(this);
        this.cube_r8.setRotationPoint(-0.0327F, 0.075F, -1.1734F);
        this.frontleftfin.addChild(cube_r8);
        this.setRotateAngle(cube_r8, 0.0F, -0.829F, 0.0F);
        this.cube_r8.cubeList.add(new ModelBox(cube_r8, 12, 0, -1.275F, -0.075F, -1.1F, 5, 0, 3, 0.0F, false));

        this.frontrightfin = new AdvancedModelRenderer(this);
        this.frontrightfin.setRotationPoint(-6.0327F, -0.075F, 1.1734F);
        this.main.addChild(frontrightfin);


        this.cube_r9 = new AdvancedModelRenderer(this);
        this.cube_r9.setRotationPoint(0.0327F, 0.075F, -1.1734F);
        this.frontrightfin.addChild(cube_r9);
        this.setRotateAngle(cube_r9, 0.0F, 0.829F, 0.0F);
        this.cube_r9.cubeList.add(new ModelBox(cube_r9, 12, 0, -3.725F, -0.075F, -1.1F, 5, 0, 3, 0.0F, true));

        this.spike = new AdvancedModelRenderer(this);
        this.spike.setRotationPoint(-5.9F, -1.0F, -4.0F);
        this.main.addChild(spike);
        this.setRotateAngle(spike, 0.0F, 0.4637F, 0.0F);


        this.cube_r10 = new AdvancedModelRenderer(this);
        this.cube_r10.setRotationPoint(-2.4472F, 0.0F, 4.5367F);
        this.spike.addChild(cube_r10);
        this.setRotateAngle(cube_r10, 0.0F, -0.384F, 0.0F);
        this.cube_r10.cubeList.add(new ModelBox(cube_r10, 23, 1, -0.675F, -0.5F, -1.825F, 1, 1, 2, -0.003F, false));

        this.cube_r11 = new AdvancedModelRenderer(this);
        this.cube_r11.setRotationPoint(-3.0829F, 0.0F, 3.917F);
        this.spike.addChild(cube_r11);
        this.setRotateAngle(cube_r11, 0.0F, -0.9425F, 0.0F);
        this.cube_r11.cubeList.add(new ModelBox(cube_r11, 30, 16, -0.625F, -0.5F, -1.65F, 1, 1, 2, -0.002F, false));

        this.cube_r12 = new AdvancedModelRenderer(this);
        this.cube_r12.setRotationPoint(-2.1429F, 0.0F, 2.101F);
        this.spike.addChild(cube_r12);
        this.setRotateAngle(cube_r12, 0.0F, 0.3185F, 0.0F);
        this.cube_r12.cubeList.add(new ModelBox(cube_r12, 20, 29, -1.9987F, -0.5F, -0.045F, 3, 1, 1, -0.001F, false));

        this.cube_r13 = new AdvancedModelRenderer(this);
        this.cube_r13.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.spike.addChild(cube_r13);
        this.setRotateAngle(cube_r13, 0.0F, 0.7767F, 0.0F);
        this.cube_r13.cubeList.add(new ModelBox(cube_r13, 28, 29, -2.9998F, -0.5F, -0.0484F, 3, 1, 1, 0.0F, false));

        this.spike2 = new AdvancedModelRenderer(this);
        this.spike2.setRotationPoint(-1.1F, -1.0F, -4.0F);
        this.main.addChild(spike2);
        this.setRotateAngle(spike2, 0.0F, -0.4637F, 0.0F);


        this.cube_r14 = new AdvancedModelRenderer(this);
        this.cube_r14.setRotationPoint(2.4472F, 0.0F, 4.5367F);
        this.spike2.addChild(cube_r14);
        this.setRotateAngle(cube_r14, 0.0F, 0.384F, 0.0F);
        this.cube_r14.cubeList.add(new ModelBox(cube_r14, 23, 1, -0.325F, -0.5F, -1.825F, 1, 1, 2, -0.003F, true));

        this.cube_r15 = new AdvancedModelRenderer(this);
        this.cube_r15.setRotationPoint(3.0829F, 0.0F, 3.917F);
        this.spike2.addChild(cube_r15);
        this.setRotateAngle(cube_r15, 0.0F, 0.9425F, 0.0F);
        this.cube_r15.cubeList.add(new ModelBox(cube_r15, 30, 16, -0.375F, -0.5F, -1.65F, 1, 1, 2, -0.002F, true));

        this.cube_r16 = new AdvancedModelRenderer(this);
        this.cube_r16.setRotationPoint(2.1429F, 0.0F, 2.101F);
        this.spike2.addChild(cube_r16);
        this.setRotateAngle(cube_r16, 0.0F, -0.3185F, 0.0F);
        this.cube_r16.cubeList.add(new ModelBox(cube_r16, 20, 29, -1.0013F, -0.5F, -0.045F, 3, 1, 1, -0.001F, true));

        this.cube_r17 = new AdvancedModelRenderer(this);
        this.cube_r17.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.spike2.addChild(cube_r17);
        this.setRotateAngle(cube_r17, 0.0F, -0.7767F, 0.0F);
        this.cube_r17.cubeList.add(new ModelBox(cube_r17, 28, 29, -0.0002F, -0.5F, -0.0484F, 3, 1, 1, 0.0F, true));

        this.body = new AdvancedModelRenderer(this);
        this.body.setRotationPoint(-3.5F, -1.7343F, 6.7443F);
        this.main.addChild(body);
        this.setRotateAngle(body, 0.0F, 0.0F, 0.0F);
        this.body.cubeList.add(new ModelBox(body, 12, 15, -1.5F, -1.0657F, -0.2443F, 3, 2, 4, 0.0F, false));

        this.cube_r18 = new AdvancedModelRenderer(this);
        this.cube_r18.setRotationPoint(0.0F, 1.6093F, -0.2443F);
        this.body.addChild(cube_r18);
        this.setRotateAngle(cube_r18, 0.0218F, 0.0F, 0.0F);
        this.cube_r18.cubeList.add(new ModelBox(cube_r18, 16, 4, -1.5F, -1.0F, 0.0F, 3, 1, 4, -0.01F, false));

        this.body2 = new AdvancedModelRenderer(this);
        this.body2.setRotationPoint(0.0F, 0.4346F, 3.4993F);
        this.body.addChild(body2);
        this.setRotateAngle(body2, 0.0F, 0.0F, 0.0F);
        this.body2.cubeList.add(new ModelBox(body2, 13, 9, -1.5F, -1.5003F, 0.0064F, 3, 2, 4, -0.001F, false));

        this.cube_r19 = new AdvancedModelRenderer(this);
        this.cube_r19.setRotationPoint(0.0F, 1.1747F, -5.9936F);
        this.body2.addChild(cube_r19);
        this.setRotateAngle(cube_r19, 0.0218F, 0.0F, 0.0F);
        this.cube_r19.cubeList.add(new ModelBox(cube_r19, 20, 24, -1.0F, -1.0F, 6.0F, 2, 1, 4, 0.0F, false));

        this.tail = new AdvancedModelRenderer(this);
        this.tail.setRotationPoint(0.0F, -0.1383F, 3.946F);
        this.body2.addChild(tail);
        this.tail.cubeList.add(new ModelBox(tail, 22, 18, -1.0F, -1.362F, 0.0354F, 2, 2, 4, 0.0F, false));

        this.cube_r20 = new AdvancedModelRenderer(this);
        this.cube_r20.setRotationPoint(0.0F, 1.0514F, 0.0217F);
        this.tail.addChild(cube_r20);
        this.setRotateAngle(cube_r20, 0.1178F, 0.0F, 0.0F);
        this.cube_r20.cubeList.add(new ModelBox(cube_r20, 8, 26, -0.5F, -0.9563F, 0.0104F, 1, 1, 4, 0.0F, false));

        this.tail2 = new AdvancedModelRenderer(this);
        this.tail2.setRotationPoint(0.0F, -0.562F, 4.0354F);
        this.tail.addChild(tail2);
        this.setRotateAngle(tail2, 0.0F, 0.0F, 0.0F);
        this.tail2.cubeList.add(new ModelBox(tail2, 26, 0, -0.5F, -1.75F, 0.0F, 1, 3, 4, 0.0F, false));

        updateDefaultPose();
    }

    @Override
    public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        this.main.render(f5);
    }
    public void renderStaticWall(float f) {
        this.main.rotateAngleX = (float) Math.toRadians(90);
        this.main.rotateAngleZ = (float) Math.toRadians(90);
        this.main.offsetX = -0.09F;
        this.main.offsetY = -0.19F;
        this.main.offsetZ = 0.051F;
        this.main.render(0.01F);
        resetToDefaultPose();
    }
    public void renderStaticFloor(float f) {
        this.setRotateAngle(main, -0.3927F, (float) Math.toRadians(90), 0.0F);
        this.setRotateAngle(cube_r1, 0.2051F, 0.0F, 0.0F);
        this.setRotateAngle(cube_r2, 0.0829F, 0.0F, 0.0F);
        this.setRotateAngle(cube_r3, 0.2182F, 0.0F, 0.0F);
        this.setRotateAngle(cube_r4, 0.0F, 0.1396F, 0.0F);
        this.setRotateAngle(cube_r5, 0.0F, -0.1396F, 0.0F);
        this.setRotateAngle(cube_r6, 0.0F, -0.6458F, 0.0F);
        this.setRotateAngle(cube_r7, 0.0F, 0.6458F, 0.0F);
        this.setRotateAngle(cube_r8, 0.0F, -0.829F, 0.0F);
        this.setRotateAngle(cube_r9, 0.0F, 0.829F, 0.0F);
        this.setRotateAngle(spike, 0.0F, 0.4637F, 0.0F);
        this.setRotateAngle(cube_r10, 0.0F, -0.384F, 0.0F);
        this.setRotateAngle(cube_r11, 0.0F, -0.9425F, 0.0F);
        this.setRotateAngle(cube_r12, 0.0F, 0.3185F, 0.0F);
        this.setRotateAngle(cube_r13, 0.0F, 0.7767F, 0.0F);
        this.setRotateAngle(spike2, 0.0F, -0.4637F, 0.0F);
        this.setRotateAngle(cube_r14, 0.0F, 0.384F, 0.0F);
        this.setRotateAngle(cube_r15, 0.0F, 0.9425F, 0.0F);
        this.setRotateAngle(cube_r16, 0.0F, -0.3185F, 0.0F);
        this.setRotateAngle(cube_r17, 0.0F, -0.7767F, 0.0F);
        this.setRotateAngle(body, 0.1745F, -0.3491F, 0.0F);
        this.setRotateAngle(cube_r18, 0.0218F, 0.0F, 0.0F);
        this.setRotateAngle(body2, 0.1309F, -0.2182F, 0.0F);
        this.setRotateAngle(cube_r19, 0.0218F, 0.0F, 0.0F);
        this.setRotateAngle(tail, 0.0873F, -0.4363F, 0.0F);
        this.setRotateAngle(cube_r20, 0.1178F, 0.0F, 0.0F);
        this.setRotateAngle(tail2, 0.0F, -0.3927F, 0.0F);
        this.main.offsetX = -0.08F;
        this.main.offsetZ = -0.035F;
        this.main.render(0.01F);
        resetToDefaultPose();
    }
    @Override
    public void renderStaticBook(float f) {
        //Rotations, positions and sizing:
        this.main.offsetY = -0.6F;
        this.main.offsetX = -0.6F;
        this.main.offsetZ = 2.0F;
        this.main.rotateAngleY = (float)Math.toRadians(120);
        this.main.rotateAngleX = (float)Math.toRadians(1);
        this.main.rotateAngleZ = (float)Math.toRadians(0);
        this.main.scaleChildren = true;
        float scaler = 3.2F;
        this.main.setScale(scaler, scaler, scaler);
        //Start of pose:
        this.setRotateAngle(main, 0.6F, 3.8F, -0.2F);
        this.setRotateAngle(cube_r1, 0.2051F, 0.0F, 0.0F);
        this.setRotateAngle(cube_r2, 0.0829F, 0.0F, 0.0F);
        this.setRotateAngle(cube_r3, 0.2182F, 0.0F, 0.0F);
        this.setRotateAngle(cube_r4, 0.0F, 0.1396F, 0.0F);
        this.setRotateAngle(cube_r5, 0.0F, -0.1396F, 0.0F);
        this.setRotateAngle(cube_r6, 0.0F, -0.6458F, 0.0F);
        this.setRotateAngle(cube_r7, 0.0F, 0.6458F, 0.0F);
        this.setRotateAngle(cube_r8, 0.0F, -0.829F, 0.0F);
        this.setRotateAngle(cube_r9, 0.0F, 0.829F, 0.0F);
        this.setRotateAngle(spike, 0.0F, 0.4637F, 0.0F);
        this.setRotateAngle(cube_r10, 0.0F, -0.384F, 0.0F);
        this.setRotateAngle(cube_r11, 0.0F, -0.9425F, 0.0F);
        this.setRotateAngle(cube_r12, 0.0F, 0.3185F, 0.0F);
        this.setRotateAngle(cube_r13, 0.0F, 0.7767F, 0.0F);
        this.setRotateAngle(spike2, 0.0F, -0.4637F, 0.0F);
        this.setRotateAngle(cube_r14, 0.0F, 0.384F, 0.0F);
        this.setRotateAngle(cube_r15, 0.0F, 0.9425F, 0.0F);
        this.setRotateAngle(cube_r16, 0.0F, -0.3185F, 0.0F);
        this.setRotateAngle(cube_r17, 0.0F, -0.7767F, 0.0F);
        this.setRotateAngle(body, 0.1745F, -0.3491F, 0.0F);
        this.setRotateAngle(cube_r18, 0.0218F, 0.0F, 0.0F);
        this.setRotateAngle(body2, 0.1309F, -0.2182F, 0.0F);
        this.setRotateAngle(cube_r19, 0.0218F, 0.0F, 0.0F);
        this.setRotateAngle(tail, 0.0873F, -0.4363F, 0.0F);
        this.setRotateAngle(cube_r20, 0.1178F, 0.0F, 0.0F);
        this.setRotateAngle(tail2, 0.0F, -0.3927F, 0.0F);
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
        this.main.offsetY = 0;

        //this.Tailfin.setScale(1.1F, 1.1F, 1.1F);
        AdvancedModelRenderer[] fishTail = {this.body, this.body2, this.tail, this.tail2};

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
            taildegree = 0.25F;
        }

        if (e instanceof EntityLiving && !((EntityLiving) e).isAIDisabled()) {
            this.chainWave(fishTail, speed, 0.05F, -3, f2, 1);
            this.chainSwing(fishTail, speed, taildegree, -3, f2, 1);
            this.swing(body, speed, 0.3F, true, 0, 0, f2, 1);
            this.flap(frontleftfin, (float) (speed * 0.75), 0.12F, true, 0, 0, f2, 1);
            this.swing(frontleftfin, (float) (speed * 0.75), 0.12F, true, 0, 0, f2, 1);
            this.flap(frontrightfin, (float) (speed * 0.75), -0.12F, true, 0, 0, f2, 1);
            this.swing(frontrightfin, (float) (speed * 0.75), 0.12F, true, 0, 0, f2, 1);
            if (!e.isInWater()) {
                //this.Bodyfront.rotateAngleZ = (float) Math.toRadians(90);
                this.main.offsetY = 0;
                this.bob(main, -speed, 2F, false, f2, 1);
                this.chainWave(fishTail, speed, 0.2F, -3, f2, 1);
            }
        }
    }
}
