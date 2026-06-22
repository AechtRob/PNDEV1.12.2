package net.lepidodendron.entity.model.entity;

import net.ilexiconn.llibrary.client.model.ModelAnimator;
import net.ilexiconn.llibrary.client.model.tools.AdvancedModelRenderer;
import net.ilexiconn.llibrary.server.animation.IAnimatedEntity;
import net.lepidodendron.entity.EntityPrehistoricFloraSinotyrannus;
import net.lepidodendron.entity.model.ModelBasePalaeopedia;
import net.minecraft.client.model.ModelBox;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;

public class ModelSinotyrannus extends ModelBasePalaeopedia {

    private final AdvancedModelRenderer root;
    private final AdvancedModelRenderer hips;
    private final AdvancedModelRenderer body;
    private final AdvancedModelRenderer body2;
    private final AdvancedModelRenderer neck;
    private final AdvancedModelRenderer neck2;
    private final AdvancedModelRenderer neck3;
    private final AdvancedModelRenderer neck4;
    private final AdvancedModelRenderer head;
    private final AdvancedModelRenderer jaw;
    private final AdvancedModelRenderer jaw1;
    private final AdvancedModelRenderer jaw2;
    private final AdvancedModelRenderer jaw3;
    private final AdvancedModelRenderer jawslope3;
    private final AdvancedModelRenderer leftlowerteeth2;
    private final AdvancedModelRenderer rightlowerteeth2;
    private final AdvancedModelRenderer jawslope2;
    private final AdvancedModelRenderer leftlowerteeth1;
    private final AdvancedModelRenderer rightlowerteeth1;
    private final AdvancedModelRenderer jawslope1;
    private final AdvancedModelRenderer featherbeard1;
    private final AdvancedModelRenderer masseter;
    private final AdvancedModelRenderer throat1;
    private final AdvancedModelRenderer throat2;
    private final AdvancedModelRenderer throat3;
    private final AdvancedModelRenderer featherbeard2;
    private final AdvancedModelRenderer upperjaw1;
    private final AdvancedModelRenderer upperjaw2;
    private final AdvancedModelRenderer upperjaw3;
    private final AdvancedModelRenderer leftupperteeth2;
    private final AdvancedModelRenderer rightupperteeth2;
    private final AdvancedModelRenderer nosebridge;
    private final AdvancedModelRenderer nasalcrest1;
    private final AdvancedModelRenderer nasalcrest2;
    private final AdvancedModelRenderer nasalcrest3;
    private final AdvancedModelRenderer leftupperteeth1;
    private final AdvancedModelRenderer rightupperteeth1;
    private final AdvancedModelRenderer headslope;
    private final AdvancedModelRenderer leftcrest;
    private final AdvancedModelRenderer leftcrestend;
    private final AdvancedModelRenderer rightcrest;
    private final AdvancedModelRenderer rightcrestend;
    private final AdvancedModelRenderer lefteye;
    private final AdvancedModelRenderer righteye;
    private final AdvancedModelRenderer leftbrowmovingpart;
    private final AdvancedModelRenderer leftbrowpiece1;
    private final AdvancedModelRenderer leftbrowpiece2;
    private final AdvancedModelRenderer leftbrowpiece3;
    private final AdvancedModelRenderer rightbrowmovingpart;
    private final AdvancedModelRenderer rightbrowpiece1;
    private final AdvancedModelRenderer rightbrowpiece2;
    private final AdvancedModelRenderer rightbrowpiece3;
    private final AdvancedModelRenderer neckfeathers2;
    private final AdvancedModelRenderer neckfeathers3;
    private final AdvancedModelRenderer neckfeathers4;
    private final AdvancedModelRenderer neckfeathers1;
    private final AdvancedModelRenderer neck2Support;
    private final AdvancedModelRenderer neckSupport;
    private final AdvancedModelRenderer neckfeathers;
    private final AdvancedModelRenderer bellySlope2;
    private final AdvancedModelRenderer bellyfeathers1;
    private final AdvancedModelRenderer leftarm;
    private final AdvancedModelRenderer leftarm2;
    private final AdvancedModelRenderer leftHand;
    private final AdvancedModelRenderer leftarmfeathers3;
    private final AdvancedModelRenderer leftarmfeathers2;
    private final AdvancedModelRenderer leftarmfeathers1;
    private final AdvancedModelRenderer rightarm;
    private final AdvancedModelRenderer rightarm2;
    private final AdvancedModelRenderer rightHand;
    private final AdvancedModelRenderer rightarmfeathers3;
    private final AdvancedModelRenderer rightarmfeathers2;
    private final AdvancedModelRenderer rightarmfeathers1;
    private final AdvancedModelRenderer body2feathers1;
    private final AdvancedModelRenderer body2feathers2;
    private final AdvancedModelRenderer bellySlope;
    private final AdvancedModelRenderer bellyfeathers2;
    private final AdvancedModelRenderer bodyfeathers1;
    private final AdvancedModelRenderer bodyfeathers2;
    private final AdvancedModelRenderer tail;
    private final AdvancedModelRenderer tail2;
    private final AdvancedModelRenderer tail3;
    private final AdvancedModelRenderer tail4;
    private final AdvancedModelRenderer tail5;
    private final AdvancedModelRenderer tail6;
    private final AdvancedModelRenderer tailfeathers7;
    private final AdvancedModelRenderer tailfeathers13;
    private final AdvancedModelRenderer tailfeathers6;
    private final AdvancedModelRenderer tailfeathers12;
    private final AdvancedModelRenderer tailfeathers4;
    private final AdvancedModelRenderer tailfeathers10;
    private final AdvancedModelRenderer tailfeathers11;
    private final AdvancedModelRenderer tailfeathers3;
    private final AdvancedModelRenderer tailfeathers2;
    private final AdvancedModelRenderer tailfeathers1;
    private final AdvancedModelRenderer tailfeathers8L;
    private final AdvancedModelRenderer tailfeathers9R;
    private final AdvancedModelRenderer rightLeg;
    private final AdvancedModelRenderer rightLeg2;
    private final AdvancedModelRenderer rightLeg3;
    private final AdvancedModelRenderer rightLeg4;
    private final AdvancedModelRenderer rightLeg5;
    private final AdvancedModelRenderer rightlegfeathers2;
    private final AdvancedModelRenderer rightlegfeathers1;
    private final AdvancedModelRenderer leftLeg;
    private final AdvancedModelRenderer leftLeg2;
    private final AdvancedModelRenderer leftLeg3;
    private final AdvancedModelRenderer leftLeg4;
    private final AdvancedModelRenderer leftLeg5;
    private final AdvancedModelRenderer leftlegfeathers2;
    private final AdvancedModelRenderer leftlegfeathers1;
    private final AdvancedModelRenderer hipfeathers1L;
    private final AdvancedModelRenderer hipfeathers2R;

    private ModelAnimator animator;

