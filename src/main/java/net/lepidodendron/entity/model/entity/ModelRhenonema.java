package net.lepidodendron.entity.model.entity;

import net.ilexiconn.llibrary.client.model.tools.AdvancedModelRenderer;
import net.lepidodendron.entity.base.EntityPrehistoricFloraAgeableBase;
import net.lepidodendron.entity.model.ModelBasePalaeopedia;
import net.minecraft.block.material.Material;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLiving;
import net.minecraft.util.math.BlockPos;

public class ModelRhenonema extends ModelBasePalaeopedia {
    private final AdvancedModelRenderer main;
    private final AdvancedModelRenderer cube_r1;
    private final AdvancedModelRenderer cube_r2;
    private final AdvancedModelRenderer cube_r3;
    private final AdvancedModelRenderer cube_r4;
    private final AdvancedModelRenderer cube_r5;
    private final AdvancedModelRenderer cube_r6;
    private final AdvancedModelRenderer cube_r7;
    private final AdvancedModelRenderer cube_r8;
    private final AdvancedModelRenderer cube_r9;
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
    private final AdvancedModelRenderer cube_r21;
    private final AdvancedModelRenderer cube_r22;
    private final AdvancedModelRenderer cube_r23;
    private final AdvancedModelRenderer cube_r24;
    private final AdvancedModelRenderer cube_r25;
    private final AdvancedModelRenderer cube_r26;
    private final AdvancedModelRenderer cube_r27;
    private final AdvancedModelRenderer cube_r28;
    private final AdvancedModelRenderer cube_r29;
    private final AdvancedModelRenderer cube_r30;
    private final AdvancedModelRenderer cube_r31;
    private final AdvancedModelRenderer cube_r32;
    private final AdvancedModelRenderer cube_r33;
    private final AdvancedModelRenderer cube_r34;
    private final AdvancedModelRenderer cube_r35;
    private final AdvancedModelRenderer frontLeftFin;
    private final AdvancedModelRenderer frontRightFin;
    private final AdvancedModelRenderer jaw;
    private final AdvancedModelRenderer cube_r36;
    private final AdvancedModelRenderer cube_r37;
    private final AdvancedModelRenderer tail;
    private final AdvancedModelRenderer cube_r38;
    private final AdvancedModelRenderer cube_r39;
    private final AdvancedModelRenderer backLeftFin;
    private final AdvancedModelRenderer backRightFin;
    private final AdvancedModelRenderer tail2;
    private final AdvancedModelRenderer cube_r40;
    private final AdvancedModelRenderer cube_r41;
    private final AdvancedModelRenderer tail3;
    private final AdvancedModelRenderer cube_r42;
    private final AdvancedModelRenderer tail4;
    private final AdvancedModelRenderer cube_r43;

