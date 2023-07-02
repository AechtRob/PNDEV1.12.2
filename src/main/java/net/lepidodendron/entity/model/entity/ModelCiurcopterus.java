package net.lepidodendron.entity.model.entity;

import net.ilexiconn.llibrary.client.model.ModelAnimator;
import net.ilexiconn.llibrary.client.model.tools.AdvancedModelBase;
import net.ilexiconn.llibrary.client.model.tools.AdvancedModelRenderer;
import net.ilexiconn.llibrary.server.animation.IAnimatedEntity;
import net.lepidodendron.entity.EntityPrehistoricFloraCiurcopterus;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLiving;
import net.minecraft.entity.EntityLivingBase;

public class ModelCiurcopterus extends AdvancedModelBase {
    private final AdvancedModelRenderer Ciurcopterus;
    private final AdvancedModelRenderer Body;
    private final AdvancedModelRenderer eyeR_r1;
    private final AdvancedModelRenderer cube_r1;
    private final AdvancedModelRenderer cube_r2;
    private final AdvancedModelRenderer cube_r3;
    private final AdvancedModelRenderer eyeR_r2;
    private final AdvancedModelRenderer cheliceraL;
    private final AdvancedModelRenderer cheliceraL_r1;
    private final AdvancedModelRenderer clawbaseL;
    private final AdvancedModelRenderer clawnotmovespineL_r1;
    private final AdvancedModelRenderer crawbaseL_r1;
    private final AdvancedModelRenderer clawL;
    private final AdvancedModelRenderer clawmovespineL_r1;
    private final AdvancedModelRenderer cheliceraR;
    private final AdvancedModelRenderer cheliceraR_r1;
    private final AdvancedModelRenderer clawbaseR;
    private final AdvancedModelRenderer clawnotmovespineR_r1;
    private final AdvancedModelRenderer crawbaseR_r1;
    private final AdvancedModelRenderer clawR;
    private final AdvancedModelRenderer clawmovespineR_r1;
    private final AdvancedModelRenderer legsL;
    private final AdvancedModelRenderer legL;
    private final AdvancedModelRenderer legL_r1;
    private final AdvancedModelRenderer legL2;
    private final AdvancedModelRenderer legL3;
    private final AdvancedModelRenderer legL_r2;
    private final AdvancedModelRenderer legL4;
    private final AdvancedModelRenderer legL5_3_r1;
    private final AdvancedModelRenderer legLs;
    private final AdvancedModelRenderer legL5_ptery4_r1;
    private final AdvancedModelRenderer legL5;
    private final AdvancedModelRenderer legR6_r1;
    private final AdvancedModelRenderer legsR;
    private final AdvancedModelRenderer legR;
    private final AdvancedModelRenderer legR_r1;
    private final AdvancedModelRenderer legR2;
    private final AdvancedModelRenderer legR3;
    private final AdvancedModelRenderer legR_r2;
    private final AdvancedModelRenderer legR4;
    private final AdvancedModelRenderer legR5_4_r1;
    private final AdvancedModelRenderer legRs;
    private final AdvancedModelRenderer legR5_ptery5_r1;
    private final AdvancedModelRenderer legR5;
    private final AdvancedModelRenderer legR7_r1;
    private final AdvancedModelRenderer opisthosoma;
    private final AdvancedModelRenderer TergiteA1;
    private final AdvancedModelRenderer TergiteA2;
    private final AdvancedModelRenderer TergiteA3;
    private final AdvancedModelRenderer TergiteA4;
    private final AdvancedModelRenderer TergiteA5;
    private final AdvancedModelRenderer TergiteA6;
    private final AdvancedModelRenderer Telson;

    private ModelAnimator animator;


