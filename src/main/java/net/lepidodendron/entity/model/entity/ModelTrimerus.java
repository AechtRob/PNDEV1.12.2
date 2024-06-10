package net.lepidodendron.entity.model.entity;

import net.ilexiconn.llibrary.client.model.tools.AdvancedModelRenderer;
import net.lepidodendron.entity.EntityPrehistoricFloraTrimerus;
import net.lepidodendron.entity.model.ModelBasePalaeopedia;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

public class ModelTrimerus extends ModelBasePalaeopedia {
    private final AdvancedModelRenderer Trimerus;
    private final AdvancedModelRenderer cube_r1;
    private final AdvancedModelRenderer cube_r2;
    private final AdvancedModelRenderer Antennae1;
    private final AdvancedModelRenderer Antennae2;
    private final AdvancedModelRenderer RLeg1;
    private final AdvancedModelRenderer cube_r3;
    private final AdvancedModelRenderer LLeg1;
    private final AdvancedModelRenderer cube_r4;
    private final AdvancedModelRenderer Thorax1;
    private final AdvancedModelRenderer LLeg2;
    private final AdvancedModelRenderer cube_r5;
    private final AdvancedModelRenderer LLeg3;
    private final AdvancedModelRenderer cube_r6;
    private final AdvancedModelRenderer RLeg2;
    private final AdvancedModelRenderer cube_r7;
    private final AdvancedModelRenderer RLeg3;
    private final AdvancedModelRenderer cube_r8;
    private final AdvancedModelRenderer Thorax2;
    private final AdvancedModelRenderer LLeg4;
    private final AdvancedModelRenderer cube_r9;
    private final AdvancedModelRenderer RLeg4;
    private final AdvancedModelRenderer cube_r10;
    private final AdvancedModelRenderer Pygidium;
    private final AdvancedModelRenderer LLeg5;
    private final AdvancedModelRenderer cube_r11;
    private final AdvancedModelRenderer RLeg5;
    private final AdvancedModelRenderer cube_r12;

