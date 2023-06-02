package net.lepidodendron.entity.model.entity;

import net.ilexiconn.llibrary.client.model.tools.AdvancedModelBase;
import net.ilexiconn.llibrary.client.model.tools.AdvancedModelRenderer;
import net.lepidodendron.entity.EntityPrehistoricFloraRhenocystis;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;

public class ModelRhenocystis extends AdvancedModelBase {
    private final AdvancedModelRenderer body;
    private final AdvancedModelRenderer antennaL;
    private final AdvancedModelRenderer antennaR;
    private final AdvancedModelRenderer body2;
    private final AdvancedModelRenderer body3;
    private final AdvancedModelRenderer body4;
    private final AdvancedModelRenderer body5;
    private final AdvancedModelRenderer body6;

    public ModelRhenocystis() {
        this.textureWidth = 32;
        this.textureHeight = 32;

        this.body = new AdvancedModelRenderer(this);
        this.body.setRotationPoint(0.0F, 24.0F, 0.0F);
        this.setRotateAngle(body, 0.0F, 3.1416F, 0.0F);
        this.body.cubeList.add(new ModelBox(body, 0, 0, -2.5F, -2.0F, -7.0F, 5, 2, 8, 0.0F, false));
        this.body.cubeList.add(new ModelBox(body, 0, 17, -2.5F, -1.5F, -7.01F, 5, 1, 0, 0.0F, false));

        this.antennaL = new AdvancedModelRenderer(this);
        this.antennaL.setRotationPoint(2.4F, -1.0F, -7.0F);
        this.body.addChild(antennaL);
        this.setRotateAngle(antennaL, 0.0F, 0.2618F, 0.0F);
        this.antennaL.cubeList.add(new ModelBox(antennaL, 0, 3, 0.0F, -0.5F, -4.0F, 0, 1, 4, 0.0F, false));

        this.antennaR = new AdvancedModelRenderer(this);
        this.antennaR.setRotationPoint(-2.4F, -1.0F, -7.0F);
        this.body.addChild(antennaR);
        this.setRotateAngle(antennaR, 0.0F, -0.2618F, 0.0F);
        this.antennaR.cubeList.add(new ModelBox(antennaR, 0, 2, 0.0F, -0.5F, -4.0F, 0, 1, 4, 0.0F, false));

        this.body2 = new AdvancedModelRenderer(this);
        this.body2.setRotationPoint(0.0F, -1.25F, 1.0F);
        this.body.addChild(body2);
        this.body2.cubeList.add(new ModelBox(body2, 6, 10, -1.0F, -0.5F, 0.0F, 2, 1, 3, 0.0F, false));
        this.body2.cubeList.add(new ModelBox(body2, 17, 10, 0.5F, -1.0F, 0.0F, 0, 1, 3, 0.0F, false));
        this.body2.cubeList.add(new ModelBox(body2, 17, 10, -0.5F, -1.0F, 0.0F, 0, 1, 3, 0.0F, false));
        this.body2.cubeList.add(new ModelBox(body2, 8, 12, -1.0F, -0.5F, -1.0F, 2, 1, 1, 0.0F, false));

        this.body3 = new AdvancedModelRenderer(this);
        this.body3.setRotationPoint(0.0F, 0.0F, 3.0F);
        this.body2.addChild(body3);
        this.body3.cubeList.add(new ModelBox(body3, 0, 10, -0.5F, -0.49F, 0.0F, 1, 1, 4, 0.0F, false));

        this.body4 = new AdvancedModelRenderer(this);
        this.body4.setRotationPoint(0.0F, 0.0F, 4.0F);
        this.body3.addChild(body4);
        this.body4.cubeList.add(new ModelBox(body4, 3, 3, -0.5F, 0.0F, 0.0F, 1, 0, 3, 0.0F, false));

        this.body5 = new AdvancedModelRenderer(this);
        this.body5.setRotationPoint(0.0F, 0.0F, 3.0F);
        this.body4.addChild(body5);
        this.body5.cubeList.add(new ModelBox(body5, 3, 0, -0.5F, 0.0F, 0.0F, 1, 0, 3, 0.0F, false));

        this.body6 = new AdvancedModelRenderer(this);
        this.body6.setRotationPoint(0.0F, 0.0F, 3.0F);
        this.body5.addChild(body6);
        this.body6.cubeList.add(new ModelBox(body6, 2, 0, -0.5F, 0.0F, 0.0F, 1, 0, 4, 0.0F, false));

        updateDefaultPose();
    }

