package net.lepidodendron.entity.model.entity;

import net.ilexiconn.llibrary.client.model.ModelAnimator;
import net.ilexiconn.llibrary.client.model.tools.AdvancedModelRenderer;
import net.lepidodendron.entity.EntityPrehistoricFloraCampylocephalus;
import net.lepidodendron.entity.model.ModelBasePalaeopedia;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;

public class ModelCampylocephalus extends ModelBasePalaeopedia {
    private final AdvancedModelRenderer carapace;
    private final AdvancedModelRenderer cube_r1;
    private final AdvancedModelRenderer cube_r2;
    private final AdvancedModelRenderer legright1;
    private final AdvancedModelRenderer legleft1;
    private final AdvancedModelRenderer legright2;
    private final AdvancedModelRenderer legleft2;
    private final AdvancedModelRenderer legright3;
    private final AdvancedModelRenderer legleft3;
    private final AdvancedModelRenderer legright4;
    private final AdvancedModelRenderer legleft4;
    private final AdvancedModelRenderer legright5;
    private final AdvancedModelRenderer legleft5;
    private final AdvancedModelRenderer body1;
    private final AdvancedModelRenderer body2;
    private final AdvancedModelRenderer body3;
    private final AdvancedModelRenderer body4;
    private final AdvancedModelRenderer carapacefront;
    private final AdvancedModelRenderer cube_r3;
    private final AdvancedModelRenderer cube_r4;

    private ModelAnimator animator;

    public ModelCampylocephalus() {
        this.textureWidth = 32;
        this.textureHeight = 32;

        this.carapace = new AdvancedModelRenderer(this);
        this.carapace.setRotationPoint(0.0F, 24.0F, -2.0F);
        this.carapace.cubeList.add(new ModelBox(carapace, 0, 0, -2.5F, -5.0F, -3.0F, 5, 3, 6, 0.0F, false));
        this.carapace.cubeList.add(new ModelBox(carapace, 17, 20, -2.5F, -5.0F, 3.0F, 5, 0, 1, 0.0F, false));

        this.cube_r1 = new AdvancedModelRenderer(this);
        this.cube_r1.setRotationPoint(2.5F, -5.0F, 0.0F);
        this.carapace.addChild(cube_r1);
        this.setRotateAngle(cube_r1, 0.0F, 0.0F, 0.829F);
        this.cube_r1.cubeList.add(new ModelBox(cube_r1, 0, 9, 0.0F, 0.0F, -3.0F, 3, 0, 8, 0.0F, true));

        this.cube_r2 = new AdvancedModelRenderer(this);
        this.cube_r2.setRotationPoint(-2.5F, -5.0F, 0.0F);
        this.carapace.addChild(cube_r2);
        this.setRotateAngle(cube_r2, 0.0F, 0.0F, -0.829F);
        this.cube_r2.cubeList.add(new ModelBox(cube_r2, 0, 9, -3.0F, 0.0F, -3.0F, 3, 0, 8, 0.0F, false));

        this.legright1 = new AdvancedModelRenderer(this);
        this.legright1.setRotationPoint(-0.5F, -2.6F, -3.0F);
        this.carapace.addChild(legright1);
        this.setRotateAngle(legright1, 0.3491F, 0.1745F, 0.0F);
        this.legright1.cubeList.add(new ModelBox(legright1, 0, 0, -0.5F, 0.0F, -2.0F, 1, 0, 2, 0.0F, false));

        this.legleft1 = new AdvancedModelRenderer(this);
        this.legleft1.setRotationPoint(0.5F, -2.6F, -3.0F);
        this.carapace.addChild(legleft1);
        this.setRotateAngle(legleft1, 0.3491F, -0.1745F, 0.0F);
        this.legleft1.cubeList.add(new ModelBox(legleft1, 0, 0, -0.5F, 0.0F, -2.0F, 1, 0, 2, 0.0F, true));

        this.legright2 = new AdvancedModelRenderer(this);
        this.legright2.setRotationPoint(-1.5F, -3.0F, -3.0F);
        this.carapace.addChild(legright2);
        this.setRotateAngle(legright2, 0.1745F, 0.2182F, 0.0F);
        this.legright2.cubeList.add(new ModelBox(legright2, 0, 9, -0.5F, 0.0F, -3.0F, 2, 0, 3, 0.0F, false));

        this.legleft2 = new AdvancedModelRenderer(this);
        this.legleft2.setRotationPoint(1.5F, -3.0F, -3.0F);
        this.carapace.addChild(legleft2);
        this.setRotateAngle(legleft2, 0.1745F, -0.2182F, 0.0F);
        this.legleft2.cubeList.add(new ModelBox(legleft2, 0, 9, -1.5F, 0.0F, -3.0F, 2, 0, 3, 0.0F, true));

        this.legright3 = new AdvancedModelRenderer(this);
        this.legright3.setRotationPoint(-2.25F, -2.0F, -2.5F);
        this.carapace.addChild(legright3);
        this.setRotateAngle(legright3, 0.0F, -0.6545F, -0.9163F);
        this.legright3.cubeList.add(new ModelBox(legright3, 0, 12, -2.5F, -0.5F, -0.5F, 3, 1, 1, 0.0F, false));

        this.legleft3 = new AdvancedModelRenderer(this);
        this.legleft3.setRotationPoint(2.25F, -2.0F, -2.5F);
        this.carapace.addChild(legleft3);
        this.setRotateAngle(legleft3, 0.0F, 0.6545F, 0.9163F);
        this.legleft3.cubeList.add(new ModelBox(legleft3, 0, 12, -0.5F, -0.5F, -0.5F, 3, 1, 1, 0.0F, true));

        this.legright4 = new AdvancedModelRenderer(this);
        this.legright4.setRotationPoint(-2.5F, -2.0F, -0.75F);
        this.carapace.addChild(legright4);
        this.setRotateAngle(legright4, 0.0F, 0.0F, -0.48F);
        this.legright4.cubeList.add(new ModelBox(legright4, 0, 21, -3.5F, -0.5F, -0.5F, 4, 1, 1, 0.0F, false));

        this.legleft4 = new AdvancedModelRenderer(this);
        this.legleft4.setRotationPoint(2.5F, -2.0F, -0.75F);
        this.carapace.addChild(legleft4);
        this.setRotateAngle(legleft4, 0.0F, 0.0F, 0.48F);
        this.legleft4.cubeList.add(new ModelBox(legleft4, 0, 21, -0.5F, -0.5F, -0.5F, 4, 1, 1, 0.0F, true));

        this.legright5 = new AdvancedModelRenderer(this);
        this.legright5.setRotationPoint(-2.5F, -2.0F, 1.0F);
        this.carapace.addChild(legright5);
        this.setRotateAngle(legright5, 0.0F, 0.3491F, -0.48F);
        this.legright5.cubeList.add(new ModelBox(legright5, 18, 21, -3.5F, -0.5F, -0.5F, 4, 1, 1, 0.0F, false));

        this.legleft5 = new AdvancedModelRenderer(this);
        this.legleft5.setRotationPoint(2.5F, -2.0F, 1.0F);
        this.carapace.addChild(legleft5);
        this.setRotateAngle(legleft5, 0.0F, -0.3491F, 0.48F);
        this.legleft5.cubeList.add(new ModelBox(legleft5, 18, 21, -0.5F, -0.5F, -0.5F, 4, 1, 1, 0.0F, true));

        this.body1 = new AdvancedModelRenderer(this);
        this.body1.setRotationPoint(0.0F, -4.9F, 3.0F);
        this.carapace.addChild(body1);
        this.setRotateAngle(body1, -0.1745F, 0.0F, 0.0F);
        this.body1.cubeList.add(new ModelBox(body1, 9, 12, -2.5F, 0.0F, 0.0F, 5, 3, 5, 0.01F, false));

        this.body2 = new AdvancedModelRenderer(this);
        this.body2.setRotationPoint(0.0F, 1.0F, 5.0F);
        this.body1.addChild(body2);
        this.body2.cubeList.add(new ModelBox(body2, 16, 0, -1.5F, -1.0F, -0.25F, 3, 3, 3, 0.0F, false));

        this.body3 = new AdvancedModelRenderer(this);
        this.body3.setRotationPoint(0.0F, 1.0F, 2.5F);
        this.body2.addChild(body3);
        this.body3.cubeList.add(new ModelBox(body3, 11, 20, -1.0F, -1.0F, 0.0F, 2, 2, 3, -0.01F, false));

        this.body4 = new AdvancedModelRenderer(this);
        this.body4.setRotationPoint(0.0F, 0.5F, 3.0F);
        this.body3.addChild(body4);
        this.setRotateAngle(body4, 0.1745F, 0.0F, 0.0F);
        this.body4.cubeList.add(new ModelBox(body4, 0, 14, -0.5F, -0.5F, -0.1F, 1, 1, 6, 0.0F, false));

        this.carapacefront = new AdvancedModelRenderer(this);
        this.carapacefront.setRotationPoint(-0.5F, -5.0F, -3.0F);
        this.carapace.addChild(carapacefront);
        this.setRotateAngle(carapacefront, 0.6545F, 0.0F, 0.0F);
        this.carapacefront.cubeList.add(new ModelBox(carapacefront, 11, 9, -2.0F, 0.0F, -3.0F, 5, 0, 3, 0.0F, false));

        this.cube_r3 = new AdvancedModelRenderer(this);
        this.cube_r3.setRotationPoint(3.0F, 0.0F, 0.0F);
        this.carapacefront.addChild(cube_r3);
        this.setRotateAngle(cube_r3, 0.0F, 0.0F, 0.7418F);
        this.cube_r3.cubeList.add(new ModelBox(cube_r3, 19, 6, 0.0F, 0.0F, -3.0F, 2, 0, 3, 0.0F, true));

        this.cube_r4 = new AdvancedModelRenderer(this);
        this.cube_r4.setRotationPoint(-2.0F, 0.0F, 0.0F);
        this.carapacefront.addChild(cube_r4);
        this.setRotateAngle(cube_r4, 0.0F, 0.0F, -0.7418F);
        this.cube_r4.cubeList.add(new ModelBox(cube_r4, 19, 6, -2.0F, 0.0F, -3.0F, 2, 0, 3, 0.0F, false));

        updateDefaultPose();
        animator = ModelAnimator.create();
    }

