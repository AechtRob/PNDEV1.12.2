package net.lepidodendron.entity.model.entity;

import net.ilexiconn.llibrary.client.model.ModelAnimator;
import net.ilexiconn.llibrary.client.model.tools.AdvancedModelBase;
import net.ilexiconn.llibrary.client.model.tools.AdvancedModelRenderer;
import net.ilexiconn.llibrary.server.animation.IAnimatedEntity;
import net.lepidodendron.entity.base.EntityPrehistoricFloraAgeableBase;
import net.minecraft.block.material.Material;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLiving;
import net.minecraft.util.math.BlockPos;

public class ModelJaekelopterus extends AdvancedModelBase {
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

    private ModelAnimator animator;


    public ModelJaekelopterus() {
        this.textureWidth = 128;
        this.textureHeight = 128;

        this.body = new AdvancedModelRenderer(this);
        this.body.setRotationPoint(0.0F, 24.0F, 0.0F);
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
        this.setRotateAngle(cheliceraL, -0.2618F, 0.0F, 0.0F);


        this.cheliceraL_r1 = new AdvancedModelRenderer(this);
        this.cheliceraL_r1.setRotationPoint(-1.0F, 1.0F, 5.75F);
        this.cheliceraL.addChild(cheliceraL_r1);
        this.setRotateAngle(cheliceraL_r1, 0.0F, -0.0873F, 0.0F);
        this.cheliceraL_r1.cubeList.add(new ModelBox(cheliceraL_r1, 44, 44, 0.0F, -1.0F, -14.0F, 2, 1, 8, 0.0F, false));

        this.clawbaseL = new AdvancedModelRenderer(this);
        this.clawbaseL.setRotationPoint(1.0F, 0.0F, -8.25F);
        this.cheliceraL.addChild(clawbaseL);
        this.setRotateAngle(clawbaseL, 0.6545F, 0.0F, 0.0F);


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


        this.clawmovespineL_r1 = new AdvancedModelRenderer(this);
        this.clawmovespineL_r1.setRotationPoint(-4.0F, 1.0F, 18.0F);
        this.clawL.addChild(clawmovespineL_r1);
        this.setRotateAngle(clawmovespineL_r1, 0.0F, -0.3491F, 0.0F);
        this.clawmovespineL_r1.cubeList.add(new ModelBox(clawmovespineL_r1, 0, 20, -3.5F, -0.5F, -23.0F, 2, 0, 5, 0.0F, false));
        this.clawmovespineL_r1.cubeList.add(new ModelBox(clawmovespineL_r1, 14, 52, -2.5F, -1.0F, -22.0F, 1, 1, 4, 0.0F, false));

        this.cheliceraR = new AdvancedModelRenderer(this);
        this.cheliceraR.setRotationPoint(-1.0F, -1.0F, -5.5F);
        this.body.addChild(cheliceraR);
        this.setRotateAngle(cheliceraR, -0.3054F, 0.0F, 0.0F);


        this.cheliceraR_r1 = new AdvancedModelRenderer(this);
        this.cheliceraR_r1.setRotationPoint(1.0F, 1.0F, 5.75F);
        this.cheliceraR.addChild(cheliceraR_r1);
        this.setRotateAngle(cheliceraR_r1, 0.0F, 0.0873F, 0.0F);
        this.cheliceraR_r1.cubeList.add(new ModelBox(cheliceraR_r1, 18, 50, -2.0F, -1.0F, -14.0F, 2, 1, 8, 0.0F, false));

        this.clawbaseR = new AdvancedModelRenderer(this);
        this.clawbaseR.setRotationPoint(-1.0F, 0.0F, -8.25F);
        this.cheliceraR.addChild(clawbaseR);
        this.setRotateAngle(clawbaseR, 0.7854F, 0.0F, 0.0F);


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
        this.opisthosoma.cubeList.add(new ModelBox(opisthosoma, 46, 0, -5.0F, -2.03F, 0.0F, 10, 3, 3, 0.0F, false));

        this.coxa2_r1 = new AdvancedModelRenderer(this);
        this.coxa2_r1.setRotationPoint(0.0F, 2.0F, -2.0F);
        this.opisthosoma.addChild(coxa2_r1);
        this.setRotateAngle(coxa2_r1, 0.1745F, 0.0F, 0.0F);
        this.coxa2_r1.cubeList.add(new ModelBox(coxa2_r1, 30, 15, -4.0F, -1.75F, 0.0F, 8, 2, 5, 0.0F, false));

        this.tergiteA = new AdvancedModelRenderer(this);
        this.tergiteA.setRotationPoint(0.0F, 0.0F, 3.0F);
        this.opisthosoma.addChild(tergiteA);
        this.tergiteA.cubeList.add(new ModelBox(tergiteA, 9, 9, -5.49F, -2.0275F, 0.0F, 11, 3, 3, 0.0F, false));

        this.tergiteA2 = new AdvancedModelRenderer(this);
        this.tergiteA2.setRotationPoint(0.0F, 0.0F, 3.0F);
        this.tergiteA.addChild(tergiteA2);
        this.tergiteA2.cubeList.add(new ModelBox(tergiteA2, 9, 9, -5.5F, -2.025F, 0.0F, 11, 3, 3, 0.0F, false));

        this.tergiteA3 = new AdvancedModelRenderer(this);
        this.tergiteA3.setRotationPoint(0.0F, 0.0F, 3.0F);
        this.tergiteA2.addChild(tergiteA3);
        this.tergiteA3.cubeList.add(new ModelBox(tergiteA3, 9, 9, -5.49F, -2.0225F, 0.0F, 11, 3, 3, 0.0F, false));

        this.tergiteA4 = new AdvancedModelRenderer(this);
        this.tergiteA4.setRotationPoint(0.0F, 0.0F, 3.0F);
        this.tergiteA3.addChild(tergiteA4);
        this.tergiteA4.cubeList.add(new ModelBox(tergiteA4, 9, 9, -5.5F, -2.02F, 0.0F, 11, 3, 3, 0.0F, false));

        this.tergiteB = new AdvancedModelRenderer(this);
        this.tergiteB.setRotationPoint(0.0F, 0.0F, 3.0F);
        this.tergiteA4.addChild(tergiteB);
        this.tergiteB.cubeList.add(new ModelBox(tergiteB, 26, 44, -5.0F, -2.0175F, 0.0F, 10, 3, 3, 0.0F, false));

        this.tergiteC = new AdvancedModelRenderer(this);
        this.tergiteC.setRotationPoint(0.0F, -1.0F, 3.0F);
        this.tergiteB.addChild(tergiteC);
        this.tergiteC.cubeList.add(new ModelBox(tergiteC, 0, 44, -4.5F, -0.51F, 0.0F, 9, 2, 4, 0.0F, false));

        this.tergiteD = new AdvancedModelRenderer(this);
        this.tergiteD.setRotationPoint(0.0F, 0.0F, 4.0F);
        this.tergiteC.addChild(tergiteD);
        this.tergiteD.cubeList.add(new ModelBox(tergiteD, 4, 37, -3.99F, -0.5075F, 0.0F, 8, 2, 4, 0.0F, false));

        this.tergiteD2 = new AdvancedModelRenderer(this);
        this.tergiteD2.setRotationPoint(0.0F, 0.0F, 4.0F);
        this.tergiteD.addChild(tergiteD2);
        this.tergiteD2.cubeList.add(new ModelBox(tergiteD2, 4, 37, -4.0F, -0.505F, 0.0F, 8, 2, 4, 0.0F, false));

        this.tergiteE = new AdvancedModelRenderer(this);
        this.tergiteE.setRotationPoint(0.0F, 0.0F, 4.0F);
        this.tergiteD2.addChild(tergiteE);
        this.tergiteE.cubeList.add(new ModelBox(tergiteE, 36, 37, -3.49F, -0.5025F, 0.0F, 7, 2, 4, 0.0F, false));

        this.tergiteE2 = new AdvancedModelRenderer(this);
        this.tergiteE2.setRotationPoint(0.0F, 0.0F, 4.0F);
        this.tergiteE.addChild(tergiteE2);
        this.tergiteE2.cubeList.add(new ModelBox(tergiteE2, 36, 37, -3.5F, -0.5F, 0.0F, 7, 2, 4, 0.0F, false));

        this.tergiteF = new AdvancedModelRenderer(this);
        this.tergiteF.setRotationPoint(0.0F, 0.0F, 4.0F);
        this.tergiteE2.addChild(tergiteF);
        this.tergiteF.cubeList.add(new ModelBox(tergiteF, 30, 50, -2.0F, -0.4975F, 0.0F, 4, 2, 5, 0.0F, false));
        this.tergiteF.cubeList.add(new ModelBox(tergiteF, 0, 27, -4.0F, 0.5F, 0.0F, 8, 0, 5, 0.0F, false));
        this.tergiteF.cubeList.add(new ModelBox(tergiteF, 0, 5, 0.0F, -1.0F, 0.0F, 0, 1, 5, 0.0F, false));

        this.telson = new AdvancedModelRenderer(this);
        this.telson.setRotationPoint(0.0F, 0.0F, 4.0F);
        this.tergiteF.addChild(telson);
        this.telson.cubeList.add(new ModelBox(telson, 34, 0, -0.5F, 0.0F, 1.0F, 1, 1, 10, 0.0F, false));
        this.telson.cubeList.add(new ModelBox(telson, 0, 15, -5.0F, 0.5F, 1.0F, 10, 0, 10, 0.0F, false));
        this.telson.cubeList.add(new ModelBox(telson, 0, 15, 0.0F, -2.0F, 1.0F, 0, 2, 10, 0.0F, false));

        updateDefaultPose();
        animator = ModelAnimator.create();
    }

