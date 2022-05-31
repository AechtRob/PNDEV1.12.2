package net.lepidodendron.entity.model.entity;

import net.ilexiconn.llibrary.client.model.ModelAnimator;
import net.ilexiconn.llibrary.client.model.tools.AdvancedModelBase;
import net.ilexiconn.llibrary.client.model.tools.AdvancedModelRenderer;
import net.ilexiconn.llibrary.server.animation.IAnimatedEntity;
import net.lepidodendron.entity.EntityPrehistoricFloraSpathicephalus;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

public class ModelSpathicephalus extends AdvancedModelBase {
    public AdvancedModelRenderer Hips;
    public AdvancedModelRenderer Bodymiddle;
    public AdvancedModelRenderer Tail1;
    public AdvancedModelRenderer Leftthigh;
    public AdvancedModelRenderer Rightthigh;
    public AdvancedModelRenderer Bodyfront;
    public AdvancedModelRenderer Neck;
    public AdvancedModelRenderer Leftupperarm;
    public AdvancedModelRenderer Rightupperarm;
    public AdvancedModelRenderer Head;
    public AdvancedModelRenderer Upperjaw1;
    public AdvancedModelRenderer Lowerjaw1;
    public AdvancedModelRenderer Headslope1;
    public AdvancedModelRenderer Lefteye;
    public AdvancedModelRenderer Righteye;
    public AdvancedModelRenderer Leftgill;
    public AdvancedModelRenderer Rightgill;
    public AdvancedModelRenderer Upperjaw2;
    public AdvancedModelRenderer Upperteeth1;
    public AdvancedModelRenderer Upperteeth2;
    public AdvancedModelRenderer Lowerjaw2;
    public AdvancedModelRenderer Jawparting;
    public AdvancedModelRenderer Lowerjaw3;
    public AdvancedModelRenderer Lowerteeth1;
    public AdvancedModelRenderer Lowerteeth2;
    public AdvancedModelRenderer Headslope2;
    public AdvancedModelRenderer Leftlowerarm;
    public AdvancedModelRenderer Leftfrontfoot;
    public AdvancedModelRenderer Rightlowerarm;
    public AdvancedModelRenderer Rightfrontfoot;
    public AdvancedModelRenderer Tail2;
    public AdvancedModelRenderer Tailfin1;
    public AdvancedModelRenderer Tail3;
    public AdvancedModelRenderer Tailfin2;
    public AdvancedModelRenderer Tail4;
    public AdvancedModelRenderer Tailfin3;
    public AdvancedModelRenderer Tail5;
    public AdvancedModelRenderer Tailfin4;
    public AdvancedModelRenderer Tailfin5;
    public AdvancedModelRenderer Leftshin;
    public AdvancedModelRenderer Lefthindfoot;
    public AdvancedModelRenderer Rightshin;
    public AdvancedModelRenderer Righthindfoot;

    private ModelAnimator animator;

