package net.lepidodendron.entity.model.entity;

import net.ilexiconn.llibrary.client.model.ModelAnimator;
import net.ilexiconn.llibrary.client.model.tools.AdvancedModelRenderer;
import net.ilexiconn.llibrary.server.animation.IAnimatedEntity;
import net.lepidodendron.entity.EntityPrehistoricFloraErettopterus;
import net.lepidodendron.entity.model.ModelBasePalaeopedia;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLiving;
import net.minecraft.entity.EntityLivingBase;

public class ModelErettopterus extends ModelBasePalaeopedia {
    private final AdvancedModelRenderer body;
    private final AdvancedModelRenderer eyeR_r1;
    private final AdvancedModelRenderer carapace_r1;
    private final AdvancedModelRenderer eyeR_r2;
    private final AdvancedModelRenderer carapace_r2;
    private final AdvancedModelRenderer cheliceraR;
    private final AdvancedModelRenderer cheliceraR_r1;
    private final AdvancedModelRenderer clawbaseR;
    private final AdvancedModelRenderer clawnotmovespineR_r1;
    private final AdvancedModelRenderer clawR;
    private final AdvancedModelRenderer clawmoveR_r1;
    private final AdvancedModelRenderer cheliceraL;
    private final AdvancedModelRenderer cheliceraR_r2;
    private final AdvancedModelRenderer clawbaseL;
    private final AdvancedModelRenderer clawnotmovespineR_r2;
    private final AdvancedModelRenderer clawL;
    private final AdvancedModelRenderer clawmoveR_r2;
    private final AdvancedModelRenderer legsR;
    private final AdvancedModelRenderer legR1;
    private final AdvancedModelRenderer legR1_r1;
    private final AdvancedModelRenderer legR2;
    private final AdvancedModelRenderer legR3;
    private final AdvancedModelRenderer legR3_r1;
    private final AdvancedModelRenderer legR4;
    private final AdvancedModelRenderer legR4_r1;
    private final AdvancedModelRenderer legR5;
    private final AdvancedModelRenderer legR5_2_r1;
    private final AdvancedModelRenderer legRs5;
    private final AdvancedModelRenderer legR5_2_r2;
    private final AdvancedModelRenderer legsL;
    private final AdvancedModelRenderer legL;
    private final AdvancedModelRenderer legR2_r1;
    private final AdvancedModelRenderer legL2;
    private final AdvancedModelRenderer legL3;
    private final AdvancedModelRenderer legR4_r2;
    private final AdvancedModelRenderer legL4;
    private final AdvancedModelRenderer legR5_r1;
    private final AdvancedModelRenderer legL5;
    private final AdvancedModelRenderer legR5_3_r1;
    private final AdvancedModelRenderer legLs5;
    private final AdvancedModelRenderer legR5_3_r2;
    private final AdvancedModelRenderer opisthosoma;
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


