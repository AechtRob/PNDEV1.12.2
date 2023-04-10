package net.lepidodendron.entity.model.entity;

import net.ilexiconn.llibrary.client.model.tools.AdvancedModelBase;
import net.ilexiconn.llibrary.client.model.tools.AdvancedModelRenderer;
import net.minecraft.block.material.Material;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLiving;
import net.minecraft.util.math.BlockPos;

public class ModelCrotalocephalus extends AdvancedModelBase {
    private final AdvancedModelRenderer Crotalocephalus;
    private final AdvancedModelRenderer Cephalon3;
    private final AdvancedModelRenderer Librigena_r1;
    private final AdvancedModelRenderer Librigena_r2;
    private final AdvancedModelRenderer Librigena_r3;
    private final AdvancedModelRenderer Librigena_r4;
    private final AdvancedModelRenderer Librigena_r5;
    private final AdvancedModelRenderer Librigena_r6;
    private final AdvancedModelRenderer Glabella_r1;
    private final AdvancedModelRenderer AntennaL2;
    private final AdvancedModelRenderer Antennasx_r1;
    private final AdvancedModelRenderer AntennaL3;
    private final AdvancedModelRenderer Antennasx_r2;
    private final AdvancedModelRenderer Thorax2;
    private final AdvancedModelRenderer ThoracicSegment6;
    private final AdvancedModelRenderer PleuralBand3_r1;
    private final AdvancedModelRenderer PleuralBand2_r1;
    private final AdvancedModelRenderer PleuralBand2_r2;
    private final AdvancedModelRenderer PleuralBand1_r1;
    private final AdvancedModelRenderer LegL6;
    private final AdvancedModelRenderer LegL5;
    private final AdvancedModelRenderer ThoracicSegment7;
    private final AdvancedModelRenderer PleuralBand4_r1;
    private final AdvancedModelRenderer PleuralBand3_r2;
    private final AdvancedModelRenderer PleuralBand3_r3;
    private final AdvancedModelRenderer PleuralBand2_r3;
    private final AdvancedModelRenderer LegL7;
    private final AdvancedModelRenderer LegL10;
    private final AdvancedModelRenderer ThoracicSegment8;
    private final AdvancedModelRenderer PleuralBand5_r1;
    private final AdvancedModelRenderer PleuralBand4_r2;
    private final AdvancedModelRenderer PleuralBand4_r3;
    private final AdvancedModelRenderer PleuralBand3_r4;
    private final AdvancedModelRenderer LegL8;
    private final AdvancedModelRenderer LegL11;
    private final AdvancedModelRenderer ThoracicSegment9;
    private final AdvancedModelRenderer PleuralBand6_r1;
    private final AdvancedModelRenderer PleuralBand5_r2;
    private final AdvancedModelRenderer PleuralBand5_r3;
    private final AdvancedModelRenderer PleuralBand4_r4;
    private final AdvancedModelRenderer LegL9;
    private final AdvancedModelRenderer LegL12;
    private final AdvancedModelRenderer ThoracicSegment2;
    private final AdvancedModelRenderer PleuralBand7_r1;
    private final AdvancedModelRenderer PleuralBand6_r2;
    private final AdvancedModelRenderer PleuralBand6_r3;
    private final AdvancedModelRenderer PleuralBand5_r4;
    private final AdvancedModelRenderer LegL2;
    private final AdvancedModelRenderer LegL13;
    private final AdvancedModelRenderer ThoracicSegment3;
    private final AdvancedModelRenderer PleuralBand11_r1;
    private final AdvancedModelRenderer PleuralBand10_r1;
    private final AdvancedModelRenderer PleuralBand10_r2;
    private final AdvancedModelRenderer PleuralBand9_r1;
    private final AdvancedModelRenderer PleuralBand9_r2;
    private final AdvancedModelRenderer PleuralBand8_r1;
    private final AdvancedModelRenderer PleuralBand8_r2;
    private final AdvancedModelRenderer PleuralBand7_r2;
    private final AdvancedModelRenderer PleuralBand7_r3;
    private final AdvancedModelRenderer PleuralBand6_r4;
    private final AdvancedModelRenderer backantennaL;
    private final AdvancedModelRenderer backantennaL2;
    private final AdvancedModelRenderer LegL3;
    private final AdvancedModelRenderer LegL4;

