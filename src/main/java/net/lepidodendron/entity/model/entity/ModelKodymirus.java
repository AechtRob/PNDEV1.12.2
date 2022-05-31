package net.lepidodendron.entity.model.entity;

import net.ilexiconn.llibrary.client.model.tools.AdvancedModelBase;
import net.ilexiconn.llibrary.client.model.tools.AdvancedModelRenderer;
import net.minecraft.block.material.Material;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.entity.Entity;
import net.minecraft.util.math.BlockPos;

public class ModelKodymirus extends AdvancedModelBase {
    private final AdvancedModelRenderer head;
    private final AdvancedModelRenderer cube_r1;
    private final AdvancedModelRenderer appendageL;
    private final AdvancedModelRenderer appendageL2;
    private final AdvancedModelRenderer cube_r2;
    private final AdvancedModelRenderer appendageL3;
    private final AdvancedModelRenderer cube_r3;
    private final AdvancedModelRenderer appendageL4;
    private final AdvancedModelRenderer cube_r4;
    private final AdvancedModelRenderer appendageL5;
    private final AdvancedModelRenderer appendageR;
    private final AdvancedModelRenderer appendageR2;
    private final AdvancedModelRenderer cube_r5;
    private final AdvancedModelRenderer appendageR3;
    private final AdvancedModelRenderer cube_r6;
    private final AdvancedModelRenderer appendageR4;
    private final AdvancedModelRenderer cube_r7;
    private final AdvancedModelRenderer appendageR5;
    private final AdvancedModelRenderer legR;
    private final AdvancedModelRenderer legL;
    private final AdvancedModelRenderer antennaL;
    private final AdvancedModelRenderer antennaR;
    private final AdvancedModelRenderer body;
    private final AdvancedModelRenderer cube_r8;
    private final AdvancedModelRenderer cube_r9;
    private final AdvancedModelRenderer cube_r10;
    private final AdvancedModelRenderer legL2;
    private final AdvancedModelRenderer legR2;
    private final AdvancedModelRenderer body2;
    private final AdvancedModelRenderer cube_r11;
    private final AdvancedModelRenderer cube_r12;
    private final AdvancedModelRenderer cube_r13;
    private final AdvancedModelRenderer legL3;
    private final AdvancedModelRenderer legR3;
    private final AdvancedModelRenderer body3;
    private final AdvancedModelRenderer cube_r14;
    private final AdvancedModelRenderer cube_r15;
    private final AdvancedModelRenderer cube_r16;
    private final AdvancedModelRenderer legL4;
    private final AdvancedModelRenderer legR4;
    private final AdvancedModelRenderer body4;
    private final AdvancedModelRenderer cube_r17;
    private final AdvancedModelRenderer cube_r18;
    private final AdvancedModelRenderer cube_r19;
    private final AdvancedModelRenderer legL5;
    private final AdvancedModelRenderer legR5;
    private final AdvancedModelRenderer body5;
    private final AdvancedModelRenderer cube_r20;
    private final AdvancedModelRenderer cube_r21;
    private final AdvancedModelRenderer cube_r22;
    private final AdvancedModelRenderer legL6;
    private final AdvancedModelRenderer legR6;
    private final AdvancedModelRenderer body6;
    private final AdvancedModelRenderer cube_r23;
    private final AdvancedModelRenderer cube_r24;
    private final AdvancedModelRenderer cube_r25;
    private final AdvancedModelRenderer legL7;
    private final AdvancedModelRenderer legR7;
    private final AdvancedModelRenderer body7;
    private final AdvancedModelRenderer cube_r26;
    private final AdvancedModelRenderer cube_r27;
    private final AdvancedModelRenderer cube_r28;
    private final AdvancedModelRenderer legL8;
    private final AdvancedModelRenderer legR8;
    private final AdvancedModelRenderer body8;
    private final AdvancedModelRenderer cube_r29;
    private final AdvancedModelRenderer cube_r30;
    private final AdvancedModelRenderer cube_r31;
    private final AdvancedModelRenderer legL9;
    private final AdvancedModelRenderer legR9;
    private final AdvancedModelRenderer tail;

