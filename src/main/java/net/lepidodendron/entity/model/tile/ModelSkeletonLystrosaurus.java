package net.lepidodendron.entity.model.tile;

import net.ilexiconn.llibrary.client.model.tools.AdvancedModelBase;
import net.ilexiconn.llibrary.client.model.tools.AdvancedModelRenderer;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;

public class ModelSkeletonLystrosaurus extends AdvancedModelBase {
    private final AdvancedModelRenderer root;
    private final AdvancedModelRenderer Hips;
    private final AdvancedModelRenderer Hips_r1;
    private final AdvancedModelRenderer Hips_r2;
    private final AdvancedModelRenderer Hips_r3;
    private final AdvancedModelRenderer Neck_r1;
    private final AdvancedModelRenderer Neck_r2;
    private final AdvancedModelRenderer Neck_r3;
    private final AdvancedModelRenderer Neck_r4;
    private final AdvancedModelRenderer Bodymiddle;
    private final AdvancedModelRenderer Neck_r5;
    private final AdvancedModelRenderer Neck_r6;
    private final AdvancedModelRenderer Neck_r7;
    private final AdvancedModelRenderer Neck_r8;
    private final AdvancedModelRenderer Neck_r9;
    private final AdvancedModelRenderer Neck_r10;
    private final AdvancedModelRenderer Neck_r11;
    private final AdvancedModelRenderer Neck_r12;
    private final AdvancedModelRenderer Bodyfront;
    private final AdvancedModelRenderer Bodyfront_r1;
    private final AdvancedModelRenderer Bodyfront_r2;
    private final AdvancedModelRenderer Bodyfront_r3;
    private final AdvancedModelRenderer Bodyfront_r4;
    private final AdvancedModelRenderer Bodyfront_r5;
    private final AdvancedModelRenderer Neck_r13;
    private final AdvancedModelRenderer Neck_r14;
    private final AdvancedModelRenderer Neck_r15;
    private final AdvancedModelRenderer Neck_r16;
    private final AdvancedModelRenderer Neck_r17;
    private final AdvancedModelRenderer Neck_r18;
    private final AdvancedModelRenderer Neck_r19;
    private final AdvancedModelRenderer Neck_r20;
    private final AdvancedModelRenderer Neck_r21;
    private final AdvancedModelRenderer Neck_r22;
    private final AdvancedModelRenderer Neck_r23;
    private final AdvancedModelRenderer Neck_r24;
    private final AdvancedModelRenderer Neck_r25;
    private final AdvancedModelRenderer Neck_r26;
    private final AdvancedModelRenderer Neck_r27;
    private final AdvancedModelRenderer Neck_r28;
    private final AdvancedModelRenderer Neck;
    private final AdvancedModelRenderer Neck_r29;
    private final AdvancedModelRenderer Neck_r30;
    private final AdvancedModelRenderer Neck_r31;
    private final AdvancedModelRenderer Neck_r32;
    private final AdvancedModelRenderer Head;
    private final AdvancedModelRenderer Head_r1;
    private final AdvancedModelRenderer Head_r2;
    private final AdvancedModelRenderer Head_r3;
    private final AdvancedModelRenderer Head_r4;
    private final AdvancedModelRenderer Upperjaw1;
    private final AdvancedModelRenderer Upperjaw2;
    private final AdvancedModelRenderer Upperbeak;
    private final AdvancedModelRenderer Lefttusk;
    private final AdvancedModelRenderer Righttusk;
    private final AdvancedModelRenderer Lowerjaw1;
    private final AdvancedModelRenderer Lowerjaw2;
    private final AdvancedModelRenderer Lowerjaw3;
    private final AdvancedModelRenderer Lowerjaw4;
    private final AdvancedModelRenderer Lowerbeak;
    private final AdvancedModelRenderer Jawparting;
    private final AdvancedModelRenderer Eyes;
    private final AdvancedModelRenderer Eyes_r1;
    private final AdvancedModelRenderer Eyes_r2;
    private final AdvancedModelRenderer Eyes_r3;
    private final AdvancedModelRenderer Rightupperarm;
    private final AdvancedModelRenderer Rightlowerarm;
    private final AdvancedModelRenderer Rightfrontfoot;
    private final AdvancedModelRenderer Leftupperarm;
    private final AdvancedModelRenderer Leftlowerarm;
    private final AdvancedModelRenderer Leftfrontfoot;
    private final AdvancedModelRenderer Tail1;
    private final AdvancedModelRenderer Tail2;
    private final AdvancedModelRenderer Tail3;
    private final AdvancedModelRenderer Rightthigh;
    private final AdvancedModelRenderer Rightshin;
    private final AdvancedModelRenderer Righthindfoot;
    private final AdvancedModelRenderer Leftthigh;
    private final AdvancedModelRenderer Leftshin;
    private final AdvancedModelRenderer Lefthindfoot;

