package net.lepidodendron.entity.model.entity;

import net.ilexiconn.llibrary.client.model.ModelAnimator;
import net.ilexiconn.llibrary.server.animation.IAnimatedEntity;
import net.lepidodendron.entity.EntityPrehistoricFloraDiadectes;
import net.lepidodendron.entity.model.llibraryextensions.AdvancedModelBaseExtended;
import net.lepidodendron.entity.model.llibraryextensions.AdvancedModelRendererExtended;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

public class ModelDiadectes extends AdvancedModelBaseExtended {
    public AdvancedModelRendererExtended Hips;
    public AdvancedModelRendererExtended Belly;
    public AdvancedModelRendererExtended Tailbase;
    public AdvancedModelRendererExtended Leftthigh;
    public AdvancedModelRendererExtended Rightthigh;
    public AdvancedModelRendererExtended Bodyfront;
    public AdvancedModelRendererExtended Neck;
    public AdvancedModelRendererExtended Rightupperarm;
    public AdvancedModelRendererExtended Leftupperarm;
    public AdvancedModelRendererExtended Head;
    public AdvancedModelRendererExtended Upperjawback;
    public AdvancedModelRendererExtended Lowerjawback;
    public AdvancedModelRendererExtended Upperjawfront;
    public AdvancedModelRendererExtended Upperfrontteeth;
    public AdvancedModelRendererExtended Leftupperteeth;
    public AdvancedModelRendererExtended Rightupperteeth;
    public AdvancedModelRendererExtended Lowerjawmiddle;
    public AdvancedModelRendererExtended Jawparting;
    public AdvancedModelRendererExtended Lowerjawfront;
    public AdvancedModelRendererExtended Leftlowerteeth;
    public AdvancedModelRendererExtended Rightlowerteeth;
    public AdvancedModelRendererExtended Lowerfrontteeth;
    public AdvancedModelRendererExtended Rightlowerarm;
    public AdvancedModelRendererExtended Rightfrontfoot;
    public AdvancedModelRendererExtended Leftlowerarm;
    public AdvancedModelRendererExtended Leftfrontfoot;
    public AdvancedModelRendererExtended Tailmiddlebase;
    public AdvancedModelRendererExtended Tailmiddleend;
    public AdvancedModelRendererExtended Tailend;
    public AdvancedModelRendererExtended Leftshin;
    public AdvancedModelRendererExtended Lefthindfoot;
    public AdvancedModelRendererExtended Rightshin;
    public AdvancedModelRendererExtended Righthindfoot;

    private ModelAnimator animator;

