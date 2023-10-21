package net.lepidodendron.entity.model.entity;

import net.ilexiconn.llibrary.client.model.ModelAnimator;
import net.ilexiconn.llibrary.client.model.tools.AdvancedModelBase;
import net.ilexiconn.llibrary.client.model.tools.AdvancedModelRenderer;
import net.ilexiconn.llibrary.server.animation.IAnimatedEntity;
import net.lepidodendron.entity.EntityPrehistoricFloraHoplitaspis;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLiving;
import net.minecraft.entity.EntityLivingBase;

public class ModelHoplitaspis extends AdvancedModelBase {
    private final AdvancedModelRenderer Root;
    private final AdvancedModelRenderer Head;
    private final AdvancedModelRenderer RPaddle;
    private final AdvancedModelRenderer RPaddle2;
    private final AdvancedModelRenderer LPaddle;
    private final AdvancedModelRenderer LPaddle2;
    private final AdvancedModelRenderer RLeg4;
    private final AdvancedModelRenderer LLeg4;
    private final AdvancedModelRenderer RLeg3;
    private final AdvancedModelRenderer LLeg3;
    private final AdvancedModelRenderer RLeg2;
    private final AdvancedModelRenderer LLeg2;
    private final AdvancedModelRenderer RLeg1;
    private final AdvancedModelRenderer LLeg1;
    private final AdvancedModelRenderer Body;
    private final AdvancedModelRenderer Tail;
    private final AdvancedModelRenderer Tail2;
    private final AdvancedModelRenderer Tail3;
    private final AdvancedModelRenderer Tail4;
    private final AdvancedModelRenderer Tail5;
    private final AdvancedModelRenderer Tail6;

    private ModelAnimator animator;


