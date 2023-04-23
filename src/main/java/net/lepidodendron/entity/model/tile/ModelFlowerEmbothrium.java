package net.lepidodendron.entity.model.tile;

import net.ilexiconn.llibrary.client.model.tools.AdvancedModelBase;
import net.ilexiconn.llibrary.client.model.tools.AdvancedModelRenderer;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;

public class ModelFlowerEmbothrium extends AdvancedModelBase {
    private final AdvancedModelRenderer bone;
    private final AdvancedModelRenderer flowerbonef;
    private final AdvancedModelRenderer flowerf;
    private final AdvancedModelRenderer flowerbonef4;
    private final AdvancedModelRenderer flowerf4;
    private final AdvancedModelRenderer flowerbonef5;
    private final AdvancedModelRenderer flowerf5;
    private final AdvancedModelRenderer flowerbonef2;
    private final AdvancedModelRenderer flowerf2;
    private final AdvancedModelRenderer flowerbonef3;
    private final AdvancedModelRenderer flowerf3;
    private final AdvancedModelRenderer flowerbonem;
    private final AdvancedModelRenderer flowerm;
    private final AdvancedModelRenderer cube_r1;
    private final AdvancedModelRenderer cube_r2;
    private final AdvancedModelRenderer cube_r3;
    private final AdvancedModelRenderer cube_r4;
    private final AdvancedModelRenderer flowerbonem7;
    private final AdvancedModelRenderer flowerm7;
    private final AdvancedModelRenderer cube_r5;
    private final AdvancedModelRenderer cube_r6;
    private final AdvancedModelRenderer cube_r7;
    private final AdvancedModelRenderer cube_r8;
    private final AdvancedModelRenderer flowerbonem4;
    private final AdvancedModelRenderer flowerm4;
    private final AdvancedModelRenderer cube_r9;
    private final AdvancedModelRenderer cube_r10;
    private final AdvancedModelRenderer cube_r11;
    private final AdvancedModelRenderer cube_r12;
    private final AdvancedModelRenderer flowerbonem5;
    private final AdvancedModelRenderer flowerm5;
    private final AdvancedModelRenderer cube_r13;
    private final AdvancedModelRenderer cube_r14;
    private final AdvancedModelRenderer cube_r15;
    private final AdvancedModelRenderer cube_r16;
    private final AdvancedModelRenderer flowerbonem8;
    private final AdvancedModelRenderer flowerm8;
    private final AdvancedModelRenderer cube_r17;
    private final AdvancedModelRenderer cube_r18;
    private final AdvancedModelRenderer cube_r19;
    private final AdvancedModelRenderer cube_r20;
    private final AdvancedModelRenderer flowerbonem2;
    private final AdvancedModelRenderer flowerm2;
    private final AdvancedModelRenderer cube_r21;
    private final AdvancedModelRenderer cube_r22;
    private final AdvancedModelRenderer cube_r23;
    private final AdvancedModelRenderer cube_r24;
    private final AdvancedModelRenderer flowerbonem3;
    private final AdvancedModelRenderer flowerm3;
    private final AdvancedModelRenderer cube_r25;
    private final AdvancedModelRenderer cube_r26;
    private final AdvancedModelRenderer cube_r27;
    private final AdvancedModelRenderer cube_r28;
    private final AdvancedModelRenderer flowerbonem6;
    private final AdvancedModelRenderer flowerm6;
    private final AdvancedModelRenderer cube_r29;
    private final AdvancedModelRenderer cube_r30;
    private final AdvancedModelRenderer cube_r31;
    private final AdvancedModelRenderer cube_r32;
    private final AdvancedModelRenderer flowerbonem9;
    private final AdvancedModelRenderer flowerm9;
    private final AdvancedModelRenderer cube_r33;
    private final AdvancedModelRenderer cube_r34;
    private final AdvancedModelRenderer cube_r35;
    private final AdvancedModelRenderer cube_r36;

