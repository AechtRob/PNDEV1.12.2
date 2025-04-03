package net.lepidodendron.entity.model.entity;

import net.ilexiconn.llibrary.client.model.ModelAnimator;
import net.ilexiconn.llibrary.client.model.tools.AdvancedModelRenderer;
import net.ilexiconn.llibrary.server.animation.IAnimatedEntity;
import net.lepidodendron.entity.EntityPrehistoricFloraFalcarius;
import net.lepidodendron.entity.model.ModelBasePalaeopedia;
import net.minecraft.client.model.ModelBox;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;

public class ModelFalcarius extends ModelBasePalaeopedia {
    private final AdvancedModelRenderer root;
    private final AdvancedModelRenderer hips;
    private final AdvancedModelRenderer bodymiddle;
    private final AdvancedModelRenderer bodyfront;
    private final AdvancedModelRenderer neckbase;
    private final AdvancedModelRenderer neckmiddlebase;
    private final AdvancedModelRenderer neckmiddlefront;
    private final AdvancedModelRenderer neckfront;
    private final AdvancedModelRenderer head;
    private final AdvancedModelRenderer headslope;
    private final AdvancedModelRenderer upperjawslopebase;
    private final AdvancedModelRenderer upperjawslopefront;
    private final AdvancedModelRenderer upperjawback;
    private final AdvancedModelRenderer upperjawfront;
    private final AdvancedModelRenderer leftupperteeth;
    private final AdvancedModelRenderer rightupperteeth;
    private final AdvancedModelRenderer lowerjawbase;
    private final AdvancedModelRenderer lowerjawmiddle;
    private final AdvancedModelRenderer lowerjawfront;
    private final AdvancedModelRenderer lowerjawslope;
    private final AdvancedModelRenderer leftlowerteeth;
    private final AdvancedModelRenderer rightlowerteeth;
    private final AdvancedModelRenderer leftmasseter;
    private final AdvancedModelRenderer rightmasseter;
    private final AdvancedModelRenderer lefteye;
    private final AdvancedModelRenderer righteye;
    private final AdvancedModelRenderer neckmfrontfeathers;
    private final AdvancedModelRenderer neckmbasefeathers;
    private final AdvancedModelRenderer neckmbasefeathers1;
    private final AdvancedModelRenderer neckmbasefeathers2;
    private final AdvancedModelRenderer neckbasefeathers1;
    private final AdvancedModelRenderer neckbasefeathers2;
    private final AdvancedModelRenderer neckbasefeathers3;
    private final AdvancedModelRenderer neckbasefeathers4;
    private final AdvancedModelRenderer neckbasefeathers5;
    private final AdvancedModelRenderer neckbasefeathers6;
    private final AdvancedModelRenderer chestslope;
    private final AdvancedModelRenderer chestfeathers;
    private final AdvancedModelRenderer leftupperarm;
    private final AdvancedModelRenderer leftlowerarm;
    private final AdvancedModelRenderer lefthand;
    private final AdvancedModelRenderer leftfrontfinger;
    private final AdvancedModelRenderer leftmiddlefinger;
    private final AdvancedModelRenderer leftlittlefinger;
    private final AdvancedModelRenderer lefthandfeathers;
    private final AdvancedModelRenderer leftlarmfeathers;
    private final AdvancedModelRenderer leftpatagiumlower;
    private final AdvancedModelRenderer leftuarmfeathers;
    private final AdvancedModelRenderer leftpatagiumupper;
    private final AdvancedModelRenderer rightupperarm;
    private final AdvancedModelRenderer rightlowerarm;
    private final AdvancedModelRenderer righthand;
    private final AdvancedModelRenderer rightfrontfinger;
    private final AdvancedModelRenderer rightmiddlefinger;
    private final AdvancedModelRenderer rightlittlefinger;
    private final AdvancedModelRenderer righthandfeathers;
    private final AdvancedModelRenderer rightlarmfeathers;
    private final AdvancedModelRenderer rightpatagiumlower;
    private final AdvancedModelRenderer rightuarmfeathers;
    private final AdvancedModelRenderer rightpatagiumupper;
    private final AdvancedModelRenderer bodyfrontfeathers1;
    private final AdvancedModelRenderer bodyfrontfeathers2;
    private final AdvancedModelRenderer bellyslope;
    private final AdvancedModelRenderer bellyfeathers;
    private final AdvancedModelRenderer bodyfeathers1;
    private final AdvancedModelRenderer bodyfeathers2;
    private final AdvancedModelRenderer tailbase;
    private final AdvancedModelRenderer tailmiddlebase;
    private final AdvancedModelRenderer tailmiddleend;
    private final AdvancedModelRenderer tailend;
    private final AdvancedModelRenderer tailendfeathers1;
    private final AdvancedModelRenderer tailendfeathers2;
    private final AdvancedModelRenderer tailmendfeathers1;
    private final AdvancedModelRenderer tailmendfeathers2;
    private final AdvancedModelRenderer tailmendfeathers3;
    private final AdvancedModelRenderer tailmbasefeathers1;
    private final AdvancedModelRenderer tailmbasefeathers2;
    private final AdvancedModelRenderer tailbasefeathers;
    private final AdvancedModelRenderer leftthigh;
    private final AdvancedModelRenderer leftshin;
    private final AdvancedModelRenderer leftankle;
    private final AdvancedModelRenderer leftfoot;
    private final AdvancedModelRenderer lefttoes;
    private final AdvancedModelRenderer leftthighfeathers;
    private final AdvancedModelRenderer rightthigh;
    private final AdvancedModelRenderer rightshin;
    private final AdvancedModelRenderer rightankle;
    private final AdvancedModelRenderer rightfoot;
    private final AdvancedModelRenderer righttoes;
    private final AdvancedModelRenderer rightthighfeathers;
    private final AdvancedModelRenderer hipfeathers;


    private ModelAnimator animator;

    public ModelFalcarius() {
        this.textureWidth = 100;
        this.textureHeight = 100;

        this.root = new AdvancedModelRenderer(this);
        this.root.setRotationPoint(0.0F, 0.125F, 4.0F);


        this.hips = new AdvancedModelRenderer(this);
        this.hips.setRotationPoint(0.0F, 10.59F, -3.5F);
        this.root.addChild(hips);
        this.setRotateAngle(hips, -0.2546F, 0.0F, 0.0F);
        this.hips.cubeList.add(new ModelBox(hips, 0, 55, -2.5F, -2.5F, -2.5F, 5, 8, 6, 0.0F, false));

        this.bodymiddle = new AdvancedModelRenderer(this);
        this.bodymiddle.setRotationPoint(0.0F, -0.5F, -2.0F);
        this.hips.addChild(bodymiddle);
        this.setRotateAngle(bodymiddle, -0.0637F, 0.0F, 0.0F);
        this.bodymiddle.cubeList.add(new ModelBox(bodymiddle, 15, 27, -3.0F, -2.0F, -7.5F, 6, 7, 8, 0.0F, false));

        this.bodyfront = new AdvancedModelRenderer(this);
        this.bodyfront.setRotationPoint(0.0F, -0.48F, -6.7F);
        this.bodymiddle.addChild(bodyfront);
        this.setRotateAngle(bodyfront, 0.1274F, 0.0F, 0.0F);
        this.bodyfront.cubeList.add(new ModelBox(bodyfront, 0, 43, -2.0F, -1.5F, -6.0F, 4, 5, 6, 0.0F, false));

        this.neckbase = new AdvancedModelRenderer(this);
        this.neckbase.setRotationPoint(0.0F, 0.1F, -5.4F);
        this.bodyfront.addChild(neckbase);
        this.setRotateAngle(neckbase, -0.5519F, 0.0F, 0.0F);
        this.neckbase.cubeList.add(new ModelBox(neckbase, 36, 43, -1.5F, -1.5F, -5.0F, 3, 4, 6, 0.0F, false));

        this.neckmiddlebase = new AdvancedModelRenderer(this);
        this.neckmiddlebase.setRotationPoint(0.0F, -0.3F, -4.7F);
        this.neckbase.addChild(neckmiddlebase);
        this.setRotateAngle(neckmiddlebase, -0.2335F, 0.0F, 0.0F);
        this.neckmiddlebase.cubeList.add(new ModelBox(neckmiddlebase, 19, 18, -1.0F, -1.0F, -4.5F, 2, 3, 5, 0.0F, false));

        this.neckmiddlefront = new AdvancedModelRenderer(this);
        this.neckmiddlefront.setRotationPoint(0.01F, -0.24F, -4.1F);
        this.neckmiddlebase.addChild(neckmiddlefront);
        this.setRotateAngle(neckmiddlefront, 0.0637F, 0.0F, 0.0F);
        this.neckmiddlefront.cubeList.add(new ModelBox(neckmiddlefront, 8, 14, -1.0F, -0.75F, -4.85F, 2, 3, 5, 0.0F, false));

        this.neckfront = new AdvancedModelRenderer(this);
        this.neckfront.setRotationPoint(-0.01F, 0.05F, -4.5F);
        this.neckmiddlefront.addChild(neckfront);
        this.setRotateAngle(neckfront, 0.5519F, 0.0F, 0.0F);
        this.neckfront.cubeList.add(new ModelBox(neckfront, 18, 9, -1.0F, -0.75F, -4.75F, 2, 3, 5, 0.0F, false));

        this.head = new AdvancedModelRenderer(this);
        this.head.setRotationPoint(-0.01F, 0.0F, -4.2F);
        this.neckfront.addChild(head);
        this.setRotateAngle(head, 0.5519F, 0.0F, 0.0F);
        this.head.cubeList.add(new ModelBox(head, 32, 0, -1.0F, -0.1F, -1.8F, 2, 1, 2, 0.0F, false));

        this.headslope = new AdvancedModelRenderer(this);
        this.headslope.setRotationPoint(-0.01F, 0.2F, 0.2F);
        this.head.addChild(headslope);
        this.setRotateAngle(headslope, 0.1061F, 0.0F, 0.0F);
        this.headslope.cubeList.add(new ModelBox(headslope, 34, 7, -1.0F, -1.0F, -2.0F, 2, 1, 2, 0.0F, false));

        this.upperjawslopebase = new AdvancedModelRenderer(this);
        this.upperjawslopebase.setRotationPoint(0.02F, -1.0F, -2.0F);
        this.headslope.addChild(upperjawslopebase);
        this.setRotateAngle(upperjawslopebase, 0.2972F, 0.0F, 0.0F);
        this.upperjawslopebase.cubeList.add(new ModelBox(upperjawslopebase, 27, 0, -0.5F, 0.0F, -1.0F, 1, 1, 1, 0.0F, false));

        this.upperjawslopefront = new AdvancedModelRenderer(this);
        this.upperjawslopefront.setRotationPoint(-0.02F, 1.0F, -1.0F);
        this.upperjawslopebase.addChild(upperjawslopefront);
        this.setRotateAngle(upperjawslopefront, -0.0707F, 0.0F, 0.0F);
        this.upperjawslopefront.cubeList.add(new ModelBox(upperjawslopefront, 35, 11, -0.5F, -1.0F, -1.0F, 1, 1, 1, 0.0F, false));

        this.upperjawback = new AdvancedModelRenderer(this);
        this.upperjawback.setRotationPoint(0.0F, 0.9F, -1.8F);
        this.head.addChild(upperjawback);
        this.setRotateAngle(upperjawback, 0.0848F, 0.0F, 0.0F);
        this.upperjawback.cubeList.add(new ModelBox(upperjawback, 9, 1, -0.5F, -1.0F, -1.2F, 1, 1, 2, 0.0F, false));

        this.upperjawfront = new AdvancedModelRenderer(this);
        this.upperjawfront.setRotationPoint(0.01F, -1.0F, -1.2F);
        this.upperjawback.addChild(upperjawfront);
        this.setRotateAngle(upperjawfront, 0.0848F, 0.0F, 0.0F);
        this.upperjawfront.cubeList.add(new ModelBox(upperjawfront, 29, 18, -0.5F, 0.0F, -1.0F, 1, 1, 1, 0.0F, false));

        this.leftupperteeth = new AdvancedModelRenderer(this);
        this.leftupperteeth.setRotationPoint(-0.38F, -0.85F, -1.1F);
        this.upperjawback.addChild(leftupperteeth);
        this.setRotateAngle(leftupperteeth, 0.1061F, -0.0848F, 0.0F);
        this.leftupperteeth.cubeList.add(new ModelBox(leftupperteeth, 7, 7, 0.0F, 0.0F, -1.0F, 0, 1, 2, 0.0F, false));

        this.rightupperteeth = new AdvancedModelRenderer(this);
        this.rightupperteeth.setRotationPoint(0.38F, -0.85F, -1.1F);
        this.upperjawback.addChild(rightupperteeth);
        this.setRotateAngle(rightupperteeth, 0.1061F, 0.0848F, 0.0F);
        this.rightupperteeth.cubeList.add(new ModelBox(rightupperteeth, 6, 3, 0.0F, 0.0F, -1.0F, 0, 1, 2, 0.0F, false));

        this.lowerjawbase = new AdvancedModelRenderer(this);
        this.lowerjawbase.setRotationPoint(0.0F, 0.9F, 0.2F);
        this.head.addChild(lowerjawbase);
        this.lowerjawbase.cubeList.add(new ModelBox(lowerjawbase, 15, 0, -1.0F, 0.0F, -2.0F, 2, 1, 2, 0.0F, false));

        this.lowerjawmiddle = new AdvancedModelRenderer(this);
        this.lowerjawmiddle.setRotationPoint(0.0F, 0.0F, -2.11F);
        this.lowerjawbase.addChild(lowerjawmiddle);
        this.setRotateAngle(lowerjawmiddle, 0.0848F, 0.0F, 0.0F);
        this.lowerjawmiddle.cubeList.add(new ModelBox(lowerjawmiddle, 29, 3, -0.5F, 0.0F, -1.0F, 1, 1, 2, 0.0F, false));

        this.lowerjawfront = new AdvancedModelRenderer(this);
        this.lowerjawfront.setRotationPoint(-0.01F, 0.0F, -1.0F);
        this.lowerjawmiddle.addChild(lowerjawfront);
        this.setRotateAngle(lowerjawfront, 0.0424F, 0.0F, 0.0F);
        this.lowerjawfront.cubeList.add(new ModelBox(lowerjawfront, 0, 3, -0.5F, 0.0F, -1.0F, 1, 1, 1, 0.0F, false));

        this.lowerjawslope = new AdvancedModelRenderer(this);
        this.lowerjawslope.setRotationPoint(-0.02F, 1.0F, -0.9F);
        this.lowerjawmiddle.addChild(lowerjawslope);
        this.setRotateAngle(lowerjawslope, -0.0848F, 0.0F, 0.0F);
        this.lowerjawslope.cubeList.add(new ModelBox(lowerjawslope, 8, 5, -0.5F, -1.0F, 0.0F, 1, 1, 2, 0.0F, false));

        this.leftlowerteeth = new AdvancedModelRenderer(this);
        this.leftlowerteeth.setRotationPoint(-0.37F, 0.9F, -0.94F);
        this.lowerjawmiddle.addChild(leftlowerteeth);
        this.setRotateAngle(leftlowerteeth, -0.1274F, -0.0848F, 0.0F);
        this.leftlowerteeth.cubeList.add(new ModelBox(leftlowerteeth, 7, 9, 0.0F, -1.0F, -1.0F, 0, 1, 2, 0.0F, false));

        this.rightlowerteeth = new AdvancedModelRenderer(this);
        this.rightlowerteeth.setRotationPoint(0.37F, 0.9F, -0.94F);
        this.lowerjawmiddle.addChild(rightlowerteeth);
        this.setRotateAngle(rightlowerteeth, -0.1274F, 0.0848F, 0.0F);
        this.rightlowerteeth.cubeList.add(new ModelBox(rightlowerteeth, 1, 17, 0.0F, -1.0F, -1.0F, 0, 1, 2, 0.0F, false));

        this.leftmasseter = new AdvancedModelRenderer(this);
        this.leftmasseter.setRotationPoint(-0.2F, 0.0F, -1.7F);
        this.lowerjawbase.addChild(leftmasseter);
        this.setRotateAngle(leftmasseter, -0.3183F, 0.0F, 0.0F);
        this.leftmasseter.cubeList.add(new ModelBox(leftmasseter, 0, 6, -0.5F, -1.35F, 0.0F, 1, 2, 1, 0.0F, false));

        this.rightmasseter = new AdvancedModelRenderer(this);
        this.rightmasseter.setRotationPoint(0.2F, 0.0F, -1.69F);
        this.lowerjawbase.addChild(rightmasseter);
        this.setRotateAngle(rightmasseter, -0.3183F, 0.0F, 0.0F);
        this.rightmasseter.cubeList.add(new ModelBox(rightmasseter, 4, 0, -0.5F, -1.35F, 0.0F, 1, 2, 1, 0.0F, false));

        this.lefteye = new AdvancedModelRenderer(this);
        this.lefteye.setRotationPoint(0.55F, 0.12F, -1.39F);
        this.head.addChild(lefteye);
        this.lefteye.cubeList.add(new ModelBox(lefteye, 33, 14, -0.5F, -0.5F, -0.5F, 1, 1, 1, 0.0F, false));

        this.righteye = new AdvancedModelRenderer(this);
        this.righteye.setRotationPoint(-0.55F, 0.12F, -1.39F);
        this.head.addChild(righteye);
        this.righteye.cubeList.add(new ModelBox(righteye, 39, 14, -0.5F, -0.5F, -0.5F, 1, 1, 1, 0.0F, false));

        this.neckmfrontfeathers = new AdvancedModelRenderer(this);
        this.neckmfrontfeathers.setRotationPoint(0.0F, 0.25F, -4.75F);
        this.neckmiddlefront.addChild(neckmfrontfeathers);
        this.setRotateAngle(neckmfrontfeathers, 0.1061F, 0.0F, 0.0F);
        this.neckmfrontfeathers.cubeList.add(new ModelBox(neckmfrontfeathers, 90, 0, 0.0F, -1.0F, 0.0F, 0, 1, 5, 0.0F, false));

        this.neckmbasefeathers = new AdvancedModelRenderer(this);
        this.neckmbasefeathers.setRotationPoint(0.0F, -0.4F, -4.5F);
        this.neckmiddlebase.addChild(neckmbasefeathers);
        this.setRotateAngle(neckmbasefeathers, 0.0848F, 0.0F, 0.0F);
        this.neckmbasefeathers.cubeList.add(new ModelBox(neckmbasefeathers, 36, 0, -0.5F, -1.0F, 0.0F, 1, 1, 5, 0.0F, false));

        this.neckmbasefeathers1 = new AdvancedModelRenderer(this);
        this.neckmbasefeathers1.setRotationPoint(0.01F, 2.0F, -2.5F);
        this.neckmiddlebase.addChild(neckmbasefeathers1);
        this.setRotateAngle(neckmbasefeathers1, -0.2759F, 0.0F, 0.0F);
        this.neckmbasefeathers1.cubeList.add(new ModelBox(neckmbasefeathers1, 48, 27, -1.0F, -1.0F, 0.0F, 2, 1, 3, 0.0F, false));

        this.neckmbasefeathers2 = new AdvancedModelRenderer(this);
        this.neckmbasefeathers2.setRotationPoint(-0.01F, 2.0F, -3.3F);
        this.neckmiddlebase.addChild(neckmbasefeathers2);
        this.setRotateAngle(neckmbasefeathers2, -0.3609F, 0.0F, 0.0F);
        this.neckmbasefeathers2.cubeList.add(new ModelBox(neckmbasefeathers2, 61, 54, -1.0F, -1.0F, 0.0F, 2, 1, 2, 0.0F, false));

        this.neckbasefeathers1 = new AdvancedModelRenderer(this);
        this.neckbasefeathers1.setRotationPoint(0.01F, 2.5F, -1.9F);
        this.neckbase.addChild(neckbasefeathers1);
        this.setRotateAngle(neckbasefeathers1, -0.3396F, 0.0F, 0.0F);
        this.neckbasefeathers1.cubeList.add(new ModelBox(neckbasefeathers1, 35, 26, -1.5F, -1.0F, 0.0F, 3, 1, 3, 0.0F, false));

        this.neckbasefeathers2 = new AdvancedModelRenderer(this);
        this.neckbasefeathers2.setRotationPoint(-0.01F, 2.5F, -3.4F);
        this.neckbase.addChild(neckbasefeathers2);
        this.setRotateAngle(neckbasefeathers2, -0.3183F, 0.0F, 0.0F);
        this.neckbasefeathers2.cubeList.add(new ModelBox(neckbasefeathers2, 38, 31, -1.5F, -1.0F, 0.0F, 3, 1, 3, 0.0F, false));

        this.neckbasefeathers3 = new AdvancedModelRenderer(this);
        this.neckbasefeathers3.setRotationPoint(0.01F, 2.5F, -4.6F);
        this.neckbase.addChild(neckbasefeathers3);
        this.setRotateAngle(neckbasefeathers3, -0.2972F, 0.0F, 0.0F);
        this.neckbasefeathers3.cubeList.add(new ModelBox(neckbasefeathers3, 90, 62, -1.0F, -1.0F, 0.0F, 2, 1, 2, 0.0F, false));

        this.neckbasefeathers4 = new AdvancedModelRenderer(this);
        this.neckbasefeathers4.setRotationPoint(-0.01F, -1.5F, -4.8F);
        this.neckbase.addChild(neckbasefeathers4);
        this.setRotateAngle(neckbasefeathers4, 0.2546F, 0.0F, 0.0F);
        this.neckbasefeathers4.cubeList.add(new ModelBox(neckbasefeathers4, 92, 37, -1.0F, 0.0F, 0.0F, 2, 2, 2, 0.0F, false));

        this.neckbasefeathers5 = new AdvancedModelRenderer(this);
        this.neckbasefeathers5.setRotationPoint(0.01F, -1.5F, -3.9F);
        this.neckbase.addChild(neckbasefeathers5);
        this.setRotateAngle(neckbasefeathers5, 0.2335F, 0.0F, 0.0F);
        this.neckbasefeathers5.cubeList.add(new ModelBox(neckbasefeathers5, 49, 44, -1.5F, 0.0F, 0.0F, 3, 1, 3, 0.0F, false));

        this.neckbasefeathers6 = new AdvancedModelRenderer(this);
        this.neckbasefeathers6.setRotationPoint(-0.01F, -1.5F, -1.8F);
        this.neckbase.addChild(neckbasefeathers6);
        this.setRotateAngle(neckbasefeathers6, 0.2759F, 0.0F, 0.0F);
        this.neckbasefeathers6.cubeList.add(new ModelBox(neckbasefeathers6, 88, 57, -1.5F, 0.0F, 0.0F, 3, 1, 3, 0.0F, false));

        this.chestslope = new AdvancedModelRenderer(this);
        this.chestslope.setRotationPoint(-0.01F, 5.5F, -0.3F);
        this.bodyfront.addChild(chestslope);
        this.setRotateAngle(chestslope, -0.3396F, 0.0F, 0.0F);
        this.chestslope.cubeList.add(new ModelBox(chestslope, 55, 45, -2.0F, -2.0F, -6.0F, 4, 2, 6, 0.0F, false));

        this.chestfeathers = new AdvancedModelRenderer(this);
        this.chestfeathers.setRotationPoint(0.0F, -0.5F, -5.9F);
        this.chestslope.addChild(chestfeathers);
        this.setRotateAngle(chestfeathers, 0.4882F, 0.0F, 0.0F);
        this.chestfeathers.cubeList.add(new ModelBox(chestfeathers, 50, 35, -1.0F, 0.0F, 0.0F, 2, 4, 5, 0.0F, false));

        this.leftupperarm = new AdvancedModelRenderer(this);
        this.leftupperarm.setRotationPoint(1.8F, 2.5F, -4.5F);
        this.bodyfront.addChild(leftupperarm);
        this.setRotateAngle(leftupperarm, 1.1675F, 0.2759F, -0.3183F);
        this.leftupperarm.cubeList.add(new ModelBox(leftupperarm, 0, 10, -0.6F, -0.5F, -1.5F, 2, 5, 3, 0.0F, false));

        this.leftlowerarm = new AdvancedModelRenderer(this);
        this.leftlowerarm.setRotationPoint(0.6F, 4.0F, 0.1F);
        this.leftupperarm.addChild(leftlowerarm);
        this.setRotateAngle(leftlowerarm, -0.9128F, 0.1061F, 0.2759F);
        this.leftlowerarm.cubeList.add(new ModelBox(leftlowerarm, 28, 7, -0.5F, 0.0F, -1.5F, 1, 4, 2, 0.0F, false));

        this.lefthand = new AdvancedModelRenderer(this);
        this.lefthand.setRotationPoint(0.47F, 3.6F, -0.5F);
        this.leftlowerarm.addChild(lefthand);
        this.setRotateAngle(lefthand, 0.2335F, -0.0424F, 0.2546F);
        this.lefthand.cubeList.add(new ModelBox(lefthand, 17, 85, -1.0F, 0.0F, -1.0F, 1, 2, 2, 0.0F, false));

        this.leftfrontfinger = new AdvancedModelRenderer(this);
        this.leftfrontfinger.setRotationPoint(-0.01F, 0.5F, -0.95F);
        this.lefthand.addChild(leftfrontfinger);
        this.setRotateAngle(leftfrontfinger, -0.5308F, 0.0F, 0.1274F);
        this.leftfrontfinger.cubeList.add(new ModelBox(leftfrontfinger, 0, 85, -1.0F, 0.0F, 0.0F, 1, 3, 1, 0.0F, false));

        this.leftmiddlefinger = new AdvancedModelRenderer(this);
        this.leftmiddlefinger.setRotationPoint(-0.01F, 1.8F, -0.5F);
        this.lefthand.addChild(leftmiddlefinger);
        this.setRotateAngle(leftmiddlefinger, 0.0F, 0.0F, 0.1274F);
        this.leftmiddlefinger.cubeList.add(new ModelBox(leftmiddlefinger, 5, 85, -1.0F, 0.0F, -0.5F, 1, 3, 1, 0.0F, false));

        this.leftlittlefinger = new AdvancedModelRenderer(this);
        this.leftlittlefinger.setRotationPoint(-0.01F, 1.8F, 0.5F);
        this.lefthand.addChild(leftlittlefinger);
        this.setRotateAngle(leftlittlefinger, 0.0637F, 0.0F, 0.1911F);
        this.leftlittlefinger.cubeList.add(new ModelBox(leftlittlefinger, 10, 86, -1.0F, 0.0F, -0.5F, 1, 2, 1, 0.0F, false));

        this.lefthandfeathers = new AdvancedModelRenderer(this);
        this.lefthandfeathers.setRotationPoint(-0.2F, 0.7F, -0.6F);
        this.lefthand.addChild(lefthandfeathers);
        this.setRotateAngle(lefthandfeathers, -0.4245F, 0.3609F, -0.1061F);
        this.lefthandfeathers.cubeList.add(new ModelBox(lefthandfeathers, 84, 58, 0.0F, -1.0F, 0.0F, 0, 2, 1, 0.0F, false));

        this.leftlarmfeathers = new AdvancedModelRenderer(this);
        this.leftlarmfeathers.setRotationPoint(0.44F, 1.5F, -0.4F);
        this.leftlowerarm.addChild(leftlarmfeathers);
        this.setRotateAngle(leftlarmfeathers, -0.1911F, 0.2122F, -0.0213F);
        this.leftlarmfeathers.cubeList.add(new ModelBox(leftlarmfeathers, 91, 10, 0.0F, -2.0F, 0.0F, 0, 4, 2, 0.0F, false));

        this.leftpatagiumlower = new AdvancedModelRenderer(this);
        this.leftpatagiumlower.setRotationPoint(0.0F, 3.8F, -1.5F);
        this.leftlowerarm.addChild(leftpatagiumlower);
        this.setRotateAngle(leftpatagiumlower, 0.2335F, 0.0F, 0.0F);
        this.leftpatagiumlower.cubeList.add(new ModelBox(leftpatagiumlower, 22, 53, 0.0F, -4.0F, 0.0F, 0, 4, 2, 0.0F, false));

        this.leftuarmfeathers = new AdvancedModelRenderer(this);
        this.leftuarmfeathers.setRotationPoint(0.8F, 3.0F, 0.1F);
        this.leftupperarm.addChild(leftuarmfeathers);
        this.setRotateAngle(leftuarmfeathers, 0.1485F, -0.1698F, -0.0424F);
        this.leftuarmfeathers.cubeList.add(new ModelBox(leftuarmfeathers, 70, 11, -0.5F, -3.5F, 0.0F, 1, 6, 3, 0.0F, false));

        this.leftpatagiumupper = new AdvancedModelRenderer(this);
        this.leftpatagiumupper.setRotationPoint(0.9F, 0.5F, -1.5F);
        this.leftupperarm.addChild(leftpatagiumupper);
        this.setRotateAngle(leftpatagiumupper, -0.2335F, 0.2972F, 0.0424F);
        this.leftpatagiumupper.cubeList.add(new ModelBox(leftpatagiumupper, 30, 54, 0.0F, 0.0F, 0.0F, 0, 4, 1, 0.0F, false));

        this.rightupperarm = new AdvancedModelRenderer(this);
        this.rightupperarm.setRotationPoint(-1.8F, 2.5F, -4.5F);
        this.bodyfront.addChild(rightupperarm);
        this.setRotateAngle(rightupperarm, 1.1675F, -0.2759F, 0.3183F);
        this.rightupperarm.cubeList.add(new ModelBox(rightupperarm, 12, 5, -1.4F, -0.5F, -1.5F, 2, 5, 3, 0.0F, false));

        this.rightlowerarm = new AdvancedModelRenderer(this);
        this.rightlowerarm.setRotationPoint(-0.6F, 4.0F, 0.1F);
        this.rightupperarm.addChild(rightlowerarm);
        this.setRotateAngle(rightlowerarm, -0.9128F, -0.1061F, -0.2759F);
        this.rightlowerarm.cubeList.add(new ModelBox(rightlowerarm, 22, 2, -0.5F, 0.0F, -1.5F, 1, 4, 2, 0.0F, false));

        this.righthand = new AdvancedModelRenderer(this);
        this.righthand.setRotationPoint(-0.47F, 3.6F, -0.5F);
        this.rightlowerarm.addChild(righthand);
        this.setRotateAngle(righthand, 0.2335F, 0.0424F, -0.2546F);
        this.righthand.cubeList.add(new ModelBox(righthand, 17, 90, 0.0F, 0.0F, -1.0F, 1, 2, 2, 0.0F, false));

        this.rightfrontfinger = new AdvancedModelRenderer(this);
        this.rightfrontfinger.setRotationPoint(0.01F, 0.5F, -0.95F);
        this.righthand.addChild(rightfrontfinger);
        this.setRotateAngle(rightfrontfinger, -0.5308F, 0.0F, -0.1274F);
        this.rightfrontfinger.cubeList.add(new ModelBox(rightfrontfinger, 0, 90, 0.0F, 0.0F, 0.0F, 1, 3, 1, 0.0F, false));

        this.rightmiddlefinger = new AdvancedModelRenderer(this);
        this.rightmiddlefinger.setRotationPoint(0.01F, 1.8F, -0.5F);
        this.righthand.addChild(rightmiddlefinger);
        this.setRotateAngle(rightmiddlefinger, 0.0F, 0.0F, -0.1274F);
        this.rightmiddlefinger.cubeList.add(new ModelBox(rightmiddlefinger, 5, 90, 0.0F, 0.0F, -0.5F, 1, 3, 1, 0.0F, false));

        this.rightlittlefinger = new AdvancedModelRenderer(this);
        this.rightlittlefinger.setRotationPoint(0.01F, 1.8F, 0.5F);
        this.righthand.addChild(rightlittlefinger);
        this.setRotateAngle(rightlittlefinger, 0.0637F, 0.0F, -0.1911F);
        this.rightlittlefinger.cubeList.add(new ModelBox(rightlittlefinger, 10, 91, 0.0F, 0.0F, -0.5F, 1, 2, 1, 0.0F, false));

        this.righthandfeathers = new AdvancedModelRenderer(this);
        this.righthandfeathers.setRotationPoint(0.2F, 0.7F, -0.6F);
        this.righthand.addChild(righthandfeathers);
        this.setRotateAngle(righthandfeathers, -0.4245F, -0.3609F, 0.1061F);
        this.righthandfeathers.cubeList.add(new ModelBox(righthandfeathers, 81, 58, 0.0F, -1.0F, 0.0F, 0, 2, 1, 0.0F, false));

        this.rightlarmfeathers = new AdvancedModelRenderer(this);
        this.rightlarmfeathers.setRotationPoint(-0.44F, 1.5F, -0.4F);
        this.rightlowerarm.addChild(rightlarmfeathers);
        this.setRotateAngle(rightlarmfeathers, -0.1911F, -0.2122F, 0.0213F);
        this.rightlarmfeathers.cubeList.add(new ModelBox(rightlarmfeathers, 91, 15, 0.0F, -2.0F, 0.0F, 0, 4, 2, 0.0F, false));

        this.rightpatagiumlower = new AdvancedModelRenderer(this);
        this.rightpatagiumlower.setRotationPoint(0.0F, 3.8F, -1.5F);
        this.rightlowerarm.addChild(rightpatagiumlower);
        this.setRotateAngle(rightpatagiumlower, 0.2335F, 0.0F, 0.0F);
        this.rightpatagiumlower.cubeList.add(new ModelBox(rightpatagiumlower, 17, 53, 0.0F, -4.0F, 0.0F, 0, 4, 2, 0.0F, false));

        this.rightuarmfeathers = new AdvancedModelRenderer(this);
        this.rightuarmfeathers.setRotationPoint(-0.8F, 3.0F, 0.1F);
        this.rightupperarm.addChild(rightuarmfeathers);
        this.setRotateAngle(rightuarmfeathers, 0.1485F, 0.1698F, 0.0424F);
        this.rightuarmfeathers.cubeList.add(new ModelBox(rightuarmfeathers, 79, 11, -0.5F, -3.5F, 0.0F, 1, 6, 3, 0.0F, false));

        this.rightpatagiumupper = new AdvancedModelRenderer(this);
        this.rightpatagiumupper.setRotationPoint(-0.9F, 0.5F, -1.5F);
        this.rightupperarm.addChild(rightpatagiumupper);
        this.setRotateAngle(rightpatagiumupper, -0.2335F, -0.2972F, -0.0424F);
        this.rightpatagiumupper.cubeList.add(new ModelBox(rightpatagiumupper, 27, 54, 0.0F, 0.0F, 0.0F, 0, 4, 1, 0.0F, false));

        this.bodyfrontfeathers1 = new AdvancedModelRenderer(this);
        this.bodyfrontfeathers1.setRotationPoint(0.0F, -1.5F, -5.5F);
        this.bodyfront.addChild(bodyfrontfeathers1);
        this.setRotateAngle(bodyfrontfeathers1, 0.0848F, 0.0F, 0.0F);
        this.bodyfrontfeathers1.cubeList.add(new ModelBox(bodyfrontfeathers1, 65, 35, -2.5F, 0.0F, 0.0F, 5, 4, 5, 0.0F, false));

        this.bodyfrontfeathers2 = new AdvancedModelRenderer(this);
        this.bodyfrontfeathers2.setRotationPoint(-0.01F, 0.0F, 0.2F);
        this.bodyfrontfeathers1.addChild(bodyfrontfeathers2);
        this.setRotateAngle(bodyfrontfeathers2, 0.1485F, 0.0F, 0.0F);
        this.bodyfrontfeathers2.cubeList.add(new ModelBox(bodyfrontfeathers2, 70, 54, -2.0F, 0.0F, 0.0F, 4, 1, 3, 0.0F, false));

        this.bellyslope = new AdvancedModelRenderer(this);
        this.bellyslope.setRotationPoint(0.0F, 6.0F, 0.65F);
        this.bodymiddle.addChild(bellyslope);
        this.setRotateAngle(bellyslope, -0.1274F, 0.0F, 0.0F);
        this.bellyslope.cubeList.add(new ModelBox(bellyslope, 42, 68, -2.0F, -1.0F, -8.0F, 4, 1, 8, 0.0F, false));

        this.bellyfeathers = new AdvancedModelRenderer(this);
        this.bellyfeathers.setRotationPoint(0.0F, 0.0F, -7.4F);
        this.bellyslope.addChild(bellyfeathers);
        this.setRotateAngle(bellyfeathers, 0.3183F, 0.0F, 0.0F);
        this.bellyfeathers.cubeList.add(new ModelBox(bellyfeathers, 56, 14, -1.5F, 0.0F, 0.0F, 3, 3, 7, 0.0F, false));

        this.bodyfeathers1 = new AdvancedModelRenderer(this);
        this.bodyfeathers1.setRotationPoint(0.0F, -2.0F, -7.2F);
        this.bodymiddle.addChild(bodyfeathers1);
        this.setRotateAngle(bodyfeathers1, 0.1061F, 0.0F, 0.0F);
        this.bodyfeathers1.cubeList.add(new ModelBox(bodyfeathers1, 42, 0, -3.5F, 0.0F, 0.0F, 7, 6, 7, 0.0F, false));

        this.bodyfeathers2 = new AdvancedModelRenderer(this);
        this.bodyfeathers2.setRotationPoint(0.0F, 0.0F, 0.5F);
        this.bodyfeathers1.addChild(bodyfeathers2);
        this.setRotateAngle(bodyfeathers2, 0.1698F, 0.0F, 0.0F);
        this.bodyfeathers2.cubeList.add(new ModelBox(bodyfeathers2, 64, 0, -2.5F, 0.0F, 0.0F, 5, 2, 3, 0.0F, false));

        this.tailbase = new AdvancedModelRenderer(this);
        this.tailbase.setRotationPoint(0.0F, -0.95F, 3.2F);
        this.hips.addChild(tailbase);
        this.setRotateAngle(tailbase, 0.0637F, 0.0F, 0.0F);
        this.tailbase.cubeList.add(new ModelBox(tailbase, 0, 70, -2.0F, -1.5F, -0.5F, 4, 5, 9, 0.0F, false));

        this.tailmiddlebase = new AdvancedModelRenderer(this);
        this.tailmiddlebase.setRotationPoint(0.0F, -0.4F, 7.7F);
        this.tailbase.addChild(tailmiddlebase);
        this.setRotateAngle(tailmiddlebase, 0.1698F, 0.0F, 0.0F);
        this.tailmiddlebase.cubeList.add(new ModelBox(tailmiddlebase, 45, 54, -1.5F, -1.0F, -0.2F, 3, 4, 9, 0.0F, false));

        this.tailmiddleend = new AdvancedModelRenderer(this);
        this.tailmiddleend.setRotationPoint(0.0F, -0.2F, 8.2F);
        this.tailmiddlebase.addChild(tailmiddleend);
        this.setRotateAngle(tailmiddleend, 0.1061F, 0.0F, 0.0F);
        this.tailmiddleend.cubeList.add(new ModelBox(tailmiddleend, 27, 68, -1.0F, -0.75F, -0.2F, 2, 3, 9, 0.0F, false));

        this.tailend = new AdvancedModelRenderer(this);
        this.tailend.setRotationPoint(0.0F, -0.2F, 8.3F);
        this.tailmiddleend.addChild(tailend);
        this.setRotateAngle(tailend, -0.2122F, 0.0F, 0.0F);
        this.tailend.cubeList.add(new ModelBox(tailend, 24, 55, -0.5F, -0.5F, -0.1F, 1, 3, 9, 0.0F, false));

        this.tailendfeathers1 = new AdvancedModelRenderer(this);
        this.tailendfeathers1.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.tailend.addChild(tailendfeathers1);
        this.tailendfeathers1.cubeList.add(new ModelBox(tailendfeathers1, 64, 13, 0.0F, -2.5F, 0.0F, 0, 7, 12, 0.0F, false));

        this.tailendfeathers2 = new AdvancedModelRenderer(this);
        this.tailendfeathers2.setRotationPoint(0.0F, 0.1F, 0.0F);
        this.tailend.addChild(tailendfeathers2);
        this.setRotateAngle(tailendfeathers2, -0.0637F, 0.0F, 0.0F);
        this.tailendfeathers2.cubeList.add(new ModelBox(tailendfeathers2, 71, 0, -2.0F, 0.0F, 0.0F, 4, 1, 10, 0.0F, false));

        this.tailmendfeathers1 = new AdvancedModelRenderer(this);
        this.tailmendfeathers1.setRotationPoint(-0.01F, 1.05F, -0.2F);
        this.tailmiddleend.addChild(tailmendfeathers1);
        this.setRotateAngle(tailmendfeathers1, -0.1274F, 0.0F, 0.0F);
        this.tailmendfeathers1.cubeList.add(new ModelBox(tailmendfeathers1, 78, 12, -0.5F, 0.0F, 0.0F, 1, 2, 10, 0.0F, false));

        this.tailmendfeathers2 = new AdvancedModelRenderer(this);
        this.tailmendfeathers2.setRotationPoint(0.01F, -0.5F, 0.0F);
        this.tailmiddleend.addChild(tailmendfeathers2);
        this.setRotateAngle(tailmendfeathers2, 0.0424F, 0.0F, 0.0F);
        this.tailmendfeathers2.cubeList.add(new ModelBox(tailmendfeathers2, 80, 25, -0.5F, -1.0F, 0.0F, 1, 2, 9, 0.0F, false));

        this.tailmendfeathers3 = new AdvancedModelRenderer(this);
        this.tailmendfeathers3.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.tailmiddleend.addChild(tailmendfeathers3);
        this.setRotateAngle(tailmendfeathers3, -0.0424F, 0.0F, 0.0F);
        this.tailmendfeathers3.cubeList.add(new ModelBox(tailmendfeathers3, 39, 16, -1.5F, 0.0F, 0.0F, 3, 0, 10, 0.0F, false));

        this.tailmbasefeathers1 = new AdvancedModelRenderer(this);
        this.tailmbasefeathers1.setRotationPoint(0.01F, 1.6F, 0.0F);
        this.tailmiddlebase.addChild(tailmbasefeathers1);
        this.setRotateAngle(tailmbasefeathers1, -0.0848F, 0.0F, 0.0F);
        this.tailmbasefeathers1.cubeList.add(new ModelBox(tailmbasefeathers1, 78, 37, -1.0F, 0.0F, 0.0F, 2, 2, 9, 0.0F, false));

        this.tailmbasefeathers2 = new AdvancedModelRenderer(this);
        this.tailmbasefeathers2.setRotationPoint(0.0F, -0.1F, -0.2F);
        this.tailmiddlebase.addChild(tailmbasefeathers2);
        this.setRotateAngle(tailmbasefeathers2, 0.0637F, 0.0F, 0.0F);
        this.tailmbasefeathers2.cubeList.add(new ModelBox(tailmbasefeathers2, 44, 5, 0.0F, -1.0F, 0.0F, 0, 1, 9, 0.0F, false));

        this.tailbasefeathers = new AdvancedModelRenderer(this);
        this.tailbasefeathers.setRotationPoint(0.0F, 3.2F, -0.3F);
        this.tailbase.addChild(tailbasefeathers);
        this.setRotateAngle(tailbasefeathers, 0.1698F, 0.0F, 0.0F);
        this.tailbasefeathers.cubeList.add(new ModelBox(tailbasefeathers, 51, 25, -1.0F, 0.0F, 0.0F, 2, 2, 8, 0.0F, false));

        this.leftthigh = new AdvancedModelRenderer(this);
        this.leftthigh.setRotationPoint(2.5F, 0.8F, 0.5F);
        this.hips.addChild(leftthigh);
        this.setRotateAngle(leftthigh, -0.1485F, 0.0F, 0.0F);
        this.leftthigh.cubeList.add(new ModelBox(leftthigh, 0, 31, -1.5F, -1.5F, -1.5F, 3, 7, 4, 0.0F, false));

        this.leftshin = new AdvancedModelRenderer(this);
        this.leftshin.setRotationPoint(0.3F, 5.1F, -0.5F);
        this.leftthigh.addChild(leftshin);
        this.setRotateAngle(leftshin, 0.8915F, 0.0F, 0.0F);
        this.leftshin.cubeList.add(new ModelBox(leftshin, 0, 20, -1.0F, -0.5F, -0.5F, 2, 7, 3, 0.0F, false));

        this.leftankle = new AdvancedModelRenderer(this);
        this.leftankle.setRotationPoint(-0.01F, 6.2F, 1.6F);
        this.leftshin.addChild(leftankle);
        this.setRotateAngle(leftankle, -0.8067F, 0.0F, 0.0F);
        this.leftankle.cubeList.add(new ModelBox(leftankle, 45, 54, -1.0F, 0.0F, -1.75F, 2, 3, 2, 0.0F, false));

        this.leftfoot = new AdvancedModelRenderer(this);
        this.leftfoot.setRotationPoint(0.0F, 2.8F, -0.6F);
        this.leftankle.addChild(leftfoot);
        this.setRotateAngle(leftfoot, 0.3183F, 0.0F, 0.0F);
        this.leftfoot.cubeList.add(new ModelBox(leftfoot, 59, 68, -1.5F, -0.2F, -1.5F, 3, 1, 2, 0.0F, false));

        this.lefttoes = new AdvancedModelRenderer(this);
        this.lefttoes.setRotationPoint(0.01F, 0.31F, -1.25F);
        this.leftfoot.addChild(lefttoes);
        this.lefttoes.cubeList.add(new ModelBox(lefttoes, 23, 68, -1.5F, -0.5F, -3.0F, 3, 1, 3, 0.0F, false));

        this.leftthighfeathers = new AdvancedModelRenderer(this);
        this.leftthighfeathers.setRotationPoint(0.5F, 2.0F, 2.2F);
        this.leftthigh.addChild(leftthighfeathers);
        this.setRotateAngle(leftthighfeathers, -0.1274F, 0.0213F, -0.0637F);
        this.leftthighfeathers.cubeList.add(new ModelBox(leftthighfeathers, 42, 16, -0.5F, -4.0F, -1.0F, 1, 8, 2, 0.0F, false));

        this.rightthigh = new AdvancedModelRenderer(this);
        this.rightthigh.setRotationPoint(-2.5F, 0.8F, 0.5F);
        this.hips.addChild(rightthigh);
        this.setRotateAngle(rightthigh, -0.1485F, 0.0F, 0.0F);
        this.rightthigh.cubeList.add(new ModelBox(rightthigh, 21, 43, -1.5F, -1.5F, -1.5F, 3, 7, 4, 0.0F, false));

        this.rightshin = new AdvancedModelRenderer(this);
        this.rightshin.setRotationPoint(-0.3F, 5.1F, -0.5F);
        this.rightthigh.addChild(rightshin);
        this.setRotateAngle(rightshin, 0.8915F, 0.0F, 0.0F);
        this.rightshin.cubeList.add(new ModelBox(rightshin, 11, 24, -1.0F, -0.5F, -0.5F, 2, 7, 3, 0.0F, false));

        this.rightankle = new AdvancedModelRenderer(this);
        this.rightankle.setRotationPoint(0.01F, 6.2F, 1.6F);
        this.rightshin.addChild(rightankle);
        this.setRotateAngle(rightankle, -0.8067F, 0.0F, 0.0F);
        this.rightankle.cubeList.add(new ModelBox(rightankle, 36, 54, -1.0F, 0.0F, -1.75F, 2, 3, 2, 0.0F, false));

        this.rightfoot = new AdvancedModelRenderer(this);
        this.rightfoot.setRotationPoint(0.0F, 2.8F, -0.6F);
        this.rightankle.addChild(rightfoot);
        this.setRotateAngle(rightfoot, 0.3183F, 0.0F, 0.0F);
        this.rightfoot.cubeList.add(new ModelBox(rightfoot, 59, 72, -1.5F, -0.2F, -1.5F, 3, 1, 2, 0.0F, false));

        this.righttoes = new AdvancedModelRenderer(this);
        this.righttoes.setRotationPoint(-0.01F, 0.31F, -1.25F);
        this.rightfoot.addChild(righttoes);
        this.righttoes.cubeList.add(new ModelBox(righttoes, 17, 73, -1.5F, -0.5F, -3.0F, 3, 1, 3, 0.0F, false));

        this.rightthighfeathers = new AdvancedModelRenderer(this);
        this.rightthighfeathers.setRotationPoint(-0.5F, 2.0F, 2.2F);
        this.rightthigh.addChild(rightthighfeathers);
        this.setRotateAngle(rightthighfeathers, -0.1274F, -0.0213F, 0.0637F);
        this.rightthighfeathers.cubeList.add(new ModelBox(rightthighfeathers, 35, 16, -0.5F, -4.0F, -1.0F, 1, 8, 2, 0.0F, false));

        this.hipfeathers = new AdvancedModelRenderer(this);
        this.hipfeathers.setRotationPoint(-0.01F, -2.6F, -2.0F);
        this.hips.addChild(hipfeathers);
        this.setRotateAngle(hipfeathers, 0.1061F, 0.0F, 0.0F);
        this.hipfeathers.cubeList.add(new ModelBox(hipfeathers, 82, 49, -3.0F, 0.0F, 0.0F, 6, 4, 3, 0.0F, false));

        updateDefaultPose();
        animator = ModelAnimator.create();
    }

