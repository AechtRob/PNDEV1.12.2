package net.lepidodendron.entity.model.entity;

import net.ilexiconn.llibrary.client.model.tools.AdvancedModelRenderer;
import net.lepidodendron.entity.EntityPrehistoricFloraCothurnocystis;
import net.lepidodendron.entity.model.ModelBasePalaeopedia;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;

public class ModelCothurnocystis extends ModelBasePalaeopedia {
    private final AdvancedModelRenderer main;
    private final AdvancedModelRenderer cube_r1;
    private final AdvancedModelRenderer front;
    private final AdvancedModelRenderer arm1;
    private final AdvancedModelRenderer arm2;
    private final AdvancedModelRenderer arm3;
    private final AdvancedModelRenderer armlong;
    private final AdvancedModelRenderer armmedium;
    private final AdvancedModelRenderer armshort;

    public ModelCothurnocystis() {
        this.textureWidth = 32;
        this.textureHeight = 32;

        this.main = new AdvancedModelRenderer(this);
        this.main.setRotationPoint(0.0F, 24.0F, 3.0F);
        this.setRotateAngle(main, 0.0F, -0.0873F, 0.0F);
        this.main.cubeList.add(new ModelBox(main, 0, 0, 2.0F, -1.0F, -6.0F, 4, 1, 10, 0.0F, false));
        this.main.cubeList.add(new ModelBox(main, 0, 16, -5.0F, -1.0F, -6.0F, 7, 1, 4, 0.0F, false));
        this.main.cubeList.add(new ModelBox(main, 0, 5, -6.0F, -1.0F, -4.0F, 1, 1, 2, 0.0F, false));
        this.main.cubeList.add(new ModelBox(main, 0, 8, -6.0F, -1.0F, -6.0F, 1, 1, 1, 0.0F, false));
        this.main.cubeList.add(new ModelBox(main, 6, 6, -3.0F, -1.0F, -7.0F, 1, 1, 1, 0.0F, false));

        this.cube_r1 = new AdvancedModelRenderer(this);
        this.cube_r1.setRotationPoint(5.5F, 0.0F, -6.0F);
        this.main.addChild(cube_r1);
        this.setRotateAngle(cube_r1, 0.0F, 0.7854F, 0.0F);
        this.cube_r1.cubeList.add(new ModelBox(cube_r1, 0, 2, -0.65F, -0.95F, -0.7F, 1, 1, 2, 0.0F, false));

        this.front = new AdvancedModelRenderer(this);
        this.front.setRotationPoint(0.5F, -0.5F, -6.0F);
        this.main.addChild(front);
        this.setRotateAngle(front, 0.0F, 0.0873F, 0.0F);
        this.front.cubeList.add(new ModelBox(front, 18, 5, -1.5F, -0.475F, -3.0F, 3, 1, 3, 0.0F, false));

        this.arm1 = new AdvancedModelRenderer(this);
        this.arm1.setRotationPoint(0.0F, 0.0F, -3.0F);
        this.front.addChild(arm1);
        this.arm1.cubeList.add(new ModelBox(arm1, 3, 3, -0.5F, 0.0F, -3.0F, 1, 0, 3, 0.0F, false));

        this.arm2 = new AdvancedModelRenderer(this);
        this.arm2.setRotationPoint(0.0F, 0.0F, -3.0F);
        this.arm1.addChild(arm2);
        this.arm2.cubeList.add(new ModelBox(arm2, 3, 0, -0.5F, 0.01F, -3.0F, 1, 0, 3, 0.0F, false));

        this.arm3 = new AdvancedModelRenderer(this);
        this.arm3.setRotationPoint(0.0F, 0.0F, -3.0F);
        this.arm2.addChild(arm3);
        this.arm3.cubeList.add(new ModelBox(arm3, 0, 0, -0.5F, 0.02F, -4.0F, 1, 0, 4, 0.0F, false));

        this.armlong = new AdvancedModelRenderer(this);
        this.armlong.setRotationPoint(2.5F, 0.0F, 4.0F);
        this.main.addChild(armlong);
        this.armlong.cubeList.add(new ModelBox(armlong, 0, 11, -7.5F, -0.5F, 0.0F, 8, 0, 5, 0.0F, false));

        this.armmedium = new AdvancedModelRenderer(this);
        this.armmedium.setRotationPoint(-6.0F, 0.0F, -2.0F);
        this.main.addChild(armmedium);
        this.armmedium.cubeList.add(new ModelBox(armmedium, 13, 0, -4.0F, -0.5F, 0.0F, 4, 0, 5, 0.0F, false));

        this.armshort = new AdvancedModelRenderer(this);
        this.armshort.setRotationPoint(5.5F, 0.0F, 4.0F);
        this.main.addChild(armshort);
        this.armshort.cubeList.add(new ModelBox(armshort, 0, 0, -0.5F, -0.5F, 0.0F, 1, 0, 2, 0.0F, false));

        updateDefaultPose();
    }

