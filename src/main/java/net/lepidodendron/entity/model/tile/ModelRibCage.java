package net.lepidodendron.entity.model.tile;

import net.ilexiconn.llibrary.client.model.tools.AdvancedModelBase;
import net.ilexiconn.llibrary.client.model.tools.AdvancedModelRenderer;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;

public class ModelRibCage extends AdvancedModelBase {

    private final AdvancedModelRenderer root;
    private final AdvancedModelRenderer Hips;
    private final AdvancedModelRenderer Neck_r1;
    private final AdvancedModelRenderer Belly;
    private final AdvancedModelRenderer Belly_r1;
    private final AdvancedModelRenderer Belly_r2;
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
    private final AdvancedModelRenderer Front;
    private final AdvancedModelRenderer Front_r1;
    private final AdvancedModelRenderer Neck_r33;
    private final AdvancedModelRenderer Neck_r34;
    private final AdvancedModelRenderer Neck_r35;
    private final AdvancedModelRenderer Neck_r36;
    private final AdvancedModelRenderer Neck_r37;
    private final AdvancedModelRenderer Neck_r38;
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
    private final AdvancedModelRenderer Neck_r49;

    public ModelRibCage() {
        this.textureWidth = 48;
        this.textureHeight = 48;

        this.root = new AdvancedModelRenderer(this);
        this.root.setRotationPoint(0.0F, 0.0F, 0.0F);


        this.Hips = new AdvancedModelRenderer(this);
        this.Hips.setRotationPoint(-3.0F, 21.95F, 0.4F);
        this.root.addChild(Hips);
        this.setRotateAngle(Hips, -0.0768F, 0.0235F, -2.1389F);
        this.Hips.cubeList.add(new ModelBox(Hips, 0, 0, -0.8193F, -3.6332F, 9.3704F, 2, 2, 10, 0.001F, false));

        this.Neck_r1 = new AdvancedModelRenderer(this);
        this.Neck_r1.setRotationPoint(-0.3193F, -3.6065F, 10.1428F);
        this.Hips.addChild(Neck_r1);
        this.setRotateAngle(Neck_r1, -0.0873F, 0.0F, 0.0F);
        this.Neck_r1.cubeList.add(new ModelBox(Neck_r1, 17, 37, 0.5F, -1.3344F, 7.1262F, 0, 2, 1, 0.0F, false));
        this.Neck_r1.cubeList.add(new ModelBox(Neck_r1, 24, 0, 0.5F, -1.1988F, 5.3822F, 0, 2, 1, 0.0F, false));
        this.Neck_r1.cubeList.add(new ModelBox(Neck_r1, 38, 9, 0.5F, -1.3077F, 3.4643F, 0, 2, 1, 0.0F, false));
        this.Neck_r1.cubeList.add(new ModelBox(Neck_r1, 12, 38, 0.5F, -1.3587F, 1.465F, 0, 2, 1, 0.0F, false));
        this.Neck_r1.cubeList.add(new ModelBox(Neck_r1, 38, 25, 0.5F, -1.3281F, -0.4764F, 0, 2, 1, 0.0F, false));

        this.Belly = new AdvancedModelRenderer(this);
        this.Belly.setRotationPoint(0.1807F, -2.6332F, 9.8704F);
        this.Hips.addChild(Belly);
        this.setRotateAngle(Belly, 0.2291F, 0.0735F, 0.0028F);


        this.Belly_r1 = new AdvancedModelRenderer(this);
        this.Belly_r1.setRotationPoint(0.0F, -0.3969F, -8.4206F);
        this.Belly.addChild(Belly_r1);
        this.setRotateAngle(Belly_r1, -0.0436F, 0.0F, 0.0F);
        this.Belly_r1.cubeList.add(new ModelBox(Belly_r1, 16, 4, -1.0F, -1.016F, -0.0786F, 2, 2, 9, 0.0F, false));

        this.Belly_r2 = new AdvancedModelRenderer(this);
        this.Belly_r2.setRotationPoint(0.0F, 0.0031F, -15.2206F);
        this.Belly.addChild(Belly_r2);
        this.setRotateAngle(Belly_r2, 0.0436F, 0.0F, 0.0F);
        this.Belly_r2.cubeList.add(new ModelBox(Belly_r2, 18, 19, -1.0F, -1.116F, -0.1786F, 2, 2, 7, 0.001F, false));

        this.Neck_r2 = new AdvancedModelRenderer(this);
        this.Neck_r2.setRotationPoint(-1.0F, 0.1052F, -0.6194F);
        this.Belly.addChild(Neck_r2);
        this.setRotateAngle(Neck_r2, -0.0759F, 0.0437F, 0.2163F);
        this.Neck_r2.cubeList.add(new ModelBox(Neck_r2, 36, 21, -1.695F, 2.3897F, -0.5272F, 0, 3, 1, -0.001F, false));

        this.Neck_r3 = new AdvancedModelRenderer(this);
        this.Neck_r3.setRotationPoint(-1.0F, 0.1052F, -0.6194F);
        this.Belly.addChild(Neck_r3);
        this.setRotateAngle(Neck_r3, -0.0371F, 0.0793F, 0.8273F);
        this.Neck_r3.cubeList.add(new ModelBox(Neck_r3, 30, 0, -0.0255F, -0.0485F, -0.5272F, 0, 3, 1, -0.001F, false));

        this.Neck_r4 = new AdvancedModelRenderer(this);
        this.Neck_r4.setRotationPoint(-1.0F, 0.0052F, -2.6194F);
        this.Belly.addChild(Neck_r4);
        this.setRotateAngle(Neck_r4, -0.0169F, 0.0406F, 0.8285F);
        this.Neck_r4.cubeList.add(new ModelBox(Neck_r4, 29, 34, -0.0255F, -0.0485F, -0.5272F, 0, 3, 1, -0.001F, false));

        this.Neck_r5 = new AdvancedModelRenderer(this);
        this.Neck_r5.setRotationPoint(-1.0F, 0.0052F, -2.6194F);
        this.Belly.addChild(Neck_r5);
        this.setRotateAngle(Neck_r5, -0.0371F, 0.0236F, 0.2176F);
        this.Neck_r5.cubeList.add(new ModelBox(Neck_r5, 24, 29, -1.695F, 2.3897F, -0.5272F, 0, 4, 1, -0.001F, false));

        this.Neck_r6 = new AdvancedModelRenderer(this);
        this.Neck_r6.setRotationPoint(-1.0F, 0.0052F, -4.6194F);
        this.Belly.addChild(Neck_r6);
        this.setRotateAngle(Neck_r6, 0.0033F, 0.0019F, 1.0908F);
        this.Neck_r6.cubeList.add(new ModelBox(Neck_r6, 33, 16, -0.0255F, -0.0485F, -0.5272F, 0, 3, 1, -0.001F, false));

        this.Neck_r7 = new AdvancedModelRenderer(this);
        this.Neck_r7.setRotationPoint(-1.0F, 0.0052F, -4.6194F);
        this.Belly.addChild(Neck_r7);
        this.setRotateAngle(Neck_r7, 0.0016F, 0.0034F, 0.4799F);
        this.Neck_r7.cubeList.add(new ModelBox(Neck_r7, 21, 16, -1.695F, 2.3897F, -0.5272F, 0, 5, 1, -0.001F, false));

        this.Neck_r8 = new AdvancedModelRenderer(this);
        this.Neck_r8.setRotationPoint(-1.0F, 0.0052F, -6.6194F);
        this.Belly.addChild(Neck_r8);
        this.setRotateAngle(Neck_r8, 0.0235F, -0.0368F, 1.0904F);
        this.Neck_r8.cubeList.add(new ModelBox(Neck_r8, 33, 5, -0.0255F, -0.0485F, -0.5272F, 0, 3, 1, -0.001F, false));

        this.Neck_r9 = new AdvancedModelRenderer(this);
        this.Neck_r9.setRotationPoint(-1.0F, 0.0052F, -6.6194F);
        this.Belly.addChild(Neck_r9);
        this.setRotateAngle(Neck_r9, 0.0403F, -0.0167F, 0.4796F);
        this.Neck_r9.cubeList.add(new ModelBox(Neck_r9, 15, 26, -1.695F, 2.3897F, -0.5272F, 0, 6, 1, -0.001F, false));

        this.Neck_r10 = new AdvancedModelRenderer(this);
        this.Neck_r10.setRotationPoint(-1.0F, 0.0052F, -8.6194F);
        this.Belly.addChild(Neck_r10);
        this.setRotateAngle(Neck_r10, 0.0437F, -0.0755F, 1.0893F);
        this.Neck_r10.cubeList.add(new ModelBox(Neck_r10, 14, 34, -0.0255F, -0.0485F, -0.5272F, 0, 3, 1, -0.001F, false));

        this.Neck_r11 = new AdvancedModelRenderer(this);
        this.Neck_r11.setRotationPoint(-1.0F, 0.0052F, -10.6194F);
        this.Belly.addChild(Neck_r11);
        this.setRotateAngle(Neck_r11, 0.0437F, -0.0755F, 1.0893F);
        this.Neck_r11.cubeList.add(new ModelBox(Neck_r11, 30, 29, -0.0255F, -0.0485F, -0.5272F, 0, 3, 1, -0.001F, false));

        this.Neck_r12 = new AdvancedModelRenderer(this);
        this.Neck_r12.setRotationPoint(-1.0F, 0.0052F, -10.6194F);
        this.Belly.addChild(Neck_r12);
        this.setRotateAngle(Neck_r12, 0.079F, -0.0368F, 0.4786F);
        this.Neck_r12.cubeList.add(new ModelBox(Neck_r12, 3, 26, -1.695F, 2.3897F, -0.5272F, 0, 7, 1, -0.001F, false));

        this.Neck_r13 = new AdvancedModelRenderer(this);
        this.Neck_r13.setRotationPoint(-1.0F, 0.1052F, -12.6194F);
        this.Belly.addChild(Neck_r13);
        this.setRotateAngle(Neck_r13, 0.0437F, -0.0755F, 1.0893F);
        this.Neck_r13.cubeList.add(new ModelBox(Neck_r13, 30, 16, -0.0255F, -0.0485F, -0.5272F, 0, 3, 1, -0.001F, false));

        this.Neck_r14 = new AdvancedModelRenderer(this);
        this.Neck_r14.setRotationPoint(-1.0F, 0.1052F, -12.6194F);
        this.Belly.addChild(Neck_r14);
        this.setRotateAngle(Neck_r14, 0.079F, -0.0368F, 0.4786F);
        this.Neck_r14.cubeList.add(new ModelBox(Neck_r14, 3, 13, -1.695F, 2.3897F, -0.5272F, 0, 8, 1, -0.001F, false));

        this.Neck_r15 = new AdvancedModelRenderer(this);
        this.Neck_r15.setRotationPoint(-1.0F, 0.3052F, -14.6194F);
        this.Belly.addChild(Neck_r15);
        this.setRotateAngle(Neck_r15, 0.064F, -0.1141F, 1.0873F);
        this.Neck_r15.cubeList.add(new ModelBox(Neck_r15, 6, 35, -0.0255F, -0.0485F, -0.5272F, 0, 3, 1, -0.001F, false));

        this.Neck_r16 = new AdvancedModelRenderer(this);
        this.Neck_r16.setRotationPoint(-1.0F, 0.3052F, -14.6194F);
        this.Belly.addChild(Neck_r16);
        this.setRotateAngle(Neck_r16, 0.1178F, -0.0569F, 0.4768F);
        this.Neck_r16.cubeList.add(new ModelBox(Neck_r16, 3, 0, -1.695F, 2.3897F, -0.5272F, 0, 8, 1, -0.001F, false));

        this.Neck_r17 = new AdvancedModelRenderer(this);
        this.Neck_r17.setRotationPoint(1.0F, 0.1052F, -0.6194F);
        this.Belly.addChild(Neck_r17);
        this.setRotateAngle(Neck_r17, -0.0759F, -0.0437F, -0.4781F);
        this.Neck_r17.cubeList.add(new ModelBox(Neck_r17, 36, 28, 1.695F, 2.3897F, -0.5272F, 0, 3, 1, -0.001F, false));

        this.Neck_r18 = new AdvancedModelRenderer(this);
        this.Neck_r18.setRotationPoint(1.0F, 0.1052F, -0.6194F);
        this.Belly.addChild(Neck_r18);
        this.setRotateAngle(Neck_r18, -0.0371F, -0.0793F, -1.0891F);
        this.Neck_r18.cubeList.add(new ModelBox(Neck_r18, 30, 5, 0.0255F, -0.0485F, -0.5272F, 0, 3, 1, -0.001F, false));

        this.Neck_r19 = new AdvancedModelRenderer(this);
        this.Neck_r19.setRotationPoint(1.0F, 0.0052F, -2.6194F);
        this.Belly.addChild(Neck_r19);
        this.setRotateAngle(Neck_r19, -0.0371F, -0.0236F, -0.4794F);
        this.Neck_r19.cubeList.add(new ModelBox(Neck_r19, 27, 29, 1.695F, 2.3897F, -0.5272F, 0, 4, 1, -0.001F, false));

        this.Neck_r20 = new AdvancedModelRenderer(this);
        this.Neck_r20.setRotationPoint(1.0F, 0.0052F, -2.6194F);
        this.Belly.addChild(Neck_r20);
        this.setRotateAngle(Neck_r20, -0.0169F, -0.0406F, -1.0903F);
        this.Neck_r20.cubeList.add(new ModelBox(Neck_r20, 32, 34, 0.0255F, -0.0485F, -0.5272F, 0, 3, 1, -0.001F, false));

        this.Neck_r21 = new AdvancedModelRenderer(this);
        this.Neck_r21.setRotationPoint(1.0F, 0.0052F, -4.6194F);
        this.Belly.addChild(Neck_r21);
        this.setRotateAngle(Neck_r21, 0.0033F, -0.0019F, -1.0908F);
        this.Neck_r21.cubeList.add(new ModelBox(Neck_r21, 33, 21, 0.0255F, -0.0485F, -0.5272F, 0, 3, 1, -0.001F, false));

        this.Neck_r22 = new AdvancedModelRenderer(this);
        this.Neck_r22.setRotationPoint(1.0F, 0.0052F, -4.6194F);
        this.Belly.addChild(Neck_r22);
        this.setRotateAngle(Neck_r22, 0.0016F, -0.0034F, -0.4799F);
        this.Neck_r22.cubeList.add(new ModelBox(Neck_r22, 21, 29, 1.695F, 2.3897F, -0.5272F, 0, 5, 1, -0.001F, false));

        this.Neck_r23 = new AdvancedModelRenderer(this);
        this.Neck_r23.setRotationPoint(1.0F, 0.0052F, -6.6194F);
        this.Belly.addChild(Neck_r23);
        this.setRotateAngle(Neck_r23, 0.0235F, 0.0368F, -0.9595F);
        this.Neck_r23.cubeList.add(new ModelBox(Neck_r23, 33, 29, 0.0255F, -0.0485F, -0.5272F, 0, 3, 1, -0.001F, false));

        this.Neck_r24 = new AdvancedModelRenderer(this);
        this.Neck_r24.setRotationPoint(1.0F, 0.0052F, -6.6194F);
        this.Belly.addChild(Neck_r24);
        this.setRotateAngle(Neck_r24, 0.0403F, 0.0167F, -0.3487F);
        this.Neck_r24.cubeList.add(new ModelBox(Neck_r24, 18, 29, 1.695F, 2.3897F, -0.5272F, 0, 6, 1, -0.001F, false));

        this.Neck_r25 = new AdvancedModelRenderer(this);
        this.Neck_r25.setRotationPoint(1.0F, 0.0052F, -8.6194F);
        this.Belly.addChild(Neck_r25);
        this.setRotateAngle(Neck_r25, 0.0437F, 0.0755F, -0.8275F);
        this.Neck_r25.cubeList.add(new ModelBox(Neck_r25, 0, 35, 0.0255F, -0.0485F, -0.5272F, 0, 3, 1, -0.001F, false));

        this.Neck_r26 = new AdvancedModelRenderer(this);
        this.Neck_r26.setRotationPoint(1.0F, 0.0052F, -8.6194F);
        this.Belly.addChild(Neck_r26);
        this.setRotateAngle(Neck_r26, 0.079F, 0.0368F, -0.2168F);
        this.Neck_r26.cubeList.add(new ModelBox(Neck_r26, 12, 26, 1.695F, 2.3897F, -0.5272F, 0, 7, 1, -0.001F, false));

        this.Neck_r27 = new AdvancedModelRenderer(this);
        this.Neck_r27.setRotationPoint(1.0F, 0.0052F, -10.6194F);
        this.Belly.addChild(Neck_r27);
        this.setRotateAngle(Neck_r27, 0.0437F, 0.0755F, -1.0893F);
        this.Neck_r27.cubeList.add(new ModelBox(Neck_r27, 33, 0, 0.0255F, -0.0485F, -0.5272F, 0, 3, 1, -0.001F, false));

        this.Neck_r28 = new AdvancedModelRenderer(this);
        this.Neck_r28.setRotationPoint(1.0F, 0.0052F, -10.6194F);
        this.Belly.addChild(Neck_r28);
        this.setRotateAngle(Neck_r28, 0.079F, 0.0368F, -0.4786F);
        this.Neck_r28.cubeList.add(new ModelBox(Neck_r28, 6, 26, 1.695F, 2.3897F, -0.5272F, 0, 7, 1, -0.001F, false));

        this.Neck_r29 = new AdvancedModelRenderer(this);
        this.Neck_r29.setRotationPoint(1.0F, 0.1052F, -12.6194F);
        this.Belly.addChild(Neck_r29);
        this.setRotateAngle(Neck_r29, 0.0437F, 0.0755F, -1.002F);
        this.Neck_r29.cubeList.add(new ModelBox(Neck_r29, 30, 21, 0.0255F, -0.0485F, -0.5272F, 0, 3, 1, -0.001F, false));

        this.Neck_r30 = new AdvancedModelRenderer(this);
        this.Neck_r30.setRotationPoint(-0.5F, -1.0785F, -14.1674F);
        this.Belly.addChild(Neck_r30);
        this.setRotateAngle(Neck_r30, -0.2182F, 0.0F, 0.0F);
        this.Neck_r30.cubeList.add(new ModelBox(Neck_r30, 27, 0, 0.5F, -4.2206F, 11.9409F, 0, 2, 1, 0.0F, false));
        this.Neck_r30.cubeList.add(new ModelBox(Neck_r30, 39, 0, 0.5F, -3.8436F, 9.8872F, 0, 2, 1, 0.0F, false));
        this.Neck_r30.cubeList.add(new ModelBox(Neck_r30, 31, 39, 0.5F, -3.6447F, 7.7423F, 0, 2, 1, 0.0F, false));
        this.Neck_r30.cubeList.add(new ModelBox(Neck_r30, 28, 39, 0.5F, -3.4458F, 5.5975F, 0, 2, 1, 0.0F, false));
        this.Neck_r30.cubeList.add(new ModelBox(Neck_r30, 34, 38, 0.5F, -3.0688F, 3.5437F, 0, 2, 1, 0.0F, false));
        this.Neck_r30.cubeList.add(new ModelBox(Neck_r30, 38, 32, 0.5F, -2.3358F, 1.6722F, 0, 2, 1, 0.0F, false));
        this.Neck_r30.cubeList.add(new ModelBox(Neck_r30, 37, 37, 0.5F, -1.6917F, -0.2449F, 0, 2, 1, 0.0F, false));

        this.Neck_r31 = new AdvancedModelRenderer(this);
        this.Neck_r31.setRotationPoint(1.0F, 0.1052F, -12.6194F);
        this.Belly.addChild(Neck_r31);
        this.setRotateAngle(Neck_r31, 0.079F, 0.0368F, -0.3913F);
        this.Neck_r31.cubeList.add(new ModelBox(Neck_r31, 6, 13, 1.695F, 2.3897F, -0.5272F, 0, 8, 1, -0.001F, false));

        this.Neck_r32 = new AdvancedModelRenderer(this);
        this.Neck_r32.setRotationPoint(1.0F, 0.3052F, -14.6194F);
        this.Belly.addChild(Neck_r32);
        this.setRotateAngle(Neck_r32, 0.064F, 0.1141F, -1.0873F);
        this.Neck_r32.cubeList.add(new ModelBox(Neck_r32, 9, 35, 0.0255F, -0.0485F, -0.5272F, 0, 3, 1, -0.001F, false));

        this.Front = new AdvancedModelRenderer(this);
        this.Front.setRotationPoint(0.0F, -0.0935F, -15.0504F);
        this.Belly.addChild(Front);
        this.setRotateAngle(Front, 0.0822F, 0.1097F, -0.0091F);


        this.Front_r1 = new AdvancedModelRenderer(this);
        this.Front_r1.setRotationPoint(0.0F, 1.0489F, -8.9788F);
        this.Front.addChild(Front_r1);
        this.setRotateAngle(Front_r1, 0.0873F, 0.0F, 0.0F);
        this.Front_r1.cubeList.add(new ModelBox(Front_r1, 0, 13, -1.0F, -1.25F, -0.5F, 2, 2, 10, 0.0F, false));

        this.Neck_r33 = new AdvancedModelRenderer(this);
        this.Neck_r33.setRotationPoint(-1.0F, 0.4041F, -1.5982F);
        this.Front.addChild(Neck_r33);
        this.setRotateAngle(Neck_r33, -0.0231F, -0.0609F, 1.0927F);
        this.Neck_r33.cubeList.add(new ModelBox(Neck_r33, 3, 35, -0.0255F, -0.0485F, -0.5272F, 0, 3, 1, -0.001F, false));

        this.Neck_r34 = new AdvancedModelRenderer(this);
        this.Neck_r34.setRotationPoint(-1.0F, 0.4041F, -1.5982F);
        this.Front.addChild(Neck_r34);
        this.setRotateAngle(Neck_r34, 0.0161F, -0.0631F, 0.4806F);
        this.Neck_r34.cubeList.add(new ModelBox(Neck_r34, 0, 0, -1.695F, 2.3897F, -0.5272F, 0, 8, 1, -0.001F, false));

        this.Neck_r35 = new AdvancedModelRenderer(this);
        this.Neck_r35.setRotationPoint(-1.0F, 0.6163F, -3.5869F);
        this.Front.addChild(Neck_r35);
        this.setRotateAngle(Neck_r35, 0.047F, -0.0736F, 0.9146F);
        this.Neck_r35.cubeList.add(new ModelBox(Neck_r35, 26, 35, -0.0255F, -0.0485F, -0.5272F, 0, 3, 1, -0.001F, false));

        this.Neck_r36 = new AdvancedModelRenderer(this);
        this.Neck_r36.setRotationPoint(-1.0F, 0.6163F, -3.5869F);
        this.Front.addChild(Neck_r36);
        this.setRotateAngle(Neck_r36, 0.0807F, -0.0334F, 0.3041F);
        this.Neck_r36.cubeList.add(new ModelBox(Neck_r36, 15, 0, -1.695F, 2.3897F, -0.5272F, 0, 7, 1, -0.001F, false));

        this.Neck_r37 = new AdvancedModelRenderer(this);
        this.Neck_r37.setRotationPoint(-1.0F, 0.8285F, -5.5756F);
        this.Front.addChild(Neck_r37);
        this.setRotateAngle(Neck_r37, 0.0706F, -0.1103F, 0.9997F);
        this.Neck_r37.cubeList.add(new ModelBox(Neck_r37, 36, 5, -0.0255F, -0.0485F, -0.5272F, 0, 3, 1, -0.001F, false));

        this.Neck_r38 = new AdvancedModelRenderer(this);
        this.Neck_r38.setRotationPoint(-1.0F, 0.8285F, -5.5756F);
        this.Front.addChild(Neck_r38);
        this.setRotateAngle(Neck_r38, 0.121F, -0.05F, 0.3897F);
        this.Neck_r38.cubeList.add(new ModelBox(Neck_r38, 21, 0, -1.695F, 2.3897F, -0.5272F, 0, 7, 1, -0.001F, false));

        this.Neck_r39 = new AdvancedModelRenderer(this);
        this.Neck_r39.setRotationPoint(-1.0F, 1.0406F, -7.5643F);
        this.Front.addChild(Neck_r39);
        this.setRotateAngle(Neck_r39, 0.1615F, -0.0665F, 0.2128F);
        this.Neck_r39.cubeList.add(new ModelBox(Neck_r39, 15, 16, -1.695F, 2.3897F, -0.5272F, 0, 5, 1, -0.001F, false));

        this.Neck_r40 = new AdvancedModelRenderer(this);
        this.Neck_r40.setRotationPoint(-1.0F, 1.0406F, -7.5643F);
        this.Front.addChild(Neck_r40);
        this.setRotateAngle(Neck_r40, 0.0945F, -0.147F, 0.8221F);
        this.Neck_r40.cubeList.add(new ModelBox(Neck_r40, 36, 0, -0.0255F, -0.0485F, -0.5272F, 0, 3, 1, -0.001F, false));

        this.Neck_r41 = new AdvancedModelRenderer(this);
        this.Neck_r41.setRotationPoint(1.0F, 0.4041F, -1.5982F);
        this.Front.addChild(Neck_r41);
        this.setRotateAngle(Neck_r41, -0.0075F, 0.0529F, -1.0918F);
        this.Neck_r41.cubeList.add(new ModelBox(Neck_r41, 23, 35, 0.0255F, -0.0485F, -0.5272F, 0, 3, 1, -0.001F, false));

        this.Neck_r42 = new AdvancedModelRenderer(this);
        this.Neck_r42.setRotationPoint(1.0F, 0.4041F, -1.5982F);
        this.Front.addChild(Neck_r42);
        this.setRotateAngle(Neck_r42, 0.0242F, 0.0477F, -0.4801F);
        this.Neck_r42.cubeList.add(new ModelBox(Neck_r42, 0, 13, 1.695F, 2.3897F, -0.5272F, 0, 8, 1, -0.001F, false));

        this.Neck_r43 = new AdvancedModelRenderer(this);
        this.Neck_r43.setRotationPoint(1.0F, 0.6163F, -3.5869F);
        this.Front.addChild(Neck_r43);
        this.setRotateAngle(Neck_r43, 0.047F, 0.0736F, -0.7837F);
        this.Neck_r43.cubeList.add(new ModelBox(Neck_r43, 35, 33, 0.0255F, -0.0485F, -0.5272F, 0, 3, 1, -0.001F, false));

        this.Neck_r44 = new AdvancedModelRenderer(this);
        this.Neck_r44.setRotationPoint(1.0F, 0.6163F, -3.5869F);
        this.Front.addChild(Neck_r44);
        this.setRotateAngle(Neck_r44, 0.0807F, 0.0334F, -0.1732F);
        this.Neck_r44.cubeList.add(new ModelBox(Neck_r44, 18, 0, 1.695F, 2.3897F, -0.5272F, 0, 7, 1, -0.001F, false));

        this.Neck_r45 = new AdvancedModelRenderer(this);
        this.Neck_r45.setRotationPoint(1.0F, 0.8285F, -5.5756F);
        this.Front.addChild(Neck_r45);
        this.setRotateAngle(Neck_r45, 0.0706F, 0.1103F, -0.9997F);
        this.Neck_r45.cubeList.add(new ModelBox(Neck_r45, 36, 16, 0.0255F, -0.0485F, -0.5272F, 0, 3, 1, -0.001F, false));

        this.Neck_r46 = new AdvancedModelRenderer(this);
        this.Neck_r46.setRotationPoint(1.0F, 0.8285F, -5.5756F);
        this.Front.addChild(Neck_r46);
        this.setRotateAngle(Neck_r46, 0.121F, 0.05F, -0.3897F);
        this.Neck_r46.cubeList.add(new ModelBox(Neck_r46, 0, 26, 1.695F, 2.3897F, -0.5272F, 0, 7, 1, -0.001F, false));

        this.Neck_r47 = new AdvancedModelRenderer(this);
        this.Neck_r47.setRotationPoint(-0.5F, -0.4349F, -5.2045F);
        this.Front.addChild(Neck_r47);
        this.setRotateAngle(Neck_r47, -0.3054F, 0.0F, 0.0F);
        this.Neck_r47.cubeList.add(new ModelBox(Neck_r47, 39, 4, 0.5F, -3.2326F, 3.5364F, 0, 2, 1, 0.0F, false));
        this.Neck_r47.cubeList.add(new ModelBox(Neck_r47, 0, 40, 0.5F, -2.4322F, 1.7035F, 0, 2, 1, 0.0F, false));
        this.Neck_r47.cubeList.add(new ModelBox(Neck_r47, 39, 13, 0.5F, -1.6319F, -0.1294F, 0, 2, 1, 0.0F, false));

        this.Neck_r48 = new AdvancedModelRenderer(this);
        this.Neck_r48.setRotationPoint(-0.5F, 0.3489F, -15.3788F);
        this.Front.addChild(Neck_r48);
        this.setRotateAngle(Neck_r48, -0.4363F, 0.0F, 0.0F);
        this.Neck_r48.cubeList.add(new ModelBox(Neck_r48, 39, 17, 0.5F, -5.3344F, 7.1677F, 0, 2, 1, 0.0F, false));
        this.Neck_r48.cubeList.add(new ModelBox(Neck_r48, 39, 21, 0.5F, -4.3016F, 5.455F, 0, 2, 1, 0.0F, false));

        this.Neck_r49 = new AdvancedModelRenderer(this);
        this.Neck_r49.setRotationPoint(1.0F, 1.0406F, -7.5643F);
        this.Front.addChild(Neck_r49);
        this.setRotateAngle(Neck_r49, 0.0945F, 0.147F, -0.9966F);
        this.Neck_r49.cubeList.add(new ModelBox(Neck_r49, 20, 36, 0.0255F, -0.0485F, -0.5272F, 0, 3, 1, -0.001F, false));

        updateDefaultPose();
    }

    public void renderAll(float f) {
        this.resetToDefaultPose();
        this.root.offsetY = -1.0F; //negative makes higher
        this.root.offsetX = 0.175F; //negative makes higher
        this.root.rotateAngleY = 0.1F;
        this.root.render(0.05f);
    }

    public void setRotateAngle(ModelRenderer modelRenderer, float x, float y, float z) {
        modelRenderer.rotateAngleX = x;
        modelRenderer.rotateAngleY = y;
        modelRenderer.rotateAngleZ = z;
    }

}
