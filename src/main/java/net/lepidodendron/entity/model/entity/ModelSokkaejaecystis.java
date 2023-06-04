package net.lepidodendron.entity.model.entity;

import net.ilexiconn.llibrary.client.model.tools.AdvancedModelBase;
import net.ilexiconn.llibrary.client.model.tools.AdvancedModelRenderer;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLiving;

public class ModelSokkaejaecystis extends AdvancedModelBase {
    private final AdvancedModelRenderer main;
    private final AdvancedModelRenderer cube_r1;
    private final AdvancedModelRenderer cube_r2;
    private final AdvancedModelRenderer cube_r3;
    private final AdvancedModelRenderer cube_r4;
    private final AdvancedModelRenderer cube_r5;
    private final AdvancedModelRenderer cube_r6;
    private final AdvancedModelRenderer cube_r7;
    private final AdvancedModelRenderer front;
    private final AdvancedModelRenderer cube_r8;
    private final AdvancedModelRenderer cube_r9;
    private final AdvancedModelRenderer arm1;
    private final AdvancedModelRenderer rightfin;
    private final AdvancedModelRenderer leftfin;
    private final AdvancedModelRenderer leftfin2;
    private final AdvancedModelRenderer leftfin3;
    private final AdvancedModelRenderer rightfin2;
    private final AdvancedModelRenderer rightfin3;
    private final AdvancedModelRenderer arm2;
    private final AdvancedModelRenderer rightfin4;
    private final AdvancedModelRenderer leftfin4;
    private final AdvancedModelRenderer rightfin5;
    private final AdvancedModelRenderer leftfin5;
    private final AdvancedModelRenderer rightfin6;
    private final AdvancedModelRenderer leftfin6;
    private final AdvancedModelRenderer arm3;
    private final AdvancedModelRenderer leftfin7;
    private final AdvancedModelRenderer rightfin7;
    private final AdvancedModelRenderer leftfin8;
    private final AdvancedModelRenderer rightfin8;
    private final AdvancedModelRenderer notmove;
    private final AdvancedModelRenderer cube_r10;
    private final AdvancedModelRenderer cube_r11;
    private final AdvancedModelRenderer cube_r12;
    private final AdvancedModelRenderer cube_r13;
    private final AdvancedModelRenderer cube_r14;
    private final AdvancedModelRenderer cube_r15;
    private final AdvancedModelRenderer cube_r16;
    private final AdvancedModelRenderer cube_r17;
    private final AdvancedModelRenderer cube_r18;
    private final AdvancedModelRenderer cube_r19;
    private final AdvancedModelRenderer cube_r20;

