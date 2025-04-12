package net.lepidodendron.entity.model.entity;

import net.ilexiconn.llibrary.client.model.tools.AdvancedModelRenderer;
import net.lepidodendron.entity.EntityPrehistoricFloraOlenellus;
import net.lepidodendron.entity.model.ModelBasePalaeopedia;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

public class ModelOlenellus extends ModelBasePalaeopedia {
    private final AdvancedModelRenderer Body;
    private final AdvancedModelRenderer cube_r1;
    private final AdvancedModelRenderer cube_r2;
    private final AdvancedModelRenderer cube_r3;
    private final AdvancedModelRenderer cube_r4;
    private final AdvancedModelRenderer cube_r5;
    private final AdvancedModelRenderer cube_r6;
    private final AdvancedModelRenderer cube_r7;
    private final AdvancedModelRenderer cube_r8;
    private final AdvancedModelRenderer cube_r9;
    private final AdvancedModelRenderer cube_r10;
    private final AdvancedModelRenderer cube_r11;
    private final AdvancedModelRenderer cube_r12;
    private final AdvancedModelRenderer cube_r13;
    private final AdvancedModelRenderer AntennaL;
    private final AdvancedModelRenderer AntennaR;
    private final AdvancedModelRenderer LegL2;
    private final AdvancedModelRenderer LegR2;
    private final AdvancedModelRenderer LegL;
    private final AdvancedModelRenderer LegR;
    private final AdvancedModelRenderer Body2;
    private final AdvancedModelRenderer cube_r14;
    private final AdvancedModelRenderer cube_r15;
    private final AdvancedModelRenderer LegR3;
    private final AdvancedModelRenderer LegL3;
    private final AdvancedModelRenderer Body3;
    private final AdvancedModelRenderer cube_r16;
    private final AdvancedModelRenderer cube_r17;
    private final AdvancedModelRenderer cube_r18;
    private final AdvancedModelRenderer cube_r19;
    private final AdvancedModelRenderer LegR4;
    private final AdvancedModelRenderer LegL4;
    private final AdvancedModelRenderer Body4;
    private final AdvancedModelRenderer cube_r20;
    private final AdvancedModelRenderer cube_r21;
    private final AdvancedModelRenderer LegR5;
    private final AdvancedModelRenderer LegL5;
    private final AdvancedModelRenderer Body5;
    private final AdvancedModelRenderer cube_r22;
    private final AdvancedModelRenderer cube_r23;
    private final AdvancedModelRenderer cube_r24;
    private final AdvancedModelRenderer cube_r25;
    private final AdvancedModelRenderer Body6;
    private final AdvancedModelRenderer LegR6;
    private final AdvancedModelRenderer LegL6;

