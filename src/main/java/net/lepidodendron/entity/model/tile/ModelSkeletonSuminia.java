package net.lepidodendron.entity.model.tile;

import net.ilexiconn.llibrary.client.model.tools.AdvancedModelBase;
import net.ilexiconn.llibrary.client.model.tools.AdvancedModelRenderer;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;

public class ModelSkeletonSuminia extends AdvancedModelBase {
    private final AdvancedModelRenderer root;
    private final AdvancedModelRenderer Hips;
    private final AdvancedModelRenderer Hips_r1;
    private final AdvancedModelRenderer Hips_r2;
    private final AdvancedModelRenderer Hips_r3;
    private final AdvancedModelRenderer Hips_r4;
    private final AdvancedModelRenderer Hips_r5;
    private final AdvancedModelRenderer Hips_r6;
    private final AdvancedModelRenderer Hips_r7;
    private final AdvancedModelRenderer Tail1;
    private final AdvancedModelRenderer Tail4_r1;
    private final AdvancedModelRenderer Tail1_r1;
    private final AdvancedModelRenderer Tail2;
    private final AdvancedModelRenderer Tail8_r1;
    private final AdvancedModelRenderer Tail3;
    private final AdvancedModelRenderer Tail4;
    private final AdvancedModelRenderer Tail5;
    private final AdvancedModelRenderer Bodymiddle;
    private final AdvancedModelRenderer Neck_r1;
    private final AdvancedModelRenderer Neck_r2;
    private final AdvancedModelRenderer Neck_r3;
    private final AdvancedModelRenderer Neck_r4;
    private final AdvancedModelRenderer Neck_r5;
    private final AdvancedModelRenderer Neck_r6;
    private final AdvancedModelRenderer Neck_r7;
    private final AdvancedModelRenderer Neck_r8;
    private final AdvancedModelRenderer Neck_r9;
    private final AdvancedModelRenderer Neck_r10;
    private final AdvancedModelRenderer Neck_r11;
    private final AdvancedModelRenderer Neck_r12;
    private final AdvancedModelRenderer Neck_r13;
    private final AdvancedModelRenderer Neck_r14;
    private final AdvancedModelRenderer Neck_r15;
    private final AdvancedModelRenderer Neck_r16;
    private final AdvancedModelRenderer Neck_r17;
    private final AdvancedModelRenderer Neck_r18;
    private final AdvancedModelRenderer Neck_r19;
    private final AdvancedModelRenderer Neck_r20;
    private final AdvancedModelRenderer Bodyfront;
    private final AdvancedModelRenderer Neck_r21;
    private final AdvancedModelRenderer Neck_r22;
    private final AdvancedModelRenderer Neck_r23;
    private final AdvancedModelRenderer Neck_r24;
    private final AdvancedModelRenderer Neck_r25;
    private final AdvancedModelRenderer Neck_r26;
    private final AdvancedModelRenderer Neck_r27;
    private final AdvancedModelRenderer Neck_r28;
    private final AdvancedModelRenderer Neck_r29;
    private final AdvancedModelRenderer Neck_r30;
    private final AdvancedModelRenderer Bodyfront_r1;
    private final AdvancedModelRenderer Bodyfront_r2;
    private final AdvancedModelRenderer Bodyfront_r3;
    private final AdvancedModelRenderer Bodyfront_r4;
    private final AdvancedModelRenderer Bodyfront_r5;
    private final AdvancedModelRenderer Bodyfront_r6;
    private final AdvancedModelRenderer Neck_r31;
    private final AdvancedModelRenderer Neck_r32;
    private final AdvancedModelRenderer Neck_r33;
    private final AdvancedModelRenderer Neck_r34;
    private final AdvancedModelRenderer Neck_r35;
    private final AdvancedModelRenderer Neck_r36;
    private final AdvancedModelRenderer Neck_r37;
    private final AdvancedModelRenderer Neck_r38;
    private final AdvancedModelRenderer Neck_r39;
    private final AdvancedModelRenderer Neck_r40;
    private final AdvancedModelRenderer Neck;
    private final AdvancedModelRenderer Neck_r41;
    private final AdvancedModelRenderer Neck_r42;
    private final AdvancedModelRenderer Neck_r43;
    private final AdvancedModelRenderer Head;
    private final AdvancedModelRenderer Head_r1;
    private final AdvancedModelRenderer Head_r2;
    private final AdvancedModelRenderer Lowerjawbase;
    private final AdvancedModelRenderer Lowerjawbase_r1;
    private final AdvancedModelRenderer Lowerjawbase_r2;
    private final AdvancedModelRenderer Lowerjawmiddle;
    private final AdvancedModelRenderer Lowerjawmiddle_r1;
    private final AdvancedModelRenderer Lowerjawfront;
    private final AdvancedModelRenderer Lowerfrontteeth;
    private final AdvancedModelRenderer Lowermiddleteeth;
    private final AdvancedModelRenderer Lowerbackteeth;
    private final AdvancedModelRenderer Jawparting;
    private final AdvancedModelRenderer Upperjawback;
    private final AdvancedModelRenderer Upperjawfront;
    private final AdvancedModelRenderer Upperfrontteeth;
    private final AdvancedModelRenderer Uppermiddleteeth;
    private final AdvancedModelRenderer Upperbackteeth;
    private final AdvancedModelRenderer Browslope;
    private final AdvancedModelRenderer Snoutslope;
    private final AdvancedModelRenderer Rightupperarm;
    private final AdvancedModelRenderer Rightlowerarm;
    private final AdvancedModelRenderer Righthand;
    private final AdvancedModelRenderer Rightthumb;
    private final AdvancedModelRenderer Leftupperarm;
    private final AdvancedModelRenderer Leftlowerarm;
    private final AdvancedModelRenderer Lefthand;
    private final AdvancedModelRenderer Leftthumb;
    private final AdvancedModelRenderer Rightthigh;
    private final AdvancedModelRenderer Rightshin;
    private final AdvancedModelRenderer Righthindfoot;
    private final AdvancedModelRenderer Rightopposabletoe;
    private final AdvancedModelRenderer Leftthigh;
    private final AdvancedModelRenderer Leftshin;
    private final AdvancedModelRenderer Lefthindfoot;
    private final AdvancedModelRenderer Leftopposabletoe;

