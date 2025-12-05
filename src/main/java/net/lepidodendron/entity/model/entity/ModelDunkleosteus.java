package net.lepidodendron.entity.model.entity;

import net.ilexiconn.llibrary.client.model.ModelAnimator;
import net.ilexiconn.llibrary.client.model.tools.AdvancedModelRenderer;
import net.ilexiconn.llibrary.server.animation.IAnimatedEntity;
import net.lepidodendron.entity.EntityPrehistoricFloraDunkleosteus;
import net.lepidodendron.entity.base.EntityPrehistoricFloraAgeableBase;
import net.lepidodendron.entity.model.ModelBasePalaeopedia;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

public class ModelDunkleosteus extends ModelBasePalaeopedia {
    public AdvancedModelRenderer Bodyfront;
    public AdvancedModelRenderer Bodymiddle;
    public AdvancedModelRenderer Backslopefront;
    public AdvancedModelRenderer Head;
    public AdvancedModelRenderer Leftpectoralfin;
    public AdvancedModelRenderer Rightpectoralfin;
    public AdvancedModelRenderer Bodyend;
    public AdvancedModelRenderer Backslopemiddle;
    public AdvancedModelRenderer Leftpelvicfin;
    public AdvancedModelRenderer Rightpelvicfin;
    public AdvancedModelRenderer Tailbase;
    public AdvancedModelRenderer Backslopeend;
    public AdvancedModelRenderer Bellyendpiece;
    public AdvancedModelRenderer Tailend;
    public AdvancedModelRenderer Tailslopebase;
    public AdvancedModelRenderer Tailunderside;
    public AdvancedModelRenderer Tailfin;
    public AdvancedModelRenderer Dorsalfin;
    public AdvancedModelRenderer Analfin;
    public AdvancedModelRenderer Headslope;
    public AdvancedModelRenderer Throat;
    public AdvancedModelRenderer Upperjawback;
    public AdvancedModelRenderer Lowerjawback;
    public AdvancedModelRenderer Throatslope;
    public AdvancedModelRenderer Upperjawfront;
    public AdvancedModelRenderer Upperjawslope1;
    public AdvancedModelRenderer Leftcheekslope;
    public AdvancedModelRenderer Rightcheekslope;
    public AdvancedModelRenderer Upperjawslope2;
    public AdvancedModelRenderer Upperfrontshears;
    public AdvancedModelRenderer Leftuppershears;
    public AdvancedModelRenderer Rightuppershears;
    public AdvancedModelRenderer Lowerjawmiddle;
    public AdvancedModelRenderer Lowerjawslope1;
    public AdvancedModelRenderer Lowerjawfront;
    public AdvancedModelRenderer Lowerjawslope2;
    public AdvancedModelRenderer Lowerjawshears;

    private ModelAnimator animator;