    public ModelSokkaejaecystis() {
        this.textureWidth = 32;
        this.textureHeight = 32;

        this.main = new AdvancedModelRenderer(this);
        this.main.setRotationPoint(3.0F, 24.0F, 10.0F);
        this.main.cubeList.add(new ModelBox(main, 0, 10, -4.5F, -1.0F, -5.0F, 4, 1, 5, 0.01F, false));

        this.cube_r1 = new AdvancedModelRenderer(this);
        this.cube_r1.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.main.addChild(cube_r1);
        this.setRotateAngle(cube_r1, 0.0F, -0.2182F, 0.0F);
        this.cube_r1.cubeList.add(new ModelBox(cube_r1, 10, 24, -3.75F, -1.0F, -0.15F, 2, 1, 1, 0.0F, false));

        this.cube_r2 = new AdvancedModelRenderer(this);
        this.cube_r2.setRotationPoint(-0.2F, 0.0F, 0.0F);
        this.main.addChild(cube_r2);
        this.setRotateAngle(cube_r2, 0.0F, -0.1309F, 0.0F);
        this.cube_r2.cubeList.add(new ModelBox(cube_r2, 0, 26, -1.85F, -1.0F, 3.25F, 2, 1, 1, -0.02F, false));
        this.cube_r2.cubeList.add(new ModelBox(cube_r2, 16, 0, -1.85F, -1.0F, -0.25F, 2, 1, 4, -0.01F, false));

        this.cube_r3 = new AdvancedModelRenderer(this);
        this.cube_r3.setRotationPoint(-4.5F, 0.0F, -5.0F);
        this.main.addChild(cube_r3);
        this.setRotateAngle(cube_r3, 0.0F, -0.5672F, 0.0F);
        this.cube_r3.cubeList.add(new ModelBox(cube_r3, 22, 10, 0.0F, -1.0F, 0.0F, 2, 1, 2, 0.0F, false));

        this.cube_r4 = new AdvancedModelRenderer(this);
        this.cube_r4.setRotationPoint(-4.5F, 0.0F, 0.0F);
        this.main.addChild(cube_r4);
        this.setRotateAngle(cube_r4, 0.0F, 0.3927F, 0.0F);
        this.cube_r4.cubeList.add(new ModelBox(cube_r4, 14, 17, 0.2F, -1.0F, -3.475F, 2, 1, 3, -0.01F, false));

        this.cube_r5 = new AdvancedModelRenderer(this);
        this.cube_r5.setRotationPoint(-3.2F, 0.0F, -10.0F);
        this.main.addChild(cube_r5);
        this.setRotateAngle(cube_r5, 0.0F, -0.2531F, 0.0F);
        this.cube_r5.cubeList.add(new ModelBox(cube_r5, 0, 16, 3.95F, -1.0F, 7.5F, 2, 1, 4, 0.0F, false));

        this.cube_r6 = new AdvancedModelRenderer(this);
        this.cube_r6.setRotationPoint(-3.0F, 0.0F, -10.0F);
        this.main.addChild(cube_r6);
        this.setRotateAngle(cube_r6, 0.0F, 0.7418F, 0.0F);
        this.cube_r6.cubeList.add(new ModelBox(cube_r6, 0, 13, -2.55F, -1.0F, 5.425F, 1, 1, 1, 0.0F, false));

        this.cube_r7 = new AdvancedModelRenderer(this);
        this.cube_r7.setRotationPoint(-3.0F, 0.0F, -10.0F);
        this.main.addChild(cube_r7);
        this.setRotateAngle(cube_r7, 0.0F, 0.1745F, 0.0F);
        this.cube_r7.cubeList.add(new ModelBox(cube_r7, 16, 5, 0.35F, -1.0F, 6.25F, 2, 1, 3, -0.01F, false));

        this.front = new AdvancedModelRenderer(this);
        this.front.setRotationPoint(-3.0F, -0.5F, -5.0F);
        this.main.addChild(front);
        this.front.cubeList.add(new ModelBox(front, 13, 11, -1.0F, -0.5F, -5.0F, 2, 1, 5, 0.0F, false));

        this.cube_r8 = new AdvancedModelRenderer(this);
        this.cube_r8.setRotationPoint(1.0F, 0.5F, -1.25F);
        this.front.addChild(cube_r8);
        this.setRotateAngle(cube_r8, 0.0F, 0.3054F, 0.0F);
        this.cube_r8.cubeList.add(new ModelBox(cube_r8, 0, 1, -0.5F, -1.0F, 0.0F, 1, 1, 0, 0.0F, true));
        this.cube_r8.cubeList.add(new ModelBox(cube_r8, 0, 1, 0.0F, -1.0F, -1.0F, 1, 1, 0, 0.0F, true));
        this.cube_r8.cubeList.add(new ModelBox(cube_r8, 0, 1, 0.0F, -1.0F, -1.65F, 1, 1, 0, 0.0F, true));
        this.cube_r8.cubeList.add(new ModelBox(cube_r8, 0, 1, 0.25F, -1.0F, -3.0F, 1, 1, 0, 0.0F, true));
        this.cube_r8.cubeList.add(new ModelBox(cube_r8, 0, 1, 0.0F, -1.0F, -2.35F, 1, 1, 0, 0.0F, true));

        this.cube_r9 = new AdvancedModelRenderer(this);
        this.cube_r9.setRotationPoint(-1.0F, 0.5F, -1.25F);
        this.front.addChild(cube_r9);
        this.setRotateAngle(cube_r9, 0.0F, -0.3054F, 0.0F);
        this.cube_r9.cubeList.add(new ModelBox(cube_r9, 0, 1, -1.25F, -1.0F, -3.0F, 1, 1, 0, 0.0F, false));
        this.cube_r9.cubeList.add(new ModelBox(cube_r9, 0, 1, -1.0F, -1.0F, -2.35F, 1, 1, 0, 0.0F, false));
        this.cube_r9.cubeList.add(new ModelBox(cube_r9, 0, 1, -1.0F, -1.0F, -1.65F, 1, 1, 0, 0.0F, false));
        this.cube_r9.cubeList.add(new ModelBox(cube_r9, 0, 1, -1.0F, -1.0F, -1.0F, 1, 1, 0, 0.0F, false));
        this.cube_r9.cubeList.add(new ModelBox(cube_r9, 0, 1, -0.5F, -1.0F, 0.0F, 1, 1, 0, 0.0F, false));

        this.arm1 = new AdvancedModelRenderer(this);
        this.arm1.setRotationPoint(0.0F, 0.0F, -5.0F);
        this.front.addChild(arm1);
        this.arm1.cubeList.add(new ModelBox(arm1, 21, 18, -0.5F, -0.5F, -3.0F, 1, 1, 3, 0.01F, false));

        this.rightfin = new AdvancedModelRenderer(this);
        this.rightfin.setRotationPoint(-0.5F, 0.0F, -0.1F);
        this.arm1.addChild(rightfin);
        this.setRotateAngle(rightfin, 0.0436F, -0.1745F, -0.1745F);
        this.rightfin.cubeList.add(new ModelBox(rightfin, 0, 0, -0.9F, 0.0F, -1.0F, 1, 0, 1, 0.0F, false));

        this.leftfin = new AdvancedModelRenderer(this);
        this.leftfin.setRotationPoint(0.5F, 0.0F, -0.1F);
        this.arm1.addChild(leftfin);
        this.setRotateAngle(leftfin, 0.0436F, 0.1745F, 0.1745F);
        this.leftfin.cubeList.add(new ModelBox(leftfin, 0, 0, -0.1F, 0.0F, -1.0F, 1, 0, 1, 0.0F, true));

        this.leftfin2 = new AdvancedModelRenderer(this);
        this.leftfin2.setRotationPoint(0.5F, 0.0F, -1.1F);
        this.arm1.addChild(leftfin2);
        this.setRotateAngle(leftfin2, 0.0436F, 0.1745F, 0.1745F);
        this.leftfin2.cubeList.add(new ModelBox(leftfin2, -1, 28, -0.1F, 0.0F, -1.0F, 1, 0, 1, 0.0F, true));

        this.leftfin3 = new AdvancedModelRenderer(this);
        this.leftfin3.setRotationPoint(0.5F, 0.0F, -2.1F);
        this.arm1.addChild(leftfin3);
        this.setRotateAngle(leftfin3, 0.0436F, 0.1745F, 0.1745F);
        this.leftfin3.cubeList.add(new ModelBox(leftfin3, 0, 0, -0.1F, 0.0F, -1.0F, 1, 0, 1, 0.0F, true));

        this.rightfin2 = new AdvancedModelRenderer(this);
        this.rightfin2.setRotationPoint(-0.5F, 0.0F, -1.1F);
        this.arm1.addChild(rightfin2);
        this.setRotateAngle(rightfin2, 0.0436F, -0.1745F, -0.1745F);
        this.rightfin2.cubeList.add(new ModelBox(rightfin2, -1, 28, -0.9F, 0.0F, -1.0F, 1, 0, 1, 0.0F, false));

        this.rightfin3 = new AdvancedModelRenderer(this);
        this.rightfin3.setRotationPoint(-0.5F, 0.0F, -2.1F);
        this.arm1.addChild(rightfin3);
        this.setRotateAngle(rightfin3, 0.0436F, -0.1745F, -0.1745F);
        this.rightfin3.cubeList.add(new ModelBox(rightfin3, 0, 0, -0.9F, 0.0F, -1.0F, 1, 0, 1, 0.0F, false));

        this.arm2 = new AdvancedModelRenderer(this);
        this.arm2.setRotationPoint(0.0F, 0.0F, -3.0F);
        this.arm1.addChild(arm2);
        this.arm2.cubeList.add(new ModelBox(arm2, 15, 21, -0.5F, -0.5F, -3.0F, 1, 1, 3, 0.0F, false));

        this.rightfin4 = new AdvancedModelRenderer(this);
        this.rightfin4.setRotationPoint(-0.5F, 0.0F, -0.1F);
        this.arm2.addChild(rightfin4);
        this.setRotateAngle(rightfin4, 0.0436F, -0.1745F, -0.1745F);
        this.rightfin4.cubeList.add(new ModelBox(rightfin4, -1, 28, -0.8F, 0.0F, -1.0F, 1, 0, 1, 0.0F, false));

        this.leftfin4 = new AdvancedModelRenderer(this);
        this.leftfin4.setRotationPoint(0.5F, 0.0F, -0.1F);
        this.arm2.addChild(leftfin4);
        this.setRotateAngle(leftfin4, 0.0436F, 0.1745F, 0.1745F);
        this.leftfin4.cubeList.add(new ModelBox(leftfin4, -1, 28, -0.2F, 0.0F, -1.0F, 1, 0, 1, 0.0F, true));

        this.rightfin5 = new AdvancedModelRenderer(this);
        this.rightfin5.setRotationPoint(-0.5F, 0.0F, -1.1F);
        this.arm2.addChild(rightfin5);
        this.setRotateAngle(rightfin5, 0.0436F, -0.1745F, -0.1745F);
        this.rightfin5.cubeList.add(new ModelBox(rightfin5, 0, 0, -0.7F, 0.0F, -1.0F, 1, 0, 1, 0.0F, false));

        this.leftfin5 = new AdvancedModelRenderer(this);
        this.leftfin5.setRotationPoint(0.5F, 0.0F, -1.1F);
        this.arm2.addChild(leftfin5);
        this.setRotateAngle(leftfin5, 0.0436F, 0.1745F, 0.1745F);
        this.leftfin5.cubeList.add(new ModelBox(leftfin5, 0, 0, -0.3F, 0.0F, -1.0F, 1, 0, 1, 0.0F, true));

        this.rightfin6 = new AdvancedModelRenderer(this);
        this.rightfin6.setRotationPoint(-0.5F, 0.0F, -2.1F);
        this.arm2.addChild(rightfin6);
        this.setRotateAngle(rightfin6, 0.0436F, -0.1745F, -0.1745F);
        this.rightfin6.cubeList.add(new ModelBox(rightfin6, -1, 28, -0.55F, 0.0F, -1.0F, 1, 0, 1, 0.0F, false));

        this.leftfin6 = new AdvancedModelRenderer(this);
        this.leftfin6.setRotationPoint(0.5F, 0.0F, -2.1F);
        this.arm2.addChild(leftfin6);
        this.setRotateAngle(leftfin6, 0.0436F, 0.1745F, 0.1745F);
        this.leftfin6.cubeList.add(new ModelBox(leftfin6, -1, 28, -0.45F, 0.0F, -1.0F, 1, 0, 1, 0.0F, true));

        this.arm3 = new AdvancedModelRenderer(this);
        this.arm3.setRotationPoint(0.0F, 0.0F, -3.0F);
        this.arm2.addChild(arm3);
        this.arm3.cubeList.add(new ModelBox(arm3, 6, 24, -0.5F, -0.5F, -2.0F, 1, 1, 2, 0.01F, false));

        this.leftfin7 = new AdvancedModelRenderer(this);
        this.leftfin7.setRotationPoint(0.5F, 0.0F, -0.1F);
        this.arm3.addChild(leftfin7);
        this.setRotateAngle(leftfin7, 0.0436F, 0.1745F, 0.1745F);
        this.leftfin7.cubeList.add(new ModelBox(leftfin7, 0, 0, -0.6F, 0.0F, -1.0F, 1, 0, 1, 0.0F, true));

        this.rightfin7 = new AdvancedModelRenderer(this);
        this.rightfin7.setRotationPoint(-0.5F, 0.0F, -0.1F);
        this.arm3.addChild(rightfin7);
        this.setRotateAngle(rightfin7, 0.0436F, -0.1745F, -0.1745F);
        this.rightfin7.cubeList.add(new ModelBox(rightfin7, 0, 0, -0.4F, 0.0F, -1.0F, 1, 0, 1, 0.0F, false));

        this.leftfin8 = new AdvancedModelRenderer(this);
        this.leftfin8.setRotationPoint(0.5F, 0.0F, -1.1F);
        this.arm3.addChild(leftfin8);
        this.setRotateAngle(leftfin8, 0.0436F, 0.1745F, 0.1745F);
        this.leftfin8.cubeList.add(new ModelBox(leftfin8, -1, 28, -0.7F, 0.0F, -1.0F, 1, 0, 1, 0.0F, true));

        this.rightfin8 = new AdvancedModelRenderer(this);
        this.rightfin8.setRotationPoint(-0.5F, 0.0F, -1.1F);
        this.arm3.addChild(rightfin8);
        this.setRotateAngle(rightfin8, 0.0436F, -0.1745F, -0.1745F);
        this.rightfin8.cubeList.add(new ModelBox(rightfin8, -1, 28, -0.3F, 0.0F, -1.0F, 1, 0, 1, 0.0F, false));

        this.notmove = new AdvancedModelRenderer(this);
        this.notmove.setRotationPoint(-12.1F, 0.1F, -10.0F);
        this.main.addChild(notmove);


        this.cube_r10 = new AdvancedModelRenderer(this);
        this.cube_r10.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.notmove.addChild(cube_r10);
        this.setRotateAngle(cube_r10, 0.0F, -0.3927F, 0.0F);
        this.cube_r10.cubeList.add(new ModelBox(cube_r10, 3, 0, 7.75F, -0.5F, 3.6F, 1, 0, 2, 0.0F, false));
        this.cube_r10.cubeList.add(new ModelBox(cube_r10, 2, 3, 8.5F, -0.525F, 4.6F, 1, 0, 2, 0.0F, false));
        this.cube_r10.cubeList.add(new ModelBox(cube_r10, 0, 6, 9.5F, -0.5F, 5.85F, 1, 0, 2, 0.0F, false));
        this.cube_r10.cubeList.add(new ModelBox(cube_r10, 2, 6, 10.5F, -0.525F, 6.35F, 1, 0, 2, 0.0F, false));

        this.cube_r11 = new AdvancedModelRenderer(this);
        this.cube_r11.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.notmove.addChild(cube_r11);
        this.setRotateAngle(cube_r11, 0.0F, -0.1309F, 0.0F);
        this.cube_r11.cubeList.add(new ModelBox(cube_r11, 22, 13, 8.0F, -1.0F, 8.6F, 3, 1, 1, 0.01F, false));
        this.cube_r11.cubeList.add(new ModelBox(cube_r11, 20, 22, 7.65F, -1.0F, 3.25F, 3, 1, 1, 0.0F, false));
        this.cube_r11.cubeList.add(new ModelBox(cube_r11, 0, 24, 7.65F, -1.0F, 3.0F, 3, 1, 1, -0.01F, false));

        this.cube_r12 = new AdvancedModelRenderer(this);
        this.cube_r12.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.notmove.addChild(cube_r12);
        this.setRotateAngle(cube_r12, 0.0F, 0.3491F, 0.0F);
        this.cube_r12.cubeList.add(new ModelBox(cube_r12, 8, 17, 2.95F, -1.0F, 8.1F, 1, 1, 4, 0.0F, false));

        this.cube_r13 = new AdvancedModelRenderer(this);
        this.cube_r13.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.notmove.addChild(cube_r13);
        this.setRotateAngle(cube_r13, 0.0F, 0.8727F, 0.0F);
        this.cube_r13.cubeList.add(new ModelBox(cube_r13, 23, 5, -1.5F, -1.0F, 8.3F, 3, 1, 1, 0.01F, false));

        this.cube_r14 = new AdvancedModelRenderer(this);
        this.cube_r14.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.notmove.addChild(cube_r14);
        this.setRotateAngle(cube_r14, 0.0F, 0.48F, 0.0F);
        this.cube_r14.cubeList.add(new ModelBox(cube_r14, 24, 2, 2.25F, -1.0F, 7.2F, 2, 1, 1, 0.0F, false));

        this.cube_r15 = new AdvancedModelRenderer(this);
        this.cube_r15.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.notmove.addChild(cube_r15);
        this.setRotateAngle(cube_r15, 0.0F, -0.7854F, 0.0F);
        this.cube_r15.cubeList.add(new ModelBox(cube_r15, 0, 21, 11.4F, -1.0F, -6.0F, 3, 1, 2, 0.0F, false));

        this.cube_r16 = new AdvancedModelRenderer(this);
        this.cube_r16.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.notmove.addChild(cube_r16);
        this.setRotateAngle(cube_r16, 0.0F, 0.0873F, 0.0F);
        this.cube_r16.cubeList.add(new ModelBox(cube_r16, 10, 22, 8.85F, -1.0F, 4.95F, 3, 1, 1, 0.01F, false));
        this.cube_r16.cubeList.add(new ModelBox(cube_r16, 24, 0, 8.85F, -1.0F, 5.45F, 3, 1, 1, -0.01F, false));

        this.cube_r17 = new AdvancedModelRenderer(this);
        this.cube_r17.setRotationPoint(10.0F, 0.0F, 5.0F);
        this.notmove.addChild(cube_r17);
        this.setRotateAngle(cube_r17, 0.0F, 0.1745F, 0.0F);
        this.cube_r17.cubeList.add(new ModelBox(cube_r17, 0, 3, 2.25F, -1.0F, 2.15F, 1, 1, 2, 0.01F, false));

        this.cube_r18 = new AdvancedModelRenderer(this);
        this.cube_r18.setRotationPoint(10.0F, -0.5F, 5.0F);
        this.notmove.addChild(cube_r18);
        this.setRotateAngle(cube_r18, 0.0F, -0.4363F, 0.0F);
        this.cube_r18.cubeList.add(new ModelBox(cube_r18, 0, 0, 1.9F, 0.0F, 5.9F, 1, 0, 3, 0.0F, false));

        this.cube_r19 = new AdvancedModelRenderer(this);
        this.cube_r19.setRotationPoint(10.0F, -0.5F, 5.0F);
        this.notmove.addChild(cube_r19);
        this.setRotateAngle(cube_r19, 0.0F, -0.3054F, 0.0F);
        this.cube_r19.cubeList.add(new ModelBox(cube_r19, 0, 9, 1.4F, -0.05F, 8.15F, 1, 0, 2, 0.0F, false));
        this.cube_r19.cubeList.add(new ModelBox(cube_r19, 0, 11, 3.75F, -0.05F, 7.15F, 1, 0, 2, 0.0F, false));
        this.cube_r19.cubeList.add(new ModelBox(cube_r19, 0, 0, 3.25F, 0.0F, -0.1F, 3, 0, 8, 0.0F, false));
        this.cube_r19.cubeList.add(new ModelBox(cube_r19, 0, 2, 3.75F, -0.5F, 2.15F, 1, 1, 6, 0.0F, false));

        this.cube_r20 = new AdvancedModelRenderer(this);
        this.cube_r20.setRotationPoint(10.0F, 0.0F, 5.0F);
        this.notmove.addChild(cube_r20);
        this.setRotateAngle(cube_r20, 0.0F, -0.0873F, 0.0F);
        this.cube_r20.cubeList.add(new ModelBox(cube_r20, 5, 0, -0.5F, -1.0F, -0.1F, 1, 1, 9, 0.0F, false));

        updateDefaultPose();
    }

