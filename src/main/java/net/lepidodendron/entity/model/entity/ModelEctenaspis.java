package net.lepidodendron.entity.model.entity;

import net.ilexiconn.llibrary.client.model.tools.AdvancedModelRenderer;
import net.lepidodendron.entity.EntityPrehistoricFloraEctenaspis;
import net.lepidodendron.entity.model.ModelBasePalaeopedia;
import net.minecraft.block.material.Material;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLiving;
import net.minecraft.util.math.BlockPos;

public class ModelEctenaspis extends ModelBasePalaeopedia {
    private final AdvancedModelRenderer main;
    private final AdvancedModelRenderer Head;
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
    private final AdvancedModelRenderer eyeLeft;
    private final AdvancedModelRenderer cube_r11;
    private final AdvancedModelRenderer eyeRight;
    private final AdvancedModelRenderer cube_r12;
    private final AdvancedModelRenderer antennaeLeft;
    private final AdvancedModelRenderer cube_r13;
    private final AdvancedModelRenderer antennaeRight;
    private final AdvancedModelRenderer cube_r14;
    private final AdvancedModelRenderer spikeLeft;
    private final AdvancedModelRenderer cube_r15;
    private final AdvancedModelRenderer cube_r16;
    private final AdvancedModelRenderer spikeRight;
    private final AdvancedModelRenderer cube_r17;
    private final AdvancedModelRenderer cube_r18;
    private final AdvancedModelRenderer body;
    private final AdvancedModelRenderer cube_r19;
    private final AdvancedModelRenderer cube_r20;
    private final AdvancedModelRenderer cube_r21;
    private final AdvancedModelRenderer cube_r22;
    private final AdvancedModelRenderer cube_r23;
    private final AdvancedModelRenderer cube_r24;
    private final AdvancedModelRenderer cube_r25;
    private final AdvancedModelRenderer legRight;
    private final AdvancedModelRenderer cube_r26;
    private final AdvancedModelRenderer legLeft;
    private final AdvancedModelRenderer cube_r27;
    private final AdvancedModelRenderer legRight2;
    private final AdvancedModelRenderer cube_r28;
    private final AdvancedModelRenderer legLeft2;
    private final AdvancedModelRenderer cube_r29;
    private final AdvancedModelRenderer legRight3;
    private final AdvancedModelRenderer cube_r30;
    private final AdvancedModelRenderer legLeft3;
    private final AdvancedModelRenderer cube_r31;
    private final AdvancedModelRenderer legRight4;
    private final AdvancedModelRenderer cube_r32;
    private final AdvancedModelRenderer legLeft4;
    private final AdvancedModelRenderer cube_r33;
    private final AdvancedModelRenderer legRight5;
    private final AdvancedModelRenderer cube_r34;
    private final AdvancedModelRenderer legLeft5;
    private final AdvancedModelRenderer cube_r35;

