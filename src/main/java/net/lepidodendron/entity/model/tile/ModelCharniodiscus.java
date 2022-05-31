package net.lepidodendron.entity.model.tile;

import net.ilexiconn.llibrary.client.model.tools.AdvancedModelRenderer;
import net.lepidodendron.entity.model.llibraryextensions.AdvancedModelBaseExtended;
import net.lepidodendron.entity.model.llibraryextensions.AdvancedModelRendererExtended;
import net.minecraft.client.model.ModelBox;

public class ModelCharniodiscus extends AdvancedModelBaseExtended {
    private final AdvancedModelRendererExtended bone;
    private final AdvancedModelRendererExtended frond1;
    private final AdvancedModelRendererExtended frond2;
    private final AdvancedModelRendererExtended L9;
    private final AdvancedModelRendererExtended L99;
    private final AdvancedModelRendererExtended R9;
    private final AdvancedModelRendererExtended R99;
    private final AdvancedModelRendererExtended L8;
    private final AdvancedModelRendererExtended L88;
    private final AdvancedModelRendererExtended R8;
    private final AdvancedModelRendererExtended R88;
    private final AdvancedModelRendererExtended L7;
    private final AdvancedModelRendererExtended L77;
    private final AdvancedModelRendererExtended R7;
    private final AdvancedModelRendererExtended R77;
    private final AdvancedModelRendererExtended L6;
    private final AdvancedModelRendererExtended L66;
    private final AdvancedModelRendererExtended R6;
    private final AdvancedModelRendererExtended R66;
    private final AdvancedModelRendererExtended L5;
    private final AdvancedModelRendererExtended L55;
    private final AdvancedModelRendererExtended R5;
    private final AdvancedModelRendererExtended R55;
    private final AdvancedModelRendererExtended frond3;
    private final AdvancedModelRendererExtended frond4;
    private final AdvancedModelRendererExtended L1;
    private final AdvancedModelRendererExtended R1;
    private final AdvancedModelRendererExtended L2;
    private final AdvancedModelRendererExtended L22;
    private final AdvancedModelRendererExtended R2;
    private final AdvancedModelRendererExtended R22;
    private final AdvancedModelRendererExtended L4;
    private final AdvancedModelRendererExtended L44;
    private final AdvancedModelRendererExtended R4;
    private final AdvancedModelRendererExtended R44;
    private final AdvancedModelRendererExtended L3;
    private final AdvancedModelRendererExtended L33;
    private final AdvancedModelRendererExtended R3;
    private final AdvancedModelRendererExtended R33;

