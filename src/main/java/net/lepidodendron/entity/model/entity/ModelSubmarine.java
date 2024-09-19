package net.lepidodendron.entity.model.entity;

import net.ilexiconn.llibrary.client.model.ModelAnimator;
import net.ilexiconn.llibrary.client.model.tools.AdvancedModelRenderer;
import net.lepidodendron.entity.model.ModelBasePalaeopedia;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

public class ModelSubmarine extends ModelBasePalaeopedia {

    private final AdvancedModelRenderer submarine;
    private final AdvancedModelRenderer Cockpitmetal;
    private final AdvancedModelRenderer cube_r1;
    private final AdvancedModelRenderer cube_r2;
    private final AdvancedModelRenderer cube_r3;
    private final AdvancedModelRenderer cockpit;
    private final AdvancedModelRenderer Cockpitinside;
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
    private final AdvancedModelRenderer body;
    private final AdvancedModelRenderer Arm;
    private final AdvancedModelRenderer Arm2;
    private final AdvancedModelRenderer Arm3;
    private final AdvancedModelRenderer Arm4;
    private final AdvancedModelRenderer Hand;
    private final AdvancedModelRenderer Handanimated;
    private final AdvancedModelRenderer cube_r16;
    private final AdvancedModelRenderer Handanimated2;
    private final AdvancedModelRenderer cube_r17;
    private final AdvancedModelRenderer leftWing;
    private final AdvancedModelRenderer cube_r18;
    private final AdvancedModelRenderer cube_r19;
    private final AdvancedModelRenderer leftTurbine;
    private final AdvancedModelRenderer leftTurbine2;
    private final AdvancedModelRenderer rightWing;
    private final AdvancedModelRenderer rightTurbine;
    private final AdvancedModelRenderer rightTurbine2;

    private ModelAnimator animator;

