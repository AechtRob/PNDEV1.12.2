package net.lepidodendron.entity.model.entity;

import net.ilexiconn.llibrary.client.model.tools.AdvancedModelRenderer;
import net.lepidodendron.entity.base.EntityPrehistoricFloraLandClimbingBase;
import net.lepidodendron.entity.model.ModelBasePalaeopedia;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;

public class ModelTrigonotarbid extends ModelBasePalaeopedia {

    private final AdvancedModelRenderer body;
    private final AdvancedModelRenderer headattercopus_r1;
    private final AdvancedModelRenderer headeo_r1;
    private final AdvancedModelRenderer headkreish_r1;
    private final AdvancedModelRenderer headkreish_r2;
    private final AdvancedModelRenderer pedipalpR;
    private final AdvancedModelRenderer pedipalpL;
    private final AdvancedModelRenderer legL1;
    private final AdvancedModelRenderer LegR1;
    private final AdvancedModelRenderer legL2;
    private final AdvancedModelRenderer legR2;
    private final AdvancedModelRenderer legL3;
    private final AdvancedModelRenderer legR3;
    private final AdvancedModelRenderer legL4;
    private final AdvancedModelRenderer legR4;
    private final AdvancedModelRenderer abdomen;
    private final AdvancedModelRenderer hipeo_r1;
    private final AdvancedModelRenderer hipeo_r2;
    private final AdvancedModelRenderer hipeo_r3;
    private final AdvancedModelRenderer hipeo_r4;
    private final AdvancedModelRenderer hipeo_r5;
    private final AdvancedModelRenderer hipeo_r6;
    private final AdvancedModelRenderer hipeo_r7;
    private final AdvancedModelRenderer hipeo_r8;
    private final AdvancedModelRenderer hippermo_r1;
    private final AdvancedModelRenderer hippermo_r2;
    private final AdvancedModelRenderer hippermo_r3;
    private final AdvancedModelRenderer hippermo_r4;
    private final AdvancedModelRenderer tailattercopus;

    /*
    private final AdvancedModelRenderer body;
    private final AdvancedModelRenderer cephalothorax;
    private final AdvancedModelRenderer leg1;
    private final AdvancedModelRenderer legj1;
    private final AdvancedModelRenderer leg5;
    private final AdvancedModelRenderer legj5;
    private final AdvancedModelRenderer leg2;
    private final AdvancedModelRenderer legj2;
    private final AdvancedModelRenderer leg6;
    private final AdvancedModelRenderer legj6;
    private final AdvancedModelRenderer leg3;
    private final AdvancedModelRenderer legj3;
    private final AdvancedModelRenderer leg7;
    private final AdvancedModelRenderer legj7;
    private final AdvancedModelRenderer leg4;
    private final AdvancedModelRenderer legj4;
    private final AdvancedModelRenderer leg8;
    private final AdvancedModelRenderer legj8;
    private final AdvancedModelRenderer jawL2;
    private final AdvancedModelRenderer jawL;
    private final AdvancedModelRenderer pedipalpR;
    private final AdvancedModelRenderer pedipalpL;
    private final AdvancedModelRenderer abdomen;
    private final AdvancedModelRenderer attercopus_tail;
     */