    public ModelEctenaspis() {
        this.textureWidth = 32;
        this.textureHeight = 32;

        this.main = new AdvancedModelRenderer(this);
        this.main.setRotationPoint(0.0F, 24.0F, 0.0F);


        this.Head = new AdvancedModelRenderer(this);
        this.Head.setRotationPoint(0.0F, -1.5F, 0.0F);
        this.main.addChild(Head);


        this.cube_r1 = new AdvancedModelRenderer(this);
        this.cube_r1.setRotationPoint(0.0F, 0.1018F, -4.1863F);
        this.Head.addChild(cube_r1);
        this.setRotateAngle(cube_r1, -0.1309F, 0.0F, 0.0F);
        this.cube_r1.cubeList.add(new ModelBox(cube_r1, 12, 4, -0.5F, 0.0F, -3.5F, 1, 1, 4, 0.0F, false));

        this.cube_r2 = new AdvancedModelRenderer(this);
        this.cube_r2.setRotationPoint(0.0F, 0.275F, -1.95F);
        this.Head.addChild(cube_r2);
        this.setRotateAngle(cube_r2, -0.0698F, 0.0F, 0.0F);
        this.cube_r2.cubeList.add(new ModelBox(cube_r2, 0, 14, -1.0F, -0.025F, -2.3F, 2, 1, 3, 0.0F, false));

        this.cube_r3 = new AdvancedModelRenderer(this);
        this.cube_r3.setRotationPoint(1.4501F, 0.3F, -1.7743F);
        this.Head.addChild(cube_r3);
        this.setRotateAngle(cube_r3, -0.0258F, 0.364F, -0.0232F);
        this.cube_r3.cubeList.add(new ModelBox(cube_r3, 22, 8, -0.5F, 0.0F, -0.05F, 1, 1, 1, 0.0F, true));

        this.cube_r4 = new AdvancedModelRenderer(this);
        this.cube_r4.setRotationPoint(2.05F, 1.175F, -0.875F);
        this.Head.addChild(cube_r4);
        this.setRotateAngle(cube_r4, 0.077F, 0.5008F, 0.1593F);
        this.cube_r4.cubeList.add(new ModelBox(cube_r4, 16, 18, -1.55F, -0.95F, -1.025F, 2, 1, 2, 0.0F, true));

        this.cube_r5 = new AdvancedModelRenderer(this);
        this.cube_r5.setRotationPoint(1.4501F, 0.3F, -1.7743F);
        this.Head.addChild(cube_r5);
        this.setRotateAngle(cube_r5, -0.0848F, 0.3635F, -0.0419F);
        this.cube_r5.cubeList.add(new ModelBox(cube_r5, 12, 9, -0.5F, 0.0F, -4.0F, 1, 1, 4, 0.0F, true));

        this.cube_r6 = new AdvancedModelRenderer(this);
        this.cube_r6.setRotationPoint(-1.4501F, 0.3F, -1.7743F);
        this.Head.addChild(cube_r6);
        this.setRotateAngle(cube_r6, -0.0258F, -0.364F, 0.0232F);
        this.cube_r6.cubeList.add(new ModelBox(cube_r6, 22, 8, -0.5F, 0.0F, -0.05F, 1, 1, 1, 0.0F, false));

        this.cube_r7 = new AdvancedModelRenderer(this);
        this.cube_r7.setRotationPoint(-1.4501F, 0.3F, -1.7743F);
        this.Head.addChild(cube_r7);
        this.setRotateAngle(cube_r7, -0.0848F, -0.3635F, 0.0419F);
        this.cube_r7.cubeList.add(new ModelBox(cube_r7, 12, 9, -0.5F, 0.0F, -4.0F, 1, 1, 4, 0.0F, false));

        this.cube_r8 = new AdvancedModelRenderer(this);
        this.cube_r8.setRotationPoint(0.0F, 0.0436F, -0.999F);
        this.Head.addChild(cube_r8);
        this.setRotateAngle(cube_r8, 0.2182F, 0.0F, 0.0F);
        this.cube_r8.cubeList.add(new ModelBox(cube_r8, 22, 4, -1.0F, -0.025F, -1.0F, 2, 1, 1, 0.02F, false));

        this.cube_r9 = new AdvancedModelRenderer(this);
        this.cube_r9.setRotationPoint(-2.05F, 1.175F, -0.875F);
        this.Head.addChild(cube_r9);
        this.setRotateAngle(cube_r9, 0.077F, -0.5008F, -0.1593F);
        this.cube_r9.cubeList.add(new ModelBox(cube_r9, 16, 18, -0.45F, -0.95F, -1.025F, 2, 1, 2, 0.0F, false));

        this.cube_r10 = new AdvancedModelRenderer(this);
        this.cube_r10.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.Head.addChild(cube_r10);
        this.setRotateAngle(cube_r10, 0.0436F, 0.0F, 0.0F);
        this.cube_r10.cubeList.add(new ModelBox(cube_r10, 16, 21, -1.0F, -0.025F, -1.0F, 2, 1, 1, 0.02F, false));

        this.eyeLeft = new AdvancedModelRenderer(this);
        this.eyeLeft.setRotationPoint(-2.7235F, -0.1132F, -0.7624F);
        this.Head.addChild(eyeLeft);


        this.cube_r11 = new AdvancedModelRenderer(this);
        this.cube_r11.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.eyeLeft.addChild(cube_r11);
        this.setRotateAngle(cube_r11, 0.2343F, -0.4529F, -0.4993F);
        this.cube_r11.cubeList.add(new ModelBox(cube_r11, 22, 6, -0.625F, -1.5F, -0.5F, 1, 1, 1, 0.0F, false));
        this.cube_r11.cubeList.add(new ModelBox(cube_r11, 6, 23, -0.125F, -0.5F, -0.5F, 0, 1, 1, 0.0F, false));

        this.eyeRight = new AdvancedModelRenderer(this);
        this.eyeRight.setRotationPoint(2.7235F, -0.1132F, -0.7624F);
        this.Head.addChild(eyeRight);


        this.cube_r12 = new AdvancedModelRenderer(this);
        this.cube_r12.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.eyeRight.addChild(cube_r12);
        this.setRotateAngle(cube_r12, 0.2343F, 0.4529F, 0.4993F);
        this.cube_r12.cubeList.add(new ModelBox(cube_r12, 22, 6, -0.375F, -1.5F, -0.5F, 1, 1, 1, 0.0F, true));
        this.cube_r12.cubeList.add(new ModelBox(cube_r12, 6, 23, 0.125F, -0.5F, -0.5F, 0, 1, 1, 0.0F, true));

        this.antennaeLeft = new AdvancedModelRenderer(this);
        this.antennaeLeft.setRotationPoint(0.0F, -0.6F, 0.0F);
        this.Head.addChild(antennaeLeft);


        this.cube_r13 = new AdvancedModelRenderer(this);
        this.cube_r13.setRotationPoint(-2.65F, 1.725F, -2.575F);
        this.antennaeLeft.addChild(cube_r13);
        this.setRotateAngle(cube_r13, -0.0488F, 0.6886F, -0.0655F);
        this.cube_r13.cubeList.add(new ModelBox(cube_r13, 0, 0, -3.0F, 0.0F, -3.0F, 4, 0, 4, 0.0F, false));

        this.antennaeRight = new AdvancedModelRenderer(this);
        this.antennaeRight.setRotationPoint(0.0F, -0.6F, 0.0F);
        this.Head.addChild(antennaeRight);


        this.cube_r14 = new AdvancedModelRenderer(this);
        this.cube_r14.setRotationPoint(2.65F, 1.725F, -2.575F);
        this.antennaeRight.addChild(cube_r14);
        this.setRotateAngle(cube_r14, -0.0488F, -0.6886F, 0.0655F);
        this.cube_r14.cubeList.add(new ModelBox(cube_r14, 0, 0, -1.0F, 0.0F, -3.0F, 4, 0, 4, 0.0F, true));

        this.spikeLeft = new AdvancedModelRenderer(this);
        this.spikeLeft.setRotationPoint(-2.9672F, 0.792F, -0.2686F);
        this.Head.addChild(spikeLeft);
        this.setRotateAngle(spikeLeft, 0.0F, 0.0393F, 0.0F);


        this.cube_r15 = new AdvancedModelRenderer(this);
        this.cube_r15.setRotationPoint(-0.2021F, -0.0009F, 3.9699F);
        this.spikeLeft.addChild(cube_r15);
        this.setRotateAngle(cube_r15, 0.3385F, -0.2312F, -0.1296F);
        this.cube_r15.cubeList.add(new ModelBox(cube_r15, 8, 18, 0.0F, -0.525F, -0.175F, 0, 1, 4, 0.0F, false));

        this.cube_r16 = new AdvancedModelRenderer(this);
        this.cube_r16.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.spikeLeft.addChild(cube_r16);
        this.setRotateAngle(cube_r16, 0.0067F, -0.0567F, -0.1284F);
        this.cube_r16.cubeList.add(new ModelBox(cube_r16, 0, 18, 0.025F, -0.5F, -0.025F, 0, 1, 4, 0.0F, false));

        this.spikeRight = new AdvancedModelRenderer(this);
        this.spikeRight.setRotationPoint(2.9672F, 0.792F, -0.2686F);
        this.Head.addChild(spikeRight);
        this.setRotateAngle(spikeRight, 0.0F, -0.0393F, 0.0F);


        this.cube_r17 = new AdvancedModelRenderer(this);
        this.cube_r17.setRotationPoint(0.2021F, -0.0009F, 3.9699F);
        this.spikeRight.addChild(cube_r17);
        this.setRotateAngle(cube_r17, 0.3385F, 0.2312F, 0.1296F);
        this.cube_r17.cubeList.add(new ModelBox(cube_r17, 8, 18, 0.0F, -0.525F, -0.175F, 0, 1, 4, 0.0F, true));

        this.cube_r18 = new AdvancedModelRenderer(this);
        this.cube_r18.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.spikeRight.addChild(cube_r18);
        this.setRotateAngle(cube_r18, 0.0067F, 0.0567F, 0.1284F);
        this.cube_r18.cubeList.add(new ModelBox(cube_r18, 0, 18, -0.025F, -0.5F, -0.025F, 0, 1, 4, 0.0F, true));

        this.body = new AdvancedModelRenderer(this);
        this.body.setRotationPoint(-2.7138F, -1.15F, 3.7513F);
        this.main.addChild(body);
        this.body.cubeList.add(new ModelBox(body, 0, 4, 1.7138F, -0.375F, -3.7513F, 2, 1, 4, 0.0F, false));

        this.cube_r19 = new AdvancedModelRenderer(this);
        this.cube_r19.setRotationPoint(2.7138F, -0.35F, 0.1987F);
        this.body.addChild(cube_r19);
        this.setRotateAngle(cube_r19, -0.0742F, 0.0F, 0.0F);
        this.cube_r19.cubeList.add(new ModelBox(cube_r19, 16, 0, -0.5F, 0.0F, -0.2F, 1, 1, 3, 0.0F, false));

        this.cube_r20 = new AdvancedModelRenderer(this);
        this.cube_r20.setRotationPoint(5.4275F, 0.0F, 0.0F);
        this.body.addChild(cube_r20);
        this.setRotateAngle(cube_r20, -0.0589F, -0.4766F, 0.1277F);
        this.cube_r20.cubeList.add(new ModelBox(cube_r20, 10, 14, -1.9724F, 0.0F, -0.0245F, 2, 1, 3, 0.0F, true));

        this.cube_r21 = new AdvancedModelRenderer(this);
        this.cube_r21.setRotationPoint(4.0423F, 0.0F, 2.661F);
        this.body.addChild(cube_r21);
        this.setRotateAngle(cube_r21, -0.0678F, -0.7392F, 0.1005F);
        this.cube_r21.cubeList.add(new ModelBox(cube_r21, 20, 14, -0.9973F, 0.0F, -0.0745F, 1, 1, 2, 0.0F, true));

        this.cube_r22 = new AdvancedModelRenderer(this);
        this.cube_r22.setRotationPoint(4.4638F, 0.325F, -2.0013F);
        this.body.addChild(cube_r22);
        this.setRotateAngle(cube_r22, 0.0F, 0.0F, 0.1527F);
        this.cube_r22.cubeList.add(new ModelBox(cube_r22, 0, 9, -1.0F, -0.5F, -2.0F, 2, 1, 4, 0.0F, true));

        this.cube_r23 = new AdvancedModelRenderer(this);
        this.cube_r23.setRotationPoint(0.9638F, 0.325F, -2.0013F);
        this.body.addChild(cube_r23);
        this.setRotateAngle(cube_r23, 0.0F, 0.0F, -0.1527F);
        this.cube_r23.cubeList.add(new ModelBox(cube_r23, 0, 9, -1.0F, -0.5F, -2.0F, 2, 1, 4, 0.0F, false));

        this.cube_r24 = new AdvancedModelRenderer(this);
        this.cube_r24.setRotationPoint(1.3853F, 0.0F, 2.661F);
        this.body.addChild(cube_r24);
        this.setRotateAngle(cube_r24, -0.0678F, 0.7392F, -0.1005F);
        this.cube_r24.cubeList.add(new ModelBox(cube_r24, 20, 14, -0.0027F, 0.0F, -0.0745F, 1, 1, 2, 0.0F, false));

        this.cube_r25 = new AdvancedModelRenderer(this);
        this.cube_r25.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.body.addChild(cube_r25);
        this.setRotateAngle(cube_r25, -0.0589F, 0.4766F, -0.1277F);
        this.cube_r25.cubeList.add(new ModelBox(cube_r25, 10, 14, -0.0276F, 0.0F, -0.0245F, 2, 1, 3, 0.0F, false));

        this.legRight = new AdvancedModelRenderer(this);
        this.legRight.setRotationPoint(2.7289F, 0.7486F, -4.55F);
        this.body.addChild(legRight);


        this.cube_r26 = new AdvancedModelRenderer(this);
        this.cube_r26.setRotationPoint(-0.0152F, 0.0263F, 0.0F);
        this.legRight.addChild(cube_r26);
        this.setRotateAngle(cube_r26, 0.0F, 0.0F, -1.7453F);
        this.cube_r26.cubeList.add(new ModelBox(cube_r26, 22, 10, 0.0F, -2.0F, -0.5F, 0, 2, 1, 0.0F, false));

        this.legLeft = new AdvancedModelRenderer(this);
        this.legLeft.setRotationPoint(2.6986F, 0.7486F, -4.55F);
        this.body.addChild(legLeft);


        this.cube_r27 = new AdvancedModelRenderer(this);
        this.cube_r27.setRotationPoint(0.0152F, 0.0263F, 0.0F);
        this.legLeft.addChild(cube_r27);
        this.setRotateAngle(cube_r27, 0.0F, 0.0F, 1.7453F);
        this.cube_r27.cubeList.add(new ModelBox(cube_r27, 22, 10, 0.0F, -2.0F, -0.5F, 0, 2, 1, 0.0F, true));

        this.legRight2 = new AdvancedModelRenderer(this);
        this.legRight2.setRotationPoint(2.7289F, 0.6736F, -3.25F);
        this.body.addChild(legRight2);


        this.cube_r28 = new AdvancedModelRenderer(this);
        this.cube_r28.setRotationPoint(-0.0152F, 0.0263F, 0.0F);
        this.legRight2.addChild(cube_r28);
        this.setRotateAngle(cube_r28, 0.0F, 0.0F, -1.7453F);
        this.cube_r28.cubeList.add(new ModelBox(cube_r28, 0, 23, 0.0F, -2.0F, -0.5F, 0, 2, 1, 0.0F, false));

        this.legLeft2 = new AdvancedModelRenderer(this);
        this.legLeft2.setRotationPoint(2.6986F, 0.6736F, -3.25F);
        this.body.addChild(legLeft2);


        this.cube_r29 = new AdvancedModelRenderer(this);
        this.cube_r29.setRotationPoint(0.0152F, 0.0263F, 0.0F);
        this.legLeft2.addChild(cube_r29);
        this.setRotateAngle(cube_r29, 0.0F, 0.0F, 1.7453F);
        this.cube_r29.cubeList.add(new ModelBox(cube_r29, 0, 23, 0.0F, -2.0F, -0.5F, 0, 2, 1, 0.0F, true));

        this.legRight3 = new AdvancedModelRenderer(this);
        this.legRight3.setRotationPoint(2.7289F, 0.6736F, -1.95F);
        this.body.addChild(legRight3);


        this.cube_r30 = new AdvancedModelRenderer(this);
        this.cube_r30.setRotationPoint(-0.0152F, 0.0263F, 0.0F);
        this.legRight3.addChild(cube_r30);
        this.setRotateAngle(cube_r30, 0.0F, 0.0F, -1.7453F);
        this.cube_r30.cubeList.add(new ModelBox(cube_r30, 2, 23, 0.0F, -2.0F, -0.5F, 0, 2, 1, 0.0F, false));

        this.legLeft3 = new AdvancedModelRenderer(this);
        this.legLeft3.setRotationPoint(2.6986F, 0.6736F, -1.95F);
        this.body.addChild(legLeft3);


        this.cube_r31 = new AdvancedModelRenderer(this);
        this.cube_r31.setRotationPoint(0.0152F, 0.0263F, 0.0F);
        this.legLeft3.addChild(cube_r31);
        this.setRotateAngle(cube_r31, 0.0F, 0.0F, 1.7453F);
        this.cube_r31.cubeList.add(new ModelBox(cube_r31, 2, 23, 0.0F, -2.0F, -0.5F, 0, 2, 1, 0.0F, true));

        this.legRight4 = new AdvancedModelRenderer(this);
        this.legRight4.setRotationPoint(2.7289F, 0.6736F, -0.65F);
        this.body.addChild(legRight4);


        this.cube_r32 = new AdvancedModelRenderer(this);
        this.cube_r32.setRotationPoint(-0.0152F, 0.0263F, 0.0F);
        this.legRight4.addChild(cube_r32);
        this.setRotateAngle(cube_r32, 0.0F, 0.0F, -1.7453F);
        this.cube_r32.cubeList.add(new ModelBox(cube_r32, 22, 21, 0.0F, -2.0F, -0.5F, 0, 2, 1, 0.0F, false));

        this.legLeft4 = new AdvancedModelRenderer(this);
        this.legLeft4.setRotationPoint(2.6986F, 0.6736F, -0.65F);
        this.body.addChild(legLeft4);


        this.cube_r33 = new AdvancedModelRenderer(this);
        this.cube_r33.setRotationPoint(0.0152F, 0.0263F, 0.0F);
        this.legLeft4.addChild(cube_r33);
        this.setRotateAngle(cube_r33, 0.0F, 0.0F, 1.7453F);
        this.cube_r33.cubeList.add(new ModelBox(cube_r33, 22, 21, 0.0F, -2.0F, -0.5F, 0, 2, 1, 0.0F, true));

        this.legRight5 = new AdvancedModelRenderer(this);
        this.legRight5.setRotationPoint(2.7289F, 0.7236F, 0.65F);
        this.body.addChild(legRight5);


        this.cube_r34 = new AdvancedModelRenderer(this);
        this.cube_r34.setRotationPoint(-0.0152F, 0.0263F, 0.0F);
        this.legRight5.addChild(cube_r34);
        this.setRotateAngle(cube_r34, 0.0F, 0.0F, -1.7453F);
        this.cube_r34.cubeList.add(new ModelBox(cube_r34, 4, 23, 0.0F, -2.0F, -0.5F, 0, 2, 1, 0.0F, false));

        this.legLeft5 = new AdvancedModelRenderer(this);
        this.legLeft5.setRotationPoint(2.6986F, 0.7236F, 0.65F);
        this.body.addChild(legLeft5);


        this.cube_r35 = new AdvancedModelRenderer(this);
        this.cube_r35.setRotationPoint(0.0152F, 0.0263F, 0.0F);
        this.legLeft5.addChild(cube_r35);
        this.setRotateAngle(cube_r35, 0.0F, 0.0F, 1.7453F);
        this.cube_r35.cubeList.add(new ModelBox(cube_r35, 4, 23, 0.0F, -2.0F, -0.5F, 0, 2, 1, 0.0F, true));

        updateDefaultPose();
    }