    public ModelSkeletonSuminia() {
        this.textureWidth = 75;
        this.textureHeight = 75;

        this.root = new AdvancedModelRenderer(this);
        this.root.setRotationPoint(0.0F, 0.0F, 0.0F);


        this.Hips = new AdvancedModelRenderer(this);
        this.Hips.setRotationPoint(0.0F, 14.7F, -1.0F);
        this.root.addChild(Hips);
        this.setRotateAngle(Hips, -0.6533F, 0.0F, 0.0F);


        this.Hips_r1 = new AdvancedModelRenderer(this);
        this.Hips_r1.setRotationPoint(-1.0F, -7.6941F, 8.5588F);
        this.Hips.addChild(Hips_r1);
        this.setRotateAngle(Hips_r1, -0.228F, -0.1298F, -0.4215F);
        this.Hips_r1.cubeList.add(new ModelBox(Hips_r1, 25, 29, -2.9868F, 2.961F, -2.6185F, 1, 4, 8, 0.001F, true));

        this.Hips_r2 = new AdvancedModelRenderer(this);
        this.Hips_r2.setRotationPoint(-1.0F, -7.6941F, 8.5588F);
        this.Hips.addChild(Hips_r2);
        this.setRotateAngle(Hips_r2, -0.2608F, -0.0226F, 0.003F);
        this.Hips_r2.cubeList.add(new ModelBox(Hips_r2, 16, 15, -1.4421F, 1.902F, -0.6185F, 1, 2, 4, 0.001F, true));

        this.Hips_r3 = new AdvancedModelRenderer(this);
        this.Hips_r3.setRotationPoint(-1.0F, -7.6941F, 8.5588F);
        this.Hips.addChild(Hips_r3);
        this.setRotateAngle(Hips_r3, -0.2597F, 0.0338F, 0.2138F);
        this.Hips_r3.cubeList.add(new ModelBox(Hips_r3, 49, 33, -0.9748F, 0.1096F, -0.6185F, 1, 2, 6, 0.001F, true));

        this.Hips_r4 = new AdvancedModelRenderer(this);
        this.Hips_r4.setRotationPoint(1.0F, -7.6941F, 8.5588F);
        this.Hips.addChild(Hips_r4);
        this.setRotateAngle(Hips_r4, -0.228F, 0.1298F, 0.4215F);
        this.Hips_r4.cubeList.add(new ModelBox(Hips_r4, 25, 29, 1.9868F, 2.961F, -2.6185F, 1, 4, 8, 0.001F, false));

        this.Hips_r5 = new AdvancedModelRenderer(this);
        this.Hips_r5.setRotationPoint(1.0F, -7.6941F, 8.5588F);
        this.Hips.addChild(Hips_r5);
        this.setRotateAngle(Hips_r5, -0.2608F, 0.0226F, -0.003F);
        this.Hips_r5.cubeList.add(new ModelBox(Hips_r5, 16, 15, 0.4421F, 1.902F, -0.6185F, 1, 2, 4, 0.001F, false));

        this.Hips_r6 = new AdvancedModelRenderer(this);
        this.Hips_r6.setRotationPoint(1.0F, -7.6941F, 8.5588F);
        this.Hips.addChild(Hips_r6);
        this.setRotateAngle(Hips_r6, -0.2597F, -0.0338F, -0.2138F);
        this.Hips_r6.cubeList.add(new ModelBox(Hips_r6, 49, 33, -0.0252F, 0.1096F, -0.6185F, 1, 2, 6, 0.001F, false));

        this.Hips_r7 = new AdvancedModelRenderer(this);
        this.Hips_r7.setRotationPoint(0.0F, -6.9941F, 5.5588F);
        this.Hips.addChild(Hips_r7);
        this.setRotateAngle(Hips_r7, -0.0873F, 0.0F, 0.0F);
        this.Hips_r7.cubeList.add(new ModelBox(Hips_r7, 34, 0, -1.0F, -1.2F, 0.0F, 2, 2, 8, 0.001F, false));

        this.Tail1 = new AdvancedModelRenderer(this);
        this.Tail1.setRotationPoint(0.0F, -6.4941F, 13.4588F);
        this.Hips.addChild(Tail1);
        this.setRotateAngle(Tail1, 0.3485F, 0.3296F, 0.1171F);


        this.Tail4_r1 = new AdvancedModelRenderer(this);
        this.Tail4_r1.setRotationPoint(0.0F, 1.3624F, 1.6402F);
        this.Tail1.addChild(Tail4_r1);
        this.setRotateAngle(Tail4_r1, 0.3491F, 0.0F, 0.0F);
        this.Tail4_r1.cubeList.add(new ModelBox(Tail4_r1, 49, 33, 0.0F, 1.9655F, 4.022F, 0, 4, 1, 0.0F, false));
        this.Tail4_r1.cubeList.add(new ModelBox(Tail4_r1, 43, 14, 0.0F, 0.9655F, 2.022F, 0, 3, 1, 0.0F, false));
        this.Tail4_r1.cubeList.add(new ModelBox(Tail4_r1, 23, 15, 0.0F, -0.0345F, 0.022F, 0, 2, 1, 0.0F, false));

        this.Tail1_r1 = new AdvancedModelRenderer(this);
        this.Tail1_r1.setRotationPoint(0.0F, 0.1624F, -0.3598F);
        this.Tail1.addChild(Tail1_r1);
        this.setRotateAngle(Tail1_r1, -0.1745F, 0.0F, 0.0F);
        this.Tail1_r1.cubeList.add(new ModelBox(Tail1_r1, 38, 11, -1.0F, -1.2F, 0.2F, 2, 2, 8, 0.0F, false));

        this.Tail2 = new AdvancedModelRenderer(this);
        this.Tail2.setRotationPoint(0.0F, 1.1624F, 7.5402F);
        this.Tail1.addChild(Tail2);
        this.setRotateAngle(Tail2, 0.245F, 0.4248F, 0.1027F);
        this.Tail2.cubeList.add(new ModelBox(Tail2, 0, 26, -1.0F, -0.7774F, -0.7406F, 2, 2, 10, -0.001F, false));

        this.Tail8_r1 = new AdvancedModelRenderer(this);
        this.Tail8_r1.setRotationPoint(0.0F, 1.2226F, 1.0594F);
        this.Tail2.addChild(Tail8_r1);
        this.setRotateAngle(Tail8_r1, 0.5672F, 0.0F, 0.0F);
        this.Tail8_r1.cubeList.add(new ModelBox(Tail8_r1, 0, 12, 0.0F, 2.7257F, 5.752F, 0, 2, 1, 0.0F, false));
        this.Tail8_r1.cubeList.add(new ModelBox(Tail8_r1, 7, 12, 0.0F, 1.7257F, 3.752F, 0, 2, 1, 0.0F, false));
        this.Tail8_r1.cubeList.add(new ModelBox(Tail8_r1, 25, 29, 0.0F, 0.7257F, 1.752F, 0, 3, 1, 0.0F, false));
        this.Tail8_r1.cubeList.add(new ModelBox(Tail8_r1, 0, 39, 0.0F, -0.2743F, -0.248F, 0, 3, 1, 0.0F, false));

        this.Tail3 = new AdvancedModelRenderer(this);
        this.Tail3.setRotationPoint(0.0F, -0.3774F, 8.7594F);
        this.Tail2.addChild(Tail3);
        this.setRotateAngle(Tail3, 0.0341F, 0.6542F, 0.0208F);
        this.Tail3.cubeList.add(new ModelBox(Tail3, 38, 22, -0.5F, -0.324F, -0.3927F, 1, 1, 9, 0.0F, false));

        this.Tail4 = new AdvancedModelRenderer(this);
        this.Tail4.setRotationPoint(0.0F, 0.176F, 8.3073F);
        this.Tail3.addChild(Tail4);
        this.setRotateAngle(Tail4, -0.2439F, 0.5107F, -0.121F);
        this.Tail4.cubeList.add(new ModelBox(Tail4, 29, 45, -0.5F, -0.4391F, 0.1893F, 1, 1, 7, 0.001F, false));

        this.Tail5 = new AdvancedModelRenderer(this);
        this.Tail5.setRotationPoint(0.0F, 0.0709F, 6.5893F);
        this.Tail4.addChild(Tail5);
        this.setRotateAngle(Tail5, -0.2486F, 0.8135F, -0.1824F);
        this.Tail5.cubeList.add(new ModelBox(Tail5, 46, 45, -0.5F, -0.4928F, -0.0845F, 1, 1, 7, 0.0F, false));

        this.Bodymiddle = new AdvancedModelRenderer(this);
        this.Bodymiddle.setRotationPoint(0.0F, -7.3941F, 5.6588F);
        this.Hips.addChild(Bodymiddle);
        this.setRotateAngle(Bodymiddle, 0.0424F, 0.0F, 0.0F);
        this.Bodymiddle.cubeList.add(new ModelBox(Bodymiddle, 0, 12, -1.0F, -0.8626F, -10.8347F, 2, 2, 11, 0.0F, false));

        this.Neck_r1 = new AdvancedModelRenderer(this);
        this.Neck_r1.setRotationPoint(-2.6F, 0.2818F, -0.2671F);
        this.Bodymiddle.addChild(Neck_r1);
        this.setRotateAngle(Neck_r1, -0.1212F, -0.09F, 0.422F);
        this.Neck_r1.cubeList.add(new ModelBox(Neck_r1, 3, 50, 0.334F, 0.9693F, -0.6274F, 0, 3, 1, 0.0F, true));

        this.Neck_r2 = new AdvancedModelRenderer(this);
        this.Neck_r2.setRotationPoint(-2.6F, 0.2818F, -0.2671F);
        this.Bodymiddle.addChild(Neck_r2);
        this.setRotateAngle(Neck_r2, -0.1504F, -0.0111F, 0.9846F);
        this.Neck_r2.cubeList.add(new ModelBox(Neck_r2, 38, 15, 0.8454F, -1.3939F, -0.6274F, 0, 2, 1, 0.0F, true));

        this.Neck_r3 = new AdvancedModelRenderer(this);
        this.Neck_r3.setRotationPoint(-2.6F, 0.2818F, -2.2671F);
        this.Bodymiddle.addChild(Neck_r3);
        this.setRotateAngle(Neck_r3, -0.0812F, -0.1078F, 0.4181F);
        this.Neck_r3.cubeList.add(new ModelBox(Neck_r3, 0, 50, 0.334F, 0.9693F, -0.6274F, 0, 4, 1, 0.0F, true));

        this.Neck_r4 = new AdvancedModelRenderer(this);
        this.Neck_r4.setRotationPoint(-2.6F, 0.2818F, -2.2671F);
        this.Bodymiddle.addChild(Neck_r4);
        this.setRotateAngle(Neck_r4, -0.1263F, -0.0474F, 0.9839F);
        this.Neck_r4.cubeList.add(new ModelBox(Neck_r4, 32, 42, 0.8454F, -1.3939F, -0.6274F, 0, 2, 1, 0.0F, true));

        this.Neck_r5 = new AdvancedModelRenderer(this);
        this.Neck_r5.setRotationPoint(-2.6F, 0.2818F, -4.2671F);
        this.Bodymiddle.addChild(Neck_r5);
        this.setRotateAngle(Neck_r5, -0.0812F, -0.1078F, 0.4181F);
        this.Neck_r5.cubeList.add(new ModelBox(Neck_r5, 16, 12, 0.334F, 0.9693F, -0.6274F, 0, 5, 1, 0.0F, true));

        this.Neck_r6 = new AdvancedModelRenderer(this);
        this.Neck_r6.setRotationPoint(-2.6F, 0.2818F, -4.2671F);
        this.Bodymiddle.addChild(Neck_r6);
        this.setRotateAngle(Neck_r6, -0.1263F, -0.0474F, 0.9839F);
        this.Neck_r6.cubeList.add(new ModelBox(Neck_r6, 39, 45, 0.8454F, -1.3939F, -0.6274F, 0, 2, 1, 0.0F, true));

        this.Neck_r7 = new AdvancedModelRenderer(this);
        this.Neck_r7.setRotationPoint(-2.6F, 0.2818F, -6.2671F);
        this.Bodymiddle.addChild(Neck_r7);
        this.setRotateAngle(Neck_r7, -0.0006F, -0.1428F, 0.408F);
        this.Neck_r7.cubeList.add(new ModelBox(Neck_r7, 59, 59, 0.334F, 0.9693F, -0.6274F, 0, 5, 1, 0.0F, true));

        this.Neck_r8 = new AdvancedModelRenderer(this);
        this.Neck_r8.setRotationPoint(-2.6F, 0.2818F, -6.2671F);
        this.Bodymiddle.addChild(Neck_r8);
        this.setRotateAngle(Neck_r8, -0.0776F, -0.12F, 0.9798F);
        this.Neck_r8.cubeList.add(new ModelBox(Neck_r8, 47, 0, 0.8454F, -1.3939F, -0.6274F, 0, 2, 1, 0.0F, true));

        this.Neck_r9 = new AdvancedModelRenderer(this);
        this.Neck_r9.setRotationPoint(-2.6F, 0.2818F, -8.2671F);
        this.Bodymiddle.addChild(Neck_r9);
        this.setRotateAngle(Neck_r9, -0.0776F, -0.12F, 0.9798F);
        this.Neck_r9.cubeList.add(new ModelBox(Neck_r9, 48, 45, 0.8454F, -1.3939F, -0.6274F, 0, 2, 1, 0.0F, true));

        this.Neck_r10 = new AdvancedModelRenderer(this);
        this.Neck_r10.setRotationPoint(-2.6F, 0.2818F, -8.2671F);
        this.Bodymiddle.addChild(Neck_r10);
        this.setRotateAngle(Neck_r10, -0.0006F, -0.1428F, 0.408F);
        this.Neck_r10.cubeList.add(new ModelBox(Neck_r10, 15, 26, 0.334F, 0.9693F, -0.6274F, 0, 6, 1, 0.0F, true));

        this.Neck_r11 = new AdvancedModelRenderer(this);
        this.Neck_r11.setRotationPoint(2.6F, 0.2818F, -0.2671F);
        this.Bodymiddle.addChild(Neck_r11);
        this.setRotateAngle(Neck_r11, -0.1504F, 0.0111F, -0.9846F);
        this.Neck_r11.cubeList.add(new ModelBox(Neck_r11, 38, 15, -0.8454F, -1.3939F, -0.6274F, 0, 2, 1, 0.0F, false));

        this.Neck_r12 = new AdvancedModelRenderer(this);
        this.Neck_r12.setRotationPoint(2.6F, 0.2818F, -0.2671F);
        this.Bodymiddle.addChild(Neck_r12);
        this.setRotateAngle(Neck_r12, -0.1212F, 0.09F, -0.422F);
        this.Neck_r12.cubeList.add(new ModelBox(Neck_r12, 3, 50, -0.334F, 0.9693F, -0.6274F, 0, 3, 1, 0.0F, false));

        this.Neck_r13 = new AdvancedModelRenderer(this);
        this.Neck_r13.setRotationPoint(2.6F, 0.2818F, -2.2671F);
        this.Bodymiddle.addChild(Neck_r13);
        this.setRotateAngle(Neck_r13, -0.0812F, 0.1078F, -0.4181F);
        this.Neck_r13.cubeList.add(new ModelBox(Neck_r13, 0, 50, -0.334F, 0.9693F, -0.6274F, 0, 4, 1, 0.0F, false));

        this.Neck_r14 = new AdvancedModelRenderer(this);
        this.Neck_r14.setRotationPoint(2.6F, 0.2818F, -2.2671F);
        this.Bodymiddle.addChild(Neck_r14);
        this.setRotateAngle(Neck_r14, -0.1263F, 0.0474F, -0.9839F);
        this.Neck_r14.cubeList.add(new ModelBox(Neck_r14, 32, 42, -0.8454F, -1.3939F, -0.6274F, 0, 2, 1, 0.0F, false));

        this.Neck_r15 = new AdvancedModelRenderer(this);
        this.Neck_r15.setRotationPoint(2.6F, 0.2818F, -4.2671F);
        this.Bodymiddle.addChild(Neck_r15);
        this.setRotateAngle(Neck_r15, -0.0812F, 0.1078F, -0.4181F);
        this.Neck_r15.cubeList.add(new ModelBox(Neck_r15, 16, 12, -0.334F, 0.9693F, -0.6274F, 0, 5, 1, 0.0F, false));

        this.Neck_r16 = new AdvancedModelRenderer(this);
        this.Neck_r16.setRotationPoint(2.6F, 0.2818F, -4.2671F);
        this.Bodymiddle.addChild(Neck_r16);
        this.setRotateAngle(Neck_r16, -0.1263F, 0.0474F, -0.9839F);
        this.Neck_r16.cubeList.add(new ModelBox(Neck_r16, 39, 45, -0.8454F, -1.3939F, -0.6274F, 0, 2, 1, 0.0F, false));

        this.Neck_r17 = new AdvancedModelRenderer(this);
        this.Neck_r17.setRotationPoint(2.6F, 0.2818F, -6.2671F);
        this.Bodymiddle.addChild(Neck_r17);
        this.setRotateAngle(Neck_r17, -0.0776F, 0.12F, -0.9798F);
        this.Neck_r17.cubeList.add(new ModelBox(Neck_r17, 47, 0, -0.8454F, -1.3939F, -0.6274F, 0, 2, 1, 0.0F, false));

        this.Neck_r18 = new AdvancedModelRenderer(this);
        this.Neck_r18.setRotationPoint(2.6F, 0.2818F, -6.2671F);
        this.Bodymiddle.addChild(Neck_r18);
        this.setRotateAngle(Neck_r18, -0.0006F, 0.1428F, -0.408F);
        this.Neck_r18.cubeList.add(new ModelBox(Neck_r18, 59, 59, -0.334F, 0.9693F, -0.6274F, 0, 5, 1, 0.0F, false));

        this.Neck_r19 = new AdvancedModelRenderer(this);
        this.Neck_r19.setRotationPoint(2.6F, 0.2818F, -8.2671F);
        this.Bodymiddle.addChild(Neck_r19);
        this.setRotateAngle(Neck_r19, -0.0776F, 0.12F, -0.9798F);
        this.Neck_r19.cubeList.add(new ModelBox(Neck_r19, 48, 45, -0.8454F, -1.3939F, -0.6274F, 0, 2, 1, 0.0F, false));

        this.Neck_r20 = new AdvancedModelRenderer(this);
        this.Neck_r20.setRotationPoint(2.6F, 0.2818F, -8.2671F);
        this.Bodymiddle.addChild(Neck_r20);
        this.setRotateAngle(Neck_r20, -0.0006F, 0.1428F, -0.408F);
        this.Neck_r20.cubeList.add(new ModelBox(Neck_r20, 15, 26, -0.334F, 0.9693F, -0.6274F, 0, 6, 1, 0.0F, false));

        this.Bodyfront = new AdvancedModelRenderer(this);
        this.Bodyfront.setRotationPoint(0.0F, -0.1626F, -10.1347F);
        this.Bodymiddle.addChild(Bodyfront);
        this.setRotateAngle(Bodyfront, 0.2806F, 0.0F, 0.0F);


        this.Neck_r21 = new AdvancedModelRenderer(this);
        this.Neck_r21.setRotationPoint(-2.6F, 0.6404F, -0.2066F);
        this.Bodyfront.addChild(Neck_r21);
        this.setRotateAngle(Neck_r21, -0.0006F, -0.1428F, 0.408F);
        this.Neck_r21.cubeList.add(new ModelBox(Neck_r21, 30, 29, 0.334F, 0.9693F, -0.6274F, 0, 6, 1, 0.0F, true));

        this.Neck_r22 = new AdvancedModelRenderer(this);
        this.Neck_r22.setRotationPoint(-2.6F, 0.6404F, -0.2066F);
        this.Bodyfront.addChild(Neck_r22);
        this.setRotateAngle(Neck_r22, -0.0776F, -0.12F, 0.9798F);
        this.Neck_r22.cubeList.add(new ModelBox(Neck_r22, 12, 50, 0.8454F, -1.3939F, -0.6274F, 0, 2, 1, 0.0F, true));

        this.Neck_r23 = new AdvancedModelRenderer(this);
        this.Neck_r23.setRotationPoint(-2.6F, 0.6404F, -2.2066F);
        this.Bodyfront.addChild(Neck_r23);
        this.setRotateAngle(Neck_r23, 0.0807F, -0.1769F, 0.395F);
        this.Neck_r23.cubeList.add(new ModelBox(Neck_r23, 9, 59, 0.334F, 0.9693F, -0.6274F, 0, 6, 1, 0.0F, true));

        this.Neck_r24 = new AdvancedModelRenderer(this);
        this.Neck_r24.setRotationPoint(-2.6F, 0.6404F, -2.2066F);
        this.Bodyfront.addChild(Neck_r24);
        this.setRotateAngle(Neck_r24, -0.0281F, -0.1923F, 0.9721F);
        this.Neck_r24.cubeList.add(new ModelBox(Neck_r24, 50, 22, 0.8454F, -1.3939F, -0.6274F, 0, 2, 1, 0.0F, true));

        this.Neck_r25 = new AdvancedModelRenderer(this);
        this.Neck_r25.setRotationPoint(-2.6F, 1.0404F, -4.2066F);
        this.Bodyfront.addChild(Neck_r25);
        this.setRotateAngle(Neck_r25, 0.1631F, -0.2099F, 0.3792F);
        this.Neck_r25.cubeList.add(new ModelBox(Neck_r25, 12, 59, 0.334F, 0.9693F, -0.6274F, 0, 6, 1, 0.0F, true));

        this.Neck_r26 = new AdvancedModelRenderer(this);
        this.Neck_r26.setRotationPoint(-2.6F, 1.0404F, -4.2066F);
        this.Bodyfront.addChild(Neck_r26);
        this.setRotateAngle(Neck_r26, 0.0228F, -0.2641F, 0.9606F);
        this.Neck_r26.cubeList.add(new ModelBox(Neck_r26, 52, 33, 0.8454F, -1.3939F, -0.6274F, 0, 2, 1, 0.0F, true));

        this.Neck_r27 = new AdvancedModelRenderer(this);
        this.Neck_r27.setRotationPoint(-2.6F, 1.3404F, -6.2066F);
        this.Bodyfront.addChild(Neck_r27);
        this.setRotateAngle(Neck_r27, 0.2466F, -0.2415F, 0.3605F);
        this.Neck_r27.cubeList.add(new ModelBox(Neck_r27, 61, 19, 0.334F, 0.9693F, -0.6274F, 0, 5, 1, 0.0F, true));

        this.Neck_r28 = new AdvancedModelRenderer(this);
        this.Neck_r28.setRotationPoint(-2.6F, 1.3404F, -6.2066F);
        this.Bodyfront.addChild(Neck_r28);
        this.setRotateAngle(Neck_r28, 0.0757F, -0.3352F, 0.945F);
        this.Neck_r28.cubeList.add(new ModelBox(Neck_r28, 58, 0, 0.8454F, -1.3939F, -0.6274F, 0, 2, 1, 0.0F, true));

        this.Neck_r29 = new AdvancedModelRenderer(this);
        this.Neck_r29.setRotationPoint(-2.6F, 3.0404F, -8.2066F);
        this.Bodyfront.addChild(Neck_r29);
        this.setRotateAngle(Neck_r29, 0.4611F, -0.3126F, 0.3016F);
        this.Neck_r29.cubeList.add(new ModelBox(Neck_r29, 58, 35, -0.0334F, -0.0895F, 0.0312F, 0, 2, 1, 0.0F, true));

        this.Neck_r30 = new AdvancedModelRenderer(this);
        this.Neck_r30.setRotationPoint(-1.0F, 1.6404F, -8.2066F);
        this.Bodyfront.addChild(Neck_r30);
        this.setRotateAngle(Neck_r30, 0.2213F, -0.5085F, 0.885F);
        this.Neck_r30.cubeList.add(new ModelBox(Neck_r30, 59, 28, 0.028F, -0.024F, -0.4687F, 0, 2, 1, 0.0F, true));

        this.Bodyfront_r1 = new AdvancedModelRenderer(this);
        this.Bodyfront_r1.setRotationPoint(0.0F, 9.3961F, -11.3741F);
        this.Bodyfront.addChild(Bodyfront_r1);
        this.setRotateAngle(Bodyfront_r1, -0.3054F, 0.0F, 0.0F);
        this.Bodyfront_r1.cubeList.add(new ModelBox(Bodyfront_r1, 50, 22, -2.0F, -2.157F, -0.0251F, 3, 1, 4, 0.001F, true));
        this.Bodyfront_r1.cubeList.add(new ModelBox(Bodyfront_r1, 50, 22, -1.0F, -2.157F, -0.0251F, 3, 1, 4, 0.0F, false));

        this.Bodyfront_r2 = new AdvancedModelRenderer(this);
        this.Bodyfront_r2.setRotationPoint(-3.0F, 1.5961F, -3.0741F);
        this.Bodyfront.addChild(Bodyfront_r2);
        this.setRotateAngle(Bodyfront_r2, 1.2828F, 0.103F, 0.3341F);
        this.Bodyfront_r2.cubeList.add(new ModelBox(Bodyfront_r2, 0, 50, -0.3F, -4.4101F, -5.9734F, 1, 2, 6, 0.001F, true));

        this.Bodyfront_r3 = new AdvancedModelRenderer(this);
        this.Bodyfront_r3.setRotationPoint(-5.0F, 6.5961F, -7.0741F);
        this.Bodyfront.addChild(Bodyfront_r3);
        this.setRotateAngle(Bodyfront_r3, 1.3919F, -0.2489F, -0.9375F);
        this.Bodyfront_r3.cubeList.add(new ModelBox(Bodyfront_r3, 0, 12, -0.463F, -3.0988F, -3.678F, 1, 5, 4, 0.001F, true));

        this.Bodyfront_r4 = new AdvancedModelRenderer(this);
        this.Bodyfront_r4.setRotationPoint(5.0F, 6.5961F, -7.0741F);
        this.Bodyfront.addChild(Bodyfront_r4);
        this.setRotateAngle(Bodyfront_r4, 1.3919F, 0.2489F, 0.9375F);
        this.Bodyfront_r4.cubeList.add(new ModelBox(Bodyfront_r4, 0, 12, -0.537F, -3.0988F, -3.678F, 1, 5, 4, 0.001F, false));

        this.Bodyfront_r5 = new AdvancedModelRenderer(this);
        this.Bodyfront_r5.setRotationPoint(3.0F, 1.5961F, -3.0741F);
        this.Bodyfront.addChild(Bodyfront_r5);
        this.setRotateAngle(Bodyfront_r5, 1.2828F, -0.103F, -0.3341F);
        this.Bodyfront_r5.cubeList.add(new ModelBox(Bodyfront_r5, 0, 50, -0.7F, -4.4101F, -5.9734F, 1, 2, 6, 0.001F, false));

        this.Bodyfront_r6 = new AdvancedModelRenderer(this);
        this.Bodyfront_r6.setRotationPoint(0.0F, 1.5961F, -10.0741F);
        this.Bodyfront.addChild(Bodyfront_r6);
        this.setRotateAngle(Bodyfront_r6, 0.0873F, 0.0F, 0.0F);
        this.Bodyfront_r6.cubeList.add(new ModelBox(Bodyfront_r6, 19, 2, -1.0F, -1.5F, 0.0F, 2, 2, 10, 0.001F, false));

        this.Neck_r31 = new AdvancedModelRenderer(this);
        this.Neck_r31.setRotationPoint(2.6F, 0.6404F, -0.2066F);
        this.Bodyfront.addChild(Neck_r31);
        this.setRotateAngle(Neck_r31, -0.0776F, 0.12F, -0.9798F);
        this.Neck_r31.cubeList.add(new ModelBox(Neck_r31, 12, 50, -0.8454F, -1.3939F, -0.6274F, 0, 2, 1, 0.0F, false));

        this.Neck_r32 = new AdvancedModelRenderer(this);
        this.Neck_r32.setRotationPoint(2.6F, 0.6404F, -0.2066F);
        this.Bodyfront.addChild(Neck_r32);
        this.setRotateAngle(Neck_r32, -0.0006F, 0.1428F, -0.408F);
        this.Neck_r32.cubeList.add(new ModelBox(Neck_r32, 30, 29, -0.334F, 0.9693F, -0.6274F, 0, 6, 1, 0.0F, false));

        this.Neck_r33 = new AdvancedModelRenderer(this);
        this.Neck_r33.setRotationPoint(2.6F, 0.6404F, -2.2066F);
        this.Bodyfront.addChild(Neck_r33);
        this.setRotateAngle(Neck_r33, 0.0807F, 0.1769F, -0.395F);
        this.Neck_r33.cubeList.add(new ModelBox(Neck_r33, 9, 59, -0.334F, 0.9693F, -0.6274F, 0, 6, 1, 0.0F, false));

        this.Neck_r34 = new AdvancedModelRenderer(this);
        this.Neck_r34.setRotationPoint(2.6F, 0.6404F, -2.2066F);
        this.Bodyfront.addChild(Neck_r34);
        this.setRotateAngle(Neck_r34, -0.0281F, 0.1923F, -0.9721F);
        this.Neck_r34.cubeList.add(new ModelBox(Neck_r34, 50, 22, -0.8454F, -1.3939F, -0.6274F, 0, 2, 1, 0.0F, false));

        this.Neck_r35 = new AdvancedModelRenderer(this);
        this.Neck_r35.setRotationPoint(2.6F, 1.0404F, -4.2066F);
        this.Bodyfront.addChild(Neck_r35);
        this.setRotateAngle(Neck_r35, 0.1631F, 0.2099F, -0.3792F);
        this.Neck_r35.cubeList.add(new ModelBox(Neck_r35, 12, 59, -0.334F, 0.9693F, -0.6274F, 0, 6, 1, 0.0F, false));

        this.Neck_r36 = new AdvancedModelRenderer(this);
        this.Neck_r36.setRotationPoint(2.6F, 1.0404F, -4.2066F);
        this.Bodyfront.addChild(Neck_r36);
        this.setRotateAngle(Neck_r36, 0.0228F, 0.2641F, -0.9606F);
        this.Neck_r36.cubeList.add(new ModelBox(Neck_r36, 52, 33, -0.8454F, -1.3939F, -0.6274F, 0, 2, 1, 0.0F, false));

        this.Neck_r37 = new AdvancedModelRenderer(this);
        this.Neck_r37.setRotationPoint(2.6F, 1.3404F, -6.2066F);
        this.Bodyfront.addChild(Neck_r37);
        this.setRotateAngle(Neck_r37, 0.0757F, 0.3352F, -0.945F);
        this.Neck_r37.cubeList.add(new ModelBox(Neck_r37, 58, 0, -0.8454F, -1.3939F, -0.6274F, 0, 2, 1, 0.0F, false));

        this.Neck_r38 = new AdvancedModelRenderer(this);
        this.Neck_r38.setRotationPoint(2.6F, 1.3404F, -6.2066F);
        this.Bodyfront.addChild(Neck_r38);
        this.setRotateAngle(Neck_r38, 0.2466F, 0.2415F, -0.3605F);
        this.Neck_r38.cubeList.add(new ModelBox(Neck_r38, 61, 19, -0.334F, 0.9693F, -0.6274F, 0, 5, 1, 0.0F, false));

        this.Neck_r39 = new AdvancedModelRenderer(this);
        this.Neck_r39.setRotationPoint(2.6F, 3.0404F, -8.2066F);
        this.Bodyfront.addChild(Neck_r39);
        this.setRotateAngle(Neck_r39, 0.4611F, 0.3126F, -0.3016F);
        this.Neck_r39.cubeList.add(new ModelBox(Neck_r39, 58, 35, 0.0334F, -0.0895F, 0.0312F, 0, 2, 1, 0.0F, false));

        this.Neck_r40 = new AdvancedModelRenderer(this);
        this.Neck_r40.setRotationPoint(1.0F, 1.6404F, -8.2066F);
        this.Bodyfront.addChild(Neck_r40);
        this.setRotateAngle(Neck_r40, 0.2213F, 0.5085F, -0.885F);
        this.Neck_r40.cubeList.add(new ModelBox(Neck_r40, 59, 28, -0.028F, -0.024F, -0.4687F, 0, 2, 1, 0.0F, false));

        this.Neck = new AdvancedModelRenderer(this);
        this.Neck.setRotationPoint(0.0F, 0.5961F, -9.2741F);
        this.Bodyfront.addChild(Neck);
        this.setRotateAngle(Neck, -0.8786F, 0.0F, 0.0F);


        this.Neck_r41 = new AdvancedModelRenderer(this);
        this.Neck_r41.setRotationPoint(-1.0F, 1.5831F, -3.0281F);
        this.Neck.addChild(Neck_r41);
        this.setRotateAngle(Neck_r41, 1.0954F, -0.2729F, 0.2204F);
        this.Neck_r41.cubeList.add(new ModelBox(Neck_r41, 9, 50, 0.601F, 1.9214F, 1.0324F, 0, 3, 1, 0.0F, true));
        this.Neck_r41.cubeList.add(new ModelBox(Neck_r41, 61, 13, 0.0F, 0.0099F, 0.04F, 0, 2, 1, 0.0F, true));

        this.Neck_r42 = new AdvancedModelRenderer(this);
        this.Neck_r42.setRotationPoint(1.0F, 1.5831F, -3.0281F);
        this.Neck.addChild(Neck_r42);
        this.setRotateAngle(Neck_r42, 1.0954F, 0.2729F, -0.2204F);
        this.Neck_r42.cubeList.add(new ModelBox(Neck_r42, 9, 50, -0.601F, 1.9214F, 1.0324F, 0, 3, 1, 0.0F, false));
        this.Neck_r42.cubeList.add(new ModelBox(Neck_r42, 61, 13, 0.0F, 0.0099F, 0.04F, 0, 2, 1, 0.0F, false));

        this.Neck_r43 = new AdvancedModelRenderer(this);
        this.Neck_r43.setRotationPoint(0.0F, 0.4831F, -5.6281F);
        this.Neck.addChild(Neck_r43);
        this.setRotateAngle(Neck_r43, 0.0349F, 0.0F, 0.0F);
        this.Neck_r43.cubeList.add(new ModelBox(Neck_r43, 36, 34, -1.0F, -0.8F, -1.9F, 2, 2, 8, 0.0F, false));

        this.Head = new AdvancedModelRenderer(this);
        this.Head.setRotationPoint(-0.01F, 0.5831F, -6.0281F);
        this.Neck.addChild(Head);
        this.setRotateAngle(Head, 1.0779F, 0.0F, 0.0F);
        this.Head.cubeList.add(new ModelBox(Head, 0, 39, -2.0F, -3.2321F, -4.6351F, 4, 5, 5, 0.0F, false));

        this.Head_r1 = new AdvancedModelRenderer(this);
        this.Head_r1.setRotationPoint(-1.99F, 0.5679F, -4.7351F);
        this.Head.addChild(Head_r1);
        this.setRotateAngle(Head_r1, 0.3551F, -0.2106F, -0.0573F);
        this.Head_r1.cubeList.add(new ModelBox(Head_r1, 15, 29, -0.39F, -0.4F, 0.1F, 2, 1, 5, 0.0F, true));

        this.Head_r2 = new AdvancedModelRenderer(this);
        this.Head_r2.setRotationPoint(2.01F, 0.5679F, -4.7351F);
        this.Head.addChild(Head_r2);
        this.setRotateAngle(Head_r2, 0.3551F, 0.2106F, 0.0573F);
        this.Head_r2.cubeList.add(new ModelBox(Head_r2, 15, 29, -1.61F, -0.4F, 0.1F, 2, 1, 5, 0.0F, false));

        this.Lowerjawbase = new AdvancedModelRenderer(this);
        this.Lowerjawbase.setRotationPoint(0.0F, 1.7679F, 0.3649F);
        this.Head.addChild(Lowerjawbase);
        this.setRotateAngle(Lowerjawbase, 0.4363F, 0.0F, 0.0F);
        this.Lowerjawbase.cubeList.add(new ModelBox(Lowerjawbase, 0, 0, 1.5F, 0.0F, -5.0F, 1, 2, 3, 0.0F, false));
        this.Lowerjawbase.cubeList.add(new ModelBox(Lowerjawbase, 34, 0, 1.5F, 0.0F, -2.0F, 1, 3, 2, 0.0F, false));
        this.Lowerjawbase.cubeList.add(new ModelBox(Lowerjawbase, 34, 0, -2.48F, 0.0F, -2.0F, 1, 3, 2, 0.0F, true));
        this.Lowerjawbase.cubeList.add(new ModelBox(Lowerjawbase, 0, 0, -2.48F, 0.0F, -5.0F, 1, 2, 3, 0.0F, true));

        this.Lowerjawbase_r1 = new AdvancedModelRenderer(this);
        this.Lowerjawbase_r1.setRotationPoint(-0.99F, 3.8F, -0.1F);
        this.Lowerjawbase.addChild(Lowerjawbase_r1);
        this.setRotateAngle(Lowerjawbase_r1, -0.2182F, -0.2007F, 0.0F);
        this.Lowerjawbase_r1.cubeList.add(new ModelBox(Lowerjawbase_r1, 51, 7, 0.01F, -1.6F, -5.6F, 0, 1, 5, 0.0F, true));

        this.Lowerjawbase_r2 = new AdvancedModelRenderer(this);
        this.Lowerjawbase_r2.setRotationPoint(1.01F, 3.8F, -0.1F);
        this.Lowerjawbase.addChild(Lowerjawbase_r2);
        this.setRotateAngle(Lowerjawbase_r2, -0.2182F, 0.2007F, 0.0F);
        this.Lowerjawbase_r2.cubeList.add(new ModelBox(Lowerjawbase_r2, 51, 7, -0.01F, -1.6F, -5.6F, 0, 1, 5, 0.0F, false));

        this.Lowerjawmiddle = new AdvancedModelRenderer(this);
        this.Lowerjawmiddle.setRotationPoint(0.0F, 0.0F, -4.9F);
        this.Lowerjawbase.addChild(Lowerjawmiddle);
        this.setRotateAngle(Lowerjawmiddle, 0.0637F, 0.0F, 0.0F);
        this.Lowerjawmiddle.cubeList.add(new ModelBox(Lowerjawmiddle, 20, 0, 1.0F, 0.0F, -3.0F, 1, 2, 3, 0.0F, false));
        this.Lowerjawmiddle.cubeList.add(new ModelBox(Lowerjawmiddle, 20, 0, -1.98F, 0.0F, -3.0F, 1, 2, 3, 0.0F, true));

        this.Lowerjawmiddle_r1 = new AdvancedModelRenderer(this);
        this.Lowerjawmiddle_r1.setRotationPoint(0.01F, 1.8F, -0.3F);
        this.Lowerjawmiddle.addChild(Lowerjawmiddle_r1);
        this.setRotateAngle(Lowerjawmiddle_r1, 0.384F, 0.0F, 0.0F);
        this.Lowerjawmiddle_r1.cubeList.add(new ModelBox(Lowerjawmiddle_r1, 14, 39, -1.99F, -0.8F, -2.7F, 1, 1, 3, -0.001F, true));
        this.Lowerjawmiddle_r1.cubeList.add(new ModelBox(Lowerjawmiddle_r1, 14, 39, 0.99F, -0.8F, -2.7F, 1, 1, 3, -0.001F, false));

        this.Lowerjawfront = new AdvancedModelRenderer(this);
        this.Lowerjawfront.setRotationPoint(0.0F, 0.0F, -3.0F);
        this.Lowerjawmiddle.addChild(Lowerjawfront);
        this.setRotateAngle(Lowerjawfront, 0.0848F, 0.0F, 0.0F);
        this.Lowerjawfront.cubeList.add(new ModelBox(Lowerjawfront, 52, 59, 0.5F, 0.0F, -2.0F, 1, 3, 2, 0.0F, false));
        this.Lowerjawfront.cubeList.add(new ModelBox(Lowerjawfront, 52, 59, -1.48F, 0.0F, -2.0F, 1, 3, 2, 0.0F, true));
        this.Lowerjawfront.cubeList.add(new ModelBox(Lowerjawfront, 56, 47, -1.5F, 0.0F, -3.0F, 3, 3, 1, 0.0F, false));

        this.Lowerfrontteeth = new AdvancedModelRenderer(this);
        this.Lowerfrontteeth.setRotationPoint(0.01F, 0.1F, -2.6F);
        this.Lowerjawfront.addChild(Lowerfrontteeth);
        this.setRotateAngle(Lowerfrontteeth, 0.0637F, 0.0F, 0.0F);
        this.Lowerfrontteeth.cubeList.add(new ModelBox(Lowerfrontteeth, 0, 6, -1.0F, -1.0F, 0.0F, 2, 1, 1, 0.0F, false));
        this.Lowerfrontteeth.cubeList.add(new ModelBox(Lowerfrontteeth, 0, 6, -1.0F, -1.4F, 0.0F, 2, 1, 1, 0.0F, false));

        this.Lowermiddleteeth = new AdvancedModelRenderer(this);
        this.Lowermiddleteeth.setRotationPoint(-0.01F, 0.2F, -1.6F);
        this.Lowerjawfront.addChild(Lowermiddleteeth);
        this.setRotateAngle(Lowermiddleteeth, -0.0848F, 0.0F, 0.0F);
        this.Lowermiddleteeth.cubeList.add(new ModelBox(Lowermiddleteeth, 38, 22, -1.0F, -1.0F, 0.0F, 2, 1, 2, 0.0F, false));

        this.Lowerbackteeth = new AdvancedModelRenderer(this);
        this.Lowerbackteeth.setRotationPoint(0.01F, 0.2F, -2.7F);
        this.Lowerjawmiddle.addChild(Lowerbackteeth);
        this.setRotateAngle(Lowerbackteeth, -0.1698F, 0.0F, 0.0F);
        this.Lowerbackteeth.cubeList.add(new ModelBox(Lowerbackteeth, 56, 42, -1.5F, -1.0F, 0.0F, 3, 1, 3, 0.0F, false));

        this.Jawparting = new AdvancedModelRenderer(this);
        this.Jawparting.setRotationPoint(0.0F, 0.1F, -5.0F);
        this.Lowerjawbase.addChild(Jawparting);
        this.setRotateAngle(Jawparting, -0.4882F, 0.0F, 0.0F);


        this.Upperjawback = new AdvancedModelRenderer(this);
        this.Upperjawback.setRotationPoint(0.01F, -2.2321F, -4.5051F);
        this.Head.addChild(Upperjawback);
        this.setRotateAngle(Upperjawback, 0.0637F, 0.0F, 0.0F);
        this.Upperjawback.cubeList.add(new ModelBox(Upperjawback, 19, 42, -2.0F, 0.0F, -3.3F, 4, 4, 4, 0.0F, false));

        this.Upperjawfront = new AdvancedModelRenderer(this);
        this.Upperjawfront.setRotationPoint(0.0F, 2.0F, -3.46F);
        this.Upperjawback.addChild(Upperjawfront);
        this.setRotateAngle(Upperjawfront, 0.0848F, 0.0F, 0.0F);
        this.Upperjawfront.cubeList.add(new ModelBox(Upperjawfront, 47, 0, -1.5F, 0.0F, -3.0F, 3, 2, 4, 0.0F, false));

        this.Upperfrontteeth = new AdvancedModelRenderer(this);
        this.Upperfrontteeth.setRotationPoint(-0.01F, 0.7F, -1.9F);
        this.Upperjawfront.addChild(Upperfrontteeth);
        this.setRotateAngle(Upperfrontteeth, -0.5732F, 0.0F, 0.0F);
        this.Upperfrontteeth.cubeList.add(new ModelBox(Upperfrontteeth, 36, 33, -1.0F, 1.0F, -0.2F, 2, 2, 1, 0.0F, false));

        this.Uppermiddleteeth = new AdvancedModelRenderer(this);
        this.Uppermiddleteeth.setRotationPoint(0.01F, 1.0F, -1.7F);
        this.Upperjawfront.addChild(Uppermiddleteeth);
        this.setRotateAngle(Uppermiddleteeth, -0.0848F, 0.0F, 0.0F);
        this.Uppermiddleteeth.cubeList.add(new ModelBox(Uppermiddleteeth, 0, 59, -1.0F, 0.2F, 0.0F, 2, 2, 2, 0.0F, false));

        this.Upperbackteeth = new AdvancedModelRenderer(this);
        this.Upperbackteeth.setRotationPoint(-0.01F, 3.9F, -3.2F);
        this.Upperjawback.addChild(Upperbackteeth);
        this.setRotateAngle(Upperbackteeth, 0.1274F, 0.0F, 0.0F);
        this.Upperbackteeth.cubeList.add(new ModelBox(Upperbackteeth, 52, 54, -1.5F, 0.0F, 0.0F, 3, 1, 3, 0.0F, false));

        this.Browslope = new AdvancedModelRenderer(this);
        this.Browslope.setRotationPoint(0.0F, -3.2321F, -4.6351F);
        this.Head.addChild(Browslope);
        this.setRotateAngle(Browslope, 0.2546F, 0.0F, 0.0F);
        this.Browslope.cubeList.add(new ModelBox(Browslope, 51, 14, -1.5F, 0.0F, -3.0F, 3, 1, 3, 0.0F, false));

        this.Snoutslope = new AdvancedModelRenderer(this);
        this.Snoutslope.setRotationPoint(0.0F, 0.0F, -3.0F);
        this.Browslope.addChild(Snoutslope);
        this.setRotateAngle(Snoutslope, 0.536F, 0.0F, 0.0F);
        this.Snoutslope.cubeList.add(new ModelBox(Snoutslope, 39, 45, -1.0F, 0.0F, -4.0F, 2, 2, 4, 0.0F, false));

        this.Rightupperarm = new AdvancedModelRenderer(this);
        this.Rightupperarm.setRotationPoint(5.0F, 6.1961F, -6.4741F);
        this.Bodyfront.addChild(Rightupperarm);
        this.setRotateAngle(Rightupperarm, 0.9226F, 0.0392F, -0.0994F);
        this.Rightupperarm.cubeList.add(new ModelBox(Rightupperarm, 0, 26, -0.8246F, -1.0098F, -0.6481F, 2, 7, 2, 0.0F, false));

        this.Rightlowerarm = new AdvancedModelRenderer(this);
        this.Rightlowerarm.setRotationPoint(-0.3346F, 5.4902F, 0.3519F);
        this.Rightupperarm.addChild(Rightlowerarm);
        this.setRotateAngle(Rightlowerarm, -0.7098F, 0.1651F, 0.4196F);
        this.Rightlowerarm.cubeList.add(new ModelBox(Rightlowerarm, 45, 54, -0.7306F, -0.239F, -0.3747F, 2, 9, 1, 0.0F, false));
        this.Rightlowerarm.cubeList.add(new ModelBox(Rightlowerarm, 38, 54, -0.7306F, -0.239F, -2.1747F, 2, 9, 1, 0.0F, false));

        this.Righthand = new AdvancedModelRenderer(this);
        this.Righthand.setRotationPoint(-0.2306F, 7.861F, -0.8747F);
        this.Rightlowerarm.addChild(Righthand);
        this.setRotateAngle(Righthand, 0.1783F, -0.3264F, -0.3394F);
        this.Righthand.cubeList.add(new ModelBox(Righthand, 18, 17, -2.5F, -0.5F, -8.0F, 5, 2, 9, 0.0F, false));

        this.Rightthumb = new AdvancedModelRenderer(this);
        this.Rightthumb.setRotationPoint(-2.2F, 0.7F, -1.5F);
        this.Righthand.addChild(Rightthumb);
        this.setRotateAngle(Rightthumb, 0.0F, 0.6793F, 0.0F);
        this.Rightthumb.cubeList.add(new ModelBox(Rightthumb, 58, 29, -0.5F, -0.5F, -4.0F, 1, 1, 4, 0.0F, false));

        this.Leftupperarm = new AdvancedModelRenderer(this);
        this.Leftupperarm.setRotationPoint(-5.0F, 6.1961F, -6.4741F);
        this.Bodyfront.addChild(Leftupperarm);
        this.setRotateAngle(Leftupperarm, 0.9226F, -0.0392F, 0.0994F);
        this.Leftupperarm.cubeList.add(new ModelBox(Leftupperarm, 0, 26, -1.1754F, -1.0098F, -0.6481F, 2, 7, 2, 0.0F, true));

        this.Leftlowerarm = new AdvancedModelRenderer(this);
        this.Leftlowerarm.setRotationPoint(0.3346F, 5.4902F, 0.3519F);
        this.Leftupperarm.addChild(Leftlowerarm);
        this.setRotateAngle(Leftlowerarm, -0.7098F, -0.1651F, -0.4196F);
        this.Leftlowerarm.cubeList.add(new ModelBox(Leftlowerarm, 45, 54, -1.2694F, -0.239F, -0.3747F, 2, 9, 1, 0.0F, true));
        this.Leftlowerarm.cubeList.add(new ModelBox(Leftlowerarm, 38, 54, -1.2694F, -0.239F, -2.1747F, 2, 9, 1, 0.0F, true));

        this.Lefthand = new AdvancedModelRenderer(this);
        this.Lefthand.setRotationPoint(0.2306F, 7.861F, -0.8747F);
        this.Leftlowerarm.addChild(Lefthand);
        this.setRotateAngle(Lefthand, 0.1783F, 0.3264F, 0.3394F);
        this.Lefthand.cubeList.add(new ModelBox(Lefthand, 18, 17, -2.5F, -0.5F, -8.0F, 5, 2, 9, 0.0F, true));

        this.Leftthumb = new AdvancedModelRenderer(this);
        this.Leftthumb.setRotationPoint(2.2F, 0.7F, -1.5F);
        this.Lefthand.addChild(Leftthumb);
        this.setRotateAngle(Leftthumb, 0.0F, -0.6793F, 0.0F);
        this.Leftthumb.cubeList.add(new ModelBox(Leftthumb, 58, 29, -0.5F, -0.5F, -4.0F, 1, 1, 4, 0.0F, true));

        this.Rightthigh = new AdvancedModelRenderer(this);
        this.Rightthigh.setRotationPoint(3.0F, -3.9941F, 9.5588F);
        this.Hips.addChild(Rightthigh);
        this.setRotateAngle(Rightthigh, -1.25F, -0.5519F, -0.1061F);
        this.Rightthigh.cubeList.add(new ModelBox(Rightthigh, 15, 51, -0.5892F, -0.4822F, -1.2552F, 2, 10, 2, 0.0F, false));

        this.Rightshin = new AdvancedModelRenderer(this);
        this.Rightshin.setRotationPoint(0.4108F, 9.5178F, -1.2552F);
        this.Rightthigh.addChild(Rightshin);
        this.setRotateAngle(Rightshin, 1.6368F, 0.0F, 0.1061F);
        this.Rightshin.cubeList.add(new ModelBox(Rightshin, 31, 54, -1.2F, 0.0F, 0.0F, 2, 10, 1, 0.0F, false));
        this.Rightshin.cubeList.add(new ModelBox(Rightshin, 24, 54, -1.2F, 0.0F, 2.0F, 2, 10, 1, 0.0F, false));

        this.Righthindfoot = new AdvancedModelRenderer(this);
        this.Righthindfoot.setRotationPoint(0.0F, 9.0F, 2.5F);
        this.Rightshin.addChild(Righthindfoot);
        this.setRotateAngle(Righthindfoot, 0.219F, 0.0308F, -0.1931F);
        this.Righthindfoot.cubeList.add(new ModelBox(Righthindfoot, 0, 0, -2.5F, -0.5F, -7.5F, 5, 2, 9, 0.0F, false));

        this.Rightopposabletoe = new AdvancedModelRenderer(this);
        this.Rightopposabletoe.setRotationPoint(-2.2F, 0.7F, -1.5F);
        this.Righthindfoot.addChild(Rightopposabletoe);
        this.setRotateAngle(Rightopposabletoe, 0.0F, 0.6793F, 0.0F);
        this.Rightopposabletoe.cubeList.add(new ModelBox(Rightopposabletoe, 58, 3, -0.5F, -0.5F, -4.0F, 1, 1, 4, 0.0F, false));

        this.Leftthigh = new AdvancedModelRenderer(this);
        this.Leftthigh.setRotationPoint(-3.0F, -3.9941F, 9.5588F);
        this.Hips.addChild(Leftthigh);
        this.setRotateAngle(Leftthigh, -1.25F, 0.5519F, 0.1061F);
        this.Leftthigh.cubeList.add(new ModelBox(Leftthigh, 15, 51, -1.4108F, -0.4822F, -1.2552F, 2, 10, 2, 0.0F, true));

        this.Leftshin = new AdvancedModelRenderer(this);
        this.Leftshin.setRotationPoint(-0.4108F, 9.5178F, -1.2552F);
        this.Leftthigh.addChild(Leftshin);
        this.setRotateAngle(Leftshin, 1.6368F, 0.0F, -0.1061F);
        this.Leftshin.cubeList.add(new ModelBox(Leftshin, 31, 54, -0.8F, 0.0F, 0.0F, 2, 10, 1, 0.0F, true));
        this.Leftshin.cubeList.add(new ModelBox(Leftshin, 24, 54, -0.8F, 0.0F, 2.0F, 2, 10, 1, 0.0F, true));

        this.Lefthindfoot = new AdvancedModelRenderer(this);
        this.Lefthindfoot.setRotationPoint(0.0F, 9.0F, 2.5F);
        this.Leftshin.addChild(Lefthindfoot);
        this.setRotateAngle(Lefthindfoot, 0.219F, -0.0308F, 0.1931F);
        this.Lefthindfoot.cubeList.add(new ModelBox(Lefthindfoot, 0, 0, -2.5F, -0.5F, -7.5F, 5, 2, 9, 0.0F, true));

        this.Leftopposabletoe = new AdvancedModelRenderer(this);
        this.Leftopposabletoe.setRotationPoint(2.2F, 0.7F, -1.5F);
        this.Lefthindfoot.addChild(Leftopposabletoe);
        this.setRotateAngle(Leftopposabletoe, 0.0F, -0.6793F, 0.0F);
        this.Leftopposabletoe.cubeList.add(new ModelBox(Leftopposabletoe, 58, 3, -0.5F, -0.5F, -4.0F, 1, 1, 4, 0.0F, true));

        updateDefaultPose();
    }

    public void renderAll(float f) {
        this.resetToDefaultPose();
        this.root.render(0.01f);
    }

    public void setRotateAngle(ModelRenderer modelRenderer, float x, float y, float z) {
        modelRenderer.rotateAngleX = x;
        modelRenderer.rotateAngleY = y;
        modelRenderer.rotateAngleZ = z;
    }

}
