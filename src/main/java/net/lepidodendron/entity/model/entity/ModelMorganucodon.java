package net.lepidodendron.entity.model.entity;

import net.ilexiconn.llibrary.client.model.ModelAnimator;
import net.ilexiconn.llibrary.server.animation.IAnimatedEntity;
import net.lepidodendron.entity.EntityPrehistoricFloraMorganucodon;
import net.lepidodendron.entity.model.ModelBasePalaeopedia;
import net.lepidodendron.entity.model.llibraryextensions.AdvancedModelRendererExtended;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

public class ModelMorganucodon extends ModelBasePalaeopedia {
    public AdvancedModelRendererExtended Hips;
    public AdvancedModelRendererExtended Tailbase;
    public AdvancedModelRendererExtended Bodymiddle;
    public AdvancedModelRendererExtended Leftthigh;
    public AdvancedModelRendererExtended Rightthigh;
    public AdvancedModelRendererExtended Tailmiddle;
    public AdvancedModelRendererExtended Tailend;
    public AdvancedModelRendererExtended Bodyfront;
    public AdvancedModelRendererExtended Neck;
    public AdvancedModelRendererExtended Leftupperarm;
    public AdvancedModelRendererExtended Rightupperarm;
    public AdvancedModelRendererExtended Head;
    public AdvancedModelRendererExtended Eyeportion;
    public AdvancedModelRendererExtended Lowerjawbase;
    public AdvancedModelRendererExtended Snout;
    public AdvancedModelRendererExtended Uppermiddleteeth;
    public AdvancedModelRendererExtended Upperbackteeth;
    public AdvancedModelRendererExtended Nose;
    public AdvancedModelRendererExtended Upperfrontteeth;
    public AdvancedModelRendererExtended Leftupperfang;
    public AdvancedModelRendererExtended Rightupperfang;
    public AdvancedModelRendererExtended Lowerjawmiddle;
    public AdvancedModelRendererExtended Lowerjawfront;
    public AdvancedModelRendererExtended Jawparting;
    public AdvancedModelRendererExtended Lowerteethback;
    public AdvancedModelRendererExtended Lowermiddleteeth;
    public AdvancedModelRendererExtended Lowerfrontteeth;
    public AdvancedModelRendererExtended Leftlowerfang;
    public AdvancedModelRendererExtended Rightlowerfang;
    public AdvancedModelRendererExtended Leftlowerarm;
    public AdvancedModelRendererExtended Leftfrontfoot;
    public AdvancedModelRendererExtended Rightlowerarm;
    public AdvancedModelRendererExtended Rightfrontfoot;
    public AdvancedModelRendererExtended Leftshin;
    public AdvancedModelRendererExtended Lefthindfoot;
    public AdvancedModelRendererExtended Rightshin;
    public AdvancedModelRendererExtended Righthindfoot;

    private ModelAnimator animator;