    public ModelErettopterus() {
        this.textureWidth = 64;
        this.textureHeight = 64;

        this.body = new AdvancedModelRenderer(this);
        this.body.setRotationPoint(0.0F, 24.0F, 0.0F);
        this.body.cubeList.add(new ModelBox(body, 20, 25, -3.5F, -2.0F, -1.25F, 7, 1, 3, 0.0F, false));
        this.body.cubeList.add(new ModelBox(body, 22, 2, -4.0F, -4.0325F, -1.975F, 8, 2, 3, 0.02F, false));
        this.body.cubeList.add(new ModelBox(body, 26, 34, -2.0F, -4.0325F, -5.0F, 4, 2, 3, 0.0F, false));
        this.body.cubeList.add(new ModelBox(body, 0, 15, -1.25F, -4.06F, -1.75F, 1, 0, 1, 0.0F, false));
        this.body.cubeList.add(new ModelBox(body, 0, 15, 0.25F, -4.06F, -1.75F, 1, 0, 1, 0.0F, true));
        this.body.cubeList.add(new ModelBox(body, 35, 17, -2.0F, -2.15F, -4.1F, 4, 1, 3, 0.01F, false));

        this.eyeR_r1 = new AdvancedModelRenderer(this);
        this.eyeR_r1.setRotationPoint(0.0F, -1.0F, 0.0F);
        this.body.addChild(eyeR_r1);
        this.setRotateAngle(eyeR_r1, 0.0F, 0.5672F, 0.0F);
        this.eyeR_r1.cubeList.add(new ModelBox(eyeR_r1, 41, 1, 3.5F, -3.1F, -1.9F, 1, 1, 2, 0.0F, true));

        this.carapace_r1 = new AdvancedModelRenderer(this);
        this.carapace_r1.setRotationPoint(3.5F, -1.0F, -6.0F);
        this.body.addChild(carapace_r1);
        this.setRotateAngle(carapace_r1, 0.0F, 0.6021F, 0.0F);
        this.carapace_r1.cubeList.add(new ModelBox(carapace_r1, 40, 31, -3.8F, -3.0325F, 2.625F, 2, 2, 1, -0.02F, true));
        this.carapace_r1.cubeList.add(new ModelBox(carapace_r1, 38, 26, -3.8F, -3.0325F, -0.025F, 2, 2, 3, -0.01F, true));

        this.eyeR_r2 = new AdvancedModelRenderer(this);
        this.eyeR_r2.setRotationPoint(0.0F, -1.0F, 0.0F);
        this.body.addChild(eyeR_r2);
        this.setRotateAngle(eyeR_r2, 0.0F, -0.5672F, 0.0F);
        this.eyeR_r2.cubeList.add(new ModelBox(eyeR_r2, 41, 1, -4.5F, -3.1F, -1.9F, 1, 1, 2, 0.0F, false));

        this.carapace_r2 = new AdvancedModelRenderer(this);
        this.carapace_r2.setRotationPoint(-3.5F, -1.0F, -6.0F);
        this.body.addChild(carapace_r2);
        this.setRotateAngle(carapace_r2, 0.0F, -0.6021F, 0.0F);
        this.carapace_r2.cubeList.add(new ModelBox(carapace_r2, 40, 31, 1.8F, -3.0325F, 2.625F, 2, 2, 1, -0.02F, false));
        this.carapace_r2.cubeList.add(new ModelBox(carapace_r2, 38, 26, 1.8F, -3.0325F, -0.025F, 2, 2, 3, -0.01F, false));

        this.cheliceraR = new AdvancedModelRenderer(this);
        this.cheliceraR.setRotationPoint(-0.5F, -2.5F, -4.0F);
        this.body.addChild(cheliceraR);


        this.cheliceraR_r1 = new AdvancedModelRenderer(this);
        this.cheliceraR_r1.setRotationPoint(1.0F, 1.0F, 5.25F);
        this.cheliceraR.addChild(cheliceraR_r1);
        this.setRotateAngle(cheliceraR_r1, 0.0F, 0.0873F, 0.0F);
        this.cheliceraR_r1.cubeList.add(new ModelBox(cheliceraR_r1, 13, 29, -1.0F, -1.0F, -12.25F, 1, 1, 7, 0.0F, false));

        this.clawbaseR = new AdvancedModelRenderer(this);
        this.clawbaseR.setRotationPoint(-1.0F, 1.0F, -6.75F);
        this.cheliceraR.addChild(clawbaseR);


        this.clawnotmovespineR_r1 = new AdvancedModelRenderer(this);
        this.clawnotmovespineR_r1.setRotationPoint(2.0F, 0.0F, 14.0F);
        this.clawbaseR.addChild(clawnotmovespineR_r1);
        this.setRotateAngle(clawnotmovespineR_r1, 0.0F, 0.0873F, 0.0F);
        this.clawnotmovespineR_r1.cubeList.add(new ModelBox(clawnotmovespineR_r1, 12, 30, -1.0F, -0.5F, -20.5F, 2, 0, 4, 0.0F, false));
        this.clawnotmovespineR_r1.cubeList.add(new ModelBox(clawnotmovespineR_r1, 37, 40, -0.5F, -1.0F, -20.0F, 1, 1, 3, 0.0F, false));
        this.clawnotmovespineR_r1.cubeList.add(new ModelBox(clawnotmovespineR_r1, 23, 39, -1.5F, -1.0F, -17.0F, 2, 1, 3, 0.01F, false));

        this.clawR = new AdvancedModelRenderer(this);
        this.clawR.setRotationPoint(-0.5F, -1.0F, -2.75F);
        this.clawbaseR.addChild(clawR);


        this.clawmoveR_r1 = new AdvancedModelRenderer(this);
        this.clawmoveR_r1.setRotationPoint(4.0F, 1.0F, 18.0F);
        this.clawR.addChild(clawmoveR_r1);
        this.setRotateAngle(clawmoveR_r1, 0.0F, 0.3491F, 0.0F);
        this.clawmoveR_r1.cubeList.add(new ModelBox(clawmoveR_r1, 7, 40, 1.5F, -1.0F, -21.0F, 1, 1, 3, 0.0F, false));
        this.clawmoveR_r1.cubeList.add(new ModelBox(clawmoveR_r1, 33, 24, 1.0F, -0.5F, -21.5F, 2, 0, 4, 0.0F, false));

        this.cheliceraL = new AdvancedModelRenderer(this);
        this.cheliceraL.setRotationPoint(0.5F, -2.5F, -4.0F);
        this.body.addChild(cheliceraL);


        this.cheliceraR_r2 = new AdvancedModelRenderer(this);
        this.cheliceraR_r2.setRotationPoint(-1.0F, 1.0F, 5.25F);
        this.cheliceraL.addChild(cheliceraR_r2);
        this.setRotateAngle(cheliceraR_r2, 0.0F, -0.0873F, 0.0F);
        this.cheliceraR_r2.cubeList.add(new ModelBox(cheliceraR_r2, 13, 29, 0.0F, -1.0F, -12.25F, 1, 1, 7, 0.0F, true));

        this.clawbaseL = new AdvancedModelRenderer(this);
        this.clawbaseL.setRotationPoint(1.0F, 1.0F, -6.75F);
        this.cheliceraL.addChild(clawbaseL);


        this.clawnotmovespineR_r2 = new AdvancedModelRenderer(this);
        this.clawnotmovespineR_r2.setRotationPoint(-2.0F, 0.0F, 14.0F);
        this.clawbaseL.addChild(clawnotmovespineR_r2);
        this.setRotateAngle(clawnotmovespineR_r2, 0.0F, -0.0873F, 0.0F);
        this.clawnotmovespineR_r2.cubeList.add(new ModelBox(clawnotmovespineR_r2, 12, 30, -1.0F, -0.5F, -20.5F, 2, 0, 4, 0.0F, true));
        this.clawnotmovespineR_r2.cubeList.add(new ModelBox(clawnotmovespineR_r2, 37, 40, -0.5F, -1.0F, -20.0F, 1, 1, 3, 0.0F, true));
        this.clawnotmovespineR_r2.cubeList.add(new ModelBox(clawnotmovespineR_r2, 23, 39, -0.5F, -1.0F, -17.0F, 2, 1, 3, 0.01F, true));

        this.clawL = new AdvancedModelRenderer(this);
        this.clawL.setRotationPoint(0.5F, -1.0F, -2.75F);
        this.clawbaseL.addChild(clawL);


        this.clawmoveR_r2 = new AdvancedModelRenderer(this);
        this.clawmoveR_r2.setRotationPoint(-4.0F, 1.0F, 18.0F);
        this.clawL.addChild(clawmoveR_r2);
        this.setRotateAngle(clawmoveR_r2, 0.0F, -0.3491F, 0.0F);
        this.clawmoveR_r2.cubeList.add(new ModelBox(clawmoveR_r2, 7, 40, -2.5F, -1.0F, -21.0F, 1, 1, 3, 0.0F, true));
        this.clawmoveR_r2.cubeList.add(new ModelBox(clawmoveR_r2, 33, 24, -3.0F, -0.5F, -21.5F, 2, 0, 4, 0.0F, true));

        this.legsR = new AdvancedModelRenderer(this);
        this.legsR.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.body.addChild(legsR);


        this.legR1 = new AdvancedModelRenderer(this);
        this.legR1.setRotationPoint(-1.5F, -1.7F, -4.0F);
        this.legsR.addChild(legR1);
        this.setRotateAngle(legR1, 0.0F, -1.0036F, 0.0F);


        this.legR1_r1 = new AdvancedModelRenderer(this);
        this.legR1_r1.setRotationPoint(2.25F, 0.9F, 0.0F);
        this.legR1.addChild(legR1_r1);
        this.setRotateAngle(legR1_r1, 0.0F, -0.1745F, 0.0F);
        this.legR1_r1.cubeList.add(new ModelBox(legR1_r1, 0, 20, -4.1318F, -0.9F, -0.076F, 2, 0, 1, 0.0F, false));

        this.legR2 = new AdvancedModelRenderer(this);
        this.legR2.setRotationPoint(-2.0F, -1.6F, -4.5F);
        this.legsR.addChild(legR2);
        this.legR2.cubeList.add(new ModelBox(legR2, 21, 0, -6.0F, 0.0F, 0.0F, 7, 0, 1, 0.0F, false));

        this.legR3 = new AdvancedModelRenderer(this);
        this.legR3.setRotationPoint(-2.0F, -1.5F, -3.0F);
        this.legsR.addChild(legR3);


        this.legR3_r1 = new AdvancedModelRenderer(this);
        this.legR3_r1.setRotationPoint(0.0F, 1.0F, 0.0F);
        this.legR3.addChild(legR3_r1);
        this.setRotateAngle(legR3_r1, 0.0F, 0.1745F, 0.0F);
        this.legR3_r1.cubeList.add(new ModelBox(legR3_r1, 21, 1, -6.3777F, -1.0F, -0.6831F, 7, 0, 1, 0.0F, false));

        this.legR4 = new AdvancedModelRenderer(this);
        this.legR4.setRotationPoint(-2.0F, -1.5F, -2.5F);
        this.legsR.addChild(legR4);


        this.legR4_r1 = new AdvancedModelRenderer(this);
        this.legR4_r1.setRotationPoint(0.0F, 1.0F, 0.0F);
        this.legR4.addChild(legR4_r1);
        this.setRotateAngle(legR4_r1, 0.0F, 0.3491F, 0.0F);
        this.legR4_r1.cubeList.add(new ModelBox(legR4_r1, 35, 0, -6.4626F, -0.95F, -0.3763F, 7, 0, 1, 0.0F, false));

        this.legR5 = new AdvancedModelRenderer(this);
        this.legR5.setRotationPoint(-3.5F, -2.1F, 0.5F);
        this.legsR.addChild(legR5);
        this.setRotateAngle(legR5, 0.0F, -0.1309F, 0.0F);


        this.legR5_2_r1 = new AdvancedModelRenderer(this);
        this.legR5_2_r1.setRotationPoint(3.5F, 1.0F, -1.75F);
        this.legR5.addChild(legR5_2_r1);
        this.setRotateAngle(legR5_2_r1, 0.0F, 0.5236F, 0.0F);
        this.legR5_2_r1.cubeList.add(new ModelBox(legR5_2_r1, 0, 40, -7.5F, -1.0F, -0.5F, 4, 1, 1, -0.01F, false));
        this.legR5_2_r1.cubeList.add(new ModelBox(legR5_2_r1, 30, 40, -7.5F, -1.0F, -1.0F, 4, 1, 1, 0.0F, false));

        this.legRs5 = new AdvancedModelRenderer(this);
        this.legRs5.setRotationPoint(-2.8F, 1.0F, 1.7F);
        this.legR5.addChild(legRs5);
        this.setRotateAngle(legRs5, 0.0F, 0.6545F, 0.0F);


        this.legR5_2_r2 = new AdvancedModelRenderer(this);
        this.legR5_2_r2.setRotationPoint(8.3F, 0.0F, -4.7F);
        this.legRs5.addChild(legR5_2_r2);
        this.setRotateAngle(legR5_2_r2, 0.0F, 0.5236F, 0.0F);
        this.legR5_2_r2.cubeList.add(new ModelBox(legR5_2_r2, 36, 21, -14.5F, -1.0F, -1.25F, 5, 1, 2, 0.01F, false));

        this.legsL = new AdvancedModelRenderer(this);
        this.legsL.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.body.addChild(legsL);


        this.legL = new AdvancedModelRenderer(this);
        this.legL.setRotationPoint(1.5F, -1.7F, -4.0F);
        this.legsL.addChild(legL);
        this.setRotateAngle(legL, 0.0F, 1.0036F, 0.0F);


        this.legR2_r1 = new AdvancedModelRenderer(this);
        this.legR2_r1.setRotationPoint(-2.25F, 0.9F, 0.0F);
        this.legL.addChild(legR2_r1);
        this.setRotateAngle(legR2_r1, 0.0F, 0.1745F, 0.0F);
        this.legR2_r1.cubeList.add(new ModelBox(legR2_r1, 0, 20, 2.1318F, -0.9F, -0.076F, 2, 0, 1, 0.0F, true));

        this.legL2 = new AdvancedModelRenderer(this);
        this.legL2.setRotationPoint(2.0F, -1.6F, -4.5F);
        this.legsL.addChild(legL2);
        this.legL2.cubeList.add(new ModelBox(legL2, 21, 0, -1.0F, 0.0F, 0.0F, 7, 0, 1, 0.0F, true));

        this.legL3 = new AdvancedModelRenderer(this);
        this.legL3.setRotationPoint(2.0F, -1.5F, -3.0F);
        this.legsL.addChild(legL3);


        this.legR4_r2 = new AdvancedModelRenderer(this);
        this.legR4_r2.setRotationPoint(0.0F, 1.0F, 0.0F);
        this.legL3.addChild(legR4_r2);
        this.setRotateAngle(legR4_r2, 0.0F, -0.1745F, 0.0F);
        this.legR4_r2.cubeList.add(new ModelBox(legR4_r2, 21, 1, -0.6223F, -1.0F, -0.6831F, 7, 0, 1, 0.0F, true));

        this.legL4 = new AdvancedModelRenderer(this);
        this.legL4.setRotationPoint(2.0F, -1.5F, -2.5F);
        this.legsL.addChild(legL4);


        this.legR5_r1 = new AdvancedModelRenderer(this);
        this.legR5_r1.setRotationPoint(0.0F, 1.0F, 0.0F);
        this.legL4.addChild(legR5_r1);
        this.setRotateAngle(legR5_r1, 0.0F, -0.3491F, 0.0F);
        this.legR5_r1.cubeList.add(new ModelBox(legR5_r1, 35, 0, -0.5374F, -0.95F, -0.3763F, 7, 0, 1, 0.0F, true));

        this.legL5 = new AdvancedModelRenderer(this);
        this.legL5.setRotationPoint(3.5F, -2.1F, 0.5F);
        this.legsL.addChild(legL5);
        this.setRotateAngle(legL5, 0.0F, 0.1309F, 0.0F);


        this.legR5_3_r1 = new AdvancedModelRenderer(this);
        this.legR5_3_r1.setRotationPoint(-3.5F, 1.0F, -1.75F);
        this.legL5.addChild(legR5_3_r1);
        this.setRotateAngle(legR5_3_r1, 0.0F, -0.5236F, 0.0F);
        this.legR5_3_r1.cubeList.add(new ModelBox(legR5_3_r1, 0, 40, 3.5F, -1.0F, -0.5F, 4, 1, 1, -0.01F, true));
        this.legR5_3_r1.cubeList.add(new ModelBox(legR5_3_r1, 30, 40, 3.5F, -1.0F, -1.0F, 4, 1, 1, 0.0F, true));

        this.legLs5 = new AdvancedModelRenderer(this);
        this.legLs5.setRotationPoint(2.8F, 1.0F, 1.7F);
        this.legL5.addChild(legLs5);
        this.setRotateAngle(legLs5, 0.0F, -0.6545F, 0.0F);


        this.legR5_3_r2 = new AdvancedModelRenderer(this);
        this.legR5_3_r2.setRotationPoint(-8.3F, 0.0F, -4.7F);
        this.legLs5.addChild(legR5_3_r2);
        this.setRotateAngle(legR5_3_r2, 0.0F, -0.5236F, 0.0F);
        this.legR5_3_r2.cubeList.add(new ModelBox(legR5_3_r2, 36, 21, 9.5F, -1.0F, -1.25F, 5, 1, 2, 0.01F, true));

        this.opisthosoma = new AdvancedModelRenderer(this);
        this.opisthosoma.setRotationPoint(0.0F, -2.5F, 1.0F);
        this.body.addChild(opisthosoma);
        this.opisthosoma.cubeList.add(new ModelBox(opisthosoma, 14, 20, -4.5F, -1.53F, 0.0F, 9, 3, 2, -0.01F, false));
        this.opisthosoma.cubeList.add(new ModelBox(opisthosoma, 0, 15, -0.5F, 1.47F, -0.5F, 1, 0, 4, -0.01F, false));

        this.tergiteA = new AdvancedModelRenderer(this);
        this.tergiteA.setRotationPoint(0.0F, 0.0F, 1.5F);
        this.opisthosoma.addChild(tergiteA);
        this.tergiteA.cubeList.add(new ModelBox(tergiteA, 0, 10, -5.0F, -1.5275F, 0.0F, 10, 3, 2, 0.0F, false));

        this.tergiteA2 = new AdvancedModelRenderer(this);
        this.tergiteA2.setRotationPoint(0.0F, 0.0F, 2.0F);
        this.tergiteA.addChild(tergiteA2);
        this.tergiteA2.cubeList.add(new ModelBox(tergiteA2, 0, 5, -5.0F, -1.525F, 0.0F, 10, 3, 2, 0.0F, false));

        this.tergiteA3 = new AdvancedModelRenderer(this);
        this.tergiteA3.setRotationPoint(0.0F, 0.0F, 2.0F);
        this.tergiteA2.addChild(tergiteA3);
        this.tergiteA3.cubeList.add(new ModelBox(tergiteA3, 0, 0, -5.0F, -1.525F, 0.0F, 10, 3, 2, 0.0F, false));

        this.tergiteA4 = new AdvancedModelRenderer(this);
        this.tergiteA4.setRotationPoint(0.0F, 0.0F, 2.0F);
        this.tergiteA3.addChild(tergiteA4);
        this.tergiteA4.cubeList.add(new ModelBox(tergiteA4, 16, 15, -4.5F, -1.525F, 0.0F, 9, 3, 2, 0.0F, false));

        this.tergiteB = new AdvancedModelRenderer(this);
        this.tergiteB.setRotationPoint(0.0F, 0.0F, 2.0F);
        this.tergiteA4.addChild(tergiteB);
        this.tergiteB.cubeList.add(new ModelBox(tergiteB, 0, 25, -4.0F, -1.5F, 0.0F, 8, 3, 2, 0.0F, false));

        this.tergiteC = new AdvancedModelRenderer(this);
        this.tergiteC.setRotationPoint(0.0F, 0.0F, 2.0F);
        this.tergiteB.addChild(tergiteC);
        this.tergiteC.cubeList.add(new ModelBox(tergiteC, 24, 7, -3.5F, -1.5F, -0.75F, 7, 3, 3, -0.01F, false));

        this.tergiteD = new AdvancedModelRenderer(this);
        this.tergiteD.setRotationPoint(0.0F, 0.0F, 2.25F);
        this.tergiteC.addChild(tergiteD);
        this.tergiteD.cubeList.add(new ModelBox(tergiteD, 22, 29, -3.0F, -1.0075F, -0.75F, 6, 2, 3, 0.0F, false));

        this.tergiteD2 = new AdvancedModelRenderer(this);
        this.tergiteD2.setRotationPoint(0.0F, 0.0F, 2.25F);
        this.tergiteD.addChild(tergiteD2);
        this.tergiteD2.cubeList.add(new ModelBox(tergiteD2, 0, 30, -2.5F, -1.0075F, -0.75F, 5, 2, 3, -0.01F, false));

        this.tergiteE = new AdvancedModelRenderer(this);
        this.tergiteE.setRotationPoint(0.0F, 0.0F, 2.25F);
        this.tergiteD2.addChild(tergiteE);
        this.tergiteE.cubeList.add(new ModelBox(tergiteE, 14, 37, -2.0F, -1.0025F, 0.0F, 4, 2, 2, 0.0F, false));

        this.tergiteE2 = new AdvancedModelRenderer(this);
        this.tergiteE2.setRotationPoint(0.0F, 0.0F, 2.0F);
        this.tergiteE.addChild(tergiteE2);
        this.tergiteE2.cubeList.add(new ModelBox(tergiteE2, 0, 35, -2.0F, -1.0F, -0.5F, 4, 2, 3, -0.01F, false));

        this.tergiteF = new AdvancedModelRenderer(this);
        this.tergiteF.setRotationPoint(0.0F, 0.0F, 2.5F);
        this.tergiteE2.addChild(tergiteF);
        this.tergiteF.cubeList.add(new ModelBox(tergiteF, 36, 13, -2.0F, -0.4975F, 0.0F, 4, 1, 3, 0.0F, false));
        this.tergiteF.cubeList.add(new ModelBox(tergiteF, 0, 21, -2.5F, 0.25F, 0.0F, 5, 0, 3, 0.0F, false));
        this.tergiteF.cubeList.add(new ModelBox(tergiteF, 0, 16, 0.0F, -1.0F, 0.0F, 0, 1, 3, 0.0F, false));

        this.telson = new AdvancedModelRenderer(this);
        this.telson.setRotationPoint(0.0F, 0.0F, 3.0F);
        this.tergiteF.addChild(telson);
        this.telson.cubeList.add(new ModelBox(telson, 35, 34, -0.5F, -0.5F, 0.0F, 1, 1, 5, 0.0F, false));
        this.telson.cubeList.add(new ModelBox(telson, 0, 15, -2.5F, 0.0F, 0.0F, 5, 0, 6, 0.0F, false));
        this.telson.cubeList.add(new ModelBox(telson, 24, 8, 0.0F, -2.0F, 0.0F, 0, 2, 5, 0.0F, false));

        updateDefaultPose();
        animator = ModelAnimator.create();
    }