    public ModelDiadectes() {
        this.textureWidth = 100;
        this.textureHeight = 100;
        this.Righthindfoot = new AdvancedModelRendererExtended(this, 63, 34);
        this.Righthindfoot.setRotationPoint(0.0F, 4.0F, 0.0F);
        this.Righthindfoot.addBox(-2.5F, 0.0F, -4.0F, 5, 2, 5, 0.0F);
        this.setRotateAngle(Righthindfoot, 0.12740903872453743F, 0.8702211756970171F, -0.1911135497644277F);
        this.Bodyfront = new AdvancedModelRendererExtended(this, 0, 36);
        this.Bodyfront.setRotationPoint(0.0F, -0.5F, -11.0F);
        this.Bodyfront.addBox(-4.5F, -1.0F, -10.0F, 9, 10, 10, 0.0F);
        this.setRotateAngle(Bodyfront, 0.06370451936226872F, 0.0F, 0.0F);
        this.Rightshin = new AdvancedModelRendererExtended(this, 50, 29);
        this.Rightshin.setRotationPoint(-3.5F, 0.699999988079071F, 0.0F);
        this.Rightshin.addBox(-1.5F, -0.5F, -2.0F, 3, 6, 4, 0.0F);
        this.setRotateAngle(Rightshin, 0.0F, 0.06370451936226872F, 0.10611601718967469F);
        this.Neck = new AdvancedModelRendererExtended(this, 0, 24);
        this.Neck.setRotationPoint(0.0F, 0.20000000298023224F, -9.5F);
        this.Neck.addBox(-2.0F, -1.0F, -4.0F, 4, 6, 5, 0.0F);
        this.setRotateAngle(Neck, -0.04241150198859518F, 0.0F, 0.0F);
        this.Rightthigh = new AdvancedModelRendererExtended(this, 52, 9);
        this.Rightthigh.setRotationPoint(-3.5F, 3.7799999713897705F, 1.0F);
        this.Rightthigh.addBox(-5.0F, -1.5F, -2.0F, 6, 4, 4, 0.0F);
        this.setRotateAngle(Rightthigh, 0.021293017373673524F, -0.24119361162833844F, 0.16974026721221272F);
        this.Leftfrontfoot = new AdvancedModelRendererExtended(this, 64, 18);
        this.Leftfrontfoot.setRotationPoint(0.0F, 4.5F, -0.5F);
        this.Leftfrontfoot.addBox(-2.5F, 0.0F, -3.0F, 5, 2, 4, 0.0F);
        this.setRotateAngle(Leftfrontfoot, 0.6579891413176677F, -0.4881685797985891F, 0.0F);
        this.Rightlowerteeth = new AdvancedModelRendererExtended(this, 35, 0);
        this.Rightlowerteeth.setRotationPoint(-0.949999988079071F, -1.5F, -0.6000000238418579F);
        this.Rightlowerteeth.addBox(0.0F, -1.0F, -1.5F, 0, 1, 3, 0.0F);
        this.setRotateAngle(Rightlowerteeth, 0.0F, -0.06370451936226872F, 0.0F);
        this.Leftthigh = new AdvancedModelRendererExtended(this, 31, 12);
        this.Leftthigh.setRotationPoint(3.5F, 3.7799999713897705F, 1.0F);
        this.Leftthigh.addBox(-1.0F, -1.5F, -2.0F, 6, 4, 4, 0.0F);
        this.setRotateAngle(Leftthigh, 0.021293017373673524F, 0.24119361162833844F, -0.16974026721221272F);
        this.Upperfrontteeth = new AdvancedModelRendererExtended(this, 5, 0);
        this.Upperfrontteeth.setRotationPoint(0.0F, -0.30000001192092896F, -2.25F);
        this.Upperfrontteeth.addBox(-1.0F, 0.0F, 0.0F, 2, 1, 0, 0.0F);
        this.setRotateAngle(Upperfrontteeth, -0.5094616179782085F, 0.0F, 0.0F);
        this.Upperjawfront = new AdvancedModelRendererExtended(this, 0, 4);
        this.Upperjawfront.setRotationPoint(0.0F, 3.0199999809265137F, -2.0F);
        this.Upperjawfront.addBox(-1.5F, -3.0F, -3.0F, 3, 3, 3, 0.0F);
        this.setRotateAngle(Upperjawfront, -0.10611601718967469F, 0.0F, 0.0F);
        this.Tailmiddleend = new AdvancedModelRendererExtended(this, 45, 64);
        this.Tailmiddleend.setRotationPoint(0.0F, 0.30000001192092896F, 5.300000190734863F);
        this.Tailmiddleend.addBox(-1.5F, -1.0F, 0.0F, 3, 4, 7, 0.0F);
        this.setRotateAngle(Tailmiddleend, 0.1911135497644277F, 0.0F, 0.0F);
        this.Leftlowerarm = new AdvancedModelRendererExtended(this, 50, 50);
        this.Leftlowerarm.setRotationPoint(2.5999999046325684F, 0.699999988079071F, 0.0F);
        this.Leftlowerarm.addBox(-1.5F, -0.5F, -1.5F, 3, 6, 3, 0.0F);
        this.setRotateAngle(Leftlowerarm, -0.5307546228683145F, -0.1485275233394591F, -0.1485275233394591F);
        this.Leftupperarm = new AdvancedModelRendererExtended(this, 31, 24);
        this.Leftupperarm.setRotationPoint(4.199999809265137F, 6.059999942779541F, -7.5F);
        this.Leftupperarm.addBox(-1.0F, -1.5F, -2.0F, 5, 4, 4, 0.0F);
        this.setRotateAngle(Leftupperarm, -0.021293017373673524F, -0.2759365787087533F, -0.1485275233394591F);
        this.Lowerjawback = new AdvancedModelRendererExtended(this, 14, 21);
        this.Lowerjawback.setRotationPoint(0.0F, 1.5F, -1.0F);
        this.Lowerjawback.addBox(-2.0F, 0.0F, -2.0F, 4, 2, 3, 0.0F);
        this.Leftshin = new AdvancedModelRendererExtended(this, 49, 18);
        this.Leftshin.setRotationPoint(3.5F, 0.699999988079071F, 0.0F);
        this.Leftshin.addBox(-1.5F, -0.5F, -2.0F, 3, 6, 4, 0.0F);
        this.setRotateAngle(Leftshin, 0.0F, -0.06370451936226872F, -0.10611601718967469F);
        this.Tailmiddlebase = new AdvancedModelRendererExtended(this, 39, 76);
        this.Tailmiddlebase.setRotationPoint(0.0F, -0.20000000298023224F, 5.0F);
        this.Tailmiddlebase.addBox(-2.0F, -1.0F, 0.0F, 4, 5, 6, 0.0F);
        this.setRotateAngle(Tailmiddlebase, 0.06370451936226872F, 0.0F, 0.0F);
        this.Lowerjawfront = new AdvancedModelRendererExtended(this, 13, 9);
        this.Lowerjawfront.setRotationPoint(0.0F, 2.0F, -2.0F);
        this.Lowerjawfront.addBox(-1.0F, -2.0F, -3.0F, 2, 2, 3, 0.0F);
        this.setRotateAngle(Lowerjawfront, -0.12740903872453743F, 0.0F, 0.0F);
        this.Lefthindfoot = new AdvancedModelRendererExtended(this, 63, 43);
        this.Lefthindfoot.setRotationPoint(0.0F, 4.0F, 0.0F);
        this.Lefthindfoot.addBox(-2.5F, 0.0F, -4.0F, 5, 2, 5, 0.0F);
        this.setRotateAngle(Lefthindfoot, 0.12740903872453743F, -0.8702211756970171F, 0.1911135497644277F);
        this.Jawparting = new AdvancedModelRendererExtended(this, 13, 4);
        this.Jawparting.setRotationPoint(0.0F, 0.0F, -1.7000000476837158F);
        this.Jawparting.addBox(-1.5F, -2.0F, 0.0F, 3, 2, 2, 0.0F);
        this.setRotateAngle(Jawparting, -0.42446406875869874F, 0.0F, 0.0F);
        this.Rightupperteeth = new AdvancedModelRendererExtended(this, 21, 0);
        this.Rightupperteeth.setRotationPoint(-0.9399999976158142F, -0.5F, -0.4000000059604645F);
        this.Rightupperteeth.addBox(0.0F, 0.0F, -1.5F, 0, 1, 3, 0.0F);
        this.setRotateAngle(Rightupperteeth, -0.021293017373673524F, -0.1485275233394591F, 0.0F);
        this.Lowerjawmiddle = new AdvancedModelRendererExtended(this, 14, 15);
        this.Lowerjawmiddle.setRotationPoint(0.0F, -0.029999999329447746F, -1.600000023841858F);
        this.Lowerjawmiddle.addBox(-1.5F, 0.0F, -2.0F, 3, 2, 2, 0.0F);
        this.setRotateAngle(Lowerjawmiddle, 0.06370451936226872F, 0.0F, 0.0F);
        this.Rightupperarm = new AdvancedModelRendererExtended(this, 31, 33);
        this.Rightupperarm.setRotationPoint(-4.199999809265137F, 6.059999942779541F, -7.5F);
        this.Rightupperarm.addBox(-4.0F, -1.5F, -2.0F, 5, 4, 4, 0.0F);
        this.setRotateAngle(Rightupperarm, -0.021293017373673524F, 0.27593656206399647F, 0.1485275233394591F);
        this.Tailend = new AdvancedModelRendererExtended(this, 33, 58);
        this.Tailend.setRotationPoint(0.0F, -0.20000000298023224F, 6.5F);
        this.Tailend.addBox(-1.0F, -0.5F, 0.0F, 2, 3, 7, 0.0F);
        this.setRotateAngle(Tailend, 0.10611601718967469F, 0.0F, 0.0F);
        this.Head = new AdvancedModelRendererExtended(this, 0, 17);
        this.Head.setRotationPoint(0.009999999776482582F, 0.6000000238418579F, -3.0F);
        this.Head.addBox(-2.5F, -1.5F, -3.0F, 5, 3, 3, 0.0F);
        this.setRotateAngle(Head, 0.08482300397719036F, 0.0F, 0.0F);
        this.Leftlowerteeth = new AdvancedModelRendererExtended(this, 28, 0);
        this.Leftlowerteeth.setRotationPoint(0.949999988079071F, -1.5F, -0.6000000238418579F);
        this.Leftlowerteeth.addBox(0.0F, -1.0F, -1.5F, 0, 1, 3, 0.0F);
        this.setRotateAngle(Leftlowerteeth, 0.0F, 0.06370451936226872F, 0.0F);
        this.Hips = new AdvancedModelRendererExtended(this, 0, 80);
        this.Hips.setRotationPoint(0.0F, 14.3F, 12.0F);
        this.Hips.addBox(-4.0F, -2.0F, -6.0F, 8, 9, 11, 0.0F);
        this.setRotateAngle(Hips, -0.12740903539558604F, 0.0F, 0.0F);
        this.Tailbase = new AdvancedModelRendererExtended(this, 39, 88);
        this.Tailbase.setRotationPoint(0.0F, 0.30000001192092896F, 4.0F);
        this.Tailbase.addBox(-2.5F, -1.5F, 0.0F, 5, 6, 6, 0.0F);
        this.setRotateAngle(Tailbase, -0.33964105645913F, 0.0F, 0.0F);
        this.Lowerfrontteeth = new AdvancedModelRendererExtended(this, 0, 0);
        this.Lowerfrontteeth.setRotationPoint(0.0F, -2.0F, -2.0999999046325684F);
        this.Lowerfrontteeth.addBox(-1.0F, -1.0F, 0.0F, 2, 1, 0, 0.0F);
        this.setRotateAngle(Lowerfrontteeth, 0.9128071854772289F, 0.0F, 0.0F);
        this.Rightfrontfoot = new AdvancedModelRendererExtended(this, 64, 26);
        this.Rightfrontfoot.setRotationPoint(0.0F, 4.5F, -0.5F);
        this.Rightfrontfoot.addBox(-2.5F, 0.0F, -3.0F, 5, 2, 4, 0.0F);
        this.setRotateAngle(Rightfrontfoot, 0.6579891413176677F, 0.4881685797985891F, 0.0F);
        this.Leftupperteeth = new AdvancedModelRendererExtended(this, 9, 0);
        this.Leftupperteeth.setRotationPoint(0.9399999976158142F, -0.5F, -0.4000000059604645F);
        this.Leftupperteeth.addBox(0.0F, 0.0F, -1.5F, 0, 1, 3, 0.0F);
        this.setRotateAngle(Leftupperteeth, -0.021293017373673524F, 0.1485275233394591F, 0.0F);
        this.Rightlowerarm = new AdvancedModelRendererExtended(this, 50, 40);
        this.Rightlowerarm.setRotationPoint(-2.5999999046325684F, 0.699999988079071F, 0.0F);
        this.Rightlowerarm.addBox(-1.5F, -0.5F, -1.5F, 3, 6, 3, 0.0F);
        this.setRotateAngle(Rightlowerarm, -0.5307546228683145F, 0.1485275233394591F, 0.1485275233394591F);
        this.Belly = new AdvancedModelRendererExtended(this, 0, 57);
        this.Belly.setRotationPoint(0.0F, -0.8999999761581421F, -5.0F);
        this.Belly.addBox(-5.0F, -1.5F, -12.0F, 10, 10, 12, 0.0F);
        this.setRotateAngle(Belly, 0.10611601718967469F, 0.0F, 0.0F);
        this.Upperjawback = new AdvancedModelRendererExtended(this, 0, 11);
        this.Upperjawback.setRotationPoint(0.0F, -1.5F, -3.0F);
        this.Upperjawback.addBox(-2.0F, 0.0F, -2.0F, 4, 3, 2, 0.0F);
        this.setRotateAngle(Upperjawback, 0.1485275233394591F, 0.0F, 0.0F);
        this.Rightshin.addChild(this.Righthindfoot);
        this.Belly.addChild(this.Bodyfront);
        this.Rightthigh.addChild(this.Rightshin);
        this.Bodyfront.addChild(this.Neck);
        this.Hips.addChild(this.Rightthigh);
        this.Leftlowerarm.addChild(this.Leftfrontfoot);
        this.Lowerjawfront.addChild(this.Rightlowerteeth);
        this.Hips.addChild(this.Leftthigh);
        this.Upperjawfront.addChild(this.Upperfrontteeth);
        this.Upperjawback.addChild(this.Upperjawfront);
        this.Tailmiddlebase.addChild(this.Tailmiddleend);
        this.Leftupperarm.addChild(this.Leftlowerarm);
        this.Bodyfront.addChild(this.Leftupperarm);
        this.Head.addChild(this.Lowerjawback);
        this.Leftthigh.addChild(this.Leftshin);
        this.Tailbase.addChild(this.Tailmiddlebase);
        this.Lowerjawmiddle.addChild(this.Lowerjawfront);
        this.Leftshin.addChild(this.Lefthindfoot);
        this.Lowerjawback.addChild(this.Jawparting);
        this.Upperjawfront.addChild(this.Rightupperteeth);
        this.Lowerjawback.addChild(this.Lowerjawmiddle);
        this.Bodyfront.addChild(this.Rightupperarm);
        this.Tailmiddleend.addChild(this.Tailend);
        this.Neck.addChild(this.Head);
        this.Lowerjawfront.addChild(this.Leftlowerteeth);
        this.Hips.addChild(this.Tailbase);
        this.Lowerjawfront.addChild(this.Lowerfrontteeth);
        this.Rightlowerarm.addChild(this.Rightfrontfoot);
        this.Upperjawfront.addChild(this.Leftupperteeth);
        this.Rightupperarm.addChild(this.Rightlowerarm);
        this.Hips.addChild(this.Belly);
        this.Head.addChild(this.Upperjawback);

        updateDefaultPose();
        animator = ModelAnimator.create();
    }

