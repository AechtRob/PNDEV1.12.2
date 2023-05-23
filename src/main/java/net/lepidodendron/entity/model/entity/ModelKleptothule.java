package net.lepidodendron.entity.model.entity;

import net.ilexiconn.llibrary.client.model.tools.AdvancedModelBase;
import net.ilexiconn.llibrary.client.model.tools.AdvancedModelRenderer;
import net.minecraft.block.material.Material;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLiving;
import net.minecraft.util.math.BlockPos;

public class ModelKleptothule extends AdvancedModelBase {
    private final AdvancedModelRenderer Kleptothule;
    private final AdvancedModelRenderer cube_r1;
    private final AdvancedModelRenderer cube_r2;
    private final AdvancedModelRenderer leftLeg1;
    private final AdvancedModelRenderer rightLeg1;
    private final AdvancedModelRenderer leftLeg2;
    private final AdvancedModelRenderer rightLeg2;
    private final AdvancedModelRenderer head;
    private final AdvancedModelRenderer cube_r3;
    private final AdvancedModelRenderer cube_r4;
    private final AdvancedModelRenderer leftfrontAntennae;
    private final AdvancedModelRenderer rightfrontAntennae;
    private final AdvancedModelRenderer body2;
    private final AdvancedModelRenderer cube_r5;
    private final AdvancedModelRenderer cube_r6;
    private final AdvancedModelRenderer leftLeg3;
    private final AdvancedModelRenderer rightLeg3;
    private final AdvancedModelRenderer leftLeg4;
    private final AdvancedModelRenderer rightLeg4;
    private final AdvancedModelRenderer body3;
    private final AdvancedModelRenderer cube_r7;
    private final AdvancedModelRenderer cube_r8;
    private final AdvancedModelRenderer leftLeg5;
    private final AdvancedModelRenderer rightLeg5;
    private final AdvancedModelRenderer leftLeg6;
    private final AdvancedModelRenderer rightLeg6;
    private final AdvancedModelRenderer body4;
    private final AdvancedModelRenderer cube_r9;
    private final AdvancedModelRenderer cube_r10;
    private final AdvancedModelRenderer leftLeg7;
    private final AdvancedModelRenderer rightLeg7;
    private final AdvancedModelRenderer leftLeg8;
    private final AdvancedModelRenderer rightLeg8;
    private final AdvancedModelRenderer body5;
    private final AdvancedModelRenderer cube_r11;
    private final AdvancedModelRenderer cube_r12;
    private final AdvancedModelRenderer leftLeg9;
    private final AdvancedModelRenderer rightLeg9;
    private final AdvancedModelRenderer leftLeg10;
    private final AdvancedModelRenderer rightLeg10;
    private final AdvancedModelRenderer body6;
    private final AdvancedModelRenderer cube_r13;
    private final AdvancedModelRenderer cube_r14;
    private final AdvancedModelRenderer leftLeg11;
    private final AdvancedModelRenderer rightLeg11;
    private final AdvancedModelRenderer leftLeg12;
    private final AdvancedModelRenderer rightLeg12;
    private final AdvancedModelRenderer body7;
    private final AdvancedModelRenderer cube_r15;
    private final AdvancedModelRenderer cube_r16;
    private final AdvancedModelRenderer leftLeg13;
    private final AdvancedModelRenderer rightLeg13;
    private final AdvancedModelRenderer leftLeg14;
    private final AdvancedModelRenderer rightLeg14;
    private final AdvancedModelRenderer body8;
    private final AdvancedModelRenderer cube_r17;
    private final AdvancedModelRenderer cube_r18;
    private final AdvancedModelRenderer leftLeg15;
    private final AdvancedModelRenderer rightLeg15;
    private final AdvancedModelRenderer leftLeg16;
    private final AdvancedModelRenderer rightLeg16;
    private final AdvancedModelRenderer body9;
    private final AdvancedModelRenderer cube_r19;
    private final AdvancedModelRenderer cube_r20;
    private final AdvancedModelRenderer leftLeg17;
    private final AdvancedModelRenderer rightLeg17;
    private final AdvancedModelRenderer leftLeg18;
    private final AdvancedModelRenderer rightLeg18;
    private final AdvancedModelRenderer body10;
    private final AdvancedModelRenderer cube_r21;
    private final AdvancedModelRenderer cube_r22;
    private final AdvancedModelRenderer leftLeg19;
    private final AdvancedModelRenderer rightLeg19;
    private final AdvancedModelRenderer leftLeg20;
    private final AdvancedModelRenderer rightLeg20;
    private final AdvancedModelRenderer pygidium;
    private final AdvancedModelRenderer cube_r23;
    private final AdvancedModelRenderer cube_r24;
    private final AdvancedModelRenderer leftbackAntennae;
    private final AdvancedModelRenderer rightbackAntennae;