    public ModelTrigonotarbid() {
        this.textureWidth = 64;
        this.textureHeight = 64;

        this.body = new AdvancedModelRenderer(this);
        this.body.setRotationPoint(0.0F, 23.25F, -4.0F);
        this.body.cubeList.add(new ModelBox(body, 4, 16, -0.5F, -1.1F, 1.0F, 1, 1, 1, 0.0F, false));
        this.body.cubeList.add(new ModelBox(body, 46, 18, -2.0F, -1.0F, 2.0F, 4, 1, 1, 0.0F, false));
        this.body.cubeList.add(new ModelBox(body, 42, 24, -1.5F, -2.0F, 0.0F, 3, 2, 3, 0.0F, false));
        this.body.cubeList.add(new ModelBox(body, 0, 45, -1.5F, -1.15F, 1.0F, 3, 1, 2, 0.01F, false));
        this.body.cubeList.add(new ModelBox(body, 0, 19, -1.0F, -1.15F, 0.0F, 2, 1, 1, 0.01F, false));
        this.body.cubeList.add(new ModelBox(body, 0, 5, -1.0F, -1.65F, 1.2F, 2, 1, 2, 0.0F, false));
        this.body.cubeList.add(new ModelBox(body, 0, 3, -0.5F, -2.25F, 0.1F, 1, 1, 1, 0.0F, false));
        this.body.cubeList.add(new ModelBox(body, 0, 23, -1.0F, -1.5F, -1.0F, 2, 1, 1, 0.0F, false));
        this.body.cubeList.add(new ModelBox(body, 0, 62, -0.5F, -1.9F, -0.4F, 1, 1, 1, 0.0F, false));
        this.body.cubeList.add(new ModelBox(body, 0, 4, -0.25F, -1.5F, -1.5F, 0, 2, 1, 0.0F, false));
        this.body.cubeList.add(new ModelBox(body, 0, 4, 0.25F, -1.5F, -1.5F, 0, 2, 1, 0.0F, true));
        this.body.cubeList.add(new ModelBox(body, 29, 39, -2.0F, -2.0F, 0.0F, 4, 2, 3, 0.0F, false));

        this.headattercopus_r1 = new AdvancedModelRenderer(this);
        this.headattercopus_r1.setRotationPoint(0.0F, -2.0F, 0.0F);
        this.body.addChild(headattercopus_r1);
        this.setRotateAngle(headattercopus_r1, 0.3054F, 0.0F, 0.0F);
        this.headattercopus_r1.cubeList.add(new ModelBox(headattercopus_r1, 0, 0, 0.15F, 0.25F, -1.5F, 1, 2, 1, 0.0F, true));
        this.headattercopus_r1.cubeList.add(new ModelBox(headattercopus_r1, 0, 0, -1.15F, 0.25F, -1.5F, 1, 2, 1, 0.0F, false));
        this.headattercopus_r1.cubeList.add(new ModelBox(headattercopus_r1, 0, 21, -1.0F, 0.0F, -1.0F, 2, 1, 1, 0.0F, false));

        this.headeo_r1 = new AdvancedModelRenderer(this);
        this.headeo_r1.setRotationPoint(0.0F, -1.0F, 0.0F);
        this.body.addChild(headeo_r1);
        this.setRotateAngle(headeo_r1, 0.0873F, 0.0F, 0.0F);
        this.headeo_r1.cubeList.add(new ModelBox(headeo_r1, 21, 43, -0.5F, -0.25F, -1.1F, 1, 1, 4, 0.01F, false));

        this.headkreish_r1 = new AdvancedModelRenderer(this);
        this.headkreish_r1.setRotationPoint(0.0F, -0.4F, 2.0F);
        this.body.addChild(headkreish_r1);
        this.setRotateAngle(headkreish_r1, 0.0873F, 0.0F, 0.0F);
        this.headkreish_r1.cubeList.add(new ModelBox(headkreish_r1, 0, 16, -0.5F, -1.3F, -2.65F, 1, 1, 2, -0.05F, false));

        this.headkreish_r2 = new AdvancedModelRenderer(this);
        this.headkreish_r2.setRotationPoint(0.0F, -0.4F, 2.0F);
        this.body.addChild(headkreish_r2);
        this.setRotateAngle(headkreish_r2, 0.0F, -0.7854F, 0.0F);
        this.headkreish_r2.cubeList.add(new ModelBox(headkreish_r2, 0, 8, -1.65F, -1.0F, -1.65F, 2, 1, 2, -0.05F, false));
        this.headkreish_r2.cubeList.add(new ModelBox(headkreish_r2, 13, 43, -1.5F, -0.6F, -1.5F, 3, 1, 3, -0.05F, false));

        this.pedipalpR = new AdvancedModelRenderer(this);
        this.pedipalpR.setRotationPoint(-0.5F, -0.25F, 0.75F);
        this.body.addChild(pedipalpR);
        this.setRotateAngle(pedipalpR, 0.1309F, 0.3054F, 0.8727F);
        this.pedipalpR.cubeList.add(new ModelBox(pedipalpR, 26, 0, -0.75F, 0.0F, -5.75F, 2, 0, 6, 0.0F, false));

        this.pedipalpL = new AdvancedModelRenderer(this);
        this.pedipalpL.setRotationPoint(0.5F, -0.25F, 0.75F);
        this.body.addChild(pedipalpL);
        this.setRotateAngle(pedipalpL, 0.1309F, -0.3054F, -0.8727F);
        this.pedipalpL.cubeList.add(new ModelBox(pedipalpL, 26, 0, -1.25F, 0.0F, -5.75F, 2, 0, 6, 0.0F, true));

        this.legL1 = new AdvancedModelRenderer(this);
        this.legL1.setRotationPoint(0.5F, -0.25F, 0.75F);
        this.body.addChild(legL1);
        this.setRotateAngle(legL1, 1.0036F, 0.3054F, -0.7418F);
        this.legL1.cubeList.add(new ModelBox(legL1, 4, 25, -0.25F, 0.0F, -7.0F, 9, 0, 7, 0.0F, true));

        this.LegR1 = new AdvancedModelRenderer(this);
        this.LegR1.setRotationPoint(-0.5F, -0.25F, 0.75F);
        this.body.addChild(LegR1);
        this.setRotateAngle(LegR1, 1.0036F, -0.3054F, 0.7418F);
        this.LegR1.cubeList.add(new ModelBox(LegR1, 4, 25, -8.75F, 0.0F, -7.0F, 9, 0, 7, 0.0F, false));

        this.legL2 = new AdvancedModelRenderer(this);
        this.legL2.setRotationPoint(1.25F, -0.25F, 1.75F);
        this.body.addChild(legL2);
        this.setRotateAngle(legL2, 1.5621F, 0.2531F, -0.6545F);
        this.legL2.cubeList.add(new ModelBox(legL2, 3, 16, -0.25F, 0.0F, -8.0F, 9, 0, 8, 0.0F, true));

        this.legR2 = new AdvancedModelRenderer(this);
        this.legR2.setRotationPoint(-1.25F, -0.25F, 1.75F);
        this.body.addChild(legR2);
        this.setRotateAngle(legR2, 1.5621F, -0.2531F, 0.6545F);
        this.legR2.cubeList.add(new ModelBox(legR2, 3, 16, -8.75F, 0.0F, -8.0F, 9, 0, 8, 0.0F, false));

        this.legL3 = new AdvancedModelRenderer(this);
        this.legL3.setRotationPoint(1.5F, -0.25F, 2.5F);
        this.body.addChild(legL3);
        this.setRotateAngle(legL3, -0.8727F, -0.1745F, -0.3491F);
        this.legL3.cubeList.add(new ModelBox(legL3, 5, 10, -0.25F, 0.0F, -0.75F, 9, 0, 6, 0.0F, true));

        this.legR3 = new AdvancedModelRenderer(this);
        this.legR3.setRotationPoint(-1.5F, -0.25F, 2.5F);
        this.body.addChild(legR3);
        this.setRotateAngle(legR3, -0.8727F, 0.1745F, 0.3491F);
        this.legR3.cubeList.add(new ModelBox(legR3, 5, 10, -8.75F, 0.0F, -0.75F, 9, 0, 6, 0.0F, false));

        this.legL4 = new AdvancedModelRenderer(this);
        this.legL4.setRotationPoint(1.5F, -0.25F, 3.5F);
        this.body.addChild(legL4);
        this.setRotateAngle(legL4, -0.8727F, -0.6545F, -0.4363F);
        this.legL4.cubeList.add(new ModelBox(legL4, 5, 2, -0.25F, 0.0F, -0.75F, 9, 0, 6, 0.0F, true));

        this.legR4 = new AdvancedModelRenderer(this);
        this.legR4.setRotationPoint(-1.5F, -0.25F, 3.5F);
        this.body.addChild(legR4);
        this.setRotateAngle(legR4, -0.8727F, 0.6545F, 0.4363F);
        this.legR4.cubeList.add(new ModelBox(legR4, 5, 2, -8.75F, 0.0F, -0.75F, 9, 0, 6, 0.0F, false));

        this.abdomen = new AdvancedModelRenderer(this);
        this.abdomen.setRotationPoint(0.0F, -0.75F, 3.0F);
        this.body.addChild(abdomen);
        this.abdomen.cubeList.add(new ModelBox(abdomen, 46, 0, -2.0F, 0.0F, 4.0F, 4, 1, 1, 0.0F, false));
        this.abdomen.cubeList.add(new ModelBox(abdomen, 39, 40, -1.5F, -0.5F, 0.0F, 3, 1, 4, 0.0F, false));
        this.abdomen.cubeList.add(new ModelBox(abdomen, 11, 38, -2.5F, 0.0F, 0.0F, 5, 1, 4, 0.0F, false));
        this.abdomen.cubeList.add(new ModelBox(abdomen, 32, 3, -2.0F, -1.25F, 0.0F, 4, 2, 5, 0.0F, false));
        this.abdomen.cubeList.add(new ModelBox(abdomen, 26, 26, -2.5F, -0.75F, -0.1F, 5, 1, 6, 0.0F, false));
        this.abdomen.cubeList.add(new ModelBox(abdomen, 0, 32, -2.5F, -0.75F, -0.1F, 5, 1, 5, 0.0F, false));
        this.abdomen.cubeList.add(new ModelBox(abdomen, 38, 45, -2.0F, -0.75F, 4.9F, 4, 1, 1, 0.0F, false));
        this.abdomen.cubeList.add(new ModelBox(abdomen, 32, 18, -2.5F, -1.5F, 0.0F, 5, 2, 4, 0.0F, false));
        this.abdomen.cubeList.add(new ModelBox(abdomen, 0, 11, -1.5F, -1.5F, 4.0F, 3, 2, 1, 0.0F, false));
        this.abdomen.cubeList.add(new ModelBox(abdomen, 0, 38, -1.5F, -1.25F, 0.0F, 3, 2, 5, 0.0F, false));
        this.abdomen.cubeList.add(new ModelBox(abdomen, 34, 34, -2.5F, -0.75F, 1.25F, 5, 1, 4, 0.0F, false));
        this.abdomen.cubeList.add(new ModelBox(abdomen, 45, 5, -2.0F, -0.725F, 0.25F, 4, 1, 1, 0.0F, false));
        this.abdomen.cubeList.add(new ModelBox(abdomen, 42, 29, -2.0F, -0.725F, 4.5F, 4, 1, 2, 0.0F, false));
        this.abdomen.cubeList.add(new ModelBox(abdomen, 32, 10, -1.0F, -1.2F, 0.0F, 2, 2, 6, 0.0F, false));
        this.abdomen.cubeList.add(new ModelBox(abdomen, 0, 14, -1.5F, -0.7F, 5.5F, 3, 1, 1, -0.01F, false));
        this.abdomen.cubeList.add(new ModelBox(abdomen, 45, 3, -2.0F, -0.45F, 0.0F, 4, 1, 1, 0.0F, false));
        this.abdomen.cubeList.add(new ModelBox(abdomen, 20, 33, -2.5F, -0.45F, 0.75F, 5, 1, 4, 0.01F, false));
        this.abdomen.cubeList.add(new ModelBox(abdomen, 36, 0, -2.0F, -0.45F, 4.25F, 4, 1, 2, 0.0F, false));

        this.hipeo_r1 = new AdvancedModelRenderer(this);
        this.hipeo_r1.setRotationPoint(0.75F, 0.0F, 6.25F);
        this.abdomen.addChild(hipeo_r1);
        this.setRotateAngle(hipeo_r1, 0.0F, 0.2182F, 0.0F);
        this.hipeo_r1.cubeList.add(new ModelBox(hipeo_r1, 62, 62, 0.0F, -0.45F, -0.25F, 0, 1, 1, 0.0F, true));

        this.hipeo_r2 = new AdvancedModelRenderer(this);
        this.hipeo_r2.setRotationPoint(-0.75F, 0.0F, 6.25F);
        this.abdomen.addChild(hipeo_r2);
        this.setRotateAngle(hipeo_r2, 0.0F, -0.2182F, 0.0F);
        this.hipeo_r2.cubeList.add(new ModelBox(hipeo_r2, 62, 62, 0.0F, -0.45F, -0.25F, 0, 1, 1, 0.0F, false));

        this.hipeo_r3 = new AdvancedModelRenderer(this);
        this.hipeo_r3.setRotationPoint(0.25F, 0.0F, 0.0F);
        this.abdomen.addChild(hipeo_r3);
        this.setRotateAngle(hipeo_r3, 0.0F, 0.0F, 0.6109F);
        this.hipeo_r3.cubeList.add(new ModelBox(hipeo_r3, 15, 27, -0.25F, -0.8F, 0.5F, 0, 1, 5, 0.0F, true));

        this.hipeo_r4 = new AdvancedModelRenderer(this);
        this.hipeo_r4.setRotationPoint(2.0F, 0.0F, 0.0F);
        this.abdomen.addChild(hipeo_r4);
        this.setRotateAngle(hipeo_r4, 0.0F, 0.0F, 0.6981F);
        this.hipeo_r4.cubeList.add(new ModelBox(hipeo_r4, 32, 20, -0.5F, -0.55F, 0.5F, 0, 1, 5, 0.0F, true));

        this.hipeo_r5 = new AdvancedModelRenderer(this);
        this.hipeo_r5.setRotationPoint(1.25F, 0.0F, 0.0F);
        this.abdomen.addChild(hipeo_r5);
        this.setRotateAngle(hipeo_r5, 0.0F, 0.0F, 0.6981F);
        this.hipeo_r5.cubeList.add(new ModelBox(hipeo_r5, 32, 19, -0.25F, -0.8F, 0.5F, 0, 1, 5, 0.0F, true));

        this.hipeo_r6 = new AdvancedModelRenderer(this);
        this.hipeo_r6.setRotationPoint(-0.25F, 0.0F, 0.0F);
        this.abdomen.addChild(hipeo_r6);
        this.setRotateAngle(hipeo_r6, 0.0F, 0.0F, -0.6109F);
        this.hipeo_r6.cubeList.add(new ModelBox(hipeo_r6, 15, 27, 0.25F, -0.8F, 0.5F, 0, 1, 5, 0.0F, false));

        this.hipeo_r7 = new AdvancedModelRenderer(this);
        this.hipeo_r7.setRotationPoint(-1.25F, 0.0F, 0.0F);
        this.abdomen.addChild(hipeo_r7);
        this.setRotateAngle(hipeo_r7, 0.0F, 0.0F, -0.6981F);
        this.hipeo_r7.cubeList.add(new ModelBox(hipeo_r7, 32, 19, 0.25F, -0.8F, 0.5F, 0, 1, 5, 0.0F, false));

        this.hipeo_r8 = new AdvancedModelRenderer(this);
        this.hipeo_r8.setRotationPoint(-2.0F, 0.0F, 0.0F);
        this.abdomen.addChild(hipeo_r8);
        this.setRotateAngle(hipeo_r8, 0.0F, 0.0F, -0.6981F);
        this.hipeo_r8.cubeList.add(new ModelBox(hipeo_r8, 32, 20, 0.5F, -0.55F, 0.5F, 0, 1, 5, 0.0F, false));

        this.hippermo_r1 = new AdvancedModelRenderer(this);
        this.hippermo_r1.setRotationPoint(1.0F, 0.3F, 0.25F);
        this.abdomen.addChild(hippermo_r1);
        this.setRotateAngle(hippermo_r1, 0.0F, 0.2618F, 0.0F);
        this.hippermo_r1.cubeList.add(new ModelBox(hippermo_r1, 31, 44, -1.025F, -1.0F, -0.4F, 2, 1, 3, -0.01F, true));

        this.hippermo_r2 = new AdvancedModelRenderer(this);
        this.hippermo_r2.setRotationPoint(1.0F, 0.3F, 0.25F);
        this.abdomen.addChild(hippermo_r2);
        this.setRotateAngle(hippermo_r2, 0.0F, -0.2531F, 0.0F);
        this.hippermo_r2.cubeList.add(new ModelBox(hippermo_r2, 42, 10, 0.1F, -1.0F, 1.75F, 2, 1, 4, 0.0F, true));

        this.hippermo_r3 = new AdvancedModelRenderer(this);
        this.hippermo_r3.setRotationPoint(-1.0F, 0.3F, 0.25F);
        this.abdomen.addChild(hippermo_r3);
        this.setRotateAngle(hippermo_r3, 0.0F, -0.2618F, 0.0F);
        this.hippermo_r3.cubeList.add(new ModelBox(hippermo_r3, 31, 44, -0.975F, -1.0F, -0.4F, 2, 1, 3, -0.01F, false));

        this.hippermo_r4 = new AdvancedModelRenderer(this);
        this.hippermo_r4.setRotationPoint(-1.0F, 0.3F, 0.25F);
        this.abdomen.addChild(hippermo_r4);
        this.setRotateAngle(hippermo_r4, 0.0F, 0.2531F, 0.0F);
        this.hippermo_r4.cubeList.add(new ModelBox(hippermo_r4, 42, 10, -2.1F, -1.0F, 1.75F, 2, 1, 4, 0.0F, false));

        this.tailattercopus = new AdvancedModelRenderer(this);
        this.tailattercopus.setRotationPoint(0.0F, -0.5F, 5.0F);
        this.abdomen.addChild(tailattercopus);
        this.tailattercopus.cubeList.add(new ModelBox(tailattercopus, 0, 0, -0.5F, 0.0F, 0.0F, 1, 0, 5, 0.0F, false));

        /*
        this.textureWidth = 32;
        this.textureHeight = 32;

        this.body = new AdvancedModelRenderer(this);
        this.body.setRotationPoint(0.0F, 24.0F, 0.0F);


        this.cephalothorax = new AdvancedModelRenderer(this);
        this.cephalothorax.setRotationPoint(0.0F, -2.0F, -2.0F);
        this.body.addChild(cephalothorax);
        this.cephalothorax.cubeList.add(new ModelBox(cephalothorax, 14, 8, -2.0F, -1.0F, -4.0F, 4, 2, 4, 0.0F, false));
        this.cephalothorax.cubeList.add(new ModelBox(cephalothorax, 0, 20, -1.0F, -1.5F, -3.0F, 2, 1, 3, 0.0F, false));
        this.cephalothorax.cubeList.add(new ModelBox(cephalothorax, 0, 0, -1.0F, -0.5F, -5.0F, 2, 1, 1, 0.0F, false));

        this.leg1 = new AdvancedModelRenderer(this);
        this.leg1.setRotationPoint(2.0F, 0.5F, -3.5F);
        this.cephalothorax.addChild(leg1);
        this.setRotateAngle(leg1, 0.0F, 0.6981F, -0.3491F);
        this.leg1.cubeList.add(new ModelBox(leg1, 11, 19, 0.0F, -0.5F, -0.5F, 3, 1, 1, 0.0F, false));

        this.legj1 = new AdvancedModelRenderer(this);
        this.legj1.setRotationPoint(3.0F, 0.0F, 0.0F);
        this.leg1.addChild(legj1);
        this.setRotateAngle(legj1, 0.0F, 0.0F, 1.1345F);
        this.legj1.cubeList.add(new ModelBox(legj1, 0, 18, 0.0F, -0.5F, -0.51F, 3, 1, 1, 0.0F, false));

        this.leg5 = new AdvancedModelRenderer(this);
        this.leg5.setRotationPoint(-2.0F, 0.5F, -3.5F);
        this.cephalothorax.addChild(leg5);
        this.setRotateAngle(leg5, 0.0F, -0.6981F, 0.3491F);
        this.leg5.cubeList.add(new ModelBox(leg5, 11, 19, -3.0F, -0.5F, -0.5F, 3, 1, 1, 0.0F, true));

        this.legj5 = new AdvancedModelRenderer(this);
        this.legj5.setRotationPoint(-3.0F, 0.0F, 0.0F);
        this.leg5.addChild(legj5);
        this.setRotateAngle(legj5, 0.0F, 0.0F, -1.1345F);
        this.legj5.cubeList.add(new ModelBox(legj5, 0, 18, -3.0F, -0.5F, -0.51F, 3, 1, 1, 0.0F, true));

        this.leg2 = new AdvancedModelRenderer(this);
        this.leg2.setRotationPoint(2.0F, 0.5F, -2.5F);
        this.cephalothorax.addChild(leg2);
        this.setRotateAngle(leg2, 0.0F, 0.2618F, -0.3491F);
        this.leg2.cubeList.add(new ModelBox(leg2, 11, 19, 0.0F, -0.5F, -0.5F, 3, 1, 1, 0.0F, false));

        this.legj2 = new AdvancedModelRenderer(this);
        this.legj2.setRotationPoint(3.0F, 0.0F, 0.0F);
        this.leg2.addChild(legj2);
        this.setRotateAngle(legj2, 0.0F, 0.0F, 1.1345F);
        this.legj2.cubeList.add(new ModelBox(legj2, 0, 18, 0.0F, -0.5F, -0.51F, 3, 1, 1, 0.0F, false));

        this.leg6 = new AdvancedModelRenderer(this);
        this.leg6.setRotationPoint(-2.0F, 0.5F, -2.5F);
        this.cephalothorax.addChild(leg6);
        this.setRotateAngle(leg6, 0.0F, -0.2618F, 0.3491F);
        this.leg6.cubeList.add(new ModelBox(leg6, 11, 19, -3.0F, -0.5F, -0.5F, 3, 1, 1, 0.0F, true));

        this.legj6 = new AdvancedModelRenderer(this);
        this.legj6.setRotationPoint(-3.0F, 0.0F, 0.0F);
        this.leg6.addChild(legj6);
        this.setRotateAngle(legj6, 0.0F, 0.0F, -1.1345F);
        this.legj6.cubeList.add(new ModelBox(legj6, 0, 18, -3.0F, -0.5F, -0.51F, 3, 1, 1, 0.0F, true));

        this.leg3 = new AdvancedModelRenderer(this);
        this.leg3.setRotationPoint(2.0F, 0.5F, -1.5F);
        this.cephalothorax.addChild(leg3);
        this.setRotateAngle(leg3, 0.0F, -0.2618F, -0.3491F);
        this.leg3.cubeList.add(new ModelBox(leg3, 11, 19, 0.0F, -0.5F, -0.5F, 3, 1, 1, 0.0F, false));

        this.legj3 = new AdvancedModelRenderer(this);
        this.legj3.setRotationPoint(3.0F, 0.0F, 0.0F);
        this.leg3.addChild(legj3);
        this.setRotateAngle(legj3, 0.0F, 0.0F, 1.1345F);
        this.legj3.cubeList.add(new ModelBox(legj3, 0, 18, 0.0F, -0.5F, -0.51F, 3, 1, 1, 0.0F, false));

        this.leg7 = new AdvancedModelRenderer(this);
        this.leg7.setRotationPoint(-2.0F, 0.5F, -1.5F);
        this.cephalothorax.addChild(leg7);
        this.setRotateAngle(leg7, 0.0F, 0.2618F, 0.3491F);
        this.leg7.cubeList.add(new ModelBox(leg7, 11, 19, -3.0F, -0.5F, -0.5F, 3, 1, 1, 0.0F, true));

        this.legj7 = new AdvancedModelRenderer(this);
        this.legj7.setRotationPoint(-3.0F, 0.0F, 0.0F);
        this.leg7.addChild(legj7);
        this.setRotateAngle(legj7, 0.0F, 0.0F, -1.1345F);
        this.legj7.cubeList.add(new ModelBox(legj7, 0, 18, -3.0F, -0.5F, -0.51F, 3, 1, 1, 0.0F, true));

        this.leg4 = new AdvancedModelRenderer(this);
        this.leg4.setRotationPoint(2.0F, 0.5F, -0.5F);
        this.cephalothorax.addChild(leg4);
        this.setRotateAngle(leg4, 0.0F, -0.6981F, -0.3491F);
        this.leg4.cubeList.add(new ModelBox(leg4, 11, 19, 0.0F, -0.5F, -0.5F, 3, 1, 1, 0.0F, false));

        this.legj4 = new AdvancedModelRenderer(this);
        this.legj4.setRotationPoint(3.0F, 0.0F, 0.0F);
        this.leg4.addChild(legj4);
        this.setRotateAngle(legj4, 0.0F, 0.0F, 1.1345F);
        this.legj4.cubeList.add(new ModelBox(legj4, 0, 18, 0.0F, -0.5F, -0.51F, 3, 1, 1, 0.0F, false));

        this.leg8 = new AdvancedModelRenderer(this);
        this.leg8.setRotationPoint(-2.0F, 0.5F, -0.5F);
        this.cephalothorax.addChild(leg8);
        this.setRotateAngle(leg8, 0.0F, 0.6981F, 0.3491F);
        this.leg8.cubeList.add(new ModelBox(leg8, 11, 19, -3.0F, -0.5F, -0.5F, 3, 1, 1, 0.0F, true));

        this.legj8 = new AdvancedModelRenderer(this);
        this.legj8.setRotationPoint(-3.0F, 0.0F, 0.0F);
        this.leg8.addChild(legj8);
        this.setRotateAngle(legj8, 0.0F, 0.0F, -1.1345F);
        this.legj8.cubeList.add(new ModelBox(legj8, 0, 18, -3.0F, -0.5F, -0.51F, 3, 1, 1, 0.0F, true));

        this.jawL2 = new AdvancedModelRenderer(this);
        this.jawL2.setRotationPoint(-0.5F, 0.0F, -4.0F);
        this.cephalothorax.addChild(jawL2);
        this.setRotateAngle(jawL2, 0.2182F, 0.0F, 0.0F);
        this.jawL2.cubeList.add(new ModelBox(jawL2, 0, 8, 0.0F, -0.5F, -2.0F, 0, 2, 2, 0.0F, false));

        this.jawL = new AdvancedModelRenderer(this);
        this.jawL.setRotationPoint(0.5F, 0.0F, -4.0F);
        this.cephalothorax.addChild(jawL);
        this.setRotateAngle(jawL, 0.2182F, 0.0F, 0.0F);
        this.jawL.cubeList.add(new ModelBox(jawL, 0, 10, 0.0F, -0.5F, -2.0F, 0, 2, 2, 0.0F, false));

        this.pedipalpR = new AdvancedModelRenderer(this);
        this.pedipalpR.setRotationPoint(-1.5F, 0.5F, -4.0F);
        this.cephalothorax.addChild(pedipalpR);
        this.setRotateAngle(pedipalpR, 0.0F, 0.2618F, 0.0F);
        this.pedipalpR.cubeList.add(new ModelBox(pedipalpR, 0, 0, 0.0F, -0.5F, -3.0F, 0, 2, 3, 0.0F, false));

        this.pedipalpL = new AdvancedModelRenderer(this);
        this.pedipalpL.setRotationPoint(1.5F, 0.5F, -4.0F);
        this.cephalothorax.addChild(pedipalpL);
        this.setRotateAngle(pedipalpL, 0.0F, -0.2618F, 0.0F);
        this.pedipalpL.cubeList.add(new ModelBox(pedipalpL, 0, 5, 0.0F, -0.5F, -3.0F, 0, 2, 3, 0.0F, false));

        this.abdomen = new AdvancedModelRenderer(this);
        this.abdomen.setRotationPoint(0.0F, -2.0F, -2.0F);
        this.body.addChild(abdomen);
        this.abdomen.cubeList.add(new ModelBox(abdomen, 0, 8, -2.0F, -1.5F, 0.0F, 4, 1, 6, 0.0F, false));
        this.abdomen.cubeList.add(new ModelBox(abdomen, 0, 0, -3.0F, -1.0F, 0.0F, 6, 2, 6, 0.0F, false));
        this.abdomen.cubeList.add(new ModelBox(abdomen, 10, 21, -2.0F, -1.0F, 6.0F, 4, 2, 1, 0.0F, false));

        this.attercopus_tail = new AdvancedModelRenderer(this);
        this.attercopus_tail.setRotationPoint(0.0F, 0.0F, 7.0F);
        this.abdomen.addChild(attercopus_tail);
        this.attercopus_tail.cubeList.add(new ModelBox(attercopus_tail, 0, 7, 0.0F, -0.5F, 0.0F, 0, 1, 8, 0.0F, false));
         */

        updateDefaultPose();
    }

