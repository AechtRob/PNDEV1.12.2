package net.lepidodendron.entity.model.entity;

import net.ilexiconn.llibrary.client.model.ModelAnimator;
import net.ilexiconn.llibrary.client.model.tools.AdvancedModelRenderer;
import net.ilexiconn.llibrary.server.animation.IAnimatedEntity;
import net.lepidodendron.entity.EntityPrehistoricFloraDasyceps;
import net.lepidodendron.entity.base.EntityPrehistoricFloraAgeableBase;
import net.lepidodendron.entity.model.ModelBasePalaeopedia;
import net.lepidodendron.entity.model.llibraryextensions.AdvancedModelRendererExtended;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

public class ModelDasyceps extends ModelBasePalaeopedia {
    private final AdvancedModelRendererExtended Dasyceps;
    private final AdvancedModelRendererExtended Neck;
    private final AdvancedModelRendererExtended cube_r1;
    private final AdvancedModelRendererExtended Body1;
    private final AdvancedModelRendererExtended cube_r2;
    private final AdvancedModelRendererExtended ForearmR;
    private final AdvancedModelRendererExtended Humerus_r1;
    private final AdvancedModelRendererExtended Radio_UlnaR;
    private final AdvancedModelRendererExtended Radio_Ulna_r1;
    private final AdvancedModelRendererExtended ManusR;
    private final AdvancedModelRendererExtended cube_r3;
    private final AdvancedModelRendererExtended ForearmL;
    private final AdvancedModelRendererExtended Humerus_r2;
    private final AdvancedModelRendererExtended Radio_UlnaL;
    private final AdvancedModelRendererExtended Radio_Ulna_r2;
    private final AdvancedModelRendererExtended ManusL;
    private final AdvancedModelRendererExtended cube_r4;
    private final AdvancedModelRendererExtended Body2;
    private final AdvancedModelRendererExtended cube_r5;
    private final AdvancedModelRendererExtended Body3;
    private final AdvancedModelRendererExtended cube_r6;
    private final AdvancedModelRendererExtended FemurR;
    private final AdvancedModelRendererExtended cube_r7;
    private final AdvancedModelRendererExtended Tibia_FibulaR;
    private final AdvancedModelRendererExtended cube_r8;
    private final AdvancedModelRendererExtended PesR;
    private final AdvancedModelRendererExtended cube_r9;
    private final AdvancedModelRendererExtended FemurR2;
    private final AdvancedModelRendererExtended cube_r10;
    private final AdvancedModelRendererExtended Tibia_FibulaR2;
    private final AdvancedModelRendererExtended cube_r11;
    private final AdvancedModelRendererExtended PesR2;
    private final AdvancedModelRendererExtended cube_r12;
    private final AdvancedModelRendererExtended Body4;
    private final AdvancedModelRendererExtended Body5;
    private final AdvancedModelRendererExtended cube_r13;
    private final AdvancedModelRendererExtended Body6;
    private final AdvancedModelRendererExtended Cephalon;
    private final AdvancedModelRendererExtended Cranium;
    private final AdvancedModelRendererExtended cube_r14;
    private final AdvancedModelRendererExtended cube_r15;
    private final AdvancedModelRendererExtended cube_r16;
    private final AdvancedModelRendererExtended cube_r17;
    private final AdvancedModelRendererExtended cube_r18;
    private final AdvancedModelRendererExtended cube_r19;
    private final AdvancedModelRendererExtended cube_r20;
    private final AdvancedModelRendererExtended Jaw;
    private final AdvancedModelRendererExtended cube_r21;
    private final AdvancedModelRendererExtended cube_r22;
    private final AdvancedModelRendererExtended cube_r23;
    private final AdvancedModelRendererExtended cube_r24;
    private final AdvancedModelRendererExtended Tongue;
    private final AdvancedModelRendererExtended Tongue2;

    private ModelAnimator animator;