    public ModelMorganucodon() {
        this.textureWidth = 64;
        this.textureHeight = 64;
        this.Leftlowerarm = new AdvancedModelRendererExtended(this, 16, 14);
        this.Leftlowerarm.setRotationPoint(0.5F, 0.30000001192092896F, 3.0F);
        this.Leftlowerarm.addBox(-1.0F, 0.0F, -1.5F, 2, 3, 2, 0.0F);
        this.setRotateAngle(Leftlowerarm, -0.4457571069383183F, 0.0F, 0.0F);
        this.Lowerjawbase = new AdvancedModelRendererExtended(this, 0, 17);
        this.Lowerjawbase.setRotationPoint(0.0F, 0.5099999904632568F, -0.800000011920929F);
        this.Lowerjawbase.addBox(-3.0F, -1.0F, -3.0F, 6, 3, 3, 0.0F);
        this.Rightfrontfoot = new AdvancedModelRendererExtended(this, 52, 25);
        this.Rightfrontfoot.setRotationPoint(0.0F, 2.5F, 0.0F);
        this.Rightfrontfoot.addBox(-1.5F, -0.5F, -3.0F, 3, 1, 3, 0.0F);
        this.setRotateAngle(Rightfrontfoot, 0.4457571069383183F, 0.06370451936226872F, 0.04241150198859518F);
        this.Bodymiddle = new AdvancedModelRendererExtended(this, 0, 1);
        this.Bodymiddle.setRotationPoint(0.0F, -0.699999988079071F, -4.300000190734863F);
        this.Bodymiddle.addBox(-3.5F, -1.0F, -7.0F, 7, 5, 7, 0.0F);
        this.setRotateAngle(Bodymiddle, 0.46705011182842415F, 0.0F, 0.0F);
        this.Upperbackteeth = new AdvancedModelRendererExtended(this, 0, 3);
        this.Upperbackteeth.setRotationPoint(0.009999999776482582F, 3.0F, -1.2000000476837158F);
        this.Upperbackteeth.addBox(-1.0F, 0.0F, 0.0F, 2, 1, 1, 0.0F);
        this.setRotateAngle(Upperbackteeth, 1.0613347421062016F, 0.0F, 0.0F);
        this.Lowermiddleteeth = new AdvancedModelRendererExtended(this, 44, 0);
        this.Lowermiddleteeth.setRotationPoint(0.0F, -1.0F, -1.2999999523162842F);
        this.Lowermiddleteeth.addBox(-0.5F, -1.0F, 0.0F, 1, 1, 1, 0.0F);
        this.setRotateAngle(Lowermiddleteeth, -1.0613347421062016F, 0.0F, 0.0F);
        this.Uppermiddleteeth = new AdvancedModelRendererExtended(this, 39, 0);
        this.Uppermiddleteeth.setRotationPoint(0.009999999776482582F, 3.0F, -2.299999952316284F);
        this.Uppermiddleteeth.addBox(-0.5F, 0.0F, 0.0F, 1, 1, 1, 0.0F);
        this.setRotateAngle(Uppermiddleteeth, 1.018923235956417F, 0.0F, 0.0F);
        this.Leftthigh = new AdvancedModelRendererExtended(this, 35, 13);
        this.Leftthigh.setRotationPoint(3.5F, 0.699999988079071F, -1.0F);
        this.Leftthigh.addBox(-1.0F, -1.5F, -3.5F, 3, 4, 5, 0.0F);
        this.setRotateAngle(Leftthigh, 0.31834805156902407F, 0.0F, 0.0F);
        this.Neck = new AdvancedModelRendererExtended(this, 0, 34);
        this.Neck.setRotationPoint(0.0F, 0.30000001192092896F, -2.0F);
        this.Neck.addBox(-3.0F, -1.5F, -5.0F, 6, 4, 5, 0.0F);
        this.setRotateAngle(Neck, -0.2546435405291338F, 0.0F, 0.0F);
        this.Lowerjawmiddle = new AdvancedModelRendererExtended(this, 47, 51);
        this.Lowerjawmiddle.setRotationPoint(0.0F, 0.9900000095367432F, -3.0F);
        this.Lowerjawmiddle.addBox(-2.0F, 0.0F, -2.0F, 4, 1, 2, 0.0F);
        this.setRotateAngle(Lowerjawmiddle, 0.04241150198859518F, 0.0F, 0.0F);
        this.Tailmiddle = new AdvancedModelRendererExtended(this, 23, 33);
        this.Tailmiddle.setRotationPoint(0.0F, 0.0F, 3.4000000953674316F);
        this.Tailmiddle.addBox(-1.5F, -0.5F, 0.0F, 3, 2, 4, 0.0F);
        this.setRotateAngle(Tailmiddle, 0.38205256260891435F, 0.0F, 0.0F);
        this.Lowerteethback = new AdvancedModelRendererExtended(this, 22, 0);
        this.Lowerteethback.setRotationPoint(0.0F, 0.0F, -2.0F);
        this.Lowerteethback.addBox(-1.0F, -1.0F, 0.0F, 2, 1, 1, 0.0F);
        this.setRotateAngle(Lowerteethback, -0.9339256534473936F, 0.0F, 0.0F);
        this.Lowerfrontteeth = new AdvancedModelRendererExtended(this, 49, 0);
        this.Lowerfrontteeth.setRotationPoint(0.0F, -1.0F, -3.0F);
        this.Lowerfrontteeth.addBox(-0.5F, -1.0F, 0.0F, 1, 1, 1, 0.0F);
        this.setRotateAngle(Lowerfrontteeth, -0.9976301977767977F, 0.0F, 0.0F);
        this.Leftupperarm = new AdvancedModelRendererExtended(this, 28, 0);
        this.Leftupperarm.setRotationPoint(3.0F, 2.5F, -2.5999999046325684F);
        this.Leftupperarm.addBox(-1.0F, -2.0F, -0.5F, 3, 3, 4, 0.0F);
        this.setRotateAngle(Leftupperarm, 0.06370451936226872F, 0.0F, 0.0F);
        this.Snout = new AdvancedModelRendererExtended(this, 23, 40);
        this.Snout.setRotationPoint(0.0F, 0.05000000074505806F, -2.200000047683716F);
        this.Snout.addBox(-1.5F, 0.0F, -3.0F, 3, 3, 4, 0.0F);
        this.setRotateAngle(Snout, 0.04241150198859518F, 0.0F, 0.0F);
        this.Tailend = new AdvancedModelRendererExtended(this, 31, 23);
        this.Tailend.setRotationPoint(0.0F, 0.10000000149011612F, 3.5999999046325684F);
        this.Tailend.addBox(-1.0F, -0.5F, 0.0F, 2, 2, 4, 0.0F);
        this.setRotateAngle(Tailend, 0.12740903872453743F, 0.0F, 0.0F);
        this.Jawparting = new AdvancedModelRendererExtended(this, 40, 48);
        this.Jawparting.setRotationPoint(0.0F, 0.0F, -1.100000023841858F);
        this.Jawparting.addBox(-1.5F, -3.0F, 0.0F, 3, 3, 1, 0.0F);
        this.setRotateAngle(Jawparting, -0.46705011182842415F, 0.0F, 0.0F);
        this.Leftfrontfoot = new AdvancedModelRendererExtended(this, 19, 24);
        this.Leftfrontfoot.setRotationPoint(0.0F, 2.5F, 0.0F);
        this.Leftfrontfoot.addBox(-1.5F, -0.5F, -3.0F, 3, 1, 3, 0.0F);
        this.setRotateAngle(Leftfrontfoot, 0.4457571069383183F, -0.06370451936226872F, -0.04241150198859518F);
        this.Rightupperfang = new AdvancedModelRendererExtended(this, 29, 0);
        this.Rightupperfang.setRotationPoint(-0.800000011920929F, 2.7699999809265137F, -1.2999999523162842F);
        this.Rightupperfang.addBox(0.0F, 0.0F, -0.5F, 0, 1, 1, 0.0F);
        this.setRotateAngle(Rightupperfang, 0.0F, 0.0F, 0.021293017373673524F);
        this.Righthindfoot = new AdvancedModelRendererExtended(this, 48, 17);
        this.Righthindfoot.setRotationPoint(0.0F, -0.5F, 4.5F);
        this.Righthindfoot.addBox(-1.5F, -0.5F, -4.5F, 3, 1, 5, 0.0F);
        this.setRotateAngle(Righthindfoot, 0.4881685797985891F, 0.38205256260891435F, 0.21223203437934937F);
        this.Upperfrontteeth = new AdvancedModelRendererExtended(this, 22, 3);
        this.Upperfrontteeth.setRotationPoint(0.009999999776482582F, 3.0F, -2.950000047683716F);
        this.Upperfrontteeth.addBox(-0.5F, 0.0F, 0.0F, 1, 1, 1, 0.0F);
        this.setRotateAngle(Upperfrontteeth, 1.2524483085153861F, 0.0F, 0.0F);
        this.Tailbase = new AdvancedModelRendererExtended(this, 38, 40);
        this.Tailbase.setRotationPoint(0.0F, -0.10000000149011612F, 0.5F);
        this.Tailbase.addBox(-2.0F, -0.5F, 0.0F, 4, 2, 4, 0.0F);
        this.setRotateAngle(Tailbase, -0.27593656206399647F, 0.0F, 0.0F);
        this.Rightupperarm = new AdvancedModelRendererExtended(this, 50, 0);
        this.Rightupperarm.setRotationPoint(-3.0F, 2.5F, -2.5999999046325684F);
        this.Rightupperarm.addBox(-2.0F, -2.0F, -0.5F, 3, 3, 4, 0.0F);
        this.setRotateAngle(Rightupperarm, 0.06370451936226872F, 0.0F, 0.0F);
        this.Rightlowerarm = new AdvancedModelRendererExtended(this, 44, 24);
        this.Rightlowerarm.setRotationPoint(-0.5F, 0.30000001192092896F, 3.0F);
        this.Rightlowerarm.addBox(-1.0F, 0.0F, -1.5F, 2, 3, 2, 0.0F);
        this.setRotateAngle(Rightlowerarm, -0.4457571069383183F, 0.0F, 0.0F);
        this.Head = new AdvancedModelRendererExtended(this, 0, 24);
        this.Head.setRotationPoint(-0.009999999776482582F, -0.5F, -4.0F);
        this.Head.addBox(-3.5F, -1.5F, -4.0F, 7, 3, 4, 0.0F);
        this.setRotateAngle(Head, 0.40334560078853393F, 0.0F, 0.0F);
        this.Leftshin = new AdvancedModelRendererExtended(this, 50, 8);
        this.Leftshin.setRotationPoint(0.5F, 2.5F, -3.5F);
        this.Leftshin.addBox(-1.0F, -2.0F, 0.0F, 2, 2, 5, 0.0F);
        this.setRotateAngle(Leftshin, -0.4457571069383183F, 0.0F, 0.0F);
        this.Rightlowerfang = new AdvancedModelRendererExtended(this, 0, 0);
        this.Rightlowerfang.setRotationPoint(-0.5099999904632568F, -1.0F, -1.899999976158142F);
        this.Rightlowerfang.addBox(0.0F, -1.0F, -0.5F, 0, 1, 1, 0.0F);
        this.setRotateAngle(Rightlowerfang, 0.0F, 0.0F, -0.1485275233394591F);
        this.Bodyfront = new AdvancedModelRendererExtended(this, 39, 30);
        this.Bodyfront.setRotationPoint(0.009999999776482582F, 0.5F, -6.5F);
        this.Bodyfront.addBox(-3.5F, -1.5F, -3.5F, 7, 5, 4, 0.0F);
        this.setRotateAngle(Bodyfront, -0.21223203437934937F, 0.0F, 0.0F);
        this.Hips = new AdvancedModelRendererExtended(this, 0, 44);
        this.Hips.setRotationPoint(0.0F, 19.1F, 6.0F);
        this.Hips.addBox(-4.0F, -1.5F, -5.0F, 8, 5, 6, 0.0F);
        this.setRotateAngle(Hips, -0.3183480555637657F, 0.0F, 0.0F);
        this.Lefthindfoot = new AdvancedModelRendererExtended(this, 19, 17);
        this.Lefthindfoot.setRotationPoint(0.0F, -0.5F, 4.5F);
        this.Lefthindfoot.addBox(-1.5F, -0.5F, -4.5F, 3, 1, 5, 0.0F);
        this.setRotateAngle(Lefthindfoot, 0.4881685797985891F, -0.38205256260891435F, -0.21223203437934937F);
        this.Rightshin = new AdvancedModelRendererExtended(this, 24, 9);
        this.Rightshin.setRotationPoint(-0.5F, 2.5F, -3.5F);
        this.Rightshin.addBox(-1.0F, -2.0F, 0.0F, 2, 2, 5, 0.0F);
        this.setRotateAngle(Rightshin, -0.4457571069383183F, 0.0F, 0.0F);
        this.Rightthigh = new AdvancedModelRendererExtended(this, 38, 3);
        this.Rightthigh.setRotationPoint(-3.5F, 0.699999988079071F, -1.0F);
        this.Rightthigh.addBox(-2.0F, -1.5F, -3.5F, 3, 4, 5, 0.0F);
        this.setRotateAngle(Rightthigh, 0.31834805156902407F, 0.0F, 0.0F);
        this.Eyeportion = new AdvancedModelRendererExtended(this, 29, 53);
        this.Eyeportion.setRotationPoint(0.0F, -1.5F, -4.0F);
        this.Eyeportion.addBox(-2.5F, 0.0F, -2.0F, 5, 3, 2, 0.0F);
        this.setRotateAngle(Eyeportion, 0.04241150198859518F, 0.0F, 0.0F);
        this.Leftupperfang = new AdvancedModelRendererExtended(this, 26, 2);
        this.Leftupperfang.setRotationPoint(0.800000011920929F, 2.7699999809265137F, -1.2999999523162842F);
        this.Leftupperfang.addBox(0.0F, 0.0F, -0.5F, 0, 1, 1, 0.0F);
        this.setRotateAngle(Leftupperfang, 0.0F, 0.0F, -0.021293017373673524F);
        this.Lowerjawfront = new AdvancedModelRendererExtended(this, 29, 48);
        this.Lowerjawfront.setRotationPoint(0.0F, 1.0F, -2.0F);
        this.Lowerjawfront.addBox(-1.0F, -1.0F, -3.0F, 2, 1, 3, 0.0F);
        this.setRotateAngle(Lowerjawfront, -0.06370451936226872F, 0.0F, 0.0F);
        this.Leftlowerfang = new AdvancedModelRendererExtended(this, 3, 0);
        this.Leftlowerfang.setRotationPoint(0.5099999904632568F, -1.0F, -1.899999976158142F);
        this.Leftlowerfang.addBox(0.0F, -1.0F, -0.5F, 0, 1, 1, 0.0F);
        this.setRotateAngle(Leftlowerfang, 0.0F, 0.0F, 0.1485275233394591F);
        this.Nose = new AdvancedModelRendererExtended(this, 49, 47);
        this.Nose.setRotationPoint(0.0F, 0.0F, -3.0F);
        this.Nose.addBox(-1.0F, 0.0F, -1.0F, 2, 2, 1, 0.0F);
        this.setRotateAngle(Nose, 0.4457571069383183F, 0.0F, 0.0F);
        this.Leftupperarm.addChild(this.Leftlowerarm);
        this.Head.addChild(this.Lowerjawbase);
        this.Rightlowerarm.addChild(this.Rightfrontfoot);
        this.Hips.addChild(this.Bodymiddle);
        this.Eyeportion.addChild(this.Upperbackteeth);
        this.Lowerjawfront.addChild(this.Lowermiddleteeth);
        this.Eyeportion.addChild(this.Uppermiddleteeth);
        this.Hips.addChild(this.Leftthigh);
        this.Bodyfront.addChild(this.Neck);
        this.Lowerjawbase.addChild(this.Lowerjawmiddle);
        this.Tailbase.addChild(this.Tailmiddle);
        this.Lowerjawmiddle.addChild(this.Lowerteethback);
        this.Lowerjawfront.addChild(this.Lowerfrontteeth);
        this.Bodyfront.addChild(this.Leftupperarm);
        this.Eyeportion.addChild(this.Snout);
        this.Tailmiddle.addChild(this.Tailend);
        this.Lowerjawmiddle.addChild(this.Jawparting);
        this.Leftlowerarm.addChild(this.Leftfrontfoot);
        this.Snout.addChild(this.Rightupperfang);
        this.Rightshin.addChild(this.Righthindfoot);
        this.Snout.addChild(this.Upperfrontteeth);
        this.Hips.addChild(this.Tailbase);
        this.Bodyfront.addChild(this.Rightupperarm);
        this.Rightupperarm.addChild(this.Rightlowerarm);
        this.Neck.addChild(this.Head);
        this.Leftthigh.addChild(this.Leftshin);
        this.Lowerjawfront.addChild(this.Rightlowerfang);
        this.Bodymiddle.addChild(this.Bodyfront);
        this.Leftshin.addChild(this.Lefthindfoot);
        this.Rightthigh.addChild(this.Rightshin);
        this.Hips.addChild(this.Rightthigh);
        this.Head.addChild(this.Eyeportion);
        this.Snout.addChild(this.Leftupperfang);
        this.Lowerjawmiddle.addChild(this.Lowerjawfront);
        this.Lowerjawfront.addChild(this.Leftlowerfang);
        this.Snout.addChild(this.Nose);

        updateDefaultPose();
        animator = ModelAnimator.create();
    }