    public ModelDunkleosteus() {
        this.textureWidth = 128;
        this.textureHeight = 128;
        this.Bodyfront = new AdvancedModelRenderer(this, 0, 73);
        this.Bodyfront.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.Bodyfront.addBox(-5.0F, -3.0F, -10.0F, 10, 12, 15, 0.0F);
        this.Bodymiddle = new AdvancedModelRenderer(this, 0, 51);
        this.Bodymiddle.setRotationPoint(0.0F, 0.699999988079071F, 4.0F);
        this.Bodymiddle.addBox(-4.5F, -3.0F, 0.0F, 9, 11, 10, 0.0F);
        this.Lowerjawfront = new AdvancedModelRenderer(this, 97, 6);
        this.Lowerjawfront.setRotationPoint(0.0F, -2.0F, -2.700000047683716F);
        this.Lowerjawfront.addBox(-3.0F, 0.0F, -3.0F, 6, 2, 3, 0.0F);
        this.setRotateAngle(Lowerjawfront, 0.06370451936226872F, 0.0F, 0.0F);
        this.Lowerjawshears = new AdvancedModelRenderer(this, 49, 50);
        this.Lowerjawshears.setRotationPoint(0.0F, 0.30000001192092896F, -2.799999952316284F);
        this.Lowerjawshears.addBox(-2.5F, -2.0F, 0.0F, 5, 2, 4, 0.0F);
        this.setRotateAngle(Lowerjawshears, -0.12740903872453743F, 0.0F, 0.0F);
        this.Leftpelvicfin = new AdvancedModelRenderer(this, 43, 43);
        this.Leftpelvicfin.setRotationPoint(1.0F, 8.0F, 2.5F);
        this.Leftpelvicfin.addBox(0.0F, 0.0F, 0.0F, 4, 0, 6, 0.0F);
        this.setRotateAngle(Leftpelvicfin, 0.0F, 0.0F, 0.40334560078853393F);
        this.Lowerjawmiddle = new AdvancedModelRenderer(this, 76, 6);
        this.Lowerjawmiddle.setRotationPoint(0.0F, 2.5F, -3.0F);
        this.Lowerjawmiddle.addBox(-3.5F, -2.0F, -2.700000047683716F, 7, 2, 3, 0.0F);
        this.setRotateAngle(Lowerjawmiddle, -0.06370451936226872F, 0.0F, 0.0F);
        this.Backslopemiddle = new AdvancedModelRenderer(this, 25, 5);
        this.Backslopemiddle.setRotationPoint(0.0F, -4.599999904632568F, 0.0F);
        this.Backslopemiddle.addBox(-4.0F, 0.0F, 0.0F, 8, 2, 10, 0.0F);
        this.setRotateAngle(Backslopemiddle, -0.13613568498450906F, 0.0F, 0.0F);
        this.Backslopeend = new AdvancedModelRenderer(this, 52, 1);
        this.Backslopeend.setRotationPoint(0.0F, -4.050000190734863F, 0.0F);
        this.Backslopeend.addBox(-3.0F, 0.0F, 0.0F, 6, 2, 11, 0.0F);
        this.setRotateAngle(Backslopeend, -0.1872738207495083F, 0.0F, 0.0F);
        this.Lowerjawslope2 = new AdvancedModelRenderer(this, 76, 0);
        this.Lowerjawslope2.setRotationPoint(0.0F, 0.6000000238418579F, 0.20000000298023224F);
        this.Lowerjawslope2.addBox(-2.5F, -1.0F, -5.0F, 5, 1, 5, 0.0F);
        this.setRotateAngle(Lowerjawslope2, -0.09529497782468066F, 0.0F, 0.0F);
        this.Tailfin = new AdvancedModelRenderer(this, 70, 0);
        this.Tailfin.setRotationPoint(0.0F, 0.0F, 3.5F);
        this.Tailfin.addBox(0.0F, -12.0F, 0.0F, 0, 20, 15, 0.0F);
        this.Leftpectoralfin = new AdvancedModelRenderer(this, 56, 43);
        this.Leftpectoralfin.setRotationPoint(5.0F, 6.5F, -8.5F);
        this.Leftpectoralfin.addBox(-0.5F, 0.0F, -1.0F, 11, 0, 11, 0.0F);
        this.setRotateAngle(Leftpectoralfin, -0.04241150198859518F, -0.1485275233394591F, 0.5094616179782085F);
        this.Rightuppershears = new AdvancedModelRenderer(this, 21, 3);
        this.Rightuppershears.setRotationPoint(-2.700000047683716F, -0.5F, -1.2000000476837158F);
        this.Rightuppershears.addBox(0.0F, 0.0F, -1.5F, 0, 2, 3, 0.0F);
        this.setRotateAngle(Rightuppershears, 0.12740903872453743F, -0.1485275233394591F, 0.0F);
        this.Analfin = new AdvancedModelRenderer(this, 92, 39);
        this.Analfin.setRotationPoint(0.0F, -0.6000000238418579F, 7.5F);
        this.Analfin.addBox(0.0F, 0.0F, 0.0F, 0, 3, 4, 0.0F);
        this.setRotateAngle(Analfin, -0.169820528229565F, 0.0F, 0.0F);
        this.Rightcheekslope = new AdvancedModelRenderer(this, 21, 21);
        this.Rightcheekslope.setRotationPoint(-3.0F, 4.0F, -1.899999976158142F);
        this.Rightcheekslope.addBox(-1.0F, 0.0F, 0.0F, 1, 5, 3, 0.0F);
        this.setRotateAngle(Rightcheekslope, 0.7005751510978795F, -0.04241150198859518F, 0.08482300397719036F);
        this.Lowerjawback = new AdvancedModelRenderer(this, 0, 11);
        this.Lowerjawback.setRotationPoint(0.0F, 4.0F, -2.390000104904175F);
        this.Lowerjawback.addBox(-4.0F, -2.0F, -3.0F, 8, 5, 4, 0.0F);
        this.setRotateAngle(Lowerjawback, -0.31834805156902407F, 0.0F, 0.0F);
        this.Upperjawslope2 = new AdvancedModelRenderer(this, 26, 18);
        this.Upperjawslope2.setRotationPoint(0.0F, -3.950000047683716F, -0.6000000238418579F);
        this.Upperjawslope2.addBox(-3.0F, 0.0F, -3.0F, 6, 2, 3, 0.0F);
        this.setRotateAngle(Upperjawslope2, 0.7054620516981749F, 0.0F, 0.0F);
        this.Rightpelvicfin = new AdvancedModelRenderer(this, 52, 43);
        this.Rightpelvicfin.setRotationPoint(-1.0F, 8.0F, 2.5F);
        this.Rightpelvicfin.addBox(-4.0F, 0.0F, 0.0F, 4, 0, 6, 0.0F);
        this.setRotateAngle(Rightpelvicfin, 0.0F, 0.0F, -0.40334560078853393F);
        this.Upperjawslope1 = new AdvancedModelRenderer(this, 22, 0);
        this.Upperjawslope1.setRotationPoint(0.0F, -0.800000011920929F, 0.0F);
        this.Upperjawslope1.addBox(-3.5F, 0.0F, -2.0F, 7, 1, 2, 0.0F);
        this.setRotateAngle(Upperjawslope1, 0.41381754966888895F, 0.0F, 0.0F);
        this.Rightpectoralfin = new AdvancedModelRenderer(this, 56, 55);
        this.Rightpectoralfin.setRotationPoint(-4.5F, 6.5F, -8.5F);
        this.Rightpectoralfin.addBox(-10.5F, 0.0F, -1.0F, 11, 0, 11, 0.0F);
        this.setRotateAngle(Rightpectoralfin, -0.04241150198859518F, 0.1485275233394591F, -0.5094616179782085F);
        this.Tailend = new AdvancedModelRenderer(this, 0, 21);
        this.Tailend.setRotationPoint(0.0F, 0.5099999904632568F, 6.300000190734863F);
        this.Tailend.addBox(-2.0F, -2.0F, 0.0F, 4, 4, 6, 0.0F);
        this.Upperjawfront = new AdvancedModelRenderer(this, 42, 0);
        this.Upperjawfront.setRotationPoint(0.0F, 4.0F, -2.0F);
        this.Upperjawfront.addBox(-3.5F, -2.0F, -3.0F, 7, 2, 3, 0.0F);
        this.setRotateAngle(Upperjawfront, -0.1911135497644277F, 0.0F, 0.0F);
        this.Tailbase = new AdvancedModelRenderer(this, 39, 62);
        this.Tailbase.setRotationPoint(0.0F, 0.20000000298023224F, 10.0F);
        this.Tailbase.addBox(-3.0F, -1.5F, 0.0F, 6, 4, 7, 0.0F);
        this.setRotateAngle(Tailbase, 0.021293017373673524F, 0.0F, 0.0F);
        this.Upperjawback = new AdvancedModelRenderer(this, 57, 36);
        this.Upperjawback.setRotationPoint(0.0F, -1.7000000476837158F, -6.0F);
        this.Upperjawback.addBox(-4.0F, 0.0F, -2.0F, 8, 4, 2, 0.0F);
        this.Throatslope = new AdvancedModelRenderer(this, 0, 5);
        this.Throatslope.setRotationPoint(0.0F, 3.799999952316284F, 1.0F);
        this.Throatslope.addBox(-4.0F, -1.0F, -4.0F, 8, 1, 4, 0.0F);
        this.setRotateAngle(Throatslope, -0.1911135497644277F, 0.0F, 0.0F);
        this.Bodyend = new AdvancedModelRenderer(this, 0, 32);
        this.Bodyend.setRotationPoint(0.0F, 1.0F, 9.0F);
        this.Bodyend.addBox(-4.0F, -2.0F, 0.0F, 8, 7, 11, 0.0F);
        this.setRotateAngle(Bodyend, -0.021293017373673524F, 0.0F, 0.0F);
        this.Tailslopebase = new AdvancedModelRenderer(this, 67, 76);
        this.Tailslopebase.setRotationPoint(0.0F, -2.299999952316284F, 0.0F);
        this.Tailslopebase.addBox(-2.5F, 0.0F, 0.0F, 5, 1, 6, 0.0F);
        this.setRotateAngle(Tailslopebase, -0.13613568498450906F, 0.0F, 0.0F);
        this.Dorsalfin = new AdvancedModelRenderer(this, 84, 28);
        this.Dorsalfin.setRotationPoint(0.0F, 1.2999999523162842F, 0.5F);
        this.Dorsalfin.addBox(0.0F, -6.0F, 0.0F, 0, 6, 8, 0.0F);
        this.setRotateAngle(Dorsalfin, 0.21223203437934937F, 0.0F, 0.0F);
        this.Headslope = new AdvancedModelRenderer(this, 28, 34);
        this.Headslope.setRotationPoint(0.0F, -4.099999904632568F, 0.0F);
        this.Headslope.addBox(-4.0F, 0.0F, -6.0F, 8, 2, 6, 0.0F);
        this.setRotateAngle(Headslope, 0.27593656206399647F, 0.0F, 0.0F);
        this.Throat = new AdvancedModelRenderer(this, 66, 68);
        this.Throat.setRotationPoint(0.0F, 4.5F, 0.0F);
        this.Throat.addBox(-4.5F, 0.0F, -3.0F, 9, 3, 4, 0.0F);
        this.Leftuppershears = new AdvancedModelRenderer(this, 11, 0);
        this.Leftuppershears.setRotationPoint(2.700000047683716F, -0.5F, -1.2000000476837158F);
        this.Leftuppershears.addBox(0.0F, 0.0F, -1.5F, 0, 2, 3, 0.0F);
        this.setRotateAngle(Leftuppershears, 0.12740903872453743F, 0.1485275233394591F, 0.0F);
        this.Upperfrontshears = new AdvancedModelRenderer(this, 0, 0);
        this.Upperfrontshears.setRotationPoint(0.0F, -0.5F, -2.700000047683716F);
        this.Upperfrontshears.addBox(-2.5F, 0.0F, 0.0F, 5, 2, 0, 0.0F);
        this.setRotateAngle(Upperfrontshears, 0.08482300397719036F, 0.0F, 0.0F);
        this.Backslopefront = new AdvancedModelRenderer(this, 52, 84);
        this.Backslopefront.setRotationPoint(0.0F, -3.950000047683716F, 4.960000038146973F);
        this.Backslopefront.addBox(-4.5F, 0.0F, -15.0F, 9, 1, 15, 0.0F);
        this.setRotateAngle(Backslopefront, 0.037175515064850034F, 0.0F, 0.0F);
        this.Head = new AdvancedModelRenderer(this, 36, 74);
        this.Head.setRotationPoint(0.0F, 0.699999988079071F, -9.0F);
        this.Head.addBox(-4.5F, -2.5F, -6.0F, 9, 7, 6, 0.0F);
        this.setRotateAngle(Head, 0.06370451936226872F, 0.0F, 0.0F);
        this.Leftcheekslope = new AdvancedModelRenderer(this, 25, 6);
        this.Leftcheekslope.setRotationPoint(3.0F, 4.0F, -1.899999976158142F);
        this.Leftcheekslope.addBox(0.0F, 0.0F, 0.0F, 1, 5, 3, 0.0F);
        this.setRotateAngle(Leftcheekslope, 0.7005751510978795F, 0.04241150198859518F, -0.08482300397719036F);
        this.Lowerjawslope1 = new AdvancedModelRenderer(this, 97, 0);
        this.Lowerjawslope1.setRotationPoint(0.0F, 3.5F, 1.0F);
        this.Lowerjawslope1.addBox(-3.5F, -1.0F, -4.0F, 7, 1, 4, 0.0F);
        this.setRotateAngle(Lowerjawslope1, -0.10611601718967469F, 0.0F, 0.0F);
        this.Bellyendpiece = new AdvancedModelRenderer(this, 33, 18);
        this.Bellyendpiece.setRotationPoint(0.0F, 7.0F, 0.0F);
        this.Bellyendpiece.addBox(-3.5F, -2.0F, 0.0F, 7, 2, 11, 0.0F);
        this.setRotateAngle(Bellyendpiece, 0.18587755867949335F, 0.0F, 0.0F);
        this.Tailunderside = new AdvancedModelRenderer(this, 31, 50);
        this.Tailunderside.setRotationPoint(0.0F, 4.800000190734863F, 0.0F);
        this.Tailunderside.addBox(-2.5F, -3.0F, 0.0F, 5, 3, 7, 0.0F);
        this.setRotateAngle(Tailunderside, 0.3358013440889674F, 0.0F, 0.0F);
        this.Bodyfront.addChild(this.Bodymiddle);
        this.Lowerjawmiddle.addChild(this.Lowerjawfront);
        this.Lowerjawfront.addChild(this.Lowerjawshears);
        this.Bodymiddle.addChild(this.Leftpelvicfin);
        this.Lowerjawback.addChild(this.Lowerjawmiddle);
        this.Bodymiddle.addChild(this.Backslopemiddle);
        this.Bodyend.addChild(this.Backslopeend);
        this.Lowerjawmiddle.addChild(this.Lowerjawslope2);
        this.Tailend.addChild(this.Tailfin);
        this.Bodyfront.addChild(this.Leftpectoralfin);
        this.Upperjawfront.addChild(this.Rightuppershears);
        this.Bellyendpiece.addChild(this.Analfin);
        this.Upperjawback.addChild(this.Rightcheekslope);
        this.Head.addChild(this.Lowerjawback);
        this.Upperjawfront.addChild(this.Upperjawslope2);
        this.Bodymiddle.addChild(this.Rightpelvicfin);
        this.Upperjawback.addChild(this.Upperjawslope1);
        this.Bodyfront.addChild(this.Rightpectoralfin);
        this.Tailbase.addChild(this.Tailend);
        this.Upperjawback.addChild(this.Upperjawfront);
        this.Bodyend.addChild(this.Tailbase);
        this.Head.addChild(this.Upperjawback);
        this.Throat.addChild(this.Throatslope);
        this.Bodymiddle.addChild(this.Bodyend);
        this.Tailbase.addChild(this.Tailslopebase);
        this.Backslopeend.addChild(this.Dorsalfin);
        this.Head.addChild(this.Headslope);
        this.Head.addChild(this.Throat);
        this.Upperjawfront.addChild(this.Leftuppershears);
        this.Upperjawfront.addChild(this.Upperfrontshears);
        this.Bodyfront.addChild(this.Backslopefront);
        this.Bodyfront.addChild(this.Head);
        this.Upperjawback.addChild(this.Leftcheekslope);
        this.Lowerjawback.addChild(this.Lowerjawslope1);
        this.Bodyend.addChild(this.Bellyendpiece);
        this.Tailbase.addChild(this.Tailunderside);

        updateDefaultPose();
        animator = ModelAnimator.create();
    }

