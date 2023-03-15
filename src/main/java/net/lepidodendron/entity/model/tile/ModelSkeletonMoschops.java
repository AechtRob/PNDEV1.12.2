package net.lepidodendron.entity.model.tile;

import net.ilexiconn.llibrary.client.model.tools.AdvancedModelBase;
import net.ilexiconn.llibrary.client.model.tools.AdvancedModelRenderer;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;

public class ModelSkeletonMoschops extends AdvancedModelBase {
    private final AdvancedModelRenderer root;
    private final AdvancedModelRenderer Hips;
    private final AdvancedModelRenderer Hips_r1;
    private final AdvancedModelRenderer Hips_r2;
    private final AdvancedModelRenderer Hips_r3;
    private final AdvancedModelRenderer Hips_r4;
    private final AdvancedModelRenderer Hips_r5;
    private final AdvancedModelRenderer Hips_r6;
    private final AdvancedModelRenderer Hips_r7;
    private final AdvancedModelRenderer Hips_r8;
    private final AdvancedModelRenderer Hips_r9;
    private final AdvancedModelRenderer Hips_r10;
    private final AdvancedModelRenderer Belly;
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
    private final AdvancedModelRenderer Neck_r21;
    private final AdvancedModelRenderer Neck_r22;
    private final AdvancedModelRenderer Neck_r23;
    private final AdvancedModelRenderer Neck_r24;
    private final AdvancedModelRenderer Neck_r25;
    private final AdvancedModelRenderer Neck_r26;
    private final AdvancedModelRenderer Neck_r27;
    private final AdvancedModelRenderer Neck_r28;
    private final AdvancedModelRenderer Front;
    private final AdvancedModelRenderer Neck_r29;
    private final AdvancedModelRenderer Neck_r30;
    private final AdvancedModelRenderer Neck_r31;
    private final AdvancedModelRenderer Neck_r32;
    private final AdvancedModelRenderer Neck_r33;
    private final AdvancedModelRenderer Neck_r34;
    private final AdvancedModelRenderer Front_r1;
    private final AdvancedModelRenderer Front_r2;
    private final AdvancedModelRenderer Front_r3;
    private final AdvancedModelRenderer Neck_r35;
    private final AdvancedModelRenderer Front_r4;
    private final AdvancedModelRenderer Neck_r36;
    private final AdvancedModelRenderer Neck_r37;
    private final AdvancedModelRenderer Neck_r38;
    private final AdvancedModelRenderer Front_r5;
    private final AdvancedModelRenderer Front_r6;
    private final AdvancedModelRenderer Front_r7;
    private final AdvancedModelRenderer Front_r8;
    private final AdvancedModelRenderer Neck_r39;
    private final AdvancedModelRenderer Neck_r40;
    private final AdvancedModelRenderer Neck_r41;
    private final AdvancedModelRenderer Neck_r42;
    private final AdvancedModelRenderer Neck_r43;
    private final AdvancedModelRenderer Neck_r44;
    private final AdvancedModelRenderer Neck_r45;
    private final AdvancedModelRenderer Neck_r46;
    private final AdvancedModelRenderer Neck_r47;
    private final AdvancedModelRenderer Neck_r48;
    private final AdvancedModelRenderer Neck;
    private final AdvancedModelRenderer Neck_r49;
    private final AdvancedModelRenderer Neck_r50;
    private final AdvancedModelRenderer Neck_r51;
    private final AdvancedModelRenderer Neck_r52;
    private final AdvancedModelRenderer Neck_r53;
    private final AdvancedModelRenderer Neck_r54;
    private final AdvancedModelRenderer Neck_r55;
    private final AdvancedModelRenderer Neck_r56;
    private final AdvancedModelRenderer Neck_r57;
    private final AdvancedModelRenderer Neck_r58;
    private final AdvancedModelRenderer Head;
    private final AdvancedModelRenderer Lowerjaw;
    private final AdvancedModelRenderer Lowerjaw_r1;
    private final AdvancedModelRenderer Lowerjaw_r2;
    private final AdvancedModelRenderer Upperjaw;
    private final AdvancedModelRenderer Headslope;
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