    public ModelRhenonema() {
        this.textureWidth = 72;
        this.textureHeight = 72;

        this.main = new AdvancedModelRenderer(this);
        this.main.setRotationPoint(0.0F, 24.0F, 0.0F);
        this.main.cubeList.add(new ModelBox(main, 19, 3, -3.0F, -2.8F, -3.8F, 6, 2, 4, -0.01F, false));
        this.main.cubeList.add(new ModelBox(main, 17, 43, -2.5F, -7.8F, 0.2F, 5, 2, 3, 0.0F, false));

        this.cube_r1 = new AdvancedModelRenderer(this);
        this.cube_r1.setRotationPoint(-1.0F, -0.8F, -3.8F);
        this.main.addChild(cube_r1);
        this.setRotateAngle(cube_r1, -0.3054F, 0.0F, 0.0F);
        this.cube_r1.cubeList.add(new ModelBox(cube_r1, 0, 33, -1.5F, -2.0F, -4.0F, 5, 2, 4, 0.0F, false));

        this.cube_r2 = new AdvancedModelRenderer(this);
        this.cube_r2.setRotationPoint(-1.5F, -2.8097F, -9.3041F);
        this.main.addChild(cube_r2);
        this.setRotateAngle(cube_r2, -0.24F, 0.0F, 0.0F);
        this.cube_r2.cubeList.add(new ModelBox(cube_r2, 57, 0, -0.5F, -1.0F, 0.0F, 4, 1, 2, 0.006F, false));

        this.cube_r3 = new AdvancedModelRenderer(this);
        this.cube_r3.setRotationPoint(0.6F, -2.6024F, -9.2639F);
        this.main.addChild(cube_r3);
        this.setRotateAngle(cube_r3, -0.1309F, 0.0F, 0.0F);
        this.cube_r3.cubeList.add(new ModelBox(cube_r3, 62, 45, -1.975F, -1.05F, 0.0F, 0, 1, 1, 0.0F, true));
        this.cube_r3.cubeList.add(new ModelBox(cube_r3, 62, 45, 0.775F, -1.05F, 0.0F, 0, 1, 1, 0.0F, false));

        this.cube_r4 = new AdvancedModelRenderer(this);
        this.cube_r4.setRotationPoint(0.6F, -3.3434F, -9.9804F);
        this.main.addChild(cube_r4);
        this.setRotateAngle(cube_r4, 0.5236F, 0.0F, 0.0F);
        this.cube_r4.cubeList.add(new ModelBox(cube_r4, 33, 49, -2.0F, 0.0F, 0.0F, 0, 1, 1, 0.0F, true));
        this.cube_r4.cubeList.add(new ModelBox(cube_r4, 33, 49, 0.8F, 0.0F, 0.0F, 0, 1, 1, 0.0F, false));

        this.cube_r5 = new AdvancedModelRenderer(this);
        this.cube_r5.setRotationPoint(0.5F, -2.9807F, -8.8342F);
        this.main.addChild(cube_r5);
        this.setRotateAngle(cube_r5, 0.3491F, 0.0F, 0.0F);
        this.cube_r5.cubeList.add(new ModelBox(cube_r5, 57, 13, -1.5F, -0.75F, -0.85F, 2, 1, 0, 0.0F, false));
        this.cube_r5.cubeList.add(new ModelBox(cube_r5, 57, 39, -2.0F, -1.0F, -1.0F, 3, 1, 1, 0.0F, false));

        this.cube_r6 = new AdvancedModelRenderer(this);
        this.cube_r6.setRotationPoint(0.0F, -4.3935F, -8.8959F);
        this.main.addChild(cube_r6);
        this.setRotateAngle(cube_r6, 0.829F, 0.0F, 0.0F);
        this.cube_r6.cubeList.add(new ModelBox(cube_r6, 57, 60, -1.5F, 0.0F, -1.0F, 3, 1, 1, 0.003F, false));

        this.cube_r7 = new AdvancedModelRenderer(this);
        this.cube_r7.setRotationPoint(-1.4523F, -4.0795F, -8.0962F);
        this.main.addChild(cube_r7);
        this.setRotateAngle(cube_r7, 0.3537F, -0.5421F, 0.6932F);
        this.cube_r7.cubeList.add(new ModelBox(cube_r7, 62, 42, -0.575F, -0.4F, -0.55F, 1, 1, 1, 0.0F, true));

        this.cube_r8 = new AdvancedModelRenderer(this);
        this.cube_r8.setRotationPoint(1.4523F, -4.0795F, -8.0962F);
        this.main.addChild(cube_r8);
        this.setRotateAngle(cube_r8, 0.3537F, 0.5421F, -0.6932F);
        this.cube_r8.cubeList.add(new ModelBox(cube_r8, 62, 42, -0.425F, -0.4F, -0.55F, 1, 1, 1, 0.0F, false));

        this.cube_r9 = new AdvancedModelRenderer(this);
        this.cube_r9.setRotationPoint(-0.5F, -5.0023F, -8.1026F);
        this.main.addChild(cube_r9);
        this.setRotateAngle(cube_r9, 0.6545F, 0.0F, 0.0F);
        this.cube_r9.cubeList.add(new ModelBox(cube_r9, 40, 15, -1.5F, 1.0F, -1.0F, 4, 1, 1, 0.003F, false));
        this.cube_r9.cubeList.add(new ModelBox(cube_r9, 48, 60, -1.0F, 0.0F, -1.0F, 3, 1, 1, 0.006F, false));

        this.cube_r10 = new AdvancedModelRenderer(this);
        this.cube_r10.setRotationPoint(0.0F, -7.1515F, -4.729F);
        this.main.addChild(cube_r10);
        this.setRotateAngle(cube_r10, 0.5672F, 0.0F, 0.0F);
        this.cube_r10.cubeList.add(new ModelBox(cube_r10, 0, 25, -2.5F, 0.0F, -4.0F, 5, 3, 4, 0.003F, false));

        this.cube_r11 = new AdvancedModelRenderer(this);
        this.cube_r11.setRotationPoint(-0.5F, -7.6691F, -2.7971F);
        this.main.addChild(cube_r11);
        this.setRotateAngle(cube_r11, 0.2618F, 0.0F, 0.0F);
        this.cube_r11.cubeList.add(new ModelBox(cube_r11, 40, 8, -2.5F, 0.0F, -2.0F, 6, 2, 2, -0.003F, false));

        this.cube_r12 = new AdvancedModelRenderer(this);
        this.cube_r12.setRotationPoint(-1.0F, -7.8F, 3.2F);
        this.main.addChild(cube_r12);
        this.setRotateAngle(cube_r12, -0.2618F, 0.0F, 0.0F);
        this.cube_r12.cubeList.add(new ModelBox(cube_r12, 51, 22, -1.5F, 0.0F, 0.0F, 5, 2, 2, -0.01F, false));

        this.cube_r13 = new AdvancedModelRenderer(this);
        this.cube_r13.setRotationPoint(-1.0F, -15.8556F, -4.7284F);
        this.main.addChild(cube_r13);
        this.setRotateAngle(cube_r13, -0.4363F, 0.0F, 0.0F);
        this.cube_r13.cubeList.add(new ModelBox(cube_r13, 9, 53, 0.5F, 0.0F, 0.0F, 1, 1, 1, -0.003F, false));

        this.cube_r14 = new AdvancedModelRenderer(this);
        this.cube_r14.setRotationPoint(-1.0F, -16.2383F, -3.8045F);
        this.main.addChild(cube_r14);
        this.setRotateAngle(cube_r14, -1.1781F, 0.0F, 0.0F);
        this.cube_r14.cubeList.add(new ModelBox(cube_r14, 28, 49, 0.5F, 0.0F, 0.0F, 1, 1, 1, -0.006F, false));

        this.cube_r15 = new AdvancedModelRenderer(this);
        this.cube_r15.setRotationPoint(-1.0F, -15.0207F, -2.2178F);
        this.main.addChild(cube_r15);
        this.setRotateAngle(cube_r15, -2.2253F, 0.0F, 0.0F);
        this.cube_r15.cubeList.add(new ModelBox(cube_r15, 34, 62, 0.5F, 0.0F, 0.0F, 1, 2, 2, 0.0F, false));

        this.cube_r16 = new AdvancedModelRenderer(this);
        this.cube_r16.setRotationPoint(-1.0F, -15.0207F, -2.2178F);
        this.main.addChild(cube_r16);
        this.setRotateAngle(cube_r16, -2.5744F, 0.0F, 0.0F);
        this.cube_r16.cubeList.add(new ModelBox(cube_r16, 55, 27, 0.5F, -6.0F, 0.0F, 1, 6, 3, 0.006F, false));

        this.cube_r17 = new AdvancedModelRenderer(this);
        this.cube_r17.setRotationPoint(-1.0F, -9.4794F, -4.7444F);
        this.main.addChild(cube_r17);
        this.setRotateAngle(cube_r17, -3.0674F, 0.0F, 0.0F);
        this.cube_r17.cubeList.add(new ModelBox(cube_r17, 57, 4, 0.5F, -0.5F, -2.0F, 1, 6, 2, 0.003F, false));

        this.cube_r18 = new AdvancedModelRenderer(this);
        this.cube_r18.setRotationPoint(-1.0F, -9.4794F, -4.7444F);
        this.main.addChild(cube_r18);
        this.setRotateAngle(cube_r18, 2.9234F, 0.0F, 0.0F);
        this.cube_r18.cubeList.add(new ModelBox(cube_r18, 0, 53, 0.5F, -4.5F, -3.0F, 1, 6, 3, 0.0F, false));

        this.cube_r19 = new AdvancedModelRenderer(this);
        this.cube_r19.setRotationPoint(-0.5F, -8.8796F, -1.6396F);
        this.main.addChild(cube_r19);
        this.setRotateAngle(cube_r19, 1.6918F, -0.05F, 0.3897F);
        this.cube_r19.cubeList.add(new ModelBox(cube_r19, 20, 56, 0.0F, -3.0F, -2.0F, 1, 6, 2, 0.01F, true));

        this.cube_r20 = new AdvancedModelRenderer(this);
        this.cube_r20.setRotationPoint(0.5F, -8.8796F, -1.6396F);
        this.main.addChild(cube_r20);
        this.setRotateAngle(cube_r20, 1.6918F, 0.05F, -0.3897F);
        this.cube_r20.cubeList.add(new ModelBox(cube_r20, 20, 56, -1.0F, -3.0F, -2.0F, 1, 6, 2, 0.01F, false));

        this.cube_r21 = new AdvancedModelRenderer(this);
        this.cube_r21.setRotationPoint(-1.0F, -9.718F, 1.3495F);
        this.main.addChild(cube_r21);
        this.setRotateAngle(cube_r21, 0.9599F, 0.0F, 0.0F);
        this.cube_r21.cubeList.add(new ModelBox(cube_r21, 39, 52, 0.5F, -1.8F, -2.975F, 1, 6, 3, 0.0F, false));

        this.cube_r22 = new AdvancedModelRenderer(this);
        this.cube_r22.setRotationPoint(-0.5F, -7.8F, 0.2F);
        this.main.addChild(cube_r22);
        this.setRotateAngle(cube_r22, 0.0436F, 0.0F, 0.0F);
        this.cube_r22.cubeList.add(new ModelBox(cube_r22, 36, 36, -2.5F, 0.0F, -3.0F, 6, 2, 3, 0.0F, false));

        this.cube_r23 = new AdvancedModelRenderer(this);
        this.cube_r23.setRotationPoint(-1.0F, -0.8F, -0.3F);
        this.main.addChild(cube_r23);
        this.setRotateAngle(cube_r23, 0.0524F, 0.0F, 0.0F);
        this.cube_r23.cubeList.add(new ModelBox(cube_r23, 0, 14, -1.5F, -5.05F, 0.3F, 5, 5, 5, 0.003F, false));

        this.cube_r24 = new AdvancedModelRenderer(this);
        this.cube_r24.setRotationPoint(-4.0896F, -4.3918F, -4.5477F);
        this.main.addChild(cube_r24);
        this.setRotateAngle(cube_r24, -0.0507F, -0.0107F, 0.1048F);
        this.cube_r24.cubeList.add(new ModelBox(cube_r24, 9, 56, 0.0F, 0.0F, 0.0F, 1, 2, 4, 0.003F, true));

        this.cube_r25 = new AdvancedModelRenderer(this);
        this.cube_r25.setRotationPoint(-4.0896F, -4.3918F, -4.5477F);
        this.main.addChild(cube_r25);
        this.setRotateAngle(cube_r25, -0.0518F, 0.0028F, 0.3663F);
        this.cube_r25.cubeList.add(new ModelBox(cube_r25, 28, 52, 0.0F, -3.0F, 0.0F, 1, 3, 4, 0.0F, true));

        this.cube_r26 = new AdvancedModelRenderer(this);
        this.cube_r26.setRotationPoint(-3.0099F, -6.1423F, -4.1699F);
        this.main.addChild(cube_r26);
        this.setRotateAngle(cube_r26, -0.1261F, -0.6749F, 0.2081F);
        this.cube_r26.cubeList.add(new ModelBox(cube_r26, 27, 60, -0.4F, 0.225F, -1.8F, 1, 3, 2, 0.0F, true));

        this.cube_r27 = new AdvancedModelRenderer(this);
        this.cube_r27.setRotationPoint(-2.4801F, -2.7784F, -6.705F);
        this.main.addChild(cube_r27);
        this.setRotateAngle(cube_r27, -0.1904F, -0.7142F, 0.1263F);
        this.cube_r27.cubeList.add(new ModelBox(cube_r27, 36, 28, 0.0F, -1.0F, 0.0F, 3, 2, 5, 0.0F, true));

        this.cube_r28 = new AdvancedModelRenderer(this);
        this.cube_r28.setRotationPoint(3.0099F, -6.1423F, -4.1699F);
        this.main.addChild(cube_r28);
        this.setRotateAngle(cube_r28, -0.1261F, 0.6749F, -0.2081F);
        this.cube_r28.cubeList.add(new ModelBox(cube_r28, 27, 60, -0.6F, 0.225F, -1.8F, 1, 3, 2, 0.0F, false));

        this.cube_r29 = new AdvancedModelRenderer(this);
        this.cube_r29.setRotationPoint(4.0896F, -4.3918F, -4.5477F);
        this.main.addChild(cube_r29);
        this.setRotateAngle(cube_r29, -0.0507F, 0.0107F, -0.1048F);
        this.cube_r29.cubeList.add(new ModelBox(cube_r29, 9, 56, -1.0F, 0.0F, 0.0F, 1, 2, 4, 0.003F, false));

        this.cube_r30 = new AdvancedModelRenderer(this);
        this.cube_r30.setRotationPoint(4.0896F, -4.3918F, -4.5477F);
        this.main.addChild(cube_r30);
        this.setRotateAngle(cube_r30, -0.0518F, -0.0028F, -0.3663F);
        this.cube_r30.cubeList.add(new ModelBox(cube_r30, 28, 52, -1.0F, -3.0F, 0.0F, 1, 3, 4, 0.0F, false));

        this.cube_r31 = new AdvancedModelRenderer(this);
        this.cube_r31.setRotationPoint(2.4801F, -2.7784F, -6.705F);
        this.main.addChild(cube_r31);
        this.setRotateAngle(cube_r31, -0.1904F, 0.7142F, -0.1263F);
        this.cube_r31.cubeList.add(new ModelBox(cube_r31, 36, 28, -3.0F, -1.0F, 0.0F, 3, 2, 5, 0.0F, false));

        this.cube_r32 = new AdvancedModelRenderer(this);
        this.cube_r32.setRotationPoint(-5.0584F, -1.9937F, -2.3943F);
        this.main.addChild(cube_r32);
        this.setRotateAngle(cube_r32, -0.0246F, 0.388F, -0.1395F);
        this.cube_r32.cubeList.add(new ModelBox(cube_r32, 21, 10, -0.05F, -0.25F, -0.125F, 2, 1, 7, 0.0F, true));

        this.cube_r33 = new AdvancedModelRenderer(this);
        this.cube_r33.setRotationPoint(-2.0404F, -2.0568F, 3.4219F);
        this.main.addChild(cube_r33);
        this.setRotateAngle(cube_r33, -0.0071F, 0.3632F, 0.2038F);
        this.cube_r33.cubeList.add(new ModelBox(cube_r33, 36, 42, -0.55F, -3.75F, -4.575F, 1, 4, 5, 0.0F, true));

        this.cube_r34 = new AdvancedModelRenderer(this);
        this.cube_r34.setRotationPoint(2.0404F, -2.0568F, 3.4219F);
        this.main.addChild(cube_r34);
        this.setRotateAngle(cube_r34, -0.0071F, -0.3632F, -0.2038F);
        this.cube_r34.cubeList.add(new ModelBox(cube_r34, 36, 42, -0.45F, -3.75F, -4.575F, 1, 4, 5, 0.0F, false));

        this.cube_r35 = new AdvancedModelRenderer(this);
        this.cube_r35.setRotationPoint(5.0584F, -1.9937F, -2.3943F);
        this.main.addChild(cube_r35);
        this.setRotateAngle(cube_r35, -0.0246F, -0.388F, 0.1395F);
        this.cube_r35.cubeList.add(new ModelBox(cube_r35, 21, 10, -1.95F, -0.25F, -0.125F, 2, 1, 7, 0.0F, false));

        this.frontLeftFin = new AdvancedModelRenderer(this);
        this.frontLeftFin.setRotationPoint(5.1691F, -2.0606F, -2.5781F);
        this.main.addChild(frontLeftFin);
        this.setRotateAngle(frontLeftFin, 0.4369F, -0.0831F, -1.4284F);
        this.frontLeftFin.cubeList.add(new ModelBox(frontLeftFin, 21, 19, 0.0F, -0.25F, 0.0F, 0, 8, 6, 0.0F, false));

        this.frontRightFin = new AdvancedModelRenderer(this);
        this.frontRightFin.setRotationPoint(-5.1691F, -2.0606F, -2.5781F);
        this.main.addChild(frontRightFin);
        this.setRotateAngle(frontRightFin, 0.4369F, 0.0831F, 1.4284F);
        this.frontRightFin.cubeList.add(new ModelBox(frontRightFin, 21, 19, 0.0F, -0.25F, 0.0F, 0, 8, 6, 0.0F, true));

        this.jaw = new AdvancedModelRenderer(this);
        this.jaw.setRotationPoint(0.25F, -2.3929F, -7.4061F);
        this.main.addChild(jaw);


        this.cube_r36 = new AdvancedModelRenderer(this);
        this.cube_r36.setRotationPoint(1.25F, -0.2949F, -2.0308F);
        this.jaw.addChild(cube_r36);
        this.setRotateAngle(cube_r36, -0.384F, 0.0F, 0.0F);
        this.cube_r36.cubeList.add(new ModelBox(cube_r36, 62, 48, -2.8F, -1.025F, 0.025F, 0, 1, 1, 0.0F, true));
        this.cube_r36.cubeList.add(new ModelBox(cube_r36, 62, 48, -0.2F, -1.025F, 0.025F, 0, 1, 1, 0.0F, false));

        this.cube_r37 = new AdvancedModelRenderer(this);
        this.cube_r37.setRotationPoint(-0.75F, -0.4168F, -1.898F);
        this.jaw.addChild(cube_r37);
        this.setRotateAngle(cube_r37, -0.24F, 0.0F, 0.0F);
        this.cube_r37.cubeList.add(new ModelBox(cube_r37, 34, 60, -0.5F, -0.8F, 0.0F, 2, 1, 0, 0.0F, false));
        this.cube_r37.cubeList.add(new ModelBox(cube_r37, 61, 56, -1.0F, -0.6F, -0.275F, 3, 1, 1, -0.01F, false));
        this.cube_r37.cubeList.add(new ModelBox(cube_r37, 48, 56, -1.5F, -0.6F, 0.7F, 4, 1, 2, 0.0F, false));

        this.tail = new AdvancedModelRenderer(this);
        this.tail.setRotationPoint(0.0F, -4.3013F, 3.735F);
        this.main.addChild(tail);


        this.cube_r38 = new AdvancedModelRenderer(this);
        this.cube_r38.setRotationPoint(-0.5F, -2.8915F, 1.1328F);
        this.tail.addChild(cube_r38);
        this.setRotateAngle(cube_r38, -0.2007F, 0.0F, 0.0F);
        this.cube_r38.cubeList.add(new ModelBox(cube_r38, 19, 34, -1.5F, 0.0F, -1.0F, 4, 4, 4, 0.0F, false));

        this.cube_r39 = new AdvancedModelRenderer(this);
        this.cube_r39.setRotationPoint(-0.5F, 1.7917F, 4.1684F);
        this.tail.addChild(cube_r39);
        this.setRotateAngle(cube_r39, 0.1702F, 0.0F, 0.0F);
        this.cube_r39.cubeList.add(new ModelBox(cube_r39, 0, 40, -1.5F, -2.3F, -4.0F, 4, 3, 4, 0.003F, false));

        this.backLeftFin = new AdvancedModelRenderer(this);
        this.backLeftFin.setRotationPoint(1.9732F, 2.7136F, 2.2408F);
        this.tail.addChild(backLeftFin);
        this.setRotateAngle(backLeftFin, 0.44F, 0.1853F, -0.9009F);
        this.backLeftFin.cubeList.add(new ModelBox(backLeftFin, 41, 62, 0.0F, 0.0F, 0.0F, 0, 2, 2, 0.0F, false));

        this.backRightFin = new AdvancedModelRenderer(this);
        this.backRightFin.setRotationPoint(-1.9732F, 2.7136F, 2.2408F);
        this.tail.addChild(backRightFin);
        this.setRotateAngle(backRightFin, 0.44F, -0.1853F, 0.9009F);
        this.backRightFin.cubeList.add(new ModelBox(backRightFin, 41, 62, 0.0F, 0.0F, 0.0F, 0, 2, 2, 0.0F, true));

        this.tail2 = new AdvancedModelRenderer(this);
        this.tail2.setRotationPoint(0.0F, -0.109F, 3.3214F);
        this.tail.addChild(tail2);


        this.cube_r40 = new AdvancedModelRenderer(this);
        this.cube_r40.setRotationPoint(-1.0F, -2.2062F, 0.6438F);
        this.tail2.addChild(cube_r40);
        this.setRotateAngle(cube_r40, -0.0611F, 0.0F, 0.0F);
        this.cube_r40.cubeList.add(new ModelBox(cube_r40, 34, 19, -0.5F, 0.05F, -1.0F, 3, 3, 5, 0.0F, false));

        this.cube_r41 = new AdvancedModelRenderer(this);
        this.cube_r41.setRotationPoint(-1.0F, 2.6F, 0.1421F);
        this.tail2.addChild(cube_r41);
        this.setRotateAngle(cube_r41, 0.1571F, 0.0F, 0.0F);
        this.cube_r41.cubeList.add(new ModelBox(cube_r41, 40, 0, -0.5F, -2.2F, -0.25F, 3, 2, 5, 0.003F, false));

        this.tail3 = new AdvancedModelRenderer(this);
        this.tail3.setRotationPoint(0.0F, -0.1913F, 3.5657F);
        this.tail2.addChild(tail3);
        this.tail3.cubeList.add(new ModelBox(tail3, 15, 49, -1.0F, -1.6846F, -0.2136F, 2, 2, 4, 0.0F, false));

        this.cube_r42 = new AdvancedModelRenderer(this);
        this.cube_r42.setRotationPoint(-1.5F, -0.2327F, 4.7428F);
        this.tail3.addChild(cube_r42);
        this.setRotateAngle(cube_r42, 0.2313F, 0.0F, 0.0F);
        this.cube_r42.cubeList.add(new ModelBox(cube_r42, 49, 42, 0.5F, -0.9F, -5.05F, 2, 2, 4, 0.003F, false));

        this.tail4 = new AdvancedModelRenderer(this);
        this.tail4.setRotationPoint(0.0F, -1.3262F, 3.2775F);
        this.tail3.addChild(tail4);
        this.setRotateAngle(tail4, 0.2618F, 0.0F, 0.0F);
        this.tail4.cubeList.add(new ModelBox(tail4, 49, 49, -0.5F, -0.25F, -0.05F, 1, 1, 5, 0.0F, false));
        this.tail4.cubeList.add(new ModelBox(tail4, 0, 0, 0.0F, -0.25F, -0.05F, 0, 4, 9, 0.0F, false));

        this.cube_r43 = new AdvancedModelRenderer(this);
        this.cube_r43.setRotationPoint(0.0F, 0.75F, 4.95F);
        this.tail4.addChild(cube_r43);
        this.setRotateAngle(cube_r43, 0.1309F, 0.0F, 0.0F);
        this.cube_r43.cubeList.add(new ModelBox(cube_r43, 51, 15, -0.5F, -0.7F, -5.0F, 1, 1, 5, -0.003F, false));

        updateDefaultPose();
    }