    public ModelSubmarine() {
        this.textureWidth = 380;
        this.textureHeight = 320;

        this.submarine = new AdvancedModelRenderer(this);
        this.submarine.setRotationPoint(0.0F, 24.0F, 0.0F);


        this.Cockpitmetal = new AdvancedModelRenderer(this);
        this.Cockpitmetal.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.submarine.addChild(Cockpitmetal);
        this.Cockpitmetal.cubeList.add(new ModelBox(Cockpitmetal, 110, 0, -19.0F, -7.0F, -7.0F, 36, 3, 36, 0.003F, false));
        this.Cockpitmetal.cubeList.add(new ModelBox(Cockpitmetal, 110, 40, -13.0F, -46.0F, 1.0F, 24, 3, 20, 0.0F, false));
        this.Cockpitmetal.cubeList.add(new ModelBox(Cockpitmetal, 29, 38, -13.0F, -49.0F, 1.0F, 24, 3, 1, 0.0F, false));
        this.Cockpitmetal.cubeList.add(new ModelBox(Cockpitmetal, 113, 133, -5.0F, -47.0F, 7.0F, 8, 1, 8, 0.0F, false));
        this.Cockpitmetal.cubeList.add(new ModelBox(Cockpitmetal, 113, 133, -5.0F, -43.5F, 7.0F, 8, 1, 8, 0.0F, false));
        this.Cockpitmetal.cubeList.add(new ModelBox(Cockpitmetal, 0, 38, 5.0F, -49.0F, 7.0F, 4, 3, 20, 0.002F, false));
        this.Cockpitmetal.cubeList.add(new ModelBox(Cockpitmetal, 0, 38, -11.0F, -49.0F, 7.0F, 4, 3, 20, 0.002F, false));

        this.cube_r1 = new AdvancedModelRenderer(this);
        this.cube_r1.setRotationPoint(-9.0F, -40.6676F, 37.1215F);
        this.Cockpitmetal.addChild(cube_r1);
        this.setRotateAngle(cube_r1, -0.7418F, 0.0F, 0.0F);
        this.cube_r1.cubeList.add(new ModelBox(cube_r1, 0, 101, -2.0F, -1.0913F, -0.3099F, 4, 7, 13, 0.0F, false));
        this.cube_r1.cubeList.add(new ModelBox(cube_r1, 0, 101, 14.0F, -1.0913F, -0.3099F, 4, 7, 13, 0.0F, false));

        this.cube_r2 = new AdvancedModelRenderer(this);
        this.cube_r2.setRotationPoint(-9.0F, -47.5F, 27.0F);
        this.Cockpitmetal.addChild(cube_r2);
        this.setRotateAngle(cube_r2, -0.6109F, 0.0F, 0.0F);
        this.cube_r2.cubeList.add(new ModelBox(cube_r2, 47, 0, -2.0F, -1.3F, -0.9F, 4, 5, 13, -0.003F, false));
        this.cube_r2.cubeList.add(new ModelBox(cube_r2, 47, 0, 14.0F, -1.3F, -0.9F, 4, 5, 13, -0.003F, false));

        this.cube_r3 = new AdvancedModelRenderer(this);
        this.cube_r3.setRotationPoint(-12.5F, -45.5F, 13.0F);
        this.Cockpitmetal.addChild(cube_r3);
        this.setRotateAngle(cube_r3, -0.2618F, 0.0F, 0.0F);
        this.cube_r3.cubeList.add(new ModelBox(cube_r3, 0, 135, -0.5F, -0.5F, -11.5F, 1, 3, 12, -0.003F, false));
        this.cube_r3.cubeList.add(new ModelBox(cube_r3, 0, 135, 22.5F, -0.5F, -11.5F, 1, 3, 12, -0.003F, false));

        this.cockpit = new AdvancedModelRenderer(this);
        this.cockpit.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.Cockpitmetal.addChild(cockpit);
        this.cockpit.cubeList.add(new ModelBox(cockpit, 0, 248, -19.0F, -43.0F, -7.0F, 36, 36, 36, 0.0F, false));

        this.Cockpitinside = new AdvancedModelRenderer(this);
        this.Cockpitinside.setRotationPoint(0.0F, -19.0F, 28.0F);
        this.Cockpitmetal.addChild(Cockpitinside);
        this.Cockpitinside.cubeList.add(new ModelBox(Cockpitinside, 88, 101, -7.0F, 7.0F, -29.0F, 12, 5, 8, 0.0F, false));
        this.Cockpitinside.cubeList.add(new ModelBox(Cockpitinside, 88, 131, 7.0F, 4.0F, -30.0F, 3, 8, 9, -0.004F, false));
        this.Cockpitinside.cubeList.add(new ModelBox(Cockpitinside, 88, 131, 7.0F, 4.0F, -11.0F, 3, 8, 9, -0.004F, false));
        this.Cockpitinside.cubeList.add(new ModelBox(Cockpitinside, 88, 131, -12.0F, 4.0F, -11.0F, 3, 8, 9, -0.004F, true));
        this.Cockpitinside.cubeList.add(new ModelBox(Cockpitinside, 35, 125, -12.0F, 4.0F, -30.0F, 3, 8, 9, -0.004F, false));
        this.Cockpitinside.cubeList.add(new ModelBox(Cockpitinside, 7, 62, -11.0F, 2.0F, -29.0F, 1, 2, 1, -0.004F, false));
        this.Cockpitinside.cubeList.add(new ModelBox(Cockpitinside, 35, 101, -7.0F, 7.0F, -10.0F, 12, 5, 8, 0.0F, false));
        this.Cockpitinside.cubeList.add(new ModelBox(Cockpitinside, 29, 43, -4.0F, -5.0F, -3.0F, 6, 4, 3, 0.0F, false));
        this.Cockpitinside.cubeList.add(new ModelBox(Cockpitinside, 88, 115, -7.0F, -1.0F, -2.0F, 12, 13, 2, 0.0F, false));

        this.cube_r4 = new AdvancedModelRenderer(this);
        this.cube_r4.setRotationPoint(-1.0F, 15.0F, -20.0F);
        this.Cockpitinside.addChild(cube_r4);
        this.setRotateAngle(cube_r4, -0.0873F, 0.0F, 0.0F);
        this.cube_r4.cubeList.add(new ModelBox(cube_r4, 110, 16, -6.0F, -16.0F, -2.0F, 12, 13, 2, -0.002F, false));
        this.cube_r4.cubeList.add(new ModelBox(cube_r4, 0, 48, -3.0F, -20.0F, -3.0F, 6, 4, 3, 0.0F, false));

        this.cube_r5 = new AdvancedModelRenderer(this);
        this.cube_r5.setRotationPoint(7.0F, -18.0F, -32.5F);
        this.Cockpitinside.addChild(cube_r5);
        this.setRotateAngle(cube_r5, -0.3927F, -0.7854F, 0.0F);
        this.cube_r5.cubeList.add(new ModelBox(cube_r5, 0, 10, 1.0F, -4.0F, -0.5F, 7, 8, 1, 0.0F, false));

        this.cube_r6 = new AdvancedModelRenderer(this);
        this.cube_r6.setRotationPoint(-9.0F, -18.0F, -32.5F);
        this.Cockpitinside.addChild(cube_r6);
        this.setRotateAngle(cube_r6, -0.3927F, 0.7854F, 0.0F);
        this.cube_r6.cubeList.add(new ModelBox(cube_r6, 0, 38, -8.0F, -4.0F, -0.5F, 7, 8, 1, 0.0F, false));

        this.cube_r7 = new AdvancedModelRenderer(this);
        this.cube_r7.setRotationPoint(-1.0F, -22.0F, -31.5F);
        this.Cockpitinside.addChild(cube_r7);
        this.setRotateAngle(cube_r7, -1.1345F, 0.0F, 0.0F);
        this.cube_r7.cubeList.add(new ModelBox(cube_r7, 47, 0, -2.0F, -7.9218F, 0.1069F, 4, 8, 1, 0.0F, false));

        this.cube_r8 = new AdvancedModelRenderer(this);
        this.cube_r8.setRotationPoint(-1.5449F, 9.0F, -18.5449F);
        this.Cockpitinside.addChild(cube_r8);
        this.setRotateAngle(cube_r8, 1.5708F, 1.4835F, 1.5708F);
        this.cube_r8.cubeList.add(new ModelBox(cube_r8, 37, 149, -0.5F, -8.0F, -4.5F, 1, 6, 9, -0.004F, false));

        this.cube_r9 = new AdvancedModelRenderer(this);
        this.cube_r9.setRotationPoint(-1.5449F, 10.5691F, -16.5F);
        this.Cockpitinside.addChild(cube_r9);
        this.setRotateAngle(cube_r9, 0.0F, 1.5708F, 0.0F);
        this.cube_r9.cubeList.add(new ModelBox(cube_r9, 117, 115, -0.4551F, -3.5691F, -4.5F, 3, 8, 9, -0.004F, false));

        this.cube_r10 = new AdvancedModelRenderer(this);
        this.cube_r10.setRotationPoint(-1.5449F, 10.5691F, -16.5F);
        this.Cockpitinside.addChild(cube_r10);
        this.setRotateAngle(cube_r10, -1.5708F, 0.9599F, -1.5708F);
        this.cube_r10.cubeList.add(new ModelBox(cube_r10, 88, 149, -1.2484F, -3.181F, -4.5F, 3, 2, 9, -0.006F, false));

        this.cube_r11 = new AdvancedModelRenderer(this);
        this.cube_r11.setRotationPoint(-1.5449F, 10.5691F, -16.5F);
        this.Cockpitinside.addChild(cube_r11);
        this.setRotateAngle(cube_r11, -1.5708F, 1.4399F, -1.5708F);
        this.cube_r11.cubeList.add(new ModelBox(cube_r11, 59, 43, -1.4551F, -4.8691F, 1.5F, 1, 2, 1, -0.004F, false));

        this.cube_r12 = new AdvancedModelRenderer(this);
        this.cube_r12.setRotationPoint(-11.5F, 4.0F, -25.5F);
        this.Cockpitinside.addChild(cube_r12);
        this.setRotateAngle(cube_r12, 0.0F, 0.0F, -0.2182F);
        this.cube_r12.cubeList.add(new ModelBox(cube_r12, 0, 164, -0.5F, -4.0F, -4.5F, 1, 4, 9, -0.004F, false));

        this.cube_r13 = new AdvancedModelRenderer(this);
        this.cube_r13.setRotationPoint(-8.5F, 3.5F, -3.0F);
        this.Cockpitinside.addChild(cube_r13);
        this.setRotateAngle(cube_r13, 0.0F, 0.0F, 0.6109F);
        this.cube_r13.cubeList.add(new ModelBox(cube_r13, 49, 156, -0.2F, 0.7F, -8.0F, 3, 2, 9, -0.006F, true));
        this.cube_r13.cubeList.add(new ModelBox(cube_r13, 49, 156, -0.2F, 0.7F, -27.0F, 3, 2, 9, -0.006F, true));

        this.cube_r14 = new AdvancedModelRenderer(this);
        this.cube_r14.setRotationPoint(6.5F, 3.5F, -3.0F);
        this.Cockpitinside.addChild(cube_r14);
        this.setRotateAngle(cube_r14, 0.0F, 0.0F, -0.6109F);
        this.cube_r14.cubeList.add(new ModelBox(cube_r14, 49, 156, -2.8F, 0.7F, -8.0F, 3, 2, 9, -0.006F, false));
        this.cube_r14.cubeList.add(new ModelBox(cube_r14, 49, 156, -2.8F, 0.7F, -27.0F, 3, 2, 9, -0.006F, false));

        this.cube_r15 = new AdvancedModelRenderer(this);
        this.cube_r15.setRotationPoint(-1.0F, -18.0F, -32.5F);
        this.Cockpitinside.addChild(cube_r15);
        this.setRotateAngle(cube_r15, -0.3927F, 0.0F, 0.0F);
        this.cube_r15.cubeList.add(new ModelBox(cube_r15, 0, 125, -8.0F, -4.0F, -0.5F, 16, 8, 1, 0.0F, false));

        this.body = new AdvancedModelRenderer(this);
        this.body.setRotationPoint(0.0F, -31.0F, 29.0F);
        this.submarine.addChild(body);
        this.body.cubeList.add(new ModelBox(body, 165, 119, -19.0F, -2.0F, -1.0F, 36, 3, 29, -0.003F, false));
        this.body.cubeList.add(new ModelBox(body, 136, 168, -15.0F, 1.0F, -1.0F, 28, 9, 29, 0.0F, false));
        this.body.cubeList.add(new ModelBox(body, 0, 151, 14.0F, 15.0F, -53.0F, 3, 3, 9, 0.0F, false));
        this.body.cubeList.add(new ModelBox(body, 35, 48, 10.0F, 19.0F, -55.0F, 7, 7, 14, 0.0F, false));
        this.body.cubeList.add(new ModelBox(body, 28, 115, -7.0F, -11.0F, 2.0F, 12, 2, 7, 0.0F, false));
        this.body.cubeList.add(new ModelBox(body, 110, 64, -7.0F, -17.0F, -8.0F, 12, 2, 7, 0.0F, false));
        this.body.cubeList.add(new ModelBox(body, 0, 62, 4.0F, -5.0F, 5.0F, 6, 3, 13, 0.0F, false));
        this.body.cubeList.add(new ModelBox(body, 0, 62, -12.0F, -5.0F, 5.0F, 6, 3, 13, 0.0F, false));
        this.body.cubeList.add(new ModelBox(body, 110, 0, -5.0F, -8.0F, 7.0F, 8, 6, 9, 0.0F, false));
        this.body.cubeList.add(new ModelBox(body, 165, 72, -20.0F, 10.0F, -1.0F, 38, 17, 29, 0.003F, false));
        this.body.cubeList.add(new ModelBox(body, 0, 194, -17.0F, 27.0F, -1.0F, 32, 7, 25, 0.0F, false));
        this.body.cubeList.add(new ModelBox(body, 0, 27, -15.0F, 27.0F, -41.0F, 28, 7, 3, 0.0F, false));
        this.body.cubeList.add(new ModelBox(body, 63, 27, 13.0F, 24.0F, -41.0F, 4, 7, 3, 0.0F, false));
        this.body.cubeList.add(new ModelBox(body, 63, 27, -19.0F, 24.0F, -41.0F, 4, 7, 3, 0.0F, false));

        this.Arm = new AdvancedModelRenderer(this);
        this.Arm.setRotationPoint(-19.0F, 18.0F, -44.0F);
        this.body.addChild(Arm);
        this.Arm.cubeList.add(new ModelBox(Arm, 50, 133, 0.0F, -2.0F, -9.0F, 2, 7, 10, 0.0F, false));
        this.Arm.cubeList.add(new ModelBox(Arm, 40, 51, 2.0F, 0.8F, -5.0F, 1, 2, 3, 0.0F, false));

        this.Arm2 = new AdvancedModelRenderer(this);
        this.Arm2.setRotationPoint(2.0F, 2.0F, -5.0F);
        this.Arm.addChild(Arm2);
        this.setRotateAngle(Arm2, 0.1309F, 0.0F, 0.0F);
        this.Arm2.cubeList.add(new ModelBox(Arm2, 65, 122, -0.4F, -16.0F, -2.0F, 2, 17, 3, 0.0F, false));

        this.Arm3 = new AdvancedModelRenderer(this);
        this.Arm3.setRotationPoint(0.6F, -15.0F, -1.0F);
        this.Arm2.addChild(Arm3);
        this.setRotateAngle(Arm3, 2.618F, 0.0F, 0.0F);
        this.Arm3.cubeList.add(new ModelBox(Arm3, 64, 43, -0.5F, -14.0F, -2.0F, 1, 14, 3, -0.004F, false));

        this.Arm4 = new AdvancedModelRenderer(this);
        this.Arm4.setRotationPoint(0.0F, -13.6F, -0.3F);
        this.Arm3.addChild(Arm4);
        this.setRotateAngle(Arm4, 0.7418F, 0.0F, 0.0F);
        this.Arm4.cubeList.add(new ModelBox(Arm4, 26, 62, -0.5F, -5.7174F, -0.9877F, 1, 6, 2, 0.0F, false));

        this.Hand = new AdvancedModelRenderer(this);
        this.Hand.setRotationPoint(0.0F, -5.7F, 0.0F);
        this.Arm4.addChild(Hand);
        this.Hand.cubeList.add(new ModelBox(Hand, 48, 43, -1.0F, -1.0F, -1.6F, 2, 1, 3, 0.0F, false));

        this.Handanimated = new AdvancedModelRenderer(this);
        this.Handanimated.setRotationPoint(0.0F, -1.0F, -1.1F);
        this.Hand.addChild(Handanimated);
        this.setRotateAngle(Handanimated, -0.0873F, 0.0F, 0.0F);


        this.cube_r16 = new AdvancedModelRenderer(this);
        this.cube_r16.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.Handanimated.addChild(cube_r16);
        this.setRotateAngle(cube_r16, 0.48F, 0.0F, 0.0F);
        this.cube_r16.cubeList.add(new ModelBox(cube_r16, 12, 0, -0.6F, -2.8F, -0.4F, 1, 3, 1, 0.0F, false));

        this.Handanimated2 = new AdvancedModelRenderer(this);
        this.Handanimated2.setRotationPoint(0.0F, -1.0F, 0.9F);
        this.Hand.addChild(Handanimated2);
        this.setRotateAngle(Handanimated2, 0.1745F, 0.0F, 0.0F);


        this.cube_r17 = new AdvancedModelRenderer(this);
        this.cube_r17.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.Handanimated2.addChild(cube_r17);
        this.setRotateAngle(cube_r17, -0.48F, 0.0F, 0.0F);
        this.cube_r17.cubeList.add(new ModelBox(cube_r17, 0, 0, -0.6F, -2.8F, -0.6F, 1, 3, 1, 0.0F, false));

        this.leftWing = new AdvancedModelRenderer(this);
        this.leftWing.setRotationPoint(7.4508F, 17.9728F, 26.2445F);
        this.body.addChild(leftWing);
        this.leftWing.cubeList.add(new ModelBox(leftWing, 39, 70, 5.5492F, -19.9728F, -34.2445F, 13, 6, 6, 0.0F, false));
        this.leftWing.cubeList.add(new ModelBox(leftWing, 21, 145, 5.5492F, -19.9728F, -28.2445F, 6, 6, 6, 0.0F, false));
        this.leftWing.cubeList.add(new ModelBox(leftWing, 0, 0, 5.5492F, -19.9728F, -22.2445F, 13, 6, 20, 0.0F, false));
        this.leftWing.cubeList.add(new ModelBox(leftWing, 0, 0, 9.5492F, -7.9728F, -82.2445F, 13, 17, 83, -0.004F, false));
        this.leftWing.cubeList.add(new ModelBox(leftWing, 88, 101, 12.5492F, 10.0272F, -65.2445F, 8, 6, 60, 0.0F, false));
        this.leftWing.cubeList.add(new ModelBox(leftWing, 145, 70, 11.5492F, 9.0272F, -49.2445F, 10, 8, 4, 0.0F, false));
        this.leftWing.cubeList.add(new ModelBox(leftWing, 113, 143, 11.5492F, 9.0272F, -25.2445F, 10, 8, 4, 0.0F, false));
        this.leftWing.cubeList.add(new ModelBox(leftWing, 0, 101, 22.5492F, -5.9728F, -76.2445F, 5, 15, 77, 0.0F, false));

        this.cube_r18 = new AdvancedModelRenderer(this);
        this.cube_r18.setRotationPoint(-31.4508F, 13.0272F, -3.2445F);
        this.leftWing.addChild(cube_r18);
        this.setRotateAngle(cube_r18, 0.0F, -1.5708F, 0.0F);
        this.cube_r18.cubeList.add(new ModelBox(cube_r18, 109, 271, -6.5F, -7.0F, 0.0F, 10, 8, 4, 0.0F, true));

        this.cube_r19 = new AdvancedModelRenderer(this);
        this.cube_r19.setRotationPoint(16.5492F, 13.0272F, -3.2445F);
        this.leftWing.addChild(cube_r19);
        this.setRotateAngle(cube_r19, 0.0F, 1.5708F, 0.0F);
        this.cube_r19.cubeList.add(new ModelBox(cube_r19, 109, 271, -3.5F, -7.0F, -2.0F, 10, 8, 4, 0.0F, false));

        this.leftTurbine = new AdvancedModelRenderer(this);
        this.leftTurbine.setRotationPoint(10.5492F, -10.9728F, -2.2445F);
        this.leftWing.addChild(leftTurbine);
        this.leftTurbine.cubeList.add(new ModelBox(leftTurbine, 165, 130, -4.0F, -3.0F, -3.0F, 6, 6, 4, 0.002F, false));
        this.leftTurbine.cubeList.add(new ModelBox(leftTurbine, 0, 62, -5.0F, -1.0F, -3.0F, 1, 2, 4, 0.0F, false));
        this.leftTurbine.cubeList.add(new ModelBox(leftTurbine, 16, 158, -2.0F, -1.0F, -7.0F, 2, 2, 9, 0.0F, false));

        this.leftTurbine2 = new AdvancedModelRenderer(this);
        this.leftTurbine2.setRotationPoint(16.5492F, -18.9728F, -25.2445F);
        this.leftWing.addChild(leftTurbine2);
        this.setRotateAngle(leftTurbine2, 1.5708F, 0.0F, -0.4363F);
        this.leftTurbine2.cubeList.add(new ModelBox(leftTurbine2, 165, 119, -4.0F, -3.0F, -3.0F, 6, 6, 4, 0.003F, false));
        this.leftTurbine2.cubeList.add(new ModelBox(leftTurbine2, 29, 51, -5.0F, -1.0F, -3.0F, 1, 2, 4, 0.0F, false));
        this.leftTurbine2.cubeList.add(new ModelBox(leftTurbine2, 0, 0, -2.0F, -1.0F, -5.0F, 2, 2, 7, 0.0F, false));

        this.rightWing = new AdvancedModelRenderer(this);
        this.rightWing.setRotationPoint(-9.4508F, 17.9728F, 26.2445F);
        this.body.addChild(rightWing);
        this.rightWing.cubeList.add(new ModelBox(rightWing, 39, 70, -18.5492F, -19.9728F, -34.2445F, 13, 6, 6, 0.0F, true));
        this.rightWing.cubeList.add(new ModelBox(rightWing, 21, 145, -11.5492F, -19.9728F, -28.2445F, 6, 6, 6, 0.0F, true));
        this.rightWing.cubeList.add(new ModelBox(rightWing, 0, 0, -18.5492F, -19.9728F, -22.2445F, 13, 6, 20, 0.0F, true));
        this.rightWing.cubeList.add(new ModelBox(rightWing, 0, 0, -22.5492F, -7.9728F, -82.2445F, 13, 17, 83, -0.004F, true));
        this.rightWing.cubeList.add(new ModelBox(rightWing, 88, 101, -20.5492F, 10.0272F, -65.2445F, 8, 6, 60, 0.0F, true));
        this.rightWing.cubeList.add(new ModelBox(rightWing, 8, 274, -20.5492F, 10.0272F, -5.2445F, 8, 4, 3, 0.0F, true));
        this.rightWing.cubeList.add(new ModelBox(rightWing, 8, 274, 29.4508F, 10.0272F, -5.2445F, 8, 4, 3, 0.0F, false));
        this.rightWing.cubeList.add(new ModelBox(rightWing, 145, 70, -21.5492F, 9.0272F, -49.2445F, 10, 8, 4, 0.0F, true));
        this.rightWing.cubeList.add(new ModelBox(rightWing, 113, 143, -21.5492F, 9.0272F, -25.2445F, 10, 8, 4, 0.0F, true));
        this.rightWing.cubeList.add(new ModelBox(rightWing, 0, 101, -27.5492F, -5.9728F, -76.2445F, 5, 15, 77, 0.0F, false));

        this.rightTurbine = new AdvancedModelRenderer(this);
        this.rightTurbine.setRotationPoint(-10.5492F, -10.9728F, -2.2445F);
        this.rightWing.addChild(rightTurbine);
        this.rightTurbine.cubeList.add(new ModelBox(rightTurbine, 165, 130, -2.0F, -3.0F, -3.0F, 6, 6, 4, 0.002F, true));
        this.rightTurbine.cubeList.add(new ModelBox(rightTurbine, 0, 62, 4.0F, -1.0F, -3.0F, 1, 2, 4, 0.0F, true));
        this.rightTurbine.cubeList.add(new ModelBox(rightTurbine, 16, 158, 0.0F, -1.0F, -7.0F, 2, 2, 9, 0.0F, true));

        this.rightTurbine2 = new AdvancedModelRenderer(this);
        this.rightTurbine2.setRotationPoint(-16.5492F, -18.9728F, -25.2445F);
        this.rightWing.addChild(rightTurbine2);
        this.setRotateAngle(rightTurbine2, 1.5708F, 0.0F, 0.4363F);
        this.rightTurbine2.cubeList.add(new ModelBox(rightTurbine2, 165, 119, -2.0F, -3.0F, -3.0F, 6, 6, 4, 0.003F, true));
        this.rightTurbine2.cubeList.add(new ModelBox(rightTurbine2, 29, 51, 4.0F, -1.0F, -3.0F, 1, 2, 4, 0.0F, true));
        this.rightTurbine2.cubeList.add(new ModelBox(rightTurbine2, 0, 0, 0.0F, -1.0F, -5.0F, 2, 2, 7, 0.0F, true));

        updateDefaultPose();
    }

    @Override
    public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        //GlStateManager.rotate(90.0F, 0.0F, 1.0F, 0.0F);
        this.setRotationAngles(f, f1, f2, f3, f4, f5, entity);
        this.submarine.offsetZ = -0.40F;
        this.submarine.offsetY = -0.8F;
        this.submarine.render(f5);
    }

    @Override
    public void renderStaticBook(float f) {

    }
    
    public void setRotateAngle(ModelRenderer AdvancedModelRenderer, float x, float y, float z) {
        AdvancedModelRenderer.rotateAngleX = x;
        AdvancedModelRenderer.rotateAngleY = y;
        AdvancedModelRenderer.rotateAngleZ = z;
    }

}

