package net.lepidodendron.entity.model.entity;

import net.ilexiconn.llibrary.client.model.tools.AdvancedModelRenderer;
import net.lepidodendron.entity.model.ModelBasePalaeopedia;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLiving;

public class ModelTuzoia extends ModelBasePalaeopedia {
    private final AdvancedModelRenderer Main_Body;
    private final AdvancedModelRenderer cube_r1;
    private final AdvancedModelRenderer cube_r2;
    private final AdvancedModelRenderer Antenna_L;
    private final AdvancedModelRenderer cube_r3;
    private final AdvancedModelRenderer Antenna_R;
    private final AdvancedModelRenderer cube_r4;
    private final AdvancedModelRenderer Valve_L;
    private final AdvancedModelRenderer cube_r5;
    private final AdvancedModelRenderer cube_r6;
    private final AdvancedModelRenderer cube_r7;
    private final AdvancedModelRenderer cube_r8;
    private final AdvancedModelRenderer Valve_R;
    private final AdvancedModelRenderer cube_r9;
    private final AdvancedModelRenderer cube_r10;
    private final AdvancedModelRenderer cube_r11;
    private final AdvancedModelRenderer cube_r12;
    private final AdvancedModelRenderer Eye_R;
    private final AdvancedModelRenderer cube_r13;
    private final AdvancedModelRenderer cube_r14;
    private final AdvancedModelRenderer Eye_L;
    private final AdvancedModelRenderer cube_r15;
    private final AdvancedModelRenderer cube_r16;
    private final AdvancedModelRenderer Tail;
    private final AdvancedModelRenderer Leg_1_R;
    private final AdvancedModelRenderer cube_r17;
    private final AdvancedModelRenderer Leg_1_L;
    private final AdvancedModelRenderer cube_r18;
    private final AdvancedModelRenderer Leg_2_R;
    private final AdvancedModelRenderer cube_r19;
    private final AdvancedModelRenderer Leg_2_L;
    private final AdvancedModelRenderer cube_r20;
    private final AdvancedModelRenderer Leg_3_R;
    private final AdvancedModelRenderer cube_r21;
    private final AdvancedModelRenderer cube_r22;
    private final AdvancedModelRenderer Leg_3_L;
    private final AdvancedModelRenderer cube_r23;
    private final AdvancedModelRenderer cube_r24;
    private final AdvancedModelRenderer Leg_4_R;
    private final AdvancedModelRenderer cube_r25;
    private final AdvancedModelRenderer cube_r26;
    private final AdvancedModelRenderer Leg_4_L;
    private final AdvancedModelRenderer cube_r27;
    private final AdvancedModelRenderer cube_r28;
    private final AdvancedModelRenderer Leg_5_R;
    private final AdvancedModelRenderer cube_r29;
    private final AdvancedModelRenderer cube_r30;
    private final AdvancedModelRenderer Leg_5_L;
    private final AdvancedModelRenderer cube_r31;
    private final AdvancedModelRenderer cube_r32;
    private final AdvancedModelRenderer Leg_6_R;
    private final AdvancedModelRenderer cube_r33;
    private final AdvancedModelRenderer cube_r34;
    private final AdvancedModelRenderer Leg_6_L;
    private final AdvancedModelRenderer cube_r35;
    private final AdvancedModelRenderer cube_r36;
    private final AdvancedModelRenderer Leg_7_R;
    private final AdvancedModelRenderer cube_r37;
    private final AdvancedModelRenderer cube_r38;
    private final AdvancedModelRenderer Leg_7_L;
    private final AdvancedModelRenderer cube_r39;
    private final AdvancedModelRenderer cube_r40;
    private final AdvancedModelRenderer Leg_8_R;
    private final AdvancedModelRenderer cube_r41;
    private final AdvancedModelRenderer cube_r42;
    private final AdvancedModelRenderer Leg_8_L;
    private final AdvancedModelRenderer cube_r43;
    private final AdvancedModelRenderer cube_r44;
    private final AdvancedModelRenderer Leg_9_R;
    private final AdvancedModelRenderer cube_r45;
    private final AdvancedModelRenderer cube_r46;
    private final AdvancedModelRenderer Leg_9_L;
    private final AdvancedModelRenderer cube_r47;
    private final AdvancedModelRenderer cube_r48;
    private final AdvancedModelRenderer Leg_10_R;
    private final AdvancedModelRenderer cube_r49;
    private final AdvancedModelRenderer cube_r50;
    private final AdvancedModelRenderer Leg_10_L;
    private final AdvancedModelRenderer cube_r51;
    private final AdvancedModelRenderer cube_r52;
    private final AdvancedModelRenderer Leg_11_R;
    private final AdvancedModelRenderer cube_r53;
    private final AdvancedModelRenderer cube_r54;
    private final AdvancedModelRenderer Leg_11_L;
    private final AdvancedModelRenderer cube_r55;
    private final AdvancedModelRenderer cube_r56;
    private final AdvancedModelRenderer Leg_12_R;
    private final AdvancedModelRenderer cube_r57;
    private final AdvancedModelRenderer cube_r58;
    private final AdvancedModelRenderer Leg_12_L;
    private final AdvancedModelRenderer cube_r59;
    private final AdvancedModelRenderer cube_r60;

