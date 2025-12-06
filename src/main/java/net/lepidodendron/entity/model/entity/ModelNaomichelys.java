package net.lepidodendron.entity.model.entity;

import net.ilexiconn.llibrary.client.model.ModelAnimator;
import net.ilexiconn.llibrary.client.model.tools.AdvancedModelRenderer;
import net.ilexiconn.llibrary.server.animation.IAnimatedEntity;
import net.lepidodendron.entity.EntityPrehistoricFloraNaomichelys;
import net.lepidodendron.entity.model.ModelBasePalaeopedia;
import net.minecraft.client.model.ModelBox;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;

public class ModelNaomichelys extends ModelBasePalaeopedia {
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
    private final AdvancedModelRenderer neck;
    private final AdvancedModelRenderer head;
    private final AdvancedModelRenderer cube_r28;
    private final AdvancedModelRenderer cube_r29;
    private final AdvancedModelRenderer cube_r30;
    private final AdvancedModelRenderer eye1;
    private final AdvancedModelRenderer cube_r31;
    private final AdvancedModelRenderer eye2;
    private final AdvancedModelRenderer cube_r32;
    private final AdvancedModelRenderer jaw;
    private final AdvancedModelRenderer cube_r33;
    private final AdvancedModelRenderer cube_r34;
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

