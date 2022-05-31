package net.lepidodendron.entity.model.entity;

import net.ilexiconn.llibrary.client.model.tools.AdvancedModelBase;
import net.ilexiconn.llibrary.client.model.tools.AdvancedModelRenderer;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.client.renderer.GlStateManager;

public class ModelAcutiramusPlinth extends AdvancedModelBase {
    private final AdvancedModelRenderer body;
    private final AdvancedModelRenderer eyeL_r1;
    private final AdvancedModelRenderer eyeR_r1;
    private final AdvancedModelRenderer cheliceraL;
    private final AdvancedModelRenderer cheliceraL_r1;
    private final AdvancedModelRenderer clawbaseL;
    private final AdvancedModelRenderer clawnotmoveL_r1;
    private final AdvancedModelRenderer clawL;
    private final AdvancedModelRenderer clawmovespineL_r1;
    private final AdvancedModelRenderer cheliceraR;
    private final AdvancedModelRenderer cheliceraR_r1;
    private final AdvancedModelRenderer clawbaseR;
    private final AdvancedModelRenderer clawnotmovespineR_r1;
    private final AdvancedModelRenderer clawR;
    private final AdvancedModelRenderer clawmoveR_r1;
    private final AdvancedModelRenderer legsR;
    private final AdvancedModelRenderer legR1;
    private final AdvancedModelRenderer legR1_r1;
    private final AdvancedModelRenderer legR2;
    private final AdvancedModelRenderer legR3;
    private final AdvancedModelRenderer legR3_r1;
    private final AdvancedModelRenderer legR5;
    private final AdvancedModelRenderer legR5_ptery2_r1;
    private final AdvancedModelRenderer legR4;
    private final AdvancedModelRenderer legR4_r1;
    private final AdvancedModelRenderer legsL;
    private final AdvancedModelRenderer legL1;
    private final AdvancedModelRenderer legL1_r1;
    private final AdvancedModelRenderer legL2;
    private final AdvancedModelRenderer legL3;
    private final AdvancedModelRenderer legL3_r1;
    private final AdvancedModelRenderer legL4;
    private final AdvancedModelRenderer legL4_r1;
    private final AdvancedModelRenderer legL5;
    private final AdvancedModelRenderer legL5_ptery2_r1;
    private final AdvancedModelRenderer opisthosoma;
    private final AdvancedModelRenderer coxa2_r1;
    private final AdvancedModelRenderer tergiteA;
    private final AdvancedModelRenderer tergiteA2;
    private final AdvancedModelRenderer tergiteA3;
    private final AdvancedModelRenderer tergiteA4;
    private final AdvancedModelRenderer tergiteB;
    private final AdvancedModelRenderer tergiteC;
    private final AdvancedModelRenderer tergiteD;
    private final AdvancedModelRenderer tergiteD2;
    private final AdvancedModelRenderer tergiteE;
    private final AdvancedModelRenderer tergiteE2;
    private final AdvancedModelRenderer tergiteF;
    private final AdvancedModelRenderer telson;


