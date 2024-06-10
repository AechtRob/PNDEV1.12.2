package net.lepidodendron.entity.model.entity;

import net.ilexiconn.llibrary.client.model.ModelAnimator;
import net.ilexiconn.llibrary.server.animation.IAnimatedEntity;
import net.lepidodendron.entity.EntityPrehistoricFloraCotylorhynchus;
import net.lepidodendron.entity.model.ModelBasePalaeopedia;
import net.lepidodendron.entity.model.llibraryextensions.AdvancedModelRendererExtended;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;

public class ModelCotylorhynchus extends ModelBasePalaeopedia {
    private final AdvancedModelRendererExtended main;
    private final AdvancedModelRendererExtended bodyCentreFront;
    private final AdvancedModelRendererExtended bodyCentreFrontFat_r1;
    private final AdvancedModelRendererExtended bodyCentreFront_r1;
    private final AdvancedModelRendererExtended shoulder;
    private final AdvancedModelRendererExtended shoulderU_r1;
    private final AdvancedModelRendererExtended shoulderL_r1;
    private final AdvancedModelRendererExtended shoulder_r1;
    private final AdvancedModelRendererExtended legFrontR;
    private final AdvancedModelRendererExtended upperLegFrontR_r1;
    private final AdvancedModelRendererExtended legFrontRLower;
    private final AdvancedModelRendererExtended lowerLegFrontR_r1;
    private final AdvancedModelRendererExtended legFrontRFoot;
    private final AdvancedModelRendererExtended legFrontRFootb_r1;
    private final AdvancedModelRendererExtended legFrontRFoota_r1;
    private final AdvancedModelRendererExtended legFrontL;
    private final AdvancedModelRendererExtended upperLegFrontL_r1;
    private final AdvancedModelRendererExtended legFrontLLower;
    private final AdvancedModelRendererExtended lowerLegFrontL_r1;
    private final AdvancedModelRendererExtended legFrontLFoot;
    private final AdvancedModelRendererExtended legFrontLFootb_r1;
    private final AdvancedModelRendererExtended legFrontLFoota_r1;
    private final AdvancedModelRendererExtended neck;
    private final AdvancedModelRendererExtended neckL_r1;
    private final AdvancedModelRendererExtended neck_r1;
    private final AdvancedModelRendererExtended head;
    private final AdvancedModelRendererExtended skullTop;
    private final AdvancedModelRendererExtended skullT4_r1;
    private final AdvancedModelRendererExtended skullT3_r1;
    private final AdvancedModelRendererExtended skullJaw;
    private final AdvancedModelRendererExtended rump;
    private final AdvancedModelRendererExtended rump_r1;
    private final AdvancedModelRendererExtended bodyBack;
    private final AdvancedModelRendererExtended bodyBackUR_r1;
    private final AdvancedModelRendererExtended bodyBackLL_r1;
    private final AdvancedModelRendererExtended bodyBackLR_r1;
    private final AdvancedModelRendererExtended bodyBackUR_r2;
    private final AdvancedModelRendererExtended tail1;
    private final AdvancedModelRendererExtended tail1_r1;
    private final AdvancedModelRendererExtended tail2;
    private final AdvancedModelRendererExtended tail2_r1;
    private final AdvancedModelRendererExtended tail3;
    private final AdvancedModelRendererExtended tail3_r1;
    private final AdvancedModelRendererExtended tail4;
    private final AdvancedModelRendererExtended tail5;
    private final AdvancedModelRendererExtended tail5_r1;
    private final AdvancedModelRendererExtended tail6;
    private final AdvancedModelRendererExtended tail5_r2;
    private final AdvancedModelRendererExtended legBackR;
    private final AdvancedModelRendererExtended upperLegBackR_r1;
    private final AdvancedModelRendererExtended legBackRLower;
    private final AdvancedModelRendererExtended lowerLegBackR_r1;
    private final AdvancedModelRendererExtended legBackRFoot;
    private final AdvancedModelRendererExtended legFrontLFootb_r2;
    private final AdvancedModelRendererExtended legFrontLFoota_r2;
    private final AdvancedModelRendererExtended legBackL;
    private final AdvancedModelRendererExtended upperLegBackL_r1;
    private final AdvancedModelRendererExtended legBackLLower;
    private final AdvancedModelRendererExtended lowerLegBackL_r1;
    private final AdvancedModelRendererExtended legBackLFoot;
    private final AdvancedModelRendererExtended legFrontLFootb_r3;
    private final AdvancedModelRendererExtended legFrontLFoota_r3;

    private ModelAnimator animator;

