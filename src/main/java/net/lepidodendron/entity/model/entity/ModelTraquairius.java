package net.lepidodendron.entity.model.entity;

import net.ilexiconn.llibrary.client.model.tools.AdvancedModelBase;
import net.ilexiconn.llibrary.client.model.tools.AdvancedModelRenderer;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

public class ModelTraquairius extends AdvancedModelBase {
    private final AdvancedModelRenderer head;
    private final AdvancedModelRenderer cube_r1;
    private final AdvancedModelRenderer cube_r2;
    private final AdvancedModelRenderer cube_r3;
    private final AdvancedModelRenderer cube_r4;
    private final AdvancedModelRenderer cube_r5;
    private final AdvancedModelRenderer cube_r6;
    private final AdvancedModelRenderer cube_r7;
    private final AdvancedModelRenderer cube_r8;
    private final AdvancedModelRenderer antennaL;
    private final AdvancedModelRenderer antennaR;
    private final AdvancedModelRenderer antennaL2;
    private final AdvancedModelRenderer antennaR2;
    private final AdvancedModelRenderer antennaL3;
    private final AdvancedModelRenderer antennaR3;
    private final AdvancedModelRenderer antennaL4;
    private final AdvancedModelRenderer antennaR4;
    private final AdvancedModelRenderer antennaL5;
    private final AdvancedModelRenderer antennaR5;
    private final AdvancedModelRenderer body;
    private final AdvancedModelRenderer cube_r9;
    private final AdvancedModelRenderer cube_r10;
    private final AdvancedModelRenderer cube_r11;
    private final AdvancedModelRenderer cube_r12;
    private final AdvancedModelRenderer cube_r13;
    private final AdvancedModelRenderer cube_r14;
    private final AdvancedModelRenderer cube_r15;
    private final AdvancedModelRenderer pectoralfinL;
    private final AdvancedModelRenderer pectoralfinR;
    private final AdvancedModelRenderer finsL;
    private final AdvancedModelRenderer finsR;
    private final AdvancedModelRenderer finsL2;
    private final AdvancedModelRenderer finsR2;
    private final AdvancedModelRenderer finsL3;
    private final AdvancedModelRenderer finsR3;
    private final AdvancedModelRenderer body1;
    private final AdvancedModelRenderer cube_r16;
    private final AdvancedModelRenderer cube_r17;
    private final AdvancedModelRenderer cube_r18;
    private final AdvancedModelRenderer cube_r19;
    private final AdvancedModelRenderer cube_r20;
    private final AdvancedModelRenderer cube_r21;
    private final AdvancedModelRenderer cube_r22;
    private final AdvancedModelRenderer cube_r23;
    private final AdvancedModelRenderer pelvicfinL;
    private final AdvancedModelRenderer pelvicfinR;
    private final AdvancedModelRenderer body2;
    private final AdvancedModelRenderer cube_r24;
    private final AdvancedModelRenderer cube_r25;
    private final AdvancedModelRenderer cube_r26;
    private final AdvancedModelRenderer cube_r27;
    private final AdvancedModelRenderer body3;
    private final AdvancedModelRenderer cube_r28;
    private final AdvancedModelRenderer cube_r29;
    private final AdvancedModelRenderer body4;
    private final AdvancedModelRenderer cube_r30;
    private final AdvancedModelRenderer cube_r31;

