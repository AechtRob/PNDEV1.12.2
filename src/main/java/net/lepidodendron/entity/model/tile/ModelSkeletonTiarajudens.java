package net.lepidodendron.entity.model.tile;

import net.ilexiconn.llibrary.client.model.tools.AdvancedModelBase;
import net.ilexiconn.llibrary.client.model.tools.AdvancedModelRenderer;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;

public class ModelSkeletonTiarajudens extends AdvancedModelBase {
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
    private final AdvancedModelRenderer Neck_r31;
    private final AdvancedModelRenderer Neck_r32;
    private final AdvancedModelRenderer Neck_r33;
    private final AdvancedModelRenderer Neck_r34;
    private final AdvancedModelRenderer Neck_r35;
    private final AdvancedModelRenderer Bodyfront_r1;
    private final AdvancedModelRenderer Bodyfront_r2;
    private final AdvancedModelRenderer Bodyfront_r3;
    private final AdvancedModelRenderer Bodyfront_r4;
    private final AdvancedModelRenderer Neck_r36;
    private final AdvancedModelRenderer Bodyfront_r5;
    private final AdvancedModelRenderer Neck;
    private final AdvancedModelRenderer Neck_r37;
    private final AdvancedModelRenderer Neck_r38;
    private final AdvancedModelRenderer Neck_r39;
    private final AdvancedModelRenderer Head;
    private final AdvancedModelRenderer Upperjaw1;
    private final AdvancedModelRenderer Upperjaw2;
    private final AdvancedModelRenderer Upperjaw3_r1;
    private final AdvancedModelRenderer Upperjaw4_r1;
    private final AdvancedModelRenderer Upperjaw3_r2;
    private final AdvancedModelRenderer Upperjaw2_r1;
    private final AdvancedModelRenderer Upperlip;
    private final AdvancedModelRenderer Upperteeth;
    private final AdvancedModelRenderer Righttusk;
    private final AdvancedModelRenderer Righttuskend;
    private final AdvancedModelRenderer Headslope;
    private final AdvancedModelRenderer Headslope_r1;
    private final AdvancedModelRenderer Lowerjaw1;
    private final AdvancedModelRenderer Lowerjaw4_r1;
    private final AdvancedModelRenderer Lowerjaw3_r1;
    private final AdvancedModelRenderer Lowerjaw2;
    private final AdvancedModelRenderer Lowerjaw3_r2;
    private final AdvancedModelRenderer Lowerjaw3;
    private final AdvancedModelRenderer Lowerjaw4;
    private final AdvancedModelRenderer Lowerjaw5;
    private final AdvancedModelRenderer Lowerlip;
    private final AdvancedModelRenderer Lowerteeth;
    private final AdvancedModelRenderer Jawparting;
    private final AdvancedModelRenderer Leftupperarm;
    private final AdvancedModelRenderer Leftlowerarm;
    private final AdvancedModelRenderer Leftfrontfoot;
    private final AdvancedModelRenderer Rightupperarm;
    private final AdvancedModelRenderer Rightlowerarm;
    private final AdvancedModelRenderer Rightfrontfoot;
    private final AdvancedModelRenderer Tail1;
    private final AdvancedModelRenderer Tail2;
    private final AdvancedModelRenderer Tail3;
    private final AdvancedModelRenderer Tail4;
    private final AdvancedModelRenderer Leftthigh;
    private final AdvancedModelRenderer Leftshin;
    private final AdvancedModelRenderer Lefthindfoot;
    private final AdvancedModelRenderer Rightthigh;
    private final AdvancedModelRenderer Rightshin;
    private final AdvancedModelRenderer Righthindfoot;

