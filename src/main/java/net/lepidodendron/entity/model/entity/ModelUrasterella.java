package net.lepidodendron.entity.model.entity;

import net.ilexiconn.llibrary.client.model.tools.AdvancedModelRenderer;
import net.lepidodendron.entity.model.ModelBasePalaeopedia;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

public class ModelUrasterella extends ModelBasePalaeopedia {
    private final AdvancedModelRenderer main;
    private final AdvancedModelRenderer armA;
    private final AdvancedModelRenderer cube_r1;
    private final AdvancedModelRenderer cube_r2;
    private final AdvancedModelRenderer cube_r3;
    private final AdvancedModelRenderer cube_r4;
    private final AdvancedModelRenderer cube_r5;
    private final AdvancedModelRenderer cube_r6;
    private final AdvancedModelRenderer armA2;
    private final AdvancedModelRenderer cube_r7;
    private final AdvancedModelRenderer cube_r8;
    private final AdvancedModelRenderer cube_r9;
    private final AdvancedModelRenderer cube_r10;
    private final AdvancedModelRenderer armA3;
    private final AdvancedModelRenderer cube_r11;
    private final AdvancedModelRenderer cube_r12;
    private final AdvancedModelRenderer cube_r13;
    private final AdvancedModelRenderer cube_r14;
    private final AdvancedModelRenderer armB;
    private final AdvancedModelRenderer cube_r15;
    private final AdvancedModelRenderer cube_r16;
    private final AdvancedModelRenderer cube_r17;
    private final AdvancedModelRenderer cube_r18;
    private final AdvancedModelRenderer cube_r19;
    private final AdvancedModelRenderer cube_r20;
    private final AdvancedModelRenderer armB2;
    private final AdvancedModelRenderer cube_r21;
    private final AdvancedModelRenderer cube_r22;
    private final AdvancedModelRenderer cube_r23;
    private final AdvancedModelRenderer cube_r24;
    private final AdvancedModelRenderer armB3;
    private final AdvancedModelRenderer cube_r25;
    private final AdvancedModelRenderer cube_r26;
    private final AdvancedModelRenderer cube_r27;
    private final AdvancedModelRenderer cube_r28;
    private final AdvancedModelRenderer armE;
    private final AdvancedModelRenderer cube_r29;
    private final AdvancedModelRenderer cube_r30;
    private final AdvancedModelRenderer cube_r31;
    private final AdvancedModelRenderer cube_r32;
    private final AdvancedModelRenderer cube_r33;
    private final AdvancedModelRenderer cube_r34;
    private final AdvancedModelRenderer armE2;
    private final AdvancedModelRenderer cube_r35;
    private final AdvancedModelRenderer cube_r36;
    private final AdvancedModelRenderer cube_r37;
    private final AdvancedModelRenderer cube_r38;
    private final AdvancedModelRenderer armE3;
    private final AdvancedModelRenderer cube_r39;
    private final AdvancedModelRenderer cube_r40;
    private final AdvancedModelRenderer cube_r41;
    private final AdvancedModelRenderer cube_r42;
    private final AdvancedModelRenderer armC;
    private final AdvancedModelRenderer cube_r43;
    private final AdvancedModelRenderer cube_r44;
    private final AdvancedModelRenderer cube_r45;
    private final AdvancedModelRenderer cube_r46;
    private final AdvancedModelRenderer cube_r47;
    private final AdvancedModelRenderer cube_r48;
    private final AdvancedModelRenderer armC2;
    private final AdvancedModelRenderer cube_r49;
    private final AdvancedModelRenderer cube_r50;
    private final AdvancedModelRenderer cube_r51;
    private final AdvancedModelRenderer cube_r52;
    private final AdvancedModelRenderer armC3;
    private final AdvancedModelRenderer cube_r53;
    private final AdvancedModelRenderer cube_r54;
    private final AdvancedModelRenderer cube_r55;
    private final AdvancedModelRenderer cube_r56;
    private final AdvancedModelRenderer armD;
    private final AdvancedModelRenderer cube_r57;
    private final AdvancedModelRenderer cube_r58;
    private final AdvancedModelRenderer cube_r59;
    private final AdvancedModelRenderer cube_r60;
    private final AdvancedModelRenderer cube_r61;
    private final AdvancedModelRenderer cube_r62;
    private final AdvancedModelRenderer armD2;
    private final AdvancedModelRenderer cube_r63;
    private final AdvancedModelRenderer cube_r64;
    private final AdvancedModelRenderer cube_r65;
    private final AdvancedModelRenderer cube_r66;
    private final AdvancedModelRenderer armD3;
    private final AdvancedModelRenderer cube_r67;
    private final AdvancedModelRenderer cube_r68;
    private final AdvancedModelRenderer cube_r69;
    private final AdvancedModelRenderer cube_r70;