    public ModelTuzoia() {
        this.textureWidth = 128;
        this.textureHeight = 128;

        this.Main_Body = new AdvancedModelRenderer(this);
        this.Main_Body.setRotationPoint(0.0F, 19.5F, -3.5F);
        this.setRotateAngle(Main_Body, 0.0F, 3.1416F, 0.0F);
        this.Main_Body.cubeList.add(new ModelBox(Main_Body, 50, 32, -2.5F, -4.0F, -18.5F, 5, 5, 18, 0.0F, false));
        this.Main_Body.cubeList.add(new ModelBox(Main_Body, 0, 43, 0.0F, -6.8F, -21.5F, 0, 2, 25, 0.0F, false));

        this.cube_r1 = new AdvancedModelRenderer(this);
        this.cube_r1.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.Main_Body.addChild(cube_r1);
        this.setRotateAngle(cube_r1, 0.7418F, 0.0F, 0.0F);
        this.cube_r1.cubeList.add(new ModelBox(cube_r1, 8, 7, -1.0F, -2.0F, -1.0F, 2, 2, 4, 0.0F, false));

        this.cube_r2 = new AdvancedModelRenderer(this);
        this.cube_r2.setRotationPoint(0.5F, -1.9F, 0.3F);
        this.Main_Body.addChild(cube_r2);
        this.setRotateAngle(cube_r2, -0.1047F, 0.0F, 0.0F);
        this.cube_r2.cubeList.add(new ModelBox(cube_r2, 0, 13, -2.0F, -2.0F, -1.0F, 3, 2, 3, 0.0F, false));

        this.Antenna_L = new AdvancedModelRenderer(this);
        this.Antenna_L.setRotationPoint(2.1F, -1.8F, 1.4F);
        this.Main_Body.addChild(Antenna_L);


        this.cube_r3 = new AdvancedModelRenderer(this);
        this.cube_r3.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.Antenna_L.addChild(cube_r3);
        this.setRotateAngle(cube_r3, -1.309F, -1.501F, 1.6755F);
        this.cube_r3.cubeList.add(new ModelBox(cube_r3, 7, 5, 0.0F, 0.0F, -1.0F, 4, 0, 2, 0.0F, false));

        this.Antenna_R = new AdvancedModelRenderer(this);
        this.Antenna_R.setRotationPoint(-2.1F, -1.8F, 1.4F);
        this.Main_Body.addChild(Antenna_R);


        this.cube_r4 = new AdvancedModelRenderer(this);
        this.cube_r4.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.Antenna_R.addChild(cube_r4);
        this.setRotateAngle(cube_r4, -1.309F, 1.501F, -1.6755F);
        this.cube_r4.cubeList.add(new ModelBox(cube_r4, 7, 13, -4.0F, 0.0F, -1.0F, 4, 0, 2, 0.0F, false));

        this.Valve_L = new AdvancedModelRenderer(this);
        this.Valve_L.setRotationPoint(0.2F, -5.0F, -8.5F);
        this.Main_Body.addChild(Valve_L);


        this.cube_r5 = new AdvancedModelRenderer(this);
        this.cube_r5.setRotationPoint(8.3F, 2.2F, -2.0F);
        this.Valve_L.addChild(cube_r5);
        this.setRotateAngle(cube_r5, 0.0F, 0.0F, -0.2443F);
        this.cube_r5.cubeList.add(new ModelBox(cube_r5, 14, 25, 0.0F, 0.0F, -11.0F, 7, 0, 25, 0.0F, false));

        this.cube_r6 = new AdvancedModelRenderer(this);
        this.cube_r6.setRotationPoint(11.1F, 6.2F, 1.0F);
        this.Valve_L.addChild(cube_r6);
        this.setRotateAngle(cube_r6, 0.0F, 0.0F, 0.0873F);
        this.cube_r6.cubeList.add(new ModelBox(cube_r6, 0, 39, 0.0697F, -0.0181F, -14.0F, 0, 4, 25, 0.0F, false));

        this.cube_r7 = new AdvancedModelRenderer(this);
        this.cube_r7.setRotationPoint(13.1F, 7.4F, -3.0F);
        this.Valve_L.addChild(cube_r7);
        this.setRotateAngle(cube_r7, 0.0F, 0.0F, -0.5672F);
        this.cube_r7.cubeList.add(new ModelBox(cube_r7, 0, 30, -1.0F, -7.0F, -10.0F, 0, 5, 25, 0.0F, false));

        this.cube_r8 = new AdvancedModelRenderer(this);
        this.cube_r8.setRotationPoint(-0.2F, 0.5F, -2.0F);
        this.Valve_L.addChild(cube_r8);
        this.setRotateAngle(cube_r8, 0.0F, 0.0F, 0.2182F);
        this.cube_r8.cubeList.add(new ModelBox(cube_r8, 18, 0, -0.0603F, -0.342F, -11.0F, 9, 0, 25, 0.0F, false));

        this.Valve_R = new AdvancedModelRenderer(this);
        this.Valve_R.setRotationPoint(-0.2F, -5.0F, -8.5F);
        this.Main_Body.addChild(Valve_R);


        this.cube_r9 = new AdvancedModelRenderer(this);
        this.cube_r9.setRotationPoint(-8.3F, 2.2F, -2.0F);
        this.Valve_R.addChild(cube_r9);
        this.setRotateAngle(cube_r9, 0.0F, 0.0F, 0.2443F);
        this.cube_r9.cubeList.add(new ModelBox(cube_r9, 0, 25, -7.0F, 0.0F, -11.0F, 7, 0, 25, 0.0F, false));

        this.cube_r10 = new AdvancedModelRenderer(this);
        this.cube_r10.setRotationPoint(-11.1F, 6.2F, 1.0F);
        this.Valve_R.addChild(cube_r10);
        this.setRotateAngle(cube_r10, 0.0F, 0.0F, -0.0873F);
        this.cube_r10.cubeList.add(new ModelBox(cube_r10, 0, 35, -0.0697F, -0.0181F, -14.0F, 0, 4, 25, 0.0F, false));

        this.cube_r11 = new AdvancedModelRenderer(this);
        this.cube_r11.setRotationPoint(-13.1F, 7.4F, -3.0F);
        this.Valve_R.addChild(cube_r11);
        this.setRotateAngle(cube_r11, 0.0F, 0.0F, 0.5672F);
        this.cube_r11.cubeList.add(new ModelBox(cube_r11, 0, 25, 1.0F, -7.0F, -10.0F, 0, 5, 25, 0.0F, false));

        this.cube_r12 = new AdvancedModelRenderer(this);
        this.cube_r12.setRotationPoint(0.2F, 0.5F, -2.0F);
        this.Valve_R.addChild(cube_r12);
        this.setRotateAngle(cube_r12, 0.0F, 0.0F, -0.2182F);
        this.cube_r12.cubeList.add(new ModelBox(cube_r12, 0, 0, -8.9397F, -0.342F, -11.0F, 9, 0, 25, 0.0F, false));

        this.Eye_R = new AdvancedModelRenderer(this);
        this.Eye_R.setRotationPoint(-2.6F, -2.0F, 1.9F);
        this.Main_Body.addChild(Eye_R);


        this.cube_r13 = new AdvancedModelRenderer(this);
        this.cube_r13.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.Eye_R.addChild(cube_r13);
        this.setRotateAngle(cube_r13, 0.0F, 0.2793F, 0.384F);
        this.cube_r13.cubeList.add(new ModelBox(cube_r13, 69, 6, -1.0F, -2.0F, -1.0F, 1, 2, 2, 0.0F, false));

        this.cube_r14 = new AdvancedModelRenderer(this);
        this.cube_r14.setRotationPoint(1.0F, -0.1F, 0.4F);
        this.Eye_R.addChild(cube_r14);
        this.setRotateAngle(cube_r14, 0.0F, 0.3491F, 0.3142F);
        this.cube_r14.cubeList.add(new ModelBox(cube_r14, 69, 25, -1.0F, -1.0F, -1.0F, 2, 1, 1, 0.0F, false));

        this.Eye_L = new AdvancedModelRenderer(this);
        this.Eye_L.setRotationPoint(2.6F, -2.0F, 1.9F);
        this.Main_Body.addChild(Eye_L);


        this.cube_r15 = new AdvancedModelRenderer(this);
        this.cube_r15.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.Eye_L.addChild(cube_r15);
        this.setRotateAngle(cube_r15, 0.0F, -0.2793F, -0.384F);
        this.cube_r15.cubeList.add(new ModelBox(cube_r15, 67, 28, 0.0F, -2.0F, -1.0F, 1, 2, 2, 0.0F, false));

        this.cube_r16 = new AdvancedModelRenderer(this);
        this.cube_r16.setRotationPoint(-1.0F, -0.1F, 0.4F);
        this.Eye_L.addChild(cube_r16);
        this.setRotateAngle(cube_r16, 0.0F, -0.3491F, -0.3142F);
        this.cube_r16.cubeList.add(new ModelBox(cube_r16, 0, 11, -1.0F, -1.0F, -1.0F, 2, 1, 1, 0.0F, false));

        this.Tail = new AdvancedModelRenderer(this);
        this.Tail.setRotationPoint(0.0F, -2.5F, -18.5F);
        this.Main_Body.addChild(Tail);
        this.Tail.cubeList.add(new ModelBox(Tail, 0, 5, -1.5F, -0.7F, -3.0F, 3, 3, 3, 0.0F, false));
        this.Tail.cubeList.add(new ModelBox(Tail, 0, 0, -4.0F, 0.0F, -6.0F, 8, 0, 5, 0.0F, false));

        this.Leg_1_R = new AdvancedModelRenderer(this);
        this.Leg_1_R.setRotationPoint(-1.2F, -1.8F, -1.0F);
        this.Main_Body.addChild(Leg_1_R);
        this.setRotateAngle(Leg_1_R, 0.7505F, 0.0F, 0.0F);


        this.cube_r17 = new AdvancedModelRenderer(this);
        this.cube_r17.setRotationPoint(-0.8F, 0.9447F, -1.1326F);
        this.Leg_1_R.addChild(cube_r17);
        this.setRotateAngle(cube_r17, 0.0F, 0.0F, 0.5061F);
        this.cube_r17.cubeList.add(new ModelBox(cube_r17, 17, 5, -2.0F, -1.0F, 1.0F, 3, 6, 0, 0.0F, false));

        this.Leg_1_L = new AdvancedModelRenderer(this);
        this.Leg_1_L.setRotationPoint(1.2F, -1.8F, -1.0F);
        this.Main_Body.addChild(Leg_1_L);
        this.setRotateAngle(Leg_1_L, 0.7505F, 0.0F, 0.0F);


        this.cube_r18 = new AdvancedModelRenderer(this);
        this.cube_r18.setRotationPoint(0.8F, 0.9447F, -1.1326F);
        this.Leg_1_L.addChild(cube_r18);
        this.setRotateAngle(cube_r18, 0.0F, 0.0F, -0.5061F);
        this.cube_r18.cubeList.add(new ModelBox(cube_r18, 12, 15, -1.0F, -1.0F, 1.0F, 3, 6, 0, 0.0F, false));

        this.Leg_2_R = new AdvancedModelRenderer(this);
        this.Leg_2_R.setRotationPoint(-2.2F, -0.1F, -1.2F);
        this.Main_Body.addChild(Leg_2_R);
        this.setRotateAngle(Leg_2_R, 0.5061F, 0.0F, 0.0F);


        this.cube_r19 = new AdvancedModelRenderer(this);
        this.cube_r19.setRotationPoint(0.2F, -0.3254F, -0.9848F);
        this.Leg_2_R.addChild(cube_r19);
        this.setRotateAngle(cube_r19, 0.0F, 0.0F, 0.5061F);
        this.cube_r19.cubeList.add(new ModelBox(cube_r19, 6, 45, -2.0F, 0.0F, 1.0F, 3, 5, 0, 0.0F, false));

        this.Leg_2_L = new AdvancedModelRenderer(this);
        this.Leg_2_L.setRotationPoint(2.2F, -0.1F, -1.2F);
        this.Main_Body.addChild(Leg_2_L);
        this.setRotateAngle(Leg_2_L, 0.5061F, 0.0F, 0.0F);


        this.cube_r20 = new AdvancedModelRenderer(this);
        this.cube_r20.setRotationPoint(-0.2F, -0.3254F, -0.9848F);
        this.Leg_2_L.addChild(cube_r20);
        this.setRotateAngle(cube_r20, 0.0F, 0.0F, -0.5061F);
        this.cube_r20.cubeList.add(new ModelBox(cube_r20, 14, 40, -1.0F, 0.0F, 1.0F, 3, 5, 0, 0.0F, false));

        this.Leg_3_R = new AdvancedModelRenderer(this);
        this.Leg_3_R.setRotationPoint(-2.2F, -0.1F, -2.3F);
        this.Main_Body.addChild(Leg_3_R);
        this.setRotateAngle(Leg_3_R, 0.0349F, 0.0F, 0.0F);


        this.cube_r21 = new AdvancedModelRenderer(this);
        this.cube_r21.setRotationPoint(-2.0F, 2.5778F, -0.9694F);
        this.Leg_3_R.addChild(cube_r21);
        this.setRotateAngle(cube_r21, -0.1705F, 0.0376F, 0.9131F);
        this.cube_r21.cubeList.add(new ModelBox(cube_r21, 12, 43, -1.0F, -2.0F, -1.0F, 0, 5, 2, 0.0F, false));

        this.cube_r22 = new AdvancedModelRenderer(this);
        this.cube_r22.setRotationPoint(0.2F, 1.1778F, -0.9694F);
        this.Leg_3_R.addChild(cube_r22);
        this.setRotateAngle(cube_r22, 0.0F, 0.0F, 0.5061F);
        this.cube_r22.cubeList.add(new ModelBox(cube_r22, 28, 70, -2.0F, -1.0F, 1.0F, 2, 5, 0, 0.0F, false));

        this.Leg_3_L = new AdvancedModelRenderer(this);
        this.Leg_3_L.setRotationPoint(2.2F, -0.1F, -2.3F);
        this.Main_Body.addChild(Leg_3_L);
        this.setRotateAngle(Leg_3_L, 0.0349F, 0.0F, 0.0F);


        this.cube_r23 = new AdvancedModelRenderer(this);
        this.cube_r23.setRotationPoint(2.0F, 2.5778F, -0.9694F);
        this.Leg_3_L.addChild(cube_r23);
        this.setRotateAngle(cube_r23, -0.1705F, -0.0376F, -0.9131F);
        this.cube_r23.cubeList.add(new ModelBox(cube_r23, 16, 33, 1.0F, -2.0F, -1.0F, 0, 5, 2, 0.0F, false));

        this.cube_r24 = new AdvancedModelRenderer(this);
        this.cube_r24.setRotationPoint(-0.2F, 1.1778F, -0.9694F);
        this.Leg_3_L.addChild(cube_r24);
        this.setRotateAngle(cube_r24, 0.0F, 0.0F, -0.5061F);
        this.cube_r24.cubeList.add(new ModelBox(cube_r24, 69, 20, 0.0F, -1.0F, 1.0F, 2, 5, 0, 0.0F, false));

        this.Leg_4_R = new AdvancedModelRenderer(this);
        this.Leg_4_R.setRotationPoint(-2.2F, 1.1F, -4.4F);
        this.Main_Body.addChild(Leg_4_R);
        this.setRotateAngle(Leg_4_R, 0.0175F, 0.0F, 0.0F);


        this.cube_r25 = new AdvancedModelRenderer(this);
        this.cube_r25.setRotationPoint(-2.0F, 1.8927F, -0.4348F);
        this.Leg_4_R.addChild(cube_r25);
        this.setRotateAngle(cube_r25, -0.1719F, 0.0302F, 0.8701F);
        this.cube_r25.cubeList.add(new ModelBox(cube_r25, 12, 24, -1.0F, -2.0F, -1.0F, 0, 5, 2, 0.0F, false));

        this.cube_r26 = new AdvancedModelRenderer(this);
        this.cube_r26.setRotationPoint(0.2F, -0.2073F, -0.9348F);
        this.Leg_4_R.addChild(cube_r26);
        this.setRotateAngle(cube_r26, 0.0524F, 0.0F, 0.5061F);
        this.cube_r26.cubeList.add(new ModelBox(cube_r26, 62, 67, -2.0F, 0.0F, 1.0F, 2, 6, 0, 0.0F, false));

        this.Leg_4_L = new AdvancedModelRenderer(this);
        this.Leg_4_L.setRotationPoint(2.2F, 1.1F, -4.4F);
        this.Main_Body.addChild(Leg_4_L);
        this.setRotateAngle(Leg_4_L, 0.0175F, 0.0F, 0.0F);


        this.cube_r27 = new AdvancedModelRenderer(this);
        this.cube_r27.setRotationPoint(2.0F, 1.8927F, -0.4348F);
        this.Leg_4_L.addChild(cube_r27);
        this.setRotateAngle(cube_r27, -0.1719F, -0.0302F, -0.8701F);
        this.cube_r27.cubeList.add(new ModelBox(cube_r27, 16, 21, 1.0F, -2.0F, -1.0F, 0, 5, 2, 0.0F, false));

        this.cube_r28 = new AdvancedModelRenderer(this);
        this.cube_r28.setRotationPoint(-0.2F, -0.2073F, -0.9348F);
        this.Leg_4_L.addChild(cube_r28);
        this.setRotateAngle(cube_r28, 0.0524F, 0.0F, -0.5061F);
        this.cube_r28.cubeList.add(new ModelBox(cube_r28, 65, 0, 0.0F, 0.0F, 1.0F, 2, 6, 0, 0.0F, false));

        this.Leg_5_R = new AdvancedModelRenderer(this);
        this.Leg_5_R.setRotationPoint(-2.2F, 0.1F, -5.8F);
        this.Main_Body.addChild(Leg_5_R);


        this.cube_r29 = new AdvancedModelRenderer(this);
        this.cube_r29.setRotationPoint(-2.0F, 3.2F, -0.4F);
        this.Leg_5_R.addChild(cube_r29);
        this.setRotateAngle(cube_r29, -0.1705F, 0.0376F, 0.9131F);
        this.cube_r29.cubeList.add(new ModelBox(cube_r29, 54, 60, -1.0F, -2.0F, -1.0F, 0, 5, 2, 0.0F, false));

        this.cube_r30 = new AdvancedModelRenderer(this);
        this.cube_r30.setRotationPoint(0.2F, 0.8F, -0.9F);
        this.Leg_5_R.addChild(cube_r30);
        this.setRotateAngle(cube_r30, 0.0F, 0.0F, 0.5061F);
        this.cube_r30.cubeList.add(new ModelBox(cube_r30, 57, 25, -2.0F, -1.0F, 1.0F, 2, 7, 0, 0.0F, false));

        this.Leg_5_L = new AdvancedModelRenderer(this);
        this.Leg_5_L.setRotationPoint(2.2F, 0.1F, -5.7F);
        this.Main_Body.addChild(Leg_5_L);


        this.cube_r31 = new AdvancedModelRenderer(this);
        this.cube_r31.setRotationPoint(2.0F, 3.2F, -0.5F);
        this.Leg_5_L.addChild(cube_r31);
        this.setRotateAngle(cube_r31, -0.1705F, -0.0376F, -0.9131F);
        this.cube_r31.cubeList.add(new ModelBox(cube_r31, 58, 53, 1.0F, -2.0F, -1.0F, 0, 5, 2, 0.0F, false));

        this.cube_r32 = new AdvancedModelRenderer(this);
        this.cube_r32.setRotationPoint(-0.2F, 0.8F, -1.0F);
        this.Leg_5_L.addChild(cube_r32);
        this.setRotateAngle(cube_r32, 0.0F, 0.0F, -0.5061F);
        this.cube_r32.cubeList.add(new ModelBox(cube_r32, 4, 35, 0.0F, -1.0F, 1.0F, 2, 7, 0, 0.0F, false));

        this.Leg_6_R = new AdvancedModelRenderer(this);
        this.Leg_6_R.setRotationPoint(-2.2F, 0.1F, -8.0F);
        this.Main_Body.addChild(Leg_6_R);


        this.cube_r33 = new AdvancedModelRenderer(this);
        this.cube_r33.setRotationPoint(-2.0F, 3.5F, -0.5F);
        this.Leg_6_R.addChild(cube_r33);
        this.setRotateAngle(cube_r33, -0.1687F, 0.045F, 0.9561F);
        this.cube_r33.cubeList.add(new ModelBox(cube_r33, 61, 0, -1.0F, -2.0F, -1.0F, 0, 5, 2, 0.0F, false));

        this.cube_r34 = new AdvancedModelRenderer(this);
        this.cube_r34.setRotationPoint(0.2F, 0.8F, -1.0F);
        this.Leg_6_R.addChild(cube_r34);
        this.setRotateAngle(cube_r34, 0.0F, 0.0F, 0.5061F);
        this.cube_r34.cubeList.add(new ModelBox(cube_r34, 57, 32, -2.0F, -1.0F, 1.0F, 2, 7, 0, 0.0F, false));

        this.Leg_6_L = new AdvancedModelRenderer(this);
        this.Leg_6_L.setRotationPoint(2.2F, 1.1F, -8.1F);
        this.Main_Body.addChild(Leg_6_L);


        this.cube_r35 = new AdvancedModelRenderer(this);
        this.cube_r35.setRotationPoint(2.0F, 2.5F, -0.4F);
        this.Leg_6_L.addChild(cube_r35);
        this.setRotateAngle(cube_r35, -0.1687F, -0.045F, -0.9561F);
        this.cube_r35.cubeList.add(new ModelBox(cube_r35, 57, 37, 1.0F, -2.0F, -1.0F, 0, 5, 2, 0.0F, false));

        this.cube_r36 = new AdvancedModelRenderer(this);
        this.cube_r36.setRotationPoint(-0.2F, -0.2F, -0.9F);
        this.Leg_6_L.addChild(cube_r36);
        this.setRotateAngle(cube_r36, 0.0F, 0.0F, -0.5061F);
        this.cube_r36.cubeList.add(new ModelBox(cube_r36, 12, 31, 0.0F, -1.0F, 1.0F, 2, 7, 0, 0.0F, false));

        this.Leg_7_R = new AdvancedModelRenderer(this);
        this.Leg_7_R.setRotationPoint(-2.2F, 0.1F, -10.0F);
        this.Main_Body.addChild(Leg_7_R);


        this.cube_r37 = new AdvancedModelRenderer(this);
        this.cube_r37.setRotationPoint(-2.0F, 3.3F, -0.5F);
        this.Leg_7_R.addChild(cube_r37);
        this.setRotateAngle(cube_r37, -0.1687F, 0.045F, 0.9561F);
        this.cube_r37.cubeList.add(new ModelBox(cube_r37, 4, 21, -1.0F, -2.0F, -1.0F, 0, 5, 2, 0.0F, false));

        this.cube_r38 = new AdvancedModelRenderer(this);
        this.cube_r38.setRotationPoint(0.2F, 0.8F, -1.0F);
        this.Leg_7_R.addChild(cube_r38);
        this.setRotateAngle(cube_r38, 0.0F, 0.0F, 0.5061F);
        this.cube_r38.cubeList.add(new ModelBox(cube_r38, 54, 55, -2.0F, -1.0F, 1.0F, 2, 7, 0, 0.0F, false));

        this.Leg_7_L = new AdvancedModelRenderer(this);
        this.Leg_7_L.setRotationPoint(2.2F, 0.1F, -10.0F);
        this.Main_Body.addChild(Leg_7_L);


        this.cube_r39 = new AdvancedModelRenderer(this);
        this.cube_r39.setRotationPoint(2.0F, 3.3F, -0.5F);
        this.Leg_7_L.addChild(cube_r39);
        this.setRotateAngle(cube_r39, -0.1687F, -0.045F, -0.9561F);
        this.cube_r39.cubeList.add(new ModelBox(cube_r39, 12, 19, 1.0F, -2.0F, -1.0F, 0, 5, 2, 0.0F, false));

        this.cube_r40 = new AdvancedModelRenderer(this);
        this.cube_r40.setRotationPoint(-0.2F, 0.8F, -1.0F);
        this.Leg_7_L.addChild(cube_r40);
        this.setRotateAngle(cube_r40, 0.0F, 0.0F, -0.5061F);
        this.cube_r40.cubeList.add(new ModelBox(cube_r40, 16, 28, 0.0F, -1.0F, 1.0F, 2, 7, 0, 0.0F, false));

        this.Leg_8_R = new AdvancedModelRenderer(this);
        this.Leg_8_R.setRotationPoint(-2.2F, 0.1F, -12.0F);
        this.Main_Body.addChild(Leg_8_R);


        this.cube_r41 = new AdvancedModelRenderer(this);
        this.cube_r41.setRotationPoint(-2.0F, 3.0F, -0.4F);
        this.Leg_8_R.addChild(cube_r41);
        this.setRotateAngle(cube_r41, -0.1687F, 0.045F, 0.9561F);
        this.cube_r41.cubeList.add(new ModelBox(cube_r41, 18, 11, -1.0F, -2.0F, -1.0F, 0, 5, 2, 0.0F, false));

        this.cube_r42 = new AdvancedModelRenderer(this);
        this.cube_r42.setRotationPoint(0.2F, 0.8F, -0.9F);
        this.Leg_8_R.addChild(cube_r42);
        this.setRotateAngle(cube_r42, 0.0F, 0.0F, 0.5061F);
        this.cube_r42.cubeList.add(new ModelBox(cube_r42, 50, 55, -2.0F, -1.0F, 1.0F, 2, 7, 0, 0.0F, false));

        this.Leg_8_L = new AdvancedModelRenderer(this);
        this.Leg_8_L.setRotationPoint(2.2F, 0.1F, -11.9F);
        this.Main_Body.addChild(Leg_8_L);


        this.cube_r43 = new AdvancedModelRenderer(this);
        this.cube_r43.setRotationPoint(2.0F, 3.0F, -0.5F);
        this.Leg_8_L.addChild(cube_r43);
        this.setRotateAngle(cube_r43, -0.1687F, -0.045F, -0.9561F);
        this.cube_r43.cubeList.add(new ModelBox(cube_r43, 4, 16, 1.0F, -2.0F, -1.0F, 0, 5, 2, 0.0F, false));

        this.cube_r44 = new AdvancedModelRenderer(this);
        this.cube_r44.setRotationPoint(-0.2F, 0.8F, -1.0F);
        this.Leg_8_L.addChild(cube_r44);
        this.setRotateAngle(cube_r44, 0.0F, 0.0F, -0.5061F);
        this.cube_r44.cubeList.add(new ModelBox(cube_r44, 4, 28, 0.0F, -1.0F, 1.0F, 2, 7, 0, 0.0F, false));

        this.Leg_9_R = new AdvancedModelRenderer(this);
        this.Leg_9_R.setRotationPoint(-2.2F, 0.7F, -13.0F);
        this.Main_Body.addChild(Leg_9_R);
        this.setRotateAngle(Leg_9_R, -0.2793F, 0.0F, 0.0F);


        this.cube_r45 = new AdvancedModelRenderer(this);
        this.cube_r45.setRotationPoint(-2.0F, 2.2369F, -1.0856F);
        this.Leg_9_R.addChild(cube_r45);
        this.setRotateAngle(cube_r45, -0.1731F, 0.0227F, 0.8271F);
        this.cube_r45.cubeList.add(new ModelBox(cube_r45, 66, 65, -1.0F, -2.0F, -1.0F, 0, 4, 2, 0.0F, false));

        this.cube_r46 = new AdvancedModelRenderer(this);
        this.cube_r46.setRotationPoint(0.2F, 0.0369F, -1.1856F);
        this.Leg_9_R.addChild(cube_r46);
        this.setRotateAngle(cube_r46, 0.0F, 0.0F, 0.5061F);
        this.cube_r46.cubeList.add(new ModelBox(cube_r46, 69, 0, -2.0F, 0.0F, 1.0F, 2, 6, 0, 0.0F, false));

        this.Leg_9_L = new AdvancedModelRenderer(this);
        this.Leg_9_L.setRotationPoint(2.2F, 0.7F, -13.0F);
        this.Main_Body.addChild(Leg_9_L);
        this.setRotateAngle(Leg_9_L, -0.2793F, 0.0F, 0.0F);


        this.cube_r47 = new AdvancedModelRenderer(this);
        this.cube_r47.setRotationPoint(2.0F, 2.2369F, -1.0856F);
        this.Leg_9_L.addChild(cube_r47);
        this.setRotateAngle(cube_r47, -0.1731F, -0.0227F, -0.8271F);
        this.cube_r47.cubeList.add(new ModelBox(cube_r47, 61, 43, 1.0F, -2.0F, -1.0F, 0, 4, 2, 0.0F, false));

        this.cube_r48 = new AdvancedModelRenderer(this);
        this.cube_r48.setRotationPoint(-0.2F, 0.0369F, -1.1856F);
        this.Leg_9_L.addChild(cube_r48);
        this.setRotateAngle(cube_r48, 0.0F, 0.0F, -0.5061F);
        this.cube_r48.cubeList.add(new ModelBox(cube_r48, 62, 55, 0.0F, 0.0F, 1.0F, 2, 6, 0, 0.0F, false));

        this.Leg_10_R = new AdvancedModelRenderer(this);
        this.Leg_10_R.setRotationPoint(-2.2F, 0.7F, -14.9F);
        this.Main_Body.addChild(Leg_10_R);
        this.setRotateAngle(Leg_10_R, -0.2793F, 0.0F, 0.0F);


        this.cube_r49 = new AdvancedModelRenderer(this);
        this.cube_r49.setRotationPoint(-2.0F, 1.292F, -0.8779F);
        this.Leg_10_R.addChild(cube_r49);
        this.setRotateAngle(cube_r49, -0.1731F, 0.0227F, 0.8271F);
        this.cube_r49.cubeList.add(new ModelBox(cube_r49, 8, 68, -1.0F, -2.0F, -1.0F, 0, 4, 2, 0.0F, false));

        this.cube_r50 = new AdvancedModelRenderer(this);
        this.cube_r50.setRotationPoint(0.2F, 0.092F, -1.3779F);
        this.Leg_10_R.addChild(cube_r50);
        this.setRotateAngle(cube_r50, 0.0F, 0.0F, 0.5061F);
        this.cube_r50.cubeList.add(new ModelBox(cube_r50, 66, 61, -2.0F, -1.0F, 1.0F, 2, 6, 0, 0.0F, false));

        this.Leg_10_L = new AdvancedModelRenderer(this);
        this.Leg_10_L.setRotationPoint(2.2F, -0.3F, -15.1F);
        this.Main_Body.addChild(Leg_10_L);
        this.setRotateAngle(Leg_10_L, -0.2793F, 0.0F, 0.0F);


        this.cube_r51 = new AdvancedModelRenderer(this);
        this.cube_r51.setRotationPoint(2.0F, 2.1982F, -0.41F);
        this.Leg_10_L.addChild(cube_r51);
        this.setRotateAngle(cube_r51, -0.1731F, -0.0227F, -0.8271F);
        this.cube_r51.cubeList.add(new ModelBox(cube_r51, 0, 68, 1.0F, -2.0F, -1.0F, 0, 4, 2, 0.0F, false));

        this.cube_r52 = new AdvancedModelRenderer(this);
        this.cube_r52.setRotationPoint(-0.2F, 0.9982F, -0.91F);
        this.Leg_10_L.addChild(cube_r52);
        this.setRotateAngle(cube_r52, 0.0F, 0.0F, -0.5061F);
        this.cube_r52.cubeList.add(new ModelBox(cube_r52, 61, 29, 0.0F, -1.0F, 1.0F, 2, 6, 0, 0.0F, false));

        this.Leg_11_R = new AdvancedModelRenderer(this);
        this.Leg_11_R.setRotationPoint(-2.2F, -0.3F, -16.7F);
        this.Main_Body.addChild(Leg_11_R);
        this.setRotateAngle(Leg_11_R, -0.4887F, 0.0F, 0.0F);


        this.cube_r53 = new AdvancedModelRenderer(this);
        this.cube_r53.setRotationPoint(-2.0F, 1.3524F, -0.4135F);
        this.Leg_11_R.addChild(cube_r53);
        this.setRotateAngle(cube_r53, -0.1719F, 0.0302F, 0.8701F);
        this.cube_r53.cubeList.add(new ModelBox(cube_r53, 54, 65, -1.0F, -2.0F, -1.0F, 0, 4, 2, 0.0F, false));

        this.cube_r54 = new AdvancedModelRenderer(this);
        this.cube_r54.setRotationPoint(0.2F, 0.1524F, -0.9135F);
        this.Leg_11_R.addChild(cube_r54);
        this.setRotateAngle(cube_r54, 0.0F, 0.0F, 0.5061F);
        this.cube_r54.cubeList.add(new ModelBox(cube_r54, 66, 55, -2.0F, -1.0F, 1.0F, 2, 6, 0, 0.0F, false));

        this.Leg_11_L = new AdvancedModelRenderer(this);
        this.Leg_11_L.setRotationPoint(2.2F, -0.3F, -17.7F);
        this.Main_Body.addChild(Leg_11_L);
        this.setRotateAngle(Leg_11_L, -0.4887F, 0.0F, 0.0F);


        this.cube_r55 = new AdvancedModelRenderer(this);
        this.cube_r55.setRotationPoint(2.0F, 0.8829F, 0.4695F);
        this.Leg_11_L.addChild(cube_r55);
        this.setRotateAngle(cube_r55, -0.1719F, -0.0302F, -0.8701F);
        this.cube_r55.cubeList.add(new ModelBox(cube_r55, 61, 11, 1.0F, -2.0F, -1.0F, 0, 4, 2, 0.0F, false));

        this.cube_r56 = new AdvancedModelRenderer(this);
        this.cube_r56.setRotationPoint(-0.2F, -0.3171F, -0.0305F);
        this.Leg_11_L.addChild(cube_r56);
        this.setRotateAngle(cube_r56, 0.0F, 0.0F, -0.5061F);
        this.cube_r56.cubeList.add(new ModelBox(cube_r56, 61, 17, 0.0F, -1.0F, 1.0F, 2, 6, 0, 0.0F, false));

        this.Leg_12_R = new AdvancedModelRenderer(this);
        this.Leg_12_R.setRotationPoint(-2.2F, -1.5F, -16.1F);
        this.Main_Body.addChild(Leg_12_R);
        this.setRotateAngle(Leg_12_R, -0.4887F, 0.0F, 0.0F);


        this.cube_r57 = new AdvancedModelRenderer(this);
        this.cube_r57.setRotationPoint(-2.0F, 2.2914F, -2.1794F);
        this.Leg_12_R.addChild(cube_r57);
        this.setRotateAngle(cube_r57, -0.1731F, 0.0227F, 0.8271F);
        this.cube_r57.cubeList.add(new ModelBox(cube_r57, 20, 68, -1.0F, -2.0F, -1.0F, 0, 3, 2, 0.0F, false));

        this.cube_r58 = new AdvancedModelRenderer(this);
        this.cube_r58.setRotationPoint(0.2F, 1.0914F, -2.6794F);
        this.Leg_12_R.addChild(cube_r58);
        this.setRotateAngle(cube_r58, 0.0F, 0.0F, 0.5061F);
        this.cube_r58.cubeList.add(new ModelBox(cube_r58, 24, 70, -2.0F, -1.0F, 1.0F, 2, 5, 0, 0.0F, false));

        this.Leg_12_L = new AdvancedModelRenderer(this);
        this.Leg_12_L.setRotationPoint(2.2F, -1.5F, -18.1F);
        this.Main_Body.addChild(Leg_12_L);
        this.setRotateAngle(Leg_12_L, -0.4887F, 0.0F, 0.0F);


        this.cube_r59 = new AdvancedModelRenderer(this);
        this.cube_r59.setRotationPoint(2.0F, 1.3524F, -0.4135F);
        this.Leg_12_L.addChild(cube_r59);
        this.setRotateAngle(cube_r59, -0.1731F, -0.0227F, -0.8271F);
        this.cube_r59.cubeList.add(new ModelBox(cube_r59, 0, 45, 1.0F, -2.0F, -1.0F, 0, 3, 2, 0.0F, false));

        this.cube_r60 = new AdvancedModelRenderer(this);
        this.cube_r60.setRotationPoint(-0.2F, 0.1524F, -0.9135F);
        this.Leg_12_L.addChild(cube_r60);
        this.setRotateAngle(cube_r60, 0.0F, 0.0F, -0.5061F);
        this.cube_r60.cubeList.add(new ModelBox(cube_r60, 69, 10, 0.0F, -1.0F, 1.0F, 2, 5, 0, 0.0F, false));

        updateDefaultPose();
    }