    public ModelCotylorhynchus() {
        this.textureWidth = 152;
        this.textureHeight = 128;

        this.main = new AdvancedModelRendererExtended(this);
        this.main.setRotationPoint(-1.0F, 22.0F, 22.0F);
        this.setRotateAngle(main, -0.1134F, 0.0F, 0.0F);


        this.bodyCentreFront = new AdvancedModelRendererExtended(this);
        this.bodyCentreFront.setRotationPoint(0.5F, -7.7412F, -13.0538F);
        this.main.addChild(bodyCentreFront);


        this.bodyCentreFrontFat_r1 = new AdvancedModelRendererExtended(this);
        this.bodyCentreFrontFat_r1.setRotationPoint(0.0F, 0.1059F, -5.4735F);
        this.bodyCentreFront.addChild(bodyCentreFrontFat_r1);
        this.setRotateAngle(bodyCentreFrontFat_r1, 0.0873F, 0.0F, 0.0F);
        this.bodyCentreFrontFat_r1.cubeList.add(new ModelBox(bodyCentreFrontFat_r1, 0, 40, -11.5F, -6.0F, -11.0F, 23, 12, 17, 0.0F, false));

        this.bodyCentreFront_r1 = new AdvancedModelRendererExtended(this);
        this.bodyCentreFront_r1.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.bodyCentreFront.addChild(bodyCentreFront_r1);
        this.setRotateAngle(bodyCentreFront_r1, 0.0873F, 0.0F, 0.0F);
        this.bodyCentreFront_r1.cubeList.add(new ModelBox(bodyCentreFront_r1, 0, 0, -9.0F, -9.5F, -20.5F, 18, 17, 23, 0.0F, false));

        this.shoulder = new AdvancedModelRendererExtended(this);
        this.shoulder.setRotationPoint(0.0F, -2.331F, -21.917F);
        this.bodyCentreFront.addChild(shoulder);


        this.shoulderU_r1 = new AdvancedModelRendererExtended(this);
        this.shoulderU_r1.setRotationPoint(0.0F, -2.5539F, -5.0278F);
        this.shoulder.addChild(shoulderU_r1);
        this.setRotateAngle(shoulderU_r1, 0.3927F, 0.0F, 0.0F);
        this.shoulderU_r1.cubeList.add(new ModelBox(shoulderU_r1, 63, 40, -6.0F, 0.1F, -4.5F, 12, 2, 11, 0.0F, false));

        this.shoulderL_r1 = new AdvancedModelRendererExtended(this);
        this.shoulderL_r1.setRotationPoint(0.0F, 20.0722F, 1.9708F);
        this.shoulder.addChild(shoulderL_r1);
        this.setRotateAngle(shoulderL_r1, -0.0873F, 0.0F, 0.0F);
        this.shoulderL_r1.cubeList.add(new ModelBox(shoulderL_r1, 48, 69, -6.0F, -11.15F, -10.5F, 12, 2, 11, 0.0F, false));

        this.shoulder_r1 = new AdvancedModelRendererExtended(this);
        this.shoulder_r1.setRotationPoint(0.0F, 3.6121F, 2.7571F);
        this.shoulder.addChild(shoulder_r1);
        this.setRotateAngle(shoulder_r1, 0.1309F, 0.0F, 0.0F);
        this.shoulder_r1.cubeList.add(new ModelBox(shoulder_r1, 0, 69, -6.5F, -6.5F, -11.5F, 13, 13, 11, 0.0F, false));

        this.legFrontR = new AdvancedModelRendererExtended(this);
        this.legFrontR.setRotationPoint(-4.5F, 7.0722F, -4.5292F);
        this.shoulder.addChild(legFrontR);
        this.setRotateAngle(legFrontR, -0.0436F, 0.0F, -0.1309F);


        this.upperLegFrontR_r1 = new AdvancedModelRendererExtended(this);
        this.upperLegFrontR_r1.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.legFrontR.addChild(upperLegFrontR_r1);
        this.setRotateAngle(upperLegFrontR_r1, 0.1309F, 0.6109F, -0.1309F);
        this.upperLegFrontR_r1.cubeList.add(new ModelBox(upperLegFrontR_r1, 96, 80, -7.5F, -2.5F, -2.5F, 9, 5, 5, 0.0F, true));

        this.legFrontRLower = new AdvancedModelRendererExtended(this);
        this.legFrontRLower.setRotationPoint(-4.5613F, 0.5798F, 3.7987F);
        this.legFrontR.addChild(legFrontRLower);
        this.setRotateAngle(legFrontRLower, 0.0F, 0.0436F, 0.2182F);


        this.lowerLegFrontR_r1 = new AdvancedModelRendererExtended(this);
        this.lowerLegFrontR_r1.setRotationPoint(-0.1296F, 4.4815F, 0.1958F);
        this.legFrontRLower.addChild(lowerLegFrontR_r1);
        this.setRotateAngle(lowerLegFrontR_r1, 0.1309F, 0.0F, 0.0873F);
        this.lowerLegFrontR_r1.cubeList.add(new ModelBox(lowerLegFrontR_r1, 0, 0, -2.0F, -6.0F, -2.5F, 4, 9, 5, 0.0F, true));

        this.legFrontRFoot = new AdvancedModelRendererExtended(this);
        this.legFrontRFoot.setRotationPoint(-0.5046F, 7.4765F, -0.5879F);
        this.legFrontRLower.addChild(legFrontRFoot);
        this.setRotateAngle(legFrontRFoot, 0.1745F, 0.0873F, -0.0436F);


        this.legFrontRFootb_r1 = new AdvancedModelRendererExtended(this);
        this.legFrontRFootb_r1.setRotationPoint(1.3211F, 0.005F, 4.19F);
        this.legFrontRFoot.addChild(legFrontRFootb_r1);
        this.setRotateAngle(legFrontRFootb_r1, 0.0F, 0.0873F, 0.0F);
        this.legFrontRFootb_r1.cubeList.add(new ModelBox(legFrontRFootb_r1, 113, 50, -2.0F, -1.01F, -9.0F, 4, 2, 9, 0.0F, true));

        this.legFrontRFoota_r1 = new AdvancedModelRendererExtended(this);
        this.legFrontRFoota_r1.setRotationPoint(1.3211F, 0.005F, 4.19F);
        this.legFrontRFoot.addChild(legFrontRFoota_r1);
        this.setRotateAngle(legFrontRFoota_r1, 0.0F, 0.5236F, 0.0F);
        this.legFrontRFoota_r1.cubeList.add(new ModelBox(legFrontRFoota_r1, 113, 61, -3.0F, -1.0F, -9.0F, 5, 2, 9, 0.0F, true));

        this.legFrontL = new AdvancedModelRendererExtended(this);
        this.legFrontL.setRotationPoint(5.5F, 7.0722F, -4.5292F);
        this.shoulder.addChild(legFrontL);
        this.setRotateAngle(legFrontL, -0.0436F, 0.0F, 0.1309F);


        this.upperLegFrontL_r1 = new AdvancedModelRendererExtended(this);
        this.upperLegFrontL_r1.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.legFrontL.addChild(upperLegFrontL_r1);
        this.setRotateAngle(upperLegFrontL_r1, 0.1309F, -0.6109F, 0.1309F);
        this.upperLegFrontL_r1.cubeList.add(new ModelBox(upperLegFrontL_r1, 96, 80, -1.5F, -2.5F, -2.5F, 9, 5, 5, 0.0F, false));

        this.legFrontLLower = new AdvancedModelRendererExtended(this);
        this.legFrontLLower.setRotationPoint(4.5613F, 0.5798F, 3.7987F);
        this.legFrontL.addChild(legFrontLLower);
        this.setRotateAngle(legFrontLLower, 0.0F, -0.0436F, -0.2182F);


        this.lowerLegFrontL_r1 = new AdvancedModelRendererExtended(this);
        this.lowerLegFrontL_r1.setRotationPoint(0.1296F, 4.4815F, 0.1958F);
        this.legFrontLLower.addChild(lowerLegFrontL_r1);
        this.setRotateAngle(lowerLegFrontL_r1, 0.1309F, 0.0F, -0.0873F);
        this.lowerLegFrontL_r1.cubeList.add(new ModelBox(lowerLegFrontL_r1, 0, 0, -2.0F, -6.0F, -2.5F, 4, 9, 5, 0.0F, false));

        this.legFrontLFoot = new AdvancedModelRendererExtended(this);
        this.legFrontLFoot.setRotationPoint(1.5046F, 7.4765F, -0.5879F);
        this.legFrontLLower.addChild(legFrontLFoot);
        this.setRotateAngle(legFrontLFoot, 0.1745F, -0.0873F, 0.0436F);


        this.legFrontLFootb_r1 = new AdvancedModelRendererExtended(this);
        this.legFrontLFootb_r1.setRotationPoint(-2.3211F, 0.005F, 4.19F);
        this.legFrontLFoot.addChild(legFrontLFootb_r1);
        this.setRotateAngle(legFrontLFootb_r1, 0.0F, -0.0873F, 0.0F);
        this.legFrontLFootb_r1.cubeList.add(new ModelBox(legFrontLFootb_r1, 113, 50, -2.0F, -1.01F, -9.0F, 4, 2, 9, 0.0F, false));

        this.legFrontLFoota_r1 = new AdvancedModelRendererExtended(this);
        this.legFrontLFoota_r1.setRotationPoint(-2.3211F, 0.005F, 4.19F);
        this.legFrontLFoot.addChild(legFrontLFoota_r1);
        this.setRotateAngle(legFrontLFoota_r1, 0.0F, -0.5236F, 0.0F);
        this.legFrontLFoota_r1.cubeList.add(new ModelBox(legFrontLFoota_r1, 113, 61, -2.0F, -1.0F, -9.0F, 5, 2, 9, 0.0F, false));

        this.neck = new AdvancedModelRendererExtended(this);
        this.neck.setRotationPoint(-0.5F, -0.2814F, -8.5167F);
        this.shoulder.addChild(neck);


        this.neckL_r1 = new AdvancedModelRendererExtended(this);
        this.neckL_r1.setRotationPoint(0.5F, 10.4953F, 0.3764F);
        this.neck.addChild(neckL_r1);
        this.setRotateAngle(neckL_r1, -0.6109F, 0.0F, 0.0F);
        this.neckL_r1.cubeList.add(new ModelBox(neckL_r1, 24, 101, -2.5F, -6.1417F, -8.1389F, 5, 5, 10, 0.0F, false));

        this.neck_r1 = new AdvancedModelRendererExtended(this);
        this.neck_r1.setRotationPoint(0.0F, 2.4658F, -3.4073F);
        this.neck.addChild(neck_r1);
        this.setRotateAngle(neck_r1, 0.1309F, 0.0F, 0.0F);
        this.neck_r1.cubeList.add(new ModelBox(neck_r1, 0, 109, -2.5F, -3.0F, -3.5F, 6, 6, 7, 0.0F, false));

        this.head = new AdvancedModelRendererExtended(this);
        this.head.setRotationPoint(0.0F, 1.3536F, -6.5125F);
        this.neck.addChild(head);


        this.skullTop = new AdvancedModelRendererExtended(this);
        this.skullTop.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.head.addChild(skullTop);
        this.setRotateAngle(skullTop, 0.1309F, 0.0F, 0.0F);
        this.skullTop.cubeList.add(new ModelBox(skullTop, 0, 14, -1.5F, -1.5F, -2.5F, 4, 4, 2, 0.0F, false));
        this.skullTop.cubeList.add(new ModelBox(skullTop, 13, 0, -1.0F, -1.5F, -4.5F, 3, 3, 2, 0.0F, false));

        this.skullT4_r1 = new AdvancedModelRendererExtended(this);
        this.skullT4_r1.setRotationPoint(0.5F, -0.1718F, -5.2379F);
        this.skullTop.addChild(skullT4_r1);
        this.setRotateAngle(skullT4_r1, 0.5672F, 0.0F, 0.0F);
        this.skullT4_r1.cubeList.add(new ModelBox(skullT4_r1, 0, 0, -0.5F, -1.0F, -0.4121F, 1, 2, 1, 0.0F, false));

        this.skullT3_r1 = new AdvancedModelRendererExtended(this);
        this.skullT3_r1.setRotationPoint(0.5F, 0.0164F, -4.7729F);
        this.skullTop.addChild(skullT3_r1);
        this.setRotateAngle(skullT3_r1, 0.1745F, 0.0F, 0.0F);
        this.skullT3_r1.cubeList.add(new ModelBox(skullT3_r1, 0, 40, -1.0F, -1.4164F, -0.4F, 2, 3, 1, 0.0F, false));

        this.skullJaw = new AdvancedModelRendererExtended(this);
        this.skullJaw.setRotationPoint(0.5012F, 1.9623F, -1.7822F);
        this.skullTop.addChild(skullJaw);
        this.skullJaw.cubeList.add(new ModelBox(skullJaw, 0, 20, -1.8988F, -0.5F, -0.7395F, 2, 1, 2, 0.0F, false));
        this.skullJaw.cubeList.add(new ModelBox(skullJaw, 12, 17, -0.0987F, -0.5F, -0.7395F, 2, 1, 2, 0.0F, false));
        this.skullJaw.cubeList.add(new ModelBox(skullJaw, 12, 14, -1.5012F, -0.5023F, -2.7105F, 3, 1, 2, 0.0F, false));
        this.skullJaw.cubeList.add(new ModelBox(skullJaw, 6, 20, -1.0012F, -0.4973F, -3.1178F, 2, 1, 1, 0.0F, false));
        this.skullJaw.cubeList.add(new ModelBox(skullJaw, 0, 45, -1.0012F, -1.4623F, -0.7178F, 2, 1, 1, 0.0F, false));

        this.rump = new AdvancedModelRendererExtended(this);
        this.rump.setRotationPoint(0.0F, -5.8558F, 0.7994F);
        this.bodyCentreFront.addChild(rump);
        this.rump.cubeList.add(new ModelBox(rump, 59, 0, -7.0F, -0.903F, -0.2456F, 14, 12, 8, 0.0F, false));

        this.rump_r1 = new AdvancedModelRendererExtended(this);
        this.rump_r1.setRotationPoint(-5.5F, -2.403F, 4.7544F);
        this.rump.addChild(rump_r1);
        this.setRotateAngle(rump_r1, -0.3054F, 0.0F, 0.0F);
        this.rump_r1.cubeList.add(new ModelBox(rump_r1, 80, 53, -0.5F, 1.0F, -6.5F, 12, 2, 9, 0.0F, false));

        this.bodyBack = new AdvancedModelRendererExtended(this);
        this.bodyBack.setRotationPoint(-0.5F, 4.597F, 7.2544F);
        this.rump.addChild(bodyBack);


        this.bodyBackUR_r1 = new AdvancedModelRendererExtended(this);
        this.bodyBackUR_r1.setRotationPoint(2.0F, 0.0F, -2.0F);
        this.bodyBack.addChild(bodyBackUR_r1);
        this.setRotateAngle(bodyBackUR_r1, -0.2182F, -0.2182F, 0.0F);
        this.bodyBackUR_r1.cubeList.add(new ModelBox(bodyBackUR_r1, 0, 93, -4.3F, -5.4F, -1.0F, 9, 8, 8, 0.0F, false));

        this.bodyBackLL_r1 = new AdvancedModelRendererExtended(this);
        this.bodyBackLL_r1.setRotationPoint(2.0F, 0.0F, -2.0F);
        this.bodyBack.addChild(bodyBackLL_r1);
        this.setRotateAngle(bodyBackLL_r1, 0.2182F, -0.2182F, 0.0F);
        this.bodyBackLL_r1.cubeList.add(new ModelBox(bodyBackLL_r1, 83, 64, -4.31F, -2.5F, -1.0F, 9, 8, 8, 0.0F, false));

        this.bodyBackLR_r1 = new AdvancedModelRendererExtended(this);
        this.bodyBackLR_r1.setRotationPoint(0.0F, 0.0F, -2.0F);
        this.bodyBack.addChild(bodyBackLR_r1);
        this.setRotateAngle(bodyBackLR_r1, 0.2182F, 0.2182F, 0.0F);
        this.bodyBackLR_r1.cubeList.add(new ModelBox(bodyBackLR_r1, 83, 64, -4.69F, -2.5F, -1.0F, 9, 8, 8, 0.0F, true));

        this.bodyBackUR_r2 = new AdvancedModelRendererExtended(this);
        this.bodyBackUR_r2.setRotationPoint(0.0F, 0.0F, -2.0F);
        this.bodyBack.addChild(bodyBackUR_r2);
        this.setRotateAngle(bodyBackUR_r2, -0.2182F, 0.2182F, 0.0F);
        this.bodyBackUR_r2.cubeList.add(new ModelBox(bodyBackUR_r2, 98, 91, -5.8F, -5.4F, -1.0F, 9, 8, 8, 0.0F, false));

        this.tail1 = new AdvancedModelRendererExtended(this);
        this.tail1.setRotationPoint(0.0F, 0.0F, 5.0F);
        this.bodyBack.addChild(tail1);


        this.tail1_r1 = new AdvancedModelRendererExtended(this);
        this.tail1_r1.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.tail1.addChild(tail1_r1);
        this.setRotateAngle(tail1_r1, -0.1309F, 0.0F, 0.0F);
        this.tail1_r1.cubeList.add(new ModelBox(tail1_r1, 82, 20, -4.0F, -4.0F, 0.0F, 9, 8, 11, 0.0F, false));

        this.tail2 = new AdvancedModelRendererExtended(this);
        this.tail2.setRotationPoint(0.5F, 1.2633F, 11.0496F);
        this.tail1.addChild(tail2);


        this.tail2_r1 = new AdvancedModelRendererExtended(this);
        this.tail2_r1.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.tail2.addChild(tail2_r1);
        this.setRotateAngle(tail2_r1, -0.0873F, 0.0F, 0.0F);
        this.tail2_r1.cubeList.add(new ModelBox(tail2_r1, 70, 82, -4.0F, -3.5F, -1.0F, 8, 7, 10, 0.0F, false));

        this.tail3 = new AdvancedModelRendererExtended(this);
        this.tail3.setRotationPoint(0.0F, 1.4543F, 9.4111F);
        this.tail2.addChild(tail3);


        this.tail3_r1 = new AdvancedModelRendererExtended(this);
        this.tail3_r1.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.tail3.addChild(tail3_r1);
        this.setRotateAngle(tail3_r1, -0.0436F, 0.0F, 0.0F);
        this.tail3_r1.cubeList.add(new ModelBox(tail3_r1, 61, 99, -3.0F, -3.5F, -0.5F, 6, 6, 9, 0.0F, false));

        this.tail4 = new AdvancedModelRendererExtended(this);
        this.tail4.setRotationPoint(0.0F, 0.0824F, 8.0393F);
        this.tail3.addChild(tail4);
        this.tail4.cubeList.add(new ModelBox(tail4, 103, 0, -2.5F, -3.0F, -0.5F, 5, 5, 9, 0.0F, false));

        this.tail5 = new AdvancedModelRendererExtended(this);
        this.tail5.setRotationPoint(0.0F, -0.1619F, 8.0703F);
        this.tail4.addChild(tail5);


        this.tail5_r1 = new AdvancedModelRendererExtended(this);
        this.tail5_r1.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.tail5.addChild(tail5_r1);
        this.setRotateAngle(tail5_r1, 0.0436F, 0.0F, 0.0F);
        this.tail5_r1.cubeList.add(new ModelBox(tail5_r1, 97, 107, -2.0F, -2.0F, -0.5F, 4, 4, 9, 0.0F, false));

        this.tail6 = new AdvancedModelRendererExtended(this);
        this.tail6.setRotationPoint(0.0F, 0.0F, 8.0F);
        this.tail5.addChild(tail6);


        this.tail5_r2 = new AdvancedModelRendererExtended(this);
        this.tail5_r2.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.tail6.addChild(tail5_r2);
        this.setRotateAngle(tail5_r2, 0.0436F, 0.0F, 0.0F);
        this.tail5_r2.cubeList.add(new ModelBox(tail5_r2, 80, 103, -1.0F, -1.0F, 0.5F, 2, 2, 11, 0.0F, false));

        this.legBackR = new AdvancedModelRendererExtended(this);
        this.legBackR.setRotationPoint(-1.0F, 0.0F, 5.0F);
        this.bodyBack.addChild(legBackR);
        this.setRotateAngle(legBackR, 0.0873F, 0.0873F, 0.0F);


        this.upperLegBackR_r1 = new AdvancedModelRendererExtended(this);
        this.upperLegBackR_r1.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.legBackR.addChild(upperLegBackR_r1);
        this.setRotateAngle(upperLegBackR_r1, 0.2182F, 0.6981F, 0.0F);
        this.upperLegBackR_r1.cubeList.add(new ModelBox(upperLegBackR_r1, 36, 82, -2.5F, -3.0F, -11.25F, 5, 7, 12, 0.0F, true));

        this.legBackRLower = new AdvancedModelRendererExtended(this);
        this.legBackRLower.setRotationPoint(-6.0F, 4.5F, -6.0F);
        this.legBackR.addChild(legBackRLower);
        this.setRotateAngle(legBackRLower, 0.0436F, 0.0F, 0.0F);


        this.lowerLegBackR_r1 = new AdvancedModelRendererExtended(this);
        this.lowerLegBackR_r1.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.legBackRLower.addChild(lowerLegBackR_r1);
        this.setRotateAngle(lowerLegBackR_r1, 0.0873F, -0.829F, 0.0F);
        this.lowerLegBackR_r1.cubeList.add(new ModelBox(lowerLegBackR_r1, 37, 69, -2.0F, -0.5F, -3.0F, 5, 6, 4, 0.0F, true));

        this.legBackRFoot = new AdvancedModelRendererExtended(this);
        this.legBackRFoot.setRotationPoint(0.6789F, 6.4219F, -0.1893F);
        this.legBackRLower.addChild(legBackRFoot);
        this.setRotateAngle(legBackRFoot, 0.0F, 0.2618F, 0.0F);


        this.legFrontLFootb_r2 = new AdvancedModelRendererExtended(this);
        this.legFrontLFootb_r2.setRotationPoint(1.2276F, -1.4087F, 2.5514F);
        this.legBackRFoot.addChild(legFrontLFootb_r2);
        this.setRotateAngle(legFrontLFootb_r2, 0.0F, 0.0873F, 0.0F);
        this.legFrontLFootb_r2.cubeList.add(new ModelBox(legFrontLFootb_r2, 113, 50, -2.0F, -0.5231F, -9.0F, 4, 2, 9, 0.0F, true));

        this.legFrontLFoota_r2 = new AdvancedModelRendererExtended(this);
        this.legFrontLFoota_r2.setRotationPoint(1.2276F, -1.4087F, 2.5514F);
        this.legBackRFoot.addChild(legFrontLFoota_r2);
        this.setRotateAngle(legFrontLFoota_r2, 0.0F, 0.5236F, 0.0F);
        this.legFrontLFoota_r2.cubeList.add(new ModelBox(legFrontLFoota_r2, 113, 61, -3.0F, -0.5131F, -9.0F, 5, 2, 9, 0.0F, true));

        this.legBackL = new AdvancedModelRendererExtended(this);
        this.legBackL.setRotationPoint(3.0F, 0.0F, 5.0F);
        this.bodyBack.addChild(legBackL);
        this.setRotateAngle(legBackL, 0.0873F, -0.0873F, 0.0F);


        this.upperLegBackL_r1 = new AdvancedModelRendererExtended(this);
        this.upperLegBackL_r1.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.legBackL.addChild(upperLegBackL_r1);
        this.setRotateAngle(upperLegBackL_r1, 0.2182F, -0.6981F, 0.0F);
        this.upperLegBackL_r1.cubeList.add(new ModelBox(upperLegBackL_r1, 36, 82, -2.5F, -3.0F, -11.25F, 5, 7, 12, 0.0F, false));

        this.legBackLLower = new AdvancedModelRendererExtended(this);
        this.legBackLLower.setRotationPoint(6.0F, 4.5F, -6.0F);
        this.legBackL.addChild(legBackLLower);
        this.setRotateAngle(legBackLLower, 0.0436F, 0.0F, 0.0F);


        this.lowerLegBackL_r1 = new AdvancedModelRendererExtended(this);
        this.lowerLegBackL_r1.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.legBackLLower.addChild(lowerLegBackL_r1);
        this.setRotateAngle(lowerLegBackL_r1, 0.0873F, 0.829F, 0.0F);
        this.lowerLegBackL_r1.cubeList.add(new ModelBox(lowerLegBackL_r1, 37, 69, -3.0F, -0.5F, -3.0F, 5, 6, 4, 0.0F, false));

        this.legBackLFoot = new AdvancedModelRendererExtended(this);
        this.legBackLFoot.setRotationPoint(-0.3689F, 5.0081F, -1.7029F);
        this.legBackLLower.addChild(legBackLFoot);
        this.setRotateAngle(legBackLFoot, 0.0F, -0.2618F, 0.0F);


        this.legFrontLFootb_r3 = new AdvancedModelRendererExtended(this);
        this.legFrontLFootb_r3.setRotationPoint(-1.5376F, 0.005F, 4.065F);
        this.legBackLFoot.addChild(legFrontLFootb_r3);
        this.setRotateAngle(legFrontLFootb_r3, 0.0F, -0.0873F, 0.0F);
        this.legFrontLFootb_r3.cubeList.add(new ModelBox(legFrontLFootb_r3, 113, 50, -2.0F, -0.5231F, -9.0F, 4, 2, 9, 0.0F, false));

        this.legFrontLFoota_r3 = new AdvancedModelRendererExtended(this);
        this.legFrontLFoota_r3.setRotationPoint(-1.5376F, 0.005F, 4.065F);
        this.legBackLFoot.addChild(legFrontLFoota_r3);
        this.setRotateAngle(legFrontLFoota_r3, 0.0F, -0.5236F, 0.0F);
        this.legFrontLFoota_r3.cubeList.add(new ModelBox(legFrontLFoota_r3, 113, 61, -2.0F, -0.5131F, -9.0F, 5, 2, 9, 0.0F, false));

        updateDefaultPose();
        animator = ModelAnimator.create();
    }

