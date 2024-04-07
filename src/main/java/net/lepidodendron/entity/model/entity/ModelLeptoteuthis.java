package net.lepidodendron.entity.model.entity;

import net.lepidodendron.entity.model.llibraryextensions.AdvancedModelBaseExtended;
import net.lepidodendron.entity.model.llibraryextensions.AdvancedModelRendererExtended;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

public class ModelLeptoteuthis extends AdvancedModelBaseExtended {
    private final AdvancedModelRendererExtended body;
    private final AdvancedModelRendererExtended cube_r1;
    private final AdvancedModelRendererExtended cube_r2;
    private final AdvancedModelRendererExtended cube_r3;
    private final AdvancedModelRendererExtended cube_r4;
    private final AdvancedModelRendererExtended cube_r5;
    private final AdvancedModelRendererExtended cube_r6;
    private final AdvancedModelRendererExtended body2;
    private final AdvancedModelRendererExtended siphon;
    private final AdvancedModelRendererExtended arm;
    private final AdvancedModelRendererExtended arms;
    private final AdvancedModelRendererExtended arm5;
    private final AdvancedModelRendererExtended arms5;
    private final AdvancedModelRendererExtended arm2;
    private final AdvancedModelRendererExtended arms2;
    private final AdvancedModelRendererExtended arm6;
    private final AdvancedModelRendererExtended arms6;
    private final AdvancedModelRendererExtended arm3;
    private final AdvancedModelRendererExtended arms3;
    private final AdvancedModelRendererExtended arm7;
    private final AdvancedModelRendererExtended arms7;
    private final AdvancedModelRendererExtended arm4;
    private final AdvancedModelRendererExtended arms4;
    private final AdvancedModelRendererExtended arm8;
    private final AdvancedModelRendererExtended arms8;
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