    @Override
    public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        this.main.render(f5);
    }

    public void renderStatic(float f) {
        //Static renderer for taxidermy
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
        //this.resetToDefaultPose();

    }

    @Override
    public void setLivingAnimations(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime) {
        super.setLivingAnimations(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime);
        this.resetToDefaultPose();
        EntityPrehistoricFloraCothurnocystis ee = (EntityPrehistoricFloraCothurnocystis) entitylivingbaseIn;

        if (ee.isReallyInWater()) {//swimming
            //if (ee.getIsMoving()) {
                animWalking(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime);
            //}
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

    }

    public void animWalking(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime) {
        EntityPrehistoricFloraCothurnocystis entity = (EntityPrehistoricFloraCothurnocystis) entitylivingbaseIn;
        int animCycle = 120;
        double tickAnim = (entity.ticksExisted + entity.getTickOffset()) - (int) (Math.floor((double) (entity.ticksExisted + entity.getTickOffset()) / (double) animCycle) * (double) animCycle) + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;

        if (tickAnim >= 0 && tickAnim < 18) {
            xx = 0D + (((tickAnim - 0D) / 18D) * (0D-(0D)));
            yy = 17.5D + (((tickAnim - 0D) / 18D) * (17.5D-(17.5D)));
            zz = 0D + (((tickAnim - 0D) / 18D) * (0D-(0D)));
        }
        else if (tickAnim >= 18 && tickAnim < 40) {
            xx = 0D + (((tickAnim - 18D) / 22D) * (0D-(0D)));
            yy = 17.5D + (((tickAnim - 18D) / 22D) * (-5D-(17.5D)));
            zz = 0D + (((tickAnim - 18D) / 22D) * (0D-(0D)));
        }
        else if (tickAnim >= 40 && tickAnim < 80) {
            xx = 0D + (((tickAnim - 40D) / 40D) * (0D-(0D)));
            yy = -5D + (((tickAnim - 40D) / 40D) * (-5D-(-5D)));
            zz = 0D + (((tickAnim - 40D) / 40D) * (0D-(0D)));
        }
        else if (tickAnim >= 80 && tickAnim < 100) {
            xx = 0D + (((tickAnim - 80D) / 20D) * (0D-(0D)));
            yy = -5D + (((tickAnim - 80D) / 20D) * (17.5D-(-5D)));
            zz = 0D + (((tickAnim - 80D) / 20D) * (0D-(0D)));
        }
        else if (tickAnim >= 100 && tickAnim < 120) {
            xx = 0D + (((tickAnim - 100D) / 20D) * (0D-(0D)));
            yy = 17.5D + (((tickAnim - 100D) / 20D) * (17.5D-(17.5D)));
            zz = 0D + (((tickAnim - 100D) / 20D) * (0D-(0D)));
        }
        this.setRotateAngle(main, main.rotateAngleX + (float) Math.toRadians(xx), main.rotateAngleY + (float) Math.toRadians(yy), main.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 10) {
            xx = -5.23846D + (((tickAnim - 0D) / 10D) * (-6.65637D-(-5.23846D)));
            yy = -25.71492D + (((tickAnim - 0D) / 10D) * (-21.93732D-(-25.71492D)));
            zz = 0.19015D + (((tickAnim - 0D) / 10D) * (-2.8396D-(0.19015D)));
        }
        else if (tickAnim >= 10 && tickAnim < 17) {
            xx = -6.65637D + (((tickAnim - 10D) / 7D) * (0D-(-6.65637D)));
            yy = -21.93732D + (((tickAnim - 10D) / 7D) * (-22.35933D-(-21.93732D)));
            zz = -2.8396D + (((tickAnim - 10D) / 7D) * (-0.7099D-(-2.8396D)));
        }
        else if (tickAnim >= 17 && tickAnim < 20) {
            xx = 0D + (((tickAnim - 17D) / 3D) * (0D-(0D)));
            yy = -22.35933D + (((tickAnim - 17D) / 3D) * (-22.5D-(-22.35933D)));
            zz = -0.7099D + (((tickAnim - 17D) / 3D) * (0D-(-0.7099D)));
        }
        else if (tickAnim >= 20 && tickAnim < 40) {
            xx = 0D + (((tickAnim - 20D) / 20D) * (0D-(0D)));
            yy = -22.5D + (((tickAnim - 20D) / 20D) * (22.5D-(-22.5D)));
            zz = 0D + (((tickAnim - 20D) / 20D) * (0D-(0D)));
        }
        else if (tickAnim >= 40 && tickAnim < 60) {
            xx = 0D + (((tickAnim - 40D) / 20D) * (-5.23846D-(0D)));
            yy = 22.5D + (((tickAnim - 40D) / 20D) * (25.7149D-(22.5D)));
            zz = 0D + (((tickAnim - 40D) / 20D) * (-0.1901D-(0D)));
        }
        else if (tickAnim >= 60 && tickAnim < 70) {
            xx = -5.23846D + (((tickAnim - 60D) / 10D) * (-6.65637D-(-5.23846D)));
            yy = 25.7149D + (((tickAnim - 60D) / 10D) * (21.9373D-(25.7149D)));
            zz = -0.1901D + (((tickAnim - 60D) / 10D) * (2.8396D-(-0.1901D)));
        }
        else if (tickAnim >= 70 && tickAnim < 77) {
            xx = -6.65637D + (((tickAnim - 70D) / 7D) * (0D-(-6.65637D)));
            yy = 21.9373D + (((tickAnim - 70D) / 7D) * (22.35932D-(21.9373D)));
            zz = 2.8396D + (((tickAnim - 70D) / 7D) * (0.7099D-(2.8396D)));
        }
        else if (tickAnim >= 77 && tickAnim < 80) {
            xx = 0D + (((tickAnim - 77D) / 3D) * (0D-(0D)));
            yy = 22.35932D + (((tickAnim - 77D) / 3D) * (22.5D-(22.35932D)));
            zz = 0.7099D + (((tickAnim - 77D) / 3D) * (0D-(0.7099D)));
        }
        else if (tickAnim >= 80 && tickAnim < 100) {
            xx = 0D + (((tickAnim - 80D) / 20D) * (0D-(0D)));
            yy = 22.5D + (((tickAnim - 80D) / 20D) * (-22.5D-(22.5D)));
            zz = 0D + (((tickAnim - 80D) / 20D) * (0D-(0D)));
        }
        else if (tickAnim >= 100 && tickAnim < 120) {
            xx = 0D + (((tickAnim - 100D) / 20D) * (-5.23846D-(0D)));
            yy = -22.5D + (((tickAnim - 100D) / 20D) * (-25.71492D-(-22.5D)));
            zz = 0D + (((tickAnim - 100D) / 20D) * (0.19015D-(0D)));
        }
        this.setRotateAngle(front, front.rotateAngleX + (float) Math.toRadians(xx), front.rotateAngleY + (float) Math.toRadians(yy), front.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 20) {
            xx = -5D + (((tickAnim - 0D) / 20D) * (3.08D-(-5D)));
            yy = -22.5D + (((tickAnim - 0D) / 20D) * (-7.39D-(-22.5D)));
            zz = 0D + (((tickAnim - 0D) / 20D) * (-1.26D-(0D)));
        }
        else if (tickAnim >= 20 && tickAnim < 40) {
            xx = 3.08D + (((tickAnim - 20D) / 20D) * (2.16733D-(3.08D)));
            yy = -7.39D + (((tickAnim - 20D) / 20D) * (7.71069D-(-7.39D)));
            zz = -1.26D + (((tickAnim - 20D) / 20D) * (-2.51322D-(-1.26D)));
        }
        else if (tickAnim >= 40 && tickAnim < 60) {
            xx = 2.16733D + (((tickAnim - 40D) / 20D) * (-5D-(2.16733D)));
            yy = 7.71069D + (((tickAnim - 40D) / 20D) * (22.5D-(7.71069D)));
            zz = -2.51322D + (((tickAnim - 40D) / 20D) * (0D-(-2.51322D)));
        }
        else if (tickAnim >= 60 && tickAnim < 80) {
            xx = -5D + (((tickAnim - 60D) / 20D) * (3.66D-(-5D)));
            yy = 22.5D + (((tickAnim - 60D) / 20D) * (7.35D-(22.5D)));
            zz = 0D + (((tickAnim - 60D) / 20D) * (2.52D-(0D)));
        }
        else if (tickAnim >= 80 && tickAnim < 100) {
            xx = 3.66D + (((tickAnim - 80D) / 20D) * (-0.67295D-(3.66D)));
            yy = 7.35D + (((tickAnim - 80D) / 20D) * (-7.79783D-(7.35D)));
            zz = 2.52D + (((tickAnim - 80D) / 20D) * (5.03476D-(2.52D)));
        }
        else if (tickAnim >= 100 && tickAnim < 120) {
            xx = -0.67295D + (((tickAnim - 100D) / 20D) * (-5D-(-0.67295D)));
            yy = -7.79783D + (((tickAnim - 100D) / 20D) * (-22.5D-(-7.79783D)));
            zz = 5.03476D + (((tickAnim - 100D) / 20D) * (0D-(5.03476D)));
        }
        this.setRotateAngle(arm1, arm1.rotateAngleX + (float) Math.toRadians(xx), arm1.rotateAngleY + (float) Math.toRadians(yy), arm1.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 20) {
            xx = -10D + (((tickAnim - 0D) / 20D) * (0D-(-10D)));
            yy = -22.5D + (((tickAnim - 0D) / 20D) * (-7.5D-(-22.5D)));
            zz = 0D + (((tickAnim - 0D) / 20D) * (0D-(0D)));
        }
        else if (tickAnim >= 20 && tickAnim < 40) {
            xx = 0D + (((tickAnim - 20D) / 20D) * (0D-(0D)));
            yy = -7.5D + (((tickAnim - 20D) / 20D) * (52.5D-(-7.5D)));
            zz = 0D + (((tickAnim - 20D) / 20D) * (0D-(0D)));
        }
        else if (tickAnim >= 40 && tickAnim < 60) {
            xx = 0D + (((tickAnim - 40D) / 20D) * (-10D-(0D)));
            yy = 52.5D + (((tickAnim - 40D) / 20D) * (22.5D-(52.5D)));
            zz = 0D + (((tickAnim - 40D) / 20D) * (0D-(0D)));
        }
        else if (tickAnim >= 60 && tickAnim < 80) {
            xx = -10D + (((tickAnim - 60D) / 20D) * (0D-(-10D)));
            yy = 22.5D + (((tickAnim - 60D) / 20D) * (7.5D-(22.5D)));
            zz = 0D + (((tickAnim - 60D) / 20D) * (0D-(0D)));
        }
        else if (tickAnim >= 80 && tickAnim < 100) {
            xx = 0D + (((tickAnim - 80D) / 20D) * (0D-(0D)));
            yy = 7.5D + (((tickAnim - 80D) / 20D) * (-52.5D-(7.5D)));
            zz = 0D + (((tickAnim - 80D) / 20D) * (0D-(0D)));
        }
        else if (tickAnim >= 100 && tickAnim < 120) {
            xx = 0D + (((tickAnim - 100D) / 20D) * (-10D-(0D)));
            yy = -52.5D + (((tickAnim - 100D) / 20D) * (-22.5D-(-52.5D)));
            zz = 0D + (((tickAnim - 100D) / 20D) * (0D-(0D)));
        }
        this.setRotateAngle(arm2, arm2.rotateAngleX + (float) Math.toRadians(xx), arm2.rotateAngleY + (float) Math.toRadians(yy), arm2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 20) {
            xx = 7.5D + (((tickAnim - 0D) / 20D) * (0D-(7.5D)));
            yy = 22.5D + (((tickAnim - 0D) / 20D) * (-18.75D-(22.5D)));
            zz = 0D + (((tickAnim - 0D) / 20D) * (0D-(0D)));
        }
        else if (tickAnim >= 20 && tickAnim < 30) {
            xx = 0D + (((tickAnim - 20D) / 10D) * (0D-(0D)));
            yy = -18.75D + (((tickAnim - 20D) / 10D) * (-16.87D-(-18.75D)));
            zz = 0D + (((tickAnim - 20D) / 10D) * (0D-(0D)));
        }
        else if (tickAnim >= 30 && tickAnim < 40) {
            xx = 0D + (((tickAnim - 30D) / 10D) * (0D-(0D)));
            yy = -16.87D + (((tickAnim - 30D) / 10D) * (52.5D-(-16.87D)));
            zz = 0D + (((tickAnim - 30D) / 10D) * (0D-(0D)));
        }
        else if (tickAnim >= 40 && tickAnim < 60) {
            xx = 0D + (((tickAnim - 40D) / 20D) * (7.5D-(0D)));
            yy = 52.5D + (((tickAnim - 40D) / 20D) * (-22.5D-(52.5D)));
            zz = 0D + (((tickAnim - 40D) / 20D) * (0D-(0D)));
        }
        else if (tickAnim >= 60 && tickAnim < 80) {
            xx = 7.5D + (((tickAnim - 60D) / 20D) * (0D-(7.5D)));
            yy = -22.5D + (((tickAnim - 60D) / 20D) * (18.75D-(-22.5D)));
            zz = 0D + (((tickAnim - 60D) / 20D) * (0D-(0D)));
        }
        else if (tickAnim >= 80 && tickAnim < 90) {
            xx = 0D + (((tickAnim - 80D) / 10D) * (0D-(0D)));
            yy = 18.75D + (((tickAnim - 80D) / 10D) * (16.88D-(18.75D)));
            zz = 0D + (((tickAnim - 80D) / 10D) * (0D-(0D)));
        }
        else if (tickAnim >= 90 && tickAnim < 100) {
            xx = 0D + (((tickAnim - 90D) / 10D) * (0D-(0D)));
            yy = 16.88D + (((tickAnim - 90D) / 10D) * (-75D-(16.88D)));
            zz = 0D + (((tickAnim - 90D) / 10D) * (0D-(0D)));
        }
        else if (tickAnim >= 100 && tickAnim < 120) {
            xx = 0D + (((tickAnim - 100D) / 20D) * (7.5D-(0D)));
            yy = -75D + (((tickAnim - 100D) / 20D) * (22.5D-(-75D)));
            zz = 0D + (((tickAnim - 100D) / 20D) * (0D-(0D)));
        }
        this.setRotateAngle(arm3, arm3.rotateAngleX + (float) Math.toRadians(xx), arm3.rotateAngleY + (float) Math.toRadians(yy), arm3.rotateAngleZ + (float) Math.toRadians(zz));
    }
}