    public ModelTrimerus() {
        this.textureWidth = 32;
        this.textureHeight = 32;

        this.Trimerus = new AdvancedModelRenderer(this);
        this.Trimerus.setRotationPoint(0.0F, 23.1F, -1.0F);
        this.Trimerus.cubeList.add(new ModelBox(Trimerus, 11, 13, -1.0F, -0.5F, -3.0F, 2, 1, 3, 0.0F, false));
        this.Trimerus.cubeList.add(new ModelBox(Trimerus, 10, 10, -2.5F, -0.5F, -2.0F, 5, 1, 2, -0.01F, false));
        this.Trimerus.cubeList.add(new ModelBox(Trimerus, 0, 16, -1.0F, -0.85F, -2.0F, 2, 1, 2, 0.0F, false));
        this.Trimerus.cubeList.add(new ModelBox(Trimerus, 0, 15, -2.0F, -0.5F, -1.5F, 4, 0, 1, 0.01F, false));

        this.cube_r1 = new AdvancedModelRenderer(this);
        this.cube_r1.setRotationPoint(0.0F, 0.5F, 5.0F);
        this.Trimerus.addChild(cube_r1);
        this.setRotateAngle(cube_r1, 0.0F, -0.6545F, 0.0F);
        this.cube_r1.cubeList.add(new ModelBox(cube_r1, 0, 1, -5.6F, -1.0F, -4.15F, 1, 1, 1, -0.015F, true));
        this.cube_r1.cubeList.add(new ModelBox(cube_r1, 7, 15, -5.6F, -1.0F, -5.65F, 1, 1, 2, -0.011F, true));

        this.cube_r2 = new AdvancedModelRenderer(this);
        this.cube_r2.setRotationPoint(0.0F, 0.5F, 5.0F);
        this.Trimerus.addChild(cube_r2);
        this.setRotateAngle(cube_r2, 0.0F, 0.6545F, 0.0F);
        this.cube_r2.cubeList.add(new ModelBox(cube_r2, 0, 1, 4.6F, -1.0F, -4.15F, 1, 1, 1, -0.015F, false));
        this.cube_r2.cubeList.add(new ModelBox(cube_r2, 7, 15, 4.6F, -1.0F, -5.65F, 1, 1, 2, -0.011F, false));

        this.Antennae1 = new AdvancedModelRenderer(this);
        this.Antennae1.setRotationPoint(0.5F, 0.25F, -2.0F);
        this.Trimerus.addChild(Antennae1);
        this.Antennae1.cubeList.add(new ModelBox(Antennae1, 0, 0, 0.0F, 0.0F, -5.0F, 3, 0, 5, 0.0F, false));

        this.Antennae2 = new AdvancedModelRenderer(this);
        this.Antennae2.setRotationPoint(-0.5F, 0.25F, -2.0F);
        this.Trimerus.addChild(Antennae2);
        this.Antennae2.cubeList.add(new ModelBox(Antennae2, 0, 0, -3.0F, 0.0F, -5.0F, 3, 0, 5, 0.0F, true));

        this.RLeg1 = new AdvancedModelRenderer(this);
        this.RLeg1.setRotationPoint(-0.5F, 0.5F, -1.5F);
        this.Trimerus.addChild(RLeg1);


        this.cube_r3 = new AdvancedModelRenderer(this);
        this.cube_r3.setRotationPoint(0.5F, -0.1F, 6.5F);
        this.RLeg1.addChild(cube_r3);
        this.setRotateAngle(cube_r3, 0.0F, 0.0F, -0.1745F);
        this.cube_r3.cubeList.add(new ModelBox(cube_r3, 0, 0, -2.5F, 0.0F, -7.0F, 2, 0, 1, 0.0F, true));

        this.LLeg1 = new AdvancedModelRenderer(this);
        this.LLeg1.setRotationPoint(0.5F, 0.5F, -1.5F);
        this.Trimerus.addChild(LLeg1);


        this.cube_r4 = new AdvancedModelRenderer(this);
        this.cube_r4.setRotationPoint(-0.5F, -0.1F, 6.5F);
        this.LLeg1.addChild(cube_r4);
        this.setRotateAngle(cube_r4, 0.0F, 0.0F, 0.1745F);
        this.cube_r4.cubeList.add(new ModelBox(cube_r4, 0, 0, 0.5F, 0.0F, -7.0F, 2, 0, 1, 0.0F, false));

        this.Thorax1 = new AdvancedModelRenderer(this);
        this.Thorax1.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.Trimerus.addChild(Thorax1);
        this.Thorax1.cubeList.add(new ModelBox(Thorax1, 0, 5, -2.0F, -0.5F, -1.0F, 4, 1, 4, -0.02F, false));
        this.Thorax1.cubeList.add(new ModelBox(Thorax1, 12, 5, -1.0F, -0.75F, 0.0F, 2, 1, 3, -0.01F, false));

        this.LLeg2 = new AdvancedModelRenderer(this);
        this.LLeg2.setRotationPoint(0.5F, 0.5F, 0.5F);
        this.Thorax1.addChild(LLeg2);


        this.cube_r5 = new AdvancedModelRenderer(this);
        this.cube_r5.setRotationPoint(-0.5F, -0.1F, 6.5F);
        this.LLeg2.addChild(cube_r5);
        this.setRotateAngle(cube_r5, 0.0F, 0.0F, 0.1745F);
        this.cube_r5.cubeList.add(new ModelBox(cube_r5, 0, 0, 0.5F, 0.0F, -7.0F, 2, 0, 1, 0.0F, false));

        this.LLeg3 = new AdvancedModelRenderer(this);
        this.LLeg3.setRotationPoint(0.5F, 0.5F, 2.5F);
        this.Thorax1.addChild(LLeg3);


        this.cube_r6 = new AdvancedModelRenderer(this);
        this.cube_r6.setRotationPoint(-0.5F, -0.1F, 6.5F);
        this.LLeg3.addChild(cube_r6);
        this.setRotateAngle(cube_r6, 0.0F, 0.0F, 0.1745F);
        this.cube_r6.cubeList.add(new ModelBox(cube_r6, 0, 0, 0.5F, 0.0F, -7.0F, 2, 0, 1, 0.0F, false));

        this.RLeg2 = new AdvancedModelRenderer(this);
        this.RLeg2.setRotationPoint(-0.5F, 0.5F, 0.5F);
        this.Thorax1.addChild(RLeg2);


        this.cube_r7 = new AdvancedModelRenderer(this);
        this.cube_r7.setRotationPoint(0.5F, -0.1F, 6.5F);
        this.RLeg2.addChild(cube_r7);
        this.setRotateAngle(cube_r7, 0.0F, 0.0F, -0.1745F);
        this.cube_r7.cubeList.add(new ModelBox(cube_r7, 0, 0, -2.5F, 0.0F, -7.0F, 2, 0, 1, 0.0F, true));

        this.RLeg3 = new AdvancedModelRenderer(this);
        this.RLeg3.setRotationPoint(-0.5F, 0.5F, 2.5F);
        this.Thorax1.addChild(RLeg3);


        this.cube_r8 = new AdvancedModelRenderer(this);
        this.cube_r8.setRotationPoint(0.5F, -0.1F, 6.5F);
        this.RLeg3.addChild(cube_r8);
        this.setRotateAngle(cube_r8, 0.0F, 0.0F, -0.1745F);
        this.cube_r8.cubeList.add(new ModelBox(cube_r8, 0, 0, -2.5F, 0.0F, -7.0F, 2, 0, 1, 0.0F, true));

        this.Thorax2 = new AdvancedModelRenderer(this);
        this.Thorax2.setRotationPoint(0.0F, 0.0F, 3.0F);
        this.Thorax1.addChild(Thorax2);
        this.Thorax2.cubeList.add(new ModelBox(Thorax2, 0, 10, -1.5F, -0.5F, -1.0F, 3, 1, 4, -0.03F, false));
        this.Thorax2.cubeList.add(new ModelBox(Thorax2, 11, 0, -0.5F, -0.75F, -1.0F, 1, 1, 4, -0.02F, false));

        this.LLeg4 = new AdvancedModelRenderer(this);
        this.LLeg4.setRotationPoint(0.0F, 0.5F, 1.5F);
        this.Thorax2.addChild(LLeg4);


        this.cube_r9 = new AdvancedModelRenderer(this);
        this.cube_r9.setRotationPoint(-0.5F, -0.1F, 6.5F);
        this.LLeg4.addChild(cube_r9);
        this.setRotateAngle(cube_r9, 0.0F, 0.0F, 0.1745F);
        this.cube_r9.cubeList.add(new ModelBox(cube_r9, 0, 0, 0.5F, 0.0F, -7.0F, 2, 0, 1, 0.0F, false));

        this.RLeg4 = new AdvancedModelRenderer(this);
        this.RLeg4.setRotationPoint(0.0F, 0.5F, 1.5F);
        this.Thorax2.addChild(RLeg4);


        this.cube_r10 = new AdvancedModelRenderer(this);
        this.cube_r10.setRotationPoint(0.5F, -0.1F, 6.5F);
        this.RLeg4.addChild(cube_r10);
        this.setRotateAngle(cube_r10, 0.0F, 0.0F, -0.1745F);
        this.cube_r10.cubeList.add(new ModelBox(cube_r10, 0, 0, -2.5F, 0.0F, -7.0F, 2, 0, 1, 0.0F, true));

        this.Pygidium = new AdvancedModelRenderer(this);
        this.Pygidium.setRotationPoint(0.0F, 0.0F, 3.0F);
        this.Thorax2.addChild(Pygidium);
        this.Pygidium.cubeList.add(new ModelBox(Pygidium, 17, 0, -1.0F, -0.5F, -1.0F, 2, 1, 2, -0.04F, false));

        this.LLeg5 = new AdvancedModelRenderer(this);
        this.LLeg5.setRotationPoint(0.0F, 0.5F, 0.5F);
        this.Pygidium.addChild(LLeg5);


        this.cube_r11 = new AdvancedModelRenderer(this);
        this.cube_r11.setRotationPoint(-0.5F, -0.1F, 6.5F);
        this.LLeg5.addChild(cube_r11);
        this.setRotateAngle(cube_r11, 0.0F, 0.0F, 0.1745F);
        this.cube_r11.cubeList.add(new ModelBox(cube_r11, 0, 0, 0.5F, 0.0F, -7.0F, 2, 0, 1, 0.0F, false));

        this.RLeg5 = new AdvancedModelRenderer(this);
        this.RLeg5.setRotationPoint(0.0F, 0.5F, 0.5F);
        this.Pygidium.addChild(RLeg5);


        this.cube_r12 = new AdvancedModelRenderer(this);
        this.cube_r12.setRotationPoint(0.5F, -0.1F, 6.5F);
        this.RLeg5.addChild(cube_r12);
        this.setRotateAngle(cube_r12, 0.0F, 0.0F, -0.1745F);
        this.cube_r12.cubeList.add(new ModelBox(cube_r12, 0, 0, -2.5F, 0.0F, -7.0F, 2, 0, 1, 0.0F, true));

        updateDefaultPose();
    }

