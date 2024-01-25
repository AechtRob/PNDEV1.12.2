package net.lepidodendron.entity.model.entity;

import net.ilexiconn.llibrary.client.model.ModelAnimator;
import net.ilexiconn.llibrary.client.model.tools.AdvancedModelRenderer;
import net.ilexiconn.llibrary.server.animation.IAnimatedEntity;
import net.lepidodendron.entity.EntityPrehistoricFloraSinraptor;
import net.lepidodendron.entity.model.llibraryextensions.AdvancedModelBaseExtended;
import net.minecraft.client.model.ModelBox;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;

public class ModelSinraptor extends AdvancedModelBaseExtended {

    private final AdvancedModelRenderer root;
    private final AdvancedModelRenderer hips;
    private final AdvancedModelRenderer tail;
    private final AdvancedModelRenderer tail2;
    private final AdvancedModelRenderer tail3;
    private final AdvancedModelRenderer tail4;
    private final AdvancedModelRenderer tail5;
    private final AdvancedModelRenderer tail6;
    private final AdvancedModelRenderer body;
    private final AdvancedModelRenderer body2;
    private final AdvancedModelRenderer neck;
    private final AdvancedModelRenderer neck2;
    private final AdvancedModelRenderer neck3;
    private final AdvancedModelRenderer neck4;
    private final AdvancedModelRenderer head;
    private final AdvancedModelRenderer head2;
    private final AdvancedModelRenderer head3;
    private final AdvancedModelRenderer head4;
    private final AdvancedModelRenderer teeth2;
    private final AdvancedModelRenderer teeth;
    private final AdvancedModelRenderer head5;
    private final AdvancedModelRenderer jaw;
    private final AdvancedModelRenderer jaw2;
    private final AdvancedModelRenderer jaw3;
    private final AdvancedModelRenderer teeth4;
    private final AdvancedModelRenderer jaw4;
    private final AdvancedModelRenderer jaw5;
    private final AdvancedModelRenderer throat;
    private final AdvancedModelRenderer teeth3;
    private final AdvancedModelRenderer masseter;
    private final AdvancedModelRenderer leftcrest;
    private final AdvancedModelRenderer leftcrest_r1;
    private final AdvancedModelRenderer rightcrest;
    private final AdvancedModelRenderer throat2;
    private final AdvancedModelRenderer throat3;
    private final AdvancedModelRenderer feathers4;
    private final AdvancedModelRenderer feathers3;
    private final AdvancedModelRenderer feathers2;
    private final AdvancedModelRenderer neckSupport;
    private final AdvancedModelRenderer feathers;
    private final AdvancedModelRenderer bellySlope2;
    private final AdvancedModelRenderer leftarm;
    private final AdvancedModelRenderer leftarm2;
    private final AdvancedModelRenderer leftHand;
    private final AdvancedModelRenderer leftHand_r1;
    private final AdvancedModelRenderer rightarm;
    private final AdvancedModelRenderer rightarm2;
    private final AdvancedModelRenderer rightHand;
    private final AdvancedModelRenderer rightHand_r1;
    private final AdvancedModelRenderer leftFeathers3;
    private final AdvancedModelRenderer rightFeathers3;
    private final AdvancedModelRenderer bellySlope;
    private final AdvancedModelRenderer leftFeathers2;
    private final AdvancedModelRenderer rightFeathers2;
    private final AdvancedModelRenderer leftLeg;
    private final AdvancedModelRenderer leftLeg2;
    private final AdvancedModelRenderer leftLeg3;
    private final AdvancedModelRenderer leftLeg4;
    private final AdvancedModelRenderer leftLeg5;
    private final AdvancedModelRenderer rightLeg;
    private final AdvancedModelRenderer rightLeg2;
    private final AdvancedModelRenderer rightLeg3;
    private final AdvancedModelRenderer rightLeg4;
    private final AdvancedModelRenderer rightLeg5;
    private final AdvancedModelRenderer leftFeathers;
    private final AdvancedModelRenderer rightFeathers;

    private ModelAnimator animator;

