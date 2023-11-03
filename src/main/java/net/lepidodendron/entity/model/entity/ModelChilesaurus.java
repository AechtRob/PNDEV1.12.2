package net.lepidodendron.entity.model.entity;

import net.ilexiconn.llibrary.client.model.ModelAnimator;
import net.ilexiconn.llibrary.client.model.tools.AdvancedModelRenderer;
import net.ilexiconn.llibrary.server.animation.IAnimatedEntity;
import net.lepidodendron.entity.EntityPrehistoricFloraElaphrosaurus;
import net.lepidodendron.entity.model.llibraryextensions.AdvancedModelBaseExtended;
import net.minecraft.client.model.ModelBox;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;

public class ModelChilesaurus extends AdvancedModelBaseExtended {
    private final AdvancedModelRenderer root;
    private final AdvancedModelRenderer Hips;
    private final AdvancedModelRenderer Bodymiddle;
    private final AdvancedModelRenderer Bodyfront;
    private final AdvancedModelRenderer Neckbase;
    private final AdvancedModelRenderer Neckmiddlebase;
    private final AdvancedModelRenderer Neckmiddlefront;
    private final AdvancedModelRenderer Neckfront;
    private final AdvancedModelRenderer Head;
    private final AdvancedModelRenderer Upperjawbase;
    private final AdvancedModelRenderer Upperjawfront;
    private final AdvancedModelRenderer Upperjawslopebase;
    private final AdvancedModelRenderer Upperjawslopefront;
    private final AdvancedModelRenderer Lowerjawbase;
    private final AdvancedModelRenderer Lowerjawmiddle;
    private final AdvancedModelRenderer Lowerjawfront;
    private final AdvancedModelRenderer Chinslopefront;
    private final AdvancedModelRenderer Chinslopeback;
    private final AdvancedModelRenderer Masseter;
    private final AdvancedModelRenderer Lefteye;
    private final AdvancedModelRenderer Righteye;
    private final AdvancedModelRenderer Throatpouchfront;
    private final AdvancedModelRenderer Throatpouchback;
    private final AdvancedModelRenderer Rightupperarm;
    private final AdvancedModelRenderer Rightlowerarm;
    private final AdvancedModelRenderer Righthand;
    private final AdvancedModelRenderer Leftupperarm;
    private final AdvancedModelRenderer Leftlowerarm;
    private final AdvancedModelRenderer Lefthand;
    private final AdvancedModelRenderer Tailbase;
    private final AdvancedModelRenderer Tailmiddlebase;
    private final AdvancedModelRenderer Tailmiddle;
    private final AdvancedModelRenderer Tailmiddleend;
    private final AdvancedModelRenderer Tailend;
    private final AdvancedModelRenderer Rightthigh;
    private final AdvancedModelRenderer Rightshin;
    private final AdvancedModelRenderer Rightankle;
    private final AdvancedModelRenderer Rightfoot;
    private final AdvancedModelRenderer Righttoes;
    private final AdvancedModelRenderer Leftthigh;
    private final AdvancedModelRenderer Leftshin;
    private final AdvancedModelRenderer Leftankle;
    private final AdvancedModelRenderer Leftfoot;
    private final AdvancedModelRenderer Lefttoes;


    private ModelAnimator animator;

