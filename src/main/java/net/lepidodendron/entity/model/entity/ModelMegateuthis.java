package net.lepidodendron.entity.model.entity;

import net.ilexiconn.llibrary.client.model.tools.AdvancedModelRenderer;
import net.lepidodendron.entity.EntityPrehistoricFloraMegactenopetalus;
import net.lepidodendron.entity.EntityPrehistoricFloraMegateuthis;
import net.lepidodendron.entity.EntityPrehistoricFloraProteroctopus;
import net.lepidodendron.entity.model.llibraryextensions.AdvancedModelBaseExtended;
import net.lepidodendron.entity.model.llibraryextensions.AdvancedModelRendererExtended;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

public class ModelMegateuthis extends AdvancedModelBaseExtended {
    private final AdvancedModelRendererExtended body;
    private final AdvancedModelRendererExtended finbaseR;
    private final AdvancedModelRendererExtended finR;
    private final AdvancedModelRendererExtended finR2;
    private final AdvancedModelRendererExtended finR3;
    private final AdvancedModelRendererExtended finR4;
    private final AdvancedModelRendererExtended finR5;
    private final AdvancedModelRendererExtended finbaseL;
    private final AdvancedModelRendererExtended finL;
    private final AdvancedModelRendererExtended finL2;
    private final AdvancedModelRendererExtended finL3;
    private final AdvancedModelRendererExtended finL4;
    private final AdvancedModelRendererExtended finL5;
    private final AdvancedModelRendererExtended body2;
    private final AdvancedModelRendererExtended cube_r1;
    private final AdvancedModelRendererExtended cube_r2;
    private final AdvancedModelRendererExtended siphpn;
    private final AdvancedModelRendererExtended arm;
    private final AdvancedModelRendererExtended arms;
    private final AdvancedModelRendererExtended armss;
    private final AdvancedModelRendererExtended arm6;
    private final AdvancedModelRendererExtended arms6;
    private final AdvancedModelRendererExtended armss6;
    private final AdvancedModelRendererExtended arm2;
    private final AdvancedModelRendererExtended arms2;
    private final AdvancedModelRendererExtended armss2;
    private final AdvancedModelRendererExtended arm7;
    private final AdvancedModelRendererExtended arms7;
    private final AdvancedModelRendererExtended armss7;
    private final AdvancedModelRendererExtended arm3;
    private final AdvancedModelRendererExtended arms3;
    private final AdvancedModelRendererExtended armss3;
    private final AdvancedModelRendererExtended arm8;
    private final AdvancedModelRendererExtended arms8;
    private final AdvancedModelRendererExtended armss8;
    private final AdvancedModelRendererExtended arm4;
    private final AdvancedModelRendererExtended arms4;
    private final AdvancedModelRendererExtended armss4;
    private final AdvancedModelRendererExtended arm9;
    private final AdvancedModelRendererExtended arms9;
    private final AdvancedModelRendererExtended armss9;
    private final AdvancedModelRendererExtended arm5;
    private final AdvancedModelRendererExtended arms5;
    private final AdvancedModelRendererExtended armss5;
    private final AdvancedModelRendererExtended arm10;
    private final AdvancedModelRendererExtended arms10;
    private final AdvancedModelRendererExtended armss10;