    public ModelSinotyrannus() {
        this.textureWidth = 180;
        this.textureHeight = 180;

        this.root = new AdvancedModelRenderer(this);
        this.root.setRotationPoint(0.0F, 0.0F, 0.0F);


        this.hips = new AdvancedModelRenderer(this);
        this.hips.setRotationPoint(0.0F, -10.02F, -1.0F);
        this.root.addChild(hips);
        this.setRotateAngle(hips, -0.0848F, 0.0F, 0.0F);
        this.hips.cubeList.add(new ModelBox(hips, 0, 143, -5.0F, -6.5F, -6.0F, 10, 20, 17, 0.0F, true));

        this.body = new AdvancedModelRenderer(this);
        this.body.setRotationPoint(0.0F, -1.9F, -5.0F);
        this.hips.addChild(body);
        this.setRotateAngle(body, 0.1274F, 0.0F, 0.0F);
        this.body.cubeList.add(new ModelBox(body, 0, 106, -6.0F, -4.5F, -10.5F, 12, 18, 11, 0.0F, true));

        this.body2 = new AdvancedModelRenderer(this);
        this.body2.setRotationPoint(0.0F, -0.9F, -9.3F);
        this.body.addChild(body2);
        this.setRotateAngle(body2, 0.2546F, 0.0F, 0.0F);
        this.body2.cubeList.add(new ModelBox(body2, 55, 153, -5.5F, -3.5F, -13.5F, 11, 13, 14, 0.0F, true));

        this.neck = new AdvancedModelRenderer(this);
        this.neck.setRotationPoint(0.0F, 0.0F, -10.7F);
        this.body2.addChild(neck);
        this.setRotateAngle(neck, -0.5732F, 0.0F, 0.0F);
        this.neck.cubeList.add(new ModelBox(neck, 0, 89, -3.5F, -3.5F, -5.0F, 7, 11, 5, 0.0F, true));

        this.neck2 = new AdvancedModelRenderer(this);
        this.neck2.setRotationPoint(0.0F, -0.5F, -3.7F);
        this.neck.addChild(neck2);
        this.setRotateAngle(neck2, -0.2972F, 0.0F, 0.0F);
        this.neck2.cubeList.add(new ModelBox(neck2, 25, 90, -2.5F, -3.0F, -5.0F, 5, 10, 5, 0.0F, true));

        this.neck3 = new AdvancedModelRenderer(this);
        this.neck3.setRotationPoint(0.0F, 0.0F, -3.7F);
        this.neck2.addChild(neck3);
        this.setRotateAngle(neck3, 0.2546F, 0.0F, 0.0F);
        this.neck3.cubeList.add(new ModelBox(neck3, 0, 73, -2.0F, -3.0F, -5.0F, 4, 10, 5, 0.0F, true));

        this.neck4 = new AdvancedModelRenderer(this);
        this.neck4.setRotationPoint(-0.01F, -0.7F, -3.4F);
        this.neck3.addChild(neck4);
        this.setRotateAngle(neck4, 0.6156F, 0.0F, 0.0F);
        this.neck4.cubeList.add(new ModelBox(neck4, 19, 74, -2.0F, -2.5F, -5.0F, 4, 9, 5, 0.0F, true));

        this.head = new AdvancedModelRenderer(this);
        this.head.setRotationPoint(0.0F, 0.0F, -3.8F);
        this.neck4.addChild(head);
        this.setRotateAngle(head, 0.0424F, 0.0F, 0.0F);
        this.head.cubeList.add(new ModelBox(head, 69, 91, -2.48F, -2.0F, -5.0F, 5, 5, 5, 0.0F, true));

        this.jaw = new AdvancedModelRenderer(this);
        this.jaw.setRotationPoint(0.0F, 3.0F, 0.0F);
        this.head.addChild(jaw);
        this.jaw.cubeList.add(new ModelBox(jaw, 90, 92, -2.5F, 0.0F, -5.0F, 5, 3, 5, 0.0F, true));

        this.jaw1 = new AdvancedModelRenderer(this);
        this.jaw1.setRotationPoint(0.0F, 0.0F, -5.0F);
        this.jaw.addChild(jaw1);
        this.setRotateAngle(jaw1, -0.2972F, 0.0F, 0.0F);
        this.jaw1.cubeList.add(new ModelBox(jaw1, 116, 71, -2.0F, 0.0F, -3.0F, 4, 2, 4, 0.0F, true));

        this.jaw2 = new AdvancedModelRenderer(this);
        this.jaw2.setRotationPoint(0.0F, 0.2F, -2.8F);
        this.jaw1.addChild(jaw2);
        this.setRotateAngle(jaw2, 0.4245F, 0.0F, 0.0F);
        this.jaw2.cubeList.add(new ModelBox(jaw2, 137, 76, -1.5F, 0.0F, -2.9F, 3, 1, 3, 0.0F, true));

        this.jaw3 = new AdvancedModelRenderer(this);
        this.jaw3.setRotationPoint(0.0F, 2.0F, -2.9F);
        this.jaw2.addChild(jaw3);
        this.setRotateAngle(jaw3, -0.1698F, 0.0F, 0.0F);
        this.jaw3.cubeList.add(new ModelBox(jaw3, 108, 64, -1.0F, -2.0F, -4.2F, 2, 1, 5, 0.0F, true));

        this.jawslope3 = new AdvancedModelRenderer(this);
        this.jawslope3.setRotationPoint(-0.01F, -0.65F, 0.0F);
        this.jaw3.addChild(jawslope3);
        this.setRotateAngle(jawslope3, -0.0883F, 0.0F, 0.0F);
        this.jawslope3.cubeList.add(new ModelBox(jawslope3, 127, 60, -1.0F, -1.0F, -4.0F, 2, 1, 4, 0.0F, true));

        this.leftlowerteeth2 = new AdvancedModelRenderer(this);
        this.leftlowerteeth2.setRotationPoint(-0.5F, -1.6F, -2.3F);
        this.jaw3.addChild(leftlowerteeth2);
        this.setRotateAngle(leftlowerteeth2, 0.0424F, -0.1169F, 0.0F);
        this.leftlowerteeth2.cubeList.add(new ModelBox(leftlowerteeth2, 0, 10, 0.0F, -1.0F, -1.5F, 0, 1, 3, 0.0F, true));

        this.rightlowerteeth2 = new AdvancedModelRenderer(this);
        this.rightlowerteeth2.setRotationPoint(0.5F, -1.6F, -2.3F);
        this.jaw3.addChild(rightlowerteeth2);
        this.setRotateAngle(rightlowerteeth2, 0.0424F, 0.1169F, 0.0F);
        this.rightlowerteeth2.cubeList.add(new ModelBox(rightlowerteeth2, 7, 10, 0.0F, -1.0F, -1.5F, 0, 1, 3, 0.0F, true));

        this.jawslope2 = new AdvancedModelRenderer(this);
        this.jawslope2.setRotationPoint(0.01F, 0.32F, -2.8F);
        this.jaw2.addChild(jawslope2);
        this.setRotateAngle(jawslope2, -0.2972F, 0.0F, 0.0F);
        this.jawslope2.cubeList.add(new ModelBox(jawslope2, 126, 101, -1.5F, 0.0F, 0.0F, 3, 1, 3, 0.0F, true));

        this.leftlowerteeth1 = new AdvancedModelRenderer(this);
        this.leftlowerteeth1.setRotationPoint(-0.95F, 0.6F, -1.7F);
        this.jaw2.addChild(leftlowerteeth1);
        this.setRotateAngle(leftlowerteeth1, -0.1061F, -0.1485F, 0.0F);
        this.leftlowerteeth1.cubeList.add(new ModelBox(leftlowerteeth1, 0, 8, 0.0F, -1.0F, -1.5F, 0, 1, 3, 0.0F, true));

        this.rightlowerteeth1 = new AdvancedModelRenderer(this);
        this.rightlowerteeth1.setRotationPoint(0.95F, 0.6F, -1.7F);
        this.jaw2.addChild(rightlowerteeth1);
        this.setRotateAngle(rightlowerteeth1, -0.1061F, 0.1485F, 0.0F);
        this.rightlowerteeth1.cubeList.add(new ModelBox(rightlowerteeth1, 7, 8, 0.0F, -1.0F, -1.5F, 0, 1, 3, 0.0F, true));

        this.jawslope1 = new AdvancedModelRenderer(this);
        this.jawslope1.setRotationPoint(-0.01F, 2.5F, -2.99F);
        this.jaw1.addChild(jawslope1);
        this.jawslope1.cubeList.add(new ModelBox(jawslope1, 101, 58, -2.0F, -1.0F, 0.0F, 4, 1, 4, 0.0F, true));

        this.featherbeard1 = new AdvancedModelRenderer(this);
        this.featherbeard1.setRotationPoint(0.0F, 0.0F, 1.4F);
        this.jawslope1.addChild(featherbeard1);
        this.setRotateAngle(featherbeard1, -0.2335F, 0.0F, 0.0F);
        this.featherbeard1.cubeList.add(new ModelBox(featherbeard1, 103, 45, -1.0F, -2.0F, 0.0F, 2, 2, 3, 0.0F, true));

        this.masseter = new AdvancedModelRenderer(this);
        this.masseter.setRotationPoint(-0.02F, 0.0F, -5.0F);
        this.jaw.addChild(masseter);
        this.setRotateAngle(masseter, -0.4033F, 0.0F, 0.0F);
        this.masseter.cubeList.add(new ModelBox(masseter, 111, 78, -2.0F, -4.0F, 0.0F, 4, 4, 4, 0.0F, true));

        this.throat1 = new AdvancedModelRenderer(this);
        this.throat1.setRotationPoint(0.0F, 3.0F, -4.5F);
        this.jaw.addChild(throat1);
        this.setRotateAngle(throat1, -0.4033F, 0.0F, 0.0F);
        this.throat1.cubeList.add(new ModelBox(throat1, 68, 74, -1.5F, -2.0F, 0.0F, 3, 2, 2, 0.0F, true));

        this.throat2 = new AdvancedModelRenderer(this);
        this.throat2.setRotationPoint(-0.01F, 0.0F, 2.0F);
        this.throat1.addChild(throat2);
        this.setRotateAngle(throat2, 0.4882F, 0.0F, 0.0F);
        this.throat2.cubeList.add(new ModelBox(throat2, 45, 64, -1.5F, -2.0F, 0.0F, 3, 2, 2, 0.0F, true));

        this.throat3 = new AdvancedModelRenderer(this);
        this.throat3.setRotationPoint(0.02F, 0.0F, 2.0F);
        this.throat2.addChild(throat3);
        this.setRotateAngle(throat3, 0.6156F, 0.0F, 0.0F);
        this.throat3.cubeList.add(new ModelBox(throat3, 56, 64, -1.5F, -2.0F, 0.0F, 3, 2, 2, 0.0F, true));

        this.featherbeard2 = new AdvancedModelRenderer(this);
        this.featherbeard2.setRotationPoint(-0.01F, 3.0F, -5.0F);
        this.jaw.addChild(featherbeard2);
        this.setRotateAngle(featherbeard2, 1.2312F, 0.0F, 0.0F);
        this.featherbeard2.cubeList.add(new ModelBox(featherbeard2, 114, 29, -2.5F, 0.0F, 0.0F, 5, 3, 3, 0.0F, true));

        this.upperjaw1 = new AdvancedModelRenderer(this);
        this.upperjaw1.setRotationPoint(0.0F, 3.0F, -5.0F);
        this.head.addChild(upperjaw1);
        this.setRotateAngle(upperjaw1, -0.2972F, 0.0F, 0.0F);
        this.upperjaw1.cubeList.add(new ModelBox(upperjaw1, 129, 68, -2.0F, -3.0F, -3.0F, 4, 3, 3, 0.0F, true));

        this.upperjaw2 = new AdvancedModelRenderer(this);
        this.upperjaw2.setRotationPoint(0.0F, -3.0F, -3.0F);
        this.upperjaw1.addChild(upperjaw2);
        this.setRotateAngle(upperjaw2, 0.4245F, 0.0F, 0.0F);
        this.upperjaw2.cubeList.add(new ModelBox(upperjaw2, 101, 71, -1.5F, 0.0F, -4.0F, 3, 3, 4, 0.0F, true));

        this.upperjaw3 = new AdvancedModelRenderer(this);
        this.upperjaw3.setRotationPoint(0.0F, 3.0F, -4.0F);
        this.upperjaw2.addChild(upperjaw3);
        this.setRotateAngle(upperjaw3, -0.1698F, 0.0F, 0.0F);
        this.upperjaw3.cubeList.add(new ModelBox(upperjaw3, 118, 62, -1.0F, -2.0F, -4.0F, 2, 2, 4, 0.0F, true));

        this.leftupperteeth2 = new AdvancedModelRenderer(this);
        this.leftupperteeth2.setRotationPoint(-0.6F, -0.6F, -2.1F);
        this.upperjaw3.addChild(leftupperteeth2);
        this.setRotateAngle(leftupperteeth2, -0.1061F, -0.1169F, 0.0F);
        this.leftupperteeth2.cubeList.add(new ModelBox(leftupperteeth2, 0, 6, 0.0F, 0.0F, -1.5F, 0, 1, 3, 0.0F, true));

        this.rightupperteeth2 = new AdvancedModelRenderer(this);
        this.rightupperteeth2.setRotationPoint(0.6F, -0.6F, -2.1F);
        this.upperjaw3.addChild(rightupperteeth2);
        this.setRotateAngle(rightupperteeth2, -0.1061F, 0.1169F, 0.0F);
        this.rightupperteeth2.cubeList.add(new ModelBox(rightupperteeth2, 7, 6, 0.0F, 0.0F, -1.5F, 0, 1, 3, 0.0F, true));

        this.nosebridge = new AdvancedModelRenderer(this);
        this.nosebridge.setRotationPoint(-0.01F, -0.11F, -3.49F);
        this.upperjaw2.addChild(nosebridge);
        this.setRotateAngle(nosebridge, -0.0213F, 0.0F, 0.0F);
        this.nosebridge.cubeList.add(new ModelBox(nosebridge, 88, 72, -1.0F, 0.0F, -4.0F, 2, 2, 4, 0.0F, true));

        this.nasalcrest1 = new AdvancedModelRenderer(this);
        this.nasalcrest1.setRotationPoint(0.0F, -0.1F, -3.7F);
        this.nosebridge.addChild(nasalcrest1);
        this.setRotateAngle(nasalcrest1, 0.4033F, 0.0F, 0.0F);
        this.nasalcrest1.cubeList.add(new ModelBox(nasalcrest1, 79, 73, -0.5F, 0.0F, 0.0F, 1, 2, 3, 0.0F, true));

        this.nasalcrest2 = new AdvancedModelRenderer(this);
        this.nasalcrest2.setRotationPoint(0.01F, 0.0F, 3.0F);
        this.nasalcrest1.addChild(nasalcrest2);
        this.setRotateAngle(nasalcrest2, -0.2759F, 0.0F, 0.0F);
        this.nasalcrest2.cubeList.add(new ModelBox(nasalcrest2, 128, 77, -0.5F, 0.0F, 0.0F, 1, 2, 6, 0.0F, true));

        this.nasalcrest3 = new AdvancedModelRenderer(this);
        this.nasalcrest3.setRotationPoint(-0.01F, 0.0F, 6.0F);
        this.nasalcrest2.addChild(nasalcrest3);
        this.setRotateAngle(nasalcrest3, -0.5308F, 0.0F, 0.0F);
        this.nasalcrest3.cubeList.add(new ModelBox(nasalcrest3, 107, 88, -0.5F, 0.0F, 0.0F, 1, 2, 4, 0.0F, true));

        this.leftupperteeth1 = new AdvancedModelRenderer(this);
        this.leftupperteeth1.setRotationPoint(-1.05F, 2.4F, -2.6F);
        this.upperjaw2.addChild(leftupperteeth1);
        this.setRotateAngle(leftupperteeth1, 0.1485F, -0.1485F, 0.0F);
        this.leftupperteeth1.cubeList.add(new ModelBox(leftupperteeth1, 0, 4, 0.0F, 0.0F, -1.5F, 0, 1, 3, 0.0F, true));

        this.rightupperteeth1 = new AdvancedModelRenderer(this);
        this.rightupperteeth1.setRotationPoint(1.05F, 2.4F, -2.6F);
        this.upperjaw2.addChild(rightupperteeth1);
        this.setRotateAngle(rightupperteeth1, 0.1485F, 0.1485F, 0.0F);
        this.rightupperteeth1.cubeList.add(new ModelBox(rightupperteeth1, 7, 4, 0.0F, 0.0F, -1.5F, 0, 1, 3, 0.0F, true));

        this.headslope = new AdvancedModelRenderer(this);
        this.headslope.setRotationPoint(0.01F, -2.0F, -5.0F);
        this.head.addChild(headslope);
        this.setRotateAngle(headslope, 0.2759F, 0.0F, 0.0F);
        this.headslope.cubeList.add(new ModelBox(headslope, 127, 86, -1.5F, 0.0F, -6.0F, 3, 2, 6, 0.0F, true));

        this.leftcrest = new AdvancedModelRenderer(this);
        this.leftcrest.setRotationPoint(-0.4F, 0.7F, -5.56F);
        this.head.addChild(leftcrest);
        this.setRotateAngle(leftcrest, -0.3183F, 0.0F, -0.3821F);
        this.leftcrest.cubeList.add(new ModelBox(leftcrest, 117, 87, -0.5F, -4.0F, 0.0F, 1, 4, 1, 0.0F, true));

        this.leftcrestend = new AdvancedModelRenderer(this);
        this.leftcrestend.setRotationPoint(-0.01F, -4.0F, 0.0F);
        this.leftcrest.addChild(leftcrestend);
        this.setRotateAngle(leftcrestend, 0.6369F, 0.0F, 0.0F);
        this.leftcrestend.cubeList.add(new ModelBox(leftcrestend, 140, 65, -0.5F, 0.0F, 0.0F, 1, 2, 1, 0.0F, true));

        this.rightcrest = new AdvancedModelRenderer(this);
        this.rightcrest.setRotationPoint(0.4F, 0.7F, -5.56F);
        this.head.addChild(rightcrest);
        this.setRotateAngle(rightcrest, -0.3183F, 0.0F, 0.3821F);
        this.rightcrest.cubeList.add(new ModelBox(rightcrest, 127, 86, -0.5F, -4.0F, 0.0F, 1, 4, 1, 0.0F, true));

        this.rightcrestend = new AdvancedModelRenderer(this);
        this.rightcrestend.setRotationPoint(0.01F, -4.0F, 0.0F);
        this.rightcrest.addChild(rightcrestend);
        this.setRotateAngle(rightcrestend, 0.6369F, 0.0F, 0.0F);
        this.rightcrestend.cubeList.add(new ModelBox(rightcrestend, 144, 67, -0.5F, 0.0F, 0.0F, 1, 2, 1, 0.0F, true));

        this.lefteye = new AdvancedModelRenderer(this);
        this.lefteye.setRotationPoint(-2.02F, -0.5F, -2.9F);
        this.head.addChild(lefteye);
        this.setRotateAngle(lefteye, 0.0424F, 0.0F, 0.0F);
        this.lefteye.cubeList.add(new ModelBox(lefteye, 23, 0, -0.5F, -0.5F, -1.0F, 1, 1, 2, 0.0F, true));

        this.righteye = new AdvancedModelRenderer(this);
        this.righteye.setRotationPoint(2.07F, -0.5F, -2.9F);
        this.head.addChild(righteye);
        this.setRotateAngle(righteye, 0.0424F, 0.0F, 0.0F);
        this.righteye.cubeList.add(new ModelBox(righteye, 16, 0, -0.5F, -0.5F, -1.0F, 1, 1, 2, 0.0F, true));

        this.leftbrowmovingpart = new AdvancedModelRenderer(this);
        this.leftbrowmovingpart.setRotationPoint(-2.51F, -1.3F, -4.1F);
        this.head.addChild(leftbrowmovingpart);
        this.setRotateAngle(leftbrowmovingpart, -0.2546F, 0.0F, -0.5308F);
        this.leftbrowmovingpart.cubeList.add(new ModelBox(leftbrowmovingpart, 158, 160, 0.0F, -1.0F, 0.0F, 0, 4, 5, 0.0F, true));

        this.leftbrowpiece1 = new AdvancedModelRenderer(this);
        this.leftbrowpiece1.setRotationPoint(0.0F, 0.5F, 2.9F);
        this.leftbrowmovingpart.addChild(leftbrowpiece1);
        this.setRotateAngle(leftbrowpiece1, -0.1485F, -0.3396F, 0.0F);
        this.leftbrowpiece1.cubeList.add(new ModelBox(leftbrowpiece1, 153, 167, 0.0F, -0.5F, -0.1F, 0, 1, 2, 0.0F, true));

        this.leftbrowpiece2 = new AdvancedModelRenderer(this);
        this.leftbrowpiece2.setRotationPoint(0.0F, 1.5F, 3.8F);
        this.leftbrowmovingpart.addChild(leftbrowpiece2);
        this.setRotateAngle(leftbrowpiece2, -0.4458F, -0.5519F, -0.0848F);
        this.leftbrowpiece2.cubeList.add(new ModelBox(leftbrowpiece2, 153, 165, 0.0F, -0.5F, -0.1F, 0, 1, 2, 0.0F, true));

        this.leftbrowpiece3 = new AdvancedModelRenderer(this);
        this.leftbrowpiece3.setRotationPoint(0.0F, 0.5F, 1.5F);
        this.leftbrowmovingpart.addChild(leftbrowpiece3);
        this.setRotateAngle(leftbrowpiece3, 0.5308F, 0.3821F, -0.0424F);
        this.leftbrowpiece3.cubeList.add(new ModelBox(leftbrowpiece3, 153, 163, 0.0F, -0.5F, 0.0F, 0, 1, 2, 0.0F, true));

        this.rightbrowmovingpart = new AdvancedModelRenderer(this);
        this.rightbrowmovingpart.setRotationPoint(2.51F, -1.3F, -4.1F);
        this.head.addChild(rightbrowmovingpart);
        this.setRotateAngle(rightbrowmovingpart, -0.2546F, 0.0F, 0.5308F);
        this.rightbrowmovingpart.cubeList.add(new ModelBox(rightbrowmovingpart, 158, 170, 0.0F, -1.0F, 0.0F, 0, 4, 5, 0.0F, true));

        this.rightbrowpiece1 = new AdvancedModelRenderer(this);
        this.rightbrowpiece1.setRotationPoint(0.0F, 0.5F, 2.9F);
        this.rightbrowmovingpart.addChild(rightbrowpiece1);
        this.setRotateAngle(rightbrowpiece1, -0.1485F, 0.3396F, 0.0F);
        this.rightbrowpiece1.cubeList.add(new ModelBox(rightbrowpiece1, 153, 177, 0.0F, -0.5F, -0.1F, 0, 1, 2, 0.0F, true));

        this.rightbrowpiece2 = new AdvancedModelRenderer(this);
        this.rightbrowpiece2.setRotationPoint(0.0F, 1.5F, 3.8F);
        this.rightbrowmovingpart.addChild(rightbrowpiece2);
        this.setRotateAngle(rightbrowpiece2, -0.4458F, 0.5519F, 0.0848F);
        this.rightbrowpiece2.cubeList.add(new ModelBox(rightbrowpiece2, 153, 175, 0.0F, -0.5F, -0.1F, 0, 1, 2, 0.0F, true));

        this.rightbrowpiece3 = new AdvancedModelRenderer(this);
        this.rightbrowpiece3.setRotationPoint(0.0F, 0.5F, 1.5F);
        this.rightbrowmovingpart.addChild(rightbrowpiece3);
        this.setRotateAngle(rightbrowpiece3, 0.5308F, -0.3821F, 0.0424F);
        this.rightbrowpiece3.cubeList.add(new ModelBox(rightbrowpiece3, 153, 173, 0.0F, -0.5F, 0.0F, 0, 1, 2, 0.0F, true));

        this.neckfeathers2 = new AdvancedModelRenderer(this);
        this.neckfeathers2.setRotationPoint(0.0F, -2.5F, -4.8F);
        this.neck4.addChild(neckfeathers2);
        this.setRotateAngle(neckfeathers2, 0.2335F, 0.0F, 0.0F);
        this.neckfeathers2.cubeList.add(new ModelBox(neckfeathers2, 104, 0, -1.5F, 0.0F, 0.0F, 3, 3, 3, 0.0F, true));

        this.neckfeathers3 = new AdvancedModelRenderer(this);
        this.neckfeathers3.setRotationPoint(-0.01F, -2.5F, -3.6F);
        this.neck4.addChild(neckfeathers3);
        this.setRotateAngle(neckfeathers3, 0.1911F, 0.0F, 0.0F);
        this.neckfeathers3.cubeList.add(new ModelBox(neckfeathers3, 91, 40, -2.0F, 0.0F, 0.0F, 4, 3, 3, 0.0F, true));

        this.neckfeathers4 = new AdvancedModelRenderer(this);
        this.neckfeathers4.setRotationPoint(0.01F, -2.5F, -2.5F);
        this.neck4.addChild(neckfeathers4);
        this.setRotateAngle(neckfeathers4, 0.1274F, 0.0F, 0.0F);
        this.neckfeathers4.cubeList.add(new ModelBox(neckfeathers4, 124, 37, -1.5F, 0.0F, 0.0F, 3, 3, 3, 0.0F, true));

        this.neckfeathers1 = new AdvancedModelRenderer(this);
        this.neckfeathers1.setRotationPoint(0.0F, -2.5F, -5.0F);
        this.neck4.addChild(neckfeathers1);
        this.setRotateAngle(neckfeathers1, 0.3183F, 0.0F, 0.0F);
        this.neckfeathers1.cubeList.add(new ModelBox(neckfeathers1, 105, 40, -1.0F, 0.0F, 0.0F, 2, 1, 2, 0.0F, true));

        this.neck2Support = new AdvancedModelRenderer(this);
        this.neck2Support.setRotationPoint(0.01F, 7.0F, 0.0F);
        this.neck2.addChild(neck2Support);
        this.setRotateAngle(neck2Support, 0.2759F, 0.0F, 0.0F);
        this.neck2Support.cubeList.add(new ModelBox(neck2Support, 68, 80, -2.5F, -7.0F, 0.0F, 5, 7, 3, 0.0F, true));

        this.neckSupport = new AdvancedModelRenderer(this);
        this.neckSupport.setRotationPoint(-0.01F, 7.5F, 0.0F);
        this.neck.addChild(neckSupport);
        this.setRotateAngle(neckSupport, 0.3183F, 0.0F, 0.0F);
        this.neckSupport.cubeList.add(new ModelBox(neckSupport, 46, 89, -3.5F, -8.0F, 0.0F, 7, 8, 4, 0.0F, true));

        this.neckfeathers = new AdvancedModelRenderer(this);
        this.neckfeathers.setRotationPoint(0.0F, 7.3F, -4.3F);
        this.neck.addChild(neckfeathers);
        this.setRotateAngle(neckfeathers, -0.0848F, 0.0F, 0.0F);
        this.neckfeathers.cubeList.add(new ModelBox(neckfeathers, 122, 0, -2.0F, -1.0F, 0.0F, 4, 3, 7, 0.0F, true));

        this.bellySlope2 = new AdvancedModelRenderer(this);
        this.bellySlope2.setRotationPoint(0.0F, 9.5F, -13.5F);
        this.body2.addChild(bellySlope2);
        this.setRotateAngle(bellySlope2, -0.3821F, 0.0F, 0.0F);
        this.bellySlope2.cubeList.add(new ModelBox(bellySlope2, 108, 135, -5.0F, -5.0F, 0.0F, 10, 5, 13, 0.0F, true));

        this.bellyfeathers1 = new AdvancedModelRenderer(this);
        this.bellyfeathers1.setRotationPoint(0.0F, -0.5F, 0.2F);
        this.bellySlope2.addChild(bellyfeathers1);
        this.setRotateAngle(bellyfeathers1, -0.1061F, 0.0F, 0.0F);
        this.bellyfeathers1.cubeList.add(new ModelBox(bellyfeathers1, 66, 37, -3.0F, -1.0F, 0.0F, 6, 2, 12, 0.0F, true));

        this.leftarm = new AdvancedModelRenderer(this);
        this.leftarm.setRotationPoint(-5.0F, 7.5F, -10.0F);
        this.body2.addChild(leftarm);
        this.setRotateAngle(leftarm, 0.8915F, -0.0424F, 0.2122F);
        this.leftarm.cubeList.add(new ModelBox(leftarm, 0, 60, -2.0F, -1.0F, -2.0F, 3, 8, 4, 0.0F, true));

        this.leftarm2 = new AdvancedModelRenderer(this);
        this.leftarm2.setRotationPoint(-1.1F, 6.5F, 1.0F);
        this.leftarm.addChild(leftarm2);
        this.setRotateAngle(leftarm2, -1.2524F, -0.0424F, -0.0848F);
        this.leftarm2.cubeList.add(new ModelBox(leftarm2, 0, 48, -0.5F, -0.5F, -2.5F, 2, 8, 3, 0.0F, true));

        this.leftHand = new AdvancedModelRenderer(this);
        this.leftHand.setRotationPoint(-0.45F, 7.0F, -1.01F);
        this.leftarm2.addChild(leftHand);
        this.setRotateAngle(leftHand, 0.0213F, 0.0F, -0.3609F);
        this.leftHand.cubeList.add(new ModelBox(leftHand, 38, 74, 0.0F, 0.0F, -2.5F, 2, 9, 5, 0.0F, true));

        this.leftarmfeathers3 = new AdvancedModelRenderer(this);
        this.leftarmfeathers3.setRotationPoint(0.0F, 0.0F, 0.8F);
        this.leftHand.addChild(leftarmfeathers3);
        this.setRotateAngle(leftarmfeathers3, -0.2972F, 1.1463F, -0.2759F);
        this.leftarmfeathers3.cubeList.add(new ModelBox(leftarmfeathers3, 116, 16, -1.0F, 0.0F, 0.0F, 1, 5, 0, 0.0F, true));

        this.leftarmfeathers2 = new AdvancedModelRenderer(this);
        this.leftarmfeathers2.setRotationPoint(-0.3F, -0.2F, 0.3F);
        this.leftarm2.addChild(leftarmfeathers2);
        this.setRotateAngle(leftarmfeathers2, -0.0848F, -0.2122F, 0.0213F);
        this.leftarmfeathers2.cubeList.add(new ModelBox(leftarmfeathers2, 97, 22, 0.0F, 0.0F, 0.0F, 0, 7, 2, 0.0F, true));

        this.leftarmfeathers1 = new AdvancedModelRenderer(this);
        this.leftarmfeathers1.setRotationPoint(-1.2F, 0.0F, 1.3F);
        this.leftarm.addChild(leftarmfeathers1);
        this.setRotateAngle(leftarmfeathers1, 0.0424F, 0.0F, 0.0424F);
        this.leftarmfeathers1.cubeList.add(new ModelBox(leftarmfeathers1, 87, 21, 0.0F, 0.0F, 0.0F, 0, 8, 2, 0.0F, true));

        this.rightarm = new AdvancedModelRenderer(this);
        this.rightarm.setRotationPoint(5.0F, 7.5F, -10.0F);
        this.body2.addChild(rightarm);
        this.setRotateAngle(rightarm, 0.8915F, 0.0424F, -0.2122F);
        this.rightarm.cubeList.add(new ModelBox(rightarm, 15, 59, -1.0F, -1.0F, -2.0F, 3, 8, 4, 0.0F, true));

        this.rightarm2 = new AdvancedModelRenderer(this);
        this.rightarm2.setRotationPoint(1.1F, 6.5F, 1.0F);
        this.rightarm.addChild(rightarm2);
        this.setRotateAngle(rightarm2, -1.2524F, 0.0424F, 0.0848F);
        this.rightarm2.cubeList.add(new ModelBox(rightarm2, 11, 47, -1.5F, -0.5F, -2.5F, 2, 8, 3, 0.0F, true));

        this.rightHand = new AdvancedModelRenderer(this);
        this.rightHand.setRotationPoint(0.45F, 7.0F, -1.01F);
        this.rightarm2.addChild(rightHand);
        this.setRotateAngle(rightHand, 0.0213F, 0.0F, 0.3609F);
        this.rightHand.cubeList.add(new ModelBox(rightHand, 53, 74, -2.0F, 0.0F, -2.5F, 2, 9, 5, 0.0F, true));

        this.rightarmfeathers3 = new AdvancedModelRenderer(this);
        this.rightarmfeathers3.setRotationPoint(0.0F, 0.0F, 0.8F);
        this.rightHand.addChild(rightarmfeathers3);
        this.setRotateAngle(rightarmfeathers3, -0.2972F, -1.1463F, 0.2759F);
        this.rightarmfeathers3.cubeList.add(new ModelBox(rightarmfeathers3, 119, 16, 0.0F, 0.0F, 0.0F, 1, 5, 0, 0.0F, true));

        this.rightarmfeathers2 = new AdvancedModelRenderer(this);
        this.rightarmfeathers2.setRotationPoint(0.3F, -0.2F, 0.3F);
        this.rightarm2.addChild(rightarmfeathers2);
        this.setRotateAngle(rightarmfeathers2, -0.0848F, 0.2122F, -0.0213F);
        this.rightarmfeathers2.cubeList.add(new ModelBox(rightarmfeathers2, 112, 22, 0.0F, 0.0F, 0.0F, 0, 7, 2, 0.0F, true));

        this.rightarmfeathers1 = new AdvancedModelRenderer(this);
        this.rightarmfeathers1.setRotationPoint(1.2F, 0.0F, 1.3F);
        this.rightarm.addChild(rightarmfeathers1);
        this.setRotateAngle(rightarmfeathers1, 0.0424F, 0.0F, -0.0424F);
        this.rightarmfeathers1.cubeList.add(new ModelBox(rightarmfeathers1, 92, 22, 0.0F, 0.0F, 0.0F, 0, 8, 2, 0.0F, true));

        this.body2feathers1 = new AdvancedModelRenderer(this);
        this.body2feathers1.setRotationPoint(0.0F, -3.0F, -13.0F);
        this.body2.addChild(body2feathers1);
        this.setRotateAngle(body2feathers1, 0.0424F, 0.0F, 0.0F);
        this.body2feathers1.cubeList.add(new ModelBox(body2feathers1, 57, 22, -4.0F, -1.0F, 0.0F, 8, 1, 13, 0.0F, true));

        this.body2feathers2 = new AdvancedModelRenderer(this);
        this.body2feathers2.setRotationPoint(0.0F, -2.5F, -13.0F);
        this.body2.addChild(body2feathers2);
        this.setRotateAngle(body2feathers2, 0.0637F, 0.0F, 0.0F);
        this.body2feathers2.cubeList.add(new ModelBox(body2feathers2, 91, 23, -1.5F, -2.0F, 0.0F, 3, 2, 14, 0.0F, true));

        this.bellySlope = new AdvancedModelRenderer(this);
        this.bellySlope.setRotationPoint(0.0F, 13.5F, -10.5F);
        this.body.addChild(bellySlope);
        this.setRotateAngle(bellySlope, -0.1698F, 0.0F, 0.0F);
        this.bellySlope.cubeList.add(new ModelBox(bellySlope, 97, 101, -4.5F, -2.0F, 0.0F, 9, 2, 11, 0.0F, true));

        this.bellyfeathers2 = new AdvancedModelRenderer(this);
        this.bellyfeathers2.setRotationPoint(0.0F, 0.3F, 0.0F);
        this.bellySlope.addChild(bellyfeathers2);
        this.setRotateAngle(bellyfeathers2, 0.0213F, 0.0F, 0.0F);
        this.bellyfeathers2.cubeList.add(new ModelBox(bellyfeathers2, 24, 0, -1.5F, -1.0F, 0.0F, 3, 2, 10, 0.0F, true));

        this.bodyfeathers1 = new AdvancedModelRenderer(this);
        this.bodyfeathers1.setRotationPoint(0.0F, -3.65F, -10.0F);
        this.body.addChild(bodyfeathers1);
        this.setRotateAngle(bodyfeathers1, 0.0424F, 0.0F, 0.0F);
        this.bodyfeathers1.cubeList.add(new ModelBox(bodyfeathers1, 63, 0, -4.5F, -2.0F, 0.0F, 9, 2, 10, 0.0F, true));

        this.bodyfeathers2 = new AdvancedModelRenderer(this);
        this.bodyfeathers2.setRotationPoint(0.0F, -4.5F, -9.8F);
        this.body.addChild(bodyfeathers2);
        this.bodyfeathers2.cubeList.add(new ModelBox(bodyfeathers2, 38, 30, -2.0F, -2.0F, 0.0F, 4, 2, 10, 0.0F, true));

        this.tail = new AdvancedModelRenderer(this);
        this.tail.setRotationPoint(0.0F, -2.0F, 9.9F);
        this.hips.addChild(tail);
        this.setRotateAngle(tail, -0.1911F, 0.0F, 0.0F);
        this.tail.cubeList.add(new ModelBox(tail, 106, 154, -4.0F, -4.0F, -0.5F, 8, 11, 15, 0.0F, true));

        this.tail2 = new AdvancedModelRenderer(this);
        this.tail2.setRotationPoint(0.0F, -1.1F, 13.6F);
        this.tail.addChild(tail2);
        this.setRotateAngle(tail2, 0.1274F, 0.0F, 0.0F);
        this.tail2.cubeList.add(new ModelBox(tail2, 97, 115, -3.0F, -2.5F, -0.5F, 6, 7, 12, 0.0F, true));

        this.tail3 = new AdvancedModelRenderer(this);
        this.tail3.setRotationPoint(0.0F, -0.8F, 11.0F);
        this.tail2.addChild(tail3);
        this.setRotateAngle(tail3, 0.1485F, 0.0F, 0.0F);
        this.tail3.cubeList.add(new ModelBox(tail3, 127, 110, -2.0F, -1.5F, -0.5F, 4, 5, 11, 0.0F, true));

        this.tail4 = new AdvancedModelRenderer(this);
        this.tail4.setRotationPoint(0.0F, -0.3F, 10.0F);
        this.tail3.addChild(tail4);
        this.setRotateAngle(tail4, -0.1911F, 0.0F, 0.0F);
        this.tail4.cubeList.add(new ModelBox(tail4, 127, 95, -1.5F, -1.0F, -0.5F, 3, 3, 11, 0.0F, true));

        this.tail5 = new AdvancedModelRenderer(this);
        this.tail5.setRotationPoint(0.0F, -0.1F, 10.2F);
        this.tail4.addChild(tail5);
        this.setRotateAngle(tail5, -0.1698F, 0.0F, 0.0F);
        this.tail5.cubeList.add(new ModelBox(tail5, 111, 87, -1.0F, -0.7F, -0.5F, 2, 2, 11, 0.0F, true));

        this.tail6 = new AdvancedModelRenderer(this);
        this.tail6.setRotationPoint(0.0F, 0.1F, 10.0F);
        this.tail5.addChild(tail6);
        this.setRotateAngle(tail6, -0.2546F, 0.0F, 0.0F);
        this.tail6.cubeList.add(new ModelBox(tail6, 92, 154, -0.5F, -0.5F, 0.0F, 1, 1, 11, 0.0F, true));

        this.tailfeathers7 = new AdvancedModelRenderer(this);
        this.tailfeathers7.setRotationPoint(0.0F, 0.3F, 0.0F);
        this.tail6.addChild(tailfeathers7);
        this.tailfeathers7.cubeList.add(new ModelBox(tailfeathers7, 59, 1, 0.0F, -2.0F, 0.0F, 0, 6, 14, 0.0F, true));

        this.tailfeathers13 = new AdvancedModelRenderer(this);
        this.tailfeathers13.setRotationPoint(0.0F, 0.0F, 0.7F);
        this.tail6.addChild(tailfeathers13);
        this.setRotateAngle(tailfeathers13, -0.0213F, 0.0F, 0.0F);
        this.tailfeathers13.cubeList.add(new ModelBox(tailfeathers13, 37, 15, -2.0F, 0.0F, 0.0F, 4, 2, 12, 0.0F, true));

        this.tailfeathers6 = new AdvancedModelRenderer(this);
        this.tailfeathers6.setRotationPoint(-0.01F, 0.1F, 0.0F);
        this.tail5.addChild(tailfeathers6);
        this.setRotateAngle(tailfeathers6, -0.1061F, 0.0F, 0.0F);
        this.tailfeathers6.cubeList.add(new ModelBox(tailfeathers6, 91, 6, -0.5F, -3.0F, 0.0F, 1, 6, 11, 0.0F, true));

        this.tailfeathers12 = new AdvancedModelRenderer(this);
        this.tailfeathers12.setRotationPoint(0.0F, 0.0F, -0.5F);
        this.tail5.addChild(tailfeathers12);
        this.setRotateAngle(tailfeathers12, -0.0213F, 0.0F, 0.0F);
        this.tailfeathers12.cubeList.add(new ModelBox(tailfeathers12, 39, 1, -2.5F, 0.0F, 0.0F, 5, 1, 12, 0.0F, true));

        this.tailfeathers4 = new AdvancedModelRenderer(this);
        this.tailfeathers4.setRotationPoint(0.0F, 0.8F, -0.2F);
        this.tail4.addChild(tailfeathers4);
        this.setRotateAngle(tailfeathers4, -0.0424F, 0.0F, 0.0F);
        this.tailfeathers4.cubeList.add(new ModelBox(tailfeathers4, 36, 46, -0.5F, 0.0F, 0.0F, 1, 3, 11, 0.0F, true));

        this.tailfeathers10 = new AdvancedModelRenderer(this);
        this.tailfeathers10.setRotationPoint(0.0F, 0.6F, 0.0F);
        this.tail4.addChild(tailfeathers10);
        this.setRotateAngle(tailfeathers10, 0.0848F, 0.0F, 0.0F);
        this.tailfeathers10.cubeList.add(new ModelBox(tailfeathers10, 0, 18, 0.0F, -2.0F, 0.0F, 0, 2, 11, 0.0F, true));

        this.tailfeathers11 = new AdvancedModelRenderer(this);
        this.tailfeathers11.setRotationPoint(0.0F, 0.0F, -0.5F);
        this.tail4.addChild(tailfeathers11);
        this.tailfeathers11.cubeList.add(new ModelBox(tailfeathers11, 112, 16, -2.0F, 0.0F, 0.0F, 4, 0, 11, 0.0F, true));

        this.tailfeathers3 = new AdvancedModelRenderer(this);
        this.tailfeathers3.setRotationPoint(0.0F, 2.5F, -0.5F);
        this.tail3.addChild(tailfeathers3);
        this.setRotateAngle(tailfeathers3, -0.0424F, 0.0F, 0.0F);
        this.tailfeathers3.cubeList.add(new ModelBox(tailfeathers3, 50, 50, -1.0F, 0.0F, 0.0F, 2, 2, 11, 0.0F, true));

        this.tailfeathers2 = new AdvancedModelRenderer(this);
        this.tailfeathers2.setRotationPoint(0.0F, 4.5F, 0.0F);
        this.tail2.addChild(tailfeathers2);
        this.setRotateAngle(tailfeathers2, 0.1274F, 0.0F, 0.0F);
        this.tailfeathers2.cubeList.add(new ModelBox(tailfeathers2, 22, 13, -1.5F, 0.0F, 0.0F, 3, 2, 10, 0.0F, true));

        this.tailfeathers1 = new AdvancedModelRenderer(this);
        this.tailfeathers1.setRotationPoint(0.0F, 7.0F, 0.0F);
        this.tail.addChild(tailfeathers1);
        this.setRotateAngle(tailfeathers1, 0.2546F, 0.0F, 0.0F);
        this.tailfeathers1.cubeList.add(new ModelBox(tailfeathers1, 101, 40, -2.5F, 0.0F, 0.0F, 5, 4, 12, 0.0F, true));

        this.tailfeathers8L = new AdvancedModelRenderer(this);
        this.tailfeathers8L.setRotationPoint(-1.6F, -4.3F, 0.0F);
        this.tail.addChild(tailfeathers8L);
        this.setRotateAngle(tailfeathers8L, -0.0848F, 0.0424F, -0.1274F);
        this.tailfeathers8L.cubeList.add(new ModelBox(tailfeathers8L, 105, 0, -1.0F, -2.0F, 0.0F, 2, 3, 12, 0.0F, true));

        this.tailfeathers9R = new AdvancedModelRenderer(this);
        this.tailfeathers9R.setRotationPoint(1.6F, -4.3F, 0.0F);
        this.tail.addChild(tailfeathers9R);
        this.setRotateAngle(tailfeathers9R, -0.0848F, -0.0424F, 0.1274F);
        this.tailfeathers9R.cubeList.add(new ModelBox(tailfeathers9R, 84, 52, -1.0F, -2.0F, 0.0F, 2, 3, 12, 0.0F, true));

        this.rightLeg = new AdvancedModelRenderer(this);
        this.rightLeg.setRotationPoint(4.5F, 0.1F, 0.0F);
        this.hips.addChild(rightLeg);
        this.setRotateAngle(rightLeg, -0.0213F, 0.0F, -0.0424F);
        this.rightLeg.cubeList.add(new ModelBox(rightLeg, 38, 125, -3.0F, -2.5F, -4.5F, 6, 16, 11, 0.0F, true));

        this.rightLeg2 = new AdvancedModelRenderer(this);
        this.rightLeg2.setRotationPoint(0.2F, 12.5F, -4.3F);
        this.rightLeg.addChild(rightLeg2);
        this.setRotateAngle(rightLeg2, 0.4882F, 0.0F, 0.0424F);
        this.rightLeg2.cubeList.add(new ModelBox(rightLeg2, 47, 102, -2.5F, 0.0F, 0.0F, 5, 15, 7, 0.0F, true));

        this.rightLeg3 = new AdvancedModelRenderer(this);
        this.rightLeg3.setRotationPoint(0.0F, 14.6F, 3.5F);
        this.rightLeg2.addChild(rightLeg3);
        this.setRotateAngle(rightLeg3, -0.5732F, 0.0F, 0.0F);
        this.rightLeg3.cubeList.add(new ModelBox(rightLeg3, 85, 79, -1.5F, 0.0F, -2.5F, 3, 9, 3, 0.0F, true));

        this.rightLeg4 = new AdvancedModelRenderer(this);
        this.rightLeg4.setRotationPoint(0.0F, 8.5F, -0.5F);
        this.rightLeg3.addChild(rightLeg4);
        this.setRotateAngle(rightLeg4, 0.1911F, 0.0F, 0.0F);
        this.rightLeg4.cubeList.add(new ModelBox(rightLeg4, 1, 31, -2.0F, -0.5F, -3.0F, 4, 2, 4, 0.0F, true));

        this.rightLeg5 = new AdvancedModelRenderer(this);
        this.rightLeg5.setRotationPoint(0.0F, -0.01F, -3.0F);
        this.rightLeg4.addChild(rightLeg5);
        this.rightLeg5.cubeList.add(new ModelBox(rightLeg5, 29, 66, -2.5F, -0.5F, -4.5F, 5, 2, 5, 0.0F, true));

        this.rightlegfeathers2 = new AdvancedModelRenderer(this);
        this.rightlegfeathers2.setRotationPoint(2.1F, 0.0F, 7.0F);
        this.rightLeg2.addChild(rightlegfeathers2);
        this.setRotateAngle(rightlegfeathers2, -0.0637F, 0.0F, 0.0637F);
        this.rightlegfeathers2.cubeList.add(new ModelBox(rightlegfeathers2, 17, 13, 0.0F, 0.0F, 0.0F, 0, 13, 2, 0.0F, true));

        this.rightlegfeathers1 = new AdvancedModelRenderer(this);
        this.rightlegfeathers1.setRotationPoint(1.6F, 0.0F, 6.6F);
        this.rightLeg.addChild(rightlegfeathers1);
        this.setRotateAngle(rightlegfeathers1, -0.0637F, 0.0F, 0.0213F);
        this.rightlegfeathers1.cubeList.add(new ModelBox(rightlegfeathers1, 12, 13, 0.0F, 0.0F, 0.0F, 0, 13, 2, 0.0F, true));

        this.leftLeg = new AdvancedModelRenderer(this);
        this.leftLeg.setRotationPoint(-4.5F, 0.1F, 0.0F);
        this.hips.addChild(leftLeg);
        this.setRotateAngle(leftLeg, -0.0213F, 0.0F, 0.0424F);
        this.leftLeg.cubeList.add(new ModelBox(leftLeg, 73, 125, -3.0F, -2.5F, -4.5F, 6, 16, 11, 0.0F, true));

        this.leftLeg2 = new AdvancedModelRenderer(this);
        this.leftLeg2.setRotationPoint(0.2F, 12.5F, -4.3F);
        this.leftLeg.addChild(leftLeg2);
        this.setRotateAngle(leftLeg2, 0.4882F, 0.0F, -0.0424F);
        this.leftLeg2.cubeList.add(new ModelBox(leftLeg2, 72, 102, -2.5F, 0.0F, 0.0F, 5, 15, 7, 0.0F, true));

        this.leftLeg3 = new AdvancedModelRenderer(this);
        this.leftLeg3.setRotationPoint(0.0F, 14.6F, 3.5F);
        this.leftLeg2.addChild(leftLeg3);
        this.setRotateAngle(leftLeg3, -0.5732F, 0.0F, 0.0F);
        this.leftLeg3.cubeList.add(new ModelBox(leftLeg3, 98, 79, -1.5F, 0.0F, -2.5F, 3, 9, 3, 0.0F, true));

        this.leftLeg4 = new AdvancedModelRenderer(this);
        this.leftLeg4.setRotationPoint(0.0F, 8.5F, -0.5F);
        this.leftLeg3.addChild(leftLeg4);
        this.setRotateAngle(leftLeg4, 0.1911F, 0.0F, 0.0F);
        this.leftLeg4.cubeList.add(new ModelBox(leftLeg4, 1, 37, -2.0F, -0.5F, -3.0F, 4, 2, 4, 0.0F, true));

        this.leftLeg5 = new AdvancedModelRenderer(this);
        this.leftLeg5.setRotationPoint(0.0F, -0.01F, -3.0F);
        this.leftLeg4.addChild(leftLeg5);
        this.leftLeg5.cubeList.add(new ModelBox(leftLeg5, 22, 49, -2.5F, -0.5F, -4.5F, 5, 2, 5, 0.0F, true));

        this.leftlegfeathers2 = new AdvancedModelRenderer(this);
        this.leftlegfeathers2.setRotationPoint(-2.1F, 0.0F, 7.0F);
        this.leftLeg2.addChild(leftlegfeathers2);
        this.setRotateAngle(leftlegfeathers2, -0.0637F, 0.0F, -0.0637F);
        this.leftlegfeathers2.cubeList.add(new ModelBox(leftlegfeathers2, 7, 13, 0.0F, 0.0F, 0.0F, 0, 13, 2, 0.0F, true));

        this.leftlegfeathers1 = new AdvancedModelRenderer(this);
        this.leftlegfeathers1.setRotationPoint(-1.6F, 0.0F, 6.6F);
        this.leftLeg.addChild(leftlegfeathers1);
        this.setRotateAngle(leftlegfeathers1, -0.0637F, 0.0F, -0.0213F);
        this.leftlegfeathers1.cubeList.add(new ModelBox(leftlegfeathers1, 2, 13, 0.0F, 0.0F, 0.0F, 0, 13, 2, 0.0F, true));

        this.hipfeathers1L = new AdvancedModelRenderer(this);
        this.hipfeathers1L.setRotationPoint(-2.2F, -6.4F, -6.0F);
        this.hips.addChild(hipfeathers1L);
        this.setRotateAngle(hipfeathers1L, -0.0213F, 0.0424F, -0.2335F);
        this.hipfeathers1L.cubeList.add(new ModelBox(hipfeathers1L, 13, 26, -1.5F, -2.0F, 0.0F, 3, 3, 17, 0.0F, true));

        this.hipfeathers2R = new AdvancedModelRenderer(this);
        this.hipfeathers2R.setRotationPoint(2.2F, -6.4F, -6.0F);
        this.hips.addChild(hipfeathers2R);
        this.setRotateAngle(hipfeathers2R, -0.0213F, -0.0424F, 0.2335F);
        this.hipfeathers2R.cubeList.add(new ModelBox(hipfeathers2R, 60, 52, -1.5F, -2.0F, 0.0F, 3, 3, 17, 0.0F, true));

        updateDefaultPose();
        animator = ModelAnimator.create();
    }

