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
    private final AdvancedModelRendererExtended L4;
    private final AdvancedModelRendererExtended L44;
    private final AdvancedModelRendererExtended R4;
    private final AdvancedModelRendererExtended R44;
    private final AdvancedModelRendererExtended L3;
    private final AdvancedModelRendererExtended L33;
    private final AdvancedModelRendererExtended R3;
    private final AdvancedModelRendererExtended R33;
    private final AdvancedModelRendererExtended frond4;
    private final AdvancedModelRendererExtended L1;
    private final AdvancedModelRendererExtended R1;
    private final AdvancedModelRendererExtended L2;
    private final AdvancedModelRendererExtended L22;
    private final AdvancedModelRendererExtended R2;
    private final AdvancedModelRendererExtended R22;

    public ModelCharniodiscus() {
        textureWidth = 16;
        textureHeight = 16;

        bone = new AdvancedModelRendererExtended(this);
        bone.setRotationPoint(8.0F, 24.0F, -8.0F);
        bone.cubeList.add(new ModelBox(bone, 0, 0, -9.0F, -1.0F, 7.0F, 2, 1, 2, 0.0F, false));

        frond1 = new AdvancedModelRendererExtended(this);
        frond1.setRotationPoint(-8.0F, -1.0F, 8.0F);
        bone.addChild(frond1);
        frond1.cubeList.add(new ModelBox(frond1, 2, 3, -0.5F, -2.0F, -0.5F, 1, 2, 1, 0.0F, false));

        frond2 = new AdvancedModelRendererExtended(this);
        frond2.setRotationPoint(0.0F, -2.0F, 0.0F);
        frond1.addChild(frond2);
        frond2.cubeList.add(new ModelBox(frond2, 0, 3, -0.5F, -5.0F, 0.0F, 1, 5, 0, 0.0F, false));

        L9 = new AdvancedModelRendererExtended(this);
        L9.setRotationPoint(-0.5F, -0.5F, 0.0F);
        frond2.addChild(L9);
        setRotateAngle(L9, 0.0F, 0.7854F, 0.0F);
        L9.cubeList.add(new ModelBox(L9, 8, 5, -1.0F, -0.5F, 0.0F, 1, 1, 0, 0.0F, false));

        L99 = new AdvancedModelRendererExtended(this);
        L99.setRotationPoint(-1.0F, 0.0F, 0.0F);
        L9.addChild(L99);
        setRotateAngle(L99, 0.0F, 1.3963F, 0.0F);
        L99.cubeList.add(new ModelBox(L99, 8, 4, -1.0F, -0.5F, 0.0F, 1, 1, 0, 0.0F, false));

        R9 = new AdvancedModelRendererExtended(this);
        R9.setRotationPoint(0.5F, -0.5F, 0.0F);
        frond2.addChild(R9);
        setRotateAngle(R9, 0.0F, -0.7854F, 0.0F);
        R9.cubeList.add(new ModelBox(R9, 8, 6, 0.0F, -0.5F, 0.0F, 1, 1, 0, 0.0F, false));

        R99 = new AdvancedModelRendererExtended(this);
        R99.setRotationPoint(1.0F, 0.0F, 0.0F);
        R9.addChild(R99);
        setRotateAngle(R99, 0.0F, -1.3963F, 0.0F);
        R99.cubeList.add(new ModelBox(R99, 6, 8, 0.0F, -0.5F, 0.0F, 1, 1, 0, 0.0F, false));

        L8 = new AdvancedModelRendererExtended(this);
        L8.setRotationPoint(-0.5F, -1.5F, 0.0F);
        frond2.addChild(L8);
        setRotateAngle(L8, 0.0F, 0.7854F, 0.0F);
        L8.cubeList.add(new ModelBox(L8, 4, 8, -1.0F, -0.5F, 0.0F, 1, 1, 0, 0.0F, false));

        L88 = new AdvancedModelRendererExtended(this);
        L88.setRotationPoint(-1.0F, 0.0F, 0.0F);
        L8.addChild(L88);
        setRotateAngle(L88, 0.0F, 1.3963F, 0.0F);
        L88.cubeList.add(new ModelBox(L88, 8, 2, -1.0F, -0.5F, 0.0F, 1, 1, 0, 0.0F, false));

        R8 = new AdvancedModelRendererExtended(this);
        R8.setRotationPoint(0.5F, -1.5F, 0.0F);
        frond2.addChild(R8);
        setRotateAngle(R8, 0.0F, -0.7854F, 0.0F);
        R8.cubeList.add(new ModelBox(R8, 8, 8, 0.0F, -0.5F, 0.0F, 1, 1, 0, 0.0F, false));

        R88 = new AdvancedModelRendererExtended(this);
        R88.setRotationPoint(1.0F, 0.0F, 0.0F);
        R8.addChild(R88);
        setRotateAngle(R88, 0.0F, -1.3963F, 0.0F);
        R88.cubeList.add(new ModelBox(R88, 8, 7, 0.0F, -0.5F, 0.0F, 1, 1, 0, 0.0F, false));

        L7 = new AdvancedModelRendererExtended(this);
        L7.setRotationPoint(-0.5F, -2.5F, 0.0F);
        frond2.addChild(L7);
        setRotateAngle(L7, 0.0F, 0.7854F, 0.0F);
        L7.cubeList.add(new ModelBox(L7, 8, 1, -1.0F, -0.5F, 0.0F, 1, 1, 0, 0.0F, false));

        L77 = new AdvancedModelRendererExtended(this);
        L77.setRotationPoint(-1.0F, 0.0F, 0.0F);
        L7.addChild(L77);
        setRotateAngle(L77, 0.0F, 1.3963F, 0.0F);
        L77.cubeList.add(new ModelBox(L77, 8, 0, -1.0F, -0.5F, 0.0F, 1, 1, 0, 0.0F, false));

        R7 = new AdvancedModelRendererExtended(this);
        R7.setRotationPoint(0.5F, -2.5F, 0.0F);
        frond2.addChild(R7);
        setRotateAngle(R7, 0.0F, -0.7854F, 0.0F);
        R7.cubeList.add(new ModelBox(R7, 2, 9, 0.0F, -0.5F, 0.0F, 1, 1, 0, 0.0F, false));

        R77 = new AdvancedModelRendererExtended(this);
        R77.setRotationPoint(1.0F, 0.0F, 0.0F);
        R7.addChild(R77);
        setRotateAngle(R77, 0.0F, -1.3963F, 0.0F);
        R77.cubeList.add(new ModelBox(R77, 0, 9, 0.0F, -0.5F, 0.0F, 1, 1, 0, 0.0F, false));

        L6 = new AdvancedModelRendererExtended(this);
        L6.setRotationPoint(-0.5F, -3.5F, 0.0F);
        frond2.addChild(L6);
        setRotateAngle(L6, 0.0F, 0.7854F, 0.0F);
        L6.cubeList.add(new ModelBox(L6, 0, 8, -1.0F, -0.5F, 0.0F, 1, 1, 0, 0.0F, false));

        L66 = new AdvancedModelRendererExtended(this);
        L66.setRotationPoint(-1.0F, 0.0F, 0.0F);
        L6.addChild(L66);
        setRotateAngle(L66, 0.0F, 1.3963F, 0.0F);
        L66.cubeList.add(new ModelBox(L66, 6, 7, -1.0F, -0.5F, 0.0F, 1, 1, 0, 0.0F, false));

        R6 = new AdvancedModelRendererExtended(this);
        R6.setRotationPoint(0.5F, -3.5F, 0.0F);
        frond2.addChild(R6);
        setRotateAngle(R6, 0.0F, -0.7854F, 0.0F);
        R6.cubeList.add(new ModelBox(R6, 4, 9, 0.0F, -0.5F, 0.0F, 1, 1, 0, 0.0F, false));

        R66 = new AdvancedModelRendererExtended(this);
        R66.setRotationPoint(1.0F, 0.0F, 0.0F);
        R6.addChild(R66);
        setRotateAngle(R66, 0.0F, -1.3963F, 0.0F);
        R66.cubeList.add(new ModelBox(R66, 9, 3, 0.0F, -0.5F, 0.0F, 1, 1, 0, 0.0F, false));

        L5 = new AdvancedModelRendererExtended(this);
        L5.setRotationPoint(-0.5F, -4.5F, 0.0F);
        frond2.addChild(L5);
        setRotateAngle(L5, 0.0F, 0.7854F, 0.0F);
        L5.cubeList.add(new ModelBox(L5, 4, 7, -1.0F, -0.5F, 0.0F, 1, 1, 0, 0.0F, false));

        L55 = new AdvancedModelRendererExtended(this);
        L55.setRotationPoint(-1.0F, 0.0F, 0.0F);
        L5.addChild(L55);
        setRotateAngle(L55, 0.0F, 1.3963F, 0.0F);
        L55.cubeList.add(new ModelBox(L55, 7, 3, -1.0F, -0.5F, 0.0F, 1, 1, 0, 0.0F, false));

        R5 = new AdvancedModelRendererExtended(this);
        R5.setRotationPoint(0.5F, -4.5F, 0.0F);
        frond2.addChild(R5);
        setRotateAngle(R5, 0.0F, -0.7854F, 0.0F);
        R5.cubeList.add(new ModelBox(R5, 8, 9, 0.0F, -0.5F, 0.0F, 1, 1, 0, 0.0F, false));

        R55 = new AdvancedModelRendererExtended(this);
        R55.setRotationPoint(1.0F, 0.0F, 0.0F);
        R5.addChild(R55);
        setRotateAngle(R55, 0.0F, -1.3963F, 0.0F);
        R55.cubeList.add(new ModelBox(R55, 6, 9, 0.0F, -0.5F, 0.0F, 1, 1, 0, 0.0F, false));

        frond3 = new AdvancedModelRendererExtended(this);
        frond3.setRotationPoint(0.0F, -5.0F, 0.0F);
        frond2.addChild(frond3);
        frond3.cubeList.add(new ModelBox(frond3, 0, 0, -0.5F, -2.0F, 0.0F, 1, 2, 0, 0.0F, false));

        L4 = new AdvancedModelRendererExtended(this);
        L4.setRotationPoint(-0.5F, -0.5F, 0.0F);
        frond3.addChild(L4);
        setRotateAngle(L4, 0.0F, 0.7854F, 0.0F);
        L4.cubeList.add(new ModelBox(L4, 4, 6, -1.0F, -0.5F, 0.0F, 1, 1, 0, 0.0F, false));

        L44 = new AdvancedModelRendererExtended(this);
        L44.setRotationPoint(-1.0F, 0.0F, 0.0F);
        L4.addChild(L44);
        setRotateAngle(L44, 0.0F, 1.3963F, 0.0F);
        L44.cubeList.add(new ModelBox(L44, 6, 1, -1.0F, -0.5F, 0.0F, 1, 1, 0, 0.0F, false));

        R4 = new AdvancedModelRendererExtended(this);
        R4.setRotationPoint(0.5F, -0.5F, 0.0F);
        frond3.addChild(R4);
        setRotateAngle(R4, 0.0F, -0.7854F, 0.0F);
        R4.cubeList.add(new ModelBox(R4, 10, 0, 0.0F, -0.5F, 0.0F, 1, 1, 0, 0.0F, false));

        R44 = new AdvancedModelRendererExtended(this);
        R44.setRotationPoint(1.0F, 0.0F, 0.0F);
        R4.addChild(R44);
        setRotateAngle(R44, 0.0F, -1.3963F, 0.0F);
        R44.cubeList.add(new ModelBox(R44, 0, 10, 0.0F, -0.5F, 0.0F, 1, 1, 0, 0.0F, false));

        L3 = new AdvancedModelRendererExtended(this);
        L3.setRotationPoint(-0.5F, -1.5F, 0.0F);
        frond3.addChild(L3);
        setRotateAngle(L3, 0.0F, 0.7854F, 0.0F);
        L3.cubeList.add(new ModelBox(L3, 6, 0, -1.0F, -0.5F, 0.0F, 1, 1, 0, 0.0F, false));

        L33 = new AdvancedModelRendererExtended(this);
        L33.setRotationPoint(-1.0F, 0.0F, 0.0F);
        L3.addChild(L33);
        setRotateAngle(L33, 0.0F, 1.3963F, 0.0F);
        L33.cubeList.add(new ModelBox(L33, 5, 3, -1.0F, -0.5F, 0.0F, 1, 1, 0, 0.0F, false));

        R3 = new AdvancedModelRendererExtended(this);
        R3.setRotationPoint(0.5F, -1.5F, 0.0F);
        frond3.addChild(R3);
        setRotateAngle(R3, 0.0F, -0.7854F, 0.0F);
        R3.cubeList.add(new ModelBox(R3, 2, 10, 0.0F, -0.5F, 0.0F, 1, 1, 0, 0.0F, false));

        R33 = new AdvancedModelRendererExtended(this);
        R33.setRotationPoint(1.0F, 0.0F, 0.0F);
        R3.addChild(R33);
        setRotateAngle(R33, 0.0F, -1.3963F, 0.0F);
        R33.cubeList.add(new ModelBox(R33, 10, 1, 0.0F, -0.5F, 0.0F, 1, 1, 0, 0.0F, false));

        frond4 = new AdvancedModelRendererExtended(this);
        frond4.setRotationPoint(0.0F, -2.0F, 0.0F);
        frond3.addChild(frond4);
        frond4.cubeList.add(new ModelBox(frond4, 2, 6, -0.5F, -3.0F, 0.0F, 1, 3, 0, 0.0F, false));

        L1 = new AdvancedModelRendererExtended(this);
        L1.setRotationPoint(-0.5F, -1.5F, 0.0F);
        frond4.addChild(L1);
        setRotateAngle(L1, 0.0F, 1.0472F, 0.0F);
        L1.cubeList.add(new ModelBox(L1, 6, 6, -1.0F, -0.5F, 0.0F, 1, 1, 0, 0.0F, false));

        R1 = new AdvancedModelRendererExtended(this);
        R1.setRotationPoint(0.5F, -1.5F, 0.0F);
        frond4.addChild(R1);
        setRotateAngle(R1, 0.0F, -1.0472F, 0.0F);
        R1.cubeList.add(new ModelBox(R1, 4, 10, 0.0F, -0.5F, 0.0F, 1, 1, 0, 0.0F, false));

        L2 = new AdvancedModelRendererExtended(this);
        L2.setRotationPoint(-0.5F, -0.5F, 0.0F);
        frond4.addChild(L2);
        setRotateAngle(L2, 0.0F, 0.7854F, 0.0F);
        L2.cubeList.add(new ModelBox(L2, 6, 5, -1.0F, -0.5F, 0.0F, 1, 1, 0, 0.0F, false));

        L22 = new AdvancedModelRendererExtended(this);
        L22.setRotationPoint(-1.0F, 0.0F, 0.0F);
        L2.addChild(L22);
        setRotateAngle(L22, 0.0F, 1.3963F, 0.0F);
        L22.cubeList.add(new ModelBox(L22, 6, 4, -1.0F, -0.5F, 0.0F, 1, 1, 0, 0.0F, false));

        R2 = new AdvancedModelRendererExtended(this);
        R2.setRotationPoint(0.5F, -0.5F, 0.0F);
        frond4.addChild(R2);
        setRotateAngle(R2, 0.0F, -0.7854F, 0.0F);
        R2.cubeList.add(new ModelBox(R2, 10, 4, 0.0F, -0.5F, 0.0F, 1, 1, 0, 0.0F, false));

        R22 = new AdvancedModelRendererExtended(this);
        R22.setRotationPoint(1.0F, 0.0F, 0.0F);
        R2.addChild(R22);
        setRotateAngle(R22, 0.0F, -1.3963F, 0.0F);
        R22.cubeList.add(new ModelBox(R22, 10, 2, 0.0F, -0.5F, 0.0F, 1, 1, 0, 0.0F, false));

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