    @Override
    public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        animate((IAnimatedEntity) entity, f, f1, f2, f3, f4, f5);
        this.root.render(f5);
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
        this.root.offsetY = 0.7F;
        this.root.offsetX = 0.0F;
        this.root.rotateAngleY = (float)Math.toRadians(225);
        this.root.rotateAngleX = (float)Math.toRadians(-2);
        this.root.rotateAngleZ = (float)Math.toRadians(3);
        this.root.scaleChildren = true;
        float scaler = 0.4F;
        this.root.setScale(scaler, scaler, scaler);
        //Start of pose:
        
        //End of pose, now render the model:
        this.root.render(f);
        //Reset rotations, positions and sizing:
        this.root.setScale(1.0F, 1.0F, 1.0F);
        this.root.scaleChildren = false;
        resetToDefaultPose();
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

        EntityPrehistoricFloraFalcarius entityFalcarius = (EntityPrehistoricFloraFalcarius) e;

        this.faceTarget(f3, f4, 12, neckbase);
        this.faceTarget(f3, f4, 12, neckmiddlebase);
        this.faceTarget(f3, f4, 12, neckmiddlefront);
        this.faceTarget(f3, f4, 12, neckfront);
        this.faceTarget(f3, f4, 12, head);

        AdvancedModelRenderer[] Tail = {this.tailbase, this.tailmiddlebase, this.tailmiddleend, this.tailend};
        AdvancedModelRenderer[] Neck = {this.neckbase, this.neckmiddlebase, this.neckmiddlefront, this.neckfront, this.head};
        AdvancedModelRenderer[] ArmL = {this.leftupperarm, this.leftlowerarm, this.lefthand};
        AdvancedModelRenderer[] ArmR = {this.rightupperarm, this.rightlowerarm, this.righthand};

        entityFalcarius.tailBuffer.applyChainSwingBuffer(Tail);

