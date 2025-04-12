package net.lepidodendron.entity.model.entity;

import net.ilexiconn.llibrary.client.model.tools.AdvancedModelRenderer;
import net.lepidodendron.entity.model.ModelBasePalaeopedia;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

public class ModelLanceaspis extends ModelBasePalaeopedia {
    private final AdvancedModelRenderer Lanceaspis;
    private final AdvancedModelRenderer cube_r1;
    private final AdvancedModelRenderer cube_r2;
    private final AdvancedModelRenderer cube_r3;
    private final AdvancedModelRenderer cube_r4;
    private final AdvancedModelRenderer cube_r5;
    private final AdvancedModelRenderer cube_r6;
    private final AdvancedModelRenderer cube_r7;
    private final AdvancedModelRenderer AntennaeLeft;
    private final AdvancedModelRenderer AntennaeRight;
    private final AdvancedModelRenderer LLeg1;
    private final AdvancedModelRenderer cube_r8;
    private final AdvancedModelRenderer LLeg2;
    private final AdvancedModelRenderer cube_r9;
    private final AdvancedModelRenderer RLeg1;
    private final AdvancedModelRenderer cube_r10;
    private final AdvancedModelRenderer RLeg2;
    private final AdvancedModelRenderer cube_r11;
    private final AdvancedModelRenderer Thorax1;
    private final AdvancedModelRenderer LLeg3;
    private final AdvancedModelRenderer cube_r12;
    private final AdvancedModelRenderer RLeg3;
    private final AdvancedModelRenderer cube_r13;
    private final AdvancedModelRenderer Thorax2;
    private final AdvancedModelRenderer LLeg4;
    private final AdvancedModelRenderer cube_r14;
    private final AdvancedModelRenderer RLeg4;
    private final AdvancedModelRenderer cube_r15;
    private final AdvancedModelRenderer Thorax3;
    private final AdvancedModelRenderer LLeg5;
    private final AdvancedModelRenderer cube_r16;
    private final AdvancedModelRenderer RLeg5;
    private final AdvancedModelRenderer cube_r17;
    private final AdvancedModelRenderer Pygidium;
    private final AdvancedModelRenderer LLeg6;
    private final AdvancedModelRenderer cube_r18;
    private final AdvancedModelRenderer RLeg6;
    private final AdvancedModelRenderer cube_r19;

