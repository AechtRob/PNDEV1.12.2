package net.lepidodendron.entity.model.entity;

import net.ilexiconn.llibrary.client.model.tools.AdvancedModelRenderer;
import net.lepidodendron.entity.model.ModelBasePalaeopedia;
import net.minecraft.block.material.Material;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLiving;
import net.minecraft.util.math.BlockPos;

public class ModelApankura extends ModelBasePalaeopedia {
    private final AdvancedModelRenderer body;
    private final AdvancedModelRenderer cube_r1;
    private final AdvancedModelRenderer cube_r2;
    private final AdvancedModelRenderer legright;
    private final AdvancedModelRenderer legleft;
    private final AdvancedModelRenderer antennaright;
    private final AdvancedModelRenderer antennaleft;
    private final AdvancedModelRenderer body2;
    private final AdvancedModelRenderer cube_r3;
    private final AdvancedModelRenderer cube_r4;
    private final AdvancedModelRenderer legright2;
    private final AdvancedModelRenderer legleft2;
    private final AdvancedModelRenderer body3;
    private final AdvancedModelRenderer cube_r5;
    private final AdvancedModelRenderer cube_r6;
    private final AdvancedModelRenderer legright3;
    private final AdvancedModelRenderer legleft3;
    private final AdvancedModelRenderer body4;
    private final AdvancedModelRenderer cube_r7;
    private final AdvancedModelRenderer cube_r8;
    private final AdvancedModelRenderer legright4;
    private final AdvancedModelRenderer legleft4;
    private final AdvancedModelRenderer body5;
    private final AdvancedModelRenderer cube_r9;
    private final AdvancedModelRenderer cube_r10;
    private final AdvancedModelRenderer cube_r11;
    private final AdvancedModelRenderer cube_r12;
    private final AdvancedModelRenderer legright5;
    private final AdvancedModelRenderer legleft5;
    private final AdvancedModelRenderer legright6;
    private final AdvancedModelRenderer legleft6;
    private final AdvancedModelRenderer body6;
    private final AdvancedModelRenderer body7;
    private final AdvancedModelRenderer body8;