    public ModelTraquairius() {
        this.textureWidth = 64;
        this.textureHeight = 64;

        this.head = new AdvancedModelRenderer(this);
        this.head.setRotationPoint(0.0F, 20.0F, 0.0F);
        this.head.cubeList.add(new ModelBox(head, 39, 38, -1.49F, 3.05F, -1.25F, 3, 1, 2, 0.0F, false));

        this.cube_r1 = new AdvancedModelRenderer(this);
        this.cube_r1.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.head.addChild(cube_r1);
        this.setRotateAngle(cube_r1, -0.6981F, 0.0F, 0.0F);
        this.cube_r1.cubeList.add(new ModelBox(cube_r1, 48, 0, -2.26F, 0.0F, -1.25F, 1, 2, 2, 0.0F, false));
        this.cube_r1.cubeList.add(new ModelBox(cube_r1, 48, 10, 1.26F, 0.0F, -1.25F, 1, 2, 2, 0.0F, false));

        this.cube_r2 = new AdvancedModelRenderer(this);
        this.cube_r2.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.head.addChild(cube_r2);
        this.setRotateAngle(cube_r2, -0.1745F, 0.0F, 0.0F);
        this.cube_r2.cubeList.add(new ModelBox(cube_r2, 26, 0, -1.49F, 0.0F, -3.75F, 3, 1, 4, 0.0F, false));
        this.cube_r2.cubeList.add(new ModelBox(cube_r2, 36, 18, -1.49F, 1.0F, -6.75F, 3, 2, 8, 0.0F, false));

        this.cube_r3 = new AdvancedModelRenderer(this);
        this.cube_r3.setRotationPoint(0.0F, 1.0F, -0.5F);
        this.head.addChild(cube_r3);
        this.setRotateAngle(cube_r3, -0.6545F, -0.2618F, 0.0F);
        this.cube_r3.cubeList.add(new ModelBox(cube_r3, 46, 38, -2.01F, 1.0F, -0.5F, 1, 2, 3, 0.0F, false));

        this.cube_r4 = new AdvancedModelRenderer(this);
        this.cube_r4.setRotationPoint(0.0F, 0.75F, -0.5F);
        this.head.addChild(cube_r4);
        this.setRotateAngle(cube_r4, -0.1309F, -0.2618F, 0.0F);
        this.cube_r4.cubeList.add(new ModelBox(cube_r4, 0, 0, -1.91F, 0.5F, -1.25F, 1, 1, 3, 0.0F, false));
        this.cube_r4.cubeList.add(new ModelBox(cube_r4, 24, 10, -1.91F, 0.75F, 1.75F, 1, 1, 1, 0.0F, false));

        this.cube_r5 = new AdvancedModelRenderer(this);
        this.cube_r5.setRotationPoint(0.0F, 0.75F, -0.5F);
        this.head.addChild(cube_r5);
        this.setRotateAngle(cube_r5, -0.1309F, 0.2618F, 0.0F);
        this.cube_r5.cubeList.add(new ModelBox(cube_r5, 26, 0, 0.91F, 0.75F, 1.75F, 1, 1, 1, 0.0F, false));
        this.cube_r5.cubeList.add(new ModelBox(cube_r5, 36, 0, 0.91F, 0.5F, -1.25F, 1, 1, 3, 0.0F, false));

        this.cube_r6 = new AdvancedModelRenderer(this);
        this.cube_r6.setRotationPoint(0.0F, 1.0F, -0.5F);
        this.head.addChild(cube_r6);
        this.setRotateAngle(cube_r6, -0.6545F, 0.2618F, 0.0F);
        this.cube_r6.cubeList.add(new ModelBox(cube_r6, 42, 46, 1.01F, 1.0F, -0.5F, 1, 2, 3, 0.0F, false));

        this.cube_r7 = new AdvancedModelRenderer(this);
        this.cube_r7.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.head.addChild(cube_r7);
        this.setRotateAngle(cube_r7, -0.3927F, 0.0F, 0.0F);
        this.cube_r7.cubeList.add(new ModelBox(cube_r7, 38, 10, -0.99F, 3.2F, -5.55F, 2, 1, 6, 0.0F, false));

        this.cube_r8 = new AdvancedModelRenderer(this);
        this.cube_r8.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.head.addChild(cube_r8);
        this.setRotateAngle(cube_r8, 0.0873F, 0.0F, 0.0F);
        this.cube_r8.cubeList.add(new ModelBox(cube_r8, 10, 45, -1.49F, -1.0F, 1.0F, 3, 1, 2, 0.0F, false));
        this.cube_r8.cubeList.add(new ModelBox(cube_r8, 0, 41, -1.5F, -1.0F, -8.0F, 3, 2, 1, 0.0F, false));
        this.cube_r8.cubeList.add(new ModelBox(cube_r8, 28, 35, -1.0F, -1.25F, -4.15F, 2, 1, 7, 0.0F, false));
        this.cube_r8.cubeList.add(new ModelBox(cube_r8, 12, 35, -2.0F, -1.0F, -7.0F, 4, 1, 8, 0.0F, false));

        this.antennaL = new AdvancedModelRenderer(this);
        this.antennaL.setRotationPoint(0.55F, -0.25F, -8.0F);
        this.head.addChild(antennaL);
        this.setRotateAngle(antennaL, 0.2618F, 0.0F, 0.0F);
        this.antennaL.cubeList.add(new ModelBox(antennaL, 40, 44, 0.0F, -2.75F, 0.0F, 0, 3, 2, 0.0F, false));

        this.antennaR = new AdvancedModelRenderer(this);
        this.antennaR.setRotationPoint(-0.55F, -0.25F, -8.0F);
        this.head.addChild(antennaR);
        this.setRotateAngle(antennaR, 0.2618F, 0.0F, 0.0F);
        this.antennaR.cubeList.add(new ModelBox(antennaR, 26, 24, 0.0F, -2.75F, 0.0F, 0, 3, 2, 0.0F, false));

        this.antennaL2 = new AdvancedModelRenderer(this);
        this.antennaL2.setRotationPoint(0.65F, -0.25F, -7.75F);
        this.head.addChild(antennaL2);
        this.setRotateAngle(antennaL2, -0.1309F, 0.0F, 0.0436F);
        this.antennaL2.cubeList.add(new ModelBox(antennaL2, 0, 48, 0.0F, -3.75F, 0.0F, 0, 4, 2, 0.0F, false));

        this.antennaR2 = new AdvancedModelRenderer(this);
        this.antennaR2.setRotationPoint(-0.65F, -0.25F, -7.75F);
        this.head.addChild(antennaR2);
        this.setRotateAngle(antennaR2, -0.1309F, 0.0F, -0.0436F);
        this.antennaR2.cubeList.add(new ModelBox(antennaR2, 47, 27, 0.0F, -3.75F, 0.0F, 0, 4, 2, 0.0F, false));

        this.antennaL3 = new AdvancedModelRenderer(this);
        this.antennaL3.setRotationPoint(0.75F, -0.25F, -7.0F);
        this.head.addChild(antennaL3);
        this.setRotateAngle(antennaL3, -0.3054F, 0.0F, 0.0873F);
        this.antennaL3.cubeList.add(new ModelBox(antennaL3, 14, 46, 0.0F, -4.75F, 0.0F, 0, 5, 2, 0.0F, false));

        this.antennaR3 = new AdvancedModelRenderer(this);
        this.antennaR3.setRotationPoint(-0.75F, -0.25F, -7.0F);
        this.head.addChild(antennaR3);
        this.setRotateAngle(antennaR3, -0.3054F, 0.0F, -0.0873F);
        this.antennaR3.cubeList.add(new ModelBox(antennaR3, 10, 46, 0.0F, -4.75F, 0.0F, 0, 5, 2, 0.0F, false));

        this.antennaL4 = new AdvancedModelRenderer(this);
        this.antennaL4.setRotationPoint(0.85F, -0.25F, -6.25F);
        this.head.addChild(antennaL4);
        this.setRotateAngle(antennaL4, -0.5672F, 0.0F, 0.1309F);
        this.antennaL4.cubeList.add(new ModelBox(antennaL4, 40, 16, 0.0F, -5.75F, 0.0F, 0, 6, 2, 0.0F, false));

        this.antennaR4 = new AdvancedModelRenderer(this);
        this.antennaR4.setRotationPoint(-0.85F, -0.25F, -6.25F);
        this.head.addChild(antennaR4);
        this.setRotateAngle(antennaR4, -0.5672F, 0.0F, -0.1309F);
        this.antennaR4.cubeList.add(new ModelBox(antennaR4, 38, 8, 0.0F, -5.75F, 0.0F, 0, 6, 2, 0.0F, false));

        this.antennaL5 = new AdvancedModelRenderer(this);
        this.antennaL5.setRotationPoint(0.95F, -0.5F, -5.5F);
        this.head.addChild(antennaL5);
        this.setRotateAngle(antennaL5, -0.8727F, 0.0F, 0.1745F);
        this.antennaL5.cubeList.add(new ModelBox(antennaL5, 36, 16, 0.0F, -6.75F, 0.0F, 0, 7, 2, 0.0F, false));

        this.antennaR5 = new AdvancedModelRenderer(this);
        this.antennaR5.setRotationPoint(-0.95F, -0.5F, -5.5F);
        this.head.addChild(antennaR5);
        this.setRotateAngle(antennaR5, -0.8727F, 0.0F, -0.1745F);
        this.antennaR5.cubeList.add(new ModelBox(antennaR5, 28, 3, 0.0F, -6.75F, 0.0F, 0, 7, 2, 0.0F, false));

        this.body = new AdvancedModelRenderer(this);
        this.body.setRotationPoint(0.0F, 2.0F, 1.0F);
        this.head.addChild(body);
        this.body.cubeList.add(new ModelBox(body, 0, 45, -2.0F, -2.0F, -1.0F, 4, 4, 1, 0.0F, false));
        this.body.cubeList.add(new ModelBox(body, 0, 0, -2.0F, -2.5F, 0.0F, 4, 5, 12, 0.0F, false));
        this.body.cubeList.add(new ModelBox(body, 22, 7, -1.5F, -2.75F, 1.9F, 3, 1, 10, 0.0F, false));

        this.cube_r9 = new AdvancedModelRenderer(this);
        this.cube_r9.setRotationPoint(-1.75F, -2.75F, 6.0F);
        this.body.addChild(cube_r9);
        this.setRotateAngle(cube_r9, 0.0F, 0.0F, -0.5236F);
        this.cube_r9.cubeList.add(new ModelBox(cube_r9, 18, 13, 1.0F, 0.0F, -1.1F, 0, 1, 7, 0.0F, false));

        this.cube_r10 = new AdvancedModelRenderer(this);
        this.cube_r10.setRotationPoint(0.0F, 2.0F, 10.0F);
        this.body.addChild(cube_r10);
        this.setRotateAngle(cube_r10, 0.0F, 0.0F, -0.3491F);
        this.cube_r10.cubeList.add(new ModelBox(cube_r10, 0, 17, -2.5F, -0.25F, -6.0F, 1, 0, 8, 0.0F, true));

        this.cube_r11 = new AdvancedModelRenderer(this);
        this.cube_r11.setRotationPoint(0.0F, 2.0F, 10.0F);
        this.body.addChild(cube_r11);
        this.setRotateAngle(cube_r11, 0.0F, 0.0F, 0.3491F);
        this.cube_r11.cubeList.add(new ModelBox(cube_r11, 0, 17, 1.5F, -0.25F, -6.0F, 1, 0, 8, 0.0F, false));

        this.cube_r12 = new AdvancedModelRenderer(this);
        this.cube_r12.setRotationPoint(1.75F, -2.75F, 6.0F);
        this.body.addChild(cube_r12);
        this.setRotateAngle(cube_r12, 0.0F, 0.0F, 0.5236F);
        this.cube_r12.cubeList.add(new ModelBox(cube_r12, 36, 21, -1.0F, 0.0F, -1.1F, 0, 1, 7, 0.0F, false));

        this.cube_r13 = new AdvancedModelRenderer(this);
        this.cube_r13.setRotationPoint(0.0F, 2.0F, 1.0F);
        this.body.addChild(cube_r13);
        this.setRotateAngle(cube_r13, -0.0524F, 0.0F, 0.0F);
        this.cube_r13.cubeList.add(new ModelBox(cube_r13, 0, 17, -1.5F, -0.25F, -1.0F, 3, 1, 12, 0.0F, false));

        this.cube_r14 = new AdvancedModelRenderer(this);
        this.cube_r14.setRotationPoint(0.0F, 2.0F, -1.0F);
        this.body.addChild(cube_r14);
        this.setRotateAngle(cube_r14, 0.0F, 0.0F, 0.2182F);
        this.cube_r14.cubeList.add(new ModelBox(cube_r14, 8, 0, -3.0F, -2.0F, 1.0F, 1, 0, 12, 0.0F, false));

        this.cube_r15 = new AdvancedModelRenderer(this);
        this.cube_r15.setRotationPoint(0.0F, 2.0F, -1.0F);
        this.body.addChild(cube_r15);
        this.setRotateAngle(cube_r15, 0.0F, 0.0F, -0.2182F);
        this.cube_r15.cubeList.add(new ModelBox(cube_r15, 10, 0, 2.0F, -2.0F, 1.0F, 1, 0, 12, 0.0F, false));

        this.pectoralfinL = new AdvancedModelRenderer(this);
        this.pectoralfinL.setRotationPoint(2.0F, 1.0F, 2.0F);
        this.body.addChild(pectoralfinL);
        this.setRotateAngle(pectoralfinL, -0.2182F, 0.3491F, -0.0873F);
        this.pectoralfinL.cubeList.add(new ModelBox(pectoralfinL, 20, 37, 0.0F, -0.5F, 0.0F, 0, 3, 7, 0.0F, false));

        this.pectoralfinR = new AdvancedModelRenderer(this);
        this.pectoralfinR.setRotationPoint(-2.0F, 1.0F, 2.0F);
        this.body.addChild(pectoralfinR);
        this.setRotateAngle(pectoralfinR, -0.2182F, -0.3491F, 0.0873F);
        this.pectoralfinR.cubeList.add(new ModelBox(pectoralfinR, 36, 36, 0.0F, -0.5F, 0.0F, 0, 3, 7, 0.0F, false));

        this.finsL = new AdvancedModelRenderer(this);
        this.finsL.setRotationPoint(0.75F, -2.75F, 2.0F);
        this.body.addChild(finsL);
        this.setRotateAngle(finsL, -0.0436F, 0.0F, 0.0873F);
        this.finsL.cubeList.add(new ModelBox(finsL, 0, 13, 0.0F, -8.0F, 0.0F, 0, 8, 4, 0.0F, false));

        this.finsR = new AdvancedModelRenderer(this);
        this.finsR.setRotationPoint(-0.75F, -2.75F, 2.0F);
        this.body.addChild(finsR);
        this.setRotateAngle(finsR, -0.0436F, 0.0F, -0.0873F);
        this.finsR.cubeList.add(new ModelBox(finsR, 0, 0, 0.0F, -8.0F, 0.0F, 0, 8, 4, 0.0F, false));

        this.finsL2 = new AdvancedModelRenderer(this);
        this.finsL2.setRotationPoint(0.75F, -2.75F, 3.0F);
        this.body.addChild(finsL2);
        this.setRotateAngle(finsL2, -0.0873F, 0.0F, 0.0436F);
        this.finsL2.cubeList.add(new ModelBox(finsL2, 12, 33, -0.1F, -6.0F, 0.0F, 0, 6, 3, 0.0F, false));

        this.finsR2 = new AdvancedModelRenderer(this);
        this.finsR2.setRotationPoint(-0.75F, -2.75F, 3.0F);
        this.body.addChild(finsR2);
        this.setRotateAngle(finsR2, -0.0873F, 0.0F, -0.0436F);
        this.finsR2.cubeList.add(new ModelBox(finsR2, 28, 32, 0.1F, -6.0F, 0.0F, 0, 6, 3, 0.0F, false));

        this.finsL3 = new AdvancedModelRenderer(this);
        this.finsL3.setRotationPoint(0.65F, -2.75F, 4.0F);
        this.body.addChild(finsL3);
        this.setRotateAngle(finsL3, -0.1745F, 0.0F, 0.0F);
        this.finsL3.cubeList.add(new ModelBox(finsL3, 36, 44, -0.1F, -4.0F, 0.0F, 0, 4, 2, 0.0F, false));

        this.finsR3 = new AdvancedModelRenderer(this);
        this.finsR3.setRotationPoint(-0.65F, -2.75F, 4.0F);
        this.body.addChild(finsR3);
        this.setRotateAngle(finsR3, -0.1745F, 0.0F, 0.0F);
        this.finsR3.cubeList.add(new ModelBox(finsR3, 8, 6, 0.1F, -4.0F, 0.0F, 0, 4, 2, 0.0F, false));

        this.body1 = new AdvancedModelRenderer(this);
        this.body1.setRotationPoint(0.0F, 0.0F, 11.75F);
        this.body.addChild(body1);
        this.body1.cubeList.add(new ModelBox(body1, 21, 21, -1.5F, -2.49F, -0.75F, 3, 5, 9, 0.0F, false));

        this.cube_r16 = new AdvancedModelRenderer(this);
        this.cube_r16.setRotationPoint(0.0F, -2.5F, 4.25F);
        this.body1.addChild(cube_r16);
        this.setRotateAngle(cube_r16, -0.1309F, 0.0F, 0.0F);
        this.cube_r16.cubeList.add(new ModelBox(cube_r16, 0, 32, 0.0F, -4.25F, 0.0F, 0, 5, 4, 0.0F, false));

        this.cube_r17 = new AdvancedModelRenderer(this);
        this.cube_r17.setRotationPoint(0.0F, 2.5F, 0.25F);
        this.body1.addChild(cube_r17);
        this.setRotateAngle(cube_r17, 0.0873F, 0.0F, 0.0F);
        this.cube_r17.cubeList.add(new ModelBox(cube_r17, 0, 36, -1.0F, -0.25F, -0.25F, 2, 1, 8, 0.0F, false));

        this.cube_r18 = new AdvancedModelRenderer(this);
        this.cube_r18.setRotationPoint(-1.75F, -2.75F, 6.25F);
        this.body1.addChild(cube_r18);
        this.setRotateAngle(cube_r18, 0.0F, 0.0F, -0.5236F);
        this.cube_r18.cubeList.add(new ModelBox(cube_r18, 18, 10, 1.1F, 0.25F, -6.0F, 0, 1, 8, 0.0F, false));

        this.cube_r19 = new AdvancedModelRenderer(this);
        this.cube_r19.setRotationPoint(0.0F, 2.0F, -0.75F);
        this.body1.addChild(cube_r19);
        this.setRotateAngle(cube_r19, 0.0F, 0.0F, 0.2182F);
        this.cube_r19.cubeList.add(new ModelBox(cube_r19, 16, 0, -2.5F, -2.0F, 1.0F, 1, 0, 8, 0.0F, false));

        this.cube_r20 = new AdvancedModelRenderer(this);
        this.cube_r20.setRotationPoint(0.0F, 2.0F, -0.75F);
        this.body1.addChild(cube_r20);
        this.setRotateAngle(cube_r20, 0.0F, 0.0F, -0.3491F);
        this.cube_r20.cubeList.add(new ModelBox(cube_r20, 7, 18, -2.0F, -0.1F, 1.0F, 1, 0, 1, 0.0F, true));

        this.cube_r21 = new AdvancedModelRenderer(this);
        this.cube_r21.setRotationPoint(0.0F, 2.0F, -0.75F);
        this.body1.addChild(cube_r21);
        this.setRotateAngle(cube_r21, 0.0F, 0.0F, 0.3491F);
        this.cube_r21.cubeList.add(new ModelBox(cube_r21, 7, 18, 1.0F, -0.1F, 1.0F, 1, 0, 1, 0.0F, false));

        this.cube_r22 = new AdvancedModelRenderer(this);
        this.cube_r22.setRotationPoint(0.0F, 2.0F, -0.75F);
        this.body1.addChild(cube_r22);
        this.setRotateAngle(cube_r22, 0.0F, 0.0F, -0.2182F);
        this.cube_r22.cubeList.add(new ModelBox(cube_r22, 0, 17, 1.5F, -2.0F, 1.0F, 1, 0, 8, 0.0F, false));

        this.cube_r23 = new AdvancedModelRenderer(this);
        this.cube_r23.setRotationPoint(1.75F, -2.75F, 6.25F);
        this.body1.addChild(cube_r23);
        this.setRotateAngle(cube_r23, 0.0F, 0.0F, 0.5236F);
        this.cube_r23.cubeList.add(new ModelBox(cube_r23, 18, 11, -1.1F, 0.25F, -6.0F, 0, 1, 8, 0.0F, false));

        this.pelvicfinL = new AdvancedModelRenderer(this);
        this.pelvicfinL.setRotationPoint(1.0F, 2.75F, 1.25F);
        this.body1.addChild(pelvicfinL);
        this.setRotateAngle(pelvicfinL, 1.1345F, 0.0F, -0.1309F);
        this.pelvicfinL.cubeList.add(new ModelBox(pelvicfinL, 24, 45, 0.0F, 0.0F, -0.25F, 0, 5, 2, 0.0F, false));

        this.pelvicfinR = new AdvancedModelRenderer(this);
        this.pelvicfinR.setRotationPoint(-1.0F, 2.75F, 1.25F);
        this.body1.addChild(pelvicfinR);
        this.setRotateAngle(pelvicfinR, 1.1345F, 0.0F, 0.1309F);
        this.pelvicfinR.cubeList.add(new ModelBox(pelvicfinR, 20, 45, 0.0F, 0.0F, -0.25F, 0, 5, 2, 0.0F, false));

        this.body2 = new AdvancedModelRenderer(this);
        this.body2.setRotationPoint(0.0F, 0.0F, 8.25F);
        this.body1.addChild(body2);
        this.body2.cubeList.add(new ModelBox(body2, 38, 0, -1.0F, -2.0F, -1.0F, 2, 4, 6, 0.0F, false));

        this.cube_r24 = new AdvancedModelRenderer(this);
        this.cube_r24.setRotationPoint(0.0F, 2.0F, -1.0F);
        this.body2.addChild(cube_r24);
        this.setRotateAngle(cube_r24, 0.0F, 0.0F, 0.2182F);
        this.cube_r24.cubeList.add(new ModelBox(cube_r24, 21, 21, -2.0F, -2.0F, 1.0F, 1, 0, 5, 0.0F, false));

        this.cube_r25 = new AdvancedModelRenderer(this);
        this.cube_r25.setRotationPoint(-1.75F, -2.75F, 6.0F);
        this.body2.addChild(cube_r25);
        this.setRotateAngle(cube_r25, 0.0F, 0.0F, -0.5236F);
        this.cube_r25.cubeList.add(new ModelBox(cube_r25, 0, 20, 1.0F, 1.0F, -6.0F, 0, 1, 5, 0.0F, false));

        this.cube_r26 = new AdvancedModelRenderer(this);
        this.cube_r26.setRotationPoint(0.0F, 2.0F, -1.0F);
        this.body2.addChild(cube_r26);
        this.setRotateAngle(cube_r26, 0.0F, 0.0F, -0.2182F);
        this.cube_r26.cubeList.add(new ModelBox(cube_r26, 5, 22, 1.0F, -2.0F, 1.0F, 1, 0, 5, 0.0F, false));

        this.cube_r27 = new AdvancedModelRenderer(this);
        this.cube_r27.setRotationPoint(1.75F, -2.75F, 6.0F);
        this.body2.addChild(cube_r27);
        this.setRotateAngle(cube_r27, 0.0F, 0.0F, 0.5236F);
        this.cube_r27.cubeList.add(new ModelBox(cube_r27, 0, 21, -1.0F, 1.0F, -6.0F, 0, 1, 5, 0.0F, false));

        this.body3 = new AdvancedModelRenderer(this);
        this.body3.setRotationPoint(0.0F, 0.0F, 5.0F);
        this.body2.addChild(body3);
        this.body3.cubeList.add(new ModelBox(body3, 18, 17, 0.0F, -3.5F, 1.0F, 0, 7, 4, 0.0F, false));
        this.body3.cubeList.add(new ModelBox(body3, 39, 29, -0.5F, -1.5F, -1.0F, 1, 3, 6, 0.0F, false));

        this.cube_r28 = new AdvancedModelRenderer(this);
        this.cube_r28.setRotationPoint(0.0F, 2.0F, -6.0F);
        this.body3.addChild(cube_r28);
        this.setRotateAngle(cube_r28, 0.0F, 0.0F, 0.2182F);
        this.cube_r28.cubeList.add(new ModelBox(cube_r28, 5, 17, -1.5F, -2.0F, 6.0F, 1, 0, 5, 0.0F, false));

        this.cube_r29 = new AdvancedModelRenderer(this);
        this.cube_r29.setRotationPoint(0.0F, 2.0F, -6.0F);
        this.body3.addChild(cube_r29);
        this.setRotateAngle(cube_r29, 0.0F, 0.0F, -0.2182F);
        this.cube_r29.cubeList.add(new ModelBox(cube_r29, 21, 5, 0.5F, -2.0F, 6.0F, 1, 0, 5, 0.0F, false));

        this.body4 = new AdvancedModelRenderer(this);
        this.body4.setRotationPoint(0.0F, 0.0F, 5.0F);
        this.body3.addChild(body4);
        this.body4.cubeList.add(new ModelBox(body4, 28, 44, -0.5F, -1.0F, 0.0F, 1, 2, 6, 0.0F, false));
        this.body4.cubeList.add(new ModelBox(body4, 28, 47, -0.5F, -0.5F, 6.0F, 1, 1, 2, 0.0F, false));
        this.body4.cubeList.add(new ModelBox(body4, 0, 20, 0.0F, -3.0F, 0.0F, 0, 6, 10, 0.0F, false));

        this.cube_r30 = new AdvancedModelRenderer(this);
        this.cube_r30.setRotationPoint(0.0F, 2.0F, -11.0F);
        this.body4.addChild(cube_r30);
        this.setRotateAngle(cube_r30, 0.0F, 0.0F, 0.2182F);
        this.cube_r30.cubeList.add(new ModelBox(cube_r30, 0, 0, -1.5F, -2.0F, 11.0F, 1, 0, 8, 0.0F, false));

        this.cube_r31 = new AdvancedModelRenderer(this);
        this.cube_r31.setRotationPoint(0.0F, 2.0F, -11.0F);
        this.body4.addChild(cube_r31);
        this.setRotateAngle(cube_r31, 0.0F, 0.0F, -0.2182F);
        this.cube_r31.cubeList.add(new ModelBox(cube_r31, 2, 0, 0.5F, -2.0F, 11.0F, 1, 0, 8, 0.0F, false));

        updateDefaultPose();
    }

