package net.lepidodendron.entity.model.entity;

import net.ilexiconn.llibrary.client.model.ModelAnimator;
import net.ilexiconn.llibrary.client.model.tools.AdvancedModelRenderer;
import net.ilexiconn.llibrary.server.animation.IAnimatedEntity;
import net.lepidodendron.entity.EntityPrehistoricFloraGoodradigbeeon;
import net.lepidodendron.entity.base.EntityPrehistoricFloraAgeableBase;
import net.lepidodendron.entity.model.ModelBasePalaeopedia;
import net.minecraft.block.material.Material;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLiving;
import net.minecraft.util.math.BlockPos;

public class ModelGoodradigbeeon extends ModelBasePalaeopedia {
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
    private final AdvancedModelRenderer frontLeftFin;
    private final AdvancedModelRenderer frontRightFin;
    private final AdvancedModelRenderer jaw;
    private final AdvancedModelRenderer cube_r31;
    private final AdvancedModelRenderer cube_r32;
    private final AdvancedModelRenderer cube_r33;
    private final AdvancedModelRenderer cube_r34;
    private final AdvancedModelRenderer cube_r35;
    private final AdvancedModelRenderer cube_r36;
    private final AdvancedModelRenderer cube_r37;
    private final AdvancedModelRenderer cube_r38;
    private final AdvancedModelRenderer cube_r39;
    private final AdvancedModelRenderer cube_r40;
    private final AdvancedModelRenderer cube_r41;
    private final AdvancedModelRenderer cube_r42;
    private final AdvancedModelRenderer cube_r43;
    private final AdvancedModelRenderer body;
    private final AdvancedModelRenderer cube_r44;
    private final AdvancedModelRenderer cube_r45;
    private final AdvancedModelRenderer tail;
    private final AdvancedModelRenderer cube_r46;
    private final AdvancedModelRenderer cube_r47;
    private final AdvancedModelRenderer cube_r48;
    private final AdvancedModelRenderer backLeftFin;
    private final AdvancedModelRenderer backRightFin;
    private final AdvancedModelRenderer tail2;
    private final AdvancedModelRenderer cube_r49;
    private final AdvancedModelRenderer cube_r50;
    private final AdvancedModelRenderer tail3;
    private final AdvancedModelRenderer cube_r51;
    private final AdvancedModelRenderer cube_r52;
    private final AdvancedModelRenderer tail4;
    private final AdvancedModelRenderer cube_r53;
    private final AdvancedModelRenderer cube_r54;

    private ModelAnimator animator;


