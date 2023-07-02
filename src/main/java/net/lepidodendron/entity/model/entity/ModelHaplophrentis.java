package net.lepidodendron.entity.model.entity;

import net.ilexiconn.llibrary.client.model.tools.AdvancedModelBase;
import net.ilexiconn.llibrary.client.model.tools.AdvancedModelRenderer;
import net.lepidodendron.entity.EntityPrehistoricFloraHaplophrentis;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;

public class ModelHaplophrentis extends AdvancedModelBase {
    private final AdvancedModelRenderer base;
    private final AdvancedModelRenderer cube_r1;
    private final AdvancedModelRenderer cube_r2;
    private final AdvancedModelRenderer hood;
    private final AdvancedModelRenderer body;
    private final AdvancedModelRenderer tentacle1;
    private final AdvancedModelRenderer tentacle3;
    private final AdvancedModelRenderer tentacle2;
    private final AdvancedModelRenderer tentacle4;
    private final AdvancedModelRenderer hornleft;
    private final AdvancedModelRenderer hornright;
    private final AdvancedModelRenderer bone;
    private final AdvancedModelRenderer cube_r3;
    private final AdvancedModelRenderer cube_r4;
    private final AdvancedModelRenderer cube_r5;
    public ModelHaplophrentis() {
        this.textureWidth = 32;
        this.textureHeight = 32;

        this.base = new AdvancedModelRenderer(this);
        this.base.setRotationPoint(0.0F, 24.0F, 8.0F);
        this.setRotateAngle(base, -0.1745F, 0.0F, 0.0F);
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

        this.hornleft = new AdvancedModelRenderer(this);
        this.hornleft.setRotationPoint(1.0F, -1.5F, -10.0F);
        this.base.addChild(hornleft);
        this.setRotateAngle(hornleft, -2.138F, 0.0F, 0.0F);
        this.hornleft.cubeList.add(new ModelBox(hornleft, 3, 23, -1.5F, 0.025F, -0.5F, 5, 0, 5, 0.0F, false));

        this.hornright = new AdvancedModelRenderer(this);
        this.hornright.setRotationPoint(-1.0F, -1.5F, -10.0F);
        this.base.addChild(hornright);
        this.setRotateAngle(hornright, -2.138F, 0.0F, 0.0F);
        this.hornright.cubeList.add(new ModelBox(hornright, 3, 23, -3.5F, 0.025F, -0.5F, 5, 0, 5, 0.0F, true));

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

    public void renderStatic(float f) {
        //Static renderer for taxidermy
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
            if (ee.getIsMoving()) {
                animWalking(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime);
            }
        }
        else {
            //land pose:
            if (!ee.getIsMoving()) { //static in land
                //
            }
            else {
                //moving in water
                //
            }
        }

        if(ee.getAnimation() == ee.ROAR_ANIMATION) {
            animNoise(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime, ee.getAnimationTick());
        }

    }