    public ModelLeptoteuthis() {
        this.textureWidth = 128;
        this.textureHeight = 128;

        this.body = new AdvancedModelRendererExtended(this);
        this.body.setRotationPoint(0.0F, 24.0F, 0.0F);
        this.body.cubeList.add(new ModelBox(body, 0, 0, -3.5F, -5.5F, -6.0F, 7, 5, 30, 0.0F, false));
        this.body.cubeList.add(new ModelBox(body, 0, 11, -1.5F, -5.0F, 24.0F, 3, 4, 7, 0.0F, false));

        this.cube_r1 = new AdvancedModelRendererExtended(this);
        this.cube_r1.setRotationPoint(4.05F, -0.5F, 24.0F);
        this.body.addChild(cube_r1);
        this.setRotateAngle(cube_r1, 0.0F, -0.3491F, 0.0F);
        this.cube_r1.cubeList.add(new ModelBox(cube_r1, 0, 0, -2.95F, -4.0F, -0.5F, 3, 3, 8, 0.0F, true));

        this.cube_r2 = new AdvancedModelRendererExtended(this);
        this.cube_r2.setRotationPoint(6.25F, 0.0F, 7.0F);
        this.body.addChild(cube_r2);
        this.setRotateAngle(cube_r2, 0.0F, -0.1047F, 0.0F);
        this.cube_r2.cubeList.add(new ModelBox(cube_r2, 0, 35, -2.95F, -5.0F, -0.25F, 3, 4, 17, 0.01F, true));

        this.cube_r3 = new AdvancedModelRendererExtended(this);
        this.cube_r3.setRotationPoint(-3.5F, 0.0F, -6.0F);
        this.body.addChild(cube_r3);
        this.setRotateAngle(cube_r3, 0.0F, -0.2182F, 0.0F);
        this.cube_r3.cubeList.add(new ModelBox(cube_r3, 23, 35, 0.0F, -5.0F, 0.1F, 3, 4, 13, 0.0F, false));

        this.cube_r4 = new AdvancedModelRendererExtended(this);
        this.cube_r4.setRotationPoint(3.5F, 0.0F, -6.0F);
        this.body.addChild(cube_r4);
        this.setRotateAngle(cube_r4, 0.0F, 0.2182F, 0.0F);
        this.cube_r4.cubeList.add(new ModelBox(cube_r4, 23, 35, -3.0F, -5.0F, 0.1F, 3, 4, 13, 0.0F, true));

        this.cube_r5 = new AdvancedModelRendererExtended(this);
        this.cube_r5.setRotationPoint(-4.05F, -0.5F, 24.0F);
        this.body.addChild(cube_r5);
        this.setRotateAngle(cube_r5, 0.0F, 0.3491F, 0.0F);
        this.cube_r5.cubeList.add(new ModelBox(cube_r5, 0, 0, -0.05F, -4.0F, -0.5F, 3, 3, 8, 0.0F, false));

        this.cube_r6 = new AdvancedModelRendererExtended(this);
        this.cube_r6.setRotationPoint(-6.25F, 0.0F, 7.0F);
        this.body.addChild(cube_r6);
        this.setRotateAngle(cube_r6, 0.0F, 0.1047F, 0.0F);
        this.cube_r6.cubeList.add(new ModelBox(cube_r6, 0, 35, -0.05F, -5.0F, -0.25F, 3, 4, 17, 0.01F, false));

        this.body2 = new AdvancedModelRendererExtended(this);
        this.body2.setRotationPoint(0.0F, -4.25F, -5.75F);
        this.body.addChild(body2);
        this.setRotateAngle(body2, 0.0873F, 0.0F, 0.0F);
        this.body2.cubeList.add(new ModelBox(body2, 0, 22, -3.0F, -1.0F, -4.0F, 6, 4, 4, 0.0F, false));
        this.body2.cubeList.add(new ModelBox(body2, 0, 0, -3.5F, -0.5F, -3.0F, 1, 2, 2, 0.0F, false));
        this.body2.cubeList.add(new ModelBox(body2, 4, 0, -3.6F, 0.0F, -2.5F, 1, 1, 1, 0.0F, false));
        this.body2.cubeList.add(new ModelBox(body2, 4, 0, 2.6F, 0.0F, -2.5F, 1, 1, 1, 0.0F, true));
        this.body2.cubeList.add(new ModelBox(body2, 0, 0, 2.5F, -0.5F, -3.0F, 1, 2, 2, 0.0F, true));

        this.siphon = new AdvancedModelRendererExtended(this);
        this.siphon.setRotationPoint(0.0F, 3.5F, -0.5F);
        this.body2.addChild(siphon);
        this.setRotateAngle(siphon, 0.0873F, 0.0F, 0.0F);
        this.siphon.cubeList.add(new ModelBox(siphon, 16, 21, -1.0F, -1.0F, -3.5F, 2, 1, 4, 0.0F, false));

        this.arm = new AdvancedModelRendererExtended(this);
        this.arm.setRotationPoint(-0.75F, -0.6F, -4.0F);
        this.body2.addChild(arm);
        this.setRotateAngle(arm, 0.0F, 0.0F, -0.1745F);
        this.arm.cubeList.add(new ModelBox(arm, 7, 35, -0.5F, -0.25F, -4.0F, 1, 1, 4, 0.01F, false));
        this.arm.cubeList.add(new ModelBox(arm, 0, 1, -0.25F, 0.0F, -4.0F, 0, 1, 4, 0.0F, false));
        this.arm.cubeList.add(new ModelBox(arm, 0, 0, 0.25F, 0.0F, -4.0F, 0, 1, 4, 0.0F, false));

        this.arms = new AdvancedModelRendererExtended(this);
        this.arms.setRotationPoint(1.0F, 0.25F, -4.0F);
        this.arm.addChild(arms);
        this.arms.cubeList.add(new ModelBox(arms, 0, 35, -1.5F, -0.5F, -5.0F, 1, 1, 5, 0.0F, false));
        this.arms.cubeList.add(new ModelBox(arms, 14, 1, -1.25F, -0.25F, -5.0F, 0, 1, 5, 0.0F, false));
        this.arms.cubeList.add(new ModelBox(arms, 14, 0, -0.75F, -0.25F, -5.0F, 0, 1, 5, 0.0F, false));

        this.arm5 = new AdvancedModelRendererExtended(this);
        this.arm5.setRotationPoint(0.75F, -0.6F, -4.0F);
        this.body2.addChild(arm5);
        this.setRotateAngle(arm5, 0.0F, 0.0F, 0.1745F);
        this.arm5.cubeList.add(new ModelBox(arm5, 7, 35, -0.5F, -0.25F, -4.0F, 1, 1, 4, 0.01F, true));
        this.arm5.cubeList.add(new ModelBox(arm5, 0, 1, 0.25F, 0.0F, -4.0F, 0, 1, 4, 0.0F, true));
        this.arm5.cubeList.add(new ModelBox(arm5, 0, 0, -0.25F, 0.0F, -4.0F, 0, 1, 4, 0.0F, true));

        this.arms5 = new AdvancedModelRendererExtended(this);
        this.arms5.setRotationPoint(-1.0F, 0.25F, -4.0F);
        this.arm5.addChild(arms5);
        this.arms5.cubeList.add(new ModelBox(arms5, 0, 35, 0.5F, -0.5F, -5.0F, 1, 1, 5, 0.0F, true));
        this.arms5.cubeList.add(new ModelBox(arms5, 14, 1, 1.25F, -0.25F, -5.0F, 0, 1, 5, 0.0F, true));
        this.arms5.cubeList.add(new ModelBox(arms5, 14, 0, 0.75F, -0.25F, -5.0F, 0, 1, 5, 0.0F, true));

        this.arm2 = new AdvancedModelRendererExtended(this);
        this.arm2.setRotationPoint(-2.05F, -0.05F, -4.0F);
        this.body2.addChild(arm2);
        this.setRotateAngle(arm2, 0.0F, 0.0F, -0.6545F);
        this.arm2.cubeList.add(new ModelBox(arm2, 7, 35, -0.5F, -0.25F, -4.0F, 1, 1, 4, 0.01F, false));
        this.arm2.cubeList.add(new ModelBox(arm2, 0, 1, -0.25F, 0.0F, -4.0F, 0, 1, 4, 0.0F, false));
        this.arm2.cubeList.add(new ModelBox(arm2, 0, 0, 0.25F, 0.0F, -4.0F, 0, 1, 4, 0.0F, false));

        this.arms2 = new AdvancedModelRendererExtended(this);
        this.arms2.setRotationPoint(1.0F, 0.25F, -4.0F);
        this.arm2.addChild(arms2);
        this.arms2.cubeList.add(new ModelBox(arms2, 0, 35, -1.5F, -0.5F, -5.0F, 1, 1, 5, 0.0F, false));
        this.arms2.cubeList.add(new ModelBox(arms2, 14, 1, -1.25F, -0.25F, -5.0F, 0, 1, 5, 0.0F, false));
        this.arms2.cubeList.add(new ModelBox(arms2, 14, 0, -0.75F, -0.25F, -5.0F, 0, 1, 5, 0.0F, false));

        this.arm6 = new AdvancedModelRendererExtended(this);
        this.arm6.setRotationPoint(2.05F, -0.05F, -4.0F);
        this.body2.addChild(arm6);
        this.setRotateAngle(arm6, 0.0F, 0.0F, 0.6545F);
        this.arm6.cubeList.add(new ModelBox(arm6, 7, 35, -0.5F, -0.25F, -4.0F, 1, 1, 4, 0.01F, true));
        this.arm6.cubeList.add(new ModelBox(arm6, 0, 1, 0.25F, 0.0F, -4.0F, 0, 1, 4, 0.0F, true));
        this.arm6.cubeList.add(new ModelBox(arm6, 0, 0, -0.25F, 0.0F, -4.0F, 0, 1, 4, 0.0F, true));

        this.arms6 = new AdvancedModelRendererExtended(this);
        this.arms6.setRotationPoint(-1.0F, 0.25F, -4.0F);
        this.arm6.addChild(arms6);
        this.arms6.cubeList.add(new ModelBox(arms6, 0, 35, 0.5F, -0.5F, -5.0F, 1, 1, 5, 0.0F, true));
        this.arms6.cubeList.add(new ModelBox(arms6, 14, 1, 1.25F, -0.25F, -5.0F, 0, 1, 5, 0.0F, true));
        this.arms6.cubeList.add(new ModelBox(arms6, 14, 0, 0.75F, -0.25F, -5.0F, 0, 1, 5, 0.0F, true));

        this.arm3 = new AdvancedModelRendererExtended(this);
        this.arm3.setRotationPoint(-2.5F, 1.65F, -4.0F);
        this.body2.addChild(arm3);
        this.setRotateAngle(arm3, 0.0F, 0.0F, -1.9635F);
        this.arm3.cubeList.add(new ModelBox(arm3, 7, 35, -0.5F, -0.25F, -4.0F, 1, 1, 4, 0.01F, false));
        this.arm3.cubeList.add(new ModelBox(arm3, 0, 1, -0.25F, 0.0F, -4.0F, 0, 1, 4, 0.0F, false));
        this.arm3.cubeList.add(new ModelBox(arm3, 0, 0, 0.25F, 0.0F, -4.0F, 0, 1, 4, 0.0F, false));

        this.arms3 = new AdvancedModelRendererExtended(this);
        this.arms3.setRotationPoint(1.0F, 0.25F, -4.0F);
        this.arm3.addChild(arms3);
        this.arms3.cubeList.add(new ModelBox(arms3, 0, 35, -1.5F, -0.5F, -5.0F, 1, 1, 5, 0.0F, false));
        this.arms3.cubeList.add(new ModelBox(arms3, 14, 1, -1.25F, -0.25F, -5.0F, 0, 1, 5, 0.0F, false));
        this.arms3.cubeList.add(new ModelBox(arms3, 14, 0, -0.75F, -0.25F, -5.0F, 0, 1, 5, 0.0F, false));

        this.arm7 = new AdvancedModelRendererExtended(this);
        this.arm7.setRotationPoint(2.5F, 1.65F, -4.0F);
        this.body2.addChild(arm7);
        this.setRotateAngle(arm7, 0.0F, 0.0F, 1.9635F);
        this.arm7.cubeList.add(new ModelBox(arm7, 7, 35, -0.5F, -0.25F, -4.0F, 1, 1, 4, 0.01F, true));
        this.arm7.cubeList.add(new ModelBox(arm7, 0, 1, 0.25F, 0.0F, -4.0F, 0, 1, 4, 0.0F, true));
        this.arm7.cubeList.add(new ModelBox(arm7, 0, 0, -0.25F, 0.0F, -4.0F, 0, 1, 4, 0.0F, true));

        this.arms7 = new AdvancedModelRendererExtended(this);
        this.arms7.setRotationPoint(-1.0F, 0.25F, -4.0F);
        this.arm7.addChild(arms7);
        this.arms7.cubeList.add(new ModelBox(arms7, 0, 35, 0.5F, -0.5F, -5.0F, 1, 1, 5, 0.0F, true));
        this.arms7.cubeList.add(new ModelBox(arms7, 14, 1, 1.25F, -0.25F, -5.0F, 0, 1, 5, 0.0F, true));
        this.arms7.cubeList.add(new ModelBox(arms7, 14, 0, 0.75F, -0.25F, -5.0F, 0, 1, 5, 0.0F, true));

        this.arm4 = new AdvancedModelRendererExtended(this);
        this.arm4.setRotationPoint(-1.5F, 2.55F, -4.0F);
        this.body2.addChild(arm4);
        this.setRotateAngle(arm4, 0.0F, 0.0F, -2.5744F);
        this.arm4.cubeList.add(new ModelBox(arm4, 7, 35, -0.5F, -0.25F, -4.0F, 1, 1, 4, 0.01F, false));
        this.arm4.cubeList.add(new ModelBox(arm4, 0, 1, -0.25F, 0.0F, -4.0F, 0, 1, 4, 0.0F, false));
        this.arm4.cubeList.add(new ModelBox(arm4, 0, 0, 0.25F, 0.0F, -4.0F, 0, 1, 4, 0.0F, false));

        this.arms4 = new AdvancedModelRendererExtended(this);
        this.arms4.setRotationPoint(1.0F, 0.25F, -4.0F);
        this.arm4.addChild(arms4);
        this.arms4.cubeList.add(new ModelBox(arms4, 0, 35, -1.5F, -0.5F, -5.0F, 1, 1, 5, 0.0F, false));
        this.arms4.cubeList.add(new ModelBox(arms4, 14, 1, -1.25F, -0.25F, -5.0F, 0, 1, 5, 0.0F, false));
        this.arms4.cubeList.add(new ModelBox(arms4, 14, 0, -0.75F, -0.25F, -5.0F, 0, 1, 5, 0.0F, false));

        this.arm8 = new AdvancedModelRendererExtended(this);
        this.arm8.setRotationPoint(1.5F, 2.55F, -4.0F);
        this.body2.addChild(arm8);
        this.setRotateAngle(arm8, 0.0F, 0.0F, 2.5744F);
        this.arm8.cubeList.add(new ModelBox(arm8, 7, 35, -0.5F, -0.25F, -4.0F, 1, 1, 4, 0.01F, true));
        this.arm8.cubeList.add(new ModelBox(arm8, 0, 1, 0.25F, 0.0F, -4.0F, 0, 1, 4, 0.0F, true));
        this.arm8.cubeList.add(new ModelBox(arm8, 0, 0, -0.25F, 0.0F, -4.0F, 0, 1, 4, 0.0F, true));

        this.arms8 = new AdvancedModelRendererExtended(this);
        this.arms8.setRotationPoint(-1.0F, 0.25F, -4.0F);
        this.arm8.addChild(arms8);
        this.arms8.cubeList.add(new ModelBox(arms8, 0, 35, 0.5F, -0.5F, -5.0F, 1, 1, 5, 0.0F, true));
        this.arms8.cubeList.add(new ModelBox(arms8, 14, 1, 1.25F, -0.25F, -5.0F, 0, 1, 5, 0.0F, true));
        this.arms8.cubeList.add(new ModelBox(arms8, 14, 0, 0.75F, -0.25F, -5.0F, 0, 1, 5, 0.0F, true));

        this.finbaseR = new AdvancedModelRendererExtended(this);
        this.finbaseR.setRotationPoint(-6.25F, -4.0F, 7.0F);
        this.body.addChild(finbaseR);
        this.setRotateAngle(finbaseR, 0.0F, 0.1745F, 0.0F);


        this.finR = new AdvancedModelRendererExtended(this);
        this.finR.setRotationPoint(0.25F, 0.0F, 2.0F);
        this.finbaseR.addChild(finR);
        this.finR.cubeList.add(new ModelBox(finR, 17, 0, -3.75F, 0.0F, -3.0F, 4, 0, 5, 0.0F, false));

        this.finR2 = new AdvancedModelRendererExtended(this);
        this.finR2.setRotationPoint(0.25F, 0.0F, 7.0F);
        this.finbaseR.addChild(finR2);
        this.finR2.cubeList.add(new ModelBox(finR2, 15, 16, -3.75F, 0.0F, -3.0F, 4, 0, 5, 0.0F, false));

        this.finR3 = new AdvancedModelRendererExtended(this);
        this.finR3.setRotationPoint(0.25F, 0.0F, 12.0F);
        this.finbaseR.addChild(finR3);
        this.finR3.cubeList.add(new ModelBox(finR3, 16, 11, -3.75F, 0.0F, -3.0F, 4, 0, 5, 0.0F, false));

        this.finR4 = new AdvancedModelRendererExtended(this);
        this.finR4.setRotationPoint(0.25F, 0.0F, 17.0F);
        this.finbaseR.addChild(finR4);
        this.finR4.cubeList.add(new ModelBox(finR4, 8, 11, -3.75F, 0.0F, -3.0F, 4, 0, 5, 0.0F, false));

        this.finR5 = new AdvancedModelRendererExtended(this);
        this.finR5.setRotationPoint(0.25F, 0.0F, 22.0F);
        this.finbaseR.addChild(finR5);
        this.finR5.cubeList.add(new ModelBox(finR5, 9, 0, -3.75F, 0.0F, -3.0F, 4, 0, 5, 0.0F, false));

        this.finbaseL = new AdvancedModelRendererExtended(this);
        this.finbaseL.setRotationPoint(6.25F, -4.0F, 7.0F);
        this.body.addChild(finbaseL);
        this.setRotateAngle(finbaseL, 0.0F, -0.1745F, 0.0F);


        this.finL = new AdvancedModelRendererExtended(this);
        this.finL.setRotationPoint(-0.25F, 0.0F, 2.0F);
        this.finbaseL.addChild(finL);
        this.finL.cubeList.add(new ModelBox(finL, 17, 0, -0.25F, 0.0F, -3.0F, 4, 0, 5, 0.0F, true));

        this.finL2 = new AdvancedModelRendererExtended(this);
        this.finL2.setRotationPoint(-0.25F, 0.0F, 7.0F);
        this.finbaseL.addChild(finL2);
        this.finL2.cubeList.add(new ModelBox(finL2, 15, 16, -0.25F, 0.0F, -3.0F, 4, 0, 5, 0.0F, true));

        this.finL3 = new AdvancedModelRendererExtended(this);
        this.finL3.setRotationPoint(-0.25F, 0.0F, 12.0F);
        this.finbaseL.addChild(finL3);
        this.finL3.cubeList.add(new ModelBox(finL3, 16, 11, -0.25F, 0.0F, -3.0F, 4, 0, 5, 0.0F, true));

        this.finL4 = new AdvancedModelRendererExtended(this);
        this.finL4.setRotationPoint(-0.25F, 0.0F, 17.0F);
        this.finbaseL.addChild(finL4);
        this.finL4.cubeList.add(new ModelBox(finL4, 8, 11, -0.25F, 0.0F, -3.0F, 4, 0, 5, 0.0F, true));

        this.finL5 = new AdvancedModelRendererExtended(this);
        this.finL5.setRotationPoint(-0.25F, 0.0F, 22.0F);
        this.finbaseL.addChild(finL5);
        this.finL5.cubeList.add(new ModelBox(finL5, 9, 0, -0.25F, 0.0F, -3.0F, 4, 0, 5, 0.0F, true));

        updateDefaultPose();
    }

