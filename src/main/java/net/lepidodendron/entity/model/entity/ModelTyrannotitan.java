package net.lepidodendron.entity.model.entity;

import net.ilexiconn.llibrary.client.model.ModelAnimator;
import net.ilexiconn.llibrary.client.model.tools.AdvancedModelRenderer;
import net.ilexiconn.llibrary.server.animation.IAnimatedEntity;
import net.lepidodendron.entity.EntityPrehistoricFloraTyrannotitan;
import net.lepidodendron.entity.model.ModelBasePalaeopedia;
import net.minecraft.client.model.ModelBox;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;

public class ModelTyrannotitan extends ModelBasePalaeopedia {

    private final AdvancedModelRenderer root;
    private final AdvancedModelRenderer hips;
    private final AdvancedModelRenderer bodymiddle;
    private final AdvancedModelRenderer bodyfront;
    private final AdvancedModelRenderer neckbase;
    private final AdvancedModelRenderer neckmiddlebase;
    private final AdvancedModelRenderer neckmiddleend;
    private final AdvancedModelRenderer neckend;
    private final AdvancedModelRenderer head;
    private final AdvancedModelRenderer upperjawbase;
    private final AdvancedModelRenderer upperjawmiddle;
    private final AdvancedModelRenderer upperjawfront;
    private final AdvancedModelRenderer nose;
    private final AdvancedModelRenderer lupperteethfront;
    private final AdvancedModelRenderer rupperteethfront;
    private final AdvancedModelRenderer upperfrontteeth;
    private final AdvancedModelRenderer nasalridgebase;
    private final AdvancedModelRenderer lupperteethmidfront;
    private final AdvancedModelRenderer rupperteethmidfront;
    private final AdvancedModelRenderer rightnasalridgebase;
    private final AdvancedModelRenderer rightnasalridgeend;
    private final AdvancedModelRenderer leftnasalridgebase;
    private final AdvancedModelRenderer leftnasalridgeend;
    private final AdvancedModelRenderer lupperteethmidback;
    private final AdvancedModelRenderer rupperteethmidback;
    private final AdvancedModelRenderer lowerjawback;
    private final AdvancedModelRenderer lowerjawmiddleback;
    private final AdvancedModelRenderer lowerjawmiddle;
    private final AdvancedModelRenderer lowerjawmiddlefront;
    private final AdvancedModelRenderer lowerjawend;
    private final AdvancedModelRenderer chin;
    private final AdvancedModelRenderer llowerteethfront;
    private final AdvancedModelRenderer rlowerteethfront;
    private final AdvancedModelRenderer lowerfrontteeth;
    private final AdvancedModelRenderer llowerteethmidfront;
    private final AdvancedModelRenderer rlowerteethmidfront;
    private final AdvancedModelRenderer lowerjawmiddleslope;
    private final AdvancedModelRenderer llowerteethmidback;
    private final AdvancedModelRenderer rlowerteethmidback;
    private final AdvancedModelRenderer llowerteethback;
    private final AdvancedModelRenderer rlowerteethback;
    private final AdvancedModelRenderer leftjawflank;
    private final AdvancedModelRenderer rightjawflank;
    private final AdvancedModelRenderer masseter;
    private final AdvancedModelRenderer throatpouchsegment1;
    private final AdvancedModelRenderer throatpouchsegment2;
    private final AdvancedModelRenderer rightheadflank;
    private final AdvancedModelRenderer rightlacrimalcrest;
    private final AdvancedModelRenderer rightlacrimalfront;
    private final AdvancedModelRenderer rightlacrimalback;
    private final AdvancedModelRenderer rupperteethback;
    private final AdvancedModelRenderer leftheadflank;
    private final AdvancedModelRenderer leftlacrimalcrest;
    private final AdvancedModelRenderer leftlacrimalfront;
    private final AdvancedModelRenderer leftlacrimalback;
    private final AdvancedModelRenderer lupperteethback;
    private final AdvancedModelRenderer neckendridgea;
    private final AdvancedModelRenderer neckendridgeb;
    private final AdvancedModelRenderer throatpouchsegment4;
    private final AdvancedModelRenderer throatpouchsegment3;
    private final AdvancedModelRenderer neckmiddleendridge;
    private final AdvancedModelRenderer neckmiddlebaseridge;
    private final AdvancedModelRenderer neckmiddlebaseslope;
    private final AdvancedModelRenderer neckbaseridge;
    private final AdvancedModelRenderer neckbaseflesh;
    private final AdvancedModelRenderer bodyfrontridge;
    private final AdvancedModelRenderer chestslope;
    private final AdvancedModelRenderer rightupperarm;
    private final AdvancedModelRenderer rightlowerarm;
    private final AdvancedModelRenderer righthand;
    private final AdvancedModelRenderer leftupperarm;
    private final AdvancedModelRenderer leftlowerarm;
    private final AdvancedModelRenderer lefthand;
    private final AdvancedModelRenderer bodymiddleridge;
    private final AdvancedModelRenderer bellyslope;
    private final AdvancedModelRenderer tail1;
    private final AdvancedModelRenderer tail2;
    private final AdvancedModelRenderer tail3;
    private final AdvancedModelRenderer tail4;
    private final AdvancedModelRenderer tail5;
    private final AdvancedModelRenderer tail6;
    private final AdvancedModelRenderer tail7;
    private final AdvancedModelRenderer tailridge2;
    private final AdvancedModelRenderer tailridge1a;
    private final AdvancedModelRenderer tailridge1b;
    private final AdvancedModelRenderer hipridge1;
    private final AdvancedModelRenderer hipridge2;
    private final AdvancedModelRenderer hipridge3;
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

    public ModelTyrannotitan() {
        this.textureWidth = 240;
        this.textureHeight = 240;

        this.root = new AdvancedModelRenderer(this);
        this.root.setRotationPoint(0.0F, 0.0F, 0.0F);


        this.hips = new AdvancedModelRenderer(this);
        this.hips.setRotationPoint(0.0F, -22.91F, 2.0F);
        this.root.addChild(hips);
        this.setRotateAngle(hips, 0.0424F, 0.0F, 0.0F);
        this.hips.cubeList.add(new ModelBox(hips, 0, 187, -8.0F, -8.0F, -13.0F, 16, 27, 25, 0.0F, true));

        this.bodymiddle = new AdvancedModelRenderer(this);
        this.bodymiddle.setRotationPoint(0.0F, -2.4F, -10.3F);
        this.hips.addChild(bodymiddle);
        this.setRotateAngle(bodymiddle, -0.0637F, 0.0F, 0.0F);
        this.bodymiddle.cubeList.add(new ModelBox(bodymiddle, 0, 141, -10.0F, -5.5F, -20.5F, 20, 24, 21, 0.0F, true));

        this.bodyfront = new AdvancedModelRenderer(this);
        this.bodyfront.setRotationPoint(0.0F, 0.1F, -19.5F);
        this.bodymiddle.addChild(bodyfront);
        this.setRotateAngle(bodyfront, 0.0424F, 0.0F, 0.0F);
        this.bodyfront.cubeList.add(new ModelBox(bodyfront, 0, 107, -8.5F, -5.5F, -11.5F, 17, 21, 12, 0.0F, true));

        this.neckbase = new AdvancedModelRenderer(this);
        this.neckbase.setRotationPoint(0.0F, 0.5F, -11.5F);
        this.bodyfront.addChild(neckbase);
        this.setRotateAngle(neckbase, -0.2972F, 0.0F, 0.0F);
        this.neckbase.cubeList.add(new ModelBox(neckbase, 100, 94, -5.5F, -5.5F, -8.0F, 11, 17, 9, 0.0F, true));

        this.neckmiddlebase = new AdvancedModelRenderer(this);
        this.neckmiddlebase.setRotationPoint(0.0F, -0.4F, -8.0F);
        this.neckbase.addChild(neckmiddlebase);
        this.setRotateAngle(neckmiddlebase, -0.1274F, 0.0F, 0.0F);
        this.neckmiddlebase.cubeList.add(new ModelBox(neckmiddlebase, 116, 121, -4.5F, -5.0F, -5.5F, 9, 16, 7, 0.0F, true));

        this.neckmiddleend = new AdvancedModelRenderer(this);
        this.neckmiddleend.setRotationPoint(-0.01F, -0.4F, -4.7F);
        this.neckmiddlebase.addChild(neckmiddleend);
        this.setRotateAngle(neckmiddleend, 0.1911F, 0.0F, 0.0F);
        this.neckmiddleend.cubeList.add(new ModelBox(neckmiddleend, 132, 170, -4.5F, -4.5F, -6.5F, 9, 16, 7, 0.0F, true));

        this.neckend = new AdvancedModelRenderer(this);
        this.neckend.setRotationPoint(0.0F, -0.4F, -5.5F);
        this.neckmiddleend.addChild(neckend);
        this.setRotateAngle(neckend, 0.4033F, 0.0F, 0.0F);
        this.neckend.cubeList.add(new ModelBox(neckend, 132, 145, -5.0F, -4.0F, -7.0F, 10, 16, 8, 0.0F, true));

        this.head = new AdvancedModelRenderer(this);
        this.head.setRotationPoint(0.0F, 0.5F, -4.0F);
        this.neckend.addChild(head);
        this.setRotateAngle(head, 0.0637F, 0.0F, 0.0F);
        this.head.cubeList.add(new ModelBox(head, 169, 0, -5.5F, -3.5F, -3.5F, 11, 9, 6, 0.0F, true));

        this.upperjawbase = new AdvancedModelRenderer(this);
        this.upperjawbase.setRotationPoint(0.0F, -2.8F, -7.4F);
        this.head.addChild(upperjawbase);
        this.setRotateAngle(upperjawbase, 0.2546F, 0.0F, 0.0F);
        this.upperjawbase.cubeList.add(new ModelBox(upperjawbase, 141, 16, -3.0F, 0.0F, -10.0F, 6, 8, 14, 0.0F, true));

        this.upperjawmiddle = new AdvancedModelRenderer(this);
        this.upperjawmiddle.setRotationPoint(0.0F, 8.0F, -10.0F);
        this.upperjawbase.addChild(upperjawmiddle);
        this.setRotateAngle(upperjawmiddle, -0.2546F, 0.0F, 0.0F);
        this.upperjawmiddle.cubeList.add(new ModelBox(upperjawmiddle, 199, 47, -2.5F, -6.0F, -4.0F, 5, 6, 4, 0.0F, true));

        this.upperjawfront = new AdvancedModelRenderer(this);
        this.upperjawfront.setRotationPoint(0.0F, 0.0F, -4.0F);
        this.upperjawmiddle.addChild(upperjawfront);
        this.setRotateAngle(upperjawfront, -0.1061F, 0.0F, 0.0F);
        this.upperjawfront.cubeList.add(new ModelBox(upperjawfront, 218, 51, -2.0F, -3.0F, -3.0F, 4, 3, 3, 0.0F, true));

        this.nose = new AdvancedModelRenderer(this);
        this.nose.setRotationPoint(-0.01F, -3.0F, -3.0F);
        this.upperjawfront.addChild(nose);
        this.setRotateAngle(nose, -0.672F, 0.0F, 0.0F);
        this.nose.cubeList.add(new ModelBox(nose, 205, 58, -2.0F, -4.0F, 0.0F, 4, 4, 3, 0.0F, true));

        this.lupperteethfront = new AdvancedModelRenderer(this);
        this.lupperteethfront.setRotationPoint(-1.7F, -0.55F, -1.2F);
        this.upperjawfront.addChild(lupperteethfront);
        this.setRotateAngle(lupperteethfront, 0.2759F, -0.1061F, 0.0F);
        this.lupperteethfront.cubeList.add(new ModelBox(lupperteethfront, 11, 8, 0.0F, 0.0F, -1.0F, 0, 1, 2, 0.0F, true));

        this.rupperteethfront = new AdvancedModelRenderer(this);
        this.rupperteethfront.setRotationPoint(1.7F, -0.55F, -1.2F);
        this.upperjawfront.addChild(rupperteethfront);
        this.setRotateAngle(rupperteethfront, 0.2759F, 0.1061F, 0.0F);
        this.rupperteethfront.cubeList.add(new ModelBox(rupperteethfront, 11, 6, 0.0F, 0.0F, -1.0F, 0, 1, 2, 0.0F, true));

        this.upperfrontteeth = new AdvancedModelRenderer(this);
        this.upperfrontteeth.setRotationPoint(0.0F, -0.3F, -2.7F);
        this.upperjawfront.addChild(upperfrontteeth);
        this.setRotateAngle(upperfrontteeth, 0.3821F, 0.0F, 0.0F);
        this.upperfrontteeth.cubeList.add(new ModelBox(upperfrontteeth, 31, 0, -1.5F, 0.0F, 0.0F, 3, 1, 1, 0.0F, true));

        this.nasalridgebase = new AdvancedModelRenderer(this);
        this.nasalridgebase.setRotationPoint(-0.01F, -6.0F, -4.0F);
        this.upperjawmiddle.addChild(nasalridgebase);
        this.setRotateAngle(nasalridgebase, -0.658F, 0.0F, 0.0F);
        this.nasalridgebase.cubeList.add(new ModelBox(nasalridgebase, 188, 98, -2.5F, -3.0F, 0.0F, 5, 3, 3, 0.0F, true));

        this.lupperteethmidfront = new AdvancedModelRenderer(this);
        this.lupperteethmidfront.setRotationPoint(-2.05F, -0.4F, -1.9F);
        this.upperjawmiddle.addChild(lupperteethmidfront);
        this.setRotateAngle(lupperteethmidfront, -0.1698F, -0.1061F, 0.0F);
        this.lupperteethmidfront.cubeList.add(new ModelBox(lupperteethmidfront, 34, 0, 0.0F, -1.0F, -1.5F, 0, 2, 3, 0.0F, true));

        this.rupperteethmidfront = new AdvancedModelRenderer(this);
        this.rupperteethmidfront.setRotationPoint(2.05F, -0.4F, -1.9F);
        this.upperjawmiddle.addChild(rupperteethmidfront);
        this.setRotateAngle(rupperteethmidfront, -0.1698F, 0.1061F, 0.0F);
        this.rupperteethmidfront.cubeList.add(new ModelBox(rupperteethmidfront, 34, 9, 0.0F, -1.0F, -1.5F, 0, 2, 3, 0.0F, true));

        this.rightnasalridgebase = new AdvancedModelRenderer(this);
        this.rightnasalridgebase.setRotationPoint(2.25F, -0.6F, -10.1F);
        this.upperjawbase.addChild(rightnasalridgebase);
        this.setRotateAngle(rightnasalridgebase, 0.1911F, 0.0213F, -0.0424F);
        this.rightnasalridgebase.cubeList.add(new ModelBox(rightnasalridgebase, 204, 66, -3.0F, 0.0F, 0.0F, 3, 3, 7, 0.0F, true));

        this.rightnasalridgeend = new AdvancedModelRenderer(this);
        this.rightnasalridgeend.setRotationPoint(-1.6F, 1.2F, 5.9F);
        this.rightnasalridgebase.addChild(rightnasalridgeend);
        this.setRotateAngle(rightnasalridgeend, -0.4882F, 0.3183F, -0.0848F);
        this.rightnasalridgeend.cubeList.add(new ModelBox(rightnasalridgeend, 173, 30, -1.5F, -1.5F, 0.0F, 3, 3, 9, 0.0F, true));

        this.leftnasalridgebase = new AdvancedModelRenderer(this);
        this.leftnasalridgebase.setRotationPoint(-2.25F, -0.6F, -10.1F);
        this.upperjawbase.addChild(leftnasalridgebase);
        this.setRotateAngle(leftnasalridgebase, 0.1911F, -0.0213F, 0.0424F);
        this.leftnasalridgebase.cubeList.add(new ModelBox(leftnasalridgebase, 218, 59, 0.0F, 0.0F, 0.0F, 3, 3, 7, 0.0F, true));

        this.leftnasalridgeend = new AdvancedModelRenderer(this);
        this.leftnasalridgeend.setRotationPoint(1.6F, 1.2F, 5.9F);
        this.leftnasalridgebase.addChild(leftnasalridgeend);
        this.setRotateAngle(leftnasalridgeend, -0.4882F, -0.3183F, 0.0848F);
        this.leftnasalridgeend.cubeList.add(new ModelBox(leftnasalridgeend, 192, 34, -1.5F, -1.5F, 0.0F, 3, 3, 9, 0.0F, true));

        this.lupperteethmidback = new AdvancedModelRenderer(this);
        this.lupperteethmidback.setRotationPoint(-2.4F, 8.0F, -7.2F);
        this.upperjawbase.addChild(lupperteethmidback);
        this.setRotateAngle(lupperteethmidback, 0.0F, -0.0424F, 0.0F);
        this.lupperteethmidback.cubeList.add(new ModelBox(lupperteethmidback, 30, 1, 0.0F, -1.0F, -2.5F, 0, 2, 5, 0.0F, true));

        this.rupperteethmidback = new AdvancedModelRenderer(this);
        this.rupperteethmidback.setRotationPoint(2.4F, 8.0F, -7.2F);
        this.upperjawbase.addChild(rupperteethmidback);
        this.setRotateAngle(rupperteethmidback, 0.0F, 0.0424F, 0.0F);
        this.rupperteethmidback.cubeList.add(new ModelBox(rupperteethmidback, 30, 4, 0.0F, -1.0F, -2.5F, 0, 2, 5, 0.0F, true));

        this.lowerjawback = new AdvancedModelRenderer(this);
        this.lowerjawback.setRotationPoint(0.0F, 5.5F, 2.5F);
        this.head.addChild(lowerjawback);
        this.lowerjawback.cubeList.add(new ModelBox(lowerjawback, 204, 0, -5.5F, 0.0F, -6.0F, 11, 7, 7, 0.0F, true));

        this.lowerjawmiddleback = new AdvancedModelRenderer(this);
        this.lowerjawmiddleback.setRotationPoint(0.0F, 0.3F, -9.8F);
        this.lowerjawback.addChild(lowerjawmiddleback);
        this.setRotateAngle(lowerjawmiddleback, 0.1061F, 0.0F, 0.0F);
        this.lowerjawmiddleback.cubeList.add(new ModelBox(lowerjawmiddleback, 31, 16, -3.0F, 0.0F, -4.0F, 6, 4, 8, 0.0F, true));

        this.lowerjawmiddle = new AdvancedModelRenderer(this);
        this.lowerjawmiddle.setRotationPoint(-0.01F, 0.0F, -4.0F);
        this.lowerjawmiddleback.addChild(lowerjawmiddle);
        this.setRotateAngle(lowerjawmiddle, 0.1911F, 0.0F, 0.0F);
        this.lowerjawmiddle.cubeList.add(new ModelBox(lowerjawmiddle, 220, 88, -3.0F, 0.0F, -4.0F, 6, 3, 4, 0.0F, true));

        this.lowerjawmiddlefront = new AdvancedModelRenderer(this);
        this.lowerjawmiddlefront.setRotationPoint(0.0F, 3.0F, -4.0F);
        this.lowerjawmiddle.addChild(lowerjawmiddlefront);
        this.setRotateAngle(lowerjawmiddlefront, -0.2546F, 0.0F, 0.0F);
        this.lowerjawmiddlefront.cubeList.add(new ModelBox(lowerjawmiddlefront, 190, 89, -2.5F, -3.0F, -4.0F, 5, 3, 4, 0.0F, true));

        this.lowerjawend = new AdvancedModelRenderer(this);
        this.lowerjawend.setRotationPoint(0.0F, 0.0F, -3.9F);
        this.lowerjawmiddlefront.addChild(lowerjawend);
        this.setRotateAngle(lowerjawend, -0.1274F, 0.0F, 0.0F);
        this.lowerjawend.cubeList.add(new ModelBox(lowerjawend, 175, 101, -2.0F, -3.0F, -4.0F, 4, 3, 4, 0.0F, true));

        this.chin = new AdvancedModelRenderer(this);
        this.chin.setRotationPoint(-0.01F, 0.2F, 0.12F);
        this.lowerjawend.addChild(chin);
        this.setRotateAngle(chin, 0.1485F, 0.0F, 0.0F);
        this.chin.cubeList.add(new ModelBox(chin, 194, 79, -2.0F, -1.0F, -4.0F, 4, 1, 8, 0.0F, true));

        this.llowerteethfront = new AdvancedModelRenderer(this);
        this.llowerteethfront.setRotationPoint(-1.3F, -3.0F, -2.1F);
        this.lowerjawend.addChild(llowerteethfront);
        this.setRotateAngle(llowerteethfront, 0.1698F, -0.1698F, 0.0F);
        this.llowerteethfront.cubeList.add(new ModelBox(llowerteethfront, 24, 4, 0.0F, -1.0F, -1.0F, 0, 2, 2, 0.0F, true));

        this.rlowerteethfront = new AdvancedModelRenderer(this);
        this.rlowerteethfront.setRotationPoint(1.3F, -3.0F, -2.1F);
        this.lowerjawend.addChild(rlowerteethfront);
        this.setRotateAngle(rlowerteethfront, 0.1698F, 0.1698F, 0.0F);
        this.rlowerteethfront.cubeList.add(new ModelBox(rlowerteethfront, 22, 1, 0.0F, -1.0F, -1.0F, 0, 2, 2, 0.0F, true));

        this.lowerfrontteeth = new AdvancedModelRenderer(this);
        this.lowerfrontteeth.setRotationPoint(0.0F, -2.7F, -3.4F);
        this.lowerjawend.addChild(lowerfrontteeth);
        this.setRotateAngle(lowerfrontteeth, 0.0213F, 0.0F, 0.0F);
        this.lowerfrontteeth.cubeList.add(new ModelBox(lowerfrontteeth, 26, 1, -1.0F, -1.0F, 0.0F, 2, 1, 0, 0.0F, true));

        this.llowerteethmidfront = new AdvancedModelRenderer(this);
        this.llowerteethmidfront.setRotationPoint(-1.8F, -3.1F, -2.4F);
        this.lowerjawmiddlefront.addChild(llowerteethmidfront);
        this.setRotateAngle(llowerteethmidfront, -0.1274F, -0.1061F, 0.0F);
        this.llowerteethmidfront.cubeList.add(new ModelBox(llowerteethmidfront, 27, 9, 0.0F, -1.0F, -1.5F, 0, 2, 3, 0.0F, true));

        this.rlowerteethmidfront = new AdvancedModelRenderer(this);
        this.rlowerteethmidfront.setRotationPoint(1.8F, -3.1F, -2.4F);
        this.lowerjawmiddlefront.addChild(rlowerteethmidfront);
        this.setRotateAngle(rlowerteethmidfront, -0.1274F, 0.1061F, 0.0F);
        this.rlowerteethmidfront.cubeList.add(new ModelBox(rlowerteethmidfront, 20, 9, 0.0F, -1.0F, -1.5F, 0, 2, 3, 0.0F, true));

        this.lowerjawmiddleslope = new AdvancedModelRenderer(this);
        this.lowerjawmiddleslope.setRotationPoint(0.02F, 3.0F, -4.5F);
        this.lowerjawmiddle.addChild(lowerjawmiddleslope);
        this.setRotateAngle(lowerjawmiddleslope, -0.4705F, 0.0F, 0.0F);
        this.lowerjawmiddleslope.cubeList.add(new ModelBox(lowerjawmiddleslope, 132, 0, -3.0F, -3.0F, 0.0F, 6, 3, 12, 0.0F, true));

        this.llowerteethmidback = new AdvancedModelRenderer(this);
        this.llowerteethmidback.setRotationPoint(-2.2F, 0.2F, -1.7F);
        this.lowerjawmiddle.addChild(llowerteethmidback);
        this.setRotateAngle(llowerteethmidback, -0.1698F, -0.0848F, 0.0F);
        this.llowerteethmidback.cubeList.add(new ModelBox(llowerteethmidback, 23, 6, 0.0F, -1.0F, -1.5F, 0, 2, 3, 0.0F, true));

        this.rlowerteethmidback = new AdvancedModelRenderer(this);
        this.rlowerteethmidback.setRotationPoint(2.2F, 0.2F, -1.7F);
        this.lowerjawmiddle.addChild(rlowerteethmidback);
        this.setRotateAngle(rlowerteethmidback, -0.1698F, 0.0848F, 0.0F);
        this.rlowerteethmidback.cubeList.add(new ModelBox(rlowerteethmidback, 27, 0, 0.0F, -1.0F, -1.5F, 0, 2, 3, 0.0F, true));

        this.llowerteethback = new AdvancedModelRenderer(this);
        this.llowerteethback.setRotationPoint(-2.45F, 0.7F, -2.5F);
        this.lowerjawmiddleback.addChild(llowerteethback);
        this.setRotateAngle(llowerteethback, -0.1274F, -0.0637F, 0.0F);
        this.llowerteethback.cubeList.add(new ModelBox(llowerteethback, 11, 4, 0.0F, -1.0F, -1.0F, 0, 1, 2, 0.0F, true));

        this.rlowerteethback = new AdvancedModelRenderer(this);
        this.rlowerteethback.setRotationPoint(2.45F, 0.7F, -2.5F);
        this.lowerjawmiddleback.addChild(rlowerteethback);
        this.setRotateAngle(rlowerteethback, -0.1274F, 0.0637F, 0.0F);
        this.rlowerteethback.cubeList.add(new ModelBox(rlowerteethback, 11, 2, 0.0F, -1.0F, -1.0F, 0, 1, 2, 0.0F, true));

        this.leftjawflank = new AdvancedModelRenderer(this);
        this.leftjawflank.setRotationPoint(-5.27F, 2.5F, -5.7F);
        this.lowerjawback.addChild(leftjawflank);
        this.setRotateAngle(leftjawflank, 0.0848F, -0.4033F, 0.0F);
        this.leftjawflank.cubeList.add(new ModelBox(leftjawflank, 208, 24, 0.0F, -2.5F, -7.0F, 3, 5, 7, 0.0F, true));

        this.rightjawflank = new AdvancedModelRenderer(this);
        this.rightjawflank.setRotationPoint(5.27F, 2.5F, -5.7F);
        this.lowerjawback.addChild(rightjawflank);
        this.setRotateAngle(rightjawflank, 0.0848F, 0.4033F, 0.0F);
        this.rightjawflank.cubeList.add(new ModelBox(rightjawflank, 217, 37, -3.0F, -2.5F, -7.0F, 3, 5, 7, 0.0F, true));

        this.masseter = new AdvancedModelRenderer(this);
        this.masseter.setRotationPoint(0.0F, 0.0F, -7.0F);
        this.lowerjawback.addChild(masseter);
        this.setRotateAngle(masseter, -0.4033F, 0.0F, 0.0F);
        this.masseter.cubeList.add(new ModelBox(masseter, 182, 16, -4.5F, -7.0F, 0.0F, 9, 7, 7, 0.0F, true));

        this.throatpouchsegment1 = new AdvancedModelRenderer(this);
        this.throatpouchsegment1.setRotationPoint(0.0F, 5.1F, -9.5F);
        this.lowerjawback.addChild(throatpouchsegment1);
        this.setRotateAngle(throatpouchsegment1, -0.5095F, 0.0F, 0.0F);
        this.throatpouchsegment1.cubeList.add(new ModelBox(throatpouchsegment1, 171, 44, -3.5F, -4.0F, 0.0F, 7, 4, 6, 0.0F, true));

        this.throatpouchsegment2 = new AdvancedModelRenderer(this);
        this.throatpouchsegment2.setRotationPoint(-0.01F, 0.0F, 6.0F);
        this.throatpouchsegment1.addChild(throatpouchsegment2);
        this.setRotateAngle(throatpouchsegment2, 0.743F, 0.0F, 0.0F);
        this.throatpouchsegment2.cubeList.add(new ModelBox(throatpouchsegment2, 178, 56, -3.5F, -5.0F, 0.0F, 7, 5, 6, 0.0F, true));

        this.rightheadflank = new AdvancedModelRenderer(this);
        this.rightheadflank.setRotationPoint(5.33F, 1.0F, -3.1F);
        this.head.addChild(rightheadflank);
        this.setRotateAngle(rightheadflank, 0.0848F, 0.3821F, 0.0F);
        this.rightheadflank.cubeList.add(new ModelBox(rightheadflank, 78, 0, -5.0F, -3.5F, -8.0F, 5, 8, 8, 0.0F, true));

        this.rightlacrimalcrest = new AdvancedModelRenderer(this);
        this.rightlacrimalcrest.setRotationPoint(-2.12F, 0.6F, -3.2F);
        this.rightheadflank.addChild(rightlacrimalcrest);
        this.setRotateAngle(rightlacrimalcrest, -0.2972F, -0.0637F, 0.1061F);
        this.rightlacrimalcrest.cubeList.add(new ModelBox(rightlacrimalcrest, 230, 70, -1.0F, -7.0F, -1.0F, 3, 8, 2, 0.0F, true));

        this.rightlacrimalfront = new AdvancedModelRenderer(this);
        this.rightlacrimalfront.setRotationPoint(0.45F, -7.0F, -0.95F);
        this.rightlacrimalcrest.addChild(rightlacrimalfront);
        this.setRotateAngle(rightlacrimalfront, 0.6369F, 0.0213F, 0.0F);
        this.rightlacrimalfront.cubeList.add(new ModelBox(rightlacrimalfront, 205, 93, -1.5F, 0.0F, -4.0F, 3, 2, 4, 0.0F, true));

        this.rightlacrimalback = new AdvancedModelRenderer(this);
        this.rightlacrimalback.setRotationPoint(0.5F, -6.4F, 0.5F);
        this.rightlacrimalcrest.addChild(rightlacrimalback);
        this.setRotateAngle(rightlacrimalback, -0.0213F, -0.3396F, -0.1061F);
        this.rightlacrimalback.cubeList.add(new ModelBox(rightlacrimalback, 205, 100, -1.5F, 0.0F, 0.0F, 3, 1, 3, 0.0F, true));

        this.rupperteethback = new AdvancedModelRenderer(this);
        this.rupperteethback.setRotationPoint(-0.4F, 4.1F, -5.4F);
        this.rightheadflank.addChild(rupperteethback);
        this.setRotateAngle(rupperteethback, 0.0637F, -0.1274F, 0.0F);
        this.rupperteethback.cubeList.add(new ModelBox(rupperteethback, 16, 3, 0.0F, 0.0F, -1.5F, 0, 1, 3, 0.0F, true));

        this.leftheadflank = new AdvancedModelRenderer(this);
        this.leftheadflank.setRotationPoint(-5.33F, 1.0F, -3.1F);
        this.head.addChild(leftheadflank);
        this.setRotateAngle(leftheadflank, 0.0848F, -0.3821F, 0.0F);
        this.leftheadflank.cubeList.add(new ModelBox(leftheadflank, 105, 0, 0.0F, -3.5F, -8.0F, 5, 8, 8, 0.0F, true));

        this.leftlacrimalcrest = new AdvancedModelRenderer(this);
        this.leftlacrimalcrest.setRotationPoint(2.12F, 0.6F, -3.2F);
        this.leftheadflank.addChild(leftlacrimalcrest);
        this.setRotateAngle(leftlacrimalcrest, -0.2972F, 0.0637F, -0.1061F);
        this.leftlacrimalcrest.cubeList.add(new ModelBox(leftlacrimalcrest, 219, 77, -2.0F, -7.0F, -1.0F, 3, 8, 2, 0.0F, true));

        this.leftlacrimalfront = new AdvancedModelRenderer(this);
        this.leftlacrimalfront.setRotationPoint(-0.45F, -7.0F, -0.95F);
        this.leftlacrimalcrest.addChild(leftlacrimalfront);
        this.setRotateAngle(leftlacrimalfront, 0.6369F, -0.0213F, 0.0F);
        this.leftlacrimalfront.cubeList.add(new ModelBox(leftlacrimalfront, 216, 96, -1.5F, 0.0F, -4.0F, 3, 2, 4, 0.0F, true));

        this.leftlacrimalback = new AdvancedModelRenderer(this);
        this.leftlacrimalback.setRotationPoint(-0.5F, -6.4F, 0.5F);
        this.leftlacrimalcrest.addChild(leftlacrimalback);
        this.setRotateAngle(leftlacrimalback, -0.0213F, 0.3396F, 0.1061F);
        this.leftlacrimalback.cubeList.add(new ModelBox(leftlacrimalback, 189, 106, -1.5F, 0.0F, 0.0F, 3, 1, 3, 0.0F, true));

        this.lupperteethback = new AdvancedModelRenderer(this);
        this.lupperteethback.setRotationPoint(0.4F, 4.1F, -5.4F);
        this.leftheadflank.addChild(lupperteethback);
        this.setRotateAngle(lupperteethback, 0.0637F, 0.1274F, 0.0F);
        this.lupperteethback.cubeList.add(new ModelBox(lupperteethback, 16, 7, 0.0F, 0.0F, -1.5F, 0, 1, 3, 0.0F, true));

        this.neckendridgea = new AdvancedModelRenderer(this);
        this.neckendridgea.setRotationPoint(0.0F, -3.9F, 1.5F);
        this.neckend.addChild(neckendridgea);
        this.setRotateAngle(neckendridgea, 0.0637F, 0.0F, 0.0F);
        this.neckendridgea.cubeList.add(new ModelBox(neckendridgea, 116, 231, -3.0F, -2.0F, -5.0F, 6, 4, 5, 0.0F, true));

        this.neckendridgeb = new AdvancedModelRenderer(this);
        this.neckendridgeb.setRotationPoint(0.0F, -2.0F, -4.7F);
        this.neckendridgea.addChild(neckendridgeb);
        this.setRotateAngle(neckendridgeb, 0.3396F, 0.0F, 0.0F);
        this.neckendridgeb.cubeList.add(new ModelBox(neckendridgeb, 116, 192, -2.5F, 0.0F, -4.0F, 5, 2, 4, 0.0F, true));

        this.throatpouchsegment4 = new AdvancedModelRenderer(this);
        this.throatpouchsegment4.setRotationPoint(0.0F, 12.0F, 1.0F);
        this.neckend.addChild(throatpouchsegment4);
        this.setRotateAngle(throatpouchsegment4, 0.2972F, 0.0F, 0.0F);
        this.throatpouchsegment4.cubeList.add(new ModelBox(throatpouchsegment4, 177, 68, -4.0F, -5.0F, -5.0F, 8, 5, 5, 0.0F, true));

        this.throatpouchsegment3 = new AdvancedModelRenderer(this);
        this.throatpouchsegment3.setRotationPoint(0.01F, 0.0F, -5.0F);
        this.throatpouchsegment4.addChild(throatpouchsegment3);
        this.setRotateAngle(throatpouchsegment3, -0.3821F, 0.0F, 0.0F);
        this.throatpouchsegment3.cubeList.add(new ModelBox(throatpouchsegment3, 171, 83, -4.0F, -5.0F, -3.0F, 8, 5, 3, 0.0F, true));

        this.neckmiddleendridge = new AdvancedModelRenderer(this);
        this.neckmiddleendridge.setRotationPoint(0.0F, -4.5F, 0.5F);
        this.neckmiddleend.addChild(neckmiddleendridge);
        this.setRotateAngle(neckmiddleendridge, 0.0213F, 0.0F, 0.0F);
        this.neckmiddleendridge.cubeList.add(new ModelBox(neckmiddleendridge, 83, 226, -3.5F, -2.0F, -7.5F, 7, 5, 8, 0.0F, true));

        this.neckmiddlebaseridge = new AdvancedModelRenderer(this);
        this.neckmiddlebaseridge.setRotationPoint(0.01F, -5.0F, 1.5F);
        this.neckmiddlebase.addChild(neckmiddlebaseridge);
        this.setRotateAngle(neckmiddlebaseridge, 0.0213F, 0.0F, 0.0F);
        this.neckmiddlebaseridge.cubeList.add(new ModelBox(neckmiddlebaseridge, 161, 134, -3.5F, -2.0F, -7.5F, 7, 4, 8, 0.0F, true));

        this.neckmiddlebaseslope = new AdvancedModelRenderer(this);
        this.neckmiddlebaseslope.setRotationPoint(0.01F, 11.0F, 1.5F);
        this.neckmiddlebase.addChild(neckmiddlebaseslope);
        this.setRotateAngle(neckmiddlebaseslope, 0.2759F, 0.0F, 0.0F);
        this.neckmiddlebaseslope.cubeList.add(new ModelBox(neckmiddlebaseslope, 159, 218, -4.5F, -13.0F, 0.0F, 9, 13, 5, 0.0F, true));

        this.neckbaseridge = new AdvancedModelRenderer(this);
        this.neckbaseridge.setRotationPoint(0.0F, -5.5F, 1.0F);
        this.neckbase.addChild(neckbaseridge);
        this.setRotateAngle(neckbaseridge, 0.0848F, 0.0F, 0.0F);
        this.neckbaseridge.cubeList.add(new ModelBox(neckbaseridge, 185, 168, -4.0F, -3.0F, -9.0F, 8, 3, 9, 0.0F, true));

        this.neckbaseflesh = new AdvancedModelRenderer(this);
        this.neckbaseflesh.setRotationPoint(-0.01F, 11.5F, 1.0F);
        this.neckbase.addChild(neckbaseflesh);
        this.setRotateAngle(neckbaseflesh, 0.1698F, 0.0F, 0.0F);
        this.neckbaseflesh.cubeList.add(new ModelBox(neckbaseflesh, 145, 194, -5.5F, -14.0F, 0.0F, 11, 14, 9, 0.0F, true));

        this.bodyfrontridge = new AdvancedModelRenderer(this);
        this.bodyfrontridge.setRotationPoint(0.0F, -4.9F, 0.7F);
        this.bodyfront.addChild(bodyfrontridge);
        this.setRotateAngle(bodyfrontridge, 0.1911F, 0.0F, 0.0F);
        this.bodyfrontridge.cubeList.add(new ModelBox(bodyfrontridge, 94, 20, -5.0F, -6.0F, -12.0F, 10, 6, 13, 0.0F, true));

        this.chestslope = new AdvancedModelRenderer(this);
        this.chestslope.setRotationPoint(-0.01F, 15.5F, -11.5F);
        this.bodyfront.addChild(chestslope);
        this.setRotateAngle(chestslope, -0.2122F, 0.0F, 0.0F);
        this.chestslope.cubeList.add(new ModelBox(chestslope, 131, 66, -8.0F, -3.0F, 0.0F, 16, 3, 13, 0.0F, true));

        this.rightupperarm = new AdvancedModelRenderer(this);
        this.rightupperarm.setRotationPoint(8.0F, 12.5F, -6.5F);
        this.bodyfront.addChild(rightupperarm);
        this.setRotateAngle(rightupperarm, 1.0613F, 0.2122F, -0.2122F);
        this.rightupperarm.cubeList.add(new ModelBox(rightupperarm, 0, 35, -1.0F, -1.0F, -2.5F, 4, 8, 5, 0.0F, true));

        this.rightlowerarm = new AdvancedModelRenderer(this);
        this.rightlowerarm.setRotationPoint(1.0F, 6.0F, 0.0F);
        this.rightupperarm.addChild(rightlowerarm);
        this.setRotateAngle(rightlowerarm, -0.9976F, -0.0213F, 0.1485F);
        this.rightlowerarm.cubeList.add(new ModelBox(rightlowerarm, 17, 17, -1.5F, -0.5F, -1.5F, 3, 5, 3, 0.0F, true));

        this.righthand = new AdvancedModelRenderer(this);
        this.righthand.setRotationPoint(1.3F, 4.2F, 0.0F);
        this.rightlowerarm.addChild(righthand);
        this.setRotateAngle(righthand, 0.0F, 0.0F, 0.3396F);
        this.righthand.cubeList.add(new ModelBox(righthand, 92, 19, -2.0F, 0.0F, -2.5F, 2, 7, 5, 0.0F, true));

        this.leftupperarm = new AdvancedModelRenderer(this);
        this.leftupperarm.setRotationPoint(-8.0F, 12.5F, -6.5F);
        this.bodyfront.addChild(leftupperarm);
        this.setRotateAngle(leftupperarm, 1.0613F, -0.2122F, 0.2122F);
        this.leftupperarm.cubeList.add(new ModelBox(leftupperarm, 0, 21, -3.0F, -1.0F, -2.5F, 4, 8, 5, 0.0F, true));

        this.leftlowerarm = new AdvancedModelRenderer(this);
        this.leftlowerarm.setRotationPoint(-1.0F, 6.0F, 0.0F);
        this.leftupperarm.addChild(leftlowerarm);
        this.setRotateAngle(leftlowerarm, -0.9976F, 0.0213F, -0.1485F);
        this.leftlowerarm.cubeList.add(new ModelBox(leftlowerarm, 4, 12, -1.5F, -0.5F, -1.5F, 3, 5, 3, 0.0F, true));

        this.lefthand = new AdvancedModelRenderer(this);
        this.lefthand.setRotationPoint(-1.3F, 4.2F, 0.0F);
        this.leftlowerarm.addChild(lefthand);
        this.setRotateAngle(lefthand, 0.0F, 0.0F, -0.3396F);
        this.lefthand.cubeList.add(new ModelBox(lefthand, 77, 19, 0.0F, 0.0F, -2.5F, 2, 7, 5, 0.0F, true));

        this.bodymiddleridge = new AdvancedModelRenderer(this);
        this.bodymiddleridge.setRotationPoint(0.0F, -4.9F, -20.5F);
        this.bodymiddle.addChild(bodymiddleridge);
        this.setRotateAngle(bodymiddleridge, 0.0213F, 0.0F, 0.0F);
        this.bodymiddleridge.cubeList.add(new ModelBox(bodymiddleridge, 85, 66, -6.0F, -6.0F, 0.0F, 12, 6, 21, 0.0F, true));

        this.bellyslope = new AdvancedModelRenderer(this);
        this.bellyslope.setRotationPoint(0.0F, 18.5F, -20.5F);
        this.bodymiddle.addChild(bellyslope);
        this.setRotateAngle(bellyslope, -0.1274F, 0.0F, 0.0F);
        this.bellyslope.cubeList.add(new ModelBox(bellyslope, 88, 40, -6.5F, -3.0F, 0.0F, 13, 3, 22, 0.0F, true));

        this.tail1 = new AdvancedModelRenderer(this);
        this.tail1.setRotationPoint(0.0F, 0.3F, 10.3F);
        this.hips.addChild(tail1);
        this.setRotateAngle(tail1, -0.1274F, 0.0F, 0.0F);
        this.tail1.cubeList.add(new ModelBox(tail1, 0, 63, -6.5F, -5.5F, -0.5F, 13, 19, 24, 0.0F, true));

        this.tail2 = new AdvancedModelRenderer(this);
        this.tail2.setRotationPoint(0.0F, -0.1F, 22.0F);
        this.tail1.addChild(tail2);
        this.setRotateAngle(tail2, 0.1485F, 0.0F, 0.0F);
        this.tail2.cubeList.add(new ModelBox(tail2, 0, 29, -5.5F, -5.0F, -0.5F, 11, 13, 20, 0.0F, true));

        this.tail3 = new AdvancedModelRenderer(this);
        this.tail3.setRotationPoint(0.0F, -0.4F, 18.0F);
        this.tail2.addChild(tail3);
        this.setRotateAngle(tail3, -0.1698F, 0.0F, 0.0F);
        this.tail3.cubeList.add(new ModelBox(tail3, 51, 58, -4.5F, -4.5F, -0.5F, 9, 10, 18, 0.0F, true));

        this.tail4 = new AdvancedModelRenderer(this);
        this.tail4.setRotationPoint(0.0F, -0.9F, 16.0F);
        this.tail3.addChild(tail4);
        this.setRotateAngle(tail4, -0.1274F, 0.0F, 0.0F);
        this.tail4.cubeList.add(new ModelBox(tail4, 69, 38, -3.0F, -3.5F, 0.0F, 6, 7, 12, 0.0F, true));

        this.tail5 = new AdvancedModelRenderer(this);
        this.tail5.setRotationPoint(0.0F, -0.9F, 10.8F);
        this.tail4.addChild(tail5);
        this.setRotateAngle(tail5, -0.1485F, 0.0F, 0.0F);
        this.tail5.cubeList.add(new ModelBox(tail5, 121, 215, -2.0F, -2.5F, 0.0F, 4, 5, 11, 0.0F, true));

        this.tail6 = new AdvancedModelRenderer(this);
        this.tail6.setRotationPoint(0.0F, -0.9F, 10.1F);
        this.tail5.addChild(tail6);
        this.setRotateAngle(tail6, -0.0848F, 0.0F, 0.0F);
        this.tail6.cubeList.add(new ModelBox(tail6, 59, 186, -1.5F, -1.5F, 0.0F, 3, 3, 10, 0.0F, true));

        this.tail7 = new AdvancedModelRenderer(this);
        this.tail7.setRotationPoint(0.0F, -0.4F, 9.3F);
        this.tail6.addChild(tail7);
        this.setRotateAngle(tail7, -0.1274F, 0.0F, 0.0F);
        this.tail7.cubeList.add(new ModelBox(tail7, 0, 187, -1.0F, -1.0F, 0.0F, 2, 2, 9, 0.0F, true));

        this.tailridge2 = new AdvancedModelRenderer(this);
        this.tailridge2.setRotationPoint(0.0F, -4.5F, 0.0F);
        this.tail2.addChild(tailridge2);
        this.setRotateAngle(tailridge2, -0.2122F, 0.0F, 0.0F);
        this.tailridge2.cubeList.add(new ModelBox(tailridge2, 43, 16, -4.0F, -4.0F, 0.0F, 8, 4, 17, 0.0F, true));

        this.tailridge1a = new AdvancedModelRenderer(this);
        this.tailridge1a.setRotationPoint(0.0F, -5.4F, -0.7F);
        this.tail1.addChild(tailridge1a);
        this.setRotateAngle(tailridge1a, -0.1485F, 0.0F, 0.0F);
        this.tailridge1a.cubeList.add(new ModelBox(tailridge1a, 137, 42, -5.0F, -6.0F, -1.0F, 10, 6, 13, 0.0F, true));

        this.tailridge1b = new AdvancedModelRenderer(this);
        this.tailridge1b.setRotationPoint(0.0F, -5.5F, 11.5F);
        this.tail1.addChild(tailridge1b);
        this.setRotateAngle(tailridge1b, -0.0637F, 0.0F, 0.0F);
        this.tailridge1b.cubeList.add(new ModelBox(tailridge1b, 139, 83, -4.5F, -4.0F, -1.0F, 9, 4, 13, 0.0F, true));

        this.hipridge1 = new AdvancedModelRenderer(this);
        this.hipridge1.setRotationPoint(0.0F, -7.85F, -12.8F);
        this.hips.addChild(hipridge1);
        this.setRotateAngle(hipridge1, -0.1485F, 0.0F, 0.0F);
        this.hipridge1.cubeList.add(new ModelBox(hipridge1, 141, 101, -5.5F, -6.0F, 0.0F, 11, 6, 11, 0.0F, true));

        this.hipridge2 = new AdvancedModelRenderer(this);
        this.hipridge2.setRotationPoint(-0.01F, -7.1F, -1.6F);
        this.hips.addChild(hipridge2);
        this.setRotateAngle(hipridge2, 0.0424F, 0.0F, 0.0F);
        this.hipridge2.cubeList.add(new ModelBox(hipridge2, 149, 119, -5.5F, -5.0F, 0.0F, 11, 5, 9, 0.0F, true));

        this.hipridge3 = new AdvancedModelRenderer(this);
        this.hipridge3.setRotationPoint(0.01F, -7.6F, 5.9F);
        this.hips.addChild(hipridge3);
        this.setRotateAngle(hipridge3, -0.2546F, 0.0F, 0.0F);
        this.hipridge3.cubeList.add(new ModelBox(hipridge3, 188, 229, -5.5F, -5.0F, 0.0F, 11, 5, 6, 0.0F, true));

        this.rightthigh = new AdvancedModelRenderer(this);
        this.rightthigh.setRotationPoint(5.5F, 0.0F, 0.0F);
        this.hips.addChild(rightthigh);
        this.setRotateAngle(rightthigh, -0.1061F, 0.0F, -0.0424F);
        this.rightthigh.cubeList.add(new ModelBox(rightthigh, 83, 184, -2.5F, -4.5F, -8.0F, 8, 25, 16, 0.0F, true));

        this.rightshin = new AdvancedModelRenderer(this);
        this.rightshin.setRotationPoint(1.5F, 19.5F, -5.5F);
        this.rightthigh.addChild(rightshin);
        this.setRotateAngle(rightshin, 0.3821F, 0.0F, 0.0424F);
        this.rightshin.cubeList.add(new ModelBox(rightshin, 62, 127, -3.5F, -1.0F, -1.5F, 7, 19, 10, 0.0F, true));

        this.rightankle = new AdvancedModelRenderer(this);
        this.rightankle.setRotationPoint(0.0F, 17.0F, 4.0F);
        this.rightshin.addChild(rightankle);
        this.setRotateAngle(rightankle, -0.5519F, 0.0F, 0.0F);
        this.rightankle.cubeList.add(new ModelBox(rightankle, 165, 175, -3.0F, -1.0F, -4.0F, 6, 12, 6, 0.0F, true));

        this.rightfoot = new AdvancedModelRenderer(this);
        this.rightfoot.setRotationPoint(0.0F, 10.5F, -1.0F);
        this.rightankle.addChild(rightfoot);
        this.setRotateAngle(rightfoot, 0.2335F, 0.0F, 0.0F);
        this.rightfoot.cubeList.add(new ModelBox(rightfoot, 186, 193, -3.5F, -1.0F, -4.0F, 7, 4, 7, 0.0F, true));

        this.righttoes = new AdvancedModelRenderer(this);
        this.righttoes.setRotationPoint(0.0F, 0.99F, -3.3F);
        this.rightfoot.addChild(righttoes);
        this.righttoes.cubeList.add(new ModelBox(righttoes, 188, 217, -5.5F, -1.0F, -7.5F, 11, 3, 8, 0.0F, true));

        this.leftthigh = new AdvancedModelRenderer(this);
        this.leftthigh.setRotationPoint(-5.5F, 0.0F, 0.0F);
        this.hips.addChild(leftthigh);
        this.setRotateAngle(leftthigh, -0.1061F, 0.0F, 0.0424F);
        this.leftthigh.cubeList.add(new ModelBox(leftthigh, 83, 142, -5.5F, -4.5F, -8.0F, 8, 25, 16, 0.0F, true));

        this.leftshin = new AdvancedModelRenderer(this);
        this.leftshin.setRotationPoint(-1.5F, 19.5F, -5.5F);
        this.leftthigh.addChild(leftshin);
        this.setRotateAngle(leftshin, 0.3821F, 0.0F, -0.0424F);
        this.leftshin.cubeList.add(new ModelBox(leftshin, 65, 97, -3.5F, -1.0F, -1.5F, 7, 19, 10, 0.0F, true));

        this.leftankle = new AdvancedModelRenderer(this);
        this.leftankle.setRotationPoint(0.0F, 17.0F, 4.0F);
        this.leftshin.addChild(leftankle);
        this.setRotateAngle(leftankle, -0.5519F, 0.0F, 0.0F);
        this.leftankle.cubeList.add(new ModelBox(leftankle, 169, 156, -3.0F, -1.0F, -4.0F, 6, 12, 6, 0.0F, true));

        this.leftfoot = new AdvancedModelRenderer(this);
        this.leftfoot.setRotationPoint(0.0F, 10.5F, -1.0F);
        this.leftankle.addChild(leftfoot);
        this.setRotateAngle(leftfoot, 0.2335F, 0.0F, 0.0F);
        this.leftfoot.cubeList.add(new ModelBox(leftfoot, 190, 181, -3.5F, -1.0F, -4.0F, 7, 4, 7, 0.0F, true));

        this.lefttoes = new AdvancedModelRenderer(this);
        this.lefttoes.setRotationPoint(0.0F, 0.99F, -3.3F);
        this.leftfoot.addChild(lefttoes);
        this.lefttoes.cubeList.add(new ModelBox(lefttoes, 186, 205, -5.5F, -1.0F, -7.5F, 11, 3, 8, 0.0F, true));

        updateDefaultPose();
        animator = ModelAnimator.create();
    }

    @Override
    public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        animate((IAnimatedEntity) entity, f, f1, f2, f3, f4, f5);
        this.hips.render(f5);
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
        this.hips.offsetY = -0.20F;
        this.hips.offsetX = 0.0F;
        this.hips.rotateAngleY = (float)Math.toRadians(220);
        this.hips.rotateAngleX = (float)Math.toRadians(12);
        this.hips.rotateAngleZ = (float)Math.toRadians(-2);
        this.hips.scaleChildren = true;
        float scaler = 0.6F;
        this.hips.setScale(scaler, scaler, scaler);
        //Start of pose:
       
        //End of pose, now render the model:
        this.hips.render(f);
        //Reset rotations, positions and sizing:
        this.hips.setScale(1.0F, 1.0F, 1.0F);
        this.hips.scaleChildren = false;
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

        EntityPrehistoricFloraTyrannotitan EntityTyrannotitan = (EntityPrehistoricFloraTyrannotitan) e;

        this.faceTarget(f3, f4, 8, neckbase);
        this.faceTarget(f3, f4, 8, neckmiddlebase);
        this.faceTarget(f3, f4, 8, neckmiddleend);
        this.faceTarget(f3, f4, 8, neckend);
        this.faceTarget(f3, f4, 8, head);

        AdvancedModelRenderer[] Tail = {this.tail1, this.tail2, this.tail3, this.tail4, this.tail5, this.tail6, this.tail7};
        AdvancedModelRenderer[] Neck = {this.neckbase, this.neckmiddlebase, this.neckmiddleend, this.neckend, this.head};
        AdvancedModelRenderer[] ArmL = {this.rightupperarm, this.rightlowerarm, this.righthand};
        AdvancedModelRenderer[] ArmR = {this.leftupperarm, this.leftlowerarm, this.lefthand};

        EntityTyrannotitan.tailBuffer.applyChainSwingBuffer(Tail);

        if (EntityTyrannotitan.getAnimation() == EntityTyrannotitan.LAY_ANIMATION) {
            this.chainSwing(Neck, 0.5F, 0.10F, 0.5, f2, 0.8F);
            this.chainWave(Neck, 0.5F * 2, -0.02F, 0.5F, f2, 0.8F);
        }
        else {
            if (!EntityTyrannotitan.isReallyInWater()) {

                if (f3 == 0.0F || !EntityTyrannotitan.getIsMoving()) {
                    this.chainSwing(Neck, 0.05F, 0.10F, 0.5, f2, 0.8F);
                    this.chainWave(Neck, 0.05F * 2, -0.02F, 0.5F, f2, 0.8F);

                    this.chainWave(Tail, (0.15F * 0.35F), 0.125F * 0.15F, 0.2F, f2, 1F);
                    this.chainSwing(Tail, (0.15F * 0.35F) * 4F, 0.05F * 0.35F, 0.12F, f2, 1F);

                    this.chainWaveExtended(ArmL, 0.175F, 0.03F, 0.1F, 3F, f2, 1F);
                    this.chainWaveExtended(ArmR, 0.175F, -0.03F, -0.1F, 0f, f2, 1F);
                    this.chainFlapExtended(ArmL, 0.175F, -0.03F, 0.1F, 3F, f2, 1F);
                    this.chainFlapExtended(ArmR, 0.175F, -0.03F, -0.1F, 0f, f2, 1F);
                    this.walk(this.rightupperarm, 0.175F, 0.10F, true, 3F, 0.05F, f2, 1F);
                    this.walk(this.leftupperarm, 0.175F, -0.10F, true, 0F, 0.05F, f2, 1F);
                    this.flap(this.rightupperarm, 0.175F, -0.10F, true, 3F, 0.05F, f2, 1F);
                    this.flap(this.leftupperarm, 0.175F, -0.10F, true, 0F, 0.05F, f2, 1F);

                    return;
                }

                if (EntityTyrannotitan.getIsFast()) { //Running


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

    public void animAttack(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime, double animTick) {
        EntityPrehistoricFloraTyrannotitan entity = (EntityPrehistoricFloraTyrannotitan) entitylivingbaseIn;
        int animCycle = 20;
        double tickAnim = animTick + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;
         if (tickAnim >= 0 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 0) / 5) * (2.825+Math.sin((Math.PI/180)*(((double)tickAnim/20)*150))*-3-(0)));
            yy = 0 + (((tickAnim - 0) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 5) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 13) {
            xx = 2.825+Math.sin((Math.PI/180)*(((double)tickAnim/20)*150))*-3 + (((tickAnim - 5) / 8) * (0.875+Math.sin((Math.PI/180)*(((double)tickAnim/20)*150))*-1-(2.825+Math.sin((Math.PI/180)*(((double)tickAnim/20)*150))*-3)));
            yy = 0 + (((tickAnim - 5) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 5) / 8) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 20) {
            xx = 0.875+Math.sin((Math.PI/180)*(((double)tickAnim/20)*150))*-1 + (((tickAnim - 13) / 7) * (0-(0.875+Math.sin((Math.PI/180)*(((double)tickAnim/20)*150))*-1)));
            yy = 0 + (((tickAnim - 13) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 13) / 7) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(bodymiddle, bodymiddle.rotateAngleX + (float) Math.toRadians(xx), bodymiddle.rotateAngleY + (float) Math.toRadians(yy), bodymiddle.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 0) / 5) * (-3.25-(0)));
            yy = 0 + (((tickAnim - 0) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 5) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 13) {
            xx = -3.25 + (((tickAnim - 5) / 8) * (3.25-(-3.25)));
            yy = 0 + (((tickAnim - 5) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 5) / 8) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 20) {
            xx = 3.25 + (((tickAnim - 13) / 7) * (0-(3.25)));
            yy = 0 + (((tickAnim - 13) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 13) / 7) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(bodyfront, bodyfront.rotateAngleX + (float) Math.toRadians(xx), bodyfront.rotateAngleY + (float) Math.toRadians(yy), bodyfront.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 0) / 5) * (-4.75-(0)));
            yy = 0 + (((tickAnim - 0) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 5) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 13) {
            xx = -4.75 + (((tickAnim - 5) / 8) * (18.26334-(-4.75)));
            yy = 0 + (((tickAnim - 5) / 8) * (0.40991-(0)));
            zz = 0 + (((tickAnim - 5) / 8) * (3.72756-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 20) {
            xx = 18.26334 + (((tickAnim - 13) / 7) * (0-(18.26334)));
            yy = 0.40991 + (((tickAnim - 13) / 7) * (0-(0.40991)));
            zz = 3.72756 + (((tickAnim - 13) / 7) * (0-(3.72756)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neckbase, neckbase.rotateAngleX + (float) Math.toRadians(xx), neckbase.rotateAngleY + (float) Math.toRadians(yy), neckbase.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 0) / 5) * (-1.5-(0)));
            yy = 0 + (((tickAnim - 0) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 5) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 13) {
            xx = -1.5 + (((tickAnim - 5) / 8) * (10.5013-(-1.5)));
            yy = 0 + (((tickAnim - 5) / 8) * (0.08547-(0)));
            zz = 0 + (((tickAnim - 5) / 8) * (1.74791-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 20) {
            xx = 10.5013 + (((tickAnim - 13) / 7) * (0-(10.5013)));
            yy = 0.08547 + (((tickAnim - 13) / 7) * (0-(0.08547)));
            zz = 1.74791 + (((tickAnim - 13) / 7) * (0-(1.74791)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neckmiddlebase, neckmiddlebase.rotateAngleX + (float) Math.toRadians(xx), neckmiddlebase.rotateAngleY + (float) Math.toRadians(yy), neckmiddlebase.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 0) / 5) * (0.75-(0)));
            yy = 0 + (((tickAnim - 0) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 5) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 13) {
            xx = 0.75 + (((tickAnim - 5) / 8) * (-12.25077-(0.75)));
            yy = 0 + (((tickAnim - 5) / 8) * (-0.11991-(0)));
            zz = 0 + (((tickAnim - 5) / 8) * (0.74035-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 20) {
            xx = -12.25077 + (((tickAnim - 13) / 7) * (0-(-12.25077)));
            yy = -0.11991 + (((tickAnim - 13) / 7) * (0-(-0.11991)));
            zz = 0.74035 + (((tickAnim - 13) / 7) * (0-(0.74035)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neckmiddleend, neckmiddleend.rotateAngleX + (float) Math.toRadians(xx), neckmiddleend.rotateAngleY + (float) Math.toRadians(yy), neckmiddleend.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 0) / 5) * (8.75-(0)));
            yy = 0 + (((tickAnim - 0) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 5) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 13) {
            xx = 8.75 + (((tickAnim - 5) / 8) * (-21.00462-(8.75)));
            yy = 0 + (((tickAnim - 5) / 8) * (-0.30715-(0)));
            zz = 0 + (((tickAnim - 5) / 8) * (1.72284-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 20) {
            xx = -21.00462 + (((tickAnim - 13) / 7) * (0-(-21.00462)));
            yy = -0.30715 + (((tickAnim - 13) / 7) * (0-(-0.30715)));
            zz = 1.72284 + (((tickAnim - 13) / 7) * (0-(1.72284)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neckend, neckend.rotateAngleX + (float) Math.toRadians(xx), neckend.rotateAngleY + (float) Math.toRadians(yy), neckend.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 0) / 5) * (2.75-(0)));
            yy = 0 + (((tickAnim - 0) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 5) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 9) {
            xx = 2.75 + (((tickAnim - 5) / 4) * (0.84-(2.75)));
            yy = 0 + (((tickAnim - 5) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 5) / 4) * (0-(0)));
        }
        else if (tickAnim >= 9 && tickAnim < 13) {
            xx = 0.84 + (((tickAnim - 9) / 4) * (-13.5-(0.84)));
            yy = 0 + (((tickAnim - 9) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 9) / 4) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 20) {
            xx = -13.5 + (((tickAnim - 13) / 7) * (0-(-13.5)));
            yy = 0 + (((tickAnim - 13) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 13) / 7) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(head, head.rotateAngleX + (float) Math.toRadians(xx), head.rotateAngleY + (float) Math.toRadians(yy), head.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 0) / 5) * (3.5-(0)));
            yy = 0 + (((tickAnim - 0) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 5) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 9) {
            xx = 3.5 + (((tickAnim - 5) / 4) * (29.89-(3.5)));
            yy = 0 + (((tickAnim - 5) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 5) / 4) * (0-(0)));
        }
        else if (tickAnim >= 9 && tickAnim < 13) {
            xx = 29.89 + (((tickAnim - 9) / 4) * (0-(29.89)));
            yy = 0 + (((tickAnim - 9) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 9) / 4) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(lowerjawback, lowerjawback.rotateAngleX + (float) Math.toRadians(xx), lowerjawback.rotateAngleY + (float) Math.toRadians(yy), lowerjawback.rotateAngleZ + (float) Math.toRadians(zz));



    }

    public void animLay(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime, double animTick) {
        EntityPrehistoricFloraTyrannotitan entity = (EntityPrehistoricFloraTyrannotitan) entitylivingbaseIn;
        int animCycle = 50;
        double tickAnim = animTick + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;
         if (tickAnim >= 0 && tickAnim < 18) {
            xx = 0 + (((tickAnim - 0) / 18) * (-8-(0)));
            yy = 0 + (((tickAnim - 0) / 18) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 18) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 30) {
            xx = -8 + (((tickAnim - 18) / 12) * (-8-(-8)));
            yy = 0 + (((tickAnim - 18) / 12) * (0-(0)));
            zz = 0 + (((tickAnim - 18) / 12) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 50) {
            xx = -8 + (((tickAnim - 30) / 20) * (0-(-8)));
            yy = 0 + (((tickAnim - 30) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 30) / 20) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(hips, hips.rotateAngleX + (float) Math.toRadians(xx), hips.rotateAngleY + (float) Math.toRadians(yy), hips.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 18) {
            xx = 0 + (((tickAnim - 0) / 18) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 18) * (-11.475-(0)));
            zz = 0 + (((tickAnim - 0) / 18) * (8.875-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 30) {
            xx = 0 + (((tickAnim - 18) / 12) * (0-(0)));
            yy = -11.475 + (((tickAnim - 18) / 12) * (-11.475-(-11.475)));
            zz = 8.875 + (((tickAnim - 18) / 12) * (8.875-(8.875)));
        }
        else if (tickAnim >= 30 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 30) / 20) * (0-(0)));
            yy = -11.475 + (((tickAnim - 30) / 20) * (0-(-11.475)));
            zz = 8.875 + (((tickAnim - 30) / 20) * (0-(8.875)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.hips.rotationPointX = this.hips.rotationPointX + (float)(xx);
        this.hips.rotationPointY = this.hips.rotationPointY - (float)(yy);
        this.hips.rotationPointZ = this.hips.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 18) {
            xx = 0 + (((tickAnim - 0) / 18) * (6.5-(0)));
            yy = 0 + (((tickAnim - 0) / 18) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 18) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 30) {
            xx = 6.5 + (((tickAnim - 18) / 12) * (7-(6.5)));
            yy = 0 + (((tickAnim - 18) / 12) * (0-(0)));
            zz = 0 + (((tickAnim - 18) / 12) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 50) {
            xx = 7 + (((tickAnim - 30) / 20) * (0-(7)));
            yy = 0 + (((tickAnim - 30) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 30) / 20) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(bodymiddle, bodymiddle.rotateAngleX + (float) Math.toRadians(xx), bodymiddle.rotateAngleY + (float) Math.toRadians(yy), bodymiddle.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 18) {
            xx = 0 + (((tickAnim - 0) / 18) * (5.75-(0)));
            yy = 0 + (((tickAnim - 0) / 18) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 18) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 30) {
            xx = 5.75 + (((tickAnim - 18) / 12) * (5-(5.75)));
            yy = 0 + (((tickAnim - 18) / 12) * (0-(0)));
            zz = 0 + (((tickAnim - 18) / 12) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 50) {
            xx = 5 + (((tickAnim - 30) / 20) * (0-(5)));
            yy = 0 + (((tickAnim - 30) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 30) / 20) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(bodyfront, bodyfront.rotateAngleX + (float) Math.toRadians(xx), bodyfront.rotateAngleY + (float) Math.toRadians(yy), bodyfront.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 18) {
            xx = 0 + (((tickAnim - 0) / 18) * (10.75-(0)));
            yy = 0 + (((tickAnim - 0) / 18) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 18) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 30) {
            xx = 10.75 + (((tickAnim - 18) / 12) * (9.25-(10.75)));
            yy = 0 + (((tickAnim - 18) / 12) * (0-(0)));
            zz = 0 + (((tickAnim - 18) / 12) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 50) {
            xx = 9.25 + (((tickAnim - 30) / 20) * (0-(9.25)));
            yy = 0 + (((tickAnim - 30) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 30) / 20) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neckbase, neckbase.rotateAngleX + (float) Math.toRadians(xx), neckbase.rotateAngleY + (float) Math.toRadians(yy), neckbase.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 18) {
            xx = 0 + (((tickAnim - 0) / 18) * (-6-(0)));
            yy = 0 + (((tickAnim - 0) / 18) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 18) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 30) {
            xx = -6 + (((tickAnim - 18) / 12) * (-6.75-(-6)));
            yy = 0 + (((tickAnim - 18) / 12) * (0-(0)));
            zz = 0 + (((tickAnim - 18) / 12) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 50) {
            xx = -6.75 + (((tickAnim - 30) / 20) * (0-(-6.75)));
            yy = 0 + (((tickAnim - 30) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 30) / 20) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neckmiddlebase, neckmiddlebase.rotateAngleX + (float) Math.toRadians(xx), neckmiddlebase.rotateAngleY + (float) Math.toRadians(yy), neckmiddlebase.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 18) {
            xx = 0 + (((tickAnim - 0) / 18) * (-9.5-(0)));
            yy = 0 + (((tickAnim - 0) / 18) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 18) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 30) {
            xx = -9.5 + (((tickAnim - 18) / 12) * (-3-(-9.5)));
            yy = 0 + (((tickAnim - 18) / 12) * (0-(0)));
            zz = 0 + (((tickAnim - 18) / 12) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 50) {
            xx = -3 + (((tickAnim - 30) / 20) * (0-(-3)));
            yy = 0 + (((tickAnim - 30) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 30) / 20) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neckmiddleend, neckmiddleend.rotateAngleX + (float) Math.toRadians(xx), neckmiddleend.rotateAngleY + (float) Math.toRadians(yy), neckmiddleend.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 18) {
            xx = 0 + (((tickAnim - 0) / 18) * (-9.5-(0)));
            yy = 0 + (((tickAnim - 0) / 18) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 18) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 30) {
            xx = -9.5 + (((tickAnim - 18) / 12) * (-9.5-(-9.5)));
            yy = 0 + (((tickAnim - 18) / 12) * (0-(0)));
            zz = 0 + (((tickAnim - 18) / 12) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 50) {
            xx = -9.5 + (((tickAnim - 30) / 20) * (0-(-9.5)));
            yy = 0 + (((tickAnim - 30) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 30) / 20) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neckend, neckend.rotateAngleX + (float) Math.toRadians(xx), neckend.rotateAngleY + (float) Math.toRadians(yy), neckend.rotateAngleZ + (float) Math.toRadians(zz));



        this.setRotateAngle(head, head.rotateAngleX + (float) Math.toRadians(0), head.rotateAngleY + (float) Math.toRadians(0), head.rotateAngleZ + (float) Math.toRadians(0));



        if (tickAnim >= 0 && tickAnim < 18) {
            xx = 0 + (((tickAnim - 0) / 18) * (-9.25-(0)));
            yy = 0 + (((tickAnim - 0) / 18) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 18) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 30) {
            xx = -9.25 + (((tickAnim - 18) / 12) * (-9.25-(-9.25)));
            yy = 0 + (((tickAnim - 18) / 12) * (0-(0)));
            zz = 0 + (((tickAnim - 18) / 12) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 50) {
            xx = -9.25 + (((tickAnim - 30) / 20) * (0-(-9.25)));
            yy = 0 + (((tickAnim - 30) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 30) / 20) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tail1, tail1.rotateAngleX + (float) Math.toRadians(xx), tail1.rotateAngleY + (float) Math.toRadians(yy), tail1.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 0) / 10) * (-11-(0)));
            yy = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 18) {
            xx = -11 + (((tickAnim - 10) / 8) * (-12.25-(-11)));
            yy = 0 + (((tickAnim - 10) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 8) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 30) {
            xx = -12.25 + (((tickAnim - 18) / 12) * (-12.25-(-12.25)));
            yy = 0 + (((tickAnim - 18) / 12) * (0-(0)));
            zz = 0 + (((tickAnim - 18) / 12) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 36) {
            xx = -12.25 + (((tickAnim - 30) / 6) * (-10.93-(-12.25)));
            yy = 0 + (((tickAnim - 30) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 30) / 6) * (0-(0)));
        }
        else if (tickAnim >= 36 && tickAnim < 50) {
            xx = -10.93 + (((tickAnim - 36) / 14) * (0-(-10.93)));
            yy = 0 + (((tickAnim - 36) / 14) * (0-(0)));
            zz = 0 + (((tickAnim - 36) / 14) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tail2, tail2.rotateAngleX + (float) Math.toRadians(xx), tail2.rotateAngleY + (float) Math.toRadians(yy), tail2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 18) {
            xx = 0 + (((tickAnim - 0) / 18) * (-1.75-(0)));
            yy = 0 + (((tickAnim - 0) / 18) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 18) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 30) {
            xx = -1.75 + (((tickAnim - 18) / 12) * (-1.75-(-1.75)));
            yy = 0 + (((tickAnim - 18) / 12) * (0-(0)));
            zz = 0 + (((tickAnim - 18) / 12) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 50) {
            xx = -1.75 + (((tickAnim - 30) / 20) * (0-(-1.75)));
            yy = 0 + (((tickAnim - 30) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 30) / 20) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tail3, tail3.rotateAngleX + (float) Math.toRadians(xx), tail3.rotateAngleY + (float) Math.toRadians(yy), tail3.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 0) / 10) * (-3.43-(0)));
            yy = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 18) {
            xx = -3.43 + (((tickAnim - 10) / 8) * (13.25-(-3.43)));
            yy = 0 + (((tickAnim - 10) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 8) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 30) {
            xx = 13.25 + (((tickAnim - 18) / 12) * (13.25-(13.25)));
            yy = 0 + (((tickAnim - 18) / 12) * (0-(0)));
            zz = 0 + (((tickAnim - 18) / 12) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 36) {
            xx = 13.25 + (((tickAnim - 30) / 6) * (-2.86-(13.25)));
            yy = 0 + (((tickAnim - 30) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 30) / 6) * (0-(0)));
        }
        else if (tickAnim >= 36 && tickAnim < 50) {
            xx = -2.86 + (((tickAnim - 36) / 14) * (0-(-2.86)));
            yy = 0 + (((tickAnim - 36) / 14) * (0-(0)));
            zz = 0 + (((tickAnim - 36) / 14) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tail4, tail4.rotateAngleX + (float) Math.toRadians(xx), tail4.rotateAngleY + (float) Math.toRadians(yy), tail4.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 0) / 10) * (7.39-(0)));
            yy = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 18) {
            xx = 7.39 + (((tickAnim - 10) / 8) * (23-(7.39)));
            yy = 0 + (((tickAnim - 10) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 8) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 30) {
            xx = 23 + (((tickAnim - 18) / 12) * (23-(23)));
            yy = 0 + (((tickAnim - 18) / 12) * (0-(0)));
            zz = 0 + (((tickAnim - 18) / 12) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 36) {
            xx = 23 + (((tickAnim - 30) / 6) * (1.04-(23)));
            yy = 0 + (((tickAnim - 30) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 30) / 6) * (0-(0)));
        }
        else if (tickAnim >= 36 && tickAnim < 41) {
            xx = 1.04 + (((tickAnim - 36) / 5) * (-6.33-(1.04)));
            yy = 0 + (((tickAnim - 36) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 36) / 5) * (0-(0)));
        }
        else if (tickAnim >= 41 && tickAnim < 50) {
            xx = -6.33 + (((tickAnim - 41) / 9) * (0-(-6.33)));
            yy = 0 + (((tickAnim - 41) / 9) * (0-(0)));
            zz = 0 + (((tickAnim - 41) / 9) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tail5, tail5.rotateAngleX + (float) Math.toRadians(xx), tail5.rotateAngleY + (float) Math.toRadians(yy), tail5.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 18) {
            xx = 0 + (((tickAnim - 0) / 18) * (12.75-(0)));
            yy = 0 + (((tickAnim - 0) / 18) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 18) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 30) {
            xx = 12.75 + (((tickAnim - 18) / 12) * (12.75-(12.75)));
            yy = 0 + (((tickAnim - 18) / 12) * (0-(0)));
            zz = 0 + (((tickAnim - 18) / 12) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 36) {
            xx = 12.75 + (((tickAnim - 30) / 6) * (22.56-(12.75)));
            yy = 0 + (((tickAnim - 30) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 30) / 6) * (0-(0)));
        }
        else if (tickAnim >= 36 && tickAnim < 41) {
            xx = 22.56 + (((tickAnim - 36) / 5) * (2.85-(22.56)));
            yy = 0 + (((tickAnim - 36) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 36) / 5) * (0-(0)));
        }
        else if (tickAnim >= 41 && tickAnim < 50) {
            xx = 2.85 + (((tickAnim - 41) / 9) * (0-(2.85)));
            yy = 0 + (((tickAnim - 41) / 9) * (0-(0)));
            zz = 0 + (((tickAnim - 41) / 9) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tail6, tail6.rotateAngleX + (float) Math.toRadians(xx), tail6.rotateAngleY + (float) Math.toRadians(yy), tail6.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 18) {
            xx = 0 + (((tickAnim - 0) / 18) * (11.75-(0)));
            yy = 0 + (((tickAnim - 0) / 18) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 18) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 30) {
            xx = 11.75 + (((tickAnim - 18) / 12) * (11.75-(11.75)));
            yy = 0 + (((tickAnim - 18) / 12) * (0-(0)));
            zz = 0 + (((tickAnim - 18) / 12) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 36) {
            xx = 11.75 + (((tickAnim - 30) / 6) * (34.62-(11.75)));
            yy = 0 + (((tickAnim - 30) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 30) / 6) * (0-(0)));
        }
        else if (tickAnim >= 36 && tickAnim < 41) {
            xx = 34.62 + (((tickAnim - 36) / 5) * (-15.35-(34.62)));
            yy = 0 + (((tickAnim - 36) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 36) / 5) * (0-(0)));
        }
        else if (tickAnim >= 41 && tickAnim < 50) {
            xx = -15.35 + (((tickAnim - 41) / 9) * (0-(-15.35)));
            yy = 0 + (((tickAnim - 41) / 9) * (0-(0)));
            zz = 0 + (((tickAnim - 41) / 9) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tail7, tail7.rotateAngleX + (float) Math.toRadians(xx), tail7.rotateAngleY + (float) Math.toRadians(yy), tail7.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 18) {
            xx = 0 + (((tickAnim - 0) / 18) * (-17.75-(0)));
            yy = 0 + (((tickAnim - 0) / 18) * (-9.5-(0)));
            zz = 0 + (((tickAnim - 0) / 18) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 30) {
            xx = -17.75 + (((tickAnim - 18) / 12) * (-17.75-(-17.75)));
            yy = -9.5 + (((tickAnim - 18) / 12) * (-9.5-(-9.5)));
            zz = 0 + (((tickAnim - 18) / 12) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 50) {
            xx = -17.75 + (((tickAnim - 30) / 20) * (0-(-17.75)));
            yy = -9.5 + (((tickAnim - 30) / 20) * (0-(-9.5)));
            zz = 0 + (((tickAnim - 30) / 20) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightthigh, rightthigh.rotateAngleX + (float) Math.toRadians(xx), rightthigh.rotateAngleY + (float) Math.toRadians(yy), rightthigh.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 18) {
            xx = 0 + (((tickAnim - 0) / 18) * (46.5-(0)));
            yy = 0 + (((tickAnim - 0) / 18) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 18) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 30) {
            xx = 46.5 + (((tickAnim - 18) / 12) * (46.5-(46.5)));
            yy = 0 + (((tickAnim - 18) / 12) * (0-(0)));
            zz = 0 + (((tickAnim - 18) / 12) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 50) {
            xx = 46.5 + (((tickAnim - 30) / 20) * (0-(46.5)));
            yy = 0 + (((tickAnim - 30) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 30) / 20) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightshin, rightshin.rotateAngleX + (float) Math.toRadians(xx), rightshin.rotateAngleY + (float) Math.toRadians(yy), rightshin.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 18) {
            xx = 0 + (((tickAnim - 0) / 18) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 18) * (-0.825-(0)));
            zz = 0 + (((tickAnim - 0) / 18) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 30) {
            xx = 0 + (((tickAnim - 18) / 12) * (0-(0)));
            yy = -0.825 + (((tickAnim - 18) / 12) * (-0.825-(-0.825)));
            zz = 0 + (((tickAnim - 18) / 12) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 30) / 20) * (0-(0)));
            yy = -0.825 + (((tickAnim - 30) / 20) * (0-(-0.825)));
            zz = 0 + (((tickAnim - 30) / 20) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.rightshin.rotationPointX = this.rightshin.rotationPointX + (float)(xx);
        this.rightshin.rotationPointY = this.rightshin.rotationPointY - (float)(yy);
        this.rightshin.rotationPointZ = this.rightshin.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 18) {
            xx = 0 + (((tickAnim - 0) / 18) * (-61-(0)));
            yy = 0 + (((tickAnim - 0) / 18) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 18) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 30) {
            xx = -61 + (((tickAnim - 18) / 12) * (-61-(-61)));
            yy = 0 + (((tickAnim - 18) / 12) * (0-(0)));
            zz = 0 + (((tickAnim - 18) / 12) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 50) {
            xx = -61 + (((tickAnim - 30) / 20) * (0-(-61)));
            yy = 0 + (((tickAnim - 30) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 30) / 20) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightankle, rightankle.rotateAngleX + (float) Math.toRadians(xx), rightankle.rotateAngleY + (float) Math.toRadians(yy), rightankle.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 18) {
            xx = 0 + (((tickAnim - 0) / 18) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 18) * (-2.425-(0)));
            zz = 0 + (((tickAnim - 0) / 18) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 30) {
            xx = 0 + (((tickAnim - 18) / 12) * (0-(0)));
            yy = -2.425 + (((tickAnim - 18) / 12) * (-2.425-(-2.425)));
            zz = 0 + (((tickAnim - 18) / 12) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 30) / 20) * (0-(0)));
            yy = -2.425 + (((tickAnim - 30) / 20) * (0-(-2.425)));
            zz = 0 + (((tickAnim - 30) / 20) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.rightankle.rotationPointX = this.rightankle.rotationPointX + (float)(xx);
        this.rightankle.rotationPointY = this.rightankle.rotationPointY - (float)(yy);
        this.rightankle.rotationPointZ = this.rightankle.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 18) {
            xx = 0 + (((tickAnim - 0) / 18) * (40.75-(0)));
            yy = 0 + (((tickAnim - 0) / 18) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 18) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 30) {
            xx = 40.75 + (((tickAnim - 18) / 12) * (40.75-(40.75)));
            yy = 0 + (((tickAnim - 18) / 12) * (0-(0)));
            zz = 0 + (((tickAnim - 18) / 12) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 50) {
            xx = 40.75 + (((tickAnim - 30) / 20) * (0-(40.75)));
            yy = 0 + (((tickAnim - 30) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 30) / 20) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightfoot, rightfoot.rotateAngleX + (float) Math.toRadians(xx), rightfoot.rotateAngleY + (float) Math.toRadians(yy), rightfoot.rotateAngleZ + (float) Math.toRadians(zz));



        this.setRotateAngle(righttoes, righttoes.rotateAngleX + (float) Math.toRadians(0), righttoes.rotateAngleY + (float) Math.toRadians(0), righttoes.rotateAngleZ + (float) Math.toRadians(0));



        if (tickAnim >= 0 && tickAnim < 18) {
            xx = 0 + (((tickAnim - 0) / 18) * (-17.75-(0)));
            yy = 0 + (((tickAnim - 0) / 18) * (9.5-(0)));
            zz = 0 + (((tickAnim - 0) / 18) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 30) {
            xx = -17.75 + (((tickAnim - 18) / 12) * (-17.75-(-17.75)));
            yy = 9.5 + (((tickAnim - 18) / 12) * (9.5-(9.5)));
            zz = 0 + (((tickAnim - 18) / 12) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 50) {
            xx = -17.75 + (((tickAnim - 30) / 20) * (0-(-17.75)));
            yy = 9.5 + (((tickAnim - 30) / 20) * (0-(9.5)));
            zz = 0 + (((tickAnim - 30) / 20) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftthigh, leftthigh.rotateAngleX + (float) Math.toRadians(xx), leftthigh.rotateAngleY + (float) Math.toRadians(yy), leftthigh.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 18) {
            xx = 0 + (((tickAnim - 0) / 18) * (35.5-(0)));
            yy = 0 + (((tickAnim - 0) / 18) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 18) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 30) {
            xx = 35.5 + (((tickAnim - 18) / 12) * (35.5-(35.5)));
            yy = 0 + (((tickAnim - 18) / 12) * (0-(0)));
            zz = 0 + (((tickAnim - 18) / 12) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 50) {
            xx = 35.5 + (((tickAnim - 30) / 20) * (0-(35.5)));
            yy = 0 + (((tickAnim - 30) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 30) / 20) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftshin, leftshin.rotateAngleX + (float) Math.toRadians(xx), leftshin.rotateAngleY + (float) Math.toRadians(yy), leftshin.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 18) {
            xx = 0 + (((tickAnim - 0) / 18) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 18) * (-0.825-(0)));
            zz = 0 + (((tickAnim - 0) / 18) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 30) {
            xx = 0 + (((tickAnim - 18) / 12) * (0-(0)));
            yy = -0.825 + (((tickAnim - 18) / 12) * (-0.825-(-0.825)));
            zz = 0 + (((tickAnim - 18) / 12) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 30) / 20) * (0-(0)));
            yy = -0.825 + (((tickAnim - 30) / 20) * (0-(-0.825)));
            zz = 0 + (((tickAnim - 30) / 20) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.leftshin.rotationPointX = this.leftshin.rotationPointX + (float)(xx);
        this.leftshin.rotationPointY = this.leftshin.rotationPointY - (float)(yy);
        this.leftshin.rotationPointZ = this.leftshin.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 18) {
            xx = 0 + (((tickAnim - 0) / 18) * (-61-(0)));
            yy = 0 + (((tickAnim - 0) / 18) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 18) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 30) {
            xx = -61 + (((tickAnim - 18) / 12) * (-61-(-61)));
            yy = 0 + (((tickAnim - 18) / 12) * (0-(0)));
            zz = 0 + (((tickAnim - 18) / 12) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 50) {
            xx = -61 + (((tickAnim - 30) / 20) * (0-(-61)));
            yy = 0 + (((tickAnim - 30) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 30) / 20) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftankle, leftankle.rotateAngleX + (float) Math.toRadians(xx), leftankle.rotateAngleY + (float) Math.toRadians(yy), leftankle.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 18) {
            xx = 0 + (((tickAnim - 0) / 18) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 18) * (-2.425-(0)));
            zz = 0 + (((tickAnim - 0) / 18) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 30) {
            xx = 0 + (((tickAnim - 18) / 12) * (0-(0)));
            yy = -2.425 + (((tickAnim - 18) / 12) * (-2.425-(-2.425)));
            zz = 0 + (((tickAnim - 18) / 12) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 30) / 20) * (0-(0)));
            yy = -2.425 + (((tickAnim - 30) / 20) * (0-(-2.425)));
            zz = 0 + (((tickAnim - 30) / 20) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.leftankle.rotationPointX = this.leftankle.rotationPointX + (float)(xx);
        this.leftankle.rotationPointY = this.leftankle.rotationPointY - (float)(yy);
        this.leftankle.rotationPointZ = this.leftankle.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 18) {
            xx = 0 + (((tickAnim - 0) / 18) * (54.25-(0)));
            yy = 0 + (((tickAnim - 0) / 18) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 18) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 30) {
            xx = 54.25 + (((tickAnim - 18) / 12) * (54.25-(54.25)));
            yy = 0 + (((tickAnim - 18) / 12) * (0-(0)));
            zz = 0 + (((tickAnim - 18) / 12) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 50) {
            xx = 54.25 + (((tickAnim - 30) / 20) * (0-(54.25)));
            yy = 0 + (((tickAnim - 30) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 30) / 20) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftfoot, leftfoot.rotateAngleX + (float) Math.toRadians(xx), leftfoot.rotateAngleY + (float) Math.toRadians(yy), leftfoot.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 18) {
            xx = 0 + (((tickAnim - 0) / 18) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 18) * (0.025-(0)));
            zz = 0 + (((tickAnim - 0) / 18) * (-1.075-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 30) {
            xx = 0 + (((tickAnim - 18) / 12) * (0-(0)));
            yy = 0.025 + (((tickAnim - 18) / 12) * (0.025-(0.025)));
            zz = -1.075 + (((tickAnim - 18) / 12) * (-1.075-(-1.075)));
        }
        else if (tickAnim >= 30 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 30) / 20) * (0-(0)));
            yy = 0.025 + (((tickAnim - 30) / 20) * (0-(0.025)));
            zz = -1.075 + (((tickAnim - 30) / 20) * (0-(-1.075)));
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
        EntityPrehistoricFloraTyrannotitan entity = (EntityPrehistoricFloraTyrannotitan) entitylivingbaseIn;
        int animCycle = 50;
        double tickAnim = animTick + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;


        this.setRotateAngle(bodyfront, bodyfront.rotateAngleX + (float) Math.toRadians(0), bodyfront.rotateAngleY + (float) Math.toRadians(-9), bodyfront.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*144))*2));


        this.setRotateAngle(neckbase, neckbase.rotateAngleX + (float) Math.toRadians(12.70541), neckbase.rotateAngleY + (float) Math.toRadians(-8.22683), neckbase.rotateAngleZ + (float) Math.toRadians(0.62+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*144-30))*2));


        this.setRotateAngle(neckmiddlebase, neckmiddlebase.rotateAngleX + (float) Math.toRadians(8.25568), neckmiddlebase.rotateAngleY + (float) Math.toRadians(-6.24914), neckmiddlebase.rotateAngleZ + (float) Math.toRadians(-0.104+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*144-60))*2));


        this.setRotateAngle(neckmiddleend, neckmiddleend.rotateAngleX + (float) Math.toRadians(4.64448), neckmiddleend.rotateAngleY + (float) Math.toRadians(-7.70912), neckmiddleend.rotateAngleZ + (float) Math.toRadians(-2.1441+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*144-90))*2));


        this.setRotateAngle(neckend, neckend.rotateAngleX + (float) Math.toRadians(0), neckend.rotateAngleY + (float) Math.toRadians(-10.25), neckend.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(head, head.rotateAngleX + (float) Math.toRadians(0), head.rotateAngleY + (float) Math.toRadians(-8), head.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(tail1, tail1.rotateAngleX + (float) Math.toRadians(0), tail1.rotateAngleY + (float) Math.toRadians(0), tail1.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*144+90))*2));


        this.setRotateAngle(tail2, tail2.rotateAngleX + (float) Math.toRadians(0), tail2.rotateAngleY + (float) Math.toRadians(0), tail2.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*144+120))*2));


        this.setRotateAngle(tail3, tail3.rotateAngleX + (float) Math.toRadians(0), tail3.rotateAngleY + (float) Math.toRadians(0), tail3.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*144+150))*2));


        this.setRotateAngle(tail4, tail4.rotateAngleX + (float) Math.toRadians(0), tail4.rotateAngleY + (float) Math.toRadians(0), tail4.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*144+170))*2));


        this.setRotateAngle(tail5, tail5.rotateAngleX + (float) Math.toRadians(0), tail5.rotateAngleY + (float) Math.toRadians(0), tail5.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*144+170))*2));


        this.setRotateAngle(tail6, tail6.rotateAngleX + (float) Math.toRadians(0), tail6.rotateAngleY + (float) Math.toRadians(0), tail6.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*144+190))*-4));


        this.setRotateAngle(tail7, tail7.rotateAngleX + (float) Math.toRadians(0), tail7.rotateAngleY + (float) Math.toRadians(0), tail7.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*144+220))*-6));



        if (tickAnim >= 0 && tickAnim < 23) {
            xx = -11.75 + (((tickAnim - 0) / 23) * (11.5-(-11.75)));
            yy = 0 + (((tickAnim - 0) / 23) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 23) * (0-(0)));
        }
        else if (tickAnim >= 23 && tickAnim < 50) {
            xx = 11.5 + (((tickAnim - 23) / 27) * (-11.75-(11.5)));
            yy = 0 + (((tickAnim - 23) / 27) * (0-(0)));
            zz = 0 + (((tickAnim - 23) / 27) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightthigh, rightthigh.rotateAngleX + (float) Math.toRadians(xx), rightthigh.rotateAngleY + (float) Math.toRadians(yy), rightthigh.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 23) {
            xx = -8.75 + (((tickAnim - 0) / 23) * (23.5-(-8.75)));
            yy = 0 + (((tickAnim - 0) / 23) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 23) * (0-(0)));
        }
        else if (tickAnim >= 23 && tickAnim < 50) {
            xx = 23.5 + (((tickAnim - 23) / 27) * (-8.75-(23.5)));
            yy = 0 + (((tickAnim - 23) / 27) * (0-(0)));
            zz = 0 + (((tickAnim - 23) / 27) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightshin, rightshin.rotateAngleX + (float) Math.toRadians(xx), rightshin.rotateAngleY + (float) Math.toRadians(yy), rightshin.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 23) {
            xx = 0 + (((tickAnim - 0) / 23) * (0-(0)));
            yy = -1.375 + (((tickAnim - 0) / 23) * (0-(-1.375)));
            zz = 0 + (((tickAnim - 0) / 23) * (0-(0)));
        }
        else if (tickAnim >= 23 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 23) / 27) * (0-(0)));
            yy = 0 + (((tickAnim - 23) / 27) * (-1.375-(0)));
            zz = 0 + (((tickAnim - 23) / 27) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.rightshin.rotationPointX = this.rightshin.rotationPointX + (float)(xx);
        this.rightshin.rotationPointY = this.rightshin.rotationPointY - (float)(yy);
        this.rightshin.rotationPointZ = this.rightshin.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 23) {
            xx = -9 + (((tickAnim - 0) / 23) * (8.5-(-9)));
            yy = 0 + (((tickAnim - 0) / 23) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 23) * (0-(0)));
        }
        else if (tickAnim >= 23 && tickAnim < 33) {
            xx = 8.5 + (((tickAnim - 23) / 10) * (-55.24-(8.5)));
            yy = 0 + (((tickAnim - 23) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 23) / 10) * (0-(0)));
        }
        else if (tickAnim >= 33 && tickAnim < 43) {
            xx = -55.24 + (((tickAnim - 33) / 10) * (-55.24-(-55.24)));
            yy = 0 + (((tickAnim - 33) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 33) / 10) * (0-(0)));
        }
        else if (tickAnim >= 43 && tickAnim < 50) {
            xx = -55.24 + (((tickAnim - 43) / 7) * (-9-(-55.24)));
            yy = 0 + (((tickAnim - 43) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 43) / 7) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightankle, rightankle.rotateAngleX + (float) Math.toRadians(xx), rightankle.rotateAngleY + (float) Math.toRadians(yy), rightankle.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 23) {
            xx = 0 + (((tickAnim - 0) / 23) * (0-(0)));
            yy = -1.325 + (((tickAnim - 0) / 23) * (0-(-1.325)));
            zz = 0 + (((tickAnim - 0) / 23) * (0-(0)));
        }
        else if (tickAnim >= 23 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 23) / 27) * (0-(0)));
            yy = 0 + (((tickAnim - 23) / 27) * (-1.325-(0)));
            zz = 0 + (((tickAnim - 23) / 27) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.rightankle.rotationPointX = this.rightankle.rotationPointX + (float)(xx);
        this.rightankle.rotationPointY = this.rightankle.rotationPointY - (float)(yy);
        this.rightankle.rotationPointZ = this.rightankle.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 23) {
            xx = 29.5 + (((tickAnim - 0) / 23) * (54-(29.5)));
            yy = 0 + (((tickAnim - 0) / 23) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 23) * (0-(0)));
        }
        else if (tickAnim >= 23 && tickAnim < 33) {
            xx = 54 + (((tickAnim - 23) / 10) * (78.77-(54)));
            yy = 0 + (((tickAnim - 23) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 23) / 10) * (0-(0)));
        }
        else if (tickAnim >= 33 && tickAnim < 43) {
            xx = 78.77 + (((tickAnim - 33) / 10) * (78.77-(78.77)));
            yy = 0 + (((tickAnim - 33) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 33) / 10) * (0-(0)));
        }
        else if (tickAnim >= 43 && tickAnim < 50) {
            xx = 78.77 + (((tickAnim - 43) / 7) * (29.5-(78.77)));
            yy = 0 + (((tickAnim - 43) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 43) / 7) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightfoot, rightfoot.rotateAngleX + (float) Math.toRadians(xx), rightfoot.rotateAngleY + (float) Math.toRadians(yy), rightfoot.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 10) * (2.475-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 23) {
            xx = 0 + (((tickAnim - 10) / 13) * (0-(0)));
            yy = 2.475 + (((tickAnim - 10) / 13) * (0-(2.475)));
            zz = 0 + (((tickAnim - 10) / 13) * (0-(0)));
        }
        else if (tickAnim >= 23 && tickAnim < 33) {
            xx = 0 + (((tickAnim - 23) / 10) * (0-(0)));
            yy = 0 + (((tickAnim - 23) / 10) * (2.05-(0)));
            zz = 0 + (((tickAnim - 23) / 10) * (-1.125-(0)));
        }
        else if (tickAnim >= 33 && tickAnim < 43) {
            xx = 0 + (((tickAnim - 33) / 10) * (0-(0)));
            yy = 2.05 + (((tickAnim - 33) / 10) * (2.05-(2.05)));
            zz = -1.125 + (((tickAnim - 33) / 10) * (-1.125-(-1.125)));
        }
        else if (tickAnim >= 43 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 43) / 7) * (0-(0)));
            yy = 2.05 + (((tickAnim - 43) / 7) * (0-(2.05)));
            zz = -1.125 + (((tickAnim - 43) / 7) * (0-(-1.125)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.rightfoot.rotationPointX = this.rightfoot.rotationPointX + (float)(xx);
        this.rightfoot.rotationPointY = this.rightfoot.rotationPointY - (float)(yy);
        this.rightfoot.rotationPointZ = this.rightfoot.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 0) / 10) * (-40.43-(0)));
            yy = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 23) {
            xx = -40.43 + (((tickAnim - 10) / 13) * (41-(-40.43)));
            yy = 0 + (((tickAnim - 10) / 13) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 13) * (0-(0)));
        }
        else if (tickAnim >= 23 && tickAnim < 50) {
            xx = 41 + (((tickAnim - 23) / 27) * (0-(41)));
            yy = 0 + (((tickAnim - 23) / 27) * (0-(0)));
            zz = 0 + (((tickAnim - 23) / 27) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(righttoes, righttoes.rotateAngleX + (float) Math.toRadians(xx), righttoes.rotateAngleY + (float) Math.toRadians(yy), righttoes.rotateAngleZ + (float) Math.toRadians(zz));



    }

    public void animEat(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime, double animTick) {
        EntityPrehistoricFloraTyrannotitan entity = (EntityPrehistoricFloraTyrannotitan) entitylivingbaseIn;
        int animCycle = 20;
        double tickAnim = animTick + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;
         if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 0) / 10) * (8-(0)));
            yy = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 12) {
            xx = 8 + (((tickAnim - 10) / 2) * (7.5-(8)));
            yy = 0 + (((tickAnim - 10) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 2) * (0-(0)));
        }
        else if (tickAnim >= 12 && tickAnim < 20) {
            xx = 7.5 + (((tickAnim - 12) / 8) * (0-(7.5)));
            yy = 0 + (((tickAnim - 12) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 12) / 8) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(bodymiddle, bodymiddle.rotateAngleX + (float) Math.toRadians(xx), bodymiddle.rotateAngleY + (float) Math.toRadians(yy), bodymiddle.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 0) / 10) * (6.25-(0)));
            yy = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 12) {
            xx = 6.25 + (((tickAnim - 10) / 2) * (5.25-(6.25)));
            yy = 0 + (((tickAnim - 10) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 2) * (0-(0)));
        }
        else if (tickAnim >= 12 && tickAnim < 20) {
            xx = 5.25 + (((tickAnim - 12) / 8) * (0-(5.25)));
            yy = 0 + (((tickAnim - 12) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 12) / 8) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(bodyfront, bodyfront.rotateAngleX + (float) Math.toRadians(xx), bodyfront.rotateAngleY + (float) Math.toRadians(yy), bodyfront.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 0) / 10) * (25.5-(0)));
            yy = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 12) {
            xx = 25.5 + (((tickAnim - 10) / 2) * (21-(25.5)));
            yy = 0 + (((tickAnim - 10) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 2) * (0-(0)));
        }
        else if (tickAnim >= 12 && tickAnim < 20) {
            xx = 21 + (((tickAnim - 12) / 8) * (0-(21)));
            yy = 0 + (((tickAnim - 12) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 12) / 8) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neckbase, neckbase.rotateAngleX + (float) Math.toRadians(xx), neckbase.rotateAngleY + (float) Math.toRadians(yy), neckbase.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 0) / 10) * (23.5-(0)));
            yy = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 20) {
            xx = 23.5 + (((tickAnim - 10) / 10) * (0-(23.5)));
            yy = 0 + (((tickAnim - 10) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 10) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neckmiddlebase, neckmiddlebase.rotateAngleX + (float) Math.toRadians(xx), neckmiddlebase.rotateAngleY + (float) Math.toRadians(yy), neckmiddlebase.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 12) {
            xx = 0 + (((tickAnim - 0) / 12) * (1.5-(0)));
            yy = 0 + (((tickAnim - 0) / 12) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 12) * (0-(0)));
        }
        else if (tickAnim >= 12 && tickAnim < 20) {
            xx = 1.5 + (((tickAnim - 12) / 8) * (0-(1.5)));
            yy = 0 + (((tickAnim - 12) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 12) / 8) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neckmiddleend, neckmiddleend.rotateAngleX + (float) Math.toRadians(xx), neckmiddleend.rotateAngleY + (float) Math.toRadians(yy), neckmiddleend.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 12) {
            xx = 0 + (((tickAnim - 0) / 12) * (5.5-(0)));
            yy = 0 + (((tickAnim - 0) / 12) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 12) * (0-(0)));
        }
        else if (tickAnim >= 12 && tickAnim < 15) {
            xx = 5.5 + (((tickAnim - 12) / 3) * (7.55-(5.5)));
            yy = 0 + (((tickAnim - 12) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 12) / 3) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 20) {
            xx = 7.55 + (((tickAnim - 15) / 5) * (0-(7.55)));
            yy = 0 + (((tickAnim - 15) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 5) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neckend, neckend.rotateAngleX + (float) Math.toRadians(xx), neckend.rotateAngleY + (float) Math.toRadians(yy), neckend.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 12) {
            xx = 0 + (((tickAnim - 0) / 12) * (6.25-(0)));
            yy = 0 + (((tickAnim - 0) / 12) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 12) * (0-(0)));
        }
        else if (tickAnim >= 12 && tickAnim < 15) {
            xx = 6.25 + (((tickAnim - 12) / 3) * (14.75-(6.25)));
            yy = 0 + (((tickAnim - 12) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 12) / 3) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 20) {
            xx = 14.75 + (((tickAnim - 15) / 5) * (0-(14.75)));
            yy = 0 + (((tickAnim - 15) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 5) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(head, head.rotateAngleX + (float) Math.toRadians(xx), head.rotateAngleY + (float) Math.toRadians(yy), head.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 0) / 8) * (13.75-(0)));
            yy = 0 + (((tickAnim - 0) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 8) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 10) {
            xx = 13.75 + (((tickAnim - 8) / 2) * (0-(13.75)));
            yy = 0 + (((tickAnim - 8) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 2) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(lowerjawback, lowerjawback.rotateAngleX + (float) Math.toRadians(xx), lowerjawback.rotateAngleY + (float) Math.toRadians(yy), lowerjawback.rotateAngleZ + (float) Math.toRadians(zz));



    }

    public void animRoar(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime, double animTick) {
        EntityPrehistoricFloraTyrannotitan entity = (EntityPrehistoricFloraTyrannotitan) entitylivingbaseIn;
        int animCycle = 100;
        double tickAnim = animTick + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;
         if (tickAnim >= 0 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 0) / 20) * (0.8937+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120))*-4-(0)));
            yy = 0 + (((tickAnim - 0) / 20) * (-11.24982-(0)));
            zz = 0 + (((tickAnim - 0) / 20) * (0.06365-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 35) {
            xx = 0.8937+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120))*-4 + (((tickAnim - 20) / 15) * (-2.0045+Math.sin((Math.PI/180)*(((double)tickAnim/20)*150-20))*-3-(0.8937+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120))*-4)));
            yy = -11.24982 + (((tickAnim - 20) / 15) * (-6.77353-(-11.24982)));
            zz = 0.06365 + (((tickAnim - 20) / 15) * (0.53086-(0.06365)));
        }
        else if (tickAnim >= 35 && tickAnim < 50) {
            xx = -2.0045+Math.sin((Math.PI/180)*(((double)tickAnim/20)*150-20))*-3 + (((tickAnim - 35) / 15) * (-1.34876-(-2.0045+Math.sin((Math.PI/180)*(((double)tickAnim/20)*150-20))*-3)));
            yy = -6.77353 + (((tickAnim - 35) / 15) * (-6.28397-(-6.77353)));
            zz = 0.53086 + (((tickAnim - 35) / 15) * (0.73331-(0.53086)));
        }
        else if (tickAnim >= 50 && tickAnim < 65) {
            xx = -1.34876 + (((tickAnim - 50) / 15) * (8.15124-(-1.34876)));
            yy = -6.28397 + (((tickAnim - 50) / 15) * (-6.28397-(-6.28397)));
            zz = 0.73331 + (((tickAnim - 50) / 15) * (0.73331-(0.73331)));
        }
        else if (tickAnim >= 65 && tickAnim < 101) {
            xx = 8.15124 + (((tickAnim - 65) / 36) * (0-(8.15124)));
            yy = -6.28397 + (((tickAnim - 65) / 36) * (0-(-6.28397)));
            zz = 0.73331 + (((tickAnim - 65) / 36) * (0-(0.73331)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(hips, hips.rotateAngleX + (float) Math.toRadians(xx), hips.rotateAngleY + (float) Math.toRadians(yy), hips.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 0) / 20) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 20) * (-9.025-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 28) {
            xx = 0 + (((tickAnim - 20) / 8) * (0-(0)));
            yy = 0 + (((tickAnim - 20) / 8) * (0.55-(0)));
            zz = -9.025 + (((tickAnim - 20) / 8) * (-11.925-(-9.025)));
        }
        else if (tickAnim >= 28 && tickAnim < 35) {
            xx = 0 + (((tickAnim - 28) / 7) * (0-(0)));
            yy = 0.55 + (((tickAnim - 28) / 7) * (0.125-(0.55)));
            zz = -11.925 + (((tickAnim - 28) / 7) * (-14.83-(-11.925)));
        }
        else if (tickAnim >= 35 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 35) / 15) * (0-(0)));
            yy = 0.125 + (((tickAnim - 35) / 15) * (0.125-(0.125)));
            zz = -14.83 + (((tickAnim - 35) / 15) * (-14.83-(-14.83)));
        }
        else if (tickAnim >= 50 && tickAnim < 60) {
            xx = 0 + (((tickAnim - 50) / 10) * (0-(0)));
            yy = 0.125 + (((tickAnim - 50) / 10) * (0.13-(0.125)));
            zz = -14.83 + (((tickAnim - 50) / 10) * (-21.905-(-14.83)));
        }
        else if (tickAnim >= 60 && tickAnim < 65) {
            xx = 0 + (((tickAnim - 60) / 5) * (0-(0)));
            yy = 0.13 + (((tickAnim - 60) / 5) * (0.13-(0.13)));
            zz = -21.905 + (((tickAnim - 60) / 5) * (-21.905-(-21.905)));
        }
        else if (tickAnim >= 65 && tickAnim < 101) {
            xx = 0 + (((tickAnim - 65) / 36) * (0-(0)));
            yy = 0.13 + (((tickAnim - 65) / 36) * (0-(0.13)));
            zz = -21.905 + (((tickAnim - 65) / 36) * (0-(-21.905)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.hips.rotationPointX = this.hips.rotationPointX + (float)(xx);
        this.hips.rotationPointY = this.hips.rotationPointY - (float)(yy);
        this.hips.rotationPointZ = this.hips.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 0) / 20) * (4.5-(0)));
            yy = 0 + (((tickAnim - 0) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 20) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 28) {
            xx = 4.5 + (((tickAnim - 20) / 8) * (5.5-(4.5)));
            yy = 0 + (((tickAnim - 20) / 8) * (3.75-(0)));
            zz = 0 + (((tickAnim - 20) / 8) * (0-(0)));
        }
        else if (tickAnim >= 28 && tickAnim < 35) {
            xx = 5.5 + (((tickAnim - 28) / 7) * (0-(5.5)));
            yy = 3.75 + (((tickAnim - 28) / 7) * (6.75-(3.75)));
            zz = 0 + (((tickAnim - 28) / 7) * (0-(0)));
        }
        else if (tickAnim >= 35 && tickAnim < 43) {
            xx = 0 + (((tickAnim - 35) / 8) * (0-(0)));
            yy = 6.75 + (((tickAnim - 35) / 8) * (9.5-(6.75)));
            zz = 0 + (((tickAnim - 35) / 8) * (0-(0)));
        }
        else if (tickAnim >= 43 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 43) / 7) * (0-(0)));
            yy = 9.5 + (((tickAnim - 43) / 7) * (10.75-(9.5)));
            zz = 0 + (((tickAnim - 43) / 7) * (0-(0)));
        }
        else if (tickAnim >= 50 && tickAnim < 56) {
            xx = 0 + (((tickAnim - 50) / 6) * (2-(0)));
            yy = 10.75 + (((tickAnim - 50) / 6) * (10.75-(10.75)));
            zz = 0 + (((tickAnim - 50) / 6) * (0-(0)));
        }
        else if (tickAnim >= 56 && tickAnim < 65) {
            xx = 2 + (((tickAnim - 56) / 9) * (-0.5-(2)));
            yy = 10.75 + (((tickAnim - 56) / 9) * (10.75-(10.75)));
            zz = 0 + (((tickAnim - 56) / 9) * (0-(0)));
        }
        else if (tickAnim >= 65 && tickAnim < 101) {
            xx = -0.5 + (((tickAnim - 65) / 36) * (0-(-0.5)));
            yy = 10.75 + (((tickAnim - 65) / 36) * (0-(10.75)));
            zz = 0 + (((tickAnim - 65) / 36) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(bodymiddle, bodymiddle.rotateAngleX + (float) Math.toRadians(xx), bodymiddle.rotateAngleY + (float) Math.toRadians(yy), bodymiddle.rotateAngleZ + (float) Math.toRadians(zz));

        this.bodymiddle.rotationPointX = this.bodymiddle.rotationPointX + (float)(0);
        this.bodymiddle.rotationPointY = this.bodymiddle.rotationPointY - (float)(0);
        this.bodymiddle.rotationPointZ = this.bodymiddle.rotationPointZ + (float)(0);



        if (tickAnim >= 0 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 0) / 20) * (7.25-(0)));
            yy = 0 + (((tickAnim - 0) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 20) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 28) {
            xx = 7.25 + (((tickAnim - 20) / 8) * (6.33333-(7.25)));
            yy = 0 + (((tickAnim - 20) / 8) * (5.41667-(0)));
            zz = 0 + (((tickAnim - 20) / 8) * (0-(0)));
        }
        else if (tickAnim >= 28 && tickAnim < 35) {
            xx = 6.33333 + (((tickAnim - 28) / 7) * (2.25-(6.33333)));
            yy = 5.41667 + (((tickAnim - 28) / 7) * (9.75-(5.41667)));
            zz = 0 + (((tickAnim - 28) / 7) * (0-(0)));
        }
        else if (tickAnim >= 35 && tickAnim < 43) {
            xx = 2.25 + (((tickAnim - 35) / 8) * (3.95476-(2.25)));
            yy = 9.75 + (((tickAnim - 35) / 8) * (8.81717-(9.75)));
            zz = 0 + (((tickAnim - 35) / 8) * (-0.31018-(0)));
        }
        else if (tickAnim >= 43 && tickAnim < 50) {
            xx = 3.95476 + (((tickAnim - 43) / 7) * (3.96121-(3.95476)));
            yy = 8.81717 + (((tickAnim - 43) / 7) * (8.46562-(8.81717)));
            zz = -0.31018 + (((tickAnim - 43) / 7) * (-0.28175-(-0.31018)));
        }
        else if (tickAnim >= 50 && tickAnim < 56) {
            xx = 3.96121 + (((tickAnim - 50) / 6) * (7.21121-(3.96121)));
            yy = 8.46562 + (((tickAnim - 50) / 6) * (8.46562-(8.46562)));
            zz = -0.28175 + (((tickAnim - 50) / 6) * (-0.28175-(-0.28175)));
        }
        else if (tickAnim >= 56 && tickAnim < 65) {
            xx = 7.21121 + (((tickAnim - 56) / 9) * (3.96121-(7.21121)));
            yy = 8.46562 + (((tickAnim - 56) / 9) * (8.46562-(8.46562)));
            zz = -0.28175 + (((tickAnim - 56) / 9) * (-0.28175-(-0.28175)));
        }
        else if (tickAnim >= 65 && tickAnim < 101) {
            xx = 3.96121 + (((tickAnim - 65) / 36) * (0-(3.96121)));
            yy = 8.46562 + (((tickAnim - 65) / 36) * (0-(8.46562)));
            zz = -0.28175 + (((tickAnim - 65) / 36) * (0-(-0.28175)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(bodyfront, bodyfront.rotateAngleX + (float) Math.toRadians(xx), bodyfront.rotateAngleY + (float) Math.toRadians(yy), bodyfront.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 0) / 20) * (21.8713+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120))*-10-(0)));
            yy = 0 + (((tickAnim - 0) / 20) * (-3.99857-(0)));
            zz = 0 + (((tickAnim - 0) / 20) * (0.10698-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 28) {
            xx = 21.8713+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120))*-10 + (((tickAnim - 20) / 8) * (11.7321+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120))*4-(21.8713+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120))*-10)));
            yy = -3.99857 + (((tickAnim - 20) / 8) * (0.41078-(-3.99857)));
            zz = 0.10698 + (((tickAnim - 20) / 8) * (0.6648-(0.10698)));
        }
        else if (tickAnim >= 28 && tickAnim < 35) {
            xx = 11.7321+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120))*4 + (((tickAnim - 28) / 7) * (4.37074-(11.7321+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120))*4)));
            yy = 0.41078 + (((tickAnim - 28) / 7) * (3.93827-(0.41078)));
            zz = 0.6648 + (((tickAnim - 28) / 7) * (1.11105-(0.6648)));
        }
        else if (tickAnim >= 35 && tickAnim < 43) {
            xx = 4.37074 + (((tickAnim - 35) / 8) * (-0.13167-(4.37074)));
            yy = 3.93827 + (((tickAnim - 35) / 8) * (5.16686-(3.93827)));
            zz = 1.11105 + (((tickAnim - 35) / 8) * (-0.6242-(1.11105)));
        }
        else if (tickAnim >= 43 && tickAnim < 50) {
            xx = -0.13167 + (((tickAnim - 43) / 7) * (-1.31673-(-0.13167)));
            yy = 5.16686 + (((tickAnim - 43) / 7) * (2.08256-(5.16686)));
            zz = -0.6242 + (((tickAnim - 43) / 7) * (0.40247-(-0.6242)));
        }
        else if (tickAnim >= 50 && tickAnim < 56) {
            xx = -1.31673 + (((tickAnim - 50) / 6) * (5.68327-(-1.31673)));
            yy = 2.08256 + (((tickAnim - 50) / 6) * (2.08256-(2.08256)));
            zz = 0.40247 + (((tickAnim - 50) / 6) * (0.40247-(0.40247)));
        }
        else if (tickAnim >= 56 && tickAnim < 65) {
            xx = 5.68327 + (((tickAnim - 56) / 9) * (0.93327-(5.68327)));
            yy = 2.08256 + (((tickAnim - 56) / 9) * (2.08256-(2.08256)));
            zz = 0.40247 + (((tickAnim - 56) / 9) * (0.40247-(0.40247)));
        }
        else if (tickAnim >= 65 && tickAnim < 101) {
            xx = 0.93327 + (((tickAnim - 65) / 36) * (0-(0.93327)));
            yy = 2.08256 + (((tickAnim - 65) / 36) * (0-(2.08256)));
            zz = 0.40247 + (((tickAnim - 65) / 36) * (0-(0.40247)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neckbase, neckbase.rotateAngleX + (float) Math.toRadians(xx), neckbase.rotateAngleY + (float) Math.toRadians(yy), neckbase.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 0) / 20) * (5.7338-(0)));
            yy = 0 + (((tickAnim - 0) / 20) * (-8.24696-(0)));
            zz = 0 + (((tickAnim - 0) / 20) * (0.22471-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 28) {
            xx = 5.7338 + (((tickAnim - 20) / 8) * (2.41884-(5.7338)));
            yy = -8.24696 + (((tickAnim - 20) / 8) * (6.47903-(-8.24696)));
            zz = 0.22471 + (((tickAnim - 20) / 8) * (0.40887-(0.22471)));
        }
        else if (tickAnim >= 28 && tickAnim < 31) {
            xx = 2.41884 + (((tickAnim - 28) / 3) * (-0.62964-(2.41884)));
            yy = 6.47903 + (((tickAnim - 28) / 3) * (4.39154-(6.47903)));
            zz = 0.40887 + (((tickAnim - 28) / 3) * (0.45197-(0.40887)));
        }
        else if (tickAnim >= 31 && tickAnim < 35) {
            xx = -0.62964 + (((tickAnim - 31) / 4) * (-5.13604-(-0.62964)));
            yy = 4.39154 + (((tickAnim - 31) / 4) * (0.74799-(4.39154)));
            zz = 0.45197 + (((tickAnim - 31) / 4) * (0.52719-(0.45197)));
        }
        else if (tickAnim >= 35 && tickAnim < 43) {
            xx = -5.13604 + (((tickAnim - 35) / 8) * (-7.80151-(-5.13604)));
            yy = 0.74799 + (((tickAnim - 35) / 8) * (-2.66773-(0.74799)));
            zz = 0.52719 + (((tickAnim - 35) / 8) * (-0.08396-(0.52719)));
        }
        else if (tickAnim >= 43 && tickAnim < 50) {
            xx = -7.80151 + (((tickAnim - 43) / 7) * (-9.80151-(-7.80151)));
            yy = -2.66773 + (((tickAnim - 43) / 7) * (-2.66773-(-2.66773)));
            zz = -0.08396 + (((tickAnim - 43) / 7) * (-0.08396-(-0.08396)));
        }
        else if (tickAnim >= 50 && tickAnim < 56) {
            xx = -9.80151 + (((tickAnim - 50) / 6) * (-1.55151-(-9.80151)));
            yy = -2.66773 + (((tickAnim - 50) / 6) * (-2.66773-(-2.66773)));
            zz = -0.08396 + (((tickAnim - 50) / 6) * (-0.08396-(-0.08396)));
        }
        else if (tickAnim >= 56 && tickAnim < 65) {
            xx = -1.55151 + (((tickAnim - 56) / 9) * (-6.55151-(-1.55151)));
            yy = -2.66773 + (((tickAnim - 56) / 9) * (-2.66773-(-2.66773)));
            zz = -0.08396 + (((tickAnim - 56) / 9) * (-0.08396-(-0.08396)));
        }
        else if (tickAnim >= 65 && tickAnim < 101) {
            xx = -6.55151 + (((tickAnim - 65) / 36) * (0-(-6.55151)));
            yy = -2.66773 + (((tickAnim - 65) / 36) * (0-(-2.66773)));
            zz = -0.08396 + (((tickAnim - 65) / 36) * (0-(-0.08396)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neckmiddlebase, neckmiddlebase.rotateAngleX + (float) Math.toRadians(xx), neckmiddlebase.rotateAngleY + (float) Math.toRadians(yy), neckmiddlebase.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 0) / 20) * (0.42942-(0)));
            yy = 0 + (((tickAnim - 0) / 20) * (3.58719-(0)));
            zz = 0 + (((tickAnim - 0) / 20) * (5.90197-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 28) {
            xx = 0.42942 + (((tickAnim - 20) / 8) * (-12.31121-(0.42942)));
            yy = 3.58719 + (((tickAnim - 20) / 8) * (4.34815-(3.58719)));
            zz = 5.90197 + (((tickAnim - 20) / 8) * (3.54158-(5.90197)));
        }
        else if (tickAnim >= 28 && tickAnim < 31) {
            xx = -12.31121 + (((tickAnim - 28) / 3) * (-13.55881-(-12.31121)));
            yy = 4.34815 + (((tickAnim - 28) / 3) * (1.76205-(4.34815)));
            zz = 3.54158 + (((tickAnim - 28) / 3) * (2.24179-(3.54158)));
        }
        else if (tickAnim >= 31 && tickAnim < 35) {
            xx = -13.55881 + (((tickAnim - 31) / 4) * (-5.49341-(-13.55881)));
            yy = 1.76205 + (((tickAnim - 31) / 4) * (-3.13675-(1.76205)));
            zz = 2.24179 + (((tickAnim - 31) / 4) * (-0.22036-(2.24179)));
        }
        else if (tickAnim >= 35 && tickAnim < 43) {
            xx = -5.49341 + (((tickAnim - 35) / 8) * (0.1067-(-5.49341)));
            yy = -3.13675 + (((tickAnim - 35) / 8) * (-7.9491-(-3.13675)));
            zz = -0.22036 + (((tickAnim - 35) / 8) * (-1.35465-(-0.22036)));
        }
        else if (tickAnim >= 43 && tickAnim < 50) {
            xx = 0.1067 + (((tickAnim - 43) / 7) * (3.1067-(0.1067)));
            yy = -7.9491 + (((tickAnim - 43) / 7) * (-7.9491-(-7.9491)));
            zz = -1.35465 + (((tickAnim - 43) / 7) * (-1.35465-(-1.35465)));
        }
        else if (tickAnim >= 50 && tickAnim < 56) {
            xx = 3.1067 + (((tickAnim - 50) / 6) * (1.1067-(3.1067)));
            yy = -7.9491 + (((tickAnim - 50) / 6) * (-7.9491-(-7.9491)));
            zz = -1.35465 + (((tickAnim - 50) / 6) * (-1.35465-(-1.35465)));
        }
        else if (tickAnim >= 56 && tickAnim < 65) {
            xx = 1.1067 + (((tickAnim - 56) / 9) * (-4.1433-(1.1067)));
            yy = -7.9491 + (((tickAnim - 56) / 9) * (-7.9491-(-7.9491)));
            zz = -1.35465 + (((tickAnim - 56) / 9) * (-1.35465-(-1.35465)));
        }
        else if (tickAnim >= 65 && tickAnim < 101) {
            xx = -4.1433 + (((tickAnim - 65) / 36) * (0-(-4.1433)));
            yy = -7.9491 + (((tickAnim - 65) / 36) * (0-(-7.9491)));
            zz = -1.35465 + (((tickAnim - 65) / 36) * (0-(-1.35465)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neckmiddleend, neckmiddleend.rotateAngleX + (float) Math.toRadians(xx), neckmiddleend.rotateAngleY + (float) Math.toRadians(yy), neckmiddleend.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 0) / 20) * (1.45256-(0)));
            yy = 0 + (((tickAnim - 0) / 20) * (6.31801-(0)));
            zz = 0 + (((tickAnim - 0) / 20) * (5.3598-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 28) {
            xx = 1.45256 + (((tickAnim - 20) / 8) * (-13.40907-(1.45256)));
            yy = 6.31801 + (((tickAnim - 20) / 8) * (0.43909-(6.31801)));
            zz = 5.3598 + (((tickAnim - 20) / 8) * (2.68293-(5.3598)));
        }
        else if (tickAnim >= 28 && tickAnim < 31) {
            xx = -13.40907 + (((tickAnim - 28) / 3) * (-18.73145-(-13.40907)));
            yy = 0.43909 + (((tickAnim - 28) / 3) * (-0.8308-(0.43909)));
            zz = 2.68293 + (((tickAnim - 28) / 3) * (2.10471-(2.68293)));
        }
        else if (tickAnim >= 31 && tickAnim < 35) {
            xx = -18.73145 + (((tickAnim - 31) / 4) * (-13.02213-(-18.73145)));
            yy = -0.8308 + (((tickAnim - 31) / 4) * (-4.6062-(-0.8308)));
            zz = 2.10471 + (((tickAnim - 31) / 4) * (0.38565-(2.10471)));
        }
        else if (tickAnim >= 35 && tickAnim < 43) {
            xx = -13.02213 + (((tickAnim - 35) / 8) * (-4.06218-(-13.02213)));
            yy = -4.6062 + (((tickAnim - 35) / 8) * (-8.45158-(-4.6062)));
            zz = 0.38565 + (((tickAnim - 35) / 8) * (-1.92614-(0.38565)));
        }
        else if (tickAnim >= 43 && tickAnim < 50) {
            xx = -4.06218 + (((tickAnim - 43) / 7) * (-0.31218-(-4.06218)));
            yy = -8.45158 + (((tickAnim - 43) / 7) * (-8.45158-(-8.45158)));
            zz = -1.92614 + (((tickAnim - 43) / 7) * (-1.92614-(-1.92614)));
        }
        else if (tickAnim >= 50 && tickAnim < 56) {
            xx = -0.31218 + (((tickAnim - 50) / 6) * (-17.31218-(-0.31218)));
            yy = -8.45158 + (((tickAnim - 50) / 6) * (-8.45158-(-8.45158)));
            zz = -1.92614 + (((tickAnim - 50) / 6) * (-1.92614-(-1.92614)));
        }
        else if (tickAnim >= 56 && tickAnim < 65) {
            xx = -17.31218 + (((tickAnim - 56) / 9) * (-14.56218-(-17.31218)));
            yy = -8.45158 + (((tickAnim - 56) / 9) * (-8.45158-(-8.45158)));
            zz = -1.92614 + (((tickAnim - 56) / 9) * (-1.92614-(-1.92614)));
        }
        else if (tickAnim >= 65 && tickAnim < 101) {
            xx = -14.56218 + (((tickAnim - 65) / 36) * (0-(-14.56218)));
            yy = -8.45158 + (((tickAnim - 65) / 36) * (0-(-8.45158)));
            zz = -1.92614 + (((tickAnim - 65) / 36) * (0-(-1.92614)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neckend, neckend.rotateAngleX + (float) Math.toRadians(xx), neckend.rotateAngleY + (float) Math.toRadians(yy), neckend.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 0) / 20) * (-7.52684-(0)));
            yy = 0 + (((tickAnim - 0) / 20) * (4.16926-(0)));
            zz = 0 + (((tickAnim - 0) / 20) * (-0.20609-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 28) {
            xx = -7.52684 + (((tickAnim - 20) / 8) * (-11.9351-(-7.52684)));
            yy = 4.16926 + (((tickAnim - 20) / 8) * (-3.99129-(4.16926)));
            zz = -0.20609 + (((tickAnim - 20) / 8) * (-3.05191-(-0.20609)));
        }
        else if (tickAnim >= 28 && tickAnim < 31) {
            xx = -11.9351 + (((tickAnim - 28) / 3) * (-3.24474-(-11.9351)));
            yy = -3.99129 + (((tickAnim - 28) / 3) * (-3.70514-(-3.99129)));
            zz = -3.05191 + (((tickAnim - 28) / 3) * (-1.75791-(-3.05191)));
        }
        else if (tickAnim >= 31 && tickAnim < 35) {
            xx = -3.24474 + (((tickAnim - 31) / 4) * (1.37662-(-3.24474)));
            yy = -3.70514 + (((tickAnim - 31) / 4) * (-3.16311-(-3.70514)));
            zz = -1.75791 + (((tickAnim - 31) / 4) * (0.69326-(-1.75791)));
        }
        else if (tickAnim >= 35 && tickAnim < 43) {
            xx = 1.37662 + (((tickAnim - 35) / 8) * (3.91693-(1.37662)));
            yy = -3.16311 + (((tickAnim - 35) / 8) * (0.62242-(-3.16311)));
            zz = 0.69326 + (((tickAnim - 35) / 8) * (0.87674-(0.69326)));
        }
        else if (tickAnim >= 43 && tickAnim < 50) {
            xx = 3.91693 + (((tickAnim - 43) / 7) * (3.91693-(3.91693)));
            yy = 0.62242 + (((tickAnim - 43) / 7) * (0.62242-(0.62242)));
            zz = 0.87674 + (((tickAnim - 43) / 7) * (0.87674-(0.87674)));
        }
        else if (tickAnim >= 50 && tickAnim < 56) {
            xx = 3.91693 + (((tickAnim - 50) / 6) * (-0.08307-(3.91693)));
            yy = 0.62242 + (((tickAnim - 50) / 6) * (0.62242-(0.62242)));
            zz = 0.87674 + (((tickAnim - 50) / 6) * (0.87674-(0.87674)));
        }
        else if (tickAnim >= 56 && tickAnim < 65) {
            xx = -0.08307 + (((tickAnim - 56) / 9) * (0.91693-(-0.08307)));
            yy = 0.62242 + (((tickAnim - 56) / 9) * (0.62242-(0.62242)));
            zz = 0.87674 + (((tickAnim - 56) / 9) * (0.87674-(0.87674)));
        }
        else if (tickAnim >= 65 && tickAnim < 101) {
            xx = 0.91693 + (((tickAnim - 65) / 36) * (0-(0.91693)));
            yy = 0.62242 + (((tickAnim - 65) / 36) * (0-(0.62242)));
            zz = 0.87674 + (((tickAnim - 65) / 36) * (0-(0.87674)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(head, head.rotateAngleX + (float) Math.toRadians(xx), head.rotateAngleY + (float) Math.toRadians(yy), head.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 0) / 20) * (15.75-(0)));
            yy = 0 + (((tickAnim - 0) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 20) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 24) {
            xx = 15.75 + (((tickAnim - 20) / 4) * (0-(15.75)));
            yy = 0 + (((tickAnim - 20) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 4) * (0-(0)));
        }
        else if (tickAnim >= 24 && tickAnim < 28) {
            xx = 0 + (((tickAnim - 24) / 4) * (0-(0)));
            yy = 0 + (((tickAnim - 24) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 24) / 4) * (0-(0)));
        }
        else if (tickAnim >= 28 && tickAnim < 35) {
            xx = 0 + (((tickAnim - 28) / 7) * (8.5-(0)));
            yy = 0 + (((tickAnim - 28) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 28) / 7) * (0-(0)));
        }
        else if (tickAnim >= 35 && tickAnim < 50) {
            xx = 8.5 + (((tickAnim - 35) / 15) * (17.75-(8.5)));
            yy = 0 + (((tickAnim - 35) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 35) / 15) * (0-(0)));
        }
        else if (tickAnim >= 50 && tickAnim < 56) {
            xx = 17.75 + (((tickAnim - 50) / 6) * (0-(17.75)));
            yy = 0 + (((tickAnim - 50) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 50) / 6) * (0-(0)));
        }
        else if (tickAnim >= 56 && tickAnim < 65) {
            xx = 0 + (((tickAnim - 56) / 9) * (9.5-(0)));
            yy = 0 + (((tickAnim - 56) / 9) * (0-(0)));
            zz = 0 + (((tickAnim - 56) / 9) * (0-(0)));
        }
        else if (tickAnim >= 65 && tickAnim < 101) {
            xx = 9.5 + (((tickAnim - 65) / 36) * (0-(9.5)));
            yy = 0 + (((tickAnim - 65) / 36) * (0-(0)));
            zz = 0 + (((tickAnim - 65) / 36) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(lowerjawback, lowerjawback.rotateAngleX + (float) Math.toRadians(xx), lowerjawback.rotateAngleY + (float) Math.toRadians(yy), lowerjawback.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 0) / 20) * (-3.28939-(0)));
            yy = 0 + (((tickAnim - 0) / 20) * (-4.91527-(0)));
            zz = 0 + (((tickAnim - 0) / 20) * (0.91772-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 30) {
            xx = -3.28939 + (((tickAnim - 20) / 10) * (-3.25039-(-3.28939)));
            yy = -4.91527 + (((tickAnim - 20) / 10) * (0.49155-(-4.91527)));
            zz = 0.91772 + (((tickAnim - 20) / 10) * (-0.09155-(0.91772)));
        }
        else if (tickAnim >= 30 && tickAnim < 50) {
            xx = -3.25039 + (((tickAnim - 30) / 20) * (-3.31165-(-3.25039)));
            yy = 0.49155 + (((tickAnim - 30) / 20) * (6.14394-(0.49155)));
            zz = -0.09155 + (((tickAnim - 30) / 20) * (-1.14874-(-0.09155)));
        }
        else if (tickAnim >= 50 && tickAnim < 65) {
            xx = -3.31165 + (((tickAnim - 50) / 15) * (2.40064-(-3.31165)));
            yy = 6.14394 + (((tickAnim - 50) / 15) * (9.38216-(6.14394)));
            zz = -1.14874 + (((tickAnim - 50) / 15) * (-1.42776-(-1.14874)));
        }
        else if (tickAnim >= 65 && tickAnim < 100) {
            xx = 2.40064 + (((tickAnim - 65) / 35) * (0-(2.40064)));
            yy = 9.38216 + (((tickAnim - 65) / 35) * (0-(9.38216)));
            zz = -1.42776 + (((tickAnim - 65) / 35) * (0-(-1.42776)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tail1, tail1.rotateAngleX + (float) Math.toRadians(xx), tail1.rotateAngleY + (float) Math.toRadians(yy), tail1.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 0) / 20) * (-4.98229-(0)));
            yy = 0 + (((tickAnim - 0) / 20) * (-5.73918-(0)));
            zz = 0 + (((tickAnim - 0) / 20) * (-0.35321-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 30) {
            xx = -4.98229 + (((tickAnim - 20) / 10) * (-4.87223-(-4.98229)));
            yy = -5.73918 + (((tickAnim - 20) / 10) * (-15.2207-(-5.73918)));
            zz = -0.35321 + (((tickAnim - 20) / 10) * (-0.95625-(-0.35321)));
        }
        else if (tickAnim >= 30 && tickAnim < 50) {
            xx = -4.87223 + (((tickAnim - 30) / 20) * (-4.99787-(-4.87223)));
            yy = -15.2207 + (((tickAnim - 30) / 20) * (-1.99625-(-15.2207)));
            zz = -0.95625 + (((tickAnim - 30) / 20) * (-0.1225-(-0.95625)));
        }
        else if (tickAnim >= 50 && tickAnim < 65) {
            xx = -4.99787 + (((tickAnim - 50) / 15) * (-7.99817-(-4.99787)));
            yy = -1.99625 + (((tickAnim - 50) / 15) * (0.25366-(-1.99625)));
            zz = -0.1225 + (((tickAnim - 50) / 15) * (-0.10239-(-0.1225)));
        }
        else if (tickAnim >= 65 && tickAnim < 100) {
            xx = -7.99817 + (((tickAnim - 65) / 35) * (0-(-7.99817)));
            yy = 0.25366 + (((tickAnim - 65) / 35) * (0-(0.25366)));
            zz = -0.10239 + (((tickAnim - 65) / 35) * (0-(-0.10239)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tail2, tail2.rotateAngleX + (float) Math.toRadians(xx), tail2.rotateAngleY + (float) Math.toRadians(yy), tail2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 0) / 20) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 20) * (-6-(0)));
            zz = 0 + (((tickAnim - 0) / 20) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 30) {
            xx = 0 + (((tickAnim - 20) / 10) * (0-(0)));
            yy = -6 + (((tickAnim - 20) / 10) * (-14-(-6)));
            zz = 0 + (((tickAnim - 20) / 10) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 35) {
            xx = 0 + (((tickAnim - 30) / 5) * (0-(0)));
            yy = -14 + (((tickAnim - 30) / 5) * (-7-(-14)));
            zz = 0 + (((tickAnim - 30) / 5) * (0-(0)));
        }
        else if (tickAnim >= 35 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 35) / 15) * (0-(0)));
            yy = -7 + (((tickAnim - 35) / 15) * (3.5-(-7)));
            zz = 0 + (((tickAnim - 35) / 15) * (0-(0)));
        }
        else if (tickAnim >= 50 && tickAnim < 65) {
            xx = 0 + (((tickAnim - 50) / 15) * (-2.13854-(0)));
            yy = 3.5 + (((tickAnim - 50) / 15) * (9.37345-(3.5)));
            zz = 0 + (((tickAnim - 50) / 15) * (-1.23414-(0)));
        }
        else if (tickAnim >= 65 && tickAnim < 78) {
            xx = -2.13854 + (((tickAnim - 65) / 13) * (-1.37624-(-2.13854)));
            yy = 9.37345 + (((tickAnim - 65) / 13) * (8.01068-(9.37345)));
            zz = -1.23414 + (((tickAnim - 65) / 13) * (-1.19953-(-1.23414)));
        }
        else if (tickAnim >= 78 && tickAnim < 100) {
            xx = -1.37624 + (((tickAnim - 78) / 22) * (0-(-1.37624)));
            yy = 8.01068 + (((tickAnim - 78) / 22) * (0-(8.01068)));
            zz = -1.19953 + (((tickAnim - 78) / 22) * (0-(-1.19953)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tail3, tail3.rotateAngleX + (float) Math.toRadians(xx), tail3.rotateAngleY + (float) Math.toRadians(yy), tail3.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 10) * (8.75-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 10) / 10) * (0-(0)));
            yy = 8.75 + (((tickAnim - 10) / 10) * (1-(8.75)));
            zz = 0 + (((tickAnim - 10) / 10) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 30) {
            xx = 0 + (((tickAnim - 20) / 10) * (0-(0)));
            yy = 1 + (((tickAnim - 20) / 10) * (-16-(1)));
            zz = 0 + (((tickAnim - 20) / 10) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 35) {
            xx = 0 + (((tickAnim - 30) / 5) * (0-(0)));
            yy = -16 + (((tickAnim - 30) / 5) * (-9-(-16)));
            zz = 0 + (((tickAnim - 30) / 5) * (0-(0)));
        }
        else if (tickAnim >= 35 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 35) / 15) * (0-(0)));
            yy = -9 + (((tickAnim - 35) / 15) * (-2-(-9)));
            zz = 0 + (((tickAnim - 35) / 15) * (0-(0)));
        }
        else if (tickAnim >= 50 && tickAnim < 65) {
            xx = 0 + (((tickAnim - 50) / 15) * (-3.005-(0)));
            yy = -2 + (((tickAnim - 50) / 15) * (2.6735-(-2)));
            zz = 0 + (((tickAnim - 50) / 15) * (-0.84929-(0)));
        }
        else if (tickAnim >= 65 && tickAnim < 78) {
            xx = -3.005 + (((tickAnim - 65) / 13) * (-2.12877-(-3.005)));
            yy = 2.6735 + (((tickAnim - 65) / 13) * (13.74543-(2.6735)));
            zz = -0.84929 + (((tickAnim - 65) / 13) * (-2.51854-(-0.84929)));
        }
        else if (tickAnim >= 78 && tickAnim < 100) {
            xx = -2.12877 + (((tickAnim - 78) / 22) * (0-(-2.12877)));
            yy = 13.74543 + (((tickAnim - 78) / 22) * (0-(13.74543)));
            zz = -2.51854 + (((tickAnim - 78) / 22) * (0-(-2.51854)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tail4, tail4.rotateAngleX + (float) Math.toRadians(xx), tail4.rotateAngleY + (float) Math.toRadians(yy), tail4.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 10) * (9.38-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 10) / 10) * (0-(0)));
            yy = 9.38 + (((tickAnim - 10) / 10) * (6.25-(9.38)));
            zz = 0 + (((tickAnim - 10) / 10) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 30) {
            xx = 0 + (((tickAnim - 20) / 10) * (0-(0)));
            yy = 6.25 + (((tickAnim - 20) / 10) * (-12.5-(6.25)));
            zz = 0 + (((tickAnim - 20) / 10) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 35) {
            xx = 0 + (((tickAnim - 30) / 5) * (0-(0)));
            yy = -12.5 + (((tickAnim - 30) / 5) * (-9.5-(-12.5)));
            zz = 0 + (((tickAnim - 30) / 5) * (0-(0)));
        }
        else if (tickAnim >= 35 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 35) / 15) * (0-(0)));
            yy = -9.5 + (((tickAnim - 35) / 15) * (-4-(-9.5)));
            zz = 0 + (((tickAnim - 35) / 15) * (0-(0)));
        }
        else if (tickAnim >= 50 && tickAnim < 65) {
            xx = 0 + (((tickAnim - 50) / 15) * (-6.59919-(0)));
            yy = -4 + (((tickAnim - 50) / 15) * (-7.6213-(-4)));
            zz = 0 + (((tickAnim - 50) / 15) * (0.97921-(0)));
        }
        else if (tickAnim >= 65 && tickAnim < 78) {
            xx = -6.59919 + (((tickAnim - 65) / 13) * (-4.27615-(-6.59919)));
            yy = -7.6213 + (((tickAnim - 65) / 13) * (10.89608-(-7.6213)));
            zz = 0.97921 + (((tickAnim - 65) / 13) * (-2.90306-(0.97921)));
        }
        else if (tickAnim >= 78 && tickAnim < 100) {
            xx = -4.27615 + (((tickAnim - 78) / 22) * (0-(-4.27615)));
            yy = 10.89608 + (((tickAnim - 78) / 22) * (0-(10.89608)));
            zz = -2.90306 + (((tickAnim - 78) / 22) * (0-(-2.90306)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tail5, tail5.rotateAngleX + (float) Math.toRadians(xx), tail5.rotateAngleY + (float) Math.toRadians(yy), tail5.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 0) / 10) * (-0.43769-(0)));
            yy = 0 + (((tickAnim - 0) / 10) * (12.93593-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (0.28681-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 20) {
            xx = -0.43769 + (((tickAnim - 10) / 10) * (-0.63734-(-0.43769)));
            yy = 12.93593 + (((tickAnim - 10) / 10) * (8.94258-(12.93593)));
            zz = 0.28681 + (((tickAnim - 10) / 10) * (2.14231-(0.28681)));
        }
        else if (tickAnim >= 20 && tickAnim < 30) {
            xx = -0.63734 + (((tickAnim - 20) / 10) * (-0.65386-(-0.63734)));
            yy = 8.94258 + (((tickAnim - 20) / 10) * (-9.97136-(8.94258)));
            zz = 2.14231 + (((tickAnim - 20) / 10) * (3.95704-(2.14231)));
        }
        else if (tickAnim >= 30 && tickAnim < 35) {
            xx = -0.65386 + (((tickAnim - 30) / 5) * (-0.75463-(-0.65386)));
            yy = -9.97136 + (((tickAnim - 30) / 5) * (-14.699-(-9.97136)));
            zz = 3.95704 + (((tickAnim - 30) / 5) * (4.42835-(3.95704)));
        }
        else if (tickAnim >= 35 && tickAnim < 50) {
            xx = -0.75463 + (((tickAnim - 35) / 15) * (-0.59543-(-0.75463)));
            yy = -14.699 + (((tickAnim - 35) / 15) * (-5.49194-(-14.699)));
            zz = 4.42835 + (((tickAnim - 35) / 15) * (3.5231-(4.42835)));
        }
        else if (tickAnim >= 50 && tickAnim < 65) {
            xx = -0.59543 + (((tickAnim - 50) / 15) * (-0.50316-(-0.59543)));
            yy = -5.49194 + (((tickAnim - 50) / 15) * (-4.70548-(-5.49194)));
            zz = 3.5231 + (((tickAnim - 50) / 15) * (2.57001-(3.5231)));
        }
        else if (tickAnim >= 65 && tickAnim < 78) {
            xx = -0.50316 + (((tickAnim - 65) / 13) * (-0.42956-(-0.50316)));
            yy = -4.70548 + (((tickAnim - 65) / 13) * (14.80015-(-4.70548)));
            zz = 2.57001 + (((tickAnim - 65) / 13) * (-0.04122-(2.57001)));
        }
        else if (tickAnim >= 78 && tickAnim < 100) {
            xx = -0.42956 + (((tickAnim - 78) / 22) * (0-(-0.42956)));
            yy = 14.80015 + (((tickAnim - 78) / 22) * (0-(14.80015)));
            zz = -0.04122 + (((tickAnim - 78) / 22) * (0-(-0.04122)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tail6, tail6.rotateAngleX + (float) Math.toRadians(xx), tail6.rotateAngleY + (float) Math.toRadians(yy), tail6.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 10) * (19.63-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 10) / 10) * (0-(0)));
            yy = 19.63 + (((tickAnim - 10) / 10) * (11.25-(19.63)));
            zz = 0 + (((tickAnim - 10) / 10) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 30) {
            xx = 0 + (((tickAnim - 20) / 10) * (0-(0)));
            yy = 11.25 + (((tickAnim - 20) / 10) * (-19-(11.25)));
            zz = 0 + (((tickAnim - 20) / 10) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 35) {
            xx = 0 + (((tickAnim - 30) / 5) * (0-(0)));
            yy = -19 + (((tickAnim - 30) / 5) * (-23.25-(-19)));
            zz = 0 + (((tickAnim - 30) / 5) * (0-(0)));
        }
        else if (tickAnim >= 35 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 35) / 15) * (0-(0)));
            yy = -23.25 + (((tickAnim - 35) / 15) * (-11.5-(-23.25)));
            zz = 0 + (((tickAnim - 35) / 15) * (0-(0)));
        }
        else if (tickAnim >= 50 && tickAnim < 65) {
            xx = 0 + (((tickAnim - 50) / 15) * (0-(0)));
            yy = -11.5 + (((tickAnim - 50) / 15) * (-13.84-(-11.5)));
            zz = 0 + (((tickAnim - 50) / 15) * (0-(0)));
        }
        else if (tickAnim >= 65 && tickAnim < 78) {
            xx = 0 + (((tickAnim - 65) / 13) * (0-(0)));
            yy = -13.84 + (((tickAnim - 65) / 13) * (14.77-(-13.84)));
            zz = 0 + (((tickAnim - 65) / 13) * (0-(0)));
        }
        else if (tickAnim >= 78 && tickAnim < 100) {
            xx = 0 + (((tickAnim - 78) / 22) * (0-(0)));
            yy = 14.77 + (((tickAnim - 78) / 22) * (0-(14.77)));
            zz = 0 + (((tickAnim - 78) / 22) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tail7, tail7.rotateAngleX + (float) Math.toRadians(xx), tail7.rotateAngleY + (float) Math.toRadians(yy), tail7.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 0) / 20) * (13-(0)));
            yy = 0 + (((tickAnim - 0) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 20) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 28) {
            xx = 13 + (((tickAnim - 20) / 8) * (-15.08-(13)));
            yy = 0 + (((tickAnim - 20) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 8) * (0-(0)));
        }
        else if (tickAnim >= 28 && tickAnim < 35) {
            xx = -15.08 + (((tickAnim - 28) / 7) * (-25-(-15.08)));
            yy = 0 + (((tickAnim - 28) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 28) / 7) * (0-(0)));
        }
        else if (tickAnim >= 35 && tickAnim < 50) {
            xx = -25 + (((tickAnim - 35) / 15) * (-23.25-(-25)));
            yy = 0 + (((tickAnim - 35) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 35) / 15) * (0-(0)));
        }
        else if (tickAnim >= 50 && tickAnim < 60) {
            xx = -23.25 + (((tickAnim - 50) / 10) * (-9.25-(-23.25)));
            yy = 0 + (((tickAnim - 50) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 50) / 10) * (0-(0)));
        }
        else if (tickAnim >= 60 && tickAnim < 80) {
            xx = -9.25 + (((tickAnim - 60) / 20) * (-11.46-(-9.25)));
            yy = 0 + (((tickAnim - 60) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 60) / 20) * (0-(0)));
        }
        else if (tickAnim >= 80 && tickAnim < 91) {
            xx = -11.46 + (((tickAnim - 80) / 11) * (0-(-11.46)));
            yy = 0 + (((tickAnim - 80) / 11) * (0-(0)));
            zz = 0 + (((tickAnim - 80) / 11) * (0-(0)));
        }
        else if (tickAnim >= 91 && tickAnim < 101) {
            xx = 0 + (((tickAnim - 91) / 10) * (0-(0)));
            yy = 0 + (((tickAnim - 91) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 91) / 10) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightthigh, rightthigh.rotateAngleX + (float) Math.toRadians(xx), rightthigh.rotateAngleY + (float) Math.toRadians(yy), rightthigh.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 0) / 20) * (6-(0)));
            yy = 0 + (((tickAnim - 0) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 20) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 28) {
            xx = 6 + (((tickAnim - 20) / 8) * (20.41-(6)));
            yy = 0 + (((tickAnim - 20) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 8) * (0-(0)));
        }
        else if (tickAnim >= 28 && tickAnim < 35) {
            xx = 20.41 + (((tickAnim - 28) / 7) * (-0.75-(20.41)));
            yy = 0 + (((tickAnim - 28) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 28) / 7) * (0-(0)));
        }
        else if (tickAnim >= 35 && tickAnim < 50) {
            xx = -0.75 + (((tickAnim - 35) / 15) * (-0.75-(-0.75)));
            yy = 0 + (((tickAnim - 35) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 35) / 15) * (0-(0)));
        }
        else if (tickAnim >= 50 && tickAnim < 60) {
            xx = -0.75 + (((tickAnim - 50) / 10) * (21-(-0.75)));
            yy = 0 + (((tickAnim - 50) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 50) / 10) * (0-(0)));
        }
        else if (tickAnim >= 60 && tickAnim < 65) {
            xx = 21 + (((tickAnim - 60) / 5) * (20.5-(21)));
            yy = 0 + (((tickAnim - 60) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 60) / 5) * (0-(0)));
        }
        else if (tickAnim >= 65 && tickAnim < 80) {
            xx = 20.5 + (((tickAnim - 65) / 15) * (0-(20.5)));
            yy = 0 + (((tickAnim - 65) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 65) / 15) * (0-(0)));
        }
        else if (tickAnim >= 80 && tickAnim < 91) {
            xx = 0 + (((tickAnim - 80) / 11) * (32.97-(0)));
            yy = 0 + (((tickAnim - 80) / 11) * (0-(0)));
            zz = 0 + (((tickAnim - 80) / 11) * (0-(0)));
        }
        else if (tickAnim >= 91 && tickAnim < 101) {
            xx = 32.97 + (((tickAnim - 91) / 10) * (0-(32.97)));
            yy = 0 + (((tickAnim - 91) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 91) / 10) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightshin, rightshin.rotateAngleX + (float) Math.toRadians(xx), rightshin.rotateAngleY + (float) Math.toRadians(yy), rightshin.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 20 && tickAnim < 35) {
            xx = 0 + (((tickAnim - 20) / 15) * (0-(0)));
            yy = 0 + (((tickAnim - 20) / 15) * (-1.1-(0)));
            zz = 0 + (((tickAnim - 20) / 15) * (0-(0)));
        }
        else if (tickAnim >= 35 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 35) / 15) * (0-(0)));
            yy = -1.1 + (((tickAnim - 35) / 15) * (-1.1-(-1.1)));
            zz = 0 + (((tickAnim - 35) / 15) * (0-(0)));
        }
        else if (tickAnim >= 50 && tickAnim < 101) {
            xx = 0 + (((tickAnim - 50) / 51) * (0-(0)));
            yy = -1.1 + (((tickAnim - 50) / 51) * (0-(-1.1)));
            zz = 0 + (((tickAnim - 50) / 51) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.rightshin.rotationPointX = this.rightshin.rotationPointX + (float)(xx);
        this.rightshin.rotationPointY = this.rightshin.rotationPointY - (float)(yy);
        this.rightshin.rotationPointZ = this.rightshin.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 0) / 20) * (19.5-(0)));
            yy = 0 + (((tickAnim - 0) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 20) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 28) {
            xx = 19.5 + (((tickAnim - 20) / 8) * (-40.75-(19.5)));
            yy = 0 + (((tickAnim - 20) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 8) * (0-(0)));
        }
        else if (tickAnim >= 28 && tickAnim < 35) {
            xx = -40.75 + (((tickAnim - 28) / 7) * (11.25-(-40.75)));
            yy = 0 + (((tickAnim - 28) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 28) / 7) * (0-(0)));
        }
        else if (tickAnim >= 35 && tickAnim < 50) {
            xx = 11.25 + (((tickAnim - 35) / 15) * (11.25-(11.25)));
            yy = 0 + (((tickAnim - 35) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 35) / 15) * (0-(0)));
        }
        else if (tickAnim >= 50 && tickAnim < 65) {
            xx = 11.25 + (((tickAnim - 50) / 15) * (4.25-(11.25)));
            yy = 0 + (((tickAnim - 50) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 50) / 15) * (0-(0)));
        }
        else if (tickAnim >= 65 && tickAnim < 80) {
            xx = 4.25 + (((tickAnim - 65) / 15) * (0-(4.25)));
            yy = 0 + (((tickAnim - 65) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 65) / 15) * (0-(0)));
        }
        else if (tickAnim >= 80 && tickAnim < 91) {
            xx = 0 + (((tickAnim - 80) / 11) * (-25.06-(0)));
            yy = 0 + (((tickAnim - 80) / 11) * (0-(0)));
            zz = 0 + (((tickAnim - 80) / 11) * (0-(0)));
        }
        else if (tickAnim >= 91 && tickAnim < 101) {
            xx = -25.06 + (((tickAnim - 91) / 10) * (0-(-25.06)));
            yy = 0 + (((tickAnim - 91) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 91) / 10) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightankle, rightankle.rotateAngleX + (float) Math.toRadians(xx), rightankle.rotateAngleY + (float) Math.toRadians(yy), rightankle.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 20 && tickAnim < 35) {
            xx = 0 + (((tickAnim - 20) / 15) * (0-(0)));
            yy = 0 + (((tickAnim - 20) / 15) * (-0.95-(0)));
            zz = 0 + (((tickAnim - 20) / 15) * (0-(0)));
        }
        else if (tickAnim >= 35 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 35) / 15) * (0-(0)));
            yy = -0.95 + (((tickAnim - 35) / 15) * (-0.95-(-0.95)));
            zz = 0 + (((tickAnim - 35) / 15) * (0-(0)));
        }
        else if (tickAnim >= 50 && tickAnim < 65) {
            xx = 0 + (((tickAnim - 50) / 15) * (0-(0)));
            yy = -0.95 + (((tickAnim - 50) / 15) * (-1.725-(-0.95)));
            zz = 0 + (((tickAnim - 50) / 15) * (0-(0)));
        }
        else if (tickAnim >= 65 && tickAnim < 80) {
            xx = 0 + (((tickAnim - 65) / 15) * (0-(0)));
            yy = -1.725 + (((tickAnim - 65) / 15) * (0-(-1.725)));
            zz = 0 + (((tickAnim - 65) / 15) * (0-(0)));
        }
        else if (tickAnim >= 80 && tickAnim < 101) {
            xx = 0 + (((tickAnim - 80) / 21) * (0-(0)));
            yy = 0 + (((tickAnim - 80) / 21) * (0-(0)));
            zz = 0 + (((tickAnim - 80) / 21) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.rightankle.rotationPointX = this.rightankle.rotationPointX + (float)(xx);
        this.rightankle.rotationPointY = this.rightankle.rotationPointY - (float)(yy);
        this.rightankle.rotationPointZ = this.rightankle.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 0) / 20) * (28.75-(0)));
            yy = 0 + (((tickAnim - 0) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 20) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 28) {
            xx = 28.75 + (((tickAnim - 20) / 8) * (73.18-(28.75)));
            yy = 0 + (((tickAnim - 20) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 8) * (0-(0)));
        }
        else if (tickAnim >= 28 && tickAnim < 35) {
            xx = 73.18 + (((tickAnim - 28) / 7) * (11.75-(73.18)));
            yy = 0 + (((tickAnim - 28) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 28) / 7) * (0-(0)));
        }
        else if (tickAnim >= 35 && tickAnim < 50) {
            xx = 11.75 + (((tickAnim - 35) / 15) * (18-(11.75)));
            yy = 0 + (((tickAnim - 35) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 35) / 15) * (0-(0)));
        }
        else if (tickAnim >= 50 && tickAnim < 55) {
            xx = 18 + (((tickAnim - 50) / 5) * (-7.25-(18)));
            yy = 0 + (((tickAnim - 50) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 50) / 5) * (0-(0)));
        }
        else if (tickAnim >= 55 && tickAnim < 60) {
            xx = -7.25 + (((tickAnim - 55) / 5) * (-9.5-(-7.25)));
            yy = 0 + (((tickAnim - 55) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 55) / 5) * (0-(0)));
        }
        else if (tickAnim >= 60 && tickAnim < 65) {
            xx = -9.5 + (((tickAnim - 60) / 5) * (-24.25-(-9.5)));
            yy = 0 + (((tickAnim - 60) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 60) / 5) * (0-(0)));
        }
        else if (tickAnim >= 65 && tickAnim < 80) {
            xx = -24.25 + (((tickAnim - 65) / 15) * (6.5-(-24.25)));
            yy = 0 + (((tickAnim - 65) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 65) / 15) * (0-(0)));
        }
        else if (tickAnim >= 80 && tickAnim < 91) {
            xx = 6.5 + (((tickAnim - 80) / 11) * (59.94-(6.5)));
            yy = 0 + (((tickAnim - 80) / 11) * (0-(0)));
            zz = 0 + (((tickAnim - 80) / 11) * (0-(0)));
        }
        else if (tickAnim >= 91 && tickAnim < 95) {
            xx = 59.94 + (((tickAnim - 91) / 4) * (79.62-(59.94)));
            yy = 0 + (((tickAnim - 91) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 91) / 4) * (0-(0)));
        }
        else if (tickAnim >= 95 && tickAnim < 101) {
            xx = 79.62 + (((tickAnim - 95) / 6) * (0-(79.62)));
            yy = 0 + (((tickAnim - 95) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 95) / 6) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightfoot, rightfoot.rotateAngleX + (float) Math.toRadians(xx), rightfoot.rotateAngleY + (float) Math.toRadians(yy), rightfoot.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 20 && tickAnim < 28) {
            xx = 0 + (((tickAnim - 20) / 8) * (0-(0)));
            yy = 0 + (((tickAnim - 20) / 8) * (0.34-(0)));
            zz = 0 + (((tickAnim - 20) / 8) * (-1.625-(0)));
        }
        else if (tickAnim >= 28 && tickAnim < 35) {
            xx = 0 + (((tickAnim - 28) / 7) * (0-(0)));
            yy = 0.34 + (((tickAnim - 28) / 7) * (-1.28-(0.34)));
            zz = -1.625 + (((tickAnim - 28) / 7) * (0.645-(-1.625)));
        }
        else if (tickAnim >= 35 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 35) / 15) * (0-(0)));
            yy = -1.28 + (((tickAnim - 35) / 15) * (-1.55-(-1.28)));
            zz = 0.645 + (((tickAnim - 35) / 15) * (0-(0.645)));
        }
        else if (tickAnim >= 50 && tickAnim < 55) {
            xx = 0 + (((tickAnim - 50) / 5) * (0-(0)));
            yy = -1.55 + (((tickAnim - 50) / 5) * (0-(-1.55)));
            zz = 0 + (((tickAnim - 50) / 5) * (0-(0)));
        }
        else if (tickAnim >= 55 && tickAnim < 65) {
            xx = 0 + (((tickAnim - 55) / 10) * (0-(0)));
            yy = 0 + (((tickAnim - 55) / 10) * (-1.075-(0)));
            zz = 0 + (((tickAnim - 55) / 10) * (0-(0)));
        }
        else if (tickAnim >= 65 && tickAnim < 80) {
            xx = 0 + (((tickAnim - 65) / 15) * (0-(0)));
            yy = -1.075 + (((tickAnim - 65) / 15) * (0-(-1.075)));
            zz = 0 + (((tickAnim - 65) / 15) * (0-(0)));
        }
        else if (tickAnim >= 80 && tickAnim < 91) {
            xx = 0 + (((tickAnim - 80) / 11) * (0-(0)));
            yy = 0 + (((tickAnim - 80) / 11) * (1.925-(0)));
            zz = 0 + (((tickAnim - 80) / 11) * (-1.475-(0)));
        }
        else if (tickAnim >= 91 && tickAnim < 95) {
            xx = 0 + (((tickAnim - 91) / 4) * (0-(0)));
            yy = 1.925 + (((tickAnim - 91) / 4) * (-1.425-(1.925)));
            zz = -1.475 + (((tickAnim - 91) / 4) * (-0.95-(-1.475)));
        }
        else if (tickAnim >= 95 && tickAnim < 101) {
            xx = 0 + (((tickAnim - 95) / 6) * (0-(0)));
            yy = -1.425 + (((tickAnim - 95) / 6) * (0-(-1.425)));
            zz = -0.95 + (((tickAnim - 95) / 6) * (0-(-0.95)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.rightfoot.rotationPointX = this.rightfoot.rotationPointX + (float)(xx);
        this.rightfoot.rotationPointY = this.rightfoot.rotationPointY - (float)(yy);
        this.rightfoot.rotationPointZ = this.rightfoot.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 0) / 20) * (-60-(0)));
            yy = 0 + (((tickAnim - 0) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 20) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 28) {
            xx = -60 + (((tickAnim - 20) / 8) * (3-(-60)));
            yy = 0 + (((tickAnim - 20) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 8) * (0-(0)));
        }
        else if (tickAnim >= 28 && tickAnim < 35) {
            xx = 3 + (((tickAnim - 28) / 7) * (0-(3)));
            yy = 0 + (((tickAnim - 28) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 28) / 7) * (0-(0)));
        }
        else if (tickAnim >= 35 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 35) / 15) * (0-(0)));
            yy = 0 + (((tickAnim - 35) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 35) / 15) * (0-(0)));
        }
        else if (tickAnim >= 50 && tickAnim < 55) {
            xx = 0 + (((tickAnim - 50) / 5) * (0-(0)));
            yy = 0 + (((tickAnim - 50) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 50) / 5) * (0-(0)));
        }
        else if (tickAnim >= 55 && tickAnim < 60) {
            xx = 0 + (((tickAnim - 55) / 5) * (-10.5-(0)));
            yy = 0 + (((tickAnim - 55) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 55) / 5) * (0-(0)));
        }
        else if (tickAnim >= 60 && tickAnim < 65) {
            xx = -10.5 + (((tickAnim - 60) / 5) * (2-(-10.5)));
            yy = 0 + (((tickAnim - 60) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 60) / 5) * (0-(0)));
        }
        else if (tickAnim >= 65 && tickAnim < 80) {
            xx = 2 + (((tickAnim - 65) / 15) * (0-(2)));
            yy = 0 + (((tickAnim - 65) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 65) / 15) * (0-(0)));
        }
        else if (tickAnim >= 80 && tickAnim < 85) {
            xx = 0 + (((tickAnim - 80) / 5) * (-22.43-(0)));
            yy = 0 + (((tickAnim - 80) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 80) / 5) * (0-(0)));
        }
        else if (tickAnim >= 85 && tickAnim < 91) {
            xx = -22.43 + (((tickAnim - 85) / 6) * (16.81-(-22.43)));
            yy = 0 + (((tickAnim - 85) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 85) / 6) * (0-(0)));
        }
        else if (tickAnim >= 91 && tickAnim < 95) {
            xx = 16.81 + (((tickAnim - 91) / 4) * (-84.47-(16.81)));
            yy = 0 + (((tickAnim - 91) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 91) / 4) * (0-(0)));
        }
        else if (tickAnim >= 95 && tickAnim < 101) {
            xx = -84.47 + (((tickAnim - 95) / 6) * (0-(-84.47)));
            yy = 0 + (((tickAnim - 95) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 95) / 6) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(righttoes, righttoes.rotateAngleX + (float) Math.toRadians(xx), righttoes.rotateAngleY + (float) Math.toRadians(yy), righttoes.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 0) / 20) * (-17.75-(0)));
            yy = 0 + (((tickAnim - 0) / 20) * (8.75-(0)));
            zz = 0 + (((tickAnim - 0) / 20) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 35) {
            xx = -17.75 + (((tickAnim - 20) / 15) * (-4-(-17.75)));
            yy = 8.75 + (((tickAnim - 20) / 15) * (8.75-(8.75)));
            zz = 0 + (((tickAnim - 20) / 15) * (0-(0)));
        }
        else if (tickAnim >= 35 && tickAnim < 50) {
            xx = -4 + (((tickAnim - 35) / 15) * (-2.75-(-4)));
            yy = 8.75 + (((tickAnim - 35) / 15) * (8.75-(8.75)));
            zz = 0 + (((tickAnim - 35) / 15) * (0-(0)));
        }
        else if (tickAnim >= 50 && tickAnim < 60) {
            xx = -2.75 + (((tickAnim - 50) / 10) * (-13.75-(-2.75)));
            yy = 8.75 + (((tickAnim - 50) / 10) * (8.75-(8.75)));
            zz = 0 + (((tickAnim - 50) / 10) * (0-(0)));
        }
        else if (tickAnim >= 60 && tickAnim < 65) {
            xx = -13.75 + (((tickAnim - 60) / 5) * (-16.75-(-13.75)));
            yy = 8.75 + (((tickAnim - 60) / 5) * (8.75-(8.75)));
            zz = 0 + (((tickAnim - 60) / 5) * (0-(0)));
        }
        else if (tickAnim >= 65 && tickAnim < 80) {
            xx = -16.75 + (((tickAnim - 65) / 15) * (14.26163-(-16.75)));
            yy = 8.75 + (((tickAnim - 65) / 15) * (5.08721-(8.75)));
            zz = 0 + (((tickAnim - 65) / 15) * (0-(0)));
        }
        else if (tickAnim >= 80 && tickAnim < 101) {
            xx = 14.26163 + (((tickAnim - 80) / 21) * (0-(14.26163)));
            yy = 5.08721 + (((tickAnim - 80) / 21) * (0-(5.08721)));
            zz = 0 + (((tickAnim - 80) / 21) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftthigh, leftthigh.rotateAngleX + (float) Math.toRadians(xx), leftthigh.rotateAngleY + (float) Math.toRadians(yy), leftthigh.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 0) / 8) * (7.71-(0)));
            yy = 0 + (((tickAnim - 0) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 8) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 20) {
            xx = 7.71 + (((tickAnim - 8) / 12) * (-2.5-(7.71)));
            yy = 0 + (((tickAnim - 8) / 12) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 12) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 35) {
            xx = -2.5 + (((tickAnim - 20) / 15) * (2-(-2.5)));
            yy = 0 + (((tickAnim - 20) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 15) * (0-(0)));
        }
        else if (tickAnim >= 35 && tickAnim < 50) {
            xx = 2 + (((tickAnim - 35) / 15) * (2-(2)));
            yy = 0 + (((tickAnim - 35) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 35) / 15) * (0-(0)));
        }
        else if (tickAnim >= 50 && tickAnim < 60) {
            xx = 2 + (((tickAnim - 50) / 10) * (-6.25-(2)));
            yy = 0 + (((tickAnim - 50) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 50) / 10) * (0-(0)));
        }
        else if (tickAnim >= 60 && tickAnim < 65) {
            xx = -6.25 + (((tickAnim - 60) / 5) * (-6.25-(-6.25)));
            yy = 0 + (((tickAnim - 60) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 60) / 5) * (0-(0)));
        }
        else if (tickAnim >= 65 && tickAnim < 73) {
            xx = -6.25 + (((tickAnim - 65) / 8) * (36.41-(-6.25)));
            yy = 0 + (((tickAnim - 65) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 65) / 8) * (0-(0)));
        }
        else if (tickAnim >= 73 && tickAnim < 80) {
            xx = 36.41 + (((tickAnim - 73) / 7) * (11.56-(36.41)));
            yy = 0 + (((tickAnim - 73) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 73) / 7) * (0-(0)));
        }
        else if (tickAnim >= 80 && tickAnim < 101) {
            xx = 11.56 + (((tickAnim - 80) / 21) * (0-(11.56)));
            yy = 0 + (((tickAnim - 80) / 21) * (0-(0)));
            zz = 0 + (((tickAnim - 80) / 21) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftshin, leftshin.rotateAngleX + (float) Math.toRadians(xx), leftshin.rotateAngleY + (float) Math.toRadians(yy), leftshin.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 0) / 20) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 20) * (-1.525-(0)));
            zz = 0 + (((tickAnim - 0) / 20) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 35) {
            xx = 0 + (((tickAnim - 20) / 15) * (0-(0)));
            yy = -1.525 + (((tickAnim - 20) / 15) * (0-(-1.525)));
            zz = 0 + (((tickAnim - 20) / 15) * (0-(0)));
        }
        else if (tickAnim >= 35 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 35) / 15) * (0-(0)));
            yy = 0 + (((tickAnim - 35) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 35) / 15) * (0-(0)));
        }
        else if (tickAnim >= 50 && tickAnim < 80) {
            xx = 0 + (((tickAnim - 50) / 30) * (0-(0)));
            yy = 0 + (((tickAnim - 50) / 30) * (-0.9-(0)));
            zz = 0 + (((tickAnim - 50) / 30) * (0-(0)));
        }
        else if (tickAnim >= 80 && tickAnim < 101) {
            xx = 0 + (((tickAnim - 80) / 21) * (0-(0)));
            yy = -0.9 + (((tickAnim - 80) / 21) * (0-(-0.9)));
            zz = 0 + (((tickAnim - 80) / 21) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.leftshin.rotationPointX = this.leftshin.rotationPointX + (float)(xx);
        this.leftshin.rotationPointY = this.leftshin.rotationPointY - (float)(yy);
        this.leftshin.rotationPointZ = this.leftshin.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 0) / 8) * (-37.08-(0)));
            yy = 0 + (((tickAnim - 0) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 8) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 20) {
            xx = -37.08 + (((tickAnim - 8) / 12) * (19-(-37.08)));
            yy = 0 + (((tickAnim - 8) / 12) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 12) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 50) {
            xx = 19 + (((tickAnim - 20) / 30) * (19-(19)));
            yy = 0 + (((tickAnim - 20) / 30) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 30) * (0-(0)));
        }
        else if (tickAnim >= 50 && tickAnim < 56) {
            xx = 19 + (((tickAnim - 50) / 6) * (-44.98-(19)));
            yy = 0 + (((tickAnim - 50) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 50) / 6) * (0-(0)));
        }
        else if (tickAnim >= 56 && tickAnim < 60) {
            xx = -44.98 + (((tickAnim - 56) / 4) * (8.75-(-44.98)));
            yy = 0 + (((tickAnim - 56) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 56) / 4) * (0-(0)));
        }
        else if (tickAnim >= 60 && tickAnim < 65) {
            xx = 8.75 + (((tickAnim - 60) / 5) * (8.75-(8.75)));
            yy = 0 + (((tickAnim - 60) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 60) / 5) * (0-(0)));
        }
        else if (tickAnim >= 65 && tickAnim < 73) {
            xx = 8.75 + (((tickAnim - 65) / 8) * (-25.83-(8.75)));
            yy = 0 + (((tickAnim - 65) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 65) / 8) * (0-(0)));
        }
        else if (tickAnim >= 73 && tickAnim < 101) {
            xx = -25.83 + (((tickAnim - 73) / 28) * (0-(-25.83)));
            yy = 0 + (((tickAnim - 73) / 28) * (0-(0)));
            zz = 0 + (((tickAnim - 73) / 28) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftankle, leftankle.rotateAngleX + (float) Math.toRadians(xx), leftankle.rotateAngleY + (float) Math.toRadians(yy), leftankle.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 0) / 20) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 20) * (-1.4-(0)));
            zz = 0 + (((tickAnim - 0) / 20) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 35) {
            xx = 0 + (((tickAnim - 20) / 15) * (0-(0)));
            yy = -1.4 + (((tickAnim - 20) / 15) * (0-(-1.4)));
            zz = 0 + (((tickAnim - 20) / 15) * (0-(0)));
        }
        else if (tickAnim >= 35 && tickAnim < 60) {
            xx = 0 + (((tickAnim - 35) / 25) * (0-(0)));
            yy = 0 + (((tickAnim - 35) / 25) * (-0.85-(0)));
            zz = 0 + (((tickAnim - 35) / 25) * (0-(0)));
        }
        else if (tickAnim >= 60 && tickAnim < 65) {
            xx = 0 + (((tickAnim - 60) / 5) * (0-(0)));
            yy = -0.85 + (((tickAnim - 60) / 5) * (-0.85-(-0.85)));
            zz = 0 + (((tickAnim - 60) / 5) * (0-(0)));
        }
        else if (tickAnim >= 65 && tickAnim < 101) {
            xx = 0 + (((tickAnim - 65) / 36) * (0-(0)));
            yy = -0.85 + (((tickAnim - 65) / 36) * (0-(-0.85)));
            zz = 0 + (((tickAnim - 65) / 36) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.leftankle.rotationPointX = this.leftankle.rotationPointX + (float)(xx);
        this.leftankle.rotationPointY = this.leftankle.rotationPointY - (float)(yy);
        this.leftankle.rotationPointZ = this.leftankle.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 0) / 8) * (60.02-(0)));
            yy = 0 + (((tickAnim - 0) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 8) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 20) {
            xx = 60.02 + (((tickAnim - 8) / 12) * (10.25-(60.02)));
            yy = 0 + (((tickAnim - 8) / 12) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 12) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 35) {
            xx = 10.25 + (((tickAnim - 20) / 15) * (-17.25-(10.25)));
            yy = 0 + (((tickAnim - 20) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 15) * (0-(0)));
        }
        else if (tickAnim >= 35 && tickAnim < 50) {
            xx = -17.25 + (((tickAnim - 35) / 15) * (-15.5-(-17.25)));
            yy = 0 + (((tickAnim - 35) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 35) / 15) * (0-(0)));
        }
        else if (tickAnim >= 50 && tickAnim < 56) {
            xx = -15.5 + (((tickAnim - 50) / 6) * (81.67-(-15.5)));
            yy = 0 + (((tickAnim - 50) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 50) / 6) * (0-(0)));
        }
        else if (tickAnim >= 56 && tickAnim < 60) {
            xx = 81.67 + (((tickAnim - 56) / 4) * (7.5-(81.67)));
            yy = 0 + (((tickAnim - 56) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 56) / 4) * (0-(0)));
        }
        else if (tickAnim >= 60 && tickAnim < 65) {
            xx = 7.5 + (((tickAnim - 60) / 5) * (7.5-(7.5)));
            yy = 0 + (((tickAnim - 60) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 60) / 5) * (0-(0)));
        }
        else if (tickAnim >= 65 && tickAnim < 73) {
            xx = 7.5 + (((tickAnim - 65) / 8) * (72.54-(7.5)));
            yy = 0 + (((tickAnim - 65) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 65) / 8) * (0-(0)));
        }
        else if (tickAnim >= 73 && tickAnim < 80) {
            xx = 72.54 + (((tickAnim - 73) / 7) * (77.83-(72.54)));
            yy = 0 + (((tickAnim - 73) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 73) / 7) * (0-(0)));
        }
        else if (tickAnim >= 80 && tickAnim < 101) {
            xx = 77.83 + (((tickAnim - 80) / 21) * (0-(77.83)));
            yy = 0 + (((tickAnim - 80) / 21) * (0-(0)));
            zz = 0 + (((tickAnim - 80) / 21) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftfoot, leftfoot.rotateAngleX + (float) Math.toRadians(xx), leftfoot.rotateAngleY + (float) Math.toRadians(yy), leftfoot.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 56) {
            xx = 0 + (((tickAnim - 0) / 56) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 56) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 56) * (-1.275-(0)));
        }
        else if (tickAnim >= 56 && tickAnim < 73) {
            xx = 0 + (((tickAnim - 56) / 17) * (0-(0)));
            yy = 0 + (((tickAnim - 56) / 17) * (2.1-(0)));
            zz = -1.275 + (((tickAnim - 56) / 17) * (-0.8-(-1.275)));
        }
        else if (tickAnim >= 73 && tickAnim < 80) {
            xx = 0 + (((tickAnim - 73) / 7) * (0-(0)));
            yy = 2.1 + (((tickAnim - 73) / 7) * (-2.05-(2.1)));
            zz = -0.8 + (((tickAnim - 73) / 7) * (-0.85-(-0.8)));
        }
        else if (tickAnim >= 80 && tickAnim < 101) {
            xx = 0 + (((tickAnim - 80) / 21) * (0-(0)));
            yy = -2.05 + (((tickAnim - 80) / 21) * (0-(-2.05)));
            zz = -0.85 + (((tickAnim - 80) / 21) * (0-(-0.85)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.leftfoot.rotationPointX = this.leftfoot.rotationPointX + (float)(xx);
        this.leftfoot.rotationPointY = this.leftfoot.rotationPointY - (float)(yy);
        this.leftfoot.rotationPointZ = this.leftfoot.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 35) {
            xx = 0 + (((tickAnim - 0) / 35) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 35) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 35) * (0-(0)));
        }
        else if (tickAnim >= 35 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 35) / 15) * (0-(0)));
            yy = 0 + (((tickAnim - 35) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 35) / 15) * (0-(0)));
        }
        else if (tickAnim >= 50 && tickAnim < 60) {
            xx = 0 + (((tickAnim - 50) / 10) * (0-(0)));
            yy = 0 + (((tickAnim - 50) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 50) / 10) * (0-(0)));
        }
        else if (tickAnim >= 60 && tickAnim < 65) {
            xx = 0 + (((tickAnim - 60) / 5) * (0-(0)));
            yy = 0 + (((tickAnim - 60) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 60) / 5) * (0-(0)));
        }
        else if (tickAnim >= 65 && tickAnim < 67) {
            xx = 0 + (((tickAnim - 65) / 2) * (-14.5-(0)));
            yy = 0 + (((tickAnim - 65) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 65) / 2) * (0-(0)));
        }
        else if (tickAnim >= 67 && tickAnim < 73) {
            xx = -14.5 + (((tickAnim - 67) / 6) * (23.63-(-14.5)));
            yy = 0 + (((tickAnim - 67) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 67) / 6) * (0-(0)));
        }
        else if (tickAnim >= 73 && tickAnim < 80) {
            xx = 23.63 + (((tickAnim - 73) / 7) * (-91-(23.63)));
            yy = 0 + (((tickAnim - 73) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 73) / 7) * (0-(0)));
        }
        else if (tickAnim >= 80 && tickAnim < 101) {
            xx = -91 + (((tickAnim - 80) / 21) * (0-(-91)));
            yy = 0 + (((tickAnim - 80) / 21) * (0-(0)));
            zz = 0 + (((tickAnim - 80) / 21) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(lefttoes, lefttoes.rotateAngleX + (float) Math.toRadians(xx), lefttoes.rotateAngleY + (float) Math.toRadians(yy), lefttoes.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 35) {
            xx = 0 + (((tickAnim - 0) / 35) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 35) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 35) * (0-(0)));
        }
        else if (tickAnim >= 35 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 35) / 15) * (0-(0)));
            yy = 0 + (((tickAnim - 35) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 35) / 15) * (0-(0)));
        }
        else if (tickAnim >= 50 && tickAnim < 60) {
            xx = 0 + (((tickAnim - 50) / 10) * (0-(0)));
            yy = 0 + (((tickAnim - 50) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 50) / 10) * (0-(0)));
        }
        else if (tickAnim >= 60 && tickAnim < 65) {
            xx = 0 + (((tickAnim - 60) / 5) * (0-(0)));
            yy = 0 + (((tickAnim - 60) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 60) / 5) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.lefttoes.rotationPointX = this.lefttoes.rotationPointX + (float)(xx);
        this.lefttoes.rotationPointY = this.lefttoes.rotationPointY - (float)(yy);
        this.lefttoes.rotationPointZ = this.lefttoes.rotationPointZ + (float)(zz);



    }

    public void animNoiseHiss(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime, double animTick) {
        EntityPrehistoricFloraTyrannotitan entity = (EntityPrehistoricFloraTyrannotitan) entitylivingbaseIn;
        int animCycle = 40;
        double tickAnim = animTick + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;
         if (tickAnim >= 0 && tickAnim < 5) {
            xx = -4.25+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120-120))*-5 + (((tickAnim - 0) / 5) * (-0.1+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120))*6-(-4.25+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120-120))*-5)));
            yy = 0 + (((tickAnim - 0) / 5) * (1.725+Math.sin((Math.PI/180)*(((double)tickAnim/20)*150))*-3-(0)));
            zz = 0 + (((tickAnim - 0) / 5) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 20) {
            xx = -0.1+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120))*6 + (((tickAnim - 5) / 15) * (5.225+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120-90))*-5-(-0.1+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120))*6)));
            yy = 1.725+Math.sin((Math.PI/180)*(((double)tickAnim/20)*150))*-3 + (((tickAnim - 5) / 15) * (2.4+Math.sin((Math.PI/180)*(((double)tickAnim/20)*150))*-1-(1.725+Math.sin((Math.PI/180)*(((double)tickAnim/20)*150))*-3)));
            zz = 0 + (((tickAnim - 5) / 15) * (-0.00262-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 40) {
            xx = 5.225+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120-90))*-5 + (((tickAnim - 20) / 20) * (0-(5.225+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120-90))*-5)));
            yy = 2.4+Math.sin((Math.PI/180)*(((double)tickAnim/20)*150))*-1 + (((tickAnim - 20) / 20) * (0-(2.4+Math.sin((Math.PI/180)*(((double)tickAnim/20)*150))*-1)));
            zz = -0.00262 + (((tickAnim - 20) / 20) * (0-(-0.00262)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(bodymiddle, bodymiddle.rotateAngleX + (float) Math.toRadians(xx), bodymiddle.rotateAngleY + (float) Math.toRadians(yy), bodymiddle.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 0) / 5) * (1.725-(0)));
            yy = 0 + (((tickAnim - 0) / 5) * (-0.25-(0)));
            zz = 0 + (((tickAnim - 0) / 5) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 20) {
            xx = 1.725 + (((tickAnim - 5) / 15) * (4.00212-(1.725)));
            yy = -0.25 + (((tickAnim - 5) / 15) * (1.76399-(-0.25)));
            zz = 0 + (((tickAnim - 5) / 15) * (0.19602-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 40) {
            xx = 4.00212 + (((tickAnim - 20) / 20) * (0-(4.00212)));
            yy = 1.76399 + (((tickAnim - 20) / 20) * (0-(1.76399)));
            zz = 0.19602 + (((tickAnim - 20) / 20) * (0-(0.19602)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(bodyfront, bodyfront.rotateAngleX + (float) Math.toRadians(xx), bodyfront.rotateAngleY + (float) Math.toRadians(yy), bodyfront.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 0) / 20) * (1.3725+Math.sin((Math.PI/180)*(((double)tickAnim/20)*150+20))*10-(0)));
            yy = 0 + (((tickAnim - 0) / 20) * (-2.8993+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120))*5-(0)));
            zz = 0 + (((tickAnim - 0) / 20) * (-0.66362-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 40) {
            xx = 1.3725+Math.sin((Math.PI/180)*(((double)tickAnim/20)*150+20))*10 + (((tickAnim - 20) / 20) * (0-(1.3725+Math.sin((Math.PI/180)*(((double)tickAnim/20)*150+20))*10)));
            yy = -2.8993+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120))*5 + (((tickAnim - 20) / 20) * (0-(-2.8993+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120))*5)));
            zz = -0.66362 + (((tickAnim - 20) / 20) * (0-(-0.66362)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neckbase, neckbase.rotateAngleX + (float) Math.toRadians(xx), neckbase.rotateAngleY + (float) Math.toRadians(yy), neckbase.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 0) / 5) * (1.725-(0)));
            yy = 0 + (((tickAnim - 0) / 5) * (-1.75-(0)));
            zz = 0 + (((tickAnim - 0) / 5) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 20) {
            xx = 1.725 + (((tickAnim - 5) / 15) * (3.50174-(1.725)));
            yy = -1.75 + (((tickAnim - 5) / 15) * (0.52061-(-1.75)));
            zz = 0 + (((tickAnim - 5) / 15) * (-0.13252-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 33) {
            xx = 3.50174 + (((tickAnim - 20) / 13) * (-4.74826-(3.50174)));
            yy = 0.52061 + (((tickAnim - 20) / 13) * (0.24561-(0.52061)));
            zz = -0.13252 + (((tickAnim - 20) / 13) * (-0.13252-(-0.13252)));
        }
        else if (tickAnim >= 33 && tickAnim < 40) {
            xx = -4.74826 + (((tickAnim - 33) / 7) * (0-(-4.74826)));
            yy = 0.24561 + (((tickAnim - 33) / 7) * (0-(0.24561)));
            zz = -0.13252 + (((tickAnim - 33) / 7) * (0-(-0.13252)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neckmiddlebase, neckmiddlebase.rotateAngleX + (float) Math.toRadians(xx), neckmiddlebase.rotateAngleY + (float) Math.toRadians(yy), neckmiddlebase.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 0) / 5) * (9.75+Math.sin((Math.PI/180)*(((double)tickAnim/20)*150))*-15-(0)));
            yy = 0 + (((tickAnim - 0) / 5) * (1.75-(0)));
            zz = 0 + (((tickAnim - 0) / 5) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 20) {
            xx = 9.75+Math.sin((Math.PI/180)*(((double)tickAnim/20)*150))*-15 + (((tickAnim - 5) / 15) * (-0.8167+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120+90))*-5-(9.75+Math.sin((Math.PI/180)*(((double)tickAnim/20)*150))*-15)));
            yy = 1.75 + (((tickAnim - 5) / 15) * (14.0189+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120-120))*9-(1.75)));
            zz = 0 + (((tickAnim - 5) / 15) * (0.16514-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 40) {
            xx = -0.8167+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120+90))*-5 + (((tickAnim - 20) / 20) * (0-(-0.8167+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120+90))*-5)));
            yy = 14.0189+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120-120))*9 + (((tickAnim - 20) / 20) * (0-(14.0189+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120-120))*9)));
            zz = 0.16514 + (((tickAnim - 20) / 20) * (0-(0.16514)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neckmiddleend, neckmiddleend.rotateAngleX + (float) Math.toRadians(xx), neckmiddleend.rotateAngleY + (float) Math.toRadians(yy), neckmiddleend.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 0 + (((tickAnim - 0) / 3) * (0.86153-(0)));
            yy = 0 + (((tickAnim - 0) / 3) * (-1.3641+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120))*5-(0)));
            zz = 0 + (((tickAnim - 0) / 3) * (-1.52336-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 20) {
            xx = 0.86153 + (((tickAnim - 3) / 17) * (-13.94738-(0.86153)));
            yy = -1.3641+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120))*5 + (((tickAnim - 3) / 17) * (6.71337-(-1.3641+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120))*5)));
            zz = -1.52336 + (((tickAnim - 3) / 17) * (0.60731-(-1.52336)));
        }
        else if (tickAnim >= 20 && tickAnim < 33) {
            xx = -13.94738 + (((tickAnim - 20) / 13) * (-3.94738-(-13.94738)));
            yy = 6.71337 + (((tickAnim - 20) / 13) * (6.43837-(6.71337)));
            zz = 0.60731 + (((tickAnim - 20) / 13) * (0.60731-(0.60731)));
        }
        else if (tickAnim >= 33 && tickAnim < 40) {
            xx = -3.94738 + (((tickAnim - 33) / 7) * (0-(-3.94738)));
            yy = 6.43837 + (((tickAnim - 33) / 7) * (0-(6.43837)));
            zz = 0.60731 + (((tickAnim - 33) / 7) * (0-(0.60731)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neckend, neckend.rotateAngleX + (float) Math.toRadians(xx), neckend.rotateAngleY + (float) Math.toRadians(yy), neckend.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 0 + (((tickAnim - 0) / 3) * (-0.5839+Math.sin((Math.PI/180)*(((double)tickAnim/20)*150-20))*-5-(0)));
            yy = 0 + (((tickAnim - 0) / 3) * (-0.7641+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120))*5-(0)));
            zz = 0 + (((tickAnim - 0) / 3) * (-0.27546-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 20) {
            xx = -0.5839+Math.sin((Math.PI/180)*(((double)tickAnim/20)*150-20))*-5 + (((tickAnim - 3) / 17) * (-0.255+Math.sin((Math.PI/180)*(((double)tickAnim/20)*150))*-10-(-0.5839+Math.sin((Math.PI/180)*(((double)tickAnim/20)*150-20))*-5)));
            yy = -0.7641+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120))*5 + (((tickAnim - 3) / 17) * (4.5231-(-0.7641+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120))*5)));
            zz = -0.27546 + (((tickAnim - 3) / 17) * (-0.09249-(-0.27546)));
        }
        else if (tickAnim >= 20 && tickAnim < 40) {
            xx = -0.255+Math.sin((Math.PI/180)*(((double)tickAnim/20)*150))*-10 + (((tickAnim - 20) / 20) * (0-(-0.255+Math.sin((Math.PI/180)*(((double)tickAnim/20)*150))*-10)));
            yy = 4.5231 + (((tickAnim - 20) / 20) * (0-(4.5231)));
            zz = -0.09249 + (((tickAnim - 20) / 20) * (0-(-0.09249)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(head, head.rotateAngleX + (float) Math.toRadians(xx), head.rotateAngleY + (float) Math.toRadians(yy), head.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 0) / 5) * (3.725-(0)));
            yy = 0 + (((tickAnim - 0) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 5) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 20) {
            xx = 3.725 + (((tickAnim - 5) / 15) * (11.5-(3.725)));
            yy = 0 + (((tickAnim - 5) / 15) * (0.275-(0)));
            zz = 0 + (((tickAnim - 5) / 15) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 33) {
            xx = 11.5 + (((tickAnim - 20) / 13) * (0-(11.5)));
            yy = 0.275 + (((tickAnim - 20) / 13) * (0-(0.275)));
            zz = 0 + (((tickAnim - 20) / 13) * (0-(0)));
        }
        else if (tickAnim >= 33 && tickAnim < 40) {
            xx = 0 + (((tickAnim - 33) / 7) * (0-(0)));
            yy = 0 + (((tickAnim - 33) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 33) / 7) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(lowerjawback, lowerjawback.rotateAngleX + (float) Math.toRadians(xx), lowerjawback.rotateAngleY + (float) Math.toRadians(yy), lowerjawback.rotateAngleZ + (float) Math.toRadians(zz));



    }

    public void animNoiseRumble(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime, double animTick) {
        EntityPrehistoricFloraTyrannotitan entity = (EntityPrehistoricFloraTyrannotitan) entitylivingbaseIn;
        int animCycle = 49;
        double tickAnim = animTick + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;
         if (tickAnim >= 0 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 0) / 15) * (10.425+Math.sin((Math.PI/180)*(((double)tickAnim/20)*150))*-7-(0)));
            yy = 0 + (((tickAnim - 0) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 15) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 35) {
            xx = 10.425+Math.sin((Math.PI/180)*(((double)tickAnim/20)*150))*-7 + (((tickAnim - 15) / 20) * (3.525+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1220-120))*0.5-(10.425+Math.sin((Math.PI/180)*(((double)tickAnim/20)*150))*-7)));
            yy = 0 + (((tickAnim - 15) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 20) * (0-(0)));
        }
        else if (tickAnim >= 35 && tickAnim < 49) {
            xx = 3.525+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1220-120))*0.5 + (((tickAnim - 35) / 14) * (0-(3.525+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1220-120))*0.5)));
            yy = 0 + (((tickAnim - 35) / 14) * (0-(0)));
            zz = 0 + (((tickAnim - 35) / 14) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(bodymiddle, bodymiddle.rotateAngleX + (float) Math.toRadians(xx), bodymiddle.rotateAngleY + (float) Math.toRadians(yy), bodymiddle.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 0) / 15) * (-1.625+Math.sin((Math.PI/180)*(((double)tickAnim/20)*150))*7-(0)));
            yy = 0 + (((tickAnim - 0) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 15) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 35) {
            xx = -1.625+Math.sin((Math.PI/180)*(((double)tickAnim/20)*150))*7 + (((tickAnim - 15) / 20) * (-4.225+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1220-70))*0.5-(-1.625+Math.sin((Math.PI/180)*(((double)tickAnim/20)*150))*7)));
            yy = 0 + (((tickAnim - 15) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 20) * (0-(0)));
        }
        else if (tickAnim >= 35 && tickAnim < 49) {
            xx = -4.225+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1220-70))*0.5 + (((tickAnim - 35) / 14) * (0-(-4.225+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1220-70))*0.5)));
            yy = 0 + (((tickAnim - 35) / 14) * (0-(0)));
            zz = 0 + (((tickAnim - 35) / 14) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(bodyfront, bodyfront.rotateAngleX + (float) Math.toRadians(xx), bodyfront.rotateAngleY + (float) Math.toRadians(yy), bodyfront.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 0) / 15) * (-6.35+Math.sin((Math.PI/180)*(((double)tickAnim/20)*150+90))*5-(0)));
            yy = 0 + (((tickAnim - 0) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 15) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 35) {
            xx = -6.35+Math.sin((Math.PI/180)*(((double)tickAnim/20)*150+90))*5 + (((tickAnim - 15) / 20) * (16.9575+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1220-120))*-1-(-6.35+Math.sin((Math.PI/180)*(((double)tickAnim/20)*150+90))*5)));
            yy = 0 + (((tickAnim - 15) / 20) * (-0.19517-(0)));
            zz = 0 + (((tickAnim - 15) / 20) * (-2.8278-(0)));
        }
        else if (tickAnim >= 35 && tickAnim < 49) {
            xx = 16.9575+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1220-120))*-1 + (((tickAnim - 35) / 14) * (0-(16.9575+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1220-120))*-1)));
            yy = -0.19517 + (((tickAnim - 35) / 14) * (0-(-0.19517)));
            zz = -2.8278 + (((tickAnim - 35) / 14) * (0-(-2.8278)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neckbase, neckbase.rotateAngleX + (float) Math.toRadians(xx), neckbase.rotateAngleY + (float) Math.toRadians(yy), neckbase.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 0) / 15) * (3.175+Math.sin((Math.PI/180)*(((double)tickAnim/20)*150))*5-(0)));
            yy = 0 + (((tickAnim - 0) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 15) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 35) {
            xx = 3.175+Math.sin((Math.PI/180)*(((double)tickAnim/20)*150))*5 + (((tickAnim - 15) / 20) * (3.0186+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1220))*-1-(3.175+Math.sin((Math.PI/180)*(((double)tickAnim/20)*150))*5)));
            yy = 0 + (((tickAnim - 15) / 20) * (0.21049-(0)));
            zz = 0 + (((tickAnim - 15) / 20) * (-3.49367-(0)));
        }
        else if (tickAnim >= 35 && tickAnim < 49) {
            xx = 3.0186+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1220))*-1 + (((tickAnim - 35) / 14) * (0-(3.0186+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1220))*-1)));
            yy = 0.21049 + (((tickAnim - 35) / 14) * (0-(0.21049)));
            zz = -3.49367 + (((tickAnim - 35) / 14) * (0-(-3.49367)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neckmiddlebase, neckmiddlebase.rotateAngleX + (float) Math.toRadians(xx), neckmiddlebase.rotateAngleY + (float) Math.toRadians(yy), neckmiddlebase.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 0) / 15) * (7.875+Math.sin((Math.PI/180)*(((double)tickAnim/20)*150))*-7-(0)));
            yy = 0 + (((tickAnim - 0) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 15) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 35) {
            xx = 7.875+Math.sin((Math.PI/180)*(((double)tickAnim/20)*150))*-7 + (((tickAnim - 15) / 20) * (-14.91744-(7.875+Math.sin((Math.PI/180)*(((double)tickAnim/20)*150))*-7)));
            yy = 0 + (((tickAnim - 15) / 20) * (-0.29001-(0)));
            zz = 0 + (((tickAnim - 15) / 20) * (-2.98596-(0)));
        }
        else if (tickAnim >= 35 && tickAnim < 49) {
            xx = -14.91744 + (((tickAnim - 35) / 14) * (0-(-14.91744)));
            yy = -0.29001 + (((tickAnim - 35) / 14) * (0-(-0.29001)));
            zz = -2.98596 + (((tickAnim - 35) / 14) * (0-(-2.98596)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neckmiddleend, neckmiddleend.rotateAngleX + (float) Math.toRadians(xx), neckmiddleend.rotateAngleY + (float) Math.toRadians(yy), neckmiddleend.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 0) / 15) * (-3.15+Math.sin((Math.PI/180)*(((double)tickAnim/20)*150+90))*5-(0)));
            yy = 0 + (((tickAnim - 0) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 15) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 35) {
            xx = -3.15+Math.sin((Math.PI/180)*(((double)tickAnim/20)*150+90))*5 + (((tickAnim - 15) / 20) * (-8.7028+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120))*-5-(-3.15+Math.sin((Math.PI/180)*(((double)tickAnim/20)*150+90))*5)));
            yy = 0 + (((tickAnim - 15) / 20) * (0.16071-(0)));
            zz = 0 + (((tickAnim - 15) / 20) * (-1.99353-(0)));
        }
        else if (tickAnim >= 35 && tickAnim < 49) {
            xx = -8.7028+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120))*-5 + (((tickAnim - 35) / 14) * (0-(-8.7028+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120))*-5)));
            yy = 0.16071 + (((tickAnim - 35) / 14) * (0-(0.16071)));
            zz = -1.99353 + (((tickAnim - 35) / 14) * (0-(-1.99353)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neckend, neckend.rotateAngleX + (float) Math.toRadians(xx), neckend.rotateAngleY + (float) Math.toRadians(yy), neckend.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 0) / 15) * (-10.225+Math.sin((Math.PI/180)*(((double)tickAnim/20)*150))*7-(0)));
            yy = 0 + (((tickAnim - 0) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 15) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 35) {
            xx = -10.225+Math.sin((Math.PI/180)*(((double)tickAnim/20)*150))*7 + (((tickAnim - 15) / 20) * (-12.675-(-10.225+Math.sin((Math.PI/180)*(((double)tickAnim/20)*150))*7)));
            yy = 0 + (((tickAnim - 15) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 20) * (0-(0)));
        }
        else if (tickAnim >= 35 && tickAnim < 49) {
            xx = -12.675 + (((tickAnim - 35) / 14) * (0-(-12.675)));
            yy = 0 + (((tickAnim - 35) / 14) * (0-(0)));
            zz = 0 + (((tickAnim - 35) / 14) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(head, head.rotateAngleX + (float) Math.toRadians(xx), head.rotateAngleY + (float) Math.toRadians(yy), head.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 0) / 15) * (3.875+Math.sin((Math.PI/180)*(((double)tickAnim/20)*150))*1-(0)));
            yy = 0 + (((tickAnim - 0) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 15) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 23) {
            xx = 3.875+Math.sin((Math.PI/180)*(((double)tickAnim/20)*150))*1 + (((tickAnim - 15) / 8) * (-0.175-(3.875+Math.sin((Math.PI/180)*(((double)tickAnim/20)*150))*1)));
            yy = 0 + (((tickAnim - 15) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 8) * (0-(0)));
        }
        else if (tickAnim >= 23 && tickAnim < 35) {
            xx = -0.175 + (((tickAnim - 23) / 12) * (-0.175-(-0.175)));
            yy = 0 + (((tickAnim - 23) / 12) * (0-(0)));
            zz = 0 + (((tickAnim - 23) / 12) * (0-(0)));
        }
        else if (tickAnim >= 35 && tickAnim < 49) {
            xx = -0.175 + (((tickAnim - 35) / 14) * (0-(-0.175)));
            yy = 0 + (((tickAnim - 35) / 14) * (0-(0)));
            zz = 0 + (((tickAnim - 35) / 14) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(lowerjawback, lowerjawback.rotateAngleX + (float) Math.toRadians(xx), lowerjawback.rotateAngleY + (float) Math.toRadians(yy), lowerjawback.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 0) / 15) * (-4.5-(0)));
            yy = 0 + (((tickAnim - 0) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 15) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 18) {
            xx = -4.5 + (((tickAnim - 15) / 3) * (0-(-4.5)));
            yy = 0 + (((tickAnim - 15) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 3) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 22) {
            xx = 0 + (((tickAnim - 18) / 4) * (-4.5-(0)));
            yy = 0 + (((tickAnim - 18) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 18) / 4) * (0-(0)));
        }
        else if (tickAnim >= 22 && tickAnim < 25) {
            xx = -4.5 + (((tickAnim - 22) / 3) * (0-(-4.5)));
            yy = 0 + (((tickAnim - 22) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 22) / 3) * (0-(0)));
        }
        else if (tickAnim >= 25 && tickAnim < 28) {
            xx = 0 + (((tickAnim - 25) / 3) * (-4.5-(0)));
            yy = 0 + (((tickAnim - 25) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 25) / 3) * (0-(0)));
        }
        else if (tickAnim >= 28 && tickAnim < 32) {
            xx = -4.5 + (((tickAnim - 28) / 4) * (0-(-4.5)));
            yy = 0 + (((tickAnim - 28) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 28) / 4) * (0-(0)));
        }
        else if (tickAnim >= 32 && tickAnim < 35) {
            xx = 0 + (((tickAnim - 32) / 3) * (-4.5-(0)));
            yy = 0 + (((tickAnim - 32) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 32) / 3) * (0-(0)));
        }
        else if (tickAnim >= 35 && tickAnim < 38) {
            xx = -4.5 + (((tickAnim - 35) / 3) * (0-(-4.5)));
            yy = 0 + (((tickAnim - 35) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 35) / 3) * (0-(0)));
        }
        else if (tickAnim >= 38 && tickAnim < 42) {
            xx = 0 + (((tickAnim - 38) / 4) * (-4.5-(0)));
            yy = 0 + (((tickAnim - 38) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 38) / 4) * (0-(0)));
        }
        else if (tickAnim >= 42 && tickAnim < 49) {
            xx = -4.5 + (((tickAnim - 42) / 7) * (0-(-4.5)));
            yy = 0 + (((tickAnim - 42) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 42) / 7) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(throatpouchsegment1, throatpouchsegment1.rotateAngleX + (float) Math.toRadians(xx), throatpouchsegment1.rotateAngleY + (float) Math.toRadians(yy), throatpouchsegment1.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 0) / 15) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 15) * (-1.175-(0)));
            zz = 0 + (((tickAnim - 0) / 15) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 18) {
            xx = 0 + (((tickAnim - 15) / 3) * (0-(0)));
            yy = -1.175 + (((tickAnim - 15) / 3) * (0-(-1.175)));
            zz = 0 + (((tickAnim - 15) / 3) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 22) {
            xx = 0 + (((tickAnim - 18) / 4) * (0-(0)));
            yy = 0 + (((tickAnim - 18) / 4) * (-1.175-(0)));
            zz = 0 + (((tickAnim - 18) / 4) * (0-(0)));
        }
        else if (tickAnim >= 22 && tickAnim < 25) {
            xx = 0 + (((tickAnim - 22) / 3) * (0-(0)));
            yy = -1.175 + (((tickAnim - 22) / 3) * (0-(-1.175)));
            zz = 0 + (((tickAnim - 22) / 3) * (0-(0)));
        }
        else if (tickAnim >= 25 && tickAnim < 28) {
            xx = 0 + (((tickAnim - 25) / 3) * (0-(0)));
            yy = 0 + (((tickAnim - 25) / 3) * (-1.175-(0)));
            zz = 0 + (((tickAnim - 25) / 3) * (0-(0)));
        }
        else if (tickAnim >= 28 && tickAnim < 32) {
            xx = 0 + (((tickAnim - 28) / 4) * (0-(0)));
            yy = -1.175 + (((tickAnim - 28) / 4) * (0-(-1.175)));
            zz = 0 + (((tickAnim - 28) / 4) * (0-(0)));
        }
        else if (tickAnim >= 32 && tickAnim < 35) {
            xx = 0 + (((tickAnim - 32) / 3) * (0-(0)));
            yy = 0 + (((tickAnim - 32) / 3) * (-1.175-(0)));
            zz = 0 + (((tickAnim - 32) / 3) * (0-(0)));
        }
        else if (tickAnim >= 35 && tickAnim < 38) {
            xx = 0 + (((tickAnim - 35) / 3) * (0-(0)));
            yy = -1.175 + (((tickAnim - 35) / 3) * (0-(-1.175)));
            zz = 0 + (((tickAnim - 35) / 3) * (0-(0)));
        }
        else if (tickAnim >= 38 && tickAnim < 42) {
            xx = 0 + (((tickAnim - 38) / 4) * (0-(0)));
            yy = 0 + (((tickAnim - 38) / 4) * (-1.175-(0)));
            zz = 0 + (((tickAnim - 38) / 4) * (0-(0)));
        }
        else if (tickAnim >= 42 && tickAnim < 49) {
            xx = 0 + (((tickAnim - 42) / 7) * (0-(0)));
            yy = -1.175 + (((tickAnim - 42) / 7) * (0-(-1.175)));
            zz = 0 + (((tickAnim - 42) / 7) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.throatpouchsegment1.rotationPointX = this.throatpouchsegment1.rotationPointX + (float)(xx);
        this.throatpouchsegment1.rotationPointY = this.throatpouchsegment1.rotationPointY - (float)(yy);
        this.throatpouchsegment1.rotationPointZ = this.throatpouchsegment1.rotationPointZ + (float)(zz);


        if (tickAnim >= 0 && tickAnim < 15) {
            xx = 1 + (((tickAnim - 0) / 15) * (1-(1)));
            yy = 1 + (((tickAnim - 0) / 15) * (1.8275-(1)));
            zz = 1 + (((tickAnim - 0) / 15) * (1-(1)));
        }
        else if (tickAnim >= 15 && tickAnim < 18) {
            xx = 1 + (((tickAnim - 15) / 3) * (1-(1)));
            yy = 1.8275 + (((tickAnim - 15) / 3) * (1-(1.8275)));
            zz = 1 + (((tickAnim - 15) / 3) * (1-(1)));
        }
        else if (tickAnim >= 18 && tickAnim < 22) {
            xx = 1 + (((tickAnim - 18) / 4) * (1-(1)));
            yy = 1 + (((tickAnim - 18) / 4) * (1.8275-(1)));
            zz = 1 + (((tickAnim - 18) / 4) * (1-(1)));
        }
        else if (tickAnim >= 22 && tickAnim < 25) {
            xx = 1 + (((tickAnim - 22) / 3) * (1-(1)));
            yy = 1.8275 + (((tickAnim - 22) / 3) * (1-(1.8275)));
            zz = 1 + (((tickAnim - 22) / 3) * (1-(1)));
        }
        else if (tickAnim >= 25 && tickAnim < 28) {
            xx = 1 + (((tickAnim - 25) / 3) * (1-(1)));
            yy = 1 + (((tickAnim - 25) / 3) * (1.8275-(1)));
            zz = 1 + (((tickAnim - 25) / 3) * (1-(1)));
        }
        else if (tickAnim >= 28 && tickAnim < 32) {
            xx = 1 + (((tickAnim - 28) / 4) * (1-(1)));
            yy = 1.8275 + (((tickAnim - 28) / 4) * (1-(1.8275)));
            zz = 1 + (((tickAnim - 28) / 4) * (1-(1)));
        }
        else if (tickAnim >= 32 && tickAnim < 35) {
            xx = 1 + (((tickAnim - 32) / 3) * (1-(1)));
            yy = 1 + (((tickAnim - 32) / 3) * (1.8275-(1)));
            zz = 1 + (((tickAnim - 32) / 3) * (1-(1)));
        }
        else if (tickAnim >= 35 && tickAnim < 38) {
            xx = 1 + (((tickAnim - 35) / 3) * (1-(1)));
            yy = 1.8275 + (((tickAnim - 35) / 3) * (1-(1.8275)));
            zz = 1 + (((tickAnim - 35) / 3) * (1-(1)));
        }
        else if (tickAnim >= 38 && tickAnim < 42) {
            xx = 1 + (((tickAnim - 38) / 4) * (1-(1)));
            yy = 1 + (((tickAnim - 38) / 4) * (1.8275-(1)));
            zz = 1 + (((tickAnim - 38) / 4) * (1-(1)));
        }
        else if (tickAnim >= 42 && tickAnim < 49) {
            xx = 1 + (((tickAnim - 42) / 7) * (1-(1)));
            yy = 1.8275 + (((tickAnim - 42) / 7) * (1-(1.8275)));
            zz = 1 + (((tickAnim - 42) / 7) * (1-(1)));
        }
        else {
            xx = 1;
            yy = 1;
            zz = 1;
        }
        this.throatpouchsegment1.setScale((float)xx, (float)yy, (float)zz);




        if (tickAnim >= 0 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 0) / 15) * (-1.625+Math.sin((Math.PI/180)*(((double)tickAnim/20)*150))*7-(0)));
            yy = 0 + (((tickAnim - 0) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 15) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 35) {
            xx = -1.625+Math.sin((Math.PI/180)*(((double)tickAnim/20)*150))*7 + (((tickAnim - 15) / 20) * (-13.175-(-1.625+Math.sin((Math.PI/180)*(((double)tickAnim/20)*150))*7)));
            yy = 0 + (((tickAnim - 15) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 20) * (0-(0)));
        }
        else if (tickAnim >= 35 && tickAnim < 49) {
            xx = -13.175 + (((tickAnim - 35) / 14) * (0-(-13.175)));
            yy = 0 + (((tickAnim - 35) / 14) * (0-(0)));
            zz = 0 + (((tickAnim - 35) / 14) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightupperarm, rightupperarm.rotateAngleX + (float) Math.toRadians(xx), rightupperarm.rotateAngleY + (float) Math.toRadians(yy), rightupperarm.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 0) / 15) * (-1.625+Math.sin((Math.PI/180)*(((double)tickAnim/20)*150))*7-(0)));
            yy = 0 + (((tickAnim - 0) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 15) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 35) {
            xx = -1.625+Math.sin((Math.PI/180)*(((double)tickAnim/20)*150))*7 + (((tickAnim - 15) / 20) * (11.325-(-1.625+Math.sin((Math.PI/180)*(((double)tickAnim/20)*150))*7)));
            yy = 0 + (((tickAnim - 15) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 20) * (0-(0)));
        }
        else if (tickAnim >= 35 && tickAnim < 49) {
            xx = 11.325 + (((tickAnim - 35) / 14) * (0-(11.325)));
            yy = 0 + (((tickAnim - 35) / 14) * (0-(0)));
            zz = 0 + (((tickAnim - 35) / 14) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightlowerarm, rightlowerarm.rotateAngleX + (float) Math.toRadians(xx), rightlowerarm.rotateAngleY + (float) Math.toRadians(yy), rightlowerarm.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 0) / 15) * (-1.625+Math.sin((Math.PI/180)*(((double)tickAnim/20)*150))*7-(0)));
            yy = 0 + (((tickAnim - 0) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 15) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 35) {
            xx = -1.625+Math.sin((Math.PI/180)*(((double)tickAnim/20)*150))*7 + (((tickAnim - 15) / 20) * (-13.175-(-1.625+Math.sin((Math.PI/180)*(((double)tickAnim/20)*150))*7)));
            yy = 0 + (((tickAnim - 15) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 20) * (0-(0)));
        }
        else if (tickAnim >= 35 && tickAnim < 49) {
            xx = -13.175 + (((tickAnim - 35) / 14) * (0-(-13.175)));
            yy = 0 + (((tickAnim - 35) / 14) * (0-(0)));
            zz = 0 + (((tickAnim - 35) / 14) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftupperarm, leftupperarm.rotateAngleX + (float) Math.toRadians(xx), leftupperarm.rotateAngleY + (float) Math.toRadians(yy), leftupperarm.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 0) / 15) * (-1.625+Math.sin((Math.PI/180)*(((double)tickAnim/20)*150))*7-(0)));
            yy = 0 + (((tickAnim - 0) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 15) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 35) {
            xx = -1.625+Math.sin((Math.PI/180)*(((double)tickAnim/20)*150))*7 + (((tickAnim - 15) / 20) * (11.325-(-1.625+Math.sin((Math.PI/180)*(((double)tickAnim/20)*150))*7)));
            yy = 0 + (((tickAnim - 15) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 20) * (0-(0)));
        }
        else if (tickAnim >= 35 && tickAnim < 49) {
            xx = 11.325 + (((tickAnim - 35) / 14) * (0-(11.325)));
            yy = 0 + (((tickAnim - 35) / 14) * (0-(0)));
            zz = 0 + (((tickAnim - 35) / 14) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftlowerarm, leftlowerarm.rotateAngleX + (float) Math.toRadians(xx), leftlowerarm.rotateAngleY + (float) Math.toRadians(yy), leftlowerarm.rotateAngleZ + (float) Math.toRadians(zz));



    }
    public void animAlert(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime, double animTick) {
        EntityPrehistoricFloraTyrannotitan entity = (EntityPrehistoricFloraTyrannotitan) entitylivingbaseIn;
        int animCycle = 210;
        double tickAnim = animTick + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;
     if (tickAnim >= 0 && tickAnim < 210) {
            xx = 0 + (((tickAnim - 0) / 210) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 210) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 210) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(hips, hips.rotateAngleX + (float) Math.toRadians(xx), hips.rotateAngleY + (float) Math.toRadians(yy), hips.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 0) / 20) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 20) * (-0.8-(0)));
            zz = 0 + (((tickAnim - 0) / 20) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 184) {
            xx = 0 + (((tickAnim - 20) / 164) * (0-(0)));
            yy = -0.8 + (((tickAnim - 20) / 164) * (-0.8-(-0.8)));
            zz = 0 + (((tickAnim - 20) / 164) * (0-(0)));
        }
        else if (tickAnim >= 184 && tickAnim < 210) {
            xx = 0 + (((tickAnim - 184) / 26) * (0-(0)));
            yy = -0.8 + (((tickAnim - 184) / 26) * (0-(-0.8)));
            zz = 0 + (((tickAnim - 184) / 26) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.hips.rotationPointX = this.hips.rotationPointX + (float)(xx);
        this.hips.rotationPointY = this.hips.rotationPointY - (float)(yy);
        this.hips.rotationPointZ = this.hips.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 55) {
            xx = 0 + (((tickAnim - 0) / 55) * (9.95+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120-20))*2-(0)));
            yy = 0 + (((tickAnim - 0) / 55) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 55) * (0-(0)));
        }
        else if (tickAnim >= 55 && tickAnim < 98) {
            xx = 9.95+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120-20))*2 + (((tickAnim - 55) / 43) * (12.3+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120+120))*-2-(9.95+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120-20))*2)));
            yy = 0 + (((tickAnim - 55) / 43) * (0-(0)));
            zz = 0 + (((tickAnim - 55) / 43) * (0-(0)));
        }
        else if (tickAnim >= 98 && tickAnim < 121) {
            xx = 12.3+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120+120))*-2 + (((tickAnim - 98) / 23) * (5.3739+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120-20))*-2-(12.3+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120+120))*-2)));
            yy = 0 + (((tickAnim - 98) / 23) * (1.99899-(0)));
            zz = 0 + (((tickAnim - 98) / 23) * (-0.06353-(0)));
        }
        else if (tickAnim >= 121 && tickAnim < 138) {
            xx = 5.3739+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120-20))*-2 + (((tickAnim - 121) / 17) * (4.7739+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120-20))*-2-(5.3739+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120-20))*-2)));
            yy = 1.99899 + (((tickAnim - 121) / 17) * (1.99899-(1.99899)));
            zz = -0.06353 + (((tickAnim - 121) / 17) * (-0.06353-(-0.06353)));
        }
        else if (tickAnim >= 138 && tickAnim < 167) {
            xx = 4.7739+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120-20))*-2 + (((tickAnim - 138) / 29) * (2.5489+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120-90))*-2-(4.7739+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120-20))*-2)));
            yy = 1.99899 + (((tickAnim - 138) / 29) * (1.99899-(1.99899)));
            zz = -0.06353 + (((tickAnim - 138) / 29) * (-0.06353-(-0.06353)));
        }
        else if (tickAnim >= 167 && tickAnim < 184) {
            xx = 2.5489+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120-90))*-2 + (((tickAnim - 167) / 17) * (1.7489+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120-130))*-2-(2.5489+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120-90))*-2)));
            yy = 1.99899 + (((tickAnim - 167) / 17) * (1.99899-(1.99899)));
            zz = -0.06353 + (((tickAnim - 167) / 17) * (-0.06353-(-0.06353)));
        }
        else if (tickAnim >= 184 && tickAnim < 210) {
            xx = 1.7489+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120-130))*-2 + (((tickAnim - 184) / 26) * (0-(1.7489+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120-130))*-2)));
            yy = 1.99899 + (((tickAnim - 184) / 26) * (0-(1.99899)));
            zz = -0.06353 + (((tickAnim - 184) / 26) * (0-(-0.06353)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(bodymiddle, bodymiddle.rotateAngleX + (float) Math.toRadians(xx), bodymiddle.rotateAngleY + (float) Math.toRadians(yy), bodymiddle.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 55) {
            xx = 0 + (((tickAnim - 0) / 55) * (5-(0)));
            yy = 0 + (((tickAnim - 0) / 55) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 55) * (0-(0)));
        }
        else if (tickAnim >= 55 && tickAnim < 121) {
            xx = 5 + (((tickAnim - 55) / 66) * (-0.24649-(5)));
            yy = 0 + (((tickAnim - 55) / 66) * (3.24765-(0)));
            zz = 0 + (((tickAnim - 55) / 66) * (0.12376-(0)));
        }
        else if (tickAnim >= 121 && tickAnim < 160) {
            xx = -0.24649 + (((tickAnim - 121) / 39) * (-1.99649-(-0.24649)));
            yy = 3.24765 + (((tickAnim - 121) / 39) * (3.24765-(3.24765)));
            zz = 0.12376 + (((tickAnim - 121) / 39) * (0.12376-(0.12376)));
        }
        else if (tickAnim >= 160 && tickAnim < 170) {
            xx = -1.99649 + (((tickAnim - 160) / 10) * (-2.74649-(-1.99649)));
            yy = 3.24765 + (((tickAnim - 160) / 10) * (3.24765-(3.24765)));
            zz = 0.12376 + (((tickAnim - 160) / 10) * (0.12376-(0.12376)));
        }
        else if (tickAnim >= 170 && tickAnim < 184) {
            xx = -2.74649 + (((tickAnim - 170) / 14) * (-3.24649-(-2.74649)));
            yy = 3.24765 + (((tickAnim - 170) / 14) * (3.24765-(3.24765)));
            zz = 0.12376 + (((tickAnim - 170) / 14) * (0.12376-(0.12376)));
        }
        else if (tickAnim >= 184 && tickAnim < 210) {
            xx = -3.24649 + (((tickAnim - 184) / 26) * (0-(-3.24649)));
            yy = 3.24765 + (((tickAnim - 184) / 26) * (0-(3.24765)));
            zz = 0.12376 + (((tickAnim - 184) / 26) * (0-(0.12376)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(bodyfront, bodyfront.rotateAngleX + (float) Math.toRadians(xx), bodyfront.rotateAngleY + (float) Math.toRadians(yy), bodyfront.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 55) {
            xx = 0 + (((tickAnim - 0) / 55) * (20-(0)));
            yy = 0 + (((tickAnim - 0) / 55) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 55) * (0-(0)));
        }
        else if (tickAnim >= 55 && tickAnim < 98) {
            xx = 20 + (((tickAnim - 55) / 43) * (14.575+Math.sin((Math.PI/180)*(((double)tickAnim/20)*90+20))*5-(20)));
            yy = 0 + (((tickAnim - 55) / 43) * (0-(0)));
            zz = 0 + (((tickAnim - 55) / 43) * (0-(0)));
        }
        else if (tickAnim >= 98 && tickAnim < 138) {
            xx = 14.575+Math.sin((Math.PI/180)*(((double)tickAnim/20)*90+20))*5 + (((tickAnim - 98) / 40) * (0-(14.575+Math.sin((Math.PI/180)*(((double)tickAnim/20)*90+20))*5)));
            yy = 0 + (((tickAnim - 98) / 40) * (4.75-(0)));
            zz = 0 + (((tickAnim - 98) / 40) * (0-(0)));
        }
        else if (tickAnim >= 138 && tickAnim < 184) {
            xx = 0 + (((tickAnim - 138) / 46) * (0-(0)));
            yy = 4.75 + (((tickAnim - 138) / 46) * (4.75-(4.75)));
            zz = 0 + (((tickAnim - 138) / 46) * (0-(0)));
        }
        else if (tickAnim >= 184 && tickAnim < 210) {
            xx = 0 + (((tickAnim - 184) / 26) * (0-(0)));
            yy = 4.75 + (((tickAnim - 184) / 26) * (0-(4.75)));
            zz = 0 + (((tickAnim - 184) / 26) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neckbase, neckbase.rotateAngleX + (float) Math.toRadians(xx), neckbase.rotateAngleY + (float) Math.toRadians(yy), neckbase.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 55) {
            xx = 0 + (((tickAnim - 0) / 55) * (22.25-(0)));
            yy = 0 + (((tickAnim - 0) / 55) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 55) * (0-(0)));
        }
        else if (tickAnim >= 55 && tickAnim < 98) {
            xx = 22.25 + (((tickAnim - 55) / 43) * (22.25-(22.25)));
            yy = 0 + (((tickAnim - 55) / 43) * (0-(0)));
            zz = 0 + (((tickAnim - 55) / 43) * (0-(0)));
        }
        else if (tickAnim >= 98 && tickAnim < 138) {
            xx = 22.25 + (((tickAnim - 98) / 40) * (0-(22.25)));
            yy = 0 + (((tickAnim - 98) / 40) * (7-(0)));
            zz = 0 + (((tickAnim - 98) / 40) * (0-(0)));
        }
        else if (tickAnim >= 138 && tickAnim < 184) {
            xx = 0 + (((tickAnim - 138) / 46) * (0-(0)));
            yy = 7 + (((tickAnim - 138) / 46) * (7-(7)));
            zz = 0 + (((tickAnim - 138) / 46) * (0-(0)));
        }
        else if (tickAnim >= 184 && tickAnim < 210) {
            xx = 0 + (((tickAnim - 184) / 26) * (0-(0)));
            yy = 7 + (((tickAnim - 184) / 26) * (0-(7)));
            zz = 0 + (((tickAnim - 184) / 26) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neckmiddlebase, neckmiddlebase.rotateAngleX + (float) Math.toRadians(xx), neckmiddlebase.rotateAngleY + (float) Math.toRadians(yy), neckmiddlebase.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 55) {
            xx = 0 + (((tickAnim - 0) / 55) * (-8.5-(0)));
            yy = 0 + (((tickAnim - 0) / 55) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 55) * (0-(0)));
        }
        else if (tickAnim >= 55 && tickAnim < 98) {
            xx = -8.5 + (((tickAnim - 55) / 43) * (-8.5-(-8.5)));
            yy = 0 + (((tickAnim - 55) / 43) * (0-(0)));
            zz = 0 + (((tickAnim - 55) / 43) * (0-(0)));
        }
        else if (tickAnim >= 98 && tickAnim < 138) {
            xx = -8.5 + (((tickAnim - 98) / 40) * (0.19969-(-8.5)));
            yy = 0 + (((tickAnim - 98) / 40) * (5.61664-(0)));
            zz = 0 + (((tickAnim - 98) / 40) * (1.97305-(0)));
        }
        else if (tickAnim >= 138 && tickAnim < 184) {
            xx = 0.19969 + (((tickAnim - 138) / 46) * (0.19969-(0.19969)));
            yy = 5.61664 + (((tickAnim - 138) / 46) * (5.61664-(5.61664)));
            zz = 1.97305 + (((tickAnim - 138) / 46) * (1.97305-(1.97305)));
        }
        else if (tickAnim >= 184 && tickAnim < 210) {
            xx = 0.19969 + (((tickAnim - 184) / 26) * (0-(0.19969)));
            yy = 5.61664 + (((tickAnim - 184) / 26) * (0-(5.61664)));
            zz = 1.97305 + (((tickAnim - 184) / 26) * (0-(1.97305)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neckmiddleend, neckmiddleend.rotateAngleX + (float) Math.toRadians(xx), neckmiddleend.rotateAngleY + (float) Math.toRadians(yy), neckmiddleend.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 55) {
            xx = 0 + (((tickAnim - 0) / 55) * (-11.5-(0)));
            yy = 0 + (((tickAnim - 0) / 55) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 55) * (0-(0)));
        }
        else if (tickAnim >= 55 && tickAnim < 60) {
            xx = -11.5 + (((tickAnim - 55) / 5) * (-10.75-(-11.5)));
            yy = 0 + (((tickAnim - 55) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 55) / 5) * (0-(0)));
        }
        else if (tickAnim >= 60 && tickAnim < 63) {
            xx = -10.75 + (((tickAnim - 60) / 3) * (-11.675-(-10.75)));
            yy = 0 + (((tickAnim - 60) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 60) / 3) * (0-(0)));
        }
        else if (tickAnim >= 63 && tickAnim < 69) {
            xx = -11.675 + (((tickAnim - 63) / 6) * (-10.75-(-11.675)));
            yy = 0 + (((tickAnim - 63) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 63) / 6) * (0-(0)));
        }
        else if (tickAnim >= 69 && tickAnim < 73) {
            xx = -10.75 + (((tickAnim - 69) / 4) * (-11.6-(-10.75)));
            yy = 0 + (((tickAnim - 69) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 69) / 4) * (0-(0)));
        }
        else if (tickAnim >= 73 && tickAnim < 98) {
            xx = -11.6 + (((tickAnim - 73) / 25) * (-8.5-(-11.6)));
            yy = 0 + (((tickAnim - 73) / 25) * (0-(0)));
            zz = 0 + (((tickAnim - 73) / 25) * (0-(0)));
        }
        else if (tickAnim >= 98 && tickAnim < 138) {
            xx = -8.5 + (((tickAnim - 98) / 40) * (0-(-8.5)));
            yy = 0 + (((tickAnim - 98) / 40) * (0-(0)));
            zz = 0 + (((tickAnim - 98) / 40) * (0-(0)));
        }
        else if (tickAnim >= 138 && tickAnim < 151) {
            xx = 0 + (((tickAnim - 138) / 13) * (0-(0)));
            yy = 0 + (((tickAnim - 138) / 13) * (0-(0)));
            zz = 0 + (((tickAnim - 138) / 13) * (0-(0)));
        }
        else if (tickAnim >= 151 && tickAnim < 154) {
            xx = 0 + (((tickAnim - 151) / 3) * (0.25-(0)));
            yy = 0 + (((tickAnim - 151) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 151) / 3) * (0-(0)));
        }
        else if (tickAnim >= 154 && tickAnim < 158) {
            xx = 0.25 + (((tickAnim - 154) / 4) * (0-(0.25)));
            yy = 0 + (((tickAnim - 154) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 154) / 4) * (0-(0)));
        }
        else if (tickAnim >= 158 && tickAnim < 161) {
            xx = 0 + (((tickAnim - 158) / 3) * (0.25-(0)));
            yy = 0 + (((tickAnim - 158) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 158) / 3) * (0-(0)));
        }
        else if (tickAnim >= 161 && tickAnim < 164) {
            xx = 0.25 + (((tickAnim - 161) / 3) * (0-(0.25)));
            yy = 0 + (((tickAnim - 161) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 161) / 3) * (0-(0)));
        }
        else if (tickAnim >= 164 && tickAnim < 184) {
            xx = 0 + (((tickAnim - 164) / 20) * (0-(0)));
            yy = 0 + (((tickAnim - 164) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 164) / 20) * (0-(0)));
        }
        else if (tickAnim >= 184 && tickAnim < 210) {
            xx = 0 + (((tickAnim - 184) / 26) * (0-(0)));
            yy = 0 + (((tickAnim - 184) / 26) * (0-(0)));
            zz = 0 + (((tickAnim - 184) / 26) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neckend, neckend.rotateAngleX + (float) Math.toRadians(xx), neckend.rotateAngleY + (float) Math.toRadians(yy), neckend.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 0) / 15) * (7.88-(0)));
            yy = 0 + (((tickAnim - 0) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 15) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 55) {
            xx = 7.88 + (((tickAnim - 15) / 40) * (-5.675-(7.88)));
            yy = 0 + (((tickAnim - 15) / 40) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 40) * (0-(0)));
        }
        else if (tickAnim >= 55 && tickAnim < 60) {
            xx = -5.675 + (((tickAnim - 55) / 5) * (-5-(-5.675)));
            yy = 0 + (((tickAnim - 55) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 55) / 5) * (0-(0)));
        }
        else if (tickAnim >= 60 && tickAnim < 65) {
            xx = -5 + (((tickAnim - 60) / 5) * (-6.025-(-5)));
            yy = 0 + (((tickAnim - 60) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 60) / 5) * (0-(0)));
        }
        else if (tickAnim >= 65 && tickAnim < 69) {
            xx = -6.025 + (((tickAnim - 65) / 4) * (-5-(-6.025)));
            yy = 0 + (((tickAnim - 65) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 65) / 4) * (0-(0)));
        }
        else if (tickAnim >= 69 && tickAnim < 73) {
            xx = -5 + (((tickAnim - 69) / 4) * (-5.625-(-5)));
            yy = 0 + (((tickAnim - 69) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 69) / 4) * (0-(0)));
        }
        else if (tickAnim >= 73 && tickAnim < 98) {
            xx = -5.625 + (((tickAnim - 73) / 25) * (0-(-5.625)));
            yy = 0 + (((tickAnim - 73) / 25) * (0-(0)));
            zz = 0 + (((tickAnim - 73) / 25) * (0-(0)));
        }
        else if (tickAnim >= 98 && tickAnim < 103) {
            xx = 0 + (((tickAnim - 98) / 5) * (4.35-(0)));
            yy = 0 + (((tickAnim - 98) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 98) / 5) * (0-(0)));
        }
        else if (tickAnim >= 103 && tickAnim < 138) {
            xx = 4.35 + (((tickAnim - 103) / 35) * (0-(4.35)));
            yy = 0 + (((tickAnim - 103) / 35) * (0-(0)));
            zz = 0 + (((tickAnim - 103) / 35) * (0-(0)));
        }
        else if (tickAnim >= 138 && tickAnim < 151) {
            xx = 0 + (((tickAnim - 138) / 13) * (0-(0)));
            yy = 0 + (((tickAnim - 138) / 13) * (0-(0)));
            zz = 0 + (((tickAnim - 138) / 13) * (0-(0)));
        }
        else if (tickAnim >= 151 && tickAnim < 154) {
            xx = 0 + (((tickAnim - 151) / 3) * (-0.75-(0)));
            yy = 0 + (((tickAnim - 151) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 151) / 3) * (0-(0)));
        }
        else if (tickAnim >= 154 && tickAnim < 158) {
            xx = -0.75 + (((tickAnim - 154) / 4) * (0-(-0.75)));
            yy = 0 + (((tickAnim - 154) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 154) / 4) * (0-(0)));
        }
        else if (tickAnim >= 158 && tickAnim < 161) {
            xx = 0 + (((tickAnim - 158) / 3) * (-0.75-(0)));
            yy = 0 + (((tickAnim - 158) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 158) / 3) * (0-(0)));
        }
        else if (tickAnim >= 161 && tickAnim < 164) {
            xx = -0.75 + (((tickAnim - 161) / 3) * (0-(-0.75)));
            yy = 0 + (((tickAnim - 161) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 161) / 3) * (0-(0)));
        }
        else if (tickAnim >= 164 && tickAnim < 184) {
            xx = 0 + (((tickAnim - 164) / 20) * (0-(0)));
            yy = 0 + (((tickAnim - 164) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 164) / 20) * (0-(0)));
        }
        else if (tickAnim >= 184 && tickAnim < 210) {
            xx = 0 + (((tickAnim - 184) / 26) * (0-(0)));
            yy = 0 + (((tickAnim - 184) / 26) * (0-(0)));
            zz = 0 + (((tickAnim - 184) / 26) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(head, head.rotateAngleX + (float) Math.toRadians(xx), head.rotateAngleY + (float) Math.toRadians(yy), head.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 73 && tickAnim < 85) {
            xx = 0 + (((tickAnim - 73) / 12) * (2.25-(0)));
            yy = 0 + (((tickAnim - 73) / 12) * (0-(0)));
            zz = 0 + (((tickAnim - 73) / 12) * (0-(0)));
        }
        else if (tickAnim >= 85 && tickAnim < 98) {
            xx = 2.25 + (((tickAnim - 85) / 13) * (0-(2.25)));
            yy = 0 + (((tickAnim - 85) / 13) * (0-(0)));
            zz = 0 + (((tickAnim - 85) / 13) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(lowerjawback, lowerjawback.rotateAngleX + (float) Math.toRadians(xx), lowerjawback.rotateAngleY + (float) Math.toRadians(yy), lowerjawback.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 0) / 20) * (-9-(0)));
            yy = 0 + (((tickAnim - 0) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 20) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 62) {
            xx = -9 + (((tickAnim - 20) / 42) * (-9-(-9)));
            yy = 0 + (((tickAnim - 20) / 42) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 42) * (0-(0)));
        }
        else if (tickAnim >= 62 && tickAnim < 184) {
            xx = -9 + (((tickAnim - 62) / 122) * (-9-(-9)));
            yy = 0 + (((tickAnim - 62) / 122) * (0-(0)));
            zz = 0 + (((tickAnim - 62) / 122) * (0-(0)));
        }
        else if (tickAnim >= 184 && tickAnim < 210) {
            xx = -9 + (((tickAnim - 184) / 26) * (0-(-9)));
            yy = 0 + (((tickAnim - 184) / 26) * (0-(0)));
            zz = 0 + (((tickAnim - 184) / 26) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightthigh, rightthigh.rotateAngleX + (float) Math.toRadians(xx), rightthigh.rotateAngleY + (float) Math.toRadians(yy), rightthigh.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 0) / 10) * (3.75-(0)));
            yy = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 20) {
            xx = 3.75 + (((tickAnim - 10) / 10) * (-11-(3.75)));
            yy = 0 + (((tickAnim - 10) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 10) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 62) {
            xx = -11 + (((tickAnim - 20) / 42) * (-11-(-11)));
            yy = 0 + (((tickAnim - 20) / 42) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 42) * (0-(0)));
        }
        else if (tickAnim >= 62 && tickAnim < 184) {
            xx = -11 + (((tickAnim - 62) / 122) * (-11-(-11)));
            yy = 0 + (((tickAnim - 62) / 122) * (0-(0)));
            zz = 0 + (((tickAnim - 62) / 122) * (0-(0)));
        }
        else if (tickAnim >= 184 && tickAnim < 198) {
            xx = -11 + (((tickAnim - 184) / 14) * (26.93-(-11)));
            yy = 0 + (((tickAnim - 184) / 14) * (0-(0)));
            zz = 0 + (((tickAnim - 184) / 14) * (0-(0)));
        }
        else if (tickAnim >= 198 && tickAnim < 210) {
            xx = 26.93 + (((tickAnim - 198) / 12) * (0-(26.93)));
            yy = 0 + (((tickAnim - 198) / 12) * (0-(0)));
            zz = 0 + (((tickAnim - 198) / 12) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightshin, rightshin.rotateAngleX + (float) Math.toRadians(xx), rightshin.rotateAngleY + (float) Math.toRadians(yy), rightshin.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 0) / 10) * (-39.87-(0)));
            yy = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 20) {
            xx = -39.87 + (((tickAnim - 10) / 10) * (1-(-39.87)));
            yy = 0 + (((tickAnim - 10) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 10) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 62) {
            xx = 1 + (((tickAnim - 20) / 42) * (1-(1)));
            yy = 0 + (((tickAnim - 20) / 42) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 42) * (0-(0)));
        }
        else if (tickAnim >= 62 && tickAnim < 184) {
            xx = 1 + (((tickAnim - 62) / 122) * (1-(1)));
            yy = 0 + (((tickAnim - 62) / 122) * (0-(0)));
            zz = 0 + (((tickAnim - 62) / 122) * (0-(0)));
        }
        else if (tickAnim >= 184 && tickAnim < 198) {
            xx = 1 + (((tickAnim - 184) / 14) * (-30.52-(1)));
            yy = 0 + (((tickAnim - 184) / 14) * (0-(0)));
            zz = 0 + (((tickAnim - 184) / 14) * (0-(0)));
        }
        else if (tickAnim >= 198 && tickAnim < 210) {
            xx = -30.52 + (((tickAnim - 198) / 12) * (0-(-30.52)));
            yy = 0 + (((tickAnim - 198) / 12) * (0-(0)));
            zz = 0 + (((tickAnim - 198) / 12) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightankle, rightankle.rotateAngleX + (float) Math.toRadians(xx), rightankle.rotateAngleY + (float) Math.toRadians(yy), rightankle.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 0) / 10) * (74-(0)));
            yy = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 20) {
            xx = 74 + (((tickAnim - 10) / 10) * (19.25-(74)));
            yy = 0 + (((tickAnim - 10) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 10) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 62) {
            xx = 19.25 + (((tickAnim - 20) / 42) * (19.25-(19.25)));
            yy = 0 + (((tickAnim - 20) / 42) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 42) * (0-(0)));
        }
        else if (tickAnim >= 62 && tickAnim < 184) {
            xx = 19.25 + (((tickAnim - 62) / 122) * (19.25-(19.25)));
            yy = 0 + (((tickAnim - 62) / 122) * (0-(0)));
            zz = 0 + (((tickAnim - 62) / 122) * (0-(0)));
        }
        else if (tickAnim >= 184 && tickAnim < 198) {
            xx = 19.25 + (((tickAnim - 184) / 14) * (48.56-(19.25)));
            yy = 0 + (((tickAnim - 184) / 14) * (0-(0)));
            zz = 0 + (((tickAnim - 184) / 14) * (0-(0)));
        }
        else if (tickAnim >= 198 && tickAnim < 204) {
            xx = 48.56 + (((tickAnim - 198) / 6) * (74.91-(48.56)));
            yy = 0 + (((tickAnim - 198) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 198) / 6) * (0-(0)));
        }
        else if (tickAnim >= 204 && tickAnim < 210) {
            xx = 74.91 + (((tickAnim - 204) / 6) * (0-(74.91)));
            yy = 0 + (((tickAnim - 204) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 204) / 6) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightfoot, rightfoot.rotateAngleX + (float) Math.toRadians(xx), rightfoot.rotateAngleY + (float) Math.toRadians(yy), rightfoot.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (-1.25-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 10) / 10) * (0-(0)));
            yy = 0 + (((tickAnim - 10) / 10) * (0-(0)));
            zz = -1.25 + (((tickAnim - 10) / 10) * (0-(-1.25)));
        }
        else if (tickAnim >= 20 && tickAnim < 62) {
            xx = 0 + (((tickAnim - 20) / 42) * (0-(0)));
            yy = 0 + (((tickAnim - 20) / 42) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 42) * (0-(0)));
        }
        else if (tickAnim >= 62 && tickAnim < 184) {
            xx = 0 + (((tickAnim - 62) / 122) * (0-(0)));
            yy = 0 + (((tickAnim - 62) / 122) * (0-(0)));
            zz = 0 + (((tickAnim - 62) / 122) * (0-(0)));
        }
        else if (tickAnim >= 184 && tickAnim < 198) {
            xx = 0 + (((tickAnim - 184) / 14) * (0-(0)));
            yy = 0 + (((tickAnim - 184) / 14) * (1.625-(0)));
            zz = 0 + (((tickAnim - 184) / 14) * (-0.775-(0)));
        }
        else if (tickAnim >= 198 && tickAnim < 210) {
            xx = 0 + (((tickAnim - 198) / 12) * (0-(0)));
            yy = 1.625 + (((tickAnim - 198) / 12) * (0-(1.625)));
            zz = -0.775 + (((tickAnim - 198) / 12) * (0-(-0.775)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.rightfoot.rotationPointX = this.rightfoot.rotationPointX + (float)(xx);
        this.rightfoot.rotationPointY = this.rightfoot.rotationPointY - (float)(yy);
        this.rightfoot.rotationPointZ = this.rightfoot.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 0) / 20) * (1.5-(0)));
            yy = 0 + (((tickAnim - 0) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 20) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 62) {
            xx = 1.5 + (((tickAnim - 20) / 42) * (1.5-(1.5)));
            yy = 0 + (((tickAnim - 20) / 42) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 42) * (0-(0)));
        }
        else if (tickAnim >= 62 && tickAnim < 184) {
            xx = 1.5 + (((tickAnim - 62) / 122) * (1.5-(1.5)));
            yy = 0 + (((tickAnim - 62) / 122) * (0-(0)));
            zz = 0 + (((tickAnim - 62) / 122) * (0-(0)));
        }
        else if (tickAnim >= 184 && tickAnim < 210) {
            xx = 1.5 + (((tickAnim - 184) / 26) * (0-(1.5)));
            yy = 0 + (((tickAnim - 184) / 26) * (0-(0)));
            zz = 0 + (((tickAnim - 184) / 26) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftshin, leftshin.rotateAngleX + (float) Math.toRadians(xx), leftshin.rotateAngleY + (float) Math.toRadians(yy), leftshin.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 0) / 20) * (-2.5-(0)));
            yy = 0 + (((tickAnim - 0) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 20) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 62) {
            xx = -2.5 + (((tickAnim - 20) / 42) * (-2.5-(-2.5)));
            yy = 0 + (((tickAnim - 20) / 42) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 42) * (0-(0)));
        }
        else if (tickAnim >= 62 && tickAnim < 184) {
            xx = -2.5 + (((tickAnim - 62) / 122) * (-2.5-(-2.5)));
            yy = 0 + (((tickAnim - 62) / 122) * (0-(0)));
            zz = 0 + (((tickAnim - 62) / 122) * (0-(0)));
        }
        else if (tickAnim >= 184 && tickAnim < 210) {
            xx = -2.5 + (((tickAnim - 184) / 26) * (0-(-2.5)));
            yy = 0 + (((tickAnim - 184) / 26) * (0-(0)));
            zz = 0 + (((tickAnim - 184) / 26) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftankle, leftankle.rotateAngleX + (float) Math.toRadians(xx), leftankle.rotateAngleY + (float) Math.toRadians(yy), leftankle.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 55) {
            xx = 0 + (((tickAnim - 0) / 55) * (6-(0)));
            yy = 0 + (((tickAnim - 0) / 55) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 55) * (0-(0)));
        }
        else if (tickAnim >= 55 && tickAnim < 95) {
            xx = 6 + (((tickAnim - 55) / 40) * (5.25-(6)));
            yy = 0 + (((tickAnim - 55) / 40) * (0-(0)));
            zz = 0 + (((tickAnim - 55) / 40) * (0-(0)));
        }
        else if (tickAnim >= 95 && tickAnim < 136) {
            xx = 5.25 + (((tickAnim - 95) / 41) * (0-(5.25)));
            yy = 0 + (((tickAnim - 95) / 41) * (0-(0)));
            zz = 0 + (((tickAnim - 95) / 41) * (0-(0)));
        }
        else if (tickAnim >= 136 && tickAnim < 184) {
            xx = 0 + (((tickAnim - 136) / 48) * (-0.75-(0)));
            yy = 0 + (((tickAnim - 136) / 48) * (0-(0)));
            zz = 0 + (((tickAnim - 136) / 48) * (0-(0)));
        }
        else if (tickAnim >= 184 && tickAnim < 210) {
            xx = -0.75 + (((tickAnim - 184) / 26) * (0-(-0.75)));
            yy = 0 + (((tickAnim - 184) / 26) * (0-(0)));
            zz = 0 + (((tickAnim - 184) / 26) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tail1, tail1.rotateAngleX + (float) Math.toRadians(xx), tail1.rotateAngleY + (float) Math.toRadians(yy), tail1.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 55) {
            xx = 0 + (((tickAnim - 0) / 55) * (-6.5-(0)));
            yy = 0 + (((tickAnim - 0) / 55) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 55) * (0-(0)));
        }
        else if (tickAnim >= 55 && tickAnim < 95) {
            xx = -6.5 + (((tickAnim - 55) / 40) * (-6.25-(-6.5)));
            yy = 0 + (((tickAnim - 55) / 40) * (0-(0)));
            zz = 0 + (((tickAnim - 55) / 40) * (0-(0)));
        }
        else if (tickAnim >= 95 && tickAnim < 136) {
            xx = -6.25 + (((tickAnim - 95) / 41) * (-8.25-(-6.25)));
            yy = 0 + (((tickAnim - 95) / 41) * (0-(0)));
            zz = 0 + (((tickAnim - 95) / 41) * (0-(0)));
        }
        else if (tickAnim >= 136 && tickAnim < 184) {
            xx = -8.25 + (((tickAnim - 136) / 48) * (-8.25-(-8.25)));
            yy = 0 + (((tickAnim - 136) / 48) * (0-(0)));
            zz = 0 + (((tickAnim - 136) / 48) * (0-(0)));
        }
        else if (tickAnim >= 184 && tickAnim < 210) {
            xx = -8.25 + (((tickAnim - 184) / 26) * (0-(-8.25)));
            yy = 0 + (((tickAnim - 184) / 26) * (0-(0)));
            zz = 0 + (((tickAnim - 184) / 26) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tail2, tail2.rotateAngleX + (float) Math.toRadians(xx), tail2.rotateAngleY + (float) Math.toRadians(yy), tail2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 55) {
            xx = 0 + (((tickAnim - 0) / 55) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 55) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 55) * (0-(0)));
        }
        else if (tickAnim >= 55 && tickAnim < 95) {
            xx = 0 + (((tickAnim - 55) / 40) * (5.25-(0)));
            yy = 0 + (((tickAnim - 55) / 40) * (0-(0)));
            zz = 0 + (((tickAnim - 55) / 40) * (0-(0)));
        }
        else if (tickAnim >= 95 && tickAnim < 136) {
            xx = 5.25 + (((tickAnim - 95) / 41) * (12.25-(5.25)));
            yy = 0 + (((tickAnim - 95) / 41) * (0-(0)));
            zz = 0 + (((tickAnim - 95) / 41) * (0-(0)));
        }
        else if (tickAnim >= 136 && tickAnim < 184) {
            xx = 12.25 + (((tickAnim - 136) / 48) * (7-(12.25)));
            yy = 0 + (((tickAnim - 136) / 48) * (0-(0)));
            zz = 0 + (((tickAnim - 136) / 48) * (0-(0)));
        }
        else if (tickAnim >= 184 && tickAnim < 210) {
            xx = 7 + (((tickAnim - 184) / 26) * (0-(7)));
            yy = 0 + (((tickAnim - 184) / 26) * (0-(0)));
            zz = 0 + (((tickAnim - 184) / 26) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tail3, tail3.rotateAngleX + (float) Math.toRadians(xx), tail3.rotateAngleY + (float) Math.toRadians(yy), tail3.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 136) {
            xx = 0 + (((tickAnim - 0) / 136) * (6.5-(0)));
            yy = 0 + (((tickAnim - 0) / 136) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 136) * (0-(0)));
        }
        else if (tickAnim >= 136 && tickAnim < 184) {
            xx = 6.5 + (((tickAnim - 136) / 48) * (4.25-(6.5)));
            yy = 0 + (((tickAnim - 136) / 48) * (0-(0)));
            zz = 0 + (((tickAnim - 136) / 48) * (0-(0)));
        }
        else if (tickAnim >= 184 && tickAnim < 210) {
            xx = 4.25 + (((tickAnim - 184) / 26) * (0-(4.25)));
            yy = 0 + (((tickAnim - 184) / 26) * (0-(0)));
            zz = 0 + (((tickAnim - 184) / 26) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tail4, tail4.rotateAngleX + (float) Math.toRadians(xx), tail4.rotateAngleY + (float) Math.toRadians(yy), tail4.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 136) {
            xx = 0 + (((tickAnim - 0) / 136) * (7.5-(0)));
            yy = 0 + (((tickAnim - 0) / 136) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 136) * (0-(0)));
        }
        else if (tickAnim >= 136 && tickAnim < 184) {
            xx = 7.5 + (((tickAnim - 136) / 48) * (4.75-(7.5)));
            yy = 0 + (((tickAnim - 136) / 48) * (0-(0)));
            zz = 0 + (((tickAnim - 136) / 48) * (0-(0)));
        }
        else if (tickAnim >= 184 && tickAnim < 210) {
            xx = 4.75 + (((tickAnim - 184) / 26) * (0-(4.75)));
            yy = 0 + (((tickAnim - 184) / 26) * (0-(0)));
            zz = 0 + (((tickAnim - 184) / 26) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tail5, tail5.rotateAngleX + (float) Math.toRadians(xx), tail5.rotateAngleY + (float) Math.toRadians(yy), tail5.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 136) {
            xx = 0 + (((tickAnim - 0) / 136) * (5.2-(0)));
            yy = 0 + (((tickAnim - 0) / 136) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 136) * (0-(0)));
        }
        else if (tickAnim >= 136 && tickAnim < 184) {
            xx = 5.2 + (((tickAnim - 136) / 48) * (-8.75-(5.2)));
            yy = 0 + (((tickAnim - 136) / 48) * (0-(0)));
            zz = 0 + (((tickAnim - 136) / 48) * (0-(0)));
        }
        else if (tickAnim >= 184 && tickAnim < 210) {
            xx = -8.75 + (((tickAnim - 184) / 26) * (0-(-8.75)));
            yy = 0 + (((tickAnim - 184) / 26) * (0-(0)));
            zz = 0 + (((tickAnim - 184) / 26) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tail6, tail6.rotateAngleX + (float) Math.toRadians(xx), tail6.rotateAngleY + (float) Math.toRadians(yy), tail6.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 136) {
            xx = 0 + (((tickAnim - 0) / 136) * (7.82-(0)));
            yy = 0 + (((tickAnim - 0) / 136) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 136) * (0-(0)));
        }
        else if (tickAnim >= 136 && tickAnim < 184) {
            xx = 7.82 + (((tickAnim - 136) / 48) * (-4.25-(7.82)));
            yy = 0 + (((tickAnim - 136) / 48) * (0-(0)));
            zz = 0 + (((tickAnim - 136) / 48) * (0-(0)));
        }
        else if (tickAnim >= 184 && tickAnim < 210) {
            xx = -4.25 + (((tickAnim - 184) / 26) * (0-(-4.25)));
            yy = 0 + (((tickAnim - 184) / 26) * (0-(0)));
            zz = 0 + (((tickAnim - 184) / 26) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tail7, tail7.rotateAngleX + (float) Math.toRadians(xx), tail7.rotateAngleY + (float) Math.toRadians(yy), tail7.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 62 && tickAnim < 184) {
            xx = 0 + (((tickAnim - 62) / 122) * (0-(0)));
            yy = 0 + (((tickAnim - 62) / 122) * (0-(0)));
            zz = 0 + (((tickAnim - 62) / 122) * (0-(0)));
        }
        else if (tickAnim >= 184 && tickAnim < 190) {
            xx = 0 + (((tickAnim - 184) / 6) * (-7.47-(0)));
            yy = 0 + (((tickAnim - 184) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 184) / 6) * (0-(0)));
        }
        else if (tickAnim >= 190 && tickAnim < 198) {
            xx = -7.47 + (((tickAnim - 190) / 8) * (10.25-(-7.47)));
            yy = 0 + (((tickAnim - 190) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 190) / 8) * (0-(0)));
        }
        else if (tickAnim >= 198 && tickAnim < 204) {
            xx = 10.25 + (((tickAnim - 198) / 6) * (-50.25-(10.25)));
            yy = 0 + (((tickAnim - 198) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 198) / 6) * (0-(0)));
        }
        else if (tickAnim >= 204 && tickAnim < 210) {
            xx = -50.25 + (((tickAnim - 204) / 6) * (0-(-50.25)));
            yy = 0 + (((tickAnim - 204) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 204) / 6) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(righttoes, righttoes.rotateAngleX + (float) Math.toRadians(xx), righttoes.rotateAngleY + (float) Math.toRadians(yy), righttoes.rotateAngleZ + (float) Math.toRadians(zz));

    }

    public void animWalking(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime) {
        EntityPrehistoricFloraTyrannotitan entity = (EntityPrehistoricFloraTyrannotitan) entitylivingbaseIn;
        int animCycle = 40;
        double tickAnim = (entity.ticksExisted + entity.getTickOffset()) - (int) (Math.floor((double) (entity.ticksExisted + entity.getTickOffset()) / (double) animCycle) * (double) animCycle) + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;

        if (tickAnim >= 0 && tickAnim < 8) {
            xx = 6.74273 + (((tickAnim - 0) / 8) * (-6.65077-(6.74273)));
            yy = -4.3603 + (((tickAnim - 0) / 8) * (-7.81869-(-4.3603)));
            zz = 9.45025 + (((tickAnim - 0) / 8) * (0.36625-(9.45025)));
        }
        else if (tickAnim >= 8 && tickAnim < 13) {
            xx = -6.65077 + (((tickAnim - 8) / 5) * (-17.49102-(-6.65077)));
            yy = -7.81869 + (((tickAnim - 8) / 5) * (-0.5629+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120+50))*-8-(-7.81869)));
            zz = 0.36625 + (((tickAnim - 8) / 5) * (7.2351+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120-30))*-7-(0.36625)));
        }
        else if (tickAnim >= 13 && tickAnim < 18) {
            xx = -17.49102 + (((tickAnim - 13) / 5) * (-21.21796-(-17.49102)));
            yy = -0.5629+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120+50))*-8 + (((tickAnim - 13) / 5) * (-1.3768-(-0.5629+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120+50))*-8)));
            zz = 7.2351+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120-30))*-7 + (((tickAnim - 13) / 5) * (2.6656-(7.2351+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120-30))*-7)));
        }
        else if (tickAnim >= 18 && tickAnim < 40) {
            xx = -21.21796 + (((tickAnim - 18) / 22) * (6.74273-(-21.21796)));
            yy = -1.3768 + (((tickAnim - 18) / 22) * (-4.3603-(-1.3768)));
            zz = 2.6656 + (((tickAnim - 18) / 22) * (9.45025-(2.6656)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightthigh, rightthigh.rotateAngleX + (float) Math.toRadians(xx), rightthigh.rotateAngleY + (float) Math.toRadians(yy), rightthigh.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 18 && tickAnim < 23) {
            xx = 0 + (((tickAnim - 18) / 5) * (0-(0)));
            yy = 0 + (((tickAnim - 18) / 5) * (0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1220/0.55))*0.12-(0)));
            zz = 0 + (((tickAnim - 18) / 5) * (0-(0)));
        }
        else if (tickAnim >= 23 && tickAnim < 27) {
            xx = 0 + (((tickAnim - 23) / 4) * (0-(0)));
            yy = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1220/0.55))*0.12 + (((tickAnim - 23) / 4) * (0-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1220/0.55))*0.12)));
            zz = 0 + (((tickAnim - 23) / 4) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.rightthigh.rotationPointX = this.rightthigh.rotationPointX + (float)(xx);
        this.rightthigh.rotationPointY = this.rightthigh.rotationPointY - (float)(yy);
        this.rightthigh.rotationPointZ = this.rightthigh.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 6) {
            xx = 12.44397 + (((tickAnim - 0) / 6) * (19.4751+Math.sin((Math.PI/180)*(((double)tickAnim/20)*150+30))*25-(12.44397)));
            yy = -0.25355 + (((tickAnim - 0) / 6) * (0.30741-(-0.25355)));
            zz = -1.09407 + (((tickAnim - 0) / 6) * (0.99995-(-1.09407)));
        }
        else if (tickAnim >= 6 && tickAnim < 13) {
            xx = 19.4751+Math.sin((Math.PI/180)*(((double)tickAnim/20)*150+30))*25 + (((tickAnim - 6) / 7) * (20.2702+Math.sin((Math.PI/180)*(((double)tickAnim/20)*150+60))*3-(19.4751+Math.sin((Math.PI/180)*(((double)tickAnim/20)*150+30))*25)));
            yy = 0.30741 + (((tickAnim - 6) / 7) * (5.4583-(0.30741)));
            zz = 0.99995 + (((tickAnim - 6) / 7) * (-1.5171-(0.99995)));
        }
        else if (tickAnim >= 13 && tickAnim < 18) {
            xx = 20.2702+Math.sin((Math.PI/180)*(((double)tickAnim/20)*150+60))*3 + (((tickAnim - 13) / 5) * (-7.3553+Math.sin((Math.PI/180)*(((double)tickAnim/20)*150))*9-(20.2702+Math.sin((Math.PI/180)*(((double)tickAnim/20)*150+60))*3)));
            yy = 5.4583 + (((tickAnim - 13) / 5) * (1.58962-(5.4583)));
            zz = -1.5171 + (((tickAnim - 13) / 5) * (5.7863-(-1.5171)));
        }
        else if (tickAnim >= 18 && tickAnim < 40) {
            xx = -7.3553+Math.sin((Math.PI/180)*(((double)tickAnim/20)*150))*9 + (((tickAnim - 18) / 22) * (12.44397-(-7.3553+Math.sin((Math.PI/180)*(((double)tickAnim/20)*150))*9)));
            yy = 1.58962 + (((tickAnim - 18) / 22) * (-0.25355-(1.58962)));
            zz = 5.7863 + (((tickAnim - 18) / 22) * (-1.09407-(5.7863)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightshin, rightshin.rotateAngleX + (float) Math.toRadians(xx), rightshin.rotateAngleY + (float) Math.toRadians(yy), rightshin.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 18) {
            xx = 0 + (((tickAnim - 0) / 18) * (0-(0)));
            yy = -0.8 + (((tickAnim - 0) / 18) * (-1.45-(-0.8)));
            zz = 0 + (((tickAnim - 0) / 18) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 40) {
            xx = 0 + (((tickAnim - 18) / 22) * (0-(0)));
            yy = -1.45 + (((tickAnim - 18) / 22) * (-0.8-(-1.45)));
            zz = 0 + (((tickAnim - 18) / 22) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.rightshin.rotationPointX = this.rightshin.rotationPointX + (float)(xx);
        this.rightshin.rotationPointY = this.rightshin.rotationPointY - (float)(yy);
        this.rightshin.rotationPointZ = this.rightshin.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 17.75 + (((tickAnim - 0) / 3) * (19.7691+Math.sin((Math.PI/180)*(((double)tickAnim/20)*150))*-30-(17.75)));
            yy = 0 + (((tickAnim - 0) / 3) * (0.29716-(0)));
            zz = 0 + (((tickAnim - 0) / 3) * (-0.03833-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 8) {
            xx = 19.7691+Math.sin((Math.PI/180)*(((double)tickAnim/20)*150))*-30 + (((tickAnim - 3) / 5) * (38.6025+Math.sin((Math.PI/180)*(((double)tickAnim/20)*150))*-90-(19.7691+Math.sin((Math.PI/180)*(((double)tickAnim/20)*150))*-30)));
            yy = 0.29716 + (((tickAnim - 3) / 5) * (1.56993-(0.29716)));
            zz = -0.03833 + (((tickAnim - 3) / 5) * (3.34425-(-0.03833)));
        }
        else if (tickAnim >= 8 && tickAnim < 13) {
            xx = 38.6025+Math.sin((Math.PI/180)*(((double)tickAnim/20)*150))*-90 + (((tickAnim - 8) / 5) * (-8.1562+Math.sin((Math.PI/180)*(((double)tickAnim/20)*150))*-50-(38.6025+Math.sin((Math.PI/180)*(((double)tickAnim/20)*150))*-90)));
            yy = 1.56993 + (((tickAnim - 8) / 5) * (-0.05099-(1.56993)));
            zz = 3.34425 + (((tickAnim - 8) / 5) * (2.68452-(3.34425)));
        }
        else if (tickAnim >= 13 && tickAnim < 18) {
            xx = -8.1562+Math.sin((Math.PI/180)*(((double)tickAnim/20)*150))*-50 + (((tickAnim - 13) / 5) * (13.24656-(-8.1562+Math.sin((Math.PI/180)*(((double)tickAnim/20)*150))*-50)));
            yy = -0.05099 + (((tickAnim - 13) / 5) * (2.27825-(-0.05099)));
            zz = 2.68452 + (((tickAnim - 13) / 5) * (-0.2939-(2.68452)));
        }
        else if (tickAnim >= 18 && tickAnim < 40) {
            xx = 13.24656 + (((tickAnim - 18) / 22) * (17.75-(13.24656)));
            yy = 2.27825 + (((tickAnim - 18) / 22) * (0-(2.27825)));
            zz = -0.2939 + (((tickAnim - 18) / 22) * (0-(-0.2939)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightankle, rightankle.rotateAngleX + (float) Math.toRadians(xx), rightankle.rotateAngleY + (float) Math.toRadians(yy), rightankle.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 0) / 8) * (0-(0)));
            yy = -0.325 + (((tickAnim - 0) / 8) * (1.05-(-0.325)));
            zz = 0 + (((tickAnim - 0) / 8) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 18) {
            xx = 0 + (((tickAnim - 8) / 10) * (0-(0)));
            yy = 1.05 + (((tickAnim - 8) / 10) * (-1.4-(1.05)));
            zz = 0 + (((tickAnim - 8) / 10) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 40) {
            xx = 0 + (((tickAnim - 18) / 22) * (0-(0)));
            yy = -1.4 + (((tickAnim - 18) / 22) * (-0.325-(-1.4)));
            zz = 0 + (((tickAnim - 18) / 22) * (0-(0)));
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
            xx = 36.82442 + (((tickAnim - 0) / 3) * (44.10064-(36.82442)));
            yy = -7.54906 + (((tickAnim - 0) / 3) * (-6.78643-(-7.54906)));
            zz = -4.91443 + (((tickAnim - 0) / 3) * (-5.49961-(-4.91443)));
        }
        else if (tickAnim >= 3 && tickAnim < 8) {
            xx = 44.10064 + (((tickAnim - 3) / 5) * (71-(44.10064)));
            yy = -6.78643 + (((tickAnim - 3) / 5) * (0-(-6.78643)));
            zz = -5.49961 + (((tickAnim - 3) / 5) * (0-(-5.49961)));
        }
        else if (tickAnim >= 8 && tickAnim < 13) {
            xx = 71 + (((tickAnim - 8) / 5) * (86.25-(71)));
            yy = 0 + (((tickAnim - 8) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 5) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 18) {
            xx = 86.25 + (((tickAnim - 13) / 5) * (10.19212-(86.25)));
            yy = 0 + (((tickAnim - 13) / 5) * (-1.70221-(0)));
            zz = 0 + (((tickAnim - 13) / 5) * (-9.4008-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 28) {
            xx = 10.19212 + (((tickAnim - 18) / 10) * (-3.33967-(10.19212)));
            yy = -1.70221 + (((tickAnim - 18) / 10) * (-4.27483-(-1.70221)));
            zz = -9.4008 + (((tickAnim - 18) / 10) * (-7.4268-(-9.4008)));
        }
        else if (tickAnim >= 28 && tickAnim < 34) {
            xx = -3.33967 + (((tickAnim - 28) / 6) * (-2.50762-(-3.33967)));
            yy = -4.27483 + (((tickAnim - 28) / 6) * (-5.91194-(-4.27483)));
            zz = -7.4268 + (((tickAnim - 28) / 6) * (-6.17061-(-7.4268)));
        }
        else if (tickAnim >= 34 && tickAnim < 40) {
            xx = -2.50762 + (((tickAnim - 34) / 6) * (36.82442-(-2.50762)));
            yy = -5.91194 + (((tickAnim - 34) / 6) * (-7.54906-(-5.91194)));
            zz = -6.17061 + (((tickAnim - 34) / 6) * (-4.91443-(-6.17061)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightfoot, rightfoot.rotateAngleX + (float) Math.toRadians(xx), rightfoot.rotateAngleY + (float) Math.toRadians(yy), rightfoot.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 3) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 3) / 5) * (0-(0)));
            yy = 0 + (((tickAnim - 3) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 3) / 5) * (-0.875-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 8) / 5) * (0-(0)));
            yy = 0 + (((tickAnim - 8) / 5) * (0-(0)));
            zz = -0.875 + (((tickAnim - 8) / 5) * (-0.875-(-0.875)));
        }
        else if (tickAnim >= 13 && tickAnim < 18) {
            xx = 0 + (((tickAnim - 13) / 5) * (0-(0)));
            yy = 0 + (((tickAnim - 13) / 5) * (0-(0)));
            zz = -0.875 + (((tickAnim - 13) / 5) * (0-(-0.875)));
        }
        else if (tickAnim >= 18 && tickAnim < 22) {
            xx = 0 + (((tickAnim - 18) / 4) * (0-(0)));
            yy = 0 + (((tickAnim - 18) / 4) * (0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1220/0.4))*0.1-(0)));
            zz = 0 + (((tickAnim - 18) / 4) * (0-(0)));
        }
        else if (tickAnim >= 22 && tickAnim < 24) {
            xx = 0 + (((tickAnim - 22) / 2) * (0-(0)));
            yy = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1220/0.4))*0.1 + (((tickAnim - 22) / 2) * (0-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1220/0.4))*0.1)));
            zz = 0 + (((tickAnim - 22) / 2) * (0-(0)));
        }
        else if (tickAnim >= 24 && tickAnim < 28) {
            xx = 0 + (((tickAnim - 24) / 4) * (0-(0)));
            yy = 0 + (((tickAnim - 24) / 4) * (2.225-(0)));
            zz = 0 + (((tickAnim - 24) / 4) * (0-(0)));
        }
        else if (tickAnim >= 28 && tickAnim < 34) {
            xx = 0 + (((tickAnim - 28) / 6) * (0-(0)));
            yy = 2.225 + (((tickAnim - 28) / 6) * (1.235-(2.225)));
            zz = 0 + (((tickAnim - 28) / 6) * (0-(0)));
        }
        else if (tickAnim >= 34 && tickAnim < 40) {
            xx = 0 + (((tickAnim - 34) / 6) * (0-(0)));
            yy = 1.235 + (((tickAnim - 34) / 6) * (0-(1.235)));
            zz = 0 + (((tickAnim - 34) / 6) * (0-(0)));
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
            xx = -74 + (((tickAnim - 0) / 3) * (-44.08-(-74)));
            yy = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 3) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 8) {
            xx = -44.08 + (((tickAnim - 3) / 5) * (30-(-44.08)));
            yy = 0 + (((tickAnim - 3) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 3) / 5) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 13) {
            xx = 30 + (((tickAnim - 8) / 5) * (20.2-(30)));
            yy = 0 + (((tickAnim - 8) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 5) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 18) {
            xx = 20.2 + (((tickAnim - 13) / 5) * (0-(20.2)));
            yy = 0 + (((tickAnim - 13) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 13) / 5) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 28) {
            xx = 0 + (((tickAnim - 18) / 10) * (0-(0)));
            yy = 0 + (((tickAnim - 18) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 18) / 10) * (0-(0)));
        }
        else if (tickAnim >= 28 && tickAnim < 34) {
            xx = 0 + (((tickAnim - 28) / 6) * (-17-(0)));
            yy = 0 + (((tickAnim - 28) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 28) / 6) * (0-(0)));
        }
        else if (tickAnim >= 34 && tickAnim < 40) {
            xx = -17 + (((tickAnim - 34) / 6) * (-74-(-17)));
            yy = 0 + (((tickAnim - 34) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 34) / 6) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(righttoes, righttoes.rotateAngleX + (float) Math.toRadians(xx), righttoes.rotateAngleY + (float) Math.toRadians(yy), righttoes.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 19) {
            xx = -21.21796 + (((tickAnim - 0) / 19) * (6.74273-(-21.21796)));
            yy = -1.37685 + (((tickAnim - 0) / 19) * (4.3603-(-1.37685)));
            zz = -2.66564 + (((tickAnim - 0) / 19) * (-9.4502-(-2.66564)));
        }
        else if (tickAnim >= 19 && tickAnim < 27) {
            xx = 6.74273 + (((tickAnim - 19) / 8) * (-7.14076-(6.74273)));
            yy = 4.3603 + (((tickAnim - 19) / 8) * (10.05113-(4.3603)));
            zz = -9.4502 + (((tickAnim - 19) / 8) * (0.04455-(-9.4502)));
        }
        else if (tickAnim >= 27 && tickAnim < 35) {
            xx = -7.14076 + (((tickAnim - 27) / 8) * (-17.49102-(-7.14076)));
            yy = 10.05113 + (((tickAnim - 27) / 8) * (15.7129+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120+50))*10-(10.05113)));
            zz = 0.04455 + (((tickAnim - 27) / 8) * (1.0649+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120-30))*7-(0.04455)));
        }
        else if (tickAnim >= 35 && tickAnim < 40) {
            xx = -17.49102 + (((tickAnim - 35) / 5) * (-21.21796-(-17.49102)));
            yy = 15.7129+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120+50))*10 + (((tickAnim - 35) / 5) * (-1.37685-(15.7129+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120+50))*10)));
            zz = 1.0649+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120-30))*7 + (((tickAnim - 35) / 5) * (-2.66564-(1.0649+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120-30))*7)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftthigh, leftthigh.rotateAngleX + (float) Math.toRadians(xx), leftthigh.rotateAngleY + (float) Math.toRadians(yy), leftthigh.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 4) {
            xx = 0 + (((tickAnim - 0) / 4) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 4) * (0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1220/0.55))*0.12-(0)));
            zz = 0 + (((tickAnim - 0) / 4) * (0-(0)));
        }
        else if (tickAnim >= 4 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 4) / 4) * (0-(0)));
            yy = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1220/0.55))*0.12 + (((tickAnim - 4) / 4) * (0-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1220/0.55))*0.12)));
            zz = 0 + (((tickAnim - 4) / 4) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.leftthigh.rotationPointX = this.leftthigh.rotationPointX + (float)(xx);
        this.leftthigh.rotationPointY = this.leftthigh.rotationPointY - (float)(yy);
        this.leftthigh.rotationPointZ = this.leftthigh.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 8) {
            xx = -6.58034 + (((tickAnim - 0) / 8) * (1.70627-(-6.58034)));
            yy = 1.58962 + (((tickAnim - 0) / 8) * (0.50852-(1.58962)));
            zz = -5.78634 + (((tickAnim - 0) / 8) * (-1.64919-(-5.78634)));
        }
        else if (tickAnim >= 8 && tickAnim < 18) {
            xx = 1.70627 + (((tickAnim - 8) / 10) * (11.44397-(1.70627)));
            yy = 0.50852 + (((tickAnim - 8) / 10) * (0.2536-(0.50852)));
            zz = -1.64919 + (((tickAnim - 8) / 10) * (1.0941-(-1.64919)));
        }
        else if (tickAnim >= 18 && tickAnim < 25) {
            xx = 11.44397 + (((tickAnim - 18) / 7) * (29.0251+Math.sin((Math.PI/180)*(((double)tickAnim/20)*150+20))*-35-(11.44397)));
            yy = 0.2536 + (((tickAnim - 18) / 7) * (0.30741-(0.2536)));
            zz = 1.0941 + (((tickAnim - 18) / 7) * (0.99995-(1.0941)));
        }
        else if (tickAnim >= 25 && tickAnim < 35) {
            xx = 29.0251+Math.sin((Math.PI/180)*(((double)tickAnim/20)*150+20))*-35 + (((tickAnim - 25) / 10) * (21.3947+Math.sin((Math.PI/180)*(((double)tickAnim/20)*150))*9-(29.0251+Math.sin((Math.PI/180)*(((double)tickAnim/20)*150+20))*-35)));
            yy = 0.30741 + (((tickAnim - 25) / 10) * (1.58962-(0.30741)));
            zz = 0.99995 + (((tickAnim - 25) / 10) * (-5.7863-(0.99995)));
        }
        else if (tickAnim >= 35 && tickAnim < 40) {
            xx = 21.3947+Math.sin((Math.PI/180)*(((double)tickAnim/20)*150))*9 + (((tickAnim - 35) / 5) * (-6.58034-(21.3947+Math.sin((Math.PI/180)*(((double)tickAnim/20)*150))*9)));
            yy = 1.58962 + (((tickAnim - 35) / 5) * (1.58962-(1.58962)));
            zz = -5.7863 + (((tickAnim - 35) / 5) * (-5.78634-(-5.7863)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftshin, leftshin.rotateAngleX + (float) Math.toRadians(xx), leftshin.rotateAngleY + (float) Math.toRadians(yy), leftshin.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 19) {
            xx = 0 + (((tickAnim - 0) / 19) * (0-(0)));
            yy = -1.45 + (((tickAnim - 0) / 19) * (-0.8-(-1.45)));
            zz = 0 + (((tickAnim - 0) / 19) * (0-(0)));
        }
        else if (tickAnim >= 19 && tickAnim < 35) {
            xx = 0 + (((tickAnim - 19) / 16) * (0-(0)));
            yy = -0.8 + (((tickAnim - 19) / 16) * (-1.45-(-0.8)));
            zz = 0 + (((tickAnim - 19) / 16) * (0-(0)));
        }
        else if (tickAnim >= 35 && tickAnim < 40) {
            xx = 0 + (((tickAnim - 35) / 5) * (0-(0)));
            yy = -1.45 + (((tickAnim - 35) / 5) * (-1.45-(-1.45)));
            zz = 0 + (((tickAnim - 35) / 5) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.leftshin.rotationPointX = this.leftshin.rotationPointX + (float)(xx);
        this.leftshin.rotationPointY = this.leftshin.rotationPointY - (float)(yy);
        this.leftshin.rotationPointZ = this.leftshin.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 19) {
            xx = 16.74656 + (((tickAnim - 0) / 19) * (17.75-(16.74656)));
            yy = 2.27825 + (((tickAnim - 0) / 19) * (0-(2.27825)));
            zz = 0.29394 + (((tickAnim - 0) / 19) * (0-(0.29394)));
        }
        else if (tickAnim >= 19 && tickAnim < 25) {
            xx = 17.75 + (((tickAnim - 19) / 6) * (2.7941+Math.sin((Math.PI/180)*(((double)tickAnim/20)*150))*30-(17.75)));
            yy = 0 + (((tickAnim - 19) / 6) * (0.29716-(0)));
            zz = 0 + (((tickAnim - 19) / 6) * (-0.03833-(0)));
        }
        else if (tickAnim >= 25 && tickAnim < 29) {
            xx = 2.7941+Math.sin((Math.PI/180)*(((double)tickAnim/20)*150))*30 + (((tickAnim - 25) / 4) * (3.0209+Math.sin((Math.PI/180)*(((double)tickAnim/20)*150))*90-(2.7941+Math.sin((Math.PI/180)*(((double)tickAnim/20)*150))*30)));
            yy = 0.29716 + (((tickAnim - 25) / 4) * (-2.73565-(0.29716)));
            zz = -0.03833 + (((tickAnim - 25) / 4) * (1.59115-(-0.03833)));
        }
        else if (tickAnim >= 29 && tickAnim < 35) {
            xx = 3.0209+Math.sin((Math.PI/180)*(((double)tickAnim/20)*150))*90 + (((tickAnim - 29) / 6) * (10.8438+Math.sin((Math.PI/180)*(((double)tickAnim/20)*150))*50-(3.0209+Math.sin((Math.PI/180)*(((double)tickAnim/20)*150))*90)));
            yy = -2.73565 + (((tickAnim - 29) / 6) * (0.051-(-2.73565)));
            zz = 1.59115 + (((tickAnim - 29) / 6) * (-2.6845-(1.59115)));
        }
        else if (tickAnim >= 35 && tickAnim < 40) {
            xx = 10.8438+Math.sin((Math.PI/180)*(((double)tickAnim/20)*150))*50 + (((tickAnim - 35) / 5) * (16.74656-(10.8438+Math.sin((Math.PI/180)*(((double)tickAnim/20)*150))*50)));
            yy = 0.051 + (((tickAnim - 35) / 5) * (2.27825-(0.051)));
            zz = -2.6845 + (((tickAnim - 35) / 5) * (0.29394-(-2.6845)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftankle, leftankle.rotateAngleX + (float) Math.toRadians(xx), leftankle.rotateAngleY + (float) Math.toRadians(yy), leftankle.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 19) {
            xx = 0 + (((tickAnim - 0) / 19) * (0-(0)));
            yy = -1.4 + (((tickAnim - 0) / 19) * (-0.325-(-1.4)));
            zz = 0 + (((tickAnim - 0) / 19) * (0-(0)));
        }
        else if (tickAnim >= 19 && tickAnim < 29) {
            xx = 0 + (((tickAnim - 19) / 10) * (0-(0)));
            yy = -0.325 + (((tickAnim - 19) / 10) * (1.05-(-0.325)));
            zz = 0 + (((tickAnim - 19) / 10) * (0-(0)));
        }
        else if (tickAnim >= 29 && tickAnim < 40) {
            xx = 0 + (((tickAnim - 29) / 11) * (0-(0)));
            yy = 1.05 + (((tickAnim - 29) / 11) * (-1.4-(1.05)));
            zz = 0 + (((tickAnim - 29) / 11) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.leftankle.rotationPointX = this.leftankle.rotationPointX + (float)(xx);
        this.leftankle.rotationPointY = this.leftankle.rotationPointY - (float)(yy);
        this.leftankle.rotationPointZ = this.leftankle.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 8) {
            xx = 10.08157 + (((tickAnim - 0) / 8) * (-11.50088-(10.08157)));
            yy = -2.8995 + (((tickAnim - 0) / 8) * (-0.0574-(-2.8995)));
            zz = 6.6478 + (((tickAnim - 0) / 8) * (5.99906-(6.6478)));
        }
        else if (tickAnim >= 8 && tickAnim < 19) {
            xx = -11.50088 + (((tickAnim - 8) / 11) * (36.82442-(-11.50088)));
            yy = -0.0574 + (((tickAnim - 8) / 11) * (7.5491-(-0.0574)));
            zz = 5.99906 + (((tickAnim - 8) / 11) * (4.9144-(5.99906)));
        }
        else if (tickAnim >= 19 && tickAnim < 25) {
            xx = 36.82442 + (((tickAnim - 19) / 6) * (58.10064-(36.82442)));
            yy = 7.5491 + (((tickAnim - 19) / 6) * (6.7864-(7.5491)));
            zz = 4.9144 + (((tickAnim - 19) / 6) * (5.4996-(4.9144)));
        }
        else if (tickAnim >= 25 && tickAnim < 28) {
            xx = 58.10064 + (((tickAnim - 25) / 3) * (71-(58.10064)));
            yy = 6.7864 + (((tickAnim - 25) / 3) * (0-(6.7864)));
            zz = 5.4996 + (((tickAnim - 25) / 3) * (0-(5.4996)));
        }
        else if (tickAnim >= 28 && tickAnim < 35) {
            xx = 71 + (((tickAnim - 28) / 7) * (86.25-(71)));
            yy = 0 + (((tickAnim - 28) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 28) / 7) * (0-(0)));
        }
        else if (tickAnim >= 35 && tickAnim < 40) {
            xx = 86.25 + (((tickAnim - 35) / 5) * (10.08157-(86.25)));
            yy = 0 + (((tickAnim - 35) / 5) * (-2.8995-(0)));
            zz = 0 + (((tickAnim - 35) / 5) * (6.6478-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftfoot, leftfoot.rotateAngleX + (float) Math.toRadians(xx), leftfoot.rotateAngleY + (float) Math.toRadians(yy), leftfoot.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 3) * (0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1220/0.4))*0.1-(0)));
            zz = 0 + (((tickAnim - 0) / 3) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 6) {
            xx = 0 + (((tickAnim - 3) / 3) * (0-(0)));
            yy = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1220/0.4))*0.1 + (((tickAnim - 3) / 3) * (0-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1220/0.4))*0.1)));
            zz = 0 + (((tickAnim - 3) / 3) * (0-(0)));
        }
        else if (tickAnim >= 6 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 6) / 2) * (0-(0)));
            yy = 0 + (((tickAnim - 6) / 2) * (1.075-(0)));
            zz = 0 + (((tickAnim - 6) / 2) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 8) / 7) * (0-(0)));
            yy = 1.075 + (((tickAnim - 8) / 7) * (1.99-(1.075)));
            zz = 0 + (((tickAnim - 8) / 7) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 19) {
            xx = 0 + (((tickAnim - 15) / 4) * (0-(0)));
            yy = 1.99 + (((tickAnim - 15) / 4) * (0-(1.99)));
            zz = 0 + (((tickAnim - 15) / 4) * (0-(0)));
        }
        else if (tickAnim >= 19 && tickAnim < 24) {
            xx = 0 + (((tickAnim - 19) / 5) * (0-(0)));
            yy = 0 + (((tickAnim - 19) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 19) / 5) * (0-(0)));
        }
        else if (tickAnim >= 24 && tickAnim < 28) {
            xx = 0 + (((tickAnim - 24) / 4) * (0-(0)));
            yy = 0 + (((tickAnim - 24) / 4) * (1.55-(0)));
            zz = 0 + (((tickAnim - 24) / 4) * (-0.875-(0)));
        }
        else if (tickAnim >= 28 && tickAnim < 35) {
            xx = 0 + (((tickAnim - 28) / 7) * (0-(0)));
            yy = 1.55 + (((tickAnim - 28) / 7) * (1.55-(1.55)));
            zz = -0.875 + (((tickAnim - 28) / 7) * (-0.875-(-0.875)));
        }
        else if (tickAnim >= 35 && tickAnim < 40) {
            xx = 0 + (((tickAnim - 35) / 5) * (0-(0)));
            yy = 1.55 + (((tickAnim - 35) / 5) * (0-(1.55)));
            zz = -0.875 + (((tickAnim - 35) / 5) * (0-(-0.875)));
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
            xx = 0 + (((tickAnim - 0) / 8) * (5.08-(0)));
            yy = 0 + (((tickAnim - 0) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 8) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 19) {
            xx = 5.08 + (((tickAnim - 8) / 11) * (-74-(5.08)));
            yy = 0 + (((tickAnim - 8) / 11) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 11) * (0-(0)));
        }
        else if (tickAnim >= 19 && tickAnim < 25) {
            xx = -74 + (((tickAnim - 19) / 6) * (-14.08-(-74)));
            yy = 0 + (((tickAnim - 19) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 19) / 6) * (0-(0)));
        }
        else if (tickAnim >= 25 && tickAnim < 28) {
            xx = -14.08 + (((tickAnim - 25) / 3) * (30-(-14.08)));
            yy = 0 + (((tickAnim - 25) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 25) / 3) * (0-(0)));
        }
        else if (tickAnim >= 28 && tickAnim < 33) {
            xx = 30 + (((tickAnim - 28) / 5) * (20.2-(30)));
            yy = 0 + (((tickAnim - 28) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 28) / 5) * (0-(0)));
        }
        else if (tickAnim >= 33 && tickAnim < 38) {
            xx = 20.2 + (((tickAnim - 33) / 5) * (0-(20.2)));
            yy = 0 + (((tickAnim - 33) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 33) / 5) * (0-(0)));
        }
        else if (tickAnim >= 38 && tickAnim < 40) {
            xx = 0 + (((tickAnim - 38) / 2) * (0-(0)));
            yy = 0 + (((tickAnim - 38) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 38) / 2) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(lefttoes, lefttoes.rotateAngleX + (float) Math.toRadians(xx), lefttoes.rotateAngleY + (float) Math.toRadians(yy), lefttoes.rotateAngleZ + (float) Math.toRadians(zz));



        this.setRotateAngle(hips, hips.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360+30))*-1.3), hips.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180-30))*-3), hips.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180))*-2));

        if (tickAnim >= 0 && tickAnim < 12) {
            xx = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180))*-0.6 + (((tickAnim - 0) / 12) * (0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180))*-0.6-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180))*-0.6)));
            yy = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180))*1 + (((tickAnim - 0) / 12) * (-0.725+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180))*1-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180))*1)));
            zz = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180+80))*0.5 + (((tickAnim - 0) / 12) * (0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180+80))*0.5-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180+80))*0.5)));
        }
        else if (tickAnim >= 12 && tickAnim < 19) {
            xx = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180))*-0.6 + (((tickAnim - 12) / 7) * (0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180))*-0.6-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180))*-0.6)));
            yy = -0.725+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180))*1 + (((tickAnim - 12) / 7) * (0.225+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180))*-0.5-(-0.725+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180))*1)));
            zz = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180+80))*0.5 + (((tickAnim - 12) / 7) * (0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180+130))*0.5-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180+80))*0.5)));
        }
        else if (tickAnim >= 19 && tickAnim < 40) {
            xx = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180))*-0.6 + (((tickAnim - 19) / 21) * (0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180))*-0.6-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180))*-0.6)));
            yy = 0.225+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180))*-0.5 + (((tickAnim - 19) / 21) * (0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180))*1-(0.225+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180))*-0.5)));
            zz = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180+130))*0.5 + (((tickAnim - 19) / 21) * (0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180+80))*0.5-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180+130))*0.5)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.hips.rotationPointX = this.hips.rotationPointX + (float)(xx);
        this.hips.rotationPointY = this.hips.rotationPointY - (float)(yy);
        this.hips.rotationPointZ = this.hips.rotationPointZ + (float)(zz);



        this.setRotateAngle(bodymiddle, bodymiddle.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360+70))*1), bodymiddle.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180-30))*2), bodymiddle.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180+30))*-2));

        if (tickAnim >= 0 && tickAnim < 4) {
            xx = 0 + (((tickAnim - 0) / 4) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 4) * (0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1220/0.55))*0.05-(0)));
            zz = 0 + (((tickAnim - 0) / 4) * (0-(0)));
        }
        else if (tickAnim >= 4 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 4) / 4) * (0-(0)));
            yy = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1220/0.55))*0.05 + (((tickAnim - 4) / 4) * (0-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1220/0.55))*0.05)));
            zz = 0 + (((tickAnim - 4) / 4) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 18) {
            xx = 0 + (((tickAnim - 8) / 10) * (0-(0)));
            yy = 0 + (((tickAnim - 8) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 10) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 23) {
            xx = 0 + (((tickAnim - 18) / 5) * (0-(0)));
            yy = 0 + (((tickAnim - 18) / 5) * (0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1220/0.55))*0.05-(0)));
            zz = 0 + (((tickAnim - 18) / 5) * (0-(0)));
        }
        else if (tickAnim >= 23 && tickAnim < 27) {
            xx = 0 + (((tickAnim - 23) / 4) * (0-(0)));
            yy = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1220/0.55))*0.05 + (((tickAnim - 23) / 4) * (0-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1220/0.55))*0.05)));
            zz = 0 + (((tickAnim - 23) / 4) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.bodymiddle.rotationPointX = this.bodymiddle.rotationPointX + (float)(xx);
        this.bodymiddle.rotationPointY = this.bodymiddle.rotationPointY - (float)(yy);
        this.bodymiddle.rotationPointZ = this.bodymiddle.rotationPointZ + (float)(zz);



        this.setRotateAngle(bodyfront, bodyfront.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360+20))*1), bodyfront.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180+50))*-2), bodyfront.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180+130))*-2));


        this.setRotateAngle(neckbase, neckbase.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360+220))*1), neckbase.rotateAngleY + (float) Math.toRadians(0), neckbase.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180+130))*-2));


        this.setRotateAngle(neckmiddlebase, neckmiddlebase.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360+190))*-2), neckmiddlebase.rotateAngleY + (float) Math.toRadians(0), neckmiddlebase.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180+190))*-2));


        this.setRotateAngle(neckmiddleend, neckmiddleend.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360-250))*2), neckmiddleend.rotateAngleY + (float) Math.toRadians(0), neckmiddleend.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180+230))*-0.2));


        this.setRotateAngle(head, head.rotateAngleX + (float) Math.toRadians(-4.25+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360+300))*2), head.rotateAngleY + (float) Math.toRadians(0), head.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(rightupperarm, rightupperarm.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360+40))*-2), rightupperarm.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180+50))*-2), rightupperarm.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180+130))*-2));


        this.setRotateAngle(rightlowerarm, rightlowerarm.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360+60))*2), rightlowerarm.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180+50))*-2), rightlowerarm.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180+130))*-2));


        this.setRotateAngle(leftupperarm, leftupperarm.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360+40))*-2), leftupperarm.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180+50))*2), leftupperarm.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180+130))*2));


        this.setRotateAngle(leftlowerarm, leftlowerarm.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360+60))*2), leftlowerarm.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180+50))*2), leftlowerarm.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180+130))*2));


        this.setRotateAngle(tail1, tail1.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360-30))*-1), tail1.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180+30))*-2), tail1.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180+30))*-2));

        if (tickAnim >= 0 && tickAnim < 4) {
            xx = 0 + (((tickAnim - 0) / 4) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 4) * (0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1220/0.55))*0.05-(0)));
            zz = 0 + (((tickAnim - 0) / 4) * (0-(0)));
        }
        else if (tickAnim >= 4 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 4) / 4) * (0-(0)));
            yy = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1220/0.55))*0.05 + (((tickAnim - 4) / 4) * (0-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1220/0.55))*0.05)));
            zz = 0 + (((tickAnim - 4) / 4) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 18) {
            xx = 0 + (((tickAnim - 8) / 10) * (0-(0)));
            yy = 0 + (((tickAnim - 8) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 10) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 23) {
            xx = 0 + (((tickAnim - 18) / 5) * (0-(0)));
            yy = 0 + (((tickAnim - 18) / 5) * (0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1220/0.55))*0.05-(0)));
            zz = 0 + (((tickAnim - 18) / 5) * (0-(0)));
        }
        else if (tickAnim >= 23 && tickAnim < 27) {
            xx = 0 + (((tickAnim - 23) / 4) * (0-(0)));
            yy = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1220/0.55))*0.05 + (((tickAnim - 23) / 4) * (0-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1220/0.55))*0.05)));
            zz = 0 + (((tickAnim - 23) / 4) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.tail1.rotationPointX = this.tail1.rotationPointX + (float)(xx);
        this.tail1.rotationPointY = this.tail1.rotationPointY - (float)(yy);
        this.tail1.rotationPointZ = this.tail1.rotationPointZ + (float)(zz);



        this.setRotateAngle(tail2, tail2.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360-60))*-1), tail2.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180-30))*-2), tail2.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180-30))*-2));


        this.setRotateAngle(tail3, tail3.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360-90))*-1), tail3.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180-90))*-3), tail3.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180-90))*-2));


        this.setRotateAngle(tail4, tail4.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360-120))*1), tail4.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180-120))*-4), tail4.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180-120))*-2));


        this.setRotateAngle(tail5, tail5.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360-140))*1), tail5.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180-150))*-5), tail5.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180-150))*-2));


        this.setRotateAngle(tail6, tail6.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360-170))*-1), tail6.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180-170))*-5), tail6.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180-170))*-2));


        this.setRotateAngle(tail7, tail7.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360-170))*-1), tail7.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180-170))*-5), tail7.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180-170))*-2));



   }
    public void animRunning(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime) {
        EntityPrehistoricFloraTyrannotitan entity = (EntityPrehistoricFloraTyrannotitan) entitylivingbaseIn;
        int animCycle = 25;
        double tickAnim = (entity.ticksExisted + entity.getTickOffset()) - (int) (Math.floor((double) (entity.ticksExisted + entity.getTickOffset()) / (double) animCycle) * (double) animCycle) + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;
        this.setRotateAngle(hips, hips.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*576+30))*-2), hips.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*288-30))*-3), hips.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*288+20))*-2));

        if (tickAnim >= 0 && tickAnim < 5) {
            xx = 0.35+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180))*-0.6 + (((tickAnim - 0) / 5) * (-0.125+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180+120))*0.25-(0.35+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180))*-0.6)));
            yy = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180))*1 + (((tickAnim - 0) / 5) * (-0.05+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180))*1-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180))*1)));
            zz = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180+80))*0.5 + (((tickAnim - 0) / 5) * (0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180+80))*0.5-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180+80))*0.5)));
        }
        else if (tickAnim >= 5 && tickAnim < 14) {
            xx = -0.125+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180+120))*0.25 + (((tickAnim - 5) / 9) * (0.35+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180))*-0.6-(-0.125+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180+120))*0.25)));
            yy = -0.05+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180))*1 + (((tickAnim - 5) / 9) * (-0.35+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180))*-0.5-(-0.05+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180))*1)));
            zz = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180+80))*0.5 + (((tickAnim - 5) / 9) * (0.4+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180+130))*0.5-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180+80))*0.5)));
        }
        else if (tickAnim >= 14 && tickAnim < 19) {
            xx = 0.35+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180))*-0.6 + (((tickAnim - 14) / 5) * (0.35+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180))*-0.6-(0.35+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180))*-0.6)));
            yy = -0.35+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180))*-0.5 + (((tickAnim - 14) / 5) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*180))*1-(-0.35+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180))*-0.5)));
            zz = 0.4+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180+130))*0.5 + (((tickAnim - 14) / 5) * (0.125-(0.4+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180+130))*0.5)));
        }
        else if (tickAnim >= 19 && tickAnim < 25) {
            xx = 0.35+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180))*-0.6 + (((tickAnim - 19) / 6) * (0.6+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180))*0.35-(0.35+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180))*-0.6)));
            yy = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180))*1 + (((tickAnim - 19) / 6) * (-0.7+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180))*-1-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180))*1)));
            zz = 0.125 + (((tickAnim - 19) / 6) * (0.9+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180+80))*0.5-(0.125)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.hips.rotationPointX = this.hips.rotationPointX + (float)(xx);
        this.hips.rotationPointY = this.hips.rotationPointY - (float)(yy);
        this.hips.rotationPointZ = this.hips.rotationPointZ + (float)(zz);



        this.setRotateAngle(bodymiddle, bodymiddle.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*576+70))*2), bodymiddle.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*288-30))*2), bodymiddle.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*288+30))*-1));

        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 3) * (0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1220/0.55))*0.15-(0)));
            zz = 0 + (((tickAnim - 0) / 3) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 3) / 5) * (0-(0)));
            yy = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1220/0.55))*0.15 + (((tickAnim - 3) / 5) * (0-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1220/0.55))*0.15)));
            zz = 0 + (((tickAnim - 3) / 5) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 8) / 5) * (0-(0)));
            yy = 0 + (((tickAnim - 8) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 5) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 17) {
            xx = 0 + (((tickAnim - 13) / 4) * (0-(0)));
            yy = 0 + (((tickAnim - 13) / 4) * (0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1220/0.55))*0.15-(0)));
            zz = 0 + (((tickAnim - 13) / 4) * (0-(0)));
        }
        else if (tickAnim >= 17 && tickAnim < 22) {
            xx = 0 + (((tickAnim - 17) / 5) * (0-(0)));
            yy = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1220/0.55))*0.15 + (((tickAnim - 17) / 5) * (0-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1220/0.55))*0.15)));
            zz = 0 + (((tickAnim - 17) / 5) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.bodymiddle.rotationPointX = this.bodymiddle.rotationPointX + (float)(xx);
        this.bodymiddle.rotationPointY = this.bodymiddle.rotationPointY - (float)(yy);
        this.bodymiddle.rotationPointZ = this.bodymiddle.rotationPointZ + (float)(zz);



        this.setRotateAngle(bodyfront, bodyfront.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*576+20))*2), bodyfront.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*288+50))*-2), bodyfront.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*288+130))*-2));


        this.setRotateAngle(neckbase, neckbase.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*576+220))*2), neckbase.rotateAngleY + (float) Math.toRadians(0), neckbase.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*288+180))*-2));


        this.setRotateAngle(neckmiddlebase, neckmiddlebase.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*576+190))*-3), neckmiddlebase.rotateAngleY + (float) Math.toRadians(0), neckmiddlebase.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*288+190))*-2));


        this.setRotateAngle(neckmiddleend, neckmiddleend.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*576-250))*3), neckmiddleend.rotateAngleY + (float) Math.toRadians(0), neckmiddleend.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*288+230))*-0.5));


        this.setRotateAngle(head, head.rotateAngleX + (float) Math.toRadians(-4.25+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*576+300))*3), head.rotateAngleY + (float) Math.toRadians(0), head.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(rightupperarm, rightupperarm.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*576+40))*4), rightupperarm.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*288+50))*-2), rightupperarm.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*288+130))*-2));


        this.setRotateAngle(rightlowerarm, rightlowerarm.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*578+90))*-5), rightlowerarm.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*288+50))*-2), rightlowerarm.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*288+130))*-2));


        this.setRotateAngle(leftupperarm, leftupperarm.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*576+40))*4), leftupperarm.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*288+50))*-2), leftupperarm.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*288+130))*-2));


        this.setRotateAngle(leftlowerarm, leftlowerarm.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*578+90))*-5), leftlowerarm.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*288+50))*-2), leftlowerarm.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*288+130))*-2));


        this.setRotateAngle(tail1, tail1.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*576-30))*-1), tail1.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*288+30))*-2), tail1.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*288+30))*-3));

        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 3) * (0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1220/0.55))*0.2-(0)));
            zz = 0 + (((tickAnim - 0) / 3) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 3) / 5) * (0-(0)));
            yy = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1220/0.55))*0.2 + (((tickAnim - 3) / 5) * (0-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1220/0.55))*0.2)));
            zz = 0 + (((tickAnim - 3) / 5) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 8) / 5) * (0-(0)));
            yy = 0 + (((tickAnim - 8) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 5) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 17) {
            xx = 0 + (((tickAnim - 13) / 4) * (0-(0)));
            yy = 0 + (((tickAnim - 13) / 4) * (0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1220/0.55))*0.2-(0)));
            zz = 0 + (((tickAnim - 13) / 4) * (0-(0)));
        }
        else if (tickAnim >= 17 && tickAnim < 22) {
            xx = 0 + (((tickAnim - 17) / 5) * (0-(0)));
            yy = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1220/0.55))*0.2 + (((tickAnim - 17) / 5) * (0-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1220/0.55))*0.2)));
            zz = 0 + (((tickAnim - 17) / 5) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.tail1.rotationPointX = this.tail1.rotationPointX + (float)(xx);
        this.tail1.rotationPointY = this.tail1.rotationPointY - (float)(yy);
        this.tail1.rotationPointZ = this.tail1.rotationPointZ + (float)(zz);



        this.setRotateAngle(tail2, tail2.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*578-60))*-1), tail2.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*288-30))*-4), tail2.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*288-30))*-4));


        this.setRotateAngle(tail3, tail3.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*576-90))*-1), tail3.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*288-90))*-4), tail3.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*288-90))*-4));


        this.setRotateAngle(tail4, tail4.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*578-120))*1), tail4.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*288-120))*-7), tail4.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*288-120))*-4));


        this.setRotateAngle(tail5, tail5.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*578-140))*1), tail5.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*288-150))*-9), tail5.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*288-150))*-4));


        this.setRotateAngle(tail6, tail6.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*576-170))*-1), tail6.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*288-170))*-9), tail6.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*288-170))*-5));


        this.setRotateAngle(tail7, tail7.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*576-170))*-1), tail7.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*288-170))*-9), tail7.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*288-170))*-5));



        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 13.74273 + (((tickAnim - 0) / 3) * (-4.46576-(13.74273)));
            yy = -4.3603 + (((tickAnim - 0) / 3) * (-9.4011-(-4.3603)));
            zz = 9.4502 + (((tickAnim - 0) / 3) * (2.8055-(9.4502)));
        }
        else if (tickAnim >= 3 && tickAnim < 9) {
            xx = -4.46576 + (((tickAnim - 3) / 6) * (-16.64363-(-4.46576)));
            yy = -9.4011 + (((tickAnim - 3) / 6) * (4.9332+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120+60))*-10-(-9.4011)));
            zz = 2.8055 + (((tickAnim - 3) / 6) * (4.2155+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120+50))*-7-(2.8055)));
        }
        else if (tickAnim >= 9 && tickAnim < 13) {
            xx = -16.64363 + (((tickAnim - 9) / 4) * (-23.46796-(-16.64363)));
            yy = 4.9332+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120+60))*-10 + (((tickAnim - 9) / 4) * (-0.7982-(4.9332+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120+60))*-10)));
            zz = 4.2155+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120+50))*-7 + (((tickAnim - 9) / 4) * (0.8656-(4.2155+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120+50))*-7)));
        }
        else if (tickAnim >= 13 && tickAnim < 25) {
            xx = -23.46796 + (((tickAnim - 13) / 12) * (13.74273-(-23.46796)));
            yy = -0.7982 + (((tickAnim - 13) / 12) * (-4.3603-(-0.7982)));
            zz = 0.8656 + (((tickAnim - 13) / 12) * (9.4502-(0.8656)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightthigh, rightthigh.rotateAngleX + (float) Math.toRadians(xx), rightthigh.rotateAngleY + (float) Math.toRadians(yy), rightthigh.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 13 && tickAnim < 18) {
            xx = 0 + (((tickAnim - 13) / 5) * (0-(0)));
            yy = 0 + (((tickAnim - 13) / 5) * (0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1220/0.55))*0.3-(0)));
            zz = 0 + (((tickAnim - 13) / 5) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 24) {
            xx = 0 + (((tickAnim - 18) / 6) * (0-(0)));
            yy = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1220/0.55))*0.3 + (((tickAnim - 18) / 6) * (0-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1220/0.55))*0.3)));
            zz = 0 + (((tickAnim - 18) / 6) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.rightthigh.rotationPointX = this.rightthigh.rotationPointX + (float)(xx);
        this.rightthigh.rotationPointY = this.rightthigh.rotationPointY - (float)(yy);
        this.rightthigh.rotationPointZ = this.rightthigh.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 23.66072 + (((tickAnim - 0) / 3) * (13.4926+Math.sin((Math.PI/180)*(((double)tickAnim/20)*150+50))*35-(23.66072)));
            yy = -0.2671 + (((tickAnim - 0) / 3) * (0.15938-(-0.2671)));
            zz = -1.0706 + (((tickAnim - 0) / 3) * (-0.89893-(-1.0706)));
        }
        else if (tickAnim >= 3 && tickAnim < 9) {
            xx = 13.4926+Math.sin((Math.PI/180)*(((double)tickAnim/20)*150+50))*35 + (((tickAnim - 3) / 6) * (3.6104+Math.sin((Math.PI/180)*(((double)tickAnim/20)*150))*9-(13.4926+Math.sin((Math.PI/180)*(((double)tickAnim/20)*150+50))*35)));
            yy = 0.15938 + (((tickAnim - 3) / 6) * (4.05658-(0.15938)));
            zz = -0.89893 + (((tickAnim - 3) / 6) * (5.36701-(-0.89893)));
        }
        else if (tickAnim >= 9 && tickAnim < 13) {
            xx = 3.6104+Math.sin((Math.PI/180)*(((double)tickAnim/20)*150))*9 + (((tickAnim - 9) / 4) * (-8.58034-(3.6104+Math.sin((Math.PI/180)*(((double)tickAnim/20)*150))*9)));
            yy = 4.05658 + (((tickAnim - 9) / 4) * (-1.5896-(4.05658)));
            zz = 5.36701 + (((tickAnim - 9) / 4) * (5.7863-(5.36701)));
        }
        else if (tickAnim >= 13 && tickAnim < 25) {
            xx = -8.58034 + (((tickAnim - 13) / 12) * (23.66072-(-8.58034)));
            yy = -1.5896 + (((tickAnim - 13) / 12) * (-0.2671-(-1.5896)));
            zz = 5.7863 + (((tickAnim - 13) / 12) * (-1.0706-(5.7863)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightshin, rightshin.rotateAngleX + (float) Math.toRadians(xx), rightshin.rotateAngleY + (float) Math.toRadians(yy), rightshin.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 9) {
            xx = 0 + (((tickAnim - 0) / 9) * (0-(0)));
            yy = -0.8 + (((tickAnim - 0) / 9) * (-1.45-(-0.8)));
            zz = 0 + (((tickAnim - 0) / 9) * (0-(0)));
        }
        else if (tickAnim >= 9 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 9) / 4) * (0-(0)));
            yy = -1.45 + (((tickAnim - 9) / 4) * (-1.45-(-1.45)));
            zz = 0 + (((tickAnim - 9) / 4) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 25) {
            xx = 0 + (((tickAnim - 13) / 12) * (0-(0)));
            yy = -1.45 + (((tickAnim - 13) / 12) * (-0.8-(-1.45)));
            zz = 0 + (((tickAnim - 13) / 12) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.rightshin.rotationPointX = this.rightshin.rotationPointX + (float)(xx);
        this.rightshin.rotationPointY = this.rightshin.rotationPointY - (float)(yy);
        this.rightshin.rotationPointZ = this.rightshin.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 12.6223 + (((tickAnim - 0) / 3) * (19.7751+Math.sin((Math.PI/180)*(((double)tickAnim/20)*150+20))*-35-(12.6223)));
            yy = 0.07685 + (((tickAnim - 0) / 3) * (0.30741-(0.07685)));
            zz = 0.24999 + (((tickAnim - 0) / 3) * (0.99995-(0.24999)));
        }
        else if (tickAnim >= 3 && tickAnim < 9) {
            xx = 19.7751+Math.sin((Math.PI/180)*(((double)tickAnim/20)*150+20))*-35 + (((tickAnim - 3) / 6) * (-5.6637+Math.sin((Math.PI/180)*(((double)tickAnim/20)*150))*-50-(19.7751+Math.sin((Math.PI/180)*(((double)tickAnim/20)*150+20))*-35)));
            yy = 0.30741 + (((tickAnim - 3) / 6) * (5.0482-(0.30741)));
            zz = 0.99995 + (((tickAnim - 3) / 6) * (-2.51711-(0.99995)));
        }
        else if (tickAnim >= 9 && tickAnim < 13) {
            xx = -5.6637+Math.sin((Math.PI/180)*(((double)tickAnim/20)*150))*-50 + (((tickAnim - 9) / 4) * (14.99656-(-5.6637+Math.sin((Math.PI/180)*(((double)tickAnim/20)*150))*-50)));
            yy = 5.0482 + (((tickAnim - 9) / 4) * (-2.2782-(5.0482)));
            zz = -2.51711 + (((tickAnim - 9) / 4) * (0.29394-(-2.51711)));
        }
        else if (tickAnim >= 13 && tickAnim < 25) {
            xx = 14.99656 + (((tickAnim - 13) / 12) * (12.6223-(14.99656)));
            yy = -2.2782 + (((tickAnim - 13) / 12) * (0.07685-(-2.2782)));
            zz = 0.29394 + (((tickAnim - 13) / 12) * (0.24999-(0.29394)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightankle, rightankle.rotateAngleX + (float) Math.toRadians(xx), rightankle.rotateAngleY + (float) Math.toRadians(yy), rightankle.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 0) / 13) * (0-(0)));
            yy = -0.325 + (((tickAnim - 0) / 13) * (-1.925-(-0.325)));
            zz = 0 + (((tickAnim - 0) / 13) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 25) {
            xx = 0 + (((tickAnim - 13) / 12) * (0-(0)));
            yy = -1.925 + (((tickAnim - 13) / 12) * (-0.325-(-1.925)));
            zz = 0 + (((tickAnim - 13) / 12) * (0-(0)));
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
            xx = 43.86832 + (((tickAnim - 0) / 3) * (65-(43.86832)));
            yy = -5.6618 + (((tickAnim - 0) / 3) * (0-(-5.6618)));
            zz = -3.6858 + (((tickAnim - 0) / 3) * (0-(-3.6858)));
        }
        else if (tickAnim >= 3 && tickAnim < 9) {
            xx = 65 + (((tickAnim - 3) / 6) * (86.25-(65)));
            yy = 0 + (((tickAnim - 3) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 3) / 6) * (0-(0)));
        }
        else if (tickAnim >= 9 && tickAnim < 13) {
            xx = 86.25 + (((tickAnim - 9) / 4) * (16.68504-(86.25)));
            yy = 0 + (((tickAnim - 9) / 4) * (4.42306-(0)));
            zz = 0 + (((tickAnim - 9) / 4) * (-8.94193-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 18) {
            xx = 16.68504 + (((tickAnim - 13) / 5) * (-3.32431-(16.68504)));
            yy = 4.42306 + (((tickAnim - 13) / 5) * (2.1132-(4.42306)));
            zz = -8.94193 + (((tickAnim - 13) / 5) * (-9.97106-(-8.94193)));
        }
        else if (tickAnim >= 18 && tickAnim < 25) {
            xx = -3.32431 + (((tickAnim - 18) / 7) * (43.86832-(-3.32431)));
            yy = 2.1132 + (((tickAnim - 18) / 7) * (-5.6618-(2.1132)));
            zz = -9.97106 + (((tickAnim - 18) / 7) * (-3.6858-(-9.97106)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightfoot, rightfoot.rotateAngleX + (float) Math.toRadians(xx), rightfoot.rotateAngleY + (float) Math.toRadians(yy), rightfoot.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 3) * (1.55-(0)));
            zz = 0 + (((tickAnim - 0) / 3) * (-0.875-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 9) {
            xx = 0 + (((tickAnim - 3) / 6) * (0-(0)));
            yy = 1.55 + (((tickAnim - 3) / 6) * (1.55-(1.55)));
            zz = -0.875 + (((tickAnim - 3) / 6) * (-0.875-(-0.875)));
        }
        else if (tickAnim >= 9 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 9) / 4) * (0-(0)));
            yy = 1.55 + (((tickAnim - 9) / 4) * (-0.4-(1.55)));
            zz = -0.875 + (((tickAnim - 9) / 4) * (0-(-0.875)));
        }
        else if (tickAnim >= 13 && tickAnim < 18) {
            xx = 0 + (((tickAnim - 13) / 5) * (0-(0)));
            yy = -0.4 + (((tickAnim - 13) / 5) * (2.055-(-0.4)));
            zz = 0 + (((tickAnim - 13) / 5) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 25) {
            xx = 0 + (((tickAnim - 18) / 7) * (0-(0)));
            yy = 2.055 + (((tickAnim - 18) / 7) * (0-(2.055)));
            zz = 0 + (((tickAnim - 18) / 7) * (0-(0)));
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
            xx = -28.76 + (((tickAnim - 0) / 3) * (15.98-(-28.76)));
            yy = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 3) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 9) {
            xx = 15.98 + (((tickAnim - 3) / 6) * (25.51-(15.98)));
            yy = 0 + (((tickAnim - 3) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 3) / 6) * (0-(0)));
        }
        else if (tickAnim >= 9 && tickAnim < 13) {
            xx = 25.51 + (((tickAnim - 9) / 4) * (0-(25.51)));
            yy = 0 + (((tickAnim - 9) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 9) / 4) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 18) {
            xx = 0 + (((tickAnim - 13) / 5) * (-4.49727-(0)));
            yy = 0 + (((tickAnim - 13) / 5) * (0.15689-(0)));
            zz = 0 + (((tickAnim - 13) / 5) * (1.99384-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 21) {
            xx = -4.49727 + (((tickAnim - 18) / 3) * (-34.84579-(-4.49727)));
            yy = 0.15689 + (((tickAnim - 18) / 3) * (0.09805-(0.15689)));
            zz = 1.99384 + (((tickAnim - 18) / 3) * (1.24615-(1.99384)));
        }
        else if (tickAnim >= 21 && tickAnim < 25) {
            xx = -34.84579 + (((tickAnim - 21) / 4) * (-28.76-(-34.84579)));
            yy = 0.09805 + (((tickAnim - 21) / 4) * (0-(0.09805)));
            zz = 1.24615 + (((tickAnim - 21) / 4) * (0-(1.24615)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(righttoes, righttoes.rotateAngleX + (float) Math.toRadians(xx), righttoes.rotateAngleY + (float) Math.toRadians(yy), righttoes.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 11) {
            xx = -25.21796 + (((tickAnim - 0) / 11) * (13.99273-(-25.21796)));
            yy = -1.37685 + (((tickAnim - 0) / 11) * (4.3603-(-1.37685)));
            zz = -2.66564 + (((tickAnim - 0) / 11) * (-9.4502-(-2.66564)));
        }
        else if (tickAnim >= 11 && tickAnim < 15) {
            xx = 13.99273 + (((tickAnim - 11) / 4) * (-4.00383-(13.99273)));
            yy = 4.3603 + (((tickAnim - 11) / 4) * (9.06872-(4.3603)));
            zz = -9.4502 + (((tickAnim - 11) / 4) * (-3.91949-(-9.4502)));
        }
        else if (tickAnim >= 15 && tickAnim < 21) {
            xx = -4.00383 + (((tickAnim - 15) / 6) * (-18.96664-(-4.00383)));
            yy = 9.06872 + (((tickAnim - 15) / 6) * (3.8753+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120+50))*10-(9.06872)));
            zz = -3.91949 + (((tickAnim - 15) / 6) * (-7.5663+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120-30))*7-(-3.91949)));
        }
        else if (tickAnim >= 21 && tickAnim < 25) {
            xx = -18.96664 + (((tickAnim - 21) / 4) * (-25.21796-(-18.96664)));
            yy = 3.8753+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120+50))*10 + (((tickAnim - 21) / 4) * (-1.37685-(3.8753+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120+50))*10)));
            zz = -7.5663+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120-30))*7 + (((tickAnim - 21) / 4) * (-2.66564-(-7.5663+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120-30))*7)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftthigh, leftthigh.rotateAngleX + (float) Math.toRadians(xx), leftthigh.rotateAngleY + (float) Math.toRadians(yy), leftthigh.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 0) / 5) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 5) * (0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1220/0.55))*0.3-(0)));
            zz = 0 + (((tickAnim - 0) / 5) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 5) / 5) * (0-(0)));
            yy = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1220/0.55))*0.3 + (((tickAnim - 5) / 5) * (0-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1220/0.55))*0.3)));
            zz = 0 + (((tickAnim - 5) / 5) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 25) {
            xx = 0 + (((tickAnim - 10) / 15) * (0-(0)));
            yy = 0 + (((tickAnim - 10) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 15) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.leftthigh.rotationPointX = this.leftthigh.rotationPointX + (float)(xx);
        this.leftthigh.rotationPointY = this.leftthigh.rotationPointY - (float)(yy);
        this.leftthigh.rotationPointZ = this.leftthigh.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 11) {
            xx = -5.33034 + (((tickAnim - 0) / 11) * (20.91897-(-5.33034)));
            yy = 1.58962 + (((tickAnim - 0) / 11) * (0.2536-(1.58962)));
            zz = -5.78634 + (((tickAnim - 0) / 11) * (1.0941-(-5.78634)));
        }
        else if (tickAnim >= 11 && tickAnim < 16) {
            xx = 20.91897 + (((tickAnim - 11) / 5) * (23.1588+Math.sin((Math.PI/180)*(((double)tickAnim/20)*150+20))*35-(20.91897)));
            yy = 0.2536 + (((tickAnim - 11) / 5) * (1.13964-(0.2536)));
            zz = 1.0941 + (((tickAnim - 11) / 5) * (0.21149-(1.0941)));
        }
        else if (tickAnim >= 16 && tickAnim < 21) {
            xx = 23.1588+Math.sin((Math.PI/180)*(((double)tickAnim/20)*150+20))*35 + (((tickAnim - 16) / 5) * (11.7224+Math.sin((Math.PI/180)*(((double)tickAnim/20)*150))*9-(23.1588+Math.sin((Math.PI/180)*(((double)tickAnim/20)*150+20))*35)));
            yy = 1.13964 + (((tickAnim - 16) / 5) * (-5.56823-(1.13964)));
            zz = 0.21149 + (((tickAnim - 16) / 5) * (-6.52273-(0.21149)));
        }
        else if (tickAnim >= 21 && tickAnim < 25) {
            xx = 11.7224+Math.sin((Math.PI/180)*(((double)tickAnim/20)*150))*9 + (((tickAnim - 21) / 4) * (-5.33034-(11.7224+Math.sin((Math.PI/180)*(((double)tickAnim/20)*150))*9)));
            yy = -5.56823 + (((tickAnim - 21) / 4) * (1.58962-(-5.56823)));
            zz = -6.52273 + (((tickAnim - 21) / 4) * (-5.78634-(-6.52273)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftshin, leftshin.rotateAngleX + (float) Math.toRadians(xx), leftshin.rotateAngleY + (float) Math.toRadians(yy), leftshin.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 12) {
            xx = 0 + (((tickAnim - 0) / 12) * (0-(0)));
            yy = -1.45 + (((tickAnim - 0) / 12) * (-0.8-(-1.45)));
            zz = 0 + (((tickAnim - 0) / 12) * (0-(0)));
        }
        else if (tickAnim >= 12 && tickAnim < 21) {
            xx = 0 + (((tickAnim - 12) / 9) * (0-(0)));
            yy = -0.8 + (((tickAnim - 12) / 9) * (-1.45-(-0.8)));
            zz = 0 + (((tickAnim - 12) / 9) * (0-(0)));
        }
        else if (tickAnim >= 21 && tickAnim < 25) {
            xx = 0 + (((tickAnim - 21) / 4) * (0-(0)));
            yy = -1.45 + (((tickAnim - 21) / 4) * (-1.45-(-1.45)));
            zz = 0 + (((tickAnim - 21) / 4) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.leftshin.rotationPointX = this.leftshin.rotationPointX + (float)(xx);
        this.leftshin.rotationPointY = this.leftshin.rotationPointY - (float)(yy);
        this.leftshin.rotationPointZ = this.leftshin.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 11) {
            xx = 17.74656 + (((tickAnim - 0) / 11) * (17.75-(17.74656)));
            yy = 2.27825 + (((tickAnim - 0) / 11) * (0-(2.27825)));
            zz = 0.29394 + (((tickAnim - 0) / 11) * (0-(0.29394)));
        }
        else if (tickAnim >= 11 && tickAnim < 15) {
            xx = 17.75 + (((tickAnim - 11) / 4) * (-52.8499+Math.sin((Math.PI/180)*(((double)tickAnim/20)*150+20))*55-(17.75)));
            yy = 0 + (((tickAnim - 11) / 4) * (0.30741-(0)));
            zz = 0 + (((tickAnim - 11) / 4) * (0.99995-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 21) {
            xx = -52.8499+Math.sin((Math.PI/180)*(((double)tickAnim/20)*150+20))*55 + (((tickAnim - 15) / 6) * (-16.0331+Math.sin((Math.PI/180)*(((double)tickAnim/20)*150))*-50-(-52.8499+Math.sin((Math.PI/180)*(((double)tickAnim/20)*150+20))*55)));
            yy = 0.30741 + (((tickAnim - 15) / 6) * (2.66334-(0.30741)));
            zz = 0.99995 + (((tickAnim - 15) / 6) * (-0.38616-(0.99995)));
        }
        else if (tickAnim >= 21 && tickAnim < 25) {
            xx = -16.0331+Math.sin((Math.PI/180)*(((double)tickAnim/20)*150))*-50 + (((tickAnim - 21) / 4) * (17.74656-(-16.0331+Math.sin((Math.PI/180)*(((double)tickAnim/20)*150))*-50)));
            yy = 2.66334 + (((tickAnim - 21) / 4) * (2.27825-(2.66334)));
            zz = -0.38616 + (((tickAnim - 21) / 4) * (0.29394-(-0.38616)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftankle, leftankle.rotateAngleX + (float) Math.toRadians(xx), leftankle.rotateAngleY + (float) Math.toRadians(yy), leftankle.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 11) {
            xx = 0 + (((tickAnim - 0) / 11) * (0-(0)));
            yy = -1.8 + (((tickAnim - 0) / 11) * (-0.325-(-1.8)));
            zz = 0 + (((tickAnim - 0) / 11) * (0-(0)));
        }
        else if (tickAnim >= 11 && tickAnim < 21) {
            xx = 0 + (((tickAnim - 11) / 10) * (0-(0)));
            yy = -0.325 + (((tickAnim - 11) / 10) * (0-(-0.325)));
            zz = 0 + (((tickAnim - 11) / 10) * (0-(0)));
        }
        else if (tickAnim >= 21 && tickAnim < 25) {
            xx = 0 + (((tickAnim - 21) / 4) * (0-(0)));
            yy = 0 + (((tickAnim - 21) / 4) * (-1.8-(0)));
            zz = 0 + (((tickAnim - 21) / 4) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.leftankle.rotationPointX = this.leftankle.rotationPointX + (float)(xx);
        this.leftankle.rotationPointY = this.leftankle.rotationPointY - (float)(yy);
        this.leftankle.rotationPointZ = this.leftankle.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 6) {
            xx = 13.08157 + (((tickAnim - 0) / 6) * (-10.83839-(13.08157)));
            yy = -2.8995 + (((tickAnim - 0) / 6) * (1.84607-(-2.8995)));
            zz = 6.6478 + (((tickAnim - 0) / 6) * (8.83771-(6.6478)));
        }
        else if (tickAnim >= 6 && tickAnim < 11) {
            xx = -10.83839 + (((tickAnim - 6) / 5) * (36.82442-(-10.83839)));
            yy = 1.84607 + (((tickAnim - 6) / 5) * (7.5491-(1.84607)));
            zz = 8.83771 + (((tickAnim - 6) / 5) * (4.9144-(8.83771)));
        }
        else if (tickAnim >= 11 && tickAnim < 15) {
            xx = 36.82442 + (((tickAnim - 11) / 4) * (79.25-(36.82442)));
            yy = 7.5491 + (((tickAnim - 11) / 4) * (0-(7.5491)));
            zz = 4.9144 + (((tickAnim - 11) / 4) * (0-(4.9144)));
        }
        else if (tickAnim >= 15 && tickAnim < 20) {
            xx = 79.25 + (((tickAnim - 15) / 5) * (74.725-(79.25)));
            yy = 0 + (((tickAnim - 15) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 5) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 25) {
            xx = 74.725 + (((tickAnim - 20) / 5) * (13.08157-(74.725)));
            yy = 0 + (((tickAnim - 20) / 5) * (-2.8995-(0)));
            zz = 0 + (((tickAnim - 20) / 5) * (6.6478-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftfoot, leftfoot.rotateAngleX + (float) Math.toRadians(xx), leftfoot.rotateAngleY + (float) Math.toRadians(yy), leftfoot.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 6) {
            xx = 0 + (((tickAnim - 0) / 6) * (0-(0)));
            yy = -0.6 + (((tickAnim - 0) / 6) * (1.525-(-0.6)));
            zz = 0 + (((tickAnim - 0) / 6) * (0-(0)));
        }
        else if (tickAnim >= 6 && tickAnim < 11) {
            xx = 0 + (((tickAnim - 6) / 5) * (0-(0)));
            yy = 1.525 + (((tickAnim - 6) / 5) * (0-(1.525)));
            zz = 0 + (((tickAnim - 6) / 5) * (0-(0)));
        }
        else if (tickAnim >= 11 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 11) / 4) * (0-(0)));
            yy = 0 + (((tickAnim - 11) / 4) * (1.85-(0)));
            zz = 0 + (((tickAnim - 11) / 4) * (-0.875-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 15) / 5) * (0-(0)));
            yy = 1.85 + (((tickAnim - 15) / 5) * (0-(1.85)));
            zz = -0.875 + (((tickAnim - 15) / 5) * (-1.05-(-0.875)));
        }
        else if (tickAnim >= 20 && tickAnim < 25) {
            xx = 0 + (((tickAnim - 20) / 5) * (0-(0)));
            yy = 0 + (((tickAnim - 20) / 5) * (-0.6-(0)));
            zz = -1.05 + (((tickAnim - 20) / 5) * (0-(-1.05)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.leftfoot.rotationPointX = this.leftfoot.rotationPointX + (float)(xx);
        this.leftfoot.rotationPointY = this.leftfoot.rotationPointY - (float)(yy);
        this.leftfoot.rotationPointZ = this.leftfoot.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 6) {
            xx = 0 + (((tickAnim - 0) / 6) * (-6.28-(0)));
            yy = 0 + (((tickAnim - 0) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 6) * (0-(0)));
        }
        else if (tickAnim >= 6 && tickAnim < 8) {
            xx = -6.28 + (((tickAnim - 6) / 2) * (-27.02-(-6.28)));
            yy = 0 + (((tickAnim - 6) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 6) / 2) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 11) {
            xx = -27.02 + (((tickAnim - 8) / 3) * (-13.75-(-27.02)));
            yy = 0 + (((tickAnim - 8) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 3) * (0-(0)));
        }
        else if (tickAnim >= 11 && tickAnim < 15) {
            xx = -13.75 + (((tickAnim - 11) / 4) * (25.98-(-13.75)));
            yy = 0 + (((tickAnim - 11) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 11) / 4) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 21) {
            xx = 25.98 + (((tickAnim - 15) / 6) * (18.16-(25.98)));
            yy = 0 + (((tickAnim - 15) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 6) * (0-(0)));
        }
        else if (tickAnim >= 21 && tickAnim < 25) {
            xx = 18.16 + (((tickAnim - 21) / 4) * (0-(18.16)));
            yy = 0 + (((tickAnim - 21) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 21) / 4) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(lefttoes, lefttoes.rotateAngleX + (float) Math.toRadians(xx), lefttoes.rotateAngleY + (float) Math.toRadians(yy), lefttoes.rotateAngleZ + (float) Math.toRadians(zz));



    }

    @Override
    public void setLivingAnimations(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime) {
        super.setLivingAnimations(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime);
        this.resetToDefaultPose();
        EntityPrehistoricFloraTyrannotitan ee = (EntityPrehistoricFloraTyrannotitan) entitylivingbaseIn;

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
            //moving in water
            //
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
        else if (ee.getAnimation() == ee.NOISE_ANIMATION) { //The idle noise/anim
            animNoiseHiss(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime, ee.getAnimationTick());
        }
        else if (ee.getAnimation() == ee.NOISE2_ANIMATION) { //The idle noise/anim
            animNoiseRumble(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime, ee.getAnimationTick());
        }
        else if (ee.getAnimation() == ee.ROAR_ANIMATION) { //The actual roar/anim
            animRoar(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime, ee.getAnimationTick());
        }
        else if (ee.getAnimation() == ee.STAND_ANIMATION) {
            animAlert(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime, ee.getAnimationTick());
        }

        
    }

    public void animate(IAnimatedEntity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        EntityPrehistoricFloraTyrannotitan e = (EntityPrehistoricFloraTyrannotitan) entity;
        animator.update(entity);

        animator.setAnimation(e.HURT_ANIMATION);
        animator.startKeyframe(10);
        animator.rotate(this.neckbase, (float) Math.toRadians(-10),0,0);
        animator.rotate(this.neckmiddlebase, (float) Math.toRadians(-10), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(this.neckmiddleend, (float) Math.toRadians(-10), (float) Math.toRadians(0), (float) Math.toRadians(0));
        //animator.rotate(this.Neck4, (float) Math.toRadians(-10), (float) Math.toRadians(0), (float) Math.toRadians(0));
        //animator.rotate(this.Head, (float) Math.toRadians(-55), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(this.lowerjawback, (float) Math.toRadians(35), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.endKeyframe();
        animator.setStaticKeyframe(10);
        animator.resetKeyframe(10);
    }
}
