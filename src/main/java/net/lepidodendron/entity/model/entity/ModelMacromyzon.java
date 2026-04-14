package net.lepidodendron.entity.model.entity;

import net.ilexiconn.llibrary.client.model.tools.AdvancedModelRenderer;
import net.lepidodendron.entity.EntityPrehistoricFloraMacromyzon;
import net.lepidodendron.entity.model.ModelBasePalaeopedia;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;

public class ModelMacromyzon extends ModelBasePalaeopedia {
    private final AdvancedModelRenderer sucker;
    private final AdvancedModelRenderer body;
    private final AdvancedModelRenderer body2;
    private final AdvancedModelRenderer body3;
    private final AdvancedModelRenderer body4;
    private final AdvancedModelRenderer body5;

    public ModelMacromyzon() {
        this.textureWidth = 32;
        this.textureHeight = 32;

        this.sucker = new AdvancedModelRenderer(this);
        this.sucker.setRotationPoint(0.0F, 24.0F, 7.0F);
        this.sucker.cubeList.add(new ModelBox(sucker, 0, 15, -1.5F, -1.0F, -2.0F, 3, 1, 3, 0.0F, false));

        this.body = new AdvancedModelRenderer(this);
        this.body.setRotationPoint(0.0F, -0.5F, -0.25F);
        this.sucker.addChild(body);
        this.setRotateAngle(body, -0.8727F, 0.0F, 0.0F);
        this.body.cubeList.add(new ModelBox(body, 12, 15, -2.0F, -1.45F, -1.85F, 4, 2, 2, 0.0F, false));

        this.body2 = new AdvancedModelRenderer(this);
        this.body2.setRotationPoint(0.0F, -1.0F, -1.25F);
        this.body.addChild(body2);
        this.setRotateAngle(body2, 0.9163F, 0.0F, 0.0F);
        this.body2.cubeList.add(new ModelBox(body2, 0, 0, -2.0F, -0.75F, -3.0F, 4, 2, 3, 0.02F, false));
        this.body2.cubeList.add(new ModelBox(body2, 0, 19, -1.5F, -1.0F, -3.0F, 0, 1, 3, 0.0F, false));
        this.body2.cubeList.add(new ModelBox(body2, 0, 19, 1.5F, -1.0F, -3.0F, 0, 1, 3, 0.0F, true));
        this.body2.cubeList.add(new ModelBox(body2, 0, 11, -2.0F, 0.75F, -3.0F, 4, 1, 3, 0.01F, false));

        this.body3 = new AdvancedModelRenderer(this);
        this.body3.setRotationPoint(0.0F, 0.0F, -2.0F);
        this.body2.addChild(body3);
        this.setRotateAngle(body3, 0.2182F, 0.0F, 0.0F);
        this.body3.cubeList.add(new ModelBox(body3, 12, 5, -1.5F, -0.75F, -3.0F, 3, 2, 3, 0.0F, false));
        this.body3.cubeList.add(new ModelBox(body3, 6, 19, -1.25F, -1.0F, -2.5F, 0, 1, 1, 0.0F, false));
        this.body3.cubeList.add(new ModelBox(body3, 6, 19, 1.25F, -1.0F, -2.5F, 0, 1, 1, 0.0F, true));

        this.body4 = new AdvancedModelRenderer(this);
        this.body4.setRotationPoint(0.0F, 0.25F, -2.75F);
        this.body3.addChild(body4);
        this.setRotateAngle(body4, -0.0873F, 0.0F, 0.0F);
        this.body4.cubeList.add(new ModelBox(body4, 14, 0, -1.0F, -0.3282F, -3.249F, 2, 1, 4, 0.0F, false));
        this.body4.cubeList.add(new ModelBox(body4, 14, 10, -1.0F, -0.8782F, -3.249F, 2, 1, 4, 0.01F, false));
        this.body4.cubeList.add(new ModelBox(body4, 8, 19, -0.75F, -1.1282F, -3.249F, 0, 1, 1, 0.0F, false));
        this.body4.cubeList.add(new ModelBox(body4, 12, 19, -0.75F, -1.1282F, -1.499F, 0, 1, 1, 0.0F, false));
        this.body4.cubeList.add(new ModelBox(body4, 8, 19, 0.75F, -1.1282F, -3.249F, 0, 1, 1, 0.0F, true));
        this.body4.cubeList.add(new ModelBox(body4, 12, 19, 0.75F, -1.1282F, -1.499F, 0, 1, 1, 0.0F, true));

        this.body5 = new AdvancedModelRenderer(this);
        this.body5.setRotationPoint(0.0F, -0.0782F, -3.249F);
        this.body4.addChild(body5);
        this.setRotateAngle(body5, -0.1309F, 0.0F, 0.0F);
        this.body5.cubeList.add(new ModelBox(body5, 0, 5, -0.75F, -0.5F, -4.0F, 1, 1, 5, 0.0F, false));
        this.body5.cubeList.add(new ModelBox(body5, 10, 19, -0.5F, -0.75F, -1.5F, 0, 1, 1, 0.0F, false));
        this.body5.cubeList.add(new ModelBox(body5, 14, 19, -0.5F, -0.75F, -3.25F, 0, 1, 1, 0.0F, false));
        this.body5.cubeList.add(new ModelBox(body5, 0, 5, -0.25F, -0.5F, -4.0F, 1, 1, 5, 0.0F, true));
        this.body5.cubeList.add(new ModelBox(body5, 14, 19, 0.5F, -0.75F, -3.25F, 0, 1, 1, 0.0F, true));
        this.body5.cubeList.add(new ModelBox(body5, 10, 19, 0.5F, -0.75F, -1.5F, 0, 1, 1, 0.0F, true));

        updateDefaultPose();
    }

