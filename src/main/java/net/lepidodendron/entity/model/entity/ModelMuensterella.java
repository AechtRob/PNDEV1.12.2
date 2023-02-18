package net.lepidodendron.entity.model.entity;

import net.ilexiconn.llibrary.client.model.tools.AdvancedModelRenderer;
import net.lepidodendron.entity.model.llibraryextensions.AdvancedModelBaseExtended;
import net.lepidodendron.entity.model.llibraryextensions.AdvancedModelRendererExtended;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

public class ModelMuensterella extends AdvancedModelBaseExtended {
    private final AdvancedModelRendererExtended bone;
    private final AdvancedModelRendererExtended finsR;
    private final AdvancedModelRendererExtended finR1;
    private final AdvancedModelRendererExtended finR2;
    private final AdvancedModelRendererExtended finR3;
    private final AdvancedModelRendererExtended finR4;
    private final AdvancedModelRendererExtended finsL;
    private final AdvancedModelRendererExtended finL;
    private final AdvancedModelRendererExtended finL2;
    private final AdvancedModelRendererExtended finL3;
    private final AdvancedModelRendererExtended finL4;
    private final AdvancedModelRendererExtended head;
    private final AdvancedModelRendererExtended siphon;
    private final AdvancedModelRendererExtended arm2;
    private final AdvancedModelRendererExtended arms2;
    private final AdvancedModelRendererExtended arm;
    private final AdvancedModelRendererExtended arms;
    private final AdvancedModelRendererExtended arm3;
    private final AdvancedModelRendererExtended arms3;
    private final AdvancedModelRendererExtended arm7;
    private final AdvancedModelRendererExtended arms7;
    private final AdvancedModelRendererExtended arm5;
    private final AdvancedModelRendererExtended arms5;
    private final AdvancedModelRendererExtended arm4;
    private final AdvancedModelRendererExtended arms4;
    private final AdvancedModelRendererExtended arm6;
    private final AdvancedModelRendererExtended arms6;
    private final AdvancedModelRendererExtended arm8;
    private final AdvancedModelRendererExtended arms8;
    private final AdvancedModelRendererExtended spinerowR5;
    private final AdvancedModelRendererExtended cube_r1;
    private final AdvancedModelRendererExtended cube_r2;
    private final AdvancedModelRendererExtended cube_r3;
    private final AdvancedModelRendererExtended spinerowL5;
    private final AdvancedModelRendererExtended cube_r4;
    private final AdvancedModelRendererExtended cube_r5;
    private final AdvancedModelRendererExtended cube_r6;
    private final AdvancedModelRendererExtended spinerowR3;
    private final AdvancedModelRendererExtended cube_r7;
    private final AdvancedModelRendererExtended cube_r8;
    private final AdvancedModelRendererExtended cube_r9;
    private final AdvancedModelRendererExtended spinerowL3;
    private final AdvancedModelRendererExtended cube_r10;
    private final AdvancedModelRendererExtended cube_r11;
    private final AdvancedModelRendererExtended cube_r12;
    private final AdvancedModelRendererExtended spinerowR2;
    private final AdvancedModelRendererExtended cube_r13;
    private final AdvancedModelRendererExtended cube_r14;
    private final AdvancedModelRendererExtended cube_r15;
    private final AdvancedModelRendererExtended spinerowL2;
    private final AdvancedModelRendererExtended cube_r16;
    private final AdvancedModelRendererExtended cube_r17;
    private final AdvancedModelRendererExtended cube_r18;
    private final AdvancedModelRendererExtended spinerowR;
    private final AdvancedModelRendererExtended cube_r19;
    private final AdvancedModelRendererExtended cube_r20;
    private final AdvancedModelRendererExtended cube_r21;
    private final AdvancedModelRendererExtended spinerowL;
    private final AdvancedModelRendererExtended cube_r22;
    private final AdvancedModelRendererExtended cube_r23;
    private final AdvancedModelRendererExtended cube_r24;
    private final AdvancedModelRendererExtended spinerowR4;
    private final AdvancedModelRendererExtended cube_r25;
    private final AdvancedModelRendererExtended cube_r26;
    private final AdvancedModelRendererExtended cube_r27;
    private final AdvancedModelRendererExtended spinerowL4;
    private final AdvancedModelRendererExtended cube_r28;
    private final AdvancedModelRendererExtended cube_r29;
    private final AdvancedModelRendererExtended cube_r30;
    private final AdvancedModelRendererExtended spinerowR6;
    private final AdvancedModelRendererExtended spinerowL6;