    public ModelSkeletonTiarajudens() {
        this.textureWidth = 70;
        this.textureHeight = 70;

        this.root = new AdvancedModelRenderer(this);
        this.root.setRotationPoint(1.0F, 13.0F, 0.0F);


        this.Hips = new AdvancedModelRenderer(this);
        this.Hips.setRotationPoint(1.0F, 1.3F, 8.1F);
        this.root.addChild(Hips);
        this.setRotateAngle(Hips, -0.3656F, 0.0F, 0.0F);
        this.Hips.cubeList.add(new ModelBox(Hips, 0, 0, -1.0F, -0.8692F, -4.3079F, 2, 2, 9, -0.001F, false));

        this.Hips_r1 = new AdvancedModelRenderer(this);
        this.Hips_r1.setRotationPoint(-1.0F, -0.6369F, -2.3646F);
        this.Hips.addChild(Hips_r1);
        this.setRotateAngle(Hips_r1, -0.2182F, 0.0F, 0.0F);
        this.Hips_r1.cubeList.add(new ModelBox(Hips_r1, 24, 48, -1.0F, -0.2489F, 1.9788F, 2, 1, 4, 0.001F, true));
        this.Hips_r1.cubeList.add(new ModelBox(Hips_r1, 33, 20, -2.0F, -0.2489F, 0.9788F, 1, 3, 6, 0.001F, true));
        this.Hips_r1.cubeList.add(new ModelBox(Hips_r1, 33, 20, 3.0F, -0.2489F, 0.9788F, 1, 3, 6, 0.001F, false));
        this.Hips_r1.cubeList.add(new ModelBox(Hips_r1, 24, 48, 1.0F, -0.2489F, 1.9788F, 2, 1, 4, 0.001F, false));

        this.Hips_r2 = new AdvancedModelRenderer(this);
        this.Hips_r2.setRotationPoint(-3.0F, 3.5631F, 0.2354F);
        this.Hips.addChild(Hips_r2);
        this.setRotateAngle(Hips_r2, -0.6419F, 0.291F, -0.2113F);
        this.Hips_r2.cubeList.add(new ModelBox(Hips_r2, 0, 32, -0.1F, -1.5923F, 0.3171F, 1, 3, 6, 0.001F, true));

        this.Hips_r3 = new AdvancedModelRenderer(this);
        this.Hips_r3.setRotationPoint(3.0F, 3.5631F, 0.2354F);
        this.Hips.addChild(Hips_r3);
        this.setRotateAngle(Hips_r3, -0.6419F, -0.291F, 0.2113F);
        this.Hips_r3.cubeList.add(new ModelBox(Hips_r3, 0, 32, -0.9F, -1.5923F, 0.3171F, 1, 3, 6, 0.001F, false));

        this.Neck_r1 = new AdvancedModelRenderer(this);
        this.Neck_r1.setRotationPoint(-1.0F, 0.4853F, -2.6969F);
        this.Hips.addChild(Neck_r1);
        this.setRotateAngle(Neck_r1, -0.0395F, 0.0184F, 0.436F);
        this.Neck_r1.cubeList.add(new ModelBox(Neck_r1, 14, 6, -1.1382F, 1.6228F, -0.4261F, 0, 1, 1, 0.0F, true));

        this.Neck_r2 = new AdvancedModelRenderer(this);
        this.Neck_r2.setRotationPoint(-1.0F, 0.4853F, -2.6969F);
        this.Hips.addChild(Neck_r2);
        this.setRotateAngle(Neck_r2, -0.0218F, 0.0378F, 1.0468F);
        this.Neck_r2.cubeList.add(new ModelBox(Neck_r2, 13, 23, -0.0148F, -0.02F, -0.4261F, 0, 2, 1, 0.0F, true));

        this.Neck_r3 = new AdvancedModelRenderer(this);
        this.Neck_r3.setRotationPoint(1.0F, 0.4853F, -2.6969F);
        this.Hips.addChild(Neck_r3);
        this.setRotateAngle(Neck_r3, -0.0218F, -0.0378F, -1.0468F);
        this.Neck_r3.cubeList.add(new ModelBox(Neck_r3, 13, 23, 0.0148F, -0.02F, -0.4261F, 0, 2, 1, 0.0F, false));

        this.Neck_r4 = new AdvancedModelRenderer(this);
        this.Neck_r4.setRotationPoint(1.0F, 0.4853F, -2.6969F);
        this.Hips.addChild(Neck_r4);
        this.setRotateAngle(Neck_r4, -0.0395F, -0.0184F, -0.436F);
        this.Neck_r4.cubeList.add(new ModelBox(Neck_r4, 14, 6, 1.1382F, 1.6228F, -0.4261F, 0, 1, 1, 0.0F, false));

        this.Bodymiddle = new AdvancedModelRenderer(this);
        this.Bodymiddle.setRotationPoint(0.0F, 0.0308F, -3.7079F);
        this.Hips.addChild(Bodymiddle);
        this.setRotateAngle(Bodymiddle, 0.1521F, 0.2157F, 0.0328F);
        this.Bodymiddle.cubeList.add(new ModelBox(Bodymiddle, 15, 13, -1.0F, -0.9071F, -7.8953F, 2, 2, 8, 0.0F, false));

        this.Neck_r5 = new AdvancedModelRenderer(this);
        this.Neck_r5.setRotationPoint(-1.0F, 0.4475F, -0.8843F);
        this.Bodymiddle.addChild(Neck_r5);
        this.setRotateAngle(Neck_r5, -0.0791F, 0.0368F, 0.4349F);
        this.Neck_r5.cubeList.add(new ModelBox(Neck_r5, 36, 20, -1.1382F, 1.6228F, -0.4261F, 0, 2, 1, 0.0F, true));

        this.Neck_r6 = new AdvancedModelRenderer(this);
        this.Neck_r6.setRotationPoint(-1.0F, 0.4475F, -0.8843F);
        this.Bodymiddle.addChild(Neck_r6);
        this.setRotateAngle(Neck_r6, -0.0437F, 0.0756F, 1.0455F);
        this.Neck_r6.cubeList.add(new ModelBox(Neck_r6, 39, 0, -0.0148F, -0.02F, -0.4261F, 0, 2, 1, 0.0F, true));

        this.Neck_r7 = new AdvancedModelRenderer(this);
        this.Neck_r7.setRotationPoint(-1.0F, 0.3475F, -2.8843F);
        this.Bodymiddle.addChild(Neck_r7);
        this.setRotateAngle(Neck_r7, -0.0395F, 0.0184F, 0.436F);
        this.Neck_r7.cubeList.add(new ModelBox(Neck_r7, 17, 12, -1.1382F, 1.6228F, -0.4261F, 0, 4, 1, 0.0F, true));

        this.Neck_r8 = new AdvancedModelRenderer(this);
        this.Neck_r8.setRotationPoint(-1.0F, 0.3475F, -2.8843F);
        this.Bodymiddle.addChild(Neck_r8);
        this.setRotateAngle(Neck_r8, -0.0218F, 0.0378F, 1.0468F);
        this.Neck_r8.cubeList.add(new ModelBox(Neck_r8, 40, 30, -0.0148F, -0.02F, -0.4261F, 0, 2, 1, 0.0F, true));

        this.Neck_r9 = new AdvancedModelRenderer(this);
        this.Neck_r9.setRotationPoint(-1.0F, 0.3475F, -4.8843F);
        this.Bodymiddle.addChild(Neck_r9);
        this.setRotateAngle(Neck_r9, 0.0395F, -0.0184F, 0.436F);
        this.Neck_r9.cubeList.add(new ModelBox(Neck_r9, 20, 51, -1.1382F, 1.6228F, -0.4261F, 0, 5, 1, 0.0F, true));

        this.Neck_r10 = new AdvancedModelRenderer(this);
        this.Neck_r10.setRotationPoint(-1.0F, 0.3475F, -4.8843F);
        this.Bodymiddle.addChild(Neck_r10);
        this.setRotateAngle(Neck_r10, 0.0218F, -0.0378F, 1.0468F);
        this.Neck_r10.cubeList.add(new ModelBox(Neck_r10, 39, 41, -0.0148F, -0.02F, -0.4261F, 0, 2, 1, 0.0F, true));

        this.Neck_r11 = new AdvancedModelRenderer(this);
        this.Neck_r11.setRotationPoint(-1.0F, 0.3475F, -6.8843F);
        this.Bodymiddle.addChild(Neck_r11);
        this.setRotateAngle(Neck_r11, 0.1188F, -0.0552F, 0.4331F);
        this.Neck_r11.cubeList.add(new ModelBox(Neck_r11, 34, 54, -1.1382F, 1.6228F, -0.4261F, 0, 6, 1, 0.0F, true));

        this.Neck_r12 = new AdvancedModelRenderer(this);
        this.Neck_r12.setRotationPoint(-1.0F, 0.3475F, -6.8843F);
        this.Bodymiddle.addChild(Neck_r12);
        this.setRotateAngle(Neck_r12, 0.0657F, -0.1133F, 1.0435F);
        this.Neck_r12.cubeList.add(new ModelBox(Neck_r12, 0, 42, -0.0148F, -0.02F, -0.4261F, 0, 2, 1, 0.0F, true));

        this.Neck_r13 = new AdvancedModelRenderer(this);
        this.Neck_r13.setRotationPoint(1.0F, 0.4475F, -0.8843F);
        this.Bodymiddle.addChild(Neck_r13);
        this.setRotateAngle(Neck_r13, -0.0437F, -0.0756F, -1.0455F);
        this.Neck_r13.cubeList.add(new ModelBox(Neck_r13, 39, 0, 0.0148F, -0.02F, -0.4261F, 0, 2, 1, 0.0F, false));

        this.Neck_r14 = new AdvancedModelRenderer(this);
        this.Neck_r14.setRotationPoint(1.0F, 0.4475F, -0.8843F);
        this.Bodymiddle.addChild(Neck_r14);
        this.setRotateAngle(Neck_r14, -0.0791F, -0.0368F, -0.4349F);
        this.Neck_r14.cubeList.add(new ModelBox(Neck_r14, 36, 20, 1.1382F, 1.6228F, -0.4261F, 0, 2, 1, 0.0F, false));

        this.Neck_r15 = new AdvancedModelRenderer(this);
        this.Neck_r15.setRotationPoint(1.0F, 0.3475F, -2.8843F);
        this.Bodymiddle.addChild(Neck_r15);
        this.setRotateAngle(Neck_r15, -0.0218F, -0.0378F, -1.0468F);
        this.Neck_r15.cubeList.add(new ModelBox(Neck_r15, 40, 30, 0.0148F, -0.02F, -0.4261F, 0, 2, 1, 0.0F, false));

        this.Neck_r16 = new AdvancedModelRenderer(this);
        this.Neck_r16.setRotationPoint(1.0F, 0.3475F, -2.8843F);
        this.Bodymiddle.addChild(Neck_r16);
        this.setRotateAngle(Neck_r16, -0.0395F, -0.0184F, -0.436F);
        this.Neck_r16.cubeList.add(new ModelBox(Neck_r16, 17, 12, 1.1382F, 1.6228F, -0.4261F, 0, 4, 1, 0.0F, false));

        this.Neck_r17 = new AdvancedModelRenderer(this);
        this.Neck_r17.setRotationPoint(1.0F, 0.3475F, -4.8843F);
        this.Bodymiddle.addChild(Neck_r17);
        this.setRotateAngle(Neck_r17, 0.0218F, 0.0378F, -1.0468F);
        this.Neck_r17.cubeList.add(new ModelBox(Neck_r17, 39, 41, 0.0148F, -0.02F, -0.4261F, 0, 2, 1, 0.0F, false));

        this.Neck_r18 = new AdvancedModelRenderer(this);
        this.Neck_r18.setRotationPoint(1.0F, 0.3475F, -4.8843F);
        this.Bodymiddle.addChild(Neck_r18);
        this.setRotateAngle(Neck_r18, 0.0395F, 0.0184F, -0.436F);
        this.Neck_r18.cubeList.add(new ModelBox(Neck_r18, 20, 51, 1.1382F, 1.6228F, -0.4261F, 0, 5, 1, 0.0F, false));

        this.Neck_r19 = new AdvancedModelRenderer(this);
        this.Neck_r19.setRotationPoint(1.0F, 0.3475F, -6.8843F);
        this.Bodymiddle.addChild(Neck_r19);
        this.setRotateAngle(Neck_r19, 0.0657F, 0.1133F, -1.0435F);
        this.Neck_r19.cubeList.add(new ModelBox(Neck_r19, 0, 42, 0.0148F, -0.02F, -0.4261F, 0, 2, 1, 0.0F, false));

        this.Neck_r20 = new AdvancedModelRenderer(this);
        this.Neck_r20.setRotationPoint(1.0F, 0.3475F, -6.8843F);
        this.Bodymiddle.addChild(Neck_r20);
        this.setRotateAngle(Neck_r20, 0.1188F, 0.0552F, -0.4331F);
        this.Neck_r20.cubeList.add(new ModelBox(Neck_r20, 34, 54, 1.1382F, 1.6228F, -0.4261F, 0, 6, 1, 0.0F, false));

        this.Bodyfront = new AdvancedModelRenderer(this);
        this.Bodyfront.setRotationPoint(0.0F, -0.1071F, -7.8953F);
        this.Bodymiddle.addChild(Bodyfront);
        this.setRotateAngle(Bodyfront, 0.1098F, 0.2603F, 0.0284F);


        this.Neck_r21 = new AdvancedModelRenderer(this);
        this.Neck_r21.setRotationPoint(-1.0F, 0.5997F, -0.9383F);
        this.Bodyfront.addChild(Neck_r21);
        this.setRotateAngle(Neck_r21, 0.1188F, -0.0552F, 0.4331F);
        this.Neck_r21.cubeList.add(new ModelBox(Neck_r21, 31, 54, -1.1382F, 1.6228F, -0.4261F, 0, 7, 1, 0.0F, true));

        this.Neck_r22 = new AdvancedModelRenderer(this);
        this.Neck_r22.setRotationPoint(-1.0F, 0.5997F, -0.9383F);
        this.Bodyfront.addChild(Neck_r22);
        this.setRotateAngle(Neck_r22, 0.0657F, -0.1133F, 1.0435F);
        this.Neck_r22.cubeList.add(new ModelBox(Neck_r22, 3, 42, -0.0148F, -0.02F, -0.4261F, 0, 2, 1, 0.0F, true));

        this.Neck_r23 = new AdvancedModelRenderer(this);
        this.Neck_r23.setRotationPoint(-1.0F, 0.9997F, -2.9383F);
        this.Bodyfront.addChild(Neck_r23);
        this.setRotateAngle(Neck_r23, 0.1983F, -0.0916F, 0.4272F);
        this.Neck_r23.cubeList.add(new ModelBox(Neck_r23, 8, 59, -1.1382F, 1.6228F, -0.4261F, 0, 6, 1, 0.0F, true));

        this.Neck_r24 = new AdvancedModelRenderer(this);
        this.Neck_r24.setRotationPoint(-1.0F, 0.9997F, -2.9383F);
        this.Bodyfront.addChild(Neck_r24);
        this.setRotateAngle(Neck_r24, 0.1104F, -0.1886F, 1.0367F);
        this.Neck_r24.cubeList.add(new ModelBox(Neck_r24, 23, 42, -0.0148F, -0.02F, -0.4261F, 0, 2, 1, 0.0F, true));

        this.Neck_r25 = new AdvancedModelRenderer(this);
        this.Neck_r25.setRotationPoint(-1.0F, 1.2997F, -4.9383F);
        this.Bodyfront.addChild(Neck_r25);
        this.setRotateAngle(Neck_r25, 0.2783F, -0.1274F, 0.4185F);
        this.Neck_r25.cubeList.add(new ModelBox(Neck_r25, 20, 12, -1.1382F, 1.6228F, -0.4261F, 0, 4, 1, 0.0F, true));

        this.Neck_r26 = new AdvancedModelRenderer(this);
        this.Neck_r26.setRotationPoint(-1.0F, 1.2997F, -4.9383F);
        this.Bodyfront.addChild(Neck_r26);
        this.setRotateAngle(Neck_r26, 0.1564F, -0.2635F, 1.0264F);
        this.Neck_r26.cubeList.add(new ModelBox(Neck_r26, 26, 42, -0.0148F, -0.02F, -0.4261F, 0, 2, 1, 0.0F, true));

        this.Neck_r27 = new AdvancedModelRenderer(this);
        this.Neck_r27.setRotationPoint(-1.0F, 1.5997F, -6.9383F);
        this.Bodyfront.addChild(Neck_r27);
        this.setRotateAngle(Neck_r27, 0.4408F, -0.1964F, 0.3922F);
        this.Neck_r27.cubeList.add(new ModelBox(Neck_r27, 29, 42, -1.1382F, 1.6228F, -0.4261F, 0, 2, 1, 0.0F, true));

        this.Neck_r28 = new AdvancedModelRenderer(this);
        this.Neck_r28.setRotationPoint(-1.0F, 1.5997F, -6.9383F);
        this.Bodyfront.addChild(Neck_r28);
        this.setRotateAngle(Neck_r28, 0.2546F, -0.4114F, 0.9938F);
        this.Neck_r28.cubeList.add(new ModelBox(Neck_r28, 33, 48, -0.0148F, -0.02F, -0.4261F, 0, 2, 1, 0.0F, true));

        this.Neck_r29 = new AdvancedModelRenderer(this);
        this.Neck_r29.setRotationPoint(1.0F, 0.5997F, -0.9383F);
        this.Bodyfront.addChild(Neck_r29);
        this.setRotateAngle(Neck_r29, 0.0657F, 0.1133F, -1.0435F);
        this.Neck_r29.cubeList.add(new ModelBox(Neck_r29, 3, 42, 0.0148F, -0.02F, -0.4261F, 0, 2, 1, 0.0F, false));

        this.Neck_r30 = new AdvancedModelRenderer(this);
        this.Neck_r30.setRotationPoint(1.0F, 0.5997F, -0.9383F);
        this.Bodyfront.addChild(Neck_r30);
        this.setRotateAngle(Neck_r30, 0.1188F, 0.0552F, -0.4331F);
        this.Neck_r30.cubeList.add(new ModelBox(Neck_r30, 31, 54, 1.1382F, 1.6228F, -0.4261F, 0, 7, 1, 0.0F, false));

        this.Neck_r31 = new AdvancedModelRenderer(this);
        this.Neck_r31.setRotationPoint(1.0F, 0.9997F, -2.9383F);
        this.Bodyfront.addChild(Neck_r31);
        this.setRotateAngle(Neck_r31, 0.1104F, 0.1886F, -1.0367F);
        this.Neck_r31.cubeList.add(new ModelBox(Neck_r31, 23, 42, 0.0148F, -0.02F, -0.4261F, 0, 2, 1, 0.0F, false));

        this.Neck_r32 = new AdvancedModelRenderer(this);
        this.Neck_r32.setRotationPoint(1.0F, 0.9997F, -2.9383F);
        this.Bodyfront.addChild(Neck_r32);
        this.setRotateAngle(Neck_r32, 0.1983F, 0.0916F, -0.4272F);
        this.Neck_r32.cubeList.add(new ModelBox(Neck_r32, 8, 59, 1.1382F, 1.6228F, -0.4261F, 0, 6, 1, 0.0F, false));

        this.Neck_r33 = new AdvancedModelRenderer(this);
        this.Neck_r33.setRotationPoint(1.0F, 1.2997F, -4.9383F);
        this.Bodyfront.addChild(Neck_r33);
        this.setRotateAngle(Neck_r33, 0.1564F, 0.2635F, -1.0264F);
        this.Neck_r33.cubeList.add(new ModelBox(Neck_r33, 26, 42, 0.0148F, -0.02F, -0.4261F, 0, 2, 1, 0.0F, false));

        this.Neck_r34 = new AdvancedModelRenderer(this);
        this.Neck_r34.setRotationPoint(1.0F, 1.2997F, -4.9383F);
        this.Bodyfront.addChild(Neck_r34);
        this.setRotateAngle(Neck_r34, 0.2783F, 0.1274F, -0.4185F);
        this.Neck_r34.cubeList.add(new ModelBox(Neck_r34, 20, 12, 1.1382F, 1.6228F, -0.4261F, 0, 4, 1, 0.0F, false));

        this.Neck_r35 = new AdvancedModelRenderer(this);
        this.Neck_r35.setRotationPoint(1.0F, 1.5997F, -6.9383F);
        this.Bodyfront.addChild(Neck_r35);
        this.setRotateAngle(Neck_r35, 0.4408F, 0.1964F, -0.3922F);
        this.Neck_r35.cubeList.add(new ModelBox(Neck_r35, 29, 42, 1.1382F, 1.6228F, -0.4261F, 0, 2, 1, 0.0F, false));

        this.Bodyfront_r1 = new AdvancedModelRenderer(this);
        this.Bodyfront_r1.setRotationPoint(-3.5F, 6.6185F, -7.5457F);
        this.Bodyfront.addChild(Bodyfront_r1);
        this.setRotateAngle(Bodyfront_r1, -0.04F, -0.2194F, -1.0477F);
        this.Bodyfront_r1.cubeList.add(new ModelBox(Bodyfront_r1, 53, 22, -0.8815F, 0.1509F, -0.5556F, 1, 4, 3, 0.001F, true));

        this.Bodyfront_r2 = new AdvancedModelRenderer(this);
        this.Bodyfront_r2.setRotationPoint(-2.0F, 1.4185F, -7.5457F);
        this.Bodyfront.addChild(Bodyfront_r2);
        this.setRotateAngle(Bodyfront_r2, -0.2222F, -0.0187F, 0.2589F);
        this.Bodyfront_r2.cubeList.add(new ModelBox(Bodyfront_r2, 37, 49, -1.0F, -0.572F, 0.6391F, 1, 6, 3, 0.001F, true));

        this.Bodyfront_r3 = new AdvancedModelRenderer(this);
        this.Bodyfront_r3.setRotationPoint(2.0F, 1.4185F, -7.5457F);
        this.Bodyfront.addChild(Bodyfront_r3);
        this.setRotateAngle(Bodyfront_r3, -0.2222F, 0.0187F, -0.2589F);
        this.Bodyfront_r3.cubeList.add(new ModelBox(Bodyfront_r3, 37, 49, 0.0F, -0.572F, 0.6391F, 1, 6, 3, 0.001F, false));

        this.Bodyfront_r4 = new AdvancedModelRenderer(this);
        this.Bodyfront_r4.setRotationPoint(3.5F, 6.6185F, -7.5457F);
        this.Bodyfront.addChild(Bodyfront_r4);
        this.setRotateAngle(Bodyfront_r4, -0.04F, 0.2194F, 1.0477F);
        this.Bodyfront_r4.cubeList.add(new ModelBox(Bodyfront_r4, 53, 22, -0.1185F, 0.1509F, -0.5556F, 1, 4, 3, 0.001F, false));

        this.Neck_r36 = new AdvancedModelRenderer(this);
        this.Neck_r36.setRotationPoint(1.0F, 1.5997F, -6.9383F);
        this.Bodyfront.addChild(Neck_r36);
        this.setRotateAngle(Neck_r36, 0.2546F, 0.4114F, -0.9938F);
        this.Neck_r36.cubeList.add(new ModelBox(Neck_r36, 33, 48, 0.0148F, -0.02F, -0.4261F, 0, 2, 1, 0.0F, false));

        this.Bodyfront_r5 = new AdvancedModelRenderer(this);
        this.Bodyfront_r5.setRotationPoint(0.0F, 1.1183F, -7.5238F);
        this.Bodyfront.addChild(Bodyfront_r5);
        this.setRotateAngle(Bodyfront_r5, 0.1309F, 0.0F, 0.0F);
        this.Bodyfront_r5.cubeList.add(new ModelBox(Bodyfront_r5, 0, 21, -1.0F, -0.8736F, -0.0382F, 2, 2, 8, 0.001F, false));

        this.Neck = new AdvancedModelRenderer(this);
        this.Neck.setRotationPoint(0.0F, 0.9452F, -7.2493F);
        this.Bodyfront.addChild(Neck);
        this.setRotateAngle(Neck, -0.2428F, 0.8086F, -0.0214F);


        this.Neck_r37 = new AdvancedModelRenderer(this);
        this.Neck_r37.setRotationPoint(0.0F, -0.8167F, -5.3859F);
        this.Neck.addChild(Neck_r37);
        this.setRotateAngle(Neck_r37, -0.0436F, 0.0F, 0.0F);
        this.Neck_r37.cubeList.add(new ModelBox(Neck_r37, 21, 24, -1.0F, -0.2082F, -1.409F, 2, 2, 7, 0.0F, false));

        this.Neck_r38 = new AdvancedModelRenderer(this);
        this.Neck_r38.setRotationPoint(-1.0F, 0.7833F, -3.8859F);
        this.Neck.addChild(Neck_r38);
        this.setRotateAngle(Neck_r38, 0.5468F, -0.3796F, 0.5468F);
        this.Neck_r38.cubeList.add(new ModelBox(Neck_r38, 36, 0, 0.7344F, 0.9679F, 1.2868F, 0, 3, 1, 0.0F, true));
        this.Neck_r38.cubeList.add(new ModelBox(Neck_r38, 36, 48, -0.0149F, -0.0085F, -0.2929F, 0, 2, 1, 0.0F, true));

        this.Neck_r39 = new AdvancedModelRenderer(this);
        this.Neck_r39.setRotationPoint(1.0F, 0.7833F, -3.8859F);
        this.Neck.addChild(Neck_r39);
        this.setRotateAngle(Neck_r39, 0.5468F, 0.3796F, -0.5468F);
        this.Neck_r39.cubeList.add(new ModelBox(Neck_r39, 36, 0, -0.7344F, 0.9679F, 1.2868F, 0, 3, 1, 0.0F, false));
        this.Neck_r39.cubeList.add(new ModelBox(Neck_r39, 36, 48, 0.0149F, -0.0085F, -0.2929F, 0, 2, 1, 0.0F, false));

        this.Head = new AdvancedModelRenderer(this);
        this.Head.setRotationPoint(-0.01F, -0.2167F, -5.1859F);
        this.Neck.addChild(Head);
        this.setRotateAngle(Head, -0.0253F, 0.0198F, 0.1734F);
        this.Head.cubeList.add(new ModelBox(Head, 32, 34, -3.49F, -2.3927F, -0.924F, 7, 5, 1, 0.001F, false));
        this.Head.cubeList.add(new ModelBox(Head, 23, 0, -1.49F, -2.3927F, -6.524F, 3, 5, 6, 0.0F, false));

        this.Upperjaw1 = new AdvancedModelRenderer(this);
        this.Upperjaw1.setRotationPoint(0.0F, -2.7927F, -5.724F);
        this.Head.addChild(Upperjaw1);
        this.setRotateAngle(Upperjaw1, 0.4033F, 0.0F, 0.0F);
        this.Upperjaw1.cubeList.add(new ModelBox(Upperjaw1, 14, 0, -2.49F, 0.0F, -2.0F, 5, 3, 2, -0.001F, false));

        this.Upperjaw2 = new AdvancedModelRenderer(this);
        this.Upperjaw2.setRotationPoint(-0.01F, 0.0F, -2.0F);
        this.Upperjaw1.addChild(Upperjaw2);
        this.setRotateAngle(Upperjaw2, 0.1061F, 0.0F, 0.0F);
        this.Upperjaw2.cubeList.add(new ModelBox(Upperjaw2, 44, 8, -2.48F, 0.0F, -2.0F, 5, 4, 2, 0.0F, false));

        this.Upperjaw3_r1 = new AdvancedModelRenderer(this);
        this.Upperjaw3_r1.setRotationPoint(-2.38F, 4.0F, -1.9F);
        this.Upperjaw2.addChild(Upperjaw3_r1);
        this.setRotateAngle(Upperjaw3_r1, 0.3066F, -0.1666F, -0.0485F);
        this.Upperjaw3_r1.cubeList.add(new ModelBox(Upperjaw3_r1, 9, 32, -0.147F, -0.1352F, 0.0147F, 2, 1, 2, 0.0F, true));

        this.Upperjaw4_r1 = new AdvancedModelRenderer(this);
        this.Upperjaw4_r1.setRotationPoint(-2.38F, 4.0F, -1.9F);
        this.Upperjaw2.addChild(Upperjaw4_r1);
        this.setRotateAngle(Upperjaw4_r1, -0.4352F, -0.1666F, -0.0485F);
        this.Upperjaw4_r1.cubeList.add(new ModelBox(Upperjaw4_r1, 0, 42, -0.147F, -1.4833F, 1.3074F, 1, 1, 6, 0.001F, true));

        this.Upperjaw3_r2 = new AdvancedModelRenderer(this);
        this.Upperjaw3_r2.setRotationPoint(2.42F, 4.0F, -1.9F);
        this.Upperjaw2.addChild(Upperjaw3_r2);
        this.setRotateAngle(Upperjaw3_r2, -0.4352F, 0.1666F, 0.0485F);
        this.Upperjaw3_r2.cubeList.add(new ModelBox(Upperjaw3_r2, 0, 42, -0.853F, -1.4833F, 1.3074F, 1, 1, 6, 0.001F, false));

        this.Upperjaw2_r1 = new AdvancedModelRenderer(this);
        this.Upperjaw2_r1.setRotationPoint(2.42F, 4.0F, -1.9F);
        this.Upperjaw2.addChild(Upperjaw2_r1);
        this.setRotateAngle(Upperjaw2_r1, 0.3066F, 0.1666F, 0.0485F);
        this.Upperjaw2_r1.cubeList.add(new ModelBox(Upperjaw2_r1, 9, 32, -1.853F, -0.1352F, 0.0147F, 2, 1, 2, 0.0F, false));

        this.Upperlip = new AdvancedModelRenderer(this);
        this.Upperlip.setRotationPoint(0.0F, 0.0F, -2.0F);
        this.Upperjaw2.addChild(Upperlip);
        this.setRotateAngle(Upperlip, 0.8067F, 0.0F, 0.0F);
        this.Upperlip.cubeList.add(new ModelBox(Upperlip, 42, 0, -1.98F, 0.0F, -3.0F, 4, 4, 3, 0.0F, false));

        this.Upperteeth = new AdvancedModelRenderer(this);
        this.Upperteeth.setRotationPoint(0.0F, 0.75F, -4.3F);
        this.Upperlip.addChild(Upperteeth);
        this.setRotateAngle(Upperteeth, 0.3396F, 0.0F, 0.0F);
        this.Upperteeth.cubeList.add(new ModelBox(Upperteeth, 9, 51, -1.5F, 0.0F, 0.0F, 3, 5, 2, 0.0F, false));

        this.Righttusk = new AdvancedModelRenderer(this);
        this.Righttusk.setRotationPoint(2.15F, 5.75F, -2.65F);
        this.Upperjaw2.addChild(Righttusk);
        this.setRotateAngle(Righttusk, -0.5732F, 0.0F, -0.0848F);
        this.Righttusk.cubeList.add(new ModelBox(Righttusk, 0, 12, -0.5F, -2.5F, -0.5F, 1, 4, 1, 0.0F, false));
        this.Righttusk.cubeList.add(new ModelBox(Righttusk, 0, 12, -4.76F, -2.5F, -0.5F, 1, 4, 1, 0.0F, true));

        this.Righttuskend = new AdvancedModelRenderer(this);
        this.Righttuskend.setRotationPoint(0.01F, 1.45F, 0.01F);
        this.Righttusk.addChild(Righttuskend);
        this.setRotateAngle(Righttuskend, 0.1061F, 0.0F, 0.0F);
        this.Righttuskend.cubeList.add(new ModelBox(Righttuskend, 0, 32, -0.5F, 0.0F, -0.5F, 1, 2, 1, 0.0F, false));
        this.Righttuskend.cubeList.add(new ModelBox(Righttuskend, 0, 32, -4.78F, 0.0F, -0.5F, 1, 2, 1, 0.0F, true));

        this.Headslope = new AdvancedModelRenderer(this);
        this.Headslope.setRotationPoint(0.01F, 0.0F, 0.0F);
        this.Upperjaw1.addChild(Headslope);
        this.setRotateAngle(Headslope, -0.5095F, 0.0F, 0.0F);
        this.Headslope.cubeList.add(new ModelBox(Headslope, 57, 5, 1.1F, 0.3F, 2.0F, 2, 3, 1, 0.0F, false));
        this.Headslope.cubeList.add(new ModelBox(Headslope, 57, 5, -3.1F, 0.3F, 2.0F, 2, 3, 1, 0.0F, true));

        this.Headslope_r1 = new AdvancedModelRenderer(this);
        this.Headslope_r1.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.Headslope.addChild(Headslope_r1);
        this.setRotateAngle(Headslope_r1, -0.1309F, 0.0F, 0.0F);
        this.Headslope_r1.cubeList.add(new ModelBox(Headslope_r1, 15, 34, -2.5F, 0.0F, 0.0F, 5, 4, 3, 0.001F, false));

        this.Lowerjaw1 = new AdvancedModelRenderer(this);
        this.Lowerjaw1.setRotationPoint(0.0F, 2.6073F, -0.724F);
        this.Head.addChild(Lowerjaw1);
        this.setRotateAngle(Lowerjaw1, 1.0472F, 0.0F, 0.0F);
        this.Lowerjaw1.cubeList.add(new ModelBox(Lowerjaw1, 49, 48, 2.01F, 0.0F, -4.0F, 1, 3, 4, 0.0F, false));
        this.Lowerjaw1.cubeList.add(new ModelBox(Lowerjaw1, 49, 48, -2.99F, 0.0F, -4.0F, 1, 3, 4, 0.0F, true));

        this.Lowerjaw4_r1 = new AdvancedModelRenderer(this);
        this.Lowerjaw4_r1.setRotationPoint(1.01F, 3.4F, 0.1F);
        this.Lowerjaw1.addChild(Lowerjaw4_r1);
        this.setRotateAngle(Lowerjaw4_r1, -0.1798F, 0.2406F, -0.0433F);
        this.Lowerjaw4_r1.cubeList.add(new ModelBox(Lowerjaw4_r1, 49, 48, 0.0F, -0.6F, -4.1F, 0, 1, 4, 0.0F, false));

        this.Lowerjaw3_r1 = new AdvancedModelRenderer(this);
        this.Lowerjaw3_r1.setRotationPoint(-0.99F, 3.4F, 0.1F);
        this.Lowerjaw1.addChild(Lowerjaw3_r1);
        this.setRotateAngle(Lowerjaw3_r1, -0.1798F, -0.2406F, 0.0433F);
        this.Lowerjaw3_r1.cubeList.add(new ModelBox(Lowerjaw3_r1, 49, 48, 0.0F, -0.6F, -4.1F, 0, 1, 4, 0.0F, true));

        this.Lowerjaw2 = new AdvancedModelRenderer(this);
        this.Lowerjaw2.setRotationPoint(0.0F, -0.2F, -4.5F);
        this.Lowerjaw1.addChild(Lowerjaw2);
        this.setRotateAngle(Lowerjaw2, 0.5308F, 0.0F, 0.0F);


        this.Lowerjaw3_r2 = new AdvancedModelRenderer(this);
        this.Lowerjaw3_r2.setRotationPoint(0.01F, -0.1F, -0.9F);
        this.Lowerjaw2.addChild(Lowerjaw3_r2);
        this.setRotateAngle(Lowerjaw3_r2, -0.3054F, 0.0F, 0.0F);
        this.Lowerjaw3_r2.cubeList.add(new ModelBox(Lowerjaw3_r2, 57, 0, -2.5F, 0.1F, -0.6F, 1, 2, 2, -0.001F, true));
        this.Lowerjaw3_r2.cubeList.add(new ModelBox(Lowerjaw3_r2, 57, 0, 1.5F, 0.1F, -0.6F, 1, 2, 2, -0.001F, false));

        this.Lowerjaw3 = new AdvancedModelRenderer(this);
        this.Lowerjaw3.setRotationPoint(0.01F, 2.0F, -1.7F);
        this.Lowerjaw2.addChild(Lowerjaw3);
        this.setRotateAngle(Lowerjaw3, -0.6793F, 0.0F, 0.0F);
        this.Lowerjaw3.cubeList.add(new ModelBox(Lowerjaw3, 53, 56, 1.5F, -2.0F, -2.0F, 1, 2, 2, 0.0F, false));
        this.Lowerjaw3.cubeList.add(new ModelBox(Lowerjaw3, 53, 56, -2.5F, -2.0F, -2.0F, 1, 2, 2, 0.0F, true));

        this.Lowerjaw4 = new AdvancedModelRenderer(this);
        this.Lowerjaw4.setRotationPoint(0.01F, 0.4F, -2.9F);
        this.Lowerjaw3.addChild(Lowerjaw4);
        this.setRotateAngle(Lowerjaw4, -0.4245F, 0.0F, 0.0F);
        this.Lowerjaw4.cubeList.add(new ModelBox(Lowerjaw4, 28, 12, 0.99F, -2.0F, -1.0F, 1, 2, 1, -0.001F, false));
        this.Lowerjaw4.cubeList.add(new ModelBox(Lowerjaw4, 28, 12, -2.01F, -2.0F, -1.0F, 1, 2, 1, -0.001F, true));
        this.Lowerjaw4.cubeList.add(new ModelBox(Lowerjaw4, 52, 15, -2.01F, -2.0F, -2.0F, 4, 2, 1, 0.0F, false));

        this.Lowerjaw5 = new AdvancedModelRenderer(this);
        this.Lowerjaw5.setRotationPoint(-0.03F, 0.0F, 0.0F);
        this.Lowerjaw4.addChild(Lowerjaw5);
        this.setRotateAngle(Lowerjaw5, 0.407F, 0.0F, 0.0F);
        this.Lowerjaw5.cubeList.add(new ModelBox(Lowerjaw5, 20, 54, 1.02F, -1.0F, 0.0F, 1, 1, 4, 0.0F, false));
        this.Lowerjaw5.cubeList.add(new ModelBox(Lowerjaw5, 20, 54, -1.98F, -1.0F, 0.0F, 1, 1, 4, 0.0F, true));

        this.Lowerlip = new AdvancedModelRenderer(this);
        this.Lowerlip.setRotationPoint(-0.01F, -2.2F, -1.8F);
        this.Lowerjaw3.addChild(Lowerlip);
        this.setRotateAngle(Lowerlip, -0.0848F, 0.0F, 0.0F);
        this.Lowerlip.cubeList.add(new ModelBox(Lowerlip, 15, 43, 1.01F, 0.0F, -2.0F, 1, 2, 5, 0.001F, false));
        this.Lowerlip.cubeList.add(new ModelBox(Lowerlip, 15, 43, -1.99F, 0.0F, -2.0F, 1, 2, 5, 0.001F, true));
        this.Lowerlip.cubeList.add(new ModelBox(Lowerlip, 42, 22, -1.99F, 0.0F, -3.0F, 4, 2, 1, 0.001F, false));

        this.Lowerteeth = new AdvancedModelRenderer(this);
        this.Lowerteeth.setRotationPoint(0.0F, 1.1F, -2.75F);
        this.Lowerlip.addChild(Lowerteeth);
        this.setRotateAngle(Lowerteeth, -0.1061F, 0.0F, 0.0F);
        this.Lowerteeth.cubeList.add(new ModelBox(Lowerteeth, 27, 41, -1.5F, -2.0F, 0.0F, 3, 1, 5, 0.0F, false));

        this.Jawparting = new AdvancedModelRenderer(this);
        this.Jawparting.setRotationPoint(-0.01F, 0.0F, -3.7F);
        this.Lowerjaw1.addChild(Jawparting);
        this.setRotateAngle(Jawparting, -0.4033F, 0.0F, 0.0F);


        this.Leftupperarm = new AdvancedModelRenderer(this);
        this.Leftupperarm.setRotationPoint(-4.3F, 6.8452F, -6.0493F);
        this.Bodyfront.addChild(Leftupperarm);
        this.setRotateAngle(Leftupperarm, 1.2494F, -0.1688F, 0.9296F);
        this.Leftupperarm.cubeList.add(new ModelBox(Leftupperarm, 56, 45, -0.7077F, 0.6F, -1.1379F, 2, 3, 2, 0.0F, true));
        this.Leftupperarm.cubeList.add(new ModelBox(Leftupperarm, 13, 24, -1.2077F, -0.4F, -1.6379F, 3, 1, 3, 0.0F, true));
        this.Leftupperarm.cubeList.add(new ModelBox(Leftupperarm, 9, 42, -0.7077F, 3.6F, -1.6379F, 2, 2, 3, 0.0F, true));

        this.Leftlowerarm = new AdvancedModelRenderer(this);
        this.Leftlowerarm.setRotationPoint(0.4205F, 5.8414F, -0.216F);
        this.Leftupperarm.addChild(Leftlowerarm);
        this.setRotateAngle(Leftlowerarm, -1.5178F, -0.8547F, -0.6648F);
        this.Leftlowerarm.cubeList.add(new ModelBox(Leftlowerarm, 0, 0, -0.622F, -0.5453F, -0.6784F, 2, 6, 2, 0.0F, true));
        this.Leftlowerarm.cubeList.add(new ModelBox(Leftlowerarm, 0, 21, -0.622F, -0.5453F, -2.1784F, 2, 6, 1, 0.0F, true));

        this.Leftfrontfoot = new AdvancedModelRenderer(this);
        this.Leftfrontfoot.setRotationPoint(0.878F, 3.9847F, 0.1216F);
        this.Leftlowerarm.addChild(Leftfrontfoot);
        this.setRotateAngle(Leftfrontfoot, 0.6077F, -0.0616F, 0.0619F);
        this.Leftfrontfoot.cubeList.add(new ModelBox(Leftfrontfoot, 28, 12, -3.0F, 0.0F, -4.0F, 5, 2, 5, 0.0F, true));

        this.Rightupperarm = new AdvancedModelRenderer(this);
        this.Rightupperarm.setRotationPoint(4.3F, 6.8452F, -6.0493F);
        this.Bodyfront.addChild(Rightupperarm);
        this.setRotateAngle(Rightupperarm, 0.5076F, 0.1688F, -0.9296F);
        this.Rightupperarm.cubeList.add(new ModelBox(Rightupperarm, 56, 45, -1.2923F, 0.6F, -1.1379F, 2, 3, 2, 0.0F, false));
        this.Rightupperarm.cubeList.add(new ModelBox(Rightupperarm, 13, 24, -1.7923F, -0.4F, -1.6379F, 3, 1, 3, 0.0F, false));
        this.Rightupperarm.cubeList.add(new ModelBox(Rightupperarm, 9, 42, -1.2923F, 3.6F, -1.6379F, 2, 2, 3, 0.0F, false));

        this.Rightlowerarm = new AdvancedModelRenderer(this);
        this.Rightlowerarm.setRotationPoint(-0.4205F, 5.8414F, -0.216F);
        this.Rightupperarm.addChild(Rightlowerarm);
        this.setRotateAngle(Rightlowerarm, -1.4129F, 0.291F, 1.0617F);
        this.Rightlowerarm.cubeList.add(new ModelBox(Rightlowerarm, 0, 0, -1.378F, -0.5453F, -0.6784F, 2, 6, 2, 0.0F, false));
        this.Rightlowerarm.cubeList.add(new ModelBox(Rightlowerarm, 0, 21, -1.378F, -0.5453F, -2.1784F, 2, 6, 1, 0.0F, false));

        this.Rightfrontfoot = new AdvancedModelRenderer(this);
        this.Rightfrontfoot.setRotationPoint(-0.878F, 3.9847F, 0.1216F);
        this.Rightlowerarm.addChild(Rightfrontfoot);
        this.setRotateAngle(Rightfrontfoot, 1.0877F, 0.0616F, -0.0619F);
        this.Rightfrontfoot.cubeList.add(new ModelBox(Rightfrontfoot, 28, 12, -2.0F, 0.0F, -4.0F, 5, 2, 5, 0.0F, false));

        this.Tail1 = new AdvancedModelRenderer(this);
        this.Tail1.setRotationPoint(0.0F, -0.0692F, 3.9921F);
        this.Hips.addChild(Tail1);
        this.setRotateAngle(Tail1, -0.5224F, 0.0F, 0.0F);
        this.Tail1.cubeList.add(new ModelBox(Tail1, 44, 26, -1.0F, -0.7996F, -0.5212F, 2, 2, 4, 0.001F, false));

        this.Tail2 = new AdvancedModelRenderer(this);
        this.Tail2.setRotationPoint(0.0F, 0.1004F, 3.1788F);
        this.Tail1.addChild(Tail2);
        this.setRotateAngle(Tail2, -0.1798F, -0.387F, 0.0685F);
        this.Tail2.cubeList.add(new ModelBox(Tail2, 49, 33, -1.0F, -0.5737F, -0.1757F, 2, 1, 4, 0.0F, false));

        this.Tail3 = new AdvancedModelRenderer(this);
        this.Tail3.setRotationPoint(0.0F, -0.0737F, 3.3243F);
        this.Tail2.addChild(Tail3);
        this.setRotateAngle(Tail3, -0.5861F, -0.7818F, 0.4375F);
        this.Tail3.cubeList.add(new ModelBox(Tail3, 44, 15, -0.5F, -0.592F, -0.0392F, 1, 1, 5, 0.0F, false));

        this.Tail4 = new AdvancedModelRenderer(this);
        this.Tail4.setRotationPoint(-0.1F, 0.008F, 4.4608F);
        this.Tail3.addChild(Tail4);
        this.setRotateAngle(Tail4, 0.1148F, -0.3904F, -0.0438F);
        this.Tail4.cubeList.add(new ModelBox(Tail4, 53, 39, -0.4F, -0.5989F, 0.0212F, 1, 1, 4, -0.001F, false));

        this.Leftthigh = new AdvancedModelRenderer(this);
        this.Leftthigh.setRotationPoint(-3.3F, 3.2308F, 2.1921F);
        this.Hips.addChild(Leftthigh);
        this.setRotateAngle(Leftthigh, -0.6268F, 0.0244F, 1.6244F);
        this.Leftthigh.cubeList.add(new ModelBox(Leftthigh, 44, 41, -1.1546F, -0.5849F, -0.9382F, 2, 8, 2, 0.0F, true));

        this.Leftshin = new AdvancedModelRenderer(this);
        this.Leftshin.setRotationPoint(0.6282F, 6.9032F, 0.1109F);
        this.Leftthigh.addChild(Leftshin);
        this.setRotateAngle(Leftshin, 0.6552F, 1.3873F, -1.3386F);
        this.Leftshin.cubeList.add(new ModelBox(Leftshin, 0, 50, -1.2972F, -0.8455F, -0.4163F, 2, 7, 2, 0.0F, true));
        this.Leftshin.cubeList.add(new ModelBox(Leftshin, 46, 56, -1.0253F, -0.896F, -1.7887F, 2, 7, 1, 0.0F, true));

        this.Lefthindfoot = new AdvancedModelRenderer(this);
        this.Lefthindfoot.setRotationPoint(0.2028F, 5.1545F, -0.5163F);
        this.Leftshin.addChild(Lefthindfoot);
        this.setRotateAngle(Lefthindfoot, -0.1442F, 0.0505F, 0.1735F);
        this.Lefthindfoot.cubeList.add(new ModelBox(Lefthindfoot, 0, 12, -2.5F, 0.0F, -4.0F, 5, 2, 6, 0.0F, true));

        this.Rightthigh = new AdvancedModelRenderer(this);
        this.Rightthigh.setRotationPoint(3.3F, 3.2308F, 2.1921F);
        this.Hips.addChild(Rightthigh);
        this.setRotateAngle(Rightthigh, -1.0196F, 0.0216F, -1.5608F);
        this.Rightthigh.cubeList.add(new ModelBox(Rightthigh, 44, 41, -0.8454F, -0.5849F, -0.9382F, 2, 8, 2, 0.0F, false));

        this.Rightshin = new AdvancedModelRenderer(this);
        this.Rightshin.setRotationPoint(-0.6282F, 6.9032F, 0.1109F);
        this.Rightthigh.addChild(Rightshin);
        this.setRotateAngle(Rightshin, 0.2007F, -0.979F, 1.8184F);
        this.Rightshin.cubeList.add(new ModelBox(Rightshin, 0, 50, -0.7028F, -0.8455F, -0.4163F, 2, 7, 2, 0.0F, false));
        this.Rightshin.cubeList.add(new ModelBox(Rightshin, 46, 56, -0.9747F, -0.896F, -1.7887F, 2, 7, 1, 0.0F, false));

        this.Righthindfoot = new AdvancedModelRenderer(this);
        this.Righthindfoot.setRotationPoint(-0.2028F, 5.1545F, -0.5163F);
        this.Rightshin.addChild(Righthindfoot);
        this.setRotateAngle(Righthindfoot, -0.0154F, -0.046F, -0.1301F);
        this.Righthindfoot.cubeList.add(new ModelBox(Righthindfoot, 0, 12, -2.5F, 0.0F, -4.0F, 5, 2, 6, 0.0F, false));

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