    @Override
    public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        animate((IAnimatedEntity) entity, f, f1, f2, f3, f4, f5);
        this.Hips.render(f5);
    }

    public void renderStaticWall(float f) {
        this.Neck.offsetZ = 0.09F;
        this.Neck.offsetY = -0.018F;
        this.Neck.render(0.01F);
        this.resetToDefaultPose();
    }

    public void renderStaticFloor(float f) {
        this.Hips.offsetY = -0.134F;
        this.Hips.render(0.01F);
        this.resetToDefaultPose();
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
        //this.Hips.offsetY = 0.3F;

        EntityPrehistoricFloraDiadectes Diadectes = (EntityPrehistoricFloraDiadectes) e;
        float masterSpeed = Diadectes.getTravelSpeed();

        this.faceTarget(f3, f4, 2, Neck);
        this.faceTarget(f3, f4, 4, Head);

        AdvancedModelRendererExtended[] Tail = {this.Tailbase, this.Tailmiddlebase, this.Tailmiddleend, this.Tailend};
        Diadectes.tailBuffer.applyChainSwingBuffer(Tail);
        // || (Diadectes.moveStrafing == 0 && Diadectes.moveVertical == 0 && Diadectes.moveForward == 0)

        if (Diadectes.getAnimation() == Diadectes.LAY_ANIMATION) {
            this.swing(Neck, 0.5F, 0.10F, false, 0.5F,-0.05F, f2, 0.8F);
            this.walk(Neck, 0.5F * 2, -0.02F, false, 0.5F,0.01F, f2, 0.8F);
            return;
        }

        if (f3 == 0.0F || !Diadectes.getIsMoving()) { //Not moving
            this.swing(Neck, 0.06F, 0.10F, false, 0.5F,-0.05F, f2, 0.8F);
            this.walk(Neck, 0.06F * 2F, -0.02F, false, 0.5F,0.01F, f2, 0.8F);
            this.chainFlap(Tail, (0.06F*0.9F), 0.10F, 0.10F, f2, 1F);
            this.chainSwing(Tail, (0.06F*0.9F) * 2F, 0.05F, 0.06F, f2, 1F);
            return;
        }

        //float speed = masterSpeed / 2.625F;
        float speed = masterSpeed / 2.225F;
        if (Diadectes.getIsFast()) {
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
        this.flap(Bodyfront, speed, -0.08F, false, 5.0F,-0.04F, f2, 1.0F);

        this.walk(Bodyfront, speed * 2, 0.05F, false, 2.5F,-0.01F, f2, 0.8F);

        this.swing(Neck, speed, 0.10F, false, 0.5F,-0.05F, f2, 0.8F);
        this.walk(Neck, speed * 2, -0.02F, false, 0.5F,0.01F, f2, 0.8F);
        this.chainFlap(Tail, (speed*0.6F), 0.20F, 0.2F, f2, 1F);
        this.chainSwing(Tail, (speed*0.6F) * 2F, 0.10F, 0.12F, f2, 1F);

        this.Hips.offsetZ = this.moveBoxExtended(speed * 2, (float) Math.toRadians(2.2), false, 1.5F, f2, 1);

    }

    public void animate(IAnimatedEntity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        EntityPrehistoricFloraDiadectes e = (EntityPrehistoricFloraDiadectes) entity;
        animator.update(entity);
        this.resetToDefaultPose();
        setRotationAngles(f, f1, f2, f3, f4, f5, (Entity) entity);

        animator.setAnimation(e.ATTACK_ANIMATION); //20 ticks
        animator.startKeyframe(5);
        animator.move(this.Head, 0,0,-0.3F);
        animator.rotate(this.Head, (float) Math.toRadians(-10), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(this.Lowerjawback, (float) Math.toRadians(20), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.endKeyframe();
        animator.setStaticKeyframe(5);
        animator.resetKeyframe(2);

        animator.setAnimation(e.EAT_ANIMATION); //10 ticks
        animator.startKeyframe(4);
        animator.rotate(this.Neck, (float) Math.toRadians(45), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(this.Head, (float) Math.toRadians(-5), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(this.Lowerjawback, (float) Math.toRadians(20), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.endKeyframe();
        animator.setStaticKeyframe(3);
        animator.resetKeyframe(3);

        animator.setAnimation(e.ROAR_ANIMATION);
        animator.startKeyframe(10);
        animator.rotate(this.Neck, (float) Math.toRadians(-20), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(this.Head, (float) Math.toRadians(-5), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(this.Lowerjawback, (float) Math.toRadians(20), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(this.Belly, (float) Math.toRadians(5), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(this.Belly, (float) Math.toRadians(5), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.move(this.Leftupperarm, 0,-1.2F,0);
        animator.move(this.Rightupperarm, 0,-1.2F,0);
        animator.rotate(this.Leftupperarm, (float) Math.toRadians(0), (float) Math.toRadians(-5), (float) Math.toRadians(-20));
        animator.rotate(this.Rightupperarm, (float) Math.toRadians(0), (float) Math.toRadians(5), (float) Math.toRadians(20));
        animator.rotate(this.Leftlowerarm, (float) Math.toRadians(0), (float) Math.toRadians(5), (float) Math.toRadians(21));
        animator.rotate(this.Rightlowerarm, (float) Math.toRadians(0), (float) Math.toRadians(5), (float) Math.toRadians(-21));
        animator.endKeyframe();
        animator.setStaticKeyframe(10);
        animator.resetKeyframe(10);

        animator.setAnimation(e.LAY_ANIMATION); //50 ticks
        animator.startKeyframe(10);
        animator.move(this.Hips, 0, 2,0);
        animator.rotate(this.Hips, (float) Math.toRadians(-10), 0,0);
        animator.rotate(this.Belly, (float) Math.toRadians(10), 0,0);
        animator.rotate(this.Tailbase, (float) Math.toRadians(29), 0,0);
        animator.rotate(this.Leftthigh, (float) Math.toRadians(12), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(this.Rightthigh, (float) Math.toRadians(12), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(this.Lefthindfoot, (float) Math.toRadians(8), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(this.Righthindfoot, (float) Math.toRadians(8), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.endKeyframe();
        animator.setStaticKeyframe(30);
        animator.resetKeyframe(10);
    }
}
