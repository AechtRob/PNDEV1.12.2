package net.lepidodendron.entity.model.entity;

import net.ilexiconn.llibrary.client.model.tools.AdvancedModelRenderer;
import net.lepidodendron.entity.EntityPrehistoricFloraKimberella;
import net.lepidodendron.entity.model.ModelBasePalaeopedia;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;

public class ModelKimberella extends ModelBasePalaeopedia {
    private final AdvancedModelRenderer main;
    private final AdvancedModelRenderer proboscis;
    private final AdvancedModelRenderer proboscis2;
    private final AdvancedModelRenderer proboscis3;
    private final AdvancedModelRenderer proboscishead1;
    private final AdvancedModelRenderer proboscishead2;
    private final AdvancedModelRenderer proboscishead3;

    public ModelKimberella() {
        this.textureWidth = 32;
        this.textureHeight = 32;

        this.main = new AdvancedModelRenderer(this);
        this.main.setRotationPoint(0.0F, 24.0F, 0.0F);
        this.main.cubeList.add(new ModelBox(main, 19, 17, -2.0F, -1.0F, -4.0F, 4, 1, 2, 0.0F, false));
        this.main.cubeList.add(new ModelBox(main, 19, 21, -2.0F, -1.0F, 3.0F, 4, 1, 1, 0.0F, false));
        this.main.cubeList.add(new ModelBox(main, 0, 7, -2.5F, -1.0F, -2.0F, 5, 1, 5, 0.0F, false));
        this.main.cubeList.add(new ModelBox(main, 0, 14, -1.5F, -1.5F, -3.0F, 3, 1, 6, 0.0F, false));
        this.main.cubeList.add(new ModelBox(main, 19, 14, -2.5F, -0.5F, -4.5F, 5, 0, 2, 0.0F, false));
        this.main.cubeList.add(new ModelBox(main, 21, 11, -2.5F, -0.5F, 3.5F, 5, 0, 1, 0.0F, false));
        this.main.cubeList.add(new ModelBox(main, 0, 0, -3.0F, -0.5F, -2.5F, 6, 0, 6, 0.0F, false));

        this.proboscis = new AdvancedModelRenderer(this);
        this.proboscis.setRotationPoint(0.0F, -0.5F, -1.0F);
        this.main.addChild(proboscis);
        this.proboscis.cubeList.add(new ModelBox(proboscis, 11, 24, -1.0F, -0.5F, -2.0F, 2, 1, 2, 0.002F, false));
        this.proboscis.cubeList.add(new ModelBox(proboscis, 0, 22, -1.5F, -0.025F, -2.0F, 3, 0, 2, 0.0F, false));

        this.proboscis2 = new AdvancedModelRenderer(this);
        this.proboscis2.setRotationPoint(0.0F, 0.5F, 0.0F);
        this.proboscis.addChild(proboscis2);
        this.proboscis2.cubeList.add(new ModelBox(proboscis2, 11, 24, -1.0F, -1.0F, -2.0F, 2, 1, 2, -0.004F, false));

        this.proboscis3 = new AdvancedModelRenderer(this);
        this.proboscis3.setRotationPoint(0.0F, 0.5F, 0.0F);
        this.proboscis.addChild(proboscis3);
        this.proboscis3.cubeList.add(new ModelBox(proboscis3, 11, 24, -1.0F, -1.0F, -2.0F, 2, 1, 2, -0.004F, false));

        this.proboscishead1 = new AdvancedModelRenderer(this);
        this.proboscishead1.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.proboscis.addChild(proboscishead1);
        this.proboscishead1.cubeList.add(new ModelBox(proboscishead1, 13, 17, -0.5F, -0.475F, -1.5F, 1, 1, 1, -0.004F, false));

        this.proboscishead2 = new AdvancedModelRenderer(this);
        this.proboscishead2.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.proboscishead1.addChild(proboscishead2);
        this.proboscishead2.cubeList.add(new ModelBox(proboscishead2, 20, 24, -1.0F, -0.5F, -2.0F, 2, 1, 2, -0.002F, false));
        this.proboscishead2.cubeList.add(new ModelBox(proboscishead2, 21, 7, -1.5F, -0.02F, -2.5F, 3, 0, 3, 0.0F, false));

        this.proboscishead3 = new AdvancedModelRenderer(this);
        this.proboscishead3.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.proboscishead1.addChild(proboscishead3);
        this.proboscishead3.cubeList.add(new ModelBox(proboscishead3, 20, 24, -1.0F, -0.5F, -2.0F, 2, 1, 2, -0.004F, false));
        this.proboscishead3.cubeList.add(new ModelBox(proboscishead3, 21, 7, -1.5F, -0.04F, -2.5F, 3, 0, 3, 0.0F, false));

        updateDefaultPose();
    }

