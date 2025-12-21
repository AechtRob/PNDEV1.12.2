package net.lepidodendron.entity.model.entity;

import net.ilexiconn.llibrary.client.model.ModelAnimator;
import net.ilexiconn.llibrary.client.model.tools.AdvancedModelRenderer;
import net.ilexiconn.llibrary.server.animation.IAnimatedEntity;
import net.lepidodendron.entity.EntityPrehistoricFloraOlorotitan;
import net.lepidodendron.entity.model.ModelBasePalaeopedia;
import net.minecraft.client.model.ModelBox;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;

public class ModelOlorotitan extends ModelBasePalaeopedia {
    private final AdvancedModelRenderer root;
    private final AdvancedModelRenderer hips;
    private final AdvancedModelRenderer tail1;
    private final AdvancedModelRenderer cube_r1;
    private final AdvancedModelRenderer cube_r2;
    private final AdvancedModelRenderer cube_r3;
    private final AdvancedModelRenderer tail2;
    private final AdvancedModelRenderer cube_r4;
    private final AdvancedModelRenderer cube_r5;
    private final AdvancedModelRenderer tail3;
    private final AdvancedModelRenderer cube_r6;
    private final AdvancedModelRenderer cube_r7;
    private final AdvancedModelRenderer tail4;
    private final AdvancedModelRenderer cube_r8;
    private final AdvancedModelRenderer cube_r9;
    private final AdvancedModelRenderer tail5;
    private final AdvancedModelRenderer cube_r10;
    private final AdvancedModelRenderer body;
    private final AdvancedModelRenderer chest;
    private final AdvancedModelRenderer bodyfrontridge1;
    private final AdvancedModelRenderer bodyfrontridge2;
    private final AdvancedModelRenderer bodyfrontdorsalscales2;
    private final AdvancedModelRenderer bodyfrontdorsalscales;
    private final AdvancedModelRenderer chestslope;
    private final AdvancedModelRenderer neck1;
    private final AdvancedModelRenderer neck2;
    private final AdvancedModelRenderer neck3;
    private final AdvancedModelRenderer neck4;
    private final AdvancedModelRenderer neck4ridge1;
    private final AdvancedModelRenderer neck4ridge2;
    private final AdvancedModelRenderer neck4dorsalscales;
    private final AdvancedModelRenderer head;
    private final AdvancedModelRenderer lowerjawback;
    private final AdvancedModelRenderer lowerjawmiddleback;
    private final AdvancedModelRenderer lowerjawmiddle;
    private final AdvancedModelRenderer lowerjawmiddlefront;
    private final AdvancedModelRenderer lowerjawfront;
    private final AdvancedModelRenderer lowerjawslope2;
    private final AdvancedModelRenderer lowerjawslope1;
    private final AdvancedModelRenderer leftlowerteeth;
    private final AdvancedModelRenderer rightlowerteeth;
    private final AdvancedModelRenderer leftmasseterfront;
    private final AdvancedModelRenderer rightmasseterfront;
    private final AdvancedModelRenderer leftmasseterback;
    private final AdvancedModelRenderer rightmasseterback;
    private final AdvancedModelRenderer lefteye;
    private final AdvancedModelRenderer righteye;
    private final AdvancedModelRenderer leftcheekflair;
    private final AdvancedModelRenderer rightcheekflair;
    private final AdvancedModelRenderer upperjawbase;
    private final AdvancedModelRenderer upperjawmiddlebase;
    private final AdvancedModelRenderer upperjawmiddlefront;
    private final AdvancedModelRenderer upperbeakstart;
    private final AdvancedModelRenderer upperbeak;
    private final AdvancedModelRenderer upperbeakbridge;
    private final AdvancedModelRenderer upperbeakextra;
    private final AdvancedModelRenderer rightnasalsac;
    private final AdvancedModelRenderer leftnasalsac;
    private final AdvancedModelRenderer upperjawmidfrontslope;
    private final AdvancedModelRenderer upperjawmiddleslope;
    private final AdvancedModelRenderer leftupperteeth;
    private final AdvancedModelRenderer rightupperteeth;
    private final AdvancedModelRenderer headslope1;
    private final AdvancedModelRenderer headslope2;
    private final AdvancedModelRenderer crestbase;
    private final AdvancedModelRenderer crest1;
    private final AdvancedModelRenderer crest2;
    private final AdvancedModelRenderer crest3;
    private final AdvancedModelRenderer crest4;
    private final AdvancedModelRenderer crest5;
    private final AdvancedModelRenderer crest6;
    private final AdvancedModelRenderer crest7;
    private final AdvancedModelRenderer crest8;
    private final AdvancedModelRenderer neck3ridge;
    private final AdvancedModelRenderer neck3dorsalscales;
    private final AdvancedModelRenderer neck3slope;
    private final AdvancedModelRenderer neck2ridge;
    private final AdvancedModelRenderer neckcollapsableflesh;
    private final AdvancedModelRenderer neck2dorsalscales2;
    private final AdvancedModelRenderer neck2dorsalscales1;
    private final AdvancedModelRenderer neck2slope;
    private final AdvancedModelRenderer neck1ridge;
    private final AdvancedModelRenderer neck1dorsalscales;
    private final AdvancedModelRenderer neck1slope;
    private final AdvancedModelRenderer rightArm;
    private final AdvancedModelRenderer rightArm2;
    private final AdvancedModelRenderer rightArm3;
    private final AdvancedModelRenderer rightArm4;
    private final AdvancedModelRenderer righthoof;
    private final AdvancedModelRenderer rightinnerfinger;
    private final AdvancedModelRenderer leftArm;
    private final AdvancedModelRenderer leftArm2;
    private final AdvancedModelRenderer leftArm3;
    private final AdvancedModelRenderer leftArm4;
    private final AdvancedModelRenderer lefthoof;
    private final AdvancedModelRenderer leftinnerfinger;
    private final AdvancedModelRenderer bodymiddleridge;
    private final AdvancedModelRenderer bodymiddorsalscales;
    private final AdvancedModelRenderer hipridge1;
    private final AdvancedModelRenderer hipridge2;
    private final AdvancedModelRenderer hipdorsalscales2;
    private final AdvancedModelRenderer hipdorsalscales1;
    private final AdvancedModelRenderer gutslope;
    private final AdvancedModelRenderer rightLeg;
    private final AdvancedModelRenderer rightLeg2;
    private final AdvancedModelRenderer rightLeg3;
    private final AdvancedModelRenderer rightLeg4;
    private final AdvancedModelRenderer rightLeg5;
    private final AdvancedModelRenderer leftLeg;
    private final AdvancedModelRenderer leftLeg2;
    private final AdvancedModelRenderer leftLeg3;
    private final AdvancedModelRenderer leftLeg4;
    private final AdvancedModelRenderer leftLeg5;

    private ModelAnimator animator;

    public ModelOlorotitan() {
        this.textureWidth = 200;
        this.textureHeight = 200;

        this.root = new AdvancedModelRenderer(this);
        this.root.setRotationPoint(0.0F, 0.0F, 0.0F);


        this.hips = new AdvancedModelRenderer(this);
        this.hips.setRotationPoint(0.0F, -17.7F, 9.0F);
        this.root.addChild(hips);
        this.setRotateAngle(hips, 0.0848F, 0.0F, 0.0F);
        this.hips.cubeList.add(new ModelBox(hips, 0, 152, -6.0F, -3.5F, -11.5F, 12, 22, 26, 0.0F, false));

        this.tail1 = new AdvancedModelRenderer(this);
        this.tail1.setRotationPoint(0.0F, -0.9F, 13.0F);
        this.hips.addChild(tail1);
        this.setRotateAngle(tail1, -0.2546F, 0.0F, 0.0F);
        this.tail1.cubeList.add(new ModelBox(tail1, 120, 168, -4.5F, -2.5F, -0.5F, 9, 14, 18, 0.0F, false));
        this.tail1.cubeList.add(new ModelBox(tail1, 0, 3, 0.0F, -8.725F, 0.1F, 0, 2, 9, 0.0F, false));

        this.cube_r1 = new AdvancedModelRenderer(this);
        this.cube_r1.setRotationPoint(-0.01F, -8.7F, 9.75F);
        this.tail1.addChild(cube_r1);
        this.setRotateAngle(cube_r1, 0.0349F, 0.0F, 0.0F);
        this.cube_r1.cubeList.add(new ModelBox(cube_r1, 29, 4, 0.0F, 0.0F, 0.0F, 0, 2, 7, 0.0F, false));

        this.cube_r2 = new AdvancedModelRenderer(this);
        this.cube_r2.setRotationPoint(0.0F, -7.35F, -1.0F);
        this.tail1.addChild(cube_r2);
        this.setRotateAngle(cube_r2, -0.0087F, 0.0F, 0.0F);
        this.cube_r2.cubeList.add(new ModelBox(cube_r2, 0, 46, -2.5F, -0.25F, 0.0F, 5, 6, 10, 0.0F, false));

        this.cube_r3 = new AdvancedModelRenderer(this);
        this.cube_r3.setRotationPoint(-0.01F, -6.15F, 7.375F);
        this.tail1.addChild(cube_r3);
        this.setRotateAngle(cube_r3, 0.0349F, 0.0F, 0.0F);
        this.cube_r3.cubeList.add(new ModelBox(cube_r3, 21, 39, -2.0F, -1.25F, 1.5F, 4, 6, 9, 0.0F, false));

        this.tail2 = new AdvancedModelRenderer(this);
        this.tail2.setRotationPoint(0.0F, -1.4F, 16.5F);
        this.tail1.addChild(tail2);
        this.setRotateAngle(tail2, -0.1485F, 0.0F, 0.0F);
        this.tail2.cubeList.add(new ModelBox(tail2, 0, 85, -3.5F, -1.0F, -0.5F, 7, 9, 15, 0.0F, false));

        this.cube_r4 = new AdvancedModelRenderer(this);
        this.cube_r4.setRotationPoint(0.0F, -5.875F, -1.0F);
        this.tail2.addChild(cube_r4);
        this.setRotateAngle(cube_r4, -0.144F, 0.0F, 0.0F);
        this.cube_r4.cubeList.add(new ModelBox(cube_r4, 30, 78, -1.5F, -0.25F, 0.0F, 3, 5, 16, 0.0F, false));

        this.cube_r5 = new AdvancedModelRenderer(this);
        this.cube_r5.setRotationPoint(0.0F, -6.525F, -0.125F);
        this.tail2.addChild(cube_r5);
        this.setRotateAngle(cube_r5, -0.1789F, 0.0F, 0.0F);
        this.cube_r5.cubeList.add(new ModelBox(cube_r5, 0, 8, 0.0F, -1.0F, 0.0F, 0, 2, 15, 0.0F, false));

        this.tail3 = new AdvancedModelRenderer(this);
        this.tail3.setRotationPoint(0.0F, 0.1F, 14.0F);
        this.tail2.addChild(tail3);
        this.setRotateAngle(tail3, 0.0213F, 0.0F, 0.0F);
        this.tail3.cubeList.add(new ModelBox(tail3, 53, 70, -2.5F, -1.0F, -0.5F, 5, 6, 13, 0.0F, false));

        this.cube_r6 = new AdvancedModelRenderer(this);
        this.cube_r6.setRotationPoint(0.0F, -2.7F, 0.7F);
        this.tail3.addChild(cube_r6);
        this.setRotateAngle(cube_r6, -0.1178F, 0.0F, 0.0F);
        this.cube_r6.cubeList.add(new ModelBox(cube_r6, 27, 60, -1.0F, -0.8898F, -0.7396F, 2, 3, 13, 0.0F, false));

        this.cube_r7 = new AdvancedModelRenderer(this);
        this.cube_r7.setRotationPoint(0.0F, -2.5F, 1.2F);
        this.tail3.addChild(cube_r7);
        this.setRotateAngle(cube_r7, -0.1353F, 0.0F, 0.0F);
        this.cube_r7.cubeList.add(new ModelBox(cube_r7, 0, 4, 0.0F, -2.0F, 0.0F, 0, 2, 11, 0.0F, false));

        this.tail4 = new AdvancedModelRenderer(this);
        this.tail4.setRotationPoint(0.0F, 0.3F, 12.2F);
        this.tail3.addChild(tail4);
        this.setRotateAngle(tail4, 0.0848F, 0.0F, 0.0F);
        this.tail4.cubeList.add(new ModelBox(tail4, 66, 49, -1.5F, -1.0F, -0.5F, 3, 4, 8, 0.0F, false));

        this.cube_r8 = new AdvancedModelRenderer(this);
        this.cube_r8.setRotationPoint(0.0F, -1.5F, 0.5F);
        this.tail4.addChild(cube_r8);
        this.setRotateAngle(cube_r8, -0.1265F, 0.0F, 0.0F);
        this.cube_r8.cubeList.add(new ModelBox(cube_r8, 103, 137, -0.5F, -0.5F, -1.0F, 1, 1, 8, 0.0F, false));

        this.cube_r9 = new AdvancedModelRenderer(this);
        this.cube_r9.setRotationPoint(0.0F, -1.875F, 0.7F);
        this.tail4.addChild(cube_r9);
        this.setRotateAngle(cube_r9, -0.1047F, 0.0F, 0.0F);
        this.cube_r9.cubeList.add(new ModelBox(cube_r9, 15, 3, 0.0F, -0.925F, -0.2F, 0, 1, 7, 0.0F, false));

        this.tail5 = new AdvancedModelRenderer(this);
        this.tail5.setRotationPoint(0.0F, 0.1F, 7.0F);
        this.tail4.addChild(tail5);
        this.setRotateAngle(tail5, 0.0213F, 0.0F, 0.0F);
        this.tail5.cubeList.add(new ModelBox(tail5, 71, 38, -1.0F, -1.0F, 0.0F, 2, 3, 8, 0.0F, false));

        this.cube_r10 = new AdvancedModelRenderer(this);
        this.cube_r10.setRotationPoint(0.0F, -1.4F, 3.7F);
        this.tail5.addChild(cube_r10);
        this.setRotateAngle(cube_r10, -0.0175F, 0.0F, 0.0F);
        this.cube_r10.cubeList.add(new ModelBox(cube_r10, 22, 1, 0.0F, -0.15F, -2.5F, 0, 1, 5, 0.0F, false));

        this.body = new AdvancedModelRenderer(this);
        this.body.setRotationPoint(0.0F, -2.2F, -10.5F);
        this.hips.addChild(body);
        this.setRotateAngle(body, 0.0213F, 0.0F, 0.0F);
        this.body.cubeList.add(new ModelBox(body, 0, 110, -7.0F, -1.1F, -15.5F, 14, 25, 16, 0.0F, false));

        this.chest = new AdvancedModelRenderer(this);
        this.chest.setRotationPoint(0.0F, 0.0F, -14.5F);
        this.body.addChild(chest);
        this.setRotateAngle(chest, 0.5943F, 0.0F, 0.0F);
        this.chest.cubeList.add(new ModelBox(chest, 104, 137, -6.0F, -1.0F, -17.5F, 12, 12, 18, 0.0F, false));

        this.bodyfrontridge1 = new AdvancedModelRenderer(this);
        this.bodyfrontridge1.setRotationPoint(0.0F, 0.1F, 0.0F);
        this.chest.addChild(bodyfrontridge1);
        this.setRotateAngle(bodyfrontridge1, -0.1911F, 0.0F, 0.0F);
        this.bodyfrontridge1.cubeList.add(new ModelBox(bodyfrontridge1, 0, 29, -2.5F, -6.0F, -5.0F, 5, 8, 8, 0.0F, false));

        this.bodyfrontridge2 = new AdvancedModelRenderer(this);
        this.bodyfrontridge2.setRotationPoint(0.01F, -6.0F, -5.0F);
        this.bodyfrontridge1.addChild(bodyfrontridge2);
        this.setRotateAngle(bodyfrontridge2, 0.3609F, 0.0F, 0.0F);
        this.bodyfrontridge2.cubeList.add(new ModelBox(bodyfrontridge2, 1, 62, -2.5F, 0.0F, -15.0F, 5, 7, 15, 0.0F, false));

        this.bodyfrontdorsalscales2 = new AdvancedModelRenderer(this);
        this.bodyfrontdorsalscales2.setRotationPoint(0.0F, 0.0F, -13.6F);
        this.bodyfrontridge2.addChild(bodyfrontdorsalscales2);
        this.bodyfrontdorsalscales2.cubeList.add(new ModelBox(bodyfrontdorsalscales2, 0, 5, 0.0F, -1.0F, 0.0F, 0, 1, 13, 0.0F, false));

        this.bodyfrontdorsalscales = new AdvancedModelRenderer(this);
        this.bodyfrontdorsalscales.setRotationPoint(0.0F, -6.0F, -5.3F);
        this.bodyfrontridge1.addChild(bodyfrontdorsalscales);
        this.setRotateAngle(bodyfrontdorsalscales, 0.0848F, 0.0F, 0.0F);
        this.bodyfrontdorsalscales.cubeList.add(new ModelBox(bodyfrontdorsalscales, 22, 6, 0.0F, -1.0F, 0.0F, 0, 2, 7, 0.0F, false));

        this.chestslope = new AdvancedModelRenderer(this);
        this.chestslope.setRotationPoint(-0.01F, 11.0F, -17.5F);
        this.chest.addChild(chestslope);
        this.setRotateAngle(chestslope, 0.5095F, 0.0F, 0.0F);
        this.chestslope.cubeList.add(new ModelBox(chestslope, 152, 104, -6.0F, 0.0F, 0.0F, 12, 11, 12, 0.0F, false));

        this.neck1 = new AdvancedModelRenderer(this);
        this.neck1.setRotationPoint(0.0F, 2.0F, -15.0F);
        this.chest.addChild(neck1);
        this.setRotateAngle(neck1, -0.4458F, 0.0F, 0.0F);
        this.neck1.cubeList.add(new ModelBox(neck1, 77, 64, -3.5F, -3.5F, -5.0F, 7, 11, 7, 0.0F, false));

        this.neck2 = new AdvancedModelRenderer(this);
        this.neck2.setRotationPoint(0.0F, 0.0F, -4.0F);
        this.neck1.addChild(neck2);
        this.setRotateAngle(neck2, -0.743F, 0.0F, 0.0F);
        this.neck2.cubeList.add(new ModelBox(neck2, 27, 21, -2.5F, -3.5F, -6.5F, 5, 10, 8, 0.0F, false));

        this.neck3 = new AdvancedModelRenderer(this);
        this.neck3.setRotationPoint(0.0F, -0.6F, -6.0F);
        this.neck2.addChild(neck3);
        this.setRotateAngle(neck3, -0.7641F, 0.0F, 0.0F);
        this.neck3.cubeList.add(new ModelBox(neck3, 106, 65, -2.0F, -2.5F, -9.5F, 4, 7, 10, 0.0F, false));

        this.neck4 = new AdvancedModelRenderer(this);
        this.neck4.setRotationPoint(0.0F, -0.5F, -9.0F);
        this.neck3.addChild(neck4);
        this.setRotateAngle(neck4, 0.5308F, 0.0F, 0.0F);
        this.neck4.cubeList.add(new ModelBox(neck4, 89, 51, -1.5F, -1.5F, -5.0F, 3, 6, 6, 0.0F, false));

        this.neck4ridge1 = new AdvancedModelRenderer(this);
        this.neck4ridge1.setRotationPoint(0.0F, -1.2F, 1.0F);
        this.neck4.addChild(neck4ridge1);
        this.setRotateAngle(neck4ridge1, 0.1485F, 0.0F, 0.0F);
        this.neck4ridge1.cubeList.add(new ModelBox(neck4ridge1, 88, 119, -1.0F, -2.0F, -5.4F, 2, 4, 6, 0.0F, false));

        this.neck4ridge2 = new AdvancedModelRenderer(this);
        this.neck4ridge2.setRotationPoint(0.01F, -2.0F, -5.4F);
        this.neck4ridge1.addChild(neck4ridge2);
        this.setRotateAngle(neck4ridge2, 0.7641F, 0.0F, 0.0F);
        this.neck4ridge2.cubeList.add(new ModelBox(neck4ridge2, 99, 64, -1.0F, 0.0F, -3.0F, 2, 3, 3, 0.0F, false));

        this.neck4dorsalscales = new AdvancedModelRenderer(this);
        this.neck4dorsalscales.setRotationPoint(0.0F, -1.6F, 0.4F);
        this.neck4ridge1.addChild(neck4dorsalscales);
        this.setRotateAngle(neck4dorsalscales, 0.0848F, 0.0F, 0.0F);
        this.neck4dorsalscales.cubeList.add(new ModelBox(neck4dorsalscales, 11, 1, 0.0F, -1.0F, -5.0F, 0, 1, 5, 0.0F, false));

        this.head = new AdvancedModelRenderer(this);
        this.head.setRotationPoint(-0.01F, -0.7F, -4.0F);
        this.neck4.addChild(head);
        this.setRotateAngle(head, 0.743F, 0.0F, 0.0F);
        this.head.cubeList.add(new ModelBox(head, 82, 0, -2.0F, -1.5F, -4.5F, 4, 5, 5, 0.0F, false));

        this.lowerjawback = new AdvancedModelRenderer(this);
        this.lowerjawback.setRotationPoint(-0.01F, 4.0F, -0.5F);
        this.head.addChild(lowerjawback);
        this.lowerjawback.cubeList.add(new ModelBox(lowerjawback, 61, 0, -2.5F, -0.5F, -4.0F, 5, 2, 5, 0.0F, false));

        this.lowerjawmiddleback = new AdvancedModelRenderer(this);
        this.lowerjawmiddleback.setRotationPoint(0.0F, 1.5F, -4.0F);
        this.lowerjawback.addChild(lowerjawmiddleback);
        this.setRotateAngle(lowerjawmiddleback, -0.1485F, 0.0F, 0.0F);
        this.lowerjawmiddleback.cubeList.add(new ModelBox(lowerjawmiddleback, 53, 0, -2.0F, -2.0F, -2.0F, 4, 2, 2, 0.0F, false));

        this.lowerjawmiddle = new AdvancedModelRenderer(this);
        this.lowerjawmiddle.setRotationPoint(0.0F, -2.0F, -2.0F);
        this.lowerjawmiddleback.addChild(lowerjawmiddle);
        this.setRotateAngle(lowerjawmiddle, 0.2335F, 0.0F, 0.0F);
        this.lowerjawmiddle.cubeList.add(new ModelBox(lowerjawmiddle, 42, 0, -1.5F, 0.0F, -2.0F, 3, 1, 2, 0.0F, false));

        this.lowerjawmiddlefront = new AdvancedModelRenderer(this);
        this.lowerjawmiddlefront.setRotationPoint(-0.01F, 0.0F, -2.0F);
        this.lowerjawmiddle.addChild(lowerjawmiddlefront);
        this.setRotateAngle(lowerjawmiddlefront, 0.3821F, 0.0F, 0.0F);
        this.lowerjawmiddlefront.cubeList.add(new ModelBox(lowerjawmiddlefront, 29, 0, -1.5F, 0.0F, -3.0F, 3, 1, 3, 0.0F, false));

        this.lowerjawfront = new AdvancedModelRenderer(this);
        this.lowerjawfront.setRotationPoint(0.0F, 1.0F, -3.0F);
        this.lowerjawmiddlefront.addChild(lowerjawfront);
        this.setRotateAngle(lowerjawfront, -0.1911F, 0.0F, 0.0F);
        this.lowerjawfront.cubeList.add(new ModelBox(lowerjawfront, 53, 5, -1.0F, -1.0F, -2.0F, 2, 1, 2, 0.0F, false));

        this.lowerjawslope2 = new AdvancedModelRenderer(this);
        this.lowerjawslope2.setRotationPoint(-0.01F, 1.0F, -3.0F);
        this.lowerjawmiddlefront.addChild(lowerjawslope2);
        this.setRotateAngle(lowerjawslope2, -0.1911F, 0.0F, 0.0F);
        this.lowerjawslope2.cubeList.add(new ModelBox(lowerjawslope2, 40, 4, -1.5F, -1.0F, 0.0F, 3, 1, 3, 0.0F, false));

        this.lowerjawslope1 = new AdvancedModelRenderer(this);
        this.lowerjawslope1.setRotationPoint(0.01F, 2.0F, -0.3F);
        this.lowerjawmiddle.addChild(lowerjawslope1);
        this.setRotateAngle(lowerjawslope1, -0.1911F, 0.0F, 0.0F);
        this.lowerjawslope1.cubeList.add(new ModelBox(lowerjawslope1, 18, 0, -1.5F, -1.0F, -2.0F, 3, 1, 2, 0.0F, false));

        this.leftlowerteeth = new AdvancedModelRenderer(this);
        this.leftlowerteeth.setRotationPoint(-1.1F, -1.3F, 0.4F);
        this.lowerjawmiddleback.addChild(leftlowerteeth);
        this.setRotateAngle(leftlowerteeth, 0.0848F, -0.0424F, 0.0F);
        this.leftlowerteeth.cubeList.add(new ModelBox(leftlowerteeth, 133, 24, 0.0F, -1.0F, -4.0F, 0, 1, 4, 0.0F, false));

        this.rightlowerteeth = new AdvancedModelRenderer(this);
        this.rightlowerteeth.setRotationPoint(1.1F, -1.3F, 0.4F);
        this.lowerjawmiddleback.addChild(rightlowerteeth);
        this.setRotateAngle(rightlowerteeth, 0.0848F, 0.0424F, 0.0F);
        this.rightlowerteeth.cubeList.add(new ModelBox(rightlowerteeth, 133, 26, 0.0F, -1.0F, -4.0F, 0, 1, 4, 0.0F, false));

        this.leftmasseterfront = new AdvancedModelRenderer(this);
        this.leftmasseterfront.setRotationPoint(-1.8F, -2.1F, 0.1F);
        this.lowerjawmiddleback.addChild(leftmasseterfront);
        this.setRotateAngle(leftmasseterfront, 0.0F, -0.1698F, 0.0213F);
        this.leftmasseterfront.cubeList.add(new ModelBox(leftmasseterfront, 133, 15, 0.0F, -2.0F, -4.0F, 0, 3, 5, 0.0F, false));

        this.rightmasseterfront = new AdvancedModelRenderer(this);
        this.rightmasseterfront.setRotationPoint(1.8F, -2.1F, 0.1F);
        this.lowerjawmiddleback.addChild(rightmasseterfront);
        this.setRotateAngle(rightmasseterfront, 0.0F, 0.1698F, -0.0213F);
        this.rightmasseterfront.cubeList.add(new ModelBox(rightmasseterfront, 133, 19, 0.0F, -2.0F, -4.0F, 0, 3, 5, 0.0F, false));

        this.leftmasseterback = new AdvancedModelRenderer(this);
        this.leftmasseterback.setRotationPoint(-1.45F, -0.3F, -4.0F);
        this.lowerjawback.addChild(leftmasseterback);
        this.setRotateAngle(leftmasseterback, -0.3183F, 0.0637F, 0.1485F);
        this.leftmasseterback.cubeList.add(new ModelBox(leftmasseterback, 90, 11, -1.0F, -4.0F, 0.0F, 3, 4, 4, 0.0F, false));

        this.rightmasseterback = new AdvancedModelRenderer(this);
        this.rightmasseterback.setRotationPoint(1.45F, -0.3F, -4.0F);
        this.lowerjawback.addChild(rightmasseterback);
        this.setRotateAngle(rightmasseterback, -0.3183F, -0.0637F, -0.1485F);
        this.rightmasseterback.cubeList.add(new ModelBox(rightmasseterback, 105, 8, -2.0F, -4.0F, 0.0F, 3, 4, 4, 0.0F, false));

        this.lefteye = new AdvancedModelRenderer(this);
        this.lefteye.setRotationPoint(1.57F, -0.25F, -2.9F);
        this.head.addChild(lefteye);
        this.lefteye.cubeList.add(new ModelBox(lefteye, 13, 0, -0.5F, -0.5F, -0.5F, 1, 1, 1, 0.0F, false));

        this.righteye = new AdvancedModelRenderer(this);
        this.righteye.setRotationPoint(-1.53F, -0.25F, -2.9F);
        this.head.addChild(righteye);
        this.righteye.cubeList.add(new ModelBox(righteye, 8, 0, -0.5F, -0.5F, -0.5F, 1, 1, 1, 0.0F, false));

        this.leftcheekflair = new AdvancedModelRenderer(this);
        this.leftcheekflair.setRotationPoint(-2.5F, 3.5F, -1.99F);
        this.head.addChild(leftcheekflair);
        this.setRotateAngle(leftcheekflair, 0.0F, 0.0F, 0.1698F);
        this.leftcheekflair.cubeList.add(new ModelBox(leftcheekflair, 91, 19, 0.0F, -3.0F, -2.5F, 1, 3, 5, 0.0F, false));

        this.rightcheekflair = new AdvancedModelRenderer(this);
        this.rightcheekflair.setRotationPoint(2.5F, 3.5F, -1.99F);
        this.head.addChild(rightcheekflair);
        this.setRotateAngle(rightcheekflair, 0.0F, 0.0F, -0.1698F);
        this.rightcheekflair.cubeList.add(new ModelBox(rightcheekflair, 100, 16, -1.0F, -3.0F, -2.5F, 1, 3, 5, 0.0F, false));

        this.upperjawbase = new AdvancedModelRenderer(this);
        this.upperjawbase.setRotationPoint(0.01F, 2.55F, -4.1F);
        this.head.addChild(upperjawbase);
        this.setRotateAngle(upperjawbase, -0.1485F, 0.0F, 0.0F);
        this.upperjawbase.cubeList.add(new ModelBox(upperjawbase, 43, 9, -2.0F, -3.0F, -2.0F, 4, 4, 2, 0.0F, false));

        this.upperjawmiddlebase = new AdvancedModelRenderer(this);
        this.upperjawmiddlebase.setRotationPoint(-0.03F, -0.04F, -2.0F);
        this.upperjawbase.addChild(upperjawmiddlebase);
        this.setRotateAngle(upperjawmiddlebase, 0.2335F, 0.0F, 0.0F);
        this.upperjawmiddlebase.cubeList.add(new ModelBox(upperjawmiddlebase, 30, 5, -1.5F, -1.0F, -2.2F, 3, 2, 3, 0.0F, false));

        this.upperjawmiddlefront = new AdvancedModelRenderer(this);
        this.upperjawmiddlefront.setRotationPoint(0.01F, 1.0F, -2.0F);
        this.upperjawmiddlebase.addChild(upperjawmiddlefront);
        this.setRotateAngle(upperjawmiddlefront, 0.3821F, 0.0F, 0.0F);
        this.upperjawmiddlefront.cubeList.add(new ModelBox(upperjawmiddlefront, 118, 0, -1.5F, -1.0F, -3.0F, 3, 1, 4, 0.0F, false));

        this.upperbeakstart = new AdvancedModelRenderer(this);
        this.upperbeakstart.setRotationPoint(0.0F, -1.0F, -2.15F);
        this.upperjawmiddlefront.addChild(upperbeakstart);
        this.setRotateAngle(upperbeakstart, 0.3821F, 0.0F, 0.0F);
        this.upperbeakstart.cubeList.add(new ModelBox(upperbeakstart, 116, 7, -2.0F, 0.0F, -2.0F, 4, 1, 2, 0.0F, false));

        this.upperbeak = new AdvancedModelRenderer(this);
        this.upperbeak.setRotationPoint(-0.01F, 1.0F, -2.0F);
        this.upperbeakstart.addChild(upperbeak);
        this.setRotateAngle(upperbeak, -0.743F, 0.0F, 0.0F);
        this.upperbeak.cubeList.add(new ModelBox(upperbeak, 120, 11, -2.0F, -1.0F, -2.0F, 4, 1, 2, 0.0F, false));

        this.upperbeakbridge = new AdvancedModelRenderer(this);
        this.upperbeakbridge.setRotationPoint(0.0F, -1.0F, -2.0F);
        this.upperbeak.addChild(upperbeakbridge);
        this.setRotateAngle(upperbeakbridge, 0.7837F, 0.0F, 0.0F);
        this.upperbeakbridge.cubeList.add(new ModelBox(upperbeakbridge, 129, 6, -1.0F, 0.0F, 0.0F, 2, 2, 2, 0.0F, false));

        this.upperbeakextra = new AdvancedModelRenderer(this);
        this.upperbeakextra.setRotationPoint(0.0F, -0.5F, -1.0F);
        this.upperbeak.addChild(upperbeakextra);
        this.upperbeakextra.cubeList.add(new ModelBox(upperbeakextra, 129, 0, -2.0F, 0.0F, -1.0F, 4, 1, 2, 0.0F, false));

        this.rightnasalsac = new AdvancedModelRenderer(this);
        this.rightnasalsac.setRotationPoint(-0.9F, -0.9F, -2.1F);
        this.upperjawmiddlefront.addChild(rightnasalsac);
        this.setRotateAngle(rightnasalsac, 0.1698F, 0.0848F, 0.0F);
        this.rightnasalsac.cubeList.add(new ModelBox(rightnasalsac, 149, 0, -0.5F, -0.5F, -2.0F, 2, 1, 4, 0.0F, false));

        this.leftnasalsac = new AdvancedModelRenderer(this);
        this.leftnasalsac.setRotationPoint(0.9F, -0.9F, -2.1F);
        this.upperjawmiddlefront.addChild(leftnasalsac);
        this.setRotateAngle(leftnasalsac, 0.1698F, -0.0848F, 0.0F);
        this.leftnasalsac.cubeList.add(new ModelBox(leftnasalsac, 140, 4, -1.5F, -0.5F, -2.0F, 2, 1, 4, 0.0F, false));

        this.upperjawmidfrontslope = new AdvancedModelRenderer(this);
        this.upperjawmidfrontslope.setRotationPoint(0.02F, -1.0F, -1.2F);
        this.upperjawmiddlefront.addChild(upperjawmidfrontslope);
        this.setRotateAngle(upperjawmidfrontslope, 0.4845F, 0.0F, 0.0F);
        this.upperjawmidfrontslope.cubeList.add(new ModelBox(upperjawmidfrontslope, 142, 0, -1.5F, 0.0F, 0.0F, 3, 1, 2, 0.0F, false));

        this.upperjawmiddleslope = new AdvancedModelRenderer(this);
        this.upperjawmiddleslope.setRotationPoint(-0.01F, -1.0F, -2.2F);
        this.upperjawmiddlebase.addChild(upperjawmiddleslope);
        this.setRotateAngle(upperjawmiddleslope, 0.5943F, 0.0F, 0.0F);
        this.upperjawmiddleslope.cubeList.add(new ModelBox(upperjawmiddleslope, 101, 0, -1.5F, 0.0F, 0.0F, 3, 2, 5, 0.0F, false));

        this.leftupperteeth = new AdvancedModelRenderer(this);
        this.leftupperteeth.setRotationPoint(-1.0F, 0.2F, 0.3F);
        this.upperjawbase.addChild(leftupperteeth);
        this.setRotateAngle(leftupperteeth, 0.0848F, -0.0424F, 0.0F);
        this.leftupperteeth.cubeList.add(new ModelBox(leftupperteeth, 133, 28, 0.0F, 0.0F, -4.0F, 0, 1, 4, 0.0F, false));

        this.rightupperteeth = new AdvancedModelRenderer(this);
        this.rightupperteeth.setRotationPoint(1.0F, 0.2F, 0.3F);
        this.upperjawbase.addChild(rightupperteeth);
        this.setRotateAngle(rightupperteeth, 0.0848F, 0.0424F, 0.0F);
        this.rightupperteeth.cubeList.add(new ModelBox(rightupperteeth, 133, 30, 0.0F, 0.0F, -4.0F, 0, 1, 4, 0.0F, false));

        this.headslope1 = new AdvancedModelRenderer(this);
        this.headslope1.setRotationPoint(0.0F, -1.5F, -4.3F);
        this.head.addChild(headslope1);
        this.setRotateAngle(headslope1, 0.4458F, 0.0F, 0.0F);
        this.headslope1.cubeList.add(new ModelBox(headslope1, 103, 35, -1.5F, 0.0F, -2.0F, 3, 3, 2, 0.0F, false));

        this.headslope2 = new AdvancedModelRenderer(this);
        this.headslope2.setRotationPoint(0.0F, 0.0F, -2.0F);
        this.headslope1.addChild(headslope2);
        this.setRotateAngle(headslope2, 0.1698F, 0.0F, 0.0F);
        this.headslope2.cubeList.add(new ModelBox(headslope2, 79, 21, -1.0F, 0.0F, -7.0F, 2, 2, 7, 0.0F, false));

        this.crestbase = new AdvancedModelRenderer(this);
        this.crestbase.setRotationPoint(0.01F, 0.0F, -1.2F);
        this.headslope2.addChild(crestbase);
        this.setRotateAngle(crestbase, 0.3609F, 0.0F, 0.0F);
        this.crestbase.cubeList.add(new ModelBox(crestbase, 107, 18, -0.5F, 0.0F, 0.0F, 1, 3, 7, 0.0F, false));

        this.crest1 = new AdvancedModelRenderer(this);
        this.crest1.setRotationPoint(-0.01F, 0.1F, 6.3F);
        this.crestbase.addChild(crest1);
        this.setRotateAngle(crest1, 0.2972F, 0.0F, 0.0F);
        this.crest1.cubeList.add(new ModelBox(crest1, 117, 15, -0.5F, 0.0F, -1.3F, 1, 2, 4, 0.0F, false));

        this.crest2 = new AdvancedModelRenderer(this);
        this.crest2.setRotationPoint(0.0F, 2.0F, -1.0F);
        this.crest1.addChild(crest2);
        this.crest2.cubeList.add(new ModelBox(crest2, 98, 25, -0.5F, 0.0F, 0.0F, 1, 3, 6, 0.0F, false));

        this.crest3 = new AdvancedModelRenderer(this);
        this.crest3.setRotationPoint(-0.01F, -0.1F, 2.8F);
        this.crest1.addChild(crest3);
        this.setRotateAngle(crest3, 0.3183F, 0.0F, 0.0F);
        this.crest3.cubeList.add(new ModelBox(crest3, 129, 11, -0.5F, 0.0F, -2.0F, 1, 4, 4, 0.0F, false));

        this.crest4 = new AdvancedModelRenderer(this);
        this.crest4.setRotationPoint(0.01F, 3.0F, 4.5F);
        this.crestbase.addChild(crest4);
        this.setRotateAngle(crest4, -0.7854F, 0.0F, 0.0F);
        this.crest4.cubeList.add(new ModelBox(crest4, 140, 10, -0.5F, -2.0F, 0.0F, 1, 2, 4, 0.0F, false));

        this.crest5 = new AdvancedModelRenderer(this);
        this.crest5.setRotationPoint(0.01F, 0.0F, 3.4F);
        this.crest4.addChild(crest5);
        this.setRotateAngle(crest5, -0.2546F, 0.0F, 0.0F);
        this.crest5.cubeList.add(new ModelBox(crest5, 113, 29, -0.5F, -2.0F, 0.0F, 1, 3, 1, 0.0F, false));

        this.crest6 = new AdvancedModelRenderer(this);
        this.crest6.setRotationPoint(0.01F, -1.6F, 0.0F);
        this.crest5.addChild(crest6);
        this.setRotateAngle(crest6, -0.2759F, 0.0F, 0.0F);
        this.crest6.cubeList.add(new ModelBox(crest6, 126, 20, -0.5F, -3.5F, -1.0F, 1, 4, 2, 0.0F, false));

        this.crest7 = new AdvancedModelRenderer(this);
        this.crest7.setRotationPoint(-0.01F, -3.5F, 1.0F);
        this.crest6.addChild(crest7);
        this.setRotateAngle(crest7, 0.5519F, 0.0F, 0.0F);
        this.crest7.cubeList.add(new ModelBox(crest7, 118, 28, -0.5F, -2.0F, -2.0F, 1, 2, 2, 0.0F, false));

        this.crest8 = new AdvancedModelRenderer(this);
        this.crest8.setRotationPoint(-0.01F, -2.0F, 0.0F);
        this.crest7.addChild(crest8);
        this.setRotateAngle(crest8, 0.9765F, 0.0F, 0.0F);
        this.crest8.cubeList.add(new ModelBox(crest8, 125, 27, -0.5F, -2.0F, -2.0F, 1, 2, 2, 0.0F, false));

        this.neck3ridge = new AdvancedModelRenderer(this);
        this.neck3ridge.setRotationPoint(0.0F, -1.7F, 0.0F);
        this.neck3.addChild(neck3ridge);
        this.setRotateAngle(neck3ridge, 0.0637F, 0.0F, 0.0F);
        this.neck3ridge.cubeList.add(new ModelBox(neck3ridge, 44, 29, -1.5F, -3.0F, -9.5F, 3, 3, 10, 0.0F, false));

        this.neck3dorsalscales = new AdvancedModelRenderer(this);
        this.neck3dorsalscales.setRotationPoint(0.0F, -3.0F, -0.5F);
        this.neck3ridge.addChild(neck3dorsalscales);
        this.setRotateAngle(neck3dorsalscales, 0.0637F, 0.0F, 0.0F);
        this.neck3dorsalscales.cubeList.add(new ModelBox(neck3dorsalscales, 37, 10, 0.0F, -1.0F, -9.0F, 0, 1, 9, 0.0F, false));

        this.neck3slope = new AdvancedModelRenderer(this);
        this.neck3slope.setRotationPoint(0.01F, 4.5F, 0.5F);
        this.neck3.addChild(neck3slope);
        this.setRotateAngle(neck3slope, 0.2122F, 0.0F, 0.0F);
        this.neck3slope.cubeList.add(new ModelBox(neck3slope, 99, 42, -2.0F, -4.0F, 0.0F, 4, 4, 4, 0.0F, false));

        this.neck2ridge = new AdvancedModelRenderer(this);
        this.neck2ridge.setRotationPoint(-0.01F, -2.7F, 0.3F);
        this.neck2.addChild(neck2ridge);
        this.setRotateAngle(neck2ridge, 0.2122F, 0.0F, 0.0F);
        this.neck2ridge.cubeList.add(new ModelBox(neck2ridge, 61, 25, -2.0F, -3.5F, -7.0F, 4, 4, 9, 0.0F, false));

        this.neckcollapsableflesh = new AdvancedModelRenderer(this);
        this.neckcollapsableflesh.setRotationPoint(-0.01F, -3.5F, -7.0F);
        this.neck2ridge.addChild(neckcollapsableflesh);
        this.setRotateAngle(neckcollapsableflesh, 0.3396F, 0.0F, 0.0F);
        this.neckcollapsableflesh.cubeList.add(new ModelBox(neckcollapsableflesh, 47, 12, -2.0F, 0.0F, 0.0F, 4, 3, 9, 0.0F, false));

        this.neck2dorsalscales2 = new AdvancedModelRenderer(this);
        this.neck2dorsalscales2.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.neckcollapsableflesh.addChild(neck2dorsalscales2);
        this.neck2dorsalscales2.cubeList.add(new ModelBox(neck2dorsalscales2, 37, 8, 0.0F, -1.0F, 0.0F, 0, 1, 9, 0.0F, false));

        this.neck2dorsalscales1 = new AdvancedModelRenderer(this);
        this.neck2dorsalscales1.setRotationPoint(0.0F, -3.5F, -2.5F);
        this.neck2ridge.addChild(neck2dorsalscales1);
        this.neck2dorsalscales1.cubeList.add(new ModelBox(neck2dorsalscales1, 24, 7, 0.0F, -1.0F, -4.5F, 0, 1, 9, 0.0F, false));

        this.neck2slope = new AdvancedModelRenderer(this);
        this.neck2slope.setRotationPoint(-0.01F, 6.5F, 1.5F);
        this.neck2.addChild(neck2slope);
        this.setRotateAngle(neck2slope, 0.4458F, 0.0F, 0.0F);
        this.neck2slope.cubeList.add(new ModelBox(neck2slope, 84, 35, -2.5F, -6.0F, 0.0F, 5, 6, 4, 0.0F, false));

        this.neck1ridge = new AdvancedModelRenderer(this);
        this.neck1ridge.setRotationPoint(0.01F, -2.8F, 0.0F);
        this.neck1.addChild(neck1ridge);
        this.setRotateAngle(neck1ridge, 0.1485F, 0.0F, 0.0F);
        this.neck1ridge.cubeList.add(new ModelBox(neck1ridge, 65, 7, -2.0F, -4.0F, -5.5F, 4, 5, 8, 0.0F, false));

        this.neck1dorsalscales = new AdvancedModelRenderer(this);
        this.neck1dorsalscales.setRotationPoint(0.01F, -4.0F, -5.5F);
        this.neck1ridge.addChild(neck1dorsalscales);
        this.neck1dorsalscales.cubeList.add(new ModelBox(neck1dorsalscales, 15, 1, 0.0F, -1.0F, 0.0F, 0, 1, 7, 0.0F, false));

        this.neck1slope = new AdvancedModelRenderer(this);
        this.neck1slope.setRotationPoint(0.01F, 7.5F, 2.0F);
        this.neck1.addChild(neck1slope);
        this.setRotateAngle(neck1slope, 0.3821F, 0.0F, 0.0F);
        this.neck1slope.cubeList.add(new ModelBox(neck1slope, 48, 42, -3.5F, -6.0F, 0.0F, 7, 6, 4, 0.0F, false));

        this.rightArm = new AdvancedModelRenderer(this);
        this.rightArm.setRotationPoint(-4.5F, 10.65F, -12.8F);
        this.chest.addChild(rightArm);
        this.setRotateAngle(rightArm, 0.0637F, 0.0637F, 0.1274F);
        this.rightArm.cubeList.add(new ModelBox(rightArm, 124, 83, -3.5F, -1.5F, -3.5F, 4, 11, 7, 0.0F, false));

        this.rightArm2 = new AdvancedModelRenderer(this);
        this.rightArm2.setRotationPoint(-1.3F, 8.5F, 2.0F);
        this.rightArm.addChild(rightArm2);
        this.setRotateAngle(rightArm2, -0.7641F, -0.1061F, -0.2546F);
        this.rightArm2.cubeList.add(new ModelBox(rightArm2, 157, 167, -1.5F, -0.5F, -3.0F, 3, 14, 4, 0.0F, false));

        this.rightArm3 = new AdvancedModelRenderer(this);
        this.rightArm3.setRotationPoint(0.0F, 12.7F, -2.1F);
        this.rightArm2.addChild(rightArm3);
        this.setRotateAngle(rightArm3, 0.0424F, 0.1061F, 0.1274F);
        this.rightArm3.cubeList.add(new ModelBox(rightArm3, 187, 155, -1.5F, 0.0F, -0.5F, 3, 8, 3, 0.0F, false));

        this.rightArm4 = new AdvancedModelRenderer(this);
        this.rightArm4.setRotationPoint(-1.7F, 1.0F, 1.0F);
        this.rightArm3.addChild(rightArm4);
        this.setRotateAngle(rightArm4, 0.1274F, 0.0F, 0.2759F);
        this.rightArm4.cubeList.add(new ModelBox(rightArm4, 173, 174, 0.0F, -1.0F, -0.5F, 1, 5, 1, 0.0F, false));

        this.righthoof = new AdvancedModelRenderer(this);
        this.righthoof.setRotationPoint(0.0F, 7.85F, -0.6F);
        this.rightArm3.addChild(righthoof);
        this.setRotateAngle(righthoof, -0.1061F, 0.0F, 0.0F);
        this.righthoof.cubeList.add(new ModelBox(righthoof, 184, 179, -1.0F, -1.0F, 0.0F, 2, 1, 1, 0.0F, false));

        this.rightinnerfinger = new AdvancedModelRenderer(this);
        this.rightinnerfinger.setRotationPoint(1.5F, 2.3F, 0.9F);
        this.rightArm3.addChild(rightinnerfinger);
        this.setRotateAngle(rightinnerfinger, 0.1274F, 0.0F, -0.1274F);
        this.rightinnerfinger.cubeList.add(new ModelBox(rightinnerfinger, 178, 174, -1.0F, 0.0F, -0.5F, 1, 5, 1, 0.0F, false));

        this.leftArm = new AdvancedModelRenderer(this);
        this.leftArm.setRotationPoint(4.5F, 10.65F, -12.8F);
        this.chest.addChild(leftArm);
        this.setRotateAngle(leftArm, 0.0637F, -0.0637F, -0.1274F);
        this.leftArm.cubeList.add(new ModelBox(leftArm, 140, 95, -0.5F, -1.5F, -3.5F, 4, 11, 7, 0.0F, false));

        this.leftArm2 = new AdvancedModelRenderer(this);
        this.leftArm2.setRotationPoint(1.3F, 8.5F, 2.0F);
        this.leftArm.addChild(leftArm2);
        this.setRotateAngle(leftArm2, -0.7641F, 0.1061F, 0.2546F);
        this.leftArm2.cubeList.add(new ModelBox(leftArm2, 172, 155, -1.5F, -0.5F, -3.0F, 3, 14, 4, 0.0F, false));

        this.leftArm3 = new AdvancedModelRenderer(this);
        this.leftArm3.setRotationPoint(0.0F, 12.7F, -2.1F);
        this.leftArm2.addChild(leftArm3);
        this.setRotateAngle(leftArm3, 0.0424F, -0.1061F, -0.1274F);
        this.leftArm3.cubeList.add(new ModelBox(leftArm3, 187, 167, -1.5F, 0.0F, -0.5F, 3, 8, 3, 0.0F, false));

        this.leftArm4 = new AdvancedModelRenderer(this);
        this.leftArm4.setRotationPoint(1.7F, 1.0F, 1.0F);
        this.leftArm3.addChild(leftArm4);
        this.setRotateAngle(leftArm4, 0.1274F, 0.0F, -0.2759F);
        this.leftArm4.cubeList.add(new ModelBox(leftArm4, 175, 181, -1.0F, -1.0F, -0.5F, 1, 5, 1, 0.0F, false));

        this.lefthoof = new AdvancedModelRenderer(this);
        this.lefthoof.setRotationPoint(0.0F, 7.85F, -0.6F);
        this.leftArm3.addChild(lefthoof);
        this.setRotateAngle(lefthoof, -0.1061F, 0.0F, 0.0F);
        this.lefthoof.cubeList.add(new ModelBox(lefthoof, 191, 179, -1.0F, -1.0F, 0.0F, 2, 1, 1, 0.0F, false));

        this.leftinnerfinger = new AdvancedModelRenderer(this);
        this.leftinnerfinger.setRotationPoint(-1.5F, 2.3F, 0.9F);
        this.leftArm3.addChild(leftinnerfinger);
        this.setRotateAngle(leftinnerfinger, 0.1274F, 0.0F, 0.1274F);
        this.leftinnerfinger.cubeList.add(new ModelBox(leftinnerfinger, 180, 181, 0.0F, 0.0F, -0.5F, 1, 5, 1, 0.0F, false));

        this.bodymiddleridge = new AdvancedModelRenderer(this);
        this.bodymiddleridge.setRotationPoint(-0.01F, 0.0F, 0.5F);
        this.body.addChild(bodymiddleridge);
        this.setRotateAngle(bodymiddleridge, -0.0424F, 0.0F, 0.0F);
        this.bodymiddleridge.cubeList.add(new ModelBox(bodymiddleridge, 45, 103, -3.0F, -6.0F, -16.0F, 6, 6, 16, 0.0F, false));

        this.bodymiddorsalscales = new AdvancedModelRenderer(this);
        this.bodymiddorsalscales.setRotationPoint(0.0F, -6.3F, -8.45F);
        this.bodymiddleridge.addChild(bodymiddorsalscales);
        this.setRotateAngle(bodymiddorsalscales, 0.0424F, 0.0F, 0.0F);
        this.bodymiddorsalscales.cubeList.add(new ModelBox(bodymiddorsalscales, 0, 5, 0.0F, -1.0F, -7.5F, 0, 2, 15, 0.0F, false));

        this.hipridge1 = new AdvancedModelRenderer(this);
        this.hipridge1.setRotationPoint(0.0F, -2.0F, -12.0F);
        this.hips.addChild(hipridge1);
        this.setRotateAngle(hipridge1, 0.1485F, 0.0F, 0.0F);
        this.hipridge1.cubeList.add(new ModelBox(hipridge1, 44, 53, -3.0F, -6.0F, 0.0F, 6, 7, 9, 0.0F, false));

        this.hipridge2 = new AdvancedModelRenderer(this);
        this.hipridge2.setRotationPoint(-0.01F, -6.0F, 9.0F);
        this.hipridge1.addChild(hipridge2);
        this.setRotateAngle(hipridge2, -0.1911F, 0.0F, 0.0F);
        this.hipridge2.cubeList.add(new ModelBox(hipridge2, 147, 128, -3.0F, 0.0F, 0.0F, 6, 7, 19, 0.0F, false));

        this.hipdorsalscales2 = new AdvancedModelRenderer(this);
        this.hipdorsalscales2.setRotationPoint(0.0F, -0.5F, 1.4F);
        this.hipridge2.addChild(hipdorsalscales2);
        this.setRotateAngle(hipdorsalscales2, -0.0213F, 0.0F, 0.0F);
        this.hipdorsalscales2.cubeList.add(new ModelBox(hipdorsalscales2, 0, 9, 0.0F, -1.0F, 0.0F, 0, 2, 17, 0.0F, false));

        this.hipdorsalscales1 = new AdvancedModelRenderer(this);
        this.hipdorsalscales1.setRotationPoint(0.0F, -6.5F, 2.8F);
        this.hipridge1.addChild(hipdorsalscales1);
        this.setRotateAngle(hipdorsalscales1, -0.0213F, 0.0F, 0.0F);
        this.hipdorsalscales1.cubeList.add(new ModelBox(hipdorsalscales1, 0, 2, 0.0F, -1.0F, 0.0F, 0, 2, 7, 0.0F, false));

        this.gutslope = new AdvancedModelRenderer(this);
        this.gutslope.setRotationPoint(0.01F, 18.5F, -11.5F);
        this.hips.addChild(gutslope);
        this.setRotateAngle(gutslope, 0.1485F, 0.0F, 0.0F);
        this.gutslope.cubeList.add(new ModelBox(gutslope, 89, 112, -6.0F, 0.0F, 0.0F, 12, 3, 21, 0.0F, false));

        this.rightLeg = new AdvancedModelRenderer(this);
        this.rightLeg.setRotationPoint(-5.5F, 2.57F, -1.5F);
        this.hips.addChild(rightLeg);
        this.setRotateAngle(rightLeg, -0.0213F, 0.0F, 0.0F);
        this.rightLeg.cubeList.add(new ModelBox(rightLeg, 77, 164, -3.7F, -3.5F, -8.0F, 5, 20, 16, 0.0F, false));

        this.rightLeg2 = new AdvancedModelRenderer(this);
        this.rightLeg2.setRotationPoint(-1.5F, 15.5F, -6.5F);
        this.rightLeg.addChild(rightLeg2);
        this.setRotateAngle(rightLeg2, 0.3183F, 0.0F, 0.0F);
        this.rightLeg2.cubeList.add(new ModelBox(rightLeg2, 74, 90, -2.0F, -0.5F, -0.5F, 4, 20, 8, 0.0F, false));

        this.rightLeg3 = new AdvancedModelRenderer(this);
        this.rightLeg3.setRotationPoint(0.0F, 19.0F, 5.0F);
        this.rightLeg2.addChild(rightLeg3);
        this.setRotateAngle(rightLeg3, -0.7854F, 0.0F, 0.0F);
        this.rightLeg3.cubeList.add(new ModelBox(rightLeg3, 0, 85, -1.5F, -0.5F, -3.5F, 3, 8, 4, 0.0F, false));

        this.rightLeg4 = new AdvancedModelRenderer(this);
        this.rightLeg4.setRotationPoint(0.0F, 6.8F, -1.0F);
        this.rightLeg3.addChild(rightLeg4);
        this.setRotateAngle(rightLeg4, 0.4033F, 0.0F, 0.0F);
        this.rightLeg4.cubeList.add(new ModelBox(rightLeg4, 70, 163, -2.0F, -0.5F, -3.5F, 4, 2, 5, 0.0F, false));

        this.rightLeg5 = new AdvancedModelRenderer(this);
        this.rightLeg5.setRotationPoint(0.0F, 0.49F, -2.8F);
        this.rightLeg4.addChild(rightLeg5);
        this.rightLeg5.cubeList.add(new ModelBox(rightLeg5, 51, 163, -2.5F, -1.0F, -4.0F, 5, 2, 4, 0.0F, false));

        this.leftLeg = new AdvancedModelRenderer(this);
        this.leftLeg.setRotationPoint(5.5F, 2.57F, -1.55F);
        this.hips.addChild(leftLeg);
        this.setRotateAngle(leftLeg, -0.0213F, 0.0F, 0.0F);
        this.leftLeg.cubeList.add(new ModelBox(leftLeg, 61, 126, -1.3F, -3.5F, -8.0F, 5, 20, 16, 0.0F, false));

        this.leftLeg2 = new AdvancedModelRenderer(this);
        this.leftLeg2.setRotationPoint(1.5F, 15.5F, -6.5F);
        this.leftLeg.addChild(leftLeg2);
        this.setRotateAngle(leftLeg2, 0.3183F, 0.0F, 0.0F);
        this.leftLeg2.cubeList.add(new ModelBox(leftLeg2, 99, 83, -2.0F, -0.5F, -0.5F, 4, 20, 8, 0.0F, false));

        this.leftLeg3 = new AdvancedModelRenderer(this);
        this.leftLeg3.setRotationPoint(0.0F, 19.0F, 5.0F);
        this.leftLeg2.addChild(leftLeg3);
        this.setRotateAngle(leftLeg3, -0.7854F, 0.0F, 0.0F);
        this.leftLeg3.cubeList.add(new ModelBox(leftLeg3, 0, 110, -1.5F, -0.5F, -3.5F, 3, 8, 4, 0.0F, false));

        this.leftLeg4 = new AdvancedModelRenderer(this);
        this.leftLeg4.setRotationPoint(0.0F, 6.8F, -1.0F);
        this.leftLeg3.addChild(leftLeg4);
        this.setRotateAngle(leftLeg4, 0.4033F, 0.0F, 0.0F);
        this.leftLeg4.cubeList.add(new ModelBox(leftLeg4, 0, 152, -2.0F, -0.5F, -3.5F, 4, 2, 5, 0.0F, false));

        this.leftLeg5 = new AdvancedModelRenderer(this);
        this.leftLeg5.setRotationPoint(0.0F, 0.49F, -2.8F);
        this.leftLeg4.addChild(leftLeg5);
        this.leftLeg5.cubeList.add(new ModelBox(leftLeg5, 0, 160, -2.5F, -1.0F, -4.0F, 5, 2, 4, 0.0F, false));

        updateDefaultPose();
        animator = ModelAnimator.create();
    }

    @Override
    public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        animate((IAnimatedEntity) entity, f, f1, f2, f3, f4, f5);
        this.hips.offsetZ = 0.7F;
        this.hips.render(f5);
    }

    @Override
    public void renderStaticBook(float f) {
        //Rotations, positions and sizing:
        this.hips.offsetY = 0.9F;
        this.hips.offsetX = -0.2F;
        this.hips.rotateAngleY = (float)Math.toRadians(125);
        this.hips.rotateAngleX = (float)Math.toRadians(0);
        this.hips.rotateAngleZ = (float)Math.toRadians(0);
        this.hips.scaleChildren = true;
        float scaler = 0.37F;
        this.hips.setScale(scaler, scaler, scaler);
        //Start of pose:
       
        //End of pose, now render the model:
        this.hips.render(f);
        //Reset rotations, positions and sizing:
        this.hips.setScale(1.0F, 1.0F, 1.0F);
        this.hips.scaleChildren = false;
        resetToDefaultPose();
    }

    public void renderStaticWall(float f) {
        resetToDefaultPose();
    }

    public void renderStaticFloor(float f) {
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

        EntityPrehistoricFloraOlorotitan entityOlorotitan = (EntityPrehistoricFloraOlorotitan) e;

        this.faceTarget(f3, f4, 10, neck3);
        this.faceTarget(f3, f4, 10, neck2);
        this.faceTarget(f3, f4, 10, neck1);
        this.faceTarget(f3, f4, 10, head);

        AdvancedModelRenderer[] Tail = {this.tail1, this.tail2, this.tail3, this.tail4, this.tail5};
        AdvancedModelRenderer[] Neck = {this.neck3, this.neck2, this.neck1, this.head};
//        AdvancedModelRenderer[] ArmL = {this.leftArm, this.leftArm2, this.leftArm3};
//        AdvancedModelRenderer[] ArmR = {this.rightArm, this.rightArm2, this.rightArm3};

        entityOlorotitan.tailBuffer.applyChainSwingBuffer(Tail);

        if (entityOlorotitan.getAnimation() == entityOlorotitan.LAY_ANIMATION) {
            this.chainSwing(Neck, 0.5F, 0.10F, 0.5, f2, 0.8F);
            this.chainWave(Neck, 0.5F * 2, -0.02F, 0.5F, f2, 0.8F);
        }
        else {
            if (!entityOlorotitan.isReallyInWater()) {

                if (f3 == 0.0F || !entityOlorotitan.getIsMoving()) {
                    if (entityOlorotitan.getAnimation() != entityOlorotitan.EAT_ANIMATION
                        && (!entityOlorotitan.isAnimationDirectionLocked(entityOlorotitan.getAnimation()))) {
                        this.chainSwing(Neck, 0.05F, 0.10F, 0.5, f2, 0.8F);
                        this.chainWave(Neck, 0.05F * 2, -0.02F, 0.5F, f2, 0.8F);
                    }

                    this.chainWave(Tail, (0.15F * 0.35F), 0.125F * 0.15F, 0.2F, f2, 1F);
                    this.chainSwing(Tail, (0.15F * 0.35F) * 4F, 0.05F * 0.35F, 0.12F, f2, 1F);
                    if (entityOlorotitan.getAnimation() == entityOlorotitan.NO_ANIMATION) {
                        
                    }

                    return;
                }

                if (entityOlorotitan.getIsFast()) { //Running


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
        EntityPrehistoricFloraOlorotitan ee = (EntityPrehistoricFloraOlorotitan) entitylivingbaseIn;

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
        else if (ee.getAnimation() == ee.MAKE_NEST_ANIMATION) {
            animNest(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime, ee.getAnimationTick());
        }
        else if (ee.getAnimation() == ee.LAY_ANIMATION) {
            animLay(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime, ee.getAnimationTick());
        }
        else if (ee.getAnimation() == ee.DRINK_ANIMATION) { //The graze anim
            animGraze(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime, ee.getAnimationTick());
        }
        else if (ee.getAnimation() == ee.ROAR_ANIMATION) { //The noise anim
            animNoise(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime, ee.getAnimationTick());
        }
        else if (ee.getAnimation() == ee.STAND_ANIMATION) { //The noise anim
            animRelax(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime, ee.getAnimationTick());
        }
        else if (ee.getAnimation() == ee.GRAPPLE_ANIMATION) { //The noise anim
            animDisplay(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime, ee.getAnimationTick());
        }

    }

    public void animLay(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime, double animTick) {
        EntityPrehistoricFloraOlorotitan entity = (EntityPrehistoricFloraOlorotitan) entitylivingbaseIn;
        int animCycle = 50;
        double tickAnim = animTick + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;
         if (tickAnim >= 0 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 0) / 20) * (-13.25-(0)));
            yy = 0 + (((tickAnim - 0) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 20) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 30) {
            xx = -13.25 + (((tickAnim - 20) / 10) * (-13.25-(-13.25)));
            yy = 0 + (((tickAnim - 20) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 10) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 50) {
            xx = -13.25 + (((tickAnim - 30) / 20) * (0-(-13.25)));
            yy = 0 + (((tickAnim - 30) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 30) / 20) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(hips, hips.rotateAngleX + (float) Math.toRadians(xx), hips.rotateAngleY + (float) Math.toRadians(yy), hips.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 0) / 20) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 20) * (-11.525-(0)));
            zz = 0 + (((tickAnim - 0) / 20) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 30) {
            xx = 0 + (((tickAnim - 20) / 10) * (0-(0)));
            yy = -11.525 + (((tickAnim - 20) / 10) * (-11.525-(-11.525)));
            zz = 0 + (((tickAnim - 20) / 10) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 30) / 20) * (0-(0)));
            yy = -11.525 + (((tickAnim - 30) / 20) * (0-(-11.525)));
            zz = 0 + (((tickAnim - 30) / 20) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.hips.rotationPointX = this.hips.rotationPointX + (float)(xx);
        this.hips.rotationPointY = this.hips.rotationPointY - (float)(yy);
        this.hips.rotationPointZ = this.hips.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 11) {
            xx = 0 + (((tickAnim - 0) / 11) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 11) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 11) * (0-(0)));
        }
        else if (tickAnim >= 11 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 11) / 9) * (-5.62272-(0)));
            yy = 0 + (((tickAnim - 11) / 9) * (0.92587-(0)));
            zz = 0 + (((tickAnim - 11) / 9) * (0.10883-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 30) {
            xx = -5.62272 + (((tickAnim - 20) / 10) * (-5.62272-(-5.62272)));
            yy = 0.92587 + (((tickAnim - 20) / 10) * (0.92587-(0.92587)));
            zz = 0.10883 + (((tickAnim - 20) / 10) * (0.10883-(0.10883)));
        }
        else if (tickAnim >= 30 && tickAnim < 50) {
            xx = -5.62272 + (((tickAnim - 30) / 20) * (0-(-5.62272)));
            yy = 0.92587 + (((tickAnim - 30) / 20) * (0-(0.92587)));
            zz = 0.10883 + (((tickAnim - 30) / 20) * (0-(0.10883)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tail1, tail1.rotateAngleX + (float) Math.toRadians(xx), tail1.rotateAngleY + (float) Math.toRadians(yy), tail1.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 11) {
            xx = 0 + (((tickAnim - 0) / 11) * (-14.75-(0)));
            yy = 0 + (((tickAnim - 0) / 11) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 11) * (0-(0)));
        }
        else if (tickAnim >= 11 && tickAnim < 20) {
            xx = -14.75 + (((tickAnim - 11) / 9) * (-7.75-(-14.75)));
            yy = 0 + (((tickAnim - 11) / 9) * (0-(0)));
            zz = 0 + (((tickAnim - 11) / 9) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 30) {
            xx = -7.75 + (((tickAnim - 20) / 10) * (-7.75-(-7.75)));
            yy = 0 + (((tickAnim - 20) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 10) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 50) {
            xx = -7.75 + (((tickAnim - 30) / 20) * (0-(-7.75)));
            yy = 0 + (((tickAnim - 30) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 30) / 20) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tail2, tail2.rotateAngleX + (float) Math.toRadians(xx), tail2.rotateAngleY + (float) Math.toRadians(yy), tail2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 11) {
            xx = 0 + (((tickAnim - 0) / 11) * (-12.25-(0)));
            yy = 0 + (((tickAnim - 0) / 11) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 11) * (0-(0)));
        }
        else if (tickAnim >= 11 && tickAnim < 20) {
            xx = -12.25 + (((tickAnim - 11) / 9) * (7.25-(-12.25)));
            yy = 0 + (((tickAnim - 11) / 9) * (0-(0)));
            zz = 0 + (((tickAnim - 11) / 9) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 30) {
            xx = 7.25 + (((tickAnim - 20) / 10) * (7.25-(7.25)));
            yy = 0 + (((tickAnim - 20) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 10) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 35) {
            xx = 7.25 + (((tickAnim - 30) / 5) * (-6.5-(7.25)));
            yy = 0 + (((tickAnim - 30) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 30) / 5) * (0-(0)));
        }
        else if (tickAnim >= 35 && tickAnim < 38) {
            xx = -6.5 + (((tickAnim - 35) / 3) * (-12.09-(-6.5)));
            yy = 0 + (((tickAnim - 35) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 35) / 3) * (0-(0)));
        }
        else if (tickAnim >= 38 && tickAnim < 50) {
            xx = -12.09 + (((tickAnim - 38) / 12) * (0-(-12.09)));
            yy = 0 + (((tickAnim - 38) / 12) * (0-(0)));
            zz = 0 + (((tickAnim - 38) / 12) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tail3, tail3.rotateAngleX + (float) Math.toRadians(xx), tail3.rotateAngleY + (float) Math.toRadians(yy), tail3.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 11) {
            xx = 0 + (((tickAnim - 0) / 11) * (-17.25-(0)));
            yy = 0 + (((tickAnim - 0) / 11) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 11) * (0-(0)));
        }
        else if (tickAnim >= 11 && tickAnim < 20) {
            xx = -17.25 + (((tickAnim - 11) / 9) * (11-(-17.25)));
            yy = 0 + (((tickAnim - 11) / 9) * (0-(0)));
            zz = 0 + (((tickAnim - 11) / 9) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 30) {
            xx = 11 + (((tickAnim - 20) / 10) * (11-(11)));
            yy = 0 + (((tickAnim - 20) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 10) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 35) {
            xx = 11 + (((tickAnim - 30) / 5) * (0-(11)));
            yy = 0 + (((tickAnim - 30) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 30) / 5) * (0-(0)));
        }
        else if (tickAnim >= 35 && tickAnim < 38) {
            xx = 0 + (((tickAnim - 35) / 3) * (-12.5-(0)));
            yy = 0 + (((tickAnim - 35) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 35) / 3) * (0-(0)));
        }
        else if (tickAnim >= 38 && tickAnim < 43) {
            xx = -12.5 + (((tickAnim - 38) / 5) * (-14.53-(-12.5)));
            yy = 0 + (((tickAnim - 38) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 38) / 5) * (0-(0)));
        }
        else if (tickAnim >= 43 && tickAnim < 50) {
            xx = -14.53 + (((tickAnim - 43) / 7) * (0-(-14.53)));
            yy = 0 + (((tickAnim - 43) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 43) / 7) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tail4, tail4.rotateAngleX + (float) Math.toRadians(xx), tail4.rotateAngleY + (float) Math.toRadians(yy), tail4.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 11) {
            xx = 0 + (((tickAnim - 0) / 11) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 11) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 11) * (0-(0)));
        }
        else if (tickAnim >= 11 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 11) / 9) * (13-(0)));
            yy = 0 + (((tickAnim - 11) / 9) * (0-(0)));
            zz = 0 + (((tickAnim - 11) / 9) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 30) {
            xx = 13 + (((tickAnim - 20) / 10) * (13-(13)));
            yy = 0 + (((tickAnim - 20) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 10) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 35) {
            xx = 13 + (((tickAnim - 30) / 5) * (0-(13)));
            yy = 0 + (((tickAnim - 30) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 30) / 5) * (0-(0)));
        }
        else if (tickAnim >= 35 && tickAnim < 38) {
            xx = 0 + (((tickAnim - 35) / 3) * (-9.75-(0)));
            yy = 0 + (((tickAnim - 35) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 35) / 3) * (0-(0)));
        }
        else if (tickAnim >= 38 && tickAnim < 43) {
            xx = -9.75 + (((tickAnim - 38) / 5) * (-14.13-(-9.75)));
            yy = 0 + (((tickAnim - 38) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 38) / 5) * (0-(0)));
        }
        else if (tickAnim >= 43 && tickAnim < 50) {
            xx = -14.13 + (((tickAnim - 43) / 7) * (0-(-14.13)));
            yy = 0 + (((tickAnim - 43) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 43) / 7) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tail5, tail5.rotateAngleX + (float) Math.toRadians(xx), tail5.rotateAngleY + (float) Math.toRadians(yy), tail5.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 0) / 20) * (13.5-(0)));
            yy = 0 + (((tickAnim - 0) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 20) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 30) {
            xx = 13.5 + (((tickAnim - 20) / 10) * (13.5-(13.5)));
            yy = 0 + (((tickAnim - 20) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 10) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 50) {
            xx = 13.5 + (((tickAnim - 30) / 20) * (0-(13.5)));
            yy = 0 + (((tickAnim - 30) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 30) / 20) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck3, neck3.rotateAngleX + (float) Math.toRadians(xx), neck3.rotateAngleY + (float) Math.toRadians(yy), neck3.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 0) / 20) * (29-(0)));
            yy = 0 + (((tickAnim - 0) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 20) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 30) {
            xx = 29 + (((tickAnim - 20) / 10) * (29-(29)));
            yy = 0 + (((tickAnim - 20) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 10) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 50) {
            xx = 29 + (((tickAnim - 30) / 20) * (0-(29)));
            yy = 0 + (((tickAnim - 30) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 30) / 20) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightArm, rightArm.rotateAngleX + (float) Math.toRadians(xx), rightArm.rotateAngleY + (float) Math.toRadians(yy), rightArm.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 0) / 20) * (-24.75-(0)));
            yy = 0 + (((tickAnim - 0) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 20) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 30) {
            xx = -24.75 + (((tickAnim - 20) / 10) * (-24.75-(-24.75)));
            yy = 0 + (((tickAnim - 20) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 10) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 50) {
            xx = -24.75 + (((tickAnim - 30) / 20) * (0-(-24.75)));
            yy = 0 + (((tickAnim - 30) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 30) / 20) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightArm2, rightArm2.rotateAngleX + (float) Math.toRadians(xx), rightArm2.rotateAngleY + (float) Math.toRadians(yy), rightArm2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 0) / 20) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 20) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 30) {
            xx = 0 + (((tickAnim - 20) / 10) * (0-(0)));
            yy = 0 + (((tickAnim - 20) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 10) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 30) / 20) * (0-(0)));
            yy = 0 + (((tickAnim - 30) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 30) / 20) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightArm3, rightArm3.rotateAngleX + (float) Math.toRadians(xx), rightArm3.rotateAngleY + (float) Math.toRadians(yy), rightArm3.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 0) / 20) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 20) * (1.65-(0)));
            zz = 0 + (((tickAnim - 0) / 20) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 30) {
            xx = 0 + (((tickAnim - 20) / 10) * (0-(0)));
            yy = 1.65 + (((tickAnim - 20) / 10) * (1.65-(1.65)));
            zz = 0 + (((tickAnim - 20) / 10) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 30) / 20) * (0-(0)));
            yy = 1.65 + (((tickAnim - 30) / 20) * (0-(1.65)));
            zz = 0 + (((tickAnim - 30) / 20) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.rightArm3.rotationPointX = this.rightArm3.rotationPointX + (float)(xx);
        this.rightArm3.rotationPointY = this.rightArm3.rotationPointY - (float)(yy);
        this.rightArm3.rotationPointZ = this.rightArm3.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 0) / 20) * (29-(0)));
            yy = 0 + (((tickAnim - 0) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 20) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 30) {
            xx = 29 + (((tickAnim - 20) / 10) * (29-(29)));
            yy = 0 + (((tickAnim - 20) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 10) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 50) {
            xx = 29 + (((tickAnim - 30) / 20) * (0-(29)));
            yy = 0 + (((tickAnim - 30) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 30) / 20) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftArm, leftArm.rotateAngleX + (float) Math.toRadians(xx), leftArm.rotateAngleY + (float) Math.toRadians(yy), leftArm.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 0) / 20) * (-24.75-(0)));
            yy = 0 + (((tickAnim - 0) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 20) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 30) {
            xx = -24.75 + (((tickAnim - 20) / 10) * (-24.75-(-24.75)));
            yy = 0 + (((tickAnim - 20) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 10) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 50) {
            xx = -24.75 + (((tickAnim - 30) / 20) * (0-(-24.75)));
            yy = 0 + (((tickAnim - 30) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 30) / 20) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftArm2, leftArm2.rotateAngleX + (float) Math.toRadians(xx), leftArm2.rotateAngleY + (float) Math.toRadians(yy), leftArm2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 0) / 20) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 20) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 30) {
            xx = 0 + (((tickAnim - 20) / 10) * (0-(0)));
            yy = 0 + (((tickAnim - 20) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 10) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 30) / 20) * (0-(0)));
            yy = 0 + (((tickAnim - 30) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 30) / 20) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftArm3, leftArm3.rotateAngleX + (float) Math.toRadians(xx), leftArm3.rotateAngleY + (float) Math.toRadians(yy), leftArm3.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 0) / 20) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 20) * (1.65-(0)));
            zz = 0 + (((tickAnim - 0) / 20) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 30) {
            xx = 0 + (((tickAnim - 20) / 10) * (0-(0)));
            yy = 1.65 + (((tickAnim - 20) / 10) * (1.65-(1.65)));
            zz = 0 + (((tickAnim - 20) / 10) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 30) / 20) * (0-(0)));
            yy = 1.65 + (((tickAnim - 30) / 20) * (0-(1.65)));
            zz = 0 + (((tickAnim - 30) / 20) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.leftArm3.rotationPointX = this.leftArm3.rotationPointX + (float)(xx);
        this.leftArm3.rotationPointY = this.leftArm3.rotationPointY - (float)(yy);
        this.leftArm3.rotationPointZ = this.leftArm3.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 0) / 20) * (-9.5-(0)));
            yy = 0 + (((tickAnim - 0) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 20) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 30) {
            xx = -9.5 + (((tickAnim - 20) / 10) * (-9.5-(-9.5)));
            yy = 0 + (((tickAnim - 20) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 10) * (0-(0)));
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
        this.setRotateAngle(rightLeg, rightLeg.rotateAngleX + (float) Math.toRadians(xx), rightLeg.rotateAngleY + (float) Math.toRadians(yy), rightLeg.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 0) / 20) * (51.5-(0)));
            yy = 0 + (((tickAnim - 0) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 20) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 30) {
            xx = 51.5 + (((tickAnim - 20) / 10) * (51.5-(51.5)));
            yy = 0 + (((tickAnim - 20) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 10) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 50) {
            xx = 51.5 + (((tickAnim - 30) / 20) * (0-(51.5)));
            yy = 0 + (((tickAnim - 30) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 30) / 20) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightLeg2, rightLeg2.rotateAngleX + (float) Math.toRadians(xx), rightLeg2.rotateAngleY + (float) Math.toRadians(yy), rightLeg2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 0) / 20) * (-18.5-(0)));
            yy = 0 + (((tickAnim - 0) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 20) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 30) {
            xx = -18.5 + (((tickAnim - 20) / 10) * (-18.5-(-18.5)));
            yy = 0 + (((tickAnim - 20) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 10) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 50) {
            xx = -18.5 + (((tickAnim - 30) / 20) * (0-(-18.5)));
            yy = 0 + (((tickAnim - 30) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 30) / 20) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightLeg3, rightLeg3.rotateAngleX + (float) Math.toRadians(xx), rightLeg3.rotateAngleY + (float) Math.toRadians(yy), rightLeg3.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 0) / 20) * (-10-(0)));
            yy = 0 + (((tickAnim - 0) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 20) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 30) {
            xx = -10 + (((tickAnim - 20) / 10) * (-10-(-10)));
            yy = 0 + (((tickAnim - 20) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 10) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 50) {
            xx = -10 + (((tickAnim - 30) / 20) * (0-(-10)));
            yy = 0 + (((tickAnim - 30) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 30) / 20) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightLeg4, rightLeg4.rotateAngleX + (float) Math.toRadians(xx), rightLeg4.rotateAngleY + (float) Math.toRadians(yy), rightLeg4.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 0) / 20) * (-9.5-(0)));
            yy = 0 + (((tickAnim - 0) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 20) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 30) {
            xx = -9.5 + (((tickAnim - 20) / 10) * (-9.5-(-9.5)));
            yy = 0 + (((tickAnim - 20) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 10) * (0-(0)));
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
        this.setRotateAngle(leftLeg, leftLeg.rotateAngleX + (float) Math.toRadians(xx), leftLeg.rotateAngleY + (float) Math.toRadians(yy), leftLeg.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 0) / 20) * (51.5-(0)));
            yy = 0 + (((tickAnim - 0) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 20) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 30) {
            xx = 51.5 + (((tickAnim - 20) / 10) * (51.5-(51.5)));
            yy = 0 + (((tickAnim - 20) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 10) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 50) {
            xx = 51.5 + (((tickAnim - 30) / 20) * (0-(51.5)));
            yy = 0 + (((tickAnim - 30) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 30) / 20) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftLeg2, leftLeg2.rotateAngleX + (float) Math.toRadians(xx), leftLeg2.rotateAngleY + (float) Math.toRadians(yy), leftLeg2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 0) / 20) * (-18.5-(0)));
            yy = 0 + (((tickAnim - 0) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 20) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 30) {
            xx = -18.5 + (((tickAnim - 20) / 10) * (-18.5-(-18.5)));
            yy = 0 + (((tickAnim - 20) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 10) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 50) {
            xx = -18.5 + (((tickAnim - 30) / 20) * (0-(-18.5)));
            yy = 0 + (((tickAnim - 30) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 30) / 20) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftLeg3, leftLeg3.rotateAngleX + (float) Math.toRadians(xx), leftLeg3.rotateAngleY + (float) Math.toRadians(yy), leftLeg3.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 0) / 20) * (-10-(0)));
            yy = 0 + (((tickAnim - 0) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 20) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 30) {
            xx = -10 + (((tickAnim - 20) / 10) * (-10-(-10)));
            yy = 0 + (((tickAnim - 20) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 10) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 50) {
            xx = -10 + (((tickAnim - 30) / 20) * (0-(-10)));
            yy = 0 + (((tickAnim - 30) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 30) / 20) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftLeg4, leftLeg4.rotateAngleX + (float) Math.toRadians(xx), leftLeg4.rotateAngleY + (float) Math.toRadians(yy), leftLeg4.rotateAngleZ + (float) Math.toRadians(zz));

    }
    public void animNest(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime, double animTick) {
        EntityPrehistoricFloraOlorotitan entity = (EntityPrehistoricFloraOlorotitan) entitylivingbaseIn;
        int animCycle = 50;
        double tickAnim = animTick + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;
         if (tickAnim >= 0 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 0) / 20) * (20.75-(0)));
            yy = 0 + (((tickAnim - 0) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 20) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 38) {
            xx = 20.75 + (((tickAnim - 20) / 18) * (-18.5-(20.75)));
            yy = 0 + (((tickAnim - 20) / 18) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 18) * (0-(0)));
        }
        else if (tickAnim >= 38 && tickAnim < 50) {
            xx = -18.5 + (((tickAnim - 38) / 12) * (0-(-18.5)));
            yy = 0 + (((tickAnim - 38) / 12) * (0-(0)));
            zz = 0 + (((tickAnim - 38) / 12) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftLeg, leftLeg.rotateAngleX + (float) Math.toRadians(xx), leftLeg.rotateAngleY + (float) Math.toRadians(yy), leftLeg.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 0) / 20) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 20) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 27) {
            xx = 0 + (((tickAnim - 20) / 7) * (40.75-(0)));
            yy = 0 + (((tickAnim - 20) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 7) * (0-(0)));
        }
        else if (tickAnim >= 27 && tickAnim < 38) {
            xx = 40.75 + (((tickAnim - 27) / 11) * (0-(40.75)));
            yy = 0 + (((tickAnim - 27) / 11) * (0-(0)));
            zz = 0 + (((tickAnim - 27) / 11) * (0-(0)));
        }
        else if (tickAnim >= 38 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 38) / 12) * (0-(0)));
            yy = 0 + (((tickAnim - 38) / 12) * (0-(0)));
            zz = 0 + (((tickAnim - 38) / 12) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftLeg2, leftLeg2.rotateAngleX + (float) Math.toRadians(xx), leftLeg2.rotateAngleY + (float) Math.toRadians(yy), leftLeg2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 0) / 20) * (28.5-(0)));
            yy = 0 + (((tickAnim - 0) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 20) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 27) {
            xx = 28.5 + (((tickAnim - 20) / 7) * (-35.59-(28.5)));
            yy = 0 + (((tickAnim - 20) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 7) * (0-(0)));
        }
        else if (tickAnim >= 27 && tickAnim < 34) {
            xx = -35.59 + (((tickAnim - 27) / 7) * (-35.59-(-35.59)));
            yy = 0 + (((tickAnim - 27) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 27) / 7) * (0-(0)));
        }
        else if (tickAnim >= 34 && tickAnim < 38) {
            xx = -35.59 + (((tickAnim - 34) / 4) * (17.25-(-35.59)));
            yy = 0 + (((tickAnim - 34) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 34) / 4) * (0-(0)));
        }
        else if (tickAnim >= 38 && tickAnim < 50) {
            xx = 17.25 + (((tickAnim - 38) / 12) * (0-(17.25)));
            yy = 0 + (((tickAnim - 38) / 12) * (0-(0)));
            zz = 0 + (((tickAnim - 38) / 12) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftLeg3, leftLeg3.rotateAngleX + (float) Math.toRadians(xx), leftLeg3.rotateAngleY + (float) Math.toRadians(yy), leftLeg3.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 0) / 20) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 20) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 38) {
            xx = 0 + (((tickAnim - 20) / 18) * (0-(0)));
            yy = 0 + (((tickAnim - 20) / 18) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 18) * (0-(0)));
        }
        else if (tickAnim >= 38 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 38) / 12) * (0-(0)));
            yy = 0 + (((tickAnim - 38) / 12) * (0-(0)));
            zz = 0 + (((tickAnim - 38) / 12) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.leftLeg3.rotationPointX = this.leftLeg3.rotationPointX + (float)(xx);
        this.leftLeg3.rotationPointY = this.leftLeg3.rotationPointY - (float)(yy);
        this.leftLeg3.rotationPointZ = this.leftLeg3.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 0) / 20) * (31.75-(0)));
            yy = 0 + (((tickAnim - 0) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 20) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 23) {
            xx = 31.75 + (((tickAnim - 20) / 3) * (60.08-(31.75)));
            yy = 0 + (((tickAnim - 20) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 3) * (0-(0)));
        }
        else if (tickAnim >= 23 && tickAnim < 27) {
            xx = 60.08 + (((tickAnim - 23) / 4) * (65.95-(60.08)));
            yy = 0 + (((tickAnim - 23) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 23) / 4) * (0-(0)));
        }
        else if (tickAnim >= 27 && tickAnim < 34) {
            xx = 65.95 + (((tickAnim - 27) / 7) * (65.95-(65.95)));
            yy = 0 + (((tickAnim - 27) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 27) / 7) * (0-(0)));
        }
        else if (tickAnim >= 34 && tickAnim < 38) {
            xx = 65.95 + (((tickAnim - 34) / 4) * (0-(65.95)));
            yy = 0 + (((tickAnim - 34) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 34) / 4) * (0-(0)));
        }
        else if (tickAnim >= 38 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 38) / 12) * (0-(0)));
            yy = 0 + (((tickAnim - 38) / 12) * (0-(0)));
            zz = 0 + (((tickAnim - 38) / 12) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftLeg4, leftLeg4.rotateAngleX + (float) Math.toRadians(xx), leftLeg4.rotateAngleY + (float) Math.toRadians(yy), leftLeg4.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 0) / 20) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 20) * (-0.675-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 23) {
            xx = 0 + (((tickAnim - 20) / 3) * (0-(0)));
            yy = 0 + (((tickAnim - 20) / 3) * (-0.25-(0)));
            zz = -0.675 + (((tickAnim - 20) / 3) * (-0.58-(-0.675)));
        }
        else if (tickAnim >= 23 && tickAnim < 34) {
            xx = 0 + (((tickAnim - 23) / 11) * (0-(0)));
            yy = -0.25 + (((tickAnim - 23) / 11) * (-0.07-(-0.25)));
            zz = -0.58 + (((tickAnim - 23) / 11) * (-1.025-(-0.58)));
        }
        else if (tickAnim >= 34 && tickAnim < 38) {
            xx = 0 + (((tickAnim - 34) / 4) * (0-(0)));
            yy = -0.07 + (((tickAnim - 34) / 4) * (0-(-0.07)));
            zz = -1.025 + (((tickAnim - 34) / 4) * (0-(-1.025)));
        }
        else if (tickAnim >= 38 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 38) / 12) * (0-(0)));
            yy = 0 + (((tickAnim - 38) / 12) * (0-(0)));
            zz = 0 + (((tickAnim - 38) / 12) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.leftLeg4.rotationPointX = this.leftLeg4.rotationPointX + (float)(xx);
        this.leftLeg4.rotationPointY = this.leftLeg4.rotationPointY - (float)(yy);
        this.leftLeg4.rotationPointZ = this.leftLeg4.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 0) / 20) * (-57.25-(0)));
            yy = 0 + (((tickAnim - 0) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 20) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 23) {
            xx = -57.25 + (((tickAnim - 20) / 3) * (0-(-57.25)));
            yy = 0 + (((tickAnim - 20) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 3) * (0-(0)));
        }
        else if (tickAnim >= 23 && tickAnim < 27) {
            xx = 0 + (((tickAnim - 23) / 4) * (17-(0)));
            yy = 0 + (((tickAnim - 23) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 23) / 4) * (0-(0)));
        }
        else if (tickAnim >= 27 && tickAnim < 34) {
            xx = 17 + (((tickAnim - 27) / 7) * (17-(17)));
            yy = 0 + (((tickAnim - 27) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 27) / 7) * (0-(0)));
        }
        else if (tickAnim >= 34 && tickAnim < 38) {
            xx = 17 + (((tickAnim - 34) / 4) * (0-(17)));
            yy = 0 + (((tickAnim - 34) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 34) / 4) * (0-(0)));
        }
        else if (tickAnim >= 38 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 38) / 12) * (0-(0)));
            yy = 0 + (((tickAnim - 38) / 12) * (0-(0)));
            zz = 0 + (((tickAnim - 38) / 12) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftLeg5, leftLeg5.rotateAngleX + (float) Math.toRadians(xx), leftLeg5.rotateAngleY + (float) Math.toRadians(yy), leftLeg5.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 0) / 20) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 20) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 23) {
            xx = 0 + (((tickAnim - 20) / 3) * (0-(0)));
            yy = 0 + (((tickAnim - 20) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 3) * (0-(0)));
        }
        else if (tickAnim >= 23 && tickAnim < 27) {
            xx = 0 + (((tickAnim - 23) / 4) * (0-(0)));
            yy = 0 + (((tickAnim - 23) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 23) / 4) * (0-(0)));
        }
        else if (tickAnim >= 27 && tickAnim < 34) {
            xx = 0 + (((tickAnim - 27) / 7) * (0-(0)));
            yy = 0 + (((tickAnim - 27) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 27) / 7) * (0-(0)));
        }
        else if (tickAnim >= 34 && tickAnim < 38) {
            xx = 0 + (((tickAnim - 34) / 4) * (0-(0)));
            yy = 0 + (((tickAnim - 34) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 34) / 4) * (0-(0)));
        }
        else if (tickAnim >= 38 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 38) / 12) * (0-(0)));
            yy = 0 + (((tickAnim - 38) / 12) * (0-(0)));
            zz = 0 + (((tickAnim - 38) / 12) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.leftLeg5.rotationPointX = this.leftLeg5.rotationPointX + (float)(xx);
        this.leftLeg5.rotationPointY = this.leftLeg5.rotationPointY - (float)(yy);
        this.leftLeg5.rotationPointZ = this.leftLeg5.rotationPointZ + (float)(zz);


    }
    public void animGraze(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime, double animTick) {
        EntityPrehistoricFloraOlorotitan entity = (EntityPrehistoricFloraOlorotitan) entitylivingbaseIn;
        int animCycle = 340;
        double tickAnim = animTick + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;
         if (tickAnim >= 0 && tickAnim < 60) {
            xx = 0 + (((tickAnim - 0) / 60) * (4.75-(0)));
            yy = 0 + (((tickAnim - 0) / 60) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 60) * (0-(0)));
        }
        else if (tickAnim >= 60 && tickAnim < 288) {
            xx = 4.75 + (((tickAnim - 60) / 228) * (4.75-(4.75)));
            yy = 0 + (((tickAnim - 60) / 228) * (0-(0)));
            zz = 0 + (((tickAnim - 60) / 228) * (0-(0)));
        }
        else if (tickAnim >= 288 && tickAnim < 340) {
            xx = 4.75 + (((tickAnim - 288) / 52) * (0-(4.75)));
            yy = 0 + (((tickAnim - 288) / 52) * (0-(0)));
            zz = 0 + (((tickAnim - 288) / 52) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(hips, hips.rotateAngleX + (float) Math.toRadians(xx), hips.rotateAngleY + (float) Math.toRadians(yy), hips.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 60) {
            xx = 0 + (((tickAnim - 0) / 60) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 60) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 60) * (-4.45-(0)));
        }
        else if (tickAnim >= 60 && tickAnim < 288) {
            xx = 0 + (((tickAnim - 60) / 228) * (0-(0)));
            yy = 0 + (((tickAnim - 60) / 228) * (0-(0)));
            zz = -4.45 + (((tickAnim - 60) / 228) * (-4.45-(-4.45)));
        }
        else if (tickAnim >= 288 && tickAnim < 340) {
            xx = 0 + (((tickAnim - 288) / 52) * (0-(0)));
            yy = 0 + (((tickAnim - 288) / 52) * (0-(0)));
            zz = -4.45 + (((tickAnim - 288) / 52) * (0-(-4.45)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.hips.rotationPointX = this.hips.rotationPointX + (float)(xx);
        this.hips.rotationPointY = this.hips.rotationPointY - (float)(yy);
        this.hips.rotationPointZ = this.hips.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 60) {
            xx = 0 + (((tickAnim - 0) / 60) * (6.25+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50+50))*5-(0)));
            yy = 0 + (((tickAnim - 0) / 60) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 60) * (0-(0)));
        }
        else if (tickAnim >= 60 && tickAnim < 61) {
            xx = 6.25+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50+50))*5 + (((tickAnim - 60) / 1) * (4.725+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50+50))*0.5-(6.25+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50+50))*5)));
            yy = 0 + (((tickAnim - 60) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 60) / 1) * (0-(0)));
        }
        else if (tickAnim >= 61 && tickAnim < 288) {
            xx = 4.725+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50+50))*0.5 + (((tickAnim - 61) / 227) * (4.725+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50+50))*0.5-(4.725+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50+50))*0.5)));
            yy = 0 + (((tickAnim - 61) / 227) * (0-(0)));
            zz = 0 + (((tickAnim - 61) / 227) * (0-(0)));
        }
        else if (tickAnim >= 288 && tickAnim < 340) {
            xx = 4.725+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50+50))*0.5 + (((tickAnim - 288) / 52) * (0-(4.725+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50+50))*0.5)));
            yy = 0 + (((tickAnim - 288) / 52) * (0-(0)));
            zz = 0 + (((tickAnim - 288) / 52) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tail1, tail1.rotateAngleX + (float) Math.toRadians(xx), tail1.rotateAngleY + (float) Math.toRadians(yy), tail1.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 60) {
            xx = 0 + (((tickAnim - 0) / 60) * (4.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*-5-(0)));
            yy = 0 + (((tickAnim - 0) / 60) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 60) * (0-(0)));
        }
        else if (tickAnim >= 60 && tickAnim < 61) {
            xx = 4.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*-5 + (((tickAnim - 60) / 1) * (2.4+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*-0.5-(4.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*-5)));
            yy = 0 + (((tickAnim - 60) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 60) / 1) * (0-(0)));
        }
        else if (tickAnim >= 61 && tickAnim < 288) {
            xx = 2.4+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*-0.5 + (((tickAnim - 61) / 227) * (2.4+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*-0.5-(2.4+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*-0.5)));
            yy = 0 + (((tickAnim - 61) / 227) * (0-(0)));
            zz = 0 + (((tickAnim - 61) / 227) * (0-(0)));
        }
        else if (tickAnim >= 288 && tickAnim < 340) {
            xx = 2.4+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*-0.5 + (((tickAnim - 288) / 52) * (0-(2.4+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*-0.5)));
            yy = 0 + (((tickAnim - 288) / 52) * (0-(0)));
            zz = 0 + (((tickAnim - 288) / 52) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tail2, tail2.rotateAngleX + (float) Math.toRadians(xx), tail2.rotateAngleY + (float) Math.toRadians(yy), tail2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 60) {
            xx = 0 + (((tickAnim - 0) / 60) * (-6-(0)));
            yy = 0 + (((tickAnim - 0) / 60) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 60) * (0-(0)));
        }
        else if (tickAnim >= 60 && tickAnim < 288) {
            xx = -6 + (((tickAnim - 60) / 228) * (-6-(-6)));
            yy = 0 + (((tickAnim - 60) / 228) * (0-(0)));
            zz = 0 + (((tickAnim - 60) / 228) * (0-(0)));
        }
        else if (tickAnim >= 288 && tickAnim < 340) {
            xx = -6 + (((tickAnim - 288) / 52) * (0-(-6)));
            yy = 0 + (((tickAnim - 288) / 52) * (0-(0)));
            zz = 0 + (((tickAnim - 288) / 52) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tail3, tail3.rotateAngleX + (float) Math.toRadians(xx), tail3.rotateAngleY + (float) Math.toRadians(yy), tail3.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 60) {
            xx = 0 + (((tickAnim - 0) / 60) * (-8.5-(0)));
            yy = 0 + (((tickAnim - 0) / 60) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 60) * (0-(0)));
        }
        else if (tickAnim >= 60 && tickAnim < 288) {
            xx = -8.5 + (((tickAnim - 60) / 228) * (-8.5-(-8.5)));
            yy = 0 + (((tickAnim - 60) / 228) * (0-(0)));
            zz = 0 + (((tickAnim - 60) / 228) * (0-(0)));
        }
        else if (tickAnim >= 288 && tickAnim < 340) {
            xx = -8.5 + (((tickAnim - 288) / 52) * (0-(-8.5)));
            yy = 0 + (((tickAnim - 288) / 52) * (0-(0)));
            zz = 0 + (((tickAnim - 288) / 52) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tail4, tail4.rotateAngleX + (float) Math.toRadians(xx), tail4.rotateAngleY + (float) Math.toRadians(yy), tail4.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 60) {
            xx = 0 + (((tickAnim - 0) / 60) * (-7.25-(0)));
            yy = 0 + (((tickAnim - 0) / 60) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 60) * (0-(0)));
        }
        else if (tickAnim >= 60 && tickAnim < 288) {
            xx = -7.25 + (((tickAnim - 60) / 228) * (-7.25-(-7.25)));
            yy = 0 + (((tickAnim - 60) / 228) * (0-(0)));
            zz = 0 + (((tickAnim - 60) / 228) * (0-(0)));
        }
        else if (tickAnim >= 288 && tickAnim < 340) {
            xx = -7.25 + (((tickAnim - 288) / 52) * (0-(-7.25)));
            yy = 0 + (((tickAnim - 288) / 52) * (0-(0)));
            zz = 0 + (((tickAnim - 288) / 52) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tail5, tail5.rotateAngleX + (float) Math.toRadians(xx), tail5.rotateAngleY + (float) Math.toRadians(yy), tail5.rotateAngleZ + (float) Math.toRadians(zz));



        this.setRotateAngle(body, body.rotateAngleX + (float) Math.toRadians(0), body.rotateAngleY + (float) Math.toRadians(0), body.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(chest, chest.rotateAngleX + (float) Math.toRadians(0), chest.rotateAngleY + (float) Math.toRadians(0), chest.rotateAngleZ + (float) Math.toRadians(0));
        this.chest.rotationPointX = this.chest.rotationPointX + (float)(0);
        this.chest.rotationPointY = this.chest.rotationPointY - (float)(0);
        this.chest.rotationPointZ = this.chest.rotationPointZ + (float)(0);



        if (tickAnim >= 0 && tickAnim < 1) {
            xx = 0 + (((tickAnim - 0) / 1) * (26.75+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50+120))*-30-(0)));
            yy = 0 + (((tickAnim - 0) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 1) * (0-(0)));
        }
        else if (tickAnim >= 1 && tickAnim < 76) {
            xx = 26.75+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50+120))*-30 + (((tickAnim - 1) / 75) * (35.85+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50+80))*-10-(26.75+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50+120))*-30)));
            yy = 0 + (((tickAnim - 1) / 75) * (0-(0)));
            zz = 0 + (((tickAnim - 1) / 75) * (0-(0)));
        }
        else if (tickAnim >= 76 && tickAnim < 122) {
            xx = 35.85+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50+80))*-10 + (((tickAnim - 76) / 46) * (44.2+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50+80))*-10-(35.85+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50+80))*-10)));
            yy = 0 + (((tickAnim - 76) / 46) * (0-(0)));
            zz = 0 + (((tickAnim - 76) / 46) * (0-(0)));
        }
        else if (tickAnim >= 122 && tickAnim < 145) {
            xx = 44.2+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50+80))*-10 + (((tickAnim - 122) / 23) * (39.4+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50+80))*10-(44.2+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50+80))*-10)));
            yy = 0 + (((tickAnim - 122) / 23) * (0-(0)));
            zz = 0 + (((tickAnim - 122) / 23) * (0-(0)));
        }
        else if (tickAnim >= 145 && tickAnim < 205) {
            xx = 39.4+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50+80))*10 + (((tickAnim - 145) / 60) * (37+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50+80))*10-(39.4+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50+80))*10)));
            yy = 0 + (((tickAnim - 145) / 60) * (0-(0)));
            zz = 0 + (((tickAnim - 145) / 60) * (0-(0)));
        }
        else if (tickAnim >= 205 && tickAnim < 228) {
            xx = 37+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50+80))*10 + (((tickAnim - 205) / 23) * (29.675+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50+80))*2-(37+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50+80))*10)));
            yy = 0 + (((tickAnim - 205) / 23) * (0-(0)));
            zz = 0 + (((tickAnim - 205) / 23) * (0-(0)));
        }
        else if (tickAnim >= 228 && tickAnim < 288) {
            xx = 29.675+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50+80))*2 + (((tickAnim - 228) / 60) * (24.8-(29.675+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50+80))*2)));
            yy = 0 + (((tickAnim - 228) / 60) * (0-(0)));
            zz = 0 + (((tickAnim - 228) / 60) * (0-(0)));
        }
        else if (tickAnim >= 288 && tickAnim < 340) {
            xx = 24.8 + (((tickAnim - 288) / 52) * (0-(24.8)));
            yy = 0 + (((tickAnim - 288) / 52) * (0-(0)));
            zz = 0 + (((tickAnim - 288) / 52) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck1, neck1.rotateAngleX + (float) Math.toRadians(xx), neck1.rotateAngleY + (float) Math.toRadians(yy), neck1.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 60) {
            xx = 0 + (((tickAnim - 0) / 60) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 60) * (-1.025-(0)));
            zz = 0 + (((tickAnim - 0) / 60) * (-2.7-(0)));
        }
        else if (tickAnim >= 60 && tickAnim < 76) {
            xx = 0 + (((tickAnim - 60) / 16) * (0-(0)));
            yy = -1.025 + (((tickAnim - 60) / 16) * (-1.025-(-1.025)));
            zz = -2.7 + (((tickAnim - 60) / 16) * (-2.7-(-2.7)));
        }
        else if (tickAnim >= 76 && tickAnim < 288) {
            xx = 0 + (((tickAnim - 76) / 212) * (0-(0)));
            yy = -1.025 + (((tickAnim - 76) / 212) * (-1.025-(-1.025)));
            zz = -2.7 + (((tickAnim - 76) / 212) * (-2.7-(-2.7)));
        }
        else if (tickAnim >= 288 && tickAnim < 340) {
            xx = 0 + (((tickAnim - 288) / 52) * (0-(0)));
            yy = -1.025 + (((tickAnim - 288) / 52) * (0-(-1.025)));
            zz = -2.7 + (((tickAnim - 288) / 52) * (0-(-2.7)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.neck1.rotationPointX = this.neck1.rotationPointX + (float)(xx);
        this.neck1.rotationPointY = this.neck1.rotationPointY - (float)(yy);
        this.neck1.rotationPointZ = this.neck1.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 1) {
            xx = 0 + (((tickAnim - 0) / 1) * (7.875+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50+50))*-10-(0)));
            yy = 0 + (((tickAnim - 0) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 1) * (0-(0)));
        }
        else if (tickAnim >= 1 && tickAnim < 60) {
            xx = 7.875+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50+50))*-10 + (((tickAnim - 1) / 59) * (11.5-(7.875+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50+50))*-10)));
            yy = 0 + (((tickAnim - 1) / 59) * (0-(0)));
            zz = 0 + (((tickAnim - 1) / 59) * (0-(0)));
        }
        else if (tickAnim >= 60 && tickAnim < 288) {
            xx = 11.5 + (((tickAnim - 60) / 228) * (11.5-(11.5)));
            yy = 0 + (((tickAnim - 60) / 228) * (0-(0)));
            zz = 0 + (((tickAnim - 60) / 228) * (0-(0)));
        }
        else if (tickAnim >= 288 && tickAnim < 340) {
            xx = 11.5 + (((tickAnim - 288) / 52) * (0-(11.5)));
            yy = 0 + (((tickAnim - 288) / 52) * (0-(0)));
            zz = 0 + (((tickAnim - 288) / 52) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck2, neck2.rotateAngleX + (float) Math.toRadians(xx), neck2.rotateAngleY + (float) Math.toRadians(yy), neck2.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 60) {
            xx = 0 + (((tickAnim - 0) / 60) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 60) * (-0.975-(0)));
            zz = 0 + (((tickAnim - 0) / 60) * (0-(0)));
        }
        else if (tickAnim >= 60 && tickAnim < 288) {
            xx = 0 + (((tickAnim - 60) / 228) * (0-(0)));
            yy = -0.975 + (((tickAnim - 60) / 228) * (-0.975-(-0.975)));
            zz = 0 + (((tickAnim - 60) / 228) * (0-(0)));
        }
        else if (tickAnim >= 288 && tickAnim < 340) {
            xx = 0 + (((tickAnim - 288) / 52) * (0-(0)));
            yy = -0.975 + (((tickAnim - 288) / 52) * (0-(-0.975)));
            zz = 0 + (((tickAnim - 288) / 52) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.neck2.rotationPointX = this.neck2.rotationPointX + (float)(xx);
        this.neck2.rotationPointY = this.neck2.rotationPointY - (float)(yy);
        this.neck2.rotationPointZ = this.neck2.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 60) {
            xx = 0 + (((tickAnim - 0) / 60) * (18.5-(0)));
            yy = 0 + (((tickAnim - 0) / 60) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 60) * (0-(0)));
        }
        else if (tickAnim >= 60 && tickAnim < 288) {
            xx = 18.5 + (((tickAnim - 60) / 228) * (18.5-(18.5)));
            yy = 0 + (((tickAnim - 60) / 228) * (0-(0)));
            zz = 0 + (((tickAnim - 60) / 228) * (0-(0)));
        }
        else if (tickAnim >= 288 && tickAnim < 340) {
            xx = 18.5 + (((tickAnim - 288) / 52) * (0-(18.5)));
            yy = 0 + (((tickAnim - 288) / 52) * (0-(0)));
            zz = 0 + (((tickAnim - 288) / 52) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck3, neck3.rotateAngleX + (float) Math.toRadians(xx), neck3.rotateAngleY + (float) Math.toRadians(yy), neck3.rotateAngleZ + (float) Math.toRadians(zz));

        this.neck3.rotationPointX = this.neck3.rotationPointX + (float)(0);
        this.neck3.rotationPointY = this.neck3.rotationPointY - (float)(0);
        this.neck3.rotationPointZ = this.neck3.rotationPointZ + (float)(0);


        this.setRotateAngle(neck4, neck4.rotateAngleX + (float) Math.toRadians(0), neck4.rotateAngleY + (float) Math.toRadians(0), neck4.rotateAngleZ + (float) Math.toRadians(0));
        this.neck4.rotationPointX = this.neck4.rotationPointX + (float)(0);
        this.neck4.rotationPointY = this.neck4.rotationPointY - (float)(0);
        this.neck4.rotationPointZ = this.neck4.rotationPointZ + (float)(0);



        if (tickAnim >= 0 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 0) / 50) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 50) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 50) * (0-(0)));
        }
        else if (tickAnim >= 50 && tickAnim < 65) {
            xx = 0 + (((tickAnim - 50) / 15) * (16-(0)));
            yy = 0 + (((tickAnim - 50) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 50) / 15) * (0-(0)));
        }
        else if (tickAnim >= 65 && tickAnim < 78) {
            xx = 16 + (((tickAnim - 65) / 13) * (0-(16)));
            yy = 0 + (((tickAnim - 65) / 13) * (0-(0)));
            zz = 0 + (((tickAnim - 65) / 13) * (0-(0)));
        }
        else if (tickAnim >= 78 && tickAnim < 82) {
            xx = 0 + (((tickAnim - 78) / 4) * (1.25-(0)));
            yy = 0 + (((tickAnim - 78) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 78) / 4) * (0-(0)));
        }
        else if (tickAnim >= 82 && tickAnim < 88) {
            xx = 1.25 + (((tickAnim - 82) / 6) * (3.25-(1.25)));
            yy = 0 + (((tickAnim - 82) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 82) / 6) * (0-(0)));
        }
        else if (tickAnim >= 88 && tickAnim < 94) {
            xx = 3.25 + (((tickAnim - 88) / 6) * (0-(3.25)));
            yy = 0 + (((tickAnim - 88) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 88) / 6) * (0-(0)));
        }
        else if (tickAnim >= 94 && tickAnim < 102) {
            xx = 0 + (((tickAnim - 94) / 8) * (1.25-(0)));
            yy = 0 + (((tickAnim - 94) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 94) / 8) * (0-(0)));
        }
        else if (tickAnim >= 102 && tickAnim < 108) {
            xx = 1.25 + (((tickAnim - 102) / 6) * (3.25-(1.25)));
            yy = 0 + (((tickAnim - 102) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 102) / 6) * (0-(0)));
        }
        else if (tickAnim >= 108 && tickAnim < 114) {
            xx = 3.25 + (((tickAnim - 108) / 6) * (0-(3.25)));
            yy = 0 + (((tickAnim - 108) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 108) / 6) * (0-(0)));
        }
        else if (tickAnim >= 114 && tickAnim < 122) {
            xx = 0 + (((tickAnim - 114) / 8) * (1.25-(0)));
            yy = 0 + (((tickAnim - 114) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 114) / 8) * (0-(0)));
        }
        else if (tickAnim >= 122 && tickAnim < 130) {
            xx = 1.25 + (((tickAnim - 122) / 8) * (1.25-(1.25)));
            yy = 0 + (((tickAnim - 122) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 122) / 8) * (0-(0)));
        }
        else if (tickAnim >= 130 && tickAnim < 140) {
            xx = 1.25 + (((tickAnim - 130) / 10) * (19.25-(1.25)));
            yy = 0 + (((tickAnim - 130) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 130) / 10) * (0-(0)));
        }
        else if (tickAnim >= 140 && tickAnim < 145) {
            xx = 19.25 + (((tickAnim - 140) / 5) * (0-(19.25)));
            yy = 0 + (((tickAnim - 140) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 140) / 5) * (0-(0)));
        }
        else if (tickAnim >= 145 && tickAnim < 151) {
            xx = 0 + (((tickAnim - 145) / 6) * (1.25-(0)));
            yy = 0 + (((tickAnim - 145) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 145) / 6) * (0-(0)));
        }
        else if (tickAnim >= 151 && tickAnim < 160) {
            xx = 1.25 + (((tickAnim - 151) / 9) * (3.25-(1.25)));
            yy = 0 + (((tickAnim - 151) / 9) * (0-(0)));
            zz = 0 + (((tickAnim - 151) / 9) * (0-(0)));
        }
        else if (tickAnim >= 160 && tickAnim < 168) {
            xx = 3.25 + (((tickAnim - 160) / 8) * (0-(3.25)));
            yy = 0 + (((tickAnim - 160) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 160) / 8) * (0-(0)));
        }
        else if (tickAnim >= 168 && tickAnim < 178) {
            xx = 0 + (((tickAnim - 168) / 10) * (1.25-(0)));
            yy = 0 + (((tickAnim - 168) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 168) / 10) * (0-(0)));
        }
        else if (tickAnim >= 178 && tickAnim < 187) {
            xx = 1.25 + (((tickAnim - 178) / 9) * (3.25-(1.25)));
            yy = 0 + (((tickAnim - 178) / 9) * (0-(0)));
            zz = 0 + (((tickAnim - 178) / 9) * (0-(0)));
        }
        else if (tickAnim >= 187 && tickAnim < 195) {
            xx = 3.25 + (((tickAnim - 187) / 8) * (0-(3.25)));
            yy = 0 + (((tickAnim - 187) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 187) / 8) * (0-(0)));
        }
        else if (tickAnim >= 195 && tickAnim < 205) {
            xx = 0 + (((tickAnim - 195) / 10) * (1.25-(0)));
            yy = 0 + (((tickAnim - 195) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 195) / 10) * (0-(0)));
        }
        else if (tickAnim >= 205 && tickAnim < 213) {
            xx = 1.25 + (((tickAnim - 205) / 8) * (1.25-(1.25)));
            yy = 0 + (((tickAnim - 205) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 205) / 8) * (0-(0)));
        }
        else if (tickAnim >= 213 && tickAnim < 228) {
            xx = 1.25 + (((tickAnim - 213) / 15) * (0-(1.25)));
            yy = 0 + (((tickAnim - 213) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 213) / 15) * (0-(0)));
        }
        else if (tickAnim >= 228 && tickAnim < 234) {
            xx = 0 + (((tickAnim - 228) / 6) * (1.25-(0)));
            yy = 0 + (((tickAnim - 228) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 228) / 6) * (0-(0)));
        }
        else if (tickAnim >= 234 && tickAnim < 243) {
            xx = 1.25 + (((tickAnim - 234) / 9) * (3.25-(1.25)));
            yy = 0 + (((tickAnim - 234) / 9) * (0-(0)));
            zz = 0 + (((tickAnim - 234) / 9) * (0-(0)));
        }
        else if (tickAnim >= 243 && tickAnim < 251) {
            xx = 3.25 + (((tickAnim - 243) / 8) * (0-(3.25)));
            yy = 0 + (((tickAnim - 243) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 243) / 8) * (0-(0)));
        }
        else if (tickAnim >= 251 && tickAnim < 261) {
            xx = 0 + (((tickAnim - 251) / 10) * (1.25-(0)));
            yy = 0 + (((tickAnim - 251) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 251) / 10) * (0-(0)));
        }
        else if (tickAnim >= 261 && tickAnim < 270) {
            xx = 1.25 + (((tickAnim - 261) / 9) * (3.25-(1.25)));
            yy = 0 + (((tickAnim - 261) / 9) * (0-(0)));
            zz = 0 + (((tickAnim - 261) / 9) * (0-(0)));
        }
        else if (tickAnim >= 270 && tickAnim < 278) {
            xx = 3.25 + (((tickAnim - 270) / 8) * (0-(3.25)));
            yy = 0 + (((tickAnim - 270) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 270) / 8) * (0-(0)));
        }
        else if (tickAnim >= 278 && tickAnim < 288) {
            xx = 0 + (((tickAnim - 278) / 10) * (1.25-(0)));
            yy = 0 + (((tickAnim - 278) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 278) / 10) * (0-(0)));
        }
        else if (tickAnim >= 288 && tickAnim < 340) {
            xx = 1.25 + (((tickAnim - 288) / 52) * (0-(1.25)));
            yy = 0 + (((tickAnim - 288) / 52) * (0-(0)));
            zz = 0 + (((tickAnim - 288) / 52) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(lowerjawback, lowerjawback.rotateAngleX + (float) Math.toRadians(xx), lowerjawback.rotateAngleY + (float) Math.toRadians(yy), lowerjawback.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 78) {
            xx = 0 + (((tickAnim - 0) / 78) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 78) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 78) * (0-(0)));
        }
        else if (tickAnim >= 78 && tickAnim < 82) {
            xx = 0 + (((tickAnim - 78) / 4) * (0-(0)));
            yy = 0 + (((tickAnim - 78) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 78) / 4) * (0.225-(0)));
        }
        else if (tickAnim >= 82 && tickAnim < 88) {
            xx = 0 + (((tickAnim - 82) / 6) * (0-(0)));
            yy = 0 + (((tickAnim - 82) / 6) * (0-(0)));
            zz = 0.225 + (((tickAnim - 82) / 6) * (0-(0.225)));
        }
        else if (tickAnim >= 88 && tickAnim < 102) {
            xx = 0 + (((tickAnim - 88) / 14) * (0-(0)));
            yy = 0 + (((tickAnim - 88) / 14) * (0-(0)));
            zz = 0 + (((tickAnim - 88) / 14) * (0.225-(0)));
        }
        else if (tickAnim >= 102 && tickAnim < 108) {
            xx = 0 + (((tickAnim - 102) / 6) * (0-(0)));
            yy = 0 + (((tickAnim - 102) / 6) * (0-(0)));
            zz = 0.225 + (((tickAnim - 102) / 6) * (0-(0.225)));
        }
        else if (tickAnim >= 108 && tickAnim < 122) {
            xx = 0 + (((tickAnim - 108) / 14) * (0-(0)));
            yy = 0 + (((tickAnim - 108) / 14) * (0-(0)));
            zz = 0 + (((tickAnim - 108) / 14) * (0.225-(0)));
        }
        else if (tickAnim >= 122 && tickAnim < 130) {
            xx = 0 + (((tickAnim - 122) / 8) * (0-(0)));
            yy = 0 + (((tickAnim - 122) / 8) * (0-(0)));
            zz = 0.225 + (((tickAnim - 122) / 8) * (0-(0.225)));
        }
        else if (tickAnim >= 130 && tickAnim < 145) {
            xx = 0 + (((tickAnim - 130) / 15) * (0-(0)));
            yy = 0 + (((tickAnim - 130) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 130) / 15) * (0-(0)));
        }
        else if (tickAnim >= 145 && tickAnim < 151) {
            xx = 0 + (((tickAnim - 145) / 6) * (0-(0)));
            yy = 0 + (((tickAnim - 145) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 145) / 6) * (0.225-(0)));
        }
        else if (tickAnim >= 151 && tickAnim < 160) {
            xx = 0 + (((tickAnim - 151) / 9) * (0-(0)));
            yy = 0 + (((tickAnim - 151) / 9) * (0-(0)));
            zz = 0.225 + (((tickAnim - 151) / 9) * (0-(0.225)));
        }
        else if (tickAnim >= 160 && tickAnim < 178) {
            xx = 0 + (((tickAnim - 160) / 18) * (0-(0)));
            yy = 0 + (((tickAnim - 160) / 18) * (0-(0)));
            zz = 0 + (((tickAnim - 160) / 18) * (0.225-(0)));
        }
        else if (tickAnim >= 178 && tickAnim < 187) {
            xx = 0 + (((tickAnim - 178) / 9) * (0-(0)));
            yy = 0 + (((tickAnim - 178) / 9) * (0-(0)));
            zz = 0.225 + (((tickAnim - 178) / 9) * (0-(0.225)));
        }
        else if (tickAnim >= 187 && tickAnim < 205) {
            xx = 0 + (((tickAnim - 187) / 18) * (0-(0)));
            yy = 0 + (((tickAnim - 187) / 18) * (0-(0)));
            zz = 0 + (((tickAnim - 187) / 18) * (0.225-(0)));
        }
        else if (tickAnim >= 205 && tickAnim < 213) {
            xx = 0 + (((tickAnim - 205) / 8) * (0-(0)));
            yy = 0 + (((tickAnim - 205) / 8) * (0-(0)));
            zz = 0.225 + (((tickAnim - 205) / 8) * (0-(0.225)));
        }
        else if (tickAnim >= 213 && tickAnim < 228) {
            xx = 0 + (((tickAnim - 213) / 15) * (0-(0)));
            yy = 0 + (((tickAnim - 213) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 213) / 15) * (0-(0)));
        }
        else if (tickAnim >= 228 && tickAnim < 234) {
            xx = 0 + (((tickAnim - 228) / 6) * (0-(0)));
            yy = 0 + (((tickAnim - 228) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 228) / 6) * (0.225-(0)));
        }
        else if (tickAnim >= 234 && tickAnim < 243) {
            xx = 0 + (((tickAnim - 234) / 9) * (0-(0)));
            yy = 0 + (((tickAnim - 234) / 9) * (0-(0)));
            zz = 0.225 + (((tickAnim - 234) / 9) * (0-(0.225)));
        }
        else if (tickAnim >= 243 && tickAnim < 261) {
            xx = 0 + (((tickAnim - 243) / 18) * (0-(0)));
            yy = 0 + (((tickAnim - 243) / 18) * (0-(0)));
            zz = 0 + (((tickAnim - 243) / 18) * (0.225-(0)));
        }
        else if (tickAnim >= 261 && tickAnim < 270) {
            xx = 0 + (((tickAnim - 261) / 9) * (0-(0)));
            yy = 0 + (((tickAnim - 261) / 9) * (0-(0)));
            zz = 0.225 + (((tickAnim - 261) / 9) * (0-(0.225)));
        }
        else if (tickAnim >= 270 && tickAnim < 288) {
            xx = 0 + (((tickAnim - 270) / 18) * (0-(0)));
            yy = 0 + (((tickAnim - 270) / 18) * (0-(0)));
            zz = 0 + (((tickAnim - 270) / 18) * (0.225-(0)));
        }
        else if (tickAnim >= 288 && tickAnim < 340) {
            xx = 0 + (((tickAnim - 288) / 52) * (0-(0)));
            yy = 0 + (((tickAnim - 288) / 52) * (0-(0)));
            zz = 0.225 + (((tickAnim - 288) / 52) * (0-(0.225)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.lowerjawback.rotationPointX = this.lowerjawback.rotationPointX + (float)(xx);
        this.lowerjawback.rotationPointY = this.lowerjawback.rotationPointY - (float)(yy);
        this.lowerjawback.rotationPointZ = this.lowerjawback.rotationPointZ + (float)(zz);



        this.setRotateAngle(rightcheekflair, rightcheekflair.rotateAngleX + (float) Math.toRadians(0), rightcheekflair.rotateAngleY + (float) Math.toRadians(0), rightcheekflair.rotateAngleZ + (float) Math.toRadians(0));



        if (tickAnim >= 0 && tickAnim < 60) {
            xx = 0 + (((tickAnim - 0) / 60) * (13.75-(0)));
            yy = 0 + (((tickAnim - 0) / 60) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 60) * (0-(0)));
        }
        else if (tickAnim >= 60 && tickAnim < 288) {
            xx = 13.75 + (((tickAnim - 60) / 228) * (13.75-(13.75)));
            yy = 0 + (((tickAnim - 60) / 228) * (0-(0)));
            zz = 0 + (((tickAnim - 60) / 228) * (0-(0)));
        }
        else if (tickAnim >= 288 && tickAnim < 340) {
            xx = 13.75 + (((tickAnim - 288) / 52) * (0-(13.75)));
            yy = 0 + (((tickAnim - 288) / 52) * (0-(0)));
            zz = 0 + (((tickAnim - 288) / 52) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftArm, leftArm.rotateAngleX + (float) Math.toRadians(xx), leftArm.rotateAngleY + (float) Math.toRadians(yy), leftArm.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 60) {
            xx = 0 + (((tickAnim - 0) / 60) * (-11.75-(0)));
            yy = 0 + (((tickAnim - 0) / 60) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 60) * (0-(0)));
        }
        else if (tickAnim >= 60 && tickAnim < 288) {
            xx = -11.75 + (((tickAnim - 60) / 228) * (-11.75-(-11.75)));
            yy = 0 + (((tickAnim - 60) / 228) * (0-(0)));
            zz = 0 + (((tickAnim - 60) / 228) * (0-(0)));
        }
        else if (tickAnim >= 288 && tickAnim < 340) {
            xx = -11.75 + (((tickAnim - 288) / 52) * (0-(-11.75)));
            yy = 0 + (((tickAnim - 288) / 52) * (0-(0)));
            zz = 0 + (((tickAnim - 288) / 52) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftArm2, leftArm2.rotateAngleX + (float) Math.toRadians(xx), leftArm2.rotateAngleY + (float) Math.toRadians(yy), leftArm2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 60) {
            xx = 0 + (((tickAnim - 0) / 60) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 60) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 60) * (0-(0)));
        }
        else if (tickAnim >= 60 && tickAnim < 288) {
            xx = 0 + (((tickAnim - 60) / 228) * (0-(0)));
            yy = 0 + (((tickAnim - 60) / 228) * (0-(0)));
            zz = 0 + (((tickAnim - 60) / 228) * (0-(0)));
        }
        else if (tickAnim >= 288 && tickAnim < 340) {
            xx = 0 + (((tickAnim - 288) / 52) * (0-(0)));
            yy = 0 + (((tickAnim - 288) / 52) * (0-(0)));
            zz = 0 + (((tickAnim - 288) / 52) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftArm3, leftArm3.rotateAngleX + (float) Math.toRadians(xx), leftArm3.rotateAngleY + (float) Math.toRadians(yy), leftArm3.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 60) {
            xx = 0 + (((tickAnim - 0) / 60) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 60) * (-0.65-(0)));
            zz = 0 + (((tickAnim - 0) / 60) * (0-(0)));
        }
        else if (tickAnim >= 60 && tickAnim < 288) {
            xx = 0 + (((tickAnim - 60) / 228) * (0-(0)));
            yy = -0.65 + (((tickAnim - 60) / 228) * (-0.65-(-0.65)));
            zz = 0 + (((tickAnim - 60) / 228) * (0-(0)));
        }
        else if (tickAnim >= 288 && tickAnim < 340) {
            xx = 0 + (((tickAnim - 288) / 52) * (0-(0)));
            yy = -0.65 + (((tickAnim - 288) / 52) * (0-(-0.65)));
            zz = 0 + (((tickAnim - 288) / 52) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.leftArm3.rotationPointX = this.leftArm3.rotationPointX + (float)(xx);
        this.leftArm3.rotationPointY = this.leftArm3.rotationPointY - (float)(yy);
        this.leftArm3.rotationPointZ = this.leftArm3.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 60) {
            xx = 0 + (((tickAnim - 0) / 60) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 60) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 60) * (0-(0)));
        }
        else if (tickAnim >= 60 && tickAnim < 288) {
            xx = 0 + (((tickAnim - 60) / 228) * (0-(0)));
            yy = 0 + (((tickAnim - 60) / 228) * (0-(0)));
            zz = 0 + (((tickAnim - 60) / 228) * (0-(0)));
        }
        else if (tickAnim >= 288 && tickAnim < 340) {
            xx = 0 + (((tickAnim - 288) / 52) * (0-(0)));
            yy = 0 + (((tickAnim - 288) / 52) * (0-(0)));
            zz = 0 + (((tickAnim - 288) / 52) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightLeg, rightLeg.rotateAngleX + (float) Math.toRadians(xx), rightLeg.rotateAngleY + (float) Math.toRadians(yy), rightLeg.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 60) {
            xx = 0 + (((tickAnim - 0) / 60) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 60) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 60) * (0-(0)));
        }
        else if (tickAnim >= 60 && tickAnim < 288) {
            xx = 0 + (((tickAnim - 60) / 228) * (0-(0)));
            yy = 0 + (((tickAnim - 60) / 228) * (0-(0)));
            zz = 0 + (((tickAnim - 60) / 228) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightLeg2, rightLeg2.rotateAngleX + (float) Math.toRadians(xx), rightLeg2.rotateAngleY + (float) Math.toRadians(yy), rightLeg2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 60) {
            xx = 0 + (((tickAnim - 0) / 60) * (9.5-(0)));
            yy = 0 + (((tickAnim - 0) / 60) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 60) * (0-(0)));
        }
        else if (tickAnim >= 60 && tickAnim < 288) {
            xx = 9.5 + (((tickAnim - 60) / 228) * (9.5-(9.5)));
            yy = 0 + (((tickAnim - 60) / 228) * (0-(0)));
            zz = 0 + (((tickAnim - 60) / 228) * (0-(0)));
        }
        else if (tickAnim >= 288 && tickAnim < 340) {
            xx = 9.5 + (((tickAnim - 288) / 52) * (0-(9.5)));
            yy = 0 + (((tickAnim - 288) / 52) * (0-(0)));
            zz = 0 + (((tickAnim - 288) / 52) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightLeg3, rightLeg3.rotateAngleX + (float) Math.toRadians(xx), rightLeg3.rotateAngleY + (float) Math.toRadians(yy), rightLeg3.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 60) {
            xx = 0 + (((tickAnim - 0) / 60) * (-13.37686-(0)));
            yy = 0 + (((tickAnim - 0) / 60) * (-0.9777-(0)));
            zz = 0 + (((tickAnim - 0) / 60) * (-0.74198-(0)));
        }
        else if (tickAnim >= 60 && tickAnim < 288) {
            xx = -13.37686 + (((tickAnim - 60) / 228) * (-13.37686-(-13.37686)));
            yy = -0.9777 + (((tickAnim - 60) / 228) * (-0.9777-(-0.9777)));
            zz = -0.74198 + (((tickAnim - 60) / 228) * (-0.74198-(-0.74198)));
        }
        else if (tickAnim >= 288 && tickAnim < 340) {
            xx = -13.37686 + (((tickAnim - 288) / 52) * (0-(-13.37686)));
            yy = -0.9777 + (((tickAnim - 288) / 52) * (0-(-0.9777)));
            zz = -0.74198 + (((tickAnim - 288) / 52) * (0-(-0.74198)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightLeg4, rightLeg4.rotateAngleX + (float) Math.toRadians(xx), rightLeg4.rotateAngleY + (float) Math.toRadians(yy), rightLeg4.rotateAngleZ + (float) Math.toRadians(zz));

        this.rightLeg4.rotationPointX = this.rightLeg4.rotationPointX + (float)(0);
        this.rightLeg4.rotationPointY = this.rightLeg4.rotationPointY - (float)(0);
        this.rightLeg4.rotationPointZ = this.rightLeg4.rotationPointZ + (float)(0);


        this.setRotateAngle(rightLeg5, rightLeg5.rotateAngleX + (float) Math.toRadians(0), rightLeg5.rotateAngleY + (float) Math.toRadians(0), rightLeg5.rotateAngleZ + (float) Math.toRadians(0));



        if (tickAnim >= 0 && tickAnim < 60) {
            xx = 0 + (((tickAnim - 0) / 60) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 60) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 60) * (0-(0)));
        }
        else if (tickAnim >= 60 && tickAnim < 288) {
            xx = 0 + (((tickAnim - 60) / 228) * (0-(0)));
            yy = 0 + (((tickAnim - 60) / 228) * (0-(0)));
            zz = 0 + (((tickAnim - 60) / 228) * (0-(0)));
        }
        else if (tickAnim >= 288 && tickAnim < 340) {
            xx = 0 + (((tickAnim - 288) / 52) * (0-(0)));
            yy = 0 + (((tickAnim - 288) / 52) * (0-(0)));
            zz = 0 + (((tickAnim - 288) / 52) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftLeg, leftLeg.rotateAngleX + (float) Math.toRadians(xx), leftLeg.rotateAngleY + (float) Math.toRadians(yy), leftLeg.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 60) {
            xx = 0 + (((tickAnim - 0) / 60) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 60) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 60) * (0-(0)));
        }
        else if (tickAnim >= 60 && tickAnim < 288) {
            xx = 0 + (((tickAnim - 60) / 228) * (0-(0)));
            yy = 0 + (((tickAnim - 60) / 228) * (0-(0)));
            zz = 0 + (((tickAnim - 60) / 228) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftLeg2, leftLeg2.rotateAngleX + (float) Math.toRadians(xx), leftLeg2.rotateAngleY + (float) Math.toRadians(yy), leftLeg2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 60) {
            xx = 0 + (((tickAnim - 0) / 60) * (9.5-(0)));
            yy = 0 + (((tickAnim - 0) / 60) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 60) * (0-(0)));
        }
        else if (tickAnim >= 60 && tickAnim < 288) {
            xx = 9.5 + (((tickAnim - 60) / 228) * (9.5-(9.5)));
            yy = 0 + (((tickAnim - 60) / 228) * (0-(0)));
            zz = 0 + (((tickAnim - 60) / 228) * (0-(0)));
        }
        else if (tickAnim >= 288 && tickAnim < 340) {
            xx = 9.5 + (((tickAnim - 288) / 52) * (0-(9.5)));
            yy = 0 + (((tickAnim - 288) / 52) * (0-(0)));
            zz = 0 + (((tickAnim - 288) / 52) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftLeg3, leftLeg3.rotateAngleX + (float) Math.toRadians(xx), leftLeg3.rotateAngleY + (float) Math.toRadians(yy), leftLeg3.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 60) {
            xx = 0 + (((tickAnim - 0) / 60) * (-13.37686-(0)));
            yy = 0 + (((tickAnim - 0) / 60) * (-0.9777-(0)));
            zz = 0 + (((tickAnim - 0) / 60) * (-0.74198-(0)));
        }
        else if (tickAnim >= 60 && tickAnim < 288) {
            xx = -13.37686 + (((tickAnim - 60) / 228) * (-13.37686-(-13.37686)));
            yy = -0.9777 + (((tickAnim - 60) / 228) * (-0.9777-(-0.9777)));
            zz = -0.74198 + (((tickAnim - 60) / 228) * (-0.74198-(-0.74198)));
        }
        else if (tickAnim >= 288 && tickAnim < 340) {
            xx = -13.37686 + (((tickAnim - 288) / 52) * (0-(-13.37686)));
            yy = -0.9777 + (((tickAnim - 288) / 52) * (0-(-0.9777)));
            zz = -0.74198 + (((tickAnim - 288) / 52) * (0-(-0.74198)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftLeg4, leftLeg4.rotateAngleX + (float) Math.toRadians(xx), leftLeg4.rotateAngleY + (float) Math.toRadians(yy), leftLeg4.rotateAngleZ + (float) Math.toRadians(zz));

        this.leftLeg4.rotationPointX = this.leftLeg4.rotationPointX + (float)(0);
        this.leftLeg4.rotationPointY = this.leftLeg4.rotationPointY - (float)(0);
        this.leftLeg4.rotationPointZ = this.leftLeg4.rotationPointZ + (float)(0);


        this.setRotateAngle(leftLeg5, leftLeg5.rotateAngleX + (float) Math.toRadians(0), leftLeg5.rotateAngleY + (float) Math.toRadians(0), leftLeg5.rotateAngleZ + (float) Math.toRadians(0));



        if (tickAnim >= 0 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 0) / 50) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 50) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 50) * (0-(0)));
        }
        else if (tickAnim >= 50 && tickAnim < 65) {
            xx = 0 + (((tickAnim - 50) / 15) * (-12.5-(0)));
            yy = 0 + (((tickAnim - 50) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 50) / 15) * (0-(0)));
        }
        else if (tickAnim >= 65 && tickAnim < 78) {
            xx = -12.5 + (((tickAnim - 65) / 13) * (0-(-12.5)));
            yy = 0 + (((tickAnim - 65) / 13) * (0-(0)));
            zz = 0 + (((tickAnim - 65) / 13) * (0-(0)));
        }
        else if (tickAnim >= 78 && tickAnim < 100) {
            xx = 0 + (((tickAnim - 78) / 22) * (12.25-(0)));
            yy = 0 + (((tickAnim - 78) / 22) * (0-(0)));
            zz = 0 + (((tickAnim - 78) / 22) * (0-(0)));
        }
        else if (tickAnim >= 100 && tickAnim < 122) {
            xx = 12.25 + (((tickAnim - 100) / 22) * (12.25-(12.25)));
            yy = 0 + (((tickAnim - 100) / 22) * (0-(0)));
            zz = 0 + (((tickAnim - 100) / 22) * (0-(0)));
        }
        else if (tickAnim >= 122 && tickAnim < 130) {
            xx = 12.25 + (((tickAnim - 122) / 8) * (12.25-(12.25)));
            yy = 0 + (((tickAnim - 122) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 122) / 8) * (0-(0)));
        }
        else if (tickAnim >= 130 && tickAnim < 140) {
            xx = 12.25 + (((tickAnim - 130) / 10) * (-5-(12.25)));
            yy = 0 + (((tickAnim - 130) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 130) / 10) * (0-(0)));
        }
        else if (tickAnim >= 140 && tickAnim < 145) {
            xx = -5 + (((tickAnim - 140) / 5) * (-5-(-5)));
            yy = 0 + (((tickAnim - 140) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 140) / 5) * (0-(0)));
        }
        else if (tickAnim >= 145 && tickAnim < 182) {
            xx = -5 + (((tickAnim - 145) / 37) * (12.25-(-5)));
            yy = 0 + (((tickAnim - 145) / 37) * (0-(0)));
            zz = 0 + (((tickAnim - 145) / 37) * (0-(0)));
        }
        else if (tickAnim >= 182 && tickAnim < 288) {
            xx = 12.25 + (((tickAnim - 182) / 106) * (12.25-(12.25)));
            yy = 0 + (((tickAnim - 182) / 106) * (0-(0)));
            zz = 0 + (((tickAnim - 182) / 106) * (0-(0)));
        }
        else if (tickAnim >= 288 && tickAnim < 340) {
            xx = 12.25 + (((tickAnim - 288) / 52) * (0-(12.25)));
            yy = 0 + (((tickAnim - 288) / 52) * (0-(0)));
            zz = 0 + (((tickAnim - 288) / 52) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(head, head.rotateAngleX + (float) Math.toRadians(xx), head.rotateAngleY + (float) Math.toRadians(yy), head.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 60) {
            xx = 0 + (((tickAnim - 0) / 60) * (-40.5-(0)));
            yy = 0 + (((tickAnim - 0) / 60) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 60) * (0-(0)));
        }
        else if (tickAnim >= 60 && tickAnim < 288) {
            xx = -40.5 + (((tickAnim - 60) / 228) * (-40.5-(-40.5)));
            yy = 0 + (((tickAnim - 60) / 228) * (0-(0)));
            zz = 0 + (((tickAnim - 60) / 228) * (0-(0)));
        }
        else if (tickAnim >= 288 && tickAnim < 315) {
            xx = -40.5 + (((tickAnim - 288) / 27) * (11.4-(-40.5)));
            yy = 0 + (((tickAnim - 288) / 27) * (0-(0)));
            zz = 0 + (((tickAnim - 288) / 27) * (0-(0)));
        }
        else if (tickAnim >= 315 && tickAnim < 340) {
            xx = 11.4 + (((tickAnim - 315) / 25) * (0-(11.4)));
            yy = 0 + (((tickAnim - 315) / 25) * (0-(0)));
            zz = 0 + (((tickAnim - 315) / 25) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightArm, rightArm.rotateAngleX + (float) Math.toRadians(xx), rightArm.rotateAngleY + (float) Math.toRadians(yy), rightArm.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 30) {
            xx = 0 + (((tickAnim - 0) / 30) * (-54.8549+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50+30))*40-(0)));
            yy = 0 + (((tickAnim - 0) / 30) * (2.92252-(0)));
            zz = 0 + (((tickAnim - 0) / 30) * (2.35436-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 60) {
            xx = -54.8549+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50+30))*40 + (((tickAnim - 30) / 30) * (-9.50984-(-54.8549+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50+30))*40)));
            yy = 2.92252 + (((tickAnim - 30) / 30) * (5.84504-(2.92252)));
            zz = 2.35436 + (((tickAnim - 30) / 30) * (4.70873-(2.35436)));
        }
        else if (tickAnim >= 60 && tickAnim < 288) {
            xx = -9.50984 + (((tickAnim - 60) / 228) * (-9.50984-(-9.50984)));
            yy = 5.84504 + (((tickAnim - 60) / 228) * (5.84504-(5.84504)));
            zz = 4.70873 + (((tickAnim - 60) / 228) * (4.70873-(4.70873)));
        }
        else if (tickAnim >= 288 && tickAnim < 300) {
            xx = -9.50984 + (((tickAnim - 288) / 12) * (-27.39371-(-9.50984)));
            yy = 5.84504 + (((tickAnim - 288) / 12) * (4.52519-(5.84504)));
            zz = 4.70873 + (((tickAnim - 288) / 12) * (3.64547-(4.70873)));
        }
        else if (tickAnim >= 300 && tickAnim < 315) {
            xx = -27.39371 + (((tickAnim - 300) / 15) * (-40.10154-(-27.39371)));
            yy = 4.52519 + (((tickAnim - 300) / 15) * (2.82825-(4.52519)));
            zz = 3.64547 + (((tickAnim - 300) / 15) * (2.27842-(3.64547)));
        }
        else if (tickAnim >= 315 && tickAnim < 340) {
            xx = -40.10154 + (((tickAnim - 315) / 25) * (0-(-40.10154)));
            yy = 2.82825 + (((tickAnim - 315) / 25) * (0-(2.82825)));
            zz = 2.27842 + (((tickAnim - 315) / 25) * (0-(2.27842)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightArm2, rightArm2.rotateAngleX + (float) Math.toRadians(xx), rightArm2.rotateAngleY + (float) Math.toRadians(yy), rightArm2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 26) {
            xx = 0 + (((tickAnim - 0) / 26) * (-33.2584+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50+20))*120-(0)));
            yy = 0 + (((tickAnim - 0) / 26) * (-0.51813-(0)));
            zz = 0 + (((tickAnim - 0) / 26) * (-0.43735-(0)));
        }
        else if (tickAnim >= 26 && tickAnim < 60) {
            xx = -33.2584+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50+20))*120 + (((tickAnim - 26) / 34) * (37.55374-(-33.2584+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50+20))*120)));
            yy = -0.51813 + (((tickAnim - 26) / 34) * (-2.86965-(-0.51813)));
            zz = -0.43735 + (((tickAnim - 26) / 34) * (-2.42226-(-0.43735)));
        }
        else if (tickAnim >= 60 && tickAnim < 288) {
            xx = 37.55374 + (((tickAnim - 60) / 228) * (37.55374-(37.55374)));
            yy = -2.86965 + (((tickAnim - 60) / 228) * (-2.86965-(-2.86965)));
            zz = -2.42226 + (((tickAnim - 60) / 228) * (-2.42226-(-2.42226)));
        }
        else if (tickAnim >= 288 && tickAnim < 315) {
            xx = 37.55374 + (((tickAnim - 288) / 27) * (73.67117-(37.55374)));
            yy = -2.86965 + (((tickAnim - 288) / 27) * (-1.38854-(-2.86965)));
            zz = -2.42226 + (((tickAnim - 288) / 27) * (-1.17206-(-2.42226)));
        }
        else if (tickAnim >= 315 && tickAnim < 340) {
            xx = 73.67117 + (((tickAnim - 315) / 25) * (0-(73.67117)));
            yy = -1.38854 + (((tickAnim - 315) / 25) * (0-(-1.38854)));
            zz = -1.17206 + (((tickAnim - 315) / 25) * (0-(-1.17206)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightArm3, rightArm3.rotateAngleX + (float) Math.toRadians(xx), rightArm3.rotateAngleY + (float) Math.toRadians(yy), rightArm3.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 11) {
            xx = 0 + (((tickAnim - 0) / 11) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 11) * (-0.635-(0)));
            zz = 0 + (((tickAnim - 0) / 11) * (-0.23-(0)));
        }
        else if (tickAnim >= 11 && tickAnim < 30) {
            xx = 0 + (((tickAnim - 11) / 19) * (0-(0)));
            yy = -0.635 + (((tickAnim - 11) / 19) * (-0.45-(-0.635)));
            zz = -0.23 + (((tickAnim - 11) / 19) * (-0.65-(-0.23)));
        }
        else if (tickAnim >= 30 && tickAnim < 288) {
            xx = 0 + (((tickAnim - 30) / 258) * (0-(0)));
            yy = -0.45 + (((tickAnim - 30) / 258) * (0-(-0.45)));
            zz = -0.65 + (((tickAnim - 30) / 258) * (0-(-0.65)));
        }
        else if (tickAnim >= 288 && tickAnim < 315) {
            xx = 0 + (((tickAnim - 288) / 27) * (0-(0)));
            yy = 0 + (((tickAnim - 288) / 27) * (-0.665-(0)));
            zz = 0 + (((tickAnim - 288) / 27) * (-0.05-(0)));
        }
        else if (tickAnim >= 315 && tickAnim < 340) {
            xx = 0 + (((tickAnim - 315) / 25) * (0-(0)));
            yy = -0.665 + (((tickAnim - 315) / 25) * (0-(-0.665)));
            zz = -0.05 + (((tickAnim - 315) / 25) * (0-(-0.05)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.rightArm3.rotationPointX = this.rightArm3.rotationPointX + (float)(xx);
        this.rightArm3.rotationPointY = this.rightArm3.rotationPointY - (float)(yy);
        this.rightArm3.rotationPointZ = this.rightArm3.rotationPointZ + (float)(zz);

    }
    public void animNoise(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime, double animTick) {
        EntityPrehistoricFloraOlorotitan entity = (EntityPrehistoricFloraOlorotitan) entitylivingbaseIn;
        int animCycle = 70;
        double tickAnim = animTick + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;
         if (tickAnim >= 0 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 0) / 20) * (14.675+Math.sin((Math.PI/180)*(((double)tickAnim/20)*100))*-15-(0)));
            yy = 0 + (((tickAnim - 0) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 20) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 40) {
            xx = 14.675+Math.sin((Math.PI/180)*(((double)tickAnim/20)*100))*-15 + (((tickAnim - 20) / 20) * (-15.775+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*25-(14.675+Math.sin((Math.PI/180)*(((double)tickAnim/20)*100))*-15)));
            yy = 0 + (((tickAnim - 20) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 20) * (0-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 70) {
            xx = -15.775+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*25 + (((tickAnim - 40) / 30) * (0-(-15.775+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*25)));
            yy = 0 + (((tickAnim - 40) / 30) * (0-(0)));
            zz = 0 + (((tickAnim - 40) / 30) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck1, neck1.rotateAngleX + (float) Math.toRadians(xx), neck1.rotateAngleY + (float) Math.toRadians(yy), neck1.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 0) / 20) * (-8.35+Math.sin((Math.PI/180)*(((double)tickAnim/20)*100-50))*15-(0)));
            yy = 0 + (((tickAnim - 0) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 20) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 40) {
            xx = -8.35+Math.sin((Math.PI/180)*(((double)tickAnim/20)*100-50))*15 + (((tickAnim - 20) / 20) * (1.725+Math.sin((Math.PI/180)*(((double)tickAnim/20)*100+20))*5-(-8.35+Math.sin((Math.PI/180)*(((double)tickAnim/20)*100-50))*15)));
            yy = 0 + (((tickAnim - 20) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 20) * (0-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 70) {
            xx = 1.725+Math.sin((Math.PI/180)*(((double)tickAnim/20)*100+20))*5 + (((tickAnim - 40) / 30) * (0-(1.725+Math.sin((Math.PI/180)*(((double)tickAnim/20)*100+20))*5)));
            yy = 0 + (((tickAnim - 40) / 30) * (0-(0)));
            zz = 0 + (((tickAnim - 40) / 30) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck2, neck2.rotateAngleX + (float) Math.toRadians(xx), neck2.rotateAngleY + (float) Math.toRadians(yy), neck2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 0) / 20) * (4.1+Math.sin((Math.PI/180)*(((double)tickAnim/20)*100-100))*-15-(0)));
            yy = 0 + (((tickAnim - 0) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 20) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 40) {
            xx = 4.1+Math.sin((Math.PI/180)*(((double)tickAnim/20)*100-100))*-15 + (((tickAnim - 20) / 20) * (11.075+Math.sin((Math.PI/180)*(((double)tickAnim/20)*100-100))*-20-(4.1+Math.sin((Math.PI/180)*(((double)tickAnim/20)*100-100))*-15)));
            yy = 0 + (((tickAnim - 20) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 20) * (0-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 70) {
            xx = 11.075+Math.sin((Math.PI/180)*(((double)tickAnim/20)*100-100))*-20 + (((tickAnim - 40) / 30) * (0-(11.075+Math.sin((Math.PI/180)*(((double)tickAnim/20)*100-100))*-20)));
            yy = 0 + (((tickAnim - 40) / 30) * (0-(0)));
            zz = 0 + (((tickAnim - 40) / 30) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck3, neck3.rotateAngleX + (float) Math.toRadians(xx), neck3.rotateAngleY + (float) Math.toRadians(yy), neck3.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 40) {
            xx = 0 + (((tickAnim - 0) / 40) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 40) * (-0.525-(0)));
            zz = 0 + (((tickAnim - 0) / 40) * (-0.225-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 70) {
            xx = 0 + (((tickAnim - 40) / 30) * (0-(0)));
            yy = -0.525 + (((tickAnim - 40) / 30) * (0-(-0.525)));
            zz = -0.225 + (((tickAnim - 40) / 30) * (0-(-0.225)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.neck3.rotationPointX = this.neck3.rotationPointX + (float)(xx);
        this.neck3.rotationPointY = this.neck3.rotationPointY - (float)(yy);
        this.neck3.rotationPointZ = this.neck3.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 0) / 20) * (-11.075+Math.sin((Math.PI/180)*(((double)tickAnim/20)*100-150))*-15-(0)));
            yy = 0 + (((tickAnim - 0) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 20) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 21) {
            xx = -11.075+Math.sin((Math.PI/180)*(((double)tickAnim/20)*100-150))*-15 + (((tickAnim - 20) / 1) * (0-(-11.075+Math.sin((Math.PI/180)*(((double)tickAnim/20)*100-150))*-15)));
            yy = 0 + (((tickAnim - 20) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 1) * (0-(0)));
        }
        else if (tickAnim >= 21 && tickAnim < 40) {
            xx = 0 + (((tickAnim - 21) / 19) * (-9.25-(0)));
            yy = 0 + (((tickAnim - 21) / 19) * (0-(0)));
            zz = 0 + (((tickAnim - 21) / 19) * (0-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 70) {
            xx = -9.25 + (((tickAnim - 40) / 30) * (0-(-9.25)));
            yy = 0 + (((tickAnim - 40) / 30) * (0-(0)));
            zz = 0 + (((tickAnim - 40) / 30) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck4, neck4.rotateAngleX + (float) Math.toRadians(xx), neck4.rotateAngleY + (float) Math.toRadians(yy), neck4.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 0) / 20) * (-14.575+Math.sin((Math.PI/180)*(((double)tickAnim/20)*100))*15-(0)));
            yy = 0 + (((tickAnim - 0) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 20) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 21) {
            xx = -14.575+Math.sin((Math.PI/180)*(((double)tickAnim/20)*100))*15 + (((tickAnim - 20) / 1) * (0-(-14.575+Math.sin((Math.PI/180)*(((double)tickAnim/20)*100))*15)));
            yy = 0 + (((tickAnim - 20) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 1) * (0-(0)));
        }
        else if (tickAnim >= 21 && tickAnim < 70) {
            xx = 0 + (((tickAnim - 21) / 49) * (0-(0)));
            yy = 0 + (((tickAnim - 21) / 49) * (0-(0)));
            zz = 0 + (((tickAnim - 21) / 49) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(head, head.rotateAngleX + (float) Math.toRadians(xx), head.rotateAngleY + (float) Math.toRadians(yy), head.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 19) {
            xx = 0 + (((tickAnim - 0) / 19) * (25.15+Math.sin((Math.PI/180)*(((double)tickAnim/20)*100))*-25-(0)));
            yy = 0 + (((tickAnim - 0) / 19) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 19) * (0-(0)));
        }
        else if (tickAnim >= 19 && tickAnim < 21) {
            xx = 25.15+Math.sin((Math.PI/180)*(((double)tickAnim/20)*100))*-25 + (((tickAnim - 19) / 2) * (0-(25.15+Math.sin((Math.PI/180)*(((double)tickAnim/20)*100))*-25)));
            yy = 0 + (((tickAnim - 19) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 19) / 2) * (0-(0)));
        }
        else if (tickAnim >= 21 && tickAnim < 40) {
            xx = 0 + (((tickAnim - 21) / 19) * (18.25-(0)));
            yy = 0 + (((tickAnim - 21) / 19) * (0-(0)));
            zz = 0 + (((tickAnim - 21) / 19) * (0-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 70) {
            xx = 18.25 + (((tickAnim - 40) / 30) * (0-(18.25)));
            yy = 0 + (((tickAnim - 40) / 30) * (0-(0)));
            zz = 0 + (((tickAnim - 40) / 30) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(lowerjawback, lowerjawback.rotateAngleX + (float) Math.toRadians(xx), lowerjawback.rotateAngleY + (float) Math.toRadians(yy), lowerjawback.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 19 && tickAnim < 35) {
            xx = 0 + (((tickAnim - 19) / 16) * (0-(0)));
            yy = 0 + (((tickAnim - 19) / 16) * (0-(0)));
            zz = 0 + (((tickAnim - 19) / 16) * (24.25-(0)));
        }
        else if (tickAnim >= 35 && tickAnim < 40) {
            xx = 0 + (((tickAnim - 35) / 5) * (0-(0)));
            yy = 0 + (((tickAnim - 35) / 5) * (0-(0)));
            zz = 24.25 + (((tickAnim - 35) / 5) * (24.25-(24.25)));
        }
        else if (tickAnim >= 40 && tickAnim < 70) {
            xx = 0 + (((tickAnim - 40) / 30) * (0-(0)));
            yy = 0 + (((tickAnim - 40) / 30) * (0-(0)));
            zz = 24.25 + (((tickAnim - 40) / 30) * (0-(24.25)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightnasalsac, rightnasalsac.rotateAngleX + (float) Math.toRadians(xx), rightnasalsac.rotateAngleY + (float) Math.toRadians(yy), rightnasalsac.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 19) {
            xx = 0 + (((tickAnim - 0) / 19) * (0.35-(0)));
            yy = 0 + (((tickAnim - 0) / 19) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 19) * (0-(0)));
        }
        else if (tickAnim >= 19 && tickAnim < 35) {
            xx = 0.35 + (((tickAnim - 19) / 16) * (-0.4-(0.35)));
            yy = 0 + (((tickAnim - 19) / 16) * (0.525-(0)));
            zz = 0 + (((tickAnim - 19) / 16) * (0-(0)));
        }
        else if (tickAnim >= 35 && tickAnim < 40) {
            xx = -0.4 + (((tickAnim - 35) / 5) * (-0.4-(-0.4)));
            yy = 0.525 + (((tickAnim - 35) / 5) * (0.525-(0.525)));
            zz = 0 + (((tickAnim - 35) / 5) * (0-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 70) {
            xx = -0.4 + (((tickAnim - 40) / 30) * (0-(-0.4)));
            yy = 0.525 + (((tickAnim - 40) / 30) * (0-(0.525)));
            zz = 0 + (((tickAnim - 40) / 30) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.rightnasalsac.rotationPointX = this.rightnasalsac.rotationPointX + (float)(xx);
        this.rightnasalsac.rotationPointY = this.rightnasalsac.rotationPointY - (float)(yy);
        this.rightnasalsac.rotationPointZ = this.rightnasalsac.rotationPointZ + (float)(zz);


        if (tickAnim >= 0 && tickAnim < 19) {
            xx = 1 + (((tickAnim - 0) / 19) * (0.8-(1)));
            yy = 1 + (((tickAnim - 0) / 19) * (1-(1)));
            zz = 1 + (((tickAnim - 0) / 19) * (1-(1)));
        }
        else if (tickAnim >= 19 && tickAnim < 35) {
            xx = 0.8 + (((tickAnim - 19) / 16) * (1+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1000))*0.25-(0.8)));
            yy = 1 + (((tickAnim - 19) / 16) * (1-(1)));
            zz = 1 + (((tickAnim - 19) / 16) * (1-(1)));
        }
        else if (tickAnim >= 35 && tickAnim < 40) {
            xx = 1+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1000))*0.25 + (((tickAnim - 35) / 5) * (1-(1+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1000))*0.25)));
            yy = 1 + (((tickAnim - 35) / 5) * (1-(1)));
            zz = 1 + (((tickAnim - 35) / 5) * (1-(1)));
        }
        else if (tickAnim >= 40 && tickAnim < 70) {
            xx = 1 + (((tickAnim - 40) / 30) * (1-(1)));
            yy = 1 + (((tickAnim - 40) / 30) * (1-(1)));
            zz = 1 + (((tickAnim - 40) / 30) * (1-(1)));
        }
        else {
            xx = 1;
            yy = 1;
            zz = 1;
        }
        this.rightnasalsac.setScale((float)xx, (float)yy, (float)zz);




        if (tickAnim >= 0 && tickAnim < 19) {
            xx = 0 + (((tickAnim - 0) / 19) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 19) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 19) * (0-(0)));
        }
        else if (tickAnim >= 19 && tickAnim < 35) {
            xx = 0 + (((tickAnim - 19) / 16) * (0-(0)));
            yy = 0 + (((tickAnim - 19) / 16) * (0-(0)));
            zz = 0 + (((tickAnim - 19) / 16) * (-24.25-(0)));
        }
        else if (tickAnim >= 35 && tickAnim < 40) {
            xx = 0 + (((tickAnim - 35) / 5) * (0-(0)));
            yy = 0 + (((tickAnim - 35) / 5) * (0-(0)));
            zz = -24.25 + (((tickAnim - 35) / 5) * (-24.25-(-24.25)));
        }
        else if (tickAnim >= 40 && tickAnim < 70) {
            xx = 0 + (((tickAnim - 40) / 30) * (0-(0)));
            yy = 0 + (((tickAnim - 40) / 30) * (0-(0)));
            zz = -24.25 + (((tickAnim - 40) / 30) * (0-(-24.25)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftnasalsac, leftnasalsac.rotateAngleX + (float) Math.toRadians(xx), leftnasalsac.rotateAngleY + (float) Math.toRadians(yy), leftnasalsac.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 19) {
            xx = 0 + (((tickAnim - 0) / 19) * (-0.35-(0)));
            yy = 0 + (((tickAnim - 0) / 19) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 19) * (0-(0)));
        }
        else if (tickAnim >= 19 && tickAnim < 35) {
            xx = -0.35 + (((tickAnim - 19) / 16) * (0.4-(-0.35)));
            yy = 0 + (((tickAnim - 19) / 16) * (0.525-(0)));
            zz = 0 + (((tickAnim - 19) / 16) * (0-(0)));
        }
        else if (tickAnim >= 35 && tickAnim < 40) {
            xx = 0.4 + (((tickAnim - 35) / 5) * (0.4-(0.4)));
            yy = 0.525 + (((tickAnim - 35) / 5) * (0.525-(0.525)));
            zz = 0 + (((tickAnim - 35) / 5) * (0-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 70) {
            xx = 0.4 + (((tickAnim - 40) / 30) * (0-(0.4)));
            yy = 0.525 + (((tickAnim - 40) / 30) * (0-(0.525)));
            zz = 0 + (((tickAnim - 40) / 30) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.leftnasalsac.rotationPointX = this.leftnasalsac.rotationPointX + (float)(xx);
        this.leftnasalsac.rotationPointY = this.leftnasalsac.rotationPointY - (float)(yy);
        this.leftnasalsac.rotationPointZ = this.leftnasalsac.rotationPointZ + (float)(zz);


        if (tickAnim >= 0 && tickAnim < 19) {
            xx = 1 + (((tickAnim - 0) / 19) * (0.8-(1)));
            yy = 1 + (((tickAnim - 0) / 19) * (1-(1)));
            zz = 1 + (((tickAnim - 0) / 19) * (1-(1)));
        }
        else if (tickAnim >= 19 && tickAnim < 35) {
            xx = 0.8 + (((tickAnim - 19) / 16) * (1+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1000))*0.25-(0.8)));
            yy = 1 + (((tickAnim - 19) / 16) * (1-(1)));
            zz = 1 + (((tickAnim - 19) / 16) * (1-(1)));
        }
        else if (tickAnim >= 35 && tickAnim < 40) {
            xx = 1+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1000))*0.25 + (((tickAnim - 35) / 5) * (1-(1+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1000))*0.25)));
            yy = 1 + (((tickAnim - 35) / 5) * (1-(1)));
            zz = 1 + (((tickAnim - 35) / 5) * (1-(1)));
        }
        else if (tickAnim >= 40 && tickAnim < 70) {
            xx = 1 + (((tickAnim - 40) / 30) * (1-(1)));
            yy = 1 + (((tickAnim - 40) / 30) * (1-(1)));
            zz = 1 + (((tickAnim - 40) / 30) * (1-(1)));
        }
        else {
            xx = 1;
            yy = 1;
            zz = 1;
        }
        this.leftnasalsac.setScale((float)xx, (float)yy, (float)zz);

    }
    public void animEat(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime, double animTick) {
        EntityPrehistoricFloraOlorotitan entity = (EntityPrehistoricFloraOlorotitan) entitylivingbaseIn;
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
        else if (tickAnim >= 10 && tickAnim < 20) {
            xx = 8 + (((tickAnim - 10) / 10) * (0-(8)));
            yy = 0 + (((tickAnim - 10) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 10) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(body, body.rotateAngleX + (float) Math.toRadians(xx), body.rotateAngleY + (float) Math.toRadians(yy), body.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 0) / 10) * (9.5-(0)));
            yy = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 20) {
            xx = 9.5 + (((tickAnim - 10) / 10) * (0-(9.5)));
            yy = 0 + (((tickAnim - 10) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 10) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(chest, chest.rotateAngleX + (float) Math.toRadians(xx), chest.rotateAngleY + (float) Math.toRadians(yy), chest.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 0) / 10) * (29-(0)));
            yy = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 20) {
            xx = 29 + (((tickAnim - 10) / 10) * (0-(29)));
            yy = 0 + (((tickAnim - 10) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 10) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck1, neck1.rotateAngleX + (float) Math.toRadians(xx), neck1.rotateAngleY + (float) Math.toRadians(yy), neck1.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 10) * (-0.775-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (-2.275-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 10) / 10) * (0-(0)));
            yy = -0.775 + (((tickAnim - 10) / 10) * (0-(-0.775)));
            zz = -2.275 + (((tickAnim - 10) / 10) * (0-(-2.275)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.neck1.rotationPointX = this.neck1.rotationPointX + (float)(xx);
        this.neck1.rotationPointY = this.neck1.rotationPointY - (float)(yy);
        this.neck1.rotationPointZ = this.neck1.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 0) / 5) * (31.25-(0)));
            yy = 0 + (((tickAnim - 0) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 5) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 10) {
            xx = 31.25 + (((tickAnim - 5) / 5) * (42.75-(31.25)));
            yy = 0 + (((tickAnim - 5) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 5) / 5) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 20) {
            xx = 42.75 + (((tickAnim - 10) / 10) * (0-(42.75)));
            yy = 0 + (((tickAnim - 10) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 10) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck3, neck3.rotateAngleX + (float) Math.toRadians(xx), neck3.rotateAngleY + (float) Math.toRadians(yy), neck3.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 0) / 5) * (13.405+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*-100-(0)));
            yy = 0 + (((tickAnim - 0) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 5) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 10) {
            xx = 13.405+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*-100 + (((tickAnim - 5) / 5) * (-23-(13.405+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*-100)));
            yy = 0 + (((tickAnim - 5) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 5) / 5) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 20) {
            xx = -23 + (((tickAnim - 10) / 10) * (0-(-23)));
            yy = 0 + (((tickAnim - 10) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 10) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck4, neck4.rotateAngleX + (float) Math.toRadians(xx), neck4.rotateAngleY + (float) Math.toRadians(yy), neck4.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 0) / 5) * (3.18+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*100-(0)));
            yy = 0 + (((tickAnim - 0) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 5) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 10) {
            xx = 3.18+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*100 + (((tickAnim - 5) / 5) * (1-(3.18+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*100)));
            yy = 0 + (((tickAnim - 5) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 5) / 5) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 20) {
            xx = 1 + (((tickAnim - 10) / 10) * (0-(1)));
            yy = 0 + (((tickAnim - 10) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 10) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(head, head.rotateAngleX + (float) Math.toRadians(xx), head.rotateAngleY + (float) Math.toRadians(yy), head.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 0) / 5) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 5) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 5) / 3) * (17.25-(0)));
            yy = 0 + (((tickAnim - 5) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 5) / 3) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 10) {
            xx = 17.25 + (((tickAnim - 8) / 2) * (0-(17.25)));
            yy = 0 + (((tickAnim - 8) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 2) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(lowerjawback, lowerjawback.rotateAngleX + (float) Math.toRadians(xx), lowerjawback.rotateAngleY + (float) Math.toRadians(yy), lowerjawback.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 0) / 10) * (-46.5-(0)));
            yy = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 20) {
            xx = -46.5 + (((tickAnim - 10) / 10) * (0-(-46.5)));
            yy = 0 + (((tickAnim - 10) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 10) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightArm, rightArm.rotateAngleX + (float) Math.toRadians(xx), rightArm.rotateAngleY + (float) Math.toRadians(yy), rightArm.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 0) / 10) * (-14-(0)));
            yy = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (12.25-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 20) {
            xx = -14 + (((tickAnim - 10) / 10) * (0-(-14)));
            yy = 0 + (((tickAnim - 10) / 10) * (0-(0)));
            zz = 12.25 + (((tickAnim - 10) / 10) * (0-(12.25)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightArm2, rightArm2.rotateAngleX + (float) Math.toRadians(xx), rightArm2.rotateAngleY + (float) Math.toRadians(yy), rightArm2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 0) / 10) * (36.75-(0)));
            yy = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 20) {
            xx = 36.75 + (((tickAnim - 10) / 10) * (0-(36.75)));
            yy = 0 + (((tickAnim - 10) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 10) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightArm3, rightArm3.rotateAngleX + (float) Math.toRadians(xx), rightArm3.rotateAngleY + (float) Math.toRadians(yy), rightArm3.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 0) / 5) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 5) * (1-(0)));
            zz = 0 + (((tickAnim - 0) / 5) * (-0.425-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 5) / 5) * (0-(0)));
            yy = 1 + (((tickAnim - 5) / 5) * (0-(1)));
            zz = -0.425 + (((tickAnim - 5) / 5) * (0-(-0.425)));
        }
        else if (tickAnim >= 10 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 10) / 10) * (0-(0)));
            yy = 0 + (((tickAnim - 10) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 10) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.rightArm3.rotationPointX = this.rightArm3.rotationPointX + (float)(xx);
        this.rightArm3.rotationPointY = this.rightArm3.rotationPointY - (float)(yy);
        this.rightArm3.rotationPointZ = this.rightArm3.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 0) / 10) * (-46.5-(0)));
            yy = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 20) {
            xx = -46.5 + (((tickAnim - 10) / 10) * (0-(-46.5)));
            yy = 0 + (((tickAnim - 10) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 10) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftArm, leftArm.rotateAngleX + (float) Math.toRadians(xx), leftArm.rotateAngleY + (float) Math.toRadians(yy), leftArm.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 0) / 10) * (-14-(0)));
            yy = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (-12.25-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 20) {
            xx = -14 + (((tickAnim - 10) / 10) * (0-(-14)));
            yy = 0 + (((tickAnim - 10) / 10) * (0-(0)));
            zz = -12.25 + (((tickAnim - 10) / 10) * (0-(-12.25)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftArm2, leftArm2.rotateAngleX + (float) Math.toRadians(xx), leftArm2.rotateAngleY + (float) Math.toRadians(yy), leftArm2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 0) / 10) * (36.75-(0)));
            yy = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 20) {
            xx = 36.75 + (((tickAnim - 10) / 10) * (0-(36.75)));
            yy = 0 + (((tickAnim - 10) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 10) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftArm3, leftArm3.rotateAngleX + (float) Math.toRadians(xx), leftArm3.rotateAngleY + (float) Math.toRadians(yy), leftArm3.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 0) / 5) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 5) * (1-(0)));
            zz = 0 + (((tickAnim - 0) / 5) * (-0.425-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 5) / 5) * (0-(0)));
            yy = 1 + (((tickAnim - 5) / 5) * (0-(1)));
            zz = -0.425 + (((tickAnim - 5) / 5) * (0-(-0.425)));
        }
        else if (tickAnim >= 10 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 10) / 10) * (0-(0)));
            yy = 0 + (((tickAnim - 10) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 10) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.leftArm3.rotationPointX = this.leftArm3.rotationPointX + (float)(xx);
        this.leftArm3.rotationPointY = this.leftArm3.rotationPointY - (float)(yy);
        this.leftArm3.rotationPointZ = this.leftArm3.rotationPointZ + (float)(zz);

    }
    public void animDisplay(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime, double animTick) {
        EntityPrehistoricFloraOlorotitan entity = (EntityPrehistoricFloraOlorotitan) entitylivingbaseIn;
        int animCycle = 140;
        double tickAnim = animTick + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;
         if (tickAnim >= 0 && tickAnim < 59) {
            xx = 0 + (((tickAnim - 0) / 59) * (-21.21093-(0)));
            yy = 0 + (((tickAnim - 0) / 59) * (3.595-(0)));
            zz = 0 + (((tickAnim - 0) / 59) * (0.35688-(0)));
        }
        else if (tickAnim >= 59 && tickAnim < 60) {
            xx = -21.21093 + (((tickAnim - 59) / 1) * (-21.21093-(-21.21093)));
            yy = 3.595 + (((tickAnim - 59) / 1) * (-6.255+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50-50))*10-(3.595)));
            zz = 0.35688 + (((tickAnim - 59) / 1) * (0.35688-(0.35688)));
        }
        else if (tickAnim >= 60 && tickAnim < 110) {
            xx = -21.21093 + (((tickAnim - 60) / 50) * (-21.21093-(-21.21093)));
            yy = -6.255+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50-50))*10 + (((tickAnim - 60) / 50) * (-12.49499-(-6.255+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50-50))*10)));
            zz = 0.35688 + (((tickAnim - 60) / 50) * (-0.35688-(0.35688)));
        }
        else if (tickAnim >= 110 && tickAnim < 140) {
            xx = -21.21093 + (((tickAnim - 110) / 30) * (0-(-21.21093)));
            yy = -12.49499 + (((tickAnim - 110) / 30) * (0-(-12.49499)));
            zz = -0.35688 + (((tickAnim - 110) / 30) * (0-(-0.35688)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(hips, hips.rotateAngleX + (float) Math.toRadians(xx), hips.rotateAngleY + (float) Math.toRadians(yy), hips.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 60) {
            xx = 0 + (((tickAnim - 0) / 60) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 60) * (-4.85-(0)));
            zz = 0 + (((tickAnim - 0) / 60) * (0-(0)));
        }
        else if (tickAnim >= 60 && tickAnim < 110) {
            xx = 0 + (((tickAnim - 60) / 50) * (0-(0)));
            yy = -4.85 + (((tickAnim - 60) / 50) * (-4.85-(-4.85)));
            zz = 0 + (((tickAnim - 60) / 50) * (0-(0)));
        }
        else if (tickAnim >= 110 && tickAnim < 140) {
            xx = 0 + (((tickAnim - 110) / 30) * (0-(0)));
            yy = -4.85 + (((tickAnim - 110) / 30) * (0-(-4.85)));
            zz = 0 + (((tickAnim - 110) / 30) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.hips.rotationPointX = this.hips.rotationPointX + (float)(xx);
        this.hips.rotationPointY = this.hips.rotationPointY - (float)(yy);
        this.hips.rotationPointZ = this.hips.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 60) {
            xx = 0 + (((tickAnim - 0) / 60) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 60) * (2.75+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*5-(0)));
            zz = 0 + (((tickAnim - 0) / 60) * (0-(0)));
        }
        else if (tickAnim >= 60 && tickAnim < 110) {
            xx = 0 + (((tickAnim - 60) / 50) * (0-(0)));
            yy = 2.75+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*5 + (((tickAnim - 60) / 50) * (4.05+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*5-(2.75+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*5)));
            zz = 0 + (((tickAnim - 60) / 50) * (0-(0)));
        }
        else if (tickAnim >= 110 && tickAnim < 140) {
            xx = 0 + (((tickAnim - 110) / 30) * (0-(0)));
            yy = 4.05+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*5 + (((tickAnim - 110) / 30) * (0-(4.05+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*5)));
            zz = 0 + (((tickAnim - 110) / 30) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tail1, tail1.rotateAngleX + (float) Math.toRadians(xx), tail1.rotateAngleY + (float) Math.toRadians(yy), tail1.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 60) {
            xx = 0 + (((tickAnim - 0) / 60) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 60) * (8.5-(0)));
            zz = 0 + (((tickAnim - 0) / 60) * (0-(0)));
        }
        else if (tickAnim >= 60 && tickAnim < 110) {
            xx = 0 + (((tickAnim - 60) / 50) * (0-(0)));
            yy = 8.5 + (((tickAnim - 60) / 50) * (-8.5-(8.5)));
            zz = 0 + (((tickAnim - 60) / 50) * (0-(0)));
        }
        else if (tickAnim >= 110 && tickAnim < 140) {
            xx = 0 + (((tickAnim - 110) / 30) * (0-(0)));
            yy = -8.5 + (((tickAnim - 110) / 30) * (0-(-8.5)));
            zz = 0 + (((tickAnim - 110) / 30) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tail2, tail2.rotateAngleX + (float) Math.toRadians(xx), tail2.rotateAngleY + (float) Math.toRadians(yy), tail2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 60) {
            xx = 0 + (((tickAnim - 0) / 60) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 60) * (9.25-(0)));
            zz = 0 + (((tickAnim - 0) / 60) * (0-(0)));
        }
        else if (tickAnim >= 60 && tickAnim < 110) {
            xx = 0 + (((tickAnim - 60) / 50) * (0-(0)));
            yy = 9.25 + (((tickAnim - 60) / 50) * (-9.25-(9.25)));
            zz = 0 + (((tickAnim - 60) / 50) * (0-(0)));
        }
        else if (tickAnim >= 110 && tickAnim < 140) {
            xx = 0 + (((tickAnim - 110) / 30) * (0-(0)));
            yy = -9.25 + (((tickAnim - 110) / 30) * (0-(-9.25)));
            zz = 0 + (((tickAnim - 110) / 30) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tail3, tail3.rotateAngleX + (float) Math.toRadians(xx), tail3.rotateAngleY + (float) Math.toRadians(yy), tail3.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 25) {
            xx = 0 + (((tickAnim - 0) / 25) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 25) * (-9.17+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50-50))*30-(0)));
            zz = 0 + (((tickAnim - 0) / 25) * (0-(0)));
        }
        else if (tickAnim >= 25 && tickAnim < 60) {
            xx = 0 + (((tickAnim - 25) / 35) * (0-(0)));
            yy = -9.17+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50-50))*30 + (((tickAnim - 25) / 35) * (-12+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50-50))*30-(-9.17+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50-50))*30)));
            zz = 0 + (((tickAnim - 25) / 35) * (0-(0)));
        }
        else if (tickAnim >= 60 && tickAnim < 83) {
            xx = 0 + (((tickAnim - 60) / 23) * (0-(0)));
            yy = -12+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50-50))*30 + (((tickAnim - 60) / 23) * (-11.37+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50-50))*30-(-12+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50-50))*30)));
            zz = 0 + (((tickAnim - 60) / 23) * (0-(0)));
        }
        else if (tickAnim >= 83 && tickAnim < 110) {
            xx = 0 + (((tickAnim - 83) / 27) * (0-(0)));
            yy = -11.37+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50-50))*30 + (((tickAnim - 83) / 27) * (-17-(-11.37+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50-50))*30)));
            zz = 0 + (((tickAnim - 83) / 27) * (0-(0)));
        }
        else if (tickAnim >= 110 && tickAnim < 140) {
            xx = 0 + (((tickAnim - 110) / 30) * (0-(0)));
            yy = -17 + (((tickAnim - 110) / 30) * (0-(-17)));
            zz = 0 + (((tickAnim - 110) / 30) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tail4, tail4.rotateAngleX + (float) Math.toRadians(xx), tail4.rotateAngleY + (float) Math.toRadians(yy), tail4.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 25) {
            xx = 0 + (((tickAnim - 0) / 25) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 25) * (-10.69-(0)));
            zz = 0 + (((tickAnim - 0) / 25) * (0-(0)));
        }
        else if (tickAnim >= 25 && tickAnim < 60) {
            xx = 0 + (((tickAnim - 25) / 35) * (0-(0)));
            yy = -10.69 + (((tickAnim - 25) / 35) * (12.75-(-10.69)));
            zz = 0 + (((tickAnim - 25) / 35) * (0-(0)));
        }
        else if (tickAnim >= 60 && tickAnim < 83) {
            xx = 0 + (((tickAnim - 60) / 23) * (0-(0)));
            yy = 12.75 + (((tickAnim - 60) / 23) * (20.76-(12.75)));
            zz = 0 + (((tickAnim - 60) / 23) * (0-(0)));
        }
        else if (tickAnim >= 83 && tickAnim < 110) {
            xx = 0 + (((tickAnim - 83) / 27) * (0-(0)));
            yy = 20.76 + (((tickAnim - 83) / 27) * (-12.75-(20.76)));
            zz = 0 + (((tickAnim - 83) / 27) * (0-(0)));
        }
        else if (tickAnim >= 110 && tickAnim < 140) {
            xx = 0 + (((tickAnim - 110) / 30) * (0-(0)));
            yy = -12.75 + (((tickAnim - 110) / 30) * (0-(-12.75)));
            zz = 0 + (((tickAnim - 110) / 30) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tail5, tail5.rotateAngleX + (float) Math.toRadians(xx), tail5.rotateAngleY + (float) Math.toRadians(yy), tail5.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 60) {
            xx = 0 + (((tickAnim - 0) / 60) * (8.75-(0)));
            yy = 0 + (((tickAnim - 0) / 60) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 60) * (0-(0)));
        }
        else if (tickAnim >= 60 && tickAnim < 110) {
            xx = 8.75 + (((tickAnim - 60) / 50) * (8.75-(8.75)));
            yy = 0 + (((tickAnim - 60) / 50) * (0-(0)));
            zz = 0 + (((tickAnim - 60) / 50) * (0-(0)));
        }
        else if (tickAnim >= 110 && tickAnim < 140) {
            xx = 8.75 + (((tickAnim - 110) / 30) * (0-(8.75)));
            yy = 0 + (((tickAnim - 110) / 30) * (0-(0)));
            zz = 0 + (((tickAnim - 110) / 30) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(body, body.rotateAngleX + (float) Math.toRadians(xx), body.rotateAngleY + (float) Math.toRadians(yy), body.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 60) {
            xx = 0 + (((tickAnim - 0) / 60) * (11-(0)));
            yy = 0 + (((tickAnim - 0) / 60) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 60) * (0-(0)));
        }
        else if (tickAnim >= 60 && tickAnim < 110) {
            xx = 11 + (((tickAnim - 60) / 50) * (11-(11)));
            yy = 0 + (((tickAnim - 60) / 50) * (0-(0)));
            zz = 0 + (((tickAnim - 60) / 50) * (0-(0)));
        }
        else if (tickAnim >= 110 && tickAnim < 140) {
            xx = 11 + (((tickAnim - 110) / 30) * (0-(11)));
            yy = 0 + (((tickAnim - 110) / 30) * (0-(0)));
            zz = 0 + (((tickAnim - 110) / 30) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(chest, chest.rotateAngleX + (float) Math.toRadians(xx), chest.rotateAngleY + (float) Math.toRadians(yy), chest.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 60) {
            xx = 0 + (((tickAnim - 0) / 60) * (-26.21135-(0)));
            yy = 0 + (((tickAnim - 0) / 60) * (3.84859-(0)));
            zz = 0 + (((tickAnim - 0) / 60) * (-8.44491-(0)));
        }
        else if (tickAnim >= 60 && tickAnim < 85) {
            xx = -26.21135 + (((tickAnim - 60) / 25) * (-49.735+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50-120))*40-(-26.21135)));
            yy = 3.84859 + (((tickAnim - 60) / 25) * (0-(3.84859)));
            zz = -8.44491 + (((tickAnim - 60) / 25) * (0-(-8.44491)));
        }
        else if (tickAnim >= 85 && tickAnim < 110) {
            xx = -49.735+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50-120))*40 + (((tickAnim - 85) / 25) * (-26.21135-(-49.735+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50-120))*40)));
            yy = 0 + (((tickAnim - 85) / 25) * (-3.84859-(0)));
            zz = 0 + (((tickAnim - 85) / 25) * (8.44491-(0)));
        }
        else if (tickAnim >= 110 && tickAnim < 125) {
            xx = -26.21135 + (((tickAnim - 110) / 15) * (-29.71135-(-26.21135)));
            yy = -3.84859 + (((tickAnim - 110) / 15) * (-3.84859-(-3.84859)));
            zz = 8.44491 + (((tickAnim - 110) / 15) * (8.44491-(8.44491)));
        }
        else if (tickAnim >= 125 && tickAnim < 140) {
            xx = -29.71135 + (((tickAnim - 125) / 15) * (0-(-29.71135)));
            yy = -3.84859 + (((tickAnim - 125) / 15) * (0-(-3.84859)));
            zz = 8.44491 + (((tickAnim - 125) / 15) * (0-(8.44491)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck1, neck1.rotateAngleX + (float) Math.toRadians(xx), neck1.rotateAngleY + (float) Math.toRadians(yy), neck1.rotateAngleZ + (float) Math.toRadians(zz));

        this.neck1.rotationPointX = this.neck1.rotationPointX + (float)(0);
        this.neck1.rotationPointY = this.neck1.rotationPointY - (float)(0);
        this.neck1.rotationPointZ = this.neck1.rotationPointZ + (float)(0);



        if (tickAnim >= 0 && tickAnim < 60) {
            xx = 0 + (((tickAnim - 0) / 60) * (13.25+Math.sin((Math.PI/180)*(((double)tickAnim/20)*100))*2-(0)));
            yy = 0 + (((tickAnim - 0) / 60) * (0-(0)));
            zz = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*500))*-2 + (((tickAnim - 0) / 60) * (5.75+Math.sin((Math.PI/180)*(((double)tickAnim/20)*500))*-2-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*500))*-2)));
        }
        else if (tickAnim >= 60 && tickAnim < 110) {
            xx = 13.25+Math.sin((Math.PI/180)*(((double)tickAnim/20)*100))*2 + (((tickAnim - 60) / 50) * (13.25-(13.25+Math.sin((Math.PI/180)*(((double)tickAnim/20)*100))*2)));
            yy = 0 + (((tickAnim - 60) / 50) * (0-(0)));
            zz = 5.75+Math.sin((Math.PI/180)*(((double)tickAnim/20)*500))*-2 + (((tickAnim - 60) / 50) * (-5.75+Math.sin((Math.PI/180)*(((double)tickAnim/20)*500))*-2-(5.75+Math.sin((Math.PI/180)*(((double)tickAnim/20)*500))*-2)));
        }
        else if (tickAnim >= 110 && tickAnim < 140) {
            xx = 13.25 + (((tickAnim - 110) / 30) * (0-(13.25)));
            yy = 0 + (((tickAnim - 110) / 30) * (0-(0)));
            zz = -5.75+Math.sin((Math.PI/180)*(((double)tickAnim/20)*500))*-2 + (((tickAnim - 110) / 30) * (0-(-5.75+Math.sin((Math.PI/180)*(((double)tickAnim/20)*500))*-2)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck3, neck3.rotateAngleX + (float) Math.toRadians(xx), neck3.rotateAngleY + (float) Math.toRadians(yy), neck3.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 60) {
            xx = 0 + (((tickAnim - 0) / 60) * (0.15-(0)));
            yy = 0 + (((tickAnim - 0) / 60) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 60) * (-2.075-(0)));
        }
        else if (tickAnim >= 60 && tickAnim < 110) {
            xx = 0.15 + (((tickAnim - 60) / 50) * (0.15-(0.15)));
            yy = 0 + (((tickAnim - 60) / 50) * (0-(0)));
            zz = -2.075 + (((tickAnim - 60) / 50) * (-2.075-(-2.075)));
        }
        else if (tickAnim >= 110 && tickAnim < 140) {
            xx = 0.15 + (((tickAnim - 110) / 30) * (0-(0.15)));
            yy = 0 + (((tickAnim - 110) / 30) * (0-(0)));
            zz = -2.075 + (((tickAnim - 110) / 30) * (0-(-2.075)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.neck3.rotationPointX = this.neck3.rotationPointX + (float)(xx);
        this.neck3.rotationPointY = this.neck3.rotationPointY - (float)(yy);
        this.neck3.rotationPointZ = this.neck3.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 30) {
            xx = 0 + (((tickAnim - 0) / 30) * (-11.12997-(0)));
            yy = 0 + (((tickAnim - 0) / 30) * (-0.10349-(0)));
            zz = 0 + (((tickAnim - 0) / 30) * (2.74806-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 60) {
            xx = -11.12997 + (((tickAnim - 30) / 30) * (-5.25993-(-11.12997)));
            yy = -0.10349 + (((tickAnim - 30) / 30) * (-0.20698-(-0.10349)));
            zz = 2.74806 + (((tickAnim - 30) / 30) * (5.49612-(2.74806)));
        }
        else if (tickAnim >= 60 && tickAnim < 85) {
            xx = -5.25993 + (((tickAnim - 60) / 25) * (2.24-(-5.25993)));
            yy = -0.20698 + (((tickAnim - 60) / 25) * (0-(-0.20698)));
            zz = 5.49612 + (((tickAnim - 60) / 25) * (0-(5.49612)));
        }
        else if (tickAnim >= 85 && tickAnim < 110) {
            xx = 2.24 + (((tickAnim - 85) / 25) * (-5.25993-(2.24)));
            yy = 0 + (((tickAnim - 85) / 25) * (0.20698-(0)));
            zz = 0 + (((tickAnim - 85) / 25) * (-5.49612-(0)));
        }
        else if (tickAnim >= 110 && tickAnim < 140) {
            xx = -5.25993 + (((tickAnim - 110) / 30) * (0-(-5.25993)));
            yy = 0.20698 + (((tickAnim - 110) / 30) * (0-(0.20698)));
            zz = -5.49612 + (((tickAnim - 110) / 30) * (0-(-5.49612)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck4, neck4.rotateAngleX + (float) Math.toRadians(xx), neck4.rotateAngleY + (float) Math.toRadians(yy), neck4.rotateAngleZ + (float) Math.toRadians(zz));

        this.neck4.rotationPointX = this.neck4.rotationPointX + (float)(0);
        this.neck4.rotationPointY = this.neck4.rotationPointY - (float)(0);
        this.neck4.rotationPointZ = this.neck4.rotationPointZ + (float)(0);



        if (tickAnim >= 15 && tickAnim < 30) {
            xx = 0 + (((tickAnim - 15) / 15) * (4.9+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50-50))*40-(0)));
            yy = 0 + (((tickAnim - 15) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 15) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 41) {
            xx = 4.9+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50-50))*40 + (((tickAnim - 30) / 11) * (21.75-(4.9+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50-50))*40)));
            yy = 0 + (((tickAnim - 30) / 11) * (0.375+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1000))*2-(0)));
            zz = 0 + (((tickAnim - 30) / 11) * (0.625+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1000))*2-(0)));
        }
        else if (tickAnim >= 41 && tickAnim < 60) {
            xx = 21.75 + (((tickAnim - 41) / 19) * (1.25-(21.75)));
            yy = 0.375+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1000))*2 + (((tickAnim - 41) / 19) * (0-(0.375+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1000))*2)));
            zz = 0.625+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1000))*2 + (((tickAnim - 41) / 19) * (0-(0.625+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1000))*2)));
        }
        else if (tickAnim >= 60 && tickAnim < 85) {
            xx = 1.25 + (((tickAnim - 60) / 25) * (-22.05+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50-120))*40-(1.25)));
            yy = 0 + (((tickAnim - 60) / 25) * (0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1000))*2-(0)));
            zz = 0 + (((tickAnim - 60) / 25) * (0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1000))*2-(0)));
        }
        else if (tickAnim >= 85 && tickAnim < 110) {
            xx = -22.05+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50-120))*40 + (((tickAnim - 85) / 25) * (1.25-(-22.05+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50-120))*40)));
            yy = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1000))*2 + (((tickAnim - 85) / 25) * (0-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1000))*2)));
            zz = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1000))*2 + (((tickAnim - 85) / 25) * (0-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1000))*2)));
        }
        else if (tickAnim >= 110 && tickAnim < 125) {
            xx = 1.25 + (((tickAnim - 110) / 15) * (29.25-(1.25)));
            yy = 0 + (((tickAnim - 110) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 110) / 15) * (0-(0)));
        }
        else if (tickAnim >= 125 && tickAnim < 140) {
            xx = 29.25 + (((tickAnim - 125) / 15) * (0-(29.25)));
            yy = 0 + (((tickAnim - 125) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 125) / 15) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(head, head.rotateAngleX + (float) Math.toRadians(xx), head.rotateAngleY + (float) Math.toRadians(yy), head.rotateAngleZ + (float) Math.toRadians(zz));

        this.head.rotationPointX = this.head.rotationPointX + (float)(0);
        this.head.rotationPointY = this.head.rotationPointY - (float)(0);
        this.head.rotationPointZ = this.head.rotationPointZ + (float)(0);



        if (tickAnim >= 15 && tickAnim < 30) {
            xx = 0 + (((tickAnim - 15) / 15) * (5.5-(0)));
            yy = 0 + (((tickAnim - 15) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 15) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 40) {
            xx = 5.5 + (((tickAnim - 30) / 10) * (0-(5.5)));
            yy = 0 + (((tickAnim - 30) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 30) / 10) * (0-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 110) {
            xx = 0 + (((tickAnim - 40) / 70) * (0-(0)));
            yy = 0 + (((tickAnim - 40) / 70) * (0-(0)));
            zz = 0 + (((tickAnim - 40) / 70) * (0-(0)));
        }
        else if (tickAnim >= 110 && tickAnim < 118) {
            xx = 0 + (((tickAnim - 110) / 8) * (11-(0)));
            yy = 0 + (((tickAnim - 110) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 110) / 8) * (0-(0)));
        }
        else if (tickAnim >= 118 && tickAnim < 125) {
            xx = 11 + (((tickAnim - 118) / 7) * (0-(11)));
            yy = 0 + (((tickAnim - 118) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 118) / 7) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(lowerjawback, lowerjawback.rotateAngleX + (float) Math.toRadians(xx), lowerjawback.rotateAngleY + (float) Math.toRadians(yy), lowerjawback.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 15 && tickAnim < 40) {
            xx = 0 + (((tickAnim - 15) / 25) * (0.0658-(0)));
            yy = 0 + (((tickAnim - 15) / 25) * (-13.05978-(0)));
            zz = 0 + (((tickAnim - 15) / 25) * (43.75709-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 110) {
            xx = 0.0658 + (((tickAnim - 40) / 70) * (0.0658-(0.0658)));
            yy = -13.05978 + (((tickAnim - 40) / 70) * (-13.05978-(-13.05978)));
            zz = 43.75709 + (((tickAnim - 40) / 70) * (43.75709-(43.75709)));
        }
        else if (tickAnim >= 110 && tickAnim < 125) {
            xx = 0.0658 + (((tickAnim - 110) / 15) * (0-(0.0658)));
            yy = -13.05978 + (((tickAnim - 110) / 15) * (0-(-13.05978)));
            zz = 43.75709 + (((tickAnim - 110) / 15) * (0-(43.75709)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightnasalsac, rightnasalsac.rotateAngleX + (float) Math.toRadians(xx), rightnasalsac.rotateAngleY + (float) Math.toRadians(yy), rightnasalsac.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 15 && tickAnim < 30) {
            xx = 1 + (((tickAnim - 15) / 15) * (-0.015-(1)));
            yy = 1 + (((tickAnim - 15) / 15) * (1-(1)));
            zz = 1 + (((tickAnim - 15) / 15) * (1-(1)));
        }
        else if (tickAnim >= 30 && tickAnim < 40) {
            xx = -0.015 + (((tickAnim - 30) / 10) * (-0.6325-(-0.015)));
            yy = 1 + (((tickAnim - 30) / 10) * (1-(1)));
            zz = 1 + (((tickAnim - 30) / 10) * (1-(1)));
        }
        else if (tickAnim >= 40 && tickAnim < 110) {
            xx = -0.6325 + (((tickAnim - 40) / 70) * (-0.6325-(-0.6325)));
            yy = 1 + (((tickAnim - 40) / 70) * (1-(1)));
            zz = 1 + (((tickAnim - 40) / 70) * (1-(1)));
        }
        else if (tickAnim >= 110 && tickAnim < 125) {
            xx = -0.6325 + (((tickAnim - 110) / 15) * (1-(-0.6325)));
            yy = 1 + (((tickAnim - 110) / 15) * (1-(1)));
            zz = 1 + (((tickAnim - 110) / 15) * (1-(1)));
        }
        else {
            xx = 1;
            yy = 1;
            zz = 1;
        }
        this.rightnasalsac.setScale((float)xx, (float)yy, (float)zz);




        if (tickAnim >= 15 && tickAnim < 40) {
            xx = 0 + (((tickAnim - 15) / 25) * (0.0658-(0)));
            yy = 0 + (((tickAnim - 15) / 25) * (13.05978-(0)));
            zz = 0 + (((tickAnim - 15) / 25) * (-43.75709-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 110) {
            xx = 0.0658 + (((tickAnim - 40) / 70) * (0.0658-(0.0658)));
            yy = 13.05978 + (((tickAnim - 40) / 70) * (13.05978-(13.05978)));
            zz = -43.75709 + (((tickAnim - 40) / 70) * (-43.75709-(-43.75709)));
        }
        else if (tickAnim >= 110 && tickAnim < 125) {
            xx = 0.0658 + (((tickAnim - 110) / 15) * (0-(0.0658)));
            yy = 13.05978 + (((tickAnim - 110) / 15) * (0-(13.05978)));
            zz = -43.75709 + (((tickAnim - 110) / 15) * (0-(-43.75709)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftnasalsac, leftnasalsac.rotateAngleX + (float) Math.toRadians(xx), leftnasalsac.rotateAngleY + (float) Math.toRadians(yy), leftnasalsac.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 15 && tickAnim < 30) {
            xx = 1 + (((tickAnim - 15) / 15) * (-0.015-(1)));
            yy = 1 + (((tickAnim - 15) / 15) * (1-(1)));
            zz = 1 + (((tickAnim - 15) / 15) * (1-(1)));
        }
        else if (tickAnim >= 30 && tickAnim < 40) {
            xx = -0.015 + (((tickAnim - 30) / 10) * (-0.6325-(-0.015)));
            yy = 1 + (((tickAnim - 30) / 10) * (1-(1)));
            zz = 1 + (((tickAnim - 30) / 10) * (1-(1)));
        }
        else if (tickAnim >= 40 && tickAnim < 110) {
            xx = -0.6325 + (((tickAnim - 40) / 70) * (-0.6325-(-0.6325)));
            yy = 1 + (((tickAnim - 40) / 70) * (1-(1)));
            zz = 1 + (((tickAnim - 40) / 70) * (1-(1)));
        }
        else if (tickAnim >= 110 && tickAnim < 125) {
            xx = -0.6325 + (((tickAnim - 110) / 15) * (1-(-0.6325)));
            yy = 1 + (((tickAnim - 110) / 15) * (1-(1)));
            zz = 1 + (((tickAnim - 110) / 15) * (1-(1)));
        }
        else {
            xx = 1;
            yy = 1;
            zz = 1;
        }
        this.leftnasalsac.setScale((float)xx, (float)yy, (float)zz);




        if (tickAnim >= 0 && tickAnim < 60) {
            xx = 0 + (((tickAnim - 0) / 60) * (-28.47677-(0)));
            yy = 0 + (((tickAnim - 0) / 60) * (-4.82128-(0)));
            zz = 0 + (((tickAnim - 0) / 60) * (-10.4461-(0)));
        }
        else if (tickAnim >= 60 && tickAnim < 110) {
            xx = -28.47677 + (((tickAnim - 60) / 50) * (-12.75-(-28.47677)));
            yy = -4.82128 + (((tickAnim - 60) / 50) * (0-(-4.82128)));
            zz = -10.4461 + (((tickAnim - 60) / 50) * (0-(-10.4461)));
        }
        else if (tickAnim >= 110 && tickAnim < 140) {
            xx = -12.75 + (((tickAnim - 110) / 30) * (0-(-12.75)));
            yy = 0 + (((tickAnim - 110) / 30) * (0-(0)));
            zz = 0 + (((tickAnim - 110) / 30) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightArm, rightArm.rotateAngleX + (float) Math.toRadians(xx), rightArm.rotateAngleY + (float) Math.toRadians(yy), rightArm.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 60) {
            xx = 0 + (((tickAnim - 0) / 60) * (28-(0)));
            yy = 0 + (((tickAnim - 0) / 60) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 60) * (0-(0)));
        }
        else if (tickAnim >= 60 && tickAnim < 110) {
            xx = 28 + (((tickAnim - 60) / 50) * (-32.75-(28)));
            yy = 0 + (((tickAnim - 60) / 50) * (0-(0)));
            zz = 0 + (((tickAnim - 60) / 50) * (0-(0)));
        }
        else if (tickAnim >= 110 && tickAnim < 140) {
            xx = -32.75 + (((tickAnim - 110) / 30) * (0-(-32.75)));
            yy = 0 + (((tickAnim - 110) / 30) * (0-(0)));
            zz = 0 + (((tickAnim - 110) / 30) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightArm2, rightArm2.rotateAngleX + (float) Math.toRadians(xx), rightArm2.rotateAngleY + (float) Math.toRadians(yy), rightArm2.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 60) {
            xx = 0 + (((tickAnim - 0) / 60) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 60) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 60) * (0-(0)));
        }
        else if (tickAnim >= 60 && tickAnim < 110) {
            xx = 0 + (((tickAnim - 60) / 50) * (0-(0)));
            yy = 0 + (((tickAnim - 60) / 50) * (-0.15-(0)));
            zz = 0 + (((tickAnim - 60) / 50) * (0.9-(0)));
        }
        else if (tickAnim >= 110 && tickAnim < 140) {
            xx = 0 + (((tickAnim - 110) / 30) * (0-(0)));
            yy = -0.15 + (((tickAnim - 110) / 30) * (0-(-0.15)));
            zz = 0.9 + (((tickAnim - 110) / 30) * (0-(0.9)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.rightArm2.rotationPointX = this.rightArm2.rotationPointX + (float)(xx);
        this.rightArm2.rotationPointY = this.rightArm2.rotationPointY - (float)(yy);
        this.rightArm2.rotationPointZ = this.rightArm2.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 60) {
            xx = 0 + (((tickAnim - 0) / 60) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 60) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 60) * (10.25-(0)));
        }
        else if (tickAnim >= 60 && tickAnim < 110) {
            xx = 0 + (((tickAnim - 60) / 50) * (74.75-(0)));
            yy = 0 + (((tickAnim - 60) / 50) * (0-(0)));
            zz = 10.25 + (((tickAnim - 60) / 50) * (0-(10.25)));
        }
        else if (tickAnim >= 110 && tickAnim < 140) {
            xx = 74.75 + (((tickAnim - 110) / 30) * (0-(74.75)));
            yy = 0 + (((tickAnim - 110) / 30) * (0-(0)));
            zz = 0 + (((tickAnim - 110) / 30) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightArm3, rightArm3.rotateAngleX + (float) Math.toRadians(xx), rightArm3.rotateAngleY + (float) Math.toRadians(yy), rightArm3.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 60) {
            xx = 0 + (((tickAnim - 0) / 60) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 60) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 60) * (0-(0)));
        }
        else if (tickAnim >= 60 && tickAnim < 110) {
            xx = 0 + (((tickAnim - 60) / 50) * (0-(0)));
            yy = 0 + (((tickAnim - 60) / 50) * (-0.55-(0)));
            zz = 0 + (((tickAnim - 60) / 50) * (0-(0)));
        }
        else if (tickAnim >= 110 && tickAnim < 140) {
            xx = 0 + (((tickAnim - 110) / 30) * (0-(0)));
            yy = -0.55 + (((tickAnim - 110) / 30) * (0-(-0.55)));
            zz = 0 + (((tickAnim - 110) / 30) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.rightArm3.rotationPointX = this.rightArm3.rotationPointX + (float)(xx);
        this.rightArm3.rotationPointY = this.rightArm3.rotationPointY - (float)(yy);
        this.rightArm3.rotationPointZ = this.rightArm3.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 60) {
            xx = 0 + (((tickAnim - 0) / 60) * (-12.75-(0)));
            yy = 0 + (((tickAnim - 0) / 60) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 60) * (0-(0)));
        }
        else if (tickAnim >= 60 && tickAnim < 80) {
            xx = -12.75 + (((tickAnim - 60) / 20) * (-17.50966-(-12.75)));
            yy = 0 + (((tickAnim - 60) / 20) * (-1.58564-(0)));
            zz = 0 + (((tickAnim - 60) / 20) * (-6.32285-(0)));
        }
        else if (tickAnim >= 80 && tickAnim < 110) {
            xx = -17.50966 + (((tickAnim - 80) / 30) * (-18.35833-(-17.50966)));
            yy = -1.58564 + (((tickAnim - 80) / 30) * (2.01005-(-1.58564)));
            zz = -6.32285 + (((tickAnim - 80) / 30) * (7.75203-(-6.32285)));
        }
        else if (tickAnim >= 110 && tickAnim < 140) {
            xx = -18.35833 + (((tickAnim - 110) / 30) * (0-(-18.35833)));
            yy = 2.01005 + (((tickAnim - 110) / 30) * (0-(2.01005)));
            zz = 7.75203 + (((tickAnim - 110) / 30) * (0-(7.75203)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftArm, leftArm.rotateAngleX + (float) Math.toRadians(xx), leftArm.rotateAngleY + (float) Math.toRadians(yy), leftArm.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 60) {
            xx = 0 + (((tickAnim - 0) / 60) * (-32.75-(0)));
            yy = 0 + (((tickAnim - 0) / 60) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 60) * (0-(0)));
        }
        else if (tickAnim >= 60 && tickAnim < 80) {
            xx = -32.75 + (((tickAnim - 60) / 20) * (28-(-32.75)));
            yy = 0 + (((tickAnim - 60) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 60) / 20) * (0-(0)));
        }
        else if (tickAnim >= 80 && tickAnim < 110) {
            xx = 28 + (((tickAnim - 80) / 30) * (27.25375-(28)));
            yy = 0 + (((tickAnim - 80) / 30) * (-2.57862-(0)));
            zz = 0 + (((tickAnim - 80) / 30) * (-8.91528-(0)));
        }
        else if (tickAnim >= 110 && tickAnim < 140) {
            xx = 27.25375 + (((tickAnim - 110) / 30) * (0-(27.25375)));
            yy = -2.57862 + (((tickAnim - 110) / 30) * (0-(-2.57862)));
            zz = -8.91528 + (((tickAnim - 110) / 30) * (0-(-8.91528)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftArm2, leftArm2.rotateAngleX + (float) Math.toRadians(xx), leftArm2.rotateAngleY + (float) Math.toRadians(yy), leftArm2.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 60) {
            xx = 0 + (((tickAnim - 0) / 60) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 60) * (-0.15-(0)));
            zz = 0 + (((tickAnim - 0) / 60) * (0.9-(0)));
        }
        else if (tickAnim >= 60 && tickAnim < 80) {
            xx = 0 + (((tickAnim - 60) / 20) * (0-(0)));
            yy = -0.15 + (((tickAnim - 60) / 20) * (0-(-0.15)));
            zz = 0.9 + (((tickAnim - 60) / 20) * (0-(0.9)));
        }
        else if (tickAnim >= 80 && tickAnim < 110) {
            xx = 0 + (((tickAnim - 80) / 30) * (0-(0)));
            yy = 0 + (((tickAnim - 80) / 30) * (0-(0)));
            zz = 0 + (((tickAnim - 80) / 30) * (0-(0)));
        }
        else if (tickAnim >= 110 && tickAnim < 140) {
            xx = 0 + (((tickAnim - 110) / 30) * (0-(0)));
            yy = 0 + (((tickAnim - 110) / 30) * (0-(0)));
            zz = 0 + (((tickAnim - 110) / 30) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.leftArm2.rotationPointX = this.leftArm2.rotationPointX + (float)(xx);
        this.leftArm2.rotationPointY = this.leftArm2.rotationPointY - (float)(yy);
        this.leftArm2.rotationPointZ = this.leftArm2.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 60) {
            xx = 0 + (((tickAnim - 0) / 60) * (74.75-(0)));
            yy = 0 + (((tickAnim - 0) / 60) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 60) * (0-(0)));
        }
        else if (tickAnim >= 60 && tickAnim < 80) {
            xx = 74.75 + (((tickAnim - 60) / 20) * (0-(74.75)));
            yy = 0 + (((tickAnim - 60) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 60) / 20) * (0-(0)));
        }
        else if (tickAnim >= 80 && tickAnim < 110) {
            xx = 0 + (((tickAnim - 80) / 30) * (0-(0)));
            yy = 0 + (((tickAnim - 80) / 30) * (0-(0)));
            zz = 0 + (((tickAnim - 80) / 30) * (0-(0)));
        }
        else if (tickAnim >= 110 && tickAnim < 140) {
            xx = 0 + (((tickAnim - 110) / 30) * (0-(0)));
            yy = 0 + (((tickAnim - 110) / 30) * (0-(0)));
            zz = 0 + (((tickAnim - 110) / 30) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftArm3, leftArm3.rotateAngleX + (float) Math.toRadians(xx), leftArm3.rotateAngleY + (float) Math.toRadians(yy), leftArm3.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 60) {
            xx = 0 + (((tickAnim - 0) / 60) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 60) * (-0.55-(0)));
            zz = 0 + (((tickAnim - 0) / 60) * (0-(0)));
        }
        else if (tickAnim >= 60 && tickAnim < 110) {
            xx = 0 + (((tickAnim - 60) / 50) * (0-(0)));
            yy = -0.55 + (((tickAnim - 60) / 50) * (0.05-(-0.55)));
            zz = 0 + (((tickAnim - 60) / 50) * (0-(0)));
        }
        else if (tickAnim >= 110 && tickAnim < 140) {
            xx = 0 + (((tickAnim - 110) / 30) * (0-(0)));
            yy = 0.05 + (((tickAnim - 110) / 30) * (0-(0.05)));
            zz = 0 + (((tickAnim - 110) / 30) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.leftArm3.rotationPointX = this.leftArm3.rotationPointX + (float)(xx);
        this.leftArm3.rotationPointY = this.leftArm3.rotationPointY - (float)(yy);
        this.leftArm3.rotationPointZ = this.leftArm3.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 0) / 15) * (-18.75-(0)));
            yy = 0 + (((tickAnim - 0) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 15) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 25) {
            xx = -18.75 + (((tickAnim - 15) / 10) * (-16.25-(-18.75)));
            yy = 0 + (((tickAnim - 15) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 10) * (0-(0)));
        }
        else if (tickAnim >= 25 && tickAnim < 60) {
            xx = -16.25 + (((tickAnim - 25) / 35) * (-9.00647-(-16.25)));
            yy = 0 + (((tickAnim - 25) / 35) * (6.0066-(0)));
            zz = 0 + (((tickAnim - 25) / 35) * (-6.30388-(0)));
        }
        else if (tickAnim >= 60 && tickAnim < 78) {
            xx = -9.00647 + (((tickAnim - 60) / 18) * (-9.26213-(-9.00647)));
            yy = 6.0066 + (((tickAnim - 60) / 18) * (5.90823-(6.0066)));
            zz = -6.30388 + (((tickAnim - 60) / 18) * (-2.22502-(-6.30388)));
        }
        else if (tickAnim >= 78 && tickAnim < 110) {
            xx = -9.26213 + (((tickAnim - 78) / 32) * (14.84173-(-9.26213)));
            yy = 5.90823 + (((tickAnim - 78) / 32) * (5.73832-(5.90823)));
            zz = -2.22502 + (((tickAnim - 78) / 32) * (4.82028-(-2.22502)));
        }
        else if (tickAnim >= 110 && tickAnim < 140) {
            xx = 14.84173 + (((tickAnim - 110) / 30) * (0-(14.84173)));
            yy = 5.73832 + (((tickAnim - 110) / 30) * (0-(5.73832)));
            zz = 4.82028 + (((tickAnim - 110) / 30) * (0-(4.82028)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightLeg, rightLeg.rotateAngleX + (float) Math.toRadians(xx), rightLeg.rotateAngleY + (float) Math.toRadians(yy), rightLeg.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 0) / 15) * (9.75-(0)));
            yy = 0 + (((tickAnim - 0) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 15) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 25) {
            xx = 9.75 + (((tickAnim - 15) / 10) * (-0.75-(9.75)));
            yy = 0 + (((tickAnim - 15) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 10) * (0-(0)));
        }
        else if (tickAnim >= 25 && tickAnim < 60) {
            xx = -0.75 + (((tickAnim - 25) / 35) * (14-(-0.75)));
            yy = 0 + (((tickAnim - 25) / 35) * (0-(0)));
            zz = 0 + (((tickAnim - 25) / 35) * (0-(0)));
        }
        else if (tickAnim >= 60 && tickAnim < 78) {
            xx = 14 + (((tickAnim - 60) / 18) * (8.98-(14)));
            yy = 0 + (((tickAnim - 60) / 18) * (0-(0)));
            zz = 0 + (((tickAnim - 60) / 18) * (0-(0)));
        }
        else if (tickAnim >= 78 && tickAnim < 96) {
            xx = 8.98 + (((tickAnim - 78) / 18) * (9.65+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*-50-(8.98)));
            yy = 0 + (((tickAnim - 78) / 18) * (0-(0)));
            zz = 0 + (((tickAnim - 78) / 18) * (0-(0)));
        }
        else if (tickAnim >= 96 && tickAnim < 110) {
            xx = 9.65+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*-50 + (((tickAnim - 96) / 14) * (23.5-(9.65+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*-50)));
            yy = 0 + (((tickAnim - 96) / 14) * (0-(0)));
            zz = 0 + (((tickAnim - 96) / 14) * (0-(0)));
        }
        else if (tickAnim >= 110 && tickAnim < 140) {
            xx = 23.5 + (((tickAnim - 110) / 30) * (0-(23.5)));
            yy = 0 + (((tickAnim - 110) / 30) * (0-(0)));
            zz = 0 + (((tickAnim - 110) / 30) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightLeg2, rightLeg2.rotateAngleX + (float) Math.toRadians(xx), rightLeg2.rotateAngleY + (float) Math.toRadians(yy), rightLeg2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 0) / 15) * (-30.25-(0)));
            yy = 0 + (((tickAnim - 0) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 15) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 25) {
            xx = -30.25 + (((tickAnim - 15) / 10) * (19.25-(-30.25)));
            yy = 0 + (((tickAnim - 15) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 10) * (0-(0)));
        }
        else if (tickAnim >= 25 && tickAnim < 60) {
            xx = 19.25 + (((tickAnim - 25) / 35) * (-10-(19.25)));
            yy = 0 + (((tickAnim - 25) / 35) * (0-(0)));
            zz = 0 + (((tickAnim - 25) / 35) * (0-(0)));
        }
        else if (tickAnim >= 60 && tickAnim < 78) {
            xx = -10 + (((tickAnim - 60) / 18) * (2-(-10)));
            yy = 0 + (((tickAnim - 60) / 18) * (0-(0)));
            zz = 0 + (((tickAnim - 60) / 18) * (0-(0)));
        }
        else if (tickAnim >= 78 && tickAnim < 96) {
            xx = 2 + (((tickAnim - 78) / 18) * (-37-(2)));
            yy = 0 + (((tickAnim - 78) / 18) * (0-(0)));
            zz = 0 + (((tickAnim - 78) / 18) * (0-(0)));
        }
        else if (tickAnim >= 96 && tickAnim < 110) {
            xx = -37 + (((tickAnim - 96) / 14) * (0-(-37)));
            yy = 0 + (((tickAnim - 96) / 14) * (0-(0)));
            zz = 0 + (((tickAnim - 96) / 14) * (0-(0)));
        }
        else if (tickAnim >= 110 && tickAnim < 140) {
            xx = 0 + (((tickAnim - 110) / 30) * (0-(0)));
            yy = 0 + (((tickAnim - 110) / 30) * (0-(0)));
            zz = 0 + (((tickAnim - 110) / 30) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightLeg3, rightLeg3.rotateAngleX + (float) Math.toRadians(xx), rightLeg3.rotateAngleY + (float) Math.toRadians(yy), rightLeg3.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 25) {
            xx = 0 + (((tickAnim - 0) / 25) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 25) * (-0.675-(0)));
            zz = 0 + (((tickAnim - 0) / 25) * (0-(0)));
        }
        else if (tickAnim >= 25 && tickAnim < 60) {
            xx = 0 + (((tickAnim - 25) / 35) * (0-(0)));
            yy = -0.675 + (((tickAnim - 25) / 35) * (-0.675-(-0.675)));
            zz = 0 + (((tickAnim - 25) / 35) * (0-(0)));
        }
        else if (tickAnim >= 60 && tickAnim < 110) {
            xx = 0 + (((tickAnim - 60) / 50) * (0-(0)));
            yy = -0.675 + (((tickAnim - 60) / 50) * (0-(-0.675)));
            zz = 0 + (((tickAnim - 60) / 50) * (0-(0)));
        }
        else if (tickAnim >= 110 && tickAnim < 140) {
            xx = 0 + (((tickAnim - 110) / 30) * (0-(0)));
            yy = 0 + (((tickAnim - 110) / 30) * (0-(0)));
            zz = 0 + (((tickAnim - 110) / 30) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.rightLeg3.rotationPointX = this.rightLeg3.rotationPointX + (float)(xx);
        this.rightLeg3.rotationPointY = this.rightLeg3.rotationPointY - (float)(yy);
        this.rightLeg3.rotationPointZ = this.rightLeg3.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 0) / 15) * (64-(0)));
            yy = 0 + (((tickAnim - 0) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 15) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 25) {
            xx = 64 + (((tickAnim - 15) / 10) * (4-(64)));
            yy = 0 + (((tickAnim - 15) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 10) * (0-(0)));
        }
        else if (tickAnim >= 25 && tickAnim < 60) {
            xx = 4 + (((tickAnim - 25) / 35) * (26.25897-(4)));
            yy = 0 + (((tickAnim - 25) / 35) * (-3.74922-(0)));
            zz = 0 + (((tickAnim - 25) / 35) * (7.35412-(0)));
        }
        else if (tickAnim >= 60 && tickAnim < 78) {
            xx = 26.25897 + (((tickAnim - 60) / 18) * (18.6621-(26.25897)));
            yy = -3.74922 + (((tickAnim - 60) / 18) * (-3.00119-(-3.74922)));
            zz = 7.35412 + (((tickAnim - 60) / 18) * (3.35457-(7.35412)));
        }
        else if (tickAnim >= 78 && tickAnim < 96) {
            xx = 18.6621 + (((tickAnim - 78) / 18) * (78.90837-(18.6621)));
            yy = -3.00119 + (((tickAnim - 78) / 18) * (-0.46594-(-3.00119)));
            zz = 3.35457 + (((tickAnim - 78) / 18) * (0.01795-(3.35457)));
        }
        else if (tickAnim >= 96 && tickAnim < 110) {
            xx = 78.90837 + (((tickAnim - 96) / 14) * (-16.5-(78.90837)));
            yy = -0.46594 + (((tickAnim - 96) / 14) * (0-(-0.46594)));
            zz = 0.01795 + (((tickAnim - 96) / 14) * (0-(0.01795)));
        }
        else if (tickAnim >= 110 && tickAnim < 140) {
            xx = -16.5 + (((tickAnim - 110) / 30) * (0-(-16.5)));
            yy = 0 + (((tickAnim - 110) / 30) * (0-(0)));
            zz = 0 + (((tickAnim - 110) / 30) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightLeg4, rightLeg4.rotateAngleX + (float) Math.toRadians(xx), rightLeg4.rotateAngleY + (float) Math.toRadians(yy), rightLeg4.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 0) / 15) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 15) * (-0.95-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 25) {
            xx = 0 + (((tickAnim - 15) / 10) * (0-(0)));
            yy = 0 + (((tickAnim - 15) / 10) * (1.35-(0)));
            zz = -0.95 + (((tickAnim - 15) / 10) * (0-(-0.95)));
        }
        else if (tickAnim >= 25 && tickAnim < 60) {
            xx = 0 + (((tickAnim - 25) / 35) * (0-(0)));
            yy = 1.35 + (((tickAnim - 25) / 35) * (0-(1.35)));
            zz = 0 + (((tickAnim - 25) / 35) * (0-(0)));
        }
        else if (tickAnim >= 60 && tickAnim < 78) {
            xx = 0 + (((tickAnim - 60) / 18) * (0-(0)));
            yy = 0 + (((tickAnim - 60) / 18) * (2.075-(0)));
            zz = 0 + (((tickAnim - 60) / 18) * (0-(0)));
        }
        else if (tickAnim >= 78 && tickAnim < 110) {
            xx = 0 + (((tickAnim - 78) / 32) * (0-(0)));
            yy = 2.075 + (((tickAnim - 78) / 32) * (-0.075-(2.075)));
            zz = 0 + (((tickAnim - 78) / 32) * (0-(0)));
        }
        else if (tickAnim >= 110 && tickAnim < 140) {
            xx = 0 + (((tickAnim - 110) / 30) * (0-(0)));
            yy = -0.075 + (((tickAnim - 110) / 30) * (0-(-0.075)));
            zz = 0 + (((tickAnim - 110) / 30) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.rightLeg4.rotationPointX = this.rightLeg4.rotationPointX + (float)(xx);
        this.rightLeg4.rotationPointY = this.rightLeg4.rotationPointY - (float)(yy);
        this.rightLeg4.rotationPointZ = this.rightLeg4.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 60) {
            xx = 0 + (((tickAnim - 0) / 60) * (15.79275-(0)));
            yy = 0 + (((tickAnim - 0) / 60) * (-11.38201-(0)));
            zz = 0 + (((tickAnim - 0) / 60) * (-2.93701-(0)));
        }
        else if (tickAnim >= 60 && tickAnim < 110) {
            xx = 15.79275 + (((tickAnim - 60) / 50) * (0-(15.79275)));
            yy = -11.38201 + (((tickAnim - 60) / 50) * (0-(-11.38201)));
            zz = -2.93701 + (((tickAnim - 60) / 50) * (0-(-2.93701)));
        }
        else if (tickAnim >= 110 && tickAnim < 140) {
            xx = 0 + (((tickAnim - 110) / 30) * (0-(0)));
            yy = 0 + (((tickAnim - 110) / 30) * (0-(0)));
            zz = 0 + (((tickAnim - 110) / 30) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftLeg, leftLeg.rotateAngleX + (float) Math.toRadians(xx), leftLeg.rotateAngleY + (float) Math.toRadians(yy), leftLeg.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 60) {
            xx = 0 + (((tickAnim - 0) / 60) * (23.25-(0)));
            yy = 0 + (((tickAnim - 0) / 60) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 60) * (0-(0)));
        }
        else if (tickAnim >= 60 && tickAnim < 110) {
            xx = 23.25 + (((tickAnim - 60) / 50) * (27.25-(23.25)));
            yy = 0 + (((tickAnim - 60) / 50) * (0-(0)));
            zz = 0 + (((tickAnim - 60) / 50) * (0-(0)));
        }
        else if (tickAnim >= 110 && tickAnim < 140) {
            xx = 27.25 + (((tickAnim - 110) / 30) * (0-(27.25)));
            yy = 0 + (((tickAnim - 110) / 30) * (0-(0)));
            zz = 0 + (((tickAnim - 110) / 30) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftLeg2, leftLeg2.rotateAngleX + (float) Math.toRadians(xx), leftLeg2.rotateAngleY + (float) Math.toRadians(yy), leftLeg2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 60) {
            xx = 0 + (((tickAnim - 0) / 60) * (-17.75-(0)));
            yy = 0 + (((tickAnim - 0) / 60) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 60) * (0-(0)));
        }
        else if (tickAnim >= 60 && tickAnim < 110) {
            xx = -17.75 + (((tickAnim - 60) / 50) * (-5.25-(-17.75)));
            yy = 0 + (((tickAnim - 60) / 50) * (0-(0)));
            zz = 0 + (((tickAnim - 60) / 50) * (0-(0)));
        }
        else if (tickAnim >= 110 && tickAnim < 140) {
            xx = -5.25 + (((tickAnim - 110) / 30) * (0-(-5.25)));
            yy = 0 + (((tickAnim - 110) / 30) * (0-(0)));
            zz = 0 + (((tickAnim - 110) / 30) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftLeg4, leftLeg4.rotateAngleX + (float) Math.toRadians(xx), leftLeg4.rotateAngleY + (float) Math.toRadians(yy), leftLeg4.rotateAngleZ + (float) Math.toRadians(zz));

        this.leftLeg4.rotationPointX = this.leftLeg4.rotationPointX + (float)(0);
        this.leftLeg4.rotationPointY = this.leftLeg4.rotationPointY - (float)(0);
        this.leftLeg4.rotationPointZ = this.leftLeg4.rotationPointZ + (float)(0);

    }
    public void animRelax(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime, double animTick) {
        EntityPrehistoricFloraOlorotitan entity = (EntityPrehistoricFloraOlorotitan) entitylivingbaseIn;
        int animCycle = 190;
        double tickAnim = animTick + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;
         if (tickAnim >= 0 && tickAnim < 40) {
            xx = 0 + (((tickAnim - 0) / 40) * (-4.25-(0)));
            yy = 0 + (((tickAnim - 0) / 40) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 40) * (0-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 160) {
            xx = -4.25 + (((tickAnim - 40) / 120) * (-4.25-(-4.25)));
            yy = 0 + (((tickAnim - 40) / 120) * (0-(0)));
            zz = 0 + (((tickAnim - 40) / 120) * (0-(0)));
        }
        else if (tickAnim >= 160 && tickAnim < 190) {
            xx = -4.25 + (((tickAnim - 160) / 30) * (0-(-4.25)));
            yy = 0 + (((tickAnim - 160) / 30) * (0-(0)));
            zz = 0 + (((tickAnim - 160) / 30) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(hips, hips.rotateAngleX + (float) Math.toRadians(xx), hips.rotateAngleY + (float) Math.toRadians(yy), hips.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 40) {
            xx = 0 + (((tickAnim - 0) / 40) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 40) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 40) * (-3.375-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 160) {
            xx = 0 + (((tickAnim - 40) / 120) * (0-(0)));
            yy = 0 + (((tickAnim - 40) / 120) * (0-(0)));
            zz = -3.375 + (((tickAnim - 40) / 120) * (-3.375-(-3.375)));
        }
        else if (tickAnim >= 160 && tickAnim < 190) {
            xx = 0 + (((tickAnim - 160) / 30) * (0-(0)));
            yy = 0 + (((tickAnim - 160) / 30) * (0-(0)));
            zz = -3.375 + (((tickAnim - 160) / 30) * (0-(-3.375)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.hips.rotationPointX = this.hips.rotationPointX + (float)(xx);
        this.hips.rotationPointY = this.hips.rotationPointY - (float)(yy);
        this.hips.rotationPointZ = this.hips.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 99) {
            xx = 0 + (((tickAnim - 0) / 99) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 99) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 99) * (0-(0)));
        }
        else if (tickAnim >= 99 && tickAnim < 100) {
            xx = 0 + (((tickAnim - 99) / 1) * (4.7+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*5-(0)));
            yy = 0 + (((tickAnim - 99) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 99) / 1) * (0-(0)));
        }
        else if (tickAnim >= 100 && tickAnim < 160) {
            xx = 4.7+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*5 + (((tickAnim - 100) / 60) * (7.25-(4.7+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*5)));
            yy = 0 + (((tickAnim - 100) / 60) * (0-(0)));
            zz = 0 + (((tickAnim - 100) / 60) * (0-(0)));
        }
        else if (tickAnim >= 160 && tickAnim < 190) {
            xx = 7.25 + (((tickAnim - 160) / 30) * (0-(7.25)));
            yy = 0 + (((tickAnim - 160) / 30) * (0-(0)));
            zz = 0 + (((tickAnim - 160) / 30) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tail1, tail1.rotateAngleX + (float) Math.toRadians(xx), tail1.rotateAngleY + (float) Math.toRadians(yy), tail1.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 160) {
            xx = 0 + (((tickAnim - 0) / 160) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 160) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 160) * (0-(0)));
        }
        else if (tickAnim >= 160 && tickAnim < 190) {
            xx = 0 + (((tickAnim - 160) / 30) * (0-(0)));
            yy = 0 + (((tickAnim - 160) / 30) * (0-(0)));
            zz = 0 + (((tickAnim - 160) / 30) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tail2, tail2.rotateAngleX + (float) Math.toRadians(xx), tail2.rotateAngleY + (float) Math.toRadians(yy), tail2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 40) {
            xx = 0 + (((tickAnim - 0) / 40) * (-5.25-(0)));
            yy = 0 + (((tickAnim - 0) / 40) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 40) * (0-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 160) {
            xx = -5.25 + (((tickAnim - 40) / 120) * (-8.25-(-5.25)));
            yy = 0 + (((tickAnim - 40) / 120) * (0-(0)));
            zz = 0 + (((tickAnim - 40) / 120) * (0-(0)));
        }
        else if (tickAnim >= 160 && tickAnim < 190) {
            xx = -8.25 + (((tickAnim - 160) / 30) * (0-(-8.25)));
            yy = 0 + (((tickAnim - 160) / 30) * (0-(0)));
            zz = 0 + (((tickAnim - 160) / 30) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tail3, tail3.rotateAngleX + (float) Math.toRadians(xx), tail3.rotateAngleY + (float) Math.toRadians(yy), tail3.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 40) {
            xx = 0 + (((tickAnim - 0) / 40) * (-8-(0)));
            yy = 0 + (((tickAnim - 0) / 40) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 40) * (0-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 160) {
            xx = -8 + (((tickAnim - 40) / 120) * (-18.25-(-8)));
            yy = 0 + (((tickAnim - 40) / 120) * (0-(0)));
            zz = 0 + (((tickAnim - 40) / 120) * (0-(0)));
        }
        else if (tickAnim >= 160 && tickAnim < 190) {
            xx = -18.25 + (((tickAnim - 160) / 30) * (0-(-18.25)));
            yy = 0 + (((tickAnim - 160) / 30) * (0-(0)));
            zz = 0 + (((tickAnim - 160) / 30) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tail4, tail4.rotateAngleX + (float) Math.toRadians(xx), tail4.rotateAngleY + (float) Math.toRadians(yy), tail4.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 40) {
            xx = 0 + (((tickAnim - 0) / 40) * (-11.25-(0)));
            yy = 0 + (((tickAnim - 0) / 40) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 40) * (0-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 190) {
            xx = -11.25 + (((tickAnim - 40) / 150) * (0-(-11.25)));
            yy = 0 + (((tickAnim - 40) / 150) * (0-(0)));
            zz = 0 + (((tickAnim - 40) / 150) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tail5, tail5.rotateAngleX + (float) Math.toRadians(xx), tail5.rotateAngleY + (float) Math.toRadians(yy), tail5.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 40) {
            xx = 0 + (((tickAnim - 0) / 40) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 40) * (2-(0)));
            zz = 0 + (((tickAnim - 0) / 40) * (0-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 160) {
            xx = 0 + (((tickAnim - 40) / 120) * (0-(0)));
            yy = 2 + (((tickAnim - 40) / 120) * (2-(2)));
            zz = 0 + (((tickAnim - 40) / 120) * (0-(0)));
        }
        else if (tickAnim >= 160 && tickAnim < 190) {
            xx = 0 + (((tickAnim - 160) / 30) * (0-(0)));
            yy = 2 + (((tickAnim - 160) / 30) * (0-(2)));
            zz = 0 + (((tickAnim - 160) / 30) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(body, body.rotateAngleX + (float) Math.toRadians(xx), body.rotateAngleY + (float) Math.toRadians(yy), body.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 40) {
            xx = 0 + (((tickAnim - 0) / 40) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 40) * (5.5-(0)));
            zz = 0 + (((tickAnim - 0) / 40) * (0-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 160) {
            xx = 0 + (((tickAnim - 40) / 120) * (0-(0)));
            yy = 5.5 + (((tickAnim - 40) / 120) * (5.5-(5.5)));
            zz = 0 + (((tickAnim - 40) / 120) * (0-(0)));
        }
        else if (tickAnim >= 160 && tickAnim < 190) {
            xx = 0 + (((tickAnim - 160) / 30) * (0-(0)));
            yy = 5.5 + (((tickAnim - 160) / 30) * (0-(5.5)));
            zz = 0 + (((tickAnim - 160) / 30) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(chest, chest.rotateAngleX + (float) Math.toRadians(xx), chest.rotateAngleY + (float) Math.toRadians(yy), chest.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 40) {
            xx = 0 + (((tickAnim - 0) / 40) * (-5.12664-(0)));
            yy = 0 + (((tickAnim - 0) / 40) * (4.95018-(0)));
            zz = 0 + (((tickAnim - 0) / 40) * (-2.9291-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 100) {
            xx = -5.12664 + (((tickAnim - 40) / 60) * (-5.1266387524+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))-(-5.12664)));
            yy = 4.95018 + (((tickAnim - 40) / 60) * (4.95018-(4.95018)));
            zz = -2.9291 + (((tickAnim - 40) / 60) * (-2.9291-(-2.9291)));
        }
        else if (tickAnim >= 100 && tickAnim < 129) {
            xx = -5.1266387524+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50)) + (((tickAnim - 100) / 29) * (-10.4313+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*5-(-5.1266387524+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50)))));
            yy = 4.95018 + (((tickAnim - 100) / 29) * (8.87025-(4.95018)));
            zz = -2.9291 + (((tickAnim - 100) / 29) * (-5.61153-(-2.9291)));
        }
        else if (tickAnim >= 129 && tickAnim < 130) {
            xx = -10.4313+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*5 + (((tickAnim - 129) / 1) * (-13.4563-(-10.4313+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*5)));
            yy = 8.87025 + (((tickAnim - 129) / 1) * (8.87025-(8.87025)));
            zz = -5.61153 + (((tickAnim - 129) / 1) * (-5.61153-(-5.61153)));
        }
        else if (tickAnim >= 130 && tickAnim < 160) {
            xx = -13.4563 + (((tickAnim - 130) / 30) * (-13.4563-(-13.4563)));
            yy = 8.87025 + (((tickAnim - 130) / 30) * (8.87025-(8.87025)));
            zz = -5.61153 + (((tickAnim - 130) / 30) * (-5.61153-(-5.61153)));
        }
        else if (tickAnim >= 160 && tickAnim < 190) {
            xx = -13.4563 + (((tickAnim - 160) / 30) * (0-(-13.4563)));
            yy = 8.87025 + (((tickAnim - 160) / 30) * (0-(8.87025)));
            zz = -5.61153 + (((tickAnim - 160) / 30) * (0-(-5.61153)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck1, neck1.rotateAngleX + (float) Math.toRadians(xx), neck1.rotateAngleY + (float) Math.toRadians(yy), neck1.rotateAngleZ + (float) Math.toRadians(zz));

        this.neck1.rotationPointX = this.neck1.rotationPointX + (float)(0);
        this.neck1.rotationPointY = this.neck1.rotationPointY - (float)(0);
        this.neck1.rotationPointZ = this.neck1.rotationPointZ + (float)(0);



        if (tickAnim >= 0 && tickAnim < 1) {
            xx = 0 + (((tickAnim - 0) / 1) * (-1.65+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50-20))*-5-(0)));
            yy = 0 + (((tickAnim - 0) / 1) * (1.525+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50-20))*5-(0)));
            zz = 0 + (((tickAnim - 0) / 1) * (0-(0)));
        }
        else if (tickAnim >= 1 && tickAnim < 40) {
            xx = -1.65+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50-20))*-5 + (((tickAnim - 1) / 39) * (-7.32134-(-1.65+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50-20))*-5)));
            yy = 1.525+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50-20))*5 + (((tickAnim - 1) / 39) * (7.20042-(1.525+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50-20))*5)));
            zz = 0 + (((tickAnim - 1) / 39) * (-0.80612-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 100) {
            xx = -7.32134 + (((tickAnim - 40) / 60) * (-7.32134-(-7.32134)));
            yy = 7.20042 + (((tickAnim - 40) / 60) * (7.20042-(7.20042)));
            zz = -0.80612 + (((tickAnim - 40) / 60) * (-0.80612-(-0.80612)));
        }
        else if (tickAnim >= 100 && tickAnim < 130) {
            xx = -7.32134 + (((tickAnim - 100) / 30) * (0-(-7.32134)));
            yy = 7.20042 + (((tickAnim - 100) / 30) * (0-(7.20042)));
            zz = -0.80612 + (((tickAnim - 100) / 30) * (0-(-0.80612)));
        }
        else if (tickAnim >= 130 && tickAnim < 160) {
            xx = 0 + (((tickAnim - 130) / 30) * (0-(0)));
            yy = 0 + (((tickAnim - 130) / 30) * (0-(0)));
            zz = 0 + (((tickAnim - 130) / 30) * (0-(0)));
        }
        else if (tickAnim >= 160 && tickAnim < 190) {
            xx = 0 + (((tickAnim - 160) / 30) * (0-(0)));
            yy = 0 + (((tickAnim - 160) / 30) * (0-(0)));
            zz = 0 + (((tickAnim - 160) / 30) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck2, neck2.rotateAngleX + (float) Math.toRadians(xx), neck2.rotateAngleY + (float) Math.toRadians(yy), neck2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 40) {
            xx = 0 + (((tickAnim - 0) / 40) * (-0.21417-(0)));
            yy = 0 + (((tickAnim - 0) / 40) * (5.04798-(0)));
            zz = 0 + (((tickAnim - 0) / 40) * (0.64418-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 100) {
            xx = -0.21417 + (((tickAnim - 40) / 60) * (-0.21417-(-0.21417)));
            yy = 5.04798 + (((tickAnim - 40) / 60) * (5.04798-(5.04798)));
            zz = 0.64418 + (((tickAnim - 40) / 60) * (0.64418-(0.64418)));
        }
        else if (tickAnim >= 100 && tickAnim < 130) {
            xx = -0.21417 + (((tickAnim - 100) / 30) * (0.32815-(-0.21417)));
            yy = 5.04798 + (((tickAnim - 100) / 30) * (9.19704-(5.04798)));
            zz = 0.64418 + (((tickAnim - 100) / 30) * (5.0131-(0.64418)));
        }
        else if (tickAnim >= 130 && tickAnim < 160) {
            xx = 0.32815 + (((tickAnim - 130) / 30) * (0.32815-(0.32815)));
            yy = 9.19704 + (((tickAnim - 130) / 30) * (9.19704-(9.19704)));
            zz = 5.0131 + (((tickAnim - 130) / 30) * (5.0131-(5.0131)));
        }
        else if (tickAnim >= 160 && tickAnim < 190) {
            xx = 0.32815 + (((tickAnim - 160) / 30) * (0-(0.32815)));
            yy = 9.19704 + (((tickAnim - 160) / 30) * (0-(9.19704)));
            zz = 5.0131 + (((tickAnim - 160) / 30) * (0-(5.0131)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck3, neck3.rotateAngleX + (float) Math.toRadians(xx), neck3.rotateAngleY + (float) Math.toRadians(yy), neck3.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 100) {
            xx = 0 + (((tickAnim - 0) / 100) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 100) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 100) * (0-(0)));
        }
        else if (tickAnim >= 100 && tickAnim < 130) {
            xx = 0 + (((tickAnim - 100) / 30) * (0-(0)));
            yy = 0 + (((tickAnim - 100) / 30) * (-0.475-(0)));
            zz = 0 + (((tickAnim - 100) / 30) * (0.4-(0)));
        }
        else if (tickAnim >= 130 && tickAnim < 160) {
            xx = 0 + (((tickAnim - 130) / 30) * (0-(0)));
            yy = -0.475 + (((tickAnim - 130) / 30) * (-0.475-(-0.475)));
            zz = 0.4 + (((tickAnim - 130) / 30) * (0.4-(0.4)));
        }
        else if (tickAnim >= 160 && tickAnim < 190) {
            xx = 0 + (((tickAnim - 160) / 30) * (0-(0)));
            yy = -0.475 + (((tickAnim - 160) / 30) * (0-(-0.475)));
            zz = 0.4 + (((tickAnim - 160) / 30) * (0-(0.4)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.neck3.rotationPointX = this.neck3.rotationPointX + (float)(xx);
        this.neck3.rotationPointY = this.neck3.rotationPointY - (float)(yy);
        this.neck3.rotationPointZ = this.neck3.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 40) {
            xx = 0 + (((tickAnim - 0) / 40) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 40) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 40) * (4.75-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 70) {
            xx = 0 + (((tickAnim - 40) / 30) * (0.25-(0)));
            yy = 0 + (((tickAnim - 40) / 30) * (0-(0)));
            zz = 4.75 + (((tickAnim - 40) / 30) * (4.75-(4.75)));
        }
        else if (tickAnim >= 70 && tickAnim < 75) {
            xx = 0.25 + (((tickAnim - 70) / 5) * (0.75-(0.25)));
            yy = 0 + (((tickAnim - 70) / 5) * (0-(0)));
            zz = 4.75 + (((tickAnim - 70) / 5) * (4.75-(4.75)));
        }
        else if (tickAnim >= 75 && tickAnim < 80) {
            xx = 0.75 + (((tickAnim - 75) / 5) * (0.25-(0.75)));
            yy = 0 + (((tickAnim - 75) / 5) * (0-(0)));
            zz = 4.75 + (((tickAnim - 75) / 5) * (4.75-(4.75)));
        }
        else if (tickAnim >= 80 && tickAnim < 85) {
            xx = 0.25 + (((tickAnim - 80) / 5) * (0.75-(0.25)));
            yy = 0 + (((tickAnim - 80) / 5) * (0-(0)));
            zz = 4.75 + (((tickAnim - 80) / 5) * (4.75-(4.75)));
        }
        else if (tickAnim >= 85 && tickAnim < 90) {
            xx = 0.75 + (((tickAnim - 85) / 5) * (0.25-(0.75)));
            yy = 0 + (((tickAnim - 85) / 5) * (0-(0)));
            zz = 4.75 + (((tickAnim - 85) / 5) * (4.75-(4.75)));
        }
        else if (tickAnim >= 90 && tickAnim < 95) {
            xx = 0.25 + (((tickAnim - 90) / 5) * (0.75-(0.25)));
            yy = 0 + (((tickAnim - 90) / 5) * (0-(0)));
            zz = 4.75 + (((tickAnim - 90) / 5) * (4.75-(4.75)));
        }
        else if (tickAnim >= 95 && tickAnim < 100) {
            xx = 0.75 + (((tickAnim - 95) / 5) * (0.25-(0.75)));
            yy = 0 + (((tickAnim - 95) / 5) * (0-(0)));
            zz = 4.75 + (((tickAnim - 95) / 5) * (4.75-(4.75)));
        }
        else if (tickAnim >= 100 && tickAnim < 130) {
            xx = 0.25 + (((tickAnim - 100) / 30) * (-23.36775-(0.25)));
            yy = 0 + (((tickAnim - 100) / 30) * (-2.29121-(0)));
            zz = 4.75 + (((tickAnim - 100) / 30) * (13.55656-(4.75)));
        }
        else if (tickAnim >= 130 && tickAnim < 160) {
            xx = -23.36775 + (((tickAnim - 130) / 30) * (-23.36775-(-23.36775)));
            yy = -2.29121 + (((tickAnim - 130) / 30) * (-2.29121-(-2.29121)));
            zz = 13.55656 + (((tickAnim - 130) / 30) * (13.55656-(13.55656)));
        }
        else if (tickAnim >= 160 && tickAnim < 190) {
            xx = -23.36775 + (((tickAnim - 160) / 30) * (0-(-23.36775)));
            yy = -2.29121 + (((tickAnim - 160) / 30) * (0-(-2.29121)));
            zz = 13.55656 + (((tickAnim - 160) / 30) * (0-(13.55656)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck4, neck4.rotateAngleX + (float) Math.toRadians(xx), neck4.rotateAngleY + (float) Math.toRadians(yy), neck4.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 100) {
            xx = 0 + (((tickAnim - 0) / 100) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 100) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 100) * (0-(0)));
        }
        else if (tickAnim >= 100 && tickAnim < 130) {
            xx = 0 + (((tickAnim - 100) / 30) * (0-(0)));
            yy = 0 + (((tickAnim - 100) / 30) * (0-(0)));
            zz = 0 + (((tickAnim - 100) / 30) * (-1.25-(0)));
        }
        else if (tickAnim >= 130 && tickAnim < 160) {
            xx = 0 + (((tickAnim - 130) / 30) * (0-(0)));
            yy = 0 + (((tickAnim - 130) / 30) * (0-(0)));
            zz = -1.25 + (((tickAnim - 130) / 30) * (-1.25-(-1.25)));
        }
        else if (tickAnim >= 160 && tickAnim < 190) {
            xx = 0 + (((tickAnim - 160) / 30) * (0-(0)));
            yy = 0 + (((tickAnim - 160) / 30) * (0-(0)));
            zz = -1.25 + (((tickAnim - 160) / 30) * (0-(-1.25)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.neck4.rotationPointX = this.neck4.rotationPointX + (float)(xx);
        this.neck4.rotationPointY = this.neck4.rotationPointY - (float)(yy);
        this.neck4.rotationPointZ = this.neck4.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 35) {
            xx = 0 + (((tickAnim - 0) / 35) * (17.5-(0)));
            yy = 0 + (((tickAnim - 0) / 35) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 35) * (0-(0)));
        }
        else if (tickAnim >= 35 && tickAnim < 43) {
            xx = 17.5 + (((tickAnim - 35) / 8) * (16.5-(17.5)));
            yy = 0 + (((tickAnim - 35) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 35) / 8) * (0-(0)));
        }
        else if (tickAnim >= 43 && tickAnim < 50) {
            xx = 16.5 + (((tickAnim - 43) / 7) * (17.5-(16.5)));
            yy = 0 + (((tickAnim - 43) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 43) / 7) * (0-(0)));
        }
        else if (tickAnim >= 50 && tickAnim < 70) {
            xx = 17.5 + (((tickAnim - 50) / 20) * (17.5-(17.5)));
            yy = 0 + (((tickAnim - 50) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 50) / 20) * (0-(0)));
        }
        else if (tickAnim >= 70 && tickAnim < 75) {
            xx = 17.5 + (((tickAnim - 70) / 5) * (116.6+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50+83))*100-(17.5)));
            yy = 0 + (((tickAnim - 70) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 70) / 5) * (0-(0)));
        }
        else if (tickAnim >= 75 && tickAnim < 80) {
            xx = 116.6+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50+83))*100 + (((tickAnim - 75) / 5) * (17.5-(116.6+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50+83))*100)));
            yy = 0 + (((tickAnim - 75) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 75) / 5) * (0-(0)));
        }
        else if (tickAnim >= 80 && tickAnim < 85) {
            xx = 17.5 + (((tickAnim - 80) / 5) * (116.6+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50+60))*100-(17.5)));
            yy = 0 + (((tickAnim - 80) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 80) / 5) * (0-(0)));
        }
        else if (tickAnim >= 85 && tickAnim < 90) {
            xx = 116.6+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50+60))*100 + (((tickAnim - 85) / 5) * (17.5-(116.6+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50+60))*100)));
            yy = 0 + (((tickAnim - 85) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 85) / 5) * (0-(0)));
        }
        else if (tickAnim >= 90 && tickAnim < 95) {
            xx = 17.5 + (((tickAnim - 90) / 5) * (116.6+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50+33))*100-(17.5)));
            yy = 0 + (((tickAnim - 90) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 90) / 5) * (0-(0)));
        }
        else if (tickAnim >= 95 && tickAnim < 100) {
            xx = 116.6+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50+33))*100 + (((tickAnim - 95) / 5) * (17.5-(116.6+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50+33))*100)));
            yy = 0 + (((tickAnim - 95) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 95) / 5) * (0-(0)));
        }
        else if (tickAnim >= 100 && tickAnim < 160) {
            xx = 17.5 + (((tickAnim - 100) / 60) * (17.5-(17.5)));
            yy = 0 + (((tickAnim - 100) / 60) * (0-(0)));
            zz = 0 + (((tickAnim - 100) / 60) * (0-(0)));
        }
        else if (tickAnim >= 160 && tickAnim < 190) {
            xx = 17.5 + (((tickAnim - 160) / 30) * (0-(17.5)));
            yy = 0 + (((tickAnim - 160) / 30) * (0-(0)));
            zz = 0 + (((tickAnim - 160) / 30) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(head, head.rotateAngleX + (float) Math.toRadians(xx), head.rotateAngleY + (float) Math.toRadians(yy), head.rotateAngleZ + (float) Math.toRadians(zz));

        this.head.rotationPointX = this.head.rotationPointX + (float)(0);
        this.head.rotationPointY = this.head.rotationPointY - (float)(0);
        this.head.rotationPointZ = this.head.rotationPointZ + (float)(0);



        if (tickAnim >= 0 && tickAnim < 35) {
            xx = 0 + (((tickAnim - 0) / 35) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 35) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 35) * (0-(0)));
        }
        else if (tickAnim >= 35 && tickAnim < 43) {
            xx = 0 + (((tickAnim - 35) / 8) * (4.5-(0)));
            yy = 0 + (((tickAnim - 35) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 35) / 8) * (0-(0)));
        }
        else if (tickAnim >= 43 && tickAnim < 50) {
            xx = 4.5 + (((tickAnim - 43) / 7) * (0-(4.5)));
            yy = 0 + (((tickAnim - 43) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 43) / 7) * (0-(0)));
        }
        else if (tickAnim >= 50 && tickAnim < 115) {
            xx = 0 + (((tickAnim - 50) / 65) * (0-(0)));
            yy = 0 + (((tickAnim - 50) / 65) * (0-(0)));
            zz = 0 + (((tickAnim - 50) / 65) * (0-(0)));
        }
        else if (tickAnim >= 115 && tickAnim < 120) {
            xx = 0 + (((tickAnim - 115) / 5) * (1.75-(0)));
            yy = 0 + (((tickAnim - 115) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 115) / 5) * (0-(0)));
        }
        else if (tickAnim >= 120 && tickAnim < 125) {
            xx = 1.75 + (((tickAnim - 120) / 5) * (0-(1.75)));
            yy = 0 + (((tickAnim - 120) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 120) / 5) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(lowerjawback, lowerjawback.rotateAngleX + (float) Math.toRadians(xx), lowerjawback.rotateAngleY + (float) Math.toRadians(yy), lowerjawback.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 40 && tickAnim < 45) {
            xx = 1 + (((tickAnim - 40) / 5) * (1-(1)));
            yy = 1 + (((tickAnim - 40) / 5) * (0.0425-(1)));
            zz = 1 + (((tickAnim - 40) / 5) * (1-(1)));
        }
        else if (tickAnim >= 45 && tickAnim < 50) {
            xx = 1 + (((tickAnim - 45) / 5) * (1-(1)));
            yy = 0.0425 + (((tickAnim - 45) / 5) * (1-(0.0425)));
            zz = 1 + (((tickAnim - 45) / 5) * (1-(1)));
        }
        else if (tickAnim >= 50 && tickAnim < 88) {
            xx = 1 + (((tickAnim - 50) / 38) * (1-(1)));
            yy = 1 + (((tickAnim - 50) / 38) * (1-(1)));
            zz = 1 + (((tickAnim - 50) / 38) * (1-(1)));
        }
        else if (tickAnim >= 88 && tickAnim < 93) {
            xx = 1 + (((tickAnim - 88) / 5) * (1-(1)));
            yy = 1 + (((tickAnim - 88) / 5) * (0.0425-(1)));
            zz = 1 + (((tickAnim - 88) / 5) * (1-(1)));
        }
        else if (tickAnim >= 93 && tickAnim < 98) {
            xx = 1 + (((tickAnim - 93) / 5) * (1-(1)));
            yy = 0.0425 + (((tickAnim - 93) / 5) * (1-(0.0425)));
            zz = 1 + (((tickAnim - 93) / 5) * (1-(1)));
        }
        else {
            xx = 1;
            yy = 1;
            zz = 1;
        }
        this.lefteye.setScale((float)xx, (float)yy, (float)zz);




        if (tickAnim >= 40 && tickAnim < 45) {
            xx = 1 + (((tickAnim - 40) / 5) * (1-(1)));
            yy = 1 + (((tickAnim - 40) / 5) * (0.0425-(1)));
            zz = 1 + (((tickAnim - 40) / 5) * (1-(1)));
        }
        else if (tickAnim >= 45 && tickAnim < 50) {
            xx = 1 + (((tickAnim - 45) / 5) * (1-(1)));
            yy = 0.0425 + (((tickAnim - 45) / 5) * (1-(0.0425)));
            zz = 1 + (((tickAnim - 45) / 5) * (1-(1)));
        }
        else if (tickAnim >= 50 && tickAnim < 88) {
            xx = 1 + (((tickAnim - 50) / 38) * (1-(1)));
            yy = 1 + (((tickAnim - 50) / 38) * (1-(1)));
            zz = 1 + (((tickAnim - 50) / 38) * (1-(1)));
        }
        else if (tickAnim >= 88 && tickAnim < 93) {
            xx = 1 + (((tickAnim - 88) / 5) * (1-(1)));
            yy = 1 + (((tickAnim - 88) / 5) * (0.0425-(1)));
            zz = 1 + (((tickAnim - 88) / 5) * (1-(1)));
        }
        else if (tickAnim >= 93 && tickAnim < 98) {
            xx = 1 + (((tickAnim - 93) / 5) * (1-(1)));
            yy = 0.0425 + (((tickAnim - 93) / 5) * (1-(0.0425)));
            zz = 1 + (((tickAnim - 93) / 5) * (1-(1)));
        }
        else {
            xx = 1;
            yy = 1;
            zz = 1;
        }
        this.righteye.setScale((float)xx, (float)yy, (float)zz);




        if (tickAnim >= 0 && tickAnim < 40) {
            xx = 0 + (((tickAnim - 0) / 40) * (-9.5-(0)));
            yy = 0 + (((tickAnim - 0) / 40) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 40) * (0-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 160) {
            xx = -9.5 + (((tickAnim - 40) / 120) * (-9.5-(-9.5)));
            yy = 0 + (((tickAnim - 40) / 120) * (0-(0)));
            zz = 0 + (((tickAnim - 40) / 120) * (0-(0)));
        }
        else if (tickAnim >= 160 && tickAnim < 190) {
            xx = -9.5 + (((tickAnim - 160) / 30) * (0-(-9.5)));
            yy = 0 + (((tickAnim - 160) / 30) * (0-(0)));
            zz = 0 + (((tickAnim - 160) / 30) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightArm, rightArm.rotateAngleX + (float) Math.toRadians(xx), rightArm.rotateAngleY + (float) Math.toRadians(yy), rightArm.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 40) {
            xx = 0 + (((tickAnim - 0) / 40) * (23.5-(0)));
            yy = 0 + (((tickAnim - 0) / 40) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 40) * (0-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 160) {
            xx = 23.5 + (((tickAnim - 40) / 120) * (23.5-(23.5)));
            yy = 0 + (((tickAnim - 40) / 120) * (0-(0)));
            zz = 0 + (((tickAnim - 40) / 120) * (0-(0)));
        }
        else if (tickAnim >= 160 && tickAnim < 190) {
            xx = 23.5 + (((tickAnim - 160) / 30) * (0-(23.5)));
            yy = 0 + (((tickAnim - 160) / 30) * (0-(0)));
            zz = 0 + (((tickAnim - 160) / 30) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightArm2, rightArm2.rotateAngleX + (float) Math.toRadians(xx), rightArm2.rotateAngleY + (float) Math.toRadians(yy), rightArm2.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 40) {
            xx = 0 + (((tickAnim - 0) / 40) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 40) * (-0.325-(0)));
            zz = 0 + (((tickAnim - 0) / 40) * (0-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 160) {
            xx = 0 + (((tickAnim - 40) / 120) * (0-(0)));
            yy = -0.325 + (((tickAnim - 40) / 120) * (-0.325-(-0.325)));
            zz = 0 + (((tickAnim - 40) / 120) * (0-(0)));
        }
        else if (tickAnim >= 160 && tickAnim < 190) {
            xx = 0 + (((tickAnim - 160) / 30) * (0-(0)));
            yy = -0.325 + (((tickAnim - 160) / 30) * (0-(-0.325)));
            zz = 0 + (((tickAnim - 160) / 30) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.rightArm2.rotationPointX = this.rightArm2.rotationPointX + (float)(xx);
        this.rightArm2.rotationPointY = this.rightArm2.rotationPointY - (float)(yy);
        this.rightArm2.rotationPointZ = this.rightArm2.rotationPointZ + (float)(zz);



        this.setRotateAngle(rightArm3, rightArm3.rotateAngleX + (float) Math.toRadians(0), rightArm3.rotateAngleY + (float) Math.toRadians(0), rightArm3.rotateAngleZ + (float) Math.toRadians(0));

        if (tickAnim >= 0 && tickAnim < 40) {
            xx = 0 + (((tickAnim - 0) / 40) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 40) * (-0.525-(0)));
            zz = 0 + (((tickAnim - 0) / 40) * (0-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 160) {
            xx = 0 + (((tickAnim - 40) / 120) * (0-(0)));
            yy = -0.525 + (((tickAnim - 40) / 120) * (-0.525-(-0.525)));
            zz = 0 + (((tickAnim - 40) / 120) * (0-(0)));
        }
        else if (tickAnim >= 160 && tickAnim < 190) {
            xx = 0 + (((tickAnim - 160) / 30) * (0-(0)));
            yy = -0.525 + (((tickAnim - 160) / 30) * (0-(-0.525)));
            zz = 0 + (((tickAnim - 160) / 30) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.rightArm3.rotationPointX = this.rightArm3.rotationPointX + (float)(xx);
        this.rightArm3.rotationPointY = this.rightArm3.rotationPointY - (float)(yy);
        this.rightArm3.rotationPointZ = this.rightArm3.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 0) / 20) * (-30.12-(0)));
            yy = 0 + (((tickAnim - 0) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 20) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 40) {
            xx = -30.12 + (((tickAnim - 20) / 20) * (-35.75-(-30.12)));
            yy = 0 + (((tickAnim - 20) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 20) * (0-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 160) {
            xx = -35.75 + (((tickAnim - 40) / 120) * (-35.75-(-35.75)));
            yy = 0 + (((tickAnim - 40) / 120) * (0-(0)));
            zz = 0 + (((tickAnim - 40) / 120) * (0-(0)));
        }
        else if (tickAnim >= 160 && tickAnim < 175) {
            xx = -35.75 + (((tickAnim - 160) / 15) * (20.88-(-35.75)));
            yy = 0 + (((tickAnim - 160) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 160) / 15) * (0-(0)));
        }
        else if (tickAnim >= 175 && tickAnim < 190) {
            xx = 20.88 + (((tickAnim - 175) / 15) * (0-(20.88)));
            yy = 0 + (((tickAnim - 175) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 175) / 15) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftArm, leftArm.rotateAngleX + (float) Math.toRadians(xx), leftArm.rotateAngleY + (float) Math.toRadians(yy), leftArm.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 0) / 20) * (-6.345+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50-20))*-50-(0)));
            yy = 0 + (((tickAnim - 0) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 20) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 40) {
            xx = -6.345+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50-20))*-50 + (((tickAnim - 20) / 20) * (23.25-(-6.345+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50-20))*-50)));
            yy = 0 + (((tickAnim - 20) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 20) * (0-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 160) {
            xx = 23.25 + (((tickAnim - 40) / 120) * (23.25-(23.25)));
            yy = 0 + (((tickAnim - 40) / 120) * (0-(0)));
            zz = 0 + (((tickAnim - 40) / 120) * (0-(0)));
        }
        else if (tickAnim >= 160 && tickAnim < 175) {
            xx = 23.25 + (((tickAnim - 160) / 15) * (-31.87-(23.25)));
            yy = 0 + (((tickAnim - 160) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 160) / 15) * (0-(0)));
        }
        else if (tickAnim >= 175 && tickAnim < 190) {
            xx = -31.87 + (((tickAnim - 175) / 15) * (0-(-31.87)));
            yy = 0 + (((tickAnim - 175) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 175) / 15) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftArm2, leftArm2.rotateAngleX + (float) Math.toRadians(xx), leftArm2.rotateAngleY + (float) Math.toRadians(yy), leftArm2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 6) {
            xx = 0 + (((tickAnim - 0) / 6) * (45.63-(0)));
            yy = 0 + (((tickAnim - 0) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 6) * (0-(0)));
        }
        else if (tickAnim >= 6 && tickAnim < 20) {
            xx = 45.63 + (((tickAnim - 6) / 14) * (74.38-(45.63)));
            yy = 0 + (((tickAnim - 6) / 14) * (0-(0)));
            zz = 0 + (((tickAnim - 6) / 14) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 40) {
            xx = 74.38 + (((tickAnim - 20) / 20) * (12.25-(74.38)));
            yy = 0 + (((tickAnim - 20) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 20) * (0-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 160) {
            xx = 12.25 + (((tickAnim - 40) / 120) * (12.25-(12.25)));
            yy = 0 + (((tickAnim - 40) / 120) * (0-(0)));
            zz = 0 + (((tickAnim - 40) / 120) * (0-(0)));
        }
        else if (tickAnim >= 160 && tickAnim < 166) {
            xx = 12.25 + (((tickAnim - 160) / 6) * (59.56-(12.25)));
            yy = 0 + (((tickAnim - 160) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 160) / 6) * (0-(0)));
        }
        else if (tickAnim >= 166 && tickAnim < 175) {
            xx = 59.56 + (((tickAnim - 166) / 9) * (56.13-(59.56)));
            yy = 0 + (((tickAnim - 166) / 9) * (0-(0)));
            zz = 0 + (((tickAnim - 166) / 9) * (0-(0)));
        }
        else if (tickAnim >= 175 && tickAnim < 190) {
            xx = 56.13 + (((tickAnim - 175) / 15) * (0-(56.13)));
            yy = 0 + (((tickAnim - 175) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 175) / 15) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftArm3, leftArm3.rotateAngleX + (float) Math.toRadians(xx), leftArm3.rotateAngleY + (float) Math.toRadians(yy), leftArm3.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 6) {
            xx = 0 + (((tickAnim - 0) / 6) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 6) * (0-(0)));
        }
        else if (tickAnim >= 6 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 6) / 14) * (0-(0)));
            yy = 0 + (((tickAnim - 6) / 14) * (-0.55-(0)));
            zz = 0 + (((tickAnim - 6) / 14) * (-0.55-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 40) {
            xx = 0 + (((tickAnim - 20) / 20) * (0-(0)));
            yy = -0.55 + (((tickAnim - 20) / 20) * (0-(-0.55)));
            zz = -0.55 + (((tickAnim - 20) / 20) * (0-(-0.55)));
        }
        else if (tickAnim >= 40 && tickAnim < 160) {
            xx = 0 + (((tickAnim - 40) / 120) * (0-(0)));
            yy = 0 + (((tickAnim - 40) / 120) * (0-(0)));
            zz = 0 + (((tickAnim - 40) / 120) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.leftArm3.rotationPointX = this.leftArm3.rotationPointX + (float)(xx);
        this.leftArm3.rotationPointY = this.leftArm3.rotationPointY - (float)(yy);
        this.leftArm3.rotationPointZ = this.leftArm3.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 40) {
            xx = 0 + (((tickAnim - 0) / 40) * (11-(0)));
            yy = 0 + (((tickAnim - 0) / 40) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 40) * (0-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 160) {
            xx = 11 + (((tickAnim - 40) / 120) * (11-(11)));
            yy = 0 + (((tickAnim - 40) / 120) * (0-(0)));
            zz = 0 + (((tickAnim - 40) / 120) * (0-(0)));
        }
        else if (tickAnim >= 160 && tickAnim < 190) {
            xx = 11 + (((tickAnim - 160) / 30) * (0-(11)));
            yy = 0 + (((tickAnim - 160) / 30) * (0-(0)));
            zz = 0 + (((tickAnim - 160) / 30) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightLeg, rightLeg.rotateAngleX + (float) Math.toRadians(xx), rightLeg.rotateAngleY + (float) Math.toRadians(yy), rightLeg.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 40) {
            xx = 0 + (((tickAnim - 0) / 40) * (19.25-(0)));
            yy = 0 + (((tickAnim - 0) / 40) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 40) * (0-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 160) {
            xx = 19.25 + (((tickAnim - 40) / 120) * (19.25-(19.25)));
            yy = 0 + (((tickAnim - 40) / 120) * (0-(0)));
            zz = 0 + (((tickAnim - 40) / 120) * (0-(0)));
        }
        else if (tickAnim >= 160 && tickAnim < 190) {
            xx = 19.25 + (((tickAnim - 160) / 30) * (0-(19.25)));
            yy = 0 + (((tickAnim - 160) / 30) * (0-(0)));
            zz = 0 + (((tickAnim - 160) / 30) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightLeg3, rightLeg3.rotateAngleX + (float) Math.toRadians(xx), rightLeg3.rotateAngleY + (float) Math.toRadians(yy), rightLeg3.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 40) {
            xx = 0 + (((tickAnim - 0) / 40) * (-25.5-(0)));
            yy = 0 + (((tickAnim - 0) / 40) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 40) * (0-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 160) {
            xx = -25.5 + (((tickAnim - 40) / 120) * (-25.5-(-25.5)));
            yy = 0 + (((tickAnim - 40) / 120) * (0-(0)));
            zz = 0 + (((tickAnim - 40) / 120) * (0-(0)));
        }
        else if (tickAnim >= 160 && tickAnim < 190) {
            xx = -25.5 + (((tickAnim - 160) / 30) * (0-(-25.5)));
            yy = 0 + (((tickAnim - 160) / 30) * (0-(0)));
            zz = 0 + (((tickAnim - 160) / 30) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightLeg4, rightLeg4.rotateAngleX + (float) Math.toRadians(xx), rightLeg4.rotateAngleY + (float) Math.toRadians(yy), rightLeg4.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 40) {
            xx = 0 + (((tickAnim - 0) / 40) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 40) * (-0.175-(0)));
            zz = 0 + (((tickAnim - 0) / 40) * (0-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 160) {
            xx = 0 + (((tickAnim - 40) / 120) * (0-(0)));
            yy = -0.175 + (((tickAnim - 40) / 120) * (-0.175-(-0.175)));
            zz = 0 + (((tickAnim - 40) / 120) * (0-(0)));
        }
        else if (tickAnim >= 160 && tickAnim < 190) {
            xx = 0 + (((tickAnim - 160) / 30) * (0-(0)));
            yy = -0.175 + (((tickAnim - 160) / 30) * (0-(-0.175)));
            zz = 0 + (((tickAnim - 160) / 30) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.rightLeg4.rotationPointX = this.rightLeg4.rotationPointX + (float)(xx);
        this.rightLeg4.rotationPointY = this.rightLeg4.rotationPointY - (float)(yy);
        this.rightLeg4.rotationPointZ = this.rightLeg4.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 40) {
            xx = 0 + (((tickAnim - 0) / 40) * (11-(0)));
            yy = 0 + (((tickAnim - 0) / 40) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 40) * (0-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 160) {
            xx = 11 + (((tickAnim - 40) / 120) * (11-(11)));
            yy = 0 + (((tickAnim - 40) / 120) * (0-(0)));
            zz = 0 + (((tickAnim - 40) / 120) * (0-(0)));
        }
        else if (tickAnim >= 160 && tickAnim < 190) {
            xx = 11 + (((tickAnim - 160) / 30) * (0-(11)));
            yy = 0 + (((tickAnim - 160) / 30) * (0-(0)));
            zz = 0 + (((tickAnim - 160) / 30) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftLeg, leftLeg.rotateAngleX + (float) Math.toRadians(xx), leftLeg.rotateAngleY + (float) Math.toRadians(yy), leftLeg.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 40) {
            xx = 0 + (((tickAnim - 0) / 40) * (19.25-(0)));
            yy = 0 + (((tickAnim - 0) / 40) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 40) * (0-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 160) {
            xx = 19.25 + (((tickAnim - 40) / 120) * (19.25-(19.25)));
            yy = 0 + (((tickAnim - 40) / 120) * (0-(0)));
            zz = 0 + (((tickAnim - 40) / 120) * (0-(0)));
        }
        else if (tickAnim >= 160 && tickAnim < 190) {
            xx = 19.25 + (((tickAnim - 160) / 30) * (0-(19.25)));
            yy = 0 + (((tickAnim - 160) / 30) * (0-(0)));
            zz = 0 + (((tickAnim - 160) / 30) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftLeg3, leftLeg3.rotateAngleX + (float) Math.toRadians(xx), leftLeg3.rotateAngleY + (float) Math.toRadians(yy), leftLeg3.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 40) {
            xx = 0 + (((tickAnim - 0) / 40) * (-25.5-(0)));
            yy = 0 + (((tickAnim - 0) / 40) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 40) * (0-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 160) {
            xx = -25.5 + (((tickAnim - 40) / 120) * (-25.5-(-25.5)));
            yy = 0 + (((tickAnim - 40) / 120) * (0-(0)));
            zz = 0 + (((tickAnim - 40) / 120) * (0-(0)));
        }
        else if (tickAnim >= 160 && tickAnim < 190) {
            xx = -25.5 + (((tickAnim - 160) / 30) * (0-(-25.5)));
            yy = 0 + (((tickAnim - 160) / 30) * (0-(0)));
            zz = 0 + (((tickAnim - 160) / 30) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftLeg4, leftLeg4.rotateAngleX + (float) Math.toRadians(xx), leftLeg4.rotateAngleY + (float) Math.toRadians(yy), leftLeg4.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 40) {
            xx = 0 + (((tickAnim - 0) / 40) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 40) * (-0.175-(0)));
            zz = 0 + (((tickAnim - 0) / 40) * (0-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 160) {
            xx = 0 + (((tickAnim - 40) / 120) * (0-(0)));
            yy = -0.175 + (((tickAnim - 40) / 120) * (-0.175-(-0.175)));
            zz = 0 + (((tickAnim - 40) / 120) * (0-(0)));
        }
        else if (tickAnim >= 160 && tickAnim < 190) {
            xx = 0 + (((tickAnim - 160) / 30) * (0-(0)));
            yy = -0.175 + (((tickAnim - 160) / 30) * (0-(-0.175)));
            zz = 0 + (((tickAnim - 160) / 30) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.leftLeg4.rotationPointX = this.leftLeg4.rotationPointX + (float)(xx);
        this.leftLeg4.rotationPointY = this.leftLeg4.rotationPointY - (float)(yy);
        this.leftLeg4.rotationPointZ = this.leftLeg4.rotationPointZ + (float)(zz);

    }
    public void animWalking(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime) {
        EntityPrehistoricFloraOlorotitan entity = (EntityPrehistoricFloraOlorotitan) entitylivingbaseIn;
        int animCycle = 55;
        double tickAnim = (entity.ticksExisted + entity.getTickOffset()) - (int) (Math.floor((double) (entity.ticksExisted + entity.getTickOffset()) / (double) animCycle) * (double) animCycle) + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;
        this.setRotateAngle(hips, hips.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*131/0.5))*1.5), hips.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*131+90))*2), hips.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*131+20))*2));
        this.hips.rotationPointX = this.hips.rotationPointX + (float)(0);
        this.hips.rotationPointY = this.hips.rotationPointY - (float)(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*131/0.5-50))*0.25);
        this.hips.rotationPointZ = this.hips.rotationPointZ + (float)(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*131/0.5-50))*-0.38);


        this.setRotateAngle(tail1, tail1.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*131/0.5-50))*1), tail1.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*131))*2), tail1.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*131+20))*-3));


        this.setRotateAngle(tail2, tail2.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*131/0.5-100))*1.5), tail2.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*131-80))*6), tail2.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*131+20))*-3));


        this.setRotateAngle(tail3, tail3.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*131/0.5-150))*2), tail3.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*131-100))*4), tail3.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*131+20))*-3));


        this.setRotateAngle(tail4, tail4.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*131/0.5-150))*2.5), tail4.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*131-150))*6), tail4.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*131+20))*-3));


        this.setRotateAngle(tail5, tail5.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*131/0.5-150))*3), tail5.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*131-200))*8), tail5.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*131+20))*-3));


        this.setRotateAngle(body, body.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*131/0.5-50))*-1), body.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*131+90))*-3), body.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*131-50))*2));


        this.setRotateAngle(chest, chest.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*131/0.5-150))*1.5), chest.rotateAngleY + (float) Math.toRadians(0), chest.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*131-50))*-2.5));


        this.setRotateAngle(neck1, neck1.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*131/0.5-250))*2), neck1.rotateAngleY + (float) Math.toRadians(0), neck1.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(neck2, neck2.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*131/0.5-350))*2.5), neck2.rotateAngleY + (float) Math.toRadians(0), neck2.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(neck3, neck3.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*131/0.5-450))*3), neck3.rotateAngleY + (float) Math.toRadians(0), neck3.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(neck4, neck4.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*131/0.5-550))*4), neck4.rotateAngleY + (float) Math.toRadians(0), neck4.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(head, head.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*131/0.5-350))*3), head.rotateAngleY + (float) Math.toRadians(0), head.rotateAngleZ + (float) Math.toRadians(0));



        if (tickAnim >= 0 && tickAnim < 14) {
            xx = -29.2+Math.sin((Math.PI/180)*(((double)tickAnim/20)*90-120))*-19 + (((tickAnim - 0) / 14) * (-11.375+Math.sin((Math.PI/180)*(((double)tickAnim/20)*90-30))*-40-(-29.2+Math.sin((Math.PI/180)*(((double)tickAnim/20)*90-120))*-19)));
            yy = 0 + (((tickAnim - 0) / 14) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 14) * (0-(0)));
        }
        else if (tickAnim >= 14 && tickAnim < 28) {
            xx = -11.375+Math.sin((Math.PI/180)*(((double)tickAnim/20)*90-30))*-40 + (((tickAnim - 14) / 14) * (-54.83221-(-11.375+Math.sin((Math.PI/180)*(((double)tickAnim/20)*90-30))*-40)));
            yy = 0 + (((tickAnim - 14) / 14) * (-5.9708-(0)));
            zz = 0 + (((tickAnim - 14) / 14) * (-7.06853-(0)));
        }
        else if (tickAnim >= 28 && tickAnim < 55) {
            xx = -54.83221 + (((tickAnim - 28) / 27) * (-24.35+Math.sin((Math.PI/180)*(((double)tickAnim/20)*90-30))*-19-(-54.83221)));
            yy = -5.9708 + (((tickAnim - 28) / 27) * (0-(-5.9708)));
            zz = -7.06853 + (((tickAnim - 28) / 27) * (0-(-7.06853)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightArm, rightArm.rotateAngleX + (float) Math.toRadians(xx), rightArm.rotateAngleY + (float) Math.toRadians(yy), rightArm.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 14) {
            xx = 24.53299 + (((tickAnim - 0) / 14) * (42.6+Math.sin((Math.PI/180)*(((double)tickAnim/20)*20))*-150-(24.53299)));
            yy = 4.3582 + (((tickAnim - 0) / 14) * (0-(4.3582)));
            zz = 6.11946 + (((tickAnim - 0) / 14) * (0-(6.11946)));
        }
        else if (tickAnim >= 14 && tickAnim < 23) {
            xx = 42.6+Math.sin((Math.PI/180)*(((double)tickAnim/20)*20))*-150 + (((tickAnim - 14) / 9) * (-209.5845+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50+30))*200-(42.6+Math.sin((Math.PI/180)*(((double)tickAnim/20)*20))*-150)));
            yy = 0 + (((tickAnim - 14) / 9) * (4.90634-(0)));
            zz = 0 + (((tickAnim - 14) / 9) * (14.01529-(0)));
        }
        else if (tickAnim >= 23 && tickAnim < 28) {
            xx = -209.5845+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50+30))*200 + (((tickAnim - 23) / 5) * (-149.2749+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*180-(-209.5845+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50+30))*200)));
            yy = 4.90634 + (((tickAnim - 23) / 5) * (5.89447-(4.90634)));
            zz = 14.01529 + (((tickAnim - 23) / 5) * (15.37003-(14.01529)));
        }
        else if (tickAnim >= 28 && tickAnim < 55) {
            xx = -149.2749+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*180 + (((tickAnim - 28) / 27) * (24.53299-(-149.2749+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*180)));
            yy = 5.89447 + (((tickAnim - 28) / 27) * (4.3582-(5.89447)));
            zz = 15.37003 + (((tickAnim - 28) / 27) * (6.11946-(15.37003)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightArm2, rightArm2.rotateAngleX + (float) Math.toRadians(xx), rightArm2.rotateAngleY + (float) Math.toRadians(yy), rightArm2.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 14) {
            xx = 0 + (((tickAnim - 0) / 14) * (0-(0)));
            yy = 0.475 + (((tickAnim - 0) / 14) * (0-(0.475)));
            zz = 0 + (((tickAnim - 0) / 14) * (0-(0)));
        }
        else if (tickAnim >= 14 && tickAnim < 28) {
            xx = 0 + (((tickAnim - 14) / 14) * (0-(0)));
            yy = 0 + (((tickAnim - 14) / 14) * (0.7-(0)));
            zz = 0 + (((tickAnim - 14) / 14) * (-0.55-(0)));
        }
        else if (tickAnim >= 28 && tickAnim < 31) {
            xx = 0 + (((tickAnim - 28) / 3) * (0-(0)));
            yy = 0.7 + (((tickAnim - 28) / 3) * (0.7+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1220/0.7))*0.1-(0.7)));
            zz = -0.55 + (((tickAnim - 28) / 3) * (-0.55-(-0.55)));
        }
        else if (tickAnim >= 31 && tickAnim < 33) {
            xx = 0 + (((tickAnim - 31) / 2) * (0-(0)));
            yy = 0.7+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1220/0.7))*0.1 + (((tickAnim - 31) / 2) * (0.7-(0.7+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1220/0.7))*0.1)));
            zz = -0.55 + (((tickAnim - 31) / 2) * (-0.55-(-0.55)));
        }
        else if (tickAnim >= 33 && tickAnim < 55) {
            xx = 0 + (((tickAnim - 33) / 22) * (0-(0)));
            yy = 0.7 + (((tickAnim - 33) / 22) * (0.475-(0.7)));
            zz = -0.55 + (((tickAnim - 33) / 22) * (0-(-0.55)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.rightArm2.rotationPointX = this.rightArm2.rotationPointX + (float)(xx);
        this.rightArm2.rotationPointY = this.rightArm2.rotationPointY - (float)(yy);
        this.rightArm2.rotationPointZ = this.rightArm2.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 14) {
            xx = 2.29194 + (((tickAnim - 0) / 14) * (-10.2043+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*150-(2.29194)));
            yy = -1.88235 + (((tickAnim - 0) / 14) * (0.65029-(-1.88235)));
            zz = -11.76575 + (((tickAnim - 0) / 14) * (-12.60079-(-11.76575)));
        }
        else if (tickAnim >= 14 && tickAnim < 28) {
            xx = -10.2043+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*150 + (((tickAnim - 14) / 14) * (-79.0316+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50+20))*100-(-10.2043+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*150)));
            yy = 0.65029 + (((tickAnim - 14) / 14) * (-1.2555-(0.65029)));
            zz = -12.60079 + (((tickAnim - 14) / 14) * (-3.78301-(-12.60079)));
        }
        else if (tickAnim >= 28 && tickAnim < 48) {
            xx = -79.0316+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50+20))*100 + (((tickAnim - 28) / 20) * (6.07418-(-79.0316+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50+20))*100)));
            yy = -1.2555 + (((tickAnim - 28) / 20) * (-1.70036-(-1.2555)));
            zz = -3.78301 + (((tickAnim - 28) / 20) * (-9.44818-(-3.78301)));
        }
        else if (tickAnim >= 48 && tickAnim < 55) {
            xx = 6.07418 + (((tickAnim - 48) / 7) * (2.29194-(6.07418)));
            yy = -1.70036 + (((tickAnim - 48) / 7) * (-1.88235-(-1.70036)));
            zz = -9.44818 + (((tickAnim - 48) / 7) * (-11.76575-(-9.44818)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightArm3, rightArm3.rotateAngleX + (float) Math.toRadians(xx), rightArm3.rotateAngleY + (float) Math.toRadians(yy), rightArm3.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 14) {
            xx = 0 + (((tickAnim - 0) / 14) * (0-(0)));
            yy = 1.05 + (((tickAnim - 0) / 14) * (-0.65-(1.05)));
            zz = 0 + (((tickAnim - 0) / 14) * (0-(0)));
        }
        else if (tickAnim >= 14 && tickAnim < 19) {
            xx = 0 + (((tickAnim - 14) / 5) * (0-(0)));
            yy = -0.65 + (((tickAnim - 14) / 5) * (-0.475-(-0.65)));
            zz = 0 + (((tickAnim - 14) / 5) * (-0.475-(0)));
        }
        else if (tickAnim >= 19 && tickAnim < 24) {
            xx = 0 + (((tickAnim - 19) / 5) * (0-(0)));
            yy = -0.475 + (((tickAnim - 19) / 5) * (-0.475-(-0.475)));
            zz = -0.475 + (((tickAnim - 19) / 5) * (-0.475-(-0.475)));
        }
        else if (tickAnim >= 24 && tickAnim < 28) {
            xx = 0 + (((tickAnim - 24) / 4) * (0-(0)));
            yy = -0.475 + (((tickAnim - 24) / 4) * (0.625-(-0.475)));
            zz = -0.475 + (((tickAnim - 24) / 4) * (0-(-0.475)));
        }
        else if (tickAnim >= 28 && tickAnim < 31) {
            xx = 0 + (((tickAnim - 28) / 3) * (0-(0)));
            yy = 0.625 + (((tickAnim - 28) / 3) * (1.38-(0.625)));
            zz = 0 + (((tickAnim - 28) / 3) * (-0.1-(0)));
        }
        else if (tickAnim >= 31 && tickAnim < 34) {
            xx = 0 + (((tickAnim - 31) / 3) * (0-(0)));
            yy = 1.38 + (((tickAnim - 31) / 3) * (1.805-(1.38)));
            zz = -0.1 + (((tickAnim - 31) / 3) * (-0.1-(-0.1)));
        }
        else if (tickAnim >= 34 && tickAnim < 40) {
            xx = 0 + (((tickAnim - 34) / 6) * (0-(0)));
            yy = 1.805 + (((tickAnim - 34) / 6) * (1.39-(1.805)));
            zz = -0.1 + (((tickAnim - 34) / 6) * (-0.19-(-0.1)));
        }
        else if (tickAnim >= 40 && tickAnim < 48) {
            xx = 0 + (((tickAnim - 40) / 8) * (0-(0)));
            yy = 1.39 + (((tickAnim - 40) / 8) * (1.85-(1.39)));
            zz = -0.19 + (((tickAnim - 40) / 8) * (-0.09-(-0.19)));
        }
        else if (tickAnim >= 48 && tickAnim < 55) {
            xx = 0 + (((tickAnim - 48) / 7) * (0-(0)));
            yy = 1.85 + (((tickAnim - 48) / 7) * (1.05-(1.85)));
            zz = -0.09 + (((tickAnim - 48) / 7) * (0-(-0.09)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.rightArm3.rotationPointX = this.rightArm3.rotationPointX + (float)(xx);
        this.rightArm3.rotationPointY = this.rightArm3.rotationPointY - (float)(yy);
        this.rightArm3.rotationPointZ = this.rightArm3.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 38) {
            xx = -58.33221 + (((tickAnim - 0) / 38) * (-26.525+Math.sin((Math.PI/180)*(((double)tickAnim/20)*90+10))*50-(-58.33221)));
            yy = 5.9708 + (((tickAnim - 0) / 38) * (0-(5.9708)));
            zz = 7.06853 + (((tickAnim - 0) / 38) * (0-(7.06853)));
        }
        else if (tickAnim >= 38 && tickAnim < 55) {
            xx = -26.525+Math.sin((Math.PI/180)*(((double)tickAnim/20)*90+10))*50 + (((tickAnim - 38) / 17) * (-58.33221-(-26.525+Math.sin((Math.PI/180)*(((double)tickAnim/20)*90+10))*50)));
            yy = 0 + (((tickAnim - 38) / 17) * (5.9708-(0)));
            zz = 0 + (((tickAnim - 38) / 17) * (7.06853-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftArm, leftArm.rotateAngleX + (float) Math.toRadians(xx), leftArm.rotateAngleY + (float) Math.toRadians(yy), leftArm.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 29) {
            xx = 29.75 + (((tickAnim - 0) / 29) * (43.725+Math.sin((Math.PI/180)*(((double)tickAnim/20)*20))*-20-(29.75)));
            yy = 0 + (((tickAnim - 0) / 29) * (0-(0)));
            zz = -18 + (((tickAnim - 0) / 29) * (0-(-18)));
        }
        else if (tickAnim >= 29 && tickAnim < 39) {
            xx = 43.725+Math.sin((Math.PI/180)*(((double)tickAnim/20)*20))*-20 + (((tickAnim - 29) / 10) * (-64.675+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50+20))*100-(43.725+Math.sin((Math.PI/180)*(((double)tickAnim/20)*20))*-20)));
            yy = 0 + (((tickAnim - 29) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 29) / 10) * (-2.4-(0)));
        }
        else if (tickAnim >= 39 && tickAnim < 46) {
            xx = -64.675+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50+20))*100 + (((tickAnim - 39) / 7) * (-97.7+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50+20))*130-(-64.675+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50+20))*100)));
            yy = 0 + (((tickAnim - 39) / 7) * (0-(0)));
            zz = -2.4 + (((tickAnim - 39) / 7) * (-4.25-(-2.4)));
        }
        else if (tickAnim >= 46 && tickAnim < 55) {
            xx = -97.7+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50+20))*130 + (((tickAnim - 46) / 9) * (29.75-(-97.7+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50+20))*130)));
            yy = 0 + (((tickAnim - 46) / 9) * (0-(0)));
            zz = -4.25 + (((tickAnim - 46) / 9) * (-18-(-4.25)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftArm2, leftArm2.rotateAngleX + (float) Math.toRadians(xx), leftArm2.rotateAngleY + (float) Math.toRadians(yy), leftArm2.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 0.625 + (((tickAnim - 0) / 3) * (0.625-(0.625)));
            yy = 0.7 + (((tickAnim - 0) / 3) * (0.7+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1220/0.7))*0.1-(0.7)));
            zz = -0.55 + (((tickAnim - 0) / 3) * (-0.55-(-0.55)));
        }
        else if (tickAnim >= 3 && tickAnim < 5) {
            xx = 0.625 + (((tickAnim - 3) / 2) * (0.625-(0.625)));
            yy = 0.7+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1220/0.7))*0.1 + (((tickAnim - 3) / 2) * (0.7-(0.7+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1220/0.7))*0.1)));
            zz = -0.55 + (((tickAnim - 3) / 2) * (-0.55-(-0.55)));
        }
        else if (tickAnim >= 5 && tickAnim < 38) {
            xx = 0.625 + (((tickAnim - 5) / 33) * (0-(0.625)));
            yy = 0.7 + (((tickAnim - 5) / 33) * (0-(0.7)));
            zz = -0.55 + (((tickAnim - 5) / 33) * (0-(-0.55)));
        }
        else if (tickAnim >= 38 && tickAnim < 48) {
            xx = 0 + (((tickAnim - 38) / 10) * (0.35-(0)));
            yy = 0 + (((tickAnim - 38) / 10) * (-0.26-(0)));
            zz = 0 + (((tickAnim - 38) / 10) * (-0.31-(0)));
        }
        else if (tickAnim >= 48 && tickAnim < 55) {
            xx = 0.35 + (((tickAnim - 48) / 7) * (0.625-(0.35)));
            yy = -0.26 + (((tickAnim - 48) / 7) * (0.7-(-0.26)));
            zz = -0.31 + (((tickAnim - 48) / 7) * (-0.55-(-0.31)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.leftArm2.rotationPointX = this.leftArm2.rotationPointX + (float)(xx);
        this.leftArm2.rotationPointY = this.leftArm2.rotationPointY - (float)(yy);
        this.leftArm2.rotationPointZ = this.leftArm2.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 14) {
            xx = 25.63687 + (((tickAnim - 0) / 14) * (3.78674-(25.63687)));
            yy = 2.511 + (((tickAnim - 0) / 14) * (0.87339-(2.511)));
            zz = 7.56602 + (((tickAnim - 0) / 14) * (2.63166-(7.56602)));
        }
        else if (tickAnim >= 14 && tickAnim < 21) {
            xx = 3.78674 + (((tickAnim - 14) / 7) * (0-(3.78674)));
            yy = 0.87339 + (((tickAnim - 14) / 7) * (0-(0.87339)));
            zz = 2.63166 + (((tickAnim - 14) / 7) * (0-(2.63166)));
        }
        else if (tickAnim >= 21 && tickAnim < 27) {
            xx = 0 + (((tickAnim - 21) / 6) * (0-(0)));
            yy = 0 + (((tickAnim - 21) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 21) / 6) * (0-(0)));
        }
        else if (tickAnim >= 27 && tickAnim < 39) {
            xx = 0 + (((tickAnim - 27) / 12) * (172.7457+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50+50))*-200-(0)));
            yy = 0 + (((tickAnim - 27) / 12) * (-0.65029-(0)));
            zz = 0 + (((tickAnim - 27) / 12) * (12.60079-(0)));
        }
        else if (tickAnim >= 39 && tickAnim < 55) {
            xx = 172.7457+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50+50))*-200 + (((tickAnim - 39) / 16) * (25.63687-(172.7457+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50+50))*-200)));
            yy = -0.65029 + (((tickAnim - 39) / 16) * (2.511-(-0.65029)));
            zz = 12.60079 + (((tickAnim - 39) / 16) * (7.56602-(12.60079)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftArm3, leftArm3.rotateAngleX + (float) Math.toRadians(xx), leftArm3.rotateAngleY + (float) Math.toRadians(yy), leftArm3.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 0) / 5) * (0-(0)));
            yy = 0.725 + (((tickAnim - 0) / 5) * (2.335-(0.725)));
            zz = -0.325 + (((tickAnim - 0) / 5) * (-0.25-(-0.325)));
        }
        else if (tickAnim >= 5 && tickAnim < 14) {
            xx = 0 + (((tickAnim - 5) / 9) * (0-(0)));
            yy = 2.335 + (((tickAnim - 5) / 9) * (2.475-(2.335)));
            zz = -0.25 + (((tickAnim - 5) / 9) * (-0.11-(-0.25)));
        }
        else if (tickAnim >= 14 && tickAnim < 21) {
            xx = 0 + (((tickAnim - 14) / 7) * (0-(0)));
            yy = 2.475 + (((tickAnim - 14) / 7) * (0.275-(2.475)));
            zz = -0.11 + (((tickAnim - 14) / 7) * (0-(-0.11)));
        }
        else if (tickAnim >= 21 && tickAnim < 27) {
            xx = 0 + (((tickAnim - 21) / 6) * (0-(0)));
            yy = 0.275 + (((tickAnim - 21) / 6) * (0.475-(0.275)));
            zz = 0 + (((tickAnim - 21) / 6) * (0-(0)));
        }
        else if (tickAnim >= 27 && tickAnim < 39) {
            xx = 0 + (((tickAnim - 27) / 12) * (0-(0)));
            yy = 0.475 + (((tickAnim - 27) / 12) * (-0.215-(0.475)));
            zz = 0 + (((tickAnim - 27) / 12) * (-0.4-(0)));
        }
        else if (tickAnim >= 39 && tickAnim < 46) {
            xx = 0 + (((tickAnim - 39) / 7) * (0-(0)));
            yy = -0.215 + (((tickAnim - 39) / 7) * (-0.475-(-0.215)));
            zz = -0.4 + (((tickAnim - 39) / 7) * (-0.475-(-0.4)));
        }
        else if (tickAnim >= 46 && tickAnim < 55) {
            xx = 0 + (((tickAnim - 46) / 9) * (0-(0)));
            yy = -0.475 + (((tickAnim - 46) / 9) * (0.725-(-0.475)));
            zz = -0.475 + (((tickAnim - 46) / 9) * (-0.325-(-0.475)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.leftArm3.rotationPointX = this.leftArm3.rotationPointX + (float)(xx);
        this.leftArm3.rotationPointY = this.leftArm3.rotationPointY - (float)(yy);
        this.leftArm3.rotationPointZ = this.leftArm3.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 18) {
            xx = 16.75 + (((tickAnim - 0) / 18) * (-16.5-(16.75)));
            yy = 0 + (((tickAnim - 0) / 18) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 18) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 55) {
            xx = -16.5 + (((tickAnim - 18) / 37) * (16.75-(-16.5)));
            yy = 0 + (((tickAnim - 18) / 37) * (0-(0)));
            zz = 0 + (((tickAnim - 18) / 37) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightLeg, rightLeg.rotateAngleX + (float) Math.toRadians(xx), rightLeg.rotateAngleY + (float) Math.toRadians(yy), rightLeg.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 8) {
            xx = 17.8 + (((tickAnim - 0) / 8) * (64.255+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*-100-(17.8)));
            yy = 0 + (((tickAnim - 0) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 8) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 55) {
            xx = 64.255+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*-100 + (((tickAnim - 8) / 47) * (17.8-(64.255+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*-100)));
            yy = 0 + (((tickAnim - 8) / 47) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 47) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightLeg2, rightLeg2.rotateAngleX + (float) Math.toRadians(xx), rightLeg2.rotateAngleY + (float) Math.toRadians(yy), rightLeg2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 8) {
            xx = 20.25 + (((tickAnim - 0) / 8) * (-34-(20.25)));
            yy = 0 + (((tickAnim - 0) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 8) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 13) {
            xx = -34 + (((tickAnim - 8) / 5) * (-34-(-34)));
            yy = 0 + (((tickAnim - 8) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 5) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 18) {
            xx = -34 + (((tickAnim - 13) / 5) * (14.75-(-34)));
            yy = 0 + (((tickAnim - 13) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 13) / 5) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 55) {
            xx = 14.75 + (((tickAnim - 18) / 37) * (20.25-(14.75)));
            yy = 0 + (((tickAnim - 18) / 37) * (0-(0)));
            zz = 0 + (((tickAnim - 18) / 37) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightLeg3, rightLeg3.rotateAngleX + (float) Math.toRadians(xx), rightLeg3.rotateAngleY + (float) Math.toRadians(yy), rightLeg3.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 18) {
            xx = 0 + (((tickAnim - 0) / 18) * (0-(0)));
            yy = -0.85 + (((tickAnim - 0) / 18) * (0-(-0.85)));
            zz = 0 + (((tickAnim - 0) / 18) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 55) {
            xx = 0 + (((tickAnim - 18) / 37) * (0-(0)));
            yy = 0 + (((tickAnim - 18) / 37) * (-0.85-(0)));
            zz = 0 + (((tickAnim - 18) / 37) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.rightLeg3.rotationPointX = this.rightLeg3.rotationPointX + (float)(xx);
        this.rightLeg3.rotationPointY = this.rightLeg3.rotationPointY - (float)(yy);
        this.rightLeg3.rotationPointZ = this.rightLeg3.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 31.75 + (((tickAnim - 0) / 3) * (67.88-(31.75)));
            yy = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 3) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 8) {
            xx = 67.88 + (((tickAnim - 3) / 5) * (79.38-(67.88)));
            yy = 0 + (((tickAnim - 3) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 3) / 5) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 13) {
            xx = 79.38 + (((tickAnim - 8) / 5) * (50.88-(79.38)));
            yy = 0 + (((tickAnim - 8) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 5) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 18) {
            xx = 50.88 + (((tickAnim - 13) / 5) * (5-(50.88)));
            yy = 0 + (((tickAnim - 13) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 13) / 5) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 28) {
            xx = 5 + (((tickAnim - 18) / 10) * (3.09-(5)));
            yy = 0 + (((tickAnim - 18) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 18) / 10) * (0-(0)));
        }
        else if (tickAnim >= 28 && tickAnim < 35) {
            xx = 3.09 + (((tickAnim - 28) / 7) * (-11.65-(3.09)));
            yy = 0 + (((tickAnim - 28) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 28) / 7) * (0-(0)));
        }
        else if (tickAnim >= 35 && tickAnim < 44) {
            xx = -11.65 + (((tickAnim - 35) / 9) * (-30.9-(-11.65)));
            yy = 0 + (((tickAnim - 35) / 9) * (0-(0)));
            zz = 0 + (((tickAnim - 35) / 9) * (0-(0)));
        }
        else if (tickAnim >= 44 && tickAnim < 55) {
            xx = -30.9 + (((tickAnim - 44) / 11) * (31.75-(-30.9)));
            yy = 0 + (((tickAnim - 44) / 11) * (0-(0)));
            zz = 0 + (((tickAnim - 44) / 11) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightLeg4, rightLeg4.rotateAngleX + (float) Math.toRadians(xx), rightLeg4.rotateAngleY + (float) Math.toRadians(yy), rightLeg4.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 0) / 8) * (0-(0)));
            yy = 0.525 + (((tickAnim - 0) / 8) * (0.26-(0.525)));
            zz = -0.225 + (((tickAnim - 0) / 8) * (-1.035-(-0.225)));
        }
        else if (tickAnim >= 8 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 8) / 5) * (0-(0)));
            yy = 0.26 + (((tickAnim - 8) / 5) * (-0.29-(0.26)));
            zz = -1.035 + (((tickAnim - 8) / 5) * (-1.035-(-1.035)));
        }
        else if (tickAnim >= 13 && tickAnim < 18) {
            xx = 0 + (((tickAnim - 13) / 5) * (0-(0)));
            yy = -0.29 + (((tickAnim - 13) / 5) * (0.3-(-0.29)));
            zz = -1.035 + (((tickAnim - 13) / 5) * (0-(-1.035)));
        }
        else if (tickAnim >= 18 && tickAnim < 28) {
            xx = 0 + (((tickAnim - 18) / 10) * (0-(0)));
            yy = 0.3 + (((tickAnim - 18) / 10) * (2.065-(0.3)));
            zz = 0 + (((tickAnim - 18) / 10) * (-0.05-(0)));
        }
        else if (tickAnim >= 28 && tickAnim < 35) {
            xx = 0 + (((tickAnim - 28) / 7) * (0-(0)));
            yy = 2.065 + (((tickAnim - 28) / 7) * (1.835-(2.065)));
            zz = -0.05 + (((tickAnim - 28) / 7) * (-0.09-(-0.05)));
        }
        else if (tickAnim >= 35 && tickAnim < 44) {
            xx = 0 + (((tickAnim - 35) / 9) * (0-(0)));
            yy = 1.835 + (((tickAnim - 35) / 9) * (-1.015-(1.835)));
            zz = -0.09 + (((tickAnim - 35) / 9) * (-0.09-(-0.09)));
        }
        else if (tickAnim >= 44 && tickAnim < 49) {
            xx = 0 + (((tickAnim - 44) / 5) * (0-(0)));
            yy = -1.015 + (((tickAnim - 44) / 5) * (-0.265-(-1.015)));
            zz = -0.09 + (((tickAnim - 44) / 5) * (-0.16-(-0.09)));
        }
        else if (tickAnim >= 49 && tickAnim < 55) {
            xx = 0 + (((tickAnim - 49) / 6) * (0-(0)));
            yy = -0.265 + (((tickAnim - 49) / 6) * (0.525-(-0.265)));
            zz = -0.16 + (((tickAnim - 49) / 6) * (-0.225-(-0.16)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.rightLeg4.rotationPointX = this.rightLeg4.rotationPointX + (float)(xx);
        this.rightLeg4.rotationPointY = this.rightLeg4.rotationPointY - (float)(yy);
        this.rightLeg4.rotationPointZ = this.rightLeg4.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 3) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 3) / 7) * (0-(0)));
            yy = 0 + (((tickAnim - 3) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 3) / 7) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 14) {
            xx = 0 + (((tickAnim - 10) / 4) * (0-(0)));
            yy = 0 + (((tickAnim - 10) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 4) * (0-(0)));
        }
        else if (tickAnim >= 14 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 14) / 6) * (0-(0)));
            yy = 0 + (((tickAnim - 14) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 14) / 6) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 35) {
            xx = 0 + (((tickAnim - 20) / 15) * (0-(0)));
            yy = 0 + (((tickAnim - 20) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 15) * (0-(0)));
        }
        else if (tickAnim >= 35 && tickAnim < 55) {
            xx = 0 + (((tickAnim - 35) / 20) * (0-(0)));
            yy = 0 + (((tickAnim - 35) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 35) / 20) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightLeg5, rightLeg5.rotateAngleX + (float) Math.toRadians(xx), rightLeg5.rotateAngleY + (float) Math.toRadians(yy), rightLeg5.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 3) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 3) / 7) * (0-(0)));
            yy = 0 + (((tickAnim - 3) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 3) / 7) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 14) {
            xx = 0 + (((tickAnim - 10) / 4) * (0-(0)));
            yy = 0 + (((tickAnim - 10) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 4) * (0-(0)));
        }
        else if (tickAnim >= 14 && tickAnim < 35) {
            xx = 0 + (((tickAnim - 14) / 21) * (0-(0)));
            yy = 0 + (((tickAnim - 14) / 21) * (0-(0)));
            zz = 0 + (((tickAnim - 14) / 21) * (0-(0)));
        }
        else if (tickAnim >= 35 && tickAnim < 55) {
            xx = 0 + (((tickAnim - 35) / 20) * (0-(0)));
            yy = 0 + (((tickAnim - 35) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 35) / 20) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.rightLeg5.rotationPointX = this.rightLeg5.rotationPointX + (float)(xx);
        this.rightLeg5.rotationPointY = this.rightLeg5.rotationPointY - (float)(yy);
        this.rightLeg5.rotationPointZ = this.rightLeg5.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 28) {
            xx = -6.75 + (((tickAnim - 0) / 28) * (16.75-(-6.75)));
            yy = 0 + (((tickAnim - 0) / 28) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 28) * (0-(0)));
        }
        else if (tickAnim >= 28 && tickAnim < 44) {
            xx = 16.75 + (((tickAnim - 28) / 16) * (-16.5-(16.75)));
            yy = 0 + (((tickAnim - 28) / 16) * (0-(0)));
            zz = 0 + (((tickAnim - 28) / 16) * (0-(0)));
        }
        else if (tickAnim >= 44 && tickAnim < 55) {
            xx = -16.5 + (((tickAnim - 44) / 11) * (-6.75-(-16.5)));
            yy = 0 + (((tickAnim - 44) / 11) * (0-(0)));
            zz = 0 + (((tickAnim - 44) / 11) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftLeg, leftLeg.rotateAngleX + (float) Math.toRadians(xx), leftLeg.rotateAngleY + (float) Math.toRadians(yy), leftLeg.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 28) {
            xx = -5.25+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50-40))*-10 + (((tickAnim - 0) / 28) * (10.875-(-5.25+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50-40))*-10)));
            yy = 0 + (((tickAnim - 0) / 28) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 28) * (0-(0)));
        }
        else if (tickAnim >= 28 && tickAnim < 35) {
            xx = 10.875 + (((tickAnim - 28) / 7) * (103.605+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50-40))*-120-(10.875)));
            yy = 0 + (((tickAnim - 28) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 28) / 7) * (0-(0)));
        }
        else if (tickAnim >= 35 && tickAnim < 55) {
            xx = 103.605+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50-40))*-120 + (((tickAnim - 35) / 20) * (-14.675+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50-10))*20-(103.605+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50-40))*-120)));
            yy = 0 + (((tickAnim - 35) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 35) / 20) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftLeg2, leftLeg2.rotateAngleX + (float) Math.toRadians(xx), leftLeg2.rotateAngleY + (float) Math.toRadians(yy), leftLeg2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 28) {
            xx = 9 + (((tickAnim - 0) / 28) * (20.25-(9)));
            yy = 0 + (((tickAnim - 0) / 28) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 28) * (0-(0)));
        }
        else if (tickAnim >= 28 && tickAnim < 35) {
            xx = 20.25 + (((tickAnim - 28) / 7) * (-34-(20.25)));
            yy = 0 + (((tickAnim - 28) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 28) / 7) * (0-(0)));
        }
        else if (tickAnim >= 35 && tickAnim < 39) {
            xx = -34 + (((tickAnim - 35) / 4) * (-34-(-34)));
            yy = 0 + (((tickAnim - 35) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 35) / 4) * (0-(0)));
        }
        else if (tickAnim >= 39 && tickAnim < 44) {
            xx = -34 + (((tickAnim - 39) / 5) * (14.75-(-34)));
            yy = 0 + (((tickAnim - 39) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 39) / 5) * (0-(0)));
        }
        else if (tickAnim >= 44 && tickAnim < 55) {
            xx = 14.75 + (((tickAnim - 44) / 11) * (9-(14.75)));
            yy = 0 + (((tickAnim - 44) / 11) * (0-(0)));
            zz = 0 + (((tickAnim - 44) / 11) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftLeg3, leftLeg3.rotateAngleX + (float) Math.toRadians(xx), leftLeg3.rotateAngleY + (float) Math.toRadians(yy), leftLeg3.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 28) {
            xx = 0 + (((tickAnim - 0) / 28) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 28) * (-0.85-(0)));
            zz = 0 + (((tickAnim - 0) / 28) * (0-(0)));
        }
        else if (tickAnim >= 28 && tickAnim < 44) {
            xx = 0 + (((tickAnim - 28) / 16) * (0-(0)));
            yy = -0.85 + (((tickAnim - 28) / 16) * (0-(-0.85)));
            zz = 0 + (((tickAnim - 28) / 16) * (0-(0)));
        }
        else if (tickAnim >= 44 && tickAnim < 55) {
            xx = 0 + (((tickAnim - 44) / 11) * (0-(0)));
            yy = 0 + (((tickAnim - 44) / 11) * (0-(0)));
            zz = 0 + (((tickAnim - 44) / 11) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.leftLeg3.rotationPointX = this.leftLeg3.rotationPointX + (float)(xx);
        this.leftLeg3.rotationPointY = this.leftLeg3.rotationPointY - (float)(yy);
        this.leftLeg3.rotationPointZ = this.leftLeg3.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 11) {
            xx = -4.5 + (((tickAnim - 0) / 11) * (-16.65-(-4.5)));
            yy = 0 + (((tickAnim - 0) / 11) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 11) * (0-(0)));
        }
        else if (tickAnim >= 11 && tickAnim < 28) {
            xx = -16.65 + (((tickAnim - 11) / 17) * (31.75-(-16.65)));
            yy = 0 + (((tickAnim - 11) / 17) * (0-(0)));
            zz = 0 + (((tickAnim - 11) / 17) * (0-(0)));
        }
        else if (tickAnim >= 28 && tickAnim < 31) {
            xx = 31.75 + (((tickAnim - 28) / 3) * (67.88-(31.75)));
            yy = 0 + (((tickAnim - 28) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 28) / 3) * (0-(0)));
        }
        else if (tickAnim >= 31 && tickAnim < 35) {
            xx = 67.88 + (((tickAnim - 31) / 4) * (79.38-(67.88)));
            yy = 0 + (((tickAnim - 31) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 31) / 4) * (0-(0)));
        }
        else if (tickAnim >= 35 && tickAnim < 38) {
            xx = 79.38 + (((tickAnim - 35) / 3) * (68.105-(79.38)));
            yy = 0 + (((tickAnim - 35) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 35) / 3) * (0-(0)));
        }
        else if (tickAnim >= 38 && tickAnim < 44) {
            xx = 68.105 + (((tickAnim - 38) / 6) * (6.25-(68.105)));
            yy = 0 + (((tickAnim - 38) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 38) / 6) * (0-(0)));
        }
        else if (tickAnim >= 44 && tickAnim < 55) {
            xx = 6.25 + (((tickAnim - 44) / 11) * (-4.5-(6.25)));
            yy = 0 + (((tickAnim - 44) / 11) * (0-(0)));
            zz = 0 + (((tickAnim - 44) / 11) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftLeg4, leftLeg4.rotateAngleX + (float) Math.toRadians(xx), leftLeg4.rotateAngleY + (float) Math.toRadians(yy), leftLeg4.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 11) {
            xx = 0 + (((tickAnim - 0) / 11) * (0-(0)));
            yy = 0.3 + (((tickAnim - 0) / 11) * (1.71+Math.sin((Math.PI/180)*(((double)tickAnim/20)*190))*-1.5-(0.3)));
            zz = 0 + (((tickAnim - 0) / 11) * (-0.09-(0)));
        }
        else if (tickAnim >= 11 && tickAnim < 28) {
            xx = 0 + (((tickAnim - 11) / 17) * (0-(0)));
            yy = 1.71+Math.sin((Math.PI/180)*(((double)tickAnim/20)*190))*-1.5 + (((tickAnim - 11) / 17) * (0.29-(1.71+Math.sin((Math.PI/180)*(((double)tickAnim/20)*190))*-1.5)));
            zz = -0.09 + (((tickAnim - 11) / 17) * (-0.74-(-0.09)));
        }
        else if (tickAnim >= 28 && tickAnim < 35) {
            xx = 0 + (((tickAnim - 28) / 7) * (0-(0)));
            yy = 0.29 + (((tickAnim - 28) / 7) * (0.26-(0.29)));
            zz = -0.74 + (((tickAnim - 28) / 7) * (-1.035-(-0.74)));
        }
        else if (tickAnim >= 35 && tickAnim < 38) {
            xx = 0 + (((tickAnim - 35) / 3) * (0-(0)));
            yy = 0.26 + (((tickAnim - 35) / 3) * (-0.29-(0.26)));
            zz = -1.035 + (((tickAnim - 35) / 3) * (-1.035-(-1.035)));
        }
        else if (tickAnim >= 38 && tickAnim < 44) {
            xx = 0 + (((tickAnim - 38) / 6) * (0-(0)));
            yy = -0.29 + (((tickAnim - 38) / 6) * (0.225-(-0.29)));
            zz = -1.035 + (((tickAnim - 38) / 6) * (0-(-1.035)));
        }
        else if (tickAnim >= 44 && tickAnim < 55) {
            xx = 0 + (((tickAnim - 44) / 11) * (0-(0)));
            yy = 0.225 + (((tickAnim - 44) / 11) * (0.3-(0.225)));
            zz = 0 + (((tickAnim - 44) / 11) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.leftLeg4.rotationPointX = this.leftLeg4.rotationPointX + (float)(xx);
        this.leftLeg4.rotationPointY = this.leftLeg4.rotationPointY - (float)(yy);
        this.leftLeg4.rotationPointZ = this.leftLeg4.rotationPointZ + (float)(zz);



        this.setRotateAngle(leftLeg5, leftLeg5.rotateAngleX + (float) Math.toRadians(0), leftLeg5.rotateAngleY + (float) Math.toRadians(0), leftLeg5.rotateAngleZ + (float) Math.toRadians(0));
        this.leftLeg5.rotationPointX = this.leftLeg5.rotationPointX + (float)(0);
        this.leftLeg5.rotationPointY = this.leftLeg5.rotationPointY - (float)(0);
        this.leftLeg5.rotationPointZ = this.leftLeg5.rotationPointZ + (float)(0);

    }
    public void animRunning(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime) {
        EntityPrehistoricFloraOlorotitan entity = (EntityPrehistoricFloraOlorotitan) entitylivingbaseIn;
        int animCycle = 26;
        double tickAnim = (entity.ticksExisted + entity.getTickOffset()) - (int) (Math.floor((double) (entity.ticksExisted + entity.getTickOffset()) / (double) animCycle) * (double) animCycle) + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;

        if (tickAnim >= 0 && tickAnim < 7) {
            xx = 0 + (((tickAnim - 0) / 7) * (-3.0911+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*-100-(0)));
            yy = 0 + (((tickAnim - 0) / 7) * (-2.9854-(0)));
            zz = -8.5 + (((tickAnim - 0) / 7) * (-7.78426-(-8.5)));
        }
        else if (tickAnim >= 7 && tickAnim < 13) {
            xx = -3.0911+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*-100 + (((tickAnim - 7) / 6) * (-58.33221-(-3.0911+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*-100)));
            yy = -2.9854 + (((tickAnim - 7) / 6) * (-5.9708-(-2.9854)));
            zz = -7.78426 + (((tickAnim - 7) / 6) * (-7.06853-(-7.78426)));
        }
        else if (tickAnim >= 13 && tickAnim < 27) {
            xx = -58.33221 + (((tickAnim - 13) / 14) * (0-(-58.33221)));
            yy = -5.9708 + (((tickAnim - 13) / 14) * (0-(-5.9708)));
            zz = -7.06853 + (((tickAnim - 13) / 14) * (-8.5-(-7.06853)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightArm, rightArm.rotateAngleX + (float) Math.toRadians(xx), rightArm.rotateAngleY + (float) Math.toRadians(yy), rightArm.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 7) {
            xx = 10.0933 + (((tickAnim - 0) / 7) * (21.3216+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*-150-(10.0933)));
            yy = 3.58872 + (((tickAnim - 0) / 7) * (1.79436-(3.58872)));
            zz = 5.43562 + (((tickAnim - 0) / 7) * (11.71781-(5.43562)));
        }
        else if (tickAnim >= 7 && tickAnim < 13) {
            xx = 21.3216+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*-150 + (((tickAnim - 7) / 6) * (29.75-(21.3216+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*-150)));
            yy = 1.79436 + (((tickAnim - 7) / 6) * (0-(1.79436)));
            zz = 11.71781 + (((tickAnim - 7) / 6) * (18-(11.71781)));
        }
        else if (tickAnim >= 13 && tickAnim < 27) {
            xx = 29.75 + (((tickAnim - 13) / 14) * (10.0933-(29.75)));
            yy = 0 + (((tickAnim - 13) / 14) * (3.58872-(0)));
            zz = 18 + (((tickAnim - 13) / 14) * (5.43562-(18)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightArm2, rightArm2.rotateAngleX + (float) Math.toRadians(xx), rightArm2.rotateAngleY + (float) Math.toRadians(yy), rightArm2.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 0) / 13) * (-0.625-(0)));
            yy = 0 + (((tickAnim - 0) / 13) * (0.7-(0)));
            zz = 0 + (((tickAnim - 0) / 13) * (-0.55-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 16) {
            xx = -0.625 + (((tickAnim - 13) / 3) * (-0.525-(-0.625)));
            yy = 0.7 + (((tickAnim - 13) / 3) * (0.9+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1220/0.5))*0.1-(0.7)));
            zz = -0.55 + (((tickAnim - 13) / 3) * (-0.475-(-0.55)));
        }
        else if (tickAnim >= 16 && tickAnim < 18) {
            xx = -0.525 + (((tickAnim - 16) / 2) * (-0.39-(-0.525)));
            yy = 0.9+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1220/0.5))*0.1 + (((tickAnim - 16) / 2) * (1.14-(0.9+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1220/0.5))*0.1)));
            zz = -0.475 + (((tickAnim - 16) / 2) * (-0.34-(-0.475)));
        }
        else if (tickAnim >= 18 && tickAnim < 27) {
            xx = -0.39 + (((tickAnim - 18) / 9) * (0-(-0.39)));
            yy = 1.14 + (((tickAnim - 18) / 9) * (0-(1.14)));
            zz = -0.34 + (((tickAnim - 18) / 9) * (0-(-0.34)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.rightArm2.rotationPointX = this.rightArm2.rotationPointX + (float)(xx);
        this.rightArm2.rotationPointY = this.rightArm2.rotationPointY - (float)(yy);
        this.rightArm2.rotationPointZ = this.rightArm2.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 7) {
            xx = 15.5 + (((tickAnim - 0) / 7) * (89.94344-(15.5)));
            yy = 0 + (((tickAnim - 0) / 7) * (-1.2555-(0)));
            zz = 0 + (((tickAnim - 0) / 7) * (-3.78301-(0)));
        }
        else if (tickAnim >= 7 && tickAnim < 13) {
            xx = 89.94344 + (((tickAnim - 7) / 6) * (25.63687-(89.94344)));
            yy = -1.2555 + (((tickAnim - 7) / 6) * (-2.511-(-1.2555)));
            zz = -3.78301 + (((tickAnim - 7) / 6) * (-7.56602-(-3.78301)));
        }
        else if (tickAnim >= 13 && tickAnim < 18) {
            xx = 25.63687 + (((tickAnim - 13) / 5) * (10.4293-(25.63687)));
            yy = -2.511 + (((tickAnim - 13) / 5) * (-1.56938-(-2.511)));
            zz = -7.56602 + (((tickAnim - 13) / 5) * (-4.72876-(-7.56602)));
        }
        else if (tickAnim >= 18 && tickAnim < 27) {
            xx = 10.4293 + (((tickAnim - 18) / 9) * (15.5-(10.4293)));
            yy = -1.56938 + (((tickAnim - 18) / 9) * (0-(-1.56938)));
            zz = -4.72876 + (((tickAnim - 18) / 9) * (0-(-4.72876)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightArm3, rightArm3.rotateAngleX + (float) Math.toRadians(xx), rightArm3.rotateAngleY + (float) Math.toRadians(yy), rightArm3.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 7) {
            xx = 0 + (((tickAnim - 0) / 7) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 7) * (-0.815-(0)));
            zz = 0 + (((tickAnim - 0) / 7) * (-0.16-(0)));
        }
        else if (tickAnim >= 7 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 7) / 6) * (0-(0)));
            yy = -0.815 + (((tickAnim - 7) / 6) * (0.725-(-0.815)));
            zz = -0.16 + (((tickAnim - 7) / 6) * (-0.325-(-0.16)));
        }
        else if (tickAnim >= 13 && tickAnim < 18) {
            xx = 0 + (((tickAnim - 13) / 5) * (0-(0)));
            yy = 0.725 + (((tickAnim - 13) / 5) * (1.6-(0.725)));
            zz = -0.325 + (((tickAnim - 13) / 5) * (-0.2-(-0.325)));
        }
        else if (tickAnim >= 18 && tickAnim < 27) {
            xx = 0 + (((tickAnim - 18) / 9) * (0-(0)));
            yy = 1.6 + (((tickAnim - 18) / 9) * (0-(1.6)));
            zz = -0.2 + (((tickAnim - 18) / 9) * (0-(-0.2)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.rightArm3.rotationPointX = this.rightArm3.rotationPointX + (float)(xx);
        this.rightArm3.rotationPointY = this.rightArm3.rotationPointY - (float)(yy);
        this.rightArm3.rotationPointZ = this.rightArm3.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 13) {
            xx = -58.33221 + (((tickAnim - 0) / 13) * (0-(-58.33221)));
            yy = 5.9708 + (((tickAnim - 0) / 13) * (0-(5.9708)));
            zz = 7.06853 + (((tickAnim - 0) / 13) * (8.5-(7.06853)));
        }
        else if (tickAnim >= 13 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 13) / 7) * (41.5839+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*-100-(0)));
            yy = 0 + (((tickAnim - 13) / 7) * (2.9854-(0)));
            zz = 8.5 + (((tickAnim - 13) / 7) * (0.09074-(8.5)));
        }
        else if (tickAnim >= 20 && tickAnim < 27) {
            xx = 41.5839+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*-100 + (((tickAnim - 20) / 7) * (-58.33221-(41.5839+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*-100)));
            yy = 2.9854 + (((tickAnim - 20) / 7) * (5.9708-(2.9854)));
            zz = 0.09074 + (((tickAnim - 20) / 7) * (7.06853-(0.09074)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftArm, leftArm.rotateAngleX + (float) Math.toRadians(xx), leftArm.rotateAngleY + (float) Math.toRadians(yy), leftArm.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 13) {
            xx = 29.75 + (((tickAnim - 0) / 13) * (10.0933-(29.75)));
            yy = 0 + (((tickAnim - 0) / 13) * (-3.58872-(0)));
            zz = -18 + (((tickAnim - 0) / 13) * (-5.43562-(-18)));
        }
        else if (tickAnim >= 13 && tickAnim < 20) {
            xx = 10.0933 + (((tickAnim - 13) / 7) * (89.1716+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*-150-(10.0933)));
            yy = -3.58872 + (((tickAnim - 13) / 7) * (-1.79436-(-3.58872)));
            zz = -5.43562 + (((tickAnim - 13) / 7) * (-11.71781-(-5.43562)));
        }
        else if (tickAnim >= 20 && tickAnim < 27) {
            xx = 89.1716+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*-150 + (((tickAnim - 20) / 7) * (29.75-(89.1716+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*-150)));
            yy = -1.79436 + (((tickAnim - 20) / 7) * (0-(-1.79436)));
            zz = -11.71781 + (((tickAnim - 20) / 7) * (-18-(-11.71781)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftArm2, leftArm2.rotateAngleX + (float) Math.toRadians(xx), leftArm2.rotateAngleY + (float) Math.toRadians(yy), leftArm2.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 0.625 + (((tickAnim - 0) / 3) * (0.525-(0.625)));
            yy = 0.7 + (((tickAnim - 0) / 3) * (0.9+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1220/0.5))*-0.1-(0.7)));
            zz = -0.55 + (((tickAnim - 0) / 3) * (-0.475-(-0.55)));
        }
        else if (tickAnim >= 3 && tickAnim < 5) {
            xx = 0.525 + (((tickAnim - 3) / 2) * (0.39-(0.525)));
            yy = 0.9+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1220/0.5))*-0.1 + (((tickAnim - 3) / 2) * (1.14-(0.9+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1220/0.5))*-0.1)));
            zz = -0.475 + (((tickAnim - 3) / 2) * (-0.34-(-0.475)));
        }
        else if (tickAnim >= 5 && tickAnim < 13) {
            xx = 0.39 + (((tickAnim - 5) / 8) * (0-(0.39)));
            yy = 1.14 + (((tickAnim - 5) / 8) * (0-(1.14)));
            zz = -0.34 + (((tickAnim - 5) / 8) * (0-(-0.34)));
        }
        else if (tickAnim >= 13 && tickAnim < 27) {
            xx = 0 + (((tickAnim - 13) / 14) * (0.625-(0)));
            yy = 0 + (((tickAnim - 13) / 14) * (0.7-(0)));
            zz = 0 + (((tickAnim - 13) / 14) * (-0.55-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.leftArm2.rotationPointX = this.leftArm2.rotationPointX + (float)(xx);
        this.leftArm2.rotationPointY = this.leftArm2.rotationPointY - (float)(yy);
        this.leftArm2.rotationPointZ = this.leftArm2.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 5) {
            xx = 25.63687 + (((tickAnim - 0) / 5) * (10.4293-(25.63687)));
            yy = 2.511 + (((tickAnim - 0) / 5) * (1.56938-(2.511)));
            zz = 7.56602 + (((tickAnim - 0) / 5) * (4.72876-(7.56602)));
        }
        else if (tickAnim >= 5 && tickAnim < 13) {
            xx = 10.4293 + (((tickAnim - 5) / 8) * (15.5-(10.4293)));
            yy = 1.56938 + (((tickAnim - 5) / 8) * (0-(1.56938)));
            zz = 4.72876 + (((tickAnim - 5) / 8) * (0-(4.72876)));
        }
        else if (tickAnim >= 13 && tickAnim < 20) {
            xx = 15.5 + (((tickAnim - 13) / 7) * (89.94344-(15.5)));
            yy = 0 + (((tickAnim - 13) / 7) * (-1.2555-(0)));
            zz = 0 + (((tickAnim - 13) / 7) * (-3.78301-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 27) {
            xx = 89.94344 + (((tickAnim - 20) / 7) * (25.63687-(89.94344)));
            yy = -1.2555 + (((tickAnim - 20) / 7) * (2.511-(-1.2555)));
            zz = -3.78301 + (((tickAnim - 20) / 7) * (7.56602-(-3.78301)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftArm3, leftArm3.rotateAngleX + (float) Math.toRadians(xx), leftArm3.rotateAngleY + (float) Math.toRadians(yy), leftArm3.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 0) / 5) * (0-(0)));
            yy = 0.725 + (((tickAnim - 0) / 5) * (1.525-(0.725)));
            zz = -0.325 + (((tickAnim - 0) / 5) * (-0.2-(-0.325)));
        }
        else if (tickAnim >= 5 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 5) / 8) * (0-(0)));
            yy = 1.525 + (((tickAnim - 5) / 8) * (0-(1.525)));
            zz = -0.2 + (((tickAnim - 5) / 8) * (0-(-0.2)));
        }
        else if (tickAnim >= 13 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 13) / 7) * (0-(0)));
            yy = 0 + (((tickAnim - 13) / 7) * (-0.815-(0)));
            zz = 0 + (((tickAnim - 13) / 7) * (-0.16-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 27) {
            xx = 0 + (((tickAnim - 20) / 7) * (0-(0)));
            yy = -0.815 + (((tickAnim - 20) / 7) * (0.725-(-0.815)));
            zz = -0.16 + (((tickAnim - 20) / 7) * (-0.325-(-0.16)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.leftArm3.rotationPointX = this.leftArm3.rotationPointX + (float)(xx);
        this.leftArm3.rotationPointY = this.leftArm3.rotationPointY - (float)(yy);
        this.leftArm3.rotationPointZ = this.leftArm3.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 13) {
            xx = -16.5 + (((tickAnim - 0) / 13) * (12.90379-(-16.5)));
            yy = 0 + (((tickAnim - 0) / 13) * (2.71119-(0)));
            zz = 0 + (((tickAnim - 0) / 13) * (-1.99041-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 27) {
            xx = 12.90379 + (((tickAnim - 13) / 14) * (-16.5-(12.90379)));
            yy = 2.71119 + (((tickAnim - 13) / 14) * (0-(2.71119)));
            zz = -1.99041 + (((tickAnim - 13) / 14) * (0-(-1.99041)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightLeg, rightLeg.rotateAngleX + (float) Math.toRadians(xx), rightLeg.rotateAngleY + (float) Math.toRadians(yy), rightLeg.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 13) {
            xx = -1 + (((tickAnim - 0) / 13) * (8-(-1)));
            yy = 0 + (((tickAnim - 0) / 13) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 13) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 19) {
            xx = 8 + (((tickAnim - 13) / 6) * (52.565+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50-30))*-100-(8)));
            yy = 0 + (((tickAnim - 13) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 13) / 6) * (0-(0)));
        }
        else if (tickAnim >= 19 && tickAnim < 27) {
            xx = 52.565+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50-30))*-100 + (((tickAnim - 19) / 8) * (-1-(52.565+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50-30))*-100)));
            yy = 0 + (((tickAnim - 19) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 19) / 8) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightLeg2, rightLeg2.rotateAngleX + (float) Math.toRadians(xx), rightLeg2.rotateAngleY + (float) Math.toRadians(yy), rightLeg2.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 3) * (0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1220/0.5))*-0.1-(0)));
            zz = 0 + (((tickAnim - 0) / 3) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 3) / 2) * (0-(0)));
            yy = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1220/0.5))*-0.1 + (((tickAnim - 3) / 2) * (0-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1220/0.5))*-0.1)));
            zz = 0 + (((tickAnim - 3) / 2) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.rightLeg2.rotationPointX = this.rightLeg2.rotationPointX + (float)(xx);
        this.rightLeg2.rotationPointY = this.rightLeg2.rotationPointY - (float)(yy);
        this.rightLeg2.rotationPointZ = this.rightLeg2.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 13) {
            xx = 13 + (((tickAnim - 0) / 13) * (21-(13)));
            yy = 0 + (((tickAnim - 0) / 13) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 13) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 20) {
            xx = 21 + (((tickAnim - 13) / 7) * (-38.75-(21)));
            yy = 0 + (((tickAnim - 13) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 13) / 7) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 23) {
            xx = -38.75 + (((tickAnim - 20) / 3) * (-38.75-(-38.75)));
            yy = 0 + (((tickAnim - 20) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 3) * (0-(0)));
        }
        else if (tickAnim >= 23 && tickAnim < 27) {
            xx = -38.75 + (((tickAnim - 23) / 4) * (13-(-38.75)));
            yy = 0 + (((tickAnim - 23) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 23) / 4) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightLeg3, rightLeg3.rotateAngleX + (float) Math.toRadians(xx), rightLeg3.rotateAngleY + (float) Math.toRadians(yy), rightLeg3.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 7) {
            xx = 3.5 + (((tickAnim - 0) / 7) * (-19.75-(3.5)));
            yy = 0 + (((tickAnim - 0) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 7) * (0-(0)));
        }
        else if (tickAnim >= 7 && tickAnim < 13) {
            xx = -19.75 + (((tickAnim - 7) / 6) * (46.75-(-19.75)));
            yy = 0 + (((tickAnim - 7) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 7) / 6) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 20) {
            xx = 46.75 + (((tickAnim - 13) / 7) * (71.62-(46.75)));
            yy = 0 + (((tickAnim - 13) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 13) / 7) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 23) {
            xx = 71.62 + (((tickAnim - 20) / 3) * (71.62-(71.62)));
            yy = 0 + (((tickAnim - 20) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 3) * (0-(0)));
        }
        else if (tickAnim >= 23 && tickAnim < 27) {
            xx = 71.62 + (((tickAnim - 23) / 4) * (3.5-(71.62)));
            yy = 0 + (((tickAnim - 23) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 23) / 4) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightLeg4, rightLeg4.rotateAngleX + (float) Math.toRadians(xx), rightLeg4.rotateAngleY + (float) Math.toRadians(yy), rightLeg4.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 7) {
            xx = 0 + (((tickAnim - 0) / 7) * (0-(0)));
            yy = 0.275 + (((tickAnim - 0) / 7) * (1.4+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*-4-(0.275)));
            zz = 0 + (((tickAnim - 0) / 7) * (0-(0)));
        }
        else if (tickAnim >= 7 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 7) / 3) * (0-(0)));
            yy = 1.4+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*-4 + (((tickAnim - 7) / 3) * (0.84-(1.4+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*-4)));
            zz = 0 + (((tickAnim - 7) / 3) * (-0.48-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 10) / 3) * (0-(0)));
            yy = 0.84 + (((tickAnim - 10) / 3) * (-0.475-(0.84)));
            zz = -0.48 + (((tickAnim - 10) / 3) * (-0.95-(-0.48)));
        }
        else if (tickAnim >= 13 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 13) / 7) * (0-(0)));
            yy = -0.475 + (((tickAnim - 13) / 7) * (-0.1-(-0.475)));
            zz = -0.95 + (((tickAnim - 13) / 7) * (-1.045-(-0.95)));
        }
        else if (tickAnim >= 20 && tickAnim < 23) {
            xx = 0 + (((tickAnim - 20) / 3) * (0-(0)));
            yy = -0.1 + (((tickAnim - 20) / 3) * (-0.1-(-0.1)));
            zz = -1.045 + (((tickAnim - 20) / 3) * (-1.045-(-1.045)));
        }
        else if (tickAnim >= 23 && tickAnim < 27) {
            xx = 0 + (((tickAnim - 23) / 4) * (0-(0)));
            yy = -0.1 + (((tickAnim - 23) / 4) * (0.275-(-0.1)));
            zz = -1.045 + (((tickAnim - 23) / 4) * (0-(-1.045)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.rightLeg4.rotationPointX = this.rightLeg4.rotationPointX + (float)(xx);
        this.rightLeg4.rotationPointY = this.rightLeg4.rotationPointY - (float)(yy);
        this.rightLeg4.rotationPointZ = this.rightLeg4.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 13) {
            xx = 12.90379 + (((tickAnim - 0) / 13) * (-16.5-(12.90379)));
            yy = -2.71119 + (((tickAnim - 0) / 13) * (0-(-2.71119)));
            zz = 1.99041 + (((tickAnim - 0) / 13) * (0-(1.99041)));
        }
        else if (tickAnim >= 13 && tickAnim < 27) {
            xx = -16.5 + (((tickAnim - 13) / 14) * (12.90379-(-16.5)));
            yy = 0 + (((tickAnim - 13) / 14) * (-2.71119-(0)));
            zz = 0 + (((tickAnim - 13) / 14) * (1.99041-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftLeg, leftLeg.rotateAngleX + (float) Math.toRadians(xx), leftLeg.rotateAngleY + (float) Math.toRadians(yy), leftLeg.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 6) {
            xx = 8 + (((tickAnim - 0) / 6) * (2.015+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50-30))*-100-(8)));
            yy = 0 + (((tickAnim - 0) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 6) * (0-(0)));
        }
        else if (tickAnim >= 6 && tickAnim < 13) {
            xx = 2.015+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50-30))*-100 + (((tickAnim - 6) / 7) * (-1-(2.015+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50-30))*-100)));
            yy = 0 + (((tickAnim - 6) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 6) / 7) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 27) {
            xx = -1 + (((tickAnim - 13) / 14) * (8-(-1)));
            yy = 0 + (((tickAnim - 13) / 14) * (0-(0)));
            zz = 0 + (((tickAnim - 13) / 14) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftLeg2, leftLeg2.rotateAngleX + (float) Math.toRadians(xx), leftLeg2.rotateAngleY + (float) Math.toRadians(yy), leftLeg2.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 13 && tickAnim < 16) {
            xx = 0 + (((tickAnim - 13) / 3) * (0-(0)));
            yy = 0 + (((tickAnim - 13) / 3) * (0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1220/0.5))*-0.1-(0)));
            zz = 0 + (((tickAnim - 13) / 3) * (0-(0)));
        }
        else if (tickAnim >= 16 && tickAnim < 18) {
            xx = 0 + (((tickAnim - 16) / 2) * (0-(0)));
            yy = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1220/0.5))*-0.1 + (((tickAnim - 16) / 2) * (0-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1220/0.5))*-0.1)));
            zz = 0 + (((tickAnim - 16) / 2) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.leftLeg2.rotationPointX = this.leftLeg2.rotationPointX + (float)(xx);
        this.leftLeg2.rotationPointY = this.leftLeg2.rotationPointY - (float)(yy);
        this.leftLeg2.rotationPointZ = this.leftLeg2.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 7) {
            xx = 21 + (((tickAnim - 0) / 7) * (-38.25-(21)));
            yy = 0 + (((tickAnim - 0) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 7) * (0-(0)));
        }
        else if (tickAnim >= 7 && tickAnim < 10) {
            xx = -38.25 + (((tickAnim - 7) / 3) * (-38.25-(-38.25)));
            yy = 0 + (((tickAnim - 7) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 7) / 3) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 13) {
            xx = -38.25 + (((tickAnim - 10) / 3) * (13-(-38.25)));
            yy = 0 + (((tickAnim - 10) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 3) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 27) {
            xx = 13 + (((tickAnim - 13) / 14) * (21-(13)));
            yy = 0 + (((tickAnim - 13) / 14) * (0-(0)));
            zz = 0 + (((tickAnim - 13) / 14) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftLeg3, leftLeg3.rotateAngleX + (float) Math.toRadians(xx), leftLeg3.rotateAngleY + (float) Math.toRadians(yy), leftLeg3.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 7) {
            xx = 46.75 + (((tickAnim - 0) / 7) * (68.38-(46.75)));
            yy = 0 + (((tickAnim - 0) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 7) * (0-(0)));
        }
        else if (tickAnim >= 7 && tickAnim < 10) {
            xx = 68.38 + (((tickAnim - 7) / 3) * (68.38-(68.38)));
            yy = 0 + (((tickAnim - 7) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 7) / 3) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 13) {
            xx = 68.38 + (((tickAnim - 10) / 3) * (3.5-(68.38)));
            yy = 0 + (((tickAnim - 10) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 3) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 20) {
            xx = 3.5 + (((tickAnim - 13) / 7) * (-19.75-(3.5)));
            yy = 0 + (((tickAnim - 13) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 13) / 7) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 27) {
            xx = -19.75 + (((tickAnim - 20) / 7) * (46.75-(-19.75)));
            yy = 0 + (((tickAnim - 20) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 7) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftLeg4, leftLeg4.rotateAngleX + (float) Math.toRadians(xx), leftLeg4.rotateAngleY + (float) Math.toRadians(yy), leftLeg4.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 0) / 13) * (0-(0)));
            yy = -0.475 + (((tickAnim - 0) / 13) * (0.275-(-0.475)));
            zz = -0.95 + (((tickAnim - 0) / 13) * (0-(-0.95)));
        }
        else if (tickAnim >= 13 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 13) / 7) * (0-(0)));
            yy = 0.275 + (((tickAnim - 13) / 7) * (3.05+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*-4-(0.275)));
            zz = 0 + (((tickAnim - 13) / 7) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 23) {
            xx = 0 + (((tickAnim - 20) / 3) * (0-(0)));
            yy = 3.05+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*-4 + (((tickAnim - 20) / 3) * (0.84-(3.05+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*-4)));
            zz = 0 + (((tickAnim - 20) / 3) * (-0.48-(0)));
        }
        else if (tickAnim >= 23 && tickAnim < 27) {
            xx = 0 + (((tickAnim - 23) / 4) * (0-(0)));
            yy = 0.84 + (((tickAnim - 23) / 4) * (-0.475-(0.84)));
            zz = -0.48 + (((tickAnim - 23) / 4) * (-0.95-(-0.48)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.leftLeg4.rotationPointX = this.leftLeg4.rotationPointX + (float)(xx);
        this.leftLeg4.rotationPointY = this.leftLeg4.rotationPointY - (float)(yy);
        this.leftLeg4.rotationPointZ = this.leftLeg4.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 3) {
            xx = -88.25 + (((tickAnim - 0) / 3) * (0-(-88.25)));
            yy = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 3) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 7) {
            xx = 0 + (((tickAnim - 3) / 4) * (0-(0)));
            yy = 0 + (((tickAnim - 3) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 3) / 4) * (0-(0)));
        }
        else if (tickAnim >= 7 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 7) / 6) * (0-(0)));
            yy = 0 + (((tickAnim - 7) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 7) / 6) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 13) / 7) * (0-(0)));
            yy = 0 + (((tickAnim - 13) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 13) / 7) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 27) {
            xx = 0 + (((tickAnim - 20) / 7) * (-88.25-(0)));
            yy = 0 + (((tickAnim - 20) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 7) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftLeg5, leftLeg5.rotateAngleX + (float) Math.toRadians(xx), leftLeg5.rotateAngleY + (float) Math.toRadians(yy), leftLeg5.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            yy = -0.825 + (((tickAnim - 0) / 3) * (0-(-0.825)));
            zz = -0.35 + (((tickAnim - 0) / 3) * (0-(-0.35)));
        }
        else if (tickAnim >= 3 && tickAnim < 7) {
            xx = 0 + (((tickAnim - 3) / 4) * (0-(0)));
            yy = 0 + (((tickAnim - 3) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 3) / 4) * (0-(0)));
        }
        else if (tickAnim >= 7 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 7) / 6) * (0-(0)));
            yy = 0 + (((tickAnim - 7) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 7) / 6) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 13) / 7) * (0-(0)));
            yy = 0 + (((tickAnim - 13) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 13) / 7) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 27) {
            xx = 0 + (((tickAnim - 20) / 7) * (0-(0)));
            yy = 0 + (((tickAnim - 20) / 7) * (-0.825-(0)));
            zz = 0 + (((tickAnim - 20) / 7) * (-0.35-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.leftLeg5.rotationPointX = this.leftLeg5.rotationPointX + (float)(xx);
        this.leftLeg5.rotationPointY = this.leftLeg5.rotationPointY - (float)(yy);
        this.leftLeg5.rotationPointZ = this.leftLeg5.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 7) {
            xx = 0 + (((tickAnim - 0) / 7) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 7) * (0-(0)));
        }
        else if (tickAnim >= 7 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 7) / 6) * (-88.25-(0)));
            yy = 0 + (((tickAnim - 7) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 7) / 6) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 16) {
            xx = -88.25 + (((tickAnim - 13) / 3) * (0-(-88.25)));
            yy = 0 + (((tickAnim - 13) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 13) / 3) * (0-(0)));
        }
        else if (tickAnim >= 16 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 16) / 4) * (0-(0)));
            yy = 0 + (((tickAnim - 16) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 16) / 4) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 27) {
            xx = 0 + (((tickAnim - 20) / 7) * (0-(0)));
            yy = 0 + (((tickAnim - 20) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 7) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightLeg5, rightLeg5.rotateAngleX + (float) Math.toRadians(xx), rightLeg5.rotateAngleY + (float) Math.toRadians(yy), rightLeg5.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 7) {
            xx = 0 + (((tickAnim - 0) / 7) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 7) * (0-(0)));
        }
        else if (tickAnim >= 7 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 7) / 6) * (0-(0)));
            yy = 0 + (((tickAnim - 7) / 6) * (-0.825-(0)));
            zz = 0 + (((tickAnim - 7) / 6) * (-0.35-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 16) {
            xx = 0 + (((tickAnim - 13) / 3) * (0-(0)));
            yy = -0.825 + (((tickAnim - 13) / 3) * (0-(-0.825)));
            zz = -0.35 + (((tickAnim - 13) / 3) * (0-(-0.35)));
        }
        else if (tickAnim >= 16 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 16) / 4) * (0-(0)));
            yy = 0 + (((tickAnim - 16) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 16) / 4) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 27) {
            xx = 0 + (((tickAnim - 20) / 7) * (0-(0)));
            yy = 0 + (((tickAnim - 20) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 7) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.rightLeg5.rotationPointX = this.rightLeg5.rotationPointX + (float)(xx);
        this.rightLeg5.rotationPointY = this.rightLeg5.rotationPointY - (float)(yy);
        this.rightLeg5.rotationPointZ = this.rightLeg5.rotationPointZ + (float)(zz);



        this.setRotateAngle(hips, hips.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*270/0.5))*2.5), hips.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*270-50))*1.5), hips.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*270-50))*1));
        this.hips.rotationPointX = this.hips.rotationPointX + (float)(0);
        this.hips.rotationPointY = this.hips.rotationPointY - (float)(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*270/0.5-50))*0.5);
        this.hips.rotationPointZ = this.hips.rotationPointZ + (float)(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*270/0.5-150))*0.25);


        this.setRotateAngle(tail1, tail1.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*270/0.5+50))*-2), tail1.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*270+50))*-0.5), tail1.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*270-50))*-1));


        this.setRotateAngle(tail2, tail2.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*270/0.5+150))*4), tail2.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*270+100))*1), tail2.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*270-200))*-2));


        this.setRotateAngle(tail3, tail3.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*270/0.5+200))*5), tail3.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*270+150))*2), tail3.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*270-250))*-3));


        this.setRotateAngle(tail4, tail4.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*270/0.5+250))*-7), tail4.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*270+200))*3), tail4.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*270-300))*4));


        this.setRotateAngle(tail5, tail5.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*270/0.5+300))*-5), tail5.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*270+250))*5), tail5.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*270-350))*6));


        this.setRotateAngle(body, body.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*270/0.5-120))*2.5), body.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*270-100))*-1.5), body.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*270-150))*1));


        this.setRotateAngle(chest, chest.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*270/0.5-200))*2.5), chest.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*270-180))*1.5), chest.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*270-190))*1));


        this.setRotateAngle(neck1, neck1.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*270/0.5-200))*-1.5), neck1.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*270-180))*-1.5), neck1.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*270-190))*-1));


        this.setRotateAngle(neck2, neck2.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*270/0.5-250))*-1.5), neck2.rotateAngleY + (float) Math.toRadians(0), neck2.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(neck3, neck3.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*270/0.5-300))*1.5), neck3.rotateAngleY + (float) Math.toRadians(0), neck3.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(neck4, neck4.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*270/0.5-450))*-2), neck4.rotateAngleY + (float) Math.toRadians(0), neck4.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(head, head.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*270/0.5-550))*2), head.rotateAngleY + (float) Math.toRadians(0), head.rotateAngleZ + (float) Math.toRadians(0));

    }

    public void animate(IAnimatedEntity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        EntityPrehistoricFloraOlorotitan e = (EntityPrehistoricFloraOlorotitan) entity;
        animator.update(entity);


    }
}
