package net.lepidodendron.entity.model.entity;

import net.ilexiconn.llibrary.client.model.ModelAnimator;
import net.ilexiconn.llibrary.client.model.tools.AdvancedModelRenderer;
import net.ilexiconn.llibrary.server.animation.IAnimatedEntity;
import net.lepidodendron.entity.EntityPrehistoricFloraAnomalochelys;
import net.lepidodendron.entity.model.ModelBasePalaeopedia;
import net.minecraft.client.model.ModelBox;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;

public class ModelAnomalochelys extends ModelBasePalaeopedia {
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
    private final AdvancedModelRenderer neck;
    private final AdvancedModelRenderer neck2;
    private final AdvancedModelRenderer head;
    private final AdvancedModelRenderer cube_r31;
    private final AdvancedModelRenderer cube_r32;
    private final AdvancedModelRenderer cube_r33;
    private final AdvancedModelRenderer cube_r34;
    private final AdvancedModelRenderer cube_r35;
    private final AdvancedModelRenderer cube_r36;
    private final AdvancedModelRenderer eyeright;
    private final AdvancedModelRenderer cube_r37;
    private final AdvancedModelRenderer eyeleft;
    private final AdvancedModelRenderer cube_r38;
    private final AdvancedModelRenderer jaw;
    private final AdvancedModelRenderer cube_r39;
    private final AdvancedModelRenderer cube_r40;
    private final AdvancedModelRenderer cube_r41;
    private final AdvancedModelRenderer cube_r42;
    private final AdvancedModelRenderer bone;
    private final AdvancedModelRenderer cube_r43;
    private final AdvancedModelRenderer cube_r44;
    private final AdvancedModelRenderer cube_r45;
    private final AdvancedModelRenderer cube_r46;
    private final AdvancedModelRenderer cube_r47;
    private final AdvancedModelRenderer cube_r48;
    private final AdvancedModelRenderer cube_r49;
    private final AdvancedModelRenderer frontrightleg;
    private final AdvancedModelRenderer frontrightleg2;
    private final AdvancedModelRenderer frontrightleg3;
    private final AdvancedModelRenderer frontleftleg;
    private final AdvancedModelRenderer frontleftleg2;
    private final AdvancedModelRenderer frontleftleg3;
    private final AdvancedModelRenderer backrightleg;
    private final AdvancedModelRenderer backrightleg2;
    private final AdvancedModelRenderer backrightleg3;
    private final AdvancedModelRenderer backleftleg;
    private final AdvancedModelRenderer backleftleg2;
    private final AdvancedModelRenderer backleftleg3;
    private final AdvancedModelRenderer tail;
    private final AdvancedModelRenderer tail2;

    private ModelAnimator animator;

