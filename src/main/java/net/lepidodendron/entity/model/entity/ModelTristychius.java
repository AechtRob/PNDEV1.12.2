package net.lepidodendron.entity.model.entity;

import net.ilexiconn.llibrary.client.model.ModelAnimator;
import net.ilexiconn.llibrary.client.model.tools.AdvancedModelRenderer;
import net.ilexiconn.llibrary.server.animation.IAnimatedEntity;
import net.lepidodendron.entity.EntityPrehistoricFloraTristychius;
import net.lepidodendron.entity.model.ModelBasePalaeopedia;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLiving;
import net.minecraft.entity.EntityLivingBase;

public class ModelTristychius extends ModelBasePalaeopedia {
    private final AdvancedModelRenderer base;
    private final AdvancedModelRenderer bodyfront;
    private final AdvancedModelRenderer cube_r1;
    private final AdvancedModelRenderer cube_r2;
    private final AdvancedModelRenderer pectoralfinright;
    private final AdvancedModelRenderer pectoralfinleft;
    private final AdvancedModelRenderer gills;
    private final AdvancedModelRenderer cube_r3;
    private final AdvancedModelRenderer gillmeat;
    private final AdvancedModelRenderer cube_r4;
    private final AdvancedModelRenderer lowerjaw;
    private final AdvancedModelRenderer jawmeat;
    private final AdvancedModelRenderer lowerjawjoint;
    private final AdvancedModelRenderer upperjaw;
    private final AdvancedModelRenderer cube_r5;
    private final AdvancedModelRenderer cube_r6;
    private final AdvancedModelRenderer cube_r7;
    private final AdvancedModelRenderer upperjawjoint;
    private final AdvancedModelRenderer cube_r8;
    private final AdvancedModelRenderer bodylower;
    private final AdvancedModelRenderer cube_r9;
    private final AdvancedModelRenderer bodylower2;
    private final AdvancedModelRenderer cube_r10;
    private final AdvancedModelRenderer bodylower3;
    private final AdvancedModelRenderer cube_r11;
    private final AdvancedModelRenderer pelvicfinright;
    private final AdvancedModelRenderer pelvicfinleft;

    private ModelAnimator animator;