    public ModelUrasterella() {
        this.textureWidth = 32;
        this.textureHeight = 32;

        this.main = new AdvancedModelRenderer(this);
        this.main.setRotationPoint(0.0F, 24.0F, 0.0F);
        this.main.cubeList.add(new ModelBox(main, 9, 12, -1.0F, -1.05F, -1.0F, 2, 1, 2, 0.002F, false));
        this.main.cubeList.add(new ModelBox(main, 12, 0, -1.0F, -0.85F, -1.0F, 2, 1, 2, 0.0F, false));
        this.main.cubeList.add(new ModelBox(main, 4, 15, -0.5F, -1.1F, -0.5F, 1, 1, 1, 0.0F, false));

        this.armA = new AdvancedModelRenderer(this);
        this.armA.setRotationPoint(0.0144F, -0.425F, -0.9584F);
        this.main.addChild(armA);
        this.armA.cubeList.add(new ModelBox(armA, 0, 5, -0.5211F, -0.5F, -3.0134F, 1, 1, 3, 0.001F, false));

        this.cube_r1 = new AdvancedModelRenderer(this);
        this.cube_r1.setRotationPoint(0.9789F, 0.0F, -0.0134F);
        this.armA.addChild(cube_r1);
        this.setRotateAngle(cube_r1, 0.0F, 0.1658F, 0.0F);
        this.cube_r1.cubeList.add(new ModelBox(cube_r1, 7, 16, -0.25F, -0.65F, -3.0F, 0, 1, 2, 0.0F, false));
        this.cube_r1.cubeList.add(new ModelBox(cube_r1, 6, 2, -1.0F, -0.5F, -3.0F, 1, 1, 3, 0.0F, false));

        this.cube_r2 = new AdvancedModelRenderer(this);
        this.cube_r2.setRotationPoint(-0.5944F, -0.15F, -1.9947F);
        this.armA.addChild(cube_r2);
        this.setRotateAngle(cube_r2, 0.1583F, 0.0497F, -1.8723F);
        this.cube_r2.cubeList.add(new ModelBox(cube_r2, 18, 13, -0.175F, -0.5F, -0.975F, 0, 1, 1, 0.0F, false));
        this.cube_r2.cubeList.add(new ModelBox(cube_r2, 18, 13, -0.175F, -0.5F, 1.025F, 0, 1, 1, 0.0F, false));

        this.cube_r3 = new AdvancedModelRenderer(this);
        this.cube_r3.setRotationPoint(-0.5944F, -0.15F, -1.9947F);
        this.armA.addChild(cube_r3);
        this.setRotateAngle(cube_r3, 0.1583F, -0.0497F, -1.2693F);
        this.cube_r3.cubeList.add(new ModelBox(cube_r3, 18, 17, 0.075F, -0.5F, 0.0F, 0, 1, 1, 0.0F, false));

        this.cube_r4 = new AdvancedModelRenderer(this);
        this.cube_r4.setRotationPoint(0.5656F, -0.15F, -1.9947F);
        this.armA.addChild(cube_r4);
        this.setRotateAngle(cube_r4, 0.1583F, -0.0497F, 1.8723F);
        this.cube_r4.cubeList.add(new ModelBox(cube_r4, 18, 13, 0.175F, -0.5F, 1.025F, 0, 1, 1, 0.0F, true));
        this.cube_r4.cubeList.add(new ModelBox(cube_r4, 18, 13, 0.175F, -0.5F, -0.975F, 0, 1, 1, 0.0F, true));

        this.cube_r5 = new AdvancedModelRenderer(this);
        this.cube_r5.setRotationPoint(0.5656F, -0.15F, -1.9947F);
        this.armA.addChild(cube_r5);
        this.setRotateAngle(cube_r5, 0.1583F, 0.0497F, 1.2693F);
        this.cube_r5.cubeList.add(new ModelBox(cube_r5, 18, 17, -0.075F, -0.5F, 0.0F, 0, 1, 1, 0.0F, true));

        this.cube_r6 = new AdvancedModelRenderer(this);
        this.cube_r6.setRotationPoint(-1.0211F, 0.0F, -0.0134F);
        this.armA.addChild(cube_r6);
        this.setRotateAngle(cube_r6, 0.0F, -0.1658F, 0.0F);
        this.cube_r6.cubeList.add(new ModelBox(cube_r6, 16, 9, 0.25F, -0.65F, -3.0F, 0, 1, 2, 0.0F, false));
        this.cube_r6.cubeList.add(new ModelBox(cube_r6, 6, 7, 0.0F, -0.5F, -3.0F, 1, 1, 3, 0.0F, false));

        this.armA2 = new AdvancedModelRenderer(this);
        this.armA2.setRotationPoint(0.0F, 0.0F, -3.0F);
        this.armA.addChild(armA2);
        this.armA2.cubeList.add(new ModelBox(armA2, 0, 0, -0.5211F, -0.5F, -3.0134F, 1, 1, 3, 0.0F, false));
        this.armA2.cubeList.add(new ModelBox(armA2, 12, 4, -0.2711F, -0.65F, -3.0134F, 0, 1, 3, 0.0F, false));
        this.armA2.cubeList.add(new ModelBox(armA2, 12, 4, 0.2289F, -0.65F, -3.0134F, 0, 1, 3, 0.0F, false));

        this.cube_r7 = new AdvancedModelRenderer(this);
        this.cube_r7.setRotationPoint(-0.3944F, -0.15F, -4.9947F);
        this.armA2.addChild(cube_r7);
        this.setRotateAngle(cube_r7, 0.0F, 0.0F, -2.0071F);
        this.cube_r7.cubeList.add(new ModelBox(cube_r7, 18, 13, -0.25F, -0.5F, 3.0F, 0, 1, 1, 0.0F, false));

        this.cube_r8 = new AdvancedModelRenderer(this);
        this.cube_r8.setRotationPoint(-0.3711F, -0.15F, -1.5134F);
        this.armA2.addChild(cube_r8);
        this.setRotateAngle(cube_r8, 0.0F, 0.0F, -1.3963F);
        this.cube_r8.cubeList.add(new ModelBox(cube_r8, 14, 14, 0.1F, -0.5F, -1.5F, 0, 1, 3, 0.0F, false));

        this.cube_r9 = new AdvancedModelRenderer(this);
        this.cube_r9.setRotationPoint(0.3656F, -0.15F, -4.9947F);
        this.armA2.addChild(cube_r9);
        this.setRotateAngle(cube_r9, 0.0F, 0.0F, 2.0071F);
        this.cube_r9.cubeList.add(new ModelBox(cube_r9, 18, 13, 0.25F, -0.5F, 3.0F, 0, 1, 1, 0.0F, true));

        this.cube_r10 = new AdvancedModelRenderer(this);
        this.cube_r10.setRotationPoint(0.3422F, -0.15F, -1.5134F);
        this.armA2.addChild(cube_r10);
        this.setRotateAngle(cube_r10, 0.0F, 0.0F, 1.3963F);
        this.cube_r10.cubeList.add(new ModelBox(cube_r10, 14, 14, -0.1F, -0.5F, -1.5F, 0, 1, 3, 0.0F, true));

        this.armA3 = new AdvancedModelRenderer(this);
        this.armA3.setRotationPoint(0.0F, 0.0F, -3.0F);
        this.armA2.addChild(armA3);
        this.armA3.cubeList.add(new ModelBox(armA3, 0, 10, -0.5211F, -0.5F, -3.0134F, 1, 1, 3, 0.001F, false));
        this.armA3.cubeList.add(new ModelBox(armA3, 0, 15, -0.2711F, -0.65F, -3.0134F, 0, 1, 3, 0.0F, false));
        this.armA3.cubeList.add(new ModelBox(armA3, 0, 15, 0.2289F, -0.65F, -3.0134F, 0, 1, 3, 0.0F, false));

        this.cube_r11 = new AdvancedModelRenderer(this);
        this.cube_r11.setRotationPoint(-0.3944F, -0.15F, -1.9947F);
        this.armA3.addChild(cube_r11);
        this.setRotateAngle(cube_r11, 0.0F, 0.0F, -2.0071F);
        this.cube_r11.cubeList.add(new ModelBox(cube_r11, 18, 13, -0.25F, -0.5F, -1.0F, 0, 1, 1, 0.0F, false));
        this.cube_r11.cubeList.add(new ModelBox(cube_r11, 18, 13, -0.25F, -0.5F, 1.0F, 0, 1, 1, 0.0F, false));

        this.cube_r12 = new AdvancedModelRenderer(this);
        this.cube_r12.setRotationPoint(-0.3944F, -0.15F, -1.9947F);
        this.armA3.addChild(cube_r12);
        this.setRotateAngle(cube_r12, 0.0F, 0.0F, -1.3963F);
        this.cube_r12.cubeList.add(new ModelBox(cube_r12, 18, 17, 0.1F, -0.5F, 0.0F, 0, 1, 1, 0.0F, false));

        this.cube_r13 = new AdvancedModelRenderer(this);
        this.cube_r13.setRotationPoint(0.3656F, -0.15F, -1.9947F);
        this.armA3.addChild(cube_r13);
        this.setRotateAngle(cube_r13, 0.0F, 0.0F, 2.0071F);
        this.cube_r13.cubeList.add(new ModelBox(cube_r13, 18, 13, 0.25F, -0.5F, 1.0F, 0, 1, 1, 0.0F, true));
        this.cube_r13.cubeList.add(new ModelBox(cube_r13, 18, 13, 0.25F, -0.5F, -1.0F, 0, 1, 1, 0.0F, true));

        this.cube_r14 = new AdvancedModelRenderer(this);
        this.cube_r14.setRotationPoint(0.3656F, -0.15F, -1.9947F);
        this.armA3.addChild(cube_r14);
        this.setRotateAngle(cube_r14, 0.0F, 0.0F, 1.3963F);
        this.cube_r14.cubeList.add(new ModelBox(cube_r14, 18, 17, -0.1F, -0.5F, 0.0F, 0, 1, 1, 0.0F, true));

        this.armB = new AdvancedModelRenderer(this);
        this.armB.setRotationPoint(-0.682F, -0.45F, -0.5522F);
        this.main.addChild(armB);
        this.setRotateAngle(armB, 0.0F, 1.1345F, 0.0F);
        this.armB.cubeList.add(new ModelBox(armB, 0, 5, -0.5211F, -0.5F, -3.0134F, 1, 1, 3, 0.001F, false));

        this.cube_r15 = new AdvancedModelRenderer(this);
        this.cube_r15.setRotationPoint(0.9789F, 0.0F, -0.0134F);
        this.armB.addChild(cube_r15);
        this.setRotateAngle(cube_r15, 0.0F, 0.1658F, 0.0F);
        this.cube_r15.cubeList.add(new ModelBox(cube_r15, 7, 16, -0.25F, -0.65F, -3.0F, 0, 1, 2, 0.0F, false));
        this.cube_r15.cubeList.add(new ModelBox(cube_r15, 6, 2, -1.0F, -0.5F, -3.0F, 1, 1, 3, 0.0F, false));

        this.cube_r16 = new AdvancedModelRenderer(this);
        this.cube_r16.setRotationPoint(-0.5944F, -0.15F, -1.9947F);
        this.armB.addChild(cube_r16);
        this.setRotateAngle(cube_r16, 0.1583F, 0.0497F, -1.8723F);
        this.cube_r16.cubeList.add(new ModelBox(cube_r16, 18, 13, -0.175F, -0.5F, -0.975F, 0, 1, 1, 0.0F, false));
        this.cube_r16.cubeList.add(new ModelBox(cube_r16, 18, 13, -0.175F, -0.5F, 1.025F, 0, 1, 1, 0.0F, false));

        this.cube_r17 = new AdvancedModelRenderer(this);
        this.cube_r17.setRotationPoint(-0.5944F, -0.15F, -1.9947F);
        this.armB.addChild(cube_r17);
        this.setRotateAngle(cube_r17, 0.1583F, -0.0497F, -1.2693F);
        this.cube_r17.cubeList.add(new ModelBox(cube_r17, 18, 17, 0.075F, -0.5F, 0.0F, 0, 1, 1, 0.0F, false));

        this.cube_r18 = new AdvancedModelRenderer(this);
        this.cube_r18.setRotationPoint(0.5656F, -0.15F, -1.9947F);
        this.armB.addChild(cube_r18);
        this.setRotateAngle(cube_r18, 0.1583F, -0.0497F, 1.8723F);
        this.cube_r18.cubeList.add(new ModelBox(cube_r18, 18, 13, 0.175F, -0.5F, 1.025F, 0, 1, 1, 0.0F, true));
        this.cube_r18.cubeList.add(new ModelBox(cube_r18, 18, 13, 0.175F, -0.5F, -0.975F, 0, 1, 1, 0.0F, true));

        this.cube_r19 = new AdvancedModelRenderer(this);
        this.cube_r19.setRotationPoint(0.5656F, -0.15F, -1.9947F);
        this.armB.addChild(cube_r19);
        this.setRotateAngle(cube_r19, 0.1583F, 0.0497F, 1.2693F);
        this.cube_r19.cubeList.add(new ModelBox(cube_r19, 18, 17, -0.075F, -0.5F, 0.0F, 0, 1, 1, 0.0F, true));

        this.cube_r20 = new AdvancedModelRenderer(this);
        this.cube_r20.setRotationPoint(-1.0211F, 0.0F, -0.0134F);
        this.armB.addChild(cube_r20);
        this.setRotateAngle(cube_r20, 0.0F, -0.1658F, 0.0F);
        this.cube_r20.cubeList.add(new ModelBox(cube_r20, 16, 9, 0.25F, -0.65F, -3.0F, 0, 1, 2, 0.0F, false));
        this.cube_r20.cubeList.add(new ModelBox(cube_r20, 6, 7, 0.0F, -0.5F, -3.0F, 1, 1, 3, 0.0F, false));

        this.armB2 = new AdvancedModelRenderer(this);
        this.armB2.setRotationPoint(0.0F, 0.0F, -3.0F);
        this.armB.addChild(armB2);
        this.armB2.cubeList.add(new ModelBox(armB2, 0, 0, -0.5211F, -0.5F, -3.0134F, 1, 1, 3, 0.0F, false));
        this.armB2.cubeList.add(new ModelBox(armB2, 12, 4, -0.2711F, -0.65F, -3.0134F, 0, 1, 3, 0.0F, false));
        this.armB2.cubeList.add(new ModelBox(armB2, 12, 4, 0.2289F, -0.65F, -3.0134F, 0, 1, 3, 0.0F, false));

        this.cube_r21 = new AdvancedModelRenderer(this);
        this.cube_r21.setRotationPoint(-0.3944F, -0.15F, -4.9947F);
        this.armB2.addChild(cube_r21);
        this.setRotateAngle(cube_r21, 0.0F, 0.0F, -2.0071F);
        this.cube_r21.cubeList.add(new ModelBox(cube_r21, 18, 13, -0.25F, -0.5F, 3.0F, 0, 1, 1, 0.0F, false));

        this.cube_r22 = new AdvancedModelRenderer(this);
        this.cube_r22.setRotationPoint(-0.3711F, -0.15F, -1.5134F);
        this.armB2.addChild(cube_r22);
        this.setRotateAngle(cube_r22, 0.0F, 0.0F, -1.3963F);
        this.cube_r22.cubeList.add(new ModelBox(cube_r22, 14, 14, 0.1F, -0.5F, -1.5F, 0, 1, 3, 0.0F, false));

        this.cube_r23 = new AdvancedModelRenderer(this);
        this.cube_r23.setRotationPoint(0.3656F, -0.15F, -4.9947F);
        this.armB2.addChild(cube_r23);
        this.setRotateAngle(cube_r23, 0.0F, 0.0F, 2.0071F);
        this.cube_r23.cubeList.add(new ModelBox(cube_r23, 18, 13, 0.25F, -0.5F, 3.0F, 0, 1, 1, 0.0F, true));

        this.cube_r24 = new AdvancedModelRenderer(this);
        this.cube_r24.setRotationPoint(0.3422F, -0.15F, -1.5134F);
        this.armB2.addChild(cube_r24);
        this.setRotateAngle(cube_r24, 0.0F, 0.0F, 1.3963F);
        this.cube_r24.cubeList.add(new ModelBox(cube_r24, 14, 14, -0.1F, -0.5F, -1.5F, 0, 1, 3, 0.0F, true));

        this.armB3 = new AdvancedModelRenderer(this);
        this.armB3.setRotationPoint(0.0F, 0.0F, -3.0F);
        this.armB2.addChild(armB3);
        this.armB3.cubeList.add(new ModelBox(armB3, 0, 10, -0.5211F, -0.5F, -3.0134F, 1, 1, 3, 0.001F, false));
        this.armB3.cubeList.add(new ModelBox(armB3, 0, 15, -0.2711F, -0.65F, -3.0134F, 0, 1, 3, 0.0F, false));
        this.armB3.cubeList.add(new ModelBox(armB3, 0, 15, 0.2289F, -0.65F, -3.0134F, 0, 1, 3, 0.0F, false));

        this.cube_r25 = new AdvancedModelRenderer(this);
        this.cube_r25.setRotationPoint(-0.3944F, -0.15F, -1.9947F);
        this.armB3.addChild(cube_r25);
        this.setRotateAngle(cube_r25, 0.0F, 0.0F, -2.0071F);
        this.cube_r25.cubeList.add(new ModelBox(cube_r25, 18, 13, -0.25F, -0.5F, -1.0F, 0, 1, 1, 0.0F, false));
        this.cube_r25.cubeList.add(new ModelBox(cube_r25, 18, 13, -0.25F, -0.5F, 1.0F, 0, 1, 1, 0.0F, false));

        this.cube_r26 = new AdvancedModelRenderer(this);
        this.cube_r26.setRotationPoint(-0.3944F, -0.15F, -1.9947F);
        this.armB3.addChild(cube_r26);
        this.setRotateAngle(cube_r26, 0.0F, 0.0F, -1.3963F);
        this.cube_r26.cubeList.add(new ModelBox(cube_r26, 18, 17, 0.1F, -0.5F, 0.0F, 0, 1, 1, 0.0F, false));

        this.cube_r27 = new AdvancedModelRenderer(this);
        this.cube_r27.setRotationPoint(0.3656F, -0.15F, -1.9947F);
        this.armB3.addChild(cube_r27);
        this.setRotateAngle(cube_r27, 0.0F, 0.0F, 2.0071F);
        this.cube_r27.cubeList.add(new ModelBox(cube_r27, 18, 13, 0.25F, -0.5F, 1.0F, 0, 1, 1, 0.0F, true));
        this.cube_r27.cubeList.add(new ModelBox(cube_r27, 18, 13, 0.25F, -0.5F, -1.0F, 0, 1, 1, 0.0F, true));

        this.cube_r28 = new AdvancedModelRenderer(this);
        this.cube_r28.setRotationPoint(0.3656F, -0.15F, -1.9947F);
        this.armB3.addChild(cube_r28);
        this.setRotateAngle(cube_r28, 0.0F, 0.0F, 1.3963F);
        this.cube_r28.cubeList.add(new ModelBox(cube_r28, 18, 17, -0.1F, -0.5F, 0.0F, 0, 1, 1, 0.0F, true));

        this.armE = new AdvancedModelRenderer(this);
        this.armE.setRotationPoint(0.682F, -0.45F, -0.5522F);
        this.main.addChild(armE);
        this.setRotateAngle(armE, 0.0F, -1.1345F, 0.0F);
        this.armE.cubeList.add(new ModelBox(armE, 0, 5, -0.4789F, -0.5F, -3.0134F, 1, 1, 3, 0.001F, true));

        this.cube_r29 = new AdvancedModelRenderer(this);
        this.cube_r29.setRotationPoint(-0.9789F, 0.0F, -0.0134F);
        this.armE.addChild(cube_r29);
        this.setRotateAngle(cube_r29, 0.0F, -0.1658F, 0.0F);
        this.cube_r29.cubeList.add(new ModelBox(cube_r29, 7, 16, 0.25F, -0.65F, -3.0F, 0, 1, 2, 0.0F, true));
        this.cube_r29.cubeList.add(new ModelBox(cube_r29, 6, 2, 0.0F, -0.5F, -3.0F, 1, 1, 3, 0.0F, true));

        this.cube_r30 = new AdvancedModelRenderer(this);
        this.cube_r30.setRotationPoint(0.5944F, -0.15F, -1.9947F);
        this.armE.addChild(cube_r30);
        this.setRotateAngle(cube_r30, 0.1583F, -0.0497F, 1.8723F);
        this.cube_r30.cubeList.add(new ModelBox(cube_r30, 18, 13, 0.175F, -0.5F, -0.975F, 0, 1, 1, 0.0F, true));
        this.cube_r30.cubeList.add(new ModelBox(cube_r30, 18, 13, 0.175F, -0.5F, 1.025F, 0, 1, 1, 0.0F, true));

        this.cube_r31 = new AdvancedModelRenderer(this);
        this.cube_r31.setRotationPoint(0.5944F, -0.15F, -1.9947F);
        this.armE.addChild(cube_r31);
        this.setRotateAngle(cube_r31, 0.1583F, 0.0497F, 1.2693F);
        this.cube_r31.cubeList.add(new ModelBox(cube_r31, 18, 17, -0.075F, -0.5F, 0.0F, 0, 1, 1, 0.0F, true));

        this.cube_r32 = new AdvancedModelRenderer(this);
        this.cube_r32.setRotationPoint(-0.5656F, -0.15F, -1.9947F);
        this.armE.addChild(cube_r32);
        this.setRotateAngle(cube_r32, 0.1583F, 0.0497F, -1.8723F);
        this.cube_r32.cubeList.add(new ModelBox(cube_r32, 18, 13, -0.175F, -0.5F, 1.025F, 0, 1, 1, 0.0F, false));
        this.cube_r32.cubeList.add(new ModelBox(cube_r32, 18, 13, -0.175F, -0.5F, -0.975F, 0, 1, 1, 0.0F, false));

        this.cube_r33 = new AdvancedModelRenderer(this);
        this.cube_r33.setRotationPoint(-0.5656F, -0.15F, -1.9947F);
        this.armE.addChild(cube_r33);
        this.setRotateAngle(cube_r33, 0.1583F, -0.0497F, -1.2693F);
        this.cube_r33.cubeList.add(new ModelBox(cube_r33, 18, 17, 0.075F, -0.5F, 0.0F, 0, 1, 1, 0.0F, false));

        this.cube_r34 = new AdvancedModelRenderer(this);
        this.cube_r34.setRotationPoint(1.0211F, 0.0F, -0.0134F);
        this.armE.addChild(cube_r34);
        this.setRotateAngle(cube_r34, 0.0F, 0.1658F, 0.0F);
        this.cube_r34.cubeList.add(new ModelBox(cube_r34, 16, 9, -0.25F, -0.65F, -3.0F, 0, 1, 2, 0.0F, true));
        this.cube_r34.cubeList.add(new ModelBox(cube_r34, 6, 7, -1.0F, -0.5F, -3.0F, 1, 1, 3, 0.0F, true));

        this.armE2 = new AdvancedModelRenderer(this);
        this.armE2.setRotationPoint(0.0F, 0.0F, -3.0F);
        this.armE.addChild(armE2);
        this.armE2.cubeList.add(new ModelBox(armE2, 0, 0, -0.4789F, -0.5F, -3.0134F, 1, 1, 3, 0.0F, true));
        this.armE2.cubeList.add(new ModelBox(armE2, 12, 4, 0.2711F, -0.65F, -3.0134F, 0, 1, 3, 0.0F, true));
        this.armE2.cubeList.add(new ModelBox(armE2, 12, 4, -0.2289F, -0.65F, -3.0134F, 0, 1, 3, 0.0F, true));

        this.cube_r35 = new AdvancedModelRenderer(this);
        this.cube_r35.setRotationPoint(0.3944F, -0.15F, -4.9947F);
        this.armE2.addChild(cube_r35);
        this.setRotateAngle(cube_r35, 0.0F, 0.0F, 2.0071F);
        this.cube_r35.cubeList.add(new ModelBox(cube_r35, 18, 13, 0.25F, -0.5F, 3.0F, 0, 1, 1, 0.0F, true));

        this.cube_r36 = new AdvancedModelRenderer(this);
        this.cube_r36.setRotationPoint(0.3711F, -0.15F, -1.5134F);
        this.armE2.addChild(cube_r36);
        this.setRotateAngle(cube_r36, 0.0F, 0.0F, 1.3963F);
        this.cube_r36.cubeList.add(new ModelBox(cube_r36, 14, 14, -0.1F, -0.5F, -1.5F, 0, 1, 3, 0.0F, true));

        this.cube_r37 = new AdvancedModelRenderer(this);
        this.cube_r37.setRotationPoint(-0.3656F, -0.15F, -4.9947F);
        this.armE2.addChild(cube_r37);
        this.setRotateAngle(cube_r37, 0.0F, 0.0F, -2.0071F);
        this.cube_r37.cubeList.add(new ModelBox(cube_r37, 18, 13, -0.25F, -0.5F, 3.0F, 0, 1, 1, 0.0F, false));

        this.cube_r38 = new AdvancedModelRenderer(this);
        this.cube_r38.setRotationPoint(-0.3422F, -0.15F, -1.5134F);
        this.armE2.addChild(cube_r38);
        this.setRotateAngle(cube_r38, 0.0F, 0.0F, -1.3963F);
        this.cube_r38.cubeList.add(new ModelBox(cube_r38, 14, 14, 0.1F, -0.5F, -1.5F, 0, 1, 3, 0.0F, false));

        this.armE3 = new AdvancedModelRenderer(this);
        this.armE3.setRotationPoint(0.0F, 0.0F, -3.0F);
        this.armE2.addChild(armE3);
        this.armE3.cubeList.add(new ModelBox(armE3, 0, 10, -0.4789F, -0.5F, -3.0134F, 1, 1, 3, 0.001F, true));
        this.armE3.cubeList.add(new ModelBox(armE3, 0, 15, 0.2711F, -0.65F, -3.0134F, 0, 1, 3, 0.0F, true));
        this.armE3.cubeList.add(new ModelBox(armE3, 0, 15, -0.2289F, -0.65F, -3.0134F, 0, 1, 3, 0.0F, true));

        this.cube_r39 = new AdvancedModelRenderer(this);
        this.cube_r39.setRotationPoint(0.3944F, -0.15F, -1.9947F);
        this.armE3.addChild(cube_r39);
        this.setRotateAngle(cube_r39, 0.0F, 0.0F, 2.0071F);
        this.cube_r39.cubeList.add(new ModelBox(cube_r39, 18, 13, 0.25F, -0.5F, -1.0F, 0, 1, 1, 0.0F, true));
        this.cube_r39.cubeList.add(new ModelBox(cube_r39, 18, 13, 0.25F, -0.5F, 1.0F, 0, 1, 1, 0.0F, true));

        this.cube_r40 = new AdvancedModelRenderer(this);
        this.cube_r40.setRotationPoint(0.3944F, -0.15F, -1.9947F);
        this.armE3.addChild(cube_r40);
        this.setRotateAngle(cube_r40, 0.0F, 0.0F, 1.3963F);
        this.cube_r40.cubeList.add(new ModelBox(cube_r40, 18, 17, -0.1F, -0.5F, 0.0F, 0, 1, 1, 0.0F, true));

        this.cube_r41 = new AdvancedModelRenderer(this);
        this.cube_r41.setRotationPoint(-0.3656F, -0.15F, -1.9947F);
        this.armE3.addChild(cube_r41);
        this.setRotateAngle(cube_r41, 0.0F, 0.0F, -2.0071F);
        this.cube_r41.cubeList.add(new ModelBox(cube_r41, 18, 13, -0.25F, -0.5F, 1.0F, 0, 1, 1, 0.0F, false));
        this.cube_r41.cubeList.add(new ModelBox(cube_r41, 18, 13, -0.25F, -0.5F, -1.0F, 0, 1, 1, 0.0F, false));

        this.cube_r42 = new AdvancedModelRenderer(this);
        this.cube_r42.setRotationPoint(-0.3656F, -0.15F, -1.9947F);
        this.armE3.addChild(cube_r42);
        this.setRotateAngle(cube_r42, 0.0F, 0.0F, -1.3963F);
        this.cube_r42.cubeList.add(new ModelBox(cube_r42, 18, 17, 0.1F, -0.5F, 0.0F, 0, 1, 1, 0.0F, false));

        this.armC = new AdvancedModelRenderer(this);
        this.armC.setRotationPoint(-0.5735F, -0.425F, 0.4853F);
        this.main.addChild(armC);
        this.setRotateAngle(armC, 0.0F, 2.4435F, 0.0F);
        this.armC.cubeList.add(new ModelBox(armC, 0, 5, -0.5211F, -0.5F, -3.0134F, 1, 1, 3, 0.001F, false));

        this.cube_r43 = new AdvancedModelRenderer(this);
        this.cube_r43.setRotationPoint(0.9789F, 0.0F, -0.0134F);
        this.armC.addChild(cube_r43);
        this.setRotateAngle(cube_r43, 0.0F, 0.1658F, 0.0F);
        this.cube_r43.cubeList.add(new ModelBox(cube_r43, 7, 16, -0.25F, -0.65F, -3.0F, 0, 1, 2, 0.0F, false));
        this.cube_r43.cubeList.add(new ModelBox(cube_r43, 6, 2, -1.0F, -0.5F, -3.0F, 1, 1, 3, 0.0F, false));

        this.cube_r44 = new AdvancedModelRenderer(this);
        this.cube_r44.setRotationPoint(-0.5944F, -0.15F, -1.9947F);
        this.armC.addChild(cube_r44);
        this.setRotateAngle(cube_r44, 0.1583F, 0.0497F, -1.8723F);
        this.cube_r44.cubeList.add(new ModelBox(cube_r44, 18, 13, -0.175F, -0.5F, -0.975F, 0, 1, 1, 0.0F, false));
        this.cube_r44.cubeList.add(new ModelBox(cube_r44, 18, 13, -0.175F, -0.5F, 1.025F, 0, 1, 1, 0.0F, false));

        this.cube_r45 = new AdvancedModelRenderer(this);
        this.cube_r45.setRotationPoint(-0.5944F, -0.15F, -1.9947F);
        this.armC.addChild(cube_r45);
        this.setRotateAngle(cube_r45, 0.1583F, -0.0497F, -1.2693F);
        this.cube_r45.cubeList.add(new ModelBox(cube_r45, 18, 17, 0.075F, -0.5F, 0.0F, 0, 1, 1, 0.0F, false));

        this.cube_r46 = new AdvancedModelRenderer(this);
        this.cube_r46.setRotationPoint(0.5656F, -0.15F, -1.9947F);
        this.armC.addChild(cube_r46);
        this.setRotateAngle(cube_r46, 0.1583F, -0.0497F, 1.8723F);
        this.cube_r46.cubeList.add(new ModelBox(cube_r46, 18, 13, 0.175F, -0.5F, 1.025F, 0, 1, 1, 0.0F, true));
        this.cube_r46.cubeList.add(new ModelBox(cube_r46, 18, 13, 0.175F, -0.5F, -0.975F, 0, 1, 1, 0.0F, true));

        this.cube_r47 = new AdvancedModelRenderer(this);
        this.cube_r47.setRotationPoint(0.5656F, -0.15F, -1.9947F);
        this.armC.addChild(cube_r47);
        this.setRotateAngle(cube_r47, 0.1583F, 0.0497F, 1.2693F);
        this.cube_r47.cubeList.add(new ModelBox(cube_r47, 18, 17, -0.075F, -0.5F, 0.0F, 0, 1, 1, 0.0F, true));

        this.cube_r48 = new AdvancedModelRenderer(this);
        this.cube_r48.setRotationPoint(-1.0211F, 0.0F, -0.0134F);
        this.armC.addChild(cube_r48);
        this.setRotateAngle(cube_r48, 0.0F, -0.1658F, 0.0F);
        this.cube_r48.cubeList.add(new ModelBox(cube_r48, 16, 9, 0.25F, -0.65F, -3.0F, 0, 1, 2, 0.0F, false));
        this.cube_r48.cubeList.add(new ModelBox(cube_r48, 6, 7, 0.0F, -0.5F, -3.0F, 1, 1, 3, 0.0F, false));

        this.armC2 = new AdvancedModelRenderer(this);
        this.armC2.setRotationPoint(0.0F, 0.0F, -3.0F);
        this.armC.addChild(armC2);
        this.armC2.cubeList.add(new ModelBox(armC2, 0, 0, -0.5211F, -0.5F, -3.0134F, 1, 1, 3, 0.0F, false));
        this.armC2.cubeList.add(new ModelBox(armC2, 12, 4, -0.2711F, -0.65F, -3.0134F, 0, 1, 3, 0.0F, false));
        this.armC2.cubeList.add(new ModelBox(armC2, 12, 4, 0.2289F, -0.65F, -3.0134F, 0, 1, 3, 0.0F, false));

        this.cube_r49 = new AdvancedModelRenderer(this);
        this.cube_r49.setRotationPoint(-0.3944F, -0.15F, -4.9947F);
        this.armC2.addChild(cube_r49);
        this.setRotateAngle(cube_r49, 0.0F, 0.0F, -2.0071F);
        this.cube_r49.cubeList.add(new ModelBox(cube_r49, 18, 13, -0.25F, -0.5F, 3.0F, 0, 1, 1, 0.0F, false));

        this.cube_r50 = new AdvancedModelRenderer(this);
        this.cube_r50.setRotationPoint(-0.3711F, -0.15F, -1.5134F);
        this.armC2.addChild(cube_r50);
        this.setRotateAngle(cube_r50, 0.0F, 0.0F, -1.3963F);
        this.cube_r50.cubeList.add(new ModelBox(cube_r50, 14, 14, 0.1F, -0.5F, -1.5F, 0, 1, 3, 0.0F, false));

        this.cube_r51 = new AdvancedModelRenderer(this);
        this.cube_r51.setRotationPoint(0.3656F, -0.15F, -4.9947F);
        this.armC2.addChild(cube_r51);
        this.setRotateAngle(cube_r51, 0.0F, 0.0F, 2.0071F);
        this.cube_r51.cubeList.add(new ModelBox(cube_r51, 18, 13, 0.25F, -0.5F, 3.0F, 0, 1, 1, 0.0F, true));

        this.cube_r52 = new AdvancedModelRenderer(this);
        this.cube_r52.setRotationPoint(0.3422F, -0.15F, -1.5134F);
        this.armC2.addChild(cube_r52);
        this.setRotateAngle(cube_r52, 0.0F, 0.0F, 1.3963F);
        this.cube_r52.cubeList.add(new ModelBox(cube_r52, 14, 14, -0.1F, -0.5F, -1.5F, 0, 1, 3, 0.0F, true));

        this.armC3 = new AdvancedModelRenderer(this);
        this.armC3.setRotationPoint(0.0F, 0.0F, -3.0F);
        this.armC2.addChild(armC3);
        this.armC3.cubeList.add(new ModelBox(armC3, 0, 10, -0.5211F, -0.5F, -3.0134F, 1, 1, 3, 0.001F, false));
        this.armC3.cubeList.add(new ModelBox(armC3, 0, 15, -0.2711F, -0.65F, -3.0134F, 0, 1, 3, 0.0F, false));
        this.armC3.cubeList.add(new ModelBox(armC3, 0, 15, 0.2289F, -0.65F, -3.0134F, 0, 1, 3, 0.0F, false));

        this.cube_r53 = new AdvancedModelRenderer(this);
        this.cube_r53.setRotationPoint(-0.3944F, -0.15F, -1.9947F);
        this.armC3.addChild(cube_r53);
        this.setRotateAngle(cube_r53, 0.0F, 0.0F, -2.0071F);
        this.cube_r53.cubeList.add(new ModelBox(cube_r53, 18, 13, -0.25F, -0.5F, -1.0F, 0, 1, 1, 0.0F, false));
        this.cube_r53.cubeList.add(new ModelBox(cube_r53, 18, 13, -0.25F, -0.5F, 1.0F, 0, 1, 1, 0.0F, false));

        this.cube_r54 = new AdvancedModelRenderer(this);
        this.cube_r54.setRotationPoint(-0.3944F, -0.15F, -1.9947F);
        this.armC3.addChild(cube_r54);
        this.setRotateAngle(cube_r54, 0.0F, 0.0F, -1.3963F);
        this.cube_r54.cubeList.add(new ModelBox(cube_r54, 18, 17, 0.1F, -0.5F, 0.0F, 0, 1, 1, 0.0F, false));

        this.cube_r55 = new AdvancedModelRenderer(this);
        this.cube_r55.setRotationPoint(0.3656F, -0.15F, -1.9947F);
        this.armC3.addChild(cube_r55);
        this.setRotateAngle(cube_r55, 0.0F, 0.0F, 2.0071F);
        this.cube_r55.cubeList.add(new ModelBox(cube_r55, 18, 13, 0.25F, -0.5F, 1.0F, 0, 1, 1, 0.0F, true));
        this.cube_r55.cubeList.add(new ModelBox(cube_r55, 18, 13, 0.25F, -0.5F, -1.0F, 0, 1, 1, 0.0F, true));

        this.cube_r56 = new AdvancedModelRenderer(this);
        this.cube_r56.setRotationPoint(0.3656F, -0.15F, -1.9947F);
        this.armC3.addChild(cube_r56);
        this.setRotateAngle(cube_r56, 0.0F, 0.0F, 1.3963F);
        this.cube_r56.cubeList.add(new ModelBox(cube_r56, 18, 17, -0.1F, -0.5F, 0.0F, 0, 1, 1, 0.0F, true));

        this.armD = new AdvancedModelRenderer(this);
        this.armD.setRotationPoint(0.5735F, -0.425F, 0.4853F);
        this.main.addChild(armD);
        this.setRotateAngle(armD, 0.0F, -2.4435F, 0.0F);
        this.armD.cubeList.add(new ModelBox(armD, 0, 5, -0.4789F, -0.5F, -3.0134F, 1, 1, 3, 0.001F, true));

        this.cube_r57 = new AdvancedModelRenderer(this);
        this.cube_r57.setRotationPoint(-0.9789F, 0.0F, -0.0134F);
        this.armD.addChild(cube_r57);
        this.setRotateAngle(cube_r57, 0.0F, -0.1658F, 0.0F);
        this.cube_r57.cubeList.add(new ModelBox(cube_r57, 7, 16, 0.25F, -0.65F, -3.0F, 0, 1, 2, 0.0F, true));
        this.cube_r57.cubeList.add(new ModelBox(cube_r57, 6, 2, 0.0F, -0.5F, -3.0F, 1, 1, 3, 0.0F, true));

        this.cube_r58 = new AdvancedModelRenderer(this);
        this.cube_r58.setRotationPoint(0.5944F, -0.15F, -1.9947F);
        this.armD.addChild(cube_r58);
        this.setRotateAngle(cube_r58, 0.1583F, -0.0497F, 1.8723F);
        this.cube_r58.cubeList.add(new ModelBox(cube_r58, 18, 13, 0.175F, -0.5F, -0.975F, 0, 1, 1, 0.0F, true));
        this.cube_r58.cubeList.add(new ModelBox(cube_r58, 18, 13, 0.175F, -0.5F, 1.025F, 0, 1, 1, 0.0F, true));

        this.cube_r59 = new AdvancedModelRenderer(this);
        this.cube_r59.setRotationPoint(0.5944F, -0.15F, -1.9947F);
        this.armD.addChild(cube_r59);
        this.setRotateAngle(cube_r59, 0.1583F, 0.0497F, 1.2693F);
        this.cube_r59.cubeList.add(new ModelBox(cube_r59, 18, 17, -0.075F, -0.5F, 0.0F, 0, 1, 1, 0.0F, true));

        this.cube_r60 = new AdvancedModelRenderer(this);
        this.cube_r60.setRotationPoint(-0.5656F, -0.15F, -1.9947F);
        this.armD.addChild(cube_r60);
        this.setRotateAngle(cube_r60, 0.1583F, 0.0497F, -1.8723F);
        this.cube_r60.cubeList.add(new ModelBox(cube_r60, 18, 13, -0.175F, -0.5F, 1.025F, 0, 1, 1, 0.0F, false));
        this.cube_r60.cubeList.add(new ModelBox(cube_r60, 18, 13, -0.175F, -0.5F, -0.975F, 0, 1, 1, 0.0F, false));

        this.cube_r61 = new AdvancedModelRenderer(this);
        this.cube_r61.setRotationPoint(-0.5656F, -0.15F, -1.9947F);
        this.armD.addChild(cube_r61);
        this.setRotateAngle(cube_r61, 0.1583F, -0.0497F, -1.2693F);
        this.cube_r61.cubeList.add(new ModelBox(cube_r61, 18, 17, 0.075F, -0.5F, 0.0F, 0, 1, 1, 0.0F, false));

        this.cube_r62 = new AdvancedModelRenderer(this);
        this.cube_r62.setRotationPoint(1.0211F, 0.0F, -0.0134F);
        this.armD.addChild(cube_r62);
        this.setRotateAngle(cube_r62, 0.0F, 0.1658F, 0.0F);
        this.cube_r62.cubeList.add(new ModelBox(cube_r62, 16, 9, -0.25F, -0.65F, -3.0F, 0, 1, 2, 0.0F, true));
        this.cube_r62.cubeList.add(new ModelBox(cube_r62, 6, 7, -1.0F, -0.5F, -3.0F, 1, 1, 3, 0.0F, true));

        this.armD2 = new AdvancedModelRenderer(this);
        this.armD2.setRotationPoint(0.0F, 0.0F, -3.0F);
        this.armD.addChild(armD2);
        this.armD2.cubeList.add(new ModelBox(armD2, 0, 0, -0.4789F, -0.5F, -3.0134F, 1, 1, 3, 0.0F, true));
        this.armD2.cubeList.add(new ModelBox(armD2, 12, 4, 0.2711F, -0.65F, -3.0134F, 0, 1, 3, 0.0F, true));
        this.armD2.cubeList.add(new ModelBox(armD2, 12, 4, -0.2289F, -0.65F, -3.0134F, 0, 1, 3, 0.0F, true));

        this.cube_r63 = new AdvancedModelRenderer(this);
        this.cube_r63.setRotationPoint(0.3944F, -0.15F, -4.9947F);
        this.armD2.addChild(cube_r63);
        this.setRotateAngle(cube_r63, 0.0F, 0.0F, 2.0071F);
        this.cube_r63.cubeList.add(new ModelBox(cube_r63, 18, 13, 0.25F, -0.5F, 3.0F, 0, 1, 1, 0.0F, true));

        this.cube_r64 = new AdvancedModelRenderer(this);
        this.cube_r64.setRotationPoint(0.3711F, -0.15F, -1.5134F);
        this.armD2.addChild(cube_r64);
        this.setRotateAngle(cube_r64, 0.0F, 0.0F, 1.3963F);
        this.cube_r64.cubeList.add(new ModelBox(cube_r64, 14, 14, -0.1F, -0.5F, -1.5F, 0, 1, 3, 0.0F, true));

        this.cube_r65 = new AdvancedModelRenderer(this);
        this.cube_r65.setRotationPoint(-0.3656F, -0.15F, -4.9947F);
        this.armD2.addChild(cube_r65);
        this.setRotateAngle(cube_r65, 0.0F, 0.0F, -2.0071F);
        this.cube_r65.cubeList.add(new ModelBox(cube_r65, 18, 13, -0.25F, -0.5F, 3.0F, 0, 1, 1, 0.0F, false));

        this.cube_r66 = new AdvancedModelRenderer(this);
        this.cube_r66.setRotationPoint(-0.3422F, -0.15F, -1.5134F);
        this.armD2.addChild(cube_r66);
        this.setRotateAngle(cube_r66, 0.0F, 0.0F, -1.3963F);
        this.cube_r66.cubeList.add(new ModelBox(cube_r66, 14, 14, 0.1F, -0.5F, -1.5F, 0, 1, 3, 0.0F, false));

        this.armD3 = new AdvancedModelRenderer(this);
        this.armD3.setRotationPoint(0.0F, 0.0F, -3.0F);
        this.armD2.addChild(armD3);
        this.armD3.cubeList.add(new ModelBox(armD3, 0, 10, -0.4789F, -0.5F, -3.0134F, 1, 1, 3, 0.001F, true));
        this.armD3.cubeList.add(new ModelBox(armD3, 0, 15, 0.2711F, -0.65F, -3.0134F, 0, 1, 3, 0.0F, true));
        this.armD3.cubeList.add(new ModelBox(armD3, 0, 15, -0.2289F, -0.65F, -3.0134F, 0, 1, 3, 0.0F, true));

        this.cube_r67 = new AdvancedModelRenderer(this);
        this.cube_r67.setRotationPoint(0.3944F, -0.15F, -1.9947F);
        this.armD3.addChild(cube_r67);
        this.setRotateAngle(cube_r67, 0.0F, 0.0F, 2.0071F);
        this.cube_r67.cubeList.add(new ModelBox(cube_r67, 18, 13, 0.25F, -0.5F, -1.0F, 0, 1, 1, 0.0F, true));
        this.cube_r67.cubeList.add(new ModelBox(cube_r67, 18, 13, 0.25F, -0.5F, 1.0F, 0, 1, 1, 0.0F, true));

        this.cube_r68 = new AdvancedModelRenderer(this);
        this.cube_r68.setRotationPoint(0.3944F, -0.15F, -1.9947F);
        this.armD3.addChild(cube_r68);
        this.setRotateAngle(cube_r68, 0.0F, 0.0F, 1.3963F);
        this.cube_r68.cubeList.add(new ModelBox(cube_r68, 18, 17, -0.1F, -0.5F, 0.0F, 0, 1, 1, 0.0F, true));

        this.cube_r69 = new AdvancedModelRenderer(this);
        this.cube_r69.setRotationPoint(-0.3656F, -0.15F, -1.9947F);
        this.armD3.addChild(cube_r69);
        this.setRotateAngle(cube_r69, 0.0F, 0.0F, -2.0071F);
        this.cube_r69.cubeList.add(new ModelBox(cube_r69, 18, 13, -0.25F, -0.5F, 1.0F, 0, 1, 1, 0.0F, false));
        this.cube_r69.cubeList.add(new ModelBox(cube_r69, 18, 13, -0.25F, -0.5F, -1.0F, 0, 1, 1, 0.0F, false));

        this.cube_r70 = new AdvancedModelRenderer(this);
        this.cube_r70.setRotationPoint(-0.3656F, -0.15F, -1.9947F);
        this.armD3.addChild(cube_r70);
        this.setRotateAngle(cube_r70, 0.0F, 0.0F, -1.3963F);
        this.cube_r70.cubeList.add(new ModelBox(cube_r70, 18, 17, 0.1F, -0.5F, 0.0F, 0, 1, 1, 0.0F, false));


        updateDefaultPose();
    }