    public ModelSpathicephalus() {
        this.textureWidth = 100;
        this.textureHeight = 100;
        this.Tailfin3 = new AdvancedModelRenderer(this, 80, 0);
        this.Tailfin3.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.Tailfin3.addBox(0.0F, -5.5F, 0.0F, 0, 10, 10, 0.0F);
        this.Leftgill = new AdvancedModelRenderer(this, 38, 78);
        this.Leftgill.setRotationPoint(4.800000190734863F, 0.5F, -0.5F);
        this.Leftgill.addBox(0.0F, -2.5F, 0.0F, 4, 5, 0, 0.0F);
        this.setRotateAngle(Leftgill, 0.06370451936226872F, -1.1463322580361979F, -0.42446406875869874F);
        this.Rightthigh = new AdvancedModelRenderer(this, 5, 0);
        this.Rightthigh.setRotationPoint(-4.0F, 3.0F, 3.0F);
        this.Rightthigh.addBox(-2.0F, -1.0F, -1.5F, 3, 5, 3, 0.0F);
        this.setRotateAngle(Rightthigh, -1.8467328389246225F, 1.1674507260063627F, 0.0F);
        this.Neck = new AdvancedModelRenderer(this, 30, 42);
        this.Neck.setRotationPoint(0.0F, 0.5F, -8.5F);
        this.Neck.addBox(-4.5F, -1.0F, -3.0F, 9, 6, 4, 0.0F);
        this.setRotateAngle(Neck, -0.021293017373673524F, 0.0F, 0.0F);
        this.Leftupperarm = new AdvancedModelRenderer(this, 31, 0);
        this.Leftupperarm.setRotationPoint(4.0F, 4.099999904632568F, -6.0F);
        this.Leftupperarm.addBox(-1.0F, -1.0F, -1.5F, 3, 5, 3, 0.0F);
        this.setRotateAngle(Leftupperarm, 0.9339256534473936F, 0.8278096695472326F, -0.5731661290180989F);
        this.Tailfin1 = new AdvancedModelRenderer(this, 59, 12);
        this.Tailfin1.setRotationPoint(0.0F, -0.800000011920929F, -0.5F);
        this.Tailfin1.addBox(0.0F, -1.0F, 0.0F, 0, 1, 6, 0.0F);
        this.setRotateAngle(Tailfin1, 0.08482300397719036F, 0.0F, 0.0F);
        this.Tail4 = new AdvancedModelRenderer(this, 19, 12);
        this.Tail4.setRotationPoint(0.0F, 0.5F, 9.5F);
        this.Tail4.addBox(-1.0F, -1.5F, 0.0F, 2, 3, 8, 0.0F);
        this.Tail1 = new AdvancedModelRenderer(this, 21, 26);
        this.Tail1.setRotationPoint(0.0F, 0.800000011920929F, 5.5F);
        this.Tail1.addBox(-3.0F, -1.5F, -0.5F, 6, 5, 6, 0.0F);
        this.setRotateAngle(Tail1, -0.06370451936226872F, 0.0F, 0.0F);
        this.Tail2 = new AdvancedModelRenderer(this, 0, 16);
        this.Tail2.setRotationPoint(0.0F, 0.5F, 5.0F);
        this.Tail2.addBox(-2.5F, -1.5F, 0.0F, 5, 4, 8, 0.0F);
        this.setRotateAngle(Tail2, 0.04241150198859518F, 0.0F, 0.0F);
        this.Bodyfront = new AdvancedModelRenderer(this, 0, 44);
        this.Bodyfront.setRotationPoint(0.0F, 0.10000000149011612F, -14.0F);
        this.Bodyfront.addBox(-5.0F, -1.0F, -8.5F, 10, 7, 9, 0.0F);
        this.setRotateAngle(Bodyfront, 0.06370451936226872F, 0.0F, 0.0F);
        this.Tailfin5 = new AdvancedModelRenderer(this, 59, 0);
        this.Tailfin5.setRotationPoint(0.0F, -0.5F, 0.0F);
        this.Tailfin5.addBox(0.0F, -3.5F, 0.0F, 0, 7, 10, 0.0F);
        this.Headslope1 = new AdvancedModelRenderer(this, 70, 53);
        this.Headslope1.setRotationPoint(0.0F, -1.0F, -5.0F);
        this.Headslope1.addBox(-4.0F, 0.0F, -4.0F, 8, 2, 4, 0.0F);
        this.setRotateAngle(Headslope1, 0.08482300397719036F, 0.0F, 0.0F);
        this.Leftshin = new AdvancedModelRenderer(this, 88, 0);
        this.Leftshin.setRotationPoint(0.5F, 3.0F, -1.0F);
        this.Leftshin.addBox(-1.5F, 0.0F, -1.0F, 3, 5, 3, 0.0F);
        this.setRotateAngle(Leftshin, 1.4009757319863043F, 0.12740903872453743F, 0.0F);
        this.Rightlowerarm = new AdvancedModelRenderer(this, 66, 0);
        this.Rightlowerarm.setRotationPoint(-0.5F, 3.0F, 0.0F);
        this.Rightlowerarm.addBox(-1.0F, 0.0F, -1.0F, 2, 4, 2, 0.0F);
        this.setRotateAngle(Rightlowerarm, -1.31615285284479F, 0.5307546228683145F, -0.12740903872453743F);
        this.Rightfrontfoot = new AdvancedModelRenderer(this, 66, 32);
        this.Rightfrontfoot.setRotationPoint(-0.5F, 3.5F, 0.0F);
        this.Rightfrontfoot.addBox(-2.0F, 0.0F, -3.0F, 4, 1, 4, 0.0F);
        this.setRotateAngle(Rightfrontfoot, -0.169820528229565F, 1.6556193390944651F, -0.9765117298066328F);
        this.Lowerjaw1 = new AdvancedModelRenderer(this, 39, 62);
        this.Lowerjaw1.setRotationPoint(0.0F, 2.0F, 0.0F);
        this.Lowerjaw1.addBox(-5.0F, 0.0F, -5.0F, 10, 2, 5, 0.0F);
        this.Upperteeth1 = new AdvancedModelRenderer(this, 66, 61);
        this.Upperteeth1.setRotationPoint(0.009999999776482582F, -0.5F, -3.9000000953674316F);
        this.Upperteeth1.addBox(-4.0F, 0.0F, 0.0F, 8, 1, 4, 0.0F);
        this.setRotateAngle(Upperteeth1, 0.021293017373673524F, 0.0F, 0.0F);
        this.Bodymiddle = new AdvancedModelRenderer(this, 0, 78);
        this.Bodymiddle.setRotationPoint(0.0F, -0.20000000298023224F, -3.5F);
        this.Bodymiddle.addBox(-5.5F, -1.0F, -14.5F, 11, 7, 15, 0.0F);
        this.setRotateAngle(Bodymiddle, 0.04241150198859518F, 0.0F, 0.0F);
        this.Tailfin2 = new AdvancedModelRenderer(this, 84, 13);
        this.Tailfin2.setRotationPoint(0.009999999776482582F, 0.0F, 0.0F);
        this.Tailfin2.addBox(0.0F, -4.5F, 0.0F, 0, 8, 8, 0.0F);
        this.Tail3 = new AdvancedModelRenderer(this, 0, 29);
        this.Tail3.setRotationPoint(0.0F, 0.10000000149011612F, 7.0F);
        this.Tail3.addBox(-1.5F, -1.5F, 0.0F, 3, 4, 10, 0.0F);
        this.setRotateAngle(Tail3, 0.08482300397719036F, 0.0F, 0.0F);
        this.Jawparting = new AdvancedModelRenderer(this, 38, 70);
        this.Jawparting.setRotationPoint(0.009999999776482582F, 0.10000000149011612F, -3.5F);
        this.Jawparting.addBox(-4.5F, -3.0F, 0.0F, 9, 3, 3, 0.0F);
        this.setRotateAngle(Jawparting, -0.38205256260891435F, 0.0F, 0.0F);
        this.Lowerjaw3 = new AdvancedModelRenderer(this, 81, 73);
        this.Lowerjaw3.setRotationPoint(0.0F, -2.0F, -4.0F);
        this.Lowerjaw3.addBox(-3.5F, 0.0F, -2.0F, 7, 2, 2, 0.0F);
        this.Lefthindfoot = new AdvancedModelRenderer(this, 40, 24);
        this.Lefthindfoot.setRotationPoint(0.0F, 4.0F, 0.0F);
        this.Lefthindfoot.addBox(-2.5F, 0.0F, -4.0F, 5, 2, 5, 0.0F);
        this.setRotateAngle(Lefthindfoot, 0.5094616179782085F, 0.38205256260891435F, 0.2972295835988592F);
        this.Lowerteeth1 = new AdvancedModelRenderer(this, 66, 67);
        this.Lowerteeth1.setRotationPoint(0.0F, -1.5F, -3.799999952316284F);
        this.Lowerteeth1.addBox(-4.0F, -1.0F, 0.0F, 8, 1, 4, 0.0F);
        this.setRotateAngle(Lowerteeth1, -0.021293017373673524F, 0.0F, 0.0F);
        this.Rightgill = new AdvancedModelRenderer(this, 47, 78);
        this.Rightgill.setRotationPoint(-4.800000190734863F, 0.5F, -0.5F);
        this.Rightgill.addBox(-4.0F, -2.5F, 0.0F, 4, 5, 0, 0.0F);
        this.setRotateAngle(Rightgill, 0.06370451936226872F, 1.1463322580361979F, 0.42446406875869874F);
        this.Lefteye = new AdvancedModelRenderer(this, 90, 60);
        this.Lefteye.setRotationPoint(0.20000000298023224F, -1.0F, -5.199999809265137F);
        this.Lefteye.addBox(0.0F, 0.0F, 0.0F, 2, 2, 3, 0.0F);
        this.setRotateAngle(Lefteye, -0.23352505591421208F, -0.08482300397719036F, -0.38205256260891435F);
        this.Head = new AdvancedModelRenderer(this, 39, 53);
        this.Head.setRotationPoint(0.0F, 0.10000000149011612F, -1.5F);
        this.Head.addBox(-5.0F, -1.0F, -5.0F, 10, 3, 5, 0.0F);
        this.setRotateAngle(Head, 0.021293017373673524F, 0.0F, 0.0F);
        this.Rightshin = new AdvancedModelRenderer(this, 75, 0);
        this.Rightshin.setRotationPoint(-0.5F, 3.0F, -1.0F);
        this.Rightshin.addBox(-1.5F, 0.0F, -1.0F, 3, 5, 3, 0.0F);
        this.setRotateAngle(Rightshin, 1.4009757319863043F, -0.12740903872453743F, 0.0F);
        this.Righteye = new AdvancedModelRenderer(this, 90, 66);
        this.Righteye.setRotationPoint(-0.20000000298023224F, -1.0F, -5.199999809265137F);
        this.Righteye.addBox(-2.0F, 0.0F, 0.0F, 2, 2, 3, 0.0F);
        this.setRotateAngle(Righteye, -0.23352505591421208F, 0.08482300397719036F, 0.38205256260891435F);
        this.Lowerjaw2 = new AdvancedModelRenderer(this, 53, 39);
        this.Lowerjaw2.setRotationPoint(0.0F, 2.0F, -5.0F);
        this.Lowerjaw2.addBox(-4.5F, -2.0F, -4.0F, 9, 2, 4, 0.0F);
        this.setRotateAngle(Lowerjaw2, -0.021293017373673524F, 0.0F, 0.0F);
        this.Tailfin4 = new AdvancedModelRenderer(this, 42, 1);
        this.Tailfin4.setRotationPoint(-0.009999999776482582F, -1.0F, 0.0F);
        this.Tailfin4.addBox(0.0F, -4.5F, 0.0F, 0, 9, 8, 0.0F);
        this.Righthindfoot = new AdvancedModelRenderer(this, 61, 24);
        this.Righthindfoot.setRotationPoint(0.0F, 4.0F, 0.0F);
        this.Righthindfoot.addBox(-2.5F, 0.0F, -4.0F, 5, 2, 5, 0.0F);
        this.setRotateAngle(Righthindfoot, 0.5094616179782085F, -0.38205256260891435F, -0.2972295835988592F);
        this.Upperteeth2 = new AdvancedModelRenderer(this, 84, 49);
        this.Upperteeth2.setRotationPoint(0.009999999776482582F, -0.5F, -1.899999976158142F);
        this.Upperteeth2.addBox(-3.0F, 0.0F, 0.0F, 6, 1, 2, 0.0F);
        this.Leftlowerarm = new AdvancedModelRenderer(this, 57, 0);
        this.Leftlowerarm.setRotationPoint(0.5F, 3.0F, 0.0F);
        this.Leftlowerarm.addBox(-1.0F, 0.0F, -1.0F, 2, 4, 2, 0.0F);
        this.setRotateAngle(Leftlowerarm, -1.31615285284479F, -0.5307546228683145F, 0.12740903872453743F);
        this.Upperjaw2 = new AdvancedModelRenderer(this, 62, 73);
        this.Upperjaw2.setRotationPoint(0.0F, 0.0F, -4.0F);
        this.Upperjaw2.addBox(-3.5F, -2.0F, -2.0F, 7, 2, 2, 0.0F);
        this.Hips = new AdvancedModelRenderer(this, 0, 61);
        this.Hips.setRotationPoint(0.0F, 17.0F, 7.0F);
        this.Hips.addBox(-4.5F, -1.0F, -4.0F, 9, 6, 10, 0.0F);
        this.setRotateAngle(Hips, -0.06370451769779302F, 0.0F, 0.0F);
        this.Rightupperarm = new AdvancedModelRenderer(this, 44, 0);
        this.Rightupperarm.setRotationPoint(-4.0F, 4.099999904632568F, -6.0F);
        this.Rightupperarm.addBox(-2.0F, -1.0F, -1.5F, 3, 5, 3, 0.0F);
        this.setRotateAngle(Rightupperarm, 0.9879334285107374F, -0.8501498626674714F, 0.5330235695380348F);
        this.Lowerteeth2 = new AdvancedModelRenderer(this, 84, 45);
        this.Lowerteeth2.setRotationPoint(0.0F, 0.5F, -1.7999999523162842F);
        this.Lowerteeth2.addBox(-3.0F, -1.0F, 0.0F, 6, 1, 2, 0.0F);
        this.Leftthigh = new AdvancedModelRenderer(this, 18, 0);
        this.Leftthigh.setRotationPoint(4.0F, 3.0F, 3.0F);
        this.Leftthigh.addBox(-1.0F, -1.0F, -1.5F, 3, 5, 3, 0.0F);
        this.setRotateAngle(Leftthigh, -1.8467328389246225F, -1.1674507260063627F, 0.0F);
        this.Headslope2 = new AdvancedModelRenderer(this, 80, 41);
        this.Headslope2.setRotationPoint(0.0F, 0.0F, -4.0F);
        this.Headslope2.addBox(-3.0F, 0.0F, -2.0F, 6, 1, 2, 0.0F);
        this.setRotateAngle(Headslope2, 0.1911135497644277F, 0.0F, 0.0F);
        this.Leftfrontfoot = new AdvancedModelRenderer(this, 49, 32);
        this.Leftfrontfoot.setRotationPoint(0.5F, 3.5F, 0.0F);
        this.Leftfrontfoot.addBox(-2.0F, 0.0F, -3.0F, 4, 1, 4, 0.0F);
        this.setRotateAngle(Leftfrontfoot, -0.169820528229565F, -1.6556193390944651F, 0.9765117298066328F);
        this.Upperjaw1 = new AdvancedModelRenderer(this, 57, 46);
        this.Upperjaw1.setRotationPoint(0.0F, 2.0F, -5.0F);
        this.Upperjaw1.addBox(-4.5F, -2.0F, -4.0F, 9, 2, 4, 0.0F);
        this.setRotateAngle(Upperjaw1, -0.021293017373673524F, 0.0F, 0.0F);
        this.Tail5 = new AdvancedModelRenderer(this, 40, 32);
        this.Tail5.setRotationPoint(0.0F, 0.0F, 7.5F);
        this.Tail5.addBox(-0.5F, -1.0F, 0.0F, 1, 2, 6, 0.0F);
        this.Tail3.addChild(this.Tailfin3);
        this.Head.addChild(this.Leftgill);
        this.Hips.addChild(this.Rightthigh);
        this.Bodyfront.addChild(this.Neck);
        this.Bodyfront.addChild(this.Leftupperarm);
        this.Tail1.addChild(this.Tailfin1);
        this.Tail3.addChild(this.Tail4);
        this.Hips.addChild(this.Tail1);
        this.Tail1.addChild(this.Tail2);
        this.Bodymiddle.addChild(this.Bodyfront);
        this.Tail5.addChild(this.Tailfin5);
        this.Head.addChild(this.Headslope1);
        this.Leftthigh.addChild(this.Leftshin);
        this.Rightupperarm.addChild(this.Rightlowerarm);
        this.Rightlowerarm.addChild(this.Rightfrontfoot);
        this.Head.addChild(this.Lowerjaw1);
        this.Upperjaw1.addChild(this.Upperteeth1);
        this.Hips.addChild(this.Bodymiddle);
        this.Tail2.addChild(this.Tailfin2);
        this.Tail2.addChild(this.Tail3);
        this.Lowerjaw1.addChild(this.Jawparting);
        this.Lowerjaw2.addChild(this.Lowerjaw3);
        this.Leftshin.addChild(this.Lefthindfoot);
        this.Lowerjaw2.addChild(this.Lowerteeth1);
        this.Head.addChild(this.Rightgill);
        this.Head.addChild(this.Lefteye);
        this.Neck.addChild(this.Head);
        this.Rightthigh.addChild(this.Rightshin);
        this.Head.addChild(this.Righteye);
        this.Lowerjaw1.addChild(this.Lowerjaw2);
        this.Tail4.addChild(this.Tailfin4);
        this.Rightshin.addChild(this.Righthindfoot);
        this.Upperjaw2.addChild(this.Upperteeth2);
        this.Leftupperarm.addChild(this.Leftlowerarm);
        this.Upperjaw1.addChild(this.Upperjaw2);
        this.Bodyfront.addChild(this.Rightupperarm);
        this.Lowerjaw3.addChild(this.Lowerteeth2);
        this.Hips.addChild(this.Leftthigh);
        this.Headslope1.addChild(this.Headslope2);
        this.Leftlowerarm.addChild(this.Leftfrontfoot);
        this.Head.addChild(this.Upperjaw1);
        this.Tail4.addChild(this.Tail5);

        updateDefaultPose();
        animator = ModelAnimator.create();
    }

