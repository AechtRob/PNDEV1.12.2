package net.lepidodendron.entity.model.entity;

import net.ilexiconn.llibrary.client.model.ModelAnimator;
import net.ilexiconn.llibrary.client.model.tools.AdvancedModelRenderer;
import net.ilexiconn.llibrary.server.animation.IAnimatedEntity;
import net.lepidodendron.entity.EntityPrehistoricFloraAragochersis;
import net.lepidodendron.entity.model.ModelBasePalaeopedia;
import net.minecraft.client.model.ModelBox;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;

public class ModelAragochersis extends ModelBasePalaeopedia {
    private final AdvancedModelRenderer main;
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
    private final AdvancedModelRenderer cube_r12;
    private final AdvancedModelRenderer cube_r13;
    private final AdvancedModelRenderer cube_r14;
    private final AdvancedModelRenderer cube_r15;
    private final AdvancedModelRenderer cube_r16;
    private final AdvancedModelRenderer cube_r17;
    private final AdvancedModelRenderer cube_r18;
    private final AdvancedModelRenderer cube_r19;
    private final AdvancedModelRenderer cube_r20;
    private final AdvancedModelRenderer cube_r21;
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
    private final AdvancedModelRenderer cube_r34;
    private final AdvancedModelRenderer cube_r35;
    private final AdvancedModelRenderer cube_r36;
    private final AdvancedModelRenderer cube_r37;
    private final AdvancedModelRenderer cube_r38;
    private final AdvancedModelRenderer cube_r39;
    private final AdvancedModelRenderer cube_r40;
    private final AdvancedModelRenderer cube_r41;
    private final AdvancedModelRenderer neck;
    private final AdvancedModelRenderer head;
    private final AdvancedModelRenderer cube_r42;
    private final AdvancedModelRenderer cube_r43;
    private final AdvancedModelRenderer cube_r44;
    private final AdvancedModelRenderer eye1;
    private final AdvancedModelRenderer cube_r45;
    private final AdvancedModelRenderer eye2;
    private final AdvancedModelRenderer cube_r46;
    private final AdvancedModelRenderer jaw;
    private final AdvancedModelRenderer cube_r47;
    private final AdvancedModelRenderer cube_r48;
    private final AdvancedModelRenderer frontleftleg;
    private final AdvancedModelRenderer frontleftleg2;
    private final AdvancedModelRenderer frontleftleg3;
    private final AdvancedModelRenderer frontrightleg;
    private final AdvancedModelRenderer frontrightleg2;
    private final AdvancedModelRenderer frontrightleg3;
    private final AdvancedModelRenderer backleftleg;
    private final AdvancedModelRenderer backleftleg2;
    private final AdvancedModelRenderer backleftleg3;
    private final AdvancedModelRenderer backrightleg;
    private final AdvancedModelRenderer backrightleg2;
    private final AdvancedModelRenderer backrightleg3;
    private final AdvancedModelRenderer tail;
    private final AdvancedModelRenderer tail2;
    private final AdvancedModelRenderer tail3;

    private ModelAnimator animator;