    public ModelLanceaspis() {
        this.textureWidth = 32;
        this.textureHeight = 32;

        this.Lanceaspis = new AdvancedModelRenderer(this);
        this.Lanceaspis.setRotationPoint(0.0F, 23.25F, 1.0F);
        this.Lanceaspis.cubeList.add(new ModelBox(Lanceaspis, 0, 3, -3.0F, -0.5F, -2.0F, 6, 1, 2, 0.0F, false));
        this.Lanceaspis.cubeList.add(new ModelBox(Lanceaspis, 0, 10, -1.0F, -1.0F, -3.85F, 2, 1, 4, 0.0F, false));
        this.Lanceaspis.cubeList.add(new ModelBox(Lanceaspis, 18, 20, -0.5F, -0.5F, -5.7F, 1, 1, 2, 0.0F, false));
        this.Lanceaspis.cubeList.add(new ModelBox(Lanceaspis, 16, 4, -1.5F, -0.5F, -4.0F, 3, 1, 1, 0.01F, false));
        this.Lanceaspis.cubeList.add(new ModelBox(Lanceaspis, 0, 6, -2.0F, -0.5F, -3.0F, 4, 1, 3, 0.02F, false));

        this.cube_r1 = new AdvancedModelRenderer(this);
        this.cube_r1.setRotationPoint(2.0F, 0.25F, -1.8F);
        this.Lanceaspis.addChild(cube_r1);
        this.setRotateAngle(cube_r1, 0.0F, 0.2182F, 0.0F);
        this.cube_r1.cubeList.add(new ModelBox(cube_r1, 0, 15, 0.0F, 0.0F, 0.0F, 1, 0, 4, 0.0F, false));

        this.cube_r2 = new AdvancedModelRenderer(this);
        this.cube_r2.setRotationPoint(-2.0F, 0.25F, -1.8F);
        this.Lanceaspis.addChild(cube_r2);
        this.setRotateAngle(cube_r2, 0.0F, -0.2182F, 0.0F);
        this.cube_r2.cubeList.add(new ModelBox(cube_r2, 0, 15, -1.0F, 0.0F, 0.0F, 1, 0, 4, 0.0F, true));

        this.cube_r3 = new AdvancedModelRenderer(this);
        this.cube_r3.setRotationPoint(-3.0F, 0.5F, -2.0F);
        this.Lanceaspis.addChild(cube_r3);
        this.setRotateAngle(cube_r3, 0.0F, -0.6109F, 0.0F);
        this.cube_r3.cubeList.add(new ModelBox(cube_r3, 15, 16, 0.0F, -1.0F, -3.0F, 1, 1, 3, -0.01F, true));
        this.cube_r3.cubeList.add(new ModelBox(cube_r3, 6, 20, 0.0F, -1.0F, -4.5F, 1, 1, 2, -0.02F, true));

        this.cube_r4 = new AdvancedModelRenderer(this);
        this.cube_r4.setRotationPoint(-1.45F, 0.1F, -2.95F);
        this.Lanceaspis.addChild(cube_r4);
        this.setRotateAngle(cube_r4, 0.0F, -0.4363F, 0.0F);
        this.cube_r4.cubeList.add(new ModelBox(cube_r4, 3, 16, 0.0F, -1.0F, -1.0F, 2, 1, 3, 0.0F, true));

        this.cube_r5 = new AdvancedModelRenderer(this);
        this.cube_r5.setRotationPoint(1.45F, 0.1F, -2.95F);
        this.Lanceaspis.addChild(cube_r5);
        this.setRotateAngle(cube_r5, 0.0F, 0.4363F, 0.0F);
        this.cube_r5.cubeList.add(new ModelBox(cube_r5, 3, 16, -2.0F, -1.0F, -1.0F, 2, 1, 3, 0.0F, false));

        this.cube_r6 = new AdvancedModelRenderer(this);
        this.cube_r6.setRotationPoint(0.5F, 0.25F, -4.75F);
        this.Lanceaspis.addChild(cube_r6);
        this.setRotateAngle(cube_r6, -0.0873F, 0.0F, 0.0F);
        this.cube_r6.cubeList.add(new ModelBox(cube_r6, 9, 16, -1.0F, 0.0F, -6.0F, 1, 0, 4, 0.0F, false));
        this.cube_r6.cubeList.add(new ModelBox(cube_r6, 16, 9, -1.5F, 0.0F, -2.0F, 2, 0, 2, 0.0F, false));

        this.cube_r7 = new AdvancedModelRenderer(this);
        this.cube_r7.setRotationPoint(3.0F, 0.5F, -2.0F);
        this.Lanceaspis.addChild(cube_r7);
        this.setRotateAngle(cube_r7, 0.0F, 0.6109F, 0.0F);
        this.cube_r7.cubeList.add(new ModelBox(cube_r7, 15, 16, -1.0F, -1.0F, -3.0F, 1, 1, 3, -0.01F, false));
        this.cube_r7.cubeList.add(new ModelBox(cube_r7, 6, 20, -1.0F, -1.0F, -4.5F, 1, 1, 2, -0.02F, false));

        this.AntennaeLeft = new AdvancedModelRenderer(this);
        this.AntennaeLeft.setRotationPoint(1.0F, 0.35F, -4.5F);
        this.Lanceaspis.addChild(AntennaeLeft);
        this.AntennaeLeft.cubeList.add(new ModelBox(AntennaeLeft, 0, 0, -0.25F, 0.0F, -1.5F, 6, 0, 3, 0.0F, false));

        this.AntennaeRight = new AdvancedModelRenderer(this);
        this.AntennaeRight.setRotationPoint(-1.0F, 0.35F, -4.5F);
        this.Lanceaspis.addChild(AntennaeRight);
        this.AntennaeRight.cubeList.add(new ModelBox(AntennaeRight, 0, 0, -5.75F, 0.0F, -1.5F, 6, 0, 3, 0.0F, true));

        this.LLeg1 = new AdvancedModelRenderer(this);
        this.LLeg1.setRotationPoint(0.4F, 0.5F, -3.5F);
        this.Lanceaspis.addChild(LLeg1);


        this.cube_r8 = new AdvancedModelRenderer(this);
        this.cube_r8.setRotationPoint(-0.15F, 0.0F, -0.5F);
        this.LLeg1.addChild(cube_r8);
        this.setRotateAngle(cube_r8, 0.0F, 0.0F, 0.0873F);
        this.cube_r8.cubeList.add(new ModelBox(cube_r8, 7, 13, 0.0F, 0.0F, 0.0F, 2, 0, 1, 0.0F, false));

        this.LLeg2 = new AdvancedModelRenderer(this);
        this.LLeg2.setRotationPoint(0.75F, 0.5F, -1.5F);
        this.Lanceaspis.addChild(LLeg2);


        this.cube_r9 = new AdvancedModelRenderer(this);
        this.cube_r9.setRotationPoint(-0.25F, 0.0F, -0.5F);
        this.LLeg2.addChild(cube_r9);
        this.setRotateAngle(cube_r9, 0.0F, 0.0F, 0.0873F);
        this.cube_r9.cubeList.add(new ModelBox(cube_r9, 7, 13, 0.0F, 0.0F, 0.0F, 2, 0, 1, 0.0F, false));

        this.RLeg1 = new AdvancedModelRenderer(this);
        this.RLeg1.setRotationPoint(-0.35F, 0.5F, -3.5F);
        this.Lanceaspis.addChild(RLeg1);


        this.cube_r10 = new AdvancedModelRenderer(this);
        this.cube_r10.setRotationPoint(0.1F, 0.0F, -0.5F);
        this.RLeg1.addChild(cube_r10);
        this.setRotateAngle(cube_r10, 0.0F, 0.0F, -0.0873F);
        this.cube_r10.cubeList.add(new ModelBox(cube_r10, 7, 13, -2.0F, 0.0F, 0.0F, 2, 0, 1, 0.0F, true));

        this.RLeg2 = new AdvancedModelRenderer(this);
        this.RLeg2.setRotationPoint(-0.75F, 0.5F, -1.5F);
        this.Lanceaspis.addChild(RLeg2);


        this.cube_r11 = new AdvancedModelRenderer(this);
        this.cube_r11.setRotationPoint(0.25F, 0.0F, -0.5F);
        this.RLeg2.addChild(cube_r11);
        this.setRotateAngle(cube_r11, 0.0F, 0.0F, -0.0873F);
        this.cube_r11.cubeList.add(new ModelBox(cube_r11, 7, 13, -2.0F, 0.0F, 0.0F, 2, 0, 1, 0.0F, true));

        this.Thorax1 = new AdvancedModelRenderer(this);
        this.Thorax1.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.Lanceaspis.addChild(Thorax1);
        this.Thorax1.cubeList.add(new ModelBox(Thorax1, 14, 1, -2.0F, -0.5F, -0.5F, 4, 1, 2, -0.01F, false));
        this.Thorax1.cubeList.add(new ModelBox(Thorax1, 20, 15, -0.5F, -0.75F, -0.5F, 1, 1, 2, 0.0F, false));

        this.LLeg3 = new AdvancedModelRenderer(this);
        this.LLeg3.setRotationPoint(0.5F, 0.5F, 0.5F);
        this.Thorax1.addChild(LLeg3);


        this.cube_r12 = new AdvancedModelRenderer(this);
        this.cube_r12.setRotationPoint(0.0F, 0.0F, -0.5F);
        this.LLeg3.addChild(cube_r12);
        this.setRotateAngle(cube_r12, 0.0F, 0.0F, 0.0873F);
        this.cube_r12.cubeList.add(new ModelBox(cube_r12, 7, 13, 0.0F, 0.0F, 0.0F, 2, 0, 1, 0.0F, false));

        this.RLeg3 = new AdvancedModelRenderer(this);
        this.RLeg3.setRotationPoint(-0.5F, 0.5F, 0.5F);
        this.Thorax1.addChild(RLeg3);


        this.cube_r13 = new AdvancedModelRenderer(this);
        this.cube_r13.setRotationPoint(0.0F, 0.0F, -0.5F);
        this.RLeg3.addChild(cube_r13);
        this.setRotateAngle(cube_r13, 0.0F, 0.0F, -0.0873F);
        this.cube_r13.cubeList.add(new ModelBox(cube_r13, 7, 13, -2.0F, 0.0F, 0.0F, 2, 0, 1, 0.0F, true));

        this.Thorax2 = new AdvancedModelRenderer(this);
        this.Thorax2.setRotationPoint(0.0F, 0.0F, 1.5F);
        this.Thorax1.addChild(Thorax2);
        this.Thorax2.cubeList.add(new ModelBox(Thorax2, 10, 13, -2.0F, -0.5F, -0.05F, 4, 1, 2, -0.02F, false));
        this.Thorax2.cubeList.add(new ModelBox(Thorax2, 20, 12, -0.5F, -0.75F, -0.05F, 1, 1, 2, -0.01F, false));

        this.LLeg4 = new AdvancedModelRenderer(this);
        this.LLeg4.setRotationPoint(0.5F, 0.5F, 1.0F);
        this.Thorax2.addChild(LLeg4);


        this.cube_r14 = new AdvancedModelRenderer(this);
        this.cube_r14.setRotationPoint(0.0F, 0.0F, -0.5F);
        this.LLeg4.addChild(cube_r14);
        this.setRotateAngle(cube_r14, 0.0F, 0.0F, 0.0873F);
        this.cube_r14.cubeList.add(new ModelBox(cube_r14, 7, 13, 0.0F, 0.0F, 0.0F, 2, 0, 1, 0.0F, false));

        this.RLeg4 = new AdvancedModelRenderer(this);
        this.RLeg4.setRotationPoint(-0.5F, 0.5F, 1.0F);
        this.Thorax2.addChild(RLeg4);


        this.cube_r15 = new AdvancedModelRenderer(this);
        this.cube_r15.setRotationPoint(0.0F, 0.0F, -0.5F);
        this.RLeg4.addChild(cube_r15);
        this.setRotateAngle(cube_r15, 0.0F, 0.0F, -0.0873F);
        this.cube_r15.cubeList.add(new ModelBox(cube_r15, 7, 13, -2.0F, 0.0F, 0.0F, 2, 0, 1, 0.0F, true));

        this.Thorax3 = new AdvancedModelRenderer(this);
        this.Thorax3.setRotationPoint(0.0F, 0.0F, 1.95F);
        this.Thorax2.addChild(Thorax3);
        this.Thorax3.cubeList.add(new ModelBox(Thorax3, 11, 6, -2.0F, -0.5F, -0.05F, 4, 1, 2, -0.03F, false));
        this.Thorax3.cubeList.add(new ModelBox(Thorax3, 12, 20, -0.5F, -0.75F, -0.05F, 1, 1, 2, -0.02F, false));

        this.LLeg5 = new AdvancedModelRenderer(this);
        this.LLeg5.setRotationPoint(0.5F, 0.5F, 1.05F);
        this.Thorax3.addChild(LLeg5);


        this.cube_r16 = new AdvancedModelRenderer(this);
        this.cube_r16.setRotationPoint(0.0F, 0.0F, -0.5F);
        this.LLeg5.addChild(cube_r16);
        this.setRotateAngle(cube_r16, 0.0F, 0.0F, 0.0873F);
        this.cube_r16.cubeList.add(new ModelBox(cube_r16, 7, 13, 0.0F, 0.0F, 0.0F, 2, 0, 1, 0.0F, false));

        this.RLeg5 = new AdvancedModelRenderer(this);
        this.RLeg5.setRotationPoint(-0.5F, 0.5F, 1.05F);
        this.Thorax3.addChild(RLeg5);


        this.cube_r17 = new AdvancedModelRenderer(this);
        this.cube_r17.setRotationPoint(0.0F, 0.0F, -0.5F);
        this.RLeg5.addChild(cube_r17);
        this.setRotateAngle(cube_r17, 0.0F, 0.0F, -0.0873F);
        this.cube_r17.cubeList.add(new ModelBox(cube_r17, 7, 13, -2.0F, 0.0F, 0.0F, 2, 0, 1, 0.0F, true));

        this.Pygidium = new AdvancedModelRenderer(this);
        this.Pygidium.setRotationPoint(0.0F, 0.0F, 1.9F);
        this.Thorax3.addChild(Pygidium);
        this.Pygidium.cubeList.add(new ModelBox(Pygidium, 0, 20, -1.5F, -0.5F, 1.5F, 3, 1, 1, -0.05F, false));
        this.Pygidium.cubeList.add(new ModelBox(Pygidium, 8, 10, -2.0F, -0.5F, -0.05F, 4, 1, 2, -0.04F, false));
        this.Pygidium.cubeList.add(new ModelBox(Pygidium, 20, 9, -0.5F, -0.75F, -0.05F, 1, 1, 2, -0.03F, false));

        this.LLeg6 = new AdvancedModelRenderer(this);
        this.LLeg6.setRotationPoint(0.25F, 0.5F, 1.15F);
        this.Pygidium.addChild(LLeg6);


        this.cube_r18 = new AdvancedModelRenderer(this);
        this.cube_r18.setRotationPoint(0.0F, 0.0F, -0.5F);
        this.LLeg6.addChild(cube_r18);
        this.setRotateAngle(cube_r18, 0.0F, 0.0F, 0.0873F);
        this.cube_r18.cubeList.add(new ModelBox(cube_r18, 7, 13, 0.0F, 0.0F, 0.0F, 2, 0, 1, 0.0F, false));

        this.RLeg6 = new AdvancedModelRenderer(this);
        this.RLeg6.setRotationPoint(-0.25F, 0.5F, 1.15F);
        this.Pygidium.addChild(RLeg6);


        this.cube_r19 = new AdvancedModelRenderer(this);
        this.cube_r19.setRotationPoint(0.0F, 0.0F, -0.5F);
        this.RLeg6.addChild(cube_r19);
        this.setRotateAngle(cube_r19, 0.0F, 0.0F, -0.0873F);
        this.cube_r19.cubeList.add(new ModelBox(cube_r19, 7, 13, -2.0F, 0.0F, 0.0F, 2, 0, 1, 0.0F, true));

        updateDefaultPose();
    }