    @Override
    public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        animate((IAnimatedEntity) entity, f, f1, f2, f3, f4, f5);
        this.Bodyfront.render(f5);
    }
    public void renderStaticWall(float f) {
        this.Lowerjawback.rotateAngleX = (float) Math.toRadians(26);
        this.Head.offsetY = -0.0255F;
        this.Head.render(0.01F);
        resetToDefaultPose();
    }
    public void renderStaticFloor(float f) {
        this.setRotateAngle(Bodyfront, 0.0F, (float) Math.toRadians(90), -0.145F);
        this.setRotateAngle(Bodymiddle, 0.0F, 0.2182F, 0.0F);
        this.setRotateAngle(Bodyend, -0.023F, 0.3926F, -0.0088F);
        this.setRotateAngle(Tailbase, 0.023F, -0.3926F, -0.0088F);
        this.setRotateAngle(Tailend, 0.0F, -0.2182F, 0.0F);
        this.setRotateAngle(Tailfin, 0.0F, -0.2618F, 0.0F);
        this.setRotateAngle(Tailslopebase, -0.1361F, 0.0F, 0.0F);
        this.setRotateAngle(Tailunderside, 0.3358F, 0.0F, 0.0F);
        this.setRotateAngle(Backslopeend, -0.2065F, 0.0F, 0.0F);
        this.setRotateAngle(Dorsalfin, 0.2122F, 0.0F, 0.0F);
        this.setRotateAngle(Bellyendpiece, 0.1859F, 0.0F, 0.0F);
        this.setRotateAngle(Analfin, -0.1698F, 0.0F, 0.0F);
        this.setRotateAngle(Backslopemiddle, -0.1361F, 0.0F, 0.0F);
        this.setRotateAngle(Leftpelvicfin, 0.0F, 0.0F, 0.4033F);
        this.setRotateAngle(Rightpelvicfin, 0.0F, 0.0F, -0.4033F);
        this.setRotateAngle(Backslopefront, 0.0372F, 0.0F, 0.0F);
        this.setRotateAngle(Head, -0.2453F, -0.1694F, 0.0422F);
        this.setRotateAngle(Headslope, 0.2759F, 0.0F, 0.0F);
        this.setRotateAngle(Throatslope, -0.1911F, 0.0F, 0.0F);
        this.setRotateAngle(Upperjawfront, -0.1911F, 0.0F, 0.0F);
        this.setRotateAngle(Upperjawslope2, 0.7055F, 0.0F, 0.0F);
        this.setRotateAngle(Upperfrontshears, 0.0848F, 0.0F, 0.0F);
        this.setRotateAngle(Leftuppershears, 0.1274F, -0.1485F, 0.0F);
        this.setRotateAngle(Rightuppershears, 0.1274F, 0.1485F, 0.0F);
        this.setRotateAngle(Upperjawslope1, 0.4138F, 0.0F, 0.0F);
        this.setRotateAngle(Leftcheekslope, 0.7006F, -0.0424F, -0.0848F);
        this.setRotateAngle(Rightcheekslope, 0.7006F, 0.0424F, 0.0848F);
        this.setRotateAngle(Lowerjawback, 0.7288F, 0.0F, 0.0F);
        this.setRotateAngle(Lowerjawmiddle, -0.0637F, 0.0F, 0.0F);
        this.setRotateAngle(Lowerjawfront, 0.0637F, 0.0F, 0.0F);
        this.setRotateAngle(Lowerjawshears, -0.1274F, 0.0F, 0.0F);
        this.setRotateAngle(Lowerjawslope2, -0.0953F, 0.0F, 0.0F);
        this.setRotateAngle(Lowerjawslope1, -0.1061F, 0.0F, 0.0F);
        this.setRotateAngle(Leftpectoralfin, -0.0424F, 0.1485F, 0.5095F);
        this.setRotateAngle(Rightpectoralfin, -0.0424F, -0.1485F, -0.5095F);
        this.Bodyfront.offsetY = -0.16F;
        this.Bodyfront.render(0.01F);
        resetToDefaultPose();
    }
    public void renderStaticSuspended(float f) {
        this.setRotateAngle(Bodyfront, 0.0F, (float) Math.toRadians(90), -0.22F);
        this.setRotateAngle(Bodymiddle, 0.0F, 0.2182F, 0.0F);
        this.setRotateAngle(Bodyend, -0.023F, 0.3926F, -0.0088F);
        this.setRotateAngle(Tailbase, 0.023F, -0.3926F, -0.0088F);
        this.setRotateAngle(Tailend, 0.0F, -0.2182F, 0.0F);
        this.setRotateAngle(Tailfin, 0.0F, -0.2618F, 0.0F);
        this.setRotateAngle(Tailslopebase, -0.1361F, 0.0F, 0.0F);
        this.setRotateAngle(Tailunderside, 0.3358F, 0.0F, 0.0F);
        this.setRotateAngle(Backslopeend, -0.2065F, 0.0F, 0.0F);
        this.setRotateAngle(Dorsalfin, 0.2122F, 0.0F, 0.0F);
        this.setRotateAngle(Bellyendpiece, 0.1859F, 0.0F, 0.0F);
        this.setRotateAngle(Analfin, -0.1698F, 0.0F, 0.0F);
        this.setRotateAngle(Backslopemiddle, -0.1361F, 0.0F, 0.0F);
        this.setRotateAngle(Leftpelvicfin, 0.0F, 0.0F, 0.4033F);
        this.setRotateAngle(Rightpelvicfin, 0.0F, 0.0F, -0.4033F);
        this.setRotateAngle(Backslopefront, 0.0372F, 0.0F, 0.0F);
        this.setRotateAngle(Head, -0.2453F, -0.1694F, 0.0422F);
        this.setRotateAngle(Headslope, 0.2759F, 0.0F, 0.0F);
        this.setRotateAngle(Throatslope, -0.1911F, 0.0F, 0.0F);
        this.setRotateAngle(Upperjawfront, -0.1911F, 0.0F, 0.0F);
        this.setRotateAngle(Upperjawslope2, 0.7055F, 0.0F, 0.0F);
        this.setRotateAngle(Upperfrontshears, 0.0848F, 0.0F, 0.0F);
        this.setRotateAngle(Leftuppershears, 0.1274F, -0.1485F, 0.0F);
        this.setRotateAngle(Rightuppershears, 0.1274F, 0.1485F, 0.0F);
        this.setRotateAngle(Upperjawslope1, 0.4138F, 0.0F, 0.0F);
        this.setRotateAngle(Leftcheekslope, 0.7006F, -0.0424F, -0.0848F);
        this.setRotateAngle(Rightcheekslope, 0.7006F, 0.0424F, 0.0848F);
        this.setRotateAngle(Lowerjawback, 0.7288F, 0.0F, 0.0F);
        this.setRotateAngle(Lowerjawmiddle, -0.0637F, 0.0F, 0.0F);
        this.setRotateAngle(Lowerjawfront, 0.0637F, 0.0F, 0.0F);
        this.setRotateAngle(Lowerjawshears, -0.1274F, 0.0F, 0.0F);
        this.setRotateAngle(Lowerjawslope2, -0.0953F, 0.0F, 0.0F);
        this.setRotateAngle(Lowerjawslope1, -0.1061F, 0.0F, 0.0F);
        this.setRotateAngle(Leftpectoralfin, -0.0424F, 0.1485F, 0.5095F);
        this.setRotateAngle(Rightpectoralfin, -0.0424F, -0.1485F, -0.5095F);
        this.Bodyfront.offsetY = 0.16F;
        this.Bodyfront.render(0.01F);
        resetToDefaultPose();
    }
    @Override
    public void renderStaticBook(float f) {
        //Rotations, positions and sizing:
        this.Bodyfront.offsetY = 1.1F;
        this.Bodyfront.offsetX = 0.25F;
        this.Bodyfront.offsetZ = 2.0F;
        this.Bodyfront.rotateAngleY = (float)Math.toRadians(120);
        this.Bodyfront.rotateAngleX = (float)Math.toRadians(1);
        this.Bodyfront.rotateAngleZ = (float)Math.toRadians(0);
        this.Bodyfront.scaleChildren = true;
        float scaler = 0.45F;
        this.Bodyfront.setScale(scaler, scaler, scaler);
        //Start of pose:
        this.setRotateAngle(Bodyfront, 0.6F, 3.8F, -0.2F);
        this.setRotateAngle(Bodymiddle, 0.0F, 0.2182F, 0.0F);
        this.setRotateAngle(Bodyend, -0.023F, 0.3926F, -0.0088F);
        this.setRotateAngle(Tailbase, 0.023F, -0.3926F, -0.0088F);
        this.setRotateAngle(Tailend, 0.0F, -0.2182F, 0.0F);
        this.setRotateAngle(Tailfin, 0.0F, -0.2618F, 0.0F);
        this.setRotateAngle(Tailslopebase, -0.1361F, 0.0F, 0.0F);
        this.setRotateAngle(Tailunderside, 0.3358F, 0.0F, 0.0F);
        this.setRotateAngle(Backslopeend, -0.2065F, 0.0F, 0.0F);
        this.setRotateAngle(Dorsalfin, 0.2122F, 0.0F, 0.0F);
        this.setRotateAngle(Bellyendpiece, 0.1859F, 0.0F, 0.0F);
        this.setRotateAngle(Analfin, -0.1698F, 0.0F, 0.0F);
        this.setRotateAngle(Backslopemiddle, -0.1361F, 0.0F, 0.0F);
        this.setRotateAngle(Leftpelvicfin, 0.0F, 0.0F, 0.4033F);
        this.setRotateAngle(Rightpelvicfin, 0.0F, 0.0F, -0.4033F);
        this.setRotateAngle(Backslopefront, 0.0372F, 0.0F, 0.0F);
        this.setRotateAngle(Head, -0.2453F, -0.1694F, 0.0422F);
        this.setRotateAngle(Headslope, 0.2759F, 0.0F, 0.0F);
        this.setRotateAngle(Throatslope, -0.1911F, 0.0F, 0.0F);
        this.setRotateAngle(Upperjawfront, -0.1911F, 0.0F, 0.0F);
        this.setRotateAngle(Upperjawslope2, 0.7055F, 0.0F, 0.0F);
        this.setRotateAngle(Upperfrontshears, 0.0848F, 0.0F, 0.0F);
        this.setRotateAngle(Leftuppershears, 0.1274F, -0.1485F, 0.0F);
        this.setRotateAngle(Rightuppershears, 0.1274F, 0.1485F, 0.0F);
        this.setRotateAngle(Upperjawslope1, 0.4138F, 0.0F, 0.0F);
        this.setRotateAngle(Leftcheekslope, 0.7006F, -0.0424F, -0.0848F);
        this.setRotateAngle(Rightcheekslope, 0.7006F, 0.0424F, 0.0848F);
        this.setRotateAngle(Lowerjawback, 0.7288F, 0.0F, 0.0F);
        this.setRotateAngle(Lowerjawmiddle, -0.0637F, 0.0F, 0.0F);
        this.setRotateAngle(Lowerjawfront, 0.0637F, 0.0F, 0.0F);
        this.setRotateAngle(Lowerjawshears, -0.1274F, 0.0F, 0.0F);
        this.setRotateAngle(Lowerjawslope2, -0.0953F, 0.0F, 0.0F);
        this.setRotateAngle(Lowerjawslope1, -0.1061F, 0.0F, 0.0F);
        this.setRotateAngle(Leftpectoralfin, -0.0424F, 0.1485F, 0.5095F);
        this.setRotateAngle(Rightpectoralfin, -0.0424F, -0.1485F, -0.5095F);
        //End of pose, now render the model:
        this.Bodyfront.render(f);
        //Reset rotations, positions and sizing:
        this.Bodyfront.setScale(1.0F, 1.0F, 1.0F);
        this.Bodyfront.scaleChildren = false;
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

        AdvancedModelRenderer[] fishTail = {this.Bodymiddle, this.Bodyend, this.Tailbase, this.Tailend};
        ((EntityPrehistoricFloraDunkleosteus)e).tailBuffer.applyChainSwingBuffer(fishTail);
        this.Bodyfront.offsetY = 0.45F;
        float speed = 0.1F;
        float still = 1f;
        float inwater = 1f;
        if (f3 == 0.0F) {
            still = 0.3F;}
        if (!e.isInWater()) {
            speed = 0.3F;
            inwater = 0.5F;
        }

        //if (f3 != 0.0F) {
        //    this.walk(Jaw, (float) (speed * 1.5), 0.2F, true, 0, -0.2F, f2, 1);
        //}

        this.chainWave(fishTail, speed * still, 0.02F * still, -3, f2, 0.8F * still);
        this.chainSwing(fishTail, speed * still, 0.4F * still, -3, f2, 0.6F * still);
        if (e.isInWater()) {
            this.swing(Bodyfront, speed, 0.3F, true, 0, 0, f2, 1);
        }
        else {
            this.swing(Bodyfront, speed, 0.1F, true, 0, 0, f2, 0.5F);
        }
        this.flap(Leftpectoralfin, (float) (speed * 0.65), 0.3F * inwater, true, 0.8F, 0.3F, f2, 1 * inwater);
        this.swing(Leftpectoralfin, (float) (speed * 0.65), 0.3F * inwater, true, 0, 0, f2, 1 * inwater);
        this.flap(Rightpectoralfin, (float) (speed * 0.65), -0.3F * inwater, true, 0.8F, -0.3F, f2, 1 * inwater);
        this.swing(Rightpectoralfin, (float) (speed * 0.65), -0.3F * inwater, true, 0, 0, f2, 1 * inwater);

        this.flap(Leftpelvicfin, (float) (speed * 0.65), 0.3F * inwater, true, 0.8F, 0.1F, f2, 1 * inwater);
        this.swing(Leftpelvicfin, (float) (speed * 0.65), 0.2F * inwater, true, 0, 0, f2, 1 * inwater);
        this.flap(Rightpelvicfin, (float) (speed * 0.65), -0.3F * inwater, true, 0.8F, -0.1F, f2, 1 * inwater);
        this.swing(Rightpelvicfin, (float) (speed * 0.65), -0.2F * inwater, true, 0, 0, f2, 1 * inwater);

        if (!e.isInWater()) {
            //this.Bodyfront.rotateAngleZ = (float) Math.toRadians(90);
            this.Bodyfront.offsetY = 1F;
            this.bob(Bodyfront, -speed * 1.8F, 2.5F, false, f2, 1);
            this.chainWave(fishTail, speed * 1.5F, 0.02F, -0.2, f2, 0.8F * still);
            this.chainSwing(fishTail, speed * 1.5F, 0.2F, -0.55, f2, 0.4F * still);
        }

    }

    public void animate(IAnimatedEntity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        EntityPrehistoricFloraAgeableBase e = (EntityPrehistoricFloraAgeableBase) entity;
        animator.update(entity);
        this.resetToDefaultPose();
        setRotationAngles(f, f1, f2, f3, f4, f5, (Entity) entity);

        animator.setAnimation(e.ATTACK_ANIMATION);
        animator.startKeyframe(13);
        animator.rotate(this.Head, (float) Math.toRadians(-10), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(this.Lowerjawback, (float) Math.toRadians(75), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.endKeyframe();
        animator.setStaticKeyframe(5);
        animator.resetKeyframe(2);

        animator.setAnimation(e.ROAR_ANIMATION);
        animator.startKeyframe(5);
        animator.rotate(this.Head, (float) Math.toRadians(-5), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(this.Lowerjawback, (float) Math.toRadians(25), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.endKeyframe();
        animator.setStaticKeyframe(5);
        animator.resetKeyframe(5);

    }
}