    public ModelNaomichelys() {
        this.textureWidth = 105;
        this.textureHeight = 105;

        this.main = new AdvancedModelRenderer(this);
        this.main.setRotationPoint(0.0F, 24.0F, 0.0F);
        this.main.cubeList.add(new ModelBox(main, 0, 26, -4.5F, -5.4F, -6.0F, 9, 2, 10, 0.0F, false));
        this.main.cubeList.add(new ModelBox(main, 72, 52, -2.5F, -12.3F, -6.0F, 5, 2, 10, 0.0F, false));

        this.cube_r1 = new AdvancedModelRenderer(this);
        this.cube_r1.setRotationPoint(-0.5F, -3.4F, -6.0F);
        this.main.addChild(cube_r1);
        this.setRotateAngle(cube_r1, -0.2618F, 0.0F, 0.0F);
        this.cube_r1.cubeList.add(new ModelBox(cube_r1, 42, 13, -4.0F, -4.0F, -6.0F, 9, 4, 6, 0.0F, false));

        this.cube_r2 = new AdvancedModelRenderer(this);
        this.cube_r2.setRotationPoint(-0.5F, -3.4F, 4.0F);
        this.main.addChild(cube_r2);
        this.setRotateAngle(cube_r2, 0.2618F, 0.0F, 0.0F);
        this.cube_r2.cubeList.add(new ModelBox(cube_r2, 38, 0, -4.0F, -4.0F, 0.0F, 9, 4, 8, 0.0F, false));

        this.cube_r3 = new AdvancedModelRenderer(this);
        this.cube_r3.setRotationPoint(-0.5F, -12.3F, 4.0F);
        this.main.addChild(cube_r3);
        this.setRotateAngle(cube_r3, -0.1745F, 0.0F, 0.0F);
        this.cube_r3.cubeList.add(new ModelBox(cube_r3, 37, 66, -2.0F, 0.0F, 0.0F, 5, 2, 8, 0.0F, false));

        this.cube_r4 = new AdvancedModelRenderer(this);
        this.cube_r4.setRotationPoint(-0.5F, -12.3F, -6.0F);
        this.main.addChild(cube_r4);
        this.setRotateAngle(cube_r4, 0.2182F, 0.0F, 0.0F);
        this.cube_r4.cubeList.add(new ModelBox(cube_r4, 80, 66, -2.0F, 0.0F, -5.0F, 5, 5, 5, 0.0F, false));

        this.cube_r5 = new AdvancedModelRenderer(this);
        this.cube_r5.setRotationPoint(-4.5F, -3.4F, 0.0F);
        this.main.addChild(cube_r5);
        this.setRotateAngle(cube_r5, 0.0F, 0.0F, 0.3491F);
        this.cube_r5.cubeList.add(new ModelBox(cube_r5, 73, 8, -6.0F, -4.0F, -6.0F, 6, 4, 10, 0.0F, true));

        this.cube_r6 = new AdvancedModelRenderer(this);
        this.cube_r6.setRotationPoint(4.5F, -3.4F, 0.0F);
        this.main.addChild(cube_r6);
        this.setRotateAngle(cube_r6, 0.0F, 0.0F, -0.3491F);
        this.cube_r6.cubeList.add(new ModelBox(cube_r6, 73, 8, 0.0F, -4.0F, -6.0F, 6, 4, 10, 0.0F, false));

        this.cube_r7 = new AdvancedModelRenderer(this);
        this.cube_r7.setRotationPoint(-2.5F, -12.3F, 4.0F);
        this.main.addChild(cube_r7);
        this.setRotateAngle(cube_r7, -0.2348F, -0.0189F, -0.3994F);
        this.cube_r7.cubeList.add(new ModelBox(cube_r7, 83, 29, -7.0F, 0.0F, 0.0F, 7, 0, 8, 0.0F, true));

        this.cube_r8 = new AdvancedModelRenderer(this);
        this.cube_r8.setRotationPoint(-2.5F, -12.3F, 0.0F);
        this.main.addChild(cube_r8);
        this.setRotateAngle(cube_r8, 0.0F, 0.0F, -0.3665F);
        this.cube_r8.cubeList.add(new ModelBox(cube_r8, 64, 38, -8.0F, 0.0F, -6.0F, 8, 1, 10, 0.0F, true));

        this.cube_r9 = new AdvancedModelRenderer(this);
        this.cube_r9.setRotationPoint(-2.5F, -12.3F, -6.0F);
        this.main.addChild(cube_r9);
        this.setRotateAngle(cube_r9, 0.3224F, 0.0151F, -0.3823F);
        this.cube_r9.cubeList.add(new ModelBox(cube_r9, 85, 38, -7.0F, 0.0F, -6.0F, 7, 0, 6, 0.0F, true));

        this.cube_r10 = new AdvancedModelRenderer(this);
        this.cube_r10.setRotationPoint(-9.2211F, -6.3F, 11.206F);
        this.main.addChild(cube_r10);
        this.setRotateAngle(cube_r10, -0.1309F, -1.2654F, -0.0436F);
        this.cube_r10.cubeList.add(new ModelBox(cube_r10, 0, 63, -8.0F, -3.0F, -10.0F, 8, 3, 10, 0.0F, true));

        this.cube_r11 = new AdvancedModelRenderer(this);
        this.cube_r11.setRotationPoint(-11.6017F, -6.2F, 3.6763F);
        this.main.addChild(cube_r11);
        this.setRotateAngle(cube_r11, 0.0F, -1.5708F, -0.1745F);
        this.cube_r11.cubeList.add(new ModelBox(cube_r11, 37, 48, -8.0F, -3.0F, -10.0F, 8, 3, 10, 0.01F, true));

        this.cube_r12 = new AdvancedModelRenderer(this);
        this.cube_r12.setRotationPoint(-9.2211F, -6.3F, 11.206F);
        this.main.addChild(cube_r12);
        this.setRotateAngle(cube_r12, -0.0415F, -0.4894F, -0.1417F);
        this.cube_r12.cubeList.add(new ModelBox(cube_r12, 0, 48, 0.0F, -3.0F, -10.0F, 8, 3, 10, -0.01F, true));

        this.cube_r13 = new AdvancedModelRenderer(this);
        this.cube_r13.setRotationPoint(2.5F, -12.3F, -6.0F);
        this.main.addChild(cube_r13);
        this.setRotateAngle(cube_r13, 0.3224F, -0.0151F, 0.3823F);
        this.cube_r13.cubeList.add(new ModelBox(cube_r13, 85, 38, 0.0F, 0.0F, -6.0F, 7, 0, 6, 0.0F, false));

        this.cube_r14 = new AdvancedModelRenderer(this);
        this.cube_r14.setRotationPoint(2.5F, -12.3F, 4.0F);
        this.main.addChild(cube_r14);
        this.setRotateAngle(cube_r14, -0.2348F, 0.0189F, 0.3994F);
        this.cube_r14.cubeList.add(new ModelBox(cube_r14, 83, 29, 0.0F, 0.0F, 0.0F, 7, 0, 8, 0.0F, false));

        this.cube_r15 = new AdvancedModelRenderer(this);
        this.cube_r15.setRotationPoint(2.5F, -12.3F, 0.0F);
        this.main.addChild(cube_r15);
        this.setRotateAngle(cube_r15, 0.0F, 0.0F, 0.3665F);
        this.cube_r15.cubeList.add(new ModelBox(cube_r15, 64, 38, 0.0F, 0.0F, -6.0F, 8, 1, 10, 0.0F, false));

        this.cube_r16 = new AdvancedModelRenderer(this);
        this.cube_r16.setRotationPoint(-11.6017F, -6.2F, -4.3237F);
        this.main.addChild(cube_r16);
        this.setRotateAngle(cube_r16, 3.125F, -1.1815F, 2.9838F);
        this.cube_r16.cubeList.add(new ModelBox(cube_r16, 40, 24, -6.0F, -3.0F, -10.0F, 6, 3, 10, 0.0F, true));

        this.cube_r17 = new AdvancedModelRenderer(this);
        this.cube_r17.setRotationPoint(-9.3529F, -6.5579F, -9.8748F);
        this.main.addChild(cube_r17);
        this.setRotateAngle(cube_r17, -3.122F, -0.7014F, 2.9509F);
        this.cube_r17.cubeList.add(new ModelBox(cube_r17, 0, 77, -5.0F, -3.0F, -10.0F, 5, 3, 10, 0.0F, true));

        this.cube_r18 = new AdvancedModelRenderer(this);
        this.cube_r18.setRotationPoint(-5.5874F, -7.296F, -13.1019F);
        this.main.addChild(cube_r18);
        this.setRotateAngle(cube_r18, -3.1173F, -0.0035F, 2.9684F);
        this.cube_r18.cubeList.add(new ModelBox(cube_r18, 31, 77, -4.0F, -3.0F, -10.0F, 4, 3, 10, 0.0F, true));

        this.cube_r19 = new AdvancedModelRenderer(this);
        this.cube_r19.setRotationPoint(-1.6472F, -7.9851F, -13.1157F);
        this.main.addChild(cube_r19);
        this.setRotateAngle(cube_r19, -3.0955F, -0.7428F, 2.9387F);
        this.cube_r19.cubeList.add(new ModelBox(cube_r19, 73, 30, 0.0F, -3.0F, -4.0F, 4, 3, 4, 0.0F, true));

        this.cube_r20 = new AdvancedModelRenderer(this);
        this.cube_r20.setRotationPoint(1.6472F, -7.9851F, -13.1157F);
        this.main.addChild(cube_r20);
        this.setRotateAngle(cube_r20, -3.0955F, 0.7428F, -2.9387F);
        this.cube_r20.cubeList.add(new ModelBox(cube_r20, 73, 30, -4.0F, -3.0F, -4.0F, 4, 3, 4, 0.0F, false));

        this.cube_r21 = new AdvancedModelRenderer(this);
        this.cube_r21.setRotationPoint(5.5874F, -7.296F, -13.1019F);
        this.main.addChild(cube_r21);
        this.setRotateAngle(cube_r21, -3.1173F, 0.0035F, -2.9684F);
        this.cube_r21.cubeList.add(new ModelBox(cube_r21, 31, 77, 0.0F, -3.0F, -10.0F, 4, 3, 10, 0.0F, false));

        this.cube_r22 = new AdvancedModelRenderer(this);
        this.cube_r22.setRotationPoint(9.3529F, -6.5579F, -9.8748F);
        this.main.addChild(cube_r22);
        this.setRotateAngle(cube_r22, -3.122F, 0.7014F, -2.9509F);
        this.cube_r22.cubeList.add(new ModelBox(cube_r22, 0, 77, 0.0F, -3.0F, -10.0F, 5, 3, 10, 0.0F, false));

        this.cube_r23 = new AdvancedModelRenderer(this);
        this.cube_r23.setRotationPoint(11.6017F, -6.2F, -4.3237F);
        this.main.addChild(cube_r23);
        this.setRotateAngle(cube_r23, 3.125F, 1.1815F, -2.9838F);
        this.cube_r23.cubeList.add(new ModelBox(cube_r23, 40, 24, 0.0F, -3.0F, -10.0F, 6, 3, 10, 0.0F, false));

        this.cube_r24 = new AdvancedModelRenderer(this);
        this.cube_r24.setRotationPoint(11.6017F, -6.2F, 3.6763F);
        this.main.addChild(cube_r24);
        this.setRotateAngle(cube_r24, 0.0F, 1.5708F, 0.1745F);
        this.cube_r24.cubeList.add(new ModelBox(cube_r24, 37, 48, 0.0F, -3.0F, -10.0F, 8, 3, 10, 0.01F, false));

        this.cube_r25 = new AdvancedModelRenderer(this);
        this.cube_r25.setRotationPoint(9.2211F, -6.3F, 11.206F);
        this.main.addChild(cube_r25);
        this.setRotateAngle(cube_r25, -0.1309F, 1.2654F, 0.0436F);
        this.cube_r25.cubeList.add(new ModelBox(cube_r25, 0, 63, 0.0F, -3.0F, -10.0F, 8, 3, 10, 0.0F, false));

        this.cube_r26 = new AdvancedModelRenderer(this);
        this.cube_r26.setRotationPoint(9.2211F, -6.3F, 11.206F);
        this.main.addChild(cube_r26);
        this.setRotateAngle(cube_r26, -0.0415F, 0.4894F, 0.1417F);
        this.cube_r26.cubeList.add(new ModelBox(cube_r26, 0, 48, -8.0F, -3.0F, -10.0F, 8, 3, 10, -0.01F, false));

        this.cube_r27 = new AdvancedModelRenderer(this);
        this.cube_r27.setRotationPoint(-0.5F, -8.0F, 11.0F);
        this.main.addChild(cube_r27);
        this.setRotateAngle(cube_r27, -0.1309F, 0.0F, 0.0F);
        this.cube_r27.cubeList.add(new ModelBox(cube_r27, 27, 0, -2.0F, -3.0F, 0.0F, 5, 3, 4, 0.01F, false));

        this.neck = new AdvancedModelRenderer(this);
        this.neck.setRotationPoint(0.0F, -7.65F, -11.0F);
        this.main.addChild(neck);
        this.setRotateAngle(neck, 0.0436F, 0.0F, 0.0F);
        this.neck.cubeList.add(new ModelBox(neck, 45, 41, -3.0F, -1.75F, -3.0F, 6, 3, 3, 0.011F, false));
        this.neck.cubeList.add(new ModelBox(neck, 73, 24, -3.0F, 0.75F, -3.0F, 6, 1, 3, 0.001F, false));

        this.head = new AdvancedModelRenderer(this);
        this.head.setRotationPoint(0.0F, 0.0F, -3.0F);
        this.neck.addChild(head);
        this.head.cubeList.add(new ModelBox(head, 68, 10, -1.0F, -1.211F, -7.9909F, 2, 2, 5, 0.0F, false));
        this.head.cubeList.add(new ModelBox(head, 29, 26, -3.0F, -1.75F, -4.0F, 6, 3, 4, 0.01F, false));
        this.head.cubeList.add(new ModelBox(head, 89, 23, -3.0F, 0.75F, -2.0F, 6, 1, 2, 0.0F, false));

        this.cube_r28 = new AdvancedModelRenderer(this);
        this.cube_r28.setRotationPoint(3.0F, -2.25F, -4.0F);
        this.head.addChild(cube_r28);
        this.setRotateAngle(cube_r28, 0.0F, 0.5236F, 0.0F);
        this.cube_r28.cubeList.add(new ModelBox(cube_r28, 27, 11, -2.0F, 1.0F, -4.0F, 2, 2, 4, 0.0F, true));

        this.cube_r29 = new AdvancedModelRenderer(this);
        this.cube_r29.setRotationPoint(-3.0F, -2.25F, -4.0F);
        this.head.addChild(cube_r29);
        this.setRotateAngle(cube_r29, 0.0F, -0.5236F, 0.0F);
        this.cube_r29.cubeList.add(new ModelBox(cube_r29, 27, 11, 0.0F, 1.0F, -4.0F, 2, 2, 4, 0.0F, false));

        this.cube_r30 = new AdvancedModelRenderer(this);
        this.cube_r30.setRotationPoint(1.0F, -1.2F, -8.2F);
        this.head.addChild(cube_r30);
        this.setRotateAngle(cube_r30, 0.1047F, 0.0F, 0.0F);
        this.cube_r30.cubeList.add(new ModelBox(cube_r30, 68, 10, -2.0F, 0.0F, 0.0F, 2, 2, 5, 0.01F, false));

        this.eye1 = new AdvancedModelRenderer(this);
        this.eye1.setRotationPoint(1.8F, -0.5F, -6.2F);
        this.head.addChild(eye1);


        this.cube_r31 = new AdvancedModelRenderer(this);
        this.cube_r31.setRotationPoint(1.2F, -1.75F, 2.2F);
        this.eye1.addChild(cube_r31);
        this.setRotateAngle(cube_r31, 0.0F, 0.5236F, 0.0F);
        this.cube_r31.cubeList.add(new ModelBox(cube_r31, 0, 0, -0.975F, 1.25F, -3.0F, 1, 1, 1, 0.0F, false));

        this.eye2 = new AdvancedModelRenderer(this);
        this.eye2.setRotationPoint(-1.8F, -0.5F, -6.2F);
        this.head.addChild(eye2);


        this.cube_r32 = new AdvancedModelRenderer(this);
        this.cube_r32.setRotationPoint(-1.2F, -1.75F, 2.2F);
        this.eye2.addChild(cube_r32);
        this.setRotateAngle(cube_r32, 0.0F, -0.5236F, 0.0F);
        this.cube_r32.cubeList.add(new ModelBox(cube_r32, 0, 0, -0.025F, 1.25F, -3.0F, 1, 1, 1, 0.0F, true));

        this.jaw = new AdvancedModelRenderer(this);
        this.jaw.setRotationPoint(0.0F, 1.25F, -2.0F);
        this.head.addChild(jaw);
        this.jaw.cubeList.add(new ModelBox(jaw, 87, 0, -2.0F, -2.5F, -2.0F, 4, 2, 1, 0.0F, false));
        this.jaw.cubeList.add(new ModelBox(jaw, 89, 23, -3.0F, -0.5F, -2.0F, 6, 1, 2, -0.002F, false));
        this.jaw.cubeList.add(new ModelBox(jaw, 65, 2, -1.0F, -0.5F, -6.0F, 2, 1, 4, 0.0F, false));

        this.cube_r33 = new AdvancedModelRenderer(this);
        this.cube_r33.setRotationPoint(3.0F, -1.5F, -2.0F);
        this.jaw.addChild(cube_r33);
        this.setRotateAngle(cube_r33, 0.0F, 0.5236F, 0.0F);
        this.cube_r33.cubeList.add(new ModelBox(cube_r33, 78, 2, -2.0F, 1.0F, -4.0F, 2, 1, 4, -0.001F, true));

        this.cube_r34 = new AdvancedModelRenderer(this);
        this.cube_r34.setRotationPoint(-3.0F, -1.5F, -2.0F);
        this.jaw.addChild(cube_r34);
        this.setRotateAngle(cube_r34, 0.0F, -0.5236F, 0.0F);
        this.cube_r34.cubeList.add(new ModelBox(cube_r34, 78, 2, 0.0F, 1.0F, -4.0F, 2, 1, 4, -0.001F, false));

        this.frontleftleg = new AdvancedModelRenderer(this);
        this.frontleftleg.setRotationPoint(4.8049F, -7.048F, -6.1378F);
        this.main.addChild(frontleftleg);
        this.setRotateAngle(frontleftleg, 0.3927F, -0.8727F, 0.0F);
        this.frontleftleg.cubeList.add(new ModelBox(frontleftleg, 56, 62, -2.0F, -2.0F, -7.0F, 4, 4, 7, 0.0F, false));

        this.frontleftleg2 = new AdvancedModelRenderer(this);
        this.frontleftleg2.setRotationPoint(0.0014F, -1.0412F, -6.4672F);
        this.frontleftleg.addChild(frontleftleg2);
        this.setRotateAngle(frontleftleg2, 1.0541F, 0.7119F, -0.3655F);
        this.frontleftleg2.cubeList.add(new ModelBox(frontleftleg2, 28, 39, -1.5F, -1.5F, -5.0F, 3, 3, 5, 0.0F, false));

        this.frontleftleg3 = new AdvancedModelRenderer(this);
        this.frontleftleg3.setRotationPoint(0.0F, 0.0F, -5.0008F);
        this.frontleftleg2.addChild(frontleftleg3);
        this.setRotateAngle(frontleftleg3, -0.001F, -0.005F, 0.0F);
        this.frontleftleg3.cubeList.add(new ModelBox(frontleftleg3, 0, 39, -2.0F, -3.75F, -0.5F, 4, 5, 1, 0.0F, false));

        this.frontrightleg = new AdvancedModelRenderer(this);
        this.frontrightleg.setRotationPoint(-4.8049F, -7.048F, -6.1378F);
        this.main.addChild(frontrightleg);
        this.setRotateAngle(frontrightleg, 0.3927F, 0.8727F, 0.0F);
        this.frontrightleg.cubeList.add(new ModelBox(frontrightleg, 56, 62, -2.0F, -2.0F, -7.0F, 4, 4, 7, 0.0F, true));

        this.frontrightleg2 = new AdvancedModelRenderer(this);
        this.frontrightleg2.setRotationPoint(-0.0014F, -1.0412F, -6.4672F);
        this.frontrightleg.addChild(frontrightleg2);
        this.setRotateAngle(frontrightleg2, 1.0541F, -0.7119F, 0.3655F);
        this.frontrightleg2.cubeList.add(new ModelBox(frontrightleg2, 28, 39, -1.5F, -1.5F, -5.0F, 3, 3, 5, 0.0F, true));

        this.frontrightleg3 = new AdvancedModelRenderer(this);
        this.frontrightleg3.setRotationPoint(0.0F, 0.0F, -5.0008F);
        this.frontrightleg2.addChild(frontrightleg3);
        this.setRotateAngle(frontrightleg3, -0.001F, 0.005F, 0.0F);
        this.frontrightleg3.cubeList.add(new ModelBox(frontrightleg3, 0, 39, -2.0F, -3.75F, -0.5F, 4, 5, 1, 0.0F, true));

        this.backleftleg = new AdvancedModelRenderer(this);
        this.backleftleg.setRotationPoint(5.0549F, -7.048F, 4.8878F);
        this.main.addChild(backleftleg);
        this.setRotateAngle(backleftleg, -0.3927F, 1.1781F, 0.0F);
        this.backleftleg.cubeList.add(new ModelBox(backleftleg, 0, 14, -2.0F, -2.0F, 0.0F, 4, 4, 7, 0.0F, false));

        this.backleftleg2 = new AdvancedModelRenderer(this);
        this.backleftleg2.setRotationPoint(0.0049F, -0.9681F, 6.2647F);
        this.backleftleg.addChild(backleftleg2);
        this.setRotateAngle(backleftleg2, -1.1625F, 0.3614F, 0.1572F);
        this.backleftleg2.cubeList.add(new ModelBox(backleftleg2, 11, 39, -1.5F, -1.5F, 0.0F, 3, 3, 5, 0.0F, false));

        this.backleftleg3 = new AdvancedModelRenderer(this);
        this.backleftleg3.setRotationPoint(-0.0005F, -0.001F, 5.0061F);
        this.backleftleg2.addChild(backleftleg3);
        this.setRotateAngle(backleftleg3, -0.0099F, -0.0079F, 1.3962F);
        this.backleftleg3.cubeList.add(new ModelBox(backleftleg3, 16, 14, -2.0F, -3.75F, -0.5F, 4, 5, 1, 0.0F, false));

        this.backrightleg = new AdvancedModelRenderer(this);
        this.backrightleg.setRotationPoint(-5.0549F, -7.048F, 4.8878F);
        this.main.addChild(backrightleg);
        this.setRotateAngle(backrightleg, -0.3927F, -1.1781F, 0.0F);
        this.backrightleg.cubeList.add(new ModelBox(backrightleg, 0, 14, -2.0F, -2.0F, 0.0F, 4, 4, 7, 0.0F, true));

        this.backrightleg2 = new AdvancedModelRenderer(this);
        this.backrightleg2.setRotationPoint(-0.0049F, -0.9681F, 6.2647F);
        this.backrightleg.addChild(backrightleg2);
        this.setRotateAngle(backrightleg2, -1.1625F, -0.3614F, -0.1572F);
        this.backrightleg2.cubeList.add(new ModelBox(backrightleg2, 11, 39, -1.5F, -1.5F, 0.0F, 3, 3, 5, 0.0F, true));

        this.backrightleg3 = new AdvancedModelRenderer(this);
        this.backrightleg3.setRotationPoint(0.0005F, -0.001F, 5.0061F);
        this.backrightleg2.addChild(backrightleg3);
        this.setRotateAngle(backrightleg3, -0.0099F, 0.0079F, -1.3962F);
        this.backrightleg3.cubeList.add(new ModelBox(backrightleg3, 16, 14, -2.0F, -3.75F, -0.5F, 4, 5, 1, 0.0F, true));

        this.tail = new AdvancedModelRenderer(this);
        this.tail.setRotationPoint(0.0F, -7.3981F, 10.0436F);
        this.main.addChild(tail);
        this.setRotateAngle(tail, -0.0873F, 0.0F, 0.0F);
        this.tail.cubeList.add(new ModelBox(tail, 0, 0, -1.5F, -1.5F, 0.0F, 3, 3, 10, 0.0F, false));

        this.tail2 = new AdvancedModelRenderer(this);
        this.tail2.setRotationPoint(0.0F, 0.0005F, 9.9782F);
        this.tail.addChild(tail2);
        this.setRotateAngle(tail2, 0.0436F, 0.0F, 0.0F);
        this.tail2.cubeList.add(new ModelBox(tail2, 23, 18, -1.0F, -1.0F, 0.0F, 2, 2, 5, 0.0F, false));

        this.tail3 = new AdvancedModelRenderer(this);
        this.tail3.setRotationPoint(0.0F, 0.0F, 5.0F);
        this.tail2.addChild(tail3);
        this.setRotateAngle(tail3, 0.0436F, 0.0F, 0.0F);
        this.tail3.cubeList.add(new ModelBox(tail3, 93, 1, -0.5F, -0.5F, 0.0F, 1, 1, 5, 0.0F, false));

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

        EntityPrehistoricFloraNaomichelys entityNaomichelys = (EntityPrehistoricFloraNaomichelys) e;

        if (entityNaomichelys.getAnimation() == entityNaomichelys.HIDE_ANIMATION) {
            return;
        }

        AdvancedModelRenderer[] Tail = {this.tail, this.tail2, this.tail3};
        AdvancedModelRenderer[] Neck = {this.neck, this.head};

        if (entityNaomichelys.getAnimation() == entityNaomichelys.LAY_ANIMATION) {
            this.chainSwing(Neck, 0.5F, 0.10F, 0.5, f2, 0.8F);
            this.chainWave(Neck, 0.5F * 2, -0.02F, 0.5F, f2, 0.8F);
        }
        else {
            if (!entityNaomichelys.isReallyInWater()) {

                if (f3 == 0.0F || !entityNaomichelys.getIsMoving()) {
                    if (entityNaomichelys.getAnimation() != entityNaomichelys.EAT_ANIMATION
                        && entityNaomichelys.getAnimation() != entityNaomichelys.DRINK_ANIMATION
                        && entityNaomichelys.getAnimation() != entityNaomichelys.HIDE_ANIMATION) {
                        this.chainSwing(Neck, 0.05F, 0.10F, 0.5, f2, 0.8F);
                        this.chainWave(Neck, 0.05F * 2, -0.02F, 0.5F, f2, 0.8F);
                    }

                    this.chainWave(Tail, (0.15F * 0.35F), 0.1F * 0.1F, 0.2F, f2, 1F);
                    this.chainSwing(Tail, (0.15F * 0.35F) * 4F, 0.05F * 0.05F, 0.12F, f2, 1F);


                    return;
                }

                if (entityNaomichelys.getIsFast()) { //Running


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

        EntityPrehistoricFloraNaomichelys ee = (EntityPrehistoricFloraNaomichelys) entitylivingbaseIn;

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
        EntityPrehistoricFloraNaomichelys entity = (EntityPrehistoricFloraNaomichelys) entitylivingbaseIn;
        int animCycle = 50;
        double tickAnim = animTick + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;
         if (tickAnim >= 0 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 0) / 5) * (-5-(0)));
            yy = 0 + (((tickAnim - 0) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 5) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 10) {
            xx = -5 + (((tickAnim - 5) / 5) * (-2.5-(-5)));
            yy = 0 + (((tickAnim - 5) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 5) / 5) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 16) {
            xx = -2.5 + (((tickAnim - 10) / 6) * (0.41627-(-2.5)));
            yy = 0 + (((tickAnim - 10) / 6) * (0.01817-(0)));
            zz = 0 + (((tickAnim - 10) / 6) * (-2.49993-(0)));
        }
        else if (tickAnim >= 16 && tickAnim < 20) {
            xx = 0.41627 + (((tickAnim - 16) / 4) * (2.5-(0.41627)));
            yy = 0.01817 + (((tickAnim - 16) / 4) * (0-(0.01817)));
            zz = -2.49993 + (((tickAnim - 16) / 4) * (0-(-2.49993)));
        }
        else if (tickAnim >= 20 && tickAnim < 23) {
            xx = 2.5 + (((tickAnim - 20) / 3) * (2.37374-(2.5)));
            yy = 0 + (((tickAnim - 20) / 3) * (-0.10361-(0)));
            zz = 0 + (((tickAnim - 20) / 3) * (2.49785-(0)));
        }
        else if (tickAnim >= 23 && tickAnim < 30) {
            xx = 2.37374 + (((tickAnim - 23) / 7) * (1.88-(2.37374)));
            yy = -0.10361 + (((tickAnim - 23) / 7) * (0-(-0.10361)));
            zz = 2.49785 + (((tickAnim - 23) / 7) * (0-(2.49785)));
        }
        else if (tickAnim >= 30 && tickAnim < 36) {
            xx = 1.88 + (((tickAnim - 30) / 6) * (0.42127-(1.88)));
            yy = 0 + (((tickAnim - 30) / 6) * (0.01839-(0)));
            zz = 0 + (((tickAnim - 30) / 6) * (-2.49993-(0)));
        }
        else if (tickAnim >= 36 && tickAnim < 38) {
            xx = 0.42127 + (((tickAnim - 36) / 2) * (-0.62-(0.42127)));
            yy = 0.01839 + (((tickAnim - 36) / 2) * (0-(0.01839)));
            zz = -2.49993 + (((tickAnim - 36) / 2) * (0-(-2.49993)));
        }
        else if (tickAnim >= 38 && tickAnim < 41) {
            xx = -0.62 + (((tickAnim - 38) / 3) * (-2.07802-(-0.62)));
            yy = 0 + (((tickAnim - 38) / 3) * (0.09071-(0)));
            zz = 0 + (((tickAnim - 38) / 3) * (2.49835-(0)));
        }
        else if (tickAnim >= 41 && tickAnim < 44) {
            xx = -2.07802 + (((tickAnim - 41) / 3) * (-5-(-2.07802)));
            yy = 0.09071 + (((tickAnim - 41) / 3) * (0-(0.09071)));
            zz = 2.49835 + (((tickAnim - 41) / 3) * (0-(2.49835)));
        }
        else if (tickAnim >= 44 && tickAnim < 50) {
            xx = -5 + (((tickAnim - 44) / 6) * (0-(-5)));
            yy = 0 + (((tickAnim - 44) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 44) / 6) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(main, main.rotateAngleX + (float) Math.toRadians(xx), main.rotateAngleY + (float) Math.toRadians(yy), main.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 0) / 5) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 5) * (-3-(0)));
            zz = 0 + (((tickAnim - 0) / 5) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 5) / 5) * (0-(0)));
            yy = -3 + (((tickAnim - 5) / 5) * (-3-(-3)));
            zz = 0 + (((tickAnim - 5) / 5) * (0.45-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 10) / 10) * (0-(0)));
            yy = -3 + (((tickAnim - 10) / 10) * (-3-(-3)));
            zz = 0.45 + (((tickAnim - 10) / 10) * (1.2-(0.45)));
        }
        else if (tickAnim >= 20 && tickAnim < 36) {
            xx = 0 + (((tickAnim - 20) / 16) * (0-(0)));
            yy = -3 + (((tickAnim - 20) / 16) * (-3-(-3)));
            zz = 1.2 + (((tickAnim - 20) / 16) * (1.14-(1.2)));
        }
        else if (tickAnim >= 36 && tickAnim < 41) {
            xx = 0 + (((tickAnim - 36) / 5) * (0-(0)));
            yy = -3 + (((tickAnim - 36) / 5) * (-3-(-3)));
            zz = 1.14 + (((tickAnim - 36) / 5) * (0.2-(1.14)));
        }
        else if (tickAnim >= 41 && tickAnim < 44) {
            xx = 0 + (((tickAnim - 41) / 3) * (0-(0)));
            yy = -3 + (((tickAnim - 41) / 3) * (-3-(-3)));
            zz = 0.2 + (((tickAnim - 41) / 3) * (0-(0.2)));
        }
        else if (tickAnim >= 44 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 44) / 6) * (0-(0)));
            yy = -3 + (((tickAnim - 44) / 6) * (0-(-3)));
            zz = 0 + (((tickAnim - 44) / 6) * (0-(0)));
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
            xx = 0 + (((tickAnim - 0) / 5) * (-15-(0)));
            yy = 0 + (((tickAnim - 0) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 5) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 50) {
            xx = -15 + (((tickAnim - 5) / 45) * (0-(-15)));
            yy = 0 + (((tickAnim - 5) / 45) * (0-(0)));
            zz = 0 + (((tickAnim - 5) / 45) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck, neck.rotateAngleX + (float) Math.toRadians(xx), neck.rotateAngleY + (float) Math.toRadians(yy), neck.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 0) / 5) * (-10-(0)));
            yy = 0 + (((tickAnim - 0) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 5) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 21) {
            xx = -10 + (((tickAnim - 5) / 16) * (-12.5-(-10)));
            yy = 0 + (((tickAnim - 5) / 16) * (0-(0)));
            zz = 0 + (((tickAnim - 5) / 16) * (0-(0)));
        }
        else if (tickAnim >= 21 && tickAnim < 38) {
            xx = -12.5 + (((tickAnim - 21) / 17) * (2.14-(-12.5)));
            yy = 0 + (((tickAnim - 21) / 17) * (0-(0)));
            zz = 0 + (((tickAnim - 21) / 17) * (0-(0)));
        }
        else if (tickAnim >= 38 && tickAnim < 44) {
            xx = 2.14 + (((tickAnim - 38) / 6) * (-10-(2.14)));
            yy = 0 + (((tickAnim - 38) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 38) / 6) * (0-(0)));
        }
        else if (tickAnim >= 44 && tickAnim < 50) {
            xx = -10 + (((tickAnim - 44) / 6) * (0-(-10)));
            yy = 0 + (((tickAnim - 44) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 44) / 6) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(head, head.rotateAngleX + (float) Math.toRadians(xx), head.rotateAngleY + (float) Math.toRadians(yy), head.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 0) / 5) * (-0.19053-(0)));
            yy = 0 + (((tickAnim - 0) / 5) * (46.46328-(0)));
            zz = 0 + (((tickAnim - 0) / 5) * (-43.0358-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 16) {
            xx = -0.19053 + (((tickAnim - 5) / 11) * (-5.09474-(-0.19053)));
            yy = 46.46328 + (((tickAnim - 5) / 11) * (41.03005-(46.46328)));
            zz = -43.0358 + (((tickAnim - 5) / 11) * (-41.32485-(-43.0358)));
        }
        else if (tickAnim >= 16 && tickAnim < 23) {
            xx = -5.09474 + (((tickAnim - 16) / 7) * (-11.61612-(-5.09474)));
            yy = 41.03005 + (((tickAnim - 16) / 7) * (37.00707-(41.03005)));
            zz = -41.32485 + (((tickAnim - 16) / 7) * (-41.24001-(-41.32485)));
        }
        else if (tickAnim >= 23 && tickAnim < 36) {
            xx = -11.61612 + (((tickAnim - 23) / 13) * (-3.69441-(-11.61612)));
            yy = 37.00707 + (((tickAnim - 23) / 13) * (44.16646-(37.00707)));
            zz = -41.24001 + (((tickAnim - 23) / 13) * (-41.48258-(-41.24001)));
        }
        else if (tickAnim >= 36 && tickAnim < 40) {
            xx = -3.69441 + (((tickAnim - 36) / 4) * (-6.94733-(-3.69441)));
            yy = 44.16646 + (((tickAnim - 36) / 4) * (45.36146-(44.16646)));
            zz = -41.48258 + (((tickAnim - 36) / 4) * (-47.59884-(-41.48258)));
        }
        else if (tickAnim >= 40 && tickAnim < 44) {
            xx = -6.94733 + (((tickAnim - 40) / 4) * (-0.19053-(-6.94733)));
            yy = 45.36146 + (((tickAnim - 40) / 4) * (46.46328-(45.36146)));
            zz = -47.59884 + (((tickAnim - 40) / 4) * (-43.0358-(-47.59884)));
        }
        else if (tickAnim >= 44 && tickAnim < 50) {
            xx = -0.19053 + (((tickAnim - 44) / 6) * (0-(-0.19053)));
            yy = 46.46328 + (((tickAnim - 44) / 6) * (0-(46.46328)));
            zz = -43.0358 + (((tickAnim - 44) / 6) * (0-(-43.0358)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(frontleftleg, frontleftleg.rotateAngleX + (float) Math.toRadians(xx), frontleftleg.rotateAngleY + (float) Math.toRadians(yy), frontleftleg.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 0) / 5) * (16.20309-(0)));
            yy = 0 + (((tickAnim - 0) / 5) * (3.06523-(0)));
            zz = 0 + (((tickAnim - 0) / 5) * (12.89167-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 20) {
            xx = 16.20309 + (((tickAnim - 5) / 15) * (16.1151-(16.20309)));
            yy = 3.06523 + (((tickAnim - 5) / 15) * (3.38416-(3.06523)));
            zz = 12.89167 + (((tickAnim - 5) / 15) * (12.79582-(12.89167)));
        }
        else if (tickAnim >= 20 && tickAnim < 36) {
            xx = 16.1151 + (((tickAnim - 20) / 16) * (8.31913-(16.1151)));
            yy = 3.38416 + (((tickAnim - 20) / 16) * (-7.09997-(3.38416)));
            zz = 12.79582 + (((tickAnim - 20) / 16) * (6.33563-(12.79582)));
        }
        else if (tickAnim >= 36 && tickAnim < 40) {
            xx = 8.31913 + (((tickAnim - 36) / 4) * (25.99448-(8.31913)));
            yy = -7.09997 + (((tickAnim - 36) / 4) * (3.69433-(-7.09997)));
            zz = 6.33563 + (((tickAnim - 36) / 4) * (19.77416-(6.33563)));
        }
        else if (tickAnim >= 40 && tickAnim < 44) {
            xx = 25.99448 + (((tickAnim - 40) / 4) * (16.20309-(25.99448)));
            yy = 3.69433 + (((tickAnim - 40) / 4) * (3.06523-(3.69433)));
            zz = 19.77416 + (((tickAnim - 40) / 4) * (12.89167-(19.77416)));
        }
        else if (tickAnim >= 44 && tickAnim < 50) {
            xx = 16.20309 + (((tickAnim - 44) / 6) * (0-(16.20309)));
            yy = 3.06523 + (((tickAnim - 44) / 6) * (0-(3.06523)));
            zz = 12.89167 + (((tickAnim - 44) / 6) * (0-(12.89167)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(frontleftleg2, frontleftleg2.rotateAngleX + (float) Math.toRadians(xx), frontleftleg2.rotateAngleY + (float) Math.toRadians(yy), frontleftleg2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 0) / 5) * (-24.13272-(0)));
            yy = 0 + (((tickAnim - 0) / 5) * (34.71167-(0)));
            zz = 0 + (((tickAnim - 0) / 5) * (9.84164-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 20) {
            xx = -24.13272 + (((tickAnim - 5) / 15) * (-22.89165-(-24.13272)));
            yy = 34.71167 + (((tickAnim - 5) / 15) * (37.3127-(34.71167)));
            zz = 9.84164 + (((tickAnim - 5) / 15) * (8.63832-(9.84164)));
        }
        else if (tickAnim >= 20 && tickAnim < 23) {
            xx = -22.89165 + (((tickAnim - 20) / 3) * (-18.60125-(-22.89165)));
            yy = 37.3127 + (((tickAnim - 20) / 3) * (32.34674-(37.3127)));
            zz = 8.63832 + (((tickAnim - 20) / 3) * (10.81099-(8.63832)));
        }
        else if (tickAnim >= 23 && tickAnim < 36) {
            xx = -18.60125 + (((tickAnim - 23) / 13) * (-21.75502-(-18.60125)));
            yy = 32.34674 + (((tickAnim - 23) / 13) * (41.38677-(32.34674)));
            zz = 10.81099 + (((tickAnim - 23) / 13) * (5.51366-(10.81099)));
        }
        else if (tickAnim >= 36 && tickAnim < 40) {
            xx = -21.75502 + (((tickAnim - 36) / 4) * (-26.42831-(-21.75502)));
            yy = 41.38677 + (((tickAnim - 36) / 4) * (33.80209-(41.38677)));
            zz = 5.51366 + (((tickAnim - 36) / 4) * (10.21447-(5.51366)));
        }
        else if (tickAnim >= 40 && tickAnim < 44) {
            xx = -26.42831 + (((tickAnim - 40) / 4) * (-24.13272-(-26.42831)));
            yy = 33.80209 + (((tickAnim - 40) / 4) * (34.71167-(33.80209)));
            zz = 10.21447 + (((tickAnim - 40) / 4) * (9.84164-(10.21447)));
        }
        else if (tickAnim >= 44 && tickAnim < 50) {
            xx = -24.13272 + (((tickAnim - 44) / 6) * (0-(-24.13272)));
            yy = 34.71167 + (((tickAnim - 44) / 6) * (0-(34.71167)));
            zz = 9.84164 + (((tickAnim - 44) / 6) * (0-(9.84164)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(frontleftleg3, frontleftleg3.rotateAngleX + (float) Math.toRadians(xx), frontleftleg3.rotateAngleY + (float) Math.toRadians(yy), frontleftleg3.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 0) / 5) * (-0.19053-(0)));
            yy = 0 + (((tickAnim - 0) / 5) * (-46.46328-(0)));
            zz = 0 + (((tickAnim - 0) / 5) * (43.0358-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 10) {
            xx = -0.19053 + (((tickAnim - 5) / 5) * (-3.13285-(-0.19053)));
            yy = -46.46328 + (((tickAnim - 5) / 5) * (-44.27766-(-46.46328)));
            zz = 43.0358 + (((tickAnim - 5) / 5) * (43.33281-(43.0358)));
        }
        else if (tickAnim >= 10 && tickAnim < 16) {
            xx = -3.13285 + (((tickAnim - 10) / 6) * (-8.92872-(-3.13285)));
            yy = -44.27766 + (((tickAnim - 10) / 6) * (-41.15828-(-44.27766)));
            zz = 43.33281 + (((tickAnim - 10) / 6) * (43.48103-(43.33281)));
        }
        else if (tickAnim >= 16 && tickAnim < 20) {
            xx = -8.92872 + (((tickAnim - 16) / 4) * (-8.2958-(-8.92872)));
            yy = -41.15828 + (((tickAnim - 16) / 4) * (-39.17758-(-41.15828)));
            zz = 43.48103 + (((tickAnim - 16) / 4) * (43.46296-(43.48103)));
        }
        else if (tickAnim >= 20 && tickAnim < 23) {
            xx = -8.2958 + (((tickAnim - 20) / 3) * (-5.98386-(-8.2958)));
            yy = -39.17758 + (((tickAnim - 20) / 3) * (-40.1792-(-39.17758)));
            zz = 43.46296 + (((tickAnim - 20) / 3) * (43.41741-(43.46296)));
        }
        else if (tickAnim >= 23 && tickAnim < 36) {
            xx = -5.98386 + (((tickAnim - 23) / 13) * (-8.92875-(-5.98386)));
            yy = -40.1792 + (((tickAnim - 23) / 13) * (-41.15825-(-40.1792)));
            zz = 43.41741 + (((tickAnim - 23) / 13) * (43.48042-(43.41741)));
        }
        else if (tickAnim >= 36 && tickAnim < 40) {
            xx = -8.92875 + (((tickAnim - 36) / 4) * (-1.25326-(-8.92875)));
            yy = -41.15825 + (((tickAnim - 36) / 4) * (-44.36828-(-41.15825)));
            zz = 43.48042 + (((tickAnim - 36) / 4) * (43.31672-(43.48042)));
        }
        else if (tickAnim >= 40 && tickAnim < 44) {
            xx = -1.25326 + (((tickAnim - 40) / 4) * (-0.19053-(-1.25326)));
            yy = -44.36828 + (((tickAnim - 40) / 4) * (-46.46328-(-44.36828)));
            zz = 43.31672 + (((tickAnim - 40) / 4) * (43.0358-(43.31672)));
        }
        else if (tickAnim >= 44 && tickAnim < 50) {
            xx = -0.19053 + (((tickAnim - 44) / 6) * (0-(-0.19053)));
            yy = -46.46328 + (((tickAnim - 44) / 6) * (0-(-46.46328)));
            zz = 43.0358 + (((tickAnim - 44) / 6) * (0-(43.0358)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(frontrightleg, frontrightleg.rotateAngleX + (float) Math.toRadians(xx), frontrightleg.rotateAngleY + (float) Math.toRadians(yy), frontrightleg.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 0) / 5) * (16.20309-(0)));
            yy = 0 + (((tickAnim - 0) / 5) * (-3.06523-(0)));
            zz = 0 + (((tickAnim - 0) / 5) * (-12.89167-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 50) {
            xx = 16.20309 + (((tickAnim - 5) / 45) * (0-(16.20309)));
            yy = -3.06523 + (((tickAnim - 5) / 45) * (0-(-3.06523)));
            zz = -12.89167 + (((tickAnim - 5) / 45) * (0-(-12.89167)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(frontrightleg2, frontrightleg2.rotateAngleX + (float) Math.toRadians(xx), frontrightleg2.rotateAngleY + (float) Math.toRadians(yy), frontrightleg2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 0) / 5) * (-24.13272-(0)));
            yy = 0 + (((tickAnim - 0) / 5) * (-34.71167-(0)));
            zz = 0 + (((tickAnim - 0) / 5) * (-9.84164-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 50) {
            xx = -24.13272 + (((tickAnim - 5) / 45) * (0-(-24.13272)));
            yy = -34.71167 + (((tickAnim - 5) / 45) * (0-(-34.71167)));
            zz = -9.84164 + (((tickAnim - 5) / 45) * (0-(-9.84164)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(frontrightleg3, frontrightleg3.rotateAngleX + (float) Math.toRadians(xx), frontrightleg3.rotateAngleY + (float) Math.toRadians(yy), frontrightleg3.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 0 + (((tickAnim - 0) / 3) * (42.54055-(0)));
            yy = 0 + (((tickAnim - 0) / 3) * (-26.85091-(0)));
            zz = 0 + (((tickAnim - 0) / 3) * (45.90167-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 5) {
            xx = 42.54055 + (((tickAnim - 3) / 2) * (64.75252-(42.54055)));
            yy = -26.85091 + (((tickAnim - 3) / 2) * (-48.73922-(-26.85091)));
            zz = 45.90167 + (((tickAnim - 3) / 2) * (83.31978-(45.90167)));
        }
        else if (tickAnim >= 5 && tickAnim < 8) {
            xx = 64.75252 + (((tickAnim - 5) / 3) * (102.73077-(64.75252)));
            yy = -48.73922 + (((tickAnim - 5) / 3) * (-45.46896-(-48.73922)));
            zz = 83.31978 + (((tickAnim - 5) / 3) * (98.94704-(83.31978)));
        }
        else if (tickAnim >= 8 && tickAnim < 13) {
            xx = 102.73077 + (((tickAnim - 8) / 5) * (96.32422-(102.73077)));
            yy = -45.46896 + (((tickAnim - 8) / 5) * (-43.75119-(-45.46896)));
            zz = 98.94704 + (((tickAnim - 8) / 5) * (95.62677-(98.94704)));
        }
        else if (tickAnim >= 13 && tickAnim < 17) {
            xx = 96.32422 + (((tickAnim - 13) / 4) * (44.74869-(96.32422)));
            yy = -43.75119 + (((tickAnim - 13) / 4) * (-46.61922-(-43.75119)));
            zz = 95.62677 + (((tickAnim - 13) / 4) * (84.72831-(95.62677)));
        }
        else if (tickAnim >= 17 && tickAnim < 26) {
            xx = 44.74869 + (((tickAnim - 17) / 9) * (87.71498-(44.74869)));
            yy = -46.61922 + (((tickAnim - 17) / 9) * (-44.26504-(-46.61922)));
            zz = 84.72831 + (((tickAnim - 17) / 9) * (92.90411-(84.72831)));
        }
        else if (tickAnim >= 26 && tickAnim < 29) {
            xx = 87.71498 + (((tickAnim - 26) / 3) * (82.75067-(87.71498)));
            yy = -44.26504 + (((tickAnim - 26) / 3) * (-44.66307-(-44.26504)));
            zz = 92.90411 + (((tickAnim - 26) / 3) * (93.09233-(92.90411)));
        }
        else if (tickAnim >= 29 && tickAnim < 36) {
            xx = 82.75067 + (((tickAnim - 29) / 7) * (43.85341-(82.75067)));
            yy = -44.66307 + (((tickAnim - 29) / 7) * (-50.86951-(-44.66307)));
            zz = 93.09233 + (((tickAnim - 29) / 7) * (81.9463-(93.09233)));
        }
        else if (tickAnim >= 36 && tickAnim < 44) {
            xx = 43.85341 + (((tickAnim - 36) / 8) * (64.75252-(43.85341)));
            yy = -50.86951 + (((tickAnim - 36) / 8) * (-48.73922-(-50.86951)));
            zz = 81.9463 + (((tickAnim - 36) / 8) * (83.31978-(81.9463)));
        }
        else if (tickAnim >= 44 && tickAnim < 48) {
            xx = 64.75252 + (((tickAnim - 44) / 4) * (37.00108-(64.75252)));
            yy = -48.73922 + (((tickAnim - 44) / 4) * (-20.88824-(-48.73922)));
            zz = 83.31978 + (((tickAnim - 44) / 4) * (35.70848-(83.31978)));
        }
        else if (tickAnim >= 48 && tickAnim < 50) {
            xx = 37.00108 + (((tickAnim - 48) / 2) * (0-(37.00108)));
            yy = -20.88824 + (((tickAnim - 48) / 2) * (0-(-20.88824)));
            zz = 35.70848 + (((tickAnim - 48) / 2) * (0-(35.70848)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(backleftleg, backleftleg.rotateAngleX + (float) Math.toRadians(xx), backleftleg.rotateAngleY + (float) Math.toRadians(yy), backleftleg.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 0) / 5) * (44.99412-(0)));
            yy = 0 + (((tickAnim - 0) / 5) * (53.19349-(0)));
            zz = 0 + (((tickAnim - 0) / 5) * (-55.40601-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 8) {
            xx = 44.99412 + (((tickAnim - 5) / 3) * (26.09045-(44.99412)));
            yy = 53.19349 + (((tickAnim - 5) / 3) * (10.84582-(53.19349)));
            zz = -55.40601 + (((tickAnim - 5) / 3) * (-88.44274-(-55.40601)));
        }
        else if (tickAnim >= 8 && tickAnim < 13) {
            xx = 26.09045 + (((tickAnim - 8) / 5) * (10.52643-(26.09045)));
            yy = 10.84582 + (((tickAnim - 8) / 5) * (1.53371-(10.84582)));
            zz = -88.44274 + (((tickAnim - 8) / 5) * (-101.55949-(-88.44274)));
        }
        else if (tickAnim >= 13 && tickAnim < 17) {
            xx = 10.52643 + (((tickAnim - 13) / 4) * (-34.87644-(10.52643)));
            yy = 1.53371 + (((tickAnim - 13) / 4) * (-5.1178-(1.53371)));
            zz = -101.55949 + (((tickAnim - 13) / 4) * (-110.92859-(-101.55949)));
        }
        else if (tickAnim >= 17 && tickAnim < 23) {
            xx = -34.87644 + (((tickAnim - 17) / 6) * (-32.37644-(-34.87644)));
            yy = -5.1178 + (((tickAnim - 17) / 6) * (-5.1178-(-5.1178)));
            zz = -110.92859 + (((tickAnim - 17) / 6) * (-110.92859-(-110.92859)));
        }
        else if (tickAnim >= 23 && tickAnim < 28) {
            xx = -32.37644 + (((tickAnim - 23) / 5) * (25.12356-(-32.37644)));
            yy = -5.1178 + (((tickAnim - 23) / 5) * (-5.1178-(-5.1178)));
            zz = -110.92859 + (((tickAnim - 23) / 5) * (-110.92859-(-110.92859)));
        }
        else if (tickAnim >= 28 && tickAnim < 33) {
            xx = 25.12356 + (((tickAnim - 28) / 5) * (12.49973-(25.12356)));
            yy = -5.1178 + (((tickAnim - 28) / 5) * (10.91731-(-5.1178)));
            zz = -110.92859 + (((tickAnim - 28) / 5) * (-118.16244-(-110.92859)));
        }
        else if (tickAnim >= 33 && tickAnim < 37) {
            xx = 12.49973 + (((tickAnim - 33) / 4) * (-38.24736-(12.49973)));
            yy = 10.91731 + (((tickAnim - 33) / 4) * (14.36458-(10.91731)));
            zz = -118.16244 + (((tickAnim - 33) / 4) * (-148.49687-(-118.16244)));
        }
        else if (tickAnim >= 37 && tickAnim < 44) {
            xx = -38.24736 + (((tickAnim - 37) / 7) * (44.99412-(-38.24736)));
            yy = 14.36458 + (((tickAnim - 37) / 7) * (53.19349-(14.36458)));
            zz = -148.49687 + (((tickAnim - 37) / 7) * (-55.40601-(-148.49687)));
        }
        else if (tickAnim >= 44 && tickAnim < 50) {
            xx = 44.99412 + (((tickAnim - 44) / 6) * (0-(44.99412)));
            yy = 53.19349 + (((tickAnim - 44) / 6) * (0-(53.19349)));
            zz = -55.40601 + (((tickAnim - 44) / 6) * (0-(-55.40601)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(backleftleg3, backleftleg3.rotateAngleX + (float) Math.toRadians(xx), backleftleg3.rotateAngleY + (float) Math.toRadians(yy), backleftleg3.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 0 + (((tickAnim - 0) / 3) * (43.69928-(0)));
            yy = 0 + (((tickAnim - 0) / 3) * (26.85091-(0)));
            zz = 0 + (((tickAnim - 0) / 3) * (-45.90167-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 5) {
            xx = 43.69928 + (((tickAnim - 3) / 2) * (64.75252-(43.69928)));
            yy = 26.85091 + (((tickAnim - 3) / 2) * (48.73922-(26.85091)));
            zz = -45.90167 + (((tickAnim - 3) / 2) * (-83.31978-(-45.90167)));
        }
        else if (tickAnim >= 5 && tickAnim < 13) {
            xx = 64.75252 + (((tickAnim - 5) / 8) * (102.73077-(64.75252)));
            yy = 48.73922 + (((tickAnim - 5) / 8) * (45.46896-(48.73922)));
            zz = -83.31978 + (((tickAnim - 5) / 8) * (-98.94704-(-83.31978)));
        }
        else if (tickAnim >= 13 && tickAnim < 17) {
            xx = 102.73077 + (((tickAnim - 13) / 4) * (96.32422-(102.73077)));
            yy = 45.46896 + (((tickAnim - 13) / 4) * (43.75119-(45.46896)));
            zz = -98.94704 + (((tickAnim - 13) / 4) * (-95.62677-(-98.94704)));
        }
        else if (tickAnim >= 17 && tickAnim < 23) {
            xx = 96.32422 + (((tickAnim - 17) / 6) * (44.74869-(96.32422)));
            yy = 43.75119 + (((tickAnim - 17) / 6) * (46.61922-(43.75119)));
            zz = -95.62677 + (((tickAnim - 17) / 6) * (-84.72831-(-95.62677)));
        }
        else if (tickAnim >= 23 && tickAnim < 33) {
            xx = 44.74869 + (((tickAnim - 23) / 10) * (87.71498-(44.74869)));
            yy = 46.61922 + (((tickAnim - 23) / 10) * (44.26504-(46.61922)));
            zz = -84.72831 + (((tickAnim - 23) / 10) * (-92.90411-(-84.72831)));
        }
        else if (tickAnim >= 33 && tickAnim < 36) {
            xx = 87.71498 + (((tickAnim - 33) / 3) * (82.75067-(87.71498)));
            yy = 44.26504 + (((tickAnim - 33) / 3) * (44.66307-(44.26504)));
            zz = -92.90411 + (((tickAnim - 33) / 3) * (-93.09233-(-92.90411)));
        }
        else if (tickAnim >= 36 && tickAnim < 41) {
            xx = 82.75067 + (((tickAnim - 36) / 5) * (43.85341-(82.75067)));
            yy = 44.66307 + (((tickAnim - 36) / 5) * (50.86951-(44.66307)));
            zz = -93.09233 + (((tickAnim - 36) / 5) * (-81.9463-(-93.09233)));
        }
        else if (tickAnim >= 41 && tickAnim < 44) {
            xx = 43.85341 + (((tickAnim - 41) / 3) * (64.75252-(43.85341)));
            yy = 50.86951 + (((tickAnim - 41) / 3) * (48.73922-(50.86951)));
            zz = -81.9463 + (((tickAnim - 41) / 3) * (-83.31978-(-81.9463)));
        }
        else if (tickAnim >= 44 && tickAnim < 48) {
            xx = 64.75252 + (((tickAnim - 44) / 4) * (37.00108-(64.75252)));
            yy = 48.73922 + (((tickAnim - 44) / 4) * (20.88824-(48.73922)));
            zz = -83.31978 + (((tickAnim - 44) / 4) * (-35.70848-(-83.31978)));
        }
        else if (tickAnim >= 48 && tickAnim < 50) {
            xx = 37.00108 + (((tickAnim - 48) / 2) * (0-(37.00108)));
            yy = 20.88824 + (((tickAnim - 48) / 2) * (0-(20.88824)));
            zz = -35.70848 + (((tickAnim - 48) / 2) * (0-(-35.70848)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(backrightleg, backrightleg.rotateAngleX + (float) Math.toRadians(xx), backrightleg.rotateAngleY + (float) Math.toRadians(yy), backrightleg.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 0) / 5) * (44.99412-(0)));
            yy = 0 + (((tickAnim - 0) / 5) * (-53.19349-(0)));
            zz = 0 + (((tickAnim - 0) / 5) * (55.40601-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 13) {
            xx = 44.99412 + (((tickAnim - 5) / 8) * (26.09045-(44.99412)));
            yy = -53.19349 + (((tickAnim - 5) / 8) * (-10.84582-(-53.19349)));
            zz = 55.40601 + (((tickAnim - 5) / 8) * (88.44274-(55.40601)));
        }
        else if (tickAnim >= 13 && tickAnim < 18) {
            xx = 26.09045 + (((tickAnim - 13) / 5) * (10.52643-(26.09045)));
            yy = -10.84582 + (((tickAnim - 13) / 5) * (-1.53371-(-10.84582)));
            zz = 88.44274 + (((tickAnim - 13) / 5) * (101.55949-(88.44274)));
        }
        else if (tickAnim >= 18 && tickAnim < 23) {
            xx = 10.52643 + (((tickAnim - 18) / 5) * (-34.87644-(10.52643)));
            yy = -1.53371 + (((tickAnim - 18) / 5) * (5.1178-(-1.53371)));
            zz = 101.55949 + (((tickAnim - 18) / 5) * (110.92859-(101.55949)));
        }
        else if (tickAnim >= 23 && tickAnim < 28) {
            xx = -34.87644 + (((tickAnim - 23) / 5) * (-32.37644-(-34.87644)));
            yy = 5.1178 + (((tickAnim - 23) / 5) * (5.1178-(5.1178)));
            zz = 110.92859 + (((tickAnim - 23) / 5) * (110.92859-(110.92859)));
        }
        else if (tickAnim >= 28 && tickAnim < 35) {
            xx = -32.37644 + (((tickAnim - 28) / 7) * (25.12356-(-32.37644)));
            yy = 5.1178 + (((tickAnim - 28) / 7) * (5.1178-(5.1178)));
            zz = 110.92859 + (((tickAnim - 28) / 7) * (110.92859-(110.92859)));
        }
        else if (tickAnim >= 35 && tickAnim < 38) {
            xx = 25.12356 + (((tickAnim - 35) / 3) * (12.49973-(25.12356)));
            yy = 5.1178 + (((tickAnim - 35) / 3) * (-10.91731-(5.1178)));
            zz = 110.92859 + (((tickAnim - 35) / 3) * (118.16244-(110.92859)));
        }
        else if (tickAnim >= 38 && tickAnim < 41) {
            xx = 12.49973 + (((tickAnim - 38) / 3) * (-38.24736-(12.49973)));
            yy = -10.91731 + (((tickAnim - 38) / 3) * (-14.36458-(-10.91731)));
            zz = 118.16244 + (((tickAnim - 38) / 3) * (148.49687-(118.16244)));
        }
        else if (tickAnim >= 41 && tickAnim < 44) {
            xx = -38.24736 + (((tickAnim - 41) / 3) * (44.99412-(-38.24736)));
            yy = -14.36458 + (((tickAnim - 41) / 3) * (-53.19349-(-14.36458)));
            zz = 148.49687 + (((tickAnim - 41) / 3) * (55.40601-(148.49687)));
        }
        else if (tickAnim >= 44 && tickAnim < 50) {
            xx = 44.99412 + (((tickAnim - 44) / 6) * (0-(44.99412)));
            yy = -53.19349 + (((tickAnim - 44) / 6) * (0-(-53.19349)));
            zz = 55.40601 + (((tickAnim - 44) / 6) * (0-(55.40601)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(backrightleg3, backrightleg3.rotateAngleX + (float) Math.toRadians(xx), backrightleg3.rotateAngleY + (float) Math.toRadians(yy), backrightleg3.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 0) / 5) * (-2.90089-(0)));
            yy = 0 + (((tickAnim - 0) / 5) * (-7.74934-(0)));
            zz = 0 + (((tickAnim - 0) / 5) * (1.90251-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 10) {
            xx = -2.90089 + (((tickAnim - 5) / 5) * (-4.84534-(-2.90089)));
            yy = -7.74934 + (((tickAnim - 5) / 5) * (0.25066-(-7.74934)));
            zz = 1.90251 + (((tickAnim - 5) / 5) * (1.90251-(1.90251)));
        }
        else if (tickAnim >= 10 && tickAnim < 20) {
            xx = -4.84534 + (((tickAnim - 10) / 10) * (-13.78978-(-4.84534)));
            yy = 0.25066 + (((tickAnim - 10) / 10) * (3.25066-(0.25066)));
            zz = 1.90251 + (((tickAnim - 10) / 10) * (1.90251-(1.90251)));
        }
        else if (tickAnim >= 20 && tickAnim < 23) {
            xx = -13.78978 + (((tickAnim - 20) / 3) * (-12.90089-(-13.78978)));
            yy = 3.25066 + (((tickAnim - 20) / 3) * (2.15066-(3.25066)));
            zz = 1.90251 + (((tickAnim - 20) / 3) * (1.90251-(1.90251)));
        }
        else if (tickAnim >= 23 && tickAnim < 36) {
            xx = -12.90089 + (((tickAnim - 23) / 13) * (-9.64332-(-12.90089)));
            yy = 2.15066 + (((tickAnim - 23) / 13) * (-6.94934-(2.15066)));
            zz = 1.90251 + (((tickAnim - 23) / 13) * (1.90251-(1.90251)));
        }
        else if (tickAnim >= 36 && tickAnim < 44) {
            xx = -9.64332 + (((tickAnim - 36) / 8) * (-2.90089-(-9.64332)));
            yy = -6.94934 + (((tickAnim - 36) / 8) * (-7.74934-(-6.94934)));
            zz = 1.90251 + (((tickAnim - 36) / 8) * (1.90251-(1.90251)));
        }
        else if (tickAnim >= 44 && tickAnim < 50) {
            xx = -2.90089 + (((tickAnim - 44) / 6) * (0-(-2.90089)));
            yy = -7.74934 + (((tickAnim - 44) / 6) * (0-(-7.74934)));
            zz = 1.90251 + (((tickAnim - 44) / 6) * (0-(1.90251)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tail, tail.rotateAngleX + (float) Math.toRadians(xx), tail.rotateAngleY + (float) Math.toRadians(yy), tail.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 0) / 5) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 5) * (-25-(0)));
            zz = 0 + (((tickAnim - 0) / 5) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 18) {
            xx = 0 + (((tickAnim - 5) / 13) * (0-(0)));
            yy = -25 + (((tickAnim - 5) / 13) * (-12.5-(-25)));
            zz = 0 + (((tickAnim - 5) / 13) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 30) {
            xx = 0 + (((tickAnim - 18) / 12) * (0-(0)));
            yy = -12.5 + (((tickAnim - 18) / 12) * (2.5-(-12.5)));
            zz = 0 + (((tickAnim - 18) / 12) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 44) {
            xx = 0 + (((tickAnim - 30) / 14) * (0-(0)));
            yy = 2.5 + (((tickAnim - 30) / 14) * (-25-(2.5)));
            zz = 0 + (((tickAnim - 30) / 14) * (0-(0)));
        }
        else if (tickAnim >= 44 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 44) / 6) * (0-(0)));
            yy = -25 + (((tickAnim - 44) / 6) * (0-(-25)));
            zz = 0 + (((tickAnim - 44) / 6) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tail2, tail2.rotateAngleX + (float) Math.toRadians(xx), tail2.rotateAngleY + (float) Math.toRadians(yy), tail2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 0) / 5) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 5) * (-20-(0)));
            zz = 0 + (((tickAnim - 0) / 5) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 23) {
            xx = 0 + (((tickAnim - 5) / 18) * (0-(0)));
            yy = -20 + (((tickAnim - 5) / 18) * (5-(-20)));
            zz = 0 + (((tickAnim - 5) / 18) * (0-(0)));
        }
        else if (tickAnim >= 23 && tickAnim < 34) {
            xx = 0 + (((tickAnim - 23) / 11) * (0-(0)));
            yy = 5 + (((tickAnim - 23) / 11) * (10-(5)));
            zz = 0 + (((tickAnim - 23) / 11) * (0-(0)));
        }
        else if (tickAnim >= 34 && tickAnim < 44) {
            xx = 0 + (((tickAnim - 34) / 10) * (0-(0)));
            yy = 10 + (((tickAnim - 34) / 10) * (-20-(10)));
            zz = 0 + (((tickAnim - 34) / 10) * (0-(0)));
        }
        else if (tickAnim >= 44 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 44) / 6) * (0-(0)));
            yy = -20 + (((tickAnim - 44) / 6) * (0-(-20)));
            zz = 0 + (((tickAnim - 44) / 6) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tail3, tail3.rotateAngleX + (float) Math.toRadians(xx), tail3.rotateAngleY + (float) Math.toRadians(yy), tail3.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 0) / 5) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 5) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 5) / 8) * (0.83-(0)));
            yy = 0 + (((tickAnim - 5) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 5) / 8) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 16) {
            xx = 0.83 + (((tickAnim - 13) / 3) * (40-(0.83)));
            yy = 0 + (((tickAnim - 13) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 13) / 3) * (0-(0)));
        }
        else if (tickAnim >= 16 && tickAnim < 24) {
            xx = 40 + (((tickAnim - 16) / 8) * (-7.5-(40)));
            yy = 0 + (((tickAnim - 16) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 16) / 8) * (0-(0)));
        }
        else if (tickAnim >= 24 && tickAnim < 32) {
            xx = -7.5 + (((tickAnim - 24) / 8) * (1.07-(-7.5)));
            yy = 0 + (((tickAnim - 24) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 24) / 8) * (0-(0)));
        }
        else if (tickAnim >= 32 && tickAnim < 36) {
            xx = 1.07 + (((tickAnim - 32) / 4) * (25-(1.07)));
            yy = 0 + (((tickAnim - 32) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 32) / 4) * (0-(0)));
        }
        else if (tickAnim >= 36 && tickAnim < 44) {
            xx = 25 + (((tickAnim - 36) / 8) * (0-(25)));
            yy = 0 + (((tickAnim - 36) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 36) / 8) * (0-(0)));
        }
        else if (tickAnim >= 44 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 44) / 6) * (0-(0)));
            yy = 0 + (((tickAnim - 44) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 44) / 6) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(backleftleg2, backleftleg2.rotateAngleX + (float) Math.toRadians(xx), backleftleg2.rotateAngleY + (float) Math.toRadians(yy), backleftleg2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 0) / 5) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 5) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 19) {
            xx = 0 + (((tickAnim - 5) / 14) * (0.83-(0)));
            yy = 0 + (((tickAnim - 5) / 14) * (0-(0)));
            zz = 0 + (((tickAnim - 5) / 14) * (0-(0)));
        }
        else if (tickAnim >= 19 && tickAnim < 23) {
            xx = 0.83 + (((tickAnim - 19) / 4) * (40-(0.83)));
            yy = 0 + (((tickAnim - 19) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 19) / 4) * (0-(0)));
        }
        else if (tickAnim >= 23 && tickAnim < 31) {
            xx = 40 + (((tickAnim - 23) / 8) * (-7.5-(40)));
            yy = 0 + (((tickAnim - 23) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 23) / 8) * (0-(0)));
        }
        else if (tickAnim >= 31 && tickAnim < 37) {
            xx = -7.5 + (((tickAnim - 31) / 6) * (1.07-(-7.5)));
            yy = 0 + (((tickAnim - 31) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 31) / 6) * (0-(0)));
        }
        else if (tickAnim >= 37 && tickAnim < 41) {
            xx = 1.07 + (((tickAnim - 37) / 4) * (25-(1.07)));
            yy = 0 + (((tickAnim - 37) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 37) / 4) * (0-(0)));
        }
        else if (tickAnim >= 41 && tickAnim < 44) {
            xx = 25 + (((tickAnim - 41) / 3) * (0-(25)));
            yy = 0 + (((tickAnim - 41) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 41) / 3) * (0-(0)));
        }
        else if (tickAnim >= 44 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 44) / 6) * (0-(0)));
            yy = 0 + (((tickAnim - 44) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 44) / 6) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(backrightleg2, backrightleg2.rotateAngleX + (float) Math.toRadians(xx), backrightleg2.rotateAngleY + (float) Math.toRadians(yy), backrightleg2.rotateAngleZ + (float) Math.toRadians(zz));
    }
    public void animHide(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime, double animTick) {
        EntityPrehistoricFloraNaomichelys entity = (EntityPrehistoricFloraNaomichelys) entitylivingbaseIn;
        int animCycle = 315;
        double tickAnim = animTick + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;
         if (tickAnim >= 0 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 0) / 5) * (-5-(0)));
            yy = 0 + (((tickAnim - 0) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 5) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 7) {
            xx = -5 + (((tickAnim - 5) / 2) * (-2.42103-(-5)));
            yy = 0 + (((tickAnim - 5) / 2) * (-0.10567-(0)));
            zz = 0 + (((tickAnim - 5) / 2) * (-2.49777-(0)));
        }
        else if (tickAnim >= 7 && tickAnim < 10) {
            xx = -2.42103 + (((tickAnim - 7) / 3) * (2.73-(-2.42103)));
            yy = -0.10567 + (((tickAnim - 7) / 3) * (0-(-0.10567)));
            zz = -2.49777 + (((tickAnim - 7) / 3) * (0-(-2.49777)));
        }
        else if (tickAnim >= 10 && tickAnim < 12) {
            xx = 2.73 + (((tickAnim - 10) / 2) * (1.63644-(2.73)));
            yy = 0 + (((tickAnim - 10) / 2) * (-0.07144-(0)));
            zz = 0 + (((tickAnim - 10) / 2) * (2.49898-(0)));
        }
        else if (tickAnim >= 12 && tickAnim < 14) {
            xx = 1.63644 + (((tickAnim - 12) / 2) * (0-(1.63644)));
            yy = -0.07144 + (((tickAnim - 12) / 2) * (0-(-0.07144)));
            zz = 2.49898 + (((tickAnim - 12) / 2) * (0-(2.49898)));
        }
        else if (tickAnim >= 14 && tickAnim < 17) {
            xx = 0 + (((tickAnim - 14) / 3) * (0-(0)));
            yy = 0 + (((tickAnim - 14) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 14) / 3) * (-0.5-(0)));
        }
        else if (tickAnim >= 17 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 17) / 3) * (0-(0)));
            yy = 0 + (((tickAnim - 17) / 3) * (0-(0)));
            zz = -0.5 + (((tickAnim - 17) / 3) * (0-(-0.5)));
        }
        else if (tickAnim >= 20 && tickAnim < 275) {
            xx = 0 + (((tickAnim - 20) / 255) * (0-(0)));
            yy = 0 + (((tickAnim - 20) / 255) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 255) * (0-(0)));
        }
        else if (tickAnim >= 275 && tickAnim < 278) {
            xx = 0 + (((tickAnim - 275) / 3) * (0-(0)));
            yy = 0 + (((tickAnim - 275) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 275) / 3) * (1.5-(0)));
        }
        else if (tickAnim >= 278 && tickAnim < 281) {
            xx = 0 + (((tickAnim - 278) / 3) * (0-(0)));
            yy = 0 + (((tickAnim - 278) / 3) * (0-(0)));
            zz = 1.5 + (((tickAnim - 278) / 3) * (0-(1.5)));
        }
        else if (tickAnim >= 281 && tickAnim < 283) {
            xx = 0 + (((tickAnim - 281) / 2) * (-2.99715-(0)));
            yy = 0 + (((tickAnim - 281) / 2) * (0.1308-(0)));
            zz = 0 + (((tickAnim - 281) / 2) * (2.49658-(0)));
        }
        else if (tickAnim >= 283 && tickAnim < 286) {
            xx = -2.99715 + (((tickAnim - 283) / 3) * (-6.69886-(-2.99715)));
            yy = 0.1308 + (((tickAnim - 283) / 3) * (0.05232-(0.1308)));
            zz = 2.49658 + (((tickAnim - 283) / 3) * (0.99863-(2.49658)));
        }
        else if (tickAnim >= 286 && tickAnim < 288) {
            xx = -6.69886 + (((tickAnim - 286) / 2) * (-5-(-6.69886)));
            yy = 0.05232 + (((tickAnim - 286) / 2) * (0-(0.05232)));
            zz = 0.99863 + (((tickAnim - 286) / 2) * (0-(0.99863)));
        }
        else if (tickAnim >= 288 && tickAnim < 305) {
            xx = -5 + (((tickAnim - 288) / 17) * (-5-(-5)));
            yy = 0 + (((tickAnim - 288) / 17) * (0-(0)));
            zz = 0 + (((tickAnim - 288) / 17) * (0-(0)));
        }
        else if (tickAnim >= 305 && tickAnim < 315) {
            xx = -5 + (((tickAnim - 305) / 10) * (0-(-5)));
            yy = 0 + (((tickAnim - 305) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 305) / 10) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(main, main.rotateAngleX + (float) Math.toRadians(xx), main.rotateAngleY + (float) Math.toRadians(yy), main.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 0) / 5) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 5) * (-3-(0)));
            zz = 0 + (((tickAnim - 0) / 5) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 14) {
            xx = 0 + (((tickAnim - 5) / 9) * (0-(0)));
            yy = -3 + (((tickAnim - 5) / 9) * (-3.35-(-3)));
            zz = 0 + (((tickAnim - 5) / 9) * (0-(0)));
        }
        else if (tickAnim >= 14 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 14) / 6) * (0-(0)));
            yy = -3.35 + (((tickAnim - 14) / 6) * (-3.35-(-3.35)));
            zz = 0 + (((tickAnim - 14) / 6) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 275) {
            xx = 0 + (((tickAnim - 20) / 255) * (0-(0)));
            yy = -3.35 + (((tickAnim - 20) / 255) * (-3.35-(-3.35)));
            zz = 0 + (((tickAnim - 20) / 255) * (0-(0)));
        }
        else if (tickAnim >= 275 && tickAnim < 281) {
            xx = 0 + (((tickAnim - 275) / 6) * (0-(0)));
            yy = -3.35 + (((tickAnim - 275) / 6) * (-3.35-(-3.35)));
            zz = 0 + (((tickAnim - 275) / 6) * (0-(0)));
        }
        else if (tickAnim >= 281 && tickAnim < 288) {
            xx = 0 + (((tickAnim - 281) / 7) * (0-(0)));
            yy = -3.35 + (((tickAnim - 281) / 7) * (-3-(-3.35)));
            zz = 0 + (((tickAnim - 281) / 7) * (0-(0)));
        }
        else if (tickAnim >= 288 && tickAnim < 305) {
            xx = 0 + (((tickAnim - 288) / 17) * (0-(0)));
            yy = -3 + (((tickAnim - 288) / 17) * (-3-(-3)));
            zz = 0 + (((tickAnim - 288) / 17) * (0-(0)));
        }
        else if (tickAnim >= 305 && tickAnim < 315) {
            xx = 0 + (((tickAnim - 305) / 10) * (0-(0)));
            yy = -3 + (((tickAnim - 305) / 10) * (0-(-3)));
            zz = 0 + (((tickAnim - 305) / 10) * (0-(0)));
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
            xx = 0 + (((tickAnim - 0) / 5) * (-15-(0)));
            yy = 0 + (((tickAnim - 0) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 5) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 8) {
            xx = -15 + (((tickAnim - 5) / 3) * (13.45344-(-15)));
            yy = 0 + (((tickAnim - 5) / 3) * (-42.87499-(0)));
            zz = 0 + (((tickAnim - 5) / 3) * (-11.20122-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 14) {
            xx = 13.45344 + (((tickAnim - 8) / 6) * (23.11525-(13.45344)));
            yy = -42.87499 + (((tickAnim - 8) / 6) * (-44.93923-(-42.87499)));
            zz = -11.20122 + (((tickAnim - 8) / 6) * (-0.18735-(-11.20122)));
        }
        else if (tickAnim >= 14 && tickAnim < 20) {
            xx = 23.11525 + (((tickAnim - 14) / 6) * (23.11525-(23.11525)));
            yy = -44.93923 + (((tickAnim - 14) / 6) * (-44.93923-(-44.93923)));
            zz = -0.18735 + (((tickAnim - 14) / 6) * (-0.18735-(-0.18735)));
        }
        else if (tickAnim >= 20 && tickAnim < 275) {
            xx = 23.11525 + (((tickAnim - 20) / 255) * (23.11525-(23.11525)));
            yy = -44.93923 + (((tickAnim - 20) / 255) * (-44.93923-(-44.93923)));
            zz = -0.18735 + (((tickAnim - 20) / 255) * (-0.18735-(-0.18735)));
        }
        else if (tickAnim >= 275 && tickAnim < 283) {
            xx = 23.11525 + (((tickAnim - 275) / 8) * (15.40113-(23.11525)));
            yy = -44.93923 + (((tickAnim - 275) / 8) * (-49.76258-(-44.93923)));
            zz = -0.18735 + (((tickAnim - 275) / 8) * (-11.26997-(-0.18735)));
        }
        else if (tickAnim >= 283 && tickAnim < 289) {
            xx = 15.40113 + (((tickAnim - 283) / 6) * (-14.77905-(15.40113)));
            yy = -49.76258 + (((tickAnim - 283) / 6) * (7.85993-(-49.76258)));
            zz = -11.26997 + (((tickAnim - 283) / 6) * (0.83067-(-11.26997)));
        }
        else if (tickAnim >= 289 && tickAnim < 297) {
            xx = -14.77905 + (((tickAnim - 289) / 8) * (-19.88371-(-14.77905)));
            yy = 7.85993 + (((tickAnim - 289) / 8) * (4.13679-(7.85993)));
            zz = 0.83067 + (((tickAnim - 289) / 8) * (0.43719-(0.83067)));
        }
        else if (tickAnim >= 297 && tickAnim < 305) {
            xx = -19.88371 + (((tickAnim - 297) / 8) * (-15-(-19.88371)));
            yy = 4.13679 + (((tickAnim - 297) / 8) * (0-(4.13679)));
            zz = 0.43719 + (((tickAnim - 297) / 8) * (0-(0.43719)));
        }
        else if (tickAnim >= 305 && tickAnim < 315) {
            xx = -15 + (((tickAnim - 305) / 10) * (0-(-15)));
            yy = 0 + (((tickAnim - 305) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 305) / 10) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck, neck.rotateAngleX + (float) Math.toRadians(xx), neck.rotateAngleY + (float) Math.toRadians(yy), neck.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 14) {
            xx = 0 + (((tickAnim - 0) / 14) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 14) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 14) * (1.7-(0)));
        }
        else if (tickAnim >= 14 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 14) / 6) * (0-(0)));
            yy = 0 + (((tickAnim - 14) / 6) * (0-(0)));
            zz = 1.7 + (((tickAnim - 14) / 6) * (1.7-(1.7)));
        }
        else if (tickAnim >= 20 && tickAnim < 275) {
            xx = 0 + (((tickAnim - 20) / 255) * (0-(0)));
            yy = 0 + (((tickAnim - 20) / 255) * (0-(0)));
            zz = 1.7 + (((tickAnim - 20) / 255) * (1.7-(1.7)));
        }
        else if (tickAnim >= 275 && tickAnim < 315) {
            xx = 0 + (((tickAnim - 275) / 40) * (0-(0)));
            yy = 0 + (((tickAnim - 275) / 40) * (0-(0)));
            zz = 1.7 + (((tickAnim - 275) / 40) * (0-(1.7)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.neck.rotationPointX = this.neck.rotationPointX + (float)(xx);
        this.neck.rotationPointY = this.neck.rotationPointY - (float)(yy);
        this.neck.rotationPointZ = this.neck.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 0) / 5) * (-10-(0)));
            yy = 0 + (((tickAnim - 0) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 5) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 14) {
            xx = -10 + (((tickAnim - 5) / 9) * (-5.85472-(-10)));
            yy = 0 + (((tickAnim - 5) / 9) * (-33.5504-(0)));
            zz = 0 + (((tickAnim - 5) / 9) * (-0.58298-(0)));
        }
        else if (tickAnim >= 14 && tickAnim < 20) {
            xx = -5.85472 + (((tickAnim - 14) / 6) * (-5.85472-(-5.85472)));
            yy = -33.5504 + (((tickAnim - 14) / 6) * (-33.5504-(-33.5504)));
            zz = -0.58298 + (((tickAnim - 14) / 6) * (-0.58298-(-0.58298)));
        }
        else if (tickAnim >= 20 && tickAnim < 275) {
            xx = -5.85472 + (((tickAnim - 20) / 255) * (-5.85472-(-5.85472)));
            yy = -33.5504 + (((tickAnim - 20) / 255) * (-33.5504-(-33.5504)));
            zz = -0.58298 + (((tickAnim - 20) / 255) * (-0.58298-(-0.58298)));
        }
        else if (tickAnim >= 275 && tickAnim < 289) {
            xx = -5.85472 + (((tickAnim - 275) / 14) * (5.22074-(-5.85472)));
            yy = -33.5504 + (((tickAnim - 275) / 14) * (9.65594-(-33.5504)));
            zz = -0.58298 + (((tickAnim - 275) / 14) * (2.61298-(-0.58298)));
        }
        else if (tickAnim >= 289 && tickAnim < 305) {
            xx = 5.22074 + (((tickAnim - 289) / 16) * (-10-(5.22074)));
            yy = 9.65594 + (((tickAnim - 289) / 16) * (0-(9.65594)));
            zz = 2.61298 + (((tickAnim - 289) / 16) * (0-(2.61298)));
        }
        else if (tickAnim >= 305 && tickAnim < 315) {
            xx = -10 + (((tickAnim - 305) / 10) * (0-(-10)));
            yy = 0 + (((tickAnim - 305) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 305) / 10) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(head, head.rotateAngleX + (float) Math.toRadians(xx), head.rotateAngleY + (float) Math.toRadians(yy), head.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 14) {
            xx = 0 + (((tickAnim - 0) / 14) * (-0.25-(0)));
            yy = 0 + (((tickAnim - 0) / 14) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 14) * (1.775-(0)));
        }
        else if (tickAnim >= 14 && tickAnim < 20) {
            xx = -0.25 + (((tickAnim - 14) / 6) * (-0.25-(-0.25)));
            yy = 0 + (((tickAnim - 14) / 6) * (0-(0)));
            zz = 1.775 + (((tickAnim - 14) / 6) * (1.775-(1.775)));
        }
        else if (tickAnim >= 20 && tickAnim < 275) {
            xx = -0.25 + (((tickAnim - 20) / 255) * (-0.25-(-0.25)));
            yy = 0 + (((tickAnim - 20) / 255) * (0-(0)));
            zz = 1.775 + (((tickAnim - 20) / 255) * (1.775-(1.775)));
        }
        else if (tickAnim >= 275 && tickAnim < 315) {
            xx = -0.25 + (((tickAnim - 275) / 40) * (0-(-0.25)));
            yy = 0 + (((tickAnim - 275) / 40) * (0-(0)));
            zz = 1.775 + (((tickAnim - 275) / 40) * (0-(1.775)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.head.rotationPointX = this.head.rotationPointX + (float)(xx);
        this.head.rotationPointY = this.head.rotationPointY - (float)(yy);
        this.head.rotationPointZ = this.head.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 0) / 5) * (-0.19053-(0)));
            yy = 0 + (((tickAnim - 0) / 5) * (46.46328-(0)));
            zz = 0 + (((tickAnim - 0) / 5) * (-43.0358-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 11) {
            xx = -0.19053 + (((tickAnim - 5) / 6) * (-60.04162-(-0.19053)));
            yy = 46.46328 + (((tickAnim - 5) / 6) * (44.93721-(46.46328)));
            zz = -43.0358 + (((tickAnim - 5) / 6) * (-45.02163-(-43.0358)));
        }
        else if (tickAnim >= 11 && tickAnim < 20) {
            xx = -60.04162 + (((tickAnim - 11) / 9) * (-60.04162-(-60.04162)));
            yy = 44.93721 + (((tickAnim - 11) / 9) * (44.93721-(44.93721)));
            zz = -45.02163 + (((tickAnim - 11) / 9) * (-45.02163-(-45.02163)));
        }
        else if (tickAnim >= 20 && tickAnim < 275) {
            xx = -60.04162 + (((tickAnim - 20) / 255) * (-60.04162-(-60.04162)));
            yy = 44.93721 + (((tickAnim - 20) / 255) * (44.93721-(44.93721)));
            zz = -45.02163 + (((tickAnim - 20) / 255) * (-45.02163-(-45.02163)));
        }
        else if (tickAnim >= 275 && tickAnim < 285) {
            xx = -60.04162 + (((tickAnim - 275) / 10) * (-0.19053-(-60.04162)));
            yy = 44.93721 + (((tickAnim - 275) / 10) * (46.46328-(44.93721)));
            zz = -45.02163 + (((tickAnim - 275) / 10) * (-43.0358-(-45.02163)));
        }
        else if (tickAnim >= 285 && tickAnim < 305) {
            xx = -0.19053 + (((tickAnim - 285) / 20) * (-0.19053-(-0.19053)));
            yy = 46.46328 + (((tickAnim - 285) / 20) * (46.46328-(46.46328)));
            zz = -43.0358 + (((tickAnim - 285) / 20) * (-43.0358-(-43.0358)));
        }
        else if (tickAnim >= 305 && tickAnim < 315) {
            xx = -0.19053 + (((tickAnim - 305) / 10) * (0-(-0.19053)));
            yy = 46.46328 + (((tickAnim - 305) / 10) * (0-(46.46328)));
            zz = -43.0358 + (((tickAnim - 305) / 10) * (0-(-43.0358)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(frontleftleg, frontleftleg.rotateAngleX + (float) Math.toRadians(xx), frontleftleg.rotateAngleY + (float) Math.toRadians(yy), frontleftleg.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 0) / 5) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 5) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 11) {
            xx = 0 + (((tickAnim - 5) / 6) * (1-(0)));
            yy = 0 + (((tickAnim - 5) / 6) * (-1-(0)));
            zz = 0 + (((tickAnim - 5) / 6) * (4-(0)));
        }
        else if (tickAnim >= 11 && tickAnim < 20) {
            xx = 1 + (((tickAnim - 11) / 9) * (1-(1)));
            yy = -1 + (((tickAnim - 11) / 9) * (-1-(-1)));
            zz = 4 + (((tickAnim - 11) / 9) * (4-(4)));
        }
        else if (tickAnim >= 20 && tickAnim < 275) {
            xx = 1 + (((tickAnim - 20) / 255) * (1-(1)));
            yy = -1 + (((tickAnim - 20) / 255) * (-1-(-1)));
            zz = 4 + (((tickAnim - 20) / 255) * (4-(4)));
        }
        else if (tickAnim >= 275 && tickAnim < 285) {
            xx = 1 + (((tickAnim - 275) / 10) * (0-(1)));
            yy = -1 + (((tickAnim - 275) / 10) * (0-(-1)));
            zz = 4 + (((tickAnim - 275) / 10) * (0-(4)));
        }
        else if (tickAnim >= 285 && tickAnim < 305) {
            xx = 0 + (((tickAnim - 285) / 20) * (0-(0)));
            yy = 0 + (((tickAnim - 285) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 285) / 20) * (0-(0)));
        }
        else if (tickAnim >= 305 && tickAnim < 315) {
            xx = 0 + (((tickAnim - 305) / 10) * (0-(0)));
            yy = 0 + (((tickAnim - 305) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 305) / 10) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.frontleftleg.rotationPointX = this.frontleftleg.rotationPointX + (float)(xx);
        this.frontleftleg.rotationPointY = this.frontleftleg.rotationPointY - (float)(yy);
        this.frontleftleg.rotationPointZ = this.frontleftleg.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 0) / 5) * (16.20309-(0)));
            yy = 0 + (((tickAnim - 0) / 5) * (3.06523-(0)));
            zz = 0 + (((tickAnim - 0) / 5) * (12.89167-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 11) {
            xx = 16.20309 + (((tickAnim - 5) / 6) * (57.0939-(16.20309)));
            yy = 3.06523 + (((tickAnim - 5) / 6) * (-4.17252-(3.06523)));
            zz = 12.89167 + (((tickAnim - 5) / 6) * (40.97682-(12.89167)));
        }
        else if (tickAnim >= 11 && tickAnim < 20) {
            xx = 57.0939 + (((tickAnim - 11) / 9) * (57.0939-(57.0939)));
            yy = -4.17252 + (((tickAnim - 11) / 9) * (-4.17252-(-4.17252)));
            zz = 40.97682 + (((tickAnim - 11) / 9) * (40.97682-(40.97682)));
        }
        else if (tickAnim >= 20 && tickAnim < 275) {
            xx = 57.0939 + (((tickAnim - 20) / 255) * (57.0939-(57.0939)));
            yy = -4.17252 + (((tickAnim - 20) / 255) * (-4.17252-(-4.17252)));
            zz = 40.97682 + (((tickAnim - 20) / 255) * (40.97682-(40.97682)));
        }
        else if (tickAnim >= 275 && tickAnim < 285) {
            xx = 57.0939 + (((tickAnim - 275) / 10) * (16.20309-(57.0939)));
            yy = -4.17252 + (((tickAnim - 275) / 10) * (3.06523-(-4.17252)));
            zz = 40.97682 + (((tickAnim - 275) / 10) * (12.89167-(40.97682)));
        }
        else if (tickAnim >= 285 && tickAnim < 305) {
            xx = 16.20309 + (((tickAnim - 285) / 20) * (16.20309-(16.20309)));
            yy = 3.06523 + (((tickAnim - 285) / 20) * (3.06523-(3.06523)));
            zz = 12.89167 + (((tickAnim - 285) / 20) * (12.89167-(12.89167)));
        }
        else if (tickAnim >= 305 && tickAnim < 315) {
            xx = 16.20309 + (((tickAnim - 305) / 10) * (0-(16.20309)));
            yy = 3.06523 + (((tickAnim - 305) / 10) * (0-(3.06523)));
            zz = 12.89167 + (((tickAnim - 305) / 10) * (0-(12.89167)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(frontleftleg2, frontleftleg2.rotateAngleX + (float) Math.toRadians(xx), frontleftleg2.rotateAngleY + (float) Math.toRadians(yy), frontleftleg2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 0) / 5) * (-24.13272-(0)));
            yy = 0 + (((tickAnim - 0) / 5) * (34.71167-(0)));
            zz = 0 + (((tickAnim - 0) / 5) * (9.84164-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 8) {
            xx = -24.13272 + (((tickAnim - 5) / 3) * (128.32036-(-24.13272)));
            yy = 34.71167 + (((tickAnim - 5) / 3) * (18.47143-(34.71167)));
            zz = 9.84164 + (((tickAnim - 5) / 3) * (36.23137-(9.84164)));
        }
        else if (tickAnim >= 8 && tickAnim < 11) {
            xx = 128.32036 + (((tickAnim - 8) / 3) * (140.87613-(128.32036)));
            yy = 18.47143 + (((tickAnim - 8) / 3) * (20.08488-(18.47143)));
            zz = 36.23137 + (((tickAnim - 8) / 3) * (35.83554-(36.23137)));
        }
        else if (tickAnim >= 11 && tickAnim < 20) {
            xx = 140.87613 + (((tickAnim - 11) / 9) * (140.87613-(140.87613)));
            yy = 20.08488 + (((tickAnim - 11) / 9) * (20.08488-(20.08488)));
            zz = 35.83554 + (((tickAnim - 11) / 9) * (35.83554-(35.83554)));
        }
        else if (tickAnim >= 20 && tickAnim < 275) {
            xx = 140.87613 + (((tickAnim - 20) / 255) * (140.87613-(140.87613)));
            yy = 20.08488 + (((tickAnim - 20) / 255) * (20.08488-(20.08488)));
            zz = 35.83554 + (((tickAnim - 20) / 255) * (35.83554-(35.83554)));
        }
        else if (tickAnim >= 275 && tickAnim < 285) {
            xx = 140.87613 + (((tickAnim - 275) / 10) * (-24.13272-(140.87613)));
            yy = 20.08488 + (((tickAnim - 275) / 10) * (34.71167-(20.08488)));
            zz = 35.83554 + (((tickAnim - 275) / 10) * (9.84164-(35.83554)));
        }
        else if (tickAnim >= 285 && tickAnim < 305) {
            xx = -24.13272 + (((tickAnim - 285) / 20) * (-24.13272-(-24.13272)));
            yy = 34.71167 + (((tickAnim - 285) / 20) * (34.71167-(34.71167)));
            zz = 9.84164 + (((tickAnim - 285) / 20) * (9.84164-(9.84164)));
        }
        else if (tickAnim >= 305 && tickAnim < 315) {
            xx = -24.13272 + (((tickAnim - 305) / 10) * (0-(-24.13272)));
            yy = 34.71167 + (((tickAnim - 305) / 10) * (0-(34.71167)));
            zz = 9.84164 + (((tickAnim - 305) / 10) * (0-(9.84164)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(frontleftleg3, frontleftleg3.rotateAngleX + (float) Math.toRadians(xx), frontleftleg3.rotateAngleY + (float) Math.toRadians(yy), frontleftleg3.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 0) / 5) * (-0.19053-(0)));
            yy = 0 + (((tickAnim - 0) / 5) * (-46.46328-(0)));
            zz = 0 + (((tickAnim - 0) / 5) * (43.0358-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 11) {
            xx = -0.19053 + (((tickAnim - 5) / 6) * (-60.04162-(-0.19053)));
            yy = -46.46328 + (((tickAnim - 5) / 6) * (-44.93721-(-46.46328)));
            zz = 43.0358 + (((tickAnim - 5) / 6) * (45.02163-(43.0358)));
        }
        else if (tickAnim >= 11 && tickAnim < 20) {
            xx = -60.04162 + (((tickAnim - 11) / 9) * (-60.04162-(-60.04162)));
            yy = -44.93721 + (((tickAnim - 11) / 9) * (-44.93721-(-44.93721)));
            zz = 45.02163 + (((tickAnim - 11) / 9) * (45.02163-(45.02163)));
        }
        else if (tickAnim >= 20 && tickAnim < 275) {
            xx = -60.04162 + (((tickAnim - 20) / 255) * (-60.04162-(-60.04162)));
            yy = -44.93721 + (((tickAnim - 20) / 255) * (-44.93721-(-44.93721)));
            zz = 45.02163 + (((tickAnim - 20) / 255) * (45.02163-(45.02163)));
        }
        else if (tickAnim >= 275 && tickAnim < 282) {
            xx = -60.04162 + (((tickAnim - 275) / 7) * (-18.43484-(-60.04162)));
            yy = -44.93721 + (((tickAnim - 275) / 7) * (-47.67513-(-44.93721)));
            zz = 45.02163 + (((tickAnim - 275) / 7) * (73.69693-(45.02163)));
        }
        else if (tickAnim >= 282 && tickAnim < 287) {
            xx = -18.43484 + (((tickAnim - 282) / 5) * (-9.29433-(-18.43484)));
            yy = -47.67513 + (((tickAnim - 282) / 5) * (-54.43925-(-47.67513)));
            zz = 73.69693 + (((tickAnim - 282) / 5) * (56.97516-(73.69693)));
        }
        else if (tickAnim >= 287 && tickAnim < 292) {
            xx = -9.29433 + (((tickAnim - 287) / 5) * (-0.19053-(-9.29433)));
            yy = -54.43925 + (((tickAnim - 287) / 5) * (-46.46328-(-54.43925)));
            zz = 56.97516 + (((tickAnim - 287) / 5) * (43.0358-(56.97516)));
        }
        else if (tickAnim >= 292 && tickAnim < 305) {
            xx = -0.19053 + (((tickAnim - 292) / 13) * (-0.19053-(-0.19053)));
            yy = -46.46328 + (((tickAnim - 292) / 13) * (-46.46328-(-46.46328)));
            zz = 43.0358 + (((tickAnim - 292) / 13) * (43.0358-(43.0358)));
        }
        else if (tickAnim >= 305 && tickAnim < 315) {
            xx = -0.19053 + (((tickAnim - 305) / 10) * (0-(-0.19053)));
            yy = -46.46328 + (((tickAnim - 305) / 10) * (0-(-46.46328)));
            zz = 43.0358 + (((tickAnim - 305) / 10) * (0-(43.0358)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(frontrightleg, frontrightleg.rotateAngleX + (float) Math.toRadians(xx), frontrightleg.rotateAngleY + (float) Math.toRadians(yy), frontrightleg.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 0) / 5) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 5) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 11) {
            xx = 0 + (((tickAnim - 5) / 6) * (-1-(0)));
            yy = 0 + (((tickAnim - 5) / 6) * (-1-(0)));
            zz = 0 + (((tickAnim - 5) / 6) * (4-(0)));
        }
        else if (tickAnim >= 11 && tickAnim < 20) {
            xx = -1 + (((tickAnim - 11) / 9) * (-1-(-1)));
            yy = -1 + (((tickAnim - 11) / 9) * (-1-(-1)));
            zz = 4 + (((tickAnim - 11) / 9) * (4-(4)));
        }
        else if (tickAnim >= 20 && tickAnim < 275) {
            xx = -1 + (((tickAnim - 20) / 255) * (-1-(-1)));
            yy = -1 + (((tickAnim - 20) / 255) * (-1-(-1)));
            zz = 4 + (((tickAnim - 20) / 255) * (4-(4)));
        }
        else if (tickAnim >= 275 && tickAnim < 292) {
            xx = -1 + (((tickAnim - 275) / 17) * (0-(-1)));
            yy = -1 + (((tickAnim - 275) / 17) * (0-(-1)));
            zz = 4 + (((tickAnim - 275) / 17) * (0-(4)));
        }
        else if (tickAnim >= 292 && tickAnim < 305) {
            xx = 0 + (((tickAnim - 292) / 13) * (0-(0)));
            yy = 0 + (((tickAnim - 292) / 13) * (0-(0)));
            zz = 0 + (((tickAnim - 292) / 13) * (0-(0)));
        }
        else if (tickAnim >= 305 && tickAnim < 315) {
            xx = 0 + (((tickAnim - 305) / 10) * (0-(0)));
            yy = 0 + (((tickAnim - 305) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 305) / 10) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.frontrightleg.rotationPointX = this.frontrightleg.rotationPointX + (float)(xx);
        this.frontrightleg.rotationPointY = this.frontrightleg.rotationPointY - (float)(yy);
        this.frontrightleg.rotationPointZ = this.frontrightleg.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 0) / 5) * (16.20309-(0)));
            yy = 0 + (((tickAnim - 0) / 5) * (-3.06523-(0)));
            zz = 0 + (((tickAnim - 0) / 5) * (-12.89167-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 11) {
            xx = 16.20309 + (((tickAnim - 5) / 6) * (57.0939-(16.20309)));
            yy = -3.06523 + (((tickAnim - 5) / 6) * (4.17252-(-3.06523)));
            zz = -12.89167 + (((tickAnim - 5) / 6) * (-40.97682-(-12.89167)));
        }
        else if (tickAnim >= 11 && tickAnim < 20) {
            xx = 57.0939 + (((tickAnim - 11) / 9) * (57.0939-(57.0939)));
            yy = 4.17252 + (((tickAnim - 11) / 9) * (4.17252-(4.17252)));
            zz = -40.97682 + (((tickAnim - 11) / 9) * (-40.97682-(-40.97682)));
        }
        else if (tickAnim >= 20 && tickAnim < 275) {
            xx = 57.0939 + (((tickAnim - 20) / 255) * (57.0939-(57.0939)));
            yy = 4.17252 + (((tickAnim - 20) / 255) * (4.17252-(4.17252)));
            zz = -40.97682 + (((tickAnim - 20) / 255) * (-40.97682-(-40.97682)));
        }
        else if (tickAnim >= 275 && tickAnim < 285) {
            xx = 57.0939 + (((tickAnim - 275) / 10) * (16.20309-(57.0939)));
            yy = 4.17252 + (((tickAnim - 275) / 10) * (-3.06523-(4.17252)));
            zz = -40.97682 + (((tickAnim - 275) / 10) * (-12.89167-(-40.97682)));
        }
        else if (tickAnim >= 285 && tickAnim < 305) {
            xx = 16.20309 + (((tickAnim - 285) / 20) * (16.20309-(16.20309)));
            yy = -3.06523 + (((tickAnim - 285) / 20) * (-3.06523-(-3.06523)));
            zz = -12.89167 + (((tickAnim - 285) / 20) * (-12.89167-(-12.89167)));
        }
        else if (tickAnim >= 305 && tickAnim < 315) {
            xx = 16.20309 + (((tickAnim - 305) / 10) * (0-(16.20309)));
            yy = -3.06523 + (((tickAnim - 305) / 10) * (0-(-3.06523)));
            zz = -12.89167 + (((tickAnim - 305) / 10) * (0-(-12.89167)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(frontrightleg2, frontrightleg2.rotateAngleX + (float) Math.toRadians(xx), frontrightleg2.rotateAngleY + (float) Math.toRadians(yy), frontrightleg2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 0) / 5) * (-24.13272-(0)));
            yy = 0 + (((tickAnim - 0) / 5) * (-34.71167-(0)));
            zz = 0 + (((tickAnim - 0) / 5) * (-9.84164-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 8) {
            xx = -24.13272 + (((tickAnim - 5) / 3) * (128.32036-(-24.13272)));
            yy = -34.71167 + (((tickAnim - 5) / 3) * (-18.47143-(-34.71167)));
            zz = -9.84164 + (((tickAnim - 5) / 3) * (-36.23137-(-9.84164)));
        }
        else if (tickAnim >= 8 && tickAnim < 11) {
            xx = 128.32036 + (((tickAnim - 8) / 3) * (140.87613-(128.32036)));
            yy = -18.47143 + (((tickAnim - 8) / 3) * (-20.08488-(-18.47143)));
            zz = -36.23137 + (((tickAnim - 8) / 3) * (-35.83554-(-36.23137)));
        }
        else if (tickAnim >= 11 && tickAnim < 20) {
            xx = 140.87613 + (((tickAnim - 11) / 9) * (140.87613-(140.87613)));
            yy = -20.08488 + (((tickAnim - 11) / 9) * (-20.08488-(-20.08488)));
            zz = -35.83554 + (((tickAnim - 11) / 9) * (-35.83554-(-35.83554)));
        }
        else if (tickAnim >= 20 && tickAnim < 275) {
            xx = 140.87613 + (((tickAnim - 20) / 255) * (140.87613-(140.87613)));
            yy = -20.08488 + (((tickAnim - 20) / 255) * (-20.08488-(-20.08488)));
            zz = -35.83554 + (((tickAnim - 20) / 255) * (-35.83554-(-35.83554)));
        }
        else if (tickAnim >= 275 && tickAnim < 285) {
            xx = 140.87613 + (((tickAnim - 275) / 10) * (-24.13272-(140.87613)));
            yy = -20.08488 + (((tickAnim - 275) / 10) * (-34.71167-(-20.08488)));
            zz = -35.83554 + (((tickAnim - 275) / 10) * (-9.84164-(-35.83554)));
        }
        else if (tickAnim >= 285 && tickAnim < 305) {
            xx = -24.13272 + (((tickAnim - 285) / 20) * (-24.13272-(-24.13272)));
            yy = -34.71167 + (((tickAnim - 285) / 20) * (-34.71167-(-34.71167)));
            zz = -9.84164 + (((tickAnim - 285) / 20) * (-9.84164-(-9.84164)));
        }
        else if (tickAnim >= 305 && tickAnim < 315) {
            xx = -24.13272 + (((tickAnim - 305) / 10) * (0-(-24.13272)));
            yy = -34.71167 + (((tickAnim - 305) / 10) * (0-(-34.71167)));
            zz = -9.84164 + (((tickAnim - 305) / 10) * (0-(-9.84164)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(frontrightleg3, frontrightleg3.rotateAngleX + (float) Math.toRadians(xx), frontrightleg3.rotateAngleY + (float) Math.toRadians(yy), frontrightleg3.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 0 + (((tickAnim - 0) / 3) * (42.37626-(0)));
            yy = 0 + (((tickAnim - 0) / 3) * (-24.36961-(0)));
            zz = 0 + (((tickAnim - 0) / 3) * (41.65989-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 5) {
            xx = 42.37626 + (((tickAnim - 3) / 2) * (64.75252-(42.37626)));
            yy = -24.36961 + (((tickAnim - 3) / 2) * (-48.73922-(-24.36961)));
            zz = 41.65989 + (((tickAnim - 3) / 2) * (83.31978-(41.65989)));
        }
        else if (tickAnim >= 5 && tickAnim < 10) {
            xx = 64.75252 + (((tickAnim - 5) / 5) * (95.65166-(64.75252)));
            yy = -48.73922 + (((tickAnim - 5) / 5) * (-36.72154-(-48.73922)));
            zz = 83.31978 + (((tickAnim - 5) / 5) * (79.52099-(83.31978)));
        }
        else if (tickAnim >= 10 && tickAnim < 20) {
            xx = 95.65166 + (((tickAnim - 10) / 10) * (95.65166-(95.65166)));
            yy = -36.72154 + (((tickAnim - 10) / 10) * (-36.72154-(-36.72154)));
            zz = 79.52099 + (((tickAnim - 10) / 10) * (79.52099-(79.52099)));
        }
        else if (tickAnim >= 20 && tickAnim < 275) {
            xx = 95.65166 + (((tickAnim - 20) / 255) * (95.65166-(95.65166)));
            yy = -36.72154 + (((tickAnim - 20) / 255) * (-36.72154-(-36.72154)));
            zz = 79.52099 + (((tickAnim - 20) / 255) * (79.52099-(79.52099)));
        }
        else if (tickAnim >= 275 && tickAnim < 287) {
            xx = 95.65166 + (((tickAnim - 275) / 12) * (64.75252-(95.65166)));
            yy = -36.72154 + (((tickAnim - 275) / 12) * (-48.73922-(-36.72154)));
            zz = 79.52099 + (((tickAnim - 275) / 12) * (83.31978-(79.52099)));
        }
        else if (tickAnim >= 287 && tickAnim < 305) {
            xx = 64.75252 + (((tickAnim - 287) / 18) * (64.75252-(64.75252)));
            yy = -48.73922 + (((tickAnim - 287) / 18) * (-48.73922-(-48.73922)));
            zz = 83.31978 + (((tickAnim - 287) / 18) * (83.31978-(83.31978)));
        }
        else if (tickAnim >= 305 && tickAnim < 310) {
            xx = 64.75252 + (((tickAnim - 305) / 5) * (42.37626-(64.75252)));
            yy = -48.73922 + (((tickAnim - 305) / 5) * (-24.36961-(-48.73922)));
            zz = 83.31978 + (((tickAnim - 305) / 5) * (41.65989-(83.31978)));
        }
        else if (tickAnim >= 310 && tickAnim < 315) {
            xx = 42.37626 + (((tickAnim - 310) / 5) * (0-(42.37626)));
            yy = -24.36961 + (((tickAnim - 310) / 5) * (0-(-24.36961)));
            zz = 41.65989 + (((tickAnim - 310) / 5) * (0-(41.65989)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(backleftleg, backleftleg.rotateAngleX + (float) Math.toRadians(xx), backleftleg.rotateAngleY + (float) Math.toRadians(yy), backleftleg.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 0) / 5) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 5) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 5) / 5) * (-3.5-(0)));
            yy = 0 + (((tickAnim - 5) / 5) * (-0.5-(0)));
            zz = 0 + (((tickAnim - 5) / 5) * (-2-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 20) {
            xx = -3.5 + (((tickAnim - 10) / 10) * (-3.5-(-3.5)));
            yy = -0.5 + (((tickAnim - 10) / 10) * (-0.5-(-0.5)));
            zz = -2 + (((tickAnim - 10) / 10) * (-2-(-2)));
        }
        else if (tickAnim >= 20 && tickAnim < 275) {
            xx = -3.5 + (((tickAnim - 20) / 255) * (-3.5-(-3.5)));
            yy = -0.5 + (((tickAnim - 20) / 255) * (-0.5-(-0.5)));
            zz = -2 + (((tickAnim - 20) / 255) * (-2-(-2)));
        }
        else if (tickAnim >= 275 && tickAnim < 287) {
            xx = -3.5 + (((tickAnim - 275) / 12) * (0-(-3.5)));
            yy = -0.5 + (((tickAnim - 275) / 12) * (0-(-0.5)));
            zz = -2 + (((tickAnim - 275) / 12) * (0-(-2)));
        }
        else if (tickAnim >= 287 && tickAnim < 305) {
            xx = 0 + (((tickAnim - 287) / 18) * (0-(0)));
            yy = 0 + (((tickAnim - 287) / 18) * (0-(0)));
            zz = 0 + (((tickAnim - 287) / 18) * (0-(0)));
        }
        else if (tickAnim >= 305 && tickAnim < 315) {
            xx = 0 + (((tickAnim - 305) / 10) * (0-(0)));
            yy = 0 + (((tickAnim - 305) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 305) / 10) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.backleftleg.rotationPointX = this.backleftleg.rotationPointX + (float)(xx);
        this.backleftleg.rotationPointY = this.backleftleg.rotationPointY - (float)(yy);
        this.backleftleg.rotationPointZ = this.backleftleg.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 0) / 5) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 5) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 5) / 5) * (-57.5-(0)));
            yy = 0 + (((tickAnim - 5) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 5) / 5) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 20) {
            xx = -57.5 + (((tickAnim - 10) / 10) * (-57.5-(-57.5)));
            yy = 0 + (((tickAnim - 10) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 10) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 275) {
            xx = -57.5 + (((tickAnim - 20) / 255) * (-57.5-(-57.5)));
            yy = 0 + (((tickAnim - 20) / 255) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 255) * (0-(0)));
        }
        else if (tickAnim >= 275 && tickAnim < 287) {
            xx = -57.5 + (((tickAnim - 275) / 12) * (0-(-57.5)));
            yy = 0 + (((tickAnim - 275) / 12) * (0-(0)));
            zz = 0 + (((tickAnim - 275) / 12) * (0-(0)));
        }
        else if (tickAnim >= 287 && tickAnim < 305) {
            xx = 0 + (((tickAnim - 287) / 18) * (0-(0)));
            yy = 0 + (((tickAnim - 287) / 18) * (0-(0)));
            zz = 0 + (((tickAnim - 287) / 18) * (0-(0)));
        }
        else if (tickAnim >= 305 && tickAnim < 315) {
            xx = 0 + (((tickAnim - 305) / 10) * (0-(0)));
            yy = 0 + (((tickAnim - 305) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 305) / 10) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(backleftleg2, backleftleg2.rotateAngleX + (float) Math.toRadians(xx), backleftleg2.rotateAngleY + (float) Math.toRadians(yy), backleftleg2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 0) / 5) * (44.99412-(0)));
            yy = 0 + (((tickAnim - 0) / 5) * (53.19349-(0)));
            zz = 0 + (((tickAnim - 0) / 5) * (-55.40601-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 11) {
            xx = 44.99412 + (((tickAnim - 5) / 6) * (44.99412-(44.99412)));
            yy = 53.19349 + (((tickAnim - 5) / 6) * (53.19349-(53.19349)));
            zz = -55.40601 + (((tickAnim - 5) / 6) * (-55.40601-(-55.40601)));
        }
        else if (tickAnim >= 11 && tickAnim < 275) {
            xx = 44.99412 + (((tickAnim - 11) / 264) * (44.99412-(44.99412)));
            yy = 53.19349 + (((tickAnim - 11) / 264) * (53.19349-(53.19349)));
            zz = -55.40601 + (((tickAnim - 11) / 264) * (-55.40601-(-55.40601)));
        }
        else if (tickAnim >= 275 && tickAnim < 287) {
            xx = 44.99412 + (((tickAnim - 275) / 12) * (44.99412-(44.99412)));
            yy = 53.19349 + (((tickAnim - 275) / 12) * (53.19349-(53.19349)));
            zz = -55.40601 + (((tickAnim - 275) / 12) * (-55.40601-(-55.40601)));
        }
        else if (tickAnim >= 287 && tickAnim < 305) {
            xx = 44.99412 + (((tickAnim - 287) / 18) * (44.99412-(44.99412)));
            yy = 53.19349 + (((tickAnim - 287) / 18) * (53.19349-(53.19349)));
            zz = -55.40601 + (((tickAnim - 287) / 18) * (-55.40601-(-55.40601)));
        }
        else if (tickAnim >= 305 && tickAnim < 315) {
            xx = 44.99412 + (((tickAnim - 305) / 10) * (0-(44.99412)));
            yy = 53.19349 + (((tickAnim - 305) / 10) * (0-(53.19349)));
            zz = -55.40601 + (((tickAnim - 305) / 10) * (0-(-55.40601)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(backleftleg3, backleftleg3.rotateAngleX + (float) Math.toRadians(xx), backleftleg3.rotateAngleY + (float) Math.toRadians(yy), backleftleg3.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 0 + (((tickAnim - 0) / 3) * (42.87626-(0)));
            yy = 0 + (((tickAnim - 0) / 3) * (24.36961-(0)));
            zz = 0 + (((tickAnim - 0) / 3) * (-41.65989-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 5) {
            xx = 42.87626 + (((tickAnim - 3) / 2) * (64.75252-(42.87626)));
            yy = 24.36961 + (((tickAnim - 3) / 2) * (48.73922-(24.36961)));
            zz = -41.65989 + (((tickAnim - 3) / 2) * (-83.31978-(-41.65989)));
        }
        else if (tickAnim >= 5 && tickAnim < 10) {
            xx = 64.75252 + (((tickAnim - 5) / 5) * (95.65166-(64.75252)));
            yy = 48.73922 + (((tickAnim - 5) / 5) * (36.72154-(48.73922)));
            zz = -83.31978 + (((tickAnim - 5) / 5) * (-79.52099-(-83.31978)));
        }
        else if (tickAnim >= 10 && tickAnim < 20) {
            xx = 95.65166 + (((tickAnim - 10) / 10) * (95.65166-(95.65166)));
            yy = 36.72154 + (((tickAnim - 10) / 10) * (36.72154-(36.72154)));
            zz = -79.52099 + (((tickAnim - 10) / 10) * (-79.52099-(-79.52099)));
        }
        else if (tickAnim >= 20 && tickAnim < 275) {
            xx = 95.65166 + (((tickAnim - 20) / 255) * (95.65166-(95.65166)));
            yy = 36.72154 + (((tickAnim - 20) / 255) * (36.72154-(36.72154)));
            zz = -79.52099 + (((tickAnim - 20) / 255) * (-79.52099-(-79.52099)));
        }
        else if (tickAnim >= 275 && tickAnim < 285) {
            xx = 95.65166 + (((tickAnim - 275) / 10) * (64.75252-(95.65166)));
            yy = 36.72154 + (((tickAnim - 275) / 10) * (48.73922-(36.72154)));
            zz = -79.52099 + (((tickAnim - 275) / 10) * (-83.31978-(-79.52099)));
        }
        else if (tickAnim >= 285 && tickAnim < 305) {
            xx = 64.75252 + (((tickAnim - 285) / 20) * (64.75252-(64.75252)));
            yy = 48.73922 + (((tickAnim - 285) / 20) * (48.73922-(48.73922)));
            zz = -83.31978 + (((tickAnim - 285) / 20) * (-83.31978-(-83.31978)));
        }
        else if (tickAnim >= 305 && tickAnim < 310) {
            xx = 64.75252 + (((tickAnim - 305) / 5) * (42.37626-(64.75252)));
            yy = 48.73922 + (((tickAnim - 305) / 5) * (24.36961-(48.73922)));
            zz = -83.31978 + (((tickAnim - 305) / 5) * (-41.65989-(-83.31978)));
        }
        else if (tickAnim >= 310 && tickAnim < 315) {
            xx = 42.37626 + (((tickAnim - 310) / 5) * (0-(42.37626)));
            yy = 24.36961 + (((tickAnim - 310) / 5) * (0-(24.36961)));
            zz = -41.65989 + (((tickAnim - 310) / 5) * (0-(-41.65989)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(backrightleg, backrightleg.rotateAngleX + (float) Math.toRadians(xx), backrightleg.rotateAngleY + (float) Math.toRadians(yy), backrightleg.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 0) / 5) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 5) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 5) / 5) * (3.5-(0)));
            yy = 0 + (((tickAnim - 5) / 5) * (-0.5-(0)));
            zz = 0 + (((tickAnim - 5) / 5) * (-2-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 20) {
            xx = 3.5 + (((tickAnim - 10) / 10) * (3.5-(3.5)));
            yy = -0.5 + (((tickAnim - 10) / 10) * (-0.5-(-0.5)));
            zz = -2 + (((tickAnim - 10) / 10) * (-2-(-2)));
        }
        else if (tickAnim >= 20 && tickAnim < 275) {
            xx = 3.5 + (((tickAnim - 20) / 255) * (3.5-(3.5)));
            yy = -0.5 + (((tickAnim - 20) / 255) * (-0.5-(-0.5)));
            zz = -2 + (((tickAnim - 20) / 255) * (-2-(-2)));
        }
        else if (tickAnim >= 275 && tickAnim < 285) {
            xx = 3.5 + (((tickAnim - 275) / 10) * (0-(3.5)));
            yy = -0.5 + (((tickAnim - 275) / 10) * (0-(-0.5)));
            zz = -2 + (((tickAnim - 275) / 10) * (0-(-2)));
        }
        else if (tickAnim >= 285 && tickAnim < 305) {
            xx = 0 + (((tickAnim - 285) / 20) * (0-(0)));
            yy = 0 + (((tickAnim - 285) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 285) / 20) * (0-(0)));
        }
        else if (tickAnim >= 305 && tickAnim < 315) {
            xx = 0 + (((tickAnim - 305) / 10) * (0-(0)));
            yy = 0 + (((tickAnim - 305) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 305) / 10) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.backrightleg.rotationPointX = this.backrightleg.rotationPointX + (float)(xx);
        this.backrightleg.rotationPointY = this.backrightleg.rotationPointY - (float)(yy);
        this.backrightleg.rotationPointZ = this.backrightleg.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 0) / 5) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 5) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 5) / 5) * (-57.5-(0)));
            yy = 0 + (((tickAnim - 5) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 5) / 5) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 20) {
            xx = -57.5 + (((tickAnim - 10) / 10) * (-57.5-(-57.5)));
            yy = 0 + (((tickAnim - 10) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 10) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 275) {
            xx = -57.5 + (((tickAnim - 20) / 255) * (-57.5-(-57.5)));
            yy = 0 + (((tickAnim - 20) / 255) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 255) * (0-(0)));
        }
        else if (tickAnim >= 275 && tickAnim < 285) {
            xx = -57.5 + (((tickAnim - 275) / 10) * (0-(-57.5)));
            yy = 0 + (((tickAnim - 275) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 275) / 10) * (0-(0)));
        }
        else if (tickAnim >= 285 && tickAnim < 305) {
            xx = 0 + (((tickAnim - 285) / 20) * (0-(0)));
            yy = 0 + (((tickAnim - 285) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 285) / 20) * (0-(0)));
        }
        else if (tickAnim >= 305 && tickAnim < 315) {
            xx = 0 + (((tickAnim - 305) / 10) * (0-(0)));
            yy = 0 + (((tickAnim - 305) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 305) / 10) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(backrightleg2, backrightleg2.rotateAngleX + (float) Math.toRadians(xx), backrightleg2.rotateAngleY + (float) Math.toRadians(yy), backrightleg2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 0) / 5) * (44.99412-(0)));
            yy = 0 + (((tickAnim - 0) / 5) * (-53.19349-(0)));
            zz = 0 + (((tickAnim - 0) / 5) * (55.40601-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 20) {
            xx = 44.99412 + (((tickAnim - 5) / 15) * (44.99412-(44.99412)));
            yy = -53.19349 + (((tickAnim - 5) / 15) * (-53.19349-(-53.19349)));
            zz = 55.40601 + (((tickAnim - 5) / 15) * (55.40601-(55.40601)));
        }
        else if (tickAnim >= 20 && tickAnim < 275) {
            xx = 44.99412 + (((tickAnim - 20) / 255) * (44.99412-(44.99412)));
            yy = -53.19349 + (((tickAnim - 20) / 255) * (-53.19349-(-53.19349)));
            zz = 55.40601 + (((tickAnim - 20) / 255) * (55.40601-(55.40601)));
        }
        else if (tickAnim >= 275 && tickAnim < 285) {
            xx = 44.99412 + (((tickAnim - 275) / 10) * (44.99412-(44.99412)));
            yy = -53.19349 + (((tickAnim - 275) / 10) * (-53.19349-(-53.19349)));
            zz = 55.40601 + (((tickAnim - 275) / 10) * (55.40601-(55.40601)));
        }
        else if (tickAnim >= 285 && tickAnim < 305) {
            xx = 44.99412 + (((tickAnim - 285) / 20) * (44.99412-(44.99412)));
            yy = -53.19349 + (((tickAnim - 285) / 20) * (-53.19349-(-53.19349)));
            zz = 55.40601 + (((tickAnim - 285) / 20) * (55.40601-(55.40601)));
        }
        else if (tickAnim >= 305 && tickAnim < 315) {
            xx = 44.99412 + (((tickAnim - 305) / 10) * (0-(44.99412)));
            yy = -53.19349 + (((tickAnim - 305) / 10) * (0-(-53.19349)));
            zz = 55.40601 + (((tickAnim - 305) / 10) * (0-(55.40601)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(backrightleg3, backrightleg3.rotateAngleX + (float) Math.toRadians(xx), backrightleg3.rotateAngleY + (float) Math.toRadians(yy), backrightleg3.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 0) / 5) * (-2.90089-(0)));
            yy = 0 + (((tickAnim - 0) / 5) * (-7.74934-(0)));
            zz = 0 + (((tickAnim - 0) / 5) * (1.90251-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 7) {
            xx = -2.90089 + (((tickAnim - 5) / 2) * (2.33859-(-2.90089)));
            yy = -7.74934 + (((tickAnim - 5) / 2) * (-20.10563-(-7.74934)));
            zz = 1.90251 + (((tickAnim - 5) / 2) * (-7.147-(1.90251)));
        }
        else if (tickAnim >= 7 && tickAnim < 8) {
            xx = 2.33859 + (((tickAnim - 7) / 1) * (6.96153-(2.33859)));
            yy = -20.10563 + (((tickAnim - 7) / 1) * (-7.50909-(-20.10563)));
            zz = -7.147 + (((tickAnim - 7) / 1) * (-15.75337-(-7.147)));
        }
        else if (tickAnim >= 8 && tickAnim < 20) {
            xx = 6.96153 + (((tickAnim - 8) / 12) * (6.96153-(6.96153)));
            yy = -7.50909 + (((tickAnim - 8) / 12) * (-7.50909-(-7.50909)));
            zz = -15.75337 + (((tickAnim - 8) / 12) * (-15.75337-(-15.75337)));
        }
        else if (tickAnim >= 20 && tickAnim < 275) {
            xx = 6.96153 + (((tickAnim - 20) / 255) * (6.96153-(6.96153)));
            yy = -7.50909 + (((tickAnim - 20) / 255) * (-7.50909-(-7.50909)));
            zz = -15.75337 + (((tickAnim - 20) / 255) * (-15.75337-(-15.75337)));
        }
        else if (tickAnim >= 275 && tickAnim < 288) {
            xx = 6.96153 + (((tickAnim - 275) / 13) * (-2.8284-(6.96153)));
            yy = -7.50909 + (((tickAnim - 275) / 13) * (-0.31969-(-7.50909)));
            zz = -15.75337 + (((tickAnim - 275) / 13) * (0.87443-(-15.75337)));
        }
        else if (tickAnim >= 288 && tickAnim < 305) {
            xx = -2.8284 + (((tickAnim - 288) / 17) * (-2.90089-(-2.8284)));
            yy = -0.31969 + (((tickAnim - 288) / 17) * (-7.74934-(-0.31969)));
            zz = 0.87443 + (((tickAnim - 288) / 17) * (1.90251-(0.87443)));
        }
        else if (tickAnim >= 305 && tickAnim < 315) {
            xx = -2.90089 + (((tickAnim - 305) / 10) * (0-(-2.90089)));
            yy = -7.74934 + (((tickAnim - 305) / 10) * (0-(-7.74934)));
            zz = 1.90251 + (((tickAnim - 305) / 10) * (0-(1.90251)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tail, tail.rotateAngleX + (float) Math.toRadians(xx), tail.rotateAngleY + (float) Math.toRadians(yy), tail.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 0) / 5) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 5) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 5) / 3) * (0-(0)));
            yy = 0 + (((tickAnim - 5) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 5) / 3) * (-7-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 8) / 12) * (0-(0)));
            yy = 0 + (((tickAnim - 8) / 12) * (0-(0)));
            zz = -7 + (((tickAnim - 8) / 12) * (-7-(-7)));
        }
        else if (tickAnim >= 20 && tickAnim < 275) {
            xx = 0 + (((tickAnim - 20) / 255) * (0-(0)));
            yy = 0 + (((tickAnim - 20) / 255) * (0-(0)));
            zz = -7 + (((tickAnim - 20) / 255) * (-7-(-7)));
        }
        else if (tickAnim >= 275 && tickAnim < 288) {
            xx = 0 + (((tickAnim - 275) / 13) * (0-(0)));
            yy = 0 + (((tickAnim - 275) / 13) * (0-(0)));
            zz = -7 + (((tickAnim - 275) / 13) * (0-(-7)));
        }
        else if (tickAnim >= 288 && tickAnim < 305) {
            xx = 0 + (((tickAnim - 288) / 17) * (0-(0)));
            yy = 0 + (((tickAnim - 288) / 17) * (0-(0)));
            zz = 0 + (((tickAnim - 288) / 17) * (0-(0)));
        }
        else if (tickAnim >= 305 && tickAnim < 315) {
            xx = 0 + (((tickAnim - 305) / 10) * (0-(0)));
            yy = 0 + (((tickAnim - 305) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 305) / 10) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.tail.rotationPointX = this.tail.rotationPointX + (float)(xx);
        this.tail.rotationPointY = this.tail.rotationPointY - (float)(yy);
        this.tail.rotationPointZ = this.tail.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 0) / 5) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 5) * (-25-(0)));
            zz = 0 + (((tickAnim - 0) / 5) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 5) / 3) * (0-(0)));
            yy = -25 + (((tickAnim - 5) / 3) * (-4.55-(-25)));
            zz = 0 + (((tickAnim - 5) / 3) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 8) / 2) * (0-(0)));
            yy = -4.55 + (((tickAnim - 8) / 2) * (-97.5-(-4.55)));
            zz = 0 + (((tickAnim - 8) / 2) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 10) / 10) * (0-(0)));
            yy = -97.5 + (((tickAnim - 10) / 10) * (-97.5-(-97.5)));
            zz = 0 + (((tickAnim - 10) / 10) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 275) {
            xx = 0 + (((tickAnim - 20) / 255) * (0-(0)));
            yy = -97.5 + (((tickAnim - 20) / 255) * (-97.5-(-97.5)));
            zz = 0 + (((tickAnim - 20) / 255) * (0-(0)));
        }
        else if (tickAnim >= 275 && tickAnim < 288) {
            xx = 0 + (((tickAnim - 275) / 13) * (0-(0)));
            yy = -97.5 + (((tickAnim - 275) / 13) * (15-(-97.5)));
            zz = 0 + (((tickAnim - 275) / 13) * (0-(0)));
        }
        else if (tickAnim >= 288 && tickAnim < 293) {
            xx = 0 + (((tickAnim - 288) / 5) * (0-(0)));
            yy = 15 + (((tickAnim - 288) / 5) * (13.5-(15)));
            zz = 0 + (((tickAnim - 288) / 5) * (0-(0)));
        }
        else if (tickAnim >= 293 && tickAnim < 305) {
            xx = 0 + (((tickAnim - 293) / 12) * (0-(0)));
            yy = 13.5 + (((tickAnim - 293) / 12) * (-25-(13.5)));
            zz = 0 + (((tickAnim - 293) / 12) * (0-(0)));
        }
        else if (tickAnim >= 305 && tickAnim < 315) {
            xx = 0 + (((tickAnim - 305) / 10) * (0-(0)));
            yy = -25 + (((tickAnim - 305) / 10) * (0-(-25)));
            zz = 0 + (((tickAnim - 305) / 10) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tail2, tail2.rotateAngleX + (float) Math.toRadians(xx), tail2.rotateAngleY + (float) Math.toRadians(yy), tail2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 0) / 5) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 5) * (-20-(0)));
            zz = 0 + (((tickAnim - 0) / 5) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 5) / 3) * (0-(0)));
            yy = -20 + (((tickAnim - 5) / 3) * (20-(-20)));
            zz = 0 + (((tickAnim - 5) / 3) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 8) / 5) * (0-(0)));
            yy = 20 + (((tickAnim - 8) / 5) * (-30-(20)));
            zz = 0 + (((tickAnim - 8) / 5) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 13) / 7) * (0-(0)));
            yy = -30 + (((tickAnim - 13) / 7) * (-30-(-30)));
            zz = 0 + (((tickAnim - 13) / 7) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 275) {
            xx = 0 + (((tickAnim - 20) / 255) * (0-(0)));
            yy = -30 + (((tickAnim - 20) / 255) * (-30-(-30)));
            zz = 0 + (((tickAnim - 20) / 255) * (0-(0)));
        }
        else if (tickAnim >= 275 && tickAnim < 288) {
            xx = 0 + (((tickAnim - 275) / 13) * (0-(0)));
            yy = -30 + (((tickAnim - 275) / 13) * (22.5-(-30)));
            zz = 0 + (((tickAnim - 275) / 13) * (0-(0)));
        }
        else if (tickAnim >= 288 && tickAnim < 293) {
            xx = 0 + (((tickAnim - 288) / 5) * (0-(0)));
            yy = 22.5 + (((tickAnim - 288) / 5) * (12-(22.5)));
            zz = 0 + (((tickAnim - 288) / 5) * (0-(0)));
        }
        else if (tickAnim >= 293 && tickAnim < 305) {
            xx = 0 + (((tickAnim - 293) / 12) * (0-(0)));
            yy = 12 + (((tickAnim - 293) / 12) * (-20-(12)));
            zz = 0 + (((tickAnim - 293) / 12) * (0-(0)));
        }
        else if (tickAnim >= 305 && tickAnim < 315) {
            xx = 0 + (((tickAnim - 305) / 10) * (0-(0)));
            yy = -20 + (((tickAnim - 305) / 10) * (0-(-20)));
            zz = 0 + (((tickAnim - 305) / 10) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tail3, tail3.rotateAngleX + (float) Math.toRadians(xx), tail3.rotateAngleY + (float) Math.toRadians(yy), tail3.rotateAngleZ + (float) Math.toRadians(zz));
    }
    public void animEat(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime, double animTick) {
        EntityPrehistoricFloraNaomichelys entity = (EntityPrehistoricFloraNaomichelys) entitylivingbaseIn;
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
            xx = 8.44619 + (((tickAnim - 21) / 2) * (3.3997-(8.44619)));
            yy = 13.16925 + (((tickAnim - 21) / 2) * (11.10394-(13.16925)));
            zz = -25.09866 + (((tickAnim - 21) / 2) * (-13.38289-(-25.09866)));
        }
        else if (tickAnim >= 23 && tickAnim < 27) {
            xx = 3.3997 + (((tickAnim - 23) / 4) * (-22.15567-(3.3997)));
            yy = 11.10394 + (((tickAnim - 23) / 4) * (2.66255-(11.10394)));
            zz = -13.38289 + (((tickAnim - 23) / 4) * (-9.21013-(-13.38289)));
        }
        else if (tickAnim >= 27 && tickAnim < 34) {
            xx = -22.15567 + (((tickAnim - 27) / 7) * (-4.15-(-22.15567)));
            yy = 2.66255 + (((tickAnim - 27) / 7) * (0.5-(2.66255)));
            zz = -9.21013 + (((tickAnim - 27) / 7) * (-1.73-(-9.21013)));
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




        if (tickAnim >= 0 && tickAnim < 6) {
            xx = 0 + (((tickAnim - 0) / 6) * (36.37345-(0)));
            yy = 0 + (((tickAnim - 0) / 6) * (-7.12331-(0)));
            zz = 0 + (((tickAnim - 0) / 6) * (-0.43652-(0)));
        }
        else if (tickAnim >= 6 && tickAnim < 11) {
            xx = 36.37345 + (((tickAnim - 6) / 5) * (11.64952-(36.37345)));
            yy = -7.12331 + (((tickAnim - 6) / 5) * (-8.87772-(-7.12331)));
            zz = -0.43652 + (((tickAnim - 6) / 5) * (-9.58098-(-0.43652)));
        }
        else if (tickAnim >= 11 && tickAnim < 14) {
            xx = 11.64952 + (((tickAnim - 11) / 3) * (-0.65004-(11.64952)));
            yy = -8.87772 + (((tickAnim - 11) / 3) * (-4.35098-(-8.87772)));
            zz = -9.58098 + (((tickAnim - 11) / 3) * (-24.6947-(-9.58098)));
        }
        else if (tickAnim >= 14 && tickAnim < 18) {
            xx = -0.65004 + (((tickAnim - 14) / 4) * (6.11937-(-0.65004)));
            yy = -4.35098 + (((tickAnim - 14) / 4) * (-6.00784-(-4.35098)));
            zz = -24.6947 + (((tickAnim - 14) / 4) * (-24.44267-(-24.6947)));
        }
        else if (tickAnim >= 18 && tickAnim < 21) {
            xx = 6.11937 + (((tickAnim - 18) / 3) * (0.51434-(6.11937)));
            yy = -6.00784 + (((tickAnim - 18) / 3) * (-5.869-(-6.00784)));
            zz = -24.44267 + (((tickAnim - 18) / 3) * (-10.00685-(-24.44267)));
        }
        else if (tickAnim >= 21 && tickAnim < 27) {
            xx = 0.51434 + (((tickAnim - 21) / 6) * (47.29232-(0.51434)));
            yy = -5.869 + (((tickAnim - 21) / 6) * (-3.88687-(-5.869)));
            zz = -10.00685 + (((tickAnim - 21) / 6) * (-4.94866-(-10.00685)));
        }
        else if (tickAnim >= 27 && tickAnim < 34) {
            xx = 47.29232 + (((tickAnim - 27) / 7) * (8.87-(47.29232)));
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




        if (tickAnim >= 0 && tickAnim < 17) {
            xx = 1 + (((tickAnim - 0) / 17) * (1-(1)));
            yy = 1 + (((tickAnim - 0) / 17) * (1-(1)));
            zz = 1 + (((tickAnim - 0) / 17) * (1-(1)));
        }
        else if (tickAnim >= 17 && tickAnim < 23) {
            xx = 1 + (((tickAnim - 17) / 6) * (1-(1)));
            yy = 1 + (((tickAnim - 17) / 6) * (0.2-(1)));
            zz = 1 + (((tickAnim - 17) / 6) * (1-(1)));
        }
        else if (tickAnim >= 23 && tickAnim < 32) {
            xx = 1 + (((tickAnim - 23) / 9) * (1-(1)));
            yy = 0.2 + (((tickAnim - 23) / 9) * (1-(0.2)));
            zz = 1 + (((tickAnim - 23) / 9) * (1-(1)));
        }
        else {
            xx = 1;
            yy = 1;
            zz = 1;
        }
        this.eye1.setScale((float)xx, (float)yy, (float)zz);




        if (tickAnim >= 0 && tickAnim < 17) {
            xx = 1 + (((tickAnim - 0) / 17) * (1-(1)));
            yy = 1 + (((tickAnim - 0) / 17) * (1-(1)));
            zz = 1 + (((tickAnim - 0) / 17) * (1-(1)));
        }
        else if (tickAnim >= 17 && tickAnim < 23) {
            xx = 1 + (((tickAnim - 17) / 6) * (1-(1)));
            yy = 1 + (((tickAnim - 17) / 6) * (0.2-(1)));
            zz = 1 + (((tickAnim - 17) / 6) * (1-(1)));
        }
        else if (tickAnim >= 23 && tickAnim < 32) {
            xx = 1 + (((tickAnim - 23) / 9) * (1-(1)));
            yy = 0.2 + (((tickAnim - 23) / 9) * (1-(0.2)));
            zz = 1 + (((tickAnim - 23) / 9) * (1-(1)));
        }
        else {
            xx = 1;
            yy = 1;
            zz = 1;
        }
        this.eye2.setScale((float)xx, (float)yy, (float)zz);

    }
    public void animWalking(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime) {
        EntityPrehistoricFloraNaomichelys entity = (EntityPrehistoricFloraNaomichelys) entitylivingbaseIn;
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




        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 18.16086 + (((tickAnim - 0) / 3) * (21.84401-(18.16086)));
            yy = 42.18608 + (((tickAnim - 0) / 3) * (42.23855-(42.18608)));
            zz = -48.59437 + (((tickAnim - 0) / 3) * (-44.026-(-48.59437)));
        }
        else if (tickAnim >= 3 && tickAnim < 15) {
            xx = 21.84401 + (((tickAnim - 3) / 12) * (24.65049-(21.84401)));
            yy = 42.23855 + (((tickAnim - 3) / 12) * (29.76101-(42.23855)));
            zz = -44.026 + (((tickAnim - 3) / 12) * (-40.06718-(-44.026)));
        }
        else if (tickAnim >= 15 && tickAnim < 30) {
            xx = 24.65049 + (((tickAnim - 15) / 15) * (45.03697-(24.65049)));
            yy = 29.76101 + (((tickAnim - 15) / 15) * (21.60817-(29.76101)));
            zz = -40.06718 + (((tickAnim - 15) / 15) * (-42.70226-(-40.06718)));
        }
        else if (tickAnim >= 30 && tickAnim < 35) {
            xx = 45.03697 + (((tickAnim - 30) / 5) * (52.93103-(45.03697)));
            yy = 21.60817 + (((tickAnim - 30) / 5) * (26.79241-(21.60817)));
            zz = -42.70226 + (((tickAnim - 30) / 5) * (-44.69651-(-42.70226)));
        }
        else if (tickAnim >= 35 && tickAnim < 46) {
            xx = 52.93103 + (((tickAnim - 35) / 11) * (73.47191-(52.93103)));
            yy = 26.79241 + (((tickAnim - 35) / 11) * (12.83247-(26.79241)));
            zz = -44.69651 + (((tickAnim - 35) / 11) * (-69.11076-(-44.69651)));
        }
        else if (tickAnim >= 46 && tickAnim < 52) {
            xx = 73.47191 + (((tickAnim - 46) / 6) * (38.16165-(73.47191)));
            yy = 12.83247 + (((tickAnim - 46) / 6) * (29.90775-(12.83247)));
            zz = -69.11076 + (((tickAnim - 46) / 6) * (-69.34623-(-69.11076)));
        }
        else if (tickAnim >= 52 && tickAnim < 57) {
            xx = 38.16165 + (((tickAnim - 52) / 5) * (9.73988-(38.16165)));
            yy = 29.90775 + (((tickAnim - 52) / 5) * (55.97222-(29.90775)));
            zz = -69.34623 + (((tickAnim - 52) / 5) * (-78.70992-(-69.34623)));
        }
        else if (tickAnim >= 57 && tickAnim < 60) {
            xx = 9.73988 + (((tickAnim - 57) / 3) * (18.16086-(9.73988)));
            yy = 55.97222 + (((tickAnim - 57) / 3) * (42.18608-(55.97222)));
            zz = -78.70992 + (((tickAnim - 57) / 3) * (-48.59437-(-78.70992)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(frontleftleg, frontleftleg.rotateAngleX + (float) Math.toRadians(xx), frontleftleg.rotateAngleY + (float) Math.toRadians(yy), frontleftleg.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 15) {
            xx = -42.5 + (((tickAnim - 0) / 15) * (-0.72197-(-42.5)));
            yy = 0 + (((tickAnim - 0) / 15) * (7.52454-(0)));
            zz = 0 + (((tickAnim - 0) / 15) * (19.94668-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 30) {
            xx = -0.72197 + (((tickAnim - 15) / 15) * (18.864-(-0.72197)));
            yy = 7.52454 + (((tickAnim - 15) / 15) * (5.71544-(7.52454)));
            zz = 19.94668 + (((tickAnim - 15) / 15) * (22.96778-(19.94668)));
        }
        else if (tickAnim >= 30 && tickAnim < 40) {
            xx = 18.864 + (((tickAnim - 30) / 10) * (21.28207-(18.864)));
            yy = 5.71544 + (((tickAnim - 30) / 10) * (2.21281-(5.71544)));
            zz = 22.96778 + (((tickAnim - 30) / 10) * (13.11692-(22.96778)));
        }
        else if (tickAnim >= 40 && tickAnim < 46) {
            xx = 21.28207 + (((tickAnim - 40) / 6) * (2.89414-(21.28207)));
            yy = 2.21281 + (((tickAnim - 40) / 6) * (-2.678-(2.21281)));
            zz = 13.11692 + (((tickAnim - 40) / 6) * (18.3694-(13.11692)));
        }
        else if (tickAnim >= 46 && tickAnim < 53) {
            xx = 2.89414 + (((tickAnim - 46) / 7) * (-52.90646-(2.89414)));
            yy = -2.678 + (((tickAnim - 46) / 7) * (-18.96236-(-2.678)));
            zz = 18.3694 + (((tickAnim - 46) / 7) * (1.50091-(18.3694)));
        }
        else if (tickAnim >= 53 && tickAnim < 60) {
            xx = -52.90646 + (((tickAnim - 53) / 7) * (-42.5-(-52.90646)));
            yy = -18.96236 + (((tickAnim - 53) / 7) * (0-(-18.96236)));
            zz = 1.50091 + (((tickAnim - 53) / 7) * (0-(1.50091)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(frontleftleg2, frontleftleg2.rotateAngleX + (float) Math.toRadians(xx), frontleftleg2.rotateAngleY + (float) Math.toRadians(yy), frontleftleg2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 5) {
            xx = 45.03697 + (((tickAnim - 0) / 5) * (52.93103-(45.03697)));
            yy = -21.60817 + (((tickAnim - 0) / 5) * (-26.79241-(-21.60817)));
            zz = 42.70226 + (((tickAnim - 0) / 5) * (44.69651-(42.70226)));
        }
        else if (tickAnim >= 5 && tickAnim < 16) {
            xx = 52.93103 + (((tickAnim - 5) / 11) * (73.47191-(52.93103)));
            yy = -26.79241 + (((tickAnim - 5) / 11) * (-12.83247-(-26.79241)));
            zz = 44.69651 + (((tickAnim - 5) / 11) * (69.11076-(44.69651)));
        }
        else if (tickAnim >= 16 && tickAnim < 22) {
            xx = 73.47191 + (((tickAnim - 16) / 6) * (38.16165-(73.47191)));
            yy = -12.83247 + (((tickAnim - 16) / 6) * (-29.90775-(-12.83247)));
            zz = 69.11076 + (((tickAnim - 16) / 6) * (69.34623-(69.11076)));
        }
        else if (tickAnim >= 22 && tickAnim < 27) {
            xx = 38.16165 + (((tickAnim - 22) / 5) * (9.73988-(38.16165)));
            yy = -29.90775 + (((tickAnim - 22) / 5) * (-55.97222-(-29.90775)));
            zz = 69.34623 + (((tickAnim - 22) / 5) * (78.70992-(69.34623)));
        }
        else if (tickAnim >= 27 && tickAnim < 30) {
            xx = 9.73988 + (((tickAnim - 27) / 3) * (18.16086-(9.73988)));
            yy = -55.97222 + (((tickAnim - 27) / 3) * (-42.18608-(-55.97222)));
            zz = 78.70992 + (((tickAnim - 27) / 3) * (48.59437-(78.70992)));
        }
        else if (tickAnim >= 30 && tickAnim < 33) {
            xx = 18.16086 + (((tickAnim - 30) / 3) * (21.84401-(18.16086)));
            yy = -42.18608 + (((tickAnim - 30) / 3) * (-42.23855-(-42.18608)));
            zz = 48.59437 + (((tickAnim - 30) / 3) * (44.026-(48.59437)));
        }
        else if (tickAnim >= 33 && tickAnim < 45) {
            xx = 21.84401 + (((tickAnim - 33) / 12) * (24.65049-(21.84401)));
            yy = -42.23855 + (((tickAnim - 33) / 12) * (-29.76101-(-42.23855)));
            zz = 44.026 + (((tickAnim - 33) / 12) * (40.06718-(44.026)));
        }
        else if (tickAnim >= 45 && tickAnim < 60) {
            xx = 24.65049 + (((tickAnim - 45) / 15) * (45.03697-(24.65049)));
            yy = -29.76101 + (((tickAnim - 45) / 15) * (-21.60817-(-29.76101)));
            zz = 40.06718 + (((tickAnim - 45) / 15) * (42.70226-(40.06718)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(frontrightleg, frontrightleg.rotateAngleX + (float) Math.toRadians(xx), frontrightleg.rotateAngleY + (float) Math.toRadians(yy), frontrightleg.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 18.864 + (((tickAnim - 0) / 10) * (21.28207-(18.864)));
            yy = -5.71544 + (((tickAnim - 0) / 10) * (-2.21281-(-5.71544)));
            zz = -22.96778 + (((tickAnim - 0) / 10) * (-13.11692-(-22.96778)));
        }
        else if (tickAnim >= 10 && tickAnim < 16) {
            xx = 21.28207 + (((tickAnim - 10) / 6) * (2.89414-(21.28207)));
            yy = -2.21281 + (((tickAnim - 10) / 6) * (2.678-(-2.21281)));
            zz = -13.11692 + (((tickAnim - 10) / 6) * (-18.3694-(-13.11692)));
        }
        else if (tickAnim >= 16 && tickAnim < 23) {
            xx = 2.89414 + (((tickAnim - 16) / 7) * (-52.90646-(2.89414)));
            yy = 2.678 + (((tickAnim - 16) / 7) * (18.96236-(2.678)));
            zz = -18.3694 + (((tickAnim - 16) / 7) * (-1.50091-(-18.3694)));
        }
        else if (tickAnim >= 23 && tickAnim < 30) {
            xx = -52.90646 + (((tickAnim - 23) / 7) * (-42.5-(-52.90646)));
            yy = 18.96236 + (((tickAnim - 23) / 7) * (0-(18.96236)));
            zz = -1.50091 + (((tickAnim - 23) / 7) * (0-(-1.50091)));
        }
        else if (tickAnim >= 30 && tickAnim < 45) {
            xx = -42.5 + (((tickAnim - 30) / 15) * (-0.72197-(-42.5)));
            yy = 0 + (((tickAnim - 30) / 15) * (-7.52454-(0)));
            zz = 0 + (((tickAnim - 30) / 15) * (-19.94668-(0)));
        }
        else if (tickAnim >= 45 && tickAnim < 60) {
            xx = -0.72197 + (((tickAnim - 45) / 15) * (18.864-(-0.72197)));
            yy = -7.52454 + (((tickAnim - 45) / 15) * (-5.71544-(-7.52454)));
            zz = -19.94668 + (((tickAnim - 45) / 15) * (-22.96778-(-19.94668)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(frontrightleg2, frontrightleg2.rotateAngleX + (float) Math.toRadians(xx), frontrightleg2.rotateAngleY + (float) Math.toRadians(yy), frontrightleg2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 5) {
            xx = -37.58501 + (((tickAnim - 0) / 5) * (-48.56353-(-37.58501)));
            yy = 7.93601 + (((tickAnim - 0) / 5) * (7.2742-(7.93601)));
            zz = 12.15558 + (((tickAnim - 0) / 5) * (9.84829-(12.15558)));
        }
        else if (tickAnim >= 5 && tickAnim < 10) {
            xx = -48.56353 + (((tickAnim - 5) / 5) * (-45.65897-(-48.56353)));
            yy = 7.2742 + (((tickAnim - 5) / 5) * (-3.47818-(7.2742)));
            zz = 9.84829 + (((tickAnim - 5) / 5) * (18.56862-(9.84829)));
        }
        else if (tickAnim >= 10 && tickAnim < 16) {
            xx = -45.65897 + (((tickAnim - 10) / 6) * (-32.43458-(-45.65897)));
            yy = -3.47818 + (((tickAnim - 10) / 6) * (6.11737-(-3.47818)));
            zz = 18.56862 + (((tickAnim - 10) / 6) * (32.37583-(18.56862)));
        }
        else if (tickAnim >= 16 && tickAnim < 30) {
            xx = -32.43458 + (((tickAnim - 16) / 14) * (16.87923-(-32.43458)));
            yy = 6.11737 + (((tickAnim - 16) / 14) * (-14.76011-(6.11737)));
            zz = 32.37583 + (((tickAnim - 16) / 14) * (-17.56286-(32.37583)));
        }
        else if (tickAnim >= 30 && tickAnim < 33) {
            xx = 16.87923 + (((tickAnim - 30) / 3) * (3.32063-(16.87923)));
            yy = -14.76011 + (((tickAnim - 30) / 3) * (-16.2804-(-14.76011)));
            zz = -17.56286 + (((tickAnim - 30) / 3) * (-16.37705-(-17.56286)));
        }
        else if (tickAnim >= 33 && tickAnim < 60) {
            xx = 3.32063 + (((tickAnim - 33) / 27) * (-37.58501-(3.32063)));
            yy = -16.2804 + (((tickAnim - 33) / 27) * (7.93601-(-16.2804)));
            zz = -16.37705 + (((tickAnim - 33) / 27) * (12.15558-(-16.37705)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(frontrightleg3, frontrightleg3.rotateAngleX + (float) Math.toRadians(xx), frontrightleg3.rotateAngleY + (float) Math.toRadians(yy), frontrightleg3.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 94.84 + (((tickAnim - 0) / 10) * (63.06257-(94.84)));
            yy = -23.35 + (((tickAnim - 0) / 10) * (-31.92428-(-23.35)));
            zz = 107.87 + (((tickAnim - 0) / 10) * (85.61781-(107.87)));
        }
        else if (tickAnim >= 10 && tickAnim < 23) {
            xx = 63.06257 + (((tickAnim - 10) / 13) * (134.09461-(63.06257)));
            yy = -31.92428 + (((tickAnim - 10) / 13) * (-18.07562-(-31.92428)));
            zz = 85.61781 + (((tickAnim - 10) / 13) * (119.09668-(85.61781)));
        }
        else if (tickAnim >= 23 && tickAnim < 30) {
            xx = 134.09461 + (((tickAnim - 23) / 7) * (177.99519-(134.09461)));
            yy = -18.07562 + (((tickAnim - 23) / 7) * (-21.87998-(-18.07562)));
            zz = 119.09668 + (((tickAnim - 23) / 7) * (178.87058-(119.09668)));
        }
        else if (tickAnim >= 30 && tickAnim < 50) {
            xx = 177.99519 + (((tickAnim - 30) / 20) * (126.61926-(177.99519)));
            yy = -21.87998 + (((tickAnim - 30) / 20) * (-14.77926-(-21.87998)));
            zz = 178.87058 + (((tickAnim - 30) / 20) * (130.12848-(178.87058)));
        }
        else if (tickAnim >= 50 && tickAnim < 60) {
            xx = 126.61926 + (((tickAnim - 50) / 10) * (94.84-(126.61926)));
            yy = -14.77926 + (((tickAnim - 50) / 10) * (-23.35-(-14.77926)));
            zz = 130.12848 + (((tickAnim - 50) / 10) * (107.87-(130.12848)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(backleftleg, backleftleg.rotateAngleX + (float) Math.toRadians(xx), backleftleg.rotateAngleY + (float) Math.toRadians(yy), backleftleg.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 20) {
            xx = 177.99519 + (((tickAnim - 0) / 20) * (126.61926-(177.99519)));
            yy = 21.87998 + (((tickAnim - 0) / 20) * (14.77926-(21.87998)));
            zz = -178.87058 + (((tickAnim - 0) / 20) * (-130.12848-(-178.87058)));
        }
        else if (tickAnim >= 20 && tickAnim < 40) {
            xx = 126.61926 + (((tickAnim - 20) / 20) * (63.06257-(126.61926)));
            yy = 14.77926 + (((tickAnim - 20) / 20) * (31.92428-(14.77926)));
            zz = -130.12848 + (((tickAnim - 20) / 20) * (-85.61781-(-130.12848)));
        }
        else if (tickAnim >= 40 && tickAnim < 53) {
            xx = 63.06257 + (((tickAnim - 40) / 13) * (134.09461-(63.06257)));
            yy = 31.92428 + (((tickAnim - 40) / 13) * (18.07562-(31.92428)));
            zz = -85.61781 + (((tickAnim - 40) / 13) * (-119.09668-(-85.61781)));
        }
        else if (tickAnim >= 53 && tickAnim < 60) {
            xx = 134.09461 + (((tickAnim - 53) / 7) * (177.99519-(134.09461)));
            yy = 18.07562 + (((tickAnim - 53) / 7) * (21.87998-(18.07562)));
            zz = -119.09668 + (((tickAnim - 53) / 7) * (-178.87058-(-119.09668)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(backrightleg, backrightleg.rotateAngleX + (float) Math.toRadians(xx), backrightleg.rotateAngleY + (float) Math.toRadians(yy), backrightleg.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 20) {
            xx = -7.61647 + (((tickAnim - 0) / 20) * (33.97609-(-7.61647)));
            yy = -5.73735 + (((tickAnim - 0) / 20) * (-2.84199-(-5.73735)));
            zz = 71.45332 + (((tickAnim - 0) / 20) * (37.47733-(71.45332)));
        }
        else if (tickAnim >= 20 && tickAnim < 40) {
            xx = 33.97609 + (((tickAnim - 20) / 20) * (34.21564-(33.97609)));
            yy = -2.84199 + (((tickAnim - 20) / 20) * (23.52012-(-2.84199)));
            zz = 37.47733 + (((tickAnim - 20) / 20) * (22.25902-(37.47733)));
        }
        else if (tickAnim >= 40 && tickAnim < 53) {
            xx = 34.21564 + (((tickAnim - 40) / 13) * (17.69909-(34.21564)));
            yy = 23.52012 + (((tickAnim - 40) / 13) * (-5.303-(23.52012)));
            zz = 22.25902 + (((tickAnim - 40) / 13) * (86.42997-(22.25902)));
        }
        else if (tickAnim >= 53 && tickAnim < 60) {
            xx = 17.69909 + (((tickAnim - 53) / 7) * (-7.61647-(17.69909)));
            yy = -5.303 + (((tickAnim - 53) / 7) * (-5.73735-(-5.303)));
            zz = 86.42997 + (((tickAnim - 53) / 7) * (71.45332-(86.42997)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(backrightleg3, backrightleg3.rotateAngleX + (float) Math.toRadians(xx), backrightleg3.rotateAngleY + (float) Math.toRadians(yy), backrightleg3.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 8) {
            xx = -22.45633 + (((tickAnim - 0) / 8) * (-21.29213-(-22.45633)));
            yy = -2.49962 + (((tickAnim - 0) / 8) * (1.51265-(-2.49962)));
            zz = -0.00171 + (((tickAnim - 0) / 8) * (1.5655-(-0.00171)));
        }
        else if (tickAnim >= 8 && tickAnim < 16) {
            xx = -21.29213 + (((tickAnim - 8) / 8) * (-22.10969-(-21.29213)));
            yy = 1.51265 + (((tickAnim - 8) / 8) * (5.97074-(1.51265)));
            zz = 1.5655 + (((tickAnim - 8) / 8) * (3.30684-(1.5655)));
        }
        else if (tickAnim >= 16 && tickAnim < 30) {
            xx = -22.10969 + (((tickAnim - 16) / 14) * (-22.41246-(-22.10969)));
            yy = 5.97074 + (((tickAnim - 16) / 14) * (4.99924-(5.97074)));
            zz = 3.30684 + (((tickAnim - 16) / 14) * (0.00534-(3.30684)));
        }
        else if (tickAnim >= 30 && tickAnim < 38) {
            xx = -22.41246 + (((tickAnim - 30) / 8) * (-21.33741-(-22.41246)));
            yy = 4.99924 + (((tickAnim - 30) / 8) * (1.09204-(4.99924)));
            zz = 0.00534 + (((tickAnim - 30) / 8) * (-1.47845-(0.00534)));
        }
        else if (tickAnim >= 38 && tickAnim < 47) {
            xx = -21.33741 + (((tickAnim - 38) / 9) * (-22.24567-(-21.33741)));
            yy = 1.09204 + (((tickAnim - 38) / 9) * (-3.68343-(1.09204)));
            zz = -1.47845 + (((tickAnim - 38) / 9) * (-3.29198-(-1.47845)));
        }
        else if (tickAnim >= 47 && tickAnim < 60) {
            xx = -22.24567 + (((tickAnim - 47) / 13) * (-22.45633-(-22.24567)));
            yy = -3.68343 + (((tickAnim - 47) / 13) * (-2.49962-(-3.68343)));
            zz = -3.29198 + (((tickAnim - 47) / 13) * (-0.00171-(-3.29198)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tail, tail.rotateAngleX + (float) Math.toRadians(xx), tail.rotateAngleY + (float) Math.toRadians(yy), tail.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 16.87923 + (((tickAnim - 0) / 3) * (3.32063-(16.87923)));
            yy = 14.76011 + (((tickAnim - 0) / 3) * (16.2804-(14.76011)));
            zz = 17.56286 + (((tickAnim - 0) / 3) * (16.37705-(17.56286)));
        }
        else if (tickAnim >= 3 && tickAnim < 30) {
            xx = 3.32063 + (((tickAnim - 3) / 27) * (-37.58501-(3.32063)));
            yy = 16.2804 + (((tickAnim - 3) / 27) * (-7.93601-(16.2804)));
            zz = 16.37705 + (((tickAnim - 3) / 27) * (-12.15558-(16.37705)));
        }
        else if (tickAnim >= 30 && tickAnim < 35) {
            xx = -37.58501 + (((tickAnim - 30) / 5) * (-48.56353-(-37.58501)));
            yy = -7.93601 + (((tickAnim - 30) / 5) * (-7.2742-(-7.93601)));
            zz = -12.15558 + (((tickAnim - 30) / 5) * (-9.84829-(-12.15558)));
        }
        else if (tickAnim >= 35 && tickAnim < 40) {
            xx = -48.56353 + (((tickAnim - 35) / 5) * (-45.65897-(-48.56353)));
            yy = -7.2742 + (((tickAnim - 35) / 5) * (3.47818-(-7.2742)));
            zz = -9.84829 + (((tickAnim - 35) / 5) * (-18.56862-(-9.84829)));
        }
        else if (tickAnim >= 40 && tickAnim < 46) {
            xx = -45.65897 + (((tickAnim - 40) / 6) * (-32.43458-(-45.65897)));
            yy = 3.47818 + (((tickAnim - 40) / 6) * (-6.11737-(3.47818)));
            zz = -18.56862 + (((tickAnim - 40) / 6) * (-32.37583-(-18.56862)));
        }
        else if (tickAnim >= 46 && tickAnim < 60) {
            xx = -32.43458 + (((tickAnim - 46) / 14) * (16.87923-(-32.43458)));
            yy = -6.11737 + (((tickAnim - 46) / 14) * (14.76011-(-6.11737)));
            zz = -32.37583 + (((tickAnim - 46) / 14) * (17.56286-(-32.37583)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(frontleftleg3, frontleftleg3.rotateAngleX + (float) Math.toRadians(xx), frontleftleg3.rotateAngleY + (float) Math.toRadians(yy), frontleftleg3.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 10) {
            xx = -3.75 + (((tickAnim - 0) / 10) * (0-(-3.75)));
            yy = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 21) {
            xx = 0 + (((tickAnim - 10) / 11) * (-42.5-(0)));
            yy = 0 + (((tickAnim - 10) / 11) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 11) * (0-(0)));
        }
        else if (tickAnim >= 21 && tickAnim < 30) {
            xx = -42.5 + (((tickAnim - 21) / 9) * (7.5-(-42.5)));
            yy = 0 + (((tickAnim - 21) / 9) * (0-(0)));
            zz = 0 + (((tickAnim - 21) / 9) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 50) {
            xx = 7.5 + (((tickAnim - 30) / 20) * (-7.5-(7.5)));
            yy = 0 + (((tickAnim - 30) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 30) / 20) * (0-(0)));
        }
        else if (tickAnim >= 50 && tickAnim < 60) {
            xx = -7.5 + (((tickAnim - 50) / 10) * (-3.75-(-7.5)));
            yy = 0 + (((tickAnim - 50) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 50) / 10) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(backleftleg2, backleftleg2.rotateAngleX + (float) Math.toRadians(xx), backleftleg2.rotateAngleY + (float) Math.toRadians(yy), backleftleg2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 34.1 + (((tickAnim - 0) / 10) * (34.21564-(34.1)));
            yy = -10.34 + (((tickAnim - 0) / 10) * (-23.52012-(-10.34)));
            zz = -29.87 + (((tickAnim - 0) / 10) * (-22.25902-(-29.87)));
        }
        else if (tickAnim >= 10 && tickAnim < 23) {
            xx = 34.21564 + (((tickAnim - 10) / 13) * (17.69909-(34.21564)));
            yy = -23.52012 + (((tickAnim - 10) / 13) * (5.303-(-23.52012)));
            zz = -22.25902 + (((tickAnim - 10) / 13) * (-86.42997-(-22.25902)));
        }
        else if (tickAnim >= 23 && tickAnim < 30) {
            xx = 17.69909 + (((tickAnim - 23) / 7) * (-7.61647-(17.69909)));
            yy = 5.303 + (((tickAnim - 23) / 7) * (5.73735-(5.303)));
            zz = -86.42997 + (((tickAnim - 23) / 7) * (-71.45332-(-86.42997)));
        }
        else if (tickAnim >= 30 && tickAnim < 50) {
            xx = -7.61647 + (((tickAnim - 30) / 20) * (33.97609-(-7.61647)));
            yy = 5.73735 + (((tickAnim - 30) / 20) * (2.84199-(5.73735)));
            zz = -71.45332 + (((tickAnim - 30) / 20) * (-37.47733-(-71.45332)));
        }
        else if (tickAnim >= 50 && tickAnim < 60) {
            xx = 33.97609 + (((tickAnim - 50) / 10) * (34.1-(33.97609)));
            yy = 2.84199 + (((tickAnim - 50) / 10) * (-10.34-(2.84199)));
            zz = -37.47733 + (((tickAnim - 50) / 10) * (-29.87-(-37.47733)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(backleftleg3, backleftleg3.rotateAngleX + (float) Math.toRadians(xx), backleftleg3.rotateAngleY + (float) Math.toRadians(yy), backleftleg3.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 20) {
            xx = 7.5 + (((tickAnim - 0) / 20) * (-7.5-(7.5)));
            yy = 0 + (((tickAnim - 0) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 20) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 40) {
            xx = -7.5 + (((tickAnim - 20) / 20) * (0-(-7.5)));
            yy = 0 + (((tickAnim - 20) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 20) * (0-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 51) {
            xx = 0 + (((tickAnim - 40) / 11) * (-42.5-(0)));
            yy = 0 + (((tickAnim - 40) / 11) * (0-(0)));
            zz = 0 + (((tickAnim - 40) / 11) * (0-(0)));
        }
        else if (tickAnim >= 51 && tickAnim < 60) {
            xx = -42.5 + (((tickAnim - 51) / 9) * (7.5-(-42.5)));
            yy = 0 + (((tickAnim - 51) / 9) * (0-(0)));
            zz = 0 + (((tickAnim - 51) / 9) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(backrightleg2, backrightleg2.rotateAngleX + (float) Math.toRadians(xx), backrightleg2.rotateAngleY + (float) Math.toRadians(yy), backrightleg2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 16) {
            xx = 17.5 + (((tickAnim - 0) / 16) * (17.57031-(17.5)));
            yy = 0 + (((tickAnim - 0) / 16) * (-4.69776-(0)));
            zz = 0 + (((tickAnim - 0) / 16) * (-1.71394-(0)));
        }
        else if (tickAnim >= 16 && tickAnim < 30) {
            xx = 17.57031 + (((tickAnim - 16) / 14) * (17.5-(17.57031)));
            yy = -4.69776 + (((tickAnim - 16) / 14) * (0-(-4.69776)));
            zz = -1.71394 + (((tickAnim - 16) / 14) * (0-(-1.71394)));
        }
        else if (tickAnim >= 30 && tickAnim < 47) {
            xx = 17.5 + (((tickAnim - 30) / 17) * (17.57031-(17.5)));
            yy = 0 + (((tickAnim - 30) / 17) * (4.69776-(0)));
            zz = 0 + (((tickAnim - 30) / 17) * (1.71394-(0)));
        }
        else if (tickAnim >= 47 && tickAnim < 60) {
            xx = 17.57031 + (((tickAnim - 47) / 13) * (17.5-(17.57031)));
            yy = 4.69776 + (((tickAnim - 47) / 13) * (0-(4.69776)));
            zz = 1.71394 + (((tickAnim - 47) / 13) * (0-(1.71394)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tail3, tail3.rotateAngleX + (float) Math.toRadians(xx), tail3.rotateAngleY + (float) Math.toRadians(yy), tail3.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 16) {
            xx = 0 + (((tickAnim - 0) / 16) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 16) * (-5-(0)));
            zz = 0 + (((tickAnim - 0) / 16) * (0-(0)));
        }
        else if (tickAnim >= 16 && tickAnim < 30) {
            xx = 0 + (((tickAnim - 16) / 14) * (0-(0)));
            yy = -5 + (((tickAnim - 16) / 14) * (0-(-5)));
            zz = 0 + (((tickAnim - 16) / 14) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 47) {
            xx = 0 + (((tickAnim - 30) / 17) * (0-(0)));
            yy = 0 + (((tickAnim - 30) / 17) * (5-(0)));
            zz = 0 + (((tickAnim - 30) / 17) * (0-(0)));
        }
        else if (tickAnim >= 47 && tickAnim < 60) {
            xx = 0 + (((tickAnim - 47) / 13) * (0-(0)));
            yy = 5 + (((tickAnim - 47) / 13) * (0-(5)));
            zz = 0 + (((tickAnim - 47) / 13) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tail2, tail2.rotateAngleX + (float) Math.toRadians(xx), tail2.rotateAngleY + (float) Math.toRadians(yy), tail2.rotateAngleZ + (float) Math.toRadians(zz));



    }


        public void animate(IAnimatedEntity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        EntityPrehistoricFloraNaomichelys e = (EntityPrehistoricFloraNaomichelys) entity;
        animator.update(entity);


    }
}