    public ModelHoplitaspis() {
        this.textureWidth = 34;
        this.textureHeight = 26;

        this.Root = new AdvancedModelRenderer(this);
        this.Root.setRotationPoint(0.0F, 22.25F, 0.0F);


        this.Head = new AdvancedModelRenderer(this);
        this.Head.setRotationPoint(0.0F, 0.0F, -2.0F);
        this.Root.addChild(Head);
        this.Head.cubeList.add(new ModelBox(Head, 0, 0, -3.0F, -1.0F, -5.0F, 6, 2, 5, 0.0F, false));
        this.Head.cubeList.add(new ModelBox(Head, 0, 0, -1.25F, -1.01F, -2.0F, 1, 2, 1, 0.0F, false));
        this.Head.cubeList.add(new ModelBox(Head, 0, 0, 0.25F, -1.01F, -2.0F, 1, 2, 1, 0.0F, true));

        this.RPaddle = new AdvancedModelRenderer(this);
        this.RPaddle.setRotationPoint(-2.0F, 1.0F, -1.0F);
        this.Head.addChild(RPaddle);
        this.setRotateAngle(RPaddle, 0.0945F, 0.4025F, -0.0941F);
        this.RPaddle.cubeList.add(new ModelBox(RPaddle, 25, 13, -3.0F, -0.5F, -0.5F, 3, 1, 1, 0.0F, false));

        this.RPaddle2 = new AdvancedModelRenderer(this);
        this.RPaddle2.setRotationPoint(-3.0F, 0.0F, 0.0F);
        this.RPaddle.addChild(RPaddle2);
        this.setRotateAngle(RPaddle2, 0.0F, 0.6545F, 0.0F);
        this.RPaddle2.cubeList.add(new ModelBox(RPaddle2, 18, 8, -5.0F, -0.488F, -0.5F, 5, 1, 2, 0.0F, false));

        this.LPaddle = new AdvancedModelRenderer(this);
        this.LPaddle.setRotationPoint(2.0F, 1.0F, -1.0F);
        this.Head.addChild(LPaddle);
        this.setRotateAngle(LPaddle, 0.0945F, -0.4025F, 0.0941F);
        this.LPaddle.cubeList.add(new ModelBox(LPaddle, 25, 13, 0.0F, -0.5F, -0.5F, 3, 1, 1, 0.0F, true));

        this.LPaddle2 = new AdvancedModelRenderer(this);
        this.LPaddle2.setRotationPoint(3.0F, 0.0F, 0.0F);
        this.LPaddle.addChild(LPaddle2);
        this.setRotateAngle(LPaddle2, 0.0F, -0.6545F, 0.0F);
        this.LPaddle2.cubeList.add(new ModelBox(LPaddle2, 18, 8, 0.0F, -0.488F, -0.5F, 5, 1, 2, 0.0F, true));

        this.RLeg4 = new AdvancedModelRenderer(this);
        this.RLeg4.setRotationPoint(-1.5F, 1.0F, -2.25F);
        this.Head.addChild(RLeg4);
        this.setRotateAngle(RLeg4, 0.0076F, -0.043F, -0.1747F);
        this.RLeg4.cubeList.add(new ModelBox(RLeg4, 22, 18, -4.0F, -0.5F, -0.5F, 4, 1, 1, 0.0F, false));
        this.RLeg4.cubeList.add(new ModelBox(RLeg4, 15, 0, -4.0F, 0.0F, -1.0F, 3, 0, 2, 0.0F, false));

        this.LLeg4 = new AdvancedModelRenderer(this);
        this.LLeg4.setRotationPoint(1.5F, 1.0F, -2.25F);
        this.Head.addChild(LLeg4);
        this.setRotateAngle(LLeg4, 0.0076F, 0.043F, 0.1747F);
        this.LLeg4.cubeList.add(new ModelBox(LLeg4, 22, 18, 0.0F, -0.5F, -0.5F, 4, 1, 1, 0.0F, true));
        this.LLeg4.cubeList.add(new ModelBox(LLeg4, 15, 0, 1.0F, 0.0F, -1.0F, 3, 0, 2, 0.0F, true));

        this.RLeg3 = new AdvancedModelRenderer(this);
        this.RLeg3.setRotationPoint(-1.5F, 1.0F, -3.0F);
        this.Head.addChild(RLeg3);
        this.setRotateAngle(RLeg3, 0.0911F, -0.4264F, -0.2398F);
        this.RLeg3.cubeList.add(new ModelBox(RLeg3, 22, 11, -3.5F, -0.5F, -0.5F, 4, 1, 1, 0.0F, false));
        this.RLeg3.cubeList.add(new ModelBox(RLeg3, 15, 0, -3.5F, 0.0F, -1.0F, 3, 0, 2, 0.0F, false));

        this.LLeg3 = new AdvancedModelRenderer(this);
        this.LLeg3.setRotationPoint(1.5F, 1.0F, -3.0F);
        this.Head.addChild(LLeg3);
        this.setRotateAngle(LLeg3, 0.0911F, 0.4264F, 0.2398F);
        this.LLeg3.cubeList.add(new ModelBox(LLeg3, 22, 11, -0.5F, -0.5F, -0.5F, 4, 1, 1, 0.0F, true));
        this.LLeg3.cubeList.add(new ModelBox(LLeg3, 15, 0, 0.5F, 0.0F, -1.0F, 3, 0, 2, 0.0F, true));

        this.RLeg2 = new AdvancedModelRenderer(this);
        this.RLeg2.setRotationPoint(-1.5F, 1.0F, -3.75F);
        this.Head.addChild(RLeg2);
        this.setRotateAngle(RLeg2, 0.2571F, -0.7491F, -0.3855F);
        this.RLeg2.cubeList.add(new ModelBox(RLeg2, 14, 24, -2.5F, -0.5F, -0.5F, 3, 1, 1, 0.0F, false));
        this.RLeg2.cubeList.add(new ModelBox(RLeg2, 15, 0, -2.5F, 0.0F, -1.0F, 3, 0, 2, 0.0F, false));

        this.LLeg2 = new AdvancedModelRenderer(this);
        this.LLeg2.setRotationPoint(1.5F, 1.0F, -3.75F);
        this.Head.addChild(LLeg2);
        this.setRotateAngle(LLeg2, 0.2571F, 0.7491F, 0.3855F);
        this.LLeg2.cubeList.add(new ModelBox(LLeg2, 14, 24, -0.5F, -0.5F, -0.5F, 3, 1, 1, 0.0F, true));
        this.LLeg2.cubeList.add(new ModelBox(LLeg2, 15, 0, -0.5F, 0.0F, -1.0F, 3, 0, 2, 0.0F, true));

        this.RLeg1 = new AdvancedModelRenderer(this);
        this.RLeg1.setRotationPoint(-1.0F, 1.0F, -4.5F);
        this.Head.addChild(RLeg1);
        this.setRotateAngle(RLeg1, 0.9888F, -1.1173F, -1.168F);
        this.RLeg1.cubeList.add(new ModelBox(RLeg1, 0, 15, -1.5F, -0.5F, -0.5F, 2, 1, 1, 0.0F, false));
        this.RLeg1.cubeList.add(new ModelBox(RLeg1, 0, 13, -1.5F, 0.0F, -1.0F, 2, 0, 2, 0.0F, false));

        this.LLeg1 = new AdvancedModelRenderer(this);
        this.LLeg1.setRotationPoint(1.0F, 1.0F, -4.5F);
        this.Head.addChild(LLeg1);
        this.setRotateAngle(LLeg1, 0.9888F, 1.1173F, 1.168F);
        this.LLeg1.cubeList.add(new ModelBox(LLeg1, 0, 15, -0.5F, -0.5F, -0.5F, 2, 1, 1, 0.0F, true));
        this.LLeg1.cubeList.add(new ModelBox(LLeg1, 0, 13, -0.5F, 0.0F, -1.0F, 2, 0, 2, 0.0F, true));

        this.Body = new AdvancedModelRenderer(this);
        this.Body.setRotationPoint(0.0F, 0.0F, -2.0F);
        this.Root.addChild(Body);
        this.Body.cubeList.add(new ModelBox(Body, 0, 7, -3.5F, -1.0F, 0.0F, 7, 2, 4, 0.02F, false));

        this.Tail = new AdvancedModelRenderer(this);
        this.Tail.setRotationPoint(0.0F, 0.0F, 4.0F);
        this.Body.addChild(Tail);
        this.Tail.cubeList.add(new ModelBox(Tail, 10, 13, -3.0F, -1.0F, 0.0F, 6, 2, 3, 0.01F, false));

        this.Tail2 = new AdvancedModelRenderer(this);
        this.Tail2.setRotationPoint(0.0F, 0.0F, 3.0F);
        this.Tail.addChild(Tail2);
        this.Tail2.cubeList.add(new ModelBox(Tail2, 0, 21, -2.0F, -1.0F, 0.0F, 4, 2, 3, 0.0F, false));

        this.Tail3 = new AdvancedModelRenderer(this);
        this.Tail3.setRotationPoint(0.0F, 0.0F, 3.0F);
        this.Tail2.addChild(Tail3);
        this.Tail3.cubeList.add(new ModelBox(Tail3, 12, 18, -1.5F, -1.0F, 0.0F, 3, 2, 4, -0.01F, false));

        this.Tail4 = new AdvancedModelRenderer(this);
        this.Tail4.setRotationPoint(0.0F, 0.0F, 3.97F);
        this.Tail3.addChild(Tail4);
        this.Tail4.cubeList.add(new ModelBox(Tail4, 22, 20, -1.0F, -1.0F, 0.0F, 2, 2, 4, -0.02F, false));

        this.Tail5 = new AdvancedModelRenderer(this);
        this.Tail5.setRotationPoint(0.0F, 0.0F, 3.95F);
        this.Tail4.addChild(Tail5);
        this.Tail5.cubeList.add(new ModelBox(Tail5, 0, 13, -1.0F, -1.0F, 0.0F, 2, 2, 6, -0.03F, false));

        this.Tail6 = new AdvancedModelRenderer(this);
        this.Tail6.setRotationPoint(0.0F, 0.0F, 5.97F);
        this.Tail5.addChild(Tail6);
        this.Tail6.cubeList.add(new ModelBox(Tail6, 18, 1, -0.5F, -0.5F, 0.0F, 1, 1, 6, 0.0F, false));

        updateDefaultPose();
        animator = ModelAnimator.create();
    }