    @Override
    public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        this.sucker.render(f5);
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
        this.sucker.offsetY = -1.6F;
        this.sucker.offsetX = 0.2F;
        this.sucker.offsetZ = 2.0F;
        this.sucker.rotateAngleY = (float)Math.toRadians(120);
        this.sucker.rotateAngleX = (float)Math.toRadians(0);
        this.sucker.rotateAngleZ = (float)Math.toRadians(0);
        this.sucker.scaleChildren = true;
        float scaler = 4.0F;
        this.sucker.setScale(scaler, scaler, scaler);
        //Start of pose:

        //End of pose, now render the model:
        this.sucker.render(f);
        //Reset rotations, positions and sizing:
        this.sucker.setScale(1.0F, 1.0F, 1.0F);
        this.sucker.scaleChildren = false;
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
        this.sucker.offsetZ = -0.3F;

    }

    @Override
    public void setLivingAnimations(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime) {
        super.setLivingAnimations(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime);
        this.resetToDefaultPose();
        EntityPrehistoricFloraMacromyzon ee = (EntityPrehistoricFloraMacromyzon) entitylivingbaseIn;

        if (ee.isInWater()) {//swimming
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

    }

    public void animWalking(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime) {
        EntityPrehistoricFloraMacromyzon entity = (EntityPrehistoricFloraMacromyzon) entitylivingbaseIn;
        int animCycle = 60;
        double tickAnim = (entity.ticksExisted + entity.getTickOffset()) - (int) (Math.floor((double) (entity.ticksExisted + entity.getTickOffset()) / (double) animCycle) * (double) animCycle) + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;

        if (tickAnim >= 0 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 0) / 15) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 15) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 19) {
            xx = 0 + (((tickAnim - 15) / 4) * (-2.4905-(0)));
            yy = 0 + (((tickAnim - 15) / 4) * (0.21782-(0)));
            zz = 0 + (((tickAnim - 15) / 4) * (4.99527-(0)));
        }
        else if (tickAnim >= 19 && tickAnim < 23) {
            xx = -2.4905 + (((tickAnim - 19) / 4) * (-5-(-2.4905)));
            yy = 0.21782 + (((tickAnim - 19) / 4) * (0-(0.21782)));
            zz = 4.99527 + (((tickAnim - 19) / 4) * (0-(4.99527)));
        }
        else if (tickAnim >= 23 && tickAnim < 27) {
            xx = -5 + (((tickAnim - 23) / 4) * (-14.98637-(-5)));
            yy = 0 + (((tickAnim - 23) / 4) * (-0.64686-(0)));
            zz = 0 + (((tickAnim - 23) / 4) * (-2.41492-(0)));
        }
        else if (tickAnim >= 27 && tickAnim < 30) {
            xx = -14.98637 + (((tickAnim - 27) / 3) * (-25-(-14.98637)));
            yy = -0.64686 + (((tickAnim - 27) / 3) * (0-(-0.64686)));
            zz = -2.41492 + (((tickAnim - 27) / 3) * (0-(-2.41492)));
        }
        else if (tickAnim >= 30 && tickAnim < 38) {
            xx = -25 + (((tickAnim - 30) / 8) * (0-(-25)));
            yy = 0 + (((tickAnim - 30) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 30) / 8) * (0-(0)));
        }
        else if (tickAnim >= 38 && tickAnim < 60) {
            xx = 0 + (((tickAnim - 38) / 22) * (0-(0)));
            yy = 0 + (((tickAnim - 38) / 22) * (0-(0)));
            zz = 0 + (((tickAnim - 38) / 22) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(sucker, sucker.rotateAngleX + (float) Math.toRadians(xx), sucker.rotateAngleY + (float) Math.toRadians(yy), sucker.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 0) / 15) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 15) * (3.4-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 30) {
            xx = 0 + (((tickAnim - 15) / 15) * (0-(0)));
            yy = 0 + (((tickAnim - 15) / 15) * (0-(0)));
            zz = 3.4 + (((tickAnim - 15) / 15) * (-7.58-(3.4)));
        }
        else if (tickAnim >= 30 && tickAnim < 60) {
            xx = 0 + (((tickAnim - 30) / 30) * (0-(0)));
            yy = 0 + (((tickAnim - 30) / 30) * (0-(0)));
            zz = -7.58 + (((tickAnim - 30) / 30) * (0-(-7.58)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.sucker.rotationPointX = this.sucker.rotationPointX + (float)(xx);
        this.sucker.rotationPointY = this.sucker.rotationPointY - (float)(yy);
        this.sucker.rotationPointZ = this.sucker.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 0) / 8) * (-32.5-(0)));
            yy = 0 + (((tickAnim - 0) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 8) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 23) {
            xx = -32.5 + (((tickAnim - 8) / 15) * (-30-(-32.5)));
            yy = 0 + (((tickAnim - 8) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 15) * (0-(0)));
        }
        else if (tickAnim >= 23 && tickAnim < 30) {
            xx = -30 + (((tickAnim - 23) / 7) * (-14.75-(-30)));
            yy = 0 + (((tickAnim - 23) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 23) / 7) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 38) {
            xx = -14.75 + (((tickAnim - 30) / 8) * (-64.5-(-14.75)));
            yy = 0 + (((tickAnim - 30) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 30) / 8) * (0-(0)));
        }
        else if (tickAnim >= 38 && tickAnim < 60) {
            xx = -64.5 + (((tickAnim - 38) / 22) * (0-(-64.5)));
            yy = 0 + (((tickAnim - 38) / 22) * (0-(0)));
            zz = 0 + (((tickAnim - 38) / 22) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(body, body.rotateAngleX + (float) Math.toRadians(xx), body.rotateAngleY + (float) Math.toRadians(yy), body.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 15) {
            xx = 1 + (((tickAnim - 0) / 15) * (0.76-(1)));
            yy = 1 + (((tickAnim - 0) / 15) * (1-(1)));
            zz = 1 + (((tickAnim - 0) / 15) * (1-(1)));
        }
        else if (tickAnim >= 15 && tickAnim < 30) {
            xx = 0.76 + (((tickAnim - 15) / 15) * (1.2-(0.76)));
            yy = 1 + (((tickAnim - 15) / 15) * (1-(1)));
            zz = 1 + (((tickAnim - 15) / 15) * (1-(1)));
        }
        else if (tickAnim >= 30 && tickAnim < 60) {
            xx = 1.2 + (((tickAnim - 30) / 30) * (1-(1.2)));
            yy = 1 + (((tickAnim - 30) / 30) * (1-(1)));
            zz = 1 + (((tickAnim - 30) / 30) * (1-(1)));
        }
        else {
            xx = 1;
            yy = 1;
            zz = 1;
        }
        this.body.setScale((float)xx, (float)yy, (float)zz);




        if (tickAnim >= 0 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 0) / 15) * (10-(0)));
            yy = 0 + (((tickAnim - 0) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 15) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 23) {
            xx = 10 + (((tickAnim - 15) / 8) * (23.80439-(10)));
            yy = 0 + (((tickAnim - 15) / 8) * (1.68781-(0)));
            zz = 0 + (((tickAnim - 15) / 8) * (1.84533-(0)));
        }
        else if (tickAnim >= 23 && tickAnim < 30) {
            xx = 23.80439 + (((tickAnim - 23) / 7) * (-2.39121-(23.80439)));
            yy = 1.68781 + (((tickAnim - 23) / 7) * (3.37562-(1.68781)));
            zz = 1.84533 + (((tickAnim - 23) / 7) * (3.69066-(1.84533)));
        }
        else if (tickAnim >= 30 && tickAnim < 38) {
            xx = -2.39121 + (((tickAnim - 30) / 8) * (8.75-(-2.39121)));
            yy = 3.37562 + (((tickAnim - 30) / 8) * (0-(3.37562)));
            zz = 3.69066 + (((tickAnim - 30) / 8) * (0-(3.69066)));
        }
        else if (tickAnim >= 38 && tickAnim < 49) {
            xx = 8.75 + (((tickAnim - 38) / 11) * (18.74756-(8.75)));
            yy = 0 + (((tickAnim - 38) / 11) * (6.31745-(0)));
            zz = 0 + (((tickAnim - 38) / 11) * (4.07394-(0)));
        }
        else if (tickAnim >= 49 && tickAnim < 55) {
            xx = 18.74756 + (((tickAnim - 49) / 6) * (3.65272-(18.74756)));
            yy = 6.31745 + (((tickAnim - 49) / 6) * (2.91575-(6.31745)));
            zz = 4.07394 + (((tickAnim - 49) / 6) * (1.88028-(4.07394)));
        }
        else if (tickAnim >= 55 && tickAnim < 60) {
            xx = 3.65272 + (((tickAnim - 55) / 5) * (0-(3.65272)));
            yy = 2.91575 + (((tickAnim - 55) / 5) * (0-(2.91575)));
            zz = 1.88028 + (((tickAnim - 55) / 5) * (0-(1.88028)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(body3, body3.rotateAngleX + (float) Math.toRadians(xx), body3.rotateAngleY + (float) Math.toRadians(yy), body3.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 15) {
            xx = 1 + (((tickAnim - 0) / 15) * (1-(1)));
            yy = 1 + (((tickAnim - 0) / 15) * (1-(1)));
            zz = 1 + (((tickAnim - 0) / 15) * (1.2-(1)));
        }
        else if (tickAnim >= 15 && tickAnim < 60) {
            xx = 1 + (((tickAnim - 15) / 45) * (1-(1)));
            yy = 1 + (((tickAnim - 15) / 45) * (1-(1)));
            zz = 1.2 + (((tickAnim - 15) / 45) * (1-(1.2)));
        }
        else {
            xx = 1;
            yy = 1;
            zz = 1;
        }
        this.body3.setScale((float)xx, (float)yy, (float)zz);




        if (tickAnim >= 0 && tickAnim < 4) {
            xx = 0 + (((tickAnim - 0) / 4) * (16.87-(0)));
            yy = 0 + (((tickAnim - 0) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 4) * (0-(0)));
        }
        else if (tickAnim >= 4 && tickAnim < 8) {
            xx = 16.87 + (((tickAnim - 4) / 4) * (19.07073-(16.87)));
            yy = 0 + (((tickAnim - 4) / 4) * (-12.13624-(0)));
            zz = 0 + (((tickAnim - 4) / 4) * (-3.01634-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 12) {
            xx = 19.07073 + (((tickAnim - 8) / 4) * (1.84305-(19.07073)));
            yy = -12.13624 + (((tickAnim - 8) / 4) * (-7.48875-(-12.13624)));
            zz = -3.01634 + (((tickAnim - 8) / 4) * (0.41186-(-3.01634)));
        }
        else if (tickAnim >= 12 && tickAnim < 15) {
            xx = 1.84305 + (((tickAnim - 12) / 3) * (20-(1.84305)));
            yy = -7.48875 + (((tickAnim - 12) / 3) * (0-(-7.48875)));
            zz = 0.41186 + (((tickAnim - 12) / 3) * (0-(0.41186)));
        }
        else if (tickAnim >= 15 && tickAnim < 23) {
            xx = 20 + (((tickAnim - 15) / 8) * (60.9083-(20)));
            yy = 0 + (((tickAnim - 15) / 8) * (5.64448-(0)));
            zz = 0 + (((tickAnim - 15) / 8) * (8.2681-(0)));
        }
        else if (tickAnim >= 23 && tickAnim < 30) {
            xx = 60.9083 + (((tickAnim - 23) / 7) * (127.86082-(60.9083)));
            yy = 5.64448 + (((tickAnim - 23) / 7) * (8.86042-(5.64448)));
            zz = 8.2681 + (((tickAnim - 23) / 7) * (4.65468-(8.2681)));
        }
        else if (tickAnim >= 30 && tickAnim < 38) {
            xx = 127.86082 + (((tickAnim - 30) / 8) * (108.78655-(127.86082)));
            yy = 8.86042 + (((tickAnim - 30) / 8) * (-0.37532-(8.86042)));
            zz = 4.65468 + (((tickAnim - 30) / 8) * (4.13696-(4.65468)));
        }
        else if (tickAnim >= 38 && tickAnim < 49) {
            xx = 108.78655 + (((tickAnim - 38) / 11) * (-12.01409-(108.78655)));
            yy = -0.37532 + (((tickAnim - 38) / 11) * (5.82643-(-0.37532)));
            zz = 4.13696 + (((tickAnim - 38) / 11) * (-0.98198-(4.13696)));
        }
        else if (tickAnim >= 49 && tickAnim < 55) {
            xx = -12.01409 + (((tickAnim - 49) / 6) * (6.57042-(-12.01409)));
            yy = 5.82643 + (((tickAnim - 49) / 6) * (2.68912-(5.82643)));
            zz = -0.98198 + (((tickAnim - 49) / 6) * (-0.45322-(-0.98198)));
        }
        else if (tickAnim >= 55 && tickAnim < 60) {
            xx = 6.57042 + (((tickAnim - 55) / 5) * (0-(6.57042)));
            yy = 2.68912 + (((tickAnim - 55) / 5) * (0-(2.68912)));
            zz = -0.45322 + (((tickAnim - 55) / 5) * (0-(-0.45322)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(body4, body4.rotateAngleX + (float) Math.toRadians(xx), body4.rotateAngleY + (float) Math.toRadians(yy), body4.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 4) {
            xx = -12.5 + (((tickAnim - 0) / 4) * (27.5-(-12.5)));
            yy = 0 + (((tickAnim - 0) / 4) * (-25-(0)));
            zz = 0 + (((tickAnim - 0) / 4) * (0-(0)));
        }
        else if (tickAnim >= 4 && tickAnim < 8) {
            xx = 27.5 + (((tickAnim - 4) / 4) * (20.29362-(27.5)));
            yy = -25 + (((tickAnim - 4) / 4) * (-12.19908-(-25)));
            zz = 0 + (((tickAnim - 4) / 4) * (-2.74715-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 12) {
            xx = 20.29362 + (((tickAnim - 8) / 4) * (0-(20.29362)));
            yy = -12.19908 + (((tickAnim - 8) / 4) * (-10-(-12.19908)));
            zz = -2.74715 + (((tickAnim - 8) / 4) * (0-(-2.74715)));
        }
        else if (tickAnim >= 12 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 12) / 3) * (15-(0)));
            yy = -10 + (((tickAnim - 12) / 3) * (0-(-10)));
            zz = 0 + (((tickAnim - 12) / 3) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 23) {
            xx = 15 + (((tickAnim - 15) / 8) * (28.38852-(15)));
            yy = 0 + (((tickAnim - 15) / 8) * (16.41371-(0)));
            zz = 0 + (((tickAnim - 15) / 8) * (6.15491-(0)));
        }
        else if (tickAnim >= 23 && tickAnim < 30) {
            xx = 28.38852 + (((tickAnim - 23) / 7) * (54.61041-(28.38852)));
            yy = 16.41371 + (((tickAnim - 23) / 7) * (2.86841-(16.41371)));
            zz = 6.15491 + (((tickAnim - 23) / 7) * (19.55841-(6.15491)));
        }
        else if (tickAnim >= 30 && tickAnim < 38) {
            xx = 54.61041 + (((tickAnim - 30) / 8) * (66.71369-(54.61041)));
            yy = 2.86841 + (((tickAnim - 30) / 8) * (2.56399-(2.86841)));
            zz = 19.55841 + (((tickAnim - 30) / 8) * (4.29398-(19.55841)));
        }
        else if (tickAnim >= 38 && tickAnim < 44) {
            xx = 66.71369 + (((tickAnim - 38) / 6) * (23.48-(66.71369)));
            yy = 2.56399 + (((tickAnim - 38) / 6) * (-4.53-(2.56399)));
            zz = 4.29398 + (((tickAnim - 38) / 6) * (3.54-(4.29398)));
        }
        else if (tickAnim >= 44 && tickAnim < 49) {
            xx = 23.48 + (((tickAnim - 44) / 5) * (-3.08885-(23.48)));
            yy = -4.53 + (((tickAnim - 44) / 5) * (9.44627-(-4.53)));
            zz = 3.54 + (((tickAnim - 44) / 5) * (3.33379-(3.54)));
        }
        else if (tickAnim >= 49 && tickAnim < 55) {
            xx = -3.08885 + (((tickAnim - 49) / 6) * (28.38207-(-3.08885)));
            yy = 9.44627 + (((tickAnim - 49) / 6) * (4.35982-(9.44627)));
            zz = 3.33379 + (((tickAnim - 49) / 6) * (1.53867-(3.33379)));
        }
        else if (tickAnim >= 55 && tickAnim < 60) {
            xx = 28.38207 + (((tickAnim - 55) / 5) * (-12.5-(28.38207)));
            yy = 4.35982 + (((tickAnim - 55) / 5) * (0-(4.35982)));
            zz = 1.53867 + (((tickAnim - 55) / 5) * (0-(1.53867)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(body5, body5.rotateAngleX + (float) Math.toRadians(xx), body5.rotateAngleY + (float) Math.toRadians(yy), body5.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 0) / 8) * (-10-(0)));
            yy = 0 + (((tickAnim - 0) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 8) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 15) {
            xx = -10 + (((tickAnim - 8) / 7) * (10-(-10)));
            yy = 0 + (((tickAnim - 8) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 7) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 23) {
            xx = 10 + (((tickAnim - 15) / 8) * (-23.33-(10)));
            yy = 0 + (((tickAnim - 15) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 8) * (0-(0)));
        }
        else if (tickAnim >= 23 && tickAnim < 30) {
            xx = -23.33 + (((tickAnim - 23) / 7) * (-38.92-(-23.33)));
            yy = 0 + (((tickAnim - 23) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 23) / 7) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 38) {
            xx = -38.92 + (((tickAnim - 30) / 8) * (-24.5-(-38.92)));
            yy = 0 + (((tickAnim - 30) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 30) / 8) * (0-(0)));
        }
        else if (tickAnim >= 38 && tickAnim < 49) {
            xx = -24.5 + (((tickAnim - 38) / 11) * (-4.3-(-24.5)));
            yy = 0 + (((tickAnim - 38) / 11) * (0-(0)));
            zz = 0 + (((tickAnim - 38) / 11) * (0-(0)));
        }
        else if (tickAnim >= 49 && tickAnim < 60) {
            xx = -4.3 + (((tickAnim - 49) / 11) * (0-(-4.3)));
            yy = 0 + (((tickAnim - 49) / 11) * (0-(0)));
            zz = 0 + (((tickAnim - 49) / 11) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(body2, body2.rotateAngleX + (float) Math.toRadians(xx), body2.rotateAngleY + (float) Math.toRadians(yy), body2.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 15) {
            xx = 1 + (((tickAnim - 0) / 15) * (1-(1)));
            yy = 1 + (((tickAnim - 0) / 15) * (1-(1)));
            zz = 1 + (((tickAnim - 0) / 15) * (1.3-(1)));
        }
        else if (tickAnim >= 15 && tickAnim < 30) {
            xx = 1 + (((tickAnim - 15) / 15) * (1-(1)));
            yy = 1 + (((tickAnim - 15) / 15) * (1-(1)));
            zz = 1.3 + (((tickAnim - 15) / 15) * (1-(1.3)));
        }
        else if (tickAnim >= 30 && tickAnim < 60) {
            xx = 1 + (((tickAnim - 30) / 30) * (1-(1)));
            yy = 1 + (((tickAnim - 30) / 30) * (1-(1)));
            zz = 1 + (((tickAnim - 30) / 30) * (1-(1)));
        }
        else {
            xx = 1;
            yy = 1;
            zz = 1;
        }
        this.body2.setScale((float)xx, (float)yy, (float)zz);

    }

}