    public ModelApankura() {
        this.textureWidth = 32;
        this.textureHeight = 32;

        this.body = new AdvancedModelRenderer(this);
        this.body.setRotationPoint(-0.5F, 23.25F, -7.0F);
        this.body.cubeList.add(new ModelBox(body, 12, 17, -0.75F, -1.0F, -1.0F, 1, 1, 1, -0.01F, false));
        this.body.cubeList.add(new ModelBox(body, 12, 17, 0.75F, -1.0F, -1.0F, 1, 1, 1, -0.01F, true));
        this.body.cubeList.add(new ModelBox(body, 16, 16, -0.5F, -1.0F, -1.0F, 2, 1, 1, 0.0F, false));
        this.body.cubeList.add(new ModelBox(body, 0, 0, -1.0F, -1.0F, -0.5F, 3, 1, 2, 0.02F, false));

        this.cube_r1 = new AdvancedModelRenderer(this);
        this.cube_r1.setRotationPoint(1.85F, -0.7F, -0.5F);
        this.body.addChild(cube_r1);
        this.setRotateAngle(cube_r1, 0.0F, -0.9599F, 0.3927F);
        this.cube_r1.cubeList.add(new ModelBox(cube_r1, 18, 5, 0.0F, 0.0F, 0.0F, 2, 0, 1, 0.0F, true));

        this.cube_r2 = new AdvancedModelRenderer(this);
        this.cube_r2.setRotationPoint(-0.85F, -0.7F, -0.5F);
        this.body.addChild(cube_r2);
        this.setRotateAngle(cube_r2, 0.0F, 0.9599F, -0.3927F);
        this.cube_r2.cubeList.add(new ModelBox(cube_r2, 18, 5, -2.0F, 0.0F, 0.0F, 2, 0, 1, 0.0F, false));

        this.legright = new AdvancedModelRenderer(this);
        this.legright.setRotationPoint(-0.8F, 0.0F, 1.25F);
        this.body.addChild(legright);
        this.setRotateAngle(legright, 0.0873F, -0.3054F, -0.5498F);
        this.legright.cubeList.add(new ModelBox(legright, 18, 4, -1.5F, 0.0F, -0.5F, 2, 0, 1, 0.0F, false));

        this.legleft = new AdvancedModelRenderer(this);
        this.legleft.setRotationPoint(1.8F, 0.0F, 1.25F);
        this.body.addChild(legleft);
        this.setRotateAngle(legleft, 0.0873F, 0.3054F, 0.5498F);
        this.legleft.cubeList.add(new ModelBox(legleft, 18, 4, -0.5F, 0.0F, -0.5F, 2, 0, 1, 0.0F, true));

        this.antennaright = new AdvancedModelRenderer(this);
        this.antennaright.setRotationPoint(0.25F, -0.5F, -1.0F);
        this.body.addChild(antennaright);
        this.setRotateAngle(antennaright, 0.0F, 0.5672F, 0.0F);
        this.antennaright.cubeList.add(new ModelBox(antennaright, 18, 6, 0.0F, -0.5F, -0.8F, 0, 1, 1, 0.0F, false));

        this.antennaleft = new AdvancedModelRenderer(this);
        this.antennaleft.setRotationPoint(0.75F, -0.5F, -1.0F);
        this.body.addChild(antennaleft);
        this.setRotateAngle(antennaleft, 0.0F, -0.5672F, 0.0F);
        this.antennaleft.cubeList.add(new ModelBox(antennaleft, 18, 6, 0.0F, -0.5F, -0.8F, 0, 1, 1, 0.0F, true));

        this.body2 = new AdvancedModelRenderer(this);
        this.body2.setRotationPoint(0.5F, -0.5F, 1.0F);
        this.body.addChild(body2);
        this.body2.cubeList.add(new ModelBox(body2, 0, 3, -1.5F, -0.5F, 0.0F, 3, 1, 2, 0.01F, false));

        this.cube_r3 = new AdvancedModelRenderer(this);
        this.cube_r3.setRotationPoint(1.5F, -0.5F, 1.0F);
        this.body2.addChild(cube_r3);
        this.setRotateAngle(cube_r3, 0.0F, 0.0F, 0.829F);
        this.cube_r3.cubeList.add(new ModelBox(cube_r3, 0, 12, 0.0F, 0.0F, -1.0F, 2, 0, 2, 0.0F, true));

        this.cube_r4 = new AdvancedModelRenderer(this);
        this.cube_r4.setRotationPoint(-1.5F, -0.5F, 1.0F);
        this.body2.addChild(cube_r4);
        this.setRotateAngle(cube_r4, 0.0F, 0.0F, -0.829F);
        this.cube_r4.cubeList.add(new ModelBox(cube_r4, 0, 12, -2.0F, 0.0F, -1.0F, 2, 0, 2, 0.0F, false));

        this.legright2 = new AdvancedModelRenderer(this);
        this.legright2.setRotationPoint(-1.3F, 0.5F, 1.25F);
        this.body2.addChild(legright2);
        this.setRotateAngle(legright2, 0.0F, -0.0436F, -0.3142F);
        this.legright2.cubeList.add(new ModelBox(legright2, 0, 16, -2.35F, 0.0F, -0.5F, 3, 0, 1, 0.0F, false));

        this.legleft2 = new AdvancedModelRenderer(this);
        this.legleft2.setRotationPoint(1.3F, 0.5F, 1.25F);
        this.body2.addChild(legleft2);
        this.setRotateAngle(legleft2, 0.0F, 0.0436F, 0.3142F);
        this.legleft2.cubeList.add(new ModelBox(legleft2, 0, 16, -0.65F, 0.0F, -0.5F, 3, 0, 1, 0.0F, true));

        this.body3 = new AdvancedModelRenderer(this);
        this.body3.setRotationPoint(0.0F, 0.0F, 1.5F);
        this.body2.addChild(body3);
        this.body3.cubeList.add(new ModelBox(body3, 0, 6, -1.5F, -0.5F, 0.0F, 3, 1, 2, 0.0F, false));

        this.cube_r5 = new AdvancedModelRenderer(this);
        this.cube_r5.setRotationPoint(1.5F, -0.5F, 1.0F);
        this.body3.addChild(cube_r5);
        this.setRotateAngle(cube_r5, 0.0F, 0.0F, 0.829F);
        this.cube_r5.cubeList.add(new ModelBox(cube_r5, 8, 13, 0.0F, 0.025F, -1.0F, 2, 0, 2, 0.0F, true));

        this.cube_r6 = new AdvancedModelRenderer(this);
        this.cube_r6.setRotationPoint(-1.5F, -0.5F, 1.0F);
        this.body3.addChild(cube_r6);
        this.setRotateAngle(cube_r6, 0.0F, 0.0F, -0.829F);
        this.cube_r6.cubeList.add(new ModelBox(cube_r6, 8, 13, -2.0F, 0.025F, -1.0F, 2, 0, 2, 0.0F, false));

        this.legright3 = new AdvancedModelRenderer(this);
        this.legright3.setRotationPoint(-1.3F, 0.5F, 1.25F);
        this.body3.addChild(legright3);
        this.setRotateAngle(legright3, 0.0F, 0.0F, -0.3142F);
        this.legright3.cubeList.add(new ModelBox(legright3, 16, 13, -2.35F, 0.0F, -0.5F, 3, 0, 1, 0.0F, false));

        this.legleft3 = new AdvancedModelRenderer(this);
        this.legleft3.setRotationPoint(1.3F, 0.5F, 1.25F);
        this.body3.addChild(legleft3);
        this.setRotateAngle(legleft3, 0.0F, 0.0F, 0.3142F);
        this.legleft3.cubeList.add(new ModelBox(legleft3, 16, 13, -0.65F, 0.0F, -0.5F, 3, 0, 1, 0.0F, true));

        this.body4 = new AdvancedModelRenderer(this);
        this.body4.setRotationPoint(0.0F, 0.0F, 1.5F);
        this.body3.addChild(body4);
        this.body4.cubeList.add(new ModelBox(body4, 0, 9, -1.5F, -0.5F, 0.0F, 3, 1, 2, -0.01F, false));

        this.cube_r7 = new AdvancedModelRenderer(this);
        this.cube_r7.setRotationPoint(1.5F, -0.5F, 1.0F);
        this.body4.addChild(cube_r7);
        this.setRotateAngle(cube_r7, 0.0F, 0.0F, 0.829F);
        this.cube_r7.cubeList.add(new ModelBox(cube_r7, 0, 14, 0.0F, 0.05F, -1.0F, 2, 0, 2, 0.0F, true));

        this.cube_r8 = new AdvancedModelRenderer(this);
        this.cube_r8.setRotationPoint(-1.5F, -0.5F, 1.0F);
        this.body4.addChild(cube_r8);
        this.setRotateAngle(cube_r8, 0.0F, 0.0F, -0.829F);
        this.cube_r8.cubeList.add(new ModelBox(cube_r8, 0, 14, -2.0F, 0.05F, -1.0F, 2, 0, 2, 0.0F, false));

        this.legright4 = new AdvancedModelRenderer(this);
        this.legright4.setRotationPoint(-1.3F, 0.5F, 1.25F);
        this.body4.addChild(legright4);
        this.setRotateAngle(legright4, 0.0F, 0.0F, -0.3142F);
        this.legright4.cubeList.add(new ModelBox(legright4, 16, 14, -2.35F, 0.0F, -0.5F, 3, 0, 1, 0.0F, false));

        this.legleft4 = new AdvancedModelRenderer(this);
        this.legleft4.setRotationPoint(1.3F, 0.5F, 1.25F);
        this.body4.addChild(legleft4);
        this.setRotateAngle(legleft4, 0.0F, 0.0F, 0.3142F);
        this.legleft4.cubeList.add(new ModelBox(legleft4, 16, 14, -0.65F, 0.0F, -0.5F, 3, 0, 1, 0.0F, true));

        this.body5 = new AdvancedModelRenderer(this);
        this.body5.setRotationPoint(0.0F, 0.025F, 1.5F);
        this.body4.addChild(body5);
        this.body5.cubeList.add(new ModelBox(body5, 10, 0, -1.5F, -0.5F, 0.0F, 3, 1, 2, 0.0F, false));
        this.body5.cubeList.add(new ModelBox(body5, 0, 17, -1.0F, -0.5F, 2.0F, 2, 1, 1, 0.0F, false));

        this.cube_r9 = new AdvancedModelRenderer(this);
        this.cube_r9.setRotationPoint(0.85F, -0.225F, 1.75F);
        this.body5.addChild(cube_r9);
        this.setRotateAngle(cube_r9, 0.0F, -0.1309F, 0.5672F);
        this.cube_r9.cubeList.add(new ModelBox(cube_r9, 18, 3, -0.25F, 0.0F, 0.0F, 2, 0, 1, 0.0F, true));

        this.cube_r10 = new AdvancedModelRenderer(this);
        this.cube_r10.setRotationPoint(1.2F, -0.525F, 0.8F);
        this.body5.addChild(cube_r10);
        this.setRotateAngle(cube_r10, 0.0F, -0.1309F, 0.7854F);
        this.cube_r10.cubeList.add(new ModelBox(cube_r10, 8, 15, 0.0F, 0.05F, -1.0F, 2, 0, 2, 0.0F, true));

        this.cube_r11 = new AdvancedModelRenderer(this);
        this.cube_r11.setRotationPoint(-0.85F, -0.225F, 1.75F);
        this.body5.addChild(cube_r11);
        this.setRotateAngle(cube_r11, 0.0F, 0.1309F, -0.5672F);
        this.cube_r11.cubeList.add(new ModelBox(cube_r11, 18, 3, -1.75F, 0.0F, 0.0F, 2, 0, 1, 0.0F, false));

        this.cube_r12 = new AdvancedModelRenderer(this);
        this.cube_r12.setRotationPoint(-1.2F, -0.525F, 0.8F);
        this.body5.addChild(cube_r12);
        this.setRotateAngle(cube_r12, 0.0F, 0.1309F, -0.7854F);
        this.cube_r12.cubeList.add(new ModelBox(cube_r12, 8, 15, -2.0F, 0.05F, -1.0F, 2, 0, 2, 0.0F, false));

        this.legright5 = new AdvancedModelRenderer(this);
        this.legright5.setRotationPoint(-1.3F, 0.475F, 1.0F);
        this.body5.addChild(legright5);
        this.setRotateAngle(legright5, 0.0F, 0.1745F, -0.3403F);
        this.legright5.cubeList.add(new ModelBox(legright5, 16, 15, -2.35F, 0.0F, -0.5F, 3, 0, 1, 0.0F, false));

        this.legleft5 = new AdvancedModelRenderer(this);
        this.legleft5.setRotationPoint(1.3F, 0.475F, 1.0F);
        this.body5.addChild(legleft5);
        this.setRotateAngle(legleft5, 0.0F, -0.1745F, 0.3403F);
        this.legleft5.cubeList.add(new ModelBox(legleft5, 16, 15, -0.65F, 0.0F, -0.5F, 3, 0, 1, 0.0F, true));

        this.legright6 = new AdvancedModelRenderer(this);
        this.legright6.setRotationPoint(-1.3F, 0.475F, 2.0F);
        this.body5.addChild(legright6);
        this.setRotateAngle(legright6, -0.1309F, 0.5672F, -0.5323F);
        this.legright6.cubeList.add(new ModelBox(legright6, -1, 19, -1.85F, 0.0F, -0.5F, 2, 0, 1, 0.0F, false));

        this.legleft6 = new AdvancedModelRenderer(this);
        this.legleft6.setRotationPoint(1.3F, 0.475F, 2.0F);
        this.body5.addChild(legleft6);
        this.setRotateAngle(legleft6, -0.1309F, -0.5672F, 0.5323F);
        this.legleft6.cubeList.add(new ModelBox(legleft6, -1, 19, -0.15F, 0.0F, -0.5F, 2, 0, 1, 0.0F, true));

        this.body6 = new AdvancedModelRenderer(this);
        this.body6.setRotationPoint(0.0F, 0.025F, 2.5F);
        this.body5.addChild(body6);
        this.setRotateAngle(body6, -0.1047F, 0.0F, 0.0F);
        this.body6.cubeList.add(new ModelBox(body6, 10, 7, -1.0F, -0.5F, 0.0F, 2, 1, 2, 0.01F, false));

        this.body7 = new AdvancedModelRenderer(this);
        this.body7.setRotationPoint(0.0F, 0.0F, 1.5F);
        this.body6.addChild(body7);
        this.body7.cubeList.add(new ModelBox(body7, 10, 10, -1.0F, -0.5F, 0.0F, 2, 1, 2, 0.0F, false));

        this.body8 = new AdvancedModelRenderer(this);
        this.body8.setRotationPoint(0.0F, 0.0F, 1.75F);
        this.body7.addChild(body8);
        this.body8.cubeList.add(new ModelBox(body8, 6, 17, -1.0F, -0.5F, 0.0F, 2, 1, 1, -0.01F, false));
        this.body8.cubeList.add(new ModelBox(body8, 10, 3, -0.5F, -0.5F, 0.6F, 1, 1, 3, -0.02F, false));

        updateDefaultPose();
    }