    @Override
    public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        this.body.render(f5);
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
        EntityPrehistoricFloraRhenocystis ee = (EntityPrehistoricFloraRhenocystis) entitylivingbaseIn;

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
        EntityPrehistoricFloraRhenocystis entity = (EntityPrehistoricFloraRhenocystis) entitylivingbaseIn;
        int animCycle = 40;
        double tickAnim = (entity.ticksExisted + entity.getTickOffset()) - (int) (Math.floor((double) (entity.ticksExisted + entity.getTickOffset()) / (double) animCycle) * (double) animCycle) + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;

        if (tickAnim >= 0 && tickAnim < 5) {
            xx = 0D + (((tickAnim - 0D) / 5D) * (0D-(0D)));
            yy = 0D + (((tickAnim - 0D) / 5D) * (0D-(0D)));
            zz = 0D + (((tickAnim - 0D) / 5D) * (0D-(0D)));
        }
        else if (tickAnim >= 5 && tickAnim < 20) {
            xx = 0D + (((tickAnim - 5D) / 15D) * (5D-(0D)));
            yy = 0D + (((tickAnim - 5D) / 15D) * (0D-(0D)));
            zz = 0D + (((tickAnim - 5D) / 15D) * (-2D-(0D)));
        }
        else if (tickAnim >= 20 && tickAnim < 25) {
            xx = 5D + (((tickAnim - 20D) / 5D) * (0D-(5D)));
            yy = 0D + (((tickAnim - 20D) / 5D) * (0D-(0D)));
            zz = -2D + (((tickAnim - 20D) / 5D) * (0D-(-2D)));
        }
        else if (tickAnim >= 25 && tickAnim < 34) {
            xx = 0D + (((tickAnim - 25D) / 9D) * (2.5D-(0D)));
            yy = 0D + (((tickAnim - 25D) / 9D) * (0D-(0D)));
            zz = 0D + (((tickAnim - 25D) / 9D) * (2.5D-(0D)));
        }
        else if (tickAnim >= 34 && tickAnim < 40) {
            xx = 2.5D + (((tickAnim - 34D) / 6D) * (0D-(2.5D)));
            yy = 0D + (((tickAnim - 34D) / 6D) * (0D-(0D)));
            zz = 2.5D + (((tickAnim - 34D) / 6D) * (0D-(2.5D)));
        }
        this.setRotateAngle(body, body.rotateAngleX + (float) Math.toRadians(xx), body.rotateAngleY + (float) Math.toRadians(yy), body.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 5) {
            xx = 0D + (((tickAnim - 0D) / 5D) * (0D-(0D)));
            yy = 0D + (((tickAnim - 0D) / 5D) * (0D-(0D)));
            zz = 0D + (((tickAnim - 0D) / 5D) * (0D-(0D)));
        }
        else if (tickAnim >= 5 && tickAnim < 20) {
            xx = 0D + (((tickAnim - 5D) / 15D) * (-0.1D-(0D)));
            yy = 0D + (((tickAnim - 5D) / 15D) * (0.77D-(0D)));
            zz = 0D + (((tickAnim - 5D) / 15D) * (0D-(0D)));
        }
        else if (tickAnim >= 20 && tickAnim < 25) {
            xx = -0.1D + (((tickAnim - 20D) / 5D) * (0D-(-0.1D)));
            yy = 0.77D + (((tickAnim - 20D) / 5D) * (0D-(0.77D)));
            zz = 0D + (((tickAnim - 20D) / 5D) * (0D-(0D)));
        }
        else if (tickAnim >= 25 && tickAnim < 34) {
            xx = 0D + (((tickAnim - 25D) / 9D) * (0D-(0D)));
            yy = 0D + (((tickAnim - 25D) / 9D) * (0.4D-(0D)));
            zz = 0D + (((tickAnim - 25D) / 9D) * (0D-(0D)));
        }
        else if (tickAnim >= 34 && tickAnim < 40) {
            xx = 0D + (((tickAnim - 34D) / 6D) * (0D-(0D)));
            yy = 0.4D + (((tickAnim - 34D) / 6D) * (0D-(0.4D)));
            zz = 0D + (((tickAnim - 34D) / 6D) * (0D-(0D)));
        }
        this.body.offsetX = (float) Math.toRadians(xx);
        this.body.offsetY = (float) Math.toRadians(yy);
        this.body.offsetZ = (float) Math.toRadians(zz);




        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0D + (((tickAnim - 0D) / 10D) * (-17.75D-(0D)));
            yy = 0D + (((tickAnim - 0D) / 10D) * (0D-(0D)));
            zz = 0D + (((tickAnim - 0D) / 10D) * (0D-(0D)));
        }
        else if (tickAnim >= 10 && tickAnim < 20) {
            xx = -17.75D + (((tickAnim - 10D) / 10D) * (-8D-(-17.75D)));
            yy = 0D + (((tickAnim - 10D) / 10D) * (0D-(0D)));
            zz = 0D + (((tickAnim - 10D) / 10D) * (0D-(0D)));
        }
        else if (tickAnim >= 20 && tickAnim < 30) {
            xx = -8D + (((tickAnim - 20D) / 10D) * (32.25D-(-8D)));
            yy = 0D + (((tickAnim - 20D) / 10D) * (0D-(0D)));
            zz = 0D + (((tickAnim - 20D) / 10D) * (0D-(0D)));
        }
        else if (tickAnim >= 30 && tickAnim < 35) {
            xx = 32.25D + (((tickAnim - 30D) / 5D) * (44.88D-(32.25D)));
            yy = 0D + (((tickAnim - 30D) / 5D) * (0D-(0D)));
            zz = 0D + (((tickAnim - 30D) / 5D) * (0D-(0D)));
        }
        else if (tickAnim >= 35 && tickAnim < 40) {
            xx = 44.88D + (((tickAnim - 35D) / 5D) * (0D-(44.88D)));
            yy = 0D + (((tickAnim - 35D) / 5D) * (0D-(0D)));
            zz = 0D + (((tickAnim - 35D) / 5D) * (0D-(0D)));
        }
        this.setRotateAngle(body2, body2.rotateAngleX + (float) Math.toRadians(xx), body2.rotateAngleY + (float) Math.toRadians(yy), body2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 5) {
            xx = 77.5D + (((tickAnim - 0D) / 5D) * (47.88D-(77.5D)));
            yy = 0D + (((tickAnim - 0D) / 5D) * (0D-(0D)));
            zz = 0D + (((tickAnim - 0D) / 5D) * (0D-(0D)));
        }
        else if (tickAnim >= 5 && tickAnim < 20) {
            xx = 47.88D + (((tickAnim - 5D) / 15D) * (-55D-(47.88D)));
            yy = 0D + (((tickAnim - 5D) / 15D) * (0D-(0D)));
            zz = 0D + (((tickAnim - 5D) / 15D) * (0D-(0D)));
        }
        else if (tickAnim >= 20 && tickAnim < 30) {
            xx = -55D + (((tickAnim - 20D) / 10D) * (-32.5D-(-55D)));
            yy = 0D + (((tickAnim - 20D) / 10D) * (0D-(0D)));
            zz = 0D + (((tickAnim - 20D) / 10D) * (0D-(0D)));
        }
        else if (tickAnim >= 30 && tickAnim < 40) {
            xx = -32.5D + (((tickAnim - 30D) / 10D) * (77.5D-(-32.5D)));
            yy = 0D + (((tickAnim - 30D) / 10D) * (0D-(0D)));
            zz = 0D + (((tickAnim - 30D) / 10D) * (0D-(0D)));
        }
        this.setRotateAngle(body3, body3.rotateAngleX + (float) Math.toRadians(xx), body3.rotateAngleY + (float) Math.toRadians(yy), body3.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 5) {
            xx = -47.5D + (((tickAnim - 0D) / 5D) * (-17.5D-(-47.5D)));
            yy = 0D + (((tickAnim - 0D) / 5D) * (0D-(0D)));
            zz = 0D + (((tickAnim - 0D) / 5D) * (0D-(0D)));
        }
        else if (tickAnim >= 5 && tickAnim < 20) {
            xx = -17.5D + (((tickAnim - 5D) / 15D) * (-45D-(-17.5D)));
            yy = 0D + (((tickAnim - 5D) / 15D) * (0D-(0D)));
            zz = 0D + (((tickAnim - 5D) / 15D) * (0D-(0D)));
        }
        else if (tickAnim >= 20 && tickAnim < 30) {
            xx = -45D + (((tickAnim - 20D) / 10D) * (-55.41D-(-45D)));
            yy = 0D + (((tickAnim - 20D) / 10D) * (0D-(0D)));
            zz = 0D + (((tickAnim - 20D) / 10D) * (0D-(0D)));
        }
        else if (tickAnim >= 30 && tickAnim < 35) {
            xx = -55.41D + (((tickAnim - 30D) / 5D) * (-63.12D-(-55.41D)));
            yy = 0D + (((tickAnim - 30D) / 5D) * (0D-(0D)));
            zz = 0D + (((tickAnim - 30D) / 5D) * (0D-(0D)));
        }
        else if (tickAnim >= 35 && tickAnim < 40) {
            xx = -63.12D + (((tickAnim - 35D) / 5D) * (-47.5D-(-63.12D)));
            yy = 0D + (((tickAnim - 35D) / 5D) * (0D-(0D)));
            zz = 0D + (((tickAnim - 35D) / 5D) * (0D-(0D)));
        }
        this.setRotateAngle(body4, body4.rotateAngleX + (float) Math.toRadians(xx), body4.rotateAngleY + (float) Math.toRadians(yy), body4.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 5) {
            xx = -50D + (((tickAnim - 0D) / 5D) * (-72.5D-(-50D)));
            yy = 0D + (((tickAnim - 0D) / 5D) * (0D-(0D)));
            zz = 0D + (((tickAnim - 0D) / 5D) * (0D-(0D)));
        }
        else if (tickAnim >= 5 && tickAnim < 20) {
            xx = -72.5D + (((tickAnim - 5D) / 15D) * (-60D-(-72.5D)));
            yy = 0D + (((tickAnim - 5D) / 15D) * (0D-(0D)));
            zz = 0D + (((tickAnim - 5D) / 15D) * (0D-(0D)));
        }
        else if (tickAnim >= 20 && tickAnim < 30) {
            xx = -60D + (((tickAnim - 20D) / 10D) * (-15D-(-60D)));
            yy = 0D + (((tickAnim - 20D) / 10D) * (0D-(0D)));
            zz = 0D + (((tickAnim - 20D) / 10D) * (0D-(0D)));
        }
        else if (tickAnim >= 30 && tickAnim < 40) {
            xx = -15D + (((tickAnim - 30D) / 10D) * (-50D-(-15D)));
            yy = 0D + (((tickAnim - 30D) / 10D) * (0D-(0D)));
            zz = 0D + (((tickAnim - 30D) / 10D) * (0D-(0D)));
        }
        this.setRotateAngle(body6, body6.rotateAngleX + (float) Math.toRadians(xx), body6.rotateAngleY + (float) Math.toRadians(yy), body6.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 5) {
            xx = -55D + (((tickAnim - 0D) / 5D) * (-35D-(-55D)));
            yy = 0D + (((tickAnim - 0D) / 5D) * (0D-(0D)));
            zz = 0D + (((tickAnim - 0D) / 5D) * (0D-(0D)));
        }
        else if (tickAnim >= 5 && tickAnim < 30) {
            xx = -35D + (((tickAnim - 5D) / 25D) * (-35.71D-(-35D)));
            yy = 0D + (((tickAnim - 5D) / 25D) * (0D-(0D)));
            zz = 0D + (((tickAnim - 5D) / 25D) * (0D-(0D)));
        }
        else if (tickAnim >= 30 && tickAnim < 40) {
            xx = -35.71D + (((tickAnim - 30D) / 10D) * (-55D-(-35.71D)));
            yy = 0D + (((tickAnim - 30D) / 10D) * (0D-(0D)));
            zz = 0D + (((tickAnim - 30D) / 10D) * (0D-(0D)));
        }
        this.setRotateAngle(body5, body5.rotateAngleX + (float) Math.toRadians(xx), body5.rotateAngleY + (float) Math.toRadians(yy), body5.rotateAngleZ + (float) Math.toRadians(zz));


    }
}




