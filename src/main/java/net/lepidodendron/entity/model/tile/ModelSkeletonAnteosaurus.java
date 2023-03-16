package net.lepidodendron.entity.model.tile;

import net.ilexiconn.llibrary.client.model.tools.AdvancedModelBase;
import net.ilexiconn.llibrary.client.model.tools.AdvancedModelRenderer;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;

public class ModelSkeletonAnteosaurus extends AdvancedModelBase {
    private final AdvancedModelRenderer root;
    private final AdvancedModelRenderer Hips;
    private final AdvancedModelRenderer Hips_r1;
    private final AdvancedModelRenderer Hips_r2;
    private final AdvancedModelRenderer Hips_r3;
    private final AdvancedModelRenderer Hips_r4;
    private final AdvancedModelRenderer Hips_r5;
    private final AdvancedModelRenderer Hips_r6;
    private final AdvancedModelRenderer Hips_r7;
    private final AdvancedModelRenderer Bodyfront_r1;
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
    private final AdvancedModelRenderer Neck_r36;
    private final AdvancedModelRenderer Neck_r37;
    private final AdvancedModelRenderer Neck_r38;
    private final AdvancedModelRenderer Bodyfront_r2;
    private final AdvancedModelRenderer Neck_r39;
    private final AdvancedModelRenderer Neck_r40;
    private final AdvancedModelRenderer Neck_r41;
    private final AdvancedModelRenderer Neck_r42;
    private final AdvancedModelRenderer Bodyfront;
    private final AdvancedModelRenderer Bodyfront_r3;
    private final AdvancedModelRenderer Bodyfront_r4;
    private final AdvancedModelRenderer Bodyfront_r5;
    private final AdvancedModelRenderer Bodyfront_r6;
    private final AdvancedModelRenderer Bodyfront_r7;
    private final AdvancedModelRenderer Bodyfront_r8;
    private final AdvancedModelRenderer Bodyfront_r9;
    private final AdvancedModelRenderer Bodyfront_r10;
    private final AdvancedModelRenderer Neck_r43;
    private final AdvancedModelRenderer Neck_r44;
    private final AdvancedModelRenderer Neck_r45;
    private final AdvancedModelRenderer Neck_r46;
    private final AdvancedModelRenderer Neck_r47;
    private final AdvancedModelRenderer Neck_r48;
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
    private final AdvancedModelRenderer Neck_r59;
    private final AdvancedModelRenderer Neck_r60;
    private final AdvancedModelRenderer Neck_r61;
    private final AdvancedModelRenderer Neck_r62;
    private final AdvancedModelRenderer Neck_r63;
    private final AdvancedModelRenderer Neck_r64;
    private final AdvancedModelRenderer Neck_r65;
    private final AdvancedModelRenderer Neck_r66;
    private final AdvancedModelRenderer Neck_r67;
    private final AdvancedModelRenderer Neck_r68;
    private final AdvancedModelRenderer Neck;
    private final AdvancedModelRenderer Neck_r69;
    private final AdvancedModelRenderer Neck_r70;
    private final AdvancedModelRenderer Head;
    private final AdvancedModelRenderer Head_r1;
    private final AdvancedModelRenderer Head_r2;
    private final AdvancedModelRenderer Head_r3;
    private final AdvancedModelRenderer Head_r4;
    private final AdvancedModelRenderer Upperjawback;
    private final AdvancedModelRenderer Upperjawfront;
    private final AdvancedModelRenderer Upperfrontteeth;
    private final AdvancedModelRenderer Uppersecondfrontteeth;
    private final AdvancedModelRenderer Rightupperfang;
    private final AdvancedModelRenderer Leftupperfang;
    private final AdvancedModelRenderer Upperbackteeth;
    private final AdvancedModelRenderer Browslope;
    private final AdvancedModelRenderer Headslope;
    private final AdvancedModelRenderer Snoutslopebase;
    private final AdvancedModelRenderer Snoutslopefront;
    private final AdvancedModelRenderer Rightbrowhornfront;
    private final AdvancedModelRenderer Rightbrowhornback;
    private final AdvancedModelRenderer Leftbrowhornfront;
    private final AdvancedModelRenderer Leftbrowhornback;
    private final AdvancedModelRenderer Lowerjawbase;
    private final AdvancedModelRenderer Lowerjawmiddle;
    private final AdvancedModelRenderer Lowerjawfront;
    private final AdvancedModelRenderer Lowerfrontteeth;
    private final AdvancedModelRenderer Lowersecondfrontteeth;
    private final AdvancedModelRenderer Rightlowerfang;
    private final AdvancedModelRenderer Leftlowerfang;
    private final AdvancedModelRenderer Lowerbackteeth;
    private final AdvancedModelRenderer Lowerjawslope;
    private final AdvancedModelRenderer Rightupperarm;
    private final AdvancedModelRenderer Rightlowerarm;
    private final AdvancedModelRenderer Rightfrontfoot;
    private final AdvancedModelRenderer Leftupperarm;
    private final AdvancedModelRenderer Leftlowerarm;
    private final AdvancedModelRenderer Leftfrontfoot;
    private final AdvancedModelRenderer Tailbase;
    private final AdvancedModelRenderer Tailbase_r1;
    private final AdvancedModelRenderer Bodyfront_r11;
    private final AdvancedModelRenderer Tailmiddlebase;
    private final AdvancedModelRenderer Tailmiddleend;
    private final AdvancedModelRenderer Tailend;
    private final AdvancedModelRenderer Rightthigh;
    private final AdvancedModelRenderer Rightshin;
    private final AdvancedModelRenderer Righthindfoot;
    private final AdvancedModelRenderer Leftthigh;
    private final AdvancedModelRenderer Leftshin;
    private final AdvancedModelRenderer Lefthindfoot;