    @Override
    public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        this.carapace.render(f5);
    }
    public void renderStatic(float f) {
        //GlStateManager.pushMatrix();
        //GlStateManager.enableBlend();
        //GlStateManager.blendFunc(GlStateManager.SourceFactor.SRC_ALPHA, GlStateManager.DestFactor.ONE_MINUS_SRC_ALPHA);
        //GlStateManager.disableCull();
        this.carapace.offsetZ = -0.6F;
        this.carapace.render(0.1F);
        //GlStateManager.enableCull();
        //GlStateManager.disableBlend();
        //GlStateManager.popMatrix();
    }
    @Override
    public void renderStaticBook(float f) {
        //Rotations, positions and sizing:
        this.carapace.offsetY = -0.2F;
        this.carapace.offsetX = 0.1F;
        this.carapace.offsetZ = 2.0F;
        this.carapace.rotateAngleY = (float)Math.toRadians(120);
        this.carapace.rotateAngleX = (float)Math.toRadians(1);
        this.carapace.rotateAngleZ = (float)Math.toRadians(0);
        this.carapace.scaleChildren = true;
        float scaler = 0.6F;
        this.carapace.setScale(scaler, scaler, scaler);
        //Start of pose:
        this.setRotateAngle(carapace, 0.6F, 3.8F, -0.2F);
        //End of pose, now render the model:
        this.carapace.render(f);
        //Reset rotations, positions and sizing:
        this.carapace.setScale(1.0F, 1.0F, 1.0F);
        this.carapace.scaleChildren = false;
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
        EntityPrehistoricFloraCampylocephalus ee = (EntityPrehistoricFloraCampylocephalus) entitylivingbaseIn;
        //Swimming pose:
        if (ee.isReallyInWater() ) {//swimming
            if (ee.getIsMoving()) {
                if(ee instanceof EntityPrehistoricFloraCampylocephalus) {
                    animWalking(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime, false);
                } else {
                    if(ee.getIsFast()) {//fast
                        animWalking(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime, false);
                    } else {//slow
                        animWalking(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime, false);
                    }
                }
            } else {
                animWalking(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime, true);
            }

        }
        else {
            //land pose:
            if (!ee.getIsMoving()) { //static on land
                if(ee instanceof EntityPrehistoricFloraCampylocephalus) {
                    animWalkingLand(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime, true);
                }
            }
            else {
                //moving on land
                if(ee instanceof EntityPrehistoricFloraCampylocephalus) {
                    animWalkingLand(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime, false);
                }
            }
        }
    }

    public void animWalking(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime, boolean isStatic) {
        EntityPrehistoricFloraCampylocephalus entity = (EntityPrehistoricFloraCampylocephalus) entitylivingbaseIn;
        int animCycle = 60;
        double tickAnim = (entity.ticksExisted + entity.getTickOffset()) - (int) (Math.floor((double) (entity.ticksExisted + entity.getTickOffset()) / (double) animCycle) * (double) animCycle) + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;
        this.setRotateAngle(carapace, carapace.rotateAngleX + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*60/0.25-60))*3), carapace.rotateAngleY + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*30/0.25))*5), carapace.rotateAngleZ + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*60/0.25))*3));


        this.setRotateAngle(legright1, legright1.rotateAngleX + (float) Math.toRadians(0), legright1.rotateAngleY + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*90/0.25))*5), legright1.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(legleft1, legleft1.rotateAngleX + (float) Math.toRadians(0), legleft1.rotateAngleY + (float) Math.toRadians(-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*90/0.25-60))*5), legleft1.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(legright2, legright2.rotateAngleX + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180/0.25-60))*5), legright2.rotateAngleY + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180/0.25))*5), legright2.rotateAngleZ + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180/0.25-60))*10));


        this.setRotateAngle(legleft2, legleft2.rotateAngleX + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180/0.25-60*5))*5), legleft2.rotateAngleY + (float) Math.toRadians(-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180/0.25-60*3))*5), legleft2.rotateAngleZ + (float) Math.toRadians(-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180/0.25-60*4))*10));



         if (tickAnim >= 0 && tickAnim < 10) {
        xx = 27.18439 + (((tickAnim - 0) / 10) * (-35.86054-(27.18439)));
        yy = -10.85221 + (((tickAnim - 0) / 10) * (34.33593-(-10.85221)));
        zz = -18.78424 + (((tickAnim - 0) / 10) * (13.42258-(-18.78424)));
    }
        else if (tickAnim >= 10 && tickAnim < 16) {
        xx = -35.86054 + (((tickAnim - 10) / 6) * (0.91567-(-35.86054)));
        yy = 34.33593 + (((tickAnim - 10) / 6) * (7.97618-(34.33593)));
        zz = 13.42258 + (((tickAnim - 10) / 6) * (39.63527-(13.42258)));
        }
        else if (tickAnim >= 16 && tickAnim < 20) {
        xx = 0.91567 + (((tickAnim - 16) / 4) * (27.18439-(0.91567)));
        yy = 7.97618 + (((tickAnim - 16) / 4) * (-10.85221-(7.97618)));
        zz = 39.63527 + (((tickAnim - 16) / 4) * (-18.78424-(39.63527)));
        }
        else if (tickAnim >= 20 && tickAnim < 30) {
        xx = 27.18439 + (((tickAnim - 20) / 10) * (-35.86054-(27.18439)));
        yy = -10.85221 + (((tickAnim - 20) / 10) * (34.33593-(-10.85221)));
        zz = -18.78424 + (((tickAnim - 20) / 10) * (13.42258-(-18.78424)));
        }
        else if (tickAnim >= 30 && tickAnim < 36) {
        xx = -35.86054 + (((tickAnim - 30) / 6) * (0.91567-(-35.86054)));
        yy = 34.33593 + (((tickAnim - 30) / 6) * (7.97618-(34.33593)));
        zz = 13.42258 + (((tickAnim - 30) / 6) * (39.63527-(13.42258)));
        }
        else if (tickAnim >= 36 && tickAnim < 40) {
        xx = 0.91567 + (((tickAnim - 36) / 4) * (27.18439-(0.91567)));
        yy = 7.97618 + (((tickAnim - 36) / 4) * (-10.85221-(7.97618)));
        zz = 39.63527 + (((tickAnim - 36) / 4) * (-18.78424-(39.63527)));
        }
        else if (tickAnim >= 40 && tickAnim < 50) {
        xx = 27.18439 + (((tickAnim - 40) / 10) * (-35.86054-(27.18439)));
        yy = -10.85221 + (((tickAnim - 40) / 10) * (34.33593-(-10.85221)));
        zz = -18.78424 + (((tickAnim - 40) / 10) * (13.42258-(-18.78424)));
        }
        else if (tickAnim >= 50 && tickAnim < 56) {
        xx = -35.86054 + (((tickAnim - 50) / 6) * (0.91567-(-35.86054)));
        yy = 34.33593 + (((tickAnim - 50) / 6) * (7.97618-(34.33593)));
        zz = 13.42258 + (((tickAnim - 50) / 6) * (39.63527-(13.42258)));
        }
        else if (tickAnim >= 56 && tickAnim < 60) {
        xx = 0.91567 + (((tickAnim - 56) / 4) * (27.18439-(0.91567)));
        yy = 7.97618 + (((tickAnim - 56) / 4) * (-10.85221-(7.97618)));
        zz = 39.63527 + (((tickAnim - 56) / 4) * (-18.78424-(39.63527)));
        }
        else {
        xx = 0;
        yy = 0;
        zz = 0;
        }
        this.setRotateAngle(legright3, legright3.rotateAngleX + (float) Math.toRadians(xx), legright3.rotateAngleY + (float) Math.toRadians(yy), legright3.rotateAngleZ + (float) Math.toRadians(zz));




         if (tickAnim >= 0 && tickAnim < 5) {
        xx = -30.61 + (((tickAnim - 0) / 5) * (0.91567-(-30.61)));
        yy = -30.57 + (((tickAnim - 0) / 5) * (-7.97618-(-30.57)));
        zz = -17.17 + (((tickAnim - 0) / 5) * (-39.63527-(-17.17)));
        }
        else if (tickAnim >= 5 && tickAnim < 9) {
        xx = 0.91567 + (((tickAnim - 5) / 4) * (27.18439-(0.91567)));
        yy = -7.97618 + (((tickAnim - 5) / 4) * (10.85221-(-7.97618)));
        zz = -39.63527 + (((tickAnim - 5) / 4) * (18.78424-(-39.63527)));
        }
        else if (tickAnim >= 9 && tickAnim < 19) {
        xx = 27.18439 + (((tickAnim - 9) / 10) * (-35.86054-(27.18439)));
        yy = 10.85221 + (((tickAnim - 9) / 10) * (-34.33593-(10.85221)));
        zz = 18.78424 + (((tickAnim - 9) / 10) * (-13.42258-(18.78424)));
        }
        else if (tickAnim >= 19 && tickAnim < 25) {
        xx = -35.86054 + (((tickAnim - 19) / 6) * (0.91567-(-35.86054)));
        yy = -34.33593 + (((tickAnim - 19) / 6) * (-7.97618-(-34.33593)));
        zz = -13.42258 + (((tickAnim - 19) / 6) * (-39.63527-(-13.42258)));
        }
        else if (tickAnim >= 25 && tickAnim < 29) {
        xx = 0.91567 + (((tickAnim - 25) / 4) * (27.18439-(0.91567)));
        yy = -7.97618 + (((tickAnim - 25) / 4) * (10.85221-(-7.97618)));
        zz = -39.63527 + (((tickAnim - 25) / 4) * (18.78424-(-39.63527)));
        }
        else if (tickAnim >= 29 && tickAnim < 39) {
        xx = 27.18439 + (((tickAnim - 29) / 10) * (-35.86054-(27.18439)));
        yy = 10.85221 + (((tickAnim - 29) / 10) * (-34.33593-(10.85221)));
        zz = 18.78424 + (((tickAnim - 29) / 10) * (-13.42258-(18.78424)));
        }
        else if (tickAnim >= 39 && tickAnim < 45) {
        xx = -35.86054 + (((tickAnim - 39) / 6) * (0.91567-(-35.86054)));
        yy = -34.33593 + (((tickAnim - 39) / 6) * (-7.97618-(-34.33593)));
        zz = -13.42258 + (((tickAnim - 39) / 6) * (-39.63527-(-13.42258)));
        }
        else if (tickAnim >= 45 && tickAnim < 49) {
        xx = 0.91567 + (((tickAnim - 45) / 4) * (27.18439-(0.91567)));
        yy = -7.97618 + (((tickAnim - 45) / 4) * (10.85221-(-7.97618)));
        zz = -39.63527 + (((tickAnim - 45) / 4) * (18.78424-(-39.63527)));
        }
        else if (tickAnim >= 49 && tickAnim < 59) {
        xx = 27.18439 + (((tickAnim - 49) / 10) * (-35.86054-(27.18439)));
        yy = 10.85221 + (((tickAnim - 49) / 10) * (-34.33593-(10.85221)));
        zz = 18.78424 + (((tickAnim - 49) / 10) * (-13.42258-(18.78424)));
        }
        else if (tickAnim >= 59 && tickAnim < 60) {
        xx = -35.86054 + (((tickAnim - 59) / 1) * (-30.61-(-35.86054)));
        yy = -34.33593 + (((tickAnim - 59) / 1) * (-30.57-(-34.33593)));
        zz = -13.42258 + (((tickAnim - 59) / 1) * (-17.17-(-13.42258)));
        }
        else {
        xx = 0;
        yy = 0;
        zz = 0;
        }
        this.setRotateAngle(legleft3, legleft3.rotateAngleX + (float) Math.toRadians(xx), legleft3.rotateAngleY + (float) Math.toRadians(yy), legleft3.rotateAngleZ + (float) Math.toRadians(zz));




         if (tickAnim >= 0 && tickAnim < 3) {
        xx = -3.61 + (((tickAnim - 0) / 3) * (1.80463-(-3.61)));
        yy = 6.61 + (((tickAnim - 0) / 3) * (-3.30717-(6.61)));
        zz = 10.96 + (((tickAnim - 0) / 3) * (20.60058-(10.96)));
        }
        else if (tickAnim >= 3 && tickAnim < 7) {
        xx = 1.80463 + (((tickAnim - 3) / 4) * (10.82777-(1.80463)));
        yy = -3.30717 + (((tickAnim - 3) / 4) * (-19.84302-(-3.30717)));
        zz = 20.60058 + (((tickAnim - 3) / 4) * (-1.89944-(20.60058)));
        }
        else if (tickAnim >= 7 && tickAnim < 17) {
        xx = 10.82777 + (((tickAnim - 7) / 10) * (-10.82776-(10.82777)));
        yy = -19.84302 + (((tickAnim - 7) / 10) * (19.84303-(-19.84302)));
        zz = -1.89944 + (((tickAnim - 7) / 10) * (-1.8994-(-1.89944)));
        }
        else if (tickAnim >= 17 && tickAnim < 23) {
        xx = -10.82776 + (((tickAnim - 17) / 6) * (1.80463-(-10.82776)));
        yy = 19.84303 + (((tickAnim - 17) / 6) * (-3.30717-(19.84303)));
        zz = -1.8994 + (((tickAnim - 17) / 6) * (20.60058-(-1.8994)));
        }
        else if (tickAnim >= 23 && tickAnim < 27) {
        xx = 1.80463 + (((tickAnim - 23) / 4) * (10.82777-(1.80463)));
        yy = -3.30717 + (((tickAnim - 23) / 4) * (-19.84302-(-3.30717)));
        zz = 20.60058 + (((tickAnim - 23) / 4) * (-1.89944-(20.60058)));
        }
        else if (tickAnim >= 27 && tickAnim < 37) {
        xx = 10.82777 + (((tickAnim - 27) / 10) * (-10.82776-(10.82777)));
        yy = -19.84302 + (((tickAnim - 27) / 10) * (19.84303-(-19.84302)));
        zz = -1.89944 + (((tickAnim - 27) / 10) * (-1.8994-(-1.89944)));
        }
        else if (tickAnim >= 37 && tickAnim < 43) {
        xx = -10.82776 + (((tickAnim - 37) / 6) * (1.80463-(-10.82776)));
        yy = 19.84303 + (((tickAnim - 37) / 6) * (-3.30717-(19.84303)));
        zz = -1.8994 + (((tickAnim - 37) / 6) * (20.60058-(-1.8994)));
        }
        else if (tickAnim >= 43 && tickAnim < 47) {
        xx = 1.80463 + (((tickAnim - 43) / 4) * (10.82777-(1.80463)));
        yy = -3.30717 + (((tickAnim - 43) / 4) * (-19.84302-(-3.30717)));
        zz = 20.60058 + (((tickAnim - 43) / 4) * (-1.89944-(20.60058)));
        }
        else if (tickAnim >= 47 && tickAnim < 57) {
        xx = 10.82777 + (((tickAnim - 47) / 10) * (-10.82776-(10.82777)));
        yy = -19.84302 + (((tickAnim - 47) / 10) * (19.84303-(-19.84302)));
        zz = -1.89944 + (((tickAnim - 47) / 10) * (-1.8994-(-1.89944)));
        }
        else if (tickAnim >= 57 && tickAnim < 60) {
        xx = -10.82776 + (((tickAnim - 57) / 3) * (-3.61-(-10.82776)));
        yy = 19.84303 + (((tickAnim - 57) / 3) * (6.61-(19.84303)));
        zz = -1.8994 + (((tickAnim - 57) / 3) * (10.96-(-1.8994)));
        }
        else {
        xx = 0;
        yy = 0;
        zz = 0;
        }
        this.setRotateAngle(legright4, legright4.rotateAngleX + (float) Math.toRadians(xx), legright4.rotateAngleY + (float) Math.toRadians(yy), legright4.rotateAngleZ + (float) Math.toRadians(zz));




         if (tickAnim >= 0 && tickAnim < 6) {
        xx = 1.8 + (((tickAnim - 0) / 6) * (-10.82776-(1.8)));
        yy = 3.31 + (((tickAnim - 0) / 6) * (-19.84303-(3.31)));
        zz = 1.9 + (((tickAnim - 0) / 6) * (1.8994-(1.9)));
        }
        else if (tickAnim >= 6 && tickAnim < 12) {
        xx = -10.82776 + (((tickAnim - 6) / 6) * (1.80463-(-10.82776)));
        yy = -19.84303 + (((tickAnim - 6) / 6) * (3.30717-(-19.84303)));
        zz = 1.8994 + (((tickAnim - 6) / 6) * (-20.60058-(1.8994)));
        }
        else if (tickAnim >= 12 && tickAnim < 16) {
        xx = 1.80463 + (((tickAnim - 12) / 4) * (10.82777-(1.80463)));
        yy = 3.30717 + (((tickAnim - 12) / 4) * (19.84302-(3.30717)));
        zz = -20.60058 + (((tickAnim - 12) / 4) * (1.89944-(-20.60058)));
        }
        else if (tickAnim >= 16 && tickAnim < 26) {
        xx = 10.82777 + (((tickAnim - 16) / 10) * (-10.82776-(10.82777)));
        yy = 19.84302 + (((tickAnim - 16) / 10) * (-19.84303-(19.84302)));
        zz = 1.89944 + (((tickAnim - 16) / 10) * (1.8994-(1.89944)));
        }
        else if (tickAnim >= 26 && tickAnim < 32) {
        xx = -10.82776 + (((tickAnim - 26) / 6) * (1.80463-(-10.82776)));
        yy = -19.84303 + (((tickAnim - 26) / 6) * (3.30717-(-19.84303)));
        zz = 1.8994 + (((tickAnim - 26) / 6) * (-20.60058-(1.8994)));
        }
        else if (tickAnim >= 32 && tickAnim < 36) {
        xx = 1.80463 + (((tickAnim - 32) / 4) * (10.82777-(1.80463)));
        yy = 3.30717 + (((tickAnim - 32) / 4) * (19.84302-(3.30717)));
        zz = -20.60058 + (((tickAnim - 32) / 4) * (1.89944-(-20.60058)));
        }
        else if (tickAnim >= 36 && tickAnim < 46) {
        xx = 10.82777 + (((tickAnim - 36) / 10) * (-10.82776-(10.82777)));
        yy = 19.84302 + (((tickAnim - 36) / 10) * (-19.84303-(19.84302)));
        zz = 1.89944 + (((tickAnim - 36) / 10) * (1.8994-(1.89944)));
        }
        else if (tickAnim >= 46 && tickAnim < 52) {
        xx = -10.82776 + (((tickAnim - 46) / 6) * (1.80463-(-10.82776)));
        yy = -19.84303 + (((tickAnim - 46) / 6) * (3.30717-(-19.84303)));
        zz = 1.8994 + (((tickAnim - 46) / 6) * (-20.60058-(1.8994)));
        }
        else if (tickAnim >= 52 && tickAnim < 56) {
        xx = 1.80463 + (((tickAnim - 52) / 4) * (10.82777-(1.80463)));
        yy = 3.30717 + (((tickAnim - 52) / 4) * (19.84302-(3.30717)));
        zz = -20.60058 + (((tickAnim - 52) / 4) * (1.89944-(-20.60058)));
        }
        else if (tickAnim >= 56 && tickAnim < 60) {
        xx = 10.82777 + (((tickAnim - 56) / 4) * (1.8-(10.82777)));
        yy = 19.84302 + (((tickAnim - 56) / 4) * (3.31-(19.84302)));
        zz = 1.89944 + (((tickAnim - 56) / 4) * (1.9-(1.89944)));
        }
        else {
        xx = 0;
        yy = 0;
        zz = 0;
        }
        this.setRotateAngle(legleft4, legleft4.rotateAngleX + (float) Math.toRadians(xx), legleft4.rotateAngleY + (float) Math.toRadians(yy), legleft4.rotateAngleZ + (float) Math.toRadians(zz));




         if (tickAnim >= 0 && tickAnim < 7) {
        xx = 2.38 + (((tickAnim - 0) / 7) * (-13.22224-(2.38)));
        yy = -6.98 + (((tickAnim - 0) / 7) * (19.41693-(-6.98)));
        zz = -1.03 + (((tickAnim - 0) / 7) * (-6.67007-(-1.03)));
        }
        else if (tickAnim >= 7 && tickAnim < 13) {
        xx = -13.22224 + (((tickAnim - 7) / 6) * (0.42782-(-13.22224)));
        yy = 19.41693 + (((tickAnim - 7) / 6) * (-3.67614-(19.41693)));
        zz = -6.67007 + (((tickAnim - 7) / 6) * (20.76172-(-6.67007)));
        }
        else if (tickAnim >= 13 && tickAnim < 17) {
        xx = 0.42782 + (((tickAnim - 13) / 4) * (10.17786-(0.42782)));
        yy = -3.67614 + (((tickAnim - 13) / 4) * (-20.17119-(-3.67614)));
        zz = 20.76172 + (((tickAnim - 13) / 4) * (1.78442-(20.76172)));
        }
        else if (tickAnim >= 17 && tickAnim < 27) {
        xx = 10.17786 + (((tickAnim - 17) / 10) * (-13.22224-(10.17786)));
        yy = -20.17119 + (((tickAnim - 17) / 10) * (19.41693-(-20.17119)));
        zz = 1.78442 + (((tickAnim - 17) / 10) * (-6.67007-(1.78442)));
        }
        else if (tickAnim >= 27 && tickAnim < 33) {
        xx = -13.22224 + (((tickAnim - 27) / 6) * (0.42782-(-13.22224)));
        yy = 19.41693 + (((tickAnim - 27) / 6) * (-3.67614-(19.41693)));
        zz = -6.67007 + (((tickAnim - 27) / 6) * (20.76172-(-6.67007)));
        }
        else if (tickAnim >= 33 && tickAnim < 37) {
        xx = 0.42782 + (((tickAnim - 33) / 4) * (10.17786-(0.42782)));
        yy = -3.67614 + (((tickAnim - 33) / 4) * (-20.17119-(-3.67614)));
        zz = 20.76172 + (((tickAnim - 33) / 4) * (1.78442-(20.76172)));
        }
        else if (tickAnim >= 37 && tickAnim < 47) {
        xx = 10.17786 + (((tickAnim - 37) / 10) * (-13.22224-(10.17786)));
        yy = -20.17119 + (((tickAnim - 37) / 10) * (19.41693-(-20.17119)));
        zz = 1.78442 + (((tickAnim - 37) / 10) * (-6.67007-(1.78442)));
        }
        else if (tickAnim >= 47 && tickAnim < 53) {
        xx = -13.22224 + (((tickAnim - 47) / 6) * (0.42782-(-13.22224)));
        yy = 19.41693 + (((tickAnim - 47) / 6) * (-3.67614-(19.41693)));
        zz = -6.67007 + (((tickAnim - 47) / 6) * (20.76172-(-6.67007)));
        }
        else if (tickAnim >= 53 && tickAnim < 57) {
        xx = 0.42782 + (((tickAnim - 53) / 4) * (10.17786-(0.42782)));
        yy = -3.67614 + (((tickAnim - 53) / 4) * (-20.17119-(-3.67614)));
        zz = 20.76172 + (((tickAnim - 53) / 4) * (1.78442-(20.76172)));
        }
        else if (tickAnim >= 57 && tickAnim < 60) {
        xx = 10.17786 + (((tickAnim - 57) / 3) * (2.38-(10.17786)));
        yy = -20.17119 + (((tickAnim - 57) / 3) * (-6.98-(-20.17119)));
        zz = 1.78442 + (((tickAnim - 57) / 3) * (-1.03-(1.78442)));
        }
        else {
        xx = 0;
        yy = 0;
        zz = 0;
        }
        this.setRotateAngle(legright5, legright5.rotateAngleX + (float) Math.toRadians(xx), legright5.rotateAngleY + (float) Math.toRadians(yy), legright5.rotateAngleZ + (float) Math.toRadians(zz));




         if (tickAnim >= 0 && tickAnim < 3) {
        xx = -7.37 + (((tickAnim - 0) / 3) * (0.42782-(-7.37)));
        yy = -9.52 + (((tickAnim - 0) / 3) * (3.67614-(-9.52)));
        zz = -5.09 + (((tickAnim - 0) / 3) * (-20.76172-(-5.09)));
        }
        else if (tickAnim >= 3 && tickAnim < 8) {
        xx = 0.42782 + (((tickAnim - 3) / 5) * (10.17786-(0.42782)));
        yy = 3.67614 + (((tickAnim - 3) / 5) * (20.17119-(3.67614)));
        zz = -20.76172 + (((tickAnim - 3) / 5) * (-1.78442-(-20.76172)));
        }
        else if (tickAnim >= 8 && tickAnim < 18) {
        xx = 10.17786 + (((tickAnim - 8) / 10) * (-13.22224-(10.17786)));
        yy = 20.17119 + (((tickAnim - 8) / 10) * (-19.41693-(20.17119)));
        zz = -1.78442 + (((tickAnim - 8) / 10) * (6.67007-(-1.78442)));
        }
        else if (tickAnim >= 18 && tickAnim < 23) {
        xx = -13.22224 + (((tickAnim - 18) / 5) * (0.42782-(-13.22224)));
        yy = -19.41693 + (((tickAnim - 18) / 5) * (3.67614-(-19.41693)));
        zz = 6.67007 + (((tickAnim - 18) / 5) * (-20.76172-(6.67007)));
        }
        else if (tickAnim >= 23 && tickAnim < 28) {
        xx = 0.42782 + (((tickAnim - 23) / 5) * (10.17786-(0.42782)));
        yy = 3.67614 + (((tickAnim - 23) / 5) * (20.17119-(3.67614)));
        zz = -20.76172 + (((tickAnim - 23) / 5) * (-1.78442-(-20.76172)));
        }
        else if (tickAnim >= 28 && tickAnim < 38) {
        xx = 10.17786 + (((tickAnim - 28) / 10) * (-13.22224-(10.17786)));
        yy = 20.17119 + (((tickAnim - 28) / 10) * (-19.41693-(20.17119)));
        zz = -1.78442 + (((tickAnim - 28) / 10) * (6.67007-(-1.78442)));
        }
        else if (tickAnim >= 38 && tickAnim < 43) {
        xx = -13.22224 + (((tickAnim - 38) / 5) * (0.42782-(-13.22224)));
        yy = -19.41693 + (((tickAnim - 38) / 5) * (3.67614-(-19.41693)));
        zz = 6.67007 + (((tickAnim - 38) / 5) * (-20.76172-(6.67007)));
        }
        else if (tickAnim >= 43 && tickAnim < 48) {
        xx = 0.42782 + (((tickAnim - 43) / 5) * (10.17786-(0.42782)));
        yy = 3.67614 + (((tickAnim - 43) / 5) * (20.17119-(3.67614)));
        zz = -20.76172 + (((tickAnim - 43) / 5) * (-1.78442-(-20.76172)));
        }
        else if (tickAnim >= 48 && tickAnim < 58) {
        xx = 10.17786 + (((tickAnim - 48) / 10) * (-13.22224-(10.17786)));
        yy = 20.17119 + (((tickAnim - 48) / 10) * (-19.41693-(20.17119)));
        zz = -1.78442 + (((tickAnim - 48) / 10) * (6.67007-(-1.78442)));
        }
        else if (tickAnim >= 58 && tickAnim < 60) {
        xx = -13.22224 + (((tickAnim - 58) / 2) * (-7.37-(-13.22224)));
        yy = -19.41693 + (((tickAnim - 58) / 2) * (-9.52-(-19.41693)));
        zz = 6.67007 + (((tickAnim - 58) / 2) * (-5.09-(6.67007)));
        }
        else {
        xx = 0;
        yy = 0;
        zz = 0;
        }
        this.setRotateAngle(legleft5, legleft5.rotateAngleX + (float) Math.toRadians(xx), legleft5.rotateAngleY + (float) Math.toRadians(yy), legleft5.rotateAngleZ + (float) Math.toRadians(zz));



        this.setRotateAngle(body1, body1.rotateAngleX + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*60/0.25-300))*1), body1.rotateAngleY + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*30/0.25-60))*5), body1.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(body2, body2.rotateAngleX + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*60/0.25-60*3))*3), body2.rotateAngleY + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*30/0.25-60*2))*5), body2.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(body3, body3.rotateAngleX + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*60/0.25-60*4))*3), body3.rotateAngleY + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*30/0.25-60*3))*5), body3.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(body4, body4.rotateAngleX + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*60/0.25-60*5))*3), body4.rotateAngleY + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*30/0.25-60*4))*5), body4.rotateAngleZ + (float) Math.toRadians(0));
    }

    public void animWalkingLand(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime, boolean isStatic) {
        EntityPrehistoricFloraCampylocephalus entity = (EntityPrehistoricFloraCampylocephalus) entitylivingbaseIn;
        int animCycle = 40;
        double tickAnim = (entity.ticksExisted + entity.getTickOffset()) - (int) (Math.floor((double) (entity.ticksExisted + entity.getTickOffset()) / (double) animCycle) * (double) animCycle) + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;

         if (tickAnim >= 0 && tickAnim < 8) {
        xx = 0 + (((tickAnim - 0) / 8) * (4.99527-(0)));
        yy = 0 + (((tickAnim - 0) / 8) * (0.21782-(0)));
        zz = 5 + (((tickAnim - 0) / 8) * (-1.65717-(5)));
    }
            else if (tickAnim >= 8 && tickAnim < 20) {
    xx = 4.99527 + (((tickAnim - 8) / 12) * (0-(4.99527)));
    yy = 0.21782 + (((tickAnim - 8) / 12) * (0-(0.21782)));
    zz = -1.65717 + (((tickAnim - 8) / 12) * (-5-(-1.65717)));
}
        else if (tickAnim >= 20 && tickAnim < 30) {
        xx = 0 + (((tickAnim - 20) / 10) * (-2.5-(0)));
        yy = 0 + (((tickAnim - 20) / 10) * (0-(0)));
        zz = -5 + (((tickAnim - 20) / 10) * (0-(-5)));
        }
        else if (tickAnim >= 30 && tickAnim < 40) {
        xx = -2.5 + (((tickAnim - 30) / 10) * (0-(-2.5)));
        yy = 0 + (((tickAnim - 30) / 10) * (0-(0)));
        zz = 0 + (((tickAnim - 30) / 10) * (5-(0)));
        }
        else {
        xx = 0;
        yy = 0;
        zz = 0;
        }
        this.setRotateAngle(carapace, carapace.rotateAngleX + (float) Math.toRadians(xx), carapace.rotateAngleY + (float) Math.toRadians(yy), carapace.rotateAngleZ + (float) Math.toRadians(zz));


         if (tickAnim >= 0 && tickAnim < 5) {
        xx = 0 + (((tickAnim - 0) / 5) * (0-(0)));
        yy = 0 + (((tickAnim - 0) / 5) * (0-(0)));
        zz = 0 + (((tickAnim - 0) / 5) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 8) {
        xx = 0 + (((tickAnim - 5) / 3) * (0-(0)));
        yy = 0 + (((tickAnim - 5) / 3) * (-0.4-(0)));
        zz = 0 + (((tickAnim - 5) / 3) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 20) {
        xx = 0 + (((tickAnim - 8) / 12) * (0-(0)));
        yy = -0.4 + (((tickAnim - 8) / 12) * (0-(-0.4)));
        zz = 0 + (((tickAnim - 8) / 12) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 27) {
        xx = 0 + (((tickAnim - 20) / 7) * (0-(0)));
        yy = 0 + (((tickAnim - 20) / 7) * (0-(0)));
        zz = 0 + (((tickAnim - 20) / 7) * (0-(0)));
        }
        else if (tickAnim >= 27 && tickAnim < 30) {
        xx = 0 + (((tickAnim - 27) / 3) * (0-(0)));
        yy = 0 + (((tickAnim - 27) / 3) * (-0.4-(0)));
        zz = 0 + (((tickAnim - 27) / 3) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 40) {
        xx = 0 + (((tickAnim - 30) / 10) * (0-(0)));
        yy = -0.4 + (((tickAnim - 30) / 10) * (0-(-0.4)));
        zz = 0 + (((tickAnim - 30) / 10) * (0-(0)));
        }
        else {
        xx = 0;
        yy = 0;
        zz = 0;
        }
        this.carapace.rotationPointX = this.carapace.rotationPointX + (float)(xx);
        this.carapace.rotationPointY = this.carapace.rotationPointY - (float)(yy);
        this.carapace.rotationPointZ = this.carapace.rotationPointZ + (float)(zz);




         if (tickAnim >= 0 && tickAnim < 8) {
        xx = 44.18534 + (((tickAnim - 0) / 8) * (12.70635-(44.18534)));
        yy = -1.989 + (((tickAnim - 0) / 8) * (0.23008-(-1.989)));
        zz = -20.78145 + (((tickAnim - 0) / 8) * (27.46825-(-20.78145)));
        }
        else if (tickAnim >= 8 && tickAnim < 13) {
        xx = 12.70635 + (((tickAnim - 8) / 5) * (8.75739-(12.70635)));
        yy = 0.23008 + (((tickAnim - 8) / 5) * (8.47423-(0.23008)));
        zz = 27.46825 + (((tickAnim - 8) / 5) * (29.47282-(27.46825)));
        }
        else if (tickAnim >= 13 && tickAnim < 23) {
        xx = 8.75739 + (((tickAnim - 13) / 10) * (5.96108-(8.75739)));
        yy = 8.47423 + (((tickAnim - 13) / 10) * (31.45547-(8.47423)));
        zz = 29.47282 + (((tickAnim - 13) / 10) * (17.7525-(29.47282)));
        }
        else if (tickAnim >= 23 && tickAnim < 30) {
        xx = 5.96108 + (((tickAnim - 23) / 7) * (2.88419-(5.96108)));
        yy = 31.45547 + (((tickAnim - 23) / 7) * (44.42618-(31.45547)));
        zz = 17.7525 + (((tickAnim - 23) / 7) * (22.67458-(17.7525)));
        }
        else if (tickAnim >= 30 && tickAnim < 35) {
        xx = 2.88419 + (((tickAnim - 30) / 5) * (6.10846-(2.88419)));
        yy = 44.42618 + (((tickAnim - 30) / 5) * (9.59969-(44.42618)));
        zz = 22.67458 + (((tickAnim - 30) / 5) * (46.63534-(22.67458)));
        }
        else if (tickAnim >= 35 && tickAnim < 40) {
        xx = 6.10846 + (((tickAnim - 35) / 5) * (44.18534-(6.10846)));
        yy = 9.59969 + (((tickAnim - 35) / 5) * (-1.989-(9.59969)));
        zz = 46.63534 + (((tickAnim - 35) / 5) * (-20.78145-(46.63534)));
        }
        else {
        xx = 0;
        yy = 0;
        zz = 0;
        }
        this.setRotateAngle(legright3, legright3.rotateAngleX + (float) Math.toRadians(xx), legright3.rotateAngleY + (float) Math.toRadians(yy), legright3.rotateAngleZ + (float) Math.toRadians(zz));




         if (tickAnim >= 0 && tickAnim < 5) {
        xx = 0 + (((tickAnim - 0) / 5) * (-2.647-(0)));
        yy = 0 + (((tickAnim - 0) / 5) * (5.8405-(0)));
        zz = -10 + (((tickAnim - 0) / 5) * (0.19894-(-10)));
        }
        else if (tickAnim >= 5 && tickAnim < 8) {
        xx = -2.647 + (((tickAnim - 5) / 3) * (-3.80759-(-2.647)));
        yy = 5.8405 + (((tickAnim - 5) / 3) * (9.98521-(5.8405)));
        zz = 0.19894 + (((tickAnim - 5) / 3) * (12.85737-(0.19894)));
        }
        else if (tickAnim >= 8 && tickAnim < 17) {
        xx = -3.80759 + (((tickAnim - 8) / 9) * (-11.78031-(-3.80759)));
        yy = 9.98521 + (((tickAnim - 8) / 9) * (17.84852-(9.98521)));
        zz = 12.85737 + (((tickAnim - 8) / 9) * (10.46013-(12.85737)));
        }
        else if (tickAnim >= 17 && tickAnim < 22) {
        xx = -11.78031 + (((tickAnim - 17) / 5) * (-6.68442-(-11.78031)));
        yy = 17.84852 + (((tickAnim - 17) / 5) * (-6.14936-(17.84852)));
        zz = 10.46013 + (((tickAnim - 17) / 5) * (27.13538-(10.46013)));
        }
        else if (tickAnim >= 22 && tickAnim < 28) {
        xx = -6.68442 + (((tickAnim - 22) / 6) * (-5.54163-(-6.68442)));
        yy = -6.14936 + (((tickAnim - 22) / 6) * (-12.85208-(-6.14936)));
        zz = 27.13538 + (((tickAnim - 22) / 6) * (1.96907-(27.13538)));
        }
        else if (tickAnim >= 28 && tickAnim < 30) {
        xx = -5.54163 + (((tickAnim - 28) / 2) * (-5.82957-(-5.54163)));
        yy = -12.85208 + (((tickAnim - 28) / 2) * (-9.56493-(-12.85208)));
        zz = 1.96907 + (((tickAnim - 28) / 2) * (7.66436-(1.96907)));
        }
        else if (tickAnim >= 30 && tickAnim < 40) {
        xx = -5.82957 + (((tickAnim - 30) / 10) * (0-(-5.82957)));
        yy = -9.56493 + (((tickAnim - 30) / 10) * (0-(-9.56493)));
        zz = 7.66436 + (((tickAnim - 30) / 10) * (-10-(7.66436)));
        }
        else {
        xx = 0;
        yy = 0;
        zz = 0;
        }
        this.setRotateAngle(legright4, legright4.rotateAngleX + (float) Math.toRadians(xx), legright4.rotateAngleY + (float) Math.toRadians(yy), legright4.rotateAngleZ + (float) Math.toRadians(zz));




         if (tickAnim >= 0 && tickAnim < 5) {
        xx = -24.29654 + (((tickAnim - 0) / 5) * (-6.40119-(-24.29654)));
        yy = 21.07931 + (((tickAnim - 0) / 5) * (6.14739-(21.07931)));
        zz = -21.10219 + (((tickAnim - 0) / 5) * (18.33303-(-21.10219)));
        }
        else if (tickAnim >= 5 && tickAnim < 10) {
        xx = -6.40119 + (((tickAnim - 5) / 5) * (-8.33244-(-6.40119)));
        yy = 6.14739 + (((tickAnim - 5) / 5) * (-17.79138-(6.14739)));
        zz = 18.33303 + (((tickAnim - 5) / 5) * (9.46599-(18.33303)));
        }
        else if (tickAnim >= 10 && tickAnim < 20) {
        xx = -8.33244 + (((tickAnim - 10) / 10) * (-11.60238-(-8.33244)));
        yy = -17.79138 + (((tickAnim - 10) / 10) * (-5.22988-(-17.79138)));
        zz = 9.46599 + (((tickAnim - 10) / 10) * (9.12035-(9.46599)));
        }
        else if (tickAnim >= 20 && tickAnim < 27) {
        xx = -11.60238 + (((tickAnim - 20) / 7) * (-11.55988-(-11.60238)));
        yy = -5.22988 + (((tickAnim - 20) / 7) * (0.66129-(-5.22988)));
        zz = 9.12035 + (((tickAnim - 20) / 7) * (3.17082-(9.12035)));
        }
        else if (tickAnim >= 27 && tickAnim < 30) {
        xx = -11.55988 + (((tickAnim - 27) / 3) * (-8.31604-(-11.55988)));
        yy = 0.66129 + (((tickAnim - 27) / 3) * (3.76267-(0.66129)));
        zz = 3.17082 + (((tickAnim - 27) / 3) * (8.35804-(3.17082)));
        }
        else if (tickAnim >= 30 && tickAnim < 40) {
        xx = -8.31604 + (((tickAnim - 30) / 10) * (-24.29654-(-8.31604)));
        yy = 3.76267 + (((tickAnim - 30) / 10) * (21.07931-(3.76267)));
        zz = 8.35804 + (((tickAnim - 30) / 10) * (-21.10219-(8.35804)));
        }
        else {
        xx = 0;
        yy = 0;
        zz = 0;
        }
        this.setRotateAngle(legright5, legright5.rotateAngleX + (float) Math.toRadians(xx), legright5.rotateAngleY + (float) Math.toRadians(yy), legright5.rotateAngleZ + (float) Math.toRadians(zz));




         if (tickAnim >= 0 && tickAnim < 10) {
        xx = 0 + (((tickAnim - 0) / 10) * (-4.51323-(0)));
        yy = 0 + (((tickAnim - 0) / 10) * (-2.42032-(0)));
        zz = 0 + (((tickAnim - 0) / 10) * (0.62632-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 20) {
        xx = -4.51323 + (((tickAnim - 10) / 10) * (-0.5-(-4.51323)));
        yy = -2.42032 + (((tickAnim - 10) / 10) * (0-(-2.42032)));
        zz = 0.62632 + (((tickAnim - 10) / 10) * (0-(0.62632)));
        }
        else if (tickAnim >= 20 && tickAnim < 30) {
        xx = -0.5 + (((tickAnim - 20) / 10) * (4.74409-(-0.5)));
        yy = 0 + (((tickAnim - 20) / 10) * (2.48513-(0)));
        zz = 0 + (((tickAnim - 20) / 10) * (-0.27234-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 40) {
        xx = 4.74409 + (((tickAnim - 30) / 10) * (0-(4.74409)));
        yy = 2.48513 + (((tickAnim - 30) / 10) * (0-(2.48513)));
        zz = -0.27234 + (((tickAnim - 30) / 10) * (0-(-0.27234)));
        }
        else {
        xx = 0;
        yy = 0;
        zz = 0;
        }
        this.setRotateAngle(body1, body1.rotateAngleX + (float) Math.toRadians(xx), body1.rotateAngleY + (float) Math.toRadians(yy), body1.rotateAngleZ + (float) Math.toRadians(zz));




         if (tickAnim >= 0 && tickAnim < 7) {
        xx = 0 + (((tickAnim - 0) / 7) * (0-(0)));
        yy = 0 + (((tickAnim - 0) / 7) * (0-(0)));
        zz = 0 + (((tickAnim - 0) / 7) * (0-(0)));
        }
        else if (tickAnim >= 7 && tickAnim < 10) {
        xx = 0 + (((tickAnim - 7) / 3) * (12.5-(0)));
        yy = 0 + (((tickAnim - 7) / 3) * (0-(0)));
        zz = 0 + (((tickAnim - 7) / 3) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 13) {
        xx = 12.5 + (((tickAnim - 10) / 3) * (-4.64-(12.5)));
        yy = 0 + (((tickAnim - 10) / 3) * (0-(0)));
        zz = 0 + (((tickAnim - 10) / 3) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 16) {
        xx = -4.64 + (((tickAnim - 13) / 3) * (0-(-4.64)));
        yy = 0 + (((tickAnim - 13) / 3) * (0-(0)));
        zz = 0 + (((tickAnim - 13) / 3) * (0-(0)));
        }
        else if (tickAnim >= 16 && tickAnim < 28) {
        xx = 0 + (((tickAnim - 16) / 12) * (0-(0)));
        yy = 0 + (((tickAnim - 16) / 12) * (0-(0)));
        zz = 0 + (((tickAnim - 16) / 12) * (0-(0)));
        }
        else if (tickAnim >= 28 && tickAnim < 31) {
        xx = 0 + (((tickAnim - 28) / 3) * (7.5-(0)));
        yy = 0 + (((tickAnim - 28) / 3) * (0-(0)));
        zz = 0 + (((tickAnim - 28) / 3) * (0-(0)));
        }
        else if (tickAnim >= 31 && tickAnim < 34) {
        xx = 7.5 + (((tickAnim - 31) / 3) * (-4.64-(7.5)));
        yy = 0 + (((tickAnim - 31) / 3) * (0-(0)));
        zz = 0 + (((tickAnim - 31) / 3) * (0-(0)));
        }
        else if (tickAnim >= 34 && tickAnim < 37) {
        xx = -4.64 + (((tickAnim - 34) / 3) * (0-(-4.64)));
        yy = 0 + (((tickAnim - 34) / 3) * (0-(0)));
        zz = 0 + (((tickAnim - 34) / 3) * (0-(0)));
        }
        else {
        xx = 0;
        yy = 0;
        zz = 0;
        }
        this.setRotateAngle(legright1, legright1.rotateAngleX + (float) Math.toRadians(xx), legright1.rotateAngleY + (float) Math.toRadians(yy), legright1.rotateAngleZ + (float) Math.toRadians(zz));




         if (tickAnim >= 0 && tickAnim < 6) {
        xx = 0 + (((tickAnim - 0) / 6) * (0-(0)));
        yy = 0 + (((tickAnim - 0) / 6) * (0-(0)));
        zz = 0 + (((tickAnim - 0) / 6) * (0-(0)));
        }
        else if (tickAnim >= 6 && tickAnim < 9) {
        xx = 0 + (((tickAnim - 6) / 3) * (12.5-(0)));
        yy = 0 + (((tickAnim - 6) / 3) * (0-(0)));
        zz = 0 + (((tickAnim - 6) / 3) * (0-(0)));
        }
        else if (tickAnim >= 9 && tickAnim < 13) {
        xx = 12.5 + (((tickAnim - 9) / 4) * (-4.64-(12.5)));
        yy = 0 + (((tickAnim - 9) / 4) * (0-(0)));
        zz = 0 + (((tickAnim - 9) / 4) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 15) {
        xx = -4.64 + (((tickAnim - 13) / 2) * (0-(-4.64)));
        yy = 0 + (((tickAnim - 13) / 2) * (0-(0)));
        zz = 0 + (((tickAnim - 13) / 2) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 27) {
        xx = 0 + (((tickAnim - 15) / 12) * (0-(0)));
        yy = 0 + (((tickAnim - 15) / 12) * (0-(0)));
        zz = 0 + (((tickAnim - 15) / 12) * (0-(0)));
        }
        else if (tickAnim >= 27 && tickAnim < 30) {
        xx = 0 + (((tickAnim - 27) / 3) * (7.5-(0)));
        yy = 0 + (((tickAnim - 27) / 3) * (0-(0)));
        zz = 0 + (((tickAnim - 27) / 3) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 33) {
        xx = 7.5 + (((tickAnim - 30) / 3) * (-4.64-(7.5)));
        yy = 0 + (((tickAnim - 30) / 3) * (0-(0)));
        zz = 0 + (((tickAnim - 30) / 3) * (0-(0)));
        }
        else if (tickAnim >= 33 && tickAnim < 36) {
        xx = -4.64 + (((tickAnim - 33) / 3) * (0-(-4.64)));
        yy = 0 + (((tickAnim - 33) / 3) * (0-(0)));
        zz = 0 + (((tickAnim - 33) / 3) * (0-(0)));
        }
        else {
        xx = 0;
        yy = 0;
        zz = 0;
        }
        this.setRotateAngle(legleft1, legleft1.rotateAngleX + (float) Math.toRadians(xx), legleft1.rotateAngleY + (float) Math.toRadians(yy), legleft1.rotateAngleZ + (float) Math.toRadians(zz));




         if (tickAnim >= 0 && tickAnim < 6) {
        xx = 0 + (((tickAnim - 0) / 6) * (0-(0)));
        yy = 0 + (((tickAnim - 0) / 6) * (0-(0)));
        zz = 0 + (((tickAnim - 0) / 6) * (0-(0)));
        }
        else if (tickAnim >= 6 && tickAnim < 9) {
        xx = 0 + (((tickAnim - 6) / 3) * (7.5-(0)));
        yy = 0 + (((tickAnim - 6) / 3) * (0-(0)));
        zz = 0 + (((tickAnim - 6) / 3) * (0-(0)));
        }
        else if (tickAnim >= 9 && tickAnim < 13) {
        xx = 7.5 + (((tickAnim - 9) / 4) * (-3.64-(7.5)));
        yy = 0 + (((tickAnim - 9) / 4) * (0-(0)));
        zz = 0 + (((tickAnim - 9) / 4) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 15) {
        xx = -3.64 + (((tickAnim - 13) / 2) * (0-(-3.64)));
        yy = 0 + (((tickAnim - 13) / 2) * (0-(0)));
        zz = 0 + (((tickAnim - 13) / 2) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 27) {
        xx = 0 + (((tickAnim - 15) / 12) * (0-(0)));
        yy = 0 + (((tickAnim - 15) / 12) * (0-(0)));
        zz = 0 + (((tickAnim - 15) / 12) * (0-(0)));
        }
        else if (tickAnim >= 27 && tickAnim < 30) {
        xx = 0 + (((tickAnim - 27) / 3) * (4.5-(0)));
        yy = 0 + (((tickAnim - 27) / 3) * (0-(0)));
        zz = 0 + (((tickAnim - 27) / 3) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 33) {
        xx = 4.5 + (((tickAnim - 30) / 3) * (-3.64-(4.5)));
        yy = 0 + (((tickAnim - 30) / 3) * (0-(0)));
        zz = 0 + (((tickAnim - 30) / 3) * (0-(0)));
        }
        else if (tickAnim >= 33 && tickAnim < 36) {
        xx = -3.64 + (((tickAnim - 33) / 3) * (0-(-3.64)));
        yy = 0 + (((tickAnim - 33) / 3) * (0-(0)));
        zz = 0 + (((tickAnim - 33) / 3) * (0-(0)));
        }
        else {
        xx = 0;
        yy = 0;
        zz = 0;
        }
        this.setRotateAngle(legright2, legright2.rotateAngleX + (float) Math.toRadians(xx), legright2.rotateAngleY + (float) Math.toRadians(yy), legright2.rotateAngleZ + (float) Math.toRadians(zz));




         if (tickAnim >= 0 && tickAnim < 7) {
        xx = 0 + (((tickAnim - 0) / 7) * (0-(0)));
        yy = 0 + (((tickAnim - 0) / 7) * (0-(0)));
        zz = 0 + (((tickAnim - 0) / 7) * (0-(0)));
        }
        else if (tickAnim >= 7 && tickAnim < 10) {
        xx = 0 + (((tickAnim - 7) / 3) * (7.5-(0)));
        yy = 0 + (((tickAnim - 7) / 3) * (0-(0)));
        zz = 0 + (((tickAnim - 7) / 3) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 13) {
        xx = 7.5 + (((tickAnim - 10) / 3) * (-3.64-(7.5)));
        yy = 0 + (((tickAnim - 10) / 3) * (0-(0)));
        zz = 0 + (((tickAnim - 10) / 3) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 16) {
        xx = -3.64 + (((tickAnim - 13) / 3) * (0-(-3.64)));
        yy = 0 + (((tickAnim - 13) / 3) * (0-(0)));
        zz = 0 + (((tickAnim - 13) / 3) * (0-(0)));
        }
        else if (tickAnim >= 16 && tickAnim < 28) {
        xx = 0 + (((tickAnim - 16) / 12) * (0-(0)));
        yy = 0 + (((tickAnim - 16) / 12) * (0-(0)));
        zz = 0 + (((tickAnim - 16) / 12) * (0-(0)));
        }
        else if (tickAnim >= 28 && tickAnim < 31) {
        xx = 0 + (((tickAnim - 28) / 3) * (4.5-(0)));
        yy = 0 + (((tickAnim - 28) / 3) * (0-(0)));
        zz = 0 + (((tickAnim - 28) / 3) * (0-(0)));
        }
        else if (tickAnim >= 31 && tickAnim < 34) {
        xx = 4.5 + (((tickAnim - 31) / 3) * (-3.64-(4.5)));
        yy = 0 + (((tickAnim - 31) / 3) * (0-(0)));
        zz = 0 + (((tickAnim - 31) / 3) * (0-(0)));
        }
        else if (tickAnim >= 34 && tickAnim < 37) {
        xx = -3.64 + (((tickAnim - 34) / 3) * (0-(-3.64)));
        yy = 0 + (((tickAnim - 34) / 3) * (0-(0)));
        zz = 0 + (((tickAnim - 34) / 3) * (0-(0)));
        }
        else {
        xx = 0;
        yy = 0;
        zz = 0;
        }
        this.setRotateAngle(legleft2, legleft2.rotateAngleX + (float) Math.toRadians(xx), legleft2.rotateAngleY + (float) Math.toRadians(yy), legleft2.rotateAngleZ + (float) Math.toRadians(zz));




         if (tickAnim >= 0 && tickAnim < 3) {
        xx = 3.31499 + (((tickAnim - 0) / 3) * (6.10846-(3.31499)));
        yy = -32.34349 + (((tickAnim - 0) / 3) * (-9.59969-(-32.34349)));
        zz = -38.17257 + (((tickAnim - 0) / 3) * (-46.63534-(-38.17257)));
        }
        else if (tickAnim >= 3 && tickAnim < 8) {
        xx = 6.10846 + (((tickAnim - 3) / 5) * (18.34237-(6.10846)));
        yy = -9.59969 + (((tickAnim - 3) / 5) * (16.83583-(-9.59969)));
        zz = -46.63534 + (((tickAnim - 3) / 5) * (-13.82369-(-46.63534)));
        }
        else if (tickAnim >= 8 && tickAnim < 16) {
        xx = 18.34237 + (((tickAnim - 8) / 8) * (25.57942-(18.34237)));
        yy = 16.83583 + (((tickAnim - 8) / 8) * (-6.89051-(16.83583)));
        zz = -13.82369 + (((tickAnim - 8) / 8) * (-4.65916-(-13.82369)));
        }
        else if (tickAnim >= 16 && tickAnim < 21) {
        xx = 25.57942 + (((tickAnim - 16) / 5) * (22.4959-(25.57942)));
        yy = -6.89051 + (((tickAnim - 16) / 5) * (-16.79026-(-6.89051)));
        zz = -4.65916 + (((tickAnim - 16) / 5) * (2.4184-(-4.65916)));
        }
        else if (tickAnim >= 21 && tickAnim < 28) {
        xx = 22.4959 + (((tickAnim - 21) / 7) * (8.48665-(22.4959)));
        yy = -16.79026 + (((tickAnim - 21) / 7) * (-25.38035-(-16.79026)));
        zz = 2.4184 + (((tickAnim - 21) / 7) * (-13.74262-(2.4184)));
        }
        else if (tickAnim >= 28 && tickAnim < 32) {
        xx = 8.48665 + (((tickAnim - 28) / 4) * (5.69211-(8.48665)));
        yy = -25.38035 + (((tickAnim - 28) / 4) * (-31.20164-(-25.38035)));
        zz = -13.74262 + (((tickAnim - 28) / 4) * (-20.25408-(-13.74262)));
        }
        else if (tickAnim >= 32 && tickAnim < 38) {
        xx = 5.69211 + (((tickAnim - 32) / 6) * (2.88419-(5.69211)));
        yy = -31.20164 + (((tickAnim - 32) / 6) * (-44.42618-(-31.20164)));
        zz = -20.25408 + (((tickAnim - 32) / 6) * (-22.67458-(-20.25408)));
        }
        else if (tickAnim >= 38 && tickAnim < 40) {
        xx = 2.88419 + (((tickAnim - 38) / 2) * (3.31499-(2.88419)));
        yy = -44.42618 + (((tickAnim - 38) / 2) * (-32.34349-(-44.42618)));
        zz = -22.67458 + (((tickAnim - 38) / 2) * (-38.17257-(-22.67458)));
        }
        else {
        xx = 0;
        yy = 0;
        zz = 0;
        }
        this.setRotateAngle(legleft3, legleft3.rotateAngleX + (float) Math.toRadians(xx), legleft3.rotateAngleY + (float) Math.toRadians(yy), legleft3.rotateAngleZ + (float) Math.toRadians(zz));




         if (tickAnim >= 0 && tickAnim < 18) {
        xx = -3.47221 + (((tickAnim - 0) / 18) * (-3.53929-(-3.47221)));
        yy = 12.17121 + (((tickAnim - 0) / 18) * (-6.61592-(12.17121)));
        zz = -10.11442 + (((tickAnim - 0) / 18) * (5.2982-(-10.11442)));
        }
        else if (tickAnim >= 18 && tickAnim < 25) {
        xx = -3.53929 + (((tickAnim - 18) / 7) * (-7.42535-(-3.53929)));
        yy = -6.61592 + (((tickAnim - 18) / 7) * (9.11651-(-6.61592)));
        zz = 5.2982 + (((tickAnim - 18) / 7) * (-24.87024-(5.2982)));
        }
        else if (tickAnim >= 25 && tickAnim < 30) {
        xx = -7.42535 + (((tickAnim - 25) / 5) * (-2.3273-(-7.42535)));
        yy = 9.11651 + (((tickAnim - 25) / 5) * (24.89837-(9.11651)));
        zz = -24.87024 + (((tickAnim - 25) / 5) * (-3.20616-(-24.87024)));
        }
        else if (tickAnim >= 30 && tickAnim < 40) {
        xx = -2.3273 + (((tickAnim - 30) / 10) * (-3.47221-(-2.3273)));
        yy = 24.89837 + (((tickAnim - 30) / 10) * (12.17121-(24.89837)));
        zz = -3.20616 + (((tickAnim - 30) / 10) * (-10.11442-(-3.20616)));
        }
        else {
        xx = 0;
        yy = 0;
        zz = 0;
        }
        this.setRotateAngle(legleft4, legleft4.rotateAngleX + (float) Math.toRadians(xx), legleft4.rotateAngleY + (float) Math.toRadians(yy), legleft4.rotateAngleZ + (float) Math.toRadians(zz));




         if (tickAnim >= 0 && tickAnim < 5) {
        xx = -6.12641 + (((tickAnim - 0) / 5) * (-12.2519-(-6.12641)));
        yy = -2.78016 + (((tickAnim - 0) / 5) * (-10.0684-(-2.78016)));
        zz = -8.48247 + (((tickAnim - 0) / 5) * (6.42558-(-8.48247)));
        }
        else if (tickAnim >= 5 && tickAnim < 8) {
        xx = -12.2519 + (((tickAnim - 5) / 3) * (-10.77366-(-12.2519)));
        yy = -10.0684 + (((tickAnim - 5) / 3) * (-14.95973-(-10.0684)));
        zz = 6.42558 + (((tickAnim - 5) / 3) * (6.58955-(6.42558)));
        }
        else if (tickAnim >= 8 && tickAnim < 13) {
        xx = -10.77366 + (((tickAnim - 8) / 5) * (0.32867-(-10.77366)));
        yy = -14.95973 + (((tickAnim - 8) / 5) * (1.95901-(-14.95973)));
        zz = 6.58955 + (((tickAnim - 8) / 5) * (-25.10089-(6.58955)));
        }
        else if (tickAnim >= 13 && tickAnim < 20) {
        xx = 0.32867 + (((tickAnim - 13) / 7) * (4.26757-(0.32867)));
        yy = 1.95901 + (((tickAnim - 13) / 7) * (19.98928-(1.95901)));
        zz = -25.10089 + (((tickAnim - 13) / 7) * (9.27152-(-25.10089)));
        }
        else if (tickAnim >= 20 && tickAnim < 27) {
        xx = 4.26757 + (((tickAnim - 20) / 7) * (-7.62495-(4.26757)));
        yy = 19.98928 + (((tickAnim - 20) / 7) * (10.8939-(19.98928)));
        zz = 9.27152 + (((tickAnim - 20) / 7) * (0.33005-(9.27152)));
        }
        else if (tickAnim >= 27 && tickAnim < 31) {
        xx = -7.62495 + (((tickAnim - 27) / 4) * (-0.58045-(-7.62495)));
        yy = 10.8939 + (((tickAnim - 27) / 4) * (8.5755-(10.8939)));
        zz = 0.33005 + (((tickAnim - 27) / 4) * (-10.26027-(0.33005)));
        }
        else if (tickAnim >= 31 && tickAnim < 40) {
        xx = -0.58045 + (((tickAnim - 31) / 9) * (-6.12641-(-0.58045)));
        yy = 8.5755 + (((tickAnim - 31) / 9) * (-2.78016-(8.5755)));
        zz = -10.26027 + (((tickAnim - 31) / 9) * (-8.48247-(-10.26027)));
        }
        else {
        xx = 0;
        yy = 0;
        zz = 0;
        }
        this.setRotateAngle(legleft5, legleft5.rotateAngleX + (float) Math.toRadians(xx), legleft5.rotateAngleY + (float) Math.toRadians(yy), legleft5.rotateAngleZ + (float) Math.toRadians(zz));




         if (tickAnim >= 0 && tickAnim < 5) {
        xx = 0 + (((tickAnim - 0) / 5) * (-2.5-(0)));
        yy = 0 + (((tickAnim - 0) / 5) * (-1.875-(0)));
        zz = 0 + (((tickAnim - 0) / 5) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 10) {
        xx = -2.5 + (((tickAnim - 5) / 5) * (0-(-2.5)));
        yy = -1.875 + (((tickAnim - 5) / 5) * (-3.75-(-1.875)));
        zz = 0 + (((tickAnim - 5) / 5) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 13) {
        xx = 0 + (((tickAnim - 10) / 3) * (1-(0)));
        yy = -3.75 + (((tickAnim - 10) / 3) * (-5-(-3.75)));
        zz = 0 + (((tickAnim - 10) / 3) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 20) {
        xx = 1 + (((tickAnim - 13) / 7) * (0.5-(1)));
        yy = -5 + (((tickAnim - 13) / 7) * (-0.78947-(-5)));
        zz = 0 + (((tickAnim - 13) / 7) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 27) {
        xx = 0.5 + (((tickAnim - 20) / 7) * (-2-(0.5)));
        yy = -0.78947 + (((tickAnim - 20) / 7) * (3.42105-(-0.78947)));
        zz = 0 + (((tickAnim - 20) / 7) * (0-(0)));
        }
        else if (tickAnim >= 27 && tickAnim < 30) {
        xx = -2 + (((tickAnim - 27) / 3) * (-0.5-(-2)));
        yy = 3.42105 + (((tickAnim - 27) / 3) * (2.56579-(3.42105)));
        zz = 0 + (((tickAnim - 27) / 3) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 40) {
        xx = -0.5 + (((tickAnim - 30) / 10) * (0-(-0.5)));
        yy = 2.56579 + (((tickAnim - 30) / 10) * (0-(2.56579)));
        zz = 0 + (((tickAnim - 30) / 10) * (0-(0)));
        }
        else {
        xx = 0;
        yy = 0;
        zz = 0;
        }
        this.setRotateAngle(body2, body2.rotateAngleX + (float) Math.toRadians(xx), body2.rotateAngleY + (float) Math.toRadians(yy), body2.rotateAngleZ + (float) Math.toRadians(zz));




         if (tickAnim >= 0 && tickAnim < 13) {
        xx = 0 + (((tickAnim - 0) / 13) * (0-(0)));
        yy = 0 + (((tickAnim - 0) / 13) * (7.5-(0)));
        zz = 0 + (((tickAnim - 0) / 13) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 23) {
        xx = 0 + (((tickAnim - 13) / 10) * (0-(0)));
        yy = 7.5 + (((tickAnim - 13) / 10) * (-7.25-(7.5)));
        zz = 0 + (((tickAnim - 13) / 10) * (0-(0)));
        }
        else if (tickAnim >= 23 && tickAnim < 29) {
        xx = 0 + (((tickAnim - 23) / 6) * (0-(0)));
        yy = -7.25 + (((tickAnim - 23) / 6) * (-7.5-(-7.25)));
        zz = 0 + (((tickAnim - 23) / 6) * (0-(0)));
        }
        else if (tickAnim >= 29 && tickAnim < 40) {
        xx = 0 + (((tickAnim - 29) / 11) * (0-(0)));
        yy = -7.5 + (((tickAnim - 29) / 11) * (0-(-7.5)));
        zz = 0 + (((tickAnim - 29) / 11) * (0-(0)));
        }
        else {
        xx = 0;
        yy = 0;
        zz = 0;
        }
        this.setRotateAngle(body3, body3.rotateAngleX + (float) Math.toRadians(xx), body3.rotateAngleY + (float) Math.toRadians(yy), body3.rotateAngleZ + (float) Math.toRadians(zz));




         if (tickAnim >= 0 && tickAnim < 8) {
        xx = 0 + (((tickAnim - 0) / 8) * (0-(0)));
        yy = 0 + (((tickAnim - 0) / 8) * (7.5-(0)));
        zz = 0 + (((tickAnim - 0) / 8) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 22) {
        xx = 0 + (((tickAnim - 8) / 14) * (0-(0)));
        yy = 7.5 + (((tickAnim - 8) / 14) * (4.57-(7.5)));
        zz = 0 + (((tickAnim - 8) / 14) * (0-(0)));
        }
        else if (tickAnim >= 22 && tickAnim < 27) {
        xx = 0 + (((tickAnim - 22) / 5) * (0-(0)));
        yy = 4.57 + (((tickAnim - 22) / 5) * (-10-(4.57)));
        zz = 0 + (((tickAnim - 22) / 5) * (0-(0)));
        }
        else if (tickAnim >= 27 && tickAnim < 35) {
        xx = 0 + (((tickAnim - 27) / 8) * (0-(0)));
        yy = -10 + (((tickAnim - 27) / 8) * (-8.75-(-10)));
        zz = 0 + (((tickAnim - 27) / 8) * (0-(0)));
        }
        else if (tickAnim >= 35 && tickAnim < 40) {
        xx = 0 + (((tickAnim - 35) / 5) * (0-(0)));
        yy = -8.75 + (((tickAnim - 35) / 5) * (0-(-8.75)));
        zz = 0 + (((tickAnim - 35) / 5) * (0-(0)));
        }
        else {
        xx = 0;
        yy = 0;
        zz = 0;
        }
        this.setRotateAngle(body4, body4.rotateAngleX + (float) Math.toRadians(xx), body4.rotateAngleY + (float) Math.toRadians(yy), body4.rotateAngleZ + (float) Math.toRadians(zz));
    }
}