    @Override
    public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        this.Lanceaspis.render(f5 * 0.2F);
    }

    public void renderStatic(float f) {
        //GlStateManager.pushMatrix();
        //GlStateManager.enableBlend();
        //GlStateManager.disableCull();
        //GlStateManager.blendFunc(GlStateManager.SourceFactor.SRC_ALPHA, GlStateManager.DestFactor.ONE_MINUS_SRC_ALPHA);
        //this.Lanceaspis.offsetZ = 0.1F;
        this.Lanceaspis.render(0.022f);
        //GlStateManager.enableCull();
        //GlStateManager.disableBlend();
        //GlStateManager.popMatrix();
    }

    @Override
    public void renderStaticBook(float f) {
        //Rotations, positions and sizing:
        this.Lanceaspis.offsetY = -0.4F;
        this.Lanceaspis.offsetX = 0.0F;
        this.Lanceaspis.offsetZ = 2.0F;
        this.Lanceaspis.rotateAngleY = (float)Math.toRadians(120);
        this.Lanceaspis.rotateAngleX = (float)Math.toRadians(1);
        this.Lanceaspis.rotateAngleZ = (float)Math.toRadians(0);
        this.Lanceaspis.scaleChildren = true;
        float scaler = 1.2F;
        this.Lanceaspis.setScale(scaler, scaler, scaler);
        //Start of pose:
        this.setRotateAngle(Lanceaspis, 0.6F, 3.8F, -0.2F);
        //End of pose, now render the model:
        this.Lanceaspis.render(f);
        //Reset rotations, positions and sizing:
        this.Lanceaspis.setScale(1.0F, 1.0F, 1.0F);
        this.Lanceaspis.scaleChildren = false;
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
        this.Lanceaspis.offsetY = 1.2F;

        AdvancedModelRenderer[] legsL = {this.LLeg1, this.LLeg2, this.LLeg3, this.LLeg4, this.LLeg5, this.LLeg6};
        AdvancedModelRenderer[] legsR = {this.RLeg1, this.RLeg2, this.RLeg3, this.RLeg4, this.RLeg5, this.RLeg6};

        this.chainWave(legsL, 0.2F, 0.2F, -3, f2, 1);
        this.chainWave(legsR, 0.6F, 0.2F, -3, f2, 1);

        this.swing(AntennaeLeft, 0.5F, -0.2F, false, 0, -0.1F, f2, 0.8F);
        this.swing(AntennaeRight, 0.5F, 0.2F, false, 0, 0.1F, f2, 0.8F);

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
        this.flap(LLeg6, 0.5F, -0.5F, false, 5.0F, -0.5F, f2, 0.3F);
        this.flap(RLeg6, 0.5F, 0.5F, false, 5.0F, 0.5F, f2, 0.3F);

    }
}