    public ModelGoodradigbeeon() {
        this.textureWidth = 80;
        this.textureHeight = 80;

        this.main = new AdvancedModelRenderer(this);
        this.main.setRotationPoint(0.0F, 24.0F, 0.0F);
        this.main.cubeList.add(new ModelBox(main, 0, 0, -4.5F, -1.0F, -3.0F, 9, 1, 5, 0.0F, false));
        this.main.cubeList.add(new ModelBox(main, 0, 23, -5.0F, -1.0F, -5.5F, 10, 1, 4, 0.003F, false));

        this.cube_r1 = new AdvancedModelRenderer(this);
        this.cube_r1.setRotationPoint(-1.9787F, -2.5F, -12.0552F);
        this.main.addChild(cube_r1);
        this.setRotateAngle(cube_r1, 0.0694F, -0.3015F, 0.1763F);
        this.cube_r1.cubeList.add(new ModelBox(cube_r1, 38, 52, -0.9F, -0.375F, -0.6F, 1, 1, 1, 0.0F, true));

        this.cube_r2 = new AdvancedModelRenderer(this);
        this.cube_r2.setRotationPoint(1.9787F, -2.5F, -12.0552F);
        this.main.addChild(cube_r2);
        this.setRotateAngle(cube_r2, 0.0694F, 0.3015F, -0.1763F);
        this.cube_r2.cubeList.add(new ModelBox(cube_r2, 38, 52, -0.1F, -0.375F, -0.6F, 1, 1, 1, 0.0F, false));

        this.cube_r3 = new AdvancedModelRenderer(this);
        this.cube_r3.setRotationPoint(-2.0F, -4.7745F, 0.1962F);
        this.main.addChild(cube_r3);
        this.setRotateAngle(cube_r3, -0.0873F, 0.0F, 0.0F);
        this.cube_r3.cubeList.add(new ModelBox(cube_r3, 46, 39, -2.5F, 0.0F, 0.0F, 9, 2, 2, -0.003F, false));

        this.cube_r4 = new AdvancedModelRenderer(this);
        this.cube_r4.setRotationPoint(-3.0F, -3.0067F, -10.8466F);
        this.main.addChild(cube_r4);
        this.setRotateAngle(cube_r4, 0.0793F, -0.5689F, -0.0843F);
        this.cube_r4.cubeList.add(new ModelBox(cube_r4, 50, 31, 0.0F, 0.15F, -2.85F, 2, 1, 6, 0.0F, true));

        this.cube_r5 = new AdvancedModelRenderer(this);
        this.cube_r5.setRotationPoint(-4.9897F, -2.0F, -8.3404F);
        this.main.addChild(cube_r5);
        this.setRotateAngle(cube_r5, 0.0F, -0.3578F, 0.0F);
        this.cube_r5.cubeList.add(new ModelBox(cube_r5, 63, 44, 0.0F, -0.075F, -3.0F, 2, 1, 3, 0.0F, true));

        this.cube_r6 = new AdvancedModelRenderer(this);
        this.cube_r6.setRotationPoint(-3.1868F, -1.3744F, -12.7715F);
        this.main.addChild(cube_r6);
        this.setRotateAngle(cube_r6, -0.1862F, -0.4686F, 0.0797F);
        this.cube_r6.cubeList.add(new ModelBox(cube_r6, 11, 65, 0.0F, -1.0F, 0.0F, 3, 1, 2, 0.0F, true));

        this.cube_r7 = new AdvancedModelRenderer(this);
        this.cube_r7.setRotationPoint(-1.5F, -1.5794F, -13.8264F);
        this.main.addChild(cube_r7);
        this.setRotateAngle(cube_r7, -0.3471F, -0.9753F, 0.291F);
        this.cube_r7.cubeList.add(new ModelBox(cube_r7, 54, 64, 0.0F, -1.0F, 0.0F, 3, 1, 2, 0.0F, true));

        this.cube_r8 = new AdvancedModelRenderer(this);
        this.cube_r8.setRotationPoint(3.0F, -3.0067F, -10.8466F);
        this.main.addChild(cube_r8);
        this.setRotateAngle(cube_r8, 0.0793F, 0.5689F, 0.0843F);
        this.cube_r8.cubeList.add(new ModelBox(cube_r8, 50, 31, -2.0F, 0.15F, -2.85F, 2, 1, 6, 0.0F, false));

        this.cube_r9 = new AdvancedModelRenderer(this);
        this.cube_r9.setRotationPoint(-0.5F, -1.007F, -10.8815F);
        this.main.addChild(cube_r9);
        this.setRotateAngle(cube_r9, -0.0175F, 0.0F, 0.0F);
        this.cube_r9.cubeList.add(new ModelBox(cube_r9, 29, 15, -2.5F, -1.0F, 0.0F, 6, 1, 6, 0.0F, false));

        this.cube_r10 = new AdvancedModelRenderer(this);
        this.cube_r10.setRotationPoint(-2.4131F, -0.8561F, -12.6801F);
        this.main.addChild(cube_r10);
        this.setRotateAngle(cube_r10, -0.0734F, -0.5543F, 0.0986F);
        this.cube_r10.cubeList.add(new ModelBox(cube_r10, 38, 47, 0.0F, -1.0F, 0.0F, 0, 1, 3, 0.0F, true));

        this.cube_r11 = new AdvancedModelRenderer(this);
        this.cube_r11.setRotationPoint(-2.1798F, -1.3254F, -12.4477F);
        this.main.addChild(cube_r11);
        this.setRotateAngle(cube_r11, -0.3454F, -1.061F, 0.2991F);
        this.cube_r11.cubeList.add(new ModelBox(cube_r11, 19, 42, -0.25F, -0.5F, -1.875F, 0, 1, 2, 0.0F, true));

        this.cube_r12 = new AdvancedModelRenderer(this);
        this.cube_r12.setRotationPoint(2.1798F, -1.3254F, -12.4477F);
        this.main.addChild(cube_r12);
        this.setRotateAngle(cube_r12, -0.3454F, 1.061F, -0.2991F);
        this.cube_r12.cubeList.add(new ModelBox(cube_r12, 19, 42, 0.25F, -0.5F, -1.875F, 0, 1, 2, 0.0F, false));

        this.cube_r13 = new AdvancedModelRenderer(this);
        this.cube_r13.setRotationPoint(2.4131F, -0.8561F, -12.6801F);
        this.main.addChild(cube_r13);
        this.setRotateAngle(cube_r13, -0.0734F, 0.5543F, -0.0986F);
        this.cube_r13.cubeList.add(new ModelBox(cube_r13, 38, 47, 0.0F, -1.0F, 0.0F, 0, 1, 3, 0.0F, false));

        this.cube_r14 = new AdvancedModelRenderer(this);
        this.cube_r14.setRotationPoint(3.1868F, -1.3744F, -12.7715F);
        this.main.addChild(cube_r14);
        this.setRotateAngle(cube_r14, -0.1862F, 0.4686F, -0.0797F);
        this.cube_r14.cubeList.add(new ModelBox(cube_r14, 11, 65, -3.0F, -1.0F, 0.0F, 3, 1, 2, 0.0F, false));

        this.cube_r15 = new AdvancedModelRenderer(this);
        this.cube_r15.setRotationPoint(1.5F, -1.5794F, -13.8264F);
        this.main.addChild(cube_r15);
        this.setRotateAngle(cube_r15, -0.3471F, 0.9753F, -0.291F);
        this.cube_r15.cubeList.add(new ModelBox(cube_r15, 54, 64, -3.0F, -1.0F, 0.0F, 3, 1, 2, 0.0F, false));

        this.cube_r16 = new AdvancedModelRenderer(this);
        this.cube_r16.setRotationPoint(-1.0F, -1.5794F, -13.8264F);
        this.main.addChild(cube_r16);
        this.setRotateAngle(cube_r16, -0.192F, 0.0F, 0.0F);
        this.cube_r16.cubeList.add(new ModelBox(cube_r16, 58, 59, -0.5F, -1.0F, 0.0F, 3, 1, 3, 0.006F, false));

        this.cube_r17 = new AdvancedModelRenderer(this);
        this.cube_r17.setRotationPoint(-1.0F, -3.6743F, -10.2751F);
        this.main.addChild(cube_r17);
        this.setRotateAngle(cube_r17, 0.288F, 0.0F, 0.0F);
        this.cube_r17.cubeList.add(new ModelBox(cube_r17, 54, 25, -0.5F, 0.0F, -4.0F, 3, 1, 4, 0.0F, false));

        this.cube_r18 = new AdvancedModelRenderer(this);
        this.cube_r18.setRotationPoint(-1.5F, -3.8836F, -7.2824F);
        this.main.addChild(cube_r18);
        this.setRotateAngle(cube_r18, 0.0698F, 0.0F, 0.0F);
        this.cube_r18.cubeList.add(new ModelBox(cube_r18, 54, 5, -1.5F, 0.0F, -3.0F, 6, 1, 3, 0.0F, false));

        this.cube_r19 = new AdvancedModelRenderer(this);
        this.cube_r19.setRotationPoint(-0.5F, -4.6F, -3.8F);
        this.main.addChild(cube_r19);
        this.setRotateAngle(cube_r19, 0.0262F, 0.0F, 0.0F);
        this.cube_r19.cubeList.add(new ModelBox(cube_r19, 29, 0, -3.5F, 0.625F, -3.5F, 8, 1, 4, 0.0F, false));

        this.cube_r20 = new AdvancedModelRenderer(this);
        this.cube_r20.setRotationPoint(-2.5F, -4.6F, -3.8F);
        this.main.addChild(cube_r20);
        this.setRotateAngle(cube_r20, 0.2662F, 0.0F, 0.0F);
        this.cube_r20.cubeList.add(new ModelBox(cube_r20, 54, 0, -0.5F, 0.0F, -3.0F, 6, 1, 3, 0.0F, false));

        this.cube_r21 = new AdvancedModelRenderer(this);
        this.cube_r21.setRotationPoint(0.0F, -4.6F, -3.8F);
        this.main.addChild(cube_r21);
        this.setRotateAngle(cube_r21, 0.0436F, 0.0F, 0.0F);
        this.cube_r21.cubeList.add(new ModelBox(cube_r21, 0, 29, -4.5F, 0.0F, 0.0F, 9, 2, 4, 0.0F, false));

        this.cube_r22 = new AdvancedModelRenderer(this);
        this.cube_r22.setRotationPoint(-5.6938F, -2.9271F, -5.4359F);
        this.main.addChild(cube_r22);
        this.setRotateAngle(cube_r22, -0.0174F, -0.0015F, -0.0873F);
        this.cube_r22.cubeList.add(new ModelBox(cube_r22, 0, 60, 0.0F, 0.0F, 0.0F, 2, 2, 3, 0.0F, true));

        this.cube_r23 = new AdvancedModelRenderer(this);
        this.cube_r23.setRotationPoint(-3.5419F, -1.0601F, -5.0386F);
        this.main.addChild(cube_r23);
        this.setRotateAngle(cube_r23, 0.0115F, -0.1742F, -0.097F);
        this.cube_r23.cubeList.add(new ModelBox(cube_r23, 17, 59, -2.0F, -2.075F, -3.0F, 3, 2, 3, -0.003F, true));

        this.cube_r24 = new AdvancedModelRenderer(this);
        this.cube_r24.setRotationPoint(5.6938F, -2.9271F, -5.4359F);
        this.main.addChild(cube_r24);
        this.setRotateAngle(cube_r24, -0.0174F, 0.0015F, 0.0873F);
        this.cube_r24.cubeList.add(new ModelBox(cube_r24, 0, 60, -2.0F, 0.0F, 0.0F, 2, 2, 3, 0.0F, false));

        this.cube_r25 = new AdvancedModelRenderer(this);
        this.cube_r25.setRotationPoint(4.9897F, -2.0F, -8.3404F);
        this.main.addChild(cube_r25);
        this.setRotateAngle(cube_r25, 0.0F, 0.3578F, 0.0F);
        this.cube_r25.cubeList.add(new ModelBox(cube_r25, 63, 44, -2.0F, -0.075F, -3.0F, 2, 1, 3, 0.0F, false));

        this.cube_r26 = new AdvancedModelRenderer(this);
        this.cube_r26.setRotationPoint(3.5419F, -1.0601F, -5.0386F);
        this.main.addChild(cube_r26);
        this.setRotateAngle(cube_r26, 0.0115F, 0.1742F, 0.097F);
        this.cube_r26.cubeList.add(new ModelBox(cube_r26, 17, 59, -1.0F, -2.075F, -3.0F, 3, 2, 3, -0.003F, false));

        this.cube_r27 = new AdvancedModelRenderer(this);
        this.cube_r27.setRotationPoint(-5.4963F, -1.355F, -2.2329F);
        this.main.addChild(cube_r27);
        this.setRotateAngle(cube_r27, -0.0334F, -0.5336F, -0.0475F);
        this.cube_r27.cubeList.add(new ModelBox(cube_r27, 0, 66, -0.7F, -0.575F, -1.3F, 2, 1, 2, 0.0F, true));

        this.cube_r28 = new AdvancedModelRenderer(this);
        this.cube_r28.setRotationPoint(5.4963F, -1.355F, -2.2329F);
        this.main.addChild(cube_r28);
        this.setRotateAngle(cube_r28, -0.0334F, 0.5336F, 0.0475F);
        this.cube_r28.cubeList.add(new ModelBox(cube_r28, 0, 66, -1.3F, -0.575F, -1.3F, 2, 1, 2, 0.0F, false));

        this.cube_r29 = new AdvancedModelRenderer(this);
        this.cube_r29.setRotationPoint(4.5F, -2.0F, -3.25F);
        this.main.addChild(cube_r29);
        this.setRotateAngle(cube_r29, -0.0292F, -0.173F, 0.0695F);
        this.cube_r29.cubeList.add(new ModelBox(cube_r29, 54, 17, 0.0F, -0.95F, 0.375F, 1, 2, 5, 0.0F, false));

        this.cube_r30 = new AdvancedModelRenderer(this);
        this.cube_r30.setRotationPoint(-4.5F, -2.0F, -3.25F);
        this.main.addChild(cube_r30);
        this.setRotateAngle(cube_r30, -0.0292F, 0.173F, -0.0695F);
        this.cube_r30.cubeList.add(new ModelBox(cube_r30, 54, 17, -1.0F, -0.95F, 0.375F, 1, 2, 5, 0.0F, true));

        this.frontLeftFin = new AdvancedModelRenderer(this);
        this.frontLeftFin.setRotationPoint(4.5975F, -1.2865F, -2.7327F);
        this.main.addChild(frontLeftFin);
        this.setRotateAngle(frontLeftFin, -0.081F, -0.384F, 0.1139F);
        this.frontLeftFin.cubeList.add(new ModelBox(frontLeftFin, 0, 16, 0.0F, 0.0F, 0.0F, 8, 0, 6, 0.0F, false));

        this.frontRightFin = new AdvancedModelRenderer(this);
        this.frontRightFin.setRotationPoint(-4.5975F, -1.2865F, -2.7327F);
        this.main.addChild(frontRightFin);
        this.setRotateAngle(frontRightFin, -0.081F, 0.384F, -0.1139F);
        this.frontRightFin.cubeList.add(new ModelBox(frontRightFin, 0, 16, -8.0F, 0.0F, 0.0F, 8, 0, 6, 0.0F, true));

        this.jaw = new AdvancedModelRenderer(this);
        this.jaw.setRotationPoint(0.0F, -1.0692F, -5.4587F);
        this.main.addChild(jaw);
        this.jaw.cubeList.add(new ModelBox(jaw, 27, 7, -3.5F, 0.0564F, -5.4219F, 7, 1, 6, 0.0F, false));
        this.jaw.cubeList.add(new ModelBox(jaw, 0, 36, -4.5F, -1.9436F, -2.4219F, 9, 2, 3, 0.0F, false));

        this.cube_r31 = new AdvancedModelRenderer(this);
        this.cube_r31.setRotationPoint(-4.9601F, 1.047F, -2.6567F);
        this.jaw.addChild(cube_r31);
        this.setRotateAngle(cube_r31, -0.012F, -0.0348F, 0.0424F);
        this.cube_r31.cubeList.add(new ModelBox(cube_r31, 30, 64, 0.0F, -1.125F, 0.0F, 2, 1, 3, 0.0F, true));

        this.cube_r32 = new AdvancedModelRenderer(this);
        this.cube_r32.setRotationPoint(4.9601F, 1.047F, -2.6567F);
        this.jaw.addChild(cube_r32);
        this.setRotateAngle(cube_r32, -0.012F, 0.0348F, -0.0424F);
        this.cube_r32.cubeList.add(new ModelBox(cube_r32, 30, 64, -2.0F, -1.125F, 0.0F, 2, 1, 3, 0.0F, false));

        this.cube_r33 = new AdvancedModelRenderer(this);
        this.cube_r33.setRotationPoint(-3.9514F, 0.954F, -5.4805F);
        this.jaw.addChild(cube_r33);
        this.setRotateAngle(cube_r33, 0.0037F, -0.3397F, 0.0264F);
        this.cube_r33.cubeList.add(new ModelBox(cube_r33, 63, 49, 0.0F, -1.0F, 0.0F, 2, 1, 3, 0.0F, true));

        this.cube_r34 = new AdvancedModelRenderer(this);
        this.cube_r34.setRotationPoint(-3.1868F, 0.6397F, -7.3017F);
        this.jaw.addChild(cube_r34);
        this.setRotateAngle(cube_r34, -0.1919F, -0.3829F, 0.0894F);
        this.cube_r34.cubeList.add(new ModelBox(cube_r34, 22, 65, 0.0F, -1.0F, 0.0F, 1, 1, 2, 0.0F, true));

        this.cube_r35 = new AdvancedModelRenderer(this);
        this.cube_r35.setRotationPoint(-1.5F, 0.4071F, -8.3508F);
        this.jaw.addChild(cube_r35);
        this.setRotateAngle(cube_r35, -0.3913F, -0.9674F, 0.3275F);
        this.cube_r35.cubeList.add(new ModelBox(cube_r35, 65, 64, 0.0F, -1.0F, 0.0F, 2, 1, 2, -0.003F, true));

        this.cube_r36 = new AdvancedModelRenderer(this);
        this.cube_r36.setRotationPoint(3.9514F, 0.954F, -5.4805F);
        this.jaw.addChild(cube_r36);
        this.setRotateAngle(cube_r36, 0.0037F, 0.3397F, -0.0264F);
        this.cube_r36.cubeList.add(new ModelBox(cube_r36, 63, 49, -2.0F, -1.0F, 0.0F, 2, 1, 3, 0.0F, false));

        this.cube_r37 = new AdvancedModelRenderer(this);
        this.cube_r37.setRotationPoint(-2.6998F, -0.795F, -6.8495F);
        this.jaw.addChild(cube_r37);
        this.setRotateAngle(cube_r37, -0.3228F, -0.3829F, 0.0894F);
        this.cube_r37.cubeList.add(new ModelBox(cube_r37, 11, 60, 0.0F, 0.0F, 0.0F, 0, 1, 2, 0.0F, true));

        this.cube_r38 = new AdvancedModelRenderer(this);
        this.cube_r38.setRotationPoint(-2.7081F, -0.303F, -6.9379F);
        this.jaw.addChild(cube_r38);
        this.setRotateAngle(cube_r38, -0.3432F, -1.0174F, 0.3121F);
        this.cube_r38.cubeList.add(new ModelBox(cube_r38, 67, 20, 0.0F, -0.5F, -2.0F, 0, 1, 2, 0.0F, true));

        this.cube_r39 = new AdvancedModelRenderer(this);
        this.cube_r39.setRotationPoint(2.7081F, -0.303F, -6.9379F);
        this.jaw.addChild(cube_r39);
        this.setRotateAngle(cube_r39, -0.3432F, 1.0174F, -0.3121F);
        this.cube_r39.cubeList.add(new ModelBox(cube_r39, 67, 20, 0.0F, -0.5F, -2.0F, 0, 1, 2, 0.0F, false));

        this.cube_r40 = new AdvancedModelRenderer(this);
        this.cube_r40.setRotationPoint(2.6998F, -0.795F, -6.8495F);
        this.jaw.addChild(cube_r40);
        this.setRotateAngle(cube_r40, -0.3228F, 0.3829F, -0.0894F);
        this.cube_r40.cubeList.add(new ModelBox(cube_r40, 11, 60, 0.0F, 0.0F, 0.0F, 0, 1, 2, 0.0F, false));

        this.cube_r41 = new AdvancedModelRenderer(this);
        this.cube_r41.setRotationPoint(3.1868F, 0.6397F, -7.3017F);
        this.jaw.addChild(cube_r41);
        this.setRotateAngle(cube_r41, -0.1919F, 0.3829F, -0.0894F);
        this.cube_r41.cubeList.add(new ModelBox(cube_r41, 22, 65, -1.0F, -1.0F, 0.0F, 1, 1, 2, 0.0F, false));

        this.cube_r42 = new AdvancedModelRenderer(this);
        this.cube_r42.setRotationPoint(1.5F, 0.4071F, -8.3508F);
        this.jaw.addChild(cube_r42);
        this.setRotateAngle(cube_r42, -0.3913F, 0.9674F, -0.3275F);
        this.cube_r42.cubeList.add(new ModelBox(cube_r42, 65, 64, -2.0F, -1.0F, 0.0F, 2, 1, 2, -0.003F, false));

        this.cube_r43 = new AdvancedModelRenderer(this);
        this.cube_r43.setRotationPoint(1.0F, 1.0564F, -5.4219F);
        this.jaw.addChild(cube_r43);
        this.setRotateAngle(cube_r43, -0.2182F, 0.0F, 0.0F);
        this.cube_r43.cubeList.add(new ModelBox(cube_r43, 17, 55, -4.0F, -1.0F, -2.0F, 6, 1, 2, 0.006F, false));
        this.cube_r43.cubeList.add(new ModelBox(cube_r43, 67, 17, -2.5F, -1.0F, -3.0F, 3, 1, 1, 0.0F, false));

        this.body = new AdvancedModelRenderer(this);
        this.body.setRotationPoint(0.0F, -3.0F, 1.0F);
        this.main.addChild(body);


        this.cube_r44 = new AdvancedModelRenderer(this);
        this.cube_r44.setRotationPoint(-1.0F, -1.6115F, 0.005F);
        this.body.addChild(cube_r44);
        this.setRotateAngle(cube_r44, -0.0829F, 0.0F, 0.0F);
        this.cube_r44.cubeList.add(new ModelBox(cube_r44, 0, 7, -3.0F, 0.025F, 0.0F, 8, 3, 5, 0.0F, false));

        this.cube_r45 = new AdvancedModelRenderer(this);
        this.cube_r45.setRotationPoint(-0.5F, 3.0F, 0.0F);
        this.body.addChild(cube_r45);
        this.setRotateAngle(cube_r45, 0.0698F, 0.0F, 0.0F);
        this.cube_r45.cubeList.add(new ModelBox(cube_r45, 29, 23, -3.0F, -2.0F, 0.0F, 7, 2, 5, -0.003F, false));

        this.tail = new AdvancedModelRenderer(this);
        this.tail.setRotationPoint(0.0F, 0.8786F, 4.2838F);
        this.body.addChild(tail);


        this.cube_r46 = new AdvancedModelRenderer(this);
        this.cube_r46.setRotationPoint(-4.0F, -1.95F, 1.1932F);
        this.tail.addChild(cube_r46);
        this.setRotateAngle(cube_r46, -0.2793F, 0.0F, 0.0F);
        this.cube_r46.cubeList.add(new ModelBox(cube_r46, 45, 62, 4.0F, -1.9F, -0.475F, 0, 2, 4, 0.0F, false));

        this.cube_r47 = new AdvancedModelRenderer(this);
        this.cube_r47.setRotationPoint(-1.0F, -2.0979F, 0.2041F);
        this.tail.addChild(cube_r47);
        this.setRotateAngle(cube_r47, -0.1265F, 0.0F, 0.0F);
        this.cube_r47.cubeList.add(new ModelBox(cube_r47, 27, 31, -2.0F, 0.025F, 0.05F, 6, 2, 5, 0.0F, false));

        this.cube_r48 = new AdvancedModelRenderer(this);
        this.cube_r48.setRotationPoint(-0.5F, 1.4459F, 5.1889F);
        this.tail.addChild(cube_r48);
        this.setRotateAngle(cube_r48, 0.0654F, 0.0F, 0.0F);
        this.cube_r48.cubeList.add(new ModelBox(cube_r48, 25, 39, -2.0F, -2.0F, -5.0F, 5, 2, 5, -0.003F, false));

        this.backLeftFin = new AdvancedModelRenderer(this);
        this.backLeftFin.setRotationPoint(2.425F, 1.1751F, 1.0369F);
        this.tail.addChild(backLeftFin);
        this.setRotateAngle(backLeftFin, -0.0504F, -0.2551F, 0.208F);
        this.backLeftFin.cubeList.add(new ModelBox(backLeftFin, 58, 55, 0.0F, 0.0F, -0.5F, 4, 0, 3, 0.0F, false));

        this.backRightFin = new AdvancedModelRenderer(this);
        this.backRightFin.setRotationPoint(-2.425F, 1.1751F, 1.0369F);
        this.tail.addChild(backRightFin);
        this.setRotateAngle(backRightFin, -0.0504F, 0.2551F, -0.208F);
        this.backRightFin.cubeList.add(new ModelBox(backRightFin, 58, 55, -4.0F, 0.0F, -0.5F, 4, 0, 3, 0.0F, true));

        this.tail2 = new AdvancedModelRenderer(this);
        this.tail2.setRotationPoint(0.0F, 0.0245F, 4.6203F);
        this.tail.addChild(tail2);


        this.cube_r49 = new AdvancedModelRenderer(this);
        this.cube_r49.setRotationPoint(-1.0F, -1.4572F, 0.0345F);
        this.tail2.addChild(cube_r49);
        this.setRotateAngle(cube_r49, -0.0305F, 0.0F, 0.0F);
        this.cube_r49.cubeList.add(new ModelBox(cube_r49, 19, 47, -1.0F, 0.025F, 0.0F, 4, 2, 5, 0.0F, false));

        this.cube_r50 = new AdvancedModelRenderer(this);
        this.cube_r50.setRotationPoint(-0.5F, 1.431F, 0.4691F);
        this.tail2.addChild(cube_r50);
        this.setRotateAngle(cube_r50, 0.1396F, 0.0F, 0.0F);
        this.cube_r50.cubeList.add(new ModelBox(cube_r50, 54, 10, -1.0F, -1.05F, -0.4F, 3, 1, 5, -0.003F, false));

        this.tail3 = new AdvancedModelRenderer(this);
        this.tail3.setRotationPoint(0.0F, -0.7877F, 4.5107F);
        this.tail2.addChild(tail3);


        this.cube_r51 = new AdvancedModelRenderer(this);
        this.cube_r51.setRotationPoint(-2.0F, 1.467F, -0.0395F);
        this.tail3.addChild(cube_r51);
        this.setRotateAngle(cube_r51, 0.24F, 0.0F, 0.0F);
        this.cube_r51.cubeList.add(new ModelBox(cube_r51, 34, 55, 2.0F, 0.025F, 1.0F, 0, 3, 5, 0.0F, false));
        this.cube_r51.cubeList.add(new ModelBox(cube_r51, 45, 55, 1.5F, -0.975F, 0.0F, 1, 1, 5, -0.003F, false));

        this.cube_r52 = new AdvancedModelRenderer(this);
        this.cube_r52.setRotationPoint(-1.0F, -0.5297F, -0.1528F);
        this.tail3.addChild(cube_r52);
        this.setRotateAngle(cube_r52, 0.0349F, 0.0F, 0.0F);
        this.cube_r52.cubeList.add(new ModelBox(cube_r52, 0, 52, 0.0F, 0.025F, 0.0F, 2, 1, 6, 0.0F, false));

        this.tail4 = new AdvancedModelRenderer(this);
        this.tail4.setRotationPoint(0.0F, -0.3017F, 5.3603F);
        this.tail3.addChild(tail4);


        this.cube_r53 = new AdvancedModelRenderer(this);
        this.cube_r53.setRotationPoint(-2.0F, 2.5578F, 0.348F);
        this.tail4.addChild(cube_r53);
        this.setRotateAngle(cube_r53, 0.2091F, 0.0F, 0.0F);
        this.cube_r53.cubeList.add(new ModelBox(cube_r53, 46, 44, 2.025F, -2.125F, 0.225F, 0, 2, 8, 0.0F, false));

        this.cube_r54 = new AdvancedModelRenderer(this);
        this.cube_r54.setRotationPoint(-1.5F, -0.42F, -0.0165F);
        this.tail4.addChild(cube_r54);
        this.setRotateAngle(cube_r54, 0.1218F, 0.0F, 0.0F);
        this.cube_r54.cubeList.add(new ModelBox(cube_r54, 0, 42, 1.0F, 0.025F, 0.125F, 1, 1, 8, 0.0F, false));

        updateDefaultPose();
        animator = ModelAnimator.create();
    }

