package net.lepidodendron.entity.model.tile;

import net.ilexiconn.llibrary.client.model.tools.AdvancedModelBase;
import net.ilexiconn.llibrary.client.model.tools.AdvancedModelRenderer;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;

public class ModelSkeletonPoposaurus extends AdvancedModelBase {
    private final AdvancedModelRenderer Poposaurus;
    private final AdvancedModelRenderer Basin;
    private final AdvancedModelRenderer Basin_r1;
    private final AdvancedModelRenderer Basin_r2;
    private final AdvancedModelRenderer Basin_r3;
    private final AdvancedModelRenderer Basin_r4;
    private final AdvancedModelRenderer Basin_r5;
    private final AdvancedModelRenderer Basin_r6;
    private final AdvancedModelRenderer Body;
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
    private final AdvancedModelRenderer Basin_r7;
    private final AdvancedModelRenderer cube_r23;
    private final AdvancedModelRenderer Chest;
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
    private final AdvancedModelRenderer Basin_r8;
    private final AdvancedModelRenderer cube_r34;
    private final AdvancedModelRenderer Basin_r9;
    private final AdvancedModelRenderer Neck;
    private final AdvancedModelRenderer cube_r35;
    private final AdvancedModelRenderer cube_r36;
    private final AdvancedModelRenderer cube_r37;
    private final AdvancedModelRenderer cube_r38;
    private final AdvancedModelRenderer Neck2;
    private final AdvancedModelRenderer cube_r39;
    private final AdvancedModelRenderer cube_r40;
    private final AdvancedModelRenderer cube_r41;
    private final AdvancedModelRenderer cube_r42;
    private final AdvancedModelRenderer cube_r43;
    private final AdvancedModelRenderer Head;
    private final AdvancedModelRenderer cube_r44;
    private final AdvancedModelRenderer cube_r45;
    private final AdvancedModelRenderer cube_r46;
    private final AdvancedModelRenderer cube_r47;
    private final AdvancedModelRenderer cube_r48;
    private final AdvancedModelRenderer Jaw;
    private final AdvancedModelRenderer cube_r49;
    private final AdvancedModelRenderer cube_r50;
    private final AdvancedModelRenderer LArm;
    private final AdvancedModelRenderer LArm2;
    private final AdvancedModelRenderer LHand;
    private final AdvancedModelRenderer LArm3;
    private final AdvancedModelRenderer LArm4;
    private final AdvancedModelRenderer LHand2;
    private final AdvancedModelRenderer LLeg;
    private final AdvancedModelRenderer LLeg2;
    private final AdvancedModelRenderer LFoot;
    private final AdvancedModelRenderer LFoot2;
    private final AdvancedModelRenderer LLeg3;
    private final AdvancedModelRenderer LLeg4;
    private final AdvancedModelRenderer LFoot3;
    private final AdvancedModelRenderer LFoot4;
    private final AdvancedModelRenderer Tail;
    private final AdvancedModelRenderer cube_r51;
    private final AdvancedModelRenderer cube_r52;
    private final AdvancedModelRenderer cube_r53;
    private final AdvancedModelRenderer Tail2;
    private final AdvancedModelRenderer cube_r54;
    private final AdvancedModelRenderer cube_r55;
    private final AdvancedModelRenderer cube_r56;
    private final AdvancedModelRenderer cube_r57;
    private final AdvancedModelRenderer cube_r58;
    private final AdvancedModelRenderer Tail3;
    private final AdvancedModelRenderer cube_r59;
    private final AdvancedModelRenderer cube_r60;
    private final AdvancedModelRenderer Tail4;
    private final AdvancedModelRenderer tail5;