    public ModelCrotalocephalus() {
        this.textureWidth = 64;
        this.textureHeight = 64;

        this.Crotalocephalus = new AdvancedModelRenderer(this);
        this.Crotalocephalus.setRotationPoint(0.0F, 23.0F, 0.0F);


        this.Cephalon3 = new AdvancedModelRenderer(this);
        this.Cephalon3.setRotationPoint(0.0F, 0.0F, -5.0F);
        this.Crotalocephalus.addChild(Cephalon3);
        this.Cephalon3.cubeList.add(new ModelBox(Cephalon3, 15, 26, -1.5F, -2.0F, -3.5F, 3, 2, 3, 0.0F, false));
        this.Cephalon3.cubeList.add(new ModelBox(Cephalon3, 28, 26, -1.5F, -3.4F, -2.1F, 3, 3, 2, 0.0F, false));
        this.Cephalon3.cubeList.add(new ModelBox(Cephalon3, 23, 0, -1.5F, -2.4F, -0.1F, 3, 2, 4, 0.0F, false));
        this.Cephalon3.cubeList.add(new ModelBox(Cephalon3, 0, 0, -1.0F, -3.3F, -0.1F, 2, 3, 4, -0.002F, false));
        this.Cephalon3.cubeList.add(new ModelBox(Cephalon3, 35, 18, -2.0F, -1.75F, 0.8F, 4, 1, 1, 0.0F, false));

        this.Librigena_r1 = new AdvancedModelRenderer(this);
        this.Librigena_r1.setRotationPoint(-3.5F, 0.0F, 1.1F);
        this.Cephalon3.addChild(Librigena_r1);
        this.setRotateAngle(Librigena_r1, 0.2967F, -0.0611F, -0.3927F);
        this.Librigena_r1.cubeList.add(new ModelBox(Librigena_r1, 0, 26, 0.0956F, -0.0433F, -0.1763F, 4, 1, 3, 0.0F, true));

        this.Librigena_r2 = new AdvancedModelRenderer(this);
        this.Librigena_r2.setRotationPoint(3.5F, 0.0F, 1.1F);
        this.Cephalon3.addChild(Librigena_r2);
        this.setRotateAngle(Librigena_r2, 0.2967F, 0.0611F, 0.3927F);
        this.Librigena_r2.cubeList.add(new ModelBox(Librigena_r2, 0, 26, -4.0956F, -0.0433F, -0.1763F, 4, 1, 3, 0.0F, false));

        this.Librigena_r3 = new AdvancedModelRenderer(this);
        this.Librigena_r3.setRotationPoint(3.5F, 0.6F, 3.0F);
        this.Cephalon3.addChild(Librigena_r3);
        this.setRotateAngle(Librigena_r3, 0.0F, 0.2007F, 0.3927F);
        this.Librigena_r3.cubeList.add(new ModelBox(Librigena_r3, 36, 36, -0.5806F, -0.0976F, -0.0195F, 1, 0, 3, 0.0F, false));

        this.Librigena_r4 = new AdvancedModelRenderer(this);
        this.Librigena_r4.setRotationPoint(-3.5F, 0.6F, 3.0F);
        this.Cephalon3.addChild(Librigena_r4);
        this.setRotateAngle(Librigena_r4, 0.0F, -0.2007F, -0.3927F);
        this.Librigena_r4.cubeList.add(new ModelBox(Librigena_r4, 36, 36, -0.4194F, -0.0976F, -0.0195F, 1, 0, 3, 0.0F, true));

        this.Librigena_r5 = new AdvancedModelRenderer(this);
        this.Librigena_r5.setRotationPoint(-1.0F, 0.0F, 1.0F);
        this.Cephalon3.addChild(Librigena_r5);
        this.setRotateAngle(Librigena_r5, 0.0F, -0.3927F, -0.3927F);
        this.Librigena_r5.cubeList.add(new ModelBox(Librigena_r5, 21, 15, -2.0F, -1.0F, -4.0F, 3, 1, 7, 0.0F, true));

        this.Librigena_r6 = new AdvancedModelRenderer(this);
        this.Librigena_r6.setRotationPoint(1.0F, 0.0F, 1.0F);
        this.Cephalon3.addChild(Librigena_r6);
        this.setRotateAngle(Librigena_r6, 0.0F, 0.3927F, 0.3927F);
        this.Librigena_r6.cubeList.add(new ModelBox(Librigena_r6, 21, 15, -1.0F, -1.0F, -4.0F, 3, 1, 7, 0.0F, false));

        this.Glabella_r1 = new AdvancedModelRenderer(this);
        this.Glabella_r1.setRotationPoint(-0.5F, 0.0F, 0.0F);
        this.Cephalon3.addChild(Glabella_r1);
        this.setRotateAngle(Glabella_r1, -0.7592F, 0.0F, 0.0F);
        this.Glabella_r1.cubeList.add(new ModelBox(Glabella_r1, 0, 8, -1.0F, -1.0F, -3.9F, 3, 2, 3, 0.001F, false));

        this.AntennaL2 = new AdvancedModelRenderer(this);
        this.AntennaL2.setRotationPoint(0.5F, 0.0F, -3.2F);
        this.Cephalon3.addChild(AntennaL2);
        this.setRotateAngle(AntennaL2, -0.1279F, -0.1509F, 0.2205F);


        this.Antennasx_r1 = new AdvancedModelRenderer(this);
        this.Antennasx_r1.setRotationPoint(0.8538F, 0.0F, 0.1613F);
        this.AntennaL2.addChild(Antennasx_r1);
        this.setRotateAngle(Antennasx_r1, 0.0F, 0.3491F, 0.0F);
        this.Antennasx_r1.cubeList.add(new ModelBox(Antennasx_r1, 0, 0, -0.7362F, 0.01F, -0.4825F, 4, 0, 14, 0.0F, false));

        this.AntennaL3 = new AdvancedModelRenderer(this);
        this.AntennaL3.setRotationPoint(-0.5F, 0.0F, -3.2F);
        this.Cephalon3.addChild(AntennaL3);
        this.setRotateAngle(AntennaL3, -0.1279F, 0.1509F, -0.2205F);


        this.Antennasx_r2 = new AdvancedModelRenderer(this);
        this.Antennasx_r2.setRotationPoint(-0.8538F, 0.0F, 0.1613F);
        this.AntennaL3.addChild(Antennasx_r2);
        this.setRotateAngle(Antennasx_r2, 0.0F, -0.3491F, 0.0F);
        this.Antennasx_r2.cubeList.add(new ModelBox(Antennasx_r2, 0, 0, -3.2638F, 0.01F, -0.4825F, 4, 0, 14, 0.0F, true));

        this.Thorax2 = new AdvancedModelRenderer(this);
        this.Thorax2.setRotationPoint(0.0F, -1.0F, 4.0F);
        this.Crotalocephalus.addChild(Thorax2);


        this.ThoracicSegment6 = new AdvancedModelRenderer(this);
        this.ThoracicSegment6.setRotationPoint(0.0F, 0.0F, -5.1F);
        this.Thorax2.addChild(ThoracicSegment6);
        this.ThoracicSegment6.cubeList.add(new ModelBox(ThoracicSegment6, 18, 36, -0.99F, -2.31F, 0.0F, 2, 2, 2, 0.0F, false));

        this.PleuralBand3_r1 = new AdvancedModelRenderer(this);
        this.PleuralBand3_r1.setRotationPoint(-3.0F, 0.3F, 1.0F);
        this.ThoracicSegment6.addChild(PleuralBand3_r1);
        this.setRotateAngle(PleuralBand3_r1, 0.0F, 0.0F, -0.4538F);
        this.PleuralBand3_r1.cubeList.add(new ModelBox(PleuralBand3_r1, 0, 40, -2.018F, -0.0911F, 0.0F, 2, 0, 1, 0.0F, true));

        this.PleuralBand2_r1 = new AdvancedModelRenderer(this);
        this.PleuralBand2_r1.setRotationPoint(3.0F, 0.3F, 1.0F);
        this.ThoracicSegment6.addChild(PleuralBand2_r1);
        this.setRotateAngle(PleuralBand2_r1, 0.0F, 0.0F, 0.4538F);
        this.PleuralBand2_r1.cubeList.add(new ModelBox(PleuralBand2_r1, 0, 40, 0.018F, -0.0911F, 0.0F, 2, 0, 1, 0.0F, false));

        this.PleuralBand2_r2 = new AdvancedModelRenderer(this);
        this.PleuralBand2_r2.setRotationPoint(-1.0F, -2.0F, 2.0F);
        this.ThoracicSegment6.addChild(PleuralBand2_r2);
        this.setRotateAngle(PleuralBand2_r2, 0.0F, 0.0F, -0.6632F);
        this.PleuralBand2_r2.cubeList.add(new ModelBox(PleuralBand2_r2, 34, 0, -3.01F, 0.09F, -2.0F, 3, 1, 2, 0.0F, true));

        this.PleuralBand1_r1 = new AdvancedModelRenderer(this);
        this.PleuralBand1_r1.setRotationPoint(1.0F, -2.0F, 2.0F);
        this.ThoracicSegment6.addChild(PleuralBand1_r1);
        this.setRotateAngle(PleuralBand1_r1, 0.0F, 0.0F, 0.6632F);
        this.PleuralBand1_r1.cubeList.add(new ModelBox(PleuralBand1_r1, 34, 0, 0.01F, 0.09F, -2.0F, 3, 1, 2, 0.0F, false));

        this.ThoracicSegment7 = new AdvancedModelRenderer(this);
        this.ThoracicSegment7.setRotationPoint(0.0F, 0.0F, 2.0F);
        this.ThoracicSegment6.addChild(ThoracicSegment7);
        this.ThoracicSegment7.cubeList.add(new ModelBox(ThoracicSegment7, 9, 36, -0.99F, -2.31F, 0.0F, 2, 2, 2, 0.0F, false));

        this.PleuralBand4_r1 = new AdvancedModelRenderer(this);
        this.PleuralBand4_r1.setRotationPoint(-3.0F, 0.3F, 1.0F);
        this.ThoracicSegment7.addChild(PleuralBand4_r1);
        this.setRotateAngle(PleuralBand4_r1, 0.0F, 0.0F, -0.4538F);
        this.PleuralBand4_r1.cubeList.add(new ModelBox(PleuralBand4_r1, 39, 30, -2.018F, -0.0911F, 0.0F, 2, 0, 1, 0.0F, true));

        this.PleuralBand3_r2 = new AdvancedModelRenderer(this);
        this.PleuralBand3_r2.setRotationPoint(3.0F, 0.3F, 1.0F);
        this.ThoracicSegment7.addChild(PleuralBand3_r2);
        this.setRotateAngle(PleuralBand3_r2, 0.0F, 0.0F, 0.4538F);
        this.PleuralBand3_r2.cubeList.add(new ModelBox(PleuralBand3_r2, 39, 30, 0.018F, -0.0911F, 0.0F, 2, 0, 1, 0.0F, false));

        this.PleuralBand3_r3 = new AdvancedModelRenderer(this);
        this.PleuralBand3_r3.setRotationPoint(-1.0F, -2.0F, 2.0F);
        this.ThoracicSegment7.addChild(PleuralBand3_r3);
        this.setRotateAngle(PleuralBand3_r3, 0.0F, 0.0F, -0.6632F);
        this.PleuralBand3_r3.cubeList.add(new ModelBox(PleuralBand3_r3, 33, 32, -3.01F, 0.09F, -2.0F, 3, 1, 2, 0.0F, true));

        this.PleuralBand2_r3 = new AdvancedModelRenderer(this);
        this.PleuralBand2_r3.setRotationPoint(1.0F, -2.0F, 2.0F);
        this.ThoracicSegment7.addChild(PleuralBand2_r3);
        this.setRotateAngle(PleuralBand2_r3, 0.0F, 0.0F, 0.6632F);
        this.PleuralBand2_r3.cubeList.add(new ModelBox(PleuralBand2_r3, 33, 32, 0.01F, 0.09F, -2.0F, 3, 1, 2, 0.0F, false));

        this.ThoracicSegment8 = new AdvancedModelRenderer(this);
        this.ThoracicSegment8.setRotationPoint(0.0F, 0.0F, 2.0F);
        this.ThoracicSegment7.addChild(ThoracicSegment8);
        this.ThoracicSegment8.cubeList.add(new ModelBox(ThoracicSegment8, 36, 5, -0.99F, -2.31F, 0.0F, 2, 2, 2, 0.0F, false));

        this.PleuralBand5_r1 = new AdvancedModelRenderer(this);
        this.PleuralBand5_r1.setRotationPoint(-3.0F, 0.3F, 1.0F);
        this.ThoracicSegment8.addChild(PleuralBand5_r1);
        this.setRotateAngle(PleuralBand5_r1, 0.0F, 0.0F, -0.4538F);
        this.PleuralBand5_r1.cubeList.add(new ModelBox(PleuralBand5_r1, 39, 28, -2.018F, -0.0911F, 0.0F, 2, 0, 1, 0.0F, true));

        this.PleuralBand4_r2 = new AdvancedModelRenderer(this);
        this.PleuralBand4_r2.setRotationPoint(3.0F, 0.3F, 1.0F);
        this.ThoracicSegment8.addChild(PleuralBand4_r2);
        this.setRotateAngle(PleuralBand4_r2, 0.0F, 0.0F, 0.4538F);
        this.PleuralBand4_r2.cubeList.add(new ModelBox(PleuralBand4_r2, 39, 28, 0.018F, -0.0911F, 0.0F, 2, 0, 1, 0.0F, false));

        this.PleuralBand4_r3 = new AdvancedModelRenderer(this);
        this.PleuralBand4_r3.setRotationPoint(-1.0F, -2.0F, 2.0F);
        this.ThoracicSegment8.addChild(PleuralBand4_r3);
        this.setRotateAngle(PleuralBand4_r3, 0.0F, 0.0F, -0.6632F);
        this.PleuralBand4_r3.cubeList.add(new ModelBox(PleuralBand4_r3, 22, 32, -3.01F, 0.09F, -2.0F, 3, 1, 2, 0.0F, true));

        this.PleuralBand3_r4 = new AdvancedModelRenderer(this);
        this.PleuralBand3_r4.setRotationPoint(1.0F, -2.0F, 2.0F);
        this.ThoracicSegment8.addChild(PleuralBand3_r4);
        this.setRotateAngle(PleuralBand3_r4, 0.0F, 0.0F, 0.6632F);
        this.PleuralBand3_r4.cubeList.add(new ModelBox(PleuralBand3_r4, 22, 32, 0.01F, 0.09F, -2.0F, 3, 1, 2, 0.0F, false));

        this.ThoracicSegment9 = new AdvancedModelRenderer(this);
        this.ThoracicSegment9.setRotationPoint(0.0F, 0.0F, 2.0F);
        this.ThoracicSegment8.addChild(ThoracicSegment9);
        this.ThoracicSegment9.cubeList.add(new ModelBox(ThoracicSegment9, 35, 13, -0.99F, -2.31F, 0.0F, 2, 2, 2, 0.0F, false));

        this.PleuralBand6_r1 = new AdvancedModelRenderer(this);
        this.PleuralBand6_r1.setRotationPoint(-3.0F, 0.3F, 1.0F);
        this.ThoracicSegment9.addChild(PleuralBand6_r1);
        this.setRotateAngle(PleuralBand6_r1, 0.0F, 0.0F, -0.4538F);
        this.PleuralBand6_r1.cubeList.add(new ModelBox(PleuralBand6_r1, 38, 10, -2.018F, -0.0911F, 0.0F, 2, 0, 1, 0.0F, true));

        this.PleuralBand5_r2 = new AdvancedModelRenderer(this);
        this.PleuralBand5_r2.setRotationPoint(3.0F, 0.3F, 1.0F);
        this.ThoracicSegment9.addChild(PleuralBand5_r2);
        this.setRotateAngle(PleuralBand5_r2, 0.0F, 0.0F, 0.4538F);
        this.PleuralBand5_r2.cubeList.add(new ModelBox(PleuralBand5_r2, 38, 10, 0.018F, -0.0911F, 0.0F, 2, 0, 1, 0.0F, false));

        this.PleuralBand5_r3 = new AdvancedModelRenderer(this);
        this.PleuralBand5_r3.setRotationPoint(-1.0F, -2.0F, 2.0F);
        this.ThoracicSegment9.addChild(PleuralBand5_r3);
        this.setRotateAngle(PleuralBand5_r3, 0.0F, 0.0F, -0.6632F);
        this.PleuralBand5_r3.cubeList.add(new ModelBox(PleuralBand5_r3, 11, 32, -3.01F, 0.09F, -2.0F, 3, 1, 2, 0.0F, true));

        this.PleuralBand4_r4 = new AdvancedModelRenderer(this);
        this.PleuralBand4_r4.setRotationPoint(1.0F, -2.0F, 2.0F);
        this.ThoracicSegment9.addChild(PleuralBand4_r4);
        this.setRotateAngle(PleuralBand4_r4, 0.0F, 0.0F, 0.6632F);
        this.PleuralBand4_r4.cubeList.add(new ModelBox(PleuralBand4_r4, 11, 32, 0.01F, 0.09F, -2.0F, 3, 1, 2, 0.0F, false));

        this.ThoracicSegment2 = new AdvancedModelRenderer(this);
        this.ThoracicSegment2.setRotationPoint(0.0F, 0.0F, 2.0F);
        this.ThoracicSegment9.addChild(ThoracicSegment2);
        this.ThoracicSegment2.cubeList.add(new ModelBox(ThoracicSegment2, 0, 35, -0.99F, -2.31F, 0.0F, 2, 2, 2, 0.0F, false));

        this.PleuralBand7_r1 = new AdvancedModelRenderer(this);
        this.PleuralBand7_r1.setRotationPoint(-3.0F, 0.3F, 1.0F);
        this.ThoracicSegment2.addChild(PleuralBand7_r1);
        this.setRotateAngle(PleuralBand7_r1, 0.0F, 0.0F, -0.4538F);
        this.PleuralBand7_r1.cubeList.add(new ModelBox(PleuralBand7_r1, 21, 19, -2.018F, -0.0911F, 0.0F, 2, 0, 1, 0.0F, true));

        this.PleuralBand6_r2 = new AdvancedModelRenderer(this);
        this.PleuralBand6_r2.setRotationPoint(3.0F, 0.3F, 1.0F);
        this.ThoracicSegment2.addChild(PleuralBand6_r2);
        this.setRotateAngle(PleuralBand6_r2, 0.0F, 0.0F, 0.4538F);
        this.PleuralBand6_r2.cubeList.add(new ModelBox(PleuralBand6_r2, 21, 19, 0.018F, -0.0911F, 0.0F, 2, 0, 1, 0.0F, false));

        this.PleuralBand6_r3 = new AdvancedModelRenderer(this);
        this.PleuralBand6_r3.setRotationPoint(-1.0F, -2.0F, 2.0F);
        this.ThoracicSegment2.addChild(PleuralBand6_r3);
        this.setRotateAngle(PleuralBand6_r3, 0.0F, 0.0F, -0.6632F);
        this.PleuralBand6_r3.cubeList.add(new ModelBox(PleuralBand6_r3, 0, 31, -3.01F, 0.09F, -2.0F, 3, 1, 2, 0.0F, true));

        this.PleuralBand5_r4 = new AdvancedModelRenderer(this);
        this.PleuralBand5_r4.setRotationPoint(1.0F, -2.0F, 2.0F);
        this.ThoracicSegment2.addChild(PleuralBand5_r4);
        this.setRotateAngle(PleuralBand5_r4, 0.0F, 0.0F, 0.6632F);
        this.PleuralBand5_r4.cubeList.add(new ModelBox(PleuralBand5_r4, 0, 31, 0.01F, 0.09F, -2.0F, 3, 1, 2, 0.0F, false));

        this.ThoracicSegment3 = new AdvancedModelRenderer(this);
        this.ThoracicSegment3.setRotationPoint(0.0F, 0.0F, 2.0F);
        this.ThoracicSegment2.addChild(ThoracicSegment3);
        this.ThoracicSegment3.cubeList.add(new ModelBox(ThoracicSegment3, 0, 20, -0.99F, -2.31F, 0.0F, 2, 2, 2, 0.0F, false));
        this.ThoracicSegment3.cubeList.add(new ModelBox(ThoracicSegment3, 27, 36, -0.99F, -2.31F, 2.0F, 2, 1, 2, 0.0F, false));

        this.PleuralBand11_r1 = new AdvancedModelRenderer(this);
        this.PleuralBand11_r1.setRotationPoint(-3.2F, 0.3F, 4.0F);
        this.ThoracicSegment3.addChild(PleuralBand11_r1);
        this.setRotateAngle(PleuralBand11_r1, 0.0F, 1.4486F, -0.4538F);
        this.PleuralBand11_r1.cubeList.add(new ModelBox(PleuralBand11_r1, 31, 24, -3.3382F, -0.6034F, 2.7F, 4, 0, 1, 0.0F, true));

        this.PleuralBand10_r1 = new AdvancedModelRenderer(this);
        this.PleuralBand10_r1.setRotationPoint(3.2F, 0.3F, 4.0F);
        this.ThoracicSegment3.addChild(PleuralBand10_r1);
        this.setRotateAngle(PleuralBand10_r1, 0.0F, -1.4486F, 0.4538F);
        this.PleuralBand10_r1.cubeList.add(new ModelBox(PleuralBand10_r1, 31, 24, -0.6618F, -0.6034F, 2.7F, 4, 0, 1, 0.0F, false));

        this.PleuralBand10_r2 = new AdvancedModelRenderer(this);
        this.PleuralBand10_r2.setRotationPoint(-3.2F, 0.3F, 4.0F);
        this.ThoracicSegment3.addChild(PleuralBand10_r2);
        this.setRotateAngle(PleuralBand10_r2, 0.0F, 1.2392F, -0.4538F);
        this.PleuralBand10_r2.cubeList.add(new ModelBox(PleuralBand10_r2, 37, 26, -2.3382F, -0.0034F, 0.9F, 3, 0, 1, 0.0F, true));

        this.PleuralBand9_r1 = new AdvancedModelRenderer(this);
        this.PleuralBand9_r1.setRotationPoint(3.2F, 0.3F, 4.0F);
        this.ThoracicSegment3.addChild(PleuralBand9_r1);
        this.setRotateAngle(PleuralBand9_r1, 0.0F, -1.2392F, 0.4538F);
        this.PleuralBand9_r1.cubeList.add(new ModelBox(PleuralBand9_r1, 37, 26, -0.6618F, -0.0034F, 0.9F, 3, 0, 1, 0.0F, false));

        this.PleuralBand9_r2 = new AdvancedModelRenderer(this);
        this.PleuralBand9_r2.setRotationPoint(-3.2F, 0.3F, 4.0F);
        this.ThoracicSegment3.addChild(PleuralBand9_r2);
        this.setRotateAngle(PleuralBand9_r2, 0.0F, 0.6283F, -0.4538F);
        this.PleuralBand9_r2.cubeList.add(new ModelBox(PleuralBand9_r2, 21, 15, -1.3382F, -0.0034F, -1.1F, 2, 0, 1, 0.0F, true));

        this.PleuralBand8_r1 = new AdvancedModelRenderer(this);
        this.PleuralBand8_r1.setRotationPoint(3.2F, 0.3F, 4.0F);
        this.ThoracicSegment3.addChild(PleuralBand8_r1);
        this.setRotateAngle(PleuralBand8_r1, 0.0F, -0.6283F, 0.4538F);
        this.PleuralBand8_r1.cubeList.add(new ModelBox(PleuralBand8_r1, 21, 15, -0.6618F, -0.0034F, -1.1F, 2, 0, 1, 0.0F, false));

        this.PleuralBand8_r2 = new AdvancedModelRenderer(this);
        this.PleuralBand8_r2.setRotationPoint(-3.0F, 0.3F, 1.0F);
        this.ThoracicSegment3.addChild(PleuralBand8_r2);
        this.setRotateAngle(PleuralBand8_r2, 0.0F, 0.0F, -0.4538F);
        this.PleuralBand8_r2.cubeList.add(new ModelBox(PleuralBand8_r2, 21, 17, -2.018F, -0.0911F, 0.0F, 2, 0, 1, 0.0F, true));

        this.PleuralBand7_r2 = new AdvancedModelRenderer(this);
        this.PleuralBand7_r2.setRotationPoint(3.0F, 0.3F, 1.0F);
        this.ThoracicSegment3.addChild(PleuralBand7_r2);
        this.setRotateAngle(PleuralBand7_r2, 0.0F, 0.0F, 0.4538F);
        this.PleuralBand7_r2.cubeList.add(new ModelBox(PleuralBand7_r2, 21, 17, 0.018F, -0.0911F, 0.0F, 2, 0, 1, 0.0F, false));

        this.PleuralBand7_r3 = new AdvancedModelRenderer(this);
        this.PleuralBand7_r3.setRotationPoint(-1.0F, -2.0F, 2.0F);
        this.ThoracicSegment3.addChild(PleuralBand7_r3);
        this.setRotateAngle(PleuralBand7_r3, 0.0F, 0.0F, -0.6632F);
        this.PleuralBand7_r3.cubeList.add(new ModelBox(PleuralBand7_r3, 23, 7, -3.01F, 0.09F, -2.0F, 3, 1, 4, 0.0F, true));

        this.PleuralBand6_r4 = new AdvancedModelRenderer(this);
        this.PleuralBand6_r4.setRotationPoint(1.0F, -2.0F, 2.0F);
        this.ThoracicSegment3.addChild(PleuralBand6_r4);
        this.setRotateAngle(PleuralBand6_r4, 0.0F, 0.0F, 0.6632F);
        this.PleuralBand6_r4.cubeList.add(new ModelBox(PleuralBand6_r4, 23, 7, 0.01F, 0.09F, -2.0F, 3, 1, 4, 0.0F, false));

        this.backantennaL = new AdvancedModelRenderer(this);
        this.backantennaL.setRotationPoint(0.003F, -1.2653F, 2.0F);
        this.ThoracicSegment3.addChild(backantennaL);
        this.setRotateAngle(backantennaL, -0.0418F, 0.2749F, 0.7356F);
        this.backantennaL.cubeList.add(new ModelBox(backantennaL, 0, 15, -0.05F, 0.0F, 0.0F, 5, 0, 10, 0.0F, false));

        this.backantennaL2 = new AdvancedModelRenderer(this);
        this.backantennaL2.setRotationPoint(-0.003F, -1.2653F, 2.0F);
        this.ThoracicSegment3.addChild(backantennaL2);
        this.setRotateAngle(backantennaL2, -0.0418F, -0.2749F, -0.7356F);
        this.backantennaL2.cubeList.add(new ModelBox(backantennaL2, 0, 15, -4.95F, 0.0F, 0.0F, 5, 0, 10, 0.0F, true));

        this.LegL3 = new AdvancedModelRenderer(this);
        this.LegL3.setRotationPoint(0.2F, -0.3F, 1.0F);
        this.ThoracicSegment3.addChild(LegL3);
        this.setRotateAngle(LegL3, 0.0F, 0.0F, 0.7156F);
        this.LegL3.cubeList.add(new ModelBox(LegL3, 0, 0, 3.053F, 0.0347F, 0.0F, -3, 0, 1, 0.0F, false));

        this.LegL4 = new AdvancedModelRenderer(this);
        this.LegL4.setRotationPoint(-0.2F, -0.3F, 1.0F);
        this.ThoracicSegment3.addChild(LegL4);
        this.setRotateAngle(LegL4, 0.0F, 0.0F, -0.7156F);
        this.LegL4.cubeList.add(new ModelBox(LegL4, 0, 0, -0.053F, 0.0347F, 0.0F, -3, 0, 1, 0.0F, true));

        this.LegL2 = new AdvancedModelRenderer(this);
        this.LegL2.setRotationPoint(0.2F, -0.3F, 1.0F);
        this.ThoracicSegment2.addChild(LegL2);
        this.setRotateAngle(LegL2, 0.0F, 0.0F, 0.7156F);
        this.LegL2.cubeList.add(new ModelBox(LegL2, 0, 0, 3.053F, 0.0347F, 0.0F, -3, 0, 1, 0.0F, false));

        this.LegL13 = new AdvancedModelRenderer(this);
        this.LegL13.setRotationPoint(-0.2F, -0.3F, 1.0F);
        this.ThoracicSegment2.addChild(LegL13);
        this.setRotateAngle(LegL13, 0.0F, 0.0F, -0.7156F);
        this.LegL13.cubeList.add(new ModelBox(LegL13, 0, 0, -0.053F, 0.0347F, 0.0F, -3, 0, 1, 0.0F, true));

        this.LegL9 = new AdvancedModelRenderer(this);
        this.LegL9.setRotationPoint(0.2F, -0.3F, 1.0F);
        this.ThoracicSegment9.addChild(LegL9);
        this.setRotateAngle(LegL9, 0.0F, 0.0F, 0.7156F);
        this.LegL9.cubeList.add(new ModelBox(LegL9, 0, 0, 3.053F, 0.0347F, 0.0F, -3, 0, 1, 0.0F, false));

        this.LegL12 = new AdvancedModelRenderer(this);
        this.LegL12.setRotationPoint(-0.2F, -0.3F, 1.0F);
        this.ThoracicSegment9.addChild(LegL12);
        this.setRotateAngle(LegL12, 0.0F, 0.0F, -0.7156F);
        this.LegL12.cubeList.add(new ModelBox(LegL12, 0, 0, -0.053F, 0.0347F, 0.0F, -3, 0, 1, 0.0F, true));

        this.LegL8 = new AdvancedModelRenderer(this);
        this.LegL8.setRotationPoint(0.2F, -0.3F, 1.0F);
        this.ThoracicSegment8.addChild(LegL8);
        this.setRotateAngle(LegL8, 0.0F, 0.0F, 0.7156F);
        this.LegL8.cubeList.add(new ModelBox(LegL8, 0, 0, 3.053F, 0.0347F, 0.0F, -3, 0, 1, 0.0F, false));

        this.LegL11 = new AdvancedModelRenderer(this);
        this.LegL11.setRotationPoint(-0.2F, -0.3F, 1.0F);
        this.ThoracicSegment8.addChild(LegL11);
        this.setRotateAngle(LegL11, 0.0F, 0.0F, -0.7156F);
        this.LegL11.cubeList.add(new ModelBox(LegL11, 0, 0, -0.053F, 0.0347F, 0.0F, -3, 0, 1, 0.0F, true));

        this.LegL7 = new AdvancedModelRenderer(this);
        this.LegL7.setRotationPoint(0.2F, -0.3F, 1.0F);
        this.ThoracicSegment7.addChild(LegL7);
        this.setRotateAngle(LegL7, 0.0F, 0.0F, 0.7156F);
        this.LegL7.cubeList.add(new ModelBox(LegL7, 0, 0, 3.053F, 0.0347F, 0.0F, -3, 0, 1, 0.0F, false));

        this.LegL10 = new AdvancedModelRenderer(this);
        this.LegL10.setRotationPoint(-0.2F, -0.3F, 1.0F);
        this.ThoracicSegment7.addChild(LegL10);
        this.setRotateAngle(LegL10, 0.0F, 0.0F, -0.7156F);
        this.LegL10.cubeList.add(new ModelBox(LegL10, 0, 0, -0.053F, 0.0347F, 0.0F, -3, 0, 1, 0.0F, true));

        this.LegL6 = new AdvancedModelRenderer(this);
        this.LegL6.setRotationPoint(0.2F, -0.3F, 1.0F);
        this.ThoracicSegment6.addChild(LegL6);
        this.setRotateAngle(LegL6, 0.0F, 0.0F, 0.7156F);
        this.LegL6.cubeList.add(new ModelBox(LegL6, 0, 0, 3.053F, 0.0347F, 0.0F, -3, 0, 1, 0.0F, false));

        this.LegL5 = new AdvancedModelRenderer(this);
        this.LegL5.setRotationPoint(-0.2F, -0.3F, 1.0F);
        this.ThoracicSegment6.addChild(LegL5);
        this.setRotateAngle(LegL5, 0.0F, 0.0F, -0.7156F);
        this.LegL5.cubeList.add(new ModelBox(LegL5, 0, 0, -0.053F, 0.0347F, 0.0F, -3, 0, 1, 0.0F, true));

        updateDefaultPose();
    }