    @Override
    public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        //setRotationAngles(f, f1, f2, f3, f4, f5, entity);
        //this.Bodyfront.render(0.5F);
        //this.leg2R_r1.defaultRotationZ = -0.6109F;
        //this.leg2L_r1.defaultRotationZ = 0.6109F;
        this.body.render(f5);

    }
    public void renderStaticFloor(float f) {
        this.body.offsetZ = 0.02F;
        this.body.offsetY = 0.03F;
        this.body.render(0.01F);
        resetToDefaultPose();
    }

    @Override
    public void renderStaticBook(float f) {
        //Rotations, positions and sizing:
        this.body.offsetY = -0.8F;
        this.body.offsetX = 1.6F;
        this.body.offsetZ = 2.0F;
        this.body.rotateAngleY = (float) Math.toRadians(205);
        this.body.rotateAngleX = (float) Math.toRadians(25);
        this.body.rotateAngleZ = (float) Math.toRadians(-4);
        this.body.scaleChildren = true;
        float scaler = 6.0F;
        this.body.setScale(scaler, scaler, scaler);
        //Start of pose:
        this.setRotateAngle(body, 0.6F, 3.8F, -0.2F);

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
       // this.body.offsetY = 1.0F;

        AdvancedModelRenderer[] fishTail = {this.body6, this.body7, this.body8};
        AdvancedModelRenderer[] legsL = {this.legleft, this.legleft2, this.legleft3, this.legleft4, this.legleft5, this.legleft6};
        AdvancedModelRenderer[] legsR = {this.legright, this.legright2, this.legright3, this.legright4, this.legright5, this.legright6};

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
        this.swing(antennaleft, 0.5F, -0.2F, false, 0, -0.1F, f2, 0.8F);
        this.swing(antennaright, 0.5F, 0.2F, false, 0, 0.1F, f2, 0.8F);

        //Legs:
        if (f3 != 0.0F) {
            this.chainWave(legsL, 0.2F, 0.2F, -3, f2, 1);
            this.chainWave(legsR, 0.6F, 0.2F, -3, f2, 1);
            this.flap(legleft, 0.5F, -0.5F, false, 0, 0.3F, f2, 0.3F);
            this.flap(legright, 0.5F, 0.5F, false, 0, -0.3F, f2, 0.3F);
            this.flap(legleft2, 0.5F, -0.5F, false, 1.0F, 0.3F, f2, 0.3F);
            this.flap(legright2, 0.5F, 0.5F, false, 1.0F, -0.3F, f2, 0.3F);
            this.flap(legleft3, 0.5F, -0.5F, false, 2.0F, 0.3F, f2, 0.3F);
            this.flap(legright3, 0.5F, 0.5F, false, 2.0F, -0.3F, f2, 0.3F);
            this.flap(legleft4, 0.5F, -0.5F, false, 3.0F, 0.3F, f2, 0.3F);
            this.flap(legright4, 0.5F, 0.5F, false, 3.0F, -0.3F, f2, 0.3F);
            this.flap(legleft5, 0.5F, -0.5F, false, 4.0F, 0.3F, f2, 0.3F);
            this.flap(legright5, 0.5F, 0.5F, false, 4.0F, -0.3F, f2, 0.3F);
            this.flap(legleft6, 0.5F, -0.5F, false, 3.0F, 0.3F, f2, 0.3F);
            this.flap(legright6, 0.5F, 0.5F, false, 3.0F, -0.3F, f2, 0.3F);


        }

        if (e instanceof EntityLiving && !((EntityLiving) e).isAIDisabled()) {
            this.chainWave(fishTail, speed, tailVdegree * 0.3f, -3, f2, 1);
            this.chainSwing(fishTail, speed, tailHdegree, -2.5, f2, tailSwing);

            //this.swing(body, speed, 0.3F, true, 0, 0, f2, 1);
            if (!isAtBottom && e.isInWater()) {
                this.bob(body, -speed, 1.5F, false, f2, 2);
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