    @Override
    public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        this.main.render(f5);
    }

    @Override
    public void renderStaticBook(float f) {
        //Rotations, positions and sizing:
        this.main.offsetY = -1.2F;
        this.main.offsetX = 0;
        this.main.rotateAngleY = (float)Math.toRadians(200);
        this.main.rotateAngleX = (float)Math.toRadians(25);
        this.main.rotateAngleZ = (float)Math.toRadians(-8);
        this.main.scaleChildren = true;
        float scaler = 3.33F;
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

        EntityPrehistoricFloraKimberella ee = (EntityPrehistoricFloraKimberella) e;

        this.main.scaleChildren = true;
        float scaler = ((float) (((double) ee.getSlitherStage()) / 10D) * 0.07F);
        this.main.setScaleZ(scaler + 1F);
    }


    @Override
    public void setLivingAnimations(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime) {
        super.setLivingAnimations(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime);
        this.resetToDefaultPose();
        EntityPrehistoricFloraKimberella ee = (EntityPrehistoricFloraKimberella) entitylivingbaseIn;

        if (ee.getAnimation() == ee.STAND_ANIMATION) {
            animEat(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime, ee.getAnimationTick());
        }

    }

    public void animEat(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime, double animTick) {
        EntityPrehistoricFloraKimberella entity = (EntityPrehistoricFloraKimberella) entitylivingbaseIn;
        int animCycle = 111;
        double tickAnim = (entity.ticksExisted + entity.getTickOffset()) - (int) (Math.floor((double) (entity.ticksExisted + entity.getTickOffset()) / (double) animCycle) * (double) animCycle) + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;
        if (tickAnim >= 0 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 0) / 8) * (-10.35491-(0)));
            yy = 0 + (((tickAnim - 0) / 8) * (-14.76646-(0)));
            zz = 0 + (((tickAnim - 0) / 8) * (2.66645-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 15) {
            xx = -10.35491 + (((tickAnim - 8) / 7) * (0-(-10.35491)));
            yy = -14.76646 + (((tickAnim - 8) / 7) * (-22.5-(-14.76646)));
            zz = 2.66645 + (((tickAnim - 8) / 7) * (0-(2.66645)));
        }
        else if (tickAnim >= 15 && tickAnim < 23) {
            xx = 0 + (((tickAnim - 15) / 8) * (-7.5-(0)));
            yy = -22.5 + (((tickAnim - 15) / 8) * (0-(-22.5)));
            zz = 0 + (((tickAnim - 15) / 8) * (0-(0)));
        }
        else if (tickAnim >= 23 && tickAnim < 30) {
            xx = -7.5 + (((tickAnim - 23) / 7) * (0-(-7.5)));
            yy = 0 + (((tickAnim - 23) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 23) / 7) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 38) {
            xx = 0 + (((tickAnim - 30) / 8) * (0-(0)));
            yy = 0 + (((tickAnim - 30) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 30) / 8) * (0-(0)));
        }
        else if (tickAnim >= 38 && tickAnim < 45) {
            xx = 0 + (((tickAnim - 38) / 7) * (-10.00933-(0)));
            yy = 0 + (((tickAnim - 38) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 38) / 7) * (0-(0)));
        }
        else if (tickAnim >= 45 && tickAnim < 53) {
            xx = -10.00933 + (((tickAnim - 45) / 8) * (0-(-10.00933)));
            yy = 0 + (((tickAnim - 45) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 45) / 8) * (0-(0)));
        }
        else if (tickAnim >= 53 && tickAnim < 60) {
            xx = 0 + (((tickAnim - 53) / 7) * (-7.5-(0)));
            yy = 0 + (((tickAnim - 53) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 53) / 7) * (0-(0)));
        }
        else if (tickAnim >= 60 && tickAnim < 68) {
            xx = -7.5 + (((tickAnim - 60) / 8) * (0-(-7.5)));
            yy = 0 + (((tickAnim - 60) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 60) / 8) * (0-(0)));
        }
        else if (tickAnim >= 68 && tickAnim < 75) {
            xx = 0 + (((tickAnim - 68) / 7) * (0-(0)));
            yy = 0 + (((tickAnim - 68) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 68) / 7) * (0-(0)));
        }
        else if (tickAnim >= 75 && tickAnim < 82) {
            xx = 0 + (((tickAnim - 75) / 7) * (-10.48084-(0)));
            yy = 0 + (((tickAnim - 75) / 7) * (14.76646-(0)));
            zz = 0 + (((tickAnim - 75) / 7) * (-2.25642-(0)));
        }
        else if (tickAnim >= 82 && tickAnim < 89) {
            xx = -10.48084 + (((tickAnim - 82) / 7) * (0-(-10.48084)));
            yy = 14.76646 + (((tickAnim - 82) / 7) * (22.5-(14.76646)));
            zz = -2.25642 + (((tickAnim - 82) / 7) * (0-(-2.25642)));
        }
        else if (tickAnim >= 89 && tickAnim < 97) {
            xx = 0 + (((tickAnim - 89) / 8) * (-7.5-(0)));
            yy = 22.5 + (((tickAnim - 89) / 8) * (0-(22.5)));
            zz = 0 + (((tickAnim - 89) / 8) * (0-(0)));
        }
        else if (tickAnim >= 97 && tickAnim < 104) {
            xx = -7.5 + (((tickAnim - 97) / 7) * (0-(-7.5)));
            yy = 0 + (((tickAnim - 97) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 97) / 7) * (0-(0)));
        }
        else if (tickAnim >= 104 && tickAnim < 112) {
            xx = 0 + (((tickAnim - 104) / 8) * (0-(0)));
            yy = 0 + (((tickAnim - 104) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 104) / 8) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(proboscis, proboscis.rotateAngleX + (float) Math.toRadians(xx), proboscis.rotateAngleY + (float) Math.toRadians(yy), proboscis.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 0) / 8) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 8) * (-1-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 8) / 7) * (0-(0)));
            yy = 0 + (((tickAnim - 8) / 7) * (0-(0)));
            zz = -1 + (((tickAnim - 8) / 7) * (-1-(-1)));
        }
        else if (tickAnim >= 15 && tickAnim < 23) {
            xx = 0 + (((tickAnim - 15) / 8) * (0-(0)));
            yy = 0 + (((tickAnim - 15) / 8) * (0-(0)));
            zz = -1 + (((tickAnim - 15) / 8) * (0-(-1)));
        }
        else if (tickAnim >= 23 && tickAnim < 30) {
            xx = 0 + (((tickAnim - 23) / 7) * (0-(0)));
            yy = 0 + (((tickAnim - 23) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 23) / 7) * (1-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 38) {
            xx = 0 + (((tickAnim - 30) / 8) * (0-(0)));
            yy = 0 + (((tickAnim - 30) / 8) * (0-(0)));
            zz = 1 + (((tickAnim - 30) / 8) * (1-(1)));
        }
        else if (tickAnim >= 38 && tickAnim < 45) {
            xx = 0 + (((tickAnim - 38) / 7) * (0-(0)));
            yy = 0 + (((tickAnim - 38) / 7) * (0-(0)));
            zz = 1 + (((tickAnim - 38) / 7) * (-1-(1)));
        }
        else if (tickAnim >= 45 && tickAnim < 53) {
            xx = 0 + (((tickAnim - 45) / 8) * (0-(0)));
            yy = 0 + (((tickAnim - 45) / 8) * (0-(0)));
            zz = -1 + (((tickAnim - 45) / 8) * (-1-(-1)));
        }
        else if (tickAnim >= 53 && tickAnim < 60) {
            xx = 0 + (((tickAnim - 53) / 7) * (0-(0)));
            yy = 0 + (((tickAnim - 53) / 7) * (0-(0)));
            zz = -1 + (((tickAnim - 53) / 7) * (0-(-1)));
        }
        else if (tickAnim >= 60 && tickAnim < 68) {
            xx = 0 + (((tickAnim - 60) / 8) * (0-(0)));
            yy = 0 + (((tickAnim - 60) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 60) / 8) * (1-(0)));
        }
        else if (tickAnim >= 68 && tickAnim < 75) {
            xx = 0 + (((tickAnim - 68) / 7) * (0-(0)));
            yy = 0 + (((tickAnim - 68) / 7) * (0-(0)));
            zz = 1 + (((tickAnim - 68) / 7) * (1-(1)));
        }
        else if (tickAnim >= 75 && tickAnim < 82) {
            xx = 0 + (((tickAnim - 75) / 7) * (0-(0)));
            yy = 0 + (((tickAnim - 75) / 7) * (0-(0)));
            zz = 1 + (((tickAnim - 75) / 7) * (-1-(1)));
        }
        else if (tickAnim >= 82 && tickAnim < 89) {
            xx = 0 + (((tickAnim - 82) / 7) * (0-(0)));
            yy = 0 + (((tickAnim - 82) / 7) * (0-(0)));
            zz = -1 + (((tickAnim - 82) / 7) * (-1-(-1)));
        }
        else if (tickAnim >= 89 && tickAnim < 97) {
            xx = 0 + (((tickAnim - 89) / 8) * (0-(0)));
            yy = 0 + (((tickAnim - 89) / 8) * (0-(0)));
            zz = -1 + (((tickAnim - 89) / 8) * (0-(-1)));
        }
        else if (tickAnim >= 97 && tickAnim < 104) {
            xx = 0 + (((tickAnim - 97) / 7) * (0-(0)));
            yy = 0 + (((tickAnim - 97) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 97) / 7) * (1-(0)));
        }
        else if (tickAnim >= 104 && tickAnim < 112) {
            xx = 0 + (((tickAnim - 104) / 8) * (0-(0)));
            yy = 0 + (((tickAnim - 104) / 8) * (0-(0)));
            zz = 1 + (((tickAnim - 104) / 8) * (1-(1)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.proboscis.rotationPointX = this.proboscis.rotationPointX + (float)(xx);
        this.proboscis.rotationPointY = this.proboscis.rotationPointY - (float)(yy);
        this.proboscis.rotationPointZ = this.proboscis.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 0) / 8) * (-10.08453-(0)));
            yy = 0 + (((tickAnim - 0) / 8) * (-7.38542-(0)));
            zz = 0 + (((tickAnim - 0) / 8) * (1.30962-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 15) {
            xx = -10.08453 + (((tickAnim - 8) / 7) * (0-(-10.08453)));
            yy = -7.38542 + (((tickAnim - 8) / 7) * (-12.5-(-7.38542)));
            zz = 1.30962 + (((tickAnim - 8) / 7) * (0-(1.30962)));
        }
        else if (tickAnim >= 15 && tickAnim < 23) {
            xx = 0 + (((tickAnim - 15) / 8) * (25.08377-(0)));
            yy = -12.5 + (((tickAnim - 15) / 8) * (-4.53051-(-12.5)));
            zz = 0 + (((tickAnim - 15) / 8) * (-2.11751-(0)));
        }
        else if (tickAnim >= 23 && tickAnim < 30) {
            xx = 25.08377 + (((tickAnim - 23) / 7) * (10-(25.08377)));
            yy = -4.53051 + (((tickAnim - 23) / 7) * (0-(-4.53051)));
            zz = -2.11751 + (((tickAnim - 23) / 7) * (0-(-2.11751)));
        }
        else if (tickAnim >= 30 && tickAnim < 38) {
            xx = 10 + (((tickAnim - 30) / 8) * (0-(10)));
            yy = 0 + (((tickAnim - 30) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 30) / 8) * (0-(0)));
        }
        else if (tickAnim >= 38 && tickAnim < 45) {
            xx = 0 + (((tickAnim - 38) / 7) * (-10-(0)));
            yy = 0 + (((tickAnim - 38) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 38) / 7) * (0-(0)));
        }
        else if (tickAnim >= 45 && tickAnim < 53) {
            xx = -10 + (((tickAnim - 45) / 8) * (0-(-10)));
            yy = 0 + (((tickAnim - 45) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 45) / 8) * (0-(0)));
        }
        else if (tickAnim >= 53 && tickAnim < 60) {
            xx = 0 + (((tickAnim - 53) / 7) * (25-(0)));
            yy = 0 + (((tickAnim - 53) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 53) / 7) * (0-(0)));
        }
        else if (tickAnim >= 60 && tickAnim < 68) {
            xx = 25 + (((tickAnim - 60) / 8) * (10-(25)));
            yy = 0 + (((tickAnim - 60) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 60) / 8) * (0-(0)));
        }
        else if (tickAnim >= 68 && tickAnim < 75) {
            xx = 10 + (((tickAnim - 68) / 7) * (0-(10)));
            yy = 0 + (((tickAnim - 68) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 68) / 7) * (0-(0)));
        }
        else if (tickAnim >= 75 && tickAnim < 82) {
            xx = 0 + (((tickAnim - 75) / 7) * (-10.15108-(0)));
            yy = 0 + (((tickAnim - 75) / 7) * (7.38542-(0)));
            zz = 0 + (((tickAnim - 75) / 7) * (-1.75378-(0)));
        }
        else if (tickAnim >= 82 && tickAnim < 89) {
            xx = -10.15108 + (((tickAnim - 82) / 7) * (0-(-10.15108)));
            yy = 7.38542 + (((tickAnim - 82) / 7) * (12.5-(7.38542)));
            zz = -1.75378 + (((tickAnim - 82) / 7) * (0-(-1.75378)));
        }
        else if (tickAnim >= 89 && tickAnim < 97) {
            xx = 0 + (((tickAnim - 89) / 8) * (25.08377-(0)));
            yy = 12.5 + (((tickAnim - 89) / 8) * (4.53051-(12.5)));
            zz = 0 + (((tickAnim - 89) / 8) * (2.11751-(0)));
        }
        else if (tickAnim >= 97 && tickAnim < 104) {
            xx = 25.08377 + (((tickAnim - 97) / 7) * (10-(25.08377)));
            yy = 4.53051 + (((tickAnim - 97) / 7) * (0-(4.53051)));
            zz = 2.11751 + (((tickAnim - 97) / 7) * (0-(2.11751)));
        }
        else if (tickAnim >= 104 && tickAnim < 112) {
            xx = 10 + (((tickAnim - 104) / 8) * (0-(10)));
            yy = 0 + (((tickAnim - 104) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 104) / 8) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(proboscishead1, proboscishead1.rotateAngleX + (float) Math.toRadians(xx), proboscishead1.rotateAngleY + (float) Math.toRadians(yy), proboscishead1.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 0) / 8) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 8) * (-2-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 8) / 7) * (0-(0)));
            yy = 0 + (((tickAnim - 8) / 7) * (0-(0)));
            zz = -2 + (((tickAnim - 8) / 7) * (-2-(-2)));
        }
        else if (tickAnim >= 15 && tickAnim < 23) {
            xx = 0 + (((tickAnim - 15) / 8) * (0-(0)));
            yy = 0 + (((tickAnim - 15) / 8) * (0-(0)));
            zz = -2 + (((tickAnim - 15) / 8) * (-2-(-2)));
        }
        else if (tickAnim >= 23 && tickAnim < 30) {
            xx = 0 + (((tickAnim - 23) / 7) * (0-(0)));
            yy = 0 + (((tickAnim - 23) / 7) * (0-(0)));
            zz = -2 + (((tickAnim - 23) / 7) * (-2-(-2)));
        }
        else if (tickAnim >= 30 && tickAnim < 38) {
            xx = 0 + (((tickAnim - 30) / 8) * (0-(0)));
            yy = 0 + (((tickAnim - 30) / 8) * (0-(0)));
            zz = -2 + (((tickAnim - 30) / 8) * (-1-(-2)));
        }
        else if (tickAnim >= 38 && tickAnim < 45) {
            xx = 0 + (((tickAnim - 38) / 7) * (0-(0)));
            yy = 0 + (((tickAnim - 38) / 7) * (0-(0)));
            zz = -1 + (((tickAnim - 38) / 7) * (-2-(-1)));
        }
        else if (tickAnim >= 45 && tickAnim < 53) {
            xx = 0 + (((tickAnim - 45) / 8) * (0-(0)));
            yy = 0 + (((tickAnim - 45) / 8) * (0-(0)));
            zz = -2 + (((tickAnim - 45) / 8) * (-2-(-2)));
        }
        else if (tickAnim >= 53 && tickAnim < 60) {
            xx = 0 + (((tickAnim - 53) / 7) * (0-(0)));
            yy = 0 + (((tickAnim - 53) / 7) * (0-(0)));
            zz = -2 + (((tickAnim - 53) / 7) * (-2-(-2)));
        }
        else if (tickAnim >= 60 && tickAnim < 68) {
            xx = 0 + (((tickAnim - 60) / 8) * (0-(0)));
            yy = 0 + (((tickAnim - 60) / 8) * (0-(0)));
            zz = -2 + (((tickAnim - 60) / 8) * (-2-(-2)));
        }
        else if (tickAnim >= 68 && tickAnim < 75) {
            xx = 0 + (((tickAnim - 68) / 7) * (0-(0)));
            yy = 0 + (((tickAnim - 68) / 7) * (0-(0)));
            zz = -2 + (((tickAnim - 68) / 7) * (-1-(-2)));
        }
        else if (tickAnim >= 75 && tickAnim < 82) {
            xx = 0 + (((tickAnim - 75) / 7) * (0-(0)));
            yy = 0 + (((tickAnim - 75) / 7) * (0-(0)));
            zz = -1 + (((tickAnim - 75) / 7) * (-2-(-1)));
        }
        else if (tickAnim >= 82 && tickAnim < 89) {
            xx = 0 + (((tickAnim - 82) / 7) * (0-(0)));
            yy = 0 + (((tickAnim - 82) / 7) * (0-(0)));
            zz = -2 + (((tickAnim - 82) / 7) * (-2-(-2)));
        }
        else if (tickAnim >= 89 && tickAnim < 97) {
            xx = 0 + (((tickAnim - 89) / 8) * (0-(0)));
            yy = 0 + (((tickAnim - 89) / 8) * (0-(0)));
            zz = -2 + (((tickAnim - 89) / 8) * (-2-(-2)));
        }
        else if (tickAnim >= 97 && tickAnim < 104) {
            xx = 0 + (((tickAnim - 97) / 7) * (0-(0)));
            yy = 0 + (((tickAnim - 97) / 7) * (0-(0)));
            zz = -2 + (((tickAnim - 97) / 7) * (-2-(-2)));
        }
        else if (tickAnim >= 104 && tickAnim < 112) {
            xx = 0 + (((tickAnim - 104) / 8) * (0-(0)));
            yy = 0 + (((tickAnim - 104) / 8) * (0-(0)));
            zz = -2 + (((tickAnim - 104) / 8) * (-1-(-2)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.proboscishead1.rotationPointX = this.proboscishead1.rotationPointX + (float)(xx);
        this.proboscishead1.rotationPointY = this.proboscishead1.rotationPointY - (float)(yy);
        this.proboscishead1.rotationPointZ = this.proboscishead1.rotationPointZ + (float)(zz);



        this.setRotateAngle(proboscishead2, proboscishead2.rotateAngleX + (float) Math.toRadians(0), proboscishead2.rotateAngleY + (float) Math.toRadians(0), proboscishead2.rotateAngleZ + (float) Math.toRadians(0));

        if (tickAnim >= 0 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 0) / 8) * (0.25-(0)));
            yy = 0 + (((tickAnim - 0) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 8) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 30) {
            xx = 0.25 + (((tickAnim - 8) / 22) * (0-(0.25)));
            yy = 0 + (((tickAnim - 8) / 22) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 22) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 38) {
            xx = 0 + (((tickAnim - 30) / 8) * (0-(0)));
            yy = 0 + (((tickAnim - 30) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 30) / 8) * (0-(0)));
        }
        else if (tickAnim >= 38 && tickAnim < 45) {
            xx = 0 + (((tickAnim - 38) / 7) * (0.25-(0)));
            yy = 0 + (((tickAnim - 38) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 38) / 7) * (0-(0)));
        }
        else if (tickAnim >= 45 && tickAnim < 68) {
            xx = 0.25 + (((tickAnim - 45) / 23) * (0-(0.25)));
            yy = 0 + (((tickAnim - 45) / 23) * (0-(0)));
            zz = 0 + (((tickAnim - 45) / 23) * (0-(0)));
        }
        else if (tickAnim >= 68 && tickAnim < 75) {
            xx = 0 + (((tickAnim - 68) / 7) * (0-(0)));
            yy = 0 + (((tickAnim - 68) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 68) / 7) * (0-(0)));
        }
        else if (tickAnim >= 75 && tickAnim < 82) {
            xx = 0 + (((tickAnim - 75) / 7) * (0.25-(0)));
            yy = 0 + (((tickAnim - 75) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 75) / 7) * (0-(0)));
        }
        else if (tickAnim >= 82 && tickAnim < 104) {
            xx = 0.25 + (((tickAnim - 82) / 22) * (0-(0.25)));
            yy = 0 + (((tickAnim - 82) / 22) * (0-(0)));
            zz = 0 + (((tickAnim - 82) / 22) * (0-(0)));
        }
        else if (tickAnim >= 104 && tickAnim < 112) {
            xx = 0 + (((tickAnim - 104) / 8) * (0-(0)));
            yy = 0 + (((tickAnim - 104) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 104) / 8) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.proboscishead2.rotationPointX = this.proboscishead2.rotationPointX + (float)(xx);
        this.proboscishead2.rotationPointY = this.proboscishead2.rotationPointY - (float)(yy);
        this.proboscishead2.rotationPointZ = this.proboscishead2.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 0) / 8) * (-0.25-(0)));
            yy = 0 + (((tickAnim - 0) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 8) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 30) {
            xx = -0.25 + (((tickAnim - 8) / 22) * (0-(-0.25)));
            yy = 0 + (((tickAnim - 8) / 22) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 22) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 38) {
            xx = 0 + (((tickAnim - 30) / 8) * (0-(0)));
            yy = 0 + (((tickAnim - 30) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 30) / 8) * (0-(0)));
        }
        else if (tickAnim >= 38 && tickAnim < 45) {
            xx = 0 + (((tickAnim - 38) / 7) * (-0.25-(0)));
            yy = 0 + (((tickAnim - 38) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 38) / 7) * (0-(0)));
        }
        else if (tickAnim >= 45 && tickAnim < 68) {
            xx = -0.25 + (((tickAnim - 45) / 23) * (0-(-0.25)));
            yy = 0 + (((tickAnim - 45) / 23) * (0-(0)));
            zz = 0 + (((tickAnim - 45) / 23) * (0-(0)));
        }
        else if (tickAnim >= 68 && tickAnim < 75) {
            xx = 0 + (((tickAnim - 68) / 7) * (0-(0)));
            yy = 0 + (((tickAnim - 68) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 68) / 7) * (0-(0)));
        }
        else if (tickAnim >= 75 && tickAnim < 82) {
            xx = 0 + (((tickAnim - 75) / 7) * (-0.25-(0)));
            yy = 0 + (((tickAnim - 75) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 75) / 7) * (0-(0)));
        }
        else if (tickAnim >= 82 && tickAnim < 104) {
            xx = -0.25 + (((tickAnim - 82) / 22) * (0-(-0.25)));
            yy = 0 + (((tickAnim - 82) / 22) * (0-(0)));
            zz = 0 + (((tickAnim - 82) / 22) * (0-(0)));
        }
        else if (tickAnim >= 104 && tickAnim < 112) {
            xx = 0 + (((tickAnim - 104) / 8) * (0-(0)));
            yy = 0 + (((tickAnim - 104) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 104) / 8) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.proboscishead3.rotationPointX = this.proboscishead3.rotationPointX + (float)(xx);
        this.proboscishead3.rotationPointY = this.proboscishead3.rotationPointY - (float)(yy);
        this.proboscishead3.rotationPointZ = this.proboscishead3.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 0) / 8) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 8) * (-0.25-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 23) {
            xx = 0 + (((tickAnim - 8) / 15) * (0-(0)));
            yy = 0 + (((tickAnim - 8) / 15) * (0-(0)));
            zz = -0.25 + (((tickAnim - 8) / 15) * (-0.28-(-0.25)));
        }
        else if (tickAnim >= 23 && tickAnim < 30) {
            xx = 0 + (((tickAnim - 23) / 7) * (0-(0)));
            yy = 0 + (((tickAnim - 23) / 7) * (0-(0)));
            zz = -0.28 + (((tickAnim - 23) / 7) * (-0.1-(-0.28)));
        }
        else if (tickAnim >= 30 && tickAnim < 38) {
            xx = 0 + (((tickAnim - 30) / 8) * (0-(0)));
            yy = 0 + (((tickAnim - 30) / 8) * (0-(0)));
            zz = -0.1 + (((tickAnim - 30) / 8) * (0-(-0.1)));
        }
        else if (tickAnim >= 38 && tickAnim < 60) {
            xx = 0 + (((tickAnim - 38) / 22) * (0-(0)));
            yy = 0 + (((tickAnim - 38) / 22) * (0-(0)));
            zz = 0 + (((tickAnim - 38) / 22) * (-0.25-(0)));
        }
        else if (tickAnim >= 60 && tickAnim < 68) {
            xx = 0 + (((tickAnim - 60) / 8) * (0-(0)));
            yy = 0 + (((tickAnim - 60) / 8) * (0-(0)));
            zz = -0.25 + (((tickAnim - 60) / 8) * (-0.15-(-0.25)));
        }
        else if (tickAnim >= 68 && tickAnim < 75) {
            xx = 0 + (((tickAnim - 68) / 7) * (0-(0)));
            yy = 0 + (((tickAnim - 68) / 7) * (0-(0)));
            zz = -0.15 + (((tickAnim - 68) / 7) * (0-(-0.15)));
        }
        else if (tickAnim >= 75 && tickAnim < 82) {
            xx = 0 + (((tickAnim - 75) / 7) * (0-(0)));
            yy = 0 + (((tickAnim - 75) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 75) / 7) * (-0.25-(0)));
        }
        else if (tickAnim >= 82 && tickAnim < 97) {
            xx = 0 + (((tickAnim - 82) / 15) * (0-(0)));
            yy = 0 + (((tickAnim - 82) / 15) * (0-(0)));
            zz = -0.25 + (((tickAnim - 82) / 15) * (-0.28-(-0.25)));
        }
        else if (tickAnim >= 97 && tickAnim < 104) {
            xx = 0 + (((tickAnim - 97) / 7) * (0-(0)));
            yy = 0 + (((tickAnim - 97) / 7) * (0-(0)));
            zz = -0.28 + (((tickAnim - 97) / 7) * (-0.1-(-0.28)));
        }
        else if (tickAnim >= 104 && tickAnim < 112) {
            xx = 0 + (((tickAnim - 104) / 8) * (0-(0)));
            yy = 0 + (((tickAnim - 104) / 8) * (0-(0)));
            zz = -0.1 + (((tickAnim - 104) / 8) * (0-(-0.1)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.proboscis2.rotationPointX = this.proboscis2.rotationPointX + (float)(xx);
        this.proboscis2.rotationPointY = this.proboscis2.rotationPointY - (float)(yy);
        this.proboscis2.rotationPointZ = this.proboscis2.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 0) / 8) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 8) * (0.25-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 8) / 7) * (0-(0)));
            yy = 0 + (((tickAnim - 8) / 7) * (0-(0)));
            zz = 0.25 + (((tickAnim - 8) / 7) * (0.5-(0.25)));
        }
        else if (tickAnim >= 15 && tickAnim < 23) {
            xx = 0 + (((tickAnim - 15) / 8) * (0-(0)));
            yy = 0 + (((tickAnim - 15) / 8) * (0-(0)));
            zz = 0.5 + (((tickAnim - 15) / 8) * (0-(0.5)));
        }
        else if (tickAnim >= 23 && tickAnim < 75) {
            xx = 0 + (((tickAnim - 23) / 52) * (0-(0)));
            yy = 0 + (((tickAnim - 23) / 52) * (0-(0)));
            zz = 0 + (((tickAnim - 23) / 52) * (0-(0)));
        }
        else if (tickAnim >= 75 && tickAnim < 82) {
            xx = 0 + (((tickAnim - 75) / 7) * (0-(0)));
            yy = 0 + (((tickAnim - 75) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 75) / 7) * (0.25-(0)));
        }
        else if (tickAnim >= 82 && tickAnim < 89) {
            xx = 0 + (((tickAnim - 82) / 7) * (0-(0)));
            yy = 0 + (((tickAnim - 82) / 7) * (0-(0)));
            zz = 0.25 + (((tickAnim - 82) / 7) * (0.5-(0.25)));
        }
        else if (tickAnim >= 89 && tickAnim < 97) {
            xx = 0 + (((tickAnim - 89) / 8) * (0-(0)));
            yy = 0 + (((tickAnim - 89) / 8) * (0-(0)));
            zz = 0.5 + (((tickAnim - 89) / 8) * (0-(0.5)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.proboscis3.rotationPointX = this.proboscis3.rotationPointX + (float)(xx);
        this.proboscis3.rotationPointY = this.proboscis3.rotationPointY - (float)(yy);
        this.proboscis3.rotationPointZ = this.proboscis3.rotationPointZ + (float)(zz);
    }
}