    public ModelAragochersis() {
        this.textureWidth = 103;
        this.textureHeight = 103;

        this.main = new AdvancedModelRenderer(this);
        this.main.setRotationPoint(0.0F, 19.0F, 5.0F);
        this.main.cubeList.add(new ModelBox(main, 0, 29, -3.5F, -7.9472F, -9.0981F, 7, 2, 10, 0.0F, false));
        this.main.cubeList.add(new ModelBox(main, 0, 0, -4.5F, -2.8472F, -9.3981F, 9, 5, 10, 0.0F, false));

        this.cube_r1 = new AdvancedModelRenderer(this);
        this.cube_r1.setRotationPoint(-0.5F, -4.7149F, 7.111F);
        this.main.addChild(cube_r1);
        this.setRotateAngle(cube_r1, -0.829F, 0.0F, 0.0F);
        this.cube_r1.cubeList.add(new ModelBox(cube_r1, 71, 73, -3.0F, 0.0F, 0.0F, 7, 2, 4, -0.002F, false));

        this.cube_r2 = new AdvancedModelRenderer(this);
        this.cube_r2.setRotationPoint(-0.5F, -7.9472F, 0.9019F);
        this.main.addChild(cube_r2);
        this.setRotateAngle(cube_r2, -0.48F, 0.0F, 0.0F);
        this.cube_r2.cubeList.add(new ModelBox(cube_r2, 29, 44, -3.0F, 0.0F, 0.0F, 7, 2, 7, 0.0F, false));

        this.cube_r3 = new AdvancedModelRenderer(this);
        this.cube_r3.setRotationPoint(-0.5F, -7.9472F, -9.0981F);
        this.main.addChild(cube_r3);
        this.setRotateAngle(cube_r3, 0.6109F, 0.0F, 0.0F);
        this.cube_r3.cubeList.add(new ModelBox(cube_r3, 39, 0, -3.0F, 0.0F, -9.0F, 7, 2, 9, 0.0F, false));

        this.cube_r4 = new AdvancedModelRenderer(this);
        this.cube_r4.setRotationPoint(-3.2503F, -2.6944F, 10.3361F);
        this.main.addChild(cube_r4);
        this.setRotateAngle(cube_r4, -2.9147F, 0.163F, 3.1367F);
        this.cube_r4.cubeList.add(new ModelBox(cube_r4, 23, 77, -3.0F, 0.0F, 0.0F, 3, 2, 6, 0.002F, true));

        this.cube_r5 = new AdvancedModelRenderer(this);
        this.cube_r5.setRotationPoint(-6.7612F, -2.9776F, 8.4404F);
        this.main.addChild(cube_r5);
        this.setRotateAngle(cube_r5, -2.8868F, 0.4937F, -3.0611F);
        this.cube_r5.cubeList.add(new ModelBox(cube_r5, 50, 73, -4.0F, 0.0F, 0.0F, 4, 2, 6, 0.0F, true));

        this.cube_r6 = new AdvancedModelRenderer(this);
        this.cube_r6.setRotationPoint(-8.7484F, -3.5168F, 6.2586F);
        this.main.addChild(cube_r6);
        this.setRotateAngle(cube_r6, -2.7806F, 0.8143F, -2.8767F);
        this.cube_r6.cubeList.add(new ModelBox(cube_r6, 0, 67, -3.0F, 0.0F, 0.0F, 3, 2, 8, 0.0F, true));

        this.cube_r7 = new AdvancedModelRenderer(this);
        this.cube_r7.setRotationPoint(-3.4894F, -4.6221F, 7.1147F);
        this.main.addChild(cube_r7);
        this.setRotateAngle(cube_r7, -0.8254F, -0.2865F, -0.6068F);
        this.cube_r7.cubeList.add(new ModelBox(cube_r7, 87, 50, -3.0F, 0.0F, 0.0F, 3, 0, 2, 0.0F, true));

        this.cube_r8 = new AdvancedModelRenderer(this);
        this.cube_r8.setRotationPoint(-3.5F, -7.8471F, 0.9019F);
        this.main.addChild(cube_r8);
        this.setRotateAngle(cube_r8, -0.3891F, -0.2865F, -0.6068F);
        this.cube_r8.cubeList.add(new ModelBox(cube_r8, 56, 65, -6.0F, 0.0F, 0.0F, 6, 0, 7, 0.0F, true));

        this.cube_r9 = new AdvancedModelRenderer(this);
        this.cube_r9.setRotationPoint(-11.2719F, -3.0354F, 3.1926F);
        this.main.addChild(cube_r9);
        this.setRotateAngle(cube_r9, -3.0785F, 0.8734F, 2.9531F);
        this.cube_r9.cubeList.add(new ModelBox(cube_r9, 68, 24, -4.0F, 0.0F, -0.1F, 4, 2, 7, 0.0F, true));

        this.cube_r10 = new AdvancedModelRenderer(this);
        this.cube_r10.setRotationPoint(-12.1867F, -0.3781F, -2.4733F);
        this.main.addChild(cube_r10);
        this.setRotateAngle(cube_r10, 2.913F, 1.3028F, 2.6682F);
        this.cube_r10.cubeList.add(new ModelBox(cube_r10, 41, 12, -6.0F, -2.0F, 0.0F, 6, 2, 9, 0.0F, true));

        this.cube_r11 = new AdvancedModelRenderer(this);
        this.cube_r11.setRotationPoint(-12.9345F, -2.5144F, -7.4949F);
        this.main.addChild(cube_r11);
        this.setRotateAngle(cube_r11, 1.4722F, 1.5613F, 1.233F);
        this.cube_r11.cubeList.add(new ModelBox(cube_r11, 0, 56, -5.0F, 0.3F, 0.225F, 5, 2, 8, 0.0F, true));

        this.cube_r12 = new AdvancedModelRenderer(this);
        this.cube_r12.setRotationPoint(-3.5F, -7.9472F, -4.0981F);
        this.main.addChild(cube_r12);
        this.setRotateAngle(cube_r12, 0.0F, 0.0F, -0.6065F);
        this.cube_r12.cubeList.add(new ModelBox(cube_r12, 0, 16, -10.0F, 0.0F, -5.0F, 10, 2, 10, 0.0F, true));

        this.cube_r13 = new AdvancedModelRenderer(this);
        this.cube_r13.setRotationPoint(-4.5F, 2.1528F, -3.3981F);
        this.main.addChild(cube_r13);
        this.setRotateAngle(cube_r13, 0.0F, 0.0F, 0.3927F);
        this.cube_r13.cubeList.add(new ModelBox(cube_r13, 35, 28, -6.0F, -5.0F, -6.0F, 6, 5, 10, -0.002F, true));

        this.cube_r14 = new AdvancedModelRenderer(this);
        this.cube_r14.setRotationPoint(-12.6527F, -2.2895F, -7.492F);
        this.main.addChild(cube_r14);
        this.setRotateAngle(cube_r14, -0.2278F, 1.3195F, -0.4467F);
        this.cube_r14.cubeList.add(new ModelBox(cube_r14, 56, 54, 0.0F, 0.0F, 0.0F, 5, 2, 8, 0.0F, true));

        this.cube_r15 = new AdvancedModelRenderer(this);
        this.cube_r15.setRotationPoint(-9.6473F, -3.4793F, -14.5347F);
        this.main.addChild(cube_r15);
        this.setRotateAngle(cube_r15, -0.1193F, 0.8372F, -0.3281F);
        this.cube_r15.cubeList.add(new ModelBox(cube_r15, 42, 82, -3.0F, 0.0F, 0.0F, 3, 2, 5, 0.0F, true));

        this.cube_r16 = new AdvancedModelRenderer(this);
        this.cube_r16.setRotationPoint(-3.5F, -7.8471F, -9.0981F);
        this.main.addChild(cube_r16);
        this.setRotateAngle(cube_r16, 0.5158F, 0.3289F, -0.5949F);
        this.cube_r16.cubeList.add(new ModelBox(cube_r16, 58, 44, -6.0F, 0.0F, -8.0F, 6, 0, 8, 0.0F, true));

        this.cube_r17 = new AdvancedModelRenderer(this);
        this.cube_r17.setRotationPoint(-7.3574F, -3.1596F, -16.375F);
        this.main.addChild(cube_r17);
        this.setRotateAngle(cube_r17, 0.2415F, 0.66F, 0.1656F);
        this.cube_r17.cubeList.add(new ModelBox(cube_r17, 68, 34, -2.95F, 0.05F, 0.0F, 3, 2, 7, 0.0F, true));

        this.cube_r18 = new AdvancedModelRenderer(this);
        this.cube_r18.setRotationPoint(-4.3989F, -2.6399F, -16.9578F);
        this.main.addChild(cube_r18);
        this.setRotateAngle(cube_r18, 0.2095F, 0.1855F, 0.1592F);
        this.cube_r18.cubeList.add(new ModelBox(cube_r18, 27, 66, -3.0F, 0.0F, 0.0F, 3, 2, 8, 0.0F, true));

        this.cube_r19 = new AdvancedModelRenderer(this);
        this.cube_r19.setRotationPoint(-1.4985F, -0.9938F, -16.6247F);
        this.main.addChild(cube_r19);
        this.setRotateAngle(cube_r19, 0.2072F, 0.0255F, -0.0976F);
        this.cube_r19.cubeList.add(new ModelBox(cube_r19, 83, 53, -3.0F, -2.0F, 0.0F, 3, 2, 5, 0.0F, true));

        this.cube_r20 = new AdvancedModelRenderer(this);
        this.cube_r20.setRotationPoint(-1.4985F, -0.9938F, -16.6247F);
        this.main.addChild(cube_r20);
        this.setRotateAngle(cube_r20, 0.2829F, -0.5323F, -0.3613F);
        this.cube_r20.cubeList.add(new ModelBox(cube_r20, 74, 89, 0.125F, -2.0F, -0.05F, 3, 2, 3, 0.0F, true));

        this.cube_r21 = new AdvancedModelRenderer(this);
        this.cube_r21.setRotationPoint(3.5F, -7.9472F, -4.0981F);
        this.main.addChild(cube_r21);
        this.setRotateAngle(cube_r21, 0.0F, 0.0F, 0.6065F);
        this.cube_r21.cubeList.add(new ModelBox(cube_r21, 0, 16, 0.0F, 0.0F, -5.0F, 10, 2, 10, 0.0F, false));

        this.cube_r22 = new AdvancedModelRenderer(this);
        this.cube_r22.setRotationPoint(1.4985F, -0.9938F, -16.6247F);
        this.main.addChild(cube_r22);
        this.setRotateAngle(cube_r22, 0.2829F, 0.5323F, 0.3613F);
        this.cube_r22.cubeList.add(new ModelBox(cube_r22, 74, 89, -3.125F, -2.0F, -0.05F, 3, 2, 3, 0.0F, false));

        this.cube_r23 = new AdvancedModelRenderer(this);
        this.cube_r23.setRotationPoint(1.4985F, -0.9938F, -16.6247F);
        this.main.addChild(cube_r23);
        this.setRotateAngle(cube_r23, 0.2072F, -0.0255F, 0.0976F);
        this.cube_r23.cubeList.add(new ModelBox(cube_r23, 83, 53, 0.0F, -2.0F, 0.0F, 3, 2, 5, 0.0F, false));

        this.cube_r24 = new AdvancedModelRenderer(this);
        this.cube_r24.setRotationPoint(4.3989F, -2.6399F, -16.9578F);
        this.main.addChild(cube_r24);
        this.setRotateAngle(cube_r24, 0.2095F, -0.1855F, -0.1592F);
        this.cube_r24.cubeList.add(new ModelBox(cube_r24, 27, 66, 0.0F, 0.0F, 0.0F, 3, 2, 8, 0.0F, false));

        this.cube_r25 = new AdvancedModelRenderer(this);
        this.cube_r25.setRotationPoint(7.3574F, -3.1596F, -16.375F);
        this.main.addChild(cube_r25);
        this.setRotateAngle(cube_r25, 0.2415F, -0.66F, -0.1656F);
        this.cube_r25.cubeList.add(new ModelBox(cube_r25, 68, 34, -0.05F, 0.05F, 0.0F, 3, 2, 7, 0.0F, false));

        this.cube_r26 = new AdvancedModelRenderer(this);
        this.cube_r26.setRotationPoint(9.6473F, -3.4793F, -14.5347F);
        this.main.addChild(cube_r26);
        this.setRotateAngle(cube_r26, -0.1193F, -0.8372F, 0.3281F);
        this.cube_r26.cubeList.add(new ModelBox(cube_r26, 42, 82, 0.0F, 0.0F, 0.0F, 3, 2, 5, 0.0F, false));

        this.cube_r27 = new AdvancedModelRenderer(this);
        this.cube_r27.setRotationPoint(12.6527F, -2.2895F, -7.492F);
        this.main.addChild(cube_r27);
        this.setRotateAngle(cube_r27, -0.2278F, -1.3195F, 0.4467F);
        this.cube_r27.cubeList.add(new ModelBox(cube_r27, 56, 54, -5.0F, 0.0F, 0.0F, 5, 2, 8, 0.0F, false));

        this.cube_r28 = new AdvancedModelRenderer(this);
        this.cube_r28.setRotationPoint(3.2503F, -2.6944F, 10.3361F);
        this.main.addChild(cube_r28);
        this.setRotateAngle(cube_r28, -2.9147F, -0.163F, -3.1367F);
        this.cube_r28.cubeList.add(new ModelBox(cube_r28, 23, 77, 0.0F, 0.0F, 0.0F, 3, 2, 6, 0.002F, false));

        this.cube_r29 = new AdvancedModelRenderer(this);
        this.cube_r29.setRotationPoint(6.7612F, -2.9776F, 8.4404F);
        this.main.addChild(cube_r29);
        this.setRotateAngle(cube_r29, -2.8868F, -0.4937F, 3.0611F);
        this.cube_r29.cubeList.add(new ModelBox(cube_r29, 50, 73, 0.0F, 0.0F, 0.0F, 4, 2, 6, 0.0F, false));

        this.cube_r30 = new AdvancedModelRenderer(this);
        this.cube_r30.setRotationPoint(8.7484F, -3.5168F, 6.2586F);
        this.main.addChild(cube_r30);
        this.setRotateAngle(cube_r30, -2.7806F, -0.8143F, 2.8767F);
        this.cube_r30.cubeList.add(new ModelBox(cube_r30, 0, 67, 0.0F, 0.0F, 0.0F, 3, 2, 8, 0.0F, false));

        this.cube_r31 = new AdvancedModelRenderer(this);
        this.cube_r31.setRotationPoint(11.2719F, -3.0354F, 3.1926F);
        this.main.addChild(cube_r31);
        this.setRotateAngle(cube_r31, -3.0785F, -0.8734F, -2.9531F);
        this.cube_r31.cubeList.add(new ModelBox(cube_r31, 68, 24, 0.0F, 0.0F, -0.1F, 4, 2, 7, 0.0F, false));

        this.cube_r32 = new AdvancedModelRenderer(this);
        this.cube_r32.setRotationPoint(12.1867F, -0.3781F, -2.4733F);
        this.main.addChild(cube_r32);
        this.setRotateAngle(cube_r32, 2.913F, -1.3028F, -2.6682F);
        this.cube_r32.cubeList.add(new ModelBox(cube_r32, 41, 12, 0.0F, -2.0F, 0.0F, 6, 2, 9, 0.0F, false));

        this.cube_r33 = new AdvancedModelRenderer(this);
        this.cube_r33.setRotationPoint(12.9345F, -2.5144F, -7.4949F);
        this.main.addChild(cube_r33);
        this.setRotateAngle(cube_r33, 1.4722F, -1.5613F, -1.233F);
        this.cube_r33.cubeList.add(new ModelBox(cube_r33, 0, 56, 0.0F, 0.3F, 0.225F, 5, 2, 8, 0.0F, false));

        this.cube_r34 = new AdvancedModelRenderer(this);
        this.cube_r34.setRotationPoint(-0.5F, -5.4971F, -13.7981F);
        this.main.addChild(cube_r34);
        this.setRotateAngle(cube_r34, 0.2182F, 0.0F, 0.0F);
        this.cube_r34.cubeList.add(new ModelBox(cube_r34, 91, 28, -0.5F, 1.25F, -3.2F, 2, 2, 3, 0.0F, false));

        this.cube_r35 = new AdvancedModelRenderer(this);
        this.cube_r35.setRotationPoint(-0.5F, -2.9471F, 10.9019F);
        this.main.addChild(cube_r35);
        this.setRotateAngle(cube_r35, -0.2182F, 0.0F, 0.0F);
        this.cube_r35.cubeList.add(new ModelBox(cube_r35, 89, 34, -0.5F, 0.2F, -4.0F, 2, 2, 4, 0.0F, false));

        this.cube_r36 = new AdvancedModelRenderer(this);
        this.cube_r36.setRotationPoint(0.0F, 2.1528F, 0.6019F);
        this.main.addChild(cube_r36);
        this.setRotateAngle(cube_r36, 0.1396F, 0.0F, 0.0F);
        this.cube_r36.cubeList.add(new ModelBox(cube_r36, 0, 42, -3.0F, -5.0F, 0.0F, 6, 5, 8, -0.002F, false));
        this.cube_r36.cubeList.add(new ModelBox(cube_r36, 12, 94, -2.5F, -5.0F, 0.0F, 5, 5, 8, 0.0F, false));

        this.cube_r37 = new AdvancedModelRenderer(this);
        this.cube_r37.setRotationPoint(-0.5F, 2.1528F, -9.3981F);
        this.main.addChild(cube_r37);
        this.setRotateAngle(cube_r37, -0.1571F, 0.0F, 0.0F);
        this.cube_r37.cubeList.add(new ModelBox(cube_r37, 29, 54, -3.0F, -5.0F, -6.0F, 7, 5, 6, 0.0F, false));

        this.cube_r38 = new AdvancedModelRenderer(this);
        this.cube_r38.setRotationPoint(4.5F, 2.1528F, -3.3981F);
        this.main.addChild(cube_r38);
        this.setRotateAngle(cube_r38, 0.0F, 0.0F, -0.3927F);
        this.cube_r38.cubeList.add(new ModelBox(cube_r38, 35, 28, 0.0F, -5.0F, -6.0F, 6, 5, 10, -0.002F, false));

        this.cube_r39 = new AdvancedModelRenderer(this);
        this.cube_r39.setRotationPoint(3.5F, -7.8471F, -9.0981F);
        this.main.addChild(cube_r39);
        this.setRotateAngle(cube_r39, 0.5158F, -0.3289F, 0.5949F);
        this.cube_r39.cubeList.add(new ModelBox(cube_r39, 58, 44, 0.0F, 0.0F, -8.0F, 6, 0, 8, 0.0F, false));

        this.cube_r40 = new AdvancedModelRenderer(this);
        this.cube_r40.setRotationPoint(3.4894F, -4.6221F, 7.1147F);
        this.main.addChild(cube_r40);
        this.setRotateAngle(cube_r40, -0.8254F, 0.2865F, 0.6068F);
        this.cube_r40.cubeList.add(new ModelBox(cube_r40, 87, 50, 0.0F, 0.0F, 0.0F, 3, 0, 2, 0.0F, false));

        this.cube_r41 = new AdvancedModelRenderer(this);
        this.cube_r41.setRotationPoint(3.5F, -7.8471F, 0.9019F);
        this.main.addChild(cube_r41);
        this.setRotateAngle(cube_r41, -0.3891F, 0.2865F, 0.6068F);
        this.cube_r41.cubeList.add(new ModelBox(cube_r41, 56, 65, 0.0F, 0.0F, 0.0F, 6, 0, 7, 0.0F, false));

        this.neck = new AdvancedModelRenderer(this);
        this.neck.setRotationPoint(0.5F, -0.7976F, -15.0763F);
        this.main.addChild(neck);
        this.setRotateAngle(neck, 0.0436F, 0.0F, 0.0F);
        this.neck.cubeList.add(new ModelBox(neck, 87, 44, -3.0F, -1.75F, -2.0F, 5, 3, 2, 0.011F, false));
        this.neck.cubeList.add(new ModelBox(neck, 83, 69, -3.0F, 0.75F, -2.0F, 5, 1, 2, 0.001F, false));

        this.head = new AdvancedModelRenderer(this);
        this.head.setRotationPoint(0.0F, 0.0F, -2.0F);
        this.neck.addChild(head);
        this.head.cubeList.add(new ModelBox(head, 88, 87, -1.5F, -1.2197F, -7.1907F, 2, 2, 4, 0.0F, false));
        this.head.cubeList.add(new ModelBox(head, 0, 78, -3.0F, -1.75F, -4.0F, 5, 3, 4, 0.01F, false));
        this.head.cubeList.add(new ModelBox(head, 59, 89, -3.0F, 0.75F, -2.0F, 5, 1, 2, 0.0F, false));

        this.cube_r42 = new AdvancedModelRenderer(this);
        this.cube_r42.setRotationPoint(-4.0F, -2.25F, -4.0F);
        this.head.addChild(cube_r42);
        this.setRotateAngle(cube_r42, 0.0F, -0.5236F, 0.0F);
        this.cube_r42.cubeList.add(new ModelBox(cube_r42, 91, 22, 0.866F, 1.0F, -3.5F, 2, 2, 3, 0.0F, true));

        this.cube_r43 = new AdvancedModelRenderer(this);
        this.cube_r43.setRotationPoint(3.0F, -2.25F, -4.0F);
        this.head.addChild(cube_r43);
        this.setRotateAngle(cube_r43, 0.0F, 0.5236F, 0.0F);
        this.cube_r43.cubeList.add(new ModelBox(cube_r43, 91, 22, -2.866F, 1.0F, -3.5F, 2, 2, 3, 0.0F, false));

        this.cube_r44 = new AdvancedModelRenderer(this);
        this.cube_r44.setRotationPoint(1.0F, 0.6845F, -6.9964F);
        this.head.addChild(cube_r44);
        this.setRotateAngle(cube_r44, 0.0611F, 0.0F, 0.0F);
        this.cube_r44.cubeList.add(new ModelBox(cube_r44, 88, 80, -2.5F, -2.1675F, -0.1584F, 2, 2, 4, 0.01F, false));

        this.eye1 = new AdvancedModelRenderer(this);
        this.eye1.setRotationPoint(1.05F, -0.5F, -5.95F);
        this.head.addChild(eye1);


        this.cube_r45 = new AdvancedModelRenderer(this);
        this.cube_r45.setRotationPoint(1.2F, -1.75F, 2.2F);
        this.eye1.addChild(cube_r45);
        this.setRotateAngle(cube_r45, 0.0F, 0.5236F, 0.0F);
        this.cube_r45.cubeList.add(new ModelBox(cube_r45, 50, 66, -1.0666F, 1.2391F, -3.3413F, 1, 1, 1, 0.0F, false));

        this.eye2 = new AdvancedModelRenderer(this);
        this.eye2.setRotationPoint(-2.05F, -0.5F, -5.95F);
        this.head.addChild(eye2);


        this.cube_r46 = new AdvancedModelRenderer(this);
        this.cube_r46.setRotationPoint(-1.2F, -1.75F, 2.2F);
        this.eye2.addChild(cube_r46);
        this.setRotateAngle(cube_r46, 0.0F, -0.5236F, 0.0F);
        this.cube_r46.cubeList.add(new ModelBox(cube_r46, 50, 66, 0.0666F, 1.2391F, -3.3413F, 1, 1, 1, 0.0F, true));

        this.jaw = new AdvancedModelRenderer(this);
        this.jaw.setRotationPoint(-0.5F, 1.25F, -2.0F);
        this.head.addChild(jaw);
        this.jaw.cubeList.add(new ModelBox(jaw, 93, 5, -2.0F, -2.5F, -2.0F, 4, 2, 1, 0.0F, false));
        this.jaw.cubeList.add(new ModelBox(jaw, 41, 24, -2.5F, -0.5F, -2.0F, 5, 1, 2, -0.002F, false));
        this.jaw.cubeList.add(new ModelBox(jaw, 59, 25, -1.0F, -0.525F, -5.1998F, 2, 1, 4, 0.0F, false));

        this.cube_r47 = new AdvancedModelRenderer(this);
        this.cube_r47.setRotationPoint(-3.5F, -1.5F, -2.0F);
        this.jaw.addChild(cube_r47);
        this.setRotateAngle(cube_r47, 0.0F, -0.5236F, 0.0F);
        this.cube_r47.cubeList.add(new ModelBox(cube_r47, 93, 0, 0.866F, 0.975F, -3.5F, 2, 1, 3, -0.001F, true));

        this.cube_r48 = new AdvancedModelRenderer(this);
        this.cube_r48.setRotationPoint(3.5F, -1.5F, -2.0F);
        this.jaw.addChild(cube_r48);
        this.setRotateAngle(cube_r48, 0.0F, 0.5236F, 0.0F);
        this.cube_r48.cubeList.add(new ModelBox(cube_r48, 93, 0, -2.866F, 0.975F, -3.5F, 2, 1, 3, -0.001F, false));

        this.frontleftleg = new AdvancedModelRenderer(this);
        this.frontleftleg.setRotationPoint(3.8049F, -0.6952F, -10.236F);
        this.main.addChild(frontleftleg);
        this.setRotateAngle(frontleftleg, 0.3927F, -0.8727F, 0.0F);
        this.frontleftleg.cubeList.add(new ModelBox(frontleftleg, 72, 0, -2.0F, -2.0F, -6.0F, 4, 4, 6, 0.0F, false));

        this.frontleftleg2 = new AdvancedModelRenderer(this);
        this.frontleftleg2.setRotationPoint(0.063F, -1.0026F, -5.7207F);
        this.frontleftleg.addChild(frontleftleg2);
        this.setRotateAngle(frontleftleg2, 0.8564F, 0.9631F, -0.6287F);
        this.frontleftleg2.cubeList.add(new ModelBox(frontleftleg2, 0, 86, -1.501F, -1.4969F, -3.75F, 3, 3, 4, 0.0F, false));

        this.frontleftleg3 = new AdvancedModelRenderer(this);
        this.frontleftleg3.setRotationPoint(0.0F, 0.0132F, -4.0008F);
        this.frontleftleg2.addChild(frontleftleg3);
        this.setRotateAngle(frontleftleg3, -0.0019F, -0.0048F, 0.1746F);
        this.frontleftleg3.cubeList.add(new ModelBox(frontleftleg3, 59, 82, -2.0F, -3.75F, -0.5F, 4, 5, 1, 0.0F, false));

        this.frontrightleg = new AdvancedModelRenderer(this);
        this.frontrightleg.setRotationPoint(-3.8049F, -0.6952F, -10.236F);
        this.main.addChild(frontrightleg);
        this.setRotateAngle(frontrightleg, 0.3927F, 0.8727F, 0.0F);
        this.frontrightleg.cubeList.add(new ModelBox(frontrightleg, 72, 0, -2.0F, -2.0F, -6.0F, 4, 4, 6, 0.0F, true));

        this.frontrightleg2 = new AdvancedModelRenderer(this);
        this.frontrightleg2.setRotationPoint(-0.063F, -1.0026F, -5.7207F);
        this.frontrightleg.addChild(frontrightleg2);
        this.setRotateAngle(frontrightleg2, 0.8564F, -0.9631F, 0.6287F);
        this.frontrightleg2.cubeList.add(new ModelBox(frontrightleg2, 0, 86, -1.499F, -1.4969F, -3.75F, 3, 3, 4, 0.0F, true));

        this.frontrightleg3 = new AdvancedModelRenderer(this);
        this.frontrightleg3.setRotationPoint(0.0F, 0.0132F, -4.0008F);
        this.frontrightleg2.addChild(frontrightleg3);
        this.setRotateAngle(frontrightleg3, -0.0019F, 0.0048F, -0.1746F);
        this.frontrightleg3.cubeList.add(new ModelBox(frontrightleg3, 59, 82, -2.0F, -3.75F, -0.5F, 4, 5, 1, 0.0F, true));

        this.backleftleg = new AdvancedModelRenderer(this);
        this.backleftleg.setRotationPoint(3.0549F, -0.6952F, 3.0397F);
        this.main.addChild(backleftleg);
        this.setRotateAngle(backleftleg, -0.3927F, 1.1781F, 0.0F);
        this.backleftleg.cubeList.add(new ModelBox(backleftleg, 72, 11, -2.0F, -2.0F, 0.0F, 4, 4, 6, 0.0F, false));

        this.backleftleg2 = new AdvancedModelRenderer(this);
        this.backleftleg2.setRotationPoint(0.0254F, -0.968F, 5.6112F);
        this.backleftleg.addChild(backleftleg2);
        this.setRotateAngle(backleftleg2, -1.1625F, 0.3614F, 0.1572F);
        this.backleftleg2.cubeList.add(new ModelBox(backleftleg2, 15, 86, -1.5F, -1.4967F, -0.25F, 3, 3, 4, 0.0F, false));

        this.backleftleg3 = new AdvancedModelRenderer(this);
        this.backleftleg3.setRotationPoint(-0.0005F, 0.0121F, 4.0062F);
        this.backleftleg2.addChild(backleftleg3);
        this.setRotateAngle(backleftleg3, 0.0F, 0.0F, 1.3963F);
        this.backleftleg3.cubeList.add(new ModelBox(backleftleg3, 30, 86, -2.0F, -3.75F, -0.5F, 4, 5, 1, 0.0F, false));

        this.backrightleg = new AdvancedModelRenderer(this);
        this.backrightleg.setRotationPoint(-3.0549F, -0.6952F, 3.5397F);
        this.main.addChild(backrightleg);
        this.setRotateAngle(backrightleg, -0.3927F, -1.1781F, 0.0F);
        this.backrightleg.cubeList.add(new ModelBox(backrightleg, 72, 11, -2.0F, -2.0F, 0.0F, 4, 4, 6, 0.0F, true));

        this.backrightleg2 = new AdvancedModelRenderer(this);
        this.backrightleg2.setRotationPoint(-0.0254F, -0.968F, 5.6112F);
        this.backrightleg.addChild(backrightleg2);
        this.setRotateAngle(backrightleg2, -1.1625F, -0.3614F, -0.1572F);
        this.backrightleg2.cubeList.add(new ModelBox(backrightleg2, 15, 86, -1.5F, -1.4967F, -0.25F, 3, 3, 4, 0.0F, true));

        this.backrightleg3 = new AdvancedModelRenderer(this);
        this.backrightleg3.setRotationPoint(0.0005F, 0.0121F, 4.0062F);
        this.backrightleg2.addChild(backrightleg3);
        this.setRotateAngle(backrightleg3, 0.0F, 0.0F, -1.3963F);
        this.backrightleg3.cubeList.add(new ModelBox(backrightleg3, 30, 86, -2.0F, -3.75F, -0.5F, 4, 5, 1, 0.0F, true));

        this.tail = new AdvancedModelRenderer(this);
        this.tail.setRotationPoint(0.0F, -0.7962F, 6.9237F);
        this.main.addChild(tail);
        this.setRotateAngle(tail, -0.3927F, 0.0F, 0.0F);
        this.tail.cubeList.add(new ModelBox(tail, 71, 80, -1.5F, -1.5F, 0.0F, 3, 3, 5, 0.0F, false));

        this.tail2 = new AdvancedModelRenderer(this);
        this.tail2.setRotationPoint(0.0F, 0.0732F, 4.7273F);
        this.tail.addChild(tail2);
        this.setRotateAngle(tail2, 0.1353F, 0.0F, 0.0F);
        this.tail2.cubeList.add(new ModelBox(tail2, 83, 61, -1.0F, -1.0F, 0.0F, 2, 2, 5, 0.0F, false));

        this.tail3 = new AdvancedModelRenderer(this);
        this.tail3.setRotationPoint(0.0F, 0.0F, 5.0F);
        this.tail2.addChild(tail3);
        this.setRotateAngle(tail3, 0.0436F, 0.0F, 0.0F);
        this.tail3.cubeList.add(new ModelBox(tail3, 41, 90, -0.5F, -0.5F, 0.0F, 1, 1, 4, 0.0F, false));

        updateDefaultPose();
        animator = ModelAnimator.create();
    }