    public ModelChilesaurus() {
        this.textureWidth = 100;
        this.textureHeight = 100;

        this.root = new AdvancedModelRenderer(this);
        this.root.setRotationPoint(0.0F, 0.0F, 0.0F);


        this.Hips = new AdvancedModelRenderer(this);
        this.Hips.setRotationPoint(0.0F, -9.12F, 1.0F);
        this.root.addChild(Hips);
        this.setRotateAngle(Hips, -0.1911F, 0.0F, 0.0F);
        this.Hips.cubeList.add(new ModelBox(Hips, 0, 74, -4.0F, -3.0F, -7.0F, 8, 12, 14, 0.0F, false));

        this.Bodymiddle = new AdvancedModelRenderer(this);
        this.Bodymiddle.setRotationPoint(0.0F, -0.9F, -6.4F);
        this.Hips.addChild(Bodymiddle);
        this.setRotateAngle(Bodymiddle, 0.1698F, 0.0F, 0.0F);
        this.Bodymiddle.cubeList.add(new ModelBox(Bodymiddle, 0, 51, -4.5F, -2.0F, -10.5F, 9, 11, 11, 0.0F, false));

        this.Bodyfront = new AdvancedModelRenderer(this);
        this.Bodyfront.setRotationPoint(0.0F, -0.4F, -10.4F);
        this.Bodymiddle.addChild(Bodyfront);
        this.setRotateAngle(Bodyfront, 0.1061F, 0.0F, 0.0F);
        this.Bodyfront.cubeList.add(new ModelBox(Bodyfront, 37, 38, -4.0F, -1.5F, -8.5F, 8, 9, 9, 0.0F, false));

        this.Neckbase = new AdvancedModelRenderer(this);
        this.Neckbase.setRotationPoint(0.0F, 0.2F, -7.8F);
        this.Bodyfront.addChild(Neckbase);
        this.setRotateAngle(Neckbase, -0.2759F, 0.0F, 0.0F);
        this.Neckbase.cubeList.add(new ModelBox(Neckbase, 27, 19, -2.5F, -1.5F, -6.0F, 5, 6, 7, 0.0F, false));

        this.Neckmiddlebase = new AdvancedModelRenderer(this);
        this.Neckmiddlebase.setRotationPoint(0.0F, -0.45F, -5.2F);
        this.Neckbase.addChild(Neckmiddlebase);
        this.setRotateAngle(Neckmiddlebase, -0.4245F, 0.0F, 0.0F);
        this.Neckmiddlebase.cubeList.add(new ModelBox(Neckmiddlebase, 62, 12, -1.5F, -1.0F, -6.0F, 3, 5, 7, 0.0F, false));

        this.Neckmiddlefront = new AdvancedModelRenderer(this);
        this.Neckmiddlefront.setRotationPoint(0.0F, -0.2F, -5.3F);
        this.Neckmiddlebase.addChild(Neckmiddlefront);
        this.setRotateAngle(Neckmiddlefront, -0.2122F, 0.0F, 0.0F);
        this.Neckmiddlefront.cubeList.add(new ModelBox(Neckmiddlefront, 17, 15, -1.0F, -0.7F, -5.5F, 2, 4, 6, 0.0F, false));

        this.Neckfront = new AdvancedModelRenderer(this);
        this.Neckfront.setRotationPoint(-0.01F, -0.3F, -5.1F);
        this.Neckmiddlefront.addChild(Neckfront);
        this.setRotateAngle(Neckfront, 0.5732F, 0.0F, 0.0F);
        this.Neckfront.cubeList.add(new ModelBox(Neckfront, 0, 8, -1.0F, -0.5F, -4.0F, 2, 4, 4, 0.0F, false));

        this.Head = new AdvancedModelRenderer(this);
        this.Head.setRotationPoint(0.01F, 0.47F, -3.2F);
        this.Neckfront.addChild(Head);
        this.setRotateAngle(Head, 0.3609F, 0.0F, 0.0F);
        this.Head.cubeList.add(new ModelBox(Head, 35, 0, -1.5F, -1.0F, -3.0F, 3, 2, 3, 0.0F, false));

        this.Upperjawbase = new AdvancedModelRenderer(this);
        this.Upperjawbase.setRotationPoint(0.0F, 0.0F, -3.0F);
        this.Head.addChild(Upperjawbase);
        this.setRotateAngle(Upperjawbase, 0.2759F, 0.0F, 0.0F);
        this.Upperjawbase.cubeList.add(new ModelBox(Upperjawbase, 74, 0, -1.0F, 0.0F, -2.18F, 2, 1, 3, 0.0F, false));

        this.Upperjawfront = new AdvancedModelRenderer(this);
        this.Upperjawfront.setRotationPoint(-0.01F, 0.0F, -2.0F);
        this.Upperjawbase.addChild(Upperjawfront);
        this.setRotateAngle(Upperjawfront, 0.2122F, 0.0F, 0.0F);
        this.Upperjawfront.cubeList.add(new ModelBox(Upperjawfront, 5, 0, -0.5F, 0.0F, -1.0F, 1, 1, 1, 0.0F, false));

        this.Upperjawslopebase = new AdvancedModelRenderer(this);
        this.Upperjawslopebase.setRotationPoint(0.0F, -1.0F, -3.0F);
        this.Head.addChild(Upperjawslopebase);
        this.setRotateAngle(Upperjawslopebase, 0.5943F, 0.0F, 0.0F);
        this.Upperjawslopebase.cubeList.add(new ModelBox(Upperjawslopebase, 0, 17, -0.5F, 0.0F, -2.0F, 1, 1, 2, 0.0F, false));

        this.Upperjawslopefront = new AdvancedModelRenderer(this);
        this.Upperjawslopefront.setRotationPoint(0.0F, 0.0F, -2.0F);
        this.Upperjawslopebase.addChild(Upperjawslopefront);
        this.setRotateAngle(Upperjawslopefront, 0.1463F, 0.0F, 0.0F);
        this.Upperjawslopefront.cubeList.add(new ModelBox(Upperjawslopefront, 0, 35, -0.5F, 0.0F, -1.0F, 1, 1, 1, 0.0F, false));

        this.Lowerjawbase = new AdvancedModelRenderer(this);
        this.Lowerjawbase.setRotationPoint(0.0F, 1.0F, 0.0F);
        this.Head.addChild(Lowerjawbase);
        this.Lowerjawbase.cubeList.add(new ModelBox(Lowerjawbase, 61, 0, -1.5F, 0.0F, -3.0F, 3, 1, 3, 0.0F, false));

        this.Lowerjawmiddle = new AdvancedModelRenderer(this);
        this.Lowerjawmiddle.setRotationPoint(0.0F, 0.0F, -2.9F);
        this.Lowerjawbase.addChild(Lowerjawmiddle);
        this.setRotateAngle(Lowerjawmiddle, 0.2759F, 0.0F, 0.0F);
        this.Lowerjawmiddle.cubeList.add(new ModelBox(Lowerjawmiddle, 12, 5, -1.0F, 0.0F, -2.0F, 2, 1, 2, 0.0F, false));

        this.Lowerjawfront = new AdvancedModelRenderer(this);
        this.Lowerjawfront.setRotationPoint(-0.01F, -0.02F, -1.6F);
        this.Lowerjawmiddle.addChild(Lowerjawfront);
        this.setRotateAngle(Lowerjawfront, 0.2122F, 0.0F, 0.0F);
        this.Lowerjawfront.cubeList.add(new ModelBox(Lowerjawfront, 9, 9, -0.5F, 0.0F, -1.0F, 1, 1, 1, 0.0F, false));

        this.Chinslopefront = new AdvancedModelRenderer(this);
        this.Chinslopefront.setRotationPoint(-0.01F, 1.0F, -1.05F);
        this.Lowerjawmiddle.addChild(Chinslopefront);
        this.setRotateAngle(Chinslopefront, -0.5308F, 0.0F, 0.0F);
        this.Chinslopefront.cubeList.add(new ModelBox(Chinslopefront, 0, 21, -1.0F, -1.0F, 0.0F, 2, 1, 2, 0.0F, false));

        this.Chinslopeback = new AdvancedModelRenderer(this);
        this.Chinslopeback.setRotationPoint(-0.01F, 0.0F, 2.0F);
        this.Chinslopefront.addChild(Chinslopeback);
        this.setRotateAngle(Chinslopeback, 0.4671F, 0.0F, 0.0F);
        this.Chinslopeback.cubeList.add(new ModelBox(Chinslopeback, 0, 31, -1.0F, -1.0F, 0.0F, 2, 1, 2, 0.0F, false));

        this.Masseter = new AdvancedModelRenderer(this);
        this.Masseter.setRotationPoint(0.0F, 0.2F, -2.1F);
        this.Lowerjawbase.addChild(Masseter);
        this.setRotateAngle(Masseter, -0.2759F, 0.0F, 0.0F);
        this.Masseter.cubeList.add(new ModelBox(Masseter, 17, 0, -1.0F, -2.0F, 0.0F, 2, 2, 2, 0.0F, false));

        this.Lefteye = new AdvancedModelRenderer(this);
        this.Lefteye.setRotationPoint(1.57F, -0.15F, -1.95F);
        this.Head.addChild(Lefteye);
        this.Lefteye.cubeList.add(new ModelBox(Lefteye, 10, 0, -1.05F, -0.5F, -1.0F, 1, 1, 2, 0.0F, false));

        this.Righteye = new AdvancedModelRenderer(this);
        this.Righteye.setRotationPoint(-1.57F, -0.15F, -1.95F);
        this.Head.addChild(Righteye);
        this.Righteye.cubeList.add(new ModelBox(Righteye, 7, 3, 0.06F, -0.5F, -1.0F, 1, 1, 2, 0.0F, false));

        this.Throatpouchfront = new AdvancedModelRenderer(this);
        this.Throatpouchfront.setRotationPoint(0.0F, 3.5F, -4.0F);
        this.Neckfront.addChild(Throatpouchfront);
        this.setRotateAngle(Throatpouchfront, -0.3609F, 0.0F, 0.0F);
        this.Throatpouchfront.cubeList.add(new ModelBox(Throatpouchfront, 0, 3, -0.5F, -2.0F, 0.0F, 1, 2, 2, 0.0F, false));

        this.Throatpouchback = new AdvancedModelRenderer(this);
        this.Throatpouchback.setRotationPoint(0.01F, 0.0F, 2.0F);
        this.Throatpouchfront.addChild(Throatpouchback);
        this.setRotateAngle(Throatpouchback, 0.9552F, 0.0F, 0.0F);
        this.Throatpouchback.cubeList.add(new ModelBox(Throatpouchback, 14, 10, -0.5F, -3.0F, 0.0F, 1, 3, 3, 0.0F, false));

        this.Rightupperarm = new AdvancedModelRenderer(this);
        this.Rightupperarm.setRotationPoint(3.5F, 5.5F, -4.5F);
        this.Bodyfront.addChild(Rightupperarm);
        this.setRotateAngle(Rightupperarm, 0.8067F, 0.3609F, -0.1485F);
        this.Rightupperarm.cubeList.add(new ModelBox(Rightupperarm, 28, 9, -1.0F, -1.0F, -1.5F, 3, 6, 3, 0.0F, false));

        this.Rightlowerarm = new AdvancedModelRenderer(this);
        this.Rightlowerarm.setRotationPoint(1.0F, 5.3F, 0.5F);
        this.Rightupperarm.addChild(Rightlowerarm);
        this.setRotateAngle(Rightlowerarm, -0.9128F, -0.0213F, 0.1911F);
        this.Rightlowerarm.cubeList.add(new ModelBox(Rightlowerarm, 19, 6, -1.5F, -0.5F, -2.0F, 2, 4, 2, 0.0F, false));

        this.Righthand = new AdvancedModelRenderer(this);
        this.Righthand.setRotationPoint(0.3F, 3.0F, -0.99F);
        this.Rightlowerarm.addChild(Righthand);
        this.setRotateAngle(Righthand, 0.0637F, 0.0F, 0.2759F);
        this.Righthand.cubeList.add(new ModelBox(Righthand, 85, 0, -1.0F, 0.0F, -1.0F, 1, 3, 2, 0.0F, false));

        this.Leftupperarm = new AdvancedModelRenderer(this);
        this.Leftupperarm.setRotationPoint(-3.5F, 5.5F, -4.5F);
        this.Bodyfront.addChild(Leftupperarm);
        this.setRotateAngle(Leftupperarm, 0.8067F, -0.3609F, 0.1485F);
        this.Leftupperarm.cubeList.add(new ModelBox(Leftupperarm, 41, 9, -2.0F, -1.0F, -1.5F, 3, 6, 3, 0.0F, false));

        this.Leftlowerarm = new AdvancedModelRenderer(this);
        this.Leftlowerarm.setRotationPoint(-1.0F, 5.3F, 0.5F);
        this.Leftupperarm.addChild(Leftlowerarm);
        this.setRotateAngle(Leftlowerarm, -0.9128F, 0.0213F, -0.1911F);
        this.Leftlowerarm.cubeList.add(new ModelBox(Leftlowerarm, 26, 1, -0.5F, -0.5F, -2.0F, 2, 4, 2, 0.0F, false));

        this.Lefthand = new AdvancedModelRenderer(this);
        this.Lefthand.setRotationPoint(-0.3F, 3.0F, -0.99F);
        this.Leftlowerarm.addChild(Lefthand);
        this.setRotateAngle(Lefthand, 0.0637F, 0.0F, -0.2759F);
        this.Lefthand.cubeList.add(new ModelBox(Lefthand, 92, 0, 0.0F, 0.0F, -1.0F, 1, 3, 2, 0.0F, false));

        this.Tailbase = new AdvancedModelRenderer(this);
        this.Tailbase.setRotationPoint(0.0F, -0.3F, 6.4F);
        this.Hips.addChild(Tailbase);
        this.setRotateAngle(Tailbase, -0.0848F, 0.0F, 0.0F);
        this.Tailbase.cubeList.add(new ModelBox(Tailbase, 0, 31, -3.5F, -2.5F, 0.0F, 7, 8, 11, 0.0F, false));

        this.Tailmiddlebase = new AdvancedModelRenderer(this);
        this.Tailmiddlebase.setRotationPoint(0.0F, -0.5F, 10.0F);
        this.Tailbase.addChild(Tailmiddlebase);
        this.setRotateAngle(Tailmiddlebase, 0.1698F, 0.0F, 0.0F);
        this.Tailmiddlebase.cubeList.add(new ModelBox(Tailmiddlebase, 63, 28, -2.5F, -1.5F, 0.0F, 5, 6, 12, 0.0F, false));

        this.Tailmiddle = new AdvancedModelRenderer(this);
        this.Tailmiddle.setRotationPoint(0.0F, -0.4F, 11.3F);
        this.Tailmiddlebase.addChild(Tailmiddle);
        this.setRotateAngle(Tailmiddle, -0.1061F, 0.0F, 0.0F);
        this.Tailmiddle.cubeList.add(new ModelBox(Tailmiddle, 40, 20, -2.0F, -1.0F, 0.0F, 4, 4, 13, 0.0F, false));

        this.Tailmiddleend = new AdvancedModelRenderer(this);
        this.Tailmiddleend.setRotationPoint(0.0F, 0.1F, 12.5F);
        this.Tailmiddle.addChild(Tailmiddleend);
        this.setRotateAngle(Tailmiddleend, -0.1698F, 0.0F, 0.0F);
        this.Tailmiddleend.cubeList.add(new ModelBox(Tailmiddleend, 0, 17, -1.5F, -1.0F, 0.0F, 3, 3, 10, 0.0F, false));

        this.Tailend = new AdvancedModelRenderer(this);
        this.Tailend.setRotationPoint(0.0F, -0.1F, 9.5F);
        this.Tailmiddleend.addChild(Tailend);
        this.setRotateAngle(Tailend, -0.1485F, 0.0F, 0.0F);
        this.Tailend.cubeList.add(new ModelBox(Tailend, 76, 15, -1.0F, -0.7F, 0.0F, 2, 2, 10, 0.0F, false));

        this.Rightthigh = new AdvancedModelRenderer(this);
        this.Rightthigh.setRotationPoint(3.5F, 0.6F, 0.0F);
        this.Hips.addChild(Rightthigh);
        this.setRotateAngle(Rightthigh, -0.0424F, 0.0F, 0.0F);
        this.Rightthigh.cubeList.add(new ModelBox(Rightthigh, 45, 79, -1.0F, -2.0F, -3.5F, 4, 13, 8, 0.0F, false));

        this.Rightshin = new AdvancedModelRenderer(this);
        this.Rightshin.setRotationPoint(1.0F, 11.0F, -2.5F);
        this.Rightthigh.addChild(Rightshin);
        this.setRotateAngle(Rightshin, 0.5519F, 0.0F, 0.0F);
        this.Rightshin.cubeList.add(new ModelBox(Rightshin, 70, 80, -1.5F, -0.5F, -0.5F, 3, 15, 5, 0.0F, false));

        this.Rightankle = new AdvancedModelRenderer(this);
        this.Rightankle.setRotationPoint(0.0F, 14.0F, 3.0F);
        this.Rightshin.addChild(Rightankle);
        this.setRotateAngle(Rightankle, -0.6793F, 0.0F, 0.0F);
        this.Rightankle.cubeList.add(new ModelBox(Rightankle, 78, 47, -1.0F, 0.0F, -2.5F, 2, 10, 3, 0.0F, false));

        this.Rightfoot = new AdvancedModelRenderer(this);
        this.Rightfoot.setRotationPoint(0.0F, 9.7F, -1.5F);
        this.Rightankle.addChild(Rightfoot);
        this.setRotateAngle(Rightfoot, 0.3609F, 0.0F, 0.0F);
        this.Rightfoot.cubeList.add(new ModelBox(Rightfoot, 54, 12, -1.5F, -0.5F, -2.0F, 3, 2, 4, 0.0F, false));

        this.Righttoes = new AdvancedModelRenderer(this);
        this.Righttoes.setRotationPoint(0.0F, 0.49F, -2.0F);
        this.Rightfoot.addChild(Righttoes);
        this.Righttoes.cubeList.add(new ModelBox(Righttoes, 76, 8, -2.5F, -1.0F, -3.5F, 5, 2, 4, 0.0F, false));

        this.Leftthigh = new AdvancedModelRenderer(this);
        this.Leftthigh.setRotationPoint(-3.5F, 0.6F, 0.0F);
        this.Hips.addChild(Leftthigh);
        this.setRotateAngle(Leftthigh, -0.0424F, 0.0F, 0.0F);
        this.Leftthigh.cubeList.add(new ModelBox(Leftthigh, 41, 57, -3.0F, -2.0F, -3.5F, 4, 13, 8, 0.0F, false));

        this.Leftshin = new AdvancedModelRenderer(this);
        this.Leftshin.setRotationPoint(-1.0F, 11.0F, -2.5F);
        this.Leftthigh.addChild(Leftshin);
        this.setRotateAngle(Leftshin, 0.5519F, 0.0F, 0.0F);
        this.Leftshin.cubeList.add(new ModelBox(Leftshin, 66, 59, -1.5F, -0.5F, -0.5F, 3, 15, 5, 0.0F, false));

        this.Leftankle = new AdvancedModelRenderer(this);
        this.Leftankle.setRotationPoint(0.0F, 14.0F, 3.0F);
        this.Leftshin.addChild(Leftankle);
        this.setRotateAngle(Leftankle, -0.6793F, 0.0F, 0.0F);
        this.Leftankle.cubeList.add(new ModelBox(Leftankle, 83, 61, -1.0F, 0.0F, -2.5F, 2, 10, 3, 0.0F, false));

        this.Leftfoot = new AdvancedModelRenderer(this);
        this.Leftfoot.setRotationPoint(0.0F, 9.7F, -1.5F);
        this.Leftankle.addChild(Leftfoot);
        this.setRotateAngle(Leftfoot, 0.3609F, 0.0F, 0.0F);
        this.Leftfoot.cubeList.add(new ModelBox(Leftfoot, 50, 2, -1.5F, -0.5F, -2.0F, 3, 2, 4, 0.0F, false));

        this.Lefttoes = new AdvancedModelRenderer(this);
        this.Lefttoes.setRotationPoint(0.0F, 0.49F, -2.0F);
        this.Leftfoot.addChild(Lefttoes);
        this.Lefttoes.cubeList.add(new ModelBox(Lefttoes, 61, 5, -2.5F, -1.0F, -3.5F, 5, 2, 4, 0.0F, false));

        updateDefaultPose();
        animator = ModelAnimator.create();
    }

