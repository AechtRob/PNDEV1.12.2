package net.lepidodendron.entity.model.entity;

import net.ilexiconn.llibrary.client.model.tools.AdvancedModelRenderer;
import net.lepidodendron.entity.EntityPrehistoricFloraChronocancer;
import net.lepidodendron.entity.model.ModelBasePalaeopedia;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;

public class ModelChronocancer extends ModelBasePalaeopedia {
    private final AdvancedModelRenderer body;
    private final AdvancedModelRenderer cube_r1;
    private final AdvancedModelRenderer cube_r2;
    private final AdvancedModelRenderer cube_r3;
    private final AdvancedModelRenderer cube_r4;
    private final AdvancedModelRenderer cube_r5;
    private final AdvancedModelRenderer cube_r6;
    private final AdvancedModelRenderer cube_r7;
    private final AdvancedModelRenderer cube_r8;
    private final AdvancedModelRenderer armright;
    private final AdvancedModelRenderer armright2;
    private final AdvancedModelRenderer cube_r9;
    private final AdvancedModelRenderer cube_r10;
    private final AdvancedModelRenderer armleft;
    private final AdvancedModelRenderer armleft2;
    private final AdvancedModelRenderer cube_r11;
    private final AdvancedModelRenderer cube_r12;
    private final AdvancedModelRenderer legright;
    private final AdvancedModelRenderer legleft;
    private final AdvancedModelRenderer legright2;
    private final AdvancedModelRenderer legleft2;
    private final AdvancedModelRenderer legright3;
    private final AdvancedModelRenderer legleft3;
    private final AdvancedModelRenderer legright4;
    private final AdvancedModelRenderer legleft4;

