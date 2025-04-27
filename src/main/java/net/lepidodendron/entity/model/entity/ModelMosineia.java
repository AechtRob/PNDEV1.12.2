package net.lepidodendron.entity.model.entity;

import net.ilexiconn.llibrary.client.model.tools.AdvancedModelRenderer;
import net.lepidodendron.entity.model.ModelBasePalaeopedia;
import net.minecraft.block.material.Material;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLiving;
import net.minecraft.util.math.BlockPos;

public class ModelMosineia extends ModelBasePalaeopedia {
    private final AdvancedModelRenderer Mosineia;
    private final AdvancedModelRenderer head;
    private final AdvancedModelRenderer anntennae1;
    private final AdvancedModelRenderer anntennae2;
    private final AdvancedModelRenderer carapace1;
    private final AdvancedModelRenderer bb_main_r1;
    private final AdvancedModelRenderer bb_main_r2;
    private final AdvancedModelRenderer leg1;
    private final AdvancedModelRenderer bb_main_r3;
    private final AdvancedModelRenderer leg2;
    private final AdvancedModelRenderer bb_main_r4;
    private final AdvancedModelRenderer carapace2;
    private final AdvancedModelRenderer bb_main_r5;
    private final AdvancedModelRenderer bb_main_r6;
    private final AdvancedModelRenderer leg3;
    private final AdvancedModelRenderer bb_main_r7;
    private final AdvancedModelRenderer leg4;
    private final AdvancedModelRenderer bb_main_r8;
    private final AdvancedModelRenderer carapace3;
    private final AdvancedModelRenderer bb_main_r9;
    private final AdvancedModelRenderer bb_main_r10;
    private final AdvancedModelRenderer leg5;
    private final AdvancedModelRenderer bb_main_r11;
    private final AdvancedModelRenderer leg6;
    private final AdvancedModelRenderer bb_main_r12;
    private final AdvancedModelRenderer carapace4;
    private final AdvancedModelRenderer bb_main_r13;
    private final AdvancedModelRenderer bb_main_r14;
    private final AdvancedModelRenderer leg7;
    private final AdvancedModelRenderer bb_main_r15;
    private final AdvancedModelRenderer leg8;
    private final AdvancedModelRenderer bb_main_r16;
    private final AdvancedModelRenderer carapace5;
    private final AdvancedModelRenderer bb_main_r17;
    private final AdvancedModelRenderer bb_main_r18;
    private final AdvancedModelRenderer leg9;
    private final AdvancedModelRenderer bb_main_r19;
    private final AdvancedModelRenderer leg10;
    private final AdvancedModelRenderer bb_main_r20;
    private final AdvancedModelRenderer tail1;
    private final AdvancedModelRenderer tail2;
    private final AdvancedModelRenderer tail3;
    private final AdvancedModelRenderer tail4;
    private final AdvancedModelRenderer tail5;
    private final AdvancedModelRenderer tail6;

