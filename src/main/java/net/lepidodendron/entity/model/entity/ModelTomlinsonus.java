package net.lepidodendron.entity.model.entity;

import net.ilexiconn.llibrary.client.model.tools.AdvancedModelBase;
import net.ilexiconn.llibrary.client.model.tools.AdvancedModelRenderer;
import net.minecraft.block.material.Material;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLiving;
import net.minecraft.util.math.BlockPos;

public class ModelTomlinsonus extends AdvancedModelBase {
    private final AdvancedModelRenderer body;
    private final AdvancedModelRenderer legR17;
    private final AdvancedModelRenderer legR16;
    private final AdvancedModelRenderer legR15;
    private final AdvancedModelRenderer legR14;
    private final AdvancedModelRenderer legR13;
    private final AdvancedModelRenderer legR12;
    private final AdvancedModelRenderer legR11;
    private final AdvancedModelRenderer legR10;
    private final AdvancedModelRenderer legR9;
    private final AdvancedModelRenderer legR8;
    private final AdvancedModelRenderer legR7;
    private final AdvancedModelRenderer legR6;
    private final AdvancedModelRenderer legR5;
    private final AdvancedModelRenderer legR4;
    private final AdvancedModelRenderer legR3;
    private final AdvancedModelRenderer legR2;
    private final AdvancedModelRenderer legR1;
    private final AdvancedModelRenderer legL17;
    private final AdvancedModelRenderer legL16;
    private final AdvancedModelRenderer legL15;
    private final AdvancedModelRenderer legL14;
    private final AdvancedModelRenderer legL13;
    private final AdvancedModelRenderer legL12;
    private final AdvancedModelRenderer legL11;
    private final AdvancedModelRenderer legL10;
    private final AdvancedModelRenderer legL9;
    private final AdvancedModelRenderer legL8;
    private final AdvancedModelRenderer legL7;
    private final AdvancedModelRenderer legL6;
    private final AdvancedModelRenderer legL5;
    private final AdvancedModelRenderer legL4;
    private final AdvancedModelRenderer legL3;
    private final AdvancedModelRenderer legL2;
    private final AdvancedModelRenderer legL1;
    private final AdvancedModelRenderer frontlegL;
    private final AdvancedModelRenderer frontlegR;
    private final AdvancedModelRenderer frontlegL2;
    private final AdvancedModelRenderer frontlegR2;
    private final AdvancedModelRenderer antennaL2;
    private final AdvancedModelRenderer antennaL;