    @Override
    public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        animate((IAnimatedEntity) entity, f, f1, f2, f3, f4, f5);
        this.body.render(f5);
    }

    public void renderStaticWall(float f) {
        this.body.rotateAngleY = (float) Math.toRadians(360);
        this.setRotateAngle(body, 1.5F, 0.0F, -0.25F);
        this.body.offsetY = -0.2F;
        this.body.offsetX = 0.02F;
        this.body.offsetZ = -0.29F;
        this.body.render(0.01F);
        resetToDefaultPose();
    }

    public void renderStaticFloor(float f) {
        resetToDefaultPose();
    }

    @Override
    public void renderStaticBook(float f) {
        //Rotations, positions and sizing:
        this.body.offsetY = -1.0F;
        this.body.offsetX = 0.0F;
        this.body.offsetZ = 2.0F;
        this.body.rotateAngleY = (float)Math.toRadians(120);
        this.body.rotateAngleX = (float)Math.toRadians(1);
        this.body.rotateAngleZ = (float)Math.toRadians(0);
        this.body.scaleChildren = true;
        float scaler = 1.F;
        this.body.setScale(scaler, scaler, scaler);
        //Start of pose:
        this.setRotateAngle(body, 0.6F, 3.8F, -0.2F);
        //End of pose, now render the model:
        this.body.render(f);
        //Reset rotations, positions and sizing:
        this.body.setScale(1.0F, 1.0F, 1.0F);
        this.body.scaleChildren = false;
        resetToDefaultPose();

    }

    public void setRotateAngle(ModelRenderer modelRenderer, float x, float y, float z) {
        modelRenderer.rotateAngleX = x;
        modelRenderer.rotateAngleY = y;
        modelRenderer.rotateAngleZ = z;
    }

    @Override
    public void setRotationAngles(float f, float f1, float f2, float f3, float f4, float f5, Entity e) {
        super.setRotationAngles(f, f1, f2, f3, f4, f5, e);
        //this.resetToDefaultPose();
       // this.body.offsetY = 0.4F;
        this.body.offsetY = -0.25F;
        this.body.offsetZ = 0.1F;

        AdvancedModelRenderer[] fishBody = {this.tergiteA, this.tergiteA2, this.tergiteA3, this.tergiteA4, this.telson};
        AdvancedModelRenderer[] fishTail = {this.tergiteA4, this.telson};

        //mouthparts:
        this.walk(cheliceraL, 0.35F, -0.15F, false, 0, -0.1F, f2, 0.6F);
        this.walk(cheliceraR, 0.35F, 0.15F, false, -1, 0.1F, f2, 0.6F);

        float speed = 0.2F;
        float tailHdegree = 0.0F;
        float paddleVdegree = 0.05F;
        float paddleHdegree = 0.4F;
        float tailSwing = 0.50F;

        EntityPrehistoricFloraErettopterus ciurc = (EntityPrehistoricFloraErettopterus) e;


        if (e instanceof EntityLiving && !((EntityLiving) e).isAIDisabled()) {
            if ((!ciurc.getIsMoving()) && ciurc.isReallyInWater()) {
                this.chainWave(fishBody, speed, 0.02F, -0.2F, f2, 0.2F);
                this.chainSwing(fishTail, speed, 0.05F, -0.6F, f2, 0.6F);
                this.chainWave(fishTail, speed, 0.05F, -0.6F, f2, 0.6F);
            }

            //this.chainSwing(fishfinL, speed, -paddleHdegree, -3, f2, 1);
            //this.chainWave(fishfinL, speed, paddleVdegree, -3, f2, 2);
            //this.chainSwing(fishfinR, speed, paddleHdegree, -3, f2, 1);
            //this.chainWave(fishfinR, speed, paddleVdegree, -3, f2, 2);

            //pincers:
            //this.swing(cheliceraL, 0.3F, -0.1F, false, 0, -0.1F, f2, 0.6F);
            //this.swing(cheliceraR, 0.3F, 0.1F, false, 0, 0.1F, f2, 0.6F);

            if (!e.isInWater()) {
                //this.Bodyfront.rotateAngleZ = (float) Math.toRadians(90);
               // this.body.offsetY = 0.2F;
                this.bob(body, -speed * 5.0F, 2F, false, f2, 1);
                this.chainSwing(fishBody, speed * 3.0F, 0.05F, -2, f2, 1);
            }
        }
    }

    @Override
    public void setLivingAnimations(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime) {
        super.setLivingAnimations(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime);
        this.resetToDefaultPose();
        EntityPrehistoricFloraErettopterus ee = (EntityPrehistoricFloraErettopterus) entitylivingbaseIn;
        //Swimming pose:
        if (ee.isReallyInWater()) {
            if (ee.getIsMoving()) {
                if ((!ee.isReallySwimming()) && (ee.getAnimation() != ee.UNSWIM_ANIMATION)) {
                    //Walk pose:
                    animWalking(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime, false);
                } else {
                    if ((ee.getAnimation() != ee.SWIM_ANIMATION)) {
                        if (ee.getIsFast()) {
                            animSwimFast(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime);
                        } else {
                            animSwim(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime, false);
                        }
                    }
                }
            }
            else { //in water but not moving:
                if (ee.getAnimation() != ee.UNSWIM_ANIMATION && ee.getAnimation() != ee.SWIM_ANIMATION) {
                    if (ee.isReallySwimming()) {
                        //Swim static pose:
                        animSwim(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime, true);
                    } else {
                        //Walk static pose:
                        animWalking(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime, true);
                    }
                }
            }
        }

    }

    public void animWalking(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime, boolean isStatic) {
        EntityPrehistoricFloraErettopterus entity = (EntityPrehistoricFloraErettopterus) entitylivingbaseIn;
        int animCycle = 40;
        double tickAnim = (entity.ticksExisted + entity.getTickOffset()) - (int) (Math.floor((double) (entity.ticksExisted + entity.getTickOffset()) / (double) animCycle) * (double) animCycle) + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;
        this.setRotateAngle(body, body.rotateAngleX + (float) Math.toRadians(5-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*90/0.5))), body.rotateAngleY + (float) Math.toRadians(-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*90/0.5+90))), body.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*90/0.5+90))));
        this.body.rotationPointX = this.body.rotationPointX + (float)(0);
        this.body.rotationPointY = this.body.rotationPointY - (float)(1+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*90/0.5))*0.1);
        this.body.rotationPointZ = this.body.rotationPointZ + (float)(0);

        if (tickAnim >= 0 && tickAnim < 18) {
            xx = -3.06093 + (((tickAnim - 0) / 18) * (-7.61379-(-3.06093)));
            yy = -5.70215 + (((tickAnim - 0) / 18) * (-1.1524-(-5.70215)));
            zz = 1.07928 + (((tickAnim - 0) / 18) * (0.55354-(1.07928)));
        }
        else if (tickAnim >= 18 && tickAnim < 38) {
            xx = -7.61379 + (((tickAnim - 18) / 20) * (-2.64742-(-7.61379)));
            yy = -1.1524 + (((tickAnim - 18) / 20) * (-6.11596-(-1.1524)));
            zz = 0.55354 + (((tickAnim - 18) / 20) * (1.13159-(0.55354)));
        }
        else if (tickAnim >= 38 && tickAnim < 40) {
            xx = -2.64742 + (((tickAnim - 38) / 2) * (-3.06093-(-2.64742)));
            yy = -6.11596 + (((tickAnim - 38) / 2) * (-5.70215-(-6.11596)));
            zz = 1.13159 + (((tickAnim - 38) / 2) * (1.07928-(1.13159)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(cheliceraR, cheliceraR.rotateAngleX + (float) Math.toRadians(xx), cheliceraR.rotateAngleY + (float) Math.toRadians(yy), cheliceraR.rotateAngleZ + (float) Math.toRadians(zz));

        if (tickAnim >= 0 && tickAnim < 40) {
            xx = 172.18821 + (((tickAnim - 0) / 40) * (172.18821-(172.18821)));
            yy = 9.23186 + (((tickAnim - 0) / 40) * (9.23186-(9.23186)));
            zz = -3.86032 + (((tickAnim - 0) / 40) * (-3.86032-(-3.86032)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(clawbaseR, clawbaseR.rotateAngleX + (float) Math.toRadians(xx), clawbaseR.rotateAngleY + (float) Math.toRadians(yy), clawbaseR.rotateAngleZ + (float) Math.toRadians(zz));

        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 3.72 + (((tickAnim - 0) / 3) * (9.56646-(3.72)));
            yy = -29.37 + (((tickAnim - 0) / 3) * (-34.78253-(-29.37)));
            zz = -14.85 + (((tickAnim - 0) / 3) * (-22.79541-(-14.85)));
        }
        else if (tickAnim >= 3 && tickAnim < 13) {
            xx = 9.56646 + (((tickAnim - 3) / 10) * (0.44896-(9.56646)));
            yy = -34.78253 + (((tickAnim - 3) / 10) * (-13.93478-(-34.78253)));
            zz = -22.79541 + (((tickAnim - 3) / 10) * (-20.95158-(-22.79541)));
        }
        else if (tickAnim >= 13 && tickAnim < 18) {
            xx = 0.44896 + (((tickAnim - 13) / 5) * (0.80105-(0.44896)));
            yy = -13.93478 + (((tickAnim - 13) / 5) * (-26.67086-(-13.93478)));
            zz = -20.95158 + (((tickAnim - 13) / 5) * (-10.87935-(-20.95158)));
        }
        else if (tickAnim >= 18 && tickAnim < 23) {
            xx = 0.80105 + (((tickAnim - 18) / 5) * (9.56646-(0.80105)));
            yy = -26.67086 + (((tickAnim - 18) / 5) * (-34.78253-(-26.67086)));
            zz = -10.87935 + (((tickAnim - 18) / 5) * (-22.79541-(-10.87935)));
        }
        else if (tickAnim >= 23 && tickAnim < 33) {
            xx = 9.56646 + (((tickAnim - 23) / 10) * (0.44896-(9.56646)));
            yy = -34.78253 + (((tickAnim - 23) / 10) * (-13.93478-(-34.78253)));
            zz = -22.79541 + (((tickAnim - 23) / 10) * (-20.95158-(-22.79541)));
        }
        else if (tickAnim >= 33 && tickAnim < 38) {
            xx = 0.44896 + (((tickAnim - 33) / 5) * (0.80105-(0.44896)));
            yy = -13.93478 + (((tickAnim - 33) / 5) * (-26.67086-(-13.93478)));
            zz = -20.95158 + (((tickAnim - 33) / 5) * (-10.87935-(-20.95158)));
        }
        else if (tickAnim >= 38 && tickAnim < 40) {
            xx = 0.80105 + (((tickAnim - 38) / 2) * (3.72-(0.80105)));
            yy = -26.67086 + (((tickAnim - 38) / 2) * (-29.37-(-26.67086)));
            zz = -10.87935 + (((tickAnim - 38) / 2) * (-14.85-(-10.87935)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(legR2, legR2.rotateAngleX + (float) Math.toRadians(xx), legR2.rotateAngleY + (float) Math.toRadians(yy), legR2.rotateAngleZ + (float) Math.toRadians(zz));

        if (tickAnim >= 0 && tickAnim < 2) {
            xx = -9.64 + (((tickAnim - 0) / 2) * (-10.91897-(-9.64)));
            yy = -1.09 + (((tickAnim - 0) / 2) * (2.42778-(-1.09)));
            zz = -20.22 + (((tickAnim - 0) / 2) * (-20.36347-(-20.22)));
        }
        else if (tickAnim >= 2 && tickAnim < 7) {
            xx = -10.91897 + (((tickAnim - 2) / 5) * (-8.06374-(-10.91897)));
            yy = 2.42778 + (((tickAnim - 2) / 5) * (-8.6169-(2.42778)));
            zz = -20.36347 + (((tickAnim - 2) / 5) * (-9.79816-(-20.36347)));
        }
        else if (tickAnim >= 7 && tickAnim < 12) {
            xx = -8.06374 + (((tickAnim - 7) / 5) * (-3.24764-(-8.06374)));
            yy = -8.6169 + (((tickAnim - 7) / 5) * (-18.67616-(-8.6169)));
            zz = -9.79816 + (((tickAnim - 7) / 5) * (-19.48142-(-9.79816)));
        }
        else if (tickAnim >= 12 && tickAnim < 22) {
            xx = -3.24764 + (((tickAnim - 12) / 10) * (-10.91897-(-3.24764)));
            yy = -18.67616 + (((tickAnim - 12) / 10) * (2.42778-(-18.67616)));
            zz = -19.48142 + (((tickAnim - 12) / 10) * (-20.36347-(-19.48142)));
        }
        else if (tickAnim >= 22 && tickAnim < 27) {
            xx = -10.91897 + (((tickAnim - 22) / 5) * (-8.06374-(-10.91897)));
            yy = 2.42778 + (((tickAnim - 22) / 5) * (-8.6169-(2.42778)));
            zz = -20.36347 + (((tickAnim - 22) / 5) * (-9.79816-(-20.36347)));
        }
        else if (tickAnim >= 27 && tickAnim < 32) {
            xx = -8.06374 + (((tickAnim - 27) / 5) * (-3.24764-(-8.06374)));
            yy = -8.6169 + (((tickAnim - 27) / 5) * (-18.67616-(-8.6169)));
            zz = -9.79816 + (((tickAnim - 27) / 5) * (-19.48142-(-9.79816)));
        }
        else if (tickAnim >= 32 && tickAnim < 40) {
            xx = -3.24764 + (((tickAnim - 32) / 8) * (-9.64-(-3.24764)));
            yy = -18.67616 + (((tickAnim - 32) / 8) * (-1.09-(-18.67616)));
            zz = -19.48142 + (((tickAnim - 32) / 8) * (-20.22-(-19.48142)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(legR3, legR3.rotateAngleX + (float) Math.toRadians(xx), legR3.rotateAngleY + (float) Math.toRadians(yy), legR3.rotateAngleZ + (float) Math.toRadians(zz));

        if (tickAnim >= 0 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 0) / 5) * (-0.38466-(0)));
            yy = -22.5 + (((tickAnim - 0) / 5) * (-23.74161-(-22.5)));
            zz = 0 + (((tickAnim - 0) / 5) * (2.5294-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 10) {
            xx = -0.38466 + (((tickAnim - 5) / 5) * (0-(-0.38466)));
            yy = -23.74161 + (((tickAnim - 5) / 5) * (-25-(-23.74161)));
            zz = 2.5294 + (((tickAnim - 5) / 5) * (0-(2.5294)));
        }
        else if (tickAnim >= 10 && tickAnim < 14) {
            xx = 0 + (((tickAnim - 10) / 4) * (0.39397-(0)));
            yy = -25 + (((tickAnim - 10) / 4) * (-23.94974-(-25)));
            zz = 0 + (((tickAnim - 10) / 4) * (-2.53083-(0)));
        }
        else if (tickAnim >= 14 && tickAnim < 20) {
            xx = 0.39397 + (((tickAnim - 14) / 6) * (0-(0.39397)));
            yy = -23.94974 + (((tickAnim - 14) / 6) * (-22.5-(-23.94974)));
            zz = -2.53083 + (((tickAnim - 14) / 6) * (0-(-2.53083)));
        }
        else if (tickAnim >= 20 && tickAnim < 24) {
            xx = 0 + (((tickAnim - 20) / 4) * (-0.37536-(0)));
            yy = -22.5 + (((tickAnim - 20) / 4) * (-23.53348-(-22.5)));
            zz = 0 + (((tickAnim - 20) / 4) * (2.528-(0)));
        }
        else if (tickAnim >= 24 && tickAnim < 30) {
            xx = -0.37536 + (((tickAnim - 24) / 6) * (0-(-0.37536)));
            yy = -23.53348 + (((tickAnim - 24) / 6) * (-25-(-23.53348)));
            zz = 2.528 + (((tickAnim - 24) / 6) * (0-(2.528)));
        }
        else if (tickAnim >= 30 && tickAnim < 34) {
            xx = 0 + (((tickAnim - 30) / 4) * (0.39397-(0)));
            yy = -25 + (((tickAnim - 30) / 4) * (-23.94974-(-25)));
            zz = 0 + (((tickAnim - 30) / 4) * (-2.53083-(0)));
        }
        else if (tickAnim >= 34 && tickAnim < 40) {
            xx = 0.39397 + (((tickAnim - 34) / 6) * (0-(0.39397)));
            yy = -23.94974 + (((tickAnim - 34) / 6) * (-22.5-(-23.94974)));
            zz = -2.53083 + (((tickAnim - 34) / 6) * (0-(-2.53083)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(legR5, legR5.rotateAngleX + (float) Math.toRadians(xx), legR5.rotateAngleY + (float) Math.toRadians(yy), legR5.rotateAngleZ + (float) Math.toRadians(zz));

        if (tickAnim >= 0 && tickAnim < 5) {
            xx = -13.5 + (((tickAnim - 0) / 5) * (-11.64715-(-13.5)));
            yy = 9.75 + (((tickAnim - 0) / 5) * (-1.47238-(9.75)));
            zz = -10.53 + (((tickAnim - 0) / 5) * (-18.97134-(-10.53)));
        }
        else if (tickAnim >= 5 && tickAnim < 15) {
            xx = -11.64715 + (((tickAnim - 5) / 10) * (-19.58754-(-11.64715)));
            yy = -1.47238 + (((tickAnim - 5) / 10) * (19.54204-(-1.47238)));
            zz = -18.97134 + (((tickAnim - 5) / 10) * (-22.22793-(-18.97134)));
        }
        else if (tickAnim >= 15 && tickAnim < 20) {
            xx = -19.58754 + (((tickAnim - 15) / 5) * (-13.5-(-19.58754)));
            yy = 19.54204 + (((tickAnim - 15) / 5) * (9.75-(19.54204)));
            zz = -22.22793 + (((tickAnim - 15) / 5) * (-10.53-(-22.22793)));
        }
        else if (tickAnim >= 20 && tickAnim < 25) {
            xx = -13.5 + (((tickAnim - 20) / 5) * (-11.64715-(-13.5)));
            yy = 9.75 + (((tickAnim - 20) / 5) * (-1.47238-(9.75)));
            zz = -10.53 + (((tickAnim - 20) / 5) * (-18.97134-(-10.53)));
        }
        else if (tickAnim >= 25 && tickAnim < 35) {
            xx = -11.64715 + (((tickAnim - 25) / 10) * (-19.58754-(-11.64715)));
            yy = -1.47238 + (((tickAnim - 25) / 10) * (19.54204-(-1.47238)));
            zz = -18.97134 + (((tickAnim - 25) / 10) * (-22.22793-(-18.97134)));
        }
        else if (tickAnim >= 35 && tickAnim < 40) {
            xx = -19.58754 + (((tickAnim - 35) / 5) * (-13.50055-(-19.58754)));
            yy = 19.54204 + (((tickAnim - 35) / 5) * (9.74753-(19.54204)));
            zz = -22.22793 + (((tickAnim - 35) / 5) * (-10.52744-(-22.22793)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(legR4, legR4.rotateAngleX + (float) Math.toRadians(xx), legR4.rotateAngleY + (float) Math.toRadians(yy), legR4.rotateAngleZ + (float) Math.toRadians(zz));

        if (tickAnim >= 0 && tickAnim < 10) {
            xx = -1.5 + (((tickAnim - 0) / 10) * (-2.50238-(-1.5)));
            yy = 0 + (((tickAnim - 0) / 10) * (-1-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (0.10912-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 20) {
            xx = -2.50238 + (((tickAnim - 10) / 10) * (-3.5-(-2.50238)));
            yy = -1 + (((tickAnim - 10) / 10) * (0-(-1)));
            zz = 0.10912 + (((tickAnim - 10) / 10) * (0-(0.10912)));
        }
        else if (tickAnim >= 20 && tickAnim < 30) {
            xx = -3.5 + (((tickAnim - 20) / 10) * (-2.50238-(-3.5)));
            yy = 0 + (((tickAnim - 20) / 10) * (1-(0)));
            zz = 0 + (((tickAnim - 20) / 10) * (-0.10912-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 40) {
            xx = -2.50238 + (((tickAnim - 30) / 10) * (-1.5-(-2.50238)));
            yy = 1 + (((tickAnim - 30) / 10) * (0-(1)));
            zz = -0.10912 + (((tickAnim - 30) / 10) * (0-(-0.10912)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(opisthosoma, opisthosoma.rotateAngleX + (float) Math.toRadians(xx), opisthosoma.rotateAngleY + (float) Math.toRadians(yy), opisthosoma.rotateAngleZ + (float) Math.toRadians(zz));

        if (tickAnim >= 0 && tickAnim < 2) {
            xx = -1.67 + (((tickAnim - 0) / 2) * (-1.5-(-1.67)));
            yy = 0.17 + (((tickAnim - 0) / 2) * (0-(0.17)));
            zz = -0.02 + (((tickAnim - 0) / 2) * (0-(-0.02)));
        }
        else if (tickAnim >= 2 && tickAnim < 12) {
            xx = -1.5 + (((tickAnim - 2) / 10) * (-2.50238-(-1.5)));
            yy = 0 + (((tickAnim - 2) / 10) * (-1-(0)));
            zz = 0 + (((tickAnim - 2) / 10) * (0.10912-(0)));
        }
        else if (tickAnim >= 12 && tickAnim < 22) {
            xx = -2.50238 + (((tickAnim - 12) / 10) * (-3.5-(-2.50238)));
            yy = -1 + (((tickAnim - 12) / 10) * (0-(-1)));
            zz = 0.10912 + (((tickAnim - 12) / 10) * (0-(0.10912)));
        }
        else if (tickAnim >= 22 && tickAnim < 32) {
            xx = -3.5 + (((tickAnim - 22) / 10) * (-2.50238-(-3.5)));
            yy = 0 + (((tickAnim - 22) / 10) * (1-(0)));
            zz = 0 + (((tickAnim - 22) / 10) * (-0.10912-(0)));
        }
        else if (tickAnim >= 32 && tickAnim < 40) {
            xx = -2.50238 + (((tickAnim - 32) / 8) * (-1.67-(-2.50238)));
            yy = 1 + (((tickAnim - 32) / 8) * (0.17-(1)));
            zz = -0.10912 + (((tickAnim - 32) / 8) * (-0.02-(-0.10912)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tergiteA, tergiteA.rotateAngleX + (float) Math.toRadians(xx), tergiteA.rotateAngleY + (float) Math.toRadians(yy), tergiteA.rotateAngleZ + (float) Math.toRadians(zz));

        if (tickAnim >= 0 && tickAnim < 3) {
            xx = -1.83 + (((tickAnim - 0) / 3) * (-1.5-(-1.83)));
            yy = 0.33 + (((tickAnim - 0) / 3) * (0-(0.33)));
            zz = -0.04 + (((tickAnim - 0) / 3) * (0-(-0.04)));
        }
        else if (tickAnim >= 3 && tickAnim < 13) {
            xx = -1.5 + (((tickAnim - 3) / 10) * (-2.50238-(-1.5)));
            yy = 0 + (((tickAnim - 3) / 10) * (-1-(0)));
            zz = 0 + (((tickAnim - 3) / 10) * (0.10912-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 23) {
            xx = -2.50238 + (((tickAnim - 13) / 10) * (-3.5-(-2.50238)));
            yy = -1 + (((tickAnim - 13) / 10) * (0-(-1)));
            zz = 0.10912 + (((tickAnim - 13) / 10) * (0-(0.10912)));
        }
        else if (tickAnim >= 23 && tickAnim < 33) {
            xx = -3.5 + (((tickAnim - 23) / 10) * (-2.50238-(-3.5)));
            yy = 0 + (((tickAnim - 23) / 10) * (1-(0)));
            zz = 0 + (((tickAnim - 23) / 10) * (-0.10912-(0)));
        }
        else if (tickAnim >= 33 && tickAnim < 40) {
            xx = -2.50238 + (((tickAnim - 33) / 7) * (-1.83-(-2.50238)));
            yy = 1 + (((tickAnim - 33) / 7) * (0.33-(1)));
            zz = -0.10912 + (((tickAnim - 33) / 7) * (-0.04-(-0.10912)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tergiteA2, tergiteA2.rotateAngleX + (float) Math.toRadians(xx), tergiteA2.rotateAngleY + (float) Math.toRadians(yy), tergiteA2.rotateAngleZ + (float) Math.toRadians(zz));

        if (tickAnim >= 0 && tickAnim < 5) {
            xx = -2 + (((tickAnim - 0) / 5) * (-1.5-(-2)));
            yy = 0.5 + (((tickAnim - 0) / 5) * (0-(0.5)));
            zz = -0.05 + (((tickAnim - 0) / 5) * (0-(-0.05)));
        }
        else if (tickAnim >= 5 && tickAnim < 15) {
            xx = -1.5 + (((tickAnim - 5) / 10) * (-2.50238-(-1.5)));
            yy = 0 + (((tickAnim - 5) / 10) * (-1-(0)));
            zz = 0 + (((tickAnim - 5) / 10) * (0.10912-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 25) {
            xx = -2.50238 + (((tickAnim - 15) / 10) * (-3.5-(-2.50238)));
            yy = -1 + (((tickAnim - 15) / 10) * (0-(-1)));
            zz = 0.10912 + (((tickAnim - 15) / 10) * (0-(0.10912)));
        }
        else if (tickAnim >= 25 && tickAnim < 35) {
            xx = -3.5 + (((tickAnim - 25) / 10) * (-2.50238-(-3.5)));
            yy = 0 + (((tickAnim - 25) / 10) * (1-(0)));
            zz = 0 + (((tickAnim - 25) / 10) * (-0.10912-(0)));
        }
        else if (tickAnim >= 35 && tickAnim < 40) {
            xx = -2.50238 + (((tickAnim - 35) / 5) * (-2-(-2.50238)));
            yy = 1 + (((tickAnim - 35) / 5) * (0.5-(1)));
            zz = -0.10912 + (((tickAnim - 35) / 5) * (-0.05-(-0.10912)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tergiteA3, tergiteA3.rotateAngleX + (float) Math.toRadians(xx), tergiteA3.rotateAngleY + (float) Math.toRadians(yy), tergiteA3.rotateAngleZ + (float) Math.toRadians(zz));

        if (tickAnim >= 0 && tickAnim < 7) {
            xx = -2.17 + (((tickAnim - 0) / 7) * (-1.5-(-2.17)));
            yy = 0.67 + (((tickAnim - 0) / 7) * (0-(0.67)));
            zz = -0.07 + (((tickAnim - 0) / 7) * (0-(-0.07)));
        }
        else if (tickAnim >= 7 && tickAnim < 17) {
            xx = -1.5 + (((tickAnim - 7) / 10) * (-2.50238-(-1.5)));
            yy = 0 + (((tickAnim - 7) / 10) * (-1-(0)));
            zz = 0 + (((tickAnim - 7) / 10) * (0.10912-(0)));
        }
        else if (tickAnim >= 17 && tickAnim < 27) {
            xx = -2.50238 + (((tickAnim - 17) / 10) * (-3.5-(-2.50238)));
            yy = -1 + (((tickAnim - 17) / 10) * (0-(-1)));
            zz = 0.10912 + (((tickAnim - 17) / 10) * (0-(0.10912)));
        }
        else if (tickAnim >= 27 && tickAnim < 37) {
            xx = -3.5 + (((tickAnim - 27) / 10) * (-2.50238-(-3.5)));
            yy = 0 + (((tickAnim - 27) / 10) * (1-(0)));
            zz = 0 + (((tickAnim - 27) / 10) * (-0.10912-(0)));
        }
        else if (tickAnim >= 37 && tickAnim < 40) {
            xx = -2.50238 + (((tickAnim - 37) / 3) * (-2.17-(-2.50238)));
            yy = 1 + (((tickAnim - 37) / 3) * (0.67-(1)));
            zz = -0.10912 + (((tickAnim - 37) / 3) * (-0.07-(-0.10912)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tergiteA4, tergiteA4.rotateAngleX + (float) Math.toRadians(xx), tergiteA4.rotateAngleY + (float) Math.toRadians(yy), tergiteA4.rotateAngleZ + (float) Math.toRadians(zz));

        if (tickAnim >= 0 && tickAnim < 8) {
            xx = -2.34 + (((tickAnim - 0) / 8) * (-1.5-(-2.34)));
            yy = 0.83 + (((tickAnim - 0) / 8) * (0-(0.83)));
            zz = -0.09 + (((tickAnim - 0) / 8) * (0-(-0.09)));
        }
        else if (tickAnim >= 8 && tickAnim < 18) {
            xx = -1.5 + (((tickAnim - 8) / 10) * (-2.50238-(-1.5)));
            yy = 0 + (((tickAnim - 8) / 10) * (-1-(0)));
            zz = 0 + (((tickAnim - 8) / 10) * (0.10912-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 28) {
            xx = -2.50238 + (((tickAnim - 18) / 10) * (-3.5-(-2.50238)));
            yy = -1 + (((tickAnim - 18) / 10) * (0-(-1)));
            zz = 0.10912 + (((tickAnim - 18) / 10) * (0-(0.10912)));
        }
        else if (tickAnim >= 28 && tickAnim < 38) {
            xx = -3.5 + (((tickAnim - 28) / 10) * (-2.50238-(-3.5)));
            yy = 0 + (((tickAnim - 28) / 10) * (1-(0)));
            zz = 0 + (((tickAnim - 28) / 10) * (-0.10912-(0)));
        }
        else if (tickAnim >= 38 && tickAnim < 40) {
            xx = -2.50238 + (((tickAnim - 38) / 2) * (-2.34-(-2.50238)));
            yy = 1 + (((tickAnim - 38) / 2) * (0.83-(1)));
            zz = -0.10912 + (((tickAnim - 38) / 2) * (-0.09-(-0.10912)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tergiteB, tergiteB.rotateAngleX + (float) Math.toRadians(xx), tergiteB.rotateAngleY + (float) Math.toRadians(yy), tergiteB.rotateAngleZ + (float) Math.toRadians(zz));

        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 1.66 + (((tickAnim - 0) / 10) * (3.5-(1.66)));
            yy = 0.92 + (((tickAnim - 0) / 10) * (0-(0.92)));
            zz = 0.06 + (((tickAnim - 0) / 10) * (0-(0.06)));
        }
        else if (tickAnim >= 10 && tickAnim < 20) {
            xx = 3.5 + (((tickAnim - 10) / 10) * (2.50238-(3.5)));
            yy = 0 + (((tickAnim - 10) / 10) * (-1-(0)));
            zz = 0 + (((tickAnim - 10) / 10) * (-0.10912-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 30) {
            xx = 2.50238 + (((tickAnim - 20) / 10) * (1.5-(2.50238)));
            yy = -1 + (((tickAnim - 20) / 10) * (0-(-1)));
            zz = -0.10912 + (((tickAnim - 20) / 10) * (0-(-0.10912)));
        }
        else if (tickAnim >= 30 && tickAnim < 39) {
            xx = 1.5 + (((tickAnim - 30) / 9) * (1.50143-(1.5)));
            yy = 0 + (((tickAnim - 30) / 9) * (1-(0)));
            zz = 0 + (((tickAnim - 30) / 9) * (0.06548-(0)));
        }
        else if (tickAnim >= 39 && tickAnim < 40) {
            xx = 1.50143 + (((tickAnim - 39) / 1) * (1.5-(1.50143)));
            yy = 1 + (((tickAnim - 39) / 1) * (0.92-(1)));
            zz = 0.06548 + (((tickAnim - 39) / 1) * (0.06-(0.06548)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tergiteC, tergiteC.rotateAngleX + (float) Math.toRadians(xx), tergiteC.rotateAngleY + (float) Math.toRadians(yy), tergiteC.rotateAngleZ + (float) Math.toRadians(zz));

        if (tickAnim >= 0 && tickAnim < 1) {
            xx = 1.5 + (((tickAnim - 0) / 1) * (1.50143-(1.5)));
            yy = 0.91 + (((tickAnim - 0) / 1) * (1-(0.91)));
            zz = 0.06 + (((tickAnim - 0) / 1) * (0.06548-(0.06)));
        }
        else if (tickAnim >= 1 && tickAnim < 12) {
            xx = 1.50143 + (((tickAnim - 1) / 11) * (3.5-(1.50143)));
            yy = 1 + (((tickAnim - 1) / 11) * (0-(1)));
            zz = 0.06548 + (((tickAnim - 1) / 11) * (0-(0.06548)));
        }
        else if (tickAnim >= 12 && tickAnim < 22) {
            xx = 3.5 + (((tickAnim - 12) / 10) * (2.50238-(3.5)));
            yy = 0 + (((tickAnim - 12) / 10) * (-1-(0)));
            zz = 0 + (((tickAnim - 12) / 10) * (-0.10912-(0)));
        }
        else if (tickAnim >= 22 && tickAnim < 32) {
            xx = 2.50238 + (((tickAnim - 22) / 10) * (1.5-(2.50238)));
            yy = -1 + (((tickAnim - 22) / 10) * (0-(-1)));
            zz = -0.10912 + (((tickAnim - 22) / 10) * (0-(-0.10912)));
        }
        else if (tickAnim >= 32 && tickAnim < 40) {
            xx = 1.5 + (((tickAnim - 32) / 8) * (1.5-(1.5)));
            yy = 0 + (((tickAnim - 32) / 8) * (0.91-(0)));
            zz = 0 + (((tickAnim - 32) / 8) * (0.06-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tergiteD, tergiteD.rotateAngleX + (float) Math.toRadians(xx), tergiteD.rotateAngleY + (float) Math.toRadians(yy), tergiteD.rotateAngleZ + (float) Math.toRadians(zz));

        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 1.5 + (((tickAnim - 0) / 3) * (1.50143-(1.5)));
            yy = 0.73 + (((tickAnim - 0) / 3) * (1-(0.73)));
            zz = 0.05 + (((tickAnim - 0) / 3) * (0.06548-(0.05)));
        }
        else if (tickAnim >= 3 && tickAnim < 13) {
            xx = 1.50143 + (((tickAnim - 3) / 10) * (3.5-(1.50143)));
            yy = 1 + (((tickAnim - 3) / 10) * (0-(1)));
            zz = 0.06548 + (((tickAnim - 3) / 10) * (0-(0.06548)));
        }
        else if (tickAnim >= 13 && tickAnim < 23) {
            xx = 3.5 + (((tickAnim - 13) / 10) * (2.50238-(3.5)));
            yy = 0 + (((tickAnim - 13) / 10) * (-1-(0)));
            zz = 0 + (((tickAnim - 13) / 10) * (-0.10912-(0)));
        }
        else if (tickAnim >= 23 && tickAnim < 33) {
            xx = 2.50238 + (((tickAnim - 23) / 10) * (1.5-(2.50238)));
            yy = -1 + (((tickAnim - 23) / 10) * (0-(-1)));
            zz = -0.10912 + (((tickAnim - 23) / 10) * (0-(-0.10912)));
        }
        else if (tickAnim >= 33 && tickAnim < 40) {
            xx = 1.5 + (((tickAnim - 33) / 7) * (1.5-(1.5)));
            yy = 0 + (((tickAnim - 33) / 7) * (0.73-(0)));
            zz = 0 + (((tickAnim - 33) / 7) * (0.05-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tergiteD2, tergiteD2.rotateAngleX + (float) Math.toRadians(xx), tergiteD2.rotateAngleY + (float) Math.toRadians(yy), tergiteD2.rotateAngleZ + (float) Math.toRadians(zz));

        if (tickAnim >= 0 && tickAnim < 4) {
            xx = 1.5 + (((tickAnim - 0) / 4) * (1.50143-(1.5)));
            yy = 0.55 + (((tickAnim - 0) / 4) * (1-(0.55)));
            zz = 0.04 + (((tickAnim - 0) / 4) * (0.06548-(0.04)));
        }
        else if (tickAnim >= 4 && tickAnim < 15) {
            xx = 1.50143 + (((tickAnim - 4) / 11) * (3.5-(1.50143)));
            yy = 1 + (((tickAnim - 4) / 11) * (0-(1)));
            zz = 0.06548 + (((tickAnim - 4) / 11) * (0-(0.06548)));
        }
        else if (tickAnim >= 15 && tickAnim < 25) {
            xx = 3.5 + (((tickAnim - 15) / 10) * (2.50238-(3.5)));
            yy = 0 + (((tickAnim - 15) / 10) * (-1-(0)));
            zz = 0 + (((tickAnim - 15) / 10) * (-0.10912-(0)));
        }
        else if (tickAnim >= 25 && tickAnim < 35) {
            xx = 2.50238 + (((tickAnim - 25) / 10) * (1.5-(2.50238)));
            yy = -1 + (((tickAnim - 25) / 10) * (0-(-1)));
            zz = -0.10912 + (((tickAnim - 25) / 10) * (0-(-0.10912)));
        }
        else if (tickAnim >= 35 && tickAnim < 40) {
            xx = 1.5 + (((tickAnim - 35) / 5) * (1.5-(1.5)));
            yy = 0 + (((tickAnim - 35) / 5) * (0.55-(0)));
            zz = 0 + (((tickAnim - 35) / 5) * (0.04-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tergiteE, tergiteE.rotateAngleX + (float) Math.toRadians(xx), tergiteE.rotateAngleY + (float) Math.toRadians(yy), tergiteE.rotateAngleZ + (float) Math.toRadians(zz));

        if (tickAnim >= 0 && tickAnim < 6) {
            xx = 1.5 + (((tickAnim - 0) / 6) * (1.50143-(1.5)));
            yy = 0.36 + (((tickAnim - 0) / 6) * (1-(0.36)));
            zz = 0.02 + (((tickAnim - 0) / 6) * (0.06548-(0.02)));
        }
        else if (tickAnim >= 6 && tickAnim < 17) {
            xx = 1.50143 + (((tickAnim - 6) / 11) * (3.5-(1.50143)));
            yy = 1 + (((tickAnim - 6) / 11) * (0-(1)));
            zz = 0.06548 + (((tickAnim - 6) / 11) * (0-(0.06548)));
        }
        else if (tickAnim >= 17 && tickAnim < 27) {
            xx = 3.5 + (((tickAnim - 17) / 10) * (2.50238-(3.5)));
            yy = 0 + (((tickAnim - 17) / 10) * (-1-(0)));
            zz = 0 + (((tickAnim - 17) / 10) * (-0.10912-(0)));
        }
        else if (tickAnim >= 27 && tickAnim < 37) {
            xx = 2.50238 + (((tickAnim - 27) / 10) * (1.5-(2.50238)));
            yy = -1 + (((tickAnim - 27) / 10) * (0-(-1)));
            zz = -0.10912 + (((tickAnim - 27) / 10) * (0-(-0.10912)));
        }
        else if (tickAnim >= 37 && tickAnim < 40) {
            xx = 1.5 + (((tickAnim - 37) / 3) * (1.5-(1.5)));
            yy = 0 + (((tickAnim - 37) / 3) * (0.36-(0)));
            zz = 0 + (((tickAnim - 37) / 3) * (0.02-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tergiteE2, tergiteE2.rotateAngleX + (float) Math.toRadians(xx), tergiteE2.rotateAngleY + (float) Math.toRadians(yy), tergiteE2.rotateAngleZ + (float) Math.toRadians(zz));

        if (tickAnim >= 0 && tickAnim < 8) {
            xx = 1.5 + (((tickAnim - 0) / 8) * (1.50143-(1.5)));
            yy = 0.18 + (((tickAnim - 0) / 8) * (1-(0.18)));
            zz = 0.01 + (((tickAnim - 0) / 8) * (0.06548-(0.01)));
        }
        else if (tickAnim >= 8 && tickAnim < 18) {
            xx = 1.50143 + (((tickAnim - 8) / 10) * (3.5-(1.50143)));
            yy = 1 + (((tickAnim - 8) / 10) * (0-(1)));
            zz = 0.06548 + (((tickAnim - 8) / 10) * (0-(0.06548)));
        }
        else if (tickAnim >= 18 && tickAnim < 28) {
            xx = 3.5 + (((tickAnim - 18) / 10) * (2.50238-(3.5)));
            yy = 0 + (((tickAnim - 18) / 10) * (-1-(0)));
            zz = 0 + (((tickAnim - 18) / 10) * (-0.10912-(0)));
        }
        else if (tickAnim >= 28 && tickAnim < 38) {
            xx = 2.50238 + (((tickAnim - 28) / 10) * (1.5-(2.50238)));
            yy = -1 + (((tickAnim - 28) / 10) * (0-(-1)));
            zz = -0.10912 + (((tickAnim - 28) / 10) * (0-(-0.10912)));
        }
        else if (tickAnim >= 38 && tickAnim < 40) {
            xx = 1.5 + (((tickAnim - 38) / 2) * (1.5-(1.5)));
            yy = 0 + (((tickAnim - 38) / 2) * (0.18-(0)));
            zz = 0 + (((tickAnim - 38) / 2) * (0.01-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tergiteF, tergiteF.rotateAngleX + (float) Math.toRadians(xx), tergiteF.rotateAngleY + (float) Math.toRadians(yy), tergiteF.rotateAngleZ + (float) Math.toRadians(zz));

        if (tickAnim >= 0 && tickAnim < 8) {
            xx = 1.5 + (((tickAnim - 0) / 8) * (1.50143-(1.5)));
            yy = 0 + (((tickAnim - 0) / 8) * (1-(0)));
            zz = 0 + (((tickAnim - 0) / 8) * (0.06548-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 19) {
            xx = 1.50143 + (((tickAnim - 8) / 11) * (3.5-(1.50143)));
            yy = 1 + (((tickAnim - 8) / 11) * (0-(1)));
            zz = 0.06548 + (((tickAnim - 8) / 11) * (0-(0.06548)));
        }
        else if (tickAnim >= 19 && tickAnim < 29) {
            xx = 3.5 + (((tickAnim - 19) / 10) * (2.50238-(3.5)));
            yy = 0 + (((tickAnim - 19) / 10) * (-1-(0)));
            zz = 0 + (((tickAnim - 19) / 10) * (-0.10912-(0)));
        }
        else if (tickAnim >= 29 && tickAnim < 39) {
            xx = 2.50238 + (((tickAnim - 29) / 10) * (1.5-(2.50238)));
            yy = -1 + (((tickAnim - 29) / 10) * (0-(-1)));
            zz = -0.10912 + (((tickAnim - 29) / 10) * (0-(-0.10912)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(telson, telson.rotateAngleX + (float) Math.toRadians(xx), telson.rotateAngleY + (float) Math.toRadians(yy), telson.rotateAngleZ + (float) Math.toRadians(zz));

        if (tickAnim >= 0 && tickAnim < 40) {
            xx = 0 + (((tickAnim - 0) / 40) * (0-(0)));
            yy = -20 + (((tickAnim - 0) / 40) * (-20-(-20)));
            zz = 0 + (((tickAnim - 0) / 40) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(clawR, clawR.rotateAngleX + (float) Math.toRadians(xx), clawR.rotateAngleY + (float) Math.toRadians(yy), clawR.rotateAngleZ + (float) Math.toRadians(zz));
        this.setRotateAngle(legL, legL.rotateAngleX + (float) Math.toRadians(0), legL.rotateAngleY + (float) Math.toRadians(22.5), legL.rotateAngleZ + (float) Math.toRadians(0));

        if (tickAnim >= 0 && tickAnim < 2) {
            xx = -4.70507 + (((tickAnim - 0) / 2) * (-5.12333-(-4.70507)));
            yy = 1.54506 + (((tickAnim - 0) / 2) * (1.13306-(1.54506)));
            zz = -0.7568 + (((tickAnim - 0) / 2) * (-0.72687-(-0.7568)));
        }
        else if (tickAnim >= 2 && tickAnim < 22) {
            xx = -5.12333 + (((tickAnim - 2) / 20) * (-0.14313-(-5.12333)));
            yy = 1.13306 + (((tickAnim - 2) / 20) * (6.11702-(1.13306)));
            zz = -0.72687 + (((tickAnim - 2) / 20) * (-1.08772-(-0.72687)));
        }
        else if (tickAnim >= 22 && tickAnim < 40) {
            xx = -0.14313 + (((tickAnim - 22) / 18) * (-4.70507-(-0.14313)));
            yy = 6.11702 + (((tickAnim - 22) / 18) * (1.54506-(6.11702)));
            zz = -1.08772 + (((tickAnim - 22) / 18) * (-0.7568-(-1.08772)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(cheliceraL, cheliceraL.rotateAngleX + (float) Math.toRadians(xx), cheliceraL.rotateAngleY + (float) Math.toRadians(yy), cheliceraL.rotateAngleZ + (float) Math.toRadians(zz));

        if (tickAnim >= 0 && tickAnim < 40) {
            xx = 172.32542 + (((tickAnim - 0) / 40) * (172.32542-(172.32542)));
            yy = -6.92618 + (((tickAnim - 0) / 40) * (-6.92618-(-6.92618)));
            zz = 2.88419 + (((tickAnim - 0) / 40) * (2.88419-(2.88419)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(clawbaseL, clawbaseL.rotateAngleX + (float) Math.toRadians(xx), clawbaseL.rotateAngleY + (float) Math.toRadians(yy), clawbaseL.rotateAngleZ + (float) Math.toRadians(zz));

        if (tickAnim >= 0 && tickAnim < 40) {
            xx = 0 + (((tickAnim - 0) / 40) * (0-(0)));
            yy = 20 + (((tickAnim - 0) / 40) * (20-(20)));
            zz = 0 + (((tickAnim - 0) / 40) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(clawL, clawL.rotateAngleX + (float) Math.toRadians(xx), clawL.rotateAngleY + (float) Math.toRadians(yy), clawL.rotateAngleZ + (float) Math.toRadians(zz));

        if (tickAnim >= 0 && tickAnim < 5) {
            xx = 5.01 + (((tickAnim - 0) / 5) * (0.44896-(5.01)));
            yy = 24.36 + (((tickAnim - 0) / 5) * (13.93478-(24.36)));
            zz = 21.87 + (((tickAnim - 0) / 5) * (20.95158-(21.87)));
        }
        else if (tickAnim >= 5 && tickAnim < 10) {
            xx = 0.44896 + (((tickAnim - 5) / 5) * (0.80105-(0.44896)));
            yy = 13.93478 + (((tickAnim - 5) / 5) * (26.67086-(13.93478)));
            zz = 20.95158 + (((tickAnim - 5) / 5) * (10.87935-(20.95158)));
        }
        else if (tickAnim >= 10 && tickAnim < 15) {
            xx = 0.80105 + (((tickAnim - 10) / 5) * (9.56646-(0.80105)));
            yy = 26.67086 + (((tickAnim - 10) / 5) * (34.78253-(26.67086)));
            zz = 10.87935 + (((tickAnim - 10) / 5) * (22.79541-(10.87935)));
        }
        else if (tickAnim >= 15 && tickAnim < 25) {
            xx = 9.56646 + (((tickAnim - 15) / 10) * (0.44896-(9.56646)));
            yy = 34.78253 + (((tickAnim - 15) / 10) * (13.93478-(34.78253)));
            zz = 22.79541 + (((tickAnim - 15) / 10) * (20.95158-(22.79541)));
        }
        else if (tickAnim >= 25 && tickAnim < 30) {
            xx = 0.44896 + (((tickAnim - 25) / 5) * (0.80105-(0.44896)));
            yy = 13.93478 + (((tickAnim - 25) / 5) * (26.67086-(13.93478)));
            zz = 20.95158 + (((tickAnim - 25) / 5) * (10.87935-(20.95158)));
        }
        else if (tickAnim >= 30 && tickAnim < 35) {
            xx = 0.80105 + (((tickAnim - 30) / 5) * (9.56646-(0.80105)));
            yy = 26.67086 + (((tickAnim - 30) / 5) * (34.78253-(26.67086)));
            zz = 10.87935 + (((tickAnim - 30) / 5) * (22.79541-(10.87935)));
        }
        else if (tickAnim >= 35 && tickAnim < 40) {
            xx = 9.56646 + (((tickAnim - 35) / 5) * (5.01-(9.56646)));
            yy = 34.78253 + (((tickAnim - 35) / 5) * (24.36-(34.78253)));
            zz = 22.79541 + (((tickAnim - 35) / 5) * (21.87-(22.79541)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(legL2, legL2.rotateAngleX + (float) Math.toRadians(xx), legL2.rotateAngleY + (float) Math.toRadians(yy), legL2.rotateAngleZ + (float) Math.toRadians(zz));

        if (tickAnim >= 0 && tickAnim < 3) {
            xx = -6.46 + (((tickAnim - 0) / 3) * (-3.24764-(-6.46)));
            yy = 11.97 + (((tickAnim - 0) / 3) * (18.67616-(11.97)));
            zz = 13.03 + (((tickAnim - 0) / 3) * (19.48142-(13.03)));
        }
        else if (tickAnim >= 3 && tickAnim < 13) {
            xx = -3.24764 + (((tickAnim - 3) / 10) * (-10.91897-(-3.24764)));
            yy = 18.67616 + (((tickAnim - 3) / 10) * (-2.42778-(18.67616)));
            zz = 19.48142 + (((tickAnim - 3) / 10) * (20.36347-(19.48142)));
        }
        else if (tickAnim >= 13 && tickAnim < 18) {
            xx = -10.91897 + (((tickAnim - 13) / 5) * (-8.06374-(-10.91897)));
            yy = -2.42778 + (((tickAnim - 13) / 5) * (8.6169-(-2.42778)));
            zz = 20.36347 + (((tickAnim - 13) / 5) * (9.79816-(20.36347)));
        }
        else if (tickAnim >= 18 && tickAnim < 23) {
            xx = -8.06374 + (((tickAnim - 18) / 5) * (-3.24764-(-8.06374)));
            yy = 8.6169 + (((tickAnim - 18) / 5) * (18.67616-(8.6169)));
            zz = 9.79816 + (((tickAnim - 18) / 5) * (19.48142-(9.79816)));
        }
        else if (tickAnim >= 23 && tickAnim < 33) {
            xx = -3.24764 + (((tickAnim - 23) / 10) * (-10.91897-(-3.24764)));
            yy = 18.67616 + (((tickAnim - 23) / 10) * (-2.42778-(18.67616)));
            zz = 19.48142 + (((tickAnim - 23) / 10) * (20.36347-(19.48142)));
        }
        else if (tickAnim >= 33 && tickAnim < 38) {
            xx = -10.91897 + (((tickAnim - 33) / 5) * (-8.06374-(-10.91897)));
            yy = -2.42778 + (((tickAnim - 33) / 5) * (8.6169-(-2.42778)));
            zz = 20.36347 + (((tickAnim - 33) / 5) * (9.79816-(20.36347)));
        }
        else if (tickAnim >= 38 && tickAnim < 40) {
            xx = -8.06374 + (((tickAnim - 38) / 2) * (-6.46-(-8.06374)));
            yy = 8.6169 + (((tickAnim - 38) / 2) * (11.97-(8.6169)));
            zz = 9.79816 + (((tickAnim - 38) / 2) * (13.03-(9.79816)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(legL3, legL3.rotateAngleX + (float) Math.toRadians(xx), legL3.rotateAngleY + (float) Math.toRadians(yy), legL3.rotateAngleZ + (float) Math.toRadians(zz));

        if (tickAnim >= 0 && tickAnim < 7) {
            xx = -14.29 + (((tickAnim - 0) / 7) * (-19.58754-(-14.29)));
            yy = -5.53 + (((tickAnim - 0) / 7) * (-19.54204-(-5.53)));
            zz = 20.06 + (((tickAnim - 0) / 7) * (22.22793-(20.06)));
        }
        else if (tickAnim >= 7 && tickAnim < 12) {
            xx = -19.58754 + (((tickAnim - 7) / 5) * (-13.50055-(-19.58754)));
            yy = -19.54204 + (((tickAnim - 7) / 5) * (-9.74753-(-19.54204)));
            zz = 22.22793 + (((tickAnim - 7) / 5) * (10.52744-(22.22793)));
        }
        else if (tickAnim >= 12 && tickAnim < 17) {
            xx = -13.50055 + (((tickAnim - 12) / 5) * (-11.64715-(-13.50055)));
            yy = -9.74753 + (((tickAnim - 12) / 5) * (1.47238-(-9.74753)));
            zz = 10.52744 + (((tickAnim - 12) / 5) * (18.97134-(10.52744)));
        }
        else if (tickAnim >= 17 && tickAnim < 27) {
            xx = -11.64715 + (((tickAnim - 17) / 10) * (-19.58754-(-11.64715)));
            yy = 1.47238 + (((tickAnim - 17) / 10) * (-19.54204-(1.47238)));
            zz = 18.97134 + (((tickAnim - 17) / 10) * (22.22793-(18.97134)));
        }
        else if (tickAnim >= 27 && tickAnim < 32) {
            xx = -19.58754 + (((tickAnim - 27) / 5) * (-13.50055-(-19.58754)));
            yy = -19.54204 + (((tickAnim - 27) / 5) * (-9.74753-(-19.54204)));
            zz = 22.22793 + (((tickAnim - 27) / 5) * (10.52744-(22.22793)));
        }
        else if (tickAnim >= 32 && tickAnim < 37) {
            xx = -13.50055 + (((tickAnim - 32) / 5) * (-11.64715-(-13.50055)));
            yy = -9.74753 + (((tickAnim - 32) / 5) * (1.47238-(-9.74753)));
            zz = 10.52744 + (((tickAnim - 32) / 5) * (18.97134-(10.52744)));
        }
        else if (tickAnim >= 37 && tickAnim < 40) {
            xx = -11.64715 + (((tickAnim - 37) / 3) * (-14.29-(-11.64715)));
            yy = 1.47238 + (((tickAnim - 37) / 3) * (-5.53-(1.47238)));
            zz = 18.97134 + (((tickAnim - 37) / 3) * (20.06-(18.97134)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(legL4, legL4.rotateAngleX + (float) Math.toRadians(xx), legL4.rotateAngleY + (float) Math.toRadians(yy), legL4.rotateAngleZ + (float) Math.toRadians(zz));

        if (tickAnim >= 0 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 0) / 5) * (-0.38466-(0)));
            yy = 22.5 + (((tickAnim - 0) / 5) * (23.7416-(22.5)));
            zz = 0 + (((tickAnim - 0) / 5) * (-2.5294-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 10) {
            xx = -0.38466 + (((tickAnim - 5) / 5) * (0-(-0.38466)));
            yy = 23.7416 + (((tickAnim - 5) / 5) * (25-(23.7416)));
            zz = -2.5294 + (((tickAnim - 5) / 5) * (0-(-2.5294)));
        }
        else if (tickAnim >= 10 && tickAnim < 14) {
            xx = 0 + (((tickAnim - 10) / 4) * (0.39397-(0)));
            yy = 25 + (((tickAnim - 10) / 4) * (23.9497-(25)));
            zz = 0 + (((tickAnim - 10) / 4) * (2.5308-(0)));
        }
        else if (tickAnim >= 14 && tickAnim < 20) {
            xx = 0.39397 + (((tickAnim - 14) / 6) * (0-(0.39397)));
            yy = 23.9497 + (((tickAnim - 14) / 6) * (22.5-(23.9497)));
            zz = 2.5308 + (((tickAnim - 14) / 6) * (0-(2.5308)));
        }
        else if (tickAnim >= 20 && tickAnim < 24) {
            xx = 0 + (((tickAnim - 20) / 4) * (-0.37536-(0)));
            yy = 22.5 + (((tickAnim - 20) / 4) * (23.5335-(22.5)));
            zz = 0 + (((tickAnim - 20) / 4) * (-2.528-(0)));
        }
        else if (tickAnim >= 24 && tickAnim < 30) {
            xx = -0.37536 + (((tickAnim - 24) / 6) * (0-(-0.37536)));
            yy = 23.5335 + (((tickAnim - 24) / 6) * (25-(23.5335)));
            zz = -2.528 + (((tickAnim - 24) / 6) * (0-(-2.528)));
        }
        else if (tickAnim >= 30 && tickAnim < 34) {
            xx = 0 + (((tickAnim - 30) / 4) * (0.39397-(0)));
            yy = 25 + (((tickAnim - 30) / 4) * (23.9497-(25)));
            zz = 0 + (((tickAnim - 30) / 4) * (2.5308-(0)));
        }
        else if (tickAnim >= 34 && tickAnim < 40) {
            xx = 0.39397 + (((tickAnim - 34) / 6) * (0-(0.39397)));
            yy = 23.9497 + (((tickAnim - 34) / 6) * (22.5-(23.9497)));
            zz = 2.5308 + (((tickAnim - 34) / 6) * (0-(2.5308)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(legL5, legL5.rotateAngleX + (float) Math.toRadians(xx), legL5.rotateAngleY + (float) Math.toRadians(yy), legL5.rotateAngleZ + (float) Math.toRadians(zz));
        this.setRotateAngle(legRs5, legRs5.rotateAngleX + (float) Math.toRadians(0), legRs5.rotateAngleY + (float) Math.toRadians(-22.5), legRs5.rotateAngleZ + (float) Math.toRadians(0));
        this.setRotateAngle(legLs5, legLs5.rotateAngleX + (float) Math.toRadians(0), legLs5.rotateAngleY + (float) Math.toRadians(22.5), legLs5.rotateAngleZ + (float) Math.toRadians(0));
        this.setRotateAngle(legR1, legR1.rotateAngleX + (float) Math.toRadians(-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180/0.25-100))*4), legR1.rotateAngleY + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*45/0.25+15))*6), legR1.rotateAngleZ + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*90/0.25+50))*13));
        this.setRotateAngle(legL, legL.rotateAngleX + (float) Math.toRadians(-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180/0.25-130))*4), legL.rotateAngleY + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*45/0.25-15))*6), legL.rotateAngleZ + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*90/0.25+20))*13));
    }

    public void animSwim(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime, boolean isStatic) {
        EntityPrehistoricFloraErettopterus entity = (EntityPrehistoricFloraErettopterus) entitylivingbaseIn;
        int animCycle = 20;
        double tickAnim = (entity.ticksExisted + entity.getTickOffset()) - (int) (Math.floor((double) (entity.ticksExisted + entity.getTickOffset()) / (double) animCycle) * (double) animCycle) + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;
        this.setRotateAngle(cheliceraR, cheliceraR.rotateAngleX + (float) Math.toRadians(5.0127+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*90/0.25-150))*2), cheliceraR.rotateAngleY + (float) Math.toRadians(-3.4845-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*90/0.25-120))), cheliceraR.rotateAngleZ + (float) Math.toRadians(-0.33167));
        this.setRotateAngle(clawbaseR, clawbaseR.rotateAngleX + (float) Math.toRadians(172.43603), clawbaseR.rotateAngleY + (float) Math.toRadians(7.43547), clawbaseR.rotateAngleZ + (float) Math.toRadians(-0.98448));
        this.setRotateAngle(body, body.rotateAngleX + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*90/0.25+60))*2.5), body.rotateAngleY + (float) Math.toRadians(0), body.rotateAngleZ + (float) Math.toRadians(0));
        this.body.rotationPointX = this.body.rotationPointX + (float)(0);
        this.body.rotationPointY = this.body.rotationPointY - (float)(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*90/0.25+130))/2);
        this.body.rotationPointZ = this.body.rotationPointZ + (float)(0);
        this.setRotateAngle(legR2, legR2.rotateAngleX + (float) Math.toRadians(-20.941-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*90/0.25+90))*2), legR2.rotateAngleY + (float) Math.toRadians(40.7895+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*90/0.25+60))*2), legR2.rotateAngleZ + (float) Math.toRadians(-30.3612-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*90/0.25+30))*2));
        this.setRotateAngle(legR3, legR3.rotateAngleX + (float) Math.toRadians(-20.941-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*90/0.25+120))*2), legR3.rotateAngleY + (float) Math.toRadians(40.7895+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*90/0.25+90))*2), legR3.rotateAngleZ + (float) Math.toRadians(-30.3612-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*90/0.25+60))*2));
        this.setRotateAngle(legR5, legR5.rotateAngleX + (float) Math.toRadians(-3+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*90/0.25+160))*10), legR5.rotateAngleY + (float) Math.toRadians(-30-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*90/0.25-90))*40), legR5.rotateAngleZ + (float) Math.toRadians(5-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*90/0.25+140))*25));
        this.setRotateAngle(legR4, legR4.rotateAngleX + (float) Math.toRadians(-20.941-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*90/0.25+150))*2), legR4.rotateAngleY + (float) Math.toRadians(40.7895+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*90/0.25+120))*2), legR4.rotateAngleZ + (float) Math.toRadians(-30.3612-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*90/0.25+90))*2));
        this.setRotateAngle(opisthosoma, opisthosoma.rotateAngleX + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*90/0.25))*1.5), opisthosoma.rotateAngleY + (float) Math.toRadians(0), opisthosoma.rotateAngleZ + (float) Math.toRadians(0));
        this.setRotateAngle(tergiteA, tergiteA.rotateAngleX + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*90/0.25-20))*2), tergiteA.rotateAngleY + (float) Math.toRadians(0), tergiteA.rotateAngleZ + (float) Math.toRadians(0));
        this.setRotateAngle(tergiteA2, tergiteA2.rotateAngleX + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*90/0.25-40))*3), tergiteA2.rotateAngleY + (float) Math.toRadians(0), tergiteA2.rotateAngleZ + (float) Math.toRadians(0));
        this.setRotateAngle(tergiteA3, tergiteA3.rotateAngleX + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*90/0.25-60))*4), tergiteA3.rotateAngleY + (float) Math.toRadians(0), tergiteA3.rotateAngleZ + (float) Math.toRadians(0));
        this.setRotateAngle(tergiteA4, tergiteA4.rotateAngleX + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*90/0.25-80))*5), tergiteA4.rotateAngleY + (float) Math.toRadians(0), tergiteA4.rotateAngleZ + (float) Math.toRadians(0));
        this.setRotateAngle(tergiteB, tergiteB.rotateAngleX + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*90/0.25-100))*6), tergiteB.rotateAngleY + (float) Math.toRadians(0), tergiteB.rotateAngleZ + (float) Math.toRadians(0));
        this.setRotateAngle(tergiteC, tergiteC.rotateAngleX + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*90/0.25-120))*7), tergiteC.rotateAngleY + (float) Math.toRadians(0), tergiteC.rotateAngleZ + (float) Math.toRadians(0));
        this.setRotateAngle(tergiteD, tergiteD.rotateAngleX + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*90/0.25-140))*8), tergiteD.rotateAngleY + (float) Math.toRadians(0), tergiteD.rotateAngleZ + (float) Math.toRadians(0));
        this.setRotateAngle(tergiteD2, tergiteD2.rotateAngleX + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*90/0.25-160))*9), tergiteD2.rotateAngleY + (float) Math.toRadians(0), tergiteD2.rotateAngleZ + (float) Math.toRadians(0));
        this.setRotateAngle(tergiteE, tergiteE.rotateAngleX + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*90/0.25-180))*10), tergiteE.rotateAngleY + (float) Math.toRadians(0), tergiteE.rotateAngleZ + (float) Math.toRadians(0));
        this.setRotateAngle(tergiteE2, tergiteE2.rotateAngleX + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*90/0.25-200))*11), tergiteE2.rotateAngleY + (float) Math.toRadians(0), tergiteE2.rotateAngleZ + (float) Math.toRadians(0));
        this.setRotateAngle(tergiteF, tergiteF.rotateAngleX + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*90/0.25-220))*12), tergiteF.rotateAngleY + (float) Math.toRadians(0), tergiteF.rotateAngleZ + (float) Math.toRadians(0));
        this.setRotateAngle(telson, telson.rotateAngleX + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*90/0.25-240))*13), telson.rotateAngleY + (float) Math.toRadians(0), telson.rotateAngleZ + (float) Math.toRadians(0));
        this.setRotateAngle(clawR, clawR.rotateAngleX + (float) Math.toRadians(0), clawR.rotateAngleY + (float) Math.toRadians(-20), clawR.rotateAngleZ + (float) Math.toRadians(0));
        this.setRotateAngle(cheliceraL, cheliceraL.rotateAngleX + (float) Math.toRadians(5.0142+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*90/0.25-120))*2), cheliceraL.rotateAngleY + (float) Math.toRadians(3.4834+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*90/0.25-90))), cheliceraL.rotateAngleZ + (float) Math.toRadians(0.35083));
        this.setRotateAngle(clawbaseL, clawbaseL.rotateAngleX + (float) Math.toRadians(172.43603), clawbaseL.rotateAngleY + (float) Math.toRadians(-7.43547), clawbaseL.rotateAngleZ + (float) Math.toRadians(0.98448));
        this.setRotateAngle(clawL, clawL.rotateAngleX + (float) Math.toRadians(0), clawL.rotateAngleY + (float) Math.toRadians(20), clawL.rotateAngleZ + (float) Math.toRadians(0));
        this.setRotateAngle(legR1, legR1.rotateAngleX + (float) Math.toRadians(-20.941-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*90/0.25+60))*2), legR1.rotateAngleY + (float) Math.toRadians(40.7895+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*90/0.25+30))*2), legR1.rotateAngleZ + (float) Math.toRadians(-30.3612-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*90/0.25))*2));
        this.setRotateAngle(legRs5, legRs5.rotateAngleX + (float) Math.toRadians(-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*90/0.25+5))*60), legRs5.rotateAngleY + (float) Math.toRadians(-15+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*90/0.25+25))*40), legRs5.rotateAngleZ + (float) Math.toRadians(-10+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*90/0.25+230))*20));
        this.setRotateAngle(legL2, legL2.rotateAngleX + (float) Math.toRadians(-20.941-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*90/0.25+90))*2), legL2.rotateAngleY + (float) Math.toRadians(-40.7895-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*90/0.25+60))*2), legL2.rotateAngleZ + (float) Math.toRadians(30.3612+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*90/0.25+30))*2));
        this.setRotateAngle(legL3, legL3.rotateAngleX + (float) Math.toRadians(-20.941-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*90/0.25+120))*2), legL3.rotateAngleY + (float) Math.toRadians(-40.7895-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*90/0.25+90))*2), legL3.rotateAngleZ + (float) Math.toRadians(30.3612+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*90/0.25+60))*2));
        this.setRotateAngle(legL4, legL4.rotateAngleX + (float) Math.toRadians(-20.941-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*90/0.25+150))*2), legL4.rotateAngleY + (float) Math.toRadians(-40.7895-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*90/0.25+120))*2), legL4.rotateAngleZ + (float) Math.toRadians(30.3612+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*90/0.25+90))*2));
        this.setRotateAngle(legL5, legL5.rotateAngleX + (float) Math.toRadians(-3+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*90/0.25+160))*10), legL5.rotateAngleY + (float) Math.toRadians(30+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*90/0.25-90))*40), legL5.rotateAngleZ + (float) Math.toRadians(-5+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*90/0.25+140))*25));
        this.setRotateAngle(legLs5, legLs5.rotateAngleX + (float) Math.toRadians(-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*90/0.25+5))*60), legLs5.rotateAngleY + (float) Math.toRadians(15-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*90/0.25+25))*40), legLs5.rotateAngleZ + (float) Math.toRadians(10-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*90/0.25+230))*20));
    }

    public void animSwimFast(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime) {
        EntityPrehistoricFloraErettopterus entity = (EntityPrehistoricFloraErettopterus) entitylivingbaseIn;
        int animCycle = 10;
        double tickAnim = (entity.ticksExisted + entity.getTickOffset()) - (int) (Math.floor((double) (entity.ticksExisted + entity.getTickOffset()) / (double) animCycle) * (double) animCycle) + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;
        this.setRotateAngle(cheliceraR, cheliceraR.rotateAngleX + (float) Math.toRadians(-1.6227+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180/0.25-150))*2), cheliceraR.rotateAngleY + (float) Math.toRadians(10.8878-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180/0.25-120))), cheliceraR.rotateAngleZ + (float) Math.toRadians(-22.1741));
        this.setRotateAngle(clawbaseR, clawbaseR.rotateAngleX + (float) Math.toRadians(22.5), clawbaseR.rotateAngleY + (float) Math.toRadians(0), clawbaseR.rotateAngleZ + (float) Math.toRadians(0));
        this.setRotateAngle(body, body.rotateAngleX + (float) Math.toRadians(-10+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180/0.25-60))), body.rotateAngleY + (float) Math.toRadians(0), body.rotateAngleZ + (float) Math.toRadians(0));
        this.body.rotationPointX = this.body.rotationPointX + (float)(0);
        this.body.rotationPointY = this.body.rotationPointY - (float)(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180/0.25+40))/3);
        this.body.rotationPointZ = this.body.rotationPointZ + (float)(0);
        this.setRotateAngle(legR2, legR2.rotateAngleX + (float) Math.toRadians(-20.941-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180/0.25+90))*2), legR2.rotateAngleY + (float) Math.toRadians(40.7895+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180/0.25+60))*2), legR2.rotateAngleZ + (float) Math.toRadians(-30.3612-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180/0.25+30))*2));
        this.setRotateAngle(legR3, legR3.rotateAngleX + (float) Math.toRadians(-20.941-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180/0.25+120))*2), legR3.rotateAngleY + (float) Math.toRadians(40.7895+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180/0.25+90))*2), legR3.rotateAngleZ + (float) Math.toRadians(-30.3612-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180/0.25+60))*2));
        this.setRotateAngle(legR5, legR5.rotateAngleX + (float) Math.toRadians(-3+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180/0.25+160))*10), legR5.rotateAngleY + (float) Math.toRadians(-30-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180/0.25-90))*40), legR5.rotateAngleZ + (float) Math.toRadians(5-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180/0.25+140))*25));
        this.setRotateAngle(legR4, legR4.rotateAngleX + (float) Math.toRadians(-20.941-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180/0.25+150))*2), legR4.rotateAngleY + (float) Math.toRadians(40.7895+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180/0.25+120))*2), legR4.rotateAngleZ + (float) Math.toRadians(-30.3612-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180/0.25+90))*2));
        this.setRotateAngle(opisthosoma, opisthosoma.rotateAngleX + (float) Math.toRadians(2+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180/0.25))*1.5), opisthosoma.rotateAngleY + (float) Math.toRadians(0), opisthosoma.rotateAngleZ + (float) Math.toRadians(0));
        this.setRotateAngle(tergiteA, tergiteA.rotateAngleX + (float) Math.toRadians(2+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180/0.25-20))*2), tergiteA.rotateAngleY + (float) Math.toRadians(0), tergiteA.rotateAngleZ + (float) Math.toRadians(0));
        this.setRotateAngle(tergiteA2, tergiteA2.rotateAngleX + (float) Math.toRadians(2+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180/0.25-40))*3), tergiteA2.rotateAngleY + (float) Math.toRadians(0), tergiteA2.rotateAngleZ + (float) Math.toRadians(0));
        this.setRotateAngle(tergiteA3, tergiteA3.rotateAngleX + (float) Math.toRadians(2+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180/0.25-60))*4), tergiteA3.rotateAngleY + (float) Math.toRadians(0), tergiteA3.rotateAngleZ + (float) Math.toRadians(0));
        this.setRotateAngle(tergiteA4, tergiteA4.rotateAngleX + (float) Math.toRadians(2+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180/0.25-80))*5), tergiteA4.rotateAngleY + (float) Math.toRadians(0), tergiteA4.rotateAngleZ + (float) Math.toRadians(0));
        this.setRotateAngle(tergiteB, tergiteB.rotateAngleX + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180/0.25-120))*7), tergiteB.rotateAngleY + (float) Math.toRadians(0), tergiteB.rotateAngleZ + (float) Math.toRadians(0));
        this.setRotateAngle(tergiteC, tergiteC.rotateAngleX + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180/0.25-180))*8), tergiteC.rotateAngleY + (float) Math.toRadians(0), tergiteC.rotateAngleZ + (float) Math.toRadians(0));
        this.setRotateAngle(tergiteD, tergiteD.rotateAngleX + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180/0.25-140))*8), tergiteD.rotateAngleY + (float) Math.toRadians(0), tergiteD.rotateAngleZ + (float) Math.toRadians(0));
        this.setRotateAngle(tergiteD2, tergiteD2.rotateAngleX + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180/0.25-160))*9), tergiteD2.rotateAngleY + (float) Math.toRadians(0), tergiteD2.rotateAngleZ + (float) Math.toRadians(0));
        this.setRotateAngle(tergiteE, tergiteE.rotateAngleX + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180/0.25-180))*10), tergiteE.rotateAngleY + (float) Math.toRadians(0), tergiteE.rotateAngleZ + (float) Math.toRadians(0));
        this.setRotateAngle(tergiteE2, tergiteE2.rotateAngleX + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180/0.25-200))*11), tergiteE2.rotateAngleY + (float) Math.toRadians(0), tergiteE2.rotateAngleZ + (float) Math.toRadians(0));
        this.setRotateAngle(tergiteF, tergiteF.rotateAngleX + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180/0.25-220))*12), tergiteF.rotateAngleY + (float) Math.toRadians(0), tergiteF.rotateAngleZ + (float) Math.toRadians(0));
        this.setRotateAngle(telson, telson.rotateAngleX + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180/0.25-240))*13), telson.rotateAngleY + (float) Math.toRadians(0), telson.rotateAngleZ + (float) Math.toRadians(0));
        this.setRotateAngle(clawR, clawR.rotateAngleX + (float) Math.toRadians(0), clawR.rotateAngleY + (float) Math.toRadians(32.5), clawR.rotateAngleZ + (float) Math.toRadians(0));
        this.setRotateAngle(cheliceraL, cheliceraL.rotateAngleX + (float) Math.toRadians(20.4096+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180/0.25-120))*2), cheliceraL.rotateAngleY + (float) Math.toRadians(-26.6645+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180/0.25-90))), cheliceraL.rotateAngleZ + (float) Math.toRadians(18.89969));
        this.setRotateAngle(clawbaseL, clawbaseL.rotateAngleX + (float) Math.toRadians(132.14233), clawbaseL.rotateAngleY + (float) Math.toRadians(-4.59902), clawbaseL.rotateAngleZ + (float) Math.toRadians(8.88927));
        this.setRotateAngle(legR1, legR1.rotateAngleX + (float) Math.toRadians(-20.941-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180/0.25+60))*2), legR1.rotateAngleY + (float) Math.toRadians(40.7895+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180/0.25+30))*2), legR1.rotateAngleZ + (float) Math.toRadians(-30.3612-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180/0.25))*2));
        this.setRotateAngle(legRs5, legRs5.rotateAngleX + (float) Math.toRadians(-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180/0.25+5))*60), legRs5.rotateAngleY + (float) Math.toRadians(-15+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180/0.25+25))*40), legRs5.rotateAngleZ + (float) Math.toRadians(-10+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180/0.25+230))*20));
        this.setRotateAngle(legL2, legL2.rotateAngleX + (float) Math.toRadians(-20.941-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180/0.25+90))*2), legL2.rotateAngleY + (float) Math.toRadians(-40.7895-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180/0.25+60))*2), legL2.rotateAngleZ + (float) Math.toRadians(30.3612+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180/0.25+30))*2));
        this.setRotateAngle(legL3, legL3.rotateAngleX + (float) Math.toRadians(-20.941-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180/0.25+120))*2), legL3.rotateAngleY + (float) Math.toRadians(-40.7895-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180/0.25+90))*2), legL3.rotateAngleZ + (float) Math.toRadians(30.3612+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180/0.25+60))*2));
        this.setRotateAngle(legL4, legL4.rotateAngleX + (float) Math.toRadians(-20.941-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180/0.25+150))*2), legL4.rotateAngleY + (float) Math.toRadians(-40.7895-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180/0.25+120))*2), legL4.rotateAngleZ + (float) Math.toRadians(30.3612+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180/0.25+90))*2));
        this.setRotateAngle(legL5, legL5.rotateAngleX + (float) Math.toRadians(-3+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180/0.25+160))*10), legL5.rotateAngleY + (float) Math.toRadians(30+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180/0.25-90))*40), legL5.rotateAngleZ + (float) Math.toRadians(-5+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180/0.25+140))*25));
        this.setRotateAngle(legLs5, legLs5.rotateAngleX + (float) Math.toRadians(-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180/0.25+5))*60), legLs5.rotateAngleY + (float) Math.toRadians(15-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180/0.25+25))*40), legLs5.rotateAngleZ + (float) Math.toRadians(10-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180/0.25+230))*20));
        this.setRotateAngle(legL, legL.rotateAngleX + (float) Math.toRadians(-20.941-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180/0.25+60))*2), legL.rotateAngleY + (float) Math.toRadians(-40.7895-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180/0.25+30))*2), legL.rotateAngleZ + (float) Math.toRadians(30.3612+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180/0.25))*2));
    }

    public void animate(IAnimatedEntity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        EntityPrehistoricFloraErettopterus e = (EntityPrehistoricFloraErettopterus) entity;
        animator.update(entity);

        animator.setAnimation(e.SWIM_ANIMATION);
        animator.startKeyframe(e.swimTransitionLength()); //move to this keyframe over the right length
        animator.endKeyframe();
        animator.setStaticKeyframe(0);
        animator.resetKeyframe(0);

        animator.setAnimation(e.UNSWIM_ANIMATION);
        animator.startKeyframe(e.unswimTransitionLength()); //move to this keyframe over the right length
        animator.endKeyframe();
        animator.setStaticKeyframe(0);
        animator.resetKeyframe(0);

    }
}
