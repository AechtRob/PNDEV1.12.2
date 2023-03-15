package net.lepidodendron.entity.model.tile;

import net.ilexiconn.llibrary.client.model.tools.AdvancedModelBase;
import net.ilexiconn.llibrary.client.model.tools.AdvancedModelRenderer;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;

public class ModelSkeletonPlatyhystrix extends AdvancedModelBase {
    private final AdvancedModelRenderer root;
    private final AdvancedModelRenderer body;
    private final AdvancedModelRenderer sail_r1;
    private final AdvancedModelRenderer sail_r2;
    private final AdvancedModelRenderer sail_r3;
    private final AdvancedModelRenderer sail_r4;
    private final AdvancedModelRenderer sail_r5;
    private final AdvancedModelRenderer sail_r6;
    private final AdvancedModelRenderer neck_r1;
    private final AdvancedModelRenderer neck_r2;
    private final AdvancedModelRenderer neck_r3;
    private final AdvancedModelRenderer neck_r4;
    private final AdvancedModelRenderer neck_r5;
    private final AdvancedModelRenderer neck_r6;
    private final AdvancedModelRenderer neck_r7;
    private final AdvancedModelRenderer neck_r8;
    private final AdvancedModelRenderer neck_r9;
    private final AdvancedModelRenderer neck_r10;
    private final AdvancedModelRenderer neck_r11;
    private final AdvancedModelRenderer neck_r12;
    private final AdvancedModelRenderer neck_r13;
    private final AdvancedModelRenderer neck_r14;
    private final AdvancedModelRenderer neck_r15;
    private final AdvancedModelRenderer neck_r16;
    private final AdvancedModelRenderer neck_r17;
    private final AdvancedModelRenderer neck_r18;
    private final AdvancedModelRenderer neck_r19;
    private final AdvancedModelRenderer neck_r20;
    private final AdvancedModelRenderer sail_r7;
    private final AdvancedModelRenderer basin;
    private final AdvancedModelRenderer basin_r1;
    private final AdvancedModelRenderer basin_r2;
    private final AdvancedModelRenderer basin_r3;
    private final AdvancedModelRenderer sail_r8;
    private final AdvancedModelRenderer sail_r9;
    private final AdvancedModelRenderer tail1;
    private final AdvancedModelRenderer tail2;
    private final AdvancedModelRenderer upperleg1;
    private final AdvancedModelRenderer upperleg1_r1;
    private final AdvancedModelRenderer leg1;
    private final AdvancedModelRenderer feet1;
    private final AdvancedModelRenderer upperleg2;
    private final AdvancedModelRenderer upperleg2_r1;
    private final AdvancedModelRenderer leg2;
    private final AdvancedModelRenderer feet2;
    private final AdvancedModelRenderer neck;
    private final AdvancedModelRenderer neck_r21;
    private final AdvancedModelRenderer neck_r22;
    private final AdvancedModelRenderer neck_r23;
    private final AdvancedModelRenderer neck_r24;
    private final AdvancedModelRenderer neck_r25;
    private final AdvancedModelRenderer neck_r26;
    private final AdvancedModelRenderer neck_r27;
    private final AdvancedModelRenderer neck_r28;
    private final AdvancedModelRenderer neck_r29;
    private final AdvancedModelRenderer neck_r30;
    private final AdvancedModelRenderer neck_r31;
    private final AdvancedModelRenderer neck_r32;
    private final AdvancedModelRenderer neck_r33;
    private final AdvancedModelRenderer sail_r10;
    private final AdvancedModelRenderer sail_r11;
    private final AdvancedModelRenderer sail_r12;
    private final AdvancedModelRenderer sail_r13;
    private final AdvancedModelRenderer head;
    private final AdvancedModelRenderer snout1;
    private final AdvancedModelRenderer teeth2;
    private final AdvancedModelRenderer snout2;
    private final AdvancedModelRenderer teeth1;
    private final AdvancedModelRenderer eye2;
    private final AdvancedModelRenderer eye1;
    private final AdvancedModelRenderer jaw1;
    private final AdvancedModelRenderer jaw2;
    private final AdvancedModelRenderer lowerjaw;
    private final AdvancedModelRenderer gums2;
    private final AdvancedModelRenderer upperarm1;
    private final AdvancedModelRenderer arm1;
    private final AdvancedModelRenderer hand1;
    private final AdvancedModelRenderer upperarm2;
    private final AdvancedModelRenderer arm2;
    private final AdvancedModelRenderer hand2;
    private final AdvancedModelRenderer sail;