        if (entityFalcarius.getAnimation() == entityFalcarius.LAY_ANIMATION) {
            this.chainSwing(Neck, 0.5F, 0.10F, 0.5, f2, 0.8F);
            this.chainWave(Neck, 0.5F * 2, -0.02F, 0.5F, f2, 0.8F);
        }
        else {
            if (!entityFalcarius.isReallyInWater()) {

                if (f3 == 0.0F || !entityFalcarius.getIsMoving()) {
                    if (entityFalcarius.getAnimation() != entityFalcarius.EAT_ANIMATION
                        && entityFalcarius.getAnimation() != entityFalcarius.DRINK_ANIMATION) {
                        this.chainWaveExtended(ArmL, 0.175F, 0.03F, 0.1F, 3F, f2, 1F);
                        this.chainWaveExtended(ArmR, 0.175F, -0.03F, -0.1F, 0f, f2, 1F);
                        this.chainFlapExtended(ArmL, 0.175F, -0.03F, 0.1F, 3F, f2, 1F);
                        this.chainFlapExtended(ArmR, 0.175F, -0.03F, -0.1F, 0f, f2, 1F);
                        this.chainSwing(Neck, 0.05F, 0.10F, 0.5, f2, 0.8F);
                        this.chainWave(Neck, 0.05F * 2, -0.02F, 0.5F, f2, 0.8F);
                    }

                    this.chainWave(Tail, (0.15F * 0.35F), 0.125F * 0.15F, 0.2F, f2, 1F);
                    this.chainSwing(Tail, (0.15F * 0.35F) * 4F, 0.05F * 0.35F, 0.12F, f2, 1F);


                    return;
                }

                if (entityFalcarius.getIsFast()) { //Running


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
        EntityPrehistoricFloraFalcarius ee = (EntityPrehistoricFloraFalcarius) entitylivingbaseIn;

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
        else if (ee.getAnimation() == ee.ROAR_ANIMATION) { //The warn anim
            animRoar(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime, ee.getAnimationTick());
        }
        else if (ee.getAnimation() == ee.GRAZE_ANIMATION) { //
            animGraze(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime, ee.getAnimationTick());
        }
        else if (ee.getAnimation() == ee.NOISE_ANIMATION) { //The noise anim
            animNoise(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime, ee.getAnimationTick());
        }

    }

    public void animNoise(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime, double animTick) {
        EntityPrehistoricFloraFalcarius entity = (EntityPrehistoricFloraFalcarius) entitylivingbaseIn;
        int animCycle = 25;
        double tickAnim = animTick + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;
         if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 0) / 10) * (9-(0)));
            yy = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 25) {
            xx = 9 + (((tickAnim - 10) / 15) * (0-(9)));
            yy = 0 + (((tickAnim - 10) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 15) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(bodymiddle, bodymiddle.rotateAngleX + (float) Math.toRadians(xx), bodymiddle.rotateAngleY + (float) Math.toRadians(yy), bodymiddle.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 0) / 10) * (-8.25-(0)));
            yy = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 25) {
            xx = -8.25 + (((tickAnim - 10) / 15) * (0-(-8.25)));
            yy = 0 + (((tickAnim - 10) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 15) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(bodyfront, bodyfront.rotateAngleX + (float) Math.toRadians(xx), bodyfront.rotateAngleY + (float) Math.toRadians(yy), bodyfront.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 0) / 10) * (-3.25-(0)));
            yy = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 25) {
            xx = -3.25 + (((tickAnim - 10) / 15) * (0-(-3.25)));
            yy = 0 + (((tickAnim - 10) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 15) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neckbase, neckbase.rotateAngleX + (float) Math.toRadians(xx), neckbase.rotateAngleY + (float) Math.toRadians(yy), neckbase.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 0) / 10) * (-12.25-(0)));
            yy = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 18) {
            xx = -12.25 + (((tickAnim - 10) / 8) * (3.55-(-12.25)));
            yy = 0 + (((tickAnim - 10) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 8) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 25) {
            xx = 3.55 + (((tickAnim - 18) / 7) * (0-(3.55)));
            yy = 0 + (((tickAnim - 18) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 18) / 7) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neckmiddlebase, neckmiddlebase.rotateAngleX + (float) Math.toRadians(xx), neckmiddlebase.rotateAngleY + (float) Math.toRadians(yy), neckmiddlebase.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 0) / 10) * (4.25-(0)));
            yy = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 18) {
            xx = 4.25 + (((tickAnim - 10) / 8) * (-9.44-(4.25)));
            yy = 0 + (((tickAnim - 10) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 8) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 25) {
            xx = -9.44 + (((tickAnim - 18) / 7) * (0-(-9.44)));
            yy = 0 + (((tickAnim - 18) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 18) / 7) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neckmiddlefront, neckmiddlefront.rotateAngleX + (float) Math.toRadians(xx), neckmiddlefront.rotateAngleY + (float) Math.toRadians(yy), neckmiddlefront.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 0) / 10) * (21-(0)));
            yy = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 18) {
            xx = 21 + (((tickAnim - 10) / 8) * (18.2-(21)));
            yy = 0 + (((tickAnim - 10) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 8) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 25) {
            xx = 18.2 + (((tickAnim - 18) / 7) * (0-(18.2)));
            yy = 0 + (((tickAnim - 18) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 18) / 7) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neckfront, neckfront.rotateAngleX + (float) Math.toRadians(xx), neckfront.rotateAngleY + (float) Math.toRadians(yy), neckfront.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 18) {
            xx = 0 + (((tickAnim - 0) / 18) * (-17.5-(0)));
            yy = 0 + (((tickAnim - 0) / 18) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 18) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 25) {
            xx = -17.5 + (((tickAnim - 18) / 7) * (0-(-17.5)));
            yy = 0 + (((tickAnim - 18) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 18) / 7) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(head, head.rotateAngleX + (float) Math.toRadians(xx), head.rotateAngleY + (float) Math.toRadians(yy), head.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 0) / 10) * (19-(0)));
            yy = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 25) {
            xx = 19 + (((tickAnim - 10) / 15) * (0-(19)));
            yy = 0 + (((tickAnim - 10) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 15) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(lowerjawbase, lowerjawbase.rotateAngleX + (float) Math.toRadians(xx), lowerjawbase.rotateAngleY + (float) Math.toRadians(yy), lowerjawbase.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 12) {
            xx = 0 + (((tickAnim - 0) / 12) * (1.5-(0)));
            yy = 0 + (((tickAnim - 0) / 12) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 12) * (0-(0)));
        }
        else if (tickAnim >= 12 && tickAnim < 25) {
            xx = 1.5 + (((tickAnim - 12) / 13) * (0-(1.5)));
            yy = 0 + (((tickAnim - 12) / 13) * (0-(0)));
            zz = 0 + (((tickAnim - 12) / 13) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftupperarm, leftupperarm.rotateAngleX + (float) Math.toRadians(xx), leftupperarm.rotateAngleY + (float) Math.toRadians(yy), leftupperarm.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 12) {
            xx = 0 + (((tickAnim - 0) / 12) * (-6.25-(0)));
            yy = 0 + (((tickAnim - 0) / 12) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 12) * (0-(0)));
        }
        else if (tickAnim >= 12 && tickAnim < 25) {
            xx = -6.25 + (((tickAnim - 12) / 13) * (0-(-6.25)));
            yy = 0 + (((tickAnim - 12) / 13) * (0-(0)));
            zz = 0 + (((tickAnim - 12) / 13) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftlowerarm, leftlowerarm.rotateAngleX + (float) Math.toRadians(xx), leftlowerarm.rotateAngleY + (float) Math.toRadians(yy), leftlowerarm.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 25) {
            xx = 0 + (((tickAnim - 0) / 25) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 25) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 25) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(lefthand, lefthand.rotateAngleX + (float) Math.toRadians(xx), lefthand.rotateAngleY + (float) Math.toRadians(yy), lefthand.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 12) {
            xx = 0 + (((tickAnim - 0) / 12) * (1.5-(0)));
            yy = 0 + (((tickAnim - 0) / 12) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 12) * (0-(0)));
        }
        else if (tickAnim >= 12 && tickAnim < 25) {
            xx = 1.5 + (((tickAnim - 12) / 13) * (0-(1.5)));
            yy = 0 + (((tickAnim - 12) / 13) * (0-(0)));
            zz = 0 + (((tickAnim - 12) / 13) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightupperarm, rightupperarm.rotateAngleX + (float) Math.toRadians(xx), rightupperarm.rotateAngleY + (float) Math.toRadians(yy), rightupperarm.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 12) {
            xx = 0 + (((tickAnim - 0) / 12) * (-6.25-(0)));
            yy = 0 + (((tickAnim - 0) / 12) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 12) * (0-(0)));
        }
        else if (tickAnim >= 12 && tickAnim < 25) {
            xx = -6.25 + (((tickAnim - 12) / 13) * (0-(-6.25)));
            yy = 0 + (((tickAnim - 12) / 13) * (0-(0)));
            zz = 0 + (((tickAnim - 12) / 13) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightlowerarm, rightlowerarm.rotateAngleX + (float) Math.toRadians(xx), rightlowerarm.rotateAngleY + (float) Math.toRadians(yy), rightlowerarm.rotateAngleZ + (float) Math.toRadians(zz));
       
    }
    public void animNest(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime, double animTick) {
        EntityPrehistoricFloraFalcarius entity = (EntityPrehistoricFloraFalcarius) entitylivingbaseIn;
        int animCycle = 50;
        double tickAnim = animTick + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;
         if (tickAnim >= 0 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 0) / 15) * (17.25-(0)));
            yy = 0 + (((tickAnim - 0) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 15) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 30) {
            xx = 17.25 + (((tickAnim - 15) / 15) * (20-(17.25)));
            yy = 0 + (((tickAnim - 15) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 15) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 50) {
            xx = 20 + (((tickAnim - 30) / 20) * (0-(20)));
            yy = 0 + (((tickAnim - 30) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 30) / 20) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(bodymiddle, bodymiddle.rotateAngleX + (float) Math.toRadians(xx), bodymiddle.rotateAngleY + (float) Math.toRadians(yy), bodymiddle.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 0) / 15) * (17-(0)));
            yy = 0 + (((tickAnim - 0) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 15) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 30) {
            xx = 17 + (((tickAnim - 15) / 15) * (20.75-(17)));
            yy = 0 + (((tickAnim - 15) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 15) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 50) {
            xx = 20.75 + (((tickAnim - 30) / 20) * (0-(20.75)));
            yy = 0 + (((tickAnim - 30) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 30) / 20) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(bodyfront, bodyfront.rotateAngleX + (float) Math.toRadians(xx), bodyfront.rotateAngleY + (float) Math.toRadians(yy), bodyfront.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 0) / 15) * (21.75-(0)));
            yy = 0 + (((tickAnim - 0) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 15) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 30) {
            xx = 21.75 + (((tickAnim - 15) / 15) * (10.75-(21.75)));
            yy = 0 + (((tickAnim - 15) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 15) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 50) {
            xx = 10.75 + (((tickAnim - 30) / 20) * (0-(10.75)));
            yy = 0 + (((tickAnim - 30) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 30) / 20) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neckbase, neckbase.rotateAngleX + (float) Math.toRadians(xx), neckbase.rotateAngleY + (float) Math.toRadians(yy), neckbase.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 0) / 15) * (-15.32917-(0)));
            yy = 0 + (((tickAnim - 0) / 15) * (-15.81569-(0)));
            zz = 0 + (((tickAnim - 0) / 15) * (18.36749-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 30) {
            xx = -15.32917 + (((tickAnim - 15) / 15) * (-15.32917-(-15.32917)));
            yy = -15.81569 + (((tickAnim - 15) / 15) * (-15.81569-(-15.81569)));
            zz = 18.36749 + (((tickAnim - 15) / 15) * (18.36749-(18.36749)));
        }
        else if (tickAnim >= 30 && tickAnim < 50) {
            xx = -15.32917 + (((tickAnim - 30) / 20) * (0-(-15.32917)));
            yy = -15.81569 + (((tickAnim - 30) / 20) * (0-(-15.81569)));
            zz = 18.36749 + (((tickAnim - 30) / 20) * (0-(18.36749)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neckmiddlebase, neckmiddlebase.rotateAngleX + (float) Math.toRadians(xx), neckmiddlebase.rotateAngleY + (float) Math.toRadians(yy), neckmiddlebase.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 0) / 15) * (23.15716-(0)));
            yy = 0 + (((tickAnim - 0) / 15) * (-19.18394-(0)));
            zz = 0 + (((tickAnim - 0) / 15) * (-16.7339-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 30) {
            xx = 23.15716 + (((tickAnim - 15) / 15) * (23.15716-(23.15716)));
            yy = -19.18394 + (((tickAnim - 15) / 15) * (-19.18394-(-19.18394)));
            zz = -16.7339 + (((tickAnim - 15) / 15) * (-16.7339-(-16.7339)));
        }
        else if (tickAnim >= 30 && tickAnim < 50) {
            xx = 23.15716 + (((tickAnim - 30) / 20) * (0-(23.15716)));
            yy = -19.18394 + (((tickAnim - 30) / 20) * (0-(-19.18394)));
            zz = -16.7339 + (((tickAnim - 30) / 20) * (0-(-16.7339)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neckmiddlefront, neckmiddlefront.rotateAngleX + (float) Math.toRadians(xx), neckmiddlefront.rotateAngleY + (float) Math.toRadians(yy), neckmiddlefront.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 0) / 15) * (7.00001-(0)));
            yy = 0 + (((tickAnim - 0) / 15) * (-19.03738-(0)));
            zz = 0 + (((tickAnim - 0) / 15) * (-2.70446-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 30) {
            xx = 7.00001 + (((tickAnim - 15) / 15) * (7.00001-(7.00001)));
            yy = -19.03738 + (((tickAnim - 15) / 15) * (-19.03738-(-19.03738)));
            zz = -2.70446 + (((tickAnim - 15) / 15) * (-2.70446-(-2.70446)));
        }
        else if (tickAnim >= 30 && tickAnim < 50) {
            xx = 7.00001 + (((tickAnim - 30) / 20) * (0-(7.00001)));
            yy = -19.03738 + (((tickAnim - 30) / 20) * (0-(-19.03738)));
            zz = -2.70446 + (((tickAnim - 30) / 20) * (0-(-2.70446)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neckfront, neckfront.rotateAngleX + (float) Math.toRadians(xx), neckfront.rotateAngleY + (float) Math.toRadians(yy), neckfront.rotateAngleZ + (float) Math.toRadians(zz));



        this.setRotateAngle(head, head.rotateAngleX + (float) Math.toRadians(0), head.rotateAngleY + (float) Math.toRadians(0), head.rotateAngleZ + (float) Math.toRadians(0));



        if (tickAnim >= 0 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 0) / 15) * (-73.77441-(0)));
            yy = 0 + (((tickAnim - 0) / 15) * (-0.2459-(0)));
            zz = 0 + (((tickAnim - 0) / 15) * (-12.98314-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 30) {
            xx = -73.77441 + (((tickAnim - 15) / 15) * (-34.49583-(-73.77441)));
            yy = -0.2459 + (((tickAnim - 15) / 15) * (-6.31502-(-0.2459)));
            zz = -12.98314 + (((tickAnim - 15) / 15) * (13.36993-(-12.98314)));
        }
        else if (tickAnim >= 30 && tickAnim < 50) {
            xx = -34.49583 + (((tickAnim - 30) / 20) * (0-(-34.49583)));
            yy = -6.31502 + (((tickAnim - 30) / 20) * (0-(-6.31502)));
            zz = 13.36993 + (((tickAnim - 30) / 20) * (0-(13.36993)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftupperarm, leftupperarm.rotateAngleX + (float) Math.toRadians(xx), leftupperarm.rotateAngleY + (float) Math.toRadians(yy), leftupperarm.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 0) / 15) * (-0.98054-(0)));
            yy = 0 + (((tickAnim - 0) / 15) * (-7.4092-(0)));
            zz = 0 + (((tickAnim - 0) / 15) * (-5.54637-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 30) {
            xx = -0.98054 + (((tickAnim - 15) / 15) * (-0.06489-(-0.98054)));
            yy = -7.4092 + (((tickAnim - 15) / 15) * (11.28802-(-7.4092)));
            zz = -5.54637 + (((tickAnim - 15) / 15) * (-10.4704-(-5.54637)));
        }
        else if (tickAnim >= 30 && tickAnim < 50) {
            xx = -0.06489 + (((tickAnim - 30) / 20) * (0-(-0.06489)));
            yy = 11.28802 + (((tickAnim - 30) / 20) * (0-(11.28802)));
            zz = -10.4704 + (((tickAnim - 30) / 20) * (0-(-10.4704)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftlowerarm, leftlowerarm.rotateAngleX + (float) Math.toRadians(xx), leftlowerarm.rotateAngleY + (float) Math.toRadians(yy), leftlowerarm.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 0) / 15) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 15) * (-23.25-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 30) {
            xx = 0 + (((tickAnim - 15) / 15) * (0-(0)));
            yy = 0 + (((tickAnim - 15) / 15) * (0-(0)));
            zz = -23.25 + (((tickAnim - 15) / 15) * (0.5-(-23.25)));
        }
        else if (tickAnim >= 30 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 30) / 20) * (0-(0)));
            yy = 0 + (((tickAnim - 30) / 20) * (0-(0)));
            zz = 0.5 + (((tickAnim - 30) / 20) * (0-(0.5)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(lefthand, lefthand.rotateAngleX + (float) Math.toRadians(xx), lefthand.rotateAngleY + (float) Math.toRadians(yy), lefthand.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 0) / 15) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 15) * (-13.5-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 30) {
            xx = 0 + (((tickAnim - 15) / 15) * (0-(0)));
            yy = 0 + (((tickAnim - 15) / 15) * (0-(0)));
            zz = -13.5 + (((tickAnim - 15) / 15) * (13.25-(-13.5)));
        }
        else if (tickAnim >= 30 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 30) / 20) * (0-(0)));
            yy = 0 + (((tickAnim - 30) / 20) * (0-(0)));
            zz = 13.25 + (((tickAnim - 30) / 20) * (0-(13.25)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftfrontfinger, leftfrontfinger.rotateAngleX + (float) Math.toRadians(xx), leftfrontfinger.rotateAngleY + (float) Math.toRadians(yy), leftfrontfinger.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 0) / 15) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 15) * (-16.75-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 30) {
            xx = 0 + (((tickAnim - 15) / 15) * (0-(0)));
            yy = 0 + (((tickAnim - 15) / 15) * (0-(0)));
            zz = -16.75 + (((tickAnim - 15) / 15) * (13.25-(-16.75)));
        }
        else if (tickAnim >= 30 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 30) / 20) * (0-(0)));
            yy = 0 + (((tickAnim - 30) / 20) * (0-(0)));
            zz = 13.25 + (((tickAnim - 30) / 20) * (0-(13.25)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftmiddlefinger, leftmiddlefinger.rotateAngleX + (float) Math.toRadians(xx), leftmiddlefinger.rotateAngleY + (float) Math.toRadians(yy), leftmiddlefinger.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 0) / 15) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 15) * (-13.75-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 30) {
            xx = 0 + (((tickAnim - 15) / 15) * (0-(0)));
            yy = 0 + (((tickAnim - 15) / 15) * (0-(0)));
            zz = -13.75 + (((tickAnim - 15) / 15) * (9.25-(-13.75)));
        }
        else if (tickAnim >= 30 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 30) / 20) * (0-(0)));
            yy = 0 + (((tickAnim - 30) / 20) * (0-(0)));
            zz = 9.25 + (((tickAnim - 30) / 20) * (0-(9.25)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftlittlefinger, leftlittlefinger.rotateAngleX + (float) Math.toRadians(xx), leftlittlefinger.rotateAngleY + (float) Math.toRadians(yy), leftlittlefinger.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 0) / 15) * (-70.74976-(0)));
            yy = 0 + (((tickAnim - 0) / 15) * (0.28611-(0)));
            zz = 0 + (((tickAnim - 0) / 15) * (22.8582-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 30) {
            xx = -70.74976 + (((tickAnim - 15) / 15) * (-34.49583-(-70.74976)));
            yy = 0.28611 + (((tickAnim - 15) / 15) * (6.315-(0.28611)));
            zz = 22.8582 + (((tickAnim - 15) / 15) * (-13.3699-(22.8582)));
        }
        else if (tickAnim >= 30 && tickAnim < 50) {
            xx = -34.49583 + (((tickAnim - 30) / 20) * (0-(-34.49583)));
            yy = 6.315 + (((tickAnim - 30) / 20) * (0-(6.315)));
            zz = -13.3699 + (((tickAnim - 30) / 20) * (0-(-13.3699)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightupperarm, rightupperarm.rotateAngleX + (float) Math.toRadians(xx), rightupperarm.rotateAngleY + (float) Math.toRadians(yy), rightupperarm.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 0) / 15) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 15) * (3.5-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 30) {
            xx = 0 + (((tickAnim - 15) / 15) * (-1.80027-(0)));
            yy = 0 + (((tickAnim - 15) / 15) * (-0.25306-(0)));
            zz = 3.5 + (((tickAnim - 15) / 15) * (18.8673-(3.5)));
        }
        else if (tickAnim >= 30 && tickAnim < 50) {
            xx = -1.80027 + (((tickAnim - 30) / 20) * (0-(-1.80027)));
            yy = -0.25306 + (((tickAnim - 30) / 20) * (0-(-0.25306)));
            zz = 18.8673 + (((tickAnim - 30) / 20) * (0-(18.8673)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightlowerarm, rightlowerarm.rotateAngleX + (float) Math.toRadians(xx), rightlowerarm.rotateAngleY + (float) Math.toRadians(yy), rightlowerarm.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 0) / 15) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 15) * (9.75-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 30) {
            xx = 0 + (((tickAnim - 15) / 15) * (0-(0)));
            yy = 0 + (((tickAnim - 15) / 15) * (0-(0)));
            zz = 9.75 + (((tickAnim - 15) / 15) * (3.25-(9.75)));
        }
        else if (tickAnim >= 30 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 30) / 20) * (0-(0)));
            yy = 0 + (((tickAnim - 30) / 20) * (0-(0)));
            zz = 3.25 + (((tickAnim - 30) / 20) * (0-(3.25)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(righthand, righthand.rotateAngleX + (float) Math.toRadians(xx), righthand.rotateAngleY + (float) Math.toRadians(yy), righthand.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 0) / 15) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 15) * (11.25-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 30) {
            xx = 0 + (((tickAnim - 15) / 15) * (0-(0)));
            yy = 0 + (((tickAnim - 15) / 15) * (0-(0)));
            zz = 11.25 + (((tickAnim - 15) / 15) * (-3.5-(11.25)));
        }
        else if (tickAnim >= 30 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 30) / 20) * (0-(0)));
            yy = 0 + (((tickAnim - 30) / 20) * (0-(0)));
            zz = -3.5 + (((tickAnim - 30) / 20) * (0-(-3.5)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightfrontfinger, rightfrontfinger.rotateAngleX + (float) Math.toRadians(xx), rightfrontfinger.rotateAngleY + (float) Math.toRadians(yy), rightfrontfinger.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 0) / 15) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 15) * (17.5-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 30) {
            xx = 0 + (((tickAnim - 15) / 15) * (0-(0)));
            yy = 0 + (((tickAnim - 15) / 15) * (0-(0)));
            zz = 17.5 + (((tickAnim - 15) / 15) * (-8.5-(17.5)));
        }
        else if (tickAnim >= 30 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 30) / 20) * (0-(0)));
            yy = 0 + (((tickAnim - 30) / 20) * (0-(0)));
            zz = -8.5 + (((tickAnim - 30) / 20) * (0-(-8.5)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightmiddlefinger, rightmiddlefinger.rotateAngleX + (float) Math.toRadians(xx), rightmiddlefinger.rotateAngleY + (float) Math.toRadians(yy), rightmiddlefinger.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 0) / 15) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 15) * (25.75-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 30) {
            xx = 0 + (((tickAnim - 15) / 15) * (0-(0)));
            yy = 0 + (((tickAnim - 15) / 15) * (0-(0)));
            zz = 25.75 + (((tickAnim - 15) / 15) * (-4.25-(25.75)));
        }
        else if (tickAnim >= 30 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 30) / 20) * (0-(0)));
            yy = 0 + (((tickAnim - 30) / 20) * (0-(0)));
            zz = -4.25 + (((tickAnim - 30) / 20) * (0-(-4.25)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightlittlefinger, rightlittlefinger.rotateAngleX + (float) Math.toRadians(xx), rightlittlefinger.rotateAngleY + (float) Math.toRadians(yy), rightlittlefinger.rotateAngleZ + (float) Math.toRadians(zz));
       
    }
    public void animRoar(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime, double animTick) {
        EntityPrehistoricFloraFalcarius entity = (EntityPrehistoricFloraFalcarius) entitylivingbaseIn;
        int animCycle = 60;
        double tickAnim = animTick + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;
         if (tickAnim >= 0 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 0) / 8) * (-6.66003-(0)));
            yy = 0 + (((tickAnim - 0) / 8) * (-0.54377-(0)));
            zz = 0 + (((tickAnim - 0) / 8) * (-1.39799-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 13) {
            xx = -6.66003 + (((tickAnim - 8) / 5) * (-12-(-6.66003)));
            yy = -0.54377 + (((tickAnim - 8) / 5) * (0-(-0.54377)));
            zz = -1.39799 + (((tickAnim - 8) / 5) * (0-(-1.39799)));
        }
        else if (tickAnim >= 13 && tickAnim < 18) {
            xx = -12 + (((tickAnim - 13) / 5) * (-8.96327-(-12)));
            yy = 0 + (((tickAnim - 13) / 5) * (4.02648-(0)));
            zz = 0 + (((tickAnim - 13) / 5) * (0.30273-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 23) {
            xx = -8.96327 + (((tickAnim - 18) / 5) * (-6.86603-(-8.96327)));
            yy = 4.02648 + (((tickAnim - 18) / 5) * (5.81995-(4.02648)));
            zz = 0.30273 + (((tickAnim - 18) / 5) * (-2.28224-(0.30273)));
        }
        else if (tickAnim >= 23 && tickAnim < 43) {
            xx = -6.86603 + (((tickAnim - 23) / 20) * (-6.86603-(-6.86603)));
            yy = 5.81995 + (((tickAnim - 23) / 20) * (5.81995-(5.81995)));
            zz = -2.28224 + (((tickAnim - 23) / 20) * (-2.28224-(-2.28224)));
        }
        else if (tickAnim >= 43 && tickAnim < 60) {
            xx = -6.86603 + (((tickAnim - 43) / 17) * (0-(-6.86603)));
            yy = 5.81995 + (((tickAnim - 43) / 17) * (0-(5.81995)));
            zz = -2.28224 + (((tickAnim - 43) / 17) * (0-(-2.28224)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(hips, hips.rotateAngleX + (float) Math.toRadians(xx), hips.rotateAngleY + (float) Math.toRadians(yy), hips.rotateAngleZ + (float) Math.toRadians(zz));

        this.hips.rotationPointX = this.hips.rotationPointX + (float)(0);
        this.hips.rotationPointY = this.hips.rotationPointY - (float)(0);
        this.hips.rotationPointZ = this.hips.rotationPointZ + (float)(0);



        if (tickAnim >= 0 && tickAnim < 12) {
            xx = 0 + (((tickAnim - 0) / 12) * (-3.75-(0)));
            yy = 0 + (((tickAnim - 0) / 12) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 12) * (0-(0)));
        }
        else if (tickAnim >= 12 && tickAnim < 18) {
            xx = -3.75 + (((tickAnim - 12) / 6) * (-1.54729-(-3.75)));
            yy = 0 + (((tickAnim - 12) / 6) * (0.40159-(0)));
            zz = 0 + (((tickAnim - 12) / 6) * (-3.97982-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 23) {
            xx = -1.54729 + (((tickAnim - 18) / 5) * (0-(-1.54729)));
            yy = 0.40159 + (((tickAnim - 18) / 5) * (0-(0.40159)));
            zz = -3.97982 + (((tickAnim - 18) / 5) * (0-(-3.97982)));
        }
        else if (tickAnim >= 23 && tickAnim < 43) {
            xx = 0 + (((tickAnim - 23) / 20) * (5.75-(0)));
            yy = 0 + (((tickAnim - 23) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 23) / 20) * (0-(0)));
        }
        else if (tickAnim >= 43 && tickAnim < 60) {
            xx = 5.75 + (((tickAnim - 43) / 17) * (0-(5.75)));
            yy = 0 + (((tickAnim - 43) / 17) * (0-(0)));
            zz = 0 + (((tickAnim - 43) / 17) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(bodyfront, bodyfront.rotateAngleX + (float) Math.toRadians(xx), bodyfront.rotateAngleY + (float) Math.toRadians(yy), bodyfront.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 12) {
            xx = 0 + (((tickAnim - 0) / 12) * (3.35+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120))*-5-(0)));
            yy = 0 + (((tickAnim - 0) / 12) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 12) * (0-(0)));
        }
        else if (tickAnim >= 12 && tickAnim < 18) {
            xx = 3.35+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120))*-5 + (((tickAnim - 12) / 6) * (44.6225-Math.sin((Math.PI/180)*(((double)tickAnim/20)*100-20))*25-(3.35+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120))*-5)));
            yy = 0 + (((tickAnim - 12) / 6) * (-1.65894-(0)));
            zz = 0 + (((tickAnim - 12) / 6) * (-2.50098-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 23) {
            xx = 44.6225-Math.sin((Math.PI/180)*(((double)tickAnim/20)*100-20))*25 + (((tickAnim - 18) / 5) * (0.1+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120))*5-(44.6225-Math.sin((Math.PI/180)*(((double)tickAnim/20)*100-20))*25)));
            yy = -1.65894 + (((tickAnim - 18) / 5) * (0-(-1.65894)));
            zz = -2.50098 + (((tickAnim - 18) / 5) * (0-(-2.50098)));
        }
        else if (tickAnim >= 23 && tickAnim < 44) {
            xx = 0.1+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120))*5 + (((tickAnim - 23) / 21) * (0-(0.1+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120))*5)));
            yy = 0 + (((tickAnim - 23) / 21) * (0-(0)));
            zz = 0 + (((tickAnim - 23) / 21) * (0-(0)));
        }
        else if (tickAnim >= 44 && tickAnim < 60) {
            xx = 0 + (((tickAnim - 44) / 16) * (0-(0)));
            yy = 0 + (((tickAnim - 44) / 16) * (0-(0)));
            zz = 0 + (((tickAnim - 44) / 16) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neckbase, neckbase.rotateAngleX + (float) Math.toRadians(xx), neckbase.rotateAngleY + (float) Math.toRadians(yy), neckbase.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 12) {
            xx = 0 + (((tickAnim - 0) / 12) * (-7.25-(0)));
            yy = 0 + (((tickAnim - 0) / 12) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 12) * (0-(0)));
        }
        else if (tickAnim >= 12 && tickAnim < 18) {
            xx = -7.25 + (((tickAnim - 12) / 6) * (24.13614-(-7.25)));
            yy = 0 + (((tickAnim - 12) / 6) * (-0.57472-(0)));
            zz = 0 + (((tickAnim - 12) / 6) * (-1.11012-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 23) {
            xx = 24.13614 + (((tickAnim - 18) / 5) * (-1.6027+Math.sin((Math.PI/180)*(((double)tickAnim/20)*90))*-5-(24.13614)));
            yy = -0.57472 + (((tickAnim - 18) / 5) * (-1.14944-(-0.57472)));
            zz = -1.11012 + (((tickAnim - 18) / 5) * (-2.22024-(-1.11012)));
        }
        else if (tickAnim >= 23 && tickAnim < 43) {
            xx = -1.6027+Math.sin((Math.PI/180)*(((double)tickAnim/20)*90))*-5 + (((tickAnim - 23) / 20) * (-9.3527+Math.sin((Math.PI/180)*(((double)tickAnim/20)*90))*-5-(-1.6027+Math.sin((Math.PI/180)*(((double)tickAnim/20)*90))*-5)));
            yy = -1.14944 + (((tickAnim - 23) / 20) * (-1.14944-(-1.14944)));
            zz = -2.22024 + (((tickAnim - 23) / 20) * (-2.22024-(-2.22024)));
        }
        else if (tickAnim >= 43 && tickAnim < 60) {
            xx = -9.3527+Math.sin((Math.PI/180)*(((double)tickAnim/20)*90))*-5 + (((tickAnim - 43) / 17) * (0-(-9.3527+Math.sin((Math.PI/180)*(((double)tickAnim/20)*90))*-5)));
            yy = -1.14944 + (((tickAnim - 43) / 17) * (0-(-1.14944)));
            zz = -2.22024 + (((tickAnim - 43) / 17) * (0-(-2.22024)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neckmiddlebase, neckmiddlebase.rotateAngleX + (float) Math.toRadians(xx), neckmiddlebase.rotateAngleY + (float) Math.toRadians(yy), neckmiddlebase.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 12) {
            xx = 0 + (((tickAnim - 0) / 12) * (22-(0)));
            yy = 0 + (((tickAnim - 0) / 12) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 12) * (0-(0)));
        }
        else if (tickAnim >= 12 && tickAnim < 18) {
            xx = 22 + (((tickAnim - 12) / 6) * (7.5-(22)));
            yy = 0 + (((tickAnim - 12) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 12) / 6) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 23) {
            xx = 7.5 + (((tickAnim - 18) / 5) * (15.75-(7.5)));
            yy = 0 + (((tickAnim - 18) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 18) / 5) * (0-(0)));
        }
        else if (tickAnim >= 23 && tickAnim < 43) {
            xx = 15.75 + (((tickAnim - 23) / 20) * (8.75-(15.75)));
            yy = 0 + (((tickAnim - 23) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 23) / 20) * (0-(0)));
        }
        else if (tickAnim >= 43 && tickAnim < 60) {
            xx = 8.75 + (((tickAnim - 43) / 17) * (0-(8.75)));
            yy = 0 + (((tickAnim - 43) / 17) * (0-(0)));
            zz = 0 + (((tickAnim - 43) / 17) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neckmiddlefront, neckmiddlefront.rotateAngleX + (float) Math.toRadians(xx), neckmiddlefront.rotateAngleY + (float) Math.toRadians(yy), neckmiddlefront.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 12) {
            xx = 0 + (((tickAnim - 0) / 12) * (4.75-(0)));
            yy = 0 + (((tickAnim - 0) / 12) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 12) * (0-(0)));
        }
        else if (tickAnim >= 12 && tickAnim < 18) {
            xx = 4.75 + (((tickAnim - 12) / 6) * (-15.25-(4.75)));
            yy = 0 + (((tickAnim - 12) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 12) / 6) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 23) {
            xx = -15.25 + (((tickAnim - 18) / 5) * (12.75-(-15.25)));
            yy = 0 + (((tickAnim - 18) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 18) / 5) * (0-(0)));
        }
        else if (tickAnim >= 23 && tickAnim < 44) {
            xx = 12.75 + (((tickAnim - 23) / 21) * (24.75-(12.75)));
            yy = 0 + (((tickAnim - 23) / 21) * (0-(0)));
            zz = 0 + (((tickAnim - 23) / 21) * (0-(0)));
        }
        else if (tickAnim >= 44 && tickAnim < 60) {
            xx = 24.75 + (((tickAnim - 44) / 16) * (0-(24.75)));
            yy = 0 + (((tickAnim - 44) / 16) * (0-(0)));
            zz = 0 + (((tickAnim - 44) / 16) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neckfront, neckfront.rotateAngleX + (float) Math.toRadians(xx), neckfront.rotateAngleY + (float) Math.toRadians(yy), neckfront.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 0) / 13) * (-5-(0)));
            yy = 0 + (((tickAnim - 0) / 13) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 13) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 18) {
            xx = -5 + (((tickAnim - 13) / 5) * (-31.25-(-5)));
            yy = 0 + (((tickAnim - 13) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 13) / 5) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 23) {
            xx = -31.25 + (((tickAnim - 18) / 5) * (-24-(-31.25)));
            yy = 0 + (((tickAnim - 18) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 18) / 5) * (0-(0)));
        }
        else if (tickAnim >= 23 && tickAnim < 43) {
            xx = -24 + (((tickAnim - 23) / 20) * (-24-(-24)));
            yy = 0 + (((tickAnim - 23) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 23) / 20) * (0-(0)));
        }
        else if (tickAnim >= 43 && tickAnim < 60) {
            xx = -24 + (((tickAnim - 43) / 17) * (0-(-24)));
            yy = 0 + (((tickAnim - 43) / 17) * (0-(0)));
            zz = 0 + (((tickAnim - 43) / 17) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(head, head.rotateAngleX + (float) Math.toRadians(xx), head.rotateAngleY + (float) Math.toRadians(yy), head.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 0) / 13) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 13) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 13) * (-0.275-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 43) {
            xx = 0 + (((tickAnim - 13) / 30) * (0-(0)));
            yy = 0 + (((tickAnim - 13) / 30) * (0-(0)));
            zz = -0.275 + (((tickAnim - 13) / 30) * (-0.275-(-0.275)));
        }
        else if (tickAnim >= 43 && tickAnim < 60) {
            xx = 0 + (((tickAnim - 43) / 17) * (0-(0)));
            yy = 0 + (((tickAnim - 43) / 17) * (0-(0)));
            zz = -0.275 + (((tickAnim - 43) / 17) * (0-(-0.275)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.head.rotationPointX = this.head.rotationPointX + (float)(xx);
        this.head.rotationPointY = this.head.rotationPointY - (float)(yy);
        this.head.rotationPointZ = this.head.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 0) / 13) * (13.75-(0)));
            yy = 0 + (((tickAnim - 0) / 13) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 13) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 18) {
            xx = 13.75 + (((tickAnim - 13) / 5) * (0-(13.75)));
            yy = 0 + (((tickAnim - 13) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 13) / 5) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 43) {
            xx = 0 + (((tickAnim - 18) / 25) * (13.75-(0)));
            yy = 0 + (((tickAnim - 18) / 25) * (0-(0)));
            zz = 0 + (((tickAnim - 18) / 25) * (0-(0)));
        }
        else if (tickAnim >= 43 && tickAnim < 60) {
            xx = 13.75 + (((tickAnim - 43) / 17) * (0-(13.75)));
            yy = 0 + (((tickAnim - 43) / 17) * (0-(0)));
            zz = 0 + (((tickAnim - 43) / 17) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(lowerjawbase, lowerjawbase.rotateAngleX + (float) Math.toRadians(xx), lowerjawbase.rotateAngleY + (float) Math.toRadians(yy), lowerjawbase.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 0) / 13) * (-25.19025-(0)));
            yy = 0 + (((tickAnim - 0) / 13) * (-4.2634-(0)));
            zz = 0 + (((tickAnim - 0) / 13) * (-49.722-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 44) {
            xx = -25.19025 + (((tickAnim - 13) / 31) * (-26.03548-(-25.19025)));
            yy = -4.2634 + (((tickAnim - 13) / 31) * (-15.69518-(-4.2634)));
            zz = -49.722 + (((tickAnim - 13) / 31) * (-64.04592-(-49.722)));
        }
        else if (tickAnim >= 44 && tickAnim < 60) {
            xx = -26.03548 + (((tickAnim - 44) / 16) * (0-(-26.03548)));
            yy = -15.69518 + (((tickAnim - 44) / 16) * (0-(-15.69518)));
            zz = -64.04592 + (((tickAnim - 44) / 16) * (0-(-64.04592)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftupperarm, leftupperarm.rotateAngleX + (float) Math.toRadians(xx), leftupperarm.rotateAngleY + (float) Math.toRadians(yy), leftupperarm.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 0) / 13) * (-25.19025-(0)));
            yy = 0 + (((tickAnim - 0) / 13) * (4.26341-(0)));
            zz = 0 + (((tickAnim - 0) / 13) * (49.72196-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 43) {
            xx = -25.19025 + (((tickAnim - 13) / 30) * (-26.09594-(-25.19025)));
            yy = 4.26341 + (((tickAnim - 13) / 30) * (17.41004-(4.26341)));
            zz = 49.72196 + (((tickAnim - 13) / 30) * (66.28708-(49.72196)));
        }
        else if (tickAnim >= 43 && tickAnim < 60) {
            xx = -26.09594 + (((tickAnim - 43) / 17) * (0-(-26.09594)));
            yy = 17.41004 + (((tickAnim - 43) / 17) * (0-(17.41004)));
            zz = 66.28708 + (((tickAnim - 43) / 17) * (0-(66.28708)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightupperarm, rightupperarm.rotateAngleX + (float) Math.toRadians(xx), rightupperarm.rotateAngleY + (float) Math.toRadians(yy), rightupperarm.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 0) / 13) * (-2.71463-(0)));
            yy = 0 + (((tickAnim - 0) / 13) * (22.27857-(0)));
            zz = 0 + (((tickAnim - 0) / 13) * (-16.7866-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 43) {
            xx = -2.71463 + (((tickAnim - 13) / 30) * (-2.71463-(-2.71463)));
            yy = 22.27857 + (((tickAnim - 13) / 30) * (22.27857-(22.27857)));
            zz = -16.7866 + (((tickAnim - 13) / 30) * (-16.7866-(-16.7866)));
        }
        else if (tickAnim >= 43 && tickAnim < 60) {
            xx = -2.71463 + (((tickAnim - 43) / 17) * (0-(-2.71463)));
            yy = 22.27857 + (((tickAnim - 43) / 17) * (0-(22.27857)));
            zz = -16.7866 + (((tickAnim - 43) / 17) * (0-(-16.7866)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightlowerarm, rightlowerarm.rotateAngleX + (float) Math.toRadians(xx), rightlowerarm.rotateAngleY + (float) Math.toRadians(yy), rightlowerarm.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 0) / 13) * (-1.96998-(0)));
            yy = 0 + (((tickAnim - 0) / 13) * (-0.34511-(0)));
            zz = 0 + (((tickAnim - 0) / 13) * (-0.00568-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 18) {
            xx = -1.96998 + (((tickAnim - 13) / 5) * (-4.22857-(-1.96998)));
            yy = -0.34511 + (((tickAnim - 13) / 5) * (-3.64242-(-0.34511)));
            zz = -0.00568 + (((tickAnim - 13) / 5) * (-2.41375-(-0.00568)));
        }
        else if (tickAnim >= 18 && tickAnim < 23) {
            xx = -4.22857 + (((tickAnim - 18) / 5) * (-6.15019-(-4.22857)));
            yy = -3.64242 + (((tickAnim - 18) / 5) * (-5.24271-(-3.64242)));
            zz = -2.41375 + (((tickAnim - 18) / 5) * (-0.37348-(-2.41375)));
        }
        else if (tickAnim >= 23 && tickAnim < 43) {
            xx = -6.15019 + (((tickAnim - 23) / 20) * (-6.15019-(-6.15019)));
            yy = -5.24271 + (((tickAnim - 23) / 20) * (-5.24271-(-5.24271)));
            zz = -0.37348 + (((tickAnim - 23) / 20) * (-0.37348-(-0.37348)));
        }
        else if (tickAnim >= 43 && tickAnim < 60) {
            xx = -6.15019 + (((tickAnim - 43) / 17) * (0-(-6.15019)));
            yy = -5.24271 + (((tickAnim - 43) / 17) * (0-(-5.24271)));
            zz = -0.37348 + (((tickAnim - 43) / 17) * (0-(-0.37348)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftthigh, leftthigh.rotateAngleX + (float) Math.toRadians(xx), leftthigh.rotateAngleY + (float) Math.toRadians(yy), leftthigh.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 0) / 13) * (-19-(0)));
            yy = 0 + (((tickAnim - 0) / 13) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 13) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 43) {
            xx = -19 + (((tickAnim - 13) / 30) * (-19-(-19)));
            yy = 0 + (((tickAnim - 13) / 30) * (0-(0)));
            zz = 0 + (((tickAnim - 13) / 30) * (0-(0)));
        }
        else if (tickAnim >= 43 && tickAnim < 53) {
            xx = -19 + (((tickAnim - 43) / 10) * (22.95-(-19)));
            yy = 0 + (((tickAnim - 43) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 43) / 10) * (0-(0)));
        }
        else if (tickAnim >= 53 && tickAnim < 60) {
            xx = 22.95 + (((tickAnim - 53) / 7) * (0-(22.95)));
            yy = 0 + (((tickAnim - 53) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 53) / 7) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftshin, leftshin.rotateAngleX + (float) Math.toRadians(xx), leftshin.rotateAngleY + (float) Math.toRadians(yy), leftshin.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 6) {
            xx = 0 + (((tickAnim - 0) / 6) * (-30.62-(0)));
            yy = 0 + (((tickAnim - 0) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 6) * (0-(0)));
        }
        else if (tickAnim >= 6 && tickAnim < 13) {
            xx = -30.62 + (((tickAnim - 6) / 7) * (7.75-(-30.62)));
            yy = 0 + (((tickAnim - 6) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 6) / 7) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 43) {
            xx = 7.75 + (((tickAnim - 13) / 30) * (7.75-(7.75)));
            yy = 0 + (((tickAnim - 13) / 30) * (0-(0)));
            zz = 0 + (((tickAnim - 13) / 30) * (0-(0)));
        }
        else if (tickAnim >= 43 && tickAnim < 53) {
            xx = 7.75 + (((tickAnim - 43) / 10) * (-34.76-(7.75)));
            yy = 0 + (((tickAnim - 43) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 43) / 10) * (0-(0)));
        }
        else if (tickAnim >= 53 && tickAnim < 60) {
            xx = -34.76 + (((tickAnim - 53) / 7) * (0-(-34.76)));
            yy = 0 + (((tickAnim - 53) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 53) / 7) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftankle, leftankle.rotateAngleX + (float) Math.toRadians(xx), leftankle.rotateAngleY + (float) Math.toRadians(yy), leftankle.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 6) {
            xx = 0 + (((tickAnim - 0) / 6) * (76.75-(0)));
            yy = 0 + (((tickAnim - 0) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 6) * (0-(0)));
        }
        else if (tickAnim >= 6 && tickAnim < 13) {
            xx = 76.75 + (((tickAnim - 6) / 7) * (25.5-(76.75)));
            yy = 0 + (((tickAnim - 6) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 6) / 7) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 43) {
            xx = 25.5 + (((tickAnim - 13) / 30) * (25.5-(25.5)));
            yy = 0 + (((tickAnim - 13) / 30) * (0-(0)));
            zz = 0 + (((tickAnim - 13) / 30) * (0-(0)));
        }
        else if (tickAnim >= 43 && tickAnim < 53) {
            xx = 25.5 + (((tickAnim - 43) / 10) * (59.48-(25.5)));
            yy = 0 + (((tickAnim - 43) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 43) / 10) * (0-(0)));
        }
        else if (tickAnim >= 53 && tickAnim < 60) {
            xx = 59.48 + (((tickAnim - 53) / 7) * (0-(59.48)));
            yy = 0 + (((tickAnim - 53) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 53) / 7) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftfoot, leftfoot.rotateAngleX + (float) Math.toRadians(xx), leftfoot.rotateAngleY + (float) Math.toRadians(yy), leftfoot.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 6) {
            xx = 0 + (((tickAnim - 0) / 6) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 6) * (1.5-(0)));
            zz = 0 + (((tickAnim - 0) / 6) * (-0.55-(0)));
        }
        else if (tickAnim >= 6 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 6) / 7) * (0-(0)));
            yy = 1.5 + (((tickAnim - 6) / 7) * (0-(1.5)));
            zz = -0.55 + (((tickAnim - 6) / 7) * (0-(-0.55)));
        }
        else if (tickAnim >= 13 && tickAnim < 43) {
            xx = 0 + (((tickAnim - 13) / 30) * (0-(0)));
            yy = 0 + (((tickAnim - 13) / 30) * (0-(0)));
            zz = 0 + (((tickAnim - 13) / 30) * (0-(0)));
        }
        else if (tickAnim >= 43 && tickAnim < 53) {
            xx = 0 + (((tickAnim - 43) / 10) * (0-(0)));
            yy = 0 + (((tickAnim - 43) / 10) * (0.8-(0)));
            zz = 0 + (((tickAnim - 43) / 10) * (-0.625-(0)));
        }
        else if (tickAnim >= 53 && tickAnim < 60) {
            xx = 0 + (((tickAnim - 53) / 7) * (0-(0)));
            yy = 0.8 + (((tickAnim - 53) / 7) * (0-(0.8)));
            zz = -0.625 + (((tickAnim - 53) / 7) * (0-(-0.625)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.leftfoot.rotationPointX = this.leftfoot.rotationPointX + (float)(xx);
        this.leftfoot.rotationPointY = this.leftfoot.rotationPointY - (float)(yy);
        this.leftfoot.rotationPointZ = this.leftfoot.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 0) / 8) * (9.12222-(0)));
            yy = 0 + (((tickAnim - 0) / 8) * (0.50702-(0)));
            zz = 0 + (((tickAnim - 0) / 8) * (2.19625-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 13) {
            xx = 9.12222 + (((tickAnim - 8) / 5) * (16.37287-(9.12222)));
            yy = 0.50702 + (((tickAnim - 8) / 5) * (1.14202-(0.50702)));
            zz = 2.19625 + (((tickAnim - 8) / 5) * (0.21719-(2.19625)));
        }
        else if (tickAnim >= 13 && tickAnim < 18) {
            xx = 16.37287 + (((tickAnim - 13) / 5) * (7.55484-(16.37287)));
            yy = 1.14202 + (((tickAnim - 13) / 5) * (12.10987-(1.14202)));
            zz = 0.21719 + (((tickAnim - 13) / 5) * (6.41119-(0.21719)));
        }
        else if (tickAnim >= 18 && tickAnim < 23) {
            xx = 7.55484 + (((tickAnim - 18) / 5) * (5.69643-(7.55484)));
            yy = 12.10987 + (((tickAnim - 18) / 5) * (12.61446-(12.10987)));
            zz = 6.41119 + (((tickAnim - 18) / 5) * (10.51499-(6.41119)));
        }
        else if (tickAnim >= 23 && tickAnim < 43) {
            xx = 5.69643 + (((tickAnim - 23) / 20) * (5.69643-(5.69643)));
            yy = 12.61446 + (((tickAnim - 23) / 20) * (12.61446-(12.61446)));
            zz = 10.51499 + (((tickAnim - 23) / 20) * (10.51499-(10.51499)));
        }
        else if (tickAnim >= 43 && tickAnim < 60) {
            xx = 5.69643 + (((tickAnim - 43) / 17) * (0-(5.69643)));
            yy = 12.61446 + (((tickAnim - 43) / 17) * (0-(12.61446)));
            zz = 10.51499 + (((tickAnim - 43) / 17) * (0-(10.51499)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightthigh, rightthigh.rotateAngleX + (float) Math.toRadians(xx), rightthigh.rotateAngleY + (float) Math.toRadians(yy), rightthigh.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 0) / 13) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 13) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 13) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 18) {
            xx = 0 + (((tickAnim - 13) / 5) * (56.5-(0)));
            yy = 0 + (((tickAnim - 13) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 13) / 5) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 23) {
            xx = 56.5 + (((tickAnim - 18) / 5) * (4.25-(56.5)));
            yy = 0 + (((tickAnim - 18) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 18) / 5) * (0-(0)));
        }
        else if (tickAnim >= 23 && tickAnim < 43) {
            xx = 4.25 + (((tickAnim - 23) / 20) * (4.25-(4.25)));
            yy = 0 + (((tickAnim - 23) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 23) / 20) * (0-(0)));
        }
        else if (tickAnim >= 43 && tickAnim < 60) {
            xx = 4.25 + (((tickAnim - 43) / 17) * (0-(4.25)));
            yy = 0 + (((tickAnim - 43) / 17) * (0-(0)));
            zz = 0 + (((tickAnim - 43) / 17) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightfoot, rightfoot.rotateAngleX + (float) Math.toRadians(xx), rightfoot.rotateAngleY + (float) Math.toRadians(yy), rightfoot.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 0) / 13) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 13) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 13) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 18) {
            xx = 0 + (((tickAnim - 13) / 5) * (0-(0)));
            yy = 0 + (((tickAnim - 13) / 5) * (0.65-(0)));
            zz = 0 + (((tickAnim - 13) / 5) * (-0.45-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 23) {
            xx = 0 + (((tickAnim - 18) / 5) * (0-(0)));
            yy = 0.65 + (((tickAnim - 18) / 5) * (0-(0.65)));
            zz = -0.45 + (((tickAnim - 18) / 5) * (0-(-0.45)));
        }
        else if (tickAnim >= 23 && tickAnim < 43) {
            xx = 0 + (((tickAnim - 23) / 20) * (0-(0)));
            yy = 0 + (((tickAnim - 23) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 23) / 20) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.rightfoot.rotationPointX = this.rightfoot.rotationPointX + (float)(xx);
        this.rightfoot.rotationPointY = this.rightfoot.rotationPointY - (float)(yy);
        this.rightfoot.rotationPointZ = this.rightfoot.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 0) / 8) * (0.02321-(0)));
            yy = 0 + (((tickAnim - 0) / 8) * (-0.66363-(0)));
            zz = 0 + (((tickAnim - 0) / 8) * (-2.24558-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 18) {
            xx = 0.02321 + (((tickAnim - 8) / 10) * (8.72807-(0.02321)));
            yy = -0.66363 + (((tickAnim - 8) / 10) * (-0.42368-(-0.66363)));
            zz = -2.24558 + (((tickAnim - 8) / 10) * (-12.905+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120-20))*15-(-2.24558)));
        }
        else if (tickAnim >= 18 && tickAnim < 23) {
            xx = 8.72807 + (((tickAnim - 18) / 5) * (0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*90))*5-(8.72807)));
            yy = -0.42368 + (((tickAnim - 18) / 5) * (-2.5-(-0.42368)));
            zz = -12.905+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120-20))*15 + (((tickAnim - 18) / 5) * (0-(-12.905+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120-20))*15)));
        }
        else if (tickAnim >= 23 && tickAnim < 44) {
            xx = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*90))*5 + (((tickAnim - 23) / 21) * (-2.5-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*90))*5)));
            yy = -2.5 + (((tickAnim - 23) / 21) * (-2.5-(-2.5)));
            zz = 0 + (((tickAnim - 23) / 21) * (0-(0)));
        }
        else if (tickAnim >= 44 && tickAnim < 60) {
            xx = -2.5 + (((tickAnim - 44) / 16) * (0-(-2.5)));
            yy = -2.5 + (((tickAnim - 44) / 16) * (0-(-2.5)));
            zz = 0 + (((tickAnim - 44) / 16) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(bodymiddle, bodymiddle.rotateAngleX + (float) Math.toRadians(xx), bodymiddle.rotateAngleY + (float) Math.toRadians(yy), bodymiddle.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 0) / 13) * (7.03975-(0)));
            yy = 0 + (((tickAnim - 0) / 13) * (-9.4363+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120+50))*15-(0)));
            zz = 0 + (((tickAnim - 0) / 13) * (0.92632-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 23) {
            xx = 7.03975 + (((tickAnim - 13) / 10) * (10.65901-(7.03975)));
            yy = -9.4363+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120+50))*15 + (((tickAnim - 13) / 10) * (-20.0363+Math.sin((Math.PI/180)*(((double)tickAnim/20)*90))*5-(-9.4363+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120+50))*15)));
            zz = 0.92632 + (((tickAnim - 13) / 10) * (-3.90037-(0.92632)));
        }
        else if (tickAnim >= 23 && tickAnim < 44) {
            xx = 10.65901 + (((tickAnim - 23) / 21) * (15.68065-(10.65901)));
            yy = -20.0363+Math.sin((Math.PI/180)*(((double)tickAnim/20)*90))*5 + (((tickAnim - 23) / 21) * (-10.82751-(-20.0363+Math.sin((Math.PI/180)*(((double)tickAnim/20)*90))*5)));
            zz = -3.90037 + (((tickAnim - 23) / 21) * (-1.98452-(-3.90037)));
        }
        else if (tickAnim >= 44 && tickAnim < 60) {
            xx = 15.68065 + (((tickAnim - 44) / 16) * (0-(15.68065)));
            yy = -10.82751 + (((tickAnim - 44) / 16) * (0-(-10.82751)));
            zz = -1.98452 + (((tickAnim - 44) / 16) * (0-(-1.98452)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tailbase, tailbase.rotateAngleX + (float) Math.toRadians(xx), tailbase.rotateAngleY + (float) Math.toRadians(yy), tailbase.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 0) / 13) * (10.1466-(0)));
            yy = 0 + (((tickAnim - 0) / 13) * (11.7223+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120-50))*-28-(0)));
            zz = 0 + (((tickAnim - 0) / 13) * (2.45915-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 60) {
            xx = 10.1466 + (((tickAnim - 13) / 47) * (0-(10.1466)));
            yy = 11.7223+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120-50))*-28 + (((tickAnim - 13) / 47) * (0-(11.7223+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120-50))*-28)));
            zz = 2.45915 + (((tickAnim - 13) / 47) * (0-(2.45915)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tailmiddlebase, tailmiddlebase.rotateAngleX + (float) Math.toRadians(xx), tailmiddlebase.rotateAngleY + (float) Math.toRadians(yy), tailmiddlebase.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 0) / 13) * (13.57183-(0)));
            yy = 0 + (((tickAnim - 0) / 13) * (24.42983-(0)));
            zz = 0 + (((tickAnim - 0) / 13) * (8.4013-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 23) {
            xx = 13.57183 + (((tickAnim - 13) / 10) * (9.08804-(13.57183)));
            yy = 24.42983 + (((tickAnim - 13) / 10) * (-29.8283-(24.42983)));
            zz = 8.4013 + (((tickAnim - 13) / 10) * (-10.62717-(8.4013)));
        }
        else if (tickAnim >= 23 && tickAnim < 44) {
            xx = 9.08804 + (((tickAnim - 23) / 21) * (-13.47655-(9.08804)));
            yy = -29.8283 + (((tickAnim - 23) / 21) * (15.48405-(-29.8283)));
            zz = -10.62717 + (((tickAnim - 23) / 21) * (-0.49498-(-10.62717)));
        }
        else if (tickAnim >= 44 && tickAnim < 60) {
            xx = -13.47655 + (((tickAnim - 44) / 16) * (0-(-13.47655)));
            yy = 15.48405 + (((tickAnim - 44) / 16) * (0-(15.48405)));
            zz = -0.49498 + (((tickAnim - 44) / 16) * (0-(-0.49498)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tailmiddleend, tailmiddleend.rotateAngleX + (float) Math.toRadians(xx), tailmiddleend.rotateAngleY + (float) Math.toRadians(yy), tailmiddleend.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 0) / 13) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 13) * (47.25-(0)));
            zz = 0 + (((tickAnim - 0) / 13) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 25) {
            xx = 0 + (((tickAnim - 13) / 12) * (-9.95625-(0)));
            yy = 47.25 + (((tickAnim - 13) / 12) * (-11.98462-(47.25)));
            zz = 0 + (((tickAnim - 13) / 12) * (9.07993-(0)));
        }
        else if (tickAnim >= 25 && tickAnim < 33) {
            xx = -9.95625 + (((tickAnim - 25) / 8) * (-9.30913-(-9.95625)));
            yy = -11.98462 + (((tickAnim - 25) / 8) * (-29.07599-(-11.98462)));
            zz = 9.07993 + (((tickAnim - 25) / 8) * (9.67902-(9.07993)));
        }
        else if (tickAnim >= 33 && tickAnim < 44) {
            xx = -9.30913 + (((tickAnim - 33) / 11) * (-2.98882-(-9.30913)));
            yy = -29.07599 + (((tickAnim - 33) / 11) * (13.017-(-29.07599)));
            zz = 9.67902 + (((tickAnim - 33) / 11) * (-9.51917-(9.67902)));
        }
        else if (tickAnim >= 44 && tickAnim < 60) {
            xx = -2.98882 + (((tickAnim - 44) / 16) * (0-(-2.98882)));
            yy = 13.017 + (((tickAnim - 44) / 16) * (0-(13.017)));
            zz = -9.51917 + (((tickAnim - 44) / 16) * (0-(-9.51917)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tailend, tailend.rotateAngleX + (float) Math.toRadians(xx), tailend.rotateAngleY + (float) Math.toRadians(yy), tailend.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 0) / 13) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 13) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 13) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 18) {
            xx = 0 + (((tickAnim - 13) / 5) * (12.5-(0)));
            yy = 0 + (((tickAnim - 13) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 13) / 5) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 23) {
            xx = 12.5 + (((tickAnim - 18) / 5) * (0-(12.5)));
            yy = 0 + (((tickAnim - 18) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 18) / 5) * (0-(0)));
        }
        else if (tickAnim >= 23 && tickAnim < 43) {
            xx = 0 + (((tickAnim - 23) / 20) * (0-(0)));
            yy = 0 + (((tickAnim - 23) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 23) / 20) * (0-(0)));
        }
        else if (tickAnim >= 43 && tickAnim < 60) {
            xx = 0 + (((tickAnim - 43) / 17) * (0-(0)));
            yy = 0 + (((tickAnim - 43) / 17) * (0-(0)));
            zz = 0 + (((tickAnim - 43) / 17) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightshin, rightshin.rotateAngleX + (float) Math.toRadians(xx), rightshin.rotateAngleY + (float) Math.toRadians(yy), rightshin.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 0) / 13) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 13) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 13) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 18) {
            xx = 0 + (((tickAnim - 13) / 5) * (-33-(0)));
            yy = 0 + (((tickAnim - 13) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 13) / 5) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 23) {
            xx = -33 + (((tickAnim - 18) / 5) * (0-(-33)));
            yy = 0 + (((tickAnim - 18) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 18) / 5) * (0-(0)));
        }
        else if (tickAnim >= 23 && tickAnim < 43) {
            xx = 0 + (((tickAnim - 23) / 20) * (0-(0)));
            yy = 0 + (((tickAnim - 23) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 23) / 20) * (0-(0)));
        }
        else if (tickAnim >= 43 && tickAnim < 60) {
            xx = 0 + (((tickAnim - 43) / 17) * (0-(0)));
            yy = 0 + (((tickAnim - 43) / 17) * (0-(0)));
            zz = 0 + (((tickAnim - 43) / 17) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightankle, rightankle.rotateAngleX + (float) Math.toRadians(xx), rightankle.rotateAngleY + (float) Math.toRadians(yy), rightankle.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 13 && tickAnim < 23) {
            xx = 0 + (((tickAnim - 13) / 10) * (0-(0)));
            yy = 0 + (((tickAnim - 13) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 13) / 10) * (0-(0)));
        }
        else if (tickAnim >= 23 && tickAnim < 43) {
            xx = 0 + (((tickAnim - 23) / 20) * (0-(0)));
            yy = 0 + (((tickAnim - 23) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 23) / 20) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.rightankle.rotationPointX = this.rightankle.rotationPointX + (float)(xx);
        this.rightankle.rotationPointY = this.rightankle.rotationPointY - (float)(yy);
        this.rightankle.rotationPointZ = this.rightankle.rotationPointZ + (float)(zz);

    }
    public void animLay(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime, double animTick) {
        EntityPrehistoricFloraFalcarius entity = (EntityPrehistoricFloraFalcarius) entitylivingbaseIn;
        int animCycle = 50;
        double tickAnim = animTick + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;
         if (tickAnim >= 0 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 0) / 15) * (-15.75-(0)));
            yy = 0 + (((tickAnim - 0) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 15) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 35) {
            xx = -15.75 + (((tickAnim - 15) / 20) * (-15.75-(-15.75)));
            yy = 0 + (((tickAnim - 15) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 20) * (0-(0)));
        }
        else if (tickAnim >= 35 && tickAnim < 50) {
            xx = -15.75 + (((tickAnim - 35) / 15) * (0-(-15.75)));
            yy = 0 + (((tickAnim - 35) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 35) / 15) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(hips, hips.rotateAngleX + (float) Math.toRadians(xx), hips.rotateAngleY + (float) Math.toRadians(yy), hips.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 0) / 15) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 15) * (-3.1-(0)));
            zz = 0 + (((tickAnim - 0) / 15) * (5.475-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 35) {
            xx = 0 + (((tickAnim - 15) / 20) * (0-(0)));
            yy = -3.1 + (((tickAnim - 15) / 20) * (-3.1-(-3.1)));
            zz = 5.475 + (((tickAnim - 15) / 20) * (5.475-(5.475)));
        }
        else if (tickAnim >= 35 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 35) / 15) * (0-(0)));
            yy = -3.1 + (((tickAnim - 35) / 15) * (0-(-3.1)));
            zz = 5.475 + (((tickAnim - 35) / 15) * (0-(5.475)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.hips.rotationPointX = this.hips.rotationPointX + (float)(xx);
        this.hips.rotationPointY = this.hips.rotationPointY - (float)(yy);
        this.hips.rotationPointZ = this.hips.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 0) / 15) * (6-(0)));
            yy = 0 + (((tickAnim - 0) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 15) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 35) {
            xx = 6 + (((tickAnim - 15) / 20) * (6-(6)));
            yy = 0 + (((tickAnim - 15) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 20) * (0-(0)));
        }
        else if (tickAnim >= 35 && tickAnim < 50) {
            xx = 6 + (((tickAnim - 35) / 15) * (0-(6)));
            yy = 0 + (((tickAnim - 35) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 35) / 15) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neckmiddlefront, neckmiddlefront.rotateAngleX + (float) Math.toRadians(xx), neckmiddlefront.rotateAngleY + (float) Math.toRadians(yy), neckmiddlefront.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 0) / 15) * (5.90676-(0)));
            yy = 0 + (((tickAnim - 0) / 15) * (-0.26654-(0)));
            zz = 0 + (((tickAnim - 0) / 15) * (-1.85922-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 35) {
            xx = 5.90676 + (((tickAnim - 15) / 20) * (5.90676-(5.90676)));
            yy = -0.26654 + (((tickAnim - 15) / 20) * (-0.26654-(-0.26654)));
            zz = -1.85922 + (((tickAnim - 15) / 20) * (-1.85922-(-1.85922)));
        }
        else if (tickAnim >= 35 && tickAnim < 50) {
            xx = 5.90676 + (((tickAnim - 35) / 15) * (0-(5.90676)));
            yy = -0.26654 + (((tickAnim - 35) / 15) * (0-(-0.26654)));
            zz = -1.85922 + (((tickAnim - 35) / 15) * (0-(-1.85922)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neckfront, neckfront.rotateAngleX + (float) Math.toRadians(xx), neckfront.rotateAngleY + (float) Math.toRadians(yy), neckfront.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 0) / 15) * (-11.25-(0)));
            yy = 0 + (((tickAnim - 0) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 15) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 35) {
            xx = -11.25 + (((tickAnim - 15) / 20) * (-11.25-(-11.25)));
            yy = 0 + (((tickAnim - 15) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 20) * (0-(0)));
        }
        else if (tickAnim >= 35 && tickAnim < 50) {
            xx = -11.25 + (((tickAnim - 35) / 15) * (0-(-11.25)));
            yy = 0 + (((tickAnim - 35) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 35) / 15) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tailbase, tailbase.rotateAngleX + (float) Math.toRadians(xx), tailbase.rotateAngleY + (float) Math.toRadians(yy), tailbase.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 0) / 15) * (10-(0)));
            yy = 0 + (((tickAnim - 0) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 15) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 35) {
            xx = 10 + (((tickAnim - 15) / 20) * (10-(10)));
            yy = 0 + (((tickAnim - 15) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 20) * (0-(0)));
        }
        else if (tickAnim >= 35 && tickAnim < 50) {
            xx = 10 + (((tickAnim - 35) / 15) * (0-(10)));
            yy = 0 + (((tickAnim - 35) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 35) / 15) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tailmiddlebase, tailmiddlebase.rotateAngleX + (float) Math.toRadians(xx), tailmiddlebase.rotateAngleY + (float) Math.toRadians(yy), tailmiddlebase.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 0) / 15) * (5.25-(0)));
            yy = 0 + (((tickAnim - 0) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 15) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 35) {
            xx = 5.25 + (((tickAnim - 15) / 20) * (5.25-(5.25)));
            yy = 0 + (((tickAnim - 15) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 20) * (0-(0)));
        }
        else if (tickAnim >= 35 && tickAnim < 50) {
            xx = 5.25 + (((tickAnim - 35) / 15) * (0-(5.25)));
            yy = 0 + (((tickAnim - 35) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 35) / 15) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tailmiddleend, tailmiddleend.rotateAngleX + (float) Math.toRadians(xx), tailmiddleend.rotateAngleY + (float) Math.toRadians(yy), tailmiddleend.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 0) / 15) * (19-(0)));
            yy = 0 + (((tickAnim - 0) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 15) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 35) {
            xx = 19 + (((tickAnim - 15) / 20) * (19-(19)));
            yy = 0 + (((tickAnim - 15) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 20) * (0-(0)));
        }
        else if (tickAnim >= 35 && tickAnim < 50) {
            xx = 19 + (((tickAnim - 35) / 15) * (0-(19)));
            yy = 0 + (((tickAnim - 35) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 35) / 15) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tailend, tailend.rotateAngleX + (float) Math.toRadians(xx), tailend.rotateAngleY + (float) Math.toRadians(yy), tailend.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 0) / 15) * (-15.25-(0)));
            yy = 0 + (((tickAnim - 0) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 15) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 35) {
            xx = -15.25 + (((tickAnim - 15) / 20) * (-15.25-(-15.25)));
            yy = 0 + (((tickAnim - 15) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 20) * (0-(0)));
        }
        else if (tickAnim >= 35 && tickAnim < 50) {
            xx = -15.25 + (((tickAnim - 35) / 15) * (0-(-15.25)));
            yy = 0 + (((tickAnim - 35) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 35) / 15) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftthigh, leftthigh.rotateAngleX + (float) Math.toRadians(xx), leftthigh.rotateAngleY + (float) Math.toRadians(yy), leftthigh.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 0) / 15) * (-3.75-(0)));
            yy = 0 + (((tickAnim - 0) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 15) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 35) {
            xx = -3.75 + (((tickAnim - 15) / 20) * (-3.75-(-3.75)));
            yy = 0 + (((tickAnim - 15) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 20) * (0-(0)));
        }
        else if (tickAnim >= 35 && tickAnim < 50) {
            xx = -3.75 + (((tickAnim - 35) / 15) * (0-(-3.75)));
            yy = 0 + (((tickAnim - 35) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 35) / 15) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftshin, leftshin.rotateAngleX + (float) Math.toRadians(xx), leftshin.rotateAngleY + (float) Math.toRadians(yy), leftshin.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 0) / 15) * (-33.5-(0)));
            yy = 0 + (((tickAnim - 0) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 15) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 35) {
            xx = -33.5 + (((tickAnim - 15) / 20) * (-33.5-(-33.5)));
            yy = 0 + (((tickAnim - 15) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 20) * (0-(0)));
        }
        else if (tickAnim >= 35 && tickAnim < 50) {
            xx = -33.5 + (((tickAnim - 35) / 15) * (0-(-33.5)));
            yy = 0 + (((tickAnim - 35) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 35) / 15) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftankle, leftankle.rotateAngleX + (float) Math.toRadians(xx), leftankle.rotateAngleY + (float) Math.toRadians(yy), leftankle.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 0) / 15) * (69.25-(0)));
            yy = 0 + (((tickAnim - 0) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 15) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 35) {
            xx = 69.25 + (((tickAnim - 15) / 20) * (69.25-(69.25)));
            yy = 0 + (((tickAnim - 15) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 20) * (0-(0)));
        }
        else if (tickAnim >= 35 && tickAnim < 50) {
            xx = 69.25 + (((tickAnim - 35) / 15) * (0-(69.25)));
            yy = 0 + (((tickAnim - 35) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 35) / 15) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftfoot, leftfoot.rotateAngleX + (float) Math.toRadians(xx), leftfoot.rotateAngleY + (float) Math.toRadians(yy), leftfoot.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 0) / 15) * (-15.25-(0)));
            yy = 0 + (((tickAnim - 0) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 15) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 35) {
            xx = -15.25 + (((tickAnim - 15) / 20) * (-15.25-(-15.25)));
            yy = 0 + (((tickAnim - 15) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 20) * (0-(0)));
        }
        else if (tickAnim >= 35 && tickAnim < 50) {
            xx = -15.25 + (((tickAnim - 35) / 15) * (0-(-15.25)));
            yy = 0 + (((tickAnim - 35) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 35) / 15) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightthigh, rightthigh.rotateAngleX + (float) Math.toRadians(xx), rightthigh.rotateAngleY + (float) Math.toRadians(yy), rightthigh.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 0) / 15) * (-3.75-(0)));
            yy = 0 + (((tickAnim - 0) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 15) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 35) {
            xx = -3.75 + (((tickAnim - 15) / 20) * (-3.75-(-3.75)));
            yy = 0 + (((tickAnim - 15) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 20) * (0-(0)));
        }
        else if (tickAnim >= 35 && tickAnim < 50) {
            xx = -3.75 + (((tickAnim - 35) / 15) * (0-(-3.75)));
            yy = 0 + (((tickAnim - 35) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 35) / 15) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightshin, rightshin.rotateAngleX + (float) Math.toRadians(xx), rightshin.rotateAngleY + (float) Math.toRadians(yy), rightshin.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 0) / 15) * (-33.5-(0)));
            yy = 0 + (((tickAnim - 0) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 15) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 35) {
            xx = -33.5 + (((tickAnim - 15) / 20) * (-33.5-(-33.5)));
            yy = 0 + (((tickAnim - 15) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 20) * (0-(0)));
        }
        else if (tickAnim >= 35 && tickAnim < 50) {
            xx = -33.5 + (((tickAnim - 35) / 15) * (0-(-33.5)));
            yy = 0 + (((tickAnim - 35) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 35) / 15) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightankle, rightankle.rotateAngleX + (float) Math.toRadians(xx), rightankle.rotateAngleY + (float) Math.toRadians(yy), rightankle.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 0) / 15) * (69.25-(0)));
            yy = 0 + (((tickAnim - 0) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 15) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 35) {
            xx = 69.25 + (((tickAnim - 15) / 20) * (69.25-(69.25)));
            yy = 0 + (((tickAnim - 15) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 20) * (0-(0)));
        }
        else if (tickAnim >= 35 && tickAnim < 50) {
            xx = 69.25 + (((tickAnim - 35) / 15) * (0-(69.25)));
            yy = 0 + (((tickAnim - 35) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 35) / 15) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightfoot, rightfoot.rotateAngleX + (float) Math.toRadians(xx), rightfoot.rotateAngleY + (float) Math.toRadians(yy), rightfoot.rotateAngleZ + (float) Math.toRadians(zz));

    }
    public void animGraze(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime, double animTick) {
        EntityPrehistoricFloraFalcarius entity = (EntityPrehistoricFloraFalcarius) entitylivingbaseIn;
        int animCycle = 175;
        double tickAnim = animTick + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;
         if (tickAnim >= 0 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 0) / 50) * (-8.25-(0)));
            yy = 0 + (((tickAnim - 0) / 50) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 50) * (0-(0)));
        }
        else if (tickAnim >= 50 && tickAnim < 150) {
            xx = -8.25 + (((tickAnim - 50) / 100) * (-8.25-(-8.25)));
            yy = 0 + (((tickAnim - 50) / 100) * (0-(0)));
            zz = 0 + (((tickAnim - 50) / 100) * (0-(0)));
        }
        else if (tickAnim >= 150 && tickAnim < 176) {
            xx = -8.25 + (((tickAnim - 150) / 26) * (0-(-8.25)));
            yy = 0 + (((tickAnim - 150) / 26) * (0-(0)));
            zz = 0 + (((tickAnim - 150) / 26) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(hips, hips.rotateAngleX + (float) Math.toRadians(xx), hips.rotateAngleY + (float) Math.toRadians(yy), hips.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 0) / 50) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 50) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 50) * (-3.65-(0)));
        }
        else if (tickAnim >= 50 && tickAnim < 150) {
            xx = 0 + (((tickAnim - 50) / 100) * (0-(0)));
            yy = 0 + (((tickAnim - 50) / 100) * (0-(0)));
            zz = -3.65 + (((tickAnim - 50) / 100) * (-3.65-(-3.65)));
        }
        else if (tickAnim >= 150 && tickAnim < 176) {
            xx = 0 + (((tickAnim - 150) / 26) * (0-(0)));
            yy = 0 + (((tickAnim - 150) / 26) * (0-(0)));
            zz = -3.65 + (((tickAnim - 150) / 26) * (0-(-3.65)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.hips.rotationPointX = this.hips.rotationPointX + (float)(xx);
        this.hips.rotationPointY = this.hips.rotationPointY - (float)(yy);
        this.hips.rotationPointZ = this.hips.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 0) / 50) * (-6.5-(0)));
            yy = 0 + (((tickAnim - 0) / 50) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 50) * (0-(0)));
        }
        else if (tickAnim >= 50 && tickAnim < 60) {
            xx = -6.5 + (((tickAnim - 50) / 10) * (-7.5-(-6.5)));
            yy = 0 + (((tickAnim - 50) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 50) / 10) * (0-(0)));
        }
        else if (tickAnim >= 60 && tickAnim < 74) {
            xx = -7.5 + (((tickAnim - 60) / 14) * (-6.5-(-7.5)));
            yy = 0 + (((tickAnim - 60) / 14) * (0-(0)));
            zz = 0 + (((tickAnim - 60) / 14) * (0-(0)));
        }
        else if (tickAnim >= 74 && tickAnim < 100) {
            xx = -6.5 + (((tickAnim - 74) / 26) * (-5.25-(-6.5)));
            yy = 0 + (((tickAnim - 74) / 26) * (0-(0)));
            zz = 0 + (((tickAnim - 74) / 26) * (0-(0)));
        }
        else if (tickAnim >= 100 && tickAnim < 130) {
            xx = -5.25 + (((tickAnim - 100) / 30) * (-7.5-(-5.25)));
            yy = 0 + (((tickAnim - 100) / 30) * (0-(0)));
            zz = 0 + (((tickAnim - 100) / 30) * (0-(0)));
        }
        else if (tickAnim >= 130 && tickAnim < 140) {
            xx = -7.5 + (((tickAnim - 130) / 10) * (-7.25-(-7.5)));
            yy = 0 + (((tickAnim - 130) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 130) / 10) * (0-(0)));
        }
        else if (tickAnim >= 140 && tickAnim < 150) {
            xx = -7.25 + (((tickAnim - 140) / 10) * (-7.5-(-7.25)));
            yy = 0 + (((tickAnim - 140) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 140) / 10) * (0-(0)));
        }
        else if (tickAnim >= 150 && tickAnim < 176) {
            xx = -7.5 + (((tickAnim - 150) / 26) * (0-(-7.5)));
            yy = 0 + (((tickAnim - 150) / 26) * (0-(0)));
            zz = 0 + (((tickAnim - 150) / 26) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(bodymiddle, bodymiddle.rotateAngleX + (float) Math.toRadians(xx), bodymiddle.rotateAngleY + (float) Math.toRadians(yy), bodymiddle.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 0) / 50) * (-4.5-(0)));
            yy = 0 + (((tickAnim - 0) / 50) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 50) * (0-(0)));
        }
        else if (tickAnim >= 50 && tickAnim < 60) {
            xx = -4.5 + (((tickAnim - 50) / 10) * (-5.75-(-4.5)));
            yy = 0 + (((tickAnim - 50) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 50) / 10) * (0-(0)));
        }
        else if (tickAnim >= 60 && tickAnim < 74) {
            xx = -5.75 + (((tickAnim - 60) / 14) * (-4.5-(-5.75)));
            yy = 0 + (((tickAnim - 60) / 14) * (0-(0)));
            zz = 0 + (((tickAnim - 60) / 14) * (0-(0)));
        }
        else if (tickAnim >= 74 && tickAnim < 100) {
            xx = -4.5 + (((tickAnim - 74) / 26) * (-3.5-(-4.5)));
            yy = 0 + (((tickAnim - 74) / 26) * (0-(0)));
            zz = 0 + (((tickAnim - 74) / 26) * (0-(0)));
        }
        else if (tickAnim >= 100 && tickAnim < 130) {
            xx = -3.5 + (((tickAnim - 100) / 30) * (-5.75-(-3.5)));
            yy = 0 + (((tickAnim - 100) / 30) * (0-(0)));
            zz = 0 + (((tickAnim - 100) / 30) * (0-(0)));
        }
        else if (tickAnim >= 130 && tickAnim < 140) {
            xx = -5.75 + (((tickAnim - 130) / 10) * (-6.5-(-5.75)));
            yy = 0 + (((tickAnim - 130) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 130) / 10) * (0-(0)));
        }
        else if (tickAnim >= 140 && tickAnim < 150) {
            xx = -6.5 + (((tickAnim - 140) / 10) * (-5.75-(-6.5)));
            yy = 0 + (((tickAnim - 140) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 140) / 10) * (0-(0)));
        }
        else if (tickAnim >= 150 && tickAnim < 176) {
            xx = -5.75 + (((tickAnim - 150) / 26) * (0-(-5.75)));
            yy = 0 + (((tickAnim - 150) / 26) * (0-(0)));
            zz = 0 + (((tickAnim - 150) / 26) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(bodyfront, bodyfront.rotateAngleX + (float) Math.toRadians(xx), bodyfront.rotateAngleY + (float) Math.toRadians(yy), bodyfront.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 14) {
            xx = 0 + (((tickAnim - 0) / 14) * (3.47-(0)));
            yy = 0 + (((tickAnim - 0) / 14) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 14) * (0-(0)));
        }
        else if (tickAnim >= 14 && tickAnim < 48) {
            xx = 3.47 + (((tickAnim - 14) / 34) * (-5.75-(3.47)));
            yy = 0 + (((tickAnim - 14) / 34) * (0-(0)));
            zz = 0 + (((tickAnim - 14) / 34) * (0-(0)));
        }
        else if (tickAnim >= 48 && tickAnim < 60) {
            xx = -5.75 + (((tickAnim - 48) / 12) * (-0.25-(-5.75)));
            yy = 0 + (((tickAnim - 48) / 12) * (0-(0)));
            zz = 0 + (((tickAnim - 48) / 12) * (0-(0)));
        }
        else if (tickAnim >= 60 && tickAnim < 74) {
            xx = -0.25 + (((tickAnim - 60) / 14) * (-5.75-(-0.25)));
            yy = 0 + (((tickAnim - 60) / 14) * (0-(0)));
            zz = 0 + (((tickAnim - 60) / 14) * (0-(0)));
        }
        else if (tickAnim >= 74 && tickAnim < 100) {
            xx = -5.75 + (((tickAnim - 74) / 26) * (-3.75-(-5.75)));
            yy = 0 + (((tickAnim - 74) / 26) * (0-(0)));
            zz = 0 + (((tickAnim - 74) / 26) * (0-(0)));
        }
        else if (tickAnim >= 100 && tickAnim < 115) {
            xx = -3.75 + (((tickAnim - 100) / 15) * (-6.5-(-3.75)));
            yy = 0 + (((tickAnim - 100) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 100) / 15) * (0-(0)));
        }
        else if (tickAnim >= 115 && tickAnim < 130) {
            xx = -6.5 + (((tickAnim - 115) / 15) * (-0.25-(-6.5)));
            yy = 0 + (((tickAnim - 115) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 115) / 15) * (0-(0)));
        }
        else if (tickAnim >= 130 && tickAnim < 140) {
            xx = -0.25 + (((tickAnim - 130) / 10) * (-1-(-0.25)));
            yy = 0 + (((tickAnim - 130) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 130) / 10) * (0-(0)));
        }
        else if (tickAnim >= 140 && tickAnim < 150) {
            xx = -1 + (((tickAnim - 140) / 10) * (-0.25-(-1)));
            yy = 0 + (((tickAnim - 140) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 140) / 10) * (0-(0)));
        }
        else if (tickAnim >= 150 && tickAnim < 161) {
            xx = -0.25 + (((tickAnim - 150) / 11) * (-8.23685-(-0.25)));
            yy = 0 + (((tickAnim - 150) / 11) * (1.12173-(0)));
            zz = 0 + (((tickAnim - 150) / 11) * (1.3433-(0)));
        }
        else if (tickAnim >= 161 && tickAnim < 171) {
            xx = -8.23685 + (((tickAnim - 161) / 10) * (-5.22316-(-8.23685)));
            yy = 1.12173 + (((tickAnim - 161) / 10) * (1.60232-(1.12173)));
            zz = 1.3433 + (((tickAnim - 161) / 10) * (1.91925-(1.3433)));
        }
        else if (tickAnim >= 171 && tickAnim < 176) {
            xx = -5.22316 + (((tickAnim - 171) / 5) * (0-(-5.22316)));
            yy = 1.60232 + (((tickAnim - 171) / 5) * (0-(1.60232)));
            zz = 1.91925 + (((tickAnim - 171) / 5) * (0-(1.91925)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neckbase, neckbase.rotateAngleX + (float) Math.toRadians(xx), neckbase.rotateAngleY + (float) Math.toRadians(yy), neckbase.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 14) {
            xx = 0 + (((tickAnim - 0) / 14) * (-8.67-(0)));
            yy = 0 + (((tickAnim - 0) / 14) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 14) * (0-(0)));
        }
        else if (tickAnim >= 14 && tickAnim < 48) {
            xx = -8.67 + (((tickAnim - 14) / 34) * (-9-(-8.67)));
            yy = 0 + (((tickAnim - 14) / 34) * (0-(0)));
            zz = 0 + (((tickAnim - 14) / 34) * (0-(0)));
        }
        else if (tickAnim >= 48 && tickAnim < 60) {
            xx = -9 + (((tickAnim - 48) / 12) * (18-(-9)));
            yy = 0 + (((tickAnim - 48) / 12) * (0-(0)));
            zz = 0 + (((tickAnim - 48) / 12) * (0-(0)));
        }
        else if (tickAnim >= 60 && tickAnim < 74) {
            xx = 18 + (((tickAnim - 60) / 14) * (-9-(18)));
            yy = 0 + (((tickAnim - 60) / 14) * (0-(0)));
            zz = 0 + (((tickAnim - 60) / 14) * (0-(0)));
        }
        else if (tickAnim >= 74 && tickAnim < 93) {
            xx = -9 + (((tickAnim - 74) / 19) * (-11-(-9)));
            yy = 0 + (((tickAnim - 74) / 19) * (0-(0)));
            zz = 0 + (((tickAnim - 74) / 19) * (0-(0)));
        }
        else if (tickAnim >= 93 && tickAnim < 115) {
            xx = -11 + (((tickAnim - 93) / 22) * (-1-(-11)));
            yy = 0 + (((tickAnim - 93) / 22) * (0-(0)));
            zz = 0 + (((tickAnim - 93) / 22) * (0-(0)));
        }
        else if (tickAnim >= 115 && tickAnim < 130) {
            xx = -1 + (((tickAnim - 115) / 15) * (18-(-1)));
            yy = 0 + (((tickAnim - 115) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 115) / 15) * (0-(0)));
        }
        else if (tickAnim >= 130 && tickAnim < 140) {
            xx = 18 + (((tickAnim - 130) / 10) * (15.25-(18)));
            yy = 0 + (((tickAnim - 130) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 130) / 10) * (0-(0)));
        }
        else if (tickAnim >= 140 && tickAnim < 150) {
            xx = 15.25 + (((tickAnim - 140) / 10) * (18-(15.25)));
            yy = 0 + (((tickAnim - 140) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 140) / 10) * (0-(0)));
        }
        else if (tickAnim >= 150 && tickAnim < 161) {
            xx = 18 + (((tickAnim - 150) / 11) * (2.6167-(18)));
            yy = 0 + (((tickAnim - 150) / 11) * (1.59873-(0)));
            zz = 0 + (((tickAnim - 150) / 11) * (8.34938-(0)));
        }
        else if (tickAnim >= 161 && tickAnim < 171) {
            xx = 2.6167 + (((tickAnim - 161) / 10) * (-12.36183-(2.6167)));
            yy = 1.59873 + (((tickAnim - 161) / 10) * (1.73865-(1.59873)));
            zz = 8.34938 + (((tickAnim - 161) / 10) * (9.08653-(8.34938)));
        }
        else if (tickAnim >= 171 && tickAnim < 176) {
            xx = -12.36183 + (((tickAnim - 171) / 5) * (0-(-12.36183)));
            yy = 1.73865 + (((tickAnim - 171) / 5) * (0-(1.73865)));
            zz = 9.08653 + (((tickAnim - 171) / 5) * (0-(9.08653)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neckmiddlebase, neckmiddlebase.rotateAngleX + (float) Math.toRadians(xx), neckmiddlebase.rotateAngleY + (float) Math.toRadians(yy), neckmiddlebase.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 14) {
            xx = 0 + (((tickAnim - 0) / 14) * (-3.35-(0)));
            yy = 0 + (((tickAnim - 0) / 14) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 14) * (0-(0)));
        }
        else if (tickAnim >= 14 && tickAnim < 48) {
            xx = -3.35 + (((tickAnim - 14) / 34) * (20.25-(-3.35)));
            yy = 0 + (((tickAnim - 14) / 34) * (0-(0)));
            zz = 0 + (((tickAnim - 14) / 34) * (0-(0)));
        }
        else if (tickAnim >= 48 && tickAnim < 60) {
            xx = 20.25 + (((tickAnim - 48) / 12) * (22.25-(20.25)));
            yy = 0 + (((tickAnim - 48) / 12) * (0-(0)));
            zz = 0 + (((tickAnim - 48) / 12) * (0-(0)));
        }
        else if (tickAnim >= 60 && tickAnim < 74) {
            xx = 22.25 + (((tickAnim - 60) / 14) * (20.25-(22.25)));
            yy = 0 + (((tickAnim - 60) / 14) * (0-(0)));
            zz = 0 + (((tickAnim - 60) / 14) * (0-(0)));
        }
        else if (tickAnim >= 74 && tickAnim < 93) {
            xx = 20.25 + (((tickAnim - 74) / 19) * (7-(20.25)));
            yy = 0 + (((tickAnim - 74) / 19) * (0-(0)));
            zz = 0 + (((tickAnim - 74) / 19) * (0-(0)));
        }
        else if (tickAnim >= 93 && tickAnim < 100) {
            xx = 7 + (((tickAnim - 93) / 7) * (2.75-(7)));
            yy = 0 + (((tickAnim - 93) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 93) / 7) * (0-(0)));
        }
        else if (tickAnim >= 100 && tickAnim < 115) {
            xx = 2.75 + (((tickAnim - 100) / 15) * (20.25-(2.75)));
            yy = 0 + (((tickAnim - 100) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 100) / 15) * (0-(0)));
        }
        else if (tickAnim >= 115 && tickAnim < 130) {
            xx = 20.25 + (((tickAnim - 115) / 15) * (22.25-(20.25)));
            yy = 0 + (((tickAnim - 115) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 115) / 15) * (0-(0)));
        }
        else if (tickAnim >= 130 && tickAnim < 140) {
            xx = 22.25 + (((tickAnim - 130) / 10) * (19.25-(22.25)));
            yy = 0 + (((tickAnim - 130) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 130) / 10) * (0-(0)));
        }
        else if (tickAnim >= 140 && tickAnim < 150) {
            xx = 19.25 + (((tickAnim - 140) / 10) * (22.25-(19.25)));
            yy = 0 + (((tickAnim - 140) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 140) / 10) * (0-(0)));
        }
        else if (tickAnim >= 150 && tickAnim < 161) {
            xx = 22.25 + (((tickAnim - 150) / 11) * (1.45617-(22.25)));
            yy = 0 + (((tickAnim - 150) / 11) * (-0.67132-(0)));
            zz = 0 + (((tickAnim - 150) / 11) * (7.47007-(0)));
        }
        else if (tickAnim >= 161 && tickAnim < 171) {
            xx = 1.45617 + (((tickAnim - 161) / 10) * (-7.30301-(1.45617)));
            yy = -0.67132 + (((tickAnim - 161) / 10) * (-0.73801-(-0.67132)));
            zz = 7.47007 + (((tickAnim - 161) / 10) * (8.21715-(7.47007)));
        }
        else if (tickAnim >= 171 && tickAnim < 176) {
            xx = -7.30301 + (((tickAnim - 171) / 5) * (0-(-7.30301)));
            yy = -0.73801 + (((tickAnim - 171) / 5) * (0-(-0.73801)));
            zz = 8.21715 + (((tickAnim - 171) / 5) * (0-(8.21715)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neckmiddlefront, neckmiddlefront.rotateAngleX + (float) Math.toRadians(xx), neckmiddlefront.rotateAngleY + (float) Math.toRadians(yy), neckmiddlefront.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 12) {
            xx = 0 + (((tickAnim - 0) / 12) * (-7.69-(0)));
            yy = 0 + (((tickAnim - 0) / 12) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 12) * (0-(0)));
        }
        else if (tickAnim >= 12 && tickAnim < 48) {
            xx = -7.69 + (((tickAnim - 12) / 36) * (18.5-(-7.69)));
            yy = 0 + (((tickAnim - 12) / 36) * (0-(0)));
            zz = 0 + (((tickAnim - 12) / 36) * (0-(0)));
        }
        else if (tickAnim >= 48 && tickAnim < 60) {
            xx = 18.5 + (((tickAnim - 48) / 12) * (16-(18.5)));
            yy = 0 + (((tickAnim - 48) / 12) * (0-(0)));
            zz = 0 + (((tickAnim - 48) / 12) * (0-(0)));
        }
        else if (tickAnim >= 60 && tickAnim < 74) {
            xx = 16 + (((tickAnim - 60) / 14) * (18.5-(16)));
            yy = 0 + (((tickAnim - 60) / 14) * (0-(0)));
            zz = 0 + (((tickAnim - 60) / 14) * (0-(0)));
        }
        else if (tickAnim >= 74 && tickAnim < 93) {
            xx = 18.5 + (((tickAnim - 74) / 19) * (1.5-(18.5)));
            yy = 0 + (((tickAnim - 74) / 19) * (0-(0)));
            zz = 0 + (((tickAnim - 74) / 19) * (0-(0)));
        }
        else if (tickAnim >= 93 && tickAnim < 100) {
            xx = 1.5 + (((tickAnim - 93) / 7) * (-3.5-(1.5)));
            yy = 0 + (((tickAnim - 93) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 93) / 7) * (0-(0)));
        }
        else if (tickAnim >= 100 && tickAnim < 115) {
            xx = -3.5 + (((tickAnim - 100) / 15) * (24.75-(-3.5)));
            yy = 0 + (((tickAnim - 100) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 100) / 15) * (0-(0)));
        }
        else if (tickAnim >= 115 && tickAnim < 130) {
            xx = 24.75 + (((tickAnim - 115) / 15) * (16-(24.75)));
            yy = 0 + (((tickAnim - 115) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 115) / 15) * (0-(0)));
        }
        else if (tickAnim >= 130 && tickAnim < 140) {
            xx = 16 + (((tickAnim - 130) / 10) * (12.75-(16)));
            yy = 0 + (((tickAnim - 130) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 130) / 10) * (0-(0)));
        }
        else if (tickAnim >= 140 && tickAnim < 150) {
            xx = 12.75 + (((tickAnim - 140) / 10) * (16-(12.75)));
            yy = 0 + (((tickAnim - 140) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 140) / 10) * (0-(0)));
        }
        else if (tickAnim >= 150 && tickAnim < 161) {
            xx = 16 + (((tickAnim - 150) / 11) * (20.72267-(16)));
            yy = 0 + (((tickAnim - 150) / 11) * (4.44416-(0)));
            zz = 0 + (((tickAnim - 150) / 11) * (5.73393-(0)));
        }
        else if (tickAnim >= 161 && tickAnim < 171) {
            xx = 20.72267 + (((tickAnim - 161) / 10) * (20.73832-(20.72267)));
            yy = 4.44416 + (((tickAnim - 161) / 10) * (4.59686-(4.44416)));
            zz = 5.73393 + (((tickAnim - 161) / 10) * (5.93249-(5.73393)));
        }
        else if (tickAnim >= 171 && tickAnim < 176) {
            xx = 20.73832 + (((tickAnim - 171) / 5) * (0-(20.73832)));
            yy = 4.59686 + (((tickAnim - 171) / 5) * (0-(4.59686)));
            zz = 5.93249 + (((tickAnim - 171) / 5) * (0-(5.93249)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neckfront, neckfront.rotateAngleX + (float) Math.toRadians(xx), neckfront.rotateAngleY + (float) Math.toRadians(yy), neckfront.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 0) / 50) * (16-(0)));
            yy = 0 + (((tickAnim - 0) / 50) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 50) * (0-(0)));
        }
        else if (tickAnim >= 50 && tickAnim < 74) {
            xx = 16 + (((tickAnim - 50) / 24) * (16-(16)));
            yy = 0 + (((tickAnim - 50) / 24) * (0-(0)));
            zz = 0 + (((tickAnim - 50) / 24) * (0-(0)));
        }
        else if (tickAnim >= 74 && tickAnim < 93) {
            xx = 16 + (((tickAnim - 74) / 19) * (-0.75-(16)));
            yy = 0 + (((tickAnim - 74) / 19) * (0-(0)));
            zz = 0 + (((tickAnim - 74) / 19) * (0-(0)));
        }
        else if (tickAnim >= 93 && tickAnim < 115) {
            xx = -0.75 + (((tickAnim - 93) / 22) * (-0.75-(-0.75)));
            yy = 0 + (((tickAnim - 93) / 22) * (0-(0)));
            zz = 0 + (((tickAnim - 93) / 22) * (0-(0)));
        }
        else if (tickAnim >= 115 && tickAnim < 176) {
            xx = -0.75 + (((tickAnim - 115) / 61) * (0-(-0.75)));
            yy = 0 + (((tickAnim - 115) / 61) * (0-(0)));
            zz = 0 + (((tickAnim - 115) / 61) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(head, head.rotateAngleX + (float) Math.toRadians(xx), head.rotateAngleY + (float) Math.toRadians(yy), head.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 0) / 50) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 50) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 50) * (0-(0)));
        }
        else if (tickAnim >= 50 && tickAnim < 57) {
            xx = 0 + (((tickAnim - 50) / 7) * (16.5-(0)));
            yy = 0 + (((tickAnim - 50) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 50) / 7) * (0-(0)));
        }
        else if (tickAnim >= 57 && tickAnim < 60) {
            xx = 16.5 + (((tickAnim - 57) / 3) * (0-(16.5)));
            yy = 0 + (((tickAnim - 57) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 57) / 3) * (0-(0)));
        }
        else if (tickAnim >= 60 && tickAnim < 67) {
            xx = 0 + (((tickAnim - 60) / 7) * (0-(0)));
            yy = 0 + (((tickAnim - 60) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 60) / 7) * (0-(0)));
        }
        else if (tickAnim >= 67 && tickAnim < 69) {
            xx = 0 + (((tickAnim - 67) / 2) * (2.25-(0)));
            yy = 0 + (((tickAnim - 67) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 67) / 2) * (0-(0)));
        }
        else if (tickAnim >= 69 && tickAnim < 72) {
            xx = 2.25 + (((tickAnim - 69) / 3) * (0-(2.25)));
            yy = 0 + (((tickAnim - 69) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 69) / 3) * (0-(0)));
        }
        else if (tickAnim >= 72 && tickAnim < 115) {
            xx = 0 + (((tickAnim - 72) / 43) * (0-(0)));
            yy = 0 + (((tickAnim - 72) / 43) * (0-(0)));
            zz = 0 + (((tickAnim - 72) / 43) * (0-(0)));
        }
        else if (tickAnim >= 115 && tickAnim < 127) {
            xx = 0 + (((tickAnim - 115) / 12) * (15.25-(0)));
            yy = 0 + (((tickAnim - 115) / 12) * (0-(0)));
            zz = 0 + (((tickAnim - 115) / 12) * (0-(0)));
        }
        else if (tickAnim >= 127 && tickAnim < 130) {
            xx = 15.25 + (((tickAnim - 127) / 3) * (0-(15.25)));
            yy = 0 + (((tickAnim - 127) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 127) / 3) * (0-(0)));
        }
        else if (tickAnim >= 130 && tickAnim < 135) {
            xx = 0 + (((tickAnim - 130) / 5) * (0-(0)));
            yy = 0 + (((tickAnim - 130) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 130) / 5) * (0-(0)));
        }
        else if (tickAnim >= 135 && tickAnim < 138) {
            xx = 0 + (((tickAnim - 135) / 3) * (2.5-(0)));
            yy = 0 + (((tickAnim - 135) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 135) / 3) * (0-(0)));
        }
        else if (tickAnim >= 138 && tickAnim < 140) {
            xx = 2.5 + (((tickAnim - 138) / 2) * (0-(2.5)));
            yy = 0 + (((tickAnim - 138) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 138) / 2) * (0-(0)));
        }
        else if (tickAnim >= 140 && tickAnim < 148) {
            xx = 0 + (((tickAnim - 140) / 8) * (14.5-(0)));
            yy = 0 + (((tickAnim - 140) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 140) / 8) * (0-(0)));
        }
        else if (tickAnim >= 148 && tickAnim < 150) {
            xx = 14.5 + (((tickAnim - 148) / 2) * (0-(14.5)));
            yy = 0 + (((tickAnim - 148) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 148) / 2) * (0-(0)));
        }
        else if (tickAnim >= 150 && tickAnim < 176) {
            xx = 0 + (((tickAnim - 150) / 26) * (0-(0)));
            yy = 0 + (((tickAnim - 150) / 26) * (0-(0)));
            zz = 0 + (((tickAnim - 150) / 26) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(lowerjawbase, lowerjawbase.rotateAngleX + (float) Math.toRadians(xx), lowerjawbase.rotateAngleY + (float) Math.toRadians(yy), lowerjawbase.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 90 && tickAnim < 99) {
            xx = 1 + (((tickAnim - 90) / 9) * (1-(1)));
            yy = 1 + (((tickAnim - 90) / 9) * (0.0325-(1)));
            zz = 1 + (((tickAnim - 90) / 9) * (1-(1)));
        }
        else if (tickAnim >= 99 && tickAnim < 108) {
            xx = 1 + (((tickAnim - 99) / 9) * (1-(1)));
            yy = 0.0325 + (((tickAnim - 99) / 9) * (1-(0.0325)));
            zz = 1 + (((tickAnim - 99) / 9) * (1-(1)));
        }
        else if (tickAnim >= 108 && tickAnim < 161) {
            xx = 1 + (((tickAnim - 108) / 53) * (1-(1)));
            yy = 1 + (((tickAnim - 108) / 53) * (1-(1)));
            zz = 1 + (((tickAnim - 108) / 53) * (1-(1)));
        }
        else if (tickAnim >= 161 && tickAnim < 167) {
            xx = 1 + (((tickAnim - 161) / 6) * (1-(1)));
            yy = 1 + (((tickAnim - 161) / 6) * (0.0325-(1)));
            zz = 1 + (((tickAnim - 161) / 6) * (1-(1)));
        }
        else if (tickAnim >= 167 && tickAnim < 171) {
            xx = 1 + (((tickAnim - 167) / 4) * (1-(1)));
            yy = 0.0325 + (((tickAnim - 167) / 4) * (1-(0.0325)));
            zz = 1 + (((tickAnim - 167) / 4) * (1-(1)));
        }
        else {
            xx = 1;
            yy = 1;
            zz = 1;
        }
        this.lefteye.setScale((float)xx, (float)yy, (float)zz);




        if (tickAnim >= 90 && tickAnim < 99) {
            xx = 1 + (((tickAnim - 90) / 9) * (1-(1)));
            yy = 1 + (((tickAnim - 90) / 9) * (0.0325-(1)));
            zz = 1 + (((tickAnim - 90) / 9) * (1-(1)));
        }
        else if (tickAnim >= 99 && tickAnim < 108) {
            xx = 1 + (((tickAnim - 99) / 9) * (1-(1)));
            yy = 0.0325 + (((tickAnim - 99) / 9) * (1-(0.0325)));
            zz = 1 + (((tickAnim - 99) / 9) * (1-(1)));
        }
        else if (tickAnim >= 108 && tickAnim < 160) {
            xx = 1 + (((tickAnim - 108) / 52) * (1-(1)));
            yy = 1 + (((tickAnim - 108) / 52) * (1-(1)));
            zz = 1 + (((tickAnim - 108) / 52) * (1-(1)));
        }
        else if (tickAnim >= 160 && tickAnim < 166) {
            xx = 1 + (((tickAnim - 160) / 6) * (1-(1)));
            yy = 1 + (((tickAnim - 160) / 6) * (0.0325-(1)));
            zz = 1 + (((tickAnim - 160) / 6) * (1-(1)));
        }
        else if (tickAnim >= 166 && tickAnim < 170) {
            xx = 1 + (((tickAnim - 166) / 4) * (1-(1)));
            yy = 0.0325 + (((tickAnim - 166) / 4) * (1-(0.0325)));
            zz = 1 + (((tickAnim - 166) / 4) * (1-(1)));
        }
        else {
            xx = 1;
            yy = 1;
            zz = 1;
        }
        this.righteye.setScale((float)xx, (float)yy, (float)zz);




        if (tickAnim >= 0 && tickAnim < 33) {
            xx = 0 + (((tickAnim - 0) / 33) * (-75.78187-(0)));
            yy = 0 + (((tickAnim - 0) / 33) * (-1.87829-(0)));
            zz = 0 + (((tickAnim - 0) / 33) * (-16.18395-(0)));
        }
        else if (tickAnim >= 33 && tickAnim < 50) {
            xx = -75.78187 + (((tickAnim - 33) / 17) * (-107.77789-(-75.78187)));
            yy = -1.87829 + (((tickAnim - 33) / 17) * (-6.76103-(-1.87829)));
            zz = -16.18395 + (((tickAnim - 33) / 17) * (-8.2322-(-16.18395)));
        }
        else if (tickAnim >= 50 && tickAnim < 60) {
            xx = -107.77789 + (((tickAnim - 50) / 10) * (-101.52789-(-107.77789)));
            yy = -6.76103 + (((tickAnim - 50) / 10) * (-6.76103-(-6.76103)));
            zz = -8.2322 + (((tickAnim - 50) / 10) * (-8.2322-(-8.2322)));
        }
        else if (tickAnim >= 60 && tickAnim < 74) {
            xx = -101.52789 + (((tickAnim - 60) / 14) * (-107.77789-(-101.52789)));
            yy = -6.76103 + (((tickAnim - 60) / 14) * (-6.76103-(-6.76103)));
            zz = -8.2322 + (((tickAnim - 60) / 14) * (-8.2322-(-8.2322)));
        }
        else if (tickAnim >= 74 && tickAnim < 100) {
            xx = -107.77789 + (((tickAnim - 74) / 26) * (-113.29431-(-107.77789)));
            yy = -6.76103 + (((tickAnim - 74) / 26) * (-11.27015-(-6.76103)));
            zz = -8.2322 + (((tickAnim - 74) / 26) * (-12.59185-(-8.2322)));
        }
        else if (tickAnim >= 100 && tickAnim < 130) {
            xx = -113.29431 + (((tickAnim - 100) / 30) * (-102.20002-(-113.29431)));
            yy = -11.27015 + (((tickAnim - 100) / 30) * (-10.48961-(-11.27015)));
            zz = -12.59185 + (((tickAnim - 100) / 30) * (-13.59962-(-12.59185)));
        }
        else if (tickAnim >= 130 && tickAnim < 150) {
            xx = -102.20002 + (((tickAnim - 130) / 20) * (-102.07659-(-102.20002)));
            yy = -10.48961 + (((tickAnim - 130) / 20) * (-9.62389-(-10.48961)));
            zz = -13.59962 + (((tickAnim - 130) / 20) * (-12.36844-(-13.59962)));
        }
        else if (tickAnim >= 150 && tickAnim < 176) {
            xx = -102.07659 + (((tickAnim - 150) / 26) * (0-(-102.07659)));
            yy = -9.62389 + (((tickAnim - 150) / 26) * (0-(-9.62389)));
            zz = -12.36844 + (((tickAnim - 150) / 26) * (0-(-12.36844)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftupperarm, leftupperarm.rotateAngleX + (float) Math.toRadians(xx), leftupperarm.rotateAngleY + (float) Math.toRadians(yy), leftupperarm.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 33) {
            xx = 0 + (((tickAnim - 0) / 33) * (-5.63362-(0)));
            yy = 0 + (((tickAnim - 0) / 33) * (-16.59824-(0)));
            zz = 0 + (((tickAnim - 0) / 33) * (-8.8365-(0)));
        }
        else if (tickAnim >= 33 && tickAnim < 50) {
            xx = -5.63362 + (((tickAnim - 33) / 17) * (9.89441-(-5.63362)));
            yy = -16.59824 + (((tickAnim - 33) / 17) * (-7.55876-(-16.59824)));
            zz = -8.8365 + (((tickAnim - 33) / 17) * (-2.62418-(-8.8365)));
        }
        else if (tickAnim >= 50 && tickAnim < 176) {
            xx = 9.89441 + (((tickAnim - 50) / 126) * (0-(9.89441)));
            yy = -7.55876 + (((tickAnim - 50) / 126) * (0-(-7.55876)));
            zz = -2.62418 + (((tickAnim - 50) / 126) * (0-(-2.62418)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftlowerarm, leftlowerarm.rotateAngleX + (float) Math.toRadians(xx), leftlowerarm.rotateAngleY + (float) Math.toRadians(yy), leftlowerarm.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 0) / 20) * (9.54058-(0)));
            yy = 0 + (((tickAnim - 0) / 20) * (1.50044-(0)));
            zz = 0 + (((tickAnim - 0) / 20) * (-14.62973-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 33) {
            xx = 9.54058 + (((tickAnim - 20) / 13) * (-4.07936-(9.54058)));
            yy = 1.50044 + (((tickAnim - 20) / 13) * (2.59863-(1.50044)));
            zz = -14.62973 + (((tickAnim - 20) / 13) * (-27.30466-(-14.62973)));
        }
        else if (tickAnim >= 33 && tickAnim < 50) {
            xx = -4.07936 + (((tickAnim - 33) / 17) * (-6.25-(-4.07936)));
            yy = 2.59863 + (((tickAnim - 33) / 17) * (0-(2.59863)));
            zz = -27.30466 + (((tickAnim - 33) / 17) * (-16-(-27.30466)));
        }
        else if (tickAnim >= 50 && tickAnim < 176) {
            xx = -6.25 + (((tickAnim - 50) / 126) * (0-(-6.25)));
            yy = 0 + (((tickAnim - 50) / 126) * (0-(0)));
            zz = -16 + (((tickAnim - 50) / 126) * (0-(-16)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(lefthand, lefthand.rotateAngleX + (float) Math.toRadians(xx), lefthand.rotateAngleY + (float) Math.toRadians(yy), lefthand.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 25) {
            xx = 0 + (((tickAnim - 0) / 25) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 25) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 25) * (18.12-(0)));
        }
        else if (tickAnim >= 25 && tickAnim < 39) {
            xx = 0 + (((tickAnim - 25) / 14) * (0-(0)));
            yy = 0 + (((tickAnim - 25) / 14) * (0-(0)));
            zz = 18.12 + (((tickAnim - 25) / 14) * (-19.1-(18.12)));
        }
        else if (tickAnim >= 39 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 39) / 11) * (0-(0)));
            yy = 0 + (((tickAnim - 39) / 11) * (0-(0)));
            zz = -19.1 + (((tickAnim - 39) / 11) * (-13.5-(-19.1)));
        }
        else if (tickAnim >= 50 && tickAnim < 176) {
            xx = 0 + (((tickAnim - 50) / 126) * (0-(0)));
            yy = 0 + (((tickAnim - 50) / 126) * (0-(0)));
            zz = -13.5 + (((tickAnim - 50) / 126) * (0-(-13.5)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftfrontfinger, leftfrontfinger.rotateAngleX + (float) Math.toRadians(xx), leftfrontfinger.rotateAngleY + (float) Math.toRadians(yy), leftfrontfinger.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 25) {
            xx = 0 + (((tickAnim - 0) / 25) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 25) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 25) * (17.86-(0)));
        }
        else if (tickAnim >= 25 && tickAnim < 39) {
            xx = 0 + (((tickAnim - 25) / 14) * (0-(0)));
            yy = 0 + (((tickAnim - 25) / 14) * (0-(0)));
            zz = 17.86 + (((tickAnim - 25) / 14) * (-31.77-(17.86)));
        }
        else if (tickAnim >= 39 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 39) / 11) * (0-(0)));
            yy = 0 + (((tickAnim - 39) / 11) * (0-(0)));
            zz = -31.77 + (((tickAnim - 39) / 11) * (-14-(-31.77)));
        }
        else if (tickAnim >= 50 && tickAnim < 176) {
            xx = 0 + (((tickAnim - 50) / 126) * (0-(0)));
            yy = 0 + (((tickAnim - 50) / 126) * (0-(0)));
            zz = -14 + (((tickAnim - 50) / 126) * (0-(-14)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftmiddlefinger, leftmiddlefinger.rotateAngleX + (float) Math.toRadians(xx), leftmiddlefinger.rotateAngleY + (float) Math.toRadians(yy), leftmiddlefinger.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 25) {
            xx = 0 + (((tickAnim - 0) / 25) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 25) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 25) * (15.55-(0)));
        }
        else if (tickAnim >= 25 && tickAnim < 39) {
            xx = 0 + (((tickAnim - 25) / 14) * (0-(0)));
            yy = 0 + (((tickAnim - 25) / 14) * (0-(0)));
            zz = 15.55 + (((tickAnim - 25) / 14) * (-25.48-(15.55)));
        }
        else if (tickAnim >= 39 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 39) / 11) * (0-(0)));
            yy = 0 + (((tickAnim - 39) / 11) * (0-(0)));
            zz = -25.48 + (((tickAnim - 39) / 11) * (5.5-(-25.48)));
        }
        else if (tickAnim >= 50 && tickAnim < 176) {
            xx = 0 + (((tickAnim - 50) / 126) * (0-(0)));
            yy = 0 + (((tickAnim - 50) / 126) * (0-(0)));
            zz = 5.5 + (((tickAnim - 50) / 126) * (0-(5.5)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftlittlefinger, leftlittlefinger.rotateAngleX + (float) Math.toRadians(xx), leftlittlefinger.rotateAngleY + (float) Math.toRadians(yy), leftlittlefinger.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 176) {
            xx = 0 + (((tickAnim - 0) / 176) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 176) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 176) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightupperarm, rightupperarm.rotateAngleX + (float) Math.toRadians(xx), rightupperarm.rotateAngleY + (float) Math.toRadians(yy), rightupperarm.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 176) {
            xx = 0 + (((tickAnim - 0) / 176) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 176) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 176) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightlowerarm, rightlowerarm.rotateAngleX + (float) Math.toRadians(xx), rightlowerarm.rotateAngleY + (float) Math.toRadians(yy), rightlowerarm.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 176) {
            xx = 0 + (((tickAnim - 0) / 176) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 176) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 176) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(righthand, righthand.rotateAngleX + (float) Math.toRadians(xx), righthand.rotateAngleY + (float) Math.toRadians(yy), righthand.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 176) {
            xx = 0 + (((tickAnim - 0) / 176) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 176) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 176) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightfrontfinger, rightfrontfinger.rotateAngleX + (float) Math.toRadians(xx), rightfrontfinger.rotateAngleY + (float) Math.toRadians(yy), rightfrontfinger.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 176) {
            xx = 0 + (((tickAnim - 0) / 176) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 176) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 176) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightmiddlefinger, rightmiddlefinger.rotateAngleX + (float) Math.toRadians(xx), rightmiddlefinger.rotateAngleY + (float) Math.toRadians(yy), rightmiddlefinger.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 176) {
            xx = 0 + (((tickAnim - 0) / 176) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 176) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 176) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightlittlefinger, rightlittlefinger.rotateAngleX + (float) Math.toRadians(xx), rightlittlefinger.rotateAngleY + (float) Math.toRadians(yy), rightlittlefinger.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 0) / 50) * (-5.5-(0)));
            yy = 0 + (((tickAnim - 0) / 50) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 50) * (0-(0)));
        }
        else if (tickAnim >= 50 && tickAnim < 60) {
            xx = -5.5 + (((tickAnim - 50) / 10) * (-5-(-5.5)));
            yy = 0 + (((tickAnim - 50) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 50) / 10) * (0-(0)));
        }
        else if (tickAnim >= 60 && tickAnim < 100) {
            xx = -5 + (((tickAnim - 60) / 40) * (1.75-(-5)));
            yy = 0 + (((tickAnim - 60) / 40) * (0-(0)));
            zz = 0 + (((tickAnim - 60) / 40) * (0-(0)));
        }
        else if (tickAnim >= 100 && tickAnim < 115) {
            xx = 1.75 + (((tickAnim - 100) / 15) * (3.75-(1.75)));
            yy = 0 + (((tickAnim - 100) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 100) / 15) * (0-(0)));
        }
        else if (tickAnim >= 115 && tickAnim < 130) {
            xx = 3.75 + (((tickAnim - 115) / 15) * (5.5-(3.75)));
            yy = 0 + (((tickAnim - 115) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 115) / 15) * (0-(0)));
        }
        else if (tickAnim >= 130 && tickAnim < 150) {
            xx = 5.5 + (((tickAnim - 130) / 20) * (1-(5.5)));
            yy = 0 + (((tickAnim - 130) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 130) / 20) * (0-(0)));
        }
        else if (tickAnim >= 150 && tickAnim < 176) {
            xx = 1 + (((tickAnim - 150) / 26) * (0-(1)));
            yy = 0 + (((tickAnim - 150) / 26) * (0-(0)));
            zz = 0 + (((tickAnim - 150) / 26) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tailbase, tailbase.rotateAngleX + (float) Math.toRadians(xx), tailbase.rotateAngleY + (float) Math.toRadians(yy), tailbase.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 0) / 50) * (-4-(0)));
            yy = 0 + (((tickAnim - 0) / 50) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 50) * (0-(0)));
        }
        else if (tickAnim >= 50 && tickAnim < 60) {
            xx = -4 + (((tickAnim - 50) / 10) * (-5-(-4)));
            yy = 0 + (((tickAnim - 50) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 50) / 10) * (0-(0)));
        }
        else if (tickAnim >= 60 && tickAnim < 100) {
            xx = -5 + (((tickAnim - 60) / 40) * (-8.75-(-5)));
            yy = 0 + (((tickAnim - 60) / 40) * (0-(0)));
            zz = 0 + (((tickAnim - 60) / 40) * (0-(0)));
        }
        else if (tickAnim >= 100 && tickAnim < 130) {
            xx = -8.75 + (((tickAnim - 100) / 30) * (-4.25-(-8.75)));
            yy = 0 + (((tickAnim - 100) / 30) * (0-(0)));
            zz = 0 + (((tickAnim - 100) / 30) * (0-(0)));
        }
        else if (tickAnim >= 130 && tickAnim < 150) {
            xx = -4.25 + (((tickAnim - 130) / 20) * (-0.5-(-4.25)));
            yy = 0 + (((tickAnim - 130) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 130) / 20) * (0-(0)));
        }
        else if (tickAnim >= 150 && tickAnim < 176) {
            xx = -0.5 + (((tickAnim - 150) / 26) * (0-(-0.5)));
            yy = 0 + (((tickAnim - 150) / 26) * (0-(0)));
            zz = 0 + (((tickAnim - 150) / 26) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tailmiddlebase, tailmiddlebase.rotateAngleX + (float) Math.toRadians(xx), tailmiddlebase.rotateAngleY + (float) Math.toRadians(yy), tailmiddlebase.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 16) {
            xx = 0 + (((tickAnim - 0) / 16) * (6.14-(0)));
            yy = 0 + (((tickAnim - 0) / 16) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 16) * (0-(0)));
        }
        else if (tickAnim >= 16 && tickAnim < 50) {
            xx = 6.14 + (((tickAnim - 16) / 34) * (9.25-(6.14)));
            yy = 0 + (((tickAnim - 16) / 34) * (0-(0)));
            zz = 0 + (((tickAnim - 16) / 34) * (0-(0)));
        }
        else if (tickAnim >= 50 && tickAnim < 60) {
            xx = 9.25 + (((tickAnim - 50) / 10) * (5.25-(9.25)));
            yy = 0 + (((tickAnim - 50) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 50) / 10) * (0-(0)));
        }
        else if (tickAnim >= 60 && tickAnim < 74) {
            xx = 5.25 + (((tickAnim - 60) / 14) * (-1.25-(5.25)));
            yy = 0 + (((tickAnim - 60) / 14) * (0-(0)));
            zz = 0 + (((tickAnim - 60) / 14) * (0-(0)));
        }
        else if (tickAnim >= 74 && tickAnim < 100) {
            xx = -1.25 + (((tickAnim - 74) / 26) * (-4.25-(-1.25)));
            yy = 0 + (((tickAnim - 74) / 26) * (0-(0)));
            zz = 0 + (((tickAnim - 74) / 26) * (0-(0)));
        }
        else if (tickAnim >= 100 && tickAnim < 130) {
            xx = -4.25 + (((tickAnim - 100) / 30) * (-6-(-4.25)));
            yy = 0 + (((tickAnim - 100) / 30) * (0-(0)));
            zz = 0 + (((tickAnim - 100) / 30) * (0-(0)));
        }
        else if (tickAnim >= 130 && tickAnim < 150) {
            xx = -6 + (((tickAnim - 130) / 20) * (1.5-(-6)));
            yy = 0 + (((tickAnim - 130) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 130) / 20) * (0-(0)));
        }
        else if (tickAnim >= 150 && tickAnim < 176) {
            xx = 1.5 + (((tickAnim - 150) / 26) * (0-(1.5)));
            yy = 0 + (((tickAnim - 150) / 26) * (0-(0)));
            zz = 0 + (((tickAnim - 150) / 26) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tailmiddleend, tailmiddleend.rotateAngleX + (float) Math.toRadians(xx), tailmiddleend.rotateAngleY + (float) Math.toRadians(yy), tailmiddleend.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 0) / 50) * (21.5-(0)));
            yy = 0 + (((tickAnim - 0) / 50) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 50) * (0-(0)));
        }
        else if (tickAnim >= 50 && tickAnim < 60) {
            xx = 21.5 + (((tickAnim - 50) / 10) * (19.75-(21.5)));
            yy = 0 + (((tickAnim - 50) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 50) / 10) * (0-(0)));
        }
        else if (tickAnim >= 60 && tickAnim < 74) {
            xx = 19.75 + (((tickAnim - 60) / 14) * (11.25-(19.75)));
            yy = 0 + (((tickAnim - 60) / 14) * (0-(0)));
            zz = 0 + (((tickAnim - 60) / 14) * (0-(0)));
        }
        else if (tickAnim >= 74 && tickAnim < 103) {
            xx = 11.25 + (((tickAnim - 74) / 29) * (6.25-(11.25)));
            yy = 0 + (((tickAnim - 74) / 29) * (0-(0)));
            zz = 0 + (((tickAnim - 74) / 29) * (0-(0)));
        }
        else if (tickAnim >= 103 && tickAnim < 150) {
            xx = 6.25 + (((tickAnim - 103) / 47) * (17.5-(6.25)));
            yy = 0 + (((tickAnim - 103) / 47) * (0-(0)));
            zz = 0 + (((tickAnim - 103) / 47) * (0-(0)));
        }
        else if (tickAnim >= 150 && tickAnim < 176) {
            xx = 17.5 + (((tickAnim - 150) / 26) * (0-(17.5)));
            yy = 0 + (((tickAnim - 150) / 26) * (0-(0)));
            zz = 0 + (((tickAnim - 150) / 26) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tailend, tailend.rotateAngleX + (float) Math.toRadians(xx), tailend.rotateAngleY + (float) Math.toRadians(yy), tailend.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 115) {
            xx = 0 + (((tickAnim - 0) / 115) * (-1-(0)));
            yy = 0 + (((tickAnim - 0) / 115) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 115) * (0-(0)));
        }
        else if (tickAnim >= 115 && tickAnim < 176) {
            xx = -1 + (((tickAnim - 115) / 61) * (0-(-1)));
            yy = 0 + (((tickAnim - 115) / 61) * (0-(0)));
            zz = 0 + (((tickAnim - 115) / 61) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tailmendfeathers2, tailmendfeathers2.rotateAngleX + (float) Math.toRadians(xx), tailmendfeathers2.rotateAngleY + (float) Math.toRadians(yy), tailmendfeathers2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 0) / 50) * (23-(0)));
            yy = 0 + (((tickAnim - 0) / 50) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 50) * (0-(0)));
        }
        else if (tickAnim >= 50 && tickAnim < 150) {
            xx = 23 + (((tickAnim - 50) / 100) * (23-(23)));
            yy = 0 + (((tickAnim - 50) / 100) * (0-(0)));
            zz = 0 + (((tickAnim - 50) / 100) * (0-(0)));
        }
        else if (tickAnim >= 150 && tickAnim < 176) {
            xx = 23 + (((tickAnim - 150) / 26) * (0-(23)));
            yy = 0 + (((tickAnim - 150) / 26) * (0-(0)));
            zz = 0 + (((tickAnim - 150) / 26) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftthigh, leftthigh.rotateAngleX + (float) Math.toRadians(xx), leftthigh.rotateAngleY + (float) Math.toRadians(yy), leftthigh.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 176) {
            xx = 0 + (((tickAnim - 0) / 176) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 176) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 176) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftshin, leftshin.rotateAngleX + (float) Math.toRadians(xx), leftshin.rotateAngleY + (float) Math.toRadians(yy), leftshin.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 0) / 50) * (37.5-(0)));
            yy = 0 + (((tickAnim - 0) / 50) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 50) * (0-(0)));
        }
        else if (tickAnim >= 50 && tickAnim < 150) {
            xx = 37.5 + (((tickAnim - 50) / 100) * (37.5-(37.5)));
            yy = 0 + (((tickAnim - 50) / 100) * (0-(0)));
            zz = 0 + (((tickAnim - 50) / 100) * (0-(0)));
        }
        else if (tickAnim >= 150 && tickAnim < 176) {
            xx = 37.5 + (((tickAnim - 150) / 26) * (0-(37.5)));
            yy = 0 + (((tickAnim - 150) / 26) * (0-(0)));
            zz = 0 + (((tickAnim - 150) / 26) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftankle, leftankle.rotateAngleX + (float) Math.toRadians(xx), leftankle.rotateAngleY + (float) Math.toRadians(yy), leftankle.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 176) {
            xx = 0 + (((tickAnim - 0) / 176) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 176) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 176) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftfoot, leftfoot.rotateAngleX + (float) Math.toRadians(xx), leftfoot.rotateAngleY + (float) Math.toRadians(yy), leftfoot.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 0) / 50) * (-51.25-(0)));
            yy = 0 + (((tickAnim - 0) / 50) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 50) * (0-(0)));
        }
        else if (tickAnim >= 50 && tickAnim < 150) {
            xx = -51.25 + (((tickAnim - 50) / 100) * (-51.25-(-51.25)));
            yy = 0 + (((tickAnim - 50) / 100) * (0-(0)));
            zz = 0 + (((tickAnim - 50) / 100) * (0-(0)));
        }
        else if (tickAnim >= 150 && tickAnim < 176) {
            xx = -51.25 + (((tickAnim - 150) / 26) * (0-(-51.25)));
            yy = 0 + (((tickAnim - 150) / 26) * (0-(0)));
            zz = 0 + (((tickAnim - 150) / 26) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(lefttoes, lefttoes.rotateAngleX + (float) Math.toRadians(xx), lefttoes.rotateAngleY + (float) Math.toRadians(yy), lefttoes.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 0) / 20) * (-19.25-(0)));
            yy = 0 + (((tickAnim - 0) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 20) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 50) {
            xx = -19.25 + (((tickAnim - 20) / 30) * (-11.75-(-19.25)));
            yy = 0 + (((tickAnim - 20) / 30) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 30) * (0-(0)));
        }
        else if (tickAnim >= 50 && tickAnim < 150) {
            xx = -11.75 + (((tickAnim - 50) / 100) * (-11.75-(-11.75)));
            yy = 0 + (((tickAnim - 50) / 100) * (0-(0)));
            zz = 0 + (((tickAnim - 50) / 100) * (0-(0)));
        }
        else if (tickAnim >= 150 && tickAnim < 176) {
            xx = -11.75 + (((tickAnim - 150) / 26) * (0-(-11.75)));
            yy = 0 + (((tickAnim - 150) / 26) * (0-(0)));
            zz = 0 + (((tickAnim - 150) / 26) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightthigh, rightthigh.rotateAngleX + (float) Math.toRadians(xx), rightthigh.rotateAngleY + (float) Math.toRadians(yy), rightthigh.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 0) / 20) * (-16.5-(0)));
            yy = 0 + (((tickAnim - 0) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 20) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 50) {
            xx = -16.5 + (((tickAnim - 20) / 30) * (0.5-(-16.5)));
            yy = 0 + (((tickAnim - 20) / 30) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 30) * (0-(0)));
        }
        else if (tickAnim >= 50 && tickAnim < 150) {
            xx = 0.5 + (((tickAnim - 50) / 100) * (0.5-(0.5)));
            yy = 0 + (((tickAnim - 50) / 100) * (0-(0)));
            zz = 0 + (((tickAnim - 50) / 100) * (0-(0)));
        }
        else if (tickAnim >= 150 && tickAnim < 176) {
            xx = 0.5 + (((tickAnim - 150) / 26) * (0-(0.5)));
            yy = 0 + (((tickAnim - 150) / 26) * (0-(0)));
            zz = 0 + (((tickAnim - 150) / 26) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightshin, rightshin.rotateAngleX + (float) Math.toRadians(xx), rightshin.rotateAngleY + (float) Math.toRadians(yy), rightshin.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 4) {
            xx = 0 + (((tickAnim - 0) / 4) * (-41.83-(0)));
            yy = 0 + (((tickAnim - 0) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 4) * (0-(0)));
        }
        else if (tickAnim >= 4 && tickAnim < 10) {
            xx = -41.83 + (((tickAnim - 4) / 6) * (-41.83-(-41.83)));
            yy = 0 + (((tickAnim - 4) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 4) / 6) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 20) {
            xx = -41.83 + (((tickAnim - 10) / 10) * (33.75-(-41.83)));
            yy = 0 + (((tickAnim - 10) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 10) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 50) {
            xx = 33.75 + (((tickAnim - 20) / 30) * (22.25-(33.75)));
            yy = 0 + (((tickAnim - 20) / 30) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 30) * (0-(0)));
        }
        else if (tickAnim >= 50 && tickAnim < 150) {
            xx = 22.25 + (((tickAnim - 50) / 100) * (22.25-(22.25)));
            yy = 0 + (((tickAnim - 50) / 100) * (0-(0)));
            zz = 0 + (((tickAnim - 50) / 100) * (0-(0)));
        }
        else if (tickAnim >= 150 && tickAnim < 163) {
            xx = 22.25 + (((tickAnim - 150) / 13) * (-34.07-(22.25)));
            yy = 0 + (((tickAnim - 150) / 13) * (0-(0)));
            zz = 0 + (((tickAnim - 150) / 13) * (0-(0)));
        }
        else if (tickAnim >= 163 && tickAnim < 176) {
            xx = -34.07 + (((tickAnim - 163) / 13) * (0-(-34.07)));
            yy = 0 + (((tickAnim - 163) / 13) * (0-(0)));
            zz = 0 + (((tickAnim - 163) / 13) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightankle, rightankle.rotateAngleX + (float) Math.toRadians(xx), rightankle.rotateAngleY + (float) Math.toRadians(yy), rightankle.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 4) {
            xx = 0 + (((tickAnim - 0) / 4) * (76.11-(0)));
            yy = 0 + (((tickAnim - 0) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 4) * (0-(0)));
        }
        else if (tickAnim >= 4 && tickAnim < 10) {
            xx = 76.11 + (((tickAnim - 4) / 6) * (76.11-(76.11)));
            yy = 0 + (((tickAnim - 4) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 4) / 6) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 20) {
            xx = 76.11 + (((tickAnim - 10) / 10) * (4-(76.11)));
            yy = 0 + (((tickAnim - 10) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 10) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 27) {
            xx = 4 + (((tickAnim - 20) / 7) * (2.34-(4)));
            yy = 0 + (((tickAnim - 20) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 7) * (0-(0)));
        }
        else if (tickAnim >= 27 && tickAnim < 50) {
            xx = 2.34 + (((tickAnim - 27) / 23) * (-1.75-(2.34)));
            yy = 0 + (((tickAnim - 27) / 23) * (0-(0)));
            zz = 0 + (((tickAnim - 27) / 23) * (0-(0)));
        }
        else if (tickAnim >= 50 && tickAnim < 150) {
            xx = -1.75 + (((tickAnim - 50) / 100) * (-1.75-(-1.75)));
            yy = 0 + (((tickAnim - 50) / 100) * (0-(0)));
            zz = 0 + (((tickAnim - 50) / 100) * (0-(0)));
        }
        else if (tickAnim >= 150 && tickAnim < 163) {
            xx = -1.75 + (((tickAnim - 150) / 13) * (70.51-(-1.75)));
            yy = 0 + (((tickAnim - 150) / 13) * (0-(0)));
            zz = 0 + (((tickAnim - 150) / 13) * (0-(0)));
        }
        else if (tickAnim >= 163 && tickAnim < 176) {
            xx = 70.51 + (((tickAnim - 163) / 13) * (0-(70.51)));
            yy = 0 + (((tickAnim - 163) / 13) * (0-(0)));
            zz = 0 + (((tickAnim - 163) / 13) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightfoot, rightfoot.rotateAngleX + (float) Math.toRadians(xx), rightfoot.rotateAngleY + (float) Math.toRadians(yy), rightfoot.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 4) {
            xx = 0 + (((tickAnim - 0) / 4) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 4) * (-0.65-(0)));
        }
        else if (tickAnim >= 4 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 4) / 6) * (0-(0)));
            yy = 0 + (((tickAnim - 4) / 6) * (0-(0)));
            zz = -0.65 + (((tickAnim - 4) / 6) * (-0.65-(-0.65)));
        }
        else if (tickAnim >= 10 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 10) / 40) * (0-(0)));
            yy = 0 + (((tickAnim - 10) / 40) * (0-(0)));
            zz = -0.65 + (((tickAnim - 10) / 40) * (0-(-0.65)));
        }
        else if (tickAnim >= 50 && tickAnim < 150) {
            xx = 0 + (((tickAnim - 50) / 100) * (0-(0)));
            yy = 0 + (((tickAnim - 50) / 100) * (0-(0)));
            zz = 0 + (((tickAnim - 50) / 100) * (0-(0)));
        }
        else if (tickAnim >= 150 && tickAnim < 163) {
            xx = 0 + (((tickAnim - 150) / 13) * (0-(0)));
            yy = 0 + (((tickAnim - 150) / 13) * (0.725-(0)));
            zz = 0 + (((tickAnim - 150) / 13) * (-0.525-(0)));
        }
        else if (tickAnim >= 163 && tickAnim < 176) {
            xx = 0 + (((tickAnim - 163) / 13) * (0-(0)));
            yy = 0.725 + (((tickAnim - 163) / 13) * (0-(0.725)));
            zz = -0.525 + (((tickAnim - 163) / 13) * (0-(-0.525)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.rightfoot.rotationPointX = this.rightfoot.rotationPointX + (float)(xx);
        this.rightfoot.rotationPointY = this.rightfoot.rotationPointY - (float)(yy);
        this.rightfoot.rotationPointZ = this.rightfoot.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 176) {
            xx = 0 + (((tickAnim - 0) / 176) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 176) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 176) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(righttoes, righttoes.rotateAngleX + (float) Math.toRadians(xx), righttoes.rotateAngleY + (float) Math.toRadians(yy), righttoes.rotateAngleZ + (float) Math.toRadians(zz));

    }
    public void animEat(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime, double animTick) {
        EntityPrehistoricFloraFalcarius entity = (EntityPrehistoricFloraFalcarius) entitylivingbaseIn;
        int animCycle = 25;
        double tickAnim = animTick + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;
         if (tickAnim >= 0 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 0) / 13) * (11.25-(0)));
            yy = 0 + (((tickAnim - 0) / 13) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 13) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 15) {
            xx = 11.25 + (((tickAnim - 13) / 2) * (11.25-(11.25)));
            yy = 0 + (((tickAnim - 13) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 13) / 2) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 25) {
            xx = 11.25 + (((tickAnim - 15) / 10) * (0-(11.25)));
            yy = 0 + (((tickAnim - 15) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 10) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(bodymiddle, bodymiddle.rotateAngleX + (float) Math.toRadians(xx), bodymiddle.rotateAngleY + (float) Math.toRadians(yy), bodymiddle.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 0) / 13) * (13.75-(0)));
            yy = 0 + (((tickAnim - 0) / 13) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 13) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 15) {
            xx = 13.75 + (((tickAnim - 13) / 2) * (13-(13.75)));
            yy = 0 + (((tickAnim - 13) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 13) / 2) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 25) {
            xx = 13 + (((tickAnim - 15) / 10) * (0-(13)));
            yy = 0 + (((tickAnim - 15) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 10) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(bodyfront, bodyfront.rotateAngleX + (float) Math.toRadians(xx), bodyfront.rotateAngleY + (float) Math.toRadians(yy), bodyfront.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 0) / 13) * (24.5-(0)));
            yy = 0 + (((tickAnim - 0) / 13) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 13) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 15) {
            xx = 24.5 + (((tickAnim - 13) / 2) * (24-(24.5)));
            yy = 0 + (((tickAnim - 13) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 13) / 2) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 25) {
            xx = 24 + (((tickAnim - 15) / 10) * (0-(24)));
            yy = 0 + (((tickAnim - 15) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 10) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neckbase, neckbase.rotateAngleX + (float) Math.toRadians(xx), neckbase.rotateAngleY + (float) Math.toRadians(yy), neckbase.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 0) / 13) * (23-(0)));
            yy = 0 + (((tickAnim - 0) / 13) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 13) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 15) {
            xx = 23 + (((tickAnim - 13) / 2) * (21.75-(23)));
            yy = 0 + (((tickAnim - 13) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 13) / 2) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 25) {
            xx = 21.75 + (((tickAnim - 15) / 10) * (0-(21.75)));
            yy = 0 + (((tickAnim - 15) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 10) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neckmiddlebase, neckmiddlebase.rotateAngleX + (float) Math.toRadians(xx), neckmiddlebase.rotateAngleY + (float) Math.toRadians(yy), neckmiddlebase.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 0) / 13) * (19.5-(0)));
            yy = 0 + (((tickAnim - 0) / 13) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 13) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 15) {
            xx = 19.5 + (((tickAnim - 13) / 2) * (22.5-(19.5)));
            yy = 0 + (((tickAnim - 13) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 13) / 2) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 25) {
            xx = 22.5 + (((tickAnim - 15) / 10) * (0-(22.5)));
            yy = 0 + (((tickAnim - 15) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 10) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neckmiddlefront, neckmiddlefront.rotateAngleX + (float) Math.toRadians(xx), neckmiddlefront.rotateAngleY + (float) Math.toRadians(yy), neckmiddlefront.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 0) / 13) * (11-(0)));
            yy = 0 + (((tickAnim - 0) / 13) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 13) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 15) {
            xx = 11 + (((tickAnim - 13) / 2) * (11-(11)));
            yy = 0 + (((tickAnim - 13) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 13) / 2) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 25) {
            xx = 11 + (((tickAnim - 15) / 10) * (0-(11)));
            yy = 0 + (((tickAnim - 15) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 10) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neckfront, neckfront.rotateAngleX + (float) Math.toRadians(xx), neckfront.rotateAngleY + (float) Math.toRadians(yy), neckfront.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 0) / 13) * (-26.75-(0)));
            yy = 0 + (((tickAnim - 0) / 13) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 13) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 15) {
            xx = -26.75 + (((tickAnim - 13) / 2) * (-26.75-(-26.75)));
            yy = 0 + (((tickAnim - 13) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 13) / 2) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 25) {
            xx = -26.75 + (((tickAnim - 15) / 10) * (0-(-26.75)));
            yy = 0 + (((tickAnim - 15) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 10) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(head, head.rotateAngleX + (float) Math.toRadians(xx), head.rotateAngleY + (float) Math.toRadians(yy), head.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 10) / 3) * (23.75-(0)));
            yy = 0 + (((tickAnim - 10) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 3) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 15) {
            xx = 23.75 + (((tickAnim - 13) / 2) * (0-(23.75)));
            yy = 0 + (((tickAnim - 13) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 13) / 2) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(lowerjawbase, lowerjawbase.rotateAngleX + (float) Math.toRadians(xx), lowerjawbase.rotateAngleY + (float) Math.toRadians(yy), lowerjawbase.rotateAngleZ + (float) Math.toRadians(zz));

    }
    public void animAttack(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime, double animTick) {
        EntityPrehistoricFloraFalcarius entity = (EntityPrehistoricFloraFalcarius) entitylivingbaseIn;
        int animCycle = 15;
        double tickAnim = animTick + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;
         if (tickAnim >= 0 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 0) / 8) * (-11.75-(0)));
            yy = 0 + (((tickAnim - 0) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 8) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 15) {
            xx = -11.75 + (((tickAnim - 8) / 7) * (0-(-11.75)));
            yy = 0 + (((tickAnim - 8) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 7) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(bodyfront, bodyfront.rotateAngleX + (float) Math.toRadians(xx), bodyfront.rotateAngleY + (float) Math.toRadians(yy), bodyfront.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 0) / 8) * (-14-(0)));
            yy = 0 + (((tickAnim - 0) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 8) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 15) {
            xx = -14 + (((tickAnim - 8) / 7) * (0-(-14)));
            yy = 0 + (((tickAnim - 8) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 7) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neckbase, neckbase.rotateAngleX + (float) Math.toRadians(xx), neckbase.rotateAngleY + (float) Math.toRadians(yy), neckbase.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 0) / 8) * (-14.25-(0)));
            yy = 0 + (((tickAnim - 0) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 8) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 15) {
            xx = -14.25 + (((tickAnim - 8) / 7) * (0-(-14.25)));
            yy = 0 + (((tickAnim - 8) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 7) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neckmiddlebase, neckmiddlebase.rotateAngleX + (float) Math.toRadians(xx), neckmiddlebase.rotateAngleY + (float) Math.toRadians(yy), neckmiddlebase.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 0) / 8) * (17-(0)));
            yy = 0 + (((tickAnim - 0) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 8) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 15) {
            xx = 17 + (((tickAnim - 8) / 7) * (0-(17)));
            yy = 0 + (((tickAnim - 8) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 7) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neckmiddlefront, neckmiddlefront.rotateAngleX + (float) Math.toRadians(xx), neckmiddlefront.rotateAngleY + (float) Math.toRadians(yy), neckmiddlefront.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 0) / 8) * (16.25-(0)));
            yy = 0 + (((tickAnim - 0) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 8) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 15) {
            xx = 16.25 + (((tickAnim - 8) / 7) * (0-(16.25)));
            yy = 0 + (((tickAnim - 8) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 7) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neckfront, neckfront.rotateAngleX + (float) Math.toRadians(xx), neckfront.rotateAngleY + (float) Math.toRadians(yy), neckfront.rotateAngleZ + (float) Math.toRadians(zz));



        this.setRotateAngle(head, head.rotateAngleX + (float) Math.toRadians(0), head.rotateAngleY + (float) Math.toRadians(0), head.rotateAngleZ + (float) Math.toRadians(0));



        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 0 + (((tickAnim - 0) / 3) * (-58.23967-(0)));
            yy = 0 + (((tickAnim - 0) / 3) * (-44.147-(0)));
            zz = 0 + (((tickAnim - 0) / 3) * (-31.03368-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 8) {
            xx = -58.23967 + (((tickAnim - 3) / 5) * (-76.91431-(-58.23967)));
            yy = -44.147 + (((tickAnim - 3) / 5) * (13.41866-(-44.147)));
            zz = -31.03368 + (((tickAnim - 3) / 5) * (11.30956-(-31.03368)));
        }
        else if (tickAnim >= 8 && tickAnim < 15) {
            xx = -76.91431 + (((tickAnim - 8) / 7) * (0-(-76.91431)));
            yy = 13.41866 + (((tickAnim - 8) / 7) * (0-(13.41866)));
            zz = 11.30956 + (((tickAnim - 8) / 7) * (0-(11.30956)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftupperarm, leftupperarm.rotateAngleX + (float) Math.toRadians(xx), leftupperarm.rotateAngleY + (float) Math.toRadians(yy), leftupperarm.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 0 + (((tickAnim - 0) / 3) * (-7.3056-(0)));
            yy = 0 + (((tickAnim - 0) / 3) * (-18.77351-(0)));
            zz = 0 + (((tickAnim - 0) / 3) * (-12.10856-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 8) {
            xx = -7.3056 + (((tickAnim - 3) / 5) * (-3.02249-(-7.3056)));
            yy = -18.77351 + (((tickAnim - 3) / 5) * (10.83904-(-18.77351)));
            zz = -12.10856 + (((tickAnim - 3) / 5) * (-0.01029-(-12.10856)));
        }
        else if (tickAnim >= 8 && tickAnim < 15) {
            xx = -3.02249 + (((tickAnim - 8) / 7) * (0-(-3.02249)));
            yy = 10.83904 + (((tickAnim - 8) / 7) * (0-(10.83904)));
            zz = -0.01029 + (((tickAnim - 8) / 7) * (0-(-0.01029)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftlowerarm, leftlowerarm.rotateAngleX + (float) Math.toRadians(xx), leftlowerarm.rotateAngleY + (float) Math.toRadians(yy), leftlowerarm.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 3) * (-24.5-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 6) {
            xx = 0 + (((tickAnim - 3) / 3) * (0-(0)));
            yy = 0 + (((tickAnim - 3) / 3) * (0-(0)));
            zz = -24.5 + (((tickAnim - 3) / 3) * (-31.75-(-24.5)));
        }
        else if (tickAnim >= 6 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 6) / 2) * (0-(0)));
            yy = 0 + (((tickAnim - 6) / 2) * (0-(0)));
            zz = -31.75 + (((tickAnim - 6) / 2) * (0-(-31.75)));
        }
        else if (tickAnim >= 8 && tickAnim < 12) {
            xx = 0 + (((tickAnim - 8) / 4) * (0-(0)));
            yy = 0 + (((tickAnim - 8) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 4) * (23.5-(0)));
        }
        else if (tickAnim >= 12 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 12) / 3) * (0-(0)));
            yy = 0 + (((tickAnim - 12) / 3) * (0-(0)));
            zz = 23.5 + (((tickAnim - 12) / 3) * (0-(23.5)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(lefthand, lefthand.rotateAngleX + (float) Math.toRadians(xx), lefthand.rotateAngleY + (float) Math.toRadians(yy), lefthand.rotateAngleZ + (float) Math.toRadians(zz));

    }
    public void animWalking(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime) {
        EntityPrehistoricFloraFalcarius entity = (EntityPrehistoricFloraFalcarius) entitylivingbaseIn;
        int animCycle = 23;
        double tickAnim = (entity.ticksExisted + entity.getTickOffset()) - (int) (Math.floor((double) (entity.ticksExisted + entity.getTickOffset()) / (double) animCycle) * (double) animCycle) + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;
        this.setRotateAngle(hips, hips.rotateAngleX + (float) Math.toRadians(-1.25+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*250/0.405+50))*2), hips.rotateAngleY + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*200/0.649))*-1), hips.rotateAngleZ + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*200/0.649-30))*1.8));
        this.hips.rotationPointX = this.hips.rotationPointX + (float)(0);
        this.hips.rotationPointY = this.hips.rotationPointY - (float)(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*250/0.405))*-0.35);
        this.hips.rotationPointZ = this.hips.rotationPointZ + (float)(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*250/0.405-50))*0.5);
        this.setRotateAngle(bodymiddle, bodymiddle.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*250/0.405+130))*-2.5), bodymiddle.rotateAngleY + (float) Math.toRadians(0), bodymiddle.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*200/0.649-100))*1.8));
        this.setRotateAngle(bodyfront, bodyfront.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*250/0.405+170))*2), bodyfront.rotateAngleY + (float) Math.toRadians(0), bodyfront.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*200/0.649-180))*1.8));
        this.setRotateAngle(neckbase, neckbase.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*250/0.405+230))*2), neckbase.rotateAngleY + (float) Math.toRadians(0), neckbase.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*200/0.649-180))*1.8));
        this.setRotateAngle(neckmiddlebase, neckmiddlebase.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*250/0.405-300))*-2.5), neckmiddlebase.rotateAngleY + (float) Math.toRadians(0), neckmiddlebase.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*200/0.649-230))*1.8));
        this.setRotateAngle(neckmiddlefront, neckmiddlefront.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*250/0.405-360))*3), neckmiddlefront.rotateAngleY + (float) Math.toRadians(0), neckmiddlefront.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*200/0.649-320))*1.8));
        this.setRotateAngle(neckfront, neckfront.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*250/0.405+430))*3.5), neckfront.rotateAngleY + (float) Math.toRadians(0), neckfront.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*200/0.649-360))*1.8));
        this.setRotateAngle(head, head.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*250/0.405+480))*4), head.rotateAngleY + (float) Math.toRadians(0), head.rotateAngleZ + (float) Math.toRadians(0));
        this.head.rotationPointX = this.head.rotationPointX + (float)(0);
        this.head.rotationPointY = this.head.rotationPointY - (float)(0.025);
        this.head.rotationPointZ = this.head.rotationPointZ + (float)(-0.225);
        this.setRotateAngle(leftupperarm, leftupperarm.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*250/0.405+280))*2), leftupperarm.rotateAngleY + (float) Math.toRadians(0), leftupperarm.rotateAngleZ + (float) Math.toRadians(0));
        this.setRotateAngle(leftlowerarm, leftlowerarm.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*250/0.405+340))*-3), leftlowerarm.rotateAngleY + (float) Math.toRadians(0), leftlowerarm.rotateAngleZ + (float) Math.toRadians(0));
        this.setRotateAngle(lefthand, lefthand.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*250/0.405-420))*-5), lefthand.rotateAngleY + (float) Math.toRadians(0), lefthand.rotateAngleZ + (float) Math.toRadians(0));
        this.setRotateAngle(rightupperarm, rightupperarm.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*250/0.405+280))*2), rightupperarm.rotateAngleY + (float) Math.toRadians(0), rightupperarm.rotateAngleZ + (float) Math.toRadians(0));
        this.setRotateAngle(rightlowerarm, rightlowerarm.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*250/0.405+340))*-3), rightlowerarm.rotateAngleY + (float) Math.toRadians(0), rightlowerarm.rotateAngleZ + (float) Math.toRadians(0));
        this.setRotateAngle(righthand, righthand.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*250/0.405-420))*-5), righthand.rotateAngleY + (float) Math.toRadians(0), righthand.rotateAngleZ + (float) Math.toRadians(0));
        this.setRotateAngle(tailbase, tailbase.rotateAngleX + (float) Math.toRadians(-1.25+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*250/0.405+50))*0.5), tailbase.rotateAngleY + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*200/0.649+60))*-1), tailbase.rotateAngleZ + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*200/0.649-30))*1));
        this.setRotateAngle(tailmiddlebase, tailmiddlebase.rotateAngleX + (float) Math.toRadians(-1.25+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*250/0.405+50))*0.5), tailmiddlebase.rotateAngleY + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*200/0.649+100))*6), tailmiddlebase.rotateAngleZ + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*200/0.649-30))*1));
        this.setRotateAngle(tailmiddleend, tailmiddleend.rotateAngleX + (float) Math.toRadians(-1.25+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*250/0.405+50))*0.5), tailmiddleend.rotateAngleY + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*200/0.649+220))*-7), tailmiddleend.rotateAngleZ + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*200/0.649-30))*1));
        this.setRotateAngle(tailend, tailend.rotateAngleX + (float) Math.toRadians(-1.25+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*250/0.405+50))*0.5), tailend.rotateAngleY + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*200/0.649+190))*-10), tailend.rotateAngleZ + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*200/0.649-30))*1));
        if (tickAnim >= 0 && tickAnim < 8) {
            xx = 23.81393 + (((tickAnim - 0) / 8) * (-4.41314-(23.81393)));
            yy = -7.16977 + (((tickAnim - 0) / 8) * (-6.91561-(-7.16977)));
            zz = 0.61642 + (((tickAnim - 0) / 8) * (-1.50248-(0.61642)));
        }
        else if (tickAnim >= 8 && tickAnim < 13) {
            xx = -4.41314 + (((tickAnim - 8) / 5) * (-14.9202-(-4.41314)));
            yy = -6.91561 + (((tickAnim - 8) / 5) * (1.99242-(-6.91561)));
            zz = -1.50248 + (((tickAnim - 8) / 5) * (4.5868-(-1.50248)));
        }
        else if (tickAnim >= 13 && tickAnim < 23) {
            xx = -14.9202 + (((tickAnim - 13) / 10) * (23.81393-(-14.9202)));
            yy = 1.99242 + (((tickAnim - 13) / 10) * (-7.16977-(1.99242)));
            zz = 4.5868 + (((tickAnim - 13) / 10) * (0.61642-(4.5868)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftthigh, leftthigh.rotateAngleX + (float) Math.toRadians(xx), leftthigh.rotateAngleY + (float) Math.toRadians(yy), leftthigh.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 17 + (((tickAnim - 0) / 3) * (40.1-(17)));
            yy = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 3) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 10) {
            xx = 40.1 + (((tickAnim - 3) / 7) * (-8.77595-(40.1)));
            yy = 0 + (((tickAnim - 3) / 7) * (1.29632-(0)));
            zz = 0 + (((tickAnim - 3) / 7) * (0.05809-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 13) {
            xx = -8.77595 + (((tickAnim - 10) / 3) * (-25-(-8.77595)));
            yy = 1.29632 + (((tickAnim - 10) / 3) * (0-(1.29632)));
            zz = 0.05809 + (((tickAnim - 10) / 3) * (0-(0.05809)));
        }
        else if (tickAnim >= 13 && tickAnim < 17) {
            xx = -25 + (((tickAnim - 13) / 4) * (-8.95339-(-25)));
            yy = 0 + (((tickAnim - 13) / 4) * (-2.79408-(0)));
            zz = 0 + (((tickAnim - 13) / 4) * (4.29559-(0)));
        }
        else if (tickAnim >= 17 && tickAnim < 23) {
            xx = -8.95339 + (((tickAnim - 17) / 6) * (17-(-8.95339)));
            yy = -2.79408 + (((tickAnim - 17) / 6) * (0-(-2.79408)));
            zz = 4.29559 + (((tickAnim - 17) / 6) * (0-(4.29559)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftshin, leftshin.rotateAngleX + (float) Math.toRadians(xx), leftshin.rotateAngleY + (float) Math.toRadians(yy), leftshin.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 3) * (-0.25-(0)));
            zz = 0 + (((tickAnim - 0) / 3) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 3) / 10) * (0-(0)));
            yy = -0.25 + (((tickAnim - 3) / 10) * (0-(-0.25)));
            zz = 0 + (((tickAnim - 3) / 10) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 23) {
            xx = 0 + (((tickAnim - 13) / 10) * (0-(0)));
            yy = 0 + (((tickAnim - 13) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 13) / 10) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.leftshin.rotationPointX = this.leftshin.rotationPointX + (float)(xx);
        this.leftshin.rotationPointY = this.leftshin.rotationPointY - (float)(yy);
        this.leftshin.rotationPointZ = this.leftshin.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 7) {
            xx = 0.75 + (((tickAnim - 0) / 7) * (-43.33-(0.75)));
            yy = 0 + (((tickAnim - 0) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 7) * (0-(0)));
        }
        else if (tickAnim >= 7 && tickAnim < 10) {
            xx = -43.33 + (((tickAnim - 7) / 3) * (-43.33-(-43.33)));
            yy = 0 + (((tickAnim - 7) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 7) / 3) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 13) {
            xx = -43.33 + (((tickAnim - 10) / 3) * (17-(-43.33)));
            yy = 0 + (((tickAnim - 10) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 3) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 17) {
            xx = 17 + (((tickAnim - 13) / 4) * (18.9737-(17)));
            yy = 0 + (((tickAnim - 13) / 4) * (-1.03375-(0)));
            zz = 0 + (((tickAnim - 13) / 4) * (-2.06059-(0)));
        }
        else if (tickAnim >= 17 && tickAnim < 23) {
            xx = 18.9737 + (((tickAnim - 17) / 6) * (0.75-(18.9737)));
            yy = -1.03375 + (((tickAnim - 17) / 6) * (0-(-1.03375)));
            zz = -2.06059 + (((tickAnim - 17) / 6) * (0-(-2.06059)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftankle, leftankle.rotateAngleX + (float) Math.toRadians(xx), leftankle.rotateAngleY + (float) Math.toRadians(yy), leftankle.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 67 + (((tickAnim - 0) / 3) * (60.95-(67)));
            yy = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 3) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 7) {
            xx = 60.95 + (((tickAnim - 3) / 4) * (75.64-(60.95)));
            yy = 0 + (((tickAnim - 3) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 3) / 4) * (0-(0)));
        }
        else if (tickAnim >= 7 && tickAnim < 10) {
            xx = 75.64 + (((tickAnim - 7) / 3) * (75.64-(75.64)));
            yy = 0 + (((tickAnim - 7) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 7) / 3) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 13) {
            xx = 75.64 + (((tickAnim - 10) / 3) * (22.9068-(75.64)));
            yy = 0 + (((tickAnim - 10) / 3) * (0.23608-(0)));
            zz = 0 + (((tickAnim - 10) / 3) * (-4.44381-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 17) {
            xx = 22.9068 + (((tickAnim - 13) / 4) * (-9.9795-(22.9068)));
            yy = 0.23608 + (((tickAnim - 13) / 4) * (4.49266-(0.23608)));
            zz = -4.44381 + (((tickAnim - 13) / 4) * (-5.6193-(-4.44381)));
        }
        else if (tickAnim >= 17 && tickAnim < 20) {
            xx = -9.9795 + (((tickAnim - 17) / 3) * (48.26025-(-9.9795)));
            yy = 4.49266 + (((tickAnim - 17) / 3) * (2.24633-(4.49266)));
            zz = -5.6193 + (((tickAnim - 17) / 3) * (-2.80965-(-5.6193)));
        }
        else if (tickAnim >= 20 && tickAnim < 23) {
            xx = 48.26025 + (((tickAnim - 20) / 3) * (67-(48.26025)));
            yy = 2.24633 + (((tickAnim - 20) / 3) * (0-(2.24633)));
            zz = -2.80965 + (((tickAnim - 20) / 3) * (0-(-2.80965)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftfoot, leftfoot.rotateAngleX + (float) Math.toRadians(xx), leftfoot.rotateAngleY + (float) Math.toRadians(yy), leftfoot.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 7) {
            xx = 0 + (((tickAnim - 0) / 7) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 7) * (1.15-(0)));
            zz = -0.55 + (((tickAnim - 0) / 7) * (-0.26-(-0.55)));
        }
        else if (tickAnim >= 7 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 7) / 3) * (0-(0)));
            yy = 1.15 + (((tickAnim - 7) / 3) * (1.15-(1.15)));
            zz = -0.26 + (((tickAnim - 7) / 3) * (-0.26-(-0.26)));
        }
        else if (tickAnim >= 10 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 10) / 3) * (0-(0)));
            yy = 1.15 + (((tickAnim - 10) / 3) * (0-(1.15)));
            zz = -0.26 + (((tickAnim - 10) / 3) * (0-(-0.26)));
        }
        else if (tickAnim >= 13 && tickAnim < 14) {
            xx = 0 + (((tickAnim - 13) / 1) * (0-(0)));
            yy = 0 + (((tickAnim - 13) / 1) * (1.18-(0)));
            zz = 0 + (((tickAnim - 13) / 1) * (0-(0)));
        }
        else if (tickAnim >= 14 && tickAnim < 17) {
            xx = 0 + (((tickAnim - 14) / 3) * (0-(0)));
            yy = 1.18 + (((tickAnim - 14) / 3) * (0.825-(1.18)));
            zz = 0 + (((tickAnim - 14) / 3) * (0-(0)));
        }
        else if (tickAnim >= 17 && tickAnim < 23) {
            xx = 0 + (((tickAnim - 17) / 6) * (0-(0)));
            yy = 0.825 + (((tickAnim - 17) / 6) * (0-(0.825)));
            zz = 0 + (((tickAnim - 17) / 6) * (-0.55-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.leftfoot.rotationPointX = this.leftfoot.rotationPointX + (float)(xx);
        this.leftfoot.rotationPointY = this.leftfoot.rotationPointY - (float)(yy);
        this.leftfoot.rotationPointZ = this.leftfoot.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 3) {
            xx = -39.5 + (((tickAnim - 0) / 3) * (34.4-(-39.5)));
            yy = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 3) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 7) {
            xx = 34.4 + (((tickAnim - 3) / 4) * (0-(34.4)));
            yy = 0 + (((tickAnim - 3) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 3) / 4) * (0-(0)));
        }
        else if (tickAnim >= 7 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 7) / 3) * (0-(0)));
            yy = 0 + (((tickAnim - 7) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 7) / 3) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 10) / 3) * (0-(0)));
            yy = 0 + (((tickAnim - 10) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 3) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 17) {
            xx = 0 + (((tickAnim - 13) / 4) * (0-(0)));
            yy = 0 + (((tickAnim - 13) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 13) / 4) * (0-(0)));
        }
        else if (tickAnim >= 17 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 17) / 3) * (-53.46-(0)));
            yy = 0 + (((tickAnim - 17) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 17) / 3) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 23) {
            xx = -53.46 + (((tickAnim - 20) / 3) * (-39.5-(-53.46)));
            yy = 0 + (((tickAnim - 20) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 3) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(lefttoes, lefttoes.rotateAngleX + (float) Math.toRadians(xx), lefttoes.rotateAngleY + (float) Math.toRadians(yy), lefttoes.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 13) {
            xx = -14.9202 + (((tickAnim - 0) / 13) * (23.81393-(-14.9202)));
            yy = -1.9924 + (((tickAnim - 0) / 13) * (7.1698-(-1.9924)));
            zz = -4.5868 + (((tickAnim - 0) / 13) * (0.61642-(-4.5868)));
        }
        else if (tickAnim >= 13 && tickAnim < 23) {
            xx = 23.81393 + (((tickAnim - 13) / 10) * (-14.9202-(23.81393)));
            yy = 7.1698 + (((tickAnim - 13) / 10) * (-1.9924-(7.1698)));
            zz = 0.61642 + (((tickAnim - 13) / 10) * (-4.5868-(0.61642)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightthigh, rightthigh.rotateAngleX + (float) Math.toRadians(xx), rightthigh.rotateAngleY + (float) Math.toRadians(yy), rightthigh.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 4) {
            xx = -30 + (((tickAnim - 0) / 4) * (-8.95339-(-30)));
            yy = 0 + (((tickAnim - 0) / 4) * (-2.79408-(0)));
            zz = 0 + (((tickAnim - 0) / 4) * (-4.2956-(0)));
        }
        else if (tickAnim >= 4 && tickAnim < 13) {
            xx = -8.95339 + (((tickAnim - 4) / 9) * (17-(-8.95339)));
            yy = -2.79408 + (((tickAnim - 4) / 9) * (0-(-2.79408)));
            zz = -4.2956 + (((tickAnim - 4) / 9) * (0-(-4.2956)));
        }
        else if (tickAnim >= 13 && tickAnim < 15) {
            xx = 17 + (((tickAnim - 13) / 2) * (40.1-(17)));
            yy = 0 + (((tickAnim - 13) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 13) / 2) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 23) {
            xx = 40.1 + (((tickAnim - 15) / 8) * (-30-(40.1)));
            yy = 0 + (((tickAnim - 15) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 8) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightshin, rightshin.rotateAngleX + (float) Math.toRadians(xx), rightshin.rotateAngleY + (float) Math.toRadians(yy), rightshin.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 0) / 13) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 13) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 13) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 13) / 2) * (0-(0)));
            yy = 0 + (((tickAnim - 13) / 2) * (-0.25-(0)));
            zz = 0 + (((tickAnim - 13) / 2) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 23) {
            xx = 0 + (((tickAnim - 15) / 8) * (0-(0)));
            yy = -0.25 + (((tickAnim - 15) / 8) * (0-(-0.25)));
            zz = 0 + (((tickAnim - 15) / 8) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.rightshin.rotationPointX = this.rightshin.rotationPointX + (float)(xx);
        this.rightshin.rotationPointY = this.rightshin.rotationPointY - (float)(yy);
        this.rightshin.rotationPointZ = this.rightshin.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 4) {
            xx = 21 + (((tickAnim - 0) / 4) * (18.9737-(21)));
            yy = 0 + (((tickAnim - 0) / 4) * (1.0338-(0)));
            zz = 0 + (((tickAnim - 0) / 4) * (2.0606-(0)));
        }
        else if (tickAnim >= 4 && tickAnim < 13) {
            xx = 18.9737 + (((tickAnim - 4) / 9) * (0.75-(18.9737)));
            yy = 1.0338 + (((tickAnim - 4) / 9) * (0-(1.0338)));
            zz = 2.0606 + (((tickAnim - 4) / 9) * (0-(2.0606)));
        }
        else if (tickAnim >= 13 && tickAnim < 19) {
            xx = 0.75 + (((tickAnim - 13) / 6) * (-43.33-(0.75)));
            yy = 0 + (((tickAnim - 13) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 13) / 6) * (0-(0)));
        }
        else if (tickAnim >= 19 && tickAnim < 21) {
            xx = -43.33 + (((tickAnim - 19) / 2) * (-43.33-(-43.33)));
            yy = 0 + (((tickAnim - 19) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 19) / 2) * (0-(0)));
        }
        else if (tickAnim >= 21 && tickAnim < 23) {
            xx = -43.33 + (((tickAnim - 21) / 2) * (21-(-43.33)));
            yy = 0 + (((tickAnim - 21) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 21) / 2) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightankle, rightankle.rotateAngleX + (float) Math.toRadians(xx), rightankle.rotateAngleY + (float) Math.toRadians(yy), rightankle.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 22.9068 + (((tickAnim - 0) / 3) * (3.8834-(22.9068)));
            yy = 0.23608 + (((tickAnim - 0) / 3) * (2.50667-(0.23608)));
            zz = 4.4438 + (((tickAnim - 0) / 3) * (4.03848-(4.4438)));
        }
        else if (tickAnim >= 3 && tickAnim < 5) {
            xx = 3.8834 + (((tickAnim - 3) / 2) * (-5.14001-(3.8834)));
            yy = 2.50667 + (((tickAnim - 3) / 2) * (4.77727-(2.50667)));
            zz = 4.03848 + (((tickAnim - 3) / 2) * (3.63316-(4.03848)));
        }
        else if (tickAnim >= 5 && tickAnim < 9) {
            xx = -5.14001 + (((tickAnim - 5) / 4) * (45.93777-(-5.14001)));
            yy = 4.77727 + (((tickAnim - 5) / 4) * (2.12323-(4.77727)));
            zz = 3.63316 + (((tickAnim - 5) / 4) * (1.61474-(3.63316)));
        }
        else if (tickAnim >= 9 && tickAnim < 13) {
            xx = 45.93777 + (((tickAnim - 9) / 4) * (67-(45.93777)));
            yy = 2.12323 + (((tickAnim - 9) / 4) * (0-(2.12323)));
            zz = 1.61474 + (((tickAnim - 9) / 4) * (0-(1.61474)));
        }
        else if (tickAnim >= 13 && tickAnim < 19) {
            xx = 67 + (((tickAnim - 13) / 6) * (75.64-(67)));
            yy = 0 + (((tickAnim - 13) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 13) / 6) * (0-(0)));
        }
        else if (tickAnim >= 19 && tickAnim < 21) {
            xx = 75.64 + (((tickAnim - 19) / 2) * (75.64-(75.64)));
            yy = 0 + (((tickAnim - 19) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 19) / 2) * (0-(0)));
        }
        else if (tickAnim >= 21 && tickAnim < 23) {
            xx = 75.64 + (((tickAnim - 21) / 2) * (22.9068-(75.64)));
            yy = 0 + (((tickAnim - 21) / 2) * (0.23608-(0)));
            zz = 0 + (((tickAnim - 21) / 2) * (4.4438-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightfoot, rightfoot.rotateAngleX + (float) Math.toRadians(xx), rightfoot.rotateAngleY + (float) Math.toRadians(yy), rightfoot.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 3) * (0.885-(0)));
            zz = 0 + (((tickAnim - 0) / 3) * (-0.125-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 3) / 2) * (0-(0)));
            yy = 0.885 + (((tickAnim - 3) / 2) * (0.925-(0.885)));
            zz = -0.125 + (((tickAnim - 3) / 2) * (0-(-0.125)));
        }
        else if (tickAnim >= 5 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 5) / 8) * (0-(0)));
            yy = 0.925 + (((tickAnim - 5) / 8) * (0-(0.925)));
            zz = 0 + (((tickAnim - 5) / 8) * (-0.55-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 19) {
            xx = 0 + (((tickAnim - 13) / 6) * (0-(0)));
            yy = 0 + (((tickAnim - 13) / 6) * (1.15-(0)));
            zz = -0.55 + (((tickAnim - 13) / 6) * (-0.26-(-0.55)));
        }
        else if (tickAnim >= 19 && tickAnim < 21) {
            xx = 0 + (((tickAnim - 19) / 2) * (0-(0)));
            yy = 1.15 + (((tickAnim - 19) / 2) * (1.15-(1.15)));
            zz = -0.26 + (((tickAnim - 19) / 2) * (-0.26-(-0.26)));
        }
        else if (tickAnim >= 21 && tickAnim < 23) {
            xx = 0 + (((tickAnim - 21) / 2) * (0-(0)));
            yy = 1.15 + (((tickAnim - 21) / 2) * (0-(1.15)));
            zz = -0.26 + (((tickAnim - 21) / 2) * (0-(-0.26)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.rightfoot.rotationPointX = this.rightfoot.rotationPointX + (float)(xx);
        this.rightfoot.rotationPointY = this.rightfoot.rotationPointY - (float)(yy);
        this.rightfoot.rotationPointZ = this.rightfoot.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 0) / 5) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 5) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 9) {
            xx = 0 + (((tickAnim - 5) / 4) * (-52.52-(0)));
            yy = 0 + (((tickAnim - 5) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 5) / 4) * (0-(0)));
        }
        else if (tickAnim >= 9 && tickAnim < 13) {
            xx = -52.52 + (((tickAnim - 9) / 4) * (-39.5-(-52.52)));
            yy = 0 + (((tickAnim - 9) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 9) / 4) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 16) {
            xx = -39.5 + (((tickAnim - 13) / 3) * (23.06-(-39.5)));
            yy = 0 + (((tickAnim - 13) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 13) / 3) * (0-(0)));
        }
        else if (tickAnim >= 16 && tickAnim < 20) {
            xx = 23.06 + (((tickAnim - 16) / 4) * (0-(23.06)));
            yy = 0 + (((tickAnim - 16) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 16) / 4) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 23) {
            xx = 0 + (((tickAnim - 20) / 3) * (0-(0)));
            yy = 0 + (((tickAnim - 20) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 3) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(righttoes, righttoes.rotateAngleX + (float) Math.toRadians(xx), righttoes.rotateAngleY + (float) Math.toRadians(yy), righttoes.rotateAngleZ + (float) Math.toRadians(zz));

    }
    public void animRunning(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime) {
        EntityPrehistoricFloraFalcarius entity = (EntityPrehistoricFloraFalcarius) entitylivingbaseIn;
        int animCycle = 15;
        double tickAnim = (entity.ticksExisted + entity.getTickOffset()) - (int) (Math.floor((double) (entity.ticksExisted + entity.getTickOffset()) / (double) animCycle) * (double) animCycle) + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;
        this.setRotateAngle(hips, hips.rotateAngleX + (float) Math.toRadians(-7+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*720/0.75-20))*4), hips.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/0.75))*-2), hips.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/0.75))*-2.5));
        this.hips.rotationPointX = this.hips.rotationPointX + (float)(0);
        this.hips.rotationPointY = this.hips.rotationPointY - (float)(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*720/0.75-260))*-1);
        this.hips.rotationPointZ = this.hips.rotationPointZ + (float)(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*720/0.75-50))*0.5);


        this.setRotateAngle(bodymiddle, bodymiddle.rotateAngleX + (float) Math.toRadians(8+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*720/0.75-140))*-2), bodymiddle.rotateAngleY + (float) Math.toRadians(0), bodymiddle.rotateAngleZ + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/0.75-50))*-2.5));


        this.setRotateAngle(bodyfront, bodyfront.rotateAngleX + (float) Math.toRadians(9.75+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*720/0.75-240))*4), bodyfront.rotateAngleY + (float) Math.toRadians(0), bodyfront.rotateAngleZ + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/0.75-90))*-2.5));


        this.setRotateAngle(neckbase, neckbase.rotateAngleX + (float) Math.toRadians(13.25+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*720/0.75-290))*-5), neckbase.rotateAngleY + (float) Math.toRadians(0), neckbase.rotateAngleZ + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/0.75-140))*-2.5));


        this.setRotateAngle(neckmiddlebase, neckmiddlebase.rotateAngleX + (float) Math.toRadians(-5.75+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*720/0.75-290))*-4), neckmiddlebase.rotateAngleY + (float) Math.toRadians(0), neckmiddlebase.rotateAngleZ + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/0.75-180))*-2.5));


        this.setRotateAngle(neckmiddlefront, neckmiddlefront.rotateAngleX + (float) Math.toRadians(-18+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*720/0.75-340))*-4), neckmiddlefront.rotateAngleY + (float) Math.toRadians(0), neckmiddlefront.rotateAngleZ + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/0.75-180))*-2.5));


        this.setRotateAngle(neckfront, neckfront.rotateAngleX + (float) Math.toRadians(-5.25+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*720/0.75-340))*4), neckfront.rotateAngleY + (float) Math.toRadians(0), neckfront.rotateAngleZ + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/0.75-220))*-2.5));


        this.setRotateAngle(head, head.rotateAngleX + (float) Math.toRadians(3.75+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*720/0.75-380))*2), head.rotateAngleY + (float) Math.toRadians(0), head.rotateAngleZ + (float) Math.toRadians(0));
        this.head.rotationPointX = this.head.rotationPointX + (float)(0);
        this.head.rotationPointY = this.head.rotationPointY - (float)(0.05);
        this.head.rotationPointZ = this.head.rotationPointZ + (float)(-0.2);


        this.setRotateAngle(leftupperarm, leftupperarm.rotateAngleX + (float) Math.toRadians(-7.25+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*720/0.75-240))*4), leftupperarm.rotateAngleY + (float) Math.toRadians(0), leftupperarm.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(leftlowerarm, leftlowerarm.rotateAngleX + (float) Math.toRadians(9.75+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*720/0.75-290))*-4), leftlowerarm.rotateAngleY + (float) Math.toRadians(0), leftlowerarm.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(lefthand, lefthand.rotateAngleX + (float) Math.toRadians(9.75+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*720/0.75-340))*-4), lefthand.rotateAngleY + (float) Math.toRadians(0), lefthand.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(rightupperarm, rightupperarm.rotateAngleX + (float) Math.toRadians(-7.25+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*720/0.75-240))*4), rightupperarm.rotateAngleY + (float) Math.toRadians(0), rightupperarm.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(rightlowerarm, rightlowerarm.rotateAngleX + (float) Math.toRadians(9.75+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*720/0.75-290))*-4), rightlowerarm.rotateAngleY + (float) Math.toRadians(0), rightlowerarm.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(righthand, righthand.rotateAngleX + (float) Math.toRadians(9.75+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*720/0.75-340))*-4), righthand.rotateAngleY + (float) Math.toRadians(0), righthand.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(tailbase, tailbase.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*720/0.75))*1), tailbase.rotateAngleY + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/0.75-20))*-5), tailbase.rotateAngleZ + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/0.75))*-2.5));


        this.setRotateAngle(tailmiddlebase, tailmiddlebase.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*720/0.75-50))*3), tailmiddlebase.rotateAngleY + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/0.75-60))*-9), tailmiddlebase.rotateAngleZ + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/0.75))*-2.5));


        this.setRotateAngle(tailmiddleend, tailmiddleend.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*720/0.75-100))*6), tailmiddleend.rotateAngleY + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/0.75-170))*-15), tailmiddleend.rotateAngleZ + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/0.75))*-2.5));


        this.setRotateAngle(tailend, tailend.rotateAngleX + (float) Math.toRadians(14.5+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*720/0.75-150))*9), tailend.rotateAngleY + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/0.75-200))*-15), tailend.rotateAngleZ + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/0.75))*-2.5));



        if (tickAnim >= 0 && tickAnim < 5) {
            xx = 34.86618 + (((tickAnim - 0) / 5) * (-5.2934-(34.86618)));
            yy = -6.43941 + (((tickAnim - 0) / 5) * (-5.15451-(-6.43941)));
            zz = -0.88743 + (((tickAnim - 0) / 5) * (4.78575-(-0.88743)));
        }
        else if (tickAnim >= 5 && tickAnim < 7) {
            xx = -5.2934 + (((tickAnim - 5) / 2) * (-14.9202-(-5.2934)));
            yy = -5.15451 + (((tickAnim - 5) / 2) * (1.9924-(-5.15451)));
            zz = 4.78575 + (((tickAnim - 5) / 2) * (4.5868-(4.78575)));
        }
        else if (tickAnim >= 7 && tickAnim < 15) {
            xx = -14.9202 + (((tickAnim - 7) / 8) * (34.86618-(-14.9202)));
            yy = 1.9924 + (((tickAnim - 7) / 8) * (-6.43941-(1.9924)));
            zz = 4.5868 + (((tickAnim - 7) / 8) * (-0.88743-(4.5868)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftthigh, leftthigh.rotateAngleX + (float) Math.toRadians(xx), leftthigh.rotateAngleY + (float) Math.toRadians(yy), leftthigh.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 7) {
            xx = 35.6 + (((tickAnim - 0) / 7) * (-24.75-(35.6)));
            yy = 0 + (((tickAnim - 0) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 7) * (0-(0)));
        }
        else if (tickAnim >= 7 && tickAnim < 15) {
            xx = -24.75 + (((tickAnim - 7) / 8) * (35.6-(-24.75)));
            yy = 0 + (((tickAnim - 7) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 7) / 8) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftshin, leftshin.rotateAngleX + (float) Math.toRadians(xx), leftshin.rotateAngleY + (float) Math.toRadians(yy), leftshin.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 7) {
            xx = 0 + (((tickAnim - 0) / 7) * (0-(0)));
            yy = -0.25 + (((tickAnim - 0) / 7) * (0-(-0.25)));
            zz = 0 + (((tickAnim - 0) / 7) * (0-(0)));
        }
        else if (tickAnim >= 7 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 7) / 8) * (0-(0)));
            yy = 0 + (((tickAnim - 7) / 8) * (-0.25-(0)));
            zz = 0 + (((tickAnim - 7) / 8) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.leftshin.rotationPointX = this.leftshin.rotationPointX + (float)(xx);
        this.leftshin.rotationPointY = this.leftshin.rotationPointY - (float)(yy);
        this.leftshin.rotationPointZ = this.leftshin.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 3) {
            xx = -15.78 + (((tickAnim - 0) / 3) * (-43.02-(-15.78)));
            yy = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 3) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 4) {
            xx = -43.02 + (((tickAnim - 3) / 1) * (-43.02-(-43.02)));
            yy = 0 + (((tickAnim - 3) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 3) / 1) * (0-(0)));
        }
        else if (tickAnim >= 4 && tickAnim < 7) {
            xx = -43.02 + (((tickAnim - 4) / 3) * (28.25-(-43.02)));
            yy = 0 + (((tickAnim - 4) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 4) / 3) * (0-(0)));
        }
        else if (tickAnim >= 7 && tickAnim < 15) {
            xx = 28.25 + (((tickAnim - 7) / 8) * (-15.78-(28.25)));
            yy = 0 + (((tickAnim - 7) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 7) / 8) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftankle, leftankle.rotateAngleX + (float) Math.toRadians(xx), leftankle.rotateAngleY + (float) Math.toRadians(yy), leftankle.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 7 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 7) / 3) * (0-(0)));
            yy = 0 + (((tickAnim - 7) / 3) * (-0.425-(0)));
            zz = 0 + (((tickAnim - 7) / 3) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 12) {
            xx = 0 + (((tickAnim - 10) / 2) * (0-(0)));
            yy = -0.425 + (((tickAnim - 10) / 2) * (0-(-0.425)));
            zz = 0 + (((tickAnim - 10) / 2) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.leftankle.rotationPointX = this.leftankle.rotationPointX + (float)(xx);
        this.leftankle.rotationPointY = this.leftankle.rotationPointY - (float)(yy);
        this.leftankle.rotationPointZ = this.leftankle.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 62.46 + (((tickAnim - 0) / 3) * (68.6834-(62.46)));
            yy = 0 + (((tickAnim - 0) / 3) * (-0.11805-(0)));
            zz = 0 + (((tickAnim - 0) / 3) * (-2.2219-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 4) {
            xx = 68.6834 + (((tickAnim - 3) / 1) * (68.6834-(68.6834)));
            yy = -0.11805 + (((tickAnim - 3) / 1) * (-0.11805-(-0.11805)));
            zz = -2.2219 + (((tickAnim - 3) / 1) * (-2.2219-(-2.2219)));
        }
        else if (tickAnim >= 4 && tickAnim < 7) {
            xx = 68.6834 + (((tickAnim - 4) / 3) * (22.4068-(68.6834)));
            yy = -0.11805 + (((tickAnim - 4) / 3) * (-0.2361-(-0.11805)));
            zz = -2.2219 + (((tickAnim - 4) / 3) * (-4.4438-(-2.2219)));
        }
        else if (tickAnim >= 7 && tickAnim < 10) {
            xx = 22.4068 + (((tickAnim - 7) / 3) * (-9.92192-(22.4068)));
            yy = -0.2361 + (((tickAnim - 7) / 3) * (-0.14166-(-0.2361)));
            zz = -4.4438 + (((tickAnim - 7) / 3) * (-2.66628-(-4.4438)));
        }
        else if (tickAnim >= 10 && tickAnim < 13) {
            xx = -9.92192 + (((tickAnim - 10) / 3) * (68.01904-(-9.92192)));
            yy = -0.14166 + (((tickAnim - 10) / 3) * (-0.07083-(-0.14166)));
            zz = -2.66628 + (((tickAnim - 10) / 3) * (-1.33314-(-2.66628)));
        }
        else if (tickAnim >= 13 && tickAnim < 15) {
            xx = 68.01904 + (((tickAnim - 13) / 2) * (62.46-(68.01904)));
            yy = -0.07083 + (((tickAnim - 13) / 2) * (0-(-0.07083)));
            zz = -1.33314 + (((tickAnim - 13) / 2) * (0-(-1.33314)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftfoot, leftfoot.rotateAngleX + (float) Math.toRadians(xx), leftfoot.rotateAngleY + (float) Math.toRadians(yy), leftfoot.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 3) * (1.265-(0)));
            zz = 0 + (((tickAnim - 0) / 3) * (-0.625-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 4) {
            xx = 0 + (((tickAnim - 3) / 1) * (0-(0)));
            yy = 1.265 + (((tickAnim - 3) / 1) * (1.265-(1.265)));
            zz = -0.625 + (((tickAnim - 3) / 1) * (-0.625-(-0.625)));
        }
        else if (tickAnim >= 4 && tickAnim < 7) {
            xx = 0 + (((tickAnim - 4) / 3) * (0-(0)));
            yy = 1.265 + (((tickAnim - 4) / 3) * (0.4-(1.265)));
            zz = -0.625 + (((tickAnim - 4) / 3) * (0-(-0.625)));
        }
        else if (tickAnim >= 7 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 7) / 1) * (0-(0)));
            yy = 0.4 + (((tickAnim - 7) / 1) * (1.5-(0.4)));
            zz = 0 + (((tickAnim - 7) / 1) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 8) / 2) * (0-(0)));
            yy = 1.5 + (((tickAnim - 8) / 2) * (0-(1.5)));
            zz = 0 + (((tickAnim - 8) / 2) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 10) / 5) * (0-(0)));
            yy = 0 + (((tickAnim - 10) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 5) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.leftfoot.rotationPointX = this.leftfoot.rotationPointX + (float)(xx);
        this.leftfoot.rotationPointY = this.leftfoot.rotationPointY - (float)(yy);
        this.leftfoot.rotationPointZ = this.leftfoot.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 16.18 + (((tickAnim - 0) / 3) * (0-(16.18)));
            yy = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 3) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 4) {
            xx = 0 + (((tickAnim - 3) / 1) * (0-(0)));
            yy = 0 + (((tickAnim - 3) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 3) / 1) * (0-(0)));
        }
        else if (tickAnim >= 4 && tickAnim < 7) {
            xx = 0 + (((tickAnim - 4) / 3) * (0-(0)));
            yy = 0 + (((tickAnim - 4) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 4) / 3) * (0-(0)));
        }
        else if (tickAnim >= 7 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 7) / 3) * (0-(0)));
            yy = 0 + (((tickAnim - 7) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 7) / 3) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 10) / 3) * (-67.41-(0)));
            yy = 0 + (((tickAnim - 10) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 3) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 15) {
            xx = -67.41 + (((tickAnim - 13) / 2) * (16.18-(-67.41)));
            yy = 0 + (((tickAnim - 13) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 13) / 2) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(lefttoes, lefttoes.rotateAngleX + (float) Math.toRadians(xx), lefttoes.rotateAngleY + (float) Math.toRadians(yy), lefttoes.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 8) {
            xx = -14.9202 + (((tickAnim - 0) / 8) * (31.06393-(-14.9202)));
            yy = -1.9924 + (((tickAnim - 0) / 8) * (7.1698-(-1.9924)));
            zz = -4.5868 + (((tickAnim - 0) / 8) * (0.61642-(-4.5868)));
        }
        else if (tickAnim >= 8 && tickAnim < 13) {
            xx = 31.06393 + (((tickAnim - 8) / 5) * (-2.06044-(31.06393)));
            yy = 7.1698 + (((tickAnim - 8) / 5) * (5.73154-(7.1698)));
            zz = 0.61642 + (((tickAnim - 8) / 5) * (-3.72294-(0.61642)));
        }
        else if (tickAnim >= 13 && tickAnim < 15) {
            xx = -2.06044 + (((tickAnim - 13) / 2) * (-14.9202-(-2.06044)));
            yy = 5.73154 + (((tickAnim - 13) / 2) * (-1.9924-(5.73154)));
            zz = -3.72294 + (((tickAnim - 13) / 2) * (-4.5868-(-3.72294)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightthigh, rightthigh.rotateAngleX + (float) Math.toRadians(xx), rightthigh.rotateAngleY + (float) Math.toRadians(yy), rightthigh.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 8) {
            xx = -24.75 + (((tickAnim - 0) / 8) * (34.35-(-24.75)));
            yy = 0 + (((tickAnim - 0) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 8) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 15) {
            xx = 34.35 + (((tickAnim - 8) / 7) * (-24.75-(34.35)));
            yy = 0 + (((tickAnim - 8) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 7) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightshin, rightshin.rotateAngleX + (float) Math.toRadians(xx), rightshin.rotateAngleY + (float) Math.toRadians(yy), rightshin.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 0) / 8) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 8) * (-0.25-(0)));
            zz = 0 + (((tickAnim - 0) / 8) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 8) / 7) * (0-(0)));
            yy = -0.25 + (((tickAnim - 8) / 7) * (0-(-0.25)));
            zz = 0 + (((tickAnim - 8) / 7) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.rightshin.rotationPointX = this.rightshin.rotationPointX + (float)(xx);
        this.rightshin.rotationPointY = this.rightshin.rotationPointY - (float)(yy);
        this.rightshin.rotationPointZ = this.rightshin.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 6) {
            xx = 28.25 + (((tickAnim - 0) / 6) * (16-(28.25)));
            yy = 0 + (((tickAnim - 0) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 6) * (0-(0)));
        }
        else if (tickAnim >= 6 && tickAnim < 8) {
            xx = 16 + (((tickAnim - 6) / 2) * (-15.78-(16)));
            yy = 0 + (((tickAnim - 6) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 6) / 2) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 11) {
            xx = -15.78 + (((tickAnim - 8) / 3) * (-42.46-(-15.78)));
            yy = 0 + (((tickAnim - 8) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 3) * (0-(0)));
        }
        else if (tickAnim >= 11 && tickAnim < 13) {
            xx = -42.46 + (((tickAnim - 11) / 2) * (-42.46-(-42.46)));
            yy = 0 + (((tickAnim - 11) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 11) / 2) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 15) {
            xx = -42.46 + (((tickAnim - 13) / 2) * (28.25-(-42.46)));
            yy = 0 + (((tickAnim - 13) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 13) / 2) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightankle, rightankle.rotateAngleX + (float) Math.toRadians(xx), rightankle.rotateAngleY + (float) Math.toRadians(yy), rightankle.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 3) * (-0.055-(0)));
            zz = 0 + (((tickAnim - 0) / 3) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 6) {
            xx = 0 + (((tickAnim - 3) / 3) * (0-(0)));
            yy = -0.055 + (((tickAnim - 3) / 3) * (0-(-0.055)));
            zz = 0 + (((tickAnim - 3) / 3) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.rightankle.rotationPointX = this.rightankle.rotationPointX + (float)(xx);
        this.rightankle.rotationPointY = this.rightankle.rotationPointY - (float)(yy);
        this.rightankle.rotationPointZ = this.rightankle.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 18.9068 + (((tickAnim - 0) / 3) * (-21.48622-(18.9068)));
            yy = 0.23608 + (((tickAnim - 0) / 3) * (0.13116-(0.23608)));
            zz = 4.4438 + (((tickAnim - 0) / 3) * (2.46878-(4.4438)));
        }
        else if (tickAnim >= 3 && tickAnim < 6) {
            xx = -21.48622 + (((tickAnim - 3) / 3) * (61.53151-(-21.48622)));
            yy = 0.13116 + (((tickAnim - 3) / 3) * (0.05246-(0.13116)));
            zz = 2.46878 + (((tickAnim - 3) / 3) * (0.98751-(2.46878)));
        }
        else if (tickAnim >= 6 && tickAnim < 8) {
            xx = 61.53151 + (((tickAnim - 6) / 2) * (62.46-(61.53151)));
            yy = 0.05246 + (((tickAnim - 6) / 2) * (0-(0.05246)));
            zz = 0.98751 + (((tickAnim - 6) / 2) * (0-(0.98751)));
        }
        else if (tickAnim >= 8 && tickAnim < 11) {
            xx = 62.46 + (((tickAnim - 8) / 3) * (69.10302-(62.46)));
            yy = 0 + (((tickAnim - 8) / 3) * (0.10492-(0)));
            zz = 0 + (((tickAnim - 8) / 3) * (1.97502-(0)));
        }
        else if (tickAnim >= 11 && tickAnim < 13) {
            xx = 69.10302 + (((tickAnim - 11) / 2) * (69.10302-(69.10302)));
            yy = 0.10492 + (((tickAnim - 11) / 2) * (0.10492-(0.10492)));
            zz = 1.97502 + (((tickAnim - 11) / 2) * (1.97502-(1.97502)));
        }
        else if (tickAnim >= 13 && tickAnim < 15) {
            xx = 69.10302 + (((tickAnim - 13) / 2) * (18.9068-(69.10302)));
            yy = 0.10492 + (((tickAnim - 13) / 2) * (0.23608-(0.10492)));
            zz = 1.97502 + (((tickAnim - 13) / 2) * (4.4438-(1.97502)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightfoot, rightfoot.rotateAngleX + (float) Math.toRadians(xx), rightfoot.rotateAngleY + (float) Math.toRadians(yy), rightfoot.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 2) {
            xx = 0 + (((tickAnim - 0) / 2) * (0-(0)));
            yy = 0.425 + (((tickAnim - 0) / 2) * (1.03-(0.425)));
            zz = 0 + (((tickAnim - 0) / 2) * (0-(0)));
        }
        else if (tickAnim >= 2 && tickAnim < 3) {
            xx = 0 + (((tickAnim - 2) / 1) * (0-(0)));
            yy = 1.03 + (((tickAnim - 2) / 1) * (-0.525-(1.03)));
            zz = 0 + (((tickAnim - 2) / 1) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 11) {
            xx = 0 + (((tickAnim - 3) / 8) * (0-(0)));
            yy = -0.525 + (((tickAnim - 3) / 8) * (1.01-(-0.525)));
            zz = 0 + (((tickAnim - 3) / 8) * (-0.6-(0)));
        }
        else if (tickAnim >= 11 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 11) / 2) * (0-(0)));
            yy = 1.01 + (((tickAnim - 11) / 2) * (1.01-(1.01)));
            zz = -0.6 + (((tickAnim - 11) / 2) * (-0.6-(-0.6)));
        }
        else if (tickAnim >= 13 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 13) / 2) * (0-(0)));
            yy = 1.01 + (((tickAnim - 13) / 2) * (0.425-(1.01)));
            zz = -0.6 + (((tickAnim - 13) / 2) * (0-(-0.6)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.rightfoot.rotationPointX = this.rightfoot.rotationPointX + (float)(xx);
        this.rightfoot.rotationPointY = this.rightfoot.rotationPointY - (float)(yy);
        this.rightfoot.rotationPointZ = this.rightfoot.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 3) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 3) / 2) * (-46.79-(0)));
            yy = 0 + (((tickAnim - 3) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 3) / 2) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 8) {
            xx = -46.79 + (((tickAnim - 5) / 3) * (16.18-(-46.79)));
            yy = 0 + (((tickAnim - 5) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 5) / 3) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 11) {
            xx = 16.18 + (((tickAnim - 8) / 3) * (0-(16.18)));
            yy = 0 + (((tickAnim - 8) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 3) * (0-(0)));
        }
        else if (tickAnim >= 11 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 11) / 2) * (0-(0)));
            yy = 0 + (((tickAnim - 11) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 11) / 2) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 13) / 2) * (0-(0)));
            yy = 0 + (((tickAnim - 13) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 13) / 2) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(righttoes, righttoes.rotateAngleX + (float) Math.toRadians(xx), righttoes.rotateAngleY + (float) Math.toRadians(yy), righttoes.rotateAngleZ + (float) Math.toRadians(zz));

    }

        public void animate(IAnimatedEntity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        EntityPrehistoricFloraFalcarius e = (EntityPrehistoricFloraFalcarius) entity;
        animator.update(entity);

    }
}