    public ModelMosineia() {
        this.textureWidth = 18;
        this.textureHeight = 12;

        this.Mosineia = new AdvancedModelRenderer(this);
        this.Mosineia.setRotationPoint(0.0F, 23.4F, -0.025F);


        this.head = new AdvancedModelRenderer(this);
        this.head.setRotationPoint(0.0F, 0.0F, -6.95F);
        this.Mosineia.addChild(head);
        this.head.cubeList.add(new ModelBox(head, 11, 0, -1.5F, -0.3F, -1.025F, 3, 0, 1, 0.0F, false));

        this.anntennae1 = new AdvancedModelRenderer(this);
        this.anntennae1.setRotationPoint(0.25F, -0.3F, -1.025F);
        this.head.addChild(anntennae1);
        this.anntennae1.cubeList.add(new ModelBox(anntennae1, 10, 6, 0.0F, 0.0F, -2.0F, 2, 0, 2, 0.0F, false));

        this.anntennae2 = new AdvancedModelRenderer(this);
        this.anntennae2.setRotationPoint(-0.25F, -0.3F, -1.025F);
        this.head.addChild(anntennae2);
        this.anntennae2.cubeList.add(new ModelBox(anntennae2, 10, 6, -2.0F, 0.0F, -2.0F, 2, 0, 2, 0.0F, true));

        this.carapace1 = new AdvancedModelRenderer(this);
        this.carapace1.setRotationPoint(0.0F, -0.375F, 1.725F);
        this.head.addChild(carapace1);
        this.carapace1.cubeList.add(new ModelBox(carapace1, -2, 7, -2.5F, 0.025F, -2.0F, 5, 0, 2, 0.0F, false));

        this.bb_main_r1 = new AdvancedModelRenderer(this);
        this.bb_main_r1.setRotationPoint(-2.5F, 0.025F, -2.0F);
        this.carapace1.addChild(bb_main_r1);
        this.setRotateAngle(bb_main_r1, 0.0021F, -0.3927F, -0.0444F);
        this.bb_main_r1.cubeList.add(new ModelBox(bb_main_r1, 8, 10, 0.0F, 0.0F, 0.0F, 1, 0, 2, 0.0F, true));

        this.bb_main_r2 = new AdvancedModelRenderer(this);
        this.bb_main_r2.setRotationPoint(2.5F, 0.025F, -2.0F);
        this.carapace1.addChild(bb_main_r2);
        this.setRotateAngle(bb_main_r2, 0.0021F, 0.3927F, 0.0444F);
        this.bb_main_r2.cubeList.add(new ModelBox(bb_main_r2, 8, 10, -1.0F, 0.0F, 0.0F, 1, 0, 2, 0.0F, false));

        this.leg1 = new AdvancedModelRenderer(this);
        this.leg1.setRotationPoint(0.0F, 0.175F, -0.4F);
        this.carapace1.addChild(leg1);


        this.bb_main_r3 = new AdvancedModelRenderer(this);
        this.bb_main_r3.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.leg1.addChild(bb_main_r3);
        this.setRotateAngle(bb_main_r3, 0.0573F, -0.2106F, -0.2679F);
        this.bb_main_r3.cubeList.add(new ModelBox(bb_main_r3, 11, 2, -3.0F, 0.0F, -0.5F, 3, 0, 1, 0.0F, false));

        this.leg2 = new AdvancedModelRenderer(this);
        this.leg2.setRotationPoint(0.0F, 0.175F, -0.4F);
        this.carapace1.addChild(leg2);


        this.bb_main_r4 = new AdvancedModelRenderer(this);
        this.bb_main_r4.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.leg2.addChild(bb_main_r4);
        this.setRotateAngle(bb_main_r4, 0.0692F, 0.2527F, 0.2706F);
        this.bb_main_r4.cubeList.add(new ModelBox(bb_main_r4, 11, 4, 0.0F, 0.0F, -0.5F, 3, 0, 1, 0.0F, false));

        this.carapace2 = new AdvancedModelRenderer(this);
        this.carapace2.setRotationPoint(0.0F, 0.025F, -0.25F);
        this.carapace1.addChild(carapace2);
        this.carapace2.cubeList.add(new ModelBox(carapace2, -2, 4, -2.5F, 0.025F, 0.0F, 5, 0, 2, 0.0F, false));

        this.bb_main_r5 = new AdvancedModelRenderer(this);
        this.bb_main_r5.setRotationPoint(-2.25F, 0.0F, 3.0F);
        this.carapace2.addChild(bb_main_r5);
        this.setRotateAngle(bb_main_r5, 0.0F, 0.0F, -0.0873F);
        this.bb_main_r5.cubeList.add(new ModelBox(bb_main_r5, 8, 10, -1.0F, 0.0F, -3.0F, 1, 0, 2, 0.0F, true));

        this.bb_main_r6 = new AdvancedModelRenderer(this);
        this.bb_main_r6.setRotationPoint(2.25F, 0.0F, 3.0F);
        this.carapace2.addChild(bb_main_r6);
        this.setRotateAngle(bb_main_r6, 0.0F, 0.0F, 0.0873F);
        this.bb_main_r6.cubeList.add(new ModelBox(bb_main_r6, 8, 10, 0.0F, 0.0F, -3.0F, 1, 0, 2, 0.0F, false));

        this.leg3 = new AdvancedModelRenderer(this);
        this.leg3.setRotationPoint(-0.25F, 0.15F, 1.1F);
        this.carapace2.addChild(leg3);


        this.bb_main_r7 = new AdvancedModelRenderer(this);
        this.bb_main_r7.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.leg3.addChild(bb_main_r7);
        this.setRotateAngle(bb_main_r7, 0.0F, 0.0F, -0.2618F);
        this.bb_main_r7.cubeList.add(new ModelBox(bb_main_r7, 11, 2, -3.0F, 0.0F, -0.5F, 3, 0, 1, 0.0F, false));

        this.leg4 = new AdvancedModelRenderer(this);
        this.leg4.setRotationPoint(0.25F, 0.15F, 1.1F);
        this.carapace2.addChild(leg4);


        this.bb_main_r8 = new AdvancedModelRenderer(this);
        this.bb_main_r8.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.leg4.addChild(bb_main_r8);
        this.setRotateAngle(bb_main_r8, 0.0F, 0.0F, 0.2618F);
        this.bb_main_r8.cubeList.add(new ModelBox(bb_main_r8, 11, 4, 0.0F, 0.0F, -0.5F, 3, 0, 1, 0.0F, false));

        this.carapace3 = new AdvancedModelRenderer(this);
        this.carapace3.setRotationPoint(0.0F, 0.025F, 1.75F);
        this.carapace2.addChild(carapace3);
        this.carapace3.cubeList.add(new ModelBox(carapace3, -2, 4, -2.5F, 0.025F, 0.0F, 5, 0, 2, 0.0F, false));

        this.bb_main_r9 = new AdvancedModelRenderer(this);
        this.bb_main_r9.setRotationPoint(-2.25F, 0.0F, 1.0F);
        this.carapace3.addChild(bb_main_r9);
        this.setRotateAngle(bb_main_r9, 0.0F, 0.0F, -0.0873F);
        this.bb_main_r9.cubeList.add(new ModelBox(bb_main_r9, 8, 10, -1.0F, 0.0F, -1.0F, 1, 0, 2, 0.0F, true));

        this.bb_main_r10 = new AdvancedModelRenderer(this);
        this.bb_main_r10.setRotationPoint(2.25F, 0.0F, 1.0F);
        this.carapace3.addChild(bb_main_r10);
        this.setRotateAngle(bb_main_r10, 0.0F, 0.0F, 0.0873F);
        this.bb_main_r10.cubeList.add(new ModelBox(bb_main_r10, 8, 10, 0.0F, 0.0F, -1.0F, 1, 0, 2, 0.0F, false));

        this.leg5 = new AdvancedModelRenderer(this);
        this.leg5.setRotationPoint(-0.25F, 0.125F, 1.1F);
        this.carapace3.addChild(leg5);


        this.bb_main_r11 = new AdvancedModelRenderer(this);
        this.bb_main_r11.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.leg5.addChild(bb_main_r11);
        this.setRotateAngle(bb_main_r11, 0.0F, 0.0F, -0.2618F);
        this.bb_main_r11.cubeList.add(new ModelBox(bb_main_r11, 11, 2, -3.0F, 0.0F, -0.5F, 3, 0, 1, 0.0F, false));

        this.leg6 = new AdvancedModelRenderer(this);
        this.leg6.setRotationPoint(0.25F, 0.125F, 1.1F);
        this.carapace3.addChild(leg6);


        this.bb_main_r12 = new AdvancedModelRenderer(this);
        this.bb_main_r12.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.leg6.addChild(bb_main_r12);
        this.setRotateAngle(bb_main_r12, 0.0F, 0.0F, 0.2618F);
        this.bb_main_r12.cubeList.add(new ModelBox(bb_main_r12, 11, 4, 0.0F, 0.0F, -0.5F, 3, 0, 1, 0.0F, false));

        this.carapace4 = new AdvancedModelRenderer(this);
        this.carapace4.setRotationPoint(0.0F, 0.025F, 1.75F);
        this.carapace3.addChild(carapace4);
        this.carapace4.cubeList.add(new ModelBox(carapace4, -2, 4, -2.5F, 0.025F, 0.0F, 5, 0, 2, 0.0F, false));

        this.bb_main_r13 = new AdvancedModelRenderer(this);
        this.bb_main_r13.setRotationPoint(-2.25F, 0.0F, -1.0F);
        this.carapace4.addChild(bb_main_r13);
        this.setRotateAngle(bb_main_r13, 0.0F, 0.0F, -0.0873F);
        this.bb_main_r13.cubeList.add(new ModelBox(bb_main_r13, 8, 10, -1.0F, 0.0F, 1.0F, 1, 0, 2, 0.0F, true));

        this.bb_main_r14 = new AdvancedModelRenderer(this);
        this.bb_main_r14.setRotationPoint(2.25F, 0.0F, -1.0F);
        this.carapace4.addChild(bb_main_r14);
        this.setRotateAngle(bb_main_r14, 0.0F, 0.0F, 0.0873F);
        this.bb_main_r14.cubeList.add(new ModelBox(bb_main_r14, 8, 10, 0.0F, 0.0F, 1.0F, 1, 0, 2, 0.0F, false));

        this.leg7 = new AdvancedModelRenderer(this);
        this.leg7.setRotationPoint(-0.25F, 0.1F, 1.1F);
        this.carapace4.addChild(leg7);


        this.bb_main_r15 = new AdvancedModelRenderer(this);
        this.bb_main_r15.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.leg7.addChild(bb_main_r15);
        this.setRotateAngle(bb_main_r15, 0.0F, 0.0F, -0.2618F);
        this.bb_main_r15.cubeList.add(new ModelBox(bb_main_r15, 11, 2, -3.0F, 0.0F, -0.5F, 3, 0, 1, 0.0F, false));

        this.leg8 = new AdvancedModelRenderer(this);
        this.leg8.setRotationPoint(0.25F, 0.1F, 1.1F);
        this.carapace4.addChild(leg8);


        this.bb_main_r16 = new AdvancedModelRenderer(this);
        this.bb_main_r16.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.leg8.addChild(bb_main_r16);
        this.setRotateAngle(bb_main_r16, 0.0F, 0.0F, 0.2618F);
        this.bb_main_r16.cubeList.add(new ModelBox(bb_main_r16, 11, 4, 0.0F, 0.0F, -0.5F, 3, 0, 1, 0.0F, false));

        this.carapace5 = new AdvancedModelRenderer(this);
        this.carapace5.setRotationPoint(0.0F, 0.025F, 1.75F);
        this.carapace4.addChild(carapace5);
        this.carapace5.cubeList.add(new ModelBox(carapace5, -3, 0, -2.5F, 0.025F, 0.0F, 5, 0, 3, 0.0F, false));

        this.bb_main_r17 = new AdvancedModelRenderer(this);
        this.bb_main_r17.setRotationPoint(-2.5F, 0.025F, 3.0F);
        this.carapace5.addChild(bb_main_r17);
        this.setRotateAngle(bb_main_r17, -0.002F, 0.2618F, -0.0877F);
        this.bb_main_r17.cubeList.add(new ModelBox(bb_main_r17, 7, 0, 0.0F, 0.0F, -3.0F, 1, 0, 3, 0.0F, true));

        this.bb_main_r18 = new AdvancedModelRenderer(this);
        this.bb_main_r18.setRotationPoint(2.5F, 0.025F, 3.0F);
        this.carapace5.addChild(bb_main_r18);
        this.setRotateAngle(bb_main_r18, -0.002F, -0.2618F, 0.0877F);
        this.bb_main_r18.cubeList.add(new ModelBox(bb_main_r18, 7, 0, -1.0F, 0.0F, -3.0F, 1, 0, 3, 0.0F, false));

        this.leg9 = new AdvancedModelRenderer(this);
        this.leg9.setRotationPoint(0.0F, 0.075F, 0.85F);
        this.carapace5.addChild(leg9);


        this.bb_main_r19 = new AdvancedModelRenderer(this);
        this.bb_main_r19.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.leg9.addChild(bb_main_r19);
        this.setRotateAngle(bb_main_r19, -0.0573F, 0.2106F, -0.2679F);
        this.bb_main_r19.cubeList.add(new ModelBox(bb_main_r19, 11, 2, -3.0F, 0.0F, -0.5F, 3, 0, 1, 0.0F, false));

        this.leg10 = new AdvancedModelRenderer(this);
        this.leg10.setRotationPoint(0.0F, 0.075F, 0.85F);
        this.carapace5.addChild(leg10);


        this.bb_main_r20 = new AdvancedModelRenderer(this);
        this.bb_main_r20.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.leg10.addChild(bb_main_r20);
        this.setRotateAngle(bb_main_r20, -0.0573F, -0.2106F, 0.2679F);
        this.bb_main_r20.cubeList.add(new ModelBox(bb_main_r20, 11, 4, 0.0F, 0.0F, -0.5F, 3, 0, 1, 0.0F, false));

        this.tail1 = new AdvancedModelRenderer(this);
        this.tail1.setRotationPoint(0.0F, 0.075F, 1.75F);
        this.carapace5.addChild(tail1);
        this.tail1.cubeList.add(new ModelBox(tail1, -2, 10, -1.5F, 0.0F, 0.0F, 3, 0, 2, 0.0F, false));

        this.tail2 = new AdvancedModelRenderer(this);
        this.tail2.setRotationPoint(0.0F, 0.025F, 1.5F);
        this.tail1.addChild(tail2);
        this.tail2.cubeList.add(new ModelBox(tail2, -2, 10, -1.5F, 0.0F, 0.0F, 3, 0, 2, 0.0F, false));

        this.tail3 = new AdvancedModelRenderer(this);
        this.tail3.setRotationPoint(0.0F, 0.025F, 1.5F);
        this.tail2.addChild(tail3);
        this.tail3.cubeList.add(new ModelBox(tail3, -2, 10, -1.5F, 0.0F, 0.0F, 3, 0, 2, 0.0F, false));

        this.tail4 = new AdvancedModelRenderer(this);
        this.tail4.setRotationPoint(0.0F, 0.025F, 1.5F);
        this.tail3.addChild(tail4);
        this.tail4.cubeList.add(new ModelBox(tail4, 4, 10, -1.0F, 0.0F, 0.0F, 2, 0, 2, 0.0F, false));

        this.tail5 = new AdvancedModelRenderer(this);
        this.tail5.setRotationPoint(0.0F, 0.025F, 1.5F);
        this.tail4.addChild(tail5);
        this.tail5.cubeList.add(new ModelBox(tail5, 4, 10, -1.0F, 0.0F, 0.0F, 2, 0, 2, 0.0F, false));

        this.tail6 = new AdvancedModelRenderer(this);
        this.tail6.setRotationPoint(0.0F, 0.025F, 1.5F);
        this.tail5.addChild(tail6);
        this.tail6.cubeList.add(new ModelBox(tail6, 6, 4, -0.5F, 0.0F, 0.0F, 1, 0, 4, 0.0F, false));

        updateDefaultPose();
    }