    @Override
    public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        animate((IAnimatedEntity) entity, f, f1, f2, f3, f4, f5);
        this.Hips.render(f5 * 0.15f);
    }
    public void renderStaticWall(float f) {
        this.Bodyfront.rotateAngleY = (float) Math.toRadians(90);
        this.setRotateAngle(Bodyfront, 0.0F, 0.0F, -0.0F);
        this.Rightupperarm.setScale(0,0,0);
        this.Leftupperarm.setScale(0,0,0);
        this.Rightupperarm.scaleChildren = true;
        this.Leftupperarm.scaleChildren = true;
        this.Bodyfront.offsetY = 0.0F;
        this.Bodyfront.offsetX = 0.0F;
        this.Bodyfront.offsetZ = -0.35F;
        this.Bodyfront.render(0.01F);
        this.Rightupperarm.setScale(1,1,1);
        this.Leftupperarm.setScale(1,1,1);
        this.Bodyfront.offsetY = 0.0F;
        resetToDefaultPose();
    }
    public void renderStaticFloor(float f) {
        this.setRotateAngle(Hips, -0.3F, 0.0F, 0.0F);
        this.setRotateAngle(Bodymiddle, 0.5F, 0.0F, 0.0F);
        this.setRotateAngle(Bodyfront, -0.1F, 0.0F, 0.0F);
        this.setRotateAngle(Neck, -0.4F, 0.0F, 0.0F);
        this.setRotateAngle(Head, 0.0F, 0.0F, 0.0F);
        this.setRotateAngle(Lowerjawbase, 0.8F, 0.0F, 0.0F);
        this.setRotateAngle(Lowerjawmiddle, 0.8F, 0.0F, 0.0F);
        this.setRotateAngle(Tailbase, 0.2F, 0.0F, 0.0F);
        this.setRotateAngle(Tailmiddle, 0.2F, 0.0F, 0.0F);
        this.setRotateAngle(Tailend, 0.2F, 0.0F, 0.0F);
        this.setRotateAngle(Lowerjawbase, 0.0F, 0.0F, 0.0F);
        this.Hips.offsetY = 0.22F;
        this.Hips.render(0.01F);
        resetToDefaultPose();
    }
    @Override
    public void renderStaticBook(float f) {
        //Rotations, positions and sizing:
        this.Hips.offsetY = -0.2F;
        this.Hips.offsetX = -0.15F;
        this.Hips.offsetZ = 2.0F;
        this.Hips.rotateAngleY = (float)Math.toRadians(120);
        this.Hips.rotateAngleX = (float)Math.toRadians(0);
        this.Hips.rotateAngleZ = (float)Math.toRadians(0);
        this.Hips.scaleChildren = true;
        float scaler = 0.6F;
        this.Hips.setScale(scaler, scaler, scaler);
        //Start of pose:
        this.setRotateAngle(Hips, 0.0F, 3.8F, -0.0F);
        this.setRotateAngle(Bodymiddle, 0.5F, 0.0F, 0.0F);
        this.setRotateAngle(Bodyfront, -0.1F, 0.0F, 0.0F);
        this.setRotateAngle(Neck, -0.4F, 0.0F, 0.0F);
        this.setRotateAngle(Head, 0.0F, 0.0F, 0.0F);
        this.setRotateAngle(Lowerjawbase, 0.8F, 0.0F, 0.0F);
        this.setRotateAngle(Lowerjawmiddle, 0.8F, 0.0F, 0.0F);
        this.setRotateAngle(Tailbase, 0.2F, 0.0F, 0.0F);
        this.setRotateAngle(Tailmiddle, 0.2F, 0.0F, 0.0F);
        this.setRotateAngle(Tailend, 0.2F, 0.0F, 0.0F);
        this.setRotateAngle(Lowerjawbase, 0.0F, 0.0F, 0.0F);
        //End of pose, now render the model:
        this.Hips.render(f);
        //Reset rotations, positions and sizing:
        this.Hips.setScale(1.0F, 1.0F, 1.0F);
        this.Hips.scaleChildren = false;
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
        this.Hips.offsetY = 1.28F;

        EntityPrehistoricFloraMorganucodon Morganucodon = (EntityPrehistoricFloraMorganucodon) e;
        float masterSpeed = Morganucodon.getTravelSpeed();

        this.faceTarget(f3, f4, 2, Neck);
        this.faceTarget(f3, f4, 4, Head);

        AdvancedModelRendererExtended[] Tail = {this.Tailbase, this.Tailmiddle, this.Tailend};

        if (Morganucodon.getAnimation() == Morganucodon.LAY_ANIMATION) {
            //this.swing(Neck, 0.5F, 0.10F, false, 0.5F,-0.05F, f2, 0.8F);
            //this.walk(Neck, 0.5F * 2, -0.02F, false, 0.5F,0.01F, f2, 0.8F);
            return;
        }

        if ((f3 == 0.0F || !Morganucodon.getIsMoving())) { //Not moving
            this.swing(Neck, 0.06F, 0.10F, false, 0.5F,-0.05F, f2, 0.8F);
            this.walk(Neck, 0.06F * 2F, -0.02F, false, 0.5F,0.01F, f2, 0.8F);
            this.chainWave(Tail, (0.06F*0.9F), 0.06F, 7.10F, f2, 1F);
            this.chainSwing(Tail, (0.06F*0.9F) * 2F, 0.05F, 0.06F, f2, 1F);
            return;
        }

        float speed = masterSpeed / 0.965F;
        if (Morganucodon.getIsFast()) {
            speed = speed * 1.5F;
        }


        float speedmodifier = 1;

        this.Leftupperarm.offsetY = this.moveBoxExtended(speed, (float) Math.toRadians(0.4), false, 0, f2, 1.5F);;
        this.Rightupperarm.offsetY = this.moveBoxExtended(speed, (float) Math.toRadians(0.4), false, 3, f2, 1.5F);;
        this.Leftthigh.offsetY = this.moveBoxExtended(speed, (float) Math.toRadians(0.3), false, 4, f2, 1.5F);;
        this.Rightthigh.offsetY = this.moveBoxExtended(speed, (float) Math.toRadians(0.3), false, 1, f2, 1.5F);;

        this.walk(Leftupperarm, speed * speedmodifier, 0.5F, false, 0, -0.20F, f2, 1F);
        this.walk(Rightupperarm, speed * speedmodifier, 0.5F, false, 3, -0.20F, f2, 1F);
        this.flap(Leftupperarm, speed * speedmodifier, -0.15F, false, 1, 0.05F, f2, 1F);
        this.flap(Rightupperarm, speed * speedmodifier, 0.15F, false, 4, -0.05F, f2, 1F);

        this.walk(Leftlowerarm, speed * speedmodifier, -0.25F, false, 3, 0.10F, f2, 1F);
        this.walk(Rightlowerarm, speed * speedmodifier, -0.25F, false, 6, 0.10F, f2, 1F);
        this.flap(Leftlowerarm, speed * speedmodifier, -0.15F, false, 3, 0.05F, f2, 1F);
        this.flap(Rightlowerarm, speed * speedmodifier, 0.15F, false, 6, -0.05F, f2, 1F);

        this.walk(Leftfrontfoot, speed * speedmodifier, 0.45F, false, 2, -0.08F, f2, 1F);
        this.walk(Rightfrontfoot, speed * speedmodifier, 0.45F, false, 5, -0.08F, f2, 1F);


        this.walk(Leftthigh, speed * speedmodifier, 0.5F, true, 0, -0.20F, f2, 1F);
        this.walk(Rightthigh, speed * speedmodifier, 0.5F, true, 3, -0.20F, f2, 1F);
        this.flap(Leftthigh, speed * speedmodifier, 0.15F, true, 1, -0.05F, f2, 1F);
        this.flap(Rightthigh, speed * speedmodifier, -0.15F, true, 4, 0.05F, f2, 1F);

        this.walk(Lefthindfoot, speed * speedmodifier, 0.45F, true, 3, 0.18F, f2, 1F);
        this.walk(Righthindfoot, speed * speedmodifier, 0.45F, true, 6, 0.18F, f2, 1F);

        this.bobExtended(Hips, speed * 2F * speedmodifier, 0.245F, false, 2.5F,  f2, 1F);

        this.flap(Hips, speed * speedmodifier, 0.08F, false, 2.0F,0.04F, f2, 1.0F);
        this.flap(Bodymiddle, speed * speedmodifier, -0.08F, false, 2.0F,-0.04F, f2, 1.0F);
        this.flap(Bodyfront, speed * speedmodifier, -0.08F, false, 2.0F,-0.04F, f2, 1.0F);

        this.walk(Bodyfront, speed * 2 * speedmodifier, 0.05F, false, 2.5F,-0.01F, f2, 0.8F);

        this.swing(Neck, speed, 0.10F, false, 0.5F,-0.05F, f2, 0.8F);
        this.walk(Neck, speed * 2, -0.02F, false, 0.5F,0.01F, f2, 0.8F);
        this.chainWave(Tail, (speed*0.6F), 0.10F, 7.2F, f2, 1F);
        this.chainSwing(Tail, (speed*0.6F) * 2F, 0.10F, 0.12F, f2, 1F);

        this.Hips.offsetZ = this.moveBoxExtended(speed * 2 * speedmodifier, (float) Math.toRadians(1.2), false, 1.5F, f2, 1);

    }

    public void animate(IAnimatedEntity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        EntityPrehistoricFloraMorganucodon e = (EntityPrehistoricFloraMorganucodon) entity;
        animator.update(entity);
        this.resetToDefaultPose();
        setRotationAngles(f, f1, f2, f3, f4, f5, (Entity) entity);

        animator.setAnimation(e.ATTACK_ANIMATION); //20 ticks
        animator.startKeyframe(5);
        animator.rotate(this.Neck, (float) Math.toRadians(-27), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(this.Head, (float) Math.toRadians(-10), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(this.Lowerjawbase, (float) Math.toRadians(20), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.setStaticKeyframe(1);
        animator.resetKeyframe(9);

        animator.setAnimation(e.EAT_ANIMATION); //10 ticks
        animator.startKeyframe(4);
        animator.rotate(this.Neck, (float) Math.toRadians(45), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(this.Head, (float) Math.toRadians(-5), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(this.Lowerjawbase, (float) Math.toRadians(20), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.endKeyframe();
        animator.setStaticKeyframe(3);
        animator.resetKeyframe(3);

        animator.setAnimation(e.ROAR_ANIMATION);
        animator.startKeyframe(10);
        animator.rotate(this.Neck, (float) Math.toRadians(-27), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(this.Head, (float) Math.toRadians(-5), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(this.Lowerjawbase, (float) Math.toRadians(20), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.endKeyframe();
        animator.setStaticKeyframe(10);
        animator.resetKeyframe(10);

        animator.setAnimation(e.LAY_ANIMATION); //50 ticks
        animator.startKeyframe(10);
        animator.endKeyframe();
        animator.setStaticKeyframe(30);
        animator.resetKeyframe(10);
    }
}