    public ModelMegateuthis() {
        this.textureWidth = 56;
        this.textureHeight = 52;

        this.body = new AdvancedModelRendererExtended(this);
        this.body.setRotationPoint(0.0F, 24.0F, 0.0F);
        this.body.cubeList.add(new ModelBox(body, 0, 0, -3.5F, -5.0F, -4.0F, 7, 5, 17, 0.0F, false));
        this.body.cubeList.add(new ModelBox(body, 19, 22, -3.0F, -4.5F, 12.0F, 6, 4, 8, 0.0F, false));
        this.body.cubeList.add(new ModelBox(body, 31, 0, -2.5F, -4.0F, 20.0F, 5, 3, 6, 0.0F, false));
        this.body.cubeList.add(new ModelBox(body, 10, 39, -1.5F, -3.5F, 26.0F, 3, 2, 3, 0.0F, false));
        this.body.cubeList.add(new ModelBox(body, 0, 22, -1.0F, -3.5F, 29.0F, 2, 2, 15, 0.0F, false));
        this.body.cubeList.add(new ModelBox(body, 9, 3, -0.5F, -3.0F, 44.0F, 1, 1, 3, 0.0F, false));

        this.finbaseR = new AdvancedModelRendererExtended(this);
        this.finbaseR.setRotationPoint(-1.0F, -3.0F, 21.5F);
        this.body.addChild(finbaseR);


        this.finR = new AdvancedModelRendererExtended(this);
        this.finR.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.finbaseR.addChild(finR);
        this.finR.cubeList.add(new ModelBox(finR, 0, 30, -4.0F, 0.0F, -1.5F, 5, 0, 3, 0.0F, false));

        this.finR2 = new AdvancedModelRendererExtended(this);
        this.finR2.setRotationPoint(0.0F, 0.0F, 3.0F);
        this.finbaseR.addChild(finR2);
        this.finR2.cubeList.add(new ModelBox(finR2, 16, 44, -7.0F, 0.0F, -1.5F, 8, 0, 3, 0.0F, false));

        this.finR3 = new AdvancedModelRendererExtended(this);
        this.finR3.setRotationPoint(0.0F, 0.0F, 6.0F);
        this.finbaseR.addChild(finR3);
        this.finR3.cubeList.add(new ModelBox(finR3, 28, 9, -7.0F, 0.0F, -1.5F, 8, 0, 3, 0.0F, false));

        this.finR4 = new AdvancedModelRendererExtended(this);
        this.finR4.setRotationPoint(0.0F, 0.0F, 9.0F);
        this.finbaseR.addChild(finR4);
        this.finR4.cubeList.add(new ModelBox(finR4, 28, 12, -6.0F, 0.0F, -1.5F, 7, 0, 3, 0.0F, false));

        this.finR5 = new AdvancedModelRendererExtended(this);
        this.finR5.setRotationPoint(0.0F, 0.0F, 12.0F);
        this.finbaseR.addChild(finR5);
        this.finR5.cubeList.add(new ModelBox(finR5, 6, 0, -3.0F, 0.0F, -1.5F, 4, 0, 3, 0.0F, false));

        this.finbaseL = new AdvancedModelRendererExtended(this);
        this.finbaseL.setRotationPoint(1.0F, -3.0F, 21.5F);
        this.body.addChild(finbaseL);


        this.finL = new AdvancedModelRendererExtended(this);
        this.finL.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.finbaseL.addChild(finL);
        this.finL.cubeList.add(new ModelBox(finL, 0, 30, -1.0F, 0.0F, -1.5F, 5, 0, 3, 0.0F, true));

        this.finL2 = new AdvancedModelRendererExtended(this);
        this.finL2.setRotationPoint(0.0F, 0.0F, 3.0F);
        this.finbaseL.addChild(finL2);
        this.finL2.cubeList.add(new ModelBox(finL2, 16, 44, -1.0F, 0.0F, -1.5F, 8, 0, 3, 0.0F, true));

        this.finL3 = new AdvancedModelRendererExtended(this);
        this.finL3.setRotationPoint(0.0F, 0.0F, 6.0F);
        this.finbaseL.addChild(finL3);
        this.finL3.cubeList.add(new ModelBox(finL3, 28, 9, -1.0F, 0.0F, -1.5F, 8, 0, 3, 0.0F, true));

        this.finL4 = new AdvancedModelRendererExtended(this);
        this.finL4.setRotationPoint(0.0F, 0.0F, 9.0F);
        this.finbaseL.addChild(finL4);
        this.finL4.cubeList.add(new ModelBox(finL4, 28, 12, -1.0F, 0.0F, -1.5F, 7, 0, 3, 0.0F, true));

        this.finL5 = new AdvancedModelRendererExtended(this);
        this.finL5.setRotationPoint(0.0F, 0.0F, 12.0F);
        this.finbaseL.addChild(finL5);
        this.finL5.cubeList.add(new ModelBox(finL5, 6, 0, -1.0F, 0.0F, -1.5F, 4, 0, 3, 0.0F, true));

        this.body2 = new AdvancedModelRendererExtended(this);
        this.body2.setRotationPoint(0.0F, -4.5F, -4.0F);
        this.body.addChild(body2);
        this.setRotateAngle(body2, 0.0873F, 0.0F, 0.0F);
        this.body2.cubeList.add(new ModelBox(body2, 29, 34, -2.5F, -0.25F, -4.0F, 5, 4, 5, 0.0F, false));

        this.cube_r1 = new AdvancedModelRendererExtended(this);
        this.cube_r1.setRotationPoint(2.75F, 0.0F, -2.0F);
        this.body2.addChild(cube_r1);
        this.setRotateAngle(cube_r1, 0.0F, 0.0F, -0.1745F);
        this.cube_r1.cubeList.add(new ModelBox(cube_r1, 39, 22, -1.3F, -0.35F, -1.5F, 2, 3, 3, 0.0F, true));

        this.cube_r2 = new AdvancedModelRendererExtended(this);
        this.cube_r2.setRotationPoint(-2.75F, 0.0F, -2.0F);
        this.body2.addChild(cube_r2);
        this.setRotateAngle(cube_r2, 0.0F, 0.0F, 0.1745F);
        this.cube_r2.cubeList.add(new ModelBox(cube_r2, 39, 22, -0.7F, -0.35F, -1.5F, 2, 3, 3, 0.0F, false));

        this.siphpn = new AdvancedModelRendererExtended(this);
        this.siphpn.setRotationPoint(0.0F, 3.5F, 0.0F);
        this.body2.addChild(siphpn);
        this.setRotateAngle(siphpn, 0.1309F, 0.0F, 0.0F);
        this.siphpn.cubeList.add(new ModelBox(siphpn, 0, 24, -1.0F, -1.0F, -4.0F, 2, 2, 4, 0.0F, false));

        this.arm = new AdvancedModelRendererExtended(this);
        this.arm.setRotationPoint(-0.55F, 0.75F, -4.0F);
        this.body2.addChild(arm);
        this.setRotateAngle(arm, -0.5672F, 0.0F, -0.0873F);
        this.arm.cubeList.add(new ModelBox(arm, 0, 9, -0.5F, -1.0F, -6.5F, 1, 1, 7, 0.01F, false));
        this.arm.cubeList.add(new ModelBox(arm, 0, 16, -0.25F, -0.5F, -6.5F, 0, 1, 7, 0.0F, false));
        this.arm.cubeList.add(new ModelBox(arm, 0, 16, 0.25F, -0.5F, -6.5F, 0, 1, 7, 0.0F, false));

        this.arms = new AdvancedModelRendererExtended(this);
        this.arms.setRotationPoint(0.0F, 0.0F, -6.5F);
        this.arm.addChild(arms);
        this.setRotateAngle(arms, 0.0436F, 0.0F, 0.0F);
        this.arms.cubeList.add(new ModelBox(arms, 0, 15, -0.25F, -0.5F, -7.0F, 0, 1, 7, 0.0F, false));
        this.arms.cubeList.add(new ModelBox(arms, 0, 15, 0.25F, -0.5F, -7.0F, 0, 1, 7, 0.0F, false));
        this.arms.cubeList.add(new ModelBox(arms, 0, 0, -0.5F, -1.0F, -7.0F, 1, 1, 7, 0.0F, false));

        this.armss = new AdvancedModelRendererExtended(this);
        this.armss.setRotationPoint(0.0F, 0.0F, -7.0F);
        this.arms.addChild(armss);
        this.setRotateAngle(armss, 0.1745F, 0.0F, 0.0F);
        this.armss.cubeList.add(new ModelBox(armss, 0, 0, -0.25F, -0.5F, -8.0F, 0, 1, 8, 0.0F, false));
        this.armss.cubeList.add(new ModelBox(armss, 0, 0, 0.25F, -0.5F, -8.0F, 0, 1, 8, 0.0F, false));
        this.armss.cubeList.add(new ModelBox(armss, 0, 39, -0.5F, -1.0F, -8.0F, 1, 1, 8, -0.01F, false));

        this.arm6 = new AdvancedModelRendererExtended(this);
        this.arm6.setRotationPoint(0.55F, 0.75F, -4.0F);
        this.body2.addChild(arm6);
        this.setRotateAngle(arm6, -0.5672F, 0.0F, 0.0873F);
        this.arm6.cubeList.add(new ModelBox(arm6, 0, 9, -0.5F, -1.0F, -6.5F, 1, 1, 7, 0.01F, true));
        this.arm6.cubeList.add(new ModelBox(arm6, 0, 16, 0.25F, -0.5F, -6.5F, 0, 1, 7, 0.0F, true));
        this.arm6.cubeList.add(new ModelBox(arm6, 0, 16, -0.25F, -0.5F, -6.5F, 0, 1, 7, 0.0F, true));

        this.arms6 = new AdvancedModelRendererExtended(this);
        this.arms6.setRotationPoint(0.0F, 0.0F, -6.5F);
        this.arm6.addChild(arms6);
        this.setRotateAngle(arms6, 0.0436F, 0.0F, 0.0F);
        this.arms6.cubeList.add(new ModelBox(arms6, 0, 15, 0.25F, -0.5F, -7.0F, 0, 1, 7, 0.0F, true));
        this.arms6.cubeList.add(new ModelBox(arms6, 0, 15, -0.25F, -0.5F, -7.0F, 0, 1, 7, 0.0F, true));
        this.arms6.cubeList.add(new ModelBox(arms6, 0, 0, -0.5F, -1.0F, -7.0F, 1, 1, 7, 0.0F, true));

        this.armss6 = new AdvancedModelRendererExtended(this);
        this.armss6.setRotationPoint(0.0F, 0.0F, -7.0F);
        this.arms6.addChild(armss6);
        this.setRotateAngle(armss6, 0.1745F, 0.0F, 0.0F);
        this.armss6.cubeList.add(new ModelBox(armss6, 0, 0, 0.25F, -0.5F, -8.0F, 0, 1, 8, 0.0F, true));
        this.armss6.cubeList.add(new ModelBox(armss6, 0, 0, -0.25F, -0.5F, -8.0F, 0, 1, 8, 0.0F, true));
        this.armss6.cubeList.add(new ModelBox(armss6, 0, 39, -0.5F, -1.0F, -8.0F, 1, 1, 8, -0.01F, true));

        this.arm2 = new AdvancedModelRendererExtended(this);
        this.arm2.setRotationPoint(-1.5F, 0.95F, -4.0F);
        this.body2.addChild(arm2);
        this.setRotateAngle(arm2, -0.5672F, 0.0F, -0.6109F);
        this.arm2.cubeList.add(new ModelBox(arm2, 0, 9, -0.5F, -1.0F, -6.5F, 1, 1, 7, 0.01F, false));
        this.arm2.cubeList.add(new ModelBox(arm2, 0, 16, -0.25F, -0.5F, -6.5F, 0, 1, 7, 0.0F, false));
        this.arm2.cubeList.add(new ModelBox(arm2, 0, 16, 0.25F, -0.5F, -6.5F, 0, 1, 7, 0.0F, false));

        this.arms2 = new AdvancedModelRendererExtended(this);
        this.arms2.setRotationPoint(0.0F, 0.0F, -6.5F);
        this.arm2.addChild(arms2);
        this.setRotateAngle(arms2, 0.0873F, 0.0F, 0.0F);
        this.arms2.cubeList.add(new ModelBox(arms2, 0, 15, -0.25F, -0.5F, -7.0F, 0, 1, 7, 0.0F, false));
        this.arms2.cubeList.add(new ModelBox(arms2, 0, 15, 0.25F, -0.5F, -7.0F, 0, 1, 7, 0.0F, false));
        this.arms2.cubeList.add(new ModelBox(arms2, 0, 0, -0.5F, -1.0F, -7.0F, 1, 1, 7, 0.0F, false));

        this.armss2 = new AdvancedModelRendererExtended(this);
        this.armss2.setRotationPoint(0.0F, 0.0F, -7.0F);
        this.arms2.addChild(armss2);
        this.setRotateAngle(armss2, 0.1745F, 0.0F, 0.0F);
        this.armss2.cubeList.add(new ModelBox(armss2, 0, 0, -0.25F, -0.5F, -8.0F, 0, 1, 8, 0.0F, false));
        this.armss2.cubeList.add(new ModelBox(armss2, 0, 0, 0.25F, -0.5F, -8.0F, 0, 1, 8, 0.0F, false));
        this.armss2.cubeList.add(new ModelBox(armss2, 0, 39, -0.5F, -1.0F, -8.0F, 1, 1, 8, -0.01F, false));

        this.arm7 = new AdvancedModelRendererExtended(this);
        this.arm7.setRotationPoint(1.5F, 0.95F, -4.0F);
        this.body2.addChild(arm7);
        this.setRotateAngle(arm7, -0.5672F, 0.0F, 0.6109F);
        this.arm7.cubeList.add(new ModelBox(arm7, 0, 9, -0.5F, -1.0F, -6.5F, 1, 1, 7, 0.01F, true));
        this.arm7.cubeList.add(new ModelBox(arm7, 0, 16, 0.25F, -0.5F, -6.5F, 0, 1, 7, 0.0F, true));
        this.arm7.cubeList.add(new ModelBox(arm7, 0, 16, -0.25F, -0.5F, -6.5F, 0, 1, 7, 0.0F, true));

        this.arms7 = new AdvancedModelRendererExtended(this);
        this.arms7.setRotationPoint(0.0F, 0.0F, -6.5F);
        this.arm7.addChild(arms7);
        this.setRotateAngle(arms7, 0.0873F, 0.0F, 0.0F);
        this.arms7.cubeList.add(new ModelBox(arms7, 0, 15, 0.25F, -0.5F, -7.0F, 0, 1, 7, 0.0F, true));
        this.arms7.cubeList.add(new ModelBox(arms7, 0, 15, -0.25F, -0.5F, -7.0F, 0, 1, 7, 0.0F, true));
        this.arms7.cubeList.add(new ModelBox(arms7, 0, 0, -0.5F, -1.0F, -7.0F, 1, 1, 7, 0.0F, true));

        this.armss7 = new AdvancedModelRendererExtended(this);
        this.armss7.setRotationPoint(0.0F, 0.0F, -7.0F);
        this.arms7.addChild(armss7);
        this.setRotateAngle(armss7, 0.1745F, 0.0F, 0.0F);
        this.armss7.cubeList.add(new ModelBox(armss7, 0, 0, 0.25F, -0.5F, -8.0F, 0, 1, 8, 0.0F, true));
        this.armss7.cubeList.add(new ModelBox(armss7, 0, 0, -0.25F, -0.5F, -8.0F, 0, 1, 8, 0.0F, true));
        this.armss7.cubeList.add(new ModelBox(armss7, 0, 39, -0.5F, -1.0F, -8.0F, 1, 1, 8, -0.01F, true));

        this.arm3 = new AdvancedModelRendererExtended(this);
        this.arm3.setRotationPoint(-2.0F, 1.75F, -4.0F);
        this.body2.addChild(arm3);
        this.setRotateAngle(arm3, -0.5672F, 0.0F, -1.4835F);
        this.arm3.cubeList.add(new ModelBox(arm3, 0, 9, -0.5F, -1.0F, -6.5F, 1, 1, 7, 0.01F, false));
        this.arm3.cubeList.add(new ModelBox(arm3, 0, 16, -0.25F, -0.5F, -6.5F, 0, 1, 7, 0.0F, false));
        this.arm3.cubeList.add(new ModelBox(arm3, 0, 16, 0.25F, -0.5F, -6.5F, 0, 1, 7, 0.0F, false));

        this.arms3 = new AdvancedModelRendererExtended(this);
        this.arms3.setRotationPoint(0.0F, 0.0F, -6.5F);
        this.arm3.addChild(arms3);
        this.setRotateAngle(arms3, 0.0873F, 0.0F, 0.0F);
        this.arms3.cubeList.add(new ModelBox(arms3, 0, 15, -0.25F, -0.5F, -7.0F, 0, 1, 7, 0.0F, false));
        this.arms3.cubeList.add(new ModelBox(arms3, 0, 15, 0.25F, -0.5F, -7.0F, 0, 1, 7, 0.0F, false));
        this.arms3.cubeList.add(new ModelBox(arms3, 0, 0, -0.5F, -1.0F, -7.0F, 1, 1, 7, 0.0F, false));

        this.armss3 = new AdvancedModelRendererExtended(this);
        this.armss3.setRotationPoint(0.0F, 0.0F, -7.0F);
        this.arms3.addChild(armss3);
        this.setRotateAngle(armss3, 0.1745F, 0.0F, 0.0F);
        this.armss3.cubeList.add(new ModelBox(armss3, 0, 0, -0.25F, -0.5F, -8.0F, 0, 1, 8, 0.0F, false));
        this.armss3.cubeList.add(new ModelBox(armss3, 0, 0, 0.25F, -0.5F, -8.0F, 0, 1, 8, 0.0F, false));
        this.armss3.cubeList.add(new ModelBox(armss3, 0, 39, -0.5F, -1.0F, -8.0F, 1, 1, 8, -0.01F, false));

        this.arm8 = new AdvancedModelRendererExtended(this);
        this.arm8.setRotationPoint(2.0F, 1.75F, -4.0F);
        this.body2.addChild(arm8);
        this.setRotateAngle(arm8, -0.5672F, 0.0F, 1.4835F);
        this.arm8.cubeList.add(new ModelBox(arm8, 0, 9, -0.5F, -1.0F, -6.5F, 1, 1, 7, 0.01F, true));
        this.arm8.cubeList.add(new ModelBox(arm8, 0, 16, 0.25F, -0.5F, -6.5F, 0, 1, 7, 0.0F, true));
        this.arm8.cubeList.add(new ModelBox(arm8, 0, 16, -0.25F, -0.5F, -6.5F, 0, 1, 7, 0.0F, true));

        this.arms8 = new AdvancedModelRendererExtended(this);
        this.arms8.setRotationPoint(0.0F, 0.0F, -6.5F);
        this.arm8.addChild(arms8);
        this.setRotateAngle(arms8, 0.0873F, 0.0F, 0.0F);
        this.arms8.cubeList.add(new ModelBox(arms8, 0, 15, 0.25F, -0.5F, -7.0F, 0, 1, 7, 0.0F, true));
        this.arms8.cubeList.add(new ModelBox(arms8, 0, 15, -0.25F, -0.5F, -7.0F, 0, 1, 7, 0.0F, true));
        this.arms8.cubeList.add(new ModelBox(arms8, 0, 0, -0.5F, -1.0F, -7.0F, 1, 1, 7, 0.0F, true));

        this.armss8 = new AdvancedModelRendererExtended(this);
        this.armss8.setRotationPoint(0.0F, 0.0F, -7.0F);
        this.arms8.addChild(armss8);
        this.setRotateAngle(armss8, 0.1745F, 0.0F, 0.0F);
        this.armss8.cubeList.add(new ModelBox(armss8, 0, 0, 0.25F, -0.5F, -8.0F, 0, 1, 8, 0.0F, true));
        this.armss8.cubeList.add(new ModelBox(armss8, 0, 0, -0.25F, -0.5F, -8.0F, 0, 1, 8, 0.0F, true));
        this.armss8.cubeList.add(new ModelBox(armss8, 0, 39, -0.5F, -1.0F, -8.0F, 1, 1, 8, -0.01F, true));

        this.arm4 = new AdvancedModelRendererExtended(this);
        this.arm4.setRotationPoint(-1.65F, 2.65F, -4.0F);
        this.body2.addChild(arm4);
        this.setRotateAngle(arm4, -0.5672F, 0.0F, -2.138F);
        this.arm4.cubeList.add(new ModelBox(arm4, 0, 9, -0.5F, -1.0F, -6.5F, 1, 1, 7, 0.01F, false));
        this.arm4.cubeList.add(new ModelBox(arm4, 0, 16, -0.25F, -0.5F, -6.5F, 0, 1, 7, 0.0F, false));
        this.arm4.cubeList.add(new ModelBox(arm4, 0, 16, 0.25F, -0.5F, -6.5F, 0, 1, 7, 0.0F, false));

        this.arms4 = new AdvancedModelRendererExtended(this);
        this.arms4.setRotationPoint(0.0F, 0.0F, -6.5F);
        this.arm4.addChild(arms4);
        this.setRotateAngle(arms4, 0.0436F, 0.0F, 0.0F);
        this.arms4.cubeList.add(new ModelBox(arms4, 0, 15, -0.25F, -0.5F, -7.0F, 0, 1, 7, 0.0F, false));
        this.arms4.cubeList.add(new ModelBox(arms4, 0, 15, 0.25F, -0.5F, -7.0F, 0, 1, 7, 0.0F, false));
        this.arms4.cubeList.add(new ModelBox(arms4, 0, 0, -0.5F, -1.0F, -7.0F, 1, 1, 7, 0.0F, false));

        this.armss4 = new AdvancedModelRendererExtended(this);
        this.armss4.setRotationPoint(0.0F, 0.0F, -7.0F);
        this.arms4.addChild(armss4);
        this.setRotateAngle(armss4, 0.1745F, 0.0F, 0.0F);
        this.armss4.cubeList.add(new ModelBox(armss4, 0, 0, -0.25F, -0.5F, -8.0F, 0, 1, 8, 0.0F, false));
        this.armss4.cubeList.add(new ModelBox(armss4, 0, 0, 0.25F, -0.5F, -8.0F, 0, 1, 8, 0.0F, false));
        this.armss4.cubeList.add(new ModelBox(armss4, 0, 39, -0.5F, -1.0F, -8.0F, 1, 1, 8, -0.01F, false));

        this.arm9 = new AdvancedModelRendererExtended(this);
        this.arm9.setRotationPoint(1.65F, 2.65F, -4.0F);
        this.body2.addChild(arm9);
        this.setRotateAngle(arm9, -0.5672F, 0.0F, 2.138F);
        this.arm9.cubeList.add(new ModelBox(arm9, 0, 9, -0.5F, -1.0F, -6.5F, 1, 1, 7, 0.01F, true));
        this.arm9.cubeList.add(new ModelBox(arm9, 0, 16, 0.25F, -0.5F, -6.5F, 0, 1, 7, 0.0F, true));
        this.arm9.cubeList.add(new ModelBox(arm9, 0, 16, -0.25F, -0.5F, -6.5F, 0, 1, 7, 0.0F, true));

        this.arms9 = new AdvancedModelRendererExtended(this);
        this.arms9.setRotationPoint(0.0F, 0.0F, -6.5F);
        this.arm9.addChild(arms9);
        this.setRotateAngle(arms9, 0.0436F, 0.0F, 0.0F);
        this.arms9.cubeList.add(new ModelBox(arms9, 0, 15, 0.25F, -0.5F, -7.0F, 0, 1, 7, 0.0F, true));
        this.arms9.cubeList.add(new ModelBox(arms9, 0, 15, -0.25F, -0.5F, -7.0F, 0, 1, 7, 0.0F, true));
        this.arms9.cubeList.add(new ModelBox(arms9, 0, 0, -0.5F, -1.0F, -7.0F, 1, 1, 7, 0.0F, true));

        this.armss9 = new AdvancedModelRendererExtended(this);
        this.armss9.setRotationPoint(0.0F, 0.0F, -7.0F);
        this.arms9.addChild(armss9);
        this.setRotateAngle(armss9, 0.1745F, 0.0F, 0.0F);
        this.armss9.cubeList.add(new ModelBox(armss9, 0, 0, 0.25F, -0.5F, -8.0F, 0, 1, 8, 0.0F, true));
        this.armss9.cubeList.add(new ModelBox(armss9, 0, 0, -0.25F, -0.5F, -8.0F, 0, 1, 8, 0.0F, true));
        this.armss9.cubeList.add(new ModelBox(armss9, 0, 39, -0.5F, -1.0F, -8.0F, 1, 1, 8, -0.01F, true));

        this.arm5 = new AdvancedModelRendererExtended(this);
        this.arm5.setRotationPoint(-1.05F, 3.1F, -4.0F);
        this.body2.addChild(arm5);
        this.setRotateAngle(arm5, -0.5672F, 0.0175F, -2.7925F);
        this.arm5.cubeList.add(new ModelBox(arm5, 0, 9, -0.5F, -1.0F, -6.5F, 1, 1, 7, 0.01F, false));
        this.arm5.cubeList.add(new ModelBox(arm5, 0, 16, -0.25F, -0.5F, -6.5F, 0, 1, 7, 0.0F, false));
        this.arm5.cubeList.add(new ModelBox(arm5, 0, 16, 0.25F, -0.5F, -6.5F, 0, 1, 7, 0.0F, false));

        this.arms5 = new AdvancedModelRendererExtended(this);
        this.arms5.setRotationPoint(0.0F, 0.0F, -6.5F);
        this.arm5.addChild(arms5);
        this.setRotateAngle(arms5, 0.0436F, 0.0F, 0.0F);
        this.arms5.cubeList.add(new ModelBox(arms5, 0, 15, -0.25F, -0.5F, -7.0F, 0, 1, 7, 0.0F, false));
        this.arms5.cubeList.add(new ModelBox(arms5, 0, 15, 0.25F, -0.5F, -7.0F, 0, 1, 7, 0.0F, false));
        this.arms5.cubeList.add(new ModelBox(arms5, 0, 0, -0.5F, -1.0F, -7.0F, 1, 1, 7, 0.0F, false));

        this.armss5 = new AdvancedModelRendererExtended(this);
        this.armss5.setRotationPoint(0.0F, 0.0F, -7.0F);
        this.arms5.addChild(armss5);
        this.setRotateAngle(armss5, 0.1745F, 0.0F, 0.0F);
        this.armss5.cubeList.add(new ModelBox(armss5, 0, 0, -0.25F, -0.5F, -8.0F, 0, 1, 8, 0.0F, false));
        this.armss5.cubeList.add(new ModelBox(armss5, 0, 0, 0.25F, -0.5F, -8.0F, 0, 1, 8, 0.0F, false));
        this.armss5.cubeList.add(new ModelBox(armss5, 0, 39, -0.5F, -1.0F, -8.0F, 1, 1, 8, -0.01F, false));

        this.arm10 = new AdvancedModelRendererExtended(this);
        this.arm10.setRotationPoint(1.05F, 3.1F, -4.0F);
        this.body2.addChild(arm10);
        this.setRotateAngle(arm10, -0.5672F, -0.0175F, 2.7925F);
        this.arm10.cubeList.add(new ModelBox(arm10, 0, 9, -0.5F, -1.0F, -6.5F, 1, 1, 7, 0.01F, true));
        this.arm10.cubeList.add(new ModelBox(arm10, 0, 16, 0.25F, -0.5F, -6.5F, 0, 1, 7, 0.0F, true));
        this.arm10.cubeList.add(new ModelBox(arm10, 0, 16, -0.25F, -0.5F, -6.5F, 0, 1, 7, 0.0F, true));

        this.arms10 = new AdvancedModelRendererExtended(this);
        this.arms10.setRotationPoint(0.0F, 0.0F, -6.5F);
        this.arm10.addChild(arms10);
        this.setRotateAngle(arms10, 0.0436F, 0.0F, 0.0F);
        this.arms10.cubeList.add(new ModelBox(arms10, 0, 15, 0.25F, -0.5F, -7.0F, 0, 1, 7, 0.0F, true));
        this.arms10.cubeList.add(new ModelBox(arms10, 0, 15, -0.25F, -0.5F, -7.0F, 0, 1, 7, 0.0F, true));
        this.arms10.cubeList.add(new ModelBox(arms10, 0, 0, -0.5F, -1.0F, -7.0F, 1, 1, 7, 0.0F, true));

        this.armss10 = new AdvancedModelRendererExtended(this);
        this.armss10.setRotationPoint(0.0F, 0.0F, -7.0F);
        this.arms10.addChild(armss10);
        this.setRotateAngle(armss10, 0.1745F, 0.0F, 0.0F);
        this.armss10.cubeList.add(new ModelBox(armss10, 0, 0, 0.25F, -0.5F, -8.0F, 0, 1, 8, 0.0F, true));
        this.armss10.cubeList.add(new ModelBox(armss10, 0, 0, -0.25F, -0.5F, -8.0F, 0, 1, 8, 0.0F, true));
        this.armss10.cubeList.add(new ModelBox(armss10, 0, 39, -0.5F, -1.0F, -8.0F, 1, 1, 8, -0.01F, true));



        updateDefaultPose();
    }

