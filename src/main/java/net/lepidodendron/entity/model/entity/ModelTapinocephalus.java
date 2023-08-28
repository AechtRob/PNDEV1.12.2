package net.lepidodendron.entity.model.entity;

import net.ilexiconn.llibrary.client.model.ModelAnimator;
import net.ilexiconn.llibrary.server.animation.IAnimatedEntity;
import net.lepidodendron.entity.EntityPrehistoricFloraTapinocephalus;
import net.lepidodendron.entity.model.llibraryextensions.AdvancedModelBaseExtended;
import net.lepidodendron.entity.model.llibraryextensions.AdvancedModelRendererExtended;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;

public class ModelTapinocephalus extends AdvancedModelBaseExtended {
    public AdvancedModelRendererExtended Hips;
    public AdvancedModelRendererExtended Belly;
    public AdvancedModelRendererExtended Tail1;
    public AdvancedModelRendererExtended Leftthigh;
    public AdvancedModelRendererExtended Rightthigh;
    public AdvancedModelRendererExtended Front;
    public AdvancedModelRendererExtended Neck;
    public AdvancedModelRendererExtended Leftupperarm;
    public AdvancedModelRendererExtended Rightupperarm;
    public AdvancedModelRendererExtended Head;
    public AdvancedModelRendererExtended Lowerjaw;
    public AdvancedModelRendererExtended Upperjaw;
    public AdvancedModelRendererExtended Headslope;
    public AdvancedModelRendererExtended Domebase;
    public AdvancedModelRendererExtended Dome;
    public AdvancedModelRendererExtended Domefront;
    public AdvancedModelRendererExtended Leftlowerarm;
    public AdvancedModelRendererExtended Leftfrontfoot;
    public AdvancedModelRendererExtended Rightlowerarm;
    public AdvancedModelRendererExtended Rightfrontfoot;
    public AdvancedModelRendererExtended Tail2;
    public AdvancedModelRendererExtended Tail3;
    public AdvancedModelRendererExtended Leftshin;
    public AdvancedModelRendererExtended Lefthindfoot;
    public AdvancedModelRendererExtended Rightshin;
    public AdvancedModelRendererExtended Righthindfoot;

    private ModelAnimator animator;

    public ModelTapinocephalus() {
        this.textureWidth = 100;
        this.textureHeight = 100;
        this.Leftupperarm = new AdvancedModelRendererExtended(this, 43, 69);
        this.Leftupperarm.setRotationPoint(4.0F, 10.899999618530273F, -5.5F);
        this.Leftupperarm.addBox(-2.0F, -1.5F, -3.0F, 5, 9, 6, 0.0F);
        this.setRotateAngle(Leftupperarm, 0.7005751510978795F, 0.0F, -0.67928211291826F);
        this.Lefthindfoot = new AdvancedModelRendererExtended(this, 48, 6);
        this.Lefthindfoot.setRotationPoint(0.0F, 6.0F, 2.0F);
        this.Lefthindfoot.addBox(-2.5F, 0.0F, -5.0F, 5, 2, 7, 0.0F);
        this.setRotateAngle(Lefthindfoot, -0.04241150198859518F, 0.0F, 0.0F);
        this.Leftshin = new AdvancedModelRendererExtended(this, 76, 39);
        this.Leftshin.setRotationPoint(0.4000000059604645F, 5.5F, -0.800000011920929F);
        this.Leftshin.addBox(-2.0F, 0.0F, -1.0F, 4, 7, 5, 0.0F);
        this.setRotateAngle(Leftshin, 0.46705011182842415F, 0.0F, 0.38205256260891435F);
        this.Rightthigh = new AdvancedModelRendererExtended(this, 68, 52);
        this.Rightthigh.setRotationPoint(-4.0F, 5.400000095367432F, 0.0F);
        this.Rightthigh.addBox(-3.0F, -1.5F, -2.5F, 5, 8, 6, 0.0F);
        this.setRotateAngle(Rightthigh, -0.06370451936226872F, 0.0F, 0.36093409463874954F);
        this.Tail2 = new AdvancedModelRendererExtended(this, 55, 16);
        this.Tail2.setRotationPoint(0.0F, -0.20000000298023224F, 6.5F);
        this.Tail2.addBox(-1.5F, -0.5F, -0.5F, 3, 3, 5, 0.0F);
        this.setRotateAngle(Tail2, -0.33964105645913F, 0.0F, 0.0F);
        this.Tail3 = new AdvancedModelRendererExtended(this, 38, 2);
        this.Tail3.setRotationPoint(0.0F, 0.30000001192092896F, 4.0F);
        this.Tail3.addBox(-1.0F, -0.5F, -0.5F, 2, 2, 6, 0.0F);
        this.setRotateAngle(Tail3, 0.021293017373673524F, 0.0F, 0.0F);
        this.Leftthigh = new AdvancedModelRendererExtended(this, 66, 67);
        this.Leftthigh.setRotationPoint(4.0F, 5.400000095367432F, 0.0F);
        this.Leftthigh.addBox(-2.0F, -1.5F, -2.5F, 5, 8, 6, 0.0F);
        this.setRotateAngle(Leftthigh, -0.06370451936226872F, 0.0F, -0.36093409463874954F);
        this.Lowerjaw = new AdvancedModelRendererExtended(this, 78, 19);
        this.Lowerjaw.setRotationPoint(0.0F, 1.75F, -4.849999904632568F);
        this.Lowerjaw.addBox(-2.5F, 0.0F, -4.0F, 5, 2, 4, 0.0F);
        this.setRotateAngle(Lowerjaw, 0.2546435405291338F, 0.0F, 0.0F);
        this.Righthindfoot = new AdvancedModelRendererExtended(this, 68, 9);
        this.Righthindfoot.setRotationPoint(0.0F, 6.0F, 2.0F);
        this.Righthindfoot.addBox(-2.5F, 0.0F, -5.0F, 5, 2, 7, 0.0F);
        this.setRotateAngle(Righthindfoot, -0.04241150198859518F, 0.0F, 0.0F);
        this.Rightshin = new AdvancedModelRendererExtended(this, 43, 24);
        this.Rightshin.setRotationPoint(-0.4000000059604645F, 5.5F, -0.800000011920929F);
        this.Rightshin.addBox(-2.0F, 0.0F, -1.0F, 4, 7, 5, 0.0F);
        this.setRotateAngle(Rightshin, 0.46705011182842415F, 0.0F, -0.38205256260891435F);
        this.Domebase = new AdvancedModelRendererExtended(this, 17, 8);
        this.Domebase.setRotationPoint(0.0F, -3.0F, -1.899999976158142F);
        this.Domebase.addBox(-1.5F, 0.0F, -4.0F, 3, 2, 4, 0.0F);
        this.setRotateAngle(Domebase, -0.08482300397719036F, 0.0F, 0.0F);
        this.Dome = new AdvancedModelRendererExtended(this, 49, 0);
        this.Dome.setRotationPoint(0.009999999776482582F, 0.0F, -4.0F);
        this.Dome.addBox(-1.5F, 0.0F, -2.0F, 3, 2, 2, 0.0F);
        this.setRotateAngle(Dome, 0.7641051252178287F, 0.0F, 0.0F);
        this.Domefront = new AdvancedModelRendererExtended(this, 28, 8);
        this.Domefront.setRotationPoint(-0.009999999776482582F, 0.0F, -2.0F);
        this.Domefront.addBox(-1.5F, 0.0F, -2.0F, 3, 1, 2, 0.0F);
        this.setRotateAngle(Domefront, 1.018923235956417F, 0.0F, 0.0F);
        this.Rightupperarm = new AdvancedModelRendererExtended(this, 45, 53);
        this.Rightupperarm.setRotationPoint(-4.0F, 10.899999618530273F, -5.5F);
        this.Rightupperarm.addBox(-3.0F, -1.5F, -3.0F, 5, 9, 6, 0.0F);
        this.setRotateAngle(Rightupperarm, 0.7005751510978795F, 0.0F, 0.67928211291826F);
        this.Front = new AdvancedModelRendererExtended(this, 0, 41);
        this.Front.setRotationPoint(0.0F, 0.10000000149011612F, -14.0F);
        this.Front.addBox(-5.5F, -2.0F, -10.5F, 11, 16, 11, 0.0F);
        this.setRotateAngle(Front, 0.1485275233394591F, 0.0F, 0.0F);
        this.Belly = new AdvancedModelRendererExtended(this, 0, 69);
        this.Belly.setRotationPoint(0.0F, 0.0F, -4.5F);
        this.Belly.addBox(-6.5F, -2.0F, -14.5F, 13, 16, 15, 0.0F);
        this.setRotateAngle(Belly, 0.04241150198859518F, 0.0F, 0.0F);
        this.Neck = new AdvancedModelRendererExtended(this, 59, 82);
        this.Neck.setRotationPoint(0.0F, -0.5F, -8.800000190734863F);
        this.Neck.addBox(-3.0F, -1.0F, -8.0F, 6, 8, 9, 0.0F);
        this.setRotateAngle(Neck, -0.12740903872453743F, 0.0F, 0.0F);
        this.Headslope = new AdvancedModelRendererExtended(this, 1, 0);
        this.Headslope.setRotationPoint(0.0F, -1.7000000476837158F, -5.900000095367432F);
        this.Headslope.addBox(-2.0F, 0.0F, -4.0F, 4, 2, 5, 0.0F);
        this.setRotateAngle(Headslope, 0.67928211291826F, 0.0F, 0.0F);
        this.Upperjaw = new AdvancedModelRendererExtended(this, 20, 0);
        this.Upperjaw.setRotationPoint(0.0F, -0.4000000059604645F, -4.5F);
        this.Upperjaw.addBox(-2.5F, 0.0F, -5.0F, 5, 2, 5, 0.0F);
        this.setRotateAngle(Upperjaw, 0.2546435405291338F, 0.0F, 0.0F);
        this.Rightlowerarm = new AdvancedModelRendererExtended(this, 57, 38);
        this.Rightlowerarm.setRotationPoint(-0.5F, 7.0F, 1.5F);
        this.Rightlowerarm.addBox(-2.0F, -1.0F, -4.0F, 4, 9, 5, 0.0F);
        this.setRotateAngle(Rightlowerarm, -0.40334560078853393F, -0.31834805156902407F, -0.5942845969882637F);
        this.Head = new AdvancedModelRendererExtended(this, 62, 26);
        this.Head.setRotationPoint(0.009999999776482582F, 1.399999976158142F, -6.0F);
        this.Head.addBox(-3.5F, -3.0F, -5.0F, 7, 7, 5, 0.0F);
        this.setRotateAngle(Head, 0.4881685797985891F, 0.0F, 0.0F);
        this.Hips = new AdvancedModelRendererExtended(this, 0, 18);
        this.Hips.setRotationPoint(0.0F, 6.8F, 13.5F);
        this.Hips.addBox(-5.0F, -1.5F, -5.0F, 10, 12, 11, 0.0F);
        this.setRotateAngle(Hips, -0.3609340893124273F, 0.0F, 0.0F);
        this.Leftlowerarm = new AdvancedModelRendererExtended(this, 38, 37);
        this.Leftlowerarm.setRotationPoint(0.5F, 7.0F, 1.5F);
        this.Leftlowerarm.addBox(-2.0F, -1.0F, -4.0F, 4, 9, 5, 0.0F);
        this.setRotateAngle(Leftlowerarm, -0.40334560078853393F, 0.31834805156902407F, 0.5942845969882637F);
        this.Leftfrontfoot = new AdvancedModelRendererExtended(this, 66, 0);
        this.Leftfrontfoot.setRotationPoint(0.0F, 7.199999809265137F, -0.6000000238418579F);
        this.Leftfrontfoot.addBox(-2.5F, 0.0F, -4.5F, 5, 2, 6, 0.0F);
        this.Rightfrontfoot = new AdvancedModelRendererExtended(this, 0, 9);
        this.Rightfrontfoot.setRotationPoint(0.0F, 7.199999809265137F, -0.6000000238418579F);
        this.Rightfrontfoot.addBox(-2.5F, 0.0F, -4.5F, 5, 2, 6, 0.0F);
        this.Tail1 = new AdvancedModelRendererExtended(this, 31, 12);
        this.Tail1.setRotationPoint(0.0F, 0.0F, 4.699999809265137F);
        this.Tail1.addBox(-2.5F, -1.0F, -0.5F, 5, 5, 7, 0.0F);
        this.setRotateAngle(Tail1, -0.4457571069383183F, 0.0F, 0.0F);
        this.Front.addChild(this.Leftupperarm);
        this.Leftshin.addChild(this.Lefthindfoot);
        this.Leftthigh.addChild(this.Leftshin);
        this.Hips.addChild(this.Rightthigh);
        this.Tail1.addChild(this.Tail2);
        this.Tail2.addChild(this.Tail3);
        this.Hips.addChild(this.Leftthigh);
        this.Head.addChild(this.Lowerjaw);
        this.Rightshin.addChild(this.Righthindfoot);
        this.Rightthigh.addChild(this.Rightshin);
        this.Head.addChild(this.Domebase);
        this.Domebase.addChild(this.Dome);
        this.Dome.addChild(this.Domefront);
        this.Front.addChild(this.Rightupperarm);
        this.Belly.addChild(this.Front);
        this.Hips.addChild(this.Belly);
        this.Front.addChild(this.Neck);
        this.Head.addChild(this.Headslope);
        this.Head.addChild(this.Upperjaw);
        this.Rightupperarm.addChild(this.Rightlowerarm);
        this.Neck.addChild(this.Head);
        this.Leftupperarm.addChild(this.Leftlowerarm);
        this.Leftlowerarm.addChild(this.Leftfrontfoot);
        this.Rightlowerarm.addChild(this.Rightfrontfoot);
        this.Hips.addChild(this.Tail1);

        updateDefaultPose();
        animator = ModelAnimator.create();
    }