    public ModelCiurcopterus() {
        this.textureWidth = 64;
        this.textureHeight = 64;

        this.Ciurcopterus = new AdvancedModelRenderer(this);
        this.Ciurcopterus.setRotationPoint(0.0F, 23.0F, 0.0F);


        this.Body = new AdvancedModelRenderer(this);
        this.Body.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.Ciurcopterus.addChild(Body);
        this.Body.cubeList.add(new ModelBox(Body, 0, 12, -4.0F, -2.0F, -6.0F, 8, 2, 4, 0.0F, false));
        this.Body.cubeList.add(new ModelBox(Body, 11, 35, -1.5F, -0.5F, -6.4F, 3, 1, 2, 0.0F, false));
        this.Body.cubeList.add(new ModelBox(Body, 36, 19, -1.0F, -2.0F, -7.8F, 2, 2, 2, 0.001F, false));

        this.eyeR_r1 = new AdvancedModelRenderer(this);
        this.eyeR_r1.setRotationPoint(-2.7F, 0.0F, -6.7F);
        this.Body.addChild(eyeR_r1);
        this.setRotateAngle(eyeR_r1, 0.0F, -1.0647F, 0.0F);
        this.eyeR_r1.cubeList.add(new ModelBox(eyeR_r1, 35, 38, -0.4408F, -2.1F, -1.2301F, 2, 1, 2, 0.0F, true));

        this.cube_r1 = new AdvancedModelRenderer(this);
        this.cube_r1.setRotationPoint(-1.0F, 0.0F, -7.8F);
        this.Body.addChild(cube_r1);
        this.setRotateAngle(cube_r1, 0.0F, 0.5061F, 0.0F);
        this.cube_r1.cubeList.add(new ModelBox(cube_r1, 26, 34, -3.0F, -2.0F, 0.0F, 3, 2, 2, -0.001F, true));
        this.cube_r1.cubeList.add(new ModelBox(cube_r1, 0, 29, -3.5F, -2.0F, 0.0F, 1, 2, 1, -0.002F, true));

        this.cube_r2 = new AdvancedModelRenderer(this);
        this.cube_r2.setRotationPoint(1.0F, 0.0F, -7.8F);
        this.Body.addChild(cube_r2);
        this.setRotateAngle(cube_r2, 0.0F, -0.5061F, 0.0F);
        this.cube_r2.cubeList.add(new ModelBox(cube_r2, 0, 29, 2.5F, -2.0F, 0.0F, 1, 2, 1, -0.002F, false));
        this.cube_r2.cubeList.add(new ModelBox(cube_r2, 26, 34, 0.0F, -2.0F, 0.0F, 3, 2, 2, -0.001F, false));

        this.cube_r3 = new AdvancedModelRenderer(this);
        this.cube_r3.setRotationPoint(0.0F, 0.6F, -4.4F);
        this.Body.addChild(cube_r3);
        this.setRotateAngle(cube_r3, 0.1745F, 0.0F, 0.0F);
        this.cube_r3.cubeList.add(new ModelBox(cube_r3, 8, 29, -2.0F, -1.0F, 0.0F, 4, 1, 2, 0.0F, false));

        this.eyeR_r2 = new AdvancedModelRenderer(this);
        this.eyeR_r2.setRotationPoint(2.7F, 0.0F, -6.7F);
        this.Body.addChild(eyeR_r2);
        this.setRotateAngle(eyeR_r2, 0.0F, 1.0647F, 0.0F);
        this.eyeR_r2.cubeList.add(new ModelBox(eyeR_r2, 35, 38, -1.5592F, -2.1F, -1.2301F, 2, 1, 2, 0.0F, false));

        this.cheliceraL = new AdvancedModelRenderer(this);
        this.cheliceraL.setRotationPoint(1.45F, -0.3F, -6.9F);
        this.Body.addChild(cheliceraL);
        this.setRotateAngle(cheliceraL, 0.1745F, -0.3491F, 0.0F);


        this.cheliceraL_r1 = new AdvancedModelRenderer(this);
        this.cheliceraL_r1.setRotationPoint(-2.0F, 1.0F, 5.75F);
        this.cheliceraL.addChild(cheliceraL_r1);
        this.setRotateAngle(cheliceraL_r1, 0.0F, -0.0873F, 0.0F);
        this.cheliceraL_r1.cubeList.add(new ModelBox(cheliceraL_r1, 0, 29, 1.0F, -1.0F, -10.0F, 1, 1, 5, 0.0F, false));

        this.clawbaseL = new AdvancedModelRenderer(this);
        this.clawbaseL.setRotationPoint(0.4F, 0.5F, -4.25F);
        this.cheliceraL.addChild(clawbaseL);


        this.clawnotmovespineL_r1 = new AdvancedModelRenderer(this);
        this.clawnotmovespineL_r1.setRotationPoint(-1.0F, 0.5F, -1.7F);
        this.clawbaseL.addChild(clawnotmovespineL_r1);
        this.setRotateAngle(clawnotmovespineL_r1, 0.0F, 0.2007F, 0.0F);
        this.clawnotmovespineL_r1.cubeList.add(new ModelBox(clawnotmovespineL_r1, 19, 36, -0.0787F, -0.6F, -2.7144F, 1, 0, 3, 0.0F, false));

        this.crawbaseL_r1 = new AdvancedModelRenderer(this);
        this.crawbaseL_r1.setRotationPoint(-2.4F, 0.5F, 14.0F);
        this.clawbaseL.addChild(crawbaseL_r1);
        this.setRotateAngle(crawbaseL_r1, 0.0F, -0.0873F, 0.0F);
        this.crawbaseL_r1.cubeList.add(new ModelBox(crawbaseL_r1, 37, 34, 0.0F, -1.0F, -16.0F, 2, 1, 2, 0.0F, false));

        this.clawL = new AdvancedModelRenderer(this);
        this.clawL.setRotationPoint(0.9F, 0.0F, -1.7F);
        this.clawbaseL.addChild(clawL);


        this.clawmovespineL_r1 = new AdvancedModelRenderer(this);
        this.clawmovespineL_r1.setRotationPoint(-3.3F, 0.5F, 15.7F);
        this.clawL.addChild(clawmovespineL_r1);
        this.setRotateAngle(clawmovespineL_r1, 0.0F, -0.3491F, 0.0F);
        this.clawmovespineL_r1.cubeList.add(new ModelBox(clawmovespineL_r1, 36, 10, -3.1975F, -0.5F, -18.5491F, 1, 0, 3, 0.0F, false));

        this.cheliceraR = new AdvancedModelRenderer(this);
        this.cheliceraR.setRotationPoint(-1.45F, -0.3F, -6.9F);
        this.Body.addChild(cheliceraR);
        this.setRotateAngle(cheliceraR, 0.1745F, 0.3491F, 0.0F);


        this.cheliceraR_r1 = new AdvancedModelRenderer(this);
        this.cheliceraR_r1.setRotationPoint(2.0F, 1.0F, 5.75F);
        this.cheliceraR.addChild(cheliceraR_r1);
        this.setRotateAngle(cheliceraR_r1, 0.0F, 0.0873F, 0.0F);
        this.cheliceraR_r1.cubeList.add(new ModelBox(cheliceraR_r1, 0, 29, -2.0F, -1.0F, -10.0F, 1, 1, 5, 0.0F, true));

        this.clawbaseR = new AdvancedModelRenderer(this);
        this.clawbaseR.setRotationPoint(-0.4F, 0.5F, -4.25F);
        this.cheliceraR.addChild(clawbaseR);


        this.clawnotmovespineR_r1 = new AdvancedModelRenderer(this);
        this.clawnotmovespineR_r1.setRotationPoint(1.0F, 0.5F, -1.7F);
        this.clawbaseR.addChild(clawnotmovespineR_r1);
        this.setRotateAngle(clawnotmovespineR_r1, 0.0F, -0.2007F, 0.0F);
        this.clawnotmovespineR_r1.cubeList.add(new ModelBox(clawnotmovespineR_r1, 19, 36, -0.9213F, -0.6F, -2.7144F, 1, 0, 3, 0.0F, true));

        this.crawbaseR_r1 = new AdvancedModelRenderer(this);
        this.crawbaseR_r1.setRotationPoint(2.4F, 0.5F, 14.0F);
        this.clawbaseR.addChild(crawbaseR_r1);
        this.setRotateAngle(crawbaseR_r1, 0.0F, 0.0873F, 0.0F);
        this.crawbaseR_r1.cubeList.add(new ModelBox(crawbaseR_r1, 37, 34, -2.0F, -1.0F, -16.0F, 2, 1, 2, 0.0F, true));

        this.clawR = new AdvancedModelRenderer(this);
        this.clawR.setRotationPoint(-0.9F, 0.0F, -1.7F);
        this.clawbaseR.addChild(clawR);


        this.clawmovespineR_r1 = new AdvancedModelRenderer(this);
        this.clawmovespineR_r1.setRotationPoint(3.3F, 0.5F, 15.7F);
        this.clawR.addChild(clawmovespineR_r1);
        this.setRotateAngle(clawmovespineR_r1, 0.0F, 0.3491F, 0.0F);
        this.clawmovespineR_r1.cubeList.add(new ModelBox(clawmovespineR_r1, 36, 10, 2.1975F, -0.5F, -18.5491F, 1, 0, 3, 0.0F, true));

        this.legsL = new AdvancedModelRenderer(this);
        this.legsL.setRotationPoint(37.1F, 1.0F, 2.0F);
        this.Body.addChild(legsL);


        this.legL = new AdvancedModelRenderer(this);
        this.legL.setRotationPoint(-36.05F, -1.0F, -8.0F);
        this.legsL.addChild(legL);
        this.setRotateAngle(legL, -0.0306F, -0.1719F, 0.1772F);


        this.legL_r1 = new AdvancedModelRenderer(this);
        this.legL_r1.setRotationPoint(-0.6449F, 0.6F, -1.2279F);
        this.legL.addChild(legL_r1);
        this.setRotateAngle(legL_r1, 0.0F, 0.6632F, 0.0F);
        this.legL_r1.cubeList.add(new ModelBox(legL_r1, 0, 39, -0.2682F, -0.9F, 0.724F, 3, 1, 1, -0.01F, false));

        this.legL2 = new AdvancedModelRenderer(this);
        this.legL2.setRotationPoint(-36.0F, -0.4F, -8.1F);
        this.legsL.addChild(legL2);
        this.setRotateAngle(legL2, 0.0169F, 0.1912F, 0.0889F);
        this.legL2.cubeList.add(new ModelBox(legL2, 29, 3, -0.0294F, -0.9F, -0.0947F, 6, 1, 1, -0.001F, false));

        this.legL3 = new AdvancedModelRenderer(this);
        this.legL3.setRotationPoint(-35.7F, -0.9F, -7.5F);
        this.legsL.addChild(legL3);
        this.setRotateAngle(legL3, 0.0122F, 0.1391F, 0.0881F);


        this.legL_r2 = new AdvancedModelRenderer(this);
        this.legL_r2.setRotationPoint(1.2844F, 0.6F, 0.6227F);
        this.legL3.addChild(legL_r2);
        this.setRotateAngle(legL_r2, 0.0F, -0.1745F, 0.0F);
        this.legL_r2.cubeList.add(new ModelBox(legL_r2, 22, 27, -1.6223F, -1.0F, -0.6831F, 7, 1, 1, 0.0F, false));

        this.legL4 = new AdvancedModelRenderer(this);
        this.legL4.setRotationPoint(-36.3F, -1.0F, -5.5F);
        this.legsL.addChild(legL4);
        this.setRotateAngle(legL4, 0.0122F, 0.1391F, 0.0881F);


        this.legL5_3_r1 = new AdvancedModelRenderer(this);
        this.legL5_3_r1.setRotationPoint(27.5427F, 0.7F, -9.5619F);
        this.legL4.addChild(legL5_3_r1);
        this.setRotateAngle(legL5_3_r1, 0.0F, -0.5236F, 0.0F);
        this.legL5_3_r1.cubeList.add(new ModelBox(legL5_3_r1, 0, 36, -19.4203F, -1.0F, 20.9203F, 4, 1, 1, 0.0F, false));

        this.legLs = new AdvancedModelRenderer(this);
        this.legLs.setRotationPoint(3.1927F, 0.7F, 1.0381F);
        this.legL4.addChild(legLs);
        this.setRotateAngle(legLs, 0.0F, -0.1745F, 0.0F);


        this.legL5_ptery4_r1 = new AdvancedModelRenderer(this);
        this.legL5_ptery4_r1.setRotationPoint(18.9571F, 0.0F, -17.7925F);
        this.legLs.addChild(legL5_ptery4_r1);
        this.setRotateAngle(legL5_ptery4_r1, 0.0F, -0.5236F, 0.0F);
        this.legL5_ptery4_r1.cubeList.add(new ModelBox(legL5_ptery4_r1, 22, 30, -3.2809F, -1.0F, 24.3937F, 1, 1, 1, 0.0F, false));
        this.legL5_ptery4_r1.cubeList.add(new ModelBox(legL5_ptery4_r1, 28, 30, -7.2809F, -1.0F, 24.3937F, 4, 1, 2, 0.01F, false));

        this.legL5 = new AdvancedModelRenderer(this);
        this.legL5.setRotationPoint(-36.0F, -0.9F, -6.5F);
        this.legsL.addChild(legL5);
        this.setRotateAngle(legL5, 0.0122F, 0.1391F, 0.0881F);


        this.legR6_r1 = new AdvancedModelRenderer(this);
        this.legR6_r1.setRotationPoint(1.9805F, 0.6F, 0.2783F);
        this.legL5.addChild(legR6_r1);
        this.setRotateAngle(legR6_r1, 0.0F, -0.3491F, 0.0F);
        this.legR6_r1.cubeList.add(new ModelBox(legR6_r1, 26, 0, -2.1243F, -1.0F, -0.2515F, 7, 1, 1, 0.001F, false));

        this.legsR = new AdvancedModelRenderer(this);
        this.legsR.setRotationPoint(-37.1F, 1.0F, 2.0F);
        this.Body.addChild(legsR);


        this.legR = new AdvancedModelRenderer(this);
        this.legR.setRotationPoint(36.05F, -1.0F, -8.0F);
        this.legsR.addChild(legR);
        this.setRotateAngle(legR, -0.0306F, 0.1719F, -0.1772F);


        this.legR_r1 = new AdvancedModelRenderer(this);
        this.legR_r1.setRotationPoint(0.6449F, 0.6F, -1.2279F);
        this.legR.addChild(legR_r1);
        this.setRotateAngle(legR_r1, 0.0F, -0.6632F, 0.0F);
        this.legR_r1.cubeList.add(new ModelBox(legR_r1, 0, 39, -2.7318F, -0.9F, 0.724F, 3, 1, 1, -0.01F, true));

        this.legR2 = new AdvancedModelRenderer(this);
        this.legR2.setRotationPoint(36.0F, -0.4F, -8.1F);
        this.legsR.addChild(legR2);
        this.setRotateAngle(legR2, 0.0169F, -0.1912F, -0.0889F);
        this.legR2.cubeList.add(new ModelBox(legR2, 29, 3, -5.9706F, -0.9F, -0.0947F, 6, 1, 1, -0.001F, true));

        this.legR3 = new AdvancedModelRenderer(this);
        this.legR3.setRotationPoint(35.7F, -0.9F, -7.5F);
        this.legsR.addChild(legR3);
        this.setRotateAngle(legR3, 0.0122F, -0.1391F, -0.0881F);


        this.legR_r2 = new AdvancedModelRenderer(this);
        this.legR_r2.setRotationPoint(-1.2844F, 0.6F, 0.6227F);
        this.legR3.addChild(legR_r2);
        this.setRotateAngle(legR_r2, 0.0F, 0.1745F, 0.0F);
        this.legR_r2.cubeList.add(new ModelBox(legR_r2, 22, 27, -5.3777F, -1.0F, -0.6831F, 7, 1, 1, 0.0F, true));

        this.legR4 = new AdvancedModelRenderer(this);
        this.legR4.setRotationPoint(36.3F, -1.0F, -5.5F);
        this.legsR.addChild(legR4);
        this.setRotateAngle(legR4, 0.0122F, -0.1391F, -0.0881F);


        this.legR5_4_r1 = new AdvancedModelRenderer(this);
        this.legR5_4_r1.setRotationPoint(-27.5427F, 0.7F, -9.5619F);
        this.legR4.addChild(legR5_4_r1);
        this.setRotateAngle(legR5_4_r1, 0.0F, 0.5236F, 0.0F);
        this.legR5_4_r1.cubeList.add(new ModelBox(legR5_4_r1, 0, 36, 15.4203F, -1.0F, 20.9203F, 4, 1, 1, 0.0F, true));

        this.legRs = new AdvancedModelRenderer(this);
        this.legRs.setRotationPoint(-3.1927F, 0.7F, 1.0381F);
        this.legR4.addChild(legRs);
        this.setRotateAngle(legRs, 0.0F, 0.1745F, 0.0F);


        this.legR5_ptery5_r1 = new AdvancedModelRenderer(this);
        this.legR5_ptery5_r1.setRotationPoint(-18.9571F, 0.0F, -17.7925F);
        this.legRs.addChild(legR5_ptery5_r1);
        this.setRotateAngle(legR5_ptery5_r1, 0.0F, 0.5236F, 0.0F);
        this.legR5_ptery5_r1.cubeList.add(new ModelBox(legR5_ptery5_r1, 22, 30, 2.2809F, -1.0F, 24.3937F, 1, 1, 1, 0.0F, true));
        this.legR5_ptery5_r1.cubeList.add(new ModelBox(legR5_ptery5_r1, 28, 30, 3.2809F, -1.0F, 24.3937F, 4, 1, 2, 0.01F, true));

        this.legR5 = new AdvancedModelRenderer(this);
        this.legR5.setRotationPoint(36.0F, -0.9F, -6.5F);
        this.legsR.addChild(legR5);
        this.setRotateAngle(legR5, 0.0122F, -0.1391F, -0.0881F);


        this.legR7_r1 = new AdvancedModelRenderer(this);
        this.legR7_r1.setRotationPoint(-1.9805F, 0.6F, 0.2783F);
        this.legR5.addChild(legR7_r1);
        this.setRotateAngle(legR7_r1, 0.0F, 0.3491F, 0.0F);
        this.legR7_r1.cubeList.add(new ModelBox(legR7_r1, 26, 0, -4.8757F, -1.0F, -0.2515F, 7, 1, 1, 0.001F, true));

        this.opisthosoma = new AdvancedModelRenderer(this);
        this.opisthosoma.setRotationPoint(0.0F, 0.0F, -2.0F);
        this.Body.addChild(opisthosoma);


        this.TergiteA1 = new AdvancedModelRenderer(this);
        this.TergiteA1.setRotationPoint(0.0F, 0.0F, -0.2F);
        this.opisthosoma.addChild(TergiteA1);
        this.TergiteA1.cubeList.add(new ModelBox(TergiteA1, 0, 19, -5.0F, -2.0F, 0.2F, 10, 2, 2, 0.0F, false));

        this.TergiteA2 = new AdvancedModelRenderer(this);
        this.TergiteA2.setRotationPoint(0.0F, 0.0F, 2.2F);
        this.TergiteA1.addChild(TergiteA2);
        this.TergiteA2.cubeList.add(new ModelBox(TergiteA2, 0, 0, -5.5F, -2.0F, 0.0F, 11, 2, 3, 0.0F, false));

        this.TergiteA3 = new AdvancedModelRenderer(this);
        this.TergiteA3.setRotationPoint(0.0F, 0.0F, 3.0F);
        this.TergiteA2.addChild(TergiteA3);
        this.TergiteA3.cubeList.add(new ModelBox(TergiteA3, 0, 6, -5.0F, -2.0F, 0.0F, 10, 2, 3, 0.0F, false));

        this.TergiteA4 = new AdvancedModelRenderer(this);
        this.TergiteA4.setRotationPoint(0.0F, 0.0F, 3.0F);
        this.TergiteA3.addChild(TergiteA4);
        this.TergiteA4.cubeList.add(new ModelBox(TergiteA4, 0, 24, -4.0F, -2.0F, 0.0F, 8, 2, 2, 0.0F, false));

        this.TergiteA5 = new AdvancedModelRenderer(this);
        this.TergiteA5.setRotationPoint(0.0F, 0.0F, 2.0F);
        this.TergiteA4.addChild(TergiteA5);
        this.TergiteA5.cubeList.add(new ModelBox(TergiteA5, 25, 14, -3.0F, -2.0F, 0.0F, 6, 2, 2, 0.0F, false));

        this.TergiteA6 = new AdvancedModelRenderer(this);
        this.TergiteA6.setRotationPoint(0.0F, 0.0F, 2.0F);
        this.TergiteA5.addChild(TergiteA6);
        this.TergiteA6.cubeList.add(new ModelBox(TergiteA6, 21, 20, -2.5F, -2.0F, 0.0F, 5, 2, 4, 0.0F, false));

        this.Telson = new AdvancedModelRenderer(this);
        this.Telson.setRotationPoint(0.0F, 0.0F, 4.0F);
        this.TergiteA6.addChild(Telson);
        this.Telson.cubeList.add(new ModelBox(Telson, 21, 6, -0.5F, -1.0F, -0.3F, 1, 1, 6, 0.0F, false));
        this.Telson.cubeList.add(new ModelBox(Telson, 15, 27, 0.0F, -2.0F, -0.3F, 0, 1, 6, 0.0F, false));
        this.Telson.cubeList.add(new ModelBox(Telson, 38, 25, 0.0F, -0.4F, 4.0F, 2, 0, 2, 0.0F, false));
        this.Telson.cubeList.add(new ModelBox(Telson, 30, 6, 0.0F, -0.4F, 1.0F, 3, 0, 3, 0.0F, false));
        this.Telson.cubeList.add(new ModelBox(Telson, 30, 10, 0.0F, -0.4F, 0.0F, 2, 0, 1, 0.0F, false));
        this.Telson.cubeList.add(new ModelBox(Telson, 38, 25, -2.0F, -0.4F, 4.0F, 2, 0, 2, 0.0F, true));
        this.Telson.cubeList.add(new ModelBox(Telson, 30, 6, -3.0F, -0.4F, 1.0F, 3, 0, 3, 0.0F, true));
        this.Telson.cubeList.add(new ModelBox(Telson, 30, 10, -2.0F, -0.4F, 0.0F, 2, 0, 1, 0.0F, true));

        updateDefaultPose();
        animator = ModelAnimator.create();
    }