    public ModelAcutiramusPlinth() {
        this.textureWidth = 128;
        this.textureHeight = 128;

        this.body = new AdvancedModelRenderer(this);
        this.body.setRotationPoint(0.0F, 24.0F, 0.0F);
        this.setRotateAngle(body, 0.829F, 0.0F, 0.0F);
        this.body.cubeList.add(new ModelBox(body, 22, 22, -5.0F, -4.0325F, -6.0F, 10, 3, 8, 0.0F, false));
        this.body.cubeList.add(new ModelBox(body, 21, 28, -1.5F, -4.05F, -2.0F, 3, 1, 1, 0.0F, false));
        this.body.cubeList.add(new ModelBox(body, 0, 51, -3.0F, -1.75F, -3.0F, 6, 2, 3, 0.0F, false));

        this.eyeL_r1 = new AdvancedModelRenderer(this);
        this.eyeL_r1.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.body.addChild(eyeL_r1);
        this.setRotateAngle(eyeL_r1, 0.0F, 0.0873F, 0.0F);
        this.eyeL_r1.cubeList.add(new ModelBox(eyeL_r1, 6, 56, 3.6F, -4.1F, -6.0F, 2, 1, 3, 0.0F, false));

        this.eyeR_r1 = new AdvancedModelRenderer(this);
        this.eyeR_r1.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.body.addChild(eyeR_r1);
        this.setRotateAngle(eyeR_r1, 0.0F, -0.0873F, 0.0F);
        this.eyeR_r1.cubeList.add(new ModelBox(eyeR_r1, 56, 44, -5.6F, -4.1F, -6.0F, 2, 1, 3, 0.0F, false));

        this.cheliceraL = new AdvancedModelRenderer(this);
        this.cheliceraL.setRotationPoint(1.0F, -1.0F, -5.5F);
        this.body.addChild(cheliceraL);
        this.setRotateAngle(cheliceraL, 0.3054F, -0.3054F, 0.0F);


        this.cheliceraL_r1 = new AdvancedModelRenderer(this);
        this.cheliceraL_r1.setRotationPoint(-1.0F, 1.0F, 5.75F);
        this.cheliceraL.addChild(cheliceraL_r1);
        this.setRotateAngle(cheliceraL_r1, 0.0F, -0.0873F, 0.0F);
        this.cheliceraL_r1.cubeList.add(new ModelBox(cheliceraL_r1, 44, 44, 0.0F, -1.0F, -14.0F, 2, 1, 8, 0.0F, false));

        this.clawbaseL = new AdvancedModelRenderer(this);
        this.clawbaseL.setRotationPoint(1.0F, 0.0F, -8.25F);
        this.cheliceraL.addChild(clawbaseL);
        this.setRotateAngle(clawbaseL, 0.0F, 0.1745F, 0.0F);


        this.clawnotmoveL_r1 = new AdvancedModelRenderer(this);
        this.clawnotmoveL_r1.setRotationPoint(-2.0F, 1.0F, 14.0F);
        this.clawbaseL.addChild(clawnotmoveL_r1);
        this.setRotateAngle(clawnotmoveL_r1, 0.0F, -0.0873F, 0.0F);
        this.clawnotmoveL_r1.cubeList.add(new ModelBox(clawnotmoveL_r1, 0, 56, 0.0F, -1.1F, -22.0F, 1, 1, 4, 0.0F, false));
        this.clawnotmoveL_r1.cubeList.add(new ModelBox(clawnotmoveL_r1, 0, 0, 0.0F, -0.6F, -23.0F, 2, 0, 5, 0.0F, false));
        this.clawnotmoveL_r1.cubeList.add(new ModelBox(clawnotmoveL_r1, 24, 33, 0.0F, -1.5F, -18.0F, 3, 2, 4, 0.0F, false));

        this.clawL = new AdvancedModelRenderer(this);
        this.clawL.setRotationPoint(2.0F, 0.0F, -4.0F);
        this.clawbaseL.addChild(clawL);
        this.setRotateAngle(clawL, 0.0F, -0.2182F, 0.0F);


        this.clawmovespineL_r1 = new AdvancedModelRenderer(this);
        this.clawmovespineL_r1.setRotationPoint(-4.0F, 1.0F, 18.0F);
        this.clawL.addChild(clawmovespineL_r1);
        this.setRotateAngle(clawmovespineL_r1, 0.0F, -0.3491F, 0.0F);
        this.clawmovespineL_r1.cubeList.add(new ModelBox(clawmovespineL_r1, 0, 20, -3.5F, -0.5F, -23.0F, 2, 0, 5, 0.0F, false));
        this.clawmovespineL_r1.cubeList.add(new ModelBox(clawmovespineL_r1, 14, 52, -2.5F, -1.0F, -22.0F, 1, 1, 4, 0.0F, false));

        this.cheliceraR = new AdvancedModelRenderer(this);
        this.cheliceraR.setRotationPoint(-1.0F, -1.0F, -5.5F);
        this.body.addChild(cheliceraR);
        this.setRotateAngle(cheliceraR, 0.3491F, 0.3054F, 0.0F);


        this.cheliceraR_r1 = new AdvancedModelRenderer(this);
        this.cheliceraR_r1.setRotationPoint(1.0F, 1.0F, 5.75F);
        this.cheliceraR.addChild(cheliceraR_r1);
        this.setRotateAngle(cheliceraR_r1, 0.0F, 0.0873F, 0.0F);
        this.cheliceraR_r1.cubeList.add(new ModelBox(cheliceraR_r1, 18, 50, -2.0F, -1.0F, -14.0F, 2, 1, 8, 0.0F, false));

        this.clawbaseR = new AdvancedModelRenderer(this);
        this.clawbaseR.setRotationPoint(-1.0F, 0.0F, -8.25F);
        this.cheliceraR.addChild(clawbaseR);
        this.setRotateAngle(clawbaseR, 0.0F, -0.1745F, 0.0F);


        this.clawnotmovespineR_r1 = new AdvancedModelRenderer(this);
        this.clawnotmovespineR_r1.setRotationPoint(2.0F, 1.0F, 14.0F);
        this.clawbaseR.addChild(clawnotmovespineR_r1);
        this.setRotateAngle(clawnotmovespineR_r1, 0.0F, 0.0873F, 0.0F);
        this.clawnotmovespineR_r1.cubeList.add(new ModelBox(clawnotmovespineR_r1, 0, 5, -2.0F, -0.6F, -23.0F, 2, 0, 5, 0.0F, false));
        this.clawnotmovespineR_r1.cubeList.add(new ModelBox(clawnotmovespineR_r1, 34, 5, -1.0F, -1.1F, -22.0F, 1, 1, 4, 0.0F, false));
        this.clawnotmovespineR_r1.cubeList.add(new ModelBox(clawnotmovespineR_r1, 44, 54, -3.0F, -1.5F, -18.0F, 3, 2, 4, 0.0F, false));

        this.clawR = new AdvancedModelRenderer(this);
        this.clawR.setRotationPoint(-2.0F, 0.0F, -4.0F);
        this.clawbaseR.addChild(clawR);
        this.setRotateAngle(clawR, 0.0F, 0.2182F, 0.0F);


        this.clawmoveR_r1 = new AdvancedModelRenderer(this);
        this.clawmoveR_r1.setRotationPoint(4.0F, 1.0F, 18.0F);
        this.clawR.addChild(clawmoveR_r1);
        this.setRotateAngle(clawmoveR_r1, 0.0F, 0.3491F, 0.0F);
        this.clawmoveR_r1.cubeList.add(new ModelBox(clawmoveR_r1, 34, 0, 1.5F, -1.0F, -22.0F, 1, 1, 4, 0.0F, false));
        this.clawmoveR_r1.cubeList.add(new ModelBox(clawmoveR_r1, 0, 15, 1.5F, -0.5F, -23.0F, 2, 0, 5, 0.0F, false));

        this.legsR = new AdvancedModelRenderer(this);
        this.legsR.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.body.addChild(legsR);


        this.legR1 = new AdvancedModelRenderer(this);
        this.legR1.setRotationPoint(-0.75F, -1.0F, -5.0F);
        this.legsR.addChild(legR1);


        this.legR1_r1 = new AdvancedModelRenderer(this);
        this.legR1_r1.setRotationPoint(0.25F, 0.9F, 0.0F);
        this.legR1.addChild(legR1_r1);
        this.setRotateAngle(legR1_r1, 0.0F, -0.1745F, 0.0F);
        this.legR1_r1.cubeList.add(new ModelBox(legR1_r1, 54, 54, -8.1318F, -0.9F, -0.076F, 8, 1, 1, 0.0F, false));

        this.legR2 = new AdvancedModelRenderer(this);
        this.legR2.setRotationPoint(-1.0F, -1.1F, -4.0F);
        this.legsR.addChild(legR2);
        this.legR2.cubeList.add(new ModelBox(legR2, 46, 6, -12.0F, 0.0F, 0.0F, 12, 1, 1, 0.0F, false));

        this.legR3 = new AdvancedModelRenderer(this);
        this.legR3.setRotationPoint(-2.0F, -1.0F, -2.0F);
        this.legsR.addChild(legR3);


        this.legR3_r1 = new AdvancedModelRenderer(this);
        this.legR3_r1.setRotationPoint(0.0F, 1.0F, 0.0F);
        this.legR3.addChild(legR3_r1);
        this.setRotateAngle(legR3_r1, 0.0F, 0.1745F, 0.0F);
        this.legR3_r1.cubeList.add(new ModelBox(legR3_r1, 46, 8, -11.3777F, -1.0F, -0.6831F, 12, 1, 1, 0.0F, false));

        this.legR5 = new AdvancedModelRenderer(this);
        this.legR5.setRotationPoint(-4.0F, -1.0F, 2.0F);
        this.legsR.addChild(legR5);
        this.setRotateAngle(legR5, 0.0F, -0.0873F, 0.0F);


        this.legR5_ptery2_r1 = new AdvancedModelRenderer(this);
        this.legR5_ptery2_r1.setRotationPoint(4.0F, 1.0F, -2.0F);
        this.legR5.addChild(legR5_ptery2_r1);
        this.setRotateAngle(legR5_ptery2_r1, 0.0F, 0.5236F, 0.0F);
        this.legR5_ptery2_r1.cubeList.add(new ModelBox(legR5_ptery2_r1, 0, 78, -18.5F, -1.0F, -0.5F, 3, 1, 2, 0.0F, false));
        this.legR5_ptery2_r1.cubeList.add(new ModelBox(legR5_ptery2_r1, 21, 25, -16.5F, -1.0F, -0.5F, 2, 1, 2, 0.0F, false));
        this.legR5_ptery2_r1.cubeList.add(new ModelBox(legR5_ptery2_r1, 0, 72, -15.5F, -1.0F, -1.0F, 1, 1, 3, 0.0F, false));
        this.legR5_ptery2_r1.cubeList.add(new ModelBox(legR5_ptery2_r1, 50, 26, -14.5F, -1.0F, -1.0F, 6, 1, 3, 0.0F, false));
        this.legR5_ptery2_r1.cubeList.add(new ModelBox(legR5_ptery2_r1, 54, 35, -8.5F, -1.0F, -1.0F, 4, 1, 2, 0.0F, false));

        this.legR4 = new AdvancedModelRenderer(this);
        this.legR4.setRotationPoint(-3.0F, -1.0F, -1.0F);
        this.legsR.addChild(legR4);


        this.legR4_r1 = new AdvancedModelRenderer(this);
        this.legR4_r1.setRotationPoint(1.0F, 1.0F, 0.0F);
        this.legR4.addChild(legR4_r1);
        this.setRotateAngle(legR4_r1, 0.0F, 0.3491F, 0.0F);
        this.legR4_r1.cubeList.add(new ModelBox(legR4_r1, 46, 11, -11.4626F, -1.0F, -0.3763F, 12, 1, 1, 0.0F, false));

        this.legsL = new AdvancedModelRenderer(this);
        this.legsL.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.body.addChild(legsL);


        this.legL1 = new AdvancedModelRenderer(this);
        this.legL1.setRotationPoint(0.75F, -1.1F, -5.0F);
        this.legsL.addChild(legL1);


        this.legL1_r1 = new AdvancedModelRenderer(this);
        this.legL1_r1.setRotationPoint(-0.25F, 0.9F, 0.0F);
        this.legL1.addChild(legL1_r1);
        this.setRotateAngle(legL1_r1, 0.0F, 0.1745F, 0.0F);
        this.legL1_r1.cubeList.add(new ModelBox(legL1_r1, 54, 33, 0.1318F, -0.9F, -0.076F, 8, 1, 1, 0.0F, false));

        this.legL2 = new AdvancedModelRenderer(this);
        this.legL2.setRotationPoint(1.0F, -1.1F, -4.0F);
        this.legsL.addChild(legL2);
        this.legL2.cubeList.add(new ModelBox(legL2, 46, 13, 0.0F, 0.0F, 0.0F, 12, 1, 1, 0.0F, false));

        this.legL3 = new AdvancedModelRenderer(this);
        this.legL3.setRotationPoint(2.0F, -1.0F, -2.0F);
        this.legsL.addChild(legL3);


        this.legL3_r1 = new AdvancedModelRenderer(this);
        this.legL3_r1.setRotationPoint(0.0F, 1.0F, 0.0F);
        this.legL3.addChild(legL3_r1);
        this.setRotateAngle(legL3_r1, 0.0F, -0.1745F, 0.0F);
        this.legL3_r1.cubeList.add(new ModelBox(legL3_r1, 50, 24, -0.6223F, -1.0F, -0.6831F, 12, 1, 1, 0.0F, false));

        this.legL4 = new AdvancedModelRenderer(this);
        this.legL4.setRotationPoint(3.0F, -1.0F, -1.0F);
        this.legsL.addChild(legL4);


        this.legL4_r1 = new AdvancedModelRenderer(this);
        this.legL4_r1.setRotationPoint(-1.0F, 1.0F, 0.0F);
        this.legL4.addChild(legL4_r1);
        this.setRotateAngle(legL4_r1, 0.0F, -0.3491F, 0.0F);
        this.legL4_r1.cubeList.add(new ModelBox(legL4_r1, 50, 22, -0.5374F, -1.0F, -0.3763F, 12, 1, 1, 0.0F, false));

        this.legL5 = new AdvancedModelRenderer(this);
        this.legL5.setRotationPoint(4.0F, -1.0F, 2.0F);
        this.legsL.addChild(legL5);


        this.legL5_ptery2_r1 = new AdvancedModelRenderer(this);
        this.legL5_ptery2_r1.setRotationPoint(-4.0F, 1.0F, -2.0F);
        this.legL5.addChild(legL5_ptery2_r1);
        this.setRotateAngle(legL5_ptery2_r1, 0.0F, -0.5236F, 0.0F);
        this.legL5_ptery2_r1.cubeList.add(new ModelBox(legL5_ptery2_r1, 0, 62, 15.5F, -1.0F, -0.5F, 3, 1, 2, 0.0F, false));
        this.legL5_ptery2_r1.cubeList.add(new ModelBox(legL5_ptery2_r1, 0, 32, 14.5F, -1.0F, -0.5F, 2, 1, 2, 0.0F, false));
        this.legL5_ptery2_r1.cubeList.add(new ModelBox(legL5_ptery2_r1, 0, 66, 14.5F, -1.0F, -1.0F, 1, 1, 3, 0.0F, false));
        this.legL5_ptery2_r1.cubeList.add(new ModelBox(legL5_ptery2_r1, 51, 15, 8.5F, -1.0F, -1.0F, 6, 1, 3, 0.0F, false));
        this.legL5_ptery2_r1.cubeList.add(new ModelBox(legL5_ptery2_r1, 54, 38, 4.5F, -1.0F, -1.0F, 4, 1, 2, 0.0F, false));

        this.opisthosoma = new AdvancedModelRenderer(this);
        this.opisthosoma.setRotationPoint(0.0F, -2.0F, 2.0F);
        this.body.addChild(opisthosoma);
        this.setRotateAngle(opisthosoma, -0.5236F, 0.0F, 0.0F);
        this.opisthosoma.cubeList.add(new ModelBox(opisthosoma, 46, 0, -5.0F, -2.03F, 0.0F, 10, 3, 3, 0.0F, false));

        this.coxa2_r1 = new AdvancedModelRenderer(this);
        this.coxa2_r1.setRotationPoint(0.0F, 2.0F, -2.0F);
        this.opisthosoma.addChild(coxa2_r1);
        this.setRotateAngle(coxa2_r1, 0.1745F, 0.0F, 0.0F);
        this.coxa2_r1.cubeList.add(new ModelBox(coxa2_r1, 30, 15, -4.0F, -1.75F, 0.0F, 8, 2, 5, 0.0F, false));

        this.tergiteA = new AdvancedModelRenderer(this);
        this.tergiteA.setRotationPoint(0.0F, 0.0F, 3.0F);
        this.opisthosoma.addChild(tergiteA);
        this.setRotateAngle(tergiteA, -0.3054F, 0.0F, 0.0F);
        this.tergiteA.cubeList.add(new ModelBox(tergiteA, 9, 9, -5.49F, -2.0275F, 0.0F, 11, 3, 3, 0.0F, false));

        this.tergiteA2 = new AdvancedModelRenderer(this);
        this.tergiteA2.setRotationPoint(0.0F, 0.0F, 3.0F);
        this.tergiteA.addChild(tergiteA2);
        this.setRotateAngle(tergiteA2, -0.3054F, 0.0F, 0.0F);
        this.tergiteA2.cubeList.add(new ModelBox(tergiteA2, 9, 9, -5.5F, -2.025F, 0.0F, 11, 3, 3, 0.0F, false));

        this.tergiteA3 = new AdvancedModelRenderer(this);
        this.tergiteA3.setRotationPoint(0.0F, 0.0F, 3.0F);
        this.tergiteA2.addChild(tergiteA3);
        this.setRotateAngle(tergiteA3, -0.3927F, 0.0F, 0.0F);
        this.tergiteA3.cubeList.add(new ModelBox(tergiteA3, 9, 9, -5.49F, -2.0225F, 0.0F, 11, 3, 3, 0.0F, false));

        this.tergiteA4 = new AdvancedModelRenderer(this);
        this.tergiteA4.setRotationPoint(0.0F, 0.0F, 3.0F);
        this.tergiteA3.addChild(tergiteA4);
        this.setRotateAngle(tergiteA4, -0.3927F, 0.0F, 0.0F);
        this.tergiteA4.cubeList.add(new ModelBox(tergiteA4, 9, 9, -5.5F, -2.02F, 0.0F, 11, 3, 3, 0.0F, false));

        this.tergiteB = new AdvancedModelRenderer(this);
        this.tergiteB.setRotationPoint(0.0F, 0.0F, 3.0F);
        this.tergiteA4.addChild(tergiteB);
        this.setRotateAngle(tergiteB, -0.3054F, 0.0F, 0.0F);
        this.tergiteB.cubeList.add(new ModelBox(tergiteB, 26, 44, -5.0F, -2.0175F, 0.0F, 10, 3, 3, 0.0F, false));

        this.tergiteC = new AdvancedModelRenderer(this);
        this.tergiteC.setRotationPoint(0.0F, -1.0F, 3.0F);
        this.tergiteB.addChild(tergiteC);
        this.setRotateAngle(tergiteC, -0.2182F, 0.0F, 0.0F);
        this.tergiteC.cubeList.add(new ModelBox(tergiteC, 0, 44, -4.5F, -0.51F, 0.0F, 9, 2, 4, 0.0F, false));

        this.tergiteD = new AdvancedModelRenderer(this);
        this.tergiteD.setRotationPoint(0.0F, 0.0F, 4.0F);
        this.tergiteC.addChild(tergiteD);
        this.setRotateAngle(tergiteD, -0.1745F, 0.0F, 0.0F);
        this.tergiteD.cubeList.add(new ModelBox(tergiteD, 4, 37, -3.99F, -0.5075F, 0.0F, 8, 2, 4, 0.0F, false));

        this.tergiteD2 = new AdvancedModelRenderer(this);
        this.tergiteD2.setRotationPoint(0.0F, 0.0F, 4.0F);
        this.tergiteD.addChild(tergiteD2);
        this.setRotateAngle(tergiteD2, -0.1309F, 0.0F, 0.0F);
        this.tergiteD2.cubeList.add(new ModelBox(tergiteD2, 4, 37, -4.0F, -0.505F, 0.0F, 8, 2, 4, 0.0F, false));

        this.tergiteE = new AdvancedModelRenderer(this);
        this.tergiteE.setRotationPoint(0.0F, 0.0F, 4.0F);
        this.tergiteD2.addChild(tergiteE);
        this.setRotateAngle(tergiteE, 0.3927F, 0.0F, 0.0F);
        this.tergiteE.cubeList.add(new ModelBox(tergiteE, 36, 37, -3.49F, -0.5025F, 0.0F, 7, 2, 4, 0.0F, false));

        this.tergiteE2 = new AdvancedModelRenderer(this);
        this.tergiteE2.setRotationPoint(0.0F, 0.0F, 4.0F);
        this.tergiteE.addChild(tergiteE2);
        this.setRotateAngle(tergiteE2, 0.5236F, 0.0F, 0.0F);
        this.tergiteE2.cubeList.add(new ModelBox(tergiteE2, 36, 37, -3.5F, -0.5F, 0.0F, 7, 2, 4, 0.0F, false));

        this.tergiteF = new AdvancedModelRenderer(this);
        this.tergiteF.setRotationPoint(0.0F, 0.0F, 4.0F);
        this.tergiteE2.addChild(tergiteF);
        this.setRotateAngle(tergiteF, 0.6545F, 0.0F, 0.0F);
        this.tergiteF.cubeList.add(new ModelBox(tergiteF, 30, 50, -2.0F, -0.4975F, 0.0F, 4, 2, 5, 0.0F, false));
        this.tergiteF.cubeList.add(new ModelBox(tergiteF, 0, 27, -4.0F, 0.5F, 0.0F, 8, 0, 5, 0.0F, false));
        this.tergiteF.cubeList.add(new ModelBox(tergiteF, 0, 5, 0.0F, -1.0F, 0.0F, 0, 1, 5, 0.0F, false));

        this.telson = new AdvancedModelRenderer(this);
        this.telson.setRotationPoint(0.0F, 0.0F, 4.0F);
        this.tergiteF.addChild(telson);
        this.setRotateAngle(telson, 0.3491F, 0.0F, 0.0F);
        this.telson.cubeList.add(new ModelBox(telson, 34, 0, -0.5F, 0.0F, 1.0F, 1, 1, 10, 0.0F, false));
        this.telson.cubeList.add(new ModelBox(telson, 0, 15, -5.0F, 0.5F, 1.0F, 10, 0, 10, 0.0F, false));
        this.telson.cubeList.add(new ModelBox(telson, 0, 15, 0.0F, -2.0F, 1.0F, 0, 2, 10, 0.0F, false));

        updateDefaultPose();
    }

    public void renderStatic(float f) {
        GlStateManager.pushMatrix();
        GlStateManager.enableBlend();
        GlStateManager.blendFunc(GlStateManager.SourceFactor.SRC_ALPHA, GlStateManager.DestFactor.ONE_MINUS_SRC_ALPHA);
        this.body.render(0.04F);
        GlStateManager.disableBlend();
        GlStateManager.popMatrix();
    }

    public void setRotateAngle(ModelRenderer modelRenderer, float x, float y, float z) {
        modelRenderer.rotateAngleX = x;
        modelRenderer.rotateAngleY = y;
        modelRenderer.rotateAngleZ = z;
    }
}
