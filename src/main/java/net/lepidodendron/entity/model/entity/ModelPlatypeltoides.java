package net.lepidodendron.entity.model.entity;

import net.ilexiconn.llibrary.client.model.tools.AdvancedModelBase;
import net.ilexiconn.llibrary.client.model.tools.AdvancedModelRenderer;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

public class ModelPlatypeltoides extends AdvancedModelBase {
    private final AdvancedModelRenderer Asaphellus;
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
    private final AdvancedModelRenderer LLeg3;
    private final AdvancedModelRenderer cube_r12;
    private final AdvancedModelRenderer RLeg3;
    private final AdvancedModelRenderer cube_r13;
    private final AdvancedModelRenderer Thorax1;
    private final AdvancedModelRenderer LLeg4;
    private final AdvancedModelRenderer cube_r14;
    private final AdvancedModelRenderer RLeg4;
    private final AdvancedModelRenderer cube_r15;
    private final AdvancedModelRenderer Thorax2;
    private final AdvancedModelRenderer LLeg5;
    private final AdvancedModelRenderer cube_r16;
    private final AdvancedModelRenderer RLeg5;
    private final AdvancedModelRenderer cube_r17;
    private final AdvancedModelRenderer Thorax3;
    private final AdvancedModelRenderer LLeg6;
    private final AdvancedModelRenderer cube_r18;
    private final AdvancedModelRenderer RLeg6;
    private final AdvancedModelRenderer cube_r19;
    private final AdvancedModelRenderer Pygidium;
    private final AdvancedModelRenderer LLeg8;
    private final AdvancedModelRenderer cube_r20;
    private final AdvancedModelRenderer RLeg8;
    private final AdvancedModelRenderer cube_r21;
    private final AdvancedModelRenderer LLeg7;
    private final AdvancedModelRenderer cube_r22;
    private final AdvancedModelRenderer RLeg7;
    private final AdvancedModelRenderer cube_r23;