    public ModelTomlinsonus() {
        this.textureWidth = 64;
        this.textureHeight = 64;

        this.body = new AdvancedModelRenderer(this);
        this.body.setRotationPoint(0.0F, 24.0F, 6.0F);
        this.body.cubeList.add(new ModelBox(body, 2, 32, 1.0F, -4.0F, -11.5F, 7, 0, 9, 0.0F, false));
        this.body.cubeList.add(new ModelBox(body, 2, 32, -8.0F, -4.0F, -11.5F, 7, 0, 9, 0.0F, true));
        this.body.cubeList.add(new ModelBox(body, 0, 42, -1.5F, -4.5F, -8.75F, 3, 2, 3, 0.0F, false));
        this.body.cubeList.add(new ModelBox(body, 0, 13, -0.5F, -3.85F, -6.0F, 1, 1, 7, 0.0F, false));

        this.legR17 = new AdvancedModelRenderer(this);
        this.legR17.setRotationPoint(-0.5F, -3.25F, 0.9F);
        this.body.addChild(legR17);
        this.legR17.cubeList.add(new ModelBox(legR17, 4, 18, -1.0F, 0.0F, 0.0F, 1, 2, 0, 0.0F, false));
        this.legR17.cubeList.add(new ModelBox(legR17, 23, 19, -1.0F, -0.6F, -0.1F, 1, 1, 0, 0.0F, false));

        this.legR16 = new AdvancedModelRenderer(this);
        this.legR16.setRotationPoint(-0.5F, -3.25F, 0.75F);
        this.body.addChild(legR16);


        this.legR15 = new AdvancedModelRenderer(this);
        this.legR15.setRotationPoint(-0.5F, -3.25F, 0.5F);
        this.body.addChild(legR15);
        this.legR15.cubeList.add(new ModelBox(legR15, 4, 29, -1.0F, 0.0F, 0.0F, 1, 2, 0, 0.0F, false));
        this.legR15.cubeList.add(new ModelBox(legR15, 12, 29, -1.0F, -0.6F, -0.1F, 1, 1, 0, 0.0F, false));

        this.legR14 = new AdvancedModelRenderer(this);
        this.legR14.setRotationPoint(-0.5F, -3.25F, 0.25F);
        this.body.addChild(legR14);


        this.legR13 = new AdvancedModelRenderer(this);
        this.legR13.setRotationPoint(-0.5F, -3.25F, 0.0F);
        this.body.addChild(legR13);
        this.legR13.cubeList.add(new ModelBox(legR13, 12, 21, -2.0F, 0.0F, 0.0F, 2, 2, 0, 0.0F, false));
        this.legR13.cubeList.add(new ModelBox(legR13, 16, 29, -1.0F, -0.6F, -0.1F, 1, 1, 0, 0.0F, false));

        this.legR12 = new AdvancedModelRenderer(this);
        this.legR12.setRotationPoint(-0.5F, -3.25F, -0.25F);
        this.body.addChild(legR12);


        this.legR11 = new AdvancedModelRenderer(this);
        this.legR11.setRotationPoint(-0.5F, -3.25F, -0.5F);
        this.body.addChild(legR11);
        this.legR11.cubeList.add(new ModelBox(legR11, 12, 25, -2.0F, 0.0F, 0.0F, 2, 2, 0, 0.0F, false));
        this.legR11.cubeList.add(new ModelBox(legR11, 26, 21, -1.25F, -0.6F, -0.1F, 2, 1, 0, 0.0F, false));

        this.legR10 = new AdvancedModelRenderer(this);
        this.legR10.setRotationPoint(-0.5F, -3.25F, -0.75F);
        this.body.addChild(legR10);


        this.legR9 = new AdvancedModelRenderer(this);
        this.legR9.setRotationPoint(-0.5F, -3.25F, -1.0F);
        this.body.addChild(legR9);
        this.legR9.cubeList.add(new ModelBox(legR9, 26, 5, -2.0F, 0.0F, 0.0F, 2, 2, 0, 0.0F, false));
        this.legR9.cubeList.add(new ModelBox(legR9, 24, 26, -1.5F, -0.6F, -0.1F, 2, 1, 0, 0.0F, false));

        this.legR8 = new AdvancedModelRenderer(this);
        this.legR8.setRotationPoint(-0.5F, -3.25F, -1.25F);
        this.body.addChild(legR8);


        this.legR7 = new AdvancedModelRenderer(this);
        this.legR7.setRotationPoint(-0.5F, -3.25F, -1.75F);
        this.body.addChild(legR7);
        this.legR7.cubeList.add(new ModelBox(legR7, 4, 24, -2.0F, 0.0F, 0.0F, 2, 3, 0, 0.0F, false));
        this.legR7.cubeList.add(new ModelBox(legR7, 4, 27, -1.75F, -0.6F, -0.1F, 2, 1, 0, 0.0F, false));

        this.legR6 = new AdvancedModelRenderer(this);
        this.legR6.setRotationPoint(-0.5F, -3.25F, -2.25F);
        this.body.addChild(legR6);
        this.legR6.cubeList.add(new ModelBox(legR6, 0, 0, -3.0F, 0.0F, 0.0F, 3, 3, 0, 0.0F, false));
        this.legR6.cubeList.add(new ModelBox(legR6, 8, 28, -2.0F, -0.6F, -0.1F, 2, 1, 0, 0.0F, false));

        this.legR5 = new AdvancedModelRenderer(this);
        this.legR5.setRotationPoint(-0.5F, -3.25F, -3.0F);
        this.body.addChild(legR5);
        this.legR5.cubeList.add(new ModelBox(legR5, 0, 3, -3.0F, 0.0F, 0.0F, 3, 3, 0, 0.0F, false));
        this.legR5.cubeList.add(new ModelBox(legR5, 12, 28, -2.0F, -0.6F, -0.1F, 2, 1, 0, 0.0F, false));

        this.legR4 = new AdvancedModelRenderer(this);
        this.legR4.setRotationPoint(-0.5F, -3.25F, -3.75F);
        this.body.addChild(legR4);
        this.legR4.cubeList.add(new ModelBox(legR4, 0, 6, -3.0F, 0.0F, 0.0F, 3, 3, 0, 0.0F, false));
        this.legR4.cubeList.add(new ModelBox(legR4, 16, 28, -2.0F, -0.6F, -0.1F, 2, 1, 0, 0.0F, false));

        this.legR3 = new AdvancedModelRenderer(this);
        this.legR3.setRotationPoint(-0.5F, -3.25F, -4.4F);
        this.body.addChild(legR3);
        this.legR3.cubeList.add(new ModelBox(legR3, 0, 9, -3.0F, 0.0F, 0.0F, 3, 3, 0, 0.0F, false));
        this.legR3.cubeList.add(new ModelBox(legR3, 20, 28, -2.0F, -0.6F, -0.1F, 2, 1, 0, 0.0F, false));

        this.legR2 = new AdvancedModelRenderer(this);
        this.legR2.setRotationPoint(-0.5F, -3.25F, -5.0F);
        this.body.addChild(legR2);
        this.legR2.cubeList.add(new ModelBox(legR2, 0, 12, -3.0F, 0.0F, 0.0F, 3, 3, 0, 0.0F, false));
        this.legR2.cubeList.add(new ModelBox(legR2, 24, 28, -2.0F, -0.6F, -0.1F, 2, 1, 0, 0.0F, false));

        this.legR1 = new AdvancedModelRenderer(this);
        this.legR1.setRotationPoint(-0.5F, -3.25F, -5.5F);
        this.body.addChild(legR1);
        this.legR1.cubeList.add(new ModelBox(legR1, 9, 13, -3.0F, 0.0F, 0.0F, 3, 3, 0, 0.0F, false));
        this.legR1.cubeList.add(new ModelBox(legR1, 28, 26, -2.0F, -0.6F, -0.1F, 2, 1, 0, 0.0F, false));

        this.legL17 = new AdvancedModelRenderer(this);
        this.legL17.setRotationPoint(0.5F, -3.25F, 0.9F);
        this.body.addChild(legL17);
        this.legL17.cubeList.add(new ModelBox(legL17, 6, 29, 0.0F, 0.0F, 0.0F, 1, 2, 0, 0.0F, false));
        this.legL17.cubeList.add(new ModelBox(legL17, 29, 16, 0.0F, -0.6F, -0.1F, 1, 1, 0, 0.0F, false));

        this.legL16 = new AdvancedModelRenderer(this);
        this.legL16.setRotationPoint(0.5F, -3.25F, 0.75F);
        this.body.addChild(legL16);


        this.legL15 = new AdvancedModelRenderer(this);
        this.legL15.setRotationPoint(0.5F, -3.25F, 0.5F);
        this.body.addChild(legL15);
        this.legL15.cubeList.add(new ModelBox(legL15, 10, 29, 0.0F, 0.0F, 0.0F, 1, 2, 0, 0.0F, false));
        this.legL15.cubeList.add(new ModelBox(legL15, 18, 29, 0.0F, -0.6F, -0.1F, 1, 1, 0, 0.0F, false));

        this.legL14 = new AdvancedModelRenderer(this);
        this.legL14.setRotationPoint(0.5F, -3.25F, 0.25F);
        this.body.addChild(legL14);


        this.legL13 = new AdvancedModelRenderer(this);
        this.legL13.setRotationPoint(0.5F, -3.25F, 0.0F);
        this.body.addChild(legL13);
        this.legL13.cubeList.add(new ModelBox(legL13, 26, 9, 0.0F, 0.0F, 0.0F, 2, 2, 0, 0.0F, false));
        this.legL13.cubeList.add(new ModelBox(legL13, 20, 29, 0.0F, -0.6F, -0.1F, 1, 1, 0, 0.0F, false));

        this.legL12 = new AdvancedModelRenderer(this);
        this.legL12.setRotationPoint(0.5F, -3.25F, -0.25F);
        this.body.addChild(legL12);


        this.legL11 = new AdvancedModelRenderer(this);
        this.legL11.setRotationPoint(0.5F, -3.25F, -0.5F);
        this.body.addChild(legL11);
        this.legL11.cubeList.add(new ModelBox(legL11, 26, 13, 0.0F, 0.0F, 0.0F, 2, 2, 0, 0.0F, false));
        this.legL11.cubeList.add(new ModelBox(legL11, 12, 27, -0.75F, -0.6F, -0.1F, 2, 1, 0, 0.0F, false));

        this.legL10 = new AdvancedModelRenderer(this);
        this.legL10.setRotationPoint(0.5F, -3.25F, -0.75F);
        this.body.addChild(legL10);


        this.legL9 = new AdvancedModelRenderer(this);
        this.legL9.setRotationPoint(0.5F, -3.25F, -1.0F);
        this.body.addChild(legL9);
        this.legL9.cubeList.add(new ModelBox(legL9, 20, 26, 0.0F, 0.0F, 0.0F, 2, 2, 0, 0.0F, false));
        this.legL9.cubeList.add(new ModelBox(legL9, 24, 27, -0.5F, -0.6F, -0.1F, 2, 1, 0, 0.0F, false));

        this.legL8 = new AdvancedModelRenderer(this);
        this.legL8.setRotationPoint(0.5F, -3.25F, -1.25F);
        this.body.addChild(legL8);


        this.legL7 = new AdvancedModelRenderer(this);
        this.legL7.setRotationPoint(0.5F, -3.25F, -1.75F);
        this.body.addChild(legL7);
        this.legL7.cubeList.add(new ModelBox(legL7, 25, 0, 0.0F, 0.0F, 0.0F, 2, 3, 0, 0.0F, false));
        this.legL7.cubeList.add(new ModelBox(legL7, 4, 28, -0.25F, -0.6F, -0.1F, 2, 1, 0, 0.0F, false));

        this.legL6 = new AdvancedModelRenderer(this);
        this.legL6.setRotationPoint(0.5F, -3.25F, -2.25F);
        this.body.addChild(legL6);
        this.legL6.cubeList.add(new ModelBox(legL6, 0, 15, 0.0F, 0.0F, 0.0F, 3, 3, 0, 0.0F, false));
        this.legL6.cubeList.add(new ModelBox(legL6, 28, 27, 0.0F, -0.6F, -0.1F, 2, 1, 0, 0.0F, false));

        this.legL5 = new AdvancedModelRenderer(this);
        this.legL5.setRotationPoint(0.5F, -3.25F, -3.0F);
        this.body.addChild(legL5);
        this.legL5.cubeList.add(new ModelBox(legL5, 20, 20, 0.0F, 0.0F, 0.0F, 3, 3, 0, 0.0F, false));
        this.legL5.cubeList.add(new ModelBox(legL5, 28, 28, 0.0F, -0.6F, -0.1F, 2, 1, 0, 0.0F, false));

        this.legL4 = new AdvancedModelRenderer(this);
        this.legL4.setRotationPoint(0.5F, -3.25F, -3.75F);
        this.body.addChild(legL4);
        this.legL4.cubeList.add(new ModelBox(legL4, 0, 21, 0.0F, 0.0F, 0.0F, 3, 3, 0, 0.0F, false));
        this.legL4.cubeList.add(new ModelBox(legL4, 0, 29, 0.0F, -0.6F, -0.1F, 2, 1, 0, 0.0F, false));

        this.legL3 = new AdvancedModelRenderer(this);
        this.legL3.setRotationPoint(0.5F, -3.25F, -4.4F);
        this.body.addChild(legL3);
        this.legL3.cubeList.add(new ModelBox(legL3, 6, 21, 0.0F, 0.0F, 0.0F, 3, 3, 0, 0.0F, false));
        this.legL3.cubeList.add(new ModelBox(legL3, 29, 0, 0.0F, -0.6F, -0.1F, 2, 1, 0, 0.0F, false));

        this.legL2 = new AdvancedModelRenderer(this);
        this.legL2.setRotationPoint(0.5F, -3.25F, -5.0F);
        this.body.addChild(legL2);
        this.legL2.cubeList.add(new ModelBox(legL2, 23, 16, 0.0F, 0.0F, 0.0F, 3, 3, 0, 0.0F, false));
        this.legL2.cubeList.add(new ModelBox(legL2, 29, 1, 0.0F, -0.6F, -0.1F, 2, 1, 0, 0.0F, false));

        this.legL1 = new AdvancedModelRenderer(this);
        this.legL1.setRotationPoint(0.5F, -3.25F, -5.5F);
        this.body.addChild(legL1);
        this.legL1.cubeList.add(new ModelBox(legL1, 23, 23, 0.0F, 0.0F, 0.0F, 3, 3, 0, 0.0F, false));
        this.legL1.cubeList.add(new ModelBox(legL1, 29, 2, 0.0F, -0.6F, -0.1F, 2, 1, 0, 0.0F, false));

        this.frontlegL = new AdvancedModelRenderer(this);
        this.frontlegL.setRotationPoint(1.0F, -3.5F, -7.0F);
        this.body.addChild(frontlegL);
        this.setRotateAngle(frontlegL, 0.0F, 0.3491F, 0.1745F);
        this.frontlegL.cubeList.add(new ModelBox(frontlegL, 35, 3, -0.5F, 0.0F, 0.0F, 7, 0, 7, 0.0F, false));

        this.frontlegR = new AdvancedModelRenderer(this);
        this.frontlegR.setRotationPoint(-1.0F, -3.5F, -7.0F);
        this.body.addChild(frontlegR);
        this.setRotateAngle(frontlegR, 0.0F, -0.3491F, -0.1745F);
        this.frontlegR.cubeList.add(new ModelBox(frontlegR, 35, 3, -6.5F, 0.0F, 0.0F, 7, 0, 7, 0.0F, true));

        this.frontlegL2 = new AdvancedModelRenderer(this);
        this.frontlegL2.setRotationPoint(1.0F, -3.6F, -6.25F);
        this.body.addChild(frontlegL2);
        this.setRotateAngle(frontlegL2, 0.0F, -0.1745F, 0.1745F);
        this.frontlegL2.cubeList.add(new ModelBox(frontlegL2, 35, 13, 0.0F, 0.0F, -0.5F, 4, 0, 2, 0.0F, false));

        this.frontlegR2 = new AdvancedModelRenderer(this);
        this.frontlegR2.setRotationPoint(-1.0F, -3.6F, -6.25F);
        this.body.addChild(frontlegR2);
        this.setRotateAngle(frontlegR2, 0.0F, 0.1745F, -0.1745F);
        this.frontlegR2.cubeList.add(new ModelBox(frontlegR2, 35, 13, -4.0F, 0.0F, -0.5F, 4, 0, 2, 0.0F, true));

        this.antennaL2 = new AdvancedModelRenderer(this);
        this.antennaL2.setRotationPoint(-1.0F, -3.0F, -7.0F);
        this.body.addChild(antennaL2);
        this.setRotateAngle(antennaL2, 0.0F, 0.4363F, 0.0F);
        this.antennaL2.cubeList.add(new ModelBox(antennaL2, 11, 11, -4.25F, 0.0F, -5.0F, 5, 0, 5, 0.0F, true));

        this.antennaL = new AdvancedModelRenderer(this);
        this.antennaL.setRotationPoint(1.0F, -3.0F, -7.0F);
        this.body.addChild(antennaL);
        this.setRotateAngle(antennaL, 0.0F, -0.4363F, 0.0F);
        this.antennaL.cubeList.add(new ModelBox(antennaL, 11, 11, -0.75F, 0.0F, -5.0F, 5, 0, 5, 0.0F, false));

        updateDefaultPose();
    }

