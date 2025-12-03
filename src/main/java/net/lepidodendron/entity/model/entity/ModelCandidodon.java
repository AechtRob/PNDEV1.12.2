package net.lepidodendron.entity.model.entity;

import net.ilexiconn.llibrary.client.model.ModelAnimator;
import net.ilexiconn.llibrary.client.model.tools.AdvancedModelRenderer;
import net.ilexiconn.llibrary.server.animation.IAnimatedEntity;
import net.lepidodendron.entity.EntityPrehistoricFloraCandidodon;
import net.lepidodendron.entity.model.ModelBasePalaeopedia;
import net.minecraft.client.model.ModelBox;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;

public class ModelCandidodon extends ModelBasePalaeopedia {
    private final AdvancedModelRenderer main;
    private final AdvancedModelRenderer cube_r1;
    private final AdvancedModelRenderer cube_r2;
    private final AdvancedModelRenderer backLeftLeg;
    private final AdvancedModelRenderer backLeftLeg2;
    private final AdvancedModelRenderer backLeftLeg3;
    private final AdvancedModelRenderer backRightLeg;
    private final AdvancedModelRenderer backRightLeg2;
    private final AdvancedModelRenderer backRightLeg3;
    private final AdvancedModelRenderer body;
    private final AdvancedModelRenderer cube_r3;
    private final AdvancedModelRenderer body2;
    private final AdvancedModelRenderer cube_r4;
    private final AdvancedModelRenderer body3;
    private final AdvancedModelRenderer neck;
    private final AdvancedModelRenderer cube_r5;
    private final AdvancedModelRenderer cube_r6;
    private final AdvancedModelRenderer head;
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
    private final AdvancedModelRenderer jaw;
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
    private final AdvancedModelRenderer frontLeftLeg;
    private final AdvancedModelRenderer frontLeftLeg2;
    private final AdvancedModelRenderer frontLeftLeg3;
    private final AdvancedModelRenderer frontRightLeg;
    private final AdvancedModelRenderer frontRightLeg2;
    private final AdvancedModelRenderer frontRightLeg3;
    private final AdvancedModelRenderer tail;
    private final AdvancedModelRenderer cube_r37;
    private final AdvancedModelRenderer tail2;
    private final AdvancedModelRenderer tail3;
    private final AdvancedModelRenderer tail4;
    private final AdvancedModelRenderer cube_r38;
    private final AdvancedModelRenderer grub;
    private final AdvancedModelRenderer grub2;

    private ModelAnimator animator;

    public ModelCandidodon() {
        this.textureWidth = 64;
        this.textureHeight = 64;

        this.main = new AdvancedModelRenderer(this);
        this.main.setRotationPoint(0.0F, 14.1392F, 6.9676F);


        this.cube_r1 = new AdvancedModelRenderer(this);
        this.cube_r1.setRotationPoint(0.0F, 0.0678F, 3.6849F);
        this.main.addChild(cube_r1);
        this.setRotateAngle(cube_r1, -0.1353F, 0.0F, 0.0F);
        this.cube_r1.cubeList.add(new ModelBox(cube_r1, 0, 35, -1.0F, 0.125F, -4.0F, 2, 1, 4, -0.001F, false));

        this.cube_r2 = new AdvancedModelRenderer(this);
        this.cube_r2.setRotationPoint(0.0F, 0.5608F, -0.7176F);
        this.main.addChild(cube_r2);
        this.setRotateAngle(cube_r2, -0.1745F, 0.0F, 0.0F);
        this.cube_r2.cubeList.add(new ModelBox(cube_r2, 19, 0, -2.0F, -0.75F, 0.25F, 4, 4, 4, 0.0F, false));

        this.backLeftLeg = new AdvancedModelRenderer(this);
        this.backLeftLeg.setRotationPoint(2.4F, 1.7268F, 1.2736F);
        this.main.addChild(backLeftLeg);
        this.setRotateAngle(backLeftLeg, -0.2618F, 0.0F, 0.0F);
        this.backLeftLeg.cubeList.add(new ModelBox(backLeftLeg, 36, 0, -1.0F, -0.5F, -1.0F, 2, 4, 3, 0.0F, false));

        this.backLeftLeg2 = new AdvancedModelRenderer(this);
        this.backLeftLeg2.setRotationPoint(0.0F, 3.5F, -1.0F);
        this.backLeftLeg.addChild(backLeftLeg2);
        this.setRotateAngle(backLeftLeg2, 0.5236F, 0.0F, 0.0F);
        this.backLeftLeg2.cubeList.add(new ModelBox(backLeftLeg2, 11, 46, -1.0F, 0.0F, 0.0F, 2, 5, 2, -0.001F, false));

        this.backLeftLeg3 = new AdvancedModelRenderer(this);
        this.backLeftLeg3.setRotationPoint(0.0F, 4.3059F, 0.7756F);
        this.backLeftLeg2.addChild(backLeftLeg3);
        this.setRotateAngle(backLeftLeg3, -0.2618F, 0.0F, 0.0F);
        this.backLeftLeg3.cubeList.add(new ModelBox(backLeftLeg3, 30, 32, -1.5F, 0.0F, -3.0F, 3, 1, 4, 0.0F, false));

        this.backRightLeg = new AdvancedModelRenderer(this);
        this.backRightLeg.setRotationPoint(-2.4F, 1.7268F, 1.2736F);
        this.main.addChild(backRightLeg);
        this.setRotateAngle(backRightLeg, -0.2618F, 0.0F, 0.0F);
        this.backRightLeg.cubeList.add(new ModelBox(backRightLeg, 36, 0, -1.0F, -0.5F, -1.0F, 2, 4, 3, 0.0F, true));

        this.backRightLeg2 = new AdvancedModelRenderer(this);
        this.backRightLeg2.setRotationPoint(0.0F, 3.5F, -1.0F);
        this.backRightLeg.addChild(backRightLeg2);
        this.setRotateAngle(backRightLeg2, 0.5236F, 0.0F, 0.0F);
        this.backRightLeg2.cubeList.add(new ModelBox(backRightLeg2, 11, 46, -1.0F, 0.0F, 0.0F, 2, 5, 2, -0.001F, true));

        this.backRightLeg3 = new AdvancedModelRenderer(this);
        this.backRightLeg3.setRotationPoint(0.0F, 4.3059F, 0.7756F);
        this.backRightLeg2.addChild(backRightLeg3);
        this.setRotateAngle(backRightLeg3, -0.2618F, 0.0F, 0.0F);
        this.backRightLeg3.cubeList.add(new ModelBox(backRightLeg3, 30, 32, -1.5F, 0.0F, -3.0F, 3, 1, 4, 0.0F, true));

        this.body = new AdvancedModelRenderer(this);
        this.body.setRotationPoint(0.0F, 0.3108F, 0.0324F);
        this.main.addChild(body);
        this.body.cubeList.add(new ModelBox(body, 0, 0, -2.5F, -0.5F, -4.0F, 5, 5, 4, 0.0F, false));

        this.cube_r3 = new AdvancedModelRenderer(this);
        this.cube_r3.setRotationPoint(-1.0F, -0.7824F, -0.311F);
        this.body.addChild(cube_r3);
        this.setRotateAngle(cube_r3, -0.0044F, 0.0F, 0.0F);
        this.cube_r3.cubeList.add(new ModelBox(cube_r3, 28, 38, 0.0F, 0.125F, -3.7F, 2, 1, 4, 0.0F, false));

        this.body2 = new AdvancedModelRenderer(this);
        this.body2.setRotationPoint(0.0F, 0.475F, -4.0F);
        this.body.addChild(body2);
        this.body2.cubeList.add(new ModelBox(body2, 0, 10, -2.5F, -0.975F, -3.5F, 5, 5, 4, -0.01F, false));

        this.cube_r4 = new AdvancedModelRenderer(this);
        this.cube_r4.setRotationPoint(0.0F, -1.1518F, 0.2385F);
        this.body2.addChild(cube_r4);
        this.setRotateAngle(cube_r4, 0.0349F, 0.0F, 0.0F);
        this.cube_r4.cubeList.add(new ModelBox(cube_r4, 13, 40, -1.0F, 0.0F, -4.1F, 2, 1, 4, -0.003F, false));

        this.body3 = new AdvancedModelRenderer(this);
        this.body3.setRotationPoint(0.0F, -1.025F, -3.0F);
        this.body2.addChild(body3);
        this.body3.cubeList.add(new ModelBox(body3, 19, 17, -2.0F, 0.175F, -2.95F, 4, 4, 3, 0.0F, false));
        this.body3.cubeList.add(new ModelBox(body3, 0, 41, -1.0F, 0.025F, -2.95F, 2, 1, 3, 0.003F, false));

        this.neck = new AdvancedModelRenderer(this);
        this.neck.setRotationPoint(0.0F, 0.1186F, -2.2519F);
        this.body3.addChild(neck);
        this.setRotateAngle(neck, -0.0654F, 0.0F, 0.0F);
        this.neck.cubeList.add(new ModelBox(neck, 30, 25, -1.5F, 0.15F, -4.0F, 3, 2, 4, -0.003F, false));

        this.cube_r5 = new AdvancedModelRenderer(this);
        this.cube_r5.setRotationPoint(-1.0F, 2.95F, 0.1F);
        this.neck.addChild(cube_r5);
        this.setRotateAngle(cube_r5, -0.0873F, 0.0F, 0.0F);
        this.cube_r5.cubeList.add(new ModelBox(cube_r5, 0, 28, -0.5F, -1.125F, -4.2F, 3, 2, 4, -0.006F, false));

        this.cube_r6 = new AdvancedModelRenderer(this);
        this.cube_r6.setRotationPoint(0.0F, 0.9F, -3.575F);
        this.neck.addChild(cube_r6);
        this.setRotateAngle(cube_r6, 0.0218F, 0.0F, 0.0F);
        this.cube_r6.cubeList.add(new ModelBox(cube_r6, 34, 16, -1.0F, -0.85F, -0.25F, 2, 1, 4, -0.003F, false));

        this.head = new AdvancedModelRenderer(this);
        this.head.setRotationPoint(0.0F, 0.1F, -3.75F);
        this.neck.addChild(head);
        this.setRotateAngle(head, 0.1789F, 0.0F, 0.0F);
        this.head.cubeList.add(new ModelBox(head, 47, 7, -1.5F, 0.0F, -2.0F, 3, 2, 2, 0.003F, false));
        this.head.cubeList.add(new ModelBox(head, 47, 16, -0.5F, 1.0F, -5.0F, 1, 1, 3, -0.003F, false));

        this.cube_r7 = new AdvancedModelRenderer(this);
        this.cube_r7.setRotationPoint(0.5F, 2.0F, -5.0F);
        this.head.addChild(cube_r7);
        this.setRotateAngle(cube_r7, -0.1745F, 0.0F, 0.0F);
        this.cube_r7.cubeList.add(new ModelBox(cube_r7, 15, 23, -1.0F, -0.75F, -0.85F, 1, 1, 0, 0.0F, false));
        this.cube_r7.cubeList.add(new ModelBox(cube_r7, 54, 29, -1.0F, -1.0F, -1.0F, 1, 1, 1, 0.0F, false));

        this.cube_r8 = new AdvancedModelRenderer(this);
        this.cube_r8.setRotationPoint(-0.5F, -0.155F, -1.9724F);
        this.head.addChild(cube_r8);
        this.setRotateAngle(cube_r8, -0.0436F, 0.0F, 0.0F);
        this.cube_r8.cubeList.add(new ModelBox(cube_r8, 0, 54, -0.5F, 0.0F, -0.05F, 2, 1, 2, -0.006F, false));

        this.cube_r9 = new AdvancedModelRenderer(this);
        this.cube_r9.setRotationPoint(0.0F, 0.5019F, -5.9623F);
        this.head.addChild(cube_r9);
        this.setRotateAngle(cube_r9, 0.7854F, 0.0F, 0.0F);
        this.cube_r9.cubeList.add(new ModelBox(cube_r9, 21, 55, -0.5F, 0.0F, -1.0F, 1, 1, 1, -0.003F, false));

        this.cube_r10 = new AdvancedModelRenderer(this);
        this.cube_r10.setRotationPoint(0.0F, 0.2431F, -4.9963F);
        this.head.addChild(cube_r10);
        this.setRotateAngle(cube_r10, 0.2618F, 0.0F, 0.0F);
        this.cube_r10.cubeList.add(new ModelBox(cube_r10, 54, 35, -0.5F, 0.0F, -1.0F, 1, 1, 1, 0.003F, false));

        this.cube_r11 = new AdvancedModelRenderer(this);
        this.cube_r11.setRotationPoint(-0.5F, 0.5F, -3.5F);
        this.head.addChild(cube_r11);
        this.setRotateAngle(cube_r11, 0.1309F, 0.0F, 0.0F);
        this.cube_r11.cubeList.add(new ModelBox(cube_r11, 20, 51, -0.5F, -0.45F, -0.45F, 2, 1, 2, 0.0F, false));
        this.cube_r11.cubeList.add(new ModelBox(cube_r11, 54, 32, 0.0F, -0.45F, -1.45F, 1, 1, 1, 0.0F, false));

        this.cube_r12 = new AdvancedModelRenderer(this);
        this.cube_r12.setRotationPoint(-1.5F, 2.0F, -2.0F);
        this.head.addChild(cube_r12);
        this.setRotateAngle(cube_r12, 0.0F, -0.2574F, 0.0F);
        this.cube_r12.cubeList.add(new ModelBox(cube_r12, 0, 49, 0.0F, -1.0F, -3.0F, 1, 1, 3, 0.0F, true));

        this.cube_r13 = new AdvancedModelRenderer(this);
        this.cube_r13.setRotationPoint(-0.7362F, 2.0F, -4.9011F);
        this.head.addChild(cube_r13);
        this.setRotateAngle(cube_r13, -0.1745F, -0.2574F, 0.0F);
        this.cube_r13.cubeList.add(new ModelBox(cube_r13, 54, 38, 0.0F, -1.0F, -1.0F, 1, 1, 1, -0.003F, true));

        this.cube_r14 = new AdvancedModelRenderer(this);
        this.cube_r14.setRotationPoint(0.7362F, 2.0F, -4.9011F);
        this.head.addChild(cube_r14);
        this.setRotateAngle(cube_r14, -0.1745F, 0.2574F, 0.0F);
        this.cube_r14.cubeList.add(new ModelBox(cube_r14, 54, 38, -1.0F, -1.0F, -1.0F, 1, 1, 1, -0.003F, false));

        this.cube_r15 = new AdvancedModelRenderer(this);
        this.cube_r15.setRotationPoint(-1.2454F, 1.0F, -2.967F);
        this.head.addChild(cube_r15);
        this.setRotateAngle(cube_r15, -0.0909F, -0.2412F, 0.3644F);
        this.cube_r15.cubeList.add(new ModelBox(cube_r15, 16, 55, 0.0F, -1.0F, 0.0F, 1, 1, 1, 0.0F, true));

        this.cube_r16 = new AdvancedModelRenderer(this);
        this.cube_r16.setRotationPoint(-0.8408F, 1.0F, -2.8347F);
        this.head.addChild(cube_r16);
        this.setRotateAngle(cube_r16, -0.068F, -0.2485F, 0.2703F);
        this.cube_r16.cubeList.add(new ModelBox(cube_r16, 31, 55, -0.5F, -0.5F, -0.5F, 1, 1, 1, 0.0F, true));

        this.cube_r17 = new AdvancedModelRenderer(this);
        this.cube_r17.setRotationPoint(0.8408F, 1.0F, -2.8347F);
        this.head.addChild(cube_r17);
        this.setRotateAngle(cube_r17, -0.068F, 0.2485F, -0.2703F);
        this.cube_r17.cubeList.add(new ModelBox(cube_r17, 31, 55, -0.5F, -0.5F, -0.5F, 1, 1, 1, 0.0F, false));

        this.cube_r18 = new AdvancedModelRenderer(this);
        this.cube_r18.setRotationPoint(1.2454F, 1.0F, -2.967F);
        this.head.addChild(cube_r18);
        this.setRotateAngle(cube_r18, -0.0909F, 0.2412F, -0.3644F);
        this.cube_r18.cubeList.add(new ModelBox(cube_r18, 16, 55, -1.0F, -1.0F, 0.0F, 1, 1, 1, 0.0F, false));

        this.cube_r19 = new AdvancedModelRenderer(this);
        this.cube_r19.setRotationPoint(-0.6346F, 1.675F, -3.3233F);
        this.head.addChild(cube_r19);
        this.setRotateAngle(cube_r19, 0.3152F, -0.2453F, -0.079F);
        this.cube_r19.cubeList.add(new ModelBox(cube_r19, 36, 55, -0.225F, -0.625F, -0.55F, 0, 1, 1, 0.0F, true));

        this.cube_r20 = new AdvancedModelRenderer(this);
        this.cube_r20.setRotationPoint(-0.38F, 1.575F, -4.5653F);
        this.head.addChild(cube_r20);
        this.setRotateAngle(cube_r20, 0.7418F, -0.2574F, 0.1527F);
        this.cube_r20.cubeList.add(new ModelBox(cube_r20, 37, 47, -0.25F, -0.4F, -0.65F, 0, 1, 1, 0.0F, true));

        this.cube_r21 = new AdvancedModelRenderer(this);
        this.cube_r21.setRotationPoint(0.38F, 1.575F, -4.5653F);
        this.head.addChild(cube_r21);
        this.setRotateAngle(cube_r21, 0.7418F, 0.2574F, -0.1527F);
        this.cube_r21.cubeList.add(new ModelBox(cube_r21, 37, 47, 0.25F, -0.4F, -0.65F, 0, 1, 1, 0.0F, false));

        this.cube_r22 = new AdvancedModelRenderer(this);
        this.cube_r22.setRotationPoint(0.6346F, 1.675F, -3.3233F);
        this.head.addChild(cube_r22);
        this.setRotateAngle(cube_r22, 0.3152F, 0.2453F, 0.079F);
        this.cube_r22.cubeList.add(new ModelBox(cube_r22, 36, 55, 0.225F, -0.625F, -0.55F, 0, 1, 1, 0.0F, false));

        this.cube_r23 = new AdvancedModelRenderer(this);
        this.cube_r23.setRotationPoint(1.5F, 2.0F, -2.0F);
        this.head.addChild(cube_r23);
        this.setRotateAngle(cube_r23, 0.0F, 0.2574F, 0.0F);
        this.cube_r23.cubeList.add(new ModelBox(cube_r23, 0, 49, -1.0F, -1.0F, -3.0F, 1, 1, 3, 0.0F, false));

        this.jaw = new AdvancedModelRenderer(this);
        this.jaw.setRotationPoint(-1.0F, 2.0F, -0.25F);
        this.head.addChild(jaw);
        this.jaw.cubeList.add(new ModelBox(jaw, 47, 12, -0.5F, 0.0F, -1.75F, 3, 1, 2, 0.0F, false));
        this.jaw.cubeList.add(new ModelBox(jaw, 52, 47, -0.5F, -1.0F, -1.0F, 3, 1, 1, 0.0F, false));
        this.jaw.cubeList.add(new ModelBox(jaw, 37, 50, 0.5F, 0.0F, -4.75F, 1, 1, 3, -0.01F, false));

        this.cube_r24 = new AdvancedModelRenderer(this);
        this.cube_r24.setRotationPoint(0.5F, 1.5091F, -1.9803F);
        this.jaw.addChild(cube_r24);
        this.setRotateAngle(cube_r24, 0.0873F, 0.0F, 0.0F);
        this.cube_r24.cubeList.add(new ModelBox(cube_r24, 52, 43, -0.5F, -1.0F, 0.0F, 2, 1, 2, 0.0F, false));

        this.cube_r25 = new AdvancedModelRenderer(this);
        this.cube_r25.setRotationPoint(1.0F, 1.2481F, -3.9632F);
        this.jaw.addChild(cube_r25);
        this.setRotateAngle(cube_r25, -0.1309F, 0.0F, 0.0F);
        this.cube_r25.cubeList.add(new ModelBox(cube_r25, 9, 54, -0.5F, -1.0F, 0.0F, 1, 1, 2, 0.003F, false));

        this.cube_r26 = new AdvancedModelRenderer(this);
        this.cube_r26.setRotationPoint(1.0F, 1.0F, -4.75F);
        this.jaw.addChild(cube_r26);
        this.setRotateAngle(cube_r26, -0.3054F, 0.0F, 0.0F);
        this.cube_r26.cubeList.add(new ModelBox(cube_r26, 29, 51, -0.5F, -1.0F, -1.175F, 1, 1, 2, -0.003F, false));

        this.cube_r27 = new AdvancedModelRenderer(this);
        this.cube_r27.setRotationPoint(0.2638F, 1.0F, -4.6511F);
        this.jaw.addChild(cube_r27);
        this.setRotateAngle(cube_r27, -0.2939F, -0.2359F, 0.0779F);
        this.cube_r27.cubeList.add(new ModelBox(cube_r27, 26, 55, -0.025F, -1.0F, -1.0F, 1, 1, 1, 0.0F, true));

        this.cube_r28 = new AdvancedModelRenderer(this);
        this.cube_r28.setRotationPoint(1.7362F, 1.0F, -4.6511F);
        this.jaw.addChild(cube_r28);
        this.setRotateAngle(cube_r28, -0.2939F, 0.2359F, -0.0779F);
        this.cube_r28.cubeList.add(new ModelBox(cube_r28, 26, 55, -0.975F, -1.0F, -1.0F, 1, 1, 1, 0.0F, false));

        this.cube_r29 = new AdvancedModelRenderer(this);
        this.cube_r29.setRotationPoint(-0.25F, 0.0F, -1.75F);
        this.jaw.addChild(cube_r29);
        this.setRotateAngle(cube_r29, -0.0283F, -0.2119F, 0.1339F);
        this.cube_r29.cubeList.add(new ModelBox(cube_r29, 20, 46, -0.0443F, -1.85F, -1.222F, 0, 2, 2, 0.0F, true));

        this.cube_r30 = new AdvancedModelRenderer(this);
        this.cube_r30.setRotationPoint(2.25F, 0.0F, -1.75F);
        this.jaw.addChild(cube_r30);
        this.setRotateAngle(cube_r30, -0.0283F, 0.2119F, -0.1339F);
        this.cube_r30.cubeList.add(new ModelBox(cube_r30, 20, 46, 0.0443F, -1.85F, -1.222F, 0, 2, 2, 0.0F, false));

        this.cube_r31 = new AdvancedModelRenderer(this);
        this.cube_r31.setRotationPoint(0.3541F, 0.35F, -4.1103F);
        this.jaw.addChild(cube_r31);
        this.setRotateAngle(cube_r31, 0.0F, -0.2574F, 0.0F);
        this.cube_r31.cubeList.add(new ModelBox(cube_r31, 15, 20, 0.0F, -0.5F, 0.4F, 0, 1, 1, 0.0F, true));

        this.cube_r32 = new AdvancedModelRenderer(this);
        this.cube_r32.setRotationPoint(0.6341F, 0.35F, -5.1741F);
        this.jaw.addChild(cube_r32);
        this.setRotateAngle(cube_r32, -0.2705F, -0.2574F, 0.0F);
        this.cube_r32.cubeList.add(new ModelBox(cube_r32, 37, 44, 0.0F, -0.675F, -0.475F, 0, 1, 1, 0.0F, true));

        this.cube_r33 = new AdvancedModelRenderer(this);
        this.cube_r33.setRotationPoint(1.3659F, 0.35F, -5.1741F);
        this.jaw.addChild(cube_r33);
        this.setRotateAngle(cube_r33, -0.2705F, 0.2574F, 0.0F);
        this.cube_r33.cubeList.add(new ModelBox(cube_r33, 37, 44, 0.0F, -0.675F, -0.475F, 0, 1, 1, 0.0F, false));

        this.cube_r34 = new AdvancedModelRenderer(this);
        this.cube_r34.setRotationPoint(1.6459F, 0.35F, -4.1103F);
        this.jaw.addChild(cube_r34);
        this.setRotateAngle(cube_r34, 0.0F, 0.2574F, 0.0F);
        this.cube_r34.cubeList.add(new ModelBox(cube_r34, 15, 20, 0.0F, -0.5F, 0.4F, 0, 1, 1, 0.0F, false));

        this.cube_r35 = new AdvancedModelRenderer(this);
        this.cube_r35.setRotationPoint(-0.5F, 0.0F, -1.75F);
        this.jaw.addChild(cube_r35);
        this.setRotateAngle(cube_r35, 0.0F, -0.2574F, 0.0F);
        this.cube_r35.cubeList.add(new ModelBox(cube_r35, 46, 50, 0.0F, 0.0F, -3.0F, 1, 1, 3, -0.006F, true));

        this.cube_r36 = new AdvancedModelRenderer(this);
        this.cube_r36.setRotationPoint(2.5F, 0.0F, -1.75F);
        this.jaw.addChild(cube_r36);
        this.setRotateAngle(cube_r36, 0.0F, 0.2574F, 0.0F);
        this.cube_r36.cubeList.add(new ModelBox(cube_r36, 46, 50, -1.0F, 0.0F, -3.0F, 1, 1, 3, -0.003F, false));

        this.frontLeftLeg = new AdvancedModelRenderer(this);
        this.frontLeftLeg.setRotationPoint(1.9F, 2.5076F, -1.4479F);
        this.body3.addChild(frontLeftLeg);
        this.setRotateAngle(frontLeftLeg, 0.3403F, 0.0F, 0.0F);
        this.frontLeftLeg.cubeList.add(new ModelBox(frontLeftLeg, 47, 0, -0.7F, -0.5F, -0.6F, 2, 4, 2, 0.0F, false));

        this.frontLeftLeg2 = new AdvancedModelRenderer(this);
        this.frontLeftLeg2.setRotationPoint(0.8F, 3.4451F, 1.0102F);
        this.frontLeftLeg.addChild(frontLeftLeg2);
        this.setRotateAngle(frontLeftLeg2, -0.6109F, 0.0F, 0.0F);
        this.frontLeftLeg2.cubeList.add(new ModelBox(frontLeftLeg2, 45, 29, -1.5F, -0.25F, -1.75F, 2, 5, 2, 0.001F, false));

        this.frontLeftLeg3 = new AdvancedModelRenderer(this);
        this.frontLeftLeg3.setRotationPoint(0.0F, 3.9538F, -0.4668F);
        this.frontLeftLeg2.addChild(frontLeftLeg3);
        this.setRotateAngle(frontLeftLeg3, 0.2531F, 0.0F, 0.0F);
        this.frontLeftLeg3.cubeList.add(new ModelBox(frontLeftLeg3, 41, 38, -2.0F, -0.025F, -2.6F, 3, 1, 3, 0.01F, false));

        this.frontRightLeg = new AdvancedModelRenderer(this);
        this.frontRightLeg.setRotationPoint(-1.9F, 2.5076F, -1.4479F);
        this.body3.addChild(frontRightLeg);
        this.setRotateAngle(frontRightLeg, 0.3403F, 0.0F, 0.0F);
        this.frontRightLeg.cubeList.add(new ModelBox(frontRightLeg, 47, 0, -1.3F, -0.5F, -0.6F, 2, 4, 2, 0.0F, true));

        this.frontRightLeg2 = new AdvancedModelRenderer(this);
        this.frontRightLeg2.setRotationPoint(-0.8F, 3.4451F, 1.0102F);
        this.frontRightLeg.addChild(frontRightLeg2);
        this.setRotateAngle(frontRightLeg2, -0.6109F, 0.0F, 0.0F);
        this.frontRightLeg2.cubeList.add(new ModelBox(frontRightLeg2, 45, 29, -0.5F, -0.25F, -1.75F, 2, 5, 2, 0.001F, true));

        this.frontRightLeg3 = new AdvancedModelRenderer(this);
        this.frontRightLeg3.setRotationPoint(0.0F, 3.9538F, -0.4668F);
        this.frontRightLeg2.addChild(frontRightLeg3);
        this.setRotateAngle(frontRightLeg3, 0.2531F, 0.0F, 0.0F);
        this.frontRightLeg3.cubeList.add(new ModelBox(frontRightLeg3, 41, 38, -1.0F, -0.025F, -2.6F, 3, 1, 3, 0.01F, true));

        this.tail = new AdvancedModelRenderer(this);
        this.tail.setRotationPoint(0.0F, 0.5783F, 3.3835F);
        this.main.addChild(tail);
        this.setRotateAngle(tail, -0.1309F, 0.0F, 0.0F);
        this.tail.cubeList.add(new ModelBox(tail, 0, 20, -1.5F, 0.0F, 0.025F, 3, 3, 4, 0.0F, false));

        this.cube_r37 = new AdvancedModelRenderer(this);
        this.cube_r37.setRotationPoint(-1.0F, 0.2F, 0.0F);
        this.tail.addChild(cube_r37);
        this.setRotateAngle(cube_r37, -0.0131F, 0.0F, 0.0F);
        this.cube_r37.cubeList.add(new ModelBox(cube_r37, 45, 23, 0.5F, -0.575F, 0.025F, 1, 1, 4, 0.0F, false));

        this.tail2 = new AdvancedModelRenderer(this);
        this.tail2.setRotationPoint(0.0F, 0.0065F, 3.5496F);
        this.tail.addChild(tail2);
        this.setRotateAngle(tail2, -0.0873F, 0.0F, 0.0F);
        this.tail2.cubeList.add(new ModelBox(tail2, 15, 25, -1.0F, 0.0F, 0.025F, 2, 2, 5, -0.001F, false));
        this.tail2.cubeList.add(new ModelBox(tail2, 15, 33, -0.5F, -0.325F, 0.025F, 1, 1, 5, -0.002F, false));

        this.tail3 = new AdvancedModelRenderer(this);
        this.tail3.setRotationPoint(0.0F, 0.25F, 4.5F);
        this.tail2.addChild(tail3);
        this.setRotateAngle(tail3, -0.0436F, 0.0F, 0.0F);
        this.tail3.cubeList.add(new ModelBox(tail3, 34, 9, -0.5F, 0.0F, 0.025F, 1, 1, 5, 0.0F, false));
        this.tail3.cubeList.add(new ModelBox(tail3, 41, 43, 0.0F, -0.5F, 0.025F, 0, 1, 5, 0.0F, false));

        this.tail4 = new AdvancedModelRenderer(this);
        this.tail4.setRotationPoint(0.0F, 0.0F, 4.75F);
        this.tail3.addChild(tail4);
        this.setRotateAngle(tail4, 0.1745F, 0.0F, 0.0F);
        this.tail4.cubeList.add(new ModelBox(tail4, 19, 9, -0.5F, 0.0F, 0.025F, 1, 1, 6, -0.001F, false));

        this.cube_r38 = new AdvancedModelRenderer(this);
        this.cube_r38.setRotationPoint(-0.5F, -0.4224F, 0.0762F);
        this.tail4.addChild(cube_r38);
        this.setRotateAngle(cube_r38, -0.0785F, 0.0F, 0.0F);
        this.cube_r38.cubeList.add(new ModelBox(cube_r38, 26, 44, 0.525F, 0.0F, 0.0F, 0, 1, 5, 0.0F, false));

        this.grub = new AdvancedModelRenderer(this);
        this.grub.setRotationPoint(0.5F, 2.3608F, -5.9176F);
        this.main.addChild(grub);
        this.grub.cubeList.add(new ModelBox(grub, 47, 56, -0.5F, -0.5F, -2.05F, 1, 1, 2, 0.0F, false));

        this.grub2 = new AdvancedModelRenderer(this);
        this.grub2.setRotationPoint(0.0F, 0.0F, 0.05F);
        this.grub.addChild(grub2);
        this.grub2.cubeList.add(new ModelBox(grub2, 47, 59, -0.5F, -0.5F, -0.1F, 1, 1, 2, 0.0F, false));


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
        this.main.offsetY = -1.10F;
        this.main.offsetX = -0.25F;
        this.main.rotateAngleY = (float)Math.toRadians(222);
        this.main.rotateAngleX = (float)Math.toRadians(8);
        this.main.rotateAngleZ = (float)Math.toRadians(-8);
        this.main.scaleChildren = true;
        float scaler = 1.53F;
        this.main.setScale(scaler, scaler, scaler);
        //Start of pose:

        //End of pose, now render the model:
        this.main.render(f);
        //Reset rotations, positions and sizing:
        this.main.setScale(1.0F, 1.0F, 1.0F);
        this.main.scaleChildren = false;
        resetToDefaultPose();

    }