    @Override
    public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        animate((IAnimatedEntity) entity, f, f1, f2, f3, f4, f5);
        this.Hips.render(f5);
    }
    
    public void renderStaticWall(float f) {
        this.Neck.offsetY = -0.02F;
        this.Neck.render(0.01F);
        resetToDefaultPose();
    }
    
    public void renderStaticFloor(float f) {
        this.setRotateAngle(Tail1, 0.06370451936226872F, 0.21223203437934937F, 0.0F);
        this.setRotateAngle(Rightfrontfoot, 0.1485275233394591F, 0.4881685797985891F, 0.0F);
        this.setRotateAngle(Hips, -0.4457571069383183F, (float) Math.toRadians(90), 0.0F);
        this.setRotateAngle(Leftthigh, 0.10611601718967469F, 0.0F, -0.42446406875869874F);
        this.setRotateAngle(Righthindfoot, -0.12740903872453743F, 0.0F, -0.08482300397719036F);
        this.setRotateAngle(Leftupperarm, 0.9128071854772289F, 0.42446406875869874F, -0.67928211291826F);
        this.setRotateAngle(Rightshin, 0.23352505591421208F, 0.0F, -0.38205256260891435F);
        this.setRotateAngle(Rightupperarm, 0.21223203437934937F, -0.27593656206399647F, 0.9339256534473936F);
        this.setRotateAngle(Head, 0.6579891413176677F, 0.0F, 0.0F);
        this.setRotateAngle(Leftshin, 0.33964105645913F, 0.0F, 0.38205256260891435F);
        this.setRotateAngle(Belly, 0.1911135497644277F, 0.0F, 0.0F);
        this.setRotateAngle(Leftlowerarm, -0.40334560078853393F, 0.31834805156902407F, 0.5942845969882637F);
        this.setRotateAngle(Tail2, 0.0F, 0.23352505591421208F, 0.0F);
        this.setRotateAngle(Rightthigh, 0.8915142138766367F, -0.10611601718967469F, 0.46705011182842415F);
        this.setRotateAngle(Front, 0.36093409463874954F, 0.0F, 0.0F);
        this.setRotateAngle(Domebase, -0.08482300397719036F, 0.0F, 0.0F);
        this.setRotateAngle(Domefront, 1.018923235956417F, 0.0F, 0.0F);
        this.setRotateAngle(Leftfrontfoot, 0.33964105645913F, 0.0F, 0.0F);
        this.setRotateAngle(Neck, 0.169820528229565F, 0.0F, 0.0F);
        this.setRotateAngle(Rightlowerarm, -0.67928211291826F, -0.46705011182842415F, -0.5942845969882637F);
        this.setRotateAngle(Headslope, 0.67928211291826F, 0.0F, 0.0F);
        this.setRotateAngle(Upperjaw, 0.2546435405291338F, 0.0F, 0.0F);
        this.setRotateAngle(Tail3, 0.08482300397719036F, 0.5094616179782085F, 0.0F);
        this.setRotateAngle(Dome, 0.7641051252178287F, 0.0F, 0.0F);
        this.setRotateAngle(Lowerjaw, 0.7216936190680444F, 0.0F, 0.0F);
        this.setRotateAngle(Lefthindfoot, 0.021293017373673524F, 0.0F, 0.0F);
        this.Hips.offsetX = 0.13F;
        this.Hips.offsetZ = -0.13F;
        this.Hips.offsetY = -0.155F;
        this.Hips.render(0.01F);
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
        this.Hips.offsetY = 0.0F;
        this.Hips.offsetZ = 0.3F;

        EntityPrehistoricFloraTapinocephalus Tapinocephalus = (EntityPrehistoricFloraTapinocephalus) e;
        float masterSpeed = Tapinocephalus.getTravelSpeed();

        this.faceTarget(f3, f4, 2, Neck);
        this.faceTarget(f3, f4, 4, Head);

        AdvancedModelRendererExtended[] Tail = {this.Tail1, this.Tail2, this.Tail3};

        // || (Tapinocephalus.moveStrafing == 0 && Tapinocephalus.moveVertical == 0 && Tapinocephalus.moveForward == 0)

        if (Tapinocephalus.getAnimation() == Tapinocephalus.LAY_ANIMATION) {
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

        if (f3 == 0.0F || !Tapinocephalus.getIsMoving()) { //Not moving
            this.swing(Neck, 0.06F, 0.10F, false, 0.5F,-0.05F, f2, 0.8F);
            this.walk(Neck, 0.06F * 2F, -0.02F, false, 0.5F,0.01F, f2, 0.8F);
            this.chainFlap(Tail, (0.06F*0.9F), 0.10F, 0.10F, f2, 1F);
            this.chainSwing(Tail, (0.06F*0.9F) * 2F, 0.05F, 0.06F, f2, 1F);
            return;
        }

        //float speed = masterSpeed / 2.625F;
//        float speed = masterSpeed / 2.225F;
//        if (Tapinocephalus.getIsFast()) {
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
        EntityPrehistoricFloraTapinocephalus ee = (EntityPrehistoricFloraTapinocephalus) entitylivingbaseIn;

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
        EntityPrehistoricFloraTapinocephalus entity = (EntityPrehistoricFloraTapinocephalus) entitylivingbaseIn;
        int animCycle = 60;
        double tickAnim = (entity.ticksExisted + entity.getTickOffset()) - (int) (Math.floor((double) (entity.ticksExisted + entity.getTickOffset()) / (double) animCycle) * (double) animCycle) + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;

//        this.root.rotationPointX = this.root.rotationPointX + (float)(0);
//        this.root.rotationPointY = this.root.rotationPointY - (float)(-1);
//        this.root.rotationPointZ = this.root.rotationPointZ + (float)(0);

        this.setRotateAngle(Hips, Hips.rotateAngleX + (float) Math.toRadians(0), Hips.rotateAngleY + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*120-30))*1), Hips.rotateAngleZ + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*120-50))*6));

        if (tickAnim >= 0 && tickAnim < 12) {
            xx = 0 + (((tickAnim - 0) / 12) * (0-(0)));
            yy = -0.25 + (((tickAnim - 0) / 12) * (0-(-0.25)));
            zz = 0 + (((tickAnim - 0) / 12) * (-1.75-(0)));
        }
        else if (tickAnim >= 12 && tickAnim < 19) {
            xx = 0 + (((tickAnim - 12) / 7) * (0-(0)));
            yy = 0 + (((tickAnim - 12) / 7) * (0-(0)));
            zz = -1.75 + (((tickAnim - 12) / 7) * (-1.75-(-1.75)));
        }
        else if (tickAnim >= 19 && tickAnim < 30) {
            xx = 0 + (((tickAnim - 19) / 11) * (0-(0)));
            yy = 0 + (((tickAnim - 19) / 11) * (-0.25-(0)));
            zz = -1.75 + (((tickAnim - 19) / 11) * (0-(-1.75)));
        }
        else if (tickAnim >= 30 && tickAnim < 42) {
            xx = 0 + (((tickAnim - 30) / 12) * (0-(0)));
            yy = -0.25 + (((tickAnim - 30) / 12) * (0-(-0.25)));
            zz = 0 + (((tickAnim - 30) / 12) * (-1.75-(0)));
        }
        else if (tickAnim >= 42 && tickAnim < 49) {
            xx = 0 + (((tickAnim - 42) / 7) * (0-(0)));
            yy = 0 + (((tickAnim - 42) / 7) * (0-(0)));
            zz = -1.75 + (((tickAnim - 42) / 7) * (-1.75-(-1.75)));
        }
        else if (tickAnim >= 49 && tickAnim < 60) {
            xx = 0 + (((tickAnim - 49) / 11) * (0-(0)));
            yy = 0 + (((tickAnim - 49) / 11) * (-0.25-(0)));
            zz = -1.75 + (((tickAnim - 49) / 11) * (0-(-1.75)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.Hips.rotationPointX = this.Hips.rotationPointX + (float)(xx);
        this.Hips.rotationPointY = this.Hips.rotationPointY - (float)(yy);
        this.Hips.rotationPointZ = this.Hips.rotationPointZ + (float)(zz);



        this.setRotateAngle(Belly, Belly.rotateAngleX + (float) Math.toRadians(0), Belly.rotateAngleY + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*120-90))*-2), Belly.rotateAngleZ + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*120-30))*-4));


        this.setRotateAngle(Front, Front.rotateAngleX + (float) Math.toRadians(0), Front.rotateAngleY + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*120-30))*2), Front.rotateAngleZ + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*120-50))*-2));


        this.setRotateAngle(Neck, Neck.rotateAngleX + (float) Math.toRadians(0), Neck.rotateAngleY + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*120-90))*-2), Neck.rotateAngleZ + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*120-30))*-4));


        this.setRotateAngle(Lowerjaw, Lowerjaw.rotateAngleX + (float) Math.toRadians(2+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*120))*2), Lowerjaw.rotateAngleY + (float) Math.toRadians(0), Lowerjaw.rotateAngleZ + (float) Math.toRadians(0));



        if (tickAnim >= 0 && tickAnim < 23) {
            xx = 11.95982 + (((tickAnim - 0) / 23) * (-42.27795-(11.95982)));
            yy = 11.93597 + (((tickAnim - 0) / 23) * (1.33509-(11.93597)));
            zz = -1.96321 + (((tickAnim - 0) / 23) * (-9.10709-(-1.96321)));
        }
        else if (tickAnim >= 23 && tickAnim < 30) {
            xx = -42.27795 + (((tickAnim - 23) / 7) * (-42.14997-(-42.27795)));
            yy = 1.33509 + (((tickAnim - 23) / 7) * (-19.74299-(1.33509)));
            zz = -9.10709 + (((tickAnim - 23) / 7) * (11.87695-(-9.10709)));
        }
        else if (tickAnim >= 30 && tickAnim < 60) {
            xx = -42.14997 + (((tickAnim - 30) / 30) * (11.95982-(-42.14997)));
            yy = -19.74299 + (((tickAnim - 30) / 30) * (11.93597-(-19.74299)));
            zz = 11.87695 + (((tickAnim - 30) / 30) * (-1.96321-(11.87695)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Leftupperarm, Leftupperarm.rotateAngleX + (float) Math.toRadians(xx), Leftupperarm.rotateAngleY + (float) Math.toRadians(yy), Leftupperarm.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 45) {
            xx = 0 + (((tickAnim - 0) / 45) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 45) * (0.3-(0)));
            zz = 0 + (((tickAnim - 0) / 45) * (0-(0)));
        }
        else if (tickAnim >= 45 && tickAnim < 60) {
            xx = 0 + (((tickAnim - 45) / 15) * (0-(0)));
            yy = 0.3 + (((tickAnim - 45) / 15) * (0-(0.3)));
            zz = 0 + (((tickAnim - 45) / 15) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.Leftupperarm.rotationPointX = this.Leftupperarm.rotationPointX + (float)(xx);
        this.Leftupperarm.rotationPointY = this.Leftupperarm.rotationPointY - (float)(yy);
        this.Leftupperarm.rotationPointZ = this.Leftupperarm.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 4) {
            xx = 2.5 + (((tickAnim - 0) / 4) * (-28.24577-(2.5)));
            yy = 0 + (((tickAnim - 0) / 4) * (-1.33732-(0)));
            zz = 0 + (((tickAnim - 0) / 4) * (-0.10486-(0)));
        }
        else if (tickAnim >= 4 && tickAnim < 8) {
            xx = -28.24577 + (((tickAnim - 4) / 4) * (-34.39558-(-28.24577)));
            yy = -1.33732 + (((tickAnim - 4) / 4) * (-0.28197-(-1.33732)));
            zz = -0.10486 + (((tickAnim - 4) / 4) * (-1.30435-(-0.10486)));
        }
        else if (tickAnim >= 8 && tickAnim < 23) {
            xx = -34.39558 + (((tickAnim - 8) / 15) * (-20.83719-(-34.39558)));
            yy = -0.28197 + (((tickAnim - 8) / 15) * (2.61026-(-0.28197)));
            zz = -1.30435 + (((tickAnim - 8) / 15) * (-8.21017-(-1.30435)));
        }
        else if (tickAnim >= 23 && tickAnim < 30) {
            xx = -20.83719 + (((tickAnim - 23) / 7) * (-3.70509-(-20.83719)));
            yy = 2.61026 + (((tickAnim - 23) / 7) * (9.4144-(2.61026)));
            zz = -8.21017 + (((tickAnim - 23) / 7) * (-3.5842-(-8.21017)));
        }
        else if (tickAnim >= 30 && tickAnim < 43) {
            xx = -3.70509 + (((tickAnim - 30) / 13) * (-10.2109-(-3.70509)));
            yy = 9.4144 + (((tickAnim - 30) / 13) * (5.27804-(9.4144)));
            zz = -3.5842 + (((tickAnim - 30) / 13) * (-1.29749-(-3.5842)));
        }
        else if (tickAnim >= 43 && tickAnim < 53) {
            xx = -10.2109 + (((tickAnim - 43) / 10) * (-2.74484-(-10.2109)));
            yy = 5.27804 + (((tickAnim - 43) / 10) * (2.67067-(5.27804)));
            zz = -1.29749 + (((tickAnim - 43) / 10) * (-0.67472-(-1.29749)));
        }
        else if (tickAnim >= 53 && tickAnim < 55) {
            xx = -2.74484 + (((tickAnim - 53) / 2) * (3.96899-(-2.74484)));
            yy = 2.67067 + (((tickAnim - 53) / 2) * (2.03501-(2.67067)));
            zz = -0.67472 + (((tickAnim - 53) / 2) * (-0.54393-(-0.67472)));
        }
        else if (tickAnim >= 55 && tickAnim < 60) {
            xx = 3.96899 + (((tickAnim - 55) / 5) * (2.5-(3.96899)));
            yy = 2.03501 + (((tickAnim - 55) / 5) * (0-(2.03501)));
            zz = -0.54393 + (((tickAnim - 55) / 5) * (0-(-0.54393)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Leftlowerarm, Leftlowerarm.rotateAngleX + (float) Math.toRadians(xx), Leftlowerarm.rotateAngleY + (float) Math.toRadians(yy), Leftlowerarm.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 10 + (((tickAnim - 0) / 3) * (-11.38662-(10)));
            yy = 0 + (((tickAnim - 0) / 3) * (-1.33592-(0)));
            zz = 0 + (((tickAnim - 0) / 3) * (1.96153-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 8) {
            xx = -11.38662 + (((tickAnim - 3) / 5) * (20.80918-(-11.38662)));
            yy = -1.33592 + (((tickAnim - 3) / 5) * (0.01086-(-1.33592)));
            zz = 1.96153 + (((tickAnim - 3) / 5) * (6.53729-(1.96153)));
        }
        else if (tickAnim >= 8 && tickAnim < 23) {
            xx = 20.80918 + (((tickAnim - 8) / 15) * (30.86081-(20.80918)));
            yy = 0.01086 + (((tickAnim - 8) / 15) * (-20-(0.01086)));
            zz = 6.53729 + (((tickAnim - 8) / 15) * (5.81358-(6.53729)));
        }
        else if (tickAnim >= 23 && tickAnim < 30) {
            xx = 30.86081 + (((tickAnim - 23) / 7) * (44.38763-(30.86081)));
            yy = -20 + (((tickAnim - 23) / 7) * (-2-(-20)));
            zz = 5.81358 + (((tickAnim - 23) / 7) * (-5-(5.81358)));
        }
        else if (tickAnim >= 30 && tickAnim < 38) {
            xx = 44.38763 + (((tickAnim - 30) / 8) * (40.00918-(44.38763)));
            yy = -2 + (((tickAnim - 30) / 8) * (-6.64007-(-2)));
            zz = -5 + (((tickAnim - 30) / 8) * (-5.74651-(-5)));
        }
        else if (tickAnim >= 38 && tickAnim < 43) {
            xx = 40.00918 + (((tickAnim - 38) / 5) * (29.18308-(40.00918)));
            yy = -6.64007 + (((tickAnim - 38) / 5) * (-4.95577-(-6.64007)));
            zz = -5.74651 + (((tickAnim - 38) / 5) * (-4.52209-(-5.74651)));
        }
        else if (tickAnim >= 43 && tickAnim < 53) {
            xx = 29.18308 + (((tickAnim - 43) / 10) * (2.38086-(29.18308)));
            yy = -4.95577 + (((tickAnim - 43) / 10) * (-2.93309-(-4.95577)));
            zz = -4.52209 + (((tickAnim - 43) / 10) * (-1.91551-(-4.52209)));
        }
        else if (tickAnim >= 53 && tickAnim < 55) {
            xx = 2.38086 + (((tickAnim - 53) / 2) * (-8.06366-(2.38086)));
            yy = -2.93309 + (((tickAnim - 53) / 2) * (-2.55774-(-2.93309)));
            zz = -1.91551 + (((tickAnim - 53) / 2) * (-0.7568-(-1.91551)));
        }
        else if (tickAnim >= 55 && tickAnim < 60) {
            xx = -8.06366 + (((tickAnim - 55) / 5) * (10-(-8.06366)));
            yy = -2.55774 + (((tickAnim - 55) / 5) * (0-(-2.55774)));
            zz = -0.7568 + (((tickAnim - 55) / 5) * (0-(-0.7568)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Leftfrontfoot, Leftfrontfoot.rotateAngleX + (float) Math.toRadians(xx), Leftfrontfoot.rotateAngleY + (float) Math.toRadians(yy), Leftfrontfoot.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 30) {
            xx = -42.14997 + (((tickAnim - 0) / 30) * (11.95982-(-42.14997)));
            yy = 19.74299 + (((tickAnim - 0) / 30) * (-11.93597-(19.74299)));
            zz = -11.87695 + (((tickAnim - 0) / 30) * (1.96321-(-11.87695)));
        }
        else if (tickAnim >= 30 && tickAnim < 53) {
            xx = 11.95982 + (((tickAnim - 30) / 23) * (-42.27795-(11.95982)));
            yy = -11.93597 + (((tickAnim - 30) / 23) * (-1.33509-(-11.93597)));
            zz = 1.96321 + (((tickAnim - 30) / 23) * (9.10709-(1.96321)));
        }
        else if (tickAnim >= 53 && tickAnim < 60) {
            xx = -42.27795 + (((tickAnim - 53) / 7) * (-42.14997-(-42.27795)));
            yy = -1.33509 + (((tickAnim - 53) / 7) * (19.74299-(-1.33509)));
            zz = 9.10709 + (((tickAnim - 53) / 7) * (-11.87695-(9.10709)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Rightupperarm, Rightupperarm.rotateAngleX + (float) Math.toRadians(xx), Rightupperarm.rotateAngleY + (float) Math.toRadians(yy), Rightupperarm.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 0) / 15) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 15) * (0.3-(0)));
            zz = 0 + (((tickAnim - 0) / 15) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 60) {
            xx = 0 + (((tickAnim - 15) / 45) * (0-(0)));
            yy = 0.3 + (((tickAnim - 15) / 45) * (0-(0.3)));
            zz = 0 + (((tickAnim - 15) / 45) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.Rightupperarm.rotationPointX = this.Rightupperarm.rotationPointX + (float)(xx);
        this.Rightupperarm.rotationPointY = this.Rightupperarm.rotationPointY - (float)(yy);
        this.Rightupperarm.rotationPointZ = this.Rightupperarm.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 13) {
            xx = -3.70509 + (((tickAnim - 0) / 13) * (-10.2109-(-3.70509)));
            yy = -9.4144 + (((tickAnim - 0) / 13) * (-5.27804-(-9.4144)));
            zz = 3.5842 + (((tickAnim - 0) / 13) * (1.29749-(3.5842)));
        }
        else if (tickAnim >= 13 && tickAnim < 23) {
            xx = -10.2109 + (((tickAnim - 13) / 10) * (-2.74484-(-10.2109)));
            yy = -5.27804 + (((tickAnim - 13) / 10) * (-2.67067-(-5.27804)));
            zz = 1.29749 + (((tickAnim - 13) / 10) * (0.67472-(1.29749)));
        }
        else if (tickAnim >= 23 && tickAnim < 25) {
            xx = -2.74484 + (((tickAnim - 23) / 2) * (3.96899-(-2.74484)));
            yy = -2.67067 + (((tickAnim - 23) / 2) * (-2.03501-(-2.67067)));
            zz = 0.67472 + (((tickAnim - 23) / 2) * (0.54393-(0.67472)));
        }
        else if (tickAnim >= 25 && tickAnim < 30) {
            xx = 3.96899 + (((tickAnim - 25) / 5) * (2.5-(3.96899)));
            yy = -2.03501 + (((tickAnim - 25) / 5) * (0-(-2.03501)));
            zz = 0.54393 + (((tickAnim - 25) / 5) * (0-(0.54393)));
        }
        else if (tickAnim >= 30 && tickAnim < 34) {
            xx = 2.5 + (((tickAnim - 30) / 4) * (-28.24577-(2.5)));
            yy = 0 + (((tickAnim - 30) / 4) * (1.33732-(0)));
            zz = 0 + (((tickAnim - 30) / 4) * (0.10486-(0)));
        }
        else if (tickAnim >= 34 && tickAnim < 38) {
            xx = -28.24577 + (((tickAnim - 34) / 4) * (-34.39558-(-28.24577)));
            yy = 1.33732 + (((tickAnim - 34) / 4) * (0.28197-(1.33732)));
            zz = 0.10486 + (((tickAnim - 34) / 4) * (1.30435-(0.10486)));
        }
        else if (tickAnim >= 38 && tickAnim < 53) {
            xx = -34.39558 + (((tickAnim - 38) / 15) * (-20.83719-(-34.39558)));
            yy = 0.28197 + (((tickAnim - 38) / 15) * (-2.61026-(0.28197)));
            zz = 1.30435 + (((tickAnim - 38) / 15) * (8.21017-(1.30435)));
        }
        else if (tickAnim >= 53 && tickAnim < 60) {
            xx = -20.83719 + (((tickAnim - 53) / 7) * (-3.70509-(-20.83719)));
            yy = -2.61026 + (((tickAnim - 53) / 7) * (-9.4144-(-2.61026)));
            zz = 8.21017 + (((tickAnim - 53) / 7) * (3.5842-(8.21017)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Rightlowerarm, Rightlowerarm.rotateAngleX + (float) Math.toRadians(xx), Rightlowerarm.rotateAngleY + (float) Math.toRadians(yy), Rightlowerarm.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 8) {
            xx = 44.38763 + (((tickAnim - 0) / 8) * (40.00918-(44.38763)));
            yy = 2 + (((tickAnim - 0) / 8) * (6.64007-(2)));
            zz = 5 + (((tickAnim - 0) / 8) * (5.74651-(5)));
        }
        else if (tickAnim >= 8 && tickAnim < 13) {
            xx = 40.00918 + (((tickAnim - 8) / 5) * (29.18308-(40.00918)));
            yy = 6.64007 + (((tickAnim - 8) / 5) * (4.95577-(6.64007)));
            zz = 5.74651 + (((tickAnim - 8) / 5) * (4.52209-(5.74651)));
        }
        else if (tickAnim >= 13 && tickAnim < 23) {
            xx = 29.18308 + (((tickAnim - 13) / 10) * (2.38086-(29.18308)));
            yy = 4.95577 + (((tickAnim - 13) / 10) * (2.93309-(4.95577)));
            zz = 4.52209 + (((tickAnim - 13) / 10) * (1.91551-(4.52209)));
        }
        else if (tickAnim >= 23 && tickAnim < 25) {
            xx = 2.38086 + (((tickAnim - 23) / 2) * (-8.06366-(2.38086)));
            yy = 2.93309 + (((tickAnim - 23) / 2) * (2.55774-(2.93309)));
            zz = 1.91551 + (((tickAnim - 23) / 2) * (0.7568-(1.91551)));
        }
        else if (tickAnim >= 25 && tickAnim < 30) {
            xx = -8.06366 + (((tickAnim - 25) / 5) * (10-(-8.06366)));
            yy = 2.55774 + (((tickAnim - 25) / 5) * (0-(2.55774)));
            zz = 0.7568 + (((tickAnim - 25) / 5) * (0-(0.7568)));
        }
        else if (tickAnim >= 30 && tickAnim < 33) {
            xx = 10 + (((tickAnim - 30) / 3) * (-11.38662-(10)));
            yy = 0 + (((tickAnim - 30) / 3) * (1.33592-(0)));
            zz = 0 + (((tickAnim - 30) / 3) * (-1.96153-(0)));
        }
        else if (tickAnim >= 33 && tickAnim < 38) {
            xx = -11.38662 + (((tickAnim - 33) / 5) * (20.80918-(-11.38662)));
            yy = 1.33592 + (((tickAnim - 33) / 5) * (3-(1.33592)));
            zz = -1.96153 + (((tickAnim - 33) / 5) * (-6.53729-(-1.96153)));
        }
        else if (tickAnim >= 38 && tickAnim < 53) {
            xx = 20.80918 + (((tickAnim - 38) / 15) * (30.86081-(20.80918)));
            yy = 3 + (((tickAnim - 38) / 15) * (20-(3)));
            zz = -6.53729 + (((tickAnim - 38) / 15) * (-5.81358-(-6.53729)));
        }
        else if (tickAnim >= 53 && tickAnim < 60) {
            xx = 30.86081 + (((tickAnim - 53) / 7) * (44.38763-(30.86081)));
            yy = 20 + (((tickAnim - 53) / 7) * (2-(20)));
            zz = -5.81358 + (((tickAnim - 53) / 7) * (5-(-5.81358)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Rightfrontfoot, Rightfrontfoot.rotateAngleX + (float) Math.toRadians(xx), Rightfrontfoot.rotateAngleY + (float) Math.toRadians(yy), Rightfrontfoot.rotateAngleZ + (float) Math.toRadians(zz));



        this.setRotateAngle(Tail1, Tail1.rotateAngleX + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360+60))*-3), Tail1.rotateAngleY + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*120))*-5), Tail1.rotateAngleZ + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*120+30))*3));


        this.setRotateAngle(Tail2, Tail2.rotateAngleX + (float) Math.toRadians(5+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360+30))*-5), Tail2.rotateAngleY + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*120-30))*-10), Tail2.rotateAngleZ + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*120))*5));


        this.setRotateAngle(Tail3, Tail3.rotateAngleX + (float) Math.toRadians(5+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360))*-5), Tail3.rotateAngleY + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*120-60))*-10), Tail3.rotateAngleZ + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*120-30))*5));



        if (tickAnim >= 0 && tickAnim < 8) {
            xx = -20.10733 + (((tickAnim - 0) / 8) * (-13.28026-(-20.10733)));
            yy = -6.36899 + (((tickAnim - 0) / 8) * (-7.69069-(-6.36899)));
            zz = -5.88077 + (((tickAnim - 0) / 8) * (-3.45348-(-5.88077)));
        }
        else if (tickAnim >= 8 && tickAnim < 30) {
            xx = -13.28026 + (((tickAnim - 8) / 22) * (35-(-13.28026)));
            yy = -7.69069 + (((tickAnim - 8) / 22) * (0-(-7.69069)));
            zz = -3.45348 + (((tickAnim - 8) / 22) * (0-(-3.45348)));
        }
        else if (tickAnim >= 30 && tickAnim < 45) {
            xx = 35 + (((tickAnim - 30) / 15) * (-16.70539-(35)));
            yy = 0 + (((tickAnim - 30) / 15) * (-18.76891-(0)));
            zz = 0 + (((tickAnim - 30) / 15) * (-15.33011-(0)));
        }
        else if (tickAnim >= 45 && tickAnim < 60) {
            xx = -16.70539 + (((tickAnim - 45) / 15) * (-20.10733-(-16.70539)));
            yy = -18.76891 + (((tickAnim - 45) / 15) * (-6.36899-(-18.76891)));
            zz = -15.33011 + (((tickAnim - 45) / 15) * (-5.88077-(-15.33011)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Leftthigh, Leftthigh.rotateAngleX + (float) Math.toRadians(xx), Leftthigh.rotateAngleY + (float) Math.toRadians(yy), Leftthigh.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 8) {
            xx = -3.34535 + (((tickAnim - 0) / 8) * (17.04176-(-3.34535)));
            yy = -17.20839 + (((tickAnim - 0) / 8) * (-13.8198-(-17.20839)));
            zz = -4.29105 + (((tickAnim - 0) / 8) * (-5.4685-(-4.29105)));
        }
        else if (tickAnim >= 8 && tickAnim < 17) {
            xx = 17.04176 + (((tickAnim - 8) / 9) * (18.6015-(17.04176)));
            yy = -13.8198 + (((tickAnim - 8) / 9) * (-12.32016-(-13.8198)));
            zz = -5.4685 + (((tickAnim - 8) / 9) * (-1.53099-(-5.4685)));
        }
        else if (tickAnim >= 17 && tickAnim < 30) {
            xx = 18.6015 + (((tickAnim - 17) / 13) * (15.68672-(18.6015)));
            yy = -12.32016 + (((tickAnim - 17) / 13) * (-5.51738-(-12.32016)));
            zz = -1.53099 + (((tickAnim - 17) / 13) * (-5.14839-(-1.53099)));
        }
        else if (tickAnim >= 30 && tickAnim < 38) {
            xx = 15.68672 + (((tickAnim - 30) / 8) * (23.36342-(15.68672)));
            yy = -5.51738 + (((tickAnim - 30) / 8) * (-9.06078-(-5.51738)));
            zz = -5.14839 + (((tickAnim - 30) / 8) * (-3.91662-(-5.14839)));
        }
        else if (tickAnim >= 38 && tickAnim < 44) {
            xx = 23.36342 + (((tickAnim - 38) / 6) * (34.344-(23.36342)));
            yy = -9.06078 + (((tickAnim - 38) / 6) * (-12.01361-(-9.06078)));
            zz = -3.91662 + (((tickAnim - 38) / 6) * (-2.89015-(-3.91662)));
        }
        else if (tickAnim >= 44 && tickAnim < 50) {
            xx = 34.344 + (((tickAnim - 44) / 6) * (19.25654-(34.344)));
            yy = -12.01361 + (((tickAnim - 44) / 6) * (-14.96645-(-12.01361)));
            zz = -2.89015 + (((tickAnim - 44) / 6) * (-1.86368-(-2.89015)));
        }
        else if (tickAnim >= 50 && tickAnim < 60) {
            xx = 19.25654 + (((tickAnim - 50) / 10) * (-3.34535-(19.25654)));
            yy = -14.96645 + (((tickAnim - 50) / 10) * (-17.20839-(-14.96645)));
            zz = -1.86368 + (((tickAnim - 50) / 10) * (-4.29105-(-1.86368)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Leftshin, Leftshin.rotateAngleX + (float) Math.toRadians(xx), Leftshin.rotateAngleY + (float) Math.toRadians(yy), Leftshin.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 8) {
            xx = 25.02686 + (((tickAnim - 0) / 8) * (-0.18409-(25.02686)));
            yy = 1.60667 + (((tickAnim - 0) / 8) * (3.72019-(1.60667)));
            zz = 1.91561 + (((tickAnim - 0) / 8) * (-2.62089-(1.91561)));
        }
        else if (tickAnim >= 8 && tickAnim < 17) {
            xx = -0.18409 + (((tickAnim - 8) / 9) * (-19.57129-(-0.18409)));
            yy = 3.72019 + (((tickAnim - 8) / 9) * (-0.78767-(3.72019)));
            zz = -2.62089 + (((tickAnim - 8) / 9) * (-2.94913-(-2.62089)));
        }
        else if (tickAnim >= 17 && tickAnim < 23) {
            xx = -19.57129 + (((tickAnim - 17) / 6) * (-28.61759-(-19.57129)));
            yy = -0.78767 + (((tickAnim - 17) / 6) * (0.30067-(-0.78767)));
            zz = -2.94913 + (((tickAnim - 17) / 6) * (-0.73788-(-2.94913)));
        }
        else if (tickAnim >= 23 && tickAnim < 30) {
            xx = -28.61759 + (((tickAnim - 23) / 7) * (-17.47314-(-28.61759)));
            yy = 0.30067 + (((tickAnim - 23) / 7) * (1.60667-(0.30067)));
            zz = -0.73788 + (((tickAnim - 23) / 7) * (1.91561-(-0.73788)));
        }
        else if (tickAnim >= 30 && tickAnim < 38) {
            xx = -17.47314 + (((tickAnim - 30) / 8) * (-18.36599-(-17.47314)));
            yy = 1.60667 + (((tickAnim - 30) / 8) * (1.60667-(1.60667)));
            zz = 1.91561 + (((tickAnim - 30) / 8) * (1.91561-(1.91561)));
        }
        else if (tickAnim >= 38 && tickAnim < 50) {
            xx = -18.36599 + (((tickAnim - 38) / 12) * (-15.75745-(-18.36599)));
            yy = 1.60667 + (((tickAnim - 38) / 12) * (1.60667-(1.60667)));
            zz = 1.91561 + (((tickAnim - 38) / 12) * (1.91561-(1.91561)));
        }
        else if (tickAnim >= 50 && tickAnim < 60) {
            xx = -15.75745 + (((tickAnim - 50) / 10) * (25.02686-(-15.75745)));
            yy = 1.60667 + (((tickAnim - 50) / 10) * (1.60667-(1.60667)));
            zz = 1.91561 + (((tickAnim - 50) / 10) * (1.91561-(1.91561)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Lefthindfoot, Lefthindfoot.rotateAngleX + (float) Math.toRadians(xx), Lefthindfoot.rotateAngleY + (float) Math.toRadians(yy), Lefthindfoot.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 15) {
            xx = 35 + (((tickAnim - 0) / 15) * (-16.70539-(35)));
            yy = 0 + (((tickAnim - 0) / 15) * (18.76891-(0)));
            zz = 0 + (((tickAnim - 0) / 15) * (15.33011-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 30) {
            xx = -16.70539 + (((tickAnim - 15) / 15) * (-20.10733-(-16.70539)));
            yy = 18.76891 + (((tickAnim - 15) / 15) * (6.36899-(18.76891)));
            zz = 15.33011 + (((tickAnim - 15) / 15) * (5.88077-(15.33011)));
        }
        else if (tickAnim >= 30 && tickAnim < 38) {
            xx = -20.10733 + (((tickAnim - 30) / 8) * (-13.28026-(-20.10733)));
            yy = 6.36899 + (((tickAnim - 30) / 8) * (7.69069-(6.36899)));
            zz = 5.88077 + (((tickAnim - 30) / 8) * (3.45348-(5.88077)));
        }
        else if (tickAnim >= 38 && tickAnim < 60) {
            xx = -13.28026 + (((tickAnim - 38) / 22) * (35-(-13.28026)));
            yy = 7.69069 + (((tickAnim - 38) / 22) * (0-(7.69069)));
            zz = 3.45348 + (((tickAnim - 38) / 22) * (0-(3.45348)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Rightthigh, Rightthigh.rotateAngleX + (float) Math.toRadians(xx), Rightthigh.rotateAngleY + (float) Math.toRadians(yy), Rightthigh.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 8) {
            xx = 15.68672 + (((tickAnim - 0) / 8) * (23.36342-(15.68672)));
            yy = 5.51738 + (((tickAnim - 0) / 8) * (9.06078-(5.51738)));
            zz = 5.14839 + (((tickAnim - 0) / 8) * (3.91662-(5.14839)));
        }
        else if (tickAnim >= 8 && tickAnim < 14) {
            xx = 23.36342 + (((tickAnim - 8) / 6) * (34.344-(23.36342)));
            yy = 9.06078 + (((tickAnim - 8) / 6) * (12.01361-(9.06078)));
            zz = 3.91662 + (((tickAnim - 8) / 6) * (2.89015-(3.91662)));
        }
        else if (tickAnim >= 14 && tickAnim < 20) {
            xx = 34.344 + (((tickAnim - 14) / 6) * (19.25654-(34.344)));
            yy = 12.01361 + (((tickAnim - 14) / 6) * (14.96645-(12.01361)));
            zz = 2.89015 + (((tickAnim - 14) / 6) * (1.86368-(2.89015)));
        }
        else if (tickAnim >= 20 && tickAnim < 30) {
            xx = 19.25654 + (((tickAnim - 20) / 10) * (-3.34535-(19.25654)));
            yy = 14.96645 + (((tickAnim - 20) / 10) * (17.20839-(14.96645)));
            zz = 1.86368 + (((tickAnim - 20) / 10) * (4.29105-(1.86368)));
        }
        else if (tickAnim >= 30 && tickAnim < 38) {
            xx = -3.34535 + (((tickAnim - 30) / 8) * (17.04176-(-3.34535)));
            yy = 17.20839 + (((tickAnim - 30) / 8) * (13.8198-(17.20839)));
            zz = 4.29105 + (((tickAnim - 30) / 8) * (5.4685-(4.29105)));
        }
        else if (tickAnim >= 38 && tickAnim < 47) {
            xx = 17.04176 + (((tickAnim - 38) / 9) * (18.6015-(17.04176)));
            yy = 13.8198 + (((tickAnim - 38) / 9) * (12.32016-(13.8198)));
            zz = 5.4685 + (((tickAnim - 38) / 9) * (1.53099-(5.4685)));
        }
        else if (tickAnim >= 47 && tickAnim < 60) {
            xx = 18.6015 + (((tickAnim - 47) / 13) * (15.68672-(18.6015)));
            yy = 12.32016 + (((tickAnim - 47) / 13) * (5.51738-(12.32016)));
            zz = 1.53099 + (((tickAnim - 47) / 13) * (5.14839-(1.53099)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Rightshin, Rightshin.rotateAngleX + (float) Math.toRadians(xx), Rightshin.rotateAngleY + (float) Math.toRadians(yy), Rightshin.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 8) {
            xx = -17.47314 + (((tickAnim - 0) / 8) * (-18.36599-(-17.47314)));
            yy = -1.60667 + (((tickAnim - 0) / 8) * (-1.60667-(-1.60667)));
            zz = -1.91561 + (((tickAnim - 0) / 8) * (-1.91561-(-1.91561)));
        }
        else if (tickAnim >= 8 && tickAnim < 20) {
            xx = -18.36599 + (((tickAnim - 8) / 12) * (-15.75745-(-18.36599)));
            yy = -1.60667 + (((tickAnim - 8) / 12) * (-1.60667-(-1.60667)));
            zz = -1.91561 + (((tickAnim - 8) / 12) * (-1.91561-(-1.91561)));
        }
        else if (tickAnim >= 20 && tickAnim < 30) {
            xx = -15.75745 + (((tickAnim - 20) / 10) * (25.02686-(-15.75745)));
            yy = -1.60667 + (((tickAnim - 20) / 10) * (-1.60667-(-1.60667)));
            zz = -1.91561 + (((tickAnim - 20) / 10) * (-1.91561-(-1.91561)));
        }
        else if (tickAnim >= 30 && tickAnim < 38) {
            xx = 25.02686 + (((tickAnim - 30) / 8) * (-0.18409-(25.02686)));
            yy = -1.60667 + (((tickAnim - 30) / 8) * (-3.72019-(-1.60667)));
            zz = -1.91561 + (((tickAnim - 30) / 8) * (2.62089-(-1.91561)));
        }
        else if (tickAnim >= 38 && tickAnim < 47) {
            xx = -0.18409 + (((tickAnim - 38) / 9) * (-19.57129-(-0.18409)));
            yy = -3.72019 + (((tickAnim - 38) / 9) * (0.78767-(-3.72019)));
            zz = 2.62089 + (((tickAnim - 38) / 9) * (2.94913-(2.62089)));
        }
        else if (tickAnim >= 47 && tickAnim < 53) {
            xx = -19.57129 + (((tickAnim - 47) / 6) * (-28.61759-(-19.57129)));
            yy = 0.78767 + (((tickAnim - 47) / 6) * (-0.30067-(0.78767)));
            zz = 2.94913 + (((tickAnim - 47) / 6) * (0.73788-(2.94913)));
        }
        else if (tickAnim >= 53 && tickAnim < 60) {
            xx = -28.61759 + (((tickAnim - 53) / 7) * (-17.47314-(-28.61759)));
            yy = -0.30067 + (((tickAnim - 53) / 7) * (-1.60667-(-0.30067)));
            zz = 0.73788 + (((tickAnim - 53) / 7) * (-1.91561-(0.73788)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Righthindfoot, Righthindfoot.rotateAngleX + (float) Math.toRadians(xx), Righthindfoot.rotateAngleY + (float) Math.toRadians(yy), Righthindfoot.rotateAngleZ + (float) Math.toRadians(zz));

    }

    public void animRunning(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime) {
        EntityPrehistoricFloraTapinocephalus entity = (EntityPrehistoricFloraTapinocephalus) entitylivingbaseIn;

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
            xx = -41.52152 + (((tickAnim - 6) / 4) * (25-(-41.52152)));
            yy = -0.52438 + (((tickAnim - 6) / 4) * (0-(-0.52438)));
            zz = -25.93485 + (((tickAnim - 6) / 4) * (0-(-25.93485)));
        }
        else if (tickAnim >= 10 && tickAnim < 15) {
            xx = 25 + (((tickAnim - 10) / 5) * (-16.8408-(25)));
            yy = 0 + (((tickAnim - 10) / 5) * (-6.04979-(0)));
            zz = 0 + (((tickAnim - 10) / 5) * (-7.53478-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 18) {
            xx = -16.8408 + (((tickAnim - 15) / 3) * (-33.24257-(-16.8408)));
            yy = -6.04979 + (((tickAnim - 15) / 3) * (-5.9584-(-6.04979)));
            zz = -7.53478 + (((tickAnim - 15) / 3) * (-11.3778-(-7.53478)));
        }
        else if (tickAnim >= 18 && tickAnim < 20) {
            xx = -33.24257 + (((tickAnim - 18) / 2) * (-18.53168-(-33.24257)));
            yy = -5.9584 + (((tickAnim - 18) / 2) * (-12.13904-(-5.9584)));
            zz = -11.3778 + (((tickAnim - 18) / 2) * (-26.56015-(-11.3778)));
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
            xx = 49.25 + (((tickAnim - 13) / 2) * (33.66247-(49.25)));
            yy = 0 + (((tickAnim - 13) / 2) * (5.34141-(0)));
            zz = 0 + (((tickAnim - 13) / 2) * (-4.51518-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 18) {
            xx = 33.66247 + (((tickAnim - 15) / 3) * (29.57967-(33.66247)));
            yy = 5.34141 + (((tickAnim - 15) / 3) * (2.32883-(5.34141)));
            zz = -4.51518 + (((tickAnim - 15) / 3) * (-5.00952-(-4.51518)));
        }
        else if (tickAnim >= 18 && tickAnim < 19) {
            xx = 29.57967 + (((tickAnim - 18) / 1) * (9.59225-(29.57967)));
            yy = 2.32883 + (((tickAnim - 18) / 1) * (-0.30783-(2.32883)));
            zz = -5.00952 + (((tickAnim - 18) / 1) * (0.94774-(-5.00952)));
        }
        else if (tickAnim >= 19 && tickAnim < 20) {
            xx = 9.59225 + (((tickAnim - 19) / 1) * (10-(9.59225)));
            yy = -0.30783 + (((tickAnim - 19) / 1) * (0-(-0.30783)));
            zz = 0.94774 + (((tickAnim - 19) / 1) * (0-(0.94774)));
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
            xx = 25 + (((tickAnim - 0) / 5) * (-16.8408-(25)));
            yy = 0 + (((tickAnim - 0) / 5) * (6.04979-(0)));
            zz = 0 + (((tickAnim - 0) / 5) * (7.53478-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 8) {
            xx = -16.8408 + (((tickAnim - 5) / 3) * (-33.24257-(-16.8408)));
            yy = 6.04979 + (((tickAnim - 5) / 3) * (5.9584-(6.04979)));
            zz = 7.53478 + (((tickAnim - 5) / 3) * (11.3778-(7.53478)));
        }
        else if (tickAnim >= 8 && tickAnim < 10) {
            xx = -33.24257 + (((tickAnim - 8) / 2) * (-18.53168-(-33.24257)));
            yy = 5.9584 + (((tickAnim - 8) / 2) * (12.13904-(5.9584)));
            zz = 11.3778 + (((tickAnim - 8) / 2) * (26.56015-(11.3778)));
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
            xx = -41.52152 + (((tickAnim - 16) / 4) * (25-(-41.52152)));
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
            xx = 49.25 + (((tickAnim - 3) / 2) * (33.66247-(49.25)));
            yy = 0 + (((tickAnim - 3) / 2) * (-5.34141-(0)));
            zz = 0 + (((tickAnim - 3) / 2) * (4.51518-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 8) {
            xx = 33.66247 + (((tickAnim - 5) / 3) * (29.57967-(33.66247)));
            yy = -5.34141 + (((tickAnim - 5) / 3) * (-2.32883-(-5.34141)));
            zz = 4.51518 + (((tickAnim - 5) / 3) * (5.00952-(4.51518)));
        }
        else if (tickAnim >= 8 && tickAnim < 9) {
            xx = 29.57967 + (((tickAnim - 8) / 1) * (9.59225-(29.57967)));
            yy = -2.32883 + (((tickAnim - 8) / 1) * (0.30783-(-2.32883)));
            zz = 5.00952 + (((tickAnim - 8) / 1) * (-0.94774-(5.00952)));
        }
        else if (tickAnim >= 9 && tickAnim < 10) {
            xx = 9.59225 + (((tickAnim - 9) / 1) * (10-(9.59225)));
            yy = 0.30783 + (((tickAnim - 9) / 1) * (0-(0.30783)));
            zz = -0.94774 + (((tickAnim - 9) / 1) * (0-(-0.94774)));
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



        if (tickAnim >= 0 && tickAnim < 3) {
            xx = -13.27027 + (((tickAnim - 0) / 3) * (-12.4716-(-13.27027)));
            yy = -3.18737 + (((tickAnim - 0) / 3) * (-7.90025-(-3.18737)));
            zz = -7.10205 + (((tickAnim - 0) / 3) * (-4.48202-(-7.10205)));
        }
        else if (tickAnim >= 3 && tickAnim < 10) {
            xx = -12.4716 + (((tickAnim - 3) / 7) * (35-(-12.4716)));
            yy = -7.90025 + (((tickAnim - 3) / 7) * (0-(-7.90025)));
            zz = -4.48202 + (((tickAnim - 3) / 7) * (0-(-4.48202)));
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
            xx = 7.15169 + (((tickAnim - 15) / 5) * (-13.27027-(7.15169)));
            yy = -0.01795 + (((tickAnim - 15) / 5) * (-3.18737-(-0.01795)));
            zz = -19.33301 + (((tickAnim - 15) / 5) * (-7.10205-(-19.33301)));
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
        this.Leftthigh.rotationPointX = this.Leftthigh.rotationPointX + (float)(xx);
        this.Leftthigh.rotationPointY = this.Leftthigh.rotationPointY - (float)(yy);
        this.Leftthigh.rotationPointZ = this.Leftthigh.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 3) {
            xx = -24.1056 + (((tickAnim - 0) / 3) * (-1.3013-(-24.1056)));
            yy = -19.69098 + (((tickAnim - 0) / 3) * (-10.68725-(-19.69098)));
            zz = -0.22132 + (((tickAnim - 0) / 3) * (-6.99435-(-0.22132)));
        }
        else if (tickAnim >= 3 && tickAnim < 6) {
            xx = -1.3013 + (((tickAnim - 3) / 3) * (1.2821-(-1.3013)));
            yy = -10.68725 + (((tickAnim - 3) / 3) * (-3.43479-(-10.68725)));
            zz = -6.99435 + (((tickAnim - 3) / 3) * (-12.11552-(-6.99435)));
        }
        else if (tickAnim >= 6 && tickAnim < 10) {
            xx = 1.2821 + (((tickAnim - 6) / 4) * (23.18672-(1.2821)));
            yy = -3.43479 + (((tickAnim - 6) / 4) * (-5.51738-(-3.43479)));
            zz = -12.11552 + (((tickAnim - 6) / 4) * (-5.14839-(-12.11552)));
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
        else if (tickAnim >= 6 && tickAnim < 8) {
            xx = -4.80085 + (((tickAnim - 6) / 2) * (-32.41564-(-4.80085)));
            yy = 3.19329 + (((tickAnim - 6) / 2) * (2.73481-(3.19329)));
            zz = 5.7724 + (((tickAnim - 6) / 2) * (2.34793-(5.7724)));
        }
        else if (tickAnim >= 8 && tickAnim < 10) {
            xx = -32.41564 + (((tickAnim - 8) / 2) * (-22.47314-(-32.41564)));
            yy = 2.73481 + (((tickAnim - 8) / 2) * (1.60667-(2.73481)));
            zz = 2.34793 + (((tickAnim - 8) / 2) * (1.91561-(2.34793)));
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
            xx = -15.75745 + (((tickAnim - 17) / 3) * (37.52686-(-15.75745)));
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
        else if (tickAnim >= 10 && tickAnim < 13) {
            xx = -13.27027 + (((tickAnim - 10) / 3) * (-12.4716-(-13.27027)));
            yy = 3.18737 + (((tickAnim - 10) / 3) * (7.90025-(3.18737)));
            zz = 7.10205 + (((tickAnim - 10) / 3) * (4.48202-(7.10205)));
        }
        else if (tickAnim >= 13 && tickAnim < 20) {
            xx = -12.4716 + (((tickAnim - 13) / 7) * (35-(-12.4716)));
            yy = 7.90025 + (((tickAnim - 13) / 7) * (0-(7.90025)));
            zz = 4.48202 + (((tickAnim - 13) / 7) * (0-(4.48202)));
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
        else if (tickAnim >= 10 && tickAnim < 13) {
            xx = -24.1056 + (((tickAnim - 10) / 3) * (-1.3013-(-24.1056)));
            yy = 19.69098 + (((tickAnim - 10) / 3) * (10.68725-(19.69098)));
            zz = 0.22132 + (((tickAnim - 10) / 3) * (6.99435-(0.22132)));
        }
        else if (tickAnim >= 13 && tickAnim < 16) {
            xx = -1.3013 + (((tickAnim - 13) / 3) * (1.2821-(-1.3013)));
            yy = 10.68725 + (((tickAnim - 13) / 3) * (3.43479-(10.68725)));
            zz = 6.99435 + (((tickAnim - 13) / 3) * (12.11552-(6.99435)));
        }
        else if (tickAnim >= 16 && tickAnim < 20) {
            xx = 1.2821 + (((tickAnim - 16) / 4) * (23.18672-(1.2821)));
            yy = 3.43479 + (((tickAnim - 16) / 4) * (5.51738-(3.43479)));
            zz = 12.11552 + (((tickAnim - 16) / 4) * (5.14839-(12.11552)));
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
        else if (tickAnim >= 16 && tickAnim < 18) {
            xx = -4.80085 + (((tickAnim - 16) / 2) * (-32.41564-(-4.80085)));
            yy = -3.19329 + (((tickAnim - 16) / 2) * (-2.73481-(-3.19329)));
            zz = -5.7724 + (((tickAnim - 16) / 2) * (-2.34793-(-5.7724)));
        }
        else if (tickAnim >= 18 && tickAnim < 20) {
            xx = -32.41564 + (((tickAnim - 18) / 2) * (-22.47314-(-32.41564)));
            yy = -2.73481 + (((tickAnim - 18) / 2) * (-1.60667-(-2.73481)));
            zz = -2.34793 + (((tickAnim - 18) / 2) * (-1.91561-(-2.34793)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Righthindfoot, Righthindfoot.rotateAngleX + (float) Math.toRadians(xx), Righthindfoot.rotateAngleY + (float) Math.toRadians(yy), Righthindfoot.rotateAngleZ + (float) Math.toRadians(zz));


    }

    public void animate(IAnimatedEntity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        EntityPrehistoricFloraTapinocephalus e = (EntityPrehistoricFloraTapinocephalus) entity;
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