    @Override
    public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        animate((IAnimatedEntity) entity, f, f1, f2, f3, f4, f5);
        this.Ciurcopterus.render(f5);
    }
    public void renderStaticWall(float f) {
        this.Ciurcopterus.rotateAngleY = (float) Math.toRadians(360);
        this.setRotateAngle(Body, 1.5F, 0.0F, -0.25F);
        this.Ciurcopterus.offsetY = -0.2F;
        this.Ciurcopterus.offsetX = 0.02F;
        this.Ciurcopterus.offsetZ = -0.29F;
        this.Ciurcopterus.render(0.01F);
        resetToDefaultPose();
    }
    public void renderStaticFloor(float f) {
        this.setRotateAngle(Body, 0.0F, 0.0F, 0.0F);
        this.setRotateAngle(TergiteA1, 0.1F, 0.0F, 0.0F);
        this.setRotateAngle(TergiteA2, 0.05F, 0.0F, 0.0F);
        this.setRotateAngle(TergiteA3, -0.05F, 0.0F, 0.0F);
        this.setRotateAngle(TergiteA4, -0.05F, 0.0F, 0.0F);
        this.setRotateAngle(TergiteA5, -0.05F, 0.0F, 0.0F);
        this.setRotateAngle(TergiteA6, -0.1F, 0.0F, 0.0F);
        this.setRotateAngle(Telson, 0.0F, 0.0F, 0.0F);
        this.setRotateAngle(cheliceraR, 0.0F, 0.2F, 0.0F);
        this.setRotateAngle(cheliceraL, 0.0F, -0.2F, 0.0F);
        this.Ciurcopterus.offsetY = -0.05F;
        this.Ciurcopterus.render(0.01F);
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
        this.Ciurcopterus.offsetY = -0.25F;
        this.Ciurcopterus.offsetZ = 0.1F;


        AdvancedModelRenderer[] fishBody = {this.TergiteA1, this.TergiteA2, this.TergiteA3, this.TergiteA4, this.TergiteA5, this.TergiteA6, this.Telson};
        AdvancedModelRenderer[] fishTail = {this.TergiteA6, this.Telson};



        //mouthparts:
        this.walk(cheliceraL, 0.35F, -0.15F, false, 0, -0.1F, f2, 0.6F);
        this.walk(cheliceraR, 0.35F, 0.15F, false, -1, 0.1F, f2, 0.6F);

        float speed = 0.2F;
        float tailHdegree = 0.0F;
        float paddleVdegree = 0.05F;
        float paddleHdegree = 0.4F;
        float tailSwing = 0.50F;

        EntityPrehistoricFloraCiurcopterus ciurc = (EntityPrehistoricFloraCiurcopterus) e;


        if (e instanceof EntityLiving && !((EntityLiving) e).isAIDisabled()) {//on land
            if(!ciurc.getIsMoving()) {
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
                //this.bob(body, -speed * 1.5F, 2F, false, f2, 1);
                this.chainSwing(fishBody, speed, 0.01F, -2, f2, 1);
            }
        }
    }
    @Override
    public void setLivingAnimations(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime) {
        super.setLivingAnimations(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime);
        this.resetToDefaultPose();
        EntityPrehistoricFloraCiurcopterus ee = (EntityPrehistoricFloraCiurcopterus) entitylivingbaseIn;
        //Swimming pose:

        if ((!ee.isReallySwimming()) && (ee.getAnimation() != ee.UNSWIM_ANIMATION)) {
            //Walk pose:

                animWalking(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime);

        } else {
            if ((ee.getAnimation() != ee.SWIM_ANIMATION)) {
                if (ee.getIsFast()) {
                    animFast(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime);

                } else {
                    animSwim(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime);
                }
            }
        }

    }

    public void animWalking(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime) {
        EntityPrehistoricFloraCiurcopterus entity = (EntityPrehistoricFloraCiurcopterus) entitylivingbaseIn;
        int animCycle = 30;
        double tickAnim = (entity.ticksExisted + entity.getTickOffset()) - (int) (Math.floor((double) (entity.ticksExisted + entity.getTickOffset()) / (double) animCycle) * (double) animCycle) + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;
        this.setRotateAngle(Body, Body.rotateAngleX + (float) Math.toRadians(4+Math.sin((Math.PI/180)*((((double)tickAnim/30D)*1.5D)*120/0.5))), Body.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/30D)*1.5D)*120/0.5+90))), Body.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/30D)*1.5D)*120/0.5+60))*0.5));
        this.Body.offsetX = (float) Math.toRadians(0);
        this.Body.offsetY = (float) Math.toRadians(2.9+Math.sin((Math.PI/180)*((((double)tickAnim/30D)*1.5D)*120/0.5+30))*0.25);
        this.Body.offsetZ = (float) Math.toRadians(0);
        this.setRotateAngle(cheliceraL, cheliceraL.rotateAngleX + (float) Math.toRadians(-10), cheliceraL.rotateAngleY + (float) Math.toRadians(22.5), cheliceraL.rotateAngleZ + (float) Math.toRadians(0));
        this.cheliceraL.offsetX = (float) Math.toRadians(-0.75);
        this.cheliceraL.offsetY = (float) Math.toRadians(-0.3);
        this.cheliceraL.offsetZ = (float) Math.toRadians(0);
        this.setRotateAngle(clawbaseL, clawbaseL.rotateAngleX + (float) Math.toRadians(172.60809), clawbaseL.rotateAngleY + (float) Math.toRadians(2.39542), clawbaseL.rotateAngleZ + (float) Math.toRadians(-1.6203));
        this.clawbaseL.offsetX = (float) Math.toRadians(0.3);
        this.clawbaseL.offsetY = (float) Math.toRadians(-0.7);
        this.clawbaseL.offsetZ = (float) Math.toRadians(0.1);
        this.setRotateAngle(clawL, clawL.rotateAngleX + (float) Math.toRadians(0), clawL.rotateAngleY + (float) Math.toRadians(30), clawL.rotateAngleZ + (float) Math.toRadians(0));
        this.setRotateAngle(cheliceraR, cheliceraR.rotateAngleX + (float) Math.toRadians(-10), cheliceraR.rotateAngleY + (float) Math.toRadians(-22.5), cheliceraR.rotateAngleZ + (float) Math.toRadians(0));
        this.cheliceraR.offsetX = (float) Math.toRadians(0.75);
        this.cheliceraR.offsetY = (float) Math.toRadians(-0.3);
        this.cheliceraR.offsetZ = (float) Math.toRadians(0);
        this.setRotateAngle(clawbaseR, clawbaseR.rotateAngleX + (float) Math.toRadians(172.60809), clawbaseR.rotateAngleY + (float) Math.toRadians(-2.39542), clawbaseR.rotateAngleZ + (float) Math.toRadians(1.6203));
        this.clawbaseR.offsetX = (float) Math.toRadians(-0.3);
        this.clawbaseR.offsetY = (float) Math.toRadians(-0.7);
        this.clawbaseR.offsetZ = (float) Math.toRadians(0.1);
        this.setRotateAngle(clawR, clawR.rotateAngleX + (float) Math.toRadians(0), clawR.rotateAngleY + (float) Math.toRadians(-30), clawR.rotateAngleZ + (float) Math.toRadians(0));
        this.setRotateAngle(legL, legL.rotateAngleX + (float) Math.toRadians(15+Math.sin((Math.PI/180)*((((double)tickAnim/30D)*1.5D)*60/0.25+115))*2.5), legL.rotateAngleY + (float) Math.toRadians(22.5-Math.sin((Math.PI/180)*((((double)tickAnim/30D)*1.5D)*60/0.25-115))*2.5), legL.rotateAngleZ + (float) Math.toRadians(0));

        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 2.25871D + (((tickAnim - 0D) / 3D) * (0.03401D-(2.25871D)));
            yy = 7.22682D + (((tickAnim - 0D) / 3D) * (0.10882D-(7.22682D)));
            zz = 23.06544D + (((tickAnim - 0D) / 3D) * (23.42328D-(23.06544D)));
        }
        else if (tickAnim >= 3 && tickAnim < 7) {
            xx = 0.03401D + (((tickAnim - 3D) / 4D) * (0.49858D-(0.03401D)));
            yy = 0.10882D + (((tickAnim - 3D) / 4D) * (20.5696D-(0.10882D)));
            zz = 23.42328D + (((tickAnim - 3D) / 4D) * (10.1396D-(23.42328D)));
        }
        else if (tickAnim >= 7 && tickAnim < 10) {
            xx = 0.49858D + (((tickAnim - 7D) / 3D) * (7.20308D-(0.49858D)));
            yy = 20.5696D + (((tickAnim - 7D) / 3D) * (21.43109D-(20.5696D)));
            zz = 10.1396D + (((tickAnim - 7D) / 3D) * (24.56274D-(10.1396D)));
        }
        else if (tickAnim >= 10 && tickAnim < 18) {
            xx = 7.20308D + (((tickAnim - 10D) / 8D) * (-0.45574D-(7.20308D)));
            yy = 21.43109D + (((tickAnim - 10D) / 8D) * (0.14198D-(21.43109D)));
            zz = 24.56274D + (((tickAnim - 10D) / 8D) * (20.87599D-(24.56274D)));
        }
        else if (tickAnim >= 18 && tickAnim < 22) {
            xx = -0.45574D + (((tickAnim - 18D) / 4D) * (0.49858D-(-0.45574D)));
            yy = 0.14198D + (((tickAnim - 18D) / 4D) * (20.5696D-(0.14198D)));
            zz = 20.87599D + (((tickAnim - 18D) / 4D) * (10.1396D-(20.87599D)));
        }
        else if (tickAnim >= 22 && tickAnim < 25) {
            xx = 0.49858D + (((tickAnim - 22D) / 3D) * (7.20308D-(0.49858D)));
            yy = 20.5696D + (((tickAnim - 22D) / 3D) * (21.43109D-(20.5696D)));
            zz = 10.1396D + (((tickAnim - 22D) / 3D) * (24.56274D-(10.1396D)));
        }
        else if (tickAnim >= 25 && tickAnim < 30) {
            xx = 7.20308D + (((tickAnim - 25D) / 5D) * (2.25871D-(7.20308D)));
            yy = 21.43109D + (((tickAnim - 25D) / 5D) * (7.22682D-(21.43109D)));
            zz = 24.56274D + (((tickAnim - 25D) / 5D) * (23.06544D-(24.56274D)));
        }
        this.setRotateAngle(legL2, legL2.rotateAngleX + (float) Math.toRadians(xx), legL2.rotateAngleY + (float) Math.toRadians(yy), legL2.rotateAngleZ + (float) Math.toRadians(zz));

        if (tickAnim >= 0 && tickAnim < 2) {
            xx = 1.91669D + (((tickAnim - 0D) / 2D) * (3.03249D-(1.91669D)));
            yy = 6.26712D + (((tickAnim - 0D) / 2D) * (7.05759D-(6.26712D)));
            zz = 14.37742D + (((tickAnim - 0D) / 2D) * (21.05119D-(14.37742D)));
        }
        else if (tickAnim >= 2 && tickAnim < 9) {
            xx = 3.03249D + (((tickAnim - 2D) / 7D) * (-5.77307D-(3.03249D)));
            yy = 7.05759D + (((tickAnim - 2D) / 7D) * (-16.36995D-(7.05759D)));
            zz = 21.05119D + (((tickAnim - 2D) / 7D) * (22.84189D-(21.05119D)));
        }
        else if (tickAnim >= 9 && tickAnim < 13) {
            xx = -5.77307D + (((tickAnim - 9D) / 4D) * (-0.62308D-(-5.77307D)));
            yy = -16.36995D + (((tickAnim - 9D) / 4D) * (4.5556D-(-16.36995D)));
            zz = 22.84189D + (((tickAnim - 9D) / 4D) * (-0.9856D-(22.84189D)));
        }
        else if (tickAnim >= 13 && tickAnim < 17) {
            xx = -0.62308D + (((tickAnim - 13D) / 4D) * (2.56179D-(-0.62308D)));
            yy = 4.5556D + (((tickAnim - 13D) / 4D) * (7.1644D-(4.5556D)));
            zz = -0.9856D + (((tickAnim - 13D) / 4D) * (19.24215D-(-0.9856D)));
        }
        else if (tickAnim >= 17 && tickAnim < 24) {
            xx = 2.56179D + (((tickAnim - 17D) / 7D) * (-5.47573D-(2.56179D)));
            yy = 7.1644D + (((tickAnim - 17D) / 7D) * (-16.54159D-(7.1644D)));
            zz = 19.24215D + (((tickAnim - 17D) / 7D) * (20.82721D-(19.24215D)));
        }
        else if (tickAnim >= 24 && tickAnim < 28) {
            xx = -5.47573D + (((tickAnim - 24D) / 4D) * (-0.62308D-(-5.47573D)));
            yy = -16.54159D + (((tickAnim - 24D) / 4D) * (4.5556D-(-16.54159D)));
            zz = 20.82721D + (((tickAnim - 24D) / 4D) * (-0.9856D-(20.82721D)));
        }
        else if (tickAnim >= 28 && tickAnim < 30) {
            xx = -0.62308D + (((tickAnim - 28D) / 2D) * (1.91669D-(-0.62308D)));
            yy = 4.5556D + (((tickAnim - 28D) / 2D) * (6.26712D-(4.5556D)));
            zz = -0.9856D + (((tickAnim - 28D) / 2D) * (14.37742D-(-0.9856D)));
        }
        this.setRotateAngle(legL3, legL3.rotateAngleX + (float) Math.toRadians(xx), legL3.rotateAngleY + (float) Math.toRadians(yy), legL3.rotateAngleZ + (float) Math.toRadians(zz));

        if (tickAnim >= 0 && tickAnim < 4) {
            xx = 0D + (((tickAnim - 0D) / 4D) * (-0.38466D-(0D)));
            yy = 11.5D + (((tickAnim - 0D) / 4D) * (12.7416D-(11.5D)));
            zz = 0D + (((tickAnim - 0D) / 4D) * (-2.5294D-(0D)));
        }
        else if (tickAnim >= 4 && tickAnim < 8) {
            xx = -0.38466D + (((tickAnim - 4D) / 4D) * (0D-(-0.38466D)));
            yy = 12.7416D + (((tickAnim - 4D) / 4D) * (14D-(12.7416D)));
            zz = -2.5294D + (((tickAnim - 4D) / 4D) * (0D-(-2.5294D)));
        }
        else if (tickAnim >= 8 && tickAnim < 11) {
            xx = 0D + (((tickAnim - 8D) / 3D) * (0.39397D-(0D)));
            yy = 14D + (((tickAnim - 8D) / 3D) * (12.9497D-(14D)));
            zz = 0D + (((tickAnim - 8D) / 3D) * (2.5308D-(0D)));
        }
        else if (tickAnim >= 11 && tickAnim < 15) {
            xx = 0.39397D + (((tickAnim - 11D) / 4D) * (0D-(0.39397D)));
            yy = 12.9497D + (((tickAnim - 11D) / 4D) * (11.5D-(12.9497D)));
            zz = 2.5308D + (((tickAnim - 11D) / 4D) * (0D-(2.5308D)));
        }
        else if (tickAnim >= 15 && tickAnim < 18) {
            xx = 0D + (((tickAnim - 15D) / 3D) * (-0.37536D-(0D)));
            yy = 11.5D + (((tickAnim - 15D) / 3D) * (12.5335D-(11.5D)));
            zz = 0D + (((tickAnim - 15D) / 3D) * (-2.528D-(0D)));
        }
        else if (tickAnim >= 18 && tickAnim < 23) {
            xx = -0.37536D + (((tickAnim - 18D) / 5D) * (0D-(-0.37536D)));
            yy = 12.5335D + (((tickAnim - 18D) / 5D) * (14D-(12.5335D)));
            zz = -2.528D + (((tickAnim - 18D) / 5D) * (0D-(-2.528D)));
        }
        else if (tickAnim >= 23 && tickAnim < 26) {
            xx = 0D + (((tickAnim - 23D) / 3D) * (0.39397D-(0D)));
            yy = 14D + (((tickAnim - 23D) / 3D) * (12.9497D-(14D)));
            zz = 0D + (((tickAnim - 23D) / 3D) * (2.5308D-(0D)));
        }
        else if (tickAnim >= 26 && tickAnim < 30) {
            xx = 0.39397D + (((tickAnim - 26D) / 4D) * (0D-(0.39397D)));
            yy = 12.9497D + (((tickAnim - 26D) / 4D) * (11.5D-(12.9497D)));
            zz = 2.5308D + (((tickAnim - 26D) / 4D) * (0D-(2.5308D)));
        }
        this.setRotateAngle(legL4, legL4.rotateAngleX + (float) Math.toRadians(xx), legL4.rotateAngleY + (float) Math.toRadians(yy), legL4.rotateAngleZ + (float) Math.toRadians(zz));

        if (tickAnim >= 0 && tickAnim < 4) {
            xx = -10.42714D + (((tickAnim - 0D) / 4D) * (-17.02795D-(-10.42714D)));
            yy = -22.83458D + (((tickAnim - 0D) / 4D) * (-33.61041D-(-22.83458D)));
            zz = 25.06527D + (((tickAnim - 0D) / 4D) * (30.4195D-(25.06527D)));
        }
        else if (tickAnim >= 4 && tickAnim < 8) {
            xx = -17.02795D + (((tickAnim - 4D) / 4D) * (-5.16627D-(-17.02795D)));
            yy = -33.61041D + (((tickAnim - 4D) / 4D) * (-14.8597D-(-33.61041D)));
            zz = 30.4195D + (((tickAnim - 4D) / 4D) * (12.4562D-(30.4195D)));
        }
        else if (tickAnim >= 8 && tickAnim < 12) {
            xx = -5.16627D + (((tickAnim - 8D) / 4D) * (-5.01082D-(-5.16627D)));
            yy = -14.8597D + (((tickAnim - 8D) / 4D) * (-11.38254D-(-14.8597D)));
            zz = 12.4562D + (((tickAnim - 8D) / 4D) * (22.41135D-(12.4562D)));
        }
        else if (tickAnim >= 12 && tickAnim < 19) {
            xx = -5.01082D + (((tickAnim - 12D) / 7D) * (-15.0097D-(-5.01082D)));
            yy = -11.38254D + (((tickAnim - 12D) / 7D) * (-34.73374D-(-11.38254D)));
            zz = 22.41135D + (((tickAnim - 12D) / 7D) * (25.85083D-(22.41135D)));
        }
        else if (tickAnim >= 19 && tickAnim < 23) {
            xx = -15.0097D + (((tickAnim - 19D) / 4D) * (-5.17D-(-15.0097D)));
            yy = -34.73374D + (((tickAnim - 19D) / 4D) * (-14.86D-(-34.73374D)));
            zz = 25.85083D + (((tickAnim - 19D) / 4D) * (12.46D-(25.85083D)));
        }
        else if (tickAnim >= 23 && tickAnim < 27) {
            xx = -5.17D + (((tickAnim - 23D) / 4D) * (-4.96584D-(-5.17D)));
            yy = -14.86D + (((tickAnim - 23D) / 4D) * (-11.4386D-(-14.86D)));
            zz = 12.46D + (((tickAnim - 23D) / 4D) * (21.6621D-(12.46D)));
        }
        else if (tickAnim >= 27 && tickAnim < 30) {
            xx = -4.96584D + (((tickAnim - 27D) / 3D) * (-10.42714D-(-4.96584D)));
            yy = -11.4386D + (((tickAnim - 27D) / 3D) * (-22.83458D-(-11.4386D)));
            zz = 21.6621D + (((tickAnim - 27D) / 3D) * (25.06527D-(21.6621D)));
        }
        this.setRotateAngle(legL5, legL5.rotateAngleX + (float) Math.toRadians(xx), legL5.rotateAngleY + (float) Math.toRadians(yy), legL5.rotateAngleZ + (float) Math.toRadians(zz));
        this.setRotateAngle(legR, legR.rotateAngleX + (float) Math.toRadians(15-Math.sin((Math.PI/180)*((((double)tickAnim/30D)*1.5D)*60/0.25-115))*2.5), legR.rotateAngleY + (float) Math.toRadians(-22.5+Math.sin((Math.PI/180)*((((double)tickAnim/30D)*1.5D)*60/0.25+115))*2.5), legR.rotateAngleZ + (float) Math.toRadians(0));

        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 2.1D + (((tickAnim - 0D) / 3D) * (7.51647D-(2.1D)));
            yy = -20.98D + (((tickAnim - 0D) / 3D) * (-21.35869D-(-20.98D)));
            zz = -14.77D + (((tickAnim - 0D) / 3D) * (-26.14841D-(-14.77D)));
        }
        else if (tickAnim >= 3 && tickAnim < 7) {
            xx = 7.51647D + (((tickAnim - 3D) / 4D) * (3.29683D-(7.51647D)));
            yy = -21.35869D + (((tickAnim - 3D) / 4D) * (-9.50583D-(-21.35869D)));
            zz = -26.14841D + (((tickAnim - 3D) / 4D) * (-23.99052D-(-26.14841D)));
        }
        else if (tickAnim >= 7 && tickAnim < 10) {
            xx = 3.29683D + (((tickAnim - 7D) / 3D) * (-0.35767D-(3.29683D)));
            yy = -9.50583D + (((tickAnim - 7D) / 3D) * (-0.1371D-(-9.50583D)));
            zz = -23.99052D + (((tickAnim - 7D) / 3D) * (-22.38549D-(-23.99052D)));
        }
        else if (tickAnim >= 10 && tickAnim < 14) {
            xx = -0.35767D + (((tickAnim - 10D) / 4D) * (0.49858D-(-0.35767D)));
            yy = -0.1371D + (((tickAnim - 10D) / 4D) * (-20.56963D-(-0.1371D)));
            zz = -22.38549D + (((tickAnim - 10D) / 4D) * (-11.13958D-(-22.38549D)));
        }
        else if (tickAnim >= 14 && tickAnim < 18) {
            xx = 0.49858D + (((tickAnim - 14D) / 4D) * (5.30086D-(0.49858D)));
            yy = -20.56963D + (((tickAnim - 14D) / 4D) * (-21.80844D-(-20.56963D)));
            zz = -11.13958D + (((tickAnim - 14D) / 4D) * (-22.03073D-(-11.13958D)));
        }
        else if (tickAnim >= 18 && tickAnim < 22) {
            xx = 5.30086D + (((tickAnim - 18D) / 4D) * (1.65532D-(5.30086D)));
            yy = -21.80844D + (((tickAnim - 18D) / 4D) * (-9.8131D-(-21.80844D)));
            zz = -22.03073D + (((tickAnim - 18D) / 4D) * (-20.29444D-(-22.03073D)));
        }
        else if (tickAnim >= 22 && tickAnim < 25) {
            xx = 1.65532D + (((tickAnim - 22D) / 3D) * (-0.55385D-(1.65532D)));
            yy = -9.8131D + (((tickAnim - 22D) / 3D) * (-0.14608D-(-9.8131D)));
            zz = -20.29444D + (((tickAnim - 22D) / 3D) * (-21.36647D-(-20.29444D)));
        }
        else if (tickAnim >= 25 && tickAnim < 29) {
            xx = -0.55385D + (((tickAnim - 25D) / 4D) * (0.49858D-(-0.55385D)));
            yy = -0.14608D + (((tickAnim - 25D) / 4D) * (-20.56963D-(-0.14608D)));
            zz = -21.36647D + (((tickAnim - 25D) / 4D) * (-11.13958D-(-21.36647D)));
        }
        else if (tickAnim >= 29 && tickAnim < 30) {
            xx = 0.49858D + (((tickAnim - 29D) / 1D) * (2.1D-(0.49858D)));
            yy = -20.56963D + (((tickAnim - 29D) / 1D) * (-20.98D-(-20.56963D)));
            zz = -11.13958D + (((tickAnim - 29D) / 1D) * (-14.77D-(-11.13958D)));
        }
        this.setRotateAngle(legR2, legR2.rotateAngleX + (float) Math.toRadians(xx), legR2.rotateAngleY + (float) Math.toRadians(yy), legR2.rotateAngleZ + (float) Math.toRadians(zz));

        if (tickAnim >= 0 && tickAnim < 2) {
            xx = -4.54583D + (((tickAnim - 0D) / 2D) * (-5.91936D-(-4.54583D)));
            yy = 12.36273D + (((tickAnim - 0D) / 2D) * (16.28031D-(12.36273D)));
            zz = -22.90419D + (((tickAnim - 0D) / 2D) * (-23.8486D-(-22.90419D)));
        }
        else if (tickAnim >= 2 && tickAnim < 5) {
            xx = -5.91936D + (((tickAnim - 2D) / 3D) * (-0.62308D-(-5.91936D)));
            yy = 16.28031D + (((tickAnim - 2D) / 3D) * (-4.55556D-(16.28031D)));
            zz = -23.8486D + (((tickAnim - 2D) / 3D) * (0.98561D-(-23.8486D)));
        }
        else if (tickAnim >= 5 && tickAnim < 9) {
            xx = -0.62308D + (((tickAnim - 5D) / 4D) * (2.89839D-(-0.62308D)));
            yy = -4.55556D + (((tickAnim - 5D) / 4D) * (-7.08957D-(-4.55556D)));
            zz = 0.98561D + (((tickAnim - 5D) / 4D) * (-20.53449D-(0.98561D)));
        }
        else if (tickAnim >= 9 && tickAnim < 17) {
            xx = 2.89839D + (((tickAnim - 9D) / 8D) * (-5.17233D-(2.89839D)));
            yy = -7.08957D + (((tickAnim - 9D) / 8D) * (16.70281D-(-7.08957D)));
            zz = -20.53449D + (((tickAnim - 9D) / 8D) * (-18.81081D-(-20.53449D)));
        }
        else if (tickAnim >= 17 && tickAnim < 20) {
            xx = -5.17233D + (((tickAnim - 17D) / 3D) * (-0.62308D-(-5.17233D)));
            yy = 16.70281D + (((tickAnim - 17D) / 3D) * (-4.55556D-(16.70281D)));
            zz = -18.81081D + (((tickAnim - 17D) / 3D) * (0.98561D-(-18.81081D)));
        }
        else if (tickAnim >= 20 && tickAnim < 24) {
            xx = -0.62308D + (((tickAnim - 20D) / 4D) * (2.62926D-(-0.62308D)));
            yy = -4.55556D + (((tickAnim - 20D) / 4D) * (-7.15002D-(-4.55556D)));
            zz = 0.98561D + (((tickAnim - 20D) / 4D) * (-19.50067D-(0.98561D)));
        }
        else if (tickAnim >= 24 && tickAnim < 30) {
            xx = 2.62926D + (((tickAnim - 24D) / 6D) * (-4.54583D-(2.62926D)));
            yy = -7.15002D + (((tickAnim - 24D) / 6D) * (12.36273D-(-7.15002D)));
            zz = -19.50067D + (((tickAnim - 24D) / 6D) * (-22.90419D-(-19.50067D)));
        }
        this.setRotateAngle(legR3, legR3.rotateAngleX + (float) Math.toRadians(xx), legR3.rotateAngleY + (float) Math.toRadians(yy), legR3.rotateAngleZ + (float) Math.toRadians(zz));

        if (tickAnim >= 0 && tickAnim < 4) {
            xx = 0D + (((tickAnim - 0D) / 4D) * (-0.38466D-(0D)));
            yy = -11.5D + (((tickAnim - 0D) / 4D) * (-12.74161D-(-11.5D)));
            zz = 0D + (((tickAnim - 0D) / 4D) * (2.5294D-(0D)));
        }
        else if (tickAnim >= 4 && tickAnim < 8) {
            xx = -0.38466D + (((tickAnim - 4D) / 4D) * (0D-(-0.38466D)));
            yy = -12.74161D + (((tickAnim - 4D) / 4D) * (-14D-(-12.74161D)));
            zz = 2.5294D + (((tickAnim - 4D) / 4D) * (0D-(2.5294D)));
        }
        else if (tickAnim >= 8 && tickAnim < 11) {
            xx = 0D + (((tickAnim - 8D) / 3D) * (0.39397D-(0D)));
            yy = -14D + (((tickAnim - 8D) / 3D) * (-12.94974D-(-14D)));
            zz = 0D + (((tickAnim - 8D) / 3D) * (-2.53083D-(0D)));
        }
        else if (tickAnim >= 11 && tickAnim < 15) {
            xx = 0.39397D + (((tickAnim - 11D) / 4D) * (0D-(0.39397D)));
            yy = -12.94974D + (((tickAnim - 11D) / 4D) * (-11.5D-(-12.94974D)));
            zz = -2.53083D + (((tickAnim - 11D) / 4D) * (0D-(-2.53083D)));
        }
        else if (tickAnim >= 15 && tickAnim < 18) {
            xx = 0D + (((tickAnim - 15D) / 3D) * (-0.37536D-(0D)));
            yy = -11.5D + (((tickAnim - 15D) / 3D) * (-12.53348D-(-11.5D)));
            zz = 0D + (((tickAnim - 15D) / 3D) * (2.528D-(0D)));
        }
        else if (tickAnim >= 18 && tickAnim < 23) {
            xx = -0.37536D + (((tickAnim - 18D) / 5D) * (0D-(-0.37536D)));
            yy = -12.53348D + (((tickAnim - 18D) / 5D) * (-14D-(-12.53348D)));
            zz = 2.528D + (((tickAnim - 18D) / 5D) * (0D-(2.528D)));
        }
        else if (tickAnim >= 23 && tickAnim < 26) {
            xx = 0D + (((tickAnim - 23D) / 3D) * (0.39397D-(0D)));
            yy = -14D + (((tickAnim - 23D) / 3D) * (-12.94974D-(-14D)));
            zz = 0D + (((tickAnim - 23D) / 3D) * (-2.53083D-(0D)));
        }
        else if (tickAnim >= 26 && tickAnim < 30) {
            xx = 0.39397D + (((tickAnim - 26D) / 4D) * (0D-(0.39397D)));
            yy = -12.94974D + (((tickAnim - 26D) / 4D) * (-11.5D-(-12.94974D)));
            zz = -2.53083D + (((tickAnim - 26D) / 4D) * (0D-(-2.53083D)));
        }
        this.setRotateAngle(legR4, legR4.rotateAngleX + (float) Math.toRadians(xx), legR4.rotateAngleY + (float) Math.toRadians(yy), legR4.rotateAngleZ + (float) Math.toRadians(zz));

        if (tickAnim >= 0 && tickAnim < 4) {
            xx = -5.17D + (((tickAnim - 0D) / 4D) * (-5.14126D-(-5.17D)));
            yy = 14.86D + (((tickAnim - 0D) / 4D) * (11.21088D-(14.86D)));
            zz = -12.46D + (((tickAnim - 0D) / 4D) * (-24.65863D-(-12.46D)));
        }
        else if (tickAnim >= 4 && tickAnim < 12) {
            xx = -5.14126D + (((tickAnim - 4D) / 8D) * (-16.09306D-(-5.14126D)));
            yy = 11.21088D + (((tickAnim - 4D) / 8D) * (34.15698D-(11.21088D)));
            zz = -24.65863D + (((tickAnim - 4D) / 8D) * (-28.2805D-(-24.65863D)));
        }
        else if (tickAnim >= 12 && tickAnim < 15) {
            xx = -16.09306D + (((tickAnim - 12D) / 3D) * (-5.16627D-(-16.09306D)));
            yy = 34.15698D + (((tickAnim - 12D) / 3D) * (14.85972D-(34.15698D)));
            zz = -28.2805D + (((tickAnim - 12D) / 3D) * (-12.45622D-(-28.2805D)));
        }
        else if (tickAnim >= 15 && tickAnim < 19) {
            xx = -5.16627D + (((tickAnim - 15D) / 4D) * (-4.79473D-(-5.16627D)));
            yy = 14.85972D + (((tickAnim - 15D) / 4D) * (11.63898D-(14.85972D)));
            zz = -12.45622D + (((tickAnim - 15D) / 4D) * (-18.91412D-(-12.45622D)));
        }
        else if (tickAnim >= 19 && tickAnim < 27) {
            xx = -4.79473D + (((tickAnim - 19D) / 8D) * (-15.49523D-(-4.79473D)));
            yy = 11.63898D + (((tickAnim - 19D) / 8D) * (34.48246D-(11.63898D)));
            zz = -18.91412D + (((tickAnim - 19D) / 8D) * (-26.93368D-(-18.91412D)));
        }
        else if (tickAnim >= 27 && tickAnim < 30) {
            xx = -15.49523D + (((tickAnim - 27D) / 3D) * (-5.17D-(-15.49523D)));
            yy = 34.48246D + (((tickAnim - 27D) / 3D) * (14.86D-(34.48246D)));
            zz = -26.93368D + (((tickAnim - 27D) / 3D) * (-12.46D-(-26.93368D)));
        }
        this.setRotateAngle(legR5, legR5.rotateAngleX + (float) Math.toRadians(xx), legR5.rotateAngleY + (float) Math.toRadians(yy), legR5.rotateAngleZ + (float) Math.toRadians(zz));
        this.setRotateAngle(TergiteA1, TergiteA1.rotateAngleX + (float) Math.toRadians(-3+Math.sin((Math.PI/180)*((((double)tickAnim/30D)*1.5D)*120/0.5-30))*0.2), TergiteA1.rotateAngleY + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/30D)*1.5D)*120/0.5+60))*0.2), TergiteA1.rotateAngleZ + (float) Math.toRadians(0));
        this.setRotateAngle(TergiteA2, TergiteA2.rotateAngleX + (float) Math.toRadians(-2+Math.sin((Math.PI/180)*((((double)tickAnim/30D)*1.5D)*120/0.5-60))*0.3), TergiteA2.rotateAngleY + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/30D)*1.5D)*120/0.5+30))*0.3), TergiteA2.rotateAngleZ + (float) Math.toRadians(0));
        this.setRotateAngle(TergiteA3, TergiteA3.rotateAngleX + (float) Math.toRadians(-1+Math.sin((Math.PI/180)*((((double)tickAnim/30D)*1.5D)*120/0.5-60))*0.4), TergiteA3.rotateAngleY + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/30D)*1.5D)*120/0.5+30))*0.4), TergiteA3.rotateAngleZ + (float) Math.toRadians(0));
        this.setRotateAngle(TergiteA4, TergiteA4.rotateAngleX + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/30D)*1.5D)*120/0.5-90))*0.5), TergiteA4.rotateAngleY + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/30D)*1.5D)*120/0.5))*0.5), TergiteA4.rotateAngleZ + (float) Math.toRadians(0));
        this.setRotateAngle(TergiteA5, TergiteA5.rotateAngleX + (float) Math.toRadians(1+Math.sin((Math.PI/180)*((((double)tickAnim/30D)*1.5D)*120/0.5-120))*0.6), TergiteA5.rotateAngleY + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/30D)*1.5D)*120/0.5-30))*0.6), TergiteA5.rotateAngleZ + (float) Math.toRadians(0));
        this.setRotateAngle(TergiteA6, TergiteA6.rotateAngleX + (float) Math.toRadians(2+Math.sin((Math.PI/180)*((((double)tickAnim/30D)*1.5D)*120/0.5-180))*0.8), TergiteA6.rotateAngleY + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/30D)*1.5D)*120/0.5-90))*0.8), TergiteA6.rotateAngleZ + (float) Math.toRadians(0));
        this.setRotateAngle(Telson, Telson.rotateAngleX + (float) Math.toRadians(3+Math.sin((Math.PI/180)*((((double)tickAnim/30D)*1.5D)*120/0.5-240))), Telson.rotateAngleY + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/30D)*1.5D)*120/0.5-150))), Telson.rotateAngleZ + (float) Math.toRadians(0));
    }
    public void animSwim(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime) {
        EntityPrehistoricFloraCiurcopterus entity = (EntityPrehistoricFloraCiurcopterus) entitylivingbaseIn;
        int animCycle = 20;
        double tickAnim = (entity.ticksExisted + entity.getTickOffset()) - (int) (Math.floor((double) (entity.ticksExisted + entity.getTickOffset()) / (double) animCycle) * (double) animCycle) + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;

        if (tickAnim >= 0 && tickAnim < 5) {
            xx = -24.69416D + (((tickAnim - 0D) / 5D) * (-31.71222D-(-24.69416D)));
            yy = 21.3156D + (((tickAnim - 0D) / 5D) * (14.29991D-(21.3156D)));
            zz = -16.13641D + (((tickAnim - 0D) / 5D) * (12.97152D-(-16.13641D)));
        }
        else if (tickAnim >= 5 && tickAnim < 10) {
            xx = -31.71222D + (((tickAnim - 5D) / 5D) * (-13.4577D-(-31.71222D)));
            yy = 14.29991D + (((tickAnim - 5D) / 5D) * (-26.88196D-(14.29991D)));
            zz = 12.97152D + (((tickAnim - 5D) / 5D) * (23.59815D-(12.97152D)));
        }
        else if (tickAnim >= 10 && tickAnim < 15) {
            xx = -13.4577D + (((tickAnim - 10D) / 5D) * (23.93D-(-13.4577D)));
            yy = -26.88196D + (((tickAnim - 10D) / 5D) * (4.87D-(-26.88196D)));
            zz = 23.59815D + (((tickAnim - 10D) / 5D) * (-3.9D-(23.59815D)));
        }
        else if (tickAnim >= 15 && tickAnim < 18) {
            xx = 23.93D + (((tickAnim - 15D) / 3D) * (11.93D-(23.93D)));
            yy = 4.87D + (((tickAnim - 15D) / 3D) * (17.81D-(4.87D)));
            zz = -3.9D + (((tickAnim - 15D) / 3D) * (-13.03D-(-3.9D)));
        }
        else if (tickAnim >= 18 && tickAnim < 20) {
            xx = 11.93D + (((tickAnim - 18D) / 2D) * (-24.69416D-(11.93D)));
            yy = 17.81D + (((tickAnim - 18D) / 2D) * (21.3156D-(17.81D)));
            zz = -13.03D + (((tickAnim - 18D) / 2D) * (-16.13641D-(-13.03D)));
        }
        this.setRotateAngle(legR4, legR4.rotateAngleX + (float) Math.toRadians(xx), legR4.rotateAngleY + (float) Math.toRadians(yy), legR4.rotateAngleZ + (float) Math.toRadians(zz));

        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 32.88536D + (((tickAnim - 0D) / 3D) * (23D-(32.88536D)));
            yy = 11.89386D + (((tickAnim - 0D) / 3D) * (34.83D-(11.89386D)));
            zz = 8.39781D + (((tickAnim - 0D) / 3D) * (-1.2D-(8.39781D)));
        }
        else if (tickAnim >= 3 && tickAnim < 5) {
            xx = 23D + (((tickAnim - 3D) / 2D) * (-8.5D-(23D)));
            yy = 34.83D + (((tickAnim - 3D) / 2D) * (27.5D-(34.83D)));
            zz = -1.2D + (((tickAnim - 3D) / 2D) * (-2D-(-1.2D)));
        }
        else if (tickAnim >= 5 && tickAnim < 8) {
            xx = -8.5D + (((tickAnim - 5D) / 3D) * (-16.5D-(-8.5D)));
            yy = 27.5D + (((tickAnim - 5D) / 3D) * (-9.17D-(27.5D)));
            zz = -2D + (((tickAnim - 5D) / 3D) * (-2D-(-2D)));
        }
        else if (tickAnim >= 8 && tickAnim < 10) {
            xx = -16.5D + (((tickAnim - 8D) / 2D) * (0D-(-16.5D)));
            yy = -9.17D + (((tickAnim - 8D) / 2D) * (-33D-(-9.17D)));
            zz = -2D + (((tickAnim - 8D) / 2D) * (0D-(-2D)));
        }
        else if (tickAnim >= 10 && tickAnim < 13) {
            xx = 0D + (((tickAnim - 10D) / 3D) * (17.72785D-(0D)));
            yy = -33D + (((tickAnim - 10D) / 3D) * (-41.89951D-(-33D)));
            zz = 0D + (((tickAnim - 10D) / 3D) * (7.69919D-(0D)));
        }
        else if (tickAnim >= 13 && tickAnim < 14) {
            xx = 17.72785D + (((tickAnim - 13D) / 1D) * (25.5D-(17.72785D)));
            yy = -41.89951D + (((tickAnim - 13D) / 1D) * (-39.83333D-(-41.89951D)));
            zz = 7.69919D + (((tickAnim - 13D) / 1D) * (7D-(7.69919D)));
        }
        else if (tickAnim >= 14 && tickAnim < 18) {
            xx = 25.5D + (((tickAnim - 14D) / 4D) * (31.5D-(25.5D)));
            yy = -39.83333D + (((tickAnim - 14D) / 4D) * (-23.91D-(-39.83333D)));
            zz = 7D + (((tickAnim - 14D) / 4D) * (-1D-(7D)));
        }
        else if (tickAnim >= 18 && tickAnim < 20) {
            xx = 31.5D + (((tickAnim - 18D) / 2D) * (32.88536D-(31.5D)));
            yy = -23.91D + (((tickAnim - 18D) / 2D) * (11.89386D-(-23.91D)));
            zz = -1D + (((tickAnim - 18D) / 2D) * (8.39781D-(-1D)));
        }
        this.setRotateAngle(legRs, legRs.rotateAngleX + (float) Math.toRadians(xx), legRs.rotateAngleY + (float) Math.toRadians(yy), legRs.rotateAngleZ + (float) Math.toRadians(zz));
        this.setRotateAngle(Body, Body.rotateAngleX + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D)*1D)*90/0.25+120))), Body.rotateAngleY + (float) Math.toRadians(0), Body.rotateAngleZ + (float) Math.toRadians(0));
        this.Body.offsetX = (float) Math.toRadians(0);
        this.Body.offsetY = (float) Math.toRadians(3.5+Math.sin((Math.PI/180)*((((double)tickAnim/20D)*1D)*90/0.25+150))/4);
        this.Body.offsetZ = (float) Math.toRadians(0);
        this.setRotateAngle(cheliceraL, cheliceraL.rotateAngleX + (float) Math.toRadians(-10), cheliceraL.rotateAngleY + (float) Math.toRadians(22.5), cheliceraL.rotateAngleZ + (float) Math.toRadians(0));
        this.cheliceraL.offsetX = (float) Math.toRadians(-0.75);
        this.cheliceraL.offsetY = (float) Math.toRadians(-0.3);
        this.cheliceraL.offsetZ = (float) Math.toRadians(0);
        this.setRotateAngle(clawbaseL, clawbaseL.rotateAngleX + (float) Math.toRadians(172.60809), clawbaseL.rotateAngleY + (float) Math.toRadians(2.39542), clawbaseL.rotateAngleZ + (float) Math.toRadians(-1.6203));
        this.clawbaseL.offsetX = (float) Math.toRadians(0.3);
        this.clawbaseL.offsetY = (float) Math.toRadians(-0.7);
        this.clawbaseL.offsetZ = (float) Math.toRadians(0.1);
        this.setRotateAngle(clawL, clawL.rotateAngleX + (float) Math.toRadians(0), clawL.rotateAngleY + (float) Math.toRadians(30), clawL.rotateAngleZ + (float) Math.toRadians(0));
        this.setRotateAngle(cheliceraR, cheliceraR.rotateAngleX + (float) Math.toRadians(-10), cheliceraR.rotateAngleY + (float) Math.toRadians(-22.5), cheliceraR.rotateAngleZ + (float) Math.toRadians(0));
        this.cheliceraR.offsetX = (float) Math.toRadians(0.75);
        this.cheliceraR.offsetY = (float) Math.toRadians(-0.3);
        this.cheliceraR.offsetZ = (float) Math.toRadians(0);
        this.setRotateAngle(clawbaseR, clawbaseR.rotateAngleX + (float) Math.toRadians(172.60809), clawbaseR.rotateAngleY + (float) Math.toRadians(-2.39542), clawbaseR.rotateAngleZ + (float) Math.toRadians(1.6203));
        this.clawbaseR.offsetX = (float) Math.toRadians(-0.3);
        this.clawbaseR.offsetY = (float) Math.toRadians(-0.7);
        this.clawbaseR.offsetZ = (float) Math.toRadians(0.1);
        this.setRotateAngle(clawR, clawR.rotateAngleX + (float) Math.toRadians(0), clawR.rotateAngleY + (float) Math.toRadians(-30), clawR.rotateAngleZ + (float) Math.toRadians(0));

        if (tickAnim >= 0 && tickAnim < 10) {
            xx = -20.94102D + (((tickAnim - 0D) / 10D) * (-23.73649D-(-20.94102D)));
            yy = -40.78947D + (((tickAnim - 0D) / 10D) * (-39.49176D-(-40.78947D)));
            zz = 30.36119D + (((tickAnim - 0D) / 10D) * (32.16366D-(30.36119D)));
        }
        else if (tickAnim >= 10 && tickAnim < 20) {
            xx = -23.73649D + (((tickAnim - 10D) / 10D) * (-20.94102D-(-23.73649D)));
            yy = -39.49176D + (((tickAnim - 10D) / 10D) * (-40.78947D-(-39.49176D)));
            zz = 32.16366D + (((tickAnim - 10D) / 10D) * (30.36119D-(32.16366D)));
        }
        this.setRotateAngle(legL, legL.rotateAngleX + (float) Math.toRadians(xx), legL.rotateAngleY + (float) Math.toRadians(yy), legL.rotateAngleZ + (float) Math.toRadians(zz));

        if (tickAnim >= 0 && tickAnim < 10) {
            xx = -20.94102D + (((tickAnim - 0D) / 10D) * (-18.0372D-(-20.94102D)));
            yy = -40.78947D + (((tickAnim - 0D) / 10D) * (-42.01708D-(-40.78947D)));
            zz = 35.86119D + (((tickAnim - 0D) / 10D) * (33.9404D-(35.86119D)));
        }
        else if (tickAnim >= 10 && tickAnim < 20) {
            xx = -18.0372D + (((tickAnim - 10D) / 10D) * (-20.94102D-(-18.0372D)));
            yy = -42.01708D + (((tickAnim - 10D) / 10D) * (-40.78947D-(-42.01708D)));
            zz = 33.9404D + (((tickAnim - 10D) / 10D) * (35.86119D-(33.9404D)));
        }
        this.setRotateAngle(legL2, legL2.rotateAngleX + (float) Math.toRadians(xx), legL2.rotateAngleY + (float) Math.toRadians(yy), legL2.rotateAngleZ + (float) Math.toRadians(zz));

        if (tickAnim >= 0 && tickAnim < 10) {
            xx = -20.94102D + (((tickAnim - 0D) / 10D) * (-22.29118D-(-20.94102D)));
            yy = -40.78947D + (((tickAnim - 0D) / 10D) * (-40.44109D-(-40.78947D)));
            zz = 38.36119D + (((tickAnim - 0D) / 10D) * (37.43648D-(38.36119D)));
        }
        else if (tickAnim >= 10 && tickAnim < 20) {
            xx = -22.29118D + (((tickAnim - 10D) / 10D) * (-20.94102D-(-22.29118D)));
            yy = -40.44109D + (((tickAnim - 10D) / 10D) * (-40.78947D-(-40.44109D)));
            zz = 37.43648D + (((tickAnim - 10D) / 10D) * (38.36119D-(37.43648D)));
        }
        this.setRotateAngle(legL3, legL3.rotateAngleX + (float) Math.toRadians(xx), legL3.rotateAngleY + (float) Math.toRadians(yy), legL3.rotateAngleZ + (float) Math.toRadians(zz));

        if (tickAnim >= 0 && tickAnim < 5) {
            xx = -24.69416D + (((tickAnim - 0D) / 5D) * (-31.71222D-(-24.69416D)));
            yy = -21.3156D + (((tickAnim - 0D) / 5D) * (-14.29991D-(-21.3156D)));
            zz = 16.13641D + (((tickAnim - 0D) / 5D) * (-12.97152D-(16.13641D)));
        }
        else if (tickAnim >= 5 && tickAnim < 10) {
            xx = -31.71222D + (((tickAnim - 5D) / 5D) * (-13.4577D-(-31.71222D)));
            yy = -14.29991D + (((tickAnim - 5D) / 5D) * (26.88196D-(-14.29991D)));
            zz = -12.97152D + (((tickAnim - 5D) / 5D) * (-23.59815D-(-12.97152D)));
        }
        else if (tickAnim >= 10 && tickAnim < 15) {
            xx = -13.4577D + (((tickAnim - 10D) / 5D) * (23.93D-(-13.4577D)));
            yy = 26.88196D + (((tickAnim - 10D) / 5D) * (-4.87D-(26.88196D)));
            zz = -23.59815D + (((tickAnim - 10D) / 5D) * (3.9D-(-23.59815D)));
        }
        else if (tickAnim >= 15 && tickAnim < 18) {
            xx = 23.93D + (((tickAnim - 15D) / 3D) * (11.93D-(23.93D)));
            yy = -4.87D + (((tickAnim - 15D) / 3D) * (-17.81D-(-4.87D)));
            zz = 3.9D + (((tickAnim - 15D) / 3D) * (13.03D-(3.9D)));
        }
        else if (tickAnim >= 18 && tickAnim < 20) {
            xx = 11.93D + (((tickAnim - 18D) / 2D) * (-24.69416D-(11.93D)));
            yy = -17.81D + (((tickAnim - 18D) / 2D) * (-21.3156D-(-17.81D)));
            zz = 13.03D + (((tickAnim - 18D) / 2D) * (16.13641D-(13.03D)));
        }
        this.setRotateAngle(legL4, legL4.rotateAngleX + (float) Math.toRadians(xx), legL4.rotateAngleY + (float) Math.toRadians(yy), legL4.rotateAngleZ + (float) Math.toRadians(zz));

        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 32.88536D + (((tickAnim - 0D) / 3D) * (23D-(32.88536D)));
            yy = -11.89386D + (((tickAnim - 0D) / 3D) * (-34.83D-(-11.89386D)));
            zz = -8.39781D + (((tickAnim - 0D) / 3D) * (1.2D-(-8.39781D)));
        }
        else if (tickAnim >= 3 && tickAnim < 5) {
            xx = 23D + (((tickAnim - 3D) / 2D) * (-8.5D-(23D)));
            yy = -34.83D + (((tickAnim - 3D) / 2D) * (-27.5D-(-34.83D)));
            zz = 1.2D + (((tickAnim - 3D) / 2D) * (2D-(1.2D)));
        }
        else if (tickAnim >= 5 && tickAnim < 8) {
            xx = -8.5D + (((tickAnim - 5D) / 3D) * (-16.5D-(-8.5D)));
            yy = -27.5D + (((tickAnim - 5D) / 3D) * (9.17D-(-27.5D)));
            zz = 2D + (((tickAnim - 5D) / 3D) * (2D-(2D)));
        }
        else if (tickAnim >= 8 && tickAnim < 10) {
            xx = -16.5D + (((tickAnim - 8D) / 2D) * (0D-(-16.5D)));
            yy = 9.17D + (((tickAnim - 8D) / 2D) * (33D-(9.17D)));
            zz = 2D + (((tickAnim - 8D) / 2D) * (0D-(2D)));
        }
        else if (tickAnim >= 10 && tickAnim < 13) {
            xx = 0D + (((tickAnim - 10D) / 3D) * (17.72785D-(0D)));
            yy = 33D + (((tickAnim - 10D) / 3D) * (41.89951D-(33D)));
            zz = 0D + (((tickAnim - 10D) / 3D) * (-7.69919D-(0D)));
        }
        else if (tickAnim >= 13 && tickAnim < 14) {
            xx = 17.72785D + (((tickAnim - 13D) / 1D) * (25.5D-(17.72785D)));
            yy = 41.89951D + (((tickAnim - 13D) / 1D) * (39.83333D-(41.89951D)));
            zz = -7.69919D + (((tickAnim - 13D) / 1D) * (-7D-(-7.69919D)));
        }
        else if (tickAnim >= 14 && tickAnim < 18) {
            xx = 25.5D + (((tickAnim - 14D) / 4D) * (31.5D-(25.5D)));
            yy = 39.83333D + (((tickAnim - 14D) / 4D) * (23.91D-(39.83333D)));
            zz = -7D + (((tickAnim - 14D) / 4D) * (1D-(-7D)));
        }
        else if (tickAnim >= 18 && tickAnim < 20) {
            xx = 31.5D + (((tickAnim - 18D) / 2D) * (32.88536D-(31.5D)));
            yy = 23.91D + (((tickAnim - 18D) / 2D) * (-11.89386D-(23.91D)));
            zz = 1D + (((tickAnim - 18D) / 2D) * (-8.39781D-(1D)));
        }
        this.setRotateAngle(legLs, legLs.rotateAngleX + (float) Math.toRadians(xx), legLs.rotateAngleY + (float) Math.toRadians(yy), legLs.rotateAngleZ + (float) Math.toRadians(zz));

        if (tickAnim >= 0 && tickAnim < 10) {
            xx = -22.4211D + (((tickAnim - 0D) / 10D) * (-18.0372D-(-22.4211D)));
            yy = -39.8942D + (((tickAnim - 0D) / 10D) * (-42.01708D-(-39.8942D)));
            zz = 46.12505D + (((tickAnim - 0D) / 10D) * (41.4404D-(46.12505D)));
        }
        else if (tickAnim >= 10 && tickAnim < 20) {
            xx = -18.0372D + (((tickAnim - 10D) / 10D) * (-22.4211D-(-18.0372D)));
            yy = -42.01708D + (((tickAnim - 10D) / 10D) * (-39.8942D-(-42.01708D)));
            zz = 41.4404D + (((tickAnim - 10D) / 10D) * (46.12505D-(41.4404D)));
        }
        this.setRotateAngle(legL5, legL5.rotateAngleX + (float) Math.toRadians(xx), legL5.rotateAngleY + (float) Math.toRadians(yy), legL5.rotateAngleZ + (float) Math.toRadians(zz));

        if (tickAnim >= 0 && tickAnim < 10) {
            xx = -20.94102D + (((tickAnim - 0D) / 10D) * (-23.73649D-(-20.94102D)));
            yy = 40.78947D + (((tickAnim - 0D) / 10D) * (39.49176D-(40.78947D)));
            zz = -30.36119D + (((tickAnim - 0D) / 10D) * (-32.16366D-(-30.36119D)));
        }
        else if (tickAnim >= 10 && tickAnim < 20) {
            xx = -23.73649D + (((tickAnim - 10D) / 10D) * (-20.94102D-(-23.73649D)));
            yy = 39.49176D + (((tickAnim - 10D) / 10D) * (40.78947D-(39.49176D)));
            zz = -32.16366D + (((tickAnim - 10D) / 10D) * (-30.36119D-(-32.16366D)));
        }
        this.setRotateAngle(legR, legR.rotateAngleX + (float) Math.toRadians(xx), legR.rotateAngleY + (float) Math.toRadians(yy), legR.rotateAngleZ + (float) Math.toRadians(zz));

        if (tickAnim >= 0 && tickAnim < 10) {
            xx = -20.94102D + (((tickAnim - 0D) / 10D) * (-18.0372D-(-20.94102D)));
            yy = 40.78947D + (((tickAnim - 0D) / 10D) * (42.01708D-(40.78947D)));
            zz = -35.36119D + (((tickAnim - 0D) / 10D) * (-33.4404D-(-35.36119D)));
        }
        else if (tickAnim >= 10 && tickAnim < 20) {
            xx = -18.0372D + (((tickAnim - 10D) / 10D) * (-20.94102D-(-18.0372D)));
            yy = 42.01708D + (((tickAnim - 10D) / 10D) * (40.78947D-(42.01708D)));
            zz = -33.4404D + (((tickAnim - 10D) / 10D) * (-35.36119D-(-33.4404D)));
        }
        this.setRotateAngle(legR2, legR2.rotateAngleX + (float) Math.toRadians(xx), legR2.rotateAngleY + (float) Math.toRadians(yy), legR2.rotateAngleZ + (float) Math.toRadians(zz));

        if (tickAnim >= 0 && tickAnim < 10) {
            xx = -20.94102D + (((tickAnim - 0D) / 10D) * (-22.29118D-(-20.94102D)));
            yy = 40.78947D + (((tickAnim - 0D) / 10D) * (40.44109D-(40.78947D)));
            zz = -38.36119D + (((tickAnim - 0D) / 10D) * (-37.43648D-(-38.36119D)));
        }
        else if (tickAnim >= 10 && tickAnim < 20) {
            xx = -22.29118D + (((tickAnim - 10D) / 10D) * (-20.94102D-(-22.29118D)));
            yy = 40.44109D + (((tickAnim - 10D) / 10D) * (40.78947D-(40.44109D)));
            zz = -37.43648D + (((tickAnim - 10D) / 10D) * (-38.36119D-(-37.43648D)));
        }
        this.setRotateAngle(legR3, legR3.rotateAngleX + (float) Math.toRadians(xx), legR3.rotateAngleY + (float) Math.toRadians(yy), legR3.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 10) {
            xx = -22.4211D + (((tickAnim - 0D) / 10D) * (-18.0372D-(-22.4211D)));
            yy = 39.8942D + (((tickAnim - 0D) / 10D) * (42.01708D-(39.8942D)));
            zz = -46.12505D + (((tickAnim - 0D) / 10D) * (-41.4404D-(-46.12505D)));
        }
        else if (tickAnim >= 10 && tickAnim < 20) {
            xx = -18.0372D + (((tickAnim - 10D) / 10D) * (-22.4211D-(-18.0372D)));
            yy = 42.01708D + (((tickAnim - 10D) / 10D) * (39.8942D-(42.01708D)));
            zz = -41.4404D + (((tickAnim - 10D) / 10D) * (-46.12505D-(-41.4404D)));
        }
        this.setRotateAngle(legR5, legR5.rotateAngleX + (float) Math.toRadians(xx), legR5.rotateAngleY + (float) Math.toRadians(yy), legR5.rotateAngleZ + (float) Math.toRadians(zz));
        this.setRotateAngle(TergiteA1, TergiteA1.rotateAngleX + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D)*1D)*90/0.25-30))*3), TergiteA1.rotateAngleY + (float) Math.toRadians(0), TergiteA1.rotateAngleZ + (float) Math.toRadians(0));
        this.setRotateAngle(TergiteA2, TergiteA2.rotateAngleX + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D)*1D)*90/0.25-60))*4), TergiteA2.rotateAngleY + (float) Math.toRadians(0), TergiteA2.rotateAngleZ + (float) Math.toRadians(0));
        this.setRotateAngle(TergiteA3, TergiteA3.rotateAngleX + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D)*1D)*90/0.25-90))*5), TergiteA3.rotateAngleY + (float) Math.toRadians(0), TergiteA3.rotateAngleZ + (float) Math.toRadians(0));
        this.setRotateAngle(TergiteA4, TergiteA4.rotateAngleX + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D)*1D)*90/0.25-120))*6), TergiteA4.rotateAngleY + (float) Math.toRadians(0), TergiteA4.rotateAngleZ + (float) Math.toRadians(0));
        this.setRotateAngle(TergiteA5, TergiteA5.rotateAngleX + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D)*1D)*90/0.25-150))*7), TergiteA5.rotateAngleY + (float) Math.toRadians(0), TergiteA5.rotateAngleZ + (float) Math.toRadians(0));
        this.setRotateAngle(TergiteA6, TergiteA6.rotateAngleX + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D)*1D)*90/0.25-180))*8), TergiteA6.rotateAngleY + (float) Math.toRadians(0), TergiteA6.rotateAngleZ + (float) Math.toRadians(0));
        this.setRotateAngle(Telson, Telson.rotateAngleX + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D)*1D)*90/0.25-240))*10), Telson.rotateAngleY + (float) Math.toRadians(0), Telson.rotateAngleZ + (float) Math.toRadians(0));
    }

    public void animFast(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime) {
        EntityPrehistoricFloraCiurcopterus entity = (EntityPrehistoricFloraCiurcopterus) entitylivingbaseIn;
        int animCycle = 10;
        double tickAnim = (entity.ticksExisted + entity.getTickOffset()) - (int) (Math.floor((double) (entity.ticksExisted + entity.getTickOffset()) / (double) animCycle) * (double) animCycle) + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;

        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 1.04522D + (((tickAnim - 0D) / 3D) * (-12.71222D-(1.04522D)));
            yy = 19.47912D + (((tickAnim - 0D) / 3D) * (3.29991D-(19.47912D)));
            zz = -27.69967D + (((tickAnim - 0D) / 3D) * (28.97152D-(-27.69967D)));
        }
        else if (tickAnim >= 3 && tickAnim < 5) {
            xx = -12.71222D + (((tickAnim - 3D) / 2D) * (-1.4577D-(-12.71222D)));
            yy = 3.29991D + (((tickAnim - 3D) / 2D) * (-26.88196D-(3.29991D)));
            zz = 28.97152D + (((tickAnim - 3D) / 2D) * (23.59815D-(28.97152D)));
        }
        else if (tickAnim >= 5 && tickAnim < 8) {
            xx = -1.4577D + (((tickAnim - 5D) / 3D) * (23.93D-(-1.4577D)));
            yy = -26.88196D + (((tickAnim - 5D) / 3D) * (4.87D-(-26.88196D)));
            zz = 23.59815D + (((tickAnim - 5D) / 3D) * (-11.9D-(23.59815D)));
        }
        else if (tickAnim >= 8 && tickAnim < 8) {
            xx = 23.93D + (((tickAnim - 8D) / 0D) * (20.93D-(23.93D)));
            yy = 4.87D + (((tickAnim - 8D) / 0D) * (17.81D-(4.87D)));
            zz = -11.9D + (((tickAnim - 8D) / 0D) * (-25.03D-(-11.9D)));
        }
        else if (tickAnim >= 8 && tickAnim < 10) {
            xx = 20.93D + (((tickAnim - 8D) / 2D) * (1.04522D-(20.93D)));
            yy = 17.81D + (((tickAnim - 8D) / 2D) * (19.47912D-(17.81D)));
            zz = -25.03D + (((tickAnim - 8D) / 2D) * (-27.69967D-(-25.03D)));
        }
        this.setRotateAngle(legR4, legR4.rotateAngleX + (float) Math.toRadians(xx), legR4.rotateAngleY + (float) Math.toRadians(yy), legR4.rotateAngleZ + (float) Math.toRadians(zz));

        if (tickAnim >= 0 && tickAnim < 1) {
            xx = 0D + (((tickAnim - 0D) / 1D) * (-14D-(0D)));
            yy = 22.5D + (((tickAnim - 0D) / 1D) * (34.83D-(22.5D)));
            zz = 0D + (((tickAnim - 0D) / 1D) * (-1.2D-(0D)));
        }
        else if (tickAnim >= 1 && tickAnim < 3) {
            xx = -14D + (((tickAnim - 1D) / 2D) * (-22.5D-(-14D)));
            yy = 34.83D + (((tickAnim - 1D) / 2D) * (27.5D-(34.83D)));
            zz = -1.2D + (((tickAnim - 1D) / 2D) * (-2D-(-1.2D)));
        }
        else if (tickAnim >= 3 && tickAnim < 3) {
            xx = -22.5D + (((tickAnim - 3D) / 0D) * (-16.5D-(-22.5D)));
            yy = 27.5D + (((tickAnim - 3D) / 0D) * (-9.17D-(27.5D)));
            zz = -2D + (((tickAnim - 3D) / 0D) * (-2D-(-2D)));
        }
        else if (tickAnim >= 3 && tickAnim < 5) {
            xx = -16.5D + (((tickAnim - 3D) / 2D) * (0D-(-16.5D)));
            yy = -9.17D + (((tickAnim - 3D) / 2D) * (-33D-(-9.17D)));
            zz = -2D + (((tickAnim - 3D) / 2D) * (0D-(-2D)));
        }
        else if (tickAnim >= 5 && tickAnim < 6) {
            xx = 0D + (((tickAnim - 5D) / 1D) * (17.72785D-(0D)));
            yy = -33D + (((tickAnim - 5D) / 1D) * (-41.89951D-(-33D)));
            zz = 0D + (((tickAnim - 5D) / 1D) * (7.69919D-(0D)));
        }
        else if (tickAnim >= 6 && tickAnim < 7) {
            xx = 17.72785D + (((tickAnim - 6D) / 1D) * (22.5D-(17.72785D)));
            yy = -41.89951D + (((tickAnim - 6D) / 1D) * (-39.83333D-(-41.89951D)));
            zz = 7.69919D + (((tickAnim - 6D) / 1D) * (0D-(7.69919D)));
        }
        else if (tickAnim >= 7 && tickAnim < 8) {
            xx = 22.5D + (((tickAnim - 7D) / 1D) * (14.5D-(22.5D)));
            yy = -39.83333D + (((tickAnim - 7D) / 1D) * (-23.91D-(-39.83333D)));
            zz = 0D + (((tickAnim - 7D) / 1D) * (-1D-(0D)));
        }
        else if (tickAnim >= 8 && tickAnim < 10) {
            xx = 14.5D + (((tickAnim - 8D) / 2D) * (0D-(14.5D)));
            yy = -23.91D + (((tickAnim - 8D) / 2D) * (22.5D-(-23.91D)));
            zz = -1D + (((tickAnim - 8D) / 2D) * (0D-(-1D)));
        }
        this.setRotateAngle(legRs, legRs.rotateAngleX + (float) Math.toRadians(xx), legRs.rotateAngleY + (float) Math.toRadians(yy), legRs.rotateAngleZ + (float) Math.toRadians(zz));
        this.setRotateAngle(Body, Body.rotateAngleX + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/10D)*0.5D)*180/0.25+120))), Body.rotateAngleY + (float) Math.toRadians(0), Body.rotateAngleZ + (float) Math.toRadians(0));
        this.Body.offsetX = (float) Math.toRadians(0);
        this.Body.offsetY = (float) Math.toRadians(3.5+Math.sin((Math.PI/180)*((((double)tickAnim/10D)*0.5D)*180/0.25+150))/4);
        this.Body.offsetZ = (float) Math.toRadians(0);
        this.setRotateAngle(cheliceraL, cheliceraL.rotateAngleX + (float) Math.toRadians(-31.36949), cheliceraL.rotateAngleY + (float) Math.toRadians(-12.43747), cheliceraL.rotateAngleZ + (float) Math.toRadians(43.50974));
        this.setRotateAngle(clawbaseL, clawbaseL.rotateAngleX + (float) Math.toRadians(22.5), clawbaseL.rotateAngleY + (float) Math.toRadians(0), clawbaseL.rotateAngleZ + (float) Math.toRadians(0));
        this.setRotateAngle(cheliceraR, cheliceraR.rotateAngleX + (float) Math.toRadians(-31.36949), cheliceraR.rotateAngleY + (float) Math.toRadians(12.43747), cheliceraR.rotateAngleZ + (float) Math.toRadians(-43.50974));
        this.setRotateAngle(clawbaseR, clawbaseR.rotateAngleX + (float) Math.toRadians(22.5), clawbaseR.rotateAngleY + (float) Math.toRadians(0), clawbaseR.rotateAngleZ + (float) Math.toRadians(0));

        if (tickAnim >= 0 && tickAnim < 5) {
            xx = -20.94102D + (((tickAnim - 0D) / 5D) * (-23.73649D-(-20.94102D)));
            yy = -40.78947D + (((tickAnim - 0D) / 5D) * (-39.49176D-(-40.78947D)));
            zz = 30.36119D + (((tickAnim - 0D) / 5D) * (32.16366D-(30.36119D)));
        }
        else if (tickAnim >= 5 && tickAnim < 10) {
            xx = -23.73649D + (((tickAnim - 5D) / 5D) * (-20.94102D-(-23.73649D)));
            yy = -39.49176D + (((tickAnim - 5D) / 5D) * (-40.78947D-(-39.49176D)));
            zz = 32.16366D + (((tickAnim - 5D) / 5D) * (30.36119D-(32.16366D)));
        }
        this.setRotateAngle(legL, legL.rotateAngleX + (float) Math.toRadians(xx), legL.rotateAngleY + (float) Math.toRadians(yy), legL.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 5) {
            xx = -20.94102D + (((tickAnim - 0D) / 5D) * (-18.0372D-(-20.94102D)));
            yy = -40.78947D + (((tickAnim - 0D) / 5D) * (-42.01708D-(-40.78947D)));
            zz = 35.86119D + (((tickAnim - 0D) / 5D) * (33.9404D-(35.86119D)));
        }
        else if (tickAnim >= 5 && tickAnim < 10) {
            xx = -18.0372D + (((tickAnim - 5D) / 5D) * (-20.94102D-(-18.0372D)));
            yy = -42.01708D + (((tickAnim - 5D) / 5D) * (-40.78947D-(-42.01708D)));
            zz = 33.9404D + (((tickAnim - 5D) / 5D) * (35.86119D-(33.9404D)));
        }
        this.setRotateAngle(legL2, legL2.rotateAngleX + (float) Math.toRadians(xx), legL2.rotateAngleY + (float) Math.toRadians(yy), legL2.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 5) {
            xx = -20.94102D + (((tickAnim - 0D) / 5D) * (-22.29118D-(-20.94102D)));
            yy = -40.78947D + (((tickAnim - 0D) / 5D) * (-40.44109D-(-40.78947D)));
            zz = 38.36119D + (((tickAnim - 0D) / 5D) * (37.43648D-(38.36119D)));
        }
        else if (tickAnim >= 5 && tickAnim < 10) {
            xx = -22.29118D + (((tickAnim - 5D) / 5D) * (-20.94102D-(-22.29118D)));
            yy = -40.44109D + (((tickAnim - 5D) / 5D) * (-40.78947D-(-40.44109D)));
            zz = 37.43648D + (((tickAnim - 5D) / 5D) * (38.36119D-(37.43648D)));
        }
        this.setRotateAngle(legL3, legL3.rotateAngleX + (float) Math.toRadians(xx), legL3.rotateAngleY + (float) Math.toRadians(yy), legL3.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 1.04522D + (((tickAnim - 0D) / 3D) * (-12.71222D-(1.04522D)));
            yy = -19.47912D + (((tickAnim - 0D) / 3D) * (-3.29991D-(-19.47912D)));
            zz = 27.69967D + (((tickAnim - 0D) / 3D) * (-28.97152D-(27.69967D)));
        }
        else if (tickAnim >= 3 && tickAnim < 5) {
            xx = -12.71222D + (((tickAnim - 3D) / 2D) * (-1.4577D-(-12.71222D)));
            yy = -3.29991D + (((tickAnim - 3D) / 2D) * (26.88196D-(-3.29991D)));
            zz = -28.97152D + (((tickAnim - 3D) / 2D) * (-23.59815D-(-28.97152D)));
        }
        else if (tickAnim >= 5 && tickAnim < 8) {
            xx = -1.4577D + (((tickAnim - 5D) / 3D) * (23.93D-(-1.4577D)));
            yy = 26.88196D + (((tickAnim - 5D) / 3D) * (-4.87D-(26.88196D)));
            zz = -23.59815D + (((tickAnim - 5D) / 3D) * (11.9D-(-23.59815D)));
        }
        else if (tickAnim >= 8 && tickAnim < 8) {
            xx = 23.93D + (((tickAnim - 8D) / 0D) * (20.93D-(23.93D)));
            yy = -4.87D + (((tickAnim - 8D) / 0D) * (-17.81D-(-4.87D)));
            zz = 11.9D + (((tickAnim - 8D) / 0D) * (25.03D-(11.9D)));
        }
        else if (tickAnim >= 8 && tickAnim < 10) {
            xx = 20.93D + (((tickAnim - 8D) / 2D) * (1.04522D-(20.93D)));
            yy = -17.81D + (((tickAnim - 8D) / 2D) * (-19.47912D-(-17.81D)));
            zz = 25.03D + (((tickAnim - 8D) / 2D) * (27.69967D-(25.03D)));
        }
        this.setRotateAngle(legL4, legL4.rotateAngleX + (float) Math.toRadians(xx), legL4.rotateAngleY + (float) Math.toRadians(yy), legL4.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 1) {
            xx = 0D + (((tickAnim - 0D) / 1D) * (-14D-(0D)));
            yy = -22.5D + (((tickAnim - 0D) / 1D) * (-34.83D-(-22.5D)));
            zz = 0D + (((tickAnim - 0D) / 1D) * (1.2D-(0D)));
        }
        else if (tickAnim >= 1 && tickAnim < 3) {
            xx = -14D + (((tickAnim - 1D) / 2D) * (-22.5D-(-14D)));
            yy = -34.83D + (((tickAnim - 1D) / 2D) * (-27.5D-(-34.83D)));
            zz = 1.2D + (((tickAnim - 1D) / 2D) * (2D-(1.2D)));
        }
        else if (tickAnim >= 3 && tickAnim < 3) {
            xx = -22.5D + (((tickAnim - 3D) / 0D) * (-16.5D-(-22.5D)));
            yy = -27.5D + (((tickAnim - 3D) / 0D) * (9.17D-(-27.5D)));
            zz = 2D + (((tickAnim - 3D) / 0D) * (2D-(2D)));
        }
        else if (tickAnim >= 3 && tickAnim < 5) {
            xx = -16.5D + (((tickAnim - 3D) / 2D) * (0D-(-16.5D)));
            yy = 9.17D + (((tickAnim - 3D) / 2D) * (33D-(9.17D)));
            zz = 2D + (((tickAnim - 3D) / 2D) * (0D-(2D)));
        }
        else if (tickAnim >= 5 && tickAnim < 6) {
            xx = 0D + (((tickAnim - 5D) / 1D) * (17.72785D-(0D)));
            yy = 33D + (((tickAnim - 5D) / 1D) * (41.89951D-(33D)));
            zz = 0D + (((tickAnim - 5D) / 1D) * (-7.69919D-(0D)));
        }
        else if (tickAnim >= 6 && tickAnim < 7) {
            xx = 17.72785D + (((tickAnim - 6D) / 1D) * (22.5D-(17.72785D)));
            yy = 41.89951D + (((tickAnim - 6D) / 1D) * (39.83333D-(41.89951D)));
            zz = -7.69919D + (((tickAnim - 6D) / 1D) * (0D-(-7.69919D)));
        }
        else if (tickAnim >= 7 && tickAnim < 8) {
            xx = 22.5D + (((tickAnim - 7D) / 1D) * (14.5D-(22.5D)));
            yy = 39.83333D + (((tickAnim - 7D) / 1D) * (23.91D-(39.83333D)));
            zz = 0D + (((tickAnim - 7D) / 1D) * (1D-(0D)));
        }
        else if (tickAnim >= 8 && tickAnim < 10) {
            xx = 14.5D + (((tickAnim - 8D) / 2D) * (0D-(14.5D)));
            yy = 23.91D + (((tickAnim - 8D) / 2D) * (-22.5D-(23.91D)));
            zz = 1D + (((tickAnim - 8D) / 2D) * (0D-(1D)));
        }
        this.setRotateAngle(legLs, legLs.rotateAngleX + (float) Math.toRadians(xx), legLs.rotateAngleY + (float) Math.toRadians(yy), legLs.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 5) {
            xx = -22.4211D + (((tickAnim - 0D) / 5D) * (-18.0372D-(-22.4211D)));
            yy = -39.8942D + (((tickAnim - 0D) / 5D) * (-42.01708D-(-39.8942D)));
            zz = 46.12505D + (((tickAnim - 0D) / 5D) * (41.4404D-(46.12505D)));
        }
        else if (tickAnim >= 5 && tickAnim < 10) {
            xx = -18.0372D + (((tickAnim - 5D) / 5D) * (-22.4211D-(-18.0372D)));
            yy = -42.01708D + (((tickAnim - 5D) / 5D) * (-39.8942D-(-42.01708D)));
            zz = 41.4404D + (((tickAnim - 5D) / 5D) * (46.12505D-(41.4404D)));
        }
        this.setRotateAngle(legL5, legL5.rotateAngleX + (float) Math.toRadians(xx), legL5.rotateAngleY + (float) Math.toRadians(yy), legL5.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 5) {
            xx = -20.94102D + (((tickAnim - 0D) / 5D) * (-23.73649D-(-20.94102D)));
            yy = 40.78947D + (((tickAnim - 0D) / 5D) * (39.49176D-(40.78947D)));
            zz = -30.36119D + (((tickAnim - 0D) / 5D) * (-32.16366D-(-30.36119D)));
        }
        else if (tickAnim >= 5 && tickAnim < 10) {
            xx = -23.73649D + (((tickAnim - 5D) / 5D) * (-20.94102D-(-23.73649D)));
            yy = 39.49176D + (((tickAnim - 5D) / 5D) * (40.78947D-(39.49176D)));
            zz = -32.16366D + (((tickAnim - 5D) / 5D) * (-30.36119D-(-32.16366D)));
        }
        this.setRotateAngle(legR, legR.rotateAngleX + (float) Math.toRadians(xx), legR.rotateAngleY + (float) Math.toRadians(yy), legR.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 5) {
            xx = -20.94102D + (((tickAnim - 0D) / 5D) * (-18.0372D-(-20.94102D)));
            yy = 40.78947D + (((tickAnim - 0D) / 5D) * (42.01708D-(40.78947D)));
            zz = -35.36119D + (((tickAnim - 0D) / 5D) * (-33.4404D-(-35.36119D)));
        }
        else if (tickAnim >= 5 && tickAnim < 10) {
            xx = -18.0372D + (((tickAnim - 5D) / 5D) * (-20.94102D-(-18.0372D)));
            yy = 42.01708D + (((tickAnim - 5D) / 5D) * (40.78947D-(42.01708D)));
            zz = -33.4404D + (((tickAnim - 5D) / 5D) * (-35.36119D-(-33.4404D)));
        }
        this.setRotateAngle(legR2, legR2.rotateAngleX + (float) Math.toRadians(xx), legR2.rotateAngleY + (float) Math.toRadians(yy), legR2.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 5) {
            xx = -20.94102D + (((tickAnim - 0D) / 5D) * (-22.29118D-(-20.94102D)));
            yy = 40.78947D + (((tickAnim - 0D) / 5D) * (40.44109D-(40.78947D)));
            zz = -38.36119D + (((tickAnim - 0D) / 5D) * (-37.43648D-(-38.36119D)));
        }
        else if (tickAnim >= 5 && tickAnim < 10) {
            xx = -22.29118D + (((tickAnim - 5D) / 5D) * (-20.94102D-(-22.29118D)));
            yy = 40.44109D + (((tickAnim - 5D) / 5D) * (40.78947D-(40.44109D)));
            zz = -37.43648D + (((tickAnim - 5D) / 5D) * (-38.36119D-(-37.43648D)));
        }
        this.setRotateAngle(legR3, legR3.rotateAngleX + (float) Math.toRadians(xx), legR3.rotateAngleY + (float) Math.toRadians(yy), legR3.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 5) {
            xx = -22.4211D + (((tickAnim - 0D) / 5D) * (-18.0372D-(-22.4211D)));
            yy = 39.8942D + (((tickAnim - 0D) / 5D) * (42.01708D-(39.8942D)));
            zz = -46.12505D + (((tickAnim - 0D) / 5D) * (-41.4404D-(-46.12505D)));
        }
        else if (tickAnim >= 5 && tickAnim < 10) {
            xx = -18.0372D + (((tickAnim - 5D) / 5D) * (-22.4211D-(-18.0372D)));
            yy = 42.01708D + (((tickAnim - 5D) / 5D) * (39.8942D-(42.01708D)));
            zz = -41.4404D + (((tickAnim - 5D) / 5D) * (-46.12505D-(-41.4404D)));
        }
        this.setRotateAngle(legR5, legR5.rotateAngleX + (float) Math.toRadians(xx), legR5.rotateAngleY + (float) Math.toRadians(yy), legR5.rotateAngleZ + (float) Math.toRadians(zz));
        this.setRotateAngle(TergiteA1, TergiteA1.rotateAngleX + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/10D)*0.5D)*180/0.25-30))*3), TergiteA1.rotateAngleY + (float) Math.toRadians(0), TergiteA1.rotateAngleZ + (float) Math.toRadians(0));
        this.setRotateAngle(TergiteA2, TergiteA2.rotateAngleX + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/10D)*0.5D)*180/0.25-60))*4), TergiteA2.rotateAngleY + (float) Math.toRadians(0), TergiteA2.rotateAngleZ + (float) Math.toRadians(0));
        this.setRotateAngle(TergiteA3, TergiteA3.rotateAngleX + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/10D)*0.5D)*180/0.25-90))*5), TergiteA3.rotateAngleY + (float) Math.toRadians(0), TergiteA3.rotateAngleZ + (float) Math.toRadians(0));
        this.setRotateAngle(TergiteA4, TergiteA4.rotateAngleX + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/10D)*0.5D)*180/0.25-120))*6), TergiteA4.rotateAngleY + (float) Math.toRadians(0), TergiteA4.rotateAngleZ + (float) Math.toRadians(0));
        this.setRotateAngle(TergiteA5, TergiteA5.rotateAngleX + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/10D)*0.5D)*180/0.25-150))*7), TergiteA5.rotateAngleY + (float) Math.toRadians(0), TergiteA5.rotateAngleZ + (float) Math.toRadians(0));
        this.setRotateAngle(TergiteA6, TergiteA6.rotateAngleX + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/10D)*0.5D)*180/0.25-180))*8), TergiteA6.rotateAngleY + (float) Math.toRadians(0), TergiteA6.rotateAngleZ + (float) Math.toRadians(0));
        this.setRotateAngle(Telson, Telson.rotateAngleX + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/10D)*0.5D)*180/0.25-240))*10), Telson.rotateAngleY + (float) Math.toRadians(0), Telson.rotateAngleZ + (float) Math.toRadians(0));
    }

    public void animate(IAnimatedEntity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        EntityPrehistoricFloraCiurcopterus e = (EntityPrehistoricFloraCiurcopterus) entity;
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