    public void renderStaticFloor(float f) {
        this.main.render(0.01F);
        resetToDefaultPose();
    }

    //    public void renderStaticWall(float f) {
//
//        resetToDefaultPose();
//    }

    public void setRotateAngle(AdvancedModelRenderer AdvancedModelRenderer, float x, float y, float z) {
        AdvancedModelRenderer.rotateAngleX = x;
        AdvancedModelRenderer.rotateAngleY = y;
        AdvancedModelRenderer.rotateAngleZ = z;
    }

    @Override
    public void setRotationAngles(float f, float f1, float f2, float f3, float f4, float f5, Entity e) {
        super.setRotationAngles(f, f1, f2, f3, f4, f5, e);
        //this.resetToDefaultPose();
        this.main.offsetZ = -0.2F;

        EntityPrehistoricFloraCandidodon proteros = (EntityPrehistoricFloraCandidodon) e;

        this.faceTarget(f3, f4, 10, body3);
        this.faceTarget(f3, f4, 10, head);

        AdvancedModelRenderer[] Tail = {this.tail, this.tail2, this.tail3, this.tail4};
        AdvancedModelRenderer[] Neck = {this.neck, this.head};
        //AdvancedModelRenderer[] ArmL = {this.leftarm, this.leftarm2, this.leftarm3};
        //AdvancedModelRenderer[] ArmR = {this.rightarm, this.rightarm2, this.rightarm3};

        if (proteros.getAnimation() == proteros.LAY_ANIMATION) {
            this.chainSwing(Neck, 0.5F, 0.10F, 0.5, f2, 0.8F);
            this.chainWave(Neck, 0.5F * 2, -0.02F, 0.5F, f2, 0.8F);
        }
        else {
            if (!proteros.isReallyInWater()) {

                if (f3 == 0.0F || !proteros.getIsMoving()) {
                    if (proteros.getAnimation() != proteros.EAT_ANIMATION
                        && proteros.getAnimation() != proteros.DRINK_ANIMATION) {
                        this.chainSwing(Neck, 0.05F, 0.10F, 0.5, f2, 0.8F);
                        this.chainWave(Neck, 0.05F * 2, -0.02F, 0.5F, f2, 0.8F);
                    }

                    this.chainWave(Tail, (0.15F * 0.35F), 0.125F * 0.15F, 0.2F, f2, 1F);
                    this.chainSwing(Tail, (0.15F * 0.35F) * 4F, 0.05F * 0.35F, 0.12F, f2, 1F);


                    return;
                }

            }
        }
    }