    public ModelMuensterella() {
        this.textureWidth = 64;
        this.textureHeight = 64;

        this.bone = new AdvancedModelRendererExtended(this);
        this.bone.setRotationPoint(0.0F, 24.0F, 0.0F);
        this.bone.cubeList.add(new ModelBox(bone, 0, 19, 0.0F, -5.25F, -7.25F, 0, 1, 9, 0.0F, false));
        this.bone.cubeList.add(new ModelBox(bone, 0, 0, -4.5F, -5.0F, -10.0F, 9, 4, 12, 0.0F, false));

        this.finsR = new AdvancedModelRendererExtended(this);
        this.finsR.setRotationPoint(4.5F, -3.5F, -4.0F);
        this.bone.addChild(finsR);


        this.finR1 = new AdvancedModelRendererExtended(this);
        this.finR1.setRotationPoint(0.0F, 0.0F, -4.0F);
        this.finsR.addChild(finR1);
        this.finR1.cubeList.add(new ModelBox(finR1, 17, 25, 0.0F, 0.0F, -2.0F, 4, 0, 3, 0.0F, false));

        this.finR2 = new AdvancedModelRendererExtended(this);
        this.finR2.setRotationPoint(0.0F, 0.0F, 3.0F);
        this.finR1.addChild(finR2);
        this.finR2.cubeList.add(new ModelBox(finR2, 17, 22, 0.0F, 0.0F, -2.0F, 4, 0, 3, 0.0F, false));

        this.finR3 = new AdvancedModelRendererExtended(this);
        this.finR3.setRotationPoint(0.0F, 0.0F, 3.0F);
        this.finR2.addChild(finR3);
        this.finR3.cubeList.add(new ModelBox(finR3, 17, 19, 0.0F, 0.0F, -2.0F, 4, 0, 3, 0.0F, false));

        this.finR4 = new AdvancedModelRendererExtended(this);
        this.finR4.setRotationPoint(0.0F, 0.0F, 3.0F);
        this.finR3.addChild(finR4);
        this.finR4.cubeList.add(new ModelBox(finR4, 17, 16, 0.0F, 0.0F, -2.0F, 4, 0, 3, 0.0F, false));

        this.finsL = new AdvancedModelRendererExtended(this);
        this.finsL.setRotationPoint(-4.5F, -3.5F, -4.0F);
        this.bone.addChild(finsL);


        this.finL = new AdvancedModelRendererExtended(this);
        this.finL.setRotationPoint(0.0F, 0.0F, -4.0F);
        this.finsL.addChild(finL);
        this.finL.cubeList.add(new ModelBox(finL, 17, 25, -4.0F, 0.0F, -2.0F, 4, 0, 3, 0.0F, true));

        this.finL2 = new AdvancedModelRendererExtended(this);
        this.finL2.setRotationPoint(0.0F, 0.0F, 3.0F);
        this.finL.addChild(finL2);
        this.finL2.cubeList.add(new ModelBox(finL2, 17, 22, -4.0F, 0.0F, -2.0F, 4, 0, 3, 0.0F, true));

        this.finL3 = new AdvancedModelRendererExtended(this);
        this.finL3.setRotationPoint(0.0F, 0.0F, 3.0F);
        this.finL2.addChild(finL3);
        this.finL3.cubeList.add(new ModelBox(finL3, 17, 19, -4.0F, 0.0F, -2.0F, 4, 0, 3, 0.0F, true));

        this.finL4 = new AdvancedModelRendererExtended(this);
        this.finL4.setRotationPoint(0.0F, 0.0F, 3.0F);
        this.finL3.addChild(finL4);
        this.finL4.cubeList.add(new ModelBox(finL4, 17, 16, -4.0F, 0.0F, -2.0F, 4, 0, 3, 0.0F, true));

        this.head = new AdvancedModelRendererExtended(this);
        this.head.setRotationPoint(0.0F, -4.5F, 2.0F);
        this.bone.addChild(head);
        this.setRotateAngle(head, -0.1745F, 0.0F, 0.0F);
        this.head.cubeList.add(new ModelBox(head, 20, 29, -4.15F, 0.75F, 0.5F, 1, 1, 2, -0.01F, false));
        this.head.cubeList.add(new ModelBox(head, 0, 4, -4.0F, 0.25F, 0.5F, 1, 2, 2, 0.0F, false));
        this.head.cubeList.add(new ModelBox(head, 30, 3, 3.15F, 0.75F, 0.5F, 1, 1, 2, -0.01F, false));
        this.head.cubeList.add(new ModelBox(head, 4, 6, 3.0F, 0.25F, 0.5F, 1, 2, 2, 0.0F, false));
        this.head.cubeList.add(new ModelBox(head, 25, 25, -3.5F, 0.0F, 0.0F, 7, 3, 3, 0.0F, false));

        this.siphon = new AdvancedModelRendererExtended(this);
        this.siphon.setRotationPoint(0.0F, 2.75F, 0.0F);
        this.head.addChild(siphon);
        this.setRotateAngle(siphon, -0.2182F, 0.0F, 0.0F);
        this.siphon.cubeList.add(new ModelBox(siphon, 0, 0, -1.0F, -0.5F, 0.0F, 2, 1, 3, 0.0F, false));

        this.arm2 = new AdvancedModelRendererExtended(this);
        this.arm2.setRotationPoint(2.75F, 1.25F, 3.0F);
        this.head.addChild(arm2);
        this.setRotateAngle(arm2, -0.0873F, 0.1309F, 0.0F);
        this.arm2.cubeList.add(new ModelBox(arm2, 6, 29, -0.5F, -0.5F, 0.0F, 1, 1, 2, 0.01F, false));

        this.arms2 = new AdvancedModelRendererExtended(this);
        this.arms2.setRotationPoint(0.0F, 0.0F, 2.0F);
        this.arm2.addChild(arms2);
        this.arms2.cubeList.add(new ModelBox(arms2, 0, 29, -0.5F, -0.5F, 0.0F, 1, 1, 2, 0.0F, false));

        this.arm = new AdvancedModelRendererExtended(this);
        this.arm.setRotationPoint(-2.75F, 1.25F, 3.0F);
        this.head.addChild(arm);
        this.setRotateAngle(arm, -0.0873F, -0.1309F, 0.0F);
        this.arm.cubeList.add(new ModelBox(arm, 30, 0, -0.5F, -0.5F, 0.0F, 1, 1, 2, 0.01F, false));

        this.arms = new AdvancedModelRendererExtended(this);
        this.arms.setRotationPoint(0.0F, 0.0F, 2.0F);
        this.arm.addChild(arms);
        this.arms.cubeList.add(new ModelBox(arms, 12, 29, -0.5F, -0.5F, 0.0F, 1, 1, 2, 0.0F, false));

        this.arm3 = new AdvancedModelRendererExtended(this);
        this.arm3.setRotationPoint(1.0F, 1.25F, 3.0F);
        this.head.addChild(arm3);
        this.setRotateAngle(arm3, -0.0873F, 0.0873F, 0.0F);
        this.arm3.cubeList.add(new ModelBox(arm3, 28, 20, -0.5F, -0.5F, 0.0F, 1, 1, 2, 0.01F, false));

        this.arms3 = new AdvancedModelRendererExtended(this);
        this.arms3.setRotationPoint(0.0F, 0.0F, 2.0F);
        this.arm3.addChild(arms3);
        this.arms3.cubeList.add(new ModelBox(arms3, 28, 17, -0.5F, -0.5F, 0.0F, 1, 1, 2, 0.0F, false));

        this.arm7 = new AdvancedModelRendererExtended(this);
        this.arm7.setRotationPoint(0.75F, 2.5F, 3.0F);
        this.head.addChild(arm7);
        this.setRotateAngle(arm7, -0.1745F, 0.0873F, 0.0F);
        this.arm7.cubeList.add(new ModelBox(arm7, 0, 19, -0.5F, -0.5F, 0.0F, 1, 1, 2, 0.01F, false));

        this.arms7 = new AdvancedModelRendererExtended(this);
        this.arms7.setRotationPoint(0.0F, 0.0F, 2.0F);
        this.arm7.addChild(arms7);
        this.arms7.cubeList.add(new ModelBox(arms7, 6, 16, -0.5F, -0.5F, 0.0F, 1, 1, 2, 0.0F, false));

        this.arm5 = new AdvancedModelRendererExtended(this);
        this.arm5.setRotationPoint(-2.5F, 2.5F, 3.0F);
        this.head.addChild(arm5);
        this.setRotateAngle(arm5, -0.1745F, -0.1309F, 0.0F);
        this.arm5.cubeList.add(new ModelBox(arm5, 0, 25, -0.5F, -0.5F, 0.0F, 1, 1, 2, 0.01F, false));

        this.arms5 = new AdvancedModelRendererExtended(this);
        this.arms5.setRotationPoint(0.0F, 0.0F, 2.0F);
        this.arm5.addChild(arms5);
        this.arms5.cubeList.add(new ModelBox(arms5, 6, 22, -0.5F, -0.5F, 0.0F, 1, 1, 2, 0.0F, false));

        this.arm4 = new AdvancedModelRendererExtended(this);
        this.arm4.setRotationPoint(-1.0F, 1.25F, 3.0F);
        this.head.addChild(arm4);
        this.setRotateAngle(arm4, -0.0873F, -0.0873F, 0.0F);
        this.arm4.cubeList.add(new ModelBox(arm4, 16, 28, -0.5F, -0.5F, 0.0F, 1, 1, 2, 0.01F, false));

        this.arms4 = new AdvancedModelRendererExtended(this);
        this.arms4.setRotationPoint(0.0F, 0.0F, 2.0F);
        this.arm4.addChild(arms4);
        this.arms4.cubeList.add(new ModelBox(arms4, 6, 25, -0.5F, -0.5F, 0.0F, 1, 1, 2, 0.0F, false));

        this.arm6 = new AdvancedModelRendererExtended(this);
        this.arm6.setRotationPoint(2.5F, 2.5F, 3.0F);
        this.head.addChild(arm6);
        this.setRotateAngle(arm6, -0.1745F, 0.1309F, 0.0F);
        this.arm6.cubeList.add(new ModelBox(arm6, 0, 22, -0.5F, -0.5F, 0.0F, 1, 1, 2, 0.01F, false));

        this.arms6 = new AdvancedModelRendererExtended(this);
        this.arms6.setRotationPoint(0.0F, 0.0F, 2.0F);
        this.arm6.addChild(arms6);
        this.arms6.cubeList.add(new ModelBox(arms6, 6, 19, -0.5F, -0.5F, 0.0F, 1, 1, 2, 0.0F, false));

        this.arm8 = new AdvancedModelRendererExtended(this);
        this.arm8.setRotationPoint(-0.75F, 2.5F, 3.0F);
        this.head.addChild(arm8);
        this.setRotateAngle(arm8, -0.1745F, -0.0873F, 0.0F);
        this.arm8.cubeList.add(new ModelBox(arm8, 0, 16, -0.5F, -0.5F, 0.0F, 1, 1, 2, 0.01F, false));

        this.arms8 = new AdvancedModelRendererExtended(this);
        this.arms8.setRotationPoint(0.0F, 0.0F, 2.0F);
        this.arm8.addChild(arms8);
        this.arms8.cubeList.add(new ModelBox(arms8, 0, 8, -0.5F, -0.5F, 0.0F, 1, 1, 2, 0.0F, false));

        this.spinerowR5 = new AdvancedModelRendererExtended(this);
        this.spinerowR5.setRotationPoint(0.0F, -5.0F, -7.0F);
        this.bone.addChild(spinerowR5);
        this.setRotateAngle(spinerowR5, 0.0F, 0.5236F, 0.0F);


        this.cube_r1 = new AdvancedModelRendererExtended(this);
        this.cube_r1.setRotationPoint(0.0F, 5.0F, 9.0F);
        this.spinerowR5.addChild(cube_r1);
        this.setRotateAngle(cube_r1, 0.0F, 0.0F, -0.1745F);
        this.cube_r1.cubeList.add(new ModelBox(cube_r1, 0, 2, -3.5F, -6.25F, -9.0F, 1, 1, 0, 0.0F, false));

        this.cube_r2 = new AdvancedModelRendererExtended(this);
        this.cube_r2.setRotationPoint(0.0F, 5.0F, 9.0F);
        this.spinerowR5.addChild(cube_r2);
        this.setRotateAngle(cube_r2, 0.0F, 0.0F, -0.0873F);
        this.cube_r2.cubeList.add(new ModelBox(cube_r2, 0, 0, -2.6F, -6.75F, -9.0F, 1, 2, 0, 0.0F, false));

        this.cube_r3 = new AdvancedModelRendererExtended(this);
        this.cube_r3.setRotationPoint(0.0F, 5.0F, 9.0F);
        this.spinerowR5.addChild(cube_r3);
        this.setRotateAngle(cube_r3, 0.0F, 0.0F, -0.0436F);
        this.cube_r3.cubeList.add(new ModelBox(cube_r3, 0, 4, -1.5F, -7.0F, -9.0F, 1, 2, 0, 0.0F, false));

        this.spinerowL5 = new AdvancedModelRendererExtended(this);
        this.spinerowL5.setRotationPoint(0.0F, -5.0F, -7.0F);
        this.bone.addChild(spinerowL5);
        this.setRotateAngle(spinerowL5, 0.0F, -0.5236F, 0.0F);


        this.cube_r4 = new AdvancedModelRendererExtended(this);
        this.cube_r4.setRotationPoint(0.0F, 5.0F, 9.0F);
        this.spinerowL5.addChild(cube_r4);
        this.setRotateAngle(cube_r4, 0.0F, 0.0F, 0.1745F);
        this.cube_r4.cubeList.add(new ModelBox(cube_r4, 0, 2, 2.5F, -6.25F, -9.0F, 1, 1, 0, 0.0F, true));

        this.cube_r5 = new AdvancedModelRendererExtended(this);
        this.cube_r5.setRotationPoint(0.0F, 5.0F, 9.0F);
        this.spinerowL5.addChild(cube_r5);
        this.setRotateAngle(cube_r5, 0.0F, 0.0F, 0.0873F);
        this.cube_r5.cubeList.add(new ModelBox(cube_r5, 0, 0, 1.6F, -6.75F, -9.0F, 1, 2, 0, 0.0F, true));

        this.cube_r6 = new AdvancedModelRendererExtended(this);
        this.cube_r6.setRotationPoint(0.0F, 5.0F, 9.0F);
        this.spinerowL5.addChild(cube_r6);
        this.setRotateAngle(cube_r6, 0.0F, 0.0F, 0.0436F);
        this.cube_r6.cubeList.add(new ModelBox(cube_r6, 0, 4, 0.5F, -7.0F, -9.0F, 1, 2, 0, 0.0F, true));

        this.spinerowR3 = new AdvancedModelRendererExtended(this);
        this.spinerowR3.setRotationPoint(0.0F, -5.0F, -7.5F);
        this.bone.addChild(spinerowR3);
        this.setRotateAngle(spinerowR3, 0.0F, 0.1745F, 0.0F);


        this.cube_r7 = new AdvancedModelRendererExtended(this);
        this.cube_r7.setRotationPoint(0.0F, 5.0F, 9.0F);
        this.spinerowR3.addChild(cube_r7);
        this.setRotateAngle(cube_r7, 0.0F, 0.0F, -0.1745F);
        this.cube_r7.cubeList.add(new ModelBox(cube_r7, 10, 4, -3.5F, -6.25F, -9.0F, 1, 1, 0, 0.0F, false));

        this.cube_r8 = new AdvancedModelRendererExtended(this);
        this.cube_r8.setRotationPoint(0.0F, 5.0F, 9.0F);
        this.spinerowR3.addChild(cube_r8);
        this.setRotateAngle(cube_r8, 0.0F, 0.0F, -0.0873F);
        this.cube_r8.cubeList.add(new ModelBox(cube_r8, 7, 0, -2.6F, -6.75F, -9.0F, 1, 2, 0, 0.0F, false));

        this.cube_r9 = new AdvancedModelRendererExtended(this);
        this.cube_r9.setRotationPoint(0.0F, 5.0F, 9.0F);
        this.spinerowR3.addChild(cube_r9);
        this.setRotateAngle(cube_r9, 0.0F, 0.0F, -0.0436F);
        this.cube_r9.cubeList.add(new ModelBox(cube_r9, 0, 8, -1.5F, -7.0F, -9.0F, 1, 2, 0, 0.0F, false));

        this.spinerowL3 = new AdvancedModelRendererExtended(this);
        this.spinerowL3.setRotationPoint(0.0F, -5.0F, -7.5F);
        this.bone.addChild(spinerowL3);
        this.setRotateAngle(spinerowL3, 0.0F, -0.1745F, 0.0F);


        this.cube_r10 = new AdvancedModelRendererExtended(this);
        this.cube_r10.setRotationPoint(0.0F, 5.0F, 9.0F);
        this.spinerowL3.addChild(cube_r10);
        this.setRotateAngle(cube_r10, 0.0F, 0.0F, 0.1745F);
        this.cube_r10.cubeList.add(new ModelBox(cube_r10, 10, 4, 2.5F, -6.25F, -9.0F, 1, 1, 0, 0.0F, true));

        this.cube_r11 = new AdvancedModelRendererExtended(this);
        this.cube_r11.setRotationPoint(0.0F, 5.0F, 9.0F);
        this.spinerowL3.addChild(cube_r11);
        this.setRotateAngle(cube_r11, 0.0F, 0.0F, 0.0873F);
        this.cube_r11.cubeList.add(new ModelBox(cube_r11, 7, 0, 1.6F, -6.75F, -9.0F, 1, 2, 0, 0.0F, true));

        this.cube_r12 = new AdvancedModelRendererExtended(this);
        this.cube_r12.setRotationPoint(0.0F, 5.0F, 9.0F);
        this.spinerowL3.addChild(cube_r12);
        this.setRotateAngle(cube_r12, 0.0F, 0.0F, 0.0436F);
        this.cube_r12.cubeList.add(new ModelBox(cube_r12, 0, 8, 0.5F, -7.0F, -9.0F, 1, 2, 0, 0.0F, true));

        this.spinerowR2 = new AdvancedModelRendererExtended(this);
        this.spinerowR2.setRotationPoint(0.0F, -5.0F, -8.0F);
        this.bone.addChild(spinerowR2);


        this.cube_r13 = new AdvancedModelRendererExtended(this);
        this.cube_r13.setRotationPoint(0.0F, 5.0F, 9.0F);
        this.spinerowR2.addChild(cube_r13);
        this.setRotateAngle(cube_r13, 0.0F, 0.0F, -0.1745F);
        this.cube_r13.cubeList.add(new ModelBox(cube_r13, 10, 5, -3.5F, -6.25F, -9.0F, 1, 1, 0, 0.0F, false));

        this.cube_r14 = new AdvancedModelRendererExtended(this);
        this.cube_r14.setRotationPoint(0.0F, 5.0F, 9.0F);
        this.spinerowR2.addChild(cube_r14);
        this.setRotateAngle(cube_r14, 0.0F, 0.0F, -0.0873F);
        this.cube_r14.cubeList.add(new ModelBox(cube_r14, 8, 4, -2.6F, -6.75F, -9.0F, 1, 2, 0, 0.0F, false));

        this.cube_r15 = new AdvancedModelRendererExtended(this);
        this.cube_r15.setRotationPoint(0.0F, 5.0F, 9.0F);
        this.spinerowR2.addChild(cube_r15);
        this.setRotateAngle(cube_r15, 0.0F, 0.0F, -0.0436F);
        this.cube_r15.cubeList.add(new ModelBox(cube_r15, 8, 6, -1.5F, -7.0F, -9.0F, 1, 2, 0, 0.0F, false));

        this.spinerowL2 = new AdvancedModelRendererExtended(this);
        this.spinerowL2.setRotationPoint(0.0F, -5.0F, -8.0F);
        this.bone.addChild(spinerowL2);


        this.cube_r16 = new AdvancedModelRendererExtended(this);
        this.cube_r16.setRotationPoint(0.0F, 5.0F, 9.0F);
        this.spinerowL2.addChild(cube_r16);
        this.setRotateAngle(cube_r16, 0.0F, 0.0F, 0.1745F);
        this.cube_r16.cubeList.add(new ModelBox(cube_r16, 10, 5, 2.5F, -6.25F, -9.0F, 1, 1, 0, 0.0F, true));

        this.cube_r17 = new AdvancedModelRendererExtended(this);
        this.cube_r17.setRotationPoint(0.0F, 5.0F, 9.0F);
        this.spinerowL2.addChild(cube_r17);
        this.setRotateAngle(cube_r17, 0.0F, 0.0F, 0.0873F);
        this.cube_r17.cubeList.add(new ModelBox(cube_r17, 8, 4, 1.6F, -6.75F, -9.0F, 1, 2, 0, 0.0F, true));

        this.cube_r18 = new AdvancedModelRendererExtended(this);
        this.cube_r18.setRotationPoint(0.0F, 5.0F, 9.0F);
        this.spinerowL2.addChild(cube_r18);
        this.setRotateAngle(cube_r18, 0.0F, 0.0F, 0.0436F);
        this.cube_r18.cubeList.add(new ModelBox(cube_r18, 8, 6, 0.5F, -7.0F, -9.0F, 1, 2, 0, 0.0F, true));

        this.spinerowR = new AdvancedModelRendererExtended(this);
        this.spinerowR.setRotationPoint(0.0F, -5.0F, -8.5F);
        this.bone.addChild(spinerowR);
        this.setRotateAngle(spinerowR, 0.0F, -0.1745F, 0.0F);


        this.cube_r19 = new AdvancedModelRendererExtended(this);
        this.cube_r19.setRotationPoint(0.0F, 5.0F, 9.0F);
        this.spinerowR.addChild(cube_r19);
        this.setRotateAngle(cube_r19, 0.0F, 0.0F, -0.1745F);
        this.cube_r19.cubeList.add(new ModelBox(cube_r19, 6, 10, -3.5F, -6.25F, -9.0F, 1, 1, 0, 0.0F, false));

        this.cube_r20 = new AdvancedModelRendererExtended(this);
        this.cube_r20.setRotationPoint(0.0F, 5.0F, 9.0F);
        this.spinerowR.addChild(cube_r20);
        this.setRotateAngle(cube_r20, 0.0F, 0.0F, -0.0873F);
        this.cube_r20.cubeList.add(new ModelBox(cube_r20, 9, 0, -2.6F, -6.75F, -9.0F, 1, 2, 0, 0.0F, false));

        this.cube_r21 = new AdvancedModelRendererExtended(this);
        this.cube_r21.setRotationPoint(0.0F, 5.0F, 9.0F);
        this.spinerowR.addChild(cube_r21);
        this.setRotateAngle(cube_r21, 0.0F, 0.0F, -0.0436F);
        this.cube_r21.cubeList.add(new ModelBox(cube_r21, 10, 2, -1.5F, -7.0F, -9.0F, 1, 2, 0, 0.0F, false));

        this.spinerowL = new AdvancedModelRendererExtended(this);
        this.spinerowL.setRotationPoint(0.0F, -5.0F, -8.5F);
        this.bone.addChild(spinerowL);
        this.setRotateAngle(spinerowL, 0.0F, 0.1745F, 0.0F);


        this.cube_r22 = new AdvancedModelRendererExtended(this);
        this.cube_r22.setRotationPoint(0.0F, 5.0F, 9.0F);
        this.spinerowL.addChild(cube_r22);
        this.setRotateAngle(cube_r22, 0.0F, 0.0F, 0.1745F);
        this.cube_r22.cubeList.add(new ModelBox(cube_r22, 6, 10, 2.5F, -6.25F, -9.0F, 1, 1, 0, 0.0F, true));

        this.cube_r23 = new AdvancedModelRendererExtended(this);
        this.cube_r23.setRotationPoint(0.0F, 5.0F, 9.0F);
        this.spinerowL.addChild(cube_r23);
        this.setRotateAngle(cube_r23, 0.0F, 0.0F, 0.0873F);
        this.cube_r23.cubeList.add(new ModelBox(cube_r23, 9, 0, 1.6F, -6.75F, -9.0F, 1, 2, 0, 0.0F, true));

        this.cube_r24 = new AdvancedModelRendererExtended(this);
        this.cube_r24.setRotationPoint(0.0F, 5.0F, 9.0F);
        this.spinerowL.addChild(cube_r24);
        this.setRotateAngle(cube_r24, 0.0F, 0.0F, 0.0436F);
        this.cube_r24.cubeList.add(new ModelBox(cube_r24, 10, 2, 0.5F, -7.0F, -9.0F, 1, 2, 0, 0.0F, true));

        this.spinerowR4 = new AdvancedModelRendererExtended(this);
        this.spinerowR4.setRotationPoint(0.0F, -5.0F, -7.25F);
        this.bone.addChild(spinerowR4);
        this.setRotateAngle(spinerowR4, 0.0F, 0.3927F, 0.0F);


        this.cube_r25 = new AdvancedModelRendererExtended(this);
        this.cube_r25.setRotationPoint(0.0F, 5.0F, 9.0F);
        this.spinerowR4.addChild(cube_r25);
        this.setRotateAngle(cube_r25, 0.0F, 0.0F, -0.1745F);
        this.cube_r25.cubeList.add(new ModelBox(cube_r25, 7, 2, -3.5F, -6.25F, -9.0F, 1, 1, 0, 0.0F, false));

        this.cube_r26 = new AdvancedModelRendererExtended(this);
        this.cube_r26.setRotationPoint(0.0F, 5.0F, 9.0F);
        this.spinerowR4.addChild(cube_r26);
        this.setRotateAngle(cube_r26, 0.0F, 0.0F, -0.0873F);
        this.cube_r26.cubeList.add(new ModelBox(cube_r26, 4, 4, -2.6F, -6.75F, -9.0F, 1, 2, 0, 0.0F, false));

        this.cube_r27 = new AdvancedModelRendererExtended(this);
        this.cube_r27.setRotationPoint(0.0F, 5.0F, 9.0F);
        this.spinerowR4.addChild(cube_r27);
        this.setRotateAngle(cube_r27, 0.0F, 0.0F, -0.0436F);
        this.cube_r27.cubeList.add(new ModelBox(cube_r27, 6, 4, -1.5F, -7.0F, -9.0F, 1, 2, 0, 0.0F, false));

        this.spinerowL4 = new AdvancedModelRendererExtended(this);
        this.spinerowL4.setRotationPoint(0.0F, -5.0F, -7.25F);
        this.bone.addChild(spinerowL4);
        this.setRotateAngle(spinerowL4, 0.0F, -0.3927F, 0.0F);


        this.cube_r28 = new AdvancedModelRendererExtended(this);
        this.cube_r28.setRotationPoint(0.0F, 5.0F, 9.0F);
        this.spinerowL4.addChild(cube_r28);
        this.setRotateAngle(cube_r28, 0.0F, 0.0F, 0.1745F);
        this.cube_r28.cubeList.add(new ModelBox(cube_r28, 7, 2, 2.5F, -6.25F, -9.0F, 1, 1, 0, 0.0F, true));

        this.cube_r29 = new AdvancedModelRendererExtended(this);
        this.cube_r29.setRotationPoint(0.0F, 5.0F, 9.0F);
        this.spinerowL4.addChild(cube_r29);
        this.setRotateAngle(cube_r29, 0.0F, 0.0F, 0.0873F);
        this.cube_r29.cubeList.add(new ModelBox(cube_r29, 4, 4, 1.6F, -6.75F, -9.0F, 1, 2, 0, 0.0F, true));

        this.cube_r30 = new AdvancedModelRendererExtended(this);
        this.cube_r30.setRotationPoint(0.0F, 5.0F, 9.0F);
        this.spinerowL4.addChild(cube_r30);
        this.setRotateAngle(cube_r30, 0.0F, 0.0F, 0.0436F);
        this.cube_r30.cubeList.add(new ModelBox(cube_r30, 6, 4, 0.5F, -7.0F, -9.0F, 1, 2, 0, 0.0F, true));

        this.spinerowR6 = new AdvancedModelRendererExtended(this);
        this.spinerowR6.setRotationPoint(-0.75F, -4.25F, -7.0F);
        this.bone.addChild(spinerowR6);
        this.setRotateAngle(spinerowR6, 0.0F, 1.309F, 0.0F);
        this.spinerowR6.cubeList.add(new ModelBox(spinerowR6, 28, 16, -8.25F, -1.0F, 0.0F, 7, 1, 0, 0.0F, false));

        this.spinerowL6 = new AdvancedModelRendererExtended(this);
        this.spinerowL6.setRotationPoint(0.75F, -4.25F, -7.0F);
        this.bone.addChild(spinerowL6);
        this.setRotateAngle(spinerowL6, 0.0F, -1.309F, 0.0F);
        this.spinerowL6.cubeList.add(new ModelBox(spinerowL6, 28, 16, 1.25F, -1.0F, 0.0F, 7, 1, 0, 0.0F, true));

        updateDefaultPose();
    }