    public ModelSkeletonPlatyhystrix() {
        this.textureWidth = 65;
        this.textureHeight = 65;

        this.root = new AdvancedModelRenderer(this);
        this.root.setRotationPoint(0.0F, 14.0F, 0.0F);


        this.body = new AdvancedModelRenderer(this);
        this.body.setRotationPoint(-0.3F, -0.9F, 0.1F);
        this.root.addChild(body);
        this.setRotateAngle(body, 0.0911F, 0.0F, 0.0F);
        this.body.cubeList.add(new ModelBox(body, 0, 11, -0.7F, -0.9104F, -5.1275F, 2, 2, 9, 0.001F, false));

        this.sail_r1 = new AdvancedModelRenderer(this);
        this.sail_r1.setRotationPoint(0.3F, -9.7104F, -5.9275F);
        this.body.addChild(sail_r1);
        this.setRotateAngle(sail_r1, 0.5934F, 0.0F, 0.0F);
        this.sail_r1.cubeList.add(new ModelBox(sail_r1, 54, 28, 0.1F, -5.1338F, -1.8975F, 0, 5, 2, 0.0F, false));

        this.sail_r2 = new AdvancedModelRenderer(this);
        this.sail_r2.setRotationPoint(0.3F, -0.7104F, -3.7275F);
        this.body.addChild(sail_r2);
        this.setRotateAngle(sail_r2, 0.2443F, 0.0F, 0.0F);
        this.sail_r2.cubeList.add(new ModelBox(sail_r2, 20, 52, 0.1F, -9.4443F, -0.9021F, 0, 10, 1, 0.0F, false));

        this.sail_r3 = new AdvancedModelRenderer(this);
        this.sail_r3.setRotationPoint(0.3F, -0.4104F, -1.7275F);
        this.body.addChild(sail_r3);
        this.setRotateAngle(sail_r3, 0.0698F, 0.0F, 0.0F);
        this.sail_r3.cubeList.add(new ModelBox(sail_r3, 14, 52, 0.1F, -10.7435F, -0.8812F, 0, 11, 1, 0.0F, false));

        this.sail_r4 = new AdvancedModelRenderer(this);
        this.sail_r4.setRotationPoint(0.3F, -11.1104F, -2.3275F);
        this.body.addChild(sail_r4);
        this.setRotateAngle(sail_r4, 0.288F, 0.0F, 0.0F);
        this.sail_r4.cubeList.add(new ModelBox(sail_r4, 23, 52, 0.1F, -6.0278F, -2.029F, 0, 6, 2, 0.0F, false));

        this.sail_r5 = new AdvancedModelRenderer(this);
        this.sail_r5.setRotationPoint(0.3F, -0.4104F, 0.5725F);
        this.body.addChild(sail_r5);
        this.setRotateAngle(sail_r5, -0.0611F, 0.0F, 0.0F);
        this.sail_r5.cubeList.add(new ModelBox(sail_r5, 28, 53, 0.1F, -16.6031F, -1.6769F, 0, 6, 2, 0.0F, false));
        this.sail_r5.cubeList.add(new ModelBox(sail_r5, 17, 52, 0.1F, -10.6031F, -1.1769F, 0, 11, 1, 0.0F, false));

        this.sail_r6 = new AdvancedModelRenderer(this);
        this.sail_r6.setRotationPoint(0.3F, -11.7104F, 3.2725F);
        this.body.addChild(sail_r6);
        this.setRotateAngle(sail_r6, -0.384F, 0.0F, 0.0F);
        this.sail_r6.cubeList.add(new ModelBox(sail_r6, 53, 54, 0.1F, -5.0755F, -0.2141F, 0, 5, 2, 0.0F, false));

        this.neck_r1 = new AdvancedModelRenderer(this);
        this.neck_r1.setRotationPoint(1.1F, 0.4896F, -4.7275F);
        this.body.addChild(neck_r1);
        this.setRotateAngle(neck_r1, 0.1057F, -0.2495F, 1.1648F);
        this.neck_r1.cubeList.add(new ModelBox(neck_r1, 23, 4, 0.67F, -0.89F, -0.6078F, 1, 0, 1, 0.0F, true));

        this.neck_r2 = new AdvancedModelRenderer(this);
        this.neck_r2.setRotationPoint(1.1F, 0.4896F, -4.7275F);
        this.body.addChild(neck_r2);
        this.setRotateAngle(neck_r2, 0.2412F, -0.1237F, 0.465F);
        this.neck_r2.cubeList.add(new ModelBox(neck_r2, 0, 25, 0.0858F, -0.2398F, -0.6078F, 1, 0, 1, 0.0F, true));

        this.neck_r3 = new AdvancedModelRenderer(this);
        this.neck_r3.setRotationPoint(1.1F, 0.3896F, -2.7275F);
        this.body.addChild(neck_r3);
        this.setRotateAngle(neck_r3, 0.0077F, -0.004F, 0.4799F);
        this.neck_r3.cubeList.add(new ModelBox(neck_r3, 0, 23, 0.0858F, -0.2398F, -0.6078F, 1, 0, 1, 0.0F, true));

        this.neck_r4 = new AdvancedModelRenderer(this);
        this.neck_r4.setRotationPoint(1.1F, 0.3896F, -2.7275F);
        this.body.addChild(neck_r4);
        this.setRotateAngle(neck_r4, 0.0033F, -0.0081F, 1.1781F);
        this.neck_r4.cubeList.add(new ModelBox(neck_r4, 31, 13, 0.67F, -0.89F, -0.6078F, 2, 0, 1, 0.0F, true));

        this.neck_r5 = new AdvancedModelRenderer(this);
        this.neck_r5.setRotationPoint(1.1F, 0.3896F, -0.7275F);
        this.body.addChild(neck_r5);
        this.setRotateAngle(neck_r5, -0.0167F, 0.0403F, 1.1778F);
        this.neck_r5.cubeList.add(new ModelBox(neck_r5, 14, 11, 1.3979F, -1.5141F, -0.6078F, 3, 0, 1, 0.0F, true));

        this.neck_r6 = new AdvancedModelRenderer(this);
        this.neck_r6.setRotationPoint(1.1F, 0.3896F, -0.7275F);
        this.body.addChild(neck_r6);
        this.setRotateAngle(neck_r6, -0.0387F, 0.0201F, 0.4796F);
        this.neck_r6.cubeList.add(new ModelBox(neck_r6, 33, 15, 0.0858F, -0.2398F, -0.6078F, 2, 0, 1, 0.0F, true));

        this.neck_r7 = new AdvancedModelRenderer(this);
        this.neck_r7.setRotationPoint(1.1F, 0.3896F, 1.2725F);
        this.body.addChild(neck_r7);
        this.setRotateAngle(neck_r7, -0.0846F, 0.2013F, 1.1695F);
        this.neck_r7.cubeList.add(new ModelBox(neck_r7, 12, 31, 1.3979F, -1.5141F, -0.6078F, 4, 0, 1, 0.0F, true));

        this.neck_r8 = new AdvancedModelRenderer(this);
        this.neck_r8.setRotationPoint(1.1F, 0.3896F, 1.2725F);
        this.body.addChild(neck_r8);
        this.setRotateAngle(neck_r8, -0.1942F, 0.1001F, 0.4702F);
        this.neck_r8.cubeList.add(new ModelBox(neck_r8, 12, 35, 0.0858F, -0.2398F, -0.6078F, 2, 0, 1, 0.0F, true));

        this.neck_r9 = new AdvancedModelRenderer(this);
        this.neck_r9.setRotationPoint(1.1F, 0.6896F, 3.2725F);
        this.body.addChild(neck_r9);
        this.setRotateAngle(neck_r9, -0.1766F, 0.4011F, 1.1421F);
        this.neck_r9.cubeList.add(new ModelBox(neck_r9, 14, 17, 1.3979F, -1.5141F, -0.6078F, 3, 0, 1, 0.0F, true));

        this.neck_r10 = new AdvancedModelRenderer(this);
        this.neck_r10.setRotationPoint(1.1F, 0.6896F, 3.2725F);
        this.body.addChild(neck_r10);
        this.setRotateAngle(neck_r10, -0.3922F, 0.1964F, 0.4408F);
        this.neck_r10.cubeList.add(new ModelBox(neck_r10, 37, 37, 0.0858F, -0.2398F, -0.6078F, 2, 0, 1, 0.0F, true));

        this.neck_r11 = new AdvancedModelRenderer(this);
        this.neck_r11.setRotationPoint(-0.5F, 0.3896F, -2.7275F);
        this.body.addChild(neck_r11);
        this.setRotateAngle(neck_r11, 0.0077F, 0.004F, -0.4799F);
        this.neck_r11.cubeList.add(new ModelBox(neck_r11, 0, 23, -1.0858F, -0.2398F, -0.6078F, 1, 0, 1, 0.0F, false));

        this.neck_r12 = new AdvancedModelRenderer(this);
        this.neck_r12.setRotationPoint(-0.5F, 0.3896F, -2.7275F);
        this.body.addChild(neck_r12);
        this.setRotateAngle(neck_r12, 0.0033F, 0.0081F, -1.1781F);
        this.neck_r12.cubeList.add(new ModelBox(neck_r12, 31, 13, -2.67F, -0.89F, -0.6078F, 2, 0, 1, 0.0F, false));

        this.neck_r13 = new AdvancedModelRenderer(this);
        this.neck_r13.setRotationPoint(-0.5F, 0.4896F, -4.7275F);
        this.body.addChild(neck_r13);
        this.setRotateAngle(neck_r13, 0.2412F, 0.1237F, -0.465F);
        this.neck_r13.cubeList.add(new ModelBox(neck_r13, 0, 25, -1.0858F, -0.2398F, -0.6078F, 1, 0, 1, 0.0F, false));

        this.neck_r14 = new AdvancedModelRenderer(this);
        this.neck_r14.setRotationPoint(-0.5F, 0.4896F, -4.7275F);
        this.body.addChild(neck_r14);
        this.setRotateAngle(neck_r14, 0.1057F, 0.2495F, -1.1648F);
        this.neck_r14.cubeList.add(new ModelBox(neck_r14, 23, 4, -1.67F, -0.89F, -0.6078F, 1, 0, 1, 0.0F, false));

        this.neck_r15 = new AdvancedModelRenderer(this);
        this.neck_r15.setRotationPoint(-0.5F, 0.3896F, -0.7275F);
        this.body.addChild(neck_r15);
        this.setRotateAngle(neck_r15, -0.0387F, -0.0201F, -0.4796F);
        this.neck_r15.cubeList.add(new ModelBox(neck_r15, 33, 15, -2.0858F, -0.2398F, -0.6078F, 2, 0, 1, 0.0F, false));

        this.neck_r16 = new AdvancedModelRenderer(this);
        this.neck_r16.setRotationPoint(-0.5F, 0.3896F, -0.7275F);
        this.body.addChild(neck_r16);
        this.setRotateAngle(neck_r16, -0.0167F, -0.0403F, -1.1778F);
        this.neck_r16.cubeList.add(new ModelBox(neck_r16, 14, 11, -4.3979F, -1.5141F, -0.6078F, 3, 0, 1, 0.0F, false));

        this.neck_r17 = new AdvancedModelRenderer(this);
        this.neck_r17.setRotationPoint(-0.5F, 0.3896F, 1.2725F);
        this.body.addChild(neck_r17);
        this.setRotateAngle(neck_r17, -0.1942F, -0.1001F, -0.4702F);
        this.neck_r17.cubeList.add(new ModelBox(neck_r17, 12, 35, -2.0858F, -0.2398F, -0.6078F, 2, 0, 1, 0.0F, false));

        this.neck_r18 = new AdvancedModelRenderer(this);
        this.neck_r18.setRotationPoint(-0.5F, 0.3896F, 1.2725F);
        this.body.addChild(neck_r18);
        this.setRotateAngle(neck_r18, -0.0846F, -0.2013F, -1.1695F);
        this.neck_r18.cubeList.add(new ModelBox(neck_r18, 12, 31, -5.3979F, -1.5141F, -0.6078F, 4, 0, 1, 0.0F, false));

        this.neck_r19 = new AdvancedModelRenderer(this);
        this.neck_r19.setRotationPoint(-0.5F, 0.6896F, 3.2725F);
        this.body.addChild(neck_r19);
        this.setRotateAngle(neck_r19, -0.1766F, -0.4011F, -1.1421F);
        this.neck_r19.cubeList.add(new ModelBox(neck_r19, 14, 17, -4.3979F, -1.5141F, -0.6078F, 3, 0, 1, 0.0F, false));

        this.neck_r20 = new AdvancedModelRenderer(this);
        this.neck_r20.setRotationPoint(-0.5F, 0.6896F, 3.2725F);
        this.body.addChild(neck_r20);
        this.setRotateAngle(neck_r20, -0.3922F, -0.1964F, -0.4408F);
        this.neck_r20.cubeList.add(new ModelBox(neck_r20, 37, 37, -2.0858F, -0.2398F, -0.6078F, 2, 0, 1, 0.0F, false));

        this.sail_r7 = new AdvancedModelRenderer(this);
        this.sail_r7.setRotationPoint(0.3F, -0.4104F, 2.5725F);
        this.body.addChild(sail_r7);
        this.setRotateAngle(sail_r7, -0.1484F, 0.0F, 0.0F);
        this.sail_r7.cubeList.add(new ModelBox(sail_r7, 11, 52, 0.1F, -11.6031F, -1.1769F, 0, 12, 1, 0.0F, false));

        this.basin = new AdvancedModelRenderer(this);
        this.basin.setRotationPoint(-0.5F, -0.0104F, -5.3275F);
        this.body.addChild(basin);
        this.setRotateAngle(basin, 0.0467F, 0.2179F, 0.0101F);


        this.basin_r1 = new AdvancedModelRenderer(this);
        this.basin_r1.setRotationPoint(2.7F, 1.5658F, -1.9995F);
        this.basin.addChild(basin_r1);
        this.setRotateAngle(basin_r1, 0.1085F, -0.0563F, 0.4769F);
        this.basin_r1.cubeList.add(new ModelBox(basin_r1, 42, 0, -0.7261F, -0.0527F, -3.1893F, 1, 3, 5, 0.0F, true));

        this.basin_r2 = new AdvancedModelRenderer(this);
        this.basin_r2.setRotationPoint(0.8F, -0.3342F, 0.8005F);
        this.basin.addChild(basin_r2);
        this.setRotateAngle(basin_r2, 0.1222F, 0.0F, 0.0F);
        this.basin_r2.cubeList.add(new ModelBox(basin_r2, 0, 49, 1.2F, -0.5F, -5.2F, 1, 2, 4, 0.0F, true));
        this.basin_r2.cubeList.add(new ModelBox(basin_r2, 0, 49, -2.2F, -0.5F, -5.2F, 1, 2, 4, 0.0F, false));
        this.basin_r2.cubeList.add(new ModelBox(basin_r2, 38, 40, -1.0F, -0.5F, -5.2F, 2, 2, 5, 0.0F, false));

        this.basin_r3 = new AdvancedModelRenderer(this);
        this.basin_r3.setRotationPoint(-1.1F, 1.5658F, -1.9995F);
        this.basin.addChild(basin_r3);
        this.setRotateAngle(basin_r3, 0.1085F, 0.0563F, -0.4769F);
        this.basin_r3.cubeList.add(new ModelBox(basin_r3, 42, 0, -0.2739F, -0.0527F, -3.1893F, 1, 3, 5, 0.0F, false));

        this.sail_r8 = new AdvancedModelRenderer(this);
        this.sail_r8.setRotationPoint(0.8F, -0.7342F, -0.4995F);
        this.basin.addChild(sail_r8);
        this.setRotateAngle(sail_r8, 0.637F, 0.0F, 0.0F);
        this.sail_r8.cubeList.add(new ModelBox(sail_r8, 33, 55, 0.1F, -9.1699F, -0.7505F, 0, 4, 2, 0.0F, false));

        this.sail_r9 = new AdvancedModelRenderer(this);
        this.sail_r9.setRotationPoint(0.8F, -0.7342F, -0.4995F);
        this.basin.addChild(sail_r9);
        this.setRotateAngle(sail_r9, 0.4189F, 0.0F, 0.0F);
        this.sail_r9.cubeList.add(new ModelBox(sail_r9, 0, 56, 0.1F, -5.4443F, -0.9021F, 0, 6, 1, 0.0F, false));

        this.tail1 = new AdvancedModelRenderer(this);
        this.tail1.setRotationPoint(0.9F, 0.9658F, -4.2995F);
        this.basin.addChild(tail1);
        this.setRotateAngle(tail1, 0.054F, 0.5666F, 0.029F);
        this.tail1.cubeList.add(new ModelBox(tail1, 45, 9, -0.6F, -1.1465F, -4.8513F, 1, 2, 5, 0.001F, false));

        this.tail2 = new AdvancedModelRenderer(this);
        this.tail2.setRotationPoint(0.0F, -0.1465F, -4.6513F);
        this.tail1.addChild(tail2);
        this.setRotateAngle(tail2, -0.0969F, 0.3476F, -0.0331F);
        this.tail2.cubeList.add(new ModelBox(tail2, 31, 48, -0.6F, -0.5773F, -4.5032F, 1, 1, 5, 0.0F, false));

        this.upperleg1 = new AdvancedModelRenderer(this);
        this.upperleg1.setRotationPoint(-0.5F, 3.1658F, -1.0995F);
        this.basin.addChild(upperleg1);
        this.setRotateAngle(upperleg1, 0.4098F, 0.0F, 0.3643F);


        this.upperleg1_r1 = new AdvancedModelRenderer(this);
        this.upperleg1_r1.setRotationPoint(-2.925F, 1.6996F, -1.746F);
        this.upperleg1.addChild(upperleg1_r1);
        this.setRotateAngle(upperleg1_r1, 0.0F, 0.0F, 0.9163F);
        this.upperleg1_r1.cubeList.add(new ModelBox(upperleg1_r1, 0, 31, 0.0439F, -3.4218F, 0.8F, 1, 4, 2, 0.0F, false));

        this.leg1 = new AdvancedModelRenderer(this);
        this.leg1.setRotationPoint(-2.525F, 2.4996F, 0.754F);
        this.upperleg1.addChild(leg1);
        this.setRotateAngle(leg1, 0.5918F, 0.0F, 0.0F);
        this.leg1.cubeList.add(new ModelBox(leg1, 0, 41, -0.6F, -1.7797F, -6.9135F, 1, 1, 6, 0.0F, false));
        this.leg1.cubeList.add(new ModelBox(leg1, 33, 28, -0.6F, -0.2797F, -6.9135F, 1, 1, 7, 0.0F, false));

        this.feet1 = new AdvancedModelRenderer(this);
        this.feet1.setRotationPoint(0.4F, -1.7797F, -6.0135F);
        this.leg1.addChild(feet1);
        this.setRotateAngle(feet1, 0.4098F, -0.3187F, 0.0F);
        this.feet1.cubeList.add(new ModelBox(feet1, 44, 48, -1.5F, 0.0F, -2.1F, 3, 5, 2, 0.0F, false));

        this.upperleg2 = new AdvancedModelRenderer(this);
        this.upperleg2.setRotationPoint(2.1F, 3.1658F, -1.0995F);
        this.basin.addChild(upperleg2);
        this.setRotateAngle(upperleg2, -0.0765F, 0.2006F, -0.8513F);


        this.upperleg2_r1 = new AdvancedModelRenderer(this);
        this.upperleg2_r1.setRotationPoint(2.925F, 1.6996F, -1.746F);
        this.upperleg2.addChild(upperleg2_r1);
        this.setRotateAngle(upperleg2_r1, 0.0F, 0.0F, -0.9163F);
        this.upperleg2_r1.cubeList.add(new ModelBox(upperleg2_r1, 0, 31, -1.0439F, -3.4218F, 0.8F, 1, 4, 2, 0.0F, true));

        this.leg2 = new AdvancedModelRenderer(this);
        this.leg2.setRotationPoint(2.525F, 2.4996F, 0.754F);
        this.upperleg2.addChild(leg2);
        this.setRotateAngle(leg2, 0.614F, 0.2522F, 0.1741F);
        this.leg2.cubeList.add(new ModelBox(leg2, 0, 41, -0.4F, -1.7797F, -6.9135F, 1, 1, 6, 0.0F, true));
        this.leg2.cubeList.add(new ModelBox(leg2, 33, 28, -0.4F, -0.2797F, -6.9135F, 1, 1, 7, 0.0F, true));

        this.feet2 = new AdvancedModelRenderer(this);
        this.feet2.setRotationPoint(-0.4F, -1.7797F, -6.0135F);
        this.leg2.addChild(feet2);
        this.setRotateAngle(feet2, 0.4098F, 0.3187F, 0.0F);
        this.feet2.cubeList.add(new ModelBox(feet2, 44, 48, -1.5F, 0.0F, -2.1F, 3, 5, 2, 0.0F, true));

        this.neck = new AdvancedModelRenderer(this);
        this.neck.setRotationPoint(0.3F, -0.1104F, 3.2725F);
        this.body.addChild(neck);
        this.setRotateAngle(neck, 0.0F, 0.0F, 0.0089F);


        this.neck_r21 = new AdvancedModelRenderer(this);
        this.neck_r21.setRotationPoint(0.7858F, 0.9999F, 2.0F);
        this.neck.addChild(neck_r21);
        this.setRotateAngle(neck_r21, -0.2391F, 0.5194F, 1.1143F);
        this.neck_r21.cubeList.add(new ModelBox(neck_r21, 40, 0, 1.3979F, -1.5141F, -0.6078F, 2, 0, 1, 0.0F, true));

        this.neck_r22 = new AdvancedModelRenderer(this);
        this.neck_r22.setRotationPoint(0.7858F, 0.9999F, 2.0F);
        this.neck.addChild(neck_r22);
        this.setRotateAngle(neck_r22, -0.5144F, 0.2507F, 0.4137F);
        this.neck_r22.cubeList.add(new ModelBox(neck_r22, 42, 9, 0.0858F, -0.2398F, -0.6078F, 2, 0, 1, 0.0F, true));

        this.neck_r23 = new AdvancedModelRenderer(this);
        this.neck_r23.setRotationPoint(0.7858F, 1.4999F, 4.0F);
        this.neck.addChild(neck_r23);
        this.setRotateAngle(neck_r23, -0.2391F, 0.5194F, 1.1143F);
        this.neck_r23.cubeList.add(new ModelBox(neck_r23, 0, 27, 0.5979F, -0.8141F, -0.6078F, 1, 0, 1, 0.0F, true));

        this.neck_r24 = new AdvancedModelRenderer(this);
        this.neck_r24.setRotationPoint(0.7858F, 1.4999F, 4.0F);
        this.neck.addChild(neck_r24);
        this.setRotateAngle(neck_r24, -0.5144F, 0.2507F, 0.4137F);
        this.neck_r24.cubeList.add(new ModelBox(neck_r24, 17, 27, 0.0858F, -0.2398F, -0.6078F, 1, 0, 1, 0.0F, true));

        this.neck_r25 = new AdvancedModelRenderer(this);
        this.neck_r25.setRotationPoint(-0.7858F, 0.9999F, 2.0F);
        this.neck.addChild(neck_r25);
        this.setRotateAngle(neck_r25, -0.5144F, -0.2507F, -0.4137F);
        this.neck_r25.cubeList.add(new ModelBox(neck_r25, 42, 9, -2.0858F, -0.2398F, -0.6078F, 2, 0, 1, 0.0F, false));

        this.neck_r26 = new AdvancedModelRenderer(this);
        this.neck_r26.setRotationPoint(-0.7858F, 0.9999F, 2.0F);
        this.neck.addChild(neck_r26);
        this.setRotateAngle(neck_r26, -0.2391F, -0.5194F, -1.1143F);
        this.neck_r26.cubeList.add(new ModelBox(neck_r26, 40, 0, -3.3979F, -1.5141F, -0.6078F, 2, 0, 1, 0.0F, false));

        this.neck_r27 = new AdvancedModelRenderer(this);
        this.neck_r27.setRotationPoint(-0.7858F, 1.4999F, 4.0F);
        this.neck.addChild(neck_r27);
        this.setRotateAngle(neck_r27, -0.2391F, -0.5194F, -1.1143F);
        this.neck_r27.cubeList.add(new ModelBox(neck_r27, 0, 27, -1.5979F, -0.8141F, -0.6078F, 1, 0, 1, 0.0F, false));

        this.neck_r28 = new AdvancedModelRenderer(this);
        this.neck_r28.setRotationPoint(-0.7858F, 1.4999F, 4.0F);
        this.neck.addChild(neck_r28);
        this.setRotateAngle(neck_r28, -0.5144F, -0.2507F, -0.4137F);
        this.neck_r28.cubeList.add(new ModelBox(neck_r28, 17, 27, -1.0858F, -0.2398F, -0.6078F, 1, 0, 1, 0.0F, false));

        this.neck_r29 = new AdvancedModelRenderer(this);
        this.neck_r29.setRotationPoint(3.7858F, 5.6999F, 1.2F);
        this.neck.addChild(neck_r29);
        this.setRotateAngle(neck_r29, -1.8857F, -0.305F, 1.5484F);
        this.neck_r29.cubeList.add(new ModelBox(neck_r29, 43, 22, -0.0933F, -2.3652F, -0.7909F, 1, 2, 5, 0.0F, true));

        this.neck_r30 = new AdvancedModelRenderer(this);
        this.neck_r30.setRotationPoint(2.9858F, -0.3001F, -0.1F);
        this.neck.addChild(neck_r30);
        this.setRotateAngle(neck_r30, -1.1786F, -0.1926F, -0.415F);
        this.neck_r30.cubeList.add(new ModelBox(neck_r30, 13, 35, -1.5F, -1.6205F, 0.2921F, 1, 3, 6, 0.0F, true));

        this.neck_r31 = new AdvancedModelRenderer(this);
        this.neck_r31.setRotationPoint(-3.7858F, 5.6999F, 1.2F);
        this.neck.addChild(neck_r31);
        this.setRotateAngle(neck_r31, -1.8857F, 0.305F, -1.5484F);
        this.neck_r31.cubeList.add(new ModelBox(neck_r31, 43, 22, -0.9067F, -2.3652F, -0.7909F, 1, 2, 5, 0.0F, false));

        this.neck_r32 = new AdvancedModelRenderer(this);
        this.neck_r32.setRotationPoint(-2.9858F, -0.3001F, -0.1F);
        this.neck.addChild(neck_r32);
        this.setRotateAngle(neck_r32, -1.1786F, 0.1926F, 0.415F);
        this.neck_r32.cubeList.add(new ModelBox(neck_r32, 13, 35, 0.5F, -1.6205F, 0.2921F, 1, 3, 6, 0.0F, false));

        this.neck_r33 = new AdvancedModelRenderer(this);
        this.neck_r33.setRotationPoint(0.0142F, -0.3001F, 1.0F);
        this.neck.addChild(neck_r33);
        this.setRotateAngle(neck_r33, -0.1309F, 0.0F, 0.0F);
        this.neck_r33.cubeList.add(new ModelBox(neck_r33, 0, 31, -1.0F, -0.3769F, -1.3985F, 2, 2, 7, 0.0F, false));

        this.sail_r10 = new AdvancedModelRenderer(this);
        this.sail_r10.setRotationPoint(0.0142F, -0.3001F, 1.0F);
        this.neck.addChild(sail_r10);
        this.setRotateAngle(sail_r10, -0.6021F, 0.0F, 0.0F);
        this.sail_r10.cubeList.add(new ModelBox(sail_r10, 38, 55, 0.1F, -11.6483F, -3.2631F, 0, 4, 2, 0.0F, false));

        this.sail_r11 = new AdvancedModelRenderer(this);
        this.sail_r11.setRotationPoint(0.0142F, -0.3001F, 1.0F);
        this.neck.addChild(sail_r11);
        this.setRotateAngle(sail_r11, -0.3229F, 0.0F, 0.0F);
        this.sail_r11.cubeList.add(new ModelBox(sail_r11, 55, 0, 0.1F, -8.6031F, -0.9769F, 0, 9, 1, 0.0F, false));

        this.sail_r12 = new AdvancedModelRenderer(this);
        this.sail_r12.setRotationPoint(0.0142F, -4.0001F, 3.7F);
        this.neck.addChild(sail_r12);
        this.setRotateAngle(sail_r12, -0.672F, 0.0F, 0.0F);
        this.sail_r12.cubeList.add(new ModelBox(sail_r12, 55, 45, 0.1F, -3.9169F, -0.2077F, 0, 4, 2, 0.0F, false));

        this.sail_r13 = new AdvancedModelRenderer(this);
        this.sail_r13.setRotationPoint(0.0142F, -0.3001F, 2.3F);
        this.neck.addChild(sail_r13);
        this.setRotateAngle(sail_r13, -0.3927F, 0.0F, 0.0F);
        this.sail_r13.cubeList.add(new ModelBox(sail_r13, 0, 0, 0.1F, -3.871F, -0.3302F, 0, 4, 1, 0.0F, false));

        this.head = new AdvancedModelRenderer(this);
        this.head.setRotationPoint(0.0142F, 0.6999F, 5.3F);
        this.neck.addChild(head);
        this.setRotateAngle(head, 0.3714F, 0.2103F, -0.0568F);
        this.head.cubeList.add(new ModelBox(head, 0, 0, -4.0F, -1.681F, -0.1168F, 8, 4, 6, 0.0F, false));

        this.snout1 = new AdvancedModelRenderer(this);
        this.snout1.setRotationPoint(3.0F, -0.681F, 5.6832F);
        this.head.addChild(snout1);
        this.snout1.cubeList.add(new ModelBox(snout1, 17, 17, -6.0F, 0.0F, 0.0F, 6, 3, 6, 0.0F, false));

        this.teeth2 = new AdvancedModelRenderer(this);
        this.teeth2.setRotationPoint(-0.5F, 2.9F, -0.29F);
        this.snout1.addChild(teeth2);
        this.teeth2.cubeList.add(new ModelBox(teeth2, 17, 27, -5.0F, 0.0F, 0.0F, 5, 1, 6, 0.0F, false));

        this.snout2 = new AdvancedModelRenderer(this);
        this.snout2.setRotationPoint(-2.5F, -0.9F, -0.1F);
        this.snout1.addChild(snout2);
        this.setRotateAngle(snout2, -0.1452F, 0.0F, 0.0F);
        this.snout2.cubeList.add(new ModelBox(snout2, 23, 5, -3.5F, 0.0F, 0.0F, 6, 1, 6, -0.001F, false));

        this.teeth1 = new AdvancedModelRenderer(this);
        this.teeth1.setRotationPoint(3.5F, 2.219F, 3.7832F);
        this.head.addChild(teeth1);
        this.teeth1.cubeList.add(new ModelBox(teeth1, 23, 0, -7.0F, 0.0F, 0.0F, 7, 1, 2, 0.0F, false));

        this.eye2 = new AdvancedModelRenderer(this);
        this.eye2.setRotationPoint(4.5F, -0.981F, 5.1832F);
        this.head.addChild(eye2);


        this.eye1 = new AdvancedModelRenderer(this);
        this.eye1.setRotationPoint(-1.5F, -0.981F, 5.1832F);
        this.head.addChild(eye1);
        this.eye1.cubeList.add(new ModelBox(eye1, 22, 35, -2.6F, 0.0F, -2.0F, 3, 2, 2, 0.0F, false));
        this.eye1.cubeList.add(new ModelBox(eye1, 22, 35, 2.5715F, 0.0F, -2.0F, 3, 2, 2, 0.0F, true));

        this.jaw1 = new AdvancedModelRenderer(this);
        this.jaw1.setRotationPoint(0.0F, 2.319F, -0.1168F);
        this.head.addChild(jaw1);
        this.setRotateAngle(jaw1, -0.9865F, 0.0F, 0.0F);
        this.jaw1.cubeList.add(new ModelBox(jaw1, 36, 13, -4.0F, 0.0F, 0.0F, 1, 2, 6, 0.0F, false));
        this.jaw1.cubeList.add(new ModelBox(jaw1, 36, 13, 2.9715F, 0.0F, 0.0F, 1, 2, 6, 0.0F, true));

        this.jaw2 = new AdvancedModelRenderer(this);
        this.jaw2.setRotationPoint(0.0F, 0.0F, 5.6F);
        this.jaw1.addChild(jaw2);
        this.jaw2.cubeList.add(new ModelBox(jaw2, 45, 32, -3.0F, 0.0F, 0.0F, 1, 1, 5, 0.0F, false));
        this.jaw2.cubeList.add(new ModelBox(jaw2, 45, 32, 1.9715F, 0.0F, 0.0F, 1, 1, 5, 0.0F, true));
        this.jaw2.cubeList.add(new ModelBox(jaw2, 48, 42, -3.0F, 0.0F, 5.0F, 6, 1, 1, 0.0F, false));

        this.lowerjaw = new AdvancedModelRenderer(this);
        this.lowerjaw.setRotationPoint(0.0F, 1.0F, -1.3F);
        this.jaw2.addChild(lowerjaw);
        this.setRotateAngle(lowerjaw, 0.1121F, 0.0F, 0.0F);
        this.lowerjaw.cubeList.add(new ModelBox(lowerjaw, 28, 37, -3.0F, 0.0F, 0.2F, 1, 1, 6, -0.001F, false));
        this.lowerjaw.cubeList.add(new ModelBox(lowerjaw, 28, 37, 1.9715F, 0.0F, 0.2F, 1, 1, 6, -0.001F, true));
        this.lowerjaw.cubeList.add(new ModelBox(lowerjaw, 48, 39, -3.0F, 0.0F, 6.2F, 6, 1, 1, -0.001F, false));

        this.gums2 = new AdvancedModelRenderer(this);
        this.gums2.setRotationPoint(0.0F, -2.6F, -0.8F);
        this.jaw1.addChild(gums2);
        this.setRotateAngle(gums2, 0.3841F, 0.0F, 0.0F);


        this.upperarm1 = new AdvancedModelRenderer(this);
        this.upperarm1.setRotationPoint(-3.7F, 3.8896F, 4.8725F);
        this.body.addChild(upperarm1);
        this.setRotateAngle(upperarm1, -0.2068F, 0.0F, 0.3187F);
        this.upperarm1.cubeList.add(new ModelBox(upperarm1, 0, 11, -1.0504F, -0.2241F, -1.119F, 1, 5, 2, 0.1F, false));

        this.arm1 = new AdvancedModelRenderer(this);
        this.arm1.setRotationPoint(-0.5504F, 4.3759F, -0.619F);
        this.upperarm1.addChild(arm1);
        this.setRotateAngle(arm1, -0.5618F, 0.0F, 0.0F);
        this.arm1.cubeList.add(new ModelBox(arm1, 23, 45, -0.5F, -0.061F, 0.0983F, 1, 1, 5, 0.0F, false));
        this.arm1.cubeList.add(new ModelBox(arm1, 10, 45, -0.5F, -1.761F, 0.0983F, 1, 1, 5, 0.0F, false));

        this.hand1 = new AdvancedModelRenderer(this);
        this.hand1.setRotationPoint(1.2F, -1.061F, 3.0983F);
        this.arm1.addChild(hand1);
        this.setRotateAngle(hand1, -0.9517F, 0.0594F, -0.3601F);
        this.hand1.cubeList.add(new ModelBox(hand1, 51, 17, -3.0F, -4.2F, 0.0F, 3, 4, 2, 0.0F, false));

        this.upperarm2 = new AdvancedModelRenderer(this);
        this.upperarm2.setRotationPoint(4.3F, 3.8896F, 4.8725F);
        this.body.addChild(upperarm2);
        this.setRotateAngle(upperarm2, -1.1231F, 0.0F, -0.3187F);
        this.upperarm2.cubeList.add(new ModelBox(upperarm2, 0, 11, 0.0504F, -0.2241F, -1.119F, 1, 5, 2, 0.1F, true));

        this.arm2 = new AdvancedModelRenderer(this);
        this.arm2.setRotationPoint(0.5504F, 4.3759F, -0.619F);
        this.upperarm2.addChild(arm2);
        this.setRotateAngle(arm2, -0.6927F, 0.0F, 0.0F);
        this.arm2.cubeList.add(new ModelBox(arm2, 23, 45, -0.5F, -0.061F, 0.0983F, 1, 1, 5, 0.0F, true));
        this.arm2.cubeList.add(new ModelBox(arm2, 10, 45, -0.5F, -1.761F, 0.0983F, 1, 1, 5, 0.0F, true));

        this.hand2 = new AdvancedModelRenderer(this);
        this.hand2.setRotationPoint(-1.2F, -1.061F, 3.0983F);
        this.arm2.addChild(hand2);
        this.setRotateAngle(hand2, -0.1294F, -0.1562F, 0.435F);
        this.hand2.cubeList.add(new ModelBox(hand2, 51, 17, 0.0F, -4.2F, 0.0F, 3, 4, 2, 0.0F, true));

        this.sail = new AdvancedModelRenderer(this);
        this.sail.setRotationPoint(-0.1F, -16.5104F, -10.1275F);
        this.body.addChild(sail);

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
