package net.lepidodendron.entity.model.entity;

import net.ilexiconn.llibrary.client.model.tools.AdvancedModelRenderer;
import net.lepidodendron.entity.EntityPrehistoricFloraCancrinos;
import net.lepidodendron.entity.model.ModelBasePalaeopedia;
import net.minecraft.block.material.Material;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;
import net.minecraft.util.math.BlockPos;

public class ModelCancrinos extends ModelBasePalaeopedia {
    private final AdvancedModelRenderer body;
    private final AdvancedModelRenderer cube_r1;
    private final AdvancedModelRenderer cube_r2;
    private final AdvancedModelRenderer legR;
    private final AdvancedModelRenderer legL;
    private final AdvancedModelRenderer legR2;
    private final AdvancedModelRenderer legL2;
    private final AdvancedModelRenderer legR3;
    private final AdvancedModelRenderer legL3;
    private final AdvancedModelRenderer legR4;
    private final AdvancedModelRenderer legL4;
    private final AdvancedModelRenderer legR5;
    private final AdvancedModelRenderer legL5;
    private final AdvancedModelRenderer body2;
    private final AdvancedModelRenderer body3;
    private final AdvancedModelRenderer cube_r3;
    private final AdvancedModelRenderer cube_r4;
    private final AdvancedModelRenderer antennaR;
    private final AdvancedModelRenderer cube_r5;
    private final AdvancedModelRenderer cube_r6;
    private final AdvancedModelRenderer antennaL;
    private final AdvancedModelRenderer cube_r7;
    private final AdvancedModelRenderer cube_r8;
    private final AdvancedModelRenderer antennaR2;
    private final AdvancedModelRenderer antennaL2;