    public ModelAnomalochelys() {
        this.textureWidth = 80;
        this.textureHeight = 80;

        this.main = new AdvancedModelRenderer(this);
        this.main.setRotationPoint(0.0F, 24.45F, 0.0F);
        this.main.cubeList.add(new ModelBox(main, 0, 0, -4.5F, -6.4F, -6.0F, 9, 2, 10, 0.01F, false));
        this.main.cubeList.add(new ModelBox(main, 30, 12, -2.5F, -12.3F, -4.0F, 5, 2, 8, 0.0F, false));

        this.cube_r1 = new AdvancedModelRenderer(this);
        this.cube_r1.setRotationPoint(0.0F, -4.4F, -6.0F);
        this.main.addChild(cube_r1);
        this.setRotateAngle(cube_r1, -0.2618F, 0.0F, 0.0F);
        this.cube_r1.cubeList.add(new ModelBox(cube_r1, 26, 42, -3.0F, -4.0F, -6.0F, 6, 4, 6, 0.0F, false));

        this.cube_r2 = new AdvancedModelRenderer(this);
        this.cube_r2.setRotationPoint(0.5F, -4.4F, 4.0F);
        this.main.addChild(cube_r2);
        this.setRotateAngle(cube_r2, 0.2618F, 0.0F, 0.0F);
        this.cube_r2.cubeList.add(new ModelBox(cube_r2, 0, 44, -4.0F, -4.0F, 0.0F, 7, 4, 5, 0.0F, false));

        this.cube_r3 = new AdvancedModelRenderer(this);
        this.cube_r3.setRotationPoint(-0.5F, -12.3F, 4.0F);
        this.main.addChild(cube_r3);
        this.setRotateAngle(cube_r3, -0.2967F, 0.0F, 0.0F);
        this.cube_r3.cubeList.add(new ModelBox(cube_r3, 26, 24, -2.0F, 0.0F, 0.0F, 5, 2, 8, 0.0F, false));

        this.cube_r4 = new AdvancedModelRenderer(this);
        this.cube_r4.setRotationPoint(-0.5F, -12.3F, -4.0F);
        this.main.addChild(cube_r4);
        this.setRotateAngle(cube_r4, 0.2618F, 0.0F, 0.0F);
        this.cube_r4.cubeList.add(new ModelBox(cube_r4, 0, 24, -2.0F, 0.0F, -8.0F, 5, 3, 8, 0.0F, false));

        this.cube_r5 = new AdvancedModelRenderer(this);
        this.cube_r5.setRotationPoint(4.5F, -4.4F, 0.0F);
        this.main.addChild(cube_r5);
        this.setRotateAngle(cube_r5, 0.0F, 0.0F, -0.9163F);
        this.cube_r5.cubeList.add(new ModelBox(cube_r5, 0, 12, 0.0F, -2.0F, -6.0F, 5, 2, 10, 0.0F, true));

        this.cube_r6 = new AdvancedModelRenderer(this);
        this.cube_r6.setRotationPoint(-4.5F, -4.4F, 0.0F);
        this.main.addChild(cube_r6);
        this.setRotateAngle(cube_r6, 0.0F, 0.0F, 0.9163F);
        this.cube_r6.cubeList.add(new ModelBox(cube_r6, 0, 12, -5.0F, -2.0F, -6.0F, 5, 2, 10, 0.0F, false));

        this.cube_r7 = new AdvancedModelRenderer(this);
        this.cube_r7.setRotationPoint(2.5F, -12.3F, -4.0F);
        this.main.addChild(cube_r7);
        this.setRotateAngle(cube_r7, 0.2461F, -0.0851F, 0.5163F);
        this.cube_r7.cubeList.add(new ModelBox(cube_r7, 38, 0, 0.0F, 0.0F, -8.0F, 5, 1, 8, 0.0F, true));

        this.cube_r8 = new AdvancedModelRenderer(this);
        this.cube_r8.setRotationPoint(2.5F, -12.3F, 0.0F);
        this.main.addChild(cube_r8);
        this.setRotateAngle(cube_r8, 0.0F, 0.0F, 0.5236F);
        this.cube_r8.cubeList.add(new ModelBox(cube_r8, 0, 35, 0.0F, 0.0F, -4.0F, 5, 1, 8, 0.0F, true));

        this.cube_r9 = new AdvancedModelRenderer(this);
        this.cube_r9.setRotationPoint(11.6017F, -6.1F, 0.4763F);
        this.main.addChild(cube_r9);
        this.setRotateAngle(cube_r9, 0.0F, 1.5708F, 0.1745F);
        this.cube_r9.cubeList.add(new ModelBox(cube_r9, 24, 52, -3.0F, -3.0F, -7.0F, 10, 3, 3, 0.01F, true));

        this.cube_r10 = new AdvancedModelRenderer(this);
        this.cube_r10.setRotationPoint(6.2874F, -6.896F, -13.5019F);
        this.main.addChild(cube_r10);
        this.setRotateAngle(cube_r10, 2.9317F, -0.1729F, -2.9335F);
        this.cube_r10.cubeList.add(new ModelBox(cube_r10, 60, 60, 0.0F, -1.425F, -7.425F, 3, 1, 4, -0.01F, true));

        this.cube_r11 = new AdvancedModelRenderer(this);
        this.cube_r11.setRotationPoint(-6.2874F, -6.896F, -13.5019F);
        this.main.addChild(cube_r11);
        this.setRotateAngle(cube_r11, 2.9317F, 0.1729F, 2.9335F);
        this.cube_r11.cubeList.add(new ModelBox(cube_r11, 60, 60, -3.0F, -1.425F, -7.425F, 3, 1, 4, -0.01F, false));

        this.cube_r12 = new AdvancedModelRenderer(this);
        this.cube_r12.setRotationPoint(5.5874F, -7.296F, -13.1019F);
        this.main.addChild(cube_r12);
        this.setRotateAngle(cube_r12, -3.1173F, 0.0035F, -2.9684F);
        this.cube_r12.cubeList.add(new ModelBox(cube_r12, 0, 71, 0.0F, -1.0F, -3.0F, 2, 1, 3, 0.0F, true));

        this.cube_r13 = new AdvancedModelRenderer(this);
        this.cube_r13.setRotationPoint(5.5874F, -8.2959F, -13.1019F);
        this.main.addChild(cube_r13);
        this.setRotateAngle(cube_r13, 2.8342F, -0.4329F, -2.9248F);
        this.cube_r13.cubeList.add(new ModelBox(cube_r13, 54, 38, -0.1952F, -0.0259F, -3.1139F, 5, 1, 3, -0.01F, true));

        this.cube_r14 = new AdvancedModelRenderer(this);
        this.cube_r14.setRotationPoint(5.5874F, -7.296F, -16.1019F);
        this.main.addChild(cube_r14);
        this.setRotateAngle(cube_r14, -3.1173F, -0.4765F, -2.9684F);
        this.cube_r14.cubeList.add(new ModelBox(cube_r14, 16, 53, 1.375F, -1.05F, -3.0F, 1, 1, 3, 0.0F, true));

        this.cube_r15 = new AdvancedModelRenderer(this);
        this.cube_r15.setRotationPoint(5.5874F, -7.296F, -16.1019F);
        this.main.addChild(cube_r15);
        this.setRotateAngle(cube_r15, -3.1173F, -0.1274F, -2.9684F);
        this.cube_r15.cubeList.add(new ModelBox(cube_r15, 24, 69, 1.275F, -1.05F, -3.5F, 1, 1, 4, 0.0F, true));

        this.cube_r16 = new AdvancedModelRenderer(this);
        this.cube_r16.setRotationPoint(2.5F, -12.3F, 4.0F);
        this.main.addChild(cube_r16);
        this.setRotateAngle(cube_r16, -0.2534F, 0.1414F, 0.5161F);
        this.cube_r16.cubeList.add(new ModelBox(cube_r16, 26, 34, 0.0F, 0.075F, -0.2F, 6, 0, 8, 0.0F, true));

        this.cube_r17 = new AdvancedModelRenderer(this);
        this.cube_r17.setRotationPoint(-2.5F, -12.3F, 4.0F);
        this.main.addChild(cube_r17);
        this.setRotateAngle(cube_r17, -0.2534F, -0.1414F, -0.5161F);
        this.cube_r17.cubeList.add(new ModelBox(cube_r17, 26, 34, -6.0F, 0.075F, -0.2F, 6, 0, 8, 0.0F, false));

        this.cube_r18 = new AdvancedModelRenderer(this);
        this.cube_r18.setRotationPoint(-2.5F, -12.3F, 0.0F);
        this.main.addChild(cube_r18);
        this.setRotateAngle(cube_r18, 0.0F, 0.0F, -0.5236F);
        this.cube_r18.cubeList.add(new ModelBox(cube_r18, 0, 35, -5.0F, 0.0F, -4.0F, 5, 1, 8, 0.0F, false));

        this.cube_r19 = new AdvancedModelRenderer(this);
        this.cube_r19.setRotationPoint(-2.5F, -12.3F, -4.0F);
        this.main.addChild(cube_r19);
        this.setRotateAngle(cube_r19, 0.2461F, 0.0851F, -0.5163F);
        this.cube_r19.cubeList.add(new ModelBox(cube_r19, 38, 0, -5.0F, 0.0F, -8.0F, 5, 1, 8, 0.0F, false));

        this.cube_r20 = new AdvancedModelRenderer(this);
        this.cube_r20.setRotationPoint(-11.6017F, -6.1F, 0.4763F);
        this.main.addChild(cube_r20);
        this.setRotateAngle(cube_r20, 0.0F, -1.5708F, -0.1745F);
        this.cube_r20.cubeList.add(new ModelBox(cube_r20, 24, 52, -7.0F, -3.0F, -7.0F, 10, 3, 3, 0.01F, false));

        this.cube_r21 = new AdvancedModelRenderer(this);
        this.cube_r21.setRotationPoint(6.2874F, -7.096F, -13.4019F);
        this.main.addChild(cube_r21);
        this.setRotateAngle(cube_r21, -3.1173F, -0.1711F, -2.9248F);
        this.cube_r21.cubeList.add(new ModelBox(cube_r21, 12, 65, 0.0F, -2.15F, -7.0F, 2, 2, 4, 0.0F, true));

        this.cube_r22 = new AdvancedModelRenderer(this);
        this.cube_r22.setRotationPoint(-6.2874F, -7.096F, -13.4019F);
        this.main.addChild(cube_r22);
        this.setRotateAngle(cube_r22, -3.1173F, 0.1711F, 2.9248F);
        this.cube_r22.cubeList.add(new ModelBox(cube_r22, 12, 65, -2.0F, -2.15F, -7.0F, 2, 2, 4, 0.0F, false));

        this.cube_r23 = new AdvancedModelRenderer(this);
        this.cube_r23.setRotationPoint(-5.5874F, -8.2959F, -13.1019F);
        this.main.addChild(cube_r23);
        this.setRotateAngle(cube_r23, 2.8342F, 0.4329F, 2.9248F);
        this.cube_r23.cubeList.add(new ModelBox(cube_r23, 54, 38, -4.8048F, -0.0259F, -3.1139F, 5, 1, 3, -0.01F, false));

        this.cube_r24 = new AdvancedModelRenderer(this);
        this.cube_r24.setRotationPoint(5.5874F, -7.296F, -13.1019F);
        this.main.addChild(cube_r24);
        this.setRotateAngle(cube_r24, -3.1173F, -0.4329F, -2.9248F);
        this.cube_r24.cubeList.add(new ModelBox(cube_r24, 10, 71, 0.0F, -1.0F, -3.0F, 2, 1, 3, 0.0F, true));

        this.cube_r25 = new AdvancedModelRenderer(this);
        this.cube_r25.setRotationPoint(-5.5874F, -7.296F, -13.1019F);
        this.main.addChild(cube_r25);
        this.setRotateAngle(cube_r25, -3.1173F, 0.4329F, 2.9248F);
        this.cube_r25.cubeList.add(new ModelBox(cube_r25, 10, 71, -2.0F, -1.0F, -3.0F, 2, 1, 3, 0.0F, false));

        this.cube_r26 = new AdvancedModelRenderer(this);
        this.cube_r26.setRotationPoint(-5.5874F, -7.296F, -16.1019F);
        this.main.addChild(cube_r26);
        this.setRotateAngle(cube_r26, -3.1173F, 0.4765F, 2.9684F);
        this.cube_r26.cubeList.add(new ModelBox(cube_r26, 16, 53, -2.375F, -1.05F, -3.0F, 1, 1, 3, 0.0F, false));

        this.cube_r27 = new AdvancedModelRenderer(this);
        this.cube_r27.setRotationPoint(-5.5874F, -7.296F, -16.1019F);
        this.main.addChild(cube_r27);
        this.setRotateAngle(cube_r27, -3.1173F, 0.1274F, 2.9684F);
        this.cube_r27.cubeList.add(new ModelBox(cube_r27, 24, 69, -2.275F, -1.05F, -3.5F, 1, 1, 4, 0.0F, false));

        this.cube_r28 = new AdvancedModelRenderer(this);
        this.cube_r28.setRotationPoint(-5.5874F, -7.296F, -13.1019F);
        this.main.addChild(cube_r28);
        this.setRotateAngle(cube_r28, -3.1173F, -0.0035F, 2.9684F);
        this.cube_r28.cubeList.add(new ModelBox(cube_r28, 0, 71, -2.0F, -1.0F, -3.0F, 2, 1, 3, 0.0F, false));

        this.cube_r29 = new AdvancedModelRenderer(this);
        this.cube_r29.setRotationPoint(3.6472F, -7.7101F, -13.1157F);
        this.main.addChild(cube_r29);
        this.setRotateAngle(cube_r29, 3.0038F, 1.1347F, -2.897F);
        this.cube_r29.cubeList.add(new ModelBox(cube_r29, 54, 32, -4.0F, -1.0F, -5.0F, 4, 1, 5, 0.0F, true));

        this.cube_r30 = new AdvancedModelRenderer(this);
        this.cube_r30.setRotationPoint(-3.6472F, -7.7101F, -13.1157F);
        this.main.addChild(cube_r30);
        this.setRotateAngle(cube_r30, 3.0038F, -1.1347F, 2.897F);
        this.cube_r30.cubeList.add(new ModelBox(cube_r30, 54, 32, 0.0F, -1.0F, -5.0F, 4, 1, 5, 0.0F, false));

        this.neck = new AdvancedModelRenderer(this);
        this.neck.setRotationPoint(0.0F, -7.2F, -11.0F);
        this.main.addChild(neck);
        this.setRotateAngle(neck, 0.0436F, 0.0F, 0.0F);
        this.neck.cubeList.add(new ModelBox(neck, 16, 58, -2.0F, -1.75F, -3.35F, 4, 3, 4, 0.011F, false));

        this.neck2 = new AdvancedModelRenderer(this);
        this.neck2.setRotationPoint(0.0F, 0.0F, -3.0F);
        this.neck.addChild(neck2);
        this.setRotateAngle(neck2, -0.1309F, 0.0F, 0.0F);
        this.neck2.cubeList.add(new ModelBox(neck2, 46, 60, -2.0F, -1.75F, -3.0F, 4, 3, 3, 0.0F, false));

        this.head = new AdvancedModelRenderer(this);
        this.head.setRotationPoint(0.0F, 0.0F, -2.0F);
        this.neck2.addChild(head);
        this.setRotateAngle(head, 0.0873F, 0.0F, 0.0F);


        this.cube_r31 = new AdvancedModelRenderer(this);
        this.cube_r31.setRotationPoint(1.5F, 0.617F, -4.9397F);
        this.head.addChild(cube_r31);
        this.setRotateAngle(cube_r31, 0.1828F, 0.3006F, 0.0547F);
        this.cube_r31.cubeList.add(new ModelBox(cube_r31, 66, 43, -1.0F, -2.0115F, 0.0136F, 1, 2, 3, 0.0F, true));

        this.cube_r32 = new AdvancedModelRenderer(this);
        this.cube_r32.setRotationPoint(-1.5F, 0.617F, -4.9397F);
        this.head.addChild(cube_r32);
        this.setRotateAngle(cube_r32, 0.1828F, -0.3006F, -0.0547F);
        this.cube_r32.cubeList.add(new ModelBox(cube_r32, 66, 43, 0.0F, -2.0115F, 0.0136F, 1, 2, 3, 0.0F, false));

        this.cube_r33 = new AdvancedModelRenderer(this);
        this.cube_r33.setRotationPoint(1.5F, 0.617F, -4.9397F);
        this.head.addChild(cube_r33);
        this.setRotateAngle(cube_r33, 0.1745F, 0.0F, 0.0F);
        this.cube_r33.cubeList.add(new ModelBox(cube_r33, 59, 72, -3.0F, -1.0115F, 0.0136F, 3, 1, 3, 0.01F, false));

        this.cube_r34 = new AdvancedModelRenderer(this);
        this.cube_r34.setRotationPoint(1.5F, -1.1685F, -5.841F);
        this.head.addChild(cube_r34);
        this.setRotateAngle(cube_r34, 0.48F, 0.0F, 0.0F);
        this.cube_r34.cubeList.add(new ModelBox(cube_r34, 70, 71, -3.0F, -0.0115F, -0.2614F, 3, 2, 1, 0.0F, false));

        this.cube_r35 = new AdvancedModelRenderer(this);
        this.cube_r35.setRotationPoint(1.5F, -2.092F, -4.067F);
        this.head.addChild(cube_r35);
        this.setRotateAngle(cube_r35, 0.48F, 0.0F, 0.0F);
        this.cube_r35.cubeList.add(new ModelBox(cube_r35, 24, 65, -3.0F, -0.0115F, -2.0114F, 3, 2, 2, 0.01F, false));

        this.cube_r36 = new AdvancedModelRenderer(this);
        this.cube_r36.setRotationPoint(1.5F, 0.0F, -1.25F);
        this.head.addChild(cube_r36);
        this.setRotateAngle(cube_r36, -0.0873F, 0.0F, 0.0F);
        this.cube_r36.cubeList.add(new ModelBox(cube_r36, 57, 15, -4.0F, -1.85F, -3.0F, 5, 2, 4, 0.01F, false));

        this.eyeright = new AdvancedModelRenderer(this);
        this.eyeright.setRotationPoint(-2.125F, -1.45F, -3.25F);
        this.head.addChild(eyeright);
        this.setRotateAngle(eyeright, 0.0189F, -0.0852F, 0.0865F);


        this.cube_r37 = new AdvancedModelRenderer(this);
        this.cube_r37.setRotationPoint(3.5F, 1.25F, 2.0F);
        this.eyeright.addChild(cube_r37);
        this.setRotateAngle(cube_r37, -0.0873F, 0.0F, 0.0F);
        this.cube_r37.cubeList.add(new ModelBox(cube_r37, 38, 22, -4.0F, -1.5F, -2.8F, 1, 1, 1, 0.0F, false));

        this.eyeleft = new AdvancedModelRenderer(this);
        this.eyeleft.setRotationPoint(2.125F, -1.45F, -3.25F);
        this.head.addChild(eyeleft);
        this.setRotateAngle(eyeleft, 0.0189F, 0.0852F, -0.0865F);


        this.cube_r38 = new AdvancedModelRenderer(this);
        this.cube_r38.setRotationPoint(-3.5F, 1.25F, 2.0F);
        this.eyeleft.addChild(cube_r38);
        this.setRotateAngle(cube_r38, -0.0873F, 0.0F, 0.0F);
        this.cube_r38.cubeList.add(new ModelBox(cube_r38, 38, 22, 3.0F, -1.5F, -2.8F, 1, 1, 1, 0.0F, true));

        this.jaw = new AdvancedModelRenderer(this);
        this.jaw.setRotationPoint(0.0F, 0.2143F, -0.9363F);
        this.head.addChild(jaw);
        this.setRotateAngle(jaw, -0.1745F, 0.0F, 0.0F);


        this.cube_r39 = new AdvancedModelRenderer(this);
        this.cube_r39.setRotationPoint(0.0F, 0.25F, -3.0F);
        this.jaw.addChild(cube_r39);
        this.setRotateAngle(cube_r39, 0.1309F, 0.0F, 0.0F);
        this.cube_r39.cubeList.add(new ModelBox(cube_r39, 0, 67, -1.5F, -1.0F, 1.5F, 3, 1, 3, 0.0F, false));

        this.cube_r40 = new AdvancedModelRenderer(this);
        this.cube_r40.setRotationPoint(1.0F, 1.25F, -3.0F);
        this.jaw.addChild(cube_r40);
        this.setRotateAngle(cube_r40, 0.1346F, 0.2336F, 0.0313F);
        this.cube_r40.cubeList.add(new ModelBox(cube_r40, 46, 42, -1.0F, -1.0F, 0.0F, 1, 1, 4, 0.0F, true));

        this.cube_r41 = new AdvancedModelRenderer(this);
        this.cube_r41.setRotationPoint(-1.0F, 1.25F, -3.0F);
        this.jaw.addChild(cube_r41);
        this.setRotateAngle(cube_r41, 0.1346F, -0.2336F, -0.0313F);
        this.cube_r41.cubeList.add(new ModelBox(cube_r41, 46, 42, 0.0F, -1.0F, 0.0F, 1, 1, 4, 0.0F, false));

        this.cube_r42 = new AdvancedModelRenderer(this);
        this.cube_r42.setRotationPoint(-0.5F, 1.25F, -3.0F);
        this.jaw.addChild(cube_r42);
        this.setRotateAngle(cube_r42, 0.1309F, 0.0F, 0.0F);
        this.cube_r42.cubeList.add(new ModelBox(cube_r42, 48, 24, -0.5F, -1.0F, 0.0F, 2, 1, 3, 0.01F, false));

        this.bone = new AdvancedModelRenderer(this);
        this.bone.setRotationPoint(0.0F, -10.1F, 3.2263F);
        this.main.addChild(bone);
        this.setRotateAngle(bone, -0.0873F, 0.0F, 0.0F);


        this.cube_r43 = new AdvancedModelRenderer(this);
        this.cube_r43.setRotationPoint(-11.6017F, 4.0F, 7.25F);
        this.bone.addChild(cube_r43);
        this.setRotateAngle(cube_r43, 0.0F, -1.2654F, -0.1745F);
        this.cube_r43.cubeList.add(new ModelBox(cube_r43, 56, 9, -5.5F, -3.0F, -8.9F, 6, 3, 3, 0.0F, false));

        this.cube_r44 = new AdvancedModelRenderer(this);
        this.cube_r44.setRotationPoint(-11.6017F, 4.0F, 7.25F);
        this.bone.addChild(cube_r44);
        this.setRotateAngle(cube_r44, 0.0F, -0.3491F, -0.1745F);
        this.cube_r44.cubeList.add(new ModelBox(cube_r44, 38, 66, 7.8F, -3.0F, -5.0F, 3, 3, 3, 0.0F, false));

        this.cube_r45 = new AdvancedModelRenderer(this);
        this.cube_r45.setRotationPoint(-11.6017F, 4.0F, 7.25F);
        this.bone.addChild(cube_r45);
        this.setRotateAngle(cube_r45, 0.0F, -0.7418F, -0.1745F);
        this.cube_r45.cubeList.add(new ModelBox(cube_r45, 60, 65, 3.4F, -3.0F, -7.825F, 3, 3, 3, 0.01F, false));

        this.cube_r46 = new AdvancedModelRenderer(this);
        this.cube_r46.setRotationPoint(11.6017F, 4.0F, 7.25F);
        this.bone.addChild(cube_r46);
        this.setRotateAngle(cube_r46, 0.0F, 0.3491F, 0.1745F);
        this.cube_r46.cubeList.add(new ModelBox(cube_r46, 38, 66, -10.8F, -3.0F, -5.0F, 3, 3, 3, 0.0F, true));

        this.cube_r47 = new AdvancedModelRenderer(this);
        this.cube_r47.setRotationPoint(0.5F, 2.0F, 8.0987F);
        this.bone.addChild(cube_r47);
        this.setRotateAngle(cube_r47, -0.0218F, 0.0F, 0.0F);
        this.cube_r47.cubeList.add(new ModelBox(cube_r47, 32, 58, -2.0F, -2.85F, -3.1F, 3, 3, 4, 0.01F, false));

        this.cube_r48 = new AdvancedModelRenderer(this);
        this.cube_r48.setRotationPoint(11.6017F, 4.0F, 7.25F);
        this.bone.addChild(cube_r48);
        this.setRotateAngle(cube_r48, 0.0F, 1.2654F, 0.1745F);
        this.cube_r48.cubeList.add(new ModelBox(cube_r48, 56, 9, -0.5F, -3.0F, -8.9F, 6, 3, 3, 0.0F, true));

        this.cube_r49 = new AdvancedModelRenderer(this);
        this.cube_r49.setRotationPoint(11.6017F, 4.0F, 7.25F);
        this.bone.addChild(cube_r49);
        this.setRotateAngle(cube_r49, 0.0F, 0.7418F, 0.1745F);
        this.cube_r49.cubeList.add(new ModelBox(cube_r49, 60, 65, -6.4F, -3.0F, -7.825F, 3, 3, 3, 0.01F, true));

        this.frontrightleg = new AdvancedModelRenderer(this);
        this.frontrightleg.setRotationPoint(-4.3049F, -6.048F, -6.6378F);
        this.main.addChild(frontrightleg);
        this.setRotateAngle(frontrightleg, 0.0873F, 0.5672F, -0.2618F);
        this.frontrightleg.cubeList.add(new ModelBox(frontrightleg, 50, 42, -2.0F, -2.0F, -6.0F, 4, 3, 7, 0.0F, false));

        this.frontrightleg2 = new AdvancedModelRenderer(this);
        this.frontrightleg2.setRotationPoint(-0.0014F, -1.0412F, -5.4672F);
        this.frontrightleg.addChild(frontrightleg2);
        this.setRotateAngle(frontrightleg2, 1.3159F, -0.1447F, 0.5837F);
        this.frontrightleg2.cubeList.add(new ModelBox(frontrightleg2, 0, 53, -1.5F, -1.5F, -5.0F, 3, 3, 5, 0.0F, false));

        this.frontrightleg3 = new AdvancedModelRenderer(this);
        this.frontrightleg3.setRotationPoint(0.0F, 0.0F, -5.0008F);
        this.frontrightleg2.addChild(frontrightleg3);
        this.setRotateAngle(frontrightleg3, -0.1045F, -0.3058F, 0.246F);
        this.frontrightleg3.cubeList.add(new ModelBox(frontrightleg3, 66, 52, -2.0F, -3.75F, -0.5F, 4, 5, 1, 0.0F, false));

        this.frontleftleg = new AdvancedModelRenderer(this);
        this.frontleftleg.setRotationPoint(4.3049F, -6.048F, -6.6378F);
        this.main.addChild(frontleftleg);
        this.setRotateAngle(frontleftleg, 0.0873F, -0.5672F, 0.2618F);
        this.frontleftleg.cubeList.add(new ModelBox(frontleftleg, 50, 42, -2.0F, -2.0F, -6.0F, 4, 3, 7, 0.0F, true));

        this.frontleftleg2 = new AdvancedModelRenderer(this);
        this.frontleftleg2.setRotationPoint(0.0014F, -1.0412F, -5.4672F);
        this.frontleftleg.addChild(frontleftleg2);
        this.setRotateAngle(frontleftleg2, 1.3159F, 0.1447F, -0.5837F);
        this.frontleftleg2.cubeList.add(new ModelBox(frontleftleg2, 0, 53, -1.5F, -1.5F, -5.0F, 3, 3, 5, 0.0F, true));

        this.frontleftleg3 = new AdvancedModelRenderer(this);
        this.frontleftleg3.setRotationPoint(0.0F, 0.0F, -5.0008F);
        this.frontleftleg2.addChild(frontleftleg3);
        this.setRotateAngle(frontleftleg3, -0.1045F, 0.3058F, -0.246F);
        this.frontleftleg3.cubeList.add(new ModelBox(frontleftleg3, 66, 52, -2.0F, -3.75F, -0.5F, 4, 5, 1, 0.0F, true));

        this.backrightleg = new AdvancedModelRenderer(this);
        this.backrightleg.setRotationPoint(-3.8049F, -6.048F, 6.1378F);
        this.main.addChild(backrightleg);
        this.setRotateAngle(backrightleg, 0.0F, -1.0036F, -0.4363F);
        this.backrightleg.cubeList.add(new ModelBox(backrightleg, 52, 22, -2.0F, -2.0F, -1.0F, 4, 3, 7, 0.0F, false));

        this.backrightleg2 = new AdvancedModelRenderer(this);
        this.backrightleg2.setRotationPoint(-0.0049F, -0.9681F, 5.2647F);
        this.backrightleg.addChild(backrightleg2);
        this.setRotateAngle(backrightleg2, -1.0645F, 0.2183F, -0.2694F);
        this.backrightleg2.cubeList.add(new ModelBox(backrightleg2, 50, 52, -1.5F, -1.5F, 0.0F, 3, 3, 5, 0.0F, false));

        this.backrightleg3 = new AdvancedModelRenderer(this);
        this.backrightleg3.setRotationPoint(0.0005F, -0.001F, 5.0061F);
        this.backrightleg2.addChild(backrightleg3);
        this.setRotateAngle(backrightleg3, 0.5475F, -0.1768F, -1.5681F);
        this.backrightleg3.cubeList.add(new ModelBox(backrightleg3, 50, 66, -2.0F, -3.75F, -0.5F, 4, 5, 1, 0.0F, false));

        this.backleftleg = new AdvancedModelRenderer(this);
        this.backleftleg.setRotationPoint(3.8049F, -6.048F, 6.1378F);
        this.main.addChild(backleftleg);
        this.setRotateAngle(backleftleg, 0.0F, 1.0036F, 0.4363F);
        this.backleftleg.cubeList.add(new ModelBox(backleftleg, 52, 22, -2.0F, -2.0F, -1.0F, 4, 3, 7, 0.0F, true));

        this.backleftleg2 = new AdvancedModelRenderer(this);
        this.backleftleg2.setRotationPoint(0.0049F, -0.9681F, 5.2647F);
        this.backleftleg.addChild(backleftleg2);
        this.setRotateAngle(backleftleg2, -1.0645F, -0.2183F, 0.2694F);
        this.backleftleg2.cubeList.add(new ModelBox(backleftleg2, 50, 52, -1.5F, -1.5F, 0.0F, 3, 3, 5, 0.0F, true));

        this.backleftleg3 = new AdvancedModelRenderer(this);
        this.backleftleg3.setRotationPoint(-0.0005F, -0.001F, 5.0061F);
        this.backleftleg2.addChild(backleftleg3);
        this.setRotateAngle(backleftleg3, 0.5475F, 0.1768F, 1.5681F);
        this.backleftleg3.cubeList.add(new ModelBox(backleftleg3, 50, 66, -2.0F, -3.75F, -0.5F, 4, 5, 1, 0.0F, true));

        this.tail = new AdvancedModelRenderer(this);
        this.tail.setRotationPoint(0.0F, -8.1481F, 8.0436F);
        this.main.addChild(tail);
        this.setRotateAngle(tail, -0.3491F, 0.0F, 0.0F);
        this.tail.cubeList.add(new ModelBox(tail, 0, 61, -1.0F, -0.5F, 0.0F, 2, 2, 4, 0.0F, false));

        this.tail2 = new AdvancedModelRenderer(this);
        this.tail2.setRotationPoint(0.0F, 0.0005F, 3.9782F);
        this.tail.addChild(tail2);
        this.setRotateAngle(tail2, 0.2182F, 0.0F, 0.0F);
        this.tail2.cubeList.add(new ModelBox(tail2, 64, 0, -0.5F, 0.0F, -1.0F, 1, 1, 5, 0.0F, false));

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
        this.main.offsetY = -0.8F;
        this.main.offsetX = -0.1F;
        this.main.offsetZ = 2.0F;
        this.main.rotateAngleY = (float)Math.toRadians(120);
        this.main.rotateAngleX = (float)Math.toRadians(0);
        this.main.rotateAngleZ = (float)Math.toRadians(0);
        this.main.scaleChildren = true;
        float scaler = 1.4F;
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

        EntityPrehistoricFloraAnomalochelys entityAnomalochelys = (EntityPrehistoricFloraAnomalochelys) e;

        if (entityAnomalochelys.getAnimation() == entityAnomalochelys.HIDE_ANIMATION) {
            return;
        }



        AdvancedModelRenderer[] Tail = {this.tail, this.tail2};
        AdvancedModelRenderer[] Neck = {this.neck, this.neck2, this.head};

        if (entityAnomalochelys.getAnimation() == entityAnomalochelys.LAY_ANIMATION) {
            this.chainSwing(Neck, 0.5F, 0.10F, 0.5, f2, 0.8F);
            this.chainWave(Neck, 0.5F * 2, -0.02F, 0.5F, f2, 0.8F);
        }
        else {
            if (!entityAnomalochelys.isReallyInWater()) {

                if (f3 == 0.0F || !entityAnomalochelys.getIsMoving()) {
                    if (entityAnomalochelys.getAnimation() != entityAnomalochelys.EAT_ANIMATION
                        && entityAnomalochelys.getAnimation() != entityAnomalochelys.DRINK_ANIMATION
                        && entityAnomalochelys.getAnimation() != entityAnomalochelys.HIDE_ANIMATION) {
                        this.chainSwing(Neck, 0.05F, 0.10F, 0.5, f2, 0.8F);
                        this.chainWave(Neck, 0.05F * 2, -0.02F, 0.5F, f2, 0.8F);
                    }

                    this.chainWave(Tail, (0.15F * 0.35F), 0.1F * 0.1F, 0.2F, f2, 1F);
                    this.chainSwing(Tail, (0.15F * 0.35F) * 4F, 0.05F * 0.05F, 0.12F, f2, 1F);


                    return;
                }

                if (entityAnomalochelys.getIsFast()) { //Running


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

        EntityPrehistoricFloraAnomalochelys ee = (EntityPrehistoricFloraAnomalochelys) entitylivingbaseIn;


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
        EntityPrehistoricFloraAnomalochelys entity = (EntityPrehistoricFloraAnomalochelys) entitylivingbaseIn;
        int animCycle = 50;
        double tickAnim = animTick + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;
         if (tickAnim >= 0 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 0) / 5) * (-2.5-(0)));
            yy = 0 + (((tickAnim - 0) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 5) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 8) {
            xx = -2.5 + (((tickAnim - 5) / 3) * (-2.5-(-2.5)));
            yy = 0 + (((tickAnim - 5) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 5) / 3) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 17) {
            xx = -2.5 + (((tickAnim - 8) / 9) * (2.5-(-2.5)));
            yy = 0 + (((tickAnim - 8) / 9) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 9) * (0-(0)));
        }
        else if (tickAnim >= 17 && tickAnim < 21) {
            xx = 2.5 + (((tickAnim - 17) / 4) * (1.37369-(2.5)));
            yy = 0 + (((tickAnim - 17) / 4) * (0.05997-(0)));
            zz = 0 + (((tickAnim - 17) / 4) * (-2.49928-(0)));
        }
        else if (tickAnim >= 21 && tickAnim < 27) {
            xx = 1.37369 + (((tickAnim - 21) / 6) * (0.50054-(1.37369)));
            yy = 0.05997 + (((tickAnim - 21) / 6) * (0.02462-(0.05997)));
            zz = -2.49928 + (((tickAnim - 21) / 6) * (0.56498-(-2.49928)));
        }
        else if (tickAnim >= 27 && tickAnim < 33) {
            xx = 0.50054 + (((tickAnim - 27) / 6) * (-0.7496-(0.50054)));
            yy = 0.02462 + (((tickAnim - 27) / 6) * (-0.01835-(0.02462)));
            zz = 0.56498 + (((tickAnim - 27) / 6) * (-2.17022-(0.56498)));
        }
        else if (tickAnim >= 33 && tickAnim < 39) {
            xx = -0.7496 + (((tickAnim - 33) / 6) * (-1.62365-(-0.7496)));
            yy = -0.01835 + (((tickAnim - 33) / 6) * (0.0617-(-0.01835)));
            zz = -2.17022 + (((tickAnim - 33) / 6) * (1.41389-(-2.17022)));
        }
        else if (tickAnim >= 39 && tickAnim < 45) {
            xx = -1.62365 + (((tickAnim - 39) / 6) * (-2.5-(-1.62365)));
            yy = 0.0617 + (((tickAnim - 39) / 6) * (0-(0.0617)));
            zz = 1.41389 + (((tickAnim - 39) / 6) * (0-(1.41389)));
        }
        else if (tickAnim >= 45 && tickAnim < 50) {
            xx = -2.5 + (((tickAnim - 45) / 5) * (0-(-2.5)));
            yy = 0 + (((tickAnim - 45) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 45) / 5) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(main, main.rotateAngleX + (float) Math.toRadians(xx), main.rotateAngleY + (float) Math.toRadians(yy), main.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 0) / 5) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 5) * (-4-(0)));
            zz = 0 + (((tickAnim - 0) / 5) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 5) / 3) * (0-(0)));
            yy = -4 + (((tickAnim - 5) / 3) * (-4-(-4)));
            zz = 0 + (((tickAnim - 5) / 3) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 8) / 12) * (0-(0)));
            yy = -4 + (((tickAnim - 8) / 12) * (-3.6-(-4)));
            zz = 0 + (((tickAnim - 8) / 12) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 45) {
            xx = 0 + (((tickAnim - 20) / 25) * (0-(0)));
            yy = -3.6 + (((tickAnim - 20) / 25) * (-4-(-3.6)));
            zz = 0 + (((tickAnim - 20) / 25) * (0-(0)));
        }
        else if (tickAnim >= 45 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 45) / 5) * (0-(0)));
            yy = -4 + (((tickAnim - 45) / 5) * (0-(-4)));
            zz = 0 + (((tickAnim - 45) / 5) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.main.rotationPointX = this.main.rotationPointX + (float)(xx);
        this.main.rotationPointY = this.main.rotationPointY - (float)(yy);
        this.main.rotationPointZ = this.main.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 0) / 5) * (-12.5-(0)));
            yy = 0 + (((tickAnim - 0) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 5) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 20) {
            xx = -12.5 + (((tickAnim - 5) / 15) * (-17.5547-(-12.5)));
            yy = 0 + (((tickAnim - 5) / 15) * (-4.82922-(0)));
            zz = 0 + (((tickAnim - 5) / 15) * (1.29717-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 33) {
            xx = -17.5547 + (((tickAnim - 20) / 13) * (-15.22074-(-17.5547)));
            yy = -4.82922 + (((tickAnim - 20) / 13) * (9.65594-(-4.82922)));
            zz = 1.29717 + (((tickAnim - 20) / 13) * (-2.61298-(1.29717)));
        }
        else if (tickAnim >= 33 && tickAnim < 45) {
            xx = -15.22074 + (((tickAnim - 33) / 12) * (-12.5-(-15.22074)));
            yy = 9.65594 + (((tickAnim - 33) / 12) * (0-(9.65594)));
            zz = -2.61298 + (((tickAnim - 33) / 12) * (0-(-2.61298)));
        }
        else if (tickAnim >= 45 && tickAnim < 50) {
            xx = -12.5 + (((tickAnim - 45) / 5) * (0-(-12.5)));
            yy = 0 + (((tickAnim - 45) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 45) / 5) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck, neck.rotateAngleX + (float) Math.toRadians(xx), neck.rotateAngleY + (float) Math.toRadians(yy), neck.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 0) / 5) * (-5-(0)));
            yy = 0 + (((tickAnim - 0) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 5) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 50) {
            xx = -5 + (((tickAnim - 5) / 45) * (0-(-5)));
            yy = 0 + (((tickAnim - 5) / 45) * (0-(0)));
            zz = 0 + (((tickAnim - 5) / 45) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(head, head.rotateAngleX + (float) Math.toRadians(xx), head.rotateAngleY + (float) Math.toRadians(yy), head.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 0) / 5) * (-12.2859-(0)));
            yy = 0 + (((tickAnim - 0) / 5) * (-47.52914-(0)));
            zz = 0 + (((tickAnim - 0) / 5) * (40.31662-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 8) {
            xx = -12.2859 + (((tickAnim - 5) / 3) * (-11.92266-(-12.2859)));
            yy = -47.52914 + (((tickAnim - 5) / 3) * (-47.75338-(-47.52914)));
            zz = 40.31662 + (((tickAnim - 5) / 3) * (42.8957-(40.31662)));
        }
        else if (tickAnim >= 8 && tickAnim < 17) {
            xx = -11.92266 + (((tickAnim - 8) / 9) * (-15.40114-(-11.92266)));
            yy = -47.75338 + (((tickAnim - 8) / 9) * (-45.25006-(-47.75338)));
            zz = 42.8957 + (((tickAnim - 8) / 9) * (55.54894-(42.8957)));
        }
        else if (tickAnim >= 17 && tickAnim < 21) {
            xx = -15.40114 + (((tickAnim - 17) / 4) * (-16.59799-(-15.40114)));
            yy = -45.25006 + (((tickAnim - 17) / 4) * (-47.15014-(-45.25006)));
            zz = 55.54894 + (((tickAnim - 17) / 4) * (55.00977-(55.54894)));
        }
        else if (tickAnim >= 21 && tickAnim < 27) {
            xx = -16.59799 + (((tickAnim - 21) / 6) * (-14.18655-(-16.59799)));
            yy = -47.15014 + (((tickAnim - 21) / 6) * (-46.59903-(-47.15014)));
            zz = 55.00977 + (((tickAnim - 21) / 6) * (48.91037-(55.00977)));
        }
        else if (tickAnim >= 27 && tickAnim < 33) {
            xx = -14.18655 + (((tickAnim - 27) / 6) * (-14.71993-(-14.18655)));
            yy = -46.59903 + (((tickAnim - 27) / 6) * (-47.86064-(-46.59903)));
            zz = 48.91037 + (((tickAnim - 27) / 6) * (48.02975-(48.91037)));
        }
        else if (tickAnim >= 33 && tickAnim < 39) {
            xx = -14.71993 + (((tickAnim - 33) / 6) * (-12.09575-(-14.71993)));
            yy = -47.86064 + (((tickAnim - 33) / 6) * (-46.44456-(-47.86064)));
            zz = 48.02975 + (((tickAnim - 33) / 6) * (41.93784-(48.02975)));
        }
        else if (tickAnim >= 39 && tickAnim < 45) {
            xx = -12.09575 + (((tickAnim - 39) / 6) * (-12.2859-(-12.09575)));
            yy = -46.44456 + (((tickAnim - 39) / 6) * (-47.52914-(-46.44456)));
            zz = 41.93784 + (((tickAnim - 39) / 6) * (40.31662-(41.93784)));
        }
        else if (tickAnim >= 45 && tickAnim < 50) {
            xx = -12.2859 + (((tickAnim - 45) / 5) * (0-(-12.2859)));
            yy = -47.52914 + (((tickAnim - 45) / 5) * (0-(-47.52914)));
            zz = 40.31662 + (((tickAnim - 45) / 5) * (0-(40.31662)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(frontrightleg, frontrightleg.rotateAngleX + (float) Math.toRadians(xx), frontrightleg.rotateAngleY + (float) Math.toRadians(yy), frontrightleg.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 0) / 5) * (15-(0)));
            yy = 0 + (((tickAnim - 0) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 5) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 50) {
            xx = 15 + (((tickAnim - 5) / 45) * (0-(15)));
            yy = 0 + (((tickAnim - 5) / 45) * (0-(0)));
            zz = 0 + (((tickAnim - 5) / 45) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(frontrightleg2, frontrightleg2.rotateAngleX + (float) Math.toRadians(xx), frontrightleg2.rotateAngleY + (float) Math.toRadians(yy), frontrightleg2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 0) / 5) * (30.99426-(0)));
            yy = 0 + (((tickAnim - 0) / 5) * (-39.89871-(0)));
            zz = 0 + (((tickAnim - 0) / 5) * (-46.99622-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 8) {
            xx = 30.99426 + (((tickAnim - 5) / 3) * (30.99426-(30.99426)));
            yy = -39.89871 + (((tickAnim - 5) / 3) * (-39.89871-(-39.89871)));
            zz = -46.99622 + (((tickAnim - 5) / 3) * (-46.99622-(-46.99622)));
        }
        else if (tickAnim >= 8 && tickAnim < 17) {
            xx = 30.99426 + (((tickAnim - 8) / 9) * (34.96599-(30.99426)));
            yy = -39.89871 + (((tickAnim - 8) / 9) * (-49.68727-(-39.89871)));
            zz = -46.99622 + (((tickAnim - 8) / 9) * (-51.46469-(-46.99622)));
        }
        else if (tickAnim >= 17 && tickAnim < 45) {
            xx = 34.96599 + (((tickAnim - 17) / 28) * (30.99426-(34.96599)));
            yy = -49.68727 + (((tickAnim - 17) / 28) * (-39.89871-(-49.68727)));
            zz = -51.46469 + (((tickAnim - 17) / 28) * (-46.99622-(-51.46469)));
        }
        else if (tickAnim >= 45 && tickAnim < 50) {
            xx = 30.99426 + (((tickAnim - 45) / 5) * (0-(30.99426)));
            yy = -39.89871 + (((tickAnim - 45) / 5) * (0-(-39.89871)));
            zz = -46.99622 + (((tickAnim - 45) / 5) * (0-(-46.99622)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(frontrightleg3, frontrightleg3.rotateAngleX + (float) Math.toRadians(xx), frontrightleg3.rotateAngleY + (float) Math.toRadians(yy), frontrightleg3.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 0) / 5) * (51.95634-(0)));
            yy = 0 + (((tickAnim - 0) / 5) * (31.65177-(0)));
            zz = 0 + (((tickAnim - 0) / 5) * (-42.65616-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 8) {
            xx = 51.95634 + (((tickAnim - 5) / 3) * (100.41813-(51.95634)));
            yy = 31.65177 + (((tickAnim - 5) / 3) * (37.4186-(31.65177)));
            zz = -42.65616 + (((tickAnim - 5) / 3) * (-61.15806-(-42.65616)));
        }
        else if (tickAnim >= 8 && tickAnim < 14) {
            xx = 100.41813 + (((tickAnim - 8) / 6) * (87.91813-(100.41813)));
            yy = 37.4186 + (((tickAnim - 8) / 6) * (37.4186-(37.4186)));
            zz = -61.15806 + (((tickAnim - 8) / 6) * (-61.15806-(-61.15806)));
        }
        else if (tickAnim >= 14 && tickAnim < 18) {
            xx = 87.91813 + (((tickAnim - 14) / 4) * (48.12228-(87.91813)));
            yy = 37.4186 + (((tickAnim - 14) / 4) * (43.95435-(37.4186)));
            zz = -61.15806 + (((tickAnim - 14) / 4) * (-53.24545-(-61.15806)));
        }
        else if (tickAnim >= 18 && tickAnim < 22) {
            xx = 48.12228 + (((tickAnim - 18) / 4) * (25.19557-(48.12228)));
            yy = 43.95435 + (((tickAnim - 18) / 4) * (50.24892-(43.95435)));
            zz = -53.24545 + (((tickAnim - 18) / 4) * (-52.25682-(-53.24545)));
        }
        else if (tickAnim >= 22 && tickAnim < 26) {
            xx = 25.19557 + (((tickAnim - 22) / 4) * (78.2731-(25.19557)));
            yy = 50.24892 + (((tickAnim - 22) / 4) * (36.08779-(50.24892)));
            zz = -52.25682 + (((tickAnim - 22) / 4) * (-56.88839-(-52.25682)));
        }
        else if (tickAnim >= 26 && tickAnim < 29) {
            xx = 78.2731 + (((tickAnim - 26) / 3) * (68.00975-(78.2731)));
            yy = 36.08779 + (((tickAnim - 26) / 3) * (35.20059-(36.08779)));
            zz = -56.88839 + (((tickAnim - 26) / 3) * (-54.04195-(-56.88839)));
        }
        else if (tickAnim >= 29 && tickAnim < 35) {
            xx = 68.00975 + (((tickAnim - 29) / 6) * (13.67242-(68.00975)));
            yy = 35.20059 + (((tickAnim - 29) / 6) * (54.56993-(35.20059)));
            zz = -54.04195 + (((tickAnim - 29) / 6) * (-48.72839-(-54.04195)));
        }
        else if (tickAnim >= 35 && tickAnim < 45) {
            xx = 13.67242 + (((tickAnim - 35) / 10) * (51.95634-(13.67242)));
            yy = 54.56993 + (((tickAnim - 35) / 10) * (31.65177-(54.56993)));
            zz = -48.72839 + (((tickAnim - 35) / 10) * (-42.65616-(-48.72839)));
        }
        else if (tickAnim >= 45 && tickAnim < 50) {
            xx = 51.95634 + (((tickAnim - 45) / 5) * (0-(51.95634)));
            yy = 31.65177 + (((tickAnim - 45) / 5) * (0-(31.65177)));
            zz = -42.65616 + (((tickAnim - 45) / 5) * (0-(-42.65616)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(backrightleg, backrightleg.rotateAngleX + (float) Math.toRadians(xx), backrightleg.rotateAngleY + (float) Math.toRadians(yy), backrightleg.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 0) / 5) * (-27.5-(0)));
            yy = 0 + (((tickAnim - 0) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 5) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 8) {
            xx = -27.5 + (((tickAnim - 5) / 3) * (-47.5-(-27.5)));
            yy = 0 + (((tickAnim - 5) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 5) / 3) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 13) {
            xx = -47.5 + (((tickAnim - 8) / 5) * (-30-(-47.5)));
            yy = 0 + (((tickAnim - 8) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 5) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 19) {
            xx = -30 + (((tickAnim - 13) / 6) * (17.5-(-30)));
            yy = 0 + (((tickAnim - 13) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 13) / 6) * (0-(0)));
        }
        else if (tickAnim >= 19 && tickAnim < 26) {
            xx = 17.5 + (((tickAnim - 19) / 7) * (-32.5-(17.5)));
            yy = 0 + (((tickAnim - 19) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 19) / 7) * (0-(0)));
        }
        else if (tickAnim >= 26 && tickAnim < 33) {
            xx = -32.5 + (((tickAnim - 26) / 7) * (12.5-(-32.5)));
            yy = 0 + (((tickAnim - 26) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 26) / 7) * (0-(0)));
        }
        else if (tickAnim >= 33 && tickAnim < 45) {
            xx = 12.5 + (((tickAnim - 33) / 12) * (-27.5-(12.5)));
            yy = 0 + (((tickAnim - 33) / 12) * (0-(0)));
            zz = 0 + (((tickAnim - 33) / 12) * (0-(0)));
        }
        else if (tickAnim >= 45 && tickAnim < 50) {
            xx = -27.5 + (((tickAnim - 45) / 5) * (0-(-27.5)));
            yy = 0 + (((tickAnim - 45) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 45) / 5) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(backrightleg2, backrightleg2.rotateAngleX + (float) Math.toRadians(xx), backrightleg2.rotateAngleY + (float) Math.toRadians(yy), backrightleg2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 0) / 5) * (13.25307-(0)));
            yy = 0 + (((tickAnim - 0) / 5) * (-56.95031-(0)));
            zz = 0 + (((tickAnim - 0) / 5) * (24.79508-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 10) {
            xx = 13.25307 + (((tickAnim - 5) / 5) * (-14.17262-(13.25307)));
            yy = -56.95031 + (((tickAnim - 5) / 5) * (-12.18528-(-56.95031)));
            zz = 24.79508 + (((tickAnim - 5) / 5) * (60.36416-(24.79508)));
        }
        else if (tickAnim >= 10 && tickAnim < 19) {
            xx = -14.17262 + (((tickAnim - 10) / 9) * (-53.19911-(-14.17262)));
            yy = -12.18528 + (((tickAnim - 10) / 9) * (-5.24527-(-12.18528)));
            zz = 60.36416 + (((tickAnim - 10) / 9) * (57.35691-(60.36416)));
        }
        else if (tickAnim >= 19 && tickAnim < 27) {
            xx = -53.19911 + (((tickAnim - 19) / 8) * (-10.69911-(-53.19911)));
            yy = -5.24527 + (((tickAnim - 19) / 8) * (-5.24527-(-5.24527)));
            zz = 57.35691 + (((tickAnim - 19) / 8) * (57.35691-(57.35691)));
        }
        else if (tickAnim >= 27 && tickAnim < 30) {
            xx = -10.69911 + (((tickAnim - 27) / 3) * (-0.69911-(-10.69911)));
            yy = -5.24527 + (((tickAnim - 27) / 3) * (-5.24527-(-5.24527)));
            zz = 57.35691 + (((tickAnim - 27) / 3) * (57.35691-(57.35691)));
        }
        else if (tickAnim >= 30 && tickAnim < 33) {
            xx = -0.69911 + (((tickAnim - 30) / 3) * (-40.69911-(-0.69911)));
            yy = -5.24527 + (((tickAnim - 30) / 3) * (-5.24527-(-5.24527)));
            zz = 57.35691 + (((tickAnim - 30) / 3) * (57.35691-(57.35691)));
        }
        else if (tickAnim >= 33 && tickAnim < 45) {
            xx = -40.69911 + (((tickAnim - 33) / 12) * (13.25307-(-40.69911)));
            yy = -5.24527 + (((tickAnim - 33) / 12) * (-56.95031-(-5.24527)));
            zz = 57.35691 + (((tickAnim - 33) / 12) * (24.79508-(57.35691)));
        }
        else if (tickAnim >= 45 && tickAnim < 50) {
            xx = 13.25307 + (((tickAnim - 45) / 5) * (0-(13.25307)));
            yy = -56.95031 + (((tickAnim - 45) / 5) * (0-(-56.95031)));
            zz = 24.79508 + (((tickAnim - 45) / 5) * (0-(24.79508)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(backrightleg3, backrightleg3.rotateAngleX + (float) Math.toRadians(xx), backrightleg3.rotateAngleY + (float) Math.toRadians(yy), backrightleg3.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 0) / 5) * (-12.2859-(0)));
            yy = 0 + (((tickAnim - 0) / 5) * (47.52914-(0)));
            zz = 0 + (((tickAnim - 0) / 5) * (-40.31662-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 8) {
            xx = -12.2859 + (((tickAnim - 5) / 3) * (-12.04388-(-12.2859)));
            yy = 47.52914 + (((tickAnim - 5) / 3) * (47.9741-(47.52914)));
            zz = -40.31662 + (((tickAnim - 5) / 3) * (-42.91691-(-40.31662)));
        }
        else if (tickAnim >= 8 && tickAnim < 17) {
            xx = -12.04388 + (((tickAnim - 8) / 9) * (-16.23718-(-12.04388)));
            yy = 47.9741 + (((tickAnim - 8) / 9) * (46.19724-(47.9741)));
            zz = -42.91691 + (((tickAnim - 8) / 9) * (-55.79472-(-42.91691)));
        }
        else if (tickAnim >= 17 && tickAnim < 21) {
            xx = -16.23718 + (((tickAnim - 17) / 4) * (-13.10174-(-16.23718)));
            yy = 46.19724 + (((tickAnim - 17) / 4) * (46.47373-(46.19724)));
            zz = -55.79472 + (((tickAnim - 17) / 4) * (-46.92402-(-55.79472)));
        }
        else if (tickAnim >= 21 && tickAnim < 27) {
            xx = -13.10174 + (((tickAnim - 21) / 6) * (-14.75548-(-13.10174)));
            yy = 46.47373 + (((tickAnim - 21) / 6) * (47.43365-(46.47373)));
            zz = -46.92402 + (((tickAnim - 21) / 6) * (-49.06171-(-46.92402)));
        }
        else if (tickAnim >= 27 && tickAnim < 33) {
            xx = -14.75548 + (((tickAnim - 27) / 6) * (-12.03497-(-14.75548)));
            yy = 47.43365 + (((tickAnim - 27) / 6) * (46.47858-(47.43365)));
            zz = -49.06171 + (((tickAnim - 27) / 6) * (-42.59597-(-49.06171)));
        }
        else if (tickAnim >= 33 && tickAnim < 39) {
            xx = -12.03497 + (((tickAnim - 33) / 6) * (-14.33054-(-12.03497)));
            yy = 46.47858 + (((tickAnim - 33) / 6) * (48.38533-(46.47858)));
            zz = -42.59597 + (((tickAnim - 33) / 6) * (-45.78352-(-42.59597)));
        }
        else if (tickAnim >= 39 && tickAnim < 45) {
            xx = -14.33054 + (((tickAnim - 39) / 6) * (-12.2859-(-14.33054)));
            yy = 48.38533 + (((tickAnim - 39) / 6) * (47.52914-(48.38533)));
            zz = -45.78352 + (((tickAnim - 39) / 6) * (-40.31662-(-45.78352)));
        }
        else if (tickAnim >= 45 && tickAnim < 50) {
            xx = -12.2859 + (((tickAnim - 45) / 5) * (0-(-12.2859)));
            yy = 47.52914 + (((tickAnim - 45) / 5) * (0-(47.52914)));
            zz = -40.31662 + (((tickAnim - 45) / 5) * (0-(-40.31662)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(frontleftleg, frontleftleg.rotateAngleX + (float) Math.toRadians(xx), frontleftleg.rotateAngleY + (float) Math.toRadians(yy), frontleftleg.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 0) / 5) * (15-(0)));
            yy = 0 + (((tickAnim - 0) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 5) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 50) {
            xx = 15 + (((tickAnim - 5) / 45) * (0-(15)));
            yy = 0 + (((tickAnim - 5) / 45) * (0-(0)));
            zz = 0 + (((tickAnim - 5) / 45) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(frontleftleg2, frontleftleg2.rotateAngleX + (float) Math.toRadians(xx), frontleftleg2.rotateAngleY + (float) Math.toRadians(yy), frontleftleg2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 0) / 5) * (30.99426-(0)));
            yy = 0 + (((tickAnim - 0) / 5) * (39.89871-(0)));
            zz = 0 + (((tickAnim - 0) / 5) * (46.99622-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 8) {
            xx = 30.99426 + (((tickAnim - 5) / 3) * (30.99426-(30.99426)));
            yy = 39.89871 + (((tickAnim - 5) / 3) * (39.89871-(39.89871)));
            zz = 46.99622 + (((tickAnim - 5) / 3) * (46.99622-(46.99622)));
        }
        else if (tickAnim >= 8 && tickAnim < 17) {
            xx = 30.99426 + (((tickAnim - 8) / 9) * (34.96599-(30.99426)));
            yy = 39.89871 + (((tickAnim - 8) / 9) * (49.68727-(39.89871)));
            zz = 46.99622 + (((tickAnim - 8) / 9) * (51.46469-(46.99622)));
        }
        else if (tickAnim >= 17 && tickAnim < 45) {
            xx = 34.96599 + (((tickAnim - 17) / 28) * (30.99426-(34.96599)));
            yy = 49.68727 + (((tickAnim - 17) / 28) * (39.89871-(49.68727)));
            zz = 51.46469 + (((tickAnim - 17) / 28) * (46.99622-(51.46469)));
        }
        else if (tickAnim >= 45 && tickAnim < 50) {
            xx = 30.99426 + (((tickAnim - 45) / 5) * (0-(30.99426)));
            yy = 39.89871 + (((tickAnim - 45) / 5) * (0-(39.89871)));
            zz = 46.99622 + (((tickAnim - 45) / 5) * (0-(46.99622)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(frontleftleg3, frontleftleg3.rotateAngleX + (float) Math.toRadians(xx), frontleftleg3.rotateAngleY + (float) Math.toRadians(yy), frontleftleg3.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 0) / 5) * (51.95634-(0)));
            yy = 0 + (((tickAnim - 0) / 5) * (-31.65177-(0)));
            zz = 0 + (((tickAnim - 0) / 5) * (42.65616-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 12) {
            xx = 51.95634 + (((tickAnim - 5) / 7) * (100.41813-(51.95634)));
            yy = -31.65177 + (((tickAnim - 5) / 7) * (-37.4186-(-31.65177)));
            zz = 42.65616 + (((tickAnim - 5) / 7) * (61.15806-(42.65616)));
        }
        else if (tickAnim >= 12 && tickAnim < 19) {
            xx = 100.41813 + (((tickAnim - 12) / 7) * (87.91813-(100.41813)));
            yy = -37.4186 + (((tickAnim - 12) / 7) * (-37.4186-(-37.4186)));
            zz = 61.15806 + (((tickAnim - 12) / 7) * (61.15806-(61.15806)));
        }
        else if (tickAnim >= 19 && tickAnim < 23) {
            xx = 87.91813 + (((tickAnim - 19) / 4) * (48.12228-(87.91813)));
            yy = -37.4186 + (((tickAnim - 19) / 4) * (-43.95435-(-37.4186)));
            zz = 61.15806 + (((tickAnim - 19) / 4) * (53.24545-(61.15806)));
        }
        else if (tickAnim >= 23 && tickAnim < 27) {
            xx = 48.12228 + (((tickAnim - 23) / 4) * (25.19557-(48.12228)));
            yy = -43.95435 + (((tickAnim - 23) / 4) * (-50.24892-(-43.95435)));
            zz = 53.24545 + (((tickAnim - 23) / 4) * (52.25682-(53.24545)));
        }
        else if (tickAnim >= 27 && tickAnim < 29) {
            xx = 25.19557 + (((tickAnim - 27) / 2) * (78.2731-(25.19557)));
            yy = -50.24892 + (((tickAnim - 27) / 2) * (-36.08779-(-50.24892)));
            zz = 52.25682 + (((tickAnim - 27) / 2) * (56.88839-(52.25682)));
        }
        else if (tickAnim >= 29 && tickAnim < 33) {
            xx = 78.2731 + (((tickAnim - 29) / 4) * (68.00975-(78.2731)));
            yy = -36.08779 + (((tickAnim - 29) / 4) * (-35.20059-(-36.08779)));
            zz = 56.88839 + (((tickAnim - 29) / 4) * (54.04195-(56.88839)));
        }
        else if (tickAnim >= 33 && tickAnim < 40) {
            xx = 68.00975 + (((tickAnim - 33) / 7) * (13.67242-(68.00975)));
            yy = -35.20059 + (((tickAnim - 33) / 7) * (-54.56993-(-35.20059)));
            zz = 54.04195 + (((tickAnim - 33) / 7) * (48.72839-(54.04195)));
        }
        else if (tickAnim >= 40 && tickAnim < 45) {
            xx = 13.67242 + (((tickAnim - 40) / 5) * (51.95634-(13.67242)));
            yy = -54.56993 + (((tickAnim - 40) / 5) * (-31.65177-(-54.56993)));
            zz = 48.72839 + (((tickAnim - 40) / 5) * (42.65616-(48.72839)));
        }
        else if (tickAnim >= 45 && tickAnim < 50) {
            xx = 51.95634 + (((tickAnim - 45) / 5) * (0-(51.95634)));
            yy = -31.65177 + (((tickAnim - 45) / 5) * (0-(-31.65177)));
            zz = 42.65616 + (((tickAnim - 45) / 5) * (0-(42.65616)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(backleftleg, backleftleg.rotateAngleX + (float) Math.toRadians(xx), backleftleg.rotateAngleY + (float) Math.toRadians(yy), backleftleg.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 0) / 5) * (-27.5-(0)));
            yy = 0 + (((tickAnim - 0) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 5) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 11) {
            xx = -27.5 + (((tickAnim - 5) / 6) * (-47.5-(-27.5)));
            yy = 0 + (((tickAnim - 5) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 5) / 6) * (0-(0)));
        }
        else if (tickAnim >= 11 && tickAnim < 18) {
            xx = -47.5 + (((tickAnim - 11) / 7) * (-30-(-47.5)));
            yy = 0 + (((tickAnim - 11) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 11) / 7) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 24) {
            xx = -30 + (((tickAnim - 18) / 6) * (17.5-(-30)));
            yy = 0 + (((tickAnim - 18) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 18) / 6) * (0-(0)));
        }
        else if (tickAnim >= 24 && tickAnim < 29) {
            xx = 17.5 + (((tickAnim - 24) / 5) * (-32.5-(17.5)));
            yy = 0 + (((tickAnim - 24) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 24) / 5) * (0-(0)));
        }
        else if (tickAnim >= 29 && tickAnim < 38) {
            xx = -32.5 + (((tickAnim - 29) / 9) * (12.5-(-32.5)));
            yy = 0 + (((tickAnim - 29) / 9) * (0-(0)));
            zz = 0 + (((tickAnim - 29) / 9) * (0-(0)));
        }
        else if (tickAnim >= 38 && tickAnim < 45) {
            xx = 12.5 + (((tickAnim - 38) / 7) * (-27.5-(12.5)));
            yy = 0 + (((tickAnim - 38) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 38) / 7) * (0-(0)));
        }
        else if (tickAnim >= 45 && tickAnim < 50) {
            xx = -27.5 + (((tickAnim - 45) / 5) * (0-(-27.5)));
            yy = 0 + (((tickAnim - 45) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 45) / 5) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(backleftleg2, backleftleg2.rotateAngleX + (float) Math.toRadians(xx), backleftleg2.rotateAngleY + (float) Math.toRadians(yy), backleftleg2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 0) / 5) * (13.25307-(0)));
            yy = 0 + (((tickAnim - 0) / 5) * (56.95031-(0)));
            zz = 0 + (((tickAnim - 0) / 5) * (-24.79508-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 15) {
            xx = 13.25307 + (((tickAnim - 5) / 10) * (-14.17262-(13.25307)));
            yy = 56.95031 + (((tickAnim - 5) / 10) * (12.18528-(56.95031)));
            zz = -24.79508 + (((tickAnim - 5) / 10) * (-60.36416-(-24.79508)));
        }
        else if (tickAnim >= 15 && tickAnim < 24) {
            xx = -14.17262 + (((tickAnim - 15) / 9) * (-53.19911-(-14.17262)));
            yy = 12.18528 + (((tickAnim - 15) / 9) * (5.24527-(12.18528)));
            zz = -60.36416 + (((tickAnim - 15) / 9) * (-57.35691-(-60.36416)));
        }
        else if (tickAnim >= 24 && tickAnim < 30) {
            xx = -53.19911 + (((tickAnim - 24) / 6) * (-10.69911-(-53.19911)));
            yy = 5.24527 + (((tickAnim - 24) / 6) * (5.24527-(5.24527)));
            zz = -57.35691 + (((tickAnim - 24) / 6) * (-57.35691-(-57.35691)));
        }
        else if (tickAnim >= 30 && tickAnim < 34) {
            xx = -10.69911 + (((tickAnim - 30) / 4) * (-0.69911-(-10.69911)));
            yy = 5.24527 + (((tickAnim - 30) / 4) * (5.24527-(5.24527)));
            zz = -57.35691 + (((tickAnim - 30) / 4) * (-57.35691-(-57.35691)));
        }
        else if (tickAnim >= 34 && tickAnim < 38) {
            xx = -0.69911 + (((tickAnim - 34) / 4) * (-40.69911-(-0.69911)));
            yy = 5.24527 + (((tickAnim - 34) / 4) * (5.24527-(5.24527)));
            zz = -57.35691 + (((tickAnim - 34) / 4) * (-57.35691-(-57.35691)));
        }
        else if (tickAnim >= 38 && tickAnim < 45) {
            xx = -40.69911 + (((tickAnim - 38) / 7) * (13.25307-(-40.69911)));
            yy = 5.24527 + (((tickAnim - 38) / 7) * (56.95031-(5.24527)));
            zz = -57.35691 + (((tickAnim - 38) / 7) * (-24.79508-(-57.35691)));
        }
        else if (tickAnim >= 45 && tickAnim < 50) {
            xx = 13.25307 + (((tickAnim - 45) / 5) * (0-(13.25307)));
            yy = 56.95031 + (((tickAnim - 45) / 5) * (0-(56.95031)));
            zz = -24.79508 + (((tickAnim - 45) / 5) * (0-(-24.79508)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(backleftleg3, backleftleg3.rotateAngleX + (float) Math.toRadians(xx), backleftleg3.rotateAngleY + (float) Math.toRadians(yy), backleftleg3.rotateAngleZ + (float) Math.toRadians(zz));
    }
    public void animHide(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime, double animTick) {
        EntityPrehistoricFloraAnomalochelys entity = (EntityPrehistoricFloraAnomalochelys) entitylivingbaseIn;
        int animCycle = 315;
        double tickAnim = animTick + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;
         if (tickAnim >= 0 && tickAnim < 6) {
            xx = 0 + (((tickAnim - 0) / 6) * (-2.5-(0)));
            yy = 0 + (((tickAnim - 0) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 6) * (0-(0)));
        }
        else if (tickAnim >= 6 && tickAnim < 8) {
            xx = -2.5 + (((tickAnim - 6) / 2) * (0-(-2.5)));
            yy = 0 + (((tickAnim - 6) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 6) / 2) * (-2.5-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 11) {
            xx = 0 + (((tickAnim - 8) / 3) * (2.5-(0)));
            yy = 0 + (((tickAnim - 8) / 3) * (0-(0)));
            zz = -2.5 + (((tickAnim - 8) / 3) * (0-(-2.5)));
        }
        else if (tickAnim >= 11 && tickAnim < 13) {
            xx = 2.5 + (((tickAnim - 11) / 2) * (0.24957-(2.5)));
            yy = 0 + (((tickAnim - 11) / 2) * (-0.03272-(0)));
            zz = 0 + (((tickAnim - 11) / 2) * (1.49964-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 16) {
            xx = 0.24957 + (((tickAnim - 13) / 3) * (0-(0.24957)));
            yy = -0.03272 + (((tickAnim - 13) / 3) * (0-(-0.03272)));
            zz = 1.49964 + (((tickAnim - 13) / 3) * (0-(1.49964)));
        }
        else if (tickAnim >= 16 && tickAnim < 277) {
            xx = 0 + (((tickAnim - 16) / 261) * (0-(0)));
            yy = 0 + (((tickAnim - 16) / 261) * (0-(0)));
            zz = 0 + (((tickAnim - 16) / 261) * (0-(0)));
        }
        else if (tickAnim >= 277 && tickAnim < 281) {
            xx = 0 + (((tickAnim - 277) / 4) * (-3.17789-(0)));
            yy = 0 + (((tickAnim - 277) / 4) * (0.27788-(0)));
            zz = 0 + (((tickAnim - 277) / 4) * (4.99229-(0)));
        }
        else if (tickAnim >= 281 && tickAnim < 288) {
            xx = -3.17789 + (((tickAnim - 281) / 7) * (-2.76276-(-3.17789)));
            yy = 0.27788 + (((tickAnim - 281) / 7) * (-0.0136-(0.27788)));
            zz = 4.99229 + (((tickAnim - 281) / 7) * (-0.57698-(4.99229)));
        }
        else if (tickAnim >= 288 && tickAnim < 292) {
            xx = -2.76276 + (((tickAnim - 288) / 4) * (-2.5-(-2.76276)));
            yy = -0.0136 + (((tickAnim - 288) / 4) * (0-(-0.0136)));
            zz = -0.57698 + (((tickAnim - 288) / 4) * (0-(-0.57698)));
        }
        else if (tickAnim >= 292 && tickAnim < 298) {
            xx = -2.5 + (((tickAnim - 292) / 6) * (-1-(-2.5)));
            yy = 0 + (((tickAnim - 292) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 292) / 6) * (0-(0)));
        }
        else if (tickAnim >= 298 && tickAnim < 307) {
            xx = -1 + (((tickAnim - 298) / 9) * (-2.5-(-1)));
            yy = 0 + (((tickAnim - 298) / 9) * (0-(0)));
            zz = 0 + (((tickAnim - 298) / 9) * (0-(0)));
        }
        else if (tickAnim >= 307 && tickAnim < 315) {
            xx = -2.5 + (((tickAnim - 307) / 8) * (0-(-2.5)));
            yy = 0 + (((tickAnim - 307) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 307) / 8) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(main, main.rotateAngleX + (float) Math.toRadians(xx), main.rotateAngleY + (float) Math.toRadians(yy), main.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 6) {
            xx = 0 + (((tickAnim - 0) / 6) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 6) * (-4-(0)));
            zz = 0 + (((tickAnim - 0) / 6) * (0-(0)));
        }
        else if (tickAnim >= 6 && tickAnim < 277) {
            xx = 0 + (((tickAnim - 6) / 271) * (0-(0)));
            yy = -4 + (((tickAnim - 6) / 271) * (-4-(-4)));
            zz = 0 + (((tickAnim - 6) / 271) * (0-(0)));
        }
        else if (tickAnim >= 277 && tickAnim < 292) {
            xx = 0 + (((tickAnim - 277) / 15) * (0-(0)));
            yy = -4 + (((tickAnim - 277) / 15) * (-4-(-4)));
            zz = 0 + (((tickAnim - 277) / 15) * (0-(0)));
        }
        else if (tickAnim >= 292 && tickAnim < 307) {
            xx = 0 + (((tickAnim - 292) / 15) * (0-(0)));
            yy = -4 + (((tickAnim - 292) / 15) * (-4-(-4)));
            zz = 0 + (((tickAnim - 292) / 15) * (0-(0)));
        }
        else if (tickAnim >= 307 && tickAnim < 315) {
            xx = 0 + (((tickAnim - 307) / 8) * (0-(0)));
            yy = -4 + (((tickAnim - 307) / 8) * (0-(-4)));
            zz = 0 + (((tickAnim - 307) / 8) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.main.rotationPointX = this.main.rotationPointX + (float)(xx);
        this.main.rotationPointY = this.main.rotationPointY - (float)(yy);
        this.main.rotationPointZ = this.main.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 6) {
            xx = 0 + (((tickAnim - 0) / 6) * (-12.5-(0)));
            yy = 0 + (((tickAnim - 0) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 6) * (0-(0)));
        }
        else if (tickAnim >= 6 && tickAnim < 9) {
            xx = -12.5 + (((tickAnim - 6) / 3) * (22.92373-(-12.5)));
            yy = 0 + (((tickAnim - 6) / 3) * (40.97256-(0)));
            zz = 0 + (((tickAnim - 6) / 3) * (-3.84945-(0)));
        }
        else if (tickAnim >= 9 && tickAnim < 12) {
            xx = 22.92373 + (((tickAnim - 9) / 3) * (1.63273-(22.92373)));
            yy = 40.97256 + (((tickAnim - 9) / 3) * (57.93039-(40.97256)));
            zz = -3.84945 + (((tickAnim - 9) / 3) * (-19.89395-(-3.84945)));
        }
        else if (tickAnim >= 12 && tickAnim < 277) {
            xx = 1.63273 + (((tickAnim - 12) / 265) * (1.63273-(1.63273)));
            yy = 57.93039 + (((tickAnim - 12) / 265) * (57.93039-(57.93039)));
            zz = -19.89395 + (((tickAnim - 12) / 265) * (-19.89395-(-19.89395)));
        }
        else if (tickAnim >= 277 && tickAnim < 283) {
            xx = 1.63273 + (((tickAnim - 277) / 6) * (23.29204-(1.63273)));
            yy = 57.93039 + (((tickAnim - 277) / 6) * (49.12013-(57.93039)));
            zz = -19.89395 + (((tickAnim - 277) / 6) * (-4.53595-(-19.89395)));
        }
        else if (tickAnim >= 283 && tickAnim < 288) {
            xx = 23.29204 + (((tickAnim - 283) / 5) * (15.50935-(23.29204)));
            yy = 49.12013 + (((tickAnim - 283) / 5) * (16.29514-(49.12013)));
            zz = -4.53595 + (((tickAnim - 283) / 5) * (-1.37301-(-4.53595)));
        }
        else if (tickAnim >= 288 && tickAnim < 292) {
            xx = 15.50935 + (((tickAnim - 288) / 4) * (-0.00933-(15.50935)));
            yy = 16.29514 + (((tickAnim - 288) / 4) * (-2.462-(16.29514)));
            zz = -1.37301 + (((tickAnim - 288) / 4) * (0.43439-(-1.37301)));
        }
        else if (tickAnim >= 292 && tickAnim < 307) {
            xx = -0.00933 + (((tickAnim - 292) / 15) * (-12.5-(-0.00933)));
            yy = -2.462 + (((tickAnim - 292) / 15) * (0-(-2.462)));
            zz = 0.43439 + (((tickAnim - 292) / 15) * (0-(0.43439)));
        }
        else if (tickAnim >= 307 && tickAnim < 315) {
            xx = -12.5 + (((tickAnim - 307) / 8) * (0-(-12.5)));
            yy = 0 + (((tickAnim - 307) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 307) / 8) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck, neck.rotateAngleX + (float) Math.toRadians(xx), neck.rotateAngleY + (float) Math.toRadians(yy), neck.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 12) {
            xx = 0 + (((tickAnim - 0) / 12) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 12) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 12) * (1.1-(0)));
        }
        else if (tickAnim >= 12 && tickAnim < 277) {
            xx = 0 + (((tickAnim - 12) / 265) * (0-(0)));
            yy = 0 + (((tickAnim - 12) / 265) * (0-(0)));
            zz = 1.1 + (((tickAnim - 12) / 265) * (1.1-(1.1)));
        }
        else if (tickAnim >= 277 && tickAnim < 315) {
            xx = 0 + (((tickAnim - 277) / 38) * (0-(0)));
            yy = 0 + (((tickAnim - 277) / 38) * (0-(0)));
            zz = 1.1 + (((tickAnim - 277) / 38) * (0-(1.1)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.neck.rotationPointX = this.neck.rotationPointX + (float)(xx);
        this.neck.rotationPointY = this.neck.rotationPointY - (float)(yy);
        this.neck.rotationPointZ = this.neck.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 6) {
            xx = 0 + (((tickAnim - 0) / 6) * (-5-(0)));
            yy = 0 + (((tickAnim - 0) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 6) * (0-(0)));
        }
        else if (tickAnim >= 6 && tickAnim < 12) {
            xx = -5 + (((tickAnim - 6) / 6) * (-23.08267-(-5)));
            yy = 0 + (((tickAnim - 6) / 6) * (41.05815-(0)));
            zz = 0 + (((tickAnim - 6) / 6) * (-26.86279-(0)));
        }
        else if (tickAnim >= 12 && tickAnim < 277) {
            xx = -23.08267 + (((tickAnim - 12) / 265) * (-23.08267-(-23.08267)));
            yy = 41.05815 + (((tickAnim - 12) / 265) * (41.05815-(41.05815)));
            zz = -26.86279 + (((tickAnim - 12) / 265) * (-26.86279-(-26.86279)));
        }
        else if (tickAnim >= 277 && tickAnim < 292) {
            xx = -23.08267 + (((tickAnim - 277) / 15) * (-5-(-23.08267)));
            yy = 41.05815 + (((tickAnim - 277) / 15) * (-2.5-(41.05815)));
            zz = -26.86279 + (((tickAnim - 277) / 15) * (0-(-26.86279)));
        }
        else if (tickAnim >= 292 && tickAnim < 307) {
            xx = -5 + (((tickAnim - 292) / 15) * (-5-(-5)));
            yy = -2.5 + (((tickAnim - 292) / 15) * (0-(-2.5)));
            zz = 0 + (((tickAnim - 292) / 15) * (0-(0)));
        }
        else if (tickAnim >= 307 && tickAnim < 315) {
            xx = -5 + (((tickAnim - 307) / 8) * (0-(-5)));
            yy = 0 + (((tickAnim - 307) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 307) / 8) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(head, head.rotateAngleX + (float) Math.toRadians(xx), head.rotateAngleY + (float) Math.toRadians(yy), head.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 12) {
            xx = 0 + (((tickAnim - 0) / 12) * (0.525-(0)));
            yy = 0 + (((tickAnim - 0) / 12) * (-0.375-(0)));
            zz = 0 + (((tickAnim - 0) / 12) * (0.425-(0)));
        }
        else if (tickAnim >= 12 && tickAnim < 277) {
            xx = 0.525 + (((tickAnim - 12) / 265) * (0.525-(0.525)));
            yy = -0.375 + (((tickAnim - 12) / 265) * (-0.375-(-0.375)));
            zz = 0.425 + (((tickAnim - 12) / 265) * (0.425-(0.425)));
        }
        else if (tickAnim >= 277 && tickAnim < 315) {
            xx = 0.525 + (((tickAnim - 277) / 38) * (0-(0.525)));
            yy = -0.375 + (((tickAnim - 277) / 38) * (0-(-0.375)));
            zz = 0.425 + (((tickAnim - 277) / 38) * (0-(0.425)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.head.rotationPointX = this.head.rotationPointX + (float)(xx);
        this.head.rotationPointY = this.head.rotationPointY - (float)(yy);
        this.head.rotationPointZ = this.head.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 6) {
            xx = 0 + (((tickAnim - 0) / 6) * (-12.2859-(0)));
            yy = 0 + (((tickAnim - 0) / 6) * (-47.52914-(0)));
            zz = 0 + (((tickAnim - 0) / 6) * (40.31662-(0)));
        }
        else if (tickAnim >= 6 && tickAnim < 9) {
            xx = -12.2859 + (((tickAnim - 6) / 3) * (-11.61245-(-12.2859)));
            yy = -47.52914 + (((tickAnim - 6) / 3) * (-47.83166-(-47.52914)));
            zz = 40.31662 + (((tickAnim - 6) / 3) * (37.74525-(40.31662)));
        }
        else if (tickAnim >= 9 && tickAnim < 277) {
            xx = -11.61245 + (((tickAnim - 9) / 268) * (-11.61245-(-11.61245)));
            yy = -47.83166 + (((tickAnim - 9) / 268) * (-47.83166-(-47.83166)));
            zz = 37.74525 + (((tickAnim - 9) / 268) * (37.74525-(37.74525)));
        }
        else if (tickAnim >= 277 && tickAnim < 283) {
            xx = -11.61245 + (((tickAnim - 277) / 6) * (-17.25469-(-11.61245)));
            yy = -47.83166 + (((tickAnim - 277) / 6) * (-43.87569-(-47.83166)));
            zz = 37.74525 + (((tickAnim - 277) / 6) * (61.82899-(37.74525)));
        }
        else if (tickAnim >= 283 && tickAnim < 288) {
            xx = -17.25469 + (((tickAnim - 283) / 5) * (-12.2859-(-17.25469)));
            yy = -43.87569 + (((tickAnim - 283) / 5) * (-47.52914-(-43.87569)));
            zz = 61.82899 + (((tickAnim - 283) / 5) * (40.31662-(61.82899)));
        }
        else if (tickAnim >= 288 && tickAnim < 297) {
            xx = -12.2859 + (((tickAnim - 288) / 9) * (-13.58442-(-12.2859)));
            yy = -47.52914 + (((tickAnim - 288) / 9) * (-46.8384-(-47.52914)));
            zz = 40.31662 + (((tickAnim - 288) / 9) * (45.43602-(40.31662)));
        }
        else if (tickAnim >= 297 && tickAnim < 300) {
            xx = -13.58442 + (((tickAnim - 297) / 3) * (-13.44365-(-13.58442)));
            yy = -46.8384 + (((tickAnim - 297) / 3) * (-47.1978-(-46.8384)));
            zz = 45.43602 + (((tickAnim - 297) / 3) * (42.88037-(45.43602)));
        }
        else if (tickAnim >= 300 && tickAnim < 315) {
            xx = -13.44365 + (((tickAnim - 300) / 15) * (0-(-13.44365)));
            yy = -47.1978 + (((tickAnim - 300) / 15) * (0-(-47.1978)));
            zz = 42.88037 + (((tickAnim - 300) / 15) * (0-(42.88037)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(frontrightleg, frontrightleg.rotateAngleX + (float) Math.toRadians(xx), frontrightleg.rotateAngleY + (float) Math.toRadians(yy), frontrightleg.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 6) {
            xx = 0 + (((tickAnim - 0) / 6) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 6) * (0-(0)));
        }
        else if (tickAnim >= 6 && tickAnim < 9) {
            xx = 0 + (((tickAnim - 6) / 3) * (1-(0)));
            yy = 0 + (((tickAnim - 6) / 3) * (2-(0)));
            zz = 0 + (((tickAnim - 6) / 3) * (6-(0)));
        }
        else if (tickAnim >= 9 && tickAnim < 277) {
            xx = 1 + (((tickAnim - 9) / 268) * (1-(1)));
            yy = 2 + (((tickAnim - 9) / 268) * (2-(2)));
            zz = 6 + (((tickAnim - 9) / 268) * (6-(6)));
        }
        else if (tickAnim >= 277 && tickAnim < 288) {
            xx = 1 + (((tickAnim - 277) / 11) * (0-(1)));
            yy = 2 + (((tickAnim - 277) / 11) * (0-(2)));
            zz = 6 + (((tickAnim - 277) / 11) * (0-(6)));
        }
        else if (tickAnim >= 288 && tickAnim < 315) {
            xx = 0 + (((tickAnim - 288) / 27) * (0-(0)));
            yy = 0 + (((tickAnim - 288) / 27) * (0-(0)));
            zz = 0 + (((tickAnim - 288) / 27) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.frontrightleg.rotationPointX = this.frontrightleg.rotationPointX + (float)(xx);
        this.frontrightleg.rotationPointY = this.frontrightleg.rotationPointY - (float)(yy);
        this.frontrightleg.rotationPointZ = this.frontrightleg.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 6) {
            xx = 0 + (((tickAnim - 0) / 6) * (15-(0)));
            yy = 0 + (((tickAnim - 0) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 6) * (0-(0)));
        }
        else if (tickAnim >= 6 && tickAnim < 277) {
            xx = 15 + (((tickAnim - 6) / 271) * (15-(15)));
            yy = 0 + (((tickAnim - 6) / 271) * (0-(0)));
            zz = 0 + (((tickAnim - 6) / 271) * (0-(0)));
        }
        else if (tickAnim >= 277 && tickAnim < 288) {
            xx = 15 + (((tickAnim - 277) / 11) * (15-(15)));
            yy = 0 + (((tickAnim - 277) / 11) * (0-(0)));
            zz = 0 + (((tickAnim - 277) / 11) * (0-(0)));
        }
        else if (tickAnim >= 288 && tickAnim < 315) {
            xx = 15 + (((tickAnim - 288) / 27) * (0-(15)));
            yy = 0 + (((tickAnim - 288) / 27) * (0-(0)));
            zz = 0 + (((tickAnim - 288) / 27) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(frontrightleg2, frontrightleg2.rotateAngleX + (float) Math.toRadians(xx), frontrightleg2.rotateAngleY + (float) Math.toRadians(yy), frontrightleg2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 6) {
            xx = 0 + (((tickAnim - 0) / 6) * (30.99426-(0)));
            yy = 0 + (((tickAnim - 0) / 6) * (-39.89871-(0)));
            zz = 0 + (((tickAnim - 0) / 6) * (-46.99622-(0)));
        }
        else if (tickAnim >= 6 && tickAnim < 8) {
            xx = 30.99426 + (((tickAnim - 6) / 2) * (7.34218-(30.99426)));
            yy = -39.89871 + (((tickAnim - 6) / 2) * (-20.14227-(-39.89871)));
            zz = -46.99622 + (((tickAnim - 6) / 2) * (-18.08734-(-46.99622)));
        }
        else if (tickAnim >= 8 && tickAnim < 9) {
            xx = 7.34218 + (((tickAnim - 8) / 1) * (158.69011-(7.34218)));
            yy = -20.14227 + (((tickAnim - 8) / 1) * (-0.38584-(-20.14227)));
            zz = -18.08734 + (((tickAnim - 8) / 1) * (10.82154-(-18.08734)));
        }
        else if (tickAnim >= 9 && tickAnim < 277) {
            xx = 158.69011 + (((tickAnim - 9) / 268) * (158.69011-(158.69011)));
            yy = -0.38584 + (((tickAnim - 9) / 268) * (-0.38584-(-0.38584)));
            zz = 10.82154 + (((tickAnim - 9) / 268) * (10.82154-(10.82154)));
        }
        else if (tickAnim >= 277 && tickAnim < 288) {
            xx = 158.69011 + (((tickAnim - 277) / 11) * (30.99426-(158.69011)));
            yy = -0.38584 + (((tickAnim - 277) / 11) * (-39.89871-(-0.38584)));
            zz = 10.82154 + (((tickAnim - 277) / 11) * (-46.99622-(10.82154)));
        }
        else if (tickAnim >= 288 && tickAnim < 315) {
            xx = 30.99426 + (((tickAnim - 288) / 27) * (0-(30.99426)));
            yy = -39.89871 + (((tickAnim - 288) / 27) * (0-(-39.89871)));
            zz = -46.99622 + (((tickAnim - 288) / 27) * (0-(-46.99622)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(frontrightleg3, frontrightleg3.rotateAngleX + (float) Math.toRadians(xx), frontrightleg3.rotateAngleY + (float) Math.toRadians(yy), frontrightleg3.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 6) {
            xx = 0 + (((tickAnim - 0) / 6) * (51.95634-(0)));
            yy = 0 + (((tickAnim - 0) / 6) * (31.65177-(0)));
            zz = 0 + (((tickAnim - 0) / 6) * (-42.65616-(0)));
        }
        else if (tickAnim >= 6 && tickAnim < 282) {
            xx = 51.95634 + (((tickAnim - 6) / 276) * (51.95634-(51.95634)));
            yy = 31.65177 + (((tickAnim - 6) / 276) * (31.65177-(31.65177)));
            zz = -42.65616 + (((tickAnim - 6) / 276) * (-42.65616-(-42.65616)));
        }
        else if (tickAnim >= 282 && tickAnim < 288) {
            xx = 51.95634 + (((tickAnim - 282) / 6) * (76.26004-(51.95634)));
            yy = 31.65177 + (((tickAnim - 282) / 6) * (49.64608-(31.65177)));
            zz = -42.65616 + (((tickAnim - 282) / 6) * (-56.86179-(-42.65616)));
        }
        else if (tickAnim >= 288 && tickAnim < 293) {
            xx = 76.26004 + (((tickAnim - 288) / 5) * (45.71491-(76.26004)));
            yy = 49.64608 + (((tickAnim - 288) / 5) * (39.49625-(49.64608)));
            zz = -56.86179 + (((tickAnim - 288) / 5) * (-49.59306-(-56.86179)));
        }
        else if (tickAnim >= 293 && tickAnim < 298) {
            xx = 45.71491 + (((tickAnim - 293) / 5) * (52.34412-(45.71491)));
            yy = 39.49625 + (((tickAnim - 293) / 5) * (31.03817-(39.49625)));
            zz = -49.59306 + (((tickAnim - 293) / 5) * (-43.53586-(-49.59306)));
        }
        else if (tickAnim >= 298 && tickAnim < 302) {
            xx = 52.34412 + (((tickAnim - 298) / 4) * (52.74453-(52.34412)));
            yy = 31.03817 + (((tickAnim - 298) / 4) * (30.43-(31.03817)));
            zz = -43.53586 + (((tickAnim - 298) / 4) * (-44.42494-(-43.53586)));
        }
        else if (tickAnim >= 302 && tickAnim < 307) {
            xx = 52.74453 + (((tickAnim - 302) / 5) * (51.95634-(52.74453)));
            yy = 30.43 + (((tickAnim - 302) / 5) * (31.65177-(30.43)));
            zz = -44.42494 + (((tickAnim - 302) / 5) * (-42.65616-(-44.42494)));
        }
        else if (tickAnim >= 307 && tickAnim < 315) {
            xx = 51.95634 + (((tickAnim - 307) / 8) * (0-(51.95634)));
            yy = 31.65177 + (((tickAnim - 307) / 8) * (0-(31.65177)));
            zz = -42.65616 + (((tickAnim - 307) / 8) * (0-(-42.65616)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(backrightleg, backrightleg.rotateAngleX + (float) Math.toRadians(xx), backrightleg.rotateAngleY + (float) Math.toRadians(yy), backrightleg.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 6) {
            xx = 0 + (((tickAnim - 0) / 6) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 6) * (0-(0)));
        }
        else if (tickAnim >= 6 && tickAnim < 11) {
            xx = 0 + (((tickAnim - 6) / 5) * (4-(0)));
            yy = 0 + (((tickAnim - 6) / 5) * (1-(0)));
            zz = 0 + (((tickAnim - 6) / 5) * (-7-(0)));
        }
        else if (tickAnim >= 11 && tickAnim < 282) {
            xx = 4 + (((tickAnim - 11) / 271) * (4-(4)));
            yy = 1 + (((tickAnim - 11) / 271) * (1-(1)));
            zz = -7 + (((tickAnim - 11) / 271) * (-7-(-7)));
        }
        else if (tickAnim >= 282 && tickAnim < 298) {
            xx = 4 + (((tickAnim - 282) / 16) * (0-(4)));
            yy = 1 + (((tickAnim - 282) / 16) * (0-(1)));
            zz = -7 + (((tickAnim - 282) / 16) * (0-(-7)));
        }
        else if (tickAnim >= 298 && tickAnim < 307) {
            xx = 0 + (((tickAnim - 298) / 9) * (0-(0)));
            yy = 0 + (((tickAnim - 298) / 9) * (0-(0)));
            zz = 0 + (((tickAnim - 298) / 9) * (0-(0)));
        }
        else if (tickAnim >= 307 && tickAnim < 315) {
            xx = 0 + (((tickAnim - 307) / 8) * (0-(0)));
            yy = 0 + (((tickAnim - 307) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 307) / 8) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.backrightleg.rotationPointX = this.backrightleg.rotationPointX + (float)(xx);
        this.backrightleg.rotationPointY = this.backrightleg.rotationPointY - (float)(yy);
        this.backrightleg.rotationPointZ = this.backrightleg.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 6) {
            xx = 0 + (((tickAnim - 0) / 6) * (-27.5-(0)));
            yy = 0 + (((tickAnim - 0) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 6) * (0-(0)));
        }
        else if (tickAnim >= 6 && tickAnim < 282) {
            xx = -27.5 + (((tickAnim - 6) / 276) * (-27.5-(-27.5)));
            yy = 0 + (((tickAnim - 6) / 276) * (0-(0)));
            zz = 0 + (((tickAnim - 6) / 276) * (0-(0)));
        }
        else if (tickAnim >= 282 && tickAnim < 288) {
            xx = -27.5 + (((tickAnim - 282) / 6) * (-57.5-(-27.5)));
            yy = 0 + (((tickAnim - 282) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 282) / 6) * (0-(0)));
        }
        else if (tickAnim >= 288 && tickAnim < 293) {
            xx = -57.5 + (((tickAnim - 288) / 5) * (-27.5-(-57.5)));
            yy = 0 + (((tickAnim - 288) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 288) / 5) * (0-(0)));
        }
        else if (tickAnim >= 293 && tickAnim < 297) {
            xx = -27.5 + (((tickAnim - 293) / 4) * (-22.5-(-27.5)));
            yy = 0 + (((tickAnim - 293) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 293) / 4) * (0-(0)));
        }
        else if (tickAnim >= 297 && tickAnim < 299) {
            xx = -22.5 + (((tickAnim - 297) / 2) * (-27.5-(-22.5)));
            yy = 0 + (((tickAnim - 297) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 297) / 2) * (0-(0)));
        }
        else if (tickAnim >= 299 && tickAnim < 315) {
            xx = -27.5 + (((tickAnim - 299) / 16) * (0-(-27.5)));
            yy = 0 + (((tickAnim - 299) / 16) * (0-(0)));
            zz = 0 + (((tickAnim - 299) / 16) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(backrightleg2, backrightleg2.rotateAngleX + (float) Math.toRadians(xx), backrightleg2.rotateAngleY + (float) Math.toRadians(yy), backrightleg2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 6) {
            xx = 0 + (((tickAnim - 0) / 6) * (13.25307-(0)));
            yy = 0 + (((tickAnim - 0) / 6) * (-56.95031-(0)));
            zz = 0 + (((tickAnim - 0) / 6) * (24.79508-(0)));
        }
        else if (tickAnim >= 6 && tickAnim < 282) {
            xx = 13.25307 + (((tickAnim - 6) / 276) * (13.25307-(13.25307)));
            yy = -56.95031 + (((tickAnim - 6) / 276) * (-56.95031-(-56.95031)));
            zz = 24.79508 + (((tickAnim - 6) / 276) * (24.79508-(24.79508)));
        }
        else if (tickAnim >= 282 && tickAnim < 292) {
            xx = 13.25307 + (((tickAnim - 282) / 10) * (-51.1689-(13.25307)));
            yy = -56.95031 + (((tickAnim - 282) / 10) * (-62.7364-(-56.95031)));
            zz = 24.79508 + (((tickAnim - 282) / 10) * (92.41402-(24.79508)));
        }
        else if (tickAnim >= 292 && tickAnim < 295) {
            xx = -51.1689 + (((tickAnim - 292) / 3) * (13.25307-(-51.1689)));
            yy = -62.7364 + (((tickAnim - 292) / 3) * (-56.95031-(-62.7364)));
            zz = 92.41402 + (((tickAnim - 292) / 3) * (24.79508-(92.41402)));
        }
        else if (tickAnim >= 295 && tickAnim < 315) {
            xx = 13.25307 + (((tickAnim - 295) / 20) * (0-(13.25307)));
            yy = -56.95031 + (((tickAnim - 295) / 20) * (0-(-56.95031)));
            zz = 24.79508 + (((tickAnim - 295) / 20) * (0-(24.79508)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(backrightleg3, backrightleg3.rotateAngleX + (float) Math.toRadians(xx), backrightleg3.rotateAngleY + (float) Math.toRadians(yy), backrightleg3.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 6) {
            xx = 0 + (((tickAnim - 0) / 6) * (-12.2859-(0)));
            yy = 0 + (((tickAnim - 0) / 6) * (47.52914-(0)));
            zz = 0 + (((tickAnim - 0) / 6) * (-40.31662-(0)));
        }
        else if (tickAnim >= 6 && tickAnim < 11) {
            xx = -12.2859 + (((tickAnim - 6) / 5) * (-11.61245-(-12.2859)));
            yy = 47.52914 + (((tickAnim - 6) / 5) * (47.83166-(47.52914)));
            zz = -40.31662 + (((tickAnim - 6) / 5) * (-37.74525-(-40.31662)));
        }
        else if (tickAnim >= 11 && tickAnim < 281) {
            xx = -11.61245 + (((tickAnim - 11) / 270) * (-11.61245-(-11.61245)));
            yy = 47.83166 + (((tickAnim - 11) / 270) * (47.83166-(47.83166)));
            zz = -37.74525 + (((tickAnim - 11) / 270) * (-37.74525-(-37.74525)));
        }
        else if (tickAnim >= 281 && tickAnim < 287) {
            xx = -11.61245 + (((tickAnim - 281) / 6) * (-17.25469-(-11.61245)));
            yy = 47.83166 + (((tickAnim - 281) / 6) * (43.87569-(47.83166)));
            zz = -37.74525 + (((tickAnim - 281) / 6) * (-61.82899-(-37.74525)));
        }
        else if (tickAnim >= 287 && tickAnim < 293) {
            xx = -17.25469 + (((tickAnim - 287) / 6) * (-12.2859-(-17.25469)));
            yy = 43.87569 + (((tickAnim - 287) / 6) * (47.52914-(43.87569)));
            zz = -61.82899 + (((tickAnim - 287) / 6) * (-40.31662-(-61.82899)));
        }
        else if (tickAnim >= 293 && tickAnim < 297) {
            xx = -12.2859 + (((tickAnim - 293) / 4) * (-13.0732-(-12.2859)));
            yy = 47.52914 + (((tickAnim - 293) / 4) * (47.12814-(47.52914)));
            zz = -40.31662 + (((tickAnim - 293) / 4) * (-43.39216-(-40.31662)));
        }
        else if (tickAnim >= 297 && tickAnim < 300) {
            xx = -13.0732 + (((tickAnim - 297) / 3) * (-13.20206-(-13.0732)));
            yy = 47.12814 + (((tickAnim - 297) / 3) * (47.05737-(47.12814)));
            zz = -43.39216 + (((tickAnim - 297) / 3) * (-43.90363-(-43.39216)));
        }
        else if (tickAnim >= 300 && tickAnim < 315) {
            xx = -13.20206 + (((tickAnim - 300) / 15) * (0-(-13.20206)));
            yy = 47.05737 + (((tickAnim - 300) / 15) * (0-(47.05737)));
            zz = -43.90363 + (((tickAnim - 300) / 15) * (0-(-43.90363)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(frontleftleg, frontleftleg.rotateAngleX + (float) Math.toRadians(xx), frontleftleg.rotateAngleY + (float) Math.toRadians(yy), frontleftleg.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 6) {
            xx = 0 + (((tickAnim - 0) / 6) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 6) * (0-(0)));
        }
        else if (tickAnim >= 6 && tickAnim < 11) {
            xx = 0 + (((tickAnim - 6) / 5) * (-1-(0)));
            yy = 0 + (((tickAnim - 6) / 5) * (2-(0)));
            zz = 0 + (((tickAnim - 6) / 5) * (6-(0)));
        }
        else if (tickAnim >= 11 && tickAnim < 281) {
            xx = -1 + (((tickAnim - 11) / 270) * (-1-(-1)));
            yy = 2 + (((tickAnim - 11) / 270) * (2-(2)));
            zz = 6 + (((tickAnim - 11) / 270) * (6-(6)));
        }
        else if (tickAnim >= 281 && tickAnim < 293) {
            xx = -1 + (((tickAnim - 281) / 12) * (0-(-1)));
            yy = 2 + (((tickAnim - 281) / 12) * (0-(2)));
            zz = 6 + (((tickAnim - 281) / 12) * (0-(6)));
        }
        else if (tickAnim >= 293 && tickAnim < 315) {
            xx = 0 + (((tickAnim - 293) / 22) * (0-(0)));
            yy = 0 + (((tickAnim - 293) / 22) * (0-(0)));
            zz = 0 + (((tickAnim - 293) / 22) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.frontleftleg.rotationPointX = this.frontleftleg.rotationPointX + (float)(xx);
        this.frontleftleg.rotationPointY = this.frontleftleg.rotationPointY - (float)(yy);
        this.frontleftleg.rotationPointZ = this.frontleftleg.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 6) {
            xx = 0 + (((tickAnim - 0) / 6) * (15-(0)));
            yy = 0 + (((tickAnim - 0) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 6) * (0-(0)));
        }
        else if (tickAnim >= 6 && tickAnim < 281) {
            xx = 15 + (((tickAnim - 6) / 275) * (15-(15)));
            yy = 0 + (((tickAnim - 6) / 275) * (0-(0)));
            zz = 0 + (((tickAnim - 6) / 275) * (0-(0)));
        }
        else if (tickAnim >= 281 && tickAnim < 293) {
            xx = 15 + (((tickAnim - 281) / 12) * (15-(15)));
            yy = 0 + (((tickAnim - 281) / 12) * (0-(0)));
            zz = 0 + (((tickAnim - 281) / 12) * (0-(0)));
        }
        else if (tickAnim >= 293 && tickAnim < 315) {
            xx = 15 + (((tickAnim - 293) / 22) * (0-(15)));
            yy = 0 + (((tickAnim - 293) / 22) * (0-(0)));
            zz = 0 + (((tickAnim - 293) / 22) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(frontleftleg2, frontleftleg2.rotateAngleX + (float) Math.toRadians(xx), frontleftleg2.rotateAngleY + (float) Math.toRadians(yy), frontleftleg2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 6) {
            xx = 0 + (((tickAnim - 0) / 6) * (30.99426-(0)));
            yy = 0 + (((tickAnim - 0) / 6) * (39.89871-(0)));
            zz = 0 + (((tickAnim - 0) / 6) * (46.99622-(0)));
        }
        else if (tickAnim >= 6 && tickAnim < 8) {
            xx = 30.99426 + (((tickAnim - 6) / 2) * (7.34218-(30.99426)));
            yy = 39.89871 + (((tickAnim - 6) / 2) * (20.14227-(39.89871)));
            zz = 46.99622 + (((tickAnim - 6) / 2) * (18.08734-(46.99622)));
        }
        else if (tickAnim >= 8 && tickAnim < 11) {
            xx = 7.34218 + (((tickAnim - 8) / 3) * (158.69011-(7.34218)));
            yy = 20.14227 + (((tickAnim - 8) / 3) * (0.38584-(20.14227)));
            zz = 18.08734 + (((tickAnim - 8) / 3) * (-10.82154-(18.08734)));
        }
        else if (tickAnim >= 11 && tickAnim < 281) {
            xx = 158.69011 + (((tickAnim - 11) / 270) * (158.69011-(158.69011)));
            yy = 0.38584 + (((tickAnim - 11) / 270) * (0.38584-(0.38584)));
            zz = -10.82154 + (((tickAnim - 11) / 270) * (-10.82154-(-10.82154)));
        }
        else if (tickAnim >= 281 && tickAnim < 293) {
            xx = 158.69011 + (((tickAnim - 281) / 12) * (30.99426-(158.69011)));
            yy = 0.38584 + (((tickAnim - 281) / 12) * (39.89871-(0.38584)));
            zz = -10.82154 + (((tickAnim - 281) / 12) * (46.99622-(-10.82154)));
        }
        else if (tickAnim >= 293 && tickAnim < 315) {
            xx = 30.99426 + (((tickAnim - 293) / 22) * (0-(30.99426)));
            yy = 39.89871 + (((tickAnim - 293) / 22) * (0-(39.89871)));
            zz = 46.99622 + (((tickAnim - 293) / 22) * (0-(46.99622)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(frontleftleg3, frontleftleg3.rotateAngleX + (float) Math.toRadians(xx), frontleftleg3.rotateAngleY + (float) Math.toRadians(yy), frontleftleg3.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 6) {
            xx = 0 + (((tickAnim - 0) / 6) * (51.95634-(0)));
            yy = 0 + (((tickAnim - 0) / 6) * (-31.65177-(0)));
            zz = 0 + (((tickAnim - 0) / 6) * (42.65616-(0)));
        }
        else if (tickAnim >= 6 && tickAnim < 286) {
            xx = 51.95634 + (((tickAnim - 6) / 280) * (51.95634-(51.95634)));
            yy = -31.65177 + (((tickAnim - 6) / 280) * (-31.65177-(-31.65177)));
            zz = 42.65616 + (((tickAnim - 6) / 280) * (42.65616-(42.65616)));
        }
        else if (tickAnim >= 286 && tickAnim < 293) {
            xx = 51.95634 + (((tickAnim - 286) / 7) * (76.54413-(51.95634)));
            yy = -31.65177 + (((tickAnim - 286) / 7) * (-49.35686-(-31.65177)));
            zz = 42.65616 + (((tickAnim - 286) / 7) * (57.30772-(42.65616)));
        }
        else if (tickAnim >= 293 && tickAnim < 297) {
            xx = 76.54413 + (((tickAnim - 293) / 4) * (73.32222-(76.54413)));
            yy = -49.35686 + (((tickAnim - 293) / 4) * (-38.84202-(-49.35686)));
            zz = 57.30772 + (((tickAnim - 293) / 4) * (50.15068-(57.30772)));
        }
        else if (tickAnim >= 297 && tickAnim < 300) {
            xx = 73.32222 + (((tickAnim - 297) / 3) * (51.63938-(73.32222)));
            yy = -38.84202 + (((tickAnim - 297) / 3) * (-32.86947-(-38.84202)));
            zz = 50.15068 + (((tickAnim - 297) / 3) * (40.93269-(50.15068)));
        }
        else if (tickAnim >= 300 && tickAnim < 302) {
            xx = 51.63938 + (((tickAnim - 300) / 2) * (50.79845-(51.63938)));
            yy = -32.86947 + (((tickAnim - 300) / 2) * (-30.22483-(-32.86947)));
            zz = 40.93269 + (((tickAnim - 300) / 2) * (39.27297-(40.93269)));
        }
        else if (tickAnim >= 302 && tickAnim < 307) {
            xx = 50.79845 + (((tickAnim - 302) / 5) * (51.95634-(50.79845)));
            yy = -30.22483 + (((tickAnim - 302) / 5) * (-31.65177-(-30.22483)));
            zz = 39.27297 + (((tickAnim - 302) / 5) * (42.65616-(39.27297)));
        }
        else if (tickAnim >= 307 && tickAnim < 315) {
            xx = 51.95634 + (((tickAnim - 307) / 8) * (0-(51.95634)));
            yy = -31.65177 + (((tickAnim - 307) / 8) * (0-(-31.65177)));
            zz = 42.65616 + (((tickAnim - 307) / 8) * (0-(42.65616)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(backleftleg, backleftleg.rotateAngleX + (float) Math.toRadians(xx), backleftleg.rotateAngleY + (float) Math.toRadians(yy), backleftleg.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 6) {
            xx = 0 + (((tickAnim - 0) / 6) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 6) * (0-(0)));
        }
        else if (tickAnim >= 6 && tickAnim < 11) {
            xx = 0 + (((tickAnim - 6) / 5) * (-4-(0)));
            yy = 0 + (((tickAnim - 6) / 5) * (1-(0)));
            zz = 0 + (((tickAnim - 6) / 5) * (-7-(0)));
        }
        else if (tickAnim >= 11 && tickAnim < 286) {
            xx = -4 + (((tickAnim - 11) / 275) * (-4-(-4)));
            yy = 1 + (((tickAnim - 11) / 275) * (1-(1)));
            zz = -7 + (((tickAnim - 11) / 275) * (-7-(-7)));
        }
        else if (tickAnim >= 286 && tickAnim < 300) {
            xx = -4 + (((tickAnim - 286) / 14) * (0-(-4)));
            yy = 1 + (((tickAnim - 286) / 14) * (0-(1)));
            zz = -7 + (((tickAnim - 286) / 14) * (0-(-7)));
        }
        else if (tickAnim >= 300 && tickAnim < 307) {
            xx = 0 + (((tickAnim - 300) / 7) * (0-(0)));
            yy = 0 + (((tickAnim - 300) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 300) / 7) * (0-(0)));
        }
        else if (tickAnim >= 307 && tickAnim < 315) {
            xx = 0 + (((tickAnim - 307) / 8) * (0-(0)));
            yy = 0 + (((tickAnim - 307) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 307) / 8) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.backleftleg.rotationPointX = this.backleftleg.rotationPointX + (float)(xx);
        this.backleftleg.rotationPointY = this.backleftleg.rotationPointY - (float)(yy);
        this.backleftleg.rotationPointZ = this.backleftleg.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 6) {
            xx = 0 + (((tickAnim - 0) / 6) * (-27.5-(0)));
            yy = 0 + (((tickAnim - 0) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 6) * (0-(0)));
        }
        else if (tickAnim >= 6 && tickAnim < 286) {
            xx = -27.5 + (((tickAnim - 6) / 280) * (-27.5-(-27.5)));
            yy = 0 + (((tickAnim - 6) / 280) * (0-(0)));
            zz = 0 + (((tickAnim - 6) / 280) * (0-(0)));
        }
        else if (tickAnim >= 286 && tickAnim < 292) {
            xx = -27.5 + (((tickAnim - 286) / 6) * (-57.5-(-27.5)));
            yy = 0 + (((tickAnim - 286) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 286) / 6) * (0-(0)));
        }
        else if (tickAnim >= 292 && tickAnim < 298) {
            xx = -57.5 + (((tickAnim - 292) / 6) * (-28.81896-(-57.5)));
            yy = 0 + (((tickAnim - 292) / 6) * (3.98958-(0)));
            zz = 0 + (((tickAnim - 292) / 6) * (-6.46088-(0)));
        }
        else if (tickAnim >= 298 && tickAnim < 300) {
            xx = -28.81896 + (((tickAnim - 298) / 2) * (-30.02738-(-28.81896)));
            yy = 3.98958 + (((tickAnim - 298) / 2) * (1.59586-(3.98958)));
            zz = -6.46088 + (((tickAnim - 298) / 2) * (-2.58439-(-6.46088)));
        }
        else if (tickAnim >= 300 && tickAnim < 302) {
            xx = -30.02738 + (((tickAnim - 300) / 2) * (-27.5-(-30.02738)));
            yy = 1.59586 + (((tickAnim - 300) / 2) * (0-(1.59586)));
            zz = -2.58439 + (((tickAnim - 300) / 2) * (0-(-2.58439)));
        }
        else if (tickAnim >= 302 && tickAnim < 315) {
            xx = -27.5 + (((tickAnim - 302) / 13) * (0-(-27.5)));
            yy = 0 + (((tickAnim - 302) / 13) * (0-(0)));
            zz = 0 + (((tickAnim - 302) / 13) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(backleftleg2, backleftleg2.rotateAngleX + (float) Math.toRadians(xx), backleftleg2.rotateAngleY + (float) Math.toRadians(yy), backleftleg2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 6) {
            xx = 0 + (((tickAnim - 0) / 6) * (13.25307-(0)));
            yy = 0 + (((tickAnim - 0) / 6) * (56.95031-(0)));
            zz = 0 + (((tickAnim - 0) / 6) * (-24.79508-(0)));
        }
        else if (tickAnim >= 6 && tickAnim < 286) {
            xx = 13.25307 + (((tickAnim - 6) / 280) * (13.25307-(13.25307)));
            yy = 56.95031 + (((tickAnim - 6) / 280) * (56.95031-(56.95031)));
            zz = -24.79508 + (((tickAnim - 6) / 280) * (-24.79508-(-24.79508)));
        }
        else if (tickAnim >= 286 && tickAnim < 295) {
            xx = 13.25307 + (((tickAnim - 286) / 9) * (-64.9901-(13.25307)));
            yy = 56.95031 + (((tickAnim - 286) / 9) * (53.66626-(56.95031)));
            zz = -24.79508 + (((tickAnim - 286) / 9) * (-125.88739-(-24.79508)));
        }
        else if (tickAnim >= 295 && tickAnim < 300) {
            xx = -64.9901 + (((tickAnim - 295) / 5) * (13.25307-(-64.9901)));
            yy = 53.66626 + (((tickAnim - 295) / 5) * (56.95031-(53.66626)));
            zz = -125.88739 + (((tickAnim - 295) / 5) * (-24.79508-(-125.88739)));
        }
        else if (tickAnim >= 300 && tickAnim < 315) {
            xx = 13.25307 + (((tickAnim - 300) / 15) * (0-(13.25307)));
            yy = 56.95031 + (((tickAnim - 300) / 15) * (0-(56.95031)));
            zz = -24.79508 + (((tickAnim - 300) / 15) * (0-(-24.79508)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(backleftleg3, backleftleg3.rotateAngleX + (float) Math.toRadians(xx), backleftleg3.rotateAngleY + (float) Math.toRadians(yy), backleftleg3.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 6) {
            xx = 0 + (((tickAnim - 0) / 6) * (-14.94935-(0)));
            yy = 0 + (((tickAnim - 0) / 6) * (34.73799-(0)));
            zz = 0 + (((tickAnim - 0) / 6) * (-24.37082-(0)));
        }
        else if (tickAnim >= 6 && tickAnim < 12) {
            xx = -14.94935 + (((tickAnim - 6) / 6) * (1.52036-(-14.94935)));
            yy = 34.73799 + (((tickAnim - 6) / 6) * (39.31697-(34.73799)));
            zz = -24.37082 + (((tickAnim - 6) / 6) * (-5.44964-(-24.37082)));
        }
        else if (tickAnim >= 12 && tickAnim < 277) {
            xx = 1.52036 + (((tickAnim - 12) / 265) * (1.52036-(1.52036)));
            yy = 39.31697 + (((tickAnim - 12) / 265) * (39.31697-(39.31697)));
            zz = -5.44964 + (((tickAnim - 12) / 265) * (-5.44964-(-5.44964)));
        }
        else if (tickAnim >= 277 && tickAnim < 280) {
            xx = 1.52036 + (((tickAnim - 277) / 3) * (-14.94935-(1.52036)));
            yy = 39.31697 + (((tickAnim - 277) / 3) * (34.73799-(39.31697)));
            zz = -5.44964 + (((tickAnim - 277) / 3) * (-24.37082-(-5.44964)));
        }
        else if (tickAnim >= 280 && tickAnim < 295) {
            xx = -14.94935 + (((tickAnim - 280) / 15) * (0-(-14.94935)));
            yy = 34.73799 + (((tickAnim - 280) / 15) * (-2.5-(34.73799)));
            zz = -24.37082 + (((tickAnim - 280) / 15) * (0-(-24.37082)));
        }
        else if (tickAnim >= 295 && tickAnim < 310) {
            xx = 0 + (((tickAnim - 295) / 15) * (0-(0)));
            yy = -2.5 + (((tickAnim - 295) / 15) * (0-(-2.5)));
            zz = 0 + (((tickAnim - 295) / 15) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck2, neck2.rotateAngleX + (float) Math.toRadians(xx), neck2.rotateAngleY + (float) Math.toRadians(yy), neck2.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 12) {
            xx = 0 + (((tickAnim - 0) / 12) * (0.2-(0)));
            yy = 0 + (((tickAnim - 0) / 12) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 12) * (0.975-(0)));
        }
        else if (tickAnim >= 12 && tickAnim < 277) {
            xx = 0.2 + (((tickAnim - 12) / 265) * (0.2-(0.2)));
            yy = 0 + (((tickAnim - 12) / 265) * (0-(0)));
            zz = 0.975 + (((tickAnim - 12) / 265) * (0.975-(0.975)));
        }
        else if (tickAnim >= 277 && tickAnim < 315) {
            xx = 0.2 + (((tickAnim - 277) / 38) * (0-(0.2)));
            yy = 0 + (((tickAnim - 277) / 38) * (0-(0)));
            zz = 0.975 + (((tickAnim - 277) / 38) * (0-(0.975)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.neck2.rotationPointX = this.neck2.rotationPointX + (float)(xx);
        this.neck2.rotationPointY = this.neck2.rotationPointY - (float)(yy);
        this.neck2.rotationPointZ = this.neck2.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 0) / 5) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 5) * (-60-(0)));
            zz = 0 + (((tickAnim - 0) / 5) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 280) {
            xx = 0 + (((tickAnim - 5) / 275) * (0-(0)));
            yy = -60 + (((tickAnim - 5) / 275) * (-60-(-60)));
            zz = 0 + (((tickAnim - 5) / 275) * (0-(0)));
        }
        else if (tickAnim >= 280 && tickAnim < 295) {
            xx = 0 + (((tickAnim - 280) / 15) * (0-(0)));
            yy = -60 + (((tickAnim - 280) / 15) * (0-(-60)));
            zz = 0 + (((tickAnim - 280) / 15) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tail, tail.rotateAngleX + (float) Math.toRadians(xx), tail.rotateAngleY + (float) Math.toRadians(yy), tail.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 0) / 5) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 5) * (-80-(0)));
            zz = 0 + (((tickAnim - 0) / 5) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 280) {
            xx = 0 + (((tickAnim - 5) / 275) * (0-(0)));
            yy = -80 + (((tickAnim - 5) / 275) * (-80-(-80)));
            zz = 0 + (((tickAnim - 5) / 275) * (0-(0)));
        }
        else if (tickAnim >= 280 && tickAnim < 295) {
            xx = 0 + (((tickAnim - 280) / 15) * (0-(0)));
            yy = -80 + (((tickAnim - 280) / 15) * (0-(-80)));
            zz = 0 + (((tickAnim - 280) / 15) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tail2, tail2.rotateAngleX + (float) Math.toRadians(xx), tail2.rotateAngleY + (float) Math.toRadians(yy), tail2.rotateAngleZ + (float) Math.toRadians(zz));
    }
    public void animEat(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime, double animTick) {
        EntityPrehistoricFloraAnomalochelys entity = (EntityPrehistoricFloraAnomalochelys) entitylivingbaseIn;
        int animCycle = 40;
        double tickAnim = animTick + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;
         if (tickAnim >= 0 && tickAnim < 6) {
            xx = 0 + (((tickAnim - 0) / 6) * (-25.91607-(0)));
            yy = 0 + (((tickAnim - 0) / 6) * (2.11021-(0)));
            zz = 0 + (((tickAnim - 0) / 6) * (-16.03189-(0)));
        }
        else if (tickAnim >= 6 && tickAnim < 11) {
            xx = -25.91607 + (((tickAnim - 6) / 5) * (-10.20855-(-25.91607)));
            yy = 2.11021 + (((tickAnim - 6) / 5) * (5.40976-(2.11021)));
            zz = -16.03189 + (((tickAnim - 6) / 5) * (-24.7207-(-16.03189)));
        }
        else if (tickAnim >= 11 && tickAnim < 18) {
            xx = -10.20855 + (((tickAnim - 11) / 7) * (5.28775-(-10.20855)));
            yy = 5.40976 + (((tickAnim - 11) / 7) * (5.79735-(5.40976)));
            zz = -24.7207 + (((tickAnim - 11) / 7) * (-24.99651-(-24.7207)));
        }
        else if (tickAnim >= 18 && tickAnim < 21) {
            xx = 5.28775 + (((tickAnim - 18) / 3) * (8.44619-(5.28775)));
            yy = 5.79735 + (((tickAnim - 18) / 3) * (13.16925-(5.79735)));
            zz = -24.99651 + (((tickAnim - 18) / 3) * (-25.09866-(-24.99651)));
        }
        else if (tickAnim >= 21 && tickAnim < 23) {
            xx = 8.44619 + (((tickAnim - 21) / 2) * (-4.13447-(8.44619)));
            yy = 13.16925 + (((tickAnim - 21) / 2) * (16.10195-(13.16925)));
            zz = -25.09866 + (((tickAnim - 21) / 2) * (-13.52804-(-25.09866)));
        }
        else if (tickAnim >= 23 && tickAnim < 27) {
            xx = -4.13447 + (((tickAnim - 23) / 4) * (-17.35149-(-4.13447)));
            yy = 16.10195 + (((tickAnim - 23) / 4) * (7.10809-(16.10195)));
            zz = -13.52804 + (((tickAnim - 23) / 4) * (-11.50755-(-13.52804)));
        }
        else if (tickAnim >= 27 && tickAnim < 34) {
            xx = -17.35149 + (((tickAnim - 27) / 7) * (-4.15-(-17.35149)));
            yy = 7.10809 + (((tickAnim - 27) / 7) * (0.5-(7.10809)));
            zz = -11.50755 + (((tickAnim - 27) / 7) * (-1.73-(-11.50755)));
        }
        else if (tickAnim >= 34 && tickAnim < 40) {
            xx = -4.15 + (((tickAnim - 34) / 6) * (0-(-4.15)));
            yy = 0.5 + (((tickAnim - 34) / 6) * (0-(0.5)));
            zz = -1.73 + (((tickAnim - 34) / 6) * (0-(-1.73)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck, neck.rotateAngleX + (float) Math.toRadians(xx), neck.rotateAngleY + (float) Math.toRadians(yy), neck.rotateAngleZ + (float) Math.toRadians(zz));



        this.setRotateAngle(tail, tail.rotateAngleX + (float) Math.toRadians(5), tail.rotateAngleY + (float) Math.toRadians(-2.5), tail.rotateAngleZ + (float) Math.toRadians(0));



        if (tickAnim >= 0 && tickAnim < 6) {
            xx = 0 + (((tickAnim - 0) / 6) * (23.87345-(0)));
            yy = 0 + (((tickAnim - 0) / 6) * (-7.12331-(0)));
            zz = 0 + (((tickAnim - 0) / 6) * (-0.43652-(0)));
        }
        else if (tickAnim >= 6 && tickAnim < 11) {
            xx = 23.87345 + (((tickAnim - 6) / 5) * (11.64952-(23.87345)));
            yy = -7.12331 + (((tickAnim - 6) / 5) * (-8.87772-(-7.12331)));
            zz = -0.43652 + (((tickAnim - 6) / 5) * (-9.58098-(-0.43652)));
        }
        else if (tickAnim >= 11 && tickAnim < 14) {
            xx = 11.64952 + (((tickAnim - 11) / 3) * (-0.65004-(11.64952)));
            yy = -8.87772 + (((tickAnim - 11) / 3) * (-4.35098-(-8.87772)));
            zz = -9.58098 + (((tickAnim - 11) / 3) * (-24.6947-(-9.58098)));
        }
        else if (tickAnim >= 14 && tickAnim < 18) {
            xx = -0.65004 + (((tickAnim - 14) / 4) * (3.41903-(-0.65004)));
            yy = -4.35098 + (((tickAnim - 14) / 4) * (-9.43625-(-4.35098)));
            zz = -24.6947 + (((tickAnim - 14) / 4) * (-4.55343-(-24.6947)));
        }
        else if (tickAnim >= 18 && tickAnim < 21) {
            xx = 3.41903 + (((tickAnim - 18) / 3) * (0.51434-(3.41903)));
            yy = -9.43625 + (((tickAnim - 18) / 3) * (-5.869-(-9.43625)));
            zz = -4.55343 + (((tickAnim - 18) / 3) * (-10.00685-(-4.55343)));
        }
        else if (tickAnim >= 21 && tickAnim < 27) {
            xx = 0.51434 + (((tickAnim - 21) / 6) * (9.79232-(0.51434)));
            yy = -5.869 + (((tickAnim - 21) / 6) * (-3.88687-(-5.869)));
            zz = -10.00685 + (((tickAnim - 21) / 6) * (-4.94866-(-10.00685)));
        }
        else if (tickAnim >= 27 && tickAnim < 34) {
            xx = 9.79232 + (((tickAnim - 27) / 7) * (8.87-(9.79232)));
            yy = -3.88687 + (((tickAnim - 27) / 7) * (-0.73-(-3.88687)));
            zz = -4.94866 + (((tickAnim - 27) / 7) * (-0.93-(-4.94866)));
        }
        else if (tickAnim >= 34 && tickAnim < 40) {
            xx = 8.87 + (((tickAnim - 34) / 6) * (0-(8.87)));
            yy = -0.73 + (((tickAnim - 34) / 6) * (0-(-0.73)));
            zz = -0.93 + (((tickAnim - 34) / 6) * (0-(-0.93)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(head, head.rotateAngleX + (float) Math.toRadians(xx), head.rotateAngleY + (float) Math.toRadians(yy), head.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 11) {
            xx = 0 + (((tickAnim - 0) / 11) * (32.5-(0)));
            yy = 0 + (((tickAnim - 0) / 11) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 11) * (0-(0)));
        }
        else if (tickAnim >= 11 && tickAnim < 17) {
            xx = 32.5 + (((tickAnim - 11) / 6) * (27.5-(32.5)));
            yy = 0 + (((tickAnim - 11) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 11) / 6) * (0-(0)));
        }
        else if (tickAnim >= 17 && tickAnim < 18) {
            xx = 27.5 + (((tickAnim - 17) / 1) * (-2.5-(27.5)));
            yy = 0 + (((tickAnim - 17) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 17) / 1) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 40) {
            xx = -2.5 + (((tickAnim - 18) / 22) * (0-(-2.5)));
            yy = 0 + (((tickAnim - 18) / 22) * (0-(0)));
            zz = 0 + (((tickAnim - 18) / 22) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(jaw, jaw.rotateAngleX + (float) Math.toRadians(xx), jaw.rotateAngleY + (float) Math.toRadians(yy), jaw.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 14) {
            xx = 1 + (((tickAnim - 0) / 14) * (1-(1)));
            yy = 1 + (((tickAnim - 0) / 14) * (1-(1)));
            zz = 1 + (((tickAnim - 0) / 14) * (1-(1)));
        }
        else if (tickAnim >= 14 && tickAnim < 18) {
            xx = 1 + (((tickAnim - 14) / 4) * (1-(1)));
            yy = 1 + (((tickAnim - 14) / 4) * (0.6-(1)));
            zz = 1 + (((tickAnim - 14) / 4) * (1-(1)));
        }
        else if (tickAnim >= 18 && tickAnim < 21) {
            xx = 1 + (((tickAnim - 18) / 3) * (1-(1)));
            yy = 0.6 + (((tickAnim - 18) / 3) * (0.45-(0.6)));
            zz = 1 + (((tickAnim - 18) / 3) * (1-(1)));
        }
        else if (tickAnim >= 21 && tickAnim < 23) {
            xx = 1 + (((tickAnim - 21) / 2) * (1-(1)));
            yy = 0.45 + (((tickAnim - 21) / 2) * (1-(0.45)));
            zz = 1 + (((tickAnim - 21) / 2) * (1-(1)));
        }
        else if (tickAnim >= 23 && tickAnim < 40) {
            xx = 1 + (((tickAnim - 23) / 17) * (1-(1)));
            yy = 1 + (((tickAnim - 23) / 17) * (1-(1)));
            zz = 1 + (((tickAnim - 23) / 17) * (1-(1)));
        }
        else {
            xx = 1;
            yy = 1;
            zz = 1;
        }
        this.eyeright.setScale((float)xx, (float)yy, (float)zz);




        if (tickAnim >= 0 && tickAnim < 14) {
            xx = 1 + (((tickAnim - 0) / 14) * (1-(1)));
            yy = 1 + (((tickAnim - 0) / 14) * (1-(1)));
            zz = 1 + (((tickAnim - 0) / 14) * (1-(1)));
        }
        else if (tickAnim >= 14 && tickAnim < 18) {
            xx = 1 + (((tickAnim - 14) / 4) * (1-(1)));
            yy = 1 + (((tickAnim - 14) / 4) * (0.6-(1)));
            zz = 1 + (((tickAnim - 14) / 4) * (1-(1)));
        }
        else if (tickAnim >= 18 && tickAnim < 21) {
            xx = 1 + (((tickAnim - 18) / 3) * (1-(1)));
            yy = 0.6 + (((tickAnim - 18) / 3) * (0.45-(0.6)));
            zz = 1 + (((tickAnim - 18) / 3) * (1-(1)));
        }
        else if (tickAnim >= 21 && tickAnim < 23) {
            xx = 1 + (((tickAnim - 21) / 2) * (1-(1)));
            yy = 0.45 + (((tickAnim - 21) / 2) * (1-(0.45)));
            zz = 1 + (((tickAnim - 21) / 2) * (1-(1)));
        }
        else if (tickAnim >= 23 && tickAnim < 40) {
            xx = 1 + (((tickAnim - 23) / 17) * (1-(1)));
            yy = 1 + (((tickAnim - 23) / 17) * (1-(1)));
            zz = 1 + (((tickAnim - 23) / 17) * (1-(1)));
        }
        else {
            xx = 1;
            yy = 1;
            zz = 1;
        }
        this.eyeleft.setScale((float)xx, (float)yy, (float)zz);




        if (tickAnim >= 0 && tickAnim < 6) {
            xx = 0 + (((tickAnim - 0) / 6) * (19.38-(0)));
            yy = 0 + (((tickAnim - 0) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 6) * (0-(0)));
        }
        else if (tickAnim >= 6 && tickAnim < 18) {
            xx = 19.38 + (((tickAnim - 6) / 12) * (19.47005-(19.38)));
            yy = 0 + (((tickAnim - 6) / 12) * (2.63258-(0)));
            zz = 0 + (((tickAnim - 6) / 12) * (-12.22395-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 27) {
            xx = 19.47005 + (((tickAnim - 18) / 9) * (10-(19.47005)));
            yy = 2.63258 + (((tickAnim - 18) / 9) * (0-(2.63258)));
            zz = -12.22395 + (((tickAnim - 18) / 9) * (0-(-12.22395)));
        }
        else if (tickAnim >= 27 && tickAnim < 40) {
            xx = 10 + (((tickAnim - 27) / 13) * (0-(10)));
            yy = 0 + (((tickAnim - 27) / 13) * (0-(0)));
            zz = 0 + (((tickAnim - 27) / 13) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck2, neck2.rotateAngleX + (float) Math.toRadians(xx), neck2.rotateAngleY + (float) Math.toRadians(yy), neck2.rotateAngleZ + (float) Math.toRadians(zz));

    }
    public void animWalking(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime) {
        EntityPrehistoricFloraAnomalochelys entity = (EntityPrehistoricFloraAnomalochelys) entitylivingbaseIn;
        int animCycle = 60;
        double tickAnim = (entity.ticksExisted + entity.getTickOffset()) - (int) (Math.floor((double) (entity.ticksExisted + entity.getTickOffset()) / (double) animCycle) * (double) animCycle) + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;

        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 0 + (((tickAnim - 0) / 3) * (-0.74974-(0)));
            yy = 1 + (((tickAnim - 0) / 3) * (0.68037-(1)));
            zz = 1 + (((tickAnim - 0) / 3) * (0.98689-(1)));
        }
        else if (tickAnim >= 3 && tickAnim < 7) {
            xx = -0.74974 + (((tickAnim - 3) / 4) * (-1.1-(-0.74974)));
            yy = 0.68037 + (((tickAnim - 3) / 4) * (0.15-(0.68037)));
            zz = 0.98689 + (((tickAnim - 3) / 4) * (-0.27647-(0.98689)));
        }
        else if (tickAnim >= 7 && tickAnim < 14) {
            xx = -1.1 + (((tickAnim - 7) / 7) * (0-(-1.1)));
            yy = 0.15 + (((tickAnim - 7) / 7) * (-0.5-(0.15)));
            zz = -0.27647 + (((tickAnim - 7) / 7) * (-0.5-(-0.27647)));
        }
        else if (tickAnim >= 14 && tickAnim < 22) {
            xx = 0 + (((tickAnim - 14) / 8) * (0.49977-(0)));
            yy = -0.5 + (((tickAnim - 14) / 8) * (-0.84882-(-0.5)));
            zz = -0.5 + (((tickAnim - 14) / 8) * (-1.31545-(-0.5)));
        }
        else if (tickAnim >= 22 && tickAnim < 30) {
            xx = 0.49977 + (((tickAnim - 22) / 8) * (0-(0.49977)));
            yy = -0.84882 + (((tickAnim - 22) / 8) * (-1-(-0.84882)));
            zz = -1.31545 + (((tickAnim - 22) / 8) * (-1-(-1.31545)));
        }
        else if (tickAnim >= 30 && tickAnim < 33) {
            xx = 0 + (((tickAnim - 30) / 3) * (-0.66644-(0)));
            yy = -1 + (((tickAnim - 30) / 3) * (-0.98255-(-1)));
            zz = -1 + (((tickAnim - 30) / 3) * (0.55545-(-1)));
        }
        else if (tickAnim >= 33 && tickAnim < 38) {
            xx = -0.66644 + (((tickAnim - 33) / 5) * (-1.1-(-0.66644)));
            yy = -0.98255 + (((tickAnim - 33) / 5) * (-0.775-(-0.98255)));
            zz = 0.55545 + (((tickAnim - 33) / 5) * (0.55-(0.55545)));
        }
        else if (tickAnim >= 38 && tickAnim < 45) {
            xx = -1.1 + (((tickAnim - 38) / 7) * (0-(-1.1)));
            yy = -0.775 + (((tickAnim - 38) / 7) * (-0.125-(-0.775)));
            zz = 0.55 + (((tickAnim - 38) / 7) * (-0.5-(0.55)));
        }
        else if (tickAnim >= 45 && tickAnim < 53) {
            xx = 0 + (((tickAnim - 45) / 8) * (0.49977-(0)));
            yy = -0.125 + (((tickAnim - 45) / 8) * (0.54882-(-0.125)));
            zz = -0.5 + (((tickAnim - 45) / 8) * (1.24966-(-0.5)));
        }
        else if (tickAnim >= 53 && tickAnim < 60) {
            xx = 0.49977 + (((tickAnim - 53) / 7) * (0-(0.49977)));
            yy = 0.54882 + (((tickAnim - 53) / 7) * (1-(0.54882)));
            zz = 1.24966 + (((tickAnim - 53) / 7) * (1-(1.24966)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(main, main.rotateAngleX + (float) Math.toRadians(xx), main.rotateAngleY + (float) Math.toRadians(yy), main.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 0) / 5) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 5) * (0.3-(0)));
            zz = 0 + (((tickAnim - 0) / 5) * (0.2-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 5) / 5) * (0-(0)));
            yy = 0.3 + (((tickAnim - 5) / 5) * (0-(0.3)));
            zz = 0.2 + (((tickAnim - 5) / 5) * (0.3-(0.2)));
        }
        else if (tickAnim >= 10 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 10) / 10) * (0-(0)));
            yy = 0 + (((tickAnim - 10) / 10) * (-0.2-(0)));
            zz = 0.3 + (((tickAnim - 10) / 10) * (0.3-(0.3)));
        }
        else if (tickAnim >= 20 && tickAnim < 30) {
            xx = 0 + (((tickAnim - 20) / 10) * (0-(0)));
            yy = -0.2 + (((tickAnim - 20) / 10) * (0-(-0.2)));
            zz = 0.3 + (((tickAnim - 20) / 10) * (0-(0.3)));
        }
        else if (tickAnim >= 30 && tickAnim < 35) {
            xx = 0 + (((tickAnim - 30) / 5) * (0-(0)));
            yy = 0 + (((tickAnim - 30) / 5) * (0.18-(0)));
            zz = 0 + (((tickAnim - 30) / 5) * (0.1-(0)));
        }
        else if (tickAnim >= 35 && tickAnim < 41) {
            xx = 0 + (((tickAnim - 35) / 6) * (0-(0)));
            yy = 0.18 + (((tickAnim - 35) / 6) * (-0.1-(0.18)));
            zz = 0.1 + (((tickAnim - 35) / 6) * (0.2-(0.1)));
        }
        else if (tickAnim >= 41 && tickAnim < 51) {
            xx = 0 + (((tickAnim - 41) / 10) * (0-(0)));
            yy = -0.1 + (((tickAnim - 41) / 10) * (-0.21-(-0.1)));
            zz = 0.2 + (((tickAnim - 41) / 10) * (0.1-(0.2)));
        }
        else if (tickAnim >= 51 && tickAnim < 60) {
            xx = 0 + (((tickAnim - 51) / 9) * (0-(0)));
            yy = -0.21 + (((tickAnim - 51) / 9) * (0-(-0.21)));
            zz = 0.1 + (((tickAnim - 51) / 9) * (0-(0.1)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.main.rotationPointX = this.main.rotationPointX + (float)(xx);
        this.main.rotationPointY = this.main.rotationPointY - (float)(yy);
        this.main.rotationPointZ = this.main.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 0) / 5) * (2.5-(0)));
            yy = -1.5 + (((tickAnim - 0) / 5) * (-1.08333-(-1.5)));
            zz = 0 + (((tickAnim - 0) / 5) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 30) {
            xx = 2.5 + (((tickAnim - 5) / 25) * (0-(2.5)));
            yy = -1.08333 + (((tickAnim - 5) / 25) * (1-(-1.08333)));
            zz = 0 + (((tickAnim - 5) / 25) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 35) {
            xx = 0 + (((tickAnim - 30) / 5) * (2.5-(0)));
            yy = 1 + (((tickAnim - 30) / 5) * (0.58333-(1)));
            zz = 0 + (((tickAnim - 30) / 5) * (0-(0)));
        }
        else if (tickAnim >= 35 && tickAnim < 60) {
            xx = 2.5 + (((tickAnim - 35) / 25) * (0-(2.5)));
            yy = 0.58333 + (((tickAnim - 35) / 25) * (-1.5-(0.58333)));
            zz = 0 + (((tickAnim - 35) / 25) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck, neck.rotateAngleX + (float) Math.toRadians(xx), neck.rotateAngleY + (float) Math.toRadians(yy), neck.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 5) {
            xx = 29.72 + (((tickAnim - 0) / 5) * (44.15797-(29.72)));
            yy = 21.99 + (((tickAnim - 0) / 5) * (27.71047-(21.99)));
            zz = 36.73 + (((tickAnim - 0) / 5) * (47.44362-(36.73)));
        }
        else if (tickAnim >= 5 && tickAnim < 10) {
            xx = 44.15797 + (((tickAnim - 5) / 5) * (52.59593-(44.15797)));
            yy = 27.71047 + (((tickAnim - 5) / 5) * (33.43094-(27.71047)));
            zz = 47.44362 + (((tickAnim - 5) / 5) * (58.15723-(47.44362)));
        }
        else if (tickAnim >= 10 && tickAnim < 18) {
            xx = 52.59593 + (((tickAnim - 10) / 8) * (40.07071-(52.59593)));
            yy = 33.43094 + (((tickAnim - 10) / 8) * (7.47446-(33.43094)));
            zz = 58.15723 + (((tickAnim - 10) / 8) * (72.46097-(58.15723)));
        }
        else if (tickAnim >= 18 && tickAnim < 23) {
            xx = 40.07071 + (((tickAnim - 18) / 5) * (20.90223-(40.07071)));
            yy = 7.47446 + (((tickAnim - 18) / 5) * (4.14117-(7.47446)));
            zz = 72.46097 + (((tickAnim - 18) / 5) * (49.64216-(72.46097)));
        }
        else if (tickAnim >= 23 && tickAnim < 30) {
            xx = 20.90223 + (((tickAnim - 23) / 7) * (3.83773-(20.90223)));
            yy = 4.14117 + (((tickAnim - 23) / 7) * (7.28609-(4.14117)));
            zz = 49.64216 + (((tickAnim - 23) / 7) * (2.24723-(49.64216)));
        }
        else if (tickAnim >= 30 && tickAnim < 33) {
            xx = 3.83773 + (((tickAnim - 30) / 3) * (10.03043-(3.83773)));
            yy = 7.28609 + (((tickAnim - 30) / 3) * (8.64958-(7.28609)));
            zz = 2.24723 + (((tickAnim - 30) / 3) * (6.01683-(2.24723)));
        }
        else if (tickAnim >= 33 && tickAnim < 45) {
            xx = 10.03043 + (((tickAnim - 33) / 12) * (5.58515-(10.03043)));
            yy = 8.64958 + (((tickAnim - 33) / 12) * (8.56249-(8.64958)));
            zz = 6.01683 + (((tickAnim - 33) / 12) * (17.58501-(6.01683)));
        }
        else if (tickAnim >= 45 && tickAnim < 60) {
            xx = 5.58515 + (((tickAnim - 45) / 15) * (29.72-(5.58515)));
            yy = 8.56249 + (((tickAnim - 45) / 15) * (21.99-(8.56249)));
            zz = 17.58501 + (((tickAnim - 45) / 15) * (36.73-(17.58501)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(frontrightleg, frontrightleg.rotateAngleX + (float) Math.toRadians(xx), frontrightleg.rotateAngleY + (float) Math.toRadians(yy), frontrightleg.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 8.13 + (((tickAnim - 0) / 10) * (10-(8.13)));
            yy = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 18) {
            xx = 10 + (((tickAnim - 10) / 8) * (-3.65-(10)));
            yy = 0 + (((tickAnim - 10) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 8) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 30) {
            xx = -3.65 + (((tickAnim - 18) / 12) * (-37.5-(-3.65)));
            yy = 0 + (((tickAnim - 18) / 12) * (0-(0)));
            zz = 0 + (((tickAnim - 18) / 12) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 45) {
            xx = -37.5 + (((tickAnim - 30) / 15) * (3.56926-(-37.5)));
            yy = 0 + (((tickAnim - 30) / 15) * (-2.02772-(0)));
            zz = 0 + (((tickAnim - 30) / 15) * (-4.63159-(0)));
        }
        else if (tickAnim >= 45 && tickAnim < 60) {
            xx = 3.56926 + (((tickAnim - 45) / 15) * (8.13-(3.56926)));
            yy = -2.02772 + (((tickAnim - 45) / 15) * (0-(-2.02772)));
            zz = -4.63159 + (((tickAnim - 45) / 15) * (0-(-4.63159)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(frontrightleg2, frontrightleg2.rotateAngleX + (float) Math.toRadians(xx), frontrightleg2.rotateAngleY + (float) Math.toRadians(yy), frontrightleg2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 10) {
            xx = -9.07 + (((tickAnim - 0) / 10) * (-20.59805-(-9.07)));
            yy = -5.19 + (((tickAnim - 0) / 10) * (-3.01487-(-5.19)));
            zz = 28.03 + (((tickAnim - 0) / 10) * (35.36367-(28.03)));
        }
        else if (tickAnim >= 10 && tickAnim < 18) {
            xx = -20.59805 + (((tickAnim - 10) / 8) * (11.65683-(-20.59805)));
            yy = -3.01487 + (((tickAnim - 10) / 8) * (-3.49356-(-3.01487)));
            zz = 35.36367 + (((tickAnim - 10) / 8) * (-1.08778-(35.36367)));
        }
        else if (tickAnim >= 18 && tickAnim < 30) {
            xx = 11.65683 + (((tickAnim - 18) / 12) * (26.63152-(11.65683)));
            yy = -3.49356 + (((tickAnim - 18) / 12) * (-6.46133-(-3.49356)));
            zz = -1.08778 + (((tickAnim - 18) / 12) * (3.06227-(-1.08778)));
        }
        else if (tickAnim >= 30 && tickAnim < 45) {
            xx = 26.63152 + (((tickAnim - 30) / 15) * (1.28076-(26.63152)));
            yy = -6.46133 + (((tickAnim - 30) / 15) * (-5.82567-(-6.46133)));
            zz = 3.06227 + (((tickAnim - 30) / 15) * (15.54613-(3.06227)));
        }
        else if (tickAnim >= 45 && tickAnim < 60) {
            xx = 1.28076 + (((tickAnim - 45) / 15) * (-9.07-(1.28076)));
            yy = -5.82567 + (((tickAnim - 45) / 15) * (-5.19-(-5.82567)));
            zz = 15.54613 + (((tickAnim - 45) / 15) * (28.03-(15.54613)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(frontrightleg3, frontrightleg3.rotateAngleX + (float) Math.toRadians(xx), frontrightleg3.rotateAngleY + (float) Math.toRadians(yy), frontrightleg3.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 3.83773 + (((tickAnim - 0) / 3) * (10.03043-(3.83773)));
            yy = -7.28609 + (((tickAnim - 0) / 3) * (-8.64958-(-7.28609)));
            zz = -2.24723 + (((tickAnim - 0) / 3) * (-6.01683-(-2.24723)));
        }
        else if (tickAnim >= 3 && tickAnim < 15) {
            xx = 10.03043 + (((tickAnim - 3) / 12) * (5.58515-(10.03043)));
            yy = -8.64958 + (((tickAnim - 3) / 12) * (-8.56249-(-8.64958)));
            zz = -6.01683 + (((tickAnim - 3) / 12) * (-17.58501-(-6.01683)));
        }
        else if (tickAnim >= 15 && tickAnim < 30) {
            xx = 5.58515 + (((tickAnim - 15) / 15) * (29.72-(5.58515)));
            yy = -8.56249 + (((tickAnim - 15) / 15) * (-21.99-(-8.56249)));
            zz = -17.58501 + (((tickAnim - 15) / 15) * (-36.73-(-17.58501)));
        }
        else if (tickAnim >= 30 && tickAnim < 35) {
            xx = 29.72 + (((tickAnim - 30) / 5) * (44.15797-(29.72)));
            yy = -21.99 + (((tickAnim - 30) / 5) * (-27.71047-(-21.99)));
            zz = -36.73 + (((tickAnim - 30) / 5) * (-47.44362-(-36.73)));
        }
        else if (tickAnim >= 35 && tickAnim < 40) {
            xx = 44.15797 + (((tickAnim - 35) / 5) * (52.59593-(44.15797)));
            yy = -27.71047 + (((tickAnim - 35) / 5) * (-33.43094-(-27.71047)));
            zz = -47.44362 + (((tickAnim - 35) / 5) * (-58.15723-(-47.44362)));
        }
        else if (tickAnim >= 40 && tickAnim < 48) {
            xx = 52.59593 + (((tickAnim - 40) / 8) * (40.07071-(52.59593)));
            yy = -33.43094 + (((tickAnim - 40) / 8) * (-7.47446-(-33.43094)));
            zz = -58.15723 + (((tickAnim - 40) / 8) * (-72.46097-(-58.15723)));
        }
        else if (tickAnim >= 48 && tickAnim < 53) {
            xx = 40.07071 + (((tickAnim - 48) / 5) * (20.90223-(40.07071)));
            yy = -7.47446 + (((tickAnim - 48) / 5) * (-4.14117-(-7.47446)));
            zz = -72.46097 + (((tickAnim - 48) / 5) * (-49.64216-(-72.46097)));
        }
        else if (tickAnim >= 53 && tickAnim < 60) {
            xx = 20.90223 + (((tickAnim - 53) / 7) * (3.83773-(20.90223)));
            yy = -4.14117 + (((tickAnim - 53) / 7) * (-7.28609-(-4.14117)));
            zz = -49.64216 + (((tickAnim - 53) / 7) * (-2.24723-(-49.64216)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(frontleftleg, frontleftleg.rotateAngleX + (float) Math.toRadians(xx), frontleftleg.rotateAngleY + (float) Math.toRadians(yy), frontleftleg.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 15) {
            xx = -37.5 + (((tickAnim - 0) / 15) * (3.56926-(-37.5)));
            yy = 0 + (((tickAnim - 0) / 15) * (2.02772-(0)));
            zz = 0 + (((tickAnim - 0) / 15) * (4.63159-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 30) {
            xx = 3.56926 + (((tickAnim - 15) / 15) * (8.13-(3.56926)));
            yy = 2.02772 + (((tickAnim - 15) / 15) * (0-(2.02772)));
            zz = 4.63159 + (((tickAnim - 15) / 15) * (0-(4.63159)));
        }
        else if (tickAnim >= 30 && tickAnim < 40) {
            xx = 8.13 + (((tickAnim - 30) / 10) * (10-(8.13)));
            yy = 0 + (((tickAnim - 30) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 30) / 10) * (0-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 48) {
            xx = 10 + (((tickAnim - 40) / 8) * (-3.65-(10)));
            yy = 0 + (((tickAnim - 40) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 40) / 8) * (0-(0)));
        }
        else if (tickAnim >= 48 && tickAnim < 60) {
            xx = -3.65 + (((tickAnim - 48) / 12) * (-37.5-(-3.65)));
            yy = 0 + (((tickAnim - 48) / 12) * (0-(0)));
            zz = 0 + (((tickAnim - 48) / 12) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(frontleftleg2, frontleftleg2.rotateAngleX + (float) Math.toRadians(xx), frontleftleg2.rotateAngleY + (float) Math.toRadians(yy), frontleftleg2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 15) {
            xx = 26.63152 + (((tickAnim - 0) / 15) * (1.28076-(26.63152)));
            yy = 6.46133 + (((tickAnim - 0) / 15) * (5.82567-(6.46133)));
            zz = -3.06227 + (((tickAnim - 0) / 15) * (-15.54613-(-3.06227)));
        }
        else if (tickAnim >= 15 && tickAnim < 30) {
            xx = 1.28076 + (((tickAnim - 15) / 15) * (-9.07-(1.28076)));
            yy = 5.82567 + (((tickAnim - 15) / 15) * (5.19-(5.82567)));
            zz = -15.54613 + (((tickAnim - 15) / 15) * (-28.03-(-15.54613)));
        }
        else if (tickAnim >= 30 && tickAnim < 40) {
            xx = -9.07 + (((tickAnim - 30) / 10) * (-20.59805-(-9.07)));
            yy = 5.19 + (((tickAnim - 30) / 10) * (3.01487-(5.19)));
            zz = -28.03 + (((tickAnim - 30) / 10) * (-35.36367-(-28.03)));
        }
        else if (tickAnim >= 40 && tickAnim < 48) {
            xx = -20.59805 + (((tickAnim - 40) / 8) * (11.65683-(-20.59805)));
            yy = 3.01487 + (((tickAnim - 40) / 8) * (3.49356-(3.01487)));
            zz = -35.36367 + (((tickAnim - 40) / 8) * (1.08778-(-35.36367)));
        }
        else if (tickAnim >= 48 && tickAnim < 60) {
            xx = 11.65683 + (((tickAnim - 48) / 12) * (26.63152-(11.65683)));
            yy = 3.49356 + (((tickAnim - 48) / 12) * (6.46133-(3.49356)));
            zz = 1.08778 + (((tickAnim - 48) / 12) * (-3.06227-(1.08778)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(frontleftleg3, frontleftleg3.rotateAngleX + (float) Math.toRadians(xx), frontleftleg3.rotateAngleY + (float) Math.toRadians(yy), frontleftleg3.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 4) {
            xx = 156.01 + (((tickAnim - 0) / 4) * (170.59428-(156.01)));
            yy = 13.16 + (((tickAnim - 0) / 4) * (5.25604-(13.16)));
            zz = -132.56 + (((tickAnim - 0) / 4) * (-173.40144-(-132.56)));
        }
        else if (tickAnim >= 4 && tickAnim < 11) {
            xx = 170.59428 + (((tickAnim - 4) / 7) * (169.41653-(170.59428)));
            yy = 5.25604 + (((tickAnim - 4) / 7) * (0.92065-(5.25604)));
            zz = -173.40144 + (((tickAnim - 4) / 7) * (-160.07685-(-173.40144)));
        }
        else if (tickAnim >= 11 && tickAnim < 20) {
            xx = 169.41653 + (((tickAnim - 11) / 9) * (158.19658-(169.41653)));
            yy = 0.92065 + (((tickAnim - 11) / 9) * (-5.96149-(0.92065)));
            zz = -160.07685 + (((tickAnim - 11) / 9) * (-141.70565-(-160.07685)));
        }
        else if (tickAnim >= 20 && tickAnim < 23) {
            xx = 158.19658 + (((tickAnim - 20) / 3) * (154.86384-(158.19658)));
            yy = -5.96149 + (((tickAnim - 20) / 3) * (-7.83845-(-5.96149)));
            zz = -141.70565 + (((tickAnim - 20) / 3) * (-136.69529-(-141.70565)));
        }
        else if (tickAnim >= 23 && tickAnim < 30) {
            xx = 154.86384 + (((tickAnim - 23) / 7) * (123.31062-(154.86384)));
            yy = -7.83845 + (((tickAnim - 23) / 7) * (-9.6046-(-7.83845)));
            zz = -136.69529 + (((tickAnim - 23) / 7) * (-110.53458-(-136.69529)));
        }
        else if (tickAnim >= 30 && tickAnim < 35) {
            xx = 123.31062 + (((tickAnim - 30) / 5) * (99.94181-(123.31062)));
            yy = -9.6046 + (((tickAnim - 30) / 5) * (-10.78204-(-9.6046)));
            zz = -110.53458 + (((tickAnim - 30) / 5) * (-93.09411-(-110.53458)));
        }
        else if (tickAnim >= 35 && tickAnim < 40) {
            xx = 99.94181 + (((tickAnim - 35) / 5) * (68.84125-(99.94181)));
            yy = -10.78204 + (((tickAnim - 35) / 5) * (-14.19837-(-10.78204)));
            zz = -93.09411 + (((tickAnim - 35) / 5) * (-65.16219-(-93.09411)));
        }
        else if (tickAnim >= 40 && tickAnim < 45) {
            xx = 68.84125 + (((tickAnim - 40) / 5) * (27.23127-(68.84125)));
            yy = -14.19837 + (((tickAnim - 40) / 5) * (-10.87517-(-14.19837)));
            zz = -65.16219 + (((tickAnim - 40) / 5) * (-20.46941-(-65.16219)));
        }
        else if (tickAnim >= 45 && tickAnim < 55) {
            xx = 27.23127 + (((tickAnim - 45) / 10) * (111.50739-(27.23127)));
            yy = -10.87517 + (((tickAnim - 45) / 10) * (8.77164-(-10.87517)));
            zz = -20.46941 + (((tickAnim - 45) / 10) * (-88.37046-(-20.46941)));
        }
        else if (tickAnim >= 55 && tickAnim < 60) {
            xx = 111.50739 + (((tickAnim - 55) / 5) * (156.01-(111.50739)));
            yy = 8.77164 + (((tickAnim - 55) / 5) * (13.16-(8.77164)));
            zz = -88.37046 + (((tickAnim - 55) / 5) * (-132.56-(-88.37046)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(backrightleg, backrightleg.rotateAngleX + (float) Math.toRadians(xx), backrightleg.rotateAngleY + (float) Math.toRadians(yy), backrightleg.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 5) {
            xx = -26.78 + (((tickAnim - 0) / 5) * (-45.70955-(-26.78)));
            yy = 0.65 + (((tickAnim - 0) / 5) * (0.86587-(0.65)));
            zz = 24.73 + (((tickAnim - 0) / 5) * (32.97334-(24.73)));
        }
        else if (tickAnim >= 5 && tickAnim < 40) {
            xx = -45.70955 + (((tickAnim - 5) / 35) * (4.28631-(-45.70955)));
            yy = 0.86587 + (((tickAnim - 5) / 35) * (0.10823-(0.86587)));
            zz = 32.97334 + (((tickAnim - 5) / 35) * (4.12167-(32.97334)));
        }
        else if (tickAnim >= 40 && tickAnim < 45) {
            xx = 4.28631 + (((tickAnim - 40) / 5) * (0-(4.28631)));
            yy = 0.10823 + (((tickAnim - 40) / 5) * (0-(0.10823)));
            zz = 4.12167 + (((tickAnim - 40) / 5) * (-10-(4.12167)));
        }
        else if (tickAnim >= 45 && tickAnim < 55) {
            xx = 0 + (((tickAnim - 45) / 10) * (-2.85333-(0)));
            yy = 0 + (((tickAnim - 45) / 10) * (0.43333-(0)));
            zz = -10 + (((tickAnim - 45) / 10) * (16.48667-(-10)));
        }
        else if (tickAnim >= 55 && tickAnim < 60) {
            xx = -2.85333 + (((tickAnim - 55) / 5) * (-26.78-(-2.85333)));
            yy = 0.43333 + (((tickAnim - 55) / 5) * (0.65-(0.43333)));
            zz = 16.48667 + (((tickAnim - 55) / 5) * (24.73-(16.48667)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(backrightleg3, backrightleg3.rotateAngleX + (float) Math.toRadians(xx), backrightleg3.rotateAngleY + (float) Math.toRadians(yy), backrightleg3.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 5) {
            xx = 123.31062 + (((tickAnim - 0) / 5) * (99.94181-(123.31062)));
            yy = 9.6046 + (((tickAnim - 0) / 5) * (10.78204-(9.6046)));
            zz = 110.53458 + (((tickAnim - 0) / 5) * (93.09411-(110.53458)));
        }
        else if (tickAnim >= 5 && tickAnim < 10) {
            xx = 99.94181 + (((tickAnim - 5) / 5) * (68.84125-(99.94181)));
            yy = 10.78204 + (((tickAnim - 5) / 5) * (14.19837-(10.78204)));
            zz = 93.09411 + (((tickAnim - 5) / 5) * (65.16219-(93.09411)));
        }
        else if (tickAnim >= 10 && tickAnim < 15) {
            xx = 68.84125 + (((tickAnim - 10) / 5) * (27.23127-(68.84125)));
            yy = 14.19837 + (((tickAnim - 10) / 5) * (10.87517-(14.19837)));
            zz = 65.16219 + (((tickAnim - 10) / 5) * (20.46941-(65.16219)));
        }
        else if (tickAnim >= 15 && tickAnim < 25) {
            xx = 27.23127 + (((tickAnim - 15) / 10) * (111.50739-(27.23127)));
            yy = 10.87517 + (((tickAnim - 15) / 10) * (-8.77164-(10.87517)));
            zz = 20.46941 + (((tickAnim - 15) / 10) * (88.37046-(20.46941)));
        }
        else if (tickAnim >= 25 && tickAnim < 30) {
            xx = 111.50739 + (((tickAnim - 25) / 5) * (156.01-(111.50739)));
            yy = -8.77164 + (((tickAnim - 25) / 5) * (-13.16-(-8.77164)));
            zz = 88.37046 + (((tickAnim - 25) / 5) * (132.56-(88.37046)));
        }
        else if (tickAnim >= 30 && tickAnim < 34) {
            xx = 156.01 + (((tickAnim - 30) / 4) * (170.59428-(156.01)));
            yy = -13.16 + (((tickAnim - 30) / 4) * (-5.25604-(-13.16)));
            zz = 132.56 + (((tickAnim - 30) / 4) * (173.40144-(132.56)));
        }
        else if (tickAnim >= 34 && tickAnim < 41) {
            xx = 170.59428 + (((tickAnim - 34) / 7) * (169.41653-(170.59428)));
            yy = -5.25604 + (((tickAnim - 34) / 7) * (-0.92065-(-5.25604)));
            zz = 173.40144 + (((tickAnim - 34) / 7) * (160.07685-(173.40144)));
        }
        else if (tickAnim >= 41 && tickAnim < 50) {
            xx = 169.41653 + (((tickAnim - 41) / 9) * (158.19658-(169.41653)));
            yy = -0.92065 + (((tickAnim - 41) / 9) * (5.96149-(-0.92065)));
            zz = 160.07685 + (((tickAnim - 41) / 9) * (141.70565-(160.07685)));
        }
        else if (tickAnim >= 50 && tickAnim < 53) {
            xx = 158.19658 + (((tickAnim - 50) / 3) * (154.86384-(158.19658)));
            yy = 5.96149 + (((tickAnim - 50) / 3) * (7.83845-(5.96149)));
            zz = 141.70565 + (((tickAnim - 50) / 3) * (136.69529-(141.70565)));
        }
        else if (tickAnim >= 53 && tickAnim < 60) {
            xx = 154.86384 + (((tickAnim - 53) / 7) * (123.31062-(154.86384)));
            yy = 7.83845 + (((tickAnim - 53) / 7) * (9.6046-(7.83845)));
            zz = 136.69529 + (((tickAnim - 53) / 7) * (110.53458-(136.69529)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(backleftleg, backleftleg.rotateAngleX + (float) Math.toRadians(xx), backleftleg.rotateAngleY + (float) Math.toRadians(yy), backleftleg.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 10) {
            xx = -10 + (((tickAnim - 0) / 10) * (4.28631-(-10)));
            yy = -0.32 + (((tickAnim - 0) / 10) * (-0.10823-(-0.32)));
            zz = -12.37 + (((tickAnim - 0) / 10) * (-4.12167-(-12.37)));
        }
        else if (tickAnim >= 10 && tickAnim < 15) {
            xx = 4.28631 + (((tickAnim - 10) / 5) * (0-(4.28631)));
            yy = -0.10823 + (((tickAnim - 10) / 5) * (0-(-0.10823)));
            zz = -4.12167 + (((tickAnim - 10) / 5) * (10-(-4.12167)));
        }
        else if (tickAnim >= 15 && tickAnim < 25) {
            xx = 0 + (((tickAnim - 15) / 10) * (-2.85333-(0)));
            yy = 0 + (((tickAnim - 15) / 10) * (-0.43333-(0)));
            zz = 10 + (((tickAnim - 15) / 10) * (-16.48667-(10)));
        }
        else if (tickAnim >= 25 && tickAnim < 30) {
            xx = -2.85333 + (((tickAnim - 25) / 5) * (-26.78-(-2.85333)));
            yy = -0.43333 + (((tickAnim - 25) / 5) * (-0.65-(-0.43333)));
            zz = -16.48667 + (((tickAnim - 25) / 5) * (-24.73-(-16.48667)));
        }
        else if (tickAnim >= 30 && tickAnim < 35) {
            xx = -26.78 + (((tickAnim - 30) / 5) * (-45.70955-(-26.78)));
            yy = -0.65 + (((tickAnim - 30) / 5) * (-0.86587-(-0.65)));
            zz = -24.73 + (((tickAnim - 30) / 5) * (-32.97334-(-24.73)));
        }
        else if (tickAnim >= 35 && tickAnim < 60) {
            xx = -45.70955 + (((tickAnim - 35) / 25) * (-10-(-45.70955)));
            yy = -0.86587 + (((tickAnim - 35) / 25) * (-0.32-(-0.86587)));
            zz = -32.97334 + (((tickAnim - 35) / 25) * (-12.37-(-32.97334)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(backleftleg3, backleftleg3.rotateAngleX + (float) Math.toRadians(xx), backleftleg3.rotateAngleY + (float) Math.toRadians(yy), backleftleg3.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 4) {
            xx = 1.1042 + (((tickAnim - 0) / 4) * (13.78962-(1.1042)));
            yy = -1.26716 + (((tickAnim - 0) / 4) * (-8.40206-(-1.26716)));
            zz = 11.99536 + (((tickAnim - 0) / 4) * (9.36236-(11.99536)));
        }
        else if (tickAnim >= 4 && tickAnim < 23) {
            xx = 13.78962 + (((tickAnim - 4) / 19) * (-18.7792-(13.78962)));
            yy = -8.40206 + (((tickAnim - 4) / 19) * (-4.6297-(-8.40206)));
            zz = 9.36236 + (((tickAnim - 4) / 19) * (5.15884-(9.36236)));
        }
        else if (tickAnim >= 23 && tickAnim < 45) {
            xx = -18.7792 + (((tickAnim - 23) / 22) * (2.5-(-18.7792)));
            yy = -4.6297 + (((tickAnim - 23) / 22) * (0-(-4.6297)));
            zz = 5.15884 + (((tickAnim - 23) / 22) * (0-(5.15884)));
        }
        else if (tickAnim >= 45 && tickAnim < 55) {
            xx = 2.5 + (((tickAnim - 45) / 10) * (-25.57279-(2.5)));
            yy = 0 + (((tickAnim - 45) / 10) * (-0.25193-(0)));
            zz = 0 + (((tickAnim - 45) / 10) * (5.1127-(0)));
        }
        else if (tickAnim >= 55 && tickAnim < 60) {
            xx = -25.57279 + (((tickAnim - 55) / 5) * (1.1042-(-25.57279)));
            yy = -0.25193 + (((tickAnim - 55) / 5) * (-1.26716-(-0.25193)));
            zz = 5.1127 + (((tickAnim - 55) / 5) * (11.99536-(5.1127)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(backrightleg2, backrightleg2.rotateAngleX + (float) Math.toRadians(xx), backrightleg2.rotateAngleY + (float) Math.toRadians(yy), backrightleg2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 15) {
            xx = -11.69 + (((tickAnim - 0) / 15) * (2.5-(-11.69)));
            yy = 3.09 + (((tickAnim - 0) / 15) * (0-(3.09)));
            zz = -3.44 + (((tickAnim - 0) / 15) * (0-(-3.44)));
        }
        else if (tickAnim >= 15 && tickAnim < 25) {
            xx = 2.5 + (((tickAnim - 15) / 10) * (-25.57279-(2.5)));
            yy = 0 + (((tickAnim - 15) / 10) * (0.25193-(0)));
            zz = 0 + (((tickAnim - 15) / 10) * (-5.1127-(0)));
        }
        else if (tickAnim >= 25 && tickAnim < 30) {
            xx = -25.57279 + (((tickAnim - 25) / 5) * (1.1042-(-25.57279)));
            yy = 0.25193 + (((tickAnim - 25) / 5) * (1.26716-(0.25193)));
            zz = -5.1127 + (((tickAnim - 25) / 5) * (-11.99536-(-5.1127)));
        }
        else if (tickAnim >= 30 && tickAnim < 34) {
            xx = 1.1042 + (((tickAnim - 30) / 4) * (13.78962-(1.1042)));
            yy = 1.26716 + (((tickAnim - 30) / 4) * (8.40206-(1.26716)));
            zz = -11.99536 + (((tickAnim - 30) / 4) * (-9.36236-(-11.99536)));
        }
        else if (tickAnim >= 34 && tickAnim < 53) {
            xx = 13.78962 + (((tickAnim - 34) / 19) * (-18.7792-(13.78962)));
            yy = 8.40206 + (((tickAnim - 34) / 19) * (4.6297-(8.40206)));
            zz = -9.36236 + (((tickAnim - 34) / 19) * (-5.15884-(-9.36236)));
        }
        else if (tickAnim >= 53 && tickAnim < 60) {
            xx = -18.7792 + (((tickAnim - 53) / 7) * (-11.69-(-18.7792)));
            yy = 4.6297 + (((tickAnim - 53) / 7) * (3.09-(4.6297)));
            zz = -5.15884 + (((tickAnim - 53) / 7) * (-3.44-(-5.15884)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(backleftleg2, backleftleg2.rotateAngleX + (float) Math.toRadians(xx), backleftleg2.rotateAngleY + (float) Math.toRadians(yy), backleftleg2.rotateAngleZ + (float) Math.toRadians(zz));


    }

        public void animate(IAnimatedEntity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        EntityPrehistoricFloraAnomalochelys e = (EntityPrehistoricFloraAnomalochelys) entity;
        animator.update(entity);


    }
}