    @Override
    public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        this.body.render(f5);
    }
    public void renderStaticWall(float f) {
        this.body.rotateAngleY = (float) Math.toRadians(0);
        this.setRotateAngle(body, 1.55F, 0.0F, 0.0F);
        this.body.offsetY = -0.18F;
        this.body.offsetX = 0.0F;
        this.body.offsetZ = -0.35F;
        this.body.render(0.01F);
        resetToDefaultPose();
    }
    public void renderStaticFloor(float f) {
        this.setRotateAngle(body, 0.5F, 0.0F, 0.0F);
        this.setRotateAngle(finL, 0.0F, 0.0F, -0.9F);
        this.setRotateAngle(finR, 0.0F, 0.0F, 0.9F);
        this.body.offsetY = -0.5F;
        this.body.render(0.01F);
        resetToDefaultPose();
    }
    public void renderStaticSuspended(float f) {
        this.setRotateAngle(body, 0.0F, 0.0F, 0.4F);
        this.setRotateAngle(finL, 0.0F, 0.3F, 0.3F);
        this.setRotateAngle(finR, 0.0F, 0.3F, -0.3F);
        this.body.offsetY = 0.09F;
        this.body.render(0.01F);
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

        this.resetToDefaultPose();
        //this.body.offsetY = 1.3F;
        this.body.rotateAngleY = (float) Math.toRadians(180);
        this.body.offsetZ = 0.5F;

        AdvancedModelRendererExtended[] tentacle1 = {this.arm, this.arms};
        AdvancedModelRendererExtended[] tentacle2 = {this.arm2, this.arms2};
        AdvancedModelRendererExtended[] tentacle3 = {this.arm3, this.arms3};
        AdvancedModelRendererExtended[] tentacle4 = {this.arm4, this.arms4};
        AdvancedModelRendererExtended[] tentacle5 = {this.arm5, this.arms5};
        AdvancedModelRendererExtended[] tentacle6 = {this.arm6, this.arms6};
        AdvancedModelRendererExtended[] tentacle7 = {this.arm7, this.arms7};
        AdvancedModelRendererExtended[] tentacle8 = {this.arm8, this.arms8};


        float speed = 0.13F;
        if (!e.isInWater()) {
            speed = 0.5F;
        }

        float degreeTentacle =0.1F;

        this.chainWave(tentacle1, speed, degreeTentacle, 0, f2, 1F);
        this.chainWave(tentacle2, speed, degreeTentacle, 0, f2, 1F);
        this.chainWave(tentacle3, speed, degreeTentacle, 0, f2, 1F);
        this.chainWave(tentacle4, speed, degreeTentacle, 0, f2, 1F);
        this.chainWave(tentacle5, speed, degreeTentacle, 0, f2, 1F);
        this.chainWave(tentacle6, speed, degreeTentacle, 0, f2, 1F);
        this.chainWave(tentacle7, speed, degreeTentacle, 0, f2, 1F);
        this.chainWave(tentacle8, speed, degreeTentacle, 0, f2, 1F);
       // this.chainWave(tentacle9, speed, degreeTentacle, 0, f2, 1F);
       // this.chainWave(tentacle10, speed, degreeTentacle, 0, f2, 1F);
        this.swing(finL, (float) (speed), 0.15F, true, 0, 0, f2, 1);
        this.swing(finR, (float) (speed), 0.15F, true, 0, 0, f2, 1);



        if (e.isInWater()) {
            float bobSpeed = 0.1F;
            this.bobExtended(body, bobSpeed, 0.5F, false, 0.1F, f2, 2);
            this.body.offsetZ = this.moveBoxExtended(speed, 0.50F, false, 3, f2, 1) + 1.25F;
        }
        else {
            this.body.rotateAngleZ = (float) Math.toRadians(90);
            //this.body.offsetY = 0.25F;
        }

    }

}