    public ModelSkeletonLystrosaurus() {
        this.textureWidth = 64;
        this.textureHeight = 64;

        this.root = new AdvancedModelRenderer(this);
        this.root.setRotationPoint(0.0F, 0.0F, 0.0F);


        this.Hips = new AdvancedModelRenderer(this);
        this.Hips.setRotationPoint(0.0F, 9.85F, 1.1F);
        this.root.addChild(Hips);
        this.setRotateAngle(Hips, -0.1061F, 0.0F, 0.0F);
        this.Hips.cubeList.add(new ModelBox(Hips, 0, 15, -1.0F, -1.9435F, 7.749F, 2, 2, 9, 0.001F, false));

        this.Hips_r1 = new AdvancedModelRenderer(this);
        this.Hips_r1.setRotationPoint(1.0F, -1.8946F, 9.7702F);
        this.Hips.addChild(Hips_r1);
        this.setRotateAngle(Hips_r1, -0.2182F, 0.0F, 0.0F);
        this.Hips_r1.cubeList.add(new ModelBox(Hips_r1, 40, 8, -1.0F, -0.2489F, 1.9788F, 2, 1, 4, 0.001F, false));
        this.Hips_r1.cubeList.add(new ModelBox(Hips_r1, 31, 11, -4.0F, -0.2489F, 0.9788F, 1, 3, 6, 0.001F, true));
        this.Hips_r1.cubeList.add(new ModelBox(Hips_r1, 31, 11, 1.0F, -0.2489F, 0.9788F, 1, 3, 6, 0.001F, false));

        this.Hips_r2 = new AdvancedModelRenderer(this);
        this.Hips_r2.setRotationPoint(-3.0F, 2.3054F, 12.3702F);
        this.Hips.addChild(Hips_r2);
        this.setRotateAngle(Hips_r2, -0.6419F, 0.291F, -0.2113F);
        this.Hips_r2.cubeList.add(new ModelBox(Hips_r2, 30, 30, -0.1F, -1.5923F, 0.3171F, 1, 3, 6, 0.001F, true));

        this.Hips_r3 = new AdvancedModelRenderer(this);
        this.Hips_r3.setRotationPoint(3.0F, 2.3054F, 12.3702F);
        this.Hips.addChild(Hips_r3);
        this.setRotateAngle(Hips_r3, -0.6419F, -0.291F, 0.2113F);
        this.Hips_r3.cubeList.add(new ModelBox(Hips_r3, 30, 30, -0.9F, -1.5923F, 0.3171F, 1, 3, 6, 0.001F, false));

        this.Neck_r1 = new AdvancedModelRenderer(this);
        this.Neck_r1.setRotationPoint(-1.0F, -0.5115F, 7.0334F);
        this.Hips.addChild(Neck_r1);
        this.setRotateAngle(Neck_r1, 0.0336F, 0.1145F, 1.1206F);
        this.Neck_r1.cubeList.add(new ModelBox(Neck_r1, 27, 36, -0.1626F, 0.1453F, 1.6274F, 0, 2, 1, 0.0F, true));

        this.Neck_r2 = new AdvancedModelRenderer(this);
        this.Neck_r2.setRotationPoint(-1.0F, -0.5115F, 7.0334F);
        this.Hips.addChild(Neck_r2);
        this.setRotateAngle(Neck_r2, -0.0529F, 0.107F, 0.374F);
        this.Neck_r2.cubeList.add(new ModelBox(Neck_r2, 10, 27, -1.5883F, 1.441F, 1.6274F, 0, 2, 1, 0.0F, true));

        this.Neck_r3 = new AdvancedModelRenderer(this);
        this.Neck_r3.setRotationPoint(1.0F, -0.5115F, 7.0334F);
        this.Hips.addChild(Neck_r3);
        this.setRotateAngle(Neck_r3, 0.0336F, -0.1145F, -1.1206F);
        this.Neck_r3.cubeList.add(new ModelBox(Neck_r3, 27, 36, 0.1626F, 0.1453F, 1.6274F, 0, 2, 1, 0.0F, false));

        this.Neck_r4 = new AdvancedModelRenderer(this);
        this.Neck_r4.setRotationPoint(1.0F, -0.5115F, 7.0334F);
        this.Hips.addChild(Neck_r4);
        this.setRotateAngle(Neck_r4, -0.0529F, -0.107F, -0.374F);
        this.Neck_r4.cubeList.add(new ModelBox(Neck_r4, 10, 27, 1.5883F, 1.441F, 1.6274F, 0, 2, 1, 0.0F, false));

        this.Bodymiddle = new AdvancedModelRenderer(this);
        this.Bodymiddle.setRotationPoint(0.0F, -1.0446F, 8.2702F);
        this.Hips.addChild(Bodymiddle);
        this.setRotateAngle(Bodymiddle, 0.1062F, -0.0434F, -0.0046F);
        this.Bodymiddle.cubeList.add(new ModelBox(Bodymiddle, 0, 0, -1.0F, -0.8977F, -11.4576F, 2, 2, 12, 0.0F, false));

        this.Neck_r5 = new AdvancedModelRenderer(this);
        this.Neck_r5.setRotationPoint(-1.0F, 0.5354F, -9.1944F);
        this.Bodymiddle.addChild(Neck_r5);
        this.setRotateAngle(Neck_r5, 0.0286F, 0.0748F, 0.3814F);
        this.Neck_r5.cubeList.add(new ModelBox(Neck_r5, 0, 27, -1.4097F, 1.4545F, -0.3777F, 0, 7, 1, 0.0F, true));
        this.Neck_r5.cubeList.add(new ModelBox(Neck_r5, 9, 0, -1.5592F, 1.5114F, 1.6159F, 0, 7, 1, 0.0F, true));
        this.Neck_r5.cubeList.add(new ModelBox(Neck_r5, 14, 27, -1.7087F, 1.5684F, 3.6095F, 0, 6, 1, 0.0F, true));
        this.Neck_r5.cubeList.add(new ModelBox(Neck_r5, 41, 53, -1.8582F, 1.6253F, 5.6031F, 0, 5, 1, 0.0F, true));

        this.Neck_r6 = new AdvancedModelRenderer(this);
        this.Neck_r6.setRotationPoint(-1.0F, 0.5354F, -9.1944F);
        this.Bodymiddle.addChild(Neck_r6);
        this.setRotateAngle(Neck_r6, 0.0716F, 0.0359F, 1.1234F);
        this.Neck_r6.cubeList.add(new ModelBox(Neck_r6, 45, 36, -0.0218F, 0.0345F, -0.3777F, 0, 2, 1, 0.0F, true));
        this.Neck_r6.cubeList.add(new ModelBox(Neck_r6, 9, 40, -0.0935F, 0.1775F, 1.6159F, 0, 2, 1, 0.0F, true));
        this.Neck_r6.cubeList.add(new ModelBox(Neck_r6, 40, 8, -0.1653F, 0.3205F, 3.6095F, 0, 2, 1, 0.0F, true));
        this.Neck_r6.cubeList.add(new ModelBox(Neck_r6, 0, 40, -0.237F, 0.4635F, 5.6031F, 0, 2, 1, 0.0F, true));

        this.Neck_r7 = new AdvancedModelRenderer(this);
        this.Neck_r7.setRotationPoint(-1.0F, 0.5354F, -1.1944F);
        this.Bodymiddle.addChild(Neck_r7);
        this.setRotateAngle(Neck_r7, -0.0529F, 0.107F, 0.374F);
        this.Neck_r7.cubeList.add(new ModelBox(Neck_r7, 30, 0, -1.4097F, 1.4545F, -0.3777F, 0, 3, 1, 0.0F, true));

        this.Neck_r8 = new AdvancedModelRenderer(this);
        this.Neck_r8.setRotationPoint(-1.0F, 0.5354F, -1.1944F);
        this.Bodymiddle.addChild(Neck_r8);
        this.setRotateAngle(Neck_r8, 0.0336F, 0.1145F, 1.1206F);
        this.Neck_r8.cubeList.add(new ModelBox(Neck_r8, 39, 29, -0.0218F, 0.0345F, -0.3777F, 0, 2, 1, 0.0F, true));

        this.Neck_r9 = new AdvancedModelRenderer(this);
        this.Neck_r9.setRotationPoint(1.0F, 0.5354F, -1.1944F);
        this.Bodymiddle.addChild(Neck_r9);
        this.setRotateAngle(Neck_r9, -0.0529F, -0.107F, -0.374F);
        this.Neck_r9.cubeList.add(new ModelBox(Neck_r9, 30, 0, 1.4097F, 1.4545F, -0.3777F, 0, 3, 1, 0.0F, false));

        this.Neck_r10 = new AdvancedModelRenderer(this);
        this.Neck_r10.setRotationPoint(1.0F, 0.5354F, -1.1944F);
        this.Bodymiddle.addChild(Neck_r10);
        this.setRotateAngle(Neck_r10, 0.0336F, -0.1145F, -1.1206F);
        this.Neck_r10.cubeList.add(new ModelBox(Neck_r10, 39, 29, 0.0218F, 0.0345F, -0.3777F, 0, 2, 1, 0.0F, false));

        this.Neck_r11 = new AdvancedModelRenderer(this);
        this.Neck_r11.setRotationPoint(1.0F, 0.5354F, -9.1944F);
        this.Bodymiddle.addChild(Neck_r11);
        this.setRotateAngle(Neck_r11, 0.0716F, -0.0359F, -1.1234F);
        this.Neck_r11.cubeList.add(new ModelBox(Neck_r11, 0, 40, 0.237F, 0.4635F, 5.6031F, 0, 2, 1, 0.0F, false));
        this.Neck_r11.cubeList.add(new ModelBox(Neck_r11, 40, 8, 0.1653F, 0.3205F, 3.6095F, 0, 2, 1, 0.0F, false));
        this.Neck_r11.cubeList.add(new ModelBox(Neck_r11, 9, 40, 0.0935F, 0.1775F, 1.6159F, 0, 2, 1, 0.0F, false));
        this.Neck_r11.cubeList.add(new ModelBox(Neck_r11, 45, 36, 0.0218F, 0.0345F, -0.3777F, 0, 2, 1, 0.0F, false));

        this.Neck_r12 = new AdvancedModelRenderer(this);
        this.Neck_r12.setRotationPoint(1.0F, 0.5354F, -9.1944F);
        this.Bodymiddle.addChild(Neck_r12);
        this.setRotateAngle(Neck_r12, 0.0286F, -0.0748F, -0.3814F);
        this.Neck_r12.cubeList.add(new ModelBox(Neck_r12, 41, 53, 1.8582F, 1.6253F, 5.6031F, 0, 5, 1, 0.0F, false));
        this.Neck_r12.cubeList.add(new ModelBox(Neck_r12, 14, 27, 1.7087F, 1.5684F, 3.6095F, 0, 6, 1, 0.0F, false));
        this.Neck_r12.cubeList.add(new ModelBox(Neck_r12, 9, 0, 1.5592F, 1.5114F, 1.6159F, 0, 7, 1, 0.0F, false));
        this.Neck_r12.cubeList.add(new ModelBox(Neck_r12, 0, 27, 1.4097F, 1.4545F, -0.3777F, 0, 7, 1, 0.0F, false));

        this.Bodyfront = new AdvancedModelRenderer(this);
        this.Bodyfront.setRotationPoint(0.0F, 0.0023F, -11.0576F);
        this.Bodymiddle.addChild(Bodyfront);
        this.setRotateAngle(Bodyfront, 0.0639F, -0.0871F, -0.0056F);


        this.Bodyfront_r1 = new AdvancedModelRenderer(this);
        this.Bodyfront_r1.setRotationPoint(-3.5F, 6.3888F, -6.3821F);
        this.Bodyfront.addChild(Bodyfront_r1);
        this.setRotateAngle(Bodyfront_r1, -0.04F, -0.2194F, -1.0477F);
        this.Bodyfront_r1.cubeList.add(new ModelBox(Bodyfront_r1, 20, 44, -0.8815F, 0.1509F, -0.5556F, 1, 4, 3, 0.001F, true));

        this.Bodyfront_r2 = new AdvancedModelRenderer(this);
        this.Bodyfront_r2.setRotationPoint(3.5F, 6.3888F, -6.3821F);
        this.Bodyfront.addChild(Bodyfront_r2);
        this.setRotateAngle(Bodyfront_r2, -0.04F, 0.2194F, 1.0477F);
        this.Bodyfront_r2.cubeList.add(new ModelBox(Bodyfront_r2, 20, 44, -0.1185F, 0.1509F, -0.5556F, 1, 4, 3, 0.001F, false));

        this.Bodyfront_r3 = new AdvancedModelRenderer(this);
        this.Bodyfront_r3.setRotationPoint(-2.0F, 1.1888F, -6.3821F);
        this.Bodyfront.addChild(Bodyfront_r3);
        this.setRotateAngle(Bodyfront_r3, -0.2222F, -0.0187F, 0.2589F);
        this.Bodyfront_r3.cubeList.add(new ModelBox(Bodyfront_r3, 0, 0, -1.0F, -0.572F, 0.6391F, 1, 6, 3, 0.001F, true));

        this.Bodyfront_r4 = new AdvancedModelRenderer(this);
        this.Bodyfront_r4.setRotationPoint(2.0F, 1.1888F, -6.3821F);
        this.Bodyfront.addChild(Bodyfront_r4);
        this.setRotateAngle(Bodyfront_r4, -0.2222F, 0.0187F, -0.2589F);
        this.Bodyfront_r4.cubeList.add(new ModelBox(Bodyfront_r4, 0, 0, 0.0F, -0.572F, 0.6391F, 1, 6, 3, 0.001F, false));

        this.Bodyfront_r5 = new AdvancedModelRenderer(this);
        this.Bodyfront_r5.setRotationPoint(0.0F, 0.1888F, -7.3821F);
        this.Bodyfront.addChild(Bodyfront_r5);
        this.setRotateAngle(Bodyfront_r5, 0.1309F, 0.0F, 0.0F);
        this.Bodyfront_r5.cubeList.add(new ModelBox(Bodyfront_r5, 17, 0, -1.0F, -0.15F, -0.3F, 2, 2, 8, 0.001F, false));

        this.Neck_r13 = new AdvancedModelRenderer(this);
        this.Neck_r13.setRotationPoint(-1.0F, 0.6132F, -4.1381F);
        this.Bodyfront.addChild(Neck_r13);
        this.setRotateAngle(Neck_r13, 0.1449F, 0.0151F, 0.2561F);
        this.Neck_r13.cubeList.add(new ModelBox(Neck_r13, 30, 24, -1.3227F, 1.6691F, -0.5221F, 0, 4, 1, 0.0F, true));

        this.Neck_r14 = new AdvancedModelRenderer(this);
        this.Neck_r14.setRotationPoint(-1.0F, 0.6132F, -4.1381F);
        this.Bodyfront.addChild(Neck_r14);
        this.setRotateAngle(Neck_r14, 0.1384F, -0.0182F, 0.1296F);
        this.Neck_r14.cubeList.add(new ModelBox(Neck_r14, 34, 11, -1.3486F, 1.7464F, -2.5834F, 0, 4, 1, 0.0F, true));

        this.Neck_r15 = new AdvancedModelRenderer(this);
        this.Neck_r15.setRotationPoint(-1.0F, 0.6132F, -4.1381F);
        this.Bodyfront.addChild(Neck_r15);
        this.setRotateAngle(Neck_r15, 0.0901F, -0.1068F, 0.8678F);
        this.Neck_r15.cubeList.add(new ModelBox(Neck_r15, 51, 42, 0.2205F, 0.2084F, -2.5834F, 0, 2, 1, 0.0F, true));

        this.Neck_r16 = new AdvancedModelRenderer(this);
        this.Neck_r16.setRotationPoint(-1.0F, 0.6132F, -4.1381F);
        this.Bodyfront.addChild(Neck_r16);
        this.setRotateAngle(Neck_r16, 0.1174F, -0.0866F, 0.9917F);
        this.Neck_r16.cubeList.add(new ModelBox(Neck_r16, 46, 20, 0.1873F, 0.134F, -0.5221F, 0, 2, 1, 0.0F, true));

        this.Neck_r17 = new AdvancedModelRenderer(this);
        this.Neck_r17.setRotationPoint(-1.0F, 0.6132F, -4.1381F);
        this.Bodyfront.addChild(Neck_r17);
        this.setRotateAngle(Neck_r17, 0.0691F, 0.0585F, 0.3841F);
        this.Neck_r17.cubeList.add(new ModelBox(Neck_r17, 44, 53, -1.5276F, 1.5697F, 1.5194F, 0, 5, 1, 0.0F, true));

        this.Neck_r18 = new AdvancedModelRenderer(this);
        this.Neck_r18.setRotationPoint(-1.0F, 0.6132F, -4.1381F);
        this.Bodyfront.addChild(Neck_r18);
        this.setRotateAngle(Neck_r18, 0.0905F, -0.0035F, 1.1237F);
        this.Neck_r18.cubeList.add(new ModelBox(Neck_r18, 7, 46, -0.0308F, 0.1991F, 1.5194F, 0, 2, 1, 0.0F, true));

        this.Neck_r19 = new AdvancedModelRenderer(this);
        this.Neck_r19.setRotationPoint(-1.0F, 0.6132F, -4.1381F);
        this.Bodyfront.addChild(Neck_r19);
        this.setRotateAngle(Neck_r19, -0.0121F, 0.091F, 0.3781F);
        this.Neck_r19.cubeList.add(new ModelBox(Neck_r19, 9, 53, -1.7957F, 1.3312F, 3.5186F, 0, 6, 1, 0.0F, true));

        this.Neck_r20 = new AdvancedModelRenderer(this);
        this.Neck_r20.setRotationPoint(-1.0F, 0.6132F, -4.1381F);
        this.Bodyfront.addChild(Neck_r20);
        this.setRotateAngle(Neck_r20, 0.0527F, 0.0752F, 1.1224F);
        this.Neck_r20.cubeList.add(new ModelBox(Neck_r20, 0, 46, -0.3897F, 0.2044F, 3.5186F, 0, 2, 1, 0.0F, true));

        this.Neck_r21 = new AdvancedModelRenderer(this);
        this.Neck_r21.setRotationPoint(1.0F, 0.6132F, -4.1381F);
        this.Bodyfront.addChild(Neck_r21);
        this.setRotateAngle(Neck_r21, 0.1384F, 0.0182F, -0.1296F);
        this.Neck_r21.cubeList.add(new ModelBox(Neck_r21, 34, 11, 1.3486F, 1.7464F, -2.5834F, 0, 4, 1, 0.0F, false));

        this.Neck_r22 = new AdvancedModelRenderer(this);
        this.Neck_r22.setRotationPoint(1.0F, 0.6132F, -4.1381F);
        this.Bodyfront.addChild(Neck_r22);
        this.setRotateAngle(Neck_r22, 0.0901F, 0.1068F, -0.8678F);
        this.Neck_r22.cubeList.add(new ModelBox(Neck_r22, 51, 42, -0.2205F, 0.2084F, -2.5834F, 0, 2, 1, 0.0F, false));

        this.Neck_r23 = new AdvancedModelRenderer(this);
        this.Neck_r23.setRotationPoint(1.0F, 0.6132F, -4.1381F);
        this.Bodyfront.addChild(Neck_r23);
        this.setRotateAngle(Neck_r23, 0.1449F, -0.0151F, -0.2561F);
        this.Neck_r23.cubeList.add(new ModelBox(Neck_r23, 30, 24, 1.3227F, 1.6691F, -0.5221F, 0, 4, 1, 0.0F, false));

        this.Neck_r24 = new AdvancedModelRenderer(this);
        this.Neck_r24.setRotationPoint(1.0F, 0.6132F, -4.1381F);
        this.Bodyfront.addChild(Neck_r24);
        this.setRotateAngle(Neck_r24, 0.1174F, 0.0866F, -0.9917F);
        this.Neck_r24.cubeList.add(new ModelBox(Neck_r24, 46, 20, -0.1873F, 0.134F, -0.5221F, 0, 2, 1, 0.0F, false));

        this.Neck_r25 = new AdvancedModelRenderer(this);
        this.Neck_r25.setRotationPoint(1.0F, 0.6132F, -4.1381F);
        this.Bodyfront.addChild(Neck_r25);
        this.setRotateAngle(Neck_r25, 0.0691F, -0.0585F, -0.3841F);
        this.Neck_r25.cubeList.add(new ModelBox(Neck_r25, 44, 53, 1.5276F, 1.5697F, 1.5194F, 0, 5, 1, 0.0F, false));

        this.Neck_r26 = new AdvancedModelRenderer(this);
        this.Neck_r26.setRotationPoint(1.0F, 0.6132F, -4.1381F);
        this.Bodyfront.addChild(Neck_r26);
        this.setRotateAngle(Neck_r26, 0.0905F, 0.0035F, -1.1237F);
        this.Neck_r26.cubeList.add(new ModelBox(Neck_r26, 7, 46, 0.0308F, 0.1991F, 1.5194F, 0, 2, 1, 0.0F, false));

        this.Neck_r27 = new AdvancedModelRenderer(this);
        this.Neck_r27.setRotationPoint(1.0F, 0.6132F, -4.1381F);
        this.Bodyfront.addChild(Neck_r27);
        this.setRotateAngle(Neck_r27, 0.0527F, -0.0752F, -1.1224F);
        this.Neck_r27.cubeList.add(new ModelBox(Neck_r27, 0, 46, 0.3897F, 0.2044F, 3.5186F, 0, 2, 1, 0.0F, false));

        this.Neck_r28 = new AdvancedModelRenderer(this);
        this.Neck_r28.setRotationPoint(1.0F, 0.6132F, -4.1381F);
        this.Bodyfront.addChild(Neck_r28);
        this.setRotateAngle(Neck_r28, -0.0121F, -0.091F, -0.3781F);
        this.Neck_r28.cubeList.add(new ModelBox(Neck_r28, 9, 53, 1.7957F, 1.3312F, 3.5186F, 0, 6, 1, 0.0F, false));

        this.Neck = new AdvancedModelRenderer(this);
        this.Neck.setRotationPoint(0.0F, 0.9388F, -7.1821F);
        this.Bodyfront.addChild(Neck);
        this.setRotateAngle(Neck, -0.2754F, -0.7215F, -0.0937F);
        this.Neck.cubeList.add(new ModelBox(Neck, 14, 36, -1.0F, -0.7984F, -4.9686F, 2, 2, 5, 0.0F, false));

        this.Neck_r29 = new AdvancedModelRenderer(this);
        this.Neck_r29.setRotationPoint(-1.0F, 0.6516F, -1.4686F);
        this.Neck.addChild(Neck_r29);
        this.setRotateAngle(Neck_r29, 0.2533F, -0.067F, 0.2533F);
        this.Neck_r29.cubeList.add(new ModelBox(Neck_r29, 52, 31, 0.0F, 0.0296F, -1.6553F, 0, 2, 1, 0.0F, true));

        this.Neck_r30 = new AdvancedModelRenderer(this);
        this.Neck_r30.setRotationPoint(-1.0F, 1.1516F, -0.7686F);
        this.Neck.addChild(Neck_r30);
        this.setRotateAngle(Neck_r30, 0.2382F, -0.1096F, 0.4232F);
        this.Neck_r30.cubeList.add(new ModelBox(Neck_r30, 24, 36, 0.0281F, -0.012F, -0.202F, 0, 3, 1, 0.0F, true));

        this.Neck_r31 = new AdvancedModelRenderer(this);
        this.Neck_r31.setRotationPoint(1.0F, 1.1516F, -0.7686F);
        this.Neck.addChild(Neck_r31);
        this.setRotateAngle(Neck_r31, 0.2382F, 0.1096F, -0.4232F);
        this.Neck_r31.cubeList.add(new ModelBox(Neck_r31, 24, 36, -0.0281F, -0.012F, -0.202F, 0, 3, 1, 0.0F, false));

        this.Neck_r32 = new AdvancedModelRenderer(this);
        this.Neck_r32.setRotationPoint(1.0F, 0.6516F, -1.4686F);
        this.Neck.addChild(Neck_r32);
        this.setRotateAngle(Neck_r32, 0.2533F, 0.067F, -0.2533F);
        this.Neck_r32.cubeList.add(new ModelBox(Neck_r32, 52, 31, 0.0F, 0.0296F, -1.6553F, 0, 2, 1, 0.0F, false));

        this.Head = new AdvancedModelRenderer(this);
        this.Head.setRotationPoint(-0.01F, 0.1016F, -2.9686F);
        this.Neck.addChild(Head);
        this.setRotateAngle(Head, 0.0266F, -0.2134F, -0.1711F);
        this.Head.cubeList.add(new ModelBox(Head, 17, 24, -1.5F, -2.6843F, -5.8526F, 3, 5, 6, 0.0F, false));

        this.Head_r1 = new AdvancedModelRenderer(this);
        this.Head_r1.setRotationPoint(-3.59F, -1.4343F, -0.7526F);
        this.Head.addChild(Head_r1);
        this.setRotateAngle(Head_r1, 1.2331F, 1.0853F, 1.9594F);
        this.Head_r1.cubeList.add(new ModelBox(Head_r1, 0, 40, -0.6654F, -0.7655F, -0.1036F, 2, 1, 4, -0.001F, true));

        this.Head_r2 = new AdvancedModelRenderer(this);
        this.Head_r2.setRotationPoint(-2.39F, 1.4657F, -6.3526F);
        this.Head.addChild(Head_r2);
        this.setRotateAngle(Head_r2, 0.5438F, -0.4421F, 0.2152F);
        this.Head_r2.cubeList.add(new ModelBox(Head_r2, 0, 46, 0.11F, 0.0334F, 2.9184F, 1, 1, 4, -0.001F, true));
        this.Head_r2.cubeList.add(new ModelBox(Head_r2, 49, 5, 0.11F, 0.0334F, -0.0816F, 1, 1, 3, -0.001F, true));

        this.Head_r3 = new AdvancedModelRenderer(this);
        this.Head_r3.setRotationPoint(3.61F, -1.4343F, -0.7526F);
        this.Head.addChild(Head_r3);
        this.setRotateAngle(Head_r3, 1.2331F, -1.0853F, -1.9594F);
        this.Head_r3.cubeList.add(new ModelBox(Head_r3, 0, 40, -1.3346F, -0.7655F, -0.1036F, 2, 1, 4, -0.001F, false));

        this.Head_r4 = new AdvancedModelRenderer(this);
        this.Head_r4.setRotationPoint(2.41F, 1.4657F, -6.3526F);
        this.Head.addChild(Head_r4);
        this.setRotateAngle(Head_r4, 0.5438F, 0.4421F, -0.2152F);
        this.Head_r4.cubeList.add(new ModelBox(Head_r4, 0, 46, -1.11F, 0.0334F, 2.9184F, 1, 1, 4, -0.001F, false));
        this.Head_r4.cubeList.add(new ModelBox(Head_r4, 49, 5, -1.11F, 0.0334F, -0.0816F, 1, 1, 3, -0.001F, false));

        this.Upperjaw1 = new AdvancedModelRenderer(this);
        this.Upperjaw1.setRotationPoint(0.0F, -3.5843F, -3.0526F);
        this.Head.addChild(Upperjaw1);
        this.setRotateAngle(Upperjaw1, 0.0637F, 0.0F, 0.0F);


        this.Upperjaw2 = new AdvancedModelRenderer(this);
        this.Upperjaw2.setRotationPoint(0.0F, 0.0F, -3.0F);
        this.Upperjaw1.addChild(Upperjaw2);
        this.setRotateAngle(Upperjaw2, 1.0613F, 0.0F, 0.0F);
        this.Upperjaw2.cubeList.add(new ModelBox(Upperjaw2, 0, 31, -1.99F, 0.0F, -5.0F, 4, 3, 5, 0.0F, false));

        this.Upperbeak = new AdvancedModelRenderer(this);
        this.Upperbeak.setRotationPoint(0.0F, 0.0F, -5.0F);
        this.Upperjaw2.addChild(Upperbeak);
        this.setRotateAngle(Upperbeak, 0.2972F, 0.0F, 0.0F);
        this.Upperbeak.cubeList.add(new ModelBox(Upperbeak, 0, 52, -1.5F, 0.0F, -1.0F, 3, 3, 1, 0.0F, false));

        this.Lefttusk = new AdvancedModelRenderer(this);
        this.Lefttusk.setRotationPoint(-1.4F, 2.3F, -4.3F);
        this.Upperjaw2.addChild(Lefttusk);
        this.setRotateAngle(Lefttusk, -1.1037F, 0.1274F, 0.0F);


        this.Righttusk = new AdvancedModelRenderer(this);
        this.Righttusk.setRotationPoint(1.4F, 2.3F, -4.3F);
        this.Upperjaw2.addChild(Righttusk);
        this.setRotateAngle(Righttusk, -1.1037F, -0.1274F, 0.0F);
        this.Righttusk.cubeList.add(new ModelBox(Righttusk, 29, 11, 0.0F, 0.3F, -0.5F, 1, 2, 1, 0.0F, false));
        this.Righttusk.cubeList.add(new ModelBox(Righttusk, 29, 11, -3.98F, -0.1F, -0.3F, 1, 2, 1, 0.0F, true));

        this.Lowerjaw1 = new AdvancedModelRenderer(this);
        this.Lowerjaw1.setRotationPoint(0.0F, 0.8157F, -0.8426F);
        this.Head.addChild(Lowerjaw1);
        this.setRotateAngle(Lowerjaw1, 1.0267F, 0.0F, 0.0F);
        this.Lowerjaw1.cubeList.add(new ModelBox(Lowerjaw1, 38, 46, 1.5F, 0.0F, -3.0F, 1, 3, 3, -0.001F, false));
        this.Lowerjaw1.cubeList.add(new ModelBox(Lowerjaw1, 38, 46, -2.48F, 0.0F, -3.0F, 1, 3, 3, -0.001F, true));

        this.Lowerjaw2 = new AdvancedModelRenderer(this);
        this.Lowerjaw2.setRotationPoint(0.0F, 0.0F, -3.0F);
        this.Lowerjaw1.addChild(Lowerjaw2);
        this.setRotateAngle(Lowerjaw2, 0.2972F, 0.0F, 0.0F);
        this.Lowerjaw2.cubeList.add(new ModelBox(Lowerjaw2, 18, 52, 1.0F, 0.0F, -2.0F, 1, 3, 2, 0.0F, false));
        this.Lowerjaw2.cubeList.add(new ModelBox(Lowerjaw2, 18, 52, -1.98F, 0.0F, -2.0F, 1, 3, 2, 0.0F, true));

        this.Lowerjaw3 = new AdvancedModelRenderer(this);
        this.Lowerjaw3.setRotationPoint(0.0F, 3.0F, -2.0F);
        this.Lowerjaw2.addChild(Lowerjaw3);
        this.setRotateAngle(Lowerjaw3, -0.3609F, 0.0F, 0.0F);
        this.Lowerjaw3.cubeList.add(new ModelBox(Lowerjaw3, 34, 53, 0.5F, -3.0F, -1.5F, 1, 3, 2, 0.0F, false));
        this.Lowerjaw3.cubeList.add(new ModelBox(Lowerjaw3, 34, 53, -1.48F, -3.0F, -1.5F, 1, 3, 2, 0.0F, true));

        this.Lowerjaw4 = new AdvancedModelRenderer(this);
        this.Lowerjaw4.setRotationPoint(0.01F, 0.0F, -1.4F);
        this.Lowerjaw3.addChild(Lowerjaw4);
        this.setRotateAngle(Lowerjaw4, -0.4882F, 0.0F, 0.0F);
        this.Lowerjaw4.cubeList.add(new ModelBox(Lowerjaw4, 27, 50, -1.0F, -2.0F, -2.0F, 2, 2, 2, 0.0F, false));

        this.Lowerbeak = new AdvancedModelRenderer(this);
        this.Lowerbeak.setRotationPoint(-0.01F, -3.0F, -1.4F);
        this.Lowerjaw3.addChild(Lowerbeak);
        this.Lowerbeak.cubeList.add(new ModelBox(Lowerbeak, 49, 20, -1.0F, 0.0F, -2.0F, 2, 2, 2, 0.0F, false));

        this.Jawparting = new AdvancedModelRenderer(this);
        this.Jawparting.setRotationPoint(0.01F, 0.5F, -4.2F);
        this.Lowerjaw1.addChild(Jawparting);
        this.setRotateAngle(Jawparting, -0.3183F, 0.0F, 0.0F);


        this.Eyes = new AdvancedModelRenderer(this);
        this.Eyes.setRotationPoint(0.0F, -2.2843F, -4.2526F);
        this.Head.addChild(Eyes);
        this.setRotateAngle(Eyes, -0.0637F, 0.0F, 0.0F);
        this.Eyes.cubeList.add(new ModelBox(Eyes, 34, 21, -1.99F, -1.5F, -1.8F, 4, 4, 3, 0.01F, false));

        this.Eyes_r1 = new AdvancedModelRenderer(this);
        this.Eyes_r1.setRotationPoint(0.01F, -1.45F, 1.5F);
        this.Eyes.addChild(Eyes_r1);
        this.setRotateAngle(Eyes_r1, -0.2618F, 0.0F, 0.0F);
        this.Eyes_r1.cubeList.add(new ModelBox(Eyes_r1, 46, 0, -1.5F, 0.05F, -0.3F, 3, 1, 3, 0.0F, false));

        this.Eyes_r2 = new AdvancedModelRenderer(this);
        this.Eyes_r2.setRotationPoint(-2.89F, 2.15F, 1.2F);
        this.Eyes.addChild(Eyes_r2);
        this.setRotateAngle(Eyes_r2, 0.3453F, -0.4873F, 0.3356F);
        this.Eyes_r2.cubeList.add(new ModelBox(Eyes_r2, 14, 15, -0.5F, -3.25F, 0.4F, 1, 3, 1, 0.0F, true));

        this.Eyes_r3 = new AdvancedModelRenderer(this);
        this.Eyes_r3.setRotationPoint(2.91F, 2.15F, 1.2F);
        this.Eyes.addChild(Eyes_r3);
        this.setRotateAngle(Eyes_r3, 0.3453F, 0.4873F, -0.3356F);
        this.Eyes_r3.cubeList.add(new ModelBox(Eyes_r3, 14, 15, -0.5F, -3.25F, 0.4F, 1, 3, 1, 0.0F, false));

        this.Rightupperarm = new AdvancedModelRenderer(this);
        this.Rightupperarm.setRotationPoint(3.3F, 5.6388F, -4.2821F);
        this.Bodyfront.addChild(Rightupperarm);
        this.setRotateAngle(Rightupperarm, 0.8469F, 0.1059F, -1.2821F);
        this.Rightupperarm.cubeList.add(new ModelBox(Rightupperarm, 38, 40, -1.1997F, -0.0792F, -1.8757F, 3, 2, 3, 0.0F, false));
        this.Rightupperarm.cubeList.add(new ModelBox(Rightupperarm, 48, 36, -0.8997F, 1.9208F, -1.2757F, 2, 3, 2, 0.0F, false));
        this.Rightupperarm.cubeList.add(new ModelBox(Rightupperarm, 39, 29, -0.8997F, 4.9208F, -2.2757F, 2, 2, 4, 0.0F, false));

        this.Rightlowerarm = new AdvancedModelRenderer(this);
        this.Rightlowerarm.setRotationPoint(-0.8997F, 5.7208F, 0.4243F);
        this.Rightupperarm.addChild(Rightlowerarm);
        this.setRotateAngle(Rightlowerarm, -0.8844F, 0.1959F, 1.3144F);
        this.Rightlowerarm.cubeList.add(new ModelBox(Rightlowerarm, 11, 44, -0.5F, -1.0F, -0.5F, 2, 7, 2, 0.0F, false));
        this.Rightlowerarm.cubeList.add(new ModelBox(Rightlowerarm, 47, 46, -0.5F, -1.0F, -2.0F, 2, 7, 1, 0.0F, false));

        this.Rightfrontfoot = new AdvancedModelRenderer(this);
        this.Rightfrontfoot.setRotationPoint(0.0F, 4.53F, 0.3F);
        this.Rightlowerarm.addChild(Rightfrontfoot);
        this.setRotateAngle(Rightfrontfoot, 0.6746F, 0.0F, -0.0213F);
        this.Rightfrontfoot.cubeList.add(new ModelBox(Rightfrontfoot, 30, 0, -1.9F, 0.0F, -4.0F, 5, 2, 5, 0.0F, false));

        this.Leftupperarm = new AdvancedModelRenderer(this);
        this.Leftupperarm.setRotationPoint(-3.3F, 5.6388F, -4.2821F);
        this.Bodyfront.addChild(Leftupperarm);
        this.setRotateAngle(Leftupperarm, -0.5573F, -0.037F, 1.3937F);
        this.Leftupperarm.cubeList.add(new ModelBox(Leftupperarm, 38, 40, -1.8003F, -0.0792F, -1.8757F, 3, 2, 3, 0.0F, true));
        this.Leftupperarm.cubeList.add(new ModelBox(Leftupperarm, 48, 36, -1.1003F, 1.9208F, -1.2757F, 2, 3, 2, 0.0F, true));
        this.Leftupperarm.cubeList.add(new ModelBox(Leftupperarm, 39, 29, -1.1003F, 4.9208F, -2.2757F, 2, 2, 4, 0.0F, true));

        this.Leftlowerarm = new AdvancedModelRenderer(this);
        this.Leftlowerarm.setRotationPoint(0.8997F, 5.7208F, 0.4243F);
        this.Leftupperarm.addChild(Leftlowerarm);
        this.setRotateAngle(Leftlowerarm, 0.1086F, -0.1798F, -1.4913F);
        this.Leftlowerarm.cubeList.add(new ModelBox(Leftlowerarm, 11, 44, -1.5F, -1.0F, -0.5F, 2, 7, 2, 0.0F, true));
        this.Leftlowerarm.cubeList.add(new ModelBox(Leftlowerarm, 47, 46, -1.5F, -1.0F, -2.0F, 2, 7, 1, 0.0F, true));

        this.Leftfrontfoot = new AdvancedModelRenderer(this);
        this.Leftfrontfoot.setRotationPoint(0.0F, 4.53F, 0.3F);
        this.Leftlowerarm.addChild(Leftfrontfoot);
        this.setRotateAngle(Leftfrontfoot, 0.0199F, -0.0026F, 0.1522F);
        this.Leftfrontfoot.cubeList.add(new ModelBox(Leftfrontfoot, 30, 0, -3.1F, 0.0F, -4.0F, 5, 2, 5, 0.0F, true));

        this.Tail1 = new AdvancedModelRenderer(this);
        this.Tail1.setRotationPoint(0.0F, -0.9446F, 16.6702F);
        this.Hips.addChild(Tail1);
        this.setRotateAngle(Tail1, -0.3879F, -0.3662F, 0.1452F);
        this.Tail1.cubeList.add(new ModelBox(Tail1, 46, 14, -1.0F, -0.8963F, -0.3183F, 2, 2, 3, -0.001F, false));

        this.Tail2 = new AdvancedModelRenderer(this);
        this.Tail2.setRotationPoint(0.0F, -0.3034F, 2.4703F);
        this.Tail1.addChild(Tail2);
        this.setRotateAngle(Tail2, -0.2702F, -0.3374F, 0.0914F);
        this.Tail2.cubeList.add(new ModelBox(Tail2, 48, 26, -1.0F, -0.5898F, -0.137F, 2, 1, 3, 0.0F, false));

        this.Tail3 = new AdvancedModelRenderer(this);
        this.Tail3.setRotationPoint(0.0F, -0.0399F, 2.5309F);
        this.Tail2.addChild(Tail3);
        this.setRotateAngle(Tail3, -0.3557F, -0.454F, 0.1615F);
        this.Tail3.cubeList.add(new ModelBox(Tail3, 3, 27, -0.5F, -0.5011F, -0.3162F, 1, 1, 2, 0.0F, false));

        this.Rightthigh = new AdvancedModelRenderer(this);
        this.Rightthigh.setRotationPoint(2.9F, 1.9554F, 12.2702F);
        this.Hips.addChild(Rightthigh);
        this.setRotateAngle(Rightthigh, 0.4785F, 0.0152F, -1.0078F);
        this.Rightthigh.cubeList.add(new ModelBox(Rightthigh, 29, 40, -1.0285F, -0.5839F, -0.9225F, 2, 7, 2, 0.0F, false));

        this.Rightshin = new AdvancedModelRenderer(this);
        this.Rightshin.setRotationPoint(-0.7285F, 5.9161F, -0.1225F);
        this.Rightthigh.addChild(Rightshin);
        this.setRotateAngle(Rightshin, 0.2508F, -0.2325F, 1.2031F);
        this.Rightshin.cubeList.add(new ModelBox(Rightshin, 0, 15, -0.8248F, -0.3182F, -1.2453F, 2, 6, 2, 0.0F, false));
        this.Rightshin.cubeList.add(new ModelBox(Rightshin, 17, 0, -0.8248F, -0.3182F, 1.4547F, 2, 6, 1, 0.0F, false));

        this.Righthindfoot = new AdvancedModelRenderer(this);
        this.Righthindfoot.setRotationPoint(0.0752F, 4.6818F, 0.6547F);
        this.Rightshin.addChild(Righthindfoot);
        this.setRotateAngle(Righthindfoot, -0.0637F, -0.4245F, 0.0213F);
        this.Righthindfoot.cubeList.add(new ModelBox(Righthindfoot, 14, 15, -2.5F, 0.0F, -4.0F, 5, 2, 6, 0.0F, false));

        this.Leftthigh = new AdvancedModelRenderer(this);
        this.Leftthigh.setRotationPoint(-2.9F, 1.9554F, 12.2702F);
        this.Hips.addChild(Leftthigh);
        this.setRotateAngle(Leftthigh, -0.5751F, -0.0299F, 0.7061F);
        this.Leftthigh.cubeList.add(new ModelBox(Leftthigh, 29, 40, -0.9715F, -0.5839F, -0.9225F, 2, 7, 2, 0.0F, true));

        this.Leftshin = new AdvancedModelRenderer(this);
        this.Leftshin.setRotationPoint(0.7285F, 5.9161F, -0.1225F);
        this.Leftthigh.addChild(Leftshin);
        this.setRotateAngle(Leftshin, 0.5754F, 0.1343F, -0.8622F);
        this.Leftshin.cubeList.add(new ModelBox(Leftshin, 0, 15, -1.1752F, -0.3182F, -1.2453F, 2, 6, 2, 0.0F, true));
        this.Leftshin.cubeList.add(new ModelBox(Leftshin, 17, 0, -1.1752F, -0.3182F, 1.4547F, 2, 6, 1, 0.0F, true));

        this.Lefthindfoot = new AdvancedModelRenderer(this);
        this.Lefthindfoot.setRotationPoint(-0.0752F, 4.6818F, 0.6547F);
        this.Leftshin.addChild(Lefthindfoot);
        this.setRotateAngle(Lefthindfoot, -0.0637F, 0.4245F, -0.0213F);
        this.Lefthindfoot.cubeList.add(new ModelBox(Lefthindfoot, 14, 15, -2.5F, 0.0F, -4.0F, 5, 2, 6, 0.0F, true));

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