    public ModelSinraptor() {
        this.textureWidth = 150;
        this.textureHeight = 150;

        this.root = new AdvancedModelRenderer(this);
        this.root.setRotationPoint(0.0F, 0.0F, 0.0F);


        this.hips = new AdvancedModelRenderer(this);
        this.hips.setRotationPoint(0.0F, -5.9F, 0.0F);
        this.root.addChild(hips);
        this.setRotateAngle(hips, -0.1485F, 0.0F, 0.0F);
        this.hips.cubeList.add(new ModelBox(hips, 0, 114, -5.0F, -7.0F, -8.0F, 10, 20, 16, 0.0F, false));

        this.tail = new AdvancedModelRenderer(this);
        this.tail.setRotationPoint(0.0F, -2.0F, 6.7F);
        this.hips.addChild(tail);
        this.setRotateAngle(tail, -0.0424F, 0.0F, 0.0F);
        this.tail.cubeList.add(new ModelBox(tail, 36, 69, -4.0F, -4.0F, 0.0F, 8, 13, 12, 0.0F, false));

        this.tail2 = new AdvancedModelRenderer(this);
        this.tail2.setRotationPoint(0.0F, -0.7F, 10.2F);
        this.tail.addChild(tail2);
        this.setRotateAngle(tail2, 0.1698F, 0.0F, 0.0F);
        this.tail2.cubeList.add(new ModelBox(tail2, 0, 36, -3.5F, -3.0F, 0.0F, 7, 10, 10, 0.0F, false));

        this.tail3 = new AdvancedModelRenderer(this);
        this.tail3.setRotationPoint(0.0F, -0.3F, 8.7F);
        this.tail2.addChild(tail3);
        this.tail3.cubeList.add(new ModelBox(tail3, 102, 131, -3.0F, -2.5F, 0.0F, 6, 7, 12, 0.0F, false));

        this.tail4 = new AdvancedModelRenderer(this);
        this.tail4.setRotationPoint(0.0F, -0.4F, 10.7F);
        this.tail3.addChild(tail4);
        this.setRotateAngle(tail4, -0.1485F, 0.0F, 0.0F);
        this.tail4.cubeList.add(new ModelBox(tail4, 70, 62, -2.0F, -2.0F, 0.0F, 4, 5, 11, 0.0F, false));

        this.tail5 = new AdvancedModelRenderer(this);
        this.tail5.setRotationPoint(0.0F, -0.3F, 9.9F);
        this.tail4.addChild(tail5);
        this.setRotateAngle(tail5, -0.2122F, 0.0F, 0.0F);
        this.tail5.cubeList.add(new ModelBox(tail5, 77, 79, -1.5F, -1.5F, 0.0F, 3, 4, 12, 0.0F, false));

        this.tail6 = new AdvancedModelRenderer(this);
        this.tail6.setRotationPoint(0.0F, -0.1F, 11.0F);
        this.tail5.addChild(tail6);
        this.setRotateAngle(tail6, -0.2972F, 0.0F, 0.0F);
        this.tail6.cubeList.add(new ModelBox(tail6, 97, 93, -1.0F, -1.25F, 0.0F, 2, 3, 13, 0.0F, false));

        this.body = new AdvancedModelRenderer(this);
        this.body.setRotationPoint(0.0F, -4.0F, -6.9F);
        this.hips.addChild(body);
        this.setRotateAngle(body, 0.1911F, 0.0F, 0.0F);
        this.body.cubeList.add(new ModelBox(body, 0, 84, -6.0F, -3.0F, -11.0F, 12, 18, 11, 0.0F, false));

        this.body2 = new AdvancedModelRenderer(this);
        this.body2.setRotationPoint(0.0F, 0.1F, -9.7F);
        this.body.addChild(body2);
        this.setRotateAngle(body2, 0.1061F, 0.0F, 0.0F);
        this.body2.cubeList.add(new ModelBox(body2, 53, 123, -5.5F, -3.0F, -13.0F, 11, 14, 13, 0.0F, false));

        this.neck = new AdvancedModelRenderer(this);
        this.neck.setRotationPoint(0.0F, 0.0F, -9.0F);
        this.body2.addChild(neck);
        this.setRotateAngle(neck, -0.4882F, 0.0F, 0.0F);
        this.neck.cubeList.add(new ModelBox(neck, 0, 19, -3.5F, -2.0F, -6.0F, 7, 10, 6, 0.0F, false));

        this.neck2 = new AdvancedModelRenderer(this);
        this.neck2.setRotationPoint(0.0F, 0.7F, -4.2F);
        this.neck.addChild(neck2);
        this.setRotateAngle(neck2, -0.1911F, 0.0F, 0.0F);
        this.neck2.cubeList.add(new ModelBox(neck2, 25, 30, -3.0F, -2.5F, -6.0F, 6, 9, 6, 0.0F, false));

        this.neck3 = new AdvancedModelRenderer(this);
        this.neck3.setRotationPoint(0.0F, -0.7F, -5.0F);
        this.neck2.addChild(neck3);
        this.setRotateAngle(neck3, 0.2972F, 0.0F, 0.0F);
        this.neck3.cubeList.add(new ModelBox(neck3, 50, 33, -2.5F, -2.0F, -5.0F, 5, 9, 5, 0.0F, false));

        this.neck4 = new AdvancedModelRenderer(this);
        this.neck4.setRotationPoint(0.01F, -0.3F, -3.8F);
        this.neck3.addChild(neck4);
        this.setRotateAngle(neck4, 0.6369F, 0.0F, 0.0F);
        this.neck4.cubeList.add(new ModelBox(neck4, 71, 32, -2.5F, -2.0F, -5.0F, 5, 10, 5, 0.0F, false));

        this.head = new AdvancedModelRenderer(this);
        this.head.setRotationPoint(0.0F, 1.0F, -3.5F);
        this.neck4.addChild(head);
        this.setRotateAngle(head, -0.2546F, 0.0F, 0.0F);
        this.head.cubeList.add(new ModelBox(head, 27, 18, -3.0F, -2.0F, -5.0F, 6, 5, 6, 0.0F, false));

        this.head2 = new AdvancedModelRenderer(this);
        this.head2.setRotationPoint(0.0F, -1.1F, -5.0F);
        this.head.addChild(head2);
        this.setRotateAngle(head2, 0.2759F, 0.0F, 0.0F);
        this.head2.cubeList.add(new ModelBox(head2, 46, 10, -2.0F, 0.0F, -6.0F, 4, 4, 6, 0.0F, false));

        this.head3 = new AdvancedModelRenderer(this);
        this.head3.setRotationPoint(0.0F, 4.0F, -6.0F);
        this.head2.addChild(head3);
        this.setRotateAngle(head3, -0.3821F, 0.0F, 0.0F);
        this.head3.cubeList.add(new ModelBox(head3, 125, 80, -1.5F, -2.0F, -3.0F, 3, 2, 3, 0.0F, false));

        this.head4 = new AdvancedModelRenderer(this);
        this.head4.setRotationPoint(-0.01F, -2.0F, -3.0F);
        this.head3.addChild(head4);
        this.setRotateAngle(head4, 1.0189F, 0.0F, 0.0F);
        this.head4.cubeList.add(new ModelBox(head4, 138, 126, -1.5F, 0.0F, 0.0F, 3, 2, 3, 0.0F, false));

        this.teeth2 = new AdvancedModelRenderer(this);
        this.teeth2.setRotationPoint(0.0F, -0.5F, -1.1F);
        this.head3.addChild(teeth2);
        this.setRotateAngle(teeth2, -0.0848F, 0.0F, 0.0F);
        this.teeth2.cubeList.add(new ModelBox(teeth2, 110, 87, -1.0F, 0.0F, -1.5F, 2, 1, 3, 0.0F, false));

        this.teeth = new AdvancedModelRenderer(this);
        this.teeth.setRotationPoint(0.0F, 3.6F, -3.4F);
        this.head2.addChild(teeth);
        this.setRotateAngle(teeth, 0.1061F, 0.0F, 0.0F);
        this.teeth.cubeList.add(new ModelBox(teeth, 96, 83, -1.5F, 0.0F, -2.5F, 3, 1, 5, 0.0F, false));

        this.head5 = new AdvancedModelRenderer(this);
        this.head5.setRotationPoint(0.0F, -2.0F, -5.0F);
        this.head.addChild(head5);
        this.setRotateAngle(head5, 0.2972F, 0.0F, 0.0F);
        this.head5.cubeList.add(new ModelBox(head5, 132, 97, -1.5F, 0.0F, -6.0F, 3, 1, 6, 0.0F, false));

        this.jaw = new AdvancedModelRenderer(this);
        this.jaw.setRotationPoint(0.0F, 3.0F, 1.0F);
        this.head.addChild(jaw);
        this.jaw.cubeList.add(new ModelBox(jaw, 61, 6, -3.0F, 0.0F, -6.0F, 6, 3, 6, 0.0F, false));

        this.jaw2 = new AdvancedModelRenderer(this);
        this.jaw2.setRotationPoint(0.0F, 0.0F, -5.9F);
        this.jaw.addChild(jaw2);
        this.setRotateAngle(jaw2, 0.2759F, 0.0F, 0.0F);
        this.jaw2.cubeList.add(new ModelBox(jaw2, 132, 89, -2.0F, 0.0F, -5.0F, 4, 2, 5, 0.0F, false));

        this.jaw3 = new AdvancedModelRenderer(this);
        this.jaw3.setRotationPoint(0.0F, 2.02F, -5.1F);
        this.jaw2.addChild(jaw3);
        this.setRotateAngle(jaw3, -0.3501F, 0.0F, 0.0F);
        this.jaw3.cubeList.add(new ModelBox(jaw3, 136, 105, -1.5F, -2.0F, -3.5F, 3, 2, 4, 0.0F, false));

        this.teeth4 = new AdvancedModelRenderer(this);
        this.teeth4.setRotationPoint(0.0F, -1.65F, -1.65F);
        this.jaw3.addChild(teeth4);
        this.setRotateAngle(teeth4, 0.1485F, 0.0F, 0.0F);
        this.teeth4.cubeList.add(new ModelBox(teeth4, 123, 92, -0.5F, -1.0F, -1.5F, 1, 1, 3, 0.0F, false));

        this.jaw4 = new AdvancedModelRenderer(this);
        this.jaw4.setRotationPoint(0.01F, 2.0F, -5.0F);
        this.jaw2.addChild(jaw4);
        this.setRotateAngle(jaw4, -0.3609F, 0.0F, 0.0F);
        this.jaw4.cubeList.add(new ModelBox(jaw4, 123, 50, -2.0F, -2.0F, 0.0F, 4, 2, 6, 0.0F, false));

        this.jaw5 = new AdvancedModelRenderer(this);
        this.jaw5.setRotationPoint(0.0F, 0.0F, 6.0F);
        this.jaw4.addChild(jaw5);
        this.setRotateAngle(jaw5, 0.3609F, 0.0F, 0.0F);
        this.jaw5.cubeList.add(new ModelBox(jaw5, 134, 138, -2.5F, -1.0F, 0.0F, 5, 1, 3, 0.0F, false));

        this.throat = new AdvancedModelRenderer(this);
        this.throat.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.jaw5.addChild(throat);
        this.setRotateAngle(throat, -0.4671F, 0.0F, 0.0F);
        this.throat.cubeList.add(new ModelBox(throat, 134, 112, -2.0F, -2.0F, 0.0F, 4, 2, 4, 0.0F, false));

        this.teeth3 = new AdvancedModelRenderer(this);
        this.teeth3.setRotationPoint(-0.01F, 0.6F, -2.5F);
        this.jaw2.addChild(teeth3);
        this.setRotateAngle(teeth3, -0.1911F, 0.0F, 0.0F);
        this.teeth3.cubeList.add(new ModelBox(teeth3, 122, 87, -1.0F, -1.0F, -1.5F, 2, 1, 3, 0.0F, false));

        this.masseter = new AdvancedModelRenderer(this);
        this.masseter.setRotationPoint(0.0F, 0.0F, -5.8F);
        this.jaw.addChild(masseter);
        this.setRotateAngle(masseter, -0.4882F, 0.0F, 0.0F);
        this.masseter.cubeList.add(new ModelBox(masseter, 50, 0, -2.0F, -5.0F, 0.0F, 4, 5, 4, 0.0F, false));

        this.leftcrest = new AdvancedModelRenderer(this);
        this.leftcrest.setRotationPoint(1.2848F, 0.3169F, -6.104F);
        this.head.addChild(leftcrest);
        this.setRotateAngle(leftcrest, 0.3315F, -0.2124F, 0.5641F);


        this.leftcrest_r1 = new AdvancedModelRenderer(this);
        this.leftcrest_r1.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.leftcrest.addChild(leftcrest_r1);
        this.setRotateAngle(leftcrest_r1, 0.095F, 0.3048F, -0.5356F);
        this.leftcrest_r1.cubeList.add(new ModelBox(leftcrest_r1, 99, 4, -1.625F, -1.95F, -1.6F, 2, 4, 5, 0.0F, false));

        this.rightcrest = new AdvancedModelRenderer(this);
        this.rightcrest.setRotationPoint(-1.027F, -0.1479F, -5.1859F);
        this.head.addChild(rightcrest);
        this.setRotateAngle(rightcrest, 0.5075F, -0.2557F, -0.1556F);
        this.rightcrest.cubeList.add(new ModelBox(rightcrest, 136, 67, -0.95F, -2.0F, -2.5F, 2, 4, 5, 0.0F, false));

        this.throat2 = new AdvancedModelRenderer(this);
        this.throat2.setRotationPoint(0.0F, 8.0F, -0.5F);
        this.neck4.addChild(throat2);
        this.setRotateAngle(throat2, 0.5308F, 0.0F, 0.0F);
        this.throat2.cubeList.add(new ModelBox(throat2, 140, 132, -1.5F, -3.0F, -2.0F, 3, 3, 2, 0.0F, false));

        this.throat3 = new AdvancedModelRenderer(this);
        this.throat3.setRotationPoint(0.0F, 0.0F, -2.0F);
        this.throat2.addChild(throat3);
        this.setRotateAngle(throat3, -0.5732F, 0.0F, 0.0F);
        this.throat3.cubeList.add(new ModelBox(throat3, 136, 119, -2.0F, -3.0F, -3.0F, 4, 3, 3, 0.0F, false));

        this.feathers4 = new AdvancedModelRenderer(this);
        this.feathers4.setRotationPoint(0.0F, -1.3F, -4.0F);
        this.neck4.addChild(feathers4);
        this.setRotateAngle(feathers4, 0.0637F, 0.0F, 0.0F);
        this.feathers4.cubeList.add(new ModelBox(feathers4, 109, 79, -0.5F, -2.0F, 0.0F, 1, 2, 5, 0.0F, false));

        this.feathers3 = new AdvancedModelRenderer(this);
        this.feathers3.setRotationPoint(-0.01F, -1.9F, -5.0F);
        this.neck3.addChild(feathers3);
        this.setRotateAngle(feathers3, -0.0637F, 0.0F, 0.0F);
        this.feathers3.cubeList.add(new ModelBox(feathers3, 125, 71, -1.0F, -2.0F, 0.0F, 2, 2, 6, 0.0F, false));

        this.feathers2 = new AdvancedModelRenderer(this);
        this.feathers2.setRotationPoint(0.0F, -2.4F, -6.0F);
        this.neck2.addChild(feathers2);
        this.setRotateAngle(feathers2, -0.0848F, 0.0F, 0.0F);
        this.feathers2.cubeList.add(new ModelBox(feathers2, 82, 20, -1.0F, -2.0F, 0.0F, 2, 2, 7, 0.0F, false));

        this.neckSupport = new AdvancedModelRenderer(this);
        this.neckSupport.setRotationPoint(-0.01F, 8.0F, 0.0F);
        this.neck.addChild(neckSupport);
        this.setRotateAngle(neckSupport, 0.4458F, 0.0F, 0.0F);
        this.neckSupport.cubeList.add(new ModelBox(neckSupport, 8, 9, -3.5F, -6.0F, 0.0F, 7, 6, 3, 0.0F, false));

        this.feathers = new AdvancedModelRenderer(this);
        this.feathers.setRotationPoint(0.0F, -1.6F, -6.0F);
        this.neck.addChild(feathers);
        this.setRotateAngle(feathers, -0.1911F, 0.0F, 0.0F);
        this.feathers.cubeList.add(new ModelBox(feathers, 132, 80, -1.5F, -2.0F, 0.0F, 3, 2, 6, 0.0F, false));

        this.bellySlope2 = new AdvancedModelRenderer(this);
        this.bellySlope2.setRotationPoint(0.0F, 11.0F, -13.0F);
        this.body2.addChild(bellySlope2);
        this.setRotateAngle(bellySlope2, -0.2972F, 0.0F, 0.0F);
        this.bellySlope2.cubeList.add(new ModelBox(bellySlope2, 89, 113, -5.0F, -4.0F, 0.0F, 10, 4, 13, 0.0F, false));

        this.leftarm = new AdvancedModelRenderer(this);
        this.leftarm.setRotationPoint(-4.5F, 9.5F, -9.5F);
        this.body2.addChild(leftarm);
        this.setRotateAngle(leftarm, 0.8553F, 0.0585F, 0.1165F);
        this.leftarm.cubeList.add(new ModelBox(leftarm, 52, 21, -2.5F, -1.0F, -2.0F, 3, 7, 4, 0.0F, false));

        this.leftarm2 = new AdvancedModelRenderer(this);
        this.leftarm2.setRotationPoint(-1.475F, 5.2F, 1.0F);
        this.leftarm.addChild(leftarm2);
        this.setRotateAngle(leftarm2, -0.9143F, -0.2269F, -0.0018F);
        this.leftarm2.cubeList.add(new ModelBox(leftarm2, 101, 73, -1.0F, 0.0F, -2.0F, 2, 6, 3, 0.0F, false));

        this.leftHand = new AdvancedModelRenderer(this);
        this.leftHand.setRotationPoint(-0.6F, 5.5F, -0.3F);
        this.leftarm2.addChild(leftHand);
        this.setRotateAngle(leftHand, 0.1061F, 0.0F, 0.4882F);


        this.leftHand_r1 = new AdvancedModelRenderer(this);
        this.leftHand_r1.setRotationPoint(0.5F, 0.0F, -0.5F);
        this.leftHand.addChild(leftHand_r1);
        this.setRotateAngle(leftHand_r1, -2.9579F, 0.0199F, 2.4346F);
        this.leftHand_r1.cubeList.add(new ModelBox(leftHand_r1, 40, 5, -0.6517F, -0.3438F, -2.7F, 1, 6, 4, 0.0F, false));

        this.rightarm = new AdvancedModelRenderer(this);
        this.rightarm.setRotationPoint(4.5F, 9.5F, -9.5F);
        this.body2.addChild(rightarm);
        this.setRotateAngle(rightarm, 0.8541F, 0.0361F, -0.0079F);
        this.rightarm.cubeList.add(new ModelBox(rightarm, 67, 20, -0.5F, -1.0F, -2.0F, 3, 7, 4, 0.0F, false));

        this.rightarm2 = new AdvancedModelRenderer(this);
        this.rightarm2.setRotationPoint(1.35F, 5.2F, 1.0F);
        this.rightarm.addChild(rightarm2);
        this.setRotateAngle(rightarm2, -0.925F, 0.154F, -0.0547F);
        this.rightarm2.cubeList.add(new ModelBox(rightarm2, 112, 70, -1.0F, 0.0F, -2.0F, 2, 6, 3, 0.0F, false));

        this.rightHand = new AdvancedModelRenderer(this);
        this.rightHand.setRotationPoint(0.6F, 5.5F, -0.3F);
        this.rightarm2.addChild(rightHand);
        this.setRotateAngle(rightHand, 0.1061F, 0.0F, -0.4882F);


        this.rightHand_r1 = new AdvancedModelRenderer(this);
        this.rightHand_r1.setRotationPoint(-0.5F, 3.0F, -0.5F);
        this.rightHand.addChild(rightHand_r1);
        this.setRotateAngle(rightHand_r1, -3.0147F, 0.133F, -2.5029F);
        this.rightHand_r1.cubeList.add(new ModelBox(rightHand_r1, 29, 7, 1.5F, -3.0F, -2.7F, 1, 6, 4, 0.0F, false));

        this.leftFeathers3 = new AdvancedModelRenderer(this);
        this.leftFeathers3.setRotationPoint(-1.0F, -1.5F, -13.0F);
        this.body2.addChild(leftFeathers3);
        this.setRotateAngle(leftFeathers3, 0.1061F, -0.0848F, 0.1698F);
        this.leftFeathers3.cubeList.add(new ModelBox(leftFeathers3, 120, 20, -1.0F, -2.0F, 0.0F, 2, 2, 13, 0.0F, false));

        this.rightFeathers3 = new AdvancedModelRenderer(this);
        this.rightFeathers3.setRotationPoint(1.0F, -1.5F, -13.0F);
        this.body2.addChild(rightFeathers3);
        this.setRotateAngle(rightFeathers3, 0.1061F, 0.0848F, -0.1698F);
        this.rightFeathers3.cubeList.add(new ModelBox(rightFeathers3, 120, 4, -1.0F, -2.0F, 0.0F, 2, 2, 13, 0.0F, false));

        this.bellySlope = new AdvancedModelRenderer(this);
        this.bellySlope.setRotationPoint(0.0F, 15.0F, -11.0F);
        this.body.addChild(bellySlope);
        this.setRotateAngle(bellySlope, -0.1698F, 0.0F, 0.0F);
        this.bellySlope.cubeList.add(new ModelBox(bellySlope, 110, 36, -4.5F, -2.0F, 0.0F, 9, 2, 11, 0.0F, false));

        this.leftFeathers2 = new AdvancedModelRenderer(this);
        this.leftFeathers2.setRotationPoint(-2.3F, -2.6F, -11.0F);
        this.body.addChild(leftFeathers2);
        this.setRotateAngle(leftFeathers2, 0.0213F, 0.0213F, 0.1274F);
        this.leftFeathers2.cubeList.add(new ModelBox(leftFeathers2, 101, 17, -1.5F, -2.0F, 0.0F, 3, 2, 12, 0.0F, false));

        this.rightFeathers2 = new AdvancedModelRenderer(this);
        this.rightFeathers2.setRotationPoint(2.3F, -2.6F, -11.0F);
        this.body.addChild(rightFeathers2);
        this.setRotateAngle(rightFeathers2, 0.0213F, -0.0213F, -0.1274F);
        this.rightFeathers2.cubeList.add(new ModelBox(rightFeathers2, 80, 5, -1.5F, -2.0F, 0.0F, 3, 2, 12, 0.0F, false));

        this.leftLeg = new AdvancedModelRenderer(this);
        this.leftLeg.setRotationPoint(-4.0F, 0.5F, 0.5F);
        this.hips.addChild(leftLeg);
        this.setRotateAngle(leftLeg, -0.1061F, 0.0F, 0.0F);
        this.leftLeg.cubeList.add(new ModelBox(leftLeg, 47, 96, -4.0F, -2.5F, -5.0F, 5, 16, 10, 0.0F, true));

        this.leftLeg2 = new AdvancedModelRenderer(this);
        this.leftLeg2.setRotationPoint(-1.7F, 13.3F, -4.0F);
        this.leftLeg.addChild(leftLeg2);
        this.setRotateAngle(leftLeg2, 0.6793F, 0.0F, 0.0F);
        this.leftLeg2.cubeList.add(new ModelBox(leftLeg2, 35, 48, -2.0F, -0.5F, -0.5F, 4, 13, 7, 0.0F, false));

        this.leftLeg3 = new AdvancedModelRenderer(this);
        this.leftLeg3.setRotationPoint(0.01F, 12.0F, 3.5F);
        this.leftLeg2.addChild(leftLeg3);
        this.setRotateAngle(leftLeg3, -0.5519F, 0.0F, 0.0F);
        this.leftLeg3.cubeList.add(new ModelBox(leftLeg3, 81, 49, -2.0F, -0.5F, -3.0F, 4, 8, 4, 0.0F, false));

        this.leftLeg4 = new AdvancedModelRenderer(this);
        this.leftLeg4.setRotationPoint(0.0F, 6.5F, -0.4F);
        this.leftLeg3.addChild(leftLeg4);
        this.setRotateAngle(leftLeg4, 0.1274F, 0.0F, 0.0F);
        this.leftLeg4.cubeList.add(new ModelBox(leftLeg4, 130, 59, -2.5F, -0.5F, -3.5F, 5, 2, 5, 0.0F, false));

        this.leftLeg5 = new AdvancedModelRenderer(this);
        this.leftLeg5.setRotationPoint(0.0F, 0.51F, -3.5F);
        this.leftLeg4.addChild(leftLeg5);
        this.leftLeg5.cubeList.add(new ModelBox(leftLeg5, 98, 52, -3.5F, -1.0F, -4.5F, 7, 2, 5, 0.0F, false));

        this.rightLeg = new AdvancedModelRenderer(this);
        this.rightLeg.setRotationPoint(4.0F, 0.5F, 0.5F);
        this.hips.addChild(rightLeg);
        this.setRotateAngle(rightLeg, -0.1061F, 0.0F, 0.0F);
        this.rightLeg.cubeList.add(new ModelBox(rightLeg, 0, 57, -1.0F, -2.5F, -5.0F, 5, 16, 10, 0.0F, true));

        this.rightLeg2 = new AdvancedModelRenderer(this);
        this.rightLeg2.setRotationPoint(1.7F, 13.3F, -4.0F);
        this.rightLeg.addChild(rightLeg2);
        this.setRotateAngle(rightLeg2, 0.6793F, 0.0F, 0.0F);
        this.rightLeg2.cubeList.add(new ModelBox(rightLeg2, 58, 48, -2.0F, -0.5F, -0.5F, 4, 13, 7, 0.0F, false));

        this.rightLeg3 = new AdvancedModelRenderer(this);
        this.rightLeg3.setRotationPoint(-0.01F, 12.0F, 3.5F);
        this.rightLeg2.addChild(rightLeg3);
        this.setRotateAngle(rightLeg3, -0.5519F, 0.0F, 0.0F);
        this.rightLeg3.cubeList.add(new ModelBox(rightLeg3, 94, 60, -2.0F, -0.5F, -3.0F, 4, 8, 4, 0.0F, false));

        this.rightLeg4 = new AdvancedModelRenderer(this);
        this.rightLeg4.setRotationPoint(0.0F, 6.5F, -0.4F);
        this.rightLeg3.addChild(rightLeg4);
        this.setRotateAngle(rightLeg4, 0.1274F, 0.0F, 0.0F);
        this.rightLeg4.cubeList.add(new ModelBox(rightLeg4, 111, 62, -2.5F, -0.5F, -3.5F, 5, 2, 5, 0.0F, false));

        this.rightLeg5 = new AdvancedModelRenderer(this);
        this.rightLeg5.setRotationPoint(0.0F, 0.51F, -3.5F);
        this.rightLeg4.addChild(rightLeg5);
        this.rightLeg5.cubeList.add(new ModelBox(rightLeg5, 92, 39, -3.5F, -1.0F, -4.5F, 7, 2, 5, 0.0F, false));

        this.leftFeathers = new AdvancedModelRenderer(this);
        this.leftFeathers.setRotationPoint(-2.0F, -6.7F, -8.0F);
        this.hips.addChild(leftFeathers);
        this.setRotateAngle(leftFeathers, -0.0637F, 0.0213F, 0.1061F);
        this.leftFeathers.cubeList.add(new ModelBox(leftFeathers, 78, 96, -1.0F, -2.0F, 0.0F, 2, 2, 14, 0.0F, false));

        this.rightFeathers = new AdvancedModelRenderer(this);
        this.rightFeathers.setRotationPoint(2.0F, -6.7F, -8.0F);
        this.hips.addChild(rightFeathers);
        this.setRotateAngle(rightFeathers, -0.0637F, -0.0213F, -0.1061F);
        this.rightFeathers.cubeList.add(new ModelBox(rightFeathers, 100, 0, -1.0F, -2.0F, 0.0F, 2, 2, 14, 0.0F, false));

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

    public void setRotateAngle(AdvancedModelRenderer AdvancedModelRenderer, float x, float y, float z) {
        AdvancedModelRenderer.rotateAngleX = x;
        AdvancedModelRenderer.rotateAngleY = y;
        AdvancedModelRenderer.rotateAngleZ = z;
    }

    @Override
    public void setRotationAngles(float f, float f1, float f2, float f3, float f4, float f5, Entity e) {
        super.setRotationAngles(f, f1, f2, f3, f4, f5, e);
        //this.resetToDefaultPose();

        EntityPrehistoricFloraSinraptor EntitySinraptor = (EntityPrehistoricFloraSinraptor) e;

        this.faceTarget(f3, f4, 8, neck);
        this.faceTarget(f3, f4, 8, neck2);
        this.faceTarget(f3, f4, 8, neck3);
        this.faceTarget(f3, f4, 8, neck4);
        this.faceTarget(f3, f4, 8, head);

        AdvancedModelRenderer[] Tail = {this.tail, this.tail2, this.tail3, this.tail4, this.tail5, this.tail6};
        AdvancedModelRenderer[] Neck = {this.neck, this.neck2, this.neck3, this.neck4, this.head};
        AdvancedModelRenderer[] ArmL = {this.rightarm, this.rightarm2, this.rightHand};
        AdvancedModelRenderer[] ArmR = {this.leftarm, this.leftarm2, this.leftHand};

        EntitySinraptor.tailBuffer.applyChainSwingBuffer(Tail);

        if (EntitySinraptor.getAnimation() == EntitySinraptor.LAY_ANIMATION) {
            this.chainSwing(Neck, 0.5F, 0.10F, 0.5, f2, 0.8F);
            this.chainWave(Neck, 0.5F * 2, -0.02F, 0.5F, f2, 0.8F);
        }
        else {
            if (!EntitySinraptor.isReallyInWater()) {

                if (f3 == 0.0F || !EntitySinraptor.getIsMoving()) {
                    this.chainSwing(Neck, 0.05F, 0.10F, 0.5, f2, 0.8F);
                    this.chainWave(Neck, 0.05F * 2, -0.02F, 0.5F, f2, 0.8F);

                    this.chainWave(Tail, (0.15F * 0.35F), 0.125F * 0.15F, 0.2F, f2, 1F);
                    this.chainSwing(Tail, (0.15F * 0.35F) * 4F, 0.05F * 0.35F, 0.12F, f2, 1F);

                    this.chainWaveExtended(ArmL, 0.175F, 0.03F, 0.1F, 3F, f2, 1F);
                    this.chainWaveExtended(ArmR, 0.175F, -0.03F, -0.1F, 0f, f2, 1F);
                    this.chainFlapExtended(ArmL, 0.175F, -0.03F, 0.1F, 3F, f2, 1F);
                    this.chainFlapExtended(ArmR, 0.175F, -0.03F, -0.1F, 0f, f2, 1F);
                    this.walk(this.rightarm, 0.175F, 0.10F, true, 3F, 0.05F, f2, 1F);
                    this.walk(this.leftarm, 0.175F, -0.10F, true, 0F, 0.05F, f2, 1F);
                    this.flap(this.rightarm, 0.175F, -0.10F, true, 3F, 0.05F, f2, 1F);
                    this.flap(this.leftarm, 0.175F, -0.10F, true, 0F, 0.05F, f2, 1F);

                    return;
                }

                if (EntitySinraptor.getIsFast()) { //Running


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

    public void animNoise(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime, double animTick) {
        EntityPrehistoricFloraSinraptor entity = (EntityPrehistoricFloraSinraptor) entitylivingbaseIn;

        int animCycle = 100;
        double tickAnim = animTick + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;

        if (tickAnim >= 0 && tickAnim < 20) {
            xx = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1))*-2.5 + (((tickAnim - 0) / 20) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1.5+30))*2.5-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1))*-2.5)));
            yy = 0 + (((tickAnim - 0) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 20) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 29) {
            xx = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1.5+30))*2.5 + (((tickAnim - 20) / 9) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/3+30))*-5-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1.5+30))*2.5)));
            yy = 0 + (((tickAnim - 20) / 9) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 9) * (0-(0)));
        }
        else if (tickAnim >= 29 && tickAnim < 70) {
            xx = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/3+30))*-5 + (((tickAnim - 29) / 41) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/4+30))*5-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/3+30))*-5)));
            yy = 0 + (((tickAnim - 29) / 41) * (0-(0)));
            zz = 0 + (((tickAnim - 29) / 41) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tail, tail.rotateAngleX + (float) Math.toRadians(xx), tail.rotateAngleY + (float) Math.toRadians(yy), tail.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 20) {
            xx = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1))*-2.5 + (((tickAnim - 0) / 20) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1.5-30))*2.5-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1))*-2.5)));
            yy = 0 + (((tickAnim - 0) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 20) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 29) {
            xx = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1.5-30))*2.5 + (((tickAnim - 20) / 9) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/3-30))*-5-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1.5-30))*2.5)));
            yy = 0 + (((tickAnim - 20) / 9) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 9) * (0-(0)));
        }
        else if (tickAnim >= 29 && tickAnim < 70) {
            xx = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/3-30))*-5 + (((tickAnim - 29) / 41) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/4-30))*5-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/3-30))*-5)));
            yy = 0 + (((tickAnim - 29) / 41) * (0-(0)));
            zz = 0 + (((tickAnim - 29) / 41) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tail2, tail2.rotateAngleX + (float) Math.toRadians(xx), tail2.rotateAngleY + (float) Math.toRadians(yy), tail2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 0) / 10) * (2.5-(0)));
            yy = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 20) {
            xx = 2.5 + (((tickAnim - 10) / 10) * (4.64-(2.5)));
            yy = 0 + (((tickAnim - 10) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 10) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 30) {
            xx = 4.64 + (((tickAnim - 20) / 10) * (6.37-(4.64)));
            yy = 0 + (((tickAnim - 20) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 10) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 40) {
            xx = 6.37 + (((tickAnim - 30) / 10) * (8.87-(6.37)));
            yy = 0 + (((tickAnim - 30) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 30) / 10) * (0-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 50) {
            xx = 8.87 + (((tickAnim - 40) / 10) * (6.37-(8.87)));
            yy = 0 + (((tickAnim - 40) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 40) / 10) * (0-(0)));
        }
        else if (tickAnim >= 50 && tickAnim < 60) {
            xx = 6.37 + (((tickAnim - 50) / 10) * (-0.22-(6.37)));
            yy = 0 + (((tickAnim - 50) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 50) / 10) * (0-(0)));
        }
        else if (tickAnim >= 60 && tickAnim < 70) {
            xx = -0.22 + (((tickAnim - 60) / 10) * (-2.68-(-0.22)));
            yy = 0 + (((tickAnim - 60) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 60) / 10) * (0-(0)));
        }
        else if (tickAnim >= 70 && tickAnim < 80) {
            xx = -2.68 + (((tickAnim - 70) / 10) * (-7.14-(-2.68)));
            yy = 0 + (((tickAnim - 70) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 70) / 10) * (0-(0)));
        }
        else if (tickAnim >= 80 && tickAnim < 87) {
            xx = -7.14 + (((tickAnim - 80) / 7) * (-7.14-(-7.14)));
            yy = 0 + (((tickAnim - 80) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 80) / 7) * (0-(0)));
        }
        else if (tickAnim >= 87 && tickAnim < 100) {
            xx = -7.14 + (((tickAnim - 87) / 13) * (0-(-7.14)));
            yy = 0 + (((tickAnim - 87) / 13) * (0-(0)));
            zz = 0 + (((tickAnim - 87) / 13) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(body, body.rotateAngleX + (float) Math.toRadians(xx), body.rotateAngleY + (float) Math.toRadians(yy), body.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 7) {
            xx = 0 + (((tickAnim - 0) / 7) * (3.61-(0)));
            yy = 0 + (((tickAnim - 0) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 7) * (0-(0)));
        }
        else if (tickAnim >= 7 && tickAnim < 15) {
            xx = 3.61 + (((tickAnim - 7) / 8) * (2.5-(3.61)));
            yy = 0 + (((tickAnim - 7) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 7) / 8) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 20) {
            xx = 2.5 + (((tickAnim - 15) / 5) * (7.14-(2.5)));
            yy = 0 + (((tickAnim - 15) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 5) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 30) {
            xx = 7.14 + (((tickAnim - 20) / 10) * (4.05-(7.14)));
            yy = 0 + (((tickAnim - 20) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 10) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 43) {
            xx = 4.05 + (((tickAnim - 30) / 13) * (8.45-(4.05)));
            yy = 0 + (((tickAnim - 30) / 13) * (0-(0)));
            zz = 0 + (((tickAnim - 30) / 13) * (0-(0)));
        }
        else if (tickAnim >= 43 && tickAnim < 50) {
            xx = 8.45 + (((tickAnim - 43) / 7) * (3.45-(8.45)));
            yy = 0 + (((tickAnim - 43) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 43) / 7) * (0-(0)));
        }
        else if (tickAnim >= 50 && tickAnim < 65) {
            xx = 3.45 + (((tickAnim - 50) / 15) * (-2.41-(3.45)));
            yy = 0 + (((tickAnim - 50) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 50) / 15) * (0-(0)));
        }
        else if (tickAnim >= 65 && tickAnim < 73) {
            xx = -2.41 + (((tickAnim - 65) / 8) * (-4.51-(-2.41)));
            yy = 0 + (((tickAnim - 65) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 65) / 8) * (0-(0)));
        }
        else if (tickAnim >= 73 && tickAnim < 82) {
            xx = -4.51 + (((tickAnim - 73) / 9) * (-6.11-(-4.51)));
            yy = 0 + (((tickAnim - 73) / 9) * (0-(0)));
            zz = 0 + (((tickAnim - 73) / 9) * (0-(0)));
        }
        else if (tickAnim >= 82 && tickAnim < 87) {
            xx = -6.11 + (((tickAnim - 82) / 5) * (-8.61-(-6.11)));
            yy = 0 + (((tickAnim - 82) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 82) / 5) * (0-(0)));
        }
        else if (tickAnim >= 87 && tickAnim < 100) {
            xx = -8.61 + (((tickAnim - 87) / 13) * (0-(-8.61)));
            yy = 0 + (((tickAnim - 87) / 13) * (0-(0)));
            zz = 0 + (((tickAnim - 87) / 13) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(body2, body2.rotateAngleX + (float) Math.toRadians(xx), body2.rotateAngleY + (float) Math.toRadians(yy), body2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 0) / 10) * (7.5-(0)));
            yy = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 17) {
            xx = 7.5 + (((tickAnim - 10) / 7) * (13.93-(7.5)));
            yy = 0 + (((tickAnim - 10) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 7) * (0-(0)));
        }
        else if (tickAnim >= 17 && tickAnim < 30) {
            xx = 13.93 + (((tickAnim - 17) / 13) * (36.6425-(13.93)));
            yy = 0 + (((tickAnim - 17) / 13) * (4.94312-(0)));
            zz = 0 + (((tickAnim - 17) / 13) * (0.753-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 40) {
            xx = 36.6425 + (((tickAnim - 30) / 10) * (35.48744-(36.6425)));
            yy = 4.94312 + (((tickAnim - 30) / 10) * (4.94734-(4.94312)));
            zz = 0.753 + (((tickAnim - 30) / 10) * (0.65182-(0.753)));
        }
        else if (tickAnim >= 40 && tickAnim < 47) {
            xx = 35.48744 + (((tickAnim - 40) / 7) * (39.02026-(35.48744)));
            yy = 4.94734 + (((tickAnim - 40) / 7) * (-2.45371-(4.94734)));
            zz = 0.65182 + (((tickAnim - 40) / 7) * (-0.47903-(0.65182)));
        }
        else if (tickAnim >= 47 && tickAnim < 60) {
            xx = 39.02026 + (((tickAnim - 47) / 13) * (26.75885-(39.02026)));
            yy = -2.45371 + (((tickAnim - 47) / 13) * (-2.49944-(-2.45371)));
            zz = -0.47903 + (((tickAnim - 47) / 13) * (0.05283-(-0.47903)));
        }
        else if (tickAnim >= 60 && tickAnim < 70) {
            xx = 26.75885 + (((tickAnim - 60) / 10) * (2.28478-(26.75885)));
            yy = -2.49944 + (((tickAnim - 60) / 10) * (-4.50809-(-2.49944)));
            zz = 0.05283 + (((tickAnim - 60) / 10) * (2.1649-(0.05283)));
        }
        else if (tickAnim >= 70 && tickAnim < 80) {
            xx = 2.28478 + (((tickAnim - 70) / 10) * (-10.59973-(2.28478)));
            yy = -4.50809 + (((tickAnim - 70) / 10) * (-5.8769-(-4.50809)));
            zz = 2.1649 + (((tickAnim - 70) / 10) * (4.66782-(2.1649)));
        }
        else if (tickAnim >= 80 && tickAnim < 87) {
            xx = -10.59973 + (((tickAnim - 80) / 7) * (-10.59973-(-10.59973)));
            yy = -5.8769 + (((tickAnim - 80) / 7) * (-5.8769-(-5.8769)));
            zz = 4.66782 + (((tickAnim - 80) / 7) * (4.66782-(4.66782)));
        }
        else if (tickAnim >= 87 && tickAnim < 100) {
            xx = -10.59973 + (((tickAnim - 87) / 13) * (0-(-10.59973)));
            yy = -5.8769 + (((tickAnim - 87) / 13) * (0-(-5.8769)));
            zz = 4.66782 + (((tickAnim - 87) / 13) * (0-(4.66782)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck, neck.rotateAngleX + (float) Math.toRadians(xx), neck.rotateAngleY + (float) Math.toRadians(yy), neck.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 0) / 10) * (2.5-(0)));
            yy = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 17) {
            xx = 2.5 + (((tickAnim - 10) / 7) * (9.64-(2.5)));
            yy = 0 + (((tickAnim - 10) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 7) * (0-(0)));
        }
        else if (tickAnim >= 17 && tickAnim < 30) {
            xx = 9.64 + (((tickAnim - 17) / 13) * (15.53434-(9.64)));
            yy = 0 + (((tickAnim - 17) / 13) * (2.49201-(0)));
            zz = 0 + (((tickAnim - 17) / 13) * (0.19975-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 40) {
            xx = 15.53434 + (((tickAnim - 30) / 10) * (15.53-(15.53434)));
            yy = 2.49201 + (((tickAnim - 30) / 10) * (0-(2.49201)));
            zz = 0.19975 + (((tickAnim - 30) / 10) * (0-(0.19975)));
        }
        else if (tickAnim >= 40 && tickAnim < 47) {
            xx = 15.53 + (((tickAnim - 40) / 7) * (15.53-(15.53)));
            yy = 0 + (((tickAnim - 40) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 40) / 7) * (0-(0)));
        }
        else if (tickAnim >= 47 && tickAnim < 60) {
            xx = 15.53 + (((tickAnim - 47) / 13) * (-0.86093-(15.53)));
            yy = 0 + (((tickAnim - 47) / 13) * (-2.44714-(0)));
            zz = 0 + (((tickAnim - 47) / 13) * (0.51155-(0)));
        }
        else if (tickAnim >= 60 && tickAnim < 70) {
            xx = -0.86093 + (((tickAnim - 60) / 10) * (-0.74631-(-0.86093)));
            yy = -2.44714 + (((tickAnim - 60) / 10) * (-4.48751-(-2.44714)));
            zz = 0.51155 + (((tickAnim - 60) / 10) * (0.93327-(0.51155)));
        }
        else if (tickAnim >= 70 && tickAnim < 80) {
            xx = -0.74631 + (((tickAnim - 70) / 10) * (-0.36927-(-0.74631)));
            yy = -4.48751 + (((tickAnim - 70) / 10) * (-6.53579-(-4.48751)));
            zz = 0.93327 + (((tickAnim - 70) / 10) * (-1.21534-(0.93327)));
        }
        else if (tickAnim >= 80 && tickAnim < 87) {
            xx = -0.36927 + (((tickAnim - 80) / 7) * (-0.36927-(-0.36927)));
            yy = -6.53579 + (((tickAnim - 80) / 7) * (-6.53579-(-6.53579)));
            zz = -1.21534 + (((tickAnim - 80) / 7) * (-1.21534-(-1.21534)));
        }
        else if (tickAnim >= 87 && tickAnim < 100) {
            xx = -0.36927 + (((tickAnim - 87) / 13) * (0-(-0.36927)));
            yy = -6.53579 + (((tickAnim - 87) / 13) * (0-(-6.53579)));
            zz = -1.21534 + (((tickAnim - 87) / 13) * (0-(-1.21534)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck2, neck2.rotateAngleX + (float) Math.toRadians(xx), neck2.rotateAngleY + (float) Math.toRadians(yy), neck2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 0) / 10) * (2.5-(0)));
            yy = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 30) {
            xx = 2.5 + (((tickAnim - 10) / 20) * (1.80238-(2.5)));
            yy = 0 + (((tickAnim - 10) / 20) * (2.36632-(0)));
            zz = 0 + (((tickAnim - 10) / 20) * (0.80677-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 50) {
            xx = 1.80238 + (((tickAnim - 30) / 20) * (1.44414-(1.80238)));
            yy = 2.36632 + (((tickAnim - 30) / 20) * (1.62738-(2.36632)));
            zz = 0.80677 + (((tickAnim - 30) / 20) * (0.56423-(0.80677)));
        }
        else if (tickAnim >= 50 && tickAnim < 60) {
            xx = 1.44414 + (((tickAnim - 50) / 10) * (-1.41689-(1.44414)));
            yy = 1.62738 + (((tickAnim - 50) / 10) * (1.22053-(1.62738)));
            zz = 0.56423 + (((tickAnim - 50) / 10) * (0.42317-(0.56423)));
        }
        else if (tickAnim >= 60 && tickAnim < 70) {
            xx = -1.41689 + (((tickAnim - 60) / 10) * (-8.68074-(-1.41689)));
            yy = 1.22053 + (((tickAnim - 60) / 10) * (1.01711-(1.22053)));
            zz = 0.42317 + (((tickAnim - 60) / 10) * (0.35264-(0.42317)));
        }
        else if (tickAnim >= 70 && tickAnim < 80) {
            xx = -8.68074 + (((tickAnim - 70) / 10) * (-9.4446-(-8.68074)));
            yy = 1.01711 + (((tickAnim - 70) / 10) * (0.81369-(1.01711)));
            zz = 0.35264 + (((tickAnim - 70) / 10) * (0.28211-(0.35264)));
        }
        else if (tickAnim >= 80 && tickAnim < 87) {
            xx = -9.4446 + (((tickAnim - 80) / 7) * (-9.4446-(-9.4446)));
            yy = 0.81369 + (((tickAnim - 80) / 7) * (0.81369-(0.81369)));
            zz = 0.28211 + (((tickAnim - 80) / 7) * (0.28211-(0.28211)));
        }
        else if (tickAnim >= 87 && tickAnim < 100) {
            xx = -9.4446 + (((tickAnim - 87) / 13) * (0-(-9.4446)));
            yy = 0.81369 + (((tickAnim - 87) / 13) * (0-(0.81369)));
            zz = 0.28211 + (((tickAnim - 87) / 13) * (0-(0.28211)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck3, neck3.rotateAngleX + (float) Math.toRadians(xx), neck3.rotateAngleY + (float) Math.toRadians(yy), neck3.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 0) / 20) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 20) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 30) {
            xx = 0 + (((tickAnim - 20) / 10) * (-2.5-(0)));
            yy = 0 + (((tickAnim - 20) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 10) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 40) {
            xx = -2.5 + (((tickAnim - 30) / 10) * (0-(-2.5)));
            yy = 0 + (((tickAnim - 30) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 30) / 10) * (0-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 60) {
            xx = 0 + (((tickAnim - 40) / 20) * (-2.5-(0)));
            yy = 0 + (((tickAnim - 40) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 40) / 20) * (0-(0)));
        }
        else if (tickAnim >= 60 && tickAnim < 70) {
            xx = -2.5 + (((tickAnim - 60) / 10) * (-4.58-(-2.5)));
            yy = 0 + (((tickAnim - 60) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 60) / 10) * (0-(0)));
        }
        else if (tickAnim >= 70 && tickAnim < 80) {
            xx = -4.58 + (((tickAnim - 70) / 10) * (-1.16-(-4.58)));
            yy = 0 + (((tickAnim - 70) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 70) / 10) * (0-(0)));
        }
        else if (tickAnim >= 80 && tickAnim < 87) {
            xx = -1.16 + (((tickAnim - 80) / 7) * (-1.16-(-1.16)));
            yy = 0 + (((tickAnim - 80) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 80) / 7) * (0-(0)));
        }
        else if (tickAnim >= 87 && tickAnim < 100) {
            xx = -1.16 + (((tickAnim - 87) / 13) * (0-(-1.16)));
            yy = 0 + (((tickAnim - 87) / 13) * (0-(0)));
            zz = 0 + (((tickAnim - 87) / 13) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(head, head.rotateAngleX + (float) Math.toRadians(xx), head.rotateAngleY + (float) Math.toRadians(yy), head.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 60) {
            xx = 0 + (((tickAnim - 0) / 60) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 60) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 60) * (0-(0)));
        }
        else if (tickAnim >= 60 && tickAnim < 70) {
            xx = 0 + (((tickAnim - 60) / 10) * (20-(0)));
            yy = 0 + (((tickAnim - 60) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 60) / 10) * (0-(0)));
        }
        else if (tickAnim >= 70 && tickAnim < 73) {
            xx = 20 + (((tickAnim - 70) / 3) * (-0.42-(20)));
            yy = 0 + (((tickAnim - 70) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 70) / 3) * (0-(0)));
        }
        else if (tickAnim >= 73 && tickAnim < 75) {
            xx = -0.42 + (((tickAnim - 73) / 2) * (1.61-(-0.42)));
            yy = 0 + (((tickAnim - 73) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 73) / 2) * (0-(0)));
        }
        else if (tickAnim >= 75 && tickAnim < 78) {
            xx = 1.61 + (((tickAnim - 75) / 3) * (8.01-(1.61)));
            yy = 0 + (((tickAnim - 75) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 75) / 3) * (0-(0)));
        }
        else if (tickAnim >= 78 && tickAnim < 80) {
            xx = 8.01 + (((tickAnim - 78) / 2) * (4.16-(8.01)));
            yy = 0 + (((tickAnim - 78) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 78) / 2) * (0-(0)));
        }
        else if (tickAnim >= 80 && tickAnim < 83) {
            xx = 4.16 + (((tickAnim - 80) / 3) * (-0.99-(4.16)));
            yy = 0 + (((tickAnim - 80) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 80) / 3) * (0-(0)));
        }
        else if (tickAnim >= 83 && tickAnim < 85) {
            xx = -0.99 + (((tickAnim - 83) / 2) * (1.59-(-0.99)));
            yy = 0 + (((tickAnim - 83) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 83) / 2) * (0-(0)));
        }
        else if (tickAnim >= 85 && tickAnim < 100) {
            xx = 1.59 + (((tickAnim - 85) / 15) * (0-(1.59)));
            yy = 0 + (((tickAnim - 85) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 85) / 15) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(jaw, jaw.rotateAngleX + (float) Math.toRadians(xx), jaw.rotateAngleY + (float) Math.toRadians(yy), jaw.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 20) {
            xx = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1))*1 + (((tickAnim - 0) / 20) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1.5-60))*-5-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1))*1)));
            yy = 0 + (((tickAnim - 0) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 20) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 30) {
            xx = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1.5-60))*-5 + (((tickAnim - 20) / 10) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*720/0.5-90))*0.5-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1.5-60))*-5)));
            yy = 0 + (((tickAnim - 20) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 10) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 70) {
            xx = Math.sin((Math.PI/180)*(((double)tickAnim/20)*720/0.5-90))*0.5 + (((tickAnim - 30) / 40) * (-10+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720/4-90))*5-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*720/0.5-90))*0.5)));
            yy = 0 + (((tickAnim - 30) / 40) * (0-(0)));
            zz = 0 + (((tickAnim - 30) / 40) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(throat, throat.rotateAngleX + (float) Math.toRadians(xx), throat.rotateAngleY + (float) Math.toRadians(yy), throat.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 73) {
            xx = 0 + (((tickAnim - 0) / 73) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 73) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 73) * (0.3-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.throat.rotationPointX = this.throat.rotationPointX + (float)(xx);
        this.throat.rotationPointY = this.throat.rotationPointY - (float)(yy);
        this.throat.rotationPointZ = this.throat.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 20) {
            xx = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1))*-5 + (((tickAnim - 0) / 20) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1.5))*20-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1))*-5)));
            yy = 0 + (((tickAnim - 0) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 20) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 30) {
            xx = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1.5))*20 + (((tickAnim - 20) / 10) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*720/0.5))*1-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1.5))*20)));
            yy = 0 + (((tickAnim - 20) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 10) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 70) {
            xx = Math.sin((Math.PI/180)*(((double)tickAnim/20)*720/0.5))*1 + (((tickAnim - 30) / 40) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*720/4))*10-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*720/0.5))*1)));
            yy = 0 + (((tickAnim - 30) / 40) * (0-(0)));
            zz = 0 + (((tickAnim - 30) / 40) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftarm2, leftarm2.rotateAngleX + (float) Math.toRadians(xx), leftarm2.rotateAngleY + (float) Math.toRadians(yy), leftarm2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 20) {
            xx = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1))*-5 + (((tickAnim - 0) / 20) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1.5))*20-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1))*-5)));
            yy = 0 + (((tickAnim - 0) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 20) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 30) {
            xx = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1.5))*20 + (((tickAnim - 20) / 10) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*720/0.5))*1-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1.5))*20)));
            yy = 0 + (((tickAnim - 20) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 10) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 70) {
            xx = Math.sin((Math.PI/180)*(((double)tickAnim/20)*720/0.5))*1 + (((tickAnim - 30) / 40) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*720/4))*10-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*720/0.5))*1)));
            yy = 0 + (((tickAnim - 30) / 40) * (0-(0)));
            zz = 0 + (((tickAnim - 30) / 40) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightarm2, rightarm2.rotateAngleX + (float) Math.toRadians(xx), rightarm2.rotateAngleY + (float) Math.toRadians(yy), rightarm2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 100) {
            xx = 0 + (((tickAnim - 0) / 100) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 100) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 100) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck4, neck4.rotateAngleX + (float) Math.toRadians(xx), neck4.rotateAngleY + (float) Math.toRadians(yy), neck4.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 31) {
            xx = 0 + (((tickAnim - 0) / 31) * (0-(0)));
            yy = 0.1 + (((tickAnim - 0) / 31) * (0.625-(0.1)));
            zz = 0.3 + (((tickAnim - 0) / 31) * (0.7-(0.3)));
        }
        else if (tickAnim >= 31 && tickAnim < 33) {
            xx = 0 + (((tickAnim - 31) / 2) * (0-(0)));
            yy = 0.625 + (((tickAnim - 31) / 2) * (-1.135-(0.625)));
            zz = 0.7 + (((tickAnim - 31) / 2) * (-0.65-(0.7)));
        }
        else if (tickAnim >= 33 && tickAnim < 37) {
            xx = 0 + (((tickAnim - 33) / 4) * (0-(0)));
            yy = -1.135 + (((tickAnim - 33) / 4) * (0.575-(-1.135)));
            zz = -0.65 + (((tickAnim - 33) / 4) * (0.725-(-0.65)));
        }
        else if (tickAnim >= 37 && tickAnim < 39) {
            xx = 0 + (((tickAnim - 37) / 2) * (0-(0)));
            yy = 0.575 + (((tickAnim - 37) / 2) * (-1.135-(0.575)));
            zz = 0.725 + (((tickAnim - 37) / 2) * (-0.65-(0.725)));
        }
        else if (tickAnim >= 39 && tickAnim < 42) {
            xx = 0 + (((tickAnim - 39) / 3) * (0-(0)));
            yy = -1.135 + (((tickAnim - 39) / 3) * (0.575-(-1.135)));
            zz = -0.65 + (((tickAnim - 39) / 3) * (0.725-(-0.65)));
        }
        else if (tickAnim >= 42 && tickAnim < 44) {
            xx = 0 + (((tickAnim - 42) / 2) * (0-(0)));
            yy = 0.575 + (((tickAnim - 42) / 2) * (-1.135-(0.575)));
            zz = 0.725 + (((tickAnim - 42) / 2) * (-0.65-(0.725)));
        }
        else if (tickAnim >= 44 && tickAnim < 47) {
            xx = 0 + (((tickAnim - 44) / 3) * (0-(0)));
            yy = -1.135 + (((tickAnim - 44) / 3) * (0.35-(-1.135)));
            zz = -0.65 + (((tickAnim - 44) / 3) * (0.55-(-0.65)));
        }
        else if (tickAnim >= 47 && tickAnim < 49) {
            xx = 0 + (((tickAnim - 47) / 2) * (0-(0)));
            yy = 0.35 + (((tickAnim - 47) / 2) * (-1.135-(0.35)));
            zz = 0.55 + (((tickAnim - 47) / 2) * (-0.65-(0.55)));
        }
        else if (tickAnim >= 49 && tickAnim < 52) {
            xx = 0 + (((tickAnim - 49) / 3) * (0-(0)));
            yy = -1.135 + (((tickAnim - 49) / 3) * (0.35-(-1.135)));
            zz = -0.65 + (((tickAnim - 49) / 3) * (0.55-(-0.65)));
        }
        else if (tickAnim >= 52 && tickAnim < 71) {
            xx = 0 + (((tickAnim - 52) / 19) * (0-(0)));
            yy = 0.35 + (((tickAnim - 52) / 19) * (-0.1-(0.35)));
            zz = 0.55 + (((tickAnim - 52) / 19) * (0.875-(0.55)));
        }
        else if (tickAnim >= 71 && tickAnim < 73) {
            xx = 0 + (((tickAnim - 71) / 2) * (0-(0)));
            yy = -0.1 + (((tickAnim - 71) / 2) * (-1.17-(-0.1)));
            zz = 0.875 + (((tickAnim - 71) / 2) * (-0.22-(0.875)));
        }
        else if (tickAnim >= 73 && tickAnim < 75) {
            xx = 0 + (((tickAnim - 73) / 2) * (0-(0)));
            yy = -1.17 + (((tickAnim - 73) / 2) * (-0.125-(-1.17)));
            zz = -0.22 + (((tickAnim - 73) / 2) * (0.35-(-0.22)));
        }
        else if (tickAnim >= 75 && tickAnim < 81) {
            xx = 0 + (((tickAnim - 75) / 6) * (0-(0)));
            yy = -0.125 + (((tickAnim - 75) / 6) * (-0.125-(-0.125)));
            zz = 0.35 + (((tickAnim - 75) / 6) * (0.35-(0.35)));
        }
        else if (tickAnim >= 81 && tickAnim < 83) {
            xx = 0 + (((tickAnim - 81) / 2) * (0-(0)));
            yy = -0.125 + (((tickAnim - 81) / 2) * (-1.17-(-0.125)));
            zz = 0.35 + (((tickAnim - 81) / 2) * (-0.22-(0.35)));
        }
        else if (tickAnim >= 83 && tickAnim < 85) {
            xx = 0 + (((tickAnim - 83) / 2) * (0-(0)));
            yy = -1.17 + (((tickAnim - 83) / 2) * (-0.125-(-1.17)));
            zz = -0.22 + (((tickAnim - 83) / 2) * (0.35-(-0.22)));
        }
        else if (tickAnim >= 85 && tickAnim < 91) {
            xx = 0 + (((tickAnim - 85) / 6) * (0-(0)));
            yy = -0.125 + (((tickAnim - 85) / 6) * (-0.205-(-0.125)));
            zz = 0.35 + (((tickAnim - 85) / 6) * (0.17-(0.35)));
        }
        else if (tickAnim >= 91 && tickAnim < 100) {
            xx = 0 + (((tickAnim - 91) / 9) * (0-(0)));
            yy = -0.205 + (((tickAnim - 91) / 9) * (0.1-(-0.205)));
            zz = 0.17 + (((tickAnim - 91) / 9) * (0.3-(0.17)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.throat2.rotationPointX = this.throat2.rotationPointX + (float)(xx);
        this.throat2.rotationPointY = this.throat2.rotationPointY - (float)(yy);
        this.throat2.rotationPointZ = this.throat2.rotationPointZ + (float)(zz);


        if (tickAnim >= 0 && tickAnim < 31) {
            xx = 1 + (((tickAnim - 0) / 31) * (0.9907-(1)));
            yy = 1 + (((tickAnim - 0) / 31) * (1-(1)));
            zz = 1 + (((tickAnim - 0) / 31) * (1.0953-(1)));
        }
        else if (tickAnim >= 31 && tickAnim < 33) {
            xx = 0.9907 + (((tickAnim - 31) / 2) * (1.2-(0.9907)));
            yy = 1 + (((tickAnim - 31) / 2) * (1-(1)));
            zz = 1.0953 + (((tickAnim - 31) / 2) * (1.1-(1.0953)));
        }
        else if (tickAnim >= 33 && tickAnim < 37) {
            xx = 1.2 + (((tickAnim - 33) / 4) * (0.9907-(1.2)));
            yy = 1 + (((tickAnim - 33) / 4) * (1-(1)));
            zz = 1.1 + (((tickAnim - 33) / 4) * (1.0953-(1.1)));
        }
        else if (tickAnim >= 37 && tickAnim < 39) {
            xx = 0.9907 + (((tickAnim - 37) / 2) * (1.2-(0.9907)));
            yy = 1 + (((tickAnim - 37) / 2) * (1-(1)));
            zz = 1.0953 + (((tickAnim - 37) / 2) * (1.1-(1.0953)));
        }
        else if (tickAnim >= 39 && tickAnim < 42) {
            xx = 1.2 + (((tickAnim - 39) / 3) * (0.9907-(1.2)));
            yy = 1 + (((tickAnim - 39) / 3) * (1-(1)));
            zz = 1.1 + (((tickAnim - 39) / 3) * (1.0953-(1.1)));
        }
        else if (tickAnim >= 42 && tickAnim < 44) {
            xx = 0.9907 + (((tickAnim - 42) / 2) * (1.2-(0.9907)));
            yy = 1 + (((tickAnim - 42) / 2) * (1-(1)));
            zz = 1.0953 + (((tickAnim - 42) / 2) * (1.1-(1.0953)));
        }
        else if (tickAnim >= 44 && tickAnim < 47) {
            xx = 1.2 + (((tickAnim - 44) / 3) * (0.9907-(1.2)));
            yy = 1 + (((tickAnim - 44) / 3) * (1-(1)));
            zz = 1.1 + (((tickAnim - 44) / 3) * (1.0953-(1.1)));
        }
        else if (tickAnim >= 47 && tickAnim < 49) {
            xx = 0.9907 + (((tickAnim - 47) / 2) * (1.2-(0.9907)));
            yy = 1 + (((tickAnim - 47) / 2) * (1-(1)));
            zz = 1.0953 + (((tickAnim - 47) / 2) * (1.1-(1.0953)));
        }
        else if (tickAnim >= 49 && tickAnim < 52) {
            xx = 1.2 + (((tickAnim - 49) / 3) * (0.9907-(1.2)));
            yy = 1 + (((tickAnim - 49) / 3) * (1-(1)));
            zz = 1.1 + (((tickAnim - 49) / 3) * (1.0953-(1.1)));
        }
        else if (tickAnim >= 52 && tickAnim < 71) {
            xx = 0.9907 + (((tickAnim - 52) / 19) * (0.9907-(0.9907)));
            yy = 1 + (((tickAnim - 52) / 19) * (1-(1)));
            zz = 1.0953 + (((tickAnim - 52) / 19) * (1.0953-(1.0953)));
        }
        else if (tickAnim >= 71 && tickAnim < 73) {
            xx = 0.9907 + (((tickAnim - 71) / 2) * (1.0907-(0.9907)));
            yy = 1 + (((tickAnim - 71) / 2) * (1-(1)));
            zz = 1.0953 + (((tickAnim - 71) / 2) * (1.0953-(1.0953)));
        }
        else if (tickAnim >= 73 && tickAnim < 75) {
            xx = 1.0907 + (((tickAnim - 73) / 2) * (0.9907-(1.0907)));
            yy = 1 + (((tickAnim - 73) / 2) * (1-(1)));
            zz = 1.0953 + (((tickAnim - 73) / 2) * (1.0953-(1.0953)));
        }
        else if (tickAnim >= 75 && tickAnim < 81) {
            xx = 0.9907 + (((tickAnim - 75) / 6) * (0.9907-(0.9907)));
            yy = 1 + (((tickAnim - 75) / 6) * (1-(1)));
            zz = 1.0953 + (((tickAnim - 75) / 6) * (1.0953-(1.0953)));
        }
        else if (tickAnim >= 81 && tickAnim < 83) {
            xx = 0.9907 + (((tickAnim - 81) / 2) * (1.0907-(0.9907)));
            yy = 1 + (((tickAnim - 81) / 2) * (1-(1)));
            zz = 1.0953 + (((tickAnim - 81) / 2) * (1.0953-(1.0953)));
        }
        else if (tickAnim >= 83 && tickAnim < 85) {
            xx = 1.0907 + (((tickAnim - 83) / 2) * (0.9907-(1.0907)));
            yy = 1 + (((tickAnim - 83) / 2) * (1-(1)));
            zz = 1.0953 + (((tickAnim - 83) / 2) * (1.0953-(1.0953)));
        }
        else if (tickAnim >= 85 && tickAnim < 100) {
            xx = 0.9907 + (((tickAnim - 85) / 15) * (1-(0.9907)));
            yy = 1 + (((tickAnim - 85) / 15) * (1-(1)));
            zz = 1.0953 + (((tickAnim - 85) / 15) * (1-(1.0953)));
        }
        else {
            xx = 1;
            yy = 1;
            zz = 1;
        }
        this.throat2.setScale((float)xx, (float)yy, (float)zz);




        if (tickAnim >= 0 && tickAnim < 14) {
            xx = 0 + (((tickAnim - 0) / 14) * (-12.91862-(0)));
            yy = 0 + (((tickAnim - 0) / 14) * (-7.8603-(0)));
            zz = 0 + (((tickAnim - 0) / 14) * (5.2097-(0)));
        }
        else if (tickAnim >= 14 && tickAnim < 50) {
            xx = -12.91862 + (((tickAnim - 14) / 36) * (-5.21178-(-12.91862)));
            yy = -7.8603 + (((tickAnim - 14) / 36) * (-8.04612-(-7.8603)));
            zz = 5.2097 + (((tickAnim - 14) / 36) * (6.64261-(5.2097)));
        }
        else if (tickAnim >= 50 && tickAnim < 72) {
            xx = -5.21178 + (((tickAnim - 50) / 22) * (-39.26262-(-5.21178)));
            yy = -8.04612 + (((tickAnim - 50) / 22) * (-3.50602-(-8.04612)));
            zz = 6.64261 + (((tickAnim - 50) / 22) * (11.66628-(6.64261)));
        }
        else if (tickAnim >= 72 && tickAnim < 80) {
            xx = -39.26262 + (((tickAnim - 72) / 8) * (-39.26262-(-39.26262)));
            yy = -3.50602 + (((tickAnim - 72) / 8) * (-3.50602-(-3.50602)));
            zz = 11.66628 + (((tickAnim - 72) / 8) * (11.66628-(11.66628)));
        }
        else if (tickAnim >= 80 && tickAnim < 100) {
            xx = -39.26262 + (((tickAnim - 80) / 20) * (0-(-39.26262)));
            yy = -3.50602 + (((tickAnim - 80) / 20) * (0-(-3.50602)));
            zz = 11.66628 + (((tickAnim - 80) / 20) * (0-(11.66628)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftarm, leftarm.rotateAngleX + (float) Math.toRadians(xx), leftarm.rotateAngleY + (float) Math.toRadians(yy), leftarm.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 0) / 13) * (7.26484-(0)));
            yy = 0 + (((tickAnim - 0) / 13) * (18.09536-(0)));
            zz = 0 + (((tickAnim - 0) / 13) * (-8.72189-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 50) {
            xx = 7.26484 + (((tickAnim - 13) / 37) * (-2.54192-(7.26484)));
            yy = 18.09536 + (((tickAnim - 13) / 37) * (12.97871-(18.09536)));
            zz = -8.72189 + (((tickAnim - 13) / 37) * (-12.299-(-8.72189)));
        }
        else if (tickAnim >= 50 && tickAnim < 72) {
            xx = -2.54192 + (((tickAnim - 50) / 22) * (-6.38373-(-2.54192)));
            yy = 12.97871 + (((tickAnim - 50) / 22) * (7.40974-(12.97871)));
            zz = -12.299 + (((tickAnim - 50) / 22) * (-7.02169-(-12.299)));
        }
        else if (tickAnim >= 72 && tickAnim < 100) {
            xx = -6.38373 + (((tickAnim - 72) / 28) * (0-(-6.38373)));
            yy = 7.40974 + (((tickAnim - 72) / 28) * (0-(7.40974)));
            zz = -7.02169 + (((tickAnim - 72) / 28) * (0-(-7.02169)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightarm, rightarm.rotateAngleX + (float) Math.toRadians(xx), rightarm.rotateAngleY + (float) Math.toRadians(yy), rightarm.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 77) {
            xx = 0 + (((tickAnim - 0) / 77) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 77) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 77) * (0-(0)));
        }
        else if (tickAnim >= 77 && tickAnim < 100) {
            xx = 0 + (((tickAnim - 77) / 23) * (0-(0)));
            yy = 0 + (((tickAnim - 77) / 23) * (0-(0)));
            zz = 0 + (((tickAnim - 77) / 23) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.jaw5.rotationPointX = this.jaw5.rotationPointX + (float)(xx);
        this.jaw5.rotationPointY = this.jaw5.rotationPointY - (float)(yy);
        this.jaw5.rotationPointZ = this.jaw5.rotationPointZ + (float)(zz);



        this.throat3.rotationPointX = this.throat3.rotationPointX + (float)(0);
        this.throat3.rotationPointY = this.throat3.rotationPointY - (float)(0);
        this.throat3.rotationPointZ = this.throat3.rotationPointZ + (float)(0);



        if (tickAnim >= 0 && tickAnim < 66) {
            xx = 0 + (((tickAnim - 0) / 66) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 66) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 66) * (0-(0)));
        }
        else if (tickAnim >= 66 && tickAnim < 70) {
            xx = 0 + (((tickAnim - 66) / 4) * (0-(0)));
            yy = 0 + (((tickAnim - 66) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 66) / 4) * (-7.5-(0)));
        }
        else if (tickAnim >= 70 && tickAnim < 74) {
            xx = 0 + (((tickAnim - 70) / 4) * (0-(0)));
            yy = 0 + (((tickAnim - 70) / 4) * (0-(0)));
            zz = -7.5 + (((tickAnim - 70) / 4) * (0-(-7.5)));
        }
        else if (tickAnim >= 74 && tickAnim < 100) {
            xx = 0 + (((tickAnim - 74) / 26) * (0-(0)));
            yy = 0 + (((tickAnim - 74) / 26) * (0-(0)));
            zz = 0 + (((tickAnim - 74) / 26) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftHand, leftHand.rotateAngleX + (float) Math.toRadians(xx), leftHand.rotateAngleY + (float) Math.toRadians(yy), leftHand.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 30) {
            xx = 0 + (((tickAnim - 0) / 30) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 30) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 30) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 34) {
            xx = 0 + (((tickAnim - 30) / 4) * (0-(0)));
            yy = 0 + (((tickAnim - 30) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 30) / 4) * (12.5-(0)));
        }
        else if (tickAnim >= 34 && tickAnim < 38) {
            xx = 0 + (((tickAnim - 34) / 4) * (0-(0)));
            yy = 0 + (((tickAnim - 34) / 4) * (0-(0)));
            zz = 12.5 + (((tickAnim - 34) / 4) * (0-(12.5)));
        }
        else if (tickAnim >= 38 && tickAnim < 100) {
            xx = 0 + (((tickAnim - 38) / 62) * (0-(0)));
            yy = 0 + (((tickAnim - 38) / 62) * (0-(0)));
            zz = 0 + (((tickAnim - 38) / 62) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightHand, rightHand.rotateAngleX + (float) Math.toRadians(xx), rightHand.rotateAngleY + (float) Math.toRadians(yy), rightHand.rotateAngleZ + (float) Math.toRadians(zz));

    }

    public void animRoar(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime, double animTick) {
        EntityPrehistoricFloraSinraptor entity = (EntityPrehistoricFloraSinraptor) entitylivingbaseIn;

        int animCycle = 80;
        double tickAnim = animTick + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;


        if (tickAnim >= 0 && tickAnim < 20) {
            xx = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1))*-2.5 + (((tickAnim - 0) / 20) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1.5-30))*2.5-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1))*-2.5)));
            yy = 0 + (((tickAnim - 0) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 20) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 29) {
            xx = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1.5-30))*2.5 + (((tickAnim - 20) / 9) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/3-30))*-5-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1.5-30))*2.5)));
            yy = 0 + (((tickAnim - 20) / 9) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 9) * (0-(0)));
        }
        else if (tickAnim >= 29 && tickAnim < 70) {
            xx = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/3-30))*-5 + (((tickAnim - 29) / 41) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/4-30))*5-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/3-30))*-5)));
            yy = 0 + (((tickAnim - 29) / 41) * (0-(0)));
            zz = 0 + (((tickAnim - 29) / 41) * (0-(0)));
        }
        else if (tickAnim >= 70 && tickAnim < 80) {
            xx = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/4-30))*5 + (((tickAnim - 70) / 10) * (0-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/4-30))*5)));
            yy = 0 + (((tickAnim - 70) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 70) / 10) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tail2, tail2.rotateAngleX + (float) Math.toRadians(xx), tail2.rotateAngleY + (float) Math.toRadians(yy), tail2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 30) {
            xx = 0 + (((tickAnim - 0) / 30) * (22.5-(0)));
            yy = 0 + (((tickAnim - 0) / 30) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 30) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 80) {
            xx = 22.5 + (((tickAnim - 30) / 50) * (0-(22.5)));
            yy = 0 + (((tickAnim - 30) / 50) * (0-(0)));
            zz = 0 + (((tickAnim - 30) / 50) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck2, neck2.rotateAngleX + (float) Math.toRadians(xx), neck2.rotateAngleY + (float) Math.toRadians(yy), neck2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 30) {
            xx = 0 + (((tickAnim - 0) / 30) * (10-(0)));
            yy = 0 + (((tickAnim - 0) / 30) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 30) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 80) {
            xx = 10 + (((tickAnim - 30) / 50) * (0-(10)));
            yy = 0 + (((tickAnim - 30) / 50) * (0-(0)));
            zz = 0 + (((tickAnim - 30) / 50) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck3, neck3.rotateAngleX + (float) Math.toRadians(xx), neck3.rotateAngleY + (float) Math.toRadians(yy), neck3.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 30) {
            xx = 0 + (((tickAnim - 0) / 30) * (-25-(0)));
            yy = 0 + (((tickAnim - 0) / 30) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 30) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 80) {
            xx = -25 + (((tickAnim - 30) / 50) * (0-(-25)));
            yy = 0 + (((tickAnim - 30) / 50) * (0-(0)));
            zz = 0 + (((tickAnim - 30) / 50) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck4, neck4.rotateAngleX + (float) Math.toRadians(xx), neck4.rotateAngleY + (float) Math.toRadians(yy), neck4.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 30) {
            xx = 0 + (((tickAnim - 0) / 30) * (10-(0)));
            yy = 0 + (((tickAnim - 0) / 30) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 30) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 80) {
            xx = 10 + (((tickAnim - 30) / 50) * (0-(10)));
            yy = 0 + (((tickAnim - 30) / 50) * (0-(0)));
            zz = 0 + (((tickAnim - 30) / 50) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(head, head.rotateAngleX + (float) Math.toRadians(xx), head.rotateAngleY + (float) Math.toRadians(yy), head.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 0 + (((tickAnim - 0) / 3) * (2.5-(0)));
            yy = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 3) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 6) {
            xx = 2.5 + (((tickAnim - 3) / 3) * (-0.11-(2.5)));
            yy = 0 + (((tickAnim - 3) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 3) / 3) * (0-(0)));
        }
        else if (tickAnim >= 6 && tickAnim < 8) {
            xx = -0.11 + (((tickAnim - 6) / 2) * (3.5-(-0.11)));
            yy = 0 + (((tickAnim - 6) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 6) / 2) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 11) {
            xx = 3.5 + (((tickAnim - 8) / 3) * (-0.11-(3.5)));
            yy = 0 + (((tickAnim - 8) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 3) * (0-(0)));
        }
        else if (tickAnim >= 11 && tickAnim < 13) {
            xx = -0.11 + (((tickAnim - 11) / 2) * (4.5-(-0.11)));
            yy = 0 + (((tickAnim - 11) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 11) / 2) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 16) {
            xx = 4.5 + (((tickAnim - 13) / 3) * (2.39-(4.5)));
            yy = 0 + (((tickAnim - 13) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 13) / 3) * (0-(0)));
        }
        else if (tickAnim >= 16 && tickAnim < 18) {
            xx = 2.39 + (((tickAnim - 16) / 2) * (5.5-(2.39)));
            yy = 0 + (((tickAnim - 16) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 16) / 2) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 22) {
            xx = 5.5 + (((tickAnim - 18) / 4) * (3.39-(5.5)));
            yy = 0 + (((tickAnim - 18) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 18) / 4) * (0-(0)));
        }
        else if (tickAnim >= 22 && tickAnim < 24) {
            xx = 3.39 + (((tickAnim - 22) / 2) * (6.5-(3.39)));
            yy = 0 + (((tickAnim - 22) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 22) / 2) * (0-(0)));
        }
        else if (tickAnim >= 24 && tickAnim < 27) {
            xx = 6.5 + (((tickAnim - 24) / 3) * (4.39-(6.5)));
            yy = 0 + (((tickAnim - 24) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 24) / 3) * (0-(0)));
        }
        else if (tickAnim >= 27 && tickAnim < 29) {
            xx = 4.39 + (((tickAnim - 27) / 2) * (8.5-(4.39)));
            yy = 0 + (((tickAnim - 27) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 27) / 2) * (0-(0)));
        }
        else if (tickAnim >= 29 && tickAnim < 32) {
            xx = 8.5 + (((tickAnim - 29) / 3) * (6.39-(8.5)));
            yy = 0 + (((tickAnim - 29) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 29) / 3) * (0-(0)));
        }
        else if (tickAnim >= 32 && tickAnim < 34) {
            xx = 6.39 + (((tickAnim - 32) / 2) * (10.5-(6.39)));
            yy = 0 + (((tickAnim - 32) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 32) / 2) * (0-(0)));
        }
        else if (tickAnim >= 34 && tickAnim < 37) {
            xx = 10.5 + (((tickAnim - 34) / 3) * (8.39-(10.5)));
            yy = 0 + (((tickAnim - 34) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 34) / 3) * (0-(0)));
        }
        else if (tickAnim >= 37 && tickAnim < 39) {
            xx = 8.39 + (((tickAnim - 37) / 2) * (15.5-(8.39)));
            yy = 0 + (((tickAnim - 37) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 37) / 2) * (0-(0)));
        }
        else if (tickAnim >= 39 && tickAnim < 59) {
            xx = 15.5 + (((tickAnim - 39) / 20) * (42.91-(15.5)));
            yy = 0 + (((tickAnim - 39) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 39) / 20) * (0-(0)));
        }
        else if (tickAnim >= 59 && tickAnim < 80) {
            xx = 42.91 + (((tickAnim - 59) / 21) * (0-(42.91)));
            yy = 0 + (((tickAnim - 59) / 21) * (0-(0)));
            zz = 0 + (((tickAnim - 59) / 21) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(jaw, jaw.rotateAngleX + (float) Math.toRadians(xx), jaw.rotateAngleY + (float) Math.toRadians(yy), jaw.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 20) {
            xx = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1))*1 + (((tickAnim - 0) / 20) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1.5-60))*-5-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1))*1)));
            yy = 0 + (((tickAnim - 0) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 20) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 30) {
            xx = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1.5-60))*-5 + (((tickAnim - 20) / 10) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*720/0.5-90))*0.5-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1.5-60))*-5)));
            yy = 0 + (((tickAnim - 20) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 10) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 70) {
            xx = Math.sin((Math.PI/180)*(((double)tickAnim/20)*720/0.5-90))*0.5 + (((tickAnim - 30) / 40) * (-10+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720/4-90))*5-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*720/0.5-90))*0.5)));
            yy = 0 + (((tickAnim - 30) / 40) * (0-(0)));
            zz = 0 + (((tickAnim - 30) / 40) * (0-(0)));
        }
        else if (tickAnim >= 70 && tickAnim < 80) {
            xx = -10+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720/4-90))*5 + (((tickAnim - 70) / 10) * (0-(-10+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720/4-90))*5)));
            yy = 0 + (((tickAnim - 70) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 70) / 10) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(throat, throat.rotateAngleX + (float) Math.toRadians(xx), throat.rotateAngleY + (float) Math.toRadians(yy), throat.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 20) {
            xx = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1))*-5 + (((tickAnim - 0) / 20) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1.5))*20-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1))*-5)));
            yy = 0 + (((tickAnim - 0) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 20) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 30) {
            xx = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1.5))*20 + (((tickAnim - 20) / 10) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*720/0.5))*1-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1.5))*20)));
            yy = 0 + (((tickAnim - 20) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 10) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 70) {
            xx = Math.sin((Math.PI/180)*(((double)tickAnim/20)*720/0.5))*1 + (((tickAnim - 30) / 40) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*720/4))*10-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*720/0.5))*1)));
            yy = 0 + (((tickAnim - 30) / 40) * (0-(0)));
            zz = 0 + (((tickAnim - 30) / 40) * (0-(0)));
        }
        else if (tickAnim >= 70 && tickAnim < 80) {
            xx = Math.sin((Math.PI/180)*(((double)tickAnim/20)*720/4))*10 + (((tickAnim - 70) / 10) * (0-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*720/4))*10)));
            yy = 0 + (((tickAnim - 70) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 70) / 10) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftarm2, leftarm2.rotateAngleX + (float) Math.toRadians(xx), leftarm2.rotateAngleY + (float) Math.toRadians(yy), leftarm2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 20) {
            xx = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1))*-5 + (((tickAnim - 0) / 20) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1.5))*20-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1))*-5)));
            yy = 0 + (((tickAnim - 0) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 20) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 30) {
            xx = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1.5))*20 + (((tickAnim - 20) / 10) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*720/0.5))*1-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1.5))*20)));
            yy = 0 + (((tickAnim - 20) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 10) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 70) {
            xx = Math.sin((Math.PI/180)*(((double)tickAnim/20)*720/0.5))*1 + (((tickAnim - 30) / 40) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*720/4))*10-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*720/0.5))*1)));
            yy = 0 + (((tickAnim - 30) / 40) * (0-(0)));
            zz = 0 + (((tickAnim - 30) / 40) * (0-(0)));
        }
        else if (tickAnim >= 70 && tickAnim < 80) {
            xx = Math.sin((Math.PI/180)*(((double)tickAnim/20)*720/4))*10 + (((tickAnim - 70) / 10) * (0-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*720/4))*10)));
            yy = 0 + (((tickAnim - 70) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 70) / 10) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightarm2, rightarm2.rotateAngleX + (float) Math.toRadians(xx), rightarm2.rotateAngleY + (float) Math.toRadians(yy), rightarm2.rotateAngleZ + (float) Math.toRadians(zz));

    }

    public void animScratch(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime, double animTick) {
        EntityPrehistoricFloraSinraptor entity = (EntityPrehistoricFloraSinraptor) entitylivingbaseIn;

        int animCycle = 80;
        double tickAnim = animTick + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;


        if (tickAnim >= 0 && tickAnim < 40) {
            xx = 0 + (((tickAnim - 0) / 40) * (-7.5-(0)));
            yy = 0 + (((tickAnim - 0) / 40) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 40) * (0-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 80) {
            xx = -7.5 + (((tickAnim - 40) / 40) * (0-(-7.5)));
            yy = 0 + (((tickAnim - 40) / 40) * (0-(0)));
            zz = 0 + (((tickAnim - 40) / 40) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(body, body.rotateAngleX + (float) Math.toRadians(xx), body.rotateAngleY + (float) Math.toRadians(yy), body.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 11) {
            xx = 0 + (((tickAnim - 0) / 11) * (-1.67535-(0)));
            yy = 0 + (((tickAnim - 0) / 11) * (0.40317-(0)));
            zz = 0 + (((tickAnim - 0) / 11) * (-2.4673-(0)));
        }
        else if (tickAnim >= 11 && tickAnim < 17) {
            xx = -1.67535 + (((tickAnim - 11) / 6) * (-2.5-(-1.67535)));
            yy = 0.40317 + (((tickAnim - 11) / 6) * (0-(0.40317)));
            zz = -2.4673 + (((tickAnim - 11) / 6) * (0-(-2.4673)));
        }
        else if (tickAnim >= 17 && tickAnim < 24) {
            xx = -2.5 + (((tickAnim - 17) / 7) * (-5.12958-(-2.5)));
            yy = 0 + (((tickAnim - 17) / 7) * (-0.50833-(0)));
            zz = 0 + (((tickAnim - 17) / 7) * (4.97416-(0)));
        }
        else if (tickAnim >= 24 && tickAnim < 30) {
            xx = -5.12958 + (((tickAnim - 24) / 6) * (-6.97-(-5.12958)));
            yy = -0.50833 + (((tickAnim - 24) / 6) * (0-(-0.50833)));
            zz = 4.97416 + (((tickAnim - 24) / 6) * (0-(4.97416)));
        }
        else if (tickAnim >= 30 && tickAnim < 39) {
            xx = -6.97 + (((tickAnim - 30) / 9) * (1.77-(-6.97)));
            yy = 0 + (((tickAnim - 30) / 9) * (0-(0)));
            zz = 0 + (((tickAnim - 30) / 9) * (0-(0)));
        }
        else if (tickAnim >= 39 && tickAnim < 48) {
            xx = 1.77 + (((tickAnim - 39) / 9) * (0.51-(1.77)));
            yy = 0 + (((tickAnim - 39) / 9) * (0-(0)));
            zz = 0 + (((tickAnim - 39) / 9) * (0-(0)));
        }
        else if (tickAnim >= 48 && tickAnim < 58) {
            xx = 0.51 + (((tickAnim - 48) / 10) * (-4.67-(0.51)));
            yy = 0 + (((tickAnim - 48) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 48) / 10) * (0-(0)));
        }
        else if (tickAnim >= 58 && tickAnim < 68) {
            xx = -4.67 + (((tickAnim - 58) / 10) * (-10.2-(-4.67)));
            yy = 0 + (((tickAnim - 58) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 58) / 10) * (0-(0)));
        }
        else if (tickAnim >= 68 && tickAnim < 80) {
            xx = -10.2 + (((tickAnim - 68) / 12) * (0-(-10.2)));
            yy = 0 + (((tickAnim - 68) / 12) * (0-(0)));
            zz = 0 + (((tickAnim - 68) / 12) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(body2, body2.rotateAngleX + (float) Math.toRadians(xx), body2.rotateAngleY + (float) Math.toRadians(yy), body2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 6) {
            xx = 0 + (((tickAnim - 0) / 6) * (-1.56-(0)));
            yy = 0 + (((tickAnim - 0) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 6) * (0-(0)));
        }
        else if (tickAnim >= 6 && tickAnim < 13) {
            xx = -1.56 + (((tickAnim - 6) / 7) * (2.5-(-1.56)));
            yy = 0 + (((tickAnim - 6) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 6) / 7) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 23) {
            xx = 2.5 + (((tickAnim - 13) / 10) * (2.19119-(2.5)));
            yy = 0 + (((tickAnim - 13) / 10) * (-0.16966-(0)));
            zz = 0 + (((tickAnim - 13) / 10) * (-2.49424-(0)));
        }
        else if (tickAnim >= 23 && tickAnim < 33) {
            xx = 2.19119 + (((tickAnim - 23) / 10) * (1.81349-(2.19119)));
            yy = -0.16966 + (((tickAnim - 23) / 10) * (0.0454-(-0.16966)));
            zz = -2.49424 + (((tickAnim - 23) / 10) * (0.42642-(-2.49424)));
        }
        else if (tickAnim >= 33 && tickAnim < 43) {
            xx = 1.81349 + (((tickAnim - 33) / 10) * (-3.62425-(1.81349)));
            yy = 0.0454 + (((tickAnim - 33) / 10) * (0.03444-(0.0454)));
            zz = 0.42642 + (((tickAnim - 33) / 10) * (0.32349-(0.42642)));
        }
        else if (tickAnim >= 43 && tickAnim < 49) {
            xx = -3.62425 + (((tickAnim - 43) / 6) * (-3.09302-(-3.62425)));
            yy = 0.03444 + (((tickAnim - 43) / 6) * (0.82892-(0.03444)));
            zz = 0.32349 + (((tickAnim - 43) / 6) * (5.21528-(0.32349)));
        }
        else if (tickAnim >= 49 && tickAnim < 58) {
            xx = -3.09302 + (((tickAnim - 49) / 9) * (-2.99376-(-3.09302)));
            yy = 0.82892 + (((tickAnim - 49) / 9) * (-5.72443-(0.82892)));
            zz = 5.21528 + (((tickAnim - 49) / 9) * (12.10153-(5.21528)));
        }
        else if (tickAnim >= 58 && tickAnim < 67) {
            xx = -2.99376 + (((tickAnim - 58) / 9) * (-1.03234-(-2.99376)));
            yy = -5.72443 + (((tickAnim - 58) / 9) * (12.21989-(-5.72443)));
            zz = 12.10153 + (((tickAnim - 58) / 9) * (-7.12506-(12.10153)));
        }
        else if (tickAnim >= 67 && tickAnim < 75) {
            xx = -1.03234 + (((tickAnim - 67) / 8) * (-0.51185-(-1.03234)));
            yy = 12.21989 + (((tickAnim - 67) / 8) * (12.03395-(12.21989)));
            zz = -7.12506 + (((tickAnim - 67) / 8) * (-3.53319-(-7.12506)));
        }
        else if (tickAnim >= 75 && tickAnim < 80) {
            xx = -0.51185 + (((tickAnim - 75) / 5) * (0-(-0.51185)));
            yy = 12.03395 + (((tickAnim - 75) / 5) * (0-(12.03395)));
            zz = -3.53319 + (((tickAnim - 75) / 5) * (0-(-3.53319)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck2, neck2.rotateAngleX + (float) Math.toRadians(xx), neck2.rotateAngleY + (float) Math.toRadians(yy), neck2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 7) {
            xx = 0 + (((tickAnim - 0) / 7) * (-0.88249-(0)));
            yy = 0 + (((tickAnim - 0) / 7) * (-21.21751-(0)));
            zz = 0 + (((tickAnim - 0) / 7) * (3.53579-(0)));
        }
        else if (tickAnim >= 7 && tickAnim < 17) {
            xx = -0.88249 + (((tickAnim - 7) / 10) * (0.75266-(-0.88249)));
            yy = -21.21751 + (((tickAnim - 7) / 10) * (-4.37799-(-21.21751)));
            zz = 3.53579 + (((tickAnim - 7) / 10) * (-1.59374-(3.53579)));
        }
        else if (tickAnim >= 17 && tickAnim < 29) {
            xx = 0.75266 + (((tickAnim - 17) / 12) * (0.89302-(0.75266)));
            yy = -4.37799 + (((tickAnim - 17) / 12) * (-3.62456-(-4.37799)));
            zz = -1.59374 + (((tickAnim - 17) / 12) * (-6.53749-(-1.59374)));
        }
        else if (tickAnim >= 29 && tickAnim < 39) {
            xx = 0.89302 + (((tickAnim - 29) / 10) * (-14.55349-(0.89302)));
            yy = -3.62456 + (((tickAnim - 29) / 10) * (-1.81228-(-3.62456)));
            zz = -6.53749 + (((tickAnim - 29) / 10) * (-3.26875-(-6.53749)));
        }
        else if (tickAnim >= 39 && tickAnim < 49) {
            xx = -14.55349 + (((tickAnim - 39) / 10) * (-17.5-(-14.55349)));
            yy = -1.81228 + (((tickAnim - 39) / 10) * (0-(-1.81228)));
            zz = -3.26875 + (((tickAnim - 39) / 10) * (0-(-3.26875)));
        }
        else if (tickAnim >= 49 && tickAnim < 53) {
            xx = -17.5 + (((tickAnim - 49) / 4) * (-9.94166-(-17.5)));
            yy = 0 + (((tickAnim - 49) / 4) * (-7.74924-(0)));
            zz = 0 + (((tickAnim - 49) / 4) * (1.55832-(0)));
        }
        else if (tickAnim >= 53 && tickAnim < 60) {
            xx = -9.94166 + (((tickAnim - 53) / 7) * (0-(-9.94166)));
            yy = -7.74924 + (((tickAnim - 53) / 7) * (0-(-7.74924)));
            zz = 1.55832 + (((tickAnim - 53) / 7) * (0-(1.55832)));
        }
        else if (tickAnim >= 60 && tickAnim < 65) {
            xx = 0 + (((tickAnim - 60) / 5) * (0.48706-(0)));
            yy = 0 + (((tickAnim - 60) / 5) * (-2.77007-(0)));
            zz = 0 + (((tickAnim - 60) / 5) * (-7.1778-(0)));
        }
        else if (tickAnim >= 65 && tickAnim < 72) {
            xx = 0.48706 + (((tickAnim - 65) / 7) * (0.43632-(0.48706)));
            yy = -2.77007 + (((tickAnim - 65) / 7) * (-6.45968-(-2.77007)));
            zz = -7.1778 + (((tickAnim - 65) / 7) * (-13.39247-(-7.1778)));
        }
        else if (tickAnim >= 72 && tickAnim < 80) {
            xx = 0.43632 + (((tickAnim - 72) / 8) * (0-(0.43632)));
            yy = -6.45968 + (((tickAnim - 72) / 8) * (0-(-6.45968)));
            zz = -13.39247 + (((tickAnim - 72) / 8) * (0-(-13.39247)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck3, neck3.rotateAngleX + (float) Math.toRadians(xx), neck3.rotateAngleY + (float) Math.toRadians(yy), neck3.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 0) / 10) * (2.5-(0)));
            yy = 0 + (((tickAnim - 0) / 10) * (-5-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 17) {
            xx = 2.5 + (((tickAnim - 10) / 7) * (6.38889-(2.5)));
            yy = -5 + (((tickAnim - 10) / 7) * (-8.33333-(-5)));
            zz = 0 + (((tickAnim - 10) / 7) * (0-(0)));
        }
        else if (tickAnim >= 17 && tickAnim < 26) {
            xx = 6.38889 + (((tickAnim - 17) / 9) * (0-(6.38889)));
            yy = -8.33333 + (((tickAnim - 17) / 9) * (-12.5-(-8.33333)));
            zz = 0 + (((tickAnim - 17) / 9) * (0-(0)));
        }
        else if (tickAnim >= 26 && tickAnim < 30) {
            xx = 0 + (((tickAnim - 26) / 4) * (-9.93115-(0)));
            yy = -12.5 + (((tickAnim - 26) / 4) * (-12.68179-(-12.5)));
            zz = 0 + (((tickAnim - 26) / 4) * (12.40917-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 39) {
            xx = -9.93115 + (((tickAnim - 30) / 9) * (-0.41699-(-9.93115)));
            yy = -12.68179 + (((tickAnim - 30) / 9) * (-6.91734-(-12.68179)));
            zz = 12.40917 + (((tickAnim - 30) / 9) * (6.76864-(12.40917)));
        }
        else if (tickAnim >= 39 && tickAnim < 43) {
            xx = -0.41699 + (((tickAnim - 39) / 4) * (0.0428-(-0.41699)));
            yy = -6.91734 + (((tickAnim - 39) / 4) * (-0.6691-(-6.91734)));
            zz = 6.76864 + (((tickAnim - 39) / 4) * (-3.58282-(6.76864)));
        }
        else if (tickAnim >= 43 && tickAnim < 49) {
            xx = 0.0428 + (((tickAnim - 43) / 6) * (0-(0.0428)));
            yy = -0.6691 + (((tickAnim - 43) / 6) * (0-(-0.6691)));
            zz = -3.58282 + (((tickAnim - 43) / 6) * (0-(-3.58282)));
        }
        else if (tickAnim >= 49 && tickAnim < 56) {
            xx = 0 + (((tickAnim - 49) / 7) * (0-(0)));
            yy = 0 + (((tickAnim - 49) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 49) / 7) * (7.5-(0)));
        }
        else if (tickAnim >= 56 && tickAnim < 60) {
            xx = 0 + (((tickAnim - 56) / 4) * (-17.5-(0)));
            yy = 0 + (((tickAnim - 56) / 4) * (0-(0)));
            zz = 7.5 + (((tickAnim - 56) / 4) * (4.28571-(7.5)));
        }
        else if (tickAnim >= 60 && tickAnim < 63) {
            xx = -17.5 + (((tickAnim - 60) / 3) * (-1.25-(-17.5)));
            yy = 0 + (((tickAnim - 60) / 3) * (0-(0)));
            zz = 4.28571 + (((tickAnim - 60) / 3) * (2.14286-(4.28571)));
        }
        else if (tickAnim >= 63 && tickAnim < 67) {
            xx = -1.25 + (((tickAnim - 63) / 4) * (0-(-1.25)));
            yy = 0 + (((tickAnim - 63) / 4) * (0-(0)));
            zz = 2.14286 + (((tickAnim - 63) / 4) * (0-(2.14286)));
        }
        else if (tickAnim >= 67 && tickAnim < 72) {
            xx = 0 + (((tickAnim - 67) / 5) * (-10-(0)));
            yy = 0 + (((tickAnim - 67) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 67) / 5) * (0-(0)));
        }
        else if (tickAnim >= 72 && tickAnim < 75) {
            xx = -10 + (((tickAnim - 72) / 3) * (-6.5154-(-10)));
            yy = 0 + (((tickAnim - 72) / 3) * (-4.06352-(0)));
            zz = 0 + (((tickAnim - 72) / 3) * (14.45128-(0)));
        }
        else if (tickAnim >= 75 && tickAnim < 80) {
            xx = -6.5154 + (((tickAnim - 75) / 5) * (0-(-6.5154)));
            yy = -4.06352 + (((tickAnim - 75) / 5) * (0-(-4.06352)));
            zz = 14.45128 + (((tickAnim - 75) / 5) * (0-(14.45128)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck4, neck4.rotateAngleX + (float) Math.toRadians(xx), neck4.rotateAngleY + (float) Math.toRadians(yy), neck4.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 0) / 13) * (-4.8886-(0)));
            yy = 0 + (((tickAnim - 0) / 13) * (-1.74738-(0)));
            zz = 0 + (((tickAnim - 0) / 13) * (-7.29474-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 19) {
            xx = -4.8886 + (((tickAnim - 13) / 6) * (-4.63507-(-4.8886)));
            yy = -1.74738 + (((tickAnim - 13) / 6) * (10.60355-(-1.74738)));
            zz = -7.29474 + (((tickAnim - 13) / 6) * (-9.40548-(-7.29474)));
        }
        else if (tickAnim >= 19 && tickAnim < 30) {
            xx = -4.63507 + (((tickAnim - 19) / 11) * (6.24183-(-4.63507)));
            yy = 10.60355 + (((tickAnim - 19) / 11) * (8.59748-(10.60355)));
            zz = -9.40548 + (((tickAnim - 19) / 11) * (-7.62607-(-9.40548)));
        }
        else if (tickAnim >= 30 && tickAnim < 53) {
            xx = 6.24183 + (((tickAnim - 30) / 23) * (-6.46296-(6.24183)));
            yy = 8.59748 + (((tickAnim - 30) / 23) * (4.8719-(8.59748)));
            zz = -7.62607 + (((tickAnim - 30) / 23) * (-4.32144-(-7.62607)));
        }
        else if (tickAnim >= 53 && tickAnim < 57) {
            xx = -6.46296 + (((tickAnim - 53) / 4) * (-4.93108-(-6.46296)));
            yy = 4.8719 + (((tickAnim - 53) / 4) * (5.1917-(4.8719)));
            zz = -4.32144 + (((tickAnim - 53) / 4) * (1.31586-(-4.32144)));
        }
        else if (tickAnim >= 57 && tickAnim < 70) {
            xx = -4.93108 + (((tickAnim - 57) / 13) * (12.88668-(-4.93108)));
            yy = 5.1917 + (((tickAnim - 57) / 13) * (2.22501-(5.1917)));
            zz = 1.31586 + (((tickAnim - 57) / 13) * (0.56394-(1.31586)));
        }
        else if (tickAnim >= 70 && tickAnim < 80) {
            xx = 12.88668 + (((tickAnim - 70) / 10) * (0-(12.88668)));
            yy = 2.22501 + (((tickAnim - 70) / 10) * (0-(2.22501)));
            zz = 0.56394 + (((tickAnim - 70) / 10) * (0-(0.56394)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(head, head.rotateAngleX + (float) Math.toRadians(xx), head.rotateAngleY + (float) Math.toRadians(yy), head.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 50 && tickAnim < 57) {
            xx = 0 + (((tickAnim - 50) / 7) * (10-(0)));
            yy = 0 + (((tickAnim - 50) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 50) / 7) * (0-(0)));
        }
        else if (tickAnim >= 57 && tickAnim < 60) {
            xx = 10 + (((tickAnim - 57) / 3) * (7.5-(10)));
            yy = 0 + (((tickAnim - 57) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 57) / 3) * (0-(0)));
        }
        else if (tickAnim >= 60 && tickAnim < 65) {
            xx = 7.5 + (((tickAnim - 60) / 5) * (12.5-(7.5)));
            yy = 0 + (((tickAnim - 60) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 60) / 5) * (0-(0)));
        }
        else if (tickAnim >= 65 && tickAnim < 70) {
            xx = 12.5 + (((tickAnim - 65) / 5) * (0-(12.5)));
            yy = 0 + (((tickAnim - 65) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 65) / 5) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(jaw, jaw.rotateAngleX + (float) Math.toRadians(xx), jaw.rotateAngleY + (float) Math.toRadians(yy), jaw.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 28) {
            xx = 0 + (((tickAnim - 0) / 28) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 28) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 28) * (0-(0)));
        }
        else if (tickAnim >= 28 && tickAnim < 40) {
            xx = 0 + (((tickAnim - 28) / 12) * (-152.5-(0)));
            yy = 0 + (((tickAnim - 28) / 12) * (0-(0)));
            zz = 0 + (((tickAnim - 28) / 12) * (0-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 43) {
            xx = -152.5 + (((tickAnim - 40) / 3) * (-142.5-(-152.5)));
            yy = 0 + (((tickAnim - 40) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 40) / 3) * (0-(0)));
        }
        else if (tickAnim >= 43 && tickAnim < 47) {
            xx = -142.5 + (((tickAnim - 43) / 4) * (-152.5-(-142.5)));
            yy = 0 + (((tickAnim - 43) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 43) / 4) * (0-(0)));
        }
        else if (tickAnim >= 47 && tickAnim < 50) {
            xx = -152.5 + (((tickAnim - 47) / 3) * (-152.5-(-152.5)));
            yy = 0 + (((tickAnim - 47) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 47) / 3) * (0-(0)));
        }
        else if (tickAnim >= 50 && tickAnim < 53) {
            xx = -152.5 + (((tickAnim - 50) / 3) * (-142.5-(-152.5)));
            yy = 0 + (((tickAnim - 50) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 50) / 3) * (0-(0)));
        }
        else if (tickAnim >= 53 && tickAnim < 57) {
            xx = -142.5 + (((tickAnim - 53) / 4) * (-152.5-(-142.5)));
            yy = 0 + (((tickAnim - 53) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 53) / 4) * (0-(0)));
        }
        else if (tickAnim >= 57 && tickAnim < 60) {
            xx = -152.5 + (((tickAnim - 57) / 3) * (-142.5-(-152.5)));
            yy = 0 + (((tickAnim - 57) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 57) / 3) * (0-(0)));
        }
        else if (tickAnim >= 60 && tickAnim < 80) {
            xx = -142.5 + (((tickAnim - 60) / 20) * (0-(-142.5)));
            yy = 0 + (((tickAnim - 60) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 60) / 20) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftarm, leftarm.rotateAngleX + (float) Math.toRadians(xx), leftarm.rotateAngleY + (float) Math.toRadians(yy), leftarm.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 28) {
            xx = 0 + (((tickAnim - 0) / 28) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 28) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 28) * (0-(0)));
        }
        else if (tickAnim >= 28 && tickAnim < 34) {
            xx = 0 + (((tickAnim - 28) / 6) * (25-(0)));
            yy = 0 + (((tickAnim - 28) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 28) / 6) * (0-(0)));
        }
        else if (tickAnim >= 34 && tickAnim < 40) {
            xx = 25 + (((tickAnim - 34) / 6) * (-20-(25)));
            yy = 0 + (((tickAnim - 34) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 34) / 6) * (0-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 43) {
            xx = -20 + (((tickAnim - 40) / 3) * (-10-(-20)));
            yy = 0 + (((tickAnim - 40) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 40) / 3) * (0-(0)));
        }
        else if (tickAnim >= 43 && tickAnim < 47) {
            xx = -10 + (((tickAnim - 43) / 4) * (-20-(-10)));
            yy = 0 + (((tickAnim - 43) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 43) / 4) * (0-(0)));
        }
        else if (tickAnim >= 47 && tickAnim < 50) {
            xx = -20 + (((tickAnim - 47) / 3) * (-20-(-20)));
            yy = 0 + (((tickAnim - 47) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 47) / 3) * (0-(0)));
        }
        else if (tickAnim >= 50 && tickAnim < 53) {
            xx = -20 + (((tickAnim - 50) / 3) * (-10-(-20)));
            yy = 0 + (((tickAnim - 50) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 50) / 3) * (0-(0)));
        }
        else if (tickAnim >= 53 && tickAnim < 57) {
            xx = -10 + (((tickAnim - 53) / 4) * (-20-(-10)));
            yy = 0 + (((tickAnim - 53) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 53) / 4) * (0-(0)));
        }
        else if (tickAnim >= 57 && tickAnim < 60) {
            xx = -20 + (((tickAnim - 57) / 3) * (-10-(-20)));
            yy = 0 + (((tickAnim - 57) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 57) / 3) * (0-(0)));
        }
        else if (tickAnim >= 60 && tickAnim < 80) {
            xx = -10 + (((tickAnim - 60) / 20) * (0-(-10)));
            yy = 0 + (((tickAnim - 60) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 60) / 20) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftarm2, leftarm2.rotateAngleX + (float) Math.toRadians(xx), leftarm2.rotateAngleY + (float) Math.toRadians(yy), leftarm2.rotateAngleZ + (float) Math.toRadians(zz));

    }

    public void animScratchRight(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime, double animTick) {
        EntityPrehistoricFloraSinraptor entity = (EntityPrehistoricFloraSinraptor) entitylivingbaseIn;

        int animCycle = 80;
        double tickAnim = animTick + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;


        if (tickAnim >= 0 && tickAnim < 6) {
            xx = 0 + (((tickAnim - 0) / 6) * (-1.56-(0)));
            yy = 0 + (((tickAnim - 0) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 6) * (0-(0)));
        }
        else if (tickAnim >= 6 && tickAnim < 13) {
            xx = -1.56 + (((tickAnim - 6) / 7) * (2.5-(-1.56)));
            yy = 0 + (((tickAnim - 6) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 6) / 7) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 23) {
            xx = 2.5 + (((tickAnim - 13) / 10) * (2.19119-(2.5)));
            yy = 0 + (((tickAnim - 13) / 10) * (0.16966-(0)));
            zz = 0 + (((tickAnim - 13) / 10) * (2.49424-(0)));
        }
        else if (tickAnim >= 23 && tickAnim < 33) {
            xx = 2.19119 + (((tickAnim - 23) / 10) * (1.81349-(2.19119)));
            yy = 0.16966 + (((tickAnim - 23) / 10) * (-0.0454-(0.16966)));
            zz = 2.49424 + (((tickAnim - 23) / 10) * (-0.42642-(2.49424)));
        }
        else if (tickAnim >= 33 && tickAnim < 43) {
            xx = 1.81349 + (((tickAnim - 33) / 10) * (-3.62425-(1.81349)));
            yy = -0.0454 + (((tickAnim - 33) / 10) * (-0.03444-(-0.0454)));
            zz = -0.42642 + (((tickAnim - 33) / 10) * (-0.32349-(-0.42642)));
        }
        else if (tickAnim >= 43 && tickAnim < 49) {
            xx = -3.62425 + (((tickAnim - 43) / 6) * (-3.09302-(-3.62425)));
            yy = -0.03444 + (((tickAnim - 43) / 6) * (-0.82892-(-0.03444)));
            zz = -0.32349 + (((tickAnim - 43) / 6) * (-5.21528-(-0.32349)));
        }
        else if (tickAnim >= 49 && tickAnim < 58) {
            xx = -3.09302 + (((tickAnim - 49) / 9) * (-2.99376-(-3.09302)));
            yy = -0.82892 + (((tickAnim - 49) / 9) * (5.72443-(-0.82892)));
            zz = -5.21528 + (((tickAnim - 49) / 9) * (-12.10153-(-5.21528)));
        }
        else if (tickAnim >= 58 && tickAnim < 67) {
            xx = -2.99376 + (((tickAnim - 58) / 9) * (-1.03234-(-2.99376)));
            yy = 5.72443 + (((tickAnim - 58) / 9) * (-12.21989-(5.72443)));
            zz = -12.10153 + (((tickAnim - 58) / 9) * (7.12506-(-12.10153)));
        }
        else if (tickAnim >= 67 && tickAnim < 75) {
            xx = -1.03234 + (((tickAnim - 67) / 8) * (-0.51185-(-1.03234)));
            yy = -12.21989 + (((tickAnim - 67) / 8) * (-12.03395-(-12.21989)));
            zz = 7.12506 + (((tickAnim - 67) / 8) * (3.53319-(7.12506)));
        }
        else if (tickAnim >= 75 && tickAnim < 80) {
            xx = -0.51185 + (((tickAnim - 75) / 5) * (0-(-0.51185)));
            yy = -12.03395 + (((tickAnim - 75) / 5) * (0-(-12.03395)));
            zz = 3.53319 + (((tickAnim - 75) / 5) * (0-(3.53319)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck2, neck2.rotateAngleX + (float) Math.toRadians(xx), neck2.rotateAngleY + (float) Math.toRadians(yy), neck2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 7) {
            xx = 0 + (((tickAnim - 0) / 7) * (-0.88249-(0)));
            yy = 0 + (((tickAnim - 0) / 7) * (21.21751-(0)));
            zz = 0 + (((tickAnim - 0) / 7) * (-3.53579-(0)));
        }
        else if (tickAnim >= 7 && tickAnim < 17) {
            xx = -0.88249 + (((tickAnim - 7) / 10) * (0.75266-(-0.88249)));
            yy = 21.21751 + (((tickAnim - 7) / 10) * (4.37799-(21.21751)));
            zz = -3.53579 + (((tickAnim - 7) / 10) * (1.59374-(-3.53579)));
        }
        else if (tickAnim >= 17 && tickAnim < 29) {
            xx = 0.75266 + (((tickAnim - 17) / 12) * (0.89302-(0.75266)));
            yy = 4.37799 + (((tickAnim - 17) / 12) * (3.62456-(4.37799)));
            zz = 1.59374 + (((tickAnim - 17) / 12) * (6.53749-(1.59374)));
        }
        else if (tickAnim >= 29 && tickAnim < 39) {
            xx = 0.89302 + (((tickAnim - 29) / 10) * (-14.55349-(0.89302)));
            yy = 3.62456 + (((tickAnim - 29) / 10) * (1.81228-(3.62456)));
            zz = 6.53749 + (((tickAnim - 29) / 10) * (3.26875-(6.53749)));
        }
        else if (tickAnim >= 39 && tickAnim < 49) {
            xx = -14.55349 + (((tickAnim - 39) / 10) * (-17.5-(-14.55349)));
            yy = 1.81228 + (((tickAnim - 39) / 10) * (0-(1.81228)));
            zz = 3.26875 + (((tickAnim - 39) / 10) * (0-(3.26875)));
        }
        else if (tickAnim >= 49 && tickAnim < 53) {
            xx = -17.5 + (((tickAnim - 49) / 4) * (-9.94166-(-17.5)));
            yy = 0 + (((tickAnim - 49) / 4) * (7.74924-(0)));
            zz = 0 + (((tickAnim - 49) / 4) * (-1.55832-(0)));
        }
        else if (tickAnim >= 53 && tickAnim < 60) {
            xx = -9.94166 + (((tickAnim - 53) / 7) * (0-(-9.94166)));
            yy = 7.74924 + (((tickAnim - 53) / 7) * (0-(7.74924)));
            zz = -1.55832 + (((tickAnim - 53) / 7) * (0-(-1.55832)));
        }
        else if (tickAnim >= 60 && tickAnim < 65) {
            xx = 0 + (((tickAnim - 60) / 5) * (0.48706-(0)));
            yy = 0 + (((tickAnim - 60) / 5) * (2.77007-(0)));
            zz = 0 + (((tickAnim - 60) / 5) * (7.1778-(0)));
        }
        else if (tickAnim >= 65 && tickAnim < 72) {
            xx = 0.48706 + (((tickAnim - 65) / 7) * (0.43632-(0.48706)));
            yy = 2.77007 + (((tickAnim - 65) / 7) * (6.45968-(2.77007)));
            zz = 7.1778 + (((tickAnim - 65) / 7) * (13.39247-(7.1778)));
        }
        else if (tickAnim >= 72 && tickAnim < 80) {
            xx = 0.43632 + (((tickAnim - 72) / 8) * (0-(0.43632)));
            yy = 6.45968 + (((tickAnim - 72) / 8) * (0-(6.45968)));
            zz = 13.39247 + (((tickAnim - 72) / 8) * (0-(13.39247)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck3, neck3.rotateAngleX + (float) Math.toRadians(xx), neck3.rotateAngleY + (float) Math.toRadians(yy), neck3.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 0) / 10) * (2.5-(0)));
            yy = 0 + (((tickAnim - 0) / 10) * (5-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 17) {
            xx = 2.5 + (((tickAnim - 10) / 7) * (6.38889-(2.5)));
            yy = 5 + (((tickAnim - 10) / 7) * (8.33333-(5)));
            zz = 0 + (((tickAnim - 10) / 7) * (0-(0)));
        }
        else if (tickAnim >= 17 && tickAnim < 26) {
            xx = 6.38889 + (((tickAnim - 17) / 9) * (0-(6.38889)));
            yy = 8.33333 + (((tickAnim - 17) / 9) * (12.5-(8.33333)));
            zz = 0 + (((tickAnim - 17) / 9) * (0-(0)));
        }
        else if (tickAnim >= 26 && tickAnim < 30) {
            xx = 0 + (((tickAnim - 26) / 4) * (-9.93115-(0)));
            yy = 12.5 + (((tickAnim - 26) / 4) * (12.68179-(12.5)));
            zz = 0 + (((tickAnim - 26) / 4) * (-12.40917-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 39) {
            xx = -9.93115 + (((tickAnim - 30) / 9) * (-0.41699-(-9.93115)));
            yy = 12.68179 + (((tickAnim - 30) / 9) * (6.91734-(12.68179)));
            zz = -12.40917 + (((tickAnim - 30) / 9) * (-6.76864-(-12.40917)));
        }
        else if (tickAnim >= 39 && tickAnim < 43) {
            xx = -0.41699 + (((tickAnim - 39) / 4) * (0.0428-(-0.41699)));
            yy = 6.91734 + (((tickAnim - 39) / 4) * (0.6691-(6.91734)));
            zz = -6.76864 + (((tickAnim - 39) / 4) * (3.58282-(-6.76864)));
        }
        else if (tickAnim >= 43 && tickAnim < 49) {
            xx = 0.0428 + (((tickAnim - 43) / 6) * (0-(0.0428)));
            yy = 0.6691 + (((tickAnim - 43) / 6) * (0-(0.6691)));
            zz = 3.58282 + (((tickAnim - 43) / 6) * (0-(3.58282)));
        }
        else if (tickAnim >= 49 && tickAnim < 56) {
            xx = 0 + (((tickAnim - 49) / 7) * (0-(0)));
            yy = 0 + (((tickAnim - 49) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 49) / 7) * (-7.5-(0)));
        }
        else if (tickAnim >= 56 && tickAnim < 60) {
            xx = 0 + (((tickAnim - 56) / 4) * (-17.5-(0)));
            yy = 0 + (((tickAnim - 56) / 4) * (0-(0)));
            zz = -7.5 + (((tickAnim - 56) / 4) * (-4.28571-(-7.5)));
        }
        else if (tickAnim >= 60 && tickAnim < 63) {
            xx = -17.5 + (((tickAnim - 60) / 3) * (-1.25-(-17.5)));
            yy = 0 + (((tickAnim - 60) / 3) * (0-(0)));
            zz = -4.28571 + (((tickAnim - 60) / 3) * (-2.14286-(-4.28571)));
        }
        else if (tickAnim >= 63 && tickAnim < 67) {
            xx = -1.25 + (((tickAnim - 63) / 4) * (0-(-1.25)));
            yy = 0 + (((tickAnim - 63) / 4) * (0-(0)));
            zz = -2.14286 + (((tickAnim - 63) / 4) * (0-(-2.14286)));
        }
        else if (tickAnim >= 67 && tickAnim < 72) {
            xx = 0 + (((tickAnim - 67) / 5) * (-10-(0)));
            yy = 0 + (((tickAnim - 67) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 67) / 5) * (0-(0)));
        }
        else if (tickAnim >= 72 && tickAnim < 75) {
            xx = -10 + (((tickAnim - 72) / 3) * (-6.5154-(-10)));
            yy = 0 + (((tickAnim - 72) / 3) * (4.06352-(0)));
            zz = 0 + (((tickAnim - 72) / 3) * (-14.45128-(0)));
        }
        else if (tickAnim >= 75 && tickAnim < 80) {
            xx = -6.5154 + (((tickAnim - 75) / 5) * (0-(-6.5154)));
            yy = 4.06352 + (((tickAnim - 75) / 5) * (0-(4.06352)));
            zz = -14.45128 + (((tickAnim - 75) / 5) * (0-(-14.45128)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck4, neck4.rotateAngleX + (float) Math.toRadians(xx), neck4.rotateAngleY + (float) Math.toRadians(yy), neck4.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 0) / 13) * (-4.8886-(0)));
            yy = 0 + (((tickAnim - 0) / 13) * (1.74738-(0)));
            zz = 0 + (((tickAnim - 0) / 13) * (7.29474-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 19) {
            xx = -4.8886 + (((tickAnim - 13) / 6) * (-4.63507-(-4.8886)));
            yy = 1.74738 + (((tickAnim - 13) / 6) * (-10.60355-(1.74738)));
            zz = 7.29474 + (((tickAnim - 13) / 6) * (9.40548-(7.29474)));
        }
        else if (tickAnim >= 19 && tickAnim < 30) {
            xx = -4.63507 + (((tickAnim - 19) / 11) * (6.24183-(-4.63507)));
            yy = -10.60355 + (((tickAnim - 19) / 11) * (-8.59748-(-10.60355)));
            zz = 9.40548 + (((tickAnim - 19) / 11) * (7.62607-(9.40548)));
        }
        else if (tickAnim >= 30 && tickAnim < 53) {
            xx = 6.24183 + (((tickAnim - 30) / 23) * (-6.46296-(6.24183)));
            yy = -8.59748 + (((tickAnim - 30) / 23) * (-4.8719-(-8.59748)));
            zz = 7.62607 + (((tickAnim - 30) / 23) * (4.32144-(7.62607)));
        }
        else if (tickAnim >= 53 && tickAnim < 57) {
            xx = -6.46296 + (((tickAnim - 53) / 4) * (-4.93108-(-6.46296)));
            yy = -4.8719 + (((tickAnim - 53) / 4) * (-5.1917-(-4.8719)));
            zz = 4.32144 + (((tickAnim - 53) / 4) * (-1.31586-(4.32144)));
        }
        else if (tickAnim >= 57 && tickAnim < 70) {
            xx = -4.93108 + (((tickAnim - 57) / 13) * (12.88668-(-4.93108)));
            yy = -5.1917 + (((tickAnim - 57) / 13) * (-2.22501-(-5.1917)));
            zz = -1.31586 + (((tickAnim - 57) / 13) * (-0.56394-(-1.31586)));
        }
        else if (tickAnim >= 70 && tickAnim < 80) {
            xx = 12.88668 + (((tickAnim - 70) / 10) * (0-(12.88668)));
            yy = -2.22501 + (((tickAnim - 70) / 10) * (0-(-2.22501)));
            zz = -0.56394 + (((tickAnim - 70) / 10) * (0-(-0.56394)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(head, head.rotateAngleX + (float) Math.toRadians(xx), head.rotateAngleY + (float) Math.toRadians(yy), head.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 50 && tickAnim < 57) {
            xx = 0 + (((tickAnim - 50) / 7) * (10-(0)));
            yy = 0 + (((tickAnim - 50) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 50) / 7) * (0-(0)));
        }
        else if (tickAnim >= 57 && tickAnim < 60) {
            xx = 10 + (((tickAnim - 57) / 3) * (7.5-(10)));
            yy = 0 + (((tickAnim - 57) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 57) / 3) * (0-(0)));
        }
        else if (tickAnim >= 60 && tickAnim < 65) {
            xx = 7.5 + (((tickAnim - 60) / 5) * (12.5-(7.5)));
            yy = 0 + (((tickAnim - 60) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 60) / 5) * (0-(0)));
        }
        else if (tickAnim >= 65 && tickAnim < 70) {
            xx = 12.5 + (((tickAnim - 65) / 5) * (0-(12.5)));
            yy = 0 + (((tickAnim - 65) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 65) / 5) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(jaw, jaw.rotateAngleX + (float) Math.toRadians(xx), jaw.rotateAngleY + (float) Math.toRadians(yy), jaw.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 28) {
            xx = 0 + (((tickAnim - 0) / 28) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 28) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 28) * (0-(0)));
        }
        else if (tickAnim >= 28 && tickAnim < 40) {
            xx = 0 + (((tickAnim - 28) / 12) * (-152.5-(0)));
            yy = 0 + (((tickAnim - 28) / 12) * (0-(0)));
            zz = 0 + (((tickAnim - 28) / 12) * (0-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 43) {
            xx = -152.5 + (((tickAnim - 40) / 3) * (-142.5-(-152.5)));
            yy = 0 + (((tickAnim - 40) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 40) / 3) * (0-(0)));
        }
        else if (tickAnim >= 43 && tickAnim < 47) {
            xx = -142.5 + (((tickAnim - 43) / 4) * (-152.5-(-142.5)));
            yy = 0 + (((tickAnim - 43) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 43) / 4) * (0-(0)));
        }
        else if (tickAnim >= 47 && tickAnim < 50) {
            xx = -152.5 + (((tickAnim - 47) / 3) * (-152.5-(-152.5)));
            yy = 0 + (((tickAnim - 47) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 47) / 3) * (0-(0)));
        }
        else if (tickAnim >= 50 && tickAnim < 53) {
            xx = -152.5 + (((tickAnim - 50) / 3) * (-142.5-(-152.5)));
            yy = 0 + (((tickAnim - 50) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 50) / 3) * (0-(0)));
        }
        else if (tickAnim >= 53 && tickAnim < 57) {
            xx = -142.5 + (((tickAnim - 53) / 4) * (-152.5-(-142.5)));
            yy = 0 + (((tickAnim - 53) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 53) / 4) * (0-(0)));
        }
        else if (tickAnim >= 57 && tickAnim < 60) {
            xx = -152.5 + (((tickAnim - 57) / 3) * (-142.5-(-152.5)));
            yy = 0 + (((tickAnim - 57) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 57) / 3) * (0-(0)));
        }
        else if (tickAnim >= 60 && tickAnim < 80) {
            xx = -142.5 + (((tickAnim - 60) / 20) * (0-(-142.5)));
            yy = 0 + (((tickAnim - 60) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 60) / 20) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightarm, rightarm.rotateAngleX + (float) Math.toRadians(xx), rightarm.rotateAngleY + (float) Math.toRadians(yy), rightarm.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 28) {
            xx = 0 + (((tickAnim - 0) / 28) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 28) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 28) * (0-(0)));
        }
        else if (tickAnim >= 28 && tickAnim < 34) {
            xx = 0 + (((tickAnim - 28) / 6) * (25-(0)));
            yy = 0 + (((tickAnim - 28) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 28) / 6) * (0-(0)));
        }
        else if (tickAnim >= 34 && tickAnim < 40) {
            xx = 25 + (((tickAnim - 34) / 6) * (-20-(25)));
            yy = 0 + (((tickAnim - 34) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 34) / 6) * (0-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 43) {
            xx = -20 + (((tickAnim - 40) / 3) * (-10-(-20)));
            yy = 0 + (((tickAnim - 40) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 40) / 3) * (0-(0)));
        }
        else if (tickAnim >= 43 && tickAnim < 47) {
            xx = -10 + (((tickAnim - 43) / 4) * (-20-(-10)));
            yy = 0 + (((tickAnim - 43) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 43) / 4) * (0-(0)));
        }
        else if (tickAnim >= 47 && tickAnim < 50) {
            xx = -20 + (((tickAnim - 47) / 3) * (-20-(-20)));
            yy = 0 + (((tickAnim - 47) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 47) / 3) * (0-(0)));
        }
        else if (tickAnim >= 50 && tickAnim < 53) {
            xx = -20 + (((tickAnim - 50) / 3) * (-10-(-20)));
            yy = 0 + (((tickAnim - 50) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 50) / 3) * (0-(0)));
        }
        else if (tickAnim >= 53 && tickAnim < 57) {
            xx = -10 + (((tickAnim - 53) / 4) * (-20-(-10)));
            yy = 0 + (((tickAnim - 53) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 53) / 4) * (0-(0)));
        }
        else if (tickAnim >= 57 && tickAnim < 60) {
            xx = -20 + (((tickAnim - 57) / 3) * (-10-(-20)));
            yy = 0 + (((tickAnim - 57) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 57) / 3) * (0-(0)));
        }
        else if (tickAnim >= 60 && tickAnim < 80) {
            xx = -10 + (((tickAnim - 60) / 20) * (0-(-10)));
            yy = 0 + (((tickAnim - 60) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 60) / 20) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightarm2, rightarm2.rotateAngleX + (float) Math.toRadians(xx), rightarm2.rotateAngleY + (float) Math.toRadians(yy), rightarm2.rotateAngleZ + (float) Math.toRadians(zz));

    }

    public void animNest(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime, double animTick) {
        EntityPrehistoricFloraSinraptor entity = (EntityPrehistoricFloraSinraptor) entitylivingbaseIn;

        int animCycle = 50;
        double tickAnim = animTick + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;


        if (tickAnim >= 0 && tickAnim < 10) {
            xx = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.5))*-5 + (((tickAnim - 0) / 10) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1))*10-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.5))*-5)));
            yy = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 20) {
            xx = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1))*10 + (((tickAnim - 10) / 10) * (-5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720/1.5))*2-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1))*10)));
            yy = 0 + (((tickAnim - 10) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 10) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 50) {
            xx = -5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720/1.5))*2 + (((tickAnim - 20) / 30) * (0-(-5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720/1.5))*2)));
            yy = 0 + (((tickAnim - 20) / 30) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 30) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(hips, hips.rotateAngleX + (float) Math.toRadians(xx), hips.rotateAngleY + (float) Math.toRadians(yy), hips.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            yy = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.5))*0.5 + (((tickAnim - 0) / 10) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1))*-1-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.5))*0.5)));
            zz = 0 + (((tickAnim - 0) / 10) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 10) / 10) * (0-(0)));
            yy = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1))*-1 + (((tickAnim - 10) / 10) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/2.5))*0.5-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1))*-1)));
            zz = 0 + (((tickAnim - 10) / 10) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 20) / 30) * (0-(0)));
            yy = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/2.5))*0.5 + (((tickAnim - 20) / 30) * (0-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/2.5))*0.5)));
            zz = 0 + (((tickAnim - 20) / 30) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.hips.rotationPointX = this.hips.rotationPointX + (float)(xx);
        this.hips.rotationPointY = this.hips.rotationPointY - (float)(yy);
        this.hips.rotationPointZ = this.hips.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 10) {
            xx = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.5))*5 + (((tickAnim - 0) / 10) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1-30))*-3-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.5))*5)));
            yy = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 20) {
            xx = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1-30))*-3 + (((tickAnim - 10) / 10) * (3+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720/1.5-30))*-1-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1-30))*-3)));
            yy = 0 + (((tickAnim - 10) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 10) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 50) {
            xx = 3+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720/1.5-30))*-1 + (((tickAnim - 20) / 30) * (0-(3+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720/1.5-30))*-1)));
            yy = 0 + (((tickAnim - 20) / 30) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 30) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tail2, tail2.rotateAngleX + (float) Math.toRadians(xx), tail2.rotateAngleY + (float) Math.toRadians(yy), tail2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 10) {
            xx = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.5))*5 + (((tickAnim - 0) / 10) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1-60))*-3-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.5))*5)));
            yy = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 20) {
            xx = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1-60))*-3 + (((tickAnim - 10) / 10) * (3+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720/1.5-60))*-1-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1-60))*-3)));
            yy = 0 + (((tickAnim - 10) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 10) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 50) {
            xx = 3+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720/1.5-60))*-1 + (((tickAnim - 20) / 30) * (0-(3+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720/1.5-60))*-1)));
            yy = 0 + (((tickAnim - 20) / 30) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 30) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tail3, tail3.rotateAngleX + (float) Math.toRadians(xx), tail3.rotateAngleY + (float) Math.toRadians(yy), tail3.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 10) {
            xx = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.5))*5 + (((tickAnim - 0) / 10) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1-90))*-3-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.5))*5)));
            yy = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 20) {
            xx = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1-90))*-3 + (((tickAnim - 10) / 10) * (3+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720/1.5-90))*-1-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1-90))*-3)));
            yy = 0 + (((tickAnim - 10) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 10) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 50) {
            xx = 3+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720/1.5-90))*-1 + (((tickAnim - 20) / 30) * (0-(3+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720/1.5-90))*-1)));
            yy = 0 + (((tickAnim - 20) / 30) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 30) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tail4, tail4.rotateAngleX + (float) Math.toRadians(xx), tail4.rotateAngleY + (float) Math.toRadians(yy), tail4.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 10) {
            xx = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.5))*5 + (((tickAnim - 0) / 10) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1-120))*-3-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.5))*5)));
            yy = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 20) {
            xx = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1-120))*-3 + (((tickAnim - 10) / 10) * (3+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720/1.5-120))*-1-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1-120))*-3)));
            yy = 0 + (((tickAnim - 10) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 10) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 50) {
            xx = 3+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720/1.5-120))*-1 + (((tickAnim - 20) / 30) * (0-(3+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720/1.5-120))*-1)));
            yy = 0 + (((tickAnim - 20) / 30) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 30) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tail5, tail5.rotateAngleX + (float) Math.toRadians(xx), tail5.rotateAngleY + (float) Math.toRadians(yy), tail5.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 10) {
            xx = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.5))*5 + (((tickAnim - 0) / 10) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1-150))*-3-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.5))*5)));
            yy = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 20) {
            xx = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1-150))*-3 + (((tickAnim - 10) / 10) * (3+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720/1.5-150))*-1-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1-150))*-3)));
            yy = 0 + (((tickAnim - 10) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 10) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 50) {
            xx = 3+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720/1.5-150))*-1 + (((tickAnim - 20) / 30) * (0-(3+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720/1.5-150))*-1)));
            yy = 0 + (((tickAnim - 20) / 30) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 30) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tail6, tail6.rotateAngleX + (float) Math.toRadians(xx), tail6.rotateAngleY + (float) Math.toRadians(yy), tail6.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 10) {
            xx = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.5))*-5 + (((tickAnim - 0) / 10) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1-30))*10-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.5))*-5)));
            yy = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            zz = -(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.5))*5) + (((tickAnim - 0) / 10) * (-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/1-30))*-5))-(-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.5))*5)));
        }
        else if (tickAnim >= 10 && tickAnim < 20) {
            xx = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1-30))*10 + (((tickAnim - 10) / 10) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*720/1.5-30))*1-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1-30))*10)));
            yy = 0 + (((tickAnim - 10) / 10) * (0-(0)));
            zz = -(Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/1-30))*-5) + (((tickAnim - 10) / 10) * (-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/1-30))*5))-(-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/1-30))*-5)));
        }
        else if (tickAnim >= 20 && tickAnim < 50) {
            xx = Math.sin((Math.PI/180)*(((double)tickAnim/20)*720/1.5-30))*1 + (((tickAnim - 20) / 30) * (0-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*720/1.5-30))*1)));
            yy = 0 + (((tickAnim - 20) / 30) * (0-(0)));
            zz = -(Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/1-30))*5) + (((tickAnim - 20) / 30) * (0-(-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/1-30))*5))));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(body, body.rotateAngleX + (float) Math.toRadians(xx), body.rotateAngleY + (float) Math.toRadians(yy), body.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 10) {
            xx = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.5))*-5 + (((tickAnim - 0) / 10) * (-10+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1-60))*10-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.5))*-5)));
            yy = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            zz = -(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.5))*5) + (((tickAnim - 0) / 10) * (-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/1-60))*-10))-(-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.5))*5)));
        }
        else if (tickAnim >= 10 && tickAnim < 20) {
            xx = -10+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1-60))*10 + (((tickAnim - 10) / 10) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/2.5-30))*-5-(-10+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1-60))*10)));
            yy = 0 + (((tickAnim - 10) / 10) * (0-(0)));
            zz = -(Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/1-60))*-10) + (((tickAnim - 10) / 10) * (-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/1-30))*5))-(-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/1-60))*-10)));
        }
        else if (tickAnim >= 20 && tickAnim < 50) {
            xx = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/2.5-30))*-5 + (((tickAnim - 20) / 30) * (0-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/2.5-30))*-5)));
            yy = 0 + (((tickAnim - 20) / 30) * (0-(0)));
            zz = -(Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/1-30))*5) + (((tickAnim - 20) / 30) * (0-(-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/1-30))*5))));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(body2, body2.rotateAngleX + (float) Math.toRadians(xx), body2.rotateAngleY + (float) Math.toRadians(yy), body2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 10) {
            xx = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.5))*-5 + (((tickAnim - 0) / 10) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1))*15-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.5))*-5)));
            yy = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            zz = -(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.5))*-3) + (((tickAnim - 0) / 10) * (-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/1+60))*3))-(-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.5))*-3)));
        }
        else if (tickAnim >= 10 && tickAnim < 20) {
            xx = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1))*15 + (((tickAnim - 10) / 10) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/2.5+30))*-5-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1))*15)));
            yy = 0 + (((tickAnim - 10) / 10) * (0-(0)));
            zz = -(Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/1+60))*3) + (((tickAnim - 10) / 10) * (-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/1+30))*-3))-(-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/1+60))*3)));
        }
        else if (tickAnim >= 20 && tickAnim < 50) {
            xx = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/2.5+30))*-5 + (((tickAnim - 20) / 30) * (0-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/2.5+30))*-5)));
            yy = 0 + (((tickAnim - 20) / 30) * (0-(0)));
            zz = -(Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/1+30))*-3) + (((tickAnim - 20) / 30) * (0-(-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/1+30))*-3))));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck2, neck2.rotateAngleX + (float) Math.toRadians(xx), neck2.rotateAngleY + (float) Math.toRadians(yy), neck2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 10) {
            xx = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.5))*-5 + (((tickAnim - 0) / 10) * (-22.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1+60))*15-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.5))*-5)));
            yy = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            zz = -(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.5))*-3) + (((tickAnim - 0) / 10) * (0-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1+60))*-3))-(-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.5))*-3)));
        }
        else if (tickAnim >= 10 && tickAnim < 20) {
            xx = -22.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1+60))*15 + (((tickAnim - 10) / 10) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/2.5))*-5-(-22.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1+60))*15)));
            yy = 0 + (((tickAnim - 10) / 10) * (0-(0)));
            zz = 0-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1+60))*-3) + (((tickAnim - 10) / 10) * (-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/1))*-3))-(0-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1+60))*-3)));
        }
        else if (tickAnim >= 20 && tickAnim < 50) {
            xx = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/2.5))*-5 + (((tickAnim - 20) / 30) * (0-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/2.5))*-5)));
            yy = 0 + (((tickAnim - 20) / 30) * (0-(0)));
            zz = -(Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/1))*-3) + (((tickAnim - 20) / 30) * (0-(-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/1))*-3))));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck3, neck3.rotateAngleX + (float) Math.toRadians(xx), neck3.rotateAngleY + (float) Math.toRadians(yy), neck3.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 10) {
            xx = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.5))*-5 + (((tickAnim - 0) / 10) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1+30))*10-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.5))*-5)));
            yy = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 20) {
            xx = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1+30))*10 + (((tickAnim - 10) / 10) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/2.5-30))*-5-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1+30))*10)));
            yy = 0 + (((tickAnim - 10) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 10) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 50) {
            xx = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/2.5-30))*-5 + (((tickAnim - 20) / 30) * (0-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/2.5-30))*-5)));
            yy = 0 + (((tickAnim - 20) / 30) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 30) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck4, neck4.rotateAngleX + (float) Math.toRadians(xx), neck4.rotateAngleY + (float) Math.toRadians(yy), neck4.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 10) {
            xx = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.5))*-5 + (((tickAnim - 0) / 10) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1+60))*10-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.5))*-5)));
            yy = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 20) {
            xx = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1+60))*10 + (((tickAnim - 10) / 10) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/2.5-60))*-5-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1+60))*10)));
            yy = 0 + (((tickAnim - 10) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 10) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 50) {
            xx = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/2.5-60))*-5 + (((tickAnim - 20) / 30) * (0-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/2.5-60))*-5)));
            yy = 0 + (((tickAnim - 20) / 30) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 30) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(head, head.rotateAngleX + (float) Math.toRadians(xx), head.rotateAngleY + (float) Math.toRadians(yy), head.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 10) {
            xx = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.5))*5 + (((tickAnim - 0) / 10) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1))*-5-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.5))*5)));
            yy = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 20) {
            xx = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1))*-5 + (((tickAnim - 10) / 10) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*720/1.5-60))*20-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1))*-5)));
            yy = 0 + (((tickAnim - 10) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 10) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 50) {
            xx = Math.sin((Math.PI/180)*(((double)tickAnim/20)*720/1.5-60))*20 + (((tickAnim - 20) / 30) * (0-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*720/1.5-60))*20)));
            yy = 0 + (((tickAnim - 20) / 30) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 30) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftLeg2, leftLeg2.rotateAngleX + (float) Math.toRadians(xx), leftLeg2.rotateAngleY + (float) Math.toRadians(yy), leftLeg2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 10) {
            xx = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.5))*5 + (((tickAnim - 0) / 10) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1))*-5-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.5))*5)));
            yy = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 20) {
            xx = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1))*-5 + (((tickAnim - 10) / 10) * (10+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720/1.5))*10-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1))*-5)));
            yy = 0 + (((tickAnim - 10) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 10) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 50) {
            xx = 10+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720/1.5))*10 + (((tickAnim - 20) / 30) * (0-(10+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720/1.5))*10)));
            yy = 0 + (((tickAnim - 20) / 30) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 30) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftLeg3, leftLeg3.rotateAngleX + (float) Math.toRadians(xx), leftLeg3.rotateAngleY + (float) Math.toRadians(yy), leftLeg3.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 10) {
            xx = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.5))*5 + (((tickAnim - 0) / 10) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1))*-5-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.5))*5)));
            yy = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 20) {
            xx = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1))*-5 + (((tickAnim - 10) / 10) * (40+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720/1.5+60))*30-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1))*-5)));
            yy = 0 + (((tickAnim - 10) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 10) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 50) {
            xx = 40+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720/1.5+60))*30 + (((tickAnim - 20) / 30) * (0-(40+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720/1.5+60))*30)));
            yy = 0 + (((tickAnim - 20) / 30) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 30) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftLeg4, leftLeg4.rotateAngleX + (float) Math.toRadians(xx), leftLeg4.rotateAngleY + (float) Math.toRadians(yy), leftLeg4.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 10) {
            xx = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.5))*5 + (((tickAnim - 0) / 10) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1))*-10-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.5))*5)));
            yy = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 20) {
            xx = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1))*-10 + (((tickAnim - 10) / 10) * (5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720/1.5))*-2-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1))*-10)));
            yy = 0 + (((tickAnim - 10) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 10) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 50) {
            xx = 5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720/1.5))*-2 + (((tickAnim - 20) / 30) * (0-(5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720/1.5))*-2)));
            yy = 0 + (((tickAnim - 20) / 30) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 30) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightLeg, rightLeg.rotateAngleX + (float) Math.toRadians(xx), rightLeg.rotateAngleY + (float) Math.toRadians(yy), rightLeg.rotateAngleZ + (float) Math.toRadians(zz));

    }

    public void animLay(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime, double animTick) {
        EntityPrehistoricFloraSinraptor entity = (EntityPrehistoricFloraSinraptor) entitylivingbaseIn;

        int animCycle = 50;
        double tickAnim = animTick + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;


        if (tickAnim >= 0 && tickAnim < 25) {
            xx = 0 + (((tickAnim - 0) / 25) * (-10-(0)));
            yy = 0 + (((tickAnim - 0) / 25) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 25) * (0-(0)));
        }
        else if (tickAnim >= 25 && tickAnim < 50) {
            xx = -10 + (((tickAnim - 25) / 25) * (0-(-10)));
            yy = 0 + (((tickAnim - 25) / 25) * (0-(0)));
            zz = 0 + (((tickAnim - 25) / 25) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(root, root.rotateAngleX + (float) Math.toRadians(xx), root.rotateAngleY + (float) Math.toRadians(yy), root.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 25) {
            xx = 0 + (((tickAnim - 0) / 25) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 25) * (-10-(0)));
            zz = 0 + (((tickAnim - 0) / 25) * (13-(0)));
        }
        else if (tickAnim >= 25 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 25) / 25) * (0-(0)));
            yy = -10 + (((tickAnim - 25) / 25) * (0-(-10)));
            zz = 13 + (((tickAnim - 25) / 25) * (0-(13)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.root.rotationPointX = this.root.rotationPointX + (float)(xx);
        this.root.rotationPointY = this.root.rotationPointY - (float)(yy);
        this.root.rotationPointZ = this.root.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 25) {
            xx = 0 + (((tickAnim - 0) / 25) * (5-(0)));
            yy = 0 + (((tickAnim - 0) / 25) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 25) * (0-(0)));
        }
        else if (tickAnim >= 25 && tickAnim < 50) {
            xx = 5 + (((tickAnim - 25) / 25) * (0-(5)));
            yy = 0 + (((tickAnim - 25) / 25) * (0-(0)));
            zz = 0 + (((tickAnim - 25) / 25) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tail2, tail2.rotateAngleX + (float) Math.toRadians(xx), tail2.rotateAngleY + (float) Math.toRadians(yy), tail2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 25) {
            xx = 0 + (((tickAnim - 0) / 25) * (2.5-(0)));
            yy = 0 + (((tickAnim - 0) / 25) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 25) * (0-(0)));
        }
        else if (tickAnim >= 25 && tickAnim < 50) {
            xx = 2.5 + (((tickAnim - 25) / 25) * (0-(2.5)));
            yy = 0 + (((tickAnim - 25) / 25) * (0-(0)));
            zz = 0 + (((tickAnim - 25) / 25) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tail3, tail3.rotateAngleX + (float) Math.toRadians(xx), tail3.rotateAngleY + (float) Math.toRadians(yy), tail3.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 25) {
            xx = 0 + (((tickAnim - 0) / 25) * (-2.5-(0)));
            yy = 0 + (((tickAnim - 0) / 25) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 25) * (0-(0)));
        }
        else if (tickAnim >= 25 && tickAnim < 50) {
            xx = -2.5 + (((tickAnim - 25) / 25) * (0-(-2.5)));
            yy = 0 + (((tickAnim - 25) / 25) * (0-(0)));
            zz = 0 + (((tickAnim - 25) / 25) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tail4, tail4.rotateAngleX + (float) Math.toRadians(xx), tail4.rotateAngleY + (float) Math.toRadians(yy), tail4.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 25) {
            xx = 0 + (((tickAnim - 0) / 25) * (-4.89092-(0)));
            yy = 0 + (((tickAnim - 0) / 25) * (1.03989-(0)));
            zz = 0 + (((tickAnim - 0) / 25) * (-0.0312-(0)));
        }
        else if (tickAnim >= 25 && tickAnim < 50) {
            xx = -4.89092 + (((tickAnim - 25) / 25) * (0-(-4.89092)));
            yy = 1.03989 + (((tickAnim - 25) / 25) * (0-(1.03989)));
            zz = -0.0312 + (((tickAnim - 25) / 25) * (0-(-0.0312)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tail5, tail5.rotateAngleX + (float) Math.toRadians(xx), tail5.rotateAngleY + (float) Math.toRadians(yy), tail5.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 25) {
            xx = 0 + (((tickAnim - 0) / 25) * (-2.5-(0)));
            yy = 0 + (((tickAnim - 0) / 25) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 25) * (0-(0)));
        }
        else if (tickAnim >= 25 && tickAnim < 50) {
            xx = -2.5 + (((tickAnim - 25) / 25) * (0-(-2.5)));
            yy = 0 + (((tickAnim - 25) / 25) * (0-(0)));
            zz = 0 + (((tickAnim - 25) / 25) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tail6, tail6.rotateAngleX + (float) Math.toRadians(xx), tail6.rotateAngleY + (float) Math.toRadians(yy), tail6.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 25) {
            xx = 0 + (((tickAnim - 0) / 25) * (5-(0)));
            yy = 0 + (((tickAnim - 0) / 25) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 25) * (0-(0)));
        }
        else if (tickAnim >= 25 && tickAnim < 50) {
            xx = 5 + (((tickAnim - 25) / 25) * (0-(5)));
            yy = 0 + (((tickAnim - 25) / 25) * (0-(0)));
            zz = 0 + (((tickAnim - 25) / 25) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck2, neck2.rotateAngleX + (float) Math.toRadians(xx), neck2.rotateAngleY + (float) Math.toRadians(yy), neck2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 25) {
            xx = 0 + (((tickAnim - 0) / 25) * (2.5-(0)));
            yy = 0 + (((tickAnim - 0) / 25) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 25) * (0-(0)));
        }
        else if (tickAnim >= 25 && tickAnim < 50) {
            xx = 2.5 + (((tickAnim - 25) / 25) * (0-(2.5)));
            yy = 0 + (((tickAnim - 25) / 25) * (0-(0)));
            zz = 0 + (((tickAnim - 25) / 25) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck3, neck3.rotateAngleX + (float) Math.toRadians(xx), neck3.rotateAngleY + (float) Math.toRadians(yy), neck3.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 25) {
            xx = 0 + (((tickAnim - 0) / 25) * (5-(0)));
            yy = 0 + (((tickAnim - 0) / 25) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 25) * (0-(0)));
        }
        else if (tickAnim >= 25 && tickAnim < 50) {
            xx = 5 + (((tickAnim - 25) / 25) * (0-(5)));
            yy = 0 + (((tickAnim - 25) / 25) * (0-(0)));
            zz = 0 + (((tickAnim - 25) / 25) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck4, neck4.rotateAngleX + (float) Math.toRadians(xx), neck4.rotateAngleY + (float) Math.toRadians(yy), neck4.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 25) {
            xx = 0 + (((tickAnim - 0) / 25) * (10-(0)));
            yy = 0 + (((tickAnim - 0) / 25) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 25) * (0-(0)));
        }
        else if (tickAnim >= 25 && tickAnim < 50) {
            xx = 10 + (((tickAnim - 25) / 25) * (0-(10)));
            yy = 0 + (((tickAnim - 25) / 25) * (0-(0)));
            zz = 0 + (((tickAnim - 25) / 25) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(head, head.rotateAngleX + (float) Math.toRadians(xx), head.rotateAngleY + (float) Math.toRadians(yy), head.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 25) {
            xx = 0 + (((tickAnim - 0) / 25) * (-42.5-(0)));
            yy = 0 + (((tickAnim - 0) / 25) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 25) * (0-(0)));
        }
        else if (tickAnim >= 25 && tickAnim < 50) {
            xx = -42.5 + (((tickAnim - 25) / 25) * (0-(-42.5)));
            yy = 0 + (((tickAnim - 25) / 25) * (0-(0)));
            zz = 0 + (((tickAnim - 25) / 25) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftLeg, leftLeg.rotateAngleX + (float) Math.toRadians(xx), leftLeg.rotateAngleY + (float) Math.toRadians(yy), leftLeg.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 25) {
            xx = 0 + (((tickAnim - 0) / 25) * (42.5-(0)));
            yy = 0 + (((tickAnim - 0) / 25) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 25) * (0-(0)));
        }
        else if (tickAnim >= 25 && tickAnim < 50) {
            xx = 42.5 + (((tickAnim - 25) / 25) * (0-(42.5)));
            yy = 0 + (((tickAnim - 25) / 25) * (0-(0)));
            zz = 0 + (((tickAnim - 25) / 25) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftLeg2, leftLeg2.rotateAngleX + (float) Math.toRadians(xx), leftLeg2.rotateAngleY + (float) Math.toRadians(yy), leftLeg2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 25) {
            xx = 0 + (((tickAnim - 0) / 25) * (2.5-(0)));
            yy = 0 + (((tickAnim - 0) / 25) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 25) * (0-(0)));
        }
        else if (tickAnim >= 25 && tickAnim < 50) {
            xx = 2.5 + (((tickAnim - 25) / 25) * (0-(2.5)));
            yy = 0 + (((tickAnim - 25) / 25) * (0-(0)));
            zz = 0 + (((tickAnim - 25) / 25) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftLeg3, leftLeg3.rotateAngleX + (float) Math.toRadians(xx), leftLeg3.rotateAngleY + (float) Math.toRadians(yy), leftLeg3.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 25) {
            xx = 0 + (((tickAnim - 0) / 25) * (5-(0)));
            yy = 0 + (((tickAnim - 0) / 25) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 25) * (0-(0)));
        }
        else if (tickAnim >= 25 && tickAnim < 50) {
            xx = 5 + (((tickAnim - 25) / 25) * (0-(5)));
            yy = 0 + (((tickAnim - 25) / 25) * (0-(0)));
            zz = 0 + (((tickAnim - 25) / 25) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftLeg4, leftLeg4.rotateAngleX + (float) Math.toRadians(xx), leftLeg4.rotateAngleY + (float) Math.toRadians(yy), leftLeg4.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 25) {
            xx = 0 + (((tickAnim - 0) / 25) * (-42.5-(0)));
            yy = 0 + (((tickAnim - 0) / 25) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 25) * (0-(0)));
        }
        else if (tickAnim >= 25 && tickAnim < 50) {
            xx = -42.5 + (((tickAnim - 25) / 25) * (0-(-42.5)));
            yy = 0 + (((tickAnim - 25) / 25) * (0-(0)));
            zz = 0 + (((tickAnim - 25) / 25) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightLeg, rightLeg.rotateAngleX + (float) Math.toRadians(xx), rightLeg.rotateAngleY + (float) Math.toRadians(yy), rightLeg.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 25) {
            xx = 0 + (((tickAnim - 0) / 25) * (42.5-(0)));
            yy = 0 + (((tickAnim - 0) / 25) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 25) * (0-(0)));
        }
        else if (tickAnim >= 25 && tickAnim < 50) {
            xx = 42.5 + (((tickAnim - 25) / 25) * (0-(42.5)));
            yy = 0 + (((tickAnim - 25) / 25) * (0-(0)));
            zz = 0 + (((tickAnim - 25) / 25) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightLeg2, rightLeg2.rotateAngleX + (float) Math.toRadians(xx), rightLeg2.rotateAngleY + (float) Math.toRadians(yy), rightLeg2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 25) {
            xx = 0 + (((tickAnim - 0) / 25) * (2.5-(0)));
            yy = 0 + (((tickAnim - 0) / 25) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 25) * (0-(0)));
        }
        else if (tickAnim >= 25 && tickAnim < 50) {
            xx = 2.5 + (((tickAnim - 25) / 25) * (0-(2.5)));
            yy = 0 + (((tickAnim - 25) / 25) * (0-(0)));
            zz = 0 + (((tickAnim - 25) / 25) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightLeg3, rightLeg3.rotateAngleX + (float) Math.toRadians(xx), rightLeg3.rotateAngleY + (float) Math.toRadians(yy), rightLeg3.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 25) {
            xx = 0 + (((tickAnim - 0) / 25) * (5-(0)));
            yy = 0 + (((tickAnim - 0) / 25) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 25) * (0-(0)));
        }
        else if (tickAnim >= 25 && tickAnim < 50) {
            xx = 5 + (((tickAnim - 25) / 25) * (0-(5)));
            yy = 0 + (((tickAnim - 25) / 25) * (0-(0)));
            zz = 0 + (((tickAnim - 25) / 25) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightLeg4, rightLeg4.rotateAngleX + (float) Math.toRadians(xx), rightLeg4.rotateAngleY + (float) Math.toRadians(yy), rightLeg4.rotateAngleZ + (float) Math.toRadians(zz));

    }

    public void animEat(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime, double animTick) {
        EntityPrehistoricFloraSinraptor entity = (EntityPrehistoricFloraSinraptor) entitylivingbaseIn;

        int animCycle = 40;
        double tickAnim = animTick + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;


        if (tickAnim >= 0 && tickAnim < 11) {
            xx = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.75))*-2.5 + (((tickAnim - 0) / 11) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1.25))*10-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.75))*-2.5)));
            yy = 0 + (((tickAnim - 0) / 11) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 11) * (0-(0)));
        }
        else if (tickAnim >= 11 && tickAnim < 25) {
            xx = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1.25))*10 + (((tickAnim - 11) / 14) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*720/2))*-2.5-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1.25))*10)));
            yy = 0 + (((tickAnim - 11) / 14) * (0-(0)));
            zz = 0 + (((tickAnim - 11) / 14) * (0-(0)));
        }
        else if (tickAnim >= 25 && tickAnim < 40) {
            xx = Math.sin((Math.PI/180)*(((double)tickAnim/20)*720/2))*-2.5 + (((tickAnim - 25) / 15) * (0-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*720/2))*-2.5)));
            yy = 0 + (((tickAnim - 25) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 25) / 15) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(hips, hips.rotateAngleX + (float) Math.toRadians(xx), hips.rotateAngleY + (float) Math.toRadians(yy), hips.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 11) {
            xx = 0 + (((tickAnim - 0) / 11) * (0-(0)));
            yy = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.75))*0.5 + (((tickAnim - 0) / 11) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1.25))*-2-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.75))*0.5)));
            zz = 0 + (((tickAnim - 0) / 11) * (0-(0)));
        }
        else if (tickAnim >= 11 && tickAnim < 25) {
            xx = 0 + (((tickAnim - 11) / 14) * (0-(0)));
            yy = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1.25))*-2 + (((tickAnim - 11) / 14) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*720/2))*0.6-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1.25))*-2)));
            zz = 0 + (((tickAnim - 11) / 14) * (0-(0)));
        }
        else if (tickAnim >= 25 && tickAnim < 40) {
            xx = 0 + (((tickAnim - 25) / 15) * (0-(0)));
            yy = Math.sin((Math.PI/180)*(((double)tickAnim/20)*720/2))*0.6 + (((tickAnim - 25) / 15) * (0-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*720/2))*0.6)));
            zz = 0 + (((tickAnim - 25) / 15) * (0-(0)));
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
            xx = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.75))*2.5 + (((tickAnim - 0) / 11) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1.25))*-5-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.75))*2.5)));
            yy = 0 + (((tickAnim - 0) / 11) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 11) * (0-(0)));
        }
        else if (tickAnim >= 11 && tickAnim < 25) {
            xx = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1.25))*-5 + (((tickAnim - 11) / 14) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*720/2))*2.5-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1.25))*-5)));
            yy = 0 + (((tickAnim - 11) / 14) * (0-(0)));
            zz = 0 + (((tickAnim - 11) / 14) * (0-(0)));
        }
        else if (tickAnim >= 25 && tickAnim < 40) {
            xx = Math.sin((Math.PI/180)*(((double)tickAnim/20)*720/2))*2.5 + (((tickAnim - 25) / 15) * (0-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*720/2))*2.5)));
            yy = 0 + (((tickAnim - 25) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 25) / 15) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tail2, tail2.rotateAngleX + (float) Math.toRadians(xx), tail2.rotateAngleY + (float) Math.toRadians(yy), tail2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 11) {
            xx = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.75))*-2.5 + (((tickAnim - 0) / 11) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1.25))*-5-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.75))*-2.5)));
            yy = 0 + (((tickAnim - 0) / 11) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 11) * (0-(0)));
        }
        else if (tickAnim >= 11 && tickAnim < 25) {
            xx = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1.25))*-5 + (((tickAnim - 11) / 14) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*720/2))*-2.5-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1.25))*-5)));
            yy = 0 + (((tickAnim - 11) / 14) * (0-(0)));
            zz = 0 + (((tickAnim - 11) / 14) * (0-(0)));
        }
        else if (tickAnim >= 25 && tickAnim < 40) {
            xx = Math.sin((Math.PI/180)*(((double)tickAnim/20)*720/2))*-2.5 + (((tickAnim - 25) / 15) * (0-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*720/2))*-2.5)));
            yy = 0 + (((tickAnim - 25) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 25) / 15) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tail3, tail3.rotateAngleX + (float) Math.toRadians(xx), tail3.rotateAngleY + (float) Math.toRadians(yy), tail3.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 11) {
            xx = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.75))*-2.5 + (((tickAnim - 0) / 11) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1.25))*-5-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.75))*-2.5)));
            yy = 0 + (((tickAnim - 0) / 11) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 11) * (0-(0)));
        }
        else if (tickAnim >= 11 && tickAnim < 25) {
            xx = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1.25))*-5 + (((tickAnim - 11) / 14) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*720/2))*-2.5-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1.25))*-5)));
            yy = 0 + (((tickAnim - 11) / 14) * (0-(0)));
            zz = 0 + (((tickAnim - 11) / 14) * (0-(0)));
        }
        else if (tickAnim >= 25 && tickAnim < 40) {
            xx = Math.sin((Math.PI/180)*(((double)tickAnim/20)*720/2))*-2.5 + (((tickAnim - 25) / 15) * (0-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*720/2))*-2.5)));
            yy = 0 + (((tickAnim - 25) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 25) / 15) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tail4, tail4.rotateAngleX + (float) Math.toRadians(xx), tail4.rotateAngleY + (float) Math.toRadians(yy), tail4.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 11) {
            xx = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.75))*-2.5 + (((tickAnim - 0) / 11) * (-2.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1.25))*8-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.75))*-2.5)));
            yy = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.75))*-2.5 + (((tickAnim - 0) / 11) * (0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/1.25-30))*2.5-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.75))*-2.5)));
            zz = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.75))*-2.5 + (((tickAnim - 0) / 11) * (0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/1.25-30))*2.5-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.75))*-2.5)));
        }
        else if (tickAnim >= 11 && tickAnim < 25) {
            xx = -2.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1.25))*8 + (((tickAnim - 11) / 14) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*720/2))*-7.5-(-2.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1.25))*8)));
            yy = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/1.25-30))*2.5 + (((tickAnim - 11) / 14) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/2+60))*2.5-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/1.25-30))*2.5)));
            zz = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/1.25-30))*2.5 + (((tickAnim - 11) / 14) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/2+60))*-2.5-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/1.25-30))*2.5)));
        }
        else if (tickAnim >= 25 && tickAnim < 40) {
            xx = Math.sin((Math.PI/180)*(((double)tickAnim/20)*720/2))*-7.5 + (((tickAnim - 25) / 15) * (0-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*720/2))*-7.5)));
            yy = Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/2+60))*2.5 + (((tickAnim - 25) / 15) * (0-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/2+60))*2.5)));
            zz = Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/2+60))*-2.5 + (((tickAnim - 25) / 15) * (0-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/2+60))*-2.5)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(body, body.rotateAngleX + (float) Math.toRadians(xx), body.rotateAngleY + (float) Math.toRadians(yy), body.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 11) {
            xx = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.75))*-2.5 + (((tickAnim - 0) / 11) * (-10+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1.25-60))*8-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.75))*-2.5)));
            yy = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.75))*-2.5 + (((tickAnim - 0) / 11) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/1.25-30))*2.5-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.75))*-2.5)));
            zz = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.75))*-2.5 + (((tickAnim - 0) / 11) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/1.25-30))*2.5-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.75))*-2.5)));
        }
        else if (tickAnim >= 11 && tickAnim < 25) {
            xx = -10+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1.25-60))*8 + (((tickAnim - 11) / 14) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*720/2+60))*-12.5-(-10+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1.25-60))*8)));
            yy = Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/1.25-30))*2.5 + (((tickAnim - 11) / 14) * (0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/2+60))*2.5-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/1.25-30))*2.5)));
            zz = Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/1.25-30))*2.5 + (((tickAnim - 11) / 14) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/2+60))*-2.5-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/1.25-30))*2.5)));
        }
        else if (tickAnim >= 25 && tickAnim < 40) {
            xx = Math.sin((Math.PI/180)*(((double)tickAnim/20)*720/2+60))*-12.5 + (((tickAnim - 25) / 15) * (0-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*720/2+60))*-12.5)));
            yy = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/2+60))*2.5 + (((tickAnim - 25) / 15) * (0-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/2+60))*2.5)));
            zz = Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/2+60))*-2.5 + (((tickAnim - 25) / 15) * (0-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/2+60))*-2.5)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(body2, body2.rotateAngleX + (float) Math.toRadians(xx), body2.rotateAngleY + (float) Math.toRadians(yy), body2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 11) {
            xx = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.75))*-5 + (((tickAnim - 0) / 11) * (-5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1.25))*30-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.75))*-5)));
            yy = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.75))*-5 + (((tickAnim - 0) / 11) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/1.25))*-5-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.75))*-5)));
            zz = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.75))*-5 + (((tickAnim - 0) / 11) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1.25+30))*-10-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.75))*-5)));
        }
        else if (tickAnim >= 11 && tickAnim < 25) {
            xx = -5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1.25))*30 + (((tickAnim - 11) / 14) * (12.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720/2-60))*12.5-(-5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1.25))*30)));
            yy = Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/1.25))*-5 + (((tickAnim - 11) / 14) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/2-60))*5-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/1.25))*-5)));
            zz = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1.25+30))*-10 + (((tickAnim - 11) / 14) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/2-60))*-5-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1.25+30))*-10)));
        }
        else if (tickAnim >= 25 && tickAnim < 40) {
            xx = 12.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720/2-60))*12.5 + (((tickAnim - 25) / 15) * (0-(12.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720/2-60))*12.5)));
            yy = Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/2-60))*5 + (((tickAnim - 25) / 15) * (0-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/2-60))*5)));
            zz = Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/2-60))*-5 + (((tickAnim - 25) / 15) * (0-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/2-60))*-5)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck, neck.rotateAngleX + (float) Math.toRadians(xx), neck.rotateAngleY + (float) Math.toRadians(yy), neck.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 11) {
            xx = 0 + (((tickAnim - 0) / 11) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 11) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 11) * (-1.7-(0)));
        }
        else if (tickAnim >= 11 && tickAnim < 25) {
            xx = 0 + (((tickAnim - 11) / 14) * (0-(0)));
            yy = 0 + (((tickAnim - 11) / 14) * (0-(0)));
            zz = -1.7 + (((tickAnim - 11) / 14) * (0-(-1.7)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.neck.rotationPointX = this.neck.rotationPointX + (float)(xx);
        this.neck.rotationPointY = this.neck.rotationPointY - (float)(yy);
        this.neck.rotationPointZ = this.neck.rotationPointZ + (float)(zz);










        if (tickAnim >= 25 && tickAnim < 40) {
            xx = Math.sin((Math.PI/180)*(((double)tickAnim/20)*720/2-100))*15 + (((tickAnim - 25) / 15) * (0-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*720/2-100))*15)));
            yy = Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/2-100))*2.5 + (((tickAnim - 25) / 15) * (0-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/2-100))*2.5)));
            zz = Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/2-100))*-2.5 + (((tickAnim - 25) / 15) * (0-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/2-100))*-2.5)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck2, neck2.rotateAngleX + (float) Math.toRadians(xx), neck2.rotateAngleY + (float) Math.toRadians(yy), neck2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 11) {
            xx = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.75))*-5 + (((tickAnim - 0) / 11) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1.25+60))*30-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.75))*-5)));
            yy = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.75))*-5 + (((tickAnim - 0) / 11) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/1.25+60))*-2.5-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.75))*-5)));
            zz = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.75))*-5 + (((tickAnim - 0) / 11) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/1.25+60))*-2.5-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.75))*-5)));
        }






        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck3, neck3.rotateAngleX + (float) Math.toRadians(xx), neck3.rotateAngleY + (float) Math.toRadians(yy), neck3.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 11) {
            xx = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.75))*-5 + (((tickAnim - 0) / 11) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1.25+90))*5-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.75))*-5)));
            yy = 0 + (((tickAnim - 0) / 11) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 11) * (0-(0)));
        }
        else if (tickAnim >= 11 && tickAnim < 25) {
            xx = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1.25+90))*5 + (((tickAnim - 11) / 14) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*720/2-60))*-27.5-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1.25+90))*5)));
            yy = 0 + (((tickAnim - 11) / 14) * (0-(0)));
            zz = 0 + (((tickAnim - 11) / 14) * (0-(0)));
        }
        else if (tickAnim >= 25 && tickAnim < 40) {
            xx = Math.sin((Math.PI/180)*(((double)tickAnim/20)*720/2-60))*-27.5 + (((tickAnim - 25) / 15) * (0-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*720/2-60))*-27.5)));
            yy = 0 + (((tickAnim - 25) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 25) / 15) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck4, neck4.rotateAngleX + (float) Math.toRadians(xx), neck4.rotateAngleY + (float) Math.toRadians(yy), neck4.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 11) {
            xx = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.75))*1 + (((tickAnim - 0) / 11) * (5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1.25+60))*-10-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.75))*1)));
            yy = 0 + (((tickAnim - 0) / 11) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 11) * (0-(0)));
        }
        else if (tickAnim >= 11 && tickAnim < 25) {
            xx = 5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1.25+60))*-10 + (((tickAnim - 11) / 14) * (-12.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720/2+100))*-5-(5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1.25+60))*-10)));
            yy = 0 + (((tickAnim - 11) / 14) * (0-(0)));
            zz = 0 + (((tickAnim - 11) / 14) * (0-(0)));
        }
        else if (tickAnim >= 25 && tickAnim < 40) {
            xx = -12.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720/2+100))*-5 + (((tickAnim - 25) / 15) * (0-(-12.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720/2+100))*-5)));
            yy = 0 + (((tickAnim - 25) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 25) / 15) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(head, head.rotateAngleX + (float) Math.toRadians(xx), head.rotateAngleY + (float) Math.toRadians(yy), head.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 0) / 8) * (27.33-(0)));
            yy = 0 + (((tickAnim - 0) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 8) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 21) {
            xx = 27.33 + (((tickAnim - 8) / 13) * (3.08-(27.33)));
            yy = 0 + (((tickAnim - 8) / 13) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 13) * (0-(0)));
        }
        else if (tickAnim >= 21 && tickAnim < 25) {
            xx = 3.08 + (((tickAnim - 21) / 4) * (19.16-(3.08)));
            yy = 0 + (((tickAnim - 21) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 21) / 4) * (0-(0)));
        }
        else if (tickAnim >= 25 && tickAnim < 33) {
            xx = 19.16 + (((tickAnim - 25) / 8) * (0-(19.16)));
            yy = 0 + (((tickAnim - 25) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 25) / 8) * (0-(0)));
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
        this.setRotateAngle(jaw, jaw.rotateAngleX + (float) Math.toRadians(xx), jaw.rotateAngleY + (float) Math.toRadians(yy), jaw.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 11) {
            xx = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.75))*2.5 + (((tickAnim - 0) / 11) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1.25-60))*-5-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.75))*2.5)));
            yy = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.75))*2.5 + (((tickAnim - 0) / 11) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/1.25-30))*-2.5-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.75))*2.5)));
            zz = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.75))*2.5 + (((tickAnim - 0) / 11) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/1.25-30))*-2.5-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.75))*2.5)));
        }
        else if (tickAnim >= 11 && tickAnim < 25) {
            xx = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1.25-60))*-5 + (((tickAnim - 11) / 14) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*720/2+60))*5-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1.25-60))*-5)));
            yy = Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/1.25-30))*-2.5 + (((tickAnim - 11) / 14) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/2+60))*-2.5-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/1.25-30))*-2.5)));
            zz = Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/1.25-30))*-2.5 + (((tickAnim - 11) / 14) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/2+60))*2.5-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/1.25-30))*-2.5)));
        }
        else if (tickAnim >= 25 && tickAnim < 40) {
            xx = Math.sin((Math.PI/180)*(((double)tickAnim/20)*720/2+60))*5 + (((tickAnim - 25) / 15) * (0-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*720/2+60))*5)));
            yy = Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/2+60))*-2.5 + (((tickAnim - 25) / 15) * (0-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/2+60))*-2.5)));
            zz = Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/2+60))*2.5 + (((tickAnim - 25) / 15) * (0-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/2+60))*2.5)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftarm2, leftarm2.rotateAngleX + (float) Math.toRadians(xx), leftarm2.rotateAngleY + (float) Math.toRadians(yy), leftarm2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 11) {
            xx = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.75))*2.5 + (((tickAnim - 0) / 11) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1.25-60))*-5-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.75))*2.5)));
            yy = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.75))*-2.5 + (((tickAnim - 0) / 11) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/1.25-30))*2.5-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.75))*-2.5)));
            zz = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.75))*-2.5 + (((tickAnim - 0) / 11) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/1.25-30))*2.5-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.75))*-2.5)));
        }
        else if (tickAnim >= 11 && tickAnim < 25) {
            xx = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1.25-60))*-5 + (((tickAnim - 11) / 14) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*720/2+60))*5-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1.25-60))*-5)));
            yy = Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/1.25-30))*2.5 + (((tickAnim - 11) / 14) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/2+60))*2.5-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/1.25-30))*2.5)));
            zz = Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/1.25-30))*2.5 + (((tickAnim - 11) / 14) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/2+60))*-2.5-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/1.25-30))*2.5)));
        }
        else if (tickAnim >= 25 && tickAnim < 40) {
            xx = Math.sin((Math.PI/180)*(((double)tickAnim/20)*720/2+60))*5 + (((tickAnim - 25) / 15) * (0-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*720/2+60))*5)));
            yy = Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/2+60))*2.5 + (((tickAnim - 25) / 15) * (0-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/2+60))*2.5)));
            zz = Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/2+60))*-2.5 + (((tickAnim - 25) / 15) * (0-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/2+60))*-2.5)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightarm2, rightarm2.rotateAngleX + (float) Math.toRadians(xx), rightarm2.rotateAngleY + (float) Math.toRadians(yy), rightarm2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 11) {
            xx = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.75))*5 + (((tickAnim - 0) / 11) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1.25))*-15-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.75))*5)));
            yy = 0 + (((tickAnim - 0) / 11) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 11) * (0-(0)));
        }
        else if (tickAnim >= 11 && tickAnim < 25) {
            xx = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1.25))*-15 + (((tickAnim - 11) / 14) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*720/2))*5-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1.25))*-15)));
            yy = 0 + (((tickAnim - 11) / 14) * (0-(0)));
            zz = 0 + (((tickAnim - 11) / 14) * (0-(0)));
        }
        else if (tickAnim >= 25 && tickAnim < 40) {
            xx = Math.sin((Math.PI/180)*(((double)tickAnim/20)*720/2))*5 + (((tickAnim - 25) / 15) * (0-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*720/2))*5)));
            yy = 0 + (((tickAnim - 25) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 25) / 15) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftLeg, leftLeg.rotateAngleX + (float) Math.toRadians(xx), leftLeg.rotateAngleY + (float) Math.toRadians(yy), leftLeg.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 11) {
            xx = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.75))*-5 + (((tickAnim - 0) / 11) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1.25))*10-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.75))*-5)));
            yy = 0 + (((tickAnim - 0) / 11) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 11) * (0-(0)));
        }
        else if (tickAnim >= 11 && tickAnim < 25) {
            xx = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1.25))*10 + (((tickAnim - 11) / 14) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*720/2))*-5-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1.25))*10)));
            yy = 0 + (((tickAnim - 11) / 14) * (0-(0)));
            zz = 0 + (((tickAnim - 11) / 14) * (0-(0)));
        }
        else if (tickAnim >= 25 && tickAnim < 40) {
            xx = Math.sin((Math.PI/180)*(((double)tickAnim/20)*720/2))*-5 + (((tickAnim - 25) / 15) * (0-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*720/2))*-5)));
            yy = 0 + (((tickAnim - 25) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 25) / 15) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftLeg2, leftLeg2.rotateAngleX + (float) Math.toRadians(xx), leftLeg2.rotateAngleY + (float) Math.toRadians(yy), leftLeg2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 11) {
            xx = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.75))*2.5 + (((tickAnim - 0) / 11) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1.25))*-5-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.75))*2.5)));
            yy = 0 + (((tickAnim - 0) / 11) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 11) * (0-(0)));
        }
        else if (tickAnim >= 11 && tickAnim < 25) {
            xx = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1.25))*-5 + (((tickAnim - 11) / 14) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*720/2))*2.5-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1.25))*-5)));
            yy = 0 + (((tickAnim - 11) / 14) * (0-(0)));
            zz = 0 + (((tickAnim - 11) / 14) * (0-(0)));
        }
        else if (tickAnim >= 25 && tickAnim < 40) {
            xx = Math.sin((Math.PI/180)*(((double)tickAnim/20)*720/2))*2.5 + (((tickAnim - 25) / 15) * (0-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*720/2))*2.5)));
            yy = 0 + (((tickAnim - 25) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 25) / 15) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftLeg3, leftLeg3.rotateAngleX + (float) Math.toRadians(xx), leftLeg3.rotateAngleY + (float) Math.toRadians(yy), leftLeg3.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 11) {
            xx = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.75))*5 + (((tickAnim - 0) / 11) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1.25))*-15-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.75))*5)));
            yy = 0 + (((tickAnim - 0) / 11) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 11) * (0-(0)));
        }
        else if (tickAnim >= 11 && tickAnim < 25) {
            xx = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1.25))*-15 + (((tickAnim - 11) / 14) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*720/2))*5-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1.25))*-15)));
            yy = 0 + (((tickAnim - 11) / 14) * (0-(0)));
            zz = 0 + (((tickAnim - 11) / 14) * (0-(0)));
        }
        else if (tickAnim >= 25 && tickAnim < 40) {
            xx = Math.sin((Math.PI/180)*(((double)tickAnim/20)*720/2))*5 + (((tickAnim - 25) / 15) * (0-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*720/2))*5)));
            yy = 0 + (((tickAnim - 25) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 25) / 15) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightLeg, rightLeg.rotateAngleX + (float) Math.toRadians(xx), rightLeg.rotateAngleY + (float) Math.toRadians(yy), rightLeg.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 11) {
            xx = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.75))*-5 + (((tickAnim - 0) / 11) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1.25))*10-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.75))*-5)));
            yy = 0 + (((tickAnim - 0) / 11) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 11) * (0-(0)));
        }
        else if (tickAnim >= 11 && tickAnim < 25) {
            xx = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1.25))*10 + (((tickAnim - 11) / 14) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*720/2))*-5-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1.25))*10)));
            yy = 0 + (((tickAnim - 11) / 14) * (0-(0)));
            zz = 0 + (((tickAnim - 11) / 14) * (0-(0)));
        }
        else if (tickAnim >= 25 && tickAnim < 40) {
            xx = Math.sin((Math.PI/180)*(((double)tickAnim/20)*720/2))*-5 + (((tickAnim - 25) / 15) * (0-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*720/2))*-5)));
            yy = 0 + (((tickAnim - 25) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 25) / 15) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightLeg2, rightLeg2.rotateAngleX + (float) Math.toRadians(xx), rightLeg2.rotateAngleY + (float) Math.toRadians(yy), rightLeg2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 11) {
            xx = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.75))*2.5 + (((tickAnim - 0) / 11) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1.25))*-5-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.75))*2.5)));
            yy = 0 + (((tickAnim - 0) / 11) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 11) * (0-(0)));
        }
        else if (tickAnim >= 11 && tickAnim < 25) {
            xx = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1.25))*-5 + (((tickAnim - 11) / 14) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*720/2))*2.5-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1.25))*-5)));
            yy = 0 + (((tickAnim - 11) / 14) * (0-(0)));
            zz = 0 + (((tickAnim - 11) / 14) * (0-(0)));
        }
        else if (tickAnim >= 25 && tickAnim < 40) {
            xx = Math.sin((Math.PI/180)*(((double)tickAnim/20)*720/2))*2.5 + (((tickAnim - 25) / 15) * (0-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*720/2))*2.5)));
            yy = 0 + (((tickAnim - 25) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 25) / 15) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightLeg3, rightLeg3.rotateAngleX + (float) Math.toRadians(xx), rightLeg3.rotateAngleY + (float) Math.toRadians(yy), rightLeg3.rotateAngleZ + (float) Math.toRadians(zz));

    }

    public void animAttack(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime, double animTick) {
        EntityPrehistoricFloraSinraptor entity = (EntityPrehistoricFloraSinraptor) entitylivingbaseIn;

        int animCycle = 30;
        double tickAnim = animTick + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;


        if (tickAnim >= 0 && tickAnim < 10) {
            xx = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.5))*5 + (((tickAnim - 0) / 10) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.75+30))*-10-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.5))*5)));
            yy = -(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.5))*2.5) + (((tickAnim - 0) / 10) * (-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.75))*5))-(-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.5))*2.5)));
            zz = -(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.5))*2.5) + (((tickAnim - 0) / 10) * (-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.75))*-5))-(-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.5))*2.5)));
        }
        else if (tickAnim >= 10 && tickAnim < 15) {
            xx = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.75+30))*-10 + (((tickAnim - 10) / 5) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/2-60))*-5-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.75+30))*-10)));
            yy = -(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.75))*5) + (((tickAnim - 10) / 5) * (-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/2+30))*5))-(-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.75))*5)));
            zz = -(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.75))*-5) + (((tickAnim - 10) / 5) * (-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/2+30))*-5))-(-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.75))*-5)));
        }
        else if (tickAnim >= 15 && tickAnim < 30) {
            xx = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/2-60))*-5 + (((tickAnim - 15) / 15) * (0-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/2-60))*-5)));
            yy = -(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/2+30))*5) + (((tickAnim - 15) / 15) * (0-(-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/2+30))*5))));
            zz = -(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/2+30))*-5) + (((tickAnim - 15) / 15) * (0-(-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/2+30))*-5))));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(body2, body2.rotateAngleX + (float) Math.toRadians(xx), body2.rotateAngleY + (float) Math.toRadians(yy), body2.rotateAngleZ + (float) Math.toRadians(zz));










        if (tickAnim >= 15 && tickAnim < 23) {
            xx = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/2))*20 + (((tickAnim - 15) / 8) * (-13.8408-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/2))*20)));
            yy = -(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/2-60))*-10) + (((tickAnim - 15) / 8) * (2.64451-(-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/2-60))*-10))));
            zz = -(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/2+60))*-10) + (((tickAnim - 15) / 8) * (0.43509-(-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/2+60))*-10))));
        }
        else if (tickAnim >= 23 && tickAnim < 26) {
            xx = -13.8408 + (((tickAnim - 23) / 3) * (-20.18934-(-13.8408)));
            yy = 2.64451 + (((tickAnim - 23) / 3) * (1.46917-(2.64451)));
            zz = 0.43509 + (((tickAnim - 23) / 3) * (0.24172-(0.43509)));
        }
        else if (tickAnim >= 26 && tickAnim < 30) {
            xx = -20.18934 + (((tickAnim - 26) / 4) * (0-(-20.18934)));
            yy = 1.46917 + (((tickAnim - 26) / 4) * (0-(1.46917)));
            zz = 0.24172 + (((tickAnim - 26) / 4) * (0-(0.24172)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck, neck.rotateAngleX + (float) Math.toRadians(xx), neck.rotateAngleY + (float) Math.toRadians(yy), neck.rotateAngleZ + (float) Math.toRadians(zz));










        if (tickAnim >= 15 && tickAnim < 18) {
            xx = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/2+60))*1 + (((tickAnim - 15) / 3) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/2+60))*-2-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/2+60))*1)));
            yy = -(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/2-30))*-2.5) + (((tickAnim - 15) / 3) * (-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/2-30))*-2.5))-(-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/2-30))*-2.5)));
            zz = -(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/2-30))*-2.5) + (((tickAnim - 15) / 3) * (-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/2-30))*-2.5))-(-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/2-30))*-2.5)));
        }
        else if (tickAnim >= 18 && tickAnim < 23) {
            xx = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/2+60))*-2 + (((tickAnim - 18) / 5) * (25.87017-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/2+60))*-2)));
            yy = -(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/2-30))*-2.5) + (((tickAnim - 18) / 5) * (0.8262-(-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/2-30))*-2.5))));
            zz = -(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/2-30))*-2.5) + (((tickAnim - 18) / 5) * (0.8262-(-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/2-30))*-2.5))));
        }
        else if (tickAnim >= 23 && tickAnim < 30) {
            xx = 25.87017 + (((tickAnim - 23) / 7) * (0-(25.87017)));
            yy = 0.8262 + (((tickAnim - 23) / 7) * (0-(0.8262)));
            zz = 0.8262 + (((tickAnim - 23) / 7) * (0-(0.8262)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck2, neck2.rotateAngleX + (float) Math.toRadians(xx), neck2.rotateAngleY + (float) Math.toRadians(yy), neck2.rotateAngleZ + (float) Math.toRadians(zz));










        if (tickAnim >= 15 && tickAnim < 23) {
            xx = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/2-60))*15 + (((tickAnim - 15) / 8) * (-23.53323-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/2-60))*15)));
            yy = -(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/2-30))*2.5) + (((tickAnim - 15) / 8) * (-0.8262-(-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/2-30))*2.5))));
            zz = -(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/2+60))*-2.5) + (((tickAnim - 15) / 8) * (0.10877-(-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/2+60))*-2.5))));
        }
        else if (tickAnim >= 23 && tickAnim < 30) {
            xx = -23.53323 + (((tickAnim - 23) / 7) * (0-(-23.53323)));
            yy = -0.8262 + (((tickAnim - 23) / 7) * (0-(-0.8262)));
            zz = 0.10877 + (((tickAnim - 23) / 7) * (0-(0.10877)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck3, neck3.rotateAngleX + (float) Math.toRadians(xx), neck3.rotateAngleY + (float) Math.toRadians(yy), neck3.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 10 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 10) / 3) * (-10-(0)));
            yy = 0 + (((tickAnim - 10) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 3) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 18) {
            xx = -10 + (((tickAnim - 13) / 5) * (15-(-10)));
            yy = 0 + (((tickAnim - 13) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 13) / 5) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 23) {
            xx = 15 + (((tickAnim - 18) / 5) * (0-(15)));
            yy = 0 + (((tickAnim - 18) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 18) / 5) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck4, neck4.rotateAngleX + (float) Math.toRadians(xx), neck4.rotateAngleY + (float) Math.toRadians(yy), neck4.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 10) {
            xx = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.5))*2.5 + (((tickAnim - 0) / 10) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.75+30))*-5-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.5))*2.5)));
            yy = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 15) {
            xx = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.75+30))*-5 + (((tickAnim - 10) / 5) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/2+60))*-10-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.75+30))*-5)));
            yy = 0 + (((tickAnim - 10) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 5) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 23) {
            xx = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/2+60))*-10 + (((tickAnim - 15) / 8) * (20.02932-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/2+60))*-10)));
            yy = 0 + (((tickAnim - 15) / 8) * (0.49955-(0)));
            zz = 0 + (((tickAnim - 15) / 8) * (-2.44961-(0)));
        }
        else if (tickAnim >= 23 && tickAnim < 30) {
            xx = 20.02932 + (((tickAnim - 23) / 7) * (0-(20.02932)));
            yy = 0.49955 + (((tickAnim - 23) / 7) * (0-(0.49955)));
            zz = -2.44961 + (((tickAnim - 23) / 7) * (0-(-2.44961)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(head, head.rotateAngleX + (float) Math.toRadians(xx), head.rotateAngleY + (float) Math.toRadians(yy), head.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 8) {
            xx = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.5))*-2.5 + (((tickAnim - 0) / 8) * (44.25-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.5))*-2.5)));
            yy = 0 + (((tickAnim - 0) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 8) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 13) {
            xx = 44.25 + (((tickAnim - 8) / 5) * (46.5-(44.25)));
            yy = 0 + (((tickAnim - 8) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 5) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 17) {
            xx = 46.5 + (((tickAnim - 13) / 4) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/2))*1.5-(46.5)));
            yy = 0 + (((tickAnim - 13) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 13) / 4) * (0-(0)));
        }
        else if (tickAnim >= 17 && tickAnim < 30) {
            xx = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/2))*1.5 + (((tickAnim - 17) / 13) * (0-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/2))*1.5)));
            yy = 0 + (((tickAnim - 17) / 13) * (0-(0)));
            zz = 0 + (((tickAnim - 17) / 13) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(jaw, jaw.rotateAngleX + (float) Math.toRadians(xx), jaw.rotateAngleY + (float) Math.toRadians(yy), jaw.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 10) {
            xx = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.5))*-5 + (((tickAnim - 0) / 10) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.75))*10-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.5))*-5)));
            yy = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 15) {
            xx = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.75))*10 + (((tickAnim - 10) / 5) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/2))*-1-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.75))*10)));
            yy = 0 + (((tickAnim - 10) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 5) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 30) {
            xx = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/2))*-1 + (((tickAnim - 15) / 15) * (0-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/2))*-1)));
            yy = 0 + (((tickAnim - 15) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 15) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(masseter, masseter.rotateAngleX + (float) Math.toRadians(xx), masseter.rotateAngleY + (float) Math.toRadians(yy), masseter.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 10) {
            xx = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.5))*5 + (((tickAnim - 0) / 10) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.75-30))*-60-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.5))*5)));
            yy = -(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.5))*5) + (((tickAnim - 0) / 10) * (-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.75-60))*-50))-(-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.5))*5)));
            zz = -(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.5))*5) + (((tickAnim - 0) / 10) * (-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.75))*-30))-(-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.5))*5)));
        }
        else if (tickAnim >= 10 && tickAnim < 15) {
            xx = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.75-30))*-60 + (((tickAnim - 10) / 5) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/20+60))*-50-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.75-30))*-60)));
            yy = -(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.75-60))*-50) + (((tickAnim - 10) / 5) * (-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/2-60))*10))-(-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.75-60))*-50)));
            zz = -(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.75))*-30) + (((tickAnim - 10) / 5) * (-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/2))*5))-(-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.75))*-30)));
        }
        else if (tickAnim >= 15 && tickAnim < 30) {
            xx = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/20+60))*-50 + (((tickAnim - 15) / 15) * (0-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/20+60))*-50)));
            yy = -(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/2-60))*10) + (((tickAnim - 15) / 15) * (0-(-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/2-60))*10))));
            zz = -(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/2))*5) + (((tickAnim - 15) / 15) * (0-(-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/2))*5))));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftarm, leftarm.rotateAngleX + (float) Math.toRadians(xx), leftarm.rotateAngleY + (float) Math.toRadians(yy), leftarm.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 10) {
            xx = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.5))*5 + (((tickAnim - 0) / 10) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.75+30))*30-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.5))*5)));
            yy = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 15) {
            xx = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.75+30))*30 + (((tickAnim - 10) / 5) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/2-60))*-10-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.75+30))*30)));
            yy = 0 + (((tickAnim - 10) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 5) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 30) {
            xx = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/2-60))*-10 + (((tickAnim - 15) / 15) * (0-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/2-60))*-10)));
            yy = 0 + (((tickAnim - 15) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 15) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftarm2, leftarm2.rotateAngleX + (float) Math.toRadians(xx), leftarm2.rotateAngleY + (float) Math.toRadians(yy), leftarm2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            zz = -(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.5))*5) + (((tickAnim - 0) / 10) * (-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.75+60))*-30))-(-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.5))*5)));
        }
        else if (tickAnim >= 10 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 10) / 5) * (0-(0)));
            yy = 0 + (((tickAnim - 10) / 5) * (0-(0)));
            zz = -(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.75+60))*-30) + (((tickAnim - 10) / 5) * (-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/2-30))*10))-(-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.75+60))*-30)));
        }
        else if (tickAnim >= 15 && tickAnim < 30) {
            xx = 0 + (((tickAnim - 15) / 15) * (0-(0)));
            yy = 0 + (((tickAnim - 15) / 15) * (0-(0)));
            zz = -(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/2-30))*10) + (((tickAnim - 15) / 15) * (0-(-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/2-30))*10))));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftHand, leftHand.rotateAngleX + (float) Math.toRadians(xx), leftHand.rotateAngleY + (float) Math.toRadians(yy), leftHand.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 10) {
            xx = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.5))*5 + (((tickAnim - 0) / 10) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.75-30))*-60-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.5))*5)));
            yy = -(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.5))*-5) + (((tickAnim - 0) / 10) * (-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.75-60))*50))-(-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.5))*-5)));
            zz = -(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.5))*-5) + (((tickAnim - 0) / 10) * (-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.75))*30))-(-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.5))*-5)));
        }
        else if (tickAnim >= 10 && tickAnim < 15) {
            xx = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.75-30))*-60 + (((tickAnim - 10) / 5) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/2+60))*-50-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.75-30))*-60)));
            yy = -(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.75-60))*50) + (((tickAnim - 10) / 5) * (-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/2-60))*-10))-(-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.75-60))*50)));
            zz = -(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.75))*30) + (((tickAnim - 10) / 5) * (-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/2))*-5))-(-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.75))*30)));
        }
        else if (tickAnim >= 15 && tickAnim < 30) {
            xx = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/2+60))*-50 + (((tickAnim - 15) / 15) * (0-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/2+60))*-50)));
            yy = -(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/2-60))*-10) + (((tickAnim - 15) / 15) * (0-(-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/2-60))*-10))));
            zz = -(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/2))*-5) + (((tickAnim - 15) / 15) * (0-(-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/2))*-5))));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightarm, rightarm.rotateAngleX + (float) Math.toRadians(xx), rightarm.rotateAngleY + (float) Math.toRadians(yy), rightarm.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 10) {
            xx = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.5))*5 + (((tickAnim - 0) / 10) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.75+30))*30-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.5))*5)));
            yy = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 15) {
            xx = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.75+30))*30 + (((tickAnim - 10) / 5) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/2-60))*-10-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.75+30))*30)));
            yy = 0 + (((tickAnim - 10) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 5) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 30) {
            xx = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/2-60))*-10 + (((tickAnim - 15) / 15) * (0-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/2-60))*-10)));
            yy = 0 + (((tickAnim - 15) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 15) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightarm2, rightarm2.rotateAngleX + (float) Math.toRadians(xx), rightarm2.rotateAngleY + (float) Math.toRadians(yy), rightarm2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            zz = -(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.5))*-5) + (((tickAnim - 0) / 10) * (-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.75+60))*30))-(-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.5))*-5)));
        }
        else if (tickAnim >= 10 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 10) / 5) * (0-(0)));
            yy = 0 + (((tickAnim - 10) / 5) * (0-(0)));
            zz = -(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.75+60))*30) + (((tickAnim - 10) / 5) * (-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/2-30))*-10))-(-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.75+60))*30)));
        }
        else if (tickAnim >= 15 && tickAnim < 30) {
            xx = 0 + (((tickAnim - 15) / 15) * (0-(0)));
            yy = 0 + (((tickAnim - 15) / 15) * (0-(0)));
            zz = -(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/2-30))*-10) + (((tickAnim - 15) / 15) * (0-(-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/2-30))*-10))));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightHand, rightHand.rotateAngleX + (float) Math.toRadians(xx), rightHand.rotateAngleY + (float) Math.toRadians(yy), rightHand.rotateAngleZ + (float) Math.toRadians(zz));

    }



    public void animRunning(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime) {
        EntityPrehistoricFloraSinraptor entity = (EntityPrehistoricFloraSinraptor) entitylivingbaseIn;

        int animCycle = 20;
        double tickAnim = (entity.ticksExisted + entity.getTickOffset()) - (int) (Math.floor((double) (entity.ticksExisted + entity.getTickOffset()) / (double) animCycle) * (double) animCycle) + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;


        this.setRotateAngle(hips, hips.rotateAngleX + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*720-90))*2), hips.rotateAngleY + (float) Math.toRadians(-(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360+80))*3)), hips.rotateAngleZ + (float) Math.toRadians(-(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360+80))*2)));

        if (tickAnim >= 0 && tickAnim < 2) {
            xx = 0 + (((tickAnim - 0) / 2) * (0-(0)));
            yy = Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-90))*-1 + (((tickAnim - 0) / 2) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*720/0.3))*-0.25-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-90))*-1)));
            zz = Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-30))*1.5 + (((tickAnim - 0) / 2) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-30))*1.5-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-30))*1.5)));
        }
        else if (tickAnim >= 2 && tickAnim < 3) {
            xx = 0 + (((tickAnim - 2) / 1) * (0-(0)));
            yy = Math.sin((Math.PI/180)*(((double)tickAnim/20)*720/0.3))*-0.25 + (((tickAnim - 2) / 1) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-90))*-1-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*720/0.3))*-0.25)));
            zz = Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-30))*1.5 + (((tickAnim - 2) / 1) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-30))*1.5-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-30))*1.5)));
        }
        else if (tickAnim >= 3 && tickAnim < 11) {
            xx = 0 + (((tickAnim - 3) / 8) * (0-(0)));
            yy = Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-90))*-1 + (((tickAnim - 3) / 8) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-90))*-1-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-90))*-1)));
            zz = Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-30))*1.5 + (((tickAnim - 3) / 8) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-30))*1.5-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-30))*1.5)));
        }
        else if (tickAnim >= 11 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 11) / 2) * (0-(0)));
            yy = Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-90))*-1 + (((tickAnim - 11) / 2) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*720/0.3))*-0.25-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-90))*-1)));
            zz = Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-30))*1.5 + (((tickAnim - 11) / 2) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-30))*1.5-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-30))*1.5)));
        }
        else if (tickAnim >= 13 && tickAnim < 14) {
            xx = 0 + (((tickAnim - 13) / 1) * (0-(0)));
            yy = Math.sin((Math.PI/180)*(((double)tickAnim/20)*720/0.3))*-0.25 + (((tickAnim - 13) / 1) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-90))*-1-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*720/0.3))*-0.25)));
            zz = Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-30))*1.5 + (((tickAnim - 13) / 1) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-30))*1.5-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-30))*1.5)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.hips.rotationPointX = this.hips.rotationPointX + (float)(xx);
        this.hips.rotationPointY = this.hips.rotationPointY - (float)(yy);
        this.hips.rotationPointZ = this.hips.rotationPointZ + (float)(zz);



        this.setRotateAngle(tail2, tail2.rotateAngleX + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*720-30))*-1), tail2.rotateAngleY + (float) Math.toRadians(-(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360-30))*3)), tail2.rotateAngleZ + (float) Math.toRadians(-(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360-30))*-2)));

        if (tickAnim >= 0 && tickAnim < 2) {
            xx = 0 + (((tickAnim - 0) / 2) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 2) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*720/0.3))*0.05-(0)));
            zz = 0 + (((tickAnim - 0) / 2) * (0-(0)));
        }
        else if (tickAnim >= 2 && tickAnim < 3) {
            xx = 0 + (((tickAnim - 2) / 1) * (0-(0)));
            yy = Math.sin((Math.PI/180)*(((double)tickAnim/20)*720/0.3))*0.05 + (((tickAnim - 2) / 1) * (0-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*720/0.3))*0.05)));
            zz = 0 + (((tickAnim - 2) / 1) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 11) {
            xx = 0 + (((tickAnim - 3) / 8) * (0-(0)));
            yy = 0 + (((tickAnim - 3) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 3) / 8) * (0-(0)));
        }
        else if (tickAnim >= 11 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 11) / 2) * (0-(0)));
            yy = 0 + (((tickAnim - 11) / 2) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*720/0.3))*0.05-(0)));
            zz = 0 + (((tickAnim - 11) / 2) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 14) {
            xx = 0 + (((tickAnim - 13) / 1) * (0-(0)));
            yy = Math.sin((Math.PI/180)*(((double)tickAnim/20)*720/0.3))*0.05 + (((tickAnim - 13) / 1) * (0-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*720/0.3))*0.05)));
            zz = 0 + (((tickAnim - 13) / 1) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.tail2.rotationPointX = this.tail2.rotationPointX + (float)(xx);
        this.tail2.rotationPointY = this.tail2.rotationPointY - (float)(yy);
        this.tail2.rotationPointZ = this.tail2.rotationPointZ + (float)(zz);



        this.setRotateAngle(tail3, tail3.rotateAngleX + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*720+100))*1), tail3.rotateAngleY + (float) Math.toRadians(-(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360-50))*5)), tail3.rotateAngleZ + (float) Math.toRadians(-(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360-50))*-2)));

        if (tickAnim >= 0 && tickAnim < 2) {
            xx = 0 + (((tickAnim - 0) / 2) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 2) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*720/0.3))*0.05-(0)));
            zz = 0 + (((tickAnim - 0) / 2) * (0-(0)));
        }
        else if (tickAnim >= 2 && tickAnim < 3) {
            xx = 0 + (((tickAnim - 2) / 1) * (0-(0)));
            yy = Math.sin((Math.PI/180)*(((double)tickAnim/20)*720/0.3))*0.05 + (((tickAnim - 2) / 1) * (0-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*720/0.3))*0.05)));
            zz = 0 + (((tickAnim - 2) / 1) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 11) {
            xx = 0 + (((tickAnim - 3) / 8) * (0-(0)));
            yy = 0 + (((tickAnim - 3) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 3) / 8) * (0-(0)));
        }
        else if (tickAnim >= 11 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 11) / 2) * (0-(0)));
            yy = 0 + (((tickAnim - 11) / 2) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*720/0.3))*0.05-(0)));
            zz = 0 + (((tickAnim - 11) / 2) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 14) {
            xx = 0 + (((tickAnim - 13) / 1) * (0-(0)));
            yy = Math.sin((Math.PI/180)*(((double)tickAnim/20)*720/0.3))*0.05 + (((tickAnim - 13) / 1) * (0-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*720/0.3))*0.05)));
            zz = 0 + (((tickAnim - 13) / 1) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.tail3.rotationPointX = this.tail3.rotationPointX + (float)(xx);
        this.tail3.rotationPointY = this.tail3.rotationPointY - (float)(yy);
        this.tail3.rotationPointZ = this.tail3.rotationPointZ + (float)(zz);



        this.setRotateAngle(tail4, tail4.rotateAngleX + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*720+130))*1), tail4.rotateAngleY + (float) Math.toRadians(-(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360-70))*5)), tail4.rotateAngleZ + (float) Math.toRadians(-(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360-70))*-2)));

        if (tickAnim >= 0 && tickAnim < 2) {
            xx = 0 + (((tickAnim - 0) / 2) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 2) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*720/0.3))*0.05-(0)));
            zz = 0 + (((tickAnim - 0) / 2) * (0-(0)));
        }
        else if (tickAnim >= 2 && tickAnim < 3) {
            xx = 0 + (((tickAnim - 2) / 1) * (0-(0)));
            yy = Math.sin((Math.PI/180)*(((double)tickAnim/20)*720/0.3))*0.05 + (((tickAnim - 2) / 1) * (0-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*720/0.3))*0.05)));
            zz = 0 + (((tickAnim - 2) / 1) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 11) {
            xx = 0 + (((tickAnim - 3) / 8) * (0-(0)));
            yy = 0 + (((tickAnim - 3) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 3) / 8) * (0-(0)));
        }
        else if (tickAnim >= 11 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 11) / 2) * (0-(0)));
            yy = 0 + (((tickAnim - 11) / 2) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*720/0.3))*0.05-(0)));
            zz = 0 + (((tickAnim - 11) / 2) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 14) {
            xx = 0 + (((tickAnim - 13) / 1) * (0-(0)));
            yy = Math.sin((Math.PI/180)*(((double)tickAnim/20)*720/0.3))*0.05 + (((tickAnim - 13) / 1) * (0-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*720/0.3))*0.05)));
            zz = 0 + (((tickAnim - 13) / 1) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.tail4.rotationPointX = this.tail4.rotationPointX + (float)(xx);
        this.tail4.rotationPointY = this.tail4.rotationPointY - (float)(yy);
        this.tail4.rotationPointZ = this.tail4.rotationPointZ + (float)(zz);



        this.setRotateAngle(tail5, tail5.rotateAngleX + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*720+150))*1), tail5.rotateAngleY + (float) Math.toRadians(-(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360-90))*5)), tail5.rotateAngleZ + (float) Math.toRadians(-(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360-90))*-2)));

        if (tickAnim >= 0 && tickAnim < 2) {
            xx = 0 + (((tickAnim - 0) / 2) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 2) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*720/0.3))*0.05-(0)));
            zz = 0 + (((tickAnim - 0) / 2) * (0-(0)));
        }
        else if (tickAnim >= 2 && tickAnim < 3) {
            xx = 0 + (((tickAnim - 2) / 1) * (0-(0)));
            yy = Math.sin((Math.PI/180)*(((double)tickAnim/20)*720/0.3))*0.05 + (((tickAnim - 2) / 1) * (0-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*720/0.3))*0.05)));
            zz = 0 + (((tickAnim - 2) / 1) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 11) {
            xx = 0 + (((tickAnim - 3) / 8) * (0-(0)));
            yy = 0 + (((tickAnim - 3) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 3) / 8) * (0-(0)));
        }
        else if (tickAnim >= 11 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 11) / 2) * (0-(0)));
            yy = 0 + (((tickAnim - 11) / 2) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*720/0.3))*0.05-(0)));
            zz = 0 + (((tickAnim - 11) / 2) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 14) {
            xx = 0 + (((tickAnim - 13) / 1) * (0-(0)));
            yy = Math.sin((Math.PI/180)*(((double)tickAnim/20)*720/0.3))*0.05 + (((tickAnim - 13) / 1) * (0-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*720/0.3))*0.05)));
            zz = 0 + (((tickAnim - 13) / 1) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.tail5.rotationPointX = this.tail5.rotationPointX + (float)(xx);
        this.tail5.rotationPointY = this.tail5.rotationPointY - (float)(yy);
        this.tail5.rotationPointZ = this.tail5.rotationPointZ + (float)(zz);



        this.setRotateAngle(tail6, tail6.rotateAngleX + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*720+160))*1), tail6.rotateAngleY + (float) Math.toRadians(-(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360-120))*5)), tail6.rotateAngleZ + (float) Math.toRadians(-(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360-120))*-2)));


        this.setRotateAngle(body, body.rotateAngleX + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*720-20))*-2), body.rotateAngleY + (float) Math.toRadians(-(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360+60))*-2)), body.rotateAngleZ + (float) Math.toRadians(-(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360+60))*-2)));

        if (tickAnim >= 0 && tickAnim < 2) {
            xx = 0 + (((tickAnim - 0) / 2) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 2) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*720/0.3))*0.25-(0)));
            zz = 0 + (((tickAnim - 0) / 2) * (0-(0)));
        }
        else if (tickAnim >= 2 && tickAnim < 3) {
            xx = 0 + (((tickAnim - 2) / 1) * (0-(0)));
            yy = Math.sin((Math.PI/180)*(((double)tickAnim/20)*720/0.3))*0.25 + (((tickAnim - 2) / 1) * (0-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*720/0.3))*0.25)));
            zz = 0 + (((tickAnim - 2) / 1) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 11) {
            xx = 0 + (((tickAnim - 3) / 8) * (0-(0)));
            yy = 0 + (((tickAnim - 3) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 3) / 8) * (0-(0)));
        }
        else if (tickAnim >= 11 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 11) / 2) * (0-(0)));
            yy = 0 + (((tickAnim - 11) / 2) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*720/0.3))*0.25-(0)));
            zz = 0 + (((tickAnim - 11) / 2) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 14) {
            xx = 0 + (((tickAnim - 13) / 1) * (0-(0)));
            yy = Math.sin((Math.PI/180)*(((double)tickAnim/20)*720/0.3))*0.25 + (((tickAnim - 13) / 1) * (0-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*720/0.3))*0.25)));
            zz = 0 + (((tickAnim - 13) / 1) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.body.rotationPointX = this.body.rotationPointX + (float)(xx);
        this.body.rotationPointY = this.body.rotationPointY - (float)(yy);
        this.body.rotationPointZ = this.body.rotationPointZ + (float)(zz);



        this.setRotateAngle(body2, body2.rotateAngleX + (float) Math.toRadians(-2+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*720+50))*2), body2.rotateAngleY + (float) Math.toRadians(-(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360+90))*-3)), body2.rotateAngleZ + (float) Math.toRadians(-(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360+90))*-2)));

        if (tickAnim >= 0 && tickAnim < 2) {
            xx = 0 + (((tickAnim - 0) / 2) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 2) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*720/0.3))*0.1-(0)));
            zz = 0 + (((tickAnim - 0) / 2) * (0-(0)));
        }
        else if (tickAnim >= 2 && tickAnim < 3) {
            xx = 0 + (((tickAnim - 2) / 1) * (0-(0)));
            yy = Math.sin((Math.PI/180)*(((double)tickAnim/20)*720/0.3))*0.1 + (((tickAnim - 2) / 1) * (0-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*720/0.3))*0.1)));
            zz = 0 + (((tickAnim - 2) / 1) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 11) {
            xx = 0 + (((tickAnim - 3) / 8) * (0-(0)));
            yy = 0 + (((tickAnim - 3) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 3) / 8) * (0-(0)));
        }
        else if (tickAnim >= 11 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 11) / 2) * (0-(0)));
            yy = 0 + (((tickAnim - 11) / 2) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*720/0.3))*-0.1-(0)));
            zz = 0 + (((tickAnim - 11) / 2) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 14) {
            xx = 0 + (((tickAnim - 13) / 1) * (0-(0)));
            yy = Math.sin((Math.PI/180)*(((double)tickAnim/20)*720/0.3))*-0.1 + (((tickAnim - 13) / 1) * (0-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*720/0.3))*-0.1)));
            zz = 0 + (((tickAnim - 13) / 1) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.body2.rotationPointX = this.body2.rotationPointX + (float)(xx);
        this.body2.rotationPointY = this.body2.rotationPointY - (float)(yy);
        this.body2.rotationPointZ = this.body2.rotationPointZ + (float)(zz);



        this.setRotateAngle(neck2, neck2.rotateAngleX + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*720+80))*3), neck2.rotateAngleY + (float) Math.toRadians(-(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360+30))*1)), neck2.rotateAngleZ + (float) Math.toRadians(-(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360+30))*1)));


        this.setRotateAngle(neck3, neck3.rotateAngleX + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*720+30))*-3), neck3.rotateAngleY + (float) Math.toRadians(-(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360-60))*-3)), neck3.rotateAngleZ + (float) Math.toRadians(-(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360-60))*-2)));


        this.setRotateAngle(head, head.rotateAngleX + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*720+90))*1), head.rotateAngleY + (float) Math.toRadians(-(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360-50))*-2)), head.rotateAngleZ + (float) Math.toRadians(-(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360-50))*1)));


        this.setRotateAngle(throat, throat.rotateAngleX + (float) Math.toRadians(2+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*720+100))*-2), throat.rotateAngleY + (float) Math.toRadians(-(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360-50))*2)), throat.rotateAngleZ + (float) Math.toRadians(-(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360-50))*-1)));


        this.setRotateAngle(leftarm2, leftarm2.rotateAngleX + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360+60))*-5), leftarm2.rotateAngleY + (float) Math.toRadians(0), leftarm2.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(rightarm2, rightarm2.rotateAngleX + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360+30))*-5), rightarm2.rotateAngleY + (float) Math.toRadians(0), rightarm2.rotateAngleZ + (float) Math.toRadians(0));



        if (tickAnim >= 0 && tickAnim < 4) {
            xx = 15 + (((tickAnim - 0) / 4) * (-10-(15)));
            yy = 5 + (((tickAnim - 0) / 4) * (5-(5)));
            zz = 5 + (((tickAnim - 0) / 4) * (5-(5)));
        }
        else if (tickAnim >= 4 && tickAnim < 8) {
            xx = -10 + (((tickAnim - 4) / 4) * (-27.5-(-10)));
            yy = 5 + (((tickAnim - 4) / 4) * (5-(5)));
            zz = 5 + (((tickAnim - 4) / 4) * (5-(5)));
        }
        else if (tickAnim >= 8 && tickAnim < 11) {
            xx = -27.5 + (((tickAnim - 8) / 3) * (-10.52076-(-27.5)));
            yy = 5 + (((tickAnim - 8) / 3) * (-3.58007-(5)));
            zz = 5 + (((tickAnim - 8) / 3) * (2.38188-(5)));
        }
        else if (tickAnim >= 11 && tickAnim < 13) {
            xx = -10.52076 + (((tickAnim - 11) / 2) * (-6.24698-(-10.52076)));
            yy = -3.58007 + (((tickAnim - 11) / 2) * (-3.16626-(-3.58007)));
            zz = 2.38188 + (((tickAnim - 11) / 2) * (0.47604-(2.38188)));
        }
        else if (tickAnim >= 13 && tickAnim < 14) {
            xx = -6.24698 + (((tickAnim - 13) / 1) * (-2.91291-(-6.24698)));
            yy = -3.16626 + (((tickAnim - 13) / 1) * (-0.53485-(-3.16626)));
            zz = 0.47604 + (((tickAnim - 13) / 1) * (-0.04391-(0.47604)));
        }
        else if (tickAnim >= 14 && tickAnim < 16) {
            xx = -2.91291 + (((tickAnim - 14) / 2) * (5.9981-(-2.91291)));
            yy = -0.53485 + (((tickAnim - 14) / 2) * (0.24688-(-0.53485)));
            zz = -0.04391 + (((tickAnim - 14) / 2) * (0.17279-(-0.04391)));
        }
        else if (tickAnim >= 16 && tickAnim < 18) {
            xx = 5.9981 + (((tickAnim - 16) / 2) * (15.084-(5.9981)));
            yy = 0.24688 + (((tickAnim - 16) / 2) * (1.28584-(0.24688)));
            zz = 0.17279 + (((tickAnim - 16) / 2) * (4.90277-(0.17279)));
        }
        else if (tickAnim >= 18 && tickAnim < 20) {
            xx = 15.084 + (((tickAnim - 18) / 2) * (15-(15.084)));
            yy = 1.28584 + (((tickAnim - 18) / 2) * (5-(1.28584)));
            zz = 4.90277 + (((tickAnim - 18) / 2) * (5-(4.90277)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftLeg, leftLeg.rotateAngleX + (float) Math.toRadians(xx), leftLeg.rotateAngleY + (float) Math.toRadians(yy), leftLeg.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 4) {
            xx = 0 + (((tickAnim - 0) / 4) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 4) * (1-(0)));
            zz = 0 + (((tickAnim - 0) / 4) * (0-(0)));
        }
        else if (tickAnim >= 4 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 4) / 4) * (0-(0)));
            yy = 1 + (((tickAnim - 4) / 4) * (0-(1)));
            zz = 0 + (((tickAnim - 4) / 4) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 11) {
            xx = 0 + (((tickAnim - 8) / 3) * (0-(0)));
            yy = 0 + (((tickAnim - 8) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 3) * (0-(0)));
        }
        else if (tickAnim >= 11 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 11) / 2) * (0-(0)));
            yy = 0 + (((tickAnim - 11) / 2) * (0.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720/0.3))*-0.5-(0)));
            zz = 0 + (((tickAnim - 11) / 2) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 14) {
            xx = 0 + (((tickAnim - 13) / 1) * (0-(0)));
            yy = 0.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720/0.3))*-0.5 + (((tickAnim - 13) / 1) * (-0.5-(0.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720/0.3))*-0.5)));
            zz = 0 + (((tickAnim - 13) / 1) * (0-(0)));
        }
        else if (tickAnim >= 14 && tickAnim < 16) {
            xx = 0 + (((tickAnim - 14) / 2) * (0-(0)));
            yy = -0.5 + (((tickAnim - 14) / 2) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*720/0.3))*0.5-(-0.5)));
            zz = 0 + (((tickAnim - 14) / 2) * (0-(0)));
        }
        else if (tickAnim >= 16 && tickAnim < 18) {
            xx = 0 + (((tickAnim - 16) / 2) * (0-(0)));
            yy = Math.sin((Math.PI/180)*(((double)tickAnim/20)*720/0.3))*0.5 + (((tickAnim - 16) / 2) * (-1-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*720/0.3))*0.5)));
            zz = 0 + (((tickAnim - 16) / 2) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 18) / 2) * (0-(0)));
            yy = -1 + (((tickAnim - 18) / 2) * (0-(-1)));
            zz = 0 + (((tickAnim - 18) / 2) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.leftLeg.rotationPointX = this.leftLeg.rotationPointX + (float)(xx);
        this.leftLeg.rotationPointY = this.leftLeg.rotationPointY - (float)(yy);
        this.leftLeg.rotationPointZ = this.leftLeg.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 4) {
            xx = 35.18792 + (((tickAnim - 0) / 4) * (41.54386-(35.18792)));
            yy = -2.48335 + (((tickAnim - 0) / 4) * (-1.51245-(-2.48335)));
            zz = -3.65332 + (((tickAnim - 0) / 4) * (-4.68961-(-3.65332)));
        }
        else if (tickAnim >= 4 && tickAnim < 8) {
            xx = 41.54386 + (((tickAnim - 4) / 4) * (30.81265-(41.54386)));
            yy = -1.51245 + (((tickAnim - 4) / 4) * (-4.36021-(-1.51245)));
            zz = -4.68961 + (((tickAnim - 4) / 4) * (-7.69565-(-4.68961)));
        }
        else if (tickAnim >= 8 && tickAnim < 11) {
            xx = 30.81265 + (((tickAnim - 8) / 3) * (-19.85147-(30.81265)));
            yy = -4.36021 + (((tickAnim - 8) / 3) * (-0.62712-(-4.36021)));
            zz = -7.69565 + (((tickAnim - 8) / 3) * (-7.9387-(-7.69565)));
        }
        else if (tickAnim >= 11 && tickAnim < 14) {
            xx = -19.85147 + (((tickAnim - 11) / 3) * (7.40477-(-19.85147)));
            yy = -0.62712 + (((tickAnim - 11) / 3) * (-0.40788-(-0.62712)));
            zz = -7.9387 + (((tickAnim - 11) / 3) * (-2.63609-(-7.9387)));
        }
        else if (tickAnim >= 14 && tickAnim < 18) {
            xx = 7.40477 + (((tickAnim - 14) / 4) * (12.4948-(7.40477)));
            yy = -0.40788 + (((tickAnim - 14) / 4) * (-0.22098-(-0.40788)));
            zz = -2.63609 + (((tickAnim - 14) / 4) * (-4.9955-(-2.63609)));
        }
        else if (tickAnim >= 18 && tickAnim < 20) {
            xx = 12.4948 + (((tickAnim - 18) / 2) * (35.18792-(12.4948)));
            yy = -0.22098 + (((tickAnim - 18) / 2) * (-2.48335-(-0.22098)));
            zz = -4.9955 + (((tickAnim - 18) / 2) * (-3.65332-(-4.9955)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftLeg2, leftLeg2.rotateAngleX + (float) Math.toRadians(xx), leftLeg2.rotateAngleY + (float) Math.toRadians(yy), leftLeg2.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 4) {
            xx = 0.35 + (((tickAnim - 0) / 4) * (0.585-(0.35)));
            yy = 0 + (((tickAnim - 0) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 4) * (0-(0)));
        }
        else if (tickAnim >= 4 && tickAnim < 8) {
            xx = 0.585 + (((tickAnim - 4) / 4) * (1.16-(0.585)));
            yy = 0 + (((tickAnim - 4) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 4) / 4) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 11) {
            xx = 1.16 + (((tickAnim - 8) / 3) * (0.325-(1.16)));
            yy = 0 + (((tickAnim - 8) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 3) * (0-(0)));
        }
        else if (tickAnim >= 11 && tickAnim < 13) {
            xx = 0.325 + (((tickAnim - 11) / 2) * (0-(0.325)));
            yy = 0 + (((tickAnim - 11) / 2) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*720/0.3))*0.5-(0)));
            zz = 0 + (((tickAnim - 11) / 2) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 14) {
            xx = 0 + (((tickAnim - 13) / 1) * (0-(0)));
            yy = Math.sin((Math.PI/180)*(((double)tickAnim/20)*720/0.3))*0.5 + (((tickAnim - 13) / 1) * (0-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*720/0.3))*0.5)));
            zz = 0 + (((tickAnim - 13) / 1) * (0-(0)));
        }
        else if (tickAnim >= 14 && tickAnim < 16) {
            xx = 0 + (((tickAnim - 14) / 2) * (0-(0)));
            yy = 0 + (((tickAnim - 14) / 2) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*720/0.3))*-0.5-(0)));
            zz = 0 + (((tickAnim - 14) / 2) * (0-(0)));
        }
        else if (tickAnim >= 16 && tickAnim < 18) {
            xx = 0 + (((tickAnim - 16) / 2) * (0.525-(0)));
            yy = Math.sin((Math.PI/180)*(((double)tickAnim/20)*720/0.3))*-0.5 + (((tickAnim - 16) / 2) * (0-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*720/0.3))*-0.5)));
            zz = 0 + (((tickAnim - 16) / 2) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 20) {
            xx = 0.525 + (((tickAnim - 18) / 2) * (0.35-(0.525)));
            yy = 0 + (((tickAnim - 18) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 18) / 2) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.leftLeg2.rotationPointX = this.leftLeg2.rotationPointX + (float)(xx);
        this.leftLeg2.rotationPointY = this.leftLeg2.rotationPointY - (float)(yy);
        this.leftLeg2.rotationPointZ = this.leftLeg2.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 4) {
            xx = 10 + (((tickAnim - 0) / 4) * (-32.5-(10)));
            yy = 0 + (((tickAnim - 0) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 4) * (0-(0)));
        }
        else if (tickAnim >= 4 && tickAnim < 8) {
            xx = -32.5 + (((tickAnim - 4) / 4) * (-27.5-(-32.5)));
            yy = 0 + (((tickAnim - 4) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 4) / 4) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 11) {
            xx = -27.5 + (((tickAnim - 8) / 3) * (27.5-(-27.5)));
            yy = 0 + (((tickAnim - 8) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 3) * (0-(0)));
        }
        else if (tickAnim >= 11 && tickAnim < 14) {
            xx = 27.5 + (((tickAnim - 11) / 3) * (-2.5-(27.5)));
            yy = 0 + (((tickAnim - 11) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 11) / 3) * (0-(0)));
        }
        else if (tickAnim >= 14 && tickAnim < 18) {
            xx = -2.5 + (((tickAnim - 14) / 4) * (25-(-2.5)));
            yy = 0 + (((tickAnim - 14) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 14) / 4) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 20) {
            xx = 25 + (((tickAnim - 18) / 2) * (10-(25)));
            yy = 0 + (((tickAnim - 18) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 18) / 2) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftLeg3, leftLeg3.rotateAngleX + (float) Math.toRadians(xx), leftLeg3.rotateAngleY + (float) Math.toRadians(yy), leftLeg3.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 11 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 11) / 2) * (0-(0)));
            yy = 0 + (((tickAnim - 11) / 2) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*720/0.3))*0.25-(0)));
            zz = 0 + (((tickAnim - 11) / 2) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 14) {
            xx = 0 + (((tickAnim - 13) / 1) * (0-(0)));
            yy = Math.sin((Math.PI/180)*(((double)tickAnim/20)*720/0.3))*0.25 + (((tickAnim - 13) / 1) * (0-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*720/0.3))*0.25)));
            zz = 0 + (((tickAnim - 13) / 1) * (0-(0)));
        }
        else if (tickAnim >= 14 && tickAnim < 16) {
            xx = 0 + (((tickAnim - 14) / 2) * (0-(0)));
            yy = 0 + (((tickAnim - 14) / 2) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*720/0.3))*-0.25-(0)));
            zz = 0 + (((tickAnim - 14) / 2) * (0-(0)));
        }
        else if (tickAnim >= 16 && tickAnim < 18) {
            xx = 0 + (((tickAnim - 16) / 2) * (0-(0)));
            yy = Math.sin((Math.PI/180)*(((double)tickAnim/20)*720/0.3))*-0.25 + (((tickAnim - 16) / 2) * (0-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*720/0.3))*-0.25)));
            zz = 0 + (((tickAnim - 16) / 2) * (0-(0)));
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
            xx = 60 + (((tickAnim - 0) / 4) * (90-(60)));
            yy = 0 + (((tickAnim - 0) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 4) * (0-(0)));
        }
        else if (tickAnim >= 4 && tickAnim < 8) {
            xx = 90 + (((tickAnim - 4) / 4) * (60-(90)));
            yy = 0 + (((tickAnim - 4) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 4) / 4) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 11) {
            xx = 60 + (((tickAnim - 8) / 3) * (5-(60)));
            yy = 0 + (((tickAnim - 8) / 3) * (2.5-(0)));
            zz = 0 + (((tickAnim - 8) / 3) * (2.5-(0)));
        }
        else if (tickAnim >= 11 && tickAnim < 14) {
            xx = 5 + (((tickAnim - 11) / 3) * (-2.5-(5)));
            yy = 2.5 + (((tickAnim - 11) / 3) * (0-(2.5)));
            zz = 2.5 + (((tickAnim - 11) / 3) * (0-(2.5)));
        }
        else if (tickAnim >= 14 && tickAnim < 18) {
            xx = -2.5 + (((tickAnim - 14) / 4) * (15-(-2.5)));
            yy = 0 + (((tickAnim - 14) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 14) / 4) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 20) {
            xx = 15 + (((tickAnim - 18) / 2) * (60-(15)));
            yy = 0 + (((tickAnim - 18) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 18) / 2) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftLeg4, leftLeg4.rotateAngleX + (float) Math.toRadians(xx), leftLeg4.rotateAngleY + (float) Math.toRadians(yy), leftLeg4.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 4) {
            xx = 35 + (((tickAnim - 0) / 4) * (47.5-(35)));
            yy = 0 + (((tickAnim - 0) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 4) * (0-(0)));
        }
        else if (tickAnim >= 4 && tickAnim < 8) {
            xx = 47.5 + (((tickAnim - 4) / 4) * (35-(47.5)));
            yy = 0 + (((tickAnim - 4) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 4) / 4) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 11) {
            xx = 35 + (((tickAnim - 8) / 3) * (2.5-(35)));
            yy = 0 + (((tickAnim - 8) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 3) * (0-(0)));
        }
        else if (tickAnim >= 11 && tickAnim < 14) {
            xx = 2.5 + (((tickAnim - 11) / 3) * (0-(2.5)));
            yy = 0 + (((tickAnim - 11) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 11) / 3) * (0-(0)));
        }
        else if (tickAnim >= 14 && tickAnim < 18) {
            xx = 0 + (((tickAnim - 14) / 4) * (-55-(0)));
            yy = 0 + (((tickAnim - 14) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 14) / 4) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 20) {
            xx = -55 + (((tickAnim - 18) / 2) * (35-(-55)));
            yy = 0 + (((tickAnim - 18) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 18) / 2) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftLeg5, leftLeg5.rotateAngleX + (float) Math.toRadians(xx), leftLeg5.rotateAngleY + (float) Math.toRadians(yy), leftLeg5.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 3) {
            xx = -10.44872 + (((tickAnim - 0) / 3) * (-3.39838-(-10.44872)));
            yy = 4.26191 + (((tickAnim - 0) / 3) * (1.38934-(4.26191)));
            zz = -4.8031 + (((tickAnim - 0) / 3) * (-2.32639-(-4.8031)));
        }
        else if (tickAnim >= 3 && tickAnim < 7) {
            xx = -3.39838 + (((tickAnim - 3) / 4) * (14.44319-(-3.39838)));
            yy = 1.38934 + (((tickAnim - 3) / 4) * (-1.11587-(1.38934)));
            zz = -2.32639 + (((tickAnim - 3) / 4) * (-4.83277-(-2.32639)));
        }
        else if (tickAnim >= 7 && tickAnim < 9) {
            xx = 14.44319 + (((tickAnim - 7) / 2) * (15-(14.44319)));
            yy = -1.11587 + (((tickAnim - 7) / 2) * (-5-(-1.11587)));
            zz = -4.83277 + (((tickAnim - 7) / 2) * (-5-(-4.83277)));
        }
        else if (tickAnim >= 9 && tickAnim < 13) {
            xx = 15 + (((tickAnim - 9) / 4) * (-10-(15)));
            yy = -5 + (((tickAnim - 9) / 4) * (-5-(-5)));
            zz = -5 + (((tickAnim - 9) / 4) * (-5-(-5)));
        }
        else if (tickAnim >= 13 && tickAnim < 18) {
            xx = -10 + (((tickAnim - 13) / 5) * (-27.5-(-10)));
            yy = -5 + (((tickAnim - 13) / 5) * (-5-(-5)));
            zz = -5 + (((tickAnim - 13) / 5) * (-5-(-5)));
        }
        else if (tickAnim >= 18 && tickAnim < 20) {
            xx = -27.5 + (((tickAnim - 18) / 2) * (-10.44872-(-27.5)));
            yy = -5 + (((tickAnim - 18) / 2) * (4.26191-(-5)));
            zz = -5 + (((tickAnim - 18) / 2) * (-4.8031-(-5)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightLeg, rightLeg.rotateAngleX + (float) Math.toRadians(xx), rightLeg.rotateAngleY + (float) Math.toRadians(yy), rightLeg.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 2) {
            xx = 0 + (((tickAnim - 0) / 2) * (0-(0)));
            yy = -0.725 + (((tickAnim - 0) / 2) * (-0.375+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720/0.3))*-0.5-(-0.725)));
            zz = 0 + (((tickAnim - 0) / 2) * (0-(0)));
        }
        else if (tickAnim >= 2 && tickAnim < 3) {
            xx = 0 + (((tickAnim - 2) / 1) * (0-(0)));
            yy = -0.375+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720/0.3))*-0.5 + (((tickAnim - 2) / 1) * (-1.35-(-0.375+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720/0.3))*-0.5)));
            zz = 0 + (((tickAnim - 2) / 1) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 3) / 2) * (0-(0)));
            yy = -1.35 + (((tickAnim - 3) / 2) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*720/0.3))*0.5-(-1.35)));
            zz = 0 + (((tickAnim - 3) / 2) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 7) {
            xx = 0 + (((tickAnim - 5) / 2) * (0-(0)));
            yy = Math.sin((Math.PI/180)*(((double)tickAnim/20)*720/0.3))*0.5 + (((tickAnim - 5) / 2) * (-1-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*720/0.3))*0.5)));
            zz = 0 + (((tickAnim - 5) / 2) * (0-(0)));
        }
        else if (tickAnim >= 7 && tickAnim < 9) {
            xx = 0 + (((tickAnim - 7) / 2) * (0-(0)));
            yy = -1 + (((tickAnim - 7) / 2) * (0-(-1)));
            zz = 0 + (((tickAnim - 7) / 2) * (0-(0)));
        }
        else if (tickAnim >= 9 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 9) / 4) * (0-(0)));
            yy = 0 + (((tickAnim - 9) / 4) * (1-(0)));
            zz = 0 + (((tickAnim - 9) / 4) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 18) {
            xx = 0 + (((tickAnim - 13) / 5) * (0-(0)));
            yy = 1 + (((tickAnim - 13) / 5) * (0-(1)));
            zz = 0 + (((tickAnim - 13) / 5) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 18) / 2) * (0-(0)));
            yy = 0 + (((tickAnim - 18) / 2) * (-0.725-(0)));
            zz = 0 + (((tickAnim - 18) / 2) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.rightLeg.rotationPointX = this.rightLeg.rotationPointX + (float)(xx);
        this.rightLeg.rotationPointY = this.rightLeg.rotationPointY - (float)(yy);
        this.rightLeg.rotationPointZ = this.rightLeg.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 3) {
            xx = -19.83402 + (((tickAnim - 0) / 3) * (7.1166-(-19.83402)));
            yy = -1.82606 + (((tickAnim - 0) / 3) * (1.78172-(-1.82606)));
            zz = 8.14828 + (((tickAnim - 0) / 3) * (4.7728-(8.14828)));
        }
        else if (tickAnim >= 3 && tickAnim < 5) {
            xx = 7.1166 + (((tickAnim - 3) / 2) * (9.74948-(7.1166)));
            yy = 1.78172 + (((tickAnim - 3) / 2) * (0.2183-(1.78172)));
            zz = 4.7728 + (((tickAnim - 3) / 2) * (6.05169-(4.7728)));
        }
        else if (tickAnim >= 5 && tickAnim < 7) {
            xx = 9.74948 + (((tickAnim - 5) / 2) * (12.87779-(9.74948)));
            yy = 0.2183 + (((tickAnim - 5) / 2) * (1.33166-(0.2183)));
            zz = 6.05169 + (((tickAnim - 5) / 2) * (6.01169-(6.05169)));
        }
        else if (tickAnim >= 7 && tickAnim < 9) {
            xx = 12.87779 + (((tickAnim - 7) / 2) * (35.10575-(12.87779)));
            yy = 1.33166 + (((tickAnim - 7) / 2) * (1.86562-(1.33166)));
            zz = 6.01169 + (((tickAnim - 7) / 2) * (1.48821-(6.01169)));
        }
        else if (tickAnim >= 9 && tickAnim < 13) {
            xx = 35.10575 + (((tickAnim - 9) / 4) * (42.5-(35.10575)));
            yy = 1.86562 + (((tickAnim - 9) / 4) * (0-(1.86562)));
            zz = 1.48821 + (((tickAnim - 9) / 4) * (-2.5-(1.48821)));
        }
        else if (tickAnim >= 13 && tickAnim < 18) {
            xx = 42.5 + (((tickAnim - 13) / 5) * (27.5-(42.5)));
            yy = 0 + (((tickAnim - 13) / 5) * (0-(0)));
            zz = -2.5 + (((tickAnim - 13) / 5) * (-2.5-(-2.5)));
        }
        else if (tickAnim >= 18 && tickAnim < 20) {
            xx = 27.5 + (((tickAnim - 18) / 2) * (-19.83402-(27.5)));
            yy = 0 + (((tickAnim - 18) / 2) * (-1.82606-(0)));
            zz = -2.5 + (((tickAnim - 18) / 2) * (8.14828-(-2.5)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightLeg2, rightLeg2.rotateAngleX + (float) Math.toRadians(xx), rightLeg2.rotateAngleY + (float) Math.toRadians(yy), rightLeg2.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 2) {
            xx = -0.275 + (((tickAnim - 0) / 2) * (0-(-0.275)));
            yy = 0 + (((tickAnim - 0) / 2) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*720/0.3))*0.5-(0)));
            zz = 0 + (((tickAnim - 0) / 2) * (0-(0)));
        }
        else if (tickAnim >= 2 && tickAnim < 3) {
            xx = 0 + (((tickAnim - 2) / 1) * (-0.375-(0)));
            yy = Math.sin((Math.PI/180)*(((double)tickAnim/20)*720/0.3))*0.5 + (((tickAnim - 2) / 1) * (0-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*720/0.3))*0.5)));
            zz = 0 + (((tickAnim - 2) / 1) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 5) {
            xx = -0.375 + (((tickAnim - 3) / 2) * (-0.275-(-0.375)));
            yy = 0 + (((tickAnim - 3) / 2) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*720/0.3))*-0.5-(0)));
            zz = 0 + (((tickAnim - 3) / 2) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 7) {
            xx = -0.275 + (((tickAnim - 5) / 2) * (-0.55-(-0.275)));
            yy = Math.sin((Math.PI/180)*(((double)tickAnim/20)*720/0.3))*-0.5 + (((tickAnim - 5) / 2) * (0-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*720/0.3))*-0.5)));
            zz = 0 + (((tickAnim - 5) / 2) * (0-(0)));
        }
        else if (tickAnim >= 7 && tickAnim < 20) {
            xx = -0.55 + (((tickAnim - 7) / 13) * (-0.275-(-0.55)));
            yy = 0 + (((tickAnim - 7) / 13) * (0-(0)));
            zz = 0 + (((tickAnim - 7) / 13) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.rightLeg2.rotationPointX = this.rightLeg2.rotationPointX + (float)(xx);
        this.rightLeg2.rotationPointY = this.rightLeg2.rotationPointY - (float)(yy);
        this.rightLeg2.rotationPointZ = this.rightLeg2.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 27.5 + (((tickAnim - 0) / 3) * (-2.5-(27.5)));
            yy = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 3) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 7) {
            xx = -2.5 + (((tickAnim - 3) / 4) * (25-(-2.5)));
            yy = 0 + (((tickAnim - 3) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 3) / 4) * (0-(0)));
        }
        else if (tickAnim >= 7 && tickAnim < 9) {
            xx = 25 + (((tickAnim - 7) / 2) * (10-(25)));
            yy = 0 + (((tickAnim - 7) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 7) / 2) * (0-(0)));
        }
        else if (tickAnim >= 9 && tickAnim < 13) {
            xx = 10 + (((tickAnim - 9) / 4) * (-32.5-(10)));
            yy = 0 + (((tickAnim - 9) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 9) / 4) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 18) {
            xx = -32.5 + (((tickAnim - 13) / 5) * (-27.5-(-32.5)));
            yy = 0 + (((tickAnim - 13) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 13) / 5) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 20) {
            xx = -27.5 + (((tickAnim - 18) / 2) * (27.5-(-27.5)));
            yy = 0 + (((tickAnim - 18) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 18) / 2) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightLeg3, rightLeg3.rotateAngleX + (float) Math.toRadians(xx), rightLeg3.rotateAngleY + (float) Math.toRadians(yy), rightLeg3.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 2) {
            xx = 0 + (((tickAnim - 0) / 2) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 2) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*720/0.3))*0.25-(0)));
            zz = 0 + (((tickAnim - 0) / 2) * (0-(0)));
        }
        else if (tickAnim >= 2 && tickAnim < 3) {
            xx = 0 + (((tickAnim - 2) / 1) * (0-(0)));
            yy = Math.sin((Math.PI/180)*(((double)tickAnim/20)*720/0.3))*0.25 + (((tickAnim - 2) / 1) * (0-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*720/0.3))*0.25)));
            zz = 0 + (((tickAnim - 2) / 1) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 3) / 2) * (0-(0)));
            yy = 0 + (((tickAnim - 3) / 2) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*720/0.3))*-0.25-(0)));
            zz = 0 + (((tickAnim - 3) / 2) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 7) {
            xx = 0 + (((tickAnim - 5) / 2) * (0-(0)));
            yy = Math.sin((Math.PI/180)*(((double)tickAnim/20)*720/0.3))*-0.25 + (((tickAnim - 5) / 2) * (0-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*720/0.3))*-0.25)));
            zz = 0 + (((tickAnim - 5) / 2) * (0-(0)));
        }
        else if (tickAnim >= 7 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 7) / 13) * (0-(0)));
            yy = 0 + (((tickAnim - 7) / 13) * (0-(0)));
            zz = 0 + (((tickAnim - 7) / 13) * (0-(0)));
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
            xx = 5 + (((tickAnim - 0) / 3) * (-2.5-(5)));
            yy = -2.5 + (((tickAnim - 0) / 3) * (0-(-2.5)));
            zz = -2.5 + (((tickAnim - 0) / 3) * (0-(-2.5)));
        }
        else if (tickAnim >= 3 && tickAnim < 7) {
            xx = -2.5 + (((tickAnim - 3) / 4) * (15-(-2.5)));
            yy = 0 + (((tickAnim - 3) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 3) / 4) * (0-(0)));
        }
        else if (tickAnim >= 7 && tickAnim < 9) {
            xx = 15 + (((tickAnim - 7) / 2) * (60-(15)));
            yy = 0 + (((tickAnim - 7) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 7) / 2) * (0-(0)));
        }
        else if (tickAnim >= 9 && tickAnim < 13) {
            xx = 60 + (((tickAnim - 9) / 4) * (90-(60)));
            yy = 0 + (((tickAnim - 9) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 9) / 4) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 18) {
            xx = 90 + (((tickAnim - 13) / 5) * (60-(90)));
            yy = 0 + (((tickAnim - 13) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 13) / 5) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 20) {
            xx = 60 + (((tickAnim - 18) / 2) * (5-(60)));
            yy = 0 + (((tickAnim - 18) / 2) * (-2.5-(0)));
            zz = 0 + (((tickAnim - 18) / 2) * (-2.5-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightLeg4, rightLeg4.rotateAngleX + (float) Math.toRadians(xx), rightLeg4.rotateAngleY + (float) Math.toRadians(yy), rightLeg4.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 2.5 + (((tickAnim - 0) / 3) * (0-(2.5)));
            yy = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 3) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 7) {
            xx = 0 + (((tickAnim - 3) / 4) * (-55-(0)));
            yy = 0 + (((tickAnim - 3) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 3) / 4) * (0-(0)));
        }
        else if (tickAnim >= 7 && tickAnim < 9) {
            xx = -55 + (((tickAnim - 7) / 2) * (35-(-55)));
            yy = 0 + (((tickAnim - 7) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 7) / 2) * (0-(0)));
        }
        else if (tickAnim >= 9 && tickAnim < 13) {
            xx = 35 + (((tickAnim - 9) / 4) * (47.5-(35)));
            yy = 0 + (((tickAnim - 9) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 9) / 4) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 18) {
            xx = 47.5 + (((tickAnim - 13) / 5) * (35-(47.5)));
            yy = 0 + (((tickAnim - 13) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 13) / 5) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 20) {
            xx = 35 + (((tickAnim - 18) / 2) * (2.5-(35)));
            yy = 0 + (((tickAnim - 18) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 18) / 2) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightLeg5, rightLeg5.rotateAngleX + (float) Math.toRadians(xx), rightLeg5.rotateAngleY + (float) Math.toRadians(yy), rightLeg5.rotateAngleZ + (float) Math.toRadians(zz));
    }

    public void animWalking(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime) {
        EntityPrehistoricFloraSinraptor entity = (EntityPrehistoricFloraSinraptor) entitylivingbaseIn;
        int animCycle = 50;
        double tickAnim = (entity.ticksExisted + entity.getTickOffset()) - (int) (Math.floor((double) (entity.ticksExisted + entity.getTickOffset()) / (double) animCycle) * (double) animCycle) + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;
        this.root.rotationPointX = this.root.rotationPointX + (float)(0);
        this.root.rotationPointY = this.root.rotationPointY - (float)(-1);
        this.root.rotationPointZ = this.root.rotationPointZ + (float)(0);


        this.setRotateAngle(hips, hips.rotateAngleX + (float) Math.toRadians(-1+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*720/2.5+20))*-1), hips.rotateAngleY + (float) Math.toRadians(-(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/2.5-30))*1.5)), hips.rotateAngleZ + (float) Math.toRadians(-(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/2.5+80))*1)));

        if (tickAnim >= 0 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 0) / 5) * (0-(0)));
            yy = Math.sin((Math.PI/180)*(((double)tickAnim/20)*720/2.5-40))*-0.1 + (((tickAnim - 0) / 5) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.3))*0.1-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*720/2.5-40))*-0.1)));
            zz = -1+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720/2.5-30))*0.6 + (((tickAnim - 0) / 5) * (-1+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720/2.5-30))*0.6-(-1+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720/2.5-30))*0.6)));
        }
        else if (tickAnim >= 5 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 5) / 5) * (0-(0)));
            yy = Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.3))*0.1 + (((tickAnim - 5) / 5) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*720/2.5-40))*-0.1-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.3))*0.1)));
            zz = -1+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720/2.5-30))*0.6 + (((tickAnim - 5) / 5) * (-1+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720/2.5-30))*0.6-(-1+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720/2.5-30))*0.6)));
        }
        else if (tickAnim >= 10 && tickAnim < 27) {
            xx = 0 + (((tickAnim - 10) / 17) * (0-(0)));
            yy = Math.sin((Math.PI/180)*(((double)tickAnim/20)*720/2.5-40))*-0.1 + (((tickAnim - 10) / 17) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*720/2.5-40))*-0.1-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*720/2.5-40))*-0.1)));
            zz = -1+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720/2.5-30))*0.6 + (((tickAnim - 10) / 17) * (-1+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720/2.5-30))*0.6-(-1+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720/2.5-30))*0.6)));
        }
        else if (tickAnim >= 27 && tickAnim < 32) {
            xx = 0 + (((tickAnim - 27) / 5) * (0-(0)));
            yy = Math.sin((Math.PI/180)*(((double)tickAnim/20)*720/2.5-40))*-0.1 + (((tickAnim - 27) / 5) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.3))*0.1-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*720/2.5-40))*-0.1)));
            zz = -1+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720/2.5-30))*0.6 + (((tickAnim - 27) / 5) * (-1+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720/2.5-30))*0.6-(-1+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720/2.5-30))*0.6)));
        }
        else if (tickAnim >= 32 && tickAnim < 37) {
            xx = 0 + (((tickAnim - 32) / 5) * (0-(0)));
            yy = Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.3))*0.1 + (((tickAnim - 32) / 5) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*720/2.5-40))*-0.1-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.3))*0.1)));
            zz = -1+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720/2.5-30))*0.6 + (((tickAnim - 32) / 5) * (-1+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720/2.5-30))*0.6-(-1+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720/2.5-30))*0.6)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.hips.rotationPointX = this.hips.rotationPointX + (float)(xx);
        this.hips.rotationPointY = this.hips.rotationPointY - (float)(yy);
        this.hips.rotationPointZ = this.hips.rotationPointZ + (float)(zz);



        this.setRotateAngle(tail2, tail2.rotateAngleX + (float) Math.toRadians(-2+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*720/2.5-60))*-2), tail2.rotateAngleY + (float) Math.toRadians(-(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/2.5-30))*-5)), tail2.rotateAngleZ + (float) Math.toRadians(-(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/2.5-30))*2)));

        if (tickAnim >= 0 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 0) / 5) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 5) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.3))*-0.1-(0)));
            zz = 0 + (((tickAnim - 0) / 5) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 5) / 5) * (0-(0)));
            yy = Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.3))*-0.1 + (((tickAnim - 5) / 5) * (0-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.3))*-0.1)));
            zz = 0 + (((tickAnim - 5) / 5) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 27) {
            xx = 0 + (((tickAnim - 10) / 17) * (0-(0)));
            yy = 0 + (((tickAnim - 10) / 17) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 17) * (0-(0)));
        }
        else if (tickAnim >= 27 && tickAnim < 32) {
            xx = 0 + (((tickAnim - 27) / 5) * (0-(0)));
            yy = 0 + (((tickAnim - 27) / 5) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.3))*-0.1-(0)));
            zz = 0 + (((tickAnim - 27) / 5) * (0-(0)));
        }
        else if (tickAnim >= 32 && tickAnim < 37) {
            xx = 0 + (((tickAnim - 32) / 5) * (0-(0)));
            yy = Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.3))*-0.1 + (((tickAnim - 32) / 5) * (0-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.3))*-0.1)));
            zz = 0 + (((tickAnim - 32) / 5) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.tail2.rotationPointX = this.tail2.rotationPointX + (float)(xx);
        this.tail2.rotationPointY = this.tail2.rotationPointY - (float)(yy);
        this.tail2.rotationPointZ = this.tail2.rotationPointZ + (float)(zz);



        this.setRotateAngle(tail3, tail3.rotateAngleX + (float) Math.toRadians(-2+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*720/2.5-90))*-2), tail3.rotateAngleY + (float) Math.toRadians(-(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/2.5-90))*-5)), tail3.rotateAngleZ + (float) Math.toRadians(-(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/2.5-90))*2)));

        if (tickAnim >= 0 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 0) / 5) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 5) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.3))*-0.1-(0)));
            zz = 0 + (((tickAnim - 0) / 5) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 5) / 5) * (0-(0)));
            yy = Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.3))*-0.1 + (((tickAnim - 5) / 5) * (0-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.3))*-0.1)));
            zz = 0 + (((tickAnim - 5) / 5) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 27) {
            xx = 0 + (((tickAnim - 10) / 17) * (0-(0)));
            yy = 0 + (((tickAnim - 10) / 17) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 17) * (0-(0)));
        }
        else if (tickAnim >= 27 && tickAnim < 32) {
            xx = 0 + (((tickAnim - 27) / 5) * (0-(0)));
            yy = 0 + (((tickAnim - 27) / 5) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.3))*-0.1-(0)));
            zz = 0 + (((tickAnim - 27) / 5) * (0-(0)));
        }
        else if (tickAnim >= 32 && tickAnim < 37) {
            xx = 0 + (((tickAnim - 32) / 5) * (0-(0)));
            yy = Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.3))*-0.1 + (((tickAnim - 32) / 5) * (0-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.3))*-0.1)));
            zz = 0 + (((tickAnim - 32) / 5) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.tail3.rotationPointX = this.tail3.rotationPointX + (float)(xx);
        this.tail3.rotationPointY = this.tail3.rotationPointY - (float)(yy);
        this.tail3.rotationPointZ = this.tail3.rotationPointZ + (float)(zz);



        this.setRotateAngle(tail4, tail4.rotateAngleX + (float) Math.toRadians(-1+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*720/2.5-120))*-2), tail4.rotateAngleY + (float) Math.toRadians(-(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/2.5-120))*-5)), tail4.rotateAngleZ + (float) Math.toRadians(-(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/2.5-120))*2)));


        this.setRotateAngle(tail5, tail5.rotateAngleX + (float) Math.toRadians(-1+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*720/2.5-140))*-2), tail5.rotateAngleY + (float) Math.toRadians(-(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/2.5-150))*-5)), tail5.rotateAngleZ + (float) Math.toRadians(-(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/2.5-150))*2)));


        this.setRotateAngle(tail6, tail6.rotateAngleX + (float) Math.toRadians(-1+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*720/2.5-140))*-2), tail6.rotateAngleY + (float) Math.toRadians(-(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/2.5-170))*-5)), tail6.rotateAngleZ + (float) Math.toRadians(-(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/2.5-170))*2)));


        this.setRotateAngle(body, body.rotateAngleX + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*720/2.5-80))*1), body.rotateAngleY + (float) Math.toRadians(-(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/2.5-20))*-2)), body.rotateAngleZ + (float) Math.toRadians(-(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/2.5-50))*1)));

        if (tickAnim >= 0 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 0) / 5) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 5) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.3))*-0.15-(0)));
            zz = 0 + (((tickAnim - 0) / 5) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 5) / 5) * (0-(0)));
            yy = Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.3))*-0.15 + (((tickAnim - 5) / 5) * (0-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.3))*-0.15)));
            zz = 0 + (((tickAnim - 5) / 5) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 27) {
            xx = 0 + (((tickAnim - 10) / 17) * (0-(0)));
            yy = 0 + (((tickAnim - 10) / 17) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 17) * (0-(0)));
        }
        else if (tickAnim >= 27 && tickAnim < 32) {
            xx = 0 + (((tickAnim - 27) / 5) * (0-(0)));
            yy = 0 + (((tickAnim - 27) / 5) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.3))*-0.15-(0)));
            zz = 0 + (((tickAnim - 27) / 5) * (0-(0)));
        }
        else if (tickAnim >= 32 && tickAnim < 37) {
            xx = 0 + (((tickAnim - 32) / 5) * (0-(0)));
            yy = Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.3))*-0.15 + (((tickAnim - 32) / 5) * (0-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.3))*-0.15)));
            zz = 0 + (((tickAnim - 32) / 5) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.body.rotationPointX = this.body.rotationPointX + (float)(xx);
        this.body.rotationPointY = this.body.rotationPointY - (float)(yy);
        this.body.rotationPointZ = this.body.rotationPointZ + (float)(zz);



        this.setRotateAngle(body2, body2.rotateAngleX + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*720/2.5+70))*1), body2.rotateAngleY + (float) Math.toRadians(-(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/2.5-50))*-2)), body2.rotateAngleZ + (float) Math.toRadians(-(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/2.5-50))*-2)));


        this.setRotateAngle(neck2, neck2.rotateAngleX + (float) Math.toRadians(1+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*720/2.5-30))*1), neck2.rotateAngleY + (float) Math.toRadians(-(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/2.5-50))*2)), neck2.rotateAngleZ + (float) Math.toRadians(-(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/2.5-60))*-1)));


        this.setRotateAngle(neck3, neck3.rotateAngleX + (float) Math.toRadians(1+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*720/2.5-60))*-1), neck3.rotateAngleY + (float) Math.toRadians(-(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/2.5+150))*2)), neck3.rotateAngleZ + (float) Math.toRadians(-(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/2.5+90))*-1)));


        this.setRotateAngle(neck4, neck4.rotateAngleX + (float) Math.toRadians(1+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*720/2.5))*-1), neck4.rotateAngleY + (float) Math.toRadians(0), neck4.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(head, head.rotateAngleX + (float) Math.toRadians(1+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*720/2.5+60))*-1), head.rotateAngleY + (float) Math.toRadians(-(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/2.5+60))*2)), head.rotateAngleZ + (float) Math.toRadians(-(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/2.5+90))*-1)));


        this.setRotateAngle(throat, throat.rotateAngleX + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*720/2.5))*1), throat.rotateAngleY + (float) Math.toRadians(0), throat.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(leftarm2, leftarm2.rotateAngleX + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/2.5+30))*5), leftarm2.rotateAngleY + (float) Math.toRadians(0), leftarm2.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(rightarm2, rightarm2.rotateAngleX + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/2.5+60))*5), rightarm2.rotateAngleY + (float) Math.toRadians(0), rightarm2.rotateAngleZ + (float) Math.toRadians(0));



        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 20.01859 + (((tickAnim - 0) / 10) * (5-(20.01859)));
            yy = 1.30541 + (((tickAnim - 0) / 10) * (5-(1.30541)));
            zz = 9.89636 + (((tickAnim - 0) / 10) * (5-(9.89636)));
        }
        else if (tickAnim >= 10 && tickAnim < 20) {
            xx = 5 + (((tickAnim - 10) / 10) * (-27.70522-(5)));
            yy = 5 + (((tickAnim - 10) / 10) * (3.05851-(5)));
            zz = 5 + (((tickAnim - 10) / 10) * (2.08049-(5)));
        }
        else if (tickAnim >= 20 && tickAnim < 27) {
            xx = -27.70522 + (((tickAnim - 20) / 7) * (-22.61223-(-27.70522)));
            yy = 3.05851 + (((tickAnim - 20) / 7) * (-6.26128-(3.05851)));
            zz = 2.08049 + (((tickAnim - 20) / 7) * (2.4035-(2.08049)));
        }
        else if (tickAnim >= 27 && tickAnim < 37) {
            xx = -22.61223 + (((tickAnim - 27) / 10) * (2.3333-(-22.61223)));
            yy = -6.26128 + (((tickAnim - 27) / 10) * (-2.96177-(-6.26128)));
            zz = 2.4035 + (((tickAnim - 27) / 10) * (2.4838-(2.4035)));
        }
        else if (tickAnim >= 37 && tickAnim < 50) {
            xx = 2.3333 + (((tickAnim - 37) / 13) * (20.01859-(2.3333)));
            yy = -2.96177 + (((tickAnim - 37) / 13) * (1.30541-(-2.96177)));
            zz = 2.4838 + (((tickAnim - 37) / 13) * (9.89636-(2.4838)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftLeg, leftLeg.rotateAngleX + (float) Math.toRadians(xx), leftLeg.rotateAngleY + (float) Math.toRadians(yy), leftLeg.rotateAngleZ + (float) Math.toRadians(zz));


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
        else if (tickAnim >= 20 && tickAnim < 27) {
            xx = 0 + (((tickAnim - 20) / 7) * (0-(0)));
            yy = 0 + (((tickAnim - 20) / 7) * (-1-(0)));
            zz = 0 + (((tickAnim - 20) / 7) * (0-(0)));
        }
        else if (tickAnim >= 27 && tickAnim < 32) {
            xx = 0 + (((tickAnim - 27) / 5) * (0-(0)));
            yy = -1 + (((tickAnim - 27) / 5) * (-0.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.3))*0.5-(-1)));
            zz = 0 + (((tickAnim - 27) / 5) * (0-(0)));
        }
        else if (tickAnim >= 32 && tickAnim < 37) {
            xx = 0 + (((tickAnim - 32) / 5) * (0-(0)));
            yy = -0.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.3))*0.5 + (((tickAnim - 32) / 5) * (-0.75-(-0.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.3))*0.5)));
            zz = 0 + (((tickAnim - 32) / 5) * (0-(0)));
        }
        else if (tickAnim >= 37 && tickAnim < 43) {
            xx = 0 + (((tickAnim - 37) / 6) * (0-(0)));
            yy = -0.75 + (((tickAnim - 37) / 6) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.3))*0.5-(-0.75)));
            zz = 0 + (((tickAnim - 37) / 6) * (0-(0)));
        }
        else if (tickAnim >= 43 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 43) / 7) * (0-(0)));
            yy = Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.3))*0.5 + (((tickAnim - 43) / 7) * (0-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.3))*0.5)));
            zz = 0 + (((tickAnim - 43) / 7) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.leftLeg.rotationPointX = this.leftLeg.rotationPointX + (float)(xx);
        this.leftLeg.rotationPointY = this.leftLeg.rotationPointY - (float)(yy);
        this.leftLeg.rotationPointZ = this.leftLeg.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 5.04024 + (((tickAnim - 0) / 10) * (45.23987-(5.04024)));
            yy = -0.10877 + (((tickAnim - 0) / 10) * (-3.0195-(-0.10877)));
            zz = -7.14119 + (((tickAnim - 0) / 10) * (-2.47873-(-7.14119)));
        }
        else if (tickAnim >= 10 && tickAnim < 20) {
            xx = 45.23987 + (((tickAnim - 10) / 10) * (42.36107-(45.23987)));
            yy = -3.0195 + (((tickAnim - 10) / 10) * (2.26768-(-3.0195)));
            zz = -2.47873 + (((tickAnim - 10) / 10) * (-3.37923-(-2.47873)));
        }
        else if (tickAnim >= 20 && tickAnim < 27) {
            xx = 42.36107 + (((tickAnim - 20) / 7) * (-4.92993-(42.36107)));
            yy = 2.26768 + (((tickAnim - 20) / 7) * (6.29758-(2.26768)));
            zz = -3.37923 + (((tickAnim - 20) / 7) * (-3.09794-(-3.37923)));
        }
        else if (tickAnim >= 27 && tickAnim < 37) {
            xx = -4.92993 + (((tickAnim - 27) / 10) * (5-(-4.92993)));
            yy = 6.29758 + (((tickAnim - 27) / 10) * (0-(6.29758)));
            zz = -3.09794 + (((tickAnim - 27) / 10) * (0-(-3.09794)));
        }
        else if (tickAnim >= 37 && tickAnim < 50) {
            xx = 5 + (((tickAnim - 37) / 13) * (5.04024-(5)));
            yy = 0 + (((tickAnim - 37) / 13) * (-0.10877-(0)));
            zz = 0 + (((tickAnim - 37) / 13) * (-7.14119-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftLeg2, leftLeg2.rotateAngleX + (float) Math.toRadians(xx), leftLeg2.rotateAngleY + (float) Math.toRadians(yy), leftLeg2.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0.4 + (((tickAnim - 0) / 10) * (0.525-(0.4)));
            yy = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 27) {
            xx = 0.525 + (((tickAnim - 10) / 17) * (0-(0.525)));
            yy = 0 + (((tickAnim - 10) / 17) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 17) * (0-(0)));
        }
        else if (tickAnim >= 27 && tickAnim < 32) {
            xx = 0 + (((tickAnim - 27) / 5) * (0-(0)));
            yy = 0 + (((tickAnim - 27) / 5) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.3))*-0.4-(0)));
            zz = 0 + (((tickAnim - 27) / 5) * (0-(0)));
        }
        else if (tickAnim >= 32 && tickAnim < 37) {
            xx = 0 + (((tickAnim - 32) / 5) * (0-(0)));
            yy = Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.3))*-0.4 + (((tickAnim - 32) / 5) * (0-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.3))*-0.4)));
            zz = 0 + (((tickAnim - 32) / 5) * (0-(0)));
        }
        else if (tickAnim >= 37 && tickAnim < 43) {
            xx = 0 + (((tickAnim - 37) / 6) * (0-(0)));
            yy = 0 + (((tickAnim - 37) / 6) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.3))*-0.25-(0)));
            zz = 0 + (((tickAnim - 37) / 6) * (0-(0)));
        }
        else if (tickAnim >= 43 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 43) / 7) * (0.4-(0)));
            yy = Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.3))*-0.25 + (((tickAnim - 43) / 7) * (0-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.3))*-0.25)));
            zz = 0 + (((tickAnim - 43) / 7) * (0-(0)));
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
            xx = 27.5 + (((tickAnim - 0) / 10) * (-15-(27.5)));
            yy = 0 + (((tickAnim - 0) / 10) * (2.5-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (2.5-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 20) {
            xx = -15 + (((tickAnim - 10) / 10) * (-40-(-15)));
            yy = 2.5 + (((tickAnim - 10) / 10) * (0-(2.5)));
            zz = 2.5 + (((tickAnim - 10) / 10) * (0-(2.5)));
        }
        else if (tickAnim >= 20 && tickAnim < 27) {
            xx = -40 + (((tickAnim - 20) / 7) * (22.5-(-40)));
            yy = 0 + (((tickAnim - 20) / 7) * (-2.5-(0)));
            zz = 0 + (((tickAnim - 20) / 7) * (2.5-(0)));
        }
        else if (tickAnim >= 27 && tickAnim < 37) {
            xx = 22.5 + (((tickAnim - 27) / 10) * (-10-(22.5)));
            yy = -2.5 + (((tickAnim - 27) / 10) * (0-(-2.5)));
            zz = 2.5 + (((tickAnim - 27) / 10) * (0-(2.5)));
        }
        else if (tickAnim >= 37 && tickAnim < 50) {
            xx = -10 + (((tickAnim - 37) / 13) * (27.5-(-10)));
            yy = 0 + (((tickAnim - 37) / 13) * (0-(0)));
            zz = 0 + (((tickAnim - 37) / 13) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftLeg3, leftLeg3.rotateAngleX + (float) Math.toRadians(xx), leftLeg3.rotateAngleY + (float) Math.toRadians(yy), leftLeg3.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 27) {
            xx = 0 + (((tickAnim - 0) / 27) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 27) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 27) * (0-(0)));
        }
        else if (tickAnim >= 27 && tickAnim < 32) {
            xx = 0 + (((tickAnim - 27) / 5) * (0-(0)));
            yy = 0 + (((tickAnim - 27) / 5) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.3))*-0.4-(0)));
            zz = 0 + (((tickAnim - 27) / 5) * (0-(0)));
        }
        else if (tickAnim >= 32 && tickAnim < 37) {
            xx = 0 + (((tickAnim - 32) / 5) * (0-(0)));
            yy = Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.3))*-0.4 + (((tickAnim - 32) / 5) * (0-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.3))*-0.4)));
            zz = 0 + (((tickAnim - 32) / 5) * (0-(0)));
        }
        else if (tickAnim >= 37 && tickAnim < 43) {
            xx = 0 + (((tickAnim - 37) / 6) * (0-(0)));
            yy = 0 + (((tickAnim - 37) / 6) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.3))*-0.25-(0)));
            zz = 0 + (((tickAnim - 37) / 6) * (0-(0)));
        }
        else if (tickAnim >= 43 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 43) / 7) * (0-(0)));
            yy = Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.3))*-0.25 + (((tickAnim - 43) / 7) * (0-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.3))*-0.25)));
            zz = 0 + (((tickAnim - 43) / 7) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.leftLeg3.rotationPointX = this.leftLeg3.rotationPointX + (float)(xx);
        this.leftLeg3.rotationPointY = this.leftLeg3.rotationPointY - (float)(yy);
        this.leftLeg3.rotationPointZ = this.leftLeg3.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 7) {
            xx = 40 + (((tickAnim - 0) / 7) * (52.5-(40)));
            yy = 0 + (((tickAnim - 0) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 7) * (0-(0)));
        }
        else if (tickAnim >= 7 && tickAnim < 20) {
            xx = 52.5 + (((tickAnim - 7) / 13) * (24.75-(52.5)));
            yy = 0 + (((tickAnim - 7) / 13) * (0-(0)));
            zz = 0 + (((tickAnim - 7) / 13) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 27) {
            xx = 24.75 + (((tickAnim - 20) / 7) * (12.75-(24.75)));
            yy = 0 + (((tickAnim - 20) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 7) * (0-(0)));
        }
        else if (tickAnim >= 27 && tickAnim < 37) {
            xx = 12.75 + (((tickAnim - 27) / 10) * (5-(12.75)));
            yy = 0 + (((tickAnim - 27) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 27) / 10) * (0-(0)));
        }
        else if (tickAnim >= 37 && tickAnim < 43) {
            xx = 5 + (((tickAnim - 37) / 6) * (0-(5)));
            yy = 0 + (((tickAnim - 37) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 37) / 6) * (0-(0)));
        }
        else if (tickAnim >= 43 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 43) / 7) * (40-(0)));
            yy = 0 + (((tickAnim - 43) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 43) / 7) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftLeg4, leftLeg4.rotateAngleX + (float) Math.toRadians(xx), leftLeg4.rotateAngleY + (float) Math.toRadians(yy), leftLeg4.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 7) {
            xx = -87.5 + (((tickAnim - 0) / 7) * (40-(-87.5)));
            yy = 0 + (((tickAnim - 0) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 7) * (0-(0)));
        }
        else if (tickAnim >= 7 && tickAnim < 20) {
            xx = 40 + (((tickAnim - 7) / 13) * (50-(40)));
            yy = 0 + (((tickAnim - 7) / 13) * (0-(0)));
            zz = 0 + (((tickAnim - 7) / 13) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 27) {
            xx = 50 + (((tickAnim - 20) / 7) * (-5-(50)));
            yy = 0 + (((tickAnim - 20) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 7) * (0-(0)));
        }
        else if (tickAnim >= 27 && tickAnim < 37) {
            xx = -5 + (((tickAnim - 27) / 10) * (0-(-5)));
            yy = 0 + (((tickAnim - 27) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 27) / 10) * (0-(0)));
        }
        else if (tickAnim >= 37 && tickAnim < 43) {
            xx = 0 + (((tickAnim - 37) / 6) * (-23.75-(0)));
            yy = 0 + (((tickAnim - 37) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 37) / 6) * (0-(0)));
        }
        else if (tickAnim >= 43 && tickAnim < 50) {
            xx = -23.75 + (((tickAnim - 43) / 7) * (-87.5-(-23.75)));
            yy = 0 + (((tickAnim - 43) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 43) / 7) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftLeg5, leftLeg5.rotateAngleX + (float) Math.toRadians(xx), leftLeg5.rotateAngleY + (float) Math.toRadians(yy), leftLeg5.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 10) {
            xx = -22.40055 + (((tickAnim - 0) / 10) * (1.87952-(-22.40055)));
            yy = 6.56221 + (((tickAnim - 0) / 10) * (3.22569-(6.56221)));
            zz = -4.86702 + (((tickAnim - 0) / 10) * (-2.43914-(-4.86702)));
        }
        else if (tickAnim >= 10 && tickAnim < 23) {
            xx = 1.87952 + (((tickAnim - 10) / 13) * (19.69882-(1.87952)));
            yy = 3.22569 + (((tickAnim - 10) / 13) * (-3.10071-(3.22569)));
            zz = -2.43914 + (((tickAnim - 10) / 13) * (-5.07568-(-2.43914)));
        }
        else if (tickAnim >= 23 && tickAnim < 33) {
            xx = 19.69882 + (((tickAnim - 23) / 10) * (4.84746-(19.69882)));
            yy = -3.10071 + (((tickAnim - 23) / 10) * (-4.96468-(-3.10071)));
            zz = -5.07568 + (((tickAnim - 23) / 10) * (-3.24372-(-5.07568)));
        }
        else if (tickAnim >= 33 && tickAnim < 43) {
            xx = 4.84746 + (((tickAnim - 33) / 10) * (-27.62286-(4.84746)));
            yy = -4.96468 + (((tickAnim - 33) / 10) * (-1.32648-(-4.96468)));
            zz = -3.24372 + (((tickAnim - 33) / 10) * (-2.63665-(-3.24372)));
        }
        else if (tickAnim >= 43 && tickAnim < 50) {
            xx = -27.62286 + (((tickAnim - 43) / 7) * (-22.40055-(-27.62286)));
            yy = -1.32648 + (((tickAnim - 43) / 7) * (6.56221-(-1.32648)));
            zz = -2.63665 + (((tickAnim - 43) / 7) * (-4.86702-(-2.63665)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightLeg, rightLeg.rotateAngleX + (float) Math.toRadians(xx), rightLeg.rotateAngleY + (float) Math.toRadians(yy), rightLeg.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 0) / 5) * (0-(0)));
            yy = -1 + (((tickAnim - 0) / 5) * (-0.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.3))*0.5-(-1)));
            zz = 0 + (((tickAnim - 0) / 5) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 5) / 5) * (0-(0)));
            yy = -0.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.3))*0.5 + (((tickAnim - 5) / 5) * (-0.75-(-0.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.3))*0.5)));
            zz = 0 + (((tickAnim - 5) / 5) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 17) {
            xx = 0 + (((tickAnim - 10) / 7) * (0-(0)));
            yy = -0.75 + (((tickAnim - 10) / 7) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.3))*0.5-(-0.75)));
            zz = 0 + (((tickAnim - 10) / 7) * (0-(0)));
        }
        else if (tickAnim >= 17 && tickAnim < 23) {
            xx = 0 + (((tickAnim - 17) / 6) * (0-(0)));
            yy = Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.3))*0.5 + (((tickAnim - 17) / 6) * (0-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.3))*0.5)));
            zz = 0 + (((tickAnim - 17) / 6) * (0-(0)));
        }
        else if (tickAnim >= 23 && tickAnim < 33) {
            xx = 0 + (((tickAnim - 23) / 10) * (0-(0)));
            yy = 0 + (((tickAnim - 23) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 23) / 10) * (0-(0)));
        }
        else if (tickAnim >= 33 && tickAnim < 43) {
            xx = 0 + (((tickAnim - 33) / 10) * (0-(0)));
            yy = 0 + (((tickAnim - 33) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 33) / 10) * (0-(0)));
        }
        else if (tickAnim >= 43 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 43) / 7) * (0-(0)));
            yy = 0 + (((tickAnim - 43) / 7) * (-1-(0)));
            zz = 0 + (((tickAnim - 43) / 7) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.rightLeg.rotationPointX = this.rightLeg.rotationPointX + (float)(xx);
        this.rightLeg.rotationPointY = this.rightLeg.rotationPointY - (float)(yy);
        this.rightLeg.rotationPointZ = this.rightLeg.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 10) {
            xx = -6.99563 + (((tickAnim - 0) / 10) * (5-(-6.99563)));
            yy = -6.10248 + (((tickAnim - 0) / 10) * (0-(-6.10248)));
            zz = 4.09786 + (((tickAnim - 0) / 10) * (0-(4.09786)));
        }
        else if (tickAnim >= 10 && tickAnim < 23) {
            xx = 5 + (((tickAnim - 10) / 13) * (5-(5)));
            yy = 0 + (((tickAnim - 10) / 13) * (2.5-(0)));
            zz = 0 + (((tickAnim - 10) / 13) * (2.5-(0)));
        }
        else if (tickAnim >= 23 && tickAnim < 33) {
            xx = 5 + (((tickAnim - 23) / 10) * (44.79635-(5)));
            yy = 2.5 + (((tickAnim - 23) / 10) * (-1.5497-(2.5)));
            zz = 2.5 + (((tickAnim - 23) / 10) * (4.21992-(2.5)));
        }
        else if (tickAnim >= 33 && tickAnim < 43) {
            xx = 44.79635 + (((tickAnim - 33) / 10) * (42.5442-(44.79635)));
            yy = -1.5497 + (((tickAnim - 33) / 10) * (-1.14721-(-1.5497)));
            zz = 4.21992 + (((tickAnim - 33) / 10) * (2.4479-(4.21992)));
        }
        else if (tickAnim >= 43 && tickAnim < 50) {
            xx = 42.5442 + (((tickAnim - 43) / 7) * (-6.99563-(42.5442)));
            yy = -1.14721 + (((tickAnim - 43) / 7) * (-6.10248-(-1.14721)));
            zz = 2.4479 + (((tickAnim - 43) / 7) * (4.09786-(2.4479)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightLeg2, rightLeg2.rotateAngleX + (float) Math.toRadians(xx), rightLeg2.rotateAngleY + (float) Math.toRadians(yy), rightLeg2.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 0) / 5) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 5) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.3))*-0.4-(0)));
            zz = 0 + (((tickAnim - 0) / 5) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 5) / 5) * (0-(0)));
            yy = Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.3))*-0.4 + (((tickAnim - 5) / 5) * (0-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.3))*-0.4)));
            zz = 0 + (((tickAnim - 5) / 5) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 17) {
            xx = 0 + (((tickAnim - 10) / 7) * (0-(0)));
            yy = 0 + (((tickAnim - 10) / 7) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.3))*-0.25-(0)));
            zz = 0 + (((tickAnim - 10) / 7) * (0-(0)));
        }
        else if (tickAnim >= 17 && tickAnim < 23) {
            xx = 0 + (((tickAnim - 17) / 6) * (-0.2-(0)));
            yy = Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.3))*-0.25 + (((tickAnim - 17) / 6) * (0-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.3))*-0.25)));
            zz = 0 + (((tickAnim - 17) / 6) * (0-(0)));
        }
        else if (tickAnim >= 23 && tickAnim < 43) {
            xx = -0.2 + (((tickAnim - 23) / 20) * (-0.275-(-0.2)));
            yy = 0 + (((tickAnim - 23) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 23) / 20) * (0-(0)));
        }
        else if (tickAnim >= 43 && tickAnim < 50) {
            xx = -0.275 + (((tickAnim - 43) / 7) * (0-(-0.275)));
            yy = 0 + (((tickAnim - 43) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 43) / 7) * (0-(0)));
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
            xx = 22.5 + (((tickAnim - 0) / 10) * (-10-(22.5)));
            yy = 2.5 + (((tickAnim - 0) / 10) * (0-(2.5)));
            zz = -2.5 + (((tickAnim - 0) / 10) * (0-(-2.5)));
        }
        else if (tickAnim >= 10 && tickAnim < 23) {
            xx = -10 + (((tickAnim - 10) / 13) * (27.5-(-10)));
            yy = 0 + (((tickAnim - 10) / 13) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 13) * (0-(0)));
        }
        else if (tickAnim >= 23 && tickAnim < 33) {
            xx = 27.5 + (((tickAnim - 23) / 10) * (-15-(27.5)));
            yy = 0 + (((tickAnim - 23) / 10) * (-2.5-(0)));
            zz = 0 + (((tickAnim - 23) / 10) * (-2.5-(0)));
        }
        else if (tickAnim >= 33 && tickAnim < 43) {
            xx = -15 + (((tickAnim - 33) / 10) * (-40-(-15)));
            yy = -2.5 + (((tickAnim - 33) / 10) * (0-(-2.5)));
            zz = -2.5 + (((tickAnim - 33) / 10) * (0-(-2.5)));
        }
        else if (tickAnim >= 43 && tickAnim < 50) {
            xx = -40 + (((tickAnim - 43) / 7) * (22.5-(-40)));
            yy = 0 + (((tickAnim - 43) / 7) * (2.5-(0)));
            zz = 0 + (((tickAnim - 43) / 7) * (-2.5-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightLeg3, rightLeg3.rotateAngleX + (float) Math.toRadians(xx), rightLeg3.rotateAngleY + (float) Math.toRadians(yy), rightLeg3.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 0) / 5) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 5) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.3))*-0.4-(0)));
            zz = 0 + (((tickAnim - 0) / 5) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 5) / 5) * (0-(0)));
            yy = Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.3))*-0.4 + (((tickAnim - 5) / 5) * (0-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.3))*-0.4)));
            zz = 0 + (((tickAnim - 5) / 5) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 17) {
            xx = 0 + (((tickAnim - 10) / 7) * (0-(0)));
            yy = 0 + (((tickAnim - 10) / 7) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.3))*-0.25-(0)));
            zz = 0 + (((tickAnim - 10) / 7) * (0-(0)));
        }
        else if (tickAnim >= 17 && tickAnim < 23) {
            xx = 0 + (((tickAnim - 17) / 6) * (0-(0)));
            yy = Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.3))*-0.25 + (((tickAnim - 17) / 6) * (0-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.3))*-0.25)));
            zz = 0 + (((tickAnim - 17) / 6) * (0-(0)));
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
        this.rightLeg3.rotationPointX = this.rightLeg3.rotationPointX + (float)(xx);
        this.rightLeg3.rotationPointY = this.rightLeg3.rotationPointY - (float)(yy);
        this.rightLeg3.rotationPointZ = this.rightLeg3.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 10 + (((tickAnim - 0) / 10) * (5-(10)));
            yy = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 17) {
            xx = 5 + (((tickAnim - 10) / 7) * (0-(5)));
            yy = 0 + (((tickAnim - 10) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 7) * (0-(0)));
        }
        else if (tickAnim >= 17 && tickAnim < 23) {
            xx = 0 + (((tickAnim - 17) / 6) * (40-(0)));
            yy = 0 + (((tickAnim - 17) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 17) / 6) * (0-(0)));
        }
        else if (tickAnim >= 23 && tickAnim < 30) {
            xx = 40 + (((tickAnim - 23) / 7) * (52.5-(40)));
            yy = 0 + (((tickAnim - 23) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 23) / 7) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 43) {
            xx = 52.5 + (((tickAnim - 30) / 13) * (27.5-(52.5)));
            yy = 0 + (((tickAnim - 30) / 13) * (0-(0)));
            zz = 0 + (((tickAnim - 30) / 13) * (0-(0)));
        }
        else if (tickAnim >= 43 && tickAnim < 50) {
            xx = 27.5 + (((tickAnim - 43) / 7) * (10-(27.5)));
            yy = 0 + (((tickAnim - 43) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 43) / 7) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightLeg4, rightLeg4.rotateAngleX + (float) Math.toRadians(xx), rightLeg4.rotateAngleY + (float) Math.toRadians(yy), rightLeg4.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 10) {
            xx = -5 + (((tickAnim - 0) / 10) * (0-(-5)));
            yy = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 17) {
            xx = 0 + (((tickAnim - 10) / 7) * (-23.75-(0)));
            yy = 0 + (((tickAnim - 10) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 7) * (0-(0)));
        }
        else if (tickAnim >= 17 && tickAnim < 23) {
            xx = -23.75 + (((tickAnim - 17) / 6) * (-87.5-(-23.75)));
            yy = 0 + (((tickAnim - 17) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 17) / 6) * (0-(0)));
        }
        else if (tickAnim >= 23 && tickAnim < 30) {
            xx = -87.5 + (((tickAnim - 23) / 7) * (40-(-87.5)));
            yy = 0 + (((tickAnim - 23) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 23) / 7) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 43) {
            xx = 40 + (((tickAnim - 30) / 13) * (50-(40)));
            yy = 0 + (((tickAnim - 30) / 13) * (0-(0)));
            zz = 0 + (((tickAnim - 30) / 13) * (0-(0)));
        }
        else if (tickAnim >= 43 && tickAnim < 50) {
            xx = 50 + (((tickAnim - 43) / 7) * (-5-(50)));
            yy = 0 + (((tickAnim - 43) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 43) / 7) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightLeg5, rightLeg5.rotateAngleX + (float) Math.toRadians(xx), rightLeg5.rotateAngleY + (float) Math.toRadians(yy), rightLeg5.rotateAngleZ + (float) Math.toRadians(zz));
    }

    @Override
    public void setLivingAnimations(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime) {
        super.setLivingAnimations(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime);
        this.resetToDefaultPose();
        EntityPrehistoricFloraSinraptor ee = (EntityPrehistoricFloraSinraptor) entitylivingbaseIn;

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
        else if (ee.getAnimation() == ee.STAND_ANIMATION) {
            animScratch(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime, ee.getAnimationTick());
        }
        else if (ee.getAnimation() == ee.SCRATCH_RIGHT_ANIMATION) {
            animScratchRight(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime, ee.getAnimationTick());
        }
        
    }

    public void animate(IAnimatedEntity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        EntityPrehistoricFloraSinraptor e = (EntityPrehistoricFloraSinraptor) entity;
        animator.update(entity);

        animator.setAnimation(e.HURT_ANIMATION);
        animator.startKeyframe(10);
        animator.rotate(this.neck, (float) Math.toRadians(-10),0,0);
        animator.rotate(this.neck2, (float) Math.toRadians(-10), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(this.neck3, (float) Math.toRadians(-10), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(this.neck4, (float) Math.toRadians(-10), (float) Math.toRadians(0), (float) Math.toRadians(0));
        //animator.rotate(this.Head, (float) Math.toRadians(-55), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(this.jaw, (float) Math.toRadians(35), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.endKeyframe();
        animator.setStaticKeyframe(10);
        animator.resetKeyframe(10);
    }
}