    @Override
    public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        animate((IAnimatedEntity) entity, f, f1, f2, f3, f4, f5);
        this.body.render(f5 * 0.8F);
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
        this.body.offsetY = 0F;

        float speedMultiplier = 1F;
        EntityPrehistoricFloraAgeableBase ee = (EntityPrehistoricFloraAgeableBase) e;
        if (ee.getIsFast()) {
            speedMultiplier = 1.75F;
        }
        AdvancedModelRenderer[] fishBody = {this.tergiteA, this.tergiteA2, this.tergiteA3, this.tergiteA4, this.tergiteB, this.tergiteB, this.tergiteC, this.tergiteD, this.tergiteD2, this.tergiteE, this.tergiteE2, this.tergiteF, this.telson};
        AdvancedModelRenderer[] fishTail = {this.tergiteF, this.telson};
        AdvancedModelRenderer[] fishfinL = {this.legL5};
        AdvancedModelRenderer[] fishfinR = {this.legR5};

        //mouthparts:
        this.walk(cheliceraL, 0.35F, -0.15F, false, 0, -0.1F, f2, 0.6F);
        this.walk(cheliceraR, 0.35F, 0.15F, false, -1, 0.1F, f2, 0.6F);

        float speed = 0.4F * speedMultiplier;
        float tailHdegree = 0.0F;
        float paddleVdegree = 0.2F;
        float paddleHdegree = 0.4F;
        float tailSwing = 0.50F;