    public ModelSkeletonAnteosaurus() {
        this.textureWidth = 90;
        this.textureHeight = 90;

        this.root = new AdvancedModelRenderer(this);
        this.root.setRotationPoint(0.0F, 0.0F, 0.0F);


        this.Hips = new AdvancedModelRenderer(this);
        this.Hips.setRotationPoint(0.0F, 7.7F, 10.0F);
        this.root.addChild(Hips);
        this.setRotateAngle(Hips, -0.2546F, 0.0F, 0.0F);


        this.Hips_r1 = new AdvancedModelRenderer(this);
        this.Hips_r1.setRotationPoint(-2.5F, 2.258F, -2.3649F);
        this.Hips.addChild(Hips_r1);
        this.setRotateAngle(Hips_r1, -0.6197F, -0.0285F, -0.5613F);
        this.Hips_r1.cubeList.add(new ModelBox(Hips_r1, 0, 53, -0.8269F, -0.5966F, -1.2254F, 1, 4, 2, 0.0F, false));

        this.Hips_r2 = new AdvancedModelRenderer(this);
        this.Hips_r2.setRotationPoint(-2.5F, -0.042F, -1.0649F);
        this.Hips.addChild(Hips_r2);
        this.setRotateAngle(Hips_r2, 0.0F, 0.0F, -0.9599F);
        this.Hips_r2.cubeList.add(new ModelBox(Hips_r2, 60, 28, -3.2109F, 0.6818F, 0.9F, 1, 4, 4, 0.0F, false));

        this.Hips_r3 = new AdvancedModelRenderer(this);
        this.Hips_r3.setRotationPoint(-2.5F, -0.042F, -1.0649F);
        this.Hips.addChild(Hips_r3);
        this.setRotateAngle(Hips_r3, 0.0F, 0.0F, 0.0873F);
        this.Hips_r3.cubeList.add(new ModelBox(Hips_r3, 57, 20, -0.937F, 0.5594F, -2.3F, 1, 2, 5, 0.0F, false));
        this.Hips_r3.cubeList.add(new ModelBox(Hips_r3, 14, 50, -0.937F, -1.4406F, -3.0F, 1, 2, 7, 0.0F, false));

        this.Hips_r4 = new AdvancedModelRenderer(this);
        this.Hips_r4.setRotationPoint(0.0F, -1.5F, -5.0F);
        this.Hips.addChild(Hips_r4);
        this.setRotateAngle(Hips_r4, -0.0698F, 0.0F, 0.0F);
        this.Hips_r4.cubeList.add(new ModelBox(Hips_r4, 31, 53, -3.0F, 0.0F, 1.5F, 2, 1, 6, -0.002F, false));
        this.Hips_r4.cubeList.add(new ModelBox(Hips_r4, 42, 56, 1.0F, 0.0F, 1.5F, 2, 1, 6, -0.002F, false));
        this.Hips_r4.cubeList.add(new ModelBox(Hips_r4, 0, 32, -1.0F, -1.0F, -0.5F, 2, 2, 9, -0.002F, false));

        this.Hips_r5 = new AdvancedModelRenderer(this);
        this.Hips_r5.setRotationPoint(2.5F, -0.042F, -1.0649F);
        this.Hips.addChild(Hips_r5);
        this.setRotateAngle(Hips_r5, 0.0F, 0.0F, -0.0873F);
        this.Hips_r5.cubeList.add(new ModelBox(Hips_r5, 54, 59, -0.063F, 0.5594F, -2.3F, 1, 2, 5, 0.0F, false));
        this.Hips_r5.cubeList.add(new ModelBox(Hips_r5, 52, 46, -0.063F, -1.4406F, -3.0F, 1, 2, 7, 0.0F, false));

        this.Hips_r6 = new AdvancedModelRenderer(this);
        this.Hips_r6.setRotationPoint(2.5F, -0.042F, -1.0649F);
        this.Hips.addChild(Hips_r6);
        this.setRotateAngle(Hips_r6, 0.0F, 0.0F, 0.9599F);
        this.Hips_r6.cubeList.add(new ModelBox(Hips_r6, 62, 44, 2.2109F, 0.6818F, 0.9F, 1, 4, 4, 0.0F, false));

        this.Hips_r7 = new AdvancedModelRenderer(this);
        this.Hips_r7.setRotationPoint(2.5F, 2.258F, -2.3649F);
        this.Hips.addChild(Hips_r7);
        this.setRotateAngle(Hips_r7, -0.6197F, 0.0285F, 0.5613F);
        this.Hips_r7.cubeList.add(new ModelBox(Hips_r7, 74, 4, -0.1731F, -0.5966F, -1.2254F, 1, 4, 2, 0.0F, false));

        this.Bodyfront_r1 = new AdvancedModelRenderer(this);
        this.Bodyfront_r1.setRotationPoint(0.0F, -1.5764F, -22.8832F);
        this.Hips.addChild(Bodyfront_r1);
        this.setRotateAngle(Bodyfront_r1, -0.2967F, 0.0F, 0.0F);
        this.Bodyfront_r1.cubeList.add(new ModelBox(Bodyfront_r1, 54, 0, 0.0F, -8.3352F, 22.9501F, 0, 2, 1, 0.0F, false));
        this.Bodyfront_r1.cubeList.add(new ModelBox(Bodyfront_r1, 61, 0, 0.0F, -7.969F, 20.8274F, 0, 2, 1, 0.0F, false));
        this.Bodyfront_r1.cubeList.add(new ModelBox(Bodyfront_r1, 30, 61, 0.0F, -7.5176F, 18.757F, 0, 2, 1, 0.0F, false));
        this.Bodyfront_r1.cubeList.add(new ModelBox(Bodyfront_r1, 37, 61, 0.0F, -7.0662F, 16.6867F, 0, 2, 1, 0.0F, false));

        this.Bodymiddle = new AdvancedModelRenderer(this);
        this.Bodymiddle.setRotationPoint(0.0F, -1.6905F, -5.2932F);
        this.Hips.addChild(Bodymiddle);
        this.setRotateAngle(Bodymiddle, 0.2632F, -0.2532F, -0.0674F);
        this.Bodymiddle.cubeList.add(new ModelBox(Bodymiddle, 0, 16, -1.0F, -0.9F, -12.0F, 2, 2, 12, 0.0F, false));

        this.Neck_r1 = new AdvancedModelRenderer(this);
        this.Neck_r1.setRotationPoint(-1.0518F, 0.2249F, -0.6912F);
        this.Bodymiddle.addChild(Neck_r1);
        this.setRotateAngle(Neck_r1, 0.15F, 0.1701F, 1.3805F);
        this.Neck_r1.cubeList.add(new ModelBox(Neck_r1, 74, 56, 0.0454F, -0.0583F, -0.196F, 0, 2, 1, 0.0F, true));

        this.Neck_r2 = new AdvancedModelRenderer(this);
        this.Neck_r2.setRotationPoint(-1.0518F, 0.2249F, -0.6912F);
        this.Bodymiddle.addChild(Neck_r2);
        this.setRotateAngle(Neck_r2, -0.1463F, 0.13F, -0.0908F);
        this.Neck_r2.cubeList.add(new ModelBox(Neck_r2, 0, 0, -4.7536F, 2.9637F, -0.1247F, 0, 1, 1, 0.0F, true));

        this.Neck_r3 = new AdvancedModelRenderer(this);
        this.Neck_r3.setRotationPoint(-1.0518F, 0.2249F, -0.6912F);
        this.Bodymiddle.addChild(Neck_r3);
        this.setRotateAngle(Neck_r3, -0.0056F, 0.1954F, 0.7298F);
        this.Neck_r3.cubeList.add(new ModelBox(Neck_r3, 34, 14, -1.1043F, 1.5648F, -0.1247F, 0, 4, 1, 0.0F, true));

        this.Neck_r4 = new AdvancedModelRenderer(this);
        this.Neck_r4.setRotationPoint(-1.0518F, 0.2249F, -2.6912F);
        this.Bodymiddle.addChild(Neck_r4);
        this.setRotateAngle(Neck_r4, 0.1461F, 0.1266F, 1.537F);
        this.Neck_r4.cubeList.add(new ModelBox(Neck_r4, 75, 40, 0.0454F, -0.0583F, -0.196F, 0, 2, 1, 0.0F, true));

        this.Neck_r5 = new AdvancedModelRenderer(this);
        this.Neck_r5.setRotationPoint(-1.0518F, 0.2249F, -2.6912F);
        this.Bodymiddle.addChild(Neck_r5);
        this.setRotateAngle(Neck_r5, 0.0179F, 0.1584F, 0.891F);
        this.Neck_r5.cubeList.add(new ModelBox(Neck_r5, 37, 14, -1.1043F, 1.5648F, -0.1247F, 0, 4, 1, 0.0F, true));

        this.Neck_r6 = new AdvancedModelRenderer(this);
        this.Neck_r6.setRotationPoint(-1.0518F, 0.2249F, -2.6912F);
        this.Bodymiddle.addChild(Neck_r6);
        this.setRotateAngle(Neck_r6, -0.1032F, 0.1217F, 0.0717F);
        this.Neck_r6.cubeList.add(new ModelBox(Neck_r6, 57, 20, -4.7536F, 2.9637F, -0.1247F, 0, 3, 1, 0.0F, true));

        this.Neck_r7 = new AdvancedModelRenderer(this);
        this.Neck_r7.setRotationPoint(-1.0518F, 0.2249F, -4.6912F);
        this.Bodymiddle.addChild(Neck_r7);
        this.setRotateAngle(Neck_r7, 0.1423F, 0.0831F, 1.6064F);
        this.Neck_r7.cubeList.add(new ModelBox(Neck_r7, 57, 75, 0.0454F, -0.0583F, -0.196F, 0, 2, 1, 0.0F, true));

        this.Neck_r8 = new AdvancedModelRenderer(this);
        this.Neck_r8.setRotationPoint(-1.0518F, 0.2249F, -4.6912F);
        this.Bodymiddle.addChild(Neck_r8);
        this.setRotateAngle(Neck_r8, 0.0412F, 0.1213F, 0.9641F);
        this.Neck_r8.cubeList.add(new ModelBox(Neck_r8, 0, 44, -1.1043F, 1.5648F, -0.1247F, 0, 4, 1, 0.0F, true));

        this.Neck_r9 = new AdvancedModelRenderer(this);
        this.Neck_r9.setRotationPoint(-1.0518F, 0.2249F, -4.6912F);
        this.Bodymiddle.addChild(Neck_r9);
        this.setRotateAngle(Neck_r9, -0.0601F, 0.1132F, 0.1466F);
        this.Neck_r9.cubeList.add(new ModelBox(Neck_r9, 11, 0, -4.7536F, 2.9637F, -0.1247F, 0, 5, 1, 0.0F, true));

        this.Neck_r10 = new AdvancedModelRenderer(this);
        this.Neck_r10.setRotationPoint(-1.0518F, 0.2249F, -6.6912F);
        this.Bodymiddle.addChild(Neck_r10);
        this.setRotateAngle(Neck_r10, -0.0706F, 0.0789F, -0.3655F);
        this.Neck_r10.cubeList.add(new ModelBox(Neck_r10, 14, 63, -8.2585F, 4.1629F, -0.1247F, 0, 3, 1, 0.0F, true));

        this.Neck_r11 = new AdvancedModelRenderer(this);
        this.Neck_r11.setRotationPoint(-1.0518F, 0.2249F, -6.6912F);
        this.Bodymiddle.addChild(Neck_r11);
        this.setRotateAngle(Neck_r11, -0.0171F, 0.1045F, 0.2036F);
        this.Neck_r11.cubeList.add(new ModelBox(Neck_r11, 11, 7, -4.7536F, 2.9637F, -0.1247F, 0, 5, 1, 0.0F, true));

        this.Neck_r12 = new AdvancedModelRenderer(this);
        this.Neck_r12.setRotationPoint(-1.0518F, 0.2249F, -6.6912F);
        this.Bodymiddle.addChild(Neck_r12);
        this.setRotateAngle(Neck_r12, 0.0642F, 0.0842F, 1.0188F);
        this.Neck_r12.cubeList.add(new ModelBox(Neck_r12, 3, 44, -1.1043F, 1.5648F, -0.1247F, 0, 4, 1, 0.0F, true));

        this.Neck_r13 = new AdvancedModelRenderer(this);
        this.Neck_r13.setRotationPoint(-1.0518F, 0.2249F, -6.6912F);
        this.Bodymiddle.addChild(Neck_r13);
        this.setRotateAngle(Neck_r13, 0.1384F, 0.0397F, 1.6585F);
        this.Neck_r13.cubeList.add(new ModelBox(Neck_r13, 75, 74, 0.0454F, -0.0583F, -0.196F, 0, 2, 1, 0.0F, true));

        this.Neck_r14 = new AdvancedModelRenderer(this);
        this.Neck_r14.setRotationPoint(-1.0518F, 0.2249F, -8.6912F);
        this.Bodymiddle.addChild(Neck_r14);
        this.setRotateAngle(Neck_r14, 0.1346F, -0.0038F, 1.7457F);
        this.Neck_r14.cubeList.add(new ModelBox(Neck_r14, 24, 76, 0.0454F, -0.0583F, -0.196F, 0, 2, 1, 0.0F, true));

        this.Neck_r15 = new AdvancedModelRenderer(this);
        this.Neck_r15.setRotationPoint(-1.0518F, 0.2249F, -10.5912F);
        this.Bodymiddle.addChild(Neck_r15);
        this.setRotateAngle(Neck_r15, 0.13F, -0.056F, 1.7109F);
        this.Neck_r15.cubeList.add(new ModelBox(Neck_r15, 27, 76, 0.0398F, -0.0712F, -0.295F, 0, 2, 1, 0.0F, true));

        this.Neck_r16 = new AdvancedModelRenderer(this);
        this.Neck_r16.setRotationPoint(-1.0518F, 0.2249F, -8.6912F);
        this.Bodymiddle.addChild(Neck_r16);
        this.setRotateAngle(Neck_r16, 0.0871F, 0.047F, 1.1075F);
        this.Neck_r16.cubeList.add(new ModelBox(Neck_r16, 49, 32, -1.1043F, 1.5648F, -0.1247F, 0, 4, 1, 0.0F, true));

        this.Neck_r17 = new AdvancedModelRenderer(this);
        this.Neck_r17.setRotationPoint(-1.0518F, 0.2249F, -8.6912F);
        this.Bodymiddle.addChild(Neck_r17);
        this.setRotateAngle(Neck_r17, 0.0259F, 0.0956F, 0.2952F);
        this.Neck_r17.cubeList.add(new ModelBox(Neck_r17, 50, 64, -4.7536F, 2.9637F, -0.1247F, 0, 5, 1, 0.0F, true));

        this.Neck_r18 = new AdvancedModelRenderer(this);
        this.Neck_r18.setRotationPoint(-1.0518F, 0.2249F, -8.6912F);
        this.Bodymiddle.addChild(Neck_r18);
        this.setRotateAngle(Neck_r18, -0.0297F, 0.0944F, -0.2747F);
        this.Neck_r18.cubeList.add(new ModelBox(Neck_r18, 52, 32, -8.2585F, 4.1629F, -0.1247F, 0, 4, 1, 0.0F, true));

        this.Neck_r19 = new AdvancedModelRenderer(this);
        this.Neck_r19.setRotationPoint(-1.0518F, 0.2249F, -10.5912F);
        this.Bodymiddle.addChild(Neck_r19);
        this.setRotateAngle(Neck_r19, 0.1145F, 0.0024F, 1.0733F);
        this.Neck_r19.cubeList.add(new ModelBox(Neck_r19, 42, 53, -1.104F, 1.5534F, -0.224F, 0, 4, 1, 0.0F, true));

        this.Neck_r20 = new AdvancedModelRenderer(this);
        this.Neck_r20.setRotationPoint(-1.0518F, 0.2249F, -10.5912F);
        this.Bodymiddle.addChild(Neck_r20);
        this.setRotateAngle(Neck_r20, 0.0773F, 0.0846F, 0.2649F);
        this.Neck_r20.cubeList.add(new ModelBox(Neck_r20, 74, 67, -4.7452F, 2.956F, -0.224F, 0, 5, 1, 0.0F, true));

        this.Neck_r21 = new AdvancedModelRenderer(this);
        this.Neck_r21.setRotationPoint(-1.0518F, 0.2249F, -10.5912F);
        this.Bodymiddle.addChild(Neck_r21);
        this.setRotateAngle(Neck_r21, 0.0196F, 0.1129F, -0.3045F);
        this.Neck_r21.cubeList.add(new ModelBox(Neck_r21, 21, 74, -8.2472F, 4.161F, -0.224F, 0, 5, 1, 0.0F, true));

        this.Neck_r22 = new AdvancedModelRenderer(this);
        this.Neck_r22.setRotationPoint(1.0518F, 0.2249F, -0.6912F);
        this.Bodymiddle.addChild(Neck_r22);
        this.setRotateAngle(Neck_r22, -0.1463F, -0.13F, 0.0908F);
        this.Neck_r22.cubeList.add(new ModelBox(Neck_r22, 0, 0, 4.7536F, 2.9637F, -0.1247F, 0, 1, 1, 0.0F, false));

        this.Neck_r23 = new AdvancedModelRenderer(this);
        this.Neck_r23.setRotationPoint(1.0518F, 0.2249F, -0.6912F);
        this.Bodymiddle.addChild(Neck_r23);
        this.setRotateAngle(Neck_r23, -0.0056F, -0.1954F, -0.7298F);
        this.Neck_r23.cubeList.add(new ModelBox(Neck_r23, 34, 14, 1.1043F, 1.5648F, -0.1247F, 0, 4, 1, 0.0F, false));

        this.Neck_r24 = new AdvancedModelRenderer(this);
        this.Neck_r24.setRotationPoint(1.0518F, 0.2249F, -0.6912F);
        this.Bodymiddle.addChild(Neck_r24);
        this.setRotateAngle(Neck_r24, 0.15F, -0.1701F, -1.3805F);
        this.Neck_r24.cubeList.add(new ModelBox(Neck_r24, 74, 56, -0.0454F, -0.0583F, -0.196F, 0, 2, 1, 0.0F, false));

        this.Neck_r25 = new AdvancedModelRenderer(this);
        this.Neck_r25.setRotationPoint(1.0518F, 0.2249F, -2.6912F);
        this.Bodymiddle.addChild(Neck_r25);
        this.setRotateAngle(Neck_r25, -0.1032F, -0.1217F, -0.0717F);
        this.Neck_r25.cubeList.add(new ModelBox(Neck_r25, 57, 20, 4.7536F, 2.9637F, -0.1247F, 0, 3, 1, 0.0F, false));

        this.Neck_r26 = new AdvancedModelRenderer(this);
        this.Neck_r26.setRotationPoint(1.0518F, 0.2249F, -2.6912F);
        this.Bodymiddle.addChild(Neck_r26);
        this.setRotateAngle(Neck_r26, 0.0179F, -0.1584F, -0.891F);
        this.Neck_r26.cubeList.add(new ModelBox(Neck_r26, 37, 14, 1.1043F, 1.5648F, -0.1247F, 0, 4, 1, 0.0F, false));

        this.Neck_r27 = new AdvancedModelRenderer(this);
        this.Neck_r27.setRotationPoint(1.0518F, 0.2249F, -2.6912F);
        this.Bodymiddle.addChild(Neck_r27);
        this.setRotateAngle(Neck_r27, 0.1461F, -0.1266F, -1.537F);
        this.Neck_r27.cubeList.add(new ModelBox(Neck_r27, 75, 40, -0.0454F, -0.0583F, -0.196F, 0, 2, 1, 0.0F, false));

        this.Neck_r28 = new AdvancedModelRenderer(this);
        this.Neck_r28.setRotationPoint(1.0518F, 0.2249F, -4.6912F);
        this.Bodymiddle.addChild(Neck_r28);
        this.setRotateAngle(Neck_r28, 0.1423F, -0.0831F, -1.6064F);
        this.Neck_r28.cubeList.add(new ModelBox(Neck_r28, 57, 75, -0.0454F, -0.0583F, -0.196F, 0, 2, 1, 0.0F, false));

        this.Neck_r29 = new AdvancedModelRenderer(this);
        this.Neck_r29.setRotationPoint(1.0518F, 0.2249F, -4.6912F);
        this.Bodymiddle.addChild(Neck_r29);
        this.setRotateAngle(Neck_r29, 0.0412F, -0.1213F, -0.9641F);
        this.Neck_r29.cubeList.add(new ModelBox(Neck_r29, 0, 44, 1.1043F, 1.5648F, -0.1247F, 0, 4, 1, 0.0F, false));

        this.Neck_r30 = new AdvancedModelRenderer(this);
        this.Neck_r30.setRotationPoint(1.0518F, 0.2249F, -4.6912F);
        this.Bodymiddle.addChild(Neck_r30);
        this.setRotateAngle(Neck_r30, -0.0601F, -0.1132F, -0.1466F);
        this.Neck_r30.cubeList.add(new ModelBox(Neck_r30, 11, 0, 4.7536F, 2.9637F, -0.1247F, 0, 5, 1, 0.0F, false));

        this.Neck_r31 = new AdvancedModelRenderer(this);
        this.Neck_r31.setRotationPoint(1.0518F, 0.2249F, -6.6912F);
        this.Bodymiddle.addChild(Neck_r31);
        this.setRotateAngle(Neck_r31, -0.0706F, -0.0789F, 0.3655F);
        this.Neck_r31.cubeList.add(new ModelBox(Neck_r31, 14, 63, 8.2585F, 4.1629F, -0.1247F, 0, 3, 1, 0.0F, false));

        this.Neck_r32 = new AdvancedModelRenderer(this);
        this.Neck_r32.setRotationPoint(1.0518F, 0.2249F, -6.6912F);
        this.Bodymiddle.addChild(Neck_r32);
        this.setRotateAngle(Neck_r32, -0.0171F, -0.1045F, -0.2036F);
        this.Neck_r32.cubeList.add(new ModelBox(Neck_r32, 11, 7, 4.7536F, 2.9637F, -0.1247F, 0, 5, 1, 0.0F, false));

        this.Neck_r33 = new AdvancedModelRenderer(this);
        this.Neck_r33.setRotationPoint(1.0518F, 0.2249F, -6.6912F);
        this.Bodymiddle.addChild(Neck_r33);
        this.setRotateAngle(Neck_r33, 0.0642F, -0.0842F, -1.0188F);
        this.Neck_r33.cubeList.add(new ModelBox(Neck_r33, 3, 44, 1.1043F, 1.5648F, -0.1247F, 0, 4, 1, 0.0F, false));

        this.Neck_r34 = new AdvancedModelRenderer(this);
        this.Neck_r34.setRotationPoint(1.0518F, 0.2249F, -6.6912F);
        this.Bodymiddle.addChild(Neck_r34);
        this.setRotateAngle(Neck_r34, 0.1384F, -0.0397F, -1.6585F);
        this.Neck_r34.cubeList.add(new ModelBox(Neck_r34, 75, 74, -0.0454F, -0.0583F, -0.196F, 0, 2, 1, 0.0F, false));

        this.Neck_r35 = new AdvancedModelRenderer(this);
        this.Neck_r35.setRotationPoint(1.0518F, 0.2249F, -8.6912F);
        this.Bodymiddle.addChild(Neck_r35);
        this.setRotateAngle(Neck_r35, -0.0297F, -0.0944F, 0.2747F);
        this.Neck_r35.cubeList.add(new ModelBox(Neck_r35, 52, 32, 8.2585F, 4.1629F, -0.1247F, 0, 4, 1, 0.0F, false));

        this.Neck_r36 = new AdvancedModelRenderer(this);
        this.Neck_r36.setRotationPoint(1.0518F, 0.2249F, -8.6912F);
        this.Bodymiddle.addChild(Neck_r36);
        this.setRotateAngle(Neck_r36, 0.0259F, -0.0956F, -0.2952F);
        this.Neck_r36.cubeList.add(new ModelBox(Neck_r36, 50, 64, 4.7536F, 2.9637F, -0.1247F, 0, 5, 1, 0.0F, false));

        this.Neck_r37 = new AdvancedModelRenderer(this);
        this.Neck_r37.setRotationPoint(1.0518F, 0.2249F, -8.6912F);
        this.Bodymiddle.addChild(Neck_r37);
        this.setRotateAngle(Neck_r37, 0.0871F, -0.047F, -1.1075F);
        this.Neck_r37.cubeList.add(new ModelBox(Neck_r37, 49, 32, 1.1043F, 1.5648F, -0.1247F, 0, 4, 1, 0.0F, false));

        this.Neck_r38 = new AdvancedModelRenderer(this);
        this.Neck_r38.setRotationPoint(1.0518F, 0.2249F, -8.6912F);
        this.Bodymiddle.addChild(Neck_r38);
        this.setRotateAngle(Neck_r38, 0.1346F, 0.0038F, -1.7457F);
        this.Neck_r38.cubeList.add(new ModelBox(Neck_r38, 24, 76, -0.0454F, -0.0583F, -0.196F, 0, 2, 1, 0.0F, false));

        this.Bodyfront_r2 = new AdvancedModelRenderer(this);
        this.Bodyfront_r2.setRotationPoint(0.0F, 0.0236F, -17.8832F);
        this.Bodymiddle.addChild(Bodyfront_r2);
        this.setRotateAngle(Bodyfront_r2, -0.2967F, 0.0F, 0.0F);
        this.Bodyfront_r2.cubeList.add(new ModelBox(Bodyfront_r2, 62, 56, 0.0F, -6.7434F, 15.2F, 0, 2, 1, 0.0F, false));
        this.Bodyfront_r2.cubeList.add(new ModelBox(Bodyfront_r2, 0, 63, 0.0F, -6.4455F, 13.1997F, 0, 2, 1, 0.0F, false));
        this.Bodyfront_r2.cubeList.add(new ModelBox(Bodyfront_r2, 63, 44, 0.0F, -6.2433F, 11.1701F, 0, 2, 1, 0.0F, false));
        this.Bodyfront_r2.cubeList.add(new ModelBox(Bodyfront_r2, 11, 67, 0.0F, -5.5629F, 9.2868F, 0, 2, 1, 0.0F, false));
        this.Bodyfront_r2.cubeList.add(new ModelBox(Bodyfront_r2, 57, 67, 0.0F, -4.9782F, 7.3742F, 0, 2, 1, 0.0F, false));

        this.Neck_r39 = new AdvancedModelRenderer(this);
        this.Neck_r39.setRotationPoint(1.0518F, 0.2249F, -10.5912F);
        this.Bodymiddle.addChild(Neck_r39);
        this.setRotateAngle(Neck_r39, 0.0196F, -0.1129F, 0.3045F);
        this.Neck_r39.cubeList.add(new ModelBox(Neck_r39, 21, 74, 8.2472F, 4.161F, -0.224F, 0, 5, 1, 0.0F, false));

        this.Neck_r40 = new AdvancedModelRenderer(this);
        this.Neck_r40.setRotationPoint(1.0518F, 0.2249F, -10.5912F);
        this.Bodymiddle.addChild(Neck_r40);
        this.setRotateAngle(Neck_r40, 0.0773F, -0.0846F, -0.2649F);
        this.Neck_r40.cubeList.add(new ModelBox(Neck_r40, 74, 67, 4.7452F, 2.956F, -0.224F, 0, 5, 1, 0.0F, false));

        this.Neck_r41 = new AdvancedModelRenderer(this);
        this.Neck_r41.setRotationPoint(1.0518F, 0.2249F, -10.5912F);
        this.Bodymiddle.addChild(Neck_r41);
        this.setRotateAngle(Neck_r41, 0.1145F, -0.0024F, -1.0733F);
        this.Neck_r41.cubeList.add(new ModelBox(Neck_r41, 42, 53, 1.104F, 1.5534F, -0.224F, 0, 4, 1, 0.0F, false));

        this.Neck_r42 = new AdvancedModelRenderer(this);
        this.Neck_r42.setRotationPoint(1.0518F, 0.2249F, -10.5912F);
        this.Bodymiddle.addChild(Neck_r42);
        this.setRotateAngle(Neck_r42, 0.13F, 0.056F, -1.7109F);
        this.Neck_r42.cubeList.add(new ModelBox(Neck_r42, 27, 76, -0.0398F, -0.0712F, -0.295F, 0, 2, 1, 0.0F, false));

        this.Bodyfront = new AdvancedModelRenderer(this);
        this.Bodyfront.setRotationPoint(0.0F, -0.1F, -11.1F);
        this.Bodymiddle.addChild(Bodyfront);
        this.setRotateAngle(Bodyfront, 0.0216F, -0.1745F, -0.0038F);


        this.Bodyfront_r3 = new AdvancedModelRenderer(this);
        this.Bodyfront_r3.setRotationPoint(0.0F, 0.1254F, -6.8152F);
        this.Bodyfront.addChild(Bodyfront_r3);
        this.setRotateAngle(Bodyfront_r3, -0.2967F, 0.0F, 0.0F);
        this.Bodyfront_r3.cubeList.add(new ModelBox(Bodyfront_r3, 60, 67, 0.0F, -4.0518F, 5.5665F, 0, 2, 1, 0.0F, false));
        this.Bodyfront_r3.cubeList.add(new ModelBox(Bodyfront_r3, 37, 70, 0.0F, -3.3154F, 3.6962F, 0, 2, 1, 0.0F, false));
        this.Bodyfront_r3.cubeList.add(new ModelBox(Bodyfront_r3, 70, 63, 0.0F, -2.3866F, 1.8804F, 0, 2, 1, 0.0F, false));
        this.Bodyfront_r3.cubeList.add(new ModelBox(Bodyfront_r3, 71, 56, 0.0F, -1.3616F, 0.0917F, 0, 2, 1, 0.0F, false));

        this.Bodyfront_r4 = new AdvancedModelRenderer(this);
        this.Bodyfront_r4.setRotationPoint(-5.4F, 7.509F, -6.0958F);
        this.Bodyfront.addChild(Bodyfront_r4);
        this.setRotateAngle(Bodyfront_r4, 1.3419F, -0.2544F, -0.5665F);
        this.Bodyfront_r4.cubeList.add(new ModelBox(Bodyfront_r4, 30, 61, -0.6F, -1.2825F, -3.7335F, 1, 4, 4, 0.0F, false));

        this.Bodyfront_r5 = new AdvancedModelRenderer(this);
        this.Bodyfront_r5.setRotationPoint(-3.2698F, 10.3288F, -6.7035F);
        this.Bodyfront.addChild(Bodyfront_r5);
        this.setRotateAngle(Bodyfront_r5, 1.6557F, -0.3302F, -1.5699F);
        this.Bodyfront_r5.cubeList.add(new ModelBox(Bodyfront_r5, 61, 0, -0.7221F, -1.4391F, -3.6532F, 1, 4, 4, -0.002F, false));

        this.Bodyfront_r6 = new AdvancedModelRenderer(this);
        this.Bodyfront_r6.setRotationPoint(-5.4F, 7.509F, -6.0958F);
        this.Bodyfront.addChild(Bodyfront_r6);
        this.setRotateAngle(Bodyfront_r6, 1.2303F, -0.0082F, 0.2346F);
        this.Bodyfront_r6.cubeList.add(new ModelBox(Bodyfront_r6, 51, 3, -0.6F, -1.2825F, -0.2335F, 1, 2, 7, 0.002F, false));

        this.Bodyfront_r7 = new AdvancedModelRenderer(this);
        this.Bodyfront_r7.setRotationPoint(3.2698F, 10.3288F, -6.7035F);
        this.Bodyfront.addChild(Bodyfront_r7);
        this.setRotateAngle(Bodyfront_r7, 1.6557F, 0.3302F, 1.5699F);
        this.Bodyfront_r7.cubeList.add(new ModelBox(Bodyfront_r7, 0, 63, -0.2779F, -1.4391F, -3.6532F, 1, 4, 4, 0.002F, false));

        this.Bodyfront_r8 = new AdvancedModelRenderer(this);
        this.Bodyfront_r8.setRotationPoint(5.4F, 7.509F, -6.0958F);
        this.Bodyfront.addChild(Bodyfront_r8);
        this.setRotateAngle(Bodyfront_r8, 1.3419F, 0.2544F, 0.5665F);
        this.Bodyfront_r8.cubeList.add(new ModelBox(Bodyfront_r8, 63, 63, -0.4F, -1.2825F, -3.7335F, 1, 4, 4, 0.0F, false));

        this.Bodyfront_r9 = new AdvancedModelRenderer(this);
        this.Bodyfront_r9.setRotationPoint(5.4F, 7.509F, -6.0958F);
        this.Bodyfront.addChild(Bodyfront_r9);
        this.setRotateAngle(Bodyfront_r9, 1.2303F, 0.0082F, -0.2346F);
        this.Bodyfront_r9.cubeList.add(new ModelBox(Bodyfront_r9, 0, 53, -0.4F, -1.2825F, -0.2335F, 1, 2, 7, 0.002F, false));

        this.Bodyfront_r10 = new AdvancedModelRenderer(this);
        this.Bodyfront_r10.setRotationPoint(0.0F, 0.9018F, -7.932F);
        this.Bodyfront.addChild(Bodyfront_r10);
        this.setRotateAngle(Bodyfront_r10, 0.0873F, 0.0F, 0.0F);
        this.Bodyfront_r10.cubeList.add(new ModelBox(Bodyfront_r10, 36, 33, -1.0F, -1.0F, 0.0F, 2, 2, 8, 0.002F, false));

        this.Neck_r43 = new AdvancedModelRenderer(this);
        this.Neck_r43.setRotationPoint(-1.0128F, 0.409F, -0.9963F);
        this.Bodyfront.addChild(Neck_r43);
        this.setRotateAngle(Neck_r43, 0.1766F, -0.025F, 1.6574F);
        this.Neck_r43.cubeList.add(new ModelBox(Neck_r43, 30, 76, -0.0165F, -0.057F, -0.518F, 0, 2, 1, 0.0F, true));

        this.Neck_r44 = new AdvancedModelRenderer(this);
        this.Neck_r44.setRotationPoint(-1.0128F, 0.6578F, -3.4021F);
        this.Bodyfront.addChild(Neck_r44);
        this.setRotateAngle(Neck_r44, 0.13F, -0.056F, 1.5887F);
        this.Neck_r44.cubeList.add(new ModelBox(Neck_r44, 76, 48, -0.1231F, 0.0069F, -0.1168F, 0, 2, 1, 0.0F, true));

        this.Neck_r45 = new AdvancedModelRenderer(this);
        this.Neck_r45.setRotationPoint(-1.0128F, 0.409F, -0.9963F);
        this.Bodyfront.addChild(Neck_r45);
        this.setRotateAngle(Neck_r45, -0.0288F, 0.1414F, -0.3623F);
        this.Neck_r45.cubeList.add(new ModelBox(Neck_r45, 42, 75, -8.2419F, 4.0985F, -0.4457F, 0, 5, 1, 0.0F, true));

        this.Neck_r46 = new AdvancedModelRenderer(this);
        this.Neck_r46.setRotationPoint(-1.0128F, 0.409F, -0.9963F);
        this.Bodyfront.addChild(Neck_r46);
        this.setRotateAngle(Neck_r46, 0.0522F, 0.1346F, 0.2105F);
        this.Neck_r46.cubeList.add(new ModelBox(Neck_r46, 45, 75, -4.7743F, 2.9005F, -0.4457F, 0, 5, 1, 0.0F, true));

        this.Neck_r47 = new AdvancedModelRenderer(this);
        this.Neck_r47.setRotationPoint(-1.0128F, 0.409F, -0.9963F);
        this.Bodyfront.addChild(Neck_r47);
        this.setRotateAngle(Neck_r47, 0.1335F, 0.0549F, 1.0223F);
        this.Neck_r47.cubeList.add(new ModelBox(Neck_r47, 45, 53, -1.1644F, 1.5363F, -0.4457F, 0, 4, 1, 0.0F, true));

        this.Neck_r48 = new AdvancedModelRenderer(this);
        this.Neck_r48.setRotationPoint(-1.0128F, 0.6578F, -3.4021F);
        this.Bodyfront.addChild(Neck_r48);
        this.setRotateAngle(Neck_r48, 0.1145F, 0.0024F, 0.9511F);
        this.Neck_r48.cubeList.add(new ModelBox(Neck_r48, 53, 56, -1.2758F, 1.5146F, -0.0414F, 0, 4, 1, 0.0F, true));

        this.Neck_r49 = new AdvancedModelRenderer(this);
        this.Neck_r49.setRotationPoint(-1.0128F, 0.6578F, -3.4021F);
        this.Bodyfront.addChild(Neck_r49);
        this.setRotateAngle(Neck_r49, 0.0773F, 0.0846F, 0.1427F);
        this.Neck_r49.cubeList.add(new ModelBox(Neck_r49, 51, 75, -4.8353F, 2.8047F, -0.0414F, 0, 5, 1, 0.0F, true));

        this.Neck_r50 = new AdvancedModelRenderer(this);
        this.Neck_r50.setRotationPoint(-1.0128F, 0.6578F, -3.4021F);
        this.Bodyfront.addChild(Neck_r50);
        this.setRotateAngle(Neck_r50, 0.0196F, 0.1129F, -0.4267F);
        this.Neck_r50.cubeList.add(new ModelBox(Neck_r50, 48, 75, -8.242F, 3.985F, -0.0414F, 0, 5, 1, 0.0F, true));

        this.Neck_r51 = new AdvancedModelRenderer(this);
        this.Neck_r51.setRotationPoint(-2.9128F, 1.1236F, -5.0124F);
        this.Bodyfront.addChild(Neck_r51);
        this.setRotateAngle(Neck_r51, 0.1115F, 0.0772F, -0.2821F);
        this.Neck_r51.cubeList.add(new ModelBox(Neck_r51, 54, 75, -2.8682F, 2.6831F, -0.2777F, 0, 5, 1, 0.0F, true));

        this.Neck_r52 = new AdvancedModelRenderer(this);
        this.Neck_r52.setRotationPoint(-2.9128F, 1.1236F, -5.0124F);
        this.Bodyfront.addChild(Neck_r52);
        this.setRotateAngle(Neck_r52, 0.1328F, -0.0274F, 0.5233F);
        this.Neck_r52.cubeList.add(new ModelBox(Neck_r52, 56, 56, -0.01F, 0.0039F, -0.2777F, 0, 4, 1, 0.0F, true));

        this.Neck_r53 = new AdvancedModelRenderer(this);
        this.Neck_r53.setRotationPoint(-1.0128F, 0.8237F, -5.006F);
        this.Bodyfront.addChild(Neck_r53);
        this.setRotateAngle(Neck_r53, 0.127F, -0.0907F, 1.4232F);
        this.Neck_r53.cubeList.add(new ModelBox(Neck_r53, 77, 15, 0.0094F, -0.0611F, -0.531F, 0, 2, 1, 0.0F, true));

        this.Neck_r54 = new AdvancedModelRenderer(this);
        this.Neck_r54.setRotationPoint(-1.0128F, 1.0811F, -7.0119F);
        this.Bodyfront.addChild(Neck_r54);
        this.setRotateAngle(Neck_r54, 0.1768F, -0.0537F, 0.5876F);
        this.Neck_r54.cubeList.add(new ModelBox(Neck_r54, 77, 56, -0.9994F, 1.6808F, -0.5341F, 0, 2, 1, 0.0F, true));

        this.Neck_r55 = new AdvancedModelRenderer(this);
        this.Neck_r55.setRotationPoint(-1.0128F, 1.0811F, -7.0119F);
        this.Bodyfront.addChild(Neck_r55);
        this.setRotateAngle(Neck_r55, 0.1267F, -0.1347F, 1.1074F);
        this.Neck_r55.cubeList.add(new ModelBox(Neck_r55, 77, 67, -0.0291F, -0.0291F, -0.5341F, 0, 2, 1, 0.0F, true));

        this.Neck_r56 = new AdvancedModelRenderer(this);
        this.Neck_r56.setRotationPoint(1.0128F, 0.409F, -0.9963F);
        this.Bodyfront.addChild(Neck_r56);
        this.setRotateAngle(Neck_r56, 0.0328F, 0.0219F, 0.3586F);
        this.Neck_r56.cubeList.add(new ModelBox(Neck_r56, 42, 75, 8.2419F, 4.0985F, -0.4457F, 0, 5, 1, 0.0F, false));

        this.Neck_r57 = new AdvancedModelRenderer(this);
        this.Neck_r57.setRotationPoint(1.0128F, 0.409F, -0.9963F);
        this.Bodyfront.addChild(Neck_r57);
        this.setRotateAngle(Neck_r57, 0.0158F, 0.0361F, -0.2087F);
        this.Neck_r57.cubeList.add(new ModelBox(Neck_r57, 45, 75, 4.7743F, 2.9005F, -0.4457F, 0, 5, 1, 0.0F, false));

        this.Neck_r58 = new AdvancedModelRenderer(this);
        this.Neck_r58.setRotationPoint(1.0128F, 0.409F, -0.9963F);
        this.Bodyfront.addChild(Neck_r58);
        this.setRotateAngle(Neck_r58, -0.0153F, 0.0363F, -1.0209F);
        this.Neck_r58.cubeList.add(new ModelBox(Neck_r58, 45, 53, 1.1644F, 1.5363F, -0.4457F, 0, 4, 1, 0.0F, false));

        this.Neck_r59 = new AdvancedModelRenderer(this);
        this.Neck_r59.setRotationPoint(1.0128F, 0.409F, -0.9963F);
        this.Bodyfront.addChild(Neck_r59);
        this.setRotateAngle(Neck_r59, 0.0027F, 0.0096F, -1.6605F);
        this.Neck_r59.cubeList.add(new ModelBox(Neck_r59, 30, 76, 0.0165F, -0.057F, -0.518F, 0, 2, 1, 0.0F, false));

        this.Neck_r60 = new AdvancedModelRenderer(this);
        this.Neck_r60.setRotationPoint(1.0128F, 0.6578F, -3.4021F);
        this.Bodyfront.addChild(Neck_r60);
        this.setRotateAngle(Neck_r60, 0.0427F, 0.0542F, -1.5936F);
        this.Neck_r60.cubeList.add(new ModelBox(Neck_r60, 76, 48, 0.1231F, 0.0069F, -0.1168F, 0, 2, 1, 0.0F, false));

        this.Neck_r61 = new AdvancedModelRenderer(this);
        this.Neck_r61.setRotationPoint(1.0128F, 0.6578F, -3.4021F);
        this.Bodyfront.addChild(Neck_r61);
        this.setRotateAngle(Neck_r61, 0.0434F, 0.0483F, -0.9528F);
        this.Neck_r61.cubeList.add(new ModelBox(Neck_r61, 53, 56, 1.2758F, 1.5146F, -0.0414F, 0, 4, 1, 0.0F, false));

        this.Neck_r62 = new AdvancedModelRenderer(this);
        this.Neck_r62.setRotationPoint(1.0128F, 0.6578F, -3.4021F);
        this.Bodyfront.addChild(Neck_r62);
        this.setRotateAngle(Neck_r62, 0.0649F, 0.0018F, -0.1422F);
        this.Neck_r62.cubeList.add(new ModelBox(Neck_r62, 51, 75, 4.8353F, 2.8047F, -0.0414F, 0, 5, 1, 0.0F, false));

        this.Neck_r63 = new AdvancedModelRenderer(this);
        this.Neck_r63.setRotationPoint(1.0128F, 0.6578F, -3.4021F);
        this.Bodyfront.addChild(Neck_r63);
        this.setRotateAngle(Neck_r63, 0.0557F, -0.0334F, 0.4241F);
        this.Neck_r63.cubeList.add(new ModelBox(Neck_r63, 48, 75, 8.242F, 3.985F, -0.0414F, 0, 5, 1, 0.0F, false));

        this.Neck_r64 = new AdvancedModelRenderer(this);
        this.Neck_r64.setRotationPoint(2.9128F, 1.1236F, -5.0124F);
        this.Bodyfront.addChild(Neck_r64);
        this.setRotateAngle(Neck_r64, 0.1115F, -0.0772F, 0.2821F);
        this.Neck_r64.cubeList.add(new ModelBox(Neck_r64, 54, 75, 2.8682F, 2.6831F, -0.2777F, 0, 5, 1, 0.0F, false));

        this.Neck_r65 = new AdvancedModelRenderer(this);
        this.Neck_r65.setRotationPoint(2.9128F, 1.1236F, -5.0124F);
        this.Bodyfront.addChild(Neck_r65);
        this.setRotateAngle(Neck_r65, 0.1328F, 0.0274F, -0.5233F);
        this.Neck_r65.cubeList.add(new ModelBox(Neck_r65, 56, 56, 0.01F, 0.0039F, -0.2777F, 0, 4, 1, 0.0F, false));

        this.Neck_r66 = new AdvancedModelRenderer(this);
        this.Neck_r66.setRotationPoint(1.0128F, 0.8237F, -5.006F);
        this.Bodyfront.addChild(Neck_r66);
        this.setRotateAngle(Neck_r66, 0.127F, 0.0907F, -1.4232F);
        this.Neck_r66.cubeList.add(new ModelBox(Neck_r66, 77, 15, -0.0094F, -0.0611F, -0.531F, 0, 2, 1, 0.0F, false));

        this.Neck_r67 = new AdvancedModelRenderer(this);
        this.Neck_r67.setRotationPoint(1.0128F, 1.0811F, -7.0119F);
        this.Bodyfront.addChild(Neck_r67);
        this.setRotateAngle(Neck_r67, 0.1768F, 0.0537F, -0.5876F);
        this.Neck_r67.cubeList.add(new ModelBox(Neck_r67, 77, 56, 0.9994F, 1.6808F, -0.5341F, 0, 2, 1, 0.0F, false));

        this.Neck_r68 = new AdvancedModelRenderer(this);
        this.Neck_r68.setRotationPoint(1.0128F, 1.0811F, -7.0119F);
        this.Bodyfront.addChild(Neck_r68);
        this.setRotateAngle(Neck_r68, 0.1267F, 0.1347F, -1.1074F);
        this.Neck_r68.cubeList.add(new ModelBox(Neck_r68, 77, 67, 0.0291F, -0.0291F, -0.5341F, 0, 2, 1, 0.0F, false));

        this.Neck = new AdvancedModelRenderer(this);
        this.Neck.setRotationPoint(0.0F, 0.7017F, -7.6405F);
        this.Bodyfront.addChild(Neck);
        this.setRotateAngle(Neck, -0.2773F, -0.4369F, -0.0749F);
        this.Neck.cubeList.add(new ModelBox(Neck, 49, 32, -1.0F, -0.8942F, -5.0676F, 2, 2, 6, 0.0F, false));

        this.Neck_r69 = new AdvancedModelRenderer(this);
        this.Neck_r69.setRotationPoint(-1.0F, 0.1058F, -1.5676F);
        this.Neck.addChild(Neck_r69);
        this.setRotateAngle(Neck_r69, 0.3591F, -0.1624F, 0.4068F);
        this.Neck_r69.cubeList.add(new ModelBox(Neck_r69, 24, 68, 0.0F, 0.0F, -0.5F, 0, 3, 1, 0.0F, true));

        this.Neck_r70 = new AdvancedModelRenderer(this);
        this.Neck_r70.setRotationPoint(1.0F, 0.1058F, -1.5676F);
        this.Neck.addChild(Neck_r70);
        this.setRotateAngle(Neck_r70, 0.3591F, 0.1624F, -0.4068F);
        this.Neck_r70.cubeList.add(new ModelBox(Neck_r70, 24, 68, 0.0F, 0.0F, -0.5F, 0, 3, 1, 0.0F, false));

        this.Head = new AdvancedModelRenderer(this);
        this.Head.setRotationPoint(0.0F, -0.7942F, -4.5676F);
        this.Neck.addChild(Head);
        this.setRotateAngle(Head, -0.179F, -0.4734F, 0.0823F);
        this.Head.cubeList.add(new ModelBox(Head, 33, 0, -4.0F, -1.5F, -4.0F, 8, 5, 4, 0.0F, false));

        this.Head_r1 = new AdvancedModelRenderer(this);
        this.Head_r1.setRotationPoint(0.0F, 1.0F, 0.0F);
        this.Head.addChild(Head_r1);
        this.setRotateAngle(Head_r1, 0.0F, 0.4363F, 0.0F);
        this.Head_r1.cubeList.add(new ModelBox(Head_r1, 17, 60, -3.5F, -2.5F, -2.0F, 4, 5, 2, -0.002F, true));

        this.Head_r2 = new AdvancedModelRenderer(this);
        this.Head_r2.setRotationPoint(0.0F, 1.0F, 0.0F);
        this.Head.addChild(Head_r2);
        this.setRotateAngle(Head_r2, 0.0F, -0.4363F, 0.0F);
        this.Head_r2.cubeList.add(new ModelBox(Head_r2, 17, 60, -0.5F, -2.5F, -2.0F, 4, 5, 2, -0.002F, false));

        this.Head_r3 = new AdvancedModelRenderer(this);
        this.Head_r3.setRotationPoint(-1.675F, 0.1F, -2.9F);
        this.Head.addChild(Head_r3);
        this.setRotateAngle(Head_r3, 0.0F, -1.5708F, 0.0F);
        this.Head_r3.cubeList.add(new ModelBox(Head_r3, 34, 28, -1.375F, -0.5F, 0.7F, 1, 1, 1, -0.2F, true));
        this.Head_r3.cubeList.add(new ModelBox(Head_r3, 14, 38, -1.125F, -0.5F, 0.7F, 1, 1, 1, 0.04F, true));
        this.Head_r3.cubeList.add(new ModelBox(Head_r3, 14, 74, -1.125F, -1.0F, 0.2F, 1, 2, 2, 0.03F, true));

        this.Head_r4 = new AdvancedModelRenderer(this);
        this.Head_r4.setRotationPoint(1.675F, 0.1F, -2.9F);
        this.Head.addChild(Head_r4);
        this.setRotateAngle(Head_r4, 0.0F, 1.5708F, 0.0F);
        this.Head_r4.cubeList.add(new ModelBox(Head_r4, 34, 28, 0.375F, -0.5F, 0.7F, 1, 1, 1, -0.2F, false));
        this.Head_r4.cubeList.add(new ModelBox(Head_r4, 14, 38, 0.125F, -0.5F, 0.7F, 1, 1, 1, 0.04F, false));
        this.Head_r4.cubeList.add(new ModelBox(Head_r4, 14, 74, 0.125F, -1.0F, 0.2F, 1, 2, 2, 0.03F, false));

        this.Upperjawback = new AdvancedModelRenderer(this);
        this.Upperjawback.setRotationPoint(0.0F, 3.43F, -3.8F);
        this.Head.addChild(Upperjawback);
        this.setRotateAngle(Upperjawback, 0.3396F, 0.0F, 0.0F);
        this.Upperjawback.cubeList.add(new ModelBox(Upperjawback, 38, 44, -2.5F, -3.0F, -4.0F, 5, 3, 5, 0.0F, false));

        this.Upperjawfront = new AdvancedModelRenderer(this);
        this.Upperjawfront.setRotationPoint(-0.01F, 0.0F, -4.0F);
        this.Upperjawback.addChild(Upperjawfront);
        this.setRotateAngle(Upperjawfront, -0.3183F, 0.0F, 0.0F);
        this.Upperjawfront.cubeList.add(new ModelBox(Upperjawfront, 51, 13, -2.5F, -3.0F, -3.0F, 5, 3, 3, 0.0F, false));

        this.Upperfrontteeth = new AdvancedModelRenderer(this);
        this.Upperfrontteeth.setRotationPoint(0.0F, -0.7F, -2.8F);
        this.Upperjawfront.addChild(Upperfrontteeth);
        this.setRotateAngle(Upperfrontteeth, 0.2122F, 0.0F, 0.0F);
        this.Upperfrontteeth.cubeList.add(new ModelBox(Upperfrontteeth, 7, 63, -1.0F, 0.0F, 0.0F, 2, 2, 1, 0.0F, false));

        this.Uppersecondfrontteeth = new AdvancedModelRenderer(this);
        this.Uppersecondfrontteeth.setRotationPoint(0.0F, 0.0F, -1.7F);
        this.Upperjawfront.addChild(Uppersecondfrontteeth);
        this.setRotateAngle(Uppersecondfrontteeth, 0.1698F, 0.0F, 0.0F);
        this.Uppersecondfrontteeth.cubeList.add(new ModelBox(Uppersecondfrontteeth, 32, 44, -2.0F, 0.0F, 0.0F, 4, 1, 1, 0.0F, false));

        this.Rightupperfang = new AdvancedModelRenderer(this);
        this.Rightupperfang.setRotationPoint(1.85F, -0.3F, -0.6F);
        this.Upperjawfront.addChild(Rightupperfang);
        this.setRotateAngle(Rightupperfang, 0.1485F, -0.0424F, -0.0424F);
        this.Rightupperfang.cubeList.add(new ModelBox(Rightupperfang, 25, 16, -0.5F, 0.0F, -0.5F, 1, 2, 1, 0.0F, false));

        this.Leftupperfang = new AdvancedModelRenderer(this);
        this.Leftupperfang.setRotationPoint(-1.83F, -0.3F, -0.6F);
        this.Upperjawfront.addChild(Leftupperfang);
        this.setRotateAngle(Leftupperfang, 0.1485F, 0.0424F, 0.0424F);
        this.Leftupperfang.cubeList.add(new ModelBox(Leftupperfang, 25, 16, -0.5F, 0.0F, -0.5F, 1, 2, 1, 0.0F, true));

        this.Upperbackteeth = new AdvancedModelRenderer(this);
        this.Upperbackteeth.setRotationPoint(-0.01F, -0.4F, -3.9F);
        this.Upperjawback.addChild(Upperbackteeth);
        this.setRotateAngle(Upperbackteeth, 0.1061F, 0.0F, 0.0F);
        this.Upperbackteeth.cubeList.add(new ModelBox(Upperbackteeth, 67, 25, -2.0F, 0.0F, 0.0F, 4, 1, 3, 0.0F, false));

        this.Browslope = new AdvancedModelRenderer(this);
        this.Browslope.setRotationPoint(0.0F, -2.5F, -3.1F);
        this.Head.addChild(Browslope);
        this.setRotateAngle(Browslope, 0.2972F, 0.0F, 0.0F);
        this.Browslope.cubeList.add(new ModelBox(Browslope, 11, 68, -1.5F, 0.0F, -3.0F, 3, 2, 3, 0.0F, false));

        this.Headslope = new AdvancedModelRenderer(this);
        this.Headslope.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.Browslope.addChild(Headslope);
        this.setRotateAngle(Headslope, -0.7854F, 0.0F, 0.0F);
        this.Headslope.cubeList.add(new ModelBox(Headslope, 65, 17, -2.0F, 0.0F, 0.0F, 4, 1, 3, 0.0F, false));

        this.Snoutslopebase = new AdvancedModelRenderer(this);
        this.Snoutslopebase.setRotationPoint(0.01F, 0.0F, -3.0F);
        this.Browslope.addChild(Snoutslopebase);
        this.setRotateAngle(Snoutslopebase, 0.5308F, 0.0F, 0.0F);
        this.Snoutslopebase.cubeList.add(new ModelBox(Snoutslopebase, 24, 70, -1.5F, 0.0F, -3.0F, 3, 2, 3, 0.0F, false));

        this.Snoutslopefront = new AdvancedModelRenderer(this);
        this.Snoutslopefront.setRotationPoint(-0.01F, 2.0F, -2.9F);
        this.Snoutslopebase.addChild(Snoutslopefront);
        this.setRotateAngle(Snoutslopefront, -0.3187F, 0.0F, 0.0F);
        this.Snoutslopefront.cubeList.add(new ModelBox(Snoutslopefront, 14, 31, -1.5F, -2.0F, -3.5F, 3, 2, 4, 0.0F, false));

        this.Rightbrowhornfront = new AdvancedModelRenderer(this);
        this.Rightbrowhornfront.setRotationPoint(0.85F, 1.8F, -4.0F);
        this.Head.addChild(Rightbrowhornfront);
        this.setRotateAngle(Rightbrowhornfront, 0.9765F, 0.1274F, 0.3183F);
        this.Rightbrowhornfront.cubeList.add(new ModelBox(Rightbrowhornfront, 17, 16, -0.5F, -3.0F, -1.6F, 1, 3, 5, 0.0F, false));

        this.Rightbrowhornback = new AdvancedModelRenderer(this);
        this.Rightbrowhornback.setRotationPoint(0.35F, -3.1F, 3.1F);
        this.Rightbrowhornfront.addChild(Rightbrowhornback);
        this.setRotateAngle(Rightbrowhornback, -0.8702F, -0.8278F, 0.8067F);
        this.Rightbrowhornback.cubeList.add(new ModelBox(Rightbrowhornback, 10, 53, 0.0F, 0.0F, 0.0F, 3, 2, 1, 0.0F, false));

        this.Leftbrowhornfront = new AdvancedModelRenderer(this);
        this.Leftbrowhornfront.setRotationPoint(-0.85F, 1.8F, -4.0F);
        this.Head.addChild(Leftbrowhornfront);
        this.setRotateAngle(Leftbrowhornfront, 0.9765F, -0.1274F, -0.3183F);
        this.Leftbrowhornfront.cubeList.add(new ModelBox(Leftbrowhornfront, 17, 16, -0.5F, -3.0F, -1.6F, 1, 3, 5, 0.0F, true));

        this.Leftbrowhornback = new AdvancedModelRenderer(this);
        this.Leftbrowhornback.setRotationPoint(-0.35F, -3.1F, 3.1F);
        this.Leftbrowhornfront.addChild(Leftbrowhornback);
        this.setRotateAngle(Leftbrowhornback, -0.8702F, 0.8278F, -0.8067F);
        this.Leftbrowhornback.cubeList.add(new ModelBox(Leftbrowhornback, 10, 53, -3.0F, 0.0F, 0.0F, 3, 2, 1, 0.0F, true));

        this.Lowerjawbase = new AdvancedModelRenderer(this);
        this.Lowerjawbase.setRotationPoint(0.0F, 3.5F, -1.0F);
        this.Head.addChild(Lowerjawbase);
        this.setRotateAngle(Lowerjawbase, 1.0908F, 0.0F, 0.0F);
        this.Lowerjawbase.cubeList.add(new ModelBox(Lowerjawbase, 50, 67, 2.5F, 0.0F, -3.0F, 1, 3, 4, 0.0F, false));
        this.Lowerjawbase.cubeList.add(new ModelBox(Lowerjawbase, 50, 67, -3.5F, 0.0F, -3.0F, 1, 3, 4, 0.0F, true));

        this.Lowerjawmiddle = new AdvancedModelRenderer(this);
        this.Lowerjawmiddle.setRotationPoint(0.0F, 0.0F, -3.0F);
        this.Lowerjawbase.addChild(Lowerjawmiddle);
        this.setRotateAngle(Lowerjawmiddle, 0.3396F, 0.0F, 0.0F);
        this.Lowerjawmiddle.cubeList.add(new ModelBox(Lowerjawmiddle, 69, 49, 1.5F, 0.0F, -4.0F, 1, 2, 4, 0.0F, false));
        this.Lowerjawmiddle.cubeList.add(new ModelBox(Lowerjawmiddle, 69, 49, -2.5F, 0.0F, -4.0F, 1, 2, 4, 0.0F, true));

        this.Lowerjawfront = new AdvancedModelRenderer(this);
        this.Lowerjawfront.setRotationPoint(0.01F, 0.0F, -3.45F);
        this.Lowerjawmiddle.addChild(Lowerjawfront);
        this.setRotateAngle(Lowerjawfront, -0.2759F, 0.0F, 0.0F);
        this.Lowerjawfront.cubeList.add(new ModelBox(Lowerjawfront, 35, 74, 1.5F, 0.0F, -2.0F, 1, 2, 2, 0.0F, false));
        this.Lowerjawfront.cubeList.add(new ModelBox(Lowerjawfront, 35, 74, -2.52F, 0.0F, -2.0F, 1, 2, 2, 0.0F, true));
        this.Lowerjawfront.cubeList.add(new ModelBox(Lowerjawfront, 68, 0, -2.5F, 0.0F, -3.0F, 5, 2, 1, 0.0F, false));

        this.Lowerfrontteeth = new AdvancedModelRenderer(this);
        this.Lowerfrontteeth.setRotationPoint(0.0F, 0.7F, -2.75F);
        this.Lowerjawfront.addChild(Lowerfrontteeth);
        this.setRotateAngle(Lowerfrontteeth, 0.0424F, 0.0F, 0.0F);
        this.Lowerfrontteeth.cubeList.add(new ModelBox(Lowerfrontteeth, 44, 10, -1.0F, -2.0F, 0.0F, 2, 2, 1, 0.0F, false));

        this.Lowersecondfrontteeth = new AdvancedModelRenderer(this);
        this.Lowersecondfrontteeth.setRotationPoint(0.0F, 0.0F, -2.0F);
        this.Lowerjawfront.addChild(Lowersecondfrontteeth);
        this.setRotateAngle(Lowersecondfrontteeth, -0.0424F, 0.0F, 0.0F);
        this.Lowersecondfrontteeth.cubeList.add(new ModelBox(Lowersecondfrontteeth, 34, 23, -2.0F, -1.0F, 0.0F, 4, 1, 1, 0.0F, false));

        this.Rightlowerfang = new AdvancedModelRenderer(this);
        this.Rightlowerfang.setRotationPoint(1.7F, 0.3F, -0.5F);
        this.Lowerjawfront.addChild(Rightlowerfang);
        this.setRotateAngle(Rightlowerfang, -0.1274F, -0.0424F, 0.0424F);
        this.Rightlowerfang.cubeList.add(new ModelBox(Rightlowerfang, 17, 16, -0.5F, -2.0F, -0.5F, 1, 2, 1, 0.0F, false));

        this.Leftlowerfang = new AdvancedModelRenderer(this);
        this.Leftlowerfang.setRotationPoint(-1.72F, 0.3F, -0.5F);
        this.Lowerjawfront.addChild(Leftlowerfang);
        this.setRotateAngle(Leftlowerfang, -0.1274F, 0.0424F, -0.0424F);
        this.Leftlowerfang.cubeList.add(new ModelBox(Leftlowerfang, 17, 16, -0.5F, -2.0F, -0.5F, 1, 2, 1, 0.0F, true));

        this.Lowerbackteeth = new AdvancedModelRenderer(this);
        this.Lowerbackteeth.setRotationPoint(0.0F, 0.3F, -3.0F);
        this.Lowerjawmiddle.addChild(Lowerbackteeth);
        this.setRotateAngle(Lowerbackteeth, -0.2972F, 0.0F, 0.0F);
        this.Lowerbackteeth.cubeList.add(new ModelBox(Lowerbackteeth, 69, 44, -2.0F, -1.0F, 0.0F, 4, 1, 2, 0.0F, false));

        this.Lowerjawslope = new AdvancedModelRenderer(this);
        this.Lowerjawslope.setRotationPoint(-0.01F, 2.0F, -2.9F);
        this.Lowerjawbase.addChild(Lowerjawslope);
        this.setRotateAngle(Lowerjawslope, 0.0424F, 0.0F, 0.0F);
        this.Lowerjawslope.cubeList.add(new ModelBox(Lowerjawslope, 54, 41, 1.5F, 0.0F, -3.0F, 1, 1, 3, 0.0F, false));
        this.Lowerjawslope.cubeList.add(new ModelBox(Lowerjawslope, 54, 41, -2.48F, 0.0F, -3.0F, 1, 1, 3, 0.0F, true));

        this.Rightupperarm = new AdvancedModelRenderer(this);
        this.Rightupperarm.setRotationPoint(5.5F, 9.1318F, -4.932F);
        this.Bodyfront.addChild(Rightupperarm);
        this.setRotateAngle(Rightupperarm, 0.3302F, 0.4708F, -1.0298F);
        this.Rightupperarm.cubeList.add(new ModelBox(Rightupperarm, 65, 9, -0.9754F, -1.2305F, -3.0126F, 2, 2, 4, 0.0F, false));
        this.Rightupperarm.cubeList.add(new ModelBox(Rightupperarm, 73, 61, -0.9754F, 0.7695F, -2.0126F, 2, 3, 2, 0.0F, false));
        this.Rightupperarm.cubeList.add(new ModelBox(Rightupperarm, 62, 56, -0.9754F, 3.7695F, -3.0126F, 2, 2, 4, 0.0F, false));

        this.Rightlowerarm = new AdvancedModelRenderer(this);
        this.Rightlowerarm.setRotationPoint(-0.0754F, 5.4695F, -0.0126F);
        this.Rightupperarm.addChild(Rightlowerarm);
        this.setRotateAngle(Rightlowerarm, -0.5424F, 0.0204F, 1.1289F);
        this.Rightlowerarm.cubeList.add(new ModelBox(Rightlowerarm, 7, 74, 0.3863F, -0.1921F, -1.5158F, 1, 7, 2, 0.0F, false));
        this.Rightlowerarm.cubeList.add(new ModelBox(Rightlowerarm, 68, 72, -1.6137F, -0.1921F, -1.5158F, 1, 7, 2, 0.0F, false));

        this.Rightfrontfoot = new AdvancedModelRenderer(this);
        this.Rightfrontfoot.setRotationPoint(-0.1137F, 6.0079F, -1.2158F);
        this.Rightlowerarm.addChild(Rightfrontfoot);
        this.setRotateAngle(Rightfrontfoot, -0.0223F, 0.0F, 0.0F);
        this.Rightfrontfoot.cubeList.add(new ModelBox(Rightfrontfoot, 40, 23, -2.5F, 0.0F, -4.5F, 5, 2, 6, 0.0F, false));

        this.Leftupperarm = new AdvancedModelRenderer(this);
        this.Leftupperarm.setRotationPoint(-5.5F, 9.1318F, -4.932F);
        this.Bodyfront.addChild(Leftupperarm);
        this.setRotateAngle(Leftupperarm, 1.1156F, -0.4708F, 1.0298F);
        this.Leftupperarm.cubeList.add(new ModelBox(Leftupperarm, 62, 37, -1.0246F, -1.2305F, -3.0126F, 2, 2, 4, 0.0F, false));
        this.Leftupperarm.cubeList.add(new ModelBox(Leftupperarm, 34, 32, -1.0246F, 0.7695F, -2.0126F, 2, 3, 2, 0.0F, false));
        this.Leftupperarm.cubeList.add(new ModelBox(Leftupperarm, 24, 50, -1.0246F, 3.7695F, -3.0126F, 2, 2, 4, 0.0F, false));

        this.Leftlowerarm = new AdvancedModelRenderer(this);
        this.Leftlowerarm.setRotationPoint(0.0754F, 5.4695F, -0.0126F);
        this.Leftupperarm.addChild(Leftlowerarm);
        this.setRotateAngle(Leftlowerarm, -0.106F, -0.0204F, -1.1289F);
        this.Leftlowerarm.cubeList.add(new ModelBox(Leftlowerarm, 0, 72, -1.3863F, -0.1921F, -1.5158F, 1, 7, 2, 0.0F, false));
        this.Leftlowerarm.cubeList.add(new ModelBox(Leftlowerarm, 71, 30, 0.6137F, -0.1921F, -1.5158F, 1, 7, 2, 0.0F, false));

        this.Leftfrontfoot = new AdvancedModelRenderer(this);
        this.Leftfrontfoot.setRotationPoint(0.1137F, 6.0079F, -1.2158F);
        this.Leftlowerarm.addChild(Leftfrontfoot);
        this.setRotateAngle(Leftfrontfoot, 0.7631F, 0.0F, 0.0F);
        this.Leftfrontfoot.cubeList.add(new ModelBox(Leftfrontfoot, 34, 14, -2.5F, 0.0F, -4.5F, 5, 2, 6, 0.0F, false));

        this.Tailbase = new AdvancedModelRenderer(this);
        this.Tailbase.setRotationPoint(0.0F, -0.9756F, 3.1903F);
        this.Hips.addChild(Tailbase);
        this.setRotateAngle(Tailbase, -0.3311F, 0.5107F, -0.121F);
        this.Tailbase.cubeList.add(new ModelBox(Tailbase, 19, 28, -1.0F, -0.9185F, -0.0428F, 2, 2, 10, 0.002F, false));

        this.Tailbase_r1 = new AdvancedModelRenderer(this);
        this.Tailbase_r1.setRotationPoint(0.0F, 1.0815F, 2.4572F);
        this.Tailbase.addChild(Tailbase_r1);
        this.setRotateAngle(Tailbase_r1, 0.5236F, 0.0F, 0.0F);
        this.Tailbase_r1.cubeList.add(new ModelBox(Tailbase_r1, 33, 0, 0.0F, 0.0F, -0.5F, 0, 2, 1, 0.0F, false));
        this.Tailbase_r1.cubeList.add(new ModelBox(Tailbase_r1, 14, 31, 0.0F, 1.0255F, 3.4482F, 0, 2, 1, 0.0F, false));
        this.Tailbase_r1.cubeList.add(new ModelBox(Tailbase_r1, 25, 31, 0.0F, 2.0374F, 5.394F, 0, 2, 1, 0.0F, false));
        this.Tailbase_r1.cubeList.add(new ModelBox(Tailbase_r1, 24, 50, 0.0F, 0.4129F, 1.4798F, 0, 2, 1, 0.0F, false));

        this.Bodyfront_r11 = new AdvancedModelRenderer(this);
        this.Bodyfront_r11.setRotationPoint(0.0F, -0.5414F, -26.0511F);
        this.Tailbase.addChild(Bodyfront_r11);
        this.setRotateAngle(Bodyfront_r11, -0.2967F, 0.0F, 0.0F);
        this.Bodyfront_r11.cubeList.add(new ModelBox(Bodyfront_r11, 33, 50, 0.0F, -8.3352F, 24.9501F, 0, 2, 1, 0.0F, false));

        this.Tailmiddlebase = new AdvancedModelRenderer(this);
        this.Tailmiddlebase.setRotationPoint(0.0F, 0.1606F, 9.848F);
        this.Tailbase.addChild(Tailmiddlebase);
        this.setRotateAngle(Tailmiddlebase, -0.1129F, 0.347F, -0.0385F);
        this.Tailmiddlebase.cubeList.add(new ModelBox(Tailmiddlebase, 17, 0, -1.0F, -1.0431F, -0.0297F, 2, 2, 11, 0.0F, false));

        this.Tailmiddleend = new AdvancedModelRenderer(this);
        this.Tailmiddleend.setRotationPoint(0.0F, -0.4533F, 10.9021F);
        this.Tailmiddlebase.addChild(Tailmiddleend);
        this.setRotateAngle(Tailmiddleend, -0.1917F, 0.6343F, 0.174F);
        this.Tailmiddleend.cubeList.add(new ModelBox(Tailmiddleend, 19, 14, -0.5F, -0.3875F, -0.2931F, 1, 1, 12, 0.0F, false));

        this.Tailend = new AdvancedModelRenderer(this);
        this.Tailend.setRotationPoint(0.0F, -0.0702F, 10.9063F);
        this.Tailmiddleend.addChild(Tailend);
        this.setRotateAngle(Tailend, -0.2452F, 0.8636F, 0.146F);
        this.Tailend.cubeList.add(new ModelBox(Tailend, 0, 0, -0.5F, -0.32F, -0.0358F, 1, 1, 14, 0.002F, false));

        this.Rightthigh = new AdvancedModelRenderer(this);
        this.Rightthigh.setRotationPoint(4.5F, 2.56F, -0.5F);
        this.Hips.addChild(Rightthigh);
        this.setRotateAngle(Rightthigh, 0.3177F, -0.5573F, -0.2592F);
        this.Rightthigh.cubeList.add(new ModelBox(Rightthigh, 0, 16, -1.0F, -1.5F, -1.9F, 2, 8, 3, 0.0F, false));

        this.Rightshin = new AdvancedModelRenderer(this);
        this.Rightshin.setRotationPoint(0.0201F, 6.8883F, -2.0223F);
        this.Rightthigh.addChild(Rightshin);
        this.setRotateAngle(Rightshin, 0.7275F, -0.0323F, 0.0811F);
        this.Rightshin.cubeList.add(new ModelBox(Rightshin, 41, 64, -1.1009F, -0.0005F, -0.0268F, 2, 8, 2, 0.0F, false));
        this.Rightshin.cubeList.add(new ModelBox(Rightshin, 61, 72, -1.0005F, 0.1258F, 2.4645F, 2, 8, 1, 0.0F, false));

        this.Righthindfoot = new AdvancedModelRenderer(this);
        this.Righthindfoot.setRotationPoint(0.0F, 6.5F, 2.2F);
        this.Rightshin.addChild(Righthindfoot);
        this.setRotateAngle(Righthindfoot, -0.296F, 0.0F, 0.0F);
        this.Righthindfoot.cubeList.add(new ModelBox(Righthindfoot, 0, 44, -2.0F, 0.0F, -4.5F, 4, 2, 6, 0.0F, false));

        this.Leftthigh = new AdvancedModelRenderer(this);
        this.Leftthigh.setRotationPoint(-4.5F, 2.56F, -0.5F);
        this.Hips.addChild(Leftthigh);
        this.setRotateAngle(Leftthigh, 0.0123F, 0.5573F, 0.2592F);
        this.Leftthigh.cubeList.add(new ModelBox(Leftthigh, 0, 0, -1.0F, -1.5F, -1.9F, 2, 8, 3, 0.0F, false));

        this.Leftshin = new AdvancedModelRenderer(this);
        this.Leftshin.setRotationPoint(-0.0201F, 6.8883F, -2.0223F);
        this.Leftthigh.addChild(Leftshin);
        this.setRotateAngle(Leftshin, 0.3785F, 0.0323F, -0.0811F);
        this.Leftshin.cubeList.add(new ModelBox(Leftshin, 17, 0, -0.8991F, -0.0005F, -0.0268F, 2, 8, 2, 0.0F, false));
        this.Leftshin.cubeList.add(new ModelBox(Leftshin, 0, 31, -0.9995F, 0.1258F, 2.4645F, 2, 8, 1, 0.0F, false));

        this.Lefthindfoot = new AdvancedModelRenderer(this);
        this.Lefthindfoot.setRotationPoint(0.0F, 6.5F, 2.2F);
        this.Leftshin.addChild(Lefthindfoot);
        this.setRotateAngle(Lefthindfoot, -0.0778F, 0.0F, 0.0F);
        this.Lefthindfoot.cubeList.add(new ModelBox(Lefthindfoot, 17, 41, -2.0F, 0.0F, -4.5F, 4, 2, 6, 0.0F, false));

        updateDefaultPose();
    }

    public void renderAll(float f) {
        this.resetToDefaultPose();
        this.Hips.render(0.01f);
    }

    public void setRotateAngle(ModelRenderer modelRenderer, float x, float y, float z) {
        modelRenderer.rotateAngleX = x;
        modelRenderer.rotateAngleY = y;
        modelRenderer.rotateAngleZ = z;
    }

}