    @Override
    public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        this.head.render(f5 * 0.23F);
    }

    public void setRotateAngle(ModelRenderer AdvancedModelRenderer, float x, float y, float z) {
        AdvancedModelRenderer.rotateAngleX = x;
        AdvancedModelRenderer.rotateAngleY = y;
        AdvancedModelRenderer.rotateAngleZ = z;
    }

    @Override
    public void setRotationAngles(float f, float f1, float f2, float f3, float f4, float f5, Entity e) {
        super.setRotationAngles(f, f1, f2, f3, f4, f5, e);
        this.resetToDefaultPose();

        this.head.offsetY = 1.1F;
        this.head.offsetZ = -0.15F;

        AdvancedModelRenderer[] fishTail = {this.body1, this.body2, this.body3, this.body4};

        float speed = 0.245F;
        if (!e.isInWater()) {
            speed = 0.421F;
        }

        //this.head.rotateAngleY += f3 / (180F / (float) Math.PI);
        //this.head.rotateAngleX += f4 / (180F / (float) Math.PI);

        //if (f3 != 0.0F) {this.walk(Jaw, (float) (speed * 1.5), 0.2F, true, 0, 0, f2, 1);}
        if (e.isInWater()) {
            this.chainWave(fishTail, speed * 1.5F, 0.02F, -0.2, f2, 0.8F);
            this.chainSwing(fishTail, speed * 1.5F, 0.32F, -0.75, f2, 0.6F);
            this.swing(body, speed * 1.5F, 0.2F, true, 0, 0, f2, 0.8F);
        }
        else {
            this.swing(body, speed * 1.5F, 0.1F, true, 0, 0, f2, 0.5F);
        }
        this.flap(pectoralfinL, (float) (speed * 0.65), 0.3F, false, 0.8F, 0, f2, 0.78F);
        this.swing(pectoralfinL, (float) (speed * 0.65), 0.2F, true, 0, 0, f2, 0.78F);
        this.flap(pectoralfinR, (float) (speed * 0.65), -0.3F, false, 0.8F, 0, f2, 0.78F);
        this.swing(pectoralfinR, (float) (speed * 0.65), -0.2F, true, 0, 0, f2, 0.78F);

        this.flap(pelvicfinL, (float) (speed * 0.65), 0.3F, false, 1.8F, 0, f2, 0.78F);
        this.swing(pelvicfinL, (float) (speed * 0.65), 0.2F, true, 1, 0, f2, 0.78F);
        this.flap(pelvicfinR, (float) (speed * 0.65), -0.3F, false, 1.8F, 0, f2, 0.78F);
        this.swing(pelvicfinR, (float) (speed * 0.65), -0.2F, true, 1, 0, f2, 0.78F);

        this.walk(finsL, speed * 5F, 0.05F, false, 0, 0, f2, 1f);
        this.walk(finsR, speed * 5F, 0.05F, false, 0, 0, f2, 1f);
        this.flap(finsL, speed * 5F, 0.1F, false, 0.2F, 0, f2, 1f);
        this.flap(finsR, speed * 5F, -0.1F, false, 0.2F, 0, f2, 1f);

        this.walk(finsL2, speed * 5F, -0.05F, false, 0, 0, f2, 1f);
        this.walk(finsR2, speed * 5F, -0.05F, false, 0, 0, f2, 1f);
        this.flap(finsL2, speed * 5F, 0.1F, false, 0.2F, 0, f2, 1f);
        this.flap(finsR2, speed * 5F, -0.1F, false, 0.2F, 0, f2, 1f);

        this.walk(antennaL, speed * 5F, 0.05F, false, 0, 0, f2, 1f);
        this.walk(antennaR, speed * 5F, 0.05F, false, 0, 0, f2, 1f);
        this.flap(antennaL, speed * 5F, 0.1F, false, 0, 0, f2, 1f);
        this.flap(antennaR, speed * 5F, -0.1F, false, 0, 0, f2, 1f);

        this.walk(antennaL2, speed * 5F, 0.05F, false, 0.5F, 0, f2, 1f);
        this.walk(antennaR2, speed * 5F, 0.05F, false, 0.5F, 0, f2, 1f);
        this.flap(antennaL2, speed * 5F, 0.1F, false, 0.5F, 0, f2, 1f);
        this.flap(antennaR2, speed * 5F, -0.1F, false, 0.5F, 0, f2, 1f);

        this.walk(antennaL3, speed * 5F, 0.05F, false, 1F, 0, f2, 1f);
        this.walk(antennaR3, speed * 5F, 0.05F, false, 1F, 0, f2, 1f);
        this.flap(antennaL3, speed * 5F, 0.1F, false, 1F, 0, f2, 1f);
        this.flap(antennaR3, speed * 5F, -0.1F, false, 1F, 0, f2, 1f);

        this.walk(antennaL4, speed * 5F, 0.05F, false, 1.5F, 0, f2, 1f);
        this.walk(antennaR4, speed * 5F, 0.05F, false, 1.5F, 0, f2, 1f);
        this.flap(antennaL4, speed * 5F, 0.1F, false, 1.5F, 0, f2, 1f);
        this.flap(antennaR4, speed * 5F, -0.1F, false, 1.5F, 0, f2, 1f);

        this.walk(antennaL5, speed * 5F, 0.05F, false, 2F, 0, f2, 1f);
        this.walk(antennaR5, speed * 5F, 0.05F, false, 2F, 0, f2, 1f);
        this.flap(antennaL5, speed * 5F, 0.1F, false, 2F, 0, f2, 1f);
        this.flap(antennaR5, speed * 5F, -0.1F, false, 2F, 0, f2, 1f);

        if (!e.isInWater()) {
            this.head.rotateAngleZ = (float) Math.toRadians(90);
            this.head.offsetY = 1.2F;
            this.bob(head, -speed * 1.95F, 2.5F, false, f2, 1);
            this.chainWave(fishTail, speed * 2.1F, 0.02F, -0.2, f2, 0.8F);
            this.chainSwing(fishTail, speed * 2.1F, 0.2F, -0.55, f2, 0.4F);

        }

    }

}