    public ModelTristychius() {
        this.textureWidth = 64;
        this.textureHeight = 64;

        this.base = new AdvancedModelRenderer(this);
        this.base.setRotationPoint(0.0F, 23.7F, 0.0F);


        this.bodyfront = new AdvancedModelRenderer(this);
        this.bodyfront.setRotationPoint(0.0F, -3.0F, 0.0F);
        this.base.addChild(bodyfront);
        this.bodyfront.cubeList.add(new ModelBox(bodyfront, 0, 14, -3.0F, -2.0F, -8.0F, 6, 5, 8, 0.0F, false));

        this.cube_r1 = new AdvancedModelRenderer(this);
        this.cube_r1.setRotationPoint(0.0F, -2.0F, -6.25F);
        this.bodyfront.addChild(cube_r1);
        this.setRotateAngle(cube_r1, -0.8814F, 0.0F, 0.0F);
        this.cube_r1.cubeList.add(new ModelBox(cube_r1, 0, 14, -0.5F, -6.75F, -0.175F, 1, 7, 1, 0.0F, false));

        this.cube_r2 = new AdvancedModelRenderer(this);
        this.cube_r2.setRotationPoint(0.0F, 3.0F, 0.0F);
        this.bodyfront.addChild(cube_r2);
        this.setRotateAngle(cube_r2, 0.0698F, 0.0F, 0.0F);
        this.cube_r2.cubeList.add(new ModelBox(cube_r2, 0, 34, 0.0F, -9.0F, -4.75F, 0, 4, 6, 0.0F, false));

        this.pectoralfinright = new AdvancedModelRenderer(this);
        this.pectoralfinright.setRotationPoint(-3.0F, 2.0F, -7.0F);
        this.bodyfront.addChild(pectoralfinright);
        this.setRotateAngle(pectoralfinright, 0.0F, -0.2182F, -0.2182F);
        this.pectoralfinright.cubeList.add(new ModelBox(pectoralfinright, 20, 15, -3.75F, 0.0F, -0.75F, 5, 0, 8, 0.0F, false));

        this.pectoralfinleft = new AdvancedModelRenderer(this);
        this.pectoralfinleft.setRotationPoint(3.0F, 2.0F, -7.0F);
        this.bodyfront.addChild(pectoralfinleft);
        this.setRotateAngle(pectoralfinleft, 0.0F, 0.2182F, 0.2182F);
        this.pectoralfinleft.cubeList.add(new ModelBox(pectoralfinleft, 20, 15, -1.25F, 0.0F, -0.75F, 5, 0, 8, 0.0F, true));

        this.gills = new AdvancedModelRenderer(this);
        this.gills.setRotationPoint(0.0F, 0.0F, -8.0F);
        this.bodyfront.addChild(gills);


        this.cube_r3 = new AdvancedModelRenderer(this);
        this.cube_r3.setRotationPoint(0.0F, -2.0F, 0.0F);
        this.gills.addChild(cube_r3);
        this.setRotateAngle(cube_r3, 0.0262F, 0.0F, 0.0F);
        this.cube_r3.cubeList.add(new ModelBox(cube_r3, 25, 38, 1.75F, 0.175F, -4.6F, 1, 4, 5, 0.0F, true));
        this.cube_r3.cubeList.add(new ModelBox(cube_r3, 25, 38, -2.75F, 0.175F, -4.6F, 1, 4, 5, 0.0F, false));
        this.cube_r3.cubeList.add(new ModelBox(cube_r3, 24, 23, -2.5F, 0.025F, -4.55F, 5, 4, 5, 0.0F, false));

        this.gillmeat = new AdvancedModelRenderer(this);
        this.gillmeat.setRotationPoint(0.0F, 2.0F, 0.5F);
        this.gills.addChild(gillmeat);


        this.cube_r4 = new AdvancedModelRenderer(this);
        this.cube_r4.setRotationPoint(0.0F, 0.0F, -5.0F);
        this.gillmeat.addChild(cube_r4);
        this.setRotateAngle(cube_r4, -0.1047F, 0.0F, 0.0F);
        this.cube_r4.cubeList.add(new ModelBox(cube_r4, 18, 32, -2.0F, -0.6058F, -0.0468F, 4, 1, 5, 0.0F, false));

        this.lowerjaw = new AdvancedModelRenderer(this);
        this.lowerjaw.setRotationPoint(0.0F, 0.0F, -4.5F);
        this.gills.addChild(lowerjaw);
        this.setRotateAngle(lowerjaw, -0.2182F, 0.0F, 0.0F);
        this.lowerjaw.cubeList.add(new ModelBox(lowerjaw, 32, 34, -2.5F, -0.075F, -3.25F, 5, 2, 4, -0.01F, false));
        this.lowerjaw.cubeList.add(new ModelBox(lowerjaw, 38, 20, -2.0F, 1.0F, -4.75F, 4, 1, 2, -0.02F, false));

        this.jawmeat = new AdvancedModelRenderer(this);
        this.jawmeat.setRotationPoint(0.0F, 2.0F, -3.5F);
        this.lowerjaw.addChild(jawmeat);
        this.setRotateAngle(jawmeat, -0.0873F, 0.0F, 0.0F);
        this.jawmeat.cubeList.add(new ModelBox(jawmeat, 38, 15, -2.0F, -1.0F, 0.0F, 4, 1, 4, -0.005F, false));

        this.lowerjawjoint = new AdvancedModelRenderer(this);
        this.lowerjawjoint.setRotationPoint(0.0F, 1.0F, -3.5F);
        this.lowerjaw.addChild(lowerjawjoint);
        this.setRotateAngle(lowerjawjoint, -0.7854F, 0.0F, 0.0F);
        this.lowerjawjoint.cubeList.add(new ModelBox(lowerjawjoint, 0, 0, -2.0F, -1.5F, -0.25F, 4, 2, 1, -0.025F, false));

        this.upperjaw = new AdvancedModelRenderer(this);
        this.upperjaw.setRotationPoint(0.0F, 0.0F, -4.5F);
        this.gills.addChild(upperjaw);
        this.setRotateAngle(upperjaw, 0.2182F, 0.0F, 0.0F);
        this.upperjaw.cubeList.add(new ModelBox(upperjaw, 38, 0, -2.5F, -1.75F, -3.25F, 5, 2, 4, 0.01F, false));
        this.upperjaw.cubeList.add(new ModelBox(upperjaw, 31, 32, -2.5F, -1.65F, -2.5F, 5, 1, 1, 0.02F, false));
        this.upperjaw.cubeList.add(new ModelBox(upperjaw, 39, 23, -2.0F, -1.75F, -5.0F, 4, 1, 2, 0.0F, false));

        this.cube_r5 = new AdvancedModelRenderer(this);
        this.cube_r5.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.upperjaw.addChild(cube_r5);
        this.setRotateAngle(cube_r5, -0.2618F, 0.0F, 0.0F);
        this.cube_r5.cubeList.add(new ModelBox(cube_r5, 28, 0, -2.0F, -0.425F, -5.0F, 4, 1, 2, -0.015F, false));

        this.cube_r6 = new AdvancedModelRenderer(this);
        this.cube_r6.setRotationPoint(0.0F, -1.25F, -5.0F);
        this.upperjaw.addChild(cube_r6);
        this.setRotateAngle(cube_r6, 0.0F, -0.3927F, 0.0F);
        this.cube_r6.cubeList.add(new ModelBox(cube_r6, 0, 6, 0.5F, 0.35F, -1.5F, 1, 0, 2, 0.0F, false));

        this.cube_r7 = new AdvancedModelRenderer(this);
        this.cube_r7.setRotationPoint(0.0F, -1.25F, -5.0F);
        this.upperjaw.addChild(cube_r7);
        this.setRotateAngle(cube_r7, 0.0F, 0.3927F, 0.0F);
        this.cube_r7.cubeList.add(new ModelBox(cube_r7, 2, 6, -1.5F, 0.35F, -1.5F, 1, 0, 2, 0.0F, false));

        this.upperjawjoint = new AdvancedModelRenderer(this);
        this.upperjawjoint.setRotationPoint(0.0F, -0.75F, -3.5F);
        this.upperjaw.addChild(upperjawjoint);
        this.setRotateAngle(upperjawjoint, 0.2967F, 0.0F, 0.0F);


        this.cube_r8 = new AdvancedModelRenderer(this);
        this.cube_r8.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.upperjawjoint.addChild(cube_r8);
        this.setRotateAngle(cube_r8, 0.0873F, 0.0F, 0.0F);
        this.cube_r8.cubeList.add(new ModelBox(cube_r8, 0, 3, -2.0F, -0.7F, -0.5F, 4, 2, 1, -0.01F, false));

        this.bodylower = new AdvancedModelRenderer(this);
        this.bodylower.setRotationPoint(0.0F, -3.0F, 0.0F);
        this.base.addChild(bodylower);
        this.bodylower.cubeList.add(new ModelBox(bodylower, 0, 0, -2.5F, -1.75F, -0.75F, 5, 4, 10, 0.0F, false));

        this.cube_r9 = new AdvancedModelRenderer(this);
        this.cube_r9.setRotationPoint(0.0F, 3.0F, 0.0F);
        this.bodylower.addChild(cube_r9);
        this.setRotateAngle(cube_r9, 0.0436F, 0.0F, 0.0F);
        this.cube_r9.cubeList.add(new ModelBox(cube_r9, 20, 4, -2.0F, -1.25F, -0.75F, 4, 1, 10, 0.0F, false));

        this.bodylower2 = new AdvancedModelRenderer(this);
        this.bodylower2.setRotationPoint(0.0F, -0.5F, 9.25F);
        this.bodylower.addChild(bodylower2);
        this.setRotateAngle(bodylower2, 0.0873F, 0.0F, 0.0F);
        this.bodylower2.cubeList.add(new ModelBox(bodylower2, 0, 31, -1.5F, -1.0F, -0.5F, 3, 3, 6, 0.0F, false));
        this.bodylower2.cubeList.add(new ModelBox(bodylower2, 18, 32, 0.0F, -6.0F, 0.25F, 0, 5, 6, 0.0F, false));

        this.cube_r10 = new AdvancedModelRenderer(this);
        this.cube_r10.setRotationPoint(0.0F, 3.5F, -9.25F);
        this.bodylower2.addChild(cube_r10);
        this.setRotateAngle(cube_r10, -0.3054F, 0.0F, 0.0F);
        this.cube_r10.cubeList.add(new ModelBox(cube_r10, 4, 14, -0.5F, -13.0F, 7.5F, 1, 6, 1, 0.0F, false));

        this.bodylower3 = new AdvancedModelRenderer(this);
        this.bodylower3.setRotationPoint(0.0F, 0.0F, 5.25F);
        this.bodylower2.addChild(bodylower3);
        this.setRotateAngle(bodylower3, 0.0873F, 0.0F, 0.0F);
        this.bodylower3.cubeList.add(new ModelBox(bodylower3, 38, 6, -1.0F, -0.75F, -0.25F, 2, 2, 5, 0.0F, false));

        this.cube_r11 = new AdvancedModelRenderer(this);
        this.cube_r11.setRotationPoint(0.0F, 3.5F, -9.5F);
        this.bodylower3.addChild(cube_r11);
        this.setRotateAngle(cube_r11, 0.0436F, 0.0F, 0.0F);
        this.cube_r11.cubeList.add(new ModelBox(cube_r11, 0, 15, 0.0F, -3.75F, 9.25F, 0, 4, 12, 0.0F, false));

        this.pelvicfinright = new AdvancedModelRenderer(this);
        this.pelvicfinright.setRotationPoint(-1.0F, 2.25F, 6.0F);
        this.bodylower.addChild(pelvicfinright);
        this.setRotateAngle(pelvicfinright, 0.0F, 0.0F, -0.2618F);
        this.pelvicfinright.cubeList.add(new ModelBox(pelvicfinright, 11, 0, -4.0F, 0.0F, -1.0F, 4, 0, 9, 0.0F, false));

        this.pelvicfinleft = new AdvancedModelRenderer(this);
        this.pelvicfinleft.setRotationPoint(1.0F, 2.25F, 6.0F);
        this.bodylower.addChild(pelvicfinleft);
        this.setRotateAngle(pelvicfinleft, 0.0F, 0.0F, 0.2618F);
        this.pelvicfinleft.cubeList.add(new ModelBox(pelvicfinleft, 11, 0, 0.0F, 0.0F, -1.0F, 4, 0, 9, 0.0F, true));

        updateDefaultPose();
        animator = ModelAnimator.create();
    }