    @Override
    public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        this.main.render(f5);
    }

    public void renderStaticFloor(float f) {
        this.setRotateAngle(antennaeLeft, 0.0F, -0.24F, 0.0F);
        this.setRotateAngle(antennaeRight, 0.0F, 0.2269F, 0.0F);
        this.setRotateAngle(cube_r1, -0.1309F, 0.0F, 0.0F);
        this.setRotateAngle(cube_r10, 0.0436F, 0.0F, 0.0F);
        this.setRotateAngle(cube_r11, 0.2343F, -0.4529F, -0.4993F);
        this.setRotateAngle(cube_r12, 0.2343F, 0.4529F, 0.4993F);
        this.setRotateAngle(cube_r13, -0.0488F, 0.6886F, -0.0655F);
        this.setRotateAngle(cube_r14, -0.0488F, -0.6886F, 0.0655F);
        this.setRotateAngle(cube_r15, 0.3385F, -0.2312F, -0.1296F);
        this.setRotateAngle(cube_r16, 0.0067F, -0.0567F, -0.1284F);
        this.setRotateAngle(cube_r17, 0.3385F, 0.2312F, 0.1296F);
        this.setRotateAngle(cube_r18, 0.0067F, 0.0567F, 0.1284F);
        this.setRotateAngle(cube_r19, -0.0742F, 0.0F, 0.0F);
        this.setRotateAngle(cube_r2, -0.0698F, 0.0F, 0.0F);
        this.setRotateAngle(cube_r20, -0.0589F, -0.4766F, 0.1277F);
        this.setRotateAngle(cube_r21, -0.0678F, -0.7392F, 0.1005F);
        this.setRotateAngle(cube_r22, 0.0F, 0.0F, 0.1527F);
        this.setRotateAngle(cube_r23, 0.0F, 0.0F, -0.1527F);
        this.setRotateAngle(cube_r24, -0.0678F, 0.7392F, -0.1005F);
        this.setRotateAngle(cube_r25, -0.0589F, 0.4766F, -0.1277F);
        this.setRotateAngle(cube_r26, 0.0F, 0.0F, -1.7453F);
        this.setRotateAngle(cube_r27, 0.0F, 0.0F, 1.7453F);
        this.setRotateAngle(cube_r28, 0.0F, 0.0F, -1.7453F);
        this.setRotateAngle(cube_r29, 0.0F, 0.0F, 1.7453F);
        this.setRotateAngle(cube_r3, -0.0258F, 0.364F, -0.0232F);
        this.setRotateAngle(cube_r30, 0.0F, 0.0F, -1.7453F);
        this.setRotateAngle(cube_r31, 0.0F, 0.0F, 1.7453F);
        this.setRotateAngle(cube_r32, 0.0F, 0.0F, -1.7453F);
        this.setRotateAngle(cube_r33, 0.0F, 0.0F, 1.7453F);
        this.setRotateAngle(cube_r34, 0.0F, 0.0F, -1.7453F);
        this.setRotateAngle(cube_r35, 0.0F, 0.0F, 1.7453F);
        this.setRotateAngle(cube_r4, 0.077F, 0.5008F, 0.1593F);
        this.setRotateAngle(cube_r5, -0.0848F, 0.3635F, -0.0419F);
        this.setRotateAngle(cube_r6, -0.0258F, -0.364F, 0.0232F);
        this.setRotateAngle(cube_r7, -0.0848F, -0.3635F, 0.0419F);
        this.setRotateAngle(cube_r8, 0.2182F, 0.0F, 0.0F);
        this.setRotateAngle(cube_r9, 0.077F, -0.5008F, -0.1593F);
        this.setRotateAngle(eyeLeft, -0.1614F, 0.079F, -0.1923F);
        this.setRotateAngle(eyeRight, 0.2443F, 0.0F, -0.1614F);
        this.setRotateAngle(Head, -0.1396F, 0.0F, 0.0F);
        this.setRotateAngle(legLeft, 0.0F, 0.0F, 0.2269F);
        this.setRotateAngle(legLeft2, 0.0F, 0.0F, 0.1658F);
        this.setRotateAngle(legLeft3, 0.0F, 0.0F, 0.0524F);
        this.setRotateAngle(legLeft4, 0.0F, 0.0F, 0.24F);
        this.setRotateAngle(legLeft5, 0.0F, 0.0F, 0.0829F);
        this.setRotateAngle(legRight, 0.0F, 0.0F, -0.2443F);
        this.setRotateAngle(legRight2, 0.0F, 0.0F, -0.1222F);
        this.setRotateAngle(legRight3, 0.0F, 0.0F, -0.2269F);
        this.setRotateAngle(legRight4, 0.0F, 0.0F, -0.0873F);
        this.setRotateAngle(legRight5, 0.0F, 0.0F, -0.2051F);
        this.setRotateAngle(spikeLeft, 0.0F, 0.0393F, 0.0F);
        this.setRotateAngle(spikeRight, 0.0F, -0.0393F, 0.0F);
        this.main.offsetY = 0.17F;
        this.main.render(0.01F);
        resetToDefaultPose();
    }
    @Override
    public void renderStaticBook(float f) {
        //Rotations, positions and sizing:
        this.main.offsetY = 0.4F;
        this.main.offsetX = 0.1F;
        this.main.rotateAngleX = (float)Math.toRadians(45);
        this.main.rotateAngleY = (float)Math.toRadians(220);
        this.main.rotateAngleZ = (float)Math.toRadians(-20);
        this.main.scaleChildren = true;
        float scaler = 1.23F;
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
        this.main.offsetY = 0.F;

        if (e instanceof EntityLiving) {
            if (((EntityLiving)e).isAIDisabled()) {
                return;
            }
        }

        boolean isAtBottom = false;
        if (e.getPosition().getY() - 1 > 1) {
            BlockPos pos = new BlockPos(e.getPosition().getX(), e.getPosition().getY() - 1, e.getPosition().getZ());
            isAtBottom = ((e.isInsideOfMaterial(Material.WATER) || e.isInsideOfMaterial(Material.CORAL))
                    && ((e.world.getBlockState(pos)).getMaterial() != Material.WATER)
                    && ((double)e.getPosition().getY() + 0.334D) > e.posY);
        }

        AdvancedModelRenderer[] legsL = {this.legLeft, this.legLeft2, this.legLeft3, this.legLeft4, this.legLeft5};
        AdvancedModelRenderer[] legsR = {this.legRight, this.legRight2, this.legRight3, this.legRight4, this.legRight5};
        AdvancedModelRenderer[] bodyF = {this.body,};

        if (isAtBottom) {
            if (((EntityPrehistoricFloraEctenaspis)e).getIsMoving()) {
                this.chainWave(legsL, 0.2F, 0.2F, -3, f2, 1);
                this.chainWave(legsR, 0.6F, 0.2F, -3, f2, 1);
                this.flap(legLeft, 0.5F, -0.5F, true, 0, -0.5F, f2, 0.3F);
                this.flap(legRight, 0.5F, 0.5F, true, 0, 0.5F, f2, 0.3F);
                this.flap(legLeft2, 0.5F, -0.5F, true, 1.0F, -0.5F, f2, 0.3F);
                this.flap(legRight2, 0.5F, 0.5F, true, 1.0F, 0.5F, f2, 0.3F);
                this.flap(legLeft3, 0.5F, -0.5F, true, 2.0F, -0.5F, f2, 0.3F);
                this.flap(legRight3, 0.5F, 0.5F, true, 2.0F, 0.5F, f2, 0.3F);
                this.flap(legLeft4, 0.5F, -0.5F, true, 3.0F, -0.5F, f2, 0.3F);
                this.flap(legRight4, 0.5F, 0.5F, true, 3.0F, 0.5F, f2, 0.3F);
                this.flap(legLeft5, 0.5F, -0.5F, true, 4.0F, -0.5F, f2, 0.3F);
                this.flap(legRight5, 0.5F, 0.5F, true, 4.0F, 0.5F, f2, 0.3F);

                this.chainSwing(bodyF, 0.1F, 0.02F, -3, f2, 0.5F);
                this.chainWave(bodyF, 0.1F, 0.02f, -3, f2, 0F);
            }
            this.bob(main, 0.0F, 0.0F, false, f2, 1);
        }
        else {
            this.chainWave(legsL, 0.2F, 0.2F, -3, f2, 1);
            this.chainWave(legsR, 0.25F, 0.2F, -3, f2, 1);
            this.flap(legLeft, 0.2F, -0.5F, true, 0, -0.5F, f2, 0.3F);
            this.flap(legRight, 0.2F, 0.5F, true, 0, 0.5F, f2, 0.3F);
            this.flap(legLeft2, 0.2F, -0.5F, true, 1.0F, -0.5F, f2, 0.3F);
            this.flap(legRight2, 0.2F, 0.5F, true, 1.0F, 0.5F, f2, 0.3F);
            this.flap(legLeft3, 0.2F, -0.5F, true, 2.0F, -0.5F, f2, 0.3F);
            this.flap(legRight3, 0.2F, 0.5F, true, 2.0F, 0.5F, f2, 0.3F);
            this.flap(legLeft4, 0.2F, -0.5F, true, 3.0F, -0.5F, f2, 0.3F);
            this.flap(legRight4, 0.2F, 0.5F, true, 3.0F, 0.5F, f2, 0.3F);
            this.flap(legLeft5, 0.2F, -0.5F, true, 4.0F, -0.5F, f2, 0.3F);
            this.flap(legRight5, 0.2F, 0.5F, true, 4.0F, 0.5F, f2, 0.3F);
            this.chainSwing(bodyF, 0.2F, 0.01F, -3, f2, 0.2F);
            this.chainWave(bodyF, 0.5F, 0.02f, -3, f2, 0.3F);
            this.bob(main, 0.2F, 0.2F, false, f2, 1);
        }

        this.swing(antennaeRight, 0.4F, -0.2F, false, 0, -0.1F, f2, 0.8F);
        this.swing(antennaeLeft, 0.4F, 0.2F, false, 0, 0.1F, f2, 0.8F);

        }
    }