    @Override
    public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        animate((IAnimatedEntity) entity, f, f1, f2, f3, f4, f5);
        this.Root.render(f5);
    }
    public void renderStaticWall(float f) {
        this.Root.rotateAngleX = (float) Math.toRadians(90);
        this.setRotateAngle(Head, 0.0F, 0.0F, 0.0F);
        this.setRotateAngle(Body, 0.0F, 0.0F, 0.0F);
        this.setRotateAngle(Tail, 0.0F, 0.0F, 0.0F);
        this.setRotateAngle(Tail2, 0.0F, 0.0F, 0.0F);
        this.setRotateAngle(Tail3, 0.0F, 0.0F, 0.0F);
        this.setRotateAngle(Tail4, 0.0F, 0.0F, 0.0F);
        this.setRotateAngle(Tail5, 0.0F, 0.0F, 0.0F);
        this.Root.offsetY = -0.16F;
        this.Root.offsetX = 0.0F;
        this.Root.offsetZ = -0.29F;
        this.Root.render(0.01F);
        resetToDefaultPose();
    }

    public void renderStaticFloor(float f) {
        this.setRotateAngle(Head, 0.0F, 0.05F, 0.0F);
        this.setRotateAngle(Body, 0.0F, 0.05F, 0.0F);
        this.setRotateAngle(Tail, 0.0F, 0.05F, 0.0F);
        this.setRotateAngle(Tail2, 0.0F, 0.05F, 0.0F);
        this.setRotateAngle(Tail3, 0.0F, -0.05F, 0.0F);
        this.setRotateAngle(Tail4, 0.0F, -0.05F, 0.0F);
        this.setRotateAngle(Tail5, 0.0F, -0.08F, 0.0F);
        this.setRotateAngle(Tail6, 0.0F, -0.08F, 0.0F);
        this.Root.offsetY = 0.06F;
        this.Root.render(0.01F);
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


        AdvancedModelRenderer[] fishBody = {this.Tail, this.Tail2, this.Tail3, this.Tail4, this.Tail5, this.Tail6};



        //mouthparts:

        float speed = 0.2F;

        EntityPrehistoricFloraHoplitaspis slimon = (EntityPrehistoricFloraHoplitaspis) e;


        if (e instanceof EntityLiving && !((EntityLiving) e).isAIDisabled()) {
            if(!slimon.getIsMoving()) {//not moving
                this.chainWave(fishBody, speed, 0.02F, -0.2F, f2, 0.2F);
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
        EntityPrehistoricFloraHoplitaspis ee = (EntityPrehistoricFloraHoplitaspis) entitylivingbaseIn;
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

    }

    public void animWalking(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime) {
        EntityPrehistoricFloraHoplitaspis entity = (EntityPrehistoricFloraHoplitaspis) entitylivingbaseIn;
        int animCycle = 40;
        double tickAnim = (entity.ticksExisted + entity.getTickOffset()) - (int) (Math.floor((double) (entity.ticksExisted + entity.getTickOffset()) / (double) animCycle) * (double) animCycle) + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;
        this.setRotateAngle(Root, Root.rotateAngleX + (float) Math.toRadians(4+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*90/0.5))), Root.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*90/0.5+90))), Root.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*90/0.5+60))*0.5));
        this.Root.rotationPointX = this.Root.rotationPointX + (float)(0);
        this.Root.rotationPointY = this.Root.rotationPointY - (float)(0.9+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*90/0.5+30))*0.25);
        this.Root.rotationPointZ = this.Root.rotationPointZ + (float)(0);
        this.setRotateAngle(RPaddle, RPaddle.rotateAngleX + (float) Math.toRadians(10+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*90/0.25+90))), RPaddle.rotateAngleY + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*90/0.25+60))), RPaddle.rotateAngleZ + (float) Math.toRadians(5+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*90/0.25))));
        this.setRotateAngle(LPaddle, LPaddle.rotateAngleX + (float) Math.toRadians(10+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*90/0.25+120))), LPaddle.rotateAngleY + (float) Math.toRadians(-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*90/0.25+90))), LPaddle.rotateAngleZ + (float) Math.toRadians(-5-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*90/0.25+30))));



        if (tickAnim >= 0 && tickAnim < 6) {
            xx = 2.8166 + (((tickAnim - 0) / 6) * (-7.5818-(2.8166)));
            yy = 16.03264 + (((tickAnim - 0) / 6) * (11.10623-(16.03264)));
            zz = 9.08474 + (((tickAnim - 0) / 6) * (-6.91873-(9.08474)));
        }
        else if (tickAnim >= 6 && tickAnim < 16) {
            xx = -7.5818 + (((tickAnim - 6) / 10) * (-12.5405-(-7.5818)));
            yy = 11.10623 + (((tickAnim - 6) / 10) * (34.61387-(11.10623)));
            zz = -6.91873 + (((tickAnim - 6) / 10) * (-7.29013-(-6.91873)));
        }
        else if (tickAnim >= 16 && tickAnim < 20) {
            xx = -12.5405 + (((tickAnim - 16) / 4) * (3.95473-(-12.5405)));
            yy = 34.61387 + (((tickAnim - 16) / 4) * (16.3476-(34.61387)));
            zz = -7.29013 + (((tickAnim - 16) / 4) * (14.22473-(-7.29013)));
        }
        else if (tickAnim >= 20 && tickAnim < 26) {
            xx = 3.95473 + (((tickAnim - 20) / 6) * (-4.79473-(3.95473)));
            yy = 16.3476 + (((tickAnim - 20) / 6) * (11.63898-(16.3476)));
            zz = 14.22473 + (((tickAnim - 20) / 6) * (0.08588-(14.22473)));
        }
        else if (tickAnim >= 26 && tickAnim < 36) {
            xx = -4.79473 + (((tickAnim - 26) / 10) * (-13.18763-(-4.79473)));
            yy = 11.63898 + (((tickAnim - 26) / 10) * (34.57707-(11.63898)));
            zz = 0.08588 + (((tickAnim - 26) / 10) * (-7.35431-(0.08588)));
        }
        else if (tickAnim >= 36 && tickAnim < 40) {
            xx = -13.18763 + (((tickAnim - 36) / 4) * (2.8166-(-13.18763)));
            yy = 34.57707 + (((tickAnim - 36) / 4) * (16.03264-(34.57707)));
            zz = -7.35431 + (((tickAnim - 36) / 4) * (9.08474-(-7.35431)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(RLeg4, RLeg4.rotateAngleX + (float) Math.toRadians(xx), RLeg4.rotateAngleY + (float) Math.toRadians(yy), RLeg4.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 6) {
            xx = -10.42714 + (((tickAnim - 0) / 6) * (-14.83542-(-10.42714)));
            yy = -22.83458 + (((tickAnim - 0) / 6) * (-33.78387-(-22.83458)));
            zz = 6.06527 + (((tickAnim - 0) / 6) * (10.56613-(6.06527)));
        }
        else if (tickAnim >= 6 && tickAnim < 10) {
            xx = -14.83542 + (((tickAnim - 6) / 4) * (2.82033-(-14.83542)));
            yy = -33.78387 + (((tickAnim - 6) / 4) * (-16.03218-(-33.78387)));
            zz = 10.56613 + (((tickAnim - 6) / 4) * (-9.08861-(10.56613)));
        }
        else if (tickAnim >= 10 && tickAnim < 16) {
            xx = 2.82033 + (((tickAnim - 10) / 6) * (-7.26082-(2.82033)));
            yy = -16.03218 + (((tickAnim - 10) / 6) * (-11.38254-(-16.03218)));
            zz = -9.08861 + (((tickAnim - 10) / 6) * (3.41135-(-9.08861)));
        }
        else if (tickAnim >= 16 && tickAnim < 26) {
            xx = -7.26082 + (((tickAnim - 16) / 10) * (-11.11569-(-7.26082)));
            yy = -11.38254 + (((tickAnim - 16) / 10) * (-35.27354-(-11.38254)));
            zz = 3.41135 + (((tickAnim - 16) / 10) * (4.25965-(3.41135)));
        }
        else if (tickAnim >= 26 && tickAnim < 30) {
            xx = -11.11569 + (((tickAnim - 26) / 4) * (3.95105-(-11.11569)));
            yy = -35.27354 + (((tickAnim - 26) / 4) * (-16.34836-(-35.27354)));
            zz = 4.25965 + (((tickAnim - 26) / 4) * (-14.22087-(4.25965)));
        }
        else if (tickAnim >= 30 && tickAnim < 36) {
            xx = 3.95105 + (((tickAnim - 30) / 6) * (-5.00517-(3.95105)));
            yy = -16.34836 + (((tickAnim - 30) / 6) * (-11.41876-(-16.34836)));
            zz = -14.22087 + (((tickAnim - 30) / 6) * (2.9144-(-14.22087)));
        }
        else if (tickAnim >= 36 && tickAnim < 40) {
            xx = -5.00517 + (((tickAnim - 36) / 4) * (-10.42714-(-5.00517)));
            yy = -11.41876 + (((tickAnim - 36) / 4) * (-22.83458-(-11.41876)));
            zz = 2.9144 + (((tickAnim - 36) / 4) * (6.06527-(2.9144)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(LLeg4, LLeg4.rotateAngleX + (float) Math.toRadians(xx), LLeg4.rotateAngleY + (float) Math.toRadians(yy), LLeg4.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 3) {
            xx = -10.71886 + (((tickAnim - 0) / 3) * (-12.26911-(-10.71886)));
            yy = 29.38323 + (((tickAnim - 0) / 3) * (33.24589-(29.38323)));
            zz = -2.91156 + (((tickAnim - 0) / 3) * (-4.12627-(-2.91156)));
        }
        else if (tickAnim >= 3 && tickAnim < 7) {
            xx = -12.26911 + (((tickAnim - 3) / 4) * (-0.09905-(-12.26911)));
            yy = 33.24589 + (((tickAnim - 3) / 4) * (12.65622-(33.24589)));
            zz = -4.12627 + (((tickAnim - 3) / 4) * (20.44008-(-4.12627)));
        }
        else if (tickAnim >= 7 && tickAnim < 13) {
            xx = -0.09905 + (((tickAnim - 7) / 6) * (-6.33291-(-0.09905)));
            yy = 12.65622 + (((tickAnim - 7) / 6) * (9.86251-(12.65622)));
            zz = 20.44008 + (((tickAnim - 7) / 6) * (-0.60009-(20.44008)));
        }
        else if (tickAnim >= 13 && tickAnim < 23) {
            xx = -6.33291 + (((tickAnim - 13) / 10) * (-10.21295-(-6.33291)));
            yy = 9.86251 + (((tickAnim - 13) / 10) * (33.68113-(9.86251)));
            zz = -0.60009 + (((tickAnim - 13) / 10) * (2.93684-(-0.60009)));
        }
        else if (tickAnim >= 23 && tickAnim < 27) {
            xx = -10.21295 + (((tickAnim - 23) / 4) * (-0.62308-(-10.21295)));
            yy = 33.68113 + (((tickAnim - 23) / 4) * (12.44444-(33.68113)));
            zz = 2.93684 + (((tickAnim - 23) / 4) * (22.98561-(2.93684)));
        }
        else if (tickAnim >= 27 && tickAnim < 33) {
            xx = -0.62308 + (((tickAnim - 27) / 6) * (-5.30572-(-0.62308)));
            yy = 12.44444 + (((tickAnim - 27) / 6) * (9.84946-(12.44444)));
            zz = 22.98561 + (((tickAnim - 27) / 6) * (2.24101-(22.98561)));
        }
        else if (tickAnim >= 33 && tickAnim < 40) {
            xx = -5.30572 + (((tickAnim - 33) / 7) * (-10.71886-(-5.30572)));
            yy = 9.84946 + (((tickAnim - 33) / 7) * (29.38323-(9.84946)));
            zz = 2.24101 + (((tickAnim - 33) / 7) * (-2.91156-(2.24101)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(RLeg3, RLeg3.rotateAngleX + (float) Math.toRadians(xx), RLeg3.rotateAngleY + (float) Math.toRadians(yy), RLeg3.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 1.91669 + (((tickAnim - 0) / 3) * (-5.71327-(1.91669)));
            yy = -10.73288 + (((tickAnim - 0) / 3) * (-10.35886-(-10.73288)));
            zz = -7.62258 + (((tickAnim - 0) / 3) * (1.08381-(-7.62258)));
        }
        else if (tickAnim >= 3 && tickAnim < 13) {
            xx = -5.71327 + (((tickAnim - 3) / 10) * (-12.92935-(-5.71327)));
            yy = -10.35886 + (((tickAnim - 3) / 10) * (-33.31302-(-10.35886)));
            zz = 1.08381 + (((tickAnim - 3) / 10) * (1.85374-(1.08381)));
        }
        else if (tickAnim >= 13 && tickAnim < 17) {
            xx = -12.92935 + (((tickAnim - 13) / 4) * (-0.62308-(-12.92935)));
            yy = -33.31302 + (((tickAnim - 13) / 4) * (-12.4444-(-33.31302)));
            zz = 1.85374 + (((tickAnim - 13) / 4) * (-22.9856-(1.85374)));
        }
        else if (tickAnim >= 17 && tickAnim < 23) {
            xx = -0.62308 + (((tickAnim - 17) / 6) * (-6.18821-(-0.62308)));
            yy = -12.4444 + (((tickAnim - 17) / 6) * (-9.8356-(-12.4444)));
            zz = -22.9856 + (((tickAnim - 17) / 6) * (-2.75785-(-22.9856)));
        }
        else if (tickAnim >= 23 && tickAnim < 33) {
            xx = -6.18821 + (((tickAnim - 23) / 10) * (-10.26563-(-6.18821)));
            yy = -9.8356 + (((tickAnim - 23) / 10) * (-33.51968-(-9.8356)));
            zz = -2.75785 + (((tickAnim - 23) / 10) * (-0.92058-(-2.75785)));
        }
        else if (tickAnim >= 33 && tickAnim < 37) {
            xx = -10.26563 + (((tickAnim - 33) / 4) * (-0.62308-(-10.26563)));
            yy = -33.51968 + (((tickAnim - 33) / 4) * (-12.4444-(-33.51968)));
            zz = -0.92058 + (((tickAnim - 33) / 4) * (-22.9856-(-0.92058)));
        }
        else if (tickAnim >= 37 && tickAnim < 40) {
            xx = -0.62308 + (((tickAnim - 37) / 3) * (1.91669-(-0.62308)));
            yy = -12.4444 + (((tickAnim - 37) / 3) * (-10.73288-(-12.4444)));
            zz = -22.9856 + (((tickAnim - 37) / 3) * (-7.62258-(-22.9856)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(LLeg3, LLeg3.rotateAngleX + (float) Math.toRadians(xx), LLeg3.rotateAngleY + (float) Math.toRadians(yy), LLeg3.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 3) {
            xx = -10.85075 + (((tickAnim - 0) / 3) * (0.88995-(-10.85075)));
            yy = -1.64613 + (((tickAnim - 0) / 3) * (0.90325-(-1.64613)));
            zz = 20.75775 + (((tickAnim - 0) / 3) * (-5.45007-(20.75775)));
        }
        else if (tickAnim >= 3 && tickAnim < 9) {
            xx = 0.88995 + (((tickAnim - 3) / 6) * (-7.14044-(0.88995)));
            yy = 0.90325 + (((tickAnim - 3) / 6) * (12.39226-(0.90325)));
            zz = -5.45007 + (((tickAnim - 3) / 6) * (-1.12837-(-5.45007)));
        }
        else if (tickAnim >= 9 && tickAnim < 13) {
            xx = -7.14044 + (((tickAnim - 9) / 4) * (-13.65469-(-7.14044)));
            yy = 12.39226 + (((tickAnim - 9) / 4) * (21.64648-(12.39226)));
            zz = -1.12837 + (((tickAnim - 9) / 4) * (3.89767-(-1.12837)));
        }
        else if (tickAnim >= 13 && tickAnim < 19) {
            xx = -13.65469 + (((tickAnim - 13) / 6) * (-15.64563-(-13.65469)));
            yy = 21.64648 + (((tickAnim - 13) / 6) * (-0.78896-(21.64648)));
            zz = 3.89767 + (((tickAnim - 13) / 6) * (34.52471-(3.89767)));
        }
        else if (tickAnim >= 19 && tickAnim < 23) {
            xx = -15.64563 + (((tickAnim - 19) / 4) * (-6.43104-(-15.64563)));
            yy = -0.78896 + (((tickAnim - 19) / 4) * (-1.51522-(-0.78896)));
            zz = 34.52471 + (((tickAnim - 19) / 4) * (7.19378-(34.52471)));
        }
        else if (tickAnim >= 23 && tickAnim < 29) {
            xx = -6.43104 + (((tickAnim - 23) / 6) * (-8.95967-(-6.43104)));
            yy = -1.51522 + (((tickAnim - 23) / 6) * (10.98404-(-1.51522)));
            zz = 7.19378 + (((tickAnim - 23) / 6) * (7.68171-(7.19378)));
        }
        else if (tickAnim >= 29 && tickAnim < 33) {
            xx = -8.95967 + (((tickAnim - 29) / 4) * (-10.50004-(-8.95967)));
            yy = 10.98404 + (((tickAnim - 29) / 4) * (21.16399-(10.98404)));
            zz = 7.68171 + (((tickAnim - 29) / 4) * (4.58285-(7.68171)));
        }
        else if (tickAnim >= 33 && tickAnim < 39) {
            xx = -10.50004 + (((tickAnim - 33) / 6) * (-10.87413-(-10.50004)));
            yy = 21.16399 + (((tickAnim - 33) / 6) * (-0.66038-(21.16399)));
            zz = 4.58285 + (((tickAnim - 33) / 6) * (27.61556-(4.58285)));
        }
        else if (tickAnim >= 39 && tickAnim < 40) {
            xx = -10.87413 + (((tickAnim - 39) / 1) * (-10.85075-(-10.87413)));
            yy = -0.66038 + (((tickAnim - 39) / 1) * (-1.64613-(-0.66038)));
            zz = 27.61556 + (((tickAnim - 39) / 1) * (20.75775-(27.61556)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(RLeg2, RLeg2.rotateAngleX + (float) Math.toRadians(xx), RLeg2.rotateAngleY + (float) Math.toRadians(yy), RLeg2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 3) {
            xx = -5.05237 + (((tickAnim - 0) / 3) * (-8.32489-(-5.05237)));
            yy = -9.1065 + (((tickAnim - 0) / 3) * (-16.6163-(-9.1065)));
            zz = 0.43782 + (((tickAnim - 0) / 3) * (0.25329-(0.43782)));
        }
        else if (tickAnim >= 3 && tickAnim < 9) {
            xx = -8.32489 + (((tickAnim - 3) / 6) * (-15.29704-(-8.32489)));
            yy = -16.6163 + (((tickAnim - 3) / 6) * (4.51313-(-16.6163)));
            zz = 0.25329 + (((tickAnim - 3) / 6) * (-28.52468-(0.25329)));
        }
        else if (tickAnim >= 9 && tickAnim < 13) {
            xx = -15.29704 + (((tickAnim - 9) / 4) * (-0.07232-(-15.29704)));
            yy = 4.51313 + (((tickAnim - 9) / 4) * (5.97915-(4.51313)));
            zz = -28.52468 + (((tickAnim - 9) / 4) * (1.82114-(-28.52468)));
        }
        else if (tickAnim >= 13 && tickAnim < 23) {
            xx = -0.07232 + (((tickAnim - 13) / 10) * (-12.53318-(-0.07232)));
            yy = 5.97915 + (((tickAnim - 13) / 10) * (-16.31247-(5.97915)));
            zz = 1.82114 + (((tickAnim - 13) / 10) * (-7.86057-(1.82114)));
        }
        else if (tickAnim >= 23 && tickAnim < 29) {
            xx = -12.53318 + (((tickAnim - 23) / 6) * (-20.71-(-12.53318)));
            yy = -16.31247 + (((tickAnim - 23) / 6) * (4.22722-(-16.31247)));
            zz = -7.86057 + (((tickAnim - 23) / 6) * (-35.88674-(-7.86057)));
        }
        else if (tickAnim >= 29 && tickAnim < 33) {
            xx = -20.71 + (((tickAnim - 29) / 4) * (0.32258-(-20.71)));
            yy = 4.22722 + (((tickAnim - 29) / 4) * (6.04444-(4.22722)));
            zz = -35.88674 + (((tickAnim - 29) / 4) * (1.03713-(-35.88674)));
        }
        else if (tickAnim >= 33 && tickAnim < 40) {
            xx = 0.32258 + (((tickAnim - 33) / 7) * (-5.05237-(0.32258)));
            yy = 6.04444 + (((tickAnim - 33) / 7) * (-9.1065-(6.04444)));
            zz = 1.03713 + (((tickAnim - 33) / 7) * (0.43782-(1.03713)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(LLeg2, LLeg2.rotateAngleX + (float) Math.toRadians(xx), LLeg2.rotateAngleY + (float) Math.toRadians(yy), LLeg2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 6) {
            xx = -22.36435 + (((tickAnim - 0) / 6) * (-31.37139-(-22.36435)));
            yy = 23.97183 + (((tickAnim - 0) / 6) * (0.8134-(23.97183)));
            zz = 15.91829 + (((tickAnim - 0) / 6) * (35.64857-(15.91829)));
        }
        else if (tickAnim >= 6 && tickAnim < 10) {
            xx = -31.37139 + (((tickAnim - 6) / 4) * (9.29266-(-31.37139)));
            yy = 0.8134 + (((tickAnim - 6) / 4) * (8.43595-(0.8134)));
            zz = 35.64857 + (((tickAnim - 6) / 4) * (-5.45115-(35.64857)));
        }
        else if (tickAnim >= 10 && tickAnim < 20) {
            xx = 9.29266 + (((tickAnim - 10) / 10) * (-36.09291-(9.29266)));
            yy = 8.43595 + (((tickAnim - 10) / 10) * (16.51114-(8.43595)));
            zz = -5.45115 + (((tickAnim - 10) / 10) * (35.61939-(-5.45115)));
        }
        else if (tickAnim >= 20 && tickAnim < 26) {
            xx = -36.09291 + (((tickAnim - 20) / 6) * (-55.89127-(-36.09291)));
            yy = 16.51114 + (((tickAnim - 20) / 6) * (-2.0213-(16.51114)));
            zz = 35.61939 + (((tickAnim - 20) / 6) * (63.96064-(35.61939)));
        }
        else if (tickAnim >= 26 && tickAnim < 30) {
            xx = -55.89127 + (((tickAnim - 26) / 4) * (0.93723-(-55.89127)));
            yy = -2.0213 + (((tickAnim - 26) / 4) * (-1.24872-(-2.0213)));
            zz = 63.96064 + (((tickAnim - 26) / 4) * (5.26032-(63.96064)));
        }
        else if (tickAnim >= 30 && tickAnim < 40) {
            xx = 0.93723 + (((tickAnim - 30) / 10) * (-22.36435-(0.93723)));
            yy = -1.24872 + (((tickAnim - 30) / 10) * (23.97183-(-1.24872)));
            zz = 5.26032 + (((tickAnim - 30) / 10) * (15.91829-(5.26032)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(RLeg1, RLeg1.rotateAngleX + (float) Math.toRadians(xx), RLeg1.rotateAngleY + (float) Math.toRadians(yy), RLeg1.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 12.32774 + (((tickAnim - 0) / 10) * (-25.38798-(12.32774)));
            yy = -10.29642 + (((tickAnim - 0) / 10) * (-21.41548-(-10.29642)));
            zz = 6.72003 + (((tickAnim - 0) / 10) * (-21.25132-(6.72003)));
        }
        else if (tickAnim >= 10 && tickAnim < 16) {
            xx = -25.38798 + (((tickAnim - 10) / 6) * (-55.89127-(-25.38798)));
            yy = -21.41548 + (((tickAnim - 10) / 6) * (2.0213-(-21.41548)));
            zz = -21.25132 + (((tickAnim - 10) / 6) * (-63.96064-(-21.25132)));
        }
        else if (tickAnim >= 16 && tickAnim < 20) {
            xx = -55.89127 + (((tickAnim - 16) / 4) * (0.93723-(-55.89127)));
            yy = 2.0213 + (((tickAnim - 16) / 4) * (1.24872-(2.0213)));
            zz = -63.96064 + (((tickAnim - 16) / 4) * (-5.26032-(-63.96064)));
        }
        else if (tickAnim >= 20 && tickAnim < 30) {
            xx = 0.93723 + (((tickAnim - 20) / 10) * (-32.34347-(0.93723)));
            yy = 1.24872 + (((tickAnim - 20) / 10) * (-17.3428-(1.24872)));
            zz = -5.26032 + (((tickAnim - 20) / 10) * (-32.54851-(-5.26032)));
        }
        else if (tickAnim >= 30 && tickAnim < 36) {
            xx = -32.34347 + (((tickAnim - 30) / 6) * (-31.37139-(-32.34347)));
            yy = -17.3428 + (((tickAnim - 30) / 6) * (-0.8134-(-17.3428)));
            zz = -32.54851 + (((tickAnim - 30) / 6) * (-35.64857-(-32.54851)));
        }
        else if (tickAnim >= 36 && tickAnim < 40) {
            xx = -31.37139 + (((tickAnim - 36) / 4) * (12.32774-(-31.37139)));
            yy = -0.8134 + (((tickAnim - 36) / 4) * (-10.29642-(-0.8134)));
            zz = -35.64857 + (((tickAnim - 36) / 4) * (6.72003-(-35.64857)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(LLeg1, LLeg1.rotateAngleX + (float) Math.toRadians(xx), LLeg1.rotateAngleY + (float) Math.toRadians(yy), LLeg1.rotateAngleZ + (float) Math.toRadians(zz));
        this.setRotateAngle(Body, Body.rotateAngleX + (float) Math.toRadians(-3+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*90/0.5-30))*0.4), Body.rotateAngleY + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*90/0.5+60))*0.4), Body.rotateAngleZ + (float) Math.toRadians(0));
        this.setRotateAngle(Tail, Tail.rotateAngleX + (float) Math.toRadians(-2+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*90/0.5-60))*0.5), Tail.rotateAngleY + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*90/0.5+30))*0.5), Tail.rotateAngleZ + (float) Math.toRadians(0));
        this.setRotateAngle(Tail2, Tail2.rotateAngleX + (float) Math.toRadians(-1+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*90/0.5-90))*0.6), Tail2.rotateAngleY + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*90/0.5))*0.6), Tail2.rotateAngleZ + (float) Math.toRadians(0));
        this.setRotateAngle(Tail3, Tail3.rotateAngleX + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*90/0.5-120))*0.7), Tail3.rotateAngleY + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*90/0.5-30))*0.7), Tail3.rotateAngleZ + (float) Math.toRadians(0));
        this.setRotateAngle(Tail4, Tail4.rotateAngleX + (float) Math.toRadians(1+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*90/0.5-150))*0.8), Tail4.rotateAngleY + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*90/0.5-60))*0.8), Tail4.rotateAngleZ + (float) Math.toRadians(0));
        this.setRotateAngle(Tail5, Tail5.rotateAngleX + (float) Math.toRadians(2+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*90/0.5-180))*0.9), Tail5.rotateAngleY + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*90/0.5-90))*0.9), Tail5.rotateAngleZ + (float) Math.toRadians(0));
        this.setRotateAngle(Tail6, Tail6.rotateAngleX + (float) Math.toRadians(3+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*90/0.5-210))), Tail6.rotateAngleY + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*90/0.5-120))), Tail6.rotateAngleZ + (float) Math.toRadians(0));
        this.setRotateAngle(RPaddle2, RPaddle2.rotateAngleX + (float) Math.toRadians(0), RPaddle2.rotateAngleY + (float) Math.toRadians(-37.5), RPaddle2.rotateAngleZ + (float) Math.toRadians(0));
        this.setRotateAngle(LPaddle2, LPaddle2.rotateAngleX + (float) Math.toRadians(0), LPaddle2.rotateAngleY + (float) Math.toRadians(37.5), LPaddle2.rotateAngleZ + (float) Math.toRadians(0));

    }
    public void animSwim(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime) {
        EntityPrehistoricFloraHoplitaspis entity = (EntityPrehistoricFloraHoplitaspis) entitylivingbaseIn;

        int animCycle = 20;
        double tickAnim = (entity.ticksExisted + entity.getTickOffset()) - (int) (Math.floor((double) (entity.ticksExisted + entity.getTickOffset()) / (double) animCycle) * (double) animCycle) + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;
        this.setRotateAngle(Root, Root.rotateAngleX + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*90/0.25+50))*10), Root.rotateAngleY + (float) Math.toRadians(0), Root.rotateAngleZ + (float) Math.toRadians(0));
        this.Root.rotationPointX = this.Root.rotationPointX + (float)(0);
        this.Root.rotationPointY = this.Root.rotationPointY - (float)(0.5+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*90/0.25+100))/2);
        this.Root.rotationPointZ = this.Root.rotationPointZ + (float)(0);
        this.setRotateAngle(RPaddle, RPaddle.rotateAngleX + (float) Math.toRadians(-20+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*90/0.25+230))*25), RPaddle.rotateAngleY + (float) Math.toRadians(-20+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*90/0.25+180))*25), RPaddle.rotateAngleZ + (float) Math.toRadians(10+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*90/0.25))*35));
        this.setRotateAngle(RPaddle2, RPaddle2.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*90/0.25+240))*25), RPaddle2.rotateAngleY + (float) Math.toRadians(-25+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*90/0.25+120))*50), RPaddle2.rotateAngleZ + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*90/0.25+280))*25));
        this.setRotateAngle(LPaddle, LPaddle.rotateAngleX + (float) Math.toRadians(-20+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*90/0.25+230))*25), LPaddle.rotateAngleY + (float) Math.toRadians(20-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*90/0.25+180))*25), LPaddle.rotateAngleZ + (float) Math.toRadians(-10-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*90/0.25))*35));
        this.setRotateAngle(LPaddle2, LPaddle2.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*90/0.25+240))*25), LPaddle2.rotateAngleY + (float) Math.toRadians(25-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*90/0.25+120))*50), LPaddle2.rotateAngleZ + (float) Math.toRadians(-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*90/0.25+280))*25));
        this.setRotateAngle(RLeg4, RLeg4.rotateAngleX + (float) Math.toRadians(-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*90/0.25+150))*2), RLeg4.rotateAngleY + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*90/0.25+120))*2), RLeg4.rotateAngleZ + (float) Math.toRadians(-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*90/0.25+90))*2));
        this.setRotateAngle(Body, Body.rotateAngleX + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*90/0.25-30))*3), Body.rotateAngleY + (float) Math.toRadians(0), Body.rotateAngleZ + (float) Math.toRadians(0));
        this.setRotateAngle(Tail, Tail.rotateAngleX + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*90/0.25-60))*4), Tail.rotateAngleY + (float) Math.toRadians(0), Tail.rotateAngleZ + (float) Math.toRadians(0));
        this.setRotateAngle(Tail2, Tail2.rotateAngleX + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*90/0.25-90))*5), Tail2.rotateAngleY + (float) Math.toRadians(0), Tail2.rotateAngleZ + (float) Math.toRadians(0));
        this.setRotateAngle(Tail3, Tail3.rotateAngleX + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*90/0.25-120))*6), Tail3.rotateAngleY + (float) Math.toRadians(0), Tail3.rotateAngleZ + (float) Math.toRadians(0));
        this.setRotateAngle(Tail4, Tail4.rotateAngleX + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*90/0.25-150))*7), Tail4.rotateAngleY + (float) Math.toRadians(0), Tail4.rotateAngleZ + (float) Math.toRadians(0));
        this.setRotateAngle(Tail5, Tail5.rotateAngleX + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*90/0.25-180))*8), Tail5.rotateAngleY + (float) Math.toRadians(0), Tail5.rotateAngleZ + (float) Math.toRadians(0));
        this.setRotateAngle(Tail6, Tail6.rotateAngleX + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*90/0.25-240))*10), Tail6.rotateAngleY + (float) Math.toRadians(0), Tail6.rotateAngleZ + (float) Math.toRadians(0));
        this.setRotateAngle(Head, Head.rotateAngleX + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*90/0.25-130))*9), Head.rotateAngleY + (float) Math.toRadians(0), Head.rotateAngleZ + (float) Math.toRadians(0));
        this.setRotateAngle(LLeg4, LLeg4.rotateAngleX + (float) Math.toRadians(-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*90/0.25+150))*2), LLeg4.rotateAngleY + (float) Math.toRadians(-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*90/0.25+120))*2), LLeg4.rotateAngleZ + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*90/0.25+90))*2));
        this.setRotateAngle(RLeg3, RLeg3.rotateAngleX + (float) Math.toRadians(-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*90/0.25+120))*2), RLeg3.rotateAngleY + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*90/0.25+90))*2), RLeg3.rotateAngleZ + (float) Math.toRadians(-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*90/0.25+60))*2));
        this.setRotateAngle(LLeg3, LLeg3.rotateAngleX + (float) Math.toRadians(-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*90/0.25+120))*2), LLeg3.rotateAngleY + (float) Math.toRadians(-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*90/0.25+90))*2), LLeg3.rotateAngleZ + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*90/0.25+60))*2));
        this.setRotateAngle(RLeg2, RLeg2.rotateAngleX + (float) Math.toRadians(-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*90/0.25+90))*2), RLeg2.rotateAngleY + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*90/0.25+60))*2), RLeg2.rotateAngleZ + (float) Math.toRadians(-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*90/0.25+30))*2));
        this.setRotateAngle(LLeg2, LLeg2.rotateAngleX + (float) Math.toRadians(-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*90/0.25+90))*2), LLeg2.rotateAngleY + (float) Math.toRadians(-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*90/0.25+60))*2), LLeg2.rotateAngleZ + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*90/0.25+30))*2));
        this.setRotateAngle(RLeg1, RLeg1.rotateAngleX + (float) Math.toRadians(-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*90/0.25+60))*2), RLeg1.rotateAngleY + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*90/0.25+30))*2), RLeg1.rotateAngleZ + (float) Math.toRadians(-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*90/0.25))*2));
        this.setRotateAngle(LLeg1, LLeg1.rotateAngleX + (float) Math.toRadians(-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*90/0.25+60))*2), LLeg1.rotateAngleY + (float) Math.toRadians(-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*90/0.25+30))*2), LLeg1.rotateAngleZ + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*90/0.25))*2));

    }

    public void animate(IAnimatedEntity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        EntityPrehistoricFloraHoplitaspis e = (EntityPrehistoricFloraHoplitaspis) entity;

    }
}