    @Override
    public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        this.body.render(f5 );
    }
    public void renderStaticFloor(float f) {
        //this.body.rotateAngleX = (float) Math.toRadians(22.5);
        this.body.offsetY = 0.2F;
        this.body.offsetZ = -0;
        this.body.offsetX = 0F;
        this.body.render(0.01F);
        resetToDefaultPose();
    }

    public void renderStaticDisplayCase(float f) {
        //this.body.offsetZ = -0.15F;
        this.body.offsetY = 0.1F;
        this.body.render(0.01f);
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

        boolean isAtBottom = false;
        if (e.getPosition().getY() - 1 > 1) {
            BlockPos pos = new BlockPos(e.getPosition().getX(), e.getPosition().getY() - 1, e.getPosition().getZ());
            isAtBottom = ((e.isInsideOfMaterial(Material.WATER) || e.isInsideOfMaterial(Material.CORAL))
                    && ((e.world.getBlockState(pos)).getMaterial() != Material.WATER)
                    && ((double)e.getPosition().getY() + 0.334D) > e.posY);
        }

        if (e instanceof EntityLiving && !((EntityLiving) e).isAIDisabled()) {
            AdvancedModelRenderer[] armsL = {this.legL1, this.legL2};
            AdvancedModelRenderer[] armsR = {this.legR1, this.legR2};
            //AdvancedModelRenderer[] legsL = {this.legL1, this.legL2, this.legL3, this.legL4, this.legL5, this.legL6, this.legL7, this.legL8, this.legL9, this.legL10, this.legL11, this.legL12, this.legL13, this.legL14, this.legL15, this.legL16, this.legL17};
            //AdvancedModelRenderer[] legsR = {this.legR1, this.legR2, this.legR3, this.legR4, this.legR5, this.legR6, this.legR7, this.legR8, this.legR9, this.legR10, this.legR11, this.legR12, this.legR13, this.legR14, this.legR15, this.legR16, this.legR17};

            float floatMove = this.moveBox(0.2F, 0.03F, false, f2, 1);

            if (f3 != 0) {
                this.swing(frontlegL, 0.2F, -0.4F, false, 0, -0.1F, f2, 0.8F);
                this.swing(frontlegR, 0.2F, 0.4F, false, 0, 0.1F, f2, 0.8F);
                this.swing(frontlegL2, 0.2F, -0.4F, false, 0, -0.1F, f2, 0.8F);
                this.swing(frontlegR2, 0.2F, 0.4F, false, 0, 0.1F, f2, 0.8F);
                this.body.offsetZ = floatMove;
            }
                //swim legs:
                float speedLeg = 1.5F;
                float degreeLeg = 0.3F;
                float weightLeg = -0.5F;
                this.swing(antennaL, 0.4F, -0.2F, false, 0.5F, -0.1F, f2, 0.8F);
                this.swing(antennaL2, 0.4F, 0.2F, false, 0.5F, 0.1F, f2, 0.8F);
                this.walk(antennaL, 0.4F, -0.2F, false, 0.5F, -0.1F, f2, 0.8F);
                this.walk(antennaL2, 0.4F, -0.2F, false, 0.5F, -0.1F, f2, 0.8F);
                this.flap(legL1, speedLeg, -degreeLeg, false, 0, -weightLeg, f2, 0.7F);
                this.flap(legR1, speedLeg, degreeLeg, false, 0, weightLeg, f2, 0.7F);
                this.flap(legL2, speedLeg, -degreeLeg, false, 0.5F, -weightLeg, f2, 0.7F);
                this.flap(legR2, speedLeg, degreeLeg, false, 0.5F, weightLeg, f2, 0.7F);
                this.flap(legL3, speedLeg, -degreeLeg, false, 1.0F, -weightLeg, f2, 0.7F);
                this.flap(legR3, speedLeg, degreeLeg, false, 1.0F, weightLeg, f2, 0.7F);
                this.flap(legL4, speedLeg, -degreeLeg, false, 1.5F, -weightLeg, f2, 0.7F);
                this.flap(legR4, speedLeg, degreeLeg, false, 1.5F, weightLeg, f2, 0.7F);
                this.flap(legL5, speedLeg, -degreeLeg, false, 2.0F, -weightLeg, f2, 0.7F);
                this.flap(legR5, speedLeg, degreeLeg, false, 2.0F, weightLeg, f2, 0.7F);
                this.flap(legL6, speedLeg, -degreeLeg, false, 2.5F, -weightLeg, f2, 0.7F);
                this.flap(legR6, speedLeg, degreeLeg, false, 2.5F, weightLeg, f2, 0.7F);
                this.flap(legL7, speedLeg, -degreeLeg, false, 3.0F, -weightLeg, f2, 0.7F);
                this.flap(legR7, speedLeg, degreeLeg, false, 3.0F, weightLeg, f2, 0.7F);
                this.flap(legL8, speedLeg, -degreeLeg, false, 3.5F, -weightLeg, f2, 0.7F);
                this.flap(legR8, speedLeg, degreeLeg, false, 3.5F, weightLeg, f2, 0.7F);
                this.flap(legL9, speedLeg, -degreeLeg, false, 4.0F, -weightLeg, f2, 0.7F);
                this.flap(legR9, speedLeg, degreeLeg, false, 4.0F, weightLeg, f2, 0.7F);
                this.flap(legL10, speedLeg, -degreeLeg, false, 4.5F, -weightLeg, f2, 0.7F);
                this.flap(legR10, speedLeg, degreeLeg, false, 4.5F, weightLeg, f2, 0.7F);
                this.flap(legL11, speedLeg, -degreeLeg, false, 5.0F, -weightLeg, f2, 0.7F);
                this.flap(legR11, speedLeg, degreeLeg, false, 5.0F, weightLeg, f2, 0.7F);
                this.flap(legL12, speedLeg, -degreeLeg, false, 5.5F, -weightLeg, f2, 0.7F);
                this.flap(legR12, speedLeg, degreeLeg, false, 5.5F, weightLeg, f2, 0.7F);
                this.flap(legL13, speedLeg, -degreeLeg, false, 6.0F, -weightLeg, f2, 0.7F);
                this.flap(legR13, speedLeg, degreeLeg, false, 6.0F, weightLeg, f2, 0.7F);
                this.flap(legL14, speedLeg, -degreeLeg, false, 6.5F, -weightLeg, f2, 0.7F);
                this.flap(legR14, speedLeg, degreeLeg, false, 6.5F, weightLeg, f2, 0.7F);
                this.flap(legL15, speedLeg, -degreeLeg, false, 7.0F, -weightLeg, f2, 0.7F);
                this.flap(legR15, speedLeg, degreeLeg, false, 7.0F, weightLeg, f2, 0.7F);
                this.flap(legL16, speedLeg, -degreeLeg, false, 7.5F, -weightLeg, f2, 0.7F);
                this.flap(legR16, speedLeg, degreeLeg, false, 7.5F, weightLeg, f2, 0.7F);
                this.flap(legL17, speedLeg, -degreeLeg, false, 8.0F, -weightLeg, f2, 0.7F);
                this.flap(legR17, speedLeg, degreeLeg, false, 8.0F, weightLeg, f2, 0.7F);

                if (isAtBottom) {
                    this.bob(body, 0.5F, 0.02F, true, f2, 0.5F);
                    if (f3 != 0) {
                        this.chainSwing(armsL, 0.35F, -0.2F, 1, f2, 0.6F);
                        this.chainSwing(armsR, 0.35F, 0.2F, 1, f2, 0.6F);
                    } else {
                        this.chainSwing(armsL, 0.2F, -0.1F, 1, f2, 0.4F);
                        this.chainSwing(armsR, 0.2F, 0.1F, 1, f2, 0.4F);
                    }
                } else { //is Swimming
                    this.bob(body, 0.22F, 0.16F, false, f2, 0.8F);
                    this.chainSwing(armsL, 0.4F, -0.25F, 1, f2, 0.6F);
                    this.chainSwing(armsR, 0.4F, 0.25F, 1, f2, 0.6F);
                    this.flap(legL1, 0.25F, -0.2F, false, 2.0F, -0.2F, f2, 0.3F);
                    this.flap(legR1, 0.25F, 0.2F, false, 2.0F, 0.2F, f2, 0.3F);
                }
            }


    }
}