    public ModelFlowerEmbothrium() {
        this.textureWidth = 16;
        this.textureHeight = 16;

        this.bone = new AdvancedModelRenderer(this);
        this.bone.setRotationPoint(0.0F, 24.0F, 0.0F);
        this.bone.cubeList.add(new ModelBox(bone, 11, 0, -0.5F, -6.0F, -0.5F, 1, 6, 1, 0.0F, false));

        this.flowerbonef = new AdvancedModelRenderer(this);
        this.flowerbonef.setRotationPoint(0.0F, 3.0F, 0.0F);
        this.bone.addChild(flowerbonef);


        this.flowerf = new AdvancedModelRenderer(this);
        this.flowerf.setRotationPoint(0.5F, -7.0F, 0.0F);
        this.flowerbonef.addChild(flowerf);
        this.setRotateAngle(flowerf, 0.0F, 0.0F, 0.6109F);
        this.flowerf.cubeList.add(new ModelBox(flowerf, 2, 9, 0.0F, -3.0F, -0.5F, 0, 3, 1, 0.0F, false));
        this.flowerf.cubeList.add(new ModelBox(flowerf, 0, 4, -0.5F, -7.0F, -0.5F, 1, 4, 1, 0.0F, false));
        this.flowerf.cubeList.add(new ModelBox(flowerf, 0, 0, -1.0F, -9.0F, -1.0F, 2, 2, 2, 0.0F, false));

        this.flowerbonef4 = new AdvancedModelRenderer(this);
        this.flowerbonef4.setRotationPoint(0.25F, 3.25F, 0.25F);
        this.bone.addChild(flowerbonef4);
        this.setRotateAngle(flowerbonef4, 0.0F, 2.4435F, 0.0F);


        this.flowerf4 = new AdvancedModelRenderer(this);
        this.flowerf4.setRotationPoint(0.5F, -7.0F, 0.0F);
        this.flowerbonef4.addChild(flowerf4);
        this.setRotateAngle(flowerf4, 0.0F, 0.0F, 0.6109F);
        this.flowerf4.cubeList.add(new ModelBox(flowerf4, 2, 9, 0.0F, -3.0F, -0.5F, 0, 3, 1, 0.0F, false));
        this.flowerf4.cubeList.add(new ModelBox(flowerf4, 0, 4, -0.5F, -7.0F, -0.5F, 1, 4, 1, 0.0F, false));
        this.flowerf4.cubeList.add(new ModelBox(flowerf4, 0, 0, -1.0F, -9.0F, -1.0F, 2, 2, 2, 0.0F, false));

        this.flowerbonef5 = new AdvancedModelRenderer(this);
        this.flowerbonef5.setRotationPoint(0.25F, 2.25F, 0.0F);
        this.bone.addChild(flowerbonef5);
        this.setRotateAngle(flowerbonef5, 0.0F, -2.7925F, 0.0F);


        this.flowerf5 = new AdvancedModelRenderer(this);
        this.flowerf5.setRotationPoint(0.5F, -7.0F, 0.0F);
        this.flowerbonef5.addChild(flowerf5);
        this.setRotateAngle(flowerf5, 0.0F, 0.0F, 0.3491F);
        this.flowerf5.cubeList.add(new ModelBox(flowerf5, 2, 9, 0.0F, -3.0F, -0.5F, 0, 3, 1, 0.0F, false));
        this.flowerf5.cubeList.add(new ModelBox(flowerf5, 0, 4, -0.5F, -7.0F, -0.5F, 1, 4, 1, 0.0F, false));
        this.flowerf5.cubeList.add(new ModelBox(flowerf5, 0, 0, -1.0F, -9.0F, -1.0F, 2, 2, 2, 0.0F, false));

        this.flowerbonef2 = new AdvancedModelRenderer(this);
        this.flowerbonef2.setRotationPoint(-0.25F, 2.0F, -0.25F);
        this.bone.addChild(flowerbonef2);
        this.setRotateAngle(flowerbonef2, 0.0F, -1.1345F, 0.0F);


        this.flowerf2 = new AdvancedModelRenderer(this);
        this.flowerf2.setRotationPoint(0.5F, -7.0F, 0.0F);
        this.flowerbonef2.addChild(flowerf2);
        this.setRotateAngle(flowerf2, 0.0F, 0.0F, 0.6109F);
        this.flowerf2.cubeList.add(new ModelBox(flowerf2, 2, 9, 0.0F, -3.0F, -0.5F, 0, 3, 1, 0.0F, false));
        this.flowerf2.cubeList.add(new ModelBox(flowerf2, 0, 4, -0.5F, -7.0F, -0.5F, 1, 4, 1, 0.0F, false));
        this.flowerf2.cubeList.add(new ModelBox(flowerf2, 0, 0, -1.0F, -9.0F, -1.0F, 2, 2, 2, 0.0F, false));

        this.flowerbonef3 = new AdvancedModelRenderer(this);
        this.flowerbonef3.setRotationPoint(-0.25F, 2.5F, 0.25F);
        this.bone.addChild(flowerbonef3);
        this.setRotateAngle(flowerbonef3, 0.0F, 0.829F, 0.0F);


        this.flowerf3 = new AdvancedModelRenderer(this);
        this.flowerf3.setRotationPoint(0.5F, -7.0F, 0.0F);
        this.flowerbonef3.addChild(flowerf3);
        this.setRotateAngle(flowerf3, 0.0F, 0.0F, 0.3491F);
        this.flowerf3.cubeList.add(new ModelBox(flowerf3, 2, 9, 0.0F, -3.0F, -0.5F, 0, 3, 1, 0.0F, false));
        this.flowerf3.cubeList.add(new ModelBox(flowerf3, 0, 4, -0.5F, -7.0F, -0.5F, 1, 4, 1, 0.0F, false));
        this.flowerf3.cubeList.add(new ModelBox(flowerf3, 0, 0, -1.0F, -9.0F, -1.0F, 2, 2, 2, 0.0F, false));

        this.flowerbonem = new AdvancedModelRenderer(this);
        this.flowerbonem.setRotationPoint(0.0F, 0.0F, -0.5F);
        this.bone.addChild(flowerbonem);
        this.setRotateAngle(flowerbonem, 0.0F, -0.2618F, 0.0F);


        this.flowerm = new AdvancedModelRenderer(this);
        this.flowerm.setRotationPoint(0.5F, -1.0F, 0.5F);
        this.flowerbonem.addChild(flowerm);
        this.setRotateAngle(flowerm, 0.0F, 0.0F, 1.0472F);
        this.flowerm.cubeList.add(new ModelBox(flowerm, 0, 8, 0.0F, -9.0F, -0.5F, 0, 3, 1, 0.0F, false));
        this.flowerm.cubeList.add(new ModelBox(flowerm, 7, 8, 0.0F, -3.0F, -0.5F, 0, 3, 1, 0.0F, false));
        this.flowerm.cubeList.add(new ModelBox(flowerm, 4, 4, -0.5F, -6.0F, -0.5F, 1, 3, 1, 0.0F, false));

        this.cube_r1 = new AdvancedModelRenderer(this);
        this.cube_r1.setRotationPoint(0.0F, -6.0F, 0.5F);
        this.flowerm.addChild(cube_r1);
        this.setRotateAngle(cube_r1, -0.7854F, 0.0F, 0.0F);
        this.cube_r1.cubeList.add(new ModelBox(cube_r1, 6, 0, -0.5F, 0.0F, 0.0F, 1, 1, 1, 0.0F, false));

        this.cube_r2 = new AdvancedModelRenderer(this);
        this.cube_r2.setRotationPoint(-0.5F, -6.0F, 0.0F);
        this.flowerm.addChild(cube_r2);
        this.setRotateAngle(cube_r2, 0.0F, 0.0F, -0.7854F);
        this.cube_r2.cubeList.add(new ModelBox(cube_r2, 7, 3, -1.0F, 0.0F, -0.5F, 1, 1, 1, 0.0F, false));

        this.cube_r3 = new AdvancedModelRenderer(this);
        this.cube_r3.setRotationPoint(0.5F, -6.0F, 0.0F);
        this.flowerm.addChild(cube_r3);
        this.setRotateAngle(cube_r3, 0.0F, 0.0F, 0.7854F);
        this.cube_r3.cubeList.add(new ModelBox(cube_r3, 7, 7, 0.0F, 0.0F, -0.5F, 1, 1, 1, 0.0F, false));

        this.cube_r4 = new AdvancedModelRenderer(this);
        this.cube_r4.setRotationPoint(0.0F, -6.0F, -0.5F);
        this.flowerm.addChild(cube_r4);
        this.setRotateAngle(cube_r4, 0.7854F, 0.0F, 0.0F);
        this.cube_r4.cubeList.add(new ModelBox(cube_r4, 3, 8, -0.5F, 0.0F, -1.0F, 1, 1, 1, 0.0F, false));

        this.flowerbonem7 = new AdvancedModelRenderer(this);
        this.flowerbonem7.setRotationPoint(0.0F, -1.5F, -0.75F);
        this.bone.addChild(flowerbonem7);
        this.setRotateAngle(flowerbonem7, 0.0F, -0.6981F, 0.0F);


        this.flowerm7 = new AdvancedModelRenderer(this);
        this.flowerm7.setRotationPoint(0.5F, -1.0F, 0.5F);
        this.flowerbonem7.addChild(flowerm7);
        this.setRotateAngle(flowerm7, 0.0F, 0.0F, 0.8727F);
        this.flowerm7.cubeList.add(new ModelBox(flowerm7, 0, 8, 0.0F, -9.0F, -0.5F, 0, 3, 1, 0.0F, false));
        this.flowerm7.cubeList.add(new ModelBox(flowerm7, 7, 8, 0.0F, -3.0F, -0.5F, 0, 3, 1, 0.0F, false));
        this.flowerm7.cubeList.add(new ModelBox(flowerm7, 4, 4, -0.5F, -6.0F, -0.5F, 1, 3, 1, 0.0F, false));

        this.cube_r5 = new AdvancedModelRenderer(this);
        this.cube_r5.setRotationPoint(0.0F, -6.0F, 0.5F);
        this.flowerm7.addChild(cube_r5);
        this.setRotateAngle(cube_r5, -0.7854F, 0.0F, 0.0F);
        this.cube_r5.cubeList.add(new ModelBox(cube_r5, 6, 0, -0.5F, 0.0F, 0.0F, 1, 1, 1, 0.0F, false));

        this.cube_r6 = new AdvancedModelRenderer(this);
        this.cube_r6.setRotationPoint(-0.5F, -6.0F, 0.0F);
        this.flowerm7.addChild(cube_r6);
        this.setRotateAngle(cube_r6, 0.0F, 0.0F, -0.7854F);
        this.cube_r6.cubeList.add(new ModelBox(cube_r6, 7, 3, -1.0F, 0.0F, -0.5F, 1, 1, 1, 0.0F, false));

        this.cube_r7 = new AdvancedModelRenderer(this);
        this.cube_r7.setRotationPoint(0.5F, -6.0F, 0.0F);
        this.flowerm7.addChild(cube_r7);
        this.setRotateAngle(cube_r7, 0.0F, 0.0F, 0.7854F);
        this.cube_r7.cubeList.add(new ModelBox(cube_r7, 7, 7, 0.0F, 0.0F, -0.5F, 1, 1, 1, 0.0F, false));

        this.cube_r8 = new AdvancedModelRenderer(this);
        this.cube_r8.setRotationPoint(0.0F, -6.0F, -0.5F);
        this.flowerm7.addChild(cube_r8);
        this.setRotateAngle(cube_r8, 0.7854F, 0.0F, 0.0F);
        this.cube_r8.cubeList.add(new ModelBox(cube_r8, 3, 8, -0.5F, 0.0F, -1.0F, 1, 1, 1, 0.0F, false));

        this.flowerbonem4 = new AdvancedModelRenderer(this);
        this.flowerbonem4.setRotationPoint(-0.75F, 0.25F, -0.25F);
        this.bone.addChild(flowerbonem4);
        this.setRotateAngle(flowerbonem4, 0.0F, 0.8727F, 0.0F);


        this.flowerm4 = new AdvancedModelRenderer(this);
        this.flowerm4.setRotationPoint(0.5F, -1.0F, 0.5F);
        this.flowerbonem4.addChild(flowerm4);
        this.setRotateAngle(flowerm4, 0.0F, 0.0F, 1.0472F);
        this.flowerm4.cubeList.add(new ModelBox(flowerm4, 0, 8, 0.0F, -9.0F, -0.5F, 0, 3, 1, 0.0F, false));
        this.flowerm4.cubeList.add(new ModelBox(flowerm4, 7, 8, 0.0F, -3.0F, -0.5F, 0, 3, 1, 0.0F, false));
        this.flowerm4.cubeList.add(new ModelBox(flowerm4, 4, 4, -0.5F, -6.0F, -0.5F, 1, 3, 1, 0.0F, false));

        this.cube_r9 = new AdvancedModelRenderer(this);
        this.cube_r9.setRotationPoint(0.0F, -6.0F, 0.5F);
        this.flowerm4.addChild(cube_r9);
        this.setRotateAngle(cube_r9, -0.7854F, 0.0F, 0.0F);
        this.cube_r9.cubeList.add(new ModelBox(cube_r9, 6, 0, -0.5F, 0.0F, 0.0F, 1, 1, 1, 0.0F, false));

        this.cube_r10 = new AdvancedModelRenderer(this);
        this.cube_r10.setRotationPoint(-0.5F, -6.0F, 0.0F);
        this.flowerm4.addChild(cube_r10);
        this.setRotateAngle(cube_r10, 0.0F, 0.0F, -0.7854F);
        this.cube_r10.cubeList.add(new ModelBox(cube_r10, 7, 3, -1.0F, 0.0F, -0.5F, 1, 1, 1, 0.0F, false));

        this.cube_r11 = new AdvancedModelRenderer(this);
        this.cube_r11.setRotationPoint(0.5F, -6.0F, 0.0F);
        this.flowerm4.addChild(cube_r11);
        this.setRotateAngle(cube_r11, 0.0F, 0.0F, 0.7854F);
        this.cube_r11.cubeList.add(new ModelBox(cube_r11, 7, 7, 0.0F, 0.0F, -0.5F, 1, 1, 1, 0.0F, false));

        this.cube_r12 = new AdvancedModelRenderer(this);
        this.cube_r12.setRotationPoint(0.0F, -6.0F, -0.5F);
        this.flowerm4.addChild(cube_r12);
        this.setRotateAngle(cube_r12, 0.7854F, 0.0F, 0.0F);
        this.cube_r12.cubeList.add(new ModelBox(cube_r12, 3, 8, -0.5F, 0.0F, -1.0F, 1, 1, 1, 0.0F, false));

        this.flowerbonem5 = new AdvancedModelRenderer(this);
        this.flowerbonem5.setRotationPoint(-0.25F, -0.25F, 0.5F);
        this.bone.addChild(flowerbonem5);
        this.setRotateAngle(flowerbonem5, 0.0F, 2.1817F, 0.0F);


        this.flowerm5 = new AdvancedModelRenderer(this);
        this.flowerm5.setRotationPoint(0.5F, -1.0F, 0.5F);
        this.flowerbonem5.addChild(flowerm5);
        this.setRotateAngle(flowerm5, 0.0F, 0.0F, 1.1781F);
        this.flowerm5.cubeList.add(new ModelBox(flowerm5, 0, 8, 0.0F, -9.0F, -0.5F, 0, 3, 1, 0.0F, false));
        this.flowerm5.cubeList.add(new ModelBox(flowerm5, 7, 8, 0.0F, -3.0F, -0.5F, 0, 3, 1, 0.0F, false));
        this.flowerm5.cubeList.add(new ModelBox(flowerm5, 4, 4, -0.5F, -6.0F, -0.5F, 1, 3, 1, 0.0F, false));

        this.cube_r13 = new AdvancedModelRenderer(this);
        this.cube_r13.setRotationPoint(0.0F, -6.0F, 0.5F);
        this.flowerm5.addChild(cube_r13);
        this.setRotateAngle(cube_r13, -0.7854F, 0.0F, 0.0F);
        this.cube_r13.cubeList.add(new ModelBox(cube_r13, 6, 0, -0.5F, 0.0F, 0.0F, 1, 1, 1, 0.0F, false));

        this.cube_r14 = new AdvancedModelRenderer(this);
        this.cube_r14.setRotationPoint(-0.5F, -6.0F, 0.0F);
        this.flowerm5.addChild(cube_r14);
        this.setRotateAngle(cube_r14, 0.0F, 0.0F, -0.7854F);
        this.cube_r14.cubeList.add(new ModelBox(cube_r14, 7, 3, -1.0F, 0.0F, -0.5F, 1, 1, 1, 0.0F, false));

        this.cube_r15 = new AdvancedModelRenderer(this);
        this.cube_r15.setRotationPoint(0.5F, -6.0F, 0.0F);
        this.flowerm5.addChild(cube_r15);
        this.setRotateAngle(cube_r15, 0.0F, 0.0F, 0.7854F);
        this.cube_r15.cubeList.add(new ModelBox(cube_r15, 7, 7, 0.0F, 0.0F, -0.5F, 1, 1, 1, 0.0F, false));

        this.cube_r16 = new AdvancedModelRenderer(this);
        this.cube_r16.setRotationPoint(0.0F, -6.0F, -0.5F);
        this.flowerm5.addChild(cube_r16);
        this.setRotateAngle(cube_r16, 0.7854F, 0.0F, 0.0F);
        this.cube_r16.cubeList.add(new ModelBox(cube_r16, 3, 8, -0.5F, 0.0F, -1.0F, 1, 1, 1, 0.0F, false));

        this.flowerbonem8 = new AdvancedModelRenderer(this);
        this.flowerbonem8.setRotationPoint(-0.5F, -1.75F, 0.5F);
        this.bone.addChild(flowerbonem8);
        this.setRotateAngle(flowerbonem8, 0.0F, 1.8326F, 0.0F);


        this.flowerm8 = new AdvancedModelRenderer(this);
        this.flowerm8.setRotationPoint(0.5F, -1.0F, 0.5F);
        this.flowerbonem8.addChild(flowerm8);
        this.setRotateAngle(flowerm8, 0.0F, 0.0F, 0.7854F);
        this.flowerm8.cubeList.add(new ModelBox(flowerm8, 0, 8, 0.0F, -9.0F, -0.5F, 0, 3, 1, 0.0F, false));
        this.flowerm8.cubeList.add(new ModelBox(flowerm8, 7, 8, 0.0F, -3.0F, -0.5F, 0, 3, 1, 0.0F, false));
        this.flowerm8.cubeList.add(new ModelBox(flowerm8, 4, 4, -0.5F, -6.0F, -0.5F, 1, 3, 1, 0.0F, false));

        this.cube_r17 = new AdvancedModelRenderer(this);
        this.cube_r17.setRotationPoint(0.0F, -6.0F, 0.5F);
        this.flowerm8.addChild(cube_r17);
        this.setRotateAngle(cube_r17, -0.7854F, 0.0F, 0.0F);
        this.cube_r17.cubeList.add(new ModelBox(cube_r17, 6, 0, -0.5F, 0.0F, 0.0F, 1, 1, 1, 0.0F, false));

        this.cube_r18 = new AdvancedModelRenderer(this);
        this.cube_r18.setRotationPoint(-0.5F, -6.0F, 0.0F);
        this.flowerm8.addChild(cube_r18);
        this.setRotateAngle(cube_r18, 0.0F, 0.0F, -0.7854F);
        this.cube_r18.cubeList.add(new ModelBox(cube_r18, 7, 3, -1.0F, 0.0F, -0.5F, 1, 1, 1, 0.0F, false));

        this.cube_r19 = new AdvancedModelRenderer(this);
        this.cube_r19.setRotationPoint(0.5F, -6.0F, 0.0F);
        this.flowerm8.addChild(cube_r19);
        this.setRotateAngle(cube_r19, 0.0F, 0.0F, 0.7854F);
        this.cube_r19.cubeList.add(new ModelBox(cube_r19, 7, 7, 0.0F, 0.0F, -0.5F, 1, 1, 1, 0.0F, false));

        this.cube_r20 = new AdvancedModelRenderer(this);
        this.cube_r20.setRotationPoint(0.0F, -6.0F, -0.5F);
        this.flowerm8.addChild(cube_r20);
        this.setRotateAngle(cube_r20, 0.7854F, 0.0F, 0.0F);
        this.cube_r20.cubeList.add(new ModelBox(cube_r20, 3, 8, -0.5F, 0.0F, -1.0F, 1, 1, 1, 0.0F, false));

        this.flowerbonem2 = new AdvancedModelRenderer(this);
        this.flowerbonem2.setRotationPoint(0.5F, -1.0F, 0.0F);
        this.bone.addChild(flowerbonem2);
        this.setRotateAngle(flowerbonem2, 0.0F, -1.5708F, 0.0F);


        this.flowerm2 = new AdvancedModelRenderer(this);
        this.flowerm2.setRotationPoint(0.5F, -1.0F, 0.5F);
        this.flowerbonem2.addChild(flowerm2);
        this.setRotateAngle(flowerm2, 0.0F, 0.0F, 0.7854F);
        this.flowerm2.cubeList.add(new ModelBox(flowerm2, 0, 8, 0.0F, -9.0F, -0.5F, 0, 3, 1, 0.0F, false));
        this.flowerm2.cubeList.add(new ModelBox(flowerm2, 7, 8, 0.0F, -3.0F, -0.5F, 0, 3, 1, 0.0F, false));
        this.flowerm2.cubeList.add(new ModelBox(flowerm2, 4, 4, -0.5F, -6.0F, -0.5F, 1, 3, 1, 0.0F, false));

        this.cube_r21 = new AdvancedModelRenderer(this);
        this.cube_r21.setRotationPoint(0.0F, -6.0F, 0.5F);
        this.flowerm2.addChild(cube_r21);
        this.setRotateAngle(cube_r21, -0.7854F, 0.0F, 0.0F);
        this.cube_r21.cubeList.add(new ModelBox(cube_r21, 6, 0, -0.5F, 0.0F, 0.0F, 1, 1, 1, 0.0F, false));

        this.cube_r22 = new AdvancedModelRenderer(this);
        this.cube_r22.setRotationPoint(-0.5F, -6.0F, 0.0F);
        this.flowerm2.addChild(cube_r22);
        this.setRotateAngle(cube_r22, 0.0F, 0.0F, -0.7854F);
        this.cube_r22.cubeList.add(new ModelBox(cube_r22, 7, 3, -1.0F, 0.0F, -0.5F, 1, 1, 1, 0.0F, false));

        this.cube_r23 = new AdvancedModelRenderer(this);
        this.cube_r23.setRotationPoint(0.5F, -6.0F, 0.0F);
        this.flowerm2.addChild(cube_r23);
        this.setRotateAngle(cube_r23, 0.0F, 0.0F, 0.7854F);
        this.cube_r23.cubeList.add(new ModelBox(cube_r23, 7, 7, 0.0F, 0.0F, -0.5F, 1, 1, 1, 0.0F, false));

        this.cube_r24 = new AdvancedModelRenderer(this);
        this.cube_r24.setRotationPoint(0.0F, -6.0F, -0.5F);
        this.flowerm2.addChild(cube_r24);
        this.setRotateAngle(cube_r24, 0.7854F, 0.0F, 0.0F);
        this.cube_r24.cubeList.add(new ModelBox(cube_r24, 3, 8, -0.5F, 0.0F, -1.0F, 1, 1, 1, 0.0F, false));

        this.flowerbonem3 = new AdvancedModelRenderer(this);
        this.flowerbonem3.setRotationPoint(0.5F, -1.0F, 0.25F);
        this.bone.addChild(flowerbonem3);
        this.setRotateAngle(flowerbonem3, 0.0F, -2.618F, 0.0F);


        this.flowerm3 = new AdvancedModelRenderer(this);
        this.flowerm3.setRotationPoint(0.5F, -1.0F, 0.5F);
        this.flowerbonem3.addChild(flowerm3);
        this.setRotateAngle(flowerm3, 0.0F, 0.0F, 0.7854F);
        this.flowerm3.cubeList.add(new ModelBox(flowerm3, 0, 8, 0.0F, -9.0F, -0.5F, 0, 3, 1, 0.0F, false));
        this.flowerm3.cubeList.add(new ModelBox(flowerm3, 7, 8, 0.0F, -3.0F, -0.5F, 0, 3, 1, 0.0F, false));
        this.flowerm3.cubeList.add(new ModelBox(flowerm3, 4, 4, -0.5F, -6.0F, -0.5F, 1, 3, 1, 0.0F, false));

        this.cube_r25 = new AdvancedModelRenderer(this);
        this.cube_r25.setRotationPoint(0.0F, -6.0F, 0.5F);
        this.flowerm3.addChild(cube_r25);
        this.setRotateAngle(cube_r25, -0.7854F, 0.0F, 0.0F);
        this.cube_r25.cubeList.add(new ModelBox(cube_r25, 6, 0, -0.5F, 0.0F, 0.0F, 1, 1, 1, 0.0F, false));

        this.cube_r26 = new AdvancedModelRenderer(this);
        this.cube_r26.setRotationPoint(-0.5F, -6.0F, 0.0F);
        this.flowerm3.addChild(cube_r26);
        this.setRotateAngle(cube_r26, 0.0F, 0.0F, -0.7854F);
        this.cube_r26.cubeList.add(new ModelBox(cube_r26, 7, 3, -1.0F, 0.0F, -0.5F, 1, 1, 1, 0.0F, false));

        this.cube_r27 = new AdvancedModelRenderer(this);
        this.cube_r27.setRotationPoint(0.5F, -6.0F, 0.0F);
        this.flowerm3.addChild(cube_r27);
        this.setRotateAngle(cube_r27, 0.0F, 0.0F, 0.7854F);
        this.cube_r27.cubeList.add(new ModelBox(cube_r27, 7, 7, 0.0F, 0.0F, -0.5F, 1, 1, 1, 0.0F, false));

        this.cube_r28 = new AdvancedModelRenderer(this);
        this.cube_r28.setRotationPoint(0.0F, -6.0F, -0.5F);
        this.flowerm3.addChild(cube_r28);
        this.setRotateAngle(cube_r28, 0.7854F, 0.0F, 0.0F);
        this.cube_r28.cubeList.add(new ModelBox(cube_r28, 3, 8, -0.5F, 0.0F, -1.0F, 1, 1, 1, 0.0F, false));

        this.flowerbonem6 = new AdvancedModelRenderer(this);
        this.flowerbonem6.setRotationPoint(0.5F, 0.75F, 0.5F);
        this.bone.addChild(flowerbonem6);
        this.setRotateAngle(flowerbonem6, 0.0F, 3.1416F, 0.0F);


        this.flowerm6 = new AdvancedModelRenderer(this);
        this.flowerm6.setRotationPoint(0.5F, -1.0F, 0.5F);
        this.flowerbonem6.addChild(flowerm6);
        this.setRotateAngle(flowerm6, 0.0F, 0.0F, 1.2217F);
        this.flowerm6.cubeList.add(new ModelBox(flowerm6, 0, 8, 0.0F, -9.0F, -0.5F, 0, 3, 1, 0.0F, false));
        this.flowerm6.cubeList.add(new ModelBox(flowerm6, 7, 8, 0.0F, -3.0F, -0.5F, 0, 3, 1, 0.0F, false));
        this.flowerm6.cubeList.add(new ModelBox(flowerm6, 4, 4, -0.5F, -6.0F, -0.5F, 1, 3, 1, 0.0F, false));

        this.cube_r29 = new AdvancedModelRenderer(this);
        this.cube_r29.setRotationPoint(0.0F, -6.0F, 0.5F);
        this.flowerm6.addChild(cube_r29);
        this.setRotateAngle(cube_r29, -0.7854F, 0.0F, 0.0F);
        this.cube_r29.cubeList.add(new ModelBox(cube_r29, 6, 0, -0.5F, 0.0F, 0.0F, 1, 1, 1, 0.0F, false));

        this.cube_r30 = new AdvancedModelRenderer(this);
        this.cube_r30.setRotationPoint(-0.5F, -6.0F, 0.0F);
        this.flowerm6.addChild(cube_r30);
        this.setRotateAngle(cube_r30, 0.0F, 0.0F, -0.7854F);
        this.cube_r30.cubeList.add(new ModelBox(cube_r30, 7, 3, -1.0F, 0.0F, -0.5F, 1, 1, 1, 0.0F, false));

        this.cube_r31 = new AdvancedModelRenderer(this);
        this.cube_r31.setRotationPoint(0.5F, -6.0F, 0.0F);
        this.flowerm6.addChild(cube_r31);
        this.setRotateAngle(cube_r31, 0.0F, 0.0F, 0.7854F);
        this.cube_r31.cubeList.add(new ModelBox(cube_r31, 7, 7, 0.0F, 0.0F, -0.5F, 1, 1, 1, 0.0F, false));

        this.cube_r32 = new AdvancedModelRenderer(this);
        this.cube_r32.setRotationPoint(0.0F, -6.0F, -0.5F);
        this.flowerm6.addChild(cube_r32);
        this.setRotateAngle(cube_r32, 0.7854F, 0.0F, 0.0F);
        this.cube_r32.cubeList.add(new ModelBox(cube_r32, 3, 8, -0.5F, 0.0F, -1.0F, 1, 1, 1, 0.0F, false));

        this.flowerbonem9 = new AdvancedModelRenderer(this);
        this.flowerbonem9.setRotationPoint(0.5F, -1.0F, 0.0F);
        this.bone.addChild(flowerbonem9);
        this.setRotateAngle(flowerbonem9, 0.0F, -1.9199F, 0.0F);


        this.flowerm9 = new AdvancedModelRenderer(this);
        this.flowerm9.setRotationPoint(0.5F, -1.0F, 0.5F);
        this.flowerbonem9.addChild(flowerm9);
        this.setRotateAngle(flowerm9, 0.0F, 0.0F, 1.309F);
        this.flowerm9.cubeList.add(new ModelBox(flowerm9, 0, 8, 1.0F, -8.0F, -0.5F, 0, 3, 1, 0.0F, false));
        this.flowerm9.cubeList.add(new ModelBox(flowerm9, 7, 8, 1.0F, -2.0F, -0.5F, 0, 3, 1, 0.0F, false));
        this.flowerm9.cubeList.add(new ModelBox(flowerm9, 4, 4, 0.5F, -5.0F, -0.5F, 1, 3, 1, 0.0F, false));

        this.cube_r33 = new AdvancedModelRenderer(this);
        this.cube_r33.setRotationPoint(0.0F, -6.0F, 0.5F);
        this.flowerm9.addChild(cube_r33);
        this.setRotateAngle(cube_r33, -0.7854F, 0.0F, 0.0F);
        this.cube_r33.cubeList.add(new ModelBox(cube_r33, 6, 0, 0.5F, 1.0F, 0.0F, 1, 1, 1, 0.0F, false));

        this.cube_r34 = new AdvancedModelRenderer(this);
        this.cube_r34.setRotationPoint(-0.5F, -6.0F, 0.0F);
        this.flowerm9.addChild(cube_r34);
        this.setRotateAngle(cube_r34, 0.0F, 0.0F, -0.7854F);
        this.cube_r34.cubeList.add(new ModelBox(cube_r34, 7, 3, 0.0F, 1.0F, -0.5F, 1, 1, 1, 0.0F, false));

        this.cube_r35 = new AdvancedModelRenderer(this);
        this.cube_r35.setRotationPoint(0.5F, -6.0F, 0.0F);
        this.flowerm9.addChild(cube_r35);
        this.setRotateAngle(cube_r35, 0.0F, 0.0F, 0.7854F);
        this.cube_r35.cubeList.add(new ModelBox(cube_r35, 7, 7, 1.0F, 1.0F, -0.5F, 1, 1, 1, 0.0F, false));

        this.cube_r36 = new AdvancedModelRenderer(this);
        this.cube_r36.setRotationPoint(0.0F, -6.0F, -0.5F);
        this.flowerm9.addChild(cube_r36);
        this.setRotateAngle(cube_r36, 0.7854F, 0.0F, 0.0F);
        this.cube_r36.cubeList.add(new ModelBox(cube_r36, 3, 8, 0.5F, 1.0F, -1.0F, 1, 1, 1, 0.0F, false));

        updateDefaultPose();
    }

    public void renderAll(float f) {
        this.resetToDefaultPose();
        //this.base.offsetY = -1.5F;
        //this.base.render(0.1f);
        this.bone.render(1f);
    }

    public void setRotateAngle(ModelRenderer modelRenderer, float x, float y, float z) {
        modelRenderer.rotateAngleX = x;
        modelRenderer.rotateAngleY = y;
        modelRenderer.rotateAngleZ = z;
    }

}