    public ModelCharniodiscus() {
        this.textureWidth = 12;
        this.textureHeight = 12;

        this.bone = new AdvancedModelRendererExtended(this);
        this.bone.setRotationPoint(8.0F, 24.0F, -8.0F);
        this.bone.cubeList.add(new ModelBox(bone, 0, 0, -9.0F, -1.0F, 7.0F, 2, 1, 2, 0.0F, false));

        this.frond1 = new AdvancedModelRendererExtended(this);
        this.frond1.setRotationPoint(-8.0F, -1.0F, 8.0F);
        this.bone.addChild(frond1);
        this.frond1.cubeList.add(new ModelBox(frond1, 0, 4, -0.5F, -2.0F, -0.5F, 1, 2, 1, 0.0F, false));

        this.frond2 = new AdvancedModelRendererExtended(this);
        this.frond2.setRotationPoint(0.0F, -2.0F, 0.0F);
        this.frond1.addChild(frond2);
        this.frond2.cubeList.add(new ModelBox(frond2, 4, 6, -0.5F, -5.0F, 0.0F, 1, 1, 0, 0.0F, false));
        this.frond2.cubeList.add(new ModelBox(frond2, 4, 7, -0.5F, -4.0F, 0.0F, 1, 1, 0, 0.0F, false));
        this.frond2.cubeList.add(new ModelBox(frond2, 6, 0, -0.5F, -3.0F, 0.0F, 1, 1, 0, 0.0F, false));
        this.frond2.cubeList.add(new ModelBox(frond2, 0, 0, -0.5F, -2.0F, 0.0F, 1, 1, 0, 0.0F, false));
        this.frond2.cubeList.add(new ModelBox(frond2, 6, 1, -0.5F, -1.0F, 0.0F, 1, 1, 0, 0.0F, false));

        this.L9 = new AdvancedModelRendererExtended(this);
        this.L9.setRotationPoint(-0.5F, -0.5F, 0.0F);
        this.frond2.addChild(L9);
        this.setRotateAngle(L9, 0.0F, 0.7854F, 0.0F);
        this.L9.cubeList.add(new ModelBox(L9, 10, 8, -1.0F, -0.5F, 0.0F, 1, 1, 0, 0.0F, true));

        this.L99 = new AdvancedModelRendererExtended(this);
        this.L99.setRotationPoint(-1.0F, 0.0F, 0.0F);
        this.L9.addChild(L99);
        this.setRotateAngle(L99, 0.0F, 1.3963F, 0.0F);
        this.L99.cubeList.add(new ModelBox(L99, 6, 11, -1.0F, -0.5F, 0.0F, 1, 1, 0, 0.0F, true));

        this.R9 = new AdvancedModelRendererExtended(this);
        this.R9.setRotationPoint(0.5F, -0.5F, 0.0F);
        this.frond2.addChild(R9);
        this.setRotateAngle(R9, 0.0F, -0.7854F, 0.0F);
        this.R9.cubeList.add(new ModelBox(R9, 8, 8, 0.0F, -0.5F, 0.0F, 1, 1, 0, 0.0F, false));

        this.R99 = new AdvancedModelRendererExtended(this);
        this.R99.setRotationPoint(1.0F, 0.0F, 0.0F);
        this.R9.addChild(R99);
        this.setRotateAngle(R99, 0.0F, -1.3963F, 0.0F);
        this.R99.cubeList.add(new ModelBox(R99, 6, 11, 0.0F, -0.5F, 0.0F, 1, 1, 0, 0.0F, false));

        this.L8 = new AdvancedModelRendererExtended(this);
        this.L8.setRotationPoint(-0.5F, -1.5F, 0.0F);
        this.frond2.addChild(L8);
        this.setRotateAngle(L8, 0.0F, 0.7854F, 0.0F);
        this.L8.cubeList.add(new ModelBox(L8, 10, 7, -1.0F, -0.5F, 0.0F, 1, 1, 0, 0.0F, true));

        this.L88 = new AdvancedModelRendererExtended(this);
        this.L88.setRotationPoint(-1.0F, 0.0F, 0.0F);
        this.L8.addChild(L88);
        this.setRotateAngle(L88, 0.0F, 1.3963F, 0.0F);
        this.L88.cubeList.add(new ModelBox(L88, 6, 10, -1.0F, -0.5F, 0.0F, 1, 1, 0, 0.0F, true));

        this.R8 = new AdvancedModelRendererExtended(this);
        this.R8.setRotationPoint(0.5F, -1.5F, 0.0F);
        this.frond2.addChild(R8);
        this.setRotateAngle(R8, 0.0F, -0.7854F, 0.0F);
        this.R8.cubeList.add(new ModelBox(R8, 8, 7, 0.0F, -0.5F, 0.0F, 1, 1, 0, 0.0F, false));

        this.R88 = new AdvancedModelRendererExtended(this);
        this.R88.setRotationPoint(1.0F, 0.0F, 0.0F);
        this.R8.addChild(R88);
        this.setRotateAngle(R88, 0.0F, -1.3963F, 0.0F);
        this.R88.cubeList.add(new ModelBox(R88, 6, 10, 0.0F, -0.5F, 0.0F, 1, 1, 0, 0.0F, false));

        this.L7 = new AdvancedModelRendererExtended(this);
        this.L7.setRotationPoint(-0.5F, -2.5F, 0.0F);
        this.frond2.addChild(L7);
        this.setRotateAngle(L7, 0.0F, 0.7854F, 0.0F);
        this.L7.cubeList.add(new ModelBox(L7, 10, 6, -1.0F, -0.5F, 0.0F, 1, 1, 0, 0.0F, true));

        this.L77 = new AdvancedModelRendererExtended(this);
        this.L77.setRotationPoint(-1.0F, 0.0F, 0.0F);
        this.L7.addChild(L77);
        this.setRotateAngle(L77, 0.0F, 1.3963F, 0.0F);
        this.L77.cubeList.add(new ModelBox(L77, 6, 9, -1.0F, -0.5F, 0.0F, 1, 1, 0, 0.0F, true));

        this.R7 = new AdvancedModelRendererExtended(this);
        this.R7.setRotationPoint(0.5F, -2.5F, 0.0F);
        this.frond2.addChild(R7);
        this.setRotateAngle(R7, 0.0F, -0.7854F, 0.0F);
        this.R7.cubeList.add(new ModelBox(R7, 8, 6, 0.0F, -0.5F, 0.0F, 1, 1, 0, 0.0F, false));

        this.R77 = new AdvancedModelRendererExtended(this);
        this.R77.setRotationPoint(1.0F, 0.0F, 0.0F);
        this.R7.addChild(R77);
        this.setRotateAngle(R77, 0.0F, -1.3963F, 0.0F);
        this.R77.cubeList.add(new ModelBox(R77, 6, 9, 0.0F, -0.5F, 0.0F, 1, 1, 0, 0.0F, false));

        this.L6 = new AdvancedModelRendererExtended(this);
        this.L6.setRotationPoint(-0.5F, -3.5F, 0.0F);
        this.frond2.addChild(L6);
        this.setRotateAngle(L6, 0.0F, 0.7854F, 0.0F);
        this.L6.cubeList.add(new ModelBox(L6, 10, 5, -1.0F, -0.5F, 0.0F, 1, 1, 0, 0.0F, true));

        this.L66 = new AdvancedModelRendererExtended(this);
        this.L66.setRotationPoint(-1.0F, 0.0F, 0.0F);
        this.L6.addChild(L66);
        this.setRotateAngle(L66, 0.0F, 1.3963F, 0.0F);
        this.L66.cubeList.add(new ModelBox(L66, 6, 8, -1.0F, -0.5F, 0.0F, 1, 1, 0, 0.0F, true));

        this.R6 = new AdvancedModelRendererExtended(this);
        this.R6.setRotationPoint(0.5F, -3.5F, 0.0F);
        this.frond2.addChild(R6);
        this.setRotateAngle(R6, 0.0F, -0.7854F, 0.0F);
        this.R6.cubeList.add(new ModelBox(R6, 8, 5, 0.0F, -0.5F, 0.0F, 1, 1, 0, 0.0F, false));

        this.R66 = new AdvancedModelRendererExtended(this);
        this.R66.setRotationPoint(1.0F, 0.0F, 0.0F);
        this.R6.addChild(R66);
        this.setRotateAngle(R66, 0.0F, -1.3963F, 0.0F);
        this.R66.cubeList.add(new ModelBox(R66, 6, 8, 0.0F, -0.5F, 0.0F, 1, 1, 0, 0.0F, false));

        this.L5 = new AdvancedModelRendererExtended(this);
        this.L5.setRotationPoint(-0.5F, -4.5F, 0.0F);
        this.frond2.addChild(L5);
        this.setRotateAngle(L5, 0.0F, 0.7854F, 0.0F);
        this.L5.cubeList.add(new ModelBox(L5, 10, 4, -1.0F, -0.5F, 0.0F, 1, 1, 0, 0.0F, true));

        this.L55 = new AdvancedModelRendererExtended(this);
        this.L55.setRotationPoint(-1.0F, 0.0F, 0.0F);
        this.L5.addChild(L55);
        this.setRotateAngle(L55, 0.0F, 1.3963F, 0.0F);
        this.L55.cubeList.add(new ModelBox(L55, 6, 7, -1.0F, -0.5F, 0.0F, 1, 1, 0, 0.0F, true));

        this.R5 = new AdvancedModelRendererExtended(this);
        this.R5.setRotationPoint(0.5F, -4.5F, 0.0F);
        this.frond2.addChild(R5);
        this.setRotateAngle(R5, 0.0F, -0.7854F, 0.0F);
        this.R5.cubeList.add(new ModelBox(R5, 8, 4, 0.0F, -0.5F, 0.0F, 1, 1, 0, 0.0F, false));

        this.R55 = new AdvancedModelRendererExtended(this);
        this.R55.setRotationPoint(1.0F, 0.0F, 0.0F);
        this.R5.addChild(R55);
        this.setRotateAngle(R55, 0.0F, -1.3963F, 0.0F);
        this.R55.cubeList.add(new ModelBox(R55, 6, 7, 0.0F, -0.5F, 0.0F, 1, 1, 0, 0.0F, false));

        this.frond3 = new AdvancedModelRendererExtended(this);
        this.frond3.setRotationPoint(0.0F, -5.0F, 0.0F);
        this.frond2.addChild(frond3);
        this.frond3.cubeList.add(new ModelBox(frond3, 6, 3, -0.5F, -2.0F, 0.0F, 1, 1, 0, 0.0F, false));
        this.frond3.cubeList.add(new ModelBox(frond3, 4, 5, -0.5F, -1.0F, 0.0F, 1, 1, 0, 0.0F, false));

        this.frond4 = new AdvancedModelRendererExtended(this);
        this.frond4.setRotationPoint(0.0F, -2.0F, 0.0F);
        this.frond3.addChild(frond4);
        this.frond4.cubeList.add(new ModelBox(frond4, 0, 3, -1.5F, -3.0F, 0.0F, 3, 1, 0, 0.0F, false));
        this.frond4.cubeList.add(new ModelBox(frond4, 3, 4, -0.5F, -2.0F, 0.0F, 1, 1, 0, 0.0F, false));
        this.frond4.cubeList.add(new ModelBox(frond4, 0, 1, -0.5F, -1.0F, 0.0F, 1, 1, 0, 0.0F, false));

        this.L1 = new AdvancedModelRendererExtended(this);
        this.L1.setRotationPoint(-0.5F, -1.5F, 0.0F);
        this.frond4.addChild(L1);
        this.setRotateAngle(L1, 0.0F, 1.0472F, 0.0F);
        this.L1.cubeList.add(new ModelBox(L1, 10, 0, -1.0F, -0.5F, 0.0F, 1, 1, 0, 0.0F, true));

        this.R1 = new AdvancedModelRendererExtended(this);
        this.R1.setRotationPoint(0.5F, -1.5F, 0.0F);
        this.frond4.addChild(R1);
        this.setRotateAngle(R1, 0.0F, -1.0472F, 0.0F);
        this.R1.cubeList.add(new ModelBox(R1, 8, 0, 0.0F, -0.5F, 0.0F, 1, 1, 0, 0.0F, false));

        this.L2 = new AdvancedModelRendererExtended(this);
        this.L2.setRotationPoint(-0.5F, -0.5F, 0.0F);
        this.frond4.addChild(L2);
        this.setRotateAngle(L2, 0.0F, 0.7854F, 0.0F);
        this.L2.cubeList.add(new ModelBox(L2, 10, 1, -1.0F, -0.5F, 0.0F, 1, 1, 0, 0.0F, true));

        this.L22 = new AdvancedModelRendererExtended(this);
        this.L22.setRotationPoint(-1.0F, 0.0F, 0.0F);
        this.L2.addChild(L22);
        this.setRotateAngle(L22, 0.0F, 1.3963F, 0.0F);
        this.L22.cubeList.add(new ModelBox(L22, 6, 4, -1.0F, -0.5F, 0.0F, 1, 1, 0, 0.0F, true));

        this.R2 = new AdvancedModelRendererExtended(this);
        this.R2.setRotationPoint(0.5F, -0.5F, 0.0F);
        this.frond4.addChild(R2);
        this.setRotateAngle(R2, 0.0F, -0.7854F, 0.0F);
        this.R2.cubeList.add(new ModelBox(R2, 8, 1, 0.0F, -0.5F, 0.0F, 1, 1, 0, 0.0F, false));

        this.R22 = new AdvancedModelRendererExtended(this);
        this.R22.setRotationPoint(1.0F, 0.0F, 0.0F);
        this.R2.addChild(R22);
        this.setRotateAngle(R22, 0.0F, -1.3963F, 0.0F);
        this.R22.cubeList.add(new ModelBox(R22, 6, 4, 0.0F, -0.5F, 0.0F, 1, 1, 0, 0.0F, false));

        this.L4 = new AdvancedModelRendererExtended(this);
        this.L4.setRotationPoint(-0.5F, -0.5F, 0.0F);
        this.frond3.addChild(L4);
        this.setRotateAngle(L4, 0.0F, 0.7854F, 0.0F);
        this.L4.cubeList.add(new ModelBox(L4, 10, 3, -1.0F, -0.5F, 0.0F, 1, 1, 0, 0.0F, true));

        this.L44 = new AdvancedModelRendererExtended(this);
        this.L44.setRotationPoint(-1.0F, 0.0F, 0.0F);
        this.L4.addChild(L44);
        this.setRotateAngle(L44, 0.0F, 1.3963F, 0.0F);
        this.L44.cubeList.add(new ModelBox(L44, 6, 6, -1.0F, -0.5F, 0.0F, 1, 1, 0, 0.0F, true));

        this.R4 = new AdvancedModelRendererExtended(this);
        this.R4.setRotationPoint(0.5F, -0.5F, 0.0F);
        this.frond3.addChild(R4);
        this.setRotateAngle(R4, 0.0F, -0.7854F, 0.0F);
        this.R4.cubeList.add(new ModelBox(R4, 8, 3, 0.0F, -0.5F, 0.0F, 1, 1, 0, 0.0F, false));

        this.R44 = new AdvancedModelRendererExtended(this);
        this.R44.setRotationPoint(1.0F, 0.0F, 0.0F);
        this.R4.addChild(R44);
        this.setRotateAngle(R44, 0.0F, -1.3963F, 0.0F);
        this.R44.cubeList.add(new ModelBox(R44, 6, 6, 0.0F, -0.5F, 0.0F, 1, 1, 0, 0.0F, false));

        this.L3 = new AdvancedModelRendererExtended(this);
        this.L3.setRotationPoint(-0.5F, -1.5F, 0.0F);
        this.frond3.addChild(L3);
        this.setRotateAngle(L3, 0.0F, 0.7854F, 0.0F);
        this.L3.cubeList.add(new ModelBox(L3, 10, 2, -1.0F, -0.5F, 0.0F, 1, 1, 0, 0.0F, true));

        this.L33 = new AdvancedModelRendererExtended(this);
        this.L33.setRotationPoint(-1.0F, 0.0F, 0.0F);
        this.L3.addChild(L33);
        this.setRotateAngle(L33, 0.0F, 1.3963F, 0.0F);
        this.L33.cubeList.add(new ModelBox(L33, 6, 5, -1.0F, -0.5F, 0.0F, 1, 1, 0, 0.0F, true));

        this.R3 = new AdvancedModelRendererExtended(this);
        this.R3.setRotationPoint(0.5F, -1.5F, 0.0F);
        this.frond3.addChild(R3);
        this.setRotateAngle(R3, 0.0F, -0.7854F, 0.0F);
        this.R3.cubeList.add(new ModelBox(R3, 8, 2, 0.0F, -0.5F, 0.0F, 1, 1, 0, 0.0F, false));

        this.R33 = new AdvancedModelRendererExtended(this);
        this.R33.setRotationPoint(1.0F, 0.0F, 0.0F);
        this.R3.addChild(R33);
        this.setRotateAngle(R33, 0.0F, -1.3963F, 0.0F);
        this.R33.cubeList.add(new ModelBox(R33, 6, 5, 0.0F, -0.5F, 0.0F, 1, 1, 0, 0.0F, false));

        updateDefaultPose();
    }

