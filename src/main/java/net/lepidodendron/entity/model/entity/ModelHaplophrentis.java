package net.lepidodendron.entity.model.entity;

import net.ilexiconn.llibrary.client.model.tools.AdvancedModelRenderer;
import net.lepidodendron.entity.EntityPrehistoricFloraHaplophrentis;
import net.lepidodendron.entity.model.ModelBasePalaeopedia;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;

public class ModelHaplophrentis extends ModelBasePalaeopedia {
    private final AdvancedModelRenderer base;
    private final AdvancedModelRenderer cube_r1;
    private final AdvancedModelRenderer cube_r2;
    private final AdvancedModelRenderer hood;
    private final AdvancedModelRenderer body;
    private final AdvancedModelRenderer tentacle1;
    private final AdvancedModelRenderer tentacle3;
    private final AdvancedModelRenderer tentacle2;
    private final AdvancedModelRenderer tentacle4;
    private final AdvancedModelRenderer horn;
    private final AdvancedModelRenderer bone;
    private final AdvancedModelRenderer cube_r3;
    private final AdvancedModelRenderer cube_r4;
    private final AdvancedModelRenderer cube_r5;

    public ModelHaplophrentis() {
        this.textureWidth = 32;
        this.textureHeight = 32;

        this.base = new AdvancedModelRenderer(this);
        this.base.setRotationPoint(0.0F, 24.0F, 8.0F);
        this.base.cubeList.add(new ModelBox(base, 0, 5, -2.0F, -2.0F, -9.5F, 4, 2, 3, 0.01F, false));
        this.base.cubeList.add(new ModelBox(base, 11, 10, -2.0F, -1.0F, -11.5F, 4, 1, 2, 0.0F, false));

        this.cube_r1 = new AdvancedModelRenderer(this);
        this.cube_r1.setRotationPoint(0.0F, -3.0F, -9.5F);
        this.base.addChild(cube_r1);
        this.setRotateAngle(cube_r1, -0.6589F, 0.0F, 0.0F);
        this.cube_r1.cubeList.add(new ModelBox(cube_r1, 19, 19, -1.5F, 0.725F, 0.25F, 3, 2, 1, -0.01F, false));

        this.cube_r2 = new AdvancedModelRenderer(this);
        this.cube_r2.setRotationPoint(0.0F, 0.0F, -8.0F);
        this.base.addChild(cube_r2);
        this.setRotateAngle(cube_r2, -0.2182F, 0.0F, 0.0F);
        this.cube_r2.cubeList.add(new ModelBox(cube_r2, 0, 10, -2.0F, -2.6F, -2.05F, 4, 1, 3, 0.0F, false));

        this.hood = new AdvancedModelRenderer(this);
        this.hood.setRotationPoint(0.0F, -2.9F, -9.4F);
        this.base.addChild(hood);
        this.setRotateAngle(hood, 0.3054F, 0.0F, 0.0F);
        this.hood.cubeList.add(new ModelBox(hood, 13, 9, -2.0F, 0.0F, -4.0F, 4, 0, 1, 0.0F, false));
        this.hood.cubeList.add(new ModelBox(hood, 8, 5, -2.5F, 0.0F, -3.0F, 5, 0, 3, 0.0F, false));

        this.body = new AdvancedModelRenderer(this);
        this.body.setRotationPoint(0.0F, -2.25F, -9.5F);
        this.base.addChild(body);
        this.setRotateAngle(body, 0.3054F, 0.0F, 0.0F);
        this.body.cubeList.add(new ModelBox(body, 0, 14, -1.5F, -0.25F, -2.0F, 3, 1, 2, 0.0F, false));
        this.body.cubeList.add(new ModelBox(body, 18, 17, -1.0F, -0.25F, -3.0F, 2, 1, 1, 0.0F, false));

        this.tentacle1 = new AdvancedModelRenderer(this);
        this.tentacle1.setRotationPoint(-1.0F, 0.0F, -2.5F);
        this.body.addChild(tentacle1);
        this.setRotateAngle(tentacle1, 0.0F, -0.4363F, -0.5236F);
        this.tentacle1.cubeList.add(new ModelBox(tentacle1, 0, 1, -1.75F, 0.25F, -0.5F, 2, 0, 1, 0.0F, false));

        this.tentacle3 = new AdvancedModelRenderer(this);
        this.tentacle3.setRotationPoint(1.0F, 0.0F, -2.5F);
        this.body.addChild(tentacle3);
        this.setRotateAngle(tentacle3, 0.0F, 0.4363F, 0.5236F);
        this.tentacle3.cubeList.add(new ModelBox(tentacle3, 0, 1, -0.25F, 0.25F, -0.5F, 2, 0, 1, 0.0F, true));

        this.tentacle2 = new AdvancedModelRenderer(this);
        this.tentacle2.setRotationPoint(-0.5F, 0.0F, -2.75F);
        this.body.addChild(tentacle2);
        this.setRotateAngle(tentacle2, 0.3054F, -1.1345F, -0.3491F);
        this.tentacle2.cubeList.add(new ModelBox(tentacle2, 0, 0, -1.75F, 0.25F, -0.5F, 2, 0, 1, 0.0F, false));

        this.tentacle4 = new AdvancedModelRenderer(this);
        this.tentacle4.setRotationPoint(0.5F, 0.0F, -2.75F);
        this.body.addChild(tentacle4);
        this.setRotateAngle(tentacle4, 0.3054F, 1.1345F, 0.3491F);
        this.tentacle4.cubeList.add(new ModelBox(tentacle4, 0, 0, -0.25F, 0.25F, -0.5F, 2, 0, 1, 0.0F, true));

        this.horn = new AdvancedModelRenderer(this);
        this.horn.setRotationPoint(0.0F, -1.5F, -10.0F);
        this.base.addChild(horn);
        this.setRotateAngle(horn, 3.1416F, 0.0F, 0.0F);
        this.horn.cubeList.add(new ModelBox(horn, 0, 0, -4.5F, 0.0F, -0.5F, 9, 0, 5, 0.0F, false));
        this.horn.cubeList.add(new ModelBox(horn, -5, 23, -4.5F, 0.025F, -0.5F, 9, 0, 5, 0.0F, false));

        this.bone = new AdvancedModelRenderer(this);
        this.bone.setRotationPoint(0.0F, -2.0F, -7.0F);
        this.base.addChild(bone);
        this.bone.cubeList.add(new ModelBox(bone, 7, 17, -0.5F, 1.0F, 4.0F, 1, 1, 3, 0.0F, false));
        this.bone.cubeList.add(new ModelBox(bone, 12, 13, -1.5F, 0.0F, 0.0F, 3, 2, 2, 0.0F, false));
        this.bone.cubeList.add(new ModelBox(bone, 19, 6, -1.0F, 1.0F, 2.0F, 2, 1, 2, 0.0F, false));

        this.cube_r3 = new AdvancedModelRenderer(this);
        this.cube_r3.setRotationPoint(0.0F, 0.0F, 2.0F);
        this.bone.addChild(cube_r3);
        this.setRotateAngle(cube_r3, -0.2531F, 0.0F, 0.0F);
        this.cube_r3.cubeList.add(new ModelBox(cube_r3, 12, 17, -1.0F, 0.1F, 0.0F, 2, 1, 2, -0.01F, false));

        this.cube_r4 = new AdvancedModelRenderer(this);
        this.cube_r4.setRotationPoint(0.0F, 0.0F, 2.0F);
        this.bone.addChild(cube_r4);
        this.setRotateAngle(cube_r4, -0.1745F, 0.0F, 0.0F);
        this.cube_r4.cubeList.add(new ModelBox(cube_r4, 0, 17, -1.5F, 0.0F, -2.0F, 3, 1, 2, -0.01F, false));

        this.cube_r5 = new AdvancedModelRenderer(this);
        this.cube_r5.setRotationPoint(0.0F, 1.0F, 5.0F);
        this.bone.addChild(cube_r5);
        this.setRotateAngle(cube_r5, -0.2967F, 0.0F, 0.0F);
        this.cube_r5.cubeList.add(new ModelBox(cube_r5, 0, 20, -0.5F, 0.0F, -2.0F, 1, 1, 2, -0.01F, false));

        updateDefaultPose();
    }

