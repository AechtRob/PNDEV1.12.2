package net.lepidodendron.entity.model.entity;

import net.ilexiconn.llibrary.client.model.ModelAnimator;
import net.ilexiconn.llibrary.client.model.tools.AdvancedModelRenderer;
import net.ilexiconn.llibrary.server.animation.IAnimatedEntity;
import net.lepidodendron.entity.EntityPrehistoricFloraMyriapod;
import net.lepidodendron.entity.model.ModelBasePalaeopedia;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;

public class ModelCrussolum extends ModelBasePalaeopedia {
    private final AdvancedModelRenderer body;
    private final AdvancedModelRenderer legright;
    private final AdvancedModelRenderer legleft;
    private final AdvancedModelRenderer legright2;
    private final AdvancedModelRenderer legleft2;
    private final AdvancedModelRenderer legright3;
    private final AdvancedModelRenderer legleft3;
    private final AdvancedModelRenderer antennaright;
    private final AdvancedModelRenderer antennaleft;
    private final AdvancedModelRenderer body2;
    private final AdvancedModelRenderer legright4;
    private final AdvancedModelRenderer legleft4;
    private final AdvancedModelRenderer legright5;
    private final AdvancedModelRenderer legleft5;
    private final AdvancedModelRenderer legright6;
    private final AdvancedModelRenderer legleft6;
    private final AdvancedModelRenderer body3;
    private final AdvancedModelRenderer legright7;
    private final AdvancedModelRenderer legleft7;
    private final AdvancedModelRenderer legright8;
    private final AdvancedModelRenderer legleft8;
    private final AdvancedModelRenderer legright9;
    private final AdvancedModelRenderer legleft9;
    private final AdvancedModelRenderer ultimatelegright;
    private final AdvancedModelRenderer ultimatelegleft;

    private ModelAnimator animator;

    public ModelCrussolum() {
        this.textureWidth = 32;
        this.textureHeight = 32;

        this.body = new AdvancedModelRenderer(this);
        this.body.setRotationPoint(0.0F, 23.0F, -3.0F);
        this.body.cubeList.add(new ModelBox(body, 14, 7, -0.5F, -1.0F, 0.0F, 1, 1, 2, 0.01F, false));
        this.body.cubeList.add(new ModelBox(body, 6, 14, -0.75F, -1.0F, 0.0F, 1, 1, 2, -0.01F, false));
        this.body.cubeList.add(new ModelBox(body, 10, 14, -0.5F, -1.0F, -1.0F, 1, 1, 1, 0.0F, false));
        this.body.cubeList.add(new ModelBox(body, 0, 6, -0.75F, -0.1F, -1.0F, 1, 0, 1, 0.0F, false));
        this.body.cubeList.add(new ModelBox(body, 6, 14, -0.25F, -1.0F, 0.0F, 1, 1, 2, -0.01F, true));
        this.body.cubeList.add(new ModelBox(body, 0, 6, -0.25F, -0.1F, -1.0F, 1, 0, 1, 0.0F, true));

        this.legright = new AdvancedModelRenderer(this);
        this.legright.setRotationPoint(-0.75F, -0.5F, 0.25F);
        this.body.addChild(legright);
        this.setRotateAngle(legright, -0.1745F, -0.8727F, 0.0F);
        this.legright.cubeList.add(new ModelBox(legright, 0, 11, -5.0F, -1.5F, 0.0F, 5, 3, 0, 0.0F, false));

        this.legleft = new AdvancedModelRenderer(this);
        this.legleft.setRotationPoint(0.75F, -0.5F, 0.25F);
        this.body.addChild(legleft);
        this.setRotateAngle(legleft, -0.1745F, 0.8727F, 0.0F);
        this.legleft.cubeList.add(new ModelBox(legleft, 0, 11, 0.0F, -1.5F, 0.0F, 5, 3, 0, 0.0F, true));

        this.legright2 = new AdvancedModelRenderer(this);
        this.legright2.setRotationPoint(-0.75F, -0.5F, 1.0F);
        this.body.addChild(legright2);
        this.setRotateAngle(legright2, -0.1745F, -0.6109F, 0.0F);
        this.legright2.cubeList.add(new ModelBox(legright2, 0, 11, -5.0F, -1.5F, 0.0F, 5, 3, 0, 0.0F, false));

        this.legleft2 = new AdvancedModelRenderer(this);
        this.legleft2.setRotationPoint(0.75F, -0.5F, 1.0F);
        this.body.addChild(legleft2);
        this.setRotateAngle(legleft2, -0.1745F, 0.6109F, 0.0F);
        this.legleft2.cubeList.add(new ModelBox(legleft2, 0, 11, 0.0F, -1.5F, 0.0F, 5, 3, 0, 0.0F, true));

        this.legright3 = new AdvancedModelRenderer(this);
        this.legright3.setRotationPoint(-0.75F, -0.5F, 1.75F);
        this.body.addChild(legright3);
        this.setRotateAngle(legright3, -0.1745F, -0.3491F, 0.0F);
        this.legright3.cubeList.add(new ModelBox(legright3, 0, 3, -6.0F, -1.5F, 0.0F, 6, 3, 0, 0.0F, false));

        this.legleft3 = new AdvancedModelRenderer(this);
        this.legleft3.setRotationPoint(0.75F, -0.5F, 1.75F);
        this.body.addChild(legleft3);
        this.setRotateAngle(legleft3, -0.1745F, 0.3491F, 0.0F);
        this.legleft3.cubeList.add(new ModelBox(legleft3, 0, 3, 0.0F, -1.5F, 0.0F, 6, 3, 0, 0.0F, true));

        this.antennaright = new AdvancedModelRenderer(this);
        this.antennaright.setRotationPoint(-0.25F, -0.5F, -1.0F);
        this.body.addChild(antennaright);
        this.setRotateAngle(antennaright, -0.4363F, 0.3491F, 0.2182F);
        this.antennaright.cubeList.add(new ModelBox(antennaright, 0, 0, 0.0F, -0.5F, -7.0F, 0, 4, 7, 0.0F, false));

        this.antennaleft = new AdvancedModelRenderer(this);
        this.antennaleft.setRotationPoint(0.25F, -0.5F, -1.0F);
        this.body.addChild(antennaleft);
        this.setRotateAngle(antennaleft, -0.4363F, -0.3491F, -0.2182F);
        this.antennaleft.cubeList.add(new ModelBox(antennaleft, 0, 0, 0.0F, -0.5F, -7.0F, 0, 4, 7, 0.0F, true));

        this.body2 = new AdvancedModelRenderer(this);
        this.body2.setRotationPoint(0.0F, -0.5F, 2.0F);
        this.body.addChild(body2);
        this.body2.cubeList.add(new ModelBox(body2, 10, 11, -1.0F, -0.5F, 0.0F, 2, 1, 2, 0.01F, false));
        this.body2.cubeList.add(new ModelBox(body2, 0, 14, -0.5F, -0.525F, 0.0F, 1, 1, 2, 0.0F, false));

        this.legright4 = new AdvancedModelRenderer(this);
        this.legright4.setRotationPoint(-1.0F, 0.0F, 0.25F);
        this.body2.addChild(legright4);
        this.setRotateAngle(legright4, 0.1745F, 0.0873F, 0.0F);
        this.legright4.cubeList.add(new ModelBox(legright4, 0, 3, -6.0F, -1.5F, 0.0F, 6, 3, 0, 0.0F, false));

        this.legleft4 = new AdvancedModelRenderer(this);
        this.legleft4.setRotationPoint(1.0F, 0.0F, 0.25F);
        this.body2.addChild(legleft4);
        this.setRotateAngle(legleft4, 0.1745F, -0.0873F, 0.0F);
        this.legleft4.cubeList.add(new ModelBox(legleft4, 0, 3, 0.0F, -1.5F, 0.0F, 6, 3, 0, 0.0F, true));

        this.legright5 = new AdvancedModelRenderer(this);
        this.legright5.setRotationPoint(-1.0F, 0.0F, 1.0F);
        this.body2.addChild(legright5);
        this.setRotateAngle(legright5, 0.1745F, 0.2618F, 0.0F);
        this.legright5.cubeList.add(new ModelBox(legright5, 0, 3, -6.0F, -1.5F, 0.0F, 6, 3, 0, 0.0F, false));

        this.legleft5 = new AdvancedModelRenderer(this);
        this.legleft5.setRotationPoint(1.0F, 0.0F, 1.0F);
        this.body2.addChild(legleft5);
        this.setRotateAngle(legleft5, 0.1745F, -0.2618F, 0.0F);
        this.legleft5.cubeList.add(new ModelBox(legleft5, 0, 3, 0.0F, -1.5F, 0.0F, 6, 3, 0, 0.0F, true));

        this.legright6 = new AdvancedModelRenderer(this);
        this.legright6.setRotationPoint(-1.0F, 0.0F, 1.75F);
        this.body2.addChild(legright6);
        this.setRotateAngle(legright6, 0.1745F, 0.4363F, 0.0F);
        this.legright6.cubeList.add(new ModelBox(legright6, 0, 3, -6.0F, -1.5F, 0.0F, 6, 3, 0, 0.0F, false));

        this.legleft6 = new AdvancedModelRenderer(this);
        this.legleft6.setRotationPoint(1.0F, 0.0F, 1.75F);
        this.body2.addChild(legleft6);
        this.setRotateAngle(legleft6, 0.1745F, -0.4363F, 0.0F);
        this.legleft6.cubeList.add(new ModelBox(legleft6, 0, 3, 0.0F, -1.5F, 0.0F, 6, 3, 0, 0.0F, true));

        this.body3 = new AdvancedModelRenderer(this);
        this.body3.setRotationPoint(0.0F, 0.0F, 2.0F);
        this.body2.addChild(body3);
        this.body3.cubeList.add(new ModelBox(body3, 10, 4, -1.0F, -0.5F, 0.0F, 2, 1, 2, 0.0F, false));
        this.body3.cubeList.add(new ModelBox(body3, 12, 1, -0.5F, -0.525F, 0.0F, 1, 1, 2, 0.01F, false));
        this.body3.cubeList.add(new ModelBox(body3, 4, 14, -0.5F, -0.5F, 2.0F, 1, 1, 1, 0.0F, false));

        this.legright7 = new AdvancedModelRenderer(this);
        this.legright7.setRotationPoint(-1.0F, 0.0F, 0.25F);
        this.body3.addChild(legright7);
        this.setRotateAngle(legright7, 0.1745F, 0.7854F, 0.0F);
        this.legright7.cubeList.add(new ModelBox(legright7, 0, 3, -6.0F, -1.5F, 0.0F, 6, 3, 0, 0.0F, false));

        this.legleft7 = new AdvancedModelRenderer(this);
        this.legleft7.setRotationPoint(1.0F, 0.0F, 0.25F);
        this.body3.addChild(legleft7);
        this.setRotateAngle(legleft7, 0.1745F, -0.7854F, 0.0F);
        this.legleft7.cubeList.add(new ModelBox(legleft7, 0, 3, 0.0F, -1.5F, 0.0F, 6, 3, 0, 0.0F, true));

        this.legright8 = new AdvancedModelRenderer(this);
        this.legright8.setRotationPoint(-1.0F, 0.0F, 1.25F);
        this.body3.addChild(legright8);
        this.setRotateAngle(legright8, 0.1745F, 0.9599F, 0.0F);
        this.legright8.cubeList.add(new ModelBox(legright8, 0, 3, -6.0F, -1.5F, 0.0F, 6, 3, 0, 0.0F, false));

        this.legleft8 = new AdvancedModelRenderer(this);
        this.legleft8.setRotationPoint(1.0F, 0.0F, 1.25F);
        this.body3.addChild(legleft8);
        this.setRotateAngle(legleft8, 0.1745F, -0.9599F, 0.0F);
        this.legleft8.cubeList.add(new ModelBox(legleft8, 0, 3, 0.0F, -1.5F, 0.0F, 6, 3, 0, 0.0F, true));

        this.legright9 = new AdvancedModelRenderer(this);
        this.legright9.setRotationPoint(-0.5F, 0.0F, 2.0F);
        this.body3.addChild(legright9);
        this.setRotateAngle(legright9, 0.1745F, 1.1781F, 0.0F);
        this.legright9.cubeList.add(new ModelBox(legright9, 0, 11, -5.0F, -1.5F, 0.0F, 5, 3, 0, 0.0F, false));

        this.legleft9 = new AdvancedModelRenderer(this);
        this.legleft9.setRotationPoint(0.5F, 0.0F, 2.0F);
        this.body3.addChild(legleft9);
        this.setRotateAngle(legleft9, 0.1745F, -1.1781F, 0.0F);
        this.legleft9.cubeList.add(new ModelBox(legleft9, 0, 11, 0.0F, -1.5F, 0.0F, 5, 3, 0, 0.0F, true));

        this.ultimatelegright = new AdvancedModelRenderer(this);
        this.ultimatelegright.setRotationPoint(-0.25F, 0.0F, 3.0F);
        this.body3.addChild(ultimatelegright);
        this.setRotateAngle(ultimatelegright, 0.0F, 1.2654F, 0.2618F);
        this.ultimatelegright.cubeList.add(new ModelBox(ultimatelegright, 0, 0, -7.0F, -1.5F, 0.0F, 7, 3, 0, 0.0F, false));

        this.ultimatelegleft = new AdvancedModelRenderer(this);
        this.ultimatelegleft.setRotationPoint(0.25F, 0.0F, 3.0F);
        this.body3.addChild(ultimatelegleft);
        this.setRotateAngle(ultimatelegleft, 0.0F, -1.2654F, -0.2618F);
        this.ultimatelegleft.cubeList.add(new ModelBox(ultimatelegleft, 0, 0, 0.0F, -1.5F, 0.0F, 7, 3, 0, 0.0F, true));

        updateDefaultPose();
        animator = ModelAnimator.create();
    }