    @Override
    public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        this.body.render(f5);
    }

    public void renderStatic(float f) {
        //GlStateManager.pushMatrix();
        //GlStateManager.enableBlend();
        //GlStateManager.disableCull();
        //GlStateManager.blendFunc(GlStateManager.SourceFactor.SRC_ALPHA, GlStateManager.DestFactor.ONE_MINUS_SRC_ALPHA);
        this.body.offsetY = 0.165F;
        this.body.render(0.015f);
        //GlStateManager.enableCull();
        //GlStateManager.disableBlend();
        //GlStateManager.popMatrix();
    }

    @Override
    public void renderStaticBook(float f) {

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
        //this.body.offsetY = 1F;

        this.body.rotateAngleY = f3 * 0.017453292F;

        //this.body.rotateAngleY = f3 / (180F / (float) Math.PI);
        EntityPrehistoricFloraLandClimbingBase ee = (EntityPrehistoricFloraLandClimbingBase) e;
        if ((f3 == 0.0F || !ee.getIsMoving()) && (!ee.getIsClimbing() || ee.getHeadCollided())) {
            return;
        }

        /* OLD ANIMATION:
        this.leg1.flap(0.5F, 0.5F, false, 0F, 1F, f2, 1F);
        this.leg5.flap(0.5F, 0.5F, true, 3F, 1F, f2, 1F);

        this.leg2.flap(0.5F, 0.5F, false, 1F, 1F, f2, 1F);
        this.leg6.flap(0.5F, 0.5F, true, 1F, 1F, f2, 1F);

        this.leg3.flap(0.5F, 0.5F, false, 2F, 1F, f2, 1F);
        this.leg7.flap(0.5F, 0.5F, true, 2F, 1F, f2, 1F);

        this.leg4.flap(0.5F, 0.5F, false, 3F, 1F, f2, 1F);
        this.leg8.flap(0.5F, 0.5F, true, 0F, 1F, f2, 1F);


        this.legj1.flap(0.5F, 0.8F, true, 2F, 1F, f2, 0.5F);
        this.legj5.flap(0.5F, 0.8F, false, 1F, 1F, f2, 0.5F);

        this.legj2.flap(0.5F, 0.8F, true, 3F, 1F, f2, 0.5F);
        this.legj6.flap(0.5F, 0.8F, false, 3F, 1F, f2, 0.5F);

        this.legj3.flap(0.5F, 0.8F, true, 0F, 1F, f2, 0.5F);
        this.legj7.flap(0.5F, 0.8F, false, 0F, 1F, f2, 0.5F);

        this.legj4.flap(0.5F, 0.8F, true, 1F, 1F, f2, 0.5F);
        this.legj8.flap(0.5F, 0.8F, false, 2F, 1F, f2, 0.5F);


        this.leg1.swing(0.5F, 0.3F, false, 2F, 0F, f2, 1F);
        this.leg5.swing(0.5F, 0.3F, true, 1F, 0F, f2, 1F);

        this.leg2.swing(0.5F, 0.3F, false, 3F, 0F, f2, 1F);
        this.leg6.swing(0.5F, 0.3F, true, 3F, 0F, f2, 1F);

        this.leg3.swing(0.5F, 0.3F, false, 0, 0F, f2, 1F);
        this.leg7.swing(0.5F, 0.3F, true, 0, 0F, f2, 1F);

        this.leg4.swing(0.5F, 0.3F, false, 1F, 0F, f2, 1F);
        this.leg8.swing(0.5F, 0.3F, true, 2F, 0F, f2, 1F);
         */

    }

    @Override
    public void setLivingAnimations(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime) {
        super.setLivingAnimations(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime);
        this.resetToDefaultPose();
        EntityPrehistoricFloraLandClimbingBase ee = (EntityPrehistoricFloraLandClimbingBase) entitylivingbaseIn;

        if (!ee.isReallyInWater()) {
            if (ee.getIsMoving()) {
                animWalking(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime);
            }
        }
        else {
            //Swimming pose:
            if (!ee.getIsMoving()) { //static in water
                //
            }
            //moving in water
            animWalking(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime);
        }

    }

    public void animWalking(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime) {
        EntityPrehistoricFloraLandClimbingBase entity = (EntityPrehistoricFloraLandClimbingBase) entitylivingbaseIn;

        int animCycle = 19;
        double tickAnim = (entity.ticksExisted + entity.getTickOffset()) - (int) (Math.floor((double) (entity.ticksExisted + entity.getTickOffset()) / (double) animCycle) * (double) animCycle) + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;

        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0D + (((tickAnim - 0D) / 10D) * (0D-(0D)));
            yy = 15D + (((tickAnim - 0D) / 10D) * (-12.5D-(15D)));
            zz = 0D + (((tickAnim - 0D) / 10D) * (0D-(0D)));
        }
        else if (tickAnim >= 10 && tickAnim < 19) {
            xx = 0D + (((tickAnim - 10D) / 9D) * (0D-(0D)));
            yy = -12.5D + (((tickAnim - 10D) / 9D) * (15D-(-12.5D)));
            zz = 0D + (((tickAnim - 10D) / 9D) * (0D-(0D)));
        }
        this.setRotateAngle(pedipalpR, pedipalpR.rotateAngleX + (float) Math.toRadians(xx), pedipalpR.rotateAngleY + (float) Math.toRadians(yy), pedipalpR.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0D + (((tickAnim - 0D) / 10D) * (0D-(0D)));
            yy = -15D + (((tickAnim - 0D) / 10D) * (12.5D-(-15D)));
            zz = 0D + (((tickAnim - 0D) / 10D) * (0D-(0D)));
        }
        else if (tickAnim >= 10 && tickAnim < 19) {
            xx = 0D + (((tickAnim - 10D) / 9D) * (0D-(0D)));
            yy = 12.5D + (((tickAnim - 10D) / 9D) * (-15D-(12.5D)));
            zz = 0D + (((tickAnim - 10D) / 9D) * (0D-(0D)));
        }
        this.setRotateAngle(pedipalpL, pedipalpL.rotateAngleX + (float) Math.toRadians(xx), pedipalpL.rotateAngleY + (float) Math.toRadians(yy), pedipalpL.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 2) {
            xx = 15.40179D + (((tickAnim - 0D) / 2D) * (-6.39101D-(15.40179D)));
            yy = -4.77412D + (((tickAnim - 0D) / 2D) * (-5.02699D-(-4.77412D)));
            zz = 1.53962D + (((tickAnim - 0D) / 2D) * (-13.16731D-(1.53962D)));
        }
        else if (tickAnim >= 2 && tickAnim < 5) {
            xx = -6.39101D + (((tickAnim - 2D) / 3D) * (-20.81527D-(-6.39101D)));
            yy = -5.02699D + (((tickAnim - 2D) / 3D) * (12.87034D-(-5.02699D)));
            zz = -13.16731D + (((tickAnim - 2D) / 3D) * (-2.85695D-(-13.16731D)));
        }
        else if (tickAnim >= 5 && tickAnim < 10) {
            xx = -20.81527D + (((tickAnim - 5D) / 5D) * (15.40179D-(-20.81527D)));
            yy = 12.87034D + (((tickAnim - 5D) / 5D) * (-4.77412D-(12.87034D)));
            zz = -2.85695D + (((tickAnim - 5D) / 5D) * (1.53962D-(-2.85695D)));
        }
        else if (tickAnim >= 10 && tickAnim < 12) {
            xx = 15.40179D + (((tickAnim - 10D) / 2D) * (-6.39101D-(15.40179D)));
            yy = -4.77412D + (((tickAnim - 10D) / 2D) * (-5.02699D-(-4.77412D)));
            zz = 1.53962D + (((tickAnim - 10D) / 2D) * (-13.16731D-(1.53962D)));
        }
        else if (tickAnim >= 12 && tickAnim < 14) {
            xx = -6.39101D + (((tickAnim - 12D) / 2D) * (-20.81527D-(-6.39101D)));
            yy = -5.02699D + (((tickAnim - 12D) / 2D) * (12.87034D-(-5.02699D)));
            zz = -13.16731D + (((tickAnim - 12D) / 2D) * (-2.85695D-(-13.16731D)));
        }
        else if (tickAnim >= 14 && tickAnim < 19) {
            xx = -20.81527D + (((tickAnim - 14D) / 5D) * (15.40179D-(-20.81527D)));
            yy = 12.87034D + (((tickAnim - 14D) / 5D) * (-4.77412D-(12.87034D)));
            zz = -2.85695D + (((tickAnim - 14D) / 5D) * (1.53962D-(-2.85695D)));
        }
        this.setRotateAngle(legL1, legL1.rotateAngleX + (float) Math.toRadians(xx), legL1.rotateAngleY + (float) Math.toRadians(yy), legL1.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 5) {
            xx = -23.44798D + (((tickAnim - 0D) / 5D) * (-6.92861D-(-23.44798D)));
            yy = -6.27355D + (((tickAnim - 0D) / 5D) * (17.66893D-(-6.27355D)));
            zz = -4.39514D + (((tickAnim - 0D) / 5D) * (-8.55821D-(-4.39514D)));
        }
        else if (tickAnim >= 5 && tickAnim < 7) {
            xx = -6.92861D + (((tickAnim - 5D) / 2D) * (-16.27888D-(-6.92861D)));
            yy = 17.66893D + (((tickAnim - 5D) / 2D) * (16.91458D-(17.66893D)));
            zz = -8.55821D + (((tickAnim - 5D) / 2D) * (3.55757D-(-8.55821D)));
        }
        else if (tickAnim >= 7 && tickAnim < 10) {
            xx = -16.27888D + (((tickAnim - 7D) / 3D) * (-23.44798D-(-16.27888D)));
            yy = 16.91458D + (((tickAnim - 7D) / 3D) * (-6.27355D-(16.91458D)));
            zz = 3.55757D + (((tickAnim - 7D) / 3D) * (-4.39514D-(3.55757D)));
        }
        else if (tickAnim >= 10 && tickAnim < 14) {
            xx = -23.44798D + (((tickAnim - 10D) / 4D) * (-6.92861D-(-23.44798D)));
            yy = -6.27355D + (((tickAnim - 10D) / 4D) * (17.66893D-(-6.27355D)));
            zz = -4.39514D + (((tickAnim - 10D) / 4D) * (-8.55821D-(-4.39514D)));
        }
        else if (tickAnim >= 14 && tickAnim < 17) {
            xx = -6.92861D + (((tickAnim - 14D) / 3D) * (-16.27888D-(-6.92861D)));
            yy = 17.66893D + (((tickAnim - 14D) / 3D) * (16.91458D-(17.66893D)));
            zz = -8.55821D + (((tickAnim - 14D) / 3D) * (3.55757D-(-8.55821D)));
        }
        else if (tickAnim >= 17 && tickAnim < 19) {
            xx = -16.27888D + (((tickAnim - 17D) / 2D) * (-23.44798D-(-16.27888D)));
            yy = 16.91458D + (((tickAnim - 17D) / 2D) * (-6.27355D-(16.91458D)));
            zz = 3.55757D + (((tickAnim - 17D) / 2D) * (-4.39514D-(3.55757D)));
        }
        this.setRotateAngle(LegR1, LegR1.rotateAngleX + (float) Math.toRadians(xx), LegR1.rotateAngleY + (float) Math.toRadians(yy), LegR1.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 5) {
            xx = -27.5D + (((tickAnim - 0D) / 5D) * (12.64505D-(-27.5D)));
            yy = 0D + (((tickAnim - 0D) / 5D) * (-8.91829D-(0D)));
            zz = 2.5D + (((tickAnim - 0D) / 5D) * (-1.44905D-(2.5D)));
        }
        else if (tickAnim >= 5 && tickAnim < 7) {
            xx = 12.64505D + (((tickAnim - 5D) / 2D) * (-9.74696D-(12.64505D)));
            yy = -8.91829D + (((tickAnim - 5D) / 2D) * (-6.84198D-(-8.91829D)));
            zz = -1.44905D + (((tickAnim - 5D) / 2D) * (-14.46465D-(-1.44905D)));
        }
        else if (tickAnim >= 7 && tickAnim < 10) {
            xx = -9.74696D + (((tickAnim - 7D) / 3D) * (-27.5D-(-9.74696D)));
            yy = -6.84198D + (((tickAnim - 7D) / 3D) * (0D-(-6.84198D)));
            zz = -14.46465D + (((tickAnim - 7D) / 3D) * (2.5D-(-14.46465D)));
        }
        else if (tickAnim >= 10 && tickAnim < 14) {
            xx = -27.5D + (((tickAnim - 10D) / 4D) * (12.64505D-(-27.5D)));
            yy = 0D + (((tickAnim - 10D) / 4D) * (-8.91829D-(0D)));
            zz = 2.5D + (((tickAnim - 10D) / 4D) * (-1.44905D-(2.5D)));
        }
        else if (tickAnim >= 14 && tickAnim < 17) {
            xx = 12.64505D + (((tickAnim - 14D) / 3D) * (-9.74696D-(12.64505D)));
            yy = -8.91829D + (((tickAnim - 14D) / 3D) * (-6.84198D-(-8.91829D)));
            zz = -1.44905D + (((tickAnim - 14D) / 3D) * (-14.46465D-(-1.44905D)));
        }
        else if (tickAnim >= 17 && tickAnim < 19) {
            xx = -9.74696D + (((tickAnim - 17D) / 2D) * (-27.5D-(-9.74696D)));
            yy = -6.84198D + (((tickAnim - 17D) / 2D) * (0D-(-6.84198D)));
            zz = -14.46465D + (((tickAnim - 17D) / 2D) * (2.5D-(-14.46465D)));
        }
        this.setRotateAngle(legL2, legL2.rotateAngleX + (float) Math.toRadians(xx), legL2.rotateAngleY + (float) Math.toRadians(yy), legL2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 2) {
            xx = 23.61274D + (((tickAnim - 0D) / 2D) * (9.19427D-(23.61274D)));
            yy = 1.91909D + (((tickAnim - 0D) / 2D) * (-12.79886D-(1.91909D)));
            zz = -2.24938D + (((tickAnim - 0D) / 2D) * (17.54458D-(-2.24938D)));
        }
        else if (tickAnim >= 2 && tickAnim < 5) {
            xx = 9.19427D + (((tickAnim - 2D) / 3D) * (8.97345D-(9.19427D)));
            yy = -12.79886D + (((tickAnim - 2D) / 3D) * (-21.10749D-(-12.79886D)));
            zz = 17.54458D + (((tickAnim - 2D) / 3D) * (4.78677D-(17.54458D)));
        }
        else if (tickAnim >= 5 && tickAnim < 10) {
            xx = 8.97345D + (((tickAnim - 5D) / 5D) * (23.61274D-(8.97345D)));
            yy = -21.10749D + (((tickAnim - 5D) / 5D) * (1.91909D-(-21.10749D)));
            zz = 4.78677D + (((tickAnim - 5D) / 5D) * (-2.24938D-(4.78677D)));
        }
        else if (tickAnim >= 10 && tickAnim < 12) {
            xx = 23.61274D + (((tickAnim - 10D) / 2D) * (9.19427D-(23.61274D)));
            yy = 1.91909D + (((tickAnim - 10D) / 2D) * (-12.79886D-(1.91909D)));
            zz = -2.24938D + (((tickAnim - 10D) / 2D) * (17.54458D-(-2.24938D)));
        }
        else if (tickAnim >= 12 && tickAnim < 14) {
            xx = 9.19427D + (((tickAnim - 12D) / 2D) * (8.97345D-(9.19427D)));
            yy = -12.79886D + (((tickAnim - 12D) / 2D) * (-21.10749D-(-12.79886D)));
            zz = 17.54458D + (((tickAnim - 12D) / 2D) * (4.78677D-(17.54458D)));
        }
        else if (tickAnim >= 14 && tickAnim < 19) {
            xx = 8.97345D + (((tickAnim - 14D) / 5D) * (23.61274D-(8.97345D)));
            yy = -21.10749D + (((tickAnim - 14D) / 5D) * (1.91909D-(-21.10749D)));
            zz = 4.78677D + (((tickAnim - 14D) / 5D) * (-2.24938D-(4.78677D)));
        }
        this.setRotateAngle(legR2, legR2.rotateAngleX + (float) Math.toRadians(xx), legR2.rotateAngleY + (float) Math.toRadians(yy), legR2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 2) {
            xx = -0.56717D + (((tickAnim - 0D) / 2D) * (-6.90436D-(-0.56717D)));
            yy = -7.0578D + (((tickAnim - 0D) / 2D) * (14.35705D-(-7.0578D)));
            zz = 1.35189D + (((tickAnim - 0D) / 2D) * (-13.74855D-(1.35189D)));
        }
        else if (tickAnim >= 2 && tickAnim < 5) {
            xx = -6.90436D + (((tickAnim - 2D) / 3D) * (-13.13466D-(-6.90436D)));
            yy = 14.35705D + (((tickAnim - 2D) / 3D) * (19.31312D-(14.35705D)));
            zz = -13.74855D + (((tickAnim - 2D) / 3D) * (-3.74512D-(-13.74855D)));
        }
        else if (tickAnim >= 5 && tickAnim < 10) {
            xx = -13.13466D + (((tickAnim - 5D) / 5D) * (-0.56717D-(-13.13466D)));
            yy = 19.31312D + (((tickAnim - 5D) / 5D) * (-7.0578D-(19.31312D)));
            zz = -3.74512D + (((tickAnim - 5D) / 5D) * (1.35189D-(-3.74512D)));
        }
        else if (tickAnim >= 10 && tickAnim < 12) {
            xx = -0.56717D + (((tickAnim - 10D) / 2D) * (-6.90436D-(-0.56717D)));
            yy = -7.0578D + (((tickAnim - 10D) / 2D) * (14.35705D-(-7.0578D)));
            zz = 1.35189D + (((tickAnim - 10D) / 2D) * (-13.74855D-(1.35189D)));
        }
        else if (tickAnim >= 12 && tickAnim < 14) {
            xx = -6.90436D + (((tickAnim - 12D) / 2D) * (-13.13466D-(-6.90436D)));
            yy = 14.35705D + (((tickAnim - 12D) / 2D) * (19.31312D-(14.35705D)));
            zz = -13.74855D + (((tickAnim - 12D) / 2D) * (-3.74512D-(-13.74855D)));
        }
        else if (tickAnim >= 14 && tickAnim < 19) {
            xx = -13.13466D + (((tickAnim - 14D) / 5D) * (-0.56717D-(-13.13466D)));
            yy = 19.31312D + (((tickAnim - 14D) / 5D) * (-7.0578D-(19.31312D)));
            zz = -3.74512D + (((tickAnim - 14D) / 5D) * (1.35189D-(-3.74512D)));
        }
        this.setRotateAngle(legL3, legL3.rotateAngleX + (float) Math.toRadians(xx), legL3.rotateAngleY + (float) Math.toRadians(yy), legL3.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 5) {
            xx = 0.67114D + (((tickAnim - 0D) / 5D) * (6.89603D-(0.67114D)));
            yy = -20.72052D + (((tickAnim - 0D) / 5D) * (14.56519D-(-20.72052D)));
            zz = -4.89851D + (((tickAnim - 0D) / 5D) * (1.62784D-(-4.89851D)));
        }
        else if (tickAnim >= 5 && tickAnim < 7) {
            xx = 6.89603D + (((tickAnim - 5D) / 2D) * (4.10637D-(6.89603D)));
            yy = 14.56519D + (((tickAnim - 5D) / 2D) * (-13.5181D-(14.56519D)));
            zz = 1.62784D + (((tickAnim - 5D) / 2D) * (9.15464D-(1.62784D)));
        }
        else if (tickAnim >= 7 && tickAnim < 10) {
            xx = 4.10637D + (((tickAnim - 7D) / 3D) * (0.67114D-(4.10637D)));
            yy = -13.5181D + (((tickAnim - 7D) / 3D) * (-20.72052D-(-13.5181D)));
            zz = 9.15464D + (((tickAnim - 7D) / 3D) * (-4.89851D-(9.15464D)));
        }
        else if (tickAnim >= 10 && tickAnim < 14) {
            xx = 0.67114D + (((tickAnim - 10D) / 4D) * (6.89603D-(0.67114D)));
            yy = -20.72052D + (((tickAnim - 10D) / 4D) * (14.56519D-(-20.72052D)));
            zz = -4.89851D + (((tickAnim - 10D) / 4D) * (1.62784D-(-4.89851D)));
        }
        else if (tickAnim >= 14 && tickAnim < 17) {
            xx = 6.89603D + (((tickAnim - 14D) / 3D) * (4.10637D-(6.89603D)));
            yy = 14.56519D + (((tickAnim - 14D) / 3D) * (-13.5181D-(14.56519D)));
            zz = 1.62784D + (((tickAnim - 14D) / 3D) * (9.15464D-(1.62784D)));
        }
        else if (tickAnim >= 17 && tickAnim < 19) {
            xx = 4.10637D + (((tickAnim - 17D) / 2D) * (0.67114D-(4.10637D)));
            yy = -13.5181D + (((tickAnim - 17D) / 2D) * (-20.72052D-(-13.5181D)));
            zz = 9.15464D + (((tickAnim - 17D) / 2D) * (-4.89851D-(9.15464D)));
        }
        this.setRotateAngle(legR3, legR3.rotateAngleX + (float) Math.toRadians(xx), legR3.rotateAngleY + (float) Math.toRadians(yy), legR3.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 5) {
            xx = -12.567D + (((tickAnim - 0D) / 5D) * (-1.40418D-(-12.567D)));
            yy = 15.20462D + (((tickAnim - 0D) / 5D) * (-13.66415D-(15.20462D)));
            zz = 7.55677D + (((tickAnim - 0D) / 5D) * (-11.77164D-(7.55677D)));
        }
        else if (tickAnim >= 5 && tickAnim < 7) {
            xx = -1.40418D + (((tickAnim - 5D) / 2D) * (-1.42561D-(-1.40418D)));
            yy = -13.66415D + (((tickAnim - 5D) / 2D) * (13.05023D-(-13.66415D)));
            zz = -11.77164D + (((tickAnim - 5D) / 2D) * (-13.1821D-(-11.77164D)));
        }
        else if (tickAnim >= 7 && tickAnim < 10) {
            xx = -1.42561D + (((tickAnim - 7D) / 3D) * (-12.567D-(-1.42561D)));
            yy = 13.05023D + (((tickAnim - 7D) / 3D) * (15.20462D-(13.05023D)));
            zz = -13.1821D + (((tickAnim - 7D) / 3D) * (7.55677D-(-13.1821D)));
        }
        else if (tickAnim >= 10 && tickAnim < 14) {
            xx = -12.567D + (((tickAnim - 10D) / 4D) * (-1.40418D-(-12.567D)));
            yy = 15.20462D + (((tickAnim - 10D) / 4D) * (-13.66415D-(15.20462D)));
            zz = 7.55677D + (((tickAnim - 10D) / 4D) * (-11.77164D-(7.55677D)));
        }
        else if (tickAnim >= 14 && tickAnim < 17) {
            xx = -1.40418D + (((tickAnim - 14D) / 3D) * (-1.42561D-(-1.40418D)));
            yy = -13.66415D + (((tickAnim - 14D) / 3D) * (13.05023D-(-13.66415D)));
            zz = -11.77164D + (((tickAnim - 14D) / 3D) * (-13.1821D-(-11.77164D)));
        }
        else if (tickAnim >= 17 && tickAnim < 19) {
            xx = -1.42561D + (((tickAnim - 17D) / 2D) * (-12.567D-(-1.42561D)));
            yy = 13.05023D + (((tickAnim - 17D) / 2D) * (15.20462D-(13.05023D)));
            zz = -13.1821D + (((tickAnim - 17D) / 2D) * (7.55677D-(-13.1821D)));
        }
        this.setRotateAngle(legL4, legL4.rotateAngleX + (float) Math.toRadians(xx), legL4.rotateAngleY + (float) Math.toRadians(yy), legL4.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 2) {
            xx = 10.01984D + (((tickAnim - 0D) / 2D) * (11.35101D-(10.01984D)));
            yy = 18.55361D + (((tickAnim - 0D) / 2D) * (-10.38979D-(18.55361D)));
            zz = 12.11895D + (((tickAnim - 0D) / 2D) * (14.93308D-(12.11895D)));
        }
        else if (tickAnim >= 2 && tickAnim < 5) {
            xx = 11.35101D + (((tickAnim - 2D) / 3D) * (-0.26576D-(11.35101D)));
            yy = -10.38979D + (((tickAnim - 2D) / 3D) * (-16.90645D-(-10.38979D)));
            zz = 14.93308D + (((tickAnim - 2D) / 3D) * (-6.03387D-(14.93308D)));
        }
        else if (tickAnim >= 5 && tickAnim < 10) {
            xx = -0.26576D + (((tickAnim - 5D) / 5D) * (4.87744D-(-0.26576D)));
            yy = -16.90645D + (((tickAnim - 5D) / 5D) * (15.16778D-(-16.90645D)));
            zz = -6.03387D + (((tickAnim - 5D) / 5D) * (5.79635D-(-6.03387D)));
        }
        else if (tickAnim >= 10 && tickAnim < 12) {
            xx = 4.87744D + (((tickAnim - 10D) / 2D) * (11.35101D-(4.87744D)));
            yy = 15.16778D + (((tickAnim - 10D) / 2D) * (-10.38979D-(15.16778D)));
            zz = 5.79635D + (((tickAnim - 10D) / 2D) * (14.93308D-(5.79635D)));
        }
        else if (tickAnim >= 12 && tickAnim < 14) {
            xx = 11.35101D + (((tickAnim - 12D) / 2D) * (-0.26576D-(11.35101D)));
            yy = -10.38979D + (((tickAnim - 12D) / 2D) * (-16.90645D-(-10.38979D)));
            zz = 14.93308D + (((tickAnim - 12D) / 2D) * (-6.03387D-(14.93308D)));
        }
        else if (tickAnim >= 14 && tickAnim < 19) {
            xx = -0.26576D + (((tickAnim - 14D) / 5D) * (4.87744D-(-0.26576D)));
            yy = -16.90645D + (((tickAnim - 14D) / 5D) * (15.16778D-(-16.90645D)));
            zz = -6.03387D + (((tickAnim - 14D) / 5D) * (5.79635D-(-6.03387D)));
        }
        this.setRotateAngle(legR4, legR4.rotateAngleX + (float) Math.toRadians(xx), legR4.rotateAngleY + (float) Math.toRadians(yy), legR4.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0D + (((tickAnim - 0D) / 10D) * (-5D-(0D)));
            yy = 0D + (((tickAnim - 0D) / 10D) * (0D-(0D)));
            zz = 0D + (((tickAnim - 0D) / 10D) * (0D-(0D)));
        }
        else if (tickAnim >= 10 && tickAnim < 19) {
            xx = -5D + (((tickAnim - 10D) / 9D) * (0D-(-5D)));
            yy = 0D + (((tickAnim - 10D) / 9D) * (0D-(0D)));
            zz = 0D + (((tickAnim - 10D) / 9D) * (0D-(0D)));
        }
        this.setRotateAngle(abdomen, abdomen.rotateAngleX + (float) Math.toRadians(xx), abdomen.rotateAngleY + (float) Math.toRadians(yy), abdomen.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0D + (((tickAnim - 0D) / 10D) * (0D-(0D)));
            yy = 7.5D + (((tickAnim - 0D) / 10D) * (-7.5D-(7.5D)));
            zz = 0D + (((tickAnim - 0D) / 10D) * (0D-(0D)));
        }
        else if (tickAnim >= 10 && tickAnim < 19) {
            xx = 0D + (((tickAnim - 10D) / 9D) * (0D-(0D)));
            yy = -7.5D + (((tickAnim - 10D) / 9D) * (7.5D-(-7.5D)));
            zz = 0D + (((tickAnim - 10D) / 9D) * (0D-(0D)));
        }
        this.setRotateAngle(tailattercopus, tailattercopus.rotateAngleX + (float) Math.toRadians(xx), tailattercopus.rotateAngleY + (float) Math.toRadians(yy), tailattercopus.rotateAngleZ + (float) Math.toRadians(zz));


    }

}