    @Override
    public void setLivingAnimations(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime) {
        super.setLivingAnimations(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime);
        this.resetToDefaultPose();
        EntityPrehistoricFloraCandidodon ee = (EntityPrehistoricFloraCandidodon) entitylivingbaseIn;

        if (!ee.isReallyInWater()) {
            if (ee.getIsMoving()) {
                if (ee.getIsFast()) { //Running
                    animRunning(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime);
                } else { //Walking
                    animWalking(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime);
                }
            }
        }
        else {
            //Swimming pose:
            if (!ee.getIsMoving()) { //static in water
                //
            }
            else {
                //moving in water
                //
            }
        }
        if (ee.getAnimation() == ee.EAT_ANIMATION) {
            animEat(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime, ee.getAnimationTick());
        }
        else if (ee.getAnimation() == ee.ATTACK_ANIMATION) {
            animAttack(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime, ee.getAnimationTick());
        }
        else if (ee.getAnimation() == ee.LAY_ANIMATION) {
            animLay(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime, ee.getAnimationTick());
        }
        else if (ee.getAnimation() == ee.MAKE_NEST_ANIMATION) {
            animNest(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime, ee.getAnimationTick());
        }
        else if (ee.getAnimation() == ee.ROAR_ANIMATION) { //The noise anim
            animNoise(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime, ee.getAnimationTick());
        }
        else if (ee.getAnimation() == ee.STAND_ANIMATION) { //The noise anim
            animIdle(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime, ee.getAnimationTick());
        }



    }
    public void animNest(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime, double animTick) {
        EntityPrehistoricFloraCandidodon entity = (EntityPrehistoricFloraCandidodon) entitylivingbaseIn;
        int animCycle = 50;
        double tickAnim = animTick + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;
         if (tickAnim >= 0 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 0) / 15) * (37-(0)));
            yy = 0 + (((tickAnim - 0) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 15) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 25) {
            xx = 37 + (((tickAnim - 15) / 10) * (0-(37)));
            yy = 0 + (((tickAnim - 15) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 10) * (0-(0)));
        }
        else if (tickAnim >= 25 && tickAnim < 35) {
            xx = 0 + (((tickAnim - 25) / 10) * (37-(0)));
            yy = 0 + (((tickAnim - 25) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 25) / 10) * (0-(0)));
        }
        else if (tickAnim >= 35 && tickAnim < 50) {
            xx = 37 + (((tickAnim - 35) / 15) * (0-(37)));
            yy = 0 + (((tickAnim - 35) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 35) / 15) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(backLeftLeg, backLeftLeg.rotateAngleX + (float) Math.toRadians(xx), backLeftLeg.rotateAngleY + (float) Math.toRadians(yy), backLeftLeg.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 0) / 15) * (20.5-(0)));
            yy = 0 + (((tickAnim - 0) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 15) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 20) {
            xx = 20.5 + (((tickAnim - 15) / 5) * (-8.75-(20.5)));
            yy = 0 + (((tickAnim - 15) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 5) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 25) {
            xx = -8.75 + (((tickAnim - 20) / 5) * (0-(-8.75)));
            yy = 0 + (((tickAnim - 20) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 5) * (0-(0)));
        }
        else if (tickAnim >= 25 && tickAnim < 35) {
            xx = 0 + (((tickAnim - 25) / 10) * (20.5-(0)));
            yy = 0 + (((tickAnim - 25) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 25) / 10) * (0-(0)));
        }
        else if (tickAnim >= 35 && tickAnim < 43) {
            xx = 20.5 + (((tickAnim - 35) / 8) * (-8.75-(20.5)));
            yy = 0 + (((tickAnim - 35) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 35) / 8) * (0-(0)));
        }
        else if (tickAnim >= 43 && tickAnim < 50) {
            xx = -8.75 + (((tickAnim - 43) / 7) * (0-(-8.75)));
            yy = 0 + (((tickAnim - 43) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 43) / 7) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(backLeftLeg2, backLeftLeg2.rotateAngleX + (float) Math.toRadians(xx), backLeftLeg2.rotateAngleY + (float) Math.toRadians(yy), backLeftLeg2.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 0) / 15) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 15) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 15) / 5) * (0-(0)));
            yy = 0 + (((tickAnim - 15) / 5) * (1.3-(0)));
            zz = 0 + (((tickAnim - 15) / 5) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 25) {
            xx = 0 + (((tickAnim - 20) / 5) * (0-(0)));
            yy = 1.3 + (((tickAnim - 20) / 5) * (0-(1.3)));
            zz = 0 + (((tickAnim - 20) / 5) * (0-(0)));
        }
        else if (tickAnim >= 25 && tickAnim < 35) {
            xx = 0 + (((tickAnim - 25) / 10) * (0-(0)));
            yy = 0 + (((tickAnim - 25) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 25) / 10) * (0-(0)));
        }
        else if (tickAnim >= 35 && tickAnim < 43) {
            xx = 0 + (((tickAnim - 35) / 8) * (0-(0)));
            yy = 0 + (((tickAnim - 35) / 8) * (1.3-(0)));
            zz = 0 + (((tickAnim - 35) / 8) * (0-(0)));
        }
        else if (tickAnim >= 43 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 43) / 7) * (0-(0)));
            yy = 1.3 + (((tickAnim - 43) / 7) * (0-(1.3)));
            zz = 0 + (((tickAnim - 43) / 7) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.backLeftLeg2.rotationPointX = this.backLeftLeg2.rotationPointX + (float)(xx);
        this.backLeftLeg2.rotationPointY = this.backLeftLeg2.rotationPointY - (float)(yy);
        this.backLeftLeg2.rotationPointZ = this.backLeftLeg2.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 0) / 5) * (4.58-(0)));
            yy = 0 + (((tickAnim - 0) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 5) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 15) {
            xx = 4.58 + (((tickAnim - 5) / 10) * (60.25-(4.58)));
            yy = 0 + (((tickAnim - 5) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 5) / 10) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 20) {
            xx = 60.25 + (((tickAnim - 15) / 5) * (39.88-(60.25)));
            yy = 0 + (((tickAnim - 15) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 5) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 25) {
            xx = 39.88 + (((tickAnim - 20) / 5) * (0-(39.88)));
            yy = 0 + (((tickAnim - 20) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 5) * (0-(0)));
        }
        else if (tickAnim >= 25 && tickAnim < 30) {
            xx = 0 + (((tickAnim - 25) / 5) * (9.63-(0)));
            yy = 0 + (((tickAnim - 25) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 25) / 5) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 35) {
            xx = 9.63 + (((tickAnim - 30) / 5) * (60.25-(9.63)));
            yy = 0 + (((tickAnim - 30) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 30) / 5) * (0-(0)));
        }
        else if (tickAnim >= 35 && tickAnim < 43) {
            xx = 60.25 + (((tickAnim - 35) / 8) * (39.88-(60.25)));
            yy = 0 + (((tickAnim - 35) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 35) / 8) * (0-(0)));
        }
        else if (tickAnim >= 43 && tickAnim < 50) {
            xx = 39.88 + (((tickAnim - 43) / 7) * (0-(39.88)));
            yy = 0 + (((tickAnim - 43) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 43) / 7) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(backLeftLeg3, backLeftLeg3.rotateAngleX + (float) Math.toRadians(xx), backLeftLeg3.rotateAngleY + (float) Math.toRadians(yy), backLeftLeg3.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 0) / 15) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 15) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 15) / 5) * (0-(0)));
            yy = 0 + (((tickAnim - 15) / 5) * (0.775-(0)));
            zz = 0 + (((tickAnim - 15) / 5) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 25) {
            xx = 0 + (((tickAnim - 20) / 5) * (0-(0)));
            yy = 0.775 + (((tickAnim - 20) / 5) * (0-(0.775)));
            zz = 0 + (((tickAnim - 20) / 5) * (0-(0)));
        }
        else if (tickAnim >= 25 && tickAnim < 35) {
            xx = 0 + (((tickAnim - 25) / 10) * (0-(0)));
            yy = 0 + (((tickAnim - 25) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 25) / 10) * (0-(0)));
        }
        else if (tickAnim >= 35 && tickAnim < 43) {
            xx = 0 + (((tickAnim - 35) / 8) * (0-(0)));
            yy = 0 + (((tickAnim - 35) / 8) * (0.775-(0)));
            zz = 0 + (((tickAnim - 35) / 8) * (0-(0)));
        }
        else if (tickAnim >= 43 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 43) / 7) * (0-(0)));
            yy = 0.775 + (((tickAnim - 43) / 7) * (0-(0.775)));
            zz = 0 + (((tickAnim - 43) / 7) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.backLeftLeg3.rotationPointX = this.backLeftLeg3.rotationPointX + (float)(xx);
        this.backLeftLeg3.rotationPointY = this.backLeftLeg3.rotationPointY - (float)(yy);
        this.backLeftLeg3.rotationPointZ = this.backLeftLeg3.rotationPointZ + (float)(zz);
       

    }
    public void animAttack(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime, double animTick) {
        EntityPrehistoricFloraCandidodon entity = (EntityPrehistoricFloraCandidodon) entitylivingbaseIn;
        int animCycle = 10;
        double tickAnim = animTick + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;
         if (tickAnim >= 0 && tickAnim < 3) {
            xx = 0 + (((tickAnim - 0) / 3) * (3.5-(0)));
            yy = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 3) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 5) {
            xx = 3.5 + (((tickAnim - 3) / 2) * (-3.5-(3.5)));
            yy = 0 + (((tickAnim - 3) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 3) / 2) * (-3.5-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 8) {
            xx = -3.5 + (((tickAnim - 5) / 3) * (-1.5-(-3.5)));
            yy = 0 + (((tickAnim - 5) / 3) * (0-(0)));
            zz = -3.5 + (((tickAnim - 5) / 3) * (0-(-3.5)));
        }
        else if (tickAnim >= 8 && tickAnim < 10) {
            xx = -1.5 + (((tickAnim - 8) / 2) * (0-(-1.5)));
            yy = 0 + (((tickAnim - 8) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 2) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck, neck.rotateAngleX + (float) Math.toRadians(xx), neck.rotateAngleY + (float) Math.toRadians(yy), neck.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 0 + (((tickAnim - 0) / 3) * (-7-(0)));
            yy = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 3) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 5) {
            xx = -7 + (((tickAnim - 3) / 2) * (-11.5-(-7)));
            yy = 0 + (((tickAnim - 3) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 3) / 2) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 8) {
            xx = -11.5 + (((tickAnim - 5) / 3) * (-5-(-11.5)));
            yy = 0 + (((tickAnim - 5) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 5) / 3) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 10) {
            xx = -5 + (((tickAnim - 8) / 2) * (0-(-5)));
            yy = 0 + (((tickAnim - 8) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 2) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(head, head.rotateAngleX + (float) Math.toRadians(xx), head.rotateAngleY + (float) Math.toRadians(yy), head.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 0 + (((tickAnim - 0) / 3) * (5.75-(0)));
            yy = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 3) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 5) {
            xx = 5.75 + (((tickAnim - 3) / 2) * (26.75-(5.75)));
            yy = 0 + (((tickAnim - 3) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 3) / 2) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 8) {
            xx = 26.75 + (((tickAnim - 5) / 3) * (0-(26.75)));
            yy = 0 + (((tickAnim - 5) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 5) / 3) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(jaw, jaw.rotateAngleX + (float) Math.toRadians(xx), jaw.rotateAngleY + (float) Math.toRadians(yy), jaw.rotateAngleZ + (float) Math.toRadians(zz));
    }
    public void animNoise(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime, double animTick) {
        EntityPrehistoricFloraCandidodon entity = (EntityPrehistoricFloraCandidodon) entitylivingbaseIn;
        int animCycle = 20;
        double tickAnim = animTick + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;
         if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 0) / 10) * (-2.25-(0)));
            yy = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 20) {
            xx = -2.25 + (((tickAnim - 10) / 10) * (0-(-2.25)));
            yy = 0 + (((tickAnim - 10) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 10) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck, neck.rotateAngleX + (float) Math.toRadians(xx), neck.rotateAngleY + (float) Math.toRadians(yy), neck.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 0) / 10) * (-6.5-(0)));
            yy = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 20) {
            xx = -6.5 + (((tickAnim - 10) / 10) * (0-(-6.5)));
            yy = 0 + (((tickAnim - 10) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 10) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(head, head.rotateAngleX + (float) Math.toRadians(xx), head.rotateAngleY + (float) Math.toRadians(yy), head.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 0) / 10) * (16.75-(0)));
            yy = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 15) {
            xx = 16.75 + (((tickAnim - 10) / 5) * (0-(16.75)));
            yy = 0 + (((tickAnim - 10) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 5) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(jaw, jaw.rotateAngleX + (float) Math.toRadians(xx), jaw.rotateAngleY + (float) Math.toRadians(yy), jaw.rotateAngleZ + (float) Math.toRadians(zz));


    }
    public void animEat(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime, double animTick) {
        EntityPrehistoricFloraCandidodon entity = (EntityPrehistoricFloraCandidodon) entitylivingbaseIn;
        int animCycle = 20;
        double tickAnim = animTick + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;
         if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 0) / 10) * (11.25-(0)));
            yy = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 20) {
            xx = 11.25 + (((tickAnim - 10) / 10) * (0-(11.25)));
            yy = 0 + (((tickAnim - 10) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 10) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(body3, body3.rotateAngleX + (float) Math.toRadians(xx), body3.rotateAngleY + (float) Math.toRadians(yy), body3.rotateAngleZ + (float) Math.toRadians(zz));

        this.body3.rotationPointX = this.body3.rotationPointX + (float)(0);
        this.body3.rotationPointY = this.body3.rotationPointY - (float)(0);
        this.body3.rotationPointZ = this.body3.rotationPointZ + (float)(0);



        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 0) / 10) * (15.25-(0)));
            yy = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 20) {
            xx = 15.25 + (((tickAnim - 10) / 10) * (0-(15.25)));
            yy = 0 + (((tickAnim - 10) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 10) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck, neck.rotateAngleX + (float) Math.toRadians(xx), neck.rotateAngleY + (float) Math.toRadians(yy), neck.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 0) / 5) * (18.22687-(0)));
            yy = 0 + (((tickAnim - 0) / 5) * (0.70808-(0)));
            zz = 0 + (((tickAnim - 0) / 5) * (-1.87065-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 10) {
            xx = 18.22687 + (((tickAnim - 5) / 5) * (10.45375-(18.22687)));
            yy = 0.70808 + (((tickAnim - 5) / 5) * (1.41616-(0.70808)));
            zz = -1.87065 + (((tickAnim - 5) / 5) * (-3.7413-(-1.87065)));
        }
        else if (tickAnim >= 10 && tickAnim < 20) {
            xx = 10.45375 + (((tickAnim - 10) / 10) * (0-(10.45375)));
            yy = 1.41616 + (((tickAnim - 10) / 10) * (0-(1.41616)));
            zz = -3.7413 + (((tickAnim - 10) / 10) * (0-(-3.7413)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(head, head.rotateAngleX + (float) Math.toRadians(xx), head.rotateAngleY + (float) Math.toRadians(yy), head.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 0) / 5) * (26.75-(0)));
            yy = 0 + (((tickAnim - 0) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 5) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 10) {
            xx = 26.75 + (((tickAnim - 5) / 5) * (0-(26.75)));
            yy = 0 + (((tickAnim - 5) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 5) / 5) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(jaw, jaw.rotateAngleX + (float) Math.toRadians(xx), jaw.rotateAngleY + (float) Math.toRadians(yy), jaw.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 0) / 5) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 5) * (0.175-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 5) / 5) * (0-(0)));
            yy = 0 + (((tickAnim - 5) / 5) * (0-(0)));
            zz = 0.175 + (((tickAnim - 5) / 5) * (-0.125-(0.175)));
        }
        else if (tickAnim >= 10 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 10) / 5) * (0-(0)));
            yy = 0 + (((tickAnim - 10) / 5) * (0-(0)));
            zz = -0.125 + (((tickAnim - 10) / 5) * (0-(-0.125)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.jaw.rotationPointX = this.jaw.rotationPointX + (float)(xx);
        this.jaw.rotationPointY = this.jaw.rotationPointY - (float)(yy);
        this.jaw.rotationPointZ = this.jaw.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 0) / 10) * (-12.5-(0)));
            yy = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 20) {
            xx = -12.5 + (((tickAnim - 10) / 10) * (0-(-12.5)));
            yy = 0 + (((tickAnim - 10) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 10) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(frontLeftLeg, frontLeftLeg.rotateAngleX + (float) Math.toRadians(xx), frontLeftLeg.rotateAngleY + (float) Math.toRadians(yy), frontLeftLeg.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 0) / 10) * (-6.75-(0)));
            yy = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 20) {
            xx = -6.75 + (((tickAnim - 10) / 10) * (0-(-6.75)));
            yy = 0 + (((tickAnim - 10) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 10) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(frontLeftLeg2, frontLeftLeg2.rotateAngleX + (float) Math.toRadians(xx), frontLeftLeg2.rotateAngleY + (float) Math.toRadians(yy), frontLeftLeg2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 0) / 10) * (10-(0)));
            yy = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 20) {
            xx = 10 + (((tickAnim - 10) / 10) * (0-(10)));
            yy = 0 + (((tickAnim - 10) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 10) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(frontLeftLeg3, frontLeftLeg3.rotateAngleX + (float) Math.toRadians(xx), frontLeftLeg3.rotateAngleY + (float) Math.toRadians(yy), frontLeftLeg3.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 0) / 10) * (-12.5-(0)));
            yy = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 20) {
            xx = -12.5 + (((tickAnim - 10) / 10) * (0-(-12.5)));
            yy = 0 + (((tickAnim - 10) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 10) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(frontRightLeg, frontRightLeg.rotateAngleX + (float) Math.toRadians(xx), frontRightLeg.rotateAngleY + (float) Math.toRadians(yy), frontRightLeg.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 0) / 10) * (-6.75-(0)));
            yy = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 20) {
            xx = -6.75 + (((tickAnim - 10) / 10) * (0-(-6.75)));
            yy = 0 + (((tickAnim - 10) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 10) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(frontRightLeg2, frontRightLeg2.rotateAngleX + (float) Math.toRadians(xx), frontRightLeg2.rotateAngleY + (float) Math.toRadians(yy), frontRightLeg2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 0) / 10) * (10-(0)));
            yy = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 20) {
            xx = 10 + (((tickAnim - 10) / 10) * (0-(10)));
            yy = 0 + (((tickAnim - 10) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 10) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(frontRightLeg3, frontRightLeg3.rotateAngleX + (float) Math.toRadians(xx), frontRightLeg3.rotateAngleY + (float) Math.toRadians(yy), frontRightLeg3.rotateAngleZ + (float) Math.toRadians(zz));


    }
    public void animLay(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime, double animTick) {
        EntityPrehistoricFloraCandidodon entity = (EntityPrehistoricFloraCandidodon) entitylivingbaseIn;
        int animCycle = 50;
        double tickAnim = animTick + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;
         if (tickAnim >= 0 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 0) / 15) * (-11.5-(0)));
            yy = 0 + (((tickAnim - 0) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 15) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 35) {
            xx = -11.5 + (((tickAnim - 15) / 20) * (-11.5-(-11.5)));
            yy = 0 + (((tickAnim - 15) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 20) * (0-(0)));
        }
        else if (tickAnim >= 35 && tickAnim < 50) {
            xx = -11.5 + (((tickAnim - 35) / 15) * (0-(-11.5)));
            yy = 0 + (((tickAnim - 35) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 35) / 15) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(main, main.rotateAngleX + (float) Math.toRadians(xx), main.rotateAngleY + (float) Math.toRadians(yy), main.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 0) / 15) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 15) * (-2.725-(0)));
            zz = 0 + (((tickAnim - 0) / 15) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 35) {
            xx = 0 + (((tickAnim - 15) / 20) * (0-(0)));
            yy = -2.725 + (((tickAnim - 15) / 20) * (-2.725-(-2.725)));
            zz = 0 + (((tickAnim - 15) / 20) * (0-(0)));
        }
        else if (tickAnim >= 35 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 35) / 15) * (0-(0)));
            yy = -2.725 + (((tickAnim - 35) / 15) * (0-(-2.725)));
            zz = 0 + (((tickAnim - 35) / 15) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.main.rotationPointX = this.main.rotationPointX + (float)(xx);
        this.main.rotationPointY = this.main.rotationPointY - (float)(yy);
        this.main.rotationPointZ = this.main.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 0) / 15) * (-6.25-(0)));
            yy = 0 + (((tickAnim - 0) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 15) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 35) {
            xx = -6.25 + (((tickAnim - 15) / 20) * (-6.25-(-6.25)));
            yy = 0 + (((tickAnim - 15) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 20) * (0-(0)));
        }
        else if (tickAnim >= 35 && tickAnim < 50) {
            xx = -6.25 + (((tickAnim - 35) / 15) * (0-(-6.25)));
            yy = 0 + (((tickAnim - 35) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 35) / 15) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(backLeftLeg, backLeftLeg.rotateAngleX + (float) Math.toRadians(xx), backLeftLeg.rotateAngleY + (float) Math.toRadians(yy), backLeftLeg.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 0) / 15) * (52.5-(0)));
            yy = 0 + (((tickAnim - 0) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 15) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 35) {
            xx = 52.5 + (((tickAnim - 15) / 20) * (52.5-(52.5)));
            yy = 0 + (((tickAnim - 15) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 20) * (0-(0)));
        }
        else if (tickAnim >= 35 && tickAnim < 50) {
            xx = 52.5 + (((tickAnim - 35) / 15) * (0-(52.5)));
            yy = 0 + (((tickAnim - 35) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 35) / 15) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(backLeftLeg2, backLeftLeg2.rotateAngleX + (float) Math.toRadians(xx), backLeftLeg2.rotateAngleY + (float) Math.toRadians(yy), backLeftLeg2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 0) / 15) * (-33.75-(0)));
            yy = 0 + (((tickAnim - 0) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 15) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 35) {
            xx = -33.75 + (((tickAnim - 15) / 20) * (-33.75-(-33.75)));
            yy = 0 + (((tickAnim - 15) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 20) * (0-(0)));
        }
        else if (tickAnim >= 35 && tickAnim < 50) {
            xx = -33.75 + (((tickAnim - 35) / 15) * (0-(-33.75)));
            yy = 0 + (((tickAnim - 35) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 35) / 15) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(backLeftLeg3, backLeftLeg3.rotateAngleX + (float) Math.toRadians(xx), backLeftLeg3.rotateAngleY + (float) Math.toRadians(yy), backLeftLeg3.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 0) / 15) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 15) * (0.35-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 35) {
            xx = 0 + (((tickAnim - 15) / 20) * (0-(0)));
            yy = 0 + (((tickAnim - 15) / 20) * (0-(0)));
            zz = 0.35 + (((tickAnim - 15) / 20) * (0.35-(0.35)));
        }
        else if (tickAnim >= 35 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 35) / 15) * (0-(0)));
            yy = 0 + (((tickAnim - 35) / 15) * (0-(0)));
            zz = 0.35 + (((tickAnim - 35) / 15) * (0-(0.35)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.backLeftLeg3.rotationPointX = this.backLeftLeg3.rotationPointX + (float)(xx);
        this.backLeftLeg3.rotationPointY = this.backLeftLeg3.rotationPointY - (float)(yy);
        this.backLeftLeg3.rotationPointZ = this.backLeftLeg3.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 0) / 15) * (-6.25-(0)));
            yy = 0 + (((tickAnim - 0) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 15) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 35) {
            xx = -6.25 + (((tickAnim - 15) / 20) * (-6.25-(-6.25)));
            yy = 0 + (((tickAnim - 15) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 20) * (0-(0)));
        }
        else if (tickAnim >= 35 && tickAnim < 50) {
            xx = -6.25 + (((tickAnim - 35) / 15) * (0-(-6.25)));
            yy = 0 + (((tickAnim - 35) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 35) / 15) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(backRightLeg, backRightLeg.rotateAngleX + (float) Math.toRadians(xx), backRightLeg.rotateAngleY + (float) Math.toRadians(yy), backRightLeg.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 0) / 15) * (52.5-(0)));
            yy = 0 + (((tickAnim - 0) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 15) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 35) {
            xx = 52.5 + (((tickAnim - 15) / 20) * (52.5-(52.5)));
            yy = 0 + (((tickAnim - 15) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 20) * (0-(0)));
        }
        else if (tickAnim >= 35 && tickAnim < 50) {
            xx = 52.5 + (((tickAnim - 35) / 15) * (0-(52.5)));
            yy = 0 + (((tickAnim - 35) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 35) / 15) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(backRightLeg2, backRightLeg2.rotateAngleX + (float) Math.toRadians(xx), backRightLeg2.rotateAngleY + (float) Math.toRadians(yy), backRightLeg2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 0) / 15) * (-33.75-(0)));
            yy = 0 + (((tickAnim - 0) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 15) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 35) {
            xx = -33.75 + (((tickAnim - 15) / 20) * (-33.75-(-33.75)));
            yy = 0 + (((tickAnim - 15) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 20) * (0-(0)));
        }
        else if (tickAnim >= 35 && tickAnim < 50) {
            xx = -33.75 + (((tickAnim - 35) / 15) * (0-(-33.75)));
            yy = 0 + (((tickAnim - 35) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 35) / 15) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(backRightLeg3, backRightLeg3.rotateAngleX + (float) Math.toRadians(xx), backRightLeg3.rotateAngleY + (float) Math.toRadians(yy), backRightLeg3.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 0) / 15) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 15) * (0.35-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 35) {
            xx = 0 + (((tickAnim - 15) / 20) * (0-(0)));
            yy = 0 + (((tickAnim - 15) / 20) * (0-(0)));
            zz = 0.35 + (((tickAnim - 15) / 20) * (0.35-(0.35)));
        }
        else if (tickAnim >= 35 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 35) / 15) * (0-(0)));
            yy = 0 + (((tickAnim - 35) / 15) * (0-(0)));
            zz = 0.35 + (((tickAnim - 35) / 15) * (0-(0.35)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.backRightLeg3.rotationPointX = this.backRightLeg3.rotationPointX + (float)(xx);
        this.backRightLeg3.rotationPointY = this.backRightLeg3.rotationPointY - (float)(yy);
        this.backRightLeg3.rotationPointZ = this.backRightLeg3.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 0) / 15) * (5.5-(0)));
            yy = 0 + (((tickAnim - 0) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 15) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 35) {
            xx = 5.5 + (((tickAnim - 15) / 20) * (5.5-(5.5)));
            yy = 0 + (((tickAnim - 15) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 20) * (0-(0)));
        }
        else if (tickAnim >= 35 && tickAnim < 50) {
            xx = 5.5 + (((tickAnim - 35) / 15) * (0-(5.5)));
            yy = 0 + (((tickAnim - 35) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 35) / 15) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(body, body.rotateAngleX + (float) Math.toRadians(xx), body.rotateAngleY + (float) Math.toRadians(yy), body.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 0) / 15) * (5.5-(0)));
            yy = 0 + (((tickAnim - 0) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 15) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 35) {
            xx = 5.5 + (((tickAnim - 15) / 20) * (5.5-(5.5)));
            yy = 0 + (((tickAnim - 15) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 20) * (0-(0)));
        }
        else if (tickAnim >= 35 && tickAnim < 50) {
            xx = 5.5 + (((tickAnim - 35) / 15) * (0-(5.5)));
            yy = 0 + (((tickAnim - 35) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 35) / 15) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(body2, body2.rotateAngleX + (float) Math.toRadians(xx), body2.rotateAngleY + (float) Math.toRadians(yy), body2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 0) / 50) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 50) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 50) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(body3, body3.rotateAngleX + (float) Math.toRadians(xx), body3.rotateAngleY + (float) Math.toRadians(yy), body3.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 0) / 15) * (2.75-(0)));
            yy = 0 + (((tickAnim - 0) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 15) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 35) {
            xx = 2.75 + (((tickAnim - 15) / 20) * (2.75-(2.75)));
            yy = 0 + (((tickAnim - 15) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 20) * (0-(0)));
        }
        else if (tickAnim >= 35 && tickAnim < 50) {
            xx = 2.75 + (((tickAnim - 35) / 15) * (0-(2.75)));
            yy = 0 + (((tickAnim - 35) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 35) / 15) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck, neck.rotateAngleX + (float) Math.toRadians(xx), neck.rotateAngleY + (float) Math.toRadians(yy), neck.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 0) / 15) * (-4.75-(0)));
            yy = 0 + (((tickAnim - 0) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 15) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 35) {
            xx = -4.75 + (((tickAnim - 15) / 20) * (-4.75-(-4.75)));
            yy = 0 + (((tickAnim - 15) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 20) * (0-(0)));
        }
        else if (tickAnim >= 35 && tickAnim < 50) {
            xx = -4.75 + (((tickAnim - 35) / 15) * (0-(-4.75)));
            yy = 0 + (((tickAnim - 35) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 35) / 15) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(head, head.rotateAngleX + (float) Math.toRadians(xx), head.rotateAngleY + (float) Math.toRadians(yy), head.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 0) / 15) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 15) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 35) {
            xx = 0 + (((tickAnim - 15) / 20) * (0-(0)));
            yy = 0 + (((tickAnim - 15) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 20) * (0-(0)));
        }
        else if (tickAnim >= 35 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 35) / 15) * (0-(0)));
            yy = 0 + (((tickAnim - 35) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 35) / 15) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(frontLeftLeg, frontLeftLeg.rotateAngleX + (float) Math.toRadians(xx), frontLeftLeg.rotateAngleY + (float) Math.toRadians(yy), frontLeftLeg.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 0) / 15) * (-42.5-(0)));
            yy = 0 + (((tickAnim - 0) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 15) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 35) {
            xx = -42.5 + (((tickAnim - 15) / 20) * (-42.5-(-42.5)));
            yy = 0 + (((tickAnim - 15) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 20) * (0-(0)));
        }
        else if (tickAnim >= 35 && tickAnim < 50) {
            xx = -42.5 + (((tickAnim - 35) / 15) * (0-(-42.5)));
            yy = 0 + (((tickAnim - 35) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 35) / 15) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(frontLeftLeg2, frontLeftLeg2.rotateAngleX + (float) Math.toRadians(xx), frontLeftLeg2.rotateAngleY + (float) Math.toRadians(yy), frontLeftLeg2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 0) / 15) * (43.5-(0)));
            yy = 0 + (((tickAnim - 0) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 15) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 35) {
            xx = 43.5 + (((tickAnim - 15) / 20) * (43.5-(43.5)));
            yy = 0 + (((tickAnim - 15) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 20) * (0-(0)));
        }
        else if (tickAnim >= 35 && tickAnim < 50) {
            xx = 43.5 + (((tickAnim - 35) / 15) * (0-(43.5)));
            yy = 0 + (((tickAnim - 35) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 35) / 15) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(frontLeftLeg3, frontLeftLeg3.rotateAngleX + (float) Math.toRadians(xx), frontLeftLeg3.rotateAngleY + (float) Math.toRadians(yy), frontLeftLeg3.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 0) / 15) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 15) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 35) {
            xx = 0 + (((tickAnim - 15) / 20) * (0-(0)));
            yy = 0 + (((tickAnim - 15) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 20) * (0-(0)));
        }
        else if (tickAnim >= 35 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 35) / 15) * (0-(0)));
            yy = 0 + (((tickAnim - 35) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 35) / 15) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(frontRightLeg, frontRightLeg.rotateAngleX + (float) Math.toRadians(xx), frontRightLeg.rotateAngleY + (float) Math.toRadians(yy), frontRightLeg.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 0) / 15) * (-42.5-(0)));
            yy = 0 + (((tickAnim - 0) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 15) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 35) {
            xx = -42.5 + (((tickAnim - 15) / 20) * (-42.5-(-42.5)));
            yy = 0 + (((tickAnim - 15) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 20) * (0-(0)));
        }
        else if (tickAnim >= 35 && tickAnim < 50) {
            xx = -42.5 + (((tickAnim - 35) / 15) * (0-(-42.5)));
            yy = 0 + (((tickAnim - 35) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 35) / 15) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(frontRightLeg2, frontRightLeg2.rotateAngleX + (float) Math.toRadians(xx), frontRightLeg2.rotateAngleY + (float) Math.toRadians(yy), frontRightLeg2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 0) / 15) * (43.5-(0)));
            yy = 0 + (((tickAnim - 0) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 15) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 35) {
            xx = 43.5 + (((tickAnim - 15) / 20) * (43.5-(43.5)));
            yy = 0 + (((tickAnim - 15) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 20) * (0-(0)));
        }
        else if (tickAnim >= 35 && tickAnim < 50) {
            xx = 43.5 + (((tickAnim - 35) / 15) * (0-(43.5)));
            yy = 0 + (((tickAnim - 35) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 35) / 15) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(frontRightLeg3, frontRightLeg3.rotateAngleX + (float) Math.toRadians(xx), frontRightLeg3.rotateAngleY + (float) Math.toRadians(yy), frontRightLeg3.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 0) / 50) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 50) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 50) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tail, tail.rotateAngleX + (float) Math.toRadians(xx), tail.rotateAngleY + (float) Math.toRadians(yy), tail.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 0) / 50) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 50) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 50) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tail2, tail2.rotateAngleX + (float) Math.toRadians(xx), tail2.rotateAngleY + (float) Math.toRadians(yy), tail2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 0) / 8) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 8) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 8) / 7) * (9-(0)));
            yy = 0 + (((tickAnim - 8) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 7) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 35) {
            xx = 9 + (((tickAnim - 15) / 20) * (9-(9)));
            yy = 0 + (((tickAnim - 15) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 20) * (0-(0)));
        }
        else if (tickAnim >= 35 && tickAnim < 42) {
            xx = 9 + (((tickAnim - 35) / 7) * (-1.5-(9)));
            yy = 0 + (((tickAnim - 35) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 35) / 7) * (0-(0)));
        }
        else if (tickAnim >= 42 && tickAnim < 50) {
            xx = -1.5 + (((tickAnim - 42) / 8) * (0-(-1.5)));
            yy = 0 + (((tickAnim - 42) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 42) / 8) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tail3, tail3.rotateAngleX + (float) Math.toRadians(xx), tail3.rotateAngleY + (float) Math.toRadians(yy), tail3.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 0) / 8) * (-11-(0)));
            yy = 0 + (((tickAnim - 0) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 8) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 15) {
            xx = -11 + (((tickAnim - 8) / 7) * (1.75-(-11)));
            yy = 0 + (((tickAnim - 8) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 7) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 35) {
            xx = 1.75 + (((tickAnim - 15) / 20) * (1.75-(1.75)));
            yy = 0 + (((tickAnim - 15) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 20) * (0-(0)));
        }
        else if (tickAnim >= 35 && tickAnim < 42) {
            xx = 1.75 + (((tickAnim - 35) / 7) * (-8.03-(1.75)));
            yy = 0 + (((tickAnim - 35) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 35) / 7) * (0-(0)));
        }
        else if (tickAnim >= 42 && tickAnim < 50) {
            xx = -8.03 + (((tickAnim - 42) / 8) * (0-(-8.03)));
            yy = 0 + (((tickAnim - 42) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 42) / 8) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tail4, tail4.rotateAngleX + (float) Math.toRadians(xx), tail4.rotateAngleY + (float) Math.toRadians(yy), tail4.rotateAngleZ + (float) Math.toRadians(zz));


    }
    public void animIdle(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime, double animTick) {
        EntityPrehistoricFloraCandidodon entity = (EntityPrehistoricFloraCandidodon) entitylivingbaseIn;
        int animCycle = 390;
        double tickAnim = animTick + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;
         if (tickAnim >= 0 && tickAnim < 25) {
            xx = 0 + (((tickAnim - 0) / 25) * (3.75-(0)));
            yy = 0 + (((tickAnim - 0) / 25) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 25) * (0-(0)));
        }
        else if (tickAnim >= 25 && tickAnim < 360) {
            xx = 3.75 + (((tickAnim - 25) / 335) * (3.75-(3.75)));
            yy = 0 + (((tickAnim - 25) / 335) * (0-(0)));
            zz = 0 + (((tickAnim - 25) / 335) * (0-(0)));
        }
        else if (tickAnim >= 360 && tickAnim < 390) {
            xx = 3.75 + (((tickAnim - 360) / 30) * (0-(3.75)));
            yy = 0 + (((tickAnim - 360) / 30) * (0-(0)));
            zz = 0 + (((tickAnim - 360) / 30) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(main, main.rotateAngleX + (float) Math.toRadians(xx), main.rotateAngleY + (float) Math.toRadians(yy), main.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 25) {
            xx = 0 + (((tickAnim - 0) / 25) * (-4-(0)));
            yy = 0 + (((tickAnim - 0) / 25) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 25) * (0-(0)));
        }
        else if (tickAnim >= 25 && tickAnim < 360) {
            xx = -4 + (((tickAnim - 25) / 335) * (-4-(-4)));
            yy = 0 + (((tickAnim - 25) / 335) * (0-(0)));
            zz = 0 + (((tickAnim - 25) / 335) * (0-(0)));
        }
        else if (tickAnim >= 360 && tickAnim < 390) {
            xx = -4 + (((tickAnim - 360) / 30) * (0-(-4)));
            yy = 0 + (((tickAnim - 360) / 30) * (0-(0)));
            zz = 0 + (((tickAnim - 360) / 30) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(backLeftLeg, backLeftLeg.rotateAngleX + (float) Math.toRadians(xx), backLeftLeg.rotateAngleY + (float) Math.toRadians(yy), backLeftLeg.rotateAngleZ + (float) Math.toRadians(zz));



        this.setRotateAngle(backLeftLeg2, backLeftLeg2.rotateAngleX + (float) Math.toRadians(0), backLeftLeg2.rotateAngleY + (float) Math.toRadians(0), backLeftLeg2.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(backLeftLeg3, backLeftLeg3.rotateAngleX + (float) Math.toRadians(0), backLeftLeg3.rotateAngleY + (float) Math.toRadians(0), backLeftLeg3.rotateAngleZ + (float) Math.toRadians(0));

        if (tickAnim >= 0 && tickAnim < 25) {
            xx = 0 + (((tickAnim - 0) / 25) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 25) * (-0.25-(0)));
            zz = 0 + (((tickAnim - 0) / 25) * (0-(0)));
        }
        else if (tickAnim >= 25 && tickAnim < 360) {
            xx = 0 + (((tickAnim - 25) / 335) * (0-(0)));
            yy = -0.25 + (((tickAnim - 25) / 335) * (-0.25-(-0.25)));
            zz = 0 + (((tickAnim - 25) / 335) * (0-(0)));
        }
        else if (tickAnim >= 360 && tickAnim < 390) {
            xx = 0 + (((tickAnim - 360) / 30) * (0-(0)));
            yy = -0.25 + (((tickAnim - 360) / 30) * (0-(-0.25)));
            zz = 0 + (((tickAnim - 360) / 30) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.backLeftLeg3.rotationPointX = this.backLeftLeg3.rotationPointX + (float)(xx);
        this.backLeftLeg3.rotationPointY = this.backLeftLeg3.rotationPointY - (float)(yy);
        this.backLeftLeg3.rotationPointZ = this.backLeftLeg3.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 25) {
            xx = 0 + (((tickAnim - 0) / 25) * (-4-(0)));
            yy = 0 + (((tickAnim - 0) / 25) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 25) * (0-(0)));
        }
        else if (tickAnim >= 25 && tickAnim < 360) {
            xx = -4 + (((tickAnim - 25) / 335) * (-4-(-4)));
            yy = 0 + (((tickAnim - 25) / 335) * (0-(0)));
            zz = 0 + (((tickAnim - 25) / 335) * (0-(0)));
        }
        else if (tickAnim >= 360 && tickAnim < 390) {
            xx = -4 + (((tickAnim - 360) / 30) * (0-(-4)));
            yy = 0 + (((tickAnim - 360) / 30) * (0-(0)));
            zz = 0 + (((tickAnim - 360) / 30) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(backRightLeg, backRightLeg.rotateAngleX + (float) Math.toRadians(xx), backRightLeg.rotateAngleY + (float) Math.toRadians(yy), backRightLeg.rotateAngleZ + (float) Math.toRadians(zz));



        this.setRotateAngle(backRightLeg2, backRightLeg2.rotateAngleX + (float) Math.toRadians(0), backRightLeg2.rotateAngleY + (float) Math.toRadians(0), backRightLeg2.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(backRightLeg3, backRightLeg3.rotateAngleX + (float) Math.toRadians(0), backRightLeg3.rotateAngleY + (float) Math.toRadians(0), backRightLeg3.rotateAngleZ + (float) Math.toRadians(0));

        if (tickAnim >= 0 && tickAnim < 25) {
            xx = 0 + (((tickAnim - 0) / 25) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 25) * (-0.2-(0)));
            zz = 0 + (((tickAnim - 0) / 25) * (0-(0)));
        }
        else if (tickAnim >= 25 && tickAnim < 360) {
            xx = 0 + (((tickAnim - 25) / 335) * (0-(0)));
            yy = -0.2 + (((tickAnim - 25) / 335) * (-0.2-(-0.2)));
            zz = 0 + (((tickAnim - 25) / 335) * (0-(0)));
        }
        else if (tickAnim >= 360 && tickAnim < 390) {
            xx = 0 + (((tickAnim - 360) / 30) * (0-(0)));
            yy = -0.2 + (((tickAnim - 360) / 30) * (0-(-0.2)));
            zz = 0 + (((tickAnim - 360) / 30) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.backRightLeg3.rotationPointX = this.backRightLeg3.rotationPointX + (float)(xx);
        this.backRightLeg3.rotationPointY = this.backRightLeg3.rotationPointY - (float)(yy);
        this.backRightLeg3.rotationPointZ = this.backRightLeg3.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 25) {
            xx = 0 + (((tickAnim - 0) / 25) * (-2.25-(0)));
            yy = 0 + (((tickAnim - 0) / 25) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 25) * (0-(0)));
        }
        else if (tickAnim >= 25 && tickAnim < 360) {
            xx = -2.25 + (((tickAnim - 25) / 335) * (-2.25-(-2.25)));
            yy = 0 + (((tickAnim - 25) / 335) * (0-(0)));
            zz = 0 + (((tickAnim - 25) / 335) * (0-(0)));
        }
        else if (tickAnim >= 360 && tickAnim < 390) {
            xx = -2.25 + (((tickAnim - 360) / 30) * (0-(-2.25)));
            yy = 0 + (((tickAnim - 360) / 30) * (0-(0)));
            zz = 0 + (((tickAnim - 360) / 30) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(body, body.rotateAngleX + (float) Math.toRadians(xx), body.rotateAngleY + (float) Math.toRadians(yy), body.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 25) {
            xx = 0 + (((tickAnim - 0) / 25) * (1.75-(0)));
            yy = 0 + (((tickAnim - 0) / 25) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 25) * (0-(0)));
        }
        else if (tickAnim >= 25 && tickAnim < 360) {
            xx = 1.75 + (((tickAnim - 25) / 335) * (1.75-(1.75)));
            yy = 0 + (((tickAnim - 25) / 335) * (0-(0)));
            zz = 0 + (((tickAnim - 25) / 335) * (0-(0)));
        }
        else if (tickAnim >= 360 && tickAnim < 390) {
            xx = 1.75 + (((tickAnim - 360) / 30) * (0-(1.75)));
            yy = 0 + (((tickAnim - 360) / 30) * (0-(0)));
            zz = 0 + (((tickAnim - 360) / 30) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(body2, body2.rotateAngleX + (float) Math.toRadians(xx), body2.rotateAngleY + (float) Math.toRadians(yy), body2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 25) {
            xx = 0 + (((tickAnim - 0) / 25) * (6-(0)));
            yy = 0 + (((tickAnim - 0) / 25) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 25) * (0-(0)));
        }
        else if (tickAnim >= 25 && tickAnim < 45) {
            xx = 6 + (((tickAnim - 25) / 20) * (8.25-(6)));
            yy = 0 + (((tickAnim - 25) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 25) / 20) * (0-(0)));
        }
        else if (tickAnim >= 45 && tickAnim < 60) {
            xx = 8.25 + (((tickAnim - 45) / 15) * (8.25-(8.25)));
            yy = 0 + (((tickAnim - 45) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 45) / 15) * (0-(0)));
        }
        else if (tickAnim >= 60 && tickAnim < 360) {
            xx = 8.25 + (((tickAnim - 60) / 300) * (8.25-(8.25)));
            yy = 0 + (((tickAnim - 60) / 300) * (0-(0)));
            zz = 0 + (((tickAnim - 60) / 300) * (0-(0)));
        }
        else if (tickAnim >= 360 && tickAnim < 390) {
            xx = 8.25 + (((tickAnim - 360) / 30) * (0-(8.25)));
            yy = 0 + (((tickAnim - 360) / 30) * (0-(0)));
            zz = 0 + (((tickAnim - 360) / 30) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(body3, body3.rotateAngleX + (float) Math.toRadians(xx), body3.rotateAngleY + (float) Math.toRadians(yy), body3.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 25) {
            xx = 0 + (((tickAnim - 0) / 25) * (17.25-(0)));
            yy = 0 + (((tickAnim - 0) / 25) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 25) * (0-(0)));
        }
        else if (tickAnim >= 25 && tickAnim < 45) {
            xx = 17.25 + (((tickAnim - 25) / 20) * (21.5-(17.25)));
            yy = 0 + (((tickAnim - 25) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 25) / 20) * (0-(0)));
        }
        else if (tickAnim >= 45 && tickAnim < 48) {
            xx = 21.5 + (((tickAnim - 45) / 3) * (22-(21.5)));
            yy = 0 + (((tickAnim - 45) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 45) / 3) * (0-(0)));
        }
        else if (tickAnim >= 48 && tickAnim < 50) {
            xx = 22 + (((tickAnim - 48) / 2) * (21.5-(22)));
            yy = 0 + (((tickAnim - 48) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 48) / 2) * (0-(0)));
        }
        else if (tickAnim >= 50 && tickAnim < 53) {
            xx = 21.5 + (((tickAnim - 50) / 3) * (22-(21.5)));
            yy = 0 + (((tickAnim - 50) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 50) / 3) * (0-(0)));
        }
        else if (tickAnim >= 53 && tickAnim < 55) {
            xx = 22 + (((tickAnim - 53) / 2) * (21.5-(22)));
            yy = 0 + (((tickAnim - 53) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 53) / 2) * (0-(0)));
        }
        else if (tickAnim >= 55 && tickAnim < 58) {
            xx = 21.5 + (((tickAnim - 55) / 3) * (22-(21.5)));
            yy = 0 + (((tickAnim - 55) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 55) / 3) * (0-(0)));
        }
        else if (tickAnim >= 58 && tickAnim < 60) {
            xx = 22 + (((tickAnim - 58) / 2) * (21.5-(22)));
            yy = 0 + (((tickAnim - 58) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 58) / 2) * (0-(0)));
        }
        else if (tickAnim >= 60 && tickAnim < 80) {
            xx = 21.5 + (((tickAnim - 60) / 20) * (6.75-(21.5)));
            yy = 0 + (((tickAnim - 60) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 60) / 20) * (0-(0)));
        }
        else if (tickAnim >= 80 && tickAnim < 100) {
            xx = 6.75 + (((tickAnim - 80) / 20) * (8.75-(6.75)));
            yy = 0 + (((tickAnim - 80) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 80) / 20) * (0-(0)));
        }
        else if (tickAnim >= 100 && tickAnim < 120) {
            xx = 8.75 + (((tickAnim - 100) / 20) * (6.75-(8.75)));
            yy = 0 + (((tickAnim - 100) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 100) / 20) * (0-(0)));
        }
        else if (tickAnim >= 120 && tickAnim < 140) {
            xx = 6.75 + (((tickAnim - 120) / 20) * (8.75-(6.75)));
            yy = 0 + (((tickAnim - 120) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 120) / 20) * (0-(0)));
        }
        else if (tickAnim >= 140 && tickAnim < 160) {
            xx = 8.75 + (((tickAnim - 140) / 20) * (6.75-(8.75)));
            yy = 0 + (((tickAnim - 140) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 140) / 20) * (0-(0)));
        }
        else if (tickAnim >= 160 && tickAnim < 180) {
            xx = 6.75 + (((tickAnim - 160) / 20) * (8.75-(6.75)));
            yy = 0 + (((tickAnim - 160) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 160) / 20) * (0-(0)));
        }
        else if (tickAnim >= 180 && tickAnim < 200) {
            xx = 8.75 + (((tickAnim - 180) / 20) * (6.75-(8.75)));
            yy = 0 + (((tickAnim - 180) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 180) / 20) * (0-(0)));
        }
        else if (tickAnim >= 200 && tickAnim < 220) {
            xx = 6.75 + (((tickAnim - 200) / 20) * (8.75-(6.75)));
            yy = 0 + (((tickAnim - 200) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 200) / 20) * (0-(0)));
        }
        else if (tickAnim >= 220 && tickAnim < 240) {
            xx = 8.75 + (((tickAnim - 220) / 20) * (10.75-(8.75)));
            yy = 0 + (((tickAnim - 220) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 220) / 20) * (0-(0)));
        }
        else if (tickAnim >= 240 && tickAnim < 255) {
            xx = 10.75 + (((tickAnim - 240) / 15) * (6.75-(10.75)));
            yy = 0 + (((tickAnim - 240) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 240) / 15) * (0-(0)));
        }
        else if (tickAnim >= 255 && tickAnim < 270) {
            xx = 6.75 + (((tickAnim - 255) / 15) * (34.25-(6.75)));
            yy = 0 + (((tickAnim - 255) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 255) / 15) * (0-(0)));
        }
        else if (tickAnim >= 270 && tickAnim < 280) {
            xx = 34.25 + (((tickAnim - 270) / 10) * (24.5-(34.25)));
            yy = 0 + (((tickAnim - 270) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 270) / 10) * (0-(0)));
        }
        else if (tickAnim >= 280 && tickAnim < 305) {
            xx = 24.5 + (((tickAnim - 280) / 25) * (3-(24.5)));
            yy = 0 + (((tickAnim - 280) / 25) * (0-(0)));
            zz = 0 + (((tickAnim - 280) / 25) * (0-(0)));
        }
        else if (tickAnim >= 305 && tickAnim < 323) {
            xx = 3 + (((tickAnim - 305) / 18) * (-1.5-(3)));
            yy = 0 + (((tickAnim - 305) / 18) * (0-(0)));
            zz = 0 + (((tickAnim - 305) / 18) * (0-(0)));
        }
        else if (tickAnim >= 323 && tickAnim < 333) {
            xx = -1.5 + (((tickAnim - 323) / 10) * (6.75-(-1.5)));
            yy = 0 + (((tickAnim - 323) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 323) / 10) * (0-(0)));
        }
        else if (tickAnim >= 333 && tickAnim < 360) {
            xx = 6.75 + (((tickAnim - 333) / 27) * (0-(6.75)));
            yy = 0 + (((tickAnim - 333) / 27) * (0-(0)));
            zz = 0 + (((tickAnim - 333) / 27) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck, neck.rotateAngleX + (float) Math.toRadians(xx), neck.rotateAngleY + (float) Math.toRadians(yy), neck.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 45) {
            xx = 0 + (((tickAnim - 0) / 45) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 45) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 45) * (-0.425-(0)));
        }
        else if (tickAnim >= 45 && tickAnim < 270) {
            xx = 0 + (((tickAnim - 45) / 225) * (0-(0)));
            yy = 0 + (((tickAnim - 45) / 225) * (0-(0)));
            zz = -0.425 + (((tickAnim - 45) / 225) * (-0.745-(-0.425)));
        }
        else if (tickAnim >= 270 && tickAnim < 305) {
            xx = 0 + (((tickAnim - 270) / 35) * (0-(0)));
            yy = 0 + (((tickAnim - 270) / 35) * (0-(0)));
            zz = -0.745 + (((tickAnim - 270) / 35) * (0-(-0.745)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.neck.rotationPointX = this.neck.rotationPointX + (float)(xx);
        this.neck.rotationPointY = this.neck.rotationPointY - (float)(yy);
        this.neck.rotationPointZ = this.neck.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 25) {
            xx = 0 + (((tickAnim - 0) / 25) * (13-(0)));
            yy = 0 + (((tickAnim - 0) / 25) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 25) * (0-(0)));
        }
        else if (tickAnim >= 25 && tickAnim < 45) {
            xx = 13 + (((tickAnim - 25) / 20) * (18.75-(13)));
            yy = 0 + (((tickAnim - 25) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 25) / 20) * (0-(0)));
        }
        else if (tickAnim >= 45 && tickAnim < 48) {
            xx = 18.75 + (((tickAnim - 45) / 3) * (18-(18.75)));
            yy = 0 + (((tickAnim - 45) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 45) / 3) * (0-(0)));
        }
        else if (tickAnim >= 48 && tickAnim < 50) {
            xx = 18 + (((tickAnim - 48) / 2) * (18.75-(18)));
            yy = 0 + (((tickAnim - 48) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 48) / 2) * (0-(0)));
        }
        else if (tickAnim >= 50 && tickAnim < 53) {
            xx = 18.75 + (((tickAnim - 50) / 3) * (18-(18.75)));
            yy = 0 + (((tickAnim - 50) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 50) / 3) * (0-(0)));
        }
        else if (tickAnim >= 53 && tickAnim < 55) {
            xx = 18 + (((tickAnim - 53) / 2) * (18.75-(18)));
            yy = 0 + (((tickAnim - 53) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 53) / 2) * (0-(0)));
        }
        else if (tickAnim >= 55 && tickAnim < 58) {
            xx = 18.75 + (((tickAnim - 55) / 3) * (18-(18.75)));
            yy = 0 + (((tickAnim - 55) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 55) / 3) * (0-(0)));
        }
        else if (tickAnim >= 58 && tickAnim < 60) {
            xx = 18 + (((tickAnim - 58) / 2) * (18.75-(18)));
            yy = 0 + (((tickAnim - 58) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 58) / 2) * (0-(0)));
        }
        else if (tickAnim >= 60 && tickAnim < 80) {
            xx = 18.75 + (((tickAnim - 60) / 20) * (20.5-(18.75)));
            yy = 0 + (((tickAnim - 60) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 60) / 20) * (0-(0)));
        }
        else if (tickAnim >= 80 && tickAnim < 240) {
            xx = 20.5 + (((tickAnim - 80) / 160) * (23.5-(20.5)));
            yy = 0 + (((tickAnim - 80) / 160) * (0-(0)));
            zz = 0 + (((tickAnim - 80) / 160) * (0-(0)));
        }
        else if (tickAnim >= 240 && tickAnim < 255) {
            xx = 23.5 + (((tickAnim - 240) / 15) * (29-(23.5)));
            yy = 0 + (((tickAnim - 240) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 240) / 15) * (0-(0)));
        }
        else if (tickAnim >= 255 && tickAnim < 270) {
            xx = 29 + (((tickAnim - 255) / 15) * (-1.78501-(29)));
            yy = 0 + (((tickAnim - 255) / 15) * (4.71889-(0)));
            zz = 0 + (((tickAnim - 255) / 15) * (-12.92958-(0)));
        }
        else if (tickAnim >= 270 && tickAnim < 280) {
            xx = -1.78501 + (((tickAnim - 270) / 10) * (14.37042-(-1.78501)));
            yy = 4.71889 + (((tickAnim - 270) / 10) * (1.09591-(4.71889)));
            zz = -12.92958 + (((tickAnim - 270) / 10) * (-4.95326-(-12.92958)));
        }
        else if (tickAnim >= 280 && tickAnim < 305) {
            xx = 14.37042 + (((tickAnim - 280) / 25) * (23.37042-(14.37042)));
            yy = 1.09591 + (((tickAnim - 280) / 25) * (1.09591-(1.09591)));
            zz = -4.95326 + (((tickAnim - 280) / 25) * (-4.95326-(-4.95326)));
        }
        else if (tickAnim >= 305 && tickAnim < 323) {
            xx = 23.37042 + (((tickAnim - 305) / 18) * (28.62042-(23.37042)));
            yy = 1.09591 + (((tickAnim - 305) / 18) * (1.09591-(1.09591)));
            zz = -4.95326 + (((tickAnim - 305) / 18) * (-4.95326-(-4.95326)));
        }
        else if (tickAnim >= 323 && tickAnim < 333) {
            xx = 28.62042 + (((tickAnim - 323) / 10) * (10.41682-(28.62042)));
            yy = 1.09591 + (((tickAnim - 323) / 10) * (-3.2611-(1.09591)));
            zz = -4.95326 + (((tickAnim - 323) / 10) * (-7.40714-(-4.95326)));
        }
        else if (tickAnim >= 333 && tickAnim < 337) {
            xx = 10.41682 + (((tickAnim - 333) / 4) * (5.66682-(10.41682)));
            yy = -3.2611 + (((tickAnim - 333) / 4) * (-3.2611-(-3.2611)));
            zz = -7.40714 + (((tickAnim - 333) / 4) * (-7.40714-(-7.40714)));
        }
        else if (tickAnim >= 337 && tickAnim < 360) {
            xx = 5.66682 + (((tickAnim - 337) / 23) * (5.66682-(5.66682)));
            yy = -3.2611 + (((tickAnim - 337) / 23) * (-3.2611-(-3.2611)));
            zz = -7.40714 + (((tickAnim - 337) / 23) * (-7.40714-(-7.40714)));
        }
        else if (tickAnim >= 360 && tickAnim < 390) {
            xx = 5.66682 + (((tickAnim - 360) / 30) * (0-(5.66682)));
            yy = -3.2611 + (((tickAnim - 360) / 30) * (0-(-3.2611)));
            zz = -7.40714 + (((tickAnim - 360) / 30) * (0-(-7.40714)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(head, head.rotateAngleX + (float) Math.toRadians(xx), head.rotateAngleY + (float) Math.toRadians(yy), head.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 240) {
            xx = 0 + (((tickAnim - 0) / 240) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 240) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 240) * (0-(0)));
        }
        else if (tickAnim >= 240 && tickAnim < 255) {
            xx = 0 + (((tickAnim - 240) / 15) * (0-(0)));
            yy = 0 + (((tickAnim - 240) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 240) / 15) * (-0.275-(0)));
        }
        else if (tickAnim >= 255 && tickAnim < 270) {
            xx = 0 + (((tickAnim - 255) / 15) * (-0.125-(0)));
            yy = 0 + (((tickAnim - 255) / 15) * (-0.175-(0)));
            zz = -0.275 + (((tickAnim - 255) / 15) * (0-(-0.275)));
        }
        else if (tickAnim >= 270 && tickAnim < 280) {
            xx = -0.125 + (((tickAnim - 270) / 10) * (-0.12-(-0.125)));
            yy = -0.175 + (((tickAnim - 270) / 10) * (-0.07-(-0.175)));
            zz = 0 + (((tickAnim - 270) / 10) * (0-(0)));
        }
        else if (tickAnim >= 280 && tickAnim < 360) {
            xx = -0.12 + (((tickAnim - 280) / 80) * (-0.12-(-0.12)));
            yy = -0.07 + (((tickAnim - 280) / 80) * (-0.07-(-0.07)));
            zz = 0 + (((tickAnim - 280) / 80) * (0-(0)));
        }
        else if (tickAnim >= 360 && tickAnim < 390) {
            xx = -0.12 + (((tickAnim - 360) / 30) * (0-(-0.12)));
            yy = -0.07 + (((tickAnim - 360) / 30) * (0-(-0.07)));
            zz = 0 + (((tickAnim - 360) / 30) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.head.rotationPointX = this.head.rotationPointX + (float)(xx);
        this.head.rotationPointY = this.head.rotationPointY - (float)(yy);
        this.head.rotationPointZ = this.head.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 255) {
            xx = 0 + (((tickAnim - 0) / 255) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 255) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 255) * (0-(0)));
        }
        else if (tickAnim >= 255 && tickAnim < 263) {
            xx = 0 + (((tickAnim - 255) / 8) * (20.75-(0)));
            yy = 0 + (((tickAnim - 255) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 255) / 8) * (0-(0)));
        }
        else if (tickAnim >= 263 && tickAnim < 270) {
            xx = 20.75 + (((tickAnim - 263) / 7) * (0-(20.75)));
            yy = 0 + (((tickAnim - 263) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 263) / 7) * (0-(0)));
        }
        else if (tickAnim >= 270 && tickAnim < 323) {
            xx = 0 + (((tickAnim - 270) / 53) * (0-(0)));
            yy = 0 + (((tickAnim - 270) / 53) * (0-(0)));
            zz = 0 + (((tickAnim - 270) / 53) * (0-(0)));
        }
        else if (tickAnim >= 323 && tickAnim < 333) {
            xx = 0 + (((tickAnim - 323) / 10) * (16.5-(0)));
            yy = 0 + (((tickAnim - 323) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 323) / 10) * (0-(0)));
        }
        else if (tickAnim >= 333 && tickAnim < 337) {
            xx = 16.5 + (((tickAnim - 333) / 4) * (0-(16.5)));
            yy = 0 + (((tickAnim - 333) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 333) / 4) * (0-(0)));
        }
        else if (tickAnim >= 337 && tickAnim < 349) {
            xx = 0 + (((tickAnim - 337) / 12) * (4.75-(0)));
            yy = 0 + (((tickAnim - 337) / 12) * (0-(0)));
            zz = 0 + (((tickAnim - 337) / 12) * (0-(0)));
        }
        else if (tickAnim >= 349 && tickAnim < 360) {
            xx = 4.75 + (((tickAnim - 349) / 11) * (0-(4.75)));
            yy = 0 + (((tickAnim - 349) / 11) * (0-(0)));
            zz = 0 + (((tickAnim - 349) / 11) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(jaw, jaw.rotateAngleX + (float) Math.toRadians(xx), jaw.rotateAngleY + (float) Math.toRadians(yy), jaw.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 25) {
            xx = 0 + (((tickAnim - 0) / 25) * (-33.25-(0)));
            yy = 0 + (((tickAnim - 0) / 25) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 25) * (0-(0)));
        }
        else if (tickAnim >= 25 && tickAnim < 45) {
            xx = -33.25 + (((tickAnim - 25) / 20) * (-36.5-(-33.25)));
            yy = 0 + (((tickAnim - 25) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 25) / 20) * (0-(0)));
        }
        else if (tickAnim >= 45 && tickAnim < 60) {
            xx = -36.5 + (((tickAnim - 45) / 15) * (-36.5-(-36.5)));
            yy = 0 + (((tickAnim - 45) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 45) / 15) * (0-(0)));
        }
        else if (tickAnim >= 60 && tickAnim < 80) {
            xx = -36.5 + (((tickAnim - 60) / 20) * (-46.49713-(-36.5)));
            yy = 0 + (((tickAnim - 60) / 20) * (-0.00728-(0)));
            zz = 0 + (((tickAnim - 60) / 20) * (0.03707-(0)));
        }
        else if (tickAnim >= 80 && tickAnim < 100) {
            xx = -46.49713 + (((tickAnim - 80) / 20) * (9.25287-(-46.49713)));
            yy = -0.00728 + (((tickAnim - 80) / 20) * (-0.00728-(-0.00728)));
            zz = 0.03707 + (((tickAnim - 80) / 20) * (0.03707-(0.03707)));
        }
        else if (tickAnim >= 100 && tickAnim < 120) {
            xx = 9.25287 + (((tickAnim - 100) / 20) * (-46.49713-(9.25287)));
            yy = -0.00728 + (((tickAnim - 100) / 20) * (-0.00728-(-0.00728)));
            zz = 0.03707 + (((tickAnim - 100) / 20) * (0.03707-(0.03707)));
        }
        else if (tickAnim >= 120 && tickAnim < 140) {
            xx = -46.49713 + (((tickAnim - 120) / 20) * (9.25287-(-46.49713)));
            yy = -0.00728 + (((tickAnim - 120) / 20) * (-0.00728-(-0.00728)));
            zz = 0.03707 + (((tickAnim - 120) / 20) * (0.03707-(0.03707)));
        }
        else if (tickAnim >= 140 && tickAnim < 160) {
            xx = 9.25287 + (((tickAnim - 140) / 20) * (-46.49713-(9.25287)));
            yy = -0.00728 + (((tickAnim - 140) / 20) * (-0.00728-(-0.00728)));
            zz = 0.03707 + (((tickAnim - 140) / 20) * (0.03707-(0.03707)));
        }
        else if (tickAnim >= 160 && tickAnim < 180) {
            xx = -46.49713 + (((tickAnim - 160) / 20) * (9.25287-(-46.49713)));
            yy = -0.00728 + (((tickAnim - 160) / 20) * (-0.00728-(-0.00728)));
            zz = 0.03707 + (((tickAnim - 160) / 20) * (0.03707-(0.03707)));
        }
        else if (tickAnim >= 180 && tickAnim < 200) {
            xx = 9.25287 + (((tickAnim - 180) / 20) * (-46.49713-(9.25287)));
            yy = -0.00728 + (((tickAnim - 180) / 20) * (-0.00728-(-0.00728)));
            zz = 0.03707 + (((tickAnim - 180) / 20) * (0.03707-(0.03707)));
        }
        else if (tickAnim >= 200 && tickAnim < 220) {
            xx = -46.49713 + (((tickAnim - 200) / 20) * (9.25287-(-46.49713)));
            yy = -0.00728 + (((tickAnim - 200) / 20) * (-0.00728-(-0.00728)));
            zz = 0.03707 + (((tickAnim - 200) / 20) * (0.03707-(0.03707)));
        }
        else if (tickAnim >= 220 && tickAnim < 240) {
            xx = 9.25287 + (((tickAnim - 220) / 20) * (-46.49713-(9.25287)));
            yy = -0.00728 + (((tickAnim - 220) / 20) * (-0.00728-(-0.00728)));
            zz = 0.03707 + (((tickAnim - 220) / 20) * (0.03707-(0.03707)));
        }
        else if (tickAnim >= 240 && tickAnim < 360) {
            xx = -46.49713 + (((tickAnim - 240) / 120) * (-46.49713-(-46.49713)));
            yy = -0.00728 + (((tickAnim - 240) / 120) * (-0.00728-(-0.00728)));
            zz = 0.03707 + (((tickAnim - 240) / 120) * (0.03707-(0.03707)));
        }
        else if (tickAnim >= 360 && tickAnim < 375) {
            xx = -46.49713 + (((tickAnim - 360) / 15) * (-5.99857-(-46.49713)));
            yy = -0.00728 + (((tickAnim - 360) / 15) * (-0.00364-(-0.00728)));
            zz = 0.03707 + (((tickAnim - 360) / 15) * (0.01854-(0.03707)));
        }
        else if (tickAnim >= 375 && tickAnim < 390) {
            xx = -5.99857 + (((tickAnim - 375) / 15) * (0-(-5.99857)));
            yy = -0.00364 + (((tickAnim - 375) / 15) * (0-(-0.00364)));
            zz = 0.01854 + (((tickAnim - 375) / 15) * (0-(0.01854)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(frontLeftLeg, frontLeftLeg.rotateAngleX + (float) Math.toRadians(xx), frontLeftLeg.rotateAngleY + (float) Math.toRadians(yy), frontLeftLeg.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 0) / 13) * (-28.75-(0)));
            yy = 0 + (((tickAnim - 0) / 13) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 13) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 25) {
            xx = -28.75 + (((tickAnim - 13) / 12) * (0-(-28.75)));
            yy = 0 + (((tickAnim - 13) / 12) * (0-(0)));
            zz = 0 + (((tickAnim - 13) / 12) * (0-(0)));
        }
        else if (tickAnim >= 25 && tickAnim < 60) {
            xx = 0 + (((tickAnim - 25) / 35) * (0-(0)));
            yy = 0 + (((tickAnim - 25) / 35) * (0-(0)));
            zz = 0 + (((tickAnim - 25) / 35) * (0-(0)));
        }
        else if (tickAnim >= 60 && tickAnim < 70) {
            xx = 0 + (((tickAnim - 60) / 10) * (-9.75-(0)));
            yy = 0 + (((tickAnim - 60) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 60) / 10) * (0-(0)));
        }
        else if (tickAnim >= 70 && tickAnim < 80) {
            xx = -9.75 + (((tickAnim - 70) / 10) * (11.5-(-9.75)));
            yy = 0 + (((tickAnim - 70) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 70) / 10) * (0-(0)));
        }
        else if (tickAnim >= 80 && tickAnim < 100) {
            xx = 11.5 + (((tickAnim - 80) / 20) * (0-(11.5)));
            yy = 0 + (((tickAnim - 80) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 80) / 20) * (0-(0)));
        }
        else if (tickAnim >= 100 && tickAnim < 110) {
            xx = 0 + (((tickAnim - 100) / 10) * (-31.75-(0)));
            yy = 0 + (((tickAnim - 100) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 100) / 10) * (0-(0)));
        }
        else if (tickAnim >= 110 && tickAnim < 120) {
            xx = -31.75 + (((tickAnim - 110) / 10) * (11.5-(-31.75)));
            yy = 0 + (((tickAnim - 110) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 110) / 10) * (0-(0)));
        }
        else if (tickAnim >= 120 && tickAnim < 140) {
            xx = 11.5 + (((tickAnim - 120) / 20) * (0-(11.5)));
            yy = 0 + (((tickAnim - 120) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 120) / 20) * (0-(0)));
        }
        else if (tickAnim >= 140 && tickAnim < 150) {
            xx = 0 + (((tickAnim - 140) / 10) * (-31.75-(0)));
            yy = 0 + (((tickAnim - 140) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 140) / 10) * (0-(0)));
        }
        else if (tickAnim >= 150 && tickAnim < 160) {
            xx = -31.75 + (((tickAnim - 150) / 10) * (11.5-(-31.75)));
            yy = 0 + (((tickAnim - 150) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 150) / 10) * (0-(0)));
        }
        else if (tickAnim >= 160 && tickAnim < 180) {
            xx = 11.5 + (((tickAnim - 160) / 20) * (0-(11.5)));
            yy = 0 + (((tickAnim - 160) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 160) / 20) * (0-(0)));
        }
        else if (tickAnim >= 180 && tickAnim < 190) {
            xx = 0 + (((tickAnim - 180) / 10) * (-31.75-(0)));
            yy = 0 + (((tickAnim - 180) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 180) / 10) * (0-(0)));
        }
        else if (tickAnim >= 190 && tickAnim < 200) {
            xx = -31.75 + (((tickAnim - 190) / 10) * (11.5-(-31.75)));
            yy = 0 + (((tickAnim - 190) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 190) / 10) * (0-(0)));
        }
        else if (tickAnim >= 200 && tickAnim < 230) {
            xx = 11.5 + (((tickAnim - 200) / 30) * (-31.75-(11.5)));
            yy = 0 + (((tickAnim - 200) / 30) * (0-(0)));
            zz = 0 + (((tickAnim - 200) / 30) * (0-(0)));
        }
        else if (tickAnim >= 230 && tickAnim < 240) {
            xx = -31.75 + (((tickAnim - 230) / 10) * (11.5-(-31.75)));
            yy = 0 + (((tickAnim - 230) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 230) / 10) * (0-(0)));
        }
        else if (tickAnim >= 240 && tickAnim < 360) {
            xx = 11.5 + (((tickAnim - 240) / 120) * (11.5-(11.5)));
            yy = 0 + (((tickAnim - 240) / 120) * (0-(0)));
            zz = 0 + (((tickAnim - 240) / 120) * (0-(0)));
        }
        else if (tickAnim >= 360 && tickAnim < 375) {
            xx = 11.5 + (((tickAnim - 360) / 15) * (-26.25-(11.5)));
            yy = 0 + (((tickAnim - 360) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 360) / 15) * (0-(0)));
        }
        else if (tickAnim >= 375 && tickAnim < 390) {
            xx = -26.25 + (((tickAnim - 375) / 15) * (0-(-26.25)));
            yy = 0 + (((tickAnim - 375) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 375) / 15) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(frontLeftLeg2, frontLeftLeg2.rotateAngleX + (float) Math.toRadians(xx), frontLeftLeg2.rotateAngleY + (float) Math.toRadians(yy), frontLeftLeg2.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 80) {
            xx = 0 + (((tickAnim - 0) / 80) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 80) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 80) * (0-(0)));
        }
        else if (tickAnim >= 80 && tickAnim < 100) {
            xx = 0 + (((tickAnim - 80) / 20) * (0-(0)));
            yy = 0 + (((tickAnim - 80) / 20) * (0.75-(0)));
            zz = 0 + (((tickAnim - 80) / 20) * (0.05-(0)));
        }
        else if (tickAnim >= 100 && tickAnim < 110) {
            xx = 0 + (((tickAnim - 100) / 10) * (0-(0)));
            yy = 0.75 + (((tickAnim - 100) / 10) * (0-(0.75)));
            zz = 0.05 + (((tickAnim - 100) / 10) * (0-(0.05)));
        }
        else if (tickAnim >= 110 && tickAnim < 120) {
            xx = 0 + (((tickAnim - 110) / 10) * (0-(0)));
            yy = 0 + (((tickAnim - 110) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 110) / 10) * (0-(0)));
        }
        else if (tickAnim >= 120 && tickAnim < 140) {
            xx = 0 + (((tickAnim - 120) / 20) * (0-(0)));
            yy = 0 + (((tickAnim - 120) / 20) * (0.75-(0)));
            zz = 0 + (((tickAnim - 120) / 20) * (0.05-(0)));
        }
        else if (tickAnim >= 140 && tickAnim < 150) {
            xx = 0 + (((tickAnim - 140) / 10) * (0-(0)));
            yy = 0.75 + (((tickAnim - 140) / 10) * (0-(0.75)));
            zz = 0.05 + (((tickAnim - 140) / 10) * (0-(0.05)));
        }
        else if (tickAnim >= 150 && tickAnim < 160) {
            xx = 0 + (((tickAnim - 150) / 10) * (0-(0)));
            yy = 0 + (((tickAnim - 150) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 150) / 10) * (0-(0)));
        }
        else if (tickAnim >= 160 && tickAnim < 180) {
            xx = 0 + (((tickAnim - 160) / 20) * (0-(0)));
            yy = 0 + (((tickAnim - 160) / 20) * (0.75-(0)));
            zz = 0 + (((tickAnim - 160) / 20) * (0.05-(0)));
        }
        else if (tickAnim >= 180 && tickAnim < 190) {
            xx = 0 + (((tickAnim - 180) / 10) * (0-(0)));
            yy = 0.75 + (((tickAnim - 180) / 10) * (0-(0.75)));
            zz = 0.05 + (((tickAnim - 180) / 10) * (0-(0.05)));
        }
        else if (tickAnim >= 190 && tickAnim < 200) {
            xx = 0 + (((tickAnim - 190) / 10) * (0-(0)));
            yy = 0 + (((tickAnim - 190) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 190) / 10) * (0-(0)));
        }
        else if (tickAnim >= 200 && tickAnim < 220) {
            xx = 0 + (((tickAnim - 200) / 20) * (0-(0)));
            yy = 0 + (((tickAnim - 200) / 20) * (0.75-(0)));
            zz = 0 + (((tickAnim - 200) / 20) * (0.05-(0)));
        }
        else if (tickAnim >= 220 && tickAnim < 230) {
            xx = 0 + (((tickAnim - 220) / 10) * (0-(0)));
            yy = 0.75 + (((tickAnim - 220) / 10) * (0-(0.75)));
            zz = 0.05 + (((tickAnim - 220) / 10) * (0-(0.05)));
        }
        else if (tickAnim >= 230 && tickAnim < 240) {
            xx = 0 + (((tickAnim - 230) / 10) * (0-(0)));
            yy = 0 + (((tickAnim - 230) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 230) / 10) * (0-(0)));
        }
        else if (tickAnim >= 240 && tickAnim < 360) {
            xx = 0 + (((tickAnim - 240) / 120) * (0-(0)));
            yy = 0 + (((tickAnim - 240) / 120) * (0-(0)));
            zz = 0 + (((tickAnim - 240) / 120) * (0-(0)));
        }
        else if (tickAnim >= 360 && tickAnim < 390) {
            xx = 0 + (((tickAnim - 360) / 30) * (0-(0)));
            yy = 0 + (((tickAnim - 360) / 30) * (0-(0)));
            zz = 0 + (((tickAnim - 360) / 30) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.frontLeftLeg2.rotationPointX = this.frontLeftLeg2.rotationPointX + (float)(xx);
        this.frontLeftLeg2.rotationPointY = this.frontLeftLeg2.rotationPointY - (float)(yy);
        this.frontLeftLeg2.rotationPointZ = this.frontLeftLeg2.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 0) / 13) * (80.63-(0)));
            yy = 0 + (((tickAnim - 0) / 13) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 13) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 25) {
            xx = 80.63 + (((tickAnim - 13) / 12) * (23.25-(80.63)));
            yy = 0 + (((tickAnim - 13) / 12) * (0-(0)));
            zz = 0 + (((tickAnim - 13) / 12) * (0-(0)));
        }
        else if (tickAnim >= 25 && tickAnim < 60) {
            xx = 23.25 + (((tickAnim - 25) / 35) * (23.25-(23.25)));
            yy = 0 + (((tickAnim - 25) / 35) * (0-(0)));
            zz = 0 + (((tickAnim - 25) / 35) * (0-(0)));
        }
        else if (tickAnim >= 60 && tickAnim < 70) {
            xx = 23.25 + (((tickAnim - 60) / 10) * (83-(23.25)));
            yy = 0 + (((tickAnim - 60) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 60) / 10) * (0-(0)));
        }
        else if (tickAnim >= 70 && tickAnim < 80) {
            xx = 83 + (((tickAnim - 70) / 10) * (24.75-(83)));
            yy = 0 + (((tickAnim - 70) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 70) / 10) * (0-(0)));
        }
        else if (tickAnim >= 80 && tickAnim < 90) {
            xx = 24.75 + (((tickAnim - 80) / 10) * (2-(24.75)));
            yy = 0 + (((tickAnim - 80) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 80) / 10) * (0-(0)));
        }
        else if (tickAnim >= 90 && tickAnim < 100) {
            xx = 2 + (((tickAnim - 90) / 10) * (82.75-(2)));
            yy = 0 + (((tickAnim - 90) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 90) / 10) * (0-(0)));
        }
        else if (tickAnim >= 100 && tickAnim < 110) {
            xx = 82.75 + (((tickAnim - 100) / 10) * (94.25-(82.75)));
            yy = 0 + (((tickAnim - 100) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 100) / 10) * (0-(0)));
        }
        else if (tickAnim >= 110 && tickAnim < 120) {
            xx = 94.25 + (((tickAnim - 110) / 10) * (24.75-(94.25)));
            yy = 0 + (((tickAnim - 110) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 110) / 10) * (0-(0)));
        }
        else if (tickAnim >= 120 && tickAnim < 130) {
            xx = 24.75 + (((tickAnim - 120) / 10) * (3.25-(24.75)));
            yy = 0 + (((tickAnim - 120) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 120) / 10) * (0-(0)));
        }
        else if (tickAnim >= 130 && tickAnim < 140) {
            xx = 3.25 + (((tickAnim - 130) / 10) * (82.75-(3.25)));
            yy = 0 + (((tickAnim - 130) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 130) / 10) * (0-(0)));
        }
        else if (tickAnim >= 140 && tickAnim < 150) {
            xx = 82.75 + (((tickAnim - 140) / 10) * (94.25-(82.75)));
            yy = 0 + (((tickAnim - 140) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 140) / 10) * (0-(0)));
        }
        else if (tickAnim >= 150 && tickAnim < 160) {
            xx = 94.25 + (((tickAnim - 150) / 10) * (24.75-(94.25)));
            yy = 0 + (((tickAnim - 150) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 150) / 10) * (0-(0)));
        }
        else if (tickAnim >= 160 && tickAnim < 170) {
            xx = 24.75 + (((tickAnim - 160) / 10) * (2-(24.75)));
            yy = 0 + (((tickAnim - 160) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 160) / 10) * (0-(0)));
        }
        else if (tickAnim >= 170 && tickAnim < 180) {
            xx = 2 + (((tickAnim - 170) / 10) * (82.75-(2)));
            yy = 0 + (((tickAnim - 170) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 170) / 10) * (0-(0)));
        }
        else if (tickAnim >= 180 && tickAnim < 190) {
            xx = 82.75 + (((tickAnim - 180) / 10) * (94.25-(82.75)));
            yy = 0 + (((tickAnim - 180) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 180) / 10) * (0-(0)));
        }
        else if (tickAnim >= 190 && tickAnim < 200) {
            xx = 94.25 + (((tickAnim - 190) / 10) * (24.75-(94.25)));
            yy = 0 + (((tickAnim - 190) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 190) / 10) * (0-(0)));
        }
        else if (tickAnim >= 200 && tickAnim < 210) {
            xx = 24.75 + (((tickAnim - 200) / 10) * (11.5-(24.75)));
            yy = 0 + (((tickAnim - 200) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 200) / 10) * (0-(0)));
        }
        else if (tickAnim >= 210 && tickAnim < 220) {
            xx = 11.5 + (((tickAnim - 210) / 10) * (82.75-(11.5)));
            yy = 0 + (((tickAnim - 210) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 210) / 10) * (0-(0)));
        }
        else if (tickAnim >= 220 && tickAnim < 230) {
            xx = 82.75 + (((tickAnim - 220) / 10) * (94.25-(82.75)));
            yy = 0 + (((tickAnim - 220) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 220) / 10) * (0-(0)));
        }
        else if (tickAnim >= 230 && tickAnim < 240) {
            xx = 94.25 + (((tickAnim - 230) / 10) * (24.75-(94.25)));
            yy = 0 + (((tickAnim - 230) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 230) / 10) * (0-(0)));
        }
        else if (tickAnim >= 240 && tickAnim < 360) {
            xx = 24.75 + (((tickAnim - 240) / 120) * (24.75-(24.75)));
            yy = 0 + (((tickAnim - 240) / 120) * (0-(0)));
            zz = 0 + (((tickAnim - 240) / 120) * (0-(0)));
        }
        else if (tickAnim >= 360 && tickAnim < 375) {
            xx = 24.75 + (((tickAnim - 360) / 15) * (82.88-(24.75)));
            yy = 0 + (((tickAnim - 360) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 360) / 15) * (0-(0)));
        }
        else if (tickAnim >= 375 && tickAnim < 390) {
            xx = 82.88 + (((tickAnim - 375) / 15) * (0-(82.88)));
            yy = 0 + (((tickAnim - 375) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 375) / 15) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(frontLeftLeg3, frontLeftLeg3.rotateAngleX + (float) Math.toRadians(xx), frontLeftLeg3.rotateAngleY + (float) Math.toRadians(yy), frontLeftLeg3.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 0) / 13) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 13) * (0.475-(0)));
            zz = 0 + (((tickAnim - 0) / 13) * (-0.625-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 25) {
            xx = 0 + (((tickAnim - 13) / 12) * (0-(0)));
            yy = 0.475 + (((tickAnim - 13) / 12) * (0-(0.475)));
            zz = -0.625 + (((tickAnim - 13) / 12) * (0-(-0.625)));
        }
        else if (tickAnim >= 25 && tickAnim < 60) {
            xx = 0 + (((tickAnim - 25) / 35) * (0-(0)));
            yy = 0 + (((tickAnim - 25) / 35) * (0-(0)));
            zz = 0 + (((tickAnim - 25) / 35) * (0-(0)));
        }
        else if (tickAnim >= 60 && tickAnim < 70) {
            xx = 0 + (((tickAnim - 60) / 10) * (0-(0)));
            yy = 0 + (((tickAnim - 60) / 10) * (0.68-(0)));
            zz = 0 + (((tickAnim - 60) / 10) * (-0.895-(0)));
        }
        else if (tickAnim >= 70 && tickAnim < 80) {
            xx = 0 + (((tickAnim - 70) / 10) * (0-(0)));
            yy = 0.68 + (((tickAnim - 70) / 10) * (0-(0.68)));
            zz = -0.895 + (((tickAnim - 70) / 10) * (0-(-0.895)));
        }
        else if (tickAnim >= 80 && tickAnim < 90) {
            xx = 0 + (((tickAnim - 80) / 10) * (0-(0)));
            yy = 0 + (((tickAnim - 80) / 10) * (0.33-(0)));
            zz = 0 + (((tickAnim - 80) / 10) * (0.24-(0)));
        }
        else if (tickAnim >= 90 && tickAnim < 100) {
            xx = 0 + (((tickAnim - 90) / 10) * (0-(0)));
            yy = 0.33 + (((tickAnim - 90) / 10) * (0.7-(0.33)));
            zz = 0.24 + (((tickAnim - 90) / 10) * (-0.775-(0.24)));
        }
        else if (tickAnim >= 100 && tickAnim < 110) {
            xx = 0 + (((tickAnim - 100) / 10) * (0-(0)));
            yy = 0.7 + (((tickAnim - 100) / 10) * (0.35-(0.7)));
            zz = -0.775 + (((tickAnim - 100) / 10) * (-0.865-(-0.775)));
        }
        else if (tickAnim >= 110 && tickAnim < 120) {
            xx = 0 + (((tickAnim - 110) / 10) * (0-(0)));
            yy = 0.35 + (((tickAnim - 110) / 10) * (0.2-(0.35)));
            zz = -0.865 + (((tickAnim - 110) / 10) * (0-(-0.865)));
        }
        else if (tickAnim >= 120 && tickAnim < 130) {
            xx = 0 + (((tickAnim - 120) / 10) * (0-(0)));
            yy = 0.2 + (((tickAnim - 120) / 10) * (0.33-(0.2)));
            zz = 0 + (((tickAnim - 120) / 10) * (0.24-(0)));
        }
        else if (tickAnim >= 130 && tickAnim < 140) {
            xx = 0 + (((tickAnim - 130) / 10) * (0-(0)));
            yy = 0.33 + (((tickAnim - 130) / 10) * (0.7-(0.33)));
            zz = 0.24 + (((tickAnim - 130) / 10) * (-0.775-(0.24)));
        }
        else if (tickAnim >= 140 && tickAnim < 150) {
            xx = 0 + (((tickAnim - 140) / 10) * (0-(0)));
            yy = 0.7 + (((tickAnim - 140) / 10) * (0.35-(0.7)));
            zz = -0.775 + (((tickAnim - 140) / 10) * (-0.865-(-0.775)));
        }
        else if (tickAnim >= 150 && tickAnim < 160) {
            xx = 0 + (((tickAnim - 150) / 10) * (0-(0)));
            yy = 0.35 + (((tickAnim - 150) / 10) * (0-(0.35)));
            zz = -0.865 + (((tickAnim - 150) / 10) * (0-(-0.865)));
        }
        else if (tickAnim >= 160 && tickAnim < 170) {
            xx = 0 + (((tickAnim - 160) / 10) * (0-(0)));
            yy = 0 + (((tickAnim - 160) / 10) * (0.33-(0)));
            zz = 0 + (((tickAnim - 160) / 10) * (0.24-(0)));
        }
        else if (tickAnim >= 170 && tickAnim < 180) {
            xx = 0 + (((tickAnim - 170) / 10) * (0-(0)));
            yy = 0.33 + (((tickAnim - 170) / 10) * (0.7-(0.33)));
            zz = 0.24 + (((tickAnim - 170) / 10) * (-0.775-(0.24)));
        }
        else if (tickAnim >= 180 && tickAnim < 190) {
            xx = 0 + (((tickAnim - 180) / 10) * (0-(0)));
            yy = 0.7 + (((tickAnim - 180) / 10) * (0.35-(0.7)));
            zz = -0.775 + (((tickAnim - 180) / 10) * (-0.865-(-0.775)));
        }
        else if (tickAnim >= 190 && tickAnim < 200) {
            xx = 0 + (((tickAnim - 190) / 10) * (0-(0)));
            yy = 0.35 + (((tickAnim - 190) / 10) * (0-(0.35)));
            zz = -0.865 + (((tickAnim - 190) / 10) * (0-(-0.865)));
        }
        else if (tickAnim >= 200 && tickAnim < 210) {
            xx = 0 + (((tickAnim - 200) / 10) * (0-(0)));
            yy = 0 + (((tickAnim - 200) / 10) * (0.055-(0)));
            zz = 0 + (((tickAnim - 200) / 10) * (0.24-(0)));
        }
        else if (tickAnim >= 210 && tickAnim < 220) {
            xx = 0 + (((tickAnim - 210) / 10) * (0-(0)));
            yy = 0.055 + (((tickAnim - 210) / 10) * (0.7-(0.055)));
            zz = 0.24 + (((tickAnim - 210) / 10) * (-0.775-(0.24)));
        }
        else if (tickAnim >= 220 && tickAnim < 230) {
            xx = 0 + (((tickAnim - 220) / 10) * (0-(0)));
            yy = 0.7 + (((tickAnim - 220) / 10) * (0.35-(0.7)));
            zz = -0.775 + (((tickAnim - 220) / 10) * (-0.865-(-0.775)));
        }
        else if (tickAnim >= 230 && tickAnim < 240) {
            xx = 0 + (((tickAnim - 230) / 10) * (0-(0)));
            yy = 0.35 + (((tickAnim - 230) / 10) * (0-(0.35)));
            zz = -0.865 + (((tickAnim - 230) / 10) * (0-(-0.865)));
        }
        else if (tickAnim >= 240 && tickAnim < 360) {
            xx = 0 + (((tickAnim - 240) / 120) * (0-(0)));
            yy = 0 + (((tickAnim - 240) / 120) * (0-(0)));
            zz = 0 + (((tickAnim - 240) / 120) * (0-(0)));
        }
        else if (tickAnim >= 360 && tickAnim < 375) {
            xx = 0 + (((tickAnim - 360) / 15) * (0-(0)));
            yy = 0 + (((tickAnim - 360) / 15) * (0.625-(0)));
            zz = 0 + (((tickAnim - 360) / 15) * (-0.8-(0)));
        }
        else if (tickAnim >= 375 && tickAnim < 390) {
            xx = 0 + (((tickAnim - 375) / 15) * (0-(0)));
            yy = 0.625 + (((tickAnim - 375) / 15) * (0-(0.625)));
            zz = -0.8 + (((tickAnim - 375) / 15) * (0-(-0.8)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.frontLeftLeg3.rotationPointX = this.frontLeftLeg3.rotationPointX + (float)(xx);
        this.frontLeftLeg3.rotationPointY = this.frontLeftLeg3.rotationPointY - (float)(yy);
        this.frontLeftLeg3.rotationPointZ = this.frontLeftLeg3.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 25) {
            xx = 0 + (((tickAnim - 0) / 25) * (-12.5-(0)));
            yy = 0 + (((tickAnim - 0) / 25) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 25) * (0-(0)));
        }
        else if (tickAnim >= 25 && tickAnim < 45) {
            xx = -12.5 + (((tickAnim - 25) / 20) * (-15.25-(-12.5)));
            yy = 0 + (((tickAnim - 25) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 25) / 20) * (0-(0)));
        }
        else if (tickAnim >= 45 && tickAnim < 360) {
            xx = -15.25 + (((tickAnim - 45) / 315) * (-15.25-(-15.25)));
            yy = 0 + (((tickAnim - 45) / 315) * (0-(0)));
            zz = 0 + (((tickAnim - 45) / 315) * (0-(0)));
        }
        else if (tickAnim >= 360 && tickAnim < 390) {
            xx = -15.25 + (((tickAnim - 360) / 30) * (0-(-15.25)));
            yy = 0 + (((tickAnim - 360) / 30) * (0-(0)));
            zz = 0 + (((tickAnim - 360) / 30) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(frontRightLeg, frontRightLeg.rotateAngleX + (float) Math.toRadians(xx), frontRightLeg.rotateAngleY + (float) Math.toRadians(yy), frontRightLeg.rotateAngleZ + (float) Math.toRadians(zz));



        this.setRotateAngle(frontRightLeg2, frontRightLeg2.rotateAngleX + (float) Math.toRadians(0), frontRightLeg2.rotateAngleY + (float) Math.toRadians(0), frontRightLeg2.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(frontRightLeg3, frontRightLeg3.rotateAngleX + (float) Math.toRadians(0), frontRightLeg3.rotateAngleY + (float) Math.toRadians(0), frontRightLeg3.rotateAngleZ + (float) Math.toRadians(0));



        if (tickAnim >= 0 && tickAnim < 25) {
            xx = 0 + (((tickAnim - 0) / 25) * (-1.5-(0)));
            yy = 0 + (((tickAnim - 0) / 25) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 25) * (0-(0)));
        }
        else if (tickAnim >= 25 && tickAnim < 360) {
            xx = -1.5 + (((tickAnim - 25) / 335) * (-1.5-(-1.5)));
            yy = 0 + (((tickAnim - 25) / 335) * (0-(0)));
            zz = 0 + (((tickAnim - 25) / 335) * (0-(0)));
        }
        else if (tickAnim >= 360 && tickAnim < 390) {
            xx = -1.5 + (((tickAnim - 360) / 30) * (0-(-1.5)));
            yy = 0 + (((tickAnim - 360) / 30) * (0-(0)));
            zz = 0 + (((tickAnim - 360) / 30) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tail, tail.rotateAngleX + (float) Math.toRadians(xx), tail.rotateAngleY + (float) Math.toRadians(yy), tail.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 25) {
            xx = 0 + (((tickAnim - 0) / 25) * (-1.75-(0)));
            yy = 0 + (((tickAnim - 0) / 25) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 25) * (0-(0)));
        }
        else if (tickAnim >= 25 && tickAnim < 360) {
            xx = -1.75 + (((tickAnim - 25) / 335) * (-1.75-(-1.75)));
            yy = 0 + (((tickAnim - 25) / 335) * (0-(0)));
            zz = 0 + (((tickAnim - 25) / 335) * (0-(0)));
        }
        else if (tickAnim >= 360 && tickAnim < 390) {
            xx = -1.75 + (((tickAnim - 360) / 30) * (0-(-1.75)));
            yy = 0 + (((tickAnim - 360) / 30) * (0-(0)));
            zz = 0 + (((tickAnim - 360) / 30) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tail2, tail2.rotateAngleX + (float) Math.toRadians(xx), tail2.rotateAngleY + (float) Math.toRadians(yy), tail2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 25) {
            xx = 0 + (((tickAnim - 0) / 25) * (-4.25-(0)));
            yy = 0 + (((tickAnim - 0) / 25) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 25) * (0-(0)));
        }
        else if (tickAnim >= 25 && tickAnim < 360) {
            xx = -4.25 + (((tickAnim - 25) / 335) * (-4.25-(-4.25)));
            yy = 0 + (((tickAnim - 25) / 335) * (0-(0)));
            zz = 0 + (((tickAnim - 25) / 335) * (0-(0)));
        }
        else if (tickAnim >= 360 && tickAnim < 390) {
            xx = -4.25 + (((tickAnim - 360) / 30) * (0-(-4.25)));
            yy = 0 + (((tickAnim - 360) / 30) * (0-(0)));
            zz = 0 + (((tickAnim - 360) / 30) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tail3, tail3.rotateAngleX + (float) Math.toRadians(xx), tail3.rotateAngleY + (float) Math.toRadians(yy), tail3.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 25) {
            xx = 0 + (((tickAnim - 0) / 25) * (-8.75-(0)));
            yy = 0 + (((tickAnim - 0) / 25) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 25) * (0-(0)));
        }
        else if (tickAnim >= 25 && tickAnim < 360) {
            xx = -8.75 + (((tickAnim - 25) / 335) * (-8.75-(-8.75)));
            yy = 0 + (((tickAnim - 25) / 335) * (0-(0)));
            zz = 0 + (((tickAnim - 25) / 335) * (0-(0)));
        }
        else if (tickAnim >= 360 && tickAnim < 390) {
            xx = -8.75 + (((tickAnim - 360) / 30) * (0-(-8.75)));
            yy = 0 + (((tickAnim - 360) / 30) * (0-(0)));
            zz = 0 + (((tickAnim - 360) / 30) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tail4, tail4.rotateAngleX + (float) Math.toRadians(xx), tail4.rotateAngleY + (float) Math.toRadians(yy), tail4.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 48) {
            xx = 0 + (((tickAnim - 0) / 48) * (-4.25-(0)));
            yy = 0 + (((tickAnim - 0) / 48) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 48) * (0-(0)));
        }
        else if (tickAnim >= 48 && tickAnim < 80) {
            xx = -4.25 + (((tickAnim - 48) / 32) * (-4.25-(-4.25)));
            yy = 0 + (((tickAnim - 48) / 32) * (0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*280))*5-(0)));
            zz = 0 + (((tickAnim - 48) / 32) * (0-(0)));
        }
        else if (tickAnim >= 80 && tickAnim < 270) {
            xx = -4.25 + (((tickAnim - 80) / 190) * (-4.25-(-4.25)));
            yy = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*280))*5 + (((tickAnim - 80) / 190) * (0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*280))*5-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*280))*5)));
            zz = 0 + (((tickAnim - 80) / 190) * (0-(0)));
        }
        else if (tickAnim >= 270 && tickAnim < 280) {
            xx = -4.25 + (((tickAnim - 270) / 10) * (4.25-(-4.25)));
            yy = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*280))*5 + (((tickAnim - 270) / 10) * (0-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*280))*5)));
            zz = 0 + (((tickAnim - 270) / 10) * (0-(0)));
        }
        else if (tickAnim >= 280 && tickAnim < 286) {
            xx = 4.25 + (((tickAnim - 280) / 6) * (24.51-(4.25)));
            yy = 0 + (((tickAnim - 280) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 280) / 6) * (0-(0)));
        }
        else if (tickAnim >= 286 && tickAnim < 305) {
            xx = 24.51 + (((tickAnim - 286) / 19) * (59.25-(24.51)));
            yy = 0 + (((tickAnim - 286) / 19) * (0-(0)));
            zz = 0 + (((tickAnim - 286) / 19) * (0-(0)));
        }
        else if (tickAnim >= 305 && tickAnim < 333) {
            xx = 59.25 + (((tickAnim - 305) / 28) * (66-(59.25)));
            yy = 0 + (((tickAnim - 305) / 28) * (0-(0)));
            zz = 0 + (((tickAnim - 305) / 28) * (0-(0)));
        }
        else if (tickAnim >= 333 && tickAnim < 338) {
            xx = 66 + (((tickAnim - 333) / 5) * (13.96-(66)));
            yy = 0 + (((tickAnim - 333) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 333) / 5) * (0-(0)));
        }
        else if (tickAnim >= 338 && tickAnim < 343) {
            xx = 13.96 + (((tickAnim - 338) / 5) * (19.5-(13.96)));
            yy = 0 + (((tickAnim - 338) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 338) / 5) * (0-(0)));
        }
        else if (tickAnim >= 343 && tickAnim < 360) {
            xx = 19.5 + (((tickAnim - 343) / 17) * (0-(19.5)));
            yy = 0 + (((tickAnim - 343) / 17) * (0-(0)));
            zz = 0 + (((tickAnim - 343) / 17) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(grub, grub.rotateAngleX + (float) Math.toRadians(xx), grub.rotateAngleY + (float) Math.toRadians(yy), grub.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 48) {
            xx = 0 + (((tickAnim - 0) / 48) * (0-(0)));
            yy = -8.25 + (((tickAnim - 0) / 48) * (-7.4-(-8.25)));
            zz = -11.1 + (((tickAnim - 0) / 48) * (-9.775-(-11.1)));
        }
        else if (tickAnim >= 48 && tickAnim < 80) {
            xx = 0 + (((tickAnim - 48) / 32) * (0-(0)));
            yy = -7.4 + (((tickAnim - 48) / 32) * (-7.4-(-7.4)));
            zz = -9.775 + (((tickAnim - 48) / 32) * (-9.775-(-9.775)));
        }
        else if (tickAnim >= 80 && tickAnim < 240) {
            xx = 0 + (((tickAnim - 80) / 160) * (0-(0)));
            yy = -7.4 + (((tickAnim - 80) / 160) * (-6.275-(-7.4)));
            zz = -9.775 + (((tickAnim - 80) / 160) * (-9.77-(-9.775)));
        }
        else if (tickAnim >= 240 && tickAnim < 270) {
            xx = 0 + (((tickAnim - 240) / 30) * (0-(0)));
            yy = -6.275 + (((tickAnim - 240) / 30) * (-6.275-(-6.275)));
            zz = -9.77 + (((tickAnim - 240) / 30) * (-10.02-(-9.77)));
        }
        else if (tickAnim >= 270 && tickAnim < 280) {
            xx = 0 + (((tickAnim - 270) / 10) * (0-(0)));
            yy = -6.275 + (((tickAnim - 270) / 10) * (-6.22-(-6.275)));
            zz = -10.02 + (((tickAnim - 270) / 10) * (-9.795-(-10.02)));
        }
        else if (tickAnim >= 280 && tickAnim < 305) {
            xx = 0 + (((tickAnim - 280) / 25) * (0-(0)));
            yy = -6.22 + (((tickAnim - 280) / 25) * (-3.72-(-6.22)));
            zz = -9.795 + (((tickAnim - 280) / 25) * (-10.19-(-9.795)));
        }
        else if (tickAnim >= 305 && tickAnim < 323) {
            xx = 0 + (((tickAnim - 305) / 18) * (0-(0)));
            yy = -3.72 + (((tickAnim - 305) / 18) * (-3.32-(-3.72)));
            zz = -10.19 + (((tickAnim - 305) / 18) * (-10.14-(-10.19)));
        }
        else if (tickAnim >= 323 && tickAnim < 333) {
            xx = 0 + (((tickAnim - 323) / 10) * (0-(0)));
            yy = -3.32 + (((tickAnim - 323) / 10) * (-2.37-(-3.32)));
            zz = -10.14 + (((tickAnim - 323) / 10) * (-8.915-(-10.14)));
        }
        else if (tickAnim >= 333 && tickAnim < 338) {
            xx = 0 + (((tickAnim - 333) / 5) * (0-(0)));
            yy = -2.37 + (((tickAnim - 333) / 5) * (-1.425-(-2.37)));
            zz = -8.915 + (((tickAnim - 333) / 5) * (-8.275-(-8.915)));
        }
        else if (tickAnim >= 338 && tickAnim < 343) {
            xx = 0 + (((tickAnim - 338) / 5) * (0-(0)));
            yy = -1.425 + (((tickAnim - 338) / 5) * (-0.92-(-1.425)));
            zz = -8.275 + (((tickAnim - 338) / 5) * (-6.965-(-8.275)));
        }
        else if (tickAnim >= 343 && tickAnim < 349) {
            xx = 0 + (((tickAnim - 343) / 6) * (0-(0)));
            yy = -0.92 + (((tickAnim - 343) / 6) * (-0.46-(-0.92)));
            zz = -6.965 + (((tickAnim - 343) / 6) * (-4.53-(-6.965)));
        }
        else if (tickAnim >= 349 && tickAnim < 360) {
            xx = 0 + (((tickAnim - 349) / 11) * (0-(0)));
            yy = -0.46 + (((tickAnim - 349) / 11) * (0-(-0.46)));
            zz = -4.53 + (((tickAnim - 349) / 11) * (0-(-4.53)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.grub.rotationPointX = this.grub.rotationPointX + (float)(xx);
        this.grub.rotationPointY = this.grub.rotationPointY - (float)(yy);
        this.grub.rotationPointZ = this.grub.rotationPointZ + (float)(zz);




        if (tickAnim >= 48 && tickAnim < 80) {
            xx = 0 + (((tickAnim - 48) / 32) * (0-(0)));
            yy = 0 + (((tickAnim - 48) / 32) * (0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*280-100))*5-(0)));
            zz = 0 + (((tickAnim - 48) / 32) * (0-(0)));
        }
        else if (tickAnim >= 80 && tickAnim < 270) {
            xx = 0 + (((tickAnim - 80) / 190) * (0-(0)));
            yy = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*280-100))*5 + (((tickAnim - 80) / 190) * (0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*280-100))*5-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*280-100))*5)));
            zz = 0 + (((tickAnim - 80) / 190) * (0-(0)));
        }
        else if (tickAnim >= 270 && tickAnim < 280) {
            xx = 0 + (((tickAnim - 270) / 10) * (33.7255-(0)));
            yy = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*280-100))*5 + (((tickAnim - 270) / 10) * (14.8611-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*280-100))*5)));
            zz = 0 + (((tickAnim - 270) / 10) * (9.7606-(0)));
        }
        else if (tickAnim >= 280 && tickAnim < 286) {
            xx = 33.7255 + (((tickAnim - 280) / 6) * (15.913-(33.7255)));
            yy = 14.8611 + (((tickAnim - 280) / 6) * (14.8611-(14.8611)));
            zz = 9.7606 + (((tickAnim - 280) / 6) * (9.7606-(9.7606)));
        }
        else if (tickAnim >= 286 && tickAnim < 305) {
            xx = 15.913 + (((tickAnim - 286) / 19) * (-20.0245-(15.913)));
            yy = 14.8611 + (((tickAnim - 286) / 19) * (14.8611-(14.8611)));
            zz = 9.7606 + (((tickAnim - 286) / 19) * (9.7606-(9.7606)));
        }
        else if (tickAnim >= 305 && tickAnim < 333) {
            xx = -20.0245 + (((tickAnim - 305) / 28) * (-2.96365-(-20.0245)));
            yy = 14.8611 + (((tickAnim - 305) / 28) * (7.62102-(14.8611)));
            zz = 9.7606 + (((tickAnim - 305) / 28) * (10.14738-(9.7606)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(grub2, grub2.rotateAngleX + (float) Math.toRadians(xx), grub2.rotateAngleY + (float) Math.toRadians(yy), grub2.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 48 && tickAnim < 80) {
            xx = 0 + (((tickAnim - 48) / 32) * (0-(0)));
            yy = 0 + (((tickAnim - 48) / 32) * (0-(0)));
            zz = 0 + (((tickAnim - 48) / 32) * (-0.125-(0)));
        }
        else if (tickAnim >= 80 && tickAnim < 270) {
            xx = 0 + (((tickAnim - 80) / 190) * (0-(0)));
            yy = 0 + (((tickAnim - 80) / 190) * (0-(0)));
            zz = -0.125 + (((tickAnim - 80) / 190) * (-0.125-(-0.125)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.grub2.rotationPointX = this.grub2.rotationPointX + (float)(xx);
        this.grub2.rotationPointY = this.grub2.rotationPointY - (float)(yy);
        this.grub2.rotationPointZ = this.grub2.rotationPointZ + (float)(zz);


    }
    public void animWalking(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime) {
        EntityPrehistoricFloraCandidodon entity = (EntityPrehistoricFloraCandidodon) entitylivingbaseIn;
        int animCycle = 20;
        double tickAnim = (entity.ticksExisted + entity.getTickOffset()) - (int) (Math.floor((double) (entity.ticksExisted + entity.getTickOffset()) / (double) animCycle) * (double) animCycle) + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;
        this.setRotateAngle(main, main.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/0.5-50))*1.5), main.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360+50))*1), main.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360-90))*1.5));
        this.main.rotationPointX = this.main.rotationPointX + (float)(0);
        this.main.rotationPointY = this.main.rotationPointY - (float)(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/0.5-90))*0.2);
        this.main.rotationPointZ = this.main.rotationPointZ + (float)(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/0.5-90))*0.3);



        if (tickAnim >= 0 && tickAnim < 11) {
            xx = 28.32039 + (((tickAnim - 0) / 11) * (-28.5-(28.32039)));
            yy = 5.83971 + (((tickAnim - 0) / 11) * (0-(5.83971)));
            zz = 1.37998 + (((tickAnim - 0) / 11) * (0-(1.37998)));
        }
        else if (tickAnim >= 11 && tickAnim < 20) {
            xx = -28.5 + (((tickAnim - 11) / 9) * (28.32039-(-28.5)));
            yy = 0 + (((tickAnim - 11) / 9) * (5.83971-(0)));
            zz = 0 + (((tickAnim - 11) / 9) * (1.37998-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(backLeftLeg, backLeftLeg.rotateAngleX + (float) Math.toRadians(xx), backLeftLeg.rotateAngleY + (float) Math.toRadians(yy), backLeftLeg.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 6) {
            xx = 13.25 + (((tickAnim - 0) / 6) * (-14.07-(13.25)));
            yy = 0 + (((tickAnim - 0) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 6) * (0-(0)));
        }
        else if (tickAnim >= 6 && tickAnim < 11) {
            xx = -14.07 + (((tickAnim - 6) / 5) * (7.25-(-14.07)));
            yy = 0 + (((tickAnim - 6) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 6) / 5) * (0-(0)));
        }
        else if (tickAnim >= 11 && tickAnim < 20) {
            xx = 7.25 + (((tickAnim - 11) / 9) * (13.25-(7.25)));
            yy = 0 + (((tickAnim - 11) / 9) * (0-(0)));
            zz = 0 + (((tickAnim - 11) / 9) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(backLeftLeg2, backLeftLeg2.rotateAngleX + (float) Math.toRadians(xx), backLeftLeg2.rotateAngleY + (float) Math.toRadians(yy), backLeftLeg2.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 6) {
            xx = 0 + (((tickAnim - 0) / 6) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 6) * (1.15-(0)));
            zz = 0 + (((tickAnim - 0) / 6) * (0-(0)));
        }
        else if (tickAnim >= 6 && tickAnim < 11) {
            xx = 0 + (((tickAnim - 6) / 5) * (0-(0)));
            yy = 1.15 + (((tickAnim - 6) / 5) * (-0.2-(1.15)));
            zz = 0 + (((tickAnim - 6) / 5) * (0.225-(0)));
        }
        else if (tickAnim >= 11 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 11) / 9) * (0-(0)));
            yy = -0.2 + (((tickAnim - 11) / 9) * (0-(-0.2)));
            zz = 0.225 + (((tickAnim - 11) / 9) * (0-(0.225)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.backLeftLeg2.rotationPointX = this.backLeftLeg2.rotationPointX + (float)(xx);
        this.backLeftLeg2.rotationPointY = this.backLeftLeg2.rotationPointY - (float)(yy);
        this.backLeftLeg2.rotationPointZ = this.backLeftLeg2.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 2) {
            xx = 38.75 + (((tickAnim - 0) / 2) * (64.29-(38.75)));
            yy = 0 + (((tickAnim - 0) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 2) * (0-(0)));
        }
        else if (tickAnim >= 2 && tickAnim < 6) {
            xx = 64.29 + (((tickAnim - 2) / 4) * (62.36-(64.29)));
            yy = 0 + (((tickAnim - 2) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 2) / 4) * (0-(0)));
        }
        else if (tickAnim >= 6 && tickAnim < 9) {
            xx = 62.36 + (((tickAnim - 6) / 3) * (16.89-(62.36)));
            yy = 0 + (((tickAnim - 6) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 6) / 3) * (0-(0)));
        }
        else if (tickAnim >= 9 && tickAnim < 11) {
            xx = 16.89 + (((tickAnim - 9) / 2) * (21.25-(16.89)));
            yy = 0 + (((tickAnim - 9) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 9) / 2) * (0-(0)));
        }
        else if (tickAnim >= 11 && tickAnim < 15) {
            xx = 21.25 + (((tickAnim - 11) / 4) * (-7.05-(21.25)));
            yy = 0 + (((tickAnim - 11) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 11) / 4) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 20) {
            xx = -7.05 + (((tickAnim - 15) / 5) * (38.75-(-7.05)));
            yy = 0 + (((tickAnim - 15) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 5) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(backLeftLeg3, backLeftLeg3.rotateAngleX + (float) Math.toRadians(xx), backLeftLeg3.rotateAngleY + (float) Math.toRadians(yy), backLeftLeg3.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 2) {
            xx = 0 + (((tickAnim - 0) / 2) * (0-(0)));
            yy = -0.1 + (((tickAnim - 0) / 2) * (0.65-(-0.1)));
            zz = 0.225 + (((tickAnim - 0) / 2) * (0.4-(0.225)));
        }
        else if (tickAnim >= 2 && tickAnim < 4) {
            xx = 0 + (((tickAnim - 2) / 2) * (0-(0)));
            yy = 0.65 + (((tickAnim - 2) / 2) * (1.53-(0.65)));
            zz = 0.4 + (((tickAnim - 2) / 2) * (0.2-(0.4)));
        }
        else if (tickAnim >= 4 && tickAnim < 6) {
            xx = 0 + (((tickAnim - 4) / 2) * (0-(0)));
            yy = 1.53 + (((tickAnim - 4) / 2) * (1.1-(1.53)));
            zz = 0.2 + (((tickAnim - 4) / 2) * (0-(0.2)));
        }
        else if (tickAnim >= 6 && tickAnim < 9) {
            xx = 0 + (((tickAnim - 6) / 3) * (0-(0)));
            yy = 1.1 + (((tickAnim - 6) / 3) * (-0.5-(1.1)));
            zz = 0 + (((tickAnim - 6) / 3) * (0-(0)));
        }
        else if (tickAnim >= 9 && tickAnim < 11) {
            xx = 0 + (((tickAnim - 9) / 2) * (0-(0)));
            yy = -0.5 + (((tickAnim - 9) / 2) * (-0.625-(-0.5)));
            zz = 0 + (((tickAnim - 9) / 2) * (0-(0)));
        }
        else if (tickAnim >= 11 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 11) / 4) * (0-(0)));
            yy = -0.625 + (((tickAnim - 11) / 4) * (-0.34-(-0.625)));
            zz = 0 + (((tickAnim - 11) / 4) * (0.1-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 15) / 5) * (0-(0)));
            yy = -0.34 + (((tickAnim - 15) / 5) * (-0.1-(-0.34)));
            zz = 0.1 + (((tickAnim - 15) / 5) * (0.225-(0.1)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.backLeftLeg3.rotationPointX = this.backLeftLeg3.rotationPointX + (float)(xx);
        this.backLeftLeg3.rotationPointY = this.backLeftLeg3.rotationPointY - (float)(yy);
        this.backLeftLeg3.rotationPointZ = this.backLeftLeg3.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 11) {
            xx = -28.5 + (((tickAnim - 0) / 11) * (28.32039-(-28.5)));
            yy = 0 + (((tickAnim - 0) / 11) * (5.83971-(0)));
            zz = 0 + (((tickAnim - 0) / 11) * (1.37998-(0)));
        }
        else if (tickAnim >= 11 && tickAnim < 20) {
            xx = 28.32039 + (((tickAnim - 11) / 9) * (-28.5-(28.32039)));
            yy = 5.83971 + (((tickAnim - 11) / 9) * (0-(5.83971)));
            zz = 1.37998 + (((tickAnim - 11) / 9) * (0-(1.37998)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(backRightLeg, backRightLeg.rotateAngleX + (float) Math.toRadians(xx), backRightLeg.rotateAngleY + (float) Math.toRadians(yy), backRightLeg.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 11) {
            xx = 7.25 + (((tickAnim - 0) / 11) * (13.25-(7.25)));
            yy = 0 + (((tickAnim - 0) / 11) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 11) * (0-(0)));
        }
        else if (tickAnim >= 11 && tickAnim < 16) {
            xx = 13.25 + (((tickAnim - 11) / 5) * (-14.07-(13.25)));
            yy = 0 + (((tickAnim - 11) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 11) / 5) * (0-(0)));
        }
        else if (tickAnim >= 16 && tickAnim < 20) {
            xx = -14.07 + (((tickAnim - 16) / 4) * (7.25-(-14.07)));
            yy = 0 + (((tickAnim - 16) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 16) / 4) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(backRightLeg2, backRightLeg2.rotateAngleX + (float) Math.toRadians(xx), backRightLeg2.rotateAngleY + (float) Math.toRadians(yy), backRightLeg2.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 11) {
            xx = 0 + (((tickAnim - 0) / 11) * (0-(0)));
            yy = -0.2 + (((tickAnim - 0) / 11) * (0-(-0.2)));
            zz = 0.225 + (((tickAnim - 0) / 11) * (0-(0.225)));
        }
        else if (tickAnim >= 11 && tickAnim < 16) {
            xx = 0 + (((tickAnim - 11) / 5) * (0-(0)));
            yy = 0 + (((tickAnim - 11) / 5) * (1.15-(0)));
            zz = 0 + (((tickAnim - 11) / 5) * (0-(0)));
        }
        else if (tickAnim >= 16 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 16) / 4) * (0-(0)));
            yy = 1.15 + (((tickAnim - 16) / 4) * (-0.2-(1.15)));
            zz = 0 + (((tickAnim - 16) / 4) * (0.225-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.backRightLeg2.rotationPointX = this.backRightLeg2.rotationPointX + (float)(xx);
        this.backRightLeg2.rotationPointY = this.backRightLeg2.rotationPointY - (float)(yy);
        this.backRightLeg2.rotationPointZ = this.backRightLeg2.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 5) {
            xx = 21.25 + (((tickAnim - 0) / 5) * (-2.06-(21.25)));
            yy = 0 + (((tickAnim - 0) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 5) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 11) {
            xx = -2.06 + (((tickAnim - 5) / 6) * (38.75-(-2.06)));
            yy = 0 + (((tickAnim - 5) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 5) / 6) * (0-(0)));
        }
        else if (tickAnim >= 11 && tickAnim < 13) {
            xx = 38.75 + (((tickAnim - 11) / 2) * (64.29-(38.75)));
            yy = 0 + (((tickAnim - 11) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 11) / 2) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 16) {
            xx = 64.29 + (((tickAnim - 13) / 3) * (62.36-(64.29)));
            yy = 0 + (((tickAnim - 13) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 13) / 3) * (0-(0)));
        }
        else if (tickAnim >= 16 && tickAnim < 18) {
            xx = 62.36 + (((tickAnim - 16) / 2) * (16.89-(62.36)));
            yy = 0 + (((tickAnim - 16) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 16) / 2) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 20) {
            xx = 16.89 + (((tickAnim - 18) / 2) * (21.25-(16.89)));
            yy = 0 + (((tickAnim - 18) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 18) / 2) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(backRightLeg3, backRightLeg3.rotateAngleX + (float) Math.toRadians(xx), backRightLeg3.rotateAngleY + (float) Math.toRadians(yy), backRightLeg3.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            yy = -0.625 + (((tickAnim - 0) / 3) * (-0.16-(-0.625)));
            zz = 0 + (((tickAnim - 0) / 3) * (0.05-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 3) / 2) * (0-(0)));
            yy = -0.16 + (((tickAnim - 3) / 2) * (-0.205-(-0.16)));
            zz = 0.05 + (((tickAnim - 3) / 2) * (0.1-(0.05)));
        }
        else if (tickAnim >= 5 && tickAnim < 11) {
            xx = 0 + (((tickAnim - 5) / 6) * (0-(0)));
            yy = -0.205 + (((tickAnim - 5) / 6) * (-0.1-(-0.205)));
            zz = 0.1 + (((tickAnim - 5) / 6) * (0.225-(0.1)));
        }
        else if (tickAnim >= 11 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 11) / 2) * (0-(0)));
            yy = -0.1 + (((tickAnim - 11) / 2) * (0.65-(-0.1)));
            zz = 0.225 + (((tickAnim - 11) / 2) * (0.4-(0.225)));
        }
        else if (tickAnim >= 13 && tickAnim < 14) {
            xx = 0 + (((tickAnim - 13) / 1) * (0-(0)));
            yy = 0.65 + (((tickAnim - 13) / 1) * (1.53-(0.65)));
            zz = 0.4 + (((tickAnim - 13) / 1) * (0.2-(0.4)));
        }
        else if (tickAnim >= 14 && tickAnim < 16) {
            xx = 0 + (((tickAnim - 14) / 2) * (0-(0)));
            yy = 1.53 + (((tickAnim - 14) / 2) * (1.1-(1.53)));
            zz = 0.2 + (((tickAnim - 14) / 2) * (0-(0.2)));
        }
        else if (tickAnim >= 16 && tickAnim < 18) {
            xx = 0 + (((tickAnim - 16) / 2) * (0-(0)));
            yy = 1.1 + (((tickAnim - 16) / 2) * (-0.5-(1.1)));
            zz = 0 + (((tickAnim - 16) / 2) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 18) / 2) * (0-(0)));
            yy = -0.5 + (((tickAnim - 18) / 2) * (-0.625-(-0.5)));
            zz = 0 + (((tickAnim - 18) / 2) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.backRightLeg3.rotationPointX = this.backRightLeg3.rotationPointX + (float)(xx);
        this.backRightLeg3.rotationPointY = this.backRightLeg3.rotationPointY - (float)(yy);
        this.backRightLeg3.rotationPointZ = this.backRightLeg3.rotationPointZ + (float)(zz);



        this.setRotateAngle(body, body.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/0.5-100))*-1.5), body.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360+100))*-1), body.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360-150))*1.5));


        this.setRotateAngle(body2, body2.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/0.5-150))*1.5), body2.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360+150))*-1), body2.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360-200))*1.5));


        this.setRotateAngle(body3, body3.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/0.5-200))*-1.5), body3.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360-200))*1), body3.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360-250))*1.5));


        this.setRotateAngle(neck, neck.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/0.5-250))*1.5), neck.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360-250))*1), neck.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360-300))*-1.5));


        this.setRotateAngle(head, head.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/0.5-300))*-1.5), head.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360-300))*1), head.rotateAngleZ + (float) Math.toRadians(0));



        if (tickAnim >= 0 && tickAnim < 9) {
            xx = -28.25 + (((tickAnim - 0) / 9) * (28-(-28.25)));
            yy = 0 + (((tickAnim - 0) / 9) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 9) * (0-(0)));
        }
        else if (tickAnim >= 9 && tickAnim < 20) {
            xx = 28 + (((tickAnim - 9) / 11) * (-28.25-(28)));
            yy = 0 + (((tickAnim - 9) / 11) * (0-(0)));
            zz = 0 + (((tickAnim - 9) / 11) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(frontLeftLeg, frontLeftLeg.rotateAngleX + (float) Math.toRadians(xx), frontLeftLeg.rotateAngleY + (float) Math.toRadians(yy), frontLeftLeg.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 9) {
            xx = 11.75 + (((tickAnim - 0) / 9) * (-1.75-(11.75)));
            yy = 0 + (((tickAnim - 0) / 9) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 9) * (0-(0)));
        }
        else if (tickAnim >= 9 && tickAnim < 15) {
            xx = -1.75 + (((tickAnim - 9) / 6) * (-39.23-(-1.75)));
            yy = 0 + (((tickAnim - 9) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 9) / 6) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 20) {
            xx = -39.23 + (((tickAnim - 15) / 5) * (11.75-(-39.23)));
            yy = 0 + (((tickAnim - 15) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 5) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(frontLeftLeg2, frontLeftLeg2.rotateAngleX + (float) Math.toRadians(xx), frontLeftLeg2.rotateAngleY + (float) Math.toRadians(yy), frontLeftLeg2.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 9) {
            xx = 0 + (((tickAnim - 0) / 9) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 9) * (0.45-(0)));
            zz = 0 + (((tickAnim - 0) / 9) * (0-(0)));
        }
        else if (tickAnim >= 9 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 9) / 6) * (0-(0)));
            yy = 0.45 + (((tickAnim - 9) / 6) * (0.11-(0.45)));
            zz = 0 + (((tickAnim - 9) / 6) * (0.05-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 15) / 5) * (0-(0)));
            yy = 0.11 + (((tickAnim - 15) / 5) * (0-(0.11)));
            zz = 0.05 + (((tickAnim - 15) / 5) * (0-(0.05)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.frontLeftLeg2.rotationPointX = this.frontLeftLeg2.rotationPointX + (float)(xx);
        this.frontLeftLeg2.rotationPointY = this.frontLeftLeg2.rotationPointY - (float)(yy);
        this.frontLeftLeg2.rotationPointZ = this.frontLeftLeg2.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 18.5 + (((tickAnim - 0) / 3) * (2.25-(18.5)));
            yy = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 3) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 9) {
            xx = 2.25 + (((tickAnim - 3) / 6) * (44.5-(2.25)));
            yy = 0 + (((tickAnim - 3) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 3) / 6) * (0-(0)));
        }
        else if (tickAnim >= 9 && tickAnim < 12) {
            xx = 44.5 + (((tickAnim - 9) / 3) * (95.79-(44.5)));
            yy = 0 + (((tickAnim - 9) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 9) / 3) * (0-(0)));
        }
        else if (tickAnim >= 12 && tickAnim < 15) {
            xx = 95.79 + (((tickAnim - 12) / 3) * (79-(95.79)));
            yy = 0 + (((tickAnim - 12) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 12) / 3) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 20) {
            xx = 79 + (((tickAnim - 15) / 5) * (18.5-(79)));
            yy = 0 + (((tickAnim - 15) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 5) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(frontLeftLeg3, frontLeftLeg3.rotateAngleX + (float) Math.toRadians(xx), frontLeftLeg3.rotateAngleY + (float) Math.toRadians(yy), frontLeftLeg3.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 3) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 9) {
            xx = 0 + (((tickAnim - 3) / 6) * (0-(0)));
            yy = 0 + (((tickAnim - 3) / 6) * (0.55-(0)));
            zz = 0 + (((tickAnim - 3) / 6) * (-0.45-(0)));
        }
        else if (tickAnim >= 9 && tickAnim < 12) {
            xx = 0 + (((tickAnim - 9) / 3) * (0-(0)));
            yy = 0.55 + (((tickAnim - 9) / 3) * (0.53-(0.55)));
            zz = -0.45 + (((tickAnim - 9) / 3) * (-0.7-(-0.45)));
        }
        else if (tickAnim >= 12 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 12) / 3) * (0-(0)));
            yy = 0.53 + (((tickAnim - 12) / 3) * (0.5-(0.53)));
            zz = -0.7 + (((tickAnim - 12) / 3) * (-0.685-(-0.7)));
        }
        else if (tickAnim >= 15 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 15) / 5) * (0-(0)));
            yy = 0.5 + (((tickAnim - 15) / 5) * (0-(0.5)));
            zz = -0.685 + (((tickAnim - 15) / 5) * (0-(-0.685)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.frontLeftLeg3.rotationPointX = this.frontLeftLeg3.rotationPointX + (float)(xx);
        this.frontLeftLeg3.rotationPointY = this.frontLeftLeg3.rotationPointY - (float)(yy);
        this.frontLeftLeg3.rotationPointZ = this.frontLeftLeg3.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 9) {
            xx = 28 + (((tickAnim - 0) / 9) * (-28.25-(28)));
            yy = 0 + (((tickAnim - 0) / 9) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 9) * (0-(0)));
        }
        else if (tickAnim >= 9 && tickAnim < 20) {
            xx = -28.25 + (((tickAnim - 9) / 11) * (28-(-28.25)));
            yy = 0 + (((tickAnim - 9) / 11) * (0-(0)));
            zz = 0 + (((tickAnim - 9) / 11) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(frontRightLeg, frontRightLeg.rotateAngleX + (float) Math.toRadians(xx), frontRightLeg.rotateAngleY + (float) Math.toRadians(yy), frontRightLeg.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 4) {
            xx = -1.75 + (((tickAnim - 0) / 4) * (-39.23-(-1.75)));
            yy = 0 + (((tickAnim - 0) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 4) * (0-(0)));
        }
        else if (tickAnim >= 4 && tickAnim < 9) {
            xx = -39.23 + (((tickAnim - 4) / 5) * (11.75-(-39.23)));
            yy = 0 + (((tickAnim - 4) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 4) / 5) * (0-(0)));
        }
        else if (tickAnim >= 9 && tickAnim < 20) {
            xx = 11.75 + (((tickAnim - 9) / 11) * (-1.75-(11.75)));
            yy = 0 + (((tickAnim - 9) / 11) * (0-(0)));
            zz = 0 + (((tickAnim - 9) / 11) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(frontRightLeg2, frontRightLeg2.rotateAngleX + (float) Math.toRadians(xx), frontRightLeg2.rotateAngleY + (float) Math.toRadians(yy), frontRightLeg2.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 4) {
            xx = 0 + (((tickAnim - 0) / 4) * (0-(0)));
            yy = 0.45 + (((tickAnim - 0) / 4) * (0.11-(0.45)));
            zz = 0 + (((tickAnim - 0) / 4) * (0.05-(0)));
        }
        else if (tickAnim >= 4 && tickAnim < 9) {
            xx = 0 + (((tickAnim - 4) / 5) * (0-(0)));
            yy = 0.11 + (((tickAnim - 4) / 5) * (0-(0.11)));
            zz = 0.05 + (((tickAnim - 4) / 5) * (0-(0.05)));
        }
        else if (tickAnim >= 9 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 9) / 11) * (0-(0)));
            yy = 0 + (((tickAnim - 9) / 11) * (0.45-(0)));
            zz = 0 + (((tickAnim - 9) / 11) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.frontRightLeg2.rotationPointX = this.frontRightLeg2.rotationPointX + (float)(xx);
        this.frontRightLeg2.rotationPointY = this.frontRightLeg2.rotationPointY - (float)(yy);
        this.frontRightLeg2.rotationPointZ = this.frontRightLeg2.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 2) {
            xx = 63.25 + (((tickAnim - 0) / 2) * (95.79-(63.25)));
            yy = 0 + (((tickAnim - 0) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 2) * (0-(0)));
        }
        else if (tickAnim >= 2 && tickAnim < 4) {
            xx = 95.79 + (((tickAnim - 2) / 2) * (79-(95.79)));
            yy = 0 + (((tickAnim - 2) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 2) / 2) * (0-(0)));
        }
        else if (tickAnim >= 4 && tickAnim < 9) {
            xx = 79 + (((tickAnim - 4) / 5) * (18.5-(79)));
            yy = 0 + (((tickAnim - 4) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 4) / 5) * (0-(0)));
        }
        else if (tickAnim >= 9 && tickAnim < 15) {
            xx = 18.5 + (((tickAnim - 9) / 6) * (-5.65-(18.5)));
            yy = 0 + (((tickAnim - 9) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 9) / 6) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 20) {
            xx = -5.65 + (((tickAnim - 15) / 5) * (63.25-(-5.65)));
            yy = 0 + (((tickAnim - 15) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 5) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(frontRightLeg3, frontRightLeg3.rotateAngleX + (float) Math.toRadians(xx), frontRightLeg3.rotateAngleY + (float) Math.toRadians(yy), frontRightLeg3.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 2) {
            xx = 0 + (((tickAnim - 0) / 2) * (0-(0)));
            yy = 0.55 + (((tickAnim - 0) / 2) * (0.53-(0.55)));
            zz = -0.45 + (((tickAnim - 0) / 2) * (-0.7-(-0.45)));
        }
        else if (tickAnim >= 2 && tickAnim < 4) {
            xx = 0 + (((tickAnim - 2) / 2) * (0-(0)));
            yy = 0.53 + (((tickAnim - 2) / 2) * (0.5-(0.53)));
            zz = -0.7 + (((tickAnim - 2) / 2) * (-0.685-(-0.7)));
        }
        else if (tickAnim >= 4 && tickAnim < 9) {
            xx = 0 + (((tickAnim - 4) / 5) * (0-(0)));
            yy = 0.5 + (((tickAnim - 4) / 5) * (0-(0.5)));
            zz = -0.685 + (((tickAnim - 4) / 5) * (0-(-0.685)));
        }
        else if (tickAnim >= 9 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 9) / 6) * (0-(0)));
            yy = 0 + (((tickAnim - 9) / 6) * (-0.2-(0)));
            zz = 0 + (((tickAnim - 9) / 6) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 15) / 5) * (0-(0)));
            yy = -0.2 + (((tickAnim - 15) / 5) * (0.55-(-0.2)));
            zz = 0 + (((tickAnim - 15) / 5) * (-0.45-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.frontRightLeg3.rotationPointX = this.frontRightLeg3.rotationPointX + (float)(xx);
        this.frontRightLeg3.rotationPointY = this.frontRightLeg3.rotationPointY - (float)(yy);
        this.frontRightLeg3.rotationPointZ = this.frontRightLeg3.rotationPointZ + (float)(zz);



        this.setRotateAngle(tail, tail.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/0.5))*-1.5), tail.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360-50))*2), tail.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360-90))*1.5));


        this.setRotateAngle(tail2, tail2.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/0.5))*-1.5), tail2.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360-100))*4), tail2.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360-90))*1.5));


        this.setRotateAngle(tail3, tail3.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/0.5-50))*-1.5), tail3.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360-200))*6), tail3.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360-90))*1.5));


        this.setRotateAngle(tail4, tail4.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/0.5-100))*-1.5), tail4.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360-250))*8), tail4.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360-90))*1.5));
       
    }
    public void animRunning(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime) {
        EntityPrehistoricFloraCandidodon entity = (EntityPrehistoricFloraCandidodon) entitylivingbaseIn;
        int animCycle = 10;
        double tickAnim = (entity.ticksExisted + entity.getTickOffset()) - (int) (Math.floor((double) (entity.ticksExisted + entity.getTickOffset()) / (double) animCycle) * (double) animCycle) + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;
        this.setRotateAngle(main, main.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*720+80))*8), main.rotateAngleY + (float) Math.toRadians(0), main.rotateAngleZ + (float) Math.toRadians(0));
        this.main.rotationPointX = this.main.rotationPointX + (float)(0);
        this.main.rotationPointY = this.main.rotationPointY - (float)(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*720-80))*-1.5);
        this.main.rotationPointZ = this.main.rotationPointZ + (float)(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*720+20))*1.5);



        if (tickAnim >= 0 && tickAnim < 5) {
            xx = -13.68782 + (((tickAnim - 0) / 5) * (35.06218-(-13.68782)));
            yy = -12.76443 + (((tickAnim - 0) / 5) * (-12.76443-(-12.76443)));
            zz = -11.02528 + (((tickAnim - 0) / 5) * (-11.02528-(-11.02528)));
        }
        else if (tickAnim >= 5 && tickAnim < 8) {
            xx = 35.06218 + (((tickAnim - 5) / 3) * (3.65857-(35.06218)));
            yy = -12.76443 + (((tickAnim - 5) / 3) * (-13.39611-(-12.76443)));
            zz = -11.02528 + (((tickAnim - 5) / 3) * (-24.10036-(-11.02528)));
        }
        else if (tickAnim >= 8 && tickAnim < 10) {
            xx = 3.65857 + (((tickAnim - 8) / 2) * (-13.68782-(3.65857)));
            yy = -13.39611 + (((tickAnim - 8) / 2) * (-12.76443-(-13.39611)));
            zz = -24.10036 + (((tickAnim - 8) / 2) * (-11.02528-(-24.10036)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(backLeftLeg, backLeftLeg.rotateAngleX + (float) Math.toRadians(xx), backLeftLeg.rotateAngleY + (float) Math.toRadians(yy), backLeftLeg.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 3) {
            xx = -10.25 + (((tickAnim - 0) / 3) * (-4.75-(-10.25)));
            yy = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 3) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 5) {
            xx = -4.75 + (((tickAnim - 3) / 2) * (36.75-(-4.75)));
            yy = 0 + (((tickAnim - 3) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 3) / 2) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 8) {
            xx = 36.75 + (((tickAnim - 5) / 3) * (34-(36.75)));
            yy = 0 + (((tickAnim - 5) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 5) / 3) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 10) {
            xx = 34 + (((tickAnim - 8) / 2) * (-10.25-(34)));
            yy = 0 + (((tickAnim - 8) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 2) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(backLeftLeg2, backLeftLeg2.rotateAngleX + (float) Math.toRadians(xx), backLeftLeg2.rotateAngleY + (float) Math.toRadians(yy), backLeftLeg2.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 0) / 5) * (0-(0)));
            yy = -0.175 + (((tickAnim - 0) / 5) * (0-(-0.175)));
            zz = 0 + (((tickAnim - 0) / 5) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 5) / 5) * (0-(0)));
            yy = 0 + (((tickAnim - 5) / 5) * (-0.175-(0)));
            zz = 0 + (((tickAnim - 5) / 5) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.backLeftLeg2.rotationPointX = this.backLeftLeg2.rotationPointX + (float)(xx);
        this.backLeftLeg2.rotationPointY = this.backLeftLeg2.rotationPointY - (float)(yy);
        this.backLeftLeg2.rotationPointZ = this.backLeftLeg2.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 23.65535 + (((tickAnim - 0) / 3) * (-2.59465-(23.65535)));
            yy = -1.28842 + (((tickAnim - 0) / 3) * (-1.28842-(-1.28842)));
            zz = 8.40249 + (((tickAnim - 0) / 3) * (8.40249-(8.40249)));
        }
        else if (tickAnim >= 3 && tickAnim < 3) {
            xx = -2.59465 + (((tickAnim - 3) / 0) * (-10.84465-(-2.59465)));
            yy = -1.28842 + (((tickAnim - 3) / 0) * (-1.28842-(-1.28842)));
            zz = 8.40249 + (((tickAnim - 3) / 0) * (8.40249-(8.40249)));
        }
        else if (tickAnim >= 3 && tickAnim < 5) {
            xx = -10.84465 + (((tickAnim - 3) / 2) * (74.65535-(-10.84465)));
            yy = -1.28842 + (((tickAnim - 3) / 2) * (-1.28842-(-1.28842)));
            zz = 8.40249 + (((tickAnim - 3) / 2) * (8.40249-(8.40249)));
        }
        else if (tickAnim >= 5 && tickAnim < 8) {
            xx = 74.65535 + (((tickAnim - 5) / 3) * (96.15535-(74.65535)));
            yy = -1.28842 + (((tickAnim - 5) / 3) * (-1.28842-(-1.28842)));
            zz = 8.40249 + (((tickAnim - 5) / 3) * (8.40249-(8.40249)));
        }
        else if (tickAnim >= 8 && tickAnim < 10) {
            xx = 96.15535 + (((tickAnim - 8) / 2) * (23.65535-(96.15535)));
            yy = -1.28842 + (((tickAnim - 8) / 2) * (-1.28842-(-1.28842)));
            zz = 8.40249 + (((tickAnim - 8) / 2) * (8.40249-(8.40249)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(backLeftLeg3, backLeftLeg3.rotateAngleX + (float) Math.toRadians(xx), backLeftLeg3.rotateAngleY + (float) Math.toRadians(yy), backLeftLeg3.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            yy = -0.525 + (((tickAnim - 0) / 3) * (-0.095-(-0.525)));
            zz = 0 + (((tickAnim - 0) / 3) * (-0.17-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 3) {
            xx = 0 + (((tickAnim - 3) / 0) * (0-(0)));
            yy = -0.095 + (((tickAnim - 3) / 0) * (0.06-(-0.095)));
            zz = -0.17 + (((tickAnim - 3) / 0) * (0.395-(-0.17)));
        }
        else if (tickAnim >= 3 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 3) / 2) * (0-(0)));
            yy = 0.06 + (((tickAnim - 3) / 2) * (-0.52-(0.06)));
            zz = 0.395 + (((tickAnim - 3) / 2) * (-0.35-(0.395)));
        }
        else if (tickAnim >= 5 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 5) / 3) * (0-(0)));
            yy = -0.52 + (((tickAnim - 5) / 3) * (0.955-(-0.52)));
            zz = -0.35 + (((tickAnim - 5) / 3) * (-0.17-(-0.35)));
        }
        else if (tickAnim >= 8 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 8) / 2) * (0-(0)));
            yy = 0.955 + (((tickAnim - 8) / 2) * (-0.525-(0.955)));
            zz = -0.17 + (((tickAnim - 8) / 2) * (0-(-0.17)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.backLeftLeg3.rotationPointX = this.backLeftLeg3.rotationPointX + (float)(xx);
        this.backLeftLeg3.rotationPointY = this.backLeftLeg3.rotationPointY - (float)(yy);
        this.backLeftLeg3.rotationPointZ = this.backLeftLeg3.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 5) {
            xx = -13.68782 + (((tickAnim - 0) / 5) * (35.06218-(-13.68782)));
            yy = 12.76443 + (((tickAnim - 0) / 5) * (12.76443-(12.76443)));
            zz = 11.02528 + (((tickAnim - 0) / 5) * (11.02528-(11.02528)));
        }
        else if (tickAnim >= 5 && tickAnim < 8) {
            xx = 35.06218 + (((tickAnim - 5) / 3) * (3.65857-(35.06218)));
            yy = 12.76443 + (((tickAnim - 5) / 3) * (13.39611-(12.76443)));
            zz = 11.02528 + (((tickAnim - 5) / 3) * (24.10036-(11.02528)));
        }
        else if (tickAnim >= 8 && tickAnim < 10) {
            xx = 3.65857 + (((tickAnim - 8) / 2) * (-13.68782-(3.65857)));
            yy = 13.39611 + (((tickAnim - 8) / 2) * (12.76443-(13.39611)));
            zz = 24.10036 + (((tickAnim - 8) / 2) * (11.02528-(24.10036)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(backRightLeg, backRightLeg.rotateAngleX + (float) Math.toRadians(xx), backRightLeg.rotateAngleY + (float) Math.toRadians(yy), backRightLeg.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 3) {
            xx = -10.25 + (((tickAnim - 0) / 3) * (-4.75-(-10.25)));
            yy = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 3) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 5) {
            xx = -4.75 + (((tickAnim - 3) / 2) * (36.75-(-4.75)));
            yy = 0 + (((tickAnim - 3) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 3) / 2) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 8) {
            xx = 36.75 + (((tickAnim - 5) / 3) * (34-(36.75)));
            yy = 0 + (((tickAnim - 5) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 5) / 3) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 10) {
            xx = 34 + (((tickAnim - 8) / 2) * (-10.25-(34)));
            yy = 0 + (((tickAnim - 8) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 2) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(backRightLeg2, backRightLeg2.rotateAngleX + (float) Math.toRadians(xx), backRightLeg2.rotateAngleY + (float) Math.toRadians(yy), backRightLeg2.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 0) / 5) * (0-(0)));
            yy = -0.175 + (((tickAnim - 0) / 5) * (0-(-0.175)));
            zz = 0 + (((tickAnim - 0) / 5) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 5) / 5) * (0-(0)));
            yy = 0 + (((tickAnim - 5) / 5) * (-0.175-(0)));
            zz = 0 + (((tickAnim - 5) / 5) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.backRightLeg2.rotationPointX = this.backRightLeg2.rotationPointX + (float)(xx);
        this.backRightLeg2.rotationPointY = this.backRightLeg2.rotationPointY - (float)(yy);
        this.backRightLeg2.rotationPointZ = this.backRightLeg2.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 23.65535 + (((tickAnim - 0) / 3) * (-2.59465-(23.65535)));
            yy = 1.28842 + (((tickAnim - 0) / 3) * (1.28842-(1.28842)));
            zz = -8.40249 + (((tickAnim - 0) / 3) * (-8.40249-(-8.40249)));
        }
        else if (tickAnim >= 3 && tickAnim < 3) {
            xx = -2.59465 + (((tickAnim - 3) / 0) * (-10.84465-(-2.59465)));
            yy = 1.28842 + (((tickAnim - 3) / 0) * (1.28842-(1.28842)));
            zz = -8.40249 + (((tickAnim - 3) / 0) * (-8.40249-(-8.40249)));
        }
        else if (tickAnim >= 3 && tickAnim < 5) {
            xx = -10.84465 + (((tickAnim - 3) / 2) * (74.65535-(-10.84465)));
            yy = 1.28842 + (((tickAnim - 3) / 2) * (1.28842-(1.28842)));
            zz = -8.40249 + (((tickAnim - 3) / 2) * (-8.40249-(-8.40249)));
        }
        else if (tickAnim >= 5 && tickAnim < 8) {
            xx = 74.65535 + (((tickAnim - 5) / 3) * (96.15535-(74.65535)));
            yy = 1.28842 + (((tickAnim - 5) / 3) * (1.28842-(1.28842)));
            zz = -8.40249 + (((tickAnim - 5) / 3) * (-8.40249-(-8.40249)));
        }
        else if (tickAnim >= 8 && tickAnim < 10) {
            xx = 96.15535 + (((tickAnim - 8) / 2) * (23.65535-(96.15535)));
            yy = 1.28842 + (((tickAnim - 8) / 2) * (1.28842-(1.28842)));
            zz = -8.40249 + (((tickAnim - 8) / 2) * (-8.40249-(-8.40249)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(backRightLeg3, backRightLeg3.rotateAngleX + (float) Math.toRadians(xx), backRightLeg3.rotateAngleY + (float) Math.toRadians(yy), backRightLeg3.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            yy = -0.525 + (((tickAnim - 0) / 3) * (-0.095-(-0.525)));
            zz = 0 + (((tickAnim - 0) / 3) * (-0.17-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 3) {
            xx = 0 + (((tickAnim - 3) / 0) * (0-(0)));
            yy = -0.095 + (((tickAnim - 3) / 0) * (0.06-(-0.095)));
            zz = -0.17 + (((tickAnim - 3) / 0) * (0.395-(-0.17)));
        }
        else if (tickAnim >= 3 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 3) / 2) * (0-(0)));
            yy = 0.06 + (((tickAnim - 3) / 2) * (-0.52-(0.06)));
            zz = 0.395 + (((tickAnim - 3) / 2) * (-0.35-(0.395)));
        }
        else if (tickAnim >= 5 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 5) / 3) * (0-(0)));
            yy = -0.52 + (((tickAnim - 5) / 3) * (0.955-(-0.52)));
            zz = -0.35 + (((tickAnim - 5) / 3) * (-0.17-(-0.35)));
        }
        else if (tickAnim >= 8 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 8) / 2) * (0-(0)));
            yy = 0.955 + (((tickAnim - 8) / 2) * (-0.525-(0.955)));
            zz = -0.17 + (((tickAnim - 8) / 2) * (0-(-0.17)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.backRightLeg3.rotationPointX = this.backRightLeg3.rotationPointX + (float)(xx);
        this.backRightLeg3.rotationPointY = this.backRightLeg3.rotationPointY - (float)(yy);
        this.backRightLeg3.rotationPointZ = this.backRightLeg3.rotationPointZ + (float)(zz);



        this.setRotateAngle(body, body.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*720))*-8), body.rotateAngleY + (float) Math.toRadians(0), body.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(body2, body2.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*720-50))*-8), body2.rotateAngleY + (float) Math.toRadians(0), body2.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(body3, body3.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*720-100))*8), body3.rotateAngleY + (float) Math.toRadians(0), body3.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(neck, neck.rotateAngleX + (float) Math.toRadians(3.25+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*720-200))*-9), neck.rotateAngleY + (float) Math.toRadians(0), neck.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(head, head.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*720-250))*-6), head.rotateAngleY + (float) Math.toRadians(0), head.rotateAngleZ + (float) Math.toRadians(0));



        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 43.42838 + (((tickAnim - 0) / 3) * (2.97001-(43.42838)));
            yy = -4.00868 + (((tickAnim - 0) / 3) * (8.03724-(-4.00868)));
            zz = 2.0463 + (((tickAnim - 0) / 3) * (-22.20696-(2.0463)));
        }
        else if (tickAnim >= 3 && tickAnim < 5) {
            xx = 2.97001 + (((tickAnim - 3) / 2) * (-35-(2.97001)));
            yy = 8.03724 + (((tickAnim - 3) / 2) * (0-(8.03724)));
            zz = -22.20696 + (((tickAnim - 3) / 2) * (0-(-22.20696)));
        }
        else if (tickAnim >= 5 && tickAnim < 10) {
            xx = -35 + (((tickAnim - 5) / 5) * (43.42838-(-35)));
            yy = 0 + (((tickAnim - 5) / 5) * (-4.00868-(0)));
            zz = 0 + (((tickAnim - 5) / 5) * (2.0463-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(frontLeftLeg, frontLeftLeg.rotateAngleX + (float) Math.toRadians(xx), frontLeftLeg.rotateAngleY + (float) Math.toRadians(yy), frontLeftLeg.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 12.75 + (((tickAnim - 0) / 3) * (-39.37-(12.75)));
            yy = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 3) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 5) {
            xx = -39.37 + (((tickAnim - 3) / 2) * (16.5-(-39.37)));
            yy = 0 + (((tickAnim - 3) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 3) / 2) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 10) {
            xx = 16.5 + (((tickAnim - 5) / 5) * (12.75-(16.5)));
            yy = 0 + (((tickAnim - 5) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 5) / 5) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(frontLeftLeg2, frontLeftLeg2.rotateAngleX + (float) Math.toRadians(xx), frontLeftLeg2.rotateAngleY + (float) Math.toRadians(yy), frontLeftLeg2.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 0) / 5) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 5) * (0.225-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 5) / 3) * (0-(0)));
            yy = 0 + (((tickAnim - 5) / 3) * (0.625-(0)));
            zz = 0.225 + (((tickAnim - 5) / 3) * (0.11-(0.225)));
        }
        else if (tickAnim >= 8 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 8) / 2) * (0-(0)));
            yy = 0.625 + (((tickAnim - 8) / 2) * (0-(0.625)));
            zz = 0.11 + (((tickAnim - 8) / 2) * (0-(0.11)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.frontLeftLeg2.rotationPointX = this.frontLeftLeg2.rotationPointX + (float)(xx);
        this.frontLeftLeg2.rotationPointY = this.frontLeftLeg2.rotationPointY - (float)(yy);
        this.frontLeftLeg2.rotationPointZ = this.frontLeftLeg2.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 80.75 + (((tickAnim - 0) / 3) * (105.25-(80.75)));
            yy = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 3) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 5) {
            xx = 105.25 + (((tickAnim - 3) / 2) * (19.75-(105.25)));
            yy = 0 + (((tickAnim - 3) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 3) / 2) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 8) {
            xx = 19.75 + (((tickAnim - 5) / 3) * (-32-(19.75)));
            yy = 0 + (((tickAnim - 5) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 5) / 3) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 10) {
            xx = -32 + (((tickAnim - 8) / 2) * (80.75-(-32)));
            yy = 0 + (((tickAnim - 8) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 2) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(frontLeftLeg3, frontLeftLeg3.rotateAngleX + (float) Math.toRadians(xx), frontLeftLeg3.rotateAngleY + (float) Math.toRadians(yy), frontLeftLeg3.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            zz = -0.6 + (((tickAnim - 0) / 3) * (-0.9-(-0.6)));
        }
        else if (tickAnim >= 3 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 3) / 2) * (0-(0)));
            yy = 0 + (((tickAnim - 3) / 2) * (0-(0)));
            zz = -0.9 + (((tickAnim - 3) / 2) * (0-(-0.9)));
        }
        else if (tickAnim >= 5 && tickAnim < 6) {
            xx = 0 + (((tickAnim - 5) / 1) * (0-(0)));
            yy = 0 + (((tickAnim - 5) / 1) * (0.525-(0)));
            zz = 0 + (((tickAnim - 5) / 1) * (-0.1-(0)));
        }
        else if (tickAnim >= 6 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 6) / 4) * (0-(0)));
            yy = 0.525 + (((tickAnim - 6) / 4) * (0-(0.525)));
            zz = -0.1 + (((tickAnim - 6) / 4) * (-0.6-(-0.1)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.frontLeftLeg3.rotationPointX = this.frontLeftLeg3.rotationPointX + (float)(xx);
        this.frontLeftLeg3.rotationPointY = this.frontLeftLeg3.rotationPointY - (float)(yy);
        this.frontLeftLeg3.rotationPointZ = this.frontLeftLeg3.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 43.42838 + (((tickAnim - 0) / 3) * (2.97001-(43.42838)));
            yy = 4.00868 + (((tickAnim - 0) / 3) * (-8.03724-(4.00868)));
            zz = -2.0463 + (((tickAnim - 0) / 3) * (22.20696-(-2.0463)));
        }
        else if (tickAnim >= 3 && tickAnim < 5) {
            xx = 2.97001 + (((tickAnim - 3) / 2) * (-35-(2.97001)));
            yy = -8.03724 + (((tickAnim - 3) / 2) * (0-(-8.03724)));
            zz = 22.20696 + (((tickAnim - 3) / 2) * (0-(22.20696)));
        }
        else if (tickAnim >= 5 && tickAnim < 10) {
            xx = -35 + (((tickAnim - 5) / 5) * (43.42838-(-35)));
            yy = 0 + (((tickAnim - 5) / 5) * (4.00868-(0)));
            zz = 0 + (((tickAnim - 5) / 5) * (-2.0463-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(frontRightLeg, frontRightLeg.rotateAngleX + (float) Math.toRadians(xx), frontRightLeg.rotateAngleY + (float) Math.toRadians(yy), frontRightLeg.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 12.75 + (((tickAnim - 0) / 3) * (-39.37-(12.75)));
            yy = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 3) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 5) {
            xx = -39.37 + (((tickAnim - 3) / 2) * (16.5-(-39.37)));
            yy = 0 + (((tickAnim - 3) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 3) / 2) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 10) {
            xx = 16.5 + (((tickAnim - 5) / 5) * (12.75-(16.5)));
            yy = 0 + (((tickAnim - 5) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 5) / 5) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(frontRightLeg2, frontRightLeg2.rotateAngleX + (float) Math.toRadians(xx), frontRightLeg2.rotateAngleY + (float) Math.toRadians(yy), frontRightLeg2.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 5 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 5) / 3) * (0-(0)));
            yy = 0 + (((tickAnim - 5) / 3) * (0.625-(0)));
            zz = 0.225 + (((tickAnim - 5) / 3) * (0.11-(0.225)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.frontRightLeg2.rotationPointX = this.frontRightLeg2.rotationPointX + (float)(xx);
        this.frontRightLeg2.rotationPointY = this.frontRightLeg2.rotationPointY - (float)(yy);
        this.frontRightLeg2.rotationPointZ = this.frontRightLeg2.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 80.75 + (((tickAnim - 0) / 3) * (105.25-(80.75)));
            yy = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 3) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 5) {
            xx = 105.25 + (((tickAnim - 3) / 2) * (19.75-(105.25)));
            yy = 0 + (((tickAnim - 3) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 3) / 2) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 8) {
            xx = 19.75 + (((tickAnim - 5) / 3) * (-30-(19.75)));
            yy = 0 + (((tickAnim - 5) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 5) / 3) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 10) {
            xx = -30 + (((tickAnim - 8) / 2) * (80.75-(-30)));
            yy = 0 + (((tickAnim - 8) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 2) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(frontRightLeg3, frontRightLeg3.rotateAngleX + (float) Math.toRadians(xx), frontRightLeg3.rotateAngleY + (float) Math.toRadians(yy), frontRightLeg3.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            zz = -0.6 + (((tickAnim - 0) / 3) * (-0.9-(-0.6)));
        }
        else if (tickAnim >= 3 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 3) / 2) * (0-(0)));
            yy = 0 + (((tickAnim - 3) / 2) * (0-(0)));
            zz = -0.9 + (((tickAnim - 3) / 2) * (0-(-0.9)));
        }
        else if (tickAnim >= 5 && tickAnim < 6) {
            xx = 0 + (((tickAnim - 5) / 1) * (0-(0)));
            yy = 0 + (((tickAnim - 5) / 1) * (0.525-(0)));
            zz = 0 + (((tickAnim - 5) / 1) * (-0.1-(0)));
        }
        else if (tickAnim >= 6 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 6) / 4) * (0-(0)));
            yy = 0.525 + (((tickAnim - 6) / 4) * (0-(0.525)));
            zz = -0.1 + (((tickAnim - 6) / 4) * (-0.6-(-0.1)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.frontRightLeg3.rotationPointX = this.frontRightLeg3.rotationPointX + (float)(xx);
        this.frontRightLeg3.rotationPointY = this.frontRightLeg3.rotationPointY - (float)(yy);
        this.frontRightLeg3.rotationPointZ = this.frontRightLeg3.rotationPointZ + (float)(zz);



        this.setRotateAngle(tail, tail.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*720+20))*3), tail.rotateAngleY + (float) Math.toRadians(0), tail.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(tail2, tail2.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*720))*8), tail2.rotateAngleY + (float) Math.toRadians(0), tail2.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(tail3, tail3.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*720-50))*8), tail3.rotateAngleY + (float) Math.toRadians(0), tail3.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(tail4, tail4.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*720-100))*8), tail4.rotateAngleY + (float) Math.toRadians(0), tail4.rotateAngleZ + (float) Math.toRadians(0));

    }




        public void animate(IAnimatedEntity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        EntityPrehistoricFloraCandidodon e = (EntityPrehistoricFloraCandidodon) entity;
        animator.update(entity);

            animator.setAnimation(e.ATTACK_ANIMATION); //20 ticks
            animator.startKeyframe(5);
            animator.rotate(this.body3, (float) Math.toRadians(8), (float) Math.toRadians(0), (float) Math.toRadians(0));
            animator.rotate(this.head, (float) Math.toRadians(-5), (float) Math.toRadians(0), (float) Math.toRadians(0));
            animator.rotate(this.jaw, (float) Math.toRadians(36), (float) Math.toRadians(0), (float) Math.toRadians(0));
            animator.endKeyframe();
            animator.setStaticKeyframe(5);
            animator.startKeyframe(2);
            animator.rotate(this.body3, (float) Math.toRadians(2.5), (float) Math.toRadians(0), (float) Math.toRadians(0));
            animator.rotate(this.head, (float) Math.toRadians(2.5), (float) Math.toRadians(0), (float) Math.toRadians(0));
            animator.endKeyframe();
            animator.setStaticKeyframe(5);
            animator.resetKeyframe(5);

    }
}