    @Override
    public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        this.Main_Body.render(f5 );
    }
    public void renderStaticDisplayCase(float f) {
        this.Main_Body.offsetZ = -0.05F;
        this.Main_Body.render(0.01F);
        resetToDefaultPose();
    }
    public void renderStaticFloor(float f) {
        this.Main_Body.rotateAngleY = (float) Math.toRadians(90);
        this.Main_Body.offsetY = -0.32F;
        this.Main_Body.offsetZ = -0.02F;
        this.Main_Body.render(0.01F);
        resetToDefaultPose();
    }
    @Override
    public void renderStaticBook(float f) {
        //Rotations, positions and sizing:
        this.Main_Body.offsetY = -2.0F;
        this.Main_Body.offsetX = -1.338F;
        this.Main_Body.rotateAngleY = (float)Math.toRadians(200);
        this.Main_Body.rotateAngleX = (float)Math.toRadians(8);
        this.Main_Body.rotateAngleZ = (float)Math.toRadians(-8);
        this.Main_Body.scaleChildren = true;
        float scaler = 1.63F;
        this.Main_Body.setScale(scaler, scaler, scaler);
        //Start of pose:

        //End of pose, now render the model:
        this.Main_Body.render(f);
        //Reset rotations, positions and sizing:
        this.Main_Body.setScale(1.0F, 1.0F, 1.0F);
        this.Main_Body.scaleChildren = false;
        resetToDefaultPose();

    }

    public void setRotateAngle(ModelRenderer modelRenderer, float x, float y, float z) {
        modelRenderer.rotateAngleX = x;
        modelRenderer.rotateAngleY = y;
        modelRenderer.rotateAngleZ = z;
    }

    @Override
    public void setRotationAngles(float f, float f1, float f2, float f3, float f4, float f5, Entity e) {
        super.setRotationAngles(f, f1, f2, f3, f4, f5, e);
        this.resetToDefaultPose();

        AdvancedModelRenderer[] Tail = {this.Tail};

        float speed = 0.4F;
        if (!e.isInWater()) {
            speed = 0.7F;
        }
        if (e instanceof EntityLiving && !((EntityLiving) e).isAIDisabled()) {
            this.flap(Antenna_L, 0.3F, -0.2F, true, 0f, 0.2f, f2, 1F);
            this.flap(Antenna_R, 0.3F, 0.2F, true, 0f, -0.2f, f2, 1F);

            this.walk(Antenna_L, 0.3F, 0.15F, false, 2f, 0f, f2, 1F);
            this.walk(Antenna_R, 0.3F, 0.15F, false, 2f, 0f, f2, 1F);

            float tailVdegree = 0.12F;
            float tailHdegree = 0.3F;
            this.chainWave(Tail, speed*0.5F, tailVdegree, 2, f2, 1);


            float speedLeg = 1.1F;
            float degreeLeg = 0.25F;
            this.flap(Leg_1_R, speedLeg, -degreeLeg, false, 0, -0.5F, f2, 0.7F);
            this.flap(Leg_1_L, speedLeg, degreeLeg, false, 0, 0.5F, f2, 0.7F);
            this.flap(Leg_2_R, speedLeg, -degreeLeg, false, 0.5F, -0.5F, f2, 0.7F);
            this.flap(Leg_2_L, speedLeg, degreeLeg, false, 0.5F, 0.5F, f2, 0.7F);
            this.flap(Leg_3_R, speedLeg, -degreeLeg, false, 1.0F, -0.5F, f2, 0.7F);
            this.flap(Leg_3_L, speedLeg, degreeLeg, false, 1.0F, 0.5F, f2, 0.7F);
            this.flap(Leg_4_R, speedLeg, -degreeLeg, false, 1.5F, -0.5F, f2, 0.7F);
            this.flap(Leg_4_L, speedLeg, degreeLeg, false, 1.5F, 0.5F, f2, 0.7F);
            this.flap(Leg_5_R, speedLeg, -degreeLeg, false, 2.0F, -0.5F, f2, 0.7F);
            this.flap(Leg_5_L, speedLeg, degreeLeg, false, 2.0F, 0.5F, f2, 0.7F);
            this.flap(Leg_6_R, speedLeg, -degreeLeg, false, 2.5F, -0.5F, f2, 0.7F);
            this.flap(Leg_6_L, speedLeg, degreeLeg, false, 2.5F, 0.5F, f2, 0.7F);
            this.flap(Leg_7_R, speedLeg, -degreeLeg, false, 3.0F, -0.5F, f2, 0.7F);
            this.flap(Leg_7_L, speedLeg, degreeLeg, false, 3.0F, 0.5F, f2, 0.7F);
            this.flap(Leg_8_R, speedLeg, -degreeLeg, false, 3.5F, -0.5F, f2, 0.7F);
            this.flap(Leg_8_L, speedLeg, degreeLeg, false, 3.5F, 0.5F, f2, 0.7F);
            this.flap(Leg_9_R, speedLeg, -degreeLeg, false, 4.0F, -0.5F, f2, 0.7F);
            this.flap(Leg_9_L, speedLeg, degreeLeg, false, 4.0F, 0.5F, f2, 0.7F);
            this.flap(Leg_10_R, speedLeg, -degreeLeg, false, 4.5F, -0.5F, f2, 0.7F);
            this.flap(Leg_10_L, speedLeg, degreeLeg, false, 4.5F, 0.5F, f2, 0.7F);
            this.flap(Leg_11_R, speedLeg, -degreeLeg, false, 5.0F, -0.5F, f2, 0.7F);
            this.flap(Leg_11_L, speedLeg, degreeLeg, false, 5.0F, 0.5F, f2, 0.7F);
            this.flap(Leg_12_R, speedLeg, -degreeLeg, false, 5.5F, -0.5F, f2, 0.7F);
            this.flap(Leg_12_L, speedLeg, degreeLeg, false, 5.5F, 0.5F, f2, 0.7F);
            if (!e.isInWater()) {
                //this.Main_Body.offsetY = 0.4F;
//                this.Main_Body.rotateAngleZ = (float) Math.toRadians(90);
            }


                if (f3 == 0.0F) {
                    this.bob(Main_Body, -speed, 0.3F, false, f2, 2);

                }
                else
                {
                    this.bob(Main_Body, -speed, 1F, false, f2, 2);
                }

        }
    }
}