    public ModelCancrinos() {
        this.textureWidth = 32;
        this.textureHeight = 32;

        this.body = new AdvancedModelRenderer(this);
        this.body.setRotationPoint(0.0F, 23.25F, 0.0F);
        this.body.cubeList.add(new ModelBox(body, 0, 0, -2.0F, -1.0F, 0.0F, 4, 1, 3, 0.01F, false));
        this.body.cubeList.add(new ModelBox(body, 0, 8, -1.5F, -1.0F, -1.5F, 3, 1, 2, 0.0F, false));

        this.cube_r1 = new AdvancedModelRenderer(this);
        this.cube_r1.setRotationPoint(1.0F, 0.0F, -1.5F);
        this.body.addChild(cube_r1);
        this.setRotateAngle(cube_r1, 0.0F, 0.0F, -0.6981F);
        this.cube_r1.cubeList.add(new ModelBox(cube_r1, 0, 1, 0.35F, -1.0F, -0.575F, 0, 1, 1, 0.0F, true));

        this.cube_r2 = new AdvancedModelRenderer(this);
        this.cube_r2.setRotationPoint(-1.0F, 0.0F, -1.5F);
        this.body.addChild(cube_r2);
        this.setRotateAngle(cube_r2, 0.0F, 0.0F, 0.6981F);
        this.cube_r2.cubeList.add(new ModelBox(cube_r2, 0, 1, -0.35F, -1.0F, -0.575F, 0, 1, 1, 0.0F, false));

        this.legR = new AdvancedModelRenderer(this);
        this.legR.setRotationPoint(-1.5F, 0.0F, -0.25F);
        this.body.addChild(legR);
        this.setRotateAngle(legR, -0.4363F, -0.9599F, 0.3054F);
        this.legR.cubeList.add(new ModelBox(legR, 8, 12, -4.0F, -0.5F, 0.0F, 4, 2, 0, 0.0F, false));

        this.legL = new AdvancedModelRenderer(this);
        this.legL.setRotationPoint(1.5F, 0.0F, -0.25F);
        this.body.addChild(legL);
        this.setRotateAngle(legL, -0.4363F, 0.9599F, -0.3054F);
        this.legL.cubeList.add(new ModelBox(legL, 8, 12, 0.0F, -0.5F, 0.0F, 4, 2, 0, 0.0F, true));

        this.legR2 = new AdvancedModelRenderer(this);
        this.legR2.setRotationPoint(-2.0F, 0.0F, 0.5F);
        this.body.addChild(legR2);
        this.setRotateAngle(legR2, -0.2618F, -0.48F, 0.2182F);
        this.legR2.cubeList.add(new ModelBox(legR2, 12, 7, -4.0F, -0.5F, 0.0F, 4, 2, 0, 0.0F, false));

        this.legL2 = new AdvancedModelRenderer(this);
        this.legL2.setRotationPoint(2.0F, 0.0F, 0.5F);
        this.body.addChild(legL2);
        this.setRotateAngle(legL2, -0.2618F, 0.48F, -0.2182F);
        this.legL2.cubeList.add(new ModelBox(legL2, 12, 7, 0.0F, -0.5F, 0.0F, 4, 2, 0, 0.0F, true));

        this.legR3 = new AdvancedModelRenderer(this);
        this.legR3.setRotationPoint(-2.0F, 0.0F, 1.5F);
        this.body.addChild(legR3);
        this.setRotateAngle(legR3, -0.1745F, 0.0F, 0.2182F);
        this.legR3.cubeList.add(new ModelBox(legR3, 0, 11, -3.5F, -0.5F, 0.0F, 4, 2, 0, 0.0F, false));

        this.legL3 = new AdvancedModelRenderer(this);
        this.legL3.setRotationPoint(2.0F, 0.0F, 1.5F);
        this.body.addChild(legL3);
        this.setRotateAngle(legL3, -0.1745F, 0.0F, -0.2182F);
        this.legL3.cubeList.add(new ModelBox(legL3, 0, 11, -0.5F, -0.5F, 0.0F, 4, 2, 0, 0.0F, true));

        this.legR4 = new AdvancedModelRenderer(this);
        this.legR4.setRotationPoint(-2.0F, 0.0F, 2.5F);
        this.body.addChild(legR4);
        this.setRotateAngle(legR4, -0.1745F, 0.2618F, 0.2618F);
        this.legR4.cubeList.add(new ModelBox(legR4, 0, 14, -2.75F, -0.5F, 0.0F, 3, 2, 0, 0.0F, false));

        this.legL4 = new AdvancedModelRenderer(this);
        this.legL4.setRotationPoint(2.0F, 0.0F, 2.5F);
        this.body.addChild(legL4);
        this.setRotateAngle(legL4, -0.1745F, -0.2618F, -0.2618F);
        this.legL4.cubeList.add(new ModelBox(legL4, 0, 14, -0.25F, -0.5F, 0.0F, 3, 2, 0, 0.0F, true));

        this.legR5 = new AdvancedModelRenderer(this);
        this.legR5.setRotationPoint(-1.5F, 0.0F, 3.0F);
        this.body.addChild(legR5);
        this.setRotateAngle(legR5, -0.1745F, 0.6545F, 0.3054F);
        this.legR5.cubeList.add(new ModelBox(legR5, 13, 4, -2.75F, -0.5F, 0.0F, 3, 2, 0, 0.0F, false));

        this.legL5 = new AdvancedModelRenderer(this);
        this.legL5.setRotationPoint(1.5F, 0.0F, 3.0F);
        this.body.addChild(legL5);
        this.setRotateAngle(legL5, -0.1745F, -0.6545F, -0.3054F);
        this.legL5.cubeList.add(new ModelBox(legL5, 13, 4, -0.25F, -0.5F, 0.0F, 3, 2, 0, 0.0F, true));

        this.body2 = new AdvancedModelRenderer(this);
        this.body2.setRotationPoint(0.0F, 0.0F, 3.0F);
        this.body.addChild(body2);
        this.setRotateAngle(body2, -0.0873F, 0.0F, 0.0F);
        this.body2.cubeList.add(new ModelBox(body2, 0, 4, -1.5F, -0.75F, -1.0F, 3, 1, 3, 0.0F, false));

        this.body3 = new AdvancedModelRenderer(this);
        this.body3.setRotationPoint(0.0F, -0.75F, 2.0F);
        this.body2.addChild(body3);
        this.setRotateAngle(body3, -0.1309F, 0.0F, 0.0F);
        this.body3.cubeList.add(new ModelBox(body3, 8, 9, -1.0F, 0.0F, 0.0F, 2, 1, 2, 0.0F, false));

        this.cube_r3 = new AdvancedModelRenderer(this);
        this.cube_r3.setRotationPoint(1.0F, 0.75F, 2.15F);
        this.body3.addChild(cube_r3);
        this.setRotateAngle(cube_r3, 0.0F, -0.7854F, 0.0F);
        this.cube_r3.cubeList.add(new ModelBox(cube_r3, 0, 0, -0.5F, 0.0F, -0.4F, 1, 0, 1, 0.0F, true));

        this.cube_r4 = new AdvancedModelRenderer(this);
        this.cube_r4.setRotationPoint(-1.0F, 0.75F, 2.15F);
        this.body3.addChild(cube_r4);
        this.setRotateAngle(cube_r4, 0.0F, 0.7854F, 0.0F);
        this.cube_r4.cubeList.add(new ModelBox(cube_r4, 0, 0, -0.5F, 0.0F, -0.4F, 1, 0, 1, 0.0F, false));

        this.antennaR = new AdvancedModelRenderer(this);
        this.antennaR.setRotationPoint(-1.0F, -0.25F, -1.75F);
        this.body.addChild(antennaR);
        this.setRotateAngle(antennaR, 0.0873F, 0.0873F, 0.0F);
        this.antennaR.cubeList.add(new ModelBox(antennaR, 10, 0, -0.25F, 0.0F, -2.0F, 1, 0, 3, 0.0F, false));

        this.cube_r5 = new AdvancedModelRenderer(this);
        this.cube_r5.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.antennaR.addChild(cube_r5);
        this.setRotateAngle(cube_r5, 0.0F, 0.3491F, 0.0F);
        this.cube_r5.cubeList.add(new ModelBox(cube_r5, 8, 0, -0.525F, -0.01F, -1.975F, 1, 0, 3, 0.0F, false));

        this.cube_r6 = new AdvancedModelRenderer(this);
        this.cube_r6.setRotationPoint(-0.25F, 0.5F, -2.0F);
        this.antennaR.addChild(cube_r6);
        this.setRotateAngle(cube_r6, 0.0F, 0.1309F, 0.0F);
        this.cube_r6.cubeList.add(new ModelBox(cube_r6, 0, 1, -0.5F, -0.49F, -3.75F, 1, 0, 1, 0.0F, false));
        this.cube_r6.cubeList.add(new ModelBox(cube_r6, 6, 4, -1.0F, -0.49F, -2.75F, 2, 0, 3, 0.0F, false));

        this.antennaL = new AdvancedModelRenderer(this);
        this.antennaL.setRotationPoint(1.0F, -0.25F, -1.75F);
        this.body.addChild(antennaL);
        this.setRotateAngle(antennaL, 0.0873F, -0.0873F, 0.0F);
        this.antennaL.cubeList.add(new ModelBox(antennaL, 10, 0, -0.75F, 0.0F, -2.0F, 1, 0, 3, 0.0F, true));

        this.cube_r7 = new AdvancedModelRenderer(this);
        this.cube_r7.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.antennaL.addChild(cube_r7);
        this.setRotateAngle(cube_r7, 0.0F, -0.3491F, 0.0F);
        this.cube_r7.cubeList.add(new ModelBox(cube_r7, 8, 0, -0.475F, -0.01F, -1.975F, 1, 0, 3, 0.0F, true));

        this.cube_r8 = new AdvancedModelRenderer(this);
        this.cube_r8.setRotationPoint(0.25F, 0.5F, -2.0F);
        this.antennaL.addChild(cube_r8);
        this.setRotateAngle(cube_r8, 0.0F, -0.1309F, 0.0F);
        this.cube_r8.cubeList.add(new ModelBox(cube_r8, 0, 1, -0.5F, -0.49F, -3.75F, 1, 0, 1, 0.0F, true));
        this.cube_r8.cubeList.add(new ModelBox(cube_r8, 6, 4, -1.0F, -0.49F, -2.75F, 2, 0, 3, 0.0F, true));

        this.antennaR2 = new AdvancedModelRenderer(this);
        this.antennaR2.setRotationPoint(-0.1F, 0.0F, -1.5F);
        this.body.addChild(antennaR2);
        this.setRotateAngle(antennaR2, 0.0F, 0.1309F, 0.0873F);
        this.antennaR2.cubeList.add(new ModelBox(antennaR2, 0, 10, 0.0F, -1.0F, -2.0F, 0, 1, 3, 0.0F, false));

        this.antennaL2 = new AdvancedModelRenderer(this);
        this.antennaL2.setRotationPoint(0.1F, 0.0F, -1.5F);
        this.body.addChild(antennaL2);
        this.setRotateAngle(antennaL2, 0.0F, -0.1309F, -0.0873F);
        this.antennaL2.cubeList.add(new ModelBox(antennaL2, 0, 10, 0.0F, -1.0F, -2.0F, 0, 1, 3, 0.0F, true));

        updateDefaultPose();
    }