    public void animNoise(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime, double animTick) {
        EntityPrehistoricFloraHaplophrentis entity = (EntityPrehistoricFloraHaplophrentis) entitylivingbaseIn;
        int animCycle = 63;
        double tickAnim = animTick + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;
        if (tickAnim >= 0 && tickAnim < 13) {
            xx = 10D + (((tickAnim - 0D) / 13D) * (3D-(10D)));
            yy = 0D + (((tickAnim - 0D) / 13D) * (0D-(0D)));
            zz = 0D + (((tickAnim - 0D) / 13D) * (0D-(0D)));
        }
        else if (tickAnim >= 13 && tickAnim < 44) {
            xx = 3D + (((tickAnim - 13D) / 31D) * (3D-(3D)));
            yy = 0D + (((tickAnim - 13D) / 31D) * (0D-(0D)));
            zz = 0D + (((tickAnim - 13D) / 31D) * (0D-(0D)));
        }
        else if (tickAnim >= 44 && tickAnim < 63) {
            xx = 3D + (((tickAnim - 44D) / 19D) * (10D-(3D)));
            yy = 0D + (((tickAnim - 44D) / 19D) * (0D-(0D)));
            zz = 0D + (((tickAnim - 44D) / 19D) * (0D-(0D)));
        }
        this.setRotateAngle(base, base.rotateAngleX + (float) Math.toRadians(xx), base.rotateAngleY + (float) Math.toRadians(yy), base.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 63) {
            xx = 0D + (((tickAnim - 0D) / 63D) * (0D-(0D)));
            yy = 0D + (((tickAnim - 0D) / 63D) * (0D-(0D)));
            zz = 0D + (((tickAnim - 0D) / 63D) * (0D-(0D)));
        }
        this.base.offsetX = (float) Math.toRadians(xx);
        this.base.offsetY = (float) Math.toRadians(yy);
        this.base.offsetZ = (float) Math.toRadians(zz);




        if (tickAnim >= 0 && tickAnim < 13) {
            xx = 23D + (((tickAnim - 0D) / 13D) * (-1D-(23D)));
            yy = 0D + (((tickAnim - 0D) / 13D) * (0D-(0D)));
            zz = 0D + (((tickAnim - 0D) / 13D) * (0D-(0D)));
        }
        else if (tickAnim >= 13 && tickAnim < 44) {
            xx = -1D + (((tickAnim - 13D) / 31D) * (-1D-(-1D)));
            yy = 0D + (((tickAnim - 13D) / 31D) * (0D-(0D)));
            zz = 0D + (((tickAnim - 13D) / 31D) * (0D-(0D)));
        }
        else if (tickAnim >= 44 && tickAnim < 63) {
            xx = -1D + (((tickAnim - 44D) / 19D) * (23D-(-1D)));
            yy = 0D + (((tickAnim - 44D) / 19D) * (0D-(0D)));
            zz = 0D + (((tickAnim - 44D) / 19D) * (0D-(0D)));
        }
        this.setRotateAngle(hood, hood.rotateAngleX + (float) Math.toRadians(xx), hood.rotateAngleY + (float) Math.toRadians(yy), hood.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 13 && tickAnim < 44) {
            xx = -2D + (((tickAnim - 13D) / 31D) * (-2D-(-2D)));
            yy = 0D + (((tickAnim - 13D) / 31D) * (0D-(0D)));
            zz = 0D + (((tickAnim - 13D) / 31D) * (0D-(0D)));
        }
        this.setRotateAngle(body, body.rotateAngleX + (float) Math.toRadians(xx), body.rotateAngleY + (float) Math.toRadians(yy), body.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 13) {
            xx = 0D + (((tickAnim - 0D) / 13D) * (0D-(0D)));
            yy = 0D + (((tickAnim - 0D) / 13D) * (-0.1D-(0D)));
            zz = 1.8D + (((tickAnim - 0D) / 13D) * (0D-(1.8D)));
        }
        else if (tickAnim >= 13 && tickAnim < 44) {
            xx = 0D + (((tickAnim - 13D) / 31D) * (0D-(0D)));
            yy = -0.1D + (((tickAnim - 13D) / 31D) * (-0.1D-(-0.1D)));
            zz = 0D + (((tickAnim - 13D) / 31D) * (0D-(0D)));
        }
        else if (tickAnim >= 44 && tickAnim < 63) {
            xx = 0D + (((tickAnim - 44D) / 19D) * (0D-(0D)));
            yy = -0.1D + (((tickAnim - 44D) / 19D) * (0D-(-0.1D)));
            zz = 0D + (((tickAnim - 44D) / 19D) * (1.8D-(0D)));
        }
        this.body.offsetX = (float) Math.toRadians(xx);
        this.body.offsetY = (float) Math.toRadians(yy);
        this.body.offsetZ = (float) Math.toRadians(zz);




        if (tickAnim >= 13 && tickAnim < 23) {
            xx = 0D + (((tickAnim - 13D) / 10D) * (-9D-(0D)));
            yy = 0D + (((tickAnim - 13D) / 10D) * (0D-(0D)));
            zz = 0D + (((tickAnim - 13D) / 10D) * (0D-(0D)));
        }
        else if (tickAnim >= 23 && tickAnim < 38) {
            xx = -9D + (((tickAnim - 23D) / 15D) * (16D-(-9D)));
            yy = 0D + (((tickAnim - 23D) / 15D) * (0D-(0D)));
            zz = 0D + (((tickAnim - 23D) / 15D) * (0D-(0D)));
        }
        else if (tickAnim >= 38 && tickAnim < 44) {
            xx = 16D + (((tickAnim - 38D) / 6D) * (0D-(16D)));
            yy = 0D + (((tickAnim - 38D) / 6D) * (0D-(0D)));
            zz = 0D + (((tickAnim - 38D) / 6D) * (0D-(0D)));
        }
        this.setRotateAngle(tentacle1, tentacle1.rotateAngleX + (float) Math.toRadians(xx), tentacle1.rotateAngleY + (float) Math.toRadians(yy), tentacle1.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 13) {
            xx = 0.5D + (((tickAnim - 0D) / 13D) * (0D-(0.5D)));
            yy = 0D + (((tickAnim - 0D) / 13D) * (0D-(0D)));
            zz = 0D + (((tickAnim - 0D) / 13D) * (0D-(0D)));
        }
        else if (tickAnim >= 13 && tickAnim < 44) {
            xx = 0D + (((tickAnim - 13D) / 31D) * (0D-(0D)));
            yy = 0D + (((tickAnim - 13D) / 31D) * (0D-(0D)));
            zz = 0D + (((tickAnim - 13D) / 31D) * (0D-(0D)));
        }
        else if (tickAnim >= 44 && tickAnim < 63) {
            xx = 0D + (((tickAnim - 44D) / 19D) * (0.5D-(0D)));
            yy = 0D + (((tickAnim - 44D) / 19D) * (0D-(0D)));
            zz = 0D + (((tickAnim - 44D) / 19D) * (0D-(0D)));
        }
        this.tentacle1.offsetX = (float) Math.toRadians(xx);
        this.tentacle1.offsetY = (float) Math.toRadians(yy);
        this.tentacle1.offsetZ = (float) Math.toRadians(zz);




        if (tickAnim >= 13 && tickAnim < 23) {
            xx = 0D + (((tickAnim - 13D) / 10D) * (-9D-(0D)));
            yy = 0D + (((tickAnim - 13D) / 10D) * (0D-(0D)));
            zz = 0D + (((tickAnim - 13D) / 10D) * (0D-(0D)));
        }
        else if (tickAnim >= 23 && tickAnim < 38) {
            xx = -9D + (((tickAnim - 23D) / 15D) * (29D-(-9D)));
            yy = 0D + (((tickAnim - 23D) / 15D) * (0D-(0D)));
            zz = 0D + (((tickAnim - 23D) / 15D) * (0D-(0D)));
        }
        else if (tickAnim >= 38 && tickAnim < 44) {
            xx = 29D + (((tickAnim - 38D) / 6D) * (0D-(29D)));
            yy = 0D + (((tickAnim - 38D) / 6D) * (0D-(0D)));
            zz = 0D + (((tickAnim - 38D) / 6D) * (0D-(0D)));
        }
        this.setRotateAngle(tentacle3, tentacle3.rotateAngleX + (float) Math.toRadians(xx), tentacle3.rotateAngleY + (float) Math.toRadians(yy), tentacle3.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 13) {
            xx = -0.5D + (((tickAnim - 0D) / 13D) * (0.1D-(-0.5D)));
            yy = 0D + (((tickAnim - 0D) / 13D) * (0D-(0D)));
            zz = 0D + (((tickAnim - 0D) / 13D) * (0D-(0D)));
        }
        else if (tickAnim >= 13 && tickAnim < 44) {
            xx = 0.1D + (((tickAnim - 13D) / 31D) * (0.1D-(0.1D)));
            yy = 0D + (((tickAnim - 13D) / 31D) * (0D-(0D)));
            zz = 0D + (((tickAnim - 13D) / 31D) * (0D-(0D)));
        }
        else if (tickAnim >= 44 && tickAnim < 63) {
            xx = 0.1D + (((tickAnim - 44D) / 19D) * (-0.5D-(0.1D)));
            yy = 0D + (((tickAnim - 44D) / 19D) * (0D-(0D)));
            zz = 0D + (((tickAnim - 44D) / 19D) * (0D-(0D)));
        }
        this.tentacle3.offsetX = (float) Math.toRadians(xx);
        this.tentacle3.offsetY = (float) Math.toRadians(yy);
        this.tentacle3.offsetZ = (float) Math.toRadians(zz);




        if (tickAnim >= 13 && tickAnim < 23) {
            xx = 0D + (((tickAnim - 13D) / 10D) * (13D-(0D)));
            yy = 0D + (((tickAnim - 13D) / 10D) * (0D-(0D)));
            zz = 0D + (((tickAnim - 13D) / 10D) * (0D-(0D)));
        }
        else if (tickAnim >= 23 && tickAnim < 38) {
            xx = 13D + (((tickAnim - 23D) / 15D) * (-14D-(13D)));
            yy = 0D + (((tickAnim - 23D) / 15D) * (0D-(0D)));
            zz = 0D + (((tickAnim - 23D) / 15D) * (0D-(0D)));
        }
        else if (tickAnim >= 38 && tickAnim < 48) {
            xx = -14D + (((tickAnim - 38D) / 10D) * (0D-(-14D)));
            yy = 0D + (((tickAnim - 38D) / 10D) * (0D-(0D)));
            zz = 0D + (((tickAnim - 38D) / 10D) * (0D-(0D)));
        }
        this.setRotateAngle(tentacle2, tentacle2.rotateAngleX + (float) Math.toRadians(xx), tentacle2.rotateAngleY + (float) Math.toRadians(yy), tentacle2.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 13) {
            xx = 0D + (((tickAnim - 0D) / 13D) * (0D-(0D)));
            yy = 0D + (((tickAnim - 0D) / 13D) * (0D-(0D)));
            zz = 0.6D + (((tickAnim - 0D) / 13D) * (-0.3D-(0.6D)));
        }
        else if (tickAnim >= 13 && tickAnim < 48) {
            xx = 0D + (((tickAnim - 13D) / 35D) * (0D-(0D)));
            yy = 0D + (((tickAnim - 13D) / 35D) * (0D-(0D)));
            zz = -0.3D + (((tickAnim - 13D) / 35D) * (-0.3D-(-0.3D)));
        }
        else if (tickAnim >= 48 && tickAnim < 58) {
            xx = 0D + (((tickAnim - 48D) / 10D) * (0D-(0D)));
            yy = 0D + (((tickAnim - 48D) / 10D) * (0D-(0D)));
            zz = -0.3D + (((tickAnim - 48D) / 10D) * (0.6D-(-0.3D)));
        }
        this.tentacle2.offsetX = (float) Math.toRadians(xx);
        this.tentacle2.offsetY = (float) Math.toRadians(yy);
        this.tentacle2.offsetZ = (float) Math.toRadians(zz);




        if (tickAnim >= 13 && tickAnim < 23) {
            xx = 0D + (((tickAnim - 13D) / 10D) * (18D-(0D)));
            yy = 0D + (((tickAnim - 13D) / 10D) * (0D-(0D)));
            zz = 0D + (((tickAnim - 13D) / 10D) * (0D-(0D)));
        }
        else if (tickAnim >= 23 && tickAnim < 38) {
            xx = 18D + (((tickAnim - 23D) / 15D) * (-21D-(18D)));
            yy = 0D + (((tickAnim - 23D) / 15D) * (0D-(0D)));
            zz = 0D + (((tickAnim - 23D) / 15D) * (0D-(0D)));
        }
        else if (tickAnim >= 38 && tickAnim < 48) {
            xx = -21D + (((tickAnim - 38D) / 10D) * (0D-(-21D)));
            yy = 0D + (((tickAnim - 38D) / 10D) * (0D-(0D)));
            zz = 0D + (((tickAnim - 38D) / 10D) * (0D-(0D)));
        }
        this.setRotateAngle(tentacle4, tentacle4.rotateAngleX + (float) Math.toRadians(xx), tentacle4.rotateAngleY + (float) Math.toRadians(yy), tentacle4.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 13) {
            xx = 0D + (((tickAnim - 0D) / 13D) * (0D-(0D)));
            yy = 0D + (((tickAnim - 0D) / 13D) * (0D-(0D)));
            zz = 0.8D + (((tickAnim - 0D) / 13D) * (-0.1D-(0.8D)));
        }
        else if (tickAnim >= 13 && tickAnim < 48) {
            xx = 0D + (((tickAnim - 13D) / 35D) * (0D-(0D)));
            yy = 0D + (((tickAnim - 13D) / 35D) * (0D-(0D)));
            zz = -0.1D + (((tickAnim - 13D) / 35D) * (-0.1D-(-0.1D)));
        }
        else if (tickAnim >= 48 && tickAnim < 63) {
            xx = 0D + (((tickAnim - 48D) / 15D) * (0D-(0D)));
            yy = 0D + (((tickAnim - 48D) / 15D) * (0D-(0D)));
            zz = -0.1D + (((tickAnim - 48D) / 15D) * (0.8D-(-0.1D)));
        }
        this.tentacle4.offsetX = (float) Math.toRadians(xx);
        this.tentacle4.offsetY = (float) Math.toRadians(yy);
        this.tentacle4.offsetZ = (float) Math.toRadians(zz);




        if (tickAnim >= 0 && tickAnim < 13) {
            xx = 115.95161D + (((tickAnim - 0D) / 13D) * (84.76358D-(115.95161D)));
            yy = 6.9548D + (((tickAnim - 0D) / 13D) * (32.7611D-(6.9548D)));
            zz = 0.79634D + (((tickAnim - 0D) / 13D) * (-4.2045D-(0.79634D)));
        }
        else if (tickAnim >= 13 && tickAnim < 44) {
            xx = 84.76358D + (((tickAnim - 13D) / 31D) * (84.76358D-(84.76358D)));
            yy = 32.7611D + (((tickAnim - 13D) / 31D) * (32.7611D-(32.7611D)));
            zz = -4.2045D + (((tickAnim - 13D) / 31D) * (-4.2045D-(-4.2045D)));
        }
        else if (tickAnim >= 44 && tickAnim < 63) {
            xx = 84.76358D + (((tickAnim - 44D) / 19D) * (115.95161D-(84.76358D)));
            yy = 32.7611D + (((tickAnim - 44D) / 19D) * (6.9548D-(32.7611D)));
            zz = -4.2045D + (((tickAnim - 44D) / 19D) * (0.79634D-(-4.2045D)));
        }
        this.setRotateAngle(hornleft, hornleft.rotateAngleX + (float) Math.toRadians(xx), hornleft.rotateAngleY + (float) Math.toRadians(yy), hornleft.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 13) {
            xx = 115.95161D + (((tickAnim - 0D) / 13D) * (84.76358D-(115.95161D)));
            yy = -6.95478D + (((tickAnim - 0D) / 13D) * (-32.76114D-(-6.95478D)));
            zz = 0.79634D + (((tickAnim - 0D) / 13D) * (4.20454D-(0.79634D)));
        }
        else if (tickAnim >= 13 && tickAnim < 44) {
            xx = 84.76358D + (((tickAnim - 13D) / 31D) * (84.76358D-(84.76358D)));
            yy = -32.76114D + (((tickAnim - 13D) / 31D) * (-32.76114D-(-32.76114D)));
            zz = 4.20454D + (((tickAnim - 13D) / 31D) * (4.20454D-(4.20454D)));
        }
        else if (tickAnim >= 44 && tickAnim < 63) {
            xx = 84.76358D + (((tickAnim - 44D) / 19D) * (115.95161D-(84.76358D)));
            yy = -32.76114D + (((tickAnim - 44D) / 19D) * (-6.95478D-(-32.76114D)));
            zz = 4.20454D + (((tickAnim - 44D) / 19D) * (0.79634D-(4.20454D)));
        }
        this.setRotateAngle(hornright, hornright.rotateAngleX + (float) Math.toRadians(xx), hornright.rotateAngleY + (float) Math.toRadians(yy), hornright.rotateAngleZ + (float) Math.toRadians(zz));

    }

