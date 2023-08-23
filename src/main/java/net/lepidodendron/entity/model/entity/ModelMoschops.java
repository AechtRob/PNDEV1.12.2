package net.lepidodendron.entity.model.entity;

import net.ilexiconn.llibrary.client.model.ModelAnimator;
import net.ilexiconn.llibrary.server.animation.IAnimatedEntity;
import net.lepidodendron.entity.EntityPrehistoricFloraMoschops;
import net.lepidodendron.entity.model.llibraryextensions.AdvancedModelBaseExtended;
import net.lepidodendron.entity.model.llibraryextensions.AdvancedModelRendererExtended;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;

public class ModelMoschops extends AdvancedModelBaseExtended {
    private final AdvancedModelRendererExtended root;
    private final AdvancedModelRendererExtended Hips;
    private final AdvancedModelRendererExtended Belly;
    private final AdvancedModelRendererExtended Front;
    private final AdvancedModelRendererExtended Neck;
    private final AdvancedModelRendererExtended Head;
    private final AdvancedModelRendererExtended Lowerjaw;
    private final AdvancedModelRendererExtended Upperjaw;
    private final AdvancedModelRendererExtended Headslope;
    private final AdvancedModelRendererExtended Leftupperarm;
    private final AdvancedModelRendererExtended Leftlowerarm;
    private final AdvancedModelRendererExtended Leftfrontfoot;
    private final AdvancedModelRendererExtended Rightupperarm;
    private final AdvancedModelRendererExtended Rightlowerarm;
    private final AdvancedModelRendererExtended Rightfrontfoot;
    private final AdvancedModelRendererExtended Tail1;
    private final AdvancedModelRendererExtended Tail2;
    private final AdvancedModelRendererExtended Tail3;
    private final AdvancedModelRendererExtended Leftthigh;
    private final AdvancedModelRendererExtended Leftshin;
    private final AdvancedModelRendererExtended Lefthindfoot;
    private final AdvancedModelRendererExtended Rightthigh;
    private final AdvancedModelRendererExtended Rightshin;
    private final AdvancedModelRendererExtended Righthindfoot;

    private ModelAnimator animator;

    public ModelMoschops() {
        this.textureWidth = 100;
        this.textureHeight = 100;

        this.root = new AdvancedModelRendererExtended(this);
        this.root.setRotationPoint(0.0F, -0.75F, 0.0F);


        this.Hips = new AdvancedModelRendererExtended(this);
        this.Hips.setRotationPoint(0.0F, 6.8F, 13.5F);
        this.root.addChild(Hips);
        this.setRotateAngle(Hips, -0.2759F, 0.0F, 0.0F);
        this.Hips.cubeList.add(new ModelBox(Hips, 0, 18, -5.0F, -1.5F, -5.0F, 10, 12, 10, 0.0F, false));

        this.Belly = new AdvancedModelRendererExtended(this);
        this.Belly.setRotationPoint(0.0F, 0.0F, -4.5F);
        this.Hips.addChild(Belly);
        this.setRotateAngle(Belly, 0.0213F, 0.0F, 0.0F);
        this.Belly.cubeList.add(new ModelBox(Belly, 0, 69, -6.5F, -2.0F, -15.5F, 13, 15, 16, 0.0F, false));

        this.Front = new AdvancedModelRendererExtended(this);
        this.Front.setRotationPoint(0.0F, 0.1F, -15.0F);
        this.Belly.addChild(Front);
        this.setRotateAngle(Front, 0.1485F, 0.0F, 0.0F);
        this.Front.cubeList.add(new ModelBox(Front, 0, 41, -5.5F, -2.0F, -10.5F, 11, 16, 11, 0.0F, false));

        this.Neck = new AdvancedModelRendererExtended(this);
        this.Neck.setRotationPoint(0.0F, -0.5F, -8.8F);
        this.Front.addChild(Neck);
        this.setRotateAngle(Neck, -0.1061F, 0.0F, 0.0F);
        this.Neck.cubeList.add(new ModelBox(Neck, 59, 82, -2.5F, -1.0F, -9.0F, 5, 8, 10, 0.0F, false));

        this.Head = new AdvancedModelRendererExtended(this);
        this.Head.setRotationPoint(-0.01F, 1.15F, -7.0F);
        this.Neck.addChild(Head);
        this.setRotateAngle(Head, 0.6369F, 0.0F, 0.0F);
        this.Head.cubeList.add(new ModelBox(Head, 60, 26, -3.0F, -3.0F, -5.0F, 6, 6, 5, 0.0F, false));

        this.Lowerjaw = new AdvancedModelRendererExtended(this);
        this.Lowerjaw.setRotationPoint(0.0F, 0.7F, -2.5F);
        this.Head.addChild(Lowerjaw);
        this.setRotateAngle(Lowerjaw, 0.2546F, 0.0F, 0.0F);
        this.Lowerjaw.cubeList.add(new ModelBox(Lowerjaw, 78, 19, -2.5F, 0.0F, -6.0F, 5, 2, 6, 0.0F, false));

        this.Upperjaw = new AdvancedModelRendererExtended(this);
        this.Upperjaw.setRotationPoint(0.0F, -0.9F, -4.0F);
        this.Head.addChild(Upperjaw);
        this.setRotateAngle(Upperjaw, 0.2546F, 0.0F, 0.0F);
        this.Upperjaw.cubeList.add(new ModelBox(Upperjaw, 20, 0, -2.5F, 0.0F, -5.0F, 5, 2, 5, 0.0F, false));

        this.Headslope = new AdvancedModelRendererExtended(this);
        this.Headslope.setRotationPoint(0.0F, -3.0F, -5.0F);
        this.Head.addChild(Headslope);
        this.setRotateAngle(Headslope, 0.7456F, 0.0F, 0.0F);
        this.Headslope.cubeList.add(new ModelBox(Headslope, 1, 0, -2.0F, 0.0F, -5.0F, 4, 2, 5, 0.0F, false));

        this.Leftupperarm = new AdvancedModelRendererExtended(this);
        this.Leftupperarm.setRotationPoint(6.0F, 9.5F, -5.5F);
        this.Front.addChild(Leftupperarm);
        this.setRotateAngle(Leftupperarm, 0.6156F, 0.0F, -0.6793F);
        this.Leftupperarm.cubeList.add(new ModelBox(Leftupperarm, 43, 69, -3.0F, -1.5F, -3.0F, 5, 9, 6, 0.0F, false));

        this.Leftlowerarm = new AdvancedModelRendererExtended(this);
        this.Leftlowerarm.setRotationPoint(-0.5F, 7.0F, 1.5F);
        this.Leftupperarm.addChild(Leftlowerarm);
        this.setRotateAngle(Leftlowerarm, -0.378F, 0.2594F, 0.6445F);
        this.Leftlowerarm.cubeList.add(new ModelBox(Leftlowerarm, 36, 37, -2.0F, -1.0F, -4.0F, 4, 9, 5, 0.0F, false));

        this.Leftfrontfoot = new AdvancedModelRendererExtended(this);
        this.Leftfrontfoot.setRotationPoint(0.0F, 7.2F, -1.6F);
        this.Leftlowerarm.addChild(Leftfrontfoot);
        this.Leftfrontfoot.cubeList.add(new ModelBox(Leftfrontfoot, 66, 0, -2.5F, 0.0F, -3.5F, 5, 2, 6, 0.0F, false));

        this.Rightupperarm = new AdvancedModelRendererExtended(this);
        this.Rightupperarm.setRotationPoint(-6.0F, 9.5F, -5.5F);
        this.Front.addChild(Rightupperarm);
        this.setRotateAngle(Rightupperarm, 0.6156F, 0.0F, 0.6793F);
        this.Rightupperarm.cubeList.add(new ModelBox(Rightupperarm, 43, 69, -2.0F, -1.5F, -3.0F, 5, 9, 6, 0.0F, true));

        this.Rightlowerarm = new AdvancedModelRendererExtended(this);
        this.Rightlowerarm.setRotationPoint(0.5F, 7.0F, 1.5F);
        this.Rightupperarm.addChild(Rightlowerarm);
        this.setRotateAngle(Rightlowerarm, -0.378F, -0.2594F, -0.6445F);
        this.Rightlowerarm.cubeList.add(new ModelBox(Rightlowerarm, 36, 37, -2.0F, -1.0F, -4.0F, 4, 9, 5, 0.0F, true));

        this.Rightfrontfoot = new AdvancedModelRendererExtended(this);
        this.Rightfrontfoot.setRotationPoint(0.0F, 7.2F, -1.6F);
        this.Rightlowerarm.addChild(Rightfrontfoot);
        this.Rightfrontfoot.cubeList.add(new ModelBox(Rightfrontfoot, 66, 0, -2.5F, 0.0F, -3.5F, 5, 2, 6, 0.0F, true));

        this.Tail1 = new AdvancedModelRendererExtended(this);
        this.Tail1.setRotationPoint(0.0F, 0.0F, 3.7F);
        this.Hips.addChild(Tail1);
        this.setRotateAngle(Tail1, -0.3821F, 0.0F, 0.0F);
        this.Tail1.cubeList.add(new ModelBox(Tail1, 31, 12, -2.5F, -1.0F, -0.5F, 5, 5, 6, 0.0F, false));

        this.Tail2 = new AdvancedModelRendererExtended(this);
        this.Tail2.setRotationPoint(0.0F, -0.2F, 5.5F);
        this.Tail1.addChild(Tail2);
        this.setRotateAngle(Tail2, -0.4458F, 0.0F, 0.0F);
        this.Tail2.cubeList.add(new ModelBox(Tail2, 55, 16, -1.5F, -0.5F, -0.5F, 3, 3, 6, 0.0F, false));

        this.Tail3 = new AdvancedModelRendererExtended(this);
        this.Tail3.setRotationPoint(0.0F, 0.3F, 5.0F);
        this.Tail2.addChild(Tail3);
        this.setRotateAngle(Tail3, 0.0213F, 0.0F, 0.0F);
        this.Tail3.cubeList.add(new ModelBox(Tail3, 38, 2, -1.0F, -0.5F, -0.5F, 2, 2, 6, 0.0F, false));

        this.Leftthigh = new AdvancedModelRendererExtended(this);
        this.Leftthigh.setRotationPoint(5.0F, 5.75F, 0.25F);
        this.Hips.addChild(Leftthigh);
        this.setRotateAngle(Leftthigh, -0.1698F, 0.0F, -0.3609F);
        this.Leftthigh.cubeList.add(new ModelBox(Leftthigh, 66, 67, -3.0F, -1.5F, -2.5F, 5, 8, 6, 0.0F, false));

        this.Leftshin = new AdvancedModelRendererExtended(this);
        this.Leftshin.setRotationPoint(-0.4F, 5.5F, -0.8F);
        this.Leftthigh.addChild(Leftshin);
        this.setRotateAngle(Leftshin, 0.4671F, 0.0F, 0.3821F);
        this.Leftshin.cubeList.add(new ModelBox(Leftshin, 74, 39, -2.0F, 0.0F, -1.0F, 4, 7, 5, 0.0F, false));

        this.Lefthindfoot = new AdvancedModelRendererExtended(this);
        this.Lefthindfoot.setRotationPoint(0.0F, 6.0F, 2.0F);
        this.Leftshin.addChild(Lefthindfoot);
        this.setRotateAngle(Lefthindfoot, -0.0424F, 0.0F, 0.0F);
        this.Lefthindfoot.cubeList.add(new ModelBox(Lefthindfoot, 48, 6, -2.5F, 0.0F, -5.0F, 5, 2, 7, 0.0F, false));

        this.Rightthigh = new AdvancedModelRendererExtended(this);
        this.Rightthigh.setRotationPoint(-5.0F, 5.75F, 0.25F);
        this.Hips.addChild(Rightthigh);
        this.setRotateAngle(Rightthigh, -0.1698F, 0.0F, 0.3609F);
        this.Rightthigh.cubeList.add(new ModelBox(Rightthigh, 66, 67, -2.0F, -1.5F, -2.5F, 5, 8, 6, 0.0F, true));

        this.Rightshin = new AdvancedModelRendererExtended(this);
        this.Rightshin.setRotationPoint(0.4F, 5.5F, -0.8F);
        this.Rightthigh.addChild(Rightshin);
        this.setRotateAngle(Rightshin, 0.4671F, 0.0F, -0.3821F);
        this.Rightshin.cubeList.add(new ModelBox(Rightshin, 74, 39, -2.0F, 0.0F, -1.0F, 4, 7, 5, 0.0F, true));

        this.Righthindfoot = new AdvancedModelRendererExtended(this);
        this.Righthindfoot.setRotationPoint(0.0F, 6.0F, 2.0F);
        this.Rightshin.addChild(Righthindfoot);
        this.setRotateAngle(Righthindfoot, -0.0424F, 0.0F, 0.0F);
        this.Righthindfoot.cubeList.add(new ModelBox(Righthindfoot, 48, 6, -2.5F, 0.0F, -5.0F, 5, 2, 7, 0.0F, true));

        updateDefaultPose();
        animator = ModelAnimator.create();
    }