    public ModelPlatypeltoides() {
        this.textureWidth = 64;
        this.textureHeight = 64;

        this.Asaphellus = new AdvancedModelRenderer(this);
        this.Asaphellus.setRotationPoint(0.0F, 22.9F, -2.0F);
        this.Asaphellus.cubeList.add(new ModelBox(Asaphellus, 40, 24, -1.0F, -0.4F, -4.0F, 2, 1, 3, 0.0F, false));
        this.Asaphellus.cubeList.add(new ModelBox(Asaphellus, 22, 24, -3.5F, -0.4F, -2.05F, 7, 1, 4, -0.02F, false));
        this.Asaphellus.cubeList.add(new ModelBox(Asaphellus, 0, 6, 5.974F, 0.15F, -0.2254F, 12, 0, 6, -0.01F, false));
        this.Asaphellus.cubeList.add(new ModelBox(Asaphellus, 3, 0, -17.974F, 0.15F, -0.2254F, 12, 0, 6, -0.01F, false));
        this.Asaphellus.cubeList.add(new ModelBox(Asaphellus, 34, 32, -2.0F, -1.15F, -2.0F, 4, 1, 4, 0.0F, false));
        this.Asaphellus.cubeList.add(new ModelBox(Asaphellus, 0, 26, -4.0F, -0.75F, -1.0F, 8, 1, 3, 0.0F, false));
        this.Asaphellus.cubeList.add(new ModelBox(Asaphellus, 36, 10, -2.5F, -0.4F, -2.8F, 5, 1, 1, -0.02F, false));

        this.cube_r1 = new AdvancedModelRenderer(this);
        this.cube_r1.setRotationPoint(-1.0F, 0.6F, -4.0F);
        this.Asaphellus.addChild(cube_r1);
        this.setRotateAngle(cube_r1, 0.0F, 0.6109F, 0.0F);
        this.cube_r1.cubeList.add(new ModelBox(cube_r1, 20, 29, -8.0F, -1.0F, 0.0F, 8, 1, 2, -0.01F, false));

        this.cube_r2 = new AdvancedModelRenderer(this);
        this.cube_r2.setRotationPoint(-0.5F, 0.35F, -3.75F);
        this.Asaphellus.addChild(cube_r2);
        this.setRotateAngle(cube_r2, 0.3927F, 0.0F, 0.0F);
        this.cube_r2.cubeList.add(new ModelBox(cube_r2, 36, 6, -1.0F, -0.85F, -0.425F, 3, 1, 3, -0.02F, false));

        this.cube_r3 = new AdvancedModelRenderer(this);
        this.cube_r3.setRotationPoint(2.5F, -0.35F, -1.3F);
        this.Asaphellus.addChild(cube_r3);
        this.setRotateAngle(cube_r3, 0.0F, 0.829F, 0.0F);
        this.cube_r3.cubeList.add(new ModelBox(cube_r3, 0, 2, -0.75F, -0.5F, -0.75F, 1, 1, 2, 0.0F, false));

        this.cube_r4 = new AdvancedModelRenderer(this);
        this.cube_r4.setRotationPoint(-2.5F, -0.35F, -1.3F);
        this.Asaphellus.addChild(cube_r4);
        this.setRotateAngle(cube_r4, 0.0F, -0.829F, 0.0F);
        this.cube_r4.cubeList.add(new ModelBox(cube_r4, 0, 4, -0.25F, -0.5F, -0.75F, 1, 1, 2, 0.0F, false));

        this.cube_r5 = new AdvancedModelRenderer(this);
        this.cube_r5.setRotationPoint(1.0F, 0.6F, -4.0F);
        this.Asaphellus.addChild(cube_r5);
        this.setRotateAngle(cube_r5, 0.0F, -0.6109F, 0.0F);
        this.cube_r5.cubeList.add(new ModelBox(cube_r5, 0, 33, 0.0F, -1.0F, 0.0F, 8, 1, 2, -0.01F, false));

        this.cube_r6 = new AdvancedModelRenderer(this);
        this.cube_r6.setRotationPoint(0.0F, 0.6F, 4.0F);
        this.Asaphellus.addChild(cube_r6);
        this.setRotateAngle(cube_r6, 0.0F, 0.3054F, 0.0F);
        this.cube_r6.cubeList.add(new ModelBox(cube_r6, 36, 0, -5.35F, -1.0F, -5.0F, 5, 1, 2, 0.0F, false));

        this.cube_r7 = new AdvancedModelRenderer(this);
        this.cube_r7.setRotationPoint(0.0F, 0.6F, 4.0F);
        this.Asaphellus.addChild(cube_r7);
        this.setRotateAngle(cube_r7, 0.0F, -0.3054F, 0.0F);
        this.cube_r7.cubeList.add(new ModelBox(cube_r7, 36, 3, 0.35F, -1.0F, -5.0F, 5, 1, 2, 0.0F, false));

        this.AntennaeLeft = new AdvancedModelRenderer(this);
        this.AntennaeLeft.setRotationPoint(1.5F, 0.35F, -3.5F);
        this.Asaphellus.addChild(AntennaeLeft);
        this.AntennaeLeft.cubeList.add(new ModelBox(AntennaeLeft, 14, 15, -0.5F, 0.0F, -4.5F, 7, 0, 5, 0.0F, false));

        this.AntennaeRight = new AdvancedModelRenderer(this);
        this.AntennaeRight.setRotationPoint(-1.5F, 0.35F, -3.5F);
        this.Asaphellus.addChild(AntennaeRight);
        this.AntennaeRight.cubeList.add(new ModelBox(AntennaeRight, 0, 15, -6.5F, 0.0F, -4.5F, 7, 0, 5, 0.0F, false));

        this.LLeg1 = new AdvancedModelRenderer(this);
        this.LLeg1.setRotationPoint(0.0F, 0.6F, -2.5F);
        this.Asaphellus.addChild(LLeg1);


        this.cube_r8 = new AdvancedModelRenderer(this);
        this.cube_r8.setRotationPoint(0.0F, 0.0F, -0.5F);
        this.LLeg1.addChild(cube_r8);
        this.setRotateAngle(cube_r8, 0.0F, 0.0F, 0.1309F);
        this.cube_r8.cubeList.add(new ModelBox(cube_r8, 31, 35, 0.0F, 0.0F, 0.0F, 3, 0, 1, 0.0F, false));

        this.LLeg2 = new AdvancedModelRenderer(this);
        this.LLeg2.setRotationPoint(0.5F, 0.6F, -0.75F);
        this.Asaphellus.addChild(LLeg2);


        this.cube_r9 = new AdvancedModelRenderer(this);
        this.cube_r9.setRotationPoint(0.0F, 0.0F, -0.5F);
        this.LLeg2.addChild(cube_r9);
        this.setRotateAngle(cube_r9, 0.0F, 0.0F, 0.1309F);
        this.cube_r9.cubeList.add(new ModelBox(cube_r9, 8, 42, 0.0F, 0.0F, 0.0F, 4, 0, 1, 0.0F, false));

        this.RLeg1 = new AdvancedModelRenderer(this);
        this.RLeg1.setRotationPoint(0.0F, 0.6F, -2.5F);
        this.Asaphellus.addChild(RLeg1);


        this.cube_r10 = new AdvancedModelRenderer(this);
        this.cube_r10.setRotationPoint(0.0F, 0.0F, -0.5F);
        this.RLeg1.addChild(cube_r10);
        this.setRotateAngle(cube_r10, 0.0F, 0.0F, -0.1309F);
        this.cube_r10.cubeList.add(new ModelBox(cube_r10, 23, 20, -3.0F, 0.0F, 0.0F, 3, 0, 1, 0.0F, false));

        this.RLeg2 = new AdvancedModelRenderer(this);
        this.RLeg2.setRotationPoint(-0.5F, 0.6F, -0.75F);
        this.Asaphellus.addChild(RLeg2);


        this.cube_r11 = new AdvancedModelRenderer(this);
        this.cube_r11.setRotationPoint(0.0F, 0.0F, -0.5F);
        this.RLeg2.addChild(cube_r11);
        this.setRotateAngle(cube_r11, 0.0F, 0.0F, -0.1309F);
        this.cube_r11.cubeList.add(new ModelBox(cube_r11, 32, 17, -4.0F, 0.0F, 0.0F, 4, 0, 1, 0.0F, false));

        this.LLeg3 = new AdvancedModelRenderer(this);
        this.LLeg3.setRotationPoint(1.0F, 0.6F, 0.95F);
        this.Asaphellus.addChild(LLeg3);


        this.cube_r12 = new AdvancedModelRenderer(this);
        this.cube_r12.setRotationPoint(0.0F, 0.0F, -0.5F);
        this.LLeg3.addChild(cube_r12);
        this.setRotateAngle(cube_r12, 0.0F, 0.0F, 0.1309F);
        this.cube_r12.cubeList.add(new ModelBox(cube_r12, 0, 42, 0.0F, 0.0F, 0.0F, 4, 0, 1, 0.0F, false));

        this.RLeg3 = new AdvancedModelRenderer(this);
        this.RLeg3.setRotationPoint(-1.0F, 0.6F, 0.95F);
        this.Asaphellus.addChild(RLeg3);


        this.cube_r13 = new AdvancedModelRenderer(this);
        this.cube_r13.setRotationPoint(0.0F, 0.0F, -0.5F);
        this.RLeg3.addChild(cube_r13);
        this.setRotateAngle(cube_r13, 0.0F, 0.0F, -0.1309F);
        this.cube_r13.cubeList.add(new ModelBox(cube_r13, 21, 38, -4.0F, 0.0F, 0.0F, 4, 0, 1, 0.0F, false));

        this.Thorax1 = new AdvancedModelRenderer(this);
        this.Thorax1.setRotationPoint(0.0F, 0.1F, 2.0F);
        this.Asaphellus.addChild(Thorax1);
        this.Thorax1.cubeList.add(new ModelBox(Thorax1, 24, 21, -5.5F, -0.5F, -0.05F, 11, 1, 2, -0.01F, false));
        this.Thorax1.cubeList.add(new ModelBox(Thorax1, 22, 39, -2.0F, -1.0F, -0.05F, 4, 1, 2, -0.01F, false));
        this.Thorax1.cubeList.add(new ModelBox(Thorax1, 18, 32, -4.0F, -0.75F, -0.05F, 8, 1, 2, -0.01F, false));

        this.LLeg4 = new AdvancedModelRenderer(this);
        this.LLeg4.setRotationPoint(1.0F, 0.5F, 0.95F);
        this.Thorax1.addChild(LLeg4);


        this.cube_r14 = new AdvancedModelRenderer(this);
        this.cube_r14.setRotationPoint(0.0F, 0.0F, -0.5F);
        this.LLeg4.addChild(cube_r14);
        this.setRotateAngle(cube_r14, 0.0F, 0.0F, 0.1309F);
        this.cube_r14.cubeList.add(new ModelBox(cube_r14, 39, 41, 0.0F, 0.0F, 0.0F, 4, 0, 1, 0.0F, false));

        this.RLeg4 = new AdvancedModelRenderer(this);
        this.RLeg4.setRotationPoint(-1.0F, 0.5F, 0.95F);
        this.Thorax1.addChild(RLeg4);


        this.cube_r15 = new AdvancedModelRenderer(this);
        this.cube_r15.setRotationPoint(0.0F, 0.0F, -0.5F);
        this.RLeg4.addChild(cube_r15);
        this.setRotateAngle(cube_r15, 0.0F, 0.0F, -0.1309F);
        this.cube_r15.cubeList.add(new ModelBox(cube_r15, 39, 31, -4.0F, 0.0F, 0.0F, 4, 0, 1, 0.0F, false));

        this.Thorax2 = new AdvancedModelRenderer(this);
        this.Thorax2.setRotationPoint(0.0F, 0.0F, 2.0F);
        this.Thorax1.addChild(Thorax2);
        this.Thorax2.cubeList.add(new ModelBox(Thorax2, 12, 38, -2.0F, -1.0F, -0.1F, 4, 1, 2, -0.02F, false));
        this.Thorax2.cubeList.add(new ModelBox(Thorax2, 31, 18, -4.0F, -0.75F, -0.1F, 8, 1, 2, -0.02F, false));
        this.Thorax2.cubeList.add(new ModelBox(Thorax2, 0, 20, -5.5F, -0.5F, -0.1F, 11, 1, 2, -0.02F, false));

        this.LLeg5 = new AdvancedModelRenderer(this);
        this.LLeg5.setRotationPoint(1.0F, 0.5F, 0.9F);
        this.Thorax2.addChild(LLeg5);


        this.cube_r16 = new AdvancedModelRenderer(this);
        this.cube_r16.setRotationPoint(0.0F, 0.0F, -0.5F);
        this.LLeg5.addChild(cube_r16);
        this.setRotateAngle(cube_r16, 0.0F, 0.0F, 0.1309F);
        this.cube_r16.cubeList.add(new ModelBox(cube_r16, 41, 38, 0.0F, 0.0F, 0.0F, 4, 0, 1, 0.0F, false));

        this.RLeg5 = new AdvancedModelRenderer(this);
        this.RLeg5.setRotationPoint(-1.0F, 0.5F, 0.9F);
        this.Thorax2.addChild(RLeg5);


        this.cube_r17 = new AdvancedModelRenderer(this);
        this.cube_r17.setRotationPoint(0.0F, 0.0F, -0.5F);
        this.RLeg5.addChild(cube_r17);
        this.setRotateAngle(cube_r17, 0.0F, 0.0F, -0.1309F);
        this.cube_r17.cubeList.add(new ModelBox(cube_r17, 40, 17, -4.0F, 0.0F, 0.0F, 4, 0, 1, 0.0F, false));

        this.Thorax3 = new AdvancedModelRenderer(this);
        this.Thorax3.setRotationPoint(0.0F, 0.0F, 1.85F);
        this.Thorax2.addChild(Thorax3);
        this.Thorax3.cubeList.add(new ModelBox(Thorax3, 0, 12, -5.5F, -0.5F, 0.0F, 11, 1, 2, -0.03F, false));
        this.Thorax3.cubeList.add(new ModelBox(Thorax3, 26, 12, -4.0F, -0.75F, 0.0F, 8, 1, 2, -0.03F, false));
        this.Thorax3.cubeList.add(new ModelBox(Thorax3, 32, 37, -2.0F, -1.0F, 0.0F, 4, 1, 2, -0.03F, false));

        this.LLeg6 = new AdvancedModelRenderer(this);
        this.LLeg6.setRotationPoint(1.0F, 0.5F, 1.0F);
        this.Thorax3.addChild(LLeg6);


        this.cube_r18 = new AdvancedModelRenderer(this);
        this.cube_r18.setRotationPoint(0.0F, 0.0F, -0.5F);
        this.LLeg6.addChild(cube_r18);
        this.setRotateAngle(cube_r18, 0.0F, 0.0F, 0.1309F);
        this.cube_r18.cubeList.add(new ModelBox(cube_r18, 41, 37, 0.0F, 0.0F, 0.0F, 4, 0, 1, 0.0F, false));

        this.RLeg6 = new AdvancedModelRenderer(this);
        this.RLeg6.setRotationPoint(-1.0F, 0.5F, 1.0F);
        this.Thorax3.addChild(RLeg6);


        this.cube_r19 = new AdvancedModelRenderer(this);
        this.cube_r19.setRotationPoint(0.0F, 0.0F, -0.5F);
        this.RLeg6.addChild(cube_r19);
        this.setRotateAngle(cube_r19, 0.0F, 0.0F, -0.1309F);
        this.cube_r19.cubeList.add(new ModelBox(cube_r19, 39, 40, -4.0F, 0.0F, 0.0F, 4, 0, 1, 0.0F, false));

        this.Pygidium = new AdvancedModelRenderer(this);
        this.Pygidium.setRotationPoint(0.0F, 0.0F, 2.0F);
        this.Thorax3.addChild(Pygidium);
        this.Pygidium.cubeList.add(new ModelBox(Pygidium, 32, 40, -1.5F, -1.0F, 0.9F, 3, 1, 2, -0.05F, false));
        this.Pygidium.cubeList.add(new ModelBox(Pygidium, 0, 23, -5.5F, -0.5F, -0.1F, 11, 1, 2, -0.04F, false));
        this.Pygidium.cubeList.add(new ModelBox(Pygidium, 33, 15, -4.5F, -0.5F, 1.825F, 9, 1, 1, -0.04F, false));
        this.Pygidium.cubeList.add(new ModelBox(Pygidium, 0, 36, -3.5F, -0.75F, 1.65F, 7, 1, 1, -0.05F, false));
        this.Pygidium.cubeList.add(new ModelBox(Pygidium, 0, 30, -4.0F, -0.75F, -0.1F, 8, 1, 2, -0.04F, false));
        this.Pygidium.cubeList.add(new ModelBox(Pygidium, 0, 38, -2.0F, -1.0F, -0.1F, 4, 1, 2, -0.04F, false));
        this.Pygidium.cubeList.add(new ModelBox(Pygidium, 18, 35, -3.0F, -0.5F, 1.65F, 6, 1, 2, -0.05F, false));
        this.Pygidium.cubeList.add(new ModelBox(Pygidium, 0, 0, -1.0F, -0.5F, 3.15F, 2, 1, 1, -0.06F, false));
        this.Pygidium.cubeList.add(new ModelBox(Pygidium, 38, 29, -2.5F, -0.75F, 2.4F, 5, 1, 1, -0.06F, false));

        this.LLeg8 = new AdvancedModelRenderer(this);
        this.LLeg8.setRotationPoint(0.0F, 0.6958F, 2.4F);
        this.Pygidium.addChild(LLeg8);


        this.cube_r20 = new AdvancedModelRenderer(this);
        this.cube_r20.setRotationPoint(0.0F, -0.1958F, -0.5F);
        this.LLeg8.addChild(cube_r20);
        this.setRotateAngle(cube_r20, 0.0F, 0.0F, 0.1309F);
        this.cube_r20.cubeList.add(new ModelBox(cube_r20, 18, 27, 0.0F, 0.0F, 0.0F, 3, 0, 1, 0.0F, false));

        this.RLeg8 = new AdvancedModelRenderer(this);
        this.RLeg8.setRotationPoint(0.0F, 0.6958F, 2.4F);
        this.Pygidium.addChild(RLeg8);


        this.cube_r21 = new AdvancedModelRenderer(this);
        this.cube_r21.setRotationPoint(0.0F, -0.1958F, -0.5F);
        this.RLeg8.addChild(cube_r21);
        this.setRotateAngle(cube_r21, 0.0F, 0.0F, -0.1309F);
        this.cube_r21.cubeList.add(new ModelBox(cube_r21, 18, 26, -3.0F, 0.0F, 0.0F, 3, 0, 1, 0.0F, false));

        this.LLeg7 = new AdvancedModelRenderer(this);
        this.LLeg7.setRotationPoint(0.5F, 0.5F, 0.75F);
        this.Pygidium.addChild(LLeg7);


        this.cube_r22 = new AdvancedModelRenderer(this);
        this.cube_r22.setRotationPoint(0.0F, 0.0F, -0.5F);
        this.LLeg7.addChild(cube_r22);
        this.setRotateAngle(cube_r22, 0.0F, 0.0F, 0.1309F);
        this.cube_r22.cubeList.add(new ModelBox(cube_r22, 8, 41, 0.0F, 0.0F, 0.0F, 4, 0, 1, 0.0F, false));

        this.RLeg7 = new AdvancedModelRenderer(this);
        this.RLeg7.setRotationPoint(-0.5F, 0.5F, 0.75F);
        this.Pygidium.addChild(RLeg7);


        this.cube_r23 = new AdvancedModelRenderer(this);
        this.cube_r23.setRotationPoint(0.0F, 0.0F, -0.5F);
        this.RLeg7.addChild(cube_r23);
        this.setRotateAngle(cube_r23, 0.0F, 0.0F, -0.1309F);
        this.cube_r23.cubeList.add(new ModelBox(cube_r23, 0, 41, -4.0F, 0.0F, 0.0F, 4, 0, 1, 0.0F, false));

        updateDefaultPose();
    }