    public ModelDasyceps() {
        this.textureWidth = 128;
        this.textureHeight = 128;

        this.Dasyceps = new AdvancedModelRendererExtended(this);
        this.Dasyceps.setRotationPoint(-1.0F, 14.0F, -9.0F);


        this.Neck = new AdvancedModelRendererExtended(this);
        this.Neck.setRotationPoint(0.0F, 3.0F, -1.0F);
        this.Dasyceps.addChild(Neck);


        this.cube_r1 = new AdvancedModelRendererExtended(this);
        this.cube_r1.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.Neck.addChild(cube_r1);
        this.setRotateAngle(cube_r1, -0.0873F, 0.0F, 0.0F);
        this.cube_r1.cubeList.add(new ModelBox(cube_r1, 62, 11, -4.0F, -1.7F, -0.6F, 8, 3, 5, -0.01F, false));
        this.cube_r1.cubeList.add(new ModelBox(cube_r1, 50, 48, -5.0F, -2.5F, -0.6F, 10, 3, 5, -0.01F, false));

        this.Body1 = new AdvancedModelRendererExtended(this);
        this.Body1.setRotationPoint(0.0F, -0.3F, 4.3F);
        this.Neck.addChild(Body1);


        this.cube_r2 = new AdvancedModelRendererExtended(this);
        this.cube_r2.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.Body1.addChild(cube_r2);
        this.setRotateAngle(cube_r2, -0.1309F, 0.0F, 0.0F);
        this.cube_r2.cubeList.add(new ModelBox(cube_r2, 26, 0, -5.5F, -1.8F, 0.0F, 11, 4, 6, 0.0F, false));

        this.ForearmR = new AdvancedModelRendererExtended(this);
        this.ForearmR.setRotationPoint(-5.5F, 0.3F, 2.7F);
        this.Body1.addChild(ForearmR);


        this.Humerus_r1 = new AdvancedModelRendererExtended(this);
        this.Humerus_r1.setRotationPoint(0.0F, -1.0F, 0.7F);
        this.ForearmR.addChild(Humerus_r1);
        this.setRotateAngle(Humerus_r1, 0.0F, 0.0F, -0.5061F);
        this.Humerus_r1.cubeList.add(new ModelBox(Humerus_r1, 84, 20, -5.5F, -0.4F, -1.7F, 6, 2, 3, 0.0F, false));

        this.Radio_UlnaR = new AdvancedModelRendererExtended(this);
        this.Radio_UlnaR.setRotationPoint(-4.5F, 2.1F, 0.7F);
        this.ForearmR.addChild(Radio_UlnaR);


        this.Radio_Ulna_r1 = new AdvancedModelRendererExtended(this);
        this.Radio_Ulna_r1.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.Radio_UlnaR.addChild(Radio_Ulna_r1);
        this.setRotateAngle(Radio_Ulna_r1, 1.3537F, -0.6041F, -1.4174F);
        this.Radio_Ulna_r1.cubeList.add(new ModelBox(Radio_Ulna_r1, 68, 86, -4.6F, -0.9F, -2.0F, 5, 2, 3, 0.0F, false));

        this.ManusR = new AdvancedModelRendererExtended(this);
        this.ManusR.setRotationPoint(0.0F, 4.3F, -2.0F);
        this.Radio_UlnaR.addChild(ManusR);


        this.cube_r3 = new AdvancedModelRendererExtended(this);
        this.cube_r3.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.ManusR.addChild(cube_r3);
        this.setRotateAngle(cube_r3, 0.0F, 0.1745F, 0.0F);
        this.cube_r3.cubeList.add(new ModelBox(cube_r3, 52, 82, -2.5F, -0.9F, -4.0F, 5, 1, 4, 0.0F, false));

        this.ForearmL = new AdvancedModelRendererExtended(this);
        this.ForearmL.setRotationPoint(5.6F, 0.3F, 2.7F);
        this.Body1.addChild(ForearmL);


        this.Humerus_r2 = new AdvancedModelRendererExtended(this);
        this.Humerus_r2.setRotationPoint(0.0F, -1.0F, 0.7F);
        this.ForearmL.addChild(Humerus_r2);
        this.setRotateAngle(Humerus_r2, 0.0F, 0.0F, 0.5061F);
        this.Humerus_r2.cubeList.add(new ModelBox(Humerus_r2, 81, 59, -0.5F, -0.4F, -1.7F, 6, 2, 3, 0.0F, false));

        this.Radio_UlnaL = new AdvancedModelRendererExtended(this);
        this.Radio_UlnaL.setRotationPoint(4.5F, 2.1F, 0.7F);
        this.ForearmL.addChild(Radio_UlnaL);


        this.Radio_Ulna_r2 = new AdvancedModelRendererExtended(this);
        this.Radio_Ulna_r2.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.Radio_UlnaL.addChild(Radio_Ulna_r2);
        this.setRotateAngle(Radio_Ulna_r2, 1.3537F, 0.6041F, 1.4174F);
        this.Radio_Ulna_r2.cubeList.add(new ModelBox(Radio_Ulna_r2, 85, 69, -0.4F, -0.9F, -2.0F, 5, 2, 3, 0.0F, false));

        this.ManusL = new AdvancedModelRendererExtended(this);
        this.ManusL.setRotationPoint(0.0F, 4.3F, -2.0F);
        this.Radio_UlnaL.addChild(ManusL);


        this.cube_r4 = new AdvancedModelRendererExtended(this);
        this.cube_r4.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.ManusL.addChild(cube_r4);
        this.setRotateAngle(cube_r4, 0.0F, -0.1745F, 0.0F);
        this.cube_r4.cubeList.add(new ModelBox(cube_r4, 81, 53, -2.5F, -0.9F, -4.0F, 5, 1, 4, 0.0F, false));

        this.Body2 = new AdvancedModelRendererExtended(this);
        this.Body2.setRotationPoint(0.0F, 1.0F, 6.0F);
        this.Body1.addChild(Body2);
        this.setRotateAngle(Body2, 0.0873F, 0.0F, 0.0F);


        this.cube_r5 = new AdvancedModelRendererExtended(this);
        this.cube_r5.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.Body2.addChild(cube_r5);
        this.setRotateAngle(cube_r5, -0.2007F, 0.0F, 0.0F);
        this.cube_r5.cubeList.add(new ModelBox(cube_r5, 16, 18, -5.0F, -2.0F, -0.3F, 10, 4, 9, 0.0F, false));

        this.Body3 = new AdvancedModelRendererExtended(this);
        this.Body3.setRotationPoint(0.0F, 2.0F, 8.6F);
        this.Body2.addChild(Body3);
        this.setRotateAngle(Body3, -0.2182F, 0.0F, 0.0F);


        this.cube_r6 = new AdvancedModelRendererExtended(this);
        this.cube_r6.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.Body3.addChild(cube_r6);
        this.setRotateAngle(cube_r6, 0.0436F, 0.0F, 0.0F);
        this.cube_r6.cubeList.add(new ModelBox(cube_r6, 21, 48, -4.0F, -2.2F, -0.1F, 8, 4, 6, 0.0F, false));

        this.FemurR = new AdvancedModelRendererExtended(this);
        this.FemurR.setRotationPoint(-4.0F, -0.7F, 4.0F);
        this.Body3.addChild(FemurR);
        this.setRotateAngle(FemurR, 0.0F, 0.0F, 0.2182F);


        this.cube_r7 = new AdvancedModelRendererExtended(this);
        this.cube_r7.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.FemurR.addChild(cube_r7);
        this.setRotateAngle(cube_r7, -0.2295F, 0.2556F, -0.5177F);
        this.cube_r7.cubeList.add(new ModelBox(cube_r7, 37, 80, -4.7F, -1.0F, -2.0F, 6, 2, 3, 0.0F, false));

        this.Tibia_FibulaR = new AdvancedModelRendererExtended(this);
        this.Tibia_FibulaR.setRotationPoint(-4.0F, 3.0F, 1.0F);
        this.FemurR.addChild(Tibia_FibulaR);


        this.cube_r8 = new AdvancedModelRendererExtended(this);
        this.cube_r8.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.Tibia_FibulaR.addChild(cube_r8);
        this.setRotateAngle(cube_r8, -1.6672F, 0.167F, -1.4693F);
        this.cube_r8.cubeList.add(new ModelBox(cube_r8, 0, 18, -3.1F, -0.4F, -1.0F, 4, 2, 2, 0.0F, false));

        this.PesR = new AdvancedModelRendererExtended(this);
        this.PesR.setRotationPoint(0.0F, 3.0F, 0.0F);
        this.Tibia_FibulaR.addChild(PesR);


        this.cube_r9 = new AdvancedModelRendererExtended(this);
        this.cube_r9.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.PesR.addChild(cube_r9);
        this.setRotateAngle(cube_r9, 0.1047F, 0.0F, -0.2269F);
        this.cube_r9.cubeList.add(new ModelBox(cube_r9, 70, 79, -3.0F, -0.6F, -4.0F, 5, 1, 5, 0.0F, false));

        this.FemurR2 = new AdvancedModelRendererExtended(this);
        this.FemurR2.setRotationPoint(4.25F, -0.7F, 4.0F);
        this.Body3.addChild(FemurR2);
        this.setRotateAngle(FemurR2, 0.0F, 0.0F, -0.2182F);


        this.cube_r10 = new AdvancedModelRendererExtended(this);
        this.cube_r10.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.FemurR2.addChild(cube_r10);
        this.setRotateAngle(cube_r10, -0.2295F, -0.2556F, 0.5177F);
        this.cube_r10.cubeList.add(new ModelBox(cube_r10, 30, 59, -1.3F, -1.0F, -2.0F, 6, 2, 3, 0.0F, false));

        this.Tibia_FibulaR2 = new AdvancedModelRendererExtended(this);
        this.Tibia_FibulaR2.setRotationPoint(4.0F, 3.0F, 1.0F);
        this.FemurR2.addChild(Tibia_FibulaR2);


        this.cube_r11 = new AdvancedModelRendererExtended(this);
        this.cube_r11.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.Tibia_FibulaR2.addChild(cube_r11);
        this.setRotateAngle(cube_r11, -1.6672F, -0.167F, 1.4693F);
        this.cube_r11.cubeList.add(new ModelBox(cube_r11, 0, 7, -0.9F, -0.4F, -1.0F, 4, 2, 2, 0.0F, false));

        this.PesR2 = new AdvancedModelRendererExtended(this);
        this.PesR2.setRotationPoint(0.0F, 3.0F, 0.0F);
        this.Tibia_FibulaR2.addChild(PesR2);


        this.cube_r12 = new AdvancedModelRendererExtended(this);
        this.cube_r12.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.PesR2.addChild(cube_r12);
        this.setRotateAngle(cube_r12, 0.1047F, 0.0F, 0.2269F);
        this.cube_r12.cubeList.add(new ModelBox(cube_r12, 79, 0, -2.0F, -0.6F, -4.0F, 5, 1, 5, 0.0F, false));

        this.Body4 = new AdvancedModelRendererExtended(this);
        this.Body4.setRotationPoint(0.0F, 0.0F, 6.0F);
        this.Body3.addChild(Body4);
        this.Body4.cubeList.add(new ModelBox(Body4, 42, 57, -2.5F, -2.0F, 0.0F, 5, 3, 8, 0.0F, false));
        this.Body4.cubeList.add(new ModelBox(Body4, 72, 57, 0.0F, -5.0F, 0.0F, 0, 3, 8, 0.0F, false));

        this.Body5 = new AdvancedModelRendererExtended(this);
        this.Body5.setRotationPoint(0.0F, 0.0F, 8.0F);
        this.Body4.addChild(Body5);
        this.Body5.cubeList.add(new ModelBox(Body5, 15, 72, 0.0F, -6.0F, 0.0F, 0, 4, 8, 0.0F, false));

        this.cube_r13 = new AdvancedModelRendererExtended(this);
        this.cube_r13.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.Body5.addChild(cube_r13);
        this.setRotateAngle(cube_r13, 0.0873F, 0.0F, 0.0F);
        this.cube_r13.cubeList.add(new ModelBox(cube_r13, 69, 20, -1.5F, -2.0F, 0.0F, 3, 3, 8, 0.0F, false));

        this.Body6 = new AdvancedModelRendererExtended(this);
        this.Body6.setRotationPoint(0.0F, -1.0F, 8.0F);
        this.Body5.addChild(Body6);
        this.setRotateAngle(Body6, 0.1309F, 0.0F, 0.0F);
        this.Body6.cubeList.add(new ModelBox(Body6, 0, 67, -1.0F, -1.0F, 0.0F, 2, 2, 9, 0.0F, false));
        this.Body6.cubeList.add(new ModelBox(Body6, 0, 18, 0.0F, -5.0F, 0.0F, 0, 6, 15, 0.0F, false));

        this.Cephalon = new AdvancedModelRendererExtended(this);
        this.Cephalon.setRotationPoint(0.0F, 1.0F, -1.0F);
        this.Dasyceps.addChild(Cephalon);


        this.Cranium = new AdvancedModelRendererExtended(this);
        this.Cranium.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.Cephalon.addChild(Cranium);
        this.setRotateAngle(Cranium, 0.0873F, 0.0F, 0.0F);
        this.Cranium.cubeList.add(new ModelBox(Cranium, 36, 32, 2.192F, -1.208F, -5.952F, 2, 2, 2, 0.0F, false));
        this.Cranium.cubeList.add(new ModelBox(Cranium, 16, 18, -4.192F, -1.208F, -5.952F, 2, 2, 2, 0.0F, false));
        this.Cranium.cubeList.add(new ModelBox(Cranium, 0, 28, -2.52F, -2.016F, -0.152F, 2, 1, 3, -0.01F, false));
        this.Cranium.cubeList.add(new ModelBox(Cranium, 0, 23, 0.52F, -2.016F, -0.152F, 2, 1, 3, -0.01F, false));

        this.cube_r14 = new AdvancedModelRendererExtended(this);
        this.cube_r14.setRotationPoint(-5.08F, 1.552F, -2.76F);
        this.Cranium.addChild(cube_r14);
        this.setRotateAngle(cube_r14, -0.0531F, -0.0504F, -0.2335F);
        this.cube_r14.cubeList.add(new ModelBox(cube_r14, 11, 85, -2.0F, -2.1F, -1.064F, 2, 1, 6, 0.0F, false));

        this.cube_r15 = new AdvancedModelRendererExtended(this);
        this.cube_r15.setRotationPoint(2.52F, 1.4F, -14.16F);
        this.Cranium.addChild(cube_r15);
        this.setRotateAngle(cube_r15, 0.0368F, 0.5244F, 0.1878F);
        this.cube_r15.cubeList.add(new ModelBox(cube_r15, 76, 48, -8.0F, -2.0F, 10.64F, 8, 2, 2, 0.01F, false));
        this.cube_r15.cubeList.add(new ModelBox(cube_r15, 0, 40, -6.76F, -2.0F, 8.66F, 1, 2, 2, 0.0F, false));
        this.cube_r15.cubeList.add(new ModelBox(cube_r15, 26, 80, -5.76F, -2.0F, 4.66F, 2, 2, 6, 0.0F, false));
        this.cube_r15.cubeList.add(new ModelBox(cube_r15, 54, 71, -3.84F, -2.0F, 2.64F, 2, 2, 8, 0.0F, false));
        this.cube_r15.cubeList.add(new ModelBox(cube_r15, 46, 11, -2.0F, -2.0F, 0.0F, 2, 2, 11, 0.0F, false));

        this.cube_r16 = new AdvancedModelRendererExtended(this);
        this.cube_r16.setRotationPoint(-0.52F, 1.552F, -14.16F);
        this.Cranium.addChild(cube_r16);
        this.setRotateAngle(cube_r16, 0.0368F, -0.5244F, -0.1878F);
        this.cube_r16.cubeList.add(new ModelBox(cube_r16, 78, 41, -1.616F, -2.304F, 11.248F, 8, 2, 2, 0.01F, false));

        this.cube_r17 = new AdvancedModelRendererExtended(this);
        this.cube_r17.setRotationPoint(-0.52F, 1.4F, -14.16F);
        this.Cranium.addChild(cube_r17);
        this.setRotateAngle(cube_r17, 0.0368F, -0.5244F, -0.1878F);
        this.cube_r17.cubeList.add(new ModelBox(cube_r17, 0, 40, -1.7F, -2.3F, 0.7F, 2, 2, 11, 0.0F, false));
        this.cube_r17.cubeList.add(new ModelBox(cube_r17, 33, 69, 0.14F, -2.3F, 3.34F, 2, 2, 8, 0.0F, false));
        this.cube_r17.cubeList.add(new ModelBox(cube_r17, 0, 79, 2.06F, -2.3F, 5.36F, 2, 2, 6, 0.0F, false));
        this.cube_r17.cubeList.add(new ModelBox(cube_r17, 36, 37, 4.06F, -2.3F, 9.36F, 1, 2, 2, 0.0F, false));

        this.cube_r18 = new AdvancedModelRendererExtended(this);
        this.cube_r18.setRotationPoint(1.0F, 1.4F, -0.48F);
        this.Cranium.addChild(cube_r18);
        this.setRotateAngle(cube_r18, -0.1484F, 0.0F, 0.0F);
        this.cube_r18.cubeList.add(new ModelBox(cube_r18, 78, 33, -3.48F, -1.8243F, -4.5079F, 5, 2, 5, 0.0F, false));

        this.cube_r19 = new AdvancedModelRendererExtended(this);
        this.cube_r19.setRotationPoint(1.0F, 1.4F, -14.16F);
        this.Cranium.addChild(cube_r19);
        this.setRotateAngle(cube_r19, 0.0873F, 0.0F, 0.0F);
        this.cube_r19.cubeList.add(new ModelBox(cube_r19, 0, 0, -3.48F, -2.152F, -0.4F, 5, 2, 15, 0.0F, false));

        this.cube_r20 = new AdvancedModelRendererExtended(this);
        this.cube_r20.setRotationPoint(7.08F, 1.4F, -2.76F);
        this.Cranium.addChild(cube_r20);
        this.setRotateAngle(cube_r20, -0.0533F, 0.094F, 0.2311F);
        this.cube_r20.cubeList.add(new ModelBox(cube_r20, 84, 7, -2.0F, -1.696F, -1.064F, 2, 1, 6, 0.0F, false));

        this.Jaw = new AdvancedModelRendererExtended(this);
        this.Jaw.setRotationPoint(0.0F, 2.0F, 0.0F);
        this.Cephalon.addChild(Jaw);
        this.setRotateAngle(Jaw, 0.0436F, 0.0F, 0.0F);


        this.cube_r21 = new AdvancedModelRendererExtended(this);
        this.cube_r21.setRotationPoint(0.0F, 0.0F, -14.0F);
        this.Jaw.addChild(cube_r21);
        this.setRotateAngle(cube_r21, 0.0023F, -0.4364F, -0.005F);
        this.cube_r21.cubeList.add(new ModelBox(cube_r21, 19, 32, -0.9F, -0.5F, 0.9F, 2, 1, 12, 0.0F, false));
        this.cube_r21.cubeList.add(new ModelBox(cube_r21, 58, 58, -1.9F, -0.5F, 0.9F, 1, 1, 11, 0.0F, false));
        this.cube_r21.cubeList.add(new ModelBox(cube_r21, 53, 25, 1.1F, -0.5F, 2.9F, 2, 1, 11, 0.0F, false));

        this.cube_r22 = new AdvancedModelRendererExtended(this);
        this.cube_r22.setRotationPoint(2.0F, 0.0F, -14.0F);
        this.Jaw.addChild(cube_r22);
        this.setRotateAngle(cube_r22, 0.0023F, 0.4364F, 0.005F);
        this.cube_r22.cubeList.add(new ModelBox(cube_r22, 0, 54, -4.9F, -0.5F, 2.0F, 2, 1, 11, 0.0F, false));
        this.cube_r22.cubeList.add(new ModelBox(cube_r22, 36, 34, -2.9F, -0.5F, 0.0F, 2, 1, 12, 0.0F, false));
        this.cube_r22.cubeList.add(new ModelBox(cube_r22, 16, 59, -0.9F, -0.5F, 0.0F, 1, 1, 11, 0.0F, false));

        this.cube_r23 = new AdvancedModelRendererExtended(this);
        this.cube_r23.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.Jaw.addChild(cube_r23);
        this.setRotateAngle(cube_r23, 0.0175F, 0.0F, 0.0F);
        this.cube_r23.cubeList.add(new ModelBox(cube_r23, 61, 0, -2.0F, -0.8F, -14.0F, 4, 1, 9, 0.0F, false));
        this.cube_r23.cubeList.add(new ModelBox(cube_r23, 67, 71, -3.0F, -0.8F, -5.0F, 6, 2, 5, 0.0F, false));

        this.cube_r24 = new AdvancedModelRendererExtended(this);
        this.cube_r24.setRotationPoint(0.0F, 1.3F, -5.0F);
        this.Jaw.addChild(cube_r24);
        this.setRotateAngle(cube_r24, -0.1571F, 0.0F, 0.0F);
        this.cube_r24.cubeList.add(new ModelBox(cube_r24, 53, 38, -2.0F, -1.0125F, -4.9781F, 4, 1, 5, 0.0F, false));

        this.Tongue = new AdvancedModelRendererExtended(this);
        this.Tongue.setRotationPoint(0.0F, 1.0F, -1.0F);
        this.Cephalon.addChild(Tongue);
        this.Tongue.cubeList.add(new ModelBox(Tongue, 65, 38, -1.0F, 0.0F, -7.0F, 2, 1, 8, 0.0F, false));

        this.Tongue2 = new AdvancedModelRendererExtended(this);
        this.Tongue2.setRotationPoint(0.0F, 0.5F, -7.0F);
        this.Tongue.addChild(Tongue2);
        this.Tongue2.cubeList.add(new ModelBox(Tongue2, 0, 0, -1.0F, -1.0F, -4.0F, 2, 2, 4, 0.0F, false));

        updateDefaultPose();
        animator = ModelAnimator.create();
    }

