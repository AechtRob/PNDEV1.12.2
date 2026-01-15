package net.lepidodendron.entity.model.entity;

import net.ilexiconn.llibrary.client.model.tools.AdvancedModelRenderer;
import net.lepidodendron.entity.EntityPrehistoricFloraKettneraspis;
import net.lepidodendron.entity.model.ModelBasePalaeopedia;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

public class ModelKettneraspis extends ModelBasePalaeopedia {
    private final AdvancedModelRenderer main;
    private final AdvancedModelRenderer cube_r1;
    private final AdvancedModelRenderer cube_r2;
    private final AdvancedModelRenderer cube_r3;
    private final AdvancedModelRenderer cube_r4;
    private final AdvancedModelRenderer cube_r5;
    private final AdvancedModelRenderer cube_r6;
    private final AdvancedModelRenderer spinesRight;
    private final AdvancedModelRenderer cube_r7;
    private final AdvancedModelRenderer cube_r8;
    private final AdvancedModelRenderer spinesRight2;
    private final AdvancedModelRenderer cube_r9;
    private final AdvancedModelRenderer cube_r10;
    private final AdvancedModelRenderer spinesLeft6;
    private final AdvancedModelRenderer cube_r11;
    private final AdvancedModelRenderer cube_r12;
    private final AdvancedModelRenderer spinesRight4;
    private final AdvancedModelRenderer cube_r13;
    private final AdvancedModelRenderer cube_r14;
    private final AdvancedModelRenderer cube_r15;
    private final AdvancedModelRenderer spinesRight3;
    private final AdvancedModelRenderer cube_r16;
    private final AdvancedModelRenderer cube_r17;
    private final AdvancedModelRenderer cube_r18;
    private final AdvancedModelRenderer spinesLeft;
    private final AdvancedModelRenderer cube_r19;
    private final AdvancedModelRenderer cube_r20;
    private final AdvancedModelRenderer spinesRight6;
    private final AdvancedModelRenderer cube_r21;
    private final AdvancedModelRenderer cube_r22;
    private final AdvancedModelRenderer spinesLeft2;
    private final AdvancedModelRenderer cube_r23;
    private final AdvancedModelRenderer cube_r24;
    private final AdvancedModelRenderer spinesLeft4;
    private final AdvancedModelRenderer cube_r25;
    private final AdvancedModelRenderer cube_r26;
    private final AdvancedModelRenderer cube_r27;
    private final AdvancedModelRenderer spinesLeft3;
    private final AdvancedModelRenderer cube_r28;
    private final AdvancedModelRenderer cube_r29;
    private final AdvancedModelRenderer cube_r30;
    private final AdvancedModelRenderer head;
    private final AdvancedModelRenderer cube_r31;
    private final AdvancedModelRenderer cube_r32;
    private final AdvancedModelRenderer cube_r33;
    private final AdvancedModelRenderer cube_r34;
    private final AdvancedModelRenderer cube_r35;
    private final AdvancedModelRenderer cube_r36;
    private final AdvancedModelRenderer antennaeRight;
    private final AdvancedModelRenderer cube_r37;
    private final AdvancedModelRenderer antennaeLeft;
    private final AdvancedModelRenderer cube_r38;
    private final AdvancedModelRenderer bone;
    private final AdvancedModelRenderer cube_r39;
    private final AdvancedModelRenderer cube_r40;
    private final AdvancedModelRenderer cube_r41;
    private final AdvancedModelRenderer cube_r42;
    private final AdvancedModelRenderer cube_r43;
    private final AdvancedModelRenderer bone2;
    private final AdvancedModelRenderer cube_r44;
    private final AdvancedModelRenderer cube_r45;
    private final AdvancedModelRenderer cube_r46;
    private final AdvancedModelRenderer cube_r47;
    private final AdvancedModelRenderer cube_r48;
    private final AdvancedModelRenderer headSpineLeft;
    private final AdvancedModelRenderer spineL;
    private final AdvancedModelRenderer legRight;
    private final AdvancedModelRenderer cube_r49;
    private final AdvancedModelRenderer legLeft;
    private final AdvancedModelRenderer cube_r50;
    private final AdvancedModelRenderer legRight2;
    private final AdvancedModelRenderer cube_r51;
    private final AdvancedModelRenderer legLeft2;
    private final AdvancedModelRenderer cube_r52;
    private final AdvancedModelRenderer legRight3;
    private final AdvancedModelRenderer cube_r53;
    private final AdvancedModelRenderer legLeft3;
    private final AdvancedModelRenderer cube_r54;
    private final AdvancedModelRenderer legRight4;
    private final AdvancedModelRenderer cube_r55;
    private final AdvancedModelRenderer legLeft4;
    private final AdvancedModelRenderer cube_r56;