    public ModelKodymirus() {
        this.textureWidth = 32;
        this.textureHeight = 32;

        this.head = new AdvancedModelRenderer(this);
        this.head.setRotationPoint(0.0F, 22.0F, 3.0F);
        this.head.cubeList.add(new ModelBox(head, 0, 12, -2.5F, -1.0F, -7.0F, 5, 1, 3, 0.0F, false));
        this.head.cubeList.add(new ModelBox(head, 22, 12, -1.5F, -1.0F, -8.0F, 3, 1, 1, 0.0F, false));

        this.cube_r1 = new AdvancedModelRenderer(this);
        this.cube_r1.setRotationPoint(0.0F, -1.0F, -7.0F);
        this.head.addChild(cube_r1);
        this.setRotateAngle(cube_r1, 0.0873F, 0.0F, 0.0F);
        this.cube_r1.cubeList.add(new ModelBox(cube_r1, 12, 12, -2.0F, 0.02F, 0.0F, 4, 0, 1, 0.0F, false));
        this.cube_r1.cubeList.add(new ModelBox(cube_r1, 13, 13, -1.5F, 0.0F, 0.0F, 3, 1, 3, 0.0F, false));

        this.appendageL = new AdvancedModelRenderer(this);
        this.appendageL.setRotationPoint(0.5F, 0.1F, -5.75F);
        this.head.addChild(appendageL);
        this.setRotateAngle(appendageL, 0.0F, -0.1309F, 0.3491F);
        this.appendageL.cubeList.add(new ModelBox(appendageL, 0, 28, 0.0F, -1.09F, -0.5F, 2, 1, 1, 0.0F, false));

        this.appendageL2 = new AdvancedModelRenderer(this);
        this.appendageL2.setRotationPoint(1.85F, -0.5F, 0.0F);
        this.appendageL.addChild(appendageL2);
        this.setRotateAngle(appendageL2, 0.0F, 0.3491F, 0.0F);
        this.appendageL2.cubeList.add(new ModelBox(appendageL2, 0, 28, 0.0F, -0.58F, -0.51F, 2, 1, 1, 0.0F, false));

        this.cube_r2 = new AdvancedModelRenderer(this);
        this.cube_r2.setRotationPoint(1.25F, -0.25F, -0.5F);
        this.appendageL2.addChild(cube_r2);
        this.setRotateAngle(cube_r2, 0.0F, 0.0F, 1.5708F);
        this.cube_r2.cubeList.add(new ModelBox(cube_r2, 3, 28, -0.35F, 0.17F, -2.76F, 1, 0, 3, 0.0F, false));

        this.appendageL3 = new AdvancedModelRenderer(this);
        this.appendageL3.setRotationPoint(1.85F, 0.0F, 0.0F);
        this.appendageL2.addChild(appendageL3);
        this.setRotateAngle(appendageL3, 0.0F, 0.2618F, 0.0F);
        this.appendageL3.cubeList.add(new ModelBox(appendageL3, 0, 28, 0.0F, -0.57F, -0.51F, 2, 1, 1, 0.0F, false));

        this.cube_r3 = new AdvancedModelRenderer(this);
        this.cube_r3.setRotationPoint(1.0F, 0.0F, -0.5F);
        this.appendageL3.addChild(cube_r3);
        this.setRotateAngle(cube_r3, -0.1745F, 0.0F, 1.5708F);
        this.cube_r3.cubeList.add(new ModelBox(cube_r3, 3, 28, -0.5F, 0.18F, -2.76F, 1, 0, 3, 0.0F, false));

        this.appendageL4 = new AdvancedModelRenderer(this);
        this.appendageL4.setRotationPoint(1.75F, 0.0F, -0.1F);
        this.appendageL3.addChild(appendageL4);
        this.setRotateAngle(appendageL4, 0.0F, 0.2182F, 0.0F);
        this.appendageL4.cubeList.add(new ModelBox(appendageL4, 0, 28, -0.5F, -0.56F, -0.5F, 2, 1, 1, 0.0F, false));

        this.cube_r4 = new AdvancedModelRenderer(this);
        this.cube_r4.setRotationPoint(0.5F, 0.0F, -0.5F);
        this.appendageL4.addChild(cube_r4);
        this.setRotateAngle(cube_r4, -0.2618F, 0.0F, 1.5708F);
        this.cube_r4.cubeList.add(new ModelBox(cube_r4, 3, 28, -0.5F, -0.06F, -2.76F, 1, 0, 3, 0.0F, false));

        this.appendageL5 = new AdvancedModelRenderer(this);
        this.appendageL5.setRotationPoint(1.5F, 0.0F, 0.0F);
        this.appendageL4.addChild(appendageL5);
        this.setRotateAngle(appendageL5, 0.0F, 0.1745F, 0.0F);
        this.appendageL5.cubeList.add(new ModelBox(appendageL5, 7, 30, -0.25F, -0.09F, -1.5F, 4, 0, 2, 0.0F, false));

        this.appendageR = new AdvancedModelRenderer(this);
        this.appendageR.setRotationPoint(-0.5F, 0.1F, -5.75F);
        this.head.addChild(appendageR);
        this.setRotateAngle(appendageR, 0.0F, 0.1309F, -0.3491F);
        this.appendageR.cubeList.add(new ModelBox(appendageR, 0, 28, -2.0F, -1.09F, -0.5F, 2, 1, 1, 0.0F, true));

        this.appendageR2 = new AdvancedModelRenderer(this);
        this.appendageR2.setRotationPoint(-1.85F, -0.5F, 0.0F);
        this.appendageR.addChild(appendageR2);
        this.setRotateAngle(appendageR2, 0.0F, -0.3491F, 0.0F);
        this.appendageR2.cubeList.add(new ModelBox(appendageR2, 0, 28, -2.0F, -0.58F, -0.51F, 2, 1, 1, 0.0F, true));

        this.cube_r5 = new AdvancedModelRenderer(this);
        this.cube_r5.setRotationPoint(-1.25F, -0.25F, -0.5F);
        this.appendageR2.addChild(cube_r5);
        this.setRotateAngle(cube_r5, 0.0F, 0.0F, -1.5708F);
        this.cube_r5.cubeList.add(new ModelBox(cube_r5, 3, 28, -0.65F, 0.17F, -2.76F, 1, 0, 3, 0.0F, true));

        this.appendageR3 = new AdvancedModelRenderer(this);
        this.appendageR3.setRotationPoint(-1.85F, 0.0F, 0.0F);
        this.appendageR2.addChild(appendageR3);
        this.setRotateAngle(appendageR3, 0.0F, -0.2618F, 0.0F);
        this.appendageR3.cubeList.add(new ModelBox(appendageR3, 0, 28, -2.0F, -0.57F, -0.51F, 2, 1, 1, 0.0F, true));

        this.cube_r6 = new AdvancedModelRenderer(this);
        this.cube_r6.setRotationPoint(-1.0F, 0.0F, -0.5F);
        this.appendageR3.addChild(cube_r6);
        this.setRotateAngle(cube_r6, -0.1745F, 0.0F, -1.5708F);
        this.cube_r6.cubeList.add(new ModelBox(cube_r6, 3, 28, -0.5F, 0.18F, -2.76F, 1, 0, 3, 0.0F, true));

        this.appendageR4 = new AdvancedModelRenderer(this);
        this.appendageR4.setRotationPoint(-1.75F, 0.0F, -0.1F);
        this.appendageR3.addChild(appendageR4);
        this.setRotateAngle(appendageR4, 0.0F, -0.2182F, 0.0F);
        this.appendageR4.cubeList.add(new ModelBox(appendageR4, 0, 28, -1.5F, -0.56F, -0.5F, 2, 1, 1, 0.0F, true));

        this.cube_r7 = new AdvancedModelRenderer(this);
        this.cube_r7.setRotationPoint(-0.5F, 0.0F, -0.5F);
        this.appendageR4.addChild(cube_r7);
        this.setRotateAngle(cube_r7, -0.2618F, 0.0F, -1.5708F);
        this.cube_r7.cubeList.add(new ModelBox(cube_r7, 3, 28, -0.5F, -0.06F, -2.76F, 1, 0, 3, 0.0F, true));

        this.appendageR5 = new AdvancedModelRenderer(this);
        this.appendageR5.setRotationPoint(-1.5F, 0.0F, 0.0F);
        this.appendageR4.addChild(appendageR5);
        this.setRotateAngle(appendageR5, 0.0F, -0.1745F, 0.0F);
        this.appendageR5.cubeList.add(new ModelBox(appendageR5, 7, 30, -3.75F, -0.09F, -1.5F, 4, 0, 2, 0.0F, true));

        this.legR = new AdvancedModelRenderer(this);
        this.legR.setRotationPoint(-0.25F, 0.0F, -4.5F);
        this.head.addChild(legR);
        this.legR.cubeList.add(new ModelBox(legR, 8, 26, -2.0F, 0.0F, 0.0F, 2, 2, 0, 0.0F, false));

        this.legL = new AdvancedModelRenderer(this);
        this.legL.setRotationPoint(0.25F, 0.0F, -4.5F);
        this.head.addChild(legL);
        this.legL.cubeList.add(new ModelBox(legL, 12, 26, 0.0F, 0.0F, 0.0F, 2, 2, 0, 0.0F, false));

        this.antennaL = new AdvancedModelRenderer(this);
        this.antennaL.setRotationPoint(1.5F, -0.5F, -7.0F);
        this.head.addChild(antennaL);
        this.setRotateAngle(antennaL, 0.0F, -0.3491F, 0.0F);
        this.antennaL.cubeList.add(new ModelBox(antennaL, 5, 18, 0.0F, -0.5F, -2.0F, 0, 1, 2, 0.0F, false));

        this.antennaR = new AdvancedModelRenderer(this);
        this.antennaR.setRotationPoint(-1.5F, -0.5F, -7.0F);
        this.head.addChild(antennaR);
        this.setRotateAngle(antennaR, 0.0F, 0.3491F, 0.0F);
        this.antennaR.cubeList.add(new ModelBox(antennaR, 9, 14, 0.0F, -0.5F, -2.0F, 0, 1, 2, 0.0F, false));

        this.body = new AdvancedModelRenderer(this);
        this.body.setRotationPoint(0.0F, -0.75F, -4.0F);
        this.head.addChild(body);
        this.body.cubeList.add(new ModelBox(body, 18, 20, -2.0F, -0.25F, 0.0F, 4, 1, 1, 0.0F, false));

        this.cube_r8 = new AdvancedModelRenderer(this);
        this.cube_r8.setRotationPoint(2.0F, -0.25F, 0.0F);
        this.body.addChild(cube_r8);
        this.setRotateAngle(cube_r8, 0.0F, 0.0F, 1.0472F);
        this.cube_r8.cubeList.add(new ModelBox(cube_r8, 9, 23, 0.0F, 0.0F, 0.0F, 1, 0, 1, 0.0F, false));

        this.cube_r9 = new AdvancedModelRenderer(this);
        this.cube_r9.setRotationPoint(-2.0F, -0.25F, 0.0F);
        this.body.addChild(cube_r9);
        this.setRotateAngle(cube_r9, 0.0F, 0.0F, -1.0472F);
        this.cube_r9.cubeList.add(new ModelBox(cube_r9, 0, 22, -1.0F, 0.0F, 0.0F, 1, 0, 1, 0.0F, false));

        this.cube_r10 = new AdvancedModelRenderer(this);
        this.cube_r10.setRotationPoint(0.0F, -0.25F, 3.0F);
        this.body.addChild(cube_r10);
        this.setRotateAngle(cube_r10, 0.1309F, 0.0F, 0.0F);
        this.cube_r10.cubeList.add(new ModelBox(cube_r10, 0, 10, -1.0F, -0.5F, -2.981F, 2, 1, 1, 0.0F, false));

        this.legL2 = new AdvancedModelRenderer(this);
        this.legL2.setRotationPoint(0.5F, 0.75F, 0.5F);
        this.body.addChild(legL2);
        this.legL2.cubeList.add(new ModelBox(legL2, 0, 26, 0.0F, 0.0F, 0.0F, 2, 2, 0, 0.0F, false));

        this.legR2 = new AdvancedModelRenderer(this);
        this.legR2.setRotationPoint(-0.5F, 0.75F, 0.5F);
        this.body.addChild(legR2);
        this.legR2.cubeList.add(new ModelBox(legR2, 23, 25, -2.0F, 0.0F, 0.0F, 2, 2, 0, 0.0F, false));

        this.body2 = new AdvancedModelRenderer(this);
        this.body2.setRotationPoint(0.0F, 0.0F, 1.0F);
        this.body.addChild(body2);
        this.body2.cubeList.add(new ModelBox(body2, 9, 19, -1.99F, -0.26F, 0.0F, 4, 1, 1, 0.0F, false));

        this.cube_r11 = new AdvancedModelRenderer(this);
        this.cube_r11.setRotationPoint(0.0F, -0.25F, 3.0F);
        this.body2.addChild(cube_r11);
        this.setRotateAngle(cube_r11, 0.1309F, 0.0F, 0.0F);
        this.cube_r11.cubeList.add(new ModelBox(cube_r11, 0, 8, -0.99F, -0.5F, -2.981F, 2, 1, 1, 0.0F, false));

        this.cube_r12 = new AdvancedModelRenderer(this);
        this.cube_r12.setRotationPoint(-2.0F, -0.25F, 0.0F);
        this.body2.addChild(cube_r12);
        this.setRotateAngle(cube_r12, 0.0F, 0.0F, -1.0472F);
        this.cube_r12.cubeList.add(new ModelBox(cube_r12, 15, 21, -1.0F, 0.01F, 0.0F, 1, 0, 1, 0.0F, false));

        this.cube_r13 = new AdvancedModelRenderer(this);
        this.cube_r13.setRotationPoint(2.0F, -0.25F, 0.0F);
        this.body2.addChild(cube_r13);
        this.setRotateAngle(cube_r13, 0.0F, 0.0F, 1.0472F);
        this.cube_r13.cubeList.add(new ModelBox(cube_r13, 21, 17, 0.0F, -0.01F, 0.0F, 1, 0, 1, 0.0F, false));

        this.legL3 = new AdvancedModelRenderer(this);
        this.legL3.setRotationPoint(0.5F, 0.75F, 0.5F);
        this.body2.addChild(legL3);
        this.legL3.cubeList.add(new ModelBox(legL3, 25, 16, 0.0F, 0.0F, 0.0F, 2, 2, 0, 0.0F, false));

        this.legR3 = new AdvancedModelRenderer(this);
        this.legR3.setRotationPoint(-0.5F, 0.75F, 0.5F);
        this.body2.addChild(legR3);
        this.legR3.cubeList.add(new ModelBox(legR3, 4, 25, -2.0F, 0.0F, 0.0F, 2, 2, 0, 0.0F, false));

        this.body3 = new AdvancedModelRenderer(this);
        this.body3.setRotationPoint(0.0F, 0.0F, 1.0F);
        this.body2.addChild(body3);
        this.body3.cubeList.add(new ModelBox(body3, 18, 18, -2.0F, -0.25F, 0.0F, 4, 1, 1, 0.0F, false));

        this.cube_r14 = new AdvancedModelRenderer(this);
        this.cube_r14.setRotationPoint(2.0F, -0.25F, 0.0F);
        this.body3.addChild(cube_r14);
        this.setRotateAngle(cube_r14, 0.0F, 0.0F, 1.0472F);
        this.cube_r14.cubeList.add(new ModelBox(cube_r14, 11, 21, 0.0F, 0.0F, 0.0F, 1, 0, 1, 0.0F, false));

        this.cube_r15 = new AdvancedModelRenderer(this);
        this.cube_r15.setRotationPoint(-2.0F, -0.25F, 0.0F);
        this.body3.addChild(cube_r15);
        this.setRotateAngle(cube_r15, 0.0F, 0.0F, -1.0472F);
        this.cube_r15.cubeList.add(new ModelBox(cube_r15, 13, 21, -1.0F, 0.0F, 0.0F, 1, 0, 1, 0.0F, false));

        this.cube_r16 = new AdvancedModelRenderer(this);
        this.cube_r16.setRotationPoint(0.0F, -0.25F, 3.0F);
        this.body3.addChild(cube_r16);
        this.setRotateAngle(cube_r16, 0.1309F, 0.0F, 0.0F);
        this.cube_r16.cubeList.add(new ModelBox(cube_r16, 0, 6, -1.0F, -0.5F, -2.981F, 2, 1, 1, 0.0F, false));

        this.legL4 = new AdvancedModelRenderer(this);
        this.legL4.setRotationPoint(0.5F, 0.75F, 0.5F);
        this.body3.addChild(legL4);
        this.legL4.cubeList.add(new ModelBox(legL4, 19, 24, 0.0F, 0.0F, 0.0F, 2, 2, 0, 0.0F, false));

        this.legR4 = new AdvancedModelRenderer(this);
        this.legR4.setRotationPoint(-0.5F, 0.75F, 0.5F);
        this.body3.addChild(legR4);
        this.legR4.cubeList.add(new ModelBox(legR4, 15, 24, -2.0F, 0.0F, 0.0F, 2, 2, 0, 0.0F, false));

        this.body4 = new AdvancedModelRenderer(this);
        this.body4.setRotationPoint(0.0F, 0.0F, 1.0F);
        this.body3.addChild(body4);
        this.body4.cubeList.add(new ModelBox(body4, 0, 18, -1.99F, -0.26F, 0.0F, 4, 1, 1, 0.0F, false));

        this.cube_r17 = new AdvancedModelRenderer(this);
        this.cube_r17.setRotationPoint(0.0F, -0.25F, 3.0F);
        this.body4.addChild(cube_r17);
        this.setRotateAngle(cube_r17, 0.1309F, 0.0F, 0.0F);
        this.cube_r17.cubeList.add(new ModelBox(cube_r17, 0, 4, -0.99F, -0.5F, -2.981F, 2, 1, 1, 0.0F, false));

        this.cube_r18 = new AdvancedModelRenderer(this);
        this.cube_r18.setRotationPoint(-2.0F, -0.25F, 0.0F);
        this.body4.addChild(cube_r18);
        this.setRotateAngle(cube_r18, 0.0F, 0.0F, -1.0472F);
        this.cube_r18.cubeList.add(new ModelBox(cube_r18, 20, 12, -1.0F, 0.01F, 0.0F, 1, 0, 1, 0.0F, false));

        this.cube_r19 = new AdvancedModelRenderer(this);
        this.cube_r19.setRotationPoint(2.0F, -0.25F, 0.0F);
        this.body4.addChild(cube_r19);
        this.setRotateAngle(cube_r19, 0.0F, 0.0F, 1.0472F);
        this.cube_r19.cubeList.add(new ModelBox(cube_r19, 0, 21, 0.0F, -0.01F, 0.0F, 1, 0, 1, 0.0F, false));

        this.legL5 = new AdvancedModelRenderer(this);
        this.legL5.setRotationPoint(0.5F, 0.75F, 0.5F);
        this.body4.addChild(legL5);
        this.legL5.cubeList.add(new ModelBox(legL5, 11, 24, 0.0F, 0.0F, 0.0F, 2, 2, 0, 0.0F, false));

        this.legR5 = new AdvancedModelRenderer(this);
        this.legR5.setRotationPoint(-0.5F, 0.75F, 0.5F);
        this.body4.addChild(legR5);
        this.legR5.cubeList.add(new ModelBox(legR5, 24, 10, -2.0F, 0.0F, 0.0F, 2, 2, 0, 0.0F, false));

        this.body5 = new AdvancedModelRenderer(this);
        this.body5.setRotationPoint(0.0F, 0.0F, 1.0F);
        this.body4.addChild(body5);
        this.body5.cubeList.add(new ModelBox(body5, 9, 17, -2.0F, -0.25F, 0.0F, 4, 1, 1, 0.0F, false));

        this.cube_r20 = new AdvancedModelRenderer(this);
        this.cube_r20.setRotationPoint(2.0F, -0.25F, 0.0F);
        this.body5.addChild(cube_r20);
        this.setRotateAngle(cube_r20, 0.0F, 0.0F, 1.0472F);
        this.cube_r20.cubeList.add(new ModelBox(cube_r20, 19, 17, 0.0F, 0.0F, 0.0F, 1, 0, 1, 0.0F, false));

        this.cube_r21 = new AdvancedModelRenderer(this);
        this.cube_r21.setRotationPoint(-2.0F, -0.25F, 0.0F);
        this.body5.addChild(cube_r21);
        this.setRotateAngle(cube_r21, 0.0F, 0.0F, -1.0472F);
        this.cube_r21.cubeList.add(new ModelBox(cube_r21, 0, 20, -1.0F, 0.0F, 0.0F, 1, 0, 1, 0.0F, false));

        this.cube_r22 = new AdvancedModelRenderer(this);
        this.cube_r22.setRotationPoint(0.0F, -0.25F, 3.0F);
        this.body5.addChild(cube_r22);
        this.setRotateAngle(cube_r22, 0.1309F, 0.0F, 0.0F);
        this.cube_r22.cubeList.add(new ModelBox(cube_r22, 0, 2, -1.0F, -0.5F, -2.981F, 2, 1, 1, 0.0F, false));

        this.legL6 = new AdvancedModelRenderer(this);
        this.legL6.setRotationPoint(0.5F, 0.75F, 0.5F);
        this.body5.addChild(legL6);
        this.legL6.cubeList.add(new ModelBox(legL6, 24, 8, 0.0F, 0.0F, 0.0F, 2, 2, 0, 0.0F, false));

        this.legR6 = new AdvancedModelRenderer(this);
        this.legR6.setRotationPoint(-0.5F, 0.75F, 0.5F);
        this.body5.addChild(legR6);
        this.legR6.cubeList.add(new ModelBox(legR6, 24, 6, -2.0F, 0.0F, 0.0F, 2, 2, 0, 0.0F, false));

        this.body6 = new AdvancedModelRenderer(this);
        this.body6.setRotationPoint(0.0F, 0.0F, 1.0F);
        this.body5.addChild(body6);
        this.body6.cubeList.add(new ModelBox(body6, 0, 16, -1.99F, -0.26F, 0.0F, 4, 1, 1, 0.0F, false));

        this.cube_r23 = new AdvancedModelRenderer(this);
        this.cube_r23.setRotationPoint(0.0F, -0.25F, 3.0F);
        this.body6.addChild(cube_r23);
        this.setRotateAngle(cube_r23, 0.1309F, 0.0F, 0.0F);
        this.cube_r23.cubeList.add(new ModelBox(cube_r23, 0, 0, -0.99F, -0.5F, -2.981F, 2, 1, 1, 0.0F, false));

        this.cube_r24 = new AdvancedModelRenderer(this);
        this.cube_r24.setRotationPoint(-2.0F, -0.25F, 0.0F);
        this.body6.addChild(cube_r24);
        this.setRotateAngle(cube_r24, 0.0F, 0.0F, -1.0472F);
        this.cube_r24.cubeList.add(new ModelBox(cube_r24, 12, 14, -1.0F, 0.01F, 0.0F, 1, 0, 1, 0.0F, false));

        this.cube_r25 = new AdvancedModelRenderer(this);
        this.cube_r25.setRotationPoint(2.0F, -0.25F, 0.0F);
        this.body6.addChild(cube_r25);
        this.setRotateAngle(cube_r25, 0.0F, 0.0F, 1.0472F);
        this.cube_r25.cubeList.add(new ModelBox(cube_r25, 17, 17, 0.0F, -0.01F, 0.0F, 1, 0, 1, 0.0F, false));

        this.legL7 = new AdvancedModelRenderer(this);
        this.legL7.setRotationPoint(0.5F, 0.75F, 0.5F);
        this.body6.addChild(legL7);
        this.legL7.cubeList.add(new ModelBox(legL7, 24, 4, 0.0F, 0.0F, 0.0F, 2, 2, 0, 0.0F, false));

        this.legR7 = new AdvancedModelRenderer(this);
        this.legR7.setRotationPoint(-0.5F, 0.75F, 0.5F);
        this.body6.addChild(legR7);
        this.legR7.cubeList.add(new ModelBox(legR7, 24, 2, -2.0F, 0.0F, 0.0F, 2, 2, 0, 0.0F, false));

        this.body7 = new AdvancedModelRenderer(this);
        this.body7.setRotationPoint(0.0F, 0.0F, 1.0F);
        this.body6.addChild(body7);
        this.body7.cubeList.add(new ModelBox(body7, 12, 22, -1.5F, -0.25F, 0.0F, 3, 1, 1, 0.0F, false));

        this.cube_r26 = new AdvancedModelRenderer(this);
        this.cube_r26.setRotationPoint(2.0F, -0.25F, 0.0F);
        this.body7.addChild(cube_r26);
        this.setRotateAngle(cube_r26, 0.0F, 0.0F, 1.0472F);
        this.cube_r26.cubeList.add(new ModelBox(cube_r26, 12, 13, -0.25F, 0.5F, 0.0F, 1, 0, 1, 0.0F, false));

        this.cube_r27 = new AdvancedModelRenderer(this);
        this.cube_r27.setRotationPoint(-2.0F, -0.25F, 0.0F);
        this.body7.addChild(cube_r27);
        this.setRotateAngle(cube_r27, 0.0F, 0.0F, -1.0472F);
        this.cube_r27.cubeList.add(new ModelBox(cube_r27, 0, 14, -0.75F, 0.5F, 0.0F, 1, 0, 1, 0.0F, false));

        this.cube_r28 = new AdvancedModelRenderer(this);
        this.cube_r28.setRotationPoint(-0.5F, -0.25F, 3.0F);
        this.body7.addChild(cube_r28);
        this.setRotateAngle(cube_r28, 0.1309F, 0.0F, 0.0F);
        this.cube_r28.cubeList.add(new ModelBox(cube_r28, 23, 23, 0.0F, -0.5F, -2.981F, 1, 1, 1, 0.0F, false));

        this.legL8 = new AdvancedModelRenderer(this);
        this.legL8.setRotationPoint(0.25F, 0.75F, 0.5F);
        this.body7.addChild(legL8);
        this.legL8.cubeList.add(new ModelBox(legL8, 24, 0, 0.0F, 0.0F, 0.0F, 2, 2, 0, 0.0F, false));

        this.legR8 = new AdvancedModelRenderer(this);
        this.legR8.setRotationPoint(-0.25F, 0.75F, 0.5F);
        this.body7.addChild(legR8);
        this.legR8.cubeList.add(new ModelBox(legR8, 0, 24, -2.0F, 0.0F, 0.0F, 2, 2, 0, 0.0F, false));

        this.body8 = new AdvancedModelRenderer(this);
        this.body8.setRotationPoint(0.0F, 0.0F, 1.0F);
        this.body7.addChild(body8);
        this.body8.cubeList.add(new ModelBox(body8, 5, 21, -1.49F, -0.26F, 0.0F, 3, 1, 1, 0.0F, false));

        this.cube_r29 = new AdvancedModelRenderer(this);
        this.cube_r29.setRotationPoint(-0.5F, -0.25F, 3.0F);
        this.body8.addChild(cube_r29);
        this.setRotateAngle(cube_r29, 0.1309F, 0.0F, 0.0F);
        this.cube_r29.cubeList.add(new ModelBox(cube_r29, 7, 23, 0.01F, -0.5F, -2.981F, 1, 1, 1, 0.0F, false));

        this.cube_r30 = new AdvancedModelRenderer(this);
        this.cube_r30.setRotationPoint(-2.0F, -0.25F, 0.0F);
        this.body8.addChild(cube_r30);
        this.setRotateAngle(cube_r30, 0.0F, 0.0F, -1.0472F);
        this.cube_r30.cubeList.add(new ModelBox(cube_r30, 0, 12, -0.75F, 0.51F, 0.0F, 1, 0, 1, 0.0F, false));

        this.cube_r31 = new AdvancedModelRenderer(this);
        this.cube_r31.setRotationPoint(2.0F, -0.25F, 0.0F);
        this.body8.addChild(cube_r31);
        this.setRotateAngle(cube_r31, 0.0F, 0.0F, 1.0472F);
        this.cube_r31.cubeList.add(new ModelBox(cube_r31, 0, 13, -0.25F, 0.49F, 0.0F, 1, 0, 1, 0.0F, false));

        this.legL9 = new AdvancedModelRenderer(this);
        this.legL9.setRotationPoint(0.25F, 0.75F, 0.5F);
        this.body8.addChild(legL9);
        this.legL9.cubeList.add(new ModelBox(legL9, 20, 22, 0.0F, 0.0F, 0.0F, 2, 2, 0, 0.0F, false));

        this.legR9 = new AdvancedModelRenderer(this);
        this.legR9.setRotationPoint(-0.25F, 0.75F, 0.5F);
        this.body8.addChild(legR9);
        this.legR9.cubeList.add(new ModelBox(legR9, 22, 14, -2.0F, 0.0F, 0.0F, 2, 2, 0, 0.0F, false));

        this.tail = new AdvancedModelRenderer(this);
        this.tail.setRotationPoint(0.0F, 0.25F, 1.0F);
        this.body8.addChild(tail);
        this.tail.cubeList.add(new ModelBox(tail, 0, 20, -0.5F, -0.5F, 0.0F, 1, 1, 3, 0.0F, false));

        updateDefaultPose();
    }