    public ModelChronocancer() {
        this.textureWidth = 32;
        this.textureHeight = 32;

        this.body = new AdvancedModelRenderer(this);
        this.body.setRotationPoint(0.0F, 21.85F, -1.0F);
        this.setRotateAngle(body, -0.1745F, 0.0F, 0.0F);
        this.body.cubeList.add(new ModelBox(body, 0, 12, -0.5F, -1.0F, -1.6F, 1, 1, 2, 0.01F, false));
        this.body.cubeList.add(new ModelBox(body, 0, 15, -0.5F, -0.9F, -2.6F, 1, 0, 2, 0.0F, false));
        this.body.cubeList.add(new ModelBox(body, 10, 8, -1.0F, -1.0F, 0.0F, 2, 1, 2, 0.02F, false));

        this.cube_r1 = new AdvancedModelRenderer(this);
        this.cube_r1.setRotationPoint(1.0F, 0.0F, 1.7F);
        this.body.addChild(cube_r1);
        this.setRotateAngle(cube_r1, 0.0F, -0.4363F, 0.0F);
        this.cube_r1.cubeList.add(new ModelBox(cube_r1, 10, 11, -1.0F, -1.0F, -2.0F, 1, 1, 2, -0.01F, true));

        this.cube_r2 = new AdvancedModelRenderer(this);
        this.cube_r2.setRotationPoint(0.375F, 0.0F, -1.425F);
        this.body.addChild(cube_r2);
        this.setRotateAngle(cube_r2, 0.0F, -0.6894F, 0.0F);
        this.cube_r2.cubeList.add(new ModelBox(cube_r2, 6, 16, 0.0F, -1.0F, 0.0F, 2, 1, 1, 0.0F, true));

        this.cube_r3 = new AdvancedModelRenderer(this);
        this.cube_r3.setRotationPoint(0.85F, 0.1F, -1.525F);
        this.body.addChild(cube_r3);
        this.setRotateAngle(cube_r3, 0.0F, 0.0436F, 0.0F);
        this.cube_r3.cubeList.add(new ModelBox(cube_r3, 6, 12, -0.5F, -1.0F, 0.0F, 1, 0, 1, 0.0F, true));

        this.cube_r4 = new AdvancedModelRenderer(this);
        this.cube_r4.setRotationPoint(0.75F, 0.3F, -1.825F);
        this.body.addChild(cube_r4);
        this.setRotateAngle(cube_r4, 0.0F, -0.3927F, 0.0F);
        this.cube_r4.cubeList.add(new ModelBox(cube_r4, 6, 13, -0.5F, -1.0F, 0.0F, 1, 0, 1, 0.0F, true));

        this.cube_r5 = new AdvancedModelRenderer(this);
        this.cube_r5.setRotationPoint(-1.0F, 0.0F, 1.7F);
        this.body.addChild(cube_r5);
        this.setRotateAngle(cube_r5, 0.0F, 0.4363F, 0.0F);
        this.cube_r5.cubeList.add(new ModelBox(cube_r5, 10, 11, 0.0F, -1.0F, -2.0F, 1, 1, 2, -0.01F, false));

        this.cube_r6 = new AdvancedModelRenderer(this);
        this.cube_r6.setRotationPoint(-0.75F, 0.3F, -1.825F);
        this.body.addChild(cube_r6);
        this.setRotateAngle(cube_r6, 0.0F, 0.3927F, 0.0F);
        this.cube_r6.cubeList.add(new ModelBox(cube_r6, 6, 13, -0.5F, -1.0F, 0.0F, 1, 0, 1, 0.0F, false));

        this.cube_r7 = new AdvancedModelRenderer(this);
        this.cube_r7.setRotationPoint(-0.85F, 0.1F, -1.525F);
        this.body.addChild(cube_r7);
        this.setRotateAngle(cube_r7, 0.0F, -0.0436F, 0.0F);
        this.cube_r7.cubeList.add(new ModelBox(cube_r7, 6, 12, -0.5F, -1.0F, 0.0F, 1, 0, 1, 0.0F, false));

        this.cube_r8 = new AdvancedModelRenderer(this);
        this.cube_r8.setRotationPoint(-0.375F, 0.0F, -1.425F);
        this.body.addChild(cube_r8);
        this.setRotateAngle(cube_r8, 0.0F, 0.6894F, 0.0F);
        this.cube_r8.cubeList.add(new ModelBox(cube_r8, 6, 16, -2.0F, -1.0F, 0.0F, 2, 1, 1, 0.0F, false));

        this.armright = new AdvancedModelRenderer(this);
        this.armright.setRotationPoint(-1.375F, -0.15F, -0.425F);
        this.body.addChild(armright);
        this.setRotateAngle(armright, 0.48F, -0.3927F, -0.3927F);
        this.armright.cubeList.add(new ModelBox(armright, 6, 14, -1.25F, -0.25F, -0.5F, 2, 0, 1, 0.0F, false));

        this.armright2 = new AdvancedModelRenderer(this);
        this.armright2.setRotationPoint(-1.25F, -0.25F, 0.0F);
        this.armright.addChild(armright2);
        this.setRotateAngle(armright2, 0.8727F, -1.6581F, 0.0F);
        this.armright2.cubeList.add(new ModelBox(armright2, 12, 14, -2.0F, -0.5F, -0.75F, 2, 1, 1, -0.01F, false));

        this.cube_r9 = new AdvancedModelRenderer(this);
        this.cube_r9.setRotationPoint(-1.975F, 0.0F, -0.45F);
        this.armright2.addChild(cube_r9);
        this.setRotateAngle(cube_r9, 0.0F, 0.0873F, 0.0F);
        this.cube_r9.cubeList.add(new ModelBox(cube_r9, 12, 16, -1.0F, -0.5F, 0.0F, 1, 1, 0, 0.0F, false));

        this.cube_r10 = new AdvancedModelRenderer(this);
        this.cube_r10.setRotationPoint(-1.975F, 0.0F, 0.15F);
        this.armright2.addChild(cube_r10);
        this.setRotateAngle(cube_r10, 0.0F, -0.2618F, 0.0F);
        this.cube_r10.cubeList.add(new ModelBox(cube_r10, 16, 11, -1.0F, -0.5F, 0.0F, 1, 1, 0, 0.0F, false));

        this.armleft = new AdvancedModelRenderer(this);
        this.armleft.setRotationPoint(1.375F, -0.15F, -0.425F);
        this.body.addChild(armleft);
        this.setRotateAngle(armleft, 0.48F, 0.3927F, 0.3927F);
        this.armleft.cubeList.add(new ModelBox(armleft, 6, 14, -0.75F, -0.25F, -0.5F, 2, 0, 1, 0.0F, true));

        this.armleft2 = new AdvancedModelRenderer(this);
        this.armleft2.setRotationPoint(1.25F, -0.25F, 0.0F);
        this.armleft.addChild(armleft2);
        this.setRotateAngle(armleft2, 0.8727F, 1.6581F, 0.0F);
        this.armleft2.cubeList.add(new ModelBox(armleft2, 12, 14, 0.0F, -0.5F, -0.75F, 2, 1, 1, -0.01F, true));

        this.cube_r11 = new AdvancedModelRenderer(this);
        this.cube_r11.setRotationPoint(1.975F, 0.0F, -0.45F);
        this.armleft2.addChild(cube_r11);
        this.setRotateAngle(cube_r11, 0.0F, -0.0873F, 0.0F);
        this.cube_r11.cubeList.add(new ModelBox(cube_r11, 12, 16, 0.0F, -0.5F, 0.0F, 1, 1, 0, 0.0F, true));

        this.cube_r12 = new AdvancedModelRenderer(this);
        this.cube_r12.setRotationPoint(1.975F, 0.0F, 0.15F);
        this.armleft2.addChild(cube_r12);
        this.setRotateAngle(cube_r12, 0.0F, 0.2618F, 0.0F);
        this.cube_r12.cubeList.add(new ModelBox(cube_r12, 16, 11, 0.0F, -0.5F, 0.0F, 1, 1, 0, 0.0F, true));

        this.legright = new AdvancedModelRenderer(this);
        this.legright.setRotationPoint(-1.0F, 0.0F, 0.9F);
        this.body.addChild(legright);
        this.setRotateAngle(legright, -1.2217F, -0.6545F, 0.1745F);
        this.legright.cubeList.add(new ModelBox(legright, 0, 0, -5.0F, 0.0F, -0.5F, 5, 0, 4, 0.0F, false));

        this.legleft = new AdvancedModelRenderer(this);
        this.legleft.setRotationPoint(1.0F, 0.0F, 0.9F);
        this.body.addChild(legleft);
        this.setRotateAngle(legleft, -1.2217F, 0.6545F, -0.1745F);
        this.legleft.cubeList.add(new ModelBox(legleft, 0, 0, 0.0F, 0.0F, -0.5F, 5, 0, 4, 0.0F, true));

        this.legright2 = new AdvancedModelRenderer(this);
        this.legright2.setRotationPoint(-1.0F, 0.0F, 1.25F);
        this.body.addChild(legright2);
        this.setRotateAngle(legright2, -0.8727F, -0.3491F, 0.1309F);
        this.legright2.cubeList.add(new ModelBox(legright2, 0, 4, -5.0F, 0.0F, -0.5F, 5, 0, 4, 0.0F, false));

        this.legleft2 = new AdvancedModelRenderer(this);
        this.legleft2.setRotationPoint(1.0F, 0.0F, 1.25F);
        this.body.addChild(legleft2);
        this.setRotateAngle(legleft2, -0.8727F, 0.3491F, -0.1309F);
        this.legleft2.cubeList.add(new ModelBox(legleft2, 0, 4, 0.0F, 0.0F, -0.5F, 5, 0, 4, 0.0F, true));

        this.legright3 = new AdvancedModelRenderer(this);
        this.legright3.setRotationPoint(-0.9F, -0.15F, 1.5F);
        this.body.addChild(legright3);
        this.setRotateAngle(legright3, -0.6545F, 0.2618F, -0.4363F);
        this.legright3.cubeList.add(new ModelBox(legright3, 0, 8, -3.0F, 0.0F, -0.5F, 3, 0, 2, 0.0F, false));

        this.legleft3 = new AdvancedModelRenderer(this);
        this.legleft3.setRotationPoint(0.9F, -0.15F, 1.5F);
        this.body.addChild(legleft3);
        this.setRotateAngle(legleft3, -0.6545F, -0.2618F, 0.4363F);
        this.legleft3.cubeList.add(new ModelBox(legleft3, 0, 8, 0.0F, 0.0F, -0.5F, 3, 0, 2, 0.0F, true));

        this.legright4 = new AdvancedModelRenderer(this);
        this.legright4.setRotationPoint(-0.8F, -0.15F, 1.75F);
        this.body.addChild(legright4);
        this.setRotateAngle(legright4, -0.5672F, 0.8727F, -0.5236F);
        this.legright4.cubeList.add(new ModelBox(legright4, 0, 10, -3.0F, 0.0F, -0.5F, 3, 0, 2, 0.0F, false));

        this.legleft4 = new AdvancedModelRenderer(this);
        this.legleft4.setRotationPoint(0.8F, -0.15F, 1.75F);
        this.body.addChild(legleft4);
        this.setRotateAngle(legleft4, -0.5672F, -0.8727F, 0.5236F);
        this.legleft4.cubeList.add(new ModelBox(legleft4, 0, 10, 0.0F, 0.0F, -0.5F, 3, 0, 2, 0.0F, true));
        updateDefaultPose();
    }