    public ModelKleptothule() {
        this.textureWidth = 32;
        this.textureHeight = 32;

        this.Kleptothule = new AdvancedModelRenderer(this);
        this.Kleptothule.setRotationPoint(0.0F, 22.5F, -3.0F);
        this.Kleptothule.cubeList.add(new ModelBox(Kleptothule, 7, 28, -0.5F, -0.5F, 0.0F, 1, 1, 2, 0.0F, false));

        this.cube_r1 = new AdvancedModelRenderer(this);
        this.cube_r1.setRotationPoint(-0.5F, -0.25F, 3.0F);
        this.Kleptothule.addChild(cube_r1);
        this.setRotateAngle(cube_r1, 0.0F, 0.0F, -0.3927F);
        this.cube_r1.cubeList.add(new ModelBox(cube_r1, 9, 18, -2.0F, 0.0F, -3.0F, 2, 0, 2, 0.0F, true));

        this.cube_r2 = new AdvancedModelRenderer(this);
        this.cube_r2.setRotationPoint(0.5F, -0.25F, 3.0F);
        this.Kleptothule.addChild(cube_r2);
        this.setRotateAngle(cube_r2, 0.0F, 0.0F, 0.3927F);
        this.cube_r2.cubeList.add(new ModelBox(cube_r2, 9, 18, 0.0F, 0.0F, -3.0F, 2, 0, 2, 0.0F, false));

        this.leftLeg1 = new AdvancedModelRenderer(this);
        this.leftLeg1.setRotationPoint(0.5F, 0.0F, 0.5F);
        this.Kleptothule.addChild(leftLeg1);
        this.setRotateAngle(leftLeg1, 0.0F, 0.0F, 0.3927F);
        this.leftLeg1.cubeList.add(new ModelBox(leftLeg1, 0, 8, 0.0F, 0.0F, 0.0F, 2, 1, 0, 0.0F, false));

        this.rightLeg1 = new AdvancedModelRenderer(this);
        this.rightLeg1.setRotationPoint(-0.5F, 0.0F, 0.5F);
        this.Kleptothule.addChild(rightLeg1);
        this.setRotateAngle(rightLeg1, 0.0F, 0.0F, -0.3927F);
        this.rightLeg1.cubeList.add(new ModelBox(rightLeg1, 0, 8, -2.0F, 0.0F, 0.0F, 2, 1, 0, 0.0F, true));

        this.leftLeg2 = new AdvancedModelRenderer(this);
        this.leftLeg2.setRotationPoint(0.5F, 0.0F, 1.5F);
        this.Kleptothule.addChild(leftLeg2);
        this.setRotateAngle(leftLeg2, 0.0F, 0.0F, 0.3927F);
        this.leftLeg2.cubeList.add(new ModelBox(leftLeg2, 0, 8, 0.0F, 0.0F, 0.0F, 2, 1, 0, 0.0F, false));

        this.rightLeg2 = new AdvancedModelRenderer(this);
        this.rightLeg2.setRotationPoint(-0.5F, 0.0F, 1.5F);
        this.Kleptothule.addChild(rightLeg2);
        this.setRotateAngle(rightLeg2, 0.0F, 0.0F, -0.3927F);
        this.rightLeg2.cubeList.add(new ModelBox(rightLeg2, 0, 8, -2.0F, 0.0F, 0.0F, 2, 1, 0, 0.0F, true));

        this.head = new AdvancedModelRenderer(this);
        this.head.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.Kleptothule.addChild(head);
        this.setRotateAngle(head, 0.1745F, 0.0F, 0.0F);
        this.head.cubeList.add(new ModelBox(head, 0, 16, -0.5F, -0.5F, -3.0F, 1, 1, 3, 0.01F, false));
        this.head.cubeList.add(new ModelBox(head, 0, 4, -0.5F, -0.25F, -5.0F, 1, 0, 2, 0.0F, false));

        this.cube_r3 = new AdvancedModelRenderer(this);
        this.cube_r3.setRotationPoint(-0.5F, -0.25F, 0.0F);
        this.head.addChild(cube_r3);
        this.setRotateAngle(cube_r3, 0.0F, 0.0F, -0.2618F);
        this.cube_r3.cubeList.add(new ModelBox(cube_r3, 9, 8, -2.0F, 0.0F, -5.0F, 2, 0, 5, 0.0F, true));

        this.cube_r4 = new AdvancedModelRenderer(this);
        this.cube_r4.setRotationPoint(0.5F, -0.25F, 0.0F);
        this.head.addChild(cube_r4);
        this.setRotateAngle(cube_r4, 0.0F, 0.0F, 0.2618F);
        this.cube_r4.cubeList.add(new ModelBox(cube_r4, 9, 8, 0.0F, 0.0F, -5.0F, 2, 0, 5, 0.0F, false));

        this.leftfrontAntennae = new AdvancedModelRenderer(this);
        this.leftfrontAntennae.setRotationPoint(0.5F, 0.25F, -3.0F);
        this.head.addChild(leftfrontAntennae);
        this.leftfrontAntennae.cubeList.add(new ModelBox(leftfrontAntennae, 14, 0, 0.0F, 0.0F, -4.0F, 2, 0, 4, 0.0F, false));

        this.rightfrontAntennae = new AdvancedModelRenderer(this);
        this.rightfrontAntennae.setRotationPoint(-0.5F, 0.25F, -3.0F);
        this.head.addChild(rightfrontAntennae);
        this.rightfrontAntennae.cubeList.add(new ModelBox(rightfrontAntennae, 14, 0, -2.0F, 0.0F, -4.0F, 2, 0, 4, 0.0F, true));

        this.body2 = new AdvancedModelRenderer(this);
        this.body2.setRotationPoint(0.0F, 0.0F, 2.0F);
        this.Kleptothule.addChild(body2);
        this.body2.cubeList.add(new ModelBox(body2, 0, 27, -0.5F, -0.5F, 0.0F, 1, 1, 2, -0.01F, false));

        this.cube_r5 = new AdvancedModelRenderer(this);
        this.cube_r5.setRotationPoint(-0.5F, -0.25F, 3.0F);
        this.body2.addChild(cube_r5);
        this.setRotateAngle(cube_r5, 0.0F, 0.0F, -0.3927F);
        this.cube_r5.cubeList.add(new ModelBox(cube_r5, 18, 18, -2.0F, 0.0F, -3.0F, 2, 0, 2, 0.0F, true));

        this.cube_r6 = new AdvancedModelRenderer(this);
        this.cube_r6.setRotationPoint(0.5F, -0.25F, 3.0F);
        this.body2.addChild(cube_r6);
        this.setRotateAngle(cube_r6, 0.0F, 0.0F, 0.3927F);
        this.cube_r6.cubeList.add(new ModelBox(cube_r6, 18, 18, 0.0F, 0.0F, -3.0F, 2, 0, 2, 0.0F, false));

        this.leftLeg3 = new AdvancedModelRenderer(this);
        this.leftLeg3.setRotationPoint(0.5F, 0.0F, 0.5F);
        this.body2.addChild(leftLeg3);
        this.setRotateAngle(leftLeg3, 0.0F, 0.0F, 0.3927F);
        this.leftLeg3.cubeList.add(new ModelBox(leftLeg3, 0, 8, 0.0F, 0.0F, 0.0F, 2, 1, 0, 0.0F, false));

        this.rightLeg3 = new AdvancedModelRenderer(this);
        this.rightLeg3.setRotationPoint(-0.5F, 0.0F, 0.5F);
        this.body2.addChild(rightLeg3);
        this.setRotateAngle(rightLeg3, 0.0F, 0.0F, -0.3927F);
        this.rightLeg3.cubeList.add(new ModelBox(rightLeg3, 0, 8, -2.0F, 0.0F, 0.0F, 2, 1, 0, 0.0F, true));

        this.leftLeg4 = new AdvancedModelRenderer(this);
        this.leftLeg4.setRotationPoint(0.5F, 0.0F, 1.5F);
        this.body2.addChild(leftLeg4);
        this.setRotateAngle(leftLeg4, 0.0F, 0.0F, 0.3927F);
        this.leftLeg4.cubeList.add(new ModelBox(leftLeg4, 0, 8, 0.0F, 0.0F, 0.0F, 2, 1, 0, 0.0F, false));

        this.rightLeg4 = new AdvancedModelRenderer(this);
        this.rightLeg4.setRotationPoint(-0.5F, 0.0F, 1.5F);
        this.body2.addChild(rightLeg4);
        this.setRotateAngle(rightLeg4, 0.0F, 0.0F, -0.3927F);
        this.rightLeg4.cubeList.add(new ModelBox(rightLeg4, 0, 8, -2.0F, 0.0F, 0.0F, 2, 1, 0, 0.0F, true));

        this.body3 = new AdvancedModelRenderer(this);
        this.body3.setRotationPoint(0.0F, 0.0F, 2.0F);
        this.body2.addChild(body3);
        this.body3.cubeList.add(new ModelBox(body3, 26, 7, -0.5F, -0.5F, 0.0F, 1, 1, 2, 0.0F, false));

        this.cube_r7 = new AdvancedModelRenderer(this);
        this.cube_r7.setRotationPoint(-0.5F, -0.25F, 3.0F);
        this.body3.addChild(cube_r7);
        this.setRotateAngle(cube_r7, 0.0F, 0.0F, -0.3927F);
        this.cube_r7.cubeList.add(new ModelBox(cube_r7, 19, 6, -2.0F, 0.0F, -3.0F, 2, 0, 2, 0.0F, true));

        this.cube_r8 = new AdvancedModelRenderer(this);
        this.cube_r8.setRotationPoint(0.5F, -0.25F, 3.0F);
        this.body3.addChild(cube_r8);
        this.setRotateAngle(cube_r8, 0.0F, 0.0F, 0.3927F);
        this.cube_r8.cubeList.add(new ModelBox(cube_r8, 19, 6, 0.0F, 0.0F, -3.0F, 2, 0, 2, 0.0F, false));

        this.leftLeg5 = new AdvancedModelRenderer(this);
        this.leftLeg5.setRotationPoint(0.5F, 0.0F, 0.5F);
        this.body3.addChild(leftLeg5);
        this.setRotateAngle(leftLeg5, 0.0F, 0.0F, 0.3927F);
        this.leftLeg5.cubeList.add(new ModelBox(leftLeg5, 0, 8, 0.0F, 0.0F, 0.0F, 2, 1, 0, 0.0F, false));

        this.rightLeg5 = new AdvancedModelRenderer(this);
        this.rightLeg5.setRotationPoint(-0.5F, 0.0F, 0.5F);
        this.body3.addChild(rightLeg5);
        this.setRotateAngle(rightLeg5, 0.0F, 0.0F, -0.3927F);
        this.rightLeg5.cubeList.add(new ModelBox(rightLeg5, 0, 8, -2.0F, 0.0F, 0.0F, 2, 1, 0, 0.0F, true));

        this.leftLeg6 = new AdvancedModelRenderer(this);
        this.leftLeg6.setRotationPoint(0.5F, 0.0F, 1.5F);
        this.body3.addChild(leftLeg6);
        this.setRotateAngle(leftLeg6, 0.0F, 0.0F, 0.3927F);
        this.leftLeg6.cubeList.add(new ModelBox(leftLeg6, 0, 8, 0.0F, 0.0F, 0.0F, 2, 1, 0, 0.0F, false));

        this.rightLeg6 = new AdvancedModelRenderer(this);
        this.rightLeg6.setRotationPoint(-0.5F, 0.0F, 1.5F);
        this.body3.addChild(rightLeg6);
        this.setRotateAngle(rightLeg6, 0.0F, 0.0F, -0.3927F);
        this.rightLeg6.cubeList.add(new ModelBox(rightLeg6, 0, 8, -2.0F, 0.0F, 0.0F, 2, 1, 0, 0.0F, true));

        this.body4 = new AdvancedModelRenderer(this);
        this.body4.setRotationPoint(0.0F, 0.0F, 2.0F);
        this.body3.addChild(body4);
        this.body4.cubeList.add(new ModelBox(body4, 26, 3, -0.5F, -0.5F, 0.0F, 1, 1, 2, -0.01F, false));

        this.cube_r9 = new AdvancedModelRenderer(this);
        this.cube_r9.setRotationPoint(-0.5F, -0.25F, 3.0F);
        this.body4.addChild(cube_r9);
        this.setRotateAngle(cube_r9, 0.0F, 0.0F, -0.3927F);
        this.cube_r9.cubeList.add(new ModelBox(cube_r9, 0, 21, -2.0F, 0.0F, -3.0F, 2, 0, 2, 0.0F, true));

        this.cube_r10 = new AdvancedModelRenderer(this);
        this.cube_r10.setRotationPoint(0.5F, -0.25F, 3.0F);
        this.body4.addChild(cube_r10);
        this.setRotateAngle(cube_r10, 0.0F, 0.0F, 0.3927F);
        this.cube_r10.cubeList.add(new ModelBox(cube_r10, 0, 21, 0.0F, 0.0F, -3.0F, 2, 0, 2, 0.0F, false));

        this.leftLeg7 = new AdvancedModelRenderer(this);
        this.leftLeg7.setRotationPoint(0.5F, 0.0F, 0.5F);
        this.body4.addChild(leftLeg7);
        this.setRotateAngle(leftLeg7, 0.0F, 0.0F, 0.3927F);
        this.leftLeg7.cubeList.add(new ModelBox(leftLeg7, 0, 8, 0.0F, 0.0F, 0.0F, 2, 1, 0, 0.0F, false));

        this.rightLeg7 = new AdvancedModelRenderer(this);
        this.rightLeg7.setRotationPoint(-0.5F, 0.0F, 0.5F);
        this.body4.addChild(rightLeg7);
        this.setRotateAngle(rightLeg7, 0.0F, 0.0F, -0.3927F);
        this.rightLeg7.cubeList.add(new ModelBox(rightLeg7, 0, 8, -2.0F, 0.0F, 0.0F, 2, 1, 0, 0.0F, true));

        this.leftLeg8 = new AdvancedModelRenderer(this);
        this.leftLeg8.setRotationPoint(0.5F, 0.0F, 1.5F);
        this.body4.addChild(leftLeg8);
        this.setRotateAngle(leftLeg8, 0.0F, 0.0F, 0.3927F);
        this.leftLeg8.cubeList.add(new ModelBox(leftLeg8, 0, 8, 0.0F, 0.0F, 0.0F, 2, 1, 0, 0.0F, false));

        this.rightLeg8 = new AdvancedModelRenderer(this);
        this.rightLeg8.setRotationPoint(-0.5F, 0.0F, 1.5F);
        this.body4.addChild(rightLeg8);
        this.setRotateAngle(rightLeg8, 0.0F, 0.0F, -0.3927F);
        this.rightLeg8.cubeList.add(new ModelBox(rightLeg8, 0, 8, -2.0F, 0.0F, 0.0F, 2, 1, 0, 0.0F, true));

        this.body5 = new AdvancedModelRenderer(this);
        this.body5.setRotationPoint(0.0F, 0.0F, 2.0F);
        this.body4.addChild(body5);
        this.body5.cubeList.add(new ModelBox(body5, 25, 19, -0.5F, -0.5F, 0.0F, 1, 1, 2, 0.0F, false));

        this.cube_r11 = new AdvancedModelRenderer(this);
        this.cube_r11.setRotationPoint(-0.5F, -0.25F, 3.0F);
        this.body5.addChild(cube_r11);
        this.setRotateAngle(cube_r11, 0.0F, 0.0F, -0.3927F);
        this.cube_r11.cubeList.add(new ModelBox(cube_r11, 19, 9, -2.0F, 0.0F, -3.0F, 2, 0, 2, 0.0F, true));

        this.cube_r12 = new AdvancedModelRenderer(this);
        this.cube_r12.setRotationPoint(0.5F, -0.25F, 3.0F);
        this.body5.addChild(cube_r12);
        this.setRotateAngle(cube_r12, 0.0F, 0.0F, 0.3927F);
        this.cube_r12.cubeList.add(new ModelBox(cube_r12, 19, 9, 0.0F, 0.0F, -3.0F, 2, 0, 2, 0.0F, false));

        this.leftLeg9 = new AdvancedModelRenderer(this);
        this.leftLeg9.setRotationPoint(0.5F, 0.0F, 0.5F);
        this.body5.addChild(leftLeg9);
        this.setRotateAngle(leftLeg9, 0.0F, 0.0F, 0.3927F);
        this.leftLeg9.cubeList.add(new ModelBox(leftLeg9, 0, 8, 0.0F, 0.0F, 0.0F, 2, 1, 0, 0.0F, false));

        this.rightLeg9 = new AdvancedModelRenderer(this);
        this.rightLeg9.setRotationPoint(-0.5F, 0.0F, 0.5F);
        this.body5.addChild(rightLeg9);
        this.setRotateAngle(rightLeg9, 0.0F, 0.0F, -0.3927F);
        this.rightLeg9.cubeList.add(new ModelBox(rightLeg9, 0, 8, -2.0F, 0.0F, 0.0F, 2, 1, 0, 0.0F, true));

        this.leftLeg10 = new AdvancedModelRenderer(this);
        this.leftLeg10.setRotationPoint(0.5F, 0.0F, 1.5F);
        this.body5.addChild(leftLeg10);
        this.setRotateAngle(leftLeg10, 0.0F, 0.0F, 0.3927F);
        this.leftLeg10.cubeList.add(new ModelBox(leftLeg10, 0, 8, 0.0F, 0.0F, 0.0F, 2, 1, 0, 0.0F, false));

        this.rightLeg10 = new AdvancedModelRenderer(this);
        this.rightLeg10.setRotationPoint(-0.5F, 0.0F, 1.5F);
        this.body5.addChild(rightLeg10);
        this.setRotateAngle(rightLeg10, 0.0F, 0.0F, -0.3927F);
        this.rightLeg10.cubeList.add(new ModelBox(rightLeg10, 0, 8, -2.0F, 0.0F, 0.0F, 2, 1, 0, 0.0F, true));

        this.body6 = new AdvancedModelRenderer(this);
        this.body6.setRotationPoint(0.0F, 0.0F, 2.0F);
        this.body5.addChild(body6);
        this.body6.cubeList.add(new ModelBox(body6, 25, 15, -0.5F, -0.5F, 0.0F, 1, 1, 2, -0.01F, false));

        this.cube_r13 = new AdvancedModelRenderer(this);
        this.cube_r13.setRotationPoint(-0.5F, -0.25F, 3.0F);
        this.body6.addChild(cube_r13);
        this.setRotateAngle(cube_r13, 0.0F, 0.0F, -0.3927F);
        this.cube_r13.cubeList.add(new ModelBox(cube_r13, 9, 21, -2.0F, 0.0F, -3.0F, 2, 0, 2, 0.0F, true));

        this.cube_r14 = new AdvancedModelRenderer(this);
        this.cube_r14.setRotationPoint(0.5F, -0.25F, 3.0F);
        this.body6.addChild(cube_r14);
        this.setRotateAngle(cube_r14, 0.0F, 0.0F, 0.3927F);
        this.cube_r14.cubeList.add(new ModelBox(cube_r14, 9, 21, 0.0F, 0.0F, -3.0F, 2, 0, 2, 0.0F, false));

        this.leftLeg11 = new AdvancedModelRenderer(this);
        this.leftLeg11.setRotationPoint(0.5F, 0.0F, 0.5F);
        this.body6.addChild(leftLeg11);
        this.setRotateAngle(leftLeg11, 0.0F, 0.0F, 0.3927F);
        this.leftLeg11.cubeList.add(new ModelBox(leftLeg11, 0, 8, 0.0F, 0.0F, 0.0F, 2, 1, 0, 0.0F, false));

        this.rightLeg11 = new AdvancedModelRenderer(this);
        this.rightLeg11.setRotationPoint(-0.5F, 0.0F, 0.5F);
        this.body6.addChild(rightLeg11);
        this.setRotateAngle(rightLeg11, 0.0F, 0.0F, -0.3927F);
        this.rightLeg11.cubeList.add(new ModelBox(rightLeg11, 0, 8, -2.0F, 0.0F, 0.0F, 2, 1, 0, 0.0F, true));

        this.leftLeg12 = new AdvancedModelRenderer(this);
        this.leftLeg12.setRotationPoint(0.5F, 0.0F, 1.5F);
        this.body6.addChild(leftLeg12);
        this.setRotateAngle(leftLeg12, 0.0F, 0.0F, 0.3927F);
        this.leftLeg12.cubeList.add(new ModelBox(leftLeg12, 0, 8, 0.0F, 0.0F, 0.0F, 2, 1, 0, 0.0F, false));

        this.rightLeg12 = new AdvancedModelRenderer(this);
        this.rightLeg12.setRotationPoint(-0.5F, 0.0F, 1.5F);
        this.body6.addChild(rightLeg12);
        this.setRotateAngle(rightLeg12, 0.0F, 0.0F, -0.3927F);
        this.rightLeg12.cubeList.add(new ModelBox(rightLeg12, 0, 8, -2.0F, 0.0F, 0.0F, 2, 1, 0, 0.0F, true));

        this.body7 = new AdvancedModelRenderer(this);
        this.body7.setRotationPoint(0.0F, 0.0F, 2.0F);
        this.body6.addChild(body7);
        this.body7.cubeList.add(new ModelBox(body7, 23, 24, -0.5F, -0.5F, 0.0F, 1, 1, 2, 0.0F, false));

        this.cube_r15 = new AdvancedModelRenderer(this);
        this.cube_r15.setRotationPoint(-0.5F, -0.25F, 3.0F);
        this.body7.addChild(cube_r15);
        this.setRotateAngle(cube_r15, 0.0F, 0.0F, -0.3927F);
        this.cube_r15.cubeList.add(new ModelBox(cube_r15, 18, 21, -2.0F, 0.0F, -3.0F, 2, 0, 2, 0.0F, true));

        this.cube_r16 = new AdvancedModelRenderer(this);
        this.cube_r16.setRotationPoint(0.5F, -0.25F, 3.0F);
        this.body7.addChild(cube_r16);
        this.setRotateAngle(cube_r16, 0.0F, 0.0F, 0.3927F);
        this.cube_r16.cubeList.add(new ModelBox(cube_r16, 18, 21, 0.0F, 0.0F, -3.0F, 2, 0, 2, 0.0F, false));

        this.leftLeg13 = new AdvancedModelRenderer(this);
        this.leftLeg13.setRotationPoint(0.5F, 0.0F, 0.5F);
        this.body7.addChild(leftLeg13);
        this.setRotateAngle(leftLeg13, 0.0F, 0.0F, 0.3927F);
        this.leftLeg13.cubeList.add(new ModelBox(leftLeg13, 0, 8, 0.0F, 0.0F, 0.0F, 2, 1, 0, 0.0F, false));

        this.rightLeg13 = new AdvancedModelRenderer(this);
        this.rightLeg13.setRotationPoint(-0.5F, 0.0F, 0.5F);
        this.body7.addChild(rightLeg13);
        this.setRotateAngle(rightLeg13, 0.0F, 0.0F, -0.3927F);
        this.rightLeg13.cubeList.add(new ModelBox(rightLeg13, 0, 8, -2.0F, 0.0F, 0.0F, 2, 1, 0, 0.0F, true));

        this.leftLeg14 = new AdvancedModelRenderer(this);
        this.leftLeg14.setRotationPoint(0.5F, 0.0F, 1.5F);
        this.body7.addChild(leftLeg14);
        this.setRotateAngle(leftLeg14, 0.0F, 0.0F, 0.3927F);
        this.leftLeg14.cubeList.add(new ModelBox(leftLeg14, 0, 8, 0.0F, 0.0F, 0.0F, 2, 1, 0, 0.0F, false));

        this.rightLeg14 = new AdvancedModelRenderer(this);
        this.rightLeg14.setRotationPoint(-0.5F, 0.0F, 1.5F);
        this.body7.addChild(rightLeg14);
        this.setRotateAngle(rightLeg14, 0.0F, 0.0F, -0.3927F);
        this.rightLeg14.cubeList.add(new ModelBox(rightLeg14, 0, 8, -2.0F, 0.0F, 0.0F, 2, 1, 0, 0.0F, true));

        this.body8 = new AdvancedModelRenderer(this);
        this.body8.setRotationPoint(0.0F, 0.0F, 2.0F);
        this.body7.addChild(body8);
        this.body8.cubeList.add(new ModelBox(body8, 16, 24, -0.5F, -0.5F, 0.0F, 1, 1, 2, -0.01F, false));

        this.cube_r17 = new AdvancedModelRenderer(this);
        this.cube_r17.setRotationPoint(-0.5F, -0.25F, 3.0F);
        this.body8.addChild(cube_r17);
        this.setRotateAngle(cube_r17, 0.0F, 0.0F, -0.3927F);
        this.cube_r17.cubeList.add(new ModelBox(cube_r17, 22, 12, -2.0F, 0.0F, -3.0F, 2, 0, 2, 0.0F, true));

        this.cube_r18 = new AdvancedModelRenderer(this);
        this.cube_r18.setRotationPoint(0.5F, -0.25F, 3.0F);
        this.body8.addChild(cube_r18);
        this.setRotateAngle(cube_r18, 0.0F, 0.0F, 0.3927F);
        this.cube_r18.cubeList.add(new ModelBox(cube_r18, 22, 12, 0.0F, 0.0F, -3.0F, 2, 0, 2, 0.0F, false));

        this.leftLeg15 = new AdvancedModelRenderer(this);
        this.leftLeg15.setRotationPoint(0.5F, 0.0F, 0.5F);
        this.body8.addChild(leftLeg15);
        this.setRotateAngle(leftLeg15, 0.0F, 0.0F, 0.3927F);
        this.leftLeg15.cubeList.add(new ModelBox(leftLeg15, 0, 8, 0.0F, 0.0F, 0.0F, 2, 1, 0, 0.0F, false));

        this.rightLeg15 = new AdvancedModelRenderer(this);
        this.rightLeg15.setRotationPoint(-0.5F, 0.0F, 0.5F);
        this.body8.addChild(rightLeg15);
        this.setRotateAngle(rightLeg15, 0.0F, 0.0F, -0.3927F);
        this.rightLeg15.cubeList.add(new ModelBox(rightLeg15, 0, 8, -2.0F, 0.0F, 0.0F, 2, 1, 0, 0.0F, true));

        this.leftLeg16 = new AdvancedModelRenderer(this);
        this.leftLeg16.setRotationPoint(0.5F, 0.0F, 1.5F);
        this.body8.addChild(leftLeg16);
        this.setRotateAngle(leftLeg16, 0.0F, 0.0F, 0.3927F);
        this.leftLeg16.cubeList.add(new ModelBox(leftLeg16, 0, 8, 0.0F, 0.0F, 0.0F, 2, 1, 0, 0.0F, false));

        this.rightLeg16 = new AdvancedModelRenderer(this);
        this.rightLeg16.setRotationPoint(-0.5F, 0.0F, 1.5F);
        this.body8.addChild(rightLeg16);
        this.setRotateAngle(rightLeg16, 0.0F, 0.0F, -0.3927F);
        this.rightLeg16.cubeList.add(new ModelBox(rightLeg16, 0, 8, -2.0F, 0.0F, 0.0F, 2, 1, 0, 0.0F, true));

        this.body9 = new AdvancedModelRenderer(this);
        this.body9.setRotationPoint(0.0F, 0.0F, 2.0F);
        this.body8.addChild(body9);
        this.body9.cubeList.add(new ModelBox(body9, 9, 24, -0.5F, -0.5F, 0.0F, 1, 1, 2, 0.0F, false));

        this.cube_r19 = new AdvancedModelRenderer(this);
        this.cube_r19.setRotationPoint(-0.5F, -0.25F, 3.0F);
        this.body9.addChild(cube_r19);
        this.setRotateAngle(cube_r19, 0.0F, 0.0F, -0.3927F);
        this.cube_r19.cubeList.add(new ModelBox(cube_r19, 23, 0, -2.0F, 0.0F, -3.0F, 2, 0, 2, 0.0F, true));

        this.cube_r20 = new AdvancedModelRenderer(this);
        this.cube_r20.setRotationPoint(0.5F, -0.25F, 3.0F);
        this.body9.addChild(cube_r20);
        this.setRotateAngle(cube_r20, 0.0F, 0.0F, 0.3927F);
        this.cube_r20.cubeList.add(new ModelBox(cube_r20, 23, 0, 0.0F, 0.0F, -3.0F, 2, 0, 2, 0.0F, false));

        this.leftLeg17 = new AdvancedModelRenderer(this);
        this.leftLeg17.setRotationPoint(0.5F, 0.0F, 0.5F);
        this.body9.addChild(leftLeg17);
        this.setRotateAngle(leftLeg17, 0.0F, 0.0F, 0.3927F);
        this.leftLeg17.cubeList.add(new ModelBox(leftLeg17, 0, 8, 0.0F, 0.0F, 0.0F, 2, 1, 0, 0.0F, false));

        this.rightLeg17 = new AdvancedModelRenderer(this);
        this.rightLeg17.setRotationPoint(-0.5F, 0.0F, 0.5F);
        this.body9.addChild(rightLeg17);
        this.setRotateAngle(rightLeg17, 0.0F, 0.0F, -0.3927F);
        this.rightLeg17.cubeList.add(new ModelBox(rightLeg17, 0, 8, -2.0F, 0.0F, 0.0F, 2, 1, 0, 0.0F, true));

        this.leftLeg18 = new AdvancedModelRenderer(this);
        this.leftLeg18.setRotationPoint(0.5F, 0.0F, 1.5F);
        this.body9.addChild(leftLeg18);
        this.setRotateAngle(leftLeg18, 0.0F, 0.0F, 0.3927F);
        this.leftLeg18.cubeList.add(new ModelBox(leftLeg18, 0, 8, 0.0F, 0.0F, 0.0F, 2, 1, 0, 0.0F, false));

        this.rightLeg18 = new AdvancedModelRenderer(this);
        this.rightLeg18.setRotationPoint(-0.5F, 0.0F, 1.5F);
        this.body9.addChild(rightLeg18);
        this.setRotateAngle(rightLeg18, 0.0F, 0.0F, -0.3927F);
        this.rightLeg18.cubeList.add(new ModelBox(rightLeg18, 0, 8, -2.0F, 0.0F, 0.0F, 2, 1, 0, 0.0F, true));

        this.body10 = new AdvancedModelRenderer(this);
        this.body10.setRotationPoint(0.0F, 0.0F, 2.0F);
        this.body9.addChild(body10);
        this.body10.cubeList.add(new ModelBox(body10, 0, 0, -0.5F, -0.5F, 0.0F, 1, 1, 2, -0.01F, false));

        this.cube_r21 = new AdvancedModelRenderer(this);
        this.cube_r21.setRotationPoint(-0.5F, -0.25F, 3.0F);
        this.body10.addChild(cube_r21);
        this.setRotateAngle(cube_r21, 0.0F, 0.0F, -0.3927F);
        this.cube_r21.cubeList.add(new ModelBox(cube_r21, 0, 24, -2.0F, 0.0F, -3.0F, 2, 0, 2, 0.0F, true));

        this.cube_r22 = new AdvancedModelRenderer(this);
        this.cube_r22.setRotationPoint(0.5F, -0.25F, 3.0F);
        this.body10.addChild(cube_r22);
        this.setRotateAngle(cube_r22, 0.0F, 0.0F, 0.3927F);
        this.cube_r22.cubeList.add(new ModelBox(cube_r22, 0, 24, 0.0F, 0.0F, -3.0F, 2, 0, 2, 0.0F, false));

        this.leftLeg19 = new AdvancedModelRenderer(this);
        this.leftLeg19.setRotationPoint(0.5F, 0.0F, 0.5F);
        this.body10.addChild(leftLeg19);
        this.setRotateAngle(leftLeg19, 0.0F, 0.0F, 0.3927F);
        this.leftLeg19.cubeList.add(new ModelBox(leftLeg19, 0, 8, 0.0F, 0.0F, 0.0F, 2, 1, 0, 0.0F, false));

        this.rightLeg19 = new AdvancedModelRenderer(this);
        this.rightLeg19.setRotationPoint(-0.5F, 0.0F, 0.5F);
        this.body10.addChild(rightLeg19);
        this.setRotateAngle(rightLeg19, 0.0F, 0.0F, -0.3927F);
        this.rightLeg19.cubeList.add(new ModelBox(rightLeg19, 0, 8, -2.0F, 0.0F, 0.0F, 2, 1, 0, 0.0F, true));

        this.leftLeg20 = new AdvancedModelRenderer(this);
        this.leftLeg20.setRotationPoint(0.5F, 0.0F, 1.5F);
        this.body10.addChild(leftLeg20);
        this.setRotateAngle(leftLeg20, 0.0F, 0.0F, 0.3927F);
        this.leftLeg20.cubeList.add(new ModelBox(leftLeg20, 0, 8, 0.0F, 0.0F, 0.0F, 2, 1, 0, 0.0F, false));

        this.rightLeg20 = new AdvancedModelRenderer(this);
        this.rightLeg20.setRotationPoint(-0.5F, 0.0F, 1.5F);
        this.body10.addChild(rightLeg20);
        this.setRotateAngle(rightLeg20, 0.0F, 0.0F, -0.3927F);
        this.rightLeg20.cubeList.add(new ModelBox(rightLeg20, 0, 8, -2.0F, 0.0F, 0.0F, 2, 1, 0, 0.0F, true));

        this.pygidium = new AdvancedModelRenderer(this);
        this.pygidium.setRotationPoint(0.0F, 0.0F, 2.0F);
        this.body10.addChild(pygidium);
        this.setRotateAngle(pygidium, -0.1745F, 0.0F, 0.0F);
        this.pygidium.cubeList.add(new ModelBox(pygidium, 0, 8, -0.5F, -0.5F, 0.0F, 1, 1, 6, 0.0F, false));
        this.pygidium.cubeList.add(new ModelBox(pygidium, 9, 8, -0.5F, -0.25F, 6.0F, 1, 0, 1, 0.0F, false));

        this.cube_r23 = new AdvancedModelRenderer(this);
        this.cube_r23.setRotationPoint(-0.5F, -0.25F, 4.0F);
        this.pygidium.addChild(cube_r23);
        this.setRotateAngle(cube_r23, 0.0F, 0.0F, -0.3054F);
        this.cube_r23.cubeList.add(new ModelBox(cube_r23, 0, 0, -3.0F, 0.0F, -4.0F, 3, 0, 7, 0.0F, true));

        this.cube_r24 = new AdvancedModelRenderer(this);
        this.cube_r24.setRotationPoint(0.5F, -0.25F, 4.0F);
        this.pygidium.addChild(cube_r24);
        this.setRotateAngle(cube_r24, 0.0F, 0.0F, 0.3054F);
        this.cube_r24.cubeList.add(new ModelBox(cube_r24, 0, 0, 0.0F, 0.0F, -4.0F, 3, 0, 7, 0.0F, false));

        this.leftbackAntennae = new AdvancedModelRenderer(this);
        this.leftbackAntennae.setRotationPoint(0.5F, 0.25F, 6.0F);
        this.pygidium.addChild(leftbackAntennae);
        this.leftbackAntennae.cubeList.add(new ModelBox(leftbackAntennae, 12, 14, 0.0F, 0.0F, 0.0F, 3, 0, 3, 0.0F, false));

        this.rightbackAntennae = new AdvancedModelRenderer(this);
        this.rightbackAntennae.setRotationPoint(-0.5F, 0.25F, 6.0F);
        this.pygidium.addChild(rightbackAntennae);
        this.rightbackAntennae.cubeList.add(new ModelBox(rightbackAntennae, 12, 14, -3.0F, 0.0F, 0.0F, 3, 0, 3, 0.0F, true));

        updateDefaultPose();
    }

