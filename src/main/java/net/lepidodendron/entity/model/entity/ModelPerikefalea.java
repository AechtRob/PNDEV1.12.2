package net.lepidodendron.entity.model.entity;

import net.ilexiconn.llibrary.client.model.tools.AdvancedModelRenderer;
import net.lepidodendron.entity.EntityPrehistoricFloraPerikefalea;
import net.lepidodendron.entity.model.ModelBasePalaeopedia;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;

public class ModelPerikefalea extends ModelBasePalaeopedia {
    private final AdvancedModelRenderer main;
    private final AdvancedModelRenderer cube_r1;
    private final AdvancedModelRenderer cube_r2;
    private final AdvancedModelRenderer rightMarginal;
    private final AdvancedModelRenderer leftMarginal;
    private final AdvancedModelRenderer arm;
    private final AdvancedModelRenderer cube_r3;
    private final AdvancedModelRenderer arm2;
    private final AdvancedModelRenderer cube_r4;
    private final AdvancedModelRenderer arm3;
    private final AdvancedModelRenderer arm4;
    private final AdvancedModelRenderer arm5;

    public ModelPerikefalea() {
        this.textureWidth = 32;
        this.textureHeight = 32;

        this.main = new AdvancedModelRenderer(this);
        this.main.setRotationPoint(0.0F, 24.6F, 0.0F);
        this.setRotateAngle(main, 0.0F, 3.1416F, 0.0F);
        this.main.cubeList.add(new ModelBox(main, 0, 0, -2.5F, -2.0F, -6.0F, 5, 1, 6, 0.0F, false));
        this.main.cubeList.add(new ModelBox(main, 25, 25, -1.0F, -1.7F, -7.0F, 2, 0, 1, 0.0F, false));
        this.main.cubeList.add(new ModelBox(main, 0, 8, -2.5F, -1.3F, -6.0F, 5, 1, 6, -0.01F, false));
        this.main.cubeList.add(new ModelBox(main, 11, 20, -2.0F, -2.0F, -0.025F, 4, 1, 1, 0.0F, false));
        this.main.cubeList.add(new ModelBox(main, 0, 21, -2.0F, -1.3F, -0.025F, 4, 1, 1, -0.01F, false));

        this.cube_r1 = new AdvancedModelRenderer(this);
        this.cube_r1.setRotationPoint(0.0F, -1.2F, -7.85F);
        this.main.addChild(cube_r1);
        this.setRotateAngle(cube_r1, 0.0F, -0.6632F, 0.0F);
        this.cube_r1.cubeList.add(new ModelBox(cube_r1, 23, 12, 0.0F, -0.5F, 0.0008F, 3, 1, 1, 0.0F, false));

        this.cube_r2 = new AdvancedModelRenderer(this);
        this.cube_r2.setRotationPoint(0.0F, -1.2F, -7.85F);
        this.main.addChild(cube_r2);
        this.setRotateAngle(cube_r2, 0.0F, 0.6632F, 0.0F);
        this.cube_r2.cubeList.add(new ModelBox(cube_r2, 11, 16, -3.0F, -0.5F, 0.0008F, 3, 1, 2, -0.01F, false));

        this.rightMarginal = new AdvancedModelRenderer(this);
        this.rightMarginal.setRotationPoint(1.3387F, -1.1F, -6.4668F);
        this.main.addChild(rightMarginal);
        this.setRotateAngle(rightMarginal, 0.0F, -0.0873F, 0.0F);
        this.rightMarginal.cubeList.add(new ModelBox(rightMarginal, 23, 0, 0.0F, 0.0F, -3.0F, 1, 0, 3, 0.0F, false));

        this.leftMarginal = new AdvancedModelRenderer(this);
        this.leftMarginal.setRotationPoint(-1.3387F, -1.1F, -6.4668F);
        this.main.addChild(leftMarginal);
        this.setRotateAngle(leftMarginal, 0.0F, 0.0873F, 0.0F);
        this.leftMarginal.cubeList.add(new ModelBox(leftMarginal, 22, 21, -1.0F, 0.0F, -3.0F, 1, 0, 3, 0.0F, false));

        this.arm = new AdvancedModelRenderer(this);
        this.arm.setRotationPoint(0.0F, -1.2513F, 0.95F);
        this.main.addChild(arm);
        this.setRotateAngle(arm, -0.0262F, 0.0F, 0.0F);
        this.arm.cubeList.add(new ModelBox(arm, 0, 27, -0.5F, -0.5F, 0.975F, 1, 1, 1, 0.01F, false));
        this.arm.cubeList.add(new ModelBox(arm, 0, 24, -1.0F, -0.6F, 0.0F, 2, 1, 1, 0.0F, false));
        this.arm.cubeList.add(new ModelBox(arm, 18, 25, -1.0F, -0.2F, 0.0F, 2, 1, 1, -0.01F, false));

        this.cube_r3 = new AdvancedModelRenderer(this);
        this.cube_r3.setRotationPoint(0.5F, 1.3F, 1.5F);
        this.arm.addChild(cube_r3);
        this.setRotateAngle(cube_r3, 0.0F, -1.5708F, 0.0F);
        this.cube_r3.cubeList.add(new ModelBox(cube_r3, 11, 23, -0.025F, -1.2F, -1.0F, 0, 1, 3, 0.0F, false));

        this.arm2 = new AdvancedModelRenderer(this);
        this.arm2.setRotationPoint(0.0F, 0.0F, 1.975F);
        this.arm.addChild(arm2);
        this.arm2.cubeList.add(new ModelBox(arm2, 22, 16, -0.5F, -0.49F, 0.0F, 1, 1, 3, 0.0F, false));

        this.cube_r4 = new AdvancedModelRenderer(this);
        this.cube_r4.setRotationPoint(0.0F, 1.01F, 1.5F);
        this.arm2.addChild(cube_r4);
        this.setRotateAngle(cube_r4, 0.0F, -1.5708F, 0.0F);
        this.cube_r4.cubeList.add(new ModelBox(cube_r4, 8, 27, -1.0F, -1.2F, -0.5F, 0, 1, 1, 0.0F, false));
        this.cube_r4.cubeList.add(new ModelBox(cube_r4, 5, 27, 1.0F, -1.2F, -0.5F, 0, 1, 1, 0.0F, false));
        this.cube_r4.cubeList.add(new ModelBox(cube_r4, 7, 24, 0.0F, -1.2F, -0.5F, 0, 1, 1, 0.0F, false));

        this.arm3 = new AdvancedModelRenderer(this);
        this.arm3.setRotationPoint(0.0F, -0.0238F, 3.0004F);
        this.arm2.addChild(arm3);
        this.arm3.cubeList.add(new ModelBox(arm3, 23, 8, -0.5F, 0.0F, 0.0F, 1, 0, 3, 0.0F, false));

        this.arm4 = new AdvancedModelRenderer(this);
        this.arm4.setRotationPoint(0.0F, 0.0F, 3.0F);
        this.arm3.addChild(arm4);
        this.arm4.cubeList.add(new ModelBox(arm4, 23, 4, -0.5F, 0.0F, 0.0F, 1, 0, 3, 0.0F, false));

        this.arm5 = new AdvancedModelRenderer(this);
        this.arm5.setRotationPoint(0.0F, 0.0F, 3.0F);
        this.arm4.addChild(arm5);
        this.arm5.cubeList.add(new ModelBox(arm5, 0, 16, -0.5F, 0.0F, 0.0F, 1, 0, 4, 0.0F, false));

        updateDefaultPose();
    }