    @Override
    public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        this.Trimerus.render(f5 * 0.38F);
    }

    public void renderStatic(float f) {
        //GlStateManager.pushMatrix();
        //GlStateManager.enableBlend();
        //GlStateManager.disableCull();
        //GlStateManager.blendFunc(GlStateManager.SourceFactor.SRC_ALPHA, GlStateManager.DestFactor.ONE_MINUS_SRC_ALPHA);
        //this.Trimerus.offsetZ = 0.1F;
        this.Trimerus.render(0.022f);
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
        this.Trimerus.offsetY = 0.91F;
        EntityPrehistoricFloraTrimerus ee = (EntityPrehistoricFloraTrimerus) e;

        AdvancedModelRenderer[] legsL = {this.LLeg1, this.LLeg2, this.LLeg3, this.LLeg4, this.LLeg5};
        AdvancedModelRenderer[] legsR = {this.RLeg1, this.RLeg2, this.RLeg3, this.RLeg4, this.RLeg5};

        this.swing(Antennae1, 0.5F, -0.2F, false, 0, -0.1F, f2, 0.8F);
        this.swing(Antennae2, 0.5F, 0.2F, false, 0, 0.1F, f2, 0.8F);

        if (ee.isInWater()) {
            if (ee.getIsMoving()) {
                this.flap(LLeg1, 0.5F, -0.5F, false, 0, -0.5F, f2, 0.3F);
                this.flap(RLeg1, 0.5F, 0.5F, false, 0, 0.5F, f2, 0.3F);
                this.flap(LLeg2, 0.5F, -0.5F, false, 1.0F, -0.5F, f2, 0.3F);
                this.flap(RLeg2, 0.5F, 0.5F, false, 1.0F, 0.5F, f2, 0.3F);
                this.flap(LLeg3, 0.5F, -0.5F, false, 2.0F, -0.5F, f2, 0.3F);
                this.flap(RLeg3, 0.5F, 0.5F, false, 2.0F, 0.5F, f2, 0.3F);
                this.flap(LLeg4, 0.5F, -0.5F, false, 3.0F, -0.5F, f2, 0.3F);
                this.flap(RLeg4, 0.5F, 0.5F, false, 3.0F, 0.5F, f2, 0.3F);
                this.flap(LLeg5, 0.5F, -0.5F, false, 4.0F, -0.5F, f2, 0.3F);
                this.flap(RLeg5, 0.5F, 0.5F, false, 4.0F, 0.5F, f2, 0.3F);

                this.chainWave(legsL, 0.2F, 0.2F, -3, f2, 1);
                this.chainWave(legsR, 0.6F, 0.2F, -3, f2, 1);
            }
        }
    }
}