    @Override
    public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        animate((IAnimatedEntity) entity, f, f1, f2, f3, f4, f5);
        this.main.render(f5);

    }
    @Override
    public void renderStaticBook(float f) {
        //Rotations, positions and sizing:
        this.main.offsetY = -0.6F;
        this.main.offsetX = 0.0F;
        this.main.offsetZ = 2.0F;
        this.main.rotateAngleY = (float)Math.toRadians(120);
        this.main.rotateAngleX = (float)Math.toRadians(0);
        this.main.rotateAngleZ = (float)Math.toRadians(0);
        this.main.scaleChildren = true;
        float scaler = 1.2F;
        this.main.setScale(scaler, scaler, scaler);
        //Start of pose:
        this.setRotateAngle(main, 0.4F, 3.8F, -0.2F);
        //End of pose, now render the model:
        this.main.render(f);
        //Reset rotations, positions and sizing:
        this.main.setScale(1.0F, 1.0F, 1.0F);
        this.main.scaleChildren = false;
        resetToDefaultPose();

    }

    public void renderStaticWall(float f) {
        this.main.rotateAngleX = (float) Math.toRadians(90);
        this.main.offsetY = -0.2F;
        this.main.render(0.01F);
        resetToDefaultPose();
    }

    public void renderStaticFloor(float f) {


        this.main.offsetY = -0.105F;
        this.main.render(0.01F);
        resetToDefaultPose();
    }

    public void setRotateAngle(AdvancedModelRenderer AdvancedModelRenderer, float x, float y, float z) {
        AdvancedModelRenderer.rotateAngleX = x;
        AdvancedModelRenderer.rotateAngleY = y;
        AdvancedModelRenderer.rotateAngleZ = z;
    }

    @Override
    public void setRotationAngles(float f, float f1, float f2, float f3, float f4, float f5, Entity e) {
        super.setRotationAngles(f, f1, f2, f3, f4, f5, e);
        //this.resetToDefaultPose();

        EntityPrehistoricFloraAragochersis entityAragochersis = (EntityPrehistoricFloraAragochersis) e;

        if (entityAragochersis.getAnimation() == entityAragochersis.HIDE_ANIMATION) {
            return;
        }

        AdvancedModelRenderer[] Tail = {this.tail, this.tail2, this.tail3};
        AdvancedModelRenderer[] Neck = {this.neck, this.head};

        if (entityAragochersis.getAnimation() == entityAragochersis.LAY_ANIMATION) {
            this.chainSwing(Neck, 0.5F, 0.10F, 0.5, f2, 0.8F);
            this.chainWave(Neck, 0.5F * 2, -0.02F, 0.5F, f2, 0.8F);
        }
        else {
            if (!entityAragochersis.isReallyInWater()) {

                if (f3 == 0.0F || !entityAragochersis.getIsMoving()) {
                    if (entityAragochersis.getAnimation() != entityAragochersis.EAT_ANIMATION
                        && entityAragochersis.getAnimation() != entityAragochersis.DRINK_ANIMATION
                        && entityAragochersis.getAnimation() != entityAragochersis.HIDE_ANIMATION) {
                        this.chainSwing(Neck, 0.05F, 0.10F, 0.5, f2, 0.8F);
                        this.chainWave(Neck, 0.05F * 2, -0.02F, 0.5F, f2, 0.8F);
                    }

                    this.chainWave(Tail, (0.15F * 0.35F), 0.1F * 0.1F, 0.2F, f2, 1F);
                    this.chainSwing(Tail, (0.15F * 0.35F) * 4F, 0.05F * 0.05F, 0.12F, f2, 1F);


                    return;
                }

                if (entityAragochersis.getIsFast()) { //Running


                } else { //Walking

                }
            } else {
                //Swimming pose:
                if (f3 == 0.0F) { //static in water
                    return;
                }
                //moving in water
                return;
            }
        }
    }


    @Override
    public void setLivingAnimations(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime) {
        super.setLivingAnimations(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime);
        this.resetToDefaultPose();

        EntityPrehistoricFloraAragochersis ee = (EntityPrehistoricFloraAragochersis) entitylivingbaseIn;

        if (ee.getAnimation() != ee.HIDE_ANIMATION) {
            if (!ee.isReallyInWater()) {
                if (ee.getIsMoving()) {
                    animWalking(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime);

                } else {
//                    animIdlePose(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime);
                }
            }
        }
        if (ee.getAnimation() == ee.EAT_ANIMATION) {
            animEat(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime, ee.getAnimationTick());
        }
        else if (ee.getAnimation() == ee.ATTACK_ANIMATION) {
            //animAttack(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime, ee.getAnimationTick());
        }
        else if (ee.getAnimation() == ee.MAKE_NEST_ANIMATION) {
            animNest(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime, ee.getAnimationTick());
        }
        else if (ee.getAnimation() == ee.LAY_ANIMATION) {
            //animLay(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime, ee.getAnimationTick());
        }
        else if (ee.getAnimation() == ee.DRINK_ANIMATION) { //The graze anim
            //animGraze(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime, ee.getAnimationTick());
        }
        else if (ee.getAnimation() == ee.ROAR_ANIMATION) { //The noise anim
            //animNoise(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime, ee.getAnimationTick());
        }
        else if (ee.getAnimation() == ee.HIDE_ANIMATION) { //The hiding and unhiding anim
            animHide(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime, ee.getAnimationTick());
        }

    }

    public void animNest(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime, double animTick) {
        EntityPrehistoricFloraAragochersis entity = (EntityPrehistoricFloraAragochersis) entitylivingbaseIn;
        int animCycle = 50;
        double tickAnim = animTick + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;
        if (tickAnim >= 0 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 0) / 20) * (15.27042-(0)));
            yy = 0 + (((tickAnim - 0) / 20) * (-24.50196-(0)));
            zz = 0 + (((tickAnim - 0) / 20) * (17.47239-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 36) {
            xx = 15.27042 + (((tickAnim - 20) / 16) * (-8.22026-(15.27042)));
            yy = -24.50196 + (((tickAnim - 20) / 16) * (-18.13779-(-24.50196)));
            zz = 17.47239 + (((tickAnim - 20) / 16) * (-32.17995-(17.47239)));
        }
        else if (tickAnim >= 36 && tickAnim < 50) {
            xx = -8.22026 + (((tickAnim - 36) / 14) * (0-(-8.22026)));
            yy = -18.13779 + (((tickAnim - 36) / 14) * (0-(-18.13779)));
            zz = -32.17995 + (((tickAnim - 36) / 14) * (0-(-32.17995)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(backleftleg, backleftleg.rotateAngleX + (float) Math.toRadians(xx), backleftleg.rotateAngleY + (float) Math.toRadians(yy), backleftleg.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 0) / 20) * (0.19897-(0)));
            yy = 0 + (((tickAnim - 0) / 20) * (-19.48668-(0)));
            zz = 0 + (((tickAnim - 0) / 20) * (17.90918-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 36) {
            xx = 0.19897 + (((tickAnim - 20) / 16) * (-16.7483-(0.19897)));
            yy = -19.48668 + (((tickAnim - 20) / 16) * (-10.06507-(-19.48668)));
            zz = 17.90918 + (((tickAnim - 20) / 16) * (17.07394-(17.90918)));
        }
        else if (tickAnim >= 36 && tickAnim < 50) {
            xx = -16.7483 + (((tickAnim - 36) / 14) * (0-(-16.7483)));
            yy = -10.06507 + (((tickAnim - 36) / 14) * (0-(-10.06507)));
            zz = 17.07394 + (((tickAnim - 36) / 14) * (0-(17.07394)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(backleftleg2, backleftleg2.rotateAngleX + (float) Math.toRadians(xx), backleftleg2.rotateAngleY + (float) Math.toRadians(yy), backleftleg2.rotateAngleZ + (float) Math.toRadians(zz));

        this.backleftleg2.rotationPointX = this.backleftleg2.rotationPointX + (float)(0);
        this.backleftleg2.rotationPointY = this.backleftleg2.rotationPointY - (float)(0);
        this.backleftleg2.rotationPointZ = this.backleftleg2.rotationPointZ + (float)(0);



        if (tickAnim >= 0 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 0) / 20) * (-29-(0)));
            yy = 0 + (((tickAnim - 0) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 20) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 36) {
            xx = -29 + (((tickAnim - 20) / 16) * (-49.69-(-29)));
            yy = 0 + (((tickAnim - 20) / 16) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 16) * (0-(0)));
        }
        else if (tickAnim >= 36 && tickAnim < 50) {
            xx = -49.69 + (((tickAnim - 36) / 14) * (0-(-49.69)));
            yy = 0 + (((tickAnim - 36) / 14) * (0-(0)));
            zz = 0 + (((tickAnim - 36) / 14) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(backleftleg3, backleftleg3.rotateAngleX + (float) Math.toRadians(xx), backleftleg3.rotateAngleY + (float) Math.toRadians(yy), backleftleg3.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 0) / 20) * (-0.25-(0)));
            yy = 0 + (((tickAnim - 0) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 20) * (-1-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 36) {
            xx = -0.25 + (((tickAnim - 20) / 16) * (-0.12-(-0.25)));
            yy = 0 + (((tickAnim - 20) / 16) * (0-(0)));
            zz = -1 + (((tickAnim - 20) / 16) * (-1.745-(-1)));
        }
        else if (tickAnim >= 36 && tickAnim < 50) {
            xx = -0.12 + (((tickAnim - 36) / 14) * (0-(-0.12)));
            yy = 0 + (((tickAnim - 36) / 14) * (0-(0)));
            zz = -1.745 + (((tickAnim - 36) / 14) * (0-(-1.745)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.backleftleg3.rotationPointX = this.backleftleg3.rotationPointX + (float)(xx);
        this.backleftleg3.rotationPointY = this.backleftleg3.rotationPointY - (float)(yy);
        this.backleftleg3.rotationPointZ = this.backleftleg3.rotationPointZ + (float)(zz);

    }
    public void animHide(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime, double animTick) {
        EntityPrehistoricFloraAragochersis entity = (EntityPrehistoricFloraAragochersis) entitylivingbaseIn;
        int animCycle = 300;
        double tickAnim = animTick + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;
    if (tickAnim >= 0 && tickAnim < 11) {
            xx = 0 + (((tickAnim - 0) / 11) * (67.375+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50-90))*80-(0)));
            yy = 0 + (((tickAnim - 0) / 11) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 11) * (-2.225+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*5-(0)));
        }
        else if (tickAnim >= 11 && tickAnim < 20) {
            xx = 67.375+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50-90))*80 + (((tickAnim - 11) / 9) * (0-(67.375+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50-90))*80)));
            yy = 0 + (((tickAnim - 11) / 9) * (0-(0)));
            zz = -2.225+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*5 + (((tickAnim - 11) / 9) * (0-(-2.225+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*5)));
        }
        else if (tickAnim >= 20 && tickAnim < 280) {
            xx = 0 + (((tickAnim - 20) / 260) * (0-(0)));
            yy = 0 + (((tickAnim - 20) / 260) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 260) * (0-(0)));
        }
        else if (tickAnim >= 280 && tickAnim < 290) {
            xx = 0 + (((tickAnim - 280) / 10) * (-11.75-(0)));
            yy = 0 + (((tickAnim - 280) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 280) / 10) * (0-(0)));
        }
        else if (tickAnim >= 290 && tickAnim < 300) {
            xx = -11.75 + (((tickAnim - 290) / 10) * (0-(-11.75)));
            yy = 0 + (((tickAnim - 290) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 290) / 10) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(main, main.rotateAngleX + (float) Math.toRadians(xx), main.rotateAngleY + (float) Math.toRadians(yy), main.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 0) / 8) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 8) * (-2.845-(0)));
            zz = 0 + (((tickAnim - 0) / 8) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 8) / 12) * (0-(0)));
            yy = -2.845 + (((tickAnim - 8) / 12) * (-3-(-2.845)));
            zz = 0 + (((tickAnim - 8) / 12) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 280) {
            xx = 0 + (((tickAnim - 20) / 260) * (0-(0)));
            yy = -3 + (((tickAnim - 20) / 260) * (-3-(-3)));
            zz = 0 + (((tickAnim - 20) / 260) * (0-(0)));
        }
        else if (tickAnim >= 280 && tickAnim < 300) {
            xx = 0 + (((tickAnim - 280) / 20) * (0-(0)));
            yy = -3 + (((tickAnim - 280) / 20) * (0-(-3)));
            zz = 0 + (((tickAnim - 280) / 20) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.main.rotationPointX = this.main.rotationPointX + (float)(xx);
        this.main.rotationPointY = this.main.rotationPointY - (float)(yy);
        this.main.rotationPointZ = this.main.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 0) / 13) * (22.95223-(0)));
            yy = 0 + (((tickAnim - 0) / 13) * (-27.69157-(0)));
            zz = 0 + (((tickAnim - 0) / 13) * (-4.19131-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 16) {
            xx = 22.95223 + (((tickAnim - 13) / 3) * (21.78949-(22.95223)));
            yy = -27.69157 + (((tickAnim - 13) / 3) * (-35.07598-(-27.69157)));
            zz = -4.19131 + (((tickAnim - 13) / 3) * (-5.30899-(-4.19131)));
        }
        else if (tickAnim >= 16 && tickAnim < 20) {
            xx = 21.78949 + (((tickAnim - 16) / 4) * (35.52357-(21.78949)));
            yy = -35.07598 + (((tickAnim - 16) / 4) * (-44.30651-(-35.07598)));
            zz = -5.30899 + (((tickAnim - 16) / 4) * (-6.7061-(-5.30899)));
        }
        else if (tickAnim >= 20 && tickAnim < 280) {
            xx = 35.52357 + (((tickAnim - 20) / 260) * (35.52357-(35.52357)));
            yy = -44.30651 + (((tickAnim - 20) / 260) * (-44.30651-(-44.30651)));
            zz = -6.7061 + (((tickAnim - 20) / 260) * (-6.7061-(-6.7061)));
        }
        else if (tickAnim >= 280 && tickAnim < 290) {
            xx = 35.52357 + (((tickAnim - 280) / 10) * (22.5-(35.52357)));
            yy = -44.30651 + (((tickAnim - 280) / 10) * (0-(-44.30651)));
            zz = -6.7061 + (((tickAnim - 280) / 10) * (0-(-6.7061)));
        }
        else if (tickAnim >= 290 && tickAnim < 300) {
            xx = 22.5 + (((tickAnim - 290) / 10) * (0-(22.5)));
            yy = 0 + (((tickAnim - 290) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 290) / 10) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck, neck.rotateAngleX + (float) Math.toRadians(xx), neck.rotateAngleY + (float) Math.toRadians(yy), neck.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 0) / 20) * (-0.8-(0)));
            yy = 0 + (((tickAnim - 0) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 20) * (2.175-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 280) {
            xx = -0.8 + (((tickAnim - 20) / 260) * (-0.8-(-0.8)));
            yy = 0 + (((tickAnim - 20) / 260) * (0-(0)));
            zz = 2.175 + (((tickAnim - 20) / 260) * (2.175-(2.175)));
        }
        else if (tickAnim >= 280 && tickAnim < 300) {
            xx = -0.8 + (((tickAnim - 280) / 20) * (0-(-0.8)));
            yy = 0 + (((tickAnim - 280) / 20) * (0-(0)));
            zz = 2.175 + (((tickAnim - 280) / 20) * (0-(2.175)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.neck.rotationPointX = this.neck.rotationPointX + (float)(xx);
        this.neck.rotationPointY = this.neck.rotationPointY - (float)(yy);
        this.neck.rotationPointZ = this.neck.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 0) / 20) * (-28.68563-(0)));
            yy = 0 + (((tickAnim - 0) / 20) * (-25.3066-(0)));
            zz = 0 + (((tickAnim - 0) / 20) * (13.57638-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 280) {
            xx = -28.68563 + (((tickAnim - 20) / 260) * (-28.68563-(-28.68563)));
            yy = -25.3066 + (((tickAnim - 20) / 260) * (-25.3066-(-25.3066)));
            zz = 13.57638 + (((tickAnim - 20) / 260) * (13.57638-(13.57638)));
        }
        else if (tickAnim >= 280 && tickAnim < 290) {
            xx = -28.68563 + (((tickAnim - 280) / 10) * (0-(-28.68563)));
            yy = -25.3066 + (((tickAnim - 280) / 10) * (0-(-25.3066)));
            zz = 13.57638 + (((tickAnim - 280) / 10) * (0-(13.57638)));
        }
        else if (tickAnim >= 290 && tickAnim < 300) {
            xx = 0 + (((tickAnim - 290) / 10) * (0-(0)));
            yy = 0 + (((tickAnim - 290) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 290) / 10) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(head, head.rotateAngleX + (float) Math.toRadians(xx), head.rotateAngleY + (float) Math.toRadians(yy), head.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 0) / 20) * (-0.25-(0)));
            yy = 0 + (((tickAnim - 0) / 20) * (-0.65-(0)));
            zz = 0 + (((tickAnim - 0) / 20) * (1.4-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 280) {
            xx = -0.25 + (((tickAnim - 20) / 260) * (-0.25-(-0.25)));
            yy = -0.65 + (((tickAnim - 20) / 260) * (-0.65-(-0.65)));
            zz = 1.4 + (((tickAnim - 20) / 260) * (1.4-(1.4)));
        }
        else if (tickAnim >= 280 && tickAnim < 290) {
            xx = -0.25 + (((tickAnim - 280) / 10) * (0-(-0.25)));
            yy = -0.65 + (((tickAnim - 280) / 10) * (0-(-0.65)));
            zz = 1.4 + (((tickAnim - 280) / 10) * (0-(1.4)));
        }
        else if (tickAnim >= 290 && tickAnim < 300) {
            xx = 0 + (((tickAnim - 290) / 10) * (0-(0)));
            yy = 0 + (((tickAnim - 290) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 290) / 10) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.head.rotationPointX = this.head.rotationPointX + (float)(xx);
        this.head.rotationPointY = this.head.rotationPointY - (float)(yy);
        this.head.rotationPointZ = this.head.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 11) {
            xx = 0 + (((tickAnim - 0) / 11) * (57.97714-(0)));
            yy = 0 + (((tickAnim - 0) / 11) * (23.33043-(0)));
            zz = 0 + (((tickAnim - 0) / 11) * (-70.41773-(0)));
        }
        else if (tickAnim >= 11 && tickAnim < 20) {
            xx = 57.97714 + (((tickAnim - 11) / 9) * (84.6591-(57.97714)));
            yy = 23.33043 + (((tickAnim - 11) / 9) * (58.09251-(23.33043)));
            zz = -70.41773 + (((tickAnim - 11) / 9) * (-73.12098-(-70.41773)));
        }
        else if (tickAnim >= 20 && tickAnim < 280) {
            xx = 84.6591 + (((tickAnim - 20) / 260) * (84.6591-(84.6591)));
            yy = 58.09251 + (((tickAnim - 20) / 260) * (58.09251-(58.09251)));
            zz = -73.12098 + (((tickAnim - 20) / 260) * (-73.12098-(-73.12098)));
        }
        else if (tickAnim >= 280 && tickAnim < 290) {
            xx = 84.6591 + (((tickAnim - 280) / 10) * (79.82955-(84.6591)));
            yy = 58.09251 + (((tickAnim - 280) / 10) * (29.04625-(58.09251)));
            zz = -73.12098 + (((tickAnim - 280) / 10) * (-36.56049-(-73.12098)));
        }
        else if (tickAnim >= 290 && tickAnim < 295) {
            xx = 79.82955 + (((tickAnim - 290) / 5) * (2.41477-(79.82955)));
            yy = 29.04625 + (((tickAnim - 290) / 5) * (14.52313-(29.04625)));
            zz = -36.56049 + (((tickAnim - 290) / 5) * (-18.28024-(-36.56049)));
        }
        else if (tickAnim >= 295 && tickAnim < 300) {
            xx = 2.41477 + (((tickAnim - 295) / 5) * (0-(2.41477)));
            yy = 14.52313 + (((tickAnim - 295) / 5) * (0-(14.52313)));
            zz = -18.28024 + (((tickAnim - 295) / 5) * (0-(-18.28024)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(frontleftleg, frontleftleg.rotateAngleX + (float) Math.toRadians(xx), frontleftleg.rotateAngleY + (float) Math.toRadians(yy), frontleftleg.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 11) {
            xx = 0 + (((tickAnim - 0) / 11) * (23.79-(0)));
            yy = 0 + (((tickAnim - 0) / 11) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 11) * (0-(0)));
        }
        else if (tickAnim >= 11 && tickAnim < 20) {
            xx = 23.79 + (((tickAnim - 11) / 9) * (-11-(23.79)));
            yy = 0 + (((tickAnim - 11) / 9) * (0-(0)));
            zz = 0 + (((tickAnim - 11) / 9) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 280) {
            xx = -11 + (((tickAnim - 20) / 260) * (-11-(-11)));
            yy = 0 + (((tickAnim - 20) / 260) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 260) * (0-(0)));
        }
        else if (tickAnim >= 280 && tickAnim < 290) {
            xx = -11 + (((tickAnim - 280) / 10) * (20.5-(-11)));
            yy = 0 + (((tickAnim - 280) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 280) / 10) * (0-(0)));
        }
        else if (tickAnim >= 290 && tickAnim < 295) {
            xx = 20.5 + (((tickAnim - 290) / 5) * (-15.25-(20.5)));
            yy = 0 + (((tickAnim - 290) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 290) / 5) * (0-(0)));
        }
        else if (tickAnim >= 295 && tickAnim < 300) {
            xx = -15.25 + (((tickAnim - 295) / 5) * (0-(-15.25)));
            yy = 0 + (((tickAnim - 295) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 295) / 5) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(frontleftleg2, frontleftleg2.rotateAngleX + (float) Math.toRadians(xx), frontleftleg2.rotateAngleY + (float) Math.toRadians(yy), frontleftleg2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 0) / 20) * (105-(0)));
            yy = 0 + (((tickAnim - 0) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 20) * (56.25-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 280) {
            xx = 105 + (((tickAnim - 20) / 260) * (105-(105)));
            yy = 0 + (((tickAnim - 20) / 260) * (0-(0)));
            zz = 56.25 + (((tickAnim - 20) / 260) * (56.25-(56.25)));
        }
        else if (tickAnim >= 280 && tickAnim < 290) {
            xx = 105 + (((tickAnim - 280) / 10) * (91.75755-(105)));
            yy = 0 + (((tickAnim - 280) / 10) * (0.49955-(0)));
            zz = 56.25 + (((tickAnim - 280) / 10) * (10.88218-(56.25)));
        }
        else if (tickAnim >= 290 && tickAnim < 295) {
            xx = 91.75755 + (((tickAnim - 290) / 5) * (69.87877-(91.75755)));
            yy = 0.49955 + (((tickAnim - 290) / 5) * (0.24978-(0.49955)));
            zz = 10.88218 + (((tickAnim - 290) / 5) * (-5.44109-(10.88218)));
        }
        else if (tickAnim >= 295 && tickAnim < 300) {
            xx = 69.87877 + (((tickAnim - 295) / 5) * (0-(69.87877)));
            yy = 0.24978 + (((tickAnim - 295) / 5) * (0-(0.24978)));
            zz = -5.44109 + (((tickAnim - 295) / 5) * (0-(-5.44109)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(frontleftleg3, frontleftleg3.rotateAngleX + (float) Math.toRadians(xx), frontleftleg3.rotateAngleY + (float) Math.toRadians(yy), frontleftleg3.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 290 && tickAnim < 295) {
            xx = 0 + (((tickAnim - 290) / 5) * (0-(0)));
            yy = 0 + (((tickAnim - 290) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 290) / 5) * (1.9-(0)));
        }
        else if (tickAnim >= 295 && tickAnim < 300) {
            xx = 0 + (((tickAnim - 295) / 5) * (0-(0)));
            yy = 0 + (((tickAnim - 295) / 5) * (0-(0)));
            zz = 1.9 + (((tickAnim - 295) / 5) * (0-(1.9)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.frontleftleg3.rotationPointX = this.frontleftleg3.rotationPointX + (float)(xx);
        this.frontleftleg3.rotationPointY = this.frontleftleg3.rotationPointY - (float)(yy);
        this.frontleftleg3.rotationPointZ = this.frontleftleg3.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 11) {
            xx = 0 + (((tickAnim - 0) / 11) * (57.97714-(0)));
            yy = 0 + (((tickAnim - 0) / 11) * (-23.33043-(0)));
            zz = 0 + (((tickAnim - 0) / 11) * (70.41773-(0)));
        }
        else if (tickAnim >= 11 && tickAnim < 20) {
            xx = 57.97714 + (((tickAnim - 11) / 9) * (84.6591-(57.97714)));
            yy = -23.33043 + (((tickAnim - 11) / 9) * (-58.09251-(-23.33043)));
            zz = 70.41773 + (((tickAnim - 11) / 9) * (73.12098-(70.41773)));
        }
        else if (tickAnim >= 20 && tickAnim < 280) {
            xx = 84.6591 + (((tickAnim - 20) / 260) * (84.6591-(84.6591)));
            yy = -58.09251 + (((tickAnim - 20) / 260) * (-58.09251-(-58.09251)));
            zz = 73.12098 + (((tickAnim - 20) / 260) * (73.12098-(73.12098)));
        }
        else if (tickAnim >= 280 && tickAnim < 290) {
            xx = 84.6591 + (((tickAnim - 280) / 10) * (79.82955-(84.6591)));
            yy = -58.09251 + (((tickAnim - 280) / 10) * (-29.04625-(-58.09251)));
            zz = 73.12098 + (((tickAnim - 280) / 10) * (36.56049-(73.12098)));
        }
        else if (tickAnim >= 290 && tickAnim < 295) {
            xx = 79.82955 + (((tickAnim - 290) / 5) * (2.41477-(79.82955)));
            yy = -29.04625 + (((tickAnim - 290) / 5) * (-14.52313-(-29.04625)));
            zz = 36.56049 + (((tickAnim - 290) / 5) * (18.28024-(36.56049)));
        }
        else if (tickAnim >= 295 && tickAnim < 300) {
            xx = 2.41477 + (((tickAnim - 295) / 5) * (0-(2.41477)));
            yy = -14.52313 + (((tickAnim - 295) / 5) * (0-(-14.52313)));
            zz = 18.28024 + (((tickAnim - 295) / 5) * (0-(18.28024)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(frontrightleg, frontrightleg.rotateAngleX + (float) Math.toRadians(xx), frontrightleg.rotateAngleY + (float) Math.toRadians(yy), frontrightleg.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 11) {
            xx = 0 + (((tickAnim - 0) / 11) * (23.79-(0)));
            yy = 0 + (((tickAnim - 0) / 11) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 11) * (0-(0)));
        }
        else if (tickAnim >= 11 && tickAnim < 20) {
            xx = 23.79 + (((tickAnim - 11) / 9) * (-11-(23.79)));
            yy = 0 + (((tickAnim - 11) / 9) * (0-(0)));
            zz = 0 + (((tickAnim - 11) / 9) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 280) {
            xx = -11 + (((tickAnim - 20) / 260) * (-11-(-11)));
            yy = 0 + (((tickAnim - 20) / 260) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 260) * (0-(0)));
        }
        else if (tickAnim >= 280 && tickAnim < 290) {
            xx = -11 + (((tickAnim - 280) / 10) * (20.5-(-11)));
            yy = 0 + (((tickAnim - 280) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 280) / 10) * (0-(0)));
        }
        else if (tickAnim >= 290 && tickAnim < 295) {
            xx = 20.5 + (((tickAnim - 290) / 5) * (-15.25-(20.5)));
            yy = 0 + (((tickAnim - 290) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 290) / 5) * (0-(0)));
        }
        else if (tickAnim >= 295 && tickAnim < 300) {
            xx = -15.25 + (((tickAnim - 295) / 5) * (0-(-15.25)));
            yy = 0 + (((tickAnim - 295) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 295) / 5) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(frontrightleg2, frontrightleg2.rotateAngleX + (float) Math.toRadians(xx), frontrightleg2.rotateAngleY + (float) Math.toRadians(yy), frontrightleg2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 0) / 20) * (105-(0)));
            yy = 0 + (((tickAnim - 0) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 20) * (-56.25-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 280) {
            xx = 105 + (((tickAnim - 20) / 260) * (105-(105)));
            yy = 0 + (((tickAnim - 20) / 260) * (0-(0)));
            zz = -56.25 + (((tickAnim - 20) / 260) * (-56.25-(-56.25)));
        }
        else if (tickAnim >= 280 && tickAnim < 290) {
            xx = 105 + (((tickAnim - 280) / 10) * (91.75755-(105)));
            yy = 0 + (((tickAnim - 280) / 10) * (0.49955-(0)));
            zz = -56.25 + (((tickAnim - 280) / 10) * (-10.88218-(-56.25)));
        }
        else if (tickAnim >= 290 && tickAnim < 295) {
            xx = 91.75755 + (((tickAnim - 290) / 5) * (69.87877-(91.75755)));
            yy = 0.49955 + (((tickAnim - 290) / 5) * (0.24978-(0.49955)));
            zz = -10.88218 + (((tickAnim - 290) / 5) * (-5.44109-(-10.88218)));
        }
        else if (tickAnim >= 295 && tickAnim < 300) {
            xx = 69.87877 + (((tickAnim - 295) / 5) * (0-(69.87877)));
            yy = 0.24978 + (((tickAnim - 295) / 5) * (0-(0.24978)));
            zz = -5.44109 + (((tickAnim - 295) / 5) * (0-(-5.44109)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(frontrightleg3, frontrightleg3.rotateAngleX + (float) Math.toRadians(xx), frontrightleg3.rotateAngleY + (float) Math.toRadians(yy), frontrightleg3.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 290) {
            xx = 0 + (((tickAnim - 0) / 290) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 290) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 290) * (0-(0)));
        }
        else if (tickAnim >= 290 && tickAnim < 295) {
            xx = 0 + (((tickAnim - 290) / 5) * (0-(0)));
            yy = 0 + (((tickAnim - 290) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 290) / 5) * (1.9-(0)));
        }
        else if (tickAnim >= 295 && tickAnim < 300) {
            xx = 0 + (((tickAnim - 295) / 5) * (0-(0)));
            yy = 0 + (((tickAnim - 295) / 5) * (0-(0)));
            zz = 1.9 + (((tickAnim - 295) / 5) * (0-(1.9)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.frontrightleg3.rotationPointX = this.frontrightleg3.rotationPointX + (float)(xx);
        this.frontrightleg3.rotationPointY = this.frontrightleg3.rotationPointY - (float)(yy);
        this.frontrightleg3.rotationPointZ = this.frontrightleg3.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 11) {
            xx = 0 + (((tickAnim - 0) / 11) * (75.05455-(0)));
            yy = 0 + (((tickAnim - 0) / 11) * (-66.99316-(0)));
            zz = 0 + (((tickAnim - 0) / 11) * (101.08776-(0)));
        }
        else if (tickAnim >= 11 && tickAnim < 20) {
            xx = 75.05455 + (((tickAnim - 11) / 9) * (113.29664-(75.05455)));
            yy = -66.99316 + (((tickAnim - 11) / 9) * (-75.38579-(-66.99316)));
            zz = 101.08776 + (((tickAnim - 11) / 9) * (99.38344-(101.08776)));
        }
        else if (tickAnim >= 20 && tickAnim < 280) {
            xx = 113.29664 + (((tickAnim - 20) / 260) * (113.29664-(113.29664)));
            yy = -75.38579 + (((tickAnim - 20) / 260) * (-75.38579-(-75.38579)));
            zz = 99.38344 + (((tickAnim - 20) / 260) * (99.38344-(99.38344)));
        }
        else if (tickAnim >= 280 && tickAnim < 283) {
            xx = 113.29664 + (((tickAnim - 280) / 3) * (72.38518-(113.29664)));
            yy = -75.38579 + (((tickAnim - 280) / 3) * (-46.65908-(-75.38579)));
            zz = 99.38344 + (((tickAnim - 280) / 3) * (70.65728-(99.38344)));
        }
        else if (tickAnim >= 283 && tickAnim < 285) {
            xx = 72.38518 + (((tickAnim - 283) / 2) * (49.77332-(72.38518)));
            yy = -46.65908 + (((tickAnim - 283) / 2) * (-37.69289-(-46.65908)));
            zz = 70.65728 + (((tickAnim - 283) / 2) * (49.69172-(70.65728)));
        }
        else if (tickAnim >= 285 && tickAnim < 290) {
            xx = 49.77332 + (((tickAnim - 285) / 5) * (12.25-(49.77332)));
            yy = -37.69289 + (((tickAnim - 285) / 5) * (0-(-37.69289)));
            zz = 49.69172 + (((tickAnim - 285) / 5) * (0-(49.69172)));
        }
        else if (tickAnim >= 290 && tickAnim < 300) {
            xx = 12.25 + (((tickAnim - 290) / 10) * (0-(12.25)));
            yy = 0 + (((tickAnim - 290) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 290) / 10) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(backleftleg, backleftleg.rotateAngleX + (float) Math.toRadians(xx), backleftleg.rotateAngleY + (float) Math.toRadians(yy), backleftleg.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 11) {
            xx = 0 + (((tickAnim - 0) / 11) * (55.82172-(0)));
            yy = 0 + (((tickAnim - 0) / 11) * (-79.31505-(0)));
            zz = 0 + (((tickAnim - 0) / 11) * (-83.56254-(0)));
        }
        else if (tickAnim >= 11 && tickAnim < 20) {
            xx = 55.82172 + (((tickAnim - 11) / 9) * (223.54584-(55.82172)));
            yy = -79.31505 + (((tickAnim - 11) / 9) * (-89.18638-(-79.31505)));
            zz = -83.56254 + (((tickAnim - 11) / 9) * (-267.84115-(-83.56254)));
        }
        else if (tickAnim >= 20 && tickAnim < 280) {
            xx = 223.54584 + (((tickAnim - 20) / 260) * (223.54584-(223.54584)));
            yy = -89.18638 + (((tickAnim - 20) / 260) * (-89.18638-(-89.18638)));
            zz = -267.84115 + (((tickAnim - 20) / 260) * (-267.84115-(-267.84115)));
        }
        else if (tickAnim >= 280 && tickAnim < 285) {
            xx = 223.54584 + (((tickAnim - 280) / 5) * (58.25776-(223.54584)));
            yy = -89.18638 + (((tickAnim - 280) / 5) * (-42.37704-(-89.18638)));
            zz = -267.84115 + (((tickAnim - 280) / 5) * (-112.4171-(-267.84115)));
        }
        else if (tickAnim >= 285 && tickAnim < 290) {
            xx = 58.25776 + (((tickAnim - 285) / 5) * (11.01-(58.25776)));
            yy = -42.37704 + (((tickAnim - 285) / 5) * (-22.14297-(-42.37704)));
            zz = -112.4171 + (((tickAnim - 285) / 5) * (35.56138-(-112.4171)));
        }
        else if (tickAnim >= 290 && tickAnim < 300) {
            xx = 11.01 + (((tickAnim - 290) / 10) * (0-(11.01)));
            yy = -22.14297 + (((tickAnim - 290) / 10) * (0-(-22.14297)));
            zz = 35.56138 + (((tickAnim - 290) / 10) * (0-(35.56138)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(backleftleg2, backleftleg2.rotateAngleX + (float) Math.toRadians(xx), backleftleg2.rotateAngleY + (float) Math.toRadians(yy), backleftleg2.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 290) {
            xx = 0 + (((tickAnim - 0) / 290) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 290) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 290) * (0-(0)));
        }
        else if (tickAnim >= 290 && tickAnim < 300) {
            xx = 0 + (((tickAnim - 290) / 10) * (0-(0)));
            yy = 0 + (((tickAnim - 290) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 290) / 10) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.backleftleg2.rotationPointX = this.backleftleg2.rotationPointX + (float)(xx);
        this.backleftleg2.rotationPointY = this.backleftleg2.rotationPointY - (float)(yy);
        this.backleftleg2.rotationPointZ = this.backleftleg2.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 6) {
            xx = 0 + (((tickAnim - 0) / 6) * (7.55641-(0)));
            yy = 0 + (((tickAnim - 0) / 6) * (40.25338-(0)));
            zz = 0 + (((tickAnim - 0) / 6) * (4.89925-(0)));
        }
        else if (tickAnim >= 6 && tickAnim < 20) {
            xx = 7.55641 + (((tickAnim - 6) / 14) * (-100.25-(7.55641)));
            yy = 40.25338 + (((tickAnim - 6) / 14) * (0-(40.25338)));
            zz = 4.89925 + (((tickAnim - 6) / 14) * (0-(4.89925)));
        }
        else if (tickAnim >= 20 && tickAnim < 280) {
            xx = -100.25 + (((tickAnim - 20) / 260) * (-100.25-(-100.25)));
            yy = 0 + (((tickAnim - 20) / 260) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 260) * (0-(0)));
        }
        else if (tickAnim >= 280 && tickAnim < 290) {
            xx = -100.25 + (((tickAnim - 280) / 10) * (33.06004-(-100.25)));
            yy = 0 + (((tickAnim - 280) / 10) * (17.87009-(0)));
            zz = 0 + (((tickAnim - 280) / 10) * (13.04741-(0)));
        }
        else if (tickAnim >= 290 && tickAnim < 300) {
            xx = 33.06004 + (((tickAnim - 290) / 10) * (0-(33.06004)));
            yy = 17.87009 + (((tickAnim - 290) / 10) * (0-(17.87009)));
            zz = 13.04741 + (((tickAnim - 290) / 10) * (0-(13.04741)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(backleftleg3, backleftleg3.rotateAngleX + (float) Math.toRadians(xx), backleftleg3.rotateAngleY + (float) Math.toRadians(yy), backleftleg3.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 6) {
            xx = 0 + (((tickAnim - 0) / 6) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 6) * (-1.325-(0)));
        }
        else if (tickAnim >= 6 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 6) / 14) * (0-(0)));
            yy = 0 + (((tickAnim - 6) / 14) * (0-(0)));
            zz = -1.325 + (((tickAnim - 6) / 14) * (0-(-1.325)));
        }
        else if (tickAnim >= 20 && tickAnim < 280) {
            xx = 0 + (((tickAnim - 20) / 260) * (0-(0)));
            yy = 0 + (((tickAnim - 20) / 260) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 260) * (0-(0)));
        }
        else if (tickAnim >= 280 && tickAnim < 288) {
            xx = 0 + (((tickAnim - 280) / 8) * (0-(0)));
            yy = 0 + (((tickAnim - 280) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 280) / 8) * (-1.525-(0)));
        }
        else if (tickAnim >= 288 && tickAnim < 290) {
            xx = 0 + (((tickAnim - 288) / 2) * (0-(0)));
            yy = 0 + (((tickAnim - 288) / 2) * (0-(0)));
            zz = -1.525 + (((tickAnim - 288) / 2) * (-0.4-(-1.525)));
        }
        else if (tickAnim >= 290 && tickAnim < 300) {
            xx = 0 + (((tickAnim - 290) / 10) * (0-(0)));
            yy = 0 + (((tickAnim - 290) / 10) * (0-(0)));
            zz = -0.4 + (((tickAnim - 290) / 10) * (0-(-0.4)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.backleftleg3.rotationPointX = this.backleftleg3.rotationPointX + (float)(xx);
        this.backleftleg3.rotationPointY = this.backleftleg3.rotationPointY - (float)(yy);
        this.backleftleg3.rotationPointZ = this.backleftleg3.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 11) {
            xx = 0 + (((tickAnim - 0) / 11) * (75.05455-(0)));
            yy = 0 + (((tickAnim - 0) / 11) * (66.99316-(0)));
            zz = 0 + (((tickAnim - 0) / 11) * (-101.08776-(0)));
        }
        else if (tickAnim >= 11 && tickAnim < 20) {
            xx = 75.05455 + (((tickAnim - 11) / 9) * (113.29664-(75.05455)));
            yy = 66.99316 + (((tickAnim - 11) / 9) * (75.38579-(66.99316)));
            zz = -101.08776 + (((tickAnim - 11) / 9) * (-99.38344-(-101.08776)));
        }
        else if (tickAnim >= 20 && tickAnim < 280) {
            xx = 113.29664 + (((tickAnim - 20) / 260) * (113.29664-(113.29664)));
            yy = 75.38579 + (((tickAnim - 20) / 260) * (75.38579-(75.38579)));
            zz = -99.38344 + (((tickAnim - 20) / 260) * (-99.38344-(-99.38344)));
        }
        else if (tickAnim >= 280 && tickAnim < 283) {
            xx = 113.29664 + (((tickAnim - 280) / 3) * (72.38518-(113.29664)));
            yy = 75.38579 + (((tickAnim - 280) / 3) * (46.65908-(75.38579)));
            zz = -99.38344 + (((tickAnim - 280) / 3) * (-70.65728-(-99.38344)));
        }
        else if (tickAnim >= 283 && tickAnim < 285) {
            xx = 72.38518 + (((tickAnim - 283) / 2) * (49.77332-(72.38518)));
            yy = 46.65908 + (((tickAnim - 283) / 2) * (37.69289-(46.65908)));
            zz = -70.65728 + (((tickAnim - 283) / 2) * (-49.69172-(-70.65728)));
        }
        else if (tickAnim >= 285 && tickAnim < 290) {
            xx = 49.77332 + (((tickAnim - 285) / 5) * (12.25-(49.77332)));
            yy = 37.69289 + (((tickAnim - 285) / 5) * (0-(37.69289)));
            zz = -49.69172 + (((tickAnim - 285) / 5) * (0-(-49.69172)));
        }
        else if (tickAnim >= 290 && tickAnim < 300) {
            xx = 12.25 + (((tickAnim - 290) / 10) * (0-(12.25)));
            yy = 0 + (((tickAnim - 290) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 290) / 10) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(backrightleg, backrightleg.rotateAngleX + (float) Math.toRadians(xx), backrightleg.rotateAngleY + (float) Math.toRadians(yy), backrightleg.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 11) {
            xx = 0 + (((tickAnim - 0) / 11) * (55.82172-(0)));
            yy = 0 + (((tickAnim - 0) / 11) * (79.31505-(0)));
            zz = 0 + (((tickAnim - 0) / 11) * (83.56254-(0)));
        }
        else if (tickAnim >= 11 && tickAnim < 20) {
            xx = 55.82172 + (((tickAnim - 11) / 9) * (223.54584-(55.82172)));
            yy = 79.31505 + (((tickAnim - 11) / 9) * (89.18638-(79.31505)));
            zz = 83.56254 + (((tickAnim - 11) / 9) * (267.84115-(83.56254)));
        }
        else if (tickAnim >= 20 && tickAnim < 280) {
            xx = 223.54584 + (((tickAnim - 20) / 260) * (223.54584-(223.54584)));
            yy = 89.18638 + (((tickAnim - 20) / 260) * (89.18638-(89.18638)));
            zz = 267.84115 + (((tickAnim - 20) / 260) * (267.84115-(267.84115)));
        }
        else if (tickAnim >= 280 && tickAnim < 285) {
            xx = 223.54584 + (((tickAnim - 280) / 5) * (58.25776-(223.54584)));
            yy = 89.18638 + (((tickAnim - 280) / 5) * (42.37704-(89.18638)));
            zz = 267.84115 + (((tickAnim - 280) / 5) * (112.4171-(267.84115)));
        }
        else if (tickAnim >= 285 && tickAnim < 290) {
            xx = 58.25776 + (((tickAnim - 285) / 5) * (11.01-(58.25776)));
            yy = 42.37704 + (((tickAnim - 285) / 5) * (22.14297-(42.37704)));
            zz = 112.4171 + (((tickAnim - 285) / 5) * (-35.56138-(112.4171)));
        }
        else if (tickAnim >= 290 && tickAnim < 300) {
            xx = 11.01 + (((tickAnim - 290) / 10) * (0-(11.01)));
            yy = 22.14297 + (((tickAnim - 290) / 10) * (0-(22.14297)));
            zz = -35.56138 + (((tickAnim - 290) / 10) * (0-(-35.56138)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(backrightleg2, backrightleg2.rotateAngleX + (float) Math.toRadians(xx), backrightleg2.rotateAngleY + (float) Math.toRadians(yy), backrightleg2.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 290 && tickAnim < 300) {
            xx = 0 + (((tickAnim - 290) / 10) * (0-(0)));
            yy = 0 + (((tickAnim - 290) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 290) / 10) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.backrightleg2.rotationPointX = this.backrightleg2.rotationPointX + (float)(xx);
        this.backrightleg2.rotationPointY = this.backrightleg2.rotationPointY - (float)(yy);
        this.backrightleg2.rotationPointZ = this.backrightleg2.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 6) {
            xx = 0 + (((tickAnim - 0) / 6) * (7.55641-(0)));
            yy = 0 + (((tickAnim - 0) / 6) * (-40.25338-(0)));
            zz = 0 + (((tickAnim - 0) / 6) * (-4.89925-(0)));
        }
        else if (tickAnim >= 6 && tickAnim < 20) {
            xx = 7.55641 + (((tickAnim - 6) / 14) * (-100.25-(7.55641)));
            yy = -40.25338 + (((tickAnim - 6) / 14) * (0-(-40.25338)));
            zz = -4.89925 + (((tickAnim - 6) / 14) * (0-(-4.89925)));
        }
        else if (tickAnim >= 20 && tickAnim < 280) {
            xx = -100.25 + (((tickAnim - 20) / 260) * (-100.25-(-100.25)));
            yy = 0 + (((tickAnim - 20) / 260) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 260) * (0-(0)));
        }
        else if (tickAnim >= 280 && tickAnim < 290) {
            xx = -100.25 + (((tickAnim - 280) / 10) * (33.06004-(-100.25)));
            yy = 0 + (((tickAnim - 280) / 10) * (-17.87009-(0)));
            zz = 0 + (((tickAnim - 280) / 10) * (-13.04741-(0)));
        }
        else if (tickAnim >= 290 && tickAnim < 300) {
            xx = 33.06004 + (((tickAnim - 290) / 10) * (0-(33.06004)));
            yy = -17.87009 + (((tickAnim - 290) / 10) * (0-(-17.87009)));
            zz = -13.04741 + (((tickAnim - 290) / 10) * (0-(-13.04741)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(backrightleg3, backrightleg3.rotateAngleX + (float) Math.toRadians(xx), backrightleg3.rotateAngleY + (float) Math.toRadians(yy), backrightleg3.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 6) {
            xx = 0 + (((tickAnim - 0) / 6) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 6) * (-1.325-(0)));
        }
        else if (tickAnim >= 6 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 6) / 14) * (0-(0)));
            yy = 0 + (((tickAnim - 6) / 14) * (0-(0)));
            zz = -1.325 + (((tickAnim - 6) / 14) * (0-(-1.325)));
        }
        else if (tickAnim >= 20 && tickAnim < 280) {
            xx = 0 + (((tickAnim - 20) / 260) * (0-(0)));
            yy = 0 + (((tickAnim - 20) / 260) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 260) * (0-(0)));
        }
        else if (tickAnim >= 280 && tickAnim < 288) {
            xx = 0 + (((tickAnim - 280) / 8) * (0-(0)));
            yy = 0 + (((tickAnim - 280) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 280) / 8) * (-1.525-(0)));
        }
        else if (tickAnim >= 288 && tickAnim < 290) {
            xx = 0 + (((tickAnim - 288) / 2) * (0-(0)));
            yy = 0 + (((tickAnim - 288) / 2) * (0-(0)));
            zz = -1.525 + (((tickAnim - 288) / 2) * (-0.4-(-1.525)));
        }
        else if (tickAnim >= 290 && tickAnim < 300) {
            xx = 0 + (((tickAnim - 290) / 10) * (0-(0)));
            yy = 0 + (((tickAnim - 290) / 10) * (0-(0)));
            zz = -0.4 + (((tickAnim - 290) / 10) * (0-(-0.4)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.backrightleg3.rotationPointX = this.backrightleg3.rotationPointX + (float)(xx);
        this.backrightleg3.rotationPointY = this.backrightleg3.rotationPointY - (float)(yy);
        this.backrightleg3.rotationPointZ = this.backrightleg3.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 0) / 8) * (12.83333-(0)));
            yy = 0 + (((tickAnim - 0) / 8) * (-11.97917-(0)));
            zz = 0 + (((tickAnim - 0) / 8) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 14) {
            xx = 12.83333 + (((tickAnim - 8) / 6) * (0.91667-(12.83333)));
            yy = -11.97917 + (((tickAnim - 8) / 6) * (-20.36458-(-11.97917)));
            zz = 0 + (((tickAnim - 8) / 6) * (0-(0)));
        }
        else if (tickAnim >= 14 && tickAnim < 18) {
            xx = 0.91667 + (((tickAnim - 14) / 4) * (-0.71429-(0.91667)));
            yy = -20.36458 + (((tickAnim - 14) / 4) * (-25.15625-(-20.36458)));
            zz = 0 + (((tickAnim - 14) / 4) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 20) {
            xx = -0.71429 + (((tickAnim - 18) / 2) * (5.5-(-0.71429)));
            yy = -25.15625 + (((tickAnim - 18) / 2) * (-28.75-(-25.15625)));
            zz = 0 + (((tickAnim - 18) / 2) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 280) {
            xx = 5.5 + (((tickAnim - 20) / 260) * (5.5-(5.5)));
            yy = -28.75 + (((tickAnim - 20) / 260) * (-28.75-(-28.75)));
            zz = 0 + (((tickAnim - 20) / 260) * (0-(0)));
        }
        else if (tickAnim >= 280 && tickAnim < 300) {
            xx = 5.5 + (((tickAnim - 280) / 20) * (0-(5.5)));
            yy = -28.75 + (((tickAnim - 280) / 20) * (0-(-28.75)));
            zz = 0 + (((tickAnim - 280) / 20) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tail, tail.rotateAngleX + (float) Math.toRadians(xx), tail.rotateAngleY + (float) Math.toRadians(yy), tail.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 0) / 20) * (5.74131-(0)));
            yy = 0 + (((tickAnim - 0) / 20) * (-51.29529-(0)));
            zz = 0 + (((tickAnim - 0) / 20) * (-17.32165-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 280) {
            xx = 5.74131 + (((tickAnim - 20) / 260) * (5.74131-(5.74131)));
            yy = -51.29529 + (((tickAnim - 20) / 260) * (-51.29529-(-51.29529)));
            zz = -17.32165 + (((tickAnim - 20) / 260) * (-17.32165-(-17.32165)));
        }
        else if (tickAnim >= 280 && tickAnim < 290) {
            xx = 5.74131 + (((tickAnim - 280) / 10) * (17.37066-(5.74131)));
            yy = -51.29529 + (((tickAnim - 280) / 10) * (-25.64764-(-51.29529)));
            zz = -17.32165 + (((tickAnim - 280) / 10) * (-8.66083-(-17.32165)));
        }
        else if (tickAnim >= 290 && tickAnim < 295) {
            xx = 17.37066 + (((tickAnim - 290) / 5) * (3.68533-(17.37066)));
            yy = -25.64764 + (((tickAnim - 290) / 5) * (-12.82382-(-25.64764)));
            zz = -8.66083 + (((tickAnim - 290) / 5) * (-4.33041-(-8.66083)));
        }
        else if (tickAnim >= 295 && tickAnim < 300) {
            xx = 3.68533 + (((tickAnim - 295) / 5) * (0-(3.68533)));
            yy = -12.82382 + (((tickAnim - 295) / 5) * (0-(-12.82382)));
            zz = -4.33041 + (((tickAnim - 295) / 5) * (0-(-4.33041)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tail2, tail2.rotateAngleX + (float) Math.toRadians(xx), tail2.rotateAngleY + (float) Math.toRadians(yy), tail2.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 0) / 20) * (0.525-(0)));
            yy = 0 + (((tickAnim - 0) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 20) * (-0.7-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 280) {
            xx = 0.525 + (((tickAnim - 20) / 260) * (0.525-(0.525)));
            yy = 0 + (((tickAnim - 20) / 260) * (0-(0)));
            zz = -0.7 + (((tickAnim - 20) / 260) * (-0.7-(-0.7)));
        }
        else if (tickAnim >= 280 && tickAnim < 300) {
            xx = 0.525 + (((tickAnim - 280) / 20) * (0-(0.525)));
            yy = 0 + (((tickAnim - 280) / 20) * (0-(0)));
            zz = -0.7 + (((tickAnim - 280) / 20) * (0-(-0.7)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.tail2.rotationPointX = this.tail2.rotationPointX + (float)(xx);
        this.tail2.rotationPointY = this.tail2.rotationPointY - (float)(yy);
        this.tail2.rotationPointZ = this.tail2.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 0) / 20) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 20) * (-29.5-(0)));
            zz = 0 + (((tickAnim - 0) / 20) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 280) {
            xx = 0 + (((tickAnim - 20) / 260) * (0-(0)));
            yy = -29.5 + (((tickAnim - 20) / 260) * (-29.5-(-29.5)));
            zz = 0 + (((tickAnim - 20) / 260) * (0-(0)));
        }
        else if (tickAnim >= 280 && tickAnim < 300) {
            xx = 0 + (((tickAnim - 280) / 20) * (0-(0)));
            yy = -29.5 + (((tickAnim - 280) / 20) * (0-(-29.5)));
            zz = 0 + (((tickAnim - 280) / 20) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tail3, tail3.rotateAngleX + (float) Math.toRadians(xx), tail3.rotateAngleY + (float) Math.toRadians(yy), tail3.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 0) / 20) * (0.225-(0)));
            yy = 0 + (((tickAnim - 0) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 20) * (-0.425-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 280) {
            xx = 0.225 + (((tickAnim - 20) / 260) * (0.225-(0.225)));
            yy = 0 + (((tickAnim - 20) / 260) * (0-(0)));
            zz = -0.425 + (((tickAnim - 20) / 260) * (-0.425-(-0.425)));
        }
        else if (tickAnim >= 280 && tickAnim < 300) {
            xx = 0.225 + (((tickAnim - 280) / 20) * (0-(0.225)));
            yy = 0 + (((tickAnim - 280) / 20) * (0-(0)));
            zz = -0.425 + (((tickAnim - 280) / 20) * (0-(-0.425)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.tail3.rotationPointX = this.tail3.rotationPointX + (float)(xx);
        this.tail3.rotationPointY = this.tail3.rotationPointY - (float)(yy);
        this.tail3.rotationPointZ = this.tail3.rotationPointZ + (float)(zz);

    }
    public void animEat(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime, double animTick) {
        EntityPrehistoricFloraAragochersis entity = (EntityPrehistoricFloraAragochersis) entitylivingbaseIn;
        int animCycle = 20;
        double tickAnim = animTick + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;
        if (tickAnim >= 0 && tickAnim < 6) {
            xx = 0 + (((tickAnim - 0) / 6) * (4.54633-(0)));
            yy = 0 + (((tickAnim - 0) / 6) * (1.52715-(0)));
            zz = 0 + (((tickAnim - 0) / 6) * (-5.27859-(0)));
        }
        else if (tickAnim >= 6 && tickAnim < 8) {
            xx = 4.54633 + (((tickAnim - 6) / 2) * (11.30919-(4.54633)));
            yy = 1.52715 + (((tickAnim - 6) / 2) * (-0.54094-(1.52715)));
            zz = -5.27859 + (((tickAnim - 6) / 2) * (-12.48848-(-5.27859)));
        }
        else if (tickAnim >= 8 && tickAnim < 10) {
            xx = 11.30919 + (((tickAnim - 8) / 2) * (11.55919-(11.30919)));
            yy = -0.54094 + (((tickAnim - 8) / 2) * (-0.54094-(-0.54094)));
            zz = -12.48848 + (((tickAnim - 8) / 2) * (-12.48848-(-12.48848)));
        }
        else if (tickAnim >= 10 && tickAnim < 12) {
            xx = 11.55919 + (((tickAnim - 10) / 2) * (7.95612-(11.55919)));
            yy = -0.54094 + (((tickAnim - 10) / 2) * (-0.36062-(-0.54094)));
            zz = -12.48848 + (((tickAnim - 10) / 2) * (-8.32565-(-12.48848)));
        }
        else if (tickAnim >= 12 && tickAnim < 20) {
            xx = 7.95612 + (((tickAnim - 12) / 8) * (0-(7.95612)));
            yy = -0.36062 + (((tickAnim - 12) / 8) * (0-(-0.36062)));
            zz = -8.32565 + (((tickAnim - 12) / 8) * (0-(-8.32565)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck, neck.rotateAngleX + (float) Math.toRadians(xx), neck.rotateAngleY + (float) Math.toRadians(yy), neck.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 6) {
            xx = 0 + (((tickAnim - 0) / 6) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 6) * (-0.075-(0)));
            zz = 0 + (((tickAnim - 0) / 6) * (0.35-(0)));
        }
        else if (tickAnim >= 6 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 6) / 2) * (0-(0)));
            yy = -0.075 + (((tickAnim - 6) / 2) * (-0.2-(-0.075)));
            zz = 0.35 + (((tickAnim - 6) / 2) * (0.35-(0.35)));
        }
        else if (tickAnim >= 8 && tickAnim < 14) {
            xx = 0 + (((tickAnim - 8) / 6) * (0-(0)));
            yy = -0.2 + (((tickAnim - 8) / 6) * (-0.39-(-0.2)));
            zz = 0.35 + (((tickAnim - 8) / 6) * (0.115-(0.35)));
        }
        else if (tickAnim >= 14 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 14) / 6) * (0-(0)));
            yy = -0.39 + (((tickAnim - 14) / 6) * (0-(-0.39)));
            zz = 0.115 + (((tickAnim - 14) / 6) * (0-(0.115)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.neck.rotationPointX = this.neck.rotationPointX + (float)(xx);
        this.neck.rotationPointY = this.neck.rotationPointY - (float)(yy);
        this.neck.rotationPointZ = this.neck.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 0 + (((tickAnim - 0) / 3) * (9.5-(0)));
            yy = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 3) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 6) {
            xx = 9.5 + (((tickAnim - 3) / 3) * (7.75-(9.5)));
            yy = 0 + (((tickAnim - 3) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 3) / 3) * (0-(0)));
        }
        else if (tickAnim >= 6 && tickAnim < 8) {
            xx = 7.75 + (((tickAnim - 6) / 2) * (-9.21186-(7.75)));
            yy = 0 + (((tickAnim - 6) / 2) * (0.84275-(0)));
            zz = 0 + (((tickAnim - 6) / 2) * (5.18211-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 12) {
            xx = -9.21186 + (((tickAnim - 8) / 4) * (13.13-(-9.21186)));
            yy = 0.84275 + (((tickAnim - 8) / 4) * (0-(0.84275)));
            zz = 5.18211 + (((tickAnim - 8) / 4) * (0-(5.18211)));
        }
        else if (tickAnim >= 12 && tickAnim < 20) {
            xx = 13.13 + (((tickAnim - 12) / 8) * (0-(13.13)));
            yy = 0 + (((tickAnim - 12) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 12) / 8) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(head, head.rotateAngleX + (float) Math.toRadians(xx), head.rotateAngleY + (float) Math.toRadians(yy), head.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 3) * (0.46-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 6) {
            xx = 0 + (((tickAnim - 3) / 3) * (0-(0)));
            yy = 0 + (((tickAnim - 3) / 3) * (0-(0)));
            zz = 0.46 + (((tickAnim - 3) / 3) * (0.2-(0.46)));
        }
        else if (tickAnim >= 6 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 6) / 2) * (0-(0)));
            yy = 0 + (((tickAnim - 6) / 2) * (0-(0)));
            zz = 0.2 + (((tickAnim - 6) / 2) * (0.2-(0.2)));
        }
        else if (tickAnim >= 8 && tickAnim < 12) {
            xx = 0 + (((tickAnim - 8) / 4) * (0-(0)));
            yy = 0 + (((tickAnim - 8) / 4) * (0-(0)));
            zz = 0.2 + (((tickAnim - 8) / 4) * (0-(0.2)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.head.rotationPointX = this.head.rotationPointX + (float)(xx);
        this.head.rotationPointY = this.head.rotationPointY - (float)(yy);
        this.head.rotationPointZ = this.head.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 4) {
            xx = 1 + (((tickAnim - 0) / 4) * (1-(1)));
            yy = 1 + (((tickAnim - 0) / 4) * (1-(1)));
            zz = 1 + (((tickAnim - 0) / 4) * (1-(1)));
        }
        else if (tickAnim >= 4 && tickAnim < 9) {
            xx = 1 + (((tickAnim - 4) / 5) * (1-(1)));
            yy = 1 + (((tickAnim - 4) / 5) * (0.1325-(1)));
            zz = 1 + (((tickAnim - 4) / 5) * (1-(1)));
        }
        else if (tickAnim >= 9 && tickAnim < 14) {
            xx = 1 + (((tickAnim - 9) / 5) * (1-(1)));
            yy = 0.1325 + (((tickAnim - 9) / 5) * (1-(0.1325)));
            zz = 1 + (((tickAnim - 9) / 5) * (1-(1)));
        }
        else {
            xx = 1;
            yy = 1;
            zz = 1;
        }
        this.eye1.setScale((float)xx, (float)yy, (float)zz);




        if (tickAnim >= 0 && tickAnim < 4) {
            xx = 1 + (((tickAnim - 0) / 4) * (1-(1)));
            yy = 1 + (((tickAnim - 0) / 4) * (1-(1)));
            zz = 1 + (((tickAnim - 0) / 4) * (1-(1)));
        }
        else if (tickAnim >= 4 && tickAnim < 9) {
            xx = 1 + (((tickAnim - 4) / 5) * (1-(1)));
            yy = 1 + (((tickAnim - 4) / 5) * (0.1325-(1)));
            zz = 1 + (((tickAnim - 4) / 5) * (1-(1)));
        }
        else if (tickAnim >= 9 && tickAnim < 14) {
            xx = 1 + (((tickAnim - 9) / 5) * (1-(1)));
            yy = 0.1325 + (((tickAnim - 9) / 5) * (1-(0.1325)));
            zz = 1 + (((tickAnim - 9) / 5) * (1-(1)));
        }
        else {
            xx = 1;
            yy = 1;
            zz = 1;
        }
        this.eye2.setScale((float)xx, (float)yy, (float)zz);




        if (tickAnim >= 0 && tickAnim < 6) {
            xx = 0 + (((tickAnim - 0) / 6) * (9.25-(0)));
            yy = 0 + (((tickAnim - 0) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 6) * (0-(0)));
        }
        else if (tickAnim >= 6 && tickAnim < 8) {
            xx = 9.25 + (((tickAnim - 6) / 2) * (30.5-(9.25)));
            yy = 0 + (((tickAnim - 6) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 6) / 2) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 12) {
            xx = 30.5 + (((tickAnim - 8) / 4) * (0-(30.5)));
            yy = 0 + (((tickAnim - 8) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 4) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(jaw, jaw.rotateAngleX + (float) Math.toRadians(xx), jaw.rotateAngleY + (float) Math.toRadians(yy), jaw.rotateAngleZ + (float) Math.toRadians(zz));

    }
    public void animWalking(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime) {
        EntityPrehistoricFloraAragochersis entity = (EntityPrehistoricFloraAragochersis) entitylivingbaseIn;
        int animCycle = 45;
        double tickAnim = (entity.ticksExisted + entity.getTickOffset()) - (int) (Math.floor((double) (entity.ticksExisted + entity.getTickOffset()) / (double) animCycle) * (double) animCycle) + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;
        this.setRotateAngle(main, main.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*160/0.5-120))*-1.8), main.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*160-120))*-2), main.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*160-180))*-2.5));

        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*160-159))*0.05 + (((tickAnim - 0) / 3) * (0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*160-159))*0.05-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*160-159))*0.05)));
            yy = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*160/0.2-159))*-0.005 + (((tickAnim - 0) / 3) * (0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*160/0.5-159))*-0.15-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*160/0.2-159))*-0.005)));
            zz = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*160/0.5-159))*-0.3 + (((tickAnim - 0) / 3) * (0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*160/0.5-159))*-0.3-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*160/0.5-159))*-0.3)));
        }
        else if (tickAnim >= 3 && tickAnim < 15) {
            xx = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*160-159))*0.05 + (((tickAnim - 3) / 12) * (0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*160-159))*0.05-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*160-159))*0.05)));
            yy = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*160/0.5-159))*-0.15 + (((tickAnim - 3) / 12) * (0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*160/0.5-159))*-0.15-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*160/0.5-159))*-0.15)));
            zz = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*160/0.5-159))*-0.3 + (((tickAnim - 3) / 12) * (0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*160/0.5-159))*-0.3-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*160/0.5-159))*-0.3)));
        }
        else if (tickAnim >= 15 && tickAnim < 20) {
            xx = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*160-159))*0.05 + (((tickAnim - 15) / 5) * (0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*160-159))*0.05-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*160-159))*0.05)));
            yy = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*160/0.5-159))*-0.15 + (((tickAnim - 15) / 5) * (-0.025+Math.sin((Math.PI/180)*(((double)tickAnim/20)*160/0.2-159))*0.05-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*160/0.5-159))*-0.15)));
            zz = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*160/0.5-159))*-0.3 + (((tickAnim - 15) / 5) * (0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*160/0.5-159))*-0.3-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*160/0.5-159))*-0.3)));
        }
        else if (tickAnim >= 20 && tickAnim < 25) {
            xx = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*160-159))*0.05 + (((tickAnim - 20) / 5) * (0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*160-159))*0.05-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*160-159))*0.05)));
            yy = -0.025+Math.sin((Math.PI/180)*(((double)tickAnim/20)*160/0.2-159))*0.05 + (((tickAnim - 20) / 5) * (0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*160/0.5-159))*-0.15-(-0.025+Math.sin((Math.PI/180)*(((double)tickAnim/20)*160/0.2-159))*0.05)));
            zz = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*160/0.5-159))*-0.3 + (((tickAnim - 20) / 5) * (0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*160/0.5-159))*-0.3-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*160/0.5-159))*-0.3)));
        }
        else if (tickAnim >= 25 && tickAnim < 38) {
            xx = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*160-159))*0.05 + (((tickAnim - 25) / 13) * (0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*160-159))*0.05-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*160-159))*0.05)));
            yy = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*160/0.5-159))*-0.15 + (((tickAnim - 25) / 13) * (0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*160/0.5-159))*-0.15-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*160/0.5-159))*-0.15)));
            zz = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*160/0.5-159))*-0.3 + (((tickAnim - 25) / 13) * (0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*160/0.5-159))*-0.3-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*160/0.5-159))*-0.3)));
        }
        else if (tickAnim >= 38 && tickAnim < 45) {
            xx = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*160-159))*0.05 + (((tickAnim - 38) / 7) * (0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*160-159))*0.05-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*160-159))*0.05)));
            yy = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*160/0.5-159))*-0.15 + (((tickAnim - 38) / 7) * (-0.05+Math.sin((Math.PI/180)*(((double)tickAnim/20)*160/0.2-50))*-0.05-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*160/0.5-159))*-0.15)));
            zz = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*160/0.5-159))*-0.3 + (((tickAnim - 38) / 7) * (0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*160/0.5-159))*-0.3-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*160/0.5-159))*-0.3)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.main.rotationPointX = this.main.rotationPointX + (float)(xx);
        this.main.rotationPointY = this.main.rotationPointY - (float)(yy);
        this.main.rotationPointZ = this.main.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 18) {
            xx = 0 + (((tickAnim - 0) / 18) * (0-(0)));
            yy = 19.5 + (((tickAnim - 0) / 18) * (-21.17-(19.5)));
            zz = 0 + (((tickAnim - 0) / 18) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 23) {
            xx = 0 + (((tickAnim - 18) / 5) * (0-(0)));
            yy = -21.17 + (((tickAnim - 18) / 5) * (-30.5-(-21.17)));
            zz = 0 + (((tickAnim - 18) / 5) * (0-(0)));
        }
        else if (tickAnim >= 23 && tickAnim < 34) {
            xx = 0 + (((tickAnim - 23) / 11) * (127.1636+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50+10))*-150-(0)));
            yy = -30.5 + (((tickAnim - 23) / 11) * (-60.3269+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50-50))*100-(-30.5)));
            zz = 0 + (((tickAnim - 23) / 11) * (-53.7435+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*59-(0)));
        }
        else if (tickAnim >= 34 && tickAnim < 45) {
            xx = 127.1636+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50+10))*-150 + (((tickAnim - 34) / 11) * (0-(127.1636+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50+10))*-150)));
            yy = -60.3269+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50-50))*100 + (((tickAnim - 34) / 11) * (19.5-(-60.3269+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50-50))*100)));
            zz = -53.7435+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*59 + (((tickAnim - 34) / 11) * (0-(-53.7435+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*59)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(frontleftleg, frontleftleg.rotateAngleX + (float) Math.toRadians(xx), frontleftleg.rotateAngleY + (float) Math.toRadians(yy), frontleftleg.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 18) {
            xx = 0 + (((tickAnim - 0) / 18) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 18) * (0-(0)));
            zz = 23.75 + (((tickAnim - 0) / 18) * (-16.37-(23.75)));
        }
        else if (tickAnim >= 18 && tickAnim < 23) {
            xx = 0 + (((tickAnim - 18) / 5) * (0-(0)));
            yy = 0 + (((tickAnim - 18) / 5) * (0-(0)));
            zz = -16.37 + (((tickAnim - 18) / 5) * (-25-(-16.37)));
        }
        else if (tickAnim >= 23 && tickAnim < 31) {
            xx = 0 + (((tickAnim - 23) / 8) * (75-(0)));
            yy = 0 + (((tickAnim - 23) / 8) * (0-(0)));
            zz = -25 + (((tickAnim - 23) / 8) * (1.40625-(-25)));
        }
        else if (tickAnim >= 31 && tickAnim < 45) {
            xx = 75 + (((tickAnim - 31) / 14) * (0-(75)));
            yy = 0 + (((tickAnim - 31) / 14) * (0-(0)));
            zz = 1.40625 + (((tickAnim - 31) / 14) * (23.75-(1.40625)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(frontleftleg3, frontleftleg3.rotateAngleX + (float) Math.toRadians(xx), frontleftleg3.rotateAngleY + (float) Math.toRadians(yy), frontleftleg3.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 9) {
            xx = -0.05 + (((tickAnim - 0) / 9) * (-0.03-(-0.05)));
            yy = 0 + (((tickAnim - 0) / 9) * (0-(0)));
            zz = 0.4 + (((tickAnim - 0) / 9) * (-0.115-(0.4)));
        }
        else if (tickAnim >= 9 && tickAnim < 18) {
            xx = -0.03 + (((tickAnim - 9) / 9) * (-0.01-(-0.03)));
            yy = 0 + (((tickAnim - 9) / 9) * (0-(0)));
            zz = -0.115 + (((tickAnim - 9) / 9) * (0.025-(-0.115)));
        }
        else if (tickAnim >= 18 && tickAnim < 23) {
            xx = -0.01 + (((tickAnim - 18) / 5) * (0-(-0.01)));
            yy = 0 + (((tickAnim - 18) / 5) * (0-(0)));
            zz = 0.025 + (((tickAnim - 18) / 5) * (0-(0.025)));
        }
        else if (tickAnim >= 23 && tickAnim < 31) {
            xx = 0 + (((tickAnim - 23) / 8) * (-0.05-(0)));
            yy = 0 + (((tickAnim - 23) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 23) / 8) * (1.475-(0)));
        }
        else if (tickAnim >= 31 && tickAnim < 45) {
            xx = -0.05 + (((tickAnim - 31) / 14) * (-0.05-(-0.05)));
            yy = 0 + (((tickAnim - 31) / 14) * (0-(0)));
            zz = 1.475 + (((tickAnim - 31) / 14) * (0.4-(1.475)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.frontleftleg3.rotationPointX = this.frontleftleg3.rotationPointX + (float)(xx);
        this.frontleftleg3.rotationPointY = this.frontleftleg3.rotationPointY - (float)(yy);
        this.frontleftleg3.rotationPointZ = this.frontleftleg3.rotationPointZ + (float)(zz);



        this.setRotateAngle(neck, neck.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*160/0.5-120))*2.9), neck.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*160-110))*3), neck.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*160-180))*2));



        if (tickAnim >= 0 && tickAnim < 23) {
            xx = 0 + (((tickAnim - 0) / 23) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 23) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 23) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(frontleftleg2, frontleftleg2.rotateAngleX + (float) Math.toRadians(xx), frontleftleg2.rotateAngleY + (float) Math.toRadians(yy), frontleftleg2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            yy = 21.17 + (((tickAnim - 0) / 3) * (30.5-(21.17)));
            zz = 0 + (((tickAnim - 0) / 3) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 3) / 12) * (40.8843+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50+12))*-80-(0)));
            yy = 30.5 + (((tickAnim - 3) / 12) * (62.045+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*-100-(30.5)));
            zz = 0 + (((tickAnim - 3) / 12) * (37.405+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*-59-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 25) {
            xx = 40.8843+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50+12))*-80 + (((tickAnim - 15) / 10) * (0-(40.8843+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50+12))*-80)));
            yy = 62.045+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*-100 + (((tickAnim - 15) / 10) * (-19.5-(62.045+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*-100)));
            zz = 37.405+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*-59 + (((tickAnim - 15) / 10) * (0-(37.405+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*-59)));
        }
        else if (tickAnim >= 25 && tickAnim < 45) {
            xx = 0 + (((tickAnim - 25) / 20) * (0-(0)));
            yy = -19.5 + (((tickAnim - 25) / 20) * (21.17-(-19.5)));
            zz = 0 + (((tickAnim - 25) / 20) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(frontrightleg, frontrightleg.rotateAngleX + (float) Math.toRadians(xx), frontrightleg.rotateAngleY + (float) Math.toRadians(yy), frontrightleg.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            zz = 16.37 + (((tickAnim - 0) / 3) * (25-(16.37)));
        }
        else if (tickAnim >= 3 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 3) / 12) * (75-(0)));
            yy = 0 + (((tickAnim - 3) / 12) * (0-(0)));
            zz = 25 + (((tickAnim - 3) / 12) * (1.40625-(25)));
        }
        else if (tickAnim >= 15 && tickAnim < 25) {
            xx = 75 + (((tickAnim - 15) / 10) * (0-(75)));
            yy = 0 + (((tickAnim - 15) / 10) * (0-(0)));
            zz = 1.40625 + (((tickAnim - 15) / 10) * (-23.75-(1.40625)));
        }
        else if (tickAnim >= 25 && tickAnim < 45) {
            xx = 0 + (((tickAnim - 25) / 20) * (0-(0)));
            yy = 0 + (((tickAnim - 25) / 20) * (0-(0)));
            zz = -23.75 + (((tickAnim - 25) / 20) * (16.37-(-23.75)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(frontrightleg3, frontrightleg3.rotateAngleX + (float) Math.toRadians(xx), frontrightleg3.rotateAngleY + (float) Math.toRadians(yy), frontrightleg3.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 3) {
            xx = -0.01 + (((tickAnim - 0) / 3) * (0-(-0.01)));
            yy = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            zz = 0.025 + (((tickAnim - 0) / 3) * (0-(0.025)));
        }
        else if (tickAnim >= 3 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 3) / 12) * (-0.05-(0)));
            yy = 0 + (((tickAnim - 3) / 12) * (0-(0)));
            zz = 0 + (((tickAnim - 3) / 12) * (1.475-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 25) {
            xx = -0.05 + (((tickAnim - 15) / 10) * (-0.05-(-0.05)));
            yy = 0 + (((tickAnim - 15) / 10) * (0-(0)));
            zz = 1.475 + (((tickAnim - 15) / 10) * (0-(1.475)));
        }
        else if (tickAnim >= 25 && tickAnim < 45) {
            xx = -0.05 + (((tickAnim - 25) / 20) * (-0.01-(-0.05)));
            yy = 0 + (((tickAnim - 25) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 25) / 20) * (0.025-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.frontrightleg3.rotationPointX = this.frontrightleg3.rotationPointX + (float)(xx);
        this.frontrightleg3.rotationPointY = this.frontrightleg3.rotationPointY - (float)(yy);
        this.frontrightleg3.rotationPointZ = this.frontrightleg3.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 8) {
            xx = 6.25 + (((tickAnim - 0) / 8) * (25.83882-(6.25)));
            yy = -28.5 + (((tickAnim - 0) / 8) * (-40.1289+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*100-(-28.5)));
            zz = 0 + (((tickAnim - 0) / 8) * (3.7725+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*-10-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 17) {
            xx = 25.83882 + (((tickAnim - 8) / 9) * (0-(25.83882)));
            yy = -40.1289+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*100 + (((tickAnim - 8) / 9) * (19.5-(-40.1289+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*100)));
            zz = 3.7725+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*-10 + (((tickAnim - 8) / 9) * (0-(3.7725+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*-10)));
        }
        else if (tickAnim >= 17 && tickAnim < 45) {
            xx = 0 + (((tickAnim - 17) / 28) * (6.25-(0)));
            yy = 19.5 + (((tickAnim - 17) / 28) * (-28.5-(19.5)));
            zz = 0 + (((tickAnim - 17) / 28) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(backleftleg, backleftleg.rotateAngleX + (float) Math.toRadians(xx), backleftleg.rotateAngleY + (float) Math.toRadians(yy), backleftleg.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 18) {
            xx = 0 + (((tickAnim - 0) / 18) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 18) * (0.275-(0)));
            zz = 0 + (((tickAnim - 0) / 18) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 24) {
            xx = 0 + (((tickAnim - 18) / 6) * (0-(0)));
            yy = 0.275 + (((tickAnim - 18) / 6) * (-0.435-(0.275)));
            zz = 0 + (((tickAnim - 18) / 6) * (0-(0)));
        }
        else if (tickAnim >= 24 && tickAnim < 30) {
            xx = 0 + (((tickAnim - 24) / 6) * (0-(0)));
            yy = -0.435 + (((tickAnim - 24) / 6) * (-0.545-(-0.435)));
            zz = 0 + (((tickAnim - 24) / 6) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 45) {
            xx = 0 + (((tickAnim - 30) / 15) * (0-(0)));
            yy = -0.545 + (((tickAnim - 30) / 15) * (0-(-0.545)));
            zz = 0 + (((tickAnim - 30) / 15) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.backleftleg2.rotationPointX = this.backleftleg2.rotationPointX + (float)(xx);
        this.backleftleg2.rotationPointY = this.backleftleg2.rotationPointY - (float)(yy);
        this.backleftleg2.rotationPointZ = this.backleftleg2.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 4) {
            xx = -18.59491 + (((tickAnim - 0) / 4) * (-55.80812-(-18.59491)));
            yy = -5.68889 + (((tickAnim - 0) / 4) * (-2.69474-(-5.68889)));
            zz = 8.16011 + (((tickAnim - 0) / 4) * (10.57584-(8.16011)));
        }
        else if (tickAnim >= 4 && tickAnim < 10) {
            xx = -55.80812 + (((tickAnim - 4) / 6) * (-15.15406-(-55.80812)));
            yy = -2.69474 + (((tickAnim - 4) / 6) * (-1.34737-(-2.69474)));
            zz = 10.57584 + (((tickAnim - 4) / 6) * (11.66292-(10.57584)));
        }
        else if (tickAnim >= 10 && tickAnim < 17) {
            xx = -15.15406 + (((tickAnim - 10) / 7) * (0-(-15.15406)));
            yy = -1.34737 + (((tickAnim - 10) / 7) * (0-(-1.34737)));
            zz = 11.66292 + (((tickAnim - 10) / 7) * (-7.75-(11.66292)));
        }
        else if (tickAnim >= 17 && tickAnim < 30) {
            xx = 0 + (((tickAnim - 17) / 13) * (1.16426-(0)));
            yy = 0 + (((tickAnim - 17) / 13) * (2.44878-(0)));
            zz = -7.75 + (((tickAnim - 17) / 13) * (10.79403-(-7.75)));
        }
        else if (tickAnim >= 30 && tickAnim < 45) {
            xx = 1.16426 + (((tickAnim - 30) / 15) * (-18.59491-(1.16426)));
            yy = 2.44878 + (((tickAnim - 30) / 15) * (-5.68889-(2.44878)));
            zz = 10.79403 + (((tickAnim - 30) / 15) * (8.16011-(10.79403)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(backleftleg3, backleftleg3.rotateAngleX + (float) Math.toRadians(xx), backleftleg3.rotateAngleY + (float) Math.toRadians(yy), backleftleg3.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 4) {
            xx = 0 + (((tickAnim - 0) / 4) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 4) * (-1.725-(0)));
        }
        else if (tickAnim >= 4 && tickAnim < 17) {
            xx = 0 + (((tickAnim - 4) / 13) * (0-(0)));
            yy = 0 + (((tickAnim - 4) / 13) * (0-(0)));
            zz = -1.725 + (((tickAnim - 4) / 13) * (0-(-1.725)));
        }
        else if (tickAnim >= 17 && tickAnim < 30) {
            xx = 0 + (((tickAnim - 17) / 13) * (0-(0)));
            yy = 0 + (((tickAnim - 17) / 13) * (0-(0)));
            zz = 0 + (((tickAnim - 17) / 13) * (0.275-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 45) {
            xx = 0 + (((tickAnim - 30) / 15) * (0-(0)));
            yy = 0 + (((tickAnim - 30) / 15) * (0-(0)));
            zz = 0.275 + (((tickAnim - 30) / 15) * (0-(0.275)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.backleftleg3.rotationPointX = this.backleftleg3.rotationPointX + (float)(xx);
        this.backleftleg3.rotationPointY = this.backleftleg3.rotationPointY - (float)(yy);
        this.backleftleg3.rotationPointZ = this.backleftleg3.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 21) {
            xx = 0 + (((tickAnim - 0) / 21) * (6.25-(0)));
            yy = -6.25 + (((tickAnim - 0) / 21) * (28.5-(-6.25)));
            zz = 0 + (((tickAnim - 0) / 21) * (0-(0)));
        }
        else if (tickAnim >= 21 && tickAnim < 31) {
            xx = 6.25 + (((tickAnim - 21) / 10) * (25.83882-(6.25)));
            yy = 28.5 + (((tickAnim - 21) / 10) * (174.0461+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*-200-(28.5)));
            zz = 0 + (((tickAnim - 21) / 10) * (3.7725+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*-10-(0)));
        }
        else if (tickAnim >= 31 && tickAnim < 39) {
            xx = 25.83882 + (((tickAnim - 31) / 8) * (0-(25.83882)));
            yy = 174.0461+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*-200 + (((tickAnim - 31) / 8) * (-19.5-(174.0461+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*-200)));
            zz = 3.7725+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*-10 + (((tickAnim - 31) / 8) * (0-(3.7725+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*-10)));
        }
        else if (tickAnim >= 39 && tickAnim < 45) {
            xx = 0 + (((tickAnim - 39) / 6) * (0-(0)));
            yy = -19.5 + (((tickAnim - 39) / 6) * (-6.25-(-19.5)));
            zz = 0 + (((tickAnim - 39) / 6) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(backrightleg, backrightleg.rotateAngleX + (float) Math.toRadians(xx), backrightleg.rotateAngleY + (float) Math.toRadians(yy), backrightleg.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 0) / 5) * (0-(0)));
            yy = -0.125 + (((tickAnim - 0) / 5) * (-0.645-(-0.125)));
            zz = 0 + (((tickAnim - 0) / 5) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 5) / 5) * (0-(0)));
            yy = -0.645 + (((tickAnim - 5) / 5) * (-0.42-(-0.645)));
            zz = 0 + (((tickAnim - 5) / 5) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 21) {
            xx = 0 + (((tickAnim - 10) / 11) * (0-(0)));
            yy = -0.42 + (((tickAnim - 10) / 11) * (0-(-0.42)));
            zz = 0 + (((tickAnim - 10) / 11) * (0-(0)));
        }
        else if (tickAnim >= 21 && tickAnim < 38) {
            xx = 0 + (((tickAnim - 21) / 17) * (0-(0)));
            yy = 0 + (((tickAnim - 21) / 17) * (0-(0)));
            zz = 0 + (((tickAnim - 21) / 17) * (0-(0)));
        }
        else if (tickAnim >= 38 && tickAnim < 45) {
            xx = 0 + (((tickAnim - 38) / 7) * (0-(0)));
            yy = 0 + (((tickAnim - 38) / 7) * (-0.125-(0)));
            zz = 0 + (((tickAnim - 38) / 7) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.backrightleg2.rotationPointX = this.backrightleg2.rotationPointX + (float)(xx);
        this.backrightleg2.rotationPointY = this.backrightleg2.rotationPointY - (float)(yy);
        this.backrightleg2.rotationPointZ = this.backrightleg2.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 9) {
            xx = 0 + (((tickAnim - 0) / 9) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 9) * (-3-(0)));
            zz = 6.25 + (((tickAnim - 0) / 9) * (0-(6.25)));
        }
        else if (tickAnim >= 9 && tickAnim < 21) {
            xx = 0 + (((tickAnim - 9) / 12) * (-18.59491-(0)));
            yy = -3 + (((tickAnim - 9) / 12) * (-5.68889-(-3)));
            zz = 0 + (((tickAnim - 9) / 12) * (8.16011-(0)));
        }
        else if (tickAnim >= 21 && tickAnim < 26) {
            xx = -18.59491 + (((tickAnim - 21) / 5) * (-55.80812-(-18.59491)));
            yy = -5.68889 + (((tickAnim - 21) / 5) * (-2.69474-(-5.68889)));
            zz = 8.16011 + (((tickAnim - 21) / 5) * (10.57584-(8.16011)));
        }
        else if (tickAnim >= 26 && tickAnim < 33) {
            xx = -55.80812 + (((tickAnim - 26) / 7) * (-15.15406-(-55.80812)));
            yy = -2.69474 + (((tickAnim - 26) / 7) * (-1.34737-(-2.69474)));
            zz = 10.57584 + (((tickAnim - 26) / 7) * (11.66292-(10.57584)));
        }
        else if (tickAnim >= 33 && tickAnim < 39) {
            xx = -15.15406 + (((tickAnim - 33) / 6) * (0-(-15.15406)));
            yy = -1.34737 + (((tickAnim - 33) / 6) * (0-(-1.34737)));
            zz = 11.66292 + (((tickAnim - 33) / 6) * (12.75-(11.66292)));
        }
        else if (tickAnim >= 39 && tickAnim < 45) {
            xx = 0 + (((tickAnim - 39) / 6) * (0-(0)));
            yy = 0 + (((tickAnim - 39) / 6) * (0-(0)));
            zz = 12.75 + (((tickAnim - 39) / 6) * (6.25-(12.75)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(backrightleg3, backrightleg3.rotateAngleX + (float) Math.toRadians(xx), backrightleg3.rotateAngleY + (float) Math.toRadians(yy), backrightleg3.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 9) {
            xx = 0 + (((tickAnim - 0) / 9) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 9) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 9) * (0.225-(0)));
        }
        else if (tickAnim >= 9 && tickAnim < 21) {
            xx = 0 + (((tickAnim - 9) / 12) * (0-(0)));
            yy = 0 + (((tickAnim - 9) / 12) * (0-(0)));
            zz = 0.225 + (((tickAnim - 9) / 12) * (0-(0.225)));
        }
        else if (tickAnim >= 21 && tickAnim < 26) {
            xx = 0 + (((tickAnim - 21) / 5) * (0-(0)));
            yy = 0 + (((tickAnim - 21) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 21) / 5) * (-1.725-(0)));
        }
        else if (tickAnim >= 26 && tickAnim < 39) {
            xx = 0 + (((tickAnim - 26) / 13) * (0-(0)));
            yy = 0 + (((tickAnim - 26) / 13) * (0-(0)));
            zz = -1.725 + (((tickAnim - 26) / 13) * (0-(-1.725)));
        }
        else if (tickAnim >= 39 && tickAnim < 45) {
            xx = 0 + (((tickAnim - 39) / 6) * (0-(0)));
            yy = 0 + (((tickAnim - 39) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 39) / 6) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.backrightleg3.rotationPointX = this.backrightleg3.rotationPointX + (float)(xx);
        this.backrightleg3.rotationPointY = this.backrightleg3.rotationPointY - (float)(yy);
        this.backrightleg3.rotationPointZ = this.backrightleg3.rotationPointZ + (float)(zz);



        this.setRotateAngle(tail, tail.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*160/0.5-120))*3.5), tail.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*160-120))*4), tail.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*160-180))*-2));


        this.setRotateAngle(tail2, tail2.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*160/0.5-180))*3.5), tail2.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*160-180))*4), tail2.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*160-180))*-2));


        this.setRotateAngle(tail3, tail3.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*160/0.5-230))*5.5), tail3.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*160-230))*9), tail3.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*160-180))*-2));


    }


        public void animate(IAnimatedEntity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        EntityPrehistoricFloraAragochersis e = (EntityPrehistoricFloraAragochersis) entity;
        animator.update(entity);


    }
}
