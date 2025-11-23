package net.lepidodendron.entity.model.entity;

import net.ilexiconn.llibrary.client.model.ModelAnimator;
import net.ilexiconn.llibrary.client.model.tools.AdvancedModelRenderer;
import net.ilexiconn.llibrary.server.animation.IAnimatedEntity;
import net.lepidodendron.entity.EntityPrehistoricFloraSantanmantis;
import net.lepidodendron.entity.base.EntityPrehistoricFloraLandClimbingGlidingBase;
import net.lepidodendron.entity.model.ModelBasePalaeopedia;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.util.EnumFacing;

public class ModelSantanmantis extends ModelBasePalaeopedia {
    private final AdvancedModelRenderer base;
    private final AdvancedModelRenderer legleft;
    private final AdvancedModelRenderer legleft2;
    private final AdvancedModelRenderer legright2;
    private final AdvancedModelRenderer legright;
    private final AdvancedModelRenderer chest;
    private final AdvancedModelRenderer head;
    private final AdvancedModelRenderer antennaleft;
    private final AdvancedModelRenderer antennaright;
    private final AdvancedModelRenderer armleft;
    private final AdvancedModelRenderer armleft2;
    private final AdvancedModelRenderer armleft3;
    private final AdvancedModelRenderer armright;
    private final AdvancedModelRenderer armright2;
    private final AdvancedModelRenderer armright3;
    private final AdvancedModelRenderer forewingleft;
    private final AdvancedModelRenderer forewingright;
    private final AdvancedModelRenderer hindwingleft;
    private final AdvancedModelRenderer hindwingleft2;
    private final AdvancedModelRenderer hindwingright;
    private final AdvancedModelRenderer hindwingright2;
    private final AdvancedModelRenderer abdomen;
    private final AdvancedModelRenderer cube_r1;
    private final AdvancedModelRenderer cube_r2;

    private ModelAnimator animator;

    public ModelSantanmantis() {
        this.textureWidth = 40;
        this.textureHeight = 32;

        this.base = new AdvancedModelRenderer(this);
        this.base.setRotationPoint(0.0F, 22.2F, -3.0F);
        this.setRotateAngle(base, -0.1309F, 0.0F, 0.0F);
        this.base.cubeList.add(new ModelBox(base, 10, 24, -1.0F, -1.0F, -0.75F, 2, 1, 2, 0.0F, false));

        this.legleft = new AdvancedModelRenderer(this);
        this.legleft.setRotationPoint(0.05F, 0.0F, -0.25F);
        this.base.addChild(legleft);
        this.setRotateAngle(legleft, 0.2302F, -0.9669F, 0.1621F);
        this.legleft.cubeList.add(new ModelBox(legleft, 0, 20, 0.0F, 0.0F, -3.5F, 5, 0, 4, 0.0F, true));

        this.legleft2 = new AdvancedModelRenderer(this);
        this.legleft2.setRotationPoint(0.05F, 0.0F, 0.5F);
        this.base.addChild(legleft2);
        this.setRotateAngle(legleft2, -0.4753F, -1.4725F, 0.6092F);
        this.legleft2.cubeList.add(new ModelBox(legleft2, 0, 9, 0.0F, 0.0F, -4.5F, 7, 0, 5, 0.0F, true));

        this.legright2 = new AdvancedModelRenderer(this);
        this.legright2.setRotationPoint(-0.05F, 0.0F, 0.5F);
        this.base.addChild(legright2);
        this.setRotateAngle(legright2, -0.4753F, 1.4725F, -0.6092F);
        this.legright2.cubeList.add(new ModelBox(legright2, 0, 9, -7.0F, 0.0F, -4.5F, 7, 0, 5, 0.0F, false));

        this.legright = new AdvancedModelRenderer(this);
        this.legright.setRotationPoint(-0.05F, 0.0F, -0.25F);
        this.base.addChild(legright);
        this.setRotateAngle(legright, 0.2302F, 0.9669F, -0.1621F);
        this.legright.cubeList.add(new ModelBox(legright, 0, 20, -5.0F, 0.0F, -3.5F, 5, 0, 4, 0.0F, false));

        this.chest = new AdvancedModelRenderer(this);
        this.chest.setRotationPoint(0.0F, -0.5F, -0.75F);
        this.base.addChild(chest);
        this.setRotateAngle(chest, -0.0436F, 0.0F, 0.0F);
        this.chest.cubeList.add(new ModelBox(chest, 24, 11, -1.0F, -0.5F, -1.5F, 2, 1, 1, 0.01F, false));
        this.chest.cubeList.add(new ModelBox(chest, 26, 13, -1.0F, -0.5F, -1.0F, 2, 1, 1, 0.0F, false));

        this.head = new AdvancedModelRenderer(this);
        this.head.setRotationPoint(0.0F, -0.5F, -1.25F);
        this.chest.addChild(head);
        this.setRotateAngle(head, 0.3491F, 0.0F, 0.0F);
        this.head.cubeList.add(new ModelBox(head, 26, 18, -1.1F, 0.0F, -1.0F, 1, 1, 1, -0.01F, false));
        this.head.cubeList.add(new ModelBox(head, 26, 18, 0.1F, 0.0F, -1.0F, 1, 1, 1, -0.01F, true));
        this.head.cubeList.add(new ModelBox(head, 18, 26, -0.5F, 0.0F, -1.0F, 1, 1, 1, 0.0F, false));

        this.antennaleft = new AdvancedModelRenderer(this);
        this.antennaleft.setRotationPoint(0.6F, 0.5F, -1.0F);
        this.head.addChild(antennaleft);
        this.setRotateAngle(antennaleft, 2.0782F, 1.0071F, -1.1348F);
        this.antennaleft.cubeList.add(new ModelBox(antennaleft, 0, 0, 0.0F, 0.0F, -8.5F, 5, 0, 9, 0.0F, true));

        this.antennaright = new AdvancedModelRenderer(this);
        this.antennaright.setRotationPoint(-0.6F, 0.5F, -1.0F);
        this.head.addChild(antennaright);
        this.setRotateAngle(antennaright, 2.0782F, -1.0071F, 1.1348F);
        this.antennaright.cubeList.add(new ModelBox(antennaright, 0, 0, -5.0F, 0.0F, -8.5F, 5, 0, 9, 0.0F, false));

        this.armleft = new AdvancedModelRenderer(this);
        this.armleft.setRotationPoint(0.25F, 0.5F, -0.25F);
        this.chest.addChild(armleft);
        this.setRotateAngle(armleft, 0.0767F, 0.1181F, 0.4801F);
        this.armleft.cubeList.add(new ModelBox(armleft, 22, 26, 0.0F, 0.0F, -0.5F, 1, 0, 1, 0.0F, true));

        this.armleft2 = new AdvancedModelRenderer(this);
        this.armleft2.setRotationPoint(1.0F, 0.0F, 0.0F);
        this.armleft.addChild(armleft2);
        this.setRotateAngle(armleft2, 0.0F, 0.7854F, 0.0F);
        this.armleft2.cubeList.add(new ModelBox(armleft2, 26, 17, -0.25F, -0.01F, -0.5F, 2, 0, 1, 0.0F, true));

        this.armleft3 = new AdvancedModelRenderer(this);
        this.armleft3.setRotationPoint(1.75F, 0.0F, 0.0F);
        this.armleft2.addChild(armleft3);
        this.setRotateAngle(armleft3, 0.0F, -1.309F, 0.0F);
        this.armleft3.cubeList.add(new ModelBox(armleft3, 24, 9, -0.25F, 0.01F, -0.5F, 3, 0, 2, 0.0F, true));

        this.armright = new AdvancedModelRenderer(this);
        this.armright.setRotationPoint(-0.25F, 0.5F, -0.25F);
        this.chest.addChild(armright);
        this.setRotateAngle(armright, 0.0767F, -0.1181F, -0.4801F);
        this.armright.cubeList.add(new ModelBox(armright, 22, 26, -1.0F, 0.0F, -0.5F, 1, 0, 1, 0.0F, false));

        this.armright2 = new AdvancedModelRenderer(this);
        this.armright2.setRotationPoint(-1.0F, 0.0F, 0.0F);
        this.armright.addChild(armright2);
        this.setRotateAngle(armright2, 0.0F, -0.7854F, 0.0F);
        this.armright2.cubeList.add(new ModelBox(armright2, 26, 17, -1.75F, -0.01F, -0.5F, 2, 0, 1, 0.0F, false));

        this.armright3 = new AdvancedModelRenderer(this);
        this.armright3.setRotationPoint(-1.75F, 0.0F, 0.0F);
        this.armright2.addChild(armright3);
        this.setRotateAngle(armright3, 0.0F, 1.309F, 0.0F);
        this.armright3.cubeList.add(new ModelBox(armright3, 24, 9, -2.75F, 0.01F, -0.5F, 3, 0, 2, 0.0F, false));

        this.forewingleft = new AdvancedModelRenderer(this);
        this.forewingleft.setRotationPoint(0.5F, -1.0F, -0.5F);
        this.base.addChild(forewingleft);
        this.setRotateAngle(forewingleft, 2.4673F, -1.5149F, -2.4665F);
        this.forewingleft.cubeList.add(new ModelBox(forewingleft, 0, 14, 0.0F, -0.01F, -1.25F, 10, 0, 3, 0.0F, true));

        this.forewingright = new AdvancedModelRenderer(this);
        this.forewingright.setRotationPoint(-0.5F, -1.0F, -0.5F);
        this.base.addChild(forewingright);
        this.setRotateAngle(forewingright, 1.5708F, 1.5272F, 1.5708F);
        this.forewingright.cubeList.add(new ModelBox(forewingright, 0, 14, -10.0F, -0.01F, -1.25F, 10, 0, 3, 0.0F, false));

        this.hindwingleft = new AdvancedModelRenderer(this);
        this.hindwingleft.setRotationPoint(0.5F, -1.0F, 0.0F);
        this.base.addChild(hindwingleft);
        this.setRotateAngle(hindwingleft, 2.5312F, -1.5175F, -2.5306F);
        this.hindwingleft.cubeList.add(new ModelBox(hindwingleft, 0, 17, 0.0F, 0.0F, -1.25F, 10, 0, 3, 0.0F, true));

        this.hindwingleft2 = new AdvancedModelRenderer(this);
        this.hindwingleft2.setRotationPoint(4.0F, 0.0F, 1.75F);
        this.hindwingleft.addChild(hindwingleft2);
        this.setRotateAngle(hindwingleft2, -3.098F, 0.0F, 0.0F);
        this.hindwingleft2.cubeList.add(new ModelBox(hindwingleft2, 18, 20, -4.0F, 0.0F, 0.0F, 7, 0, 1, 0.0F, true));

        this.hindwingright = new AdvancedModelRenderer(this);
        this.hindwingright.setRotationPoint(-0.5F, -1.0F, 0.0F);
        this.base.addChild(hindwingright);
        this.setRotateAngle(hindwingright, 1.5708F, 1.5272F, 1.5708F);
        this.hindwingright.cubeList.add(new ModelBox(hindwingright, 0, 17, -10.0F, 0.0F, -1.25F, 10, 0, 3, 0.0F, false));

        this.hindwingright2 = new AdvancedModelRenderer(this);
        this.hindwingright2.setRotationPoint(-4.0F, 0.0F, 1.75F);
        this.hindwingright.addChild(hindwingright2);
        this.setRotateAngle(hindwingright2, 3.1416F, 0.0F, 0.0F);
        this.hindwingright2.cubeList.add(new ModelBox(hindwingright2, 18, 20, -3.0F, 0.0F, 0.0F, 7, 0, 1, 0.0F, false));

        this.abdomen = new AdvancedModelRenderer(this);
        this.abdomen.setRotationPoint(0.0F, -0.5F, 1.25F);
        this.base.addChild(abdomen);
        this.setRotateAngle(abdomen, 0.0436F, 0.0F, 0.0F);
        this.abdomen.cubeList.add(new ModelBox(abdomen, 18, 21, -0.5F, -0.5F, 0.0F, 1, 1, 4, 0.01F, false));
        this.abdomen.cubeList.add(new ModelBox(abdomen, 26, 15, -1.0F, -0.5F, 3.9F, 2, 1, 1, -0.01F, false));
        this.abdomen.cubeList.add(new ModelBox(abdomen, 0, 24, -1.25F, -0.5F, 0.0F, 1, 1, 4, 0.0F, false));
        this.abdomen.cubeList.add(new ModelBox(abdomen, 0, 24, 0.25F, -0.5F, 0.0F, 1, 1, 4, 0.0F, true));

        this.cube_r1 = new AdvancedModelRenderer(this);
        this.cube_r1.setRotationPoint(0.5F, 0.0F, 4.9F);
        this.abdomen.addChild(cube_r1);
        this.setRotateAngle(cube_r1, 0.0F, 0.2618F, 0.0F);
        this.cube_r1.cubeList.add(new ModelBox(cube_r1, 26, 26, 0.0F, -0.5F, 0.0F, 0, 1, 1, 0.0F, true));

        this.cube_r2 = new AdvancedModelRenderer(this);
        this.cube_r2.setRotationPoint(-0.5F, 0.0F, 4.9F);
        this.abdomen.addChild(cube_r2);
        this.setRotateAngle(cube_r2, 0.0F, -0.2618F, 0.0F);
        this.cube_r2.cubeList.add(new ModelBox(cube_r2, 26, 26, 0.0F, -0.5F, 0.0F, 0, 1, 1, 0.0F, false));

        updateDefaultPose();
        animator = ModelAnimator.create();
    }