    @Override
    public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        animate((IAnimatedEntity) entity, f, f1, f2, f3, f4, f5);
        this.Dasyceps.render(f5);
    }
    public void renderStatic(float f) {
        //GlStateManager.pushMatrix();
        //GlStateManager.enableBlend();
        //GlStateManager.blendFunc(GlStateManager.SourceFactor.SRC_ALPHA, GlStateManager.DestFactor.ONE_MINUS_SRC_ALPHA);
        //GlStateManager.disableCull();
        this.Dasyceps.offsetZ = -0.3F;
        this.setRotateAngle(cube_r1, -0.0873F, 0.0F, 0.0F);
        this.setRotateAngle(Body1, 0.0F, 0.0436F, 0.0F);
        this.setRotateAngle(cube_r2, -0.1309F, 0.0F, 0.0F);
        this.setRotateAngle(Humerus_r1, 0.0F, 0.0F, -0.5061F);
        this.setRotateAngle(Radio_Ulna_r1, 1.3537F, -0.6041F, -1.4174F);
        this.setRotateAngle(cube_r3, 0.0F, 0.1745F, 0.0F);
        this.setRotateAngle(Humerus_r2, 0.0F, 0.0F, 0.5061F);
        this.setRotateAngle(Radio_Ulna_r2, 1.3537F, 0.6041F, 1.4174F);
        this.setRotateAngle(cube_r4, 0.0F, -0.1745F, 0.0F);
        this.setRotateAngle(Body2, 0.088F, 0.1304F, 0.0115F);
        this.setRotateAngle(cube_r5, -0.2007F, 0.0F, 0.0F);
        this.setRotateAngle(Body3, -0.2214F, 0.1704F, -0.0381F);
        this.setRotateAngle(cube_r6, 0.0436F, 0.0F, 0.0F);
        this.setRotateAngle(FemurR, 0.0F, 0.0F, 0.2182F);
        this.setRotateAngle(cube_r7, -0.2295F, 0.2556F, -0.5177F);
        this.setRotateAngle(cube_r8, -1.6672F, 0.167F, -1.4693F);
        this.setRotateAngle(cube_r9, 0.1047F, 0.0F, -0.2269F);
        this.setRotateAngle(FemurR2, 0.0F, 0.0F, -0.2182F);
        this.setRotateAngle(cube_r10, -0.2295F, -0.2556F, 0.5177F);
        this.setRotateAngle(cube_r11, -1.6672F, -0.167F, 1.4693F);
        this.setRotateAngle(cube_r12, 0.1047F, 0.0F, 0.2269F);
        this.setRotateAngle(Body4, 0.0F, 0.3054F, 0.0F);
        this.setRotateAngle(Body5, 0.0F, 0.3927F, 0.0F);
        this.setRotateAngle(cube_r13, 0.0873F, 0.0F, 0.0F);
        this.setRotateAngle(Body6, 0.1509F, 0.5187F, 0.0752F);
        this.setRotateAngle(Cephalon, 0.0F, -0.4363F, 0.0F);
        this.setRotateAngle(Cranium, -0.3491F, 0.0F, 0.0F);
        this.setRotateAngle(cube_r14, -0.0531F, -0.0504F, -0.2335F);
        this.setRotateAngle(cube_r15, 0.0368F, 0.5244F, 0.1878F);
        this.setRotateAngle(cube_r16, 0.0368F, -0.5244F, -0.1878F);
        this.setRotateAngle(cube_r17, 0.0368F, -0.5244F, -0.1878F);
        this.setRotateAngle(cube_r18, -0.1484F, 0.0F, 0.0F);
        this.setRotateAngle(cube_r19, 0.0873F, 0.0F, 0.0F);
        this.setRotateAngle(cube_r20, -0.0533F, 0.094F, 0.2311F);
        this.setRotateAngle(Jaw, 0.3491F, 0.0F, 0.0F);
        this.setRotateAngle(cube_r21, 0.0023F, -0.4364F, -0.005F);
        this.setRotateAngle(cube_r22, 0.0023F, 0.4364F, 0.005F);
        this.setRotateAngle(cube_r23, 0.0175F, 0.0F, 0.0F);
        this.setRotateAngle(cube_r24, -0.1571F, 0.0F, 0.0F);
        this.Dasyceps.render(0.1F);
        //GlStateManager.enableCull();
        //GlStateManager.disableBlend();
        //GlStateManager.popMatrix();
    }
    @Override
    public void renderStaticBook(float f) {
        //Rotations, positions and sizing:
        this.Dasyceps.offsetY = -0.8F;
        this.Dasyceps.offsetX = 1.3F;
        this.Dasyceps.offsetZ = 2.2F;
        this.Dasyceps.rotateAngleY = (float)Math.toRadians(120);
        this.Dasyceps.rotateAngleX = (float)Math.toRadians(1);
        this.Dasyceps.rotateAngleZ = (float)Math.toRadians(0);
        this.Dasyceps.scaleChildren = true;
        float scaler = 1.1F;
        this.Dasyceps.setScale(scaler, scaler, scaler);
        //Start of pose:
        this.setRotateAngle(Dasyceps, 0.6F, 3.8F, -0.2F);
        this.setRotateAngle(cube_r1, -0.0873F, 0.0F, 0.0F);
        this.setRotateAngle(Body1, 0.0F, 0.0436F, 0.0F);
        this.setRotateAngle(cube_r2, -0.1309F, 0.0F, 0.0F);
        this.setRotateAngle(Humerus_r1, 0.0F, 0.0F, -0.5061F);
        this.setRotateAngle(Radio_Ulna_r1, 1.3537F, -0.6041F, -1.4174F);
        this.setRotateAngle(cube_r3, 0.0F, 0.1745F, 0.0F);
        this.setRotateAngle(Humerus_r2, 0.0F, 0.0F, 0.5061F);
        this.setRotateAngle(Radio_Ulna_r2, 1.3537F, 0.6041F, 1.4174F);
        this.setRotateAngle(cube_r4, 0.0F, -0.1745F, 0.0F);
        this.setRotateAngle(Body2, 0.088F, 0.1304F, 0.0115F);
        this.setRotateAngle(cube_r5, -0.2007F, 0.0F, 0.0F);
        this.setRotateAngle(Body3, -0.2214F, 0.1704F, -0.0381F);
        this.setRotateAngle(cube_r6, 0.0436F, 0.0F, 0.0F);
        this.setRotateAngle(FemurR, 0.0F, 0.0F, 0.2182F);
        this.setRotateAngle(cube_r7, -0.2295F, 0.2556F, -0.5177F);
        this.setRotateAngle(cube_r8, -1.6672F, 0.167F, -1.4693F);
        this.setRotateAngle(cube_r9, 0.1047F, 0.0F, -0.2269F);
        this.setRotateAngle(FemurR2, 0.0F, 0.0F, -0.2182F);
        this.setRotateAngle(cube_r10, -0.2295F, -0.2556F, 0.5177F);
        this.setRotateAngle(cube_r11, -1.6672F, -0.167F, 1.4693F);
        this.setRotateAngle(cube_r12, 0.1047F, 0.0F, 0.2269F);
        this.setRotateAngle(Body4, 0.0F, 0.3054F, 0.0F);
        this.setRotateAngle(Body5, 0.0F, 0.3927F, 0.0F);
        this.setRotateAngle(cube_r13, 0.0873F, 0.0F, 0.0F);
        this.setRotateAngle(Body6, 0.1509F, 0.5187F, 0.0752F);
        this.setRotateAngle(Cephalon, 0.0F, -0.4363F, 0.0F);
        this.setRotateAngle(Cranium, -0.3491F, 0.0F, 0.0F);
        this.setRotateAngle(cube_r14, -0.0531F, -0.0504F, -0.2335F);
        this.setRotateAngle(cube_r15, 0.0368F, 0.5244F, 0.1878F);
        this.setRotateAngle(cube_r16, 0.0368F, -0.5244F, -0.1878F);
        this.setRotateAngle(cube_r17, 0.0368F, -0.5244F, -0.1878F);
        this.setRotateAngle(cube_r18, -0.1484F, 0.0F, 0.0F);
        this.setRotateAngle(cube_r19, 0.0873F, 0.0F, 0.0F);
        this.setRotateAngle(cube_r20, -0.0533F, 0.094F, 0.2311F);
        this.setRotateAngle(Jaw, 0.3491F, 0.0F, 0.0F);
        this.setRotateAngle(cube_r21, 0.0023F, -0.4364F, -0.005F);
        this.setRotateAngle(cube_r22, 0.0023F, 0.4364F, 0.005F);
        this.setRotateAngle(cube_r23, 0.0175F, 0.0F, 0.0F);
        this.setRotateAngle(cube_r24, -0.1571F, 0.0F, 0.0F);
        //End of pose, now render the model:
        this.Dasyceps.render(f);
        //Reset rotations, positions and sizing:
        this.Dasyceps.setScale(1.0F, 1.0F, 1.0F);
        this.Dasyceps.scaleChildren = false;
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
        //this.Dasyceps.offsetY = 1.03F; //72

        EntityPrehistoricFloraDasyceps DasycepsEntity = (EntityPrehistoricFloraDasyceps) e;

        this.faceTarget(f3, f4, 8, Neck);
        this.faceTarget(f3, f4, 8, Cephalon);

        float speed = 0.225F;
        if (DasycepsEntity.getIsFast() || DasycepsEntity.isReallyInWater()) {
            speed = speed * 1.52F;
        }
        AdvancedModelRenderer[] Tail = {this.Body2, this.Body3, this.Body4, this.Body5, this.Body6};
        AdvancedModelRenderer[] Torso = {this.Neck, this.Body1};
        DasycepsEntity.tailBuffer.applyChainSwingBuffer(Tail);
        if (!DasycepsEntity.isReallyInWater()) {

            if (f3 == 0.0F || !DasycepsEntity.getIsMoving()) { //Not moving
                return;
            }

            this.flap(FemurR2, speed, 0.45F, false, 0, -0.35F, f2, 0.5F);
            this.swing(FemurR2, speed, -0.5F, true, 5, 0.25F, f2, 0.5F);
            this.walk(Tibia_FibulaR2, speed, -0.6F, true, 5, 0F, f2, 0.8F);
            this.walk(PesR2, speed, 0.6F, false, 1, 0.3F, f2, 0.5F);

            this.flap(FemurR, speed, -0.45F, false, 3, 0.35F, f2, 0.5F);
            this.swing(FemurR, speed, -0.5F, true, 8, 0.25F, f2, 0.5F);
            this.walk(Tibia_FibulaR, speed, -0.6F, true, 8, 0F, f2, 0.8F);
            this.walk(PesR, speed, 0.6F, false, 4, 0.3F, f2, 0.5F);

            this.flap(ForearmL, speed, 0.45F, false, 3, -0.35F, f2, 0.5F);
            this.swing(ForearmL, speed, -0.5F, true, 8, 0.25F, f2, 0.5F);
            this.walk(Radio_UlnaL, speed, -0.6F, true, 8, 0.4F, f2, 0.8F);
            this.walk(ManusL, speed, 0.6F, false, 4, 0.3F, f2, 0.5F);

            this.flap(ForearmR, speed, -0.45F, false, 0, 0.35F, f2, 0.5F);
            this.swing(ForearmR, speed, -0.5F, true, 5, 0.25F, f2, 0.5F);
            this.walk(Radio_UlnaR, speed, -0.6F, true, 5, 0.4F, f2, 0.8F);
            this.walk(ManusR, speed, 0.6F, false, 1, 0.3F, f2, 0.5F);

            this.chainWave(Tail, speed, 0.05F, -0.2, f2, 0.7F);
            this.chainSwing(Tail, speed, 0.1F, -0.2, f2, 0.5F);
            this.chainSwing(Torso, speed, 0.1F, -0.2, f2, 0.7F);
            this.bob(Dasyceps, speed*2, 0.3F, false, f2, 1F);

            this.Dasyceps.offsetZ = this.moveBoxExtended(speed * 2, (float) Math.toRadians(1.5), false, 1.5F, f2, 1);

            AdvancedModelRenderer[] TongueBoxes = {this.Tongue, this.Tongue2};
            if (DasycepsEntity.getAnimation() == DasycepsEntity.ROAR_ANIMATION
                && DasycepsEntity.getAnimationTick() > 2
                && DasycepsEntity.getAnimationTick() < 57) {
                //System.err.println("roar");
                this.chainWave(TongueBoxes, 2F, 0.125F, 2F, f2, 1.0F);
            }

        }
        else {
            speed = speed * 2F;

            //Feet:
            this.ManusL.rotateAngleX = (float) Math.toRadians(70);
            this.ManusR.rotateAngleX = (float) Math.toRadians(70);
            this.PesR2.rotateAngleX = (float) Math.toRadians(50);
            this.PesR.rotateAngleX = (float) Math.toRadians(50);

            this.Radio_UlnaL.rotateAngleX= (float) Math.toRadians(40);
            this.Radio_UlnaR.rotateAngleX= (float) Math.toRadians(40);
            this.Tibia_FibulaR2.rotateAngleX= (float) Math.toRadians(50);
            this.Tibia_FibulaR.rotateAngleX= (float) Math.toRadians(50);

            AdvancedModelRenderer[] BackL = {this.Tibia_FibulaR2, this.PesR2};
            AdvancedModelRenderer[] BackR = {this.Tibia_FibulaR, this.PesR};

            this.flap(FemurR2, speed, 0.1F, false, 0F, 0.05F, f2, 1F);
            this.flap(FemurR, speed, 0.1F, false, 3F, 0.05F, f2, 1F);
            this.chainWaveExtended(BackL, speed, -0.3F, -1, 0F,  f2, 1);
            this.chainWaveExtended(BackR, speed, -0.3F, -1, 3F, f2, 1);

            this.flap(ForearmL, speed, 0.45F, false, 3, -0.35F, f2, 0.5F);
            this.swing(ForearmL, speed, -0.4F, true, 8, 0.2F, f2, 0.5F);
            this.walk(Radio_UlnaL, speed, -0.6F, true, 8, 0.4F, f2, 0.8F);
            this.walk(ManusL, speed, 0.8F, false, 3, 0.4F, f2, 0.5F);

            this.flap(ForearmR, speed, -0.45F, false, 0, 0.35F, f2, 0.5F);
            this.swing(ForearmR, speed, -0.4F, true, 5, 0.2F, f2, 0.5F);
            this.walk(Radio_UlnaR, speed, -0.6F, true, 5, 0.4F, f2, 0.8F);
            this.walk(ManusR, speed, 0.8F, false, 0, 0.4F, f2, 0.5F);

            this.chainWave(Tail, speed, 0.1F, -0.2, f2, 0.7F);
            this.chainSwing(Tail, speed, 0.3F, -0.2, f2, 0.5F);
            this.chainSwing(Torso, speed, 0.1F, -0.2, f2, 0.7F);
        }
    }

    public void animate(IAnimatedEntity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        EntityPrehistoricFloraAgeableBase e = (EntityPrehistoricFloraAgeableBase) entity;
        animator.update(entity);
        this.resetToDefaultPose();
        setRotationAngles(f, f1, f2, f3, f4, f5, (Entity) entity);

        animator.setAnimation(e.ROAR_ANIMATION); //60 ticks
        animator.startKeyframe(10);
        animator.move(this.Cephalon, 0,0,-0.2F);
        animator.rotate(this.Cephalon, (float) Math.toRadians(-55), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(this.Jaw, (float) Math.toRadians(65), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(this.Tongue, (float) Math.toRadians(37.5), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.endKeyframe();
        animator.setStaticKeyframe(40);
        animator.resetKeyframe(10);

        animator.setAnimation(e.ATTACK_ANIMATION); //20 ticks
        animator.startKeyframe(10);
        animator.move(this.Cephalon, 0,0,-0.2F);
        animator.rotate(this.Cephalon, (float) Math.toRadians(-25), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(this.Jaw, (float) Math.toRadians(10), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.endKeyframe();
        animator.setStaticKeyframe(5);
        animator.resetKeyframe(5);
    }
}