    @Override
    public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        animate((IAnimatedEntity) entity, f, f1, f2, f3, f4, f5);
        this.Hips.render(f5 * 0.275f);
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
        this.Hips.offsetY = 1.085F; //72

        EntityPrehistoricFloraSpathicephalus Spathicephalus = (EntityPrehistoricFloraSpathicephalus) e;

        this.faceTarget(f3, f4, 8, Head);

        float speed = 0.16F;
        AdvancedModelRenderer[] Tail = {this.Tail1, this.Tail2, this.Tail3, this.Tail4, this.Tail5};
        AdvancedModelRenderer[] Torso = {this.Head, this.Neck, this.Bodyfront, this.Bodymiddle, this.Hips};

        if (!Spathicephalus.isReallyInWater()) { //walk on land
            if (f3 == 0.0F) {
                return;
            }

            if (Spathicephalus.getBlinking()) {
                this.flap(Lefteye,0.008F, 0.05F,false, 0F,0.8F, f2, 0.2F);
                this.flap(Righteye,0.008F, 0.05F,true, 0F,0.8F, f2, 0.2F);
            }

            ////this.flap(Leftthigh, speed, 0.65F, false, -3, -0.35F, f2, 0.5F);
            this.flap(Leftthigh, speed, 0.25F, false, -3, -0.25F, f2, 0.5F);
            ////this.swing(Leftthigh, speed, -0.3F, true, -1, 0.25F, f2, 0.5F);
            this.swing(Leftthigh, speed, -1F, true, -1, 0.5F, f2, 0.5F);
            this.walk(Leftshin, speed, -0.6F, true, -3, 0.0F, f2, 0.8F);
            //this.flap(Lefthindfoot, speed, 0.5F, false, 3, 0.4F, f2, 0.3F);
            //this.walk(Lefthindfoot, speed, 0.8F, false, 3, 0.4F, f2, 0.5F);
            //this.swing(Lefthindfoot, speed, 0.4F, false, 3, 0F, f2, 0.5F);
            this.flap(Lefthindfoot, speed, 0.5F, false, 0, 0.4F, f2, 0.3F);
            this.walk(Lefthindfoot, speed, 0.8F, false, 0, 0.4F, f2, 0.5F);
            this.swing(Lefthindfoot, speed, 0.4F, false, 0, 0F, f2, 0.5F);

            ////this.flap(Rightthigh, speed, -0.65F, false, 0, 0.35F, f2, 0.5F);
            this.flap(Rightthigh, speed, -0.25F, false, 0, 0.25F, f2, 0.5F);
            ////this.swing(Rightthigh, speed, 0.3F, true, 2, -0.25F, f2, 0.5F);
            this.swing(Rightthigh, speed, 1F, true, 2, -0.5F, f2, 0.5F);
            this.walk(Rightshin, speed, -0.6F, true, 0, 0.0F, f2, 0.8F);
            //this.flap(Righthindfoot, speed, -0.5F, false, 6, -0.4F, f2, 0.3F);
            //this.walk(Righthindfoot, speed, 0.8F, false, 6, 0.4F, f2, 0.5F);
            //this.swing(Righthindfoot, speed, -0.4F, false, 6, 0F, f2, 0.5F);
            this.flap(Righthindfoot, speed, -0.5F, false, 3, -0.4F, f2, 0.3F);
            this.walk(Righthindfoot, speed, 0.8F, false, 3, 0.4F, f2, 0.5F);
            this.swing(Righthindfoot, speed, -0.4F, false, 3, 0F, f2, 0.5F);

            this.flap(Leftupperarm, speed, 0.35F, false, 0, -0.18F, f2, 0.5F);
            this.swing(Leftupperarm, speed, -0.25F, true, 2, 0.1F, f2, 0.5F);
            this.walk(Leftlowerarm, speed, -0.4F, true, 0, 0.0F, f2, 0.8F);
            this.flap(Leftfrontfoot, speed, 0.4F, false, -3, 0.4F, f2, 0.3F);
            this.walk(Leftfrontfoot, speed, 0.6F, false, -3, 0.4F, f2, 0.5F);
            this.swing(Leftfrontfoot, speed, 0.4F, false, -3, 0F, f2, 0.5F);

            this.flap(Rightupperarm, speed, -0.35F, false, -3, 0.18F, f2, 0.5F);
            this.swing(Rightupperarm, speed, 0.25F, true, -1, -0.1F, f2, 0.5F);
            this.walk(Rightlowerarm, speed, -0.4F, true, -3, 0.0F, f2, 0.8F);
            this.flap(Rightfrontfoot, speed, -0.6F, false, 0, -0.4F, f2, 0.3F);
            this.walk(Rightfrontfoot, speed, 0.9F, false, 0, 0.4F, f2, 0.5F);
            this.swing(Rightfrontfoot, speed, -0.5F, false, 0, 0F, f2, 0.5F);

            this.chainWave(Tail, speed, 0.05F, -3, f2, 1);
            this.chainSwing(Tail, speed, 0.22F, -3, f2, 0.8F);
            this.chainSwing(Torso, speed, 0.1F, -3, f2, 1);
        }
        else {
            if (Spathicephalus.isFeedAnimation()) {
                return;
            }
            speed = speed * 2F;
            this.Lefthindfoot.rotateAngleX = (float) Math.toRadians(45);
            this.Righthindfoot.rotateAngleX = (float) Math.toRadians(45);

            this.Leftthigh.rotateAngleZ= (float) Math.toRadians(20);
            this.Leftshin.rotateAngleZ= (float) Math.toRadians(-30);
            this.Leftthigh.rotateAngleY= (float) Math.toRadians(-30);

                this.Leftthigh.rotateAngleX = (float) Math.toRadians(20);


            this.Rightthigh.rotateAngleZ= (float) Math.toRadians(-20);
            this.Rightshin.rotateAngleZ= (float) Math.toRadians(30);
            this.Rightthigh.rotateAngleY= (float) Math.toRadians(30);

                this.Rightthigh.rotateAngleX= (float) Math.toRadians(20);


            this.Leftfrontfoot.rotateAngleX = (float) Math.toRadians(20);
            this.Rightfrontfoot.rotateAngleX = (float) Math.toRadians(20);

            this.Leftlowerarm.rotateAngleZ= (float) Math.toRadians(-15);
            this.Rightlowerarm.rotateAngleZ= (float) Math.toRadians(15);

            AdvancedModelRenderer[] BackL = {this.Leftthigh, this.Leftshin, this.Lefthindfoot};
            AdvancedModelRenderer[] BackR = {this.Rightthigh, this.Rightshin, this.Righthindfoot};

            this.chainWave(BackL, speed * 0.5F, 0.25F, -3, f2, 0.75F);
            this.chainWave(BackR, speed * 0.5F, 0.25F, 0, f2, 0.75F);

            this.flap(Leftupperarm, speed, 0.7F, false, 0, -0.35F, f2, 0.8F);
            this.swing(Leftupperarm, speed, -0.5F, true, 2, 0.2F, f2, 0.8F);
            this.walk(Leftlowerarm, speed, -0.8F, true, 0, 0.0F, f2, 0.9F);
            this.walk(Leftfrontfoot, speed, -0.5F, true, 1, 0.3F, f2, 0.9F);

            this.flap(Rightupperarm, speed, -0.7F, false, -3, 0.35F, f2, 0.8F);
            this.swing(Rightupperarm, speed, 0.5F, true, -1, -0.2F, f2, 0.8F);
            this.walk(Rightlowerarm, speed, -0.8F, true, -3, 0.0F, f2, 0.9F);
            this.walk(Rightfrontfoot, speed, -0.5F, true, -2, 0.3F, f2, 0.9F);

            this.chainWave(Tail, speed * 1.22F, 0.05F, -3, f2, 1);
            this.chainSwing(Tail, speed * 1.22F, 0.4F, -3, f2, 0.85F);
            this.chainSwing(Torso, speed, 0.1F, -3, f2, 1);

        }
    }

    public void animate(IAnimatedEntity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        EntityPrehistoricFloraSpathicephalus e = (EntityPrehistoricFloraSpathicephalus) entity;
        animator.update(entity);
        this.resetToDefaultPose();
        setRotationAngles(f, f1, f2, f3, f4, f5, (Entity) entity);

        animator.setAnimation(e.ATTACK_ANIMATION);
        animator.startKeyframe(5);
        animator.move(this.Head, 0,0,-2F);
        animator.rotate(this.Head, (float) Math.toRadians(-10), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(this.Lowerjaw1, (float) Math.toRadians(20), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.endKeyframe();
        animator.setStaticKeyframe(5);
        animator.resetKeyframe(2);

        animator.setAnimation(e.ROAR_ANIMATION);
        animator.startKeyframe(10);
        animator.rotate(this.Leftupperarm,(float) Math.toRadians(-15), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(this.Rightupperarm,(float) Math.toRadians(-15), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(this.Leftlowerarm,(float) Math.toRadians(30), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(this.Rightlowerarm,(float) Math.toRadians(30), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(this.Bodyfront,(float) Math.toRadians(-15), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(this.Neck, (float) Math.toRadians(-5), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(this.Head, (float) Math.toRadians(-5), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(this.Lowerjaw1, (float) Math.toRadians(20), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.endKeyframe();
        animator.setStaticKeyframe(10);
        animator.resetKeyframe(10);

        animator.setAnimation(e.FEED_ANIMATION);
        animator.startKeyframe(20);
        animator.rotate(this.Neck, (float) Math.toRadians(20), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.endKeyframe();
        animator.setStaticKeyframe(10);
        animator.startKeyframe(20);
        animator.rotate(this.Neck, (float) Math.toRadians(20), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(this.Head, (float) Math.toRadians(10), (float) Math.toRadians(20), (float) Math.toRadians(0));
        animator.rotate(this.Bodymiddle, (float) Math.toRadians(-6), (float) Math.toRadians(20), (float) Math.toRadians(0));
        animator.rotate(this.Leftupperarm, (float) Math.toRadians(20), (float) Math.toRadians(20), (float) Math.toRadians(0));
        animator.rotate(this.Rightupperarm, (float) Math.toRadians(-20), (float) Math.toRadians(20), (float) Math.toRadians(0));
        animator.rotate(this.Leftlowerarm, (float) Math.toRadians(-33), (float) Math.toRadians(20), (float) Math.toRadians(0));
        animator.rotate(this.Rightlowerarm, (float) Math.toRadians(33), (float) Math.toRadians(20), (float) Math.toRadians(0));
        animator.endKeyframe();
        animator.setStaticKeyframe(5);
        animator.startKeyframe(5);
        animator.rotate(this.Neck, (float) Math.toRadians(20), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(this.Head, (float) Math.toRadians(5), (float) Math.toRadians(20), (float) Math.toRadians(0));
        animator.rotate(this.Lowerjaw1, (float) Math.toRadians(20), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(this.Bodymiddle, (float) Math.toRadians(-6), (float) Math.toRadians(20), (float) Math.toRadians(0));
        animator.rotate(this.Leftupperarm, (float) Math.toRadians(20), (float) Math.toRadians(20), (float) Math.toRadians(0));
        animator.rotate(this.Rightupperarm, (float) Math.toRadians(-20), (float) Math.toRadians(20), (float) Math.toRadians(0));
        animator.rotate(this.Leftlowerarm, (float) Math.toRadians(-33), (float) Math.toRadians(20), (float) Math.toRadians(0));
        animator.rotate(this.Rightlowerarm, (float) Math.toRadians(33), (float) Math.toRadians(20), (float) Math.toRadians(0));
        animator.endKeyframe();
        animator.setStaticKeyframe(5);
        animator.startKeyframe(5);
        animator.rotate(this.Neck, (float) Math.toRadians(20), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(this.Head, (float) Math.toRadians(0), (float) Math.toRadians(20), (float) Math.toRadians(0));
        animator.rotate(this.Lowerjaw1, (float) Math.toRadians(0), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(this.Bodymiddle, (float) Math.toRadians(-6), (float) Math.toRadians(20), (float) Math.toRadians(0));
        animator.rotate(this.Leftupperarm, (float) Math.toRadians(20), (float) Math.toRadians(20), (float) Math.toRadians(0));
        animator.rotate(this.Rightupperarm, (float) Math.toRadians(-20), (float) Math.toRadians(20), (float) Math.toRadians(0));
        animator.rotate(this.Leftlowerarm, (float) Math.toRadians(-33), (float) Math.toRadians(20), (float) Math.toRadians(0));
        animator.rotate(this.Rightlowerarm, (float) Math.toRadians(33), (float) Math.toRadians(20), (float) Math.toRadians(0));
        animator.endKeyframe();
        animator.setStaticKeyframe(5);
        animator.startKeyframe(10);
        animator.rotate(this.Neck, (float) Math.toRadians(20), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(this.Head, (float) Math.toRadians(5), (float) Math.toRadians(-20), (float) Math.toRadians(0));
        animator.rotate(this.Lowerjaw1, (float) Math.toRadians(20), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(this.Bodymiddle, (float) Math.toRadians(-6), (float) Math.toRadians(20), (float) Math.toRadians(0));
        animator.rotate(this.Leftupperarm, (float) Math.toRadians(20), (float) Math.toRadians(20), (float) Math.toRadians(0));
        animator.rotate(this.Rightupperarm, (float) Math.toRadians(-20), (float) Math.toRadians(20), (float) Math.toRadians(0));
        animator.rotate(this.Leftlowerarm, (float) Math.toRadians(-33), (float) Math.toRadians(20), (float) Math.toRadians(0));
        animator.rotate(this.Rightlowerarm, (float) Math.toRadians(33), (float) Math.toRadians(20), (float) Math.toRadians(0));
        animator.endKeyframe();
        animator.setStaticKeyframe(5);
        animator.startKeyframe(5);
        animator.rotate(this.Neck, (float) Math.toRadians(20), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(this.Head, (float) Math.toRadians(0), (float) Math.toRadians(-20), (float) Math.toRadians(0));
        animator.rotate(this.Lowerjaw1, (float) Math.toRadians(0), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(this.Bodymiddle, (float) Math.toRadians(-6), (float) Math.toRadians(20), (float) Math.toRadians(0));
        animator.rotate(this.Leftupperarm, (float) Math.toRadians(20), (float) Math.toRadians(20), (float) Math.toRadians(0));
        animator.rotate(this.Rightupperarm, (float) Math.toRadians(-20), (float) Math.toRadians(20), (float) Math.toRadians(0));
        animator.rotate(this.Leftlowerarm, (float) Math.toRadians(-33), (float) Math.toRadians(20), (float) Math.toRadians(0));
        animator.rotate(this.Rightlowerarm, (float) Math.toRadians(33), (float) Math.toRadians(20), (float) Math.toRadians(0));
        animator.endKeyframe();
        animator.setStaticKeyframe(5);
        animator.resetKeyframe(20);
    }
}