    @Override
    public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        this.Crotalocephalus.render(f5);
    }

    public void renderStatic(float f) {
        //GlStateManager.pushMatrix();
        //GlStateManager.enableBlend();
        //GlStateManager.blendFunc(GlStateManager.SourceFactor.SRC_ALPHA, GlStateManager.DestFactor.ONE_MINUS_SRC_ALPHA);
        //GlStateManager.disableCull();
        this.Crotalocephalus.render(0.019F);
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
        //this.Crotalocephalus.offsetY = 1.0F;

        AdvancedModelRenderer[] fishTail = {this.ThoracicSegment6, this.ThoracicSegment7, this.ThoracicSegment8, this.ThoracicSegment9, this.ThoracicSegment2, this.ThoracicSegment3};

        float speed = 0.45F;
        float tailVdegree = 0.30F;
        float tailHdegree = 0.0F;
        float tailSwing = 0.3F;

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
            speed = 0.18F;
            tailVdegree = 0.05F;
            tailHdegree = 0.11F;
            tailSwing = 0.2F;
        }


        if (e instanceof EntityLiving && !((EntityLiving) e).isAIDisabled()) {
            this.chainWave(fishTail, speed, tailVdegree * 0.3f, -3, f2, 1);
            this.chainSwing(fishTail, speed, tailHdegree, -2.5, f2, tailSwing);

            this.flap(LegL6, speed, -0.5F, false, 0, -0.5F, f2, 0.3F);
            this.flap(LegL5, speed, 0.5F, false, 0, 0.5F, f2, 0.3F);
            this.flap(LegL7, speed, -0.5F, false, 1.0F, -0.5F, f2, 0.3F);
            this.flap(LegL10, speed, 0.5F, false, 1.0F, 0.5F, f2, 0.3F);
            this.flap(LegL8, speed, -0.5F, false, 2.0F, -0.5F, f2, 0.3F);
            this.flap(LegL11, speed, 0.5F, false, 2.0F, 0.5F, f2, 0.3F);
            this.flap(LegL9, speed, -0.5F, false, 3.0F, -0.5F, f2, 0.3F);
            this.flap(LegL12, speed, 0.5F, false, 3.0F, 0.5F, f2, 0.3F);
            this.flap(LegL2, speed, -0.5F, false, 4.0F, -0.5F, f2, 0.3F);
            this.flap(LegL13, speed, 0.5F, false, 4.0F, 0.5F, f2, 0.3F);
            this.flap(LegL3, speed, -0.5F, false, 5.0F, -0.5F, f2, 0.3F);
            this.flap(LegL4, speed, 0.5F, false, 5.0F, 0.5F, f2, 0.3F);

            this.swing(backantennaL, 0.4F, -0.2F, false, 0, -0.1F, f2, 0.8F);
            this.swing(backantennaL2, 0.4F, 0.2F, false, 0, 0.1F, f2, 0.8F);
            this.swing(AntennaL2, 0.4F, -0.2F, false, 0, -0.1F, f2, 0.8F);
            this.swing(AntennaL3, 0.4F, 0.2F, false, 0, 0.1F, f2, 0.8F);
            //this.swing(body, speed, 0.3F, true, 0, 0, f2, 1);
            if (!isAtBottom) {
                this.bob(Crotalocephalus, -speed, 0.12F, false, f2, 2);
            }
            if (!e.isInWater()) {
                //this.Bodyfront.rotateAngleZ = (float) Math.toRadians(90);
                this.Crotalocephalus.offsetY = 1.02F;
                this.bob(Crotalocephalus, -speed, 0.21F, false, f2, 1);
                this.chainWave(fishTail, speed, tailHdegree, -3, f2, 1);
                this.chainSwing(fishTail, speed, tailVdegree, -3, f2, 1);
            }
        }
    }
}