    @Override
    public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        this.head.render(f5 * 0.18F);
    }
    public void renderStatic(float f) {
        GlStateManager.pushMatrix();
        GlStateManager.enableBlend();
        GlStateManager.blendFunc(GlStateManager.SourceFactor.SRC_ALPHA, GlStateManager.DestFactor.ONE_MINUS_SRC_ALPHA);
        this.head.render(0.01F);
        GlStateManager.disableBlend();
        GlStateManager.popMatrix();
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
        this.head.offsetY = 1.2F;

        float speed = 0.4F * 0.2F;
        float tailVdegree = 0.75F * 0.2F;
        float tailHdegree = 0.0F * 0.2F;
        float tailSwing = 0.75F * 0.2F;

        boolean isAtBottom = false;
        if (e.getPosition().getY() - 1 > 1) {
            BlockPos pos = new BlockPos(e.getPosition().getX(), e.getPosition().getY() - 1, e.getPosition().getZ());
            isAtBottom = ((e.isInsideOfMaterial(Material.WATER) || e.isInsideOfMaterial(Material.CORAL))
                    && ((e.world.getBlockState(pos)).getMaterial() != Material.WATER)
                    && ((double)e.getPosition().getY() + 0.334D) > e.posY);
        }

        if (isAtBottom) {
            //System.err.println("Animation at bottom");
            speed = 0.25F * 0.2F;
            tailVdegree = 0.075F * 0.2F;
            tailHdegree = 0.3F * 0.2F;
            tailSwing = 0.6F * 0.2F;
        }
        if (!e.isInWater()) {
            speed = 0.7F * 0.2F;
        }

        AdvancedModelRenderer[] legsL = {this.legL, this.legL2, this.legL3, this.legL4, this.legL5, this.legL6, this.legL7, this.legL8, this.legL9};
        AdvancedModelRenderer[] legsR = {this.legR, this.legR2, this.legR3, this.legR4, this.legR5, this.legR6, this.legR7, this.legR8, this.legR9};
        AdvancedModelRenderer[] bodyF = {this.body4,this.body5,this.body6,this.body7};
        AdvancedModelRenderer[] fishTail = {this.body2, this.body3, this.body4, this.body5, this.body6, this.body7, this.body8, this.tail};
        AdvancedModelRenderer[] pincerL = {this.appendageL, this.appendageL2, this.appendageL3, this.appendageL4, this.appendageL5};
        AdvancedModelRenderer[] pincerR = {this.appendageR, this.appendageR2, this.appendageR3, this.appendageR4, this.appendageR5};

        this.chainWave(fishTail, speed, tailVdegree * 0.3f, -3, f2, 1);
        this.chainSwing(fishTail, speed, tailHdegree, -2.5, f2, tailSwing);

        this.chainSwing(pincerL, speed * 3F, -0.1F, 0.5F, f2, 0.1F);
        this.chainSwing(pincerR, speed *  3F, 0.1F, 0.5F, f2, 0.1F);
        this.swing(appendageL, speed * 3F, -0.7F, false, 0, 1.15F, f2, 0.5F);
        this.swing(appendageR, speed * 3F, 0.7F, false, 0, -1.15F, f2, 0.5F);

        if (isAtBottom && e.isInWater()) {
            if (f3 != 0.0) {
                this.chainWave(legsL, 0.2F, 0.2F, -3, f2, 1);
                this.chainWave(legsR, 0.6F, 0.2F, -3, f2, 1);
                this.flap(legL, 0.5F, -0.5F, false, 0, -0.5F, f2, 0.3F);
                this.flap(legR, 0.5F, 0.5F, false, 0, 0.5F, f2, 0.3F);
                this.flap(legL2, 0.5F, -0.5F, false, 1.0F, -0.5F, f2, 0.3F);
                this.flap(legR2, 0.5F, 0.5F, false, 1.0F, 0.5F, f2, 0.3F);
                this.flap(legL3, 0.5F, -0.5F, false, 2.0F, -0.5F, f2, 0.3F);
                this.flap(legR3, 0.5F, 0.5F, false, 2.0F, 0.5F, f2, 0.3F);
                this.flap(legL4, 0.5F, -0.5F, false, 3.0F, -0.5F, f2, 0.3F);
                this.flap(legR4, 0.5F, 0.5F, false, 3.0F, 0.5F, f2, 0.3F);
                this.flap(legL5, 0.5F, -0.5F, false, 4.0F, -0.5F, f2, 0.3F);
                this.flap(legR5, 0.5F, 0.5F, false, 4.0F, 0.5F, f2, 0.3F);
                this.flap(legL6, 0.5F, -0.5F, false, 5.0F, -0.5F, f2, 0.3F);
                this.flap(legR6, 0.5F, 0.5F, false, 5.0F, 0.5F, f2, 0.3F);
                this.flap(legL7, 0.5F, -0.5F, false, 6.0F, -0.5F, f2, 0.3F);
                this.flap(legR7, 0.5F, 0.5F, false, 6.0F, 0.5F, f2, 0.3F);
                this.flap(legL8, 0.5F, -0.5F, false, 7.0F, -0.5F, f2, 0.3F);
                this.flap(legR8, 0.5F, 0.5F, false, 7.0F, 0.5F, f2, 0.3F);
                this.flap(legL9, 0.5F, -0.5F, false, 8.0F, -0.5F, f2, 0.3F);
                this.flap(legR9, 0.5F, 0.5F, false, 8.0F, 0.5F, f2, 0.3F);
                //this.bob(head, -speed, 1.5F, false, f2, 2);
                this.walk(body6, 0.8F, -0.015f, false, 2, 0.2F, f2, 1F);
                this.chainWave(bodyF, 0.8F, 0.03f, 0.5, f2, 0.4F);
            }
            this.chainSwing(bodyF, 0.1F, 0.1F, -3, f2, 1.0F);
        }
        else if (e.isInWater()) {
            this.chainWave(legsL, 0.2F, 0.2F, -3, f2, 1);
            this.chainWave(legsR, 0.25F, 0.2F, -3, f2, 1);
            this.flap(legL, 0.2F, -0.5F, false, 0, -0.5F, f2, 0.3F);
            this.flap(legR, 0.2F, 0.5F, false, 0, 0.5F, f2, 0.3F);
            this.flap(legL2, 0.2F, -0.5F, false, 1.0F, -0.5F, f2, 0.3F);
            this.flap(legR2, 0.2F, 0.5F, false, 1.0F, 0.5F, f2, 0.3F);
            this.flap(legL3, 0.2F, -0.5F, false, 2.0F, -0.5F, f2, 0.3F);
            this.flap(legR3, 0.2F, 0.5F, false, 2.0F, 0.5F, f2, 0.3F);
            this.flap(legL4, 0.2F, -0.5F, false, 3.0F, -0.5F, f2, 0.3F);
            this.flap(legR4, 0.2F, 0.5F, false, 3.0F, 0.5F, f2, 0.3F);
            this.flap(legL5, 0.2F, -0.5F, false, 4.0F, -0.5F, f2, 0.3F);
            this.flap(legR5, 0.2F, 0.5F, false, 4.0F, 0.5F, f2, 0.3F);
            this.flap(legL6, 0.2F, -0.5F, false, 8.0F, -0.5F, f2, 0.3F);
            this.flap(legR6, 0.2F, 0.5F, false, 8.0F, 0.5F, f2, 0.3F);
            this.flap(legL7, 0.2F, -0.5F, false, 6.0F, -0.5F, f2, 0.3F);
            this.flap(legR7, 0.2F, 0.5F, false, 6.0F, 0.5F, f2, 0.3F);
            this.flap(legL8, 0.2F, -0.5F, false, 7.0F, -0.5F, f2, 0.3F);
            this.flap(legR8, 0.2F, 0.5F, false, 7.0F, 0.5F, f2, 0.3F);
            this.flap(legL9, 0.2F, -0.5F, false, 8.0F, -0.5F, f2, 0.3F);
            this.flap(legR9, 0.2F, 0.5F, false, 8.0F, 0.5F, f2, 0.3F);
            this.chainSwing(bodyF, 0.2F, 0.2F, -3, f2, 0.5F);
            this.chainWave(bodyF, 0.5F, 0.3f, -3, f2, 0.8F);
            //this.bob(head, 0.2F, 0.2F, false, f2, 1);
        }

        this.swing(antennaL, 0.92F, -0.2F, false, 0, -0.1F, f2, 0.8F);
        this.swing(antennaR, 0.92F, 0.2F, false, 0, 0.1F, f2, 0.8F);

        if (!e.isInWater()) {
            //this.Bodyfront.rotateAngleZ = (float) Math.toRadians(90);
            this.head.offsetY = 1.2F;
            this.bob(head, -speed * 3F, 2F, false, f2, 1);
            this.chainWave(fishTail, speed * 4F, tailHdegree * 3F, -3, f2, 1);
            this.chainSwing(fishTail, speed * 4F, tailVdegree * 3F, -3, f2, 1);
        }

    }
}