    @Override
    public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        this.body.render(f5);
    }
    public void renderStaticFloor(float f) {
        this.setRotateAngle(body, 0.0F, 0.0F, 0.0F);
        this.setRotateAngle(body2, 0.0F, 0.0F, 0.0F);
        this.setRotateAngle(body3, -0.3F, 0.0F, 0.0F);
        this.body.offsetY = 0.04F;
        this.body.render(0.01F);
        resetToDefaultPose();
    }

    @Override
    public void renderStaticBook(float f) {

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
        //this.Isotelus.offsetY = 0.65F;

        boolean isAtBottom = false;
        if (e.getPosition().getY() - 1 > 1) {
            BlockPos pos = new BlockPos(e.getPosition().getX(), e.getPosition().getY() - 1, e.getPosition().getZ());
            isAtBottom = ((e.isInsideOfMaterial(Material.WATER) || e.isInsideOfMaterial(Material.CORAL))
                    && ((e.world.getBlockState(pos)).getMaterial() != Material.WATER)
                    && ((double)e.getPosition().getY() + 0.334D) > e.posY);
        }

        EntityPrehistoricFloraCancrinos cancr = (EntityPrehistoricFloraCancrinos)e;

        AdvancedModelRenderer[] legsL = {this.legL, this.legL2, this.legL3, this.legL4, this.legL5};
        AdvancedModelRenderer[] legsR = {this.legR, this.legR2, this.legR3, this.legR4, this.legR5};
        AdvancedModelRenderer[] tail = {this.body2, this.body3};

        if (isAtBottom ) {
            if(cancr.getIsMoving()) {
                this.chainSwing(legsL, 0.2F, 0.2F, -3, f2, 1);
                this.chainSwing(legsR, 0.2F, 0.2F, -3, f2, 1);
                this.flap(legL, 0.2F, -0.5F, true, 0, -0.5F, f2, 0.3F);
                this.flap(legR, 0.2F, 0.5F, true, 0, 0.5F, f2, 0.3F);
                this.flap(legL2, 0.2F, -0.5F, true, 1.0F, -0.5F, f2, 0.3F);
                this.flap(legR2, 0.2F, 0.5F, true, 1.0F, 0.5F, f2, 0.3F);
                this.flap(legL3, 0.2F, -0.5F, true, 2.0F, -0.5F, f2, 0.3F);
                this.flap(legR3, 0.2F, 0.5F, true, 2.0F, 0.5F, f2, 0.3F);
                this.flap(legL4, 0.2F, -0.5F, true, 3.0F, -0.5F, f2, 0.3F);
                this.flap(legR4, 0.2F, 0.5F, true, 3.0F, 0.5F, f2, 0.3F);
                this.flap(legL5, 0.2F, -0.5F, true, 4.0F, -0.5F, f2, 0.3F);
                this.flap(legR5, 0.2F, 0.5F, true, 4.0F, 0.5F, f2, 0.3F);
                this.chainSwing(tail, 0.1F, 0.1F, -3, f2, 1.0F);
                this.chainWave(tail, 0.1F, 0.0f, -3, f2, 0F);
                this.bob(body, 0.0F, 0.0F, true, f2, 1);
            } else {
                this.chainSwing(tail, 0.1F, 0.1F, -3, f2, 1.0F);
                this.chainWave(tail, 0.1F, 0.0f, -3, f2, 0F);
            }
        } else {
            this.chainWave(legsL, 0.2F, 0.2F, -3, f2, 1);
            this.chainWave(legsR, 0.25F, 0.2F, -3, f2, 1);
            this.flap(legL, 0.2F, -0.5F, true, 0, -0.5F, f2, 0.3F);
            this.flap(legR, 0.2F, 0.5F, true, 0, 0.5F, f2, 0.3F);
            this.flap(legL2, 0.2F, -0.5F, true, 1.0F, -0.5F, f2, 0.3F);
            this.flap(legR2, 0.2F, 0.5F, true, 1.0F, 0.5F, f2, 0.3F);
            this.flap(legL3, 0.2F, -0.5F, true, 2.0F, -0.5F, f2, 0.3F);
            this.flap(legR3, 0.2F, 0.5F, true, 2.0F, 0.5F, f2, 0.3F);
            this.flap(legL4, 0.2F, -0.5F, true, 3.0F, -0.5F, f2, 0.3F);
            this.flap(legR4, 0.2F, 0.5F, true, 3.0F, 0.5F, f2, 0.3F);
            this.flap(legL5, 0.2F, -0.5F, true, 4.0F, -0.5F, f2, 0.3F);
            this.flap(legR5, 0.2F, 0.5F, true, 4.0F, 0.5F, f2, 0.3F);
            this.chainSwing(tail, 0.2F, 0.05F, -3, f2, 0.5F);
            this.chainWave(tail, 0.4F, 0.07f, -3, f2, 0.8F);
            this.bob(body, 0.2F, 0.2F, true, f2, 1);
        }

        this.swing(antennaL, 0.3F, -0.2F, false, 0, -0.1F, f2, 0.8F);
        this.swing(antennaR, 0.3F, 0.2F, false, 0, 0.1F, f2, 0.8F);
        this.swing(antennaL2, 0.3F, -0.2F, false, 0, -0.1F, f2, 0.8F);
        this.swing(antennaR2, 0.3F, 0.2F, false, 0, 0.1F, f2, 0.8F);

    }
}