    public ModelSkeletonPoposaurus() {
        this.textureWidth = 75;
        this.textureHeight = 75;

        this.Poposaurus = new AdvancedModelRenderer(this);
        this.Poposaurus.setRotationPoint(0.0F, 6.5F, -12.0F);
        this.setRotateAngle(Poposaurus, -0.0436F, 0.0F, 0.0F);


        this.Basin = new AdvancedModelRenderer(this);
        this.Basin.setRotationPoint(0.0F, -2.0F, 13.0F);
        this.Poposaurus.addChild(Basin);
        this.setRotateAngle(Basin, 0.0F, 0.0F, -0.2182F);
        this.Basin.cubeList.add(new ModelBox(Basin, 36, 14, -1.0F, -1.1F, -3.0F, 2, 2, 7, 0.0F, false));
        this.Basin.cubeList.add(new ModelBox(Basin, 64, 45, 0.0F, -2.3F, -2.1F, 0, 2, 1, 0.0F, false));
        this.Basin.cubeList.add(new ModelBox(Basin, 14, 56, 0.0F, -2.3F, -0.1F, 0, 2, 1, 0.0F, false));
        this.Basin.cubeList.add(new ModelBox(Basin, 54, 42, 0.0F, -2.3F, 1.9F, 0, 2, 1, 0.0F, false));

        this.Basin_r1 = new AdvancedModelRenderer(this);
        this.Basin_r1.setRotationPoint(-2.4F, 1.1F, 0.5F);
        this.Basin.addChild(Basin_r1);
        this.setRotateAngle(Basin_r1, -0.5236F, 0.0F, -0.3054F);
        this.Basin_r1.cubeList.add(new ModelBox(Basin_r1, 30, 59, -0.2558F, 0.6889F, -1.8188F, 1, 6, 1, 0.0F, true));
        this.Basin_r1.cubeList.add(new ModelBox(Basin_r1, 58, 6, -0.2558F, 6.6889F, -1.8188F, 1, 1, 2, 0.0F, true));

        this.Basin_r2 = new AdvancedModelRenderer(this);
        this.Basin_r2.setRotationPoint(-2.4F, 1.1F, 0.5F);
        this.Basin.addChild(Basin_r2);
        this.setRotateAngle(Basin_r2, 0.7418F, 0.0F, -0.3054F);
        this.Basin_r2.cubeList.add(new ModelBox(Basin_r2, 32, 30, -0.2453F, 6.6337F, -0.5967F, 1, 1, 3, 0.0F, true));
        this.Basin_r2.cubeList.add(new ModelBox(Basin_r2, 25, 59, -0.2453F, 0.6337F, 0.4033F, 1, 6, 1, 0.0F, true));

        this.Basin_r3 = new AdvancedModelRenderer(this);
        this.Basin_r3.setRotationPoint(-1.0F, -1.4F, 0.5F);
        this.Basin.addChild(Basin_r3);
        this.setRotateAngle(Basin_r3, 0.0F, 0.0F, 0.3054F);
        this.Basin_r3.cubeList.add(new ModelBox(Basin_r3, 40, 24, -1.0F, 0.0F, -3.1F, 1, 1, 7, 0.0F, true));
        this.Basin_r3.cubeList.add(new ModelBox(Basin_r3, 14, 56, -1.0F, 1.0F, -2.1F, 1, 2, 4, 0.0F, true));

        this.Basin_r4 = new AdvancedModelRenderer(this);
        this.Basin_r4.setRotationPoint(2.4F, 1.1F, 0.5F);
        this.Basin.addChild(Basin_r4);
        this.setRotateAngle(Basin_r4, -0.5236F, 0.0F, 0.3054F);
        this.Basin_r4.cubeList.add(new ModelBox(Basin_r4, 58, 6, -0.7442F, 6.6889F, -1.8188F, 1, 1, 2, 0.0F, false));
        this.Basin_r4.cubeList.add(new ModelBox(Basin_r4, 30, 59, -0.7442F, 0.6889F, -1.8188F, 1, 6, 1, 0.0F, false));

        this.Basin_r5 = new AdvancedModelRenderer(this);
        this.Basin_r5.setRotationPoint(2.4F, 1.1F, 0.5F);
        this.Basin.addChild(Basin_r5);
        this.setRotateAngle(Basin_r5, 0.7418F, 0.0F, 0.3054F);
        this.Basin_r5.cubeList.add(new ModelBox(Basin_r5, 32, 30, -0.7547F, 6.6337F, -0.5967F, 1, 1, 3, 0.0F, false));
        this.Basin_r5.cubeList.add(new ModelBox(Basin_r5, 25, 59, -0.7547F, 0.6337F, 0.4033F, 1, 6, 1, 0.0F, false));

        this.Basin_r6 = new AdvancedModelRenderer(this);
        this.Basin_r6.setRotationPoint(1.0F, -1.4F, 0.5F);
        this.Basin.addChild(Basin_r6);
        this.setRotateAngle(Basin_r6, 0.0F, 0.0F, -0.3054F);
        this.Basin_r6.cubeList.add(new ModelBox(Basin_r6, 14, 56, 0.0F, 1.0F, -2.1F, 1, 2, 4, 0.0F, false));
        this.Basin_r6.cubeList.add(new ModelBox(Basin_r6, 40, 24, 0.0F, 0.0F, -3.1F, 1, 1, 7, 0.0F, false));

        this.Body = new AdvancedModelRenderer(this);
        this.Body.setRotationPoint(0.0F, -0.3F, -2.5F);
        this.Basin.addChild(Body);
        this.setRotateAngle(Body, 0.1056F, 0.1302F, 0.0138F);
        this.Body.cubeList.add(new ModelBox(Body, 0, 31, -1.0F, -0.857F, -8.8804F, 2, 2, 9, 0.01F, false));

        this.cube_r1 = new AdvancedModelRenderer(this);
        this.cube_r1.setRotationPoint(0.0F, -1.857F, -5.5804F);
        this.Body.addChild(cube_r1);
        this.setRotateAngle(cube_r1, 0.2094F, 0.0F, 0.0F);
        this.cube_r1.cubeList.add(new ModelBox(cube_r1, 56, 28, 0.0F, 0.0511F, -1.6972F, 0, 1, 1, 0.0F, false));

        this.cube_r2 = new AdvancedModelRenderer(this);
        this.cube_r2.setRotationPoint(0.0F, 1.743F, 0.3196F);
        this.Body.addChild(cube_r2);
        this.setRotateAngle(cube_r2, 0.0349F, 0.0F, 0.0F);
        this.cube_r2.cubeList.add(new ModelBox(cube_r2, 59, 33, 0.0F, -3.8F, -1.6F, 0, 2, 1, 0.0F, false));
        this.cube_r2.cubeList.add(new ModelBox(cube_r2, 55, 63, 0.0F, -3.8F, -3.6F, 0, 2, 1, 0.0F, false));
        this.cube_r2.cubeList.add(new ModelBox(cube_r2, 64, 9, 0.0F, -3.8F, -5.6F, 0, 2, 1, 0.0F, false));

        this.cube_r3 = new AdvancedModelRenderer(this);
        this.cube_r3.setRotationPoint(-1.0F, 0.843F, -0.6804F);
        this.Body.addChild(cube_r3);
        this.setRotateAngle(cube_r3, -1.6965F, 0.1352F, 0.8059F);
        this.cube_r3.cubeList.add(new ModelBox(cube_r3, 50, 28, -0.0135F, -0.9054F, -0.0061F, 0, 1, 1, 0.0F, true));

        this.cube_r4 = new AdvancedModelRenderer(this);
        this.cube_r4.setRotationPoint(-1.0F, 0.843F, -0.6804F);
        this.Body.addChild(cube_r4);
        this.setRotateAngle(cube_r4, -1.7444F, 0.0622F, 0.329F);
        this.cube_r4.cubeList.add(new ModelBox(cube_r4, 26, 49, -0.4648F, -0.9054F, 0.8594F, 0, 1, 1, 0.0F, true));

        this.cube_r5 = new AdvancedModelRenderer(this);
        this.cube_r5.setRotationPoint(-1.0F, 0.643F, -2.6804F);
        this.Body.addChild(cube_r5);
        this.setRotateAngle(cube_r5, -1.5759F, 0.0086F, 0.8146F);
        this.cube_r5.cubeList.add(new ModelBox(cube_r5, 51, 48, -0.0135F, -0.9054F, -0.0061F, 0, 1, 1, 0.0F, true));

        this.cube_r6 = new AdvancedModelRenderer(this);
        this.cube_r6.setRotationPoint(-1.0F, 0.643F, -2.6804F);
        this.Body.addChild(cube_r6);
        this.setRotateAngle(cube_r6, -1.5793F, 0.0052F, 0.3346F);
        this.cube_r6.cubeList.add(new ModelBox(cube_r6, 0, 0, -0.4648F, -0.9054F, 0.8594F, 0, 1, 2, 0.0F, true));

        this.cube_r7 = new AdvancedModelRenderer(this);
        this.cube_r7.setRotationPoint(-1.0F, 0.643F, -4.6804F);
        this.Body.addChild(cube_r7);
        this.setRotateAngle(cube_r7, -1.4143F, -0.0519F, 0.3307F);
        this.cube_r7.cubeList.add(new ModelBox(cube_r7, 9, 8, -0.9648F, -0.9054F, 1.7594F, 0, 1, 2, 0.0F, true));

        this.cube_r8 = new AdvancedModelRenderer(this);
        this.cube_r8.setRotationPoint(-1.0F, 0.643F, -4.6804F);
        this.Body.addChild(cube_r8);
        this.setRotateAngle(cube_r8, -1.4556F, -0.1181F, 0.808F);
        this.cube_r8.cubeList.add(new ModelBox(cube_r8, 8, 0, -0.0135F, -0.9054F, -0.0061F, 0, 1, 2, 0.0F, true));

        this.cube_r9 = new AdvancedModelRenderer(this);
        this.cube_r9.setRotationPoint(-1.0F, 0.643F, -6.6804F);
        this.Body.addChild(cube_r9);
        this.setRotateAngle(cube_r9, -1.29F, -0.0939F, 0.3217F);
        this.cube_r9.cubeList.add(new ModelBox(cube_r9, 0, 31, -0.9648F, -0.9054F, 1.7594F, 0, 1, 4, 0.0F, true));

        this.cube_r10 = new AdvancedModelRenderer(this);
        this.cube_r10.setRotationPoint(-1.0F, 0.643F, -6.6804F);
        this.Body.addChild(cube_r10);
        this.setRotateAngle(cube_r10, -1.3632F, -0.2121F, 0.7927F);
        this.cube_r10.cubeList.add(new ModelBox(cube_r10, 15, 24, -0.0135F, -0.9054F, -0.0061F, 0, 1, 2, 0.0F, true));

        this.cube_r11 = new AdvancedModelRenderer(this);
        this.cube_r11.setRotationPoint(-1.0F, 0.543F, -8.6804F);
        this.Body.addChild(cube_r11);
        this.setRotateAngle(cube_r11, -1.2671F, -0.3043F, 0.7681F);
        this.cube_r11.cubeList.add(new ModelBox(cube_r11, 26, 16, -0.0135F, -0.9054F, -0.0061F, 0, 1, 2, 0.0F, true));

        this.cube_r12 = new AdvancedModelRenderer(this);
        this.cube_r12.setRotationPoint(-1.0F, 0.543F, -8.6804F);
        this.Body.addChild(cube_r12);
        this.setRotateAngle(cube_r12, -1.1647F, -0.1344F, 0.3074F);
        this.cube_r12.cubeList.add(new ModelBox(cube_r12, 50, 20, -0.9648F, -0.9054F, 1.7594F, 0, 1, 6, 0.0F, true));

        this.cube_r13 = new AdvancedModelRenderer(this);
        this.cube_r13.setRotationPoint(1.0F, 0.843F, -0.6804F);
        this.Body.addChild(cube_r13);
        this.setRotateAngle(cube_r13, -1.6965F, -0.1352F, -0.8059F);
        this.cube_r13.cubeList.add(new ModelBox(cube_r13, 50, 28, 0.0135F, -0.9054F, -0.0061F, 0, 1, 1, 0.0F, false));

        this.cube_r14 = new AdvancedModelRenderer(this);
        this.cube_r14.setRotationPoint(1.0F, 0.843F, -0.6804F);
        this.Body.addChild(cube_r14);
        this.setRotateAngle(cube_r14, -1.7444F, -0.0622F, -0.329F);
        this.cube_r14.cubeList.add(new ModelBox(cube_r14, 26, 49, 0.4648F, -0.9054F, 0.8594F, 0, 1, 1, 0.0F, false));

        this.cube_r15 = new AdvancedModelRenderer(this);
        this.cube_r15.setRotationPoint(1.0F, 0.643F, -2.6804F);
        this.Body.addChild(cube_r15);
        this.setRotateAngle(cube_r15, -1.5759F, -0.0086F, -0.8146F);
        this.cube_r15.cubeList.add(new ModelBox(cube_r15, 51, 48, 0.0135F, -0.9054F, -0.0061F, 0, 1, 1, 0.0F, false));

        this.cube_r16 = new AdvancedModelRenderer(this);
        this.cube_r16.setRotationPoint(1.0F, 0.643F, -2.6804F);
        this.Body.addChild(cube_r16);
        this.setRotateAngle(cube_r16, -1.5793F, -0.0052F, -0.3346F);
        this.cube_r16.cubeList.add(new ModelBox(cube_r16, 0, 0, 0.4648F, -0.9054F, 0.8594F, 0, 1, 2, 0.0F, false));

        this.cube_r17 = new AdvancedModelRenderer(this);
        this.cube_r17.setRotationPoint(1.0F, 0.643F, -4.6804F);
        this.Body.addChild(cube_r17);
        this.setRotateAngle(cube_r17, -1.4143F, 0.0519F, -0.3307F);
        this.cube_r17.cubeList.add(new ModelBox(cube_r17, 9, 8, 0.9648F, -0.9054F, 1.7594F, 0, 1, 2, 0.0F, false));

        this.cube_r18 = new AdvancedModelRenderer(this);
        this.cube_r18.setRotationPoint(1.0F, 0.643F, -4.6804F);
        this.Body.addChild(cube_r18);
        this.setRotateAngle(cube_r18, -1.4556F, 0.1181F, -0.808F);
        this.cube_r18.cubeList.add(new ModelBox(cube_r18, 8, 0, 0.0135F, -0.9054F, -0.0061F, 0, 1, 2, 0.0F, false));

        this.cube_r19 = new AdvancedModelRenderer(this);
        this.cube_r19.setRotationPoint(0.5F, -0.757F, -12.8804F);
        this.Body.addChild(cube_r19);
        this.setRotateAngle(cube_r19, -0.0349F, 0.0F, 0.0F);
        this.cube_r19.cubeList.add(new ModelBox(cube_r19, 24, 31, -0.5F, -0.7028F, 3.7457F, 0, 1, 1, 0.0F, false));

        this.cube_r20 = new AdvancedModelRenderer(this);
        this.cube_r20.setRotationPoint(1.0F, 0.643F, -6.6804F);
        this.Body.addChild(cube_r20);
        this.setRotateAngle(cube_r20, -1.3632F, 0.2121F, -0.7927F);
        this.cube_r20.cubeList.add(new ModelBox(cube_r20, 15, 24, 0.0135F, -0.9054F, -0.0061F, 0, 1, 2, 0.0F, false));

        this.cube_r21 = new AdvancedModelRenderer(this);
        this.cube_r21.setRotationPoint(1.0F, 0.643F, -6.6804F);
        this.Body.addChild(cube_r21);
        this.setRotateAngle(cube_r21, -1.29F, 0.0939F, -0.3217F);
        this.cube_r21.cubeList.add(new ModelBox(cube_r21, 0, 31, 0.9648F, -0.9054F, 1.7594F, 0, 1, 4, 0.0F, false));

        this.cube_r22 = new AdvancedModelRenderer(this);
        this.cube_r22.setRotationPoint(1.0F, 0.543F, -8.6804F);
        this.Body.addChild(cube_r22);
        this.setRotateAngle(cube_r22, -1.2671F, 0.3043F, -0.7681F);
        this.cube_r22.cubeList.add(new ModelBox(cube_r22, 26, 16, 0.0135F, -0.9054F, -0.0061F, 0, 1, 2, 0.0F, false));

        this.Basin_r7 = new AdvancedModelRenderer(this);
        this.Basin_r7.setRotationPoint(0.0F, 7.543F, -0.6804F);
        this.Body.addChild(Basin_r7);
        this.setRotateAngle(Basin_r7, -0.0873F, 0.0F, 0.0F);
        this.Basin_r7.cubeList.add(new ModelBox(Basin_r7, 32, 10, -2.5F, 0.2F, -2.4F, 5, 0, 1, 0.0F, false));
        this.Basin_r7.cubeList.add(new ModelBox(Basin_r7, 32, 28, -2.5F, 0.2F, -4.4F, 5, 0, 1, 0.0F, false));
        this.Basin_r7.cubeList.add(new ModelBox(Basin_r7, 40, 43, -2.5F, 0.2F, -6.4F, 5, 0, 1, 0.0F, false));

        this.cube_r23 = new AdvancedModelRenderer(this);
        this.cube_r23.setRotationPoint(1.0F, 0.543F, -8.6804F);
        this.Body.addChild(cube_r23);
        this.setRotateAngle(cube_r23, -1.1647F, 0.1344F, -0.3074F);
        this.cube_r23.cubeList.add(new ModelBox(cube_r23, 50, 20, 0.9648F, -0.9054F, 1.7594F, 0, 1, 6, 0.0F, false));

        this.Chest = new AdvancedModelRenderer(this);
        this.Chest.setRotationPoint(0.0F, 0.043F, -8.9804F);
        this.Body.addChild(Chest);
        this.setRotateAngle(Chest, 0.1056F, 0.217F, 0.0232F);
        this.Chest.cubeList.add(new ModelBox(Chest, 48, 5, -1.0F, -0.866F, -4.7594F, 2, 2, 5, 0.0F, false));

        this.cube_r24 = new AdvancedModelRenderer(this);
        this.cube_r24.setRotationPoint(-1.0F, 0.834F, -1.8594F);
        this.Chest.addChild(cube_r24);
        this.setRotateAngle(cube_r24, -1.1311F, -0.1449F, 0.3027F);
        this.cube_r24.cubeList.add(new ModelBox(cube_r24, 23, 51, -0.9504F, -0.9949F, 1.8015F, 0, 1, 6, 0.0F, true));

        this.cube_r25 = new AdvancedModelRenderer(this);
        this.cube_r25.setRotationPoint(-1.0F, 0.834F, -1.8594F);
        this.Chest.addChild(cube_r25);
        this.setRotateAngle(cube_r25, -1.2406F, -0.3285F, 0.7599F);
        this.cube_r25.cubeList.add(new ModelBox(cube_r25, 40, 45, 0.0188F, -0.9949F, 0.0246F, 0, 1, 2, 0.0F, true));

        this.cube_r26 = new AdvancedModelRenderer(this);
        this.cube_r26.setRotationPoint(-1.0F, 0.934F, -3.8594F);
        this.Chest.addChild(cube_r26);
        this.setRotateAngle(cube_r26, -1.0466F, -0.1704F, 0.2894F);
        this.cube_r26.cubeList.add(new ModelBox(cube_r26, 50, 56, -0.9504F, -0.9949F, 1.8015F, 0, 1, 5, 0.0F, true));

        this.cube_r27 = new AdvancedModelRenderer(this);
        this.cube_r27.setRotationPoint(-1.0F, 0.934F, -3.8594F);
        this.Chest.addChild(cube_r27);
        this.setRotateAngle(cube_r27, -1.1723F, -0.3878F, 0.7359F);
        this.cube_r27.cubeList.add(new ModelBox(cube_r27, 50, 56, 0.0188F, -0.9949F, 0.0246F, 0, 1, 2, 0.0F, true));

        this.cube_r28 = new AdvancedModelRenderer(this);
        this.cube_r28.setRotationPoint(1.0F, 0.834F, -1.8594F);
        this.Chest.addChild(cube_r28);
        this.setRotateAngle(cube_r28, -1.2406F, 0.3285F, -0.7599F);
        this.cube_r28.cubeList.add(new ModelBox(cube_r28, 40, 45, -0.0188F, -0.9949F, 0.0246F, 0, 1, 2, 0.0F, false));

        this.cube_r29 = new AdvancedModelRenderer(this);
        this.cube_r29.setRotationPoint(1.0F, 0.834F, -1.8594F);
        this.Chest.addChild(cube_r29);
        this.setRotateAngle(cube_r29, -1.1311F, 0.1449F, -0.3027F);
        this.cube_r29.cubeList.add(new ModelBox(cube_r29, 23, 51, 0.9504F, -0.9949F, 1.8015F, 0, 1, 6, 0.0F, false));

        this.cube_r30 = new AdvancedModelRenderer(this);
        this.cube_r30.setRotationPoint(1.0F, 0.934F, -3.8594F);
        this.Chest.addChild(cube_r30);
        this.setRotateAngle(cube_r30, -1.0466F, 0.1704F, -0.2894F);
        this.cube_r30.cubeList.add(new ModelBox(cube_r30, 50, 56, 0.9504F, -0.9949F, 1.8015F, 0, 1, 5, 0.0F, false));

        this.cube_r31 = new AdvancedModelRenderer(this);
        this.cube_r31.setRotationPoint(1.0F, 0.934F, -3.8594F);
        this.Chest.addChild(cube_r31);
        this.setRotateAngle(cube_r31, -1.1723F, 0.3878F, -0.7359F);
        this.cube_r31.cubeList.add(new ModelBox(cube_r31, 50, 56, -0.0188F, -0.9949F, 0.0246F, 0, 1, 2, 0.0F, false));

        this.cube_r32 = new AdvancedModelRenderer(this);
        this.cube_r32.setRotationPoint(-2.0F, 1.234F, -0.7594F);
        this.Chest.addChild(cube_r32);
        this.setRotateAngle(cube_r32, 0.5976F, -0.2849F, 0.3917F);
        this.cube_r32.cubeList.add(new ModelBox(cube_r32, 0, 0, -1.0F, -0.7779F, -4.8891F, 1, 2, 5, 0.0F, true));
        this.cube_r32.cubeList.add(new ModelBox(cube_r32, 11, 43, -1.0F, -0.7779F, -5.8891F, 3, 2, 1, 0.0F, true));

        this.cube_r33 = new AdvancedModelRenderer(this);
        this.cube_r33.setRotationPoint(2.0F, 1.234F, -0.7594F);
        this.Chest.addChild(cube_r33);
        this.setRotateAngle(cube_r33, 0.5976F, 0.2849F, -0.3917F);
        this.cube_r33.cubeList.add(new ModelBox(cube_r33, 11, 43, -2.0F, -0.7779F, -5.8891F, 3, 2, 1, 0.0F, false));
        this.cube_r33.cubeList.add(new ModelBox(cube_r33, 0, 0, 0.0F, -0.7779F, -4.8891F, 1, 2, 5, 0.0F, false));

        this.Basin_r8 = new AdvancedModelRenderer(this);
        this.Basin_r8.setRotationPoint(0.0F, 6.334F, -3.7594F);
        this.Chest.addChild(Basin_r8);
        this.setRotateAngle(Basin_r8, -0.4014F, 0.0F, 0.0F);
        this.Basin_r8.cubeList.add(new ModelBox(Basin_r8, 14, 31, -1.5F, -0.9077F, -0.8982F, 3, 1, 3, 0.0F, false));

        this.cube_r34 = new AdvancedModelRenderer(this);
        this.cube_r34.setRotationPoint(0.5F, -0.866F, -3.9594F);
        this.Chest.addChild(cube_r34);
        this.setRotateAngle(cube_r34, -0.0349F, 0.0F, 0.0F);
        this.cube_r34.cubeList.add(new ModelBox(cube_r34, 46, 0, -0.5F, -0.7028F, -0.2543F, 0, 1, 1, 0.0F, false));
        this.cube_r34.cubeList.add(new ModelBox(cube_r34, 32, 30, -0.5F, -0.7028F, 1.7457F, 0, 1, 1, 0.0F, false));

        this.Basin_r9 = new AdvancedModelRenderer(this);
        this.Basin_r9.setRotationPoint(0.0F, 6.334F, -3.7594F);
        this.Chest.addChild(Basin_r9);
        this.setRotateAngle(Basin_r9, -0.1396F, 0.0F, 0.0F);
        this.Basin_r9.cubeList.add(new ModelBox(Basin_r9, 32, 35, -1.5F, 0.2375F, 3.0453F, 3, 0, 1, 0.0F, false));

        this.Neck = new AdvancedModelRenderer(this);
        this.Neck.setRotationPoint(0.0F, -0.266F, -4.1594F);
        this.Chest.addChild(Neck);
        this.setRotateAngle(Neck, -0.1056F, 0.1302F, -0.0138F);


        this.cube_r35 = new AdvancedModelRenderer(this);
        this.cube_r35.setRotationPoint(0.5F, -0.6528F, -6.5931F);
        this.Neck.addChild(cube_r35);
        this.setRotateAngle(cube_r35, -0.1309F, 0.0F, 0.0F);
        this.cube_r35.cubeList.add(new ModelBox(cube_r35, 53, 28, -0.5F, -1.473F, 4.6868F, 0, 1, 1, 0.0F, false));

        this.cube_r36 = new AdvancedModelRenderer(this);
        this.cube_r36.setRotationPoint(-1.1F, 1.0472F, -1.5931F);
        this.Neck.addChild(cube_r36);
        this.setRotateAngle(cube_r36, -0.474F, -0.261F, 0.021F);
        this.cube_r36.cubeList.add(new ModelBox(cube_r36, 60, 10, 0.1041F, -0.4488F, -0.0757F, 0, 1, 3, 0.0F, true));

        this.cube_r37 = new AdvancedModelRenderer(this);
        this.cube_r37.setRotationPoint(1.1F, 1.0472F, -1.5931F);
        this.Neck.addChild(cube_r37);
        this.setRotateAngle(cube_r37, -0.474F, 0.261F, -0.021F);
        this.cube_r37.cubeList.add(new ModelBox(cube_r37, 60, 10, -0.1041F, -0.4488F, -0.0757F, 0, 1, 3, 0.0F, false));

        this.cube_r38 = new AdvancedModelRenderer(this);
        this.cube_r38.setRotationPoint(0.0F, 0.0472F, -3.0931F);
        this.Neck.addChild(cube_r38);
        this.setRotateAngle(cube_r38, -0.1222F, 0.0F, 0.0F);
        this.cube_r38.cubeList.add(new ModelBox(cube_r38, 58, 0, -1.0F, -0.9F, 0.0F, 2, 2, 3, -0.01F, false));

        this.Neck2 = new AdvancedModelRenderer(this);
        this.Neck2.setRotationPoint(0.0F, 0.0472F, -2.3931F);
        this.Neck.addChild(Neck2);
        this.setRotateAngle(Neck2, -0.1318F, 0.1108F, 0.1607F);


        this.cube_r39 = new AdvancedModelRenderer(this);
        this.cube_r39.setRotationPoint(-1.1F, 0.3613F, -3.0732F);
        this.Neck2.addChild(cube_r39);
        this.setRotateAngle(cube_r39, -0.2558F, -0.261F, 0.021F);
        this.cube_r39.cubeList.add(new ModelBox(cube_r39, 63, 15, 0.6F, -0.4945F, 1.9987F, 0, 1, 2, 0.0F, true));
        this.cube_r39.cubeList.add(new ModelBox(cube_r39, 63, 26, 0.1F, -0.2945F, -0.0013F, 0, 1, 2, 0.0F, true));

        this.cube_r40 = new AdvancedModelRenderer(this);
        this.cube_r40.setRotationPoint(1.1F, 0.3613F, -3.0732F);
        this.Neck2.addChild(cube_r40);
        this.setRotateAngle(cube_r40, -0.2558F, 0.261F, -0.021F);
        this.cube_r40.cubeList.add(new ModelBox(cube_r40, 63, 15, -0.6F, -0.4945F, 1.9987F, 0, 1, 2, 0.0F, false));
        this.cube_r40.cubeList.add(new ModelBox(cube_r40, 63, 26, -0.1F, -0.2945F, -0.0013F, 0, 1, 2, 0.0F, false));

        this.cube_r41 = new AdvancedModelRenderer(this);
        this.cube_r41.setRotationPoint(0.5F, 0.1613F, -2.4732F);
        this.Neck2.addChild(cube_r41);
        this.setRotateAngle(cube_r41, -0.0785F, 0.0F, 0.0F);
        this.cube_r41.cubeList.add(new ModelBox(cube_r41, 57, 20, -1.5F, -1.048F, -0.5837F, 2, 2, 3, 0.0F, false));

        this.cube_r42 = new AdvancedModelRenderer(this);
        this.cube_r42.setRotationPoint(0.5F, -0.7387F, -3.8732F);
        this.Neck2.addChild(cube_r42);
        this.setRotateAngle(cube_r42, -0.1309F, 0.0F, 0.0F);
        this.cube_r42.cubeList.add(new ModelBox(cube_r42, 54, 0, -0.5F, -1.173F, 2.0868F, 0, 1, 1, 0.0F, false));
        this.cube_r42.cubeList.add(new ModelBox(cube_r42, 54, 48, -0.5F, -0.873F, 0.0868F, 0, 1, 1, 0.0F, false));

        this.cube_r43 = new AdvancedModelRenderer(this);
        this.cube_r43.setRotationPoint(0.5F, 0.1613F, -4.3732F);
        this.Neck2.addChild(cube_r43);
        this.setRotateAngle(cube_r43, 0.1309F, 0.0F, 0.0F);
        this.cube_r43.cubeList.add(new ModelBox(cube_r43, 58, 40, -1.5F, -0.9F, -0.3F, 2, 2, 2, -0.02F, false));

        this.Head = new AdvancedModelRenderer(this);
        this.Head.setRotationPoint(0.0F, -0.0387F, -4.4732F);
        this.Neck2.addChild(Head);
        this.setRotateAngle(Head, -0.0082F, 0.2531F, -0.1886F);
        this.Head.cubeList.add(new ModelBox(Head, 14, 49, -2.0F, -1.2145F, -2.5894F, 4, 3, 3, 0.0F, false));
        this.Head.cubeList.add(new ModelBox(Head, 0, 43, -1.0F, -0.7145F, -9.5894F, 2, 2, 6, 0.0F, false));
        this.Head.cubeList.add(new ModelBox(Head, 15, 16, -1.5F, -1.2145F, -6.5894F, 3, 3, 4, 0.0F, false));
        this.Head.cubeList.add(new ModelBox(Head, 0, 8, -1.0F, 1.2855F, -5.5894F, 2, 1, 4, -0.03F, false));

        this.cube_r44 = new AdvancedModelRenderer(this);
        this.cube_r44.setRotationPoint(0.0F, -0.9145F, -8.2894F);
        this.Head.addChild(cube_r44);
        this.setRotateAngle(cube_r44, 0.2443F, 0.0F, 0.0F);
        this.cube_r44.cubeList.add(new ModelBox(cube_r44, 0, 37, -1.0F, -0.13F, -1.28F, 2, 1, 1, -0.02F, false));

        this.cube_r45 = new AdvancedModelRenderer(this);
        this.cube_r45.setRotationPoint(0.0F, -1.4145F, -5.6894F);
        this.Head.addChild(cube_r45);
        this.setRotateAngle(cube_r45, 0.0175F, 0.0F, 0.0F);
        this.cube_r45.cubeList.add(new ModelBox(cube_r45, 29, 43, -1.0F, 0.0866F, -0.003F, 2, 1, 6, -0.01F, false));

        this.cube_r46 = new AdvancedModelRenderer(this);
        this.cube_r46.setRotationPoint(0.0F, -0.9145F, -6.5894F);
        this.Head.addChild(cube_r46);
        this.setRotateAngle(cube_r46, 0.1222F, 0.0F, 0.0F);
        this.cube_r46.cubeList.add(new ModelBox(cube_r46, 56, 56, -1.0F, -0.3F, -2.0488F, 2, 1, 3, -0.01F, false));

        this.cube_r47 = new AdvancedModelRenderer(this);
        this.cube_r47.setRotationPoint(0.0F, 0.7855F, -9.0894F);
        this.Head.addChild(cube_r47);
        this.setRotateAngle(cube_r47, -0.1309F, 0.0F, 0.0F);
        this.cube_r47.cubeList.add(new ModelBox(cube_r47, 58, 61, 0.7F, 0.0F, 0.0F, 0, 1, 3, 0.0F, false));
        this.cube_r47.cubeList.add(new ModelBox(cube_r47, 11, 63, -0.7F, 0.0F, 0.0F, 0, 1, 3, 0.0F, false));

        this.cube_r48 = new AdvancedModelRenderer(this);
        this.cube_r48.setRotationPoint(0.0F, 1.7855F, -6.5894F);
        this.Head.addChild(cube_r48);
        this.setRotateAngle(cube_r48, -0.2059F, 0.0F, 0.0F);
        this.cube_r48.cubeList.add(new ModelBox(cube_r48, 46, 0, -1.0F, -1.0F, -3.0F, 2, 1, 3, -0.01F, false));

        this.Jaw = new AdvancedModelRenderer(this);
        this.Jaw.setRotationPoint(0.0F, 1.7855F, 0.4106F);
        this.Head.addChild(Jaw);
        this.setRotateAngle(Jaw, 0.7418F, 0.0F, 0.0F);
        this.Jaw.cubeList.add(new ModelBox(Jaw, 58, 48, 1.0F, 0.0F, -3.0F, 1, 1, 3, 0.0F, false));
        this.Jaw.cubeList.add(new ModelBox(Jaw, 57, 28, 1.0F, 0.6F, -3.0F, 1, 1, 3, -0.01F, false));
        this.Jaw.cubeList.add(new ModelBox(Jaw, 58, 48, -2.0F, 0.0F, -3.0F, 1, 1, 3, 0.0F, true));
        this.Jaw.cubeList.add(new ModelBox(Jaw, 57, 28, -2.0F, 0.6F, -3.0F, 1, 1, 3, -0.01F, true));

        this.cube_r49 = new AdvancedModelRenderer(this);
        this.cube_r49.setRotationPoint(0.0F, 1.0F, -3.0F);
        this.Jaw.addChild(cube_r49);
        this.setRotateAngle(cube_r49, -0.1047F, 0.0F, 0.0F);
        this.cube_r49.cubeList.add(new ModelBox(cube_r49, 51, 40, 0.69F, -1.5F, -6.5F, 0, 1, 6, 0.0F, false));
        this.cube_r49.cubeList.add(new ModelBox(cube_r49, 51, 48, -0.69F, -1.5F, -6.4F, 0, 1, 6, 0.0F, false));
        this.cube_r49.cubeList.add(new ModelBox(cube_r49, 16, 40, -1.0F, -1.0F, -6.8F, 2, 1, 7, -0.02F, false));

        this.cube_r50 = new AdvancedModelRenderer(this);
        this.cube_r50.setRotationPoint(0.0F, 1.5F, -3.0F);
        this.Jaw.addChild(cube_r50);
        this.setRotateAngle(cube_r50, -0.2094F, 0.0F, 0.0F);
        this.cube_r50.cubeList.add(new ModelBox(cube_r50, 40, 45, -1.0F, -0.8973F, -5.8523F, 2, 1, 6, -0.03F, false));

        this.LArm = new AdvancedModelRenderer(this);
        this.LArm.setRotationPoint(1.8F, 4.934F, -3.2594F);
        this.Chest.addChild(LArm);
        this.setRotateAngle(LArm, 1.1763F, 0.0715F, -0.0501F);
        this.LArm.cubeList.add(new ModelBox(LArm, 18, 63, 0.5F, -0.5F, -1.0F, 1, 5, 1, 0.0F, false));

        this.LArm2 = new AdvancedModelRenderer(this);
        this.LArm2.setRotationPoint(1.0F, 3.5F, 0.5F);
        this.LArm.addChild(LArm2);
        this.setRotateAngle(LArm2, -1.7017F, 0.0F, 0.0F);
        this.LArm2.cubeList.add(new ModelBox(LArm2, 50, 63, -0.5F, 1.0F, -1.0F, 1, 4, 1, -0.01F, false));
        this.LArm2.cubeList.add(new ModelBox(LArm2, 63, 33, -0.5F, 1.0F, 0.2F, 1, 4, 1, -0.01F, false));

        this.LHand = new AdvancedModelRenderer(this);
        this.LHand.setRotationPoint(1.0F, 4.0F, 0.0F);
        this.LArm2.addChild(LHand);
        this.setRotateAngle(LHand, 0.0F, 0.0F, 0.4363F);
        this.LHand.cubeList.add(new ModelBox(LHand, 36, 14, -1.0F, 1.0F, -1.0F, 1, 3, 2, -0.02F, false));

        this.LArm3 = new AdvancedModelRenderer(this);
        this.LArm3.setRotationPoint(-1.8F, 4.934F, -3.2594F);
        this.Chest.addChild(LArm3);
        this.setRotateAngle(LArm3, 0.9581F, -0.0715F, 0.0501F);
        this.LArm3.cubeList.add(new ModelBox(LArm3, 28, 40, -1.5F, -0.5F, -1.0F, 1, 5, 1, 0.0F, false));

        this.LArm4 = new AdvancedModelRenderer(this);
        this.LArm4.setRotationPoint(-1.0F, 3.5F, 0.5F);
        this.LArm3.addChild(LArm4);
        this.setRotateAngle(LArm4, -0.6981F, 0.0F, 0.0F);
        this.LArm4.cubeList.add(new ModelBox(LArm4, 30, 51, -0.5F, 1.0F, -1.0F, 1, 4, 1, -0.01F, false));
        this.LArm4.cubeList.add(new ModelBox(LArm4, 0, 43, -0.5F, 1.0F, 0.2F, 1, 4, 1, -0.01F, false));

        this.LHand2 = new AdvancedModelRenderer(this);
        this.LHand2.setRotationPoint(-1.0F, 4.0F, 0.0F);
        this.LArm4.addChild(LHand2);
        this.setRotateAngle(LHand2, 0.0F, 0.0F, -0.4363F);
        this.LHand2.cubeList.add(new ModelBox(LHand2, 32, 0, 0.0F, 1.0F, -1.0F, 1, 3, 2, -0.02F, false));

        this.LLeg = new AdvancedModelRenderer(this);
        this.LLeg.setRotationPoint(2.3F, 1.0F, 2.0F);
        this.Basin.addChild(LLeg);
        this.setRotateAngle(LLeg, -1.0472F, 0.0F, 0.0F);
        this.LLeg.cubeList.add(new ModelBox(LLeg, 17, 0, 0.0F, -1.0F, -2.4F, 2, 8, 2, 0.0F, false));

        this.LLeg2 = new AdvancedModelRenderer(this);
        this.LLeg2.setRotationPoint(1.0F, 6.0F, -1.8F);
        this.LLeg.addChild(LLeg2);
        this.setRotateAngle(LLeg2, 1.309F, 0.0F, 0.0F);
        this.LLeg2.cubeList.add(new ModelBox(LLeg2, 43, 53, -1.0F, -0.0303F, -0.6373F, 2, 11, 1, -0.01F, false));
        this.LLeg2.cubeList.add(new ModelBox(LLeg2, 36, 53, -1.0F, -0.0303F, 1.0627F, 2, 11, 1, -0.01F, false));

        this.LFoot = new AdvancedModelRenderer(this);
        this.LFoot.setRotationPoint(0.0F, 10.4697F, 1.4627F);
        this.LLeg2.addChild(LFoot);
        this.setRotateAngle(LFoot, -0.0873F, 0.0F, 0.0F);
        this.LFoot.cubeList.add(new ModelBox(LFoot, 34, 33, -1.5F, -1.0F, -5.0F, 3, 2, 7, 0.0F, false));

        this.LFoot2 = new AdvancedModelRenderer(this);
        this.LFoot2.setRotationPoint(0.0F, 0.0F, -4.0F);
        this.LFoot.addChild(LFoot2);
        this.setRotateAngle(LFoot2, 1.0908F, 0.0F, 0.0F);
        this.LFoot2.cubeList.add(new ModelBox(LFoot2, 48, 33, -1.5F, -1.0F, -4.0F, 3, 2, 4, -0.01F, false));

        this.LLeg3 = new AdvancedModelRenderer(this);
        this.LLeg3.setRotationPoint(-2.3F, 1.0F, 2.0F);
        this.Basin.addChild(LLeg3);
        this.setRotateAngle(LLeg3, -0.0433F, 0.0057F, 0.1308F);
        this.LLeg3.cubeList.add(new ModelBox(LLeg3, 0, 16, -2.0F, -1.0F, -2.4F, 2, 8, 2, 0.0F, false));

        this.LLeg4 = new AdvancedModelRenderer(this);
        this.LLeg4.setRotationPoint(-1.0F, 6.0F, -1.8F);
        this.LLeg3.addChild(LLeg4);
        this.setRotateAngle(LLeg4, 0.8708F, -0.0668F, 0.0562F);
        this.LLeg4.cubeList.add(new ModelBox(LLeg4, 7, 52, -1.0F, -0.0303F, -0.6373F, 2, 11, 1, -0.01F, false));
        this.LLeg4.cubeList.add(new ModelBox(LLeg4, 0, 52, -1.0F, -0.0303F, 1.0627F, 2, 11, 1, -0.01F, false));

        this.LFoot3 = new AdvancedModelRenderer(this);
        this.LFoot3.setRotationPoint(0.0F, 10.4697F, 1.4627F);
        this.LLeg4.addChild(LFoot3);
        this.setRotateAngle(LFoot3, 0.6109F, 0.0F, 0.0F);
        this.LFoot3.cubeList.add(new ModelBox(LFoot3, 32, 0, -1.5F, -1.0F, -5.0F, 3, 2, 7, 0.0F, false));

        this.LFoot4 = new AdvancedModelRenderer(this);
        this.LFoot4.setRotationPoint(0.0F, 0.0F, -4.0F);
        this.LFoot3.addChild(LFoot4);
        this.setRotateAngle(LFoot4, -1.3963F, 0.0F, 0.0F);
        this.LFoot4.cubeList.add(new ModelBox(LFoot4, 48, 13, -1.5F, -1.0F, -4.0F, 3, 2, 4, -0.01F, false));

        this.Tail = new AdvancedModelRenderer(this);
        this.Tail.setRotationPoint(0.0F, -0.2F, 3.0F);
        this.Basin.addChild(Tail);
        this.setRotateAngle(Tail, -0.0436F, 0.0872F, -0.0038F);
        this.Tail.cubeList.add(new ModelBox(Tail, 20, 14, -1.0F, -0.9021F, 0.096F, 2, 2, 11, 0.001F, false));
        this.Tail.cubeList.add(new ModelBox(Tail, 3, 65, 0.0F, -2.1147F, 0.6003F, 0, 2, 1, -0.01F, false));
        this.Tail.cubeList.add(new ModelBox(Tail, 48, 33, 0.0F, -2.1147F, 2.6003F, 0, 2, 1, -0.01F, false));
        this.Tail.cubeList.add(new ModelBox(Tail, 48, 13, 0.0F, -2.1147F, 4.6003F, 0, 2, 1, -0.01F, false));
        this.Tail.cubeList.add(new ModelBox(Tail, 45, 10, 0.0F, -2.1147F, 6.6003F, 0, 2, 1, -0.01F, false));
        this.Tail.cubeList.add(new ModelBox(Tail, 20, 43, 0.0F, -2.1147F, 8.6003F, 0, 2, 1, -0.01F, false));

        this.cube_r51 = new AdvancedModelRenderer(this);
        this.cube_r51.setRotationPoint(0.0F, 0.9979F, 8.096F);
        this.Tail.addChild(cube_r51);
        this.setRotateAngle(cube_r51, 0.7854F, 0.0F, 0.0F);
        this.cube_r51.cubeList.add(new ModelBox(cube_r51, 9, 22, 0.0F, 0.0075F, -0.1171F, 0, 4, 1, 0.001F, false));

        this.cube_r52 = new AdvancedModelRenderer(this);
        this.cube_r52.setRotationPoint(0.0F, 0.9979F, 4.096F);
        this.Tail.addChild(cube_r52);
        this.setRotateAngle(cube_r52, 1.0036F, 0.0F, 0.0F);
        this.cube_r52.cubeList.add(new ModelBox(cube_r52, 26, 5, 0.0F, 0.3811F, 0.0321F, 0, 3, 1, 0.001F, false));

        this.cube_r53 = new AdvancedModelRenderer(this);
        this.cube_r53.setRotationPoint(0.0F, 0.9979F, 1.096F);
        this.Tail.addChild(cube_r53);
        this.setRotateAngle(cube_r53, 1.1345F, 0.0F, 0.0F);
        this.cube_r53.cubeList.add(new ModelBox(cube_r53, 5, 31, 0.0F, 0.1F, 0.0F, 0, 2, 1, 0.001F, false));

        this.Tail2 = new AdvancedModelRenderer(this);
        this.Tail2.setRotationPoint(0.0F, -0.3021F, 10.596F);
        this.Tail.addChild(Tail2);
        this.setRotateAngle(Tail2, 0.0682F, 0.2031F, -0.0795F);


        this.cube_r54 = new AdvancedModelRenderer(this);
        this.cube_r54.setRotationPoint(0.5F, -1.9512F, 2.8276F);
        this.Tail2.addChild(cube_r54);
        this.setRotateAngle(cube_r54, -0.4538F, 0.0F, 0.0F);
        this.cube_r54.cubeList.add(new ModelBox(cube_r54, 14, 36, -0.5F, 0.3108F, 2.2266F, 0, 2, 1, 0.0F, false));
        this.cube_r54.cubeList.add(new ModelBox(cube_r54, 64, 53, -0.5F, 0.3108F, 0.2266F, 0, 2, 1, 0.0F, false));

        this.cube_r55 = new AdvancedModelRenderer(this);
        this.cube_r55.setRotationPoint(0.5F, -1.6512F, 0.2276F);
        this.Tail2.addChild(cube_r55);
        this.setRotateAngle(cube_r55, -0.0698F, 0.0F, 0.0F);
        this.cube_r55.cubeList.add(new ModelBox(cube_r55, 0, 65, -0.5F, -0.1F, -0.3F, 0, 2, 1, -0.001F, false));

        this.cube_r56 = new AdvancedModelRenderer(this);
        this.cube_r56.setRotationPoint(0.0F, 0.1488F, -0.0724F);
        this.Tail2.addChild(cube_r56);
        this.setRotateAngle(cube_r56, -0.0873F, 0.0F, 0.0F);
        this.cube_r56.cubeList.add(new ModelBox(cube_r56, 18, 28, -1.0F, -0.7F, -0.6F, 2, 2, 9, 0.0F, false));

        this.cube_r57 = new AdvancedModelRenderer(this);
        this.cube_r57.setRotationPoint(0.0F, 1.2488F, 0.2276F);
        this.Tail2.addChild(cube_r57);
        this.setRotateAngle(cube_r57, 0.6807F, 0.0F, 0.0F);
        this.cube_r57.cubeList.add(new ModelBox(cube_r57, 0, 31, 0.0F, 3.8113F, 3.6909F, 0, 2, 1, 0.001F, false));
        this.cube_r57.cubeList.add(new ModelBox(cube_r57, 26, 0, 0.0F, 1.8113F, 1.6909F, 0, 3, 1, 0.001F, false));

        this.cube_r58 = new AdvancedModelRenderer(this);
        this.cube_r58.setRotationPoint(0.0F, 1.2488F, 0.2276F);
        this.Tail2.addChild(cube_r58);
        this.setRotateAngle(cube_r58, 0.5934F, 0.0F, 0.0F);
        this.cube_r58.cubeList.add(new ModelBox(cube_r58, 9, 16, 0.0F, -0.0495F, -0.1618F, 0, 4, 1, 0.001F, false));

        this.Tail3 = new AdvancedModelRenderer(this);
        this.Tail3.setRotationPoint(0.0F, 1.0488F, 8.0276F);
        this.Tail2.addChild(Tail3);
        this.setRotateAngle(Tail3, 0.0616F, 0.1307F, 0.008F);


        this.cube_r59 = new AdvancedModelRenderer(this);
        this.cube_r59.setRotationPoint(0.0F, -0.3718F, 0.2961F);
        this.Tail3.addChild(cube_r59);
        this.setRotateAngle(cube_r59, -0.0436F, 0.0F, 0.0F);
        this.cube_r59.cubeList.add(new ModelBox(cube_r59, 0, 16, -0.5F, -0.5F, -0.2F, 1, 2, 12, 0.001F, false));

        this.cube_r60 = new AdvancedModelRenderer(this);
        this.cube_r60.setRotationPoint(0.0F, 0.1939F, 0.3002F);
        this.Tail3.addChild(cube_r60);
        this.setRotateAngle(cube_r60, 0.5236F, 0.0F, 0.0F);
        this.cube_r60.cubeList.add(new ModelBox(cube_r60, 14, 31, 0.0F, 3.3837F, 3.9633F, 0, 1, 1, 0.001F, false));
        this.cube_r60.cubeList.add(new ModelBox(cube_r60, 0, 8, 0.0F, 1.6837F, 1.9633F, 0, 2, 1, 0.001F, false));
        this.cube_r60.cubeList.add(new ModelBox(cube_r60, 15, 16, 0.0F, 0.3837F, -0.0367F, 0, 2, 1, 0.001F, false));

        this.Tail4 = new AdvancedModelRenderer(this);
        this.Tail4.setRotationPoint(0.0F, 0.2282F, 11.7961F);
        this.Tail3.addChild(Tail4);
        this.setRotateAngle(Tail4, -0.1745F, -0.0859F, 0.0152F);
        this.Tail4.cubeList.add(new ModelBox(Tail4, 0, 0, -0.5F, -0.5794F, -0.4069F, 1, 1, 14, 0.0F, false));

        this.tail5 = new AdvancedModelRenderer(this);
        this.tail5.setRotationPoint(0.0F, 0.0206F, 13.4931F);
        this.Tail4.addChild(tail5);
        this.setRotateAngle(tail5, -0.3054F, -0.1664F, 0.053F);
        this.tail5.cubeList.add(new ModelBox(tail5, 17, 0, -0.5F, -0.4142F, -0.7098F, 1, 1, 12, -0.01F, false));

        updateDefaultPose();
    }

    public void renderAll(float f) {
        this.resetToDefaultPose();
        this.Poposaurus.render(0.01f);
    }

    public void setRotateAngle(ModelRenderer modelRenderer, float x, float y, float z) {
        modelRenderer.rotateAngleX = x;
        modelRenderer.rotateAngleY = y;
        modelRenderer.rotateAngleZ = z;
    }

}