    @Override
    public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        this.Kleptothule.render(f5);
    }

    public void renderStatic(float f) {
        //GlStateManager.pushMatrix();
        //GlStateManager.enableBlend();
        //GlStateManager.blendFunc(GlStateManager.SourceFactor.SRC_ALPHA, GlStateManager.DestFactor.ONE_MINUS_SRC_ALPHA);
        //GlStateManager.disableCull();
        this.Kleptothule.render(0.019F);
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

        AdvancedModelRenderer[] fishTail = {this.body2, this.body3, this.body4, this.body5, this.body6, this.body7, this.body8, this.body9, this.body10, this.pygidium};

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
            tailVdegree = 0.02F;
            tailHdegree = 0.05F;
            tailSwing = 0.2F;
        }


        if (e instanceof EntityLiving && !((EntityLiving) e).isAIDisabled()) {
            this.chainWave(fishTail, speed, tailVdegree * 0.3f, -3, f2, 1);
            this.chainSwing(fishTail, speed, tailHdegree, -2.5, f2, tailSwing);

            this.flap(leftLeg1, speed, -0.5F, false, 0, -0.5F, f2, 0.3F);
            this.flap(rightLeg1, speed, 0.5F, false, 0, 0.5F, f2, 0.3F);
            this.flap(leftLeg2, speed, -0.5F, false, 1.0F, -0.5F, f2, 0.3F);
            this.flap(rightLeg2, speed, 0.5F, false, 1.0F, 0.5F, f2, 0.3F);
            this.flap(leftLeg3, speed, -0.5F, false, 2.0F, -0.5F, f2, 0.3F);
            this.flap(rightLeg3, speed, 0.5F, false, 2.0F, 0.5F, f2, 0.3F);
            this.flap(leftLeg4, speed, -0.5F, false, 3.0F, -0.5F, f2, 0.3F);
            this.flap(rightLeg4, speed, 0.5F, false, 3.0F, 0.5F, f2, 0.3F);
            this.flap(leftLeg5, speed, -0.5F, false, 4.0F, -0.5F, f2, 0.3F);
            this.flap(rightLeg5, speed, 0.5F, false, 4.0F, 0.5F, f2, 0.3F);
            this.flap(leftLeg6, speed, -0.5F, false, 5.0F, -0.5F, f2, 0.3F);
            this.flap(rightLeg6, speed, 0.5F, false, 5.0F, 0.5F, f2, 0.3F);
            this.flap(leftLeg7, speed, -0.5F, false, 6.0F, -0.5F, f2, 0.3F);
            this.flap(rightLeg7, speed, 0.5F, false, 6.0F, 0.5F, f2, 0.3F);
            this.flap(leftLeg8, speed, -0.5F, false, 7.0F, -0.5F, f2, 0.3F);
            this.flap(rightLeg8, speed, 0.5F, false, 7.0F, 0.5F, f2, 0.3F);
            this.flap(leftLeg9, speed, -0.5F, false, 8.0F, -0.5F, f2, 0.3F);
            this.flap(rightLeg9, speed, 0.5F, false, 8.0F, 0.5F, f2, 0.3F);
            this.flap(leftLeg10, speed, -0.5F, false, 9.0F, -0.5F, f2, 0.3F);
            this.flap(rightLeg10, speed, 0.5F, false, 9.0F, 0.5F, f2, 0.3F);
            this.flap(leftLeg11, speed, -0.5F, false, 10.0F, -0.5F, f2, 0.3F);
            this.flap(rightLeg11, speed, 0.5F, false, 10.0F, 0.5F, f2, 0.3F);
            this.flap(leftLeg12, speed, -0.5F, false, 11.0F, -0.5F, f2, 0.3F);
            this.flap(rightLeg12, speed, 0.5F, false, 11.0F, 0.5F, f2, 0.3F);
            this.flap(leftLeg13, speed, -0.5F, false, 12.0F, -0.5F, f2, 0.3F);
            this.flap(rightLeg13, speed, 0.5F, false, 12.0F, 0.5F, f2, 0.3F);
            this.flap(leftLeg14, speed, -0.5F, false, 13.0F, -0.5F, f2, 0.3F);
            this.flap(rightLeg14, speed, 0.5F, false, 13.0F, 0.5F, f2, 0.3F);
            this.flap(leftLeg15, speed, -0.5F, false, 14.0F, -0.5F, f2, 0.3F);
            this.flap(rightLeg15, speed, 0.5F, false, 14.0F, 0.5F, f2, 0.3F);
            this.flap(leftLeg16, speed, -0.5F, false, 15.0F, -0.5F, f2, 0.3F);
            this.flap(rightLeg16, speed, 0.5F, false, 15.0F, 0.5F, f2, 0.3F);
            this.flap(leftLeg17, speed, -0.5F, false, 16.0F, -0.5F, f2, 0.3F);
            this.flap(rightLeg17, speed, 0.5F, false, 16.0F, 0.5F, f2, 0.3F);
            this.flap(leftLeg18, speed, -0.5F, false, 17.0F, -0.5F, f2, 0.3F);
            this.flap(rightLeg18, speed, 0.5F, false, 17.0F, 0.5F, f2, 0.3F);
            this.flap(leftLeg19, speed, -0.5F, false, 18.0F, -0.5F, f2, 0.3F);
            this.flap(rightLeg19, speed, 0.5F, false, 18.0F, 0.5F, f2, 0.3F);
            this.flap(leftLeg20, speed, -0.5F, false, 19.0F, -0.5F, f2, 0.3F);
            this.flap(rightLeg20, speed, 0.5F, false, 19.0F, 0.5F, f2, 0.3F);

            this.swing(leftbackAntennae, 0.4F, -0.2F, false, 0, -0.1F, f2, 0.8F);
            this.swing(rightbackAntennae, 0.4F, 0.2F, false, 0, 0.1F, f2, 0.8F);
            this.swing(leftfrontAntennae, 0.4F, -0.2F, false, 0, -0.1F, f2, 0.8F);
            this.swing(rightfrontAntennae, 0.4F, 0.2F, false, 0, 0.1F, f2, 0.8F);
            //this.swing(body, speed, 0.3F, true, 0, 0, f2, 1);
            if (!isAtBottom) {
                this.bob(Kleptothule, -speed, 0.12F, false, f2, 2);
            }
            if (!e.isInWater()) {
                //this.Bodyfront.rotateAngleZ = (float) Math.toRadians(90);
                //this.Kleptothule.offsetY = 1.02F;
                this.bob(Kleptothule, -speed, 0.21F, false, f2, 1);
                this.chainWave(fishTail, speed, tailHdegree, -3, f2, 1);
                this.chainSwing(fishTail, speed, tailVdegree, -3, f2, 1);
            }
        }
    }
}