    @Override
    public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        this.main.render(f5);
    }

    public void renderStaticWall(float f) {
        this.main.rotateAngleZ = (float) Math.toRadians(0);
        this.main.rotateAngleY = (float) Math.toRadians(180);
        this.main.rotateAngleX = (float) Math.toRadians(270);
        this.main.offsetY = -0.2F;
        this.main.offsetZ = -0.1F;
        this.main.render(0.01F);
        this.resetToDefaultPose();
    }
    public void renderStaticFloor(float f) {
        this.main.offsetZ = -0.05F;
        this.main.offsetY = -0.2F;
        this.main.render(0.01F);
        this.resetToDefaultPose();
    }

    @Override
    public void renderStaticBook(float f) {
        //Rotations, positions and sizing:
        this.main.offsetY = -0.6F;
        this.main.offsetX = 0.8F;
        this.main.offsetZ = 2.0F;
        this.main.rotateAngleY = (float)Math.toRadians(120);
        this.main.rotateAngleX = (float)Math.toRadians(1);
        this.main.rotateAngleZ = (float)Math.toRadians(0);
        this.main.scaleChildren = true;
        float scaler = 1.0F;
        this.main.setScale(scaler, scaler, scaler);
        //Start of pose:
        this.setRotateAngle(main, 0.6F, 3.6F, -0.2F);
        //End of pose, now render the model:
        this.main.render(f);
        //Reset rotations, positions and sizing:
        this.main.setScale(1.0F, 1.0F, 1.0F);
        this.main.scaleChildren = false;
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

        //this.head.offsetY = 0.8F;

        AdvancedModelRenderer[] fishTail = {this.tail, this.tail2, this.tail3, this.tail4};

        float speed = 0.186F;
        EntityPrehistoricFloraAgeableBase ee = (EntityPrehistoricFloraAgeableBase) e;
        if (ee.getIsFast()) {
            speed = speed * 2.6F;
        }
        float still = 1f;
        if (f3 == 0.0F) {
            still = 0.8F;
        }
        if (!e.isInWater()) {
            speed = 0.26F;
        }

        //this.head.rotateAngleY += f3 / (180F / (float) Math.PI);
        //this.head.rotateAngleX += f4 / (180F / (float) Math.PI);

        //if (f3 != 0.0F) {this.walk(Jaw, (float) (speed * 1.5), 0.2F, true, 0, 0, f2, 1);}
        if (e.isInWater()) {
            this.chainWave(fishTail, speed * still, 0.02F * still, -0.2, f2, 0.8F * still);
            this.chainSwing(fishTail, speed * still, 0.29F * still, -0.85, f2, 0.5F * still);
            this.swing(main, speed, 0.2F, true, 0, 0, f2, 0.8F);
        }
        else {
            this.swing(main, speed, 0.1F, true, 0, 0, f2, 0.5F);
        }
        this.flap(frontLeftFin, (float) (speed * 0.65), 0.28F, false, 0.8F, 0, f2, 0.5F);
        this.swing(frontLeftFin, (float) (speed * 0.65), 0.18F, true, 0, 0, f2, 0.5F);
        this.flap(frontRightFin, (float) (speed * 0.65), -0.28F, false, 0.8F, 0, f2, 0.5F);
        this.swing(frontRightFin, (float) (speed * 0.65), -0.18F, true, 0, 0, f2, 0.5F);

        this.flap(backLeftFin, (float) (speed * 0.65), 0.28F, false, 1.8F, 0, f2, 0.5F);
        this.swing(backLeftFin, (float) (speed * 0.65), 0.18F, true, 1, 0, f2, 0.5F);
        this.flap(backRightFin, (float) (speed * 0.65), -0.28F, false, 1.8F, 0, f2, 0.5F);
        this.swing(backRightFin, (float) (speed * 0.65), -0.18F, true, 1, 0, f2, 0.5F);


        if (!e.isInWater()) {
            this.main.rotateAngleZ = (float) Math.toRadians(270);
//            this.body.offsetY = -0.05F;
//            this.body.offsetX = -0.5F;
            this.bob(main, -speed * 1.9F, 2.5F, false, f2, 1);
            this.chainWave(fishTail, speed * 1.7F, 0.028F, -3, f2, 1F * still);
            this.chainSwing(fishTail, speed * 1.7F, 0.15F, -3, f2, 1F * still);

        }

    }}