    @Override
    public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        animate((IAnimatedEntity) entity, f, f1, f2, f3, f4, f5);
        this.Hips.render(f5);
    }
    public void renderStatic(float f) {
        //GlStateManager.pushMatrix();
        //GlStateManager.enableBlend();
        //GlStateManager.blendFunc(GlStateManager.SourceFactor.SRC_ALPHA, GlStateManager.DestFactor.ONE_MINUS_SRC_ALPHA);
        //GlStateManager.disableCull();
        this.Neck.render(0.01F);
        //GlStateManager.enableCull();
        //GlStateManager.disableBlend();
        //GlStateManager.popMatrix();
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
        //this.Hips.offsetY = 0.3F;

        EntityPrehistoricFloraMoschops Moschops = (EntityPrehistoricFloraMoschops) e;
        float masterSpeed = Moschops.getTravelSpeed();

        //float masterSpeed = 0;

        this.faceTarget(f3, f4, 5, Neck);
        this.faceTarget(f3, f4, 5, Head);

        AdvancedModelRendererExtended[] Tail = {this.Tail1, this.Tail2, this.Tail3};

        if (Moschops.getAnimation() == Moschops.LAY_ANIMATION) {
            this.swing(Neck, 0.5F, 0.10F, false, 0.5F,-0.05F, f2, 0.8F);
            this.walk(Neck, 0.5F * 2, -0.02F, false, 0.5F,0.01F, f2, 0.8F);
            this.walk(Leftupperarm, 0.6F, 0.40F, true, 5, 0.30F, f2, 1F);
            this.walk(Rightupperarm, 0.6F, 0.40F, true, 8, 0.30F, f2, 1F);
            this.walk(Leftlowerarm, 0.6F, 0.25F, true, 6, 0F, f2, 1F);
            this.walk(Rightlowerarm, 0.6F, 0.25F, true, 9, 0F, f2, 1F);
            this.walk(Leftfrontfoot, 0.6F, 0.30F, true, 2, -0.10F, f2, 1F);
            this.walk(Rightfrontfoot, 0.6F, 0.30F, true, 5, -0.10F, f2, 1F);
            return;
         }

        if (f3 == 0.0F || !Moschops.getIsMoving()) { //Not moving
            this.swing(Neck, 0.06F, 0.10F, false, 0.5F,-0.05F, f2, 0.8F);
            this.walk(Neck, 0.06F * 2F, -0.02F, false, 0.5F,0.01F, f2, 0.8F);
            this.chainFlap(Tail, (0.06F*0.9F), 0.10F, 0.10F, f2, 1F);
            this.chainSwing(Tail, (0.06F*0.9F) * 2F, 0.05F, 0.06F, f2, 1F);
            return;
        }


//
//
//        float speed = masterSpeed / 2.225F;
//        if (Moschops.getIsFast()) {
//            speed = speed * 2;
//        }
//
//        this.Leftupperarm.offsetY = this.moveBoxExtended(speed, (float) Math.toRadians(1.8), false, 1, f2, 1.5F);;
//        this.Rightupperarm.offsetY = this.moveBoxExtended(speed, (float) Math.toRadians(1.8), false, 4, f2, 1.5F);;
//        this.Leftthigh.offsetY = this.moveBoxExtended(speed, (float) Math.toRadians(1.0), false, 4, f2, 1.5F);;
//        this.Rightthigh.offsetY = this.moveBoxExtended(speed, (float) Math.toRadians(1.0), false, 1, f2, 1.5F);;
//
//        this.flap(Leftupperarm, speed, -0.2F, true, 4, 0.15F, f2, 1F);
//        this.flap(Rightupperarm, speed, 0.2F, true, 7, -0.15F, f2, 1F);
//        this.flap(Leftthigh, speed, 0.1F, false, 7, -0.05F, f2, 1F);
//        this.flap(Rightthigh, speed, -0.1F, false, 4, 0.05F, f2, 1F);
//
//        this.walk(Leftupperarm, speed, 0.40F, true, 5, 0.30F, f2, 1F);
//        this.walk(Rightupperarm, speed, 0.40F, true, 8, 0.30F, f2, 1F);
//        this.walk(Leftthigh, speed, 0.30F, true, 8, 0F, f2, 1F);
//        this.walk(Rightthigh, speed, 0.30F, true, 5, 0F, f2, 1F);
//
//        this.walk(Leftlowerarm, speed, 0.25F, true, 6, 0F, f2, 1F);
//        this.walk(Rightlowerarm, speed, 0.25F, true, 9, 0F, f2, 1F);
//        this.walk(Leftshin, speed, 0.20F, true, 9, 0F, f2, 1F);
//        this.walk(Rightshin, speed, 0.20F, true, 6, 0F, f2, 1F);
//
//        this.flap(Leftlowerarm, speed, 0.10F, true, 0, 0.05F, f2, 1F);
//        this.flap(Rightlowerarm, speed, -0.10F, true, 3, -0.05F, f2, 1F);
//        this.flap(Leftshin, speed, -0.10F, false, 3, -0.05F, f2, 1F);
//        this.flap(Rightshin, speed, 0.10F, false, 0, 0.05F, f2, 1F);
//
//        this.walk(Leftfrontfoot, speed, 0.30F, true, 2, -0.10F, f2, 1F);
//        this.walk(Rightfrontfoot, speed, 0.30F, true, 5, -0.10F, f2, 1F);
//        this.walk(Lefthindfoot, speed, 0.25F, true, 5, -0.08F, f2, 1F);
//        this.walk(Righthindfoot, speed, 0.25F, true, 2, -0.08F, f2, 1F);
//
//        this.bobExtended(Hips, speed * 2F, 0.2F, false, 2.5F,  f2, 1F);
//
//        this.flap(Hips, speed, 0.12F, false, 5.0F,0.06F, f2, 1.0F);
//        this.flap(Belly, speed, -0.12F, false, 5.0F,-0.06F, f2, 1.0F);
//        this.flap(Front, speed, -0.08F, false, 5.0F,-0.04F, f2, 1.0F);
//
//        this.walk(Front, speed * 2, 0.05F, false, 2.5F,-0.01F, f2, 0.8F);
//
//        this.swing(Neck, speed, 0.10F, false, 0.5F,-0.05F, f2, 0.8F);
//        this.walk(Neck, speed * 2, -0.02F, false, 0.5F,0.01F, f2, 0.8F);
//        this.chainFlap(Tail, (speed*0.6F), 0.20F, 0.2F, f2, 1F);
//        this.chainSwing(Tail, (speed*0.6F) * 2F, 0.10F, 0.12F, f2, 1F);
//
//        this.Hips.offsetZ = this.moveBoxExtended(speed * 2, (float) Math.toRadians(2.2), false, 1.5F, f2, 1);

    }

    @Override
    public void setLivingAnimations(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime) {
        super.setLivingAnimations(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime);
        this.resetToDefaultPose();
        EntityPrehistoricFloraMoschops ee = (EntityPrehistoricFloraMoschops) entitylivingbaseIn;

        if (!ee.isReallyInWater()) {

            if (!ee.getIsMoving()) {
                return;
            }

            if (ee.getIsFast()) { //Running
                animRunning(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime);

            }
            else { //Walking
                animWalking(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime);
            }
        }
        else {
            //Swimming pose:
            if (!ee.getIsMoving()) { //static in water
                return;
            }
            //moving in water
            return;
        }

    }

    public void animWalking(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime) {
        EntityPrehistoricFloraMoschops entity = (EntityPrehistoricFloraMoschops) entitylivingbaseIn;

        int animCycle = 40;
        double tickAnim = (entity.ticksExisted + entity.getTickOffset()) - (int) (Math.floor((double) (entity.ticksExisted + entity.getTickOffset()) / (double) animCycle) * (double) animCycle) + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;
        this.root.rotationPointX = this.root.rotationPointX + (float)(0);
        this.root.rotationPointY = this.root.rotationPointY - (float)(-1);
        this.root.rotationPointZ = this.root.rotationPointZ + (float)(0);


        this.setRotateAngle(Hips, Hips.rotateAngleX + (float) Math.toRadians(0), Hips.rotateAngleY + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180-130))*1), Hips.rotateAngleZ + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180-200))*1));

        if (tickAnim >= 0 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 0) / 5) * (0-(0)));
            yy = -0.25 + (((tickAnim - 0) / 5) * (0-(-0.25)));
            zz = 0 + (((tickAnim - 0) / 5) * (-0.75-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 5) / 5) * (0-(0)));
            yy = 0 + (((tickAnim - 5) / 5) * (0.25-(0)));
            zz = -0.75 + (((tickAnim - 5) / 5) * (-0.75-(-0.75)));
        }
        else if (tickAnim >= 10 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 10) / 10) * (0-(0)));
            yy = 0.25 + (((tickAnim - 10) / 10) * (-0.25-(0.25)));
            zz = -0.75 + (((tickAnim - 10) / 10) * (0-(-0.75)));
        }
        else if (tickAnim >= 20 && tickAnim < 25) {
            xx = 0 + (((tickAnim - 20) / 5) * (0-(0)));
            yy = -0.25 + (((tickAnim - 20) / 5) * (0-(-0.25)));
            zz = 0 + (((tickAnim - 20) / 5) * (-0.75-(0)));
        }
        else if (tickAnim >= 25 && tickAnim < 30) {
            xx = 0 + (((tickAnim - 25) / 5) * (0-(0)));
            yy = 0 + (((tickAnim - 25) / 5) * (0.25-(0)));
            zz = -0.75 + (((tickAnim - 25) / 5) * (-0.75-(-0.75)));
        }
        else if (tickAnim >= 30 && tickAnim < 40) {
            xx = 0 + (((tickAnim - 30) / 10) * (0-(0)));
            yy = 0.25 + (((tickAnim - 30) / 10) * (-0.25-(0.25)));
            zz = -0.75 + (((tickAnim - 30) / 10) * (0-(-0.75)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.Hips.rotationPointX = this.Hips.rotationPointX + (float)(xx);
        this.Hips.rotationPointY = this.Hips.rotationPointY - (float)(yy);
        this.Hips.rotationPointZ = this.Hips.rotationPointZ + (float)(zz);



        this.setRotateAngle(Belly, Belly.rotateAngleX + (float) Math.toRadians(0), Belly.rotateAngleY + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180-90))*-2), Belly.rotateAngleZ + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180-250))*-1));


        this.setRotateAngle(Front, Front.rotateAngleX + (float) Math.toRadians(0), Front.rotateAngleY + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180-200))*2), Front.rotateAngleZ + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180-400))*-1));


        this.setRotateAngle(Neck, Neck.rotateAngleX + (float) Math.toRadians(-(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180-30))*2)), Neck.rotateAngleY + (float) Math.toRadians(-(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180-200))*2)), Neck.rotateAngleZ + (float) Math.toRadians(-(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180-400))*-1)));


        this.setRotateAngle(Lowerjaw, Lowerjaw.rotateAngleX + (float) Math.toRadians(2+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180))*2), Lowerjaw.rotateAngleY + (float) Math.toRadians(0), Lowerjaw.rotateAngleZ + (float) Math.toRadians(0));



        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 11.95982 + (((tickAnim - 0) / 10) * (-42.27795-(11.95982)));
            yy = 11.93597 + (((tickAnim - 0) / 10) * (1.33509-(11.93597)));
            zz = -1.96321 + (((tickAnim - 0) / 10) * (-9.10709-(-1.96321)));
        }
        else if (tickAnim >= 10 && tickAnim < 20) {
            xx = -42.27795 + (((tickAnim - 10) / 10) * (-42.14997-(-42.27795)));
            yy = 1.33509 + (((tickAnim - 10) / 10) * (-19.74299-(1.33509)));
            zz = -9.10709 + (((tickAnim - 10) / 10) * (11.87695-(-9.10709)));
        }
        else if (tickAnim >= 20 && tickAnim < 40) {
            xx = -42.14997 + (((tickAnim - 20) / 20) * (11.95982-(-42.14997)));
            yy = -19.74299 + (((tickAnim - 20) / 20) * (11.93597-(-19.74299)));
            zz = 11.87695 + (((tickAnim - 20) / 20) * (-1.96321-(11.87695)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Leftupperarm, Leftupperarm.rotateAngleX + (float) Math.toRadians(xx), Leftupperarm.rotateAngleY + (float) Math.toRadians(yy), Leftupperarm.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 5) {
            xx = 2.5 + (((tickAnim - 0) / 5) * (-24.29111-(2.5)));
            yy = 0 + (((tickAnim - 0) / 5) * (1.04133-(0)));
            zz = 0 + (((tickAnim - 0) / 5) * (-0.44023-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 10) {
            xx = -24.29111 + (((tickAnim - 5) / 5) * (-20.83719-(-24.29111)));
            yy = 1.04133 + (((tickAnim - 5) / 5) * (2.61026-(1.04133)));
            zz = -0.44023 + (((tickAnim - 5) / 5) * (-8.21017-(-0.44023)));
        }
        else if (tickAnim >= 10 && tickAnim < 20) {
            xx = -20.83719 + (((tickAnim - 10) / 10) * (-3.70509-(-20.83719)));
            yy = 2.61026 + (((tickAnim - 10) / 10) * (9.4144-(2.61026)));
            zz = -8.21017 + (((tickAnim - 10) / 10) * (-3.5842-(-8.21017)));
        }
        else if (tickAnim >= 20 && tickAnim < 28) {
            xx = -3.70509 + (((tickAnim - 20) / 8) * (-15.42519-(-3.70509)));
            yy = 9.4144 + (((tickAnim - 20) / 8) * (5.49173-(9.4144)));
            zz = -3.5842 + (((tickAnim - 20) / 8) * (-2.09078-(-3.5842)));
        }
        else if (tickAnim >= 28 && tickAnim < 35) {
            xx = -15.42519 + (((tickAnim - 28) / 7) * (-15.30127-(-15.42519)));
            yy = 5.49173 + (((tickAnim - 28) / 7) * (2.3536-(5.49173)));
            zz = -2.09078 + (((tickAnim - 28) / 7) * (-0.89605-(-2.09078)));
        }
        else if (tickAnim >= 35 && tickAnim < 40) {
            xx = -15.30127 + (((tickAnim - 35) / 5) * (2.5-(-15.30127)));
            yy = 2.3536 + (((tickAnim - 35) / 5) * (0-(2.3536)));
            zz = -0.89605 + (((tickAnim - 35) / 5) * (0-(-0.89605)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Leftlowerarm, Leftlowerarm.rotateAngleX + (float) Math.toRadians(xx), Leftlowerarm.rotateAngleY + (float) Math.toRadians(yy), Leftlowerarm.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 1) {
            xx = 10 + (((tickAnim - 0) / 1) * (-8.98385-(10)));
            yy = 0 + (((tickAnim - 0) / 1) * (0.22088-(0)));
            zz = 0 + (((tickAnim - 0) / 1) * (0.52733-(0)));
        }
        else if (tickAnim >= 1 && tickAnim < 5) {
            xx = -8.98385 + (((tickAnim - 1) / 4) * (1.09691-(-8.98385)));
            yy = 0.22088 + (((tickAnim - 1) / 4) * (1.32527-(0.22088)));
            zz = 0.52733 + (((tickAnim - 1) / 4) * (3.16398-(0.52733)));
        }
        else if (tickAnim >= 5 && tickAnim < 10) {
            xx = 1.09691 + (((tickAnim - 5) / 5) * (30.86081-(1.09691)));
            yy = 1.32527 + (((tickAnim - 5) / 5) * (2.43508-(1.32527)));
            zz = 3.16398 + (((tickAnim - 5) / 5) * (5.81358-(3.16398)));
        }
        else if (tickAnim >= 10 && tickAnim < 20) {
            xx = 30.86081 + (((tickAnim - 10) / 10) * (44.38763-(30.86081)));
            yy = 2.43508 + (((tickAnim - 10) / 10) * (5.30107-(2.43508)));
            zz = 5.81358 + (((tickAnim - 10) / 10) * (12.65593-(5.81358)));
        }
        else if (tickAnim >= 20 && tickAnim < 25) {
            xx = 44.38763 + (((tickAnim - 20) / 5) * (40.00918-(44.38763)));
            yy = 5.30107 + (((tickAnim - 20) / 5) * (-6.64007-(5.30107)));
            zz = 12.65593 + (((tickAnim - 20) / 5) * (-5.74651-(12.65593)));
        }
        else if (tickAnim >= 25 && tickAnim < 28) {
            xx = 40.00918 + (((tickAnim - 25) / 3) * (34.17381-(40.00918)));
            yy = -6.64007 + (((tickAnim - 25) / 3) * (-5.1645-(-6.64007)));
            zz = -5.74651 + (((tickAnim - 25) / 3) * (-4.46951-(-5.74651)));
        }
        else if (tickAnim >= 28 && tickAnim < 35) {
            xx = 34.17381 + (((tickAnim - 28) / 7) * (14.8602-(34.17381)));
            yy = -5.1645 + (((tickAnim - 28) / 7) * (-2.21336-(-5.1645)));
            zz = -4.46951 + (((tickAnim - 28) / 7) * (-1.9155-(-4.46951)));
        }
        else if (tickAnim >= 35 && tickAnim < 37) {
            xx = 14.8602 + (((tickAnim - 35) / 2) * (6.9068-(14.8602)));
            yy = -2.21336 + (((tickAnim - 35) / 2) * (-1.47557-(-2.21336)));
            zz = -1.9155 + (((tickAnim - 35) / 2) * (-1.277-(-1.9155)));
        }
        else if (tickAnim >= 37 && tickAnim < 40) {
            xx = 6.9068 + (((tickAnim - 37) / 3) * (10-(6.9068)));
            yy = -1.47557 + (((tickAnim - 37) / 3) * (0-(-1.47557)));
            zz = -1.277 + (((tickAnim - 37) / 3) * (0-(-1.277)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Leftfrontfoot, Leftfrontfoot.rotateAngleX + (float) Math.toRadians(xx), Leftfrontfoot.rotateAngleY + (float) Math.toRadians(yy), Leftfrontfoot.rotateAngleZ + (float) Math.toRadians(zz));



        this.setRotateAngle(Tail1, Tail1.rotateAngleX + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360+60))*-3), Tail1.rotateAngleY + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180))*-5), Tail1.rotateAngleZ + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180+30))*3));


        this.setRotateAngle(Tail2, Tail2.rotateAngleX + (float) Math.toRadians(5+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360+30))*-5), Tail2.rotateAngleY + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180-30))*-10), Tail2.rotateAngleZ + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180))*5));


        this.setRotateAngle(Tail3, Tail3.rotateAngleX + (float) Math.toRadians(5+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360))*-5), Tail3.rotateAngleY + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180-60))*-10), Tail3.rotateAngleZ + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180-30))*5));



        if (tickAnim >= 0 && tickAnim < 20) {
            xx = -4.54402 + (((tickAnim - 0) / 20) * (35-(-4.54402)));
            yy = 1.68027 + (((tickAnim - 0) / 20) * (0-(1.68027)));
            zz = -6.74979 + (((tickAnim - 0) / 20) * (0-(-6.74979)));
        }
        else if (tickAnim >= 20 && tickAnim < 30) {
            xx = 35 + (((tickAnim - 20) / 10) * (-16.70539-(35)));
            yy = 0 + (((tickAnim - 20) / 10) * (-18.76891-(0)));
            zz = 0 + (((tickAnim - 20) / 10) * (-15.33011-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 40) {
            xx = -16.70539 + (((tickAnim - 30) / 10) * (-4.54402-(-16.70539)));
            yy = -18.76891 + (((tickAnim - 30) / 10) * (1.68027-(-18.76891)));
            zz = -15.33011 + (((tickAnim - 30) / 10) * (-6.74979-(-15.33011)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Leftthigh, Leftthigh.rotateAngleX + (float) Math.toRadians(xx), Leftthigh.rotateAngleY + (float) Math.toRadians(yy), Leftthigh.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 11) {
            xx = -24.1056 + (((tickAnim - 0) / 11) * (18.6015-(-24.1056)));
            yy = -19.69098 + (((tickAnim - 0) / 11) * (-12.32016-(-19.69098)));
            zz = -0.22132 + (((tickAnim - 0) / 11) * (-1.53099-(-0.22132)));
        }
        else if (tickAnim >= 11 && tickAnim < 20) {
            xx = 18.6015 + (((tickAnim - 11) / 9) * (15.68672-(18.6015)));
            yy = -12.32016 + (((tickAnim - 11) / 9) * (-5.51738-(-12.32016)));
            zz = -1.53099 + (((tickAnim - 11) / 9) * (-5.14839-(-1.53099)));
        }
        else if (tickAnim >= 20 && tickAnim < 25) {
            xx = 15.68672 + (((tickAnim - 20) / 5) * (23.36342-(15.68672)));
            yy = -5.51738 + (((tickAnim - 20) / 5) * (-9.06078-(-5.51738)));
            zz = -5.14839 + (((tickAnim - 20) / 5) * (-3.91662-(-5.14839)));
        }
        else if (tickAnim >= 25 && tickAnim < 29) {
            xx = 23.36342 + (((tickAnim - 25) / 4) * (34.344-(23.36342)));
            yy = -9.06078 + (((tickAnim - 25) / 4) * (-12.01361-(-9.06078)));
            zz = -3.91662 + (((tickAnim - 25) / 4) * (-2.89015-(-3.91662)));
        }
        else if (tickAnim >= 29 && tickAnim < 33) {
            xx = 34.344 + (((tickAnim - 29) / 4) * (19.25654-(34.344)));
            yy = -12.01361 + (((tickAnim - 29) / 4) * (-14.96645-(-12.01361)));
            zz = -2.89015 + (((tickAnim - 29) / 4) * (-1.86368-(-2.89015)));
        }
        else if (tickAnim >= 33 && tickAnim < 40) {
            xx = 19.25654 + (((tickAnim - 33) / 7) * (-24.1056-(19.25654)));
            yy = -14.96645 + (((tickAnim - 33) / 7) * (-19.69098-(-14.96645)));
            zz = -1.86368 + (((tickAnim - 33) / 7) * (-0.22132-(-1.86368)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Leftshin, Leftshin.rotateAngleX + (float) Math.toRadians(xx), Leftshin.rotateAngleY + (float) Math.toRadians(yy), Leftshin.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 5) {
            xx = 25.02686 + (((tickAnim - 0) / 5) * (-0.18409-(25.02686)));
            yy = 1.60667 + (((tickAnim - 0) / 5) * (3.72019-(1.60667)));
            zz = 1.91561 + (((tickAnim - 0) / 5) * (-2.62089-(1.91561)));
        }
        else if (tickAnim >= 5 && tickAnim < 11) {
            xx = -0.18409 + (((tickAnim - 5) / 6) * (-19.57129-(-0.18409)));
            yy = 3.72019 + (((tickAnim - 5) / 6) * (-0.78767-(3.72019)));
            zz = -2.62089 + (((tickAnim - 5) / 6) * (-2.94913-(-2.62089)));
        }
        else if (tickAnim >= 11 && tickAnim < 15) {
            xx = -19.57129 + (((tickAnim - 11) / 4) * (-28.61759-(-19.57129)));
            yy = -0.78767 + (((tickAnim - 11) / 4) * (0.30067-(-0.78767)));
            zz = -2.94913 + (((tickAnim - 11) / 4) * (-0.73788-(-2.94913)));
        }
        else if (tickAnim >= 15 && tickAnim < 20) {
            xx = -28.61759 + (((tickAnim - 15) / 5) * (-17.47314-(-28.61759)));
            yy = 0.30067 + (((tickAnim - 15) / 5) * (1.60667-(0.30067)));
            zz = -0.73788 + (((tickAnim - 15) / 5) * (1.91561-(-0.73788)));
        }
        else if (tickAnim >= 20 && tickAnim < 25) {
            xx = -17.47314 + (((tickAnim - 20) / 5) * (-18.36599-(-17.47314)));
            yy = 1.60667 + (((tickAnim - 20) / 5) * (1.60667-(1.60667)));
            zz = 1.91561 + (((tickAnim - 20) / 5) * (1.91561-(1.91561)));
        }
        else if (tickAnim >= 25 && tickAnim < 33) {
            xx = -18.36599 + (((tickAnim - 25) / 8) * (-15.75745-(-18.36599)));
            yy = 1.60667 + (((tickAnim - 25) / 8) * (1.60667-(1.60667)));
            zz = 1.91561 + (((tickAnim - 25) / 8) * (1.91561-(1.91561)));
        }
        else if (tickAnim >= 33 && tickAnim < 40) {
            xx = -15.75745 + (((tickAnim - 33) / 7) * (25.02686-(-15.75745)));
            yy = 1.60667 + (((tickAnim - 33) / 7) * (1.60667-(1.60667)));
            zz = 1.91561 + (((tickAnim - 33) / 7) * (1.91561-(1.91561)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Lefthindfoot, Lefthindfoot.rotateAngleX + (float) Math.toRadians(xx), Lefthindfoot.rotateAngleY + (float) Math.toRadians(yy), Lefthindfoot.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 20) {
            xx = -42.14997 + (((tickAnim - 0) / 20) * (11.95982-(-42.14997)));
            yy = 19.74299 + (((tickAnim - 0) / 20) * (-11.93597-(19.74299)));
            zz = -11.87695 + (((tickAnim - 0) / 20) * (1.96321-(-11.87695)));
        }
        else if (tickAnim >= 20 && tickAnim < 30) {
            xx = 11.95982 + (((tickAnim - 20) / 10) * (-42.27795-(11.95982)));
            yy = -11.93597 + (((tickAnim - 20) / 10) * (-1.33509-(-11.93597)));
            zz = 1.96321 + (((tickAnim - 20) / 10) * (9.10709-(1.96321)));
        }
        else if (tickAnim >= 30 && tickAnim < 40) {
            xx = -42.27795 + (((tickAnim - 30) / 10) * (-42.14997-(-42.27795)));
            yy = -1.33509 + (((tickAnim - 30) / 10) * (19.74299-(-1.33509)));
            zz = 9.10709 + (((tickAnim - 30) / 10) * (-11.87695-(9.10709)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Rightupperarm, Rightupperarm.rotateAngleX + (float) Math.toRadians(xx), Rightupperarm.rotateAngleY + (float) Math.toRadians(yy), Rightupperarm.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 8) {
            xx = -3.70509 + (((tickAnim - 0) / 8) * (-15.42519-(-3.70509)));
            yy = -9.4144 + (((tickAnim - 0) / 8) * (-5.49173-(-9.4144)));
            zz = 3.5842 + (((tickAnim - 0) / 8) * (2.09078-(3.5842)));
        }
        else if (tickAnim >= 8 && tickAnim < 15) {
            xx = -15.42519 + (((tickAnim - 8) / 7) * (-15.30127-(-15.42519)));
            yy = -5.49173 + (((tickAnim - 8) / 7) * (-2.3536-(-5.49173)));
            zz = 2.09078 + (((tickAnim - 8) / 7) * (0.89605-(2.09078)));
        }
        else if (tickAnim >= 15 && tickAnim < 20) {
            xx = -15.30127 + (((tickAnim - 15) / 5) * (2.5-(-15.30127)));
            yy = -2.3536 + (((tickAnim - 15) / 5) * (0-(-2.3536)));
            zz = 0.89605 + (((tickAnim - 15) / 5) * (0-(0.89605)));
        }
        else if (tickAnim >= 20 && tickAnim < 25) {
            xx = 2.5 + (((tickAnim - 20) / 5) * (-24.29111-(2.5)));
            yy = 0 + (((tickAnim - 20) / 5) * (-1.04133-(0)));
            zz = 0 + (((tickAnim - 20) / 5) * (0.44023-(0)));
        }
        else if (tickAnim >= 25 && tickAnim < 30) {
            xx = -24.29111 + (((tickAnim - 25) / 5) * (-20.83719-(-24.29111)));
            yy = -1.04133 + (((tickAnim - 25) / 5) * (-2.61026-(-1.04133)));
            zz = 0.44023 + (((tickAnim - 25) / 5) * (8.21017-(0.44023)));
        }
        else if (tickAnim >= 30 && tickAnim < 40) {
            xx = -20.83719 + (((tickAnim - 30) / 10) * (-3.70509-(-20.83719)));
            yy = -2.61026 + (((tickAnim - 30) / 10) * (-9.4144-(-2.61026)));
            zz = 8.21017 + (((tickAnim - 30) / 10) * (3.5842-(8.21017)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Rightlowerarm, Rightlowerarm.rotateAngleX + (float) Math.toRadians(xx), Rightlowerarm.rotateAngleY + (float) Math.toRadians(yy), Rightlowerarm.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 5) {
            xx = 44.38763 + (((tickAnim - 0) / 5) * (40.00918-(44.38763)));
            yy = -5.30107 + (((tickAnim - 0) / 5) * (6.64007-(-5.30107)));
            zz = -12.65593 + (((tickAnim - 0) / 5) * (5.74651-(-12.65593)));
        }
        else if (tickAnim >= 5 && tickAnim < 8) {
            xx = 40.00918 + (((tickAnim - 5) / 3) * (34.17381-(40.00918)));
            yy = 6.64007 + (((tickAnim - 5) / 3) * (5.1645-(6.64007)));
            zz = 5.74651 + (((tickAnim - 5) / 3) * (4.46951-(5.74651)));
        }
        else if (tickAnim >= 8 && tickAnim < 15) {
            xx = 34.17381 + (((tickAnim - 8) / 7) * (14.8602-(34.17381)));
            yy = 5.1645 + (((tickAnim - 8) / 7) * (2.21336-(5.1645)));
            zz = 4.46951 + (((tickAnim - 8) / 7) * (1.9155-(4.46951)));
        }
        else if (tickAnim >= 15 && tickAnim < 17) {
            xx = 14.8602 + (((tickAnim - 15) / 2) * (6.9068-(14.8602)));
            yy = 2.21336 + (((tickAnim - 15) / 2) * (1.47557-(2.21336)));
            zz = 1.9155 + (((tickAnim - 15) / 2) * (1.277-(1.9155)));
        }
        else if (tickAnim >= 17 && tickAnim < 20) {
            xx = 6.9068 + (((tickAnim - 17) / 3) * (10-(6.9068)));
            yy = 1.47557 + (((tickAnim - 17) / 3) * (0-(1.47557)));
            zz = 1.277 + (((tickAnim - 17) / 3) * (0-(1.277)));
        }
        else if (tickAnim >= 20 && tickAnim < 21) {
            xx = 10 + (((tickAnim - 20) / 1) * (-8.98385-(10)));
            yy = 0 + (((tickAnim - 20) / 1) * (-0.22088-(0)));
            zz = 0 + (((tickAnim - 20) / 1) * (-0.52733-(0)));
        }
        else if (tickAnim >= 21 && tickAnim < 25) {
            xx = -8.98385 + (((tickAnim - 21) / 4) * (1.09691-(-8.98385)));
            yy = -0.22088 + (((tickAnim - 21) / 4) * (-1.32527-(-0.22088)));
            zz = -0.52733 + (((tickAnim - 21) / 4) * (-3.16398-(-0.52733)));
        }
        else if (tickAnim >= 25 && tickAnim < 30) {
            xx = 1.09691 + (((tickAnim - 25) / 5) * (30.86081-(1.09691)));
            yy = -1.32527 + (((tickAnim - 25) / 5) * (-2.43508-(-1.32527)));
            zz = -3.16398 + (((tickAnim - 25) / 5) * (-5.81358-(-3.16398)));
        }
        else if (tickAnim >= 30 && tickAnim < 40) {
            xx = 30.86081 + (((tickAnim - 30) / 10) * (44.38763-(30.86081)));
            yy = -2.43508 + (((tickAnim - 30) / 10) * (-5.30107-(-2.43508)));
            zz = -5.81358 + (((tickAnim - 30) / 10) * (-12.65593-(-5.81358)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Rightfrontfoot, Rightfrontfoot.rotateAngleX + (float) Math.toRadians(xx), Rightfrontfoot.rotateAngleY + (float) Math.toRadians(yy), Rightfrontfoot.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 35 + (((tickAnim - 0) / 10) * (-16.70539-(35)));
            yy = 0 + (((tickAnim - 0) / 10) * (18.76891-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (15.33011-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 20) {
            xx = -16.70539 + (((tickAnim - 10) / 10) * (-4.54402-(-16.70539)));
            yy = 18.76891 + (((tickAnim - 10) / 10) * (-1.68027-(18.76891)));
            zz = 15.33011 + (((tickAnim - 10) / 10) * (6.74979-(15.33011)));
        }
        else if (tickAnim >= 20 && tickAnim < 40) {
            xx = -4.54402 + (((tickAnim - 20) / 20) * (35-(-4.54402)));
            yy = -1.68027 + (((tickAnim - 20) / 20) * (0-(-1.68027)));
            zz = 6.74979 + (((tickAnim - 20) / 20) * (0-(6.74979)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Rightthigh, Rightthigh.rotateAngleX + (float) Math.toRadians(xx), Rightthigh.rotateAngleY + (float) Math.toRadians(yy), Rightthigh.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 5) {
            xx = 15.68672 + (((tickAnim - 0) / 5) * (23.36342-(15.68672)));
            yy = 5.51738 + (((tickAnim - 0) / 5) * (9.06078-(5.51738)));
            zz = 5.14839 + (((tickAnim - 0) / 5) * (3.91662-(5.14839)));
        }
        else if (tickAnim >= 5 && tickAnim < 9) {
            xx = 23.36342 + (((tickAnim - 5) / 4) * (34.344-(23.36342)));
            yy = 9.06078 + (((tickAnim - 5) / 4) * (12.01361-(9.06078)));
            zz = 3.91662 + (((tickAnim - 5) / 4) * (2.89015-(3.91662)));
        }
        else if (tickAnim >= 9 && tickAnim < 13) {
            xx = 34.344 + (((tickAnim - 9) / 4) * (19.25654-(34.344)));
            yy = 12.01361 + (((tickAnim - 9) / 4) * (14.96645-(12.01361)));
            zz = 2.89015 + (((tickAnim - 9) / 4) * (1.86368-(2.89015)));
        }
        else if (tickAnim >= 13 && tickAnim < 20) {
            xx = 19.25654 + (((tickAnim - 13) / 7) * (-24.1056-(19.25654)));
            yy = 14.96645 + (((tickAnim - 13) / 7) * (19.69098-(14.96645)));
            zz = 1.86368 + (((tickAnim - 13) / 7) * (0.22132-(1.86368)));
        }
        else if (tickAnim >= 20 && tickAnim < 31) {
            xx = -24.1056 + (((tickAnim - 20) / 11) * (18.6015-(-24.1056)));
            yy = 19.69098 + (((tickAnim - 20) / 11) * (12.32016-(19.69098)));
            zz = 0.22132 + (((tickAnim - 20) / 11) * (1.53099-(0.22132)));
        }
        else if (tickAnim >= 31 && tickAnim < 40) {
            xx = 18.6015 + (((tickAnim - 31) / 9) * (15.68672-(18.6015)));
            yy = 12.32016 + (((tickAnim - 31) / 9) * (5.51738-(12.32016)));
            zz = 1.53099 + (((tickAnim - 31) / 9) * (5.14839-(1.53099)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Rightshin, Rightshin.rotateAngleX + (float) Math.toRadians(xx), Rightshin.rotateAngleY + (float) Math.toRadians(yy), Rightshin.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 5) {
            xx = -17.47314 + (((tickAnim - 0) / 5) * (-18.36599-(-17.47314)));
            yy = -1.60667 + (((tickAnim - 0) / 5) * (-1.60667-(-1.60667)));
            zz = -1.91561 + (((tickAnim - 0) / 5) * (-1.91561-(-1.91561)));
        }
        else if (tickAnim >= 5 && tickAnim < 13) {
            xx = -18.36599 + (((tickAnim - 5) / 8) * (-15.75745-(-18.36599)));
            yy = -1.60667 + (((tickAnim - 5) / 8) * (-1.60667-(-1.60667)));
            zz = -1.91561 + (((tickAnim - 5) / 8) * (-1.91561-(-1.91561)));
        }
        else if (tickAnim >= 13 && tickAnim < 20) {
            xx = -15.75745 + (((tickAnim - 13) / 7) * (25.02686-(-15.75745)));
            yy = -1.60667 + (((tickAnim - 13) / 7) * (-1.60667-(-1.60667)));
            zz = -1.91561 + (((tickAnim - 13) / 7) * (-1.91561-(-1.91561)));
        }
        else if (tickAnim >= 20 && tickAnim < 25) {
            xx = 25.02686 + (((tickAnim - 20) / 5) * (-0.18409-(25.02686)));
            yy = -1.60667 + (((tickAnim - 20) / 5) * (-3.72019-(-1.60667)));
            zz = -1.91561 + (((tickAnim - 20) / 5) * (2.62089-(-1.91561)));
        }
        else if (tickAnim >= 25 && tickAnim < 31) {
            xx = -0.18409 + (((tickAnim - 25) / 6) * (-19.57129-(-0.18409)));
            yy = -3.72019 + (((tickAnim - 25) / 6) * (0.78767-(-3.72019)));
            zz = 2.62089 + (((tickAnim - 25) / 6) * (2.94913-(2.62089)));
        }
        else if (tickAnim >= 31 && tickAnim < 35) {
            xx = -19.57129 + (((tickAnim - 31) / 4) * (-28.61759-(-19.57129)));
            yy = 0.78767 + (((tickAnim - 31) / 4) * (-0.30067-(0.78767)));
            zz = 2.94913 + (((tickAnim - 31) / 4) * (0.73788-(2.94913)));
        }
        else if (tickAnim >= 35 && tickAnim < 40) {
            xx = -28.61759 + (((tickAnim - 35) / 5) * (-17.47314-(-28.61759)));
            yy = -0.30067 + (((tickAnim - 35) / 5) * (-1.60667-(-0.30067)));
            zz = 0.73788 + (((tickAnim - 35) / 5) * (-1.91561-(0.73788)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Righthindfoot, Righthindfoot.rotateAngleX + (float) Math.toRadians(xx), Righthindfoot.rotateAngleY + (float) Math.toRadians(yy), Righthindfoot.rotateAngleZ + (float) Math.toRadians(zz));

    }

    public void animRunning(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime) {
        EntityPrehistoricFloraMoschops entity = (EntityPrehistoricFloraMoschops) entitylivingbaseIn;

        int animCycle = 20;
        double tickAnim = (entity.ticksExisted + entity.getTickOffset()) - (int) (Math.floor((double) (entity.ticksExisted + entity.getTickOffset()) / (double) animCycle) * (double) animCycle) + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;
        this.setRotateAngle(Hips, Hips.rotateAngleX + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*720))*2.5), Hips.rotateAngleY + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360-60))*-2.5), Hips.rotateAngleZ + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360-60))*2.5));
        this.Hips.rotationPointX = this.Hips.rotationPointX + (float)(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360+90))*1);
        this.Hips.rotationPointY = this.Hips.rotationPointY - (float)(-1+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*720-90))*0.75);
        this.Hips.rotationPointZ = this.Hips.rotationPointZ + (float)(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*720-90))*-1);


        this.setRotateAngle(Belly, Belly.rotateAngleX + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*720+30))*-5), Belly.rotateAngleY + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360-30))*2.5), Belly.rotateAngleZ + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360-30))*-2.5));


        this.setRotateAngle(Front, Front.rotateAngleX + (float) Math.toRadians(-2.5+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*720+90))*2.5), Front.rotateAngleY + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360-90))*5), Front.rotateAngleZ + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360-60))*-2.5));


        this.setRotateAngle(Neck, Neck.rotateAngleX + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*720+120))*-2.5), Neck.rotateAngleY + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360-90))*-5), Neck.rotateAngleZ + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360-90))*2.5));


        this.setRotateAngle(Head, Head.rotateAngleX + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*720))*2.5), Head.rotateAngleY + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360))*2.5), Head.rotateAngleZ + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360-60))*-2.5));


        this.setRotateAngle(Lowerjaw, Lowerjaw.rotateAngleX + (float) Math.toRadians(2+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360-60))*2), Lowerjaw.rotateAngleY + (float) Math.toRadians(0), Lowerjaw.rotateAngleZ + (float) Math.toRadians(0));



        if (tickAnim >= 0 && tickAnim < 2) {
            xx = 18.66316 + (((tickAnim - 0) / 2) * (6.46829-(18.66316)));
            yy = -8.53173 + (((tickAnim - 0) / 2) * (13.01406-(-8.53173)));
            zz = 14.80277 + (((tickAnim - 0) / 2) * (9.30559-(14.80277)));
        }
        else if (tickAnim >= 2 && tickAnim < 6) {
            xx = 6.46829 + (((tickAnim - 2) / 4) * (-26.22271-(6.46829)));
            yy = 13.01406 + (((tickAnim - 2) / 4) * (-10.33892-(13.01406)));
            zz = 9.30559 + (((tickAnim - 2) / 4) * (2.11528-(9.30559)));
        }
        else if (tickAnim >= 6 && tickAnim < 10) {
            xx = -26.22271 + (((tickAnim - 6) / 4) * (-42.09008-(-26.22271)));
            yy = -10.33892 + (((tickAnim - 6) / 4) * (-21.86812-(-10.33892)));
            zz = 2.11528 + (((tickAnim - 6) / 4) * (0.31692-(2.11528)));
        }
        else if (tickAnim >= 10 && tickAnim < 20) {
            xx = -42.09008 + (((tickAnim - 10) / 10) * (18.66316-(-42.09008)));
            yy = -21.86812 + (((tickAnim - 10) / 10) * (-8.53173-(-21.86812)));
            zz = 0.31692 + (((tickAnim - 10) / 10) * (14.80277-(0.31692)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Leftupperarm, Leftupperarm.rotateAngleX + (float) Math.toRadians(xx), Leftupperarm.rotateAngleY + (float) Math.toRadians(yy), Leftupperarm.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 10 && tickAnim < 11) {
            xx = 0 + (((tickAnim - 10) / 1) * (0-(0)));
            yy = 0 + (((tickAnim - 10) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 1) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.Leftupperarm.rotationPointX = this.Leftupperarm.rotationPointX + (float)(xx);
        this.Leftupperarm.rotationPointY = this.Leftupperarm.rotationPointY - (float)(yy);
        this.Leftupperarm.rotationPointZ = this.Leftupperarm.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 3) {
            xx = -18.53168 + (((tickAnim - 0) / 3) * (-40.72545-(-18.53168)));
            yy = -12.13904 + (((tickAnim - 0) / 3) * (-8.51715-(-12.13904)));
            zz = -26.56015 + (((tickAnim - 0) / 3) * (-39.79644-(-26.56015)));
        }
        else if (tickAnim >= 3 && tickAnim < 6) {
            xx = -40.72545 + (((tickAnim - 3) / 3) * (-41.52152-(-40.72545)));
            yy = -8.51715 + (((tickAnim - 3) / 3) * (-0.52438-(-8.51715)));
            zz = -39.79644 + (((tickAnim - 3) / 3) * (-25.93485-(-39.79644)));
        }
        else if (tickAnim >= 6 && tickAnim < 10) {
            xx = -41.52152 + (((tickAnim - 6) / 4) * (20-(-41.52152)));
            yy = -0.52438 + (((tickAnim - 6) / 4) * (0-(-0.52438)));
            zz = -25.93485 + (((tickAnim - 6) / 4) * (0-(-25.93485)));
        }
        else if (tickAnim >= 10 && tickAnim < 15) {
            xx = 20 + (((tickAnim - 10) / 5) * (-26.42019-(20)));
            yy = 0 + (((tickAnim - 10) / 5) * (-5.43452-(0)));
            zz = 0 + (((tickAnim - 10) / 5) * (-6.2166-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 20) {
            xx = -26.42019 + (((tickAnim - 15) / 5) * (-18.53168-(-26.42019)));
            yy = -5.43452 + (((tickAnim - 15) / 5) * (-12.13904-(-5.43452)));
            zz = -6.2166 + (((tickAnim - 15) / 5) * (-26.56015-(-6.2166)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Leftlowerarm, Leftlowerarm.rotateAngleX + (float) Math.toRadians(xx), Leftlowerarm.rotateAngleY + (float) Math.toRadians(yy), Leftlowerarm.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 10 + (((tickAnim - 0) / 3) * (17.0019-(10)));
            yy = 0 + (((tickAnim - 0) / 3) * (-2.62404-(0)));
            zz = 0 + (((tickAnim - 0) / 3) * (11.12265-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 6) {
            xx = 17.0019 + (((tickAnim - 3) / 3) * (59.06-(17.0019)));
            yy = -2.62404 + (((tickAnim - 3) / 3) * (0-(-2.62404)));
            zz = 11.12265 + (((tickAnim - 3) / 3) * (0-(11.12265)));
        }
        else if (tickAnim >= 6 && tickAnim < 10) {
            xx = 59.06 + (((tickAnim - 6) / 4) * (25-(59.06)));
            yy = 0 + (((tickAnim - 6) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 6) / 4) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 13) {
            xx = 25 + (((tickAnim - 10) / 3) * (49.25-(25)));
            yy = 0 + (((tickAnim - 10) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 3) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 15) {
            xx = 49.25 + (((tickAnim - 13) / 2) * (48.49-(49.25)));
            yy = 0 + (((tickAnim - 13) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 13) / 2) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 18) {
            xx = 48.49 + (((tickAnim - 15) / 3) * (15.73-(48.49)));
            yy = 0 + (((tickAnim - 15) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 3) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 20) {
            xx = 15.73 + (((tickAnim - 18) / 2) * (10-(15.73)));
            yy = 0 + (((tickAnim - 18) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 18) / 2) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Leftfrontfoot, Leftfrontfoot.rotateAngleX + (float) Math.toRadians(xx), Leftfrontfoot.rotateAngleY + (float) Math.toRadians(yy), Leftfrontfoot.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 10) {
            xx = -42.09008 + (((tickAnim - 0) / 10) * (18.66316-(-42.09008)));
            yy = 21.86812 + (((tickAnim - 0) / 10) * (8.53173-(21.86812)));
            zz = -0.31692 + (((tickAnim - 0) / 10) * (-14.80277-(-0.31692)));
        }
        else if (tickAnim >= 10 && tickAnim < 12) {
            xx = 18.66316 + (((tickAnim - 10) / 2) * (6.46829-(18.66316)));
            yy = 8.53173 + (((tickAnim - 10) / 2) * (-13.01406-(8.53173)));
            zz = -14.80277 + (((tickAnim - 10) / 2) * (-9.30559-(-14.80277)));
        }
        else if (tickAnim >= 12 && tickAnim < 16) {
            xx = 6.46829 + (((tickAnim - 12) / 4) * (-26.22271-(6.46829)));
            yy = -13.01406 + (((tickAnim - 12) / 4) * (10.33892-(-13.01406)));
            zz = -9.30559 + (((tickAnim - 12) / 4) * (-2.11528-(-9.30559)));
        }
        else if (tickAnim >= 16 && tickAnim < 20) {
            xx = -26.22271 + (((tickAnim - 16) / 4) * (-42.09008-(-26.22271)));
            yy = 10.33892 + (((tickAnim - 16) / 4) * (21.86812-(10.33892)));
            zz = -2.11528 + (((tickAnim - 16) / 4) * (-0.31692-(-2.11528)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Rightupperarm, Rightupperarm.rotateAngleX + (float) Math.toRadians(xx), Rightupperarm.rotateAngleY + (float) Math.toRadians(yy), Rightupperarm.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 1) {
            xx = 0 + (((tickAnim - 0) / 1) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 1) * (0-(0)));
        }
        else if (tickAnim >= 1 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 1) / 19) * (0-(0)));
            yy = 0 + (((tickAnim - 1) / 19) * (0-(0)));
            zz = 0 + (((tickAnim - 1) / 19) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.Rightupperarm.rotationPointX = this.Rightupperarm.rotationPointX + (float)(xx);
        this.Rightupperarm.rotationPointY = this.Rightupperarm.rotationPointY - (float)(yy);
        this.Rightupperarm.rotationPointZ = this.Rightupperarm.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 5) {
            xx = 20 + (((tickAnim - 0) / 5) * (-26.42019-(20)));
            yy = 0 + (((tickAnim - 0) / 5) * (5.43452-(0)));
            zz = 0 + (((tickAnim - 0) / 5) * (6.2166-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 10) {
            xx = -26.42019 + (((tickAnim - 5) / 5) * (-18.53168-(-26.42019)));
            yy = 5.43452 + (((tickAnim - 5) / 5) * (12.13904-(5.43452)));
            zz = 6.2166 + (((tickAnim - 5) / 5) * (26.56015-(6.2166)));
        }
        else if (tickAnim >= 10 && tickAnim < 13) {
            xx = -18.53168 + (((tickAnim - 10) / 3) * (-40.72545-(-18.53168)));
            yy = 12.13904 + (((tickAnim - 10) / 3) * (8.51715-(12.13904)));
            zz = 26.56015 + (((tickAnim - 10) / 3) * (39.79644-(26.56015)));
        }
        else if (tickAnim >= 13 && tickAnim < 16) {
            xx = -40.72545 + (((tickAnim - 13) / 3) * (-41.52152-(-40.72545)));
            yy = 8.51715 + (((tickAnim - 13) / 3) * (0.52438-(8.51715)));
            zz = 39.79644 + (((tickAnim - 13) / 3) * (25.93485-(39.79644)));
        }
        else if (tickAnim >= 16 && tickAnim < 20) {
            xx = -41.52152 + (((tickAnim - 16) / 4) * (20-(-41.52152)));
            yy = 0.52438 + (((tickAnim - 16) / 4) * (0-(0.52438)));
            zz = 25.93485 + (((tickAnim - 16) / 4) * (0-(25.93485)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Rightlowerarm, Rightlowerarm.rotateAngleX + (float) Math.toRadians(xx), Rightlowerarm.rotateAngleY + (float) Math.toRadians(yy), Rightlowerarm.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 25 + (((tickAnim - 0) / 3) * (49.25-(25)));
            yy = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 3) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 5) {
            xx = 49.25 + (((tickAnim - 3) / 2) * (48.49-(49.25)));
            yy = 0 + (((tickAnim - 3) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 3) / 2) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 8) {
            xx = 48.49 + (((tickAnim - 5) / 3) * (15.73-(48.49)));
            yy = 0 + (((tickAnim - 5) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 5) / 3) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 10) {
            xx = 15.73 + (((tickAnim - 8) / 2) * (10-(15.73)));
            yy = 0 + (((tickAnim - 8) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 2) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 13) {
            xx = 10 + (((tickAnim - 10) / 3) * (17.0019-(10)));
            yy = 0 + (((tickAnim - 10) / 3) * (2.62404-(0)));
            zz = 0 + (((tickAnim - 10) / 3) * (-11.12265-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 16) {
            xx = 17.0019 + (((tickAnim - 13) / 3) * (59.06-(17.0019)));
            yy = 2.62404 + (((tickAnim - 13) / 3) * (0-(2.62404)));
            zz = -11.12265 + (((tickAnim - 13) / 3) * (0-(-11.12265)));
        }
        else if (tickAnim >= 16 && tickAnim < 20) {
            xx = 59.06 + (((tickAnim - 16) / 4) * (25-(59.06)));
            yy = 0 + (((tickAnim - 16) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 16) / 4) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Rightfrontfoot, Rightfrontfoot.rotateAngleX + (float) Math.toRadians(xx), Rightfrontfoot.rotateAngleY + (float) Math.toRadians(yy), Rightfrontfoot.rotateAngleZ + (float) Math.toRadians(zz));



        this.setRotateAngle(Tail1, Tail1.rotateAngleX + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*720+60))*-2.5), Tail1.rotateAngleY + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360-30))*10), Tail1.rotateAngleZ + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360))*-2.5));


        this.setRotateAngle(Tail2, Tail2.rotateAngleX + (float) Math.toRadians(10+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*720+30))*-2.5), Tail2.rotateAngleY + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360-60))*10), Tail2.rotateAngleZ + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360-60))*-2.5));


        this.setRotateAngle(Tail3, Tail3.rotateAngleX + (float) Math.toRadians(-5+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*720))*-2.5), Tail3.rotateAngleY + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360-120))*10), Tail3.rotateAngleZ + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360-120))*-2.5));



        if (tickAnim >= 0 && tickAnim < 10) {
            xx = -13.27027 + (((tickAnim - 0) / 10) * (35-(-13.27027)));
            yy = -3.18737 + (((tickAnim - 0) / 10) * (0-(-3.18737)));
            zz = -7.10205 + (((tickAnim - 0) / 10) * (0-(-7.10205)));
        }
        else if (tickAnim >= 10 && tickAnim < 13) {
            xx = 35 + (((tickAnim - 10) / 3) * (36.07585-(35)));
            yy = 0 + (((tickAnim - 10) / 3) * (-0.00897-(0)));
            zz = 0 + (((tickAnim - 10) / 3) * (-9.6665-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 15) {
            xx = 36.07585 + (((tickAnim - 13) / 2) * (7.15169-(36.07585)));
            yy = -0.00897 + (((tickAnim - 13) / 2) * (-0.01795-(-0.00897)));
            zz = -9.6665 + (((tickAnim - 13) / 2) * (-19.33301-(-9.6665)));
        }
        else if (tickAnim >= 15 && tickAnim < 20) {
            xx = 7.15169 + (((tickAnim - 15) / 5) * (-4.54402-(7.15169)));
            yy = -0.01795 + (((tickAnim - 15) / 5) * (1.68027-(-0.01795)));
            zz = -19.33301 + (((tickAnim - 15) / 5) * (-6.74979-(-19.33301)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Leftthigh, Leftthigh.rotateAngleX + (float) Math.toRadians(xx), Leftthigh.rotateAngleY + (float) Math.toRadians(yy), Leftthigh.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 1) {
            xx = 0 + (((tickAnim - 0) / 1) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 1) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.Leftthigh.rotationPointX = this.Leftthigh.rotationPointX + (float)(xx);
        this.Leftthigh.rotationPointY = this.Leftthigh.rotationPointY - (float)(yy);
        this.Leftthigh.rotationPointZ = this.Leftthigh.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 6) {
            xx = -24.1056 + (((tickAnim - 0) / 6) * (-6.04039-(-24.1056)));
            yy = -19.69098 + (((tickAnim - 0) / 6) * (-4.96285-(-19.69098)));
            zz = -0.22132 + (((tickAnim - 0) / 6) * (-10.81183-(-0.22132)));
        }
        else if (tickAnim >= 6 && tickAnim < 10) {
            xx = -6.04039 + (((tickAnim - 6) / 4) * (23.18672-(-6.04039)));
            yy = -4.96285 + (((tickAnim - 6) / 4) * (-5.51738-(-4.96285)));
            zz = -10.81183 + (((tickAnim - 6) / 4) * (-5.14839-(-10.81183)));
        }
        else if (tickAnim >= 10 && tickAnim < 13) {
            xx = 23.18672 + (((tickAnim - 10) / 3) * (14.91396-(23.18672)));
            yy = -5.51738 + (((tickAnim - 10) / 3) * (-9.65135-(-5.51738)));
            zz = -5.14839 + (((tickAnim - 10) / 3) * (-3.71133-(-5.14839)));
        }
        else if (tickAnim >= 13 && tickAnim < 14) {
            xx = 14.91396 + (((tickAnim - 13) / 1) * (34.344-(14.91396)));
            yy = -9.65135 + (((tickAnim - 13) / 1) * (-12.01361-(-9.65135)));
            zz = -3.71133 + (((tickAnim - 13) / 1) * (-2.89015-(-3.71133)));
        }
        else if (tickAnim >= 14 && tickAnim < 17) {
            xx = 34.344 + (((tickAnim - 14) / 3) * (19.25654-(34.344)));
            yy = -12.01361 + (((tickAnim - 14) / 3) * (-14.96645-(-12.01361)));
            zz = -2.89015 + (((tickAnim - 14) / 3) * (-1.86368-(-2.89015)));
        }
        else if (tickAnim >= 17 && tickAnim < 20) {
            xx = 19.25654 + (((tickAnim - 17) / 3) * (-24.1056-(19.25654)));
            yy = -14.96645 + (((tickAnim - 17) / 3) * (-19.69098-(-14.96645)));
            zz = -1.86368 + (((tickAnim - 17) / 3) * (-0.22132-(-1.86368)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Leftshin, Leftshin.rotateAngleX + (float) Math.toRadians(xx), Leftshin.rotateAngleY + (float) Math.toRadians(yy), Leftshin.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 37.52686 + (((tickAnim - 0) / 3) * (17.52686-(37.52686)));
            yy = 1.60667 + (((tickAnim - 0) / 3) * (1.60667-(1.60667)));
            zz = 1.91561 + (((tickAnim - 0) / 3) * (1.91561-(1.91561)));
        }
        else if (tickAnim >= 3 && tickAnim < 6) {
            xx = 17.52686 + (((tickAnim - 3) / 3) * (-4.80085-(17.52686)));
            yy = 1.60667 + (((tickAnim - 3) / 3) * (3.19329-(1.60667)));
            zz = 1.91561 + (((tickAnim - 3) / 3) * (5.7724-(1.91561)));
        }
        else if (tickAnim >= 6 && tickAnim < 10) {
            xx = -4.80085 + (((tickAnim - 6) / 4) * (-22.47314-(-4.80085)));
            yy = 3.19329 + (((tickAnim - 6) / 4) * (1.60667-(3.19329)));
            zz = 5.7724 + (((tickAnim - 6) / 4) * (1.91561-(5.7724)));
        }
        else if (tickAnim >= 10 && tickAnim < 13) {
            xx = -22.47314 + (((tickAnim - 10) / 3) * (33.9852-(-22.47314)));
            yy = 1.60667 + (((tickAnim - 10) / 3) * (1.60667-(1.60667)));
            zz = 1.91561 + (((tickAnim - 10) / 3) * (1.91561-(1.91561)));
        }
        else if (tickAnim >= 13 && tickAnim < 15) {
            xx = 33.9852 + (((tickAnim - 13) / 2) * (-4.36039-(33.9852)));
            yy = 1.60667 + (((tickAnim - 13) / 2) * (1.60667-(1.60667)));
            zz = 1.91561 + (((tickAnim - 13) / 2) * (1.91561-(1.91561)));
        }
        else if (tickAnim >= 15 && tickAnim < 17) {
            xx = -4.36039 + (((tickAnim - 15) / 2) * (-15.75745-(-4.36039)));
            yy = 1.60667 + (((tickAnim - 15) / 2) * (1.60667-(1.60667)));
            zz = 1.91561 + (((tickAnim - 15) / 2) * (1.91561-(1.91561)));
        }
        else if (tickAnim >= 17 && tickAnim < 20) {
            xx = -15.75745 + (((tickAnim - 17) / 3) * (25.02686-(-15.75745)));
            yy = 1.60667 + (((tickAnim - 17) / 3) * (1.60667-(1.60667)));
            zz = 1.91561 + (((tickAnim - 17) / 3) * (1.91561-(1.91561)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Lefthindfoot, Lefthindfoot.rotateAngleX + (float) Math.toRadians(xx), Lefthindfoot.rotateAngleY + (float) Math.toRadians(yy), Lefthindfoot.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 35 + (((tickAnim - 0) / 3) * (36.07585-(35)));
            yy = 0 + (((tickAnim - 0) / 3) * (0.00897-(0)));
            zz = 0 + (((tickAnim - 0) / 3) * (9.6665-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 5) {
            xx = 36.07585 + (((tickAnim - 3) / 2) * (7.15169-(36.07585)));
            yy = 0.00897 + (((tickAnim - 3) / 2) * (0.01795-(0.00897)));
            zz = 9.6665 + (((tickAnim - 3) / 2) * (19.33301-(9.6665)));
        }
        else if (tickAnim >= 5 && tickAnim < 10) {
            xx = 7.15169 + (((tickAnim - 5) / 5) * (-13.27027-(7.15169)));
            yy = 0.01795 + (((tickAnim - 5) / 5) * (3.18737-(0.01795)));
            zz = 19.33301 + (((tickAnim - 5) / 5) * (7.10205-(19.33301)));
        }
        else if (tickAnim >= 10 && tickAnim < 20) {
            xx = -13.27027 + (((tickAnim - 10) / 10) * (35-(-13.27027)));
            yy = 3.18737 + (((tickAnim - 10) / 10) * (0-(3.18737)));
            zz = 7.10205 + (((tickAnim - 10) / 10) * (0-(7.10205)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Rightthigh, Rightthigh.rotateAngleX + (float) Math.toRadians(xx), Rightthigh.rotateAngleY + (float) Math.toRadians(yy), Rightthigh.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 10 && tickAnim < 11) {
            xx = 0 + (((tickAnim - 10) / 1) * (0-(0)));
            yy = 0 + (((tickAnim - 10) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 1) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.Rightthigh.rotationPointX = this.Rightthigh.rotationPointX + (float)(xx);
        this.Rightthigh.rotationPointY = this.Rightthigh.rotationPointY - (float)(yy);
        this.Rightthigh.rotationPointZ = this.Rightthigh.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 23.18672 + (((tickAnim - 0) / 3) * (14.91396-(23.18672)));
            yy = 5.51738 + (((tickAnim - 0) / 3) * (9.65135-(5.51738)));
            zz = 5.14839 + (((tickAnim - 0) / 3) * (3.71133-(5.14839)));
        }
        else if (tickAnim >= 3 && tickAnim < 4) {
            xx = 14.91396 + (((tickAnim - 3) / 1) * (34.344-(14.91396)));
            yy = 9.65135 + (((tickAnim - 3) / 1) * (12.01361-(9.65135)));
            zz = 3.71133 + (((tickAnim - 3) / 1) * (2.89015-(3.71133)));
        }
        else if (tickAnim >= 4 && tickAnim < 7) {
            xx = 34.344 + (((tickAnim - 4) / 3) * (19.25654-(34.344)));
            yy = 12.01361 + (((tickAnim - 4) / 3) * (14.96645-(12.01361)));
            zz = 2.89015 + (((tickAnim - 4) / 3) * (1.86368-(2.89015)));
        }
        else if (tickAnim >= 7 && tickAnim < 10) {
            xx = 19.25654 + (((tickAnim - 7) / 3) * (-24.1056-(19.25654)));
            yy = 14.96645 + (((tickAnim - 7) / 3) * (19.69098-(14.96645)));
            zz = 1.86368 + (((tickAnim - 7) / 3) * (0.22132-(1.86368)));
        }
        else if (tickAnim >= 10 && tickAnim < 16) {
            xx = -24.1056 + (((tickAnim - 10) / 6) * (-6.04039-(-24.1056)));
            yy = 19.69098 + (((tickAnim - 10) / 6) * (4.96285-(19.69098)));
            zz = 0.22132 + (((tickAnim - 10) / 6) * (10.81183-(0.22132)));
        }
        else if (tickAnim >= 16 && tickAnim < 20) {
            xx = -6.04039 + (((tickAnim - 16) / 4) * (23.18672-(-6.04039)));
            yy = 4.96285 + (((tickAnim - 16) / 4) * (5.51738-(4.96285)));
            zz = 10.81183 + (((tickAnim - 16) / 4) * (5.14839-(10.81183)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Rightshin, Rightshin.rotateAngleX + (float) Math.toRadians(xx), Rightshin.rotateAngleY + (float) Math.toRadians(yy), Rightshin.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 3) {
            xx = -22.47314 + (((tickAnim - 0) / 3) * (33.9852-(-22.47314)));
            yy = -1.60667 + (((tickAnim - 0) / 3) * (-1.60667-(-1.60667)));
            zz = -1.91561 + (((tickAnim - 0) / 3) * (-1.91561-(-1.91561)));
        }
        else if (tickAnim >= 3 && tickAnim < 5) {
            xx = 33.9852 + (((tickAnim - 3) / 2) * (-4.36039-(33.9852)));
            yy = -1.60667 + (((tickAnim - 3) / 2) * (-1.60667-(-1.60667)));
            zz = -1.91561 + (((tickAnim - 3) / 2) * (-1.91561-(-1.91561)));
        }
        else if (tickAnim >= 5 && tickAnim < 7) {
            xx = -4.36039 + (((tickAnim - 5) / 2) * (-15.75745-(-4.36039)));
            yy = -1.60667 + (((tickAnim - 5) / 2) * (-1.60667-(-1.60667)));
            zz = -1.91561 + (((tickAnim - 5) / 2) * (-1.91561-(-1.91561)));
        }
        else if (tickAnim >= 7 && tickAnim < 10) {
            xx = -15.75745 + (((tickAnim - 7) / 3) * (37.52686-(-15.75745)));
            yy = -1.60667 + (((tickAnim - 7) / 3) * (-1.60667-(-1.60667)));
            zz = -1.91561 + (((tickAnim - 7) / 3) * (-1.91561-(-1.91561)));
        }
        else if (tickAnim >= 10 && tickAnim < 13) {
            xx = 37.52686 + (((tickAnim - 10) / 3) * (17.52686-(37.52686)));
            yy = -1.60667 + (((tickAnim - 10) / 3) * (-1.60667-(-1.60667)));
            zz = -1.91561 + (((tickAnim - 10) / 3) * (-1.91561-(-1.91561)));
        }
        else if (tickAnim >= 13 && tickAnim < 16) {
            xx = 17.52686 + (((tickAnim - 13) / 3) * (-4.80085-(17.52686)));
            yy = -1.60667 + (((tickAnim - 13) / 3) * (-3.19329-(-1.60667)));
            zz = -1.91561 + (((tickAnim - 13) / 3) * (-5.7724-(-1.91561)));
        }
        else if (tickAnim >= 16 && tickAnim < 20) {
            xx = -4.80085 + (((tickAnim - 16) / 4) * (-22.47314-(-4.80085)));
            yy = -3.19329 + (((tickAnim - 16) / 4) * (-1.60667-(-3.19329)));
            zz = -5.7724 + (((tickAnim - 16) / 4) * (-1.91561-(-5.7724)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Righthindfoot, Righthindfoot.rotateAngleX + (float) Math.toRadians(xx), Righthindfoot.rotateAngleY + (float) Math.toRadians(yy), Righthindfoot.rotateAngleZ + (float) Math.toRadians(zz));


    }

    public void animate(IAnimatedEntity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        EntityPrehistoricFloraMoschops e = (EntityPrehistoricFloraMoschops) entity;
        animator.update(entity);
        //this.resetToDefaultPose();
        setRotationAngles(f, f1, f2, f3, f4, f5, (Entity) entity);

        animator.setAnimation(e.ATTACK_ANIMATION); //20 ticks
        animator.startKeyframe(5);
        animator.rotate(this.Belly, (float) Math.toRadians(12.5), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(this.Front, (float) Math.toRadians(12.5), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(this.Leftupperarm, (float) Math.toRadians(15.0), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(this.Rightupperarm, (float) Math.toRadians(15.0), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(this.Leftlowerarm, (float) Math.toRadians(-12.2), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(this.Rightlowerarm, (float) Math.toRadians(-12.5), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(this.Neck, (float) Math.toRadians(45), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.endKeyframe();
        animator.setStaticKeyframe(5);
        animator.startKeyframe(5);
        animator.rotate(this.Belly, (float) Math.toRadians(-5), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(this.Front, (float) Math.toRadians(-5), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(this.Leftupperarm, (float) Math.toRadians(-5), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(this.Rightupperarm, (float) Math.toRadians(-5), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(this.Neck, (float) Math.toRadians(-10), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.endKeyframe();
        animator.setStaticKeyframe(1);
        animator.resetKeyframe(9);

        animator.setAnimation(e.EAT_ANIMATION); //10 ticks
        animator.startKeyframe(4);
        animator.rotate(this.Neck, (float) Math.toRadians(45), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(this.Head, (float) Math.toRadians(-5), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(this.Lowerjaw, (float) Math.toRadians(20), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.endKeyframe();
        animator.setStaticKeyframe(3);
        animator.resetKeyframe(3);

        animator.setAnimation(e.ROAR_ANIMATION);
        animator.startKeyframe(10);
        animator.rotate(this.Neck, (float) Math.toRadians(-15), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(this.Head, (float) Math.toRadians(-5), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(this.Lowerjaw, (float) Math.toRadians(20), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.endKeyframe();
        animator.setStaticKeyframe(10);
        animator.resetKeyframe(10);

        animator.setAnimation(e.LAY_ANIMATION); //50 ticks
        animator.startKeyframe(10);
        animator.move(this.Hips, 0 , 5,0);
        animator.rotate(this.Tail1, (float) Math.toRadians(55), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(this.Leftthigh, (float) Math.toRadians(-25), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(this.Rightthigh, (float) Math.toRadians(-25), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(this.Leftshin, (float) Math.toRadians(50), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(this.Rightshin, (float) Math.toRadians(50), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(this.Hips, (float) Math.toRadians(-28), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.endKeyframe();
        animator.setStaticKeyframe(30);
        animator.resetKeyframe(10);
    }
}