    @Override
    public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        animate((IAnimatedEntity) entity, f, f1, f2, f3, f4, f5);
        this.base.render(f5);
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
        this.base.offsetY = -2.0F;
        this.base.offsetX = -1.338F;
        this.base.rotateAngleY = (float)Math.toRadians(200);
        this.base.rotateAngleX = (float)Math.toRadians(8);
        this.base.rotateAngleZ = (float)Math.toRadians(-8);
        this.base.scaleChildren = true;
        float scaler = 1.63F;
        this.base.setScale(scaler, scaler, scaler);
        //Start of pose:

        //End of pose, now render the model:
        this.base.render(f);
        //Reset rotations, positions and sizing:
        this.base.setScale(1.0F, 1.0F, 1.0F);
        this.base.scaleChildren = false;
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
       // this.Root.offsetY = 0.4F;
        //this.Root.offsetY = -0.2F;
        //this.Root.offsetZ = 0.1F;


        AdvancedModelRenderer[] fishBody = {this.bodylower, this.bodylower2, this.bodylower3};



        //mouthparts:

        float speed = 0.2F;

        EntityPrehistoricFloraTristychius slimon = (EntityPrehistoricFloraTristychius) e;


        if (e instanceof EntityLiving && !((EntityLiving) e).isAIDisabled()) {
            if(!slimon.getIsMoving()) {//not moving
                this.chainSwing(fishBody, speed, 0.3F, -0.2F, f2, 0.2F);
            }


            if (!e.isInWater()) {//on land
                //this.Bodyfront.rotateAngleZ = (float) Math.toRadians(90);
               // this.Root.offsetY = 0.2F;
                //this.bob(body, -speed * 1.5F, 2F, false, f2, 1);
                this.chainSwing(fishBody, speed, 0.01F, -2, f2, 1);
            }
        }
    }
    @Override
    public void setLivingAnimations(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime) {
        super.setLivingAnimations(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime);
        this.resetToDefaultPose();
        EntityPrehistoricFloraTristychius ee = (EntityPrehistoricFloraTristychius) entitylivingbaseIn;
        //Swimming pose:

        if ((ee.isReallyInWater())) {
            //Walk pose:
            if(ee.isAtBottom()) {
                if(ee.getIsMoving()) {
                    animWalking(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime);
                }
            } else {
                animSwim(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime);
            }

        } else {

        }

        if (ee.getAnimation() == ee.STAND_ANIMATION) {
            animIdle(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime, ee.getAnimationTick());
        }

    }

    public void animWalking(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime) {
        EntityPrehistoricFloraTristychius entity = (EntityPrehistoricFloraTristychius) entitylivingbaseIn;
        int animCycle = 40;
        double tickAnim = (entity.ticksExisted + entity.getTickOffset()) - (int) (Math.floor((double) (entity.ticksExisted + entity.getTickOffset()) / (double) animCycle) * (double) animCycle) + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;
        this.setRotateAngle(bodyfront, bodyfront.rotateAngleX + (float) Math.toRadians(0), bodyfront.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180-80))*4), bodyfront.rotateAngleZ + (float) Math.toRadians(0));



        if (tickAnim >= 0 && tickAnim < 16) {
            xx = -0.91827 + (((tickAnim - 0) / 16) * (1.02032-(-0.91827)));
            yy = -17.23407 + (((tickAnim - 0) / 16) * (-3.77344-(-17.23407)));
            zz = 7.53971 + (((tickAnim - 0) / 16) * (7.2648-(7.53971)));
        }
        else if (tickAnim >= 16 && tickAnim < 23) {
            xx = 1.02032 + (((tickAnim - 16) / 7) * (5.02433-(1.02032)));
            yy = -3.77344 + (((tickAnim - 16) / 7) * (-15.5375+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120+50))*8-(-3.77344)));
            zz = 7.2648 + (((tickAnim - 16) / 7) * (19.087+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120))*-5-(7.2648)));
        }
        else if (tickAnim >= 23 && tickAnim < 30) {
            xx = 5.02433 + (((tickAnim - 23) / 7) * (-1.11723-(5.02433)));
            yy = -15.5375+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120+50))*8 + (((tickAnim - 23) / 7) * (-27.71193-(-15.5375+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120+50))*8)));
            zz = 19.087+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120))*-5 + (((tickAnim - 23) / 7) * (11.14931-(19.087+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120))*-5)));
        }
        else if (tickAnim >= 30 && tickAnim < 35) {
            xx = -1.11723 + (((tickAnim - 30) / 5) * (0.4574-(-1.11723)));
            yy = -27.71193 + (((tickAnim - 30) / 5) * (-19.99978-(-27.71193)));
            zz = 11.14931 + (((tickAnim - 30) / 5) * (9.43483-(11.14931)));
        }
        else if (tickAnim >= 35 && tickAnim < 40) {
            xx = 0.4574 + (((tickAnim - 35) / 5) * (-0.91827-(0.4574)));
            yy = -19.99978 + (((tickAnim - 35) / 5) * (-17.23407-(-19.99978)));
            zz = 9.43483 + (((tickAnim - 35) / 5) * (7.53971-(9.43483)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(pectoralfinright, pectoralfinright.rotateAngleX + (float) Math.toRadians(xx), pectoralfinright.rotateAngleY + (float) Math.toRadians(yy), pectoralfinright.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 8) {
            xx = 1.02032 + (((tickAnim - 0) / 8) * (5.02433-(1.02032)));
            yy = -3.77344 + (((tickAnim - 0) / 8) * (21.06253-(-3.77344)));
            zz = -7.26476 + (((tickAnim - 0) / 8) * (-17.537-(-7.26476)));
        }
        else if (tickAnim >= 8 && tickAnim < 16) {
            xx = 5.02433 + (((tickAnim - 8) / 8) * (-3.10735-(5.02433)));
            yy = 21.06253 + (((tickAnim - 8) / 8) * (36.40417-(21.06253)));
            zz = -17.537 + (((tickAnim - 8) / 8) * (-13.40275-(-17.537)));
        }
        else if (tickAnim >= 16 && tickAnim < 40) {
            xx = -3.10735 + (((tickAnim - 16) / 24) * (1.02032-(-3.10735)));
            yy = 36.40417 + (((tickAnim - 16) / 24) * (-3.77344-(36.40417)));
            zz = -13.40275 + (((tickAnim - 16) / 24) * (-7.26476-(-13.40275)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(pectoralfinleft, pectoralfinleft.rotateAngleX + (float) Math.toRadians(xx), pectoralfinleft.rotateAngleY + (float) Math.toRadians(yy), pectoralfinleft.rotateAngleZ + (float) Math.toRadians(zz));



        this.setRotateAngle(bodylower, bodylower.rotateAngleX + (float) Math.toRadians(0), bodylower.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180-150))*4), bodylower.rotateAngleZ + (float) Math.toRadians(0));



        if (tickAnim >= 0 && tickAnim < 8) {
            xx = -1.50184 + (((tickAnim - 0) / 8) * (8.21888-(-1.50184)));
            yy = -16.9651 + (((tickAnim - 0) / 8) * (-30.20818-(-16.9651)));
            zz = 13.53356 + (((tickAnim - 0) / 8) * (20.96731-(13.53356)));
        }
        else if (tickAnim >= 8 && tickAnim < 16) {
            xx = 8.21888 + (((tickAnim - 8) / 8) * (-2.05706-(8.21888)));
            yy = -30.20818 + (((tickAnim - 8) / 8) * (-45.70213-(-30.20818)));
            zz = 20.96731 + (((tickAnim - 8) / 8) * (14.56784-(20.96731)));
        }
        else if (tickAnim >= 16 && tickAnim < 28) {
            xx = -2.05706 + (((tickAnim - 16) / 12) * (0.96098-(-2.05706)));
            yy = -45.70213 + (((tickAnim - 16) / 12) * (-31.82908-(-45.70213)));
            zz = 14.56784 + (((tickAnim - 16) / 12) * (14.06853-(14.56784)));
        }
        else if (tickAnim >= 28 && tickAnim < 40) {
            xx = 0.96098 + (((tickAnim - 28) / 12) * (-1.50184-(0.96098)));
            yy = -31.82908 + (((tickAnim - 28) / 12) * (-16.9651-(-31.82908)));
            zz = 14.06853 + (((tickAnim - 28) / 12) * (13.53356-(14.06853)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(pelvicfinright, pelvicfinright.rotateAngleX + (float) Math.toRadians(xx), pelvicfinright.rotateAngleY + (float) Math.toRadians(yy), pelvicfinright.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 3) {
            xx = -3.31941 + (((tickAnim - 0) / 3) * (-1.59782-(-3.31941)));
            yy = 37.13457 + (((tickAnim - 0) / 3) * (33.34695-(37.13457)));
            zz = -15.75795 + (((tickAnim - 0) / 3) * (-15.91071-(-15.75795)));
        }
        else if (tickAnim >= 3 && tickAnim < 8) {
            xx = -1.59782 + (((tickAnim - 3) / 5) * (-0.57083-(-1.59782)));
            yy = 33.34695 + (((tickAnim - 3) / 5) * (28.61244-(33.34695)));
            zz = -15.91071 + (((tickAnim - 3) / 5) * (-16.10165-(-15.91071)));
        }
        else if (tickAnim >= 8 && tickAnim < 16) {
            xx = -0.57083 + (((tickAnim - 8) / 8) * (-0.50184-(-0.57083)));
            yy = 28.61244 + (((tickAnim - 8) / 8) * (16.9651-(28.61244)));
            zz = -16.10165 + (((tickAnim - 8) / 8) * (-13.5336-(-16.10165)));
        }
        else if (tickAnim >= 16 && tickAnim < 23) {
            xx = -0.50184 + (((tickAnim - 16) / 7) * (8.21888-(-0.50184)));
            yy = 16.9651 + (((tickAnim - 16) / 7) * (30.2082-(16.9651)));
            zz = -13.5336 + (((tickAnim - 16) / 7) * (-20.9673-(-13.5336)));
        }
        else if (tickAnim >= 23 && tickAnim < 32) {
            xx = 8.21888 + (((tickAnim - 23) / 9) * (-2.05706-(8.21888)));
            yy = 30.2082 + (((tickAnim - 23) / 9) * (45.7021-(30.2082)));
            zz = -20.9673 + (((tickAnim - 23) / 9) * (-14.5678-(-20.9673)));
        }
        else if (tickAnim >= 32 && tickAnim < 40) {
            xx = -2.05706 + (((tickAnim - 32) / 8) * (-3.31941-(-2.05706)));
            yy = 45.7021 + (((tickAnim - 32) / 8) * (37.13457-(45.7021)));
            zz = -14.5678 + (((tickAnim - 32) / 8) * (-15.75795-(-14.5678)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(pelvicfinleft, pelvicfinleft.rotateAngleX + (float) Math.toRadians(xx), pelvicfinleft.rotateAngleY + (float) Math.toRadians(yy), pelvicfinleft.rotateAngleZ + (float) Math.toRadians(zz));



        this.setRotateAngle(base, base.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180/0.5))*-1), base.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180))*4), base.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180))*2));
        this.base.rotationPointX = this.base.rotationPointX + (float)(0);
        this.base.rotationPointY = this.base.rotationPointY - (float)(-0.625);
        this.base.rotationPointZ = this.base.rotationPointZ + (float)(0);


        this.setRotateAngle(bodylower2, bodylower2.rotateAngleX + (float) Math.toRadians(-9), bodylower2.rotateAngleY + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180-180))*8), bodylower2.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(bodylower3, bodylower3.rotateAngleX + (float) Math.toRadians(-1.25), bodylower3.rotateAngleY + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180-250))*8), bodylower3.rotateAngleZ + (float) Math.toRadians(0));

    }
    public void animSwim(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime) {
        EntityPrehistoricFloraTristychius entity = (EntityPrehistoricFloraTristychius) entitylivingbaseIn;
        int animCycle = 22;
        double tickAnim = (entity.ticksExisted + entity.getTickOffset()) - (int) (Math.floor((double) (entity.ticksExisted + entity.getTickOffset()) / (double) animCycle) * (double) animCycle) + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;
        this.setRotateAngle(base, base.rotateAngleX + (float) Math.toRadians(0), base.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*320-50))*5), base.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*320))*2));
        this.setRotateAngle(pectoralfinright, pectoralfinright.rotateAngleX + (float) Math.toRadians(0), pectoralfinright.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*320-100))*2), pectoralfinright.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*320))*2));
        this.setRotateAngle(pectoralfinleft, pectoralfinleft.rotateAngleX + (float) Math.toRadians(0), pectoralfinleft.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*320-100))*2), pectoralfinleft.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*320))*2));
        this.setRotateAngle(gills, gills.rotateAngleX + (float) Math.toRadians(0), gills.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*320-150))*-2), gills.rotateAngleZ + (float) Math.toRadians(0));
        this.setRotateAngle(bodylower, bodylower.rotateAngleX + (float) Math.toRadians(0), bodylower.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*320-150))*6), bodylower.rotateAngleZ + (float) Math.toRadians(0));
        this.setRotateAngle(bodylower2, bodylower2.rotateAngleX + (float) Math.toRadians(0), bodylower2.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*320-200))*10), bodylower2.rotateAngleZ + (float) Math.toRadians(0));
        this.setRotateAngle(bodylower3, bodylower3.rotateAngleX + (float) Math.toRadians(0), bodylower3.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*320-250))*15), bodylower3.rotateAngleZ + (float) Math.toRadians(0));
        this.setRotateAngle(pelvicfinright, pelvicfinright.rotateAngleX + (float) Math.toRadians(0), pelvicfinright.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*320-100))*2), pelvicfinright.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*320))*2));
        this.setRotateAngle(pelvicfinleft, pelvicfinleft.rotateAngleX + (float) Math.toRadians(0), pelvicfinleft.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*320-100))*2), pelvicfinleft.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*320))*2));


    }

    public void animIdle(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime, double animTick) {
        EntityPrehistoricFloraTristychius entity = (EntityPrehistoricFloraTristychius) entitylivingbaseIn;
        int animCycle = 40;
        double tickAnim = animTick + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;
         if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 0) / 10) * (-12.5-(0)));
            yy = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 40) {
            xx = -12.5 + (((tickAnim - 10) / 30) * (0-(-12.5)));
            yy = 0 + (((tickAnim - 10) / 30) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 30) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(bodyfront, bodyfront.rotateAngleX + (float) Math.toRadians(xx), bodyfront.rotateAngleY + (float) Math.toRadians(yy), bodyfront.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 0) / 10) * (-2.5-(0)));
            yy = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 40) {
            xx = -2.5 + (((tickAnim - 10) / 30) * (0-(-2.5)));
            yy = 0 + (((tickAnim - 10) / 30) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 30) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(gills, gills.rotateAngleX + (float) Math.toRadians(xx), gills.rotateAngleY + (float) Math.toRadians(yy), gills.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 0) / 10) * (-12.5-(0)));
            yy = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 40) {
            xx = -12.5 + (((tickAnim - 10) / 30) * (0-(-12.5)));
            yy = 0 + (((tickAnim - 10) / 30) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 30) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(upperjaw, upperjaw.rotateAngleX + (float) Math.toRadians(xx), upperjaw.rotateAngleY + (float) Math.toRadians(yy), upperjaw.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 0) / 10) * (-2.5-(0)));
            yy = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 40) {
            xx = -2.5 + (((tickAnim - 10) / 30) * (0-(-2.5)));
            yy = 0 + (((tickAnim - 10) / 30) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 30) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(upperjawjoint, upperjawjoint.rotateAngleX + (float) Math.toRadians(xx), upperjawjoint.rotateAngleY + (float) Math.toRadians(yy), upperjawjoint.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 0) / 10) * (17-(0)));
            yy = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 40) {
            xx = 17 + (((tickAnim - 10) / 30) * (0-(17)));
            yy = 0 + (((tickAnim - 10) / 30) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 30) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(lowerjaw, lowerjaw.rotateAngleX + (float) Math.toRadians(xx), lowerjaw.rotateAngleY + (float) Math.toRadians(yy), lowerjaw.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 0) / 10) * (-7.5-(0)));
            yy = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 40) {
            xx = -7.5 + (((tickAnim - 10) / 30) * (0-(-7.5)));
            yy = 0 + (((tickAnim - 10) / 30) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 30) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(jawmeat, jawmeat.rotateAngleX + (float) Math.toRadians(xx), jawmeat.rotateAngleY + (float) Math.toRadians(yy), jawmeat.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 0) / 10) * (5-(0)));
            yy = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 40) {
            xx = 5 + (((tickAnim - 10) / 30) * (0-(5)));
            yy = 0 + (((tickAnim - 10) / 30) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 30) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(gillmeat, gillmeat.rotateAngleX + (float) Math.toRadians(xx), gillmeat.rotateAngleY + (float) Math.toRadians(yy), gillmeat.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 0) / 10) * (35-(0)));
            yy = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 40) {
            xx = 35 + (((tickAnim - 10) / 30) * (0-(35)));
            yy = 0 + (((tickAnim - 10) / 30) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 30) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(lowerjawjoint, lowerjawjoint.rotateAngleX + (float) Math.toRadians(xx), lowerjawjoint.rotateAngleY + (float) Math.toRadians(yy), lowerjawjoint.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 10) * (-10-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (-5-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 40) {
            xx = 0 + (((tickAnim - 10) / 30) * (0-(0)));
            yy = -10 + (((tickAnim - 10) / 30) * (0-(-10)));
            zz = -5 + (((tickAnim - 10) / 30) * (0-(-5)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(pectoralfinright, pectoralfinright.rotateAngleX + (float) Math.toRadians(xx), pectoralfinright.rotateAngleY + (float) Math.toRadians(yy), pectoralfinright.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 10) * (10-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (5-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 40) {
            xx = 0 + (((tickAnim - 10) / 30) * (0-(0)));
            yy = 10 + (((tickAnim - 10) / 30) * (0-(10)));
            zz = 5 + (((tickAnim - 10) / 30) * (0-(5)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(pectoralfinleft, pectoralfinleft.rotateAngleX + (float) Math.toRadians(xx), pectoralfinleft.rotateAngleY + (float) Math.toRadians(yy), pectoralfinleft.rotateAngleZ + (float) Math.toRadians(zz));


    }

    public void animate(IAnimatedEntity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        EntityPrehistoricFloraTristychius e = (EntityPrehistoricFloraTristychius) entity;

    }
}