    public ModelOlenellus() {
        this.textureWidth = 28;
        this.textureHeight = 24;

        this.Body = new AdvancedModelRenderer(this);
        this.Body.setRotationPoint(0.0F, 24.0F, 0.0F);
        this.Body.cubeList.add(new ModelBox(Body, 10, 11, -1.5F, -2.25F, -7.0F, 3, 1, 6, 0.0F, false));

        this.cube_r1 = new AdvancedModelRenderer(this);
        this.cube_r1.setRotationPoint(5.5519F, -0.9054F, -4.9656F);
        this.Body.addChild(cube_r1);
        this.setRotateAngle(cube_r1, 0.0464F, 0.4102F, 0.1921F);
        this.cube_r1.cubeList.add(new ModelBox(cube_r1, 0, 0, -2.0F, 0.001F, 0.0F, 2, 0, 7, 0.0F, false));

        this.cube_r2 = new AdvancedModelRenderer(this);
        this.cube_r2.setRotationPoint(6.278F, -0.8069F, -4.2851F);
        this.Body.addChild(cube_r2);
        this.setRotateAngle(cube_r2, 0.063F, 0.8205F, 0.2208F);
        this.cube_r2.cubeList.add(new ModelBox(cube_r2, 0, 3, -1.0F, 0.001F, -4.0F, 1, 0, 3, 0.0F, false));

        this.cube_r3 = new AdvancedModelRenderer(this);
        this.cube_r3.setRotationPoint(0.4097F, -1.7595F, -6.9695F);
        this.Body.addChild(cube_r3);
        this.setRotateAngle(cube_r3, 0.0924F, -0.2891F, 0.1461F);
        this.cube_r3.cubeList.add(new ModelBox(cube_r3, 0, 6, -0.15F, 0.051F, -0.9F, 3, 0, 1, 0.0F, false));

        this.cube_r4 = new AdvancedModelRenderer(this);
        this.cube_r4.setRotationPoint(0.0F, -1.725F, -7.0001F);
        this.Body.addChild(cube_r4);
        this.setRotateAngle(cube_r4, 0.1353F, 0.0F, 0.0F);
        this.cube_r4.cubeList.add(new ModelBox(cube_r4, 0, 0, -0.5F, 0.0F, -0.875F, 1, 0, 1, 0.0F, false));

        this.cube_r5 = new AdvancedModelRenderer(this);
        this.cube_r5.setRotationPoint(0.5002F, -1.8812F, -3.9718F);
        this.Body.addChild(cube_r5);
        this.setRotateAngle(cube_r5, 0.0456F, 0.0227F, 0.1731F);
        this.cube_r5.cubeList.add(new ModelBox(cube_r5, 0, 11, 0.0F, 0.001F, -3.0F, 5, 0, 6, 0.0F, false));

        this.cube_r6 = new AdvancedModelRenderer(this);
        this.cube_r6.setRotationPoint(-1.5F, -0.75F, -5.4F);
        this.Body.addChild(cube_r6);
        this.setRotateAngle(cube_r6, 0.0F, -0.1309F, 0.0F);
        this.cube_r6.cubeList.add(new ModelBox(cube_r6, 8, 18, -1.4F, -1.25F, 0.0F, 2, 1, 4, 0.0F, true));

        this.cube_r7 = new AdvancedModelRenderer(this);
        this.cube_r7.setRotationPoint(0.0152F, -1.6338F, -8.1371F);
        this.Body.addChild(cube_r7);
        this.setRotateAngle(cube_r7, -0.7994F, 0.862F, -0.802F);
        this.cube_r7.cubeList.add(new ModelBox(cube_r7, 0, 3, -1.0F, 0.0F, 1.2F, 1, 0, 3, 0.0F, false));

        this.cube_r8 = new AdvancedModelRenderer(this);
        this.cube_r8.setRotationPoint(-0.0152F, -1.6338F, -8.1371F);
        this.Body.addChild(cube_r8);
        this.setRotateAngle(cube_r8, -0.7994F, -0.862F, 0.802F);
        this.cube_r8.cubeList.add(new ModelBox(cube_r8, 0, 3, 0.0F, 0.0F, 1.2F, 1, 0, 3, 0.0F, true));

        this.cube_r9 = new AdvancedModelRenderer(this);
        this.cube_r9.setRotationPoint(-6.278F, -0.8069F, -4.2851F);
        this.Body.addChild(cube_r9);
        this.setRotateAngle(cube_r9, 0.063F, -0.8205F, -0.2208F);
        this.cube_r9.cubeList.add(new ModelBox(cube_r9, 0, 3, 0.0F, 0.001F, -4.0F, 1, 0, 3, 0.0F, true));

        this.cube_r10 = new AdvancedModelRenderer(this);
        this.cube_r10.setRotationPoint(-0.4097F, -1.7595F, -6.9695F);
        this.Body.addChild(cube_r10);
        this.setRotateAngle(cube_r10, 0.0924F, 0.2891F, -0.1461F);
        this.cube_r10.cubeList.add(new ModelBox(cube_r10, 0, 6, -2.85F, 0.051F, -0.9F, 3, 0, 1, 0.0F, true));

        this.cube_r11 = new AdvancedModelRenderer(this);
        this.cube_r11.setRotationPoint(-5.5519F, -0.9054F, -4.9656F);
        this.Body.addChild(cube_r11);
        this.setRotateAngle(cube_r11, 0.0464F, -0.4102F, -0.1921F);
        this.cube_r11.cubeList.add(new ModelBox(cube_r11, 0, 0, 0.0F, 0.001F, 0.0F, 2, 0, 7, 0.0F, true));

        this.cube_r12 = new AdvancedModelRenderer(this);
        this.cube_r12.setRotationPoint(-0.5002F, -1.8812F, -3.9718F);
        this.Body.addChild(cube_r12);
        this.setRotateAngle(cube_r12, 0.0456F, -0.0227F, -0.1731F);
        this.cube_r12.cubeList.add(new ModelBox(cube_r12, 0, 11, -5.0F, 0.001F, -3.0F, 5, 0, 6, 0.0F, true));

        this.cube_r13 = new AdvancedModelRenderer(this);
        this.cube_r13.setRotationPoint(1.5F, -0.75F, -5.4F);
        this.Body.addChild(cube_r13);
        this.setRotateAngle(cube_r13, 0.0F, 0.1309F, 0.0F);
        this.cube_r13.cubeList.add(new ModelBox(cube_r13, 8, 18, -0.6F, -1.25F, 0.0F, 2, 1, 4, 0.0F, false));

        this.AntennaL = new AdvancedModelRenderer(this);
        this.AntennaL.setRotationPoint(1.5F, -1.25F, -7.0F);
        this.Body.addChild(AntennaL);
        this.setRotateAngle(AntennaL, 0.0F, -0.2618F, 0.0F);
        this.AntennaL.cubeList.add(new ModelBox(AntennaL, 0, 0, -0.5F, 0.0F, -11.0F, 6, 0, 11, 0.0F, false));

        this.AntennaR = new AdvancedModelRenderer(this);
        this.AntennaR.setRotationPoint(-1.5F, -1.25F, -7.0F);
        this.Body.addChild(AntennaR);
        this.setRotateAngle(AntennaR, 0.0F, 0.2618F, 0.0F);
        this.AntennaR.cubeList.add(new ModelBox(AntennaR, 0, 0, -5.5F, 0.0F, -11.0F, 6, 0, 11, 0.0F, true));

        this.LegL2 = new AdvancedModelRenderer(this);
        this.LegL2.setRotationPoint(1.5F, -1.25F, -2.0F);
        this.Body.addChild(LegL2);
        this.setRotateAngle(LegL2, 0.0F, 0.0F, 0.3403F);
        this.LegL2.cubeList.add(new ModelBox(LegL2, 0, 10, -0.25F, 0.0F, -0.5F, 4, 0, 1, 0.0F, false));

        this.LegR2 = new AdvancedModelRenderer(this);
        this.LegR2.setRotationPoint(-1.5F, -1.25F, -2.0F);
        this.Body.addChild(LegR2);
        this.setRotateAngle(LegR2, 0.0F, 0.0F, -0.3403F);
        this.LegR2.cubeList.add(new ModelBox(LegR2, 0, 10, -3.75F, 0.0F, -0.5F, 4, 0, 1, 0.0F, true));

        this.LegL = new AdvancedModelRenderer(this);
        this.LegL.setRotationPoint(1.5F, -1.25F, -4.0F);
        this.Body.addChild(LegL);
        this.setRotateAngle(LegL, 0.0F, 0.0F, 0.3927F);
        this.LegL.cubeList.add(new ModelBox(LegL, 0, 10, -0.75F, 0.0F, -0.5F, 4, 0, 1, 0.0F, false));

        this.LegR = new AdvancedModelRenderer(this);
        this.LegR.setRotationPoint(-1.5F, -1.25F, -4.0F);
        this.Body.addChild(LegR);
        this.setRotateAngle(LegR, 0.0F, 0.0F, -0.3927F);
        this.LegR.cubeList.add(new ModelBox(LegR, 0, 10, -3.25F, 0.0F, -0.5F, 4, 0, 1, 0.0F, true));

        this.Body2 = new AdvancedModelRenderer(this);
        this.Body2.setRotationPoint(0.0F, -1.775F, -1.0F);
        this.Body.addChild(Body2);
        this.Body2.cubeList.add(new ModelBox(Body2, 18, 21, -1.0F, -0.375F, 0.0F, 2, 1, 2, 0.0F, false));

        this.cube_r14 = new AdvancedModelRenderer(this);
        this.cube_r14.setRotationPoint(0.1487F, 0.9245F, 2.0F);
        this.Body2.addChild(cube_r14);
        this.setRotateAngle(cube_r14, 0.0F, 0.0F, -0.1745F);
        this.cube_r14.cubeList.add(new ModelBox(cube_r14, 0, 7, -4.5F, -1.1F, -3.0F, 4, 0, 3, 0.0F, true));

        this.cube_r15 = new AdvancedModelRenderer(this);
        this.cube_r15.setRotationPoint(-0.1487F, 0.9245F, 2.0F);
        this.Body2.addChild(cube_r15);
        this.setRotateAngle(cube_r15, 0.0F, 0.0F, 0.1745F);
        this.cube_r15.cubeList.add(new ModelBox(cube_r15, 0, 7, 0.5F, -1.1F, -3.0F, 4, 0, 3, 0.0F, false));

        this.LegR3 = new AdvancedModelRenderer(this);
        this.LegR3.setRotationPoint(-1.0F, 0.625F, 1.0F);
        this.Body2.addChild(LegR3);
        this.setRotateAngle(LegR3, 0.0F, 0.0F, -0.288F);
        this.LegR3.cubeList.add(new ModelBox(LegR3, 0, 10, -4.0F, 0.0F, -0.5F, 4, 0, 1, 0.0F, true));

        this.LegL3 = new AdvancedModelRenderer(this);
        this.LegL3.setRotationPoint(1.0F, 0.625F, 1.0F);
        this.Body2.addChild(LegL3);
        this.setRotateAngle(LegL3, 0.0F, 0.0F, 0.288F);
        this.LegL3.cubeList.add(new ModelBox(LegL3, 0, 10, 0.0F, 0.0F, -0.5F, 4, 0, 1, 0.0F, false));

        this.Body3 = new AdvancedModelRenderer(this);
        this.Body3.setRotationPoint(0.0F, 0.1F, 2.0F);
        this.Body2.addChild(Body3);
        this.Body3.cubeList.add(new ModelBox(Body3, 0, 15, -1.0F, -0.375F, 0.0F, 2, 1, 2, 0.0F, false));

        this.cube_r16 = new AdvancedModelRenderer(this);
        this.cube_r16.setRotationPoint(-2.7393F, 1.0822F, -0.0274F);
        this.Body3.addChild(cube_r16);
        this.setRotateAngle(cube_r16, 0.0F, -0.4102F, -0.1745F);
        this.cube_r16.cubeList.add(new ModelBox(cube_r16, 16, 0, -0.7257F, -0.775F, 0.0084F, 2, 0, 7, 0.0F, true));

        this.cube_r17 = new AdvancedModelRenderer(this);
        this.cube_r17.setRotationPoint(0.1487F, 0.7245F, 0.0F);
        this.Body3.addChild(cube_r17);
        this.setRotateAngle(cube_r17, 0.0F, 0.0F, -0.1745F);
        this.cube_r17.cubeList.add(new ModelBox(cube_r17, 19, 18, -3.5F, -0.9F, -1.0F, 3, 0, 3, 0.0F, true));

        this.cube_r18 = new AdvancedModelRenderer(this);
        this.cube_r18.setRotationPoint(2.7393F, 1.0822F, -0.0274F);
        this.Body3.addChild(cube_r18);
        this.setRotateAngle(cube_r18, 0.0F, 0.4102F, 0.1745F);
        this.cube_r18.cubeList.add(new ModelBox(cube_r18, 16, 0, -1.2743F, -0.775F, 0.0084F, 2, 0, 7, 0.0F, false));

        this.cube_r19 = new AdvancedModelRenderer(this);
        this.cube_r19.setRotationPoint(-0.1487F, 0.7245F, 0.0F);
        this.Body3.addChild(cube_r19);
        this.setRotateAngle(cube_r19, 0.0F, 0.0F, 0.1745F);
        this.cube_r19.cubeList.add(new ModelBox(cube_r19, 19, 18, 0.5F, -0.9F, -1.0F, 3, 0, 3, 0.0F, false));

        this.LegR4 = new AdvancedModelRenderer(this);
        this.LegR4.setRotationPoint(-1.0F, 0.625F, 1.0F);
        this.Body3.addChild(LegR4);
        this.setRotateAngle(LegR4, 0.0F, 0.0F, -0.288F);
        this.LegR4.cubeList.add(new ModelBox(LegR4, 0, 10, -3.75F, 0.0F, -0.5F, 4, 0, 1, 0.0F, true));

        this.LegL4 = new AdvancedModelRenderer(this);
        this.LegL4.setRotationPoint(1.0F, 0.625F, 1.0F);
        this.Body3.addChild(LegL4);
        this.setRotateAngle(LegL4, 0.0F, 0.0F, 0.288F);
        this.LegL4.cubeList.add(new ModelBox(LegL4, 0, 10, -0.25F, 0.0F, -0.5F, 4, 0, 1, 0.0F, false));

        this.Body4 = new AdvancedModelRenderer(this);
        this.Body4.setRotationPoint(0.0F, 0.125F, 2.0F);
        this.Body3.addChild(Body4);
        this.Body4.cubeList.add(new ModelBox(Body4, 0, 20, -0.5F, -0.4F, 0.0F, 1, 1, 2, 0.0F, false));

        this.cube_r20 = new AdvancedModelRenderer(this);
        this.cube_r20.setRotationPoint(0.1487F, 0.7995F, -2.0F);
        this.Body4.addChild(cube_r20);
        this.setRotateAngle(cube_r20, 0.0F, 0.0F, -0.1745F);
        this.cube_r20.cubeList.add(new ModelBox(cube_r20, 0, 18, -3.5F, -0.9F, 1.0F, 4, 0, 4, 0.0F, true));

        this.cube_r21 = new AdvancedModelRenderer(this);
        this.cube_r21.setRotationPoint(-0.1487F, 0.7995F, -2.0F);
        this.Body4.addChild(cube_r21);
        this.setRotateAngle(cube_r21, 0.0F, 0.0F, 0.1745F);
        this.cube_r21.cubeList.add(new ModelBox(cube_r21, 0, 18, -0.5F, -0.9F, 1.0F, 4, 0, 4, 0.0F, false));

        this.LegR5 = new AdvancedModelRenderer(this);
        this.LegR5.setRotationPoint(-0.5F, 0.6F, 1.0F);
        this.Body4.addChild(LegR5);
        this.setRotateAngle(LegR5, 0.0F, 0.0F, -0.2531F);
        this.LegR5.cubeList.add(new ModelBox(LegR5, 0, 10, -3.75F, 0.0F, -0.5F, 4, 0, 1, 0.0F, true));

        this.LegL5 = new AdvancedModelRenderer(this);
        this.LegL5.setRotationPoint(0.5F, 0.6F, 1.0F);
        this.Body4.addChild(LegL5);
        this.setRotateAngle(LegL5, 0.0F, 0.0F, 0.2531F);
        this.LegL5.cubeList.add(new ModelBox(LegL5, 0, 10, -0.25F, 0.0F, -0.5F, 4, 0, 1, 0.0F, false));

        this.Body5 = new AdvancedModelRenderer(this);
        this.Body5.setRotationPoint(0.0F, 0.1F, 2.0F);
        this.Body4.addChild(Body5);
        this.Body5.cubeList.add(new ModelBox(Body5, 0, 11, -0.5F, -0.4F, 0.0F, 1, 1, 2, 0.0F, false));

        this.cube_r22 = new AdvancedModelRenderer(this);
        this.cube_r22.setRotationPoint(0.1487F, 0.8995F, -4.0F);
        this.Body5.addChild(cube_r22);
        this.setRotateAngle(cube_r22, 0.0F, 0.0F, -0.1745F);
        this.cube_r22.cubeList.add(new ModelBox(cube_r22, 0, 0, -2.0F, -0.9F, 4.0F, 2, 0, 3, 0.0F, true));

        this.cube_r23 = new AdvancedModelRenderer(this);
        this.cube_r23.setRotationPoint(0.1487F, 0.7995F, -4.0F);
        this.Body5.addChild(cube_r23);
        this.setRotateAngle(cube_r23, 0.0F, 0.0F, -0.1745F);
        this.cube_r23.cubeList.add(new ModelBox(cube_r23, 13, 18, -2.75F, -0.9F, 3.0F, 3, 0, 3, 0.0F, true));

        this.cube_r24 = new AdvancedModelRenderer(this);
        this.cube_r24.setRotationPoint(-0.1487F, 0.8995F, -4.0F);
        this.Body5.addChild(cube_r24);
        this.setRotateAngle(cube_r24, 0.0F, 0.0F, 0.1745F);
        this.cube_r24.cubeList.add(new ModelBox(cube_r24, 0, 0, 0.0F, -0.9F, 4.0F, 2, 0, 3, 0.0F, false));

        this.cube_r25 = new AdvancedModelRenderer(this);
        this.cube_r25.setRotationPoint(-0.1487F, 0.7995F, -4.0F);
        this.Body5.addChild(cube_r25);
        this.setRotateAngle(cube_r25, 0.0F, 0.0F, 0.1745F);
        this.cube_r25.cubeList.add(new ModelBox(cube_r25, 13, 18, -0.25F, -0.9F, 3.0F, 3, 0, 3, 0.0F, false));

        this.Body6 = new AdvancedModelRenderer(this);
        this.Body6.setRotationPoint(0.0F, 0.05F, 2.0F);
        this.Body5.addChild(Body6);
        this.Body6.cubeList.add(new ModelBox(Body6, 16, 11, -0.5F, 0.0F, 0.0F, 1, 0, 6, 0.0F, false));

        this.LegR6 = new AdvancedModelRenderer(this);
        this.LegR6.setRotationPoint(-0.5F, 0.6F, 1.0F);
        this.Body5.addChild(LegR6);
        this.setRotateAngle(LegR6, 0.0F, 0.0F, -0.3054F);
        this.LegR6.cubeList.add(new ModelBox(LegR6, 1, 10, -2.75F, 0.0F, -0.5F, 3, 0, 1, 0.0F, true));

        this.LegL6 = new AdvancedModelRenderer(this);
        this.LegL6.setRotationPoint(0.5F, 0.6F, 1.0F);
        this.Body5.addChild(LegL6);
        this.setRotateAngle(LegL6, 0.0F, 0.0F, 0.3054F);
        this.LegL6.cubeList.add(new ModelBox(LegL6, 1, 10, -0.25F, 0.0F, -0.5F, 3, 0, 1, 0.0F, false));

        updateDefaultPose();
    }