    @Override
    public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        animate((IAnimatedEntity) entity, f, f1, f2, f3, f4, f5);
        this.hips.render(f5);
    }

    @Override
    public void renderStaticBook(float f) {
        //Rotations, positions and sizing:
        this.hips.offsetY = 0.3F;
        this.hips.offsetX = -0.2F;
        this.hips.offsetZ = 2.0F;
        this.hips.rotateAngleY = (float)Math.toRadians(140);
        this.hips.rotateAngleX = (float)Math.toRadians(1);
        this.hips.rotateAngleZ = (float)Math.toRadians(0);
        this.hips.scaleChildren = true;
        float scaler = 0.5F;
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
        this.jaw.rotateAngleX = (float) Math.toRadians(23.9);
        this.neck.offsetY = -0.01F;
        this.neck.render(0.01F);
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

        EntityPrehistoricFloraSinotyrannus EntityCerato = (EntityPrehistoricFloraSinotyrannus) e;

        this.faceTarget(f3, f4, 8, neck);
        this.faceTarget(f3, f4, 8, neck2);
        this.faceTarget(f3, f4, 8, neck3);
        this.faceTarget(f3, f4, 8, head);

        AdvancedModelRenderer[] Tail = {this.tail, this.tail2, this.tail3, this.tail4};
        AdvancedModelRenderer[] Neck = {this.neck, this.neck2, this.neck3, this.head};
        AdvancedModelRenderer[] ArmL = {this.leftarm, this.leftarm2, this.leftHand};
        AdvancedModelRenderer[] ArmR = {this.rightarm, this.rightarm2, this.rightHand};

        EntityCerato.tailBuffer.applyChainSwingBuffer(Tail);

        if (EntityCerato.getAnimation() == EntityCerato.LAY_ANIMATION) {
            this.chainSwing(Neck, 0.5F, 0.05F, 0.5, f2, 0.7F);
            this.chainWave(Neck, 0.5F * 2, -0.02F, 0.5F, f2, 0.8F);
        }
        else {
            if (!EntityCerato.isReallyInWater()) {

                if (f3 == 0.0F || !EntityCerato.getIsMoving()) {
                    if (EntityCerato.getAnimation() != EntityCerato.EAT_ANIMATION) {
                        this.chainSwing(Neck, 0.05F, 0.10F, 0.5, f2, 0.8F);
                        this.chainWave(Neck, 0.05F * 2, -0.02F, 0.5F, f2, 0.8F);
                    }

                    this.chainWave(Tail, (0.15F * 0.35F), 0.125F * 0.15F, 0.2F, f2, 1F);
                    this.chainSwing(Tail, (0.15F * 0.35F) * 4F, 0.05F * 0.35F, 0.12F, f2, 1F);

                    this.chainWaveExtended(ArmL, 0.175F, 0.03F, 0.1F, 3F, f2, 1F);
                    this.chainWaveExtended(ArmR, 0.175F, -0.03F, -0.1F, 0f, f2, 1F);
                    this.chainFlapExtended(ArmL, 0.175F, -0.03F, 0.1F, 3F, f2, 1F);
                    this.chainFlapExtended(ArmR, 0.175F, -0.03F, -0.1F, 0f, f2, 1F);
                    this.walk(this.leftarm, 0.175F, 0.10F, true, 3F, 0.05F, f2, 1F);
                    this.walk(this.rightarm, 0.175F, -0.10F, true, 0F, 0.05F, f2, 1F);
                    this.flap(this.leftarm, 0.175F, -0.10F, true, 3F, 0.05F, f2, 1F);
                    this.flap(this.rightarm, 0.175F, -0.10F, true, 0F, 0.05F, f2, 1F);

                    return;
                }

                if (EntityCerato.getIsFast()) { //Running


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
        EntityPrehistoricFloraSinotyrannus entity = (EntityPrehistoricFloraSinotyrannus) entitylivingbaseIn;
        int animCycle = 20;
        double tickAnim = animTick + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;
     if (tickAnim >= 0 && tickAnim < 20) {
            xx = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360+150))*-7 + (((tickAnim - 0) / 20) * (0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360+150))*-7-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360+150))*-7)));
            yy = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360+100))*2 + (((tickAnim - 0) / 20) * (0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360+100))*2-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360+100))*2)));
            zz = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360+150))*7 + (((tickAnim - 0) / 20) * (0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360+150))*7-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360+150))*7)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck, neck.rotateAngleX + (float) Math.toRadians(xx), neck.rotateAngleY + (float) Math.toRadians(yy), neck.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 0) / 20) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 20) * (0-(0)));
            zz = 0.475 + (((tickAnim - 0) / 20) * (0.475-(0.475)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.neck.rotationPointX = this.neck.rotationPointX + (float)(xx);
        this.neck.rotationPointY = this.neck.rotationPointY - (float)(yy);
        this.neck.rotationPointZ = this.neck.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 11) {
            xx = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360+250))*8 + (((tickAnim - 0) / 11) * (17.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360+250))*8-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360+250))*8)));
            yy = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360+150))*2 + (((tickAnim - 0) / 11) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*360+150))*2-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360+150))*2)));
            zz = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360+250))*4 + (((tickAnim - 0) / 11) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*360+250))*4-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360+250))*4)));
        }
        else if (tickAnim >= 11 && tickAnim < 20) {
            xx = 17.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360+250))*8 + (((tickAnim - 11) / 9) * (0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360+250))*8-(17.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360+250))*8)));
            yy = Math.sin((Math.PI/180)*(((double)tickAnim/20)*360+150))*2 + (((tickAnim - 11) / 9) * (0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360+150))*2-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*360+150))*2)));
            zz = Math.sin((Math.PI/180)*(((double)tickAnim/20)*360+250))*4 + (((tickAnim - 11) / 9) * (0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360+250))*4-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*360+250))*4)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck2, neck2.rotateAngleX + (float) Math.toRadians(xx), neck2.rotateAngleY + (float) Math.toRadians(yy), neck2.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 12) {
            xx = 0 + (((tickAnim - 0) / 12) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 12) * (0-(0)));
            zz = 0.4 + (((tickAnim - 0) / 12) * (13.775+Math.sin((Math.PI/180)*(((double)tickAnim/20)*80-132))*15-(0.4)));
        }
        else if (tickAnim >= 12 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 12) / 8) * (0-(0)));
            yy = 0 + (((tickAnim - 12) / 8) * (0-(0)));
            zz = 13.775+Math.sin((Math.PI/180)*(((double)tickAnim/20)*80-132))*15 + (((tickAnim - 12) / 8) * (0.4-(13.775+Math.sin((Math.PI/180)*(((double)tickAnim/20)*80-132))*15)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.neck2.rotationPointX = this.neck2.rotationPointX + (float)(xx);
        this.neck2.rotationPointY = this.neck2.rotationPointY - (float)(yy);
        this.neck2.rotationPointZ = this.neck2.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 20) {
            xx = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360+250))*-9 + (((tickAnim - 0) / 20) * (0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360+250))*-9-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360+250))*-9)));
            yy = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360+250))*2 + (((tickAnim - 0) / 20) * (0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360+250))*2-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360+250))*2)));
            zz = 0 + (((tickAnim - 0) / 20) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck3, neck3.rotateAngleX + (float) Math.toRadians(xx), neck3.rotateAngleY + (float) Math.toRadians(yy), neck3.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 11) {
            xx = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360+350))*-6 + (((tickAnim - 0) / 11) * (-15.75+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360+350))*-6-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360+350))*-6)));
            yy = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360+350))*2 + (((tickAnim - 0) / 11) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*360+350))*2-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360+350))*2)));
            zz = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360+450))*4 + (((tickAnim - 0) / 11) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*360+450))*4-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360+450))*4)));
        }
        else if (tickAnim >= 11 && tickAnim < 20) {
            xx = -15.75+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360+350))*-6 + (((tickAnim - 11) / 9) * (0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360+350))*-6-(-15.75+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360+350))*-6)));
            yy = Math.sin((Math.PI/180)*(((double)tickAnim/20)*360+350))*2 + (((tickAnim - 11) / 9) * (0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360+350))*2-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*360+350))*2)));
            zz = Math.sin((Math.PI/180)*(((double)tickAnim/20)*360+450))*4 + (((tickAnim - 11) / 9) * (0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360+450))*4-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*360+450))*4)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck4, neck4.rotateAngleX + (float) Math.toRadians(xx), neck4.rotateAngleY + (float) Math.toRadians(yy), neck4.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 0) / 20) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 20) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.neck4.rotationPointX = this.neck4.rotationPointX + (float)(xx);
        this.neck4.rotationPointY = this.neck4.rotationPointY - (float)(yy);
        this.neck4.rotationPointZ = this.neck4.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 20) {
            xx = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360+450))*12 + (((tickAnim - 0) / 20) * (0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360+450))*12-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360+450))*12)));
            yy = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360+450))*2 + (((tickAnim - 0) / 20) * (0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360+450))*2-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360+450))*2)));
            zz = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360+660))*4 + (((tickAnim - 0) / 20) * (0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360+660))*4-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360+660))*4)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(head, head.rotateAngleX + (float) Math.toRadians(xx), head.rotateAngleY + (float) Math.toRadians(yy), head.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 5) {
            xx = -10.1+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360+450))*25 + (((tickAnim - 0) / 5) * (19.55+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360+450))*55-(-10.1+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360+450))*25)));
            yy = 0 + (((tickAnim - 0) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 5) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 7) {
            xx = 19.55+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360+450))*55 + (((tickAnim - 5) / 2) * (0.15-(19.55+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360+450))*55)));
            yy = 0 + (((tickAnim - 5) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 5) / 2) * (0-(0)));
        }
        else if (tickAnim >= 7 && tickAnim < 16) {
            xx = 0.15 + (((tickAnim - 7) / 9) * (0.25-(0.15)));
            yy = 0 + (((tickAnim - 7) / 9) * (0-(0)));
            zz = 0 + (((tickAnim - 7) / 9) * (0-(0)));
        }
        else if (tickAnim >= 16 && tickAnim < 20) {
            xx = 0.25 + (((tickAnim - 16) / 4) * (-10.1+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360+450))*25-(0.25)));
            yy = 0 + (((tickAnim - 16) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 16) / 4) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(jaw, jaw.rotateAngleX + (float) Math.toRadians(xx), jaw.rotateAngleY + (float) Math.toRadians(yy), jaw.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 0) / 10) * (15.5-(0)));
            yy = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 20) {
            xx = 15.5 + (((tickAnim - 10) / 10) * (0-(15.5)));
            yy = 0 + (((tickAnim - 10) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 10) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(throat2, throat2.rotateAngleX + (float) Math.toRadians(xx), throat2.rotateAngleY + (float) Math.toRadians(yy), throat2.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 10) * (0.4-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 10) / 10) * (0-(0)));
            yy = 0.4 + (((tickAnim - 10) / 10) * (0-(0.4)));
            zz = 0 + (((tickAnim - 10) / 10) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.throat2.rotationPointX = this.throat2.rotationPointX + (float)(xx);
        this.throat2.rotationPointY = this.throat2.rotationPointY - (float)(yy);
        this.throat2.rotationPointZ = this.throat2.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (0-(0)));
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
        this.setRotateAngle(throat3, throat3.rotateAngleX + (float) Math.toRadians(xx), throat3.rotateAngleY + (float) Math.toRadians(yy), throat3.rotateAngleZ + (float) Math.toRadians(zz));

        this.throat3.rotationPointX = this.throat3.rotationPointX + (float)(0);
        this.throat3.rotationPointY = this.throat3.rotationPointY - (float)(0.025);
        this.throat3.rotationPointZ = this.throat3.rotationPointZ + (float)(0);


        this.setRotateAngle(neckfeathers2, neckfeathers2.rotateAngleX + (float) Math.toRadians(-10.1+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360+400))*25), neckfeathers2.rotateAngleY + (float) Math.toRadians(0), neckfeathers2.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(neckfeathers3, neckfeathers3.rotateAngleX + (float) Math.toRadians(-10.1+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360+400))*25), neckfeathers3.rotateAngleY + (float) Math.toRadians(0), neckfeathers3.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(neckfeathers4, neckfeathers4.rotateAngleX + (float) Math.toRadians(-10.1+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360+400))*25), neckfeathers4.rotateAngleY + (float) Math.toRadians(0), neckfeathers4.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(neckfeathers1, neckfeathers1.rotateAngleX + (float) Math.toRadians(-10.1+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360+400))*25), neckfeathers1.rotateAngleY + (float) Math.toRadians(0), neckfeathers1.rotateAngleZ + (float) Math.toRadians(0));

    }
    public void animNoise(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime, double animTick) {
        EntityPrehistoricFloraSinotyrannus entity = (EntityPrehistoricFloraSinotyrannus) entitylivingbaseIn;
        int animCycle = 80;
        double tickAnim = animTick + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;
     if (tickAnim >= 0 && tickAnim < 18) {
            xx = 0 + (((tickAnim - 0) / 18) * (2.75-(0)));
            yy = 0 + (((tickAnim - 0) / 18) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 18) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 40) {
            xx = 2.75 + (((tickAnim - 18) / 22) * (0-(2.75)));
            yy = 0 + (((tickAnim - 18) / 22) * (0-(0)));
            zz = 0 + (((tickAnim - 18) / 22) * (0-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 55) {
            xx = 0 + (((tickAnim - 40) / 15) * (2.75-(0)));
            yy = 0 + (((tickAnim - 40) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 40) / 15) * (0-(0)));
        }
        else if (tickAnim >= 55 && tickAnim < 58) {
            xx = 2.75 + (((tickAnim - 55) / 3) * (2.75-(2.75)));
            yy = 0 + (((tickAnim - 55) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 55) / 3) * (0-(0)));
        }
        else if (tickAnim >= 58 && tickAnim < 80) {
            xx = 2.75 + (((tickAnim - 58) / 22) * (0-(2.75)));
            yy = 0 + (((tickAnim - 58) / 22) * (0-(0)));
            zz = 0 + (((tickAnim - 58) / 22) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(body, body.rotateAngleX + (float) Math.toRadians(xx), body.rotateAngleY + (float) Math.toRadians(yy), body.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 18) {
            xx = 0 + (((tickAnim - 0) / 18) * (31.125+Math.sin((Math.PI/180)*(((double)tickAnim/20)*60))*-40-(0)));
            yy = 0 + (((tickAnim - 0) / 18) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 18) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 40) {
            xx = 31.125+Math.sin((Math.PI/180)*(((double)tickAnim/20)*60))*-40 + (((tickAnim - 18) / 22) * (34.6+Math.sin((Math.PI/180)*(((double)tickAnim/20)*60))*-40-(31.125+Math.sin((Math.PI/180)*(((double)tickAnim/20)*60))*-40)));
            yy = 0 + (((tickAnim - 18) / 22) * (0-(0)));
            zz = 0 + (((tickAnim - 18) / 22) * (0-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 80) {
            xx = 34.6+Math.sin((Math.PI/180)*(((double)tickAnim/20)*60))*-40 + (((tickAnim - 40) / 40) * (0-(34.6+Math.sin((Math.PI/180)*(((double)tickAnim/20)*60))*-40)));
            yy = 0 + (((tickAnim - 40) / 40) * (0-(0)));
            zz = 0 + (((tickAnim - 40) / 40) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck, neck.rotateAngleX + (float) Math.toRadians(xx), neck.rotateAngleY + (float) Math.toRadians(yy), neck.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 18) {
            xx = 0 + (((tickAnim - 0) / 18) * (-1.25+Math.sin((Math.PI/180)*(((double)tickAnim/20)*70-50))*5-(0)));
            yy = 0 + (((tickAnim - 0) / 18) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 18) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 40) {
            xx = -1.25+Math.sin((Math.PI/180)*(((double)tickAnim/20)*70-50))*5 + (((tickAnim - 18) / 22) * (0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*70-50))*5-(-1.25+Math.sin((Math.PI/180)*(((double)tickAnim/20)*70-50))*5)));
            yy = 0 + (((tickAnim - 18) / 22) * (0-(0)));
            zz = 0 + (((tickAnim - 18) / 22) * (0-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 80) {
            xx = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*70-50))*5 + (((tickAnim - 40) / 40) * (0-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*70-50))*5)));
            yy = 0 + (((tickAnim - 40) / 40) * (0-(0)));
            zz = 0 + (((tickAnim - 40) / 40) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck2, neck2.rotateAngleX + (float) Math.toRadians(xx), neck2.rotateAngleY + (float) Math.toRadians(yy), neck2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 18) {
            xx = 0 + (((tickAnim - 0) / 18) * (2+Math.sin((Math.PI/180)*(((double)tickAnim/20)*80-50))*-5-(0)));
            yy = 0 + (((tickAnim - 0) / 18) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 18) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 40) {
            xx = 2+Math.sin((Math.PI/180)*(((double)tickAnim/20)*80-50))*-5 + (((tickAnim - 18) / 22) * (0-(2+Math.sin((Math.PI/180)*(((double)tickAnim/20)*80-50))*-5)));
            yy = 0 + (((tickAnim - 18) / 22) * (0-(0)));
            zz = 0 + (((tickAnim - 18) / 22) * (0-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 80) {
            xx = 0 + (((tickAnim - 40) / 40) * (0-(0)));
            yy = 0 + (((tickAnim - 40) / 40) * (0-(0)));
            zz = 0 + (((tickAnim - 40) / 40) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck3, neck3.rotateAngleX + (float) Math.toRadians(xx), neck3.rotateAngleY + (float) Math.toRadians(yy), neck3.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 18) {
            xx = 0 + (((tickAnim - 0) / 18) * (-1.275+Math.sin((Math.PI/180)*(((double)tickAnim/20)*90-90))*-10-(0)));
            yy = 0 + (((tickAnim - 0) / 18) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 18) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 40) {
            xx = -1.275+Math.sin((Math.PI/180)*(((double)tickAnim/20)*90-90))*-10 + (((tickAnim - 18) / 22) * (0-(-1.275+Math.sin((Math.PI/180)*(((double)tickAnim/20)*90-90))*-10)));
            yy = 0 + (((tickAnim - 18) / 22) * (0-(0)));
            zz = 0 + (((tickAnim - 18) / 22) * (0-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 80) {
            xx = 0 + (((tickAnim - 40) / 40) * (0-(0)));
            yy = 0 + (((tickAnim - 40) / 40) * (0-(0)));
            zz = 0 + (((tickAnim - 40) / 40) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck4, neck4.rotateAngleX + (float) Math.toRadians(xx), neck4.rotateAngleY + (float) Math.toRadians(yy), neck4.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 18) {
            xx = 0 + (((tickAnim - 0) / 18) * (-3.1+Math.sin((Math.PI/180)*(((double)tickAnim/20)*90-1200))*-5-(0)));
            yy = 0 + (((tickAnim - 0) / 18) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 18) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 40) {
            xx = -3.1+Math.sin((Math.PI/180)*(((double)tickAnim/20)*90-1200))*-5 + (((tickAnim - 18) / 22) * (-0.525+Math.sin((Math.PI/180)*(((double)tickAnim/20)*90-120))*5-(-3.1+Math.sin((Math.PI/180)*(((double)tickAnim/20)*90-1200))*-5)));
            yy = 0 + (((tickAnim - 18) / 22) * (0-(0)));
            zz = 0 + (((tickAnim - 18) / 22) * (0-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 80) {
            xx = -0.525+Math.sin((Math.PI/180)*(((double)tickAnim/20)*90-120))*5 + (((tickAnim - 40) / 40) * (0-(-0.525+Math.sin((Math.PI/180)*(((double)tickAnim/20)*90-120))*5)));
            yy = 0 + (((tickAnim - 40) / 40) * (0-(0)));
            zz = 0 + (((tickAnim - 40) / 40) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(head, head.rotateAngleX + (float) Math.toRadians(xx), head.rotateAngleY + (float) Math.toRadians(yy), head.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 80) {
            xx = 0 + (((tickAnim - 0) / 80) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 80) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 80) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.head.rotationPointX = this.head.rotationPointX + (float)(xx);
        this.head.rotationPointY = this.head.rotationPointY - (float)(yy);
        this.head.rotationPointZ = this.head.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 7) {
            xx = 0 + (((tickAnim - 0) / 7) * (6.5-(0)));
            yy = 0 + (((tickAnim - 0) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 7) * (0-(0)));
        }
        else if (tickAnim >= 7 && tickAnim < 14) {
            xx = 6.5 + (((tickAnim - 7) / 7) * (0-(6.5)));
            yy = 0 + (((tickAnim - 7) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 7) / 7) * (0-(0)));
        }
        else if (tickAnim >= 14 && tickAnim < 30) {
            xx = 0 + (((tickAnim - 14) / 16) * (0-(0)));
            yy = 0 + (((tickAnim - 14) / 16) * (0-(0)));
            zz = 0 + (((tickAnim - 14) / 16) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 40) {
            xx = 0 + (((tickAnim - 30) / 10) * (5.25-(0)));
            yy = 0 + (((tickAnim - 30) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 30) / 10) * (0-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 47) {
            xx = 5.25 + (((tickAnim - 40) / 7) * (0-(5.25)));
            yy = 0 + (((tickAnim - 40) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 40) / 7) * (0-(0)));
        }
        else if (tickAnim >= 47 && tickAnim < 80) {
            xx = 0 + (((tickAnim - 47) / 33) * (0-(0)));
            yy = 0 + (((tickAnim - 47) / 33) * (0-(0)));
            zz = 0 + (((tickAnim - 47) / 33) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(jaw, jaw.rotateAngleX + (float) Math.toRadians(xx), jaw.rotateAngleY + (float) Math.toRadians(yy), jaw.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 0) / 15) * (2.25-(0)));
            yy = 0 + (((tickAnim - 0) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 15) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 26) {
            xx = 2.25 + (((tickAnim - 15) / 11) * (-15.75-(2.25)));
            yy = 0 + (((tickAnim - 15) / 11) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 11) * (0-(0)));
        }
        else if (tickAnim >= 26 && tickAnim < 40) {
            xx = -15.75 + (((tickAnim - 26) / 14) * (16.75-(-15.75)));
            yy = 0 + (((tickAnim - 26) / 14) * (0-(0)));
            zz = 0 + (((tickAnim - 26) / 14) * (0-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 55) {
            xx = 16.75 + (((tickAnim - 40) / 15) * (-21.75-(16.75)));
            yy = 0 + (((tickAnim - 40) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 40) / 15) * (0-(0)));
        }
        else if (tickAnim >= 55 && tickAnim < 68) {
            xx = -21.75 + (((tickAnim - 55) / 13) * (2.25-(-21.75)));
            yy = 0 + (((tickAnim - 55) / 13) * (0-(0)));
            zz = 0 + (((tickAnim - 55) / 13) * (0-(0)));
        }
        else if (tickAnim >= 68 && tickAnim < 80) {
            xx = 2.25 + (((tickAnim - 68) / 12) * (0-(2.25)));
            yy = 0 + (((tickAnim - 68) / 12) * (0-(0)));
            zz = 0 + (((tickAnim - 68) / 12) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(throat1, throat1.rotateAngleX + (float) Math.toRadians(xx), throat1.rotateAngleY + (float) Math.toRadians(yy), throat1.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 30) {
            xx = 0 + (((tickAnim - 0) / 30) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 30) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 30) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 40) {
            xx = 0 + (((tickAnim - 30) / 10) * (0-(0)));
            yy = 0 + (((tickAnim - 30) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 30) / 10) * (0-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 60) {
            xx = 0 + (((tickAnim - 40) / 20) * (0-(0)));
            yy = 0 + (((tickAnim - 40) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 40) / 20) * (0-(0)));
        }
        else if (tickAnim >= 60 && tickAnim < 80) {
            xx = 0 + (((tickAnim - 60) / 20) * (0-(0)));
            yy = 0 + (((tickAnim - 60) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 60) / 20) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.throat1.rotationPointX = this.throat1.rotationPointX + (float)(xx);
        this.throat1.rotationPointY = this.throat1.rotationPointY - (float)(yy);
        this.throat1.rotationPointZ = this.throat1.rotationPointZ + (float)(zz);


        if (tickAnim >= 0 && tickAnim < 7) {
            xx = 1 + (((tickAnim - 0) / 7) * (1-(1)));
            yy = 1 + (((tickAnim - 0) / 7) * (1-(1)));
            zz = 1 + (((tickAnim - 0) / 7) * (1-(1)));
        }
        else if (tickAnim >= 7 && tickAnim < 29) {
            xx = 1 + (((tickAnim - 7) / 22) * (1-(1)));
            yy = 1 + (((tickAnim - 7) / 22) * (1-(1)));
            zz = 1 + (((tickAnim - 7) / 22) * (1.1-(1)));
        }
        else if (tickAnim >= 29 && tickAnim < 40) {
            xx = 1 + (((tickAnim - 29) / 11) * (1-(1)));
            yy = 1 + (((tickAnim - 29) / 11) * (0.1-(1)));
            zz = 1.1 + (((tickAnim - 29) / 11) * (1-(1.1)));
        }
        else if (tickAnim >= 40 && tickAnim < 55) {
            xx = 1 + (((tickAnim - 40) / 15) * (1-(1)));
            yy = 0.1 + (((tickAnim - 40) / 15) * (2.1309-(0.1)));
            zz = 1 + (((tickAnim - 40) / 15) * (1.0545-(1)));
        }
        else if (tickAnim >= 55 && tickAnim < 68) {
            xx = 1 + (((tickAnim - 55) / 13) * (1-(1)));
            yy = 2.1309 + (((tickAnim - 55) / 13) * (1-(2.1309)));
            zz = 1.0545 + (((tickAnim - 55) / 13) * (1.1-(1.0545)));
        }
        else if (tickAnim >= 68 && tickAnim < 80) {
            xx = 1 + (((tickAnim - 68) / 12) * (1-(1)));
            yy = 1 + (((tickAnim - 68) / 12) * (1-(1)));
            zz = 1.1 + (((tickAnim - 68) / 12) * (1-(1.1)));
        }
        else {
            xx = 1;
            yy = 1;
            zz = 1;
        }
        this.throat1.setScale((float)xx, (float)yy, (float)zz);




        if (tickAnim >= 0 && tickAnim < 14) {
            xx = 0 + (((tickAnim - 0) / 14) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 14) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 14) * (0-(0)));
        }
        else if (tickAnim >= 14 && tickAnim < 27) {
            xx = 0 + (((tickAnim - 14) / 13) * (-23-(0)));
            yy = 0 + (((tickAnim - 14) / 13) * (0-(0)));
            zz = 0 + (((tickAnim - 14) / 13) * (0-(0)));
        }
        else if (tickAnim >= 27 && tickAnim < 40) {
            xx = -23 + (((tickAnim - 27) / 13) * (0-(-23)));
            yy = 0 + (((tickAnim - 27) / 13) * (0-(0)));
            zz = 0 + (((tickAnim - 27) / 13) * (0-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 55) {
            xx = 0 + (((tickAnim - 40) / 15) * (-23-(0)));
            yy = 0 + (((tickAnim - 40) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 40) / 15) * (0-(0)));
        }
        else if (tickAnim >= 55 && tickAnim < 80) {
            xx = -23 + (((tickAnim - 55) / 25) * (0-(-23)));
            yy = 0 + (((tickAnim - 55) / 25) * (0-(0)));
            zz = 0 + (((tickAnim - 55) / 25) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(featherbeard2, featherbeard2.rotateAngleX + (float) Math.toRadians(xx), featherbeard2.rotateAngleY + (float) Math.toRadians(yy), featherbeard2.rotateAngleZ + (float) Math.toRadians(zz));

    }
    public void animNest(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime, double animTick) {
        EntityPrehistoricFloraSinotyrannus entity = (EntityPrehistoricFloraSinotyrannus) entitylivingbaseIn;
        int animCycle = 50;
        double tickAnim = animTick + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;
     if (tickAnim >= 0 && tickAnim < 23) {
            xx = 0 + (((tickAnim - 0) / 23) * (26.25-(0)));
            yy = 0 + (((tickAnim - 0) / 23) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 23) * (0-(0)));
        }
        else if (tickAnim >= 23 && tickAnim < 50) {
            xx = 26.25 + (((tickAnim - 23) / 27) * (0-(26.25)));
            yy = 0 + (((tickAnim - 23) / 27) * (0-(0)));
            zz = 0 + (((tickAnim - 23) / 27) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightLeg, rightLeg.rotateAngleX + (float) Math.toRadians(xx), rightLeg.rotateAngleY + (float) Math.toRadians(yy), rightLeg.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 23) {
            xx = 0 + (((tickAnim - 0) / 23) * (14-(0)));
            yy = 0 + (((tickAnim - 0) / 23) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 23) * (0-(0)));
        }
        else if (tickAnim >= 23 && tickAnim < 32) {
            xx = 14 + (((tickAnim - 23) / 9) * (30.88-(14)));
            yy = 0 + (((tickAnim - 23) / 9) * (0-(0)));
            zz = 0 + (((tickAnim - 23) / 9) * (0-(0)));
        }
        else if (tickAnim >= 32 && tickAnim < 50) {
            xx = 30.88 + (((tickAnim - 32) / 18) * (0-(30.88)));
            yy = 0 + (((tickAnim - 32) / 18) * (0-(0)));
            zz = 0 + (((tickAnim - 32) / 18) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightLeg2, rightLeg2.rotateAngleX + (float) Math.toRadians(xx), rightLeg2.rotateAngleY + (float) Math.toRadians(yy), rightLeg2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 23) {
            xx = 0 + (((tickAnim - 0) / 23) * (-24.25-(0)));
            yy = 0 + (((tickAnim - 0) / 23) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 23) * (0-(0)));
        }
        else if (tickAnim >= 23 && tickAnim < 37) {
            xx = -24.25 + (((tickAnim - 23) / 14) * (-59.38-(-24.25)));
            yy = 0 + (((tickAnim - 23) / 14) * (0-(0)));
            zz = 0 + (((tickAnim - 23) / 14) * (0-(0)));
        }
        else if (tickAnim >= 37 && tickAnim < 43) {
            xx = -59.38 + (((tickAnim - 37) / 6) * (-59.38-(-59.38)));
            yy = 0 + (((tickAnim - 37) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 37) / 6) * (0-(0)));
        }
        else if (tickAnim >= 43 && tickAnim < 50) {
            xx = -59.38 + (((tickAnim - 43) / 7) * (0-(-59.38)));
            yy = 0 + (((tickAnim - 43) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 43) / 7) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightLeg3, rightLeg3.rotateAngleX + (float) Math.toRadians(xx), rightLeg3.rotateAngleY + (float) Math.toRadians(yy), rightLeg3.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 23) {
            xx = 0 + (((tickAnim - 0) / 23) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 23) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 23) * (0-(0)));
        }
        else if (tickAnim >= 23 && tickAnim < 37) {
            xx = 0 + (((tickAnim - 23) / 14) * (0-(0)));
            yy = 0 + (((tickAnim - 23) / 14) * (-0.425-(0)));
            zz = 0 + (((tickAnim - 23) / 14) * (0-(0)));
        }
        else if (tickAnim >= 37 && tickAnim < 43) {
            xx = 0 + (((tickAnim - 37) / 6) * (0-(0)));
            yy = -0.425 + (((tickAnim - 37) / 6) * (-0.425-(-0.425)));
            zz = 0 + (((tickAnim - 37) / 6) * (0-(0)));
        }
        else if (tickAnim >= 43 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 43) / 7) * (0-(0)));
            yy = -0.425 + (((tickAnim - 43) / 7) * (0-(-0.425)));
            zz = 0 + (((tickAnim - 43) / 7) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.rightLeg3.rotationPointX = this.rightLeg3.rotationPointX + (float)(xx);
        this.rightLeg3.rotationPointY = this.rightLeg3.rotationPointY - (float)(yy);
        this.rightLeg3.rotationPointZ = this.rightLeg3.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 23) {
            xx = 0 + (((tickAnim - 0) / 23) * (56.75-(0)));
            yy = 0 + (((tickAnim - 0) / 23) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 23) * (0-(0)));
        }
        else if (tickAnim >= 23 && tickAnim < 37) {
            xx = 56.75 + (((tickAnim - 23) / 14) * (94.63-(56.75)));
            yy = 0 + (((tickAnim - 23) / 14) * (0-(0)));
            zz = 0 + (((tickAnim - 23) / 14) * (0-(0)));
        }
        else if (tickAnim >= 37 && tickAnim < 43) {
            xx = 94.63 + (((tickAnim - 37) / 6) * (94.63-(94.63)));
            yy = 0 + (((tickAnim - 37) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 37) / 6) * (0-(0)));
        }
        else if (tickAnim >= 43 && tickAnim < 50) {
            xx = 94.63 + (((tickAnim - 43) / 7) * (0-(94.63)));
            yy = 0 + (((tickAnim - 43) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 43) / 7) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightLeg4, rightLeg4.rotateAngleX + (float) Math.toRadians(xx), rightLeg4.rotateAngleY + (float) Math.toRadians(yy), rightLeg4.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 23) {
            xx = 0 + (((tickAnim - 0) / 23) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 23) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 23) * (0-(0)));
        }
        else if (tickAnim >= 23 && tickAnim < 37) {
            xx = 0 + (((tickAnim - 23) / 14) * (0-(0)));
            yy = 0 + (((tickAnim - 23) / 14) * (1.65-(0)));
            zz = 0 + (((tickAnim - 23) / 14) * (-0.725-(0)));
        }
        else if (tickAnim >= 37 && tickAnim < 43) {
            xx = 0 + (((tickAnim - 37) / 6) * (0-(0)));
            yy = 1.65 + (((tickAnim - 37) / 6) * (1.65-(1.65)));
            zz = -0.725 + (((tickAnim - 37) / 6) * (-0.725-(-0.725)));
        }
        else if (tickAnim >= 43 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 43) / 7) * (0-(0)));
            yy = 1.65 + (((tickAnim - 43) / 7) * (0-(1.65)));
            zz = -0.725 + (((tickAnim - 43) / 7) * (0-(-0.725)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.rightLeg4.rotationPointX = this.rightLeg4.rotationPointX + (float)(xx);
        this.rightLeg4.rotationPointY = this.rightLeg4.rotationPointY - (float)(yy);
        this.rightLeg4.rotationPointZ = this.rightLeg4.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 0) / 5) * (-13.25-(0)));
            yy = 0 + (((tickAnim - 0) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 5) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 10) {
            xx = -13.25 + (((tickAnim - 5) / 5) * (-18.89-(-13.25)));
            yy = 0 + (((tickAnim - 5) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 5) / 5) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 23) {
            xx = -18.89 + (((tickAnim - 10) / 13) * (15.75-(-18.89)));
            yy = 0 + (((tickAnim - 10) / 13) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 13) * (0-(0)));
        }
        else if (tickAnim >= 23 && tickAnim < 50) {
            xx = 15.75 + (((tickAnim - 23) / 27) * (0-(15.75)));
            yy = 0 + (((tickAnim - 23) / 27) * (0-(0)));
            zz = 0 + (((tickAnim - 23) / 27) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightLeg5, rightLeg5.rotateAngleX + (float) Math.toRadians(xx), rightLeg5.rotateAngleY + (float) Math.toRadians(yy), rightLeg5.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 0) / 5) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 5) * (-0.175-(0)));
            zz = 0 + (((tickAnim - 0) / 5) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 23) {
            xx = 0 + (((tickAnim - 5) / 18) * (0-(0)));
            yy = -0.175 + (((tickAnim - 5) / 18) * (0-(-0.175)));
            zz = 0 + (((tickAnim - 5) / 18) * (0-(0)));
        }
        else if (tickAnim >= 23 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 23) / 27) * (0-(0)));
            yy = 0 + (((tickAnim - 23) / 27) * (0-(0)));
            zz = 0 + (((tickAnim - 23) / 27) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.rightLeg5.rotationPointX = this.rightLeg5.rotationPointX + (float)(xx);
        this.rightLeg5.rotationPointY = this.rightLeg5.rotationPointY - (float)(yy);
        this.rightLeg5.rotationPointZ = this.rightLeg5.rotationPointZ + (float)(zz);

    }
    public void animAlert(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime, double animTick) {
        EntityPrehistoricFloraSinotyrannus entity = (EntityPrehistoricFloraSinotyrannus) entitylivingbaseIn;

    }
    public void animLay(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime, double animTick) {
        EntityPrehistoricFloraSinotyrannus entity = (EntityPrehistoricFloraSinotyrannus) entitylivingbaseIn;
        int animCycle = 50;
        double tickAnim = animTick + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;
     if (tickAnim >= 0 && tickAnim < 23) {
            xx = 0 + (((tickAnim - 0) / 23) * (-17.5-(0)));
            yy = 0 + (((tickAnim - 0) / 23) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 23) * (0-(0)));
        }
        else if (tickAnim >= 23 && tickAnim < 28) {
            xx = -17.5 + (((tickAnim - 23) / 5) * (-17.5-(-17.5)));
            yy = 0 + (((tickAnim - 23) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 23) / 5) * (0-(0)));
        }
        else if (tickAnim >= 28 && tickAnim < 50) {
            xx = -17.5 + (((tickAnim - 28) / 22) * (0-(-17.5)));
            yy = 0 + (((tickAnim - 28) / 22) * (0-(0)));
            zz = 0 + (((tickAnim - 28) / 22) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(hips, hips.rotateAngleX + (float) Math.toRadians(xx), hips.rotateAngleY + (float) Math.toRadians(yy), hips.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 23) {
            xx = 0 + (((tickAnim - 0) / 23) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 23) * (-9.7-(0)));
            zz = 0 + (((tickAnim - 0) / 23) * (7.775-(0)));
        }
        else if (tickAnim >= 23 && tickAnim < 28) {
            xx = 0 + (((tickAnim - 23) / 5) * (0-(0)));
            yy = -9.7 + (((tickAnim - 23) / 5) * (-9.7-(-9.7)));
            zz = 7.775 + (((tickAnim - 23) / 5) * (7.775-(7.775)));
        }
        else if (tickAnim >= 28 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 28) / 22) * (0-(0)));
            yy = -9.7 + (((tickAnim - 28) / 22) * (0-(-9.7)));
            zz = 7.775 + (((tickAnim - 28) / 22) * (0-(7.775)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.hips.rotationPointX = this.hips.rotationPointX + (float)(xx);
        this.hips.rotationPointY = this.hips.rotationPointY - (float)(yy);
        this.hips.rotationPointZ = this.hips.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 23) {
            xx = 0 + (((tickAnim - 0) / 23) * (3.25-(0)));
            yy = 0 + (((tickAnim - 0) / 23) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 23) * (0-(0)));
        }
        else if (tickAnim >= 23 && tickAnim < 28) {
            xx = 3.25 + (((tickAnim - 23) / 5) * (3.25-(3.25)));
            yy = 0 + (((tickAnim - 23) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 23) / 5) * (0-(0)));
        }
        else if (tickAnim >= 28 && tickAnim < 50) {
            xx = 3.25 + (((tickAnim - 28) / 22) * (0-(3.25)));
            yy = 0 + (((tickAnim - 28) / 22) * (0-(0)));
            zz = 0 + (((tickAnim - 28) / 22) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(body, body.rotateAngleX + (float) Math.toRadians(xx), body.rotateAngleY + (float) Math.toRadians(yy), body.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 23) {
            xx = 0 + (((tickAnim - 0) / 23) * (6.25-(0)));
            yy = 0 + (((tickAnim - 0) / 23) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 23) * (0-(0)));
        }
        else if (tickAnim >= 23 && tickAnim < 28) {
            xx = 6.25 + (((tickAnim - 23) / 5) * (6.25-(6.25)));
            yy = 0 + (((tickAnim - 23) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 23) / 5) * (0-(0)));
        }
        else if (tickAnim >= 28 && tickAnim < 50) {
            xx = 6.25 + (((tickAnim - 28) / 22) * (0-(6.25)));
            yy = 0 + (((tickAnim - 28) / 22) * (0-(0)));
            zz = 0 + (((tickAnim - 28) / 22) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(body2, body2.rotateAngleX + (float) Math.toRadians(xx), body2.rotateAngleY + (float) Math.toRadians(yy), body2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 23) {
            xx = 0 + (((tickAnim - 0) / 23) * (4.25-(0)));
            yy = 0 + (((tickAnim - 0) / 23) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 23) * (0-(0)));
        }
        else if (tickAnim >= 23 && tickAnim < 28) {
            xx = 4.25 + (((tickAnim - 23) / 5) * (4.25-(4.25)));
            yy = 0 + (((tickAnim - 23) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 23) / 5) * (0-(0)));
        }
        else if (tickAnim >= 28 && tickAnim < 50) {
            xx = 4.25 + (((tickAnim - 28) / 22) * (0-(4.25)));
            yy = 0 + (((tickAnim - 28) / 22) * (0-(0)));
            zz = 0 + (((tickAnim - 28) / 22) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck, neck.rotateAngleX + (float) Math.toRadians(xx), neck.rotateAngleY + (float) Math.toRadians(yy), neck.rotateAngleZ + (float) Math.toRadians(zz));




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
        this.setRotateAngle(neck2, neck2.rotateAngleX + (float) Math.toRadians(xx), neck2.rotateAngleY + (float) Math.toRadians(yy), neck2.rotateAngleZ + (float) Math.toRadians(zz));




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
        this.setRotateAngle(neck3, neck3.rotateAngleX + (float) Math.toRadians(xx), neck3.rotateAngleY + (float) Math.toRadians(yy), neck3.rotateAngleZ + (float) Math.toRadians(zz));




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
        this.setRotateAngle(neck4, neck4.rotateAngleX + (float) Math.toRadians(xx), neck4.rotateAngleY + (float) Math.toRadians(yy), neck4.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 23) {
            xx = 0 + (((tickAnim - 0) / 23) * (3.75-(0)));
            yy = 0 + (((tickAnim - 0) / 23) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 23) * (0-(0)));
        }
        else if (tickAnim >= 23 && tickAnim < 28) {
            xx = 3.75 + (((tickAnim - 23) / 5) * (3.75-(3.75)));
            yy = 0 + (((tickAnim - 23) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 23) / 5) * (0-(0)));
        }
        else if (tickAnim >= 28 && tickAnim < 50) {
            xx = 3.75 + (((tickAnim - 28) / 22) * (0-(3.75)));
            yy = 0 + (((tickAnim - 28) / 22) * (0-(0)));
            zz = 0 + (((tickAnim - 28) / 22) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tail, tail.rotateAngleX + (float) Math.toRadians(xx), tail.rotateAngleY + (float) Math.toRadians(yy), tail.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 23) {
            xx = 0 + (((tickAnim - 0) / 23) * (5.25-(0)));
            yy = 0 + (((tickAnim - 0) / 23) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 23) * (0-(0)));
        }
        else if (tickAnim >= 23 && tickAnim < 28) {
            xx = 5.25 + (((tickAnim - 23) / 5) * (5.25-(5.25)));
            yy = 0 + (((tickAnim - 23) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 23) / 5) * (0-(0)));
        }
        else if (tickAnim >= 28 && tickAnim < 50) {
            xx = 5.25 + (((tickAnim - 28) / 22) * (0-(5.25)));
            yy = 0 + (((tickAnim - 28) / 22) * (0-(0)));
            zz = 0 + (((tickAnim - 28) / 22) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tail2, tail2.rotateAngleX + (float) Math.toRadians(xx), tail2.rotateAngleY + (float) Math.toRadians(yy), tail2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 23) {
            xx = 0 + (((tickAnim - 0) / 23) * (9.25-(0)));
            yy = 0 + (((tickAnim - 0) / 23) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 23) * (0-(0)));
        }
        else if (tickAnim >= 23 && tickAnim < 28) {
            xx = 9.25 + (((tickAnim - 23) / 5) * (9.25-(9.25)));
            yy = 0 + (((tickAnim - 23) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 23) / 5) * (0-(0)));
        }
        else if (tickAnim >= 28 && tickAnim < 50) {
            xx = 9.25 + (((tickAnim - 28) / 22) * (0-(9.25)));
            yy = 0 + (((tickAnim - 28) / 22) * (0-(0)));
            zz = 0 + (((tickAnim - 28) / 22) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tail3, tail3.rotateAngleX + (float) Math.toRadians(xx), tail3.rotateAngleY + (float) Math.toRadians(yy), tail3.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 23) {
            xx = 0 + (((tickAnim - 0) / 23) * (7.25-(0)));
            yy = 0 + (((tickAnim - 0) / 23) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 23) * (0-(0)));
        }
        else if (tickAnim >= 23 && tickAnim < 28) {
            xx = 7.25 + (((tickAnim - 23) / 5) * (7.25-(7.25)));
            yy = 0 + (((tickAnim - 23) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 23) / 5) * (0-(0)));
        }
        else if (tickAnim >= 28 && tickAnim < 50) {
            xx = 7.25 + (((tickAnim - 28) / 22) * (0-(7.25)));
            yy = 0 + (((tickAnim - 28) / 22) * (0-(0)));
            zz = 0 + (((tickAnim - 28) / 22) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tail4, tail4.rotateAngleX + (float) Math.toRadians(xx), tail4.rotateAngleY + (float) Math.toRadians(yy), tail4.rotateAngleZ + (float) Math.toRadians(zz));




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
        this.setRotateAngle(tail5, tail5.rotateAngleX + (float) Math.toRadians(xx), tail5.rotateAngleY + (float) Math.toRadians(yy), tail5.rotateAngleZ + (float) Math.toRadians(zz));




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
        this.setRotateAngle(tail6, tail6.rotateAngleX + (float) Math.toRadians(xx), tail6.rotateAngleY + (float) Math.toRadians(yy), tail6.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 23) {
            xx = 0 + (((tickAnim - 0) / 23) * (-23.75-(0)));
            yy = 0 + (((tickAnim - 0) / 23) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 23) * (0-(0)));
        }
        else if (tickAnim >= 23 && tickAnim < 28) {
            xx = -23.75 + (((tickAnim - 23) / 5) * (-23.75-(-23.75)));
            yy = 0 + (((tickAnim - 23) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 23) / 5) * (0-(0)));
        }
        else if (tickAnim >= 28 && tickAnim < 50) {
            xx = -23.75 + (((tickAnim - 28) / 22) * (0-(-23.75)));
            yy = 0 + (((tickAnim - 28) / 22) * (0-(0)));
            zz = 0 + (((tickAnim - 28) / 22) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightLeg, rightLeg.rotateAngleX + (float) Math.toRadians(xx), rightLeg.rotateAngleY + (float) Math.toRadians(yy), rightLeg.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 23) {
            xx = 0 + (((tickAnim - 0) / 23) * (50.75-(0)));
            yy = 0 + (((tickAnim - 0) / 23) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 23) * (0-(0)));
        }
        else if (tickAnim >= 23 && tickAnim < 28) {
            xx = 50.75 + (((tickAnim - 23) / 5) * (50.75-(50.75)));
            yy = 0 + (((tickAnim - 23) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 23) / 5) * (0-(0)));
        }
        else if (tickAnim >= 28 && tickAnim < 50) {
            xx = 50.75 + (((tickAnim - 28) / 22) * (0-(50.75)));
            yy = 0 + (((tickAnim - 28) / 22) * (0-(0)));
            zz = 0 + (((tickAnim - 28) / 22) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightLeg2, rightLeg2.rotateAngleX + (float) Math.toRadians(xx), rightLeg2.rotateAngleY + (float) Math.toRadians(yy), rightLeg2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 23) {
            xx = 0 + (((tickAnim - 0) / 23) * (-30.25-(0)));
            yy = 0 + (((tickAnim - 0) / 23) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 23) * (0-(0)));
        }
        else if (tickAnim >= 23 && tickAnim < 28) {
            xx = -30.25 + (((tickAnim - 23) / 5) * (-30.25-(-30.25)));
            yy = 0 + (((tickAnim - 23) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 23) / 5) * (0-(0)));
        }
        else if (tickAnim >= 28 && tickAnim < 50) {
            xx = -30.25 + (((tickAnim - 28) / 22) * (0-(-30.25)));
            yy = 0 + (((tickAnim - 28) / 22) * (0-(0)));
            zz = 0 + (((tickAnim - 28) / 22) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightLeg3, rightLeg3.rotateAngleX + (float) Math.toRadians(xx), rightLeg3.rotateAngleY + (float) Math.toRadians(yy), rightLeg3.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 23) {
            xx = 0 + (((tickAnim - 0) / 23) * (20.5-(0)));
            yy = 0 + (((tickAnim - 0) / 23) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 23) * (0-(0)));
        }
        else if (tickAnim >= 23 && tickAnim < 28) {
            xx = 20.5 + (((tickAnim - 23) / 5) * (20.5-(20.5)));
            yy = 0 + (((tickAnim - 23) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 23) / 5) * (0-(0)));
        }
        else if (tickAnim >= 28 && tickAnim < 50) {
            xx = 20.5 + (((tickAnim - 28) / 22) * (0-(20.5)));
            yy = 0 + (((tickAnim - 28) / 22) * (0-(0)));
            zz = 0 + (((tickAnim - 28) / 22) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightLeg4, rightLeg4.rotateAngleX + (float) Math.toRadians(xx), rightLeg4.rotateAngleY + (float) Math.toRadians(yy), rightLeg4.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 23) {
            xx = 0 + (((tickAnim - 0) / 23) * (-23.75-(0)));
            yy = 0 + (((tickAnim - 0) / 23) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 23) * (0-(0)));
        }
        else if (tickAnim >= 23 && tickAnim < 28) {
            xx = -23.75 + (((tickAnim - 23) / 5) * (-23.75-(-23.75)));
            yy = 0 + (((tickAnim - 23) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 23) / 5) * (0-(0)));
        }
        else if (tickAnim >= 28 && tickAnim < 50) {
            xx = -23.75 + (((tickAnim - 28) / 22) * (0-(-23.75)));
            yy = 0 + (((tickAnim - 28) / 22) * (0-(0)));
            zz = 0 + (((tickAnim - 28) / 22) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftLeg, leftLeg.rotateAngleX + (float) Math.toRadians(xx), leftLeg.rotateAngleY + (float) Math.toRadians(yy), leftLeg.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 23) {
            xx = 0 + (((tickAnim - 0) / 23) * (50.75-(0)));
            yy = 0 + (((tickAnim - 0) / 23) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 23) * (0-(0)));
        }
        else if (tickAnim >= 23 && tickAnim < 28) {
            xx = 50.75 + (((tickAnim - 23) / 5) * (50.75-(50.75)));
            yy = 0 + (((tickAnim - 23) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 23) / 5) * (0-(0)));
        }
        else if (tickAnim >= 28 && tickAnim < 50) {
            xx = 50.75 + (((tickAnim - 28) / 22) * (0-(50.75)));
            yy = 0 + (((tickAnim - 28) / 22) * (0-(0)));
            zz = 0 + (((tickAnim - 28) / 22) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftLeg2, leftLeg2.rotateAngleX + (float) Math.toRadians(xx), leftLeg2.rotateAngleY + (float) Math.toRadians(yy), leftLeg2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 23) {
            xx = 0 + (((tickAnim - 0) / 23) * (-30.25-(0)));
            yy = 0 + (((tickAnim - 0) / 23) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 23) * (0-(0)));
        }
        else if (tickAnim >= 23 && tickAnim < 28) {
            xx = -30.25 + (((tickAnim - 23) / 5) * (-30.25-(-30.25)));
            yy = 0 + (((tickAnim - 23) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 23) / 5) * (0-(0)));
        }
        else if (tickAnim >= 28 && tickAnim < 50) {
            xx = -30.25 + (((tickAnim - 28) / 22) * (0-(-30.25)));
            yy = 0 + (((tickAnim - 28) / 22) * (0-(0)));
            zz = 0 + (((tickAnim - 28) / 22) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftLeg3, leftLeg3.rotateAngleX + (float) Math.toRadians(xx), leftLeg3.rotateAngleY + (float) Math.toRadians(yy), leftLeg3.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 23) {
            xx = 0 + (((tickAnim - 0) / 23) * (20.5-(0)));
            yy = 0 + (((tickAnim - 0) / 23) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 23) * (0-(0)));
        }
        else if (tickAnim >= 23 && tickAnim < 28) {
            xx = 20.5 + (((tickAnim - 23) / 5) * (20.5-(20.5)));
            yy = 0 + (((tickAnim - 23) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 23) / 5) * (0-(0)));
        }
        else if (tickAnim >= 28 && tickAnim < 50) {
            xx = 20.5 + (((tickAnim - 28) / 22) * (0-(20.5)));
            yy = 0 + (((tickAnim - 28) / 22) * (0-(0)));
            zz = 0 + (((tickAnim - 28) / 22) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftLeg4, leftLeg4.rotateAngleX + (float) Math.toRadians(xx), leftLeg4.rotateAngleY + (float) Math.toRadians(yy), leftLeg4.rotateAngleZ + (float) Math.toRadians(zz));

    }
    public void animEat(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime, double animTick) {
        EntityPrehistoricFloraSinotyrannus entity = (EntityPrehistoricFloraSinotyrannus) entitylivingbaseIn;
        int animCycle = 20;
        double tickAnim = animTick + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;
     if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 0) / 10) * (11.75-(0)));
            yy = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 20) {
            xx = 11.75 + (((tickAnim - 10) / 10) * (0-(11.75)));
            yy = 0 + (((tickAnim - 10) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 10) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(body2, body2.rotateAngleX + (float) Math.toRadians(xx), body2.rotateAngleY + (float) Math.toRadians(yy), body2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 0) / 10) * (32.75-(0)));
            yy = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 20) {
            xx = 32.75 + (((tickAnim - 10) / 10) * (0-(32.75)));
            yy = 0 + (((tickAnim - 10) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 10) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck, neck.rotateAngleX + (float) Math.toRadians(xx), neck.rotateAngleY + (float) Math.toRadians(yy), neck.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 0) / 10) * (27.75-(0)));
            yy = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 20) {
            xx = 27.75 + (((tickAnim - 10) / 10) * (0-(27.75)));
            yy = 0 + (((tickAnim - 10) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 10) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck2, neck2.rotateAngleX + (float) Math.toRadians(xx), neck2.rotateAngleY + (float) Math.toRadians(yy), neck2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 0) / 10) * (9.25-(0)));
            yy = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 20) {
            xx = 9.25 + (((tickAnim - 10) / 10) * (0-(9.25)));
            yy = 0 + (((tickAnim - 10) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 10) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck3, neck3.rotateAngleX + (float) Math.toRadians(xx), neck3.rotateAngleY + (float) Math.toRadians(yy), neck3.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 4) {
            xx = 0 + (((tickAnim - 0) / 4) * (19.19-(0)));
            yy = 0 + (((tickAnim - 0) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 4) * (0-(0)));
        }
        else if (tickAnim >= 4 && tickAnim < 8) {
            xx = 19.19 + (((tickAnim - 4) / 4) * (-8.56-(19.19)));
            yy = 0 + (((tickAnim - 4) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 4) / 4) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 10) {
            xx = -8.56 + (((tickAnim - 8) / 2) * (-12.75-(-8.56)));
            yy = 0 + (((tickAnim - 8) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 2) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 20) {
            xx = -12.75 + (((tickAnim - 10) / 10) * (0-(-12.75)));
            yy = 0 + (((tickAnim - 10) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 10) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(head, head.rotateAngleX + (float) Math.toRadians(xx), head.rotateAngleY + (float) Math.toRadians(yy), head.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 4) {
            xx = 0 + (((tickAnim - 0) / 4) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 4) * (0-(0)));
        }
        else if (tickAnim >= 4 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 4) / 4) * (31.5-(0)));
            yy = 0 + (((tickAnim - 4) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 4) / 4) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 10) {
            xx = 31.5 + (((tickAnim - 8) / 2) * (0-(31.5)));
            yy = 0 + (((tickAnim - 8) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 2) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(jaw, jaw.rotateAngleX + (float) Math.toRadians(xx), jaw.rotateAngleY + (float) Math.toRadians(yy), jaw.rotateAngleZ + (float) Math.toRadians(zz));

    }
    public void animRoar(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime, double animTick) {
        EntityPrehistoricFloraSinotyrannus entity = (EntityPrehistoricFloraSinotyrannus) entitylivingbaseIn;
        int animCycle = 45;
        double tickAnim = animTick + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;
     if (tickAnim >= 0 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 0) / 20) * (6-(0)));
            yy = 0 + (((tickAnim - 0) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 20) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 30) {
            xx = 6 + (((tickAnim - 20) / 10) * (-1.5-(6)));
            yy = 0 + (((tickAnim - 20) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 10) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 45) {
            xx = -1.5 + (((tickAnim - 30) / 15) * (0-(-1.5)));
            yy = 0 + (((tickAnim - 30) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 30) / 15) * (0-(0)));
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
            zz = 0 + (((tickAnim - 0) / 20) * (-9.7-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 30) {
            xx = 0 + (((tickAnim - 20) / 10) * (0-(0)));
            yy = 0 + (((tickAnim - 20) / 10) * (0-(0)));
            zz = -9.7 + (((tickAnim - 20) / 10) * (-9.7-(-9.7)));
        }
        else if (tickAnim >= 30 && tickAnim < 45) {
            xx = 0 + (((tickAnim - 30) / 15) * (0-(0)));
            yy = 0 + (((tickAnim - 30) / 15) * (0-(0)));
            zz = -9.7 + (((tickAnim - 30) / 15) * (0-(-9.7)));
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
            xx = 0 + (((tickAnim - 0) / 20) * (41.85+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*-55-(0)));
            yy = 0 + (((tickAnim - 0) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 20) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 45) {
            xx = 41.85+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*-55 + (((tickAnim - 20) / 25) * (0-(41.85+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*-55)));
            yy = 0 + (((tickAnim - 20) / 25) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 25) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(body, body.rotateAngleX + (float) Math.toRadians(xx), body.rotateAngleY + (float) Math.toRadians(yy), body.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 0) / 20) * (84.675+Math.sin((Math.PI/180)*(((double)tickAnim/20)*70))*-85-(0)));
            yy = 0 + (((tickAnim - 0) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 20) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 30) {
            xx = 84.675+Math.sin((Math.PI/180)*(((double)tickAnim/20)*70))*-85 + (((tickAnim - 20) / 10) * (-4.75-(84.675+Math.sin((Math.PI/180)*(((double)tickAnim/20)*70))*-85)));
            yy = 0 + (((tickAnim - 20) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 10) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 45) {
            xx = -4.75 + (((tickAnim - 30) / 15) * (0-(-4.75)));
            yy = 0 + (((tickAnim - 30) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 30) / 15) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck, neck.rotateAngleX + (float) Math.toRadians(xx), neck.rotateAngleY + (float) Math.toRadians(yy), neck.rotateAngleZ + (float) Math.toRadians(zz));

        this.neck.rotationPointX = this.neck.rotationPointX + (float)(0);
        this.neck.rotationPointY = this.neck.rotationPointY - (float)(0);
        this.neck.rotationPointZ = this.neck.rotationPointZ + (float)(0);



        if (tickAnim >= 0 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 0) / 20) * (-29.1208+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*85-(0)));
            yy = 0 + (((tickAnim - 0) / 20) * (3.56468-(0)));
            zz = 0 + (((tickAnim - 0) / 20) * (-2.35511-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 45) {
            xx = -29.1208+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*85 + (((tickAnim - 20) / 25) * (0-(-29.1208+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*85)));
            yy = 3.56468 + (((tickAnim - 20) / 25) * (0-(3.56468)));
            zz = -2.35511 + (((tickAnim - 20) / 25) * (0-(-2.35511)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck2, neck2.rotateAngleX + (float) Math.toRadians(xx), neck2.rotateAngleY + (float) Math.toRadians(yy), neck2.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 0) / 20) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 20) * (-1.1-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 45) {
            xx = 0 + (((tickAnim - 20) / 25) * (0-(0)));
            yy = 0 + (((tickAnim - 20) / 25) * (0-(0)));
            zz = -1.1 + (((tickAnim - 20) / 25) * (0-(-1.1)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.neck2.rotationPointX = this.neck2.rotationPointX + (float)(xx);
        this.neck2.rotationPointY = this.neck2.rotationPointY - (float)(yy);
        this.neck2.rotationPointZ = this.neck2.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 0) / 20) * (-83.4927+Math.sin((Math.PI/180)*(((double)tickAnim/20)*80))*85-(0)));
            yy = 0 + (((tickAnim - 0) / 20) * (-19.0702+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*25-(0)));
            zz = 0 + (((tickAnim - 0) / 20) * (-7.40836-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 45) {
            xx = -83.4927+Math.sin((Math.PI/180)*(((double)tickAnim/20)*80))*85 + (((tickAnim - 20) / 25) * (0-(-83.4927+Math.sin((Math.PI/180)*(((double)tickAnim/20)*80))*85)));
            yy = -19.0702+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*25 + (((tickAnim - 20) / 25) * (0-(-19.0702+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*25)));
            zz = -7.40836 + (((tickAnim - 20) / 25) * (0-(-7.40836)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck3, neck3.rotateAngleX + (float) Math.toRadians(xx), neck3.rotateAngleY + (float) Math.toRadians(yy), neck3.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 45) {
            xx = 0 + (((tickAnim - 0) / 45) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 45) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 45) * (0-(0)));
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
            xx = 0 + (((tickAnim - 0) / 20) * (-15.3521143084+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*25-(0)));
            yy = 0 + (((tickAnim - 0) / 20) * (38.8262+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*-55-(0)));
            zz = 0 + (((tickAnim - 0) / 20) * (-3.15088-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 25) {
            xx = -15.3521143084+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*25 + (((tickAnim - 20) / 5) * (6.33+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50-50))*-105-(-15.3521143084+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*25)));
            yy = 38.8262+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*-55 + (((tickAnim - 20) / 5) * (-46.85+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*55-(38.8262+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*-55)));
            zz = -3.15088 + (((tickAnim - 20) / 5) * (0-(-3.15088)));
        }
        else if (tickAnim >= 25 && tickAnim < 30) {
            xx = 6.33+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50-50))*-105 + (((tickAnim - 25) / 5) * (-37.225+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50-50))*50-(6.33+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50-50))*-105)));
            yy = -46.85+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*55 + (((tickAnim - 25) / 5) * (0-(-46.85+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*55)));
            zz = 0 + (((tickAnim - 25) / 5) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 45) {
            xx = -37.225+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50-50))*50 + (((tickAnim - 30) / 15) * (0-(-37.225+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50-50))*50)));
            yy = 0 + (((tickAnim - 30) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 30) / 15) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck4, neck4.rotateAngleX + (float) Math.toRadians(xx), neck4.rotateAngleY + (float) Math.toRadians(yy), neck4.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 45) {
            xx = 0 + (((tickAnim - 0) / 45) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 45) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 45) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.neck4.rotationPointX = this.neck4.rotationPointX + (float)(xx);
        this.neck4.rotationPointY = this.neck4.rotationPointY - (float)(yy);
        this.neck4.rotationPointZ = this.neck4.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 0) / 20) * (-8-(0)));
            yy = 0 + (((tickAnim - 0) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 20) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 25) {
            xx = -8 + (((tickAnim - 20) / 5) * (-13.86-(-8)));
            yy = 0 + (((tickAnim - 20) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 5) * (0-(0)));
        }
        else if (tickAnim >= 25 && tickAnim < 30) {
            xx = -13.86 + (((tickAnim - 25) / 5) * (0.5-(-13.86)));
            yy = 0 + (((tickAnim - 25) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 25) / 5) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 45) {
            xx = 0.5 + (((tickAnim - 30) / 15) * (0-(0.5)));
            yy = 0 + (((tickAnim - 30) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 30) / 15) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(head, head.rotateAngleX + (float) Math.toRadians(xx), head.rotateAngleY + (float) Math.toRadians(yy), head.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 25) {
            xx = 0 + (((tickAnim - 0) / 25) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 25) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 25) * (0-(0)));
        }
        else if (tickAnim >= 25 && tickAnim < 45) {
            xx = 0 + (((tickAnim - 25) / 20) * (0-(0)));
            yy = 0 + (((tickAnim - 25) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 25) / 20) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.head.rotationPointX = this.head.rotationPointX + (float)(xx);
        this.head.rotationPointY = this.head.rotationPointY - (float)(yy);
        this.head.rotationPointZ = this.head.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 0) / 20) * (25.5-(0)));
            yy = 0 + (((tickAnim - 0) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 20) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 25) {
            xx = 25.5 + (((tickAnim - 20) / 5) * (0-(25.5)));
            yy = 0 + (((tickAnim - 20) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 5) * (0-(0)));
        }
        else if (tickAnim >= 25 && tickAnim < 30) {
            xx = 0 + (((tickAnim - 25) / 5) * (0-(0)));
            yy = 0 + (((tickAnim - 25) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 25) / 5) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(jaw, jaw.rotateAngleX + (float) Math.toRadians(xx), jaw.rotateAngleY + (float) Math.toRadians(yy), jaw.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 0) / 20) * (11-(0)));
            yy = 0 + (((tickAnim - 0) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 20) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 25) {
            xx = 11 + (((tickAnim - 20) / 5) * (25.75-(11)));
            yy = 0 + (((tickAnim - 20) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 5) * (0-(0)));
        }
        else if (tickAnim >= 25 && tickAnim < 45) {
            xx = 25.75 + (((tickAnim - 25) / 20) * (0-(25.75)));
            yy = 0 + (((tickAnim - 25) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 25) / 20) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(throat2, throat2.rotateAngleX + (float) Math.toRadians(xx), throat2.rotateAngleY + (float) Math.toRadians(yy), throat2.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 0) / 20) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 20) * (0.2-(0)));
            zz = 0 + (((tickAnim - 0) / 20) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 25) {
            xx = 0 + (((tickAnim - 20) / 5) * (0-(0)));
            yy = 0.2 + (((tickAnim - 20) / 5) * (1.15-(0.2)));
            zz = 0 + (((tickAnim - 20) / 5) * (0.05-(0)));
        }
        else if (tickAnim >= 25 && tickAnim < 30) {
            xx = 0 + (((tickAnim - 25) / 5) * (0-(0)));
            yy = 1.15 + (((tickAnim - 25) / 5) * (0.875-(1.15)));
            zz = 0.05 + (((tickAnim - 25) / 5) * (0.55-(0.05)));
        }
        else if (tickAnim >= 30 && tickAnim < 45) {
            xx = 0 + (((tickAnim - 30) / 15) * (0-(0)));
            yy = 0.875 + (((tickAnim - 30) / 15) * (0-(0.875)));
            zz = 0.55 + (((tickAnim - 30) / 15) * (0-(0.55)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.throat2.rotationPointX = this.throat2.rotationPointX + (float)(xx);
        this.throat2.rotationPointY = this.throat2.rotationPointY - (float)(yy);
        this.throat2.rotationPointZ = this.throat2.rotationPointZ + (float)(zz);


        if (tickAnim >= 20 && tickAnim < 25) {
            xx = 1 + (((tickAnim - 20) / 5) * (1-(1)));
            yy = 1 + (((tickAnim - 20) / 5) * (1.15-(1)));
            zz = 1 + (((tickAnim - 20) / 5) * (1.1813-(1)));
        }
        else if (tickAnim >= 25 && tickAnim < 30) {
            xx = 1 + (((tickAnim - 25) / 5) * (1-(1)));
            yy = 1.15 + (((tickAnim - 25) / 5) * (1.1-(1.15)));
            zz = 1.1813 + (((tickAnim - 25) / 5) * (1.3625-(1.1813)));
        }
        else {
            xx = 1;
            yy = 1;
            zz = 1;
        }
        this.throat2.setScale((float)xx, (float)yy, (float)zz);




        if (tickAnim >= 0 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 0) / 20) * (-29-(0)));
            yy = 0 + (((tickAnim - 0) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 20) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 25) {
            xx = -29 + (((tickAnim - 20) / 5) * (-16.5-(-29)));
            yy = 0 + (((tickAnim - 20) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 5) * (0-(0)));
        }
        else if (tickAnim >= 25 && tickAnim < 45) {
            xx = -16.5 + (((tickAnim - 25) / 20) * (0-(-16.5)));
            yy = 0 + (((tickAnim - 25) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 25) / 20) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(throat3, throat3.rotateAngleX + (float) Math.toRadians(xx), throat3.rotateAngleY + (float) Math.toRadians(yy), throat3.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 0) / 20) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 20) * (0.125-(0)));
            zz = 0 + (((tickAnim - 0) / 20) * (1.8-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 25) {
            xx = 0 + (((tickAnim - 20) / 5) * (0-(0)));
            yy = 0.125 + (((tickAnim - 20) / 5) * (0.205-(0.125)));
            zz = 1.8 + (((tickAnim - 20) / 5) * (1.05-(1.8)));
        }
        else if (tickAnim >= 25 && tickAnim < 45) {
            xx = 0 + (((tickAnim - 25) / 20) * (0-(0)));
            yy = 0.205 + (((tickAnim - 25) / 20) * (0-(0.205)));
            zz = 1.05 + (((tickAnim - 25) / 20) * (0-(1.05)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.throat3.rotationPointX = this.throat3.rotationPointX + (float)(xx);
        this.throat3.rotationPointY = this.throat3.rotationPointY - (float)(yy);
        this.throat3.rotationPointZ = this.throat3.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 0) / 20) * (39.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1220-205))*15-(0)));
            yy = 0 + (((tickAnim - 0) / 20) * (0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1220-205))*15-(0)));
            zz = 0 + (((tickAnim - 0) / 20) * (0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1220-205))*15-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 30) {
            xx = 39.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1220-205))*15 + (((tickAnim - 20) / 10) * (39.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1220-205))*15-(39.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1220-205))*15)));
            yy = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1220-205))*15 + (((tickAnim - 20) / 10) * (0-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1220-205))*15)));
            zz = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1220-205))*15 + (((tickAnim - 20) / 10) * (0-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1220-205))*15)));
        }
        else if (tickAnim >= 30 && tickAnim < 45) {
            xx = 39.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1220-205))*15 + (((tickAnim - 30) / 15) * (0-(39.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1220-205))*15)));
            yy = 0 + (((tickAnim - 30) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 30) / 15) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neckfeathers2, neckfeathers2.rotateAngleX + (float) Math.toRadians(xx), neckfeathers2.rotateAngleY + (float) Math.toRadians(yy), neckfeathers2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 0) / 20) * (27.25+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1220-250))*15-(0)));
            yy = 0 + (((tickAnim - 0) / 20) * (0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1220-250))*15-(0)));
            zz = 0 + (((tickAnim - 0) / 20) * (0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1220-250))*15-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 30) {
            xx = 27.25+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1220-250))*15 + (((tickAnim - 20) / 10) * (27.25+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1220-250))*15-(27.25+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1220-250))*15)));
            yy = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1220-250))*15 + (((tickAnim - 20) / 10) * (0-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1220-250))*15)));
            zz = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1220-250))*15 + (((tickAnim - 20) / 10) * (0-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1220-250))*15)));
        }
        else if (tickAnim >= 30 && tickAnim < 45) {
            xx = 27.25+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1220-250))*15 + (((tickAnim - 30) / 15) * (0-(27.25+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1220-250))*15)));
            yy = 0 + (((tickAnim - 30) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 30) / 15) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neckfeathers3, neckfeathers3.rotateAngleX + (float) Math.toRadians(xx), neckfeathers3.rotateAngleY + (float) Math.toRadians(yy), neckfeathers3.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 0) / 20) * (44+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1220-150))*15-(0)));
            yy = 0 + (((tickAnim - 0) / 20) * (0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1220-150))*15-(0)));
            zz = 0 + (((tickAnim - 0) / 20) * (0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1220-150))*15-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 30) {
            xx = 44+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1220-150))*15 + (((tickAnim - 20) / 10) * (44+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1220-150))*15-(44+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1220-150))*15)));
            yy = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1220-150))*15 + (((tickAnim - 20) / 10) * (0-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1220-150))*15)));
            zz = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1220-150))*15 + (((tickAnim - 20) / 10) * (0-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1220-150))*15)));
        }
        else if (tickAnim >= 30 && tickAnim < 45) {
            xx = 44+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1220-150))*15 + (((tickAnim - 30) / 15) * (0-(44+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1220-150))*15)));
            yy = 0 + (((tickAnim - 30) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 30) / 15) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neckfeathers, neckfeathers.rotateAngleX + (float) Math.toRadians(xx), neckfeathers.rotateAngleY + (float) Math.toRadians(yy), neckfeathers.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 0) / 20) * (0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1220))*5-(0)));
            yy = 0 + (((tickAnim - 0) / 20) * (-49+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1220))*5-(0)));
            zz = 0 + (((tickAnim - 0) / 20) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 30) {
            xx = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1220))*5 + (((tickAnim - 20) / 10) * (0-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1220))*5)));
            yy = -49+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1220))*5 + (((tickAnim - 20) / 10) * (0-(-49+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1220))*5)));
            zz = 0 + (((tickAnim - 20) / 10) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 45) {
            xx = 0 + (((tickAnim - 30) / 15) * (0-(0)));
            yy = 0 + (((tickAnim - 30) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 30) / 15) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftarm, leftarm.rotateAngleX + (float) Math.toRadians(xx), leftarm.rotateAngleY + (float) Math.toRadians(yy), leftarm.rotateAngleZ + (float) Math.toRadians(zz));



        this.setRotateAngle(leftarm2, leftarm2.rotateAngleX + (float) Math.toRadians(0), leftarm2.rotateAngleY + (float) Math.toRadians(0), leftarm2.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(leftHand, leftHand.rotateAngleX + (float) Math.toRadians(0), leftHand.rotateAngleY + (float) Math.toRadians(0), leftHand.rotateAngleZ + (float) Math.toRadians(0));



        if (tickAnim >= 0 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 0) / 20) * (0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1220))*5-(0)));
            yy = 0 + (((tickAnim - 0) / 20) * (49+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1220))*5-(0)));
            zz = 0 + (((tickAnim - 0) / 20) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 30) {
            xx = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1220))*5 + (((tickAnim - 20) / 10) * (0-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1220))*5)));
            yy = 49+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1220))*5 + (((tickAnim - 20) / 10) * (0-(49+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1220))*5)));
            zz = 0 + (((tickAnim - 20) / 10) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 45) {
            xx = 0 + (((tickAnim - 30) / 15) * (0-(0)));
            yy = 0 + (((tickAnim - 30) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 30) / 15) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightarm, rightarm.rotateAngleX + (float) Math.toRadians(xx), rightarm.rotateAngleY + (float) Math.toRadians(yy), rightarm.rotateAngleZ + (float) Math.toRadians(zz));



        this.setRotateAngle(rightarm2, rightarm2.rotateAngleX + (float) Math.toRadians(0), rightarm2.rotateAngleY + (float) Math.toRadians(0), rightarm2.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(rightHand, rightHand.rotateAngleX + (float) Math.toRadians(0), rightHand.rotateAngleY + (float) Math.toRadians(0), rightHand.rotateAngleZ + (float) Math.toRadians(0));



        if (tickAnim >= 0 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 0) / 20) * (9.53929-(0)));
            yy = 0 + (((tickAnim - 0) / 20) * (-31.6222+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*50-(0)));
            zz = 0 + (((tickAnim - 0) / 20) * (0.86887-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 35) {
            xx = 9.53929 + (((tickAnim - 20) / 15) * (8.75-(9.53929)));
            yy = -31.6222+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*50 + (((tickAnim - 20) / 15) * (-40.25+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*50-(-31.6222+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*50)));
            zz = 0.86887 + (((tickAnim - 20) / 15) * (0-(0.86887)));
        }
        else if (tickAnim >= 35 && tickAnim < 45) {
            xx = 8.75 + (((tickAnim - 35) / 10) * (0-(8.75)));
            yy = -40.25+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*50 + (((tickAnim - 35) / 10) * (0-(-40.25+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*50)));
            zz = 0 + (((tickAnim - 35) / 10) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tail, tail.rotateAngleX + (float) Math.toRadians(xx), tail.rotateAngleY + (float) Math.toRadians(yy), tail.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 0) / 20) * (10.30843-(0)));
            yy = 0 + (((tickAnim - 0) / 20) * (-41.624+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50+50))*50-(0)));
            zz = 0 + (((tickAnim - 0) / 20) * (0.68673-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 35) {
            xx = 10.30843 + (((tickAnim - 20) / 15) * (0-(10.30843)));
            yy = -41.624+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50+50))*50 + (((tickAnim - 20) / 15) * (-35.675+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50+50))*50-(-41.624+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50+50))*50)));
            zz = 0.68673 + (((tickAnim - 20) / 15) * (0-(0.68673)));
        }
        else if (tickAnim >= 35 && tickAnim < 45) {
            xx = 0 + (((tickAnim - 35) / 10) * (0-(0)));
            yy = -35.675+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50+50))*50 + (((tickAnim - 35) / 10) * (0-(-35.675+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50+50))*50)));
            zz = 0 + (((tickAnim - 35) / 10) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tail2, tail2.rotateAngleX + (float) Math.toRadians(xx), tail2.rotateAngleY + (float) Math.toRadians(yy), tail2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 0) / 20) * (-2.88029-(0)));
            yy = 0 + (((tickAnim - 0) / 20) * (0.0214+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50-50))*50-(0)));
            zz = 0 + (((tickAnim - 0) / 20) * (-3.84307-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 35) {
            xx = -2.88029 + (((tickAnim - 20) / 15) * (0-(-2.88029)));
            yy = 0.0214+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50-50))*50 + (((tickAnim - 20) / 15) * (-3+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50+100))*20-(0.0214+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50-50))*50)));
            zz = -3.84307 + (((tickAnim - 20) / 15) * (0-(-3.84307)));
        }
        else if (tickAnim >= 35 && tickAnim < 45) {
            xx = 0 + (((tickAnim - 35) / 10) * (0-(0)));
            yy = -3+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50+100))*20 + (((tickAnim - 35) / 10) * (0-(-3+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50+100))*20)));
            zz = 0 + (((tickAnim - 35) / 10) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tail3, tail3.rotateAngleX + (float) Math.toRadians(xx), tail3.rotateAngleY + (float) Math.toRadians(yy), tail3.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 0) / 20) * (4.68276-(0)));
            yy = 0 + (((tickAnim - 0) / 20) * (-45.7815+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50-150))*-50-(0)));
            zz = 0 + (((tickAnim - 0) / 20) * (-3.25876-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 35) {
            xx = 4.68276 + (((tickAnim - 20) / 15) * (0-(4.68276)));
            yy = -45.7815+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50-150))*-50 + (((tickAnim - 20) / 15) * (-44.175+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50-150))*-50-(-45.7815+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50-150))*-50)));
            zz = -3.25876 + (((tickAnim - 20) / 15) * (0-(-3.25876)));
        }
        else if (tickAnim >= 35 && tickAnim < 45) {
            xx = 0 + (((tickAnim - 35) / 10) * (0-(0)));
            yy = -44.175+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50-150))*-50 + (((tickAnim - 35) / 10) * (0-(-44.175+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50-150))*-50)));
            zz = 0 + (((tickAnim - 35) / 10) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tail4, tail4.rotateAngleX + (float) Math.toRadians(xx), tail4.rotateAngleY + (float) Math.toRadians(yy), tail4.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 0) / 20) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 20) * (-57.6+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50-180))*-50-(0)));
            zz = 0 + (((tickAnim - 0) / 20) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 35) {
            xx = 0 + (((tickAnim - 20) / 15) * (0-(0)));
            yy = -57.6+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50-180))*-50 + (((tickAnim - 20) / 15) * (7.025+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50-250))*-20-(-57.6+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50-180))*-50)));
            zz = 0 + (((tickAnim - 20) / 15) * (0-(0)));
        }
        else if (tickAnim >= 35 && tickAnim < 45) {
            xx = 0 + (((tickAnim - 35) / 10) * (0-(0)));
            yy = 7.025+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50-250))*-20 + (((tickAnim - 35) / 10) * (0-(7.025+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50-250))*-20)));
            zz = 0 + (((tickAnim - 35) / 10) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tail5, tail5.rotateAngleX + (float) Math.toRadians(xx), tail5.rotateAngleY + (float) Math.toRadians(yy), tail5.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 0) / 20) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 20) * (8.45+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50-250))*-50-(0)));
            zz = 0 + (((tickAnim - 0) / 20) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 35) {
            xx = 0 + (((tickAnim - 20) / 15) * (0-(0)));
            yy = 8.45+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50-250))*-50 + (((tickAnim - 20) / 15) * (81.35+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50-150))*50-(8.45+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50-250))*-50)));
            zz = 0 + (((tickAnim - 20) / 15) * (0-(0)));
        }
        else if (tickAnim >= 35 && tickAnim < 45) {
            xx = 0 + (((tickAnim - 35) / 10) * (0-(0)));
            yy = 81.35+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50-150))*50 + (((tickAnim - 35) / 10) * (0-(81.35+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50-150))*50)));
            zz = 0 + (((tickAnim - 35) / 10) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tail6, tail6.rotateAngleX + (float) Math.toRadians(xx), tail6.rotateAngleY + (float) Math.toRadians(yy), tail6.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 0) / 10) * (-15.5-(0)));
            yy = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 20) {
            xx = -15.5 + (((tickAnim - 10) / 10) * (-24-(-15.5)));
            yy = 0 + (((tickAnim - 10) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 10) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 30) {
            xx = -24 + (((tickAnim - 20) / 10) * (-16.75-(-24)));
            yy = 0 + (((tickAnim - 20) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 10) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 45) {
            xx = -16.75 + (((tickAnim - 30) / 15) * (0-(-16.75)));
            yy = 0 + (((tickAnim - 30) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 30) / 15) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightLeg, rightLeg.rotateAngleX + (float) Math.toRadians(xx), rightLeg.rotateAngleY + (float) Math.toRadians(yy), rightLeg.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 0) / 10) * (23.13-(0)));
            yy = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 20) {
            xx = 23.13 + (((tickAnim - 10) / 10) * (-7.25-(23.13)));
            yy = 0 + (((tickAnim - 10) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 10) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 30) {
            xx = -7.25 + (((tickAnim - 20) / 10) * (-7.25-(-7.25)));
            yy = 0 + (((tickAnim - 20) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 10) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 38) {
            xx = -7.25 + (((tickAnim - 30) / 8) * (42.13-(-7.25)));
            yy = 0 + (((tickAnim - 30) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 30) / 8) * (0-(0)));
        }
        else if (tickAnim >= 38 && tickAnim < 45) {
            xx = 42.13 + (((tickAnim - 38) / 7) * (0-(42.13)));
            yy = 0 + (((tickAnim - 38) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 38) / 7) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightLeg2, rightLeg2.rotateAngleX + (float) Math.toRadians(xx), rightLeg2.rotateAngleY + (float) Math.toRadians(yy), rightLeg2.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 0) / 20) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 20) * (-0.825-(0)));
            zz = 0 + (((tickAnim - 0) / 20) * (0.2-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 30) {
            xx = 0 + (((tickAnim - 20) / 10) * (0-(0)));
            yy = -0.825 + (((tickAnim - 20) / 10) * (-0.825-(-0.825)));
            zz = 0.2 + (((tickAnim - 20) / 10) * (0.2-(0.2)));
        }
        else if (tickAnim >= 30 && tickAnim < 45) {
            xx = 0 + (((tickAnim - 30) / 15) * (0-(0)));
            yy = -0.825 + (((tickAnim - 30) / 15) * (0-(-0.825)));
            zz = 0.2 + (((tickAnim - 30) / 15) * (0-(0.2)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.rightLeg2.rotationPointX = this.rightLeg2.rotationPointX + (float)(xx);
        this.rightLeg2.rotationPointY = this.rightLeg2.rotationPointY - (float)(yy);
        this.rightLeg2.rotationPointZ = this.rightLeg2.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 0) / 10) * (-44.87-(0)));
            yy = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 15) {
            xx = -44.87 + (((tickAnim - 10) / 5) * (-44.87-(-44.87)));
            yy = 0 + (((tickAnim - 10) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 5) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 20) {
            xx = -44.87 + (((tickAnim - 15) / 5) * (7.25-(-44.87)));
            yy = 0 + (((tickAnim - 15) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 5) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 30) {
            xx = 7.25 + (((tickAnim - 20) / 10) * (7.25-(7.25)));
            yy = 0 + (((tickAnim - 20) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 10) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 38) {
            xx = 7.25 + (((tickAnim - 30) / 8) * (-50.87-(7.25)));
            yy = 0 + (((tickAnim - 30) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 30) / 8) * (0-(0)));
        }
        else if (tickAnim >= 38 && tickAnim < 45) {
            xx = -50.87 + (((tickAnim - 38) / 7) * (0-(-50.87)));
            yy = 0 + (((tickAnim - 38) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 38) / 7) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightLeg3, rightLeg3.rotateAngleX + (float) Math.toRadians(xx), rightLeg3.rotateAngleY + (float) Math.toRadians(yy), rightLeg3.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (1.15-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 10) / 5) * (0-(0)));
            yy = 0 + (((tickAnim - 10) / 5) * (0-(0)));
            zz = 1.15 + (((tickAnim - 10) / 5) * (1.15-(1.15)));
        }
        else if (tickAnim >= 15 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 15) / 5) * (0-(0)));
            yy = 0 + (((tickAnim - 15) / 5) * (0-(0)));
            zz = 1.15 + (((tickAnim - 15) / 5) * (0-(1.15)));
        }
        else if (tickAnim >= 20 && tickAnim < 30) {
            xx = 0 + (((tickAnim - 20) / 10) * (0-(0)));
            yy = 0 + (((tickAnim - 20) / 10) * (-0.2-(0)));
            zz = 0 + (((tickAnim - 20) / 10) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 38) {
            xx = 0 + (((tickAnim - 30) / 8) * (0-(0)));
            yy = -0.2 + (((tickAnim - 30) / 8) * (-0.1-(-0.2)));
            zz = 0 + (((tickAnim - 30) / 8) * (1.325-(0)));
        }
        else if (tickAnim >= 38 && tickAnim < 45) {
            xx = 0 + (((tickAnim - 38) / 7) * (0-(0)));
            yy = -0.1 + (((tickAnim - 38) / 7) * (0-(-0.1)));
            zz = 1.325 + (((tickAnim - 38) / 7) * (0-(1.325)));
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
            xx = 0 + (((tickAnim - 0) / 15) * (89.5-(0)));
            yy = 0 + (((tickAnim - 0) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 15) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 20) {
            xx = 89.5 + (((tickAnim - 15) / 5) * (17.75-(89.5)));
            yy = 0 + (((tickAnim - 15) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 5) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 30) {
            xx = 17.75 + (((tickAnim - 20) / 10) * (17.75-(17.75)));
            yy = 0 + (((tickAnim - 20) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 10) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 38) {
            xx = 17.75 + (((tickAnim - 30) / 8) * (98.25-(17.75)));
            yy = 0 + (((tickAnim - 30) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 30) / 8) * (0-(0)));
        }
        else if (tickAnim >= 38 && tickAnim < 45) {
            xx = 98.25 + (((tickAnim - 38) / 7) * (0-(98.25)));
            yy = 0 + (((tickAnim - 38) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 38) / 7) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightLeg4, rightLeg4.rotateAngleX + (float) Math.toRadians(xx), rightLeg4.rotateAngleY + (float) Math.toRadians(yy), rightLeg4.rotateAngleZ + (float) Math.toRadians(zz));



        this.setRotateAngle(rightLeg5, rightLeg5.rotateAngleX + (float) Math.toRadians(0), rightLeg5.rotateAngleY + (float) Math.toRadians(0), rightLeg5.rotateAngleZ + (float) Math.toRadians(0));
        this.rightLeg5.rotationPointX = this.rightLeg5.rotationPointX + (float)(0);
        this.rightLeg5.rotationPointY = this.rightLeg5.rotationPointY - (float)(0);
        this.rightLeg5.rotationPointZ = this.rightLeg5.rotationPointZ + (float)(0);



        if (tickAnim >= 0 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 0) / 20) * (12-(0)));
            yy = 0 + (((tickAnim - 0) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 20) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 30) {
            xx = 12 + (((tickAnim - 20) / 10) * (20-(12)));
            yy = 0 + (((tickAnim - 20) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 10) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 45) {
            xx = 20 + (((tickAnim - 30) / 15) * (0-(20)));
            yy = 0 + (((tickAnim - 30) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 30) / 15) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftLeg, leftLeg.rotateAngleX + (float) Math.toRadians(xx), leftLeg.rotateAngleY + (float) Math.toRadians(yy), leftLeg.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 30) {
            xx = 0 + (((tickAnim - 0) / 30) * (-1.25-(0)));
            yy = 0 + (((tickAnim - 0) / 30) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 30) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 45) {
            xx = -1.25 + (((tickAnim - 30) / 15) * (0-(-1.25)));
            yy = 0 + (((tickAnim - 30) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 30) / 15) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftLeg2, leftLeg2.rotateAngleX + (float) Math.toRadians(xx), leftLeg2.rotateAngleY + (float) Math.toRadians(yy), leftLeg2.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 0) / 20) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 20) * (-0.825-(0)));
            zz = 0 + (((tickAnim - 0) / 20) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 30) {
            xx = 0 + (((tickAnim - 20) / 10) * (0-(0)));
            yy = -0.825 + (((tickAnim - 20) / 10) * (-0.825-(-0.825)));
            zz = 0 + (((tickAnim - 20) / 10) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 45) {
            xx = 0 + (((tickAnim - 30) / 15) * (0-(0)));
            yy = -0.825 + (((tickAnim - 30) / 15) * (0-(-0.825)));
            zz = 0 + (((tickAnim - 30) / 15) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.leftLeg2.rotationPointX = this.leftLeg2.rotationPointX + (float)(xx);
        this.leftLeg2.rotationPointY = this.leftLeg2.rotationPointY - (float)(yy);
        this.leftLeg2.rotationPointZ = this.leftLeg2.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 45) {
            xx = 0 + (((tickAnim - 0) / 45) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 45) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 45) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftLeg3, leftLeg3.rotateAngleX + (float) Math.toRadians(xx), leftLeg3.rotateAngleY + (float) Math.toRadians(yy), leftLeg3.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 0) / 20) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 20) * (-0.275-(0)));
            zz = 0 + (((tickAnim - 0) / 20) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 30) {
            xx = 0 + (((tickAnim - 20) / 10) * (0-(0)));
            yy = -0.275 + (((tickAnim - 20) / 10) * (-0.275-(-0.275)));
            zz = 0 + (((tickAnim - 20) / 10) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 45) {
            xx = 0 + (((tickAnim - 30) / 15) * (0-(0)));
            yy = -0.275 + (((tickAnim - 30) / 15) * (0-(-0.275)));
            zz = 0 + (((tickAnim - 30) / 15) * (0-(0)));
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
            xx = 0 + (((tickAnim - 0) / 20) * (-18-(0)));
            yy = 0 + (((tickAnim - 0) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 20) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 30) {
            xx = -18 + (((tickAnim - 20) / 10) * (-18-(-18)));
            yy = 0 + (((tickAnim - 20) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 10) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 45) {
            xx = -18 + (((tickAnim - 30) / 15) * (0-(-18)));
            yy = 0 + (((tickAnim - 30) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 30) / 15) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftLeg4, leftLeg4.rotateAngleX + (float) Math.toRadians(xx), leftLeg4.rotateAngleY + (float) Math.toRadians(yy), leftLeg4.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 10) / 10) * (0-(0)));
            yy = 0 + (((tickAnim - 10) / 10) * (-0.9-(0)));
            zz = 0 + (((tickAnim - 10) / 10) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 30) {
            xx = 0 + (((tickAnim - 20) / 10) * (0-(0)));
            yy = -0.9 + (((tickAnim - 20) / 10) * (-0.9-(-0.9)));
            zz = 0 + (((tickAnim - 20) / 10) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 45) {
            xx = 0 + (((tickAnim - 30) / 15) * (0-(0)));
            yy = -0.9 + (((tickAnim - 30) / 15) * (0-(-0.9)));
            zz = 0 + (((tickAnim - 30) / 15) * (0-(0)));
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
    public void animDisplay(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime, double animTick) {
        EntityPrehistoricFloraSinotyrannus entity = (EntityPrehistoricFloraSinotyrannus) entitylivingbaseIn;
        int animCycle = 220;
        double tickAnim = animTick + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;
     if (tickAnim >= 0 && tickAnim < 40) {
            xx = 0 + (((tickAnim - 0) / 40) * (6.5-(0)));
            yy = 0 + (((tickAnim - 0) / 40) * (-5.5-(0)));
            zz = 0 + (((tickAnim - 0) / 40) * (0-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 88) {
            xx = 6.5 + (((tickAnim - 40) / 48) * (-6.25-(6.5)));
            yy = -5.5 + (((tickAnim - 40) / 48) * (-5.5-(-5.5)));
            zz = 0 + (((tickAnim - 40) / 48) * (0-(0)));
        }
        else if (tickAnim >= 88 && tickAnim < 135) {
            xx = -6.25 + (((tickAnim - 88) / 47) * (6.5-(-6.25)));
            yy = -5.5 + (((tickAnim - 88) / 47) * (5.5-(-5.5)));
            zz = 0 + (((tickAnim - 88) / 47) * (0-(0)));
        }
        else if (tickAnim >= 135 && tickAnim < 183) {
            xx = 6.5 + (((tickAnim - 135) / 48) * (-6.25-(6.5)));
            yy = 5.5 + (((tickAnim - 135) / 48) * (5.5-(5.5)));
            zz = 0 + (((tickAnim - 135) / 48) * (0-(0)));
        }
        else if (tickAnim >= 183 && tickAnim < 220) {
            xx = -6.25 + (((tickAnim - 183) / 37) * (0-(-6.25)));
            yy = 5.5 + (((tickAnim - 183) / 37) * (0-(5.5)));
            zz = 0 + (((tickAnim - 183) / 37) * (0-(0)));
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



        if (tickAnim >= 0 && tickAnim < 40) {
            xx = 0 + (((tickAnim - 0) / 40) * (-4.35+Math.sin((Math.PI/180)*(((double)tickAnim/20)*20-50))*-20-(0)));
            yy = 0 + (((tickAnim - 0) / 40) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 40) * (0-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 88) {
            xx = -4.35+Math.sin((Math.PI/180)*(((double)tickAnim/20)*20-50))*-20 + (((tickAnim - 40) / 48) * (-11-(-4.35+Math.sin((Math.PI/180)*(((double)tickAnim/20)*20-50))*-20)));
            yy = 0 + (((tickAnim - 40) / 48) * (0-(0)));
            zz = 0 + (((tickAnim - 40) / 48) * (0-(0)));
        }
        else if (tickAnim >= 88 && tickAnim < 135) {
            xx = -11 + (((tickAnim - 88) / 47) * (-4.35+Math.sin((Math.PI/180)*(((double)tickAnim/20)*20-50))*20-(-11)));
            yy = 0 + (((tickAnim - 88) / 47) * (0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*20-50))*2-(0)));
            zz = 0 + (((tickAnim - 88) / 47) * (0-(0)));
        }
        else if (tickAnim >= 135 && tickAnim < 183) {
            xx = -4.35+Math.sin((Math.PI/180)*(((double)tickAnim/20)*20-50))*20 + (((tickAnim - 135) / 48) * (-11-(-4.35+Math.sin((Math.PI/180)*(((double)tickAnim/20)*20-50))*20)));
            yy = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*20-50))*2 + (((tickAnim - 135) / 48) * (0-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*20-50))*2)));
            zz = 0 + (((tickAnim - 135) / 48) * (0-(0)));
        }
        else if (tickAnim >= 183 && tickAnim < 220) {
            xx = -11 + (((tickAnim - 183) / 37) * (0-(-11)));
            yy = 0 + (((tickAnim - 183) / 37) * (0-(0)));
            zz = 0 + (((tickAnim - 183) / 37) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(body, body.rotateAngleX + (float) Math.toRadians(xx), body.rotateAngleY + (float) Math.toRadians(yy), body.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 40) {
            xx = 0 + (((tickAnim - 0) / 40) * (18.975+Math.sin((Math.PI/180)*(((double)tickAnim/20)*20-30))*-50-(0)));
            yy = 0 + (((tickAnim - 0) / 40) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 40) * (0-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 88) {
            xx = 18.975+Math.sin((Math.PI/180)*(((double)tickAnim/20)*20-30))*-50 + (((tickAnim - 40) / 48) * (-11.5-(18.975+Math.sin((Math.PI/180)*(((double)tickAnim/20)*20-30))*-50)));
            yy = 0 + (((tickAnim - 40) / 48) * (0-(0)));
            zz = 0 + (((tickAnim - 40) / 48) * (0-(0)));
        }
        else if (tickAnim >= 88 && tickAnim < 135) {
            xx = -11.5 + (((tickAnim - 88) / 47) * (-39.025+Math.sin((Math.PI/180)*(((double)tickAnim/20)*20-30))*50-(-11.5)));
            yy = 0 + (((tickAnim - 88) / 47) * (0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*20-30))*2-(0)));
            zz = 0 + (((tickAnim - 88) / 47) * (0-(0)));
        }
        else if (tickAnim >= 135 && tickAnim < 183) {
            xx = -39.025+Math.sin((Math.PI/180)*(((double)tickAnim/20)*20-30))*50 + (((tickAnim - 135) / 48) * (-11.5-(-39.025+Math.sin((Math.PI/180)*(((double)tickAnim/20)*20-30))*50)));
            yy = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*20-30))*2 + (((tickAnim - 135) / 48) * (0-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*20-30))*2)));
            zz = 0 + (((tickAnim - 135) / 48) * (0-(0)));
        }
        else if (tickAnim >= 183 && tickAnim < 220) {
            xx = -11.5 + (((tickAnim - 183) / 37) * (0-(-11.5)));
            yy = 0 + (((tickAnim - 183) / 37) * (0-(0)));
            zz = 0 + (((tickAnim - 183) / 37) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(body2, body2.rotateAngleX + (float) Math.toRadians(xx), body2.rotateAngleY + (float) Math.toRadians(yy), body2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 40) {
            xx = 0 + (((tickAnim - 0) / 40) * (35.075+Math.sin((Math.PI/180)*(((double)tickAnim/20)*30-10))*-50-(0)));
            yy = 0 + (((tickAnim - 0) / 40) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 40) * (0-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 88) {
            xx = 35.075+Math.sin((Math.PI/180)*(((double)tickAnim/20)*30-10))*-50 + (((tickAnim - 40) / 48) * (32.7-(35.075+Math.sin((Math.PI/180)*(((double)tickAnim/20)*30-10))*-50)));
            yy = 0 + (((tickAnim - 40) / 48) * (0-(0)));
            zz = 0 + (((tickAnim - 40) / 48) * (0-(0)));
        }
        else if (tickAnim >= 88 && tickAnim < 135) {
            xx = 32.7 + (((tickAnim - 88) / 47) * (15.05+Math.sin((Math.PI/180)*(((double)tickAnim/20)*30-10))*50-(32.7)));
            yy = 0 + (((tickAnim - 88) / 47) * (0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*30-10))*5-(0)));
            zz = 0 + (((tickAnim - 88) / 47) * (0-(0)));
        }
        else if (tickAnim >= 135 && tickAnim < 183) {
            xx = 15.05+Math.sin((Math.PI/180)*(((double)tickAnim/20)*30-10))*50 + (((tickAnim - 135) / 48) * (0-(15.05+Math.sin((Math.PI/180)*(((double)tickAnim/20)*30-10))*50)));
            yy = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*30-10))*5 + (((tickAnim - 135) / 48) * (0-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*30-10))*5)));
            zz = 0 + (((tickAnim - 135) / 48) * (0-(0)));
        }
        else if (tickAnim >= 183 && tickAnim < 220) {
            xx = 0 + (((tickAnim - 183) / 37) * (0-(0)));
            yy = 0 + (((tickAnim - 183) / 37) * (0-(0)));
            zz = 0 + (((tickAnim - 183) / 37) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck, neck.rotateAngleX + (float) Math.toRadians(xx), neck.rotateAngleY + (float) Math.toRadians(yy), neck.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 40) {
            xx = 0 + (((tickAnim - 0) / 40) * (41.125+Math.sin((Math.PI/180)*(((double)tickAnim/20)*30+20))*-50-(0)));
            yy = 0 + (((tickAnim - 0) / 40) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 40) * (0-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 88) {
            xx = 41.125+Math.sin((Math.PI/180)*(((double)tickAnim/20)*30+20))*-50 + (((tickAnim - 40) / 48) * (-7.25-(41.125+Math.sin((Math.PI/180)*(((double)tickAnim/20)*30+20))*-50)));
            yy = 0 + (((tickAnim - 40) / 48) * (0-(0)));
            zz = 0 + (((tickAnim - 40) / 48) * (0-(0)));
        }
        else if (tickAnim >= 88 && tickAnim < 135) {
            xx = -7.25 + (((tickAnim - 88) / 47) * (41.125+Math.sin((Math.PI/180)*(((double)tickAnim/20)*30+20))*50-(-7.25)));
            yy = 0 + (((tickAnim - 88) / 47) * (0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*30+20))*5-(0)));
            zz = 0 + (((tickAnim - 88) / 47) * (0-(0)));
        }
        else if (tickAnim >= 135 && tickAnim < 183) {
            xx = 41.125+Math.sin((Math.PI/180)*(((double)tickAnim/20)*30+20))*50 + (((tickAnim - 135) / 48) * (41.125+Math.sin((Math.PI/180)*(((double)tickAnim/20)*30+20))*50-(41.125+Math.sin((Math.PI/180)*(((double)tickAnim/20)*30+20))*50)));
            yy = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*30+20))*5 + (((tickAnim - 135) / 48) * (0-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*30+20))*5)));
            zz = 0 + (((tickAnim - 135) / 48) * (0-(0)));
        }
        else if (tickAnim >= 183 && tickAnim < 220) {
            xx = 41.125+Math.sin((Math.PI/180)*(((double)tickAnim/20)*30+20))*50 + (((tickAnim - 183) / 37) * (0-(41.125+Math.sin((Math.PI/180)*(((double)tickAnim/20)*30+20))*50)));
            yy = 0 + (((tickAnim - 183) / 37) * (0-(0)));
            zz = 0 + (((tickAnim - 183) / 37) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck2, neck2.rotateAngleX + (float) Math.toRadians(xx), neck2.rotateAngleY + (float) Math.toRadians(yy), neck2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 40) {
            xx = 0 + (((tickAnim - 0) / 40) * (-28.475+Math.sin((Math.PI/180)*(((double)tickAnim/20)*30+50))*30-(0)));
            yy = 0 + (((tickAnim - 0) / 40) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 40) * (0-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 88) {
            xx = -28.475+Math.sin((Math.PI/180)*(((double)tickAnim/20)*30+50))*30 + (((tickAnim - 40) / 48) * (0-(-28.475+Math.sin((Math.PI/180)*(((double)tickAnim/20)*30+50))*30)));
            yy = 0 + (((tickAnim - 40) / 48) * (0-(0)));
            zz = 0 + (((tickAnim - 40) / 48) * (0-(0)));
        }
        else if (tickAnim >= 88 && tickAnim < 135) {
            xx = 0 + (((tickAnim - 88) / 47) * (-28.475+Math.sin((Math.PI/180)*(((double)tickAnim/20)*30+50))*-30-(0)));
            yy = 0 + (((tickAnim - 88) / 47) * (0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*30+50))*-5-(0)));
            zz = 0 + (((tickAnim - 88) / 47) * (0-(0)));
        }
        else if (tickAnim >= 135 && tickAnim < 183) {
            xx = -28.475+Math.sin((Math.PI/180)*(((double)tickAnim/20)*30+50))*-30 + (((tickAnim - 135) / 48) * (0-(-28.475+Math.sin((Math.PI/180)*(((double)tickAnim/20)*30+50))*-30)));
            yy = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*30+50))*-5 + (((tickAnim - 135) / 48) * (0-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*30+50))*-5)));
            zz = 0 + (((tickAnim - 135) / 48) * (0-(0)));
        }
        else if (tickAnim >= 183 && tickAnim < 220) {
            xx = 0 + (((tickAnim - 183) / 37) * (0-(0)));
            yy = 0 + (((tickAnim - 183) / 37) * (0-(0)));
            zz = 0 + (((tickAnim - 183) / 37) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck3, neck3.rotateAngleX + (float) Math.toRadians(xx), neck3.rotateAngleY + (float) Math.toRadians(yy), neck3.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 40) {
            xx = 0 + (((tickAnim - 0) / 40) * (-25.35+Math.sin((Math.PI/180)*(((double)tickAnim/20)*30+90))*50-(0)));
            yy = 0 + (((tickAnim - 0) / 40) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 40) * (0-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 88) {
            xx = -25.35+Math.sin((Math.PI/180)*(((double)tickAnim/20)*30+90))*50 + (((tickAnim - 40) / 48) * (-17.75-(-25.35+Math.sin((Math.PI/180)*(((double)tickAnim/20)*30+90))*50)));
            yy = 0 + (((tickAnim - 40) / 48) * (0-(0)));
            zz = 0 + (((tickAnim - 40) / 48) * (0-(0)));
        }
        else if (tickAnim >= 88 && tickAnim < 135) {
            xx = -17.75 + (((tickAnim - 88) / 47) * (-45.4+Math.sin((Math.PI/180)*(((double)tickAnim/20)*30+90))*-50-(-17.75)));
            yy = 0 + (((tickAnim - 88) / 47) * (0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*30+90))*-5-(0)));
            zz = 0 + (((tickAnim - 88) / 47) * (0-(0)));
        }
        else if (tickAnim >= 135 && tickAnim < 183) {
            xx = -45.4+Math.sin((Math.PI/180)*(((double)tickAnim/20)*30+90))*-50 + (((tickAnim - 135) / 48) * (-17.75-(-45.4+Math.sin((Math.PI/180)*(((double)tickAnim/20)*30+90))*-50)));
            yy = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*30+90))*-5 + (((tickAnim - 135) / 48) * (0-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*30+90))*-5)));
            zz = 0 + (((tickAnim - 135) / 48) * (0-(0)));
        }
        else if (tickAnim >= 183 && tickAnim < 220) {
            xx = -17.75 + (((tickAnim - 183) / 37) * (0-(-17.75)));
            yy = 0 + (((tickAnim - 183) / 37) * (0-(0)));
            zz = 0 + (((tickAnim - 183) / 37) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck4, neck4.rotateAngleX + (float) Math.toRadians(xx), neck4.rotateAngleY + (float) Math.toRadians(yy), neck4.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 40) {
            xx = 0 + (((tickAnim - 0) / 40) * (29.675+Math.sin((Math.PI/180)*(((double)tickAnim/20)*30+130))*50-(0)));
            yy = 0 + (((tickAnim - 0) / 40) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 40) * (0-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 88) {
            xx = 29.675+Math.sin((Math.PI/180)*(((double)tickAnim/20)*30+130))*50 + (((tickAnim - 40) / 48) * (0-(29.675+Math.sin((Math.PI/180)*(((double)tickAnim/20)*30+130))*50)));
            yy = 0 + (((tickAnim - 40) / 48) * (0-(0)));
            zz = 0 + (((tickAnim - 40) / 48) * (0-(0)));
        }
        else if (tickAnim >= 88 && tickAnim < 135) {
            xx = 0 + (((tickAnim - 88) / 47) * (29.675+Math.sin((Math.PI/180)*(((double)tickAnim/20)*30+130))*50-(0)));
            yy = 0 + (((tickAnim - 88) / 47) * (0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*30+130))*5-(0)));
            zz = 0 + (((tickAnim - 88) / 47) * (0-(0)));
        }
        else if (tickAnim >= 135 && tickAnim < 183) {
            xx = 29.675+Math.sin((Math.PI/180)*(((double)tickAnim/20)*30+130))*50 + (((tickAnim - 135) / 48) * (0-(29.675+Math.sin((Math.PI/180)*(((double)tickAnim/20)*30+130))*50)));
            yy = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*30+130))*5 + (((tickAnim - 135) / 48) * (0-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*30+130))*5)));
            zz = 0 + (((tickAnim - 135) / 48) * (0-(0)));
        }
        else if (tickAnim >= 183 && tickAnim < 220) {
            xx = 0 + (((tickAnim - 183) / 37) * (0-(0)));
            yy = 0 + (((tickAnim - 183) / 37) * (0-(0)));
            zz = 0 + (((tickAnim - 183) / 37) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(head, head.rotateAngleX + (float) Math.toRadians(xx), head.rotateAngleY + (float) Math.toRadians(yy), head.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 28) {
            xx = 0 + (((tickAnim - 0) / 28) * (96.56429-(0)));
            yy = 0 + (((tickAnim - 0) / 28) * (-7.6787143243+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1000))*-5-(0)));
            zz = 0 + (((tickAnim - 0) / 28) * (-43.4605168725+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1000))*5-(0)));
        }
        else if (tickAnim >= 28 && tickAnim < 88) {
            xx = 96.56429 + (((tickAnim - 28) / 60) * (96.56429-(96.56429)));
            yy = -7.6787143243+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1000))*-5 + (((tickAnim - 28) / 60) * (-7.6787143243+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1000))*-5-(-7.6787143243+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1000))*-5)));
            zz = -43.4605168725+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1000))*5 + (((tickAnim - 28) / 60) * (-43.4605168725+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1000))*5-(-43.4605168725+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1000))*5)));
        }
        else if (tickAnim >= 88 && tickAnim < 135) {
            xx = 96.56429 + (((tickAnim - 88) / 47) * (0-(96.56429)));
            yy = -7.6787143243+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1000))*-5 + (((tickAnim - 88) / 47) * (0-(-7.6787143243+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1000))*-5)));
            zz = -43.4605168725+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1000))*5 + (((tickAnim - 88) / 47) * (0-(-43.4605168725+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1000))*5)));
        }
        else if (tickAnim >= 135 && tickAnim < 163) {
            xx = 0 + (((tickAnim - 135) / 28) * (96.56429-(0)));
            yy = 0 + (((tickAnim - 135) / 28) * (-7.6787143243+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1000))*-5-(0)));
            zz = 0 + (((tickAnim - 135) / 28) * (-43.4605168725+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1000))*5-(0)));
        }
        else if (tickAnim >= 163 && tickAnim < 183) {
            xx = 96.56429 + (((tickAnim - 163) / 20) * (96.56429-(96.56429)));
            yy = -7.6787143243+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1000))*-5 + (((tickAnim - 163) / 20) * (-7.6787143243+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1000))*-5-(-7.6787143243+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1000))*-5)));
            zz = -43.4605168725+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1000))*5 + (((tickAnim - 163) / 20) * (-43.4605168725+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1000))*5-(-43.4605168725+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1000))*5)));
        }
        else if (tickAnim >= 183 && tickAnim < 220) {
            xx = 96.56429 + (((tickAnim - 183) / 37) * (0-(96.56429)));
            yy = -7.6787143243+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1000))*-5 + (((tickAnim - 183) / 37) * (0-(-7.6787143243+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1000))*-5)));
            zz = -43.4605168725+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1000))*5 + (((tickAnim - 183) / 37) * (0-(-43.4605168725+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1000))*5)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftbrowmovingpart, leftbrowmovingpart.rotateAngleX + (float) Math.toRadians(xx), leftbrowmovingpart.rotateAngleY + (float) Math.toRadians(yy), leftbrowmovingpart.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 28) {
            xx = 0 + (((tickAnim - 0) / 28) * (96.56429-(0)));
            yy = 0 + (((tickAnim - 0) / 28) * (7.6787143243+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1000))*5-(0)));
            zz = 0 + (((tickAnim - 0) / 28) * (43.4605168725+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1000))*-5-(0)));
        }
        else if (tickAnim >= 28 && tickAnim < 88) {
            xx = 96.56429 + (((tickAnim - 28) / 60) * (96.56429-(96.56429)));
            yy = 7.6787143243+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1000))*5 + (((tickAnim - 28) / 60) * (7.6787143243+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1000))*5-(7.6787143243+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1000))*5)));
            zz = 43.4605168725+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1000))*-5 + (((tickAnim - 28) / 60) * (43.4605168725+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1000))*-5-(43.4605168725+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1000))*-5)));
        }
        else if (tickAnim >= 88 && tickAnim < 135) {
            xx = 96.56429 + (((tickAnim - 88) / 47) * (0-(96.56429)));
            yy = 7.6787143243+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1000))*5 + (((tickAnim - 88) / 47) * (0-(7.6787143243+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1000))*5)));
            zz = 43.4605168725+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1000))*-5 + (((tickAnim - 88) / 47) * (0-(43.4605168725+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1000))*-5)));
        }
        else if (tickAnim >= 135 && tickAnim < 163) {
            xx = 0 + (((tickAnim - 135) / 28) * (96.56429-(0)));
            yy = 0 + (((tickAnim - 135) / 28) * (7.6787143243+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1000))*5-(0)));
            zz = 0 + (((tickAnim - 135) / 28) * (43.4605168725+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1000))*-5-(0)));
        }
        else if (tickAnim >= 163 && tickAnim < 183) {
            xx = 96.56429 + (((tickAnim - 163) / 20) * (96.56429-(96.56429)));
            yy = 7.6787143243+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1000))*5 + (((tickAnim - 163) / 20) * (7.6787143243+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1000))*5-(7.6787143243+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1000))*5)));
            zz = 43.4605168725+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1000))*-5 + (((tickAnim - 163) / 20) * (43.4605168725+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1000))*-5-(43.4605168725+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1000))*-5)));
        }
        else if (tickAnim >= 183 && tickAnim < 220) {
            xx = 96.56429 + (((tickAnim - 183) / 37) * (0-(96.56429)));
            yy = 7.6787143243+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1000))*5 + (((tickAnim - 183) / 37) * (0-(7.6787143243+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1000))*5)));
            zz = 43.4605168725+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1000))*-5 + (((tickAnim - 183) / 37) * (0-(43.4605168725+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1000))*-5)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightbrowmovingpart, rightbrowmovingpart.rotateAngleX + (float) Math.toRadians(xx), rightbrowmovingpart.rotateAngleY + (float) Math.toRadians(yy), rightbrowmovingpart.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 88) {
            xx = 0 + (((tickAnim - 0) / 88) * (-24.5-(0)));
            yy = 0 + (((tickAnim - 0) / 88) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 88) * (50.75-(0)));
        }
        else if (tickAnim >= 88 && tickAnim < 135) {
            xx = -24.5 + (((tickAnim - 88) / 47) * (0-(-24.5)));
            yy = 0 + (((tickAnim - 88) / 47) * (0-(0)));
            zz = 50.75 + (((tickAnim - 88) / 47) * (0-(50.75)));
        }
        else if (tickAnim >= 135 && tickAnim < 183) {
            xx = 0 + (((tickAnim - 135) / 48) * (-24.5-(0)));
            yy = 0 + (((tickAnim - 135) / 48) * (0-(0)));
            zz = 0 + (((tickAnim - 135) / 48) * (50.75-(0)));
        }
        else if (tickAnim >= 183 && tickAnim < 220) {
            xx = -24.5 + (((tickAnim - 183) / 37) * (0-(-24.5)));
            yy = 0 + (((tickAnim - 183) / 37) * (0-(0)));
            zz = 50.75 + (((tickAnim - 183) / 37) * (0-(50.75)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftarm, leftarm.rotateAngleX + (float) Math.toRadians(xx), leftarm.rotateAngleY + (float) Math.toRadians(yy), leftarm.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 88) {
            xx = 0 + (((tickAnim - 0) / 88) * (-24.5-(0)));
            yy = 0 + (((tickAnim - 0) / 88) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 88) * (-50.75-(0)));
        }
        else if (tickAnim >= 88 && tickAnim < 135) {
            xx = -24.5 + (((tickAnim - 88) / 47) * (0-(-24.5)));
            yy = 0 + (((tickAnim - 88) / 47) * (0-(0)));
            zz = -50.75 + (((tickAnim - 88) / 47) * (0-(-50.75)));
        }
        else if (tickAnim >= 135 && tickAnim < 183) {
            xx = 0 + (((tickAnim - 135) / 48) * (-24.5-(0)));
            yy = 0 + (((tickAnim - 135) / 48) * (0-(0)));
            zz = 0 + (((tickAnim - 135) / 48) * (-50.75-(0)));
        }
        else if (tickAnim >= 183 && tickAnim < 220) {
            xx = -24.5 + (((tickAnim - 183) / 37) * (0-(-24.5)));
            yy = 0 + (((tickAnim - 183) / 37) * (0-(0)));
            zz = -50.75 + (((tickAnim - 183) / 37) * (0-(-50.75)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightarm, rightarm.rotateAngleX + (float) Math.toRadians(xx), rightarm.rotateAngleY + (float) Math.toRadians(yy), rightarm.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 88) {
            xx = 0 + (((tickAnim - 0) / 88) * (7-(0)));
            yy = 0 + (((tickAnim - 0) / 88) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 88) * (0-(0)));
        }
        else if (tickAnim >= 88 && tickAnim < 135) {
            xx = 7 + (((tickAnim - 88) / 47) * (-7.13-(7)));
            yy = 0 + (((tickAnim - 88) / 47) * (0-(0)));
            zz = 0 + (((tickAnim - 88) / 47) * (0-(0)));
        }
        else if (tickAnim >= 135 && tickAnim < 183) {
            xx = -7.13 + (((tickAnim - 135) / 48) * (-5.75-(-7.13)));
            yy = 0 + (((tickAnim - 135) / 48) * (0-(0)));
            zz = 0 + (((tickAnim - 135) / 48) * (0-(0)));
        }
        else if (tickAnim >= 183 && tickAnim < 220) {
            xx = -5.75 + (((tickAnim - 183) / 37) * (0-(-5.75)));
            yy = 0 + (((tickAnim - 183) / 37) * (0-(0)));
            zz = 0 + (((tickAnim - 183) / 37) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tail, tail.rotateAngleX + (float) Math.toRadians(xx), tail.rotateAngleY + (float) Math.toRadians(yy), tail.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 88) {
            xx = 0 + (((tickAnim - 0) / 88) * (6-(0)));
            yy = 0 + (((tickAnim - 0) / 88) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 88) * (0-(0)));
        }
        else if (tickAnim >= 88 && tickAnim < 135) {
            xx = 6 + (((tickAnim - 88) / 47) * (-9.36-(6)));
            yy = 0 + (((tickAnim - 88) / 47) * (0-(0)));
            zz = 0 + (((tickAnim - 88) / 47) * (0-(0)));
        }
        else if (tickAnim >= 135 && tickAnim < 183) {
            xx = -9.36 + (((tickAnim - 135) / 48) * (0-(-9.36)));
            yy = 0 + (((tickAnim - 135) / 48) * (0-(0)));
            zz = 0 + (((tickAnim - 135) / 48) * (0-(0)));
        }
        else if (tickAnim >= 183 && tickAnim < 220) {
            xx = 0 + (((tickAnim - 183) / 37) * (0-(0)));
            yy = 0 + (((tickAnim - 183) / 37) * (0-(0)));
            zz = 0 + (((tickAnim - 183) / 37) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tail2, tail2.rotateAngleX + (float) Math.toRadians(xx), tail2.rotateAngleY + (float) Math.toRadians(yy), tail2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 88) {
            xx = 0 + (((tickAnim - 0) / 88) * (-1.25-(0)));
            yy = 0 + (((tickAnim - 0) / 88) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 88) * (0-(0)));
        }
        else if (tickAnim >= 88 && tickAnim < 135) {
            xx = -1.25 + (((tickAnim - 88) / 47) * (4.9-(-1.25)));
            yy = 0 + (((tickAnim - 88) / 47) * (0-(0)));
            zz = 0 + (((tickAnim - 88) / 47) * (0-(0)));
        }
        else if (tickAnim >= 135 && tickAnim < 183) {
            xx = 4.9 + (((tickAnim - 135) / 48) * (5.5-(4.9)));
            yy = 0 + (((tickAnim - 135) / 48) * (0-(0)));
            zz = 0 + (((tickAnim - 135) / 48) * (0-(0)));
        }
        else if (tickAnim >= 183 && tickAnim < 220) {
            xx = 5.5 + (((tickAnim - 183) / 37) * (0-(5.5)));
            yy = 0 + (((tickAnim - 183) / 37) * (0-(0)));
            zz = 0 + (((tickAnim - 183) / 37) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tail3, tail3.rotateAngleX + (float) Math.toRadians(xx), tail3.rotateAngleY + (float) Math.toRadians(yy), tail3.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 88) {
            xx = 0 + (((tickAnim - 0) / 88) * (9.75-(0)));
            yy = 0 + (((tickAnim - 0) / 88) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 88) * (0-(0)));
        }
        else if (tickAnim >= 88 && tickAnim < 135) {
            xx = 9.75 + (((tickAnim - 88) / 47) * (17.95-(9.75)));
            yy = 0 + (((tickAnim - 88) / 47) * (0-(0)));
            zz = 0 + (((tickAnim - 88) / 47) * (0-(0)));
        }
        else if (tickAnim >= 135 && tickAnim < 183) {
            xx = 17.95 + (((tickAnim - 135) / 48) * (15.25-(17.95)));
            yy = 0 + (((tickAnim - 135) / 48) * (0-(0)));
            zz = 0 + (((tickAnim - 135) / 48) * (0-(0)));
        }
        else if (tickAnim >= 183 && tickAnim < 220) {
            xx = 15.25 + (((tickAnim - 183) / 37) * (0-(15.25)));
            yy = 0 + (((tickAnim - 183) / 37) * (0-(0)));
            zz = 0 + (((tickAnim - 183) / 37) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tail4, tail4.rotateAngleX + (float) Math.toRadians(xx), tail4.rotateAngleY + (float) Math.toRadians(yy), tail4.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 88) {
            xx = 0 + (((tickAnim - 0) / 88) * (12.5-(0)));
            yy = 0 + (((tickAnim - 0) / 88) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 88) * (0-(0)));
        }
        else if (tickAnim >= 88 && tickAnim < 135) {
            xx = 12.5 + (((tickAnim - 88) / 47) * (18.02-(12.5)));
            yy = 0 + (((tickAnim - 88) / 47) * (0-(0)));
            zz = 0 + (((tickAnim - 88) / 47) * (0-(0)));
        }
        else if (tickAnim >= 135 && tickAnim < 183) {
            xx = 18.02 + (((tickAnim - 135) / 48) * (0-(18.02)));
            yy = 0 + (((tickAnim - 135) / 48) * (0-(0)));
            zz = 0 + (((tickAnim - 135) / 48) * (0-(0)));
        }
        else if (tickAnim >= 183 && tickAnim < 220) {
            xx = 0 + (((tickAnim - 183) / 37) * (0-(0)));
            yy = 0 + (((tickAnim - 183) / 37) * (0-(0)));
            zz = 0 + (((tickAnim - 183) / 37) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tail5, tail5.rotateAngleX + (float) Math.toRadians(xx), tail5.rotateAngleY + (float) Math.toRadians(yy), tail5.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 88) {
            xx = 0 + (((tickAnim - 0) / 88) * (7-(0)));
            yy = 0 + (((tickAnim - 0) / 88) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 88) * (0-(0)));
        }
        else if (tickAnim >= 88 && tickAnim < 183) {
            xx = 7 + (((tickAnim - 88) / 95) * (0-(7)));
            yy = 0 + (((tickAnim - 88) / 95) * (0-(0)));
            zz = 0 + (((tickAnim - 88) / 95) * (0-(0)));
        }
        else if (tickAnim >= 183 && tickAnim < 220) {
            xx = 0 + (((tickAnim - 183) / 37) * (0-(0)));
            yy = 0 + (((tickAnim - 183) / 37) * (0-(0)));
            zz = 0 + (((tickAnim - 183) / 37) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tail6, tail6.rotateAngleX + (float) Math.toRadians(xx), tail6.rotateAngleY + (float) Math.toRadians(yy), tail6.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 0) / 20) * (-22.625-(0)));
            yy = 0 + (((tickAnim - 0) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 20) * (-0.875-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 40) {
            xx = -22.625 + (((tickAnim - 20) / 20) * (-15.25-(-22.625)));
            yy = 0 + (((tickAnim - 20) / 20) * (0-(0)));
            zz = -0.875 + (((tickAnim - 20) / 20) * (-1.75-(-0.875)));
        }
        else if (tickAnim >= 40 && tickAnim < 61) {
            xx = -15.25 + (((tickAnim - 40) / 21) * (-8.78947-(-15.25)));
            yy = 0 + (((tickAnim - 40) / 21) * (0-(0)));
            zz = -1.75 + (((tickAnim - 40) / 21) * (-1.75-(-1.75)));
        }
        else if (tickAnim >= 61 && tickAnim < 88) {
            xx = -8.78947 + (((tickAnim - 61) / 27) * (12.75-(-8.78947)));
            yy = 0 + (((tickAnim - 61) / 27) * (0-(0)));
            zz = -1.75 + (((tickAnim - 61) / 27) * (0-(-1.75)));
        }
        else if (tickAnim >= 88 && tickAnim < 135) {
            xx = 12.75 + (((tickAnim - 88) / 47) * (1.5-(12.75)));
            yy = 0 + (((tickAnim - 88) / 47) * (0-(0)));
            zz = 0 + (((tickAnim - 88) / 47) * (0-(0)));
        }
        else if (tickAnim >= 135 && tickAnim < 183) {
            xx = 1.5 + (((tickAnim - 135) / 48) * (13.5-(1.5)));
            yy = 0 + (((tickAnim - 135) / 48) * (0-(0)));
            zz = 0 + (((tickAnim - 135) / 48) * (0-(0)));
        }
        else if (tickAnim >= 183 && tickAnim < 220) {
            xx = 13.5 + (((tickAnim - 183) / 37) * (0-(13.5)));
            yy = 0 + (((tickAnim - 183) / 37) * (0-(0)));
            zz = 0 + (((tickAnim - 183) / 37) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightLeg, rightLeg.rotateAngleX + (float) Math.toRadians(xx), rightLeg.rotateAngleY + (float) Math.toRadians(yy), rightLeg.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 0) / 20) * (24.5-(0)));
            yy = 0 + (((tickAnim - 0) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 20) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 40) {
            xx = 24.5 + (((tickAnim - 20) / 20) * (-8-(24.5)));
            yy = 0 + (((tickAnim - 20) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 20) * (0-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 61) {
            xx = -8 + (((tickAnim - 40) / 21) * (-8-(-8)));
            yy = 0 + (((tickAnim - 40) / 21) * (0-(0)));
            zz = 0 + (((tickAnim - 40) / 21) * (0-(0)));
        }
        else if (tickAnim >= 61 && tickAnim < 78) {
            xx = -8 + (((tickAnim - 61) / 17) * (28.34607-(-8)));
            yy = 0 + (((tickAnim - 61) / 17) * (0.46981-(0)));
            zz = 0 + (((tickAnim - 61) / 17) * (-2.36596-(0)));
        }
        else if (tickAnim >= 78 && tickAnim < 88) {
            xx = 28.34607 + (((tickAnim - 78) / 10) * (0-(28.34607)));
            yy = 0.46981 + (((tickAnim - 78) / 10) * (0-(0.46981)));
            zz = -2.36596 + (((tickAnim - 78) / 10) * (0-(-2.36596)));
        }
        else if (tickAnim >= 88 && tickAnim < 183) {
            xx = 0 + (((tickAnim - 88) / 95) * (0-(0)));
            yy = 0 + (((tickAnim - 88) / 95) * (0-(0)));
            zz = 0 + (((tickAnim - 88) / 95) * (0-(0)));
        }
        else if (tickAnim >= 183 && tickAnim < 220) {
            xx = 0 + (((tickAnim - 183) / 37) * (0-(0)));
            yy = 0 + (((tickAnim - 183) / 37) * (0-(0)));
            zz = 0 + (((tickAnim - 183) / 37) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightLeg2, rightLeg2.rotateAngleX + (float) Math.toRadians(xx), rightLeg2.rotateAngleY + (float) Math.toRadians(yy), rightLeg2.rotateAngleZ + (float) Math.toRadians(zz));

        this.rightLeg2.rotationPointX = this.rightLeg2.rotationPointX + (float)(0);
        this.rightLeg2.rotationPointY = this.rightLeg2.rotationPointY - (float)(0);
        this.rightLeg2.rotationPointZ = this.rightLeg2.rotationPointZ + (float)(0);



        if (tickAnim >= 0 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 0) / 20) * (-36.62-(0)));
            yy = 0 + (((tickAnim - 0) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 20) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 40) {
            xx = -36.62 + (((tickAnim - 20) / 20) * (1.75-(-36.62)));
            yy = 0 + (((tickAnim - 20) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 20) * (0-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 61) {
            xx = 1.75 + (((tickAnim - 40) / 21) * (1.75-(1.75)));
            yy = 0 + (((tickAnim - 40) / 21) * (0-(0)));
            zz = 0 + (((tickAnim - 40) / 21) * (0-(0)));
        }
        else if (tickAnim >= 61 && tickAnim < 78) {
            xx = 1.75 + (((tickAnim - 61) / 17) * (-39.22-(1.75)));
            yy = 0 + (((tickAnim - 61) / 17) * (0-(0)));
            zz = 0 + (((tickAnim - 61) / 17) * (0-(0)));
        }
        else if (tickAnim >= 78 && tickAnim < 88) {
            xx = -39.22 + (((tickAnim - 78) / 10) * (0-(-39.22)));
            yy = 0 + (((tickAnim - 78) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 78) / 10) * (0-(0)));
        }
        else if (tickAnim >= 88 && tickAnim < 183) {
            xx = 0 + (((tickAnim - 88) / 95) * (0-(0)));
            yy = 0 + (((tickAnim - 88) / 95) * (0-(0)));
            zz = 0 + (((tickAnim - 88) / 95) * (0-(0)));
        }
        else if (tickAnim >= 183 && tickAnim < 220) {
            xx = 0 + (((tickAnim - 183) / 37) * (0-(0)));
            yy = 0 + (((tickAnim - 183) / 37) * (0-(0)));
            zz = 0 + (((tickAnim - 183) / 37) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightLeg3, rightLeg3.rotateAngleX + (float) Math.toRadians(xx), rightLeg3.rotateAngleY + (float) Math.toRadians(yy), rightLeg3.rotateAngleZ + (float) Math.toRadians(zz));

        this.rightLeg3.rotationPointX = this.rightLeg3.rotationPointX + (float)(0);
        this.rightLeg3.rotationPointY = this.rightLeg3.rotationPointY - (float)(0);
        this.rightLeg3.rotationPointZ = this.rightLeg3.rotationPointZ + (float)(0);



        if (tickAnim >= 0 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 0) / 20) * (77.25-(0)));
            yy = 0 + (((tickAnim - 0) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 20) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 40) {
            xx = 77.25 + (((tickAnim - 20) / 20) * (15.5-(77.25)));
            yy = 0 + (((tickAnim - 20) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 20) * (0-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 61) {
            xx = 15.5 + (((tickAnim - 40) / 21) * (15.5-(15.5)));
            yy = 0 + (((tickAnim - 40) / 21) * (0-(0)));
            zz = 0 + (((tickAnim - 40) / 21) * (0-(0)));
        }
        else if (tickAnim >= 61 && tickAnim < 78) {
            xx = 15.5 + (((tickAnim - 61) / 17) * (85.47033-(15.5)));
            yy = 0 + (((tickAnim - 61) / 17) * (5.72563-(0)));
            zz = 0 + (((tickAnim - 61) / 17) * (-0.60721-(0)));
        }
        else if (tickAnim >= 78 && tickAnim < 88) {
            xx = 85.47033 + (((tickAnim - 78) / 10) * (-6.25-(85.47033)));
            yy = 5.72563 + (((tickAnim - 78) / 10) * (0-(5.72563)));
            zz = -0.60721 + (((tickAnim - 78) / 10) * (0-(-0.60721)));
        }
        else if (tickAnim >= 88 && tickAnim < 183) {
            xx = -6.25 + (((tickAnim - 88) / 95) * (-6.25-(-6.25)));
            yy = 0 + (((tickAnim - 88) / 95) * (0-(0)));
            zz = 0 + (((tickAnim - 88) / 95) * (0-(0)));
        }
        else if (tickAnim >= 183 && tickAnim < 220) {
            xx = -6.25 + (((tickAnim - 183) / 37) * (0-(-6.25)));
            yy = 0 + (((tickAnim - 183) / 37) * (0-(0)));
            zz = 0 + (((tickAnim - 183) / 37) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightLeg4, rightLeg4.rotateAngleX + (float) Math.toRadians(xx), rightLeg4.rotateAngleY + (float) Math.toRadians(yy), rightLeg4.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 61) {
            xx = 0 + (((tickAnim - 0) / 61) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 61) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 61) * (0-(0)));
        }
        else if (tickAnim >= 61 && tickAnim < 78) {
            xx = 0 + (((tickAnim - 61) / 17) * (0-(0)));
            yy = 0 + (((tickAnim - 61) / 17) * (2.13-(0)));
            zz = 0 + (((tickAnim - 61) / 17) * (0-(0)));
        }
        else if (tickAnim >= 78 && tickAnim < 88) {
            xx = 0 + (((tickAnim - 78) / 10) * (0-(0)));
            yy = 2.13 + (((tickAnim - 78) / 10) * (-0.425-(2.13)));
            zz = 0 + (((tickAnim - 78) / 10) * (0-(0)));
        }
        else if (tickAnim >= 88 && tickAnim < 183) {
            xx = 0 + (((tickAnim - 88) / 95) * (0-(0)));
            yy = -0.425 + (((tickAnim - 88) / 95) * (-0.425-(-0.425)));
            zz = 0 + (((tickAnim - 88) / 95) * (0-(0)));
        }
        else if (tickAnim >= 183 && tickAnim < 220) {
            xx = 0 + (((tickAnim - 183) / 37) * (0-(0)));
            yy = -0.425 + (((tickAnim - 183) / 37) * (0-(-0.425)));
            zz = 0 + (((tickAnim - 183) / 37) * (0-(0)));
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
            xx = 0 + (((tickAnim - 0) / 40) * (-4.5-(0)));
            yy = 0 + (((tickAnim - 0) / 40) * (7.75-(0)));
            zz = 0 + (((tickAnim - 0) / 40) * (-0.0001-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 88) {
            xx = -4.5 + (((tickAnim - 40) / 48) * (9.07898-(-4.5)));
            yy = 7.75 + (((tickAnim - 40) / 48) * (7.39361-(7.75)));
            zz = -0.0001 + (((tickAnim - 40) / 48) * (1.27124-(-0.0001)));
        }
        else if (tickAnim >= 88 && tickAnim < 135) {
            xx = 9.07898 + (((tickAnim - 88) / 47) * (-29.67102-(9.07898)));
            yy = 7.39361 + (((tickAnim - 88) / 47) * (7.39361-(7.39361)));
            zz = 1.27124 + (((tickAnim - 88) / 47) * (1.27124-(1.27124)));
        }
        else if (tickAnim >= 135 && tickAnim < 183) {
            xx = -29.67102 + (((tickAnim - 135) / 48) * (-19.17102-(-29.67102)));
            yy = 7.39361 + (((tickAnim - 135) / 48) * (7.39361-(7.39361)));
            zz = 1.27124 + (((tickAnim - 135) / 48) * (1.27124-(1.27124)));
        }
        else if (tickAnim >= 183 && tickAnim < 201) {
            xx = -19.17102 + (((tickAnim - 183) / 18) * (0-(-19.17102)));
            yy = 7.39361 + (((tickAnim - 183) / 18) * (0-(7.39361)));
            zz = 1.27124 + (((tickAnim - 183) / 18) * (0-(1.27124)));
        }
        else if (tickAnim >= 201 && tickAnim < 220) {
            xx = 0 + (((tickAnim - 201) / 19) * (0-(0)));
            yy = 0 + (((tickAnim - 201) / 19) * (0-(0)));
            zz = 0 + (((tickAnim - 201) / 19) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftLeg, leftLeg.rotateAngleX + (float) Math.toRadians(xx), leftLeg.rotateAngleY + (float) Math.toRadians(yy), leftLeg.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 40) {
            xx = 0 + (((tickAnim - 0) / 40) * (-1.75-(0)));
            yy = 0 + (((tickAnim - 0) / 40) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 40) * (0-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 88) {
            xx = -1.75 + (((tickAnim - 40) / 48) * (-2.75-(-1.75)));
            yy = 0 + (((tickAnim - 40) / 48) * (0-(0)));
            zz = 0 + (((tickAnim - 40) / 48) * (0-(0)));
        }
        else if (tickAnim >= 88 && tickAnim < 135) {
            xx = -2.75 + (((tickAnim - 88) / 47) * (36.75-(-2.75)));
            yy = 0 + (((tickAnim - 88) / 47) * (0-(0)));
            zz = 0 + (((tickAnim - 88) / 47) * (0-(0)));
        }
        else if (tickAnim >= 135 && tickAnim < 183) {
            xx = 36.75 + (((tickAnim - 135) / 48) * (6-(36.75)));
            yy = 0 + (((tickAnim - 135) / 48) * (0-(0)));
            zz = 0 + (((tickAnim - 135) / 48) * (0-(0)));
        }
        else if (tickAnim >= 183 && tickAnim < 201) {
            xx = 6 + (((tickAnim - 183) / 18) * (41.32-(6)));
            yy = 0 + (((tickAnim - 183) / 18) * (0-(0)));
            zz = 0 + (((tickAnim - 183) / 18) * (0-(0)));
        }
        else if (tickAnim >= 201 && tickAnim < 220) {
            xx = 41.32 + (((tickAnim - 201) / 19) * (0-(41.32)));
            yy = 0 + (((tickAnim - 201) / 19) * (0-(0)));
            zz = 0 + (((tickAnim - 201) / 19) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftLeg2, leftLeg2.rotateAngleX + (float) Math.toRadians(xx), leftLeg2.rotateAngleY + (float) Math.toRadians(yy), leftLeg2.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 88) {
            xx = 0 + (((tickAnim - 0) / 88) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 88) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 88) * (0-(0)));
        }
        else if (tickAnim >= 88 && tickAnim < 183) {
            xx = 0 + (((tickAnim - 88) / 95) * (0-(0)));
            yy = 0 + (((tickAnim - 88) / 95) * (-0.9-(0)));
            zz = 0 + (((tickAnim - 88) / 95) * (0-(0)));
        }
        else if (tickAnim >= 183 && tickAnim < 220) {
            xx = 0 + (((tickAnim - 183) / 37) * (0-(0)));
            yy = -0.9 + (((tickAnim - 183) / 37) * (0-(-0.9)));
            zz = 0 + (((tickAnim - 183) / 37) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.leftLeg2.rotationPointX = this.leftLeg2.rotationPointX + (float)(xx);
        this.leftLeg2.rotationPointY = this.leftLeg2.rotationPointY - (float)(yy);
        this.leftLeg2.rotationPointZ = this.leftLeg2.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 40) {
            xx = 0 + (((tickAnim - 0) / 40) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 40) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 40) * (0-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 88) {
            xx = 0 + (((tickAnim - 40) / 48) * (0-(0)));
            yy = 0 + (((tickAnim - 40) / 48) * (0-(0)));
            zz = 0 + (((tickAnim - 40) / 48) * (0-(0)));
        }
        else if (tickAnim >= 88 && tickAnim < 135) {
            xx = 0 + (((tickAnim - 88) / 47) * (-45.75-(0)));
            yy = 0 + (((tickAnim - 88) / 47) * (0-(0)));
            zz = 0 + (((tickAnim - 88) / 47) * (0-(0)));
        }
        else if (tickAnim >= 135 && tickAnim < 183) {
            xx = -45.75 + (((tickAnim - 135) / 48) * (12.25-(-45.75)));
            yy = 0 + (((tickAnim - 135) / 48) * (0-(0)));
            zz = 0 + (((tickAnim - 135) / 48) * (0-(0)));
        }
        else if (tickAnim >= 183 && tickAnim < 201) {
            xx = 12.25 + (((tickAnim - 183) / 18) * (-51.49-(12.25)));
            yy = 0 + (((tickAnim - 183) / 18) * (0-(0)));
            zz = 0 + (((tickAnim - 183) / 18) * (0-(0)));
        }
        else if (tickAnim >= 201 && tickAnim < 220) {
            xx = -51.49 + (((tickAnim - 201) / 19) * (0-(-51.49)));
            yy = 0 + (((tickAnim - 201) / 19) * (0-(0)));
            zz = 0 + (((tickAnim - 201) / 19) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftLeg3, leftLeg3.rotateAngleX + (float) Math.toRadians(xx), leftLeg3.rotateAngleY + (float) Math.toRadians(yy), leftLeg3.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 88) {
            xx = 0 + (((tickAnim - 0) / 88) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 88) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 88) * (0-(0)));
        }
        else if (tickAnim >= 88 && tickAnim < 183) {
            xx = 0 + (((tickAnim - 88) / 95) * (0-(0)));
            yy = 0 + (((tickAnim - 88) / 95) * (-0.6-(0)));
            zz = 0 + (((tickAnim - 88) / 95) * (0-(0)));
        }
        else if (tickAnim >= 183 && tickAnim < 220) {
            xx = 0 + (((tickAnim - 183) / 37) * (0-(0)));
            yy = -0.6 + (((tickAnim - 183) / 37) * (0-(-0.6)));
            zz = 0 + (((tickAnim - 183) / 37) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.leftLeg3.rotationPointX = this.leftLeg3.rotationPointX + (float)(xx);
        this.leftLeg3.rotationPointY = this.leftLeg3.rotationPointY - (float)(yy);
        this.leftLeg3.rotationPointZ = this.leftLeg3.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 40) {
            xx = 0 + (((tickAnim - 0) / 40) * (-0.75-(0)));
            yy = 0 + (((tickAnim - 0) / 40) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 40) * (0-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 88) {
            xx = -0.75 + (((tickAnim - 40) / 48) * (0-(-0.75)));
            yy = 0 + (((tickAnim - 40) / 48) * (0-(0)));
            zz = 0 + (((tickAnim - 40) / 48) * (0-(0)));
        }
        else if (tickAnim >= 88 && tickAnim < 135) {
            xx = 0 + (((tickAnim - 88) / 47) * (74.75-(0)));
            yy = 0 + (((tickAnim - 88) / 47) * (0-(0)));
            zz = 0 + (((tickAnim - 88) / 47) * (0-(0)));
        }
        else if (tickAnim >= 135 && tickAnim < 183) {
            xx = 74.75 + (((tickAnim - 135) / 48) * (7.5-(74.75)));
            yy = 0 + (((tickAnim - 135) / 48) * (0-(0)));
            zz = 0 + (((tickAnim - 135) / 48) * (0-(0)));
        }
        else if (tickAnim >= 183 && tickAnim < 201) {
            xx = 7.5 + (((tickAnim - 183) / 18) * (83.58-(7.5)));
            yy = 0 + (((tickAnim - 183) / 18) * (0-(0)));
            zz = 0 + (((tickAnim - 183) / 18) * (0-(0)));
        }
        else if (tickAnim >= 201 && tickAnim < 220) {
            xx = 83.58 + (((tickAnim - 201) / 19) * (0-(83.58)));
            yy = 0 + (((tickAnim - 201) / 19) * (0-(0)));
            zz = 0 + (((tickAnim - 201) / 19) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftLeg4, leftLeg4.rotateAngleX + (float) Math.toRadians(xx), leftLeg4.rotateAngleY + (float) Math.toRadians(yy), leftLeg4.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 88 && tickAnim < 183) {
            xx = 0 + (((tickAnim - 88) / 95) * (0-(0)));
            yy = 0 + (((tickAnim - 88) / 95) * (-0.425-(0)));
            zz = 0 + (((tickAnim - 88) / 95) * (0-(0)));
        }
        else if (tickAnim >= 183 && tickAnim < 220) {
            xx = 0 + (((tickAnim - 183) / 37) * (0-(0)));
            yy = -0.425 + (((tickAnim - 183) / 37) * (0-(-0.425)));
            zz = 0 + (((tickAnim - 183) / 37) * (0-(0)));
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
    public void animRunning(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime) {
        EntityPrehistoricFloraSinotyrannus entity = (EntityPrehistoricFloraSinotyrannus) entitylivingbaseIn;
        int animCycle = 25;
        double tickAnim = (entity.ticksExisted + entity.getTickOffset()) - (int) (Math.floor((double) (entity.ticksExisted + entity.getTickOffset()) / (double) animCycle) * (double) animCycle) + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;
        this.setRotateAngle(neck, neck.rotateAngleX + (float) Math.toRadians(12.25+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*288/0.5-300))*-2), neck.rotateAngleY + (float) Math.toRadians(0), neck.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(neck2, neck2.rotateAngleX + (float) Math.toRadians(7+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*288/0.5-350))*-4), neck2.rotateAngleY + (float) Math.toRadians(0), neck2.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(neck4, neck4.rotateAngleX + (float) Math.toRadians(-12.5+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*288/0.5-500))*-4), neck4.rotateAngleY + (float) Math.toRadians(0), neck4.rotateAngleZ + (float) Math.toRadians(0));



        if (tickAnim >= 0 && tickAnim < 13) {
            xx = -27.75 + (((tickAnim - 0) / 13) * (0.35+Math.sin((Math.PI/180)*(((double)tickAnim/20)*150))*20-(-27.75)));
            yy = 0 + (((tickAnim - 0) / 13) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 13) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 25) {
            xx = 0.35+Math.sin((Math.PI/180)*(((double)tickAnim/20)*150))*20 + (((tickAnim - 13) / 12) * (-27.75-(0.35+Math.sin((Math.PI/180)*(((double)tickAnim/20)*150))*20)));
            yy = 0 + (((tickAnim - 13) / 12) * (0-(0)));
            zz = 0 + (((tickAnim - 13) / 12) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightLeg, rightLeg.rotateAngleX + (float) Math.toRadians(xx), rightLeg.rotateAngleY + (float) Math.toRadians(yy), rightLeg.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 13) {
            xx = 5 + (((tickAnim - 0) / 13) * (5.5-(5)));
            yy = 0 + (((tickAnim - 0) / 13) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 13) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 17) {
            xx = 5.5 + (((tickAnim - 13) / 4) * (115.53+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*-130-(5.5)));
            yy = 0 + (((tickAnim - 13) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 13) / 4) * (0-(0)));
        }
        else if (tickAnim >= 17 && tickAnim < 25) {
            xx = 115.53+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*-130 + (((tickAnim - 17) / 8) * (5-(115.53+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*-130)));
            yy = 0 + (((tickAnim - 17) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 17) / 8) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightLeg2, rightLeg2.rotateAngleX + (float) Math.toRadians(xx), rightLeg2.rotateAngleY + (float) Math.toRadians(yy), rightLeg2.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 2) {
            xx = 0 + (((tickAnim - 0) / 2) * (0-(0)));
            yy = -0.85 + (((tickAnim - 0) / 2) * (-0.845+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1220/0.5))*0.25-(-0.85)));
            zz = 0 + (((tickAnim - 0) / 2) * (0-(0)));
        }
        else if (tickAnim >= 2 && tickAnim < 4) {
            xx = 0 + (((tickAnim - 2) / 2) * (0-(0)));
            yy = -0.845+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1220/0.5))*0.25 + (((tickAnim - 2) / 2) * (-1.095-(-0.845+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1220/0.5))*0.25)));
            zz = 0 + (((tickAnim - 2) / 2) * (0-(0)));
        }
        else if (tickAnim >= 4 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 4) / 9) * (0-(0)));
            yy = -1.095 + (((tickAnim - 4) / 9) * (0-(-1.095)));
            zz = 0 + (((tickAnim - 4) / 9) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 25) {
            xx = 0 + (((tickAnim - 13) / 12) * (0-(0)));
            yy = 0 + (((tickAnim - 13) / 12) * (-0.825-(0)));
            zz = 0 + (((tickAnim - 13) / 12) * (0-(0)));
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
            xx = 12.939 + (((tickAnim - 0) / 13) * (11.25-(12.939)));
            yy = -1.16256 + (((tickAnim - 0) / 13) * (0-(-1.16256)));
            zz = -1.27735 + (((tickAnim - 0) / 13) * (0-(-1.27735)));
        }
        else if (tickAnim >= 13 && tickAnim < 19) {
            xx = 11.25 + (((tickAnim - 13) / 6) * (53.4758+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*-130-(11.25)));
            yy = 0 + (((tickAnim - 13) / 6) * (-0.62003-(0)));
            zz = 0 + (((tickAnim - 13) / 6) * (-0.68126-(0)));
        }
        else if (tickAnim >= 19 && tickAnim < 22) {
            xx = 53.4758+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*-130 + (((tickAnim - 19) / 3) * (-156.9242+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*130-(53.4758+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*-130)));
            yy = -0.62003 + (((tickAnim - 19) / 3) * (-0.62003-(-0.62003)));
            zz = -0.68126 + (((tickAnim - 19) / 3) * (-0.68126-(-0.68126)));
        }
        else if (tickAnim >= 22 && tickAnim < 25) {
            xx = -156.9242+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*130 + (((tickAnim - 22) / 3) * (12.939-(-156.9242+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*130)));
            yy = -0.62003 + (((tickAnim - 22) / 3) * (-1.16256-(-0.62003)));
            zz = -0.68126 + (((tickAnim - 22) / 3) * (-1.27735-(-0.68126)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightLeg3, rightLeg3.rotateAngleX + (float) Math.toRadians(xx), rightLeg3.rotateAngleY + (float) Math.toRadians(yy), rightLeg3.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 0) / 13) * (0-(0)));
            yy = -0.35 + (((tickAnim - 0) / 13) * (-0.475-(-0.35)));
            zz = 0 + (((tickAnim - 0) / 13) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 25) {
            xx = 0 + (((tickAnim - 13) / 12) * (0-(0)));
            yy = -0.475 + (((tickAnim - 13) / 12) * (-0.35-(-0.475)));
            zz = 0 + (((tickAnim - 13) / 12) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.rightLeg3.rotationPointX = this.rightLeg3.rotationPointX + (float)(xx);
        this.rightLeg3.rotationPointY = this.rightLeg3.rotationPointY - (float)(yy);
        this.rightLeg3.rotationPointZ = this.rightLeg3.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 6) {
            xx = 6.75 + (((tickAnim - 0) / 6) * (-4.03-(6.75)));
            yy = 0 + (((tickAnim - 0) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 6) * (0-(0)));
        }
        else if (tickAnim >= 6 && tickAnim < 13) {
            xx = -4.03 + (((tickAnim - 6) / 7) * (37.75-(-4.03)));
            yy = 0 + (((tickAnim - 6) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 6) / 7) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 17) {
            xx = 37.75 + (((tickAnim - 13) / 4) * (84.47-(37.75)));
            yy = 0 + (((tickAnim - 13) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 13) / 4) * (0-(0)));
        }
        else if (tickAnim >= 17 && tickAnim < 22) {
            xx = 84.47 + (((tickAnim - 17) / 5) * (82.47-(84.47)));
            yy = 0 + (((tickAnim - 17) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 17) / 5) * (0-(0)));
        }
        else if (tickAnim >= 22 && tickAnim < 25) {
            xx = 82.47 + (((tickAnim - 22) / 3) * (6.75-(82.47)));
            yy = 0 + (((tickAnim - 22) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 22) / 3) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightLeg4, rightLeg4.rotateAngleX + (float) Math.toRadians(xx), rightLeg4.rotateAngleY + (float) Math.toRadians(yy), rightLeg4.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 6) {
            xx = 0 + (((tickAnim - 0) / 6) * (0-(0)));
            yy = -0.45 + (((tickAnim - 0) / 6) * (7.37+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50+50))*-8-(-0.45)));
            zz = 0 + (((tickAnim - 0) / 6) * (0-(0)));
        }
        else if (tickAnim >= 6 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 6) / 7) * (0-(0)));
            yy = 7.37+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50+50))*-8 + (((tickAnim - 6) / 7) * (0.775-(7.37+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50+50))*-8)));
            zz = 0 + (((tickAnim - 6) / 7) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 19) {
            xx = 0 + (((tickAnim - 13) / 6) * (0-(0)));
            yy = 0.775 + (((tickAnim - 13) / 6) * (2.17-(0.775)));
            zz = 0 + (((tickAnim - 13) / 6) * (-0.925-(0)));
        }
        else if (tickAnim >= 19 && tickAnim < 22) {
            xx = 0 + (((tickAnim - 19) / 3) * (0-(0)));
            yy = 2.17 + (((tickAnim - 19) / 3) * (2.17-(2.17)));
            zz = -0.925 + (((tickAnim - 19) / 3) * (-0.925-(-0.925)));
        }
        else if (tickAnim >= 22 && tickAnim < 25) {
            xx = 0 + (((tickAnim - 22) / 3) * (0-(0)));
            yy = 2.17 + (((tickAnim - 22) / 3) * (-0.45-(2.17)));
            zz = -0.925 + (((tickAnim - 22) / 3) * (0-(-0.925)));
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
            xx = 20.75 + (((tickAnim - 0) / 13) * (-48.7+Math.sin((Math.PI/180)*(((double)tickAnim/20)*150))*20-(20.75)));
            yy = 0 + (((tickAnim - 0) / 13) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 13) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 25) {
            xx = -48.7+Math.sin((Math.PI/180)*(((double)tickAnim/20)*150))*20 + (((tickAnim - 13) / 12) * (20.75-(-48.7+Math.sin((Math.PI/180)*(((double)tickAnim/20)*150))*20)));
            yy = 0 + (((tickAnim - 13) / 12) * (0-(0)));
            zz = 0 + (((tickAnim - 13) / 12) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftLeg, leftLeg.rotateAngleX + (float) Math.toRadians(xx), leftLeg.rotateAngleY + (float) Math.toRadians(yy), leftLeg.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 4) {
            xx = 5.5 + (((tickAnim - 0) / 4) * (51.73+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*-130-(5.5)));
            yy = 0 + (((tickAnim - 0) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 4) * (0-(0)));
        }
        else if (tickAnim >= 4 && tickAnim < 13) {
            xx = 51.73+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*-130 + (((tickAnim - 4) / 9) * (5-(51.73+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*-130)));
            yy = 0 + (((tickAnim - 4) / 9) * (0-(0)));
            zz = 0 + (((tickAnim - 4) / 9) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 25) {
            xx = 5 + (((tickAnim - 13) / 12) * (5.5-(5)));
            yy = 0 + (((tickAnim - 13) / 12) * (0-(0)));
            zz = 0 + (((tickAnim - 13) / 12) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftLeg2, leftLeg2.rotateAngleX + (float) Math.toRadians(xx), leftLeg2.rotateAngleY + (float) Math.toRadians(yy), leftLeg2.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 0) / 13) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 13) * (-0.85-(0)));
            zz = 0 + (((tickAnim - 0) / 13) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 14) {
            xx = 0 + (((tickAnim - 13) / 1) * (0-(0)));
            yy = -0.85 + (((tickAnim - 13) / 1) * (-0.845+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1220/0.5))*0.25-(-0.85)));
            zz = 0 + (((tickAnim - 13) / 1) * (0-(0)));
        }
        else if (tickAnim >= 14 && tickAnim < 17) {
            xx = 0 + (((tickAnim - 14) / 3) * (0-(0)));
            yy = -0.845+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1220/0.5))*0.25 + (((tickAnim - 14) / 3) * (-1.095-(-0.845+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1220/0.5))*0.25)));
            zz = 0 + (((tickAnim - 14) / 3) * (0-(0)));
        }
        else if (tickAnim >= 17 && tickAnim < 25) {
            xx = 0 + (((tickAnim - 17) / 8) * (0-(0)));
            yy = -1.095 + (((tickAnim - 17) / 8) * (0-(-1.095)));
            zz = 0 + (((tickAnim - 17) / 8) * (0-(0)));
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
            xx = 11.25 + (((tickAnim - 0) / 7) * (-17.2151+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*-130-(11.25)));
            yy = 0 + (((tickAnim - 0) / 7) * (-0.50206-(0)));
            zz = 0 + (((tickAnim - 0) / 7) * (-0.55163-(0)));
        }
        else if (tickAnim >= 7 && tickAnim < 9) {
            xx = -17.2151+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*-130 + (((tickAnim - 7) / 2) * (-104.5742+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*130-(-17.2151+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*-130)));
            yy = -0.50206 + (((tickAnim - 7) / 2) * (-0.62003-(-0.50206)));
            zz = -0.55163 + (((tickAnim - 7) / 2) * (-0.68126-(-0.55163)));
        }
        else if (tickAnim >= 9 && tickAnim < 13) {
            xx = -104.5742+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*130 + (((tickAnim - 9) / 4) * (12.939-(-104.5742+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*130)));
            yy = -0.62003 + (((tickAnim - 9) / 4) * (-1.16256-(-0.62003)));
            zz = -0.68126 + (((tickAnim - 9) / 4) * (-1.27735-(-0.68126)));
        }
        else if (tickAnim >= 13 && tickAnim < 25) {
            xx = 12.939 + (((tickAnim - 13) / 12) * (11.25-(12.939)));
            yy = -1.16256 + (((tickAnim - 13) / 12) * (0-(-1.16256)));
            zz = -1.27735 + (((tickAnim - 13) / 12) * (0-(-1.27735)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftLeg3, leftLeg3.rotateAngleX + (float) Math.toRadians(xx), leftLeg3.rotateAngleY + (float) Math.toRadians(yy), leftLeg3.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 0) / 13) * (0-(0)));
            yy = -0.475 + (((tickAnim - 0) / 13) * (-0.35-(-0.475)));
            zz = 0 + (((tickAnim - 0) / 13) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 25) {
            xx = 0 + (((tickAnim - 13) / 12) * (0-(0)));
            yy = -0.35 + (((tickAnim - 13) / 12) * (-0.475-(-0.35)));
            zz = 0 + (((tickAnim - 13) / 12) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.leftLeg3.rotationPointX = this.leftLeg3.rotationPointX + (float)(xx);
        this.leftLeg3.rotationPointY = this.leftLeg3.rotationPointY - (float)(yy);
        this.leftLeg3.rotationPointZ = this.leftLeg3.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 4) {
            xx = 37.75 + (((tickAnim - 0) / 4) * (84.47-(37.75)));
            yy = 0 + (((tickAnim - 0) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 4) * (0-(0)));
        }
        else if (tickAnim >= 4 && tickAnim < 9) {
            xx = 84.47 + (((tickAnim - 4) / 5) * (82.47-(84.47)));
            yy = 0 + (((tickAnim - 4) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 4) / 5) * (0-(0)));
        }
        else if (tickAnim >= 9 && tickAnim < 13) {
            xx = 82.47 + (((tickAnim - 9) / 4) * (6.75-(82.47)));
            yy = 0 + (((tickAnim - 9) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 9) / 4) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 18) {
            xx = 6.75 + (((tickAnim - 13) / 5) * (-5.28-(6.75)));
            yy = 0 + (((tickAnim - 13) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 13) / 5) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 25) {
            xx = -5.28 + (((tickAnim - 18) / 7) * (37.75-(-5.28)));
            yy = 0 + (((tickAnim - 18) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 18) / 7) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftLeg4, leftLeg4.rotateAngleX + (float) Math.toRadians(xx), leftLeg4.rotateAngleY + (float) Math.toRadians(yy), leftLeg4.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 7) {
            xx = 0 + (((tickAnim - 0) / 7) * (0-(0)));
            yy = 0.775 + (((tickAnim - 0) / 7) * (2.17-(0.775)));
            zz = 0 + (((tickAnim - 0) / 7) * (-0.925-(0)));
        }
        else if (tickAnim >= 7 && tickAnim < 9) {
            xx = 0 + (((tickAnim - 7) / 2) * (0-(0)));
            yy = 2.17 + (((tickAnim - 7) / 2) * (2.17-(2.17)));
            zz = -0.925 + (((tickAnim - 7) / 2) * (-0.925-(-0.925)));
        }
        else if (tickAnim >= 9 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 9) / 4) * (0-(0)));
            yy = 2.17 + (((tickAnim - 9) / 4) * (-0.45-(2.17)));
            zz = -0.925 + (((tickAnim - 9) / 4) * (0-(-0.925)));
        }
        else if (tickAnim >= 13 && tickAnim < 18) {
            xx = 0 + (((tickAnim - 13) / 5) * (0-(0)));
            yy = -0.45 + (((tickAnim - 13) / 5) * (7.745+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50+20))*-8-(-0.45)));
            zz = 0 + (((tickAnim - 13) / 5) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 25) {
            xx = 0 + (((tickAnim - 18) / 7) * (0-(0)));
            yy = 7.745+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50+20))*-8 + (((tickAnim - 18) / 7) * (0.775-(7.745+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50+20))*-8)));
            zz = 0 + (((tickAnim - 18) / 7) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.leftLeg4.rotationPointX = this.leftLeg4.rotationPointX + (float)(xx);
        this.leftLeg4.rotationPointY = this.leftLeg4.rotationPointY - (float)(yy);
        this.leftLeg4.rotationPointZ = this.leftLeg4.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 5) {
            xx = -14 + (((tickAnim - 0) / 5) * (17.75-(-14)));
            yy = 0 + (((tickAnim - 0) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 5) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 8) {
            xx = 17.75 + (((tickAnim - 5) / 3) * (17.75-(17.75)));
            yy = 0 + (((tickAnim - 5) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 5) / 3) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 13) {
            xx = 17.75 + (((tickAnim - 8) / 5) * (0-(17.75)));
            yy = 0 + (((tickAnim - 8) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 5) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 18) {
            xx = 0 + (((tickAnim - 13) / 5) * (0-(0)));
            yy = 0 + (((tickAnim - 13) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 13) / 5) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 22) {
            xx = 0 + (((tickAnim - 18) / 4) * (-38.25-(0)));
            yy = 0 + (((tickAnim - 18) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 18) / 4) * (0-(0)));
        }
        else if (tickAnim >= 22 && tickAnim < 25) {
            xx = -38.25 + (((tickAnim - 22) / 3) * (-14-(-38.25)));
            yy = 0 + (((tickAnim - 22) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 22) / 3) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftLeg5, leftLeg5.rotateAngleX + (float) Math.toRadians(xx), leftLeg5.rotateAngleY + (float) Math.toRadians(yy), leftLeg5.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 0) / 13) * (0-(0)));
            yy = -0.15 + (((tickAnim - 0) / 13) * (0-(-0.15)));
            zz = 0.8 + (((tickAnim - 0) / 13) * (0-(0.8)));
        }
        else if (tickAnim >= 13 && tickAnim < 18) {
            xx = 0 + (((tickAnim - 13) / 5) * (0-(0)));
            yy = 0 + (((tickAnim - 13) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 13) / 5) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 18) / 2) * (0-(0)));
            yy = 0 + (((tickAnim - 18) / 2) * (0.26-(0)));
            zz = 0 + (((tickAnim - 18) / 2) * (1.075-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 22) {
            xx = 0 + (((tickAnim - 20) / 2) * (0-(0)));
            yy = 0.26 + (((tickAnim - 20) / 2) * (-0.07-(0.26)));
            zz = 1.075 + (((tickAnim - 20) / 2) * (0.8-(1.075)));
        }
        else if (tickAnim >= 22 && tickAnim < 25) {
            xx = 0 + (((tickAnim - 22) / 3) * (0-(0)));
            yy = -0.07 + (((tickAnim - 22) / 3) * (-0.15-(-0.07)));
            zz = 0.8 + (((tickAnim - 22) / 3) * (0.8-(0.8)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.leftLeg5.rotationPointX = this.leftLeg5.rotationPointX + (float)(xx);
        this.leftLeg5.rotationPointY = this.leftLeg5.rotationPointY - (float)(yy);
        this.leftLeg5.rotationPointZ = this.leftLeg5.rotationPointZ + (float)(zz);



        this.setRotateAngle(body2, body2.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*288/0.5-250))*-3), body2.rotateAngleY + (float) Math.toRadians(0), body2.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*288-150))*-2.5));



        if (tickAnim >= 0 && tickAnim < 6) {
            xx = 0 + (((tickAnim - 0) / 6) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 6) * (0-(0)));
        }
        else if (tickAnim >= 6 && tickAnim < 9) {
            xx = 0 + (((tickAnim - 6) / 3) * (-38.25-(0)));
            yy = 0 + (((tickAnim - 6) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 6) / 3) * (0-(0)));
        }
        else if (tickAnim >= 9 && tickAnim < 13) {
            xx = -38.25 + (((tickAnim - 9) / 4) * (-14-(-38.25)));
            yy = 0 + (((tickAnim - 9) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 9) / 4) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 18) {
            xx = -14 + (((tickAnim - 13) / 5) * (17.75-(-14)));
            yy = 0 + (((tickAnim - 13) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 13) / 5) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 21) {
            xx = 17.75 + (((tickAnim - 18) / 3) * (17.75-(17.75)));
            yy = 0 + (((tickAnim - 18) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 18) / 3) * (0-(0)));
        }
        else if (tickAnim >= 21 && tickAnim < 25) {
            xx = 17.75 + (((tickAnim - 21) / 4) * (0-(17.75)));
            yy = 0 + (((tickAnim - 21) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 21) / 4) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightLeg5, rightLeg5.rotateAngleX + (float) Math.toRadians(xx), rightLeg5.rotateAngleY + (float) Math.toRadians(yy), rightLeg5.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 6) {
            xx = 0 + (((tickAnim - 0) / 6) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 6) * (0-(0)));
        }
        else if (tickAnim >= 6 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 6) / 2) * (0-(0)));
            yy = 0 + (((tickAnim - 6) / 2) * (0.26-(0)));
            zz = 0 + (((tickAnim - 6) / 2) * (1.075-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 9) {
            xx = 0 + (((tickAnim - 8) / 1) * (0-(0)));
            yy = 0.26 + (((tickAnim - 8) / 1) * (-0.07-(0.26)));
            zz = 1.075 + (((tickAnim - 8) / 1) * (0.8-(1.075)));
        }
        else if (tickAnim >= 9 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 9) / 4) * (0-(0)));
            yy = -0.07 + (((tickAnim - 9) / 4) * (-0.15-(-0.07)));
            zz = 0.8 + (((tickAnim - 9) / 4) * (0.8-(0.8)));
        }
        else if (tickAnim >= 13 && tickAnim < 25) {
            xx = 0 + (((tickAnim - 13) / 12) * (0-(0)));
            yy = -0.15 + (((tickAnim - 13) / 12) * (0-(-0.15)));
            zz = 0.8 + (((tickAnim - 13) / 12) * (0-(0.8)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.rightLeg5.rotationPointX = this.rightLeg5.rotationPointX + (float)(xx);
        this.rightLeg5.rotationPointY = this.rightLeg5.rotationPointY - (float)(yy);
        this.rightLeg5.rotationPointZ = this.rightLeg5.rotationPointZ + (float)(zz);



        this.setRotateAngle(hips, hips.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*288/0.5-90))*-3), hips.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*288-80))*-1), hips.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*288-80))*-1.5));

        if (tickAnim >= 0 && tickAnim < 2) {
            xx = 0 + (((tickAnim - 0) / 2) * (0-(0)));
            yy = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*288/0.5-10))*0.55 + (((tickAnim - 0) / 2) * (-0.15+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1220-10))*0.25-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*288/0.5-10))*0.55)));
            zz = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*288/0.5-80))*-0.7 + (((tickAnim - 0) / 2) * (0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*288/0.5-80))*-0.7-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*288/0.5-80))*-0.7)));
        }
        else if (tickAnim >= 2 && tickAnim < 3) {
            xx = 0 + (((tickAnim - 2) / 1) * (0-(0)));
            yy = -0.15+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1220-10))*0.25 + (((tickAnim - 2) / 1) * (0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*288/0.5-10))*0.55-(-0.15+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1220-10))*0.25)));
            zz = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*288/0.5-80))*-0.7 + (((tickAnim - 2) / 1) * (0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*288/0.5-80))*-0.7-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*288/0.5-80))*-0.7)));
        }
        else if (tickAnim >= 3 && tickAnim < 11) {
            xx = 0 + (((tickAnim - 3) / 8) * (0-(0)));
            yy = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*288/0.5-10))*0.55 + (((tickAnim - 3) / 8) * (0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*288/0.5-10))*0.55-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*288/0.5-10))*0.55)));
            zz = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*288/0.5-80))*-0.7 + (((tickAnim - 3) / 8) * (0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*288/0.5-80))*-0.7-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*288/0.5-80))*-0.7)));
        }
        else if (tickAnim >= 11 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 11) / 2) * (0-(0)));
            yy = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*288/0.5-10))*0.55 + (((tickAnim - 11) / 2) * (0.225+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1220+50))*-0.25-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*288/0.5-10))*0.55)));
            zz = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*288/0.5-80))*-0.7 + (((tickAnim - 11) / 2) * (0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*288/0.5-80))*-0.7-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*288/0.5-80))*-0.7)));
        }
        else if (tickAnim >= 13 && tickAnim < 14) {
            xx = 0 + (((tickAnim - 13) / 1) * (0-(0)));
            yy = 0.225+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1220+50))*-0.25 + (((tickAnim - 13) / 1) * (0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*288/0.5-10))*0.55-(0.225+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1220+50))*-0.25)));
            zz = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*288/0.5-80))*-0.7 + (((tickAnim - 13) / 1) * (0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*288/0.5-80))*-0.7-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*288/0.5-80))*-0.7)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.hips.rotationPointX = this.hips.rotationPointX + (float)(xx);
        this.hips.rotationPointY = this.hips.rotationPointY - (float)(yy);
        this.hips.rotationPointZ = this.hips.rotationPointZ + (float)(zz);



        this.setRotateAngle(body, body.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*288/0.5-190))*-3), body.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*288-80))*1), body.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*288-100))*2.5));


        this.setRotateAngle(neck3, neck3.rotateAngleX + (float) Math.toRadians(-9.25+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*288/0.5-450))*-4), neck3.rotateAngleY + (float) Math.toRadians(0), neck3.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(head, head.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*288/0.5-650))*-4), head.rotateAngleY + (float) Math.toRadians(0), head.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(leftarm, leftarm.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*288/0.5-250))*-3), leftarm.rotateAngleY + (float) Math.toRadians(0), leftarm.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*288-150))*-2.5));


        this.setRotateAngle(leftarm2, leftarm2.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*288/0.5-300))*-3), leftarm2.rotateAngleY + (float) Math.toRadians(0), leftarm2.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*288-150))*-2.5));


        this.setRotateAngle(rightarm, rightarm.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*288/0.5-250))*-3), rightarm.rotateAngleY + (float) Math.toRadians(0), rightarm.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*288-150))*-2.5));


        this.setRotateAngle(rightarm2, rightarm2.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*288/0.5-300))*-3), rightarm2.rotateAngleY + (float) Math.toRadians(0), rightarm2.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*288-150))*-2.5));


        this.setRotateAngle(tail, tail.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*288/0.5))*3), tail.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*288-100))*-2), tail.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*288-80))*-1.5));


        this.setRotateAngle(tail2, tail2.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*288/0.5-170))*-3), tail2.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*288-120))*-4), tail2.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*288-80))*-1.5));


        this.setRotateAngle(tail3, tail3.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*288/0.5-200))*-3), tail3.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*288-150))*-6), tail3.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*288-80))*-1.5));


        this.setRotateAngle(tail4, tail4.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*288/0.5-250))*-3), tail4.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*288-170))*-8), tail4.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*288-80))*-1.5));


        this.setRotateAngle(tail5, tail5.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*288/0.5-300))*-3), tail5.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*288-190))*-12), tail5.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*288-80))*-1.5));


        this.setRotateAngle(tail6, tail6.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*288/0.5-350))*-3), tail6.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*288-220))*-12), tail6.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*288-80))*-1.5));

    }
    public void animWalking(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime) {
        EntityPrehistoricFloraSinotyrannus entity = (EntityPrehistoricFloraSinotyrannus) entitylivingbaseIn;
        int animCycle = 55;
        double tickAnim = (entity.ticksExisted + entity.getTickOffset()) - (int) (Math.floor((double) (entity.ticksExisted + entity.getTickOffset()) / (double) animCycle) * (double) animCycle) + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;

        if (tickAnim >= 0 && tickAnim < 28) {
            xx = -23.75 + (((tickAnim - 0) / 28) * (20.75-(-23.75)));
            yy = 0 + (((tickAnim - 0) / 28) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 28) * (0-(0)));
        }
        else if (tickAnim >= 28 && tickAnim < 46) {
            xx = 20.75 + (((tickAnim - 28) / 18) * (-46.035+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50+30))*30-(20.75)));
            yy = 0 + (((tickAnim - 28) / 18) * (0-(0)));
            zz = 0 + (((tickAnim - 28) / 18) * (0-(0)));
        }
        else if (tickAnim >= 46 && tickAnim < 55) {
            xx = -46.035+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50+30))*30 + (((tickAnim - 46) / 9) * (-23.75-(-46.035+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50+30))*30)));
            yy = 0 + (((tickAnim - 46) / 9) * (0-(0)));
            zz = 0 + (((tickAnim - 46) / 9) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightLeg, rightLeg.rotateAngleX + (float) Math.toRadians(xx), rightLeg.rotateAngleY + (float) Math.toRadians(yy), rightLeg.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 28) {
            xx = 5 + (((tickAnim - 0) / 28) * (5.5-(5)));
            yy = 0 + (((tickAnim - 0) / 28) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 28) * (0-(0)));
        }
        else if (tickAnim >= 28 && tickAnim < 35) {
            xx = 5.5 + (((tickAnim - 28) / 7) * (-17.785+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50-20))*50-(5.5)));
            yy = 0 + (((tickAnim - 28) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 28) / 7) * (0-(0)));
        }
        else if (tickAnim >= 35 && tickAnim < 42) {
            xx = -17.785+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50-20))*50 + (((tickAnim - 35) / 7) * (54.34+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50-80))*-80-(-17.785+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50-20))*50)));
            yy = 0 + (((tickAnim - 35) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 35) / 7) * (0-(0)));
        }
        else if (tickAnim >= 42 && tickAnim < 55) {
            xx = 54.34+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50-80))*-80 + (((tickAnim - 42) / 13) * (5-(54.34+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50-80))*-80)));
            yy = 0 + (((tickAnim - 42) / 13) * (0-(0)));
            zz = 0 + (((tickAnim - 42) / 13) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightLeg2, rightLeg2.rotateAngleX + (float) Math.toRadians(xx), rightLeg2.rotateAngleY + (float) Math.toRadians(yy), rightLeg2.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 28) {
            xx = 0 + (((tickAnim - 0) / 28) * (0-(0)));
            yy = -0.825 + (((tickAnim - 0) / 28) * (0-(-0.825)));
            zz = 0 + (((tickAnim - 0) / 28) * (0-(0)));
        }
        else if (tickAnim >= 28 && tickAnim < 55) {
            xx = 0 + (((tickAnim - 28) / 27) * (0-(0)));
            yy = 0 + (((tickAnim - 28) / 27) * (-0.825-(0)));
            zz = 0 + (((tickAnim - 28) / 27) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.rightLeg2.rotationPointX = this.rightLeg2.rotationPointX + (float)(xx);
        this.rightLeg2.rotationPointY = this.rightLeg2.rotationPointY - (float)(yy);
        this.rightLeg2.rotationPointZ = this.rightLeg2.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 28) {
            xx = 12.939 + (((tickAnim - 0) / 28) * (11.25-(12.939)));
            yy = -1.16256 + (((tickAnim - 0) / 28) * (0-(-1.16256)));
            zz = -1.27735 + (((tickAnim - 0) / 28) * (0-(-1.27735)));
        }
        else if (tickAnim >= 28 && tickAnim < 38) {
            xx = 11.25 + (((tickAnim - 28) / 10) * (-24.2472+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50-90))*-50-(11.25)));
            yy = 0 + (((tickAnim - 28) / 10) * (-0.3633-(0)));
            zz = 0 + (((tickAnim - 28) / 10) * (-0.39917-(0)));
        }
        else if (tickAnim >= 38 && tickAnim < 43) {
            xx = -24.2472+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50-90))*-50 + (((tickAnim - 38) / 5) * (-75.3946+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50-90))*100-(-24.2472+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50-90))*-50)));
            yy = -0.3633 + (((tickAnim - 38) / 5) * (-0.3633-(-0.3633)));
            zz = -0.39917 + (((tickAnim - 38) / 5) * (-0.39917-(-0.39917)));
        }
        else if (tickAnim >= 43 && tickAnim < 55) {
            xx = -75.3946+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50-90))*100 + (((tickAnim - 43) / 12) * (12.939-(-75.3946+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50-90))*100)));
            yy = -0.3633 + (((tickAnim - 43) / 12) * (-1.16256-(-0.3633)));
            zz = -0.39917 + (((tickAnim - 43) / 12) * (-1.27735-(-0.39917)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightLeg3, rightLeg3.rotateAngleX + (float) Math.toRadians(xx), rightLeg3.rotateAngleY + (float) Math.toRadians(yy), rightLeg3.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            yy = -0.35 + (((tickAnim - 0) / 3) * (-0.35+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1220))*-0.15-(-0.35)));
            zz = 0 + (((tickAnim - 0) / 3) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 6) {
            xx = 0 + (((tickAnim - 3) / 3) * (0-(0)));
            yy = -0.35+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1220))*-0.15 + (((tickAnim - 3) / 3) * (-0.35-(-0.35+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1220))*-0.15)));
            zz = 0 + (((tickAnim - 3) / 3) * (0-(0)));
        }
        else if (tickAnim >= 6 && tickAnim < 28) {
            xx = 0 + (((tickAnim - 6) / 22) * (0-(0)));
            yy = -0.35 + (((tickAnim - 6) / 22) * (-0.475-(-0.35)));
            zz = 0 + (((tickAnim - 6) / 22) * (0-(0)));
        }
        else if (tickAnim >= 28 && tickAnim < 40) {
            xx = 0 + (((tickAnim - 28) / 12) * (0-(0)));
            yy = -0.475 + (((tickAnim - 28) / 12) * (-0.42-(-0.475)));
            zz = 0 + (((tickAnim - 28) / 12) * (3.075-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 46) {
            xx = 0 + (((tickAnim - 40) / 6) * (0-(0)));
            yy = -0.42 + (((tickAnim - 40) / 6) * (-0.42-(-0.42)));
            zz = 3.075 + (((tickAnim - 40) / 6) * (3.075-(3.075)));
        }
        else if (tickAnim >= 46 && tickAnim < 55) {
            xx = 0 + (((tickAnim - 46) / 9) * (0-(0)));
            yy = -0.42 + (((tickAnim - 46) / 9) * (-0.35-(-0.42)));
            zz = 3.075 + (((tickAnim - 46) / 9) * (0-(3.075)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.rightLeg3.rotationPointX = this.rightLeg3.rotationPointX + (float)(xx);
        this.rightLeg3.rotationPointY = this.rightLeg3.rotationPointY - (float)(yy);
        this.rightLeg3.rotationPointZ = this.rightLeg3.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 14) {
            xx = 3.75 + (((tickAnim - 0) / 14) * (-14.38-(3.75)));
            yy = 0 + (((tickAnim - 0) / 14) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 14) * (0-(0)));
        }
        else if (tickAnim >= 14 && tickAnim < 28) {
            xx = -14.38 + (((tickAnim - 14) / 14) * (37.75-(-14.38)));
            yy = 0 + (((tickAnim - 14) / 14) * (0-(0)));
            zz = 0 + (((tickAnim - 14) / 14) * (0-(0)));
        }
        else if (tickAnim >= 28 && tickAnim < 37) {
            xx = 37.75 + (((tickAnim - 28) / 9) * (86.54-(37.75)));
            yy = 0 + (((tickAnim - 28) / 9) * (0-(0)));
            zz = 0 + (((tickAnim - 28) / 9) * (0-(0)));
        }
        else if (tickAnim >= 37 && tickAnim < 43) {
            xx = 86.54 + (((tickAnim - 37) / 6) * (87.54-(86.54)));
            yy = 0 + (((tickAnim - 37) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 37) / 6) * (0-(0)));
        }
        else if (tickAnim >= 43 && tickAnim < 55) {
            xx = 87.54 + (((tickAnim - 43) / 12) * (3.75-(87.54)));
            yy = 0 + (((tickAnim - 43) / 12) * (0-(0)));
            zz = 0 + (((tickAnim - 43) / 12) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightLeg4, rightLeg4.rotateAngleX + (float) Math.toRadians(xx), rightLeg4.rotateAngleY + (float) Math.toRadians(yy), rightLeg4.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 14) {
            xx = 0 + (((tickAnim - 0) / 14) * (0-(0)));
            yy = 0.55 + (((tickAnim - 0) / 14) * (2.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*-5-(0.55)));
            zz = 0 + (((tickAnim - 0) / 14) * (0-(0)));
        }
        else if (tickAnim >= 14 && tickAnim < 28) {
            xx = 0 + (((tickAnim - 14) / 14) * (0-(0)));
            yy = 2.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*-5 + (((tickAnim - 14) / 14) * (0.775-(2.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*-5)));
            zz = 0 + (((tickAnim - 14) / 14) * (0-(0)));
        }
        else if (tickAnim >= 28 && tickAnim < 55) {
            xx = 0 + (((tickAnim - 28) / 27) * (0-(0)));
            yy = 0.775 + (((tickAnim - 28) / 27) * (0.55-(0.775)));
            zz = 0 + (((tickAnim - 28) / 27) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.rightLeg4.rotationPointX = this.rightLeg4.rotationPointX + (float)(xx);
        this.rightLeg4.rotationPointY = this.rightLeg4.rotationPointY - (float)(yy);
        this.rightLeg4.rotationPointZ = this.rightLeg4.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 19) {
            xx = 20.75 + (((tickAnim - 0) / 19) * (-48.485+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50-90))*-30-(20.75)));
            yy = 0 + (((tickAnim - 0) / 19) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 19) * (0-(0)));
        }
        else if (tickAnim >= 19 && tickAnim < 27) {
            xx = -48.485+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50-90))*-30 + (((tickAnim - 19) / 8) * (-23.75-(-48.485+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50-90))*-30)));
            yy = 0 + (((tickAnim - 19) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 19) / 8) * (0-(0)));
        }
        else if (tickAnim >= 27 && tickAnim < 55) {
            xx = -23.75 + (((tickAnim - 27) / 28) * (20.75-(-23.75)));
            yy = 0 + (((tickAnim - 27) / 28) * (0-(0)));
            zz = 0 + (((tickAnim - 27) / 28) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftLeg, leftLeg.rotateAngleX + (float) Math.toRadians(xx), leftLeg.rotateAngleY + (float) Math.toRadians(yy), leftLeg.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 7) {
            xx = 5.5 + (((tickAnim - 0) / 7) * (39.49+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50-30))*50-(5.5)));
            yy = 0 + (((tickAnim - 0) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 7) * (0-(0)));
        }
        else if (tickAnim >= 7 && tickAnim < 20) {
            xx = 39.49+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50-30))*50 + (((tickAnim - 7) / 13) * (-18.785+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50-80))*-80-(39.49+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50-30))*50)));
            yy = 0 + (((tickAnim - 7) / 13) * (0-(0)));
            zz = 0 + (((tickAnim - 7) / 13) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 27) {
            xx = -18.785+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50-80))*-80 + (((tickAnim - 20) / 7) * (5-(-18.785+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50-80))*-80)));
            yy = 0 + (((tickAnim - 20) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 7) * (0-(0)));
        }
        else if (tickAnim >= 27 && tickAnim < 55) {
            xx = 5 + (((tickAnim - 27) / 28) * (5.5-(5)));
            yy = 0 + (((tickAnim - 27) / 28) * (0-(0)));
            zz = 0 + (((tickAnim - 27) / 28) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftLeg2, leftLeg2.rotateAngleX + (float) Math.toRadians(xx), leftLeg2.rotateAngleY + (float) Math.toRadians(yy), leftLeg2.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 27) {
            xx = 0 + (((tickAnim - 0) / 27) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 27) * (-0.825-(0)));
            zz = 0 + (((tickAnim - 0) / 27) * (0-(0)));
        }
        else if (tickAnim >= 27 && tickAnim < 55) {
            xx = 0 + (((tickAnim - 27) / 28) * (0-(0)));
            yy = -0.825 + (((tickAnim - 27) / 28) * (0-(-0.825)));
            zz = 0 + (((tickAnim - 27) / 28) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.leftLeg2.rotationPointX = this.leftLeg2.rotationPointX + (float)(xx);
        this.leftLeg2.rotationPointY = this.leftLeg2.rotationPointY - (float)(yy);
        this.leftLeg2.rotationPointZ = this.leftLeg2.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 11.25 + (((tickAnim - 0) / 10) * (-78.3722+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50-90))*-50-(11.25)));
            yy = 0 + (((tickAnim - 0) / 10) * (-0.3633-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (-0.39917-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 18) {
            xx = -78.3722+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50-90))*-50 + (((tickAnim - 10) / 8) * (47.9554+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50-120))*100-(-78.3722+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50-90))*-50)));
            yy = -0.3633 + (((tickAnim - 10) / 8) * (-0.3633-(-0.3633)));
            zz = -0.39917 + (((tickAnim - 10) / 8) * (-0.39917-(-0.39917)));
        }
        else if (tickAnim >= 18 && tickAnim < 27) {
            xx = 47.9554+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50-120))*100 + (((tickAnim - 18) / 9) * (12.939-(47.9554+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50-120))*100)));
            yy = -0.3633 + (((tickAnim - 18) / 9) * (-1.16256-(-0.3633)));
            zz = -0.39917 + (((tickAnim - 18) / 9) * (-1.27735-(-0.39917)));
        }
        else if (tickAnim >= 27 && tickAnim < 55) {
            xx = 12.939 + (((tickAnim - 27) / 28) * (11.25-(12.939)));
            yy = -1.16256 + (((tickAnim - 27) / 28) * (0-(-1.16256)));
            zz = -1.27735 + (((tickAnim - 27) / 28) * (0-(-1.27735)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftLeg3, leftLeg3.rotateAngleX + (float) Math.toRadians(xx), leftLeg3.rotateAngleY + (float) Math.toRadians(yy), leftLeg3.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 12) {
            xx = 0 + (((tickAnim - 0) / 12) * (0-(0)));
            yy = -0.475 + (((tickAnim - 0) / 12) * (-0.42-(-0.475)));
            zz = 0 + (((tickAnim - 0) / 12) * (3.075-(0)));
        }
        else if (tickAnim >= 12 && tickAnim < 18) {
            xx = 0 + (((tickAnim - 12) / 6) * (0-(0)));
            yy = -0.42 + (((tickAnim - 12) / 6) * (-0.42-(-0.42)));
            zz = 3.075 + (((tickAnim - 12) / 6) * (3.075-(3.075)));
        }
        else if (tickAnim >= 18 && tickAnim < 27) {
            xx = 0 + (((tickAnim - 18) / 9) * (0-(0)));
            yy = -0.42 + (((tickAnim - 18) / 9) * (-0.35-(-0.42)));
            zz = 3.075 + (((tickAnim - 18) / 9) * (0-(3.075)));
        }
        else if (tickAnim >= 27 && tickAnim < 29) {
            xx = 0 + (((tickAnim - 27) / 2) * (0-(0)));
            yy = -0.35 + (((tickAnim - 27) / 2) * (-0.35+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1220))*0.15-(-0.35)));
            zz = 0 + (((tickAnim - 27) / 2) * (0-(0)));
        }
        else if (tickAnim >= 29 && tickAnim < 33) {
            xx = 0 + (((tickAnim - 29) / 4) * (0-(0)));
            yy = -0.35+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1220))*0.15 + (((tickAnim - 29) / 4) * (-0.35-(-0.35+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1220))*0.15)));
            zz = 0 + (((tickAnim - 29) / 4) * (0-(0)));
        }
        else if (tickAnim >= 33 && tickAnim < 55) {
            xx = 0 + (((tickAnim - 33) / 22) * (0-(0)));
            yy = -0.35 + (((tickAnim - 33) / 22) * (-0.475-(-0.35)));
            zz = 0 + (((tickAnim - 33) / 22) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.leftLeg3.rotationPointX = this.leftLeg3.rotationPointX + (float)(xx);
        this.leftLeg3.rotationPointY = this.leftLeg3.rotationPointY - (float)(yy);
        this.leftLeg3.rotationPointZ = this.leftLeg3.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 8) {
            xx = 37.75 + (((tickAnim - 0) / 8) * (86.54-(37.75)));
            yy = 0 + (((tickAnim - 0) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 8) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 18) {
            xx = 86.54 + (((tickAnim - 8) / 10) * (86.54-(86.54)));
            yy = 0 + (((tickAnim - 8) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 10) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 27) {
            xx = 86.54 + (((tickAnim - 18) / 9) * (3.75-(86.54)));
            yy = 0 + (((tickAnim - 18) / 9) * (0-(0)));
            zz = 0 + (((tickAnim - 18) / 9) * (0-(0)));
        }
        else if (tickAnim >= 27 && tickAnim < 41) {
            xx = 3.75 + (((tickAnim - 27) / 14) * (-15.13-(3.75)));
            yy = 0 + (((tickAnim - 27) / 14) * (0-(0)));
            zz = 0 + (((tickAnim - 27) / 14) * (0-(0)));
        }
        else if (tickAnim >= 41 && tickAnim < 55) {
            xx = -15.13 + (((tickAnim - 41) / 14) * (37.75-(-15.13)));
            yy = 0 + (((tickAnim - 41) / 14) * (0-(0)));
            zz = 0 + (((tickAnim - 41) / 14) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftLeg4, leftLeg4.rotateAngleX + (float) Math.toRadians(xx), leftLeg4.rotateAngleY + (float) Math.toRadians(yy), leftLeg4.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 27) {
            xx = 0 + (((tickAnim - 0) / 27) * (0-(0)));
            yy = 0.775 + (((tickAnim - 0) / 27) * (0.475-(0.775)));
            zz = 0 + (((tickAnim - 0) / 27) * (0-(0)));
        }
        else if (tickAnim >= 27 && tickAnim < 41) {
            xx = 0 + (((tickAnim - 27) / 14) * (0-(0)));
            yy = 0.475 + (((tickAnim - 27) / 14) * (3.425+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50-50))*-5-(0.475)));
            zz = 0 + (((tickAnim - 27) / 14) * (0-(0)));
        }
        else if (tickAnim >= 41 && tickAnim < 55) {
            xx = 0 + (((tickAnim - 41) / 14) * (0-(0)));
            yy = 3.425+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50-50))*-5 + (((tickAnim - 41) / 14) * (0.775-(3.425+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50-50))*-5)));
            zz = 0 + (((tickAnim - 41) / 14) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.leftLeg4.rotationPointX = this.leftLeg4.rotationPointX + (float)(xx);
        this.leftLeg4.rotationPointY = this.leftLeg4.rotationPointY - (float)(yy);
        this.leftLeg4.rotationPointZ = this.leftLeg4.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 8) {
            xx = -14 + (((tickAnim - 0) / 8) * (20.31-(-14)));
            yy = 0 + (((tickAnim - 0) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 8) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 18) {
            xx = 20.31 + (((tickAnim - 8) / 10) * (20.31-(20.31)));
            yy = 0 + (((tickAnim - 8) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 10) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 27) {
            xx = 20.31 + (((tickAnim - 18) / 9) * (0-(20.31)));
            yy = 0 + (((tickAnim - 18) / 9) * (0-(0)));
            zz = 0 + (((tickAnim - 18) / 9) * (0-(0)));
        }
        else if (tickAnim >= 27 && tickAnim < 41) {
            xx = 0 + (((tickAnim - 27) / 14) * (0-(0)));
            yy = 0 + (((tickAnim - 27) / 14) * (0-(0)));
            zz = 0 + (((tickAnim - 27) / 14) * (0-(0)));
        }
        else if (tickAnim >= 41 && tickAnim < 48) {
            xx = 0 + (((tickAnim - 41) / 7) * (-29.76-(0)));
            yy = 0 + (((tickAnim - 41) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 41) / 7) * (0-(0)));
        }
        else if (tickAnim >= 48 && tickAnim < 55) {
            xx = -29.76 + (((tickAnim - 48) / 7) * (-14-(-29.76)));
            yy = 0 + (((tickAnim - 48) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 48) / 7) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftLeg5, leftLeg5.rotateAngleX + (float) Math.toRadians(xx), leftLeg5.rotateAngleY + (float) Math.toRadians(yy), leftLeg5.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 27) {
            xx = 0 + (((tickAnim - 0) / 27) * (0-(0)));
            yy = -0.15 + (((tickAnim - 0) / 27) * (0-(-0.15)));
            zz = 0.8 + (((tickAnim - 0) / 27) * (0-(0.8)));
        }
        else if (tickAnim >= 27 && tickAnim < 41) {
            xx = 0 + (((tickAnim - 27) / 14) * (0-(0)));
            yy = 0 + (((tickAnim - 27) / 14) * (0-(0)));
            zz = 0 + (((tickAnim - 27) / 14) * (0-(0)));
        }
        else if (tickAnim >= 41 && tickAnim < 48) {
            xx = 0 + (((tickAnim - 41) / 7) * (0-(0)));
            yy = 0 + (((tickAnim - 41) / 7) * (-0.21-(0)));
            zz = 0 + (((tickAnim - 41) / 7) * (1.555-(0)));
        }
        else if (tickAnim >= 48 && tickAnim < 55) {
            xx = 0 + (((tickAnim - 48) / 7) * (0-(0)));
            yy = -0.21 + (((tickAnim - 48) / 7) * (-0.15-(-0.21)));
            zz = 1.555 + (((tickAnim - 48) / 7) * (0.8-(1.555)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.leftLeg5.rotationPointX = this.leftLeg5.rotationPointX + (float)(xx);
        this.leftLeg5.rotationPointY = this.leftLeg5.rotationPointY - (float)(yy);
        this.leftLeg5.rotationPointZ = this.leftLeg5.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 14) {
            xx = 0 + (((tickAnim - 0) / 14) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 14) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 14) * (0-(0)));
        }
        else if (tickAnim >= 14 && tickAnim < 22) {
            xx = 0 + (((tickAnim - 14) / 8) * (-29.76-(0)));
            yy = 0 + (((tickAnim - 14) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 14) / 8) * (0-(0)));
        }
        else if (tickAnim >= 22 && tickAnim < 28) {
            xx = -29.76 + (((tickAnim - 22) / 6) * (-14-(-29.76)));
            yy = 0 + (((tickAnim - 22) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 22) / 6) * (0-(0)));
        }
        else if (tickAnim >= 28 && tickAnim < 35) {
            xx = -14 + (((tickAnim - 28) / 7) * (20.31-(-14)));
            yy = 0 + (((tickAnim - 28) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 28) / 7) * (0-(0)));
        }
        else if (tickAnim >= 35 && tickAnim < 43) {
            xx = 20.31 + (((tickAnim - 35) / 8) * (21.31-(20.31)));
            yy = 0 + (((tickAnim - 35) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 35) / 8) * (0-(0)));
        }
        else if (tickAnim >= 43 && tickAnim < 55) {
            xx = 21.31 + (((tickAnim - 43) / 12) * (0-(21.31)));
            yy = 0 + (((tickAnim - 43) / 12) * (0-(0)));
            zz = 0 + (((tickAnim - 43) / 12) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightLeg5, rightLeg5.rotateAngleX + (float) Math.toRadians(xx), rightLeg5.rotateAngleY + (float) Math.toRadians(yy), rightLeg5.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 14) {
            xx = 0 + (((tickAnim - 0) / 14) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 14) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 14) * (0-(0)));
        }
        else if (tickAnim >= 14 && tickAnim < 22) {
            xx = 0 + (((tickAnim - 14) / 8) * (0-(0)));
            yy = 0 + (((tickAnim - 14) / 8) * (0.065-(0)));
            zz = 0 + (((tickAnim - 14) / 8) * (1.555-(0)));
        }
        else if (tickAnim >= 22 && tickAnim < 28) {
            xx = 0 + (((tickAnim - 22) / 6) * (0-(0)));
            yy = 0.065 + (((tickAnim - 22) / 6) * (-0.15-(0.065)));
            zz = 1.555 + (((tickAnim - 22) / 6) * (0.8-(1.555)));
        }
        else if (tickAnim >= 28 && tickAnim < 55) {
            xx = 0 + (((tickAnim - 28) / 27) * (0-(0)));
            yy = -0.15 + (((tickAnim - 28) / 27) * (0-(-0.15)));
            zz = 0.8 + (((tickAnim - 28) / 27) * (0-(0.8)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.rightLeg5.rotationPointX = this.rightLeg5.rotationPointX + (float)(xx);
        this.rightLeg5.rotationPointY = this.rightLeg5.rotationPointY - (float)(yy);
        this.rightLeg5.rotationPointZ = this.rightLeg5.rotationPointZ + (float)(zz);



        this.setRotateAngle(hips, hips.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*131/0.5-60))*-2), hips.rotateAngleY + (float) Math.toRadians(0), hips.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*131-60))*-2));
        this.hips.rotationPointX = this.hips.rotationPointX + (float)(0);
        this.hips.rotationPointY = this.hips.rotationPointY - (float)(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*131/0.5-120))*0.6);
        this.hips.rotationPointZ = this.hips.rotationPointZ + (float)(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*131/0.5-190))*-0.6);


        this.setRotateAngle(body, body.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*131/0.5-120))*2.5), body.rotateAngleY + (float) Math.toRadians(0), body.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*131-20))*-2));


        this.setRotateAngle(body2, body2.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*131/0.5-190))*-3), body2.rotateAngleY + (float) Math.toRadians(0), body2.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*131-40))*2));


        this.setRotateAngle(neck, neck.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*131/0.5-130))*-3), neck.rotateAngleY + (float) Math.toRadians(0), neck.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(neck2, neck2.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*131/0.5-250))*-3), neck2.rotateAngleY + (float) Math.toRadians(0), neck2.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(neck3, neck3.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*131/0.5-450))*-3), neck3.rotateAngleY + (float) Math.toRadians(0), neck3.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(neck4, neck4.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*131/0.5-550))*3), neck4.rotateAngleY + (float) Math.toRadians(0), neck4.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(head, head.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*131/0.5-650))*-2), head.rotateAngleY + (float) Math.toRadians(0), head.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(featherbeard1, featherbeard1.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*131/0.5-550))*2), featherbeard1.rotateAngleY + (float) Math.toRadians(0), featherbeard1.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(featherbeard2, featherbeard2.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*131/0.5-500))*0.8), featherbeard2.rotateAngleY + (float) Math.toRadians(0), featherbeard2.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(neckfeathers2, neckfeathers2.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*131/0.5-550))*2), neckfeathers2.rotateAngleY + (float) Math.toRadians(0), neckfeathers2.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(neckfeathers3, neckfeathers3.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*131/0.5-550))*2), neckfeathers3.rotateAngleY + (float) Math.toRadians(0), neckfeathers3.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(neckfeathers4, neckfeathers4.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*131/0.5-550))*2), neckfeathers4.rotateAngleY + (float) Math.toRadians(0), neckfeathers4.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(neckfeathers1, neckfeathers1.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*131/0.5-550))*2), neckfeathers1.rotateAngleY + (float) Math.toRadians(0), neckfeathers1.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(leftarm, leftarm.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*131/0.5-230))*-2), leftarm.rotateAngleY + (float) Math.toRadians(0), leftarm.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*131-40))*2));


        this.setRotateAngle(leftarm2, leftarm2.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*131/0.5-290))*2), leftarm2.rotateAngleY + (float) Math.toRadians(0), leftarm2.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*131-80))*2));


        this.setRotateAngle(rightarm, rightarm.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*131/0.5-230))*-2), rightarm.rotateAngleY + (float) Math.toRadians(0), rightarm.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*131-40))*2));


        this.setRotateAngle(rightarm2, rightarm2.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*131/0.5-290))*2), rightarm2.rotateAngleY + (float) Math.toRadians(0), rightarm2.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*131-80))*2));


        this.setRotateAngle(tail, tail.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*131/0.5))*3), tail.rotateAngleY + (float) Math.toRadians(0), tail.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*131-60))*-2));


        this.setRotateAngle(tail2, tail2.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*131/0.5-50))*3), tail2.rotateAngleY + (float) Math.toRadians(0), tail2.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*131-100))*-2));


        this.setRotateAngle(tail3, tail3.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*131/0.5-100))*3), tail3.rotateAngleY + (float) Math.toRadians(0), tail3.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*131-160))*-2));


        this.setRotateAngle(tail4, tail4.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*131/0.5-150))*3), tail4.rotateAngleY + (float) Math.toRadians(0), tail4.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*131-200))*-2));


        this.setRotateAngle(tail5, tail5.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*131/0.5-200))*3), tail5.rotateAngleY + (float) Math.toRadians(0), tail5.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*131-260))*-2));


        this.setRotateAngle(tail6, tail6.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*131/0.5-250))*3), tail6.rotateAngleY + (float) Math.toRadians(0), tail6.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*131-300))*-2));


    }




    @Override
    public void setLivingAnimations(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime) {
        super.setLivingAnimations(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime);
        this.resetToDefaultPose();
        EntityPrehistoricFloraSinotyrannus ee = (EntityPrehistoricFloraSinotyrannus) entitylivingbaseIn;

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
            animNoise(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime, ee.getAnimationTick());
        }
        else if (ee.getAnimation() == ee.ROAR_ANIMATION) { //The actual roar/anim
            animRoar(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime, ee.getAnimationTick());
        }
        else if (ee.getAnimation() == ee.STAND_ANIMATION) { //The actual roar/anim
            //animAlert(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime, ee.getAnimationTick());
        }
        else if (ee.getAnimation() == ee.GRAPPLE_ANIMATION) { //The actual roar/anim
            animDisplay(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime, ee.getAnimationTick());
        }
        
    }

    public void animate(IAnimatedEntity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        EntityPrehistoricFloraSinotyrannus e = (EntityPrehistoricFloraSinotyrannus) entity;
        animator.update(entity);

        animator.setAnimation(e.HURT_ANIMATION);
        animator.startKeyframe(10);
        animator.rotate(this.neck, (float) Math.toRadians(-10),0,0);
        animator.rotate(this.neck2, (float) Math.toRadians(-10), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(this.neck3, (float) Math.toRadians(-10), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(this.head, (float) Math.toRadians(-10), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(this.jaw, (float) Math.toRadians(35), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.endKeyframe();
        animator.setStaticKeyframe(10);
        animator.resetKeyframe(10);
    }
}