    @Override
    public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        this.body.render(f5);
    }

    public void renderStaticDisplayCase(float f) {
        this.body.offsetZ = -0.01F;
        this.body.render(0.01F);
        resetToDefaultPose();
    }
    
    public void renderStaticFloor(float f) {
        this.body.offsetY = 0.12F;
        this.body.render(0.01F);
        resetToDefaultPose();
    }

    @Override
    public void renderStaticBook(float f) {
        //Rotations, positions and sizing:
        this.body.offsetY = -2.2F;
        this.body.offsetX = -0.6F;
        this.body.offsetZ = 2.0F;
        this.body.rotateAngleY = (float)Math.toRadians(120);
        this.body.rotateAngleX = (float)Math.toRadians(1);
        this.body.rotateAngleZ = (float)Math.toRadians(0);
        this.body.scaleChildren = true;
        float scaler = 3.8F;
        this.body.setScale(scaler, scaler, scaler);
        //Start of pose:
       
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
    public void setLivingAnimations(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime) {
        super.setLivingAnimations(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime);
        this.resetToDefaultPose();
        EntityPrehistoricFloraChronocancer ee = (EntityPrehistoricFloraChronocancer) entitylivingbaseIn;

        if (ee.isInWater()) {
            if (ee.getIsMoving()) {
                animWalking(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime);
            }
            else {
            }

        }
        else {
        }


    }

    public void animWalking(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime) {
        EntityPrehistoricFloraChronocancer entity = (EntityPrehistoricFloraChronocancer) entitylivingbaseIn;
        int animCycle = 40;
        double tickAnim = (entity.ticksExisted + entity.getTickOffset()) - (int) (Math.floor((double) (entity.ticksExisted + entity.getTickOffset()) / (double) animCycle) * (double) animCycle) + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;
        this.setRotateAngle(body, body.rotateAngleX + (float) Math.toRadians(-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180*3))*3), body.rotateAngleY + (float) Math.toRadians(-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180*2+60))*3-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180-60))*4), body.rotateAngleZ + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180*3))*4));
        this.body.rotationPointX = this.body.rotationPointX + (float)(-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180*2))*0.3-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180-50))*0.3);
        this.body.rotationPointY = this.body.rotationPointY - (float)(1+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180*4))*0.1);
        this.body.rotationPointZ = this.body.rotationPointZ + (float)(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180*3-60*4))*0.1);


        this.setRotateAngle(armright, armright.rotateAngleX + (float) Math.toRadians(-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180*2))*4), armright.rotateAngleY + (float) Math.toRadians(-15-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180*3))*4), armright.rotateAngleZ + (float) Math.toRadians(32.5+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180*4))*4));


        this.setRotateAngle(armright2, armright2.rotateAngleX + (float) Math.toRadians(0), armright2.rotateAngleY + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180*3))*4), armright2.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(armleft, armleft.rotateAngleX + (float) Math.toRadians(-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180*2-60))*4), armleft.rotateAngleY + (float) Math.toRadians(15-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180*3-60))*4), armleft.rotateAngleZ + (float) Math.toRadians(-32.5+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180*4-60))*4));


        this.setRotateAngle(armleft2, armleft2.rotateAngleX + (float) Math.toRadians(0), armleft2.rotateAngleY + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180*3-60))*4), armleft2.rotateAngleZ + (float) Math.toRadians(0));



        if (tickAnim >= 0 && tickAnim < 10) {
            xx = -32.8612 + (((tickAnim - 0) / 10) * (17.8543-(-32.8612)));
            yy = -8.809 + (((tickAnim - 0) / 10) * (14.4252-(-8.809)));
            zz = 3.3649 + (((tickAnim - 0) / 10) * (-1.5591-(3.3649)));
        }
        else if (tickAnim >= 10 && tickAnim < 15) {
            xx = 17.8543 + (((tickAnim - 10) / 5) * (-21.7617-(17.8543)));
            yy = 14.4252 + (((tickAnim - 10) / 5) * (-3.2525-(14.4252)));
            zz = -1.5591 + (((tickAnim - 10) / 5) * (22.484-(-1.5591)));
        }
        else if (tickAnim >= 15 && tickAnim < 20) {
            xx = -21.7617 + (((tickAnim - 15) / 5) * (-32.8612-(-21.7617)));
            yy = -3.2525 + (((tickAnim - 15) / 5) * (-8.809-(-3.2525)));
            zz = 22.484 + (((tickAnim - 15) / 5) * (3.3649-(22.484)));
        }
        else if (tickAnim >= 20 && tickAnim < 30) {
            xx = -32.8612 + (((tickAnim - 20) / 10) * (17.8543-(-32.8612)));
            yy = -8.809 + (((tickAnim - 20) / 10) * (14.4252-(-8.809)));
            zz = 3.3649 + (((tickAnim - 20) / 10) * (-1.5591-(3.3649)));
        }
        else if (tickAnim >= 30 && tickAnim < 35) {
            xx = 17.8543 + (((tickAnim - 30) / 5) * (-21.7617-(17.8543)));
            yy = 14.4252 + (((tickAnim - 30) / 5) * (-3.2525-(14.4252)));
            zz = -1.5591 + (((tickAnim - 30) / 5) * (22.484-(-1.5591)));
        }
        else if (tickAnim >= 35 && tickAnim < 40) {
            xx = -21.7617 + (((tickAnim - 35) / 5) * (-32.8612-(-21.7617)));
            yy = -3.2525 + (((tickAnim - 35) / 5) * (-8.809-(-3.2525)));
            zz = 22.484 + (((tickAnim - 35) / 5) * (3.3649-(22.484)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(legright, legright.rotateAngleX + (float) Math.toRadians(xx), legright.rotateAngleY + (float) Math.toRadians(yy), legright.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 1) {
            xx = 13.37 + (((tickAnim - 0) / 1) * (17.8543-(13.37)));
            yy = -11.68 + (((tickAnim - 0) / 1) * (-14.4252-(-11.68)));
            zz = 0.82 + (((tickAnim - 0) / 1) * (1.5591-(0.82)));
        }
        else if (tickAnim >= 1 && tickAnim < 6) {
            xx = 17.8543 + (((tickAnim - 1) / 5) * (-21.7617-(17.8543)));
            yy = -14.4252 + (((tickAnim - 1) / 5) * (3.2525-(-14.4252)));
            zz = 1.5591 + (((tickAnim - 1) / 5) * (-22.484-(1.5591)));
        }
        else if (tickAnim >= 6 && tickAnim < 11) {
            xx = -21.7617 + (((tickAnim - 6) / 5) * (-32.8612-(-21.7617)));
            yy = 3.2525 + (((tickAnim - 6) / 5) * (8.809-(3.2525)));
            zz = -22.484 + (((tickAnim - 6) / 5) * (-3.3649-(-22.484)));
        }
        else if (tickAnim >= 11 && tickAnim < 21) {
            xx = -32.8612 + (((tickAnim - 11) / 10) * (17.8543-(-32.8612)));
            yy = 8.809 + (((tickAnim - 11) / 10) * (-14.4252-(8.809)));
            zz = -3.3649 + (((tickAnim - 11) / 10) * (1.5591-(-3.3649)));
        }
        else if (tickAnim >= 21 && tickAnim < 26) {
            xx = 17.8543 + (((tickAnim - 21) / 5) * (-21.7617-(17.8543)));
            yy = -14.4252 + (((tickAnim - 21) / 5) * (3.2525-(-14.4252)));
            zz = 1.5591 + (((tickAnim - 21) / 5) * (-22.484-(1.5591)));
        }
        else if (tickAnim >= 26 && tickAnim < 31) {
            xx = -21.7617 + (((tickAnim - 26) / 5) * (-32.8612-(-21.7617)));
            yy = 3.2525 + (((tickAnim - 26) / 5) * (8.809-(3.2525)));
            zz = -22.484 + (((tickAnim - 26) / 5) * (-3.3649-(-22.484)));
        }
        else if (tickAnim >= 31 && tickAnim < 40) {
            xx = -32.8612 + (((tickAnim - 31) / 9) * (13.37-(-32.8612)));
            yy = 8.809 + (((tickAnim - 31) / 9) * (-11.68-(8.809)));
            zz = -3.3649 + (((tickAnim - 31) / 9) * (0.82-(-3.3649)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(legleft, legleft.rotateAngleX + (float) Math.toRadians(xx), legleft.rotateAngleY + (float) Math.toRadians(yy), legleft.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 2) {
            xx = 15.84 + (((tickAnim - 0) / 2) * (24.5595-(15.84)));
            yy = 30.9 + (((tickAnim - 0) / 2) * (34.4051-(30.9)));
            zz = -0.62 + (((tickAnim - 0) / 2) * (-2.8618-(-0.62)));
        }
        else if (tickAnim >= 2 && tickAnim < 7) {
            xx = 24.5595 + (((tickAnim - 2) / 5) * (-1.967-(24.5595)));
            yy = 34.4051 + (((tickAnim - 2) / 5) * (13.0035-(34.4051)));
            zz = -2.8618 + (((tickAnim - 2) / 5) * (17.604-(-2.8618)));
        }
        else if (tickAnim >= 7 && tickAnim < 12) {
            xx = -1.967 + (((tickAnim - 7) / 5) * (-27.7402-(-1.967)));
            yy = 13.0035 + (((tickAnim - 7) / 5) * (13.3609-(13.0035)));
            zz = 17.604 + (((tickAnim - 7) / 5) * (10.6036-(17.604)));
        }
        else if (tickAnim >= 12 && tickAnim < 22) {
            xx = -27.7402 + (((tickAnim - 12) / 10) * (24.5595-(-27.7402)));
            yy = 13.3609 + (((tickAnim - 12) / 10) * (34.4051-(13.3609)));
            zz = 10.6036 + (((tickAnim - 12) / 10) * (-2.8618-(10.6036)));
        }
        else if (tickAnim >= 22 && tickAnim < 27) {
            xx = 24.5595 + (((tickAnim - 22) / 5) * (-1.967-(24.5595)));
            yy = 34.4051 + (((tickAnim - 22) / 5) * (13.0035-(34.4051)));
            zz = -2.8618 + (((tickAnim - 22) / 5) * (17.604-(-2.8618)));
        }
        else if (tickAnim >= 27 && tickAnim < 32) {
            xx = -1.967 + (((tickAnim - 27) / 5) * (-27.7402-(-1.967)));
            yy = 13.0035 + (((tickAnim - 27) / 5) * (13.3609-(13.0035)));
            zz = 17.604 + (((tickAnim - 27) / 5) * (10.6036-(17.604)));
        }
        else if (tickAnim >= 32 && tickAnim < 40) {
            xx = -27.7402 + (((tickAnim - 32) / 8) * (15.84-(-27.7402)));
            yy = 13.3609 + (((tickAnim - 32) / 8) * (30.9-(13.3609)));
            zz = 10.6036 + (((tickAnim - 32) / 8) * (-0.62-(10.6036)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(legright2, legright2.rotateAngleX + (float) Math.toRadians(xx), legright2.rotateAngleY + (float) Math.toRadians(yy), legright2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 3) {
            xx = -14.85 + (((tickAnim - 0) / 3) * (-27.7402-(-14.85)));
            yy = -13.18 + (((tickAnim - 0) / 3) * (-13.3609-(-13.18)));
            zz = -14.1 + (((tickAnim - 0) / 3) * (-10.6036-(-14.1)));
        }
        else if (tickAnim >= 3 && tickAnim < 13) {
            xx = -27.7402 + (((tickAnim - 3) / 10) * (24.5595-(-27.7402)));
            yy = -13.3609 + (((tickAnim - 3) / 10) * (-34.4051-(-13.3609)));
            zz = -10.6036 + (((tickAnim - 3) / 10) * (2.8618-(-10.6036)));
        }
        else if (tickAnim >= 13 && tickAnim < 18) {
            xx = 24.5595 + (((tickAnim - 13) / 5) * (-1.967-(24.5595)));
            yy = -34.4051 + (((tickAnim - 13) / 5) * (-13.0035-(-34.4051)));
            zz = 2.8618 + (((tickAnim - 13) / 5) * (-17.604-(2.8618)));
        }
        else if (tickAnim >= 18 && tickAnim < 23) {
            xx = -1.967 + (((tickAnim - 18) / 5) * (-27.7402-(-1.967)));
            yy = -13.0035 + (((tickAnim - 18) / 5) * (-13.3609-(-13.0035)));
            zz = -17.604 + (((tickAnim - 18) / 5) * (-10.6036-(-17.604)));
        }
        else if (tickAnim >= 23 && tickAnim < 33) {
            xx = -27.7402 + (((tickAnim - 23) / 10) * (24.5595-(-27.7402)));
            yy = -13.3609 + (((tickAnim - 23) / 10) * (-34.4051-(-13.3609)));
            zz = -10.6036 + (((tickAnim - 23) / 10) * (2.8618-(-10.6036)));
        }
        else if (tickAnim >= 33 && tickAnim < 38) {
            xx = 24.5595 + (((tickAnim - 33) / 5) * (-1.967-(24.5595)));
            yy = -34.4051 + (((tickAnim - 33) / 5) * (-13.0035-(-34.4051)));
            zz = 2.8618 + (((tickAnim - 33) / 5) * (-17.604-(2.8618)));
        }
        else if (tickAnim >= 38 && tickAnim < 40) {
            xx = -1.967 + (((tickAnim - 38) / 2) * (-14.85-(-1.967)));
            yy = -13.0035 + (((tickAnim - 38) / 2) * (-13.18-(-13.0035)));
            zz = -17.604 + (((tickAnim - 38) / 2) * (-14.1-(-17.604)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(legleft2, legleft2.rotateAngleX + (float) Math.toRadians(xx), legleft2.rotateAngleY + (float) Math.toRadians(yy), legleft2.rotateAngleZ + (float) Math.toRadians(zz));



        this.setRotateAngle(legright3, legright3.rotateAngleX + (float) Math.toRadians(15), legright3.rotateAngleY + (float) Math.toRadians(5-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180*3-50))*4), legright3.rotateAngleZ + (float) Math.toRadians(37.5));


        this.setRotateAngle(legleft3, legleft3.rotateAngleX + (float) Math.toRadians(15), legleft3.rotateAngleY + (float) Math.toRadians(-5+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180*3-50*2))*4), legleft3.rotateAngleZ + (float) Math.toRadians(-37.5));


        this.setRotateAngle(legright4, legright4.rotateAngleX + (float) Math.toRadians(0), legright4.rotateAngleY + (float) Math.toRadians(-57.5-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180*3))*4), legright4.rotateAngleZ + (float) Math.toRadians(67.5));


        this.setRotateAngle(legleft4, legleft4.rotateAngleX + (float) Math.toRadians(0), legleft4.rotateAngleY + (float) Math.toRadians(57.5+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180*3-50))*4), legleft4.rotateAngleZ + (float) Math.toRadians(-67.5));
        
        
    }

    @Override
    public void setRotationAngles(float f, float f1, float f2, float f3, float f4, float f5, Entity e) {
        super.setRotationAngles(f, f1, f2, f3, f4, f5, e);
        EntityPrehistoricFloraChronocancer ee = (EntityPrehistoricFloraChronocancer) e;
        if (ee.isInWater()) {
            if (ee.getIsMoving()) {
                //Do the BB animation
            }
            else {
                this.swing(armleft, 0.3F, -0.2F, false, 0, -0.1F, f2, 0.8F);
                this.swing(armright, 0.3F, 0.2F, false, 0, 0.1F, f2, 0.8F);
            }
        }
        else {
            this.swing(armleft, 0.3F, -0.2F, false, 0, -0.1F, f2, 0.8F);
            this.swing(armright, 0.3F, 0.2F, false, 0, 0.1F, f2, 0.8F);
        }

    }
}