    @Override
    public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        animate((IAnimatedEntity) entity, f, f1, f2, f3, f4, f5);
        this.base.render(f5);
    }

    public void setRotateAngle(ModelRenderer modelRenderer, float x, float y, float z) {
        modelRenderer.rotateAngleX = x;
        modelRenderer.rotateAngleY = y;
        modelRenderer.rotateAngleZ = z;
    }

    public void renderStaticWall(float f) {
        this.setRotateAngle(base, 0.0F, 0.0F, 0.0F);
        this.base.render(0.01F);
        resetToDefaultPose();
    }

    public void renderStaticFloor(float f) {
        this.base.render(0.01F);
        resetToDefaultPose();
    }

    public void renderStaticDisplayCase(float f) {
        this.base.render(0.01f);
        resetToDefaultPose();

    }

    @Override
    public void renderStaticBook(float f) {
        //Rotations, positions and sizing:
        this.base.offsetY = 0.0F;
        this.base.offsetX = 0.0F;
        this.base.offsetZ = 2.0F;
        this.base.rotateAngleY = (float)Math.toRadians(120);
        this.base.rotateAngleX = (float)Math.toRadians(0);
        this.base.rotateAngleZ = (float)Math.toRadians(0);
        this.base.scaleChildren = true;
        float scaler = 3.0F;
        this.base.setScale(scaler, scaler, scaler);
        //Start of pose:
        this.setRotateAngle(base, 0.6F, 3.8F, -0.2F);
        //End of pose, now render the model:
        this.base.render(f);
        //Reset rotations, positions and sizing:
        this.base.setScale(1.0F, 1.0F, 1.0F);
        this.base.scaleChildren = false;
        resetToDefaultPose();

    }

    @Override
    public void setRotationAngles(float f, float f1, float f2, float f3, float f4, float f5, Entity e) {
        super.setRotationAngles(f, f1, f2, f3, f4, f5, e);

        EntityPrehistoricFloraSantanmantis ee = (EntityPrehistoricFloraSantanmantis) e;
        AdvancedModelRenderer[] Neck = {this.head};

        if (ee.getAnimation() != ee.LAY_ANIMATION && (!ee.getIsFlying()) && (!ee.getIsClimbing()) && (!ee.getIsFast())) {
            //Just bob the tail and neck a little bit
            this.chainSwing(Neck, 0.1F, 0.04F, 0.5, f2, 0.4F);
            this.chainWave(Neck, 0.2F, -0.02F, 0.5F, f2, 0.4F);
        }
    }

    @Override
    public void setLivingAnimations(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime) {
        super.setLivingAnimations(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime);
        this.resetToDefaultPose();
        EntityPrehistoricFloraSantanmantis ee = (EntityPrehistoricFloraSantanmantis) entitylivingbaseIn;

        if (!ee.isReallyInWater()) {
            if (ee.getClimbFacing() == EnumFacing.NORTH
                    || ee.getClimbFacing() == EnumFacing.EAST
                    || ee.getClimbFacing() == EnumFacing.SOUTH
                    || ee.getClimbFacing() == EnumFacing.WEST
                    || ee.getIsClimbing()) {
                if (!ee.getHeadCollided()) {
                    animClimbing(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime, true);
                }
                else {
                    //Just pose with no animation running:
                    animClimbing(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime, false);
                }
            }
            else if (ee.getIsMoving()) {
                if (!ee.getIsFlying()) {

                    animRunning(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime);

                }
                else {
                    if (ee.getIsLaunching()) {
                        animGliding(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime);
                    }
                    else {
                        //Is gliding:
                        animGliding(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime);
                    }
                }
            }
        }
        else {
            if (ee.getIsLaunching()) {
//                animLaunching(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime);
            }
            else {
                //Is gliding:
                animGliding(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime);
            }
        }
        if (ee.getAnimation() == ee.STAND_ANIMATION) { //The idle scratch
            animIdle(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime, ee.getAnimationTick());
        }

    }

    public void animIdle(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime, double animTick) {
        EntityPrehistoricFloraSantanmantis entity = (EntityPrehistoricFloraSantanmantis) entitylivingbaseIn;
        int animCycle = 76;
        double tickAnim = animTick + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;
         if (tickAnim >= 0 && tickAnim < 6) {
            xx = 0 + (((tickAnim - 0) / 6) * (0.28356-(0)));
            yy = 0 + (((tickAnim - 0) / 6) * (-9.39129-(0)));
            zz = 0 + (((tickAnim - 0) / 6) * (14.04882-(0)));
        }
        else if (tickAnim >= 6 && tickAnim < 9) {
            xx = 0.28356 + (((tickAnim - 6) / 3) * (0-(0.28356)));
            yy = -9.39129 + (((tickAnim - 6) / 3) * (0-(-9.39129)));
            zz = 14.04882 + (((tickAnim - 6) / 3) * (-2.5-(14.04882)));
        }
        else if (tickAnim >= 9 && tickAnim < 21) {
            xx = 0 + (((tickAnim - 9) / 12) * (0-(0)));
            yy = 0 + (((tickAnim - 9) / 12) * (0-(0)));
            zz = -2.5 + (((tickAnim - 9) / 12) * (17.5-(-2.5)));
        }
        else if (tickAnim >= 21 && tickAnim < 24) {
            xx = 0 + (((tickAnim - 21) / 3) * (0-(0)));
            yy = 0 + (((tickAnim - 21) / 3) * (0-(0)));
            zz = 17.5 + (((tickAnim - 21) / 3) * (-2.5-(17.5)));
        }
        else if (tickAnim >= 24 && tickAnim < 31) {
            xx = 0 + (((tickAnim - 24) / 7) * (0-(0)));
            yy = 0 + (((tickAnim - 24) / 7) * (0-(0)));
            zz = -2.5 + (((tickAnim - 24) / 7) * (0-(-2.5)));
        }
        else if (tickAnim >= 31 && tickAnim < 38) {
            xx = 0 + (((tickAnim - 31) / 7) * (0.76987-(0)));
            yy = 0 + (((tickAnim - 31) / 7) * (-8.54732-(0)));
            zz = 0 + (((tickAnim - 31) / 7) * (-12.04858-(0)));
        }
        else if (tickAnim >= 38 && tickAnim < 41) {
            xx = 0.76987 + (((tickAnim - 38) / 3) * (0.76987-(0.76987)));
            yy = -8.54732 + (((tickAnim - 38) / 3) * (-8.54732-(-8.54732)));
            zz = -12.04858 + (((tickAnim - 38) / 3) * (-12.04858-(-12.04858)));
        }
        else if (tickAnim >= 41 && tickAnim < 54) {
            xx = 0.76987 + (((tickAnim - 41) / 13) * (-1.95145-(0.76987)));
            yy = -8.54732 + (((tickAnim - 41) / 13) * (13.26758-(-8.54732)));
            zz = -12.04858 + (((tickAnim - 41) / 13) * (-9.65125-(-12.04858)));
        }
        else if (tickAnim >= 54 && tickAnim < 56) {
            xx = -1.95145 + (((tickAnim - 54) / 2) * (-1.95145-(-1.95145)));
            yy = 13.26758 + (((tickAnim - 54) / 2) * (13.26758-(13.26758)));
            zz = -9.65125 + (((tickAnim - 54) / 2) * (-9.65125-(-9.65125)));
        }
        else if (tickAnim >= 56 && tickAnim < 59) {
            xx = -1.95145 + (((tickAnim - 56) / 3) * (0-(-1.95145)));
            yy = 13.26758 + (((tickAnim - 56) / 3) * (0-(13.26758)));
            zz = -9.65125 + (((tickAnim - 56) / 3) * (0-(-9.65125)));
        }
        else if (tickAnim >= 59 && tickAnim < 66) {
            xx = 0 + (((tickAnim - 59) / 7) * (4.31423-(0)));
            yy = 0 + (((tickAnim - 59) / 7) * (-14.31089-(0)));
            zz = 0 + (((tickAnim - 59) / 7) * (-14.53665-(0)));
        }
        else if (tickAnim >= 66 && tickAnim < 77) {
            xx = 4.31423 + (((tickAnim - 66) / 11) * (0-(4.31423)));
            yy = -14.31089 + (((tickAnim - 66) / 11) * (0-(-14.31089)));
            zz = -14.53665 + (((tickAnim - 66) / 11) * (0-(-14.53665)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(head, head.rotateAngleX + (float) Math.toRadians(xx), head.rotateAngleY + (float) Math.toRadians(yy), head.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 77) {
            xx = 0 + (((tickAnim - 0) / 77) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 77) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 77) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.head.rotationPointX = this.head.rotationPointX + (float)(xx);
        this.head.rotationPointY = this.head.rotationPointY - (float)(yy);
        this.head.rotationPointZ = this.head.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 48) {
            xx = 0 + (((tickAnim - 0) / 48) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 48) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 48) * (0-(0)));
        }
        else if (tickAnim >= 48 && tickAnim < 58) {
            xx = 0 + (((tickAnim - 48) / 10) * (29.71023-(0)));
            yy = 0 + (((tickAnim - 48) / 10) * (-12.83168-(0)));
            zz = 0 + (((tickAnim - 48) / 10) * (32.4498-(0)));
        }
        else if (tickAnim >= 58 && tickAnim < 64) {
            xx = 29.71023 + (((tickAnim - 58) / 6) * (0-(29.71023)));
            yy = -12.83168 + (((tickAnim - 58) / 6) * (0-(-12.83168)));
            zz = 32.4498 + (((tickAnim - 58) / 6) * (0-(32.4498)));
        }
        else if (tickAnim >= 64 && tickAnim < 77) {
            xx = 0 + (((tickAnim - 64) / 13) * (0-(0)));
            yy = 0 + (((tickAnim - 64) / 13) * (0-(0)));
            zz = 0 + (((tickAnim - 64) / 13) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(antennaleft, antennaleft.rotateAngleX + (float) Math.toRadians(xx), antennaleft.rotateAngleY + (float) Math.toRadians(yy), antennaleft.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 56) {
            xx = 0 + (((tickAnim - 0) / 56) * (7.58551-(0)));
            yy = 0 + (((tickAnim - 0) / 56) * (2.94654-(0)));
            zz = 0 + (((tickAnim - 0) / 56) * (-3.53953-(0)));
        }
        else if (tickAnim >= 56 && tickAnim < 61) {
            xx = 7.58551 + (((tickAnim - 56) / 5) * (38.40785-(7.58551)));
            yy = 2.94654 + (((tickAnim - 56) / 5) * (24.73255-(2.94654)));
            zz = -3.53953 + (((tickAnim - 56) / 5) * (-54.29506-(-3.53953)));
        }
        else if (tickAnim >= 61 && tickAnim < 66) {
            xx = 38.40785 + (((tickAnim - 61) / 5) * (35.04202-(38.40785)));
            yy = 24.73255 + (((tickAnim - 61) / 5) * (52.92275-(24.73255)));
            zz = -54.29506 + (((tickAnim - 61) / 5) * (-47.9358-(-54.29506)));
        }
        else if (tickAnim >= 66 && tickAnim < 72) {
            xx = 35.04202 + (((tickAnim - 66) / 6) * (0-(35.04202)));
            yy = 52.92275 + (((tickAnim - 66) / 6) * (0-(52.92275)));
            zz = -47.9358 + (((tickAnim - 66) / 6) * (0-(-47.9358)));
        }
        else if (tickAnim >= 72 && tickAnim < 77) {
            xx = 0 + (((tickAnim - 72) / 5) * (0-(0)));
            yy = 0 + (((tickAnim - 72) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 72) / 5) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(antennaright, antennaright.rotateAngleX + (float) Math.toRadians(xx), antennaright.rotateAngleY + (float) Math.toRadians(yy), antennaright.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 7) {
            xx = 0 + (((tickAnim - 0) / 7) * (-0.51555-(0)));
            yy = 0 + (((tickAnim - 0) / 7) * (10.33878-(0)));
            zz = 0 + (((tickAnim - 0) / 7) * (-8.25729-(0)));
        }
        else if (tickAnim >= 7 && tickAnim < 12) {
            xx = -0.51555 + (((tickAnim - 7) / 5) * (-0.21414-(-0.51555)));
            yy = 10.33878 + (((tickAnim - 7) / 5) * (22.58917-(10.33878)));
            zz = -8.25729 + (((tickAnim - 7) / 5) * (-4.70272-(-8.25729)));
        }
        else if (tickAnim >= 12 && tickAnim < 18) {
            xx = -0.21414 + (((tickAnim - 12) / 6) * (-0.51555-(-0.21414)));
            yy = 22.58917 + (((tickAnim - 12) / 6) * (10.33878-(22.58917)));
            zz = -4.70272 + (((tickAnim - 12) / 6) * (-8.25729-(-4.70272)));
        }
        else if (tickAnim >= 18 && tickAnim < 31) {
            xx = -0.51555 + (((tickAnim - 18) / 13) * (0.2333-(-0.51555)));
            yy = 10.33878 + (((tickAnim - 18) / 13) * (9.24953-(10.33878)));
            zz = -8.25729 + (((tickAnim - 18) / 13) * (4.98997-(-8.25729)));
        }
        else if (tickAnim >= 31 && tickAnim < 38) {
            xx = 0.2333 + (((tickAnim - 31) / 7) * (0-(0.2333)));
            yy = 9.24953 + (((tickAnim - 31) / 7) * (0-(9.24953)));
            zz = 4.98997 + (((tickAnim - 31) / 7) * (0-(4.98997)));
        }
        else if (tickAnim >= 38 && tickAnim < 44) {
            xx = 0 + (((tickAnim - 38) / 6) * (0-(0)));
            yy = 0 + (((tickAnim - 38) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 38) / 6) * (0-(0)));
        }
        else if (tickAnim >= 44 && tickAnim < 51) {
            xx = 0 + (((tickAnim - 44) / 7) * (-34.38654-(0)));
            yy = 0 + (((tickAnim - 44) / 7) * (-17.29769-(0)));
            zz = 0 + (((tickAnim - 44) / 7) * (7.48258-(0)));
        }
        else if (tickAnim >= 51 && tickAnim < 56) {
            xx = -34.38654 + (((tickAnim - 51) / 5) * (-30.98172-(-34.38654)));
            yy = -17.29769 + (((tickAnim - 51) / 5) * (-21.50842-(-17.29769)));
            zz = 7.48258 + (((tickAnim - 51) / 5) * (7.11791-(7.48258)));
        }
        else if (tickAnim >= 56 && tickAnim < 72) {
            xx = -30.98172 + (((tickAnim - 56) / 16) * (0-(-30.98172)));
            yy = -21.50842 + (((tickAnim - 56) / 16) * (0-(-21.50842)));
            zz = 7.11791 + (((tickAnim - 56) / 16) * (0-(7.11791)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(armright, armright.rotateAngleX + (float) Math.toRadians(xx), armright.rotateAngleY + (float) Math.toRadians(yy), armright.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 7) {
            xx = 0 + (((tickAnim - 0) / 7) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 7) * (-68.64-(0)));
            zz = 0 + (((tickAnim - 0) / 7) * (0-(0)));
        }
        else if (tickAnim >= 7 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 7) / 3) * (0-(0)));
            yy = -68.64 + (((tickAnim - 7) / 3) * (-58.03-(-68.64)));
            zz = 0 + (((tickAnim - 7) / 3) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 18) {
            xx = 0 + (((tickAnim - 10) / 8) * (0-(0)));
            yy = -58.03 + (((tickAnim - 10) / 8) * (-68.64-(-58.03)));
            zz = 0 + (((tickAnim - 10) / 8) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 26) {
            xx = 0 + (((tickAnim - 18) / 8) * (0-(0)));
            yy = -68.64 + (((tickAnim - 18) / 8) * (-50-(-68.64)));
            zz = 0 + (((tickAnim - 18) / 8) * (0-(0)));
        }
        else if (tickAnim >= 26 && tickAnim < 31) {
            xx = 0 + (((tickAnim - 26) / 5) * (0-(0)));
            yy = -50 + (((tickAnim - 26) / 5) * (-22.5-(-50)));
            zz = 0 + (((tickAnim - 26) / 5) * (0-(0)));
        }
        else if (tickAnim >= 31 && tickAnim < 38) {
            xx = 0 + (((tickAnim - 31) / 7) * (0-(0)));
            yy = -22.5 + (((tickAnim - 31) / 7) * (0-(-22.5)));
            zz = 0 + (((tickAnim - 31) / 7) * (0-(0)));
        }
        else if (tickAnim >= 38 && tickAnim < 48) {
            xx = 0 + (((tickAnim - 38) / 10) * (0-(0)));
            yy = 0 + (((tickAnim - 38) / 10) * (-25-(0)));
            zz = 0 + (((tickAnim - 38) / 10) * (0-(0)));
        }
        else if (tickAnim >= 48 && tickAnim < 63) {
            xx = 0 + (((tickAnim - 48) / 15) * (-19.71878-(0)));
            yy = -25 + (((tickAnim - 48) / 15) * (-6.54517-(-25)));
            zz = 0 + (((tickAnim - 48) / 15) * (24.59342-(0)));
        }
        else if (tickAnim >= 63 && tickAnim < 72) {
            xx = -19.71878 + (((tickAnim - 63) / 9) * (0-(-19.71878)));
            yy = -6.54517 + (((tickAnim - 63) / 9) * (0-(-6.54517)));
            zz = 24.59342 + (((tickAnim - 63) / 9) * (0-(24.59342)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(armright2, armright2.rotateAngleX + (float) Math.toRadians(xx), armright2.rotateAngleY + (float) Math.toRadians(yy), armright2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 12) {
            xx = 0 + (((tickAnim - 0) / 12) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 12) * (-12.73-(0)));
            zz = 0 + (((tickAnim - 0) / 12) * (0-(0)));
        }
        else if (tickAnim >= 12 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 12) / 3) * (0-(0)));
            yy = -12.73 + (((tickAnim - 12) / 3) * (-18.51-(-12.73)));
            zz = 0 + (((tickAnim - 12) / 3) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 38) {
            xx = 0 + (((tickAnim - 15) / 23) * (0-(0)));
            yy = -18.51 + (((tickAnim - 15) / 23) * (0-(-18.51)));
            zz = 0 + (((tickAnim - 15) / 23) * (0-(0)));
        }
        else if (tickAnim >= 38 && tickAnim < 44) {
            xx = 0 + (((tickAnim - 38) / 6) * (0-(0)));
            yy = 0 + (((tickAnim - 38) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 38) / 6) * (0-(0)));
        }
        else if (tickAnim >= 44 && tickAnim < 48) {
            xx = 0 + (((tickAnim - 44) / 4) * (-38.17128-(0)));
            yy = 0 + (((tickAnim - 44) / 4) * (-96.59202-(0)));
            zz = 0 + (((tickAnim - 44) / 4) * (22.77917-(0)));
        }
        else if (tickAnim >= 48 && tickAnim < 56) {
            xx = -38.17128 + (((tickAnim - 48) / 8) * (-1.10693-(-38.17128)));
            yy = -96.59202 + (((tickAnim - 48) / 8) * (-62.54833-(-96.59202)));
            zz = 22.77917 + (((tickAnim - 48) / 8) * (-5.12076-(22.77917)));
        }
        else if (tickAnim >= 56 && tickAnim < 57) {
            xx = -1.10693 + (((tickAnim - 56) / 1) * (31.59842-(-1.10693)));
            yy = -62.54833 + (((tickAnim - 56) / 1) * (-58.22361-(-62.54833)));
            zz = -5.12076 + (((tickAnim - 56) / 1) * (-1.35202-(-5.12076)));
        }
        else if (tickAnim >= 57 && tickAnim < 59) {
            xx = 31.59842 + (((tickAnim - 57) / 2) * (37.20122-(31.59842)));
            yy = -58.22361 + (((tickAnim - 57) / 2) * (-48.19817-(-58.22361)));
            zz = -1.35202 + (((tickAnim - 57) / 2) * (14.54048-(-1.35202)));
        }
        else if (tickAnim >= 59 && tickAnim < 63) {
            xx = 37.20122 + (((tickAnim - 59) / 4) * (40.74122-(37.20122)));
            yy = -48.19817 + (((tickAnim - 59) / 4) * (-23.62583-(-48.19817)));
            zz = 14.54048 + (((tickAnim - 59) / 4) * (28.79789-(14.54048)));
        }
        else if (tickAnim >= 63 && tickAnim < 65) {
            xx = 40.74122 + (((tickAnim - 63) / 2) * (79.33571-(40.74122)));
            yy = -23.62583 + (((tickAnim - 63) / 2) * (3.29889-(-23.62583)));
            zz = 28.79789 + (((tickAnim - 63) / 2) * (87.85483-(28.79789)));
        }
        else if (tickAnim >= 65 && tickAnim < 69) {
            xx = 79.33571 + (((tickAnim - 65) / 4) * (4.75346-(79.33571)));
            yy = 3.29889 + (((tickAnim - 65) / 4) * (-42.81174-(3.29889)));
            zz = 87.85483 + (((tickAnim - 65) / 4) * (8.87221-(87.85483)));
        }
        else if (tickAnim >= 69 && tickAnim < 72) {
            xx = 4.75346 + (((tickAnim - 69) / 3) * (0-(4.75346)));
            yy = -42.81174 + (((tickAnim - 69) / 3) * (0-(-42.81174)));
            zz = 8.87221 + (((tickAnim - 69) / 3) * (0-(8.87221)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(armright3, armright3.rotateAngleX + (float) Math.toRadians(xx), armright3.rotateAngleY + (float) Math.toRadians(yy), armright3.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 2) {
            xx = 0 + (((tickAnim - 0) / 2) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 2) * (0-(0)));
        }
        else if (tickAnim >= 2 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 2) / 3) * (-5.86699-(0)));
            yy = 0 + (((tickAnim - 2) / 3) * (-13.92259-(0)));
            zz = 0 + (((tickAnim - 2) / 3) * (9.6755-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 7) {
            xx = -5.86699 + (((tickAnim - 5) / 2) * (0-(-5.86699)));
            yy = -13.92259 + (((tickAnim - 5) / 2) * (-22.5-(-13.92259)));
            zz = 9.6755 + (((tickAnim - 5) / 2) * (0-(9.6755)));
        }
        else if (tickAnim >= 7 && tickAnim < 14) {
            xx = 0 + (((tickAnim - 7) / 7) * (0-(0)));
            yy = -22.5 + (((tickAnim - 7) / 7) * (-22.5-(-22.5)));
            zz = 0 + (((tickAnim - 7) / 7) * (0-(0)));
        }
        else if (tickAnim >= 14 && tickAnim < 17) {
            xx = 0 + (((tickAnim - 14) / 3) * (-11.40653-(0)));
            yy = -22.5 + (((tickAnim - 14) / 3) * (-19.41929-(-22.5)));
            zz = 0 + (((tickAnim - 14) / 3) * (6.01923-(0)));
        }
        else if (tickAnim >= 17 && tickAnim < 19) {
            xx = -11.40653 + (((tickAnim - 17) / 2) * (0-(-11.40653)));
            yy = -19.41929 + (((tickAnim - 17) / 2) * (-13.75-(-19.41929)));
            zz = 6.01923 + (((tickAnim - 17) / 2) * (0-(6.01923)));
        }
        else if (tickAnim >= 19 && tickAnim < 31) {
            xx = 0 + (((tickAnim - 19) / 12) * (0-(0)));
            yy = -13.75 + (((tickAnim - 19) / 12) * (-13.75-(-13.75)));
            zz = 0 + (((tickAnim - 19) / 12) * (0-(0)));
        }
        else if (tickAnim >= 31 && tickAnim < 35) {
            xx = 0 + (((tickAnim - 31) / 4) * (-11.82681-(0)));
            yy = -13.75 + (((tickAnim - 31) / 4) * (-6.7461-(-13.75)));
            zz = 0 + (((tickAnim - 31) / 4) * (7.55963-(0)));
        }
        else if (tickAnim >= 35 && tickAnim < 39) {
            xx = -11.82681 + (((tickAnim - 35) / 4) * (0-(-11.82681)));
            yy = -6.7461 + (((tickAnim - 35) / 4) * (0-(-6.7461)));
            zz = 7.55963 + (((tickAnim - 35) / 4) * (0-(7.55963)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(legright, legright.rotateAngleX + (float) Math.toRadians(xx), legright.rotateAngleY + (float) Math.toRadians(yy), legright.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 29 && tickAnim < 32) {
            xx = 0 + (((tickAnim - 29) / 3) * (-2.36616-(0)));
            yy = 0 + (((tickAnim - 29) / 3) * (6.81137-(0)));
            zz = 0 + (((tickAnim - 29) / 3) * (-10.26013-(0)));
        }
        else if (tickAnim >= 32 && tickAnim < 35) {
            xx = -2.36616 + (((tickAnim - 32) / 3) * (0-(-2.36616)));
            yy = 6.81137 + (((tickAnim - 32) / 3) * (12.5-(6.81137)));
            zz = -10.26013 + (((tickAnim - 32) / 3) * (0-(-10.26013)));
        }
        else if (tickAnim >= 35 && tickAnim < 54) {
            xx = 0 + (((tickAnim - 35) / 19) * (0-(0)));
            yy = 12.5 + (((tickAnim - 35) / 19) * (12.5-(12.5)));
            zz = 0 + (((tickAnim - 35) / 19) * (0-(0)));
        }
        else if (tickAnim >= 54 && tickAnim < 58) {
            xx = 0 + (((tickAnim - 54) / 4) * (-2.36616-(0)));
            yy = 12.5 + (((tickAnim - 54) / 4) * (6.81137-(12.5)));
            zz = 0 + (((tickAnim - 54) / 4) * (-10.26013-(0)));
        }
        else if (tickAnim >= 58 && tickAnim < 62) {
            xx = -2.36616 + (((tickAnim - 58) / 4) * (0-(-2.36616)));
            yy = 6.81137 + (((tickAnim - 58) / 4) * (0-(6.81137)));
            zz = -10.26013 + (((tickAnim - 58) / 4) * (0-(-10.26013)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(armleft, armleft.rotateAngleX + (float) Math.toRadians(xx), armleft.rotateAngleY + (float) Math.toRadians(yy), armleft.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 29 && tickAnim < 35) {
            xx = 0 + (((tickAnim - 29) / 6) * (-11.60122-(0)));
            yy = 0 + (((tickAnim - 29) / 6) * (7.36823-(0)));
            zz = 0 + (((tickAnim - 29) / 6) * (-2.12738-(0)));
        }
        else if (tickAnim >= 35 && tickAnim < 54) {
            xx = -11.60122 + (((tickAnim - 35) / 19) * (-11.60122-(-11.60122)));
            yy = 7.36823 + (((tickAnim - 35) / 19) * (7.36823-(7.36823)));
            zz = -2.12738 + (((tickAnim - 35) / 19) * (-2.12738-(-2.12738)));
        }
        else if (tickAnim >= 54 && tickAnim < 62) {
            xx = -11.60122 + (((tickAnim - 54) / 8) * (0-(-11.60122)));
            yy = 7.36823 + (((tickAnim - 54) / 8) * (0-(7.36823)));
            zz = -2.12738 + (((tickAnim - 54) / 8) * (0-(-2.12738)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(armleft2, armleft2.rotateAngleX + (float) Math.toRadians(xx), armleft2.rotateAngleY + (float) Math.toRadians(yy), armleft2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 29 && tickAnim < 35) {
            xx = 0 + (((tickAnim - 29) / 6) * (0-(0)));
            yy = 0 + (((tickAnim - 29) / 6) * (37.5-(0)));
            zz = 0 + (((tickAnim - 29) / 6) * (0-(0)));
        }
        else if (tickAnim >= 35 && tickAnim < 54) {
            xx = 0 + (((tickAnim - 35) / 19) * (0-(0)));
            yy = 37.5 + (((tickAnim - 35) / 19) * (37.5-(37.5)));
            zz = 0 + (((tickAnim - 35) / 19) * (0-(0)));
        }
        else if (tickAnim >= 54 && tickAnim < 62) {
            xx = 0 + (((tickAnim - 54) / 8) * (0-(0)));
            yy = 37.5 + (((tickAnim - 54) / 8) * (0-(37.5)));
            zz = 0 + (((tickAnim - 54) / 8) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(armleft3, armleft3.rotateAngleX + (float) Math.toRadians(xx), armleft3.rotateAngleY + (float) Math.toRadians(yy), armleft3.rotateAngleZ + (float) Math.toRadians(zz));
        
    }
    public void animRunning(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime) {
        EntityPrehistoricFloraSantanmantis entity = (EntityPrehistoricFloraSantanmantis) entitylivingbaseIn;
        int animCycle = 9;
        double tickAnim = (entity.ticksExisted + entity.getTickOffset()) - (int) (Math.floor((double) (entity.ticksExisted + entity.getTickOffset()) / (double) animCycle) * (double) animCycle) + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;
        this.setRotateAngle(base, base.rotateAngleX + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*750*2))*2), base.rotateAngleY + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*750+100))*2), base.rotateAngleZ + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*750-90))*4));
        this.base.rotationPointX = this.base.rotationPointX + (float)(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*750-60))*0.1);
        this.base.rotationPointY = this.base.rotationPointY - (float)(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*750*2-60))*0.1);
        this.base.rotationPointZ = this.base.rotationPointZ + (float)(0);



        if (tickAnim >= 0 && tickAnim < 2) {
            xx = 0 + (((tickAnim - 0) / 2) * (-37.25283-(0)));
            yy = -15 + (((tickAnim - 0) / 2) * (10.36778-(-15)));
            zz = 0 + (((tickAnim - 0) / 2) * (-0.70353-(0)));
        }
        else if (tickAnim >= 2 && tickAnim < 5) {
            xx = -37.25283 + (((tickAnim - 2) / 3) * (-61.22627-(-37.25283)));
            yy = 10.36778 + (((tickAnim - 2) / 3) * (27.03629-(10.36778)));
            zz = -0.70353 + (((tickAnim - 2) / 3) * (23.75047-(-0.70353)));
        }
        else if (tickAnim >= 5 && tickAnim < 10) {
            xx = -61.22627 + (((tickAnim - 5) / 5) * (0-(-61.22627)));
            yy = 27.03629 + (((tickAnim - 5) / 5) * (-15-(27.03629)));
            zz = 23.75047 + (((tickAnim - 5) / 5) * (0-(23.75047)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(legleft, legleft.rotateAngleX + (float) Math.toRadians(xx), legleft.rotateAngleY + (float) Math.toRadians(yy), legleft.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 2) {
            xx = -128.80436 + (((tickAnim - 0) / 2) * (-7.2517-(-128.80436)));
            yy = -2.43619 + (((tickAnim - 0) / 2) * (-7.20772-(-2.43619)));
            zz = -119.38966 + (((tickAnim - 0) / 2) * (16.82995-(-119.38966)));
        }
        else if (tickAnim >= 2 && tickAnim < 5) {
            xx = -7.2517 + (((tickAnim - 2) / 3) * (13.06877-(-7.2517)));
            yy = -7.20772 + (((tickAnim - 2) / 3) * (-13.22026-(-7.20772)));
            zz = 16.82995 + (((tickAnim - 2) / 3) * (13.8756-(16.82995)));
        }
        else if (tickAnim >= 5 && tickAnim < 7) {
            xx = 13.06877 + (((tickAnim - 5) / 2) * (-70.3678-(13.06877)));
            yy = -13.22026 + (((tickAnim - 5) / 2) * (-7.82823-(-13.22026)));
            zz = 13.8756 + (((tickAnim - 5) / 2) * (-52.75703-(13.8756)));
        }
        else if (tickAnim >= 7 && tickAnim < 9) {
            xx = -70.3678 + (((tickAnim - 7) / 2) * (-116.82551-(-70.3678)));
            yy = -7.82823 + (((tickAnim - 7) / 2) * (-4.23354-(-7.82823)));
            zz = -52.75703 + (((tickAnim - 7) / 2) * (-97.17879-(-52.75703)));
        }
        else if (tickAnim >= 9 && tickAnim < 10) {
            xx = -116.82551 + (((tickAnim - 9) / 1) * (-128.80436-(-116.82551)));
            yy = -4.23354 + (((tickAnim - 9) / 1) * (-2.43619-(-4.23354)));
            zz = -97.17879 + (((tickAnim - 9) / 1) * (-119.38966-(-97.17879)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(legright2, legright2.rotateAngleX + (float) Math.toRadians(xx), legright2.rotateAngleY + (float) Math.toRadians(yy), legright2.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 2) {
            xx = -1.25 + (((tickAnim - 0) / 2) * (-0.5-(-1.25)));
            yy = 0 + (((tickAnim - 0) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 2) * (-0.5-(0)));
        }
        else if (tickAnim >= 2 && tickAnim < 5) {
            xx = -0.5 + (((tickAnim - 2) / 3) * (0.5-(-0.5)));
            yy = 0 + (((tickAnim - 2) / 3) * (0-(0)));
            zz = -0.5 + (((tickAnim - 2) / 3) * (-1-(-0.5)));
        }
        else if (tickAnim >= 5 && tickAnim < 10) {
            xx = 0.5 + (((tickAnim - 5) / 5) * (-1.25-(0.5)));
            yy = 0 + (((tickAnim - 5) / 5) * (0-(0)));
            zz = -1 + (((tickAnim - 5) / 5) * (0-(-1)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.legright2.rotationPointX = this.legright2.rotationPointX + (float)(xx);
        this.legright2.rotationPointY = this.legright2.rotationPointY - (float)(yy);
        this.legright2.rotationPointZ = this.legright2.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 2) {
            xx = 13.06877 + (((tickAnim - 0) / 2) * (-70.3678-(13.06877)));
            yy = 13.22026 + (((tickAnim - 0) / 2) * (7.82823-(13.22026)));
            zz = -13.8756 + (((tickAnim - 0) / 2) * (52.75703-(-13.8756)));
        }
        else if (tickAnim >= 2 && tickAnim < 4) {
            xx = -70.3678 + (((tickAnim - 2) / 2) * (-116.82551-(-70.3678)));
            yy = 7.82823 + (((tickAnim - 2) / 2) * (4.23354-(7.82823)));
            zz = 52.75703 + (((tickAnim - 2) / 2) * (97.17879-(52.75703)));
        }
        else if (tickAnim >= 4 && tickAnim < 5) {
            xx = -116.82551 + (((tickAnim - 4) / 1) * (-128.80436-(-116.82551)));
            yy = 4.23354 + (((tickAnim - 4) / 1) * (2.43619-(4.23354)));
            zz = 97.17879 + (((tickAnim - 4) / 1) * (119.38966-(97.17879)));
        }
        else if (tickAnim >= 5 && tickAnim < 7) {
            xx = -128.80436 + (((tickAnim - 5) / 2) * (-7.2517-(-128.80436)));
            yy = 2.43619 + (((tickAnim - 5) / 2) * (7.20772-(2.43619)));
            zz = 119.38966 + (((tickAnim - 5) / 2) * (-16.82995-(119.38966)));
        }
        else if (tickAnim >= 7 && tickAnim < 10) {
            xx = -7.2517 + (((tickAnim - 7) / 3) * (13.06877-(-7.2517)));
            yy = 7.20772 + (((tickAnim - 7) / 3) * (13.22026-(7.20772)));
            zz = -16.82995 + (((tickAnim - 7) / 3) * (-13.8756-(-16.82995)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(legleft2, legleft2.rotateAngleX + (float) Math.toRadians(xx), legleft2.rotateAngleY + (float) Math.toRadians(yy), legleft2.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 5) {
            xx = -0.5 + (((tickAnim - 0) / 5) * (1.25-(-0.5)));
            yy = 0 + (((tickAnim - 0) / 5) * (0-(0)));
            zz = -1 + (((tickAnim - 0) / 5) * (0-(-1)));
        }
        else if (tickAnim >= 5 && tickAnim < 7) {
            xx = 1.25 + (((tickAnim - 5) / 2) * (0.5-(1.25)));
            yy = 0 + (((tickAnim - 5) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 5) / 2) * (-0.5-(0)));
        }
        else if (tickAnim >= 7 && tickAnim < 10) {
            xx = 0.5 + (((tickAnim - 7) / 3) * (-0.5-(0.5)));
            yy = 0 + (((tickAnim - 7) / 3) * (0-(0)));
            zz = -0.5 + (((tickAnim - 7) / 3) * (-1-(-0.5)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.legleft2.rotationPointX = this.legleft2.rotationPointX + (float)(xx);
        this.legleft2.rotationPointY = this.legleft2.rotationPointY - (float)(yy);
        this.legleft2.rotationPointZ = this.legleft2.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 5) {
            xx = -61.25063 + (((tickAnim - 0) / 5) * (0-(-61.25063)));
            yy = -26.97233 + (((tickAnim - 0) / 5) * (15-(-26.97233)));
            zz = -24.25749 + (((tickAnim - 0) / 5) * (0-(-24.25749)));
        }
        else if (tickAnim >= 5 && tickAnim < 7) {
            xx = 0 + (((tickAnim - 5) / 2) * (-37.25283-(0)));
            yy = 15 + (((tickAnim - 5) / 2) * (-10.36778-(15)));
            zz = 0 + (((tickAnim - 5) / 2) * (0.70353-(0)));
        }
        else if (tickAnim >= 7 && tickAnim < 10) {
            xx = -37.25283 + (((tickAnim - 7) / 3) * (-61.25063-(-37.25283)));
            yy = -10.36778 + (((tickAnim - 7) / 3) * (-26.97233-(-10.36778)));
            zz = 0.70353 + (((tickAnim - 7) / 3) * (-24.25749-(0.70353)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(legright, legright.rotateAngleX + (float) Math.toRadians(xx), legright.rotateAngleY + (float) Math.toRadians(yy), legright.rotateAngleZ + (float) Math.toRadians(zz));



        this.setRotateAngle(antennaright, antennaright.rotateAngleX + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*750))*5), antennaright.rotateAngleY + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*750))*10), antennaright.rotateAngleZ + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*750-30))*5));



        if (tickAnim >= 0 && tickAnim < 5) {
            xx = -22.35177 + (((tickAnim - 0) / 5) * (8.625-(-22.35177)));
            yy = -16.99278 + (((tickAnim - 0) / 5) * (-33.47848-(-16.99278)));
            zz = 14.9814 + (((tickAnim - 0) / 5) * (-13.11094-(14.9814)));
        }
        else if (tickAnim >= 5 && tickAnim < 10) {
            xx = 8.625 + (((tickAnim - 5) / 5) * (-22.35177-(8.625)));
            yy = -33.47848 + (((tickAnim - 5) / 5) * (-16.99278-(-33.47848)));
            zz = -13.11094 + (((tickAnim - 5) / 5) * (14.9814-(-13.11094)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(armright, armright.rotateAngleX + (float) Math.toRadians(xx), armright.rotateAngleY + (float) Math.toRadians(yy), armright.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 2) {
            xx = -5.28785 + (((tickAnim - 0) / 2) * (-10.18575-(-5.28785)));
            yy = 15.46259 + (((tickAnim - 0) / 2) * (-18.02613-(15.46259)));
            zz = 11.50175 + (((tickAnim - 0) / 2) * (17.98715-(11.50175)));
        }
        else if (tickAnim >= 2 && tickAnim < 5) {
            xx = -10.18575 + (((tickAnim - 2) / 3) * (-5.16524-(-10.18575)));
            yy = -18.02613 + (((tickAnim - 2) / 3) * (17.9522-(-18.02613)));
            zz = 17.98715 + (((tickAnim - 2) / 3) * (11.24314-(17.98715)));
        }
        else if (tickAnim >= 5 && tickAnim < 10) {
            xx = -5.16524 + (((tickAnim - 5) / 5) * (-5.28785-(-5.16524)));
            yy = 17.9522 + (((tickAnim - 5) / 5) * (15.46259-(17.9522)));
            zz = 11.24314 + (((tickAnim - 5) / 5) * (11.50175-(11.24314)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(armright2, armright2.rotateAngleX + (float) Math.toRadians(xx), armright2.rotateAngleY + (float) Math.toRadians(yy), armright2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 2) {
            xx = -4.54283 + (((tickAnim - 0) / 2) * (-16.94449-(-4.54283)));
            yy = -0.34386 + (((tickAnim - 0) / 2) * (-13.06296-(-0.34386)));
            zz = 9.14996 + (((tickAnim - 0) / 2) * (-1.03673-(9.14996)));
        }
        else if (tickAnim >= 2 && tickAnim < 5) {
            xx = -16.94449 + (((tickAnim - 2) / 3) * (-20-(-16.94449)));
            yy = -13.06296 + (((tickAnim - 2) / 3) * (-50-(-13.06296)));
            zz = -1.03673 + (((tickAnim - 2) / 3) * (0-(-1.03673)));
        }
        else if (tickAnim >= 5 && tickAnim < 10) {
            xx = -20 + (((tickAnim - 5) / 5) * (-4.54283-(-20)));
            yy = -50 + (((tickAnim - 5) / 5) * (-0.34386-(-50)));
            zz = 0 + (((tickAnim - 5) / 5) * (9.14996-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(armright3, armright3.rotateAngleX + (float) Math.toRadians(xx), armright3.rotateAngleY + (float) Math.toRadians(yy), armright3.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 5) {
            xx = 8.625 + (((tickAnim - 0) / 5) * (-22.35789-(8.625)));
            yy = 33.47848 + (((tickAnim - 0) / 5) * (16.81595-(33.47848)));
            zz = 13.11094 + (((tickAnim - 0) / 5) * (-13.99963-(13.11094)));
        }
        else if (tickAnim >= 5 && tickAnim < 10) {
            xx = -22.35789 + (((tickAnim - 5) / 5) * (8.625-(-22.35789)));
            yy = 16.81595 + (((tickAnim - 5) / 5) * (33.47848-(16.81595)));
            zz = -13.99963 + (((tickAnim - 5) / 5) * (13.11094-(-13.99963)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(armleft, armleft.rotateAngleX + (float) Math.toRadians(xx), armleft.rotateAngleY + (float) Math.toRadians(yy), armleft.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 5) {
            xx = -5.16524 + (((tickAnim - 0) / 5) * (-5.28785-(-5.16524)));
            yy = -17.9522 + (((tickAnim - 0) / 5) * (-15.46259-(-17.9522)));
            zz = -11.24314 + (((tickAnim - 0) / 5) * (-11.50175-(-11.24314)));
        }
        else if (tickAnim >= 5 && tickAnim < 7) {
            xx = -5.28785 + (((tickAnim - 5) / 2) * (-10.18575-(-5.28785)));
            yy = -15.46259 + (((tickAnim - 5) / 2) * (18.02613-(-15.46259)));
            zz = -11.50175 + (((tickAnim - 5) / 2) * (-17.98715-(-11.50175)));
        }
        else if (tickAnim >= 7 && tickAnim < 10) {
            xx = -10.18575 + (((tickAnim - 7) / 3) * (-5.16524-(-10.18575)));
            yy = 18.02613 + (((tickAnim - 7) / 3) * (-17.9522-(18.02613)));
            zz = -17.98715 + (((tickAnim - 7) / 3) * (-11.24314-(-17.98715)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(armleft2, armleft2.rotateAngleX + (float) Math.toRadians(xx), armleft2.rotateAngleY + (float) Math.toRadians(yy), armleft2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 5) {
            xx = -20 + (((tickAnim - 0) / 5) * (-4.54283-(-20)));
            yy = 50 + (((tickAnim - 0) / 5) * (0.34386-(50)));
            zz = 0 + (((tickAnim - 0) / 5) * (-9.14996-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 7) {
            xx = -4.54283 + (((tickAnim - 5) / 2) * (-16.94449-(-4.54283)));
            yy = 0.34386 + (((tickAnim - 5) / 2) * (13.06296-(0.34386)));
            zz = -9.14996 + (((tickAnim - 5) / 2) * (1.03673-(-9.14996)));
        }
        else if (tickAnim >= 7 && tickAnim < 10) {
            xx = -16.94449 + (((tickAnim - 7) / 3) * (-20-(-16.94449)));
            yy = 13.06296 + (((tickAnim - 7) / 3) * (50-(13.06296)));
            zz = 1.03673 + (((tickAnim - 7) / 3) * (0-(1.03673)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(armleft3, armleft3.rotateAngleX + (float) Math.toRadians(xx), armleft3.rotateAngleY + (float) Math.toRadians(yy), armleft3.rotateAngleZ + (float) Math.toRadians(zz));



        this.setRotateAngle(antennaleft, antennaleft.rotateAngleX + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*750))*10), antennaleft.rotateAngleY + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*750-60))*10), antennaleft.rotateAngleZ + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*750-30))*10));
       
    }
    public void animGliding(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime) {
        EntityPrehistoricFloraSantanmantis entity = (EntityPrehistoricFloraSantanmantis) entitylivingbaseIn;
        int animCycle = 19;
        double tickAnim = (entity.ticksExisted + entity.getTickOffset()) - (int) (Math.floor((double) (entity.ticksExisted + entity.getTickOffset()) / (double) animCycle) * (double) animCycle) + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;
        this.setRotateAngle(base, base.rotateAngleX + (float) Math.toRadians(-12.5+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*750+120))*5), base.rotateAngleY + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*750/2-60))*5), base.rotateAngleZ + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*750/2+120))*8));
        this.base.rotationPointX = this.base.rotationPointX + (float)(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*750/2+60))*1);
        this.base.rotationPointY = this.base.rotationPointY - (float)(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*750/2))*1);
        this.base.rotationPointZ = this.base.rotationPointZ + (float)(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*750*6/2+60))*0.1);


        this.setRotateAngle(legleft, legleft.rotateAngleX + (float) Math.toRadians(-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*750/2))*7), legleft.rotateAngleY + (float) Math.toRadians(0), legleft.rotateAngleZ + (float) Math.toRadians(22.5));


        this.setRotateAngle(legright2, legright2.rotateAngleX + (float) Math.toRadians(50-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*750/2))*5), legright2.rotateAngleY + (float) Math.toRadians(0), legright2.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(legleft2, legleft2.rotateAngleX + (float) Math.toRadians(50-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*750/2+30))*5), legleft2.rotateAngleY + (float) Math.toRadians(0), legleft2.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(legright, legright.rotateAngleX + (float) Math.toRadians(-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*750/2+20))*7), legright.rotateAngleY + (float) Math.toRadians(0), legright.rotateAngleZ + (float) Math.toRadians(-22.5));


        this.setRotateAngle(antennaright, antennaright.rotateAngleX + (float) Math.toRadians(0), antennaright.rotateAngleY + (float) Math.toRadians(0), antennaright.rotateAngleZ + (float) Math.toRadians(-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*750/2+20))*10));


        this.setRotateAngle(armright, armright.rotateAngleX + (float) Math.toRadians(0.1627), armright.rotateAngleY + (float) Math.toRadians(-9.9697), armright.rotateAngleZ + (float) Math.toRadians(-15.79572));


        this.setRotateAngle(armright2, armright2.rotateAngleX + (float) Math.toRadians(0), armright2.rotateAngleY + (float) Math.toRadians(-17.5-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*750/2+30))*5), armright2.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(armright3, armright3.rotateAngleX + (float) Math.toRadians(0), armright3.rotateAngleY + (float) Math.toRadians(-55-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*750/2))*5), armright3.rotateAngleZ + (float) Math.toRadians(0));



        if (tickAnim >= 0 && tickAnim < 1) {
            xx = -130.20591 + (((tickAnim - 0) / 1) * (-88.64001-(-130.20591)));
            yy = 105.68197 + (((tickAnim - 0) / 1) * (91.26623-(105.68197)));
            zz = 74.02766 + (((tickAnim - 0) / 1) * (140.0206-(74.02766)));
        }
        else if (tickAnim >= 1 && tickAnim < 2) {
            xx = -88.64001 + (((tickAnim - 1) / 1) * (-153.95367-(-88.64001)));
            yy = 91.26623 + (((tickAnim - 1) / 1) * (86.70162-(91.26623)));
            zz = 140.0206 + (((tickAnim - 1) / 1) * (163.3699-(140.0206)));
        }
        else if (tickAnim >= 2 && tickAnim < 2) {
            xx = -153.95367 + (((tickAnim - 2) / 0) * (-190.40347-(-153.95367)));
            yy = 86.70162 + (((tickAnim - 2) / 0) * (85.94974-(86.70162)));
            zz = 163.3699 + (((tickAnim - 2) / 0) * (128.81354-(163.3699)));
        }
        else if (tickAnim >= 2 && tickAnim < 3) {
            xx = -190.40347 + (((tickAnim - 2) / 1) * (-130.20591-(-190.40347)));
            yy = 85.94974 + (((tickAnim - 2) / 1) * (105.68197-(85.94974)));
            zz = 128.81354 + (((tickAnim - 2) / 1) * (74.02766-(128.81354)));
        }
        else if (tickAnim >= 3 && tickAnim < 4) {
            xx = -130.20591 + (((tickAnim - 3) / 1) * (-88.64001-(-130.20591)));
            yy = 105.68197 + (((tickAnim - 3) / 1) * (91.26623-(105.68197)));
            zz = 74.02766 + (((tickAnim - 3) / 1) * (140.0206-(74.02766)));
        }
        else if (tickAnim >= 4 && tickAnim < 5) {
            xx = -88.64001 + (((tickAnim - 4) / 1) * (-153.95367-(-88.64001)));
            yy = 91.26623 + (((tickAnim - 4) / 1) * (86.70162-(91.26623)));
            zz = 140.0206 + (((tickAnim - 4) / 1) * (163.3699-(140.0206)));
        }
        else if (tickAnim >= 5 && tickAnim < 6) {
            xx = -153.95367 + (((tickAnim - 5) / 1) * (-190.40347-(-153.95367)));
            yy = 86.70162 + (((tickAnim - 5) / 1) * (85.94974-(86.70162)));
            zz = 163.3699 + (((tickAnim - 5) / 1) * (128.81354-(163.3699)));
        }
        else if (tickAnim >= 6 && tickAnim < 6) {
            xx = -190.40347 + (((tickAnim - 6) / 0) * (-130.20591-(-190.40347)));
            yy = 85.94974 + (((tickAnim - 6) / 0) * (105.68197-(85.94974)));
            zz = 128.81354 + (((tickAnim - 6) / 0) * (74.02766-(128.81354)));
        }
        else if (tickAnim >= 6 && tickAnim < 7) {
            xx = -130.20591 + (((tickAnim - 6) / 1) * (-88.64001-(-130.20591)));
            yy = 105.68197 + (((tickAnim - 6) / 1) * (91.26623-(105.68197)));
            zz = 74.02766 + (((tickAnim - 6) / 1) * (140.0206-(74.02766)));
        }
        else if (tickAnim >= 7 && tickAnim < 8) {
            xx = -88.64001 + (((tickAnim - 7) / 1) * (-153.95367-(-88.64001)));
            yy = 91.26623 + (((tickAnim - 7) / 1) * (86.70162-(91.26623)));
            zz = 140.0206 + (((tickAnim - 7) / 1) * (163.3699-(140.0206)));
        }
        else if (tickAnim >= 8 && tickAnim < 9) {
            xx = -153.95367 + (((tickAnim - 8) / 1) * (-190.40347-(-153.95367)));
            yy = 86.70162 + (((tickAnim - 8) / 1) * (85.94974-(86.70162)));
            zz = 163.3699 + (((tickAnim - 8) / 1) * (128.81354-(163.3699)));
        }
        else if (tickAnim >= 9 && tickAnim < 10) {
            xx = -190.40347 + (((tickAnim - 9) / 1) * (-130.20591-(-190.40347)));
            yy = 85.94974 + (((tickAnim - 9) / 1) * (105.68197-(85.94974)));
            zz = 128.81354 + (((tickAnim - 9) / 1) * (74.02766-(128.81354)));
        }
        else if (tickAnim >= 10 && tickAnim < 10) {
            xx = -130.20591 + (((tickAnim - 10) / 0) * (-88.64001-(-130.20591)));
            yy = 105.68197 + (((tickAnim - 10) / 0) * (91.26623-(105.68197)));
            zz = 74.02766 + (((tickAnim - 10) / 0) * (140.0206-(74.02766)));
        }
        else if (tickAnim >= 10 && tickAnim < 11) {
            xx = -88.64001 + (((tickAnim - 10) / 1) * (-153.95367-(-88.64001)));
            yy = 91.26623 + (((tickAnim - 10) / 1) * (86.70162-(91.26623)));
            zz = 140.0206 + (((tickAnim - 10) / 1) * (163.3699-(140.0206)));
        }
        else if (tickAnim >= 11 && tickAnim < 12) {
            xx = -153.95367 + (((tickAnim - 11) / 1) * (-190.40347-(-153.95367)));
            yy = 86.70162 + (((tickAnim - 11) / 1) * (85.94974-(86.70162)));
            zz = 163.3699 + (((tickAnim - 11) / 1) * (128.81354-(163.3699)));
        }
        else if (tickAnim >= 12 && tickAnim < 13) {
            xx = -190.40347 + (((tickAnim - 12) / 1) * (-130.20591-(-190.40347)));
            yy = 85.94974 + (((tickAnim - 12) / 1) * (105.68197-(85.94974)));
            zz = 128.81354 + (((tickAnim - 12) / 1) * (74.02766-(128.81354)));
        }
        else if (tickAnim >= 13 && tickAnim < 14) {
            xx = -130.20591 + (((tickAnim - 13) / 1) * (-88.64001-(-130.20591)));
            yy = 105.68197 + (((tickAnim - 13) / 1) * (91.26623-(105.68197)));
            zz = 74.02766 + (((tickAnim - 13) / 1) * (140.0206-(74.02766)));
        }
        else if (tickAnim >= 14 && tickAnim < 14) {
            xx = -88.64001 + (((tickAnim - 14) / 0) * (-153.95367-(-88.64001)));
            yy = 91.26623 + (((tickAnim - 14) / 0) * (86.70162-(91.26623)));
            zz = 140.0206 + (((tickAnim - 14) / 0) * (163.3699-(140.0206)));
        }
        else if (tickAnim >= 14 && tickAnim < 15) {
            xx = -153.95367 + (((tickAnim - 14) / 1) * (-190.40347-(-153.95367)));
            yy = 86.70162 + (((tickAnim - 14) / 1) * (85.94974-(86.70162)));
            zz = 163.3699 + (((tickAnim - 14) / 1) * (128.81354-(163.3699)));
        }
        else if (tickAnim >= 15 && tickAnim < 16) {
            xx = -190.40347 + (((tickAnim - 15) / 1) * (-130.20591-(-190.40347)));
            yy = 85.94974 + (((tickAnim - 15) / 1) * (105.68197-(85.94974)));
            zz = 128.81354 + (((tickAnim - 15) / 1) * (74.02766-(128.81354)));
        }
        else if (tickAnim >= 16 && tickAnim < 17) {
            xx = -130.20591 + (((tickAnim - 16) / 1) * (-88.64001-(-130.20591)));
            yy = 105.68197 + (((tickAnim - 16) / 1) * (91.26623-(105.68197)));
            zz = 74.02766 + (((tickAnim - 16) / 1) * (140.0206-(74.02766)));
        }
        else if (tickAnim >= 17 && tickAnim < 18) {
            xx = -88.64001 + (((tickAnim - 17) / 1) * (-153.95367-(-88.64001)));
            yy = 91.26623 + (((tickAnim - 17) / 1) * (86.70162-(91.26623)));
            zz = 140.0206 + (((tickAnim - 17) / 1) * (163.3699-(140.0206)));
        }
        else if (tickAnim >= 18 && tickAnim < 18) {
            xx = -153.95367 + (((tickAnim - 18) / 0) * (-190.40347-(-153.95367)));
            yy = 86.70162 + (((tickAnim - 18) / 0) * (85.94974-(86.70162)));
            zz = 163.3699 + (((tickAnim - 18) / 0) * (128.81354-(163.3699)));
        }
        else if (tickAnim >= 18 && tickAnim < 19) {
            xx = -190.40347 + (((tickAnim - 18) / 1) * (-130.20591-(-190.40347)));
            yy = 85.94974 + (((tickAnim - 18) / 1) * (105.68197-(85.94974)));
            zz = 128.81354 + (((tickAnim - 18) / 1) * (74.02766-(128.81354)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(forewingleft, forewingleft.rotateAngleX + (float) Math.toRadians(xx), forewingleft.rotateAngleY + (float) Math.toRadians(yy), forewingleft.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 1) {
            xx = -96.25676 + (((tickAnim - 0) / 1) * (-38.90562-(-96.25676)));
            yy = -105.62222 + (((tickAnim - 0) / 1) * (-92.05581-(-105.62222)));
            zz = -27.41776 + (((tickAnim - 0) / 1) * (-88.54656-(-27.41776)));
        }
        else if (tickAnim >= 1 && tickAnim < 2) {
            xx = -38.90562 + (((tickAnim - 1) / 1) * (-102.03618-(-38.90562)));
            yy = -92.05581 + (((tickAnim - 1) / 1) * (-87.37578-(-92.05581)));
            zz = -88.54656 + (((tickAnim - 1) / 1) * (-111.89276-(-88.54656)));
        }
        else if (tickAnim >= 2 && tickAnim < 2) {
            xx = -102.03618 + (((tickAnim - 2) / 0) * (-153.67795-(-102.03618)));
            yy = -87.37578 + (((tickAnim - 2) / 0) * (-90.6488-(-87.37578)));
            zz = -111.89276 + (((tickAnim - 2) / 0) * (-84.07474-(-111.89276)));
        }
        else if (tickAnim >= 2 && tickAnim < 3) {
            xx = -153.67795 + (((tickAnim - 2) / 1) * (-96.25676-(-153.67795)));
            yy = -90.6488 + (((tickAnim - 2) / 1) * (-105.62222-(-90.6488)));
            zz = -84.07474 + (((tickAnim - 2) / 1) * (-27.41776-(-84.07474)));
        }
        else if (tickAnim >= 3 && tickAnim < 4) {
            xx = -96.25676 + (((tickAnim - 3) / 1) * (-38.90562-(-96.25676)));
            yy = -105.62222 + (((tickAnim - 3) / 1) * (-92.05581-(-105.62222)));
            zz = -27.41776 + (((tickAnim - 3) / 1) * (-88.54656-(-27.41776)));
        }
        else if (tickAnim >= 4 && tickAnim < 5) {
            xx = -38.90562 + (((tickAnim - 4) / 1) * (-102.03618-(-38.90562)));
            yy = -92.05581 + (((tickAnim - 4) / 1) * (-87.37578-(-92.05581)));
            zz = -88.54656 + (((tickAnim - 4) / 1) * (-111.89276-(-88.54656)));
        }
        else if (tickAnim >= 5 && tickAnim < 6) {
            xx = -102.03618 + (((tickAnim - 5) / 1) * (-153.67795-(-102.03618)));
            yy = -87.37578 + (((tickAnim - 5) / 1) * (-90.6488-(-87.37578)));
            zz = -111.89276 + (((tickAnim - 5) / 1) * (-84.07474-(-111.89276)));
        }
        else if (tickAnim >= 6 && tickAnim < 6) {
            xx = -153.67795 + (((tickAnim - 6) / 0) * (-96.25676-(-153.67795)));
            yy = -90.6488 + (((tickAnim - 6) / 0) * (-105.62222-(-90.6488)));
            zz = -84.07474 + (((tickAnim - 6) / 0) * (-27.41776-(-84.07474)));
        }
        else if (tickAnim >= 6 && tickAnim < 7) {
            xx = -96.25676 + (((tickAnim - 6) / 1) * (-38.90562-(-96.25676)));
            yy = -105.62222 + (((tickAnim - 6) / 1) * (-92.05581-(-105.62222)));
            zz = -27.41776 + (((tickAnim - 6) / 1) * (-88.54656-(-27.41776)));
        }
        else if (tickAnim >= 7 && tickAnim < 8) {
            xx = -38.90562 + (((tickAnim - 7) / 1) * (-102.03618-(-38.90562)));
            yy = -92.05581 + (((tickAnim - 7) / 1) * (-87.37578-(-92.05581)));
            zz = -88.54656 + (((tickAnim - 7) / 1) * (-111.89276-(-88.54656)));
        }
        else if (tickAnim >= 8 && tickAnim < 9) {
            xx = -102.03618 + (((tickAnim - 8) / 1) * (-153.67795-(-102.03618)));
            yy = -87.37578 + (((tickAnim - 8) / 1) * (-90.6488-(-87.37578)));
            zz = -111.89276 + (((tickAnim - 8) / 1) * (-84.07474-(-111.89276)));
        }
        else if (tickAnim >= 9 && tickAnim < 10) {
            xx = -153.67795 + (((tickAnim - 9) / 1) * (-96.25676-(-153.67795)));
            yy = -90.6488 + (((tickAnim - 9) / 1) * (-105.62222-(-90.6488)));
            zz = -84.07474 + (((tickAnim - 9) / 1) * (-27.41776-(-84.07474)));
        }
        else if (tickAnim >= 10 && tickAnim < 10) {
            xx = -96.25676 + (((tickAnim - 10) / 0) * (-38.90562-(-96.25676)));
            yy = -105.62222 + (((tickAnim - 10) / 0) * (-92.05581-(-105.62222)));
            zz = -27.41776 + (((tickAnim - 10) / 0) * (-88.54656-(-27.41776)));
        }
        else if (tickAnim >= 10 && tickAnim < 11) {
            xx = -38.90562 + (((tickAnim - 10) / 1) * (-102.03618-(-38.90562)));
            yy = -92.05581 + (((tickAnim - 10) / 1) * (-87.37578-(-92.05581)));
            zz = -88.54656 + (((tickAnim - 10) / 1) * (-111.89276-(-88.54656)));
        }
        else if (tickAnim >= 11 && tickAnim < 12) {
            xx = -102.03618 + (((tickAnim - 11) / 1) * (-153.67795-(-102.03618)));
            yy = -87.37578 + (((tickAnim - 11) / 1) * (-90.6488-(-87.37578)));
            zz = -111.89276 + (((tickAnim - 11) / 1) * (-84.07474-(-111.89276)));
        }
        else if (tickAnim >= 12 && tickAnim < 13) {
            xx = -153.67795 + (((tickAnim - 12) / 1) * (-96.25676-(-153.67795)));
            yy = -90.6488 + (((tickAnim - 12) / 1) * (-105.62222-(-90.6488)));
            zz = -84.07474 + (((tickAnim - 12) / 1) * (-27.41776-(-84.07474)));
        }
        else if (tickAnim >= 13 && tickAnim < 14) {
            xx = -96.25676 + (((tickAnim - 13) / 1) * (-38.90562-(-96.25676)));
            yy = -105.62222 + (((tickAnim - 13) / 1) * (-92.05581-(-105.62222)));
            zz = -27.41776 + (((tickAnim - 13) / 1) * (-88.54656-(-27.41776)));
        }
        else if (tickAnim >= 14 && tickAnim < 14) {
            xx = -38.90562 + (((tickAnim - 14) / 0) * (-102.03618-(-38.90562)));
            yy = -92.05581 + (((tickAnim - 14) / 0) * (-87.37578-(-92.05581)));
            zz = -88.54656 + (((tickAnim - 14) / 0) * (-111.89276-(-88.54656)));
        }
        else if (tickAnim >= 14 && tickAnim < 15) {
            xx = -102.03618 + (((tickAnim - 14) / 1) * (-153.67795-(-102.03618)));
            yy = -87.37578 + (((tickAnim - 14) / 1) * (-90.6488-(-87.37578)));
            zz = -111.89276 + (((tickAnim - 14) / 1) * (-84.07474-(-111.89276)));
        }
        else if (tickAnim >= 15 && tickAnim < 16) {
            xx = -153.67795 + (((tickAnim - 15) / 1) * (-96.25676-(-153.67795)));
            yy = -90.6488 + (((tickAnim - 15) / 1) * (-105.62222-(-90.6488)));
            zz = -84.07474 + (((tickAnim - 15) / 1) * (-27.41776-(-84.07474)));
        }
        else if (tickAnim >= 16 && tickAnim < 17) {
            xx = -96.25676 + (((tickAnim - 16) / 1) * (-38.90562-(-96.25676)));
            yy = -105.62222 + (((tickAnim - 16) / 1) * (-92.05581-(-105.62222)));
            zz = -27.41776 + (((tickAnim - 16) / 1) * (-88.54656-(-27.41776)));
        }
        else if (tickAnim >= 17 && tickAnim < 18) {
            xx = -38.90562 + (((tickAnim - 17) / 1) * (-102.03618-(-38.90562)));
            yy = -92.05581 + (((tickAnim - 17) / 1) * (-87.37578-(-92.05581)));
            zz = -88.54656 + (((tickAnim - 17) / 1) * (-111.89276-(-88.54656)));
        }
        else if (tickAnim >= 18 && tickAnim < 18) {
            xx = -102.03618 + (((tickAnim - 18) / 0) * (-153.67795-(-102.03618)));
            yy = -87.37578 + (((tickAnim - 18) / 0) * (-90.6488-(-87.37578)));
            zz = -111.89276 + (((tickAnim - 18) / 0) * (-84.07474-(-111.89276)));
        }
        else if (tickAnim >= 18 && tickAnim < 19) {
            xx = -153.67795 + (((tickAnim - 18) / 1) * (-96.25676-(-153.67795)));
            yy = -90.6488 + (((tickAnim - 18) / 1) * (-105.62222-(-90.6488)));
            zz = -84.07474 + (((tickAnim - 18) / 1) * (-27.41776-(-84.07474)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(forewingright, forewingright.rotateAngleX + (float) Math.toRadians(xx), forewingright.rotateAngleY + (float) Math.toRadians(yy), forewingright.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 1) {
            xx = -154.86729 + (((tickAnim - 0) / 1) * (-92.38306-(-154.86729)));
            yy = 82.47768 + (((tickAnim - 0) / 1) * (74.64511-(82.47768)));
            zz = 82.82206 + (((tickAnim - 0) / 1) * (146.6967-(82.82206)));
        }
        else if (tickAnim >= 1 && tickAnim < 2) {
            xx = -92.38306 + (((tickAnim - 1) / 1) * (-146.25465-(-92.38306)));
            yy = 74.64511 + (((tickAnim - 1) / 1) * (74.24066-(74.64511)));
            zz = 146.6967 + (((tickAnim - 1) / 1) * (171.74313-(146.6967)));
        }
        else if (tickAnim >= 2 && tickAnim < 2) {
            xx = -146.25465 + (((tickAnim - 2) / 0) * (-192.51156-(-146.25465)));
            yy = 74.24066 + (((tickAnim - 2) / 0) * (83.24194-(74.24066)));
            zz = 171.74313 + (((tickAnim - 2) / 0) * (105.25343-(171.74313)));
        }
        else if (tickAnim >= 2 && tickAnim < 3) {
            xx = -192.51156 + (((tickAnim - 2) / 1) * (-154.86729-(-192.51156)));
            yy = 83.24194 + (((tickAnim - 2) / 1) * (82.47768-(83.24194)));
            zz = 105.25343 + (((tickAnim - 2) / 1) * (82.82206-(105.25343)));
        }
        else if (tickAnim >= 3 && tickAnim < 4) {
            xx = -154.86729 + (((tickAnim - 3) / 1) * (-92.38306-(-154.86729)));
            yy = 82.47768 + (((tickAnim - 3) / 1) * (74.64511-(82.47768)));
            zz = 82.82206 + (((tickAnim - 3) / 1) * (146.6967-(82.82206)));
        }
        else if (tickAnim >= 4 && tickAnim < 5) {
            xx = -92.38306 + (((tickAnim - 4) / 1) * (-146.25465-(-92.38306)));
            yy = 74.64511 + (((tickAnim - 4) / 1) * (74.24066-(74.64511)));
            zz = 146.6967 + (((tickAnim - 4) / 1) * (171.74313-(146.6967)));
        }
        else if (tickAnim >= 5 && tickAnim < 6) {
            xx = -146.25465 + (((tickAnim - 5) / 1) * (-192.51156-(-146.25465)));
            yy = 74.24066 + (((tickAnim - 5) / 1) * (83.24194-(74.24066)));
            zz = 171.74313 + (((tickAnim - 5) / 1) * (105.25343-(171.74313)));
        }
        else if (tickAnim >= 6 && tickAnim < 6) {
            xx = -192.51156 + (((tickAnim - 6) / 0) * (-154.86729-(-192.51156)));
            yy = 83.24194 + (((tickAnim - 6) / 0) * (82.47768-(83.24194)));
            zz = 105.25343 + (((tickAnim - 6) / 0) * (82.82206-(105.25343)));
        }
        else if (tickAnim >= 6 && tickAnim < 7) {
            xx = -154.86729 + (((tickAnim - 6) / 1) * (-92.38306-(-154.86729)));
            yy = 82.47768 + (((tickAnim - 6) / 1) * (74.64511-(82.47768)));
            zz = 82.82206 + (((tickAnim - 6) / 1) * (146.6967-(82.82206)));
        }
        else if (tickAnim >= 7 && tickAnim < 8) {
            xx = -92.38306 + (((tickAnim - 7) / 1) * (-146.25465-(-92.38306)));
            yy = 74.64511 + (((tickAnim - 7) / 1) * (74.24066-(74.64511)));
            zz = 146.6967 + (((tickAnim - 7) / 1) * (171.74313-(146.6967)));
        }
        else if (tickAnim >= 8 && tickAnim < 9) {
            xx = -146.25465 + (((tickAnim - 8) / 1) * (-192.51156-(-146.25465)));
            yy = 74.24066 + (((tickAnim - 8) / 1) * (83.24194-(74.24066)));
            zz = 171.74313 + (((tickAnim - 8) / 1) * (105.25343-(171.74313)));
        }
        else if (tickAnim >= 9 && tickAnim < 10) {
            xx = -192.51156 + (((tickAnim - 9) / 1) * (-154.86729-(-192.51156)));
            yy = 83.24194 + (((tickAnim - 9) / 1) * (82.47768-(83.24194)));
            zz = 105.25343 + (((tickAnim - 9) / 1) * (82.82206-(105.25343)));
        }
        else if (tickAnim >= 10 && tickAnim < 10) {
            xx = -154.86729 + (((tickAnim - 10) / 0) * (-92.38306-(-154.86729)));
            yy = 82.47768 + (((tickAnim - 10) / 0) * (74.64511-(82.47768)));
            zz = 82.82206 + (((tickAnim - 10) / 0) * (146.6967-(82.82206)));
        }
        else if (tickAnim >= 10 && tickAnim < 11) {
            xx = -92.38306 + (((tickAnim - 10) / 1) * (-146.25465-(-92.38306)));
            yy = 74.64511 + (((tickAnim - 10) / 1) * (74.24066-(74.64511)));
            zz = 146.6967 + (((tickAnim - 10) / 1) * (171.74313-(146.6967)));
        }
        else if (tickAnim >= 11 && tickAnim < 12) {
            xx = -146.25465 + (((tickAnim - 11) / 1) * (-192.51156-(-146.25465)));
            yy = 74.24066 + (((tickAnim - 11) / 1) * (83.24194-(74.24066)));
            zz = 171.74313 + (((tickAnim - 11) / 1) * (105.25343-(171.74313)));
        }
        else if (tickAnim >= 12 && tickAnim < 13) {
            xx = -192.51156 + (((tickAnim - 12) / 1) * (-154.86729-(-192.51156)));
            yy = 83.24194 + (((tickAnim - 12) / 1) * (82.47768-(83.24194)));
            zz = 105.25343 + (((tickAnim - 12) / 1) * (82.82206-(105.25343)));
        }
        else if (tickAnim >= 13 && tickAnim < 14) {
            xx = -154.86729 + (((tickAnim - 13) / 1) * (-92.38306-(-154.86729)));
            yy = 82.47768 + (((tickAnim - 13) / 1) * (74.64511-(82.47768)));
            zz = 82.82206 + (((tickAnim - 13) / 1) * (146.6967-(82.82206)));
        }
        else if (tickAnim >= 14 && tickAnim < 14) {
            xx = -92.38306 + (((tickAnim - 14) / 0) * (-146.25465-(-92.38306)));
            yy = 74.64511 + (((tickAnim - 14) / 0) * (74.24066-(74.64511)));
            zz = 146.6967 + (((tickAnim - 14) / 0) * (171.74313-(146.6967)));
        }
        else if (tickAnim >= 14 && tickAnim < 15) {
            xx = -146.25465 + (((tickAnim - 14) / 1) * (-192.51156-(-146.25465)));
            yy = 74.24066 + (((tickAnim - 14) / 1) * (83.24194-(74.24066)));
            zz = 171.74313 + (((tickAnim - 14) / 1) * (105.25343-(171.74313)));
        }
        else if (tickAnim >= 15 && tickAnim < 16) {
            xx = -192.51156 + (((tickAnim - 15) / 1) * (-154.86729-(-192.51156)));
            yy = 83.24194 + (((tickAnim - 15) / 1) * (82.47768-(83.24194)));
            zz = 105.25343 + (((tickAnim - 15) / 1) * (82.82206-(105.25343)));
        }
        else if (tickAnim >= 16 && tickAnim < 17) {
            xx = -154.86729 + (((tickAnim - 16) / 1) * (-92.38306-(-154.86729)));
            yy = 82.47768 + (((tickAnim - 16) / 1) * (74.64511-(82.47768)));
            zz = 82.82206 + (((tickAnim - 16) / 1) * (146.6967-(82.82206)));
        }
        else if (tickAnim >= 17 && tickAnim < 18) {
            xx = -92.38306 + (((tickAnim - 17) / 1) * (-146.25465-(-92.38306)));
            yy = 74.64511 + (((tickAnim - 17) / 1) * (74.24066-(74.64511)));
            zz = 146.6967 + (((tickAnim - 17) / 1) * (171.74313-(146.6967)));
        }
        else if (tickAnim >= 18 && tickAnim < 18) {
            xx = -146.25465 + (((tickAnim - 18) / 0) * (-192.51156-(-146.25465)));
            yy = 74.24066 + (((tickAnim - 18) / 0) * (83.24194-(74.24066)));
            zz = 171.74313 + (((tickAnim - 18) / 0) * (105.25343-(171.74313)));
        }
        else if (tickAnim >= 18 && tickAnim < 19) {
            xx = -192.51156 + (((tickAnim - 18) / 1) * (-154.86729-(-192.51156)));
            yy = 83.24194 + (((tickAnim - 18) / 1) * (82.47768-(83.24194)));
            zz = 105.25343 + (((tickAnim - 18) / 1) * (82.82206-(105.25343)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(hindwingleft, hindwingleft.rotateAngleX + (float) Math.toRadians(xx), hindwingleft.rotateAngleY + (float) Math.toRadians(yy), hindwingleft.rotateAngleZ + (float) Math.toRadians(zz));



        this.setRotateAngle(hindwingleft2, hindwingleft2.rotateAngleX + (float) Math.toRadians(177.5), hindwingleft2.rotateAngleY + (float) Math.toRadians(0), hindwingleft2.rotateAngleZ + (float) Math.toRadians(0));



        if (tickAnim >= 0 && tickAnim < 1) {
            xx = -97.89972 + (((tickAnim - 0) / 1) * (-39.66536-(-97.89972)));
            yy = -83.37539 + (((tickAnim - 0) / 1) * (-75.13347-(-83.37539)));
            zz = -30.18292 + (((tickAnim - 0) / 1) * (-91.02453-(-30.18292)));
        }
        else if (tickAnim >= 1 && tickAnim < 2) {
            xx = -39.66536 + (((tickAnim - 1) / 1) * (-92.69798-(-39.66536)));
            yy = -75.13347 + (((tickAnim - 1) / 1) * (-74.52816-(-75.13347)));
            zz = -91.02453 + (((tickAnim - 1) / 1) * (-116.72799-(-91.02453)));
        }
        else if (tickAnim >= 2 && tickAnim < 2) {
            xx = -92.69798 + (((tickAnim - 2) / 0) * (-148.00627-(-92.69798)));
            yy = -74.52816 + (((tickAnim - 2) / 0) * (-84.48032-(-74.52816)));
            zz = -116.72799 + (((tickAnim - 2) / 0) * (-51.25315-(-116.72799)));
        }
        else if (tickAnim >= 2 && tickAnim < 3) {
            xx = -148.00627 + (((tickAnim - 2) / 1) * (-97.89972-(-148.00627)));
            yy = -84.48032 + (((tickAnim - 2) / 1) * (-83.37539-(-84.48032)));
            zz = -51.25315 + (((tickAnim - 2) / 1) * (-30.18292-(-51.25315)));
        }
        else if (tickAnim >= 3 && tickAnim < 4) {
            xx = -97.89972 + (((tickAnim - 3) / 1) * (-39.66536-(-97.89972)));
            yy = -83.37539 + (((tickAnim - 3) / 1) * (-75.13347-(-83.37539)));
            zz = -30.18292 + (((tickAnim - 3) / 1) * (-91.02453-(-30.18292)));
        }
        else if (tickAnim >= 4 && tickAnim < 5) {
            xx = -39.66536 + (((tickAnim - 4) / 1) * (-92.69798-(-39.66536)));
            yy = -75.13347 + (((tickAnim - 4) / 1) * (-74.52816-(-75.13347)));
            zz = -91.02453 + (((tickAnim - 4) / 1) * (-116.72799-(-91.02453)));
        }
        else if (tickAnim >= 5 && tickAnim < 6) {
            xx = -92.69798 + (((tickAnim - 5) / 1) * (-148.00627-(-92.69798)));
            yy = -74.52816 + (((tickAnim - 5) / 1) * (-84.48032-(-74.52816)));
            zz = -116.72799 + (((tickAnim - 5) / 1) * (-51.25315-(-116.72799)));
        }
        else if (tickAnim >= 6 && tickAnim < 6) {
            xx = -148.00627 + (((tickAnim - 6) / 0) * (-97.89972-(-148.00627)));
            yy = -84.48032 + (((tickAnim - 6) / 0) * (-83.37539-(-84.48032)));
            zz = -51.25315 + (((tickAnim - 6) / 0) * (-30.18292-(-51.25315)));
        }
        else if (tickAnim >= 6 && tickAnim < 7) {
            xx = -97.89972 + (((tickAnim - 6) / 1) * (-39.66536-(-97.89972)));
            yy = -83.37539 + (((tickAnim - 6) / 1) * (-75.13347-(-83.37539)));
            zz = -30.18292 + (((tickAnim - 6) / 1) * (-91.02453-(-30.18292)));
        }
        else if (tickAnim >= 7 && tickAnim < 8) {
            xx = -39.66536 + (((tickAnim - 7) / 1) * (-92.69798-(-39.66536)));
            yy = -75.13347 + (((tickAnim - 7) / 1) * (-74.52816-(-75.13347)));
            zz = -91.02453 + (((tickAnim - 7) / 1) * (-116.72799-(-91.02453)));
        }
        else if (tickAnim >= 8 && tickAnim < 9) {
            xx = -92.69798 + (((tickAnim - 8) / 1) * (-148.00627-(-92.69798)));
            yy = -74.52816 + (((tickAnim - 8) / 1) * (-84.48032-(-74.52816)));
            zz = -116.72799 + (((tickAnim - 8) / 1) * (-51.25315-(-116.72799)));
        }
        else if (tickAnim >= 9 && tickAnim < 10) {
            xx = -148.00627 + (((tickAnim - 9) / 1) * (-97.89972-(-148.00627)));
            yy = -84.48032 + (((tickAnim - 9) / 1) * (-83.37539-(-84.48032)));
            zz = -51.25315 + (((tickAnim - 9) / 1) * (-30.18292-(-51.25315)));
        }
        else if (tickAnim >= 10 && tickAnim < 10) {
            xx = -97.89972 + (((tickAnim - 10) / 0) * (-39.66536-(-97.89972)));
            yy = -83.37539 + (((tickAnim - 10) / 0) * (-75.13347-(-83.37539)));
            zz = -30.18292 + (((tickAnim - 10) / 0) * (-91.02453-(-30.18292)));
        }
        else if (tickAnim >= 10 && tickAnim < 11) {
            xx = -39.66536 + (((tickAnim - 10) / 1) * (-92.69798-(-39.66536)));
            yy = -75.13347 + (((tickAnim - 10) / 1) * (-74.52816-(-75.13347)));
            zz = -91.02453 + (((tickAnim - 10) / 1) * (-116.72799-(-91.02453)));
        }
        else if (tickAnim >= 11 && tickAnim < 12) {
            xx = -92.69798 + (((tickAnim - 11) / 1) * (-148.00627-(-92.69798)));
            yy = -74.52816 + (((tickAnim - 11) / 1) * (-84.48032-(-74.52816)));
            zz = -116.72799 + (((tickAnim - 11) / 1) * (-51.25315-(-116.72799)));
        }
        else if (tickAnim >= 12 && tickAnim < 13) {
            xx = -148.00627 + (((tickAnim - 12) / 1) * (-97.89972-(-148.00627)));
            yy = -84.48032 + (((tickAnim - 12) / 1) * (-83.37539-(-84.48032)));
            zz = -51.25315 + (((tickAnim - 12) / 1) * (-30.18292-(-51.25315)));
        }
        else if (tickAnim >= 13 && tickAnim < 14) {
            xx = -97.89972 + (((tickAnim - 13) / 1) * (-39.66536-(-97.89972)));
            yy = -83.37539 + (((tickAnim - 13) / 1) * (-75.13347-(-83.37539)));
            zz = -30.18292 + (((tickAnim - 13) / 1) * (-91.02453-(-30.18292)));
        }
        else if (tickAnim >= 14 && tickAnim < 14) {
            xx = -39.66536 + (((tickAnim - 14) / 0) * (-92.69798-(-39.66536)));
            yy = -75.13347 + (((tickAnim - 14) / 0) * (-74.52816-(-75.13347)));
            zz = -91.02453 + (((tickAnim - 14) / 0) * (-116.72799-(-91.02453)));
        }
        else if (tickAnim >= 14 && tickAnim < 15) {
            xx = -92.69798 + (((tickAnim - 14) / 1) * (-148.00627-(-92.69798)));
            yy = -74.52816 + (((tickAnim - 14) / 1) * (-84.48032-(-74.52816)));
            zz = -116.72799 + (((tickAnim - 14) / 1) * (-51.25315-(-116.72799)));
        }
        else if (tickAnim >= 15 && tickAnim < 16) {
            xx = -148.00627 + (((tickAnim - 15) / 1) * (-97.89972-(-148.00627)));
            yy = -84.48032 + (((tickAnim - 15) / 1) * (-83.37539-(-84.48032)));
            zz = -51.25315 + (((tickAnim - 15) / 1) * (-30.18292-(-51.25315)));
        }
        else if (tickAnim >= 16 && tickAnim < 17) {
            xx = -97.89972 + (((tickAnim - 16) / 1) * (-39.66536-(-97.89972)));
            yy = -83.37539 + (((tickAnim - 16) / 1) * (-75.13347-(-83.37539)));
            zz = -30.18292 + (((tickAnim - 16) / 1) * (-91.02453-(-30.18292)));
        }
        else if (tickAnim >= 17 && tickAnim < 18) {
            xx = -39.66536 + (((tickAnim - 17) / 1) * (-92.69798-(-39.66536)));
            yy = -75.13347 + (((tickAnim - 17) / 1) * (-74.52816-(-75.13347)));
            zz = -91.02453 + (((tickAnim - 17) / 1) * (-116.72799-(-91.02453)));
        }
        else if (tickAnim >= 18 && tickAnim < 18) {
            xx = -92.69798 + (((tickAnim - 18) / 0) * (-148.00627-(-92.69798)));
            yy = -74.52816 + (((tickAnim - 18) / 0) * (-84.48032-(-74.52816)));
            zz = -116.72799 + (((tickAnim - 18) / 0) * (-51.25315-(-116.72799)));
        }
        else if (tickAnim >= 18 && tickAnim < 19) {
            xx = -148.00627 + (((tickAnim - 18) / 1) * (-97.89972-(-148.00627)));
            yy = -84.48032 + (((tickAnim - 18) / 1) * (-83.37539-(-84.48032)));
            zz = -51.25315 + (((tickAnim - 18) / 1) * (-30.18292-(-51.25315)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(hindwingright, hindwingright.rotateAngleX + (float) Math.toRadians(xx), hindwingright.rotateAngleY + (float) Math.toRadians(yy), hindwingright.rotateAngleZ + (float) Math.toRadians(zz));



        this.setRotateAngle(hindwingright2, hindwingright2.rotateAngleX + (float) Math.toRadians(-180), hindwingright2.rotateAngleY + (float) Math.toRadians(0), hindwingright2.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(armleft, armleft.rotateAngleX + (float) Math.toRadians(0.1627), armleft.rotateAngleY + (float) Math.toRadians(9.9697), armleft.rotateAngleZ + (float) Math.toRadians(15.79572));


        this.setRotateAngle(armleft2, armleft2.rotateAngleX + (float) Math.toRadians(0), armleft2.rotateAngleY + (float) Math.toRadians(17.5+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*750/2-30))*5), armleft2.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(armleft3, armleft3.rotateAngleX + (float) Math.toRadians(0), armleft3.rotateAngleY + (float) Math.toRadians(55+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*750/2-60))*5), armleft3.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(antennaleft, antennaleft.rotateAngleX + (float) Math.toRadians(0), antennaleft.rotateAngleY + (float) Math.toRadians(0), antennaleft.rotateAngleZ + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*750/2))*10));

    }
    public void animClimbing(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime, boolean isMoving) {
        EntityPrehistoricFloraSantanmantis entity = (EntityPrehistoricFloraSantanmantis) entitylivingbaseIn;
        int animCycle = 9;
        double tickAnim = (entity.ticksExisted + entity.getTickOffset()) - (int) (Math.floor((double) (entity.ticksExisted + entity.getTickOffset()) / (double) animCycle) * (double) animCycle) + partialTickTime;
        if (!isMoving) {
            tickAnim = 0;
        }

        double xx = 0;
        double yy = 0;
        double zz = 0;
        this.setRotateAngle(base, base.rotateAngleX + (float) Math.toRadians(-85+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*750*2))*2), base.rotateAngleY + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*750+100))*2), base.rotateAngleZ + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*750-90))*4));
        this.base.rotationPointX = this.base.rotationPointX + (float)(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*750-60))*0.1);
        this.base.rotationPointY = this.base.rotationPointY - (float)(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*750*2-60))*0.1);
        this.base.rotationPointZ = this.base.rotationPointZ + (float)(0);



        if (tickAnim >= 0 && tickAnim < 2) {
            xx = 0 + (((tickAnim - 0) / 2) * (-37.25283-(0)));
            yy = -15 + (((tickAnim - 0) / 2) * (10.36778-(-15)));
            zz = 0 + (((tickAnim - 0) / 2) * (-0.70353-(0)));
        }
        else if (tickAnim >= 2 && tickAnim < 5) {
            xx = -37.25283 + (((tickAnim - 2) / 3) * (-61.22627-(-37.25283)));
            yy = 10.36778 + (((tickAnim - 2) / 3) * (27.03629-(10.36778)));
            zz = -0.70353 + (((tickAnim - 2) / 3) * (23.75047-(-0.70353)));
        }
        else if (tickAnim >= 5 && tickAnim < 10) {
            xx = -61.22627 + (((tickAnim - 5) / 5) * (0-(-61.22627)));
            yy = 27.03629 + (((tickAnim - 5) / 5) * (-15-(27.03629)));
            zz = 23.75047 + (((tickAnim - 5) / 5) * (0-(23.75047)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(legleft, legleft.rotateAngleX + (float) Math.toRadians(xx), legleft.rotateAngleY + (float) Math.toRadians(yy), legleft.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 2) {
            xx = -128.80436 + (((tickAnim - 0) / 2) * (-7.2517-(-128.80436)));
            yy = -2.43619 + (((tickAnim - 0) / 2) * (-7.20772-(-2.43619)));
            zz = -119.38966 + (((tickAnim - 0) / 2) * (16.82995-(-119.38966)));
        }
        else if (tickAnim >= 2 && tickAnim < 5) {
            xx = -7.2517 + (((tickAnim - 2) / 3) * (13.06877-(-7.2517)));
            yy = -7.20772 + (((tickAnim - 2) / 3) * (-13.22026-(-7.20772)));
            zz = 16.82995 + (((tickAnim - 2) / 3) * (13.8756-(16.82995)));
        }
        else if (tickAnim >= 5 && tickAnim < 7) {
            xx = 13.06877 + (((tickAnim - 5) / 2) * (-70.3678-(13.06877)));
            yy = -13.22026 + (((tickAnim - 5) / 2) * (-7.82823-(-13.22026)));
            zz = 13.8756 + (((tickAnim - 5) / 2) * (-52.75703-(13.8756)));
        }
        else if (tickAnim >= 7 && tickAnim < 9) {
            xx = -70.3678 + (((tickAnim - 7) / 2) * (-116.82551-(-70.3678)));
            yy = -7.82823 + (((tickAnim - 7) / 2) * (-4.23354-(-7.82823)));
            zz = -52.75703 + (((tickAnim - 7) / 2) * (-97.17879-(-52.75703)));
        }
        else if (tickAnim >= 9 && tickAnim < 10) {
            xx = -116.82551 + (((tickAnim - 9) / 1) * (-128.80436-(-116.82551)));
            yy = -4.23354 + (((tickAnim - 9) / 1) * (-2.43619-(-4.23354)));
            zz = -97.17879 + (((tickAnim - 9) / 1) * (-119.38966-(-97.17879)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(legright2, legright2.rotateAngleX + (float) Math.toRadians(xx), legright2.rotateAngleY + (float) Math.toRadians(yy), legright2.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 2) {
            xx = -1.25 + (((tickAnim - 0) / 2) * (-0.5-(-1.25)));
            yy = 0 + (((tickAnim - 0) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 2) * (-0.5-(0)));
        }
        else if (tickAnim >= 2 && tickAnim < 5) {
            xx = -0.5 + (((tickAnim - 2) / 3) * (0.5-(-0.5)));
            yy = 0 + (((tickAnim - 2) / 3) * (0-(0)));
            zz = -0.5 + (((tickAnim - 2) / 3) * (-1-(-0.5)));
        }
        else if (tickAnim >= 5 && tickAnim < 10) {
            xx = 0.5 + (((tickAnim - 5) / 5) * (-1.25-(0.5)));
            yy = 0 + (((tickAnim - 5) / 5) * (0-(0)));
            zz = -1 + (((tickAnim - 5) / 5) * (0-(-1)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.legright2.rotationPointX = this.legright2.rotationPointX + (float)(xx);
        this.legright2.rotationPointY = this.legright2.rotationPointY - (float)(yy);
        this.legright2.rotationPointZ = this.legright2.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 2) {
            xx = 13.06877 + (((tickAnim - 0) / 2) * (-70.3678-(13.06877)));
            yy = 13.22026 + (((tickAnim - 0) / 2) * (7.82823-(13.22026)));
            zz = -13.8756 + (((tickAnim - 0) / 2) * (52.75703-(-13.8756)));
        }
        else if (tickAnim >= 2 && tickAnim < 4) {
            xx = -70.3678 + (((tickAnim - 2) / 2) * (-116.82551-(-70.3678)));
            yy = 7.82823 + (((tickAnim - 2) / 2) * (4.23354-(7.82823)));
            zz = 52.75703 + (((tickAnim - 2) / 2) * (97.17879-(52.75703)));
        }
        else if (tickAnim >= 4 && tickAnim < 5) {
            xx = -116.82551 + (((tickAnim - 4) / 1) * (-128.80436-(-116.82551)));
            yy = 4.23354 + (((tickAnim - 4) / 1) * (2.43619-(4.23354)));
            zz = 97.17879 + (((tickAnim - 4) / 1) * (119.38966-(97.17879)));
        }
        else if (tickAnim >= 5 && tickAnim < 7) {
            xx = -128.80436 + (((tickAnim - 5) / 2) * (-7.2517-(-128.80436)));
            yy = 2.43619 + (((tickAnim - 5) / 2) * (7.20772-(2.43619)));
            zz = 119.38966 + (((tickAnim - 5) / 2) * (-16.82995-(119.38966)));
        }
        else if (tickAnim >= 7 && tickAnim < 10) {
            xx = -7.2517 + (((tickAnim - 7) / 3) * (13.06877-(-7.2517)));
            yy = 7.20772 + (((tickAnim - 7) / 3) * (13.22026-(7.20772)));
            zz = -16.82995 + (((tickAnim - 7) / 3) * (-13.8756-(-16.82995)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(legleft2, legleft2.rotateAngleX + (float) Math.toRadians(xx), legleft2.rotateAngleY + (float) Math.toRadians(yy), legleft2.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 5) {
            xx = -0.5 + (((tickAnim - 0) / 5) * (1.25-(-0.5)));
            yy = 0 + (((tickAnim - 0) / 5) * (0-(0)));
            zz = -1 + (((tickAnim - 0) / 5) * (0-(-1)));
        }
        else if (tickAnim >= 5 && tickAnim < 7) {
            xx = 1.25 + (((tickAnim - 5) / 2) * (0.5-(1.25)));
            yy = 0 + (((tickAnim - 5) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 5) / 2) * (-0.5-(0)));
        }
        else if (tickAnim >= 7 && tickAnim < 10) {
            xx = 0.5 + (((tickAnim - 7) / 3) * (-0.5-(0.5)));
            yy = 0 + (((tickAnim - 7) / 3) * (0-(0)));
            zz = -0.5 + (((tickAnim - 7) / 3) * (-1-(-0.5)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.legleft2.rotationPointX = this.legleft2.rotationPointX + (float)(xx);
        this.legleft2.rotationPointY = this.legleft2.rotationPointY - (float)(yy);
        this.legleft2.rotationPointZ = this.legleft2.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 5) {
            xx = -61.25063 + (((tickAnim - 0) / 5) * (0-(-61.25063)));
            yy = -26.97233 + (((tickAnim - 0) / 5) * (15-(-26.97233)));
            zz = -24.25749 + (((tickAnim - 0) / 5) * (0-(-24.25749)));
        }
        else if (tickAnim >= 5 && tickAnim < 7) {
            xx = 0 + (((tickAnim - 5) / 2) * (-37.25283-(0)));
            yy = 15 + (((tickAnim - 5) / 2) * (-10.36778-(15)));
            zz = 0 + (((tickAnim - 5) / 2) * (0.70353-(0)));
        }
        else if (tickAnim >= 7 && tickAnim < 10) {
            xx = -37.25283 + (((tickAnim - 7) / 3) * (-61.25063-(-37.25283)));
            yy = -10.36778 + (((tickAnim - 7) / 3) * (-26.97233-(-10.36778)));
            zz = 0.70353 + (((tickAnim - 7) / 3) * (-24.25749-(0.70353)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(legright, legright.rotateAngleX + (float) Math.toRadians(xx), legright.rotateAngleY + (float) Math.toRadians(yy), legright.rotateAngleZ + (float) Math.toRadians(zz));



        this.setRotateAngle(antennaright, antennaright.rotateAngleX + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*750))*5), antennaright.rotateAngleY + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*750))*10), antennaright.rotateAngleZ + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*750-30))*5));



        if (tickAnim >= 0 && tickAnim < 5) {
            xx = -22.35177 + (((tickAnim - 0) / 5) * (8.625-(-22.35177)));
            yy = -16.99278 + (((tickAnim - 0) / 5) * (-33.47848-(-16.99278)));
            zz = 14.9814 + (((tickAnim - 0) / 5) * (-13.11094-(14.9814)));
        }
        else if (tickAnim >= 5 && tickAnim < 10) {
            xx = 8.625 + (((tickAnim - 5) / 5) * (-22.35177-(8.625)));
            yy = -33.47848 + (((tickAnim - 5) / 5) * (-16.99278-(-33.47848)));
            zz = -13.11094 + (((tickAnim - 5) / 5) * (14.9814-(-13.11094)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(armright, armright.rotateAngleX + (float) Math.toRadians(xx), armright.rotateAngleY + (float) Math.toRadians(yy), armright.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 2) {
            xx = -5.28785 + (((tickAnim - 0) / 2) * (-10.18575-(-5.28785)));
            yy = 15.46259 + (((tickAnim - 0) / 2) * (-18.02613-(15.46259)));
            zz = 11.50175 + (((tickAnim - 0) / 2) * (17.98715-(11.50175)));
        }
        else if (tickAnim >= 2 && tickAnim < 5) {
            xx = -10.18575 + (((tickAnim - 2) / 3) * (-5.16524-(-10.18575)));
            yy = -18.02613 + (((tickAnim - 2) / 3) * (17.9522-(-18.02613)));
            zz = 17.98715 + (((tickAnim - 2) / 3) * (11.24314-(17.98715)));
        }
        else if (tickAnim >= 5 && tickAnim < 10) {
            xx = -5.16524 + (((tickAnim - 5) / 5) * (-5.28785-(-5.16524)));
            yy = 17.9522 + (((tickAnim - 5) / 5) * (15.46259-(17.9522)));
            zz = 11.24314 + (((tickAnim - 5) / 5) * (11.50175-(11.24314)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(armright2, armright2.rotateAngleX + (float) Math.toRadians(xx), armright2.rotateAngleY + (float) Math.toRadians(yy), armright2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 2) {
            xx = -4.54283 + (((tickAnim - 0) / 2) * (-16.94449-(-4.54283)));
            yy = -0.34386 + (((tickAnim - 0) / 2) * (-13.06296-(-0.34386)));
            zz = 9.14996 + (((tickAnim - 0) / 2) * (-1.03673-(9.14996)));
        }
        else if (tickAnim >= 2 && tickAnim < 5) {
            xx = -16.94449 + (((tickAnim - 2) / 3) * (-20-(-16.94449)));
            yy = -13.06296 + (((tickAnim - 2) / 3) * (-50-(-13.06296)));
            zz = -1.03673 + (((tickAnim - 2) / 3) * (0-(-1.03673)));
        }
        else if (tickAnim >= 5 && tickAnim < 10) {
            xx = -20 + (((tickAnim - 5) / 5) * (-4.54283-(-20)));
            yy = -50 + (((tickAnim - 5) / 5) * (-0.34386-(-50)));
            zz = 0 + (((tickAnim - 5) / 5) * (9.14996-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(armright3, armright3.rotateAngleX + (float) Math.toRadians(xx), armright3.rotateAngleY + (float) Math.toRadians(yy), armright3.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 5) {
            xx = 8.625 + (((tickAnim - 0) / 5) * (-22.35789-(8.625)));
            yy = 33.47848 + (((tickAnim - 0) / 5) * (16.81595-(33.47848)));
            zz = 13.11094 + (((tickAnim - 0) / 5) * (-13.99963-(13.11094)));
        }
        else if (tickAnim >= 5 && tickAnim < 10) {
            xx = -22.35789 + (((tickAnim - 5) / 5) * (8.625-(-22.35789)));
            yy = 16.81595 + (((tickAnim - 5) / 5) * (33.47848-(16.81595)));
            zz = -13.99963 + (((tickAnim - 5) / 5) * (13.11094-(-13.99963)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(armleft, armleft.rotateAngleX + (float) Math.toRadians(xx), armleft.rotateAngleY + (float) Math.toRadians(yy), armleft.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 5) {
            xx = -5.16524 + (((tickAnim - 0) / 5) * (-5.28785-(-5.16524)));
            yy = -17.9522 + (((tickAnim - 0) / 5) * (-15.46259-(-17.9522)));
            zz = -11.24314 + (((tickAnim - 0) / 5) * (-11.50175-(-11.24314)));
        }
        else if (tickAnim >= 5 && tickAnim < 7) {
            xx = -5.28785 + (((tickAnim - 5) / 2) * (-10.18575-(-5.28785)));
            yy = -15.46259 + (((tickAnim - 5) / 2) * (18.02613-(-15.46259)));
            zz = -11.50175 + (((tickAnim - 5) / 2) * (-17.98715-(-11.50175)));
        }
        else if (tickAnim >= 7 && tickAnim < 10) {
            xx = -10.18575 + (((tickAnim - 7) / 3) * (-5.16524-(-10.18575)));
            yy = 18.02613 + (((tickAnim - 7) / 3) * (-17.9522-(18.02613)));
            zz = -17.98715 + (((tickAnim - 7) / 3) * (-11.24314-(-17.98715)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(armleft2, armleft2.rotateAngleX + (float) Math.toRadians(xx), armleft2.rotateAngleY + (float) Math.toRadians(yy), armleft2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 5) {
            xx = -20 + (((tickAnim - 0) / 5) * (-4.54283-(-20)));
            yy = 50 + (((tickAnim - 0) / 5) * (0.34386-(50)));
            zz = 0 + (((tickAnim - 0) / 5) * (-9.14996-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 7) {
            xx = -4.54283 + (((tickAnim - 5) / 2) * (-16.94449-(-4.54283)));
            yy = 0.34386 + (((tickAnim - 5) / 2) * (13.06296-(0.34386)));
            zz = -9.14996 + (((tickAnim - 5) / 2) * (1.03673-(-9.14996)));
        }
        else if (tickAnim >= 7 && tickAnim < 10) {
            xx = -16.94449 + (((tickAnim - 7) / 3) * (-20-(-16.94449)));
            yy = 13.06296 + (((tickAnim - 7) / 3) * (50-(13.06296)));
            zz = 1.03673 + (((tickAnim - 7) / 3) * (0-(1.03673)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(armleft3, armleft3.rotateAngleX + (float) Math.toRadians(xx), armleft3.rotateAngleY + (float) Math.toRadians(yy), armleft3.rotateAngleZ + (float) Math.toRadians(zz));



        this.setRotateAngle(antennaleft, antennaleft.rotateAngleX + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*750))*10), antennaleft.rotateAngleY + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*750-60))*10), antennaleft.rotateAngleZ + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*750-30))*10));

    }
    public void animate(IAnimatedEntity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        EntityPrehistoricFloraLandClimbingGlidingBase e = (EntityPrehistoricFloraLandClimbingGlidingBase) entity;
        animator.update(entity);
        //N/A
    }

}