    public ModelKettneraspis() {
        this.textureWidth = 32;
        this.textureHeight = 32;

        this.main = new AdvancedModelRenderer(this);
        this.main.setRotationPoint(0.0F, 23.2F, 0.0F);


        this.cube_r1 = new AdvancedModelRenderer(this);
        this.cube_r1.setRotationPoint(-0.7852F, -0.3682F, 0.1717F);
        this.main.addChild(cube_r1);
        this.setRotateAngle(cube_r1, -0.1478F, 0.5627F, -0.2957F);
        this.cube_r1.cubeList.add(new ModelBox(cube_r1, 17, 0, -2.25F, -0.175F, 0.0F, 2, 0, 3, 0.0F, false));

        this.cube_r2 = new AdvancedModelRenderer(this);
        this.cube_r2.setRotationPoint(-1.018F, -0.6734F, -3.5737F);
        this.main.addChild(cube_r2);
        this.setRotateAngle(cube_r2, -0.0416F, -0.0015F, -0.2659F);
        this.cube_r2.cubeList.add(new ModelBox(cube_r2, 0, 13, -1.725F, 0.026F, 0.0F, 2, 0, 5, 0.0F, false));

        this.cube_r3 = new AdvancedModelRenderer(this);
        this.cube_r3.setRotationPoint(0.7852F, -0.3682F, 0.1717F);
        this.main.addChild(cube_r3);
        this.setRotateAngle(cube_r3, -0.1478F, -0.5627F, 0.2957F);
        this.cube_r3.cubeList.add(new ModelBox(cube_r3, 17, 0, 0.25F, -0.175F, 0.0F, 2, 0, 3, 0.0F, true));

        this.cube_r4 = new AdvancedModelRenderer(this);
        this.cube_r4.setRotationPoint(1.018F, -0.6734F, -3.5737F);
        this.main.addChild(cube_r4);
        this.setRotateAngle(cube_r4, -0.0416F, 0.0015F, 0.2659F);
        this.cube_r4.cubeList.add(new ModelBox(cube_r4, 0, 13, -0.275F, 0.026F, 0.0F, 2, 0, 5, 0.0F, true));

        this.cube_r5 = new AdvancedModelRenderer(this);
        this.cube_r5.setRotationPoint(0.0F, -1.175F, -2.875F);
        this.main.addChild(cube_r5);
        this.setRotateAngle(cube_r5, -0.1004F, 0.0F, 0.0F);
        this.cube_r5.cubeList.add(new ModelBox(cube_r5, 0, 0, -1.0F, 0.0F, 0.0F, 2, 1, 6, 0.0F, false));

        this.cube_r6 = new AdvancedModelRenderer(this);
        this.cube_r6.setRotationPoint(1.0F, -0.5739F, 3.0948F);
        this.main.addChild(cube_r6);
        this.setRotateAngle(cube_r6, -0.4058F, 0.0F, 0.0F);
        this.cube_r6.cubeList.add(new ModelBox(cube_r6, 16, 21, -2.0F, 0.0F, 0.0F, 2, 1, 1, -0.01F, false));

        this.spinesRight = new AdvancedModelRenderer(this);
        this.spinesRight.setRotationPoint(0.5F, -1.65F, 3.625F);
        this.main.addChild(spinesRight);


        this.cube_r7 = new AdvancedModelRenderer(this);
        this.cube_r7.setRotationPoint(-1.5746F, 1.45F, -0.645F);
        this.spinesRight.addChild(cube_r7);
        this.setRotateAngle(cube_r7, 0.0F, -0.3578F, 0.0F);
        this.cube_r7.cubeList.add(new ModelBox(cube_r7, 5, 28, -0.825F, 0.2F, -0.575F, 1, 0, 1, 0.0F, false));

        this.cube_r8 = new AdvancedModelRenderer(this);
        this.cube_r8.setRotationPoint(0.0F, 0.65F, 0.0F);
        this.spinesRight.addChild(cube_r8);
        this.setRotateAngle(cube_r8, 0.0F, -0.7854F, 0.0F);
        this.cube_r8.cubeList.add(new ModelBox(cube_r8, 28, 3, -0.875F, 1.0F, 0.175F, 1, 0, 1, 0.0F, false));

        this.spinesRight2 = new AdvancedModelRenderer(this);
        this.spinesRight2.setRotationPoint(-1.4455F, 1.6608F, 0.0359F);
        this.spinesRight.addChild(spinesRight2);
        this.setRotateAngle(spinesRight2, 0.0349F, -0.0029F, 0.0F);


        this.cube_r9 = new AdvancedModelRenderer(this);
        this.cube_r9.setRotationPoint(-0.5508F, -1.525F, 0.8205F);
        this.spinesRight2.addChild(cube_r9);
        this.setRotateAngle(cube_r9, 0.0F, -0.0436F, 0.0F);
        this.cube_r9.cubeList.add(new ModelBox(cube_r9, 28, 17, -0.139F, 1.504F, 0.029F, 1, 0, 1, 0.0F, false));

        this.cube_r10 = new AdvancedModelRenderer(this);
        this.cube_r10.setRotationPoint(-0.6356F, -1.525F, 0.5068F);
        this.spinesRight2.addChild(cube_r10);
        this.setRotateAngle(cube_r10, 0.0F, -0.2749F, 0.0F);
        this.cube_r10.cubeList.add(new ModelBox(cube_r10, 27, 23, 0.043F, 1.499F, -1.6686F, 1, 0, 2, 0.0F, false));

        this.spinesLeft6 = new AdvancedModelRenderer(this);
        this.spinesLeft6.setRotationPoint(-2.5247F, 1.722F, -1.6285F);
        this.spinesRight.addChild(spinesLeft6);
        this.setRotateAngle(spinesLeft6, 0.015F, 0.1014F, 0.0148F);


        this.cube_r11 = new AdvancedModelRenderer(this);
        this.cube_r11.setRotationPoint(-1.1168F, -1.55F, -0.0322F);
        this.spinesLeft6.addChild(cube_r11);
        this.setRotateAngle(cube_r11, 0.0F, 1.2697F, 0.0F);
        this.cube_r11.cubeList.add(new ModelBox(cube_r11, 19, 10, -3.1979F, 1.4994F, 0.0427F, 3, 0, 1, 0.0F, false));

        this.cube_r12 = new AdvancedModelRenderer(this);
        this.cube_r12.setRotationPoint(-0.2318F, -1.55F, -0.1823F);
        this.spinesLeft6.addChild(cube_r12);
        this.setRotateAngle(cube_r12, 0.0F, 0.6109F, 0.0F);
        this.cube_r12.cubeList.add(new ModelBox(cube_r12, 28, 7, -0.948F, 1.4944F, -0.216F, 1, 0, 1, 0.0F, false));

        this.spinesRight4 = new AdvancedModelRenderer(this);
        this.spinesRight4.setRotationPoint(-2.7389F, 1.6208F, -3.3825F);
        this.spinesRight.addChild(spinesRight4);
        this.setRotateAngle(spinesRight4, -0.021F, 0.066F, 0.0376F);


        this.cube_r13 = new AdvancedModelRenderer(this);
        this.cube_r13.setRotationPoint(-2.1467F, -1.5F, 1.4248F);
        this.spinesRight4.addChild(cube_r13);
        this.setRotateAngle(cube_r13, 0.0F, 1.2261F, 0.0F);
        this.cube_r13.cubeList.add(new ModelBox(cube_r13, 15, 19, -3.0304F, 1.5015F, -0.0501F, 3, 0, 1, 0.0F, false));

        this.cube_r14 = new AdvancedModelRenderer(this);
        this.cube_r14.setRotationPoint(-0.9291F, -1.5F, -0.1619F);
        this.spinesRight4.addChild(cube_r14);
        this.setRotateAngle(cube_r14, 0.0F, 0.9163F, 0.0F);
        this.cube_r14.cubeList.add(new ModelBox(cube_r14, 14, 24, -2.0442F, 1.4986F, -0.0384F, 2, 0, 1, 0.0F, false));

        this.cube_r15 = new AdvancedModelRenderer(this);
        this.cube_r15.setRotationPoint(-0.0442F, -1.5F, -0.312F);
        this.spinesRight4.addChild(cube_r15);
        this.setRotateAngle(cube_r15, 0.0F, 0.3927F, 0.0F);
        this.cube_r15.cubeList.add(new ModelBox(cube_r15, 28, 9, -0.9325F, 1.4966F, -0.2112F, 1, 0, 1, 0.0F, false));

        this.spinesRight3 = new AdvancedModelRenderer(this);
        this.spinesRight3.setRotationPoint(-2.863F, 1.5974F, -5.1594F);
        this.spinesRight.addChild(spinesRight3);
        this.setRotateAngle(spinesRight3, -0.0314F, 0.0744F, 0.0258F);


        this.cube_r16 = new AdvancedModelRenderer(this);
        this.cube_r16.setRotationPoint(-3.1029F, -1.55F, 2.0912F);
        this.spinesRight3.addChild(cube_r16);
        this.setRotateAngle(cube_r16, 0.0F, 1.0734F, 0.0F);
        this.cube_r16.cubeList.add(new ModelBox(cube_r16, 17, 5, -5.0211F, 1.5033F, -0.0359F, 5, 0, 1, 0.0F, false));

        this.cube_r17 = new AdvancedModelRenderer(this);
        this.cube_r17.setRotationPoint(-1.0761F, -1.55F, -0.1206F);
        this.spinesRight3.addChild(cube_r17);
        this.setRotateAngle(cube_r17, 0.0F, 0.829F, 0.0F);
        this.cube_r17.cubeList.add(new ModelBox(cube_r17, 7, 21, -3.0292F, 1.5002F, -0.0297F, 3, 0, 1, 0.0F, false));

        this.cube_r18 = new AdvancedModelRenderer(this);
        this.cube_r18.setRotationPoint(-0.1912F, -1.55F, -0.2707F);
        this.spinesRight3.addChild(cube_r18);
        this.setRotateAngle(cube_r18, 0.0F, 0.3927F, 0.0F);
        this.cube_r18.cubeList.add(new ModelBox(cube_r18, 28, 11, -0.914F, 1.4983F, -0.2146F, 1, 0, 1, 0.0F, false));

        this.spinesLeft = new AdvancedModelRenderer(this);
        this.spinesLeft.setRotationPoint(-0.5F, -1.65F, 3.625F);
        this.main.addChild(spinesLeft);


        this.cube_r19 = new AdvancedModelRenderer(this);
        this.cube_r19.setRotationPoint(1.5746F, 1.45F, -0.645F);
        this.spinesLeft.addChild(cube_r19);
        this.setRotateAngle(cube_r19, 0.0F, 0.3578F, 0.0F);
        this.cube_r19.cubeList.add(new ModelBox(cube_r19, 5, 28, -0.175F, 0.2F, -0.575F, 1, 0, 1, 0.0F, true));

        this.cube_r20 = new AdvancedModelRenderer(this);
        this.cube_r20.setRotationPoint(0.0F, 0.65F, 0.0F);
        this.spinesLeft.addChild(cube_r20);
        this.setRotateAngle(cube_r20, 0.0F, 0.7854F, 0.0F);
        this.cube_r20.cubeList.add(new ModelBox(cube_r20, 28, 3, -0.125F, 1.01F, 0.175F, 1, 0, 1, 0.0F, true));

        this.spinesRight6 = new AdvancedModelRenderer(this);
        this.spinesRight6.setRotationPoint(1.4455F, 1.6608F, 0.0359F);
        this.spinesLeft.addChild(spinesRight6);
        this.setRotateAngle(spinesRight6, 0.0349F, 0.0029F, 0.0F);


        this.cube_r21 = new AdvancedModelRenderer(this);
        this.cube_r21.setRotationPoint(0.5508F, -1.525F, 0.8205F);
        this.spinesRight6.addChild(cube_r21);
        this.setRotateAngle(cube_r21, 0.0F, 0.0436F, 0.0F);
        this.cube_r21.cubeList.add(new ModelBox(cube_r21, 28, 17, -0.861F, 1.504F, 0.029F, 1, 0, 1, 0.0F, true));

        this.cube_r22 = new AdvancedModelRenderer(this);
        this.cube_r22.setRotationPoint(0.6356F, -1.525F, 0.5068F);
        this.spinesRight6.addChild(cube_r22);
        this.setRotateAngle(cube_r22, 0.0F, 0.2749F, 0.0F);
        this.cube_r22.cubeList.add(new ModelBox(cube_r22, 27, 23, -1.043F, 1.499F, -1.6686F, 1, 0, 2, 0.0F, true));

        this.spinesLeft2 = new AdvancedModelRenderer(this);
        this.spinesLeft2.setRotationPoint(2.5247F, 1.722F, -1.6285F);
        this.spinesLeft.addChild(spinesLeft2);
        this.setRotateAngle(spinesLeft2, 0.015F, -0.1014F, -0.0148F);


        this.cube_r23 = new AdvancedModelRenderer(this);
        this.cube_r23.setRotationPoint(1.1168F, -1.55F, -0.0322F);
        this.spinesLeft2.addChild(cube_r23);
        this.setRotateAngle(cube_r23, 0.0F, -1.2697F, 0.0F);
        this.cube_r23.cubeList.add(new ModelBox(cube_r23, 19, 10, 0.1979F, 1.4994F, 0.0427F, 3, 0, 1, 0.0F, true));

        this.cube_r24 = new AdvancedModelRenderer(this);
        this.cube_r24.setRotationPoint(0.2318F, -1.55F, -0.1823F);
        this.spinesLeft2.addChild(cube_r24);
        this.setRotateAngle(cube_r24, 0.0F, -0.6109F, 0.0F);
        this.cube_r24.cubeList.add(new ModelBox(cube_r24, 28, 7, -0.052F, 1.4944F, -0.216F, 1, 0, 1, 0.0F, true));

        this.spinesLeft4 = new AdvancedModelRenderer(this);
        this.spinesLeft4.setRotationPoint(2.7389F, 1.6208F, -3.3825F);
        this.spinesLeft.addChild(spinesLeft4);
        this.setRotateAngle(spinesLeft4, -0.021F, -0.066F, -0.0376F);


        this.cube_r25 = new AdvancedModelRenderer(this);
        this.cube_r25.setRotationPoint(2.1467F, -1.5F, 1.4248F);
        this.spinesLeft4.addChild(cube_r25);
        this.setRotateAngle(cube_r25, 0.0F, -1.2261F, 0.0F);
        this.cube_r25.cubeList.add(new ModelBox(cube_r25, 15, 19, 0.0304F, 1.5015F, -0.0501F, 3, 0, 1, 0.0F, true));

        this.cube_r26 = new AdvancedModelRenderer(this);
        this.cube_r26.setRotationPoint(0.9291F, -1.5F, -0.1619F);
        this.spinesLeft4.addChild(cube_r26);
        this.setRotateAngle(cube_r26, 0.0F, -0.9163F, 0.0F);
        this.cube_r26.cubeList.add(new ModelBox(cube_r26, 14, 24, 0.0442F, 1.4986F, -0.0384F, 2, 0, 1, 0.0F, true));

        this.cube_r27 = new AdvancedModelRenderer(this);
        this.cube_r27.setRotationPoint(0.0442F, -1.5F, -0.312F);
        this.spinesLeft4.addChild(cube_r27);
        this.setRotateAngle(cube_r27, 0.0F, -0.3927F, 0.0F);
        this.cube_r27.cubeList.add(new ModelBox(cube_r27, 28, 9, -0.0675F, 1.4966F, -0.2112F, 1, 0, 1, 0.0F, true));

        this.spinesLeft3 = new AdvancedModelRenderer(this);
        this.spinesLeft3.setRotationPoint(2.863F, 1.5974F, -5.1594F);
        this.spinesLeft.addChild(spinesLeft3);
        this.setRotateAngle(spinesLeft3, -0.0314F, -0.0744F, -0.0258F);


        this.cube_r28 = new AdvancedModelRenderer(this);
        this.cube_r28.setRotationPoint(3.1029F, -1.55F, 2.0912F);
        this.spinesLeft3.addChild(cube_r28);
        this.setRotateAngle(cube_r28, 0.0F, -1.0734F, 0.0F);
        this.cube_r28.cubeList.add(new ModelBox(cube_r28, 17, 5, 0.0211F, 1.5033F, -0.0359F, 5, 0, 1, 0.0F, true));

        this.cube_r29 = new AdvancedModelRenderer(this);
        this.cube_r29.setRotationPoint(1.0761F, -1.55F, -0.1206F);
        this.spinesLeft3.addChild(cube_r29);
        this.setRotateAngle(cube_r29, 0.0F, -0.829F, 0.0F);
        this.cube_r29.cubeList.add(new ModelBox(cube_r29, 7, 21, 0.0292F, 1.5002F, -0.0297F, 3, 0, 1, 0.0F, true));

        this.cube_r30 = new AdvancedModelRenderer(this);
        this.cube_r30.setRotationPoint(0.1912F, -1.55F, -0.2707F);
        this.spinesLeft3.addChild(cube_r30);
        this.setRotateAngle(cube_r30, 0.0F, -0.3927F, 0.0F);
        this.cube_r30.cubeList.add(new ModelBox(cube_r30, 28, 11, -0.086F, 1.4983F, -0.2146F, 1, 0, 1, 0.0F, true));

        this.head = new AdvancedModelRenderer(this);
        this.head.setRotationPoint(-0.5F, -0.85F, -2.85F);
        this.main.addChild(head);
        this.setRotateAngle(head, 0.0349F, 0.0F, 0.0F);
        this.head.cubeList.add(new ModelBox(head, 23, 21, -0.5F, -0.4749F, -1.8939F, 2, 1, 1, 0.0F, false));

        this.cube_r31 = new AdvancedModelRenderer(this);
        this.cube_r31.setRotationPoint(0.5F, -0.15F, -0.15F);
        this.head.addChild(cube_r31);
        this.setRotateAngle(cube_r31, 1.021F, 0.0F, 0.0F);
        this.cube_r31.cubeList.add(new ModelBox(cube_r31, 21, 26, 0.0F, -0.9112F, -0.7977F, 0, 1, 2, 0.0F, false));

        this.cube_r32 = new AdvancedModelRenderer(this);
        this.cube_r32.setRotationPoint(1.5F, -0.4749F, -1.8939F);
        this.head.addChild(cube_r32);
        this.setRotateAngle(cube_r32, 0.7985F, 0.0F, 0.0F);
        this.cube_r32.cubeList.add(new ModelBox(cube_r32, 20, 7, -2.0F, 0.0F, -1.0F, 2, 1, 1, 0.0F, false));

        this.cube_r33 = new AdvancedModelRenderer(this);
        this.cube_r33.setRotationPoint(-1.0F, 0.1F, -1.15F);
        this.head.addChild(cube_r33);
        this.setRotateAngle(cube_r33, -0.1955F, -0.2024F, -0.1246F);
        this.cube_r33.cubeList.add(new ModelBox(cube_r33, 28, 0, -0.6188F, -1.0902F, -0.5486F, 1, 1, 1, 0.002F, false));

        this.cube_r34 = new AdvancedModelRenderer(this);
        this.cube_r34.setRotationPoint(2.0F, 0.1F, -1.15F);
        this.head.addChild(cube_r34);
        this.setRotateAngle(cube_r34, -0.1955F, 0.2024F, 0.1246F);
        this.cube_r34.cubeList.add(new ModelBox(cube_r34, 28, 0, -0.3812F, -1.0902F, -0.5486F, 1, 1, 1, 0.002F, true));

        this.cube_r35 = new AdvancedModelRenderer(this);
        this.cube_r35.setRotationPoint(0.5F, -0.3F, -0.9F);
        this.head.addChild(cube_r35);
        this.setRotateAngle(cube_r35, -0.0785F, 0.0F, 0.0F);
        this.cube_r35.cubeList.add(new ModelBox(cube_r35, 7, 23, -1.0F, -0.1748F, -0.0076F, 2, 1, 1, 0.01F, false));

        this.cube_r36 = new AdvancedModelRenderer(this);
        this.cube_r36.setRotationPoint(-0.5F, -0.3F, -0.65F);
        this.head.addChild(cube_r36);
        this.setRotateAngle(cube_r36, 0.2182F, 0.0F, 0.0F);
        this.cube_r36.cubeList.add(new ModelBox(cube_r36, 15, 15, -1.0F, 0.0179F, -1.8618F, 4, 1, 2, 0.0F, false));

        this.antennaeRight = new AdvancedModelRenderer(this);
        this.antennaeRight.setRotationPoint(0.5F, 0.05F, -2.9F);
        this.head.addChild(antennaeRight);


        this.cube_r37 = new AdvancedModelRenderer(this);
        this.cube_r37.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.antennaeRight.addChild(cube_r37);
        this.setRotateAngle(cube_r37, 0.0F, -1.1737F, 0.0F);
        this.cube_r37.cubeList.add(new ModelBox(cube_r37, 0, 8, -4.5F, 0.65F, 0.3F, 5, 0, 4, 0.0F, false));

        this.antennaeLeft = new AdvancedModelRenderer(this);
        this.antennaeLeft.setRotationPoint(0.5F, 0.05F, -2.9F);
        this.head.addChild(antennaeLeft);


        this.cube_r38 = new AdvancedModelRenderer(this);
        this.cube_r38.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.antennaeLeft.addChild(cube_r38);
        this.setRotateAngle(cube_r38, 0.0F, 1.1737F, 0.0F);
        this.cube_r38.cubeList.add(new ModelBox(cube_r38, 0, 8, -0.5F, 0.65F, 0.3F, 5, 0, 4, 0.0F, true));

        this.bone = new AdvancedModelRenderer(this);
        this.bone.setRotationPoint(-0.8842F, 0.6544F, -2.9622F);
        this.head.addChild(bone);


        this.cube_r39 = new AdvancedModelRenderer(this);
        this.cube_r39.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.bone.addChild(cube_r39);
        this.setRotateAngle(cube_r39, 0.3571F, -0.6221F, -0.507F);
        this.cube_r39.cubeList.add(new ModelBox(cube_r39, 10, 28, 0.0F, -0.049F, 0.05F, 1, 0, 1, 0.0F, false));

        this.cube_r40 = new AdvancedModelRenderer(this);
        this.cube_r40.setRotationPoint(-1.7528F, -0.0999F, 2.9618F);
        this.bone.addChild(cube_r40);
        this.setRotateAngle(cube_r40, 2.3812F, 1.3536F, 2.0758F);
        this.cube_r40.cubeList.add(new ModelBox(cube_r40, -2, 13, 0.0F, 0.026F, 0.0F, 1, 0, 3, 0.0F, false));

        this.cube_r41 = new AdvancedModelRenderer(this);
        this.cube_r41.setRotationPoint(0.3133F, -0.9208F, 1.5985F);
        this.bone.addChild(cube_r41);
        this.setRotateAngle(cube_r41, 0.2507F, 0.9288F, -0.115F);
        this.cube_r41.cubeList.add(new ModelBox(cube_r41, 14, 12, -7.3773F, 0.3373F, -2.0182F, 8, 0, 2, 0.0F, false));

        this.cube_r42 = new AdvancedModelRenderer(this);
        this.cube_r42.setRotationPoint(-1.4556F, 0.3167F, 0.3128F);
        this.bone.addChild(cube_r42);
        this.setRotateAngle(cube_r42, 0.1804F, -0.0742F, -0.3694F);
        this.cube_r42.cubeList.add(new ModelBox(cube_r42, 28, 15, 0.0F, 0.0F, 0.0F, 1, 0, 1, 0.0F, false));

        this.cube_r43 = new AdvancedModelRenderer(this);
        this.cube_r43.setRotationPoint(-1.5138F, 0.2451F, 1.8766F);
        this.bone.addChild(cube_r43);
        this.setRotateAngle(cube_r43, 0.1817F, 0.1405F, -0.3302F);
        this.cube_r43.cubeList.add(new ModelBox(cube_r43, 15, 28, -0.2996F, -0.1939F, -0.9092F, 1, 0, 1, 0.0F, false));

        this.bone2 = new AdvancedModelRenderer(this);
        this.bone2.setRotationPoint(1.8842F, 0.6544F, -2.9622F);
        this.head.addChild(bone2);


        this.cube_r44 = new AdvancedModelRenderer(this);
        this.cube_r44.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.bone2.addChild(cube_r44);
        this.setRotateAngle(cube_r44, 0.3571F, 0.6221F, 0.507F);
        this.cube_r44.cubeList.add(new ModelBox(cube_r44, 10, 28, -1.0F, -0.049F, 0.05F, 1, 0, 1, 0.0F, true));

        this.cube_r45 = new AdvancedModelRenderer(this);
        this.cube_r45.setRotationPoint(1.7528F, -0.0999F, 2.9618F);
        this.bone2.addChild(cube_r45);
        this.setRotateAngle(cube_r45, 2.3812F, -1.3536F, -2.0758F);
        this.cube_r45.cubeList.add(new ModelBox(cube_r45, -2, 13, -1.0F, 0.026F, 0.0F, 1, 0, 3, 0.0F, true));

        this.cube_r46 = new AdvancedModelRenderer(this);
        this.cube_r46.setRotationPoint(-0.3133F, -0.9208F, 1.5985F);
        this.bone2.addChild(cube_r46);
        this.setRotateAngle(cube_r46, 0.2507F, -0.9288F, 0.115F);
        this.cube_r46.cubeList.add(new ModelBox(cube_r46, 14, 12, -0.6227F, 0.3373F, -2.0182F, 8, 0, 2, 0.0F, true));

        this.cube_r47 = new AdvancedModelRenderer(this);
        this.cube_r47.setRotationPoint(1.4556F, 0.3167F, 0.3128F);
        this.bone2.addChild(cube_r47);
        this.setRotateAngle(cube_r47, 0.1804F, 0.0742F, 0.3694F);
        this.cube_r47.cubeList.add(new ModelBox(cube_r47, 28, 15, -1.0F, 0.0F, 0.0F, 1, 0, 1, 0.0F, true));

        this.cube_r48 = new AdvancedModelRenderer(this);
        this.cube_r48.setRotationPoint(1.5138F, 0.2451F, 1.8766F);
        this.bone2.addChild(cube_r48);
        this.setRotateAngle(cube_r48, 0.1817F, -0.1405F, 0.3302F);
        this.cube_r48.cubeList.add(new ModelBox(cube_r48, 15, 28, -0.7004F, -0.1939F, -0.9092F, 1, 0, 1, 0.0F, true));

        this.headSpineLeft = new AdvancedModelRenderer(this);
        this.headSpineLeft.setRotationPoint(2.5F, -0.15F, -2.9F);
        this.head.addChild(headSpineLeft);
        this.setRotateAngle(headSpineLeft, 0.0F, 0.0262F, 0.0F);


        this.spineL = new AdvancedModelRenderer(this);
        this.spineL.setRotationPoint(0.4465F, 0.0F, 0.4198F);
        this.headSpineLeft.addChild(spineL);
        this.setRotateAngle(spineL, 0.0F, -0.0349F, 0.0F);


        this.legRight = new AdvancedModelRenderer(this);
        this.legRight.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.main.addChild(legRight);


        this.cube_r49 = new AdvancedModelRenderer(this);
        this.cube_r49.setRotationPoint(0.0F, 0.125F, -3.05F);
        this.legRight.addChild(cube_r49);
        this.setRotateAngle(cube_r49, 0.0F, 0.0436F, -0.1309F);
        this.cube_r49.cubeList.add(new ModelBox(cube_r49, 24, 19, -2.0F, 0.0F, -0.5F, 2, 0, 1, 0.0F, false));

        this.legLeft = new AdvancedModelRenderer(this);
        this.legLeft.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.main.addChild(legLeft);


        this.cube_r50 = new AdvancedModelRenderer(this);
        this.cube_r50.setRotationPoint(0.0F, 0.125F, -3.05F);
        this.legLeft.addChild(cube_r50);
        this.setRotateAngle(cube_r50, 0.0F, -0.0436F, 0.1309F);
        this.cube_r50.cubeList.add(new ModelBox(cube_r50, 24, 19, 0.0F, 0.0F, -0.5F, 2, 0, 1, 0.0F, true));

        this.legRight2 = new AdvancedModelRenderer(this);
        this.legRight2.setRotationPoint(0.0F, 0.0F, 1.25F);
        this.main.addChild(legRight2);


        this.cube_r51 = new AdvancedModelRenderer(this);
        this.cube_r51.setRotationPoint(0.0F, 0.125F, -3.05F);
        this.legRight2.addChild(cube_r51);
        this.setRotateAngle(cube_r51, 0.0F, 0.0436F, -0.1309F);
        this.cube_r51.cubeList.add(new ModelBox(cube_r51, 21, 24, -2.0F, 0.0F, -0.5F, 2, 0, 1, 0.0F, false));

        this.legLeft2 = new AdvancedModelRenderer(this);
        this.legLeft2.setRotationPoint(0.0F, 0.0F, 1.25F);
        this.main.addChild(legLeft2);


        this.cube_r52 = new AdvancedModelRenderer(this);
        this.cube_r52.setRotationPoint(0.0F, 0.125F, -3.05F);
        this.legLeft2.addChild(cube_r52);
        this.setRotateAngle(cube_r52, 0.0F, -0.0436F, 0.1309F);
        this.cube_r52.cubeList.add(new ModelBox(cube_r52, 21, 24, 0.0F, 0.0F, -0.5F, 2, 0, 1, 0.0F, true));

        this.legRight3 = new AdvancedModelRenderer(this);
        this.legRight3.setRotationPoint(0.0F, 0.0F, 2.5F);
        this.main.addChild(legRight3);


        this.cube_r53 = new AdvancedModelRenderer(this);
        this.cube_r53.setRotationPoint(0.0F, 0.125F, -3.05F);
        this.legRight3.addChild(cube_r53);
        this.setRotateAngle(cube_r53, 0.0F, 0.0436F, -0.1309F);
        this.cube_r53.cubeList.add(new ModelBox(cube_r53, 7, 26, -2.0F, 0.0F, -0.5F, 2, 0, 1, 0.0F, false));

        this.legLeft3 = new AdvancedModelRenderer(this);
        this.legLeft3.setRotationPoint(0.0F, 0.0F, 2.5F);
        this.main.addChild(legLeft3);


        this.cube_r54 = new AdvancedModelRenderer(this);
        this.cube_r54.setRotationPoint(0.0F, 0.125F, -3.05F);
        this.legLeft3.addChild(cube_r54);
        this.setRotateAngle(cube_r54, 0.0F, -0.0436F, 0.1309F);
        this.cube_r54.cubeList.add(new ModelBox(cube_r54, 7, 26, 0.0F, 0.0F, -0.5F, 2, 0, 1, 0.0F, true));

        this.legRight4 = new AdvancedModelRenderer(this);
        this.legRight4.setRotationPoint(0.0F, 0.0F, 3.75F);
        this.main.addChild(legRight4);


        this.cube_r55 = new AdvancedModelRenderer(this);
        this.cube_r55.setRotationPoint(0.0F, 0.125F, -3.05F);
        this.legRight4.addChild(cube_r55);
        this.setRotateAngle(cube_r55, 0.0F, 0.0873F, -0.1309F);
        this.cube_r55.cubeList.add(new ModelBox(cube_r55, 14, 26, -2.0F, 0.0F, -0.5F, 2, 0, 1, 0.0F, false));

        this.legLeft4 = new AdvancedModelRenderer(this);
        this.legLeft4.setRotationPoint(0.0F, 0.0F, 3.75F);
        this.main.addChild(legLeft4);


        this.cube_r56 = new AdvancedModelRenderer(this);
        this.cube_r56.setRotationPoint(0.0F, 0.125F, -3.05F);
        this.legLeft4.addChild(cube_r56);
        this.setRotateAngle(cube_r56, 0.0F, -0.0873F, 0.1309F);
        this.cube_r56.cubeList.add(new ModelBox(cube_r56, 14, 26, 0.0F, 0.0F, -0.5F, 2, 0, 1, 0.0F, true));

        updateDefaultPose();
    }