    @Override
    public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        this.bone.render(f5 );
    }
    public void renderStaticDisplayCase(float f) {
        this.bone.render(0.01F);
        resetToDefaultPose();
    }
    public void renderStaticFloor(float f) {
        this.bone.offsetY = -0.3F;
        this.bone.offsetZ = 0.02F;
        this.bone.render(0.01F);
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
        //this.bone.offsetY = 1.3F;
        //this.bone.rotateAngleY = (float) Math.toRadians(180);
        //this.body.offsetZ = -1F;

        AdvancedModelRendererExtended[] topRightT = {this.arm, this.arms};
        AdvancedModelRendererExtended[] topLeftT = {this.arm2, this.arms2};
        AdvancedModelRendererExtended[] centerRightT = {this.arm4, this.arms4};
        AdvancedModelRendererExtended[] centerLeftT = {this.arm3, this.arms3};
        AdvancedModelRendererExtended[] bottomRightT = {this.arm5, this.arms5};
        AdvancedModelRendererExtended[] bottomLeftT = {this.arm6, this.arms6};
        AdvancedModelRendererExtended[] bottomMidRightT = {this.arm8, this.arms8};
        AdvancedModelRendererExtended[] bottomMidLeftT = {this.arm7, this.arms7};

        AdvancedModelRendererExtended[] finL = {this.finL, this.finL2, this.finL3, this.finL4};
        AdvancedModelRendererExtended[] finR = {this.finR1, this.finR2, this.finR3, this.finR4};

        float speed = 0.10F;
        if (!e.isInWater()) {
            speed = 0.5F;
        }

        this.chainFlap(finL, speed*2F, 0.15F, 0, f2, 1F);
        this.chainFlap(finR, speed*2F, -0.15F, 0, f2, 1F);

        //Left middle:
        this.chainSwing(centerLeftT, speed, -0.3F, -2, f2, 1F);
        //Left lower middle:
        this.chainWave(bottomLeftT, speed, 0.3F, -1.5, f2, 1F);
        this.chainSwing(bottomLeftT, speed, -0.3F, -1.5, f2, 1F);
        //Left lower bottom:
        this.chainWave(bottomMidLeftT, speed, 0.25F, -2, f2, 1F);
        this.chainSwing(bottomMidLeftT, speed, -0.1F, -1.5, f2, 1F);
        //Left upper top:
        this.chainWave(topLeftT, speed, -0.25F, -2, f2, 1F);
        this.chainSwing(topLeftT, speed, -0.1F, -1.5, f2, 1F);

        //Right middle:
        this.chainSwing(centerRightT, speed, 0.3F, -2, f2, 1F);
        //Right lower middle:
        this.chainWave(bottomRightT, speed, 0.3F, -1.5, f2, 1F);
        this.chainSwing(bottomRightT, speed, 0.3F, -1.5, f2, 1F);
        //Right lower bottom:
        this.chainWave(bottomMidRightT, speed, 0.25F, -2, f2, 1F);
        this.chainSwing(bottomMidRightT, speed, 0.1F, -1.5, f2, 1F);
        //Right upper top:
        this.chainWave(topRightT, speed, -0.25F, -2, f2, 1F);
        this.chainSwing(topRightT, speed, 0.1F, -1.5, f2, 1F);

        if (e.isInWater()) {
            float bobSpeed = 0.1F;
            this.bob(bone, bobSpeed, 0.8F, false, f2, 2);
            this.bone.offsetZ = this.moveBoxExtended(speed, 0.125F, false, 0, f2, 1);
        }
            //this.bone.rotateAngleZ = (float) Math.toRadians(90);
            //this.bone.offsetY = 1.25F;
        

    }

}