    public void animWalking(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime) {
        EntityPrehistoricFloraHaplophrentis entity = (EntityPrehistoricFloraHaplophrentis) entitylivingbaseIn;
        int animCycle = 54;
        double tickAnim = (entity.ticksExisted + entity.getTickOffset()) - (int) (Math.floor((double) (entity.ticksExisted + entity.getTickOffset()) / (double) animCycle) * (double) animCycle) + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;

        if (tickAnim >= 0 && tickAnim < 14) {
            xx = 10D + (((tickAnim - 0D) / 14D) * (10D-(10D)));
            yy = 0D + (((tickAnim - 0D) / 14D) * (0D-(0D)));
            zz = 0D + (((tickAnim - 0D) / 14D) * (0D-(0D)));
        }
        else if (tickAnim >= 14 && tickAnim < 26) {
            xx = 10D + (((tickAnim - 14D) / 12D) * (7D-(10D)));
            yy = 0D + (((tickAnim - 14D) / 12D) * (0D-(0D)));
            zz = 0D + (((tickAnim - 14D) / 12D) * (0D-(0D)));
        }
        else if (tickAnim >= 26 && tickAnim < 35) {
            xx = 7D + (((tickAnim - 26D) / 9D) * (11.29D-(7D)));
            yy = 0D + (((tickAnim - 26D) / 9D) * (0D-(0D)));
            zz = 0D + (((tickAnim - 26D) / 9D) * (Math.sin((Math.PI/180)*(((double)tickAnim/54D)*150/0.75-20))*5D-(0D)));
        }
        else if (tickAnim >= 35 && tickAnim < 40) {
            xx = 11.29D + (((tickAnim - 35D) / 5D) * (9.95348D-(11.29D)));
            yy = 0D + (((tickAnim - 35D) / 5D) * (0D-(0D)));
            zz = (Math.sin((Math.PI/180)*(((double)tickAnim/54D)*150/0.75-20))*5) + (((tickAnim - 35D) / 5D) * (1.26399D-(Math.sin((Math.PI/180)*(((double)tickAnim/54D)*150/0.75-20))*5D)));
        }
        else if (tickAnim >= 40 && tickAnim < 54) {
            xx = 9.95348D + (((tickAnim - 40D) / 14D) * (10D-(9.95348D)));
            yy = 0D + (((tickAnim - 40D) / 14D) * (0D-(0D)));
            zz = 1.26399D + (((tickAnim - 40D) / 14D) * (0D-(1.26399D)));
        }
        this.setRotateAngle(base, base.rotateAngleX + (float) Math.toRadians(xx), base.rotateAngleY + (float) Math.toRadians(yy), base.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 14) {
            xx = 0D + (((tickAnim - 0D) / 14D) * (0D-(0D)));
            yy = 0D + (((tickAnim - 0D) / 14D) * (0D-(0D)));
            zz = -1.9D + (((tickAnim - 0D) / 14D) * (-1.9D-(-1.9D)));
        }
        else if (tickAnim >= 14 && tickAnim < 26) {
            xx = 0D + (((tickAnim - 14D) / 12D) * (0D-(0D)));
            yy = 0D + (((tickAnim - 14D) / 12D) * (0D-(0D)));
            zz = -1.9D + (((tickAnim - 14D) / 12D) * (-2.2D-(-1.9D)));
        }
        else if (tickAnim >= 26 && tickAnim < 35) {
            xx = 0D + (((tickAnim - 26D) / 9D) * (0D-(0D)));
            yy = 0D + (((tickAnim - 26D) / 9D) * (0D-(0D)));
            zz = -2.2D + (((tickAnim - 26D) / 9D) * (-1.9D-(-2.2D)));
        }
        else if (tickAnim >= 35 && tickAnim < 40) {
            xx = 0D + (((tickAnim - 35D) / 5D) * (0D-(0D)));
            yy = 0D + (((tickAnim - 35D) / 5D) * (0D-(0D)));
            zz = -1.9D + (((tickAnim - 35D) / 5D) * (-1.9D-(-1.9D)));
        }
        else if (tickAnim >= 40 && tickAnim < 54) {
            xx = 0D + (((tickAnim - 40D) / 14D) * (0D-(0D)));
            yy = 0D + (((tickAnim - 40D) / 14D) * (0D-(0D)));
            zz = -1.9D + (((tickAnim - 40D) / 14D) * (-1.9D-(-1.9D)));
        }
        this.base.offsetX = (float) Math.toRadians(xx);
        this.base.offsetY = (float) Math.toRadians(yy);
        this.base.offsetZ = (float) Math.toRadians(zz);




        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 15D + (((tickAnim - 0D) / 3D) * (15D-(15D)));
            yy = 0D + (((tickAnim - 0D) / 3D) * (0D-(0D)));
            zz = 0D + (((tickAnim - 0D) / 3D) * (0D-(0D)));
        }
        else if (tickAnim >= 3 && tickAnim < 11) {
            xx = 15D + (((tickAnim - 3D) / 8D) * (2.56D-(15D)));
            yy = 0D + (((tickAnim - 3D) / 8D) * (0D-(0D)));
            zz = 0D + (((tickAnim - 3D) / 8D) * (0D-(0D)));
        }
        else if (tickAnim >= 11 && tickAnim < 20) {
            xx = 2.56D + (((tickAnim - 11D) / 9D) * (-4.83D-(2.56D)));
            yy = 0D + (((tickAnim - 11D) / 9D) * (0D-(0D)));
            zz = 0D + (((tickAnim - 11D) / 9D) * (0D-(0D)));
        }
        else if (tickAnim >= 20 && tickAnim < 31) {
            xx = -4.83D + (((tickAnim - 20D) / 11D) * (14D-(-4.83D)));
            yy = 0D + (((tickAnim - 20D) / 11D) * (0D-(0D)));
            zz = 0D + (((tickAnim - 20D) / 11D) * (0D-(0D)));
        }
        else if (tickAnim >= 31 && tickAnim < 46) {
            xx = 14D + (((tickAnim - 31D) / 15D) * (15D-(14D)));
            yy = 0D + (((tickAnim - 31D) / 15D) * (0D-(0D)));
            zz = 0D + (((tickAnim - 31D) / 15D) * (0D-(0D)));
        } else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(hood, hood.rotateAngleX + (float) Math.toRadians(xx), hood.rotateAngleY + (float) Math.toRadians(yy), hood.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 31) {
            xx = 0D + (((tickAnim - 0D) / 31D) * (0D-(0D)));
            yy = 0D + (((tickAnim - 0D) / 31D) * (0D-(0D)));
            zz = 1.6D + (((tickAnim - 0D) / 31D) * (1.6D-(1.6D)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.body.offsetX = (float) Math.toRadians(xx);
        this.body.offsetY = (float) Math.toRadians(yy);
        this.body.offsetZ = (float) Math.toRadians(zz);




        if (tickAnim >= 0 && tickAnim < 31) {
            xx = 0.5D + (((tickAnim - 0D) / 31D) * (0.5D-(0.5D)));
            yy = 0D + (((tickAnim - 0D) / 31D) * (0D-(0D)));
            zz = 0D + (((tickAnim - 0D) / 31D) * (0D-(0D)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.tentacle1.offsetX = (float) Math.toRadians(xx);
        this.tentacle1.offsetY = (float) Math.toRadians(yy);
        this.tentacle1.offsetZ = (float) Math.toRadians(zz);




        if (tickAnim >= 0 && tickAnim < 31) {
            xx = -0.5D + (((tickAnim - 0D) / 31D) * (-0.5D-(-0.5D)));
            yy = 0D + (((tickAnim - 0D) / 31D) * (0D-(0D)));
            zz = 0D + (((tickAnim - 0D) / 31D) * (0D-(0D)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.tentacle3.offsetX = (float) Math.toRadians(xx);
        this.tentacle3.offsetY = (float) Math.toRadians(yy);
        this.tentacle3.offsetZ = (float) Math.toRadians(zz);




        if (tickAnim >= 0 && tickAnim < 31) {
            xx = 0D + (((tickAnim - 0D) / 31D) * (0D-(0D)));
            yy = 0D + (((tickAnim - 0D) / 31D) * (0D-(0D)));
            zz = 0.6D + (((tickAnim - 0D) / 31D) * (0.6D-(0.6D)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.tentacle2.offsetX = (float) Math.toRadians(xx);
        this.tentacle2.offsetY = (float) Math.toRadians(yy);
        this.tentacle2.offsetZ = (float) Math.toRadians(zz);




        if (tickAnim >= 0 && tickAnim < 31) {
            xx = 0D + (((tickAnim - 0D) / 31D) * (0D-(0D)));
            yy = 0D + (((tickAnim - 0D) / 31D) * (0D-(0D)));
            zz = 0.8D + (((tickAnim - 0D) / 31D) * (0.8D-(0.8D)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.tentacle4.offsetX = (float) Math.toRadians(xx);
        this.tentacle4.offsetY = (float) Math.toRadians(yy);
        this.tentacle4.offsetZ = (float) Math.toRadians(zz);




        if (tickAnim >= 0 && tickAnim < 11) {
            xx = 115.95161D + (((tickAnim - 0D) / 11D) * (80.65231D-(115.95161D)));
            yy = 6.9548D + (((tickAnim - 0D) / 11D) * (44.1881D-(6.9548D)));
            zz = 0.79634D + (((tickAnim - 0D) / 11D) * (-31.9154D-(0.79634D)));
        }
        else if (tickAnim >= 11 && tickAnim < 17) {
            xx = 80.65231D + (((tickAnim - 11D) / 6D) * (58.13667D-(80.65231D)));
            yy = 44.1881D + (((tickAnim - 11D) / 6D) * (45.8039D-(44.1881D)));
            zz = -31.9154D + (((tickAnim - 11D) / 6D) * (-37.8415D-(-31.9154D)));
        }
        else if (tickAnim >= 17 && tickAnim < 23) {
            xx = 58.13667D + (((tickAnim - 17D) / 6D) * (79.92263D-(58.13667D)));
            yy = 45.8039D + (((tickAnim - 17D) / 6D) * (34.30278D-(45.8039D)));
            zz = -37.8415D + (((tickAnim - 17D) / 6D) * (-16.89681D-(-37.8415D)));
        }
        else if (tickAnim >= 23 && tickAnim < 30) {
            xx = 79.92263D + (((tickAnim - 23D) / 7D) * (100.00716D-(79.92263D)));
            yy = 34.30278D + (((tickAnim - 23D) / 7D) * (29.075D-(34.30278D)));
            zz = -16.89681D + (((tickAnim - 23D) / 7D) * (-7.3765D-(-16.89681D)));
        }
        else if (tickAnim >= 30 && tickAnim < 54) {
            xx = 100.00716D + (((tickAnim - 30D) / 24D) * (115.95161D-(100.00716D)));
            yy = 29.075D + (((tickAnim - 30D) / 24D) * (6.9548D-(29.075D)));
            zz = -7.3765D + (((tickAnim - 30D) / 24D) * (0.79634D-(-7.3765D)));
        }
        this.setRotateAngle(hornleft, hornleft.rotateAngleX + (float) Math.toRadians(xx), hornleft.rotateAngleY + (float) Math.toRadians(yy), hornleft.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 11) {
            xx = 115.95161D + (((tickAnim - 0D) / 11D) * (80.65231D-(115.95161D)));
            yy = -6.95478D + (((tickAnim - 0D) / 11D) * (-44.18809D-(-6.95478D)));
            zz = 0.79634D + (((tickAnim - 0D) / 11D) * (31.91544D-(0.79634D)));
        }
        else if (tickAnim >= 11 && tickAnim < 17) {
            xx = 80.65231D + (((tickAnim - 11D) / 6D) * (58.13667D-(80.65231D)));
            yy = -44.18809D + (((tickAnim - 11D) / 6D) * (-45.80393D-(-44.18809D)));
            zz = 31.91544D + (((tickAnim - 11D) / 6D) * (37.84145D-(31.91544D)));
        }
        else if (tickAnim >= 17 && tickAnim < 23) {
            xx = 58.13667D + (((tickAnim - 17D) / 6D) * (79.92263D-(58.13667D)));
            yy = -45.80393D + (((tickAnim - 17D) / 6D) * (-34.3028D-(-45.80393D)));
            zz = 37.84145D + (((tickAnim - 17D) / 6D) * (16.8968D-(37.84145D)));
        }
        else if (tickAnim >= 23 && tickAnim < 30) {
            xx = 79.92263D + (((tickAnim - 23D) / 7D) * (100.00716D-(79.92263D)));
            yy = -34.3028D + (((tickAnim - 23D) / 7D) * (-29.07499D-(-34.3028D)));
            zz = 16.8968D + (((tickAnim - 23D) / 7D) * (7.37649D-(16.8968D)));
        }
        else if (tickAnim >= 30 && tickAnim < 54) {
            xx = 100.00716D + (((tickAnim - 30D) / 24D) * (115.95161D-(100.00716D)));
            yy = -29.07499D + (((tickAnim - 30D) / 24D) * (-6.95478D-(-29.07499D)));
            zz = 7.37649D + (((tickAnim - 30D) / 24D) * (0.79634D-(7.37649D)));
        }
        this.setRotateAngle(hornright, hornright.rotateAngleX + (float) Math.toRadians(xx), hornright.rotateAngleY + (float) Math.toRadians(yy), hornright.rotateAngleZ + (float) Math.toRadians(zz));
    }
}