    @Override
    public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        this.body.render(f5);
    }
    public void renderStatic(float f) {
        //GlStateManager.pushMatrix();
        //GlStateManager.enableBlend();
        //GlStateManager.blendFunc(GlStateManager.SourceFactor.SRC_ALPHA, GlStateManager.DestFactor.ONE_MINUS_SRC_ALPHA);
        //GlStateManager.disableCull();
        //this.body.offsetZ = 0.1F;
        this.body.render(0.014F);
        //GlStateManager.enableCull();
        //GlStateManager.disableBlend();
        //GlStateManager.popMatrix();
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
        this.body.offsetY = -0.2F;
        this.body.rotateAngleY = (float) Math.toRadians(180);
        //this.body.offsetZ = -1F;


        AdvancedModelRendererExtended[] tentacle1 = {this.arm, this.arms, this.armss};
        AdvancedModelRendererExtended[] tentacle2 = {this.arm2, this.arms2,this.armss2};
        AdvancedModelRendererExtended[] tentacle3 = {this.arm3, this.arms3, this.armss3};
        AdvancedModelRendererExtended[] tentacle4 = {this.arm4, this.arms4, this.armss4};
        AdvancedModelRendererExtended[] tentacle5 = {this.arm5, this.arms5, this.armss5};
        AdvancedModelRendererExtended[] tentacle6 = {this.arm6, this.arms6, this.armss6};
        AdvancedModelRendererExtended[] tentacle7 = {this.arm7, this.arms7, this.armss7};
        AdvancedModelRendererExtended[] tentacle8 = {this.arm8, this.arms8, this.armss8};
        AdvancedModelRendererExtended[] tentacle9 = {this.arm9, this.arms9, this.armss9};
        AdvancedModelRendererExtended[] tentacle10 = {this.arm10, this.arms10, this.armss10};

        float speed = 0.10F;
        if (!e.isInWater()) {
            speed = 0.5F;
        }

        float degreeTentacle = 0.9F;
        float offset = -1F;


        this.chainWave(tentacle1, speed, degreeTentacle, offset, f2, 0.3F);
        this.chainWave(tentacle2, speed, degreeTentacle, offset, f2, 0.3F);
        this.chainWave(tentacle3, speed, degreeTentacle, offset, f2, 0.3F);
        this.chainWave(tentacle4, speed, degreeTentacle, offset, f2, 0.3F);
        this.chainWave(tentacle5, speed, degreeTentacle, offset, f2, 0.3F);
        this.chainWave(tentacle6, speed, degreeTentacle, offset, f2, 0.3F);
        this.chainWave(tentacle7, speed, degreeTentacle, offset, f2, 0.3F);
        this.chainWave(tentacle8, speed, degreeTentacle, offset, f2, 0.3F);
        this.chainWave(tentacle9, speed, degreeTentacle, offset, f2, 0.3F);
        this.chainWave(tentacle10, speed, degreeTentacle, offset, f2, 0.3F);


        if (e.isInWater()) {
            float bobSpeed = 0.1F;
            this.bob(body, bobSpeed, 0.8F, false, f2, 2);
            this.body.offsetZ = this.moveBoxExtended(speed, 0.5F, false, 3, f2, 1);
        }
        else {
            this.body.rotateAngleZ = (float) Math.toRadians(90);
            //this.body.offsetY = .25F;
        }

    }

}