        if (!e.isInWater()) {
            speed = 0.7F;
        }

        boolean isAtBottom = false;

        if (e.getPosition().getY() - 1 > 1) {
            BlockPos pos = new BlockPos(e.getPosition().getX(), e.getPosition().getY() - 1, e.getPosition().getZ());
            isAtBottom = ((e.isInsideOfMaterial(Material.WATER) || e.isInsideOfMaterial(Material.CORAL))
                    && ((e.world.getBlockState(pos)).getMaterial() != Material.WATER)
                    && ((double)e.getPosition().getY() + 0.334D) > e.posY);
        }

        if (isAtBottom) {
            //System.err.println("Animation at bottom");
            speed = 0.15F * speedMultiplier;
            tailHdegree = 0.4F;
            tailSwing = 0.25F;
            paddleVdegree = 0.1F;
            //this.l5L.defaultRotationY = 0F;
            //this.l5R.defaultRotationY = 0F;

            this.legL2.rotateAngleZ = 0.4F;
            this.legL3.rotateAngleZ = 0.4F;
            this.legL4.rotateAngleZ = 0.4F;

            this.legR2.rotateAngleZ = -0.4F;
            this.legR3.rotateAngleZ = -0.4F;
            this.legR4.rotateAngleZ = -0.4F;

        }
        else {
            this.legL2.rotateAngleZ = 0.3F;
            this.legL3.rotateAngleZ = 0.3F;
            this.legL4.rotateAngleZ = 0.3F;

            this.legR2.rotateAngleZ = -0.3F;
            this.legR3.rotateAngleZ = -0.3F;
            this.legR4.rotateAngleZ = -0.3F;
        }