    @Override
    public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        this.Asaphellus.render(f5);
    }
    public void renderStaticFloor(float f) {
        this.setRotateAngle(Asaphellus, 0.0F, 0.0F, 0.0F);
        this.setRotateAngle(Thorax1, 0.0F, 0.1F, 0.0F);
        this.setRotateAngle(Thorax2, 0.0F, 0.1F, 0.0F);
        this.setRotateAngle(Thorax3, 0.0F, 0.1F, 0.0F);
        this.setRotateAngle(Pygidium, 0.0F, 0.0F, 0.0F);
        this.Asaphellus.offsetY = 0.055F;
        this.Asaphellus.render(0.01F);
        resetToDefaultPose();
    }
    public void renderStaticDisplayCase(float f) {
        this.Asaphellus.offsetY = -0.05F;
        this.Asaphellus.render(0.01F);
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

        AdvancedModelRenderer[] legsL = {this.LLeg1, this.LLeg2, this.LLeg3, this.LLeg4, this.LLeg5, this.LLeg6, this.LLeg7, this.LLeg8};
        AdvancedModelRenderer[] legsR = {this.RLeg1, this.RLeg2, this.RLeg3, this.RLeg4, this.RLeg5, this.RLeg6, this.RLeg7, this.RLeg8};

        this.chainWave(legsL, 0.2F, 0.2F, -3, f2, 1);
        this.chainWave(legsR, 0.6F, 0.2F, -3, f2, 1);

        this.swing(AntennaeLeft, 0.5F, -0.2F, false, 0, -0.1F, f2, 0.8F);
        this.swing(AntennaeRight, 0.5F, 0.2F, false, 0, 0.1F, f2, 0.8F);

        this.flap(LLeg1, 0.5F, -0.3F, true, 0, -0.5F, f2, 0.3F);
        this.flap(RLeg1, 0.5F, 0.3F, true, 0, 0.5F, f2, 0.3F);
        this.flap(LLeg2, 0.5F, -0.3F, true, 1.0F, -0.5F, f2, 0.3F);
        this.flap(RLeg2, 0.5F, 0.3F, true, 1.0F, 0.5F, f2, 0.3F);
        this.flap(LLeg3, 0.5F, -0.3F, true, 2.0F, -0.5F, f2, 0.3F);
        this.flap(RLeg3, 0.5F, 0.3F, true, 2.0F, 0.5F, f2, 0.3F);
        this.flap(LLeg4, 0.5F, -0.3F, true, 3.0F, -0.5F, f2, 0.3F);
        this.flap(RLeg4, 0.5F, 0.3F, true, 3.0F, 0.5F, f2, 0.3F);
        this.flap(LLeg5, 0.5F, -0.3F, true, 4.0F, -0.5F, f2, 0.3F);
        this.flap(RLeg5, 0.5F, 0.3F, true, 4.0F, 0.5F, f2, 0.3F);
        this.flap(LLeg6, 0.5F, -0.3F, true, 5.0F, -0.5F, f2, 0.3F);
        this.flap(RLeg6, 0.5F, 0.3F, true, 5.0F, 0.5F, f2, 0.3F);
        this.flap(LLeg7, 0.5F, -0.3F, true, 6.0F, -0.5F, f2, 0.3F);
        this.flap(RLeg7, 0.5F, 0.3F, true, 6.0F, 0.5F, f2, 0.3F);
        this.flap(LLeg8, 0.5F, -0.3F, true, 7.0F, -0.5F, f2, 0.3F);
        this.flap(RLeg8, 0.5F, 0.3F, true, 7.0F, 0.5F, f2, 0.3F);

    }
}
