package net.lepidodendron.entity.model.entity;

import net.ilexiconn.llibrary.client.model.tools.AdvancedModelBase;
import net.ilexiconn.llibrary.client.model.tools.AdvancedModelRenderer;
import net.lepidodendron.entity.EntityPrehistoricFloraHaplophrentis;
import net.lepidodendron.entity.EntityPrehistoricFloraRhenocystis;
import net.lepidodendron.entity.EntityPrehistoricFloraSilesaurus;
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
        int animCycle = 50;
        double tickAnim = animTick + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;
        if (tickAnim >= 0 && tickAnim < 12) {
            xx = 0D + (((tickAnim - 0D) / 12D) * (37D-(0D)));
            yy = 0D + (((tickAnim - 0D) / 12D) * (0D-(0D)));
            zz = 0D + (((tickAnim - 0D) / 12D) * (0D-(0D)));
        }
        else if (tickAnim >= 12 && tickAnim < 38) {
            xx = 37D + (((tickAnim - 12D) / 26D) * (37D-(37D)));
            yy = 0D + (((tickAnim - 12D) / 26D) * (0D-(0D)));
            zz = 0D + (((tickAnim - 12D) / 26D) * (0D-(0D)));
        }
        else if (tickAnim >= 38 && tickAnim < 50) {
            xx = 37D + (((tickAnim - 38D) / 12D) * (0D-(37D)));
            yy = 0D + (((tickAnim - 38D) / 12D) * (0D-(0D)));
            zz = 0D + (((tickAnim - 38D) / 12D) * (0D-(0D)));
        }
        this.setRotateAngle(horn, horn.rotateAngleX + (float) Math.toRadians(xx), horn.rotateAngleY + (float) Math.toRadians(yy), horn.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 12) {
            xx = 0D + (((tickAnim - 0D) / 12D) * (-5D-(0D)));
            yy = 0D + (((tickAnim - 0D) / 12D) * (0D-(0D)));
            zz = 0D + (((tickAnim - 0D) / 12D) * (0D-(0D)));
        }
        else if (tickAnim >= 12 && tickAnim < 38) {
            xx = -5D + (((tickAnim - 12D) / 26D) * (-5D-(-5D)));
            yy = 0D + (((tickAnim - 12D) / 26D) * (0D-(0D)));
            zz = 0D + (((tickAnim - 12D) / 26D) * (0D-(0D)));
        }
        else if (tickAnim >= 38 && tickAnim < 50) {
            xx = -5D + (((tickAnim - 38D) / 12D) * (0D-(-5D)));
            yy = 0D + (((tickAnim - 38D) / 12D) * (0D-(0D)));
            zz = 0D + (((tickAnim - 38D) / 12D) * (0D-(0D)));
        }
        this.setRotateAngle(base, base.rotateAngleX + (float) Math.toRadians(xx), base.rotateAngleY + (float) Math.toRadians(yy), base.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 18) {
            xx = 16D + (((tickAnim - 0D) / 18D) * (0D-(16D)));
            yy = 0D + (((tickAnim - 0D) / 18D) * (0D-(0D)));
            zz = 0D + (((tickAnim - 0D) / 18D) * (0D-(0D)));
        }
        else if (tickAnim >= 18 && tickAnim < 35) {
            xx = 0D + (((tickAnim - 18D) / 17D) * (0D-(0D)));
            yy = 0D + (((tickAnim - 18D) / 17D) * (0D-(0D)));
            zz = 0D + (((tickAnim - 18D) / 17D) * (0D-(0D)));
        }
        else if (tickAnim >= 35 && tickAnim < 50) {
            xx = 0D + (((tickAnim - 35D) / 15D) * (16D-(0D)));
            yy = 0D + (((tickAnim - 35D) / 15D) * (0D-(0D)));
            zz = 0D + (((tickAnim - 35D) / 15D) * (0D-(0D)));
        }
        this.setRotateAngle(hood, hood.rotateAngleX + (float) Math.toRadians(xx), hood.rotateAngleY + (float) Math.toRadians(yy), hood.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 18) {
            xx = 0D + (((tickAnim - 0D) / 18D) * (0D-(0D)));
            yy = 0D + (((tickAnim - 0D) / 18D) * (0D-(0D)));
            zz = 1.5D + (((tickAnim - 0D) / 18D) * (0D-(1.5D)));
        }
        else if (tickAnim >= 18 && tickAnim < 35) {
            xx = 0D + (((tickAnim - 18D) / 17D) * (0D-(0D)));
            yy = 0D + (((tickAnim - 18D) / 17D) * (0D-(0D)));
            zz = 0D + (((tickAnim - 18D) / 17D) * (0D-(0D)));
        }
        else if (tickAnim >= 35 && tickAnim < 50) {
            xx = 0D + (((tickAnim - 35D) / 15D) * (0D-(0D)));
            yy = 0D + (((tickAnim - 35D) / 15D) * (0D-(0D)));
            zz = 0D + (((tickAnim - 35D) / 15D) * (1.5D-(0D)));
        }
        this.body.offsetX = (float) Math.toRadians(xx);
        this.body.offsetY = (float) Math.toRadians(yy);
        this.body.offsetZ = (float) Math.toRadians(zz);




        if (tickAnim >=0 && tickAnim < 18){
            xx = 0;
            yy = 0;
            zz = 0;
        } else if (tickAnim >= 18 && tickAnim < 26) {
            xx = 0D + (((tickAnim - 18D) / 8D) * (0D-(0D)));
            yy = 0D + (((tickAnim - 18D) / 8D) * (0D-(0D)));
            zz = 0D + (((tickAnim - 18D) / 8D) * (11D-(0D)));
        }
        else if (tickAnim >= 26 && tickAnim < 35) {
            xx = 0D + (((tickAnim - 26D) / 9D) * (0D-(0D)));
            yy = 0D + (((tickAnim - 26D) / 9D) * (0D-(0D)));
            zz = 11D + (((tickAnim - 26D) / 9D) * (0D-(11D)));
        } else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tentacle1, tentacle1.rotateAngleX + (float) Math.toRadians(xx), tentacle1.rotateAngleY + (float) Math.toRadians(yy), tentacle1.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 18) {
            xx = 1D + (((tickAnim - 0D) / 18D) * (0D-(1D)));
            yy = 0D + (((tickAnim - 0D) / 18D) * (0D-(0D)));
            zz = 0D + (((tickAnim - 0D) / 18D) * (0D-(0D)));
        }
        else if (tickAnim >= 18 && tickAnim < 35) {
            xx = 0D + (((tickAnim - 18D) / 17D) * (0D-(0D)));
            yy = 0D + (((tickAnim - 18D) / 17D) * (0D-(0D)));
            zz = 0D + (((tickAnim - 18D) / 17D) * (0D-(0D)));
        }
        else if (tickAnim >= 35 && tickAnim < 50) {
            xx = 0D + (((tickAnim - 35D) / 15D) * (1D-(0D)));
            yy = 0D + (((tickAnim - 35D) / 15D) * (0D-(0D)));
            zz = 0D + (((tickAnim - 35D) / 15D) * (0D-(0D)));
        }
        this.tentacle1.offsetX = (float) Math.toRadians(xx);
        this.tentacle1.offsetY = (float) Math.toRadians(yy);
        this.tentacle1.offsetZ = (float) Math.toRadians(zz);




        if (tickAnim >=0 && tickAnim < 18){
            xx = 0;
            yy = 0;
            zz = 0;
        } else if (tickAnim >= 18 && tickAnim < 26) {
            xx = 0D + (((tickAnim - 18D) / 8D) * (0D-(0D)));
            yy = 0D + (((tickAnim - 18D) / 8D) * (0D-(0D)));
            zz = 0D + (((tickAnim - 18D) / 8D) * (-9D-(0D)));
        }
        else if (tickAnim >= 26 && tickAnim < 35) {
            xx = 0D + (((tickAnim - 26D) / 9D) * (0D-(0D)));
            yy = 0D + (((tickAnim - 26D) / 9D) * (0D-(0D)));
            zz = -9D + (((tickAnim - 26D) / 9D) * (0D-(-9D)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tentacle3, tentacle3.rotateAngleX + (float) Math.toRadians(xx), tentacle3.rotateAngleY + (float) Math.toRadians(yy), tentacle3.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 18) {
            xx = -1D + (((tickAnim - 0D) / 18D) * (0D-(-1D)));
            yy = 0D + (((tickAnim - 0D) / 18D) * (0D-(0D)));
            zz = 0D + (((tickAnim - 0D) / 18D) * (0D-(0D)));
        }
        else if (tickAnim >= 18 && tickAnim < 35) {
            xx = 0D + (((tickAnim - 18D) / 17D) * (0D-(0D)));
            yy = 0D + (((tickAnim - 18D) / 17D) * (0D-(0D)));
            zz = 0D + (((tickAnim - 18D) / 17D) * (0D-(0D)));
        }
        else if (tickAnim >= 35 && tickAnim < 50) {
            xx = 0D + (((tickAnim - 35D) / 15D) * (-1D-(0D)));
            yy = 0D + (((tickAnim - 35D) / 15D) * (0D-(0D)));
            zz = 0D + (((tickAnim - 35D) / 15D) * (0D-(0D)));
        }
        this.tentacle3.offsetX = (float) Math.toRadians(xx);
        this.tentacle3.offsetY = (float) Math.toRadians(yy);
        this.tentacle3.offsetZ = (float) Math.toRadians(zz);




        if (tickAnim >=0 && tickAnim < 18){
            xx = 0;
            yy = 0;
            zz = 0;
        } else if (tickAnim >= 18 && tickAnim < 26) {
            xx = 0D + (((tickAnim - 18D) / 8D) * (0D-(0D)));
            yy = 0D + (((tickAnim - 18D) / 8D) * (0D-(0D)));
            zz = 0D + (((tickAnim - 18D) / 8D) * (-9D-(0D)));
        }
        else if (tickAnim >= 26 && tickAnim < 35) {
            xx = 0D + (((tickAnim - 26D) / 9D) * (0D-(0D)));
            yy = 0D + (((tickAnim - 26D) / 9D) * (0D-(0D)));
            zz = -9D + (((tickAnim - 26D) / 9D) * (0D-(-9D)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tentacle2, tentacle2.rotateAngleX + (float) Math.toRadians(xx), tentacle2.rotateAngleY + (float) Math.toRadians(yy), tentacle2.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 18) {
            xx = 0D + (((tickAnim - 0D) / 18D) * (0D-(0D)));
            yy = 0D + (((tickAnim - 0D) / 18D) * (0D-(0D)));
            zz = 1D + (((tickAnim - 0D) / 18D) * (0D-(1D)));
        }
        else if (tickAnim >= 18 && tickAnim < 35) {
            xx = 0D + (((tickAnim - 18D) / 17D) * (0D-(0D)));
            yy = 0D + (((tickAnim - 18D) / 17D) * (0D-(0D)));
            zz = 0D + (((tickAnim - 18D) / 17D) * (0D-(0D)));
        }
        else if (tickAnim >= 35 && tickAnim < 50) {
            xx = 0D + (((tickAnim - 35D) / 15D) * (0D-(0D)));
            yy = 0D + (((tickAnim - 35D) / 15D) * (0D-(0D)));
            zz = 0D + (((tickAnim - 35D) / 15D) * (1D-(0D)));
        }
        this.tentacle2.offsetX = (float) Math.toRadians(xx);
        this.tentacle2.offsetY = (float) Math.toRadians(yy);
        this.tentacle2.offsetZ = (float) Math.toRadians(zz);


        if (tickAnim >=0 && tickAnim < 18){
                xx = 0;
                yy = 0;
                zz = 0;
        } else if (tickAnim >= 18 && tickAnim < 26) {
            xx = 0D + (((tickAnim - 18D) / 8D) * (-14D-(0D)));
            yy = 0D + (((tickAnim - 18D) / 8D) * (0D-(0D)));
            zz = 0D + (((tickAnim - 18D) / 8D) * (0D-(0D)));
        }
        else if (tickAnim >= 26 && tickAnim < 35) {
            xx = -14D + (((tickAnim - 26D) / 9D) * (0D-(-14D)));
            yy = 0D + (((tickAnim - 26D) / 9D) * (0D-(0D)));
            zz = 0D + (((tickAnim - 26D) / 9D) * (0D-(0D)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tentacle4, tentacle4.rotateAngleX + (float) Math.toRadians(xx), tentacle4.rotateAngleY + (float) Math.toRadians(yy), tentacle4.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 18) {
            xx = 0D + (((tickAnim - 0D) / 18D) * (0D-(0D)));
            yy = 0D + (((tickAnim - 0D) / 18D) * (0D-(0D)));
            zz = 1D + (((tickAnim - 0D) / 18D) * (0D-(1D)));
        }
        else if (tickAnim >= 18 && tickAnim < 35) {
            xx = 0D + (((tickAnim - 18D) / 17D) * (0D-(0D)));
            yy = 0D + (((tickAnim - 18D) / 17D) * (0D-(0D)));
            zz = 0D + (((tickAnim - 18D) / 17D) * (0D-(0D)));
        }
        else if (tickAnim >= 35 && tickAnim < 50) {
            xx = 0D + (((tickAnim - 35D) / 15D) * (0D-(0D)));
            yy = 0D + (((tickAnim - 35D) / 15D) * (0D-(0D)));
            zz = 0D + (((tickAnim - 35D) / 15D) * (1D-(0D)));
        }
        this.tentacle4.offsetX = (float) Math.toRadians(xx);
        this.tentacle4.offsetY = (float) Math.toRadians(yy);
        this.tentacle4.offsetZ = (float) Math.toRadians(zz);

    }

    public void animWalking(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime) {
        EntityPrehistoricFloraHaplophrentis entity = (EntityPrehistoricFloraHaplophrentis) entitylivingbaseIn;
        int animCycle = 28;
        double tickAnim = (entity.ticksExisted + entity.getTickOffset()) - (int) (Math.floor((double) (entity.ticksExisted + entity.getTickOffset()) / (double) animCycle) * (double) animCycle) + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;

        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0D + (((tickAnim - 0D) / 10D) * (-5D-(0D)));
            yy = 0D + (((tickAnim - 0D) / 10D) * (0D-(0D)));
            zz = 0D + (((tickAnim - 0D) / 10D) * (0D-(0D)));
        }
        else if (tickAnim >= 10 && tickAnim < 20) {
            xx = -5D + (((tickAnim - 10D) / 10D) * (0D-(-5D)));
            yy = 0D + (((tickAnim - 10D) / 10D) * (0D-(0D)));
            zz = 0D + (((tickAnim - 10D) / 10D) * (0D-(0D)));
        }
        else if (tickAnim >= 20 && tickAnim < 28) {
            xx = 0D + (((tickAnim - 20D) / 8D) * (0D-(0D)));
            yy = 0D + (((tickAnim - 20D) / 8D) * (0D-(0D)));
            zz = 0D + (((tickAnim - 20D) / 8D) * (0D-(0D)));
        }
        this.setRotateAngle(base, base.rotateAngleX + (float) Math.toRadians(xx), base.rotateAngleY + (float) Math.toRadians(yy), base.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 5) {
            xx = 0D + (((tickAnim - 0D) / 5D) * (0D-(0D)));
            yy = 0D + (((tickAnim - 0D) / 5D) * (0D-(0D)));
            zz = 0D + (((tickAnim - 0D) / 5D) * (0D-(0D)));
        }
        else if (tickAnim >= 5 && tickAnim < 10) {
            xx = 0D + (((tickAnim - 5D) / 5D) * (0D-(0D)));
            yy = 0D + (((tickAnim - 5D) / 5D) * (0.05D-(0D)));
            zz = 0D + (((tickAnim - 5D) / 5D) * (-0.7D-(0D)));
        }
        else if (tickAnim >= 10 && tickAnim < 20) {
            xx = 0D + (((tickAnim - 10D) / 10D) * (0D-(0D)));
            yy = 0.05D + (((tickAnim - 10D) / 10D) * (0D-(0.05D)));
            zz = -0.7D + (((tickAnim - 10D) / 10D) * (-2.1D-(-0.7D)));
        }
        else if (tickAnim >= 20 && tickAnim < 28) {
            xx = 0D + (((tickAnim - 20D) / 8D) * (0D-(0D)));
            yy = 0D + (((tickAnim - 20D) / 8D) * (0D-(0D)));
            zz = -2.1D + (((tickAnim - 20D) / 8D) * (0D-(-2.1D)));
        }
        this.base.offsetX = (float) Math.toRadians(xx);
        this.base.offsetY = (float) Math.toRadians(yy);
        this.base.offsetZ = (float) Math.toRadians(zz);




        if (tickAnim >= 0 && tickAnim < 12) {
            xx = 17D + (((tickAnim - 0D) / 12D) * (11D-(17D)));
            yy = 0D + (((tickAnim - 0D) / 12D) * (0D-(0D)));
            zz = 0D + (((tickAnim - 0D) / 12D) * (0D-(0D)));
        }
        else if (tickAnim >= 12 && tickAnim < 28) {
            xx = 11D + (((tickAnim - 12D) / 16D) * (17D-(11D)));
            yy = 0D + (((tickAnim - 12D) / 16D) * (0D-(0D)));
            zz = 0D + (((tickAnim - 12D) / 16D) * (0D-(0D)));
        }
        this.setRotateAngle(hood, hood.rotateAngleX + (float) Math.toRadians(xx), hood.rotateAngleY + (float) Math.toRadians(yy), hood.rotateAngleZ + (float) Math.toRadians(zz));



        this.setRotateAngle(body, body.rotateAngleX + (float) Math.toRadians(0), body.rotateAngleY + (float) Math.toRadians(0), body.rotateAngleZ + (float) Math.toRadians(0));
        this.body.offsetX = (float) Math.toRadians(0);
        this.body.offsetY = (float) Math.toRadians(0);
        this.body.offsetZ = (float) Math.toRadians(1.2);



        if (tickAnim >=0 && tickAnim < 17){
            xx = 0;
            yy = 0;
            zz = 0;
        } else if (tickAnim >= 17 && tickAnim < 28) {
            xx = 0.6D + (((tickAnim - 17D) / 11D) * (0.6D-(0.6D)));
            yy = 0D + (((tickAnim - 17D) / 11D) * (0D-(0D)));
            zz = 0.4D + (((tickAnim - 17D) / 11D) * (0.4D-(0.4D)));
        }
        this.tentacle1.offsetX = (float) Math.toRadians(xx);
        this.tentacle1.offsetY = (float) Math.toRadians(yy);
        this.tentacle1.offsetZ = (float) Math.toRadians(zz);




        if (tickAnim >=0 && tickAnim < 17){
            xx = 0;
            yy = 0;
            zz = 0;
        } else if (tickAnim >= 17 && tickAnim < 28) {
            xx = -1D + (((tickAnim - 17D) / 11D) * (-1D-(-1D)));
            yy = 0D + (((tickAnim - 17D) / 11D) * (0D-(0D)));
            zz = 0.3D + (((tickAnim - 17D) / 11D) * (0.3D-(0.3D)));
        }
        this.tentacle3.offsetX = (float) Math.toRadians(xx);
        this.tentacle3.offsetY = (float) Math.toRadians(yy);
        this.tentacle3.offsetZ = (float) Math.toRadians(zz);




        if (tickAnim >=0 && tickAnim < 17){
            xx = 0;
            yy = 0;
            zz = 0;
        } else if (tickAnim >= 17 && tickAnim < 28) {
            xx = 0D + (((tickAnim - 17D) / 11D) * (0D-(0D)));
            yy = 0D + (((tickAnim - 17D) / 11D) * (0D-(0D)));
            zz = 1D + (((tickAnim - 17D) / 11D) * (1D-(1D)));
        }
        this.tentacle2.offsetX = (float) Math.toRadians(xx);
        this.tentacle2.offsetY = (float) Math.toRadians(yy);
        this.tentacle2.offsetZ = (float) Math.toRadians(zz);




        if (tickAnim >=0 && tickAnim < 17){
            xx = 0;
            yy = 0;
            zz = 0;
        } else if (tickAnim >= 17 && tickAnim < 28) {
            xx = 0D + (((tickAnim - 17D) / 11D) * (0D-(0D)));
            yy = 0D + (((tickAnim - 17D) / 11D) * (0D-(0D)));
            zz = 1D + (((tickAnim - 17D) / 11D) * (1D-(1D)));
        }
        this.tentacle4.offsetX = (float) Math.toRadians(xx);
        this.tentacle4.offsetY = (float) Math.toRadians(yy);
        this.tentacle4.offsetZ = (float) Math.toRadians(zz);




        if (tickAnim >= 0 && tickAnim < 5) {
            xx = 0D + (((tickAnim - 0D) / 5D) * (18D-(0D)));
            yy = 0D + (((tickAnim - 0D) / 5D) * (0D-(0D)));
            zz = 0D + (((tickAnim - 0D) / 5D) * (0D-(0D)));
        }
        else if (tickAnim >= 5 && tickAnim < 20) {
            xx = 18D + (((tickAnim - 5D) / 15D) * (162D-(18D)));
            yy = 0D + (((tickAnim - 5D) / 15D) * (0D-(0D)));
            zz = 0D + (((tickAnim - 5D) / 15D) * (0D-(0D)));
        }
        else if (tickAnim >= 20 && tickAnim < 28) {
            xx = 162D + (((tickAnim - 20D) / 8D) * (0D-(162D)));
            yy = 0D + (((tickAnim - 20D) / 8D) * (0D-(0D)));
            zz = 0D + (((tickAnim - 20D) / 8D) * (0D-(0D)));
        }
        this.setRotateAngle(horn, horn.rotateAngleX + (float) Math.toRadians(xx), horn.rotateAngleY + (float) Math.toRadians(yy), horn.rotateAngleZ + (float) Math.toRadians(zz));



        this.setRotateAngle(bone, bone.rotateAngleX + (float) Math.toRadians(0), bone.rotateAngleY + (float) Math.toRadians(0), bone.rotateAngleZ + (float) Math.toRadians(0));

    }
}