        if (e instanceof EntityLiving && !((EntityLiving) e).isAIDisabled()) {
            this.chainWave(fishBody, speed, 0.02F, -0.2F, f2, 0.2F);
            this.chainSwing(fishTail, speed, 0.1F, -0.6F, f2, 0.6F);
            this.chainWave(fishTail, speed, 0.1F, -0.6F, f2, 0.6F);

            this.chainSwing(fishfinL, speed, -paddleHdegree, -3, f2, 1);
            this.chainWave(fishfinL, speed, paddleVdegree, -3, f2, 2);
            this.chainSwing(fishfinR, speed, paddleHdegree, -3, f2, 1);
            this.chainWave(fishfinR, speed, paddleVdegree, -3, f2, 2);

            //pincers:
            this.swing(cheliceraL, 0.3F, -0.1F, false, 0, -0.1F, f2, 0.6F);
            this.swing(cheliceraR, 0.3F, 0.1F, false, 0, 0.1F, f2, 0.6F);

            this.flap(clawbaseL, 0.35F, -0.15F, false, 0, -0.1F, f2, 0.6F);
            this.flap(clawbaseR, 0.35F, 0.15F, false, -1, 0.1F, f2, 0.6F);

            this.swing(clawL, 0.4F, 0.2F, false, 0, -0.1F, f2, 0.8F);
            this.swing(clawR, 0.4F, -0.2F, false, 0, 0.1F, f2, 0.8F);

            this.flap(legL1, speed, 0.2F, false, 3F, 0.5F, f2, 1F);
            this.flap(legR1, speed, 0.2F, true, 0F, 0.5F, f2, 1F);
            this.swing(legL1, speed * 2F, 0.3F, false, 0F, 0.4F, f2, 0.8F);
            this.swing(legR1, speed * 2F, 0.3F, true, 0F, 0.4F, f2, 0.8F);

            if (e.isInWater()) {
                if (!isAtBottom) { //Swimming
                    this.swing(legL2, speed * 2F, 0.3F, false, 3F, 0.4F, f2, 1F);
                    this.swing(legL3, speed * 2F, 0.3F, false, 0F, 0.4F, f2, 1F);
                    this.swing(legL4, speed * 2F, 0.3F, false, 3F, 0.4F, f2, 1F);
                    this.swing(legR2, speed * 2F, 0.3F, true, 0F, 0.4F, f2, 1F);
                    this.swing(legR3, speed * 2F, 0.3F, true, 3F, 0.4F, f2, 1F);
                    this.swing(legR4, speed * 2F, 0.3F, true, 0F, 0.4F, f2, 1F);
                } else { //Walking
                    if (f3 != 0.0F) {
                        this.flap(legL2, speed, 0.2F, false, 3F, 0.5F, f2, 1F);
                        this.flap(legL3, speed, 0.2F, false, 0F, 0.5F, f2, 1F);
                        this.flap(legL4, speed, 0.2F, false, 3F, 0.5F, f2, 1F);

                        this.flap(legR2, speed, 0.2F, true, 0F, 0.5F, f2, 1F);
                        this.flap(legR3, speed, 0.2F, true, 3F, 0.5F, f2, 1F);
                        this.flap(legR4, speed, 0.2F, true, 0F, 0.5F, f2, 1F);

                        this.swing(legL2, speed * 2F, 0.3F, false, 0F, 0.4F, f2, 0.8F);
                        this.swing(legL3, speed * 2F, 0.3F, false, 3F, 0.4F, f2, 0.8F);
                        this.swing(legL4, speed * 2F, 0.3F, false, 0F, 0.4F, f2, 0.8F);

                        this.swing(legR2, speed * 2F, 0.3F, true, 3F, 0.4F, f2, 0.8F);
                        this.swing(legR3, speed * 2F, 0.3F, true, 0F, 0.4F, f2, 0.8F);
                        this.swing(legR4, speed * 2F, 0.3F, true, 3F, 0.4F, f2, 0.8F);
                    }
                }
            }

            //this.swing(body, speed, 0.3F, true, 0, 0, f2, 1);
            if (!isAtBottom) {
                this.bob(body, -speed * 0.5F, 0.5F, false, f2, 0.8F);
            }
            if (!e.isInWater()) {
                //this.Bodyfront.rotateAngleZ = (float) Math.toRadians(90);
                this.body.offsetY = 0.2F;
                this.bob(body, -speed * 1.5F, 2F, false, f2, 1);
                this.chainSwing(fishBody, speed, 0.1F, -2, f2, 1);
            }
        }
    }

    public void animate(IAnimatedEntity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        EntityPrehistoricFloraAgeableBase e = (EntityPrehistoricFloraAgeableBase) entity;
        animator.update(entity);
        this.resetToDefaultPose();
        setRotationAngles(f, f1, f2, f3, f4, f5, (Entity) entity);

        animator.setAnimation(e.ATTACK_ANIMATION);
        animator.startKeyframe(20);
        animator.move(this.body, 0 , -37,0);
        animator.rotate(this.body, (float) Math.toRadians(-17.5), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(this.cheliceraL, (float) Math.toRadians(0), (float) Math.toRadians(-17.5), (float) Math.toRadians(0));
        animator.rotate(this.cheliceraR, (float) Math.toRadians(0), (float) Math.toRadians(17.5), (float) Math.toRadians(0));
        animator.rotate(this.opisthosoma, (float) Math.toRadians(-7.5), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(this.tergiteA, (float) Math.toRadians(-7.5), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(this.tergiteA2, (float) Math.toRadians(-7.5), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(this.tergiteA3, (float) Math.toRadians(-12.5), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(this.tergiteA4, (float) Math.toRadians(-12.5), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(this.tergiteB, (float) Math.toRadians(-7.5), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(this.tergiteC, (float) Math.toRadians(-7.5), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(this.tergiteD, (float) Math.toRadians(-7.5), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(this.tergiteD2, (float) Math.toRadians(-7.5), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(this.tergiteE, (float) Math.toRadians(2.5), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(this.tergiteE2, (float) Math.toRadians(7.5), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(this.tergiteF, (float) Math.toRadians(7.5), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(this.telson, (float) Math.toRadians(20), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.endKeyframe();
        animator.setStaticKeyframe(4);

        animator.startKeyframe(3);
        animator.move(this.body, 0 , -23,0);
        animator.rotate(this.body, (float) Math.toRadians(20), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(this.cheliceraL, (float) Math.toRadians(37.5), (float) Math.toRadians(-17.5), (float) Math.toRadians(0));
        animator.rotate(this.cheliceraR, (float) Math.toRadians(37.5), (float) Math.toRadians(17.5), (float) Math.toRadians(0));
        animator.rotate(this.opisthosoma, (float) Math.toRadians(-7.5), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(this.tergiteA, (float) Math.toRadians(-7.5), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(this.tergiteA2, (float) Math.toRadians(-7.5), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(this.tergiteA3, (float) Math.toRadians(-12.5), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(this.tergiteA4, (float) Math.toRadians(-7.5), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(this.tergiteB, (float) Math.toRadians(-7.5), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(this.tergiteC, (float) Math.toRadians(-7.5), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(this.tergiteD, (float) Math.toRadians(-7.5), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(this.tergiteD2, (float) Math.toRadians(0), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(this.tergiteE, (float) Math.toRadians(2.5), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(this.tergiteE2, (float) Math.toRadians(7.5), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(this.tergiteF, (float) Math.toRadians(7.5), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(this.telson, (float) Math.toRadians(10), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.endKeyframe();
        //animator.setStaticKeyframe(1);

        animator.resetKeyframe(3);
    }
}