    public ModelSkeletonMoschops() {
        this.textureWidth = 85;
        this.textureHeight = 85;

        this.root = new AdvancedModelRenderer(this);
        this.root.setRotationPoint(0.0F, 0.0F, 0.0F);


        this.Hips = new AdvancedModelRenderer(this);
        this.Hips.setRotationPoint(0.0F, 6.8F, -1.5F);
        this.root.addChild(Hips);
        this.setRotateAngle(Hips, -0.2759F, 0.0F, 0.0F);
        this.Hips.cubeList.add(new ModelBox(Hips, 21, 0, -1.0F, -4.8867F, 9.4326F, 2, 2, 10, 0.001F, false));

        this.Hips_r1 = new AdvancedModelRenderer(this);
        this.Hips_r1.setRotationPoint(-3.0F, 4.7133F, 14.3326F);
        this.Hips.addChild(Hips_r1);
        this.setRotateAngle(Hips_r1, -0.0484F, 0.4268F, -0.6477F);
        this.Hips_r1.cubeList.add(new ModelBox(Hips_r1, 45, 47, -0.757F, -0.0155F, -3.2994F, 1, 3, 7, 0.0F, true));

        this.Hips_r2 = new AdvancedModelRenderer(this);
        this.Hips_r2.setRotationPoint(-4.2F, 1.6133F, 14.3326F);
        this.Hips.addChild(Hips_r2);
        this.setRotateAngle(Hips_r2, 0.0072F, 0.3355F, -0.3043F);
        this.Hips_r2.cubeList.add(new ModelBox(Hips_r2, 11, 57, -0.2183F, -0.7063F, -2.2658F, 1, 5, 4, -0.001F, true));

        this.Hips_r3 = new AdvancedModelRenderer(this);
        this.Hips_r3.setRotationPoint(-3.6F, -1.3867F, 14.3326F);
        this.Hips.addChild(Hips_r3);
        this.setRotateAngle(Hips_r3, 0.1392F, 0.3063F, 0.1087F);
        this.Hips_r3.cubeList.add(new ModelBox(Hips_r3, 63, 35, -0.7767F, -0.4997F, -2.7694F, 1, 3, 4, 0.0F, true));

        this.Hips_r4 = new AdvancedModelRenderer(this);
        this.Hips_r4.setRotationPoint(-2.7F, -3.7867F, 14.3326F);
        this.Hips.addChild(Hips_r4);
        this.setRotateAngle(Hips_r4, 0.0573F, 0.33F, 0.4239F);
        this.Hips_r4.cubeList.add(new ModelBox(Hips_r4, 35, 42, -0.7646F, -0.8035F, -3.9252F, 1, 4, 7, 0.0F, true));

        this.Hips_r5 = new AdvancedModelRenderer(this);
        this.Hips_r5.setRotationPoint(3.0F, 4.7133F, 14.3326F);
        this.Hips.addChild(Hips_r5);
        this.setRotateAngle(Hips_r5, -0.0484F, -0.4268F, 0.6477F);
        this.Hips_r5.cubeList.add(new ModelBox(Hips_r5, 45, 47, -0.243F, -0.0155F, -3.2994F, 1, 3, 7, 0.0F, false));

        this.Hips_r6 = new AdvancedModelRenderer(this);
        this.Hips_r6.setRotationPoint(-0.6F, -2.8867F, 14.3326F);
        this.Hips.addChild(Hips_r6);
        this.setRotateAngle(Hips_r6, -0.1261F, 0.1062F, 0.1188F);
        this.Hips_r6.cubeList.add(new ModelBox(Hips_r6, 10, 46, -2.6249F, -1.2442F, -1.8895F, 3, 1, 2, 0.0F, true));

        this.Hips_r7 = new AdvancedModelRenderer(this);
        this.Hips_r7.setRotationPoint(0.6F, -2.8867F, 14.3326F);
        this.Hips.addChild(Hips_r7);
        this.setRotateAngle(Hips_r7, -0.1261F, -0.1062F, -0.1188F);
        this.Hips_r7.cubeList.add(new ModelBox(Hips_r7, 10, 46, -0.3751F, -1.2442F, -1.8895F, 3, 1, 2, 0.0F, false));

        this.Hips_r8 = new AdvancedModelRenderer(this);
        this.Hips_r8.setRotationPoint(2.7F, -3.7867F, 14.3326F);
        this.Hips.addChild(Hips_r8);
        this.setRotateAngle(Hips_r8, 0.0573F, -0.33F, -0.4239F);
        this.Hips_r8.cubeList.add(new ModelBox(Hips_r8, 35, 42, -0.2354F, -0.8035F, -3.9252F, 1, 4, 7, 0.0F, false));

        this.Hips_r9 = new AdvancedModelRenderer(this);
        this.Hips_r9.setRotationPoint(4.2F, 1.6133F, 14.3326F);
        this.Hips.addChild(Hips_r9);
        this.setRotateAngle(Hips_r9, 0.0072F, -0.3355F, 0.3043F);
        this.Hips_r9.cubeList.add(new ModelBox(Hips_r9, 11, 57, -0.7817F, -0.7063F, -2.2658F, 1, 5, 4, -0.001F, false));

        this.Hips_r10 = new AdvancedModelRenderer(this);
        this.Hips_r10.setRotationPoint(3.6F, -1.3867F, 14.3326F);
        this.Hips.addChild(Hips_r10);
        this.setRotateAngle(Hips_r10, 0.1392F, -0.3063F, -0.1087F);
        this.Hips_r10.cubeList.add(new ModelBox(Hips_r10, 63, 35, -0.2233F, -0.4997F, -2.7694F, 1, 3, 4, 0.0F, false));

        this.Belly = new AdvancedModelRenderer(this);
        this.Belly.setRotationPoint(0.0F, -4.0867F, 9.7326F);
        this.Hips.addChild(Belly);
        this.setRotateAngle(Belly, 0.0652F, -0.0871F, -0.0057F);
        this.Belly.cubeList.add(new ModelBox(Belly, 0, 0, -1.0F, -0.7957F, -15.3F, 2, 2, 16, 0.0F, false));

        this.Neck_r1 = new AdvancedModelRenderer(this);
        this.Neck_r1.setRotationPoint(-1.0F, 0.9043F, -1.6F);
        this.Belly.addChild(Neck_r1);
        this.setRotateAngle(Neck_r1, -0.0912F, 0.1215F, 0.0465F);
        this.Neck_r1.cubeList.add(new ModelBox(Neck_r1, 0, 19, -2.1529F, 1.6688F, -0.2301F, 0, 1, 1, 0.0F, true));

        this.Neck_r2 = new AdvancedModelRenderer(this);
        this.Neck_r2.setRotationPoint(-1.0F, 0.9043F, -1.6F);
        this.Belly.addChild(Neck_r2);
        this.setRotateAngle(Neck_r2, 0.0238F, 0.1703F, 0.9265F);
        this.Neck_r2.cubeList.add(new ModelBox(Neck_r2, 0, 0, -0.0647F, -0.1658F, -0.206F, 0, 3, 1, 0.0F, true));

        this.Neck_r3 = new AdvancedModelRenderer(this);
        this.Neck_r3.setRotationPoint(-1.0F, 0.8043F, -3.6F);
        this.Belly.addChild(Neck_r3);
        this.setRotateAngle(Neck_r3, -0.0912F, 0.1215F, 0.0465F);
        this.Neck_r3.cubeList.add(new ModelBox(Neck_r3, 8, 0, -2.1529F, 1.6688F, -0.2301F, 0, 3, 1, 0.0F, true));

        this.Neck_r4 = new AdvancedModelRenderer(this);
        this.Neck_r4.setRotationPoint(-1.0F, 0.8043F, -3.6F);
        this.Belly.addChild(Neck_r4);
        this.setRotateAngle(Neck_r4, 0.0238F, 0.1703F, 0.9265F);
        this.Neck_r4.cubeList.add(new ModelBox(Neck_r4, 36, 0, -0.0647F, -0.1658F, -0.206F, 0, 3, 1, 0.0F, true));

        this.Neck_r5 = new AdvancedModelRenderer(this);
        this.Neck_r5.setRotationPoint(-1.0F, 0.8043F, -5.6F);
        this.Belly.addChild(Neck_r5);
        this.setRotateAngle(Neck_r5, -0.0034F, 0.117F, 0.057F);
        this.Neck_r5.cubeList.add(new ModelBox(Neck_r5, 38, 29, -2.9529F, 2.3688F, -0.2301F, 0, 5, 1, 0.0F, true));

        this.Neck_r6 = new AdvancedModelRenderer(this);
        this.Neck_r6.setRotationPoint(-1.0F, 0.8043F, -5.6F);
        this.Belly.addChild(Neck_r6);
        this.setRotateAngle(Neck_r6, 0.0765F, 0.1003F, 0.9336F);
        this.Neck_r6.cubeList.add(new ModelBox(Neck_r6, 37, 13, -0.0647F, -0.1658F, -0.206F, 0, 4, 1, 0.0F, true));

        this.Neck_r7 = new AdvancedModelRenderer(this);
        this.Neck_r7.setRotationPoint(-1.0F, 0.8043F, -7.6F);
        this.Belly.addChild(Neck_r7);
        this.setRotateAngle(Neck_r7, 0.0397F, 0.1087F, 0.1054F);
        this.Neck_r7.cubeList.add(new ModelBox(Neck_r7, 16, 67, -2.9529F, 2.3688F, -0.2301F, 0, 8, 1, 0.0F, true));

        this.Neck_r8 = new AdvancedModelRenderer(this);
        this.Neck_r8.setRotationPoint(-1.0F, 0.8043F, -7.6F);
        this.Belly.addChild(Neck_r8);
        this.setRotateAngle(Neck_r8, 0.0977F, 0.0621F, 0.979F);
        this.Neck_r8.cubeList.add(new ModelBox(Neck_r8, 40, 13, -0.0647F, -0.1658F, -0.206F, 0, 4, 1, 0.0F, true));

        this.Neck_r9 = new AdvancedModelRenderer(this);
        this.Neck_r9.setRotationPoint(-1.0F, 0.8043F, -9.6F);
        this.Belly.addChild(Neck_r9);
        this.setRotateAngle(Neck_r9, 0.0827F, 0.1002F, 0.1972F);
        this.Neck_r9.cubeList.add(new ModelBox(Neck_r9, 13, 0, -2.9529F, 2.3688F, -0.2301F, 0, 10, 1, 0.0F, true));

        this.Neck_r10 = new AdvancedModelRenderer(this);
        this.Neck_r10.setRotationPoint(-1.0F, 0.8043F, -9.6F);
        this.Belly.addChild(Neck_r10);
        this.setRotateAngle(Neck_r10, 0.1188F, 0.0239F, 1.0672F);
        this.Neck_r10.cubeList.add(new ModelBox(Neck_r10, 41, 29, -0.0647F, -0.1658F, -0.206F, 0, 4, 1, 0.0F, true));

        this.Neck_r11 = new AdvancedModelRenderer(this);
        this.Neck_r11.setRotationPoint(-1.0F, 0.8043F, -11.6F);
        this.Belly.addChild(Neck_r11);
        this.setRotateAngle(Neck_r11, 0.1398F, -0.0143F, 1.0673F);
        this.Neck_r11.cubeList.add(new ModelBox(Neck_r11, 0, 43, -0.0647F, -0.1658F, -0.206F, 0, 4, 1, 0.0F, true));

        this.Neck_r12 = new AdvancedModelRenderer(this);
        this.Neck_r12.setRotationPoint(-1.0F, 0.8043F, -11.6F);
        this.Belly.addChild(Neck_r12);
        this.setRotateAngle(Neck_r12, 0.1257F, 0.0916F, 0.2013F);
        this.Neck_r12.cubeList.add(new ModelBox(Neck_r12, 10, 67, -2.9529F, 2.3688F, -0.2301F, 0, 11, 1, 0.0F, true));

        this.Neck_r13 = new AdvancedModelRenderer(this);
        this.Neck_r13.setRotationPoint(-1.0F, 0.8043F, -13.6F);
        this.Belly.addChild(Neck_r13);
        this.setRotateAngle(Neck_r13, 0.1686F, 0.0828F, 0.2051F);
        this.Neck_r13.cubeList.add(new ModelBox(Neck_r13, 29, 65, -2.9529F, 2.3688F, -0.2301F, 0, 12, 1, 0.0F, true));

        this.Neck_r14 = new AdvancedModelRenderer(this);
        this.Neck_r14.setRotationPoint(-1.0F, 0.8043F, -13.6F);
        this.Belly.addChild(Neck_r14);
        this.setRotateAngle(Neck_r14, 0.1609F, -0.0525F, 1.0666F);
        this.Neck_r14.cubeList.add(new ModelBox(Neck_r14, 3, 43, -0.0647F, -0.1658F, -0.206F, 0, 4, 1, 0.0F, true));

        this.Neck_r15 = new AdvancedModelRenderer(this);
        this.Neck_r15.setRotationPoint(1.0F, 0.9043F, -1.6F);
        this.Belly.addChild(Neck_r15);
        this.setRotateAngle(Neck_r15, 0.0238F, -0.1703F, -0.9265F);
        this.Neck_r15.cubeList.add(new ModelBox(Neck_r15, 0, 0, 0.0647F, -0.1658F, -0.206F, 0, 3, 1, 0.0F, false));

        this.Neck_r16 = new AdvancedModelRenderer(this);
        this.Neck_r16.setRotationPoint(1.0F, 0.9043F, -1.6F);
        this.Belly.addChild(Neck_r16);
        this.setRotateAngle(Neck_r16, -0.0912F, -0.1215F, -0.0465F);
        this.Neck_r16.cubeList.add(new ModelBox(Neck_r16, 0, 19, 2.1529F, 1.6688F, -0.2301F, 0, 1, 1, 0.0F, false));

        this.Neck_r17 = new AdvancedModelRenderer(this);
        this.Neck_r17.setRotationPoint(1.0F, 0.8043F, -3.6F);
        this.Belly.addChild(Neck_r17);
        this.setRotateAngle(Neck_r17, 0.0238F, -0.1703F, -0.9265F);
        this.Neck_r17.cubeList.add(new ModelBox(Neck_r17, 36, 0, 0.0647F, -0.1658F, -0.206F, 0, 3, 1, 0.0F, false));

        this.Neck_r18 = new AdvancedModelRenderer(this);
        this.Neck_r18.setRotationPoint(1.0F, 0.8043F, -3.6F);
        this.Belly.addChild(Neck_r18);
        this.setRotateAngle(Neck_r18, -0.0912F, -0.1215F, -0.0465F);
        this.Neck_r18.cubeList.add(new ModelBox(Neck_r18, 8, 0, 2.1529F, 1.6688F, -0.2301F, 0, 3, 1, 0.0F, false));

        this.Neck_r19 = new AdvancedModelRenderer(this);
        this.Neck_r19.setRotationPoint(1.0F, 0.8043F, -5.6F);
        this.Belly.addChild(Neck_r19);
        this.setRotateAngle(Neck_r19, -0.0034F, -0.117F, -0.057F);
        this.Neck_r19.cubeList.add(new ModelBox(Neck_r19, 38, 29, 2.9529F, 2.3688F, -0.2301F, 0, 5, 1, 0.0F, false));

        this.Neck_r20 = new AdvancedModelRenderer(this);
        this.Neck_r20.setRotationPoint(1.0F, 0.8043F, -5.6F);
        this.Belly.addChild(Neck_r20);
        this.setRotateAngle(Neck_r20, 0.0765F, -0.1003F, -0.9336F);
        this.Neck_r20.cubeList.add(new ModelBox(Neck_r20, 37, 13, 0.0647F, -0.1658F, -0.206F, 0, 4, 1, 0.0F, false));

        this.Neck_r21 = new AdvancedModelRenderer(this);
        this.Neck_r21.setRotationPoint(1.0F, 0.8043F, -7.6F);
        this.Belly.addChild(Neck_r21);
        this.setRotateAngle(Neck_r21, 0.0977F, -0.0621F, -0.979F);
        this.Neck_r21.cubeList.add(new ModelBox(Neck_r21, 40, 13, 0.0647F, -0.1658F, -0.206F, 0, 4, 1, 0.0F, false));

        this.Neck_r22 = new AdvancedModelRenderer(this);
        this.Neck_r22.setRotationPoint(1.0F, 0.8043F, -7.6F);
        this.Belly.addChild(Neck_r22);
        this.setRotateAngle(Neck_r22, 0.0397F, -0.1087F, -0.1054F);
        this.Neck_r22.cubeList.add(new ModelBox(Neck_r22, 16, 67, 2.9529F, 2.3688F, -0.2301F, 0, 8, 1, 0.0F, false));

        this.Neck_r23 = new AdvancedModelRenderer(this);
        this.Neck_r23.setRotationPoint(1.0F, 0.8043F, -9.6F);
        this.Belly.addChild(Neck_r23);
        this.setRotateAngle(Neck_r23, 0.1188F, -0.0239F, -1.0672F);
        this.Neck_r23.cubeList.add(new ModelBox(Neck_r23, 41, 29, 0.0647F, -0.1658F, -0.206F, 0, 4, 1, 0.0F, false));

        this.Neck_r24 = new AdvancedModelRenderer(this);
        this.Neck_r24.setRotationPoint(1.0F, 0.8043F, -9.6F);
        this.Belly.addChild(Neck_r24);
        this.setRotateAngle(Neck_r24, 0.0827F, -0.1002F, -0.1972F);
        this.Neck_r24.cubeList.add(new ModelBox(Neck_r24, 13, 0, 2.9529F, 2.3688F, -0.2301F, 0, 10, 1, 0.0F, false));

        this.Neck_r25 = new AdvancedModelRenderer(this);
        this.Neck_r25.setRotationPoint(1.0F, 0.8043F, -11.6F);
        this.Belly.addChild(Neck_r25);
        this.setRotateAngle(Neck_r25, 0.1398F, 0.0143F, -1.0673F);
        this.Neck_r25.cubeList.add(new ModelBox(Neck_r25, 0, 43, 0.0647F, -0.1658F, -0.206F, 0, 4, 1, 0.0F, false));

        this.Neck_r26 = new AdvancedModelRenderer(this);
        this.Neck_r26.setRotationPoint(1.0F, 0.8043F, -11.6F);
        this.Belly.addChild(Neck_r26);
        this.setRotateAngle(Neck_r26, 0.1257F, -0.0916F, -0.2013F);
        this.Neck_r26.cubeList.add(new ModelBox(Neck_r26, 10, 67, 2.9529F, 2.3688F, -0.2301F, 0, 11, 1, 0.0F, false));

        this.Neck_r27 = new AdvancedModelRenderer(this);
        this.Neck_r27.setRotationPoint(1.0F, 0.8043F, -13.6F);
        this.Belly.addChild(Neck_r27);
        this.setRotateAngle(Neck_r27, 0.1609F, 0.0525F, -1.0666F);
        this.Neck_r27.cubeList.add(new ModelBox(Neck_r27, 3, 43, 0.0647F, -0.1658F, -0.206F, 0, 4, 1, 0.0F, false));

        this.Neck_r28 = new AdvancedModelRenderer(this);
        this.Neck_r28.setRotationPoint(1.0F, 0.8043F, -13.6F);
        this.Belly.addChild(Neck_r28);
        this.setRotateAngle(Neck_r28, 0.1686F, -0.0828F, -0.2051F);
        this.Neck_r28.cubeList.add(new ModelBox(Neck_r28, 29, 65, 2.9529F, 2.3688F, -0.2301F, 0, 12, 1, 0.0F, false));

        this.Front = new AdvancedModelRenderer(this);
        this.Front.setRotationPoint(0.0F, -0.0957F, -14.8F);
        this.Belly.addChild(Front);
        this.setRotateAngle(Front, 0.3233F, -0.0414F, -0.0139F);
        this.Front.cubeList.add(new ModelBox(Front, 0, 19, -1.0F, -0.7022F, -10.5296F, 2, 2, 11, -0.001F, false));

        this.Neck_r29 = new AdvancedModelRenderer(this);
        this.Neck_r29.setRotationPoint(-1.0F, 0.9978F, -0.7296F);
        this.Front.addChild(Neck_r29);
        this.setRotateAngle(Neck_r29, 0.0655F, 0.1037F, 0.1955F);
        this.Neck_r29.cubeList.add(new ModelBox(Neck_r29, 50, 65, -2.9611F, 2.2667F, -0.3276F, 0, 12, 1, 0.0F, true));

        this.Neck_r30 = new AdvancedModelRenderer(this);
        this.Neck_r30.setRotationPoint(-1.0F, 0.9978F, -0.7296F);
        this.Front.addChild(Neck_r30);
        this.setRotateAngle(Neck_r30, 0.1103F, 0.0392F, 1.0669F);
        this.Neck_r30.cubeList.add(new ModelBox(Neck_r30, 45, 42, -0.1459F, -0.2242F, -0.3061F, 0, 4, 1, 0.0F, true));

        this.Neck_r31 = new AdvancedModelRenderer(this);
        this.Neck_r31.setRotationPoint(-4.0F, 2.3978F, -1.5296F);
        this.Front.addChild(Neck_r31);
        this.setRotateAngle(Neck_r31, 0.1199F, 0.0735F, 0.2F);
        this.Neck_r31.cubeList.add(new ModelBox(Neck_r31, 7, 66, -0.2134F, 0.2109F, -1.0624F, 0, 12, 1, 0.0F, true));

        this.Neck_r32 = new AdvancedModelRenderer(this);
        this.Neck_r32.setRotationPoint(-1.0F, 0.8978F, -2.7296F);
        this.Front.addChild(Neck_r32);
        this.setRotateAngle(Neck_r32, 0.1398F, -0.0143F, 1.0673F);
        this.Neck_r32.cubeList.add(new ModelBox(Neck_r32, 31, 48, -0.0585F, -0.1756F, -0.3054F, 0, 4, 1, 0.0F, true));

        this.Neck_r33 = new AdvancedModelRenderer(this);
        this.Neck_r33.setRotationPoint(-1.0F, 0.7978F, -4.5296F);
        this.Front.addChild(Neck_r33);
        this.setRotateAngle(Neck_r33, 0.1736F, -0.0755F, 1.0657F);
        this.Neck_r33.cubeList.add(new ModelBox(Neck_r33, 48, 42, 0.0105F, -0.1654F, -0.5178F, 0, 4, 1, 0.0F, true));

        this.Neck_r34 = new AdvancedModelRenderer(this);
        this.Neck_r34.setRotationPoint(-1.0F, 0.7978F, -4.5296F);
        this.Front.addChild(Neck_r34);
        this.setRotateAngle(Neck_r34, 0.1826F, 0.0414F, 0.2038F);
        this.Neck_r34.cubeList.add(new ModelBox(Neck_r34, 13, 67, -2.9025F, 2.4569F, -0.4148F, 0, 11, 1, 0.0F, true));

        this.Front_r1 = new AdvancedModelRenderer(this);
        this.Front_r1.setRotationPoint(0.0F, 11.2978F, -10.2296F);
        this.Front.addChild(Front_r1);
        this.setRotateAngle(Front_r1, -0.3491F, 0.0F, 0.0F);
        this.Front_r1.cubeList.add(new ModelBox(Front_r1, 2, 12, -2.0F, -0.7F, -1.4F, 4, 1, 1, -0.001F, true));

        this.Front_r2 = new AdvancedModelRenderer(this);
        this.Front_r2.setRotationPoint(-5.0F, 8.7044F, -8.9499F);
        this.Front.addChild(Front_r2);
        this.setRotateAngle(Front_r2, 1.372F, -0.4562F, -0.6204F);
        this.Front_r2.cubeList.add(new ModelBox(Front_r2, 59, 0, -0.0786F, -2.1843F, -4.1036F, 1, 1, 5, -0.001F, true));

        this.Front_r3 = new AdvancedModelRenderer(this);
        this.Front_r3.setRotationPoint(-5.0F, 8.7044F, -6.2499F);
        this.Front.addChild(Front_r3);
        this.setRotateAngle(Front_r3, 1.3872F, -0.242F, -0.6644F);
        this.Front_r3.cubeList.add(new ModelBox(Front_r3, 0, 0, -0.7975F, -3.048F, -4.6355F, 1, 6, 5, -0.001F, true));

        this.Neck_r35 = new AdvancedModelRenderer(this);
        this.Neck_r35.setRotationPoint(-3.9F, 3.0978F, -5.7296F);
        this.Front.addChild(Neck_r35);
        this.setRotateAngle(Neck_r35, 0.2791F, -0.01F, 0.2567F);
        this.Neck_r35.cubeList.add(new ModelBox(Neck_r35, 60, 67, 0.0058F, -0.0819F, -0.496F, 0, 8, 1, 0.0F, true));

        this.Front_r4 = new AdvancedModelRenderer(this);
        this.Front_r4.setRotationPoint(-4.0F, 1.7044F, -6.2499F);
        this.Front.addChild(Front_r4);
        this.setRotateAngle(Front_r4, 1.2682F, -0.0052F, 0.2303F);
        this.Front_r4.cubeList.add(new ModelBox(Front_r4, 0, 43, -0.1732F, -0.9519F, -6.9598F, 1, 4, 7, -0.001F, true));

        this.Neck_r36 = new AdvancedModelRenderer(this);
        this.Neck_r36.setRotationPoint(-1.0F, 0.8978F, -6.9296F);
        this.Front.addChild(Neck_r36);
        this.setRotateAngle(Neck_r36, 0.2249F, -0.167F, 0.8501F);
        this.Neck_r36.cubeList.add(new ModelBox(Neck_r36, 50, 30, -0.0253F, -0.1316F, -0.1131F, 0, 4, 1, 0.0F, true));

        this.Neck_r37 = new AdvancedModelRenderer(this);
        this.Neck_r37.setRotationPoint(-1.0F, 1.1978F, -8.9296F);
        this.Front.addChild(Neck_r37);
        this.setRotateAngle(Neck_r37, 0.3583F, -0.074F, 0.3253F);
        this.Neck_r37.cubeList.add(new ModelBox(Neck_r37, 68, 43, -1.3677F, 2.4413F, -0.1131F, 0, 6, 1, 0.0F, true));

        this.Neck_r38 = new AdvancedModelRenderer(this);
        this.Neck_r38.setRotationPoint(-1.0F, 1.1978F, -8.9296F);
        this.Front.addChild(Neck_r38);
        this.setRotateAngle(Neck_r38, 0.2874F, -0.2291F, 0.7854F);
        this.Neck_r38.cubeList.add(new ModelBox(Neck_r38, 54, 0, -0.0253F, -0.1316F, -0.1131F, 0, 3, 1, 0.0F, true));

        this.Front_r5 = new AdvancedModelRenderer(this);
        this.Front_r5.setRotationPoint(5.0F, 8.7044F, -8.9499F);
        this.Front.addChild(Front_r5);
        this.setRotateAngle(Front_r5, 1.372F, 0.4562F, 0.6204F);
        this.Front_r5.cubeList.add(new ModelBox(Front_r5, 59, 0, -0.9214F, -2.1843F, -4.1036F, 1, 1, 5, -0.001F, false));

        this.Front_r6 = new AdvancedModelRenderer(this);
        this.Front_r6.setRotationPoint(5.0F, 8.7044F, -6.2499F);
        this.Front.addChild(Front_r6);
        this.setRotateAngle(Front_r6, 1.3872F, 0.242F, 0.6644F);
        this.Front_r6.cubeList.add(new ModelBox(Front_r6, 0, 0, -0.2025F, -3.048F, -4.6355F, 1, 6, 5, -0.001F, false));

        this.Front_r7 = new AdvancedModelRenderer(this);
        this.Front_r7.setRotationPoint(4.0F, 1.7044F, -6.2499F);
        this.Front.addChild(Front_r7);
        this.setRotateAngle(Front_r7, 1.2682F, 0.0052F, -0.2303F);
        this.Front_r7.cubeList.add(new ModelBox(Front_r7, 0, 43, -0.8268F, -0.9519F, -6.9598F, 1, 4, 7, -0.001F, false));

        this.Front_r8 = new AdvancedModelRenderer(this);
        this.Front_r8.setRotationPoint(0.0F, 11.2978F, -10.5296F);
        this.Front.addChild(Front_r8);
        this.setRotateAngle(Front_r8, -0.3491F, 0.0F, 0.0F);
        this.Front_r8.cubeList.add(new ModelBox(Front_r8, 16, 19, -3.0F, -0.7F, 0.0F, 6, 1, 8, -0.001F, false));

        this.Neck_r39 = new AdvancedModelRenderer(this);
        this.Neck_r39.setRotationPoint(1.0F, 0.9978F, -0.7296F);
        this.Front.addChild(Neck_r39);
        this.setRotateAngle(Neck_r39, 0.0655F, -0.1037F, -0.1955F);
        this.Neck_r39.cubeList.add(new ModelBox(Neck_r39, 50, 65, 2.9611F, 2.2667F, -0.3276F, 0, 12, 1, 0.0F, false));

        this.Neck_r40 = new AdvancedModelRenderer(this);
        this.Neck_r40.setRotationPoint(1.0F, 0.9978F, -0.7296F);
        this.Front.addChild(Neck_r40);
        this.setRotateAngle(Neck_r40, 0.1103F, -0.0392F, -1.0669F);
        this.Neck_r40.cubeList.add(new ModelBox(Neck_r40, 45, 42, 0.1459F, -0.2242F, -0.3061F, 0, 4, 1, 0.0F, false));

        this.Neck_r41 = new AdvancedModelRenderer(this);
        this.Neck_r41.setRotationPoint(4.0F, 2.3978F, -1.5296F);
        this.Front.addChild(Neck_r41);
        this.setRotateAngle(Neck_r41, 0.1199F, -0.0735F, -0.2F);
        this.Neck_r41.cubeList.add(new ModelBox(Neck_r41, 7, 66, 0.2134F, 0.2109F, -1.0624F, 0, 12, 1, 0.0F, false));

        this.Neck_r42 = new AdvancedModelRenderer(this);
        this.Neck_r42.setRotationPoint(1.0F, 0.8978F, -2.7296F);
        this.Front.addChild(Neck_r42);
        this.setRotateAngle(Neck_r42, 0.1398F, 0.0143F, -1.0673F);
        this.Neck_r42.cubeList.add(new ModelBox(Neck_r42, 31, 48, 0.0585F, -0.1756F, -0.3054F, 0, 4, 1, 0.0F, false));

        this.Neck_r43 = new AdvancedModelRenderer(this);
        this.Neck_r43.setRotationPoint(1.0F, 0.7978F, -4.5296F);
        this.Front.addChild(Neck_r43);
        this.setRotateAngle(Neck_r43, 0.1736F, 0.0755F, -1.0657F);
        this.Neck_r43.cubeList.add(new ModelBox(Neck_r43, 48, 42, -0.0105F, -0.1654F, -0.5178F, 0, 4, 1, 0.0F, false));

        this.Neck_r44 = new AdvancedModelRenderer(this);
        this.Neck_r44.setRotationPoint(1.0F, 0.7978F, -4.5296F);
        this.Front.addChild(Neck_r44);
        this.setRotateAngle(Neck_r44, 0.1826F, -0.0414F, -0.2038F);
        this.Neck_r44.cubeList.add(new ModelBox(Neck_r44, 13, 67, 2.9025F, 2.4569F, -0.4148F, 0, 11, 1, 0.0F, false));

        this.Neck_r45 = new AdvancedModelRenderer(this);
        this.Neck_r45.setRotationPoint(3.9F, 3.0978F, -5.7296F);
        this.Front.addChild(Neck_r45);
        this.setRotateAngle(Neck_r45, 0.2791F, 0.01F, -0.2567F);
        this.Neck_r45.cubeList.add(new ModelBox(Neck_r45, 60, 67, -0.0058F, -0.0819F, -0.496F, 0, 8, 1, 0.0F, false));

        this.Neck_r46 = new AdvancedModelRenderer(this);
        this.Neck_r46.setRotationPoint(1.0F, 0.8978F, -6.9296F);
        this.Front.addChild(Neck_r46);
        this.setRotateAngle(Neck_r46, 0.2249F, 0.167F, -0.8501F);
        this.Neck_r46.cubeList.add(new ModelBox(Neck_r46, 50, 30, 0.0253F, -0.1316F, -0.1131F, 0, 4, 1, 0.0F, false));

        this.Neck_r47 = new AdvancedModelRenderer(this);
        this.Neck_r47.setRotationPoint(1.0F, 1.1978F, -8.9296F);
        this.Front.addChild(Neck_r47);
        this.setRotateAngle(Neck_r47, 0.2874F, 0.2291F, -0.7854F);
        this.Neck_r47.cubeList.add(new ModelBox(Neck_r47, 54, 0, 0.0253F, -0.1316F, -0.1131F, 0, 3, 1, 0.0F, false));

        this.Neck_r48 = new AdvancedModelRenderer(this);
        this.Neck_r48.setRotationPoint(1.0F, 1.1978F, -8.9296F);
        this.Front.addChild(Neck_r48);
        this.setRotateAngle(Neck_r48, 0.3583F, 0.074F, -0.3253F);
        this.Neck_r48.cubeList.add(new ModelBox(Neck_r48, 68, 43, 1.3677F, 2.4413F, -0.1131F, 0, 6, 1, 0.0F, false));

        this.Neck = new AdvancedModelRenderer(this);
        this.Neck.setRotationPoint(0.0F, 0.1978F, -9.8296F);
        this.Front.addChild(Neck);
        this.setRotateAngle(Neck, 0.0687F, -0.0871F, -0.006F);
        this.Neck.cubeList.add(new ModelBox(Neck, 37, 31, -1.0F, -0.9031F, -8.0586F, 2, 2, 8, 0.0F, false));

        this.Neck_r49 = new AdvancedModelRenderer(this);
        this.Neck_r49.setRotationPoint(-1.0F, 1.0969F, -1.1586F);
        this.Neck.addChild(Neck_r49);
        this.setRotateAngle(Neck_r49, 0.4462F, -0.3133F, 0.6032F);
        this.Neck_r49.cubeList.add(new ModelBox(Neck_r49, 39, 54, -0.0253F, -0.1316F, -0.1131F, 0, 3, 1, 0.0F, true));

        this.Neck_r50 = new AdvancedModelRenderer(this);
        this.Neck_r50.setRotationPoint(-1.0F, 1.0969F, -1.1586F);
        this.Neck.addChild(Neck_r50);
        this.setRotateAngle(Neck_r50, 0.5331F, -0.0839F, 0.1719F);
        this.Neck_r50.cubeList.add(new ModelBox(Neck_r50, 53, 30, -1.3677F, 2.4413F, -0.1131F, 0, 4, 1, 0.0F, true));

        this.Neck_r51 = new AdvancedModelRenderer(this);
        this.Neck_r51.setRotationPoint(-1.0F, 1.0969F, -3.1586F);
        this.Neck.addChild(Neck_r51);
        this.setRotateAngle(Neck_r51, 0.6206F, -0.0879F, 0.0422F);
        this.Neck_r51.cubeList.add(new ModelBox(Neck_r51, 17, 50, -1.3677F, 2.4413F, -0.1131F, 0, 2, 1, 0.0F, true));

        this.Neck_r52 = new AdvancedModelRenderer(this);
        this.Neck_r52.setRotationPoint(-1.0F, 1.0969F, -3.1586F);
        this.Neck.addChild(Neck_r52);
        this.setRotateAngle(Neck_r52, 0.5286F, -0.3526F, 0.454F);
        this.Neck_r52.cubeList.add(new ModelBox(Neck_r52, 42, 54, -0.0253F, -0.1316F, -0.1131F, 0, 3, 1, 0.0F, true));

        this.Neck_r53 = new AdvancedModelRenderer(this);
        this.Neck_r53.setRotationPoint(-1.0F, 1.0969F, -5.2586F);
        this.Neck.addChild(Neck_r53);
        this.setRotateAngle(Neck_r53, 0.6159F, -0.3526F, 0.454F);
        this.Neck_r53.cubeList.add(new ModelBox(Neck_r53, 11, 55, -0.1F, -0.4F, -0.4F, 0, 3, 1, 0.0F, true));

        this.Neck_r54 = new AdvancedModelRenderer(this);
        this.Neck_r54.setRotationPoint(1.0F, 1.0969F, -1.1586F);
        this.Neck.addChild(Neck_r54);
        this.setRotateAngle(Neck_r54, 0.5331F, 0.0839F, -0.1719F);
        this.Neck_r54.cubeList.add(new ModelBox(Neck_r54, 53, 30, 1.3677F, 2.4413F, -0.1131F, 0, 4, 1, 0.0F, false));

        this.Neck_r55 = new AdvancedModelRenderer(this);
        this.Neck_r55.setRotationPoint(1.0F, 1.0969F, -1.1586F);
        this.Neck.addChild(Neck_r55);
        this.setRotateAngle(Neck_r55, 0.4462F, 0.3133F, -0.6032F);
        this.Neck_r55.cubeList.add(new ModelBox(Neck_r55, 39, 54, 0.0253F, -0.1316F, -0.1131F, 0, 3, 1, 0.0F, false));

        this.Neck_r56 = new AdvancedModelRenderer(this);
        this.Neck_r56.setRotationPoint(1.0F, 1.0969F, -3.1586F);
        this.Neck.addChild(Neck_r56);
        this.setRotateAngle(Neck_r56, 0.6206F, 0.0879F, -0.0422F);
        this.Neck_r56.cubeList.add(new ModelBox(Neck_r56, 17, 50, 1.3677F, 2.4413F, -0.1131F, 0, 2, 1, 0.0F, false));

        this.Neck_r57 = new AdvancedModelRenderer(this);
        this.Neck_r57.setRotationPoint(1.0F, 1.0969F, -3.1586F);
        this.Neck.addChild(Neck_r57);
        this.setRotateAngle(Neck_r57, 0.5286F, 0.3526F, -0.454F);
        this.Neck_r57.cubeList.add(new ModelBox(Neck_r57, 42, 54, 0.0253F, -0.1316F, -0.1131F, 0, 3, 1, 0.0F, false));

        this.Neck_r58 = new AdvancedModelRenderer(this);
        this.Neck_r58.setRotationPoint(1.0F, 1.0969F, -5.2586F);
        this.Neck.addChild(Neck_r58);
        this.setRotateAngle(Neck_r58, 0.6159F, 0.3526F, -0.454F);
        this.Neck_r58.cubeList.add(new ModelBox(Neck_r58, 11, 55, 0.1F, -0.4F, -0.4F, 0, 3, 1, 0.0F, false));

        this.Head = new AdvancedModelRenderer(this);
        this.Head.setRotationPoint(-0.01F, 0.3969F, -6.6586F);
        this.Neck.addChild(Head);
        this.setRotateAngle(Head, 1.1605F, 0.0F, 0.0F);
        this.Head.cubeList.add(new ModelBox(Head, 36, 0, -3.0F, -2.804F, -4.3987F, 6, 4, 5, 0.0F, false));
        this.Head.cubeList.add(new ModelBox(Head, 54, 10, -3.0F, 1.196F, -2.3987F, 6, 2, 3, 0.0F, false));

        this.Lowerjaw = new AdvancedModelRenderer(this);
        this.Lowerjaw.setRotationPoint(0.0F, 1.096F, -2.2987F);
        this.Head.addChild(Lowerjaw);
        this.setRotateAngle(Lowerjaw, 0.2983F, 0.0F, 0.0F);
        this.Lowerjaw.cubeList.add(new ModelBox(Lowerjaw, 22, 57, 1.5F, -0.0928F, -4.5625F, 1, 2, 5, 0.0F, false));
        this.Lowerjaw.cubeList.add(new ModelBox(Lowerjaw, 22, 57, -2.48F, -0.0928F, -4.5625F, 1, 2, 5, 0.0F, true));
        this.Lowerjaw.cubeList.add(new ModelBox(Lowerjaw, 37, 22, -2.5F, -0.0928F, -5.5625F, 5, 2, 1, 0.0F, false));

        this.Lowerjaw_r1 = new AdvancedModelRenderer(this);
        this.Lowerjaw_r1.setRotationPoint(-0.99F, 2.6072F, -0.6625F);
        this.Lowerjaw.addChild(Lowerjaw_r1);
        this.setRotateAngle(Lowerjaw_r1, -0.1309F, -0.3491F, 0.0F);
        this.Lowerjaw_r1.cubeList.add(new ModelBox(Lowerjaw_r1, 0, 33, -0.1532F, -1.1F, -3.5241F, 0, 1, 3, 0.0F, true));

        this.Lowerjaw_r2 = new AdvancedModelRenderer(this);
        this.Lowerjaw_r2.setRotationPoint(1.01F, 2.6072F, -0.6625F);
        this.Lowerjaw.addChild(Lowerjaw_r2);
        this.setRotateAngle(Lowerjaw_r2, -0.1309F, 0.3491F, 0.0F);
        this.Lowerjaw_r2.cubeList.add(new ModelBox(Lowerjaw_r2, 0, 33, 0.1532F, -1.1F, -3.5241F, 0, 1, 3, 0.0F, false));

        this.Upperjaw = new AdvancedModelRenderer(this);
        this.Upperjaw.setRotationPoint(0.0F, -0.704F, -3.3987F);
        this.Head.addChild(Upperjaw);
        this.setRotateAngle(Upperjaw, 0.2546F, 0.0F, 0.0F);
        this.Upperjaw.cubeList.add(new ModelBox(Upperjaw, 45, 22, -2.5F, 0.0F, -5.0F, 5, 2, 5, 0.0F, false));

        this.Headslope = new AdvancedModelRenderer(this);
        this.Headslope.setRotationPoint(0.0F, -2.804F, -4.3987F);
        this.Head.addChild(Headslope);
        this.setRotateAngle(Headslope, 0.7456F, 0.0F, 0.0F);
        this.Headslope.cubeList.add(new ModelBox(Headslope, 17, 49, -2.0F, 0.0F, -5.0F, 4, 2, 5, 0.0F, false));

        this.Rightupperarm = new AdvancedModelRenderer(this);
        this.Rightupperarm.setRotationPoint(5.0F, 7.6978F, -5.5296F);
        this.Front.addChild(Rightupperarm);
        this.setRotateAngle(Rightupperarm, 1.2701F, 0.0F, -0.6793F);
        this.Rightupperarm.cubeList.add(new ModelBox(Rightupperarm, 32, 62, -0.2565F, 1.7704F, -2.8985F, 2, 5, 3, 0.0F, false));
        this.Rightupperarm.cubeList.add(new ModelBox(Rightupperarm, 61, 16, -0.2565F, 6.7704F, -3.8985F, 2, 2, 4, 0.0F, false));
        this.Rightupperarm.cubeList.add(new ModelBox(Rightupperarm, 62, 26, -0.2565F, -0.2296F, -2.8985F, 2, 2, 4, 0.0F, false));

        this.Rightlowerarm = new AdvancedModelRenderer(this);
        this.Rightlowerarm.setRotationPoint(0.0216F, 8.7833F, -1.7613F);
        this.Rightupperarm.addChild(Rightlowerarm);
        this.setRotateAngle(Rightlowerarm, -1.1451F, 0.3183F, 0.5943F);
        this.Rightlowerarm.cubeList.add(new ModelBox(Rightlowerarm, 0, 66, 0.9746F, -0.7499F, -1.2318F, 1, 8, 2, 0.0F, false));
        this.Rightlowerarm.cubeList.add(new ModelBox(Rightlowerarm, 63, 65, -1.126F, -0.7456F, -1.2529F, 1, 8, 2, 0.0F, false));

        this.Rightfrontfoot = new AdvancedModelRenderer(this);
        this.Rightfrontfoot.setRotationPoint(-0.626F, 6.4544F, 1.1471F);
        this.Rightlowerarm.addChild(Rightfrontfoot);
        this.setRotateAngle(Rightfrontfoot, 0.7418F, 0.0F, 0.0F);
        this.Rightfrontfoot.cubeList.add(new ModelBox(Rightfrontfoot, 19, 39, -1.4545F, 0.022F, -5.5566F, 5, 2, 6, 0.0F, false));

        this.Leftupperarm = new AdvancedModelRenderer(this);
        this.Leftupperarm.setRotationPoint(-5.0F, 7.6978F, -5.5296F);
        this.Front.addChild(Leftupperarm);
        this.setRotateAngle(Leftupperarm, 0.1792F, 0.0F, 0.6793F);
        this.Leftupperarm.cubeList.add(new ModelBox(Leftupperarm, 54, 58, -1.7435F, 1.7704F, -2.8985F, 2, 5, 3, 0.0F, false));
        this.Leftupperarm.cubeList.add(new ModelBox(Leftupperarm, 41, 58, -1.7435F, 6.7704F, -3.8985F, 2, 2, 4, 0.0F, false));
        this.Leftupperarm.cubeList.add(new ModelBox(Leftupperarm, 55, 47, -1.7435F, -0.2296F, -2.8985F, 2, 2, 4, 0.0F, false));

        this.Leftlowerarm = new AdvancedModelRenderer(this);
        this.Leftlowerarm.setRotationPoint(-0.0216F, 8.7833F, -1.7613F);
        this.Leftupperarm.addChild(Leftlowerarm);
        this.setRotateAngle(Leftlowerarm, -1.0578F, -0.3183F, -0.5943F);
        this.Leftlowerarm.cubeList.add(new ModelBox(Leftlowerarm, 65, 54, -1.9746F, -0.7499F, -1.2318F, 1, 8, 2, 0.0F, false));
        this.Leftlowerarm.cubeList.add(new ModelBox(Leftlowerarm, 43, 65, 0.126F, -0.7456F, -1.2529F, 1, 8, 2, 0.0F, false));

        this.Leftfrontfoot = new AdvancedModelRenderer(this);
        this.Leftfrontfoot.setRotationPoint(0.626F, 6.4544F, 1.1471F);
        this.Leftlowerarm.addChild(Leftfrontfoot);
        this.setRotateAngle(Leftfrontfoot, 0.6981F, 0.0F, 0.0F);
        this.Leftfrontfoot.cubeList.add(new ModelBox(Leftfrontfoot, 37, 13, -3.5455F, 0.022F, -5.5566F, 5, 2, 6, 0.0F, false));

        this.Tail1 = new AdvancedModelRenderer(this);
        this.Tail1.setRotationPoint(0.0F, -4.1867F, 18.6326F);
        this.Hips.addChild(Tail1);
        this.setRotateAngle(Tail1, -0.4102F, 0.363F, -0.1532F);
        this.Tail1.cubeList.add(new ModelBox(Tail1, 53, 39, -1.0F, -0.8882F, 0.2216F, 2, 2, 5, 0.0F, false));

        this.Tail2 = new AdvancedModelRenderer(this);
        this.Tail2.setRotationPoint(0.0F, 0.1118F, 4.9216F);
        this.Tail1.addChild(Tail2);
        this.setRotateAngle(Tail2, -0.4704F, 0.3137F, -0.1557F);
        this.Tail2.cubeList.add(new ModelBox(Tail2, 50, 30, -1.0F, -1.0294F, -0.088F, 2, 2, 6, -0.001F, false));

        this.Tail3 = new AdvancedModelRenderer(this);
        this.Tail3.setRotationPoint(0.0F, -0.2294F, 5.612F);
        this.Tail2.addChild(Tail3);
        this.setRotateAngle(Tail3, 0.024F, 0.4798F, 0.0111F);
        this.Tail3.cubeList.add(new ModelBox(Tail3, 30, 54, -0.5F, -0.5043F, -0.7F, 1, 1, 6, 0.0F, false));

        this.Rightthigh = new AdvancedModelRenderer(this);
        this.Rightthigh.setRotationPoint(4.0F, -0.0867F, 14.9326F);
        this.Hips.addChild(Rightthigh);
        this.setRotateAngle(Rightthigh, -0.4316F, 0.0F, -0.3609F);
        this.Rightthigh.cubeList.add(new ModelBox(Rightthigh, 0, 55, -0.3531F, -0.4089F, -1.3275F, 2, 7, 3, 0.0F, false));

        this.Rightshin = new AdvancedModelRenderer(this);
        this.Rightshin.setRotationPoint(0.0469F, 6.5911F, -0.6275F);
        this.Rightthigh.addChild(Rightshin);
        this.setRotateAngle(Rightshin, 0.6416F, 0.0F, 0.3821F);
        this.Rightshin.cubeList.add(new ModelBox(Rightshin, 20, 65, -0.4F, -0.4503F, -0.9929F, 2, 7, 2, 0.0F, false));
        this.Rightshin.cubeList.add(new ModelBox(Rightshin, 53, 67, -0.4F, 0.5497F, 1.8071F, 2, 6, 1, 0.0F, false));

        this.Righthindfoot = new AdvancedModelRenderer(this);
        this.Righthindfoot.setRotationPoint(0.0F, 5.5497F, 1.1071F);
        this.Rightshin.addChild(Righthindfoot);
        this.setRotateAngle(Righthindfoot, 0.2247F, -0.0803F, 0.1546F);
        this.Righthindfoot.cubeList.add(new ModelBox(Righthindfoot, 0, 33, -2.0F, 0.0F, -5.0F, 5, 2, 7, 0.0F, false));

        this.Leftthigh = new AdvancedModelRenderer(this);
        this.Leftthigh.setRotationPoint(-4.0F, -0.0867F, 14.9326F);
        this.Hips.addChild(Leftthigh);
        this.setRotateAngle(Leftthigh, 0.3538F, 0.0F, 0.3609F);
        this.Leftthigh.cubeList.add(new ModelBox(Leftthigh, 0, 19, -1.6469F, -0.4089F, -1.3275F, 2, 7, 3, 0.0F, false));

        this.Leftshin = new AdvancedModelRenderer(this);
        this.Leftshin.setRotationPoint(-0.0469F, 6.5911F, -0.6275F);
        this.Leftthigh.addChild(Leftshin);
        this.setRotateAngle(Leftshin, 0.7725F, 0.0F, -0.3821F);
        this.Leftshin.cubeList.add(new ModelBox(Leftshin, 21, 0, -1.6F, -0.4503F, -0.9929F, 2, 7, 2, 0.0F, false));
        this.Leftshin.cubeList.add(new ModelBox(Leftshin, 16, 19, -1.6F, 0.5497F, 1.8071F, 2, 6, 1, 0.0F, false));

        this.Lefthindfoot = new AdvancedModelRenderer(this);
        this.Lefthindfoot.setRotationPoint(0.0F, 5.5497F, 1.1071F);
        this.Leftshin.addChild(Lefthindfoot);
        this.setRotateAngle(Lefthindfoot, -0.3915F, 0.0F, 0.0F);
        this.Lefthindfoot.cubeList.add(new ModelBox(Lefthindfoot, 20, 29, -3.0F, 0.0F, -5.0F, 5, 2, 7, 0.0F, false));

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