    @Override
    public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        this.base.render(f5);
    }
    public void renderStaticFloor(float f) {
        this.setRotateAngle(base, -0.15F, 0.0F, 0.0F);
        this.setRotateAngle(hood, 0.4F, 0.0F, 0.0F);
        this.setRotateAngle(body, 0.3F, 0.0F, 0.0F);
        this.setRotateAngle(horn, -2.3F, 0.0F, 0.0F);
        this.base.offsetZ = 0.0F;
        this.base.offsetY = -0.05F;
        this.base.offsetX = 0.0F;
        this.base.render(0.01F);
        this.resetToDefaultPose();
    }
    public void setRotateAngle(ModelRenderer modelRenderer, float x, float y, float z) {
        modelRenderer.rotateAngleX = x;
        modelRenderer.rotateAngleY = y;
        modelRenderer.rotateAngleZ = z;
    }

    @Override
    public void setRotationAngles(float f, float f1, float f2, float f3, float f4, float f5, Entity e) {
        super.setRotationAngles(f, f1, f2, f3, f4, f5, e);
        //this.resetToDefaultPose();

    }

    @Override
    public void setLivingAnimations(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime) {
        super.setLivingAnimations(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime);
        this.resetToDefaultPose();
        EntityPrehistoricFloraHaplophrentis ee = (EntityPrehistoricFloraHaplophrentis) entitylivingbaseIn;

        if (ee.isReallyInWater()) {//swimming
            if (ee.getAnimation() != ee.ROAR_ANIMATION) {
                if (ee.getIsMoving()) {
                    animWalking(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime, false);
                } else {
                    animWalking(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime, false);
                }
            }
            else {
                animNoise(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime, ee.getAnimationTick());
            }
        }
        else {
            //land pose:
            if (!ee.getIsMoving()) { //static on land
                //
            }
            else {
                //moving on land
                //
            }
        }

    }

    public void animNoise(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime, double animTick) {
        EntityPrehistoricFloraHaplophrentis entity = (EntityPrehistoricFloraHaplophrentis) entitylivingbaseIn;

        int animCycle = 50;
        double tickAnim = animTick + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;
        if (tickAnim >= 0 && tickAnim < 12) {
            xx = 0 + (((tickAnim - 0) / 12) * (37-(0)));
            yy = 0 + (((tickAnim - 0) / 12) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 12) * (0-(0)));
        }
        else if (tickAnim >= 12 && tickAnim < 38) {
            xx = 37 + (((tickAnim - 12) / 26) * (37-(37)));
            yy = 0 + (((tickAnim - 12) / 26) * (0-(0)));
            zz = 0 + (((tickAnim - 12) / 26) * (0-(0)));
        }
        else if (tickAnim >= 38 && tickAnim < 50) {
            xx = 37 + (((tickAnim - 38) / 12) * (0-(37)));
            yy = 0 + (((tickAnim - 38) / 12) * (0-(0)));
            zz = 0 + (((tickAnim - 38) / 12) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(horn, horn.rotateAngleX + (float) Math.toRadians(xx), horn.rotateAngleY + (float) Math.toRadians(yy), horn.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 12) {
            xx = 0 + (((tickAnim - 0) / 12) * (-5-(0)));
            yy = 0 + (((tickAnim - 0) / 12) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 12) * (0-(0)));
        }
        else if (tickAnim >= 12 && tickAnim < 38) {
            xx = -5 + (((tickAnim - 12) / 26) * (-5-(-5)));
            yy = 0 + (((tickAnim - 12) / 26) * (0-(0)));
            zz = 0 + (((tickAnim - 12) / 26) * (0-(0)));
        }
        else if (tickAnim >= 38 && tickAnim < 50) {
            xx = -5 + (((tickAnim - 38) / 12) * (0-(-5)));
            yy = 0 + (((tickAnim - 38) / 12) * (0-(0)));
            zz = 0 + (((tickAnim - 38) / 12) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(base, base.rotateAngleX + (float) Math.toRadians(xx), base.rotateAngleY + (float) Math.toRadians(yy), base.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 18) {
            xx = 16 + (((tickAnim - 0) / 18) * (0-(16)));
            yy = 0 + (((tickAnim - 0) / 18) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 18) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 35) {
            xx = 0 + (((tickAnim - 18) / 17) * (0-(0)));
            yy = 0 + (((tickAnim - 18) / 17) * (0-(0)));
            zz = 0 + (((tickAnim - 18) / 17) * (0-(0)));
        }
        else if (tickAnim >= 35 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 35) / 15) * (16-(0)));
            yy = 0 + (((tickAnim - 35) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 35) / 15) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(hood, hood.rotateAngleX + (float) Math.toRadians(xx), hood.rotateAngleY + (float) Math.toRadians(yy), hood.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 18) {
            xx = 0 + (((tickAnim - 0) / 18) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 18) * (0-(0)));
            zz = 1.5 + (((tickAnim - 0) / 18) * (0-(1.5)));
        }
        else if (tickAnim >= 18 && tickAnim < 35) {
            xx = 0 + (((tickAnim - 18) / 17) * (0-(0)));
            yy = 0 + (((tickAnim - 18) / 17) * (0-(0)));
            zz = 0 + (((tickAnim - 18) / 17) * (0-(0)));
        }
        else if (tickAnim >= 35 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 35) / 15) * (0-(0)));
            yy = 0 + (((tickAnim - 35) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 35) / 15) * (1.5-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.body.rotationPointX = this.body.rotationPointX + (float)(xx);
        this.body.rotationPointY = this.body.rotationPointY - (float)(yy);
        this.body.rotationPointZ = this.body.rotationPointZ + (float)(zz);




        if (tickAnim >= 18 && tickAnim < 26) {
            xx = 0 + (((tickAnim - 18) / 8) * (0-(0)));
            yy = 0 + (((tickAnim - 18) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 18) / 8) * (11-(0)));
        }
        else if (tickAnim >= 26 && tickAnim < 35) {
            xx = 0 + (((tickAnim - 26) / 9) * (0-(0)));
            yy = 0 + (((tickAnim - 26) / 9) * (0-(0)));
            zz = 11 + (((tickAnim - 26) / 9) * (0-(11)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tentacle1, tentacle1.rotateAngleX + (float) Math.toRadians(xx), tentacle1.rotateAngleY + (float) Math.toRadians(yy), tentacle1.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 18) {
            xx = 1 + (((tickAnim - 0) / 18) * (0-(1)));
            yy = 0 + (((tickAnim - 0) / 18) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 18) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 35) {
            xx = 0 + (((tickAnim - 18) / 17) * (0-(0)));
            yy = 0 + (((tickAnim - 18) / 17) * (0-(0)));
            zz = 0 + (((tickAnim - 18) / 17) * (0-(0)));
        }
        else if (tickAnim >= 35 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 35) / 15) * (1-(0)));
            yy = 0 + (((tickAnim - 35) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 35) / 15) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.tentacle1.rotationPointX = this.tentacle1.rotationPointX + (float)(xx);
        this.tentacle1.rotationPointY = this.tentacle1.rotationPointY - (float)(yy);
        this.tentacle1.rotationPointZ = this.tentacle1.rotationPointZ + (float)(zz);




        if (tickAnim >= 18 && tickAnim < 26) {
            xx = 0 + (((tickAnim - 18) / 8) * (0-(0)));
            yy = 0 + (((tickAnim - 18) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 18) / 8) * (-9-(0)));
        }
        else if (tickAnim >= 26 && tickAnim < 35) {
            xx = 0 + (((tickAnim - 26) / 9) * (0-(0)));
            yy = 0 + (((tickAnim - 26) / 9) * (0-(0)));
            zz = -9 + (((tickAnim - 26) / 9) * (0-(-9)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tentacle3, tentacle3.rotateAngleX + (float) Math.toRadians(xx), tentacle3.rotateAngleY + (float) Math.toRadians(yy), tentacle3.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 18) {
            xx = -1 + (((tickAnim - 0) / 18) * (0-(-1)));
            yy = 0 + (((tickAnim - 0) / 18) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 18) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 35) {
            xx = 0 + (((tickAnim - 18) / 17) * (0-(0)));
            yy = 0 + (((tickAnim - 18) / 17) * (0-(0)));
            zz = 0 + (((tickAnim - 18) / 17) * (0-(0)));
        }
        else if (tickAnim >= 35 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 35) / 15) * (-1-(0)));
            yy = 0 + (((tickAnim - 35) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 35) / 15) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.tentacle3.rotationPointX = this.tentacle3.rotationPointX + (float)(xx);
        this.tentacle3.rotationPointY = this.tentacle3.rotationPointY - (float)(yy);
        this.tentacle3.rotationPointZ = this.tentacle3.rotationPointZ + (float)(zz);




        if (tickAnim >= 18 && tickAnim < 26) {
            xx = 0 + (((tickAnim - 18) / 8) * (0-(0)));
            yy = 0 + (((tickAnim - 18) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 18) / 8) * (-9-(0)));
        }
        else if (tickAnim >= 26 && tickAnim < 35) {
            xx = 0 + (((tickAnim - 26) / 9) * (0-(0)));
            yy = 0 + (((tickAnim - 26) / 9) * (0-(0)));
            zz = -9 + (((tickAnim - 26) / 9) * (0-(-9)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tentacle2, tentacle2.rotateAngleX + (float) Math.toRadians(xx), tentacle2.rotateAngleY + (float) Math.toRadians(yy), tentacle2.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 18) {
            xx = 0 + (((tickAnim - 0) / 18) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 18) * (0-(0)));
            zz = 1 + (((tickAnim - 0) / 18) * (0-(1)));
        }
        else if (tickAnim >= 18 && tickAnim < 35) {
            xx = 0 + (((tickAnim - 18) / 17) * (0-(0)));
            yy = 0 + (((tickAnim - 18) / 17) * (0-(0)));
            zz = 0 + (((tickAnim - 18) / 17) * (0-(0)));
        }
        else if (tickAnim >= 35 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 35) / 15) * (0-(0)));
            yy = 0 + (((tickAnim - 35) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 35) / 15) * (1-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.tentacle2.rotationPointX = this.tentacle2.rotationPointX + (float)(xx);
        this.tentacle2.rotationPointY = this.tentacle2.rotationPointY - (float)(yy);
        this.tentacle2.rotationPointZ = this.tentacle2.rotationPointZ + (float)(zz);




        if (tickAnim >= 18 && tickAnim < 26) {
            xx = 0 + (((tickAnim - 18) / 8) * (-14-(0)));
            yy = 0 + (((tickAnim - 18) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 18) / 8) * (0-(0)));
        }
        else if (tickAnim >= 26 && tickAnim < 35) {
            xx = -14 + (((tickAnim - 26) / 9) * (0-(-14)));
            yy = 0 + (((tickAnim - 26) / 9) * (0-(0)));
            zz = 0 + (((tickAnim - 26) / 9) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tentacle4, tentacle4.rotateAngleX + (float) Math.toRadians(xx), tentacle4.rotateAngleY + (float) Math.toRadians(yy), tentacle4.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 18) {
            xx = 0 + (((tickAnim - 0) / 18) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 18) * (0-(0)));
            zz = 1 + (((tickAnim - 0) / 18) * (0-(1)));
        }
        else if (tickAnim >= 18 && tickAnim < 35) {
            xx = 0 + (((tickAnim - 18) / 17) * (0-(0)));
            yy = 0 + (((tickAnim - 18) / 17) * (0-(0)));
            zz = 0 + (((tickAnim - 18) / 17) * (0-(0)));
        }
        else if (tickAnim >= 35 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 35) / 15) * (0-(0)));
            yy = 0 + (((tickAnim - 35) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 35) / 15) * (1-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.tentacle4.rotationPointX = this.tentacle4.rotationPointX + (float)(xx);
        this.tentacle4.rotationPointY = this.tentacle4.rotationPointY - (float)(yy);
        this.tentacle4.rotationPointZ = this.tentacle4.rotationPointZ + (float)(zz);

    }

    public void animWalking(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime, boolean isStatic) {
        EntityPrehistoricFloraHaplophrentis entity = (EntityPrehistoricFloraHaplophrentis) entitylivingbaseIn;

        int animCycle = 28;
        double tickAnim = 0;
        if (!isStatic) {
            tickAnim = (entity.ticksExisted + entity.getTickOffset()) - (int) (Math.floor((double) (entity.ticksExisted + entity.getTickOffset()) / (double) animCycle) * (double) animCycle) + partialTickTime;
        }
        double xx = 0;
        double yy = 0;
        double zz = 0;

        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 0) / 10) * (-5-(0)));
            yy = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 20) {
            xx = -5 + (((tickAnim - 10) / 10) * (0-(-5)));
            yy = 0 + (((tickAnim - 10) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 10) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 28) {
            xx = 0 + (((tickAnim - 20) / 8) * (0-(0)));
            yy = 0 + (((tickAnim - 20) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 8) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(base, base.rotateAngleX + (float) Math.toRadians(xx), base.rotateAngleY + (float) Math.toRadians(yy), base.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 0) / 5) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 5) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 5) / 5) * (0-(0)));
            yy = 0 + (((tickAnim - 5) / 5) * (0.05-(0)));
            zz = 0 + (((tickAnim - 5) / 5) * (-0.7-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 10) / 10) * (0-(0)));
            yy = 0.05 + (((tickAnim - 10) / 10) * (0-(0.05)));
            zz = -0.7 + (((tickAnim - 10) / 10) * (-2.1-(-0.7)));
        }
        else if (tickAnim >= 20 && tickAnim < 28) {
            xx = 0 + (((tickAnim - 20) / 8) * (0-(0)));
            yy = 0 + (((tickAnim - 20) / 8) * (0-(0)));
            zz = -2.1 + (((tickAnim - 20) / 8) * (0-(-2.1)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        zz = 0;
        this.base.rotationPointX = this.base.rotationPointX + (float)(xx);
        this.base.rotationPointY = this.base.rotationPointY - (float)(yy);
        this.base.rotationPointZ = this.base.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 12) {
            xx = 17 + (((tickAnim - 0) / 12) * (11-(17)));
            yy = 0 + (((tickAnim - 0) / 12) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 12) * (0-(0)));
        }
        else if (tickAnim >= 12 && tickAnim < 28) {
            xx = 11 + (((tickAnim - 12) / 16) * (17-(11)));
            yy = 0 + (((tickAnim - 12) / 16) * (0-(0)));
            zz = 0 + (((tickAnim - 12) / 16) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(hood, hood.rotateAngleX + (float) Math.toRadians(xx), hood.rotateAngleY + (float) Math.toRadians(yy), hood.rotateAngleZ + (float) Math.toRadians(zz));



        this.setRotateAngle(body, body.rotateAngleX + (float) Math.toRadians(0), body.rotateAngleY + (float) Math.toRadians(0), body.rotateAngleZ + (float) Math.toRadians(0));
        this.body.rotationPointX = this.body.rotationPointX + (float)(0);
        this.body.rotationPointY = this.body.rotationPointY - (float)(0);
        this.body.rotationPointZ = this.body.rotationPointZ + (float)(1.2);



        if (tickAnim >= 17 && tickAnim < 28) {
            xx = 0.6 + (((tickAnim - 17) / 11) * (0.6-(0.6)));
            yy = 0 + (((tickAnim - 17) / 11) * (0-(0)));
            zz = 0.4 + (((tickAnim - 17) / 11) * (0.4-(0.4)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.tentacle1.rotationPointX = this.tentacle1.rotationPointX + (float)(xx);
        this.tentacle1.rotationPointY = this.tentacle1.rotationPointY - (float)(yy);
        this.tentacle1.rotationPointZ = this.tentacle1.rotationPointZ + (float)(zz);




        if (tickAnim >= 17 && tickAnim < 28) {
            xx = -1 + (((tickAnim - 17) / 11) * (-1-(-1)));
            yy = 0 + (((tickAnim - 17) / 11) * (0-(0)));
            zz = 0.3 + (((tickAnim - 17) / 11) * (0.3-(0.3)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.tentacle3.rotationPointX = this.tentacle3.rotationPointX + (float)(xx);
        this.tentacle3.rotationPointY = this.tentacle3.rotationPointY - (float)(yy);
        this.tentacle3.rotationPointZ = this.tentacle3.rotationPointZ + (float)(zz);




        if (tickAnim >= 17 && tickAnim < 28) {
            xx = 0 + (((tickAnim - 17) / 11) * (0-(0)));
            yy = 0 + (((tickAnim - 17) / 11) * (0-(0)));
            zz = 1 + (((tickAnim - 17) / 11) * (1-(1)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.tentacle2.rotationPointX = this.tentacle2.rotationPointX + (float)(xx);
        this.tentacle2.rotationPointY = this.tentacle2.rotationPointY - (float)(yy);
        this.tentacle2.rotationPointZ = this.tentacle2.rotationPointZ + (float)(zz);




        if (tickAnim >= 17 && tickAnim < 28) {
            xx = 0 + (((tickAnim - 17) / 11) * (0-(0)));
            yy = 0 + (((tickAnim - 17) / 11) * (0-(0)));
            zz = 1 + (((tickAnim - 17) / 11) * (1-(1)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.tentacle4.rotationPointX = this.tentacle4.rotationPointX + (float)(xx);
        this.tentacle4.rotationPointY = this.tentacle4.rotationPointY - (float)(yy);
        this.tentacle4.rotationPointZ = this.tentacle4.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 0) / 5) * (18-(0)));
            yy = 0 + (((tickAnim - 0) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 5) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 20) {
            xx = 18 + (((tickAnim - 5) / 15) * (162-(18)));
            yy = 0 + (((tickAnim - 5) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 5) / 15) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 28) {
            xx = 162 + (((tickAnim - 20) / 8) * (0-(162)));
            yy = 0 + (((tickAnim - 20) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 8) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(horn, horn.rotateAngleX + (float) Math.toRadians(xx), horn.rotateAngleY + (float) Math.toRadians(yy), horn.rotateAngleZ + (float) Math.toRadians(zz));



        this.setRotateAngle(bone, bone.rotateAngleX + (float) Math.toRadians(0), bone.rotateAngleY + (float) Math.toRadians(0), bone.rotateAngleZ + (float) Math.toRadians(0));
    }
}