    @Override
    public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        this.main.render(f5 * 0.38F);
    }

    public void renderStaticFloor(float f) {
        resetToDefaultPose();
    }
    @Override
    public void renderStaticBook(float f) {
        //Rotations, positions and sizing:
        this.main.offsetY = -0.8F;
        this.main.offsetX = -0.2F;
        this.main.rotateAngleX = (float)Math.toRadians(45);
        this.main.rotateAngleY = (float)Math.toRadians(220);
        this.main.rotateAngleZ = (float)Math.toRadians(-20);
        this.main.scaleChildren = true;
        float scaler = 2.0F;
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
        this.main.offsetY = 0.91F;
        EntityPrehistoricFloraKettneraspis ee = (EntityPrehistoricFloraKettneraspis) e;

        AdvancedModelRenderer[] legsL = {this.legLeft, this.legLeft2, this.legLeft3, this.legLeft4};
        AdvancedModelRenderer[] legsR = {this.legRight, this.legRight2, this.legRight3, this.legRight4};

        this.swing(antennaeLeft, 0.5F, -0.2F, false, 0, -0.1F, f2, 0.8F);
        this.swing(antennaeRight, 0.5F, 0.2F, false, 0, 0.1F, f2, 0.8F);

        if (ee.isInWater()) {
            if (ee.getIsMoving()) {
                this.flap(legLeft, 0.5F, -0.5F, false, 0, -0.5F, f2, 0.3F);
                this.flap(legRight, 0.5F, 0.5F, false, 0, 0.5F, f2, 0.3F);
                this.flap(legLeft2, 0.5F, -0.5F, false, 1.0F, -0.5F, f2, 0.3F);
                this.flap(legRight2, 0.5F, 0.5F, false, 1.0F, 0.5F, f2, 0.3F);
                this.flap(legLeft3, 0.5F, -0.5F, false, 2.0F, -0.5F, f2, 0.3F);
                this.flap(legRight3, 0.5F, 0.5F, false, 2.0F, 0.5F, f2, 0.3F);
                this.flap(legLeft4, 0.5F, -0.5F, false, 3.0F, -0.5F, f2, 0.3F);
                this.flap(legRight4, 0.5F, 0.5F, false, 3.0F, 0.5F, f2, 0.3F);

                this.chainWave(legsL, 0.2F, 0.2F, -3, f2, 1);
                this.chainWave(legsR, 0.6F, 0.2F, -3, f2, 1);
            }
        }
    }
}
