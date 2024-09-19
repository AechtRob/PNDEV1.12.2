package net.lepidodendron.entity.model.entity;

import net.ilexiconn.llibrary.client.model.ModelAnimator;
import net.ilexiconn.llibrary.client.model.tools.AdvancedModelRenderer;
import net.ilexiconn.llibrary.server.animation.IAnimatedEntity;
import net.lepidodendron.entity.EntityPrehistoricFloraAnchisaurus;
import net.lepidodendron.entity.model.ModelBasePalaeopedia;
import net.minecraft.client.model.ModelBox;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;

public class ModelAnchisaurus extends ModelBasePalaeopedia {
    private final AdvancedModelRenderer root;
    private final AdvancedModelRenderer hips;
    private final AdvancedModelRenderer tailbase;
    private final AdvancedModelRenderer tailmiddlebase;
    private final AdvancedModelRenderer tailmiddle;
    private final AdvancedModelRenderer tailmiddleend;
    private final AdvancedModelRenderer tailend;
    private final AdvancedModelRenderer bodymiddle;
    private final AdvancedModelRenderer bodyfront;
    private final AdvancedModelRenderer Bellyslope;
    private final AdvancedModelRenderer neckbase;
    private final AdvancedModelRenderer neckmiddlebase;
    private final AdvancedModelRenderer neckmiddlefront;
    private final AdvancedModelRenderer neckfront;
    private final AdvancedModelRenderer head;
    private final AdvancedModelRenderer lowerjawbase;
    private final AdvancedModelRenderer lowerjawmiddle;
    private final AdvancedModelRenderer lowerjawfront;
    private final AdvancedModelRenderer leftlowerteeth;
    private final AdvancedModelRenderer rightlowerteeth;
    private final AdvancedModelRenderer masseterleft;
    private final AdvancedModelRenderer masseterright;
    private final AdvancedModelRenderer upperjawbase;
    private final AdvancedModelRenderer upperjawfront;
    private final AdvancedModelRenderer snoutslopefront;
    private final AdvancedModelRenderer snoutslopemiddle;
    private final AdvancedModelRenderer leftupperteeth;
    private final AdvancedModelRenderer rightupperteeth;
    private final AdvancedModelRenderer snoutslopebase;
    private final AdvancedModelRenderer righteye;
    private final AdvancedModelRenderer lefteye;
    private final AdvancedModelRenderer headtop;
    private final AdvancedModelRenderer rightupperarm;
    private final AdvancedModelRenderer rightlowerarm;
    private final AdvancedModelRenderer righthand;
    private final AdvancedModelRenderer leftupperarm;
    private final AdvancedModelRenderer leftlowerarm;
    private final AdvancedModelRenderer lefthand;
    private final AdvancedModelRenderer rightthigh;
    private final AdvancedModelRenderer rightshin;
    private final AdvancedModelRenderer rightankle;
    private final AdvancedModelRenderer rightfoot;
    private final AdvancedModelRenderer righttoes;
    private final AdvancedModelRenderer leftthigh;
    private final AdvancedModelRenderer leftshin;
    private final AdvancedModelRenderer leftankle;
    private final AdvancedModelRenderer leftfoot;
    private final AdvancedModelRenderer lefttoes;
    private ModelAnimator animator;

    public ModelAnchisaurus() {
        this.textureWidth = 80;
        this.textureHeight = 80;

        this.root = new AdvancedModelRenderer(this);
        this.root.setRotationPoint(0.0F, 0.0F, 0.0F);


        this.hips = new AdvancedModelRenderer(this);
        this.hips.setRotationPoint(0.0F, 8.25F, 0.0F);
        this.root.addChild(hips);
        this.setRotateAngle(hips, -0.1485F, 0.0F, 0.0F);
        this.hips.cubeList.add(new ModelBox(hips, 0, 48, -3.0F, -2.0F, -4.0F, 6, 7, 9, 0.0F, false));

        this.tailbase = new AdvancedModelRenderer(this);
        this.tailbase.setRotationPoint(0.0F, -0.45F, 4.4F);
        this.hips.addChild(tailbase);
        this.setRotateAngle(tailbase, -0.0424F, 0.0F, 0.0F);
        this.tailbase.cubeList.add(new ModelBox(tailbase, 31, 50, -2.5F, -1.5F, 0.0F, 5, 5, 9, 0.0F, false));

        this.tailmiddlebase = new AdvancedModelRenderer(this);
        this.tailmiddlebase.setRotationPoint(0.0F, -0.4F, 8.5F);
        this.tailbase.addChild(tailmiddlebase);
        this.setRotateAngle(tailmiddlebase, -0.0424F, 0.0F, 0.0F);
        this.tailmiddlebase.cubeList.add(new ModelBox(tailmiddlebase, 31, 36, -2.0F, -1.0F, 0.0F, 4, 4, 9, 0.0F, false));

        this.tailmiddle = new AdvancedModelRenderer(this);
        this.tailmiddle.setRotationPoint(0.0F, 0.1F, 8.5F);
        this.tailmiddlebase.addChild(tailmiddle);
        this.setRotateAngle(tailmiddle, 0.0213F, 0.0F, 0.0F);
        this.tailmiddle.cubeList.add(new ModelBox(tailmiddle, 22, 10, -1.5F, -1.0F, 0.0F, 3, 3, 9, 0.0F, false));

        this.tailmiddleend = new AdvancedModelRenderer(this);
        this.tailmiddleend.setRotationPoint(0.0F, -0.2F, 8.5F);
        this.tailmiddle.addChild(tailmiddleend);
        this.setRotateAngle(tailmiddleend, 0.1274F, 0.0F, 0.0F);
        this.tailmiddleend.cubeList.add(new ModelBox(tailmiddleend, 42, 0, -1.0F, -0.5F, 0.0F, 2, 2, 8, 0.0F, false));

        this.tailend = new AdvancedModelRenderer(this);
        this.tailend.setRotationPoint(0.0F, 0.1F, 7.5F);
        this.tailmiddleend.addChild(tailend);
        this.setRotateAngle(tailend, -0.0637F, 0.0F, 0.0F);
        this.tailend.cubeList.add(new ModelBox(tailend, 49, 29, -0.5F, -0.5F, 0.0F, 1, 1, 8, 0.0F, false));

        this.bodymiddle = new AdvancedModelRenderer(this);
        this.bodymiddle.setRotationPoint(0.0F, -0.6F, -3.5F);
        this.hips.addChild(bodymiddle);
        this.setRotateAngle(bodymiddle, 0.1061F, 0.0F, 0.0F);
        this.bodymiddle.cubeList.add(new ModelBox(bodymiddle, 0, 31, -3.5F, -1.5F, -8.0F, 7, 8, 8, 0.0F, false));

        this.bodyfront = new AdvancedModelRenderer(this);
        this.bodyfront.setRotationPoint(0.0F, -0.4F, -7.5F);
        this.bodymiddle.addChild(bodyfront);
        this.setRotateAngle(bodyfront, 0.1485F, 0.0F, 0.0F);
        this.bodyfront.cubeList.add(new ModelBox(bodyfront, 0, 15, -3.0F, -1.0F, -9.0F, 6, 6, 9, 0.0F, false));

        this.Bellyslope = new AdvancedModelRenderer(this);
        this.Bellyslope.setRotationPoint(0.0F, 5.0F, -9.0F);
        this.bodyfront.addChild(Bellyslope);
        this.setRotateAngle(Bellyslope, -0.2122F, 0.0F, 0.0F);
        this.Bellyslope.cubeList.add(new ModelBox(Bellyslope, 23, 23, -2.5F, -3.0F, 0.0F, 5, 3, 9, 0.0F, false));

        this.neckbase = new AdvancedModelRenderer(this);
        this.neckbase.setRotationPoint(0.0F, 1.0F, -7.6F);
        this.bodyfront.addChild(neckbase);
        this.setRotateAngle(neckbase, -0.2759F, 0.0F, 0.0F);
        this.neckbase.cubeList.add(new ModelBox(neckbase, 43, 19, -2.0F, -1.5F, -5.0F, 4, 4, 5, 0.0F, false));

        this.neckmiddlebase = new AdvancedModelRenderer(this);
        this.neckmiddlebase.setRotationPoint(0.0F, -0.2F, -4.9F);
        this.neckbase.addChild(neckmiddlebase);
        this.setRotateAngle(neckmiddlebase, -0.2546F, 0.0F, 0.0F);
        this.neckmiddlebase.cubeList.add(new ModelBox(neckmiddlebase, 53, 45, -1.5F, -1.0F, -4.0F, 3, 3, 5, 0.0F, false));

        this.neckmiddlefront = new AdvancedModelRenderer(this);
        this.neckmiddlefront.setRotationPoint(0.0F, -0.49F, -3.4F);
        this.neckmiddlebase.addChild(neckmiddlefront);
        this.setRotateAngle(neckmiddlefront, -0.0213F, 0.0F, 0.0F);
        this.neckmiddlefront.cubeList.add(new ModelBox(neckmiddlefront, 37, 0, -1.0F, -0.5F, -4.0F, 2, 3, 4, 0.0F, false));

        this.neckfront = new AdvancedModelRenderer(this);
        this.neckfront.setRotationPoint(0.01F, 0.0F, -3.5F);
        this.neckmiddlefront.addChild(neckfront);
        this.setRotateAngle(neckfront, 0.2122F, 0.0F, 0.0F);
        this.neckfront.cubeList.add(new ModelBox(neckfront, 38, 11, -1.0F, -0.5F, -4.0F, 2, 3, 4, 0.0F, false));

        this.head = new AdvancedModelRenderer(this);
        this.head.setRotationPoint(0.01F, 0.2F, -3.4F);
        this.neckfront.addChild(head);
        this.setRotateAngle(head, 0.3609F, 0.0F, 0.0F);
        this.head.cubeList.add(new ModelBox(head, 0, 11, -1.0F, 0.0F, -2.0F, 2, 1, 2, 0.0F, false));

        this.lowerjawbase = new AdvancedModelRenderer(this);
        this.lowerjawbase.setRotationPoint(0.0F, 1.0F, 0.0F);
        this.head.addChild(lowerjawbase);
        this.lowerjawbase.cubeList.add(new ModelBox(lowerjawbase, 10, 0, -1.0F, 0.0F, -2.0F, 2, 1, 2, 0.0F, false));

        this.lowerjawmiddle = new AdvancedModelRenderer(this);
        this.lowerjawmiddle.setRotationPoint(0.01F, 0.17F, -3.1F);
        this.lowerjawbase.addChild(lowerjawmiddle);
        this.setRotateAngle(lowerjawmiddle, 0.1485F, 0.0F, 0.0F);
        this.lowerjawmiddle.cubeList.add(new ModelBox(lowerjawmiddle, 47, 10, -1.0F, 0.0F, -1.0F, 2, 1, 3, 0.0F, false));

        this.lowerjawfront = new AdvancedModelRenderer(this);
        this.lowerjawfront.setRotationPoint(0.0F, 0.0F, -1.0F);
        this.lowerjawmiddle.addChild(lowerjawfront);
        this.setRotateAngle(lowerjawfront, 0.1061F, 0.0F, 0.0F);
        this.lowerjawfront.cubeList.add(new ModelBox(lowerjawfront, 0, 8, -0.5F, 0.0F, -1.0F, 1, 1, 1, 0.0F, false));

        this.leftlowerteeth = new AdvancedModelRenderer(this);
        this.leftlowerteeth.setRotationPoint(-0.3F, 0.7F, -0.8F);
        this.lowerjawfront.addChild(leftlowerteeth);
        this.setRotateAngle(leftlowerteeth, -0.1485F, -0.1698F, 0.0F);
        this.leftlowerteeth.cubeList.add(new ModelBox(leftlowerteeth, 4, 2, 0.0F, -1.0F, 0.0F, 0, 1, 2, 0.0F, false));

        this.rightlowerteeth = new AdvancedModelRenderer(this);
        this.rightlowerteeth.setRotationPoint(0.3F, 0.7F, -0.8F);
        this.lowerjawfront.addChild(rightlowerteeth);
        this.setRotateAngle(rightlowerteeth, -0.1274F, 0.1698F, 0.0F);
        this.rightlowerteeth.cubeList.add(new ModelBox(rightlowerteeth, 9, 2, 0.0F, -1.0F, 0.0F, 0, 1, 2, 0.0F, false));

        this.masseterleft = new AdvancedModelRenderer(this);
        this.masseterleft.setRotationPoint(-0.48F, 0.0F, -2.0F);
        this.lowerjawbase.addChild(masseterleft);
        this.setRotateAngle(masseterleft, -0.4671F, 0.0F, 0.0F);
        this.masseterleft.cubeList.add(new ModelBox(masseterleft, 0, 4, -0.5F, -2.0F, 0.0F, 1, 2, 1, 0.0F, false));

        this.masseterright = new AdvancedModelRenderer(this);
        this.masseterright.setRotationPoint(0.47F, 0.0F, -2.0F);
        this.lowerjawbase.addChild(masseterright);
        this.setRotateAngle(masseterright, -0.4671F, 0.0F, 0.0F);
        this.masseterright.cubeList.add(new ModelBox(masseterright, 5, 7, -0.5F, -2.0F, 0.0F, 1, 2, 1, 0.0F, false));

        this.upperjawbase = new AdvancedModelRenderer(this);
        this.upperjawbase.setRotationPoint(0.01F, 1.17F, -3.1F);
        this.head.addChild(upperjawbase);
        this.setRotateAngle(upperjawbase, 0.1485F, 0.0F, 0.0F);
        this.upperjawbase.cubeList.add(new ModelBox(upperjawbase, 11, 4, -1.0F, -1.0F, -1.0F, 2, 1, 3, 0.0F, false));

        this.upperjawfront = new AdvancedModelRenderer(this);
        this.upperjawfront.setRotationPoint(0.0F, 0.0F, -1.0F);
        this.upperjawbase.addChild(upperjawfront);
        this.setRotateAngle(upperjawfront, 0.1061F, 0.0F, 0.0F);
        this.upperjawfront.cubeList.add(new ModelBox(upperjawfront, 7, 8, -0.5F, -1.0F, -1.0F, 1, 1, 3, 0.0F, false));

        this.snoutslopefront = new AdvancedModelRenderer(this);
        this.snoutslopefront.setRotationPoint(-0.01F, -1.0F, -1.0F);
        this.upperjawfront.addChild(snoutslopefront);
        this.setRotateAngle(snoutslopefront, 0.4458F, 0.0F, 0.0F);
        this.snoutslopefront.cubeList.add(new ModelBox(snoutslopefront, 37, 10, -0.5F, 0.0F, 0.0F, 1, 1, 1, 0.0F, false));

        this.snoutslopemiddle = new AdvancedModelRenderer(this);
        this.snoutslopemiddle.setRotationPoint(-0.01F, 0.0F, 1.0F);
        this.snoutslopefront.addChild(snoutslopemiddle);
        this.setRotateAngle(snoutslopemiddle, -0.2759F, 0.0F, 0.0F);
        this.snoutslopemiddle.cubeList.add(new ModelBox(snoutslopemiddle, 51, 15, -0.5F, 0.0F, 0.0F, 1, 1, 2, 0.0F, false));

        this.leftupperteeth = new AdvancedModelRenderer(this);
        this.leftupperteeth.setRotationPoint(-0.32F, -0.7F, -0.92F);
        this.upperjawfront.addChild(leftupperteeth);
        this.setRotateAngle(leftupperteeth, 0.0F, -0.1698F, 0.0F);
        this.leftupperteeth.cubeList.add(new ModelBox(leftupperteeth, 24, 3, 0.0F, 0.0F, 0.0F, 0, 1, 3, 0.0F, false));

        this.rightupperteeth = new AdvancedModelRenderer(this);
        this.rightupperteeth.setRotationPoint(0.32F, -0.7F, -0.92F);
        this.upperjawfront.addChild(rightupperteeth);
        this.setRotateAngle(rightupperteeth, 0.0F, 0.1698F, 0.0F);
        this.rightupperteeth.cubeList.add(new ModelBox(rightupperteeth, 24, 2, 0.0F, 0.0F, 0.0F, 0, 1, 3, 0.0F, false));

        this.snoutslopebase = new AdvancedModelRenderer(this);
        this.snoutslopebase.setRotationPoint(-0.01F, -1.96F, 0.67F);
        this.upperjawbase.addChild(snoutslopebase);
        this.setRotateAngle(snoutslopebase, -0.1698F, 0.0F, 0.0F);
        this.snoutslopebase.cubeList.add(new ModelBox(snoutslopebase, 16, 12, -1.0F, 0.0F, 0.0F, 2, 1, 1, 0.0F, false));

        this.righteye = new AdvancedModelRenderer(this);
        this.righteye.setRotationPoint(0.53F, -0.1F, -1.6F);
        this.head.addChild(righteye);
        this.setRotateAngle(righteye, 0.0848F, 0.0F, 0.0F);
        this.righteye.cubeList.add(new ModelBox(righteye, 0, 0, -0.5F, -0.5F, -0.5F, 1, 1, 1, 0.0F, false));

        this.lefteye = new AdvancedModelRenderer(this);
        this.lefteye.setRotationPoint(-0.53F, -0.1F, -1.6F);
        this.head.addChild(lefteye);
        this.setRotateAngle(lefteye, 0.0848F, 0.0F, 0.0F);
        this.lefteye.cubeList.add(new ModelBox(lefteye, 5, 0, -0.5F, -0.5F, -0.5F, 1, 1, 1, 0.0F, false));

        this.headtop = new AdvancedModelRenderer(this);
        this.headtop.setRotationPoint(-0.02F, -0.2F, 0.01F);
        this.head.addChild(headtop);
        this.setRotateAngle(headtop, -0.0831F, 0.0F, 0.0F);
        this.headtop.cubeList.add(new ModelBox(headtop, 0, 15, -1.0F, -0.5F, -2.0F, 2, 1, 2, 0.0F, false));

        this.rightupperarm = new AdvancedModelRenderer(this);
        this.rightupperarm.setRotationPoint(2.5F, 3.5F, -7.0F);
        this.bodyfront.addChild(rightupperarm);
        this.setRotateAngle(rightupperarm, 0.8278F, 0.1485F, -0.2546F);
        this.rightupperarm.cubeList.add(new ModelBox(rightupperarm, 33, 65, -0.5F, -0.5F, -1.5F, 2, 5, 3, 0.0F, false));

        this.rightlowerarm = new AdvancedModelRenderer(this);
        this.rightlowerarm.setRotationPoint(0.45F, 4.0F, 0.5F);
        this.rightupperarm.addChild(rightlowerarm);
        this.setRotateAngle(rightlowerarm, -0.9128F, 0.0848F, 0.0848F);
        this.rightlowerarm.cubeList.add(new ModelBox(rightlowerarm, 44, 65, -1.0F, 0.0F, -1.5F, 2, 4, 2, 0.0F, false));

        this.righthand = new AdvancedModelRenderer(this);
        this.righthand.setRotationPoint(0.7F, 3.5F, -0.5F);
        this.rightlowerarm.addChild(righthand);
        this.setRotateAngle(righthand, -0.1274F, 0.0F, 0.2122F);
        this.righthand.cubeList.add(new ModelBox(righthand, 61, 54, -2.0F, 0.0F, -1.5F, 2, 4, 3, 0.0F, false));

        this.leftupperarm = new AdvancedModelRenderer(this);
        this.leftupperarm.setRotationPoint(-2.5F, 3.5F, -7.0F);
        this.bodyfront.addChild(leftupperarm);
        this.setRotateAngle(leftupperarm, 0.8278F, -0.1485F, 0.2546F);
        this.leftupperarm.cubeList.add(new ModelBox(leftupperarm, 33, 65, -1.5F, -0.5F, -1.5F, 2, 5, 3, 0.0F, true));

        this.leftlowerarm = new AdvancedModelRenderer(this);
        this.leftlowerarm.setRotationPoint(-0.45F, 4.0F, 0.5F);
        this.leftupperarm.addChild(leftlowerarm);
        this.setRotateAngle(leftlowerarm, -0.9128F, -0.0848F, -0.0848F);
        this.leftlowerarm.cubeList.add(new ModelBox(leftlowerarm, 44, 65, -1.0F, 0.0F, -1.5F, 2, 4, 2, 0.0F, true));

        this.lefthand = new AdvancedModelRenderer(this);
        this.lefthand.setRotationPoint(-0.7F, 3.5F, -0.5F);
        this.leftlowerarm.addChild(lefthand);
        this.setRotateAngle(lefthand, -0.1274F, 0.0F, -0.2122F);
        this.lefthand.cubeList.add(new ModelBox(lefthand, 61, 54, 0.0F, 0.0F, -1.5F, 2, 4, 3, 0.0F, true));

        this.rightthigh = new AdvancedModelRenderer(this);
        this.rightthigh.setRotationPoint(2.3F, 0.5F, 0.0F);
        this.hips.addChild(rightthigh);
        this.setRotateAngle(rightthigh, -0.2122F, 0.0F, 0.0F);
        this.rightthigh.cubeList.add(new ModelBox(rightthigh, 63, 0, -0.5F, -1.5F, -2.0F, 3, 8, 5, 0.0F, false));

        this.rightshin = new AdvancedModelRenderer(this);
        this.rightshin.setRotationPoint(1.0F, 6.0F, -1.0F);
        this.rightthigh.addChild(rightshin);
        this.setRotateAngle(rightshin, 0.7217F, 0.0F, 0.0F);
        this.rightshin.cubeList.add(new ModelBox(rightshin, 11, 65, -1.0F, 0.0F, -0.5F, 2, 7, 3, 0.0F, false));

        this.rightankle = new AdvancedModelRenderer(this);
        this.rightankle.setRotationPoint(-0.01F, 6.5F, 1.5F);
        this.rightshin.addChild(rightankle);
        this.setRotateAngle(rightankle, -0.5095F, 0.0F, 0.0F);
        this.rightankle.cubeList.add(new ModelBox(rightankle, 31, 52, -1.0F, 0.0F, -1.5F, 2, 4, 2, 0.0F, false));

        this.rightfoot = new AdvancedModelRenderer(this);
        this.rightfoot.setRotationPoint(0.0F, 3.8F, -0.8F);
        this.rightankle.addChild(rightfoot);
        this.setRotateAngle(rightfoot, 0.1485F, 0.0F, 0.0F);
        this.rightfoot.cubeList.add(new ModelBox(rightfoot, 18, 1, -1.5F, -0.2F, -1.7F, 3, 1, 3, 0.0F, false));

        this.righttoes = new AdvancedModelRenderer(this);
        this.righttoes.setRotationPoint(0.0F, 0.29F, -1.5F);
        this.rightfoot.addChild(righttoes);
        this.righttoes.cubeList.add(new ModelBox(righttoes, 28, 0, -2.0F, -0.5F, -1.8F, 4, 1, 2, 0.0F, false));

        this.leftthigh = new AdvancedModelRenderer(this);
        this.leftthigh.setRotationPoint(-2.3F, 0.5F, 0.0F);
        this.hips.addChild(leftthigh);
        this.setRotateAngle(leftthigh, -0.2122F, 0.0F, 0.0F);
        this.leftthigh.cubeList.add(new ModelBox(leftthigh, 62, 14, -2.5F, -1.5F, -2.0F, 3, 8, 5, 0.0F, false));

        this.leftshin = new AdvancedModelRenderer(this);
        this.leftshin.setRotationPoint(-1.0F, 6.0F, -1.0F);
        this.leftthigh.addChild(leftshin);
        this.setRotateAngle(leftshin, 0.7217F, 0.0F, 0.0F);
        this.leftshin.cubeList.add(new ModelBox(leftshin, 0, 65, -1.0F, 0.0F, -0.5F, 2, 7, 3, 0.0F, false));

        this.leftankle = new AdvancedModelRenderer(this);
        this.leftankle.setRotationPoint(0.01F, 6.5F, 1.5F);
        this.leftshin.addChild(leftankle);
        this.setRotateAngle(leftankle, -0.5095F, 0.0F, 0.0F);
        this.leftankle.cubeList.add(new ModelBox(leftankle, 22, 12, -1.0F, 0.0F, -1.5F, 2, 4, 2, 0.0F, false));

        this.leftfoot = new AdvancedModelRenderer(this);
        this.leftfoot.setRotationPoint(0.0F, 3.8F, -0.8F);
        this.leftankle.addChild(leftfoot);
        this.setRotateAngle(leftfoot, 0.1485F, 0.0F, 0.0F);
        this.leftfoot.cubeList.add(new ModelBox(leftfoot, 28, 5, -1.5F, -0.2F, -1.7F, 3, 1, 3, 0.0F, false));

        this.lefttoes = new AdvancedModelRenderer(this);
        this.lefttoes.setRotationPoint(0.0F, 0.29F, -1.5F);
        this.leftfoot.addChild(lefttoes);
        this.lefttoes.cubeList.add(new ModelBox(lefttoes, 16, 8, -2.0F, -0.5F, -1.8F, 4, 1, 2, 0.0F, false));


        updateDefaultPose();
        animator = ModelAnimator.create();
    }