    @Override
    public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        this.main.render(f5);
    }

    @Override
    public void renderStaticBook(float f) {

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

        //this.root.offsetY = 1.29F;
        AdvancedModelRenderer[] Arm1 = {this.armA, this.armA2, this.armA3};
        AdvancedModelRenderer[] Arm2 = {this.armB, this.armB2, this.armB3};
        AdvancedModelRenderer[] Arm3 = {this.armC, this.armC2, this.armC3};
        AdvancedModelRenderer[] Arm4 = {this.armD, this.armD2, this.armD3};
        AdvancedModelRenderer[] Arm5 = {this.armE, this.armE2, this.armE3};


        float speed = 0.135F;
        float modifier = 1f;
        if (f3 == 0) {
            modifier = 0.5F;
        }
        this.chainSwing(Arm1, speed * modifier, 0.4F * modifier, -4, f2, 0.7F);
        this.chainSwing(Arm2, speed * modifier, 0.4F * modifier, -4, f2, 0.7F);
        this.chainSwing(Arm3, speed * modifier, 0.4F * modifier, -4, f2, 0.7F);
        this.chainSwing(Arm4, speed * modifier, 0.4F * modifier, -4, f2, 0.7F);
        this.chainSwing(Arm5, speed * modifier, 0.4F * modifier, -4, f2, 0.7F);


    }
}