    @Override
    public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        this.main.render(f5);
    }
    public void renderStatic(float f) {
        //GlStateManager.pushMatrix();
        //GlStateManager.enableBlend();
        //GlStateManager.disableCull();
        //GlStateManager.blendFunc(GlStateManager.SourceFactor.SRC_ALPHA, GlStateManager.DestFactor.ONE_MINUS_SRC_ALPHA);
        this.main.offsetZ = -0.08F;
        this.main.render(0.021F);
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
        //this.body.offsetY = 1.1F;
        //this.Gills.rotateAngleY = f3 / (180F / (float) Math.PI);
        //this.Gills.rotateAngleX = f4 / (180F / (float) Math.PI);

        //this.Tailfin.setScale(1.1F, 1.1F, 1.1F);
        AdvancedModelRenderer[] fishTail = {this.arm1, this.arm2, this.arm3};
        //AdvancedModelRenderer[] appendage = {this.arm, this.arm2, this.arm3, this.arm4};
        float speed = 0.2F;
        if (!e.isInWater()) {
            speed = 0.5F;
        }
        if (e instanceof EntityLiving && !((EntityLiving) e).isAIDisabled()) {
            if (!e.isInWater()) {
                this.main.offsetY = -0;
                return;
                //this.body.rotateAngleZ = (float) Math.toRadians(90);
                //this.body.offsetY = 1.2F;
                //this.bob(main, -speed, 5F, false, f2, 1);
            }
            //this.main.offsetY = -0.15F;
            this.chainWave(fishTail, speed * 5, 0.1F, -3, f2, 1);
            this.chainSwing(fishTail, speed*5, 0.2F, -3, f2, 1);
           // this.chainSwing(appendage, speed/5, 0.4F, 0, f2, 1);



            this.swing(main, speed, 0.06F, true, 0, 0, f2, 1);

        }
    }
}