    @Override
    public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        animate((IAnimatedEntity) entity, f, f1, f2, f3, f4, f5);
        this.root.render(f5);
    }
    public void renderStaticWall(float f) {
        this.setRotateAngle(bodyfront, 0.3F, 0.0F, 0.0F);
        this.setRotateAngle(neckbase, -0.3F, 0.1F, 0.0F);
        this.setRotateAngle(neckmiddlebase, -0.3F, 0.1F, 0.0F);
        this.setRotateAngle(neckmiddlefront, -0.2F, -0.1F, 0.0F);
        this.setRotateAngle(neckfront, 0.3F, -0.4F, 0.0F);
        this.setRotateAngle(head, 0.4F, -0.3F, 0.0F);
        this.setRotateAngle(lowerjawbase, 0.3F, 0.0F, 0.0F);
        this.bodyfront.offsetY = -0.04F;
        this.bodyfront.offsetX = 0.0F;
        this.bodyfront.offsetZ = 0.02F;
        this.bodyfront.render(0.01F);
        resetToDefaultPose();
    }

    public void renderStaticFloor(float f) {
        this.setRotateAngle(root, -0.4F, 0.0F, -0.1F);
        this.setRotateAngle(bodymiddle, -0.05F, -0.2F, -0.15F);
        this.setRotateAngle(bodyfront, 0.2F, -0.1F, -0.15F);
        this.setRotateAngle(neckbase, -0.5F, -0.1F, -0.1F);
        this.setRotateAngle(neckmiddlebase, -0.1F, -0.1F, -0.1F);
        this.setRotateAngle(neckmiddlefront, -0.2F, -0.15F, -0.05F);
        this.setRotateAngle(neckfront, 0.65F, -0.1F, -0.05F);
        this.setRotateAngle(head, 0.7F, 0.0F, -0.0F);
        this.setRotateAngle(lowerjawbase, 0.3F, 0.0F, 0.0F);
        this.setRotateAngle(tailbase, -0.1F, 0.0F, 0.0F);
        this.setRotateAngle(tailmiddlebase, 0.08F, -0.05F, 0.0F);
        this.setRotateAngle(tailmiddle, 0.35F, -0.1F, 0.0F);
        this.setRotateAngle(tailmiddleend, 0.2F, -0.2F, 0.0F);
        this.setRotateAngle(tailend, -0.05F, -0.2F, 0.0F);
        this.setRotateAngle(rightthigh, 0.3F, -0.4F, -0.2F);
        this.setRotateAngle(rightshin, 0.9F, 0.0F, 0.05F);
        this.setRotateAngle(rightankle, -0.75F, 0.0F, 0.0F);
        this.setRotateAngle(rightfoot, 0.2F, 0.0F, 0.0F);
        this.setRotateAngle(righttoes, 0.0F, 0.0F, 0.0F);
        this.setRotateAngle(leftthigh, -0.15F, -0.2F, 0.2F);
        this.setRotateAngle(leftshin, 0.6F, 0.0F, -0.2F);
        this.setRotateAngle(leftankle, -0.55F, 0.0F, 0.0F);
        this.setRotateAngle(leftfoot, 0.6F, 0.0F, 0.0F);
        this.setRotateAngle(lefttoes, 0.0F, 0.0F, 0.0F);
        this.setRotateAngle(rightupperarm, 0.0F, -0.7F, -0.5F);
        this.setRotateAngle(rightlowerarm, -0.5F, -0.3F, -0.3F);
        this.setRotateAngle(righthand, 0.0F, 0.3F, -0.3F);
        this.setRotateAngle(leftupperarm, 0.8F, -0.1F, 0.2F);
        this.setRotateAngle(leftlowerarm, -0.5F, -0.1F, -0.1F);
        this.setRotateAngle(lefthand, 0.0F, -0.2F, -0.2F);
        this.root.offsetZ = 0.0F;
        this.root.offsetY = -0.09F;
        this.root.offsetX = 0.0F;
        this.root.render(0.01F);
        resetToDefaultPose();
    }

    @Override
    public void renderStaticBook(float f) {
        //Rotations, positions and sizing:
        this.root.offsetY = 0.55F;
        this.root.offsetX = 0.15F;
        this.root.rotateAngleY = (float)Math.toRadians(220);
        this.root.rotateAngleX = (float)Math.toRadians(-2);
        this.root.rotateAngleZ = (float)Math.toRadians(2);
        this.root.scaleChildren = true;
        float scaler = 0.8F;
        this.root.setScale(scaler, scaler, scaler);
        //Start of pose:
        this.setRotateAngle(root, -0.45F, 4.0F, 0.1F);
        this.setRotateAngle(bodymiddle, -0.05F, -0.2F, -0.15F);
        this.setRotateAngle(bodyfront, 0.2F, -0.1F, -0.15F);
        this.setRotateAngle(neckbase, -0.3F, -0.2F, -0.2F);
        this.setRotateAngle(neckmiddlebase, -0.1F, -0.2F, -0.1F);
        this.setRotateAngle(neckmiddlefront, -0.2F, -0.2F, -0.05F);
        this.setRotateAngle(neckfront, 0.65F, -0.2F, -0.05F);
        this.setRotateAngle(head, 0.5F, -0.2F, -0.0F);
        this.setRotateAngle(lowerjawbase, 0.3F, 0.0F, 0.0F);
        this.setRotateAngle(tailbase, -0.1F, 0.0F, 0.0F);
        this.setRotateAngle(tailmiddlebase, 0.5F, -0.05F, 0.0F);
        this.setRotateAngle(tailmiddle, 0.5F, -0.1F, 0.0F);
        this.setRotateAngle(tailmiddleend, 0.9F, -0.2F, 0.0F);
        this.setRotateAngle(tailend, 0.9F, -0.2F, 0.0F);
        this.setRotateAngle(rightthigh, 0.3F, -0.4F, -0.2F);
        this.setRotateAngle(rightshin, 0.9F, 0.0F, 0.05F);
        this.setRotateAngle(rightankle, -0.75F, 0.0F, 0.0F);
        this.setRotateAngle(rightfoot, 0.2F, 0.0F, 0.0F);
        this.setRotateAngle(righttoes, 0.0F, 0.0F, 0.0F);
        this.setRotateAngle(leftthigh, -0.15F, -0.2F, 0.2F);
        this.setRotateAngle(leftshin, 0.6F, 0.0F, -0.2F);
        this.setRotateAngle(leftankle, -0.55F, 0.0F, 0.0F);
        this.setRotateAngle(leftfoot, 0.6F, 0.0F, 0.0F);
        this.setRotateAngle(lefttoes, 0.0F, 0.0F, 0.0F);
        this.setRotateAngle(rightupperarm, 0.0F, -0.7F, -0.5F);
        this.setRotateAngle(rightlowerarm, -0.5F, -0.3F, -0.3F);
        this.setRotateAngle(righthand, 0.0F, 0.3F, -0.3F);
        this.setRotateAngle(leftupperarm, 0.8F, 0.3F, 0.2F);
        this.setRotateAngle(leftlowerarm, -0.5F, -0.1F, -0.1F);
        this.setRotateAngle(lefthand, 0.0F, -0.2F, -0.2F);
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

        EntityPrehistoricFloraAnchisaurus entityAnchisaurus = (EntityPrehistoricFloraAnchisaurus) e;

        this.faceTarget(f3, f4, 12, neckbase);
        this.faceTarget(f3, f4, 12, neckmiddlebase);
        this.faceTarget(f3, f4, 12, neckmiddlefront);
        this.faceTarget(f3, f4, 12, neckfront);
        this.faceTarget(f3, f4, 12, head);

        AdvancedModelRenderer[] Tail = {this.tailbase, this.tailmiddlebase, this.tailmiddle, this.tailmiddleend, this.tailend};
        AdvancedModelRenderer[] Neck = {this.neckbase, this.neckmiddlebase, this.neckmiddlefront, this.neckfront, this.head};
        AdvancedModelRenderer[] ArmL = {this.rightupperarm, this.rightlowerarm};
        AdvancedModelRenderer[] ArmR = {this.leftupperarm, this.leftlowerarm};

        entityAnchisaurus.tailBuffer.applyChainSwingBuffer(Tail);

        if (entityAnchisaurus.getAnimation() == entityAnchisaurus.LAY_ANIMATION) {
            this.chainSwing(Neck, 0.5F, 0.10F, 0.5, f2, 0.8F);
            this.chainWave(Neck, 0.5F * 2, -0.02F, 0.5F, f2, 0.8F);
        }
        else {
            if (!entityAnchisaurus.isReallyInWater()) {

                if (f3 == 0.0F || !entityAnchisaurus.getIsMoving()) {
                    if (entityAnchisaurus.getAnimation() != entityAnchisaurus.EAT_ANIMATION
                        && entityAnchisaurus.getAnimation() != entityAnchisaurus.DRINK_ANIMATION) {
                        this.chainSwing(Neck, 0.05F, 0.10F, 0.5, f2, 0.8F);
                        this.chainWave(Neck, 0.05F * 2, -0.02F, 0.5F, f2, 0.8F);
                        this.chainWaveExtended(ArmL, 0.175F, 0.03F, 0.1F, 3F, f2, 1F);
                        this.chainWaveExtended(ArmR, 0.175F, -0.03F, -0.1F, 0f, f2, 1F);
                        this.chainFlapExtended(ArmL, 0.175F, -0.03F, 0.1F, 3F, f2, 1F);
                        this.chainFlapExtended(ArmR, 0.175F, -0.03F, -0.1F, 0f, f2, 1F);
                    }

                    this.chainWave(Tail, (0.15F * 0.35F), 0.125F * 0.15F, 0.2F, f2, 1F);
                    this.chainSwing(Tail, (0.15F * 0.35F) * 4F, 0.05F * 0.35F, 0.12F, f2, 1F);


                    return;
                }

                if (entityAnchisaurus.getIsFast()) { //Running


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
        EntityPrehistoricFloraAnchisaurus ee = (EntityPrehistoricFloraAnchisaurus) entitylivingbaseIn;

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
        else if (ee.getAnimation() == ee.GRAZE_ANIMATION) { //The graze anim
            animGraze(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime, ee.getAnimationTick());
        }
        else if (ee.getAnimation() == ee.NOISE_ANIMATION) { //The noise anim
            animNoise(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime, ee.getAnimationTick());
        }
        else if (ee.getAnimation() == ee.SCRATCH_RIGHT_ANIMATION) { //The noise anim
            animScratchRight(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime, ee.getAnimationTick());
        }
        else if (ee.getAnimation() == ee.SCRATCH_LEFT_ANIMATION) { //The noise anim
            animScratchLeft(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime, ee.getAnimationTick());
        }
        else if (ee.getAnimation() == ee.LOOK_ANIMATION) { //The noise anim
            animLook(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime, ee.getAnimationTick());
        }

    }

    public void animScratchLeft(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime, double animTick) {
        EntityPrehistoricFloraAnchisaurus entity = (EntityPrehistoricFloraAnchisaurus) entitylivingbaseIn;

        int animCycle = 60;
        double tickAnim = animTick + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;
         if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 0) / 10) * (-10-(0)));
            yy = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 18) {
            xx = -10 + (((tickAnim - 10) / 8) * (-9.96657-(-10)));
            yy = 0 + (((tickAnim - 10) / 8) * (-0.51127-(0)));
            zz = 0 + (((tickAnim - 10) / 8) * (-7.48265-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 27) {
            xx = -9.96657 + (((tickAnim - 18) / 9) * (-7.51259-(-9.96657)));
            yy = -0.51127 + (((tickAnim - 18) / 9) * (-0.19139-(-0.51127)));
            zz = -7.48265 + (((tickAnim - 18) / 9) * (1.98427-(-7.48265)));
        }
        else if (tickAnim >= 27 && tickAnim < 38) {
            xx = -7.51259 + (((tickAnim - 27) / 11) * (-3.66746-(-7.51259)));
            yy = -0.19139 + (((tickAnim - 27) / 11) * (-0.10253-(-0.19139)));
            zz = 1.98427 + (((tickAnim - 27) / 11) * (1.063-(1.98427)));
        }
        else if (tickAnim >= 38 && tickAnim < 43) {
            xx = -3.66746 + (((tickAnim - 38) / 5) * (-7.85117-(-3.66746)));
            yy = -0.10253 + (((tickAnim - 38) / 5) * (-0.15258-(-0.10253)));
            zz = 1.063 + (((tickAnim - 38) / 5) * (-1.71927-(1.063)));
        }
        else if (tickAnim >= 43 && tickAnim < 50) {
            xx = -7.85117 + (((tickAnim - 43) / 7) * (-10-(-7.85117)));
            yy = -0.15258 + (((tickAnim - 43) / 7) * (0-(-0.15258)));
            zz = -1.71927 + (((tickAnim - 43) / 7) * (0-(-1.71927)));
        }
        else if (tickAnim >= 50 && tickAnim < 60) {
            xx = -10 + (((tickAnim - 50) / 10) * (0-(-10)));
            yy = 0 + (((tickAnim - 50) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 50) / 10) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(bodymiddle, bodymiddle.rotateAngleX + (float) Math.toRadians(xx), bodymiddle.rotateAngleY + (float) Math.toRadians(yy), bodymiddle.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 0) / 10) * (5-(0)));
            yy = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 18) {
            xx = 5 + (((tickAnim - 10) / 8) * (-2.51239-(5)));
            yy = 0 + (((tickAnim - 10) / 8) * (-0.58386-(0)));
            zz = 0 + (((tickAnim - 10) / 8) * (2.43091-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 27) {
            xx = -2.51239 + (((tickAnim - 18) / 9) * (-0.56152-(-2.51239)));
            yy = -0.58386 + (((tickAnim - 18) / 9) * (-0.77654-(-0.58386)));
            zz = 2.43091 + (((tickAnim - 18) / 9) * (4.26723-(2.43091)));
        }
        else if (tickAnim >= 27 && tickAnim < 35) {
            xx = -0.56152 + (((tickAnim - 27) / 8) * (-1.06067-(-0.56152)));
            yy = -0.77654 + (((tickAnim - 27) / 8) * (-0.17534-(-0.77654)));
            zz = 4.26723 + (((tickAnim - 27) / 8) * (0.26424-(4.26723)));
        }
        else if (tickAnim >= 35 && tickAnim < 42) {
            xx = -1.06067 + (((tickAnim - 35) / 7) * (6.63296-(-1.06067)));
            yy = -0.17534 + (((tickAnim - 35) / 7) * (-0.09741-(-0.17534)));
            zz = 0.26424 + (((tickAnim - 35) / 7) * (0.1468-(0.26424)));
        }
        else if (tickAnim >= 42 && tickAnim < 50) {
            xx = 6.63296 + (((tickAnim - 42) / 8) * (5-(6.63296)));
            yy = -0.09741 + (((tickAnim - 42) / 8) * (0-(-0.09741)));
            zz = 0.1468 + (((tickAnim - 42) / 8) * (0-(0.1468)));
        }
        else if (tickAnim >= 50 && tickAnim < 60) {
            xx = 5 + (((tickAnim - 50) / 10) * (0-(5)));
            yy = 0 + (((tickAnim - 50) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 50) / 10) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(bodyfront, bodyfront.rotateAngleX + (float) Math.toRadians(xx), bodyfront.rotateAngleY + (float) Math.toRadians(yy), bodyfront.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 0) / 10) * (-2.5-(0)));
            yy = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 20) {
            xx = -2.5 + (((tickAnim - 10) / 10) * (5-(-2.5)));
            yy = 0 + (((tickAnim - 10) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 10) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 29) {
            xx = 5 + (((tickAnim - 20) / 9) * (12.71-(5)));
            yy = 0 + (((tickAnim - 20) / 9) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 9) * (0-(0)));
        }
        else if (tickAnim >= 29 && tickAnim < 39) {
            xx = 12.71 + (((tickAnim - 29) / 10) * (7.91-(12.71)));
            yy = 0 + (((tickAnim - 29) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 29) / 10) * (0-(0)));
        }
        else if (tickAnim >= 39 && tickAnim < 50) {
            xx = 7.91 + (((tickAnim - 39) / 11) * (-2.5-(7.91)));
            yy = 0 + (((tickAnim - 39) / 11) * (0-(0)));
            zz = 0 + (((tickAnim - 39) / 11) * (0-(0)));
        }
        else if (tickAnim >= 50 && tickAnim < 60) {
            xx = -2.5 + (((tickAnim - 50) / 10) * (0-(-2.5)));
            yy = 0 + (((tickAnim - 50) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 50) / 10) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neckbase, neckbase.rotateAngleX + (float) Math.toRadians(xx), neckbase.rotateAngleY + (float) Math.toRadians(yy), neckbase.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 0) / 10) * (5-(0)));
            yy = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 20) {
            xx = 5 + (((tickAnim - 10) / 10) * (12.5-(5)));
            yy = 0 + (((tickAnim - 10) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 10) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 29) {
            xx = 12.5 + (((tickAnim - 20) / 9) * (22.05-(12.5)));
            yy = 0 + (((tickAnim - 20) / 9) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 9) * (0-(0)));
        }
        else if (tickAnim >= 29 && tickAnim < 36) {
            xx = 22.05 + (((tickAnim - 29) / 7) * (16.04-(22.05)));
            yy = 0 + (((tickAnim - 29) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 29) / 7) * (0-(0)));
        }
        else if (tickAnim >= 36 && tickAnim < 50) {
            xx = 16.04 + (((tickAnim - 36) / 14) * (5-(16.04)));
            yy = 0 + (((tickAnim - 36) / 14) * (0-(0)));
            zz = 0 + (((tickAnim - 36) / 14) * (0-(0)));
        }
        else if (tickAnim >= 50 && tickAnim < 60) {
            xx = 5 + (((tickAnim - 50) / 10) * (0-(5)));
            yy = 0 + (((tickAnim - 50) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 50) / 10) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neckmiddlebase, neckmiddlebase.rotateAngleX + (float) Math.toRadians(xx), neckmiddlebase.rotateAngleY + (float) Math.toRadians(yy), neckmiddlebase.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 0) / 10) * (-5-(0)));
            yy = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 15) {
            xx = -5 + (((tickAnim - 10) / 5) * (9.17-(-5)));
            yy = 0 + (((tickAnim - 10) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 5) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 20) {
            xx = 9.17 + (((tickAnim - 15) / 5) * (0-(9.17)));
            yy = 0 + (((tickAnim - 15) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 5) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 31) {
            xx = 0 + (((tickAnim - 20) / 11) * (3.19-(0)));
            yy = 0 + (((tickAnim - 20) / 11) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 11) * (0-(0)));
        }
        else if (tickAnim >= 31 && tickAnim < 50) {
            xx = 3.19 + (((tickAnim - 31) / 19) * (-5-(3.19)));
            yy = 0 + (((tickAnim - 31) / 19) * (0-(0)));
            zz = 0 + (((tickAnim - 31) / 19) * (0-(0)));
        }
        else if (tickAnim >= 50 && tickAnim < 60) {
            xx = -5 + (((tickAnim - 50) / 10) * (0-(-5)));
            yy = 0 + (((tickAnim - 50) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 50) / 10) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neckmiddlefront, neckmiddlefront.rotateAngleX + (float) Math.toRadians(xx), neckmiddlefront.rotateAngleY + (float) Math.toRadians(yy), neckmiddlefront.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 0) / 10) * (2.5-(0)));
            yy = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 20) {
            xx = 2.5 + (((tickAnim - 10) / 10) * (-5-(2.5)));
            yy = 0 + (((tickAnim - 10) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 10) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 29) {
            xx = -5 + (((tickAnim - 20) / 9) * (3.37-(-5)));
            yy = 0 + (((tickAnim - 20) / 9) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 9) * (0-(0)));
        }
        else if (tickAnim >= 29 && tickAnim < 38) {
            xx = 3.37 + (((tickAnim - 29) / 9) * (-8.12-(3.37)));
            yy = 0 + (((tickAnim - 29) / 9) * (0-(0)));
            zz = 0 + (((tickAnim - 29) / 9) * (0-(0)));
        }
        else if (tickAnim >= 38 && tickAnim < 50) {
            xx = -8.12 + (((tickAnim - 38) / 12) * (2.5-(-8.12)));
            yy = 0 + (((tickAnim - 38) / 12) * (0-(0)));
            zz = 0 + (((tickAnim - 38) / 12) * (0-(0)));
        }
        else if (tickAnim >= 50 && tickAnim < 60) {
            xx = 2.5 + (((tickAnim - 50) / 10) * (0-(2.5)));
            yy = 0 + (((tickAnim - 50) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 50) / 10) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neckfront, neckfront.rotateAngleX + (float) Math.toRadians(xx), neckfront.rotateAngleY + (float) Math.toRadians(yy), neckfront.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 0) / 20) * (-7.6934-(0)));
            yy = 0 + (((tickAnim - 0) / 20) * (2.26914-(0)));
            zz = 0 + (((tickAnim - 0) / 20) * (-9.7417-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 29) {
            xx = -7.6934 + (((tickAnim - 20) / 9) * (-2.63033-(-7.6934)));
            yy = 2.26914 + (((tickAnim - 20) / 9) * (1.74913-(2.26914)));
            zz = -9.7417 + (((tickAnim - 20) / 9) * (-7.50923-(-9.7417)));
        }
        else if (tickAnim >= 29 && tickAnim < 41) {
            xx = -2.63033 + (((tickAnim - 29) / 12) * (3.81358-(-2.63033)));
            yy = 1.74913 + (((tickAnim - 29) / 12) * (1.0873-(1.74913)));
            zz = -7.50923 + (((tickAnim - 29) / 12) * (-4.6679-(-7.50923)));
        }
        else if (tickAnim >= 41 && tickAnim < 48) {
            xx = 3.81358 + (((tickAnim - 41) / 7) * (-15.17869-(3.81358)));
            yy = 1.0873 + (((tickAnim - 41) / 7) * (0.66183-(1.0873)));
            zz = -4.6679 + (((tickAnim - 41) / 7) * (-2.84133-(-4.6679)));
        }
        else if (tickAnim >= 48 && tickAnim < 60) {
            xx = -15.17869 + (((tickAnim - 48) / 12) * (0-(-15.17869)));
            yy = 0.66183 + (((tickAnim - 48) / 12) * (0-(0.66183)));
            zz = -2.84133 + (((tickAnim - 48) / 12) * (0-(-2.84133)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(head, head.rotateAngleX + (float) Math.toRadians(xx), head.rotateAngleY + (float) Math.toRadians(yy), head.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 12) {
            xx = 0 + (((tickAnim - 0) / 12) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 12) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 12) * (0-(0)));
        }
        else if (tickAnim >= 12 && tickAnim < 14) {
            xx = 0 + (((tickAnim - 12) / 2) * (10-(0)));
            yy = 0 + (((tickAnim - 12) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 12) / 2) * (0-(0)));
        }
        else if (tickAnim >= 14 && tickAnim < 17) {
            xx = 10 + (((tickAnim - 14) / 3) * (0-(10)));
            yy = 0 + (((tickAnim - 14) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 14) / 3) * (0-(0)));
        }
        else if (tickAnim >= 17 && tickAnim < 43) {
            xx = 0 + (((tickAnim - 17) / 26) * (0-(0)));
            yy = 0 + (((tickAnim - 17) / 26) * (0-(0)));
            zz = 0 + (((tickAnim - 17) / 26) * (0-(0)));
        }
        else if (tickAnim >= 43 && tickAnim < 45) {
            xx = 0 + (((tickAnim - 43) / 2) * (10-(0)));
            yy = 0 + (((tickAnim - 43) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 43) / 2) * (0-(0)));
        }
        else if (tickAnim >= 45 && tickAnim < 48) {
            xx = 10 + (((tickAnim - 45) / 3) * (0-(10)));
            yy = 0 + (((tickAnim - 45) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 45) / 3) * (0-(0)));
        }
        else if (tickAnim >= 48 && tickAnim < 60) {
            xx = 0 + (((tickAnim - 48) / 12) * (0-(0)));
            yy = 0 + (((tickAnim - 48) / 12) * (0-(0)));
            zz = 0 + (((tickAnim - 48) / 12) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(lowerjawbase, lowerjawbase.rotateAngleX + (float) Math.toRadians(xx), lowerjawbase.rotateAngleY + (float) Math.toRadians(yy), lowerjawbase.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 0) / 10) * (48.89231-(0)));
            yy = 0 + (((tickAnim - 0) / 10) * (5.17621-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (27.78159-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 15) {
            xx = 48.89231 + (((tickAnim - 10) / 5) * (41.39231-(48.89231)));
            yy = 5.17621 + (((tickAnim - 10) / 5) * (5.17621-(5.17621)));
            zz = 27.78159 + (((tickAnim - 10) / 5) * (27.78159-(27.78159)));
        }
        else if (tickAnim >= 15 && tickAnim < 18) {
            xx = 41.39231 + (((tickAnim - 15) / 3) * (49.60659-(41.39231)));
            yy = 5.17621 + (((tickAnim - 15) / 3) * (5.17621-(5.17621)));
            zz = 27.78159 + (((tickAnim - 15) / 3) * (27.78159-(27.78159)));
        }
        else if (tickAnim >= 18 && tickAnim < 22) {
            xx = 49.60659 + (((tickAnim - 18) / 4) * (44.53141-(49.60659)));
            yy = 5.17621 + (((tickAnim - 18) / 4) * (5.17621-(5.17621)));
            zz = 27.78159 + (((tickAnim - 18) / 4) * (27.78159-(27.78159)));
        }
        else if (tickAnim >= 22 && tickAnim < 28) {
            xx = 44.53141 + (((tickAnim - 22) / 6) * (52.92924-(44.53141)));
            yy = 5.17621 + (((tickAnim - 22) / 6) * (5.17621-(5.17621)));
            zz = 27.78159 + (((tickAnim - 22) / 6) * (27.78159-(27.78159)));
        }
        else if (tickAnim >= 28 && tickAnim < 32) {
            xx = 52.92924 + (((tickAnim - 28) / 4) * (42.18166-(52.92924)));
            yy = 5.17621 + (((tickAnim - 28) / 4) * (5.17621-(5.17621)));
            zz = 27.78159 + (((tickAnim - 28) / 4) * (27.78159-(27.78159)));
        }
        else if (tickAnim >= 32 && tickAnim < 36) {
            xx = 42.18166 + (((tickAnim - 32) / 4) * (48.70681-(42.18166)));
            yy = 5.17621 + (((tickAnim - 32) / 4) * (5.17621-(5.17621)));
            zz = 27.78159 + (((tickAnim - 32) / 4) * (27.78159-(27.78159)));
        }
        else if (tickAnim >= 36 && tickAnim < 41) {
            xx = 48.70681 + (((tickAnim - 36) / 5) * (46.27228-(48.70681)));
            yy = 5.17621 + (((tickAnim - 36) / 5) * (5.17621-(5.17621)));
            zz = 27.78159 + (((tickAnim - 36) / 5) * (27.78159-(27.78159)));
        }
        else if (tickAnim >= 41 && tickAnim < 44) {
            xx = 46.27228 + (((tickAnim - 41) / 3) * (42.22502-(46.27228)));
            yy = 5.17621 + (((tickAnim - 41) / 3) * (5.17621-(5.17621)));
            zz = 27.78159 + (((tickAnim - 41) / 3) * (27.78159-(27.78159)));
        }
        else if (tickAnim >= 44 && tickAnim < 50) {
            xx = 42.22502 + (((tickAnim - 44) / 6) * (48.89231-(42.22502)));
            yy = 5.17621 + (((tickAnim - 44) / 6) * (5.17621-(5.17621)));
            zz = 27.78159 + (((tickAnim - 44) / 6) * (27.78159-(27.78159)));
        }
        else if (tickAnim >= 50 && tickAnim < 60) {
            xx = 48.89231 + (((tickAnim - 50) / 10) * (0-(48.89231)));
            yy = 5.17621 + (((tickAnim - 50) / 10) * (0-(5.17621)));
            zz = 27.78159 + (((tickAnim - 50) / 10) * (0-(27.78159)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightupperarm, rightupperarm.rotateAngleX + (float) Math.toRadians(xx), rightupperarm.rotateAngleY + (float) Math.toRadians(yy), rightupperarm.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 0) / 10) * (-7.5-(0)));
            yy = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 15) {
            xx = -7.5 + (((tickAnim - 10) / 5) * (0-(-7.5)));
            yy = 0 + (((tickAnim - 10) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 5) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 18) {
            xx = 0 + (((tickAnim - 15) / 3) * (-7.5-(0)));
            yy = 0 + (((tickAnim - 15) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 3) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 20) {
            xx = -7.5 + (((tickAnim - 18) / 2) * (0-(-7.5)));
            yy = 0 + (((tickAnim - 18) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 18) / 2) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 22) {
            xx = 0 + (((tickAnim - 20) / 2) * (-7.5-(0)));
            yy = 0 + (((tickAnim - 20) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 2) * (0-(0)));
        }
        else if (tickAnim >= 22 && tickAnim < 24) {
            xx = -7.5 + (((tickAnim - 22) / 2) * (0-(-7.5)));
            yy = 0 + (((tickAnim - 22) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 22) / 2) * (0-(0)));
        }
        else if (tickAnim >= 24 && tickAnim < 27) {
            xx = 0 + (((tickAnim - 24) / 3) * (-7.5-(0)));
            yy = 0 + (((tickAnim - 24) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 24) / 3) * (0-(0)));
        }
        else if (tickAnim >= 27 && tickAnim < 29) {
            xx = -7.5 + (((tickAnim - 27) / 2) * (0-(-7.5)));
            yy = 0 + (((tickAnim - 27) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 27) / 2) * (0-(0)));
        }
        else if (tickAnim >= 29 && tickAnim < 32) {
            xx = 0 + (((tickAnim - 29) / 3) * (-7.5-(0)));
            yy = 0 + (((tickAnim - 29) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 29) / 3) * (0-(0)));
        }
        else if (tickAnim >= 32 && tickAnim < 34) {
            xx = -7.5 + (((tickAnim - 32) / 2) * (0-(-7.5)));
            yy = 0 + (((tickAnim - 32) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 32) / 2) * (0-(0)));
        }
        else if (tickAnim >= 34 && tickAnim < 38) {
            xx = 0 + (((tickAnim - 34) / 4) * (-7.5-(0)));
            yy = 0 + (((tickAnim - 34) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 34) / 4) * (0-(0)));
        }
        else if (tickAnim >= 38 && tickAnim < 40) {
            xx = -7.5 + (((tickAnim - 38) / 2) * (0-(-7.5)));
            yy = 0 + (((tickAnim - 38) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 38) / 2) * (0-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 43) {
            xx = 0 + (((tickAnim - 40) / 3) * (-7.5-(0)));
            yy = 0 + (((tickAnim - 40) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 40) / 3) * (0-(0)));
        }
        else if (tickAnim >= 43 && tickAnim < 45) {
            xx = -7.5 + (((tickAnim - 43) / 2) * (0-(-7.5)));
            yy = 0 + (((tickAnim - 43) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 43) / 2) * (0-(0)));
        }
        else if (tickAnim >= 45 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 45) / 5) * (-7.5-(0)));
            yy = 0 + (((tickAnim - 45) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 45) / 5) * (0-(0)));
        }
        else if (tickAnim >= 50 && tickAnim < 60) {
            xx = -7.5 + (((tickAnim - 50) / 10) * (0-(-7.5)));
            yy = 0 + (((tickAnim - 50) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 50) / 10) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightlowerarm, rightlowerarm.rotateAngleX + (float) Math.toRadians(xx), rightlowerarm.rotateAngleY + (float) Math.toRadians(yy), rightlowerarm.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (15-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 10) / 5) * (0-(0)));
            yy = 0 + (((tickAnim - 10) / 5) * (0-(0)));
            zz = 15 + (((tickAnim - 10) / 5) * (0-(15)));
        }
        else if (tickAnim >= 15 && tickAnim < 17) {
            xx = 0 + (((tickAnim - 15) / 2) * (0-(0)));
            yy = 0 + (((tickAnim - 15) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 2) * (13.21-(0)));
        }
        else if (tickAnim >= 17 && tickAnim < 18) {
            xx = 0 + (((tickAnim - 17) / 1) * (0-(0)));
            yy = 0 + (((tickAnim - 17) / 1) * (0-(0)));
            zz = 13.21 + (((tickAnim - 17) / 1) * (5.8-(13.21)));
        }
        else if (tickAnim >= 18 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 18) / 2) * (0-(0)));
            yy = 0 + (((tickAnim - 18) / 2) * (0-(0)));
            zz = 5.8 + (((tickAnim - 18) / 2) * (13.21-(5.8)));
        }
        else if (tickAnim >= 20 && tickAnim < 22) {
            xx = 0 + (((tickAnim - 20) / 2) * (0-(0)));
            yy = 0 + (((tickAnim - 20) / 2) * (0-(0)));
            zz = 13.21 + (((tickAnim - 20) / 2) * (5.8-(13.21)));
        }
        else if (tickAnim >= 22 && tickAnim < 23) {
            xx = 0 + (((tickAnim - 22) / 1) * (0-(0)));
            yy = 0 + (((tickAnim - 22) / 1) * (0-(0)));
            zz = 5.8 + (((tickAnim - 22) / 1) * (13.21-(5.8)));
        }
        else if (tickAnim >= 23 && tickAnim < 25) {
            xx = 0 + (((tickAnim - 23) / 2) * (0-(0)));
            yy = 0 + (((tickAnim - 23) / 2) * (0-(0)));
            zz = 13.21 + (((tickAnim - 23) / 2) * (5.8-(13.21)));
        }
        else if (tickAnim >= 25 && tickAnim < 28) {
            xx = 0 + (((tickAnim - 25) / 3) * (0-(0)));
            yy = 0 + (((tickAnim - 25) / 3) * (0-(0)));
            zz = 5.8 + (((tickAnim - 25) / 3) * (13.21-(5.8)));
        }
        else if (tickAnim >= 28 && tickAnim < 29) {
            xx = 0 + (((tickAnim - 28) / 1) * (0-(0)));
            yy = 0 + (((tickAnim - 28) / 1) * (0-(0)));
            zz = 13.21 + (((tickAnim - 28) / 1) * (5.8-(13.21)));
        }
        else if (tickAnim >= 29 && tickAnim < 31) {
            xx = 0 + (((tickAnim - 29) / 2) * (0-(0)));
            yy = 0 + (((tickAnim - 29) / 2) * (0-(0)));
            zz = 5.8 + (((tickAnim - 29) / 2) * (13.21-(5.8)));
        }
        else if (tickAnim >= 31 && tickAnim < 33) {
            xx = 0 + (((tickAnim - 31) / 2) * (0-(0)));
            yy = 0 + (((tickAnim - 31) / 2) * (0-(0)));
            zz = 13.21 + (((tickAnim - 31) / 2) * (5.8-(13.21)));
        }
        else if (tickAnim >= 33 && tickAnim < 35) {
            xx = 0 + (((tickAnim - 33) / 2) * (0-(0)));
            yy = 0 + (((tickAnim - 33) / 2) * (0-(0)));
            zz = 5.8 + (((tickAnim - 33) / 2) * (13.21-(5.8)));
        }
        else if (tickAnim >= 35 && tickAnim < 37) {
            xx = 0 + (((tickAnim - 35) / 2) * (0-(0)));
            yy = 0 + (((tickAnim - 35) / 2) * (0-(0)));
            zz = 13.21 + (((tickAnim - 35) / 2) * (5.8-(13.21)));
        }
        else if (tickAnim >= 37 && tickAnim < 39) {
            xx = 0 + (((tickAnim - 37) / 2) * (0-(0)));
            yy = 0 + (((tickAnim - 37) / 2) * (0-(0)));
            zz = 5.8 + (((tickAnim - 37) / 2) * (13.21-(5.8)));
        }
        else if (tickAnim >= 39 && tickAnim < 41) {
            xx = 0 + (((tickAnim - 39) / 2) * (0-(0)));
            yy = 0 + (((tickAnim - 39) / 2) * (0-(0)));
            zz = 13.21 + (((tickAnim - 39) / 2) * (5.8-(13.21)));
        }
        else if (tickAnim >= 41 && tickAnim < 43) {
            xx = 0 + (((tickAnim - 41) / 2) * (0-(0)));
            yy = 0 + (((tickAnim - 41) / 2) * (0-(0)));
            zz = 5.8 + (((tickAnim - 41) / 2) * (13.21-(5.8)));
        }
        else if (tickAnim >= 43 && tickAnim < 44) {
            xx = 0 + (((tickAnim - 43) / 1) * (0-(0)));
            yy = 0 + (((tickAnim - 43) / 1) * (0-(0)));
            zz = 13.21 + (((tickAnim - 43) / 1) * (5.8-(13.21)));
        }
        else if (tickAnim >= 44 && tickAnim < 45) {
            xx = 0 + (((tickAnim - 44) / 1) * (0-(0)));
            yy = 0 + (((tickAnim - 44) / 1) * (0-(0)));
            zz = 5.8 + (((tickAnim - 44) / 1) * (13.21-(5.8)));
        }
        else if (tickAnim >= 45 && tickAnim < 47) {
            xx = 0 + (((tickAnim - 45) / 2) * (0-(0)));
            yy = 0 + (((tickAnim - 45) / 2) * (0-(0)));
            zz = 13.21 + (((tickAnim - 45) / 2) * (5.8-(13.21)));
        }
        else if (tickAnim >= 47 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 47) / 3) * (0-(0)));
            yy = 0 + (((tickAnim - 47) / 3) * (0-(0)));
            zz = 5.8 + (((tickAnim - 47) / 3) * (15-(5.8)));
        }
        else if (tickAnim >= 50 && tickAnim < 60) {
            xx = 0 + (((tickAnim - 50) / 10) * (0-(0)));
            yy = 0 + (((tickAnim - 50) / 10) * (0-(0)));
            zz = 15 + (((tickAnim - 50) / 10) * (0-(15)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(righthand, righthand.rotateAngleX + (float) Math.toRadians(xx), righthand.rotateAngleY + (float) Math.toRadians(yy), righthand.rotateAngleZ + (float) Math.toRadians(zz));

    }
    public void animScratchRight(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime, double animTick) {
        EntityPrehistoricFloraAnchisaurus entity = (EntityPrehistoricFloraAnchisaurus) entitylivingbaseIn;
        int animCycle = 60;
        double tickAnim = animTick + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;
         if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 0) / 10) * (-10-(0)));
            yy = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 18) {
            xx = -10 + (((tickAnim - 10) / 8) * (-9.96657-(-10)));
            yy = 0 + (((tickAnim - 10) / 8) * (0.51127-(0)));
            zz = 0 + (((tickAnim - 10) / 8) * (7.48265-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 27) {
            xx = -9.96657 + (((tickAnim - 18) / 9) * (-7.51259-(-9.96657)));
            yy = 0.51127 + (((tickAnim - 18) / 9) * (0.19139-(0.51127)));
            zz = 7.48265 + (((tickAnim - 18) / 9) * (-1.98427-(7.48265)));
        }
        else if (tickAnim >= 27 && tickAnim < 38) {
            xx = -7.51259 + (((tickAnim - 27) / 11) * (-3.66746-(-7.51259)));
            yy = 0.19139 + (((tickAnim - 27) / 11) * (0.10253-(0.19139)));
            zz = -1.98427 + (((tickAnim - 27) / 11) * (-1.063-(-1.98427)));
        }
        else if (tickAnim >= 38 && tickAnim < 43) {
            xx = -3.66746 + (((tickAnim - 38) / 5) * (-7.85117-(-3.66746)));
            yy = 0.10253 + (((tickAnim - 38) / 5) * (0.15258-(0.10253)));
            zz = -1.063 + (((tickAnim - 38) / 5) * (1.71927-(-1.063)));
        }
        else if (tickAnim >= 43 && tickAnim < 50) {
            xx = -7.85117 + (((tickAnim - 43) / 7) * (-10-(-7.85117)));
            yy = 0.15258 + (((tickAnim - 43) / 7) * (0-(0.15258)));
            zz = 1.71927 + (((tickAnim - 43) / 7) * (0-(1.71927)));
        }
        else if (tickAnim >= 50 && tickAnim < 60) {
            xx = -10 + (((tickAnim - 50) / 10) * (0-(-10)));
            yy = 0 + (((tickAnim - 50) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 50) / 10) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(bodymiddle, bodymiddle.rotateAngleX + (float) Math.toRadians(xx), bodymiddle.rotateAngleY + (float) Math.toRadians(yy), bodymiddle.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 0) / 10) * (5-(0)));
            yy = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 18) {
            xx = 5 + (((tickAnim - 10) / 8) * (-2.51239-(5)));
            yy = 0 + (((tickAnim - 10) / 8) * (0.58386-(0)));
            zz = 0 + (((tickAnim - 10) / 8) * (-2.43091-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 27) {
            xx = -2.51239 + (((tickAnim - 18) / 9) * (-0.56152-(-2.51239)));
            yy = 0.58386 + (((tickAnim - 18) / 9) * (0.77654-(0.58386)));
            zz = -2.43091 + (((tickAnim - 18) / 9) * (-4.26723-(-2.43091)));
        }
        else if (tickAnim >= 27 && tickAnim < 35) {
            xx = -0.56152 + (((tickAnim - 27) / 8) * (-1.06067-(-0.56152)));
            yy = 0.77654 + (((tickAnim - 27) / 8) * (0.17534-(0.77654)));
            zz = -4.26723 + (((tickAnim - 27) / 8) * (-0.26424-(-4.26723)));
        }
        else if (tickAnim >= 35 && tickAnim < 42) {
            xx = -1.06067 + (((tickAnim - 35) / 7) * (6.63296-(-1.06067)));
            yy = 0.17534 + (((tickAnim - 35) / 7) * (0.09741-(0.17534)));
            zz = -0.26424 + (((tickAnim - 35) / 7) * (-0.1468-(-0.26424)));
        }
        else if (tickAnim >= 42 && tickAnim < 50) {
            xx = 6.63296 + (((tickAnim - 42) / 8) * (5-(6.63296)));
            yy = 0.09741 + (((tickAnim - 42) / 8) * (0-(0.09741)));
            zz = -0.1468 + (((tickAnim - 42) / 8) * (0-(-0.1468)));
        }
        else if (tickAnim >= 50 && tickAnim < 60) {
            xx = 5 + (((tickAnim - 50) / 10) * (0-(5)));
            yy = 0 + (((tickAnim - 50) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 50) / 10) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(bodyfront, bodyfront.rotateAngleX + (float) Math.toRadians(xx), bodyfront.rotateAngleY + (float) Math.toRadians(yy), bodyfront.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 0) / 10) * (-2.5-(0)));
            yy = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 20) {
            xx = -2.5 + (((tickAnim - 10) / 10) * (5-(-2.5)));
            yy = 0 + (((tickAnim - 10) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 10) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 29) {
            xx = 5 + (((tickAnim - 20) / 9) * (12.71-(5)));
            yy = 0 + (((tickAnim - 20) / 9) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 9) * (0-(0)));
        }
        else if (tickAnim >= 29 && tickAnim < 39) {
            xx = 12.71 + (((tickAnim - 29) / 10) * (7.91-(12.71)));
            yy = 0 + (((tickAnim - 29) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 29) / 10) * (0-(0)));
        }
        else if (tickAnim >= 39 && tickAnim < 50) {
            xx = 7.91 + (((tickAnim - 39) / 11) * (-2.5-(7.91)));
            yy = 0 + (((tickAnim - 39) / 11) * (0-(0)));
            zz = 0 + (((tickAnim - 39) / 11) * (0-(0)));
        }
        else if (tickAnim >= 50 && tickAnim < 60) {
            xx = -2.5 + (((tickAnim - 50) / 10) * (0-(-2.5)));
            yy = 0 + (((tickAnim - 50) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 50) / 10) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neckbase, neckbase.rotateAngleX + (float) Math.toRadians(xx), neckbase.rotateAngleY + (float) Math.toRadians(yy), neckbase.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 0) / 10) * (5-(0)));
            yy = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 20) {
            xx = 5 + (((tickAnim - 10) / 10) * (12.5-(5)));
            yy = 0 + (((tickAnim - 10) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 10) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 29) {
            xx = 12.5 + (((tickAnim - 20) / 9) * (22.05-(12.5)));
            yy = 0 + (((tickAnim - 20) / 9) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 9) * (0-(0)));
        }
        else if (tickAnim >= 29 && tickAnim < 36) {
            xx = 22.05 + (((tickAnim - 29) / 7) * (16.04-(22.05)));
            yy = 0 + (((tickAnim - 29) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 29) / 7) * (0-(0)));
        }
        else if (tickAnim >= 36 && tickAnim < 50) {
            xx = 16.04 + (((tickAnim - 36) / 14) * (5-(16.04)));
            yy = 0 + (((tickAnim - 36) / 14) * (0-(0)));
            zz = 0 + (((tickAnim - 36) / 14) * (0-(0)));
        }
        else if (tickAnim >= 50 && tickAnim < 60) {
            xx = 5 + (((tickAnim - 50) / 10) * (0-(5)));
            yy = 0 + (((tickAnim - 50) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 50) / 10) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neckmiddlebase, neckmiddlebase.rotateAngleX + (float) Math.toRadians(xx), neckmiddlebase.rotateAngleY + (float) Math.toRadians(yy), neckmiddlebase.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 0) / 10) * (-5-(0)));
            yy = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 15) {
            xx = -5 + (((tickAnim - 10) / 5) * (9.17-(-5)));
            yy = 0 + (((tickAnim - 10) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 5) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 20) {
            xx = 9.17 + (((tickAnim - 15) / 5) * (0-(9.17)));
            yy = 0 + (((tickAnim - 15) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 5) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 31) {
            xx = 0 + (((tickAnim - 20) / 11) * (3.19-(0)));
            yy = 0 + (((tickAnim - 20) / 11) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 11) * (0-(0)));
        }
        else if (tickAnim >= 31 && tickAnim < 50) {
            xx = 3.19 + (((tickAnim - 31) / 19) * (-5-(3.19)));
            yy = 0 + (((tickAnim - 31) / 19) * (0-(0)));
            zz = 0 + (((tickAnim - 31) / 19) * (0-(0)));
        }
        else if (tickAnim >= 50 && tickAnim < 60) {
            xx = -5 + (((tickAnim - 50) / 10) * (0-(-5)));
            yy = 0 + (((tickAnim - 50) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 50) / 10) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neckmiddlefront, neckmiddlefront.rotateAngleX + (float) Math.toRadians(xx), neckmiddlefront.rotateAngleY + (float) Math.toRadians(yy), neckmiddlefront.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 0) / 10) * (2.5-(0)));
            yy = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 20) {
            xx = 2.5 + (((tickAnim - 10) / 10) * (-5-(2.5)));
            yy = 0 + (((tickAnim - 10) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 10) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 29) {
            xx = -5 + (((tickAnim - 20) / 9) * (3.37-(-5)));
            yy = 0 + (((tickAnim - 20) / 9) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 9) * (0-(0)));
        }
        else if (tickAnim >= 29 && tickAnim < 38) {
            xx = 3.37 + (((tickAnim - 29) / 9) * (-8.12-(3.37)));
            yy = 0 + (((tickAnim - 29) / 9) * (0-(0)));
            zz = 0 + (((tickAnim - 29) / 9) * (0-(0)));
        }
        else if (tickAnim >= 38 && tickAnim < 50) {
            xx = -8.12 + (((tickAnim - 38) / 12) * (2.5-(-8.12)));
            yy = 0 + (((tickAnim - 38) / 12) * (0-(0)));
            zz = 0 + (((tickAnim - 38) / 12) * (0-(0)));
        }
        else if (tickAnim >= 50 && tickAnim < 60) {
            xx = 2.5 + (((tickAnim - 50) / 10) * (0-(2.5)));
            yy = 0 + (((tickAnim - 50) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 50) / 10) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neckfront, neckfront.rotateAngleX + (float) Math.toRadians(xx), neckfront.rotateAngleY + (float) Math.toRadians(yy), neckfront.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 0) / 20) * (-7.6934-(0)));
            yy = 0 + (((tickAnim - 0) / 20) * (-2.26914-(0)));
            zz = 0 + (((tickAnim - 0) / 20) * (9.7417-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 29) {
            xx = -7.6934 + (((tickAnim - 20) / 9) * (-2.63033-(-7.6934)));
            yy = -2.26914 + (((tickAnim - 20) / 9) * (-1.74913-(-2.26914)));
            zz = 9.7417 + (((tickAnim - 20) / 9) * (7.50923-(9.7417)));
        }
        else if (tickAnim >= 29 && tickAnim < 41) {
            xx = -2.63033 + (((tickAnim - 29) / 12) * (3.81358-(-2.63033)));
            yy = -1.74913 + (((tickAnim - 29) / 12) * (-1.0873-(-1.74913)));
            zz = 7.50923 + (((tickAnim - 29) / 12) * (4.6679-(7.50923)));
        }
        else if (tickAnim >= 41 && tickAnim < 48) {
            xx = 3.81358 + (((tickAnim - 41) / 7) * (-15.17869-(3.81358)));
            yy = -1.0873 + (((tickAnim - 41) / 7) * (-0.66183-(-1.0873)));
            zz = 4.6679 + (((tickAnim - 41) / 7) * (2.84133-(4.6679)));
        }
        else if (tickAnim >= 48 && tickAnim < 60) {
            xx = -15.17869 + (((tickAnim - 48) / 12) * (0-(-15.17869)));
            yy = -0.66183 + (((tickAnim - 48) / 12) * (0-(-0.66183)));
            zz = 2.84133 + (((tickAnim - 48) / 12) * (0-(2.84133)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(head, head.rotateAngleX + (float) Math.toRadians(xx), head.rotateAngleY + (float) Math.toRadians(yy), head.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 12) {
            xx = 0 + (((tickAnim - 0) / 12) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 12) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 12) * (0-(0)));
        }
        else if (tickAnim >= 12 && tickAnim < 14) {
            xx = 0 + (((tickAnim - 12) / 2) * (10-(0)));
            yy = 0 + (((tickAnim - 12) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 12) / 2) * (0-(0)));
        }
        else if (tickAnim >= 14 && tickAnim < 17) {
            xx = 10 + (((tickAnim - 14) / 3) * (0-(10)));
            yy = 0 + (((tickAnim - 14) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 14) / 3) * (0-(0)));
        }
        else if (tickAnim >= 17 && tickAnim < 43) {
            xx = 0 + (((tickAnim - 17) / 26) * (0-(0)));
            yy = 0 + (((tickAnim - 17) / 26) * (0-(0)));
            zz = 0 + (((tickAnim - 17) / 26) * (0-(0)));
        }
        else if (tickAnim >= 43 && tickAnim < 45) {
            xx = 0 + (((tickAnim - 43) / 2) * (10-(0)));
            yy = 0 + (((tickAnim - 43) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 43) / 2) * (0-(0)));
        }
        else if (tickAnim >= 45 && tickAnim < 48) {
            xx = 10 + (((tickAnim - 45) / 3) * (0-(10)));
            yy = 0 + (((tickAnim - 45) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 45) / 3) * (0-(0)));
        }
        else if (tickAnim >= 48 && tickAnim < 60) {
            xx = 0 + (((tickAnim - 48) / 12) * (0-(0)));
            yy = 0 + (((tickAnim - 48) / 12) * (0-(0)));
            zz = 0 + (((tickAnim - 48) / 12) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(lowerjawbase, lowerjawbase.rotateAngleX + (float) Math.toRadians(xx), lowerjawbase.rotateAngleY + (float) Math.toRadians(yy), lowerjawbase.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 0) / 10) * (48.89231-(0)));
            yy = 0 + (((tickAnim - 0) / 10) * (-5.17621-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (-27.78159-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 15) {
            xx = 48.89231 + (((tickAnim - 10) / 5) * (41.39231-(48.89231)));
            yy = -5.17621 + (((tickAnim - 10) / 5) * (-5.17621-(-5.17621)));
            zz = -27.78159 + (((tickAnim - 10) / 5) * (-27.78159-(-27.78159)));
        }
        else if (tickAnim >= 15 && tickAnim < 18) {
            xx = 41.39231 + (((tickAnim - 15) / 3) * (49.60659-(41.39231)));
            yy = -5.17621 + (((tickAnim - 15) / 3) * (-5.17621-(-5.17621)));
            zz = -27.78159 + (((tickAnim - 15) / 3) * (-27.78159-(-27.78159)));
        }
        else if (tickAnim >= 18 && tickAnim < 22) {
            xx = 49.60659 + (((tickAnim - 18) / 4) * (44.53141-(49.60659)));
            yy = -5.17621 + (((tickAnim - 18) / 4) * (-5.17621-(-5.17621)));
            zz = -27.78159 + (((tickAnim - 18) / 4) * (-27.78159-(-27.78159)));
        }
        else if (tickAnim >= 22 && tickAnim < 28) {
            xx = 44.53141 + (((tickAnim - 22) / 6) * (52.92924-(44.53141)));
            yy = -5.17621 + (((tickAnim - 22) / 6) * (-5.17621-(-5.17621)));
            zz = -27.78159 + (((tickAnim - 22) / 6) * (-27.78159-(-27.78159)));
        }
        else if (tickAnim >= 28 && tickAnim < 32) {
            xx = 52.92924 + (((tickAnim - 28) / 4) * (42.18166-(52.92924)));
            yy = -5.17621 + (((tickAnim - 28) / 4) * (-5.17621-(-5.17621)));
            zz = -27.78159 + (((tickAnim - 28) / 4) * (-27.78159-(-27.78159)));
        }
        else if (tickAnim >= 32 && tickAnim < 36) {
            xx = 42.18166 + (((tickAnim - 32) / 4) * (48.70681-(42.18166)));
            yy = -5.17621 + (((tickAnim - 32) / 4) * (-5.17621-(-5.17621)));
            zz = -27.78159 + (((tickAnim - 32) / 4) * (-27.78159-(-27.78159)));
        }
        else if (tickAnim >= 36 && tickAnim < 41) {
            xx = 48.70681 + (((tickAnim - 36) / 5) * (46.27228-(48.70681)));
            yy = -5.17621 + (((tickAnim - 36) / 5) * (-5.17621-(-5.17621)));
            zz = -27.78159 + (((tickAnim - 36) / 5) * (-27.78159-(-27.78159)));
        }
        else if (tickAnim >= 41 && tickAnim < 44) {
            xx = 46.27228 + (((tickAnim - 41) / 3) * (42.22502-(46.27228)));
            yy = -5.17621 + (((tickAnim - 41) / 3) * (-5.17621-(-5.17621)));
            zz = -27.78159 + (((tickAnim - 41) / 3) * (-27.78159-(-27.78159)));
        }
        else if (tickAnim >= 44 && tickAnim < 50) {
            xx = 42.22502 + (((tickAnim - 44) / 6) * (48.89231-(42.22502)));
            yy = -5.17621 + (((tickAnim - 44) / 6) * (-5.17621-(-5.17621)));
            zz = -27.78159 + (((tickAnim - 44) / 6) * (-27.78159-(-27.78159)));
        }
        else if (tickAnim >= 50 && tickAnim < 60) {
            xx = 48.89231 + (((tickAnim - 50) / 10) * (0-(48.89231)));
            yy = -5.17621 + (((tickAnim - 50) / 10) * (0-(-5.17621)));
            zz = -27.78159 + (((tickAnim - 50) / 10) * (0-(-27.78159)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftupperarm, leftupperarm.rotateAngleX + (float) Math.toRadians(xx), leftupperarm.rotateAngleY + (float) Math.toRadians(yy), leftupperarm.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 0) / 10) * (-7.5-(0)));
            yy = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 15) {
            xx = -7.5 + (((tickAnim - 10) / 5) * (0-(-7.5)));
            yy = 0 + (((tickAnim - 10) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 5) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 18) {
            xx = 0 + (((tickAnim - 15) / 3) * (-7.5-(0)));
            yy = 0 + (((tickAnim - 15) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 3) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 20) {
            xx = -7.5 + (((tickAnim - 18) / 2) * (0-(-7.5)));
            yy = 0 + (((tickAnim - 18) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 18) / 2) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 22) {
            xx = 0 + (((tickAnim - 20) / 2) * (-7.5-(0)));
            yy = 0 + (((tickAnim - 20) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 2) * (0-(0)));
        }
        else if (tickAnim >= 22 && tickAnim < 24) {
            xx = -7.5 + (((tickAnim - 22) / 2) * (0-(-7.5)));
            yy = 0 + (((tickAnim - 22) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 22) / 2) * (0-(0)));
        }
        else if (tickAnim >= 24 && tickAnim < 27) {
            xx = 0 + (((tickAnim - 24) / 3) * (-7.5-(0)));
            yy = 0 + (((tickAnim - 24) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 24) / 3) * (0-(0)));
        }
        else if (tickAnim >= 27 && tickAnim < 29) {
            xx = -7.5 + (((tickAnim - 27) / 2) * (0-(-7.5)));
            yy = 0 + (((tickAnim - 27) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 27) / 2) * (0-(0)));
        }
        else if (tickAnim >= 29 && tickAnim < 32) {
            xx = 0 + (((tickAnim - 29) / 3) * (-7.5-(0)));
            yy = 0 + (((tickAnim - 29) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 29) / 3) * (0-(0)));
        }
        else if (tickAnim >= 32 && tickAnim < 34) {
            xx = -7.5 + (((tickAnim - 32) / 2) * (0-(-7.5)));
            yy = 0 + (((tickAnim - 32) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 32) / 2) * (0-(0)));
        }
        else if (tickAnim >= 34 && tickAnim < 38) {
            xx = 0 + (((tickAnim - 34) / 4) * (-7.5-(0)));
            yy = 0 + (((tickAnim - 34) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 34) / 4) * (0-(0)));
        }
        else if (tickAnim >= 38 && tickAnim < 40) {
            xx = -7.5 + (((tickAnim - 38) / 2) * (0-(-7.5)));
            yy = 0 + (((tickAnim - 38) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 38) / 2) * (0-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 43) {
            xx = 0 + (((tickAnim - 40) / 3) * (-7.5-(0)));
            yy = 0 + (((tickAnim - 40) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 40) / 3) * (0-(0)));
        }
        else if (tickAnim >= 43 && tickAnim < 45) {
            xx = -7.5 + (((tickAnim - 43) / 2) * (0-(-7.5)));
            yy = 0 + (((tickAnim - 43) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 43) / 2) * (0-(0)));
        }
        else if (tickAnim >= 45 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 45) / 5) * (-7.5-(0)));
            yy = 0 + (((tickAnim - 45) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 45) / 5) * (0-(0)));
        }
        else if (tickAnim >= 50 && tickAnim < 60) {
            xx = -7.5 + (((tickAnim - 50) / 10) * (0-(-7.5)));
            yy = 0 + (((tickAnim - 50) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 50) / 10) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftlowerarm, leftlowerarm.rotateAngleX + (float) Math.toRadians(xx), leftlowerarm.rotateAngleY + (float) Math.toRadians(yy), leftlowerarm.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (-15-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 10) / 5) * (0-(0)));
            yy = 0 + (((tickAnim - 10) / 5) * (0-(0)));
            zz = -15 + (((tickAnim - 10) / 5) * (0-(-15)));
        }
        else if (tickAnim >= 15 && tickAnim < 17) {
            xx = 0 + (((tickAnim - 15) / 2) * (0-(0)));
            yy = 0 + (((tickAnim - 15) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 2) * (-13.21-(0)));
        }
        else if (tickAnim >= 17 && tickAnim < 18) {
            xx = 0 + (((tickAnim - 17) / 1) * (0-(0)));
            yy = 0 + (((tickAnim - 17) / 1) * (0-(0)));
            zz = -13.21 + (((tickAnim - 17) / 1) * (-5.8-(-13.21)));
        }
        else if (tickAnim >= 18 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 18) / 2) * (0-(0)));
            yy = 0 + (((tickAnim - 18) / 2) * (0-(0)));
            zz = -5.8 + (((tickAnim - 18) / 2) * (-13.21-(-5.8)));
        }
        else if (tickAnim >= 20 && tickAnim < 22) {
            xx = 0 + (((tickAnim - 20) / 2) * (0-(0)));
            yy = 0 + (((tickAnim - 20) / 2) * (0-(0)));
            zz = -13.21 + (((tickAnim - 20) / 2) * (-5.8-(-13.21)));
        }
        else if (tickAnim >= 22 && tickAnim < 23) {
            xx = 0 + (((tickAnim - 22) / 1) * (0-(0)));
            yy = 0 + (((tickAnim - 22) / 1) * (0-(0)));
            zz = -5.8 + (((tickAnim - 22) / 1) * (-13.21-(-5.8)));
        }
        else if (tickAnim >= 23 && tickAnim < 25) {
            xx = 0 + (((tickAnim - 23) / 2) * (0-(0)));
            yy = 0 + (((tickAnim - 23) / 2) * (0-(0)));
            zz = -13.21 + (((tickAnim - 23) / 2) * (-5.8-(-13.21)));
        }
        else if (tickAnim >= 25 && tickAnim < 28) {
            xx = 0 + (((tickAnim - 25) / 3) * (0-(0)));
            yy = 0 + (((tickAnim - 25) / 3) * (0-(0)));
            zz = -5.8 + (((tickAnim - 25) / 3) * (-13.21-(-5.8)));
        }
        else if (tickAnim >= 28 && tickAnim < 29) {
            xx = 0 + (((tickAnim - 28) / 1) * (0-(0)));
            yy = 0 + (((tickAnim - 28) / 1) * (0-(0)));
            zz = -13.21 + (((tickAnim - 28) / 1) * (-5.8-(-13.21)));
        }
        else if (tickAnim >= 29 && tickAnim < 31) {
            xx = 0 + (((tickAnim - 29) / 2) * (0-(0)));
            yy = 0 + (((tickAnim - 29) / 2) * (0-(0)));
            zz = -5.8 + (((tickAnim - 29) / 2) * (-13.21-(-5.8)));
        }
        else if (tickAnim >= 31 && tickAnim < 33) {
            xx = 0 + (((tickAnim - 31) / 2) * (0-(0)));
            yy = 0 + (((tickAnim - 31) / 2) * (0-(0)));
            zz = -13.21 + (((tickAnim - 31) / 2) * (-5.8-(-13.21)));
        }
        else if (tickAnim >= 33 && tickAnim < 35) {
            xx = 0 + (((tickAnim - 33) / 2) * (0-(0)));
            yy = 0 + (((tickAnim - 33) / 2) * (0-(0)));
            zz = -5.8 + (((tickAnim - 33) / 2) * (-13.21-(-5.8)));
        }
        else if (tickAnim >= 35 && tickAnim < 37) {
            xx = 0 + (((tickAnim - 35) / 2) * (0-(0)));
            yy = 0 + (((tickAnim - 35) / 2) * (0-(0)));
            zz = -13.21 + (((tickAnim - 35) / 2) * (-5.8-(-13.21)));
        }
        else if (tickAnim >= 37 && tickAnim < 39) {
            xx = 0 + (((tickAnim - 37) / 2) * (0-(0)));
            yy = 0 + (((tickAnim - 37) / 2) * (0-(0)));
            zz = -5.8 + (((tickAnim - 37) / 2) * (-13.21-(-5.8)));
        }
        else if (tickAnim >= 39 && tickAnim < 41) {
            xx = 0 + (((tickAnim - 39) / 2) * (0-(0)));
            yy = 0 + (((tickAnim - 39) / 2) * (0-(0)));
            zz = -13.21 + (((tickAnim - 39) / 2) * (-5.8-(-13.21)));
        }
        else if (tickAnim >= 41 && tickAnim < 43) {
            xx = 0 + (((tickAnim - 41) / 2) * (0-(0)));
            yy = 0 + (((tickAnim - 41) / 2) * (0-(0)));
            zz = -5.8 + (((tickAnim - 41) / 2) * (-13.21-(-5.8)));
        }
        else if (tickAnim >= 43 && tickAnim < 44) {
            xx = 0 + (((tickAnim - 43) / 1) * (0-(0)));
            yy = 0 + (((tickAnim - 43) / 1) * (0-(0)));
            zz = -13.21 + (((tickAnim - 43) / 1) * (-5.8-(-13.21)));
        }
        else if (tickAnim >= 44 && tickAnim < 45) {
            xx = 0 + (((tickAnim - 44) / 1) * (0-(0)));
            yy = 0 + (((tickAnim - 44) / 1) * (0-(0)));
            zz = -5.8 + (((tickAnim - 44) / 1) * (-13.21-(-5.8)));
        }
        else if (tickAnim >= 45 && tickAnim < 47) {
            xx = 0 + (((tickAnim - 45) / 2) * (0-(0)));
            yy = 0 + (((tickAnim - 45) / 2) * (0-(0)));
            zz = -13.21 + (((tickAnim - 45) / 2) * (-5.8-(-13.21)));
        }
        else if (tickAnim >= 47 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 47) / 3) * (0-(0)));
            yy = 0 + (((tickAnim - 47) / 3) * (0-(0)));
            zz = -5.8 + (((tickAnim - 47) / 3) * (-15-(-5.8)));
        }
        else if (tickAnim >= 50 && tickAnim < 60) {
            xx = 0 + (((tickAnim - 50) / 10) * (0-(0)));
            yy = 0 + (((tickAnim - 50) / 10) * (0-(0)));
            zz = -15 + (((tickAnim - 50) / 10) * (0-(-15)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(lefthand, lefthand.rotateAngleX + (float) Math.toRadians(xx), lefthand.rotateAngleY + (float) Math.toRadians(yy), lefthand.rotateAngleZ + (float) Math.toRadians(zz));

    }
    public void animLook(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime, double animTick) {
        EntityPrehistoricFloraAnchisaurus entity = (EntityPrehistoricFloraAnchisaurus) entitylivingbaseIn;

        int animCycle = 60;
        double tickAnim = animTick + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;
         if (tickAnim >= 0 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 0) / 5) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 5) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 5) / 5) * (-5-(0)));
            yy = 0 + (((tickAnim - 5) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 5) / 5) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 60) {
            xx = -5 + (((tickAnim - 10) / 50) * (0-(-5)));
            yy = 0 + (((tickAnim - 10) / 50) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 50) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(bodyfront, bodyfront.rotateAngleX + (float) Math.toRadians(xx), bodyfront.rotateAngleY + (float) Math.toRadians(yy), bodyfront.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 0) / 5) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 5) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 5) / 5) * (-10-(0)));
            yy = 0 + (((tickAnim - 5) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 5) / 5) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 21) {
            xx = -10 + (((tickAnim - 10) / 11) * (-10-(-10)));
            yy = 0 + (((tickAnim - 10) / 11) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 11) * (0-(0)));
        }
        else if (tickAnim >= 21 && tickAnim < 27) {
            xx = -10 + (((tickAnim - 21) / 6) * (13.5-(-10)));
            yy = 0 + (((tickAnim - 21) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 21) / 6) * (0-(0)));
        }
        else if (tickAnim >= 27 && tickAnim < 34) {
            xx = 13.5 + (((tickAnim - 27) / 7) * (16-(13.5)));
            yy = 0 + (((tickAnim - 27) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 27) / 7) * (0-(0)));
        }
        else if (tickAnim >= 34 && tickAnim < 40) {
            xx = 16 + (((tickAnim - 34) / 6) * (13.5-(16)));
            yy = 0 + (((tickAnim - 34) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 34) / 6) * (0-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 51) {
            xx = 13.5 + (((tickAnim - 40) / 11) * (13.5-(13.5)));
            yy = 0 + (((tickAnim - 40) / 11) * (0-(0)));
            zz = 0 + (((tickAnim - 40) / 11) * (0-(0)));
        }
        else if (tickAnim >= 51 && tickAnim < 60) {
            xx = 13.5 + (((tickAnim - 51) / 9) * (0-(13.5)));
            yy = 0 + (((tickAnim - 51) / 9) * (0-(0)));
            zz = 0 + (((tickAnim - 51) / 9) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neckbase, neckbase.rotateAngleX + (float) Math.toRadians(xx), neckbase.rotateAngleY + (float) Math.toRadians(yy), neckbase.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 0) / 5) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 5) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 12) {
            xx = 0 + (((tickAnim - 5) / 7) * (-2.5-(0)));
            yy = 0 + (((tickAnim - 5) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 5) / 7) * (0-(0)));
        }
        else if (tickAnim >= 12 && tickAnim < 29) {
            xx = -2.5 + (((tickAnim - 12) / 17) * (23.96-(-2.5)));
            yy = 0 + (((tickAnim - 12) / 17) * (0-(0)));
            zz = 0 + (((tickAnim - 12) / 17) * (0-(0)));
        }
        else if (tickAnim >= 29 && tickAnim < 40) {
            xx = 23.96 + (((tickAnim - 29) / 11) * (23.96-(23.96)));
            yy = 0 + (((tickAnim - 29) / 11) * (0-(0)));
            zz = 0 + (((tickAnim - 29) / 11) * (0-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 52) {
            xx = 23.96 + (((tickAnim - 40) / 12) * (23.96-(23.96)));
            yy = 0 + (((tickAnim - 40) / 12) * (0-(0)));
            zz = 0 + (((tickAnim - 40) / 12) * (0-(0)));
        }
        else if (tickAnim >= 52 && tickAnim < 60) {
            xx = 23.96 + (((tickAnim - 52) / 8) * (0-(23.96)));
            yy = 0 + (((tickAnim - 52) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 52) / 8) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neckmiddlebase, neckmiddlebase.rotateAngleX + (float) Math.toRadians(xx), neckmiddlebase.rotateAngleY + (float) Math.toRadians(yy), neckmiddlebase.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 0) / 5) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 5) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 14) {
            xx = 0 + (((tickAnim - 5) / 9) * (20-(0)));
            yy = 0 + (((tickAnim - 5) / 9) * (0-(0)));
            zz = 0 + (((tickAnim - 5) / 9) * (0-(0)));
        }
        else if (tickAnim >= 14 && tickAnim < 23) {
            xx = 20 + (((tickAnim - 14) / 9) * (4.8-(20)));
            yy = 0 + (((tickAnim - 14) / 9) * (0-(0)));
            zz = 0 + (((tickAnim - 14) / 9) * (0-(0)));
        }
        else if (tickAnim >= 23 && tickAnim < 31) {
            xx = 4.8 + (((tickAnim - 23) / 8) * (15.34-(4.8)));
            yy = 0 + (((tickAnim - 23) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 23) / 8) * (0-(0)));
        }
        else if (tickAnim >= 31 && tickAnim < 43) {
            xx = 15.34 + (((tickAnim - 31) / 12) * (5.34-(15.34)));
            yy = 0 + (((tickAnim - 31) / 12) * (0-(0)));
            zz = 0 + (((tickAnim - 31) / 12) * (0-(0)));
        }
        else if (tickAnim >= 43 && tickAnim < 52) {
            xx = 5.34 + (((tickAnim - 43) / 9) * (5.34-(5.34)));
            yy = 0 + (((tickAnim - 43) / 9) * (0-(0)));
            zz = 0 + (((tickAnim - 43) / 9) * (0-(0)));
        }
        else if (tickAnim >= 52 && tickAnim < 60) {
            xx = 5.34 + (((tickAnim - 52) / 8) * (0-(5.34)));
            yy = 0 + (((tickAnim - 52) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 52) / 8) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neckmiddlefront, neckmiddlefront.rotateAngleX + (float) Math.toRadians(xx), neckmiddlefront.rotateAngleY + (float) Math.toRadians(yy), neckmiddlefront.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 0) / 5) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 5) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 5) / 8) * (10-(0)));
            yy = 0 + (((tickAnim - 5) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 5) / 8) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 29) {
            xx = 10 + (((tickAnim - 13) / 16) * (-5.42-(10)));
            yy = 0 + (((tickAnim - 13) / 16) * (0-(0)));
            zz = 0 + (((tickAnim - 13) / 16) * (0-(0)));
        }
        else if (tickAnim >= 29 && tickAnim < 43) {
            xx = -5.42 + (((tickAnim - 29) / 14) * (-10.69-(-5.42)));
            yy = 0 + (((tickAnim - 29) / 14) * (0-(0)));
            zz = 0 + (((tickAnim - 29) / 14) * (0-(0)));
        }
        else if (tickAnim >= 43 && tickAnim < 54) {
            xx = -10.69 + (((tickAnim - 43) / 11) * (-10.69-(-10.69)));
            yy = 0 + (((tickAnim - 43) / 11) * (0-(0)));
            zz = 0 + (((tickAnim - 43) / 11) * (0-(0)));
        }
        else if (tickAnim >= 54 && tickAnim < 60) {
            xx = -10.69 + (((tickAnim - 54) / 6) * (0-(-10.69)));
            yy = 0 + (((tickAnim - 54) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 54) / 6) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neckfront, neckfront.rotateAngleX + (float) Math.toRadians(xx), neckfront.rotateAngleY + (float) Math.toRadians(yy), neckfront.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 0) / 5) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 5) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 18) {
            xx = 0 + (((tickAnim - 5) / 13) * (10-(0)));
            yy = 0 + (((tickAnim - 5) / 13) * (0-(0)));
            zz = 0 + (((tickAnim - 5) / 13) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 28) {
            xx = 10 + (((tickAnim - 18) / 10) * (7.6484-(10)));
            yy = 0 + (((tickAnim - 18) / 10) * (-10.34053-(0)));
            zz = 0 + (((tickAnim - 18) / 10) * (10.92591-(0)));
        }
        else if (tickAnim >= 28 && tickAnim < 36) {
            xx = 7.6484 + (((tickAnim - 28) / 8) * (7.6484-(7.6484)));
            yy = -10.34053 + (((tickAnim - 28) / 8) * (-10.34053-(-10.34053)));
            zz = 10.92591 + (((tickAnim - 28) / 8) * (10.92591-(10.92591)));
        }
        else if (tickAnim >= 36 && tickAnim < 43) {
            xx = 7.6484 + (((tickAnim - 36) / 7) * (-17.3516-(7.6484)));
            yy = -10.34053 + (((tickAnim - 36) / 7) * (-10.34053-(-10.34053)));
            zz = 10.92591 + (((tickAnim - 36) / 7) * (10.92591-(10.92591)));
        }
        else if (tickAnim >= 43 && tickAnim < 51) {
            xx = -17.3516 + (((tickAnim - 43) / 8) * (-20.54366-(-17.3516)));
            yy = -10.34053 + (((tickAnim - 43) / 8) * (-10.10914-(-10.34053)));
            zz = 10.92591 + (((tickAnim - 43) / 8) * (0.76683-(10.92591)));
        }
        else if (tickAnim >= 51 && tickAnim < 55) {
            xx = -20.54366 + (((tickAnim - 51) / 4) * (-15.54366-(-20.54366)));
            yy = -10.10914 + (((tickAnim - 51) / 4) * (-10.10914-(-10.10914)));
            zz = 0.76683 + (((tickAnim - 51) / 4) * (0.76683-(0.76683)));
        }
        else if (tickAnim >= 55 && tickAnim < 60) {
            xx = -15.54366 + (((tickAnim - 55) / 5) * (0-(-15.54366)));
            yy = -10.10914 + (((tickAnim - 55) / 5) * (0-(-10.10914)));
            zz = 0.76683 + (((tickAnim - 55) / 5) * (0-(0.76683)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(head, head.rotateAngleX + (float) Math.toRadians(xx), head.rotateAngleY + (float) Math.toRadians(yy), head.rotateAngleZ + (float) Math.toRadians(zz));

    }
    public void animNoise(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime, double animTick) {
        EntityPrehistoricFloraAnchisaurus entity = (EntityPrehistoricFloraAnchisaurus) entitylivingbaseIn;

        int animCycle = 20;
        double tickAnim = animTick + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;
         if (tickAnim >= 0 && tickAnim < 3) {
            xx = 0 + (((tickAnim - 0) / 3) * (-2.5-(0)));
            yy = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 3) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 16) {
            xx = -2.5 + (((tickAnim - 3) / 13) * (-2.5-(-2.5)));
            yy = 0 + (((tickAnim - 3) / 13) * (0-(0)));
            zz = 0 + (((tickAnim - 3) / 13) * (0-(0)));
        }
        else if (tickAnim >= 16 && tickAnim < 20) {
            xx = -2.5 + (((tickAnim - 16) / 4) * (0-(-2.5)));
            yy = 0 + (((tickAnim - 16) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 16) / 4) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(bodyfront, bodyfront.rotateAngleX + (float) Math.toRadians(xx), bodyfront.rotateAngleY + (float) Math.toRadians(yy), bodyfront.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 0 + (((tickAnim - 0) / 3) * (-2.5-(0)));
            yy = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 3) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 16) {
            xx = -2.5 + (((tickAnim - 3) / 13) * (-2.5-(-2.5)));
            yy = 0 + (((tickAnim - 3) / 13) * (0-(0)));
            zz = 0 + (((tickAnim - 3) / 13) * (0-(0)));
        }
        else if (tickAnim >= 16 && tickAnim < 20) {
            xx = -2.5 + (((tickAnim - 16) / 4) * (0-(-2.5)));
            yy = 0 + (((tickAnim - 16) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 16) / 4) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neckbase, neckbase.rotateAngleX + (float) Math.toRadians(xx), neckbase.rotateAngleY + (float) Math.toRadians(yy), neckbase.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 2) {
            xx = 0 + (((tickAnim - 0) / 2) * (-2.5-(0)));
            yy = 0 + (((tickAnim - 0) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 2) * (0-(0)));
        }
        else if (tickAnim >= 2 && tickAnim < 16) {
            xx = -2.5 + (((tickAnim - 2) / 14) * (-2.5-(-2.5)));
            yy = 0 + (((tickAnim - 2) / 14) * (0-(0)));
            zz = 0 + (((tickAnim - 2) / 14) * (0-(0)));
        }
        else if (tickAnim >= 16 && tickAnim < 20) {
            xx = -2.5 + (((tickAnim - 16) / 4) * (0-(-2.5)));
            yy = 0 + (((tickAnim - 16) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 16) / 4) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neckmiddlebase, neckmiddlebase.rotateAngleX + (float) Math.toRadians(xx), neckmiddlebase.rotateAngleY + (float) Math.toRadians(yy), neckmiddlebase.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 2) {
            xx = 0 + (((tickAnim - 0) / 2) * (2.5-(0)));
            yy = 0 + (((tickAnim - 0) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 2) * (0-(0)));
        }
        else if (tickAnim >= 2 && tickAnim < 16) {
            xx = 2.5 + (((tickAnim - 2) / 14) * (0-(2.5)));
            yy = 0 + (((tickAnim - 2) / 14) * (0-(0)));
            zz = 0 + (((tickAnim - 2) / 14) * (0-(0)));
        }
        else if (tickAnim >= 16 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 16) / 4) * (0-(0)));
            yy = 0 + (((tickAnim - 16) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 16) / 4) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neckmiddlefront, neckmiddlefront.rotateAngleX + (float) Math.toRadians(xx), neckmiddlefront.rotateAngleY + (float) Math.toRadians(yy), neckmiddlefront.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 2) {
            xx = 0 + (((tickAnim - 0) / 2) * (-7.5-(0)));
            yy = 0 + (((tickAnim - 0) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 2) * (0-(0)));
        }
        else if (tickAnim >= 2 && tickAnim < 16) {
            xx = -7.5 + (((tickAnim - 2) / 14) * (-7.5-(-7.5)));
            yy = 0 + (((tickAnim - 2) / 14) * (0-(0)));
            zz = 0 + (((tickAnim - 2) / 14) * (0-(0)));
        }
        else if (tickAnim >= 16 && tickAnim < 20) {
            xx = -7.5 + (((tickAnim - 16) / 4) * (0-(-7.5)));
            yy = 0 + (((tickAnim - 16) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 16) / 4) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neckfront, neckfront.rotateAngleX + (float) Math.toRadians(xx), neckfront.rotateAngleY + (float) Math.toRadians(yy), neckfront.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 1) {
            xx = 0 + (((tickAnim - 0) / 1) * (5.42-(0)));
            yy = 0 + (((tickAnim - 0) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 1) * (0-(0)));
        }
        else if (tickAnim >= 1 && tickAnim < 2) {
            xx = 5.42 + (((tickAnim - 1) / 1) * (10.34-(5.42)));
            yy = 0 + (((tickAnim - 1) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 1) / 1) * (0-(0)));
        }
        else if (tickAnim >= 2 && tickAnim < 3) {
            xx = 10.34 + (((tickAnim - 2) / 1) * (6.5-(10.34)));
            yy = 0 + (((tickAnim - 2) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 2) / 1) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 3) {
            xx = 6.5 + (((tickAnim - 3) / 0) * (3.5-(6.5)));
            yy = 0 + (((tickAnim - 3) / 0) * (0-(0)));
            zz = 0 + (((tickAnim - 3) / 0) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 5) {
            xx = 3.5 + (((tickAnim - 3) / 2) * (5-(3.5)));
            yy = 0 + (((tickAnim - 3) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 3) / 2) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 7) {
            xx = 5 + (((tickAnim - 5) / 2) * (2.5-(5)));
            yy = 0 + (((tickAnim - 5) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 5) / 2) * (0-(0)));
        }
        else if (tickAnim >= 7 && tickAnim < 8) {
            xx = 2.5 + (((tickAnim - 7) / 1) * (5-(2.5)));
            yy = 0 + (((tickAnim - 7) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 7) / 1) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 10) {
            xx = 5 + (((tickAnim - 8) / 2) * (0-(5)));
            yy = 0 + (((tickAnim - 8) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 2) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 10) / 3) * (2.5-(0)));
            yy = 0 + (((tickAnim - 10) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 3) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 16) {
            xx = 2.5 + (((tickAnim - 13) / 3) * (5-(2.5)));
            yy = 0 + (((tickAnim - 13) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 13) / 3) * (0-(0)));
        }
        else if (tickAnim >= 16 && tickAnim < 18) {
            xx = 5 + (((tickAnim - 16) / 2) * (0-(5)));
            yy = 0 + (((tickAnim - 16) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 16) / 2) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 18) / 2) * (0-(0)));
            yy = 0 + (((tickAnim - 18) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 18) / 2) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(lowerjawbase, lowerjawbase.rotateAngleX + (float) Math.toRadians(xx), lowerjawbase.rotateAngleY + (float) Math.toRadians(yy), lowerjawbase.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 2) {
            xx = 0 + (((tickAnim - 0) / 2) * (-2.5-(0)));
            yy = 0 + (((tickAnim - 0) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 2) * (0-(0)));
        }
        else if (tickAnim >= 2 && tickAnim < 16) {
            xx = -2.5 + (((tickAnim - 2) / 14) * (-2.5-(-2.5)));
            yy = 0 + (((tickAnim - 2) / 14) * (0-(0)));
            zz = 0 + (((tickAnim - 2) / 14) * (0-(0)));
        }
        else if (tickAnim >= 16 && tickAnim < 20) {
            xx = -2.5 + (((tickAnim - 16) / 4) * (0-(-2.5)));
            yy = 0 + (((tickAnim - 16) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 16) / 4) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(headtop, headtop.rotateAngleX + (float) Math.toRadians(xx), headtop.rotateAngleY + (float) Math.toRadians(yy), headtop.rotateAngleZ + (float) Math.toRadians(zz));

    }

    public void animGraze(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime, double animTick) {
        EntityPrehistoricFloraAnchisaurus entity = (EntityPrehistoricFloraAnchisaurus) entitylivingbaseIn;

        int animCycle = 50;
        double tickAnim = animTick + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;
         if (tickAnim >= 0 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 0) / 13) * (-12.5-(0)));
            yy = 0 + (((tickAnim - 0) / 13) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 13) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 24) {
            xx = -12.5 + (((tickAnim - 13) / 11) * (-10-(-12.5)));
            yy = 0 + (((tickAnim - 13) / 11) * (0-(0)));
            zz = 0 + (((tickAnim - 13) / 11) * (0-(0)));
        }
        else if (tickAnim >= 24 && tickAnim < 38) {
            xx = -10 + (((tickAnim - 24) / 14) * (-12.5-(-10)));
            yy = 0 + (((tickAnim - 24) / 14) * (0-(0)));
            zz = 0 + (((tickAnim - 24) / 14) * (0-(0)));
        }
        else if (tickAnim >= 38 && tickAnim < 50) {
            xx = -12.5 + (((tickAnim - 38) / 12) * (0-(-12.5)));
            yy = 0 + (((tickAnim - 38) / 12) * (0-(0)));
            zz = 0 + (((tickAnim - 38) / 12) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(bodymiddle, bodymiddle.rotateAngleX + (float) Math.toRadians(xx), bodymiddle.rotateAngleY + (float) Math.toRadians(yy), bodymiddle.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 0) / 13) * (-7.5-(0)));
            yy = 0 + (((tickAnim - 0) / 13) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 13) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 29) {
            xx = -7.5 + (((tickAnim - 13) / 16) * (-12.5-(-7.5)));
            yy = 0 + (((tickAnim - 13) / 16) * (0-(0)));
            zz = 0 + (((tickAnim - 13) / 16) * (0-(0)));
        }
        else if (tickAnim >= 29 && tickAnim < 38) {
            xx = -12.5 + (((tickAnim - 29) / 9) * (-7.5-(-12.5)));
            yy = 0 + (((tickAnim - 29) / 9) * (0-(0)));
            zz = 0 + (((tickAnim - 29) / 9) * (0-(0)));
        }
        else if (tickAnim >= 38 && tickAnim < 50) {
            xx = -7.5 + (((tickAnim - 38) / 12) * (0-(-7.5)));
            yy = 0 + (((tickAnim - 38) / 12) * (0-(0)));
            zz = 0 + (((tickAnim - 38) / 12) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(bodyfront, bodyfront.rotateAngleX + (float) Math.toRadians(xx), bodyfront.rotateAngleY + (float) Math.toRadians(yy), bodyfront.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 0) / 13) * (-7.5-(0)));
            yy = 0 + (((tickAnim - 0) / 13) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 13) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 29) {
            xx = -7.5 + (((tickAnim - 13) / 16) * (-27.81-(-7.5)));
            yy = 0 + (((tickAnim - 13) / 16) * (0-(0)));
            zz = 0 + (((tickAnim - 13) / 16) * (0-(0)));
        }
        else if (tickAnim >= 29 && tickAnim < 38) {
            xx = -27.81 + (((tickAnim - 29) / 9) * (-7.5-(-27.81)));
            yy = 0 + (((tickAnim - 29) / 9) * (0-(0)));
            zz = 0 + (((tickAnim - 29) / 9) * (0-(0)));
        }
        else if (tickAnim >= 38 && tickAnim < 50) {
            xx = -7.5 + (((tickAnim - 38) / 12) * (0-(-7.5)));
            yy = 0 + (((tickAnim - 38) / 12) * (0-(0)));
            zz = 0 + (((tickAnim - 38) / 12) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neckbase, neckbase.rotateAngleX + (float) Math.toRadians(xx), neckbase.rotateAngleY + (float) Math.toRadians(yy), neckbase.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 0) / 13) * (-2.5-(0)));
            yy = 0 + (((tickAnim - 0) / 13) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 13) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 20) {
            xx = -2.5 + (((tickAnim - 13) / 7) * (7.5-(-2.5)));
            yy = 0 + (((tickAnim - 13) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 13) / 7) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 38) {
            xx = 7.5 + (((tickAnim - 20) / 18) * (-2.5-(7.5)));
            yy = 0 + (((tickAnim - 20) / 18) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 18) * (0-(0)));
        }
        else if (tickAnim >= 38 && tickAnim < 50) {
            xx = -2.5 + (((tickAnim - 38) / 12) * (0-(-2.5)));
            yy = 0 + (((tickAnim - 38) / 12) * (0-(0)));
            zz = 0 + (((tickAnim - 38) / 12) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neckmiddlebase, neckmiddlebase.rotateAngleX + (float) Math.toRadians(xx), neckmiddlebase.rotateAngleY + (float) Math.toRadians(yy), neckmiddlebase.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 0) / 13) * (17.5-(0)));
            yy = 0 + (((tickAnim - 0) / 13) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 13) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 26) {
            xx = 17.5 + (((tickAnim - 13) / 13) * (2.5-(17.5)));
            yy = 0 + (((tickAnim - 13) / 13) * (0-(0)));
            zz = 0 + (((tickAnim - 13) / 13) * (0-(0)));
        }
        else if (tickAnim >= 26 && tickAnim < 38) {
            xx = 2.5 + (((tickAnim - 26) / 12) * (17.5-(2.5)));
            yy = 0 + (((tickAnim - 26) / 12) * (0-(0)));
            zz = 0 + (((tickAnim - 26) / 12) * (0-(0)));
        }
        else if (tickAnim >= 38 && tickAnim < 50) {
            xx = 17.5 + (((tickAnim - 38) / 12) * (0-(17.5)));
            yy = 0 + (((tickAnim - 38) / 12) * (0-(0)));
            zz = 0 + (((tickAnim - 38) / 12) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neckmiddlefront, neckmiddlefront.rotateAngleX + (float) Math.toRadians(xx), neckmiddlefront.rotateAngleY + (float) Math.toRadians(yy), neckmiddlefront.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 0) / 13) * (15-(0)));
            yy = 0 + (((tickAnim - 0) / 13) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 13) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 32) {
            xx = 15 + (((tickAnim - 13) / 19) * (-11.52-(15)));
            yy = 0 + (((tickAnim - 13) / 19) * (0-(0)));
            zz = 0 + (((tickAnim - 13) / 19) * (0-(0)));
        }
        else if (tickAnim >= 32 && tickAnim < 38) {
            xx = -11.52 + (((tickAnim - 32) / 6) * (15-(-11.52)));
            yy = 0 + (((tickAnim - 32) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 32) / 6) * (0-(0)));
        }
        else if (tickAnim >= 38 && tickAnim < 50) {
            xx = 15 + (((tickAnim - 38) / 12) * (0-(15)));
            yy = 0 + (((tickAnim - 38) / 12) * (0-(0)));
            zz = 0 + (((tickAnim - 38) / 12) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neckfront, neckfront.rotateAngleX + (float) Math.toRadians(xx), neckfront.rotateAngleY + (float) Math.toRadians(yy), neckfront.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 0) / 50) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 50) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 50) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(head, head.rotateAngleX + (float) Math.toRadians(xx), head.rotateAngleY + (float) Math.toRadians(yy), head.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 28 && tickAnim < 31) {
            xx = 0 + (((tickAnim - 28) / 3) * (15-(0)));
            yy = 0 + (((tickAnim - 28) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 28) / 3) * (0-(0)));
        }
        else if (tickAnim >= 31 && tickAnim < 34) {
            xx = 15 + (((tickAnim - 31) / 3) * (0-(15)));
            yy = 0 + (((tickAnim - 31) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 31) / 3) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(lowerjawbase, lowerjawbase.rotateAngleX + (float) Math.toRadians(xx), lowerjawbase.rotateAngleY + (float) Math.toRadians(yy), lowerjawbase.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 0) / 13) * (-66.88862-(0)));
            yy = 0 + (((tickAnim - 0) / 13) * (-8.05474-(0)));
            zz = 0 + (((tickAnim - 0) / 13) * (-23.76056-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 24) {
            xx = -66.88862 + (((tickAnim - 13) / 11) * (-78.11653-(-66.88862)));
            yy = -8.05474 + (((tickAnim - 13) / 11) * (-2.83412-(-8.05474)));
            zz = -23.76056 + (((tickAnim - 13) / 11) * (-26.20531-(-23.76056)));
        }
        else if (tickAnim >= 24 && tickAnim < 38) {
            xx = -78.11653 + (((tickAnim - 24) / 14) * (-66.88862-(-78.11653)));
            yy = -2.83412 + (((tickAnim - 24) / 14) * (-8.05474-(-2.83412)));
            zz = -26.20531 + (((tickAnim - 24) / 14) * (-23.76056-(-26.20531)));
        }
        else if (tickAnim >= 38 && tickAnim < 50) {
            xx = -66.88862 + (((tickAnim - 38) / 12) * (0-(-66.88862)));
            yy = -8.05474 + (((tickAnim - 38) / 12) * (0-(-8.05474)));
            zz = -23.76056 + (((tickAnim - 38) / 12) * (0-(-23.76056)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightupperarm, rightupperarm.rotateAngleX + (float) Math.toRadians(xx), rightupperarm.rotateAngleY + (float) Math.toRadians(yy), rightupperarm.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 0) / 13) * (22.5-(0)));
            yy = 0 + (((tickAnim - 0) / 13) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 13) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 24) {
            xx = 22.5 + (((tickAnim - 13) / 11) * (0-(22.5)));
            yy = 0 + (((tickAnim - 13) / 11) * (0-(0)));
            zz = 0 + (((tickAnim - 13) / 11) * (0-(0)));
        }
        else if (tickAnim >= 24 && tickAnim < 38) {
            xx = 0 + (((tickAnim - 24) / 14) * (22.5-(0)));
            yy = 0 + (((tickAnim - 24) / 14) * (0-(0)));
            zz = 0 + (((tickAnim - 24) / 14) * (0-(0)));
        }
        else if (tickAnim >= 38 && tickAnim < 50) {
            xx = 22.5 + (((tickAnim - 38) / 12) * (0-(22.5)));
            yy = 0 + (((tickAnim - 38) / 12) * (0-(0)));
            zz = 0 + (((tickAnim - 38) / 12) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightlowerarm, rightlowerarm.rotateAngleX + (float) Math.toRadians(xx), rightlowerarm.rotateAngleY + (float) Math.toRadians(yy), rightlowerarm.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 0) / 50) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 50) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 50) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(righthand, righthand.rotateAngleX + (float) Math.toRadians(xx), righthand.rotateAngleY + (float) Math.toRadians(yy), righthand.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 12) {
            xx = 0 + (((tickAnim - 0) / 12) * (-66.88862-(0)));
            yy = 0 + (((tickAnim - 0) / 12) * (8.05474-(0)));
            zz = 0 + (((tickAnim - 0) / 12) * (23.76056-(0)));
        }
        else if (tickAnim >= 12 && tickAnim < 25) {
            xx = -66.88862 + (((tickAnim - 12) / 13) * (-62.71105-(-66.88862)));
            yy = 8.05474 + (((tickAnim - 12) / 13) * (2.99643-(8.05474)));
            zz = 23.76056 + (((tickAnim - 12) / 13) * (12.60538-(23.76056)));
        }
        else if (tickAnim >= 25 && tickAnim < 39) {
            xx = -62.71105 + (((tickAnim - 25) / 14) * (-66.88862-(-62.71105)));
            yy = 2.99643 + (((tickAnim - 25) / 14) * (8.05474-(2.99643)));
            zz = 12.60538 + (((tickAnim - 25) / 14) * (23.76056-(12.60538)));
        }
        else if (tickAnim >= 39 && tickAnim < 50) {
            xx = -66.88862 + (((tickAnim - 39) / 11) * (0-(-66.88862)));
            yy = 8.05474 + (((tickAnim - 39) / 11) * (0-(8.05474)));
            zz = 23.76056 + (((tickAnim - 39) / 11) * (0-(23.76056)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftupperarm, leftupperarm.rotateAngleX + (float) Math.toRadians(xx), leftupperarm.rotateAngleY + (float) Math.toRadians(yy), leftupperarm.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 12) {
            xx = 0 + (((tickAnim - 0) / 12) * (22.5-(0)));
            yy = 0 + (((tickAnim - 0) / 12) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 12) * (0-(0)));
        }
        else if (tickAnim >= 12 && tickAnim < 25) {
            xx = 22.5 + (((tickAnim - 12) / 13) * (12.5-(22.5)));
            yy = 0 + (((tickAnim - 12) / 13) * (0-(0)));
            zz = 0 + (((tickAnim - 12) / 13) * (0-(0)));
        }
        else if (tickAnim >= 25 && tickAnim < 39) {
            xx = 12.5 + (((tickAnim - 25) / 14) * (22.5-(12.5)));
            yy = 0 + (((tickAnim - 25) / 14) * (0-(0)));
            zz = 0 + (((tickAnim - 25) / 14) * (0-(0)));
        }
        else if (tickAnim >= 39 && tickAnim < 50) {
            xx = 22.5 + (((tickAnim - 39) / 11) * (0-(22.5)));
            yy = 0 + (((tickAnim - 39) / 11) * (0-(0)));
            zz = 0 + (((tickAnim - 39) / 11) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftlowerarm, leftlowerarm.rotateAngleX + (float) Math.toRadians(xx), leftlowerarm.rotateAngleY + (float) Math.toRadians(yy), leftlowerarm.rotateAngleZ + (float) Math.toRadians(zz));


    }
    public void animLay(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime, double animTick) {
        EntityPrehistoricFloraAnchisaurus entity = (EntityPrehistoricFloraAnchisaurus) entitylivingbaseIn;

        double tickAnim = animTick + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;
        this.setRotateAngle(hips, hips.rotateAngleX + (float) Math.toRadians(0), hips.rotateAngleY + (float) Math.toRadians(0), hips.rotateAngleZ + (float) Math.toRadians(0));

        if (tickAnim >= 0 && tickAnim < 18) {
            xx = 0 + (((tickAnim - 0) / 18) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 18) * (-2.22-(0)));
            zz = 0 + (((tickAnim - 0) / 18) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 31) {
            xx = 0 + (((tickAnim - 18) / 13) * (0-(0)));
            yy = -2.22 + (((tickAnim - 18) / 13) * (-2.22-(-2.22)));
            zz = 0 + (((tickAnim - 18) / 13) * (0-(0)));
        }
        else if (tickAnim >= 31 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 31) / 19) * (0-(0)));
            yy = -2.22 + (((tickAnim - 31) / 19) * (0-(-2.22)));
            zz = 0 + (((tickAnim - 31) / 19) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.hips.rotationPointX = this.hips.rotationPointX + (float)(xx);
        this.hips.rotationPointY = this.hips.rotationPointY - (float)(yy);
        this.hips.rotationPointZ = this.hips.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 19) {
            xx = 0 + (((tickAnim - 0) / 19) * (-6-(0)));
            yy = 0 + (((tickAnim - 0) / 19) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 19) * (0-(0)));
        }
        else if (tickAnim >= 19 && tickAnim < 28) {
            xx = -6 + (((tickAnim - 19) / 9) * (-6-(-6)));
            yy = 0 + (((tickAnim - 19) / 9) * (0-(0)));
            zz = 0 + (((tickAnim - 19) / 9) * (0-(0)));
        }
        else if (tickAnim >= 28 && tickAnim < 50) {
            xx = -6 + (((tickAnim - 28) / 22) * (0-(-6)));
            yy = 0 + (((tickAnim - 28) / 22) * (0-(0)));
            zz = 0 + (((tickAnim - 28) / 22) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tailbase, tailbase.rotateAngleX + (float) Math.toRadians(xx), tailbase.rotateAngleY + (float) Math.toRadians(yy), tailbase.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 27) {
            xx = 0 + (((tickAnim - 0) / 27) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 27) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 27) * (0-(0)));
        }
        else if (tickAnim >= 27 && tickAnim < 36) {
            xx = 0 + (((tickAnim - 27) / 9) * (-2-(0)));
            yy = 0 + (((tickAnim - 27) / 9) * (0-(0)));
            zz = 0 + (((tickAnim - 27) / 9) * (0-(0)));
        }
        else if (tickAnim >= 36 && tickAnim < 50) {
            xx = -2 + (((tickAnim - 36) / 14) * (0-(-2)));
            yy = 0 + (((tickAnim - 36) / 14) * (0-(0)));
            zz = 0 + (((tickAnim - 36) / 14) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tailmiddlebase, tailmiddlebase.rotateAngleX + (float) Math.toRadians(xx), tailmiddlebase.rotateAngleY + (float) Math.toRadians(yy), tailmiddlebase.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 19) {
            xx = 0 + (((tickAnim - 0) / 19) * (3-(0)));
            yy = 0 + (((tickAnim - 0) / 19) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 19) * (0-(0)));
        }
        else if (tickAnim >= 19 && tickAnim < 28) {
            xx = 3 + (((tickAnim - 19) / 9) * (3-(3)));
            yy = 0 + (((tickAnim - 19) / 9) * (0-(0)));
            zz = 0 + (((tickAnim - 19) / 9) * (0-(0)));
        }
        else if (tickAnim >= 28 && tickAnim < 36) {
            xx = 3 + (((tickAnim - 28) / 8) * (-1.05-(3)));
            yy = 0 + (((tickAnim - 28) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 28) / 8) * (0-(0)));
        }
        else if (tickAnim >= 36 && tickAnim < 43) {
            xx = -1.05 + (((tickAnim - 36) / 7) * (-3.56-(-1.05)));
            yy = 0 + (((tickAnim - 36) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 36) / 7) * (0-(0)));
        }
        else if (tickAnim >= 43 && tickAnim < 50) {
            xx = -3.56 + (((tickAnim - 43) / 7) * (0-(-3.56)));
            yy = 0 + (((tickAnim - 43) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 43) / 7) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tailmiddle, tailmiddle.rotateAngleX + (float) Math.toRadians(xx), tailmiddle.rotateAngleY + (float) Math.toRadians(yy), tailmiddle.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 19) {
            xx = 0 + (((tickAnim - 0) / 19) * (8.5-(0)));
            yy = 0 + (((tickAnim - 0) / 19) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 19) * (0-(0)));
        }
        else if (tickAnim >= 19 && tickAnim < 28) {
            xx = 8.5 + (((tickAnim - 19) / 9) * (8.5-(8.5)));
            yy = 0 + (((tickAnim - 19) / 9) * (0-(0)));
            zz = 0 + (((tickAnim - 19) / 9) * (0-(0)));
        }
        else if (tickAnim >= 28 && tickAnim < 36) {
            xx = 8.5 + (((tickAnim - 28) / 8) * (1.27-(8.5)));
            yy = 0 + (((tickAnim - 28) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 28) / 8) * (0-(0)));
        }
        else if (tickAnim >= 36 && tickAnim < 43) {
            xx = 1.27 + (((tickAnim - 36) / 7) * (-4.58-(1.27)));
            yy = 0 + (((tickAnim - 36) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 36) / 7) * (0-(0)));
        }
        else if (tickAnim >= 43 && tickAnim < 50) {
            xx = -4.58 + (((tickAnim - 43) / 7) * (0-(-4.58)));
            yy = 0 + (((tickAnim - 43) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 43) / 7) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tailmiddleend, tailmiddleend.rotateAngleX + (float) Math.toRadians(xx), tailmiddleend.rotateAngleY + (float) Math.toRadians(yy), tailmiddleend.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 19) {
            xx = 0 + (((tickAnim - 0) / 19) * (-7-(0)));
            yy = 0 + (((tickAnim - 0) / 19) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 19) * (0-(0)));
        }
        else if (tickAnim >= 19 && tickAnim < 28) {
            xx = -7 + (((tickAnim - 19) / 9) * (-7-(-7)));
            yy = 0 + (((tickAnim - 19) / 9) * (0-(0)));
            zz = 0 + (((tickAnim - 19) / 9) * (0-(0)));
        }
        else if (tickAnim >= 28 && tickAnim < 50) {
            xx = -7 + (((tickAnim - 28) / 22) * (0-(-7)));
            yy = 0 + (((tickAnim - 28) / 22) * (0-(0)));
            zz = 0 + (((tickAnim - 28) / 22) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(bodymiddle, bodymiddle.rotateAngleX + (float) Math.toRadians(xx), bodymiddle.rotateAngleY + (float) Math.toRadians(yy), bodymiddle.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 19) {
            xx = 0 + (((tickAnim - 0) / 19) * (8.75-(0)));
            yy = 0 + (((tickAnim - 0) / 19) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 19) * (0-(0)));
        }
        else if (tickAnim >= 19 && tickAnim < 28) {
            xx = 8.75 + (((tickAnim - 19) / 9) * (8.75-(8.75)));
            yy = 0 + (((tickAnim - 19) / 9) * (0-(0)));
            zz = 0 + (((tickAnim - 19) / 9) * (0-(0)));
        }
        else if (tickAnim >= 28 && tickAnim < 50) {
            xx = 8.75 + (((tickAnim - 28) / 22) * (0-(8.75)));
            yy = 0 + (((tickAnim - 28) / 22) * (0-(0)));
            zz = 0 + (((tickAnim - 28) / 22) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(bodyfront, bodyfront.rotateAngleX + (float) Math.toRadians(xx), bodyfront.rotateAngleY + (float) Math.toRadians(yy), bodyfront.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 0) / 50) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 50) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 50) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neckbase, neckbase.rotateAngleX + (float) Math.toRadians(xx), neckbase.rotateAngleY + (float) Math.toRadians(yy), neckbase.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 19) {
            xx = 0 + (((tickAnim - 0) / 19) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 19) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 19) * (0-(0)));
        }
        else if (tickAnim >= 19 && tickAnim < 29) {
            xx = 0 + (((tickAnim - 19) / 10) * (0-(0)));
            yy = 0 + (((tickAnim - 19) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 19) / 10) * (0-(0)));
        }
        else if (tickAnim >= 29 && tickAnim < 38) {
            xx = 0 + (((tickAnim - 29) / 9) * (5.42-(0)));
            yy = 0 + (((tickAnim - 29) / 9) * (0-(0)));
            zz = 0 + (((tickAnim - 29) / 9) * (0-(0)));
        }
        else if (tickAnim >= 38 && tickAnim < 50) {
            xx = 5.42 + (((tickAnim - 38) / 12) * (0-(5.42)));
            yy = 0 + (((tickAnim - 38) / 12) * (0-(0)));
            zz = 0 + (((tickAnim - 38) / 12) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neckmiddlebase, neckmiddlebase.rotateAngleX + (float) Math.toRadians(xx), neckmiddlebase.rotateAngleY + (float) Math.toRadians(yy), neckmiddlebase.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 0) / 13) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 13) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 13) * (-6-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 29) {
            xx = 0 + (((tickAnim - 13) / 16) * (0-(0)));
            yy = 0 + (((tickAnim - 13) / 16) * (0-(0)));
            zz = -6 + (((tickAnim - 13) / 16) * (0-(-6)));
        }
        else if (tickAnim >= 29 && tickAnim < 38) {
            xx = 0 + (((tickAnim - 29) / 9) * (7-(0)));
            yy = 0 + (((tickAnim - 29) / 9) * (0-(0)));
            zz = 0 + (((tickAnim - 29) / 9) * (0-(0)));
        }
        else if (tickAnim >= 38 && tickAnim < 50) {
            xx = 7 + (((tickAnim - 38) / 12) * (0-(7)));
            yy = 0 + (((tickAnim - 38) / 12) * (0-(0)));
            zz = 0 + (((tickAnim - 38) / 12) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neckmiddlefront, neckmiddlefront.rotateAngleX + (float) Math.toRadians(xx), neckmiddlefront.rotateAngleY + (float) Math.toRadians(yy), neckmiddlefront.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 0) / 13) * (0.55933-(0)));
            yy = 0 + (((tickAnim - 0) / 13) * (-4.63358-(0)));
            zz = 0 + (((tickAnim - 0) / 13) * (-6.17494-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 29) {
            xx = 0.55933 + (((tickAnim - 13) / 16) * (0-(0.55933)));
            yy = -4.63358 + (((tickAnim - 13) / 16) * (0-(-4.63358)));
            zz = -6.17494 + (((tickAnim - 13) / 16) * (0-(-6.17494)));
        }
        else if (tickAnim >= 29 && tickAnim < 38) {
            xx = 0 + (((tickAnim - 29) / 9) * (4.5-(0)));
            yy = 0 + (((tickAnim - 29) / 9) * (0-(0)));
            zz = 0 + (((tickAnim - 29) / 9) * (0-(0)));
        }
        else if (tickAnim >= 38 && tickAnim < 43) {
            xx = 4.5 + (((tickAnim - 38) / 5) * (6-(4.5)));
            yy = 0 + (((tickAnim - 38) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 38) / 5) * (0-(0)));
        }
        else if (tickAnim >= 43 && tickAnim < 50) {
            xx = 6 + (((tickAnim - 43) / 7) * (0-(6)));
            yy = 0 + (((tickAnim - 43) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 43) / 7) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(head, head.rotateAngleX + (float) Math.toRadians(xx), head.rotateAngleY + (float) Math.toRadians(yy), head.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 19) {
            xx = 0 + (((tickAnim - 0) / 19) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 19) * (-4.5-(0)));
            zz = 0 + (((tickAnim - 0) / 19) * (0-(0)));
        }
        else if (tickAnim >= 19 && tickAnim < 28) {
            xx = 0 + (((tickAnim - 19) / 9) * (0-(0)));
            yy = -4.5 + (((tickAnim - 19) / 9) * (-4.5-(-4.5)));
            zz = 0 + (((tickAnim - 19) / 9) * (0-(0)));
        }
        else if (tickAnim >= 28 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 28) / 22) * (0-(0)));
            yy = -4.5 + (((tickAnim - 28) / 22) * (0-(-4.5)));
            zz = 0 + (((tickAnim - 28) / 22) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightthigh, rightthigh.rotateAngleX + (float) Math.toRadians(xx), rightthigh.rotateAngleY + (float) Math.toRadians(yy), rightthigh.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 4) {
            xx = 0 + (((tickAnim - 0) / 4) * (5.67-(0)));
            yy = 0 + (((tickAnim - 0) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 4) * (0-(0)));
        }
        else if (tickAnim >= 4 && tickAnim < 12) {
            xx = 5.67 + (((tickAnim - 4) / 8) * (14.84-(5.67)));
            yy = 0 + (((tickAnim - 4) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 4) / 8) * (0-(0)));
        }
        else if (tickAnim >= 12 && tickAnim < 16) {
            xx = 14.84 + (((tickAnim - 12) / 4) * (19.56-(14.84)));
            yy = 0 + (((tickAnim - 12) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 12) / 4) * (0-(0)));
        }
        else if (tickAnim >= 16 && tickAnim < 19) {
            xx = 19.56 + (((tickAnim - 16) / 3) * (21.5-(19.56)));
            yy = 0 + (((tickAnim - 16) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 16) / 3) * (0-(0)));
        }
        else if (tickAnim >= 19 && tickAnim < 28) {
            xx = 21.5 + (((tickAnim - 19) / 9) * (21.5-(21.5)));
            yy = 0 + (((tickAnim - 19) / 9) * (0-(0)));
            zz = 0 + (((tickAnim - 19) / 9) * (0-(0)));
        }
        else if (tickAnim >= 28 && tickAnim < 39) {
            xx = 21.5 + (((tickAnim - 28) / 11) * (13.5-(21.5)));
            yy = 0 + (((tickAnim - 28) / 11) * (0-(0)));
            zz = 0 + (((tickAnim - 28) / 11) * (0-(0)));
        }
        else if (tickAnim >= 39 && tickAnim < 50) {
            xx = 13.5 + (((tickAnim - 39) / 11) * (0-(13.5)));
            yy = 0 + (((tickAnim - 39) / 11) * (0-(0)));
            zz = 0 + (((tickAnim - 39) / 11) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightshin, rightshin.rotateAngleX + (float) Math.toRadians(xx), rightshin.rotateAngleY + (float) Math.toRadians(yy), rightshin.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 4) {
            xx = 0 + (((tickAnim - 0) / 4) * (-9.55-(0)));
            yy = 0 + (((tickAnim - 0) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 4) * (0-(0)));
        }
        else if (tickAnim >= 4 && tickAnim < 12) {
            xx = -9.55 + (((tickAnim - 4) / 8) * (-24.15-(-9.55)));
            yy = 0 + (((tickAnim - 4) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 4) / 8) * (0-(0)));
        }
        else if (tickAnim >= 12 && tickAnim < 16) {
            xx = -24.15 + (((tickAnim - 12) / 4) * (-31.21-(-24.15)));
            yy = 0 + (((tickAnim - 12) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 12) / 4) * (0-(0)));
        }
        else if (tickAnim >= 16 && tickAnim < 19) {
            xx = -31.21 + (((tickAnim - 16) / 3) * (-34.75-(-31.21)));
            yy = 0 + (((tickAnim - 16) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 16) / 3) * (0-(0)));
        }
        else if (tickAnim >= 19 && tickAnim < 28) {
            xx = -34.75 + (((tickAnim - 19) / 9) * (-34.75-(-34.75)));
            yy = 0 + (((tickAnim - 19) / 9) * (0-(0)));
            zz = 0 + (((tickAnim - 19) / 9) * (0-(0)));
        }
        else if (tickAnim >= 28 && tickAnim < 39) {
            xx = -34.75 + (((tickAnim - 28) / 11) * (-25.13-(-34.75)));
            yy = 0 + (((tickAnim - 28) / 11) * (0-(0)));
            zz = 0 + (((tickAnim - 28) / 11) * (0-(0)));
        }
        else if (tickAnim >= 39 && tickAnim < 50) {
            xx = -25.13 + (((tickAnim - 39) / 11) * (0-(-25.13)));
            yy = 0 + (((tickAnim - 39) / 11) * (0-(0)));
            zz = 0 + (((tickAnim - 39) / 11) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightankle, rightankle.rotateAngleX + (float) Math.toRadians(xx), rightankle.rotateAngleY + (float) Math.toRadians(yy), rightankle.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 16 && tickAnim < 18) {
            xx = 0 + (((tickAnim - 16) / 2) * (0-(0)));
            yy = 0 + (((tickAnim - 16) / 2) * (0.1-(0)));
            zz = 0 + (((tickAnim - 16) / 2) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 19) {
            xx = 0 + (((tickAnim - 18) / 1) * (0-(0)));
            yy = 0.1 + (((tickAnim - 18) / 1) * (0-(0.1)));
            zz = 0 + (((tickAnim - 18) / 1) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.rightankle.rotationPointX = this.rightankle.rotationPointX + (float)(xx);
        this.rightankle.rotationPointY = this.rightankle.rotationPointY - (float)(yy);
        this.rightankle.rotationPointZ = this.rightankle.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 4) {
            xx = 0 + (((tickAnim - 0) / 4) * (3.49-(0)));
            yy = 0 + (((tickAnim - 0) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 4) * (0-(0)));
        }
        else if (tickAnim >= 4 && tickAnim < 19) {
            xx = 3.49 + (((tickAnim - 4) / 15) * (13.75-(3.49)));
            yy = 0 + (((tickAnim - 4) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 4) / 15) * (0-(0)));
        }
        else if (tickAnim >= 19 && tickAnim < 28) {
            xx = 13.75 + (((tickAnim - 19) / 9) * (13.75-(13.75)));
            yy = 0 + (((tickAnim - 19) / 9) * (0-(0)));
            zz = 0 + (((tickAnim - 19) / 9) * (0-(0)));
        }
        else if (tickAnim >= 28 && tickAnim < 39) {
            xx = 13.75 + (((tickAnim - 28) / 11) * (11.63-(13.75)));
            yy = 0 + (((tickAnim - 28) / 11) * (0-(0)));
            zz = 0 + (((tickAnim - 28) / 11) * (0-(0)));
        }
        else if (tickAnim >= 39 && tickAnim < 50) {
            xx = 11.63 + (((tickAnim - 39) / 11) * (0-(11.63)));
            yy = 0 + (((tickAnim - 39) / 11) * (0-(0)));
            zz = 0 + (((tickAnim - 39) / 11) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightfoot, rightfoot.rotateAngleX + (float) Math.toRadians(xx), rightfoot.rotateAngleY + (float) Math.toRadians(yy), rightfoot.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 28 && tickAnim < 30) {
            xx = 0 + (((tickAnim - 28) / 2) * (0-(0)));
            yy = 0 + (((tickAnim - 28) / 2) * (0.235-(0)));
            zz = 0 + (((tickAnim - 28) / 2) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 33) {
            xx = 0 + (((tickAnim - 30) / 3) * (0-(0)));
            yy = 0.235 + (((tickAnim - 30) / 3) * (0.225-(0.235)));
            zz = 0 + (((tickAnim - 30) / 3) * (0-(0)));
        }
        else if (tickAnim >= 33 && tickAnim < 39) {
            xx = 0 + (((tickAnim - 33) / 6) * (0-(0)));
            yy = 0.225 + (((tickAnim - 33) / 6) * (0-(0.225)));
            zz = 0 + (((tickAnim - 33) / 6) * (0-(0)));
        }
        else if (tickAnim >= 39 && tickAnim < 42) {
            xx = 0 + (((tickAnim - 39) / 3) * (0-(0)));
            yy = 0 + (((tickAnim - 39) / 3) * (0.175-(0)));
            zz = 0 + (((tickAnim - 39) / 3) * (0-(0)));
        }
        else if (tickAnim >= 42 && tickAnim < 44) {
            xx = 0 + (((tickAnim - 42) / 2) * (0-(0)));
            yy = 0.175 + (((tickAnim - 42) / 2) * (0.2-(0.175)));
            zz = 0 + (((tickAnim - 42) / 2) * (0-(0)));
        }
        else if (tickAnim >= 44 && tickAnim < 48) {
            xx = 0 + (((tickAnim - 44) / 4) * (0-(0)));
            yy = 0.2 + (((tickAnim - 44) / 4) * (0.13-(0.2)));
            zz = 0 + (((tickAnim - 44) / 4) * (0-(0)));
        }
        else if (tickAnim >= 48 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 48) / 2) * (0-(0)));
            yy = 0.13 + (((tickAnim - 48) / 2) * (0-(0.13)));
            zz = 0 + (((tickAnim - 48) / 2) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.rightfoot.rotationPointX = this.rightfoot.rotationPointX + (float)(xx);
        this.rightfoot.rotationPointY = this.rightfoot.rotationPointY - (float)(yy);
        this.rightfoot.rotationPointZ = this.rightfoot.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 19) {
            xx = 0 + (((tickAnim - 0) / 19) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 19) * (4.5-(0)));
            zz = 0 + (((tickAnim - 0) / 19) * (0-(0)));
        }
        else if (tickAnim >= 19 && tickAnim < 28) {
            xx = 0 + (((tickAnim - 19) / 9) * (0-(0)));
            yy = 4.5 + (((tickAnim - 19) / 9) * (4.5-(4.5)));
            zz = 0 + (((tickAnim - 19) / 9) * (0-(0)));
        }
        else if (tickAnim >= 28 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 28) / 22) * (0-(0)));
            yy = 4.5 + (((tickAnim - 28) / 22) * (0-(4.5)));
            zz = 0 + (((tickAnim - 28) / 22) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftthigh, leftthigh.rotateAngleX + (float) Math.toRadians(xx), leftthigh.rotateAngleY + (float) Math.toRadians(yy), leftthigh.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 4) {
            xx = 0 + (((tickAnim - 0) / 4) * (5.66-(0)));
            yy = 0 + (((tickAnim - 0) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 4) * (0-(0)));
        }
        else if (tickAnim >= 4 && tickAnim < 9) {
            xx = 5.66 + (((tickAnim - 4) / 5) * (12.12-(5.66)));
            yy = 0 + (((tickAnim - 4) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 4) / 5) * (0-(0)));
        }
        else if (tickAnim >= 9 && tickAnim < 14) {
            xx = 12.12 + (((tickAnim - 9) / 5) * (17.84-(12.12)));
            yy = 0 + (((tickAnim - 9) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 9) / 5) * (0-(0)));
        }
        else if (tickAnim >= 14 && tickAnim < 19) {
            xx = 17.84 + (((tickAnim - 14) / 5) * (21.5-(17.84)));
            yy = 0 + (((tickAnim - 14) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 14) / 5) * (0-(0)));
        }
        else if (tickAnim >= 19 && tickAnim < 28) {
            xx = 21.5 + (((tickAnim - 19) / 9) * (21.5-(21.5)));
            yy = 0 + (((tickAnim - 19) / 9) * (0-(0)));
            zz = 0 + (((tickAnim - 19) / 9) * (0-(0)));
        }
        else if (tickAnim >= 28 && tickAnim < 39) {
            xx = 21.5 + (((tickAnim - 28) / 11) * (13.5-(21.5)));
            yy = 0 + (((tickAnim - 28) / 11) * (0-(0)));
            zz = 0 + (((tickAnim - 28) / 11) * (0-(0)));
        }
        else if (tickAnim >= 39 && tickAnim < 50) {
            xx = 13.5 + (((tickAnim - 39) / 11) * (0-(13.5)));
            yy = 0 + (((tickAnim - 39) / 11) * (0-(0)));
            zz = 0 + (((tickAnim - 39) / 11) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftshin, leftshin.rotateAngleX + (float) Math.toRadians(xx), leftshin.rotateAngleY + (float) Math.toRadians(yy), leftshin.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 4) {
            xx = 0 + (((tickAnim - 0) / 4) * (-9.83-(0)));
            yy = 0 + (((tickAnim - 0) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 4) * (0-(0)));
        }
        else if (tickAnim >= 4 && tickAnim < 9) {
            xx = -9.83 + (((tickAnim - 4) / 5) * (-19.66-(-9.83)));
            yy = 0 + (((tickAnim - 4) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 4) / 5) * (0-(0)));
        }
        else if (tickAnim >= 9 && tickAnim < 14) {
            xx = -19.66 + (((tickAnim - 9) / 5) * (-28.91-(-19.66)));
            yy = 0 + (((tickAnim - 9) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 9) / 5) * (0-(0)));
        }
        else if (tickAnim >= 14 && tickAnim < 19) {
            xx = -28.91 + (((tickAnim - 14) / 5) * (-34.75-(-28.91)));
            yy = 0 + (((tickAnim - 14) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 14) / 5) * (0-(0)));
        }
        else if (tickAnim >= 19 && tickAnim < 28) {
            xx = -34.75 + (((tickAnim - 19) / 9) * (-34.75-(-34.75)));
            yy = 0 + (((tickAnim - 19) / 9) * (0-(0)));
            zz = 0 + (((tickAnim - 19) / 9) * (0-(0)));
        }
        else if (tickAnim >= 28 && tickAnim < 39) {
            xx = -34.75 + (((tickAnim - 28) / 11) * (-25.13-(-34.75)));
            yy = 0 + (((tickAnim - 28) / 11) * (0-(0)));
            zz = 0 + (((tickAnim - 28) / 11) * (0-(0)));
        }
        else if (tickAnim >= 39 && tickAnim < 50) {
            xx = -25.13 + (((tickAnim - 39) / 11) * (0-(-25.13)));
            yy = 0 + (((tickAnim - 39) / 11) * (0-(0)));
            zz = 0 + (((tickAnim - 39) / 11) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftankle, leftankle.rotateAngleX + (float) Math.toRadians(xx), leftankle.rotateAngleY + (float) Math.toRadians(yy), leftankle.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 14 && tickAnim < 18) {
            xx = 0 + (((tickAnim - 14) / 4) * (0-(0)));
            yy = 0 + (((tickAnim - 14) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 14) / 4) * (0.175-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 19) {
            xx = 0 + (((tickAnim - 18) / 1) * (0-(0)));
            yy = 0 + (((tickAnim - 18) / 1) * (0-(0)));
            zz = 0.175 + (((tickAnim - 18) / 1) * (0-(0.175)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.leftankle.rotationPointX = this.leftankle.rotationPointX + (float)(xx);
        this.leftankle.rotationPointY = this.leftankle.rotationPointY - (float)(yy);
        this.leftankle.rotationPointZ = this.leftankle.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 4) {
            xx = 0 + (((tickAnim - 0) / 4) * (3.52-(0)));
            yy = 0 + (((tickAnim - 0) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 4) * (0-(0)));
        }
        else if (tickAnim >= 4 && tickAnim < 9) {
            xx = 3.52 + (((tickAnim - 4) / 5) * (7.25-(3.52)));
            yy = 0 + (((tickAnim - 4) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 4) / 5) * (0-(0)));
        }
        else if (tickAnim >= 9 && tickAnim < 13) {
            xx = 7.25 + (((tickAnim - 9) / 4) * (9.67-(7.25)));
            yy = 0 + (((tickAnim - 9) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 9) / 4) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 14) {
            xx = 9.67 + (((tickAnim - 13) / 1) * (10.76-(9.67)));
            yy = 0 + (((tickAnim - 13) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 13) / 1) * (0-(0)));
        }
        else if (tickAnim >= 14 && tickAnim < 17) {
            xx = 10.76 + (((tickAnim - 14) / 3) * (11-(10.76)));
            yy = 0 + (((tickAnim - 14) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 14) / 3) * (0-(0)));
        }
        else if (tickAnim >= 17 && tickAnim < 19) {
            xx = 11 + (((tickAnim - 17) / 2) * (13.75-(11)));
            yy = 0 + (((tickAnim - 17) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 17) / 2) * (0-(0)));
        }
        else if (tickAnim >= 19 && tickAnim < 28) {
            xx = 13.75 + (((tickAnim - 19) / 9) * (13.75-(13.75)));
            yy = 0 + (((tickAnim - 19) / 9) * (0-(0)));
            zz = 0 + (((tickAnim - 19) / 9) * (0-(0)));
        }
        else if (tickAnim >= 28 && tickAnim < 39) {
            xx = 13.75 + (((tickAnim - 28) / 11) * (11.63-(13.75)));
            yy = 0 + (((tickAnim - 28) / 11) * (0-(0)));
            zz = 0 + (((tickAnim - 28) / 11) * (0-(0)));
        }
        else if (tickAnim >= 39 && tickAnim < 50) {
            xx = 11.63 + (((tickAnim - 39) / 11) * (0-(11.63)));
            yy = 0 + (((tickAnim - 39) / 11) * (0-(0)));
            zz = 0 + (((tickAnim - 39) / 11) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftfoot, leftfoot.rotateAngleX + (float) Math.toRadians(xx), leftfoot.rotateAngleY + (float) Math.toRadians(yy), leftfoot.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 28 && tickAnim < 30) {
            xx = 0 + (((tickAnim - 28) / 2) * (0-(0)));
            yy = 0 + (((tickAnim - 28) / 2) * (0.235-(0)));
            zz = 0 + (((tickAnim - 28) / 2) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 33) {
            xx = 0 + (((tickAnim - 30) / 3) * (0-(0)));
            yy = 0.235 + (((tickAnim - 30) / 3) * (0.225-(0.235)));
            zz = 0 + (((tickAnim - 30) / 3) * (0-(0)));
        }
        else if (tickAnim >= 33 && tickAnim < 39) {
            xx = 0 + (((tickAnim - 33) / 6) * (0-(0)));
            yy = 0.225 + (((tickAnim - 33) / 6) * (0-(0.225)));
            zz = 0 + (((tickAnim - 33) / 6) * (0-(0)));
        }
        else if (tickAnim >= 39 && tickAnim < 42) {
            xx = 0 + (((tickAnim - 39) / 3) * (0-(0)));
            yy = 0 + (((tickAnim - 39) / 3) * (0.175-(0)));
            zz = 0 + (((tickAnim - 39) / 3) * (0-(0)));
        }
        else if (tickAnim >= 42 && tickAnim < 44) {
            xx = 0 + (((tickAnim - 42) / 2) * (0-(0)));
            yy = 0.175 + (((tickAnim - 42) / 2) * (0.2-(0.175)));
            zz = 0 + (((tickAnim - 42) / 2) * (0-(0)));
        }
        else if (tickAnim >= 44 && tickAnim < 48) {
            xx = 0 + (((tickAnim - 44) / 4) * (0-(0)));
            yy = 0.2 + (((tickAnim - 44) / 4) * (0.13-(0.2)));
            zz = 0 + (((tickAnim - 44) / 4) * (0-(0)));
        }
        else if (tickAnim >= 48 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 48) / 2) * (0-(0)));
            yy = 0.13 + (((tickAnim - 48) / 2) * (0-(0.13)));
            zz = 0 + (((tickAnim - 48) / 2) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.leftfoot.rotationPointX = this.leftfoot.rotationPointX + (float)(xx);
        this.leftfoot.rotationPointY = this.leftfoot.rotationPointY - (float)(yy);
        this.leftfoot.rotationPointZ = this.leftfoot.rotationPointZ + (float)(zz);


    }
    public void animNest(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime, double animTick) {
        EntityPrehistoricFloraAnchisaurus entity = (EntityPrehistoricFloraAnchisaurus) entitylivingbaseIn;

        double tickAnim = animTick + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;

        if (tickAnim >= 0 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 0) / 50) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 50) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 50) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(hips, hips.rotateAngleX + (float) Math.toRadians(xx), hips.rotateAngleY + (float) Math.toRadians(yy), hips.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 0) / 50) * (0-(0)));
            yy = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*108/0.75-230))*-2 + (((tickAnim - 0) / 50) * (0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*108/0.75-230))*-2-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*108/0.75-230))*-2)));
            zz = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*108/0.75-200))*-3 + (((tickAnim - 0) / 50) * (0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*108/0.75-200))*-3-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*108/0.75-200))*-3)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tailbase, tailbase.rotateAngleX + (float) Math.toRadians(xx), tailbase.rotateAngleY + (float) Math.toRadians(yy), tailbase.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 0) / 50) * (0-(0)));
            yy = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*108/0.75-230))*-2 + (((tickAnim - 0) / 50) * (0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*108/0.75-230))*-2-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*108/0.75-230))*-2)));
            zz = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*108/0.75-200))*-3 + (((tickAnim - 0) / 50) * (0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*108/0.75-200))*-3-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*108/0.75-200))*-3)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tailmiddlebase, tailmiddlebase.rotateAngleX + (float) Math.toRadians(xx), tailmiddlebase.rotateAngleY + (float) Math.toRadians(yy), tailmiddlebase.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 0) / 50) * (0-(0)));
            yy = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*108/0.75-230))*-2 + (((tickAnim - 0) / 50) * (0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*108/0.75-230))*-2-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*108/0.75-230))*-2)));
            zz = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*108/0.75-200))*-3 + (((tickAnim - 0) / 50) * (0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*108/0.75-200))*-3-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*108/0.75-200))*-3)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tailmiddle, tailmiddle.rotateAngleX + (float) Math.toRadians(xx), tailmiddle.rotateAngleY + (float) Math.toRadians(yy), tailmiddle.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 0) / 50) * (0-(0)));
            yy = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*108/0.75-230))*-2 + (((tickAnim - 0) / 50) * (0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*108/0.75-230))*-2-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*108/0.75-230))*-2)));
            zz = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*108/0.75-200))*-3 + (((tickAnim - 0) / 50) * (0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*108/0.75-200))*-3-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*108/0.75-200))*-3)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tailmiddleend, tailmiddleend.rotateAngleX + (float) Math.toRadians(xx), tailmiddleend.rotateAngleY + (float) Math.toRadians(yy), tailmiddleend.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 0) / 50) * (0-(0)));
            yy = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*108/0.75-230))*-2 + (((tickAnim - 0) / 50) * (0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*108/0.75-230))*-2-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*108/0.75-230))*-2)));
            zz = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*108/0.75-200))*-3 + (((tickAnim - 0) / 50) * (0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*108/0.75-200))*-3-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*108/0.75-200))*-3)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tailend, tailend.rotateAngleX + (float) Math.toRadians(xx), tailend.rotateAngleY + (float) Math.toRadians(yy), tailend.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 50) {
            xx = -2 + (((tickAnim - 0) / 50) * (-2-(-2)));
            yy = Math.sin((Math.PI/180)*(((double)tickAnim/20)*108/0.75-189))*-1 + (((tickAnim - 0) / 50) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*108/0.75-189))*-1-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*108/0.75-189))*-1)));
            zz = Math.sin((Math.PI/180)*(((double)tickAnim/20)*108/0.75-200))*-3 + (((tickAnim - 0) / 50) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*108/0.75-200))*-3-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*108/0.75-200))*-3)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(bodymiddle, bodymiddle.rotateAngleX + (float) Math.toRadians(xx), bodymiddle.rotateAngleY + (float) Math.toRadians(yy), bodymiddle.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 50) {
            xx = 4 + (((tickAnim - 0) / 50) * (4-(4)));
            yy = Math.sin((Math.PI/180)*(((double)tickAnim/20)*108/0.75-189))*-1 + (((tickAnim - 0) / 50) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*108/0.75-189))*-1-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*108/0.75-189))*-1)));
            zz = Math.sin((Math.PI/180)*(((double)tickAnim/20)*108/0.75-720))*-1 + (((tickAnim - 0) / 50) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*108/0.75-720))*-1-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*108/0.75-720))*-1)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(bodyfront, bodyfront.rotateAngleX + (float) Math.toRadians(xx), bodyfront.rotateAngleY + (float) Math.toRadians(yy), bodyfront.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 50) {
            xx = -0.60681 + (((tickAnim - 0) / 50) * (-0.60681-(-0.60681)));
            yy = -2.28+Math.sin((Math.PI/180)*(((double)tickAnim/20)*108/0.75-189))*-1 + (((tickAnim - 0) / 50) * (-2.28+Math.sin((Math.PI/180)*(((double)tickAnim/20)*108/0.75-189))*-1-(-2.28+Math.sin((Math.PI/180)*(((double)tickAnim/20)*108/0.75-189))*-1)));
            zz = 10.2559+Math.sin((Math.PI/180)*(((double)tickAnim/20)*108/0.75-200))*- + (((tickAnim - 0) / 50) * (10.2559+Math.sin((Math.PI/180)*(((double)tickAnim/20)*108/0.75-200))*-(10.2559+Math.sin((Math.PI/180)*(((double)tickAnim/20)*108/0.75-200)))));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neckbase, neckbase.rotateAngleX + (float) Math.toRadians(xx), neckbase.rotateAngleY + (float) Math.toRadians(yy), neckbase.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 50) {
            xx = -0.28486 + (((tickAnim - 0) / 50) * (-0.28486-(-0.28486)));
            yy = -8.0037+Math.sin((Math.PI/180)*(((double)tickAnim/20)*108/0.75-150))*-1 + (((tickAnim - 0) / 50) * (-8.0037+Math.sin((Math.PI/180)*(((double)tickAnim/20)*108/0.75-150))*-1-(-8.0037+Math.sin((Math.PI/180)*(((double)tickAnim/20)*108/0.75-150))*-1)));
            zz = 4.6499+Math.sin((Math.PI/180)*(((double)tickAnim/20)*108/0.75-200))* + (((tickAnim - 0) / 50) * (4.6499+Math.sin((Math.PI/180)*(((double)tickAnim/20)*108/0.75-200))*-(4.6499+Math.sin((Math.PI/180)*(((double)tickAnim/20)*108/0.75-200)))));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neckmiddlebase, neckmiddlebase.rotateAngleX + (float) Math.toRadians(xx), neckmiddlebase.rotateAngleY + (float) Math.toRadians(yy), neckmiddlebase.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 50) {
            xx = -0.8609 + (((tickAnim - 0) / 50) * (-0.8609-(-0.8609)));
            yy = -18.2291+Math.sin((Math.PI/180)*(((double)tickAnim/20)*108/0.75-155))*-1 + (((tickAnim - 0) / 50) * (-18.2291+Math.sin((Math.PI/180)*(((double)tickAnim/20)*108/0.75-155))*-1-(-18.2291+Math.sin((Math.PI/180)*(((double)tickAnim/20)*108/0.75-155))*-1)));
            zz = -0.9738+Math.sin((Math.PI/180)*(((double)tickAnim/20)*108/0.75-200)) + (((tickAnim - 0) / 50) * (-0.9738+Math.sin((Math.PI/180)*(((double)tickAnim/20)*108/0.75-200))-(-0.9738+Math.sin((Math.PI/180)*(((double)tickAnim/20)*108/0.75-200)))));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neckmiddlefront, neckmiddlefront.rotateAngleX + (float) Math.toRadians(xx), neckmiddlefront.rotateAngleY + (float) Math.toRadians(yy), neckmiddlefront.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 50) {
            xx = -2.14987 + (((tickAnim - 0) / 50) * (-2.14987-(-2.14987)));
            yy = 2.0764+Math.sin((Math.PI/180)*(((double)tickAnim/20)*108/0.75-500))*-4 + (((tickAnim - 0) / 50) * (2.0764+Math.sin((Math.PI/180)*(((double)tickAnim/20)*108/0.75-500))*-4-(2.0764+Math.sin((Math.PI/180)*(((double)tickAnim/20)*108/0.75-500))*-4)));
            zz = 10.0108+Math.sin((Math.PI/180)*(((double)tickAnim/20)*108/0.75-200))* + (((tickAnim - 0) / 50) * (10.0108+Math.sin((Math.PI/180)*(((double)tickAnim/20)*108/0.75-200))*-(10.0108+Math.sin((Math.PI/180)*(((double)tickAnim/20)*108/0.75-200)))));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(head, head.rotateAngleX + (float) Math.toRadians(xx), head.rotateAngleY + (float) Math.toRadians(yy), head.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 27) {
            xx = 0 + (((tickAnim - 0) / 27) * (15.25-(0)));
            yy = 0 + (((tickAnim - 0) / 27) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 27) * (0-(0)));
        }
        else if (tickAnim >= 27 && tickAnim < 50) {
            xx = 15.25 + (((tickAnim - 27) / 23) * (0-(15.25)));
            yy = 0 + (((tickAnim - 27) / 23) * (0-(0)));
            zz = 0 + (((tickAnim - 27) / 23) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightupperarm, rightupperarm.rotateAngleX + (float) Math.toRadians(xx), rightupperarm.rotateAngleY + (float) Math.toRadians(yy), rightupperarm.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 27) {
            xx = 0 + (((tickAnim - 0) / 27) * (-34.25-(0)));
            yy = 0 + (((tickAnim - 0) / 27) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 27) * (0-(0)));
        }
        else if (tickAnim >= 27 && tickAnim < 50) {
            xx = -34.25 + (((tickAnim - 27) / 23) * (0-(-34.25)));
            yy = 0 + (((tickAnim - 27) / 23) * (0-(0)));
            zz = 0 + (((tickAnim - 27) / 23) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightlowerarm, rightlowerarm.rotateAngleX + (float) Math.toRadians(xx), rightlowerarm.rotateAngleY + (float) Math.toRadians(yy), rightlowerarm.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 27) {
            xx = 0 + (((tickAnim - 0) / 27) * (15.25-(0)));
            yy = 0 + (((tickAnim - 0) / 27) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 27) * (0-(0)));
        }
        else if (tickAnim >= 27 && tickAnim < 50) {
            xx = 15.25 + (((tickAnim - 27) / 23) * (0-(15.25)));
            yy = 0 + (((tickAnim - 27) / 23) * (0-(0)));
            zz = 0 + (((tickAnim - 27) / 23) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftupperarm, leftupperarm.rotateAngleX + (float) Math.toRadians(xx), leftupperarm.rotateAngleY + (float) Math.toRadians(yy), leftupperarm.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 27) {
            xx = 0 + (((tickAnim - 0) / 27) * (-34.25-(0)));
            yy = 0 + (((tickAnim - 0) / 27) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 27) * (0-(0)));
        }
        else if (tickAnim >= 27 && tickAnim < 50) {
            xx = -34.25 + (((tickAnim - 27) / 23) * (0-(-34.25)));
            yy = 0 + (((tickAnim - 27) / 23) * (0-(0)));
            zz = 0 + (((tickAnim - 27) / 23) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftlowerarm, leftlowerarm.rotateAngleX + (float) Math.toRadians(xx), leftlowerarm.rotateAngleY + (float) Math.toRadians(yy), leftlowerarm.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 25) {
            xx = -18.19162 + (((tickAnim - 0) / 25) * (9.6812-(-18.19162)));
            yy = 1.58774 + (((tickAnim - 0) / 25) * (9.51868-(1.58774)));
            zz = 4.21113 + (((tickAnim - 0) / 25) * (4.87018-(4.21113)));
        }
        else if (tickAnim >= 25 && tickAnim < 40) {
            xx = 9.6812 + (((tickAnim - 25) / 15) * (-1.77073-(9.6812)));
            yy = 9.51868 + (((tickAnim - 25) / 15) * (-11.08171-(9.51868)));
            zz = 4.87018 + (((tickAnim - 25) / 15) * (-1.95086-(4.87018)));
        }
        else if (tickAnim >= 40 && tickAnim < 50) {
            xx = -1.77073 + (((tickAnim - 40) / 10) * (-18.19162-(-1.77073)));
            yy = -11.08171 + (((tickAnim - 40) / 10) * (1.58774-(-11.08171)));
            zz = -1.95086 + (((tickAnim - 40) / 10) * (4.21113-(-1.95086)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightthigh, rightthigh.rotateAngleX + (float) Math.toRadians(xx), rightthigh.rotateAngleY + (float) Math.toRadians(yy), rightthigh.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 25) {
            xx = 0 + (((tickAnim - 0) / 25) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 25) * (-2.57-(0)));
            zz = 0 + (((tickAnim - 0) / 25) * (0-(0)));
        }
        else if (tickAnim >= 25 && tickAnim < 33) {
            xx = 0 + (((tickAnim - 25) / 8) * (0-(0)));
            yy = -2.57 + (((tickAnim - 25) / 8) * (0.745-(-2.57)));
            zz = 0 + (((tickAnim - 25) / 8) * (0-(0)));
        }
        else if (tickAnim >= 33 && tickAnim < 40) {
            xx = 0 + (((tickAnim - 33) / 7) * (0-(0)));
            yy = 0.745 + (((tickAnim - 33) / 7) * (1.395-(0.745)));
            zz = 0 + (((tickAnim - 33) / 7) * (0-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 40) / 10) * (0-(0)));
            yy = 1.395 + (((tickAnim - 40) / 10) * (0-(1.395)));
            zz = 0 + (((tickAnim - 40) / 10) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.rightthigh.rotationPointX = this.rightthigh.rotationPointX + (float)(xx);
        this.rightthigh.rotationPointY = this.rightthigh.rotationPointY - (float)(yy);
        this.rightthigh.rotationPointZ = this.rightthigh.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 5) {
            xx = -0.5 + (((tickAnim - 0) / 5) * (-16.5-(-0.5)));
            yy = 0 + (((tickAnim - 0) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 5) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 11) {
            xx = -16.5 + (((tickAnim - 5) / 6) * (0.25-(-16.5)));
            yy = 0 + (((tickAnim - 5) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 5) / 6) * (0-(0)));
        }
        else if (tickAnim >= 11 && tickAnim < 22) {
            xx = 0.25 + (((tickAnim - 11) / 11) * (29.46255-(0.25)));
            yy = 0 + (((tickAnim - 11) / 11) * (-10.3634-(0)));
            zz = 0 + (((tickAnim - 11) / 11) * (-0.95634-(0)));
        }
        else if (tickAnim >= 22 && tickAnim < 25) {
            xx = 29.46255 + (((tickAnim - 22) / 3) * (25.3741-(29.46255)));
            yy = -10.3634 + (((tickAnim - 22) / 3) * (-13.55214-(-10.3634)));
            zz = -0.95634 + (((tickAnim - 22) / 3) * (-1.2506-(-0.95634)));
        }
        else if (tickAnim >= 25 && tickAnim < 43) {
            xx = 25.3741 + (((tickAnim - 25) / 18) * (22.69-(25.3741)));
            yy = -13.55214 + (((tickAnim - 25) / 18) * (0-(-13.55214)));
            zz = -1.2506 + (((tickAnim - 25) / 18) * (0-(-1.2506)));
        }
        else if (tickAnim >= 43 && tickAnim < 50) {
            xx = 22.69 + (((tickAnim - 43) / 7) * (-0.5-(22.69)));
            yy = 0 + (((tickAnim - 43) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 43) / 7) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightshin, rightshin.rotateAngleX + (float) Math.toRadians(xx), rightshin.rotateAngleY + (float) Math.toRadians(yy), rightshin.rotateAngleZ + (float) Math.toRadians(zz));

        this.rightshin.rotationPointX = this.rightshin.rotationPointX + (float)(0.325);
        this.rightshin.rotationPointY = this.rightshin.rotationPointY - (float)(0);
        this.rightshin.rotationPointZ = this.rightshin.rotationPointZ + (float)(0);



        if (tickAnim >= 0 && tickAnim < 5) {
            xx = -8 + (((tickAnim - 0) / 5) * (19.5-(-8)));
            yy = 0 + (((tickAnim - 0) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 5) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 8) {
            xx = 19.5 + (((tickAnim - 5) / 3) * (-12.05-(19.5)));
            yy = 0 + (((tickAnim - 5) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 5) / 3) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 11) {
            xx = -12.05 + (((tickAnim - 8) / 3) * (-21.75-(-12.05)));
            yy = 0 + (((tickAnim - 8) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 3) * (0-(0)));
        }
        else if (tickAnim >= 11 && tickAnim < 14) {
            xx = -21.75 + (((tickAnim - 11) / 3) * (-31.64-(-21.75)));
            yy = 0 + (((tickAnim - 11) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 11) / 3) * (0-(0)));
        }
        else if (tickAnim >= 14 && tickAnim < 18) {
            xx = -31.64 + (((tickAnim - 14) / 4) * (-1.54-(-31.64)));
            yy = 0 + (((tickAnim - 14) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 14) / 4) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 22) {
            xx = -1.54 + (((tickAnim - 18) / 4) * (0.48-(-1.54)));
            yy = 0 + (((tickAnim - 18) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 18) / 4) * (0-(0)));
        }
        else if (tickAnim >= 22 && tickAnim < 28) {
            xx = 0.48 + (((tickAnim - 22) / 6) * (14.7-(0.48)));
            yy = 0 + (((tickAnim - 22) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 22) / 6) * (0-(0)));
        }
        else if (tickAnim >= 28 && tickAnim < 31) {
            xx = 14.7 + (((tickAnim - 28) / 3) * (20.39-(14.7)));
            yy = 0 + (((tickAnim - 28) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 28) / 3) * (0-(0)));
        }
        else if (tickAnim >= 31 && tickAnim < 44) {
            xx = 20.39 + (((tickAnim - 31) / 13) * (-54.58-(20.39)));
            yy = 0 + (((tickAnim - 31) / 13) * (0-(0)));
            zz = 0 + (((tickAnim - 31) / 13) * (0-(0)));
        }
        else if (tickAnim >= 44 && tickAnim < 50) {
            xx = -54.58 + (((tickAnim - 44) / 6) * (-8-(-54.58)));
            yy = 0 + (((tickAnim - 44) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 44) / 6) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightankle, rightankle.rotateAngleX + (float) Math.toRadians(xx), rightankle.rotateAngleY + (float) Math.toRadians(yy), rightankle.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 8) {
            xx = 16.75 + (((tickAnim - 0) / 8) * (31-(16.75)));
            yy = 0 + (((tickAnim - 0) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 8) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 11) {
            xx = 31 + (((tickAnim - 8) / 3) * (28.74024-(31)));
            yy = 0 + (((tickAnim - 8) / 3) * (0.58463-(0)));
            zz = 0 + (((tickAnim - 8) / 3) * (-1.91268-(0)));
        }
        else if (tickAnim >= 11 && tickAnim < 13) {
            xx = 28.74024 + (((tickAnim - 11) / 2) * (28.89-(28.74024)));
            yy = 0.58463 + (((tickAnim - 11) / 2) * (0-(0.58463)));
            zz = -1.91268 + (((tickAnim - 11) / 2) * (0-(-1.91268)));
        }
        else if (tickAnim >= 13 && tickAnim < 14) {
            xx = 28.89 + (((tickAnim - 13) / 1) * (34.15-(28.89)));
            yy = 0 + (((tickAnim - 13) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 13) / 1) * (0-(0)));
        }
        else if (tickAnim >= 14 && tickAnim < 17) {
            xx = 34.15 + (((tickAnim - 14) / 3) * (-1.48-(34.15)));
            yy = 0 + (((tickAnim - 14) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 14) / 3) * (0-(0)));
        }
        else if (tickAnim >= 17 && tickAnim < 18) {
            xx = -1.48 + (((tickAnim - 17) / 1) * (-14.61-(-1.48)));
            yy = 0 + (((tickAnim - 17) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 17) / 1) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 22) {
            xx = -14.61 + (((tickAnim - 18) / 4) * (39.75-(-14.61)));
            yy = 0 + (((tickAnim - 18) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 18) / 4) * (0-(0)));
        }
        else if (tickAnim >= 22 && tickAnim < 25) {
            xx = 39.75 + (((tickAnim - 22) / 3) * (70.99002-(39.75)));
            yy = 0 + (((tickAnim - 22) / 3) * (0.18287-(0)));
            zz = 0 + (((tickAnim - 22) / 3) * (-6.24733-(0)));
        }
        else if (tickAnim >= 25 && tickAnim < 28) {
            xx = 70.99002 + (((tickAnim - 25) / 3) * (76.75-(70.99002)));
            yy = 0.18287 + (((tickAnim - 25) / 3) * (0-(0.18287)));
            zz = -6.24733 + (((tickAnim - 25) / 3) * (0-(-6.24733)));
        }
        else if (tickAnim >= 28 && tickAnim < 31) {
            xx = 76.75 + (((tickAnim - 28) / 3) * (71-(76.75)));
            yy = 0 + (((tickAnim - 28) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 28) / 3) * (0-(0)));
        }
        else if (tickAnim >= 31 && tickAnim < 40) {
            xx = 71 + (((tickAnim - 31) / 9) * (56-(71)));
            yy = 0 + (((tickAnim - 31) / 9) * (0-(0)));
            zz = 0 + (((tickAnim - 31) / 9) * (0-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 50) {
            xx = 56 + (((tickAnim - 40) / 10) * (16.75-(56)));
            yy = 0 + (((tickAnim - 40) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 40) / 10) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightfoot, rightfoot.rotateAngleX + (float) Math.toRadians(xx), rightfoot.rotateAngleY + (float) Math.toRadians(yy), rightfoot.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 5) {
            xx = 12.75 + (((tickAnim - 0) / 5) * (-6.5-(12.75)));
            yy = 0 + (((tickAnim - 0) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 5) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 8) {
            xx = -6.5 + (((tickAnim - 5) / 3) * (0-(-6.5)));
            yy = 0 + (((tickAnim - 5) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 5) / 3) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 8) / 5) * (0-(0)));
            yy = 0 + (((tickAnim - 8) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 5) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 17) {
            xx = 0 + (((tickAnim - 13) / 4) * (-2.32-(0)));
            yy = 0 + (((tickAnim - 13) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 13) / 4) * (0-(0)));
        }
        else if (tickAnim >= 17 && tickAnim < 22) {
            xx = -2.32 + (((tickAnim - 17) / 5) * (-68.39-(-2.32)));
            yy = 0 + (((tickAnim - 17) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 17) / 5) * (0-(0)));
        }
        else if (tickAnim >= 22 && tickAnim < 25) {
            xx = -68.39 + (((tickAnim - 22) / 3) * (-104.5-(-68.39)));
            yy = 0 + (((tickAnim - 22) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 22) / 3) * (0-(0)));
        }
        else if (tickAnim >= 25 && tickAnim < 28) {
            xx = -104.5 + (((tickAnim - 25) / 3) * (-103.05-(-104.5)));
            yy = 0 + (((tickAnim - 25) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 25) / 3) * (0-(0)));
        }
        else if (tickAnim >= 28 && tickAnim < 29) {
            xx = -103.05 + (((tickAnim - 28) / 1) * (-81.74-(-103.05)));
            yy = 0 + (((tickAnim - 28) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 28) / 1) * (0-(0)));
        }
        else if (tickAnim >= 29 && tickAnim < 31) {
            xx = -81.74 + (((tickAnim - 29) / 2) * (-35.92-(-81.74)));
            yy = 0 + (((tickAnim - 29) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 29) / 2) * (0-(0)));
        }
        else if (tickAnim >= 31 && tickAnim < 34) {
            xx = -35.92 + (((tickAnim - 31) / 3) * (56.08-(-35.92)));
            yy = 0 + (((tickAnim - 31) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 31) / 3) * (0-(0)));
        }
        else if (tickAnim >= 34 && tickAnim < 38) {
            xx = 56.08 + (((tickAnim - 34) / 4) * (54.33-(56.08)));
            yy = 0 + (((tickAnim - 34) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 34) / 4) * (0-(0)));
        }
        else if (tickAnim >= 38 && tickAnim < 50) {
            xx = 54.33 + (((tickAnim - 38) / 12) * (12.75-(54.33)));
            yy = 0 + (((tickAnim - 38) / 12) * (0-(0)));
            zz = 0 + (((tickAnim - 38) / 12) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(righttoes, righttoes.rotateAngleX + (float) Math.toRadians(xx), righttoes.rotateAngleY + (float) Math.toRadians(yy), righttoes.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 22 && tickAnim < 25) {
            xx = 0 + (((tickAnim - 22) / 3) * (0-(0)));
            yy = 0 + (((tickAnim - 22) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 22) / 3) * (0.4-(0)));
        }
        else if (tickAnim >= 25 && tickAnim < 28) {
            xx = 0 + (((tickAnim - 25) / 3) * (0-(0)));
            yy = 0 + (((tickAnim - 25) / 3) * (0-(0)));
            zz = 0.4 + (((tickAnim - 25) / 3) * (0-(0.4)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.righttoes.rotationPointX = this.righttoes.rotationPointX + (float)(xx);
        this.righttoes.rotationPointY = this.righttoes.rotationPointY - (float)(yy);
        this.righttoes.rotationPointZ = this.righttoes.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 0) / 50) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 50) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 50) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftthigh, leftthigh.rotateAngleX + (float) Math.toRadians(xx), leftthigh.rotateAngleY + (float) Math.toRadians(yy), leftthigh.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 0) / 50) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 50) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 50) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftshin, leftshin.rotateAngleX + (float) Math.toRadians(xx), leftshin.rotateAngleY + (float) Math.toRadians(yy), leftshin.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 0) / 50) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 50) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 50) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftankle, leftankle.rotateAngleX + (float) Math.toRadians(xx), leftankle.rotateAngleY + (float) Math.toRadians(yy), leftankle.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 0) / 50) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 50) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 50) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftfoot, leftfoot.rotateAngleX + (float) Math.toRadians(xx), leftfoot.rotateAngleY + (float) Math.toRadians(yy), leftfoot.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 0) / 50) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 50) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 50) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(lefttoes, lefttoes.rotateAngleX + (float) Math.toRadians(xx), lefttoes.rotateAngleY + (float) Math.toRadians(yy), lefttoes.rotateAngleZ + (float) Math.toRadians(zz));


    }
    public void animEat(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime, double animTick) {
        EntityPrehistoricFloraAnchisaurus entity = (EntityPrehistoricFloraAnchisaurus) entitylivingbaseIn;

        int animCycle = 50;
        double tickAnim = animTick + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;
         if (tickAnim >= 0 && tickAnim < 9) {
            xx = 0 + (((tickAnim - 0) / 9) * (5-(0)));
            yy = 0 + (((tickAnim - 0) / 9) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 9) * (0-(0)));
        }
        else if (tickAnim >= 9 && tickAnim < 40) {
            xx = 5 + (((tickAnim - 9) / 31) * (5-(5)));
            yy = 0 + (((tickAnim - 9) / 31) * (0-(0)));
            zz = 0 + (((tickAnim - 9) / 31) * (0-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 49) {
            xx = 5 + (((tickAnim - 40) / 9) * (0-(5)));
            yy = 0 + (((tickAnim - 40) / 9) * (0-(0)));
            zz = 0 + (((tickAnim - 40) / 9) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(hips, hips.rotateAngleX + (float) Math.toRadians(xx), hips.rotateAngleY + (float) Math.toRadians(yy), hips.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 0) / 8) * (7.22-(0)));
            yy = 0 + (((tickAnim - 0) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 8) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 14) {
            xx = 7.22 + (((tickAnim - 8) / 6) * (5-(7.22)));
            yy = 0 + (((tickAnim - 8) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 6) * (0-(0)));
        }
        else if (tickAnim >= 14 && tickAnim < 26) {
            xx = 5 + (((tickAnim - 14) / 12) * (-2.5-(5)));
            yy = 0 + (((tickAnim - 14) / 12) * (0-(0)));
            zz = 0 + (((tickAnim - 14) / 12) * (0-(0)));
        }
        else if (tickAnim >= 26 && tickAnim < 36) {
            xx = -2.5 + (((tickAnim - 26) / 10) * (0-(-2.5)));
            yy = 0 + (((tickAnim - 26) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 26) / 10) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tailbase, tailbase.rotateAngleX + (float) Math.toRadians(xx), tailbase.rotateAngleY + (float) Math.toRadians(yy), tailbase.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 0) / 10) * (-10-(0)));
            yy = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 21) {
            xx = -10 + (((tickAnim - 10) / 11) * (-10-(-10)));
            yy = 0 + (((tickAnim - 10) / 11) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 11) * (0-(0)));
        }
        else if (tickAnim >= 21 && tickAnim < 27) {
            xx = -10 + (((tickAnim - 21) / 6) * (-2.5-(-10)));
            yy = 0 + (((tickAnim - 21) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 21) / 6) * (0-(0)));
        }
        else if (tickAnim >= 27 && tickAnim < 50) {
            xx = -2.5 + (((tickAnim - 27) / 23) * (0-(-2.5)));
            yy = 0 + (((tickAnim - 27) / 23) * (0-(0)));
            zz = 0 + (((tickAnim - 27) / 23) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tailmiddlebase, tailmiddlebase.rotateAngleX + (float) Math.toRadians(xx), tailmiddlebase.rotateAngleY + (float) Math.toRadians(yy), tailmiddlebase.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 9) {
            xx = 0 + (((tickAnim - 0) / 9) * (2.5-(0)));
            yy = 0 + (((tickAnim - 0) / 9) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 9) * (0-(0)));
        }
        else if (tickAnim >= 9 && tickAnim < 19) {
            xx = 2.5 + (((tickAnim - 9) / 10) * (5-(2.5)));
            yy = 0 + (((tickAnim - 9) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 9) / 10) * (0-(0)));
        }
        else if (tickAnim >= 19 && tickAnim < 28) {
            xx = 5 + (((tickAnim - 19) / 9) * (0-(5)));
            yy = 0 + (((tickAnim - 19) / 9) * (0-(0)));
            zz = 0 + (((tickAnim - 19) / 9) * (0-(0)));
        }
        else if (tickAnim >= 28 && tickAnim < 36) {
            xx = 0 + (((tickAnim - 28) / 8) * (0-(0)));
            yy = 0 + (((tickAnim - 28) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 28) / 8) * (0-(0)));
        }
        else if (tickAnim >= 36 && tickAnim < 39) {
            xx = 0 + (((tickAnim - 36) / 3) * (2.5-(0)));
            yy = 0 + (((tickAnim - 36) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 36) / 3) * (0-(0)));
        }
        else if (tickAnim >= 39 && tickAnim < 50) {
            xx = 2.5 + (((tickAnim - 39) / 11) * (0-(2.5)));
            yy = 0 + (((tickAnim - 39) / 11) * (0-(0)));
            zz = 0 + (((tickAnim - 39) / 11) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tailmiddle, tailmiddle.rotateAngleX + (float) Math.toRadians(xx), tailmiddle.rotateAngleY + (float) Math.toRadians(yy), tailmiddle.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 14) {
            xx = 0 + (((tickAnim - 0) / 14) * (7.5-(0)));
            yy = 0 + (((tickAnim - 0) / 14) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 14) * (0-(0)));
        }
        else if (tickAnim >= 14 && tickAnim < 27) {
            xx = 7.5 + (((tickAnim - 14) / 13) * (10-(7.5)));
            yy = 0 + (((tickAnim - 14) / 13) * (0-(0)));
            zz = 0 + (((tickAnim - 14) / 13) * (0-(0)));
        }
        else if (tickAnim >= 27 && tickAnim < 31) {
            xx = 10 + (((tickAnim - 27) / 4) * (10-(10)));
            yy = 0 + (((tickAnim - 27) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 27) / 4) * (0-(0)));
        }
        else if (tickAnim >= 31 && tickAnim < 36) {
            xx = 10 + (((tickAnim - 31) / 5) * (0-(10)));
            yy = 0 + (((tickAnim - 31) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 31) / 5) * (0-(0)));
        }
        else if (tickAnim >= 36 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 36) / 14) * (0-(0)));
            yy = 0 + (((tickAnim - 36) / 14) * (0-(0)));
            zz = 0 + (((tickAnim - 36) / 14) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tailmiddleend, tailmiddleend.rotateAngleX + (float) Math.toRadians(xx), tailmiddleend.rotateAngleY + (float) Math.toRadians(yy), tailmiddleend.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 9) {
            xx = 0 + (((tickAnim - 0) / 9) * (10-(0)));
            yy = 0 + (((tickAnim - 0) / 9) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 9) * (0-(0)));
        }
        else if (tickAnim >= 9 && tickAnim < 49) {
            xx = 10 + (((tickAnim - 9) / 40) * (0-(10)));
            yy = 0 + (((tickAnim - 9) / 40) * (0-(0)));
            zz = 0 + (((tickAnim - 9) / 40) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(bodyfront, bodyfront.rotateAngleX + (float) Math.toRadians(xx), bodyfront.rotateAngleY + (float) Math.toRadians(yy), bodyfront.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 9) {
            xx = 0 + (((tickAnim - 0) / 9) * (10-(0)));
            yy = 0 + (((tickAnim - 0) / 9) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 9) * (0-(0)));
        }
        else if (tickAnim >= 9 && tickAnim < 11) {
            xx = 10 + (((tickAnim - 9) / 2) * (21.23-(10)));
            yy = 0 + (((tickAnim - 9) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 9) / 2) * (0-(0)));
        }
        else if (tickAnim >= 11 && tickAnim < 21) {
            xx = 21.23 + (((tickAnim - 11) / 10) * (20-(21.23)));
            yy = 0 + (((tickAnim - 11) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 11) / 10) * (0-(0)));
        }
        else if (tickAnim >= 21 && tickAnim < 36) {
            xx = 20 + (((tickAnim - 21) / 15) * (27.5-(20)));
            yy = 0 + (((tickAnim - 21) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 21) / 15) * (0-(0)));
        }
        else if (tickAnim >= 36 && tickAnim < 48) {
            xx = 27.5 + (((tickAnim - 36) / 12) * (0-(27.5)));
            yy = 0 + (((tickAnim - 36) / 12) * (0-(0)));
            zz = 0 + (((tickAnim - 36) / 12) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neckbase, neckbase.rotateAngleX + (float) Math.toRadians(xx), neckbase.rotateAngleY + (float) Math.toRadians(yy), neckbase.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 9) {
            xx = 0 + (((tickAnim - 0) / 9) * (25-(0)));
            yy = 0 + (((tickAnim - 0) / 9) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 9) * (0-(0)));
        }
        else if (tickAnim >= 9 && tickAnim < 12) {
            xx = 25 + (((tickAnim - 9) / 3) * (17.5-(25)));
            yy = 0 + (((tickAnim - 9) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 9) / 3) * (0-(0)));
        }
        else if (tickAnim >= 12 && tickAnim < 18) {
            xx = 17.5 + (((tickAnim - 12) / 6) * (0-(17.5)));
            yy = 0 + (((tickAnim - 12) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 12) / 6) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 27) {
            xx = 0 + (((tickAnim - 18) / 9) * (-4.62-(0)));
            yy = 0 + (((tickAnim - 18) / 9) * (0-(0)));
            zz = 0 + (((tickAnim - 18) / 9) * (0-(0)));
        }
        else if (tickAnim >= 27 && tickAnim < 40) {
            xx = -4.62 + (((tickAnim - 27) / 13) * (-4.62-(-4.62)));
            yy = 0 + (((tickAnim - 27) / 13) * (0-(0)));
            zz = 0 + (((tickAnim - 27) / 13) * (0-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 49) {
            xx = -4.62 + (((tickAnim - 40) / 9) * (0-(-4.62)));
            yy = 0 + (((tickAnim - 40) / 9) * (0-(0)));
            zz = 0 + (((tickAnim - 40) / 9) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neckmiddlebase, neckmiddlebase.rotateAngleX + (float) Math.toRadians(xx), neckmiddlebase.rotateAngleY + (float) Math.toRadians(yy), neckmiddlebase.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 9) {
            xx = 0 + (((tickAnim - 0) / 9) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 9) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 9) * (0-(0)));
        }
        else if (tickAnim >= 9 && tickAnim < 14) {
            xx = 0 + (((tickAnim - 9) / 5) * (18.04-(0)));
            yy = 0 + (((tickAnim - 9) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 9) / 5) * (0-(0)));
        }
        else if (tickAnim >= 14 && tickAnim < 16) {
            xx = 18.04 + (((tickAnim - 14) / 2) * (7.43-(18.04)));
            yy = 0 + (((tickAnim - 14) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 14) / 2) * (0-(0)));
        }
        else if (tickAnim >= 16 && tickAnim < 25) {
            xx = 7.43 + (((tickAnim - 16) / 9) * (2.5-(7.43)));
            yy = 0 + (((tickAnim - 16) / 9) * (0-(0)));
            zz = 0 + (((tickAnim - 16) / 9) * (0-(0)));
        }
        else if (tickAnim >= 25 && tickAnim < 40) {
            xx = 2.5 + (((tickAnim - 25) / 15) * (15-(2.5)));
            yy = 0 + (((tickAnim - 25) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 25) / 15) * (0-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 49) {
            xx = 15 + (((tickAnim - 40) / 9) * (0-(15)));
            yy = 0 + (((tickAnim - 40) / 9) * (0-(0)));
            zz = 0 + (((tickAnim - 40) / 9) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neckmiddlefront, neckmiddlefront.rotateAngleX + (float) Math.toRadians(xx), neckmiddlefront.rotateAngleY + (float) Math.toRadians(yy), neckmiddlefront.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 9) {
            xx = 0 + (((tickAnim - 0) / 9) * (-15-(0)));
            yy = 0 + (((tickAnim - 0) / 9) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 9) * (0-(0)));
        }
        else if (tickAnim >= 9 && tickAnim < 50) {
            xx = -15 + (((tickAnim - 9) / 41) * (0-(-15)));
            yy = 0 + (((tickAnim - 9) / 41) * (0-(0)));
            zz = 0 + (((tickAnim - 9) / 41) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neckfront, neckfront.rotateAngleX + (float) Math.toRadians(xx), neckfront.rotateAngleY + (float) Math.toRadians(yy), neckfront.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 9) {
            xx = 0 + (((tickAnim - 0) / 9) * (-20.83-(0)));
            yy = 0 + (((tickAnim - 0) / 9) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 9) * (0-(0)));
        }
        else if (tickAnim >= 9 && tickAnim < 10) {
            xx = -20.83 + (((tickAnim - 9) / 1) * (-21.66-(-20.83)));
            yy = 0 + (((tickAnim - 9) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 9) / 1) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 11) {
            xx = -21.66 + (((tickAnim - 10) / 1) * (-18.33-(-21.66)));
            yy = 0 + (((tickAnim - 10) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 1) * (0-(0)));
        }
        else if (tickAnim >= 11 && tickAnim < 14) {
            xx = -18.33 + (((tickAnim - 11) / 3) * (-10-(-18.33)));
            yy = 0 + (((tickAnim - 11) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 11) / 3) * (0-(0)));
        }
        else if (tickAnim >= 14 && tickAnim < 20) {
            xx = -10 + (((tickAnim - 14) / 6) * (-19.16-(-10)));
            yy = 0 + (((tickAnim - 14) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 14) / 6) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 25) {
            xx = -19.16 + (((tickAnim - 20) / 5) * (-14.64889-(-19.16)));
            yy = 0 + (((tickAnim - 20) / 5) * (-24.49736-(0)));
            zz = 0 + (((tickAnim - 20) / 5) * (0.99294-(0)));
        }
        else if (tickAnim >= 25 && tickAnim < 30) {
            xx = -14.64889 + (((tickAnim - 25) / 5) * (-19.44556-(-14.64889)));
            yy = -24.49736 + (((tickAnim - 25) / 5) * (31.92794-(-24.49736)));
            zz = 0.99294 + (((tickAnim - 25) / 5) * (-4.35493-(0.99294)));
        }
        else if (tickAnim >= 30 && tickAnim < 49) {
            xx = -19.44556 + (((tickAnim - 30) / 19) * (0-(-19.44556)));
            yy = 31.92794 + (((tickAnim - 30) / 19) * (0-(31.92794)));
            zz = -4.35493 + (((tickAnim - 30) / 19) * (0-(-4.35493)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(head, head.rotateAngleX + (float) Math.toRadians(xx), head.rotateAngleY + (float) Math.toRadians(yy), head.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 9) {
            xx = 0 + (((tickAnim - 0) / 9) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 9) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 9) * (0-(0)));
        }
        else if (tickAnim >= 9 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 9) / 1) * (20-(0)));
            yy = 0 + (((tickAnim - 9) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 9) / 1) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 11) {
            xx = 20 + (((tickAnim - 10) / 1) * (0-(20)));
            yy = 0 + (((tickAnim - 10) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 1) * (0-(0)));
        }
        else if (tickAnim >= 11 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 11) / 2) * (20-(0)));
            yy = 0 + (((tickAnim - 11) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 11) / 2) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 14) {
            xx = 20 + (((tickAnim - 13) / 1) * (0-(20)));
            yy = 0 + (((tickAnim - 13) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 13) / 1) * (0-(0)));
        }
        else if (tickAnim >= 14 && tickAnim < 35) {
            xx = 0 + (((tickAnim - 14) / 21) * (0-(0)));
            yy = 0 + (((tickAnim - 14) / 21) * (0-(0)));
            zz = 0 + (((tickAnim - 14) / 21) * (0-(0)));
        }
        else if (tickAnim >= 35 && tickAnim < 37) {
            xx = 0 + (((tickAnim - 35) / 2) * (20-(0)));
            yy = 0 + (((tickAnim - 35) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 35) / 2) * (0-(0)));
        }
        else if (tickAnim >= 37 && tickAnim < 38) {
            xx = 20 + (((tickAnim - 37) / 1) * (0-(20)));
            yy = 0 + (((tickAnim - 37) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 37) / 1) * (0-(0)));
        }
        else if (tickAnim >= 38 && tickAnim < 49) {
            xx = 0 + (((tickAnim - 38) / 11) * (0-(0)));
            yy = 0 + (((tickAnim - 38) / 11) * (0-(0)));
            zz = 0 + (((tickAnim - 38) / 11) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(lowerjawbase, lowerjawbase.rotateAngleX + (float) Math.toRadians(xx), lowerjawbase.rotateAngleY + (float) Math.toRadians(yy), lowerjawbase.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 9) {
            xx = 0 + (((tickAnim - 0) / 9) * (-30-(0)));
            yy = 0 + (((tickAnim - 0) / 9) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 9) * (0-(0)));
        }
        else if (tickAnim >= 9 && tickAnim < 42) {
            xx = -30 + (((tickAnim - 9) / 33) * (-30-(-30)));
            yy = 0 + (((tickAnim - 9) / 33) * (0-(0)));
            zz = 0 + (((tickAnim - 9) / 33) * (0-(0)));
        }
        else if (tickAnim >= 42 && tickAnim < 49) {
            xx = -30 + (((tickAnim - 42) / 7) * (0-(-30)));
            yy = 0 + (((tickAnim - 42) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 42) / 7) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightupperarm, rightupperarm.rotateAngleX + (float) Math.toRadians(xx), rightupperarm.rotateAngleY + (float) Math.toRadians(yy), rightupperarm.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 9) {
            xx = 0 + (((tickAnim - 0) / 9) * (17.5-(0)));
            yy = 0 + (((tickAnim - 0) / 9) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 9) * (0-(0)));
        }
        else if (tickAnim >= 9 && tickAnim < 42) {
            xx = 17.5 + (((tickAnim - 9) / 33) * (17.5-(17.5)));
            yy = 0 + (((tickAnim - 9) / 33) * (0-(0)));
            zz = 0 + (((tickAnim - 9) / 33) * (0-(0)));
        }
        else if (tickAnim >= 42 && tickAnim < 49) {
            xx = 17.5 + (((tickAnim - 42) / 7) * (0-(17.5)));
            yy = 0 + (((tickAnim - 42) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 42) / 7) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(righthand, righthand.rotateAngleX + (float) Math.toRadians(xx), righthand.rotateAngleY + (float) Math.toRadians(yy), righthand.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 9) {
            xx = 0 + (((tickAnim - 0) / 9) * (-30-(0)));
            yy = 0 + (((tickAnim - 0) / 9) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 9) * (0-(0)));
        }
        else if (tickAnim >= 9 && tickAnim < 42) {
            xx = -30 + (((tickAnim - 9) / 33) * (-30-(-30)));
            yy = 0 + (((tickAnim - 9) / 33) * (0-(0)));
            zz = 0 + (((tickAnim - 9) / 33) * (0-(0)));
        }
        else if (tickAnim >= 42 && tickAnim < 49) {
            xx = -30 + (((tickAnim - 42) / 7) * (0-(-30)));
            yy = 0 + (((tickAnim - 42) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 42) / 7) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftupperarm, leftupperarm.rotateAngleX + (float) Math.toRadians(xx), leftupperarm.rotateAngleY + (float) Math.toRadians(yy), leftupperarm.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 9) {
            xx = 0 + (((tickAnim - 0) / 9) * (17.5-(0)));
            yy = 0 + (((tickAnim - 0) / 9) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 9) * (0-(0)));
        }
        else if (tickAnim >= 9 && tickAnim < 42) {
            xx = 17.5 + (((tickAnim - 9) / 33) * (17.5-(17.5)));
            yy = 0 + (((tickAnim - 9) / 33) * (0-(0)));
            zz = 0 + (((tickAnim - 9) / 33) * (0-(0)));
        }
        else if (tickAnim >= 42 && tickAnim < 49) {
            xx = 17.5 + (((tickAnim - 42) / 7) * (0-(17.5)));
            yy = 0 + (((tickAnim - 42) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 42) / 7) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftlowerarm, leftlowerarm.rotateAngleX + (float) Math.toRadians(xx), leftlowerarm.rotateAngleY + (float) Math.toRadians(yy), leftlowerarm.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 0) / 5) * (-24.5-(0)));
            yy = 0 + (((tickAnim - 0) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 5) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 12) {
            xx = -24.5 + (((tickAnim - 5) / 7) * (-12.5-(-24.5)));
            yy = 0 + (((tickAnim - 5) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 5) / 7) * (0-(0)));
        }
        else if (tickAnim >= 12 && tickAnim < 35) {
            xx = -12.5 + (((tickAnim - 12) / 23) * (-12.5-(-12.5)));
            yy = 0 + (((tickAnim - 12) / 23) * (0-(0)));
            zz = 0 + (((tickAnim - 12) / 23) * (0-(0)));
        }
        else if (tickAnim >= 35 && tickAnim < 43) {
            xx = -12.5 + (((tickAnim - 35) / 8) * (-16.75-(-12.5)));
            yy = 0 + (((tickAnim - 35) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 35) / 8) * (0-(0)));
        }
        else if (tickAnim >= 43 && tickAnim < 49) {
            xx = -16.75 + (((tickAnim - 43) / 6) * (0-(-16.75)));
            yy = 0 + (((tickAnim - 43) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 43) / 6) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightthigh, rightthigh.rotateAngleX + (float) Math.toRadians(xx), rightthigh.rotateAngleY + (float) Math.toRadians(yy), rightthigh.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 12) {
            xx = 0 + (((tickAnim - 0) / 12) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 12) * (-0.45-(0)));
            zz = 0 + (((tickAnim - 0) / 12) * (0-(0)));
        }
        else if (tickAnim >= 12 && tickAnim < 35) {
            xx = 0 + (((tickAnim - 12) / 23) * (0-(0)));
            yy = -0.45 + (((tickAnim - 12) / 23) * (-0.45-(-0.45)));
            zz = 0 + (((tickAnim - 12) / 23) * (0-(0)));
        }
        else if (tickAnim >= 35 && tickAnim < 49) {
            xx = 0 + (((tickAnim - 35) / 14) * (0-(0)));
            yy = -0.45 + (((tickAnim - 35) / 14) * (0-(-0.45)));
            zz = 0 + (((tickAnim - 35) / 14) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.rightthigh.rotationPointX = this.rightthigh.rotationPointX + (float)(xx);
        this.rightthigh.rotationPointY = this.rightthigh.rotationPointY - (float)(yy);
        this.rightthigh.rotationPointZ = this.rightthigh.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 0) / 5) * (32.5-(0)));
            yy = 0 + (((tickAnim - 0) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 5) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 12) {
            xx = 32.5 + (((tickAnim - 5) / 7) * (-15-(32.5)));
            yy = 0 + (((tickAnim - 5) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 5) / 7) * (0-(0)));
        }
        else if (tickAnim >= 12 && tickAnim < 34) {
            xx = -15 + (((tickAnim - 12) / 22) * (-15-(-15)));
            yy = 0 + (((tickAnim - 12) / 22) * (0-(0)));
            zz = 0 + (((tickAnim - 12) / 22) * (0-(0)));
        }
        else if (tickAnim >= 34 && tickAnim < 42) {
            xx = -15 + (((tickAnim - 34) / 8) * (35.5-(-15)));
            yy = 0 + (((tickAnim - 34) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 34) / 8) * (0-(0)));
        }
        else if (tickAnim >= 42 && tickAnim < 48) {
            xx = 35.5 + (((tickAnim - 42) / 6) * (0-(35.5)));
            yy = 0 + (((tickAnim - 42) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 42) / 6) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightshin, rightshin.rotateAngleX + (float) Math.toRadians(xx), rightshin.rotateAngleY + (float) Math.toRadians(yy), rightshin.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 0) / 5) * (-22.25-(0)));
            yy = 0 + (((tickAnim - 0) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 5) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 12) {
            xx = -22.25 + (((tickAnim - 5) / 7) * (0-(-22.25)));
            yy = 0 + (((tickAnim - 5) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 5) / 7) * (0-(0)));
        }
        else if (tickAnim >= 12 && tickAnim < 34) {
            xx = 0 + (((tickAnim - 12) / 22) * (0-(0)));
            yy = 0 + (((tickAnim - 12) / 22) * (0-(0)));
            zz = 0 + (((tickAnim - 12) / 22) * (0-(0)));
        }
        else if (tickAnim >= 34 && tickAnim < 42) {
            xx = 0 + (((tickAnim - 34) / 8) * (-19-(0)));
            yy = 0 + (((tickAnim - 34) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 34) / 8) * (0-(0)));
        }
        else if (tickAnim >= 42 && tickAnim < 48) {
            xx = -19 + (((tickAnim - 42) / 6) * (0-(-19)));
            yy = 0 + (((tickAnim - 42) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 42) / 6) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightankle, rightankle.rotateAngleX + (float) Math.toRadians(xx), rightankle.rotateAngleY + (float) Math.toRadians(yy), rightankle.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 0) / 5) * (43.71-(0)));
            yy = 0 + (((tickAnim - 0) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 5) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 12) {
            xx = 43.71 + (((tickAnim - 5) / 7) * (25-(43.71)));
            yy = 0 + (((tickAnim - 5) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 5) / 7) * (0-(0)));
        }
        else if (tickAnim >= 12 && tickAnim < 34) {
            xx = 25 + (((tickAnim - 12) / 22) * (25-(25)));
            yy = 0 + (((tickAnim - 12) / 22) * (0-(0)));
            zz = 0 + (((tickAnim - 12) / 22) * (0-(0)));
        }
        else if (tickAnim >= 34 && tickAnim < 42) {
            xx = 25 + (((tickAnim - 34) / 8) * (37.01-(25)));
            yy = 0 + (((tickAnim - 34) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 34) / 8) * (0-(0)));
        }
        else if (tickAnim >= 42 && tickAnim < 48) {
            xx = 37.01 + (((tickAnim - 42) / 6) * (0-(37.01)));
            yy = 0 + (((tickAnim - 42) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 42) / 6) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightfoot, rightfoot.rotateAngleX + (float) Math.toRadians(xx), rightfoot.rotateAngleY + (float) Math.toRadians(yy), rightfoot.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 0) / 5) * (32.5-(0)));
            yy = 0 + (((tickAnim - 0) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 5) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 12) {
            xx = 32.5 + (((tickAnim - 5) / 7) * (0-(32.5)));
            yy = 0 + (((tickAnim - 5) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 5) / 7) * (0-(0)));
        }
        else if (tickAnim >= 12 && tickAnim < 34) {
            xx = 0 + (((tickAnim - 12) / 22) * (0-(0)));
            yy = 0 + (((tickAnim - 12) / 22) * (0-(0)));
            zz = 0 + (((tickAnim - 12) / 22) * (0-(0)));
        }
        else if (tickAnim >= 34 && tickAnim < 42) {
            xx = 0 + (((tickAnim - 34) / 8) * (16.75-(0)));
            yy = 0 + (((tickAnim - 34) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 34) / 8) * (0-(0)));
        }
        else if (tickAnim >= 42 && tickAnim < 48) {
            xx = 16.75 + (((tickAnim - 42) / 6) * (0-(16.75)));
            yy = 0 + (((tickAnim - 42) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 42) / 6) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(righttoes, righttoes.rotateAngleX + (float) Math.toRadians(xx), righttoes.rotateAngleY + (float) Math.toRadians(yy), righttoes.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 12) {
            xx = 0 + (((tickAnim - 0) / 12) * (7.5-(0)));
            yy = 0 + (((tickAnim - 0) / 12) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 12) * (0-(0)));
        }
        else if (tickAnim >= 12 && tickAnim < 35) {
            xx = 7.5 + (((tickAnim - 12) / 23) * (7.5-(7.5)));
            yy = 0 + (((tickAnim - 12) / 23) * (0-(0)));
            zz = 0 + (((tickAnim - 12) / 23) * (0-(0)));
        }
        else if (tickAnim >= 35 && tickAnim < 50) {
            xx = 7.5 + (((tickAnim - 35) / 15) * (0-(7.5)));
            yy = 0 + (((tickAnim - 35) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 35) / 15) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftthigh, leftthigh.rotateAngleX + (float) Math.toRadians(xx), leftthigh.rotateAngleY + (float) Math.toRadians(yy), leftthigh.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 12) {
            xx = 0 + (((tickAnim - 0) / 12) * (-5-(0)));
            yy = 0 + (((tickAnim - 0) / 12) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 12) * (0-(0)));
        }
        else if (tickAnim >= 12 && tickAnim < 35) {
            xx = -5 + (((tickAnim - 12) / 23) * (-5-(-5)));
            yy = 0 + (((tickAnim - 12) / 23) * (0-(0)));
            zz = 0 + (((tickAnim - 12) / 23) * (0-(0)));
        }
        else if (tickAnim >= 35 && tickAnim < 50) {
            xx = -5 + (((tickAnim - 35) / 15) * (0-(-5)));
            yy = 0 + (((tickAnim - 35) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 35) / 15) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftshin, leftshin.rotateAngleX + (float) Math.toRadians(xx), leftshin.rotateAngleY + (float) Math.toRadians(yy), leftshin.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 12) {
            xx = 0 + (((tickAnim - 0) / 12) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 12) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 12) * (0-(0)));
        }
        else if (tickAnim >= 12 && tickAnim < 35) {
            xx = 0 + (((tickAnim - 12) / 23) * (0-(0)));
            yy = 0 + (((tickAnim - 12) / 23) * (0-(0)));
            zz = 0 + (((tickAnim - 12) / 23) * (0-(0)));
        }
        else if (tickAnim >= 35 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 35) / 15) * (0-(0)));
            yy = 0 + (((tickAnim - 35) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 35) / 15) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftankle, leftankle.rotateAngleX + (float) Math.toRadians(xx), leftankle.rotateAngleY + (float) Math.toRadians(yy), leftankle.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 12) {
            xx = 0 + (((tickAnim - 0) / 12) * (-5-(0)));
            yy = 0 + (((tickAnim - 0) / 12) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 12) * (0-(0)));
        }
        else if (tickAnim >= 12 && tickAnim < 35) {
            xx = -5 + (((tickAnim - 12) / 23) * (-5-(-5)));
            yy = 0 + (((tickAnim - 12) / 23) * (0-(0)));
            zz = 0 + (((tickAnim - 12) / 23) * (0-(0)));
        }
        else if (tickAnim >= 35 && tickAnim < 50) {
            xx = -5 + (((tickAnim - 35) / 15) * (0-(-5)));
            yy = 0 + (((tickAnim - 35) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 35) / 15) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftfoot, leftfoot.rotateAngleX + (float) Math.toRadians(xx), leftfoot.rotateAngleY + (float) Math.toRadians(yy), leftfoot.rotateAngleZ + (float) Math.toRadians(zz));


    }
    public void animAttack(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime, double animTick) {
        EntityPrehistoricFloraAnchisaurus entity = (EntityPrehistoricFloraAnchisaurus) entitylivingbaseIn;


    }


    public void animWalking(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime) {
    EntityPrehistoricFloraAnchisaurus entity = (EntityPrehistoricFloraAnchisaurus) entitylivingbaseIn;

        int animCycle = 30;
        double tickAnim = (entity.ticksExisted + entity.getTickOffset()) - (int) (Math.floor((double) (entity.ticksExisted + entity.getTickOffset()) / (double) animCycle) * (double) animCycle) + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;

        if (tickAnim >= 0 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 0) / 8) * (1-(0)));
            yy = 5 + (((tickAnim - 0) / 8) * (-1.66667-(5)));
            zz = 0.00001 + (((tickAnim - 0) / 8) * (2.50001-(0.00001)));
        }
        else if (tickAnim >= 8 && tickAnim < 15) {
            xx = 1 + (((tickAnim - 8) / 7) * (0-(1)));
            yy = -1.66667 + (((tickAnim - 8) / 7) * (-5-(-1.66667)));
            zz = 2.50001 + (((tickAnim - 8) / 7) * (0.00002-(2.50001)));
        }
        else if (tickAnim >= 15 && tickAnim < 23) {
            xx = 0 + (((tickAnim - 15) / 8) * (1-(0)));
            yy = -5 + (((tickAnim - 15) / 8) * (1.66667-(-5)));
            zz = 0.00002 + (((tickAnim - 15) / 8) * (-2.49999-(0.00002)));
        }
        else if (tickAnim >= 23 && tickAnim < 30) {
            xx = 1 + (((tickAnim - 23) / 7) * (0-(1)));
            yy = 1.66667 + (((tickAnim - 23) / 7) * (5-(1.66667)));
            zz = -2.49999 + (((tickAnim - 23) / 7) * (0.00001-(-2.49999)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(hips, hips.rotateAngleX + (float) Math.toRadians(xx), hips.rotateAngleY + (float) Math.toRadians(yy), hips.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 0) / 8) * (0-(0)));
            yy = -1.25 + (((tickAnim - 0) / 8) * (0-(-1.25)));
            zz = 0 + (((tickAnim - 0) / 8) * (-1-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 12) {
            xx = 0 + (((tickAnim - 8) / 4) * (0-(0)));
            yy = 0 + (((tickAnim - 8) / 4) * (-1-(0)));
            zz = -1 + (((tickAnim - 8) / 4) * (0-(-1)));
        }
        else if (tickAnim >= 12 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 12) / 3) * (0-(0)));
            yy = -1 + (((tickAnim - 12) / 3) * (-1.25-(-1)));
            zz = 0 + (((tickAnim - 12) / 3) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 23) {
            xx = 0 + (((tickAnim - 15) / 8) * (0-(0)));
            yy = -1.25 + (((tickAnim - 15) / 8) * (0-(-1.25)));
            zz = 0 + (((tickAnim - 15) / 8) * (-1-(0)));
        }
        else if (tickAnim >= 23 && tickAnim < 27) {
            xx = 0 + (((tickAnim - 23) / 4) * (0-(0)));
            yy = 0 + (((tickAnim - 23) / 4) * (-1-(0)));
            zz = -1 + (((tickAnim - 23) / 4) * (0-(-1)));
        }
        else if (tickAnim >= 27 && tickAnim < 30) {
            xx = 0 + (((tickAnim - 27) / 3) * (0-(0)));
            yy = -1 + (((tickAnim - 27) / 3) * (-1.25-(-1)));
            zz = 0 + (((tickAnim - 27) / 3) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.hips.rotationPointX = this.hips.rotationPointX + (float)(xx);
        this.hips.rotationPointY = this.hips.rotationPointY - (float)(yy);
        this.hips.rotationPointZ = this.hips.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 1) {
            xx = -1.94 + (((tickAnim - 0) / 1) * (-2.5-(-1.94)));
            yy = 2.22 + (((tickAnim - 0) / 1) * (2.5-(2.22)));
            zz = 0 + (((tickAnim - 0) / 1) * (0-(0)));
        }
        else if (tickAnim >= 1 && tickAnim < 8) {
            xx = -2.5 + (((tickAnim - 1) / 7) * (2.5-(-2.5)));
            yy = 2.5 + (((tickAnim - 1) / 7) * (0-(2.5)));
            zz = 0 + (((tickAnim - 1) / 7) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 16) {
            xx = 2.5 + (((tickAnim - 8) / 8) * (-2.5-(2.5)));
            yy = 0 + (((tickAnim - 8) / 8) * (-2.5-(0)));
            zz = 0 + (((tickAnim - 8) / 8) * (0-(0)));
        }
        else if (tickAnim >= 16 && tickAnim < 23) {
            xx = -2.5 + (((tickAnim - 16) / 7) * (2.5-(-2.5)));
            yy = -2.5 + (((tickAnim - 16) / 7) * (0-(-2.5)));
            zz = 0 + (((tickAnim - 16) / 7) * (0-(0)));
        }
        else if (tickAnim >= 23 && tickAnim < 30) {
            xx = 2.5 + (((tickAnim - 23) / 7) * (-1.94-(2.5)));
            yy = 0 + (((tickAnim - 23) / 7) * (2.22-(0)));
            zz = 0 + (((tickAnim - 23) / 7) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tailbase, tailbase.rotateAngleX + (float) Math.toRadians(xx), tailbase.rotateAngleY + (float) Math.toRadians(yy), tailbase.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 3) {
            xx = -0.83 + (((tickAnim - 0) / 3) * (-2.5-(-0.83)));
            yy = 1.67 + (((tickAnim - 0) / 3) * (2.5-(1.67)));
            zz = 0 + (((tickAnim - 0) / 3) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 10) {
            xx = -2.5 + (((tickAnim - 3) / 7) * (2.5-(-2.5)));
            yy = 2.5 + (((tickAnim - 3) / 7) * (0-(2.5)));
            zz = 0 + (((tickAnim - 3) / 7) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 18) {
            xx = 2.5 + (((tickAnim - 10) / 8) * (-2.5-(2.5)));
            yy = 0 + (((tickAnim - 10) / 8) * (-2.5-(0)));
            zz = 0 + (((tickAnim - 10) / 8) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 25) {
            xx = -2.5 + (((tickAnim - 18) / 7) * (2.5-(-2.5)));
            yy = -2.5 + (((tickAnim - 18) / 7) * (0-(-2.5)));
            zz = 0 + (((tickAnim - 18) / 7) * (0-(0)));
        }
        else if (tickAnim >= 25 && tickAnim < 30) {
            xx = 2.5 + (((tickAnim - 25) / 5) * (-0.83-(2.5)));
            yy = 0 + (((tickAnim - 25) / 5) * (1.67-(0)));
            zz = 0 + (((tickAnim - 25) / 5) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tailmiddlebase, tailmiddlebase.rotateAngleX + (float) Math.toRadians(xx), tailmiddlebase.rotateAngleY + (float) Math.toRadians(yy), tailmiddlebase.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 4) {
            xx = 0.28 + (((tickAnim - 0) / 4) * (-2.5-(0.28)));
            yy = 1.11 + (((tickAnim - 0) / 4) * (2.5-(1.11)));
            zz = 0 + (((tickAnim - 0) / 4) * (0-(0)));
        }
        else if (tickAnim >= 4 && tickAnim < 12) {
            xx = -2.5 + (((tickAnim - 4) / 8) * (2.5-(-2.5)));
            yy = 2.5 + (((tickAnim - 4) / 8) * (0-(2.5)));
            zz = 0 + (((tickAnim - 4) / 8) * (0-(0)));
        }
        else if (tickAnim >= 12 && tickAnim < 19) {
            xx = 2.5 + (((tickAnim - 12) / 7) * (-2.5-(2.5)));
            yy = 0 + (((tickAnim - 12) / 7) * (-2.5-(0)));
            zz = 0 + (((tickAnim - 12) / 7) * (0-(0)));
        }
        else if (tickAnim >= 19 && tickAnim < 27) {
            xx = -2.5 + (((tickAnim - 19) / 8) * (2.5-(-2.5)));
            yy = -2.5 + (((tickAnim - 19) / 8) * (0-(-2.5)));
            zz = 0 + (((tickAnim - 19) / 8) * (0-(0)));
        }
        else if (tickAnim >= 27 && tickAnim < 30) {
            xx = 2.5 + (((tickAnim - 27) / 3) * (0.28-(2.5)));
            yy = 0 + (((tickAnim - 27) / 3) * (1.11-(0)));
            zz = 0 + (((tickAnim - 27) / 3) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tailmiddle, tailmiddle.rotateAngleX + (float) Math.toRadians(xx), tailmiddle.rotateAngleY + (float) Math.toRadians(yy), tailmiddle.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 6) {
            xx = 1.39 + (((tickAnim - 0) / 6) * (-2.5-(1.39)));
            yy = 0.56 + (((tickAnim - 0) / 6) * (2.5-(0.56)));
            zz = 0 + (((tickAnim - 0) / 6) * (0-(0)));
        }
        else if (tickAnim >= 6 && tickAnim < 13) {
            xx = -2.5 + (((tickAnim - 6) / 7) * (2.5-(-2.5)));
            yy = 2.5 + (((tickAnim - 6) / 7) * (0-(2.5)));
            zz = 0 + (((tickAnim - 6) / 7) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 21) {
            xx = 2.5 + (((tickAnim - 13) / 8) * (-2.5-(2.5)));
            yy = 0 + (((tickAnim - 13) / 8) * (-2.5-(0)));
            zz = 0 + (((tickAnim - 13) / 8) * (0-(0)));
        }
        else if (tickAnim >= 21 && tickAnim < 28) {
            xx = -2.5 + (((tickAnim - 21) / 7) * (2.5-(-2.5)));
            yy = -2.5 + (((tickAnim - 21) / 7) * (0-(-2.5)));
            zz = 0 + (((tickAnim - 21) / 7) * (0-(0)));
        }
        else if (tickAnim >= 28 && tickAnim < 30) {
            xx = 2.5 + (((tickAnim - 28) / 2) * (1.39-(2.5)));
            yy = 0 + (((tickAnim - 28) / 2) * (0.56-(0)));
            zz = 0 + (((tickAnim - 28) / 2) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tailmiddleend, tailmiddleend.rotateAngleX + (float) Math.toRadians(xx), tailmiddleend.rotateAngleY + (float) Math.toRadians(yy), tailmiddleend.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 8) {
            xx = 2.5 + (((tickAnim - 0) / 8) * (-2.5-(2.5)));
            yy = 0 + (((tickAnim - 0) / 8) * (2.5-(0)));
            zz = 0 + (((tickAnim - 0) / 8) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 15) {
            xx = -2.5 + (((tickAnim - 8) / 7) * (2.5-(-2.5)));
            yy = 2.5 + (((tickAnim - 8) / 7) * (0-(2.5)));
            zz = 0 + (((tickAnim - 8) / 7) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 23) {
            xx = 2.5 + (((tickAnim - 15) / 8) * (-2.5-(2.5)));
            yy = 0 + (((tickAnim - 15) / 8) * (-2.5-(0)));
            zz = 0 + (((tickAnim - 15) / 8) * (0-(0)));
        }
        else if (tickAnim >= 23 && tickAnim < 30) {
            xx = -2.5 + (((tickAnim - 23) / 7) * (2.5-(-2.5)));
            yy = -2.5 + (((tickAnim - 23) / 7) * (0-(-2.5)));
            zz = 0 + (((tickAnim - 23) / 7) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tailend, tailend.rotateAngleX + (float) Math.toRadians(xx), tailend.rotateAngleY + (float) Math.toRadians(yy), tailend.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 0) / 8) * (2.5-(0)));
            yy = -3 + (((tickAnim - 0) / 8) * (0-(-3)));
            zz = 0 + (((tickAnim - 0) / 8) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 15) {
            xx = 2.5 + (((tickAnim - 8) / 7) * (0-(2.5)));
            yy = 0 + (((tickAnim - 8) / 7) * (3-(0)));
            zz = 0 + (((tickAnim - 8) / 7) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 23) {
            xx = 0 + (((tickAnim - 15) / 8) * (2.5-(0)));
            yy = 3 + (((tickAnim - 15) / 8) * (0-(3)));
            zz = 0 + (((tickAnim - 15) / 8) * (0-(0)));
        }
        else if (tickAnim >= 23 && tickAnim < 30) {
            xx = 2.5 + (((tickAnim - 23) / 7) * (0-(2.5)));
            yy = 0 + (((tickAnim - 23) / 7) * (-3-(0)));
            zz = 0 + (((tickAnim - 23) / 7) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(bodymiddle, bodymiddle.rotateAngleX + (float) Math.toRadians(xx), bodymiddle.rotateAngleY + (float) Math.toRadians(yy), bodymiddle.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 7) {
            xx = 2.22 + (((tickAnim - 0) / 7) * (0-(2.22)));
            yy = -0.28 + (((tickAnim - 0) / 7) * (-2.5-(-0.28)));
            zz = 0 + (((tickAnim - 0) / 7) * (0-(0)));
        }
        else if (tickAnim >= 7 && tickAnim < 14) {
            xx = 0 + (((tickAnim - 7) / 7) * (2.5-(0)));
            yy = -2.5 + (((tickAnim - 7) / 7) * (0-(-2.5)));
            zz = 0 + (((tickAnim - 7) / 7) * (0-(0)));
        }
        else if (tickAnim >= 14 && tickAnim < 22) {
            xx = 2.5 + (((tickAnim - 14) / 8) * (0-(2.5)));
            yy = 0 + (((tickAnim - 14) / 8) * (2.5-(0)));
            zz = 0 + (((tickAnim - 14) / 8) * (0-(0)));
        }
        else if (tickAnim >= 22 && tickAnim < 29) {
            xx = 0 + (((tickAnim - 22) / 7) * (2.5-(0)));
            yy = 2.5 + (((tickAnim - 22) / 7) * (0-(2.5)));
            zz = 0 + (((tickAnim - 22) / 7) * (0-(0)));
        }
        else if (tickAnim >= 29 && tickAnim < 30) {
            xx = 2.5 + (((tickAnim - 29) / 1) * (2.22-(2.5)));
            yy = 0 + (((tickAnim - 29) / 1) * (-0.28-(0)));
            zz = 0 + (((tickAnim - 29) / 1) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(bodyfront, bodyfront.rotateAngleX + (float) Math.toRadians(xx), bodyfront.rotateAngleY + (float) Math.toRadians(yy), bodyfront.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 5) {
            xx = -1.67 + (((tickAnim - 0) / 5) * (0-(-1.67)));
            yy = -0.83 + (((tickAnim - 0) / 5) * (-2.5-(-0.83)));
            zz = 0 + (((tickAnim - 0) / 5) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 5) / 8) * (-2.5-(0)));
            yy = -2.5 + (((tickAnim - 5) / 8) * (0-(-2.5)));
            zz = 0 + (((tickAnim - 5) / 8) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 20) {
            xx = -2.5 + (((tickAnim - 13) / 7) * (0-(-2.5)));
            yy = 0 + (((tickAnim - 13) / 7) * (2.5-(0)));
            zz = 0 + (((tickAnim - 13) / 7) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 28) {
            xx = 0 + (((tickAnim - 20) / 8) * (-2.5-(0)));
            yy = 2.5 + (((tickAnim - 20) / 8) * (0-(2.5)));
            zz = 0 + (((tickAnim - 20) / 8) * (0-(0)));
        }
        else if (tickAnim >= 28 && tickAnim < 30) {
            xx = -2.5 + (((tickAnim - 28) / 2) * (-1.67-(-2.5)));
            yy = 0 + (((tickAnim - 28) / 2) * (-0.83-(0)));
            zz = 0 + (((tickAnim - 28) / 2) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neckbase, neckbase.rotateAngleX + (float) Math.toRadians(xx), neckbase.rotateAngleY + (float) Math.toRadians(yy), neckbase.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 3) {
            xx = -1.11 + (((tickAnim - 0) / 3) * (0-(-1.11)));
            yy = -1.39 + (((tickAnim - 0) / 3) * (-2.5-(-1.39)));
            zz = 0 + (((tickAnim - 0) / 3) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 11) {
            xx = 0 + (((tickAnim - 3) / 8) * (-2.5-(0)));
            yy = -2.5 + (((tickAnim - 3) / 8) * (0-(-2.5)));
            zz = 0 + (((tickAnim - 3) / 8) * (0-(0)));
        }
        else if (tickAnim >= 11 && tickAnim < 18) {
            xx = -2.5 + (((tickAnim - 11) / 7) * (0-(-2.5)));
            yy = 0 + (((tickAnim - 11) / 7) * (2.5-(0)));
            zz = 0 + (((tickAnim - 11) / 7) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 26) {
            xx = 0 + (((tickAnim - 18) / 8) * (-2.5-(0)));
            yy = 2.5 + (((tickAnim - 18) / 8) * (0-(2.5)));
            zz = 0 + (((tickAnim - 18) / 8) * (0-(0)));
        }
        else if (tickAnim >= 26 && tickAnim < 30) {
            xx = -2.5 + (((tickAnim - 26) / 4) * (-1.11-(-2.5)));
            yy = 0 + (((tickAnim - 26) / 4) * (-1.39-(0)));
            zz = 0 + (((tickAnim - 26) / 4) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neckmiddlebase, neckmiddlebase.rotateAngleX + (float) Math.toRadians(xx), neckmiddlebase.rotateAngleY + (float) Math.toRadians(yy), neckmiddlebase.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 2) {
            xx = -0.56 + (((tickAnim - 0) / 2) * (0-(-0.56)));
            yy = -1.94 + (((tickAnim - 0) / 2) * (-2.5-(-1.94)));
            zz = 0 + (((tickAnim - 0) / 2) * (0-(0)));
        }
        else if (tickAnim >= 2 && tickAnim < 9) {
            xx = 0 + (((tickAnim - 2) / 7) * (-2.5-(0)));
            yy = -2.5 + (((tickAnim - 2) / 7) * (0-(-2.5)));
            zz = 0 + (((tickAnim - 2) / 7) * (0-(0)));
        }
        else if (tickAnim >= 9 && tickAnim < 17) {
            xx = -2.5 + (((tickAnim - 9) / 8) * (0-(-2.5)));
            yy = 0 + (((tickAnim - 9) / 8) * (2.5-(0)));
            zz = 0 + (((tickAnim - 9) / 8) * (0-(0)));
        }
        else if (tickAnim >= 17 && tickAnim < 24) {
            xx = 0 + (((tickAnim - 17) / 7) * (-2.5-(0)));
            yy = 2.5 + (((tickAnim - 17) / 7) * (0-(2.5)));
            zz = 0 + (((tickAnim - 17) / 7) * (0-(0)));
        }
        else if (tickAnim >= 24 && tickAnim < 30) {
            xx = -2.5 + (((tickAnim - 24) / 6) * (-0.56-(-2.5)));
            yy = 0 + (((tickAnim - 24) / 6) * (-1.94-(0)));
            zz = 0 + (((tickAnim - 24) / 6) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neckmiddlefront, neckmiddlefront.rotateAngleX + (float) Math.toRadians(xx), neckmiddlefront.rotateAngleY + (float) Math.toRadians(yy), neckmiddlefront.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 0) / 8) * (4.74742-(0)));
            yy = 2.5 + (((tickAnim - 0) / 8) * (7.09348-(2.5)));
            zz = 0 + (((tickAnim - 0) / 8) * (-2.1657-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 15) {
            xx = 4.74742 + (((tickAnim - 8) / 7) * (0-(4.74742)));
            yy = 7.09348 + (((tickAnim - 8) / 7) * (-2.5-(7.09348)));
            zz = -2.1657 + (((tickAnim - 8) / 7) * (0-(-2.1657)));
        }
        else if (tickAnim >= 15 && tickAnim < 23) {
            xx = 0 + (((tickAnim - 15) / 8) * (4.81147-(0)));
            yy = -2.5 + (((tickAnim - 15) / 8) * (-7.07074-(-2.5)));
            zz = 0 + (((tickAnim - 15) / 8) * (1.66238-(0)));
        }
        else if (tickAnim >= 23 && tickAnim < 30) {
            xx = 4.81147 + (((tickAnim - 23) / 7) * (0-(4.81147)));
            yy = -7.07074 + (((tickAnim - 23) / 7) * (2.5-(-7.07074)));
            zz = 1.66238 + (((tickAnim - 23) / 7) * (0-(1.66238)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(head, head.rotateAngleX + (float) Math.toRadians(xx), head.rotateAngleY + (float) Math.toRadians(yy), head.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 1) {
            xx = 6.87 + (((tickAnim - 0) / 1) * (6.46079-(6.87)));
            yy = 15.79 + (((tickAnim - 0) / 1) * (15.77596-(15.79)));
            zz = -2.71 + (((tickAnim - 0) / 1) * (-2.69878-(-2.71)));
        }
        else if (tickAnim >= 1 && tickAnim < 6) {
            xx = 6.46079 + (((tickAnim - 1) / 5) * (11.41146-(6.46079)));
            yy = 15.77596 + (((tickAnim - 1) / 5) * (15.92724-(15.77596)));
            zz = -2.69878 + (((tickAnim - 1) / 5) * (-2.86199-(-2.69878)));
        }
        else if (tickAnim >= 6 && tickAnim < 16) {
            xx = 11.41146 + (((tickAnim - 6) / 10) * (6.46079-(11.41146)));
            yy = 15.92724 + (((tickAnim - 6) / 10) * (15.77596-(15.92724)));
            zz = -2.86199 + (((tickAnim - 6) / 10) * (-2.69878-(-2.86199)));
        }
        else if (tickAnim >= 16 && tickAnim < 21) {
            xx = 6.46079 + (((tickAnim - 16) / 5) * (11.41146-(6.46079)));
            yy = 15.77596 + (((tickAnim - 16) / 5) * (15.92724-(15.77596)));
            zz = -2.69878 + (((tickAnim - 16) / 5) * (-2.86199-(-2.69878)));
        }
        else if (tickAnim >= 21 && tickAnim < 30) {
            xx = 11.41146 + (((tickAnim - 21) / 9) * (6.87-(11.41146)));
            yy = 15.92724 + (((tickAnim - 21) / 9) * (15.79-(15.92724)));
            zz = -2.86199 + (((tickAnim - 21) / 9) * (-2.71-(-2.86199)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightupperarm, rightupperarm.rotateAngleX + (float) Math.toRadians(xx), rightupperarm.rotateAngleY + (float) Math.toRadians(yy), rightupperarm.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 4) {
            xx = -26.67 + (((tickAnim - 0) / 4) * (-22.5-(-26.67)));
            yy = 0 + (((tickAnim - 0) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 4) * (0-(0)));
        }
        else if (tickAnim >= 4 && tickAnim < 9) {
            xx = -22.5 + (((tickAnim - 4) / 5) * (-32.5-(-22.5)));
            yy = 0 + (((tickAnim - 4) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 4) / 5) * (0-(0)));
        }
        else if (tickAnim >= 9 && tickAnim < 19) {
            xx = -32.5 + (((tickAnim - 9) / 10) * (-22.5-(-32.5)));
            yy = 0 + (((tickAnim - 9) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 9) / 10) * (0-(0)));
        }
        else if (tickAnim >= 19 && tickAnim < 24) {
            xx = -22.5 + (((tickAnim - 19) / 5) * (-32.5-(-22.5)));
            yy = 0 + (((tickAnim - 19) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 19) / 5) * (0-(0)));
        }
        else if (tickAnim >= 24 && tickAnim < 30) {
            xx = -32.5 + (((tickAnim - 24) / 6) * (-26.67-(-32.5)));
            yy = 0 + (((tickAnim - 24) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 24) / 6) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightlowerarm, rightlowerarm.rotateAngleX + (float) Math.toRadians(xx), rightlowerarm.rotateAngleY + (float) Math.toRadians(yy), rightlowerarm.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 1) {
            xx = 6.87 + (((tickAnim - 0) / 1) * (6.46079-(6.87)));
            yy = -15.79 + (((tickAnim - 0) / 1) * (-15.776-(-15.79)));
            zz = 2.71 + (((tickAnim - 0) / 1) * (2.6988-(2.71)));
        }
        else if (tickAnim >= 1 && tickAnim < 6) {
            xx = 6.46079 + (((tickAnim - 1) / 5) * (11.41146-(6.46079)));
            yy = -15.776 + (((tickAnim - 1) / 5) * (-15.9272-(-15.776)));
            zz = 2.6988 + (((tickAnim - 1) / 5) * (2.862-(2.6988)));
        }
        else if (tickAnim >= 6 && tickAnim < 16) {
            xx = 11.41146 + (((tickAnim - 6) / 10) * (6.46079-(11.41146)));
            yy = -15.9272 + (((tickAnim - 6) / 10) * (-15.776-(-15.9272)));
            zz = 2.862 + (((tickAnim - 6) / 10) * (2.6988-(2.862)));
        }
        else if (tickAnim >= 16 && tickAnim < 21) {
            xx = 6.46079 + (((tickAnim - 16) / 5) * (11.41146-(6.46079)));
            yy = -15.776 + (((tickAnim - 16) / 5) * (-15.9272-(-15.776)));
            zz = 2.6988 + (((tickAnim - 16) / 5) * (2.862-(2.6988)));
        }
        else if (tickAnim >= 21 && tickAnim < 30) {
            xx = 11.41146 + (((tickAnim - 21) / 9) * (6.87-(11.41146)));
            yy = -15.9272 + (((tickAnim - 21) / 9) * (-15.79-(-15.9272)));
            zz = 2.862 + (((tickAnim - 21) / 9) * (2.71-(2.862)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftupperarm, leftupperarm.rotateAngleX + (float) Math.toRadians(xx), leftupperarm.rotateAngleY + (float) Math.toRadians(yy), leftupperarm.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 4) {
            xx = -26.67 + (((tickAnim - 0) / 4) * (-22.5-(-26.67)));
            yy = 0 + (((tickAnim - 0) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 4) * (0-(0)));
        }
        else if (tickAnim >= 4 && tickAnim < 9) {
            xx = -22.5 + (((tickAnim - 4) / 5) * (-32.5-(-22.5)));
            yy = 0 + (((tickAnim - 4) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 4) / 5) * (0-(0)));
        }
        else if (tickAnim >= 9 && tickAnim < 19) {
            xx = -32.5 + (((tickAnim - 9) / 10) * (-22.5-(-32.5)));
            yy = 0 + (((tickAnim - 9) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 9) / 10) * (0-(0)));
        }
        else if (tickAnim >= 19 && tickAnim < 24) {
            xx = -22.5 + (((tickAnim - 19) / 5) * (-32.5-(-22.5)));
            yy = 0 + (((tickAnim - 19) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 19) / 5) * (0-(0)));
        }
        else if (tickAnim >= 24 && tickAnim < 30) {
            xx = -32.5 + (((tickAnim - 24) / 6) * (-26.67-(-32.5)));
            yy = 0 + (((tickAnim - 24) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 24) / 6) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftlowerarm, leftlowerarm.rotateAngleX + (float) Math.toRadians(xx), leftlowerarm.rotateAngleY + (float) Math.toRadians(yy), leftlowerarm.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 10) {
            xx = -24.91132 + (((tickAnim - 0) / 10) * (18.6708-(-24.91132)));
            yy = -18.0582 + (((tickAnim - 0) / 10) * (-8.3531-(-18.0582)));
            zz = 7.3902 + (((tickAnim - 0) / 10) * (-6.7701-(7.3902)));
        }
        else if (tickAnim >= 10 && tickAnim < 15) {
            xx = 18.6708 + (((tickAnim - 10) / 5) * (40.24491-(18.6708)));
            yy = -8.3531 + (((tickAnim - 10) / 5) * (-2.2793-(-8.3531)));
            zz = -6.7701 + (((tickAnim - 10) / 5) * (-4.8549-(-6.7701)));
        }
        else if (tickAnim >= 15 && tickAnim < 25) {
            xx = 40.24491 + (((tickAnim - 15) / 10) * (-35.57554-(40.24491)));
            yy = -2.2793 + (((tickAnim - 15) / 10) * (-11.8999-(-2.2793)));
            zz = -4.8549 + (((tickAnim - 15) / 10) * (2.6189-(-4.8549)));
        }
        else if (tickAnim >= 25 && tickAnim < 29) {
            xx = -35.57554 + (((tickAnim - 25) / 4) * (-29.18869-(-35.57554)));
            yy = -11.8999 + (((tickAnim - 25) / 4) * (-17.0318-(-11.8999)));
            zz = 2.6189 + (((tickAnim - 25) / 4) * (6.595-(2.6189)));
        }
        else if (tickAnim >= 29 && tickAnim < 30) {
            xx = -29.18869 + (((tickAnim - 29) / 1) * (-24.91132-(-29.18869)));
            yy = -17.0318 + (((tickAnim - 29) / 1) * (-18.0582-(-17.0318)));
            zz = 6.595 + (((tickAnim - 29) / 1) * (7.3902-(6.595)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightthigh, rightthigh.rotateAngleX + (float) Math.toRadians(xx), rightthigh.rotateAngleY + (float) Math.toRadians(yy), rightthigh.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 0 + (((tickAnim - 0) / 3) * (5.17-(0)));
            yy = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 3) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 4) {
            xx = 5.17 + (((tickAnim - 3) / 1) * (6.11-(5.17)));
            yy = 0 + (((tickAnim - 3) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 3) / 1) * (0-(0)));
        }
        else if (tickAnim >= 4 && tickAnim < 8) {
            xx = 6.11 + (((tickAnim - 4) / 4) * (2.00008-(6.11)));
            yy = 0 + (((tickAnim - 4) / 4) * (0.00218-(0)));
            zz = 0 + (((tickAnim - 4) / 4) * (0.00845-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 12) {
            xx = 2.00008 + (((tickAnim - 8) / 4) * (10.33345-(2.00008)));
            yy = 0.00218 + (((tickAnim - 8) / 4) * (0.0034-(0.00218)));
            zz = 0.00845 + (((tickAnim - 8) / 4) * (0.01314-(0.00845)));
        }
        else if (tickAnim >= 12 && tickAnim < 15) {
            xx = 10.33345 + (((tickAnim - 12) / 3) * (4.00015-(10.33345)));
            yy = 0.0034 + (((tickAnim - 12) / 3) * (0.00437-(0.0034)));
            zz = 0.01314 + (((tickAnim - 12) / 3) * (0.0169-(0.01314)));
        }
        else if (tickAnim >= 15 && tickAnim < 18) {
            xx = 4.00015 + (((tickAnim - 15) / 3) * (36.19-(4.00015)));
            yy = 0.00437 + (((tickAnim - 15) / 3) * (0-(0.00437)));
            zz = 0.0169 + (((tickAnim - 15) / 3) * (0-(0.0169)));
        }
        else if (tickAnim >= 18 && tickAnim < 25) {
            xx = 36.19 + (((tickAnim - 18) / 7) * (40.83-(36.19)));
            yy = 0 + (((tickAnim - 18) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 18) / 7) * (0-(0)));
        }
        else if (tickAnim >= 25 && tickAnim < 30) {
            xx = 40.83 + (((tickAnim - 25) / 5) * (0-(40.83)));
            yy = 0 + (((tickAnim - 25) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 25) / 5) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightshin, rightshin.rotateAngleX + (float) Math.toRadians(xx), rightshin.rotateAngleY + (float) Math.toRadians(yy), rightshin.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 7.5 + (((tickAnim - 0) / 3) * (-7.67-(7.5)));
            yy = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 3) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 4) {
            xx = -7.67 + (((tickAnim - 3) / 1) * (-10.28-(-7.67)));
            yy = 0 + (((tickAnim - 3) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 3) / 1) * (0-(0)));
        }
        else if (tickAnim >= 4 && tickAnim < 8) {
            xx = -10.28 + (((tickAnim - 4) / 4) * (2.5-(-10.28)));
            yy = 0 + (((tickAnim - 4) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 4) / 4) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 12) {
            xx = 2.5 + (((tickAnim - 8) / 4) * (-0.56-(2.5)));
            yy = 0 + (((tickAnim - 8) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 4) * (0-(0)));
        }
        else if (tickAnim >= 12 && tickAnim < 15) {
            xx = -0.56 + (((tickAnim - 12) / 3) * (12.5-(-0.56)));
            yy = 0 + (((tickAnim - 12) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 12) / 3) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 20) {
            xx = 12.5 + (((tickAnim - 15) / 5) * (-36.77-(12.5)));
            yy = 0 + (((tickAnim - 15) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 5) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 23) {
            xx = -36.77 + (((tickAnim - 20) / 3) * (-49.87-(-36.77)));
            yy = 0 + (((tickAnim - 20) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 3) * (0-(0)));
        }
        else if (tickAnim >= 23 && tickAnim < 25) {
            xx = -49.87 + (((tickAnim - 23) / 2) * (-28.33-(-49.87)));
            yy = 0 + (((tickAnim - 23) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 23) / 2) * (0-(0)));
        }
        else if (tickAnim >= 25 && tickAnim < 27) {
            xx = -28.33 + (((tickAnim - 25) / 2) * (-28.89-(-28.33)));
            yy = 0 + (((tickAnim - 25) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 25) / 2) * (0-(0)));
        }
        else if (tickAnim >= 27 && tickAnim < 30) {
            xx = -28.89 + (((tickAnim - 27) / 3) * (7.5-(-28.89)));
            yy = 0 + (((tickAnim - 27) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 27) / 3) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightankle, rightankle.rotateAngleX + (float) Math.toRadians(xx), rightankle.rotateAngleY + (float) Math.toRadians(yy), rightankle.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 13.42861 + (((tickAnim - 0) / 3) * (14.8409-(13.42861)));
            yy = 3.8147 + (((tickAnim - 0) / 3) * (3.1997-(3.8147)));
            zz = -6.4622 + (((tickAnim - 0) / 3) * (-4.0302-(-6.4622)));
        }
        else if (tickAnim >= 3 && tickAnim < 4) {
            xx = 14.8409 + (((tickAnim - 3) / 1) * (9.11577-(14.8409)));
            yy = 3.1997 + (((tickAnim - 3) / 1) * (2.7897-(3.1997)));
            zz = -4.0302 + (((tickAnim - 3) / 1) * (-2.4089-(-4.0302)));
        }
        else if (tickAnim >= 4 && tickAnim < 8) {
            xx = 9.11577 + (((tickAnim - 4) / 4) * (-12.33451-(9.11577)));
            yy = 2.7897 + (((tickAnim - 4) / 4) * (1.9697-(2.7897)));
            zz = -2.4089 + (((tickAnim - 4) / 4) * (0.8338-(-2.4089)));
        }
        else if (tickAnim >= 8 && tickAnim < 10) {
            xx = -12.33451 + (((tickAnim - 8) / 2) * (-8.95103-(-12.33451)));
            yy = 1.9697 + (((tickAnim - 8) / 2) * (1.6416-(1.9697)));
            zz = 0.8338 + (((tickAnim - 8) / 2) * (4.4266-(0.8338)));
        }
        else if (tickAnim >= 10 && tickAnim < 12) {
            xx = -8.95103 + (((tickAnim - 10) / 2) * (4.55042-(-8.95103)));
            yy = 1.6416 + (((tickAnim - 10) / 2) * (1.579-(1.6416)));
            zz = 4.4266 + (((tickAnim - 10) / 2) * (3.2047-(4.4266)));
        }
        else if (tickAnim >= 12 && tickAnim < 13) {
            xx = 4.55042 + (((tickAnim - 12) / 1) * (5.41933-(4.55042)));
            yy = 1.579 + (((tickAnim - 12) / 1) * (-1.4928-(1.579)));
            zz = 3.2047 + (((tickAnim - 12) / 1) * (5.7743-(3.2047)));
        }
        else if (tickAnim >= 13 && tickAnim < 15) {
            xx = 5.41933 + (((tickAnim - 13) / 2) * (15.00204-(5.41933)));
            yy = -1.4928 + (((tickAnim - 13) / 2) * (-1.4918-(-1.4928)));
            zz = 5.7743 + (((tickAnim - 13) / 2) * (-0.1568-(5.7743)));
        }
        else if (tickAnim >= 15 && tickAnim < 21) {
            xx = 15.00204 + (((tickAnim - 15) / 6) * (118.33-(15.00204)));
            yy = -1.4918 + (((tickAnim - 15) / 6) * (0-(-1.4918)));
            zz = -0.1568 + (((tickAnim - 15) / 6) * (0-(-0.1568)));
        }
        else if (tickAnim >= 21 && tickAnim < 27) {
            xx = 118.33 + (((tickAnim - 21) / 6) * (86.04-(118.33)));
            yy = 0 + (((tickAnim - 21) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 21) / 6) * (0-(0)));
        }
        else if (tickAnim >= 27 && tickAnim < 30) {
            xx = 86.04 + (((tickAnim - 27) / 3) * (13.42861-(86.04)));
            yy = 0 + (((tickAnim - 27) / 3) * (3.8147-(0)));
            zz = 0 + (((tickAnim - 27) / 3) * (-6.4622-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightfoot, rightfoot.rotateAngleX + (float) Math.toRadians(xx), rightfoot.rotateAngleY + (float) Math.toRadians(yy), rightfoot.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 40.24491 + (((tickAnim - 0) / 10) * (-35.57554-(40.24491)));
            yy = 2.27929 + (((tickAnim - 0) / 10) * (11.89989-(2.27929)));
            zz = 4.85494 + (((tickAnim - 0) / 10) * (-2.61886-(4.85494)));
        }
        else if (tickAnim >= 10 && tickAnim < 14) {
            xx = -35.57554 + (((tickAnim - 10) / 4) * (-29.18869-(-35.57554)));
            yy = 11.89989 + (((tickAnim - 10) / 4) * (17.03178-(11.89989)));
            zz = -2.61886 + (((tickAnim - 10) / 4) * (-6.59496-(-2.61886)));
        }
        else if (tickAnim >= 14 && tickAnim < 15) {
            xx = -29.18869 + (((tickAnim - 14) / 1) * (-24.91132-(-29.18869)));
            yy = 17.03178 + (((tickAnim - 14) / 1) * (18.05816-(17.03178)));
            zz = -6.59496 + (((tickAnim - 14) / 1) * (-7.39018-(-6.59496)));
        }
        else if (tickAnim >= 15 && tickAnim < 25) {
            xx = -24.91132 + (((tickAnim - 15) / 10) * (18.6708-(-24.91132)));
            yy = 18.05816 + (((tickAnim - 15) / 10) * (8.35305-(18.05816)));
            zz = -7.39018 + (((tickAnim - 15) / 10) * (6.77006-(-7.39018)));
        }
        else if (tickAnim >= 25 && tickAnim < 30) {
            xx = 18.6708 + (((tickAnim - 25) / 5) * (40.24491-(18.6708)));
            yy = 8.35305 + (((tickAnim - 25) / 5) * (2.27929-(8.35305)));
            zz = 6.77006 + (((tickAnim - 25) / 5) * (4.85494-(6.77006)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftthigh, leftthigh.rotateAngleX + (float) Math.toRadians(xx), leftthigh.rotateAngleY + (float) Math.toRadians(yy), leftthigh.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 4.00015 + (((tickAnim - 0) / 3) * (36.19-(4.00015)));
            yy = 0.00437 + (((tickAnim - 0) / 3) * (0-(0.00437)));
            zz = 0.0169 + (((tickAnim - 0) / 3) * (0-(0.0169)));
        }
        else if (tickAnim >= 3 && tickAnim < 10) {
            xx = 36.19 + (((tickAnim - 3) / 7) * (40.83-(36.19)));
            yy = 0 + (((tickAnim - 3) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 3) / 7) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 15) {
            xx = 40.83 + (((tickAnim - 10) / 5) * (0-(40.83)));
            yy = 0 + (((tickAnim - 10) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 5) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 18) {
            xx = 0 + (((tickAnim - 15) / 3) * (5.17-(0)));
            yy = 0 + (((tickAnim - 15) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 3) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 19) {
            xx = 5.17 + (((tickAnim - 18) / 1) * (6.11-(5.17)));
            yy = 0 + (((tickAnim - 18) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 18) / 1) * (0-(0)));
        }
        else if (tickAnim >= 19 && tickAnim < 23) {
            xx = 6.11 + (((tickAnim - 19) / 4) * (2.00008-(6.11)));
            yy = 0 + (((tickAnim - 19) / 4) * (0.00218-(0)));
            zz = 0 + (((tickAnim - 19) / 4) * (0.00845-(0)));
        }
        else if (tickAnim >= 23 && tickAnim < 27) {
            xx = 2.00008 + (((tickAnim - 23) / 4) * (10.33345-(2.00008)));
            yy = 0.00218 + (((tickAnim - 23) / 4) * (0.0034-(0.00218)));
            zz = 0.00845 + (((tickAnim - 23) / 4) * (0.01314-(0.00845)));
        }
        else if (tickAnim >= 27 && tickAnim < 30) {
            xx = 10.33345 + (((tickAnim - 27) / 3) * (4.00015-(10.33345)));
            yy = 0.0034 + (((tickAnim - 27) / 3) * (0.00437-(0.0034)));
            zz = 0.01314 + (((tickAnim - 27) / 3) * (0.0169-(0.01314)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftshin, leftshin.rotateAngleX + (float) Math.toRadians(xx), leftshin.rotateAngleY + (float) Math.toRadians(yy), leftshin.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 5) {
            xx = 12.5 + (((tickAnim - 0) / 5) * (-36.77-(12.5)));
            yy = 0 + (((tickAnim - 0) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 5) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 8) {
            xx = -36.77 + (((tickAnim - 5) / 3) * (-49.87-(-36.77)));
            yy = 0 + (((tickAnim - 5) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 5) / 3) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 10) {
            xx = -49.87 + (((tickAnim - 8) / 2) * (-28.33-(-49.87)));
            yy = 0 + (((tickAnim - 8) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 2) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 12) {
            xx = -28.33 + (((tickAnim - 10) / 2) * (-28.89-(-28.33)));
            yy = 0 + (((tickAnim - 10) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 2) * (0-(0)));
        }
        else if (tickAnim >= 12 && tickAnim < 15) {
            xx = -28.89 + (((tickAnim - 12) / 3) * (7.5-(-28.89)));
            yy = 0 + (((tickAnim - 12) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 12) / 3) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 18) {
            xx = 7.5 + (((tickAnim - 15) / 3) * (-7.67-(7.5)));
            yy = 0 + (((tickAnim - 15) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 3) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 19) {
            xx = -7.67 + (((tickAnim - 18) / 1) * (-10.28-(-7.67)));
            yy = 0 + (((tickAnim - 18) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 18) / 1) * (0-(0)));
        }
        else if (tickAnim >= 19 && tickAnim < 23) {
            xx = -10.28 + (((tickAnim - 19) / 4) * (2.5-(-10.28)));
            yy = 0 + (((tickAnim - 19) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 19) / 4) * (0-(0)));
        }
        else if (tickAnim >= 23 && tickAnim < 27) {
            xx = 2.5 + (((tickAnim - 23) / 4) * (-0.56-(2.5)));
            yy = 0 + (((tickAnim - 23) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 23) / 4) * (0-(0)));
        }
        else if (tickAnim >= 27 && tickAnim < 30) {
            xx = -0.56 + (((tickAnim - 27) / 3) * (12.5-(-0.56)));
            yy = 0 + (((tickAnim - 27) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 27) / 3) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftankle, leftankle.rotateAngleX + (float) Math.toRadians(xx), leftankle.rotateAngleY + (float) Math.toRadians(yy), leftankle.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 6) {
            xx = 15.00204 + (((tickAnim - 0) / 6) * (118.33-(15.00204)));
            yy = 1.49178 + (((tickAnim - 0) / 6) * (0-(1.49178)));
            zz = 0.15684 + (((tickAnim - 0) / 6) * (0-(0.15684)));
        }
        else if (tickAnim >= 6 && tickAnim < 12) {
            xx = 118.33 + (((tickAnim - 6) / 6) * (86.04-(118.33)));
            yy = 0 + (((tickAnim - 6) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 6) / 6) * (0-(0)));
        }
        else if (tickAnim >= 12 && tickAnim < 15) {
            xx = 86.04 + (((tickAnim - 12) / 3) * (13.42861-(86.04)));
            yy = 0 + (((tickAnim - 12) / 3) * (-3.81468-(0)));
            zz = 0 + (((tickAnim - 12) / 3) * (6.4622-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 18) {
            xx = 13.42861 + (((tickAnim - 15) / 3) * (14.8409-(13.42861)));
            yy = -3.81468 + (((tickAnim - 15) / 3) * (-3.19969-(-3.81468)));
            zz = 6.4622 + (((tickAnim - 15) / 3) * (4.03021-(6.4622)));
        }
        else if (tickAnim >= 18 && tickAnim < 19) {
            xx = 14.8409 + (((tickAnim - 18) / 1) * (9.11577-(14.8409)));
            yy = -3.19969 + (((tickAnim - 18) / 1) * (-2.78969-(-3.19969)));
            zz = 4.03021 + (((tickAnim - 18) / 1) * (2.40889-(4.03021)));
        }
        else if (tickAnim >= 19 && tickAnim < 23) {
            xx = 9.11577 + (((tickAnim - 19) / 4) * (-12.33451-(9.11577)));
            yy = -2.78969 + (((tickAnim - 19) / 4) * (-1.9697-(-2.78969)));
            zz = 2.40889 + (((tickAnim - 19) / 4) * (-0.83375-(2.40889)));
        }
        else if (tickAnim >= 23 && tickAnim < 25) {
            xx = -12.33451 + (((tickAnim - 23) / 2) * (-8.95103-(-12.33451)));
            yy = -1.9697 + (((tickAnim - 23) / 2) * (-1.64157-(-1.9697)));
            zz = -0.83375 + (((tickAnim - 23) / 2) * (-4.42655-(-0.83375)));
        }
        else if (tickAnim >= 25 && tickAnim < 27) {
            xx = -8.95103 + (((tickAnim - 25) / 2) * (4.55042-(-8.95103)));
            yy = -1.64157 + (((tickAnim - 25) / 2) * (-1.57901-(-1.64157)));
            zz = -4.42655 + (((tickAnim - 25) / 2) * (-3.20467-(-4.42655)));
        }
        else if (tickAnim >= 27 && tickAnim < 28) {
            xx = 4.55042 + (((tickAnim - 27) / 1) * (5.41933-(4.55042)));
            yy = -1.57901 + (((tickAnim - 27) / 1) * (1.49284-(-1.57901)));
            zz = -3.20467 + (((tickAnim - 27) / 1) * (-5.7743-(-3.20467)));
        }
        else if (tickAnim >= 28 && tickAnim < 30) {
            xx = 5.41933 + (((tickAnim - 28) / 2) * (15.00204-(5.41933)));
            yy = 1.49284 + (((tickAnim - 28) / 2) * (1.49178-(1.49284)));
            zz = -5.7743 + (((tickAnim - 28) / 2) * (0.15684-(-5.7743)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftfoot, leftfoot.rotateAngleX + (float) Math.toRadians(xx), leftfoot.rotateAngleY + (float) Math.toRadians(yy), leftfoot.rotateAngleZ + (float) Math.toRadians(zz));


    }
    public void animRunning(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime) {
        EntityPrehistoricFloraAnchisaurus entity = (EntityPrehistoricFloraAnchisaurus) entitylivingbaseIn;

        int animCycle = 10;
        double tickAnim = (entity.ticksExisted + entity.getTickOffset()) - (int) (Math.floor((double) (entity.ticksExisted + entity.getTickOffset()) / (double) animCycle) * (double) animCycle) + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;

        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 2 + (((tickAnim - 0) / 3) * (3-(2)));
            yy = 5 + (((tickAnim - 0) / 3) * (-1.66667-(5)));
            zz = 0.00001 + (((tickAnim - 0) / 3) * (2.50001-(0.00001)));
        }
        else if (tickAnim >= 3 && tickAnim < 5) {
            xx = 3 + (((tickAnim - 3) / 2) * (2-(3)));
            yy = -1.66667 + (((tickAnim - 3) / 2) * (-5-(-1.66667)));
            zz = 2.50001 + (((tickAnim - 3) / 2) * (0.00002-(2.50001)));
        }
        else if (tickAnim >= 5 && tickAnim < 8) {
            xx = 2 + (((tickAnim - 5) / 3) * (3-(2)));
            yy = -5 + (((tickAnim - 5) / 3) * (1.66667-(-5)));
            zz = 0.00002 + (((tickAnim - 5) / 3) * (-2.49999-(0.00002)));
        }
        else if (tickAnim >= 8 && tickAnim < 10) {
            xx = 3 + (((tickAnim - 8) / 2) * (2-(3)));
            yy = 1.66667 + (((tickAnim - 8) / 2) * (5-(1.66667)));
            zz = -2.49999 + (((tickAnim - 8) / 2) * (0.00001-(-2.49999)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(hips, hips.rotateAngleX + (float) Math.toRadians(xx), hips.rotateAngleY + (float) Math.toRadians(yy), hips.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            yy = -3.25 + (((tickAnim - 0) / 3) * (-1-(-3.25)));
            zz = 0 + (((tickAnim - 0) / 3) * (-1.25-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 4) {
            xx = 0 + (((tickAnim - 3) / 1) * (0-(0)));
            yy = -1 + (((tickAnim - 3) / 1) * (-3-(-1)));
            zz = -1.25 + (((tickAnim - 3) / 1) * (0-(-1.25)));
        }
        else if (tickAnim >= 4 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 4) / 1) * (0-(0)));
            yy = -3 + (((tickAnim - 4) / 1) * (-3.25-(-3)));
            zz = 0 + (((tickAnim - 4) / 1) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 5) / 3) * (0-(0)));
            yy = -3.25 + (((tickAnim - 5) / 3) * (-1-(-3.25)));
            zz = 0 + (((tickAnim - 5) / 3) * (-1.25-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 9) {
            xx = 0 + (((tickAnim - 8) / 1) * (0-(0)));
            yy = -1 + (((tickAnim - 8) / 1) * (-3-(-1)));
            zz = -1.25 + (((tickAnim - 8) / 1) * (0-(-1.25)));
        }
        else if (tickAnim >= 9 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 9) / 1) * (0-(0)));
            yy = -3 + (((tickAnim - 9) / 1) * (-3.25-(-3)));
            zz = 0 + (((tickAnim - 9) / 1) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.hips.rotationPointX = this.hips.rotationPointX + (float)(xx);
        this.hips.rotationPointY = this.hips.rotationPointY - (float)(yy);
        this.hips.rotationPointZ = this.hips.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 3) {
            xx = -2.5 + (((tickAnim - 0) / 3) * (2.5-(-2.5)));
            yy = 2.5 + (((tickAnim - 0) / 3) * (0-(2.5)));
            zz = 0 + (((tickAnim - 0) / 3) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 5) {
            xx = 2.5 + (((tickAnim - 3) / 2) * (-2.5-(2.5)));
            yy = 0 + (((tickAnim - 3) / 2) * (-2.5-(0)));
            zz = 0 + (((tickAnim - 3) / 2) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 8) {
            xx = -2.5 + (((tickAnim - 5) / 3) * (2.5-(-2.5)));
            yy = -2.5 + (((tickAnim - 5) / 3) * (0-(-2.5)));
            zz = 0 + (((tickAnim - 5) / 3) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 10) {
            xx = 2.5 + (((tickAnim - 8) / 2) * (-1.94-(2.5)));
            yy = 0 + (((tickAnim - 8) / 2) * (2.22-(0)));
            zz = 0 + (((tickAnim - 8) / 2) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tailbase, tailbase.rotateAngleX + (float) Math.toRadians(xx), tailbase.rotateAngleY + (float) Math.toRadians(yy), tailbase.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 1) {
            xx = -1.83 + (((tickAnim - 0) / 1) * (-3.5-(-1.83)));
            yy = 1.67 + (((tickAnim - 0) / 1) * (2.5-(1.67)));
            zz = 0 + (((tickAnim - 0) / 1) * (0-(0)));
        }
        else if (tickAnim >= 1 && tickAnim < 3) {
            xx = -3.5 + (((tickAnim - 1) / 2) * (1.5-(-3.5)));
            yy = 2.5 + (((tickAnim - 1) / 2) * (0-(2.5)));
            zz = 0 + (((tickAnim - 1) / 2) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 6) {
            xx = 1.5 + (((tickAnim - 3) / 3) * (-3.5-(1.5)));
            yy = 0 + (((tickAnim - 3) / 3) * (-2.5-(0)));
            zz = 0 + (((tickAnim - 3) / 3) * (0-(0)));
        }
        else if (tickAnim >= 6 && tickAnim < 8) {
            xx = -3.5 + (((tickAnim - 6) / 2) * (1.5-(-3.5)));
            yy = -2.5 + (((tickAnim - 6) / 2) * (0-(-2.5)));
            zz = 0 + (((tickAnim - 6) / 2) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 10) {
            xx = 1.5 + (((tickAnim - 8) / 2) * (-1.83-(1.5)));
            yy = 0 + (((tickAnim - 8) / 2) * (1.67-(0)));
            zz = 0 + (((tickAnim - 8) / 2) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tailmiddlebase, tailmiddlebase.rotateAngleX + (float) Math.toRadians(xx), tailmiddlebase.rotateAngleY + (float) Math.toRadians(yy), tailmiddlebase.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 2) {
            xx = -1.22 + (((tickAnim - 0) / 2) * (-4.5-(-1.22)));
            yy = 1.11 + (((tickAnim - 0) / 2) * (2.5-(1.11)));
            zz = 0 + (((tickAnim - 0) / 2) * (0-(0)));
        }
        else if (tickAnim >= 2 && tickAnim < 4) {
            xx = -4.5 + (((tickAnim - 2) / 2) * (0.5-(-4.5)));
            yy = 2.5 + (((tickAnim - 2) / 2) * (0-(2.5)));
            zz = 0 + (((tickAnim - 2) / 2) * (0-(0)));
        }
        else if (tickAnim >= 4 && tickAnim < 7) {
            xx = 0.5 + (((tickAnim - 4) / 3) * (-4.5-(0.5)));
            yy = 0 + (((tickAnim - 4) / 3) * (-2.5-(0)));
            zz = 0 + (((tickAnim - 4) / 3) * (0-(0)));
        }
        else if (tickAnim >= 7 && tickAnim < 9) {
            xx = -4.5 + (((tickAnim - 7) / 2) * (0.5-(-4.5)));
            yy = -2.5 + (((tickAnim - 7) / 2) * (0-(-2.5)));
            zz = 0 + (((tickAnim - 7) / 2) * (0-(0)));
        }
        else if (tickAnim >= 9 && tickAnim < 10) {
            xx = 0.5 + (((tickAnim - 9) / 1) * (-1.22-(0.5)));
            yy = 0 + (((tickAnim - 9) / 1) * (1.11-(0)));
            zz = 0 + (((tickAnim - 9) / 1) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tailmiddle, tailmiddle.rotateAngleX + (float) Math.toRadians(xx), tailmiddle.rotateAngleY + (float) Math.toRadians(yy), tailmiddle.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 2) {
            xx = -0.5 + (((tickAnim - 0) / 2) * (-5.5-(-0.5)));
            yy = 0 + (((tickAnim - 0) / 2) * (2.5-(0)));
            zz = 0 + (((tickAnim - 0) / 2) * (0-(0)));
        }
        else if (tickAnim >= 2 && tickAnim < 4) {
            xx = -5.5 + (((tickAnim - 2) / 2) * (-0.5-(-5.5)));
            yy = 2.5 + (((tickAnim - 2) / 2) * (0-(2.5)));
            zz = 0 + (((tickAnim - 2) / 2) * (0-(0)));
        }
        else if (tickAnim >= 4 && tickAnim < 8) {
            xx = -0.5 + (((tickAnim - 4) / 4) * (-5.5-(-0.5)));
            yy = 0 + (((tickAnim - 4) / 4) * (-2.5-(0)));
            zz = 0 + (((tickAnim - 4) / 4) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 10) {
            xx = -5.5 + (((tickAnim - 8) / 2) * (-0.5-(-5.5)));
            yy = -2.5 + (((tickAnim - 8) / 2) * (0-(-2.5)));
            zz = 0 + (((tickAnim - 8) / 2) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tailmiddleend, tailmiddleend.rotateAngleX + (float) Math.toRadians(xx), tailmiddleend.rotateAngleY + (float) Math.toRadians(yy), tailmiddleend.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 3) {
            xx = -1 + (((tickAnim - 0) / 3) * (1.5-(-1)));
            yy = -3 + (((tickAnim - 0) / 3) * (0-(-3)));
            zz = 0 + (((tickAnim - 0) / 3) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 5) {
            xx = 1.5 + (((tickAnim - 3) / 2) * (-1-(1.5)));
            yy = 0 + (((tickAnim - 3) / 2) * (3-(0)));
            zz = 0 + (((tickAnim - 3) / 2) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 8) {
            xx = -1 + (((tickAnim - 5) / 3) * (1.5-(-1)));
            yy = 3 + (((tickAnim - 5) / 3) * (0-(3)));
            zz = 0 + (((tickAnim - 5) / 3) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 10) {
            xx = 1.5 + (((tickAnim - 8) / 2) * (-1-(1.5)));
            yy = 0 + (((tickAnim - 8) / 2) * (-3-(0)));
            zz = 0 + (((tickAnim - 8) / 2) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(bodymiddle, bodymiddle.rotateAngleX + (float) Math.toRadians(xx), bodymiddle.rotateAngleY + (float) Math.toRadians(yy), bodymiddle.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 8.52 + (((tickAnim - 0) / 3) * (6-(8.52)));
            yy = -0.28 + (((tickAnim - 0) / 3) * (-2.5-(-0.28)));
            zz = 0 + (((tickAnim - 0) / 3) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 5) {
            xx = 6 + (((tickAnim - 3) / 2) * (8.5-(6)));
            yy = -2.5 + (((tickAnim - 3) / 2) * (0-(-2.5)));
            zz = 0 + (((tickAnim - 3) / 2) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 8) {
            xx = 8.5 + (((tickAnim - 5) / 3) * (6-(8.5)));
            yy = 0 + (((tickAnim - 5) / 3) * (2.5-(0)));
            zz = 0 + (((tickAnim - 5) / 3) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 10) {
            xx = 6 + (((tickAnim - 8) / 2) * (8.52-(6)));
            yy = 2.5 + (((tickAnim - 8) / 2) * (-0.28-(2.5)));
            zz = 0 + (((tickAnim - 8) / 2) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(bodyfront, bodyfront.rotateAngleX + (float) Math.toRadians(xx), bodyfront.rotateAngleY + (float) Math.toRadians(yy), bodyfront.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 2) {
            xx = -7.67 + (((tickAnim - 0) / 2) * (-6-(-7.67)));
            yy = -0.83 + (((tickAnim - 0) / 2) * (-2.5-(-0.83)));
            zz = 0 + (((tickAnim - 0) / 2) * (0-(0)));
        }
        else if (tickAnim >= 2 && tickAnim < 4) {
            xx = -6 + (((tickAnim - 2) / 2) * (-8.5-(-6)));
            yy = -2.5 + (((tickAnim - 2) / 2) * (0-(-2.5)));
            zz = 0 + (((tickAnim - 2) / 2) * (0-(0)));
        }
        else if (tickAnim >= 4 && tickAnim < 7) {
            xx = -8.5 + (((tickAnim - 4) / 3) * (-6-(-8.5)));
            yy = 0 + (((tickAnim - 4) / 3) * (2.5-(0)));
            zz = 0 + (((tickAnim - 4) / 3) * (0-(0)));
        }
        else if (tickAnim >= 7 && tickAnim < 9) {
            xx = -6 + (((tickAnim - 7) / 2) * (-8.5-(-6)));
            yy = 2.5 + (((tickAnim - 7) / 2) * (0-(2.5)));
            zz = 0 + (((tickAnim - 7) / 2) * (0-(0)));
        }
        else if (tickAnim >= 9 && tickAnim < 10) {
            xx = -8.5 + (((tickAnim - 9) / 1) * (-7.67-(-8.5)));
            yy = 0 + (((tickAnim - 9) / 1) * (-0.83-(0)));
            zz = 0 + (((tickAnim - 9) / 1) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neckbase, neckbase.rotateAngleX + (float) Math.toRadians(xx), neckbase.rotateAngleY + (float) Math.toRadians(yy), neckbase.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 1) {
            xx = -3.11 + (((tickAnim - 0) / 1) * (-2-(-3.11)));
            yy = -1.39 + (((tickAnim - 0) / 1) * (-2.5-(-1.39)));
            zz = 0 + (((tickAnim - 0) / 1) * (0-(0)));
        }
        else if (tickAnim >= 1 && tickAnim < 3) {
            xx = -2 + (((tickAnim - 1) / 2) * (-4.5-(-2)));
            yy = -2.5 + (((tickAnim - 1) / 2) * (0-(-2.5)));
            zz = 0 + (((tickAnim - 1) / 2) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 6) {
            xx = -4.5 + (((tickAnim - 3) / 3) * (-2-(-4.5)));
            yy = 0 + (((tickAnim - 3) / 3) * (2.5-(0)));
            zz = 0 + (((tickAnim - 3) / 3) * (0-(0)));
        }
        else if (tickAnim >= 6 && tickAnim < 9) {
            xx = -2 + (((tickAnim - 6) / 3) * (-4.5-(-2)));
            yy = 2.5 + (((tickAnim - 6) / 3) * (0-(2.5)));
            zz = 0 + (((tickAnim - 6) / 3) * (0-(0)));
        }
        else if (tickAnim >= 9 && tickAnim < 10) {
            xx = -4.5 + (((tickAnim - 9) / 1) * (-3.11-(-4.5)));
            yy = 0 + (((tickAnim - 9) / 1) * (-1.39-(0)));
            zz = 0 + (((tickAnim - 9) / 1) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neckmiddlebase, neckmiddlebase.rotateAngleX + (float) Math.toRadians(xx), neckmiddlebase.rotateAngleY + (float) Math.toRadians(yy), neckmiddlebase.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 1) {
            xx = -0.56 + (((tickAnim - 0) / 1) * (0-(-0.56)));
            yy = -1.94 + (((tickAnim - 0) / 1) * (-2.5-(-1.94)));
            zz = 0 + (((tickAnim - 0) / 1) * (0-(0)));
        }
        else if (tickAnim >= 1 && tickAnim < 3) {
            xx = 0 + (((tickAnim - 1) / 2) * (-2.5-(0)));
            yy = -2.5 + (((tickAnim - 1) / 2) * (0-(-2.5)));
            zz = 0 + (((tickAnim - 1) / 2) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 6) {
            xx = -2.5 + (((tickAnim - 3) / 3) * (0-(-2.5)));
            yy = 0 + (((tickAnim - 3) / 3) * (2.5-(0)));
            zz = 0 + (((tickAnim - 3) / 3) * (0-(0)));
        }
        else if (tickAnim >= 6 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 6) / 2) * (-2.5-(0)));
            yy = 2.5 + (((tickAnim - 6) / 2) * (0-(2.5)));
            zz = 0 + (((tickAnim - 6) / 2) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 10) {
            xx = -2.5 + (((tickAnim - 8) / 2) * (-0.56-(-2.5)));
            yy = 0 + (((tickAnim - 8) / 2) * (-1.94-(0)));
            zz = 0 + (((tickAnim - 8) / 2) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neckmiddlefront, neckmiddlefront.rotateAngleX + (float) Math.toRadians(xx), neckmiddlefront.rotateAngleY + (float) Math.toRadians(yy), neckmiddlefront.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 0 + (((tickAnim - 0) / 3) * (4.74742-(0)));
            yy = 2.5 + (((tickAnim - 0) / 3) * (7.09348-(2.5)));
            zz = 0 + (((tickAnim - 0) / 3) * (-2.1657-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 5) {
            xx = 4.74742 + (((tickAnim - 3) / 2) * (0-(4.74742)));
            yy = 7.09348 + (((tickAnim - 3) / 2) * (-2.5-(7.09348)));
            zz = -2.1657 + (((tickAnim - 3) / 2) * (0-(-2.1657)));
        }
        else if (tickAnim >= 5 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 5) / 3) * (4.81147-(0)));
            yy = -2.5 + (((tickAnim - 5) / 3) * (-7.07074-(-2.5)));
            zz = 0 + (((tickAnim - 5) / 3) * (1.66238-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 10) {
            xx = 4.81147 + (((tickAnim - 8) / 2) * (0-(4.81147)));
            yy = -7.07074 + (((tickAnim - 8) / 2) * (2.5-(-7.07074)));
            zz = 1.66238 + (((tickAnim - 8) / 2) * (0-(1.66238)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(head, head.rotateAngleX + (float) Math.toRadians(xx), head.rotateAngleY + (float) Math.toRadians(yy), head.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 2) {
            xx = 17.46079 + (((tickAnim - 0) / 2) * (22.41146-(17.46079)));
            yy = 15.77596 + (((tickAnim - 0) / 2) * (15.92724-(15.77596)));
            zz = -2.69878 + (((tickAnim - 0) / 2) * (-2.86199-(-2.69878)));
        }
        else if (tickAnim >= 2 && tickAnim < 5) {
            xx = 22.41146 + (((tickAnim - 2) / 3) * (17.46079-(22.41146)));
            yy = 15.92724 + (((tickAnim - 2) / 3) * (15.77596-(15.92724)));
            zz = -2.86199 + (((tickAnim - 2) / 3) * (-2.69878-(-2.86199)));
        }
        else if (tickAnim >= 5 && tickAnim < 8) {
            xx = 17.46079 + (((tickAnim - 5) / 3) * (22.41146-(17.46079)));
            yy = 15.77596 + (((tickAnim - 5) / 3) * (15.92724-(15.77596)));
            zz = -2.69878 + (((tickAnim - 5) / 3) * (-2.86199-(-2.69878)));
        }
        else if (tickAnim >= 8 && tickAnim < 10) {
            xx = 22.41146 + (((tickAnim - 8) / 2) * (17.87-(22.41146)));
            yy = 15.92724 + (((tickAnim - 8) / 2) * (15.79-(15.92724)));
            zz = -2.86199 + (((tickAnim - 8) / 2) * (-2.71-(-2.86199)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightupperarm, rightupperarm.rotateAngleX + (float) Math.toRadians(xx), rightupperarm.rotateAngleY + (float) Math.toRadians(yy), rightupperarm.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 2) {
            xx = -49.67 + (((tickAnim - 0) / 2) * (-45.5-(-49.67)));
            yy = 0 + (((tickAnim - 0) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 2) * (0-(0)));
        }
        else if (tickAnim >= 2 && tickAnim < 3) {
            xx = -45.5 + (((tickAnim - 2) / 1) * (-55.5-(-45.5)));
            yy = 0 + (((tickAnim - 2) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 2) / 1) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 7) {
            xx = -55.5 + (((tickAnim - 3) / 4) * (-45.5-(-55.5)));
            yy = 0 + (((tickAnim - 3) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 3) / 4) * (0-(0)));
        }
        else if (tickAnim >= 7 && tickAnim < 8) {
            xx = -45.5 + (((tickAnim - 7) / 1) * (-55.5-(-45.5)));
            yy = 0 + (((tickAnim - 7) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 7) / 1) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 10) {
            xx = -55.5 + (((tickAnim - 8) / 2) * (-49.67-(-55.5)));
            yy = 0 + (((tickAnim - 8) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 2) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightlowerarm, rightlowerarm.rotateAngleX + (float) Math.toRadians(xx), rightlowerarm.rotateAngleY + (float) Math.toRadians(yy), rightlowerarm.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 2) {
            xx = 18.46079 + (((tickAnim - 0) / 2) * (23.41146-(18.46079)));
            yy = -15.776 + (((tickAnim - 0) / 2) * (-15.9272-(-15.776)));
            zz = 2.6988 + (((tickAnim - 0) / 2) * (2.862-(2.6988)));
        }
        else if (tickAnim >= 2 && tickAnim < 5) {
            xx = 23.41146 + (((tickAnim - 2) / 3) * (18.46079-(23.41146)));
            yy = -15.9272 + (((tickAnim - 2) / 3) * (-15.776-(-15.9272)));
            zz = 2.862 + (((tickAnim - 2) / 3) * (2.6988-(2.862)));
        }
        else if (tickAnim >= 5 && tickAnim < 8) {
            xx = 18.46079 + (((tickAnim - 5) / 3) * (23.41146-(18.46079)));
            yy = -15.776 + (((tickAnim - 5) / 3) * (-15.9272-(-15.776)));
            zz = 2.6988 + (((tickAnim - 5) / 3) * (2.862-(2.6988)));
        }
        else if (tickAnim >= 8 && tickAnim < 10) {
            xx = 23.41146 + (((tickAnim - 8) / 2) * (18.87-(23.41146)));
            yy = -15.9272 + (((tickAnim - 8) / 2) * (-15.79-(-15.9272)));
            zz = 2.862 + (((tickAnim - 8) / 2) * (2.71-(2.862)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftupperarm, leftupperarm.rotateAngleX + (float) Math.toRadians(xx), leftupperarm.rotateAngleY + (float) Math.toRadians(yy), leftupperarm.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 2) {
            xx = -49.67 + (((tickAnim - 0) / 2) * (-45.5-(-49.67)));
            yy = 0 + (((tickAnim - 0) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 2) * (0-(0)));
        }
        else if (tickAnim >= 2 && tickAnim < 3) {
            xx = -45.5 + (((tickAnim - 2) / 1) * (-55.5-(-45.5)));
            yy = 0 + (((tickAnim - 2) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 2) / 1) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 7) {
            xx = -55.5 + (((tickAnim - 3) / 4) * (-45.5-(-55.5)));
            yy = 0 + (((tickAnim - 3) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 3) / 4) * (0-(0)));
        }
        else if (tickAnim >= 7 && tickAnim < 8) {
            xx = -45.5 + (((tickAnim - 7) / 1) * (-55.5-(-45.5)));
            yy = 0 + (((tickAnim - 7) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 7) / 1) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 10) {
            xx = -55.5 + (((tickAnim - 8) / 2) * (-49.67-(-55.5)));
            yy = 0 + (((tickAnim - 8) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 2) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftlowerarm, leftlowerarm.rotateAngleX + (float) Math.toRadians(xx), leftlowerarm.rotateAngleY + (float) Math.toRadians(yy), leftlowerarm.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 3) {
            xx = -30.21675 + (((tickAnim - 0) / 3) * (-9.31466-(-30.21675)));
            yy = -8.4892 + (((tickAnim - 0) / 3) * (-12.4744-(-8.4892)));
            zz = 5.8628 + (((tickAnim - 0) / 3) * (-0.2584-(5.8628)));
        }
        else if (tickAnim >= 3 && tickAnim < 5) {
            xx = -9.31466 + (((tickAnim - 3) / 2) * (29.25118-(-9.31466)));
            yy = -12.4744 + (((tickAnim - 3) / 2) * (-9.5789-(-12.4744)));
            zz = -0.2584 + (((tickAnim - 3) / 2) * (-10.4037-(-0.2584)));
        }
        else if (tickAnim >= 5 && tickAnim < 8) {
            xx = 29.25118 + (((tickAnim - 5) / 3) * (-35-(29.25118)));
            yy = -9.5789 + (((tickAnim - 5) / 3) * (0-(-9.5789)));
            zz = -10.4037 + (((tickAnim - 5) / 3) * (0-(-10.4037)));
        }
        else if (tickAnim >= 8 && tickAnim < 10) {
            xx = -35 + (((tickAnim - 8) / 2) * (-30.21675-(-35)));
            yy = 0 + (((tickAnim - 8) / 2) * (-8.4892-(0)));
            zz = 0 + (((tickAnim - 8) / 2) * (5.8628-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightthigh, rightthigh.rotateAngleX + (float) Math.toRadians(xx), rightthigh.rotateAngleY + (float) Math.toRadians(yy), rightthigh.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 1) {
            xx = -23.75 + (((tickAnim - 0) / 1) * (-1.67-(-23.75)));
            yy = 0 + (((tickAnim - 0) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 1) * (0-(0)));
        }
        else if (tickAnim >= 1 && tickAnim < 2) {
            xx = -1.67 + (((tickAnim - 1) / 1) * (14.16-(-1.67)));
            yy = 0 + (((tickAnim - 1) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 1) / 1) * (0-(0)));
        }
        else if (tickAnim >= 2 && tickAnim < 3) {
            xx = 14.16 + (((tickAnim - 2) / 1) * (20-(14.16)));
            yy = 0 + (((tickAnim - 2) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 2) / 1) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 5) {
            xx = 20 + (((tickAnim - 3) / 2) * (36.25-(20)));
            yy = 0 + (((tickAnim - 3) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 3) / 2) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 8) {
            xx = 36.25 + (((tickAnim - 5) / 3) * (60-(36.25)));
            yy = 0 + (((tickAnim - 5) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 5) / 3) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 9) {
            xx = 60 + (((tickAnim - 8) / 1) * (-5.83-(60)));
            yy = 0 + (((tickAnim - 8) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 1) * (0-(0)));
        }
        else if (tickAnim >= 9 && tickAnim < 10) {
            xx = -5.83 + (((tickAnim - 9) / 1) * (-23.75-(-5.83)));
            yy = 0 + (((tickAnim - 9) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 9) / 1) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightshin, rightshin.rotateAngleX + (float) Math.toRadians(xx), rightshin.rotateAngleY + (float) Math.toRadians(yy), rightshin.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 1) {
            xx = 12.54725 + (((tickAnim - 0) / 1) * (-23.27033-(12.54725)));
            yy = 0 + (((tickAnim - 0) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 1) * (0-(0)));
        }
        else if (tickAnim >= 1 && tickAnim < 2) {
            xx = -23.27033 + (((tickAnim - 1) / 1) * (-25.34-(-23.27033)));
            yy = 0 + (((tickAnim - 1) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 1) / 1) * (0-(0)));
        }
        else if (tickAnim >= 2 && tickAnim < 3) {
            xx = -25.34 + (((tickAnim - 2) / 1) * (2.5945-(-25.34)));
            yy = 0 + (((tickAnim - 2) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 2) / 1) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 4) {
            xx = 2.5945 + (((tickAnim - 3) / 1) * (33.4-(2.5945)));
            yy = 0 + (((tickAnim - 3) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 3) / 1) * (0-(0)));
        }
        else if (tickAnim >= 4 && tickAnim < 5) {
            xx = 33.4 + (((tickAnim - 4) / 1) * (15.04725-(33.4)));
            yy = 0 + (((tickAnim - 4) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 4) / 1) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 7) {
            xx = 15.04725 + (((tickAnim - 5) / 2) * (21.68-(15.04725)));
            yy = 0 + (((tickAnim - 5) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 5) / 2) * (0-(0)));
        }
        else if (tickAnim >= 7 && tickAnim < 8) {
            xx = 21.68 + (((tickAnim - 7) / 1) * (-42.5-(21.68)));
            yy = 0 + (((tickAnim - 7) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 7) / 1) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 8) {
            xx = -42.5 + (((tickAnim - 8) / 0) * (-34.15-(-42.5)));
            yy = 0 + (((tickAnim - 8) / 0) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 0) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 10) {
            xx = -34.15 + (((tickAnim - 8) / 2) * (12.54725-(-34.15)));
            yy = 0 + (((tickAnim - 8) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 2) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightankle, rightankle.rotateAngleX + (float) Math.toRadians(xx), rightankle.rotateAngleY + (float) Math.toRadians(yy), rightankle.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 1) {
            xx = 38.52094 + (((tickAnim - 0) / 1) * (44.85373-(38.52094)));
            yy = 6.3346 + (((tickAnim - 0) / 1) * (5.0679-(6.3346)));
            zz = -1.5549 + (((tickAnim - 0) / 1) * (0.3954-(-1.5549)));
        }
        else if (tickAnim >= 1 && tickAnim < 2) {
            xx = 44.85373 + (((tickAnim - 1) / 1) * (23.51421-(44.85373)));
            yy = 5.0679 + (((tickAnim - 1) / 1) * (4.7092-(5.0679)));
            zz = 0.3954 + (((tickAnim - 1) / 1) * (-0.5125-(0.3954)));
        }
        else if (tickAnim >= 2 && tickAnim < 3) {
            xx = 23.51421 + (((tickAnim - 2) / 1) * (-17.5-(23.51421)));
            yy = 4.7092 + (((tickAnim - 2) / 1) * (0-(4.7092)));
            zz = -0.5125 + (((tickAnim - 2) / 1) * (0-(-0.5125)));
        }
        else if (tickAnim >= 3 && tickAnim < 3) {
            xx = -17.5 + (((tickAnim - 3) / 0) * (-21.24863-(-17.5)));
            yy = 0 + (((tickAnim - 3) / 0) * (-0.0406-(0)));
            zz = 0 + (((tickAnim - 3) / 0) * (1.6677-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 4) {
            xx = -21.24863 + (((tickAnim - 3) / 1) * (38.75063-(-21.24863)));
            yy = -0.0406 + (((tickAnim - 3) / 1) * (0.0279-(-0.0406)));
            zz = 1.6677 + (((tickAnim - 3) / 1) * (3.3333-(1.6677)));
        }
        else if (tickAnim >= 4 && tickAnim < 5) {
            xx = 38.75063 + (((tickAnim - 4) / 1) * (46.25-(38.75063)));
            yy = 0.0279 + (((tickAnim - 4) / 1) * (0.02-(0.0279)));
            zz = 3.3333 + (((tickAnim - 4) / 1) * (2.5-(3.3333)));
        }
        else if (tickAnim >= 5 && tickAnim < 8) {
            xx = 46.25 + (((tickAnim - 5) / 3) * (110-(46.25)));
            yy = 0.02 + (((tickAnim - 5) / 3) * (0-(0.02)));
            zz = 2.5 + (((tickAnim - 5) / 3) * (0-(2.5)));
        }
        else if (tickAnim >= 8 && tickAnim < 9) {
            xx = 110 + (((tickAnim - 8) / 1) * (44.10141-(110)));
            yy = 0 + (((tickAnim - 8) / 1) * (2.848-(0)));
            zz = 0 + (((tickAnim - 8) / 1) * (-0.0907-(0)));
        }
        else if (tickAnim >= 9 && tickAnim < 10) {
            xx = 44.10141 + (((tickAnim - 9) / 1) * (38.52094-(44.10141)));
            yy = 2.848 + (((tickAnim - 9) / 1) * (6.3346-(2.848)));
            zz = -0.0907 + (((tickAnim - 9) / 1) * (-1.5549-(-0.0907)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightfoot, rightfoot.rotateAngleX + (float) Math.toRadians(xx), rightfoot.rotateAngleY + (float) Math.toRadians(yy), rightfoot.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 29.25118 + (((tickAnim - 0) / 3) * (-35-(29.25118)));
            yy = 9.57892 + (((tickAnim - 0) / 3) * (0-(9.57892)));
            zz = 10.40372 + (((tickAnim - 0) / 3) * (0-(10.40372)));
        }
        else if (tickAnim >= 3 && tickAnim < 5) {
            xx = -35 + (((tickAnim - 3) / 2) * (-30.21675-(-35)));
            yy = 0 + (((tickAnim - 3) / 2) * (8.48916-(0)));
            zz = 0 + (((tickAnim - 3) / 2) * (-5.86282-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 8) {
            xx = -30.21675 + (((tickAnim - 5) / 3) * (-9.31466-(-30.21675)));
            yy = 8.48916 + (((tickAnim - 5) / 3) * (12.47443-(8.48916)));
            zz = -5.86282 + (((tickAnim - 5) / 3) * (0.25839-(-5.86282)));
        }
        else if (tickAnim >= 8 && tickAnim < 10) {
            xx = -9.31466 + (((tickAnim - 8) / 2) * (29.25118-(-9.31466)));
            yy = 12.47443 + (((tickAnim - 8) / 2) * (9.57892-(12.47443)));
            zz = 0.25839 + (((tickAnim - 8) / 2) * (10.40372-(0.25839)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftthigh, leftthigh.rotateAngleX + (float) Math.toRadians(xx), leftthigh.rotateAngleY + (float) Math.toRadians(yy), leftthigh.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 36.25 + (((tickAnim - 0) / 3) * (60-(36.25)));
            yy = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 3) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 4) {
            xx = 60 + (((tickAnim - 3) / 1) * (-5.83-(60)));
            yy = 0 + (((tickAnim - 3) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 3) / 1) * (0-(0)));
        }
        else if (tickAnim >= 4 && tickAnim < 5) {
            xx = -5.83 + (((tickAnim - 4) / 1) * (-23.75-(-5.83)));
            yy = 0 + (((tickAnim - 4) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 4) / 1) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 6) {
            xx = -23.75 + (((tickAnim - 5) / 1) * (-1.67-(-23.75)));
            yy = 0 + (((tickAnim - 5) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 5) / 1) * (0-(0)));
        }
        else if (tickAnim >= 6 && tickAnim < 7) {
            xx = -1.67 + (((tickAnim - 6) / 1) * (14.16-(-1.67)));
            yy = 0 + (((tickAnim - 6) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 6) / 1) * (0-(0)));
        }
        else if (tickAnim >= 7 && tickAnim < 8) {
            xx = 14.16 + (((tickAnim - 7) / 1) * (20-(14.16)));
            yy = 0 + (((tickAnim - 7) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 7) / 1) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 10) {
            xx = 20 + (((tickAnim - 8) / 2) * (36.25-(20)));
            yy = 0 + (((tickAnim - 8) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 2) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftshin, leftshin.rotateAngleX + (float) Math.toRadians(xx), leftshin.rotateAngleY + (float) Math.toRadians(yy), leftshin.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 2) {
            xx = 15.04725 + (((tickAnim - 0) / 2) * (21.68-(15.04725)));
            yy = 0 + (((tickAnim - 0) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 2) * (0-(0)));
        }
        else if (tickAnim >= 2 && tickAnim < 3) {
            xx = 21.68 + (((tickAnim - 2) / 1) * (-42.5-(21.68)));
            yy = 0 + (((tickAnim - 2) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 2) / 1) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 3) {
            xx = -42.5 + (((tickAnim - 3) / 0) * (-34.15-(-42.5)));
            yy = 0 + (((tickAnim - 3) / 0) * (0-(0)));
            zz = 0 + (((tickAnim - 3) / 0) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 5) {
            xx = -34.15 + (((tickAnim - 3) / 2) * (12.54725-(-34.15)));
            yy = 0 + (((tickAnim - 3) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 3) / 2) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 6) {
            xx = 12.54725 + (((tickAnim - 5) / 1) * (-23.27033-(12.54725)));
            yy = 0 + (((tickAnim - 5) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 5) / 1) * (0-(0)));
        }
        else if (tickAnim >= 6 && tickAnim < 7) {
            xx = -23.27033 + (((tickAnim - 6) / 1) * (-25.34-(-23.27033)));
            yy = 0 + (((tickAnim - 6) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 6) / 1) * (0-(0)));
        }
        else if (tickAnim >= 7 && tickAnim < 8) {
            xx = -25.34 + (((tickAnim - 7) / 1) * (2.5945-(-25.34)));
            yy = 0 + (((tickAnim - 7) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 7) / 1) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 9) {
            xx = 2.5945 + (((tickAnim - 8) / 1) * (33.4-(2.5945)));
            yy = 0 + (((tickAnim - 8) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 1) * (0-(0)));
        }
        else if (tickAnim >= 9 && tickAnim < 10) {
            xx = 33.4 + (((tickAnim - 9) / 1) * (15.04725-(33.4)));
            yy = 0 + (((tickAnim - 9) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 9) / 1) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftankle, leftankle.rotateAngleX + (float) Math.toRadians(xx), leftankle.rotateAngleY + (float) Math.toRadians(yy), leftankle.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 46.25 + (((tickAnim - 0) / 3) * (110-(46.25)));
            yy = -0.02 + (((tickAnim - 0) / 3) * (0-(-0.02)));
            zz = -2.5 + (((tickAnim - 0) / 3) * (0-(-2.5)));
        }
        else if (tickAnim >= 3 && tickAnim < 4) {
            xx = 110 + (((tickAnim - 3) / 1) * (44.10141-(110)));
            yy = 0 + (((tickAnim - 3) / 1) * (-2.84805-(0)));
            zz = 0 + (((tickAnim - 3) / 1) * (0.09067-(0)));
        }
        else if (tickAnim >= 4 && tickAnim < 5) {
            xx = 44.10141 + (((tickAnim - 4) / 1) * (38.52094-(44.10141)));
            yy = -2.84805 + (((tickAnim - 4) / 1) * (-6.33463-(-2.84805)));
            zz = 0.09067 + (((tickAnim - 4) / 1) * (1.55491-(0.09067)));
        }
        else if (tickAnim >= 5 && tickAnim < 6) {
            xx = 38.52094 + (((tickAnim - 5) / 1) * (44.85373-(38.52094)));
            yy = -6.33463 + (((tickAnim - 5) / 1) * (-5.06786-(-6.33463)));
            zz = 1.55491 + (((tickAnim - 5) / 1) * (-0.39544-(1.55491)));
        }
        else if (tickAnim >= 6 && tickAnim < 7) {
            xx = 44.85373 + (((tickAnim - 6) / 1) * (23.51421-(44.85373)));
            yy = -5.06786 + (((tickAnim - 6) / 1) * (-4.70923-(-5.06786)));
            zz = -0.39544 + (((tickAnim - 6) / 1) * (0.51254-(-0.39544)));
        }
        else if (tickAnim >= 7 && tickAnim < 8) {
            xx = 23.51421 + (((tickAnim - 7) / 1) * (-17.5-(23.51421)));
            yy = -4.70923 + (((tickAnim - 7) / 1) * (0-(-4.70923)));
            zz = 0.51254 + (((tickAnim - 7) / 1) * (0-(0.51254)));
        }
        else if (tickAnim >= 8 && tickAnim < 8) {
            xx = -17.5 + (((tickAnim - 8) / 0) * (-21.24863-(-17.5)));
            yy = 0 + (((tickAnim - 8) / 0) * (0.04058-(0)));
            zz = 0 + (((tickAnim - 8) / 0) * (-1.6677-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 9) {
            xx = -21.24863 + (((tickAnim - 8) / 1) * (38.75063-(-21.24863)));
            yy = 0.04058 + (((tickAnim - 8) / 1) * (-0.02786-(0.04058)));
            zz = -1.6677 + (((tickAnim - 8) / 1) * (-3.33327-(-1.6677)));
        }
        else if (tickAnim >= 9 && tickAnim < 10) {
            xx = 38.75063 + (((tickAnim - 9) / 1) * (46.25-(38.75063)));
            yy = -0.02786 + (((tickAnim - 9) / 1) * (-0.02-(-0.02786)));
            zz = -3.33327 + (((tickAnim - 9) / 1) * (-2.5-(-3.33327)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftfoot, leftfoot.rotateAngleX + (float) Math.toRadians(xx), leftfoot.rotateAngleY + (float) Math.toRadians(yy), leftfoot.rotateAngleZ + (float) Math.toRadians(zz));


    }

        public void animate(IAnimatedEntity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        EntityPrehistoricFloraAnchisaurus e = (EntityPrehistoricFloraAnchisaurus) entity;
        animator.update(entity);

        animator.setAnimation(e.ROAR_ANIMATION); //40 ticks
        animator.startKeyframe(10);
        animator.rotate(this.neckbase, (float) Math.toRadians(-5), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(this.neckmiddlebase, (float) Math.toRadians(-5), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(this.neckmiddlefront, (float) Math.toRadians(-10), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(this.neckfront, (float) Math.toRadians(-10), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(this.head, (float) Math.toRadians(30), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(this.lowerjawbase, (float) Math.toRadians(20), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.endKeyframe();
        animator.setStaticKeyframe(10);
        animator.resetKeyframe(20);

    }
}