    @Override
    public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        animate((IAnimatedEntity) entity, f, f1, f2, f3, f4, f5);
        this.main.render(f5);
    }

    public void renderStaticWall(float f) {
        this.neck.offsetY = -0.03F;
        this.neck.render(0.01F);
        this.resetToDefaultPose();
    }

    public void renderStaticFloor(float f) {
        this.setRotateAngle(bodyCentreFront, 0.0F, 0.0F, 0.0F);
        this.setRotateAngle(neck, -0.15F, 0.0F, 0.0F);
        this.setRotateAngle(head, -0.05F, 0.1F, 0.0F);
        this.setRotateAngle(skullJaw, 0.3F, 0.0F, 0.0F);
        this.setRotateAngle(tail1, 0.0F, 0.1F, 0.0F);
        this.setRotateAngle(tail2, 0.0F, 0.2F, 0.0F);
        this.setRotateAngle(tail3, 0.0F, 0.3F, 0.0F);
        this.setRotateAngle(tail4, 0.0F, -0.4F, 0.0F);
        this.setRotateAngle(tail5, 0.0F, -0.5F, 0.0F);
        this.setRotateAngle(tail6, 0.0F, -0.5F, 0.0F);
        this.main.offsetY = -0.164F;
        this.main.render(0.01F);
        this.resetToDefaultPose();
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
        //this.main.offsetY = -0.06F;

        EntityPrehistoricFloraCotylorhynchus Cotylorhynchus = (EntityPrehistoricFloraCotylorhynchus) e;
        float masterSpeed = Cotylorhynchus.getTravelSpeed();

        //masterSpeed = 0.315F;

        this.faceTarget(f3, f4, 3, neck);
        this.faceTarget(f3, f4, 5, head);

        AdvancedModelRendererExtended[] Tail = {this.tail1, this.tail2, this.tail3, this.tail4, this.tail5, this.tail6};
        Cotylorhynchus.tailBuffer.applyChainSwingBuffer(Tail);

        if (Cotylorhynchus.getAnimation() == Cotylorhynchus.LAY_ANIMATION) {
            this.swing(neck, 0.5F, 0.10F, false, 0.5F,-0.05F, f2, 0.8F);
            this.walk(neck, 0.5F * 2, -0.02F, false, 0.5F,0.01F, f2, 0.8F);
            return;
        }

        if (f3 == 0.0F || !Cotylorhynchus.getIsMoving()) { //Not moving
            this.swing(neck, 0.06F, 0.10F, false, 0.5F,-0.05F, f2, 0.8F);
            this.walk(neck, 0.06F * 2F, -0.02F, false, 0.5F,0.01F, f2, 0.8F);
            this.chainWave(Tail, (0.06F*0.9F), 0.02F, 0.1F, f2, 1F);
            this.chainSwing(Tail, (0.06F*0.9F) * 2F, 0.05F, 0.06F, f2, 1F);
            return;
        }

        //float speed = masterSpeed / 2.625F;
        float speed = masterSpeed / 2.225F;
        if (Cotylorhynchus.getIsFast()) {
            speed = speed * 2;
        }

        if (Cotylorhynchus.getAnimation() != Cotylorhynchus.ATTACK_ANIMATION) {
            this.legFrontL.offsetY = this.moveBoxExtended(speed, (float) Math.toRadians(1.0), false, 3, f2, 1.5F);
            this.legFrontR.offsetY = this.moveBoxExtended(speed, (float) Math.toRadians(1.0), false, 6, f2, 1.5F);
        }
        this.legBackL.offsetY = this.moveBoxExtended(speed, (float) Math.toRadians(0.75), false, 4, f2, 1.5F);;
        this.legBackR.offsetY = this.moveBoxExtended(speed, (float) Math.toRadians(0.75), false, 7, f2, 1.5F);;

        if (Cotylorhynchus.getAnimation() != Cotylorhynchus.ATTACK_ANIMATION) {
            this.swing(legFrontL, speed, -0.25F, false, 3, 0.35F, f2, 1F);
            this.swing(legFrontR, speed, 0.25F, false, 0, -0.35F, f2, 1F);
        }
        this.swing(legBackL, speed, 0.25F, false, 3, -0.30F, f2, 1F);
        this.swing(legBackR, speed, -0.25F, false, 0, 0.30F, f2, 1F);

        if (Cotylorhynchus.getAnimation() != Cotylorhynchus.ATTACK_ANIMATION) {
            this.flap(legFrontL, speed, 0.35F, true, 1, 0.125F, f2, 1F);
            this.flap(legFrontR, speed, -0.35F, true, 4, -0.125F, f2, 1F);
        }
        this.walk(legBackL, speed, 0.25F, true, 4, 0.125F, f2, 1F);
        this.walk(legBackR, speed, 0.25F, true, 1, 0.125F, f2, 1F);

        if (Cotylorhynchus.getAnimation() != Cotylorhynchus.ATTACK_ANIMATION) {
            this.walk(legFrontLLower, speed, 0.35F, true, 0, 0.17F, f2, 1F);
            this.walk(legFrontRLower, speed, 0.35F, true, 3, 0.17F, f2, 1F);
        }
        this.walk(legBackLLower, speed, 0.35F, true, 3, 0.17F, f2, 1F);
        this.walk(legBackRLower, speed, 0.35F, true, 0, 0.17F, f2, 1F);

        this.swing(legBackLFoot, speed, -0.2F, false, 5, 0.10F, f2, 1F);
        this.swing(legBackRFoot, speed, 0.2F, false, 2, -0.10F, f2, 1F);

        if (Cotylorhynchus.getAnimation() != Cotylorhynchus.ATTACK_ANIMATION) {
            this.walk(legFrontLFoot, speed, -0.21F, true, 2, 0F, f2, 1F);
            this.walk(legFrontRFoot, speed, -0.21F, true, 5, 0F, f2, 1F);

            this.flap(legFrontLFoot, speed, -0.3F, true, 7, -0.1F, f2, 1F);
            this.flap(legFrontRFoot, speed, 0.3F, true, 4, 0.1F, f2, 1F);
        }

        this.walk(legBackLFoot, speed, 0.21F, true, 7, -0.12F, f2, 1F);
        this.walk(legBackRFoot, speed, 0.21F, true, 4, -0.12F, f2, 1F);

        this.bobExtended(main, speed * 2F, 0.2F, false, 2.5F,  f2, 1F);

        this.flap(rump, speed, 0.05F, false, 3.5F,0.025F, f2, 1.0F);
        this.flap(shoulder, speed, -0.05F, false, 3.5F,-0.025F, f2, 1.0F);
        this.walk(shoulder, speed * 2, 0.04F, false, 2.5F,-0.01F, f2, 0.8F);

        if (Cotylorhynchus.getAnimation() != Cotylorhynchus.ATTACK_ANIMATION) {
            this.swing(neck, speed, 0.10F, false, 0.5F, -0.05F, f2, 0.8F);
            this.walk(neck, speed * 2, -0.02F, false, 0.5F, 0.01F, f2, 0.8F);
        }
        this.chainWave(Tail, (0.06F*0.9F), 0.02F, 0.1F, f2, 1F);
        this.chainSwing(Tail, (0.06F*0.9F) * 2F, 0.05F, 0.06F, f2, 1F);

        this.main.offsetZ = this.moveBoxExtended(speed * 2, (float) Math.toRadians(2.2), false, 1.5F, f2, 1);

    }

    @Override
    public void setLivingAnimations(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime) {
        super.setLivingAnimations(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime);
        this.resetToDefaultPose();
        EntityPrehistoricFloraCotylorhynchus ee = (EntityPrehistoricFloraCotylorhynchus) entitylivingbaseIn;

        if (!ee.isReallyInWater()) {
            if (ee.getIsMoving()) {
                if (ee.getIsFast()) { //Running
                    //animRunning(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime);
                } else { //Walking
                    //animWalking(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime);
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
            //animEat(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime, ee.getAnimationTick());
        }
        else if (ee.getAnimation() == ee.ATTACK_ANIMATION) {
            animAttack(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime, ee.getAnimationTick());
        }
        else if (ee.getAnimation() == ee.MAKE_NEST_ANIMATION) {
            //animNest(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime, ee.getAnimationTick());
        }
        else if (ee.getAnimation() == ee.LAY_ANIMATION) {
            //animLay(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime, ee.getAnimationTick());
        }
        else if (ee.getAnimation() == ee.ROAR_ANIMATION) { //The noise anim
            //animNoise(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime, ee.getAnimationTick());
        }

    }

    public void animAttack(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime, double animTick) {
        EntityPrehistoricFloraCotylorhynchus entity = (EntityPrehistoricFloraCotylorhynchus) entitylivingbaseIn;

        int animCycle = 18;
        double tickAnim = animTick + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;
         if (tickAnim >= 0 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 0) / 5) * (2.51033-(0)));
            yy = 0 + (((tickAnim - 0) / 5) * (-1.48429-(0)));
            zz = 0 + (((tickAnim - 0) / 5) * (-0.2831-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 9) {
            xx = 2.51033 + (((tickAnim - 5) / 4) * (-4.0437-(2.51033)));
            yy = -1.48429 + (((tickAnim - 5) / 4) * (1.56316-(-1.48429)));
            zz = -0.2831 + (((tickAnim - 5) / 4) * (-0.65313-(-0.2831)));
        }
        else if (tickAnim >= 9 && tickAnim < 18) {
            xx = -4.0437 + (((tickAnim - 9) / 9) * (0-(-4.0437)));
            yy = 1.56316 + (((tickAnim - 9) / 9) * (0-(1.56316)));
            zz = -0.65313 + (((tickAnim - 9) / 9) * (0-(-0.65313)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(shoulder, shoulder.rotateAngleX + (float) Math.toRadians(xx), shoulder.rotateAngleY + (float) Math.toRadians(yy), shoulder.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 18) {
            xx = 0 + (((tickAnim - 0) / 18) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 18) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 18) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(legFrontR, legFrontR.rotateAngleX + (float) Math.toRadians(xx), legFrontR.rotateAngleY + (float) Math.toRadians(yy), legFrontR.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 0) / 5) * (-7.5-(0)));
            yy = 0 + (((tickAnim - 0) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 5) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 9) {
            xx = -7.5 + (((tickAnim - 5) / 4) * (-0.5-(-7.5)));
            yy = 0 + (((tickAnim - 5) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 5) / 4) * (0-(0)));
        }
        else if (tickAnim >= 9 && tickAnim < 18) {
            xx = -0.5 + (((tickAnim - 9) / 9) * (0-(-0.5)));
            yy = 0 + (((tickAnim - 9) / 9) * (0-(0)));
            zz = 0 + (((tickAnim - 9) / 9) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(legFrontRLower, legFrontRLower.rotateAngleX + (float) Math.toRadians(xx), legFrontRLower.rotateAngleY + (float) Math.toRadians(yy), legFrontRLower.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 0) / 5) * (2.5-(0)));
            yy = 0 + (((tickAnim - 0) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 5) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 18) {
            xx = 2.5 + (((tickAnim - 5) / 13) * (0-(2.5)));
            yy = 0 + (((tickAnim - 5) / 13) * (0-(0)));
            zz = 0 + (((tickAnim - 5) / 13) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(legFrontRFoot, legFrontRFoot.rotateAngleX + (float) Math.toRadians(xx), legFrontRFoot.rotateAngleY + (float) Math.toRadians(yy), legFrontRFoot.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 0) / 5) * (17.51365-(0)));
            yy = 0 + (((tickAnim - 0) / 5) * (-2.41476-(0)));
            zz = 0 + (((tickAnim - 0) / 5) * (-0.64743-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 11) {
            xx = 17.51365 + (((tickAnim - 5) / 6) * (-79.10683-(17.51365)));
            yy = -2.41476 + (((tickAnim - 5) / 6) * (-18.35778-(-2.41476)));
            zz = -0.64743 + (((tickAnim - 5) / 6) * (-37.29642-(-0.64743)));
        }
        else if (tickAnim >= 11 && tickAnim < 14) {
            xx = -79.10683 + (((tickAnim - 11) / 3) * (-66.88492-(-79.10683)));
            yy = -18.35778 + (((tickAnim - 11) / 3) * (29.16727-(-18.35778)));
            zz = -37.29642 + (((tickAnim - 11) / 3) * (-14.572-(-37.29642)));
        }
        else if (tickAnim >= 14 && tickAnim < 18) {
            xx = -66.88492 + (((tickAnim - 14) / 4) * (0-(-66.88492)));
            yy = 29.16727 + (((tickAnim - 14) / 4) * (0-(29.16727)));
            zz = -14.572 + (((tickAnim - 14) / 4) * (0-(-14.572)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(legFrontL, legFrontL.rotateAngleX + (float) Math.toRadians(xx), legFrontL.rotateAngleY + (float) Math.toRadians(yy), legFrontL.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 0) / 5) * (-5-(0)));
            yy = 0 + (((tickAnim - 0) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 5) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 11) {
            xx = -5 + (((tickAnim - 5) / 6) * (-8.12-(-5)));
            yy = 0 + (((tickAnim - 5) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 5) / 6) * (0-(0)));
        }
        else if (tickAnim >= 11 && tickAnim < 18) {
            xx = -8.12 + (((tickAnim - 11) / 7) * (0-(-8.12)));
            yy = 0 + (((tickAnim - 11) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 11) / 7) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(legFrontLLower, legFrontLLower.rotateAngleX + (float) Math.toRadians(xx), legFrontLLower.rotateAngleY + (float) Math.toRadians(yy), legFrontLLower.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 0) / 5) * (-15-(0)));
            yy = 0 + (((tickAnim - 0) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 5) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 8) {
            xx = -15 + (((tickAnim - 5) / 3) * (-0.71-(-15)));
            yy = 0 + (((tickAnim - 5) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 5) / 3) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 11) {
            xx = -0.71 + (((tickAnim - 8) / 3) * (40.63-(-0.71)));
            yy = 0 + (((tickAnim - 8) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 3) * (0-(0)));
        }
        else if (tickAnim >= 11 && tickAnim < 14) {
            xx = 40.63 + (((tickAnim - 11) / 3) * (40.07-(40.63)));
            yy = 0 + (((tickAnim - 11) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 11) / 3) * (0-(0)));
        }
        else if (tickAnim >= 14 && tickAnim < 18) {
            xx = 40.07 + (((tickAnim - 14) / 4) * (0-(40.07)));
            yy = 0 + (((tickAnim - 14) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 14) / 4) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(legFrontLFoot, legFrontLFoot.rotateAngleX + (float) Math.toRadians(xx), legFrontLFoot.rotateAngleY + (float) Math.toRadians(yy), legFrontLFoot.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 0) / 5) * (5-(0)));
            yy = 0 + (((tickAnim - 0) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 5) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 9) {
            xx = 5 + (((tickAnim - 5) / 4) * (-5-(5)));
            yy = 0 + (((tickAnim - 5) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 5) / 4) * (0-(0)));
        }
        else if (tickAnim >= 9 && tickAnim < 12) {
            xx = -5 + (((tickAnim - 9) / 3) * (0-(-5)));
            yy = 0 + (((tickAnim - 9) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 9) / 3) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck, neck.rotateAngleX + (float) Math.toRadians(xx), neck.rotateAngleY + (float) Math.toRadians(yy), neck.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 0) / 5) * (10-(0)));
            yy = 0 + (((tickAnim - 0) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 5) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 8) {
            xx = 10 + (((tickAnim - 5) / 3) * (0-(10)));
            yy = 0 + (((tickAnim - 5) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 5) / 3) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 8) / 2) * (-5-(0)));
            yy = 0 + (((tickAnim - 8) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 2) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 18) {
            xx = -5 + (((tickAnim - 10) / 8) * (0-(-5)));
            yy = 0 + (((tickAnim - 10) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 8) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(head, head.rotateAngleX + (float) Math.toRadians(xx), head.rotateAngleY + (float) Math.toRadians(yy), head.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 0) / 8) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 8) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 8) / 2) * (30-(0)));
            yy = 0 + (((tickAnim - 8) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 2) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 12) {
            xx = 30 + (((tickAnim - 10) / 2) * (0-(30)));
            yy = 0 + (((tickAnim - 10) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 2) * (0-(0)));
        }
        else if (tickAnim >= 12 && tickAnim < 18) {
            xx = 0 + (((tickAnim - 12) / 6) * (0-(0)));
            yy = 0 + (((tickAnim - 12) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 12) / 6) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(skullJaw, skullJaw.rotateAngleX + (float) Math.toRadians(xx), skullJaw.rotateAngleY + (float) Math.toRadians(yy), skullJaw.rotateAngleZ + (float) Math.toRadians(zz));
    }
    public void animate(IAnimatedEntity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        EntityPrehistoricFloraCotylorhynchus e = (EntityPrehistoricFloraCotylorhynchus) entity;
        animator.update(entity);
        this.resetToDefaultPose();
        setRotationAngles(f, f1, f2, f3, f4, f5, (Entity) entity);

        animator.setAnimation(e.EAT_ANIMATION); //10 ticks
        animator.startKeyframe(4);
        animator.rotate(this.shoulder, (float) Math.toRadians(3), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(this.legFrontL, (float) Math.toRadians(-3), 0,0);
        animator.rotate(this.legFrontR, (float) Math.toRadians(-3), 0,0);
        animator.rotate(this.legFrontLLower, (float) Math.toRadians(3), 0,0);
        animator.rotate(this.legFrontRLower, (float) Math.toRadians(3), 0,0);
        animator.rotate(this.neck, (float) Math.toRadians(25), 0,0);
        animator.rotate(this.head, (float) Math.toRadians(15), 0,0);
        animator.rotate(this.skullJaw, (float) Math.toRadians(40), 0,0);
        animator.endKeyframe();
        animator.setStaticKeyframe(2);
        animator.resetKeyframe(4);

        animator.setAnimation(e.ROAR_ANIMATION);
        animator.startKeyframe(10);
        animator.rotate(this.neck, (float) Math.toRadians(-10), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(this.head, (float) Math.toRadians(-12.5), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(this.skullJaw, (float) Math.toRadians(40), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.endKeyframe();
        animator.setStaticKeyframe(10);
        animator.resetKeyframe(10);

        animator.setAnimation(e.LAY_ANIMATION); //50 ticks
        animator.startKeyframe(15);
        animator.move(this.main, 0, 5,0);
        animator.rotate(this.legBackL, (float) Math.toRadians(-20), 0,0);
        animator.rotate(this.legBackR, (float) Math.toRadians(-20), 0,0);
        animator.rotate(this.legFrontL, 0,0, (float) Math.toRadians(20));
        animator.rotate(this.legFrontR, 0,0, (float) Math.toRadians(20));
        animator.rotate(this.legBackLLower, (float) Math.toRadians(20), 0,0);
        animator.rotate(this.legBackRLower, (float) Math.toRadians(20), 0,0);
        animator.rotate(this.legFrontLLower, 0,0, (float) Math.toRadians(-20));
        animator.rotate(this.legFrontRLower, 0,0, (float) Math.toRadians(-20));
        animator.rotate(this.tail1, (float) Math.toRadians(10), 0,0);
        animator.rotate(this.tail2, (float) Math.toRadians(10), 0,0);
        animator.rotate(this.neck, (float) Math.toRadians(-15), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(this.head, (float) Math.toRadians(-17.5), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(this.skullJaw, (float) Math.toRadians(40), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.endKeyframe();
        animator.setStaticKeyframe(20);
        animator.resetKeyframe(15);

    }
}
