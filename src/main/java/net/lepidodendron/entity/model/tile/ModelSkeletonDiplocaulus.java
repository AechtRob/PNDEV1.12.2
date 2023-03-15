package net.lepidodendron.entity.model.tile;

import net.ilexiconn.llibrary.client.model.tools.AdvancedModelBase;
import net.ilexiconn.llibrary.client.model.tools.AdvancedModelRenderer;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;

public class ModelSkeletonDiplocaulus extends AdvancedModelBase {
    private final AdvancedModelRenderer body;
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
    private final AdvancedModelRenderer forelegL;
    private final AdvancedModelRenderer forelegL2;
    private final AdvancedModelRenderer forelegL3;
    private final AdvancedModelRenderer forelegL4;
    private final AdvancedModelRenderer forelegL5;
    private final AdvancedModelRenderer forelegL6;
    private final AdvancedModelRenderer neck;
    private final AdvancedModelRenderer cube_r12;
    private final AdvancedModelRenderer cube_r13;
    private final AdvancedModelRenderer cube_r14;
    private final AdvancedModelRenderer wholehead;
    private final AdvancedModelRenderer lowerhead;
    private final AdvancedModelRenderer jaw;
    private final AdvancedModelRenderer upperjaw;
    private final AdvancedModelRenderer cube_r15;
    private final AdvancedModelRenderer bone2;
    private final AdvancedModelRenderer cube_r16;
    private final AdvancedModelRenderer cube_r17;
    private final AdvancedModelRenderer cube_r18;
    private final AdvancedModelRenderer bone3;
    private final AdvancedModelRenderer cube_r19;
    private final AdvancedModelRenderer cube_r20;
    private final AdvancedModelRenderer cube_r21;
    private final AdvancedModelRenderer body2;
    private final AdvancedModelRenderer cube_r22;
    private final AdvancedModelRenderer cube_r23;
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
    private final AdvancedModelRenderer body3;
    private final AdvancedModelRenderer cube_r34;
    private final AdvancedModelRenderer cube_r35;
    private final AdvancedModelRenderer cube_r36;
    private final AdvancedModelRenderer cube_r37;
    private final AdvancedModelRenderer cube_r38;
    private final AdvancedModelRenderer body4;
    private final AdvancedModelRenderer cube_r39;
    private final AdvancedModelRenderer cube_r40;
    private final AdvancedModelRenderer cube_r41;
    private final AdvancedModelRenderer cube_r42;
    private final AdvancedModelRenderer cube_r43;
    private final AdvancedModelRenderer cube_r44;
    private final AdvancedModelRenderer cube_r45;
    private final AdvancedModelRenderer cube_r46;
    private final AdvancedModelRenderer cube_r47;
    private final AdvancedModelRenderer cube_r48;
    private final AdvancedModelRenderer cube_r49;
    private final AdvancedModelRenderer cube_r50;
    private final AdvancedModelRenderer cube_r51;
    private final AdvancedModelRenderer tail;
    private final AdvancedModelRenderer cube_r52;
    private final AdvancedModelRenderer cube_r53;
    private final AdvancedModelRenderer tail2;
    private final AdvancedModelRenderer tail3;
    private final AdvancedModelRenderer cube_r54;
    private final AdvancedModelRenderer tail4;
    private final AdvancedModelRenderer tail5;
    private final AdvancedModelRenderer hindlegL;
    private final AdvancedModelRenderer hindlegL2;
    private final AdvancedModelRenderer cube_r55;
    private final AdvancedModelRenderer hindlegL3;
    private final AdvancedModelRenderer hindlegL4;
    private final AdvancedModelRenderer hindlegL5;
    private final AdvancedModelRenderer cube_r56;
    private final AdvancedModelRenderer hindlegL6;