    @Override
    public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        //setRotationAngles(f, f1, f2, f3, f4, f5, entity);
        //this.Bodyfront.render(0.5F);
        //this.leg2R_r1.defaultRotationZ = -0.6109F;
        //this.leg2L_r1.defaultRotationZ = 0.6109F;
        this.Mosineia.render(f5);

    }
    public void renderStaticFloor(float f) {
        this.Mosineia.render(0.01F);
        resetToDefaultPose();
    }

    @Override
    public void renderStaticBook(float f) {
        //Rotations, positions and sizing:
        this.Mosineia.offsetY = -0.3F;
        this.Mosineia.offsetX = 0.1F;
        this.Mosineia.scaleChildren = true;
        float scaler = 1.0F;
        this.Mosineia.setScale(scaler, scaler, scaler);
        //Start of pose:

        //End of pose, now render the model:
        this.Mosineia.render(f);
        //Reset rotations, positions and sizing:
        this.Mosineia.setScale(1.0F, 1.0F, 1.0F);
        this.Mosineia.scaleChildren = false;
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
       // this.Mosineia.offsetY = 1.0F;

        AdvancedModelRenderer[] fishTail = {this.tail1, this.tail2, this.tail3, this.tail4, this.tail5, this.tail6};
        AdvancedModelRenderer[] legsL = {this.leg2, this.leg4, this.leg6, this.leg8, this.leg10};
        AdvancedModelRenderer[] legsR = {this.leg1, this.leg3, this.leg5, this.leg7, this.leg9};

        float speed = 0.4F;
        float tailVdegree = 0.7F;
        float tailHdegree = 0.0F;
        float tailSwing = 0.25F;

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
        if (isAtBottom || !e.isInWater()) {
            //System.err.println("Animation at bottom");
            speed = 0.15F;
            tailVdegree = 0.06F;
            tailHdegree = 0.2F;
            tailSwing = 0.1F;
        }

        //Antennae:
        this.swing(anntennae1, 0.5F, -0.2F, false, 0, -0.1F, f2, 0.8F);
        this.swing(anntennae2, 0.5F, 0.2F, false, 0, 0.1F, f2, 0.8F);

        //Legs:
        if (f3 != 0.0F) {
            this.chainWave(legsL, 0.2F, 0.2F, -3, f2, 1);
            this.chainWave(legsR, 0.6F, 0.2F, -3, f2, 1);
            this.flap(leg2, 0.5F, -0.5F, false, 0, 0.3F, f2, 0.3F);
            this.flap(leg1, 0.5F, 0.5F, false, 0, -0.3F, f2, 0.3F);
            this.flap(leg4, 0.5F, -0.5F, false, 1.0F, 0.3F, f2, 0.3F);
            this.flap(leg3, 0.5F, 0.5F, false, 1.0F, -0.3F, f2, 0.3F);
            this.flap(leg6, 0.5F, -0.5F, false, 2.0F, 0.3F, f2, 0.3F);
            this.flap(leg7, 0.5F, 0.5F, false, 2.0F, -0.3F, f2, 0.3F);
            this.flap(leg8, 0.5F, -0.5F, false, 3.0F, 0.3F, f2, 0.3F);
            this.flap(leg9, 0.5F, 0.5F, false, 3.0F, -0.3F, f2, 0.3F);
            this.flap(leg10, 0.5F, -0.5F, false, 4.0F, 0.3F, f2, 0.3F);

        }

        if (e instanceof EntityLiving && !((EntityLiving) e).isAIDisabled()) {
            this.chainWave(fishTail, speed, tailVdegree * 0.3f, -3, f2, 1);
            this.chainSwing(fishTail, speed, tailHdegree, -2.5, f2, tailSwing);

            //this.swing(body, speed, 0.3F, true, 0, 0, f2, 1);
            if (!isAtBottom && e.isInWater()) {
                this.bob(Mosineia, -speed, 1.5F, false, f2, 2);
            }
            //if (!e.isInWater()) {
            //    //this.Bodyfront.rotateAngleZ = (float) Math.toRadians(90);
            //    this.body.offsetY = 1.0F;
            //    this.bob(body, -speed, 2F, false, f2, 1);
            //    this.chainWave(fishTail, speed, tailHdegree, -3, f2, 1);
            //    this.chainSwing(fishTail, speed, tailVdegree, -3, f2, 1);
            //}
        }
    }
}