    @Override
    public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        animate((IAnimatedEntity) entity, f, f1, f2, f3, f4, f5);
        this.root.render(f5);
    }
    public void renderStatic(float f) {
        //GlStateManager.pushMatrix();
        //GlStateManager.enableBlend();
        //GlStateManager.blendFunc(GlStateManager.SourceFactor.SRC_ALPHA, GlStateManager.DestFactor.ONE_MINUS_SRC_ALPHA);
        //GlStateManager.disableCull();
        //this.Neck.render(0.01F);
        //GlStateManager.enableCull();
        //GlStateManager.disableBlend();
        //GlStateManager.popMatrix();
    }

    public void setRotateAngle(AdvancedModelRenderer AdvancedModelRenderer, float x, float y, float z) {
        AdvancedModelRenderer.rotateAngleX = x;
        AdvancedModelRenderer.rotateAngleY = y;
        AdvancedModelRenderer.rotateAngleZ = z;
    }

    @Override
    public void setRotationAngles(float f, float f1, float f2, float f3, float f4, float f5, Entity e) {
        super.setRotationAngles(f, f1, f2, f3, f4, f5, e);
        //this.resetToDefaultPose();

        EntityPrehistoricFloraElaphrosaurus entityElaphrosaurus = (EntityPrehistoricFloraElaphrosaurus) e;

//        this.faceTarget(f3, f4, 12, Neck1);
//        this.faceTarget(f3, f4, 12, Neck2);
//        this.faceTarget(f3, f4, 12, Neck3);
//        this.faceTarget(f3, f4, 12, Head);

        AdvancedModelRenderer[] Tail = {/*this.Tail, this.Tail2, this.Tail3, this.Tail4*/};
        AdvancedModelRenderer[] Neck = {/*this.Chest, this.Neck, this.Neck2, this.Neck3, this.Head*/};
        //AdvancedModelRenderer[] ArmL = {this.leftarm, this.leftarm2, this.leftarm3};
        //AdvancedModelRenderer[] ArmR = {this.rightarm, this.rightarm2, this.rightarm3};

        entityElaphrosaurus.tailBuffer.applyChainSwingBuffer(Tail);

        if (entityElaphrosaurus.getAnimation() == entityElaphrosaurus.LAY_ANIMATION) {
            this.chainSwing(Neck, 0.5F, 0.10F, 0.5, f2, 0.8F);
            this.chainWave(Neck, 0.5F * 2, -0.02F, 0.5F, f2, 0.8F);
        }
        else {
            if (!entityElaphrosaurus.isReallyInWater()) {

                if (f3 == 0.0F || !entityElaphrosaurus.getIsMoving()) {
                    if (entityElaphrosaurus.getAnimation() != entityElaphrosaurus.EAT_ANIMATION
                        && entityElaphrosaurus.getAnimation() != entityElaphrosaurus.DRINK_ANIMATION) {
                        this.chainSwing(Neck, 0.05F, 0.10F, 0.5, f2, 0.8F);
                        this.chainWave(Neck, 0.05F * 2, -0.02F, 0.5F, f2, 0.8F);
                    }

                    this.chainWave(Tail, (0.15F * 0.35F), 0.125F * 0.15F, 0.2F, f2, 1F);
                    this.chainSwing(Tail, (0.15F * 0.35F) * 4F, 0.05F * 0.35F, 0.12F, f2, 1F);


                    return;
                }

                if (entityElaphrosaurus.getIsFast()) { //Running


                } else { //Walking

                }
            } else {
                //Swimming pose:
                if (f3 == 0.0F) { //static in water
                    return;
                }
                //moving in water
                return;
            }
        }
    }


    @Override
    public void setLivingAnimations(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime) {
        super.setLivingAnimations(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime);
        this.resetToDefaultPose();
        EntityPrehistoricFloraElaphrosaurus ee = (EntityPrehistoricFloraElaphrosaurus) entitylivingbaseIn;

        if (!ee.isReallyInWater()) {
            if (ee.getIsMoving()) {
                if (ee.getIsFast()) { //Running
                    animRunning(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime);
                } else { //Walking
                    animWalking(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime);
                }
            }
        }
        else {
            //Swimming pose:
            if (!ee.getIsMoving()) { //static in water
                //
            }
            else {
                //moving in water
                //
            }
        }
        if (ee.getAnimation() == ee.EAT_ANIMATION) {
            animEat(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime, ee.getAnimationTick());
        }
        else if (ee.getAnimation() == ee.ATTACK_ANIMATION) {
            animAttack(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime, ee.getAnimationTick());
        }
        else if (ee.getAnimation() == ee.MAKE_NEST_ANIMATION) {
            animNest(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime, ee.getAnimationTick());
        }
        else if (ee.getAnimation() == ee.LAY_ANIMATION) {
            animLay(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime, ee.getAnimationTick());
        }
        else if (ee.getAnimation() == ee.ROAR_ANIMATION) { //The noise anim
            animNoise(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime, ee.getAnimationTick());
        }

    }

    public void animNoise(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime, double animTick) {
        EntityPrehistoricFloraElaphrosaurus entity = (EntityPrehistoricFloraElaphrosaurus) entitylivingbaseIn;

    }
    public void animEat(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime, double animTick) {
        EntityPrehistoricFloraElaphrosaurus entity = (EntityPrehistoricFloraElaphrosaurus) entitylivingbaseIn;

    }
    public void animLay(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime, double animTick) {
        EntityPrehistoricFloraElaphrosaurus entity = (EntityPrehistoricFloraElaphrosaurus) entitylivingbaseIn;

    }

    public void animNest(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime, double animTick) {
        EntityPrehistoricFloraElaphrosaurus entity = (EntityPrehistoricFloraElaphrosaurus) entitylivingbaseIn;


    }

    public void animAttack(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime, double animTick) {
        EntityPrehistoricFloraElaphrosaurus entity = (EntityPrehistoricFloraElaphrosaurus) entitylivingbaseIn;

    }



    public void animRunning(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime) {
        EntityPrehistoricFloraElaphrosaurus entity = (EntityPrehistoricFloraElaphrosaurus) entitylivingbaseIn;


}

    public void animWalking(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime) {
        EntityPrehistoricFloraElaphrosaurus entity = (EntityPrehistoricFloraElaphrosaurus) entitylivingbaseIn;


    }

        public void animate(IAnimatedEntity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        EntityPrehistoricFloraElaphrosaurus e = (EntityPrehistoricFloraElaphrosaurus) entity;
        animator.update(entity);

//        animator.setAnimation(e.EAT_ANIMATION); //10 ticks
//        animator.startKeyframe(4);
//        animator.rotate(this.upperbody2, (float) Math.toRadians(10), (float) Math.toRadians(0), (float) Math.toRadians(0));
//        animator.rotate(this.upperbody, (float) Math.toRadians(7.5), (float) Math.toRadians(0), (float) Math.toRadians(0));
//        animator.rotate(this.neck, (float) Math.toRadians(30), (float) Math.toRadians(0), (float) Math.toRadians(0));
//        animator.rotate(this.head, (float) Math.toRadians(15), (float) Math.toRadians(0), (float) Math.toRadians(0));
//        animator.rotate(this.jaw, (float) Math.toRadians(25), (float) Math.toRadians(0), (float) Math.toRadians(0));
//        animator.endKeyframe();
//        animator.setStaticKeyframe(3);
//        animator.resetKeyframe(3);

    }
}
