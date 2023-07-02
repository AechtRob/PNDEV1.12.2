package net.lepidodendron.entity.model.entity;

import net.ilexiconn.llibrary.client.model.ModelAnimator;
import net.ilexiconn.llibrary.server.animation.IAnimatedEntity;
import net.lepidodendron.entity.EntityPrehistoricFloraTapinocephalus;
import net.lepidodendron.entity.model.llibraryextensions.AdvancedModelBaseExtended;
import net.lepidodendron.entity.model.llibraryextensions.AdvancedModelRendererExtended;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

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
        this.resetToDefaultPose();
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
        float speed = masterSpeed / 2.225F;
        if (Tapinocephalus.getIsFast()) {
            speed = speed * 2;
        }

        this.Leftupperarm.offsetY = this.moveBoxExtended(speed, (float) Math.toRadians(1.8), false, 1, f2, 1.5F);;
        this.Rightupperarm.offsetY = this.moveBoxExtended(speed, (float) Math.toRadians(1.8), false, 4, f2, 1.5F);;
        this.Leftthigh.offsetY = this.moveBoxExtended(speed, (float) Math.toRadians(1.0), false, 4, f2, 1.5F);;
        this.Rightthigh.offsetY = this.moveBoxExtended(speed, (float) Math.toRadians(1.0), false, 1, f2, 1.5F);;

        this.flap(Leftupperarm, speed, -0.2F, true, 4, 0.15F, f2, 1F);
        this.flap(Rightupperarm, speed, 0.2F, true, 7, -0.15F, f2, 1F);
        this.flap(Leftthigh, speed, 0.1F, false, 7, -0.05F, f2, 1F);
        this.flap(Rightthigh, speed, -0.1F, false, 4, 0.05F, f2, 1F);

        this.walk(Leftupperarm, speed, 0.40F, true, 5, 0.30F, f2, 1F);
        this.walk(Rightupperarm, speed, 0.40F, true, 8, 0.30F, f2, 1F);
        this.walk(Leftthigh, speed, 0.30F, true, 8, 0F, f2, 1F);
        this.walk(Rightthigh, speed, 0.30F, true, 5, 0F, f2, 1F);

        this.walk(Leftlowerarm, speed, 0.25F, true, 6, 0F, f2, 1F);
        this.walk(Rightlowerarm, speed, 0.25F, true, 9, 0F, f2, 1F);
        this.walk(Leftshin, speed, 0.20F, true, 9, 0F, f2, 1F);
        this.walk(Rightshin, speed, 0.20F, true, 6, 0F, f2, 1F);

        this.flap(Leftlowerarm, speed, 0.10F, true, 0, 0.05F, f2, 1F);
        this.flap(Rightlowerarm, speed, -0.10F, true, 3, -0.05F, f2, 1F);
        this.flap(Leftshin, speed, -0.10F, false, 3, -0.05F, f2, 1F);
        this.flap(Rightshin, speed, 0.10F, false, 0, 0.05F, f2, 1F);

        this.walk(Leftfrontfoot, speed, 0.30F, true, 2, -0.10F, f2, 1F);
        this.walk(Rightfrontfoot, speed, 0.30F, true, 5, -0.10F, f2, 1F);
        this.walk(Lefthindfoot, speed, 0.25F, true, 5, -0.08F, f2, 1F);
        this.walk(Righthindfoot, speed, 0.25F, true, 2, -0.08F, f2, 1F);

        this.bobExtended(Hips, speed * 2F, 0.2F, false, 2.5F,  f2, 1F);

        this.flap(Hips, speed, 0.12F, false, 5.0F,0.06F, f2, 1.0F);
        this.flap(Belly, speed, -0.12F, false, 5.0F,-0.06F, f2, 1.0F);
        this.flap(Front, speed, -0.08F, false, 5.0F,-0.04F, f2, 1.0F);

        this.walk(Front, speed * 2, 0.05F, false, 2.5F,-0.01F, f2, 0.8F);

        this.swing(Neck, speed, 0.10F, false, 0.5F,-0.05F, f2, 0.8F);
        this.walk(Neck, speed * 2, -0.02F, false, 0.5F,0.01F, f2, 0.8F);
        this.chainFlap(Tail, (speed*0.6F), 0.20F, 0.2F, f2, 1F);
        this.chainSwing(Tail, (speed*0.6F) * 2F, 0.10F, 0.12F, f2, 1F);

        this.Hips.offsetZ = this.moveBoxExtended(speed * 2, (float) Math.toRadians(2.2), false, 1.5F, f2, 1);

    }

    public void animate(IAnimatedEntity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        EntityPrehistoricFloraTapinocephalus e = (EntityPrehistoricFloraTapinocephalus) entity;
        animator.update(entity);
        this.resetToDefaultPose();
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