    @Override
    public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        this.main.render(f5);
    }
        public void renderStaticWall(float f) {
            resetToDefaultPose();
        }

        public void renderStaticFloor(float f) {
            resetToDefaultPose();

        }
    @Override
    public void renderStaticBook(float f) {
        //Rotations, positions and sizing:
        this.main.offsetY = -1.6F;
        this.main.offsetX = 0.2F;
        this.main.offsetZ = 2.0F;
        this.main.rotateAngleY = (float)Math.toRadians(120);
        this.main.rotateAngleX = (float)Math.toRadians(0);
        this.main.rotateAngleZ = (float)Math.toRadians(0);
        this.main.scaleChildren = true;
        float scaler = 4.0F;
        this.main.setScale(scaler, scaler, scaler);
        //Start of pose:

        //End of pose, now render the model:
        this.main.render(f);
        //Reset rotations, positions and sizing:
        this.main.setScale(1.0F, 1.0F, 1.0F);
        this.main.scaleChildren = false;
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
        //this.resetToDefaultPose();

    }

    @Override
    public void setLivingAnimations(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime) {
        super.setLivingAnimations(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime);
        this.resetToDefaultPose();
        EntityPrehistoricFloraPerikefalea ee = (EntityPrehistoricFloraPerikefalea) entitylivingbaseIn;

        if (ee.isInWater()) {//swimming
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
        EntityPrehistoricFloraPerikefalea entity = (EntityPrehistoricFloraPerikefalea) entitylivingbaseIn;
        int animCycle = 40;
        double tickAnim = (entity.ticksExisted + entity.getTickOffset()) - (int) (Math.floor((double) (entity.ticksExisted + entity.getTickOffset()) / (double) animCycle) * (double) animCycle) + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;

        if (tickAnim >= 0 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 0) / 5) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 5) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 5) / 15) * (5-(0)));
            yy = 0 + (((tickAnim - 5) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 5) / 15) * (-2-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 25) {
            xx = 5 + (((tickAnim - 20) / 5) * (0-(5)));
            yy = 0 + (((tickAnim - 20) / 5) * (0-(0)));
            zz = -2 + (((tickAnim - 20) / 5) * (0-(-2)));
        }
        else if (tickAnim >= 25 && tickAnim < 34) {
            xx = 0 + (((tickAnim - 25) / 9) * (2.5-(0)));
            yy = 0 + (((tickAnim - 25) / 9) * (0-(0)));
            zz = 0 + (((tickAnim - 25) / 9) * (2.5-(0)));
        }
        else if (tickAnim >= 34 && tickAnim < 40) {
            xx = 2.5 + (((tickAnim - 34) / 6) * (0-(2.5)));
            yy = 0 + (((tickAnim - 34) / 6) * (0-(0)));
            zz = 2.5 + (((tickAnim - 34) / 6) * (0-(2.5)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(main, main.rotateAngleX + (float) Math.toRadians(xx), main.rotateAngleY + (float) Math.toRadians(yy), main.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 0) / 5) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 5) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 5) / 15) * (-0.1-(0)));
            yy = 0 + (((tickAnim - 5) / 15) * (0.77-(0)));
            zz = 0 + (((tickAnim - 5) / 15) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 25) {
            xx = -0.1 + (((tickAnim - 20) / 5) * (0-(-0.1)));
            yy = 0.77 + (((tickAnim - 20) / 5) * (0-(0.77)));
            zz = 0 + (((tickAnim - 20) / 5) * (0-(0)));
        }
        else if (tickAnim >= 25 && tickAnim < 34) {
            xx = 0 + (((tickAnim - 25) / 9) * (0-(0)));
            yy = 0 + (((tickAnim - 25) / 9) * (0.4-(0)));
            zz = 0 + (((tickAnim - 25) / 9) * (0-(0)));
        }
        else if (tickAnim >= 34 && tickAnim < 40) {
            xx = 0 + (((tickAnim - 34) / 6) * (0-(0)));
            yy = 0.4 + (((tickAnim - 34) / 6) * (0-(0.4)));
            zz = 0 + (((tickAnim - 34) / 6) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.main.rotationPointX = this.main.rotationPointX + (float)(xx);
        this.main.rotationPointY = this.main.rotationPointY - (float)(yy);
        this.main.rotationPointZ = this.main.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 0) / 10) * (-10.75-(0)));
            yy = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 20) {
            xx = -10.75 + (((tickAnim - 10) / 10) * (-8-(-10.75)));
            yy = 0 + (((tickAnim - 10) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 10) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 30) {
            xx = -8 + (((tickAnim - 20) / 10) * (32.25-(-8)));
            yy = 0 + (((tickAnim - 20) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 10) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 35) {
            xx = 32.25 + (((tickAnim - 30) / 5) * (44.88-(32.25)));
            yy = 0 + (((tickAnim - 30) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 30) / 5) * (0-(0)));
        }
        else if (tickAnim >= 35 && tickAnim < 40) {
            xx = 44.88 + (((tickAnim - 35) / 5) * (0-(44.88)));
            yy = 0 + (((tickAnim - 35) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 35) / 5) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(arm, arm.rotateAngleX + (float) Math.toRadians(xx), arm.rotateAngleY + (float) Math.toRadians(yy), arm.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 5) {
            xx = 77.5 + (((tickAnim - 0) / 5) * (47.88-(77.5)));
            yy = 0 + (((tickAnim - 0) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 5) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 20) {
            xx = 47.88 + (((tickAnim - 5) / 15) * (-15-(47.88)));
            yy = 0 + (((tickAnim - 5) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 5) / 15) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 30) {
            xx = -15 + (((tickAnim - 20) / 10) * (-32.5-(-15)));
            yy = 0 + (((tickAnim - 20) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 10) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 40) {
            xx = -32.5 + (((tickAnim - 30) / 10) * (77.5-(-32.5)));
            yy = 0 + (((tickAnim - 30) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 30) / 10) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(arm2, arm2.rotateAngleX + (float) Math.toRadians(xx), arm2.rotateAngleY + (float) Math.toRadians(yy), arm2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 5) {
            xx = -47.5 + (((tickAnim - 0) / 5) * (-17.5-(-47.5)));
            yy = 0 + (((tickAnim - 0) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 5) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 20) {
            xx = -17.5 + (((tickAnim - 5) / 15) * (-45-(-17.5)));
            yy = 0 + (((tickAnim - 5) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 5) / 15) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 30) {
            xx = -45 + (((tickAnim - 20) / 10) * (-55.41-(-45)));
            yy = 0 + (((tickAnim - 20) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 10) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 35) {
            xx = -55.41 + (((tickAnim - 30) / 5) * (-63.12-(-55.41)));
            yy = 0 + (((tickAnim - 30) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 30) / 5) * (0-(0)));
        }
        else if (tickAnim >= 35 && tickAnim < 40) {
            xx = -63.12 + (((tickAnim - 35) / 5) * (-47.5-(-63.12)));
            yy = 0 + (((tickAnim - 35) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 35) / 5) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(arm3, arm3.rotateAngleX + (float) Math.toRadians(xx), arm3.rotateAngleY + (float) Math.toRadians(yy), arm3.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 5) {
            xx = -50 + (((tickAnim - 0) / 5) * (-35-(-50)));
            yy = 0 + (((tickAnim - 0) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 5) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 30) {
            xx = -35 + (((tickAnim - 5) / 25) * (-35.71-(-35)));
            yy = 0 + (((tickAnim - 5) / 25) * (0-(0)));
            zz = 0 + (((tickAnim - 5) / 25) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 36) {
            xx = -35.71 + (((tickAnim - 30) / 6) * (-56.55-(-35.71)));
            yy = 0 + (((tickAnim - 30) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 30) / 6) * (0-(0)));
        }
        else if (tickAnim >= 36 && tickAnim < 40) {
            xx = -56.55 + (((tickAnim - 36) / 4) * (-50-(-56.55)));
            yy = 0 + (((tickAnim - 36) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 36) / 4) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(arm4, arm4.rotateAngleX + (float) Math.toRadians(xx), arm4.rotateAngleY + (float) Math.toRadians(yy), arm4.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 9) {
            xx = -17.5 + (((tickAnim - 0) / 9) * (-72.5-(-17.5)));
            yy = 0 + (((tickAnim - 0) / 9) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 9) * (0-(0)));
        }
        else if (tickAnim >= 9 && tickAnim < 20) {
            xx = -72.5 + (((tickAnim - 9) / 11) * (-60-(-72.5)));
            yy = 0 + (((tickAnim - 9) / 11) * (0-(0)));
            zz = 0 + (((tickAnim - 9) / 11) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 30) {
            xx = -60 + (((tickAnim - 20) / 10) * (-15-(-60)));
            yy = 0 + (((tickAnim - 20) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 10) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 36) {
            xx = -15 + (((tickAnim - 30) / 6) * (-28.96-(-15)));
            yy = 0 + (((tickAnim - 30) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 30) / 6) * (0-(0)));
        }
        else if (tickAnim >= 36 && tickAnim < 40) {
            xx = -28.96 + (((tickAnim - 36) / 4) * (-17.5-(-28.96)));
            yy = 0 + (((tickAnim - 36) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 36) / 4) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(arm5, arm5.rotateAngleX + (float) Math.toRadians(xx), arm5.rotateAngleY + (float) Math.toRadians(yy), arm5.rotateAngleZ + (float) Math.toRadians(zz));
        
    }

}