    @Override
    public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        this.Body.render(f5);
    }
    public void renderStaticFloor(float f) {
        this.setRotateAngle(Body, 0.0F, 0.0F, 0.0F);
        this.setRotateAngle(Body2, 0.0F, 0.1F, 0.0F);
        this.setRotateAngle(Body3, 0.0F, 0.1F, 0.0F);
        this.setRotateAngle(Body4, 0.0F, 0.1F, 0.0F);
        this.setRotateAngle(Body5, 0.0F, 0.1F, 0.0F);
        this.setRotateAngle(Body6, 0.0F, 0.1F, 0.0F);
        this.Body.offsetZ = -0.02F;
        this.Body.offsetY = 0.02F;
        this.Body.render(0.01F);
        this.resetToDefaultPose();
    }

    @Override
    public void renderStaticBook(float f) {
        //Rotations, positions and sizing:
        this.Body.offsetY = -1.4F;
        this.Body.offsetX = -0.4F;
        this.Body.offsetZ = 2.0F;
        this.Body.rotateAngleY = (float)Math.toRadians(120);
        this.Body.rotateAngleX = (float)Math.toRadians(1);
        this.Body.rotateAngleZ = (float)Math.toRadians(0);
        this.Body.scaleChildren = true;
        float scaler = 2.0F;
        this.Body.setScale(scaler, scaler, scaler);
        //Start of pose:
        this.setRotateAngle(Body, 0.6F, 3.8F, -0.2F);
        this.setRotateAngle(Body2, 0.0F, 0.1F, 0.0F);
        this.setRotateAngle(Body3, 0.0F, 0.1F, 0.0F);
        this.setRotateAngle(Body4, 0.0F, 0.1F, 0.0F);
        this.setRotateAngle(Body5, 0.0F, 0.1F, 0.0F);
        this.setRotateAngle(Body6, 0.0F, 0.1F, 0.0F);
        //End of pose, now render the model:
        this.Body.render(f);
        //Reset rotations, positions and sizing:
        this.Body.setScale(1.0F, 1.0F, 1.0F);
        this.Body.scaleChildren = false;
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
        //this.Body.offsetY = 1.1F;

        AdvancedModelRenderer[] legsL = {this.LegL, this.LegL2, this.LegL3, this.LegL4, this.LegL5, this.LegL6};
        AdvancedModelRenderer[] legsR = {this.LegR, this.LegR2, this.LegR3, this.LegR4, this.LegR5, this.LegR6};
        AdvancedModelRenderer[] bodyF = {this.Body2, this.Body3, this.Body4};

        this.swing(AntennaL, 0.2F, -0.2F, false, 0, -0.1F, f2, 0.8F);
        this.swing(AntennaR, 0.2F, 0.2F, false, 0, 0.1F, f2, 0.8F);

        EntityPrehistoricFloraOlenellus ee = (EntityPrehistoricFloraOlenellus) e;

        if (ee.isInWater()) {
            if (ee.getIsMoving()) {
                this.chainSwing(bodyF, 0.1F, 0.06F, -3, f2, 1.0F);

                this.chainWave(legsL, 0.2F, 0.2F, -3, f2, 1);
                this.chainWave(legsR, 0.6F, 0.2F, -3, f2, 1);

                this.flap(LegL, 0.5F, -0.5F, false, 0, -0.5F, f2, 0.3F);
                this.flap(LegR, 0.5F, 0.5F, false, 0, 0.5F, f2, 0.3F);
                this.flap(LegL2, 0.5F, -0.5F, false, 1.0F, -0.5F, f2, 0.3F);
                this.flap(LegR2, 0.5F, 0.5F, false, 1.0F, 0.5F, f2, 0.3F);
                this.flap(LegL3, 0.5F, -0.5F, false, 2.0F, -0.5F, f2, 0.3F);
                this.flap(LegR3, 0.5F, 0.5F, false, 2.0F, 0.5F, f2, 0.3F);
                this.flap(LegL4, 0.5F, -0.5F, false, 3.0F, -0.5F, f2, 0.3F);
                this.flap(LegR4, 0.5F, 0.5F, false, 3.0F, 0.5F, f2, 0.3F);
                this.flap(LegL5, 0.5F, -0.5F, false, 4.0F, -0.5F, f2, 0.3F);
                this.flap(LegR5, 0.5F, 0.5F, false, 4.0F, 0.5F, f2, 0.3F);
                this.flap(LegL6, 0.5F, -0.5F, false, 5.0F, -0.5F, f2, 0.3F);
                this.flap(LegR6, 0.5F, 0.5F, false, 5.0F, 0.5F, f2, 0.3F);

            }
        }

    }
}