    public void renderAll(float f) {
        this.resetToDefaultPose();
        AdvancedModelRenderer[] bodyFull = {this.frond1,this.frond2,this.frond3,this.frond4};
        float speed = 0.04F;
        this.chainWave(bodyFull, speed, 0.15F, 2.5, f, 0.45F);

        AdvancedModelRenderer[] L1 = {this.L1};
        AdvancedModelRenderer[] R1 = {this.R1};
        AdvancedModelRenderer[] L2 = {this.L2, this.L22};
        AdvancedModelRenderer[] R2 = {this.R2, this.R22};
        AdvancedModelRenderer[] L3 = {this.L3, this.L33};
        AdvancedModelRenderer[] R3 = {this.R3, this.R33};
        AdvancedModelRenderer[] L4 = {this.L4, this.L44};
        AdvancedModelRenderer[] R4 = {this.R4, this.R44};
        AdvancedModelRenderer[] L5 = {this.L5, this.L55};
        AdvancedModelRenderer[] R5 = {this.R5, this.R55};
        AdvancedModelRenderer[] L6 = {this.L6, this.L66};
        AdvancedModelRenderer[] R6 = {this.R6, this.R66};
        AdvancedModelRenderer[] L7 = {this.L7, this.L77};
        AdvancedModelRenderer[] R7 = {this.R7, this.R77};
        AdvancedModelRenderer[] L8 = {this.L8, this.L88};
        AdvancedModelRenderer[] R8 = {this.R8, this.R88};
        AdvancedModelRenderer[] L9 = {this.L9, this.L99};
        AdvancedModelRenderer[] R9 = {this.R9, this.R99};

        this.chainSwingExtended(L1, 0.2F, 0.2F, 0.3F, 2.4F, f, 1F);
        this.chainSwingExtended(R1, 0.2F, -0.2F, -0.3F, 2.4F, f, 1F);
        this.chainSwingExtended(L2, 0.2F, 0.2F, 0.3F, 2.1F, f, 1F);
        this.chainSwingExtended(R2, 0.2F, -0.2F, -0.3F, 2.1F, f, 1F);
        this.chainSwingExtended(L3, 0.2F, 0.2F, 0.3F, 1.8F, f, 1F);
        this.chainSwingExtended(R3, 0.2F, -0.2F, -0.3F, 1.8F, f, 1F);
        this.chainSwingExtended(L4, 0.2F, 0.2F, 0.3F, 1.5F, f, 1F);
        this.chainSwingExtended(R4, 0.2F, -0.2F, -0.3F, 1.5F, f, 1F);
        this.chainSwingExtended(L5, 0.2F, 0.2F, 0.3F, 1.2F, f, 1F);
        this.chainSwingExtended(R5, 0.2F, -0.2F, -0.3F, 1.2F, f, 1F);
        this.chainSwingExtended(L6, 0.2F, 0.2F, 0.3F, 0.9F, f, 1F);
        this.chainSwingExtended(R6, 0.2F, -0.2F, -0.3F, 0.9F, f, 1F);
        this.chainSwingExtended(L7, 0.2F, 0.2F, 0.3F, 0.6F, f, 1F);
        this.chainSwingExtended(R7, 0.2F, -0.2F, -0.3F, 0.6F, f, 1F);
        this.chainSwingExtended(L8, 0.2F, 0.2F, 0.3F, 0.3F, f, 1F);
        this.chainSwingExtended(R8, 0.2F, -0.2F, -0.3F, 0.3F, f, 1F);
        this.chainSwingExtended(L9, 0.2F, 0.2F, 0.3F, 0.0F, f, 1F);
        this.chainSwingExtended(R9, 0.2F, -0.2F, -0.3F, 0.0F, f, 1F);

        this.bone.render(0.1f);
    }

    public void setRotateAngle(AdvancedModelRenderer modelRenderer, float x, float y, float z) {
        modelRenderer.rotateAngleX = x;
        modelRenderer.rotateAngleY = y;
        modelRenderer.rotateAngleZ = z;
    }

}