    public ModelSkeletonDiplocaulus() {
        this.textureWidth = 64;
        this.textureHeight = 64;

        this.body = new AdvancedModelRenderer(this);
        this.body.setRotationPoint(0.0F, 19.0F, 0.0F);
        this.setRotateAngle(body, 0.4363F, 0.0F, 0.0F);


        this.cube_r1 = new AdvancedModelRenderer(this);
        this.cube_r1.setRotationPoint(0.0F, -2.1F, 1.0F);
        this.body.addChild(cube_r1);
        this.setRotateAngle(cube_r1, 0.0175F, 0.0F, 0.0F);
        this.cube_r1.cubeList.add(new ModelBox(cube_r1, 34, 39, -0.5F, 1.4F, 0.0F, 1, 1, 4, 0.001F, false));
        this.cube_r1.cubeList.add(new ModelBox(cube_r1, 26, 24, -0.5F, 1.4F, -1.0F, 1, 1, 1, 0.001F, false));
        this.cube_r1.cubeList.add(new ModelBox(cube_r1, 41, 6, -0.5F, -0.6F, 0.0F, 1, 1, 4, 0.001F, false));

        this.cube_r2 = new AdvancedModelRenderer(this);
        this.cube_r2.setRotationPoint(-0.5F, 0.3F, 1.5F);
        this.body.addChild(cube_r2);
        this.setRotateAngle(cube_r2, 0.0166F, -0.0052F, 0.3054F);
        this.cube_r2.cubeList.add(new ModelBox(cube_r2, 10, 34, -2.0019F, -1.0082F, -0.458F, 2, 1, 5, 0.0F, true));

        this.cube_r3 = new AdvancedModelRenderer(this);
        this.cube_r3.setRotationPoint(-2.1F, -0.7F, 1.5F);
        this.body.addChild(cube_r3);
        this.setRotateAngle(cube_r3, 0.0094F, -0.0147F, 1.0035F);
        this.cube_r3.cubeList.add(new ModelBox(cube_r3, 10, 34, -0.8753F, -0.5357F, -0.4755F, 1, 1, 1, 0.001F, true));

        this.cube_r4 = new AdvancedModelRenderer(this);
        this.cube_r4.setRotationPoint(2.1F, -0.7F, 1.5F);
        this.body.addChild(cube_r4);
        this.setRotateAngle(cube_r4, 0.0094F, 0.0147F, -1.0035F);
        this.cube_r4.cubeList.add(new ModelBox(cube_r4, 10, 34, -0.1247F, -0.5357F, -0.4755F, 1, 1, 1, 0.001F, false));

        this.cube_r5 = new AdvancedModelRenderer(this);
        this.cube_r5.setRotationPoint(0.5F, 0.3F, 1.5F);
        this.body.addChild(cube_r5);
        this.setRotateAngle(cube_r5, 0.0166F, 0.0052F, -0.3054F);
        this.cube_r5.cubeList.add(new ModelBox(cube_r5, 10, 34, 0.0019F, -1.0082F, -0.458F, 2, 1, 5, 0.0F, false));

        this.cube_r6 = new AdvancedModelRenderer(this);
        this.cube_r6.setRotationPoint(-0.4F, -1.9F, 4.1F);
        this.body.addChild(cube_r6);
        this.setRotateAngle(cube_r6, 0.0508F, 0.1833F, -0.6191F);
        this.cube_r6.cubeList.add(new ModelBox(cube_r6, 22, 30, -3.5786F, -1.1223F, -0.0607F, 2, 0, 1, 0.0F, true));

        this.cube_r7 = new AdvancedModelRenderer(this);
        this.cube_r7.setRotationPoint(-0.4F, -1.9F, 4.1F);
        this.body.addChild(cube_r7);
        this.setRotateAngle(cube_r7, 0.1108F, 0.1549F, -0.2661F);
        this.cube_r7.cubeList.add(new ModelBox(cube_r7, 0, 34, -1.8998F, -0.545F, -0.0607F, 2, 0, 1, 0.0F, true));

        this.cube_r8 = new AdvancedModelRenderer(this);
        this.cube_r8.setRotationPoint(-0.7F, -1.5F, 0.0F);
        this.body.addChild(cube_r8);
        this.setRotateAngle(cube_r8, 0.0497F, 0.2865F, -0.3646F);
        this.cube_r8.cubeList.add(new ModelBox(cube_r8, 0, 36, -2.0F, -0.6F, 2.0F, 2, 0, 1, 0.0F, true));

        this.cube_r9 = new AdvancedModelRenderer(this);
        this.cube_r9.setRotationPoint(0.4F, -1.9F, 4.1F);
        this.body.addChild(cube_r9);
        this.setRotateAngle(cube_r9, 0.0508F, -0.1833F, 0.6191F);
        this.cube_r9.cubeList.add(new ModelBox(cube_r9, 22, 30, 1.5786F, -1.1223F, -0.0607F, 2, 0, 1, 0.0F, false));

        this.cube_r10 = new AdvancedModelRenderer(this);
        this.cube_r10.setRotationPoint(0.4F, -1.9F, 4.1F);
        this.body.addChild(cube_r10);
        this.setRotateAngle(cube_r10, 0.1108F, -0.1549F, 0.2661F);
        this.cube_r10.cubeList.add(new ModelBox(cube_r10, 0, 34, -0.1002F, -0.545F, -0.0607F, 2, 0, 1, 0.0F, false));

        this.cube_r11 = new AdvancedModelRenderer(this);
        this.cube_r11.setRotationPoint(0.7F, -1.5F, 0.0F);
        this.body.addChild(cube_r11);
        this.setRotateAngle(cube_r11, 0.0497F, -0.2865F, 0.3646F);
        this.cube_r11.cubeList.add(new ModelBox(cube_r11, 0, 36, 0.0F, -0.6F, 2.0F, 2, 0, 1, 0.0F, false));

        this.forelegL = new AdvancedModelRenderer(this);
        this.forelegL.setRotationPoint(2.4F, -0.75F, 2.1F);
        this.body.addChild(forelegL);
        this.setRotateAngle(forelegL, -0.4717F, -0.7625F, 0.7716F);
        this.forelegL.cubeList.add(new ModelBox(forelegL, 0, 16, 0.0F, -0.5F, 0.0F, 2, 1, 1, 0.01F, false));

        this.forelegL2 = new AdvancedModelRenderer(this);
        this.forelegL2.setRotationPoint(1.65F, 0.0F, 0.0F);
        this.forelegL.addChild(forelegL2);
        this.setRotateAngle(forelegL2, 0.8578F, 0.2876F, 0.192F);
        this.forelegL2.cubeList.add(new ModelBox(forelegL2, 14, 3, 0.0F, -0.5F, 0.0F, 2, 1, 1, 0.0F, false));

        this.forelegL3 = new AdvancedModelRenderer(this);
        this.forelegL3.setRotationPoint(2.0F, 0.0F, 0.0F);
        this.forelegL2.addChild(forelegL3);
        this.setRotateAngle(forelegL3, 0.0797F, 0.043F, -0.1747F);
        this.forelegL3.cubeList.add(new ModelBox(forelegL3, 41, 39, -0.1F, -0.5F, -0.5F, 2, 1, 2, -0.01F, false));

        this.forelegL4 = new AdvancedModelRenderer(this);
        this.forelegL4.setRotationPoint(-2.4F, -0.75F, 2.1F);
        this.body.addChild(forelegL4);
        this.setRotateAngle(forelegL4, 0.0859F, -0.3434F, -0.5255F);
        this.forelegL4.cubeList.add(new ModelBox(forelegL4, 0, 16, -2.0F, -0.5F, 0.0F, 2, 1, 1, 0.01F, true));

        this.forelegL5 = new AdvancedModelRenderer(this);
        this.forelegL5.setRotationPoint(-1.65F, 0.0F, 0.0F);
        this.forelegL4.addChild(forelegL5);
        this.setRotateAngle(forelegL5, 1.1345F, -1.0908F, 0.0F);
        this.forelegL5.cubeList.add(new ModelBox(forelegL5, 14, 3, -2.0F, -0.5F, 0.0F, 2, 1, 1, 0.0F, true));

        this.forelegL6 = new AdvancedModelRenderer(this);
        this.forelegL6.setRotationPoint(-2.0F, 0.0F, 0.0F);
        this.forelegL5.addChild(forelegL6);
        this.setRotateAngle(forelegL6, 0.0881F, -0.0209F, -0.0863F);
        this.forelegL6.cubeList.add(new ModelBox(forelegL6, 41, 39, -1.9F, -0.5F, -0.5F, 2, 1, 2, -0.01F, true));

        this.neck = new AdvancedModelRenderer(this);
        this.neck.setRotationPoint(0.0F, -2.5F, 2.0F);
        this.body.addChild(neck);
        this.setRotateAngle(neck, -0.3054F, -0.0873F, 0.0F);


        this.cube_r12 = new AdvancedModelRenderer(this);
        this.cube_r12.setRotationPoint(-0.7F, 1.0F, -2.0F);
        this.neck.addChild(cube_r12);
        this.setRotateAngle(cube_r12, 0.0497F, 0.2865F, -0.3646F);
        this.cube_r12.cubeList.add(new ModelBox(cube_r12, 10, 43, -0.6F, -0.4F, 0.0F, 1, 0, 1, 0.0F, true));

        this.cube_r13 = new AdvancedModelRenderer(this);
        this.cube_r13.setRotationPoint(0.7F, 1.0F, -2.0F);
        this.neck.addChild(cube_r13);
        this.setRotateAngle(cube_r13, 0.0497F, -0.2865F, 0.3646F);
        this.cube_r13.cubeList.add(new ModelBox(cube_r13, 10, 43, -0.4F, -0.4F, 0.0F, 1, 0, 1, 0.0F, false));

        this.cube_r14 = new AdvancedModelRenderer(this);
        this.cube_r14.setRotationPoint(0.0F, 0.5F, -3.0F);
        this.neck.addChild(cube_r14);
        this.setRotateAngle(cube_r14, 0.0873F, 0.0F, 0.0F);
        this.cube_r14.cubeList.add(new ModelBox(cube_r14, 13, 41, -0.5F, -0.5F, -1.0F, 1, 1, 4, 0.0F, false));

        this.wholehead = new AdvancedModelRenderer(this);
        this.wholehead.setRotationPoint(0.0F, 0.5F, -3.0F);
        this.neck.addChild(wholehead);
        this.setRotateAngle(wholehead, -0.4363F, -0.3927F, 0.0F);


        this.lowerhead = new AdvancedModelRenderer(this);
        this.lowerhead.setRotationPoint(0.0F, 0.5F, -1.0F);
        this.wholehead.addChild(lowerhead);
        this.setRotateAngle(lowerhead, 0.2182F, 0.0F, 0.0F);
        this.lowerhead.cubeList.add(new ModelBox(lowerhead, 0, 27, 0.5F, 0.25F, -3.0F, 1, 1, 3, 0.0F, false));
        this.lowerhead.cubeList.add(new ModelBox(lowerhead, 0, 27, -1.5F, 0.25F, -3.0F, 1, 1, 3, 0.0F, true));

        this.jaw = new AdvancedModelRenderer(this);
        this.jaw.setRotationPoint(0.0F, 0.25F, -3.0F);
        this.lowerhead.addChild(jaw);
        this.jaw.cubeList.add(new ModelBox(jaw, 24, 42, -1.0F, 0.0F, -3.0F, 2, 1, 3, 0.0F, false));

        this.upperjaw = new AdvancedModelRenderer(this);
        this.upperjaw.setRotationPoint(0.0F, 0.0F, -0.25F);
        this.wholehead.addChild(upperjaw);
        this.setRotateAngle(upperjaw, 0.1745F, 0.0F, 0.0F);


        this.cube_r15 = new AdvancedModelRenderer(this);
        this.cube_r15.setRotationPoint(0.0F, 1.75F, 2.0F);
        this.upperjaw.addChild(cube_r15);
        this.setRotateAngle(cube_r15, -0.0436F, 0.0F, 0.0F);
        this.cube_r15.cubeList.add(new ModelBox(cube_r15, 37, 19, -1.5F, -2.7526F, -8.5392F, 1, 1, 1, 0.01F, false));
        this.cube_r15.cubeList.add(new ModelBox(cube_r15, 0, 38, 0.5F, -2.7526F, -8.5392F, 1, 1, 1, 0.01F, false));
        this.cube_r15.cubeList.add(new ModelBox(cube_r15, 23, 24, -1.5F, -2.6526F, -9.5392F, 3, 1, 8, 0.01F, false));

        this.bone2 = new AdvancedModelRenderer(this);
        this.bone2.setRotationPoint(0.0F, 0.0F, 2.0F);
        this.upperjaw.addChild(bone2);


        this.cube_r16 = new AdvancedModelRenderer(this);
        this.cube_r16.setRotationPoint(2.4F, 0.1F, -0.1F);
        this.bone2.addChild(cube_r16);
        this.setRotateAngle(cube_r16, -0.052F, 0.6482F, 0.0909F);
        this.cube_r16.cubeList.add(new ModelBox(cube_r16, 41, 12, 4.2096F, -0.7032F, 2.8554F, 2, 1, 3, 0.005F, false));

        this.cube_r17 = new AdvancedModelRenderer(this);
        this.cube_r17.setRotationPoint(2.4F, 0.1F, -0.1F);
        this.bone2.addChild(cube_r17);
        this.setRotateAngle(cube_r17, -0.0609F, 0.8224F, 0.0776F);
        this.cube_r17.cubeList.add(new ModelBox(cube_r17, 34, 0, 2.2127F, -0.7032F, 0.1364F, 4, 1, 4, 0.0075F, false));

        this.cube_r18 = new AdvancedModelRenderer(this);
        this.cube_r18.setRotationPoint(2.4F, 0.1F, -0.1F);
        this.bone2.addChild(cube_r18);
        this.setRotateAngle(cube_r18, -0.0716F, 0.9531F, 0.0639F);
        this.cube_r18.cubeList.add(new ModelBox(cube_r18, 14, 0, 0.7115F, -0.7032F, -6.0901F, 6, 1, 7, 0.01F, false));

        this.bone3 = new AdvancedModelRenderer(this);
        this.bone3.setRotationPoint(0.0F, 0.0F, 2.0F);
        this.upperjaw.addChild(bone3);


        this.cube_r19 = new AdvancedModelRenderer(this);
        this.cube_r19.setRotationPoint(-2.4F, 0.1F, -0.1F);
        this.bone3.addChild(cube_r19);
        this.setRotateAngle(cube_r19, -0.052F, -0.6482F, -0.0909F);
        this.cube_r19.cubeList.add(new ModelBox(cube_r19, 0, 6, -6.2096F, -0.7032F, 2.8554F, 2, 1, 3, 0.005F, false));

        this.cube_r20 = new AdvancedModelRenderer(this);
        this.cube_r20.setRotationPoint(-2.4F, 0.1F, -0.1F);
        this.bone3.addChild(cube_r20);
        this.setRotateAngle(cube_r20, -0.0609F, -0.8224F, -0.0776F);
        this.cube_r20.cubeList.add(new ModelBox(cube_r20, 13, 24, -6.2127F, -0.7032F, 0.1364F, 4, 1, 4, 0.0075F, false));

        this.cube_r21 = new AdvancedModelRenderer(this);
        this.cube_r21.setRotationPoint(-2.4F, 0.1F, -0.1F);
        this.bone3.addChild(cube_r21);
        this.setRotateAngle(cube_r21, -0.0716F, -0.9531F, -0.0639F);
        this.cube_r21.cubeList.add(new ModelBox(cube_r21, 0, 13, -6.7115F, -0.7032F, -6.0901F, 6, 1, 7, 0.01F, false));

        this.body2 = new AdvancedModelRenderer(this);
        this.body2.setRotationPoint(0.0F, -2.0F, 4.0F);
        this.body.addChild(body2);
        this.setRotateAngle(body2, 0.2618F, 0.0873F, 0.0F);
        this.body2.cubeList.add(new ModelBox(body2, 30, 9, -0.5F, -0.7F, 0.0F, 1, 1, 8, 0.01F, false));

        this.cube_r22 = new AdvancedModelRenderer(this);
        this.cube_r22.setRotationPoint(-0.4F, 0.1F, 6.1F);
        this.body2.addChild(cube_r22);
        this.setRotateAngle(cube_r22, 0.1108F, 0.1549F, -0.2661F);
        this.cube_r22.cubeList.add(new ModelBox(cube_r22, 30, 12, -1.8998F, -0.545F, -0.0607F, 2, 0, 1, 0.0F, true));

        this.cube_r23 = new AdvancedModelRenderer(this);
        this.cube_r23.setRotationPoint(-0.4F, 0.1F, 6.1F);
        this.body2.addChild(cube_r23);
        this.setRotateAngle(cube_r23, 0.0508F, 0.1833F, -0.6191F);
        this.cube_r23.cubeList.add(new ModelBox(cube_r23, 20, 17, -3.5786F, -1.1223F, -0.0607F, 2, 0, 1, 0.0F, true));

        this.cube_r24 = new AdvancedModelRenderer(this);
        this.cube_r24.setRotationPoint(-0.4F, 0.1F, 4.1F);
        this.body2.addChild(cube_r24);
        this.setRotateAngle(cube_r24, 0.0508F, 0.1833F, -0.6191F);
        this.cube_r24.cubeList.add(new ModelBox(cube_r24, 13, 30, -4.5786F, -1.1223F, -0.0607F, 3, 0, 1, 0.0F, true));

        this.cube_r25 = new AdvancedModelRenderer(this);
        this.cube_r25.setRotationPoint(-0.4F, 0.1F, 4.1F);
        this.body2.addChild(cube_r25);
        this.setRotateAngle(cube_r25, 0.1108F, 0.1549F, -0.2661F);
        this.cube_r25.cubeList.add(new ModelBox(cube_r25, 30, 14, -1.8998F, -0.545F, -0.0607F, 2, 0, 1, 0.0F, true));

        this.cube_r26 = new AdvancedModelRenderer(this);
        this.cube_r26.setRotationPoint(-0.4F, 0.3F, 2.1F);
        this.body2.addChild(cube_r26);
        this.setRotateAngle(cube_r26, 0.1108F, 0.1549F, -0.2661F);
        this.cube_r26.cubeList.add(new ModelBox(cube_r26, 30, 19, -1.8998F, -0.745F, -0.0607F, 2, 0, 1, 0.0F, true));

        this.cube_r27 = new AdvancedModelRenderer(this);
        this.cube_r27.setRotationPoint(-0.4F, 0.3F, 2.1F);
        this.body2.addChild(cube_r27);
        this.setRotateAngle(cube_r27, 0.0508F, 0.1833F, -0.6191F);
        this.cube_r27.cubeList.add(new ModelBox(cube_r27, 14, 9, -4.4786F, -1.3223F, -0.0607F, 3, 0, 1, 0.0F, true));

        this.cube_r28 = new AdvancedModelRenderer(this);
        this.cube_r28.setRotationPoint(0.4F, 0.1F, 6.1F);
        this.body2.addChild(cube_r28);
        this.setRotateAngle(cube_r28, 0.0508F, -0.1833F, 0.6191F);
        this.cube_r28.cubeList.add(new ModelBox(cube_r28, 20, 17, 1.5786F, -1.1223F, -0.0607F, 2, 0, 1, 0.0F, false));

        this.cube_r29 = new AdvancedModelRenderer(this);
        this.cube_r29.setRotationPoint(0.4F, 0.1F, 6.1F);
        this.body2.addChild(cube_r29);
        this.setRotateAngle(cube_r29, 0.1108F, -0.1549F, 0.2661F);
        this.cube_r29.cubeList.add(new ModelBox(cube_r29, 30, 12, -0.1002F, -0.545F, -0.0607F, 2, 0, 1, 0.0F, false));

        this.cube_r30 = new AdvancedModelRenderer(this);
        this.cube_r30.setRotationPoint(0.4F, 0.1F, 4.1F);
        this.body2.addChild(cube_r30);
        this.setRotateAngle(cube_r30, 0.1108F, -0.1549F, 0.2661F);
        this.cube_r30.cubeList.add(new ModelBox(cube_r30, 30, 14, -0.1002F, -0.545F, -0.0607F, 2, 0, 1, 0.0F, false));

        this.cube_r31 = new AdvancedModelRenderer(this);
        this.cube_r31.setRotationPoint(0.4F, 0.3F, 2.1F);
        this.body2.addChild(cube_r31);
        this.setRotateAngle(cube_r31, 0.0508F, -0.1833F, 0.6191F);
        this.cube_r31.cubeList.add(new ModelBox(cube_r31, 14, 9, 1.4786F, -1.3223F, -0.0607F, 3, 0, 1, 0.0F, false));

        this.cube_r32 = new AdvancedModelRenderer(this);
        this.cube_r32.setRotationPoint(0.4F, 0.1F, 4.1F);
        this.body2.addChild(cube_r32);
        this.setRotateAngle(cube_r32, 0.0508F, -0.1833F, 0.6191F);
        this.cube_r32.cubeList.add(new ModelBox(cube_r32, 13, 30, 1.5786F, -1.1223F, -0.0607F, 3, 0, 1, 0.0F, false));

        this.cube_r33 = new AdvancedModelRenderer(this);
        this.cube_r33.setRotationPoint(0.4F, 0.3F, 2.1F);
        this.body2.addChild(cube_r33);
        this.setRotateAngle(cube_r33, 0.1108F, -0.1549F, 0.2661F);
        this.cube_r33.cubeList.add(new ModelBox(cube_r33, 30, 19, -0.1002F, -0.745F, -0.0607F, 2, 0, 1, 0.0F, false));

        this.body3 = new AdvancedModelRenderer(this);
        this.body3.setRotationPoint(0.0F, 0.0F, 7.1F);
        this.body2.addChild(body3);
        this.setRotateAngle(body3, 0.1309F, 0.0873F, 0.0F);


        this.cube_r34 = new AdvancedModelRenderer(this);
        this.cube_r34.setRotationPoint(0.0F, 0.0F, 0.9F);
        this.body3.addChild(cube_r34);
        this.setRotateAngle(cube_r34, -0.0436F, 0.0F, 0.0F);
        this.cube_r34.cubeList.add(new ModelBox(cube_r34, 38, 26, -0.5F, -0.7F, -1.0F, 1, 1, 4, 0.0F, false));

        this.cube_r35 = new AdvancedModelRenderer(this);
        this.cube_r35.setRotationPoint(-0.4F, 0.1F, 1.0F);
        this.body3.addChild(cube_r35);
        this.setRotateAngle(cube_r35, 0.0508F, 0.1833F, -0.6191F);
        this.cube_r35.cubeList.add(new ModelBox(cube_r35, 5, 43, -2.5786F, -1.1223F, -0.0607F, 1, 0, 1, 0.0F, true));

        this.cube_r36 = new AdvancedModelRenderer(this);
        this.cube_r36.setRotationPoint(-0.4F, 0.1F, 1.0F);
        this.body3.addChild(cube_r36);
        this.setRotateAngle(cube_r36, 0.1108F, 0.1549F, -0.2661F);
        this.cube_r36.cubeList.add(new ModelBox(cube_r36, 20, 15, -1.8998F, -0.545F, -0.0607F, 2, 0, 1, 0.0F, true));

        this.cube_r37 = new AdvancedModelRenderer(this);
        this.cube_r37.setRotationPoint(0.4F, 0.1F, 1.0F);
        this.body3.addChild(cube_r37);
        this.setRotateAngle(cube_r37, 0.1108F, -0.1549F, 0.2661F);
        this.cube_r37.cubeList.add(new ModelBox(cube_r37, 20, 15, -0.1002F, -0.545F, -0.0607F, 2, 0, 1, 0.0F, false));

        this.cube_r38 = new AdvancedModelRenderer(this);
        this.cube_r38.setRotationPoint(0.4F, 0.1F, 1.0F);
        this.body3.addChild(cube_r38);
        this.setRotateAngle(cube_r38, 0.0508F, -0.1833F, 0.6191F);
        this.cube_r38.cubeList.add(new ModelBox(cube_r38, 5, 43, 1.5786F, -1.1223F, -0.0607F, 1, 0, 1, 0.0F, false));

        this.body4 = new AdvancedModelRenderer(this);
        this.body4.setRotationPoint(0.0F, 0.0F, 3.4F);
        this.body3.addChild(body4);
        this.setRotateAngle(body4, 0.0F, -0.1745F, 0.0F);


        this.cube_r39 = new AdvancedModelRenderer(this);
        this.cube_r39.setRotationPoint(-0.5F, 2.5F, 1.5F);
        this.body4.addChild(cube_r39);
        this.setRotateAngle(cube_r39, -0.0403F, 0.0167F, 0.3924F);
        this.cube_r39.cubeList.add(new ModelBox(cube_r39, 0, 22, -1.0F, -1.0104F, -0.1071F, 1, 1, 3, 0.0F, true));

        this.cube_r40 = new AdvancedModelRenderer(this);
        this.cube_r40.setRotationPoint(-1.3F, 2.2F, 1.5F);
        this.body4.addChild(cube_r40);
        this.setRotateAngle(cube_r40, 0.0149F, 0.041F, 1.9202F);
        this.cube_r40.cubeList.add(new ModelBox(cube_r40, 20, 34, -2.1462F, -0.1396F, 0.9059F, 2, 1, 2, -0.01F, true));

        this.cube_r41 = new AdvancedModelRenderer(this);
        this.cube_r41.setRotationPoint(1.3F, 2.2F, 1.5F);
        this.body4.addChild(cube_r41);
        this.setRotateAngle(cube_r41, 0.0149F, -0.041F, -1.9202F);
        this.cube_r41.cubeList.add(new ModelBox(cube_r41, 20, 34, 0.1462F, -0.1396F, 0.9059F, 2, 1, 2, -0.01F, false));

        this.cube_r42 = new AdvancedModelRenderer(this);
        this.cube_r42.setRotationPoint(0.5F, 2.5F, 1.5F);
        this.body4.addChild(cube_r42);
        this.setRotateAngle(cube_r42, -0.0403F, -0.0167F, -0.3924F);
        this.cube_r42.cubeList.add(new ModelBox(cube_r42, 0, 22, 0.0F, -1.0104F, -0.1071F, 1, 1, 3, 0.0F, false));

        this.cube_r43 = new AdvancedModelRenderer(this);
        this.cube_r43.setRotationPoint(0.0F, 0.0F, -0.5F);
        this.body4.addChild(cube_r43);
        this.setRotateAngle(cube_r43, -0.0436F, 0.0F, 0.0F);
        this.cube_r43.cubeList.add(new ModelBox(cube_r43, 25, 34, -0.5F, 1.4F, 0.0F, 1, 1, 5, -0.01F, false));
        this.cube_r43.cubeList.add(new ModelBox(cube_r43, 0, 0, -0.5F, -0.6F, 0.0F, 1, 1, 4, -0.01F, false));

        this.cube_r44 = new AdvancedModelRenderer(this);
        this.cube_r44.setRotationPoint(-0.4F, 0.4F, 1.6F);
        this.body4.addChild(cube_r44);
        this.setRotateAngle(cube_r44, 0.0508F, 0.1833F, -0.6191F);
        this.cube_r44.cubeList.add(new ModelBox(cube_r44, 32, 41, -1.5786F, -0.8223F, -0.0607F, 1, 0, 1, 0.0F, true));

        this.cube_r45 = new AdvancedModelRenderer(this);
        this.cube_r45.setRotationPoint(-0.4F, 0.4F, 1.6F);
        this.body4.addChild(cube_r45);
        this.setRotateAngle(cube_r45, 0.1108F, 0.1549F, -0.2661F);
        this.cube_r45.cubeList.add(new ModelBox(cube_r45, 20, 41, -0.8998F, -0.545F, -0.0607F, 1, 0, 1, 0.0F, true));

        this.cube_r46 = new AdvancedModelRenderer(this);
        this.cube_r46.setRotationPoint(-0.4F, 0.3F, -0.4F);
        this.body4.addChild(cube_r46);
        this.setRotateAngle(cube_r46, 0.1108F, 0.1549F, -0.2661F);
        this.cube_r46.cubeList.add(new ModelBox(cube_r46, 20, 13, -1.8998F, -0.545F, -0.0607F, 2, 0, 1, 0.0F, true));

        this.cube_r47 = new AdvancedModelRenderer(this);
        this.cube_r47.setRotationPoint(-0.4F, 0.3F, -0.4F);
        this.body4.addChild(cube_r47);
        this.setRotateAngle(cube_r47, 0.0508F, 0.1833F, -0.6191F);
        this.cube_r47.cubeList.add(new ModelBox(cube_r47, 0, 43, -2.5786F, -1.1223F, -0.0607F, 1, 0, 1, 0.0F, true));

        this.cube_r48 = new AdvancedModelRenderer(this);
        this.cube_r48.setRotationPoint(0.4F, 0.4F, 1.6F);
        this.body4.addChild(cube_r48);
        this.setRotateAngle(cube_r48, 0.1108F, -0.1549F, 0.2661F);
        this.cube_r48.cubeList.add(new ModelBox(cube_r48, 20, 41, -0.1002F, -0.545F, -0.0607F, 1, 0, 1, 0.0F, false));

        this.cube_r49 = new AdvancedModelRenderer(this);
        this.cube_r49.setRotationPoint(0.4F, 0.4F, 1.6F);
        this.body4.addChild(cube_r49);
        this.setRotateAngle(cube_r49, 0.0508F, -0.1833F, 0.6191F);
        this.cube_r49.cubeList.add(new ModelBox(cube_r49, 32, 41, 0.5786F, -0.8223F, -0.0607F, 1, 0, 1, 0.0F, false));

        this.cube_r50 = new AdvancedModelRenderer(this);
        this.cube_r50.setRotationPoint(0.4F, 0.3F, -0.4F);
        this.body4.addChild(cube_r50);
        this.setRotateAngle(cube_r50, 0.1108F, -0.1549F, 0.2661F);
        this.cube_r50.cubeList.add(new ModelBox(cube_r50, 20, 13, -0.1002F, -0.545F, -0.0607F, 2, 0, 1, 0.0F, false));

        this.cube_r51 = new AdvancedModelRenderer(this);
        this.cube_r51.setRotationPoint(0.4F, 0.3F, -0.4F);
        this.body4.addChild(cube_r51);
        this.setRotateAngle(cube_r51, 0.0508F, -0.1833F, 0.6191F);
        this.cube_r51.cubeList.add(new ModelBox(cube_r51, 0, 43, 1.5786F, -1.1223F, -0.0607F, 1, 0, 1, 0.0F, false));

        this.tail = new AdvancedModelRenderer(this);
        this.tail.setRotationPoint(0.0F, 0.25F, 2.5F);
        this.body4.addChild(tail);
        this.setRotateAngle(tail, -0.0847F, -0.0444F, -0.0112F);
        this.tail.cubeList.add(new ModelBox(tail, 38, 20, -0.5F, -0.6936F, -0.001F, 1, 1, 4, 0.01F, false));

        this.cube_r52 = new AdvancedModelRenderer(this);
        this.cube_r52.setRotationPoint(-0.4F, 0.3064F, 1.099F);
        this.tail.addChild(cube_r52);
        this.setRotateAngle(cube_r52, 0.1108F, 0.1549F, -0.2661F);
        this.cube_r52.cubeList.add(new ModelBox(cube_r52, 10, 37, -0.8998F, -0.545F, -0.0607F, 1, 0, 1, 0.0F, true));

        this.cube_r53 = new AdvancedModelRenderer(this);
        this.cube_r53.setRotationPoint(0.4F, 0.3064F, 1.099F);
        this.tail.addChild(cube_r53);
        this.setRotateAngle(cube_r53, 0.1108F, -0.1549F, 0.2661F);
        this.cube_r53.cubeList.add(new ModelBox(cube_r53, 10, 37, -0.1002F, -0.545F, -0.0607F, 1, 0, 1, 0.0F, false));

        this.tail2 = new AdvancedModelRenderer(this);
        this.tail2.setRotationPoint(0.0F, -0.0436F, 3.999F);
        this.tail.addChild(tail2);
        this.setRotateAngle(tail2, -0.0433F, -0.1746F, -0.0019F);
        this.tail2.cubeList.add(new ModelBox(tail2, 0, 34, -0.5F, -0.65F, -0.5F, 1, 1, 7, 0.0F, false));

        this.tail3 = new AdvancedModelRenderer(this);
        this.tail3.setRotationPoint(0.0F, 0.0F, 6.0F);
        this.tail2.addChild(tail3);
        this.setRotateAngle(tail3, 0.0271F, 0.2617F, 0.007F);


        this.cube_r54 = new AdvancedModelRenderer(this);
        this.cube_r54.setRotationPoint(0.0F, -0.25F, 0.0F);
        this.tail3.addChild(cube_r54);
        this.setRotateAngle(cube_r54, -0.0436F, 0.0F, 0.0F);
        this.cube_r54.cubeList.add(new ModelBox(cube_r54, 0, 0, -0.5F, -0.4F, -0.5F, 1, 1, 11, -0.01F, false));

        this.tail4 = new AdvancedModelRenderer(this);
        this.tail4.setRotationPoint(0.0F, 0.25F, 10.0F);
        this.tail3.addChild(tail4);
        this.setRotateAngle(tail4, 0.0F, 0.4363F, 0.0F);
        this.tail4.cubeList.add(new ModelBox(tail4, 0, 22, -0.5F, -0.5F, 0.0F, 1, 1, 10, -0.02F, false));

        this.tail5 = new AdvancedModelRenderer(this);
        this.tail5.setRotationPoint(0.0F, 0.0F, 10.0F);
        this.tail4.addChild(tail5);
        this.setRotateAngle(tail5, 0.0F, -0.4363F, 0.0F);
        this.tail5.cubeList.add(new ModelBox(tail5, 17, 12, -0.5F, -0.5F, -0.25F, 1, 1, 10, -0.03F, false));

        this.hindlegL = new AdvancedModelRenderer(this);
        this.hindlegL.setRotationPoint(1.7F, 1.0F, 2.5F);
        this.body4.addChild(hindlegL);
        this.setRotateAngle(hindlegL, -0.0938F, 0.4866F, 0.2017F);
        this.hindlegL.cubeList.add(new ModelBox(hindlegL, 25, 9, -0.5F, -0.25F, -1.0F, 3, 1, 1, 0.01F, false));

        this.hindlegL2 = new AdvancedModelRenderer(this);
        this.hindlegL2.setRotationPoint(2.25F, 0.25F, 0.0F);
        this.hindlegL.addChild(hindlegL2);
        this.setRotateAngle(hindlegL2, 0.6109F, -0.3054F, 0.0F);
        this.hindlegL2.cubeList.add(new ModelBox(hindlegL2, 14, 0, 0.0F, -0.5F, -1.0F, 2, 1, 1, 0.0F, false));

        this.cube_r55 = new AdvancedModelRenderer(this);
        this.cube_r55.setRotationPoint(1.4F, 0.75F, 1.0F);
        this.hindlegL2.addChild(cube_r55);
        this.setRotateAngle(cube_r55, 0.0F, -0.3927F, 0.0F);
        this.cube_r55.cubeList.add(new ModelBox(cube_r55, 0, 13, -1.7F, -1.25F, -0.7F, 2, 1, 1, 0.0F, false));

        this.hindlegL3 = new AdvancedModelRenderer(this);
        this.hindlegL3.setRotationPoint(1.9F, 0.0F, 0.0F);
        this.hindlegL2.addChild(hindlegL3);
        this.setRotateAngle(hindlegL3, -0.1396F, -0.2595F, -0.1355F);
        this.hindlegL3.cubeList.add(new ModelBox(hindlegL3, 33, 34, 0.0F, -0.5F, -1.5F, 3, 1, 3, -0.01F, false));

        this.hindlegL4 = new AdvancedModelRenderer(this);
        this.hindlegL4.setRotationPoint(-1.7F, 1.0F, 2.5F);
        this.body4.addChild(hindlegL4);
        this.setRotateAngle(hindlegL4, -0.116F, 0.7736F, -0.3269F);
        this.hindlegL4.cubeList.add(new ModelBox(hindlegL4, 25, 9, -2.5F, -0.25F, -1.0F, 3, 1, 1, 0.01F, true));

        this.hindlegL5 = new AdvancedModelRenderer(this);
        this.hindlegL5.setRotationPoint(-2.25F, 0.25F, 0.0F);
        this.hindlegL4.addChild(hindlegL5);
        this.setRotateAngle(hindlegL5, 1.2654F, 0.4363F, 0.0F);
        this.hindlegL5.cubeList.add(new ModelBox(hindlegL5, 14, 0, -2.0F, -0.5F, -1.0F, 2, 1, 1, 0.0F, true));

        this.cube_r56 = new AdvancedModelRenderer(this);
        this.cube_r56.setRotationPoint(-1.4F, 0.75F, 1.0F);
        this.hindlegL5.addChild(cube_r56);
        this.setRotateAngle(cube_r56, 0.0F, 0.3927F, 0.0F);
        this.cube_r56.cubeList.add(new ModelBox(cube_r56, 0, 13, -0.3F, -1.25F, -0.7F, 2, 1, 1, 0.0F, true));

        this.hindlegL6 = new AdvancedModelRenderer(this);
        this.hindlegL6.setRotationPoint(-1.9F, 0.0F, 0.0F);
        this.hindlegL5.addChild(hindlegL6);
        this.setRotateAngle(hindlegL6, -0.1396F, 0.2595F, 0.1355F);
        this.hindlegL6.cubeList.add(new ModelBox(hindlegL6, 33, 34, -3.0F, -0.5F, -1.5F, 3, 1, 3, -0.01F, true));

        updateDefaultPose();
    }

    public void renderAll(float f) {
        this.resetToDefaultPose();
        this.body.render(0.01f);
    }

    public void setRotateAngle(ModelRenderer modelRenderer, float x, float y, float z) {
        modelRenderer.rotateAngleX = x;
        modelRenderer.rotateAngleY = y;
        modelRenderer.rotateAngleZ = z;
    }

}