    @Override
    public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        animate((IAnimatedEntity) entity, f, f1, f2, f3, f4, f5);
        this.body.render(f5);
    }
    public void renderStaticFloor(float f) {
        this.resetToDefaultPose();
    }

    @Override
    public void renderStaticBook(float f) {
        //Rotations, positions and sizing:
        this.body.offsetY = -2.8F;
        this.body.offsetX = -1.1F;
        this.body.offsetZ = 2.0F;
        this.body.rotateAngleY = (float)Math.toRadians(120);
        this.body.rotateAngleX = (float)Math.toRadians(1);
        this.body.rotateAngleZ = (float)Math.toRadians(0);
        this.body.scaleChildren = true;
        float scaler = 4.0F;
        this.body.setScale(scaler, scaler, scaler);
        //Start of pose:

        //End of pose, now render the model:
        this.body.render(f);
        //Reset rotations, positions and sizing:
        this.body.setScale(1.0F, 1.0F, 1.0F);
        this.body.scaleChildren = false;
        resetToDefaultPose();

    }

    public void renderStaticDisplayCase(float f) {
        //this.body.offsetZ = -0.080F;
        this.body.render(0.01f);
        resetToDefaultPose();
    }

    public void setRotateAngle(ModelRenderer modelRenderer, float x, float y, float z) {
        modelRenderer.rotateAngleX = x;
        modelRenderer.rotateAngleY = y;
        modelRenderer.rotateAngleZ = z;
    }

    @Override
    public void setLivingAnimations(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime) {
        super.setLivingAnimations(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime);
        this.resetToDefaultPose();
        EntityPrehistoricFloraMyriapod ee = (EntityPrehistoricFloraMyriapod) entitylivingbaseIn;

        if (ee.getIsFast()) {
            animRun(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime);
        }
        else if (ee.getIsMoving()){
            animWalk(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime);
        }

    }

    public void animWalk(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime) {
        EntityPrehistoricFloraMyriapod entity = (EntityPrehistoricFloraMyriapod) entitylivingbaseIn;
        int animCycle = 48;
        double tickAnim = (entity.ticksExisted + entity.getTickOffset()) - (int) (Math.floor((double) (entity.ticksExisted + entity.getTickOffset()) / (double) animCycle) * (double) animCycle) + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;
        this.setRotateAngle(body, body.rotateAngleX + (float) Math.toRadians((Math.sin((Math.PI/180)*((((double)tickAnim/20D))*(376*2))-90))), body.rotateAngleY + (float) Math.toRadians(0), body.rotateAngleZ + (float) Math.toRadians(0));



        if (tickAnim >= 0 && tickAnim < 5) {
            xx = 2.35666 + (((tickAnim - 0) / 5) * (-25.61151-(2.35666)));
            yy = 40.15449 + (((tickAnim - 0) / 5) * (16.35611-(40.15449)));
            zz = -7.85952 + (((tickAnim - 0) / 5) * (31.96162-(-7.85952)));
        }
        else if (tickAnim >= 5 && tickAnim < 10) {
            xx = -25.61151 + (((tickAnim - 5) / 5) * (-10.60369-(-25.61151)));
            yy = 16.35611 + (((tickAnim - 5) / 5) * (-19.33731-(16.35611)));
            zz = 31.96162 + (((tickAnim - 5) / 5) * (10.87348-(31.96162)));
        }
        else if (tickAnim >= 10 && tickAnim < 16) {
            xx = -10.60369 + (((tickAnim - 10) / 6) * (2.35666-(-10.60369)));
            yy = -19.33731 + (((tickAnim - 10) / 6) * (40.15449-(-19.33731)));
            zz = 10.87348 + (((tickAnim - 10) / 6) * (-7.85952-(10.87348)));
        }
        else if (tickAnim >= 16 && tickAnim < 21) {
            xx = 2.35666 + (((tickAnim - 16) / 5) * (-25.61151-(2.35666)));
            yy = 40.15449 + (((tickAnim - 16) / 5) * (16.35611-(40.15449)));
            zz = -7.85952 + (((tickAnim - 16) / 5) * (31.96162-(-7.85952)));
        }
        else if (tickAnim >= 21 && tickAnim < 26) {
            xx = -25.61151 + (((tickAnim - 21) / 5) * (-10.60369-(-25.61151)));
            yy = 16.35611 + (((tickAnim - 21) / 5) * (-19.33731-(16.35611)));
            zz = 31.96162 + (((tickAnim - 21) / 5) * (10.87348-(31.96162)));
        }
        else if (tickAnim >= 26 && tickAnim < 32) {
            xx = -10.60369 + (((tickAnim - 26) / 6) * (2.35666-(-10.60369)));
            yy = -19.33731 + (((tickAnim - 26) / 6) * (40.15449-(-19.33731)));
            zz = 10.87348 + (((tickAnim - 26) / 6) * (-7.85952-(10.87348)));
        }
        else if (tickAnim >= 32 && tickAnim < 37) {
            xx = 2.35666 + (((tickAnim - 32) / 5) * (-25.61151-(2.35666)));
            yy = 40.15449 + (((tickAnim - 32) / 5) * (16.35611-(40.15449)));
            zz = -7.85952 + (((tickAnim - 32) / 5) * (31.96162-(-7.85952)));
        }
        else if (tickAnim >= 37 && tickAnim < 42) {
            xx = -25.61151 + (((tickAnim - 37) / 5) * (-10.60369-(-25.61151)));
            yy = 16.35611 + (((tickAnim - 37) / 5) * (-19.33731-(16.35611)));
            zz = 31.96162 + (((tickAnim - 37) / 5) * (10.87348-(31.96162)));
        }
        else if (tickAnim >= 42 && tickAnim < 48) {
            xx = -10.60369 + (((tickAnim - 42) / 6) * (2.35666-(-10.60369)));
            yy = -19.33731 + (((tickAnim - 42) / 6) * (40.15449-(-19.33731)));
            zz = 10.87348 + (((tickAnim - 42) / 6) * (-7.85952-(10.87348)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(legright, legright.rotateAngleX + (float) Math.toRadians(xx), legright.rotateAngleY + (float) Math.toRadians(yy), legright.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 8) {
            xx = -10.60369 + (((tickAnim - 0) / 8) * (2.35666-(-10.60369)));
            yy = 19.33731 + (((tickAnim - 0) / 8) * (-40.15449-(19.33731)));
            zz = -10.87348 + (((tickAnim - 0) / 8) * (7.85952-(-10.87348)));
        }
        else if (tickAnim >= 8 && tickAnim < 12) {
            xx = 2.35666 + (((tickAnim - 8) / 4) * (-25.61151-(2.35666)));
            yy = -40.15449 + (((tickAnim - 8) / 4) * (-16.35611-(-40.15449)));
            zz = 7.85952 + (((tickAnim - 8) / 4) * (-31.96162-(7.85952)));
        }
        else if (tickAnim >= 12 && tickAnim < 17) {
            xx = -25.61151 + (((tickAnim - 12) / 5) * (-10.60369-(-25.61151)));
            yy = -16.35611 + (((tickAnim - 12) / 5) * (19.33731-(-16.35611)));
            zz = -31.96162 + (((tickAnim - 12) / 5) * (-10.87348-(-31.96162)));
        }
        else if (tickAnim >= 17 && tickAnim < 24) {
            xx = -10.60369 + (((tickAnim - 17) / 7) * (2.35666-(-10.60369)));
            yy = 19.33731 + (((tickAnim - 17) / 7) * (-40.15449-(19.33731)));
            zz = -10.87348 + (((tickAnim - 17) / 7) * (7.85952-(-10.87348)));
        }
        else if (tickAnim >= 24 && tickAnim < 28) {
            xx = 2.35666 + (((tickAnim - 24) / 4) * (-25.61151-(2.35666)));
            yy = -40.15449 + (((tickAnim - 24) / 4) * (-16.35611-(-40.15449)));
            zz = 7.85952 + (((tickAnim - 24) / 4) * (-31.96162-(7.85952)));
        }
        else if (tickAnim >= 28 && tickAnim < 32) {
            xx = -25.61151 + (((tickAnim - 28) / 4) * (-10.60369-(-25.61151)));
            yy = -16.35611 + (((tickAnim - 28) / 4) * (19.33731-(-16.35611)));
            zz = -31.96162 + (((tickAnim - 28) / 4) * (-10.87348-(-31.96162)));
        }
        else if (tickAnim >= 32 && tickAnim < 39) {
            xx = -10.60369 + (((tickAnim - 32) / 7) * (2.35666-(-10.60369)));
            yy = 19.33731 + (((tickAnim - 32) / 7) * (-40.15449-(19.33731)));
            zz = -10.87348 + (((tickAnim - 32) / 7) * (7.85952-(-10.87348)));
        }
        else if (tickAnim >= 39 && tickAnim < 44) {
            xx = 2.35666 + (((tickAnim - 39) / 5) * (-25.61151-(2.35666)));
            yy = -40.15449 + (((tickAnim - 39) / 5) * (-16.35611-(-40.15449)));
            zz = 7.85952 + (((tickAnim - 39) / 5) * (-31.96162-(7.85952)));
        }
        else if (tickAnim >= 44 && tickAnim < 48) {
            xx = -25.61151 + (((tickAnim - 44) / 4) * (-10.60369-(-25.61151)));
            yy = -16.35611 + (((tickAnim - 44) / 4) * (19.33731-(-16.35611)));
            zz = -31.96162 + (((tickAnim - 44) / 4) * (-10.87348-(-31.96162)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(legleft, legleft.rotateAngleX + (float) Math.toRadians(xx), legleft.rotateAngleY + (float) Math.toRadians(yy), legleft.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 2) {
            xx = -7.88 + (((tickAnim - 0) / 2) * (-15.76886-(-7.88)));
            yy = 19.88 + (((tickAnim - 0) / 2) * (9.767-(19.88)));
            zz = 14.64 + (((tickAnim - 0) / 2) * (29.28473-(14.64)));
        }
        else if (tickAnim >= 2 && tickAnim < 6) {
            xx = -15.76886 + (((tickAnim - 2) / 4) * (0-(-15.76886)));
            yy = 9.767 + (((tickAnim - 2) / 4) * (-17.5-(9.767)));
            zz = 29.28473 + (((tickAnim - 2) / 4) * (0-(29.28473)));
        }
        else if (tickAnim >= 6 && tickAnim < 14) {
            xx = 0 + (((tickAnim - 6) / 8) * (0-(0)));
            yy = -17.5 + (((tickAnim - 6) / 8) * (30-(-17.5)));
            zz = 0 + (((tickAnim - 6) / 8) * (0-(0)));
        }
        else if (tickAnim >= 14 && tickAnim < 18) {
            xx = 0 + (((tickAnim - 14) / 4) * (-15.76886-(0)));
            yy = 30 + (((tickAnim - 14) / 4) * (9.767-(30)));
            zz = 0 + (((tickAnim - 14) / 4) * (29.28473-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 22) {
            xx = -15.76886 + (((tickAnim - 18) / 4) * (0-(-15.76886)));
            yy = 9.767 + (((tickAnim - 18) / 4) * (-17.5-(9.767)));
            zz = 29.28473 + (((tickAnim - 18) / 4) * (0-(29.28473)));
        }
        else if (tickAnim >= 22 && tickAnim < 30) {
            xx = 0 + (((tickAnim - 22) / 8) * (0-(0)));
            yy = -17.5 + (((tickAnim - 22) / 8) * (30-(-17.5)));
            zz = 0 + (((tickAnim - 22) / 8) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 34) {
            xx = 0 + (((tickAnim - 30) / 4) * (-15.76886-(0)));
            yy = 30 + (((tickAnim - 30) / 4) * (9.767-(30)));
            zz = 0 + (((tickAnim - 30) / 4) * (29.28473-(0)));
        }
        else if (tickAnim >= 34 && tickAnim < 38) {
            xx = -15.76886 + (((tickAnim - 34) / 4) * (0-(-15.76886)));
            yy = 9.767 + (((tickAnim - 34) / 4) * (-17.5-(9.767)));
            zz = 29.28473 + (((tickAnim - 34) / 4) * (0-(29.28473)));
        }
        else if (tickAnim >= 38 && tickAnim < 46) {
            xx = 0 + (((tickAnim - 38) / 8) * (0-(0)));
            yy = -17.5 + (((tickAnim - 38) / 8) * (30-(-17.5)));
            zz = 0 + (((tickAnim - 38) / 8) * (0-(0)));
        }
        else if (tickAnim >= 46 && tickAnim < 48) {
            xx = 0 + (((tickAnim - 46) / 2) * (-7.88-(0)));
            yy = 30 + (((tickAnim - 46) / 2) * (19.88-(30)));
            zz = 0 + (((tickAnim - 46) / 2) * (14.64-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(legright2, legright2.rotateAngleX + (float) Math.toRadians(xx), legright2.rotateAngleY + (float) Math.toRadians(yy), legright2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 6) {
            xx = 0 + (((tickAnim - 0) / 6) * (0-(0)));
            yy = 5.63 + (((tickAnim - 0) / 6) * (-30-(5.63)));
            zz = 0 + (((tickAnim - 0) / 6) * (0-(0)));
        }
        else if (tickAnim >= 6 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 6) / 4) * (-15.76886-(0)));
            yy = -30 + (((tickAnim - 6) / 4) * (-9.767-(-30)));
            zz = 0 + (((tickAnim - 6) / 4) * (-29.28473-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 14) {
            xx = -15.76886 + (((tickAnim - 10) / 4) * (0-(-15.76886)));
            yy = -9.767 + (((tickAnim - 10) / 4) * (17.5-(-9.767)));
            zz = -29.28473 + (((tickAnim - 10) / 4) * (0-(-29.28473)));
        }
        else if (tickAnim >= 14 && tickAnim < 22) {
            xx = 0 + (((tickAnim - 14) / 8) * (0-(0)));
            yy = 17.5 + (((tickAnim - 14) / 8) * (-30-(17.5)));
            zz = 0 + (((tickAnim - 14) / 8) * (0-(0)));
        }
        else if (tickAnim >= 22 && tickAnim < 26) {
            xx = 0 + (((tickAnim - 22) / 4) * (-15.76886-(0)));
            yy = -30 + (((tickAnim - 22) / 4) * (-9.767-(-30)));
            zz = 0 + (((tickAnim - 22) / 4) * (-29.28473-(0)));
        }
        else if (tickAnim >= 26 && tickAnim < 30) {
            xx = -15.76886 + (((tickAnim - 26) / 4) * (0-(-15.76886)));
            yy = -9.767 + (((tickAnim - 26) / 4) * (17.5-(-9.767)));
            zz = -29.28473 + (((tickAnim - 26) / 4) * (0-(-29.28473)));
        }
        else if (tickAnim >= 30 && tickAnim < 38) {
            xx = 0 + (((tickAnim - 30) / 8) * (0-(0)));
            yy = 17.5 + (((tickAnim - 30) / 8) * (-30-(17.5)));
            zz = 0 + (((tickAnim - 30) / 8) * (0-(0)));
        }
        else if (tickAnim >= 38 && tickAnim < 42) {
            xx = 0 + (((tickAnim - 38) / 4) * (-15.76886-(0)));
            yy = -30 + (((tickAnim - 38) / 4) * (-9.767-(-30)));
            zz = 0 + (((tickAnim - 38) / 4) * (-29.28473-(0)));
        }
        else if (tickAnim >= 42 && tickAnim < 46) {
            xx = -15.76886 + (((tickAnim - 42) / 4) * (0-(-15.76886)));
            yy = -9.767 + (((tickAnim - 42) / 4) * (17.5-(-9.767)));
            zz = -29.28473 + (((tickAnim - 42) / 4) * (0-(-29.28473)));
        }
        else if (tickAnim >= 46 && tickAnim < 48) {
            xx = 0 + (((tickAnim - 46) / 2) * (0-(0)));
            yy = 17.5 + (((tickAnim - 46) / 2) * (5.63-(17.5)));
            zz = 0 + (((tickAnim - 46) / 2) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(legleft2, legleft2.rotateAngleX + (float) Math.toRadians(xx), legleft2.rotateAngleY + (float) Math.toRadians(yy), legleft2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 4) {
            xx = -7.40148 + (((tickAnim - 0) / 4) * (0-(-7.40148)));
            yy = 2.72421 + (((tickAnim - 0) / 4) * (-20-(2.72421)));
            zz = 23.62591 + (((tickAnim - 0) / 4) * (0-(23.62591)));
        }
        else if (tickAnim >= 4 && tickAnim < 12) {
            xx = 0 + (((tickAnim - 4) / 8) * (0-(0)));
            yy = -20 + (((tickAnim - 4) / 8) * (22.5-(-20)));
            zz = 0 + (((tickAnim - 4) / 8) * (0-(0)));
        }
        else if (tickAnim >= 12 && tickAnim < 16) {
            xx = 0 + (((tickAnim - 12) / 4) * (-7.40148-(0)));
            yy = 22.5 + (((tickAnim - 12) / 4) * (2.72421-(22.5)));
            zz = 0 + (((tickAnim - 12) / 4) * (23.62591-(0)));
        }
        else if (tickAnim >= 16 && tickAnim < 20) {
            xx = -7.40148 + (((tickAnim - 16) / 4) * (0-(-7.40148)));
            yy = 2.72421 + (((tickAnim - 16) / 4) * (-20-(2.72421)));
            zz = 23.62591 + (((tickAnim - 16) / 4) * (0-(23.62591)));
        }
        else if (tickAnim >= 20 && tickAnim < 28) {
            xx = 0 + (((tickAnim - 20) / 8) * (0-(0)));
            yy = -20 + (((tickAnim - 20) / 8) * (22.5-(-20)));
            zz = 0 + (((tickAnim - 20) / 8) * (0-(0)));
        }
        else if (tickAnim >= 28 && tickAnim < 32) {
            xx = 0 + (((tickAnim - 28) / 4) * (-7.40148-(0)));
            yy = 22.5 + (((tickAnim - 28) / 4) * (2.72421-(22.5)));
            zz = 0 + (((tickAnim - 28) / 4) * (23.62591-(0)));
        }
        else if (tickAnim >= 32 && tickAnim < 36) {
            xx = -7.40148 + (((tickAnim - 32) / 4) * (0-(-7.40148)));
            yy = 2.72421 + (((tickAnim - 32) / 4) * (-20-(2.72421)));
            zz = 23.62591 + (((tickAnim - 32) / 4) * (0-(23.62591)));
        }
        else if (tickAnim >= 36 && tickAnim < 44) {
            xx = 0 + (((tickAnim - 36) / 8) * (0-(0)));
            yy = -20 + (((tickAnim - 36) / 8) * (22.5-(-20)));
            zz = 0 + (((tickAnim - 36) / 8) * (0-(0)));
        }
        else if (tickAnim >= 44 && tickAnim < 48) {
            xx = 0 + (((tickAnim - 44) / 4) * (-7.40148-(0)));
            yy = 22.5 + (((tickAnim - 44) / 4) * (2.72421-(22.5)));
            zz = 0 + (((tickAnim - 44) / 4) * (23.62591-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(legright3, legright3.rotateAngleX + (float) Math.toRadians(xx), legright3.rotateAngleY + (float) Math.toRadians(yy), legright3.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 4) {
            xx = 0 + (((tickAnim - 0) / 4) * (0-(0)));
            yy = -1.25 + (((tickAnim - 0) / 4) * (-22.5-(-1.25)));
            zz = 0 + (((tickAnim - 0) / 4) * (0-(0)));
        }
        else if (tickAnim >= 4 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 4) / 4) * (-7.40148-(0)));
            yy = -22.5 + (((tickAnim - 4) / 4) * (-2.72421-(-22.5)));
            zz = 0 + (((tickAnim - 4) / 4) * (-23.62591-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 12) {
            xx = -7.40148 + (((tickAnim - 8) / 4) * (0-(-7.40148)));
            yy = -2.72421 + (((tickAnim - 8) / 4) * (20-(-2.72421)));
            zz = -23.62591 + (((tickAnim - 8) / 4) * (0-(-23.62591)));
        }
        else if (tickAnim >= 12 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 12) / 8) * (0-(0)));
            yy = 20 + (((tickAnim - 12) / 8) * (-22.5-(20)));
            zz = 0 + (((tickAnim - 12) / 8) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 24) {
            xx = 0 + (((tickAnim - 20) / 4) * (-7.40148-(0)));
            yy = -22.5 + (((tickAnim - 20) / 4) * (-2.72421-(-22.5)));
            zz = 0 + (((tickAnim - 20) / 4) * (-23.62591-(0)));
        }
        else if (tickAnim >= 24 && tickAnim < 28) {
            xx = -7.40148 + (((tickAnim - 24) / 4) * (0-(-7.40148)));
            yy = -2.72421 + (((tickAnim - 24) / 4) * (20-(-2.72421)));
            zz = -23.62591 + (((tickAnim - 24) / 4) * (0-(-23.62591)));
        }
        else if (tickAnim >= 28 && tickAnim < 36) {
            xx = 0 + (((tickAnim - 28) / 8) * (0-(0)));
            yy = 20 + (((tickAnim - 28) / 8) * (-22.5-(20)));
            zz = 0 + (((tickAnim - 28) / 8) * (0-(0)));
        }
        else if (tickAnim >= 36 && tickAnim < 40) {
            xx = 0 + (((tickAnim - 36) / 4) * (-7.40148-(0)));
            yy = -22.5 + (((tickAnim - 36) / 4) * (-2.72421-(-22.5)));
            zz = 0 + (((tickAnim - 36) / 4) * (-23.62591-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 44) {
            xx = -7.40148 + (((tickAnim - 40) / 4) * (0-(-7.40148)));
            yy = -2.72421 + (((tickAnim - 40) / 4) * (20-(-2.72421)));
            zz = -23.62591 + (((tickAnim - 40) / 4) * (0-(-23.62591)));
        }
        else if (tickAnim >= 44 && tickAnim < 48) {
            xx = 0 + (((tickAnim - 44) / 4) * (0-(0)));
            yy = 20 + (((tickAnim - 44) / 4) * (-1.25-(20)));
            zz = 0 + (((tickAnim - 44) / 4) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(legleft3, legleft3.rotateAngleX + (float) Math.toRadians(xx), legleft3.rotateAngleY + (float) Math.toRadians(yy), legleft3.rotateAngleZ + (float) Math.toRadians(zz));



        this.setRotateAngle(antennaright, antennaright.rotateAngleX + (float) Math.toRadians(-(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*(300)))*10)), antennaright.rotateAngleY + (float) Math.toRadians(-(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*(376*2))))*3), antennaright.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(antennaleft, antennaleft.rotateAngleX + (float) Math.toRadians(-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*(300))+60)*10), antennaleft.rotateAngleY + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*(376*2)))*3), antennaleft.rotateAngleZ + (float) Math.toRadians(0));



        if (tickAnim >= 0 && tickAnim < 2) {
            xx = -0.94 + (((tickAnim - 0) / 2) * (0-(-0.94)));
            yy = -6.73 + (((tickAnim - 0) / 2) * (-20-(-6.73)));
            zz = 8.8 + (((tickAnim - 0) / 2) * (0-(8.8)));
        }
        else if (tickAnim >= 2 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 2) / 8) * (0-(0)));
            yy = -20 + (((tickAnim - 2) / 8) * (12.5-(-20)));
            zz = 0 + (((tickAnim - 2) / 8) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 14) {
            xx = 0 + (((tickAnim - 10) / 4) * (-1.88622-(0)));
            yy = 12.5 + (((tickAnim - 10) / 4) * (6.54034-(12.5)));
            zz = 0 + (((tickAnim - 10) / 4) * (17.5982-(0)));
        }
        else if (tickAnim >= 14 && tickAnim < 18) {
            xx = -1.88622 + (((tickAnim - 14) / 4) * (0-(-1.88622)));
            yy = 6.54034 + (((tickAnim - 14) / 4) * (-20-(6.54034)));
            zz = 17.5982 + (((tickAnim - 14) / 4) * (0-(17.5982)));
        }
        else if (tickAnim >= 18 && tickAnim < 26) {
            xx = 0 + (((tickAnim - 18) / 8) * (0-(0)));
            yy = -20 + (((tickAnim - 18) / 8) * (12.5-(-20)));
            zz = 0 + (((tickAnim - 18) / 8) * (0-(0)));
        }
        else if (tickAnim >= 26 && tickAnim < 30) {
            xx = 0 + (((tickAnim - 26) / 4) * (-1.88622-(0)));
            yy = 12.5 + (((tickAnim - 26) / 4) * (6.54034-(12.5)));
            zz = 0 + (((tickAnim - 26) / 4) * (17.5982-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 34) {
            xx = -1.88622 + (((tickAnim - 30) / 4) * (0-(-1.88622)));
            yy = 6.54034 + (((tickAnim - 30) / 4) * (-20-(6.54034)));
            zz = 17.5982 + (((tickAnim - 30) / 4) * (0-(17.5982)));
        }
        else if (tickAnim >= 34 && tickAnim < 42) {
            xx = 0 + (((tickAnim - 34) / 8) * (0-(0)));
            yy = -20 + (((tickAnim - 34) / 8) * (12.5-(-20)));
            zz = 0 + (((tickAnim - 34) / 8) * (0-(0)));
        }
        else if (tickAnim >= 42 && tickAnim < 46) {
            xx = 0 + (((tickAnim - 42) / 4) * (-1.88622-(0)));
            yy = 12.5 + (((tickAnim - 42) / 4) * (6.54034-(12.5)));
            zz = 0 + (((tickAnim - 42) / 4) * (17.5982-(0)));
        }
        else if (tickAnim >= 46 && tickAnim < 48) {
            xx = -1.88622 + (((tickAnim - 46) / 2) * (-0.94-(-1.88622)));
            yy = 6.54034 + (((tickAnim - 46) / 2) * (-6.73-(6.54034)));
            zz = 17.5982 + (((tickAnim - 46) / 2) * (8.8-(17.5982)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(legright4, legright4.rotateAngleX + (float) Math.toRadians(xx), legright4.rotateAngleY + (float) Math.toRadians(yy), legright4.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 2) {
            xx = 0 + (((tickAnim - 0) / 2) * (0-(0)));
            yy = -4.37 + (((tickAnim - 0) / 2) * (-12.5-(-4.37)));
            zz = 0 + (((tickAnim - 0) / 2) * (0-(0)));
        }
        else if (tickAnim >= 2 && tickAnim < 6) {
            xx = 0 + (((tickAnim - 2) / 4) * (-1.88622-(0)));
            yy = -12.5 + (((tickAnim - 2) / 4) * (-6.54034-(-12.5)));
            zz = 0 + (((tickAnim - 2) / 4) * (-17.5982-(0)));
        }
        else if (tickAnim >= 6 && tickAnim < 10) {
            xx = -1.88622 + (((tickAnim - 6) / 4) * (0-(-1.88622)));
            yy = -6.54034 + (((tickAnim - 6) / 4) * (20-(-6.54034)));
            zz = -17.5982 + (((tickAnim - 6) / 4) * (0-(-17.5982)));
        }
        else if (tickAnim >= 10 && tickAnim < 18) {
            xx = 0 + (((tickAnim - 10) / 8) * (0-(0)));
            yy = 20 + (((tickAnim - 10) / 8) * (-12.5-(20)));
            zz = 0 + (((tickAnim - 10) / 8) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 22) {
            xx = 0 + (((tickAnim - 18) / 4) * (-1.88622-(0)));
            yy = -12.5 + (((tickAnim - 18) / 4) * (-6.54034-(-12.5)));
            zz = 0 + (((tickAnim - 18) / 4) * (-17.5982-(0)));
        }
        else if (tickAnim >= 22 && tickAnim < 26) {
            xx = -1.88622 + (((tickAnim - 22) / 4) * (0-(-1.88622)));
            yy = -6.54034 + (((tickAnim - 22) / 4) * (20-(-6.54034)));
            zz = -17.5982 + (((tickAnim - 22) / 4) * (0-(-17.5982)));
        }
        else if (tickAnim >= 26 && tickAnim < 34) {
            xx = 0 + (((tickAnim - 26) / 8) * (0-(0)));
            yy = 20 + (((tickAnim - 26) / 8) * (-12.5-(20)));
            zz = 0 + (((tickAnim - 26) / 8) * (0-(0)));
        }
        else if (tickAnim >= 34 && tickAnim < 38) {
            xx = 0 + (((tickAnim - 34) / 4) * (-1.88622-(0)));
            yy = -12.5 + (((tickAnim - 34) / 4) * (-6.54034-(-12.5)));
            zz = 0 + (((tickAnim - 34) / 4) * (-17.5982-(0)));
        }
        else if (tickAnim >= 38 && tickAnim < 42) {
            xx = -1.88622 + (((tickAnim - 38) / 4) * (0-(-1.88622)));
            yy = -6.54034 + (((tickAnim - 38) / 4) * (20-(-6.54034)));
            zz = -17.5982 + (((tickAnim - 38) / 4) * (0-(-17.5982)));
        }
        else if (tickAnim >= 42 && tickAnim < 48) {
            xx = 0 + (((tickAnim - 42) / 6) * (0-(0)));
            yy = 20 + (((tickAnim - 42) / 6) * (-4.37-(20)));
            zz = 0 + (((tickAnim - 42) / 6) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(legleft4, legleft4.rotateAngleX + (float) Math.toRadians(xx), legleft4.rotateAngleY + (float) Math.toRadians(yy), legleft4.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 0) / 8) * (0-(0)));
            yy = -20 + (((tickAnim - 0) / 8) * (12.5-(-20)));
            zz = 0 + (((tickAnim - 0) / 8) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 12) {
            xx = 0 + (((tickAnim - 8) / 4) * (-1.15091-(0)));
            yy = 12.5 + (((tickAnim - 8) / 4) * (-3.67456-(12.5)));
            zz = 0 + (((tickAnim - 8) / 4) * (7.58729-(0)));
        }
        else if (tickAnim >= 12 && tickAnim < 16) {
            xx = -1.15091 + (((tickAnim - 12) / 4) * (0-(-1.15091)));
            yy = -3.67456 + (((tickAnim - 12) / 4) * (-20-(-3.67456)));
            zz = 7.58729 + (((tickAnim - 12) / 4) * (0-(7.58729)));
        }
        else if (tickAnim >= 16 && tickAnim < 24) {
            xx = 0 + (((tickAnim - 16) / 8) * (0-(0)));
            yy = -20 + (((tickAnim - 16) / 8) * (12.5-(-20)));
            zz = 0 + (((tickAnim - 16) / 8) * (0-(0)));
        }
        else if (tickAnim >= 24 && tickAnim < 28) {
            xx = 0 + (((tickAnim - 24) / 4) * (-1.15091-(0)));
            yy = 12.5 + (((tickAnim - 24) / 4) * (-3.67456-(12.5)));
            zz = 0 + (((tickAnim - 24) / 4) * (7.58729-(0)));
        }
        else if (tickAnim >= 28 && tickAnim < 32) {
            xx = -1.15091 + (((tickAnim - 28) / 4) * (0-(-1.15091)));
            yy = -3.67456 + (((tickAnim - 28) / 4) * (-20-(-3.67456)));
            zz = 7.58729 + (((tickAnim - 28) / 4) * (0-(7.58729)));
        }
        else if (tickAnim >= 32 && tickAnim < 40) {
            xx = 0 + (((tickAnim - 32) / 8) * (0-(0)));
            yy = -20 + (((tickAnim - 32) / 8) * (12.5-(-20)));
            zz = 0 + (((tickAnim - 32) / 8) * (0-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 44) {
            xx = 0 + (((tickAnim - 40) / 4) * (-1.15091-(0)));
            yy = 12.5 + (((tickAnim - 40) / 4) * (-3.67456-(12.5)));
            zz = 0 + (((tickAnim - 40) / 4) * (7.58729-(0)));
        }
        else if (tickAnim >= 44 && tickAnim < 48) {
            xx = -1.15091 + (((tickAnim - 44) / 4) * (0-(-1.15091)));
            yy = -3.67456 + (((tickAnim - 44) / 4) * (-20-(-3.67456)));
            zz = 7.58729 + (((tickAnim - 44) / 4) * (0-(7.58729)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(legright5, legright5.rotateAngleX + (float) Math.toRadians(xx), legright5.rotateAngleY + (float) Math.toRadians(yy), legright5.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 4) {
            xx = 0 + (((tickAnim - 0) / 4) * (-1.15091-(0)));
            yy = -12.5 + (((tickAnim - 0) / 4) * (3.67456-(-12.5)));
            zz = 0 + (((tickAnim - 0) / 4) * (-7.58729-(0)));
        }
        else if (tickAnim >= 4 && tickAnim < 8) {
            xx = -1.15091 + (((tickAnim - 4) / 4) * (0-(-1.15091)));
            yy = 3.67456 + (((tickAnim - 4) / 4) * (20-(3.67456)));
            zz = -7.58729 + (((tickAnim - 4) / 4) * (0-(-7.58729)));
        }
        else if (tickAnim >= 8 && tickAnim < 16) {
            xx = 0 + (((tickAnim - 8) / 8) * (0-(0)));
            yy = 20 + (((tickAnim - 8) / 8) * (-12.5-(20)));
            zz = 0 + (((tickAnim - 8) / 8) * (0-(0)));
        }
        else if (tickAnim >= 16 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 16) / 4) * (-1.15091-(0)));
            yy = -12.5 + (((tickAnim - 16) / 4) * (3.67456-(-12.5)));
            zz = 0 + (((tickAnim - 16) / 4) * (-7.58729-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 24) {
            xx = -1.15091 + (((tickAnim - 20) / 4) * (0-(-1.15091)));
            yy = 3.67456 + (((tickAnim - 20) / 4) * (20-(3.67456)));
            zz = -7.58729 + (((tickAnim - 20) / 4) * (0-(-7.58729)));
        }
        else if (tickAnim >= 24 && tickAnim < 32) {
            xx = 0 + (((tickAnim - 24) / 8) * (0-(0)));
            yy = 20 + (((tickAnim - 24) / 8) * (-12.5-(20)));
            zz = 0 + (((tickAnim - 24) / 8) * (0-(0)));
        }
        else if (tickAnim >= 32 && tickAnim < 36) {
            xx = 0 + (((tickAnim - 32) / 4) * (-1.15091-(0)));
            yy = -12.5 + (((tickAnim - 32) / 4) * (3.67456-(-12.5)));
            zz = 0 + (((tickAnim - 32) / 4) * (-7.58729-(0)));
        }
        else if (tickAnim >= 36 && tickAnim < 40) {
            xx = -1.15091 + (((tickAnim - 36) / 4) * (0-(-1.15091)));
            yy = 3.67456 + (((tickAnim - 36) / 4) * (20-(3.67456)));
            zz = -7.58729 + (((tickAnim - 36) / 4) * (0-(-7.58729)));
        }
        else if (tickAnim >= 40 && tickAnim < 48) {
            xx = 0 + (((tickAnim - 40) / 8) * (0-(0)));
            yy = 20 + (((tickAnim - 40) / 8) * (-12.5-(20)));
            zz = 0 + (((tickAnim - 40) / 8) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(legleft5, legleft5.rotateAngleX + (float) Math.toRadians(xx), legleft5.rotateAngleY + (float) Math.toRadians(yy), legleft5.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 6) {
            xx = 0 + (((tickAnim - 0) / 6) * (0-(0)));
            yy = -11.88 + (((tickAnim - 0) / 6) * (12.5-(-11.88)));
            zz = 0 + (((tickAnim - 0) / 6) * (0-(0)));
        }
        else if (tickAnim >= 6 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 6) / 4) * (-0.27059-(0)));
            yy = 12.5 + (((tickAnim - 6) / 4) * (-3.72037-(12.5)));
            zz = 0 + (((tickAnim - 6) / 4) * (12.50288-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 14) {
            xx = -0.27059 + (((tickAnim - 10) / 4) * (0-(-0.27059)));
            yy = -3.72037 + (((tickAnim - 10) / 4) * (-20-(-3.72037)));
            zz = 12.50288 + (((tickAnim - 10) / 4) * (0-(12.50288)));
        }
        else if (tickAnim >= 14 && tickAnim < 22) {
            xx = 0 + (((tickAnim - 14) / 8) * (0-(0)));
            yy = -20 + (((tickAnim - 14) / 8) * (12.5-(-20)));
            zz = 0 + (((tickAnim - 14) / 8) * (0-(0)));
        }
        else if (tickAnim >= 22 && tickAnim < 26) {
            xx = 0 + (((tickAnim - 22) / 4) * (-0.27059-(0)));
            yy = 12.5 + (((tickAnim - 22) / 4) * (-3.72037-(12.5)));
            zz = 0 + (((tickAnim - 22) / 4) * (12.50288-(0)));
        }
        else if (tickAnim >= 26 && tickAnim < 30) {
            xx = -0.27059 + (((tickAnim - 26) / 4) * (0-(-0.27059)));
            yy = -3.72037 + (((tickAnim - 26) / 4) * (-20-(-3.72037)));
            zz = 12.50288 + (((tickAnim - 26) / 4) * (0-(12.50288)));
        }
        else if (tickAnim >= 30 && tickAnim < 38) {
            xx = 0 + (((tickAnim - 30) / 8) * (0-(0)));
            yy = -20 + (((tickAnim - 30) / 8) * (12.5-(-20)));
            zz = 0 + (((tickAnim - 30) / 8) * (0-(0)));
        }
        else if (tickAnim >= 38 && tickAnim < 42) {
            xx = 0 + (((tickAnim - 38) / 4) * (-0.27059-(0)));
            yy = 12.5 + (((tickAnim - 38) / 4) * (-3.72037-(12.5)));
            zz = 0 + (((tickAnim - 38) / 4) * (12.50288-(0)));
        }
        else if (tickAnim >= 42 && tickAnim < 46) {
            xx = -0.27059 + (((tickAnim - 42) / 4) * (0-(-0.27059)));
            yy = -3.72037 + (((tickAnim - 42) / 4) * (-20-(-3.72037)));
            zz = 12.50288 + (((tickAnim - 42) / 4) * (0-(12.50288)));
        }
        else if (tickAnim >= 46 && tickAnim < 48) {
            xx = 0 + (((tickAnim - 46) / 2) * (0-(0)));
            yy = -20 + (((tickAnim - 46) / 2) * (-11.88-(-20)));
            zz = 0 + (((tickAnim - 46) / 2) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(legright6, legright6.rotateAngleX + (float) Math.toRadians(xx), legright6.rotateAngleY + (float) Math.toRadians(yy), legright6.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 2) {
            xx = -0.14 + (((tickAnim - 0) / 2) * (-0.27059-(-0.14)));
            yy = -4.39 + (((tickAnim - 0) / 2) * (3.72037-(-4.39)));
            zz = -6.25 + (((tickAnim - 0) / 2) * (-12.50288-(-6.25)));
        }
        else if (tickAnim >= 2 && tickAnim < 6) {
            xx = -0.27059 + (((tickAnim - 2) / 4) * (0-(-0.27059)));
            yy = 3.72037 + (((tickAnim - 2) / 4) * (20-(3.72037)));
            zz = -12.50288 + (((tickAnim - 2) / 4) * (0-(-12.50288)));
        }
        else if (tickAnim >= 6 && tickAnim < 14) {
            xx = 0 + (((tickAnim - 6) / 8) * (0-(0)));
            yy = 20 + (((tickAnim - 6) / 8) * (-12.5-(20)));
            zz = 0 + (((tickAnim - 6) / 8) * (0-(0)));
        }
        else if (tickAnim >= 14 && tickAnim < 18) {
            xx = 0 + (((tickAnim - 14) / 4) * (-0.27059-(0)));
            yy = -12.5 + (((tickAnim - 14) / 4) * (3.72037-(-12.5)));
            zz = 0 + (((tickAnim - 14) / 4) * (-12.50288-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 22) {
            xx = -0.27059 + (((tickAnim - 18) / 4) * (0-(-0.27059)));
            yy = 3.72037 + (((tickAnim - 18) / 4) * (20-(3.72037)));
            zz = -12.50288 + (((tickAnim - 18) / 4) * (0-(-12.50288)));
        }
        else if (tickAnim >= 22 && tickAnim < 30) {
            xx = 0 + (((tickAnim - 22) / 8) * (0-(0)));
            yy = 20 + (((tickAnim - 22) / 8) * (-12.5-(20)));
            zz = 0 + (((tickAnim - 22) / 8) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 34) {
            xx = 0 + (((tickAnim - 30) / 4) * (-0.27059-(0)));
            yy = -12.5 + (((tickAnim - 30) / 4) * (3.72037-(-12.5)));
            zz = 0 + (((tickAnim - 30) / 4) * (-12.50288-(0)));
        }
        else if (tickAnim >= 34 && tickAnim < 38) {
            xx = -0.27059 + (((tickAnim - 34) / 4) * (0-(-0.27059)));
            yy = 3.72037 + (((tickAnim - 34) / 4) * (20-(3.72037)));
            zz = -12.50288 + (((tickAnim - 34) / 4) * (0-(-12.50288)));
        }
        else if (tickAnim >= 38 && tickAnim < 46) {
            xx = 0 + (((tickAnim - 38) / 8) * (0-(0)));
            yy = 20 + (((tickAnim - 38) / 8) * (-12.5-(20)));
            zz = 0 + (((tickAnim - 38) / 8) * (0-(0)));
        }
        else if (tickAnim >= 46 && tickAnim < 48) {
            xx = 0 + (((tickAnim - 46) / 2) * (-0.14-(0)));
            yy = -12.5 + (((tickAnim - 46) / 2) * (-4.39-(-12.5)));
            zz = 0 + (((tickAnim - 46) / 2) * (-6.25-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(legleft6, legleft6.rotateAngleX + (float) Math.toRadians(xx), legleft6.rotateAngleY + (float) Math.toRadians(yy), legleft6.rotateAngleZ + (float) Math.toRadians(zz));



        this.setRotateAngle(body3, body3.rotateAngleX + (float) Math.toRadians(0), body3.rotateAngleY + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*(376*2)))), body3.rotateAngleZ + (float) Math.toRadians(0));



        if (tickAnim >= 0 && tickAnim < 4) {
            xx = 0 + (((tickAnim - 0) / 4) * (0-(0)));
            yy = -2.5 + (((tickAnim - 0) / 4) * (15-(-2.5)));
            zz = 0 + (((tickAnim - 0) / 4) * (0-(0)));
        }
        else if (tickAnim >= 4 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 4) / 4) * (1.50701-(0)));
            yy = 15 + (((tickAnim - 4) / 4) * (-2.73196-(15)));
            zz = 0 + (((tickAnim - 4) / 4) * (17.56274-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 12) {
            xx = 1.50701 + (((tickAnim - 8) / 4) * (0-(1.50701)));
            yy = -2.73196 + (((tickAnim - 8) / 4) * (-20-(-2.73196)));
            zz = 17.56274 + (((tickAnim - 8) / 4) * (0-(17.56274)));
        }
        else if (tickAnim >= 12 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 12) / 8) * (0-(0)));
            yy = -20 + (((tickAnim - 12) / 8) * (15-(-20)));
            zz = 0 + (((tickAnim - 12) / 8) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 24) {
            xx = 0 + (((tickAnim - 20) / 4) * (1.50701-(0)));
            yy = 15 + (((tickAnim - 20) / 4) * (-2.73196-(15)));
            zz = 0 + (((tickAnim - 20) / 4) * (17.56274-(0)));
        }
        else if (tickAnim >= 24 && tickAnim < 28) {
            xx = 1.50701 + (((tickAnim - 24) / 4) * (0-(1.50701)));
            yy = -2.73196 + (((tickAnim - 24) / 4) * (-20-(-2.73196)));
            zz = 17.56274 + (((tickAnim - 24) / 4) * (0-(17.56274)));
        }
        else if (tickAnim >= 28 && tickAnim < 36) {
            xx = 0 + (((tickAnim - 28) / 8) * (0-(0)));
            yy = -20 + (((tickAnim - 28) / 8) * (15-(-20)));
            zz = 0 + (((tickAnim - 28) / 8) * (0-(0)));
        }
        else if (tickAnim >= 36 && tickAnim < 40) {
            xx = 0 + (((tickAnim - 36) / 4) * (1.50701-(0)));
            yy = 15 + (((tickAnim - 36) / 4) * (-2.73196-(15)));
            zz = 0 + (((tickAnim - 36) / 4) * (17.56274-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 44) {
            xx = 1.50701 + (((tickAnim - 40) / 4) * (0-(1.50701)));
            yy = -2.73196 + (((tickAnim - 40) / 4) * (-20-(-2.73196)));
            zz = 17.56274 + (((tickAnim - 40) / 4) * (0-(17.56274)));
        }
        else if (tickAnim >= 44 && tickAnim < 48) {
            xx = 0 + (((tickAnim - 44) / 4) * (0-(0)));
            yy = -20 + (((tickAnim - 44) / 4) * (-2.5-(-20)));
            zz = 0 + (((tickAnim - 44) / 4) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(legright7, legright7.rotateAngleX + (float) Math.toRadians(xx), legright7.rotateAngleY + (float) Math.toRadians(yy), legright7.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 4) {
            xx = 1.50701 + (((tickAnim - 0) / 4) * (0-(1.50701)));
            yy = 2.73196 + (((tickAnim - 0) / 4) * (20-(2.73196)));
            zz = -17.56274 + (((tickAnim - 0) / 4) * (0-(-17.56274)));
        }
        else if (tickAnim >= 4 && tickAnim < 12) {
            xx = 0 + (((tickAnim - 4) / 8) * (0-(0)));
            yy = 20 + (((tickAnim - 4) / 8) * (-15-(20)));
            zz = 0 + (((tickAnim - 4) / 8) * (0-(0)));
        }
        else if (tickAnim >= 12 && tickAnim < 16) {
            xx = 0 + (((tickAnim - 12) / 4) * (1.50701-(0)));
            yy = -15 + (((tickAnim - 12) / 4) * (2.73196-(-15)));
            zz = 0 + (((tickAnim - 12) / 4) * (-17.56274-(0)));
        }
        else if (tickAnim >= 16 && tickAnim < 20) {
            xx = 1.50701 + (((tickAnim - 16) / 4) * (0-(1.50701)));
            yy = 2.73196 + (((tickAnim - 16) / 4) * (20-(2.73196)));
            zz = -17.56274 + (((tickAnim - 16) / 4) * (0-(-17.56274)));
        }
        else if (tickAnim >= 20 && tickAnim < 28) {
            xx = 0 + (((tickAnim - 20) / 8) * (0-(0)));
            yy = 20 + (((tickAnim - 20) / 8) * (-15-(20)));
            zz = 0 + (((tickAnim - 20) / 8) * (0-(0)));
        }
        else if (tickAnim >= 28 && tickAnim < 32) {
            xx = 0 + (((tickAnim - 28) / 4) * (1.50701-(0)));
            yy = -15 + (((tickAnim - 28) / 4) * (2.73196-(-15)));
            zz = 0 + (((tickAnim - 28) / 4) * (-17.56274-(0)));
        }
        else if (tickAnim >= 32 && tickAnim < 36) {
            xx = 1.50701 + (((tickAnim - 32) / 4) * (0-(1.50701)));
            yy = 2.73196 + (((tickAnim - 32) / 4) * (20-(2.73196)));
            zz = -17.56274 + (((tickAnim - 32) / 4) * (0-(-17.56274)));
        }
        else if (tickAnim >= 36 && tickAnim < 44) {
            xx = 0 + (((tickAnim - 36) / 8) * (0-(0)));
            yy = 20 + (((tickAnim - 36) / 8) * (-15-(20)));
            zz = 0 + (((tickAnim - 36) / 8) * (0-(0)));
        }
        else if (tickAnim >= 44 && tickAnim < 48) {
            xx = 0 + (((tickAnim - 44) / 4) * (1.50701-(0)));
            yy = -15 + (((tickAnim - 44) / 4) * (2.73196-(-15)));
            zz = 0 + (((tickAnim - 44) / 4) * (-17.56274-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(legleft7, legleft7.rotateAngleX + (float) Math.toRadians(xx), legleft7.rotateAngleY + (float) Math.toRadians(yy), legleft7.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 2) {
            xx = 0 + (((tickAnim - 0) / 2) * (0-(0)));
            yy = 4.37 + (((tickAnim - 0) / 2) * (12.5-(4.37)));
            zz = 0 + (((tickAnim - 0) / 2) * (0-(0)));
        }
        else if (tickAnim >= 2 && tickAnim < 6) {
            xx = 0 + (((tickAnim - 2) / 4) * (2.64993-(0)));
            yy = 12.5 + (((tickAnim - 2) / 4) * (-4.15793-(12.5)));
            zz = 0 + (((tickAnim - 2) / 4) * (17.69329-(0)));
        }
        else if (tickAnim >= 6 && tickAnim < 10) {
            xx = 2.64993 + (((tickAnim - 6) / 4) * (0-(2.64993)));
            yy = -4.15793 + (((tickAnim - 6) / 4) * (-20-(-4.15793)));
            zz = 17.69329 + (((tickAnim - 6) / 4) * (0-(17.69329)));
        }
        else if (tickAnim >= 10 && tickAnim < 18) {
            xx = 0 + (((tickAnim - 10) / 8) * (0-(0)));
            yy = -20 + (((tickAnim - 10) / 8) * (12.5-(-20)));
            zz = 0 + (((tickAnim - 10) / 8) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 22) {
            xx = 0 + (((tickAnim - 18) / 4) * (2.64993-(0)));
            yy = 12.5 + (((tickAnim - 18) / 4) * (-4.15793-(12.5)));
            zz = 0 + (((tickAnim - 18) / 4) * (17.69329-(0)));
        }
        else if (tickAnim >= 22 && tickAnim < 26) {
            xx = 2.64993 + (((tickAnim - 22) / 4) * (0-(2.64993)));
            yy = -4.15793 + (((tickAnim - 22) / 4) * (-20-(-4.15793)));
            zz = 17.69329 + (((tickAnim - 22) / 4) * (0-(17.69329)));
        }
        else if (tickAnim >= 26 && tickAnim < 34) {
            xx = 0 + (((tickAnim - 26) / 8) * (0-(0)));
            yy = -20 + (((tickAnim - 26) / 8) * (12.5-(-20)));
            zz = 0 + (((tickAnim - 26) / 8) * (0-(0)));
        }
        else if (tickAnim >= 34 && tickAnim < 38) {
            xx = 0 + (((tickAnim - 34) / 4) * (2.64993-(0)));
            yy = 12.5 + (((tickAnim - 34) / 4) * (-4.15793-(12.5)));
            zz = 0 + (((tickAnim - 34) / 4) * (17.69329-(0)));
        }
        else if (tickAnim >= 38 && tickAnim < 42) {
            xx = 2.64993 + (((tickAnim - 38) / 4) * (0-(2.64993)));
            yy = -4.15793 + (((tickAnim - 38) / 4) * (-20-(-4.15793)));
            zz = 17.69329 + (((tickAnim - 38) / 4) * (0-(17.69329)));
        }
        else if (tickAnim >= 42 && tickAnim < 48) {
            xx = 0 + (((tickAnim - 42) / 6) * (0-(0)));
            yy = -20 + (((tickAnim - 42) / 6) * (4.37-(-20)));
            zz = 0 + (((tickAnim - 42) / 6) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(legright8, legright8.rotateAngleX + (float) Math.toRadians(xx), legright8.rotateAngleY + (float) Math.toRadians(yy), legright8.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 2) {
            xx = 1.32 + (((tickAnim - 0) / 2) * (0-(1.32)));
            yy = 12.08 + (((tickAnim - 0) / 2) * (20-(12.08)));
            zz = -8.85 + (((tickAnim - 0) / 2) * (0-(-8.85)));
        }
        else if (tickAnim >= 2 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 2) / 8) * (0-(0)));
            yy = 20 + (((tickAnim - 2) / 8) * (-12.5-(20)));
            zz = 0 + (((tickAnim - 2) / 8) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 14) {
            xx = 0 + (((tickAnim - 10) / 4) * (2.64993-(0)));
            yy = -12.5 + (((tickAnim - 10) / 4) * (4.15793-(-12.5)));
            zz = 0 + (((tickAnim - 10) / 4) * (-17.69329-(0)));
        }
        else if (tickAnim >= 14 && tickAnim < 18) {
            xx = 2.64993 + (((tickAnim - 14) / 4) * (0-(2.64993)));
            yy = 4.15793 + (((tickAnim - 14) / 4) * (20-(4.15793)));
            zz = -17.69329 + (((tickAnim - 14) / 4) * (0-(-17.69329)));
        }
        else if (tickAnim >= 18 && tickAnim < 26) {
            xx = 0 + (((tickAnim - 18) / 8) * (0-(0)));
            yy = 20 + (((tickAnim - 18) / 8) * (-12.5-(20)));
            zz = 0 + (((tickAnim - 18) / 8) * (0-(0)));
        }
        else if (tickAnim >= 26 && tickAnim < 30) {
            xx = 0 + (((tickAnim - 26) / 4) * (2.64993-(0)));
            yy = -12.5 + (((tickAnim - 26) / 4) * (4.15793-(-12.5)));
            zz = 0 + (((tickAnim - 26) / 4) * (-17.69329-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 34) {
            xx = 2.64993 + (((tickAnim - 30) / 4) * (0-(2.64993)));
            yy = 4.15793 + (((tickAnim - 30) / 4) * (20-(4.15793)));
            zz = -17.69329 + (((tickAnim - 30) / 4) * (0-(-17.69329)));
        }
        else if (tickAnim >= 34 && tickAnim < 42) {
            xx = 0 + (((tickAnim - 34) / 8) * (0-(0)));
            yy = 20 + (((tickAnim - 34) / 8) * (-12.5-(20)));
            zz = 0 + (((tickAnim - 34) / 8) * (0-(0)));
        }
        else if (tickAnim >= 42 && tickAnim < 46) {
            xx = 0 + (((tickAnim - 42) / 4) * (2.64993-(0)));
            yy = -12.5 + (((tickAnim - 42) / 4) * (4.15793-(-12.5)));
            zz = 0 + (((tickAnim - 42) / 4) * (-17.69329-(0)));
        }
        else if (tickAnim >= 46 && tickAnim < 48) {
            xx = 2.64993 + (((tickAnim - 46) / 2) * (1.32-(2.64993)));
            yy = 4.15793 + (((tickAnim - 46) / 2) * (12.08-(4.15793)));
            zz = -17.69329 + (((tickAnim - 46) / 2) * (-8.85-(-17.69329)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(legleft8, legleft8.rotateAngleX + (float) Math.toRadians(xx), legleft8.rotateAngleY + (float) Math.toRadians(yy), legleft8.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 4) {
            xx = 0 + (((tickAnim - 0) / 4) * (8.08157-(0)));
            yy = 12.5 + (((tickAnim - 0) / 4) * (5.1843-(12.5)));
            zz = 0 + (((tickAnim - 0) / 4) * (16.99444-(0)));
        }
        else if (tickAnim >= 4 && tickAnim < 8) {
            xx = 8.08157 + (((tickAnim - 4) / 4) * (0-(8.08157)));
            yy = 5.1843 + (((tickAnim - 4) / 4) * (-20-(5.1843)));
            zz = 16.99444 + (((tickAnim - 4) / 4) * (0-(16.99444)));
        }
        else if (tickAnim >= 8 && tickAnim < 16) {
            xx = 0 + (((tickAnim - 8) / 8) * (0-(0)));
            yy = -20 + (((tickAnim - 8) / 8) * (12.5-(-20)));
            zz = 0 + (((tickAnim - 8) / 8) * (0-(0)));
        }
        else if (tickAnim >= 16 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 16) / 4) * (8.08157-(0)));
            yy = 12.5 + (((tickAnim - 16) / 4) * (5.1843-(12.5)));
            zz = 0 + (((tickAnim - 16) / 4) * (16.99444-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 24) {
            xx = 8.08157 + (((tickAnim - 20) / 4) * (0-(8.08157)));
            yy = 5.1843 + (((tickAnim - 20) / 4) * (-20-(5.1843)));
            zz = 16.99444 + (((tickAnim - 20) / 4) * (0-(16.99444)));
        }
        else if (tickAnim >= 24 && tickAnim < 32) {
            xx = 0 + (((tickAnim - 24) / 8) * (0-(0)));
            yy = -20 + (((tickAnim - 24) / 8) * (12.5-(-20)));
            zz = 0 + (((tickAnim - 24) / 8) * (0-(0)));
        }
        else if (tickAnim >= 32 && tickAnim < 36) {
            xx = 0 + (((tickAnim - 32) / 4) * (8.08157-(0)));
            yy = 12.5 + (((tickAnim - 32) / 4) * (5.1843-(12.5)));
            zz = 0 + (((tickAnim - 32) / 4) * (16.99444-(0)));
        }
        else if (tickAnim >= 36 && tickAnim < 40) {
            xx = 8.08157 + (((tickAnim - 36) / 4) * (0-(8.08157)));
            yy = 5.1843 + (((tickAnim - 36) / 4) * (-20-(5.1843)));
            zz = 16.99444 + (((tickAnim - 36) / 4) * (0-(16.99444)));
        }
        else if (tickAnim >= 40 && tickAnim < 48) {
            xx = 0 + (((tickAnim - 40) / 8) * (0-(0)));
            yy = -20 + (((tickAnim - 40) / 8) * (12.5-(-20)));
            zz = 0 + (((tickAnim - 40) / 8) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(legright9, legright9.rotateAngleX + (float) Math.toRadians(xx), legright9.rotateAngleY + (float) Math.toRadians(yy), legright9.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 0) / 8) * (0-(0)));
            yy = 20 + (((tickAnim - 0) / 8) * (-12.5-(20)));
            zz = 0 + (((tickAnim - 0) / 8) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 12) {
            xx = 0 + (((tickAnim - 8) / 4) * (8.08157-(0)));
            yy = -12.5 + (((tickAnim - 8) / 4) * (-5.1843-(-12.5)));
            zz = 0 + (((tickAnim - 8) / 4) * (-16.99444-(0)));
        }
        else if (tickAnim >= 12 && tickAnim < 16) {
            xx = 8.08157 + (((tickAnim - 12) / 4) * (0-(8.08157)));
            yy = -5.1843 + (((tickAnim - 12) / 4) * (20-(-5.1843)));
            zz = -16.99444 + (((tickAnim - 12) / 4) * (0-(-16.99444)));
        }
        else if (tickAnim >= 16 && tickAnim < 24) {
            xx = 0 + (((tickAnim - 16) / 8) * (0-(0)));
            yy = 20 + (((tickAnim - 16) / 8) * (-12.5-(20)));
            zz = 0 + (((tickAnim - 16) / 8) * (0-(0)));
        }
        else if (tickAnim >= 24 && tickAnim < 28) {
            xx = 0 + (((tickAnim - 24) / 4) * (8.08157-(0)));
            yy = -12.5 + (((tickAnim - 24) / 4) * (-5.1843-(-12.5)));
            zz = 0 + (((tickAnim - 24) / 4) * (-16.99444-(0)));
        }
        else if (tickAnim >= 28 && tickAnim < 32) {
            xx = 8.08157 + (((tickAnim - 28) / 4) * (0-(8.08157)));
            yy = -5.1843 + (((tickAnim - 28) / 4) * (20-(-5.1843)));
            zz = -16.99444 + (((tickAnim - 28) / 4) * (0-(-16.99444)));
        }
        else if (tickAnim >= 32 && tickAnim < 40) {
            xx = 0 + (((tickAnim - 32) / 8) * (0-(0)));
            yy = 20 + (((tickAnim - 32) / 8) * (-12.5-(20)));
            zz = 0 + (((tickAnim - 32) / 8) * (0-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 44) {
            xx = 0 + (((tickAnim - 40) / 4) * (8.08157-(0)));
            yy = -12.5 + (((tickAnim - 40) / 4) * (-5.1843-(-12.5)));
            zz = 0 + (((tickAnim - 40) / 4) * (-16.99444-(0)));
        }
        else if (tickAnim >= 44 && tickAnim < 48) {
            xx = 8.08157 + (((tickAnim - 44) / 4) * (0-(8.08157)));
            yy = -5.1843 + (((tickAnim - 44) / 4) * (20-(-5.1843)));
            zz = -16.99444 + (((tickAnim - 44) / 4) * (0-(-16.99444)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(legleft9, legleft9.rotateAngleX + (float) Math.toRadians(xx), legleft9.rotateAngleY + (float) Math.toRadians(yy), legleft9.rotateAngleZ + (float) Math.toRadians(zz));



        this.setRotateAngle(ultimatelegright, ultimatelegright.rotateAngleX + (float) Math.toRadians(0), ultimatelegright.rotateAngleY + (float) Math.toRadians(-(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*(376*2))))*3), ultimatelegright.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(ultimatelegleft, ultimatelegleft.rotateAngleX + (float) Math.toRadians(0), ultimatelegleft.rotateAngleY + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*(376*2)))), ultimatelegleft.rotateAngleZ + (float) Math.toRadians(0));
        

    }

    public void animRun(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime) {
        EntityPrehistoricFloraMyriapod entity = (EntityPrehistoricFloraMyriapod) entitylivingbaseIn;
        int animCycle = 19;
        double tickAnim = (entity.ticksExisted + entity.getTickOffset()) - (int) (Math.floor((double) (entity.ticksExisted + entity.getTickOffset()) / (double) animCycle) * (double) animCycle) + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;
        this.setRotateAngle(body, body.rotateAngleX + (float) Math.toRadians((Math.sin((Math.PI/180)*((((double)tickAnim/20D))*(376*2))-90))), body.rotateAngleY + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*(376*2)))), body.rotateAngleZ + (float) Math.toRadians(0));



        if (tickAnim >= 0 && tickAnim < 2) {
            xx = 2.35666 + (((tickAnim - 0) / 2) * (-25.61151-(2.35666)));
            yy = 40.15449 + (((tickAnim - 0) / 2) * (16.35611-(40.15449)));
            zz = -7.85952 + (((tickAnim - 0) / 2) * (31.96162-(-7.85952)));
        }
        else if (tickAnim >= 2 && tickAnim < 3) {
            xx = -25.61151 + (((tickAnim - 2) / 1) * (-10.60369-(-25.61151)));
            yy = 16.35611 + (((tickAnim - 2) / 1) * (-19.33731-(16.35611)));
            zz = 31.96162 + (((tickAnim - 2) / 1) * (10.87348-(31.96162)));
        }
        else if (tickAnim >= 3 && tickAnim < 6) {
            xx = -10.60369 + (((tickAnim - 3) / 3) * (2.35666-(-10.60369)));
            yy = -19.33731 + (((tickAnim - 3) / 3) * (40.15449-(-19.33731)));
            zz = 10.87348 + (((tickAnim - 3) / 3) * (-7.85952-(10.87348)));
        }
        else if (tickAnim >= 6 && tickAnim < 8) {
            xx = 2.35666 + (((tickAnim - 6) / 2) * (-25.61151-(2.35666)));
            yy = 40.15449 + (((tickAnim - 6) / 2) * (16.35611-(40.15449)));
            zz = -7.85952 + (((tickAnim - 6) / 2) * (31.96162-(-7.85952)));
        }
        else if (tickAnim >= 8 && tickAnim < 10) {
            xx = -25.61151 + (((tickAnim - 8) / 2) * (-10.60369-(-25.61151)));
            yy = 16.35611 + (((tickAnim - 8) / 2) * (-19.33731-(16.35611)));
            zz = 31.96162 + (((tickAnim - 8) / 2) * (10.87348-(31.96162)));
        }
        else if (tickAnim >= 10 && tickAnim < 13) {
            xx = -10.60369 + (((tickAnim - 10) / 3) * (2.35666-(-10.60369)));
            yy = -19.33731 + (((tickAnim - 10) / 3) * (40.15449-(-19.33731)));
            zz = 10.87348 + (((tickAnim - 10) / 3) * (-7.85952-(10.87348)));
        }
        else if (tickAnim >= 13 && tickAnim < 14) {
            xx = 2.35666 + (((tickAnim - 13) / 1) * (-25.61151-(2.35666)));
            yy = 40.15449 + (((tickAnim - 13) / 1) * (16.35611-(40.15449)));
            zz = -7.85952 + (((tickAnim - 13) / 1) * (31.96162-(-7.85952)));
        }
        else if (tickAnim >= 14 && tickAnim < 16) {
            xx = -25.61151 + (((tickAnim - 14) / 2) * (-10.60369-(-25.61151)));
            yy = 16.35611 + (((tickAnim - 14) / 2) * (-19.33731-(16.35611)));
            zz = 31.96162 + (((tickAnim - 14) / 2) * (10.87348-(31.96162)));
        }
        else if (tickAnim >= 16 && tickAnim < 19) {
            xx = -10.60369 + (((tickAnim - 16) / 3) * (2.35666-(-10.60369)));
            yy = -19.33731 + (((tickAnim - 16) / 3) * (40.15449-(-19.33731)));
            zz = 10.87348 + (((tickAnim - 16) / 3) * (-7.85952-(10.87348)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(legright, legright.rotateAngleX + (float) Math.toRadians(xx), legright.rotateAngleY + (float) Math.toRadians(yy), legright.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 3) {
            xx = -10.60369 + (((tickAnim - 0) / 3) * (2.35666-(-10.60369)));
            yy = 19.33731 + (((tickAnim - 0) / 3) * (-40.15449-(19.33731)));
            zz = -10.87348 + (((tickAnim - 0) / 3) * (7.85952-(-10.87348)));
        }
        else if (tickAnim >= 3 && tickAnim < 5) {
            xx = 2.35666 + (((tickAnim - 3) / 2) * (-25.61151-(2.35666)));
            yy = -40.15449 + (((tickAnim - 3) / 2) * (-16.35611-(-40.15449)));
            zz = 7.85952 + (((tickAnim - 3) / 2) * (-31.96162-(7.85952)));
        }
        else if (tickAnim >= 5 && tickAnim < 6) {
            xx = -25.61151 + (((tickAnim - 5) / 1) * (-10.60369-(-25.61151)));
            yy = -16.35611 + (((tickAnim - 5) / 1) * (19.33731-(-16.35611)));
            zz = -31.96162 + (((tickAnim - 5) / 1) * (-10.87348-(-31.96162)));
        }
        else if (tickAnim >= 6 && tickAnim < 10) {
            xx = -10.60369 + (((tickAnim - 6) / 4) * (2.35666-(-10.60369)));
            yy = 19.33731 + (((tickAnim - 6) / 4) * (-40.15449-(19.33731)));
            zz = -10.87348 + (((tickAnim - 6) / 4) * (7.85952-(-10.87348)));
        }
        else if (tickAnim >= 10 && tickAnim < 11) {
            xx = 2.35666 + (((tickAnim - 10) / 1) * (-25.61151-(2.35666)));
            yy = -40.15449 + (((tickAnim - 10) / 1) * (-16.35611-(-40.15449)));
            zz = 7.85952 + (((tickAnim - 10) / 1) * (-31.96162-(7.85952)));
        }
        else if (tickAnim >= 11 && tickAnim < 13) {
            xx = -25.61151 + (((tickAnim - 11) / 2) * (-10.60369-(-25.61151)));
            yy = -16.35611 + (((tickAnim - 11) / 2) * (19.33731-(-16.35611)));
            zz = -31.96162 + (((tickAnim - 11) / 2) * (-10.87348-(-31.96162)));
        }
        else if (tickAnim >= 13 && tickAnim < 16) {
            xx = -10.60369 + (((tickAnim - 13) / 3) * (2.35666-(-10.60369)));
            yy = 19.33731 + (((tickAnim - 13) / 3) * (-40.15449-(19.33731)));
            zz = -10.87348 + (((tickAnim - 13) / 3) * (7.85952-(-10.87348)));
        }
        else if (tickAnim >= 16 && tickAnim < 18) {
            xx = 2.35666 + (((tickAnim - 16) / 2) * (-25.61151-(2.35666)));
            yy = -40.15449 + (((tickAnim - 16) / 2) * (-16.35611-(-40.15449)));
            zz = 7.85952 + (((tickAnim - 16) / 2) * (-31.96162-(7.85952)));
        }
        else if (tickAnim >= 18 && tickAnim < 19) {
            xx = -25.61151 + (((tickAnim - 18) / 1) * (-10.60369-(-25.61151)));
            yy = -16.35611 + (((tickAnim - 18) / 1) * (19.33731-(-16.35611)));
            zz = -31.96162 + (((tickAnim - 18) / 1) * (-10.87348-(-31.96162)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(legleft, legleft.rotateAngleX + (float) Math.toRadians(xx), legleft.rotateAngleY + (float) Math.toRadians(yy), legleft.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 1) {
            xx = -7.88 + (((tickAnim - 0) / 1) * (-15.76886-(-7.88)));
            yy = 19.88 + (((tickAnim - 0) / 1) * (9.767-(19.88)));
            zz = 14.64 + (((tickAnim - 0) / 1) * (29.28473-(14.64)));
        }
        else if (tickAnim >= 1 && tickAnim < 2) {
            xx = -15.76886 + (((tickAnim - 1) / 1) * (0-(-15.76886)));
            yy = 9.767 + (((tickAnim - 1) / 1) * (-17.5-(9.767)));
            zz = 29.28473 + (((tickAnim - 1) / 1) * (0-(29.28473)));
        }
        else if (tickAnim >= 2 && tickAnim < 6) {
            xx = 0 + (((tickAnim - 2) / 4) * (0-(0)));
            yy = -17.5 + (((tickAnim - 2) / 4) * (30-(-17.5)));
            zz = 0 + (((tickAnim - 2) / 4) * (0-(0)));
        }
        else if (tickAnim >= 6 && tickAnim < 7) {
            xx = 0 + (((tickAnim - 6) / 1) * (-15.76886-(0)));
            yy = 30 + (((tickAnim - 6) / 1) * (9.767-(30)));
            zz = 0 + (((tickAnim - 6) / 1) * (29.28473-(0)));
        }
        else if (tickAnim >= 7 && tickAnim < 9) {
            xx = -15.76886 + (((tickAnim - 7) / 2) * (0-(-15.76886)));
            yy = 9.767 + (((tickAnim - 7) / 2) * (-17.5-(9.767)));
            zz = 29.28473 + (((tickAnim - 7) / 2) * (0-(29.28473)));
        }
        else if (tickAnim >= 9 && tickAnim < 12) {
            xx = 0 + (((tickAnim - 9) / 3) * (0-(0)));
            yy = -17.5 + (((tickAnim - 9) / 3) * (30-(-17.5)));
            zz = 0 + (((tickAnim - 9) / 3) * (0-(0)));
        }
        else if (tickAnim >= 12 && tickAnim < 14) {
            xx = 0 + (((tickAnim - 12) / 2) * (-15.76886-(0)));
            yy = 30 + (((tickAnim - 12) / 2) * (9.767-(30)));
            zz = 0 + (((tickAnim - 12) / 2) * (29.28473-(0)));
        }
        else if (tickAnim >= 14 && tickAnim < 15) {
            xx = -15.76886 + (((tickAnim - 14) / 1) * (0-(-15.76886)));
            yy = 9.767 + (((tickAnim - 14) / 1) * (-17.5-(9.767)));
            zz = 29.28473 + (((tickAnim - 14) / 1) * (0-(29.28473)));
        }
        else if (tickAnim >= 15 && tickAnim < 18) {
            xx = 0 + (((tickAnim - 15) / 3) * (0-(0)));
            yy = -17.5 + (((tickAnim - 15) / 3) * (30-(-17.5)));
            zz = 0 + (((tickAnim - 15) / 3) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 19) {
            xx = 0 + (((tickAnim - 18) / 1) * (-7.88-(0)));
            yy = 30 + (((tickAnim - 18) / 1) * (19.88-(30)));
            zz = 0 + (((tickAnim - 18) / 1) * (14.64-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(legright2, legright2.rotateAngleX + (float) Math.toRadians(xx), legright2.rotateAngleY + (float) Math.toRadians(yy), legright2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 2) {
            xx = 0 + (((tickAnim - 0) / 2) * (0-(0)));
            yy = 5.63 + (((tickAnim - 0) / 2) * (-30-(5.63)));
            zz = 0 + (((tickAnim - 0) / 2) * (0-(0)));
        }
        else if (tickAnim >= 2 && tickAnim < 4) {
            xx = 0 + (((tickAnim - 2) / 2) * (-15.76886-(0)));
            yy = -30 + (((tickAnim - 2) / 2) * (-9.767-(-30)));
            zz = 0 + (((tickAnim - 2) / 2) * (-29.28473-(0)));
        }
        else if (tickAnim >= 4 && tickAnim < 6) {
            xx = -15.76886 + (((tickAnim - 4) / 2) * (0-(-15.76886)));
            yy = -9.767 + (((tickAnim - 4) / 2) * (17.5-(-9.767)));
            zz = -29.28473 + (((tickAnim - 4) / 2) * (0-(-29.28473)));
        }
        else if (tickAnim >= 6 && tickAnim < 9) {
            xx = 0 + (((tickAnim - 6) / 3) * (0-(0)));
            yy = 17.5 + (((tickAnim - 6) / 3) * (-30-(17.5)));
            zz = 0 + (((tickAnim - 6) / 3) * (0-(0)));
        }
        else if (tickAnim >= 9 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 9) / 1) * (-15.76886-(0)));
            yy = -30 + (((tickAnim - 9) / 1) * (-9.767-(-30)));
            zz = 0 + (((tickAnim - 9) / 1) * (-29.28473-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 12) {
            xx = -15.76886 + (((tickAnim - 10) / 2) * (0-(-15.76886)));
            yy = -9.767 + (((tickAnim - 10) / 2) * (17.5-(-9.767)));
            zz = -29.28473 + (((tickAnim - 10) / 2) * (0-(-29.28473)));
        }
        else if (tickAnim >= 12 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 12) / 3) * (0-(0)));
            yy = 17.5 + (((tickAnim - 12) / 3) * (-30-(17.5)));
            zz = 0 + (((tickAnim - 12) / 3) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 17) {
            xx = 0 + (((tickAnim - 15) / 2) * (-15.76886-(0)));
            yy = -30 + (((tickAnim - 15) / 2) * (-9.767-(-30)));
            zz = 0 + (((tickAnim - 15) / 2) * (-29.28473-(0)));
        }
        else if (tickAnim >= 17 && tickAnim < 18) {
            xx = -15.76886 + (((tickAnim - 17) / 1) * (0-(-15.76886)));
            yy = -9.767 + (((tickAnim - 17) / 1) * (17.5-(-9.767)));
            zz = -29.28473 + (((tickAnim - 17) / 1) * (0-(-29.28473)));
        }
        else if (tickAnim >= 18 && tickAnim < 19) {
            xx = 0 + (((tickAnim - 18) / 1) * (0-(0)));
            yy = 17.5 + (((tickAnim - 18) / 1) * (5.63-(17.5)));
            zz = 0 + (((tickAnim - 18) / 1) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(legleft2, legleft2.rotateAngleX + (float) Math.toRadians(xx), legleft2.rotateAngleY + (float) Math.toRadians(yy), legleft2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 2) {
            xx = -7.40148 + (((tickAnim - 0) / 2) * (0-(-7.40148)));
            yy = 2.72421 + (((tickAnim - 0) / 2) * (-20-(2.72421)));
            zz = 23.62591 + (((tickAnim - 0) / 2) * (0-(23.62591)));
        }
        else if (tickAnim >= 2 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 2) / 3) * (0-(0)));
            yy = -20 + (((tickAnim - 2) / 3) * (22.5-(-20)));
            zz = 0 + (((tickAnim - 2) / 3) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 6) {
            xx = 0 + (((tickAnim - 5) / 1) * (-7.40148-(0)));
            yy = 22.5 + (((tickAnim - 5) / 1) * (2.72421-(22.5)));
            zz = 0 + (((tickAnim - 5) / 1) * (23.62591-(0)));
        }
        else if (tickAnim >= 6 && tickAnim < 8) {
            xx = -7.40148 + (((tickAnim - 6) / 2) * (0-(-7.40148)));
            yy = 2.72421 + (((tickAnim - 6) / 2) * (-20-(2.72421)));
            zz = 23.62591 + (((tickAnim - 6) / 2) * (0-(23.62591)));
        }
        else if (tickAnim >= 8 && tickAnim < 11) {
            xx = 0 + (((tickAnim - 8) / 3) * (0-(0)));
            yy = -20 + (((tickAnim - 8) / 3) * (22.5-(-20)));
            zz = 0 + (((tickAnim - 8) / 3) * (0-(0)));
        }
        else if (tickAnim >= 11 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 11) / 2) * (-7.40148-(0)));
            yy = 22.5 + (((tickAnim - 11) / 2) * (2.72421-(22.5)));
            zz = 0 + (((tickAnim - 11) / 2) * (23.62591-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 14) {
            xx = -7.40148 + (((tickAnim - 13) / 1) * (0-(-7.40148)));
            yy = 2.72421 + (((tickAnim - 13) / 1) * (-20-(2.72421)));
            zz = 23.62591 + (((tickAnim - 13) / 1) * (0-(23.62591)));
        }
        else if (tickAnim >= 14 && tickAnim < 18) {
            xx = 0 + (((tickAnim - 14) / 4) * (0-(0)));
            yy = -20 + (((tickAnim - 14) / 4) * (22.5-(-20)));
            zz = 0 + (((tickAnim - 14) / 4) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 19) {
            xx = 0 + (((tickAnim - 18) / 1) * (-7.40148-(0)));
            yy = 22.5 + (((tickAnim - 18) / 1) * (2.72421-(22.5)));
            zz = 0 + (((tickAnim - 18) / 1) * (23.62591-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(legright3, legright3.rotateAngleX + (float) Math.toRadians(xx), legright3.rotateAngleY + (float) Math.toRadians(yy), legright3.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 2) {
            xx = 0 + (((tickAnim - 0) / 2) * (0-(0)));
            yy = -1.25 + (((tickAnim - 0) / 2) * (-22.5-(-1.25)));
            zz = 0 + (((tickAnim - 0) / 2) * (0-(0)));
        }
        else if (tickAnim >= 2 && tickAnim < 3) {
            xx = 0 + (((tickAnim - 2) / 1) * (-7.40148-(0)));
            yy = -22.5 + (((tickAnim - 2) / 1) * (-2.72421-(-22.5)));
            zz = 0 + (((tickAnim - 2) / 1) * (-23.62591-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 5) {
            xx = -7.40148 + (((tickAnim - 3) / 2) * (0-(-7.40148)));
            yy = -2.72421 + (((tickAnim - 3) / 2) * (20-(-2.72421)));
            zz = -23.62591 + (((tickAnim - 3) / 2) * (0-(-23.62591)));
        }
        else if (tickAnim >= 5 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 5) / 3) * (0-(0)));
            yy = 20 + (((tickAnim - 5) / 3) * (-22.5-(20)));
            zz = 0 + (((tickAnim - 5) / 3) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 8) / 2) * (-7.40148-(0)));
            yy = -22.5 + (((tickAnim - 8) / 2) * (-2.72421-(-22.5)));
            zz = 0 + (((tickAnim - 8) / 2) * (-23.62591-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 11) {
            xx = -7.40148 + (((tickAnim - 10) / 1) * (0-(-7.40148)));
            yy = -2.72421 + (((tickAnim - 10) / 1) * (20-(-2.72421)));
            zz = -23.62591 + (((tickAnim - 10) / 1) * (0-(-23.62591)));
        }
        else if (tickAnim >= 11 && tickAnim < 14) {
            xx = 0 + (((tickAnim - 11) / 3) * (0-(0)));
            yy = 20 + (((tickAnim - 11) / 3) * (-22.5-(20)));
            zz = 0 + (((tickAnim - 11) / 3) * (0-(0)));
        }
        else if (tickAnim >= 14 && tickAnim < 16) {
            xx = 0 + (((tickAnim - 14) / 2) * (-7.40148-(0)));
            yy = -22.5 + (((tickAnim - 14) / 2) * (-2.72421-(-22.5)));
            zz = 0 + (((tickAnim - 14) / 2) * (-23.62591-(0)));
        }
        else if (tickAnim >= 16 && tickAnim < 18) {
            xx = -7.40148 + (((tickAnim - 16) / 2) * (0-(-7.40148)));
            yy = -2.72421 + (((tickAnim - 16) / 2) * (20-(-2.72421)));
            zz = -23.62591 + (((tickAnim - 16) / 2) * (0-(-23.62591)));
        }
        else if (tickAnim >= 18 && tickAnim < 19) {
            xx = 0 + (((tickAnim - 18) / 1) * (0-(0)));
            yy = 20 + (((tickAnim - 18) / 1) * (-1.25-(20)));
            zz = 0 + (((tickAnim - 18) / 1) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(legleft3, legleft3.rotateAngleX + (float) Math.toRadians(xx), legleft3.rotateAngleY + (float) Math.toRadians(yy), legleft3.rotateAngleZ + (float) Math.toRadians(zz));



        this.setRotateAngle(antennaright, antennaright.rotateAngleX + (float) Math.toRadians(0), antennaright.rotateAngleY + (float) Math.toRadians(-(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*(376*2))))*3), antennaright.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(antennaleft, antennaleft.rotateAngleX + (float) Math.toRadians(0), antennaleft.rotateAngleY + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*(376*2)))*3), antennaleft.rotateAngleZ + (float) Math.toRadians(0));



        if (tickAnim >= 0 && tickAnim < 1) {
            xx = -0.94 + (((tickAnim - 0) / 1) * (0-(-0.94)));
            yy = -6.73 + (((tickAnim - 0) / 1) * (-20-(-6.73)));
            zz = 8.8 + (((tickAnim - 0) / 1) * (0-(8.8)));
        }
        else if (tickAnim >= 1 && tickAnim < 4) {
            xx = 0 + (((tickAnim - 1) / 3) * (0-(0)));
            yy = -20 + (((tickAnim - 1) / 3) * (12.5-(-20)));
            zz = 0 + (((tickAnim - 1) / 3) * (0-(0)));
        }
        else if (tickAnim >= 4 && tickAnim < 6) {
            xx = 0 + (((tickAnim - 4) / 2) * (-1.88622-(0)));
            yy = 12.5 + (((tickAnim - 4) / 2) * (6.54034-(12.5)));
            zz = 0 + (((tickAnim - 4) / 2) * (17.5982-(0)));
        }
        else if (tickAnim >= 6 && tickAnim < 7) {
            xx = -1.88622 + (((tickAnim - 6) / 1) * (0-(-1.88622)));
            yy = 6.54034 + (((tickAnim - 6) / 1) * (-20-(6.54034)));
            zz = 17.5982 + (((tickAnim - 6) / 1) * (0-(17.5982)));
        }
        else if (tickAnim >= 7 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 7) / 3) * (0-(0)));
            yy = -20 + (((tickAnim - 7) / 3) * (12.5-(-20)));
            zz = 0 + (((tickAnim - 7) / 3) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 12) {
            xx = 0 + (((tickAnim - 10) / 2) * (-1.88622-(0)));
            yy = 12.5 + (((tickAnim - 10) / 2) * (6.54034-(12.5)));
            zz = 0 + (((tickAnim - 10) / 2) * (17.5982-(0)));
        }
        else if (tickAnim >= 12 && tickAnim < 14) {
            xx = -1.88622 + (((tickAnim - 12) / 2) * (0-(-1.88622)));
            yy = 6.54034 + (((tickAnim - 12) / 2) * (-20-(6.54034)));
            zz = 17.5982 + (((tickAnim - 12) / 2) * (0-(17.5982)));
        }
        else if (tickAnim >= 14 && tickAnim < 17) {
            xx = 0 + (((tickAnim - 14) / 3) * (0-(0)));
            yy = -20 + (((tickAnim - 14) / 3) * (12.5-(-20)));
            zz = 0 + (((tickAnim - 14) / 3) * (0-(0)));
        }
        else if (tickAnim >= 17 && tickAnim < 18) {
            xx = 0 + (((tickAnim - 17) / 1) * (-1.88622-(0)));
            yy = 12.5 + (((tickAnim - 17) / 1) * (6.54034-(12.5)));
            zz = 0 + (((tickAnim - 17) / 1) * (17.5982-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 19) {
            xx = -1.88622 + (((tickAnim - 18) / 1) * (-0.94-(-1.88622)));
            yy = 6.54034 + (((tickAnim - 18) / 1) * (-6.73-(6.54034)));
            zz = 17.5982 + (((tickAnim - 18) / 1) * (8.8-(17.5982)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(legright4, legright4.rotateAngleX + (float) Math.toRadians(xx), legright4.rotateAngleY + (float) Math.toRadians(yy), legright4.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 1) {
            xx = 0 + (((tickAnim - 0) / 1) * (0-(0)));
            yy = -4.37 + (((tickAnim - 0) / 1) * (-12.5-(-4.37)));
            zz = 0 + (((tickAnim - 0) / 1) * (0-(0)));
        }
        else if (tickAnim >= 1 && tickAnim < 2) {
            xx = 0 + (((tickAnim - 1) / 1) * (-1.88622-(0)));
            yy = -12.5 + (((tickAnim - 1) / 1) * (-6.54034-(-12.5)));
            zz = 0 + (((tickAnim - 1) / 1) * (-17.5982-(0)));
        }
        else if (tickAnim >= 2 && tickAnim < 4) {
            xx = -1.88622 + (((tickAnim - 2) / 2) * (0-(-1.88622)));
            yy = -6.54034 + (((tickAnim - 2) / 2) * (20-(-6.54034)));
            zz = -17.5982 + (((tickAnim - 2) / 2) * (0-(-17.5982)));
        }
        else if (tickAnim >= 4 && tickAnim < 7) {
            xx = 0 + (((tickAnim - 4) / 3) * (0-(0)));
            yy = 20 + (((tickAnim - 4) / 3) * (-12.5-(20)));
            zz = 0 + (((tickAnim - 4) / 3) * (0-(0)));
        }
        else if (tickAnim >= 7 && tickAnim < 9) {
            xx = 0 + (((tickAnim - 7) / 2) * (-1.88622-(0)));
            yy = -12.5 + (((tickAnim - 7) / 2) * (-6.54034-(-12.5)));
            zz = 0 + (((tickAnim - 7) / 2) * (-17.5982-(0)));
        }
        else if (tickAnim >= 9 && tickAnim < 10) {
            xx = -1.88622 + (((tickAnim - 9) / 1) * (0-(-1.88622)));
            yy = -6.54034 + (((tickAnim - 9) / 1) * (20-(-6.54034)));
            zz = -17.5982 + (((tickAnim - 9) / 1) * (0-(-17.5982)));
        }
        else if (tickAnim >= 10 && tickAnim < 14) {
            xx = 0 + (((tickAnim - 10) / 4) * (0-(0)));
            yy = 20 + (((tickAnim - 10) / 4) * (-12.5-(20)));
            zz = 0 + (((tickAnim - 10) / 4) * (0-(0)));
        }
        else if (tickAnim >= 14 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 14) / 1) * (-1.88622-(0)));
            yy = -12.5 + (((tickAnim - 14) / 1) * (-6.54034-(-12.5)));
            zz = 0 + (((tickAnim - 14) / 1) * (-17.5982-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 17) {
            xx = -1.88622 + (((tickAnim - 15) / 2) * (0-(-1.88622)));
            yy = -6.54034 + (((tickAnim - 15) / 2) * (20-(-6.54034)));
            zz = -17.5982 + (((tickAnim - 15) / 2) * (0-(-17.5982)));
        }
        else if (tickAnim >= 17 && tickAnim < 19) {
            xx = 0 + (((tickAnim - 17) / 2) * (0-(0)));
            yy = 20 + (((tickAnim - 17) / 2) * (-4.37-(20)));
            zz = 0 + (((tickAnim - 17) / 2) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(legleft4, legleft4.rotateAngleX + (float) Math.toRadians(xx), legleft4.rotateAngleY + (float) Math.toRadians(yy), legleft4.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            yy = -20 + (((tickAnim - 0) / 3) * (12.5-(-20)));
            zz = 0 + (((tickAnim - 0) / 3) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 3) / 2) * (-1.15091-(0)));
            yy = 12.5 + (((tickAnim - 3) / 2) * (-3.67456-(12.5)));
            zz = 0 + (((tickAnim - 3) / 2) * (7.58729-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 6) {
            xx = -1.15091 + (((tickAnim - 5) / 1) * (0-(-1.15091)));
            yy = -3.67456 + (((tickAnim - 5) / 1) * (-20-(-3.67456)));
            zz = 7.58729 + (((tickAnim - 5) / 1) * (0-(7.58729)));
        }
        else if (tickAnim >= 6 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 6) / 4) * (0-(0)));
            yy = -20 + (((tickAnim - 6) / 4) * (12.5-(-20)));
            zz = 0 + (((tickAnim - 6) / 4) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 11) {
            xx = 0 + (((tickAnim - 10) / 1) * (-1.15091-(0)));
            yy = 12.5 + (((tickAnim - 10) / 1) * (-3.67456-(12.5)));
            zz = 0 + (((tickAnim - 10) / 1) * (7.58729-(0)));
        }
        else if (tickAnim >= 11 && tickAnim < 13) {
            xx = -1.15091 + (((tickAnim - 11) / 2) * (0-(-1.15091)));
            yy = -3.67456 + (((tickAnim - 11) / 2) * (-20-(-3.67456)));
            zz = 7.58729 + (((tickAnim - 11) / 2) * (0-(7.58729)));
        }
        else if (tickAnim >= 13 && tickAnim < 16) {
            xx = 0 + (((tickAnim - 13) / 3) * (0-(0)));
            yy = -20 + (((tickAnim - 13) / 3) * (12.5-(-20)));
            zz = 0 + (((tickAnim - 13) / 3) * (0-(0)));
        }
        else if (tickAnim >= 16 && tickAnim < 18) {
            xx = 0 + (((tickAnim - 16) / 2) * (-1.15091-(0)));
            yy = 12.5 + (((tickAnim - 16) / 2) * (-3.67456-(12.5)));
            zz = 0 + (((tickAnim - 16) / 2) * (7.58729-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 19) {
            xx = -1.15091 + (((tickAnim - 18) / 1) * (0-(-1.15091)));
            yy = -3.67456 + (((tickAnim - 18) / 1) * (-20-(-3.67456)));
            zz = 7.58729 + (((tickAnim - 18) / 1) * (0-(7.58729)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(legright5, legright5.rotateAngleX + (float) Math.toRadians(xx), legright5.rotateAngleY + (float) Math.toRadians(yy), legright5.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 2) {
            xx = 0 + (((tickAnim - 0) / 2) * (-1.15091-(0)));
            yy = -12.5 + (((tickAnim - 0) / 2) * (3.67456-(-12.5)));
            zz = 0 + (((tickAnim - 0) / 2) * (-7.58729-(0)));
        }
        else if (tickAnim >= 2 && tickAnim < 3) {
            xx = -1.15091 + (((tickAnim - 2) / 1) * (0-(-1.15091)));
            yy = 3.67456 + (((tickAnim - 2) / 1) * (20-(3.67456)));
            zz = -7.58729 + (((tickAnim - 2) / 1) * (0-(-7.58729)));
        }
        else if (tickAnim >= 3 && tickAnim < 6) {
            xx = 0 + (((tickAnim - 3) / 3) * (0-(0)));
            yy = 20 + (((tickAnim - 3) / 3) * (-12.5-(20)));
            zz = 0 + (((tickAnim - 3) / 3) * (0-(0)));
        }
        else if (tickAnim >= 6 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 6) / 2) * (-1.15091-(0)));
            yy = -12.5 + (((tickAnim - 6) / 2) * (3.67456-(-12.5)));
            zz = 0 + (((tickAnim - 6) / 2) * (-7.58729-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 10) {
            xx = -1.15091 + (((tickAnim - 8) / 2) * (0-(-1.15091)));
            yy = 3.67456 + (((tickAnim - 8) / 2) * (20-(3.67456)));
            zz = -7.58729 + (((tickAnim - 8) / 2) * (0-(-7.58729)));
        }
        else if (tickAnim >= 10 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 10) / 3) * (0-(0)));
            yy = 20 + (((tickAnim - 10) / 3) * (-12.5-(20)));
            zz = 0 + (((tickAnim - 10) / 3) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 14) {
            xx = 0 + (((tickAnim - 13) / 1) * (-1.15091-(0)));
            yy = -12.5 + (((tickAnim - 13) / 1) * (3.67456-(-12.5)));
            zz = 0 + (((tickAnim - 13) / 1) * (-7.58729-(0)));
        }
        else if (tickAnim >= 14 && tickAnim < 16) {
            xx = -1.15091 + (((tickAnim - 14) / 2) * (0-(-1.15091)));
            yy = 3.67456 + (((tickAnim - 14) / 2) * (20-(3.67456)));
            zz = -7.58729 + (((tickAnim - 14) / 2) * (0-(-7.58729)));
        }
        else if (tickAnim >= 16 && tickAnim < 19) {
            xx = 0 + (((tickAnim - 16) / 3) * (0-(0)));
            yy = 20 + (((tickAnim - 16) / 3) * (-12.5-(20)));
            zz = 0 + (((tickAnim - 16) / 3) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(legleft5, legleft5.rotateAngleX + (float) Math.toRadians(xx), legleft5.rotateAngleY + (float) Math.toRadians(yy), legleft5.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 2) {
            xx = 0 + (((tickAnim - 0) / 2) * (0-(0)));
            yy = -11.88 + (((tickAnim - 0) / 2) * (12.5-(-11.88)));
            zz = 0 + (((tickAnim - 0) / 2) * (0-(0)));
        }
        else if (tickAnim >= 2 && tickAnim < 4) {
            xx = 0 + (((tickAnim - 2) / 2) * (-0.27059-(0)));
            yy = 12.5 + (((tickAnim - 2) / 2) * (-3.72037-(12.5)));
            zz = 0 + (((tickAnim - 2) / 2) * (12.50288-(0)));
        }
        else if (tickAnim >= 4 && tickAnim < 6) {
            xx = -0.27059 + (((tickAnim - 4) / 2) * (0-(-0.27059)));
            yy = -3.72037 + (((tickAnim - 4) / 2) * (-20-(-3.72037)));
            zz = 12.50288 + (((tickAnim - 4) / 2) * (0-(12.50288)));
        }
        else if (tickAnim >= 6 && tickAnim < 9) {
            xx = 0 + (((tickAnim - 6) / 3) * (0-(0)));
            yy = -20 + (((tickAnim - 6) / 3) * (12.5-(-20)));
            zz = 0 + (((tickAnim - 6) / 3) * (0-(0)));
        }
        else if (tickAnim >= 9 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 9) / 1) * (-0.27059-(0)));
            yy = 12.5 + (((tickAnim - 9) / 1) * (-3.72037-(12.5)));
            zz = 0 + (((tickAnim - 9) / 1) * (12.50288-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 12) {
            xx = -0.27059 + (((tickAnim - 10) / 2) * (0-(-0.27059)));
            yy = -3.72037 + (((tickAnim - 10) / 2) * (-20-(-3.72037)));
            zz = 12.50288 + (((tickAnim - 10) / 2) * (0-(12.50288)));
        }
        else if (tickAnim >= 12 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 12) / 3) * (0-(0)));
            yy = -20 + (((tickAnim - 12) / 3) * (12.5-(-20)));
            zz = 0 + (((tickAnim - 12) / 3) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 17) {
            xx = 0 + (((tickAnim - 15) / 2) * (-0.27059-(0)));
            yy = 12.5 + (((tickAnim - 15) / 2) * (-3.72037-(12.5)));
            zz = 0 + (((tickAnim - 15) / 2) * (12.50288-(0)));
        }
        else if (tickAnim >= 17 && tickAnim < 18) {
            xx = -0.27059 + (((tickAnim - 17) / 1) * (0-(-0.27059)));
            yy = -3.72037 + (((tickAnim - 17) / 1) * (-20-(-3.72037)));
            zz = 12.50288 + (((tickAnim - 17) / 1) * (0-(12.50288)));
        }
        else if (tickAnim >= 18 && tickAnim < 19) {
            xx = 0 + (((tickAnim - 18) / 1) * (0-(0)));
            yy = -20 + (((tickAnim - 18) / 1) * (-11.88-(-20)));
            zz = 0 + (((tickAnim - 18) / 1) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(legright6, legright6.rotateAngleX + (float) Math.toRadians(xx), legright6.rotateAngleY + (float) Math.toRadians(yy), legright6.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 1) {
            xx = -0.14 + (((tickAnim - 0) / 1) * (-0.27059-(-0.14)));
            yy = -4.39 + (((tickAnim - 0) / 1) * (3.72037-(-4.39)));
            zz = -6.25 + (((tickAnim - 0) / 1) * (-12.50288-(-6.25)));
        }
        else if (tickAnim >= 1 && tickAnim < 2) {
            xx = -0.27059 + (((tickAnim - 1) / 1) * (0-(-0.27059)));
            yy = 3.72037 + (((tickAnim - 1) / 1) * (20-(3.72037)));
            zz = -12.50288 + (((tickAnim - 1) / 1) * (0-(-12.50288)));
        }
        else if (tickAnim >= 2 && tickAnim < 6) {
            xx = 0 + (((tickAnim - 2) / 4) * (0-(0)));
            yy = 20 + (((tickAnim - 2) / 4) * (-12.5-(20)));
            zz = 0 + (((tickAnim - 2) / 4) * (0-(0)));
        }
        else if (tickAnim >= 6 && tickAnim < 7) {
            xx = 0 + (((tickAnim - 6) / 1) * (-0.27059-(0)));
            yy = -12.5 + (((tickAnim - 6) / 1) * (3.72037-(-12.5)));
            zz = 0 + (((tickAnim - 6) / 1) * (-12.50288-(0)));
        }
        else if (tickAnim >= 7 && tickAnim < 9) {
            xx = -0.27059 + (((tickAnim - 7) / 2) * (0-(-0.27059)));
            yy = 3.72037 + (((tickAnim - 7) / 2) * (20-(3.72037)));
            zz = -12.50288 + (((tickAnim - 7) / 2) * (0-(-12.50288)));
        }
        else if (tickAnim >= 9 && tickAnim < 12) {
            xx = 0 + (((tickAnim - 9) / 3) * (0-(0)));
            yy = 20 + (((tickAnim - 9) / 3) * (-12.5-(20)));
            zz = 0 + (((tickAnim - 9) / 3) * (0-(0)));
        }
        else if (tickAnim >= 12 && tickAnim < 14) {
            xx = 0 + (((tickAnim - 12) / 2) * (-0.27059-(0)));
            yy = -12.5 + (((tickAnim - 12) / 2) * (3.72037-(-12.5)));
            zz = 0 + (((tickAnim - 12) / 2) * (-12.50288-(0)));
        }
        else if (tickAnim >= 14 && tickAnim < 15) {
            xx = -0.27059 + (((tickAnim - 14) / 1) * (0-(-0.27059)));
            yy = 3.72037 + (((tickAnim - 14) / 1) * (20-(3.72037)));
            zz = -12.50288 + (((tickAnim - 14) / 1) * (0-(-12.50288)));
        }
        else if (tickAnim >= 15 && tickAnim < 18) {
            xx = 0 + (((tickAnim - 15) / 3) * (0-(0)));
            yy = 20 + (((tickAnim - 15) / 3) * (-12.5-(20)));
            zz = 0 + (((tickAnim - 15) / 3) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 19) {
            xx = 0 + (((tickAnim - 18) / 1) * (-0.14-(0)));
            yy = -12.5 + (((tickAnim - 18) / 1) * (-4.39-(-12.5)));
            zz = 0 + (((tickAnim - 18) / 1) * (-6.25-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(legleft6, legleft6.rotateAngleX + (float) Math.toRadians(xx), legleft6.rotateAngleY + (float) Math.toRadians(yy), legleft6.rotateAngleZ + (float) Math.toRadians(zz));



        this.setRotateAngle(body3, body3.rotateAngleX + (float) Math.toRadians(0), body3.rotateAngleY + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*(376*2)))), body3.rotateAngleZ + (float) Math.toRadians(0));



        if (tickAnim >= 0 && tickAnim < 2) {
            xx = 0 + (((tickAnim - 0) / 2) * (0-(0)));
            yy = -2.5 + (((tickAnim - 0) / 2) * (15-(-2.5)));
            zz = 0 + (((tickAnim - 0) / 2) * (0-(0)));
        }
        else if (tickAnim >= 2 && tickAnim < 3) {
            xx = 0 + (((tickAnim - 2) / 1) * (1.50701-(0)));
            yy = 15 + (((tickAnim - 2) / 1) * (-2.73196-(15)));
            zz = 0 + (((tickAnim - 2) / 1) * (17.56274-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 5) {
            xx = 1.50701 + (((tickAnim - 3) / 2) * (0-(1.50701)));
            yy = -2.73196 + (((tickAnim - 3) / 2) * (-20-(-2.73196)));
            zz = 17.56274 + (((tickAnim - 3) / 2) * (0-(17.56274)));
        }
        else if (tickAnim >= 5 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 5) / 3) * (0-(0)));
            yy = -20 + (((tickAnim - 5) / 3) * (15-(-20)));
            zz = 0 + (((tickAnim - 5) / 3) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 8) / 2) * (1.50701-(0)));
            yy = 15 + (((tickAnim - 8) / 2) * (-2.73196-(15)));
            zz = 0 + (((tickAnim - 8) / 2) * (17.56274-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 11) {
            xx = 1.50701 + (((tickAnim - 10) / 1) * (0-(1.50701)));
            yy = -2.73196 + (((tickAnim - 10) / 1) * (-20-(-2.73196)));
            zz = 17.56274 + (((tickAnim - 10) / 1) * (0-(17.56274)));
        }
        else if (tickAnim >= 11 && tickAnim < 14) {
            xx = 0 + (((tickAnim - 11) / 3) * (0-(0)));
            yy = -20 + (((tickAnim - 11) / 3) * (15-(-20)));
            zz = 0 + (((tickAnim - 11) / 3) * (0-(0)));
        }
        else if (tickAnim >= 14 && tickAnim < 16) {
            xx = 0 + (((tickAnim - 14) / 2) * (1.50701-(0)));
            yy = 15 + (((tickAnim - 14) / 2) * (-2.73196-(15)));
            zz = 0 + (((tickAnim - 14) / 2) * (17.56274-(0)));
        }
        else if (tickAnim >= 16 && tickAnim < 18) {
            xx = 1.50701 + (((tickAnim - 16) / 2) * (0-(1.50701)));
            yy = -2.73196 + (((tickAnim - 16) / 2) * (-20-(-2.73196)));
            zz = 17.56274 + (((tickAnim - 16) / 2) * (0-(17.56274)));
        }
        else if (tickAnim >= 18 && tickAnim < 19) {
            xx = 0 + (((tickAnim - 18) / 1) * (0-(0)));
            yy = -20 + (((tickAnim - 18) / 1) * (-2.5-(-20)));
            zz = 0 + (((tickAnim - 18) / 1) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(legright7, legright7.rotateAngleX + (float) Math.toRadians(xx), legright7.rotateAngleY + (float) Math.toRadians(yy), legright7.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 2) {
            xx = 1.50701 + (((tickAnim - 0) / 2) * (0-(1.50701)));
            yy = 2.73196 + (((tickAnim - 0) / 2) * (20-(2.73196)));
            zz = -17.56274 + (((tickAnim - 0) / 2) * (0-(-17.56274)));
        }
        else if (tickAnim >= 2 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 2) / 3) * (0-(0)));
            yy = 20 + (((tickAnim - 2) / 3) * (-15-(20)));
            zz = 0 + (((tickAnim - 2) / 3) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 6) {
            xx = 0 + (((tickAnim - 5) / 1) * (1.50701-(0)));
            yy = -15 + (((tickAnim - 5) / 1) * (2.73196-(-15)));
            zz = 0 + (((tickAnim - 5) / 1) * (-17.56274-(0)));
        }
        else if (tickAnim >= 6 && tickAnim < 8) {
            xx = 1.50701 + (((tickAnim - 6) / 2) * (0-(1.50701)));
            yy = 2.73196 + (((tickAnim - 6) / 2) * (20-(2.73196)));
            zz = -17.56274 + (((tickAnim - 6) / 2) * (0-(-17.56274)));
        }
        else if (tickAnim >= 8 && tickAnim < 11) {
            xx = 0 + (((tickAnim - 8) / 3) * (0-(0)));
            yy = 20 + (((tickAnim - 8) / 3) * (-15-(20)));
            zz = 0 + (((tickAnim - 8) / 3) * (0-(0)));
        }
        else if (tickAnim >= 11 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 11) / 2) * (1.50701-(0)));
            yy = -15 + (((tickAnim - 11) / 2) * (2.73196-(-15)));
            zz = 0 + (((tickAnim - 11) / 2) * (-17.56274-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 14) {
            xx = 1.50701 + (((tickAnim - 13) / 1) * (0-(1.50701)));
            yy = 2.73196 + (((tickAnim - 13) / 1) * (20-(2.73196)));
            zz = -17.56274 + (((tickAnim - 13) / 1) * (0-(-17.56274)));
        }
        else if (tickAnim >= 14 && tickAnim < 18) {
            xx = 0 + (((tickAnim - 14) / 4) * (0-(0)));
            yy = 20 + (((tickAnim - 14) / 4) * (-15-(20)));
            zz = 0 + (((tickAnim - 14) / 4) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 19) {
            xx = 0 + (((tickAnim - 18) / 1) * (1.50701-(0)));
            yy = -15 + (((tickAnim - 18) / 1) * (2.73196-(-15)));
            zz = 0 + (((tickAnim - 18) / 1) * (-17.56274-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(legleft7, legleft7.rotateAngleX + (float) Math.toRadians(xx), legleft7.rotateAngleY + (float) Math.toRadians(yy), legleft7.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 1) {
            xx = 0 + (((tickAnim - 0) / 1) * (0-(0)));
            yy = 4.37 + (((tickAnim - 0) / 1) * (12.5-(4.37)));
            zz = 0 + (((tickAnim - 0) / 1) * (0-(0)));
        }
        else if (tickAnim >= 1 && tickAnim < 2) {
            xx = 0 + (((tickAnim - 1) / 1) * (2.64993-(0)));
            yy = 12.5 + (((tickAnim - 1) / 1) * (-4.15793-(12.5)));
            zz = 0 + (((tickAnim - 1) / 1) * (17.69329-(0)));
        }
        else if (tickAnim >= 2 && tickAnim < 4) {
            xx = 2.64993 + (((tickAnim - 2) / 2) * (0-(2.64993)));
            yy = -4.15793 + (((tickAnim - 2) / 2) * (-20-(-4.15793)));
            zz = 17.69329 + (((tickAnim - 2) / 2) * (0-(17.69329)));
        }
        else if (tickAnim >= 4 && tickAnim < 7) {
            xx = 0 + (((tickAnim - 4) / 3) * (0-(0)));
            yy = -20 + (((tickAnim - 4) / 3) * (12.5-(-20)));
            zz = 0 + (((tickAnim - 4) / 3) * (0-(0)));
        }
        else if (tickAnim >= 7 && tickAnim < 9) {
            xx = 0 + (((tickAnim - 7) / 2) * (2.64993-(0)));
            yy = 12.5 + (((tickAnim - 7) / 2) * (-4.15793-(12.5)));
            zz = 0 + (((tickAnim - 7) / 2) * (17.69329-(0)));
        }
        else if (tickAnim >= 9 && tickAnim < 10) {
            xx = 2.64993 + (((tickAnim - 9) / 1) * (0-(2.64993)));
            yy = -4.15793 + (((tickAnim - 9) / 1) * (-20-(-4.15793)));
            zz = 17.69329 + (((tickAnim - 9) / 1) * (0-(17.69329)));
        }
        else if (tickAnim >= 10 && tickAnim < 14) {
            xx = 0 + (((tickAnim - 10) / 4) * (0-(0)));
            yy = -20 + (((tickAnim - 10) / 4) * (12.5-(-20)));
            zz = 0 + (((tickAnim - 10) / 4) * (0-(0)));
        }
        else if (tickAnim >= 14 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 14) / 1) * (2.64993-(0)));
            yy = 12.5 + (((tickAnim - 14) / 1) * (-4.15793-(12.5)));
            zz = 0 + (((tickAnim - 14) / 1) * (17.69329-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 17) {
            xx = 2.64993 + (((tickAnim - 15) / 2) * (0-(2.64993)));
            yy = -4.15793 + (((tickAnim - 15) / 2) * (-20-(-4.15793)));
            zz = 17.69329 + (((tickAnim - 15) / 2) * (0-(17.69329)));
        }
        else if (tickAnim >= 17 && tickAnim < 19) {
            xx = 0 + (((tickAnim - 17) / 2) * (0-(0)));
            yy = -20 + (((tickAnim - 17) / 2) * (4.37-(-20)));
            zz = 0 + (((tickAnim - 17) / 2) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(legright8, legright8.rotateAngleX + (float) Math.toRadians(xx), legright8.rotateAngleY + (float) Math.toRadians(yy), legright8.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 1) {
            xx = 1.32 + (((tickAnim - 0) / 1) * (0-(1.32)));
            yy = 12.08 + (((tickAnim - 0) / 1) * (20-(12.08)));
            zz = -8.85 + (((tickAnim - 0) / 1) * (0-(-8.85)));
        }
        else if (tickAnim >= 1 && tickAnim < 4) {
            xx = 0 + (((tickAnim - 1) / 3) * (0-(0)));
            yy = 20 + (((tickAnim - 1) / 3) * (-12.5-(20)));
            zz = 0 + (((tickAnim - 1) / 3) * (0-(0)));
        }
        else if (tickAnim >= 4 && tickAnim < 6) {
            xx = 0 + (((tickAnim - 4) / 2) * (2.64993-(0)));
            yy = -12.5 + (((tickAnim - 4) / 2) * (4.15793-(-12.5)));
            zz = 0 + (((tickAnim - 4) / 2) * (-17.69329-(0)));
        }
        else if (tickAnim >= 6 && tickAnim < 7) {
            xx = 2.64993 + (((tickAnim - 6) / 1) * (0-(2.64993)));
            yy = 4.15793 + (((tickAnim - 6) / 1) * (20-(4.15793)));
            zz = -17.69329 + (((tickAnim - 6) / 1) * (0-(-17.69329)));
        }
        else if (tickAnim >= 7 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 7) / 3) * (0-(0)));
            yy = 20 + (((tickAnim - 7) / 3) * (-12.5-(20)));
            zz = 0 + (((tickAnim - 7) / 3) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 12) {
            xx = 0 + (((tickAnim - 10) / 2) * (2.64993-(0)));
            yy = -12.5 + (((tickAnim - 10) / 2) * (4.15793-(-12.5)));
            zz = 0 + (((tickAnim - 10) / 2) * (-17.69329-(0)));
        }
        else if (tickAnim >= 12 && tickAnim < 14) {
            xx = 2.64993 + (((tickAnim - 12) / 2) * (0-(2.64993)));
            yy = 4.15793 + (((tickAnim - 12) / 2) * (20-(4.15793)));
            zz = -17.69329 + (((tickAnim - 12) / 2) * (0-(-17.69329)));
        }
        else if (tickAnim >= 14 && tickAnim < 17) {
            xx = 0 + (((tickAnim - 14) / 3) * (0-(0)));
            yy = 20 + (((tickAnim - 14) / 3) * (-12.5-(20)));
            zz = 0 + (((tickAnim - 14) / 3) * (0-(0)));
        }
        else if (tickAnim >= 17 && tickAnim < 18) {
            xx = 0 + (((tickAnim - 17) / 1) * (2.64993-(0)));
            yy = -12.5 + (((tickAnim - 17) / 1) * (4.15793-(-12.5)));
            zz = 0 + (((tickAnim - 17) / 1) * (-17.69329-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 19) {
            xx = 2.64993 + (((tickAnim - 18) / 1) * (1.32-(2.64993)));
            yy = 4.15793 + (((tickAnim - 18) / 1) * (12.08-(4.15793)));
            zz = -17.69329 + (((tickAnim - 18) / 1) * (-8.85-(-17.69329)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(legleft8, legleft8.rotateAngleX + (float) Math.toRadians(xx), legleft8.rotateAngleY + (float) Math.toRadians(yy), legleft8.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 2) {
            xx = 0 + (((tickAnim - 0) / 2) * (8.08157-(0)));
            yy = 12.5 + (((tickAnim - 0) / 2) * (5.1843-(12.5)));
            zz = 0 + (((tickAnim - 0) / 2) * (16.99444-(0)));
        }
        else if (tickAnim >= 2 && tickAnim < 3) {
            xx = 8.08157 + (((tickAnim - 2) / 1) * (0-(8.08157)));
            yy = 5.1843 + (((tickAnim - 2) / 1) * (-20-(5.1843)));
            zz = 16.99444 + (((tickAnim - 2) / 1) * (0-(16.99444)));
        }
        else if (tickAnim >= 3 && tickAnim < 6) {
            xx = 0 + (((tickAnim - 3) / 3) * (0-(0)));
            yy = -20 + (((tickAnim - 3) / 3) * (12.5-(-20)));
            zz = 0 + (((tickAnim - 3) / 3) * (0-(0)));
        }
        else if (tickAnim >= 6 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 6) / 2) * (8.08157-(0)));
            yy = 12.5 + (((tickAnim - 6) / 2) * (5.1843-(12.5)));
            zz = 0 + (((tickAnim - 6) / 2) * (16.99444-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 10) {
            xx = 8.08157 + (((tickAnim - 8) / 2) * (0-(8.08157)));
            yy = 5.1843 + (((tickAnim - 8) / 2) * (-20-(5.1843)));
            zz = 16.99444 + (((tickAnim - 8) / 2) * (0-(16.99444)));
        }
        else if (tickAnim >= 10 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 10) / 3) * (0-(0)));
            yy = -20 + (((tickAnim - 10) / 3) * (12.5-(-20)));
            zz = 0 + (((tickAnim - 10) / 3) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 14) {
            xx = 0 + (((tickAnim - 13) / 1) * (8.08157-(0)));
            yy = 12.5 + (((tickAnim - 13) / 1) * (5.1843-(12.5)));
            zz = 0 + (((tickAnim - 13) / 1) * (16.99444-(0)));
        }
        else if (tickAnim >= 14 && tickAnim < 16) {
            xx = 8.08157 + (((tickAnim - 14) / 2) * (0-(8.08157)));
            yy = 5.1843 + (((tickAnim - 14) / 2) * (-20-(5.1843)));
            zz = 16.99444 + (((tickAnim - 14) / 2) * (0-(16.99444)));
        }
        else if (tickAnim >= 16 && tickAnim < 19) {
            xx = 0 + (((tickAnim - 16) / 3) * (0-(0)));
            yy = -20 + (((tickAnim - 16) / 3) * (12.5-(-20)));
            zz = 0 + (((tickAnim - 16) / 3) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(legright9, legright9.rotateAngleX + (float) Math.toRadians(xx), legright9.rotateAngleY + (float) Math.toRadians(yy), legright9.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            yy = 20 + (((tickAnim - 0) / 3) * (-12.5-(20)));
            zz = 0 + (((tickAnim - 0) / 3) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 3) / 2) * (8.08157-(0)));
            yy = -12.5 + (((tickAnim - 3) / 2) * (-5.1843-(-12.5)));
            zz = 0 + (((tickAnim - 3) / 2) * (-16.99444-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 6) {
            xx = 8.08157 + (((tickAnim - 5) / 1) * (0-(8.08157)));
            yy = -5.1843 + (((tickAnim - 5) / 1) * (20-(-5.1843)));
            zz = -16.99444 + (((tickAnim - 5) / 1) * (0-(-16.99444)));
        }
        else if (tickAnim >= 6 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 6) / 4) * (0-(0)));
            yy = 20 + (((tickAnim - 6) / 4) * (-12.5-(20)));
            zz = 0 + (((tickAnim - 6) / 4) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 11) {
            xx = 0 + (((tickAnim - 10) / 1) * (8.08157-(0)));
            yy = -12.5 + (((tickAnim - 10) / 1) * (-5.1843-(-12.5)));
            zz = 0 + (((tickAnim - 10) / 1) * (-16.99444-(0)));
        }
        else if (tickAnim >= 11 && tickAnim < 13) {
            xx = 8.08157 + (((tickAnim - 11) / 2) * (0-(8.08157)));
            yy = -5.1843 + (((tickAnim - 11) / 2) * (20-(-5.1843)));
            zz = -16.99444 + (((tickAnim - 11) / 2) * (0-(-16.99444)));
        }
        else if (tickAnim >= 13 && tickAnim < 16) {
            xx = 0 + (((tickAnim - 13) / 3) * (0-(0)));
            yy = 20 + (((tickAnim - 13) / 3) * (-12.5-(20)));
            zz = 0 + (((tickAnim - 13) / 3) * (0-(0)));
        }
        else if (tickAnim >= 16 && tickAnim < 18) {
            xx = 0 + (((tickAnim - 16) / 2) * (8.08157-(0)));
            yy = -12.5 + (((tickAnim - 16) / 2) * (-5.1843-(-12.5)));
            zz = 0 + (((tickAnim - 16) / 2) * (-16.99444-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 19) {
            xx = 8.08157 + (((tickAnim - 18) / 1) * (0-(8.08157)));
            yy = -5.1843 + (((tickAnim - 18) / 1) * (20-(-5.1843)));
            zz = -16.99444 + (((tickAnim - 18) / 1) * (0-(-16.99444)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(legleft9, legleft9.rotateAngleX + (float) Math.toRadians(xx), legleft9.rotateAngleY + (float) Math.toRadians(yy), legleft9.rotateAngleZ + (float) Math.toRadians(zz));



        this.setRotateAngle(ultimatelegright, ultimatelegright.rotateAngleX + (float) Math.toRadians(0), ultimatelegright.rotateAngleY + (float) Math.toRadians(-(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*(376*2))))*3), ultimatelegright.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(ultimatelegleft, ultimatelegleft.rotateAngleX + (float) Math.toRadians(0), ultimatelegleft.rotateAngleY + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*(376*2)))), ultimatelegleft.rotateAngleZ + (float) Math.toRadians(0));
        

    }

    @Override
    public void setRotationAngles(float f, float f1, float f2, float f3, float f4, float f5, Entity e) {
        super.setRotationAngles(f, f1, f2, f3, f4, f5, e);
        //this.resetToDefaultPose();
        //this.casineria.offsetY = 1.20F;

        EntityPrehistoricFloraMyriapod entityMyriapod = (EntityPrehistoricFloraMyriapod) e;


    }


    public void animate(IAnimatedEntity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        EntityPrehistoricFloraMyriapod e = (EntityPrehistoricFloraMyriapod) entity;
        animator.update(entity);
        
    }
}