    @Override
    public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        animate((IAnimatedEntity) entity, f, f1, f2, f3, f4, f5);
        this.main.render(f5);
    }
    public void renderStaticWall(float f) {
        resetToDefaultPose();
    }
    public void renderStaticFloor(float f) {
        resetToDefaultPose();
    }
    @Override
    public void renderStaticBook(float f) {
        //Rotations, positions and sizing:
        this.main.offsetY = -0.3F;
        this.main.offsetX = 0.2F;
        this.main.offsetZ = 3.0F;
        this.main.rotateAngleY = (float)Math.toRadians(120);
        this.main.rotateAngleX = (float)Math.toRadians(1);
        this.main.rotateAngleZ = (float)Math.toRadians(0);
        this.main.scaleChildren = true;
        float scaler = 0.6F;
        this.main.setScale(scaler, scaler, scaler);
        //Start of pose:
        
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

        //this.Tailfin.setScale(1.1F, 1.1F, 1.1F);
        AdvancedModelRenderer[] fishTail = {this.tail, this.tail2, this.tail3, this.tail4};
        EntityPrehistoricFloraGoodradigbeeon Goodradigbeeon = (EntityPrehistoricFloraGoodradigbeeon) e;
        float speed = 0.3F;
        float taildegree = 0.25F;
        float inwater = 1F;

        if (!e.isInWater()) {
            speed = 0.7F;
            inwater = 0.65F;
        }

        boolean isAtBottom = false;
        if (e.getPosition().getY() - 1 > 1) {
            BlockPos pos = new BlockPos(e.getPosition().getX(), e.getPosition().getY() - 1, e.getPosition().getZ());
            isAtBottom = ((e.isInsideOfMaterial(Material.WATER) || e.isInsideOfMaterial(Material.CORAL))
                && ((e.world.getBlockState(pos)).getMaterial() != Material.WATER)
                && ((double)e.getPosition().getY() + 0.334D) > e.posY);
        }
        float bottomModifier = 1F;
        float swingModifier = 1F;
        if (isAtBottom && !Goodradigbeeon.getIsFast()) {
            //System.err.println("Animation at bottom");
            speed = 0.15F;
            taildegree = 0.15F;
            bottomModifier = 0.5F;
            swingModifier = 0.5F;
//            this.tail4.rotateAngleX = (float) Math.toRadians(-10);
//            this.main.rotateAngleX = (float) Math.toRadians(10);
        }

        if (e instanceof EntityLiving && !((EntityLiving) e).isAIDisabled()) {
            this.chainWave(fishTail, speed * bottomModifier, 0.05F, -3, f2, 1);
            this.chainSwing(fishTail, speed * bottomModifier, taildegree * bottomModifier, -3, f2, 1);
            this.swing(main, speed * bottomModifier, 0.3F * bottomModifier * swingModifier, true, 0, 0, f2, 1 * swingModifier);

            this.flap(frontLeftFin, (float) (speed * 0.65 * (bottomModifier * 2.5F)), 0.2F * bottomModifier, true, -0.1F, 0.1F, f2, 1 * inwater);
            this.swing(frontLeftFin, (float) (speed * 0.65 * (bottomModifier * 2.5F)), 0.1F * bottomModifier, true, 0, 0, f2, 1 * inwater);
            this.flap(frontRightFin, (float) (speed * 0.65 * (bottomModifier * 2.5F)), -0.2F * bottomModifier, true, 0.1F, -0.1F, f2, 1 * inwater);
            this.swing(frontRightFin, (float) (speed * 0.65 * (bottomModifier * 2.5F)), -0.1F * bottomModifier, true, 0, 0, f2, 1 * inwater);

            this.flap(backLeftFin, (float) (speed * 0.65 * (bottomModifier * 2.5F)), 0.15F * bottomModifier, true, -0.1F, 0.1F, f2, 1 * inwater);
            this.swing(backLeftFin, (float) (speed * 0.65 * (bottomModifier * 2.5F)), 0.1F * bottomModifier, true, 0, 0, f2, 1 * inwater);
            this.flap(backRightFin, (float) (speed * 0.65 * (bottomModifier * 2.5F)), -0.15F * bottomModifier, true, 0.1F, -0.1F, f2, 1 * inwater);
            this.swing(backRightFin, (float) (speed * 0.65 * (bottomModifier * 2.5F)), -0.1F * bottomModifier, true, 0, 0, f2, 1 * inwater);

            if (!e.isInWater()) {
                this.bob(main, -speed, 2F, false, f2, 1);
                this.chainWave(fishTail, speed, 0.2F, -3, f2, 1);
            }
        }
    }

    public void animate(IAnimatedEntity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        EntityPrehistoricFloraAgeableBase e = (EntityPrehistoricFloraAgeableBase) entity;
        animator.update(entity);
        this.resetToDefaultPose();
        setRotationAngles(f, f1, f2, f3, f4, f5, (Entity) entity);

        animator.setAnimation(e.ATTACK_ANIMATION);
        animator.startKeyframe(3);
        animator.rotate(this.jaw, (float) -Math.toRadians(f4 / (180F / (float) Math.PI)),0,0);
        animator.rotate(this.jaw, (float) -Math.toRadians(15), 0,0);
        animator.endKeyframe();
        animator.setStaticKeyframe(3);
        animator.resetKeyframe(1);

        animator.setAnimation(e.ROAR_ANIMATION);
        animator.startKeyframe(10);
        //animator.rotate(this.bodylower, (float) Math.toRadians(-10),0,0);
        //animator.rotate(this.bodybase, (float) Math.toRadians(10), 0,0);
        animator.rotate(this.main, 0, (float) Math.toRadians(5),0);
        animator.rotate(this.jaw, (float) Math.toRadians(f4 / (180F / (float) Math.PI)),0,0);
        animator.rotate(this.jaw, (float) Math.toRadians(15), 0,0);
        animator.endKeyframe();
        animator.setStaticKeyframe(5);
        animator.startKeyframe(3);
        //animator.rotate(this.bodylower, (float) Math.toRadians(-10),0,0);
        //animator.rotate(this.bodybase, (float) Math.toRadians(10), 0,0);
        animator.rotate(this.main, 0, (float) Math.toRadians(5),0);
        animator.endKeyframe();
        animator.setStaticKeyframe(2);
        animator.startKeyframe(10);
        //animator.rotate(this.bodylower, (float) Math.toRadians(-10),0,0);
        //animator.rotate(this.bodybase, (float) Math.toRadians(10), 0,0);
        animator.rotate(this.main, 0, (float) Math.toRadians(-5),0);
        animator.rotate(this.jaw, (float) Math.toRadians(f4 / (180F / (float) Math.PI)),0,0);
        animator.rotate(this.jaw, (float) Math.toRadians(15), 0,0);
        animator.endKeyframe();
        animator.setStaticKeyframe(5);
        animator.startKeyframe(3);
        //animator.rotate(this.bodylower, (float) Math.toRadians(-10),0,0);
        //animator.rotate(this.bodybase, (float) Math.toRadians(10), 0,0);
        animator.rotate(this.main, 0, (float) Math.toRadians(-5),0);
        animator.endKeyframe();
        animator.setStaticKeyframe(2);
        animator.resetKeyframe(10);

    }
}
